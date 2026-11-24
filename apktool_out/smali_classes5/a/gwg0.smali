.class public final synthetic La/gwg0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/gwg0;->a:B

    iput-object p1, p0, La/gwg0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;La/sqt;)V
    .locals 0

    .line 1
    const/16 p2, 0x19

    iput-byte p2, p0, La/gwg0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/gwg0;->b:Ljava/lang/Object;

    return-void
.end method

.method private final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 42

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v0, v0, La/gwg0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/hdn;

    .line 6
    .line 7
    move-object/from16 v1, p1

    .line 8
    .line 9
    check-cast v1, La/tzh0;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v2, v1, La/tzh0;->a:La/new;

    .line 15
    .line 16
    iget-object v3, v0, La/hdn;->d:La/n0o0;

    .line 17
    .line 18
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    check-cast v3, La/fee;

    .line 23
    .line 24
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Ljava/lang/Number;

    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 31
    .line 32
    .line 33
    move-result-wide v3

    .line 34
    iget-object v5, v0, La/hdn;->e:La/n0o0;

    .line 35
    .line 36
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    check-cast v5, La/fee;

    .line 41
    .line 42
    invoke-virtual {v5}, La/fee;->c()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    check-cast v5, Ljava/lang/Number;

    .line 47
    .line 48
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 49
    .line 50
    .line 51
    move-result-wide v5

    .line 52
    iget-object v7, v0, La/hdn;->f:La/n0o0;

    .line 53
    .line 54
    invoke-virtual {v7}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    check-cast v7, La/fee;

    .line 59
    .line 60
    invoke-virtual {v7}, La/fee;->c()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    check-cast v7, Ljava/util/List;

    .line 65
    .line 66
    iget-object v0, v0, La/hdn;->b:La/ctf0;

    .line 67
    .line 68
    iget-object v1, v1, La/tzh0;->b:La/edw;

    .line 69
    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    iget-object v9, v1, La/edw;->a:Ljava/lang/Object;

    .line 73
    .line 74
    sget-object v10, La/j0g0;->b:La/e0g0;

    .line 75
    .line 76
    instance-of v10, v9, La/g0g0;

    .line 77
    .line 78
    if-eqz v10, :cond_0

    .line 79
    .line 80
    const/4 v9, 0x0

    .line 81
    :cond_0
    check-cast v9, La/m9s;

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_1
    const/4 v9, 0x0

    .line 85
    :goto_0
    if-eqz v1, :cond_3

    .line 86
    .line 87
    iget-object v1, v1, La/edw;->b:Ljava/lang/Object;

    .line 88
    .line 89
    sget-object v10, La/j0g0;->b:La/e0g0;

    .line 90
    .line 91
    instance-of v10, v1, La/g0g0;

    .line 92
    .line 93
    if-eqz v10, :cond_2

    .line 94
    .line 95
    const/4 v1, 0x0

    .line 96
    :cond_2
    check-cast v1, La/m9s;

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    const/4 v1, 0x0

    .line 100
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    if-eqz v2, :cond_32

    .line 107
    .line 108
    iget-object v2, v2, La/new;->b:Ljava/util/List;

    .line 109
    .line 110
    if-eqz v2, :cond_32

    .line 111
    .line 112
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v10

    .line 120
    if-eqz v10, :cond_5

    .line 121
    .line 122
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v10

    .line 126
    move-object v11, v10

    .line 127
    check-cast v11, La/vcw;

    .line 128
    .line 129
    iget-wide v11, v11, La/vcw;->a:J

    .line 130
    .line 131
    cmp-long v11, v11, v3

    .line 132
    .line 133
    if-nez v11, :cond_4

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_5
    const/4 v10, 0x0

    .line 137
    :goto_2
    check-cast v10, La/vcw;

    .line 138
    .line 139
    if-nez v10, :cond_6

    .line 140
    .line 141
    goto/16 :goto_1a

    .line 142
    .line 143
    :cond_6
    iget-object v2, v10, La/vcw;->c:Ljava/util/List;

    .line 144
    .line 145
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    :cond_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    if-eqz v3, :cond_8

    .line 154
    .line 155
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    move-object v4, v3

    .line 160
    check-cast v4, La/jdw;

    .line 161
    .line 162
    iget-wide v10, v4, La/jdw;->a:J

    .line 163
    .line 164
    cmp-long v4, v10, v5

    .line 165
    .line 166
    if-nez v4, :cond_7

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_8
    const/4 v3, 0x0

    .line 170
    :goto_3
    check-cast v3, La/jdw;

    .line 171
    .line 172
    const-string v5, ""

    .line 173
    .line 174
    const/16 v11, 0xa

    .line 175
    .line 176
    if-eqz v3, :cond_1c

    .line 177
    .line 178
    iget-object v12, v3, La/jdw;->g:Ljava/util/List;

    .line 179
    .line 180
    if-eqz v12, :cond_1c

    .line 181
    .line 182
    new-instance v13, Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 185
    .line 186
    .line 187
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 188
    .line 189
    .line 190
    move-result-object v12

    .line 191
    :cond_9
    :goto_4
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result v14

    .line 195
    if-eqz v14, :cond_a

    .line 196
    .line 197
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v14

    .line 201
    move-object v15, v14

    .line 202
    check-cast v15, La/odw;

    .line 203
    .line 204
    iget-object v15, v15, La/odw;->b:Ljava/lang/String;

    .line 205
    .line 206
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 207
    .line 208
    .line 209
    move-result v15

    .line 210
    if-lez v15, :cond_9

    .line 211
    .line 212
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    goto :goto_4

    .line 216
    :cond_a
    new-instance v12, La/mjf0;

    .line 217
    .line 218
    const/16 v14, 0xc

    .line 219
    .line 220
    invoke-direct {v12, v14}, La/mjf0;-><init>(B)V

    .line 221
    .line 222
    .line 223
    invoke-static {v13, v12}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 224
    .line 225
    .line 226
    move-result-object v12

    .line 227
    if-eqz v12, :cond_1c

    .line 228
    .line 229
    new-instance v13, Ljava/util/ArrayList;

    .line 230
    .line 231
    invoke-static {v12, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 232
    .line 233
    .line 234
    move-result v14

    .line 235
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 236
    .line 237
    .line 238
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 239
    .line 240
    .line 241
    move-result-object v12

    .line 242
    :goto_5
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 243
    .line 244
    .line 245
    move-result v14

    .line 246
    if-eqz v14, :cond_1b

    .line 247
    .line 248
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v14

    .line 252
    check-cast v14, La/odw;

    .line 253
    .line 254
    if-eqz v9, :cond_b

    .line 255
    .line 256
    iget-object v15, v9, La/m9s;->H:Ljava/util/List;

    .line 257
    .line 258
    if-nez v15, :cond_c

    .line 259
    .line 260
    :cond_b
    sget-object v15, La/iun;->a:La/iun;

    .line 261
    .line 262
    :cond_c
    if-eqz v1, :cond_d

    .line 263
    .line 264
    iget-object v2, v1, La/m9s;->H:Ljava/util/List;

    .line 265
    .line 266
    if-nez v2, :cond_e

    .line 267
    .line 268
    :cond_d
    sget-object v2, La/iun;->a:La/iun;

    .line 269
    .line 270
    :cond_e
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    move-object/from16 v16, v5

    .line 274
    .line 275
    iget-wide v4, v14, La/odw;->d:J

    .line 276
    .line 277
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    const/16 v17, 0x0

    .line 284
    .line 285
    iget v8, v14, La/odw;->e:I

    .line 286
    .line 287
    iget-wide v10, v14, La/odw;->a:J

    .line 288
    .line 289
    invoke-static {v4, v5, v15}, La/yum0;->e(JLjava/util/List;)La/dao;

    .line 290
    .line 291
    .line 292
    move-result-object v15

    .line 293
    if-nez v15, :cond_f

    .line 294
    .line 295
    invoke-static {v4, v5, v2}, La/yum0;->e(JLjava/util/List;)La/dao;

    .line 296
    .line 297
    .line 298
    move-result-object v15

    .line 299
    :cond_f
    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    invoke-interface {v7, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v27

    .line 307
    iget-object v2, v14, La/odw;->f:Ljava/util/List;

    .line 308
    .line 309
    new-instance v4, Ljava/util/ArrayList;

    .line 310
    .line 311
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 312
    .line 313
    .line 314
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 315
    .line 316
    .line 317
    move-result-object v2

    .line 318
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 319
    .line 320
    .line 321
    move-result v5

    .line 322
    if-eqz v5, :cond_11

    .line 323
    .line 324
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v5

    .line 328
    move-object v6, v5

    .line 329
    check-cast v6, La/sdw;

    .line 330
    .line 331
    move-object/from16 v20, v2

    .line 332
    .line 333
    iget-object v2, v6, La/sdw;->b:Ljava/lang/String;

    .line 334
    .line 335
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 336
    .line 337
    .line 338
    move-result v2

    .line 339
    if-lez v2, :cond_10

    .line 340
    .line 341
    iget-object v2, v6, La/sdw;->a:Ljava/lang/String;

    .line 342
    .line 343
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 344
    .line 345
    .line 346
    move-result v2

    .line 347
    if-lez v2, :cond_10

    .line 348
    .line 349
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    :cond_10
    move-object/from16 v2, v20

    .line 353
    .line 354
    goto :goto_6

    .line 355
    :cond_11
    new-instance v2, Ljava/util/ArrayList;

    .line 356
    .line 357
    const/16 v5, 0xa

    .line 358
    .line 359
    invoke-static {v4, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 360
    .line 361
    .line 362
    move-result v6

    .line 363
    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 367
    .line 368
    .line 369
    move-result-object v4

    .line 370
    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 371
    .line 372
    .line 373
    move-result v5

    .line 374
    if-eqz v5, :cond_12

    .line 375
    .line 376
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v5

    .line 380
    check-cast v5, La/sdw;

    .line 381
    .line 382
    new-instance v6, La/ta5;

    .line 383
    .line 384
    move-object/from16 v20, v4

    .line 385
    .line 386
    iget-object v4, v5, La/sdw;->a:Ljava/lang/String;

    .line 387
    .line 388
    iget-object v5, v5, La/sdw;->b:Ljava/lang/String;

    .line 389
    .line 390
    invoke-direct {v6, v4, v5}, La/ta5;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    move-object/from16 v4, v20

    .line 397
    .line 398
    goto :goto_7

    .line 399
    :cond_12
    invoke-static {v2}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 400
    .line 401
    .line 402
    move-result-object v30

    .line 403
    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v21

    .line 407
    iget-wide v4, v14, La/odw;->d:J

    .line 408
    .line 409
    iget-object v2, v14, La/odw;->c:Ljava/lang/String;

    .line 410
    .line 411
    iget-object v6, v14, La/odw;->b:Ljava/lang/String;

    .line 412
    .line 413
    if-eqz v8, :cond_13

    .line 414
    .line 415
    new-instance v10, La/gd6;

    .line 416
    .line 417
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 418
    .line 419
    .line 420
    :goto_8
    move-object/from16 v29, v10

    .line 421
    .line 422
    goto :goto_b

    .line 423
    :cond_13
    if-nez v15, :cond_14

    .line 424
    .line 425
    new-instance v10, La/ed6;

    .line 426
    .line 427
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 428
    .line 429
    .line 430
    goto :goto_8

    .line 431
    :cond_14
    iget-boolean v10, v15, La/dao;->h:Z

    .line 432
    .line 433
    if-eqz v10, :cond_15

    .line 434
    .line 435
    iget-boolean v10, v15, La/dao;->o:Z

    .line 436
    .line 437
    invoke-static {v15}, La/xkb;->O(La/dao;)Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v11

    .line 441
    iget-boolean v14, v15, La/dao;->p:Z

    .line 442
    .line 443
    new-instance v15, La/fd6;

    .line 444
    .line 445
    invoke-direct {v15, v11, v14, v10}, La/fd6;-><init>(Ljava/lang/String;ZZ)V

    .line 446
    .line 447
    .line 448
    move-object/from16 v29, v15

    .line 449
    .line 450
    goto :goto_b

    .line 451
    :cond_15
    iget-object v10, v15, La/dao;->n:La/cao;

    .line 452
    .line 453
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 454
    .line 455
    .line 456
    move-result v10

    .line 457
    if-eqz v10, :cond_18

    .line 458
    .line 459
    const/4 v11, 0x1

    .line 460
    if-eq v10, v11, :cond_17

    .line 461
    .line 462
    const/4 v11, 0x2

    .line 463
    if-ne v10, v11, :cond_16

    .line 464
    .line 465
    sget-object v10, La/cd6;->b:La/cd6;

    .line 466
    .line 467
    :goto_9
    move-object/from16 v35, v10

    .line 468
    .line 469
    goto :goto_a

    .line 470
    :cond_16
    invoke-static {}, La/t9f;->b()V

    .line 471
    .line 472
    .line 473
    return-object v17

    .line 474
    :cond_17
    sget-object v10, La/cd6;->c:La/cd6;

    .line 475
    .line 476
    goto :goto_9

    .line 477
    :cond_18
    sget-object v10, La/cd6;->d:La/cd6;

    .line 478
    .line 479
    goto :goto_9

    .line 480
    :goto_a
    invoke-static {v15}, La/xkb;->O(La/dao;)Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v34

    .line 484
    iget-object v10, v15, La/dao;->m:La/sh7;

    .line 485
    .line 486
    iget-wide v10, v10, La/sh7;->a:J

    .line 487
    .line 488
    iget-boolean v14, v15, La/dao;->o:Z

    .line 489
    .line 490
    iget-boolean v15, v15, La/dao;->p:Z

    .line 491
    .line 492
    new-instance v31, La/hd6;

    .line 493
    .line 494
    move-wide/from16 v36, v10

    .line 495
    .line 496
    move/from16 v32, v14

    .line 497
    .line 498
    move/from16 v33, v15

    .line 499
    .line 500
    invoke-direct/range {v31 .. v37}, La/hd6;-><init>(ZZLjava/lang/String;La/cd6;J)V

    .line 501
    .line 502
    .line 503
    move-object/from16 v29, v31

    .line 504
    .line 505
    :goto_b
    if-eqz v8, :cond_19

    .line 506
    .line 507
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v8

    .line 511
    move-object/from16 v26, v8

    .line 512
    .line 513
    goto :goto_c

    .line 514
    :cond_19
    move-object/from16 v26, v16

    .line 515
    .line 516
    :goto_c
    if-eqz v27, :cond_1a

    .line 517
    .line 518
    const v28, 0x7f08081e

    .line 519
    .line 520
    .line 521
    goto :goto_d

    .line 522
    :cond_1a
    const v28, 0x7f080815

    .line 523
    .line 524
    .line 525
    :goto_d
    new-instance v20, La/ua5;

    .line 526
    .line 527
    move-object/from16 v25, v2

    .line 528
    .line 529
    move-wide/from16 v22, v4

    .line 530
    .line 531
    move-object/from16 v24, v6

    .line 532
    .line 533
    invoke-direct/range {v20 .. v30}, La/ua5;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILa/jd6;La/a4x;)V

    .line 534
    .line 535
    .line 536
    move-object/from16 v2, v20

    .line 537
    .line 538
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 539
    .line 540
    .line 541
    move-object/from16 v5, v16

    .line 542
    .line 543
    const/16 v11, 0xa

    .line 544
    .line 545
    goto/16 :goto_5

    .line 546
    .line 547
    :cond_1b
    move-object/from16 v16, v5

    .line 548
    .line 549
    const/16 v17, 0x0

    .line 550
    .line 551
    goto :goto_e

    .line 552
    :cond_1c
    move-object/from16 v16, v5

    .line 553
    .line 554
    const/16 v17, 0x0

    .line 555
    .line 556
    sget-object v13, La/iun;->a:La/iun;

    .line 557
    .line 558
    :goto_e
    if-eqz v3, :cond_2f

    .line 559
    .line 560
    iget-object v3, v3, La/jdw;->h:Ljava/util/List;

    .line 561
    .line 562
    if-eqz v3, :cond_2f

    .line 563
    .line 564
    new-instance v4, Ljava/util/ArrayList;

    .line 565
    .line 566
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 567
    .line 568
    .line 569
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 570
    .line 571
    .line 572
    move-result-object v3

    .line 573
    :cond_1d
    :goto_f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 574
    .line 575
    .line 576
    move-result v5

    .line 577
    if-eqz v5, :cond_1e

    .line 578
    .line 579
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object v5

    .line 583
    move-object v6, v5

    .line 584
    check-cast v6, La/wdw;

    .line 585
    .line 586
    iget v8, v6, La/wdw;->e:I

    .line 587
    .line 588
    const/4 v10, -0x1

    .line 589
    if-eq v8, v10, :cond_1d

    .line 590
    .line 591
    iget-object v8, v6, La/wdw;->b:Ljava/lang/String;

    .line 592
    .line 593
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 594
    .line 595
    .line 596
    move-result v8

    .line 597
    if-lez v8, :cond_1d

    .line 598
    .line 599
    iget v6, v6, La/wdw;->f:I

    .line 600
    .line 601
    if-eq v6, v10, :cond_1d

    .line 602
    .line 603
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 604
    .line 605
    .line 606
    goto :goto_f

    .line 607
    :cond_1e
    new-instance v3, La/mjf0;

    .line 608
    .line 609
    const/16 v5, 0xd

    .line 610
    .line 611
    invoke-direct {v3, v5}, La/mjf0;-><init>(B)V

    .line 612
    .line 613
    .line 614
    invoke-static {v4, v3}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 615
    .line 616
    .line 617
    move-result-object v3

    .line 618
    if-eqz v3, :cond_2f

    .line 619
    .line 620
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 621
    .line 622
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 623
    .line 624
    .line 625
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 626
    .line 627
    .line 628
    move-result-object v3

    .line 629
    :goto_10
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 630
    .line 631
    .line 632
    move-result v5

    .line 633
    if-eqz v5, :cond_20

    .line 634
    .line 635
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v5

    .line 639
    move-object v6, v5

    .line 640
    check-cast v6, La/wdw;

    .line 641
    .line 642
    iget v6, v6, La/wdw;->e:I

    .line 643
    .line 644
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 645
    .line 646
    .line 647
    move-result-object v6

    .line 648
    invoke-virtual {v4, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v8

    .line 652
    if-nez v8, :cond_1f

    .line 653
    .line 654
    new-instance v8, Ljava/util/ArrayList;

    .line 655
    .line 656
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 657
    .line 658
    .line 659
    invoke-interface {v4, v6, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    :cond_1f
    check-cast v8, Ljava/util/List;

    .line 663
    .line 664
    invoke-interface {v8, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 665
    .line 666
    .line 667
    goto :goto_10

    .line 668
    :cond_20
    new-instance v3, La/mjf0;

    .line 669
    .line 670
    const/16 v5, 0xb

    .line 671
    .line 672
    invoke-direct {v3, v5}, La/mjf0;-><init>(B)V

    .line 673
    .line 674
    .line 675
    invoke-static {v4, v3}, La/wp20;->c(Ljava/util/Map;Ljava/util/Comparator;)Ljava/util/TreeMap;

    .line 676
    .line 677
    .line 678
    move-result-object v3

    .line 679
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 680
    .line 681
    invoke-virtual {v3}, Ljava/util/TreeMap;->size()I

    .line 682
    .line 683
    .line 684
    move-result v5

    .line 685
    invoke-static {v5}, La/wp20;->a(I)I

    .line 686
    .line 687
    .line 688
    move-result v5

    .line 689
    invoke-direct {v4, v5}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 690
    .line 691
    .line 692
    invoke-virtual {v3}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 693
    .line 694
    .line 695
    move-result-object v3

    .line 696
    check-cast v3, Ljava/lang/Iterable;

    .line 697
    .line 698
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 699
    .line 700
    .line 701
    move-result-object v3

    .line 702
    :goto_11
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 703
    .line 704
    .line 705
    move-result v5

    .line 706
    if-eqz v5, :cond_30

    .line 707
    .line 708
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    move-result-object v5

    .line 712
    check-cast v5, Ljava/util/Map$Entry;

    .line 713
    .line 714
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 715
    .line 716
    .line 717
    move-result-object v6

    .line 718
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 719
    .line 720
    .line 721
    move-result-object v5

    .line 722
    check-cast v5, Ljava/util/List;

    .line 723
    .line 724
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 725
    .line 726
    .line 727
    new-instance v8, Ljava/util/ArrayList;

    .line 728
    .line 729
    const/16 v10, 0xa

    .line 730
    .line 731
    invoke-static {v5, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 732
    .line 733
    .line 734
    move-result v11

    .line 735
    invoke-direct {v8, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 736
    .line 737
    .line 738
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 739
    .line 740
    .line 741
    move-result-object v5

    .line 742
    const/4 v11, 0x0

    .line 743
    :goto_12
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 744
    .line 745
    .line 746
    move-result v12

    .line 747
    if-eqz v12, :cond_2e

    .line 748
    .line 749
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 750
    .line 751
    .line 752
    move-result-object v12

    .line 753
    add-int/lit8 v14, v11, 0x1

    .line 754
    .line 755
    if-ltz v11, :cond_2d

    .line 756
    .line 757
    check-cast v12, La/wdw;

    .line 758
    .line 759
    if-eqz v9, :cond_21

    .line 760
    .line 761
    iget-object v11, v9, La/m9s;->H:Ljava/util/List;

    .line 762
    .line 763
    if-nez v11, :cond_22

    .line 764
    .line 765
    :cond_21
    sget-object v11, La/iun;->a:La/iun;

    .line 766
    .line 767
    :cond_22
    if-eqz v1, :cond_23

    .line 768
    .line 769
    iget-object v15, v1, La/m9s;->H:Ljava/util/List;

    .line 770
    .line 771
    if-nez v15, :cond_24

    .line 772
    .line 773
    :cond_23
    sget-object v15, La/iun;->a:La/iun;

    .line 774
    .line 775
    :cond_24
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 776
    .line 777
    .line 778
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 779
    .line 780
    .line 781
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 782
    .line 783
    .line 784
    move-object/from16 v20, v3

    .line 785
    .line 786
    iget-wide v2, v12, La/wdw;->a:J

    .line 787
    .line 788
    iget v10, v12, La/wdw;->e:I

    .line 789
    .line 790
    move-object/from16 v22, v1

    .line 791
    .line 792
    new-instance v1, Ljava/lang/StringBuilder;

    .line 793
    .line 794
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 795
    .line 796
    .line 797
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 798
    .line 799
    .line 800
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 801
    .line 802
    .line 803
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 804
    .line 805
    .line 806
    move-result-object v1

    .line 807
    iget-wide v2, v12, La/wdw;->d:J

    .line 808
    .line 809
    invoke-static {v2, v3, v11}, La/yum0;->e(JLjava/util/List;)La/dao;

    .line 810
    .line 811
    .line 812
    move-result-object v10

    .line 813
    if-nez v10, :cond_25

    .line 814
    .line 815
    invoke-static {v2, v3, v15}, La/yum0;->e(JLjava/util/List;)La/dao;

    .line 816
    .line 817
    .line 818
    move-result-object v10

    .line 819
    :cond_25
    invoke-interface {v7, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 820
    .line 821
    .line 822
    move-result v38

    .line 823
    iget-wide v2, v12, La/wdw;->d:J

    .line 824
    .line 825
    iget-object v11, v12, La/wdw;->c:Ljava/lang/String;

    .line 826
    .line 827
    iget-object v15, v12, La/wdw;->b:Ljava/lang/String;

    .line 828
    .line 829
    if-nez v10, :cond_26

    .line 830
    .line 831
    new-instance v10, La/gd6;

    .line 832
    .line 833
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 834
    .line 835
    .line 836
    move-object/from16 v32, v1

    .line 837
    .line 838
    move-wide/from16 v33, v2

    .line 839
    .line 840
    :goto_13
    move-object/from16 v40, v10

    .line 841
    .line 842
    goto :goto_16

    .line 843
    :cond_26
    move-object/from16 v32, v1

    .line 844
    .line 845
    iget-boolean v1, v10, La/dao;->h:Z

    .line 846
    .line 847
    if-eqz v1, :cond_27

    .line 848
    .line 849
    iget-boolean v1, v10, La/dao;->o:Z

    .line 850
    .line 851
    move-wide/from16 v33, v2

    .line 852
    .line 853
    invoke-static {v10}, La/xkb;->O(La/dao;)Ljava/lang/String;

    .line 854
    .line 855
    .line 856
    move-result-object v2

    .line 857
    iget-boolean v3, v10, La/dao;->p:Z

    .line 858
    .line 859
    new-instance v10, La/fd6;

    .line 860
    .line 861
    invoke-direct {v10, v2, v3, v1}, La/fd6;-><init>(Ljava/lang/String;ZZ)V

    .line 862
    .line 863
    .line 864
    goto :goto_13

    .line 865
    :cond_27
    move-wide/from16 v33, v2

    .line 866
    .line 867
    invoke-static {v10}, La/xkb;->O(La/dao;)Ljava/lang/String;

    .line 868
    .line 869
    .line 870
    move-result-object v26

    .line 871
    iget-object v1, v10, La/dao;->n:La/cao;

    .line 872
    .line 873
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 874
    .line 875
    .line 876
    move-result v1

    .line 877
    if-eqz v1, :cond_2a

    .line 878
    .line 879
    const/4 v2, 0x1

    .line 880
    if-eq v1, v2, :cond_29

    .line 881
    .line 882
    const/4 v3, 0x2

    .line 883
    if-ne v1, v3, :cond_28

    .line 884
    .line 885
    sget-object v1, La/cd6;->b:La/cd6;

    .line 886
    .line 887
    :goto_14
    move-object/from16 v27, v1

    .line 888
    .line 889
    goto :goto_15

    .line 890
    :cond_28
    invoke-static {}, La/t9f;->b()V

    .line 891
    .line 892
    .line 893
    return-object v17

    .line 894
    :cond_29
    const/4 v3, 0x2

    .line 895
    sget-object v1, La/cd6;->c:La/cd6;

    .line 896
    .line 897
    goto :goto_14

    .line 898
    :cond_2a
    const/4 v2, 0x1

    .line 899
    const/4 v3, 0x2

    .line 900
    sget-object v1, La/cd6;->d:La/cd6;

    .line 901
    .line 902
    goto :goto_14

    .line 903
    :goto_15
    iget-object v1, v10, La/dao;->m:La/sh7;

    .line 904
    .line 905
    iget-wide v2, v1, La/sh7;->a:J

    .line 906
    .line 907
    iget-boolean v1, v10, La/dao;->o:Z

    .line 908
    .line 909
    iget-boolean v10, v10, La/dao;->p:Z

    .line 910
    .line 911
    new-instance v23, La/hd6;

    .line 912
    .line 913
    move/from16 v24, v1

    .line 914
    .line 915
    move-wide/from16 v28, v2

    .line 916
    .line 917
    move/from16 v25, v10

    .line 918
    .line 919
    invoke-direct/range {v23 .. v29}, La/hd6;-><init>(ZZLjava/lang/String;La/cd6;J)V

    .line 920
    .line 921
    .line 922
    move-object/from16 v40, v23

    .line 923
    .line 924
    :goto_16
    iget v1, v12, La/wdw;->f:I

    .line 925
    .line 926
    if-eqz v1, :cond_2b

    .line 927
    .line 928
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 929
    .line 930
    .line 931
    move-result-object v1

    .line 932
    move-object/from16 v37, v1

    .line 933
    .line 934
    goto :goto_17

    .line 935
    :cond_2b
    move-object/from16 v37, v16

    .line 936
    .line 937
    :goto_17
    sget-object v41, La/lak0;->c:La/lak0;

    .line 938
    .line 939
    if-eqz v38, :cond_2c

    .line 940
    .line 941
    const v39, 0x7f08081e

    .line 942
    .line 943
    .line 944
    goto :goto_18

    .line 945
    :cond_2c
    const v39, 0x7f080815

    .line 946
    .line 947
    .line 948
    :goto_18
    new-instance v31, La/ua5;

    .line 949
    .line 950
    move-object/from16 v36, v11

    .line 951
    .line 952
    move-object/from16 v35, v15

    .line 953
    .line 954
    invoke-direct/range {v31 .. v41}, La/ua5;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILa/jd6;La/a4x;)V

    .line 955
    .line 956
    .line 957
    move-object/from16 v1, v31

    .line 958
    .line 959
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 960
    .line 961
    .line 962
    move v11, v14

    .line 963
    move-object/from16 v3, v20

    .line 964
    .line 965
    move-object/from16 v1, v22

    .line 966
    .line 967
    const/16 v10, 0xa

    .line 968
    .line 969
    goto/16 :goto_12

    .line 970
    .line 971
    :cond_2d
    invoke-static {}, La/q3d;->p()V

    .line 972
    .line 973
    .line 974
    throw v17

    .line 975
    :cond_2e
    move-object/from16 v22, v1

    .line 976
    .line 977
    move-object/from16 v20, v3

    .line 978
    .line 979
    invoke-interface {v4, v6, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 980
    .line 981
    .line 982
    goto/16 :goto_11

    .line 983
    .line 984
    :cond_2f
    sget-object v4, La/lun;->a:La/lun;

    .line 985
    .line 986
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 987
    .line 988
    .line 989
    :cond_30
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 990
    .line 991
    .line 992
    move-result-object v1

    .line 993
    invoke-virtual {v1, v13}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 994
    .line 995
    .line 996
    invoke-interface {v4}, Ljava/util/Map;->isEmpty()Z

    .line 997
    .line 998
    .line 999
    move-result v2

    .line 1000
    if-nez v2, :cond_31

    .line 1001
    .line 1002
    new-instance v2, La/jzh0;

    .line 1003
    .line 1004
    const/4 v3, 0x0

    .line 1005
    new-array v5, v3, [Ljava/lang/Object;

    .line 1006
    .line 1007
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 1008
    .line 1009
    invoke-static {v5, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v5

    .line 1013
    const v6, 0x7f130ffc

    .line 1014
    .line 1015
    .line 1016
    invoke-virtual {v0, v6, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v5

    .line 1020
    new-array v7, v3, [Ljava/lang/Object;

    .line 1021
    .line 1022
    invoke-static {v7, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v3

    .line 1026
    invoke-virtual {v0, v6, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v8

    .line 1030
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 1031
    .line 1032
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 1033
    .line 1034
    .line 1035
    move-result-wide v6

    .line 1036
    new-instance v9, La/ljm;

    .line 1037
    .line 1038
    invoke-direct {v9}, La/ljm;-><init>()V

    .line 1039
    .line 1040
    .line 1041
    new-instance v0, La/hjm;

    .line 1042
    .line 1043
    new-instance v10, La/y3d;

    .line 1044
    .line 1045
    invoke-direct {v10, v6, v7}, La/y3d;-><init>(J)V

    .line 1046
    .line 1047
    .line 1048
    const/16 v19, 0x0

    .line 1049
    .line 1050
    const/16 v20, 0x1ff8

    .line 1051
    .line 1052
    const/4 v11, 0x0

    .line 1053
    const/4 v12, 0x0

    .line 1054
    const/4 v13, 0x0

    .line 1055
    const/4 v14, 0x0

    .line 1056
    const/4 v15, 0x0

    .line 1057
    const/16 v16, 0x0

    .line 1058
    .line 1059
    const/16 v17, 0x0

    .line 1060
    .line 1061
    const/16 v18, 0x0

    .line 1062
    .line 1063
    move-object v7, v0

    .line 1064
    invoke-direct/range {v7 .. v20}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 1065
    .line 1066
    .line 1067
    invoke-direct {v2, v7, v5}, La/jzh0;-><init>(La/hjm;Ljava/lang/String;)V

    .line 1068
    .line 1069
    .line 1070
    invoke-virtual {v1, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1071
    .line 1072
    .line 1073
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v0

    .line 1077
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v0

    .line 1081
    :goto_19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1082
    .line 1083
    .line 1084
    move-result v2

    .line 1085
    if-eqz v2, :cond_31

    .line 1086
    .line 1087
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v2

    .line 1091
    check-cast v2, Ljava/util/Map$Entry;

    .line 1092
    .line 1093
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v3

    .line 1097
    check-cast v3, Ljava/lang/Integer;

    .line 1098
    .line 1099
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v2

    .line 1103
    check-cast v2, Ljava/util/List;

    .line 1104
    .line 1105
    new-instance v4, La/uzh0;

    .line 1106
    .line 1107
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v3

    .line 1111
    invoke-direct {v4, v3}, La/uzh0;-><init>(Ljava/lang/String;)V

    .line 1112
    .line 1113
    .line 1114
    invoke-virtual {v1, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1115
    .line 1116
    .line 1117
    invoke-virtual {v1, v2}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 1118
    .line 1119
    .line 1120
    goto :goto_19

    .line 1121
    :cond_31
    invoke-static {v1}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v0

    .line 1125
    return-object v0

    .line 1126
    :cond_32
    :goto_1a
    sget-object v0, La/iun;->a:La/iun;

    .line 1127
    .line 1128
    return-object v0
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v2, v0, La/gwg0;->a:B

    .line 6
    .line 7
    const-string v8, "actionDialogManager"

    .line 8
    .line 9
    const v9, 0x7f13032f

    .line 10
    .line 11
    .line 12
    const v10, 0x7f131843

    .line 13
    .line 14
    .line 15
    const v11, 0x7f130420

    .line 16
    .line 17
    .line 18
    const v12, 0x7f1303fb

    .line 19
    .line 20
    .line 21
    sget-object v14, Lorg/xplatform/personal/impl/navigation/PersonalScreen$EditProfileScreen;->a:Lorg/xplatform/personal/impl/navigation/PersonalScreen$EditProfileScreen;

    .line 22
    .line 23
    const-string v15, "acc_safety"

    .line 24
    .line 25
    const-wide v16, 0xffffffffL

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    const/16 v18, 0x20

    .line 31
    .line 32
    const/4 v13, 0x3

    .line 33
    const/4 v6, 0x2

    .line 34
    const/4 v7, 0x0

    .line 35
    const/4 v5, 0x1

    .line 36
    const/4 v3, 0x0

    .line 37
    iget-object v4, v0, La/gwg0;->b:Ljava/lang/Object;

    .line 38
    .line 39
    packed-switch v2, :pswitch_data_0

    .line 40
    .line 41
    .line 42
    check-cast v4, La/cai0;

    .line 43
    .line 44
    move-object v0, v1

    .line 45
    check-cast v0, Ljava/lang/Throwable;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iget-object v1, v4, La/cai0;->f:La/duj;

    .line 51
    .line 52
    new-instance v2, La/uph0;

    .line 53
    .line 54
    const/16 v3, 0xb

    .line 55
    .line 56
    invoke-direct {v2, v4, v3}, La/uph0;-><init>(Ljava/lang/Object;B)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v0, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 60
    .line 61
    .line 62
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    return-object v0

    .line 65
    :pswitch_0
    check-cast v4, La/t9i0;

    .line 66
    .line 67
    move-object v0, v1

    .line 68
    check-cast v0, Landroid/view/View;

    .line 69
    .line 70
    sget-object v1, La/t9i0;->Q1:[La/iiy;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    iget-object v0, v4, La/t9i0;->L1:La/ii;

    .line 76
    .line 77
    if-eqz v0, :cond_0

    .line 78
    .line 79
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 80
    .line 81
    invoke-virtual {v4, v12}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v14

    .line 85
    new-instance v15, Landroid/text/SpannableString;

    .line 86
    .line 87
    invoke-virtual {v4, v11}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-static {v1, v3}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-direct {v15, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4, v10}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v16

    .line 108
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v4, v9}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v17

    .line 115
    sget-object v22, La/n12;->a:La/n12;

    .line 116
    .line 117
    const/16 v23, 0x0

    .line 118
    .line 119
    const/16 v24, 0x5d0

    .line 120
    .line 121
    const/16 v18, 0x0

    .line 122
    .line 123
    const-string v19, "SET_LIMIT_REQUEST_KEY"

    .line 124
    .line 125
    const/16 v20, 0x0

    .line 126
    .line 127
    const/16 v21, 0x0

    .line 128
    .line 129
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v13, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 140
    .line 141
    .line 142
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 143
    .line 144
    return-object v0

    .line 145
    :cond_0
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw v7

    .line 149
    :pswitch_1
    check-cast v4, La/m9i0;

    .line 150
    .line 151
    move-object v0, v1

    .line 152
    check-cast v0, Landroid/view/View;

    .line 153
    .line 154
    sget-object v1, La/m9i0;->S1:La/eke0;

    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    iget-boolean v0, v4, La/m9i0;->L1:Z

    .line 160
    .line 161
    if-eqz v0, :cond_7

    .line 162
    .line 163
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    if-nez v0, :cond_1

    .line 168
    .line 169
    goto/16 :goto_1

    .line 170
    .line 171
    :cond_1
    sget-object v1, La/j5d;->a:Landroid/util/TypedValue;

    .line 172
    .line 173
    const v1, 0x7f040b0b

    .line 174
    .line 175
    .line 176
    invoke-static {v0, v1, v3}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    const v2, 0x7f131259

    .line 192
    .line 193
    .line 194
    invoke-virtual {v4, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    sget-object v11, La/g9i0;->b:La/zie0;

    .line 199
    .line 200
    iget-object v14, v4, La/m9i0;->K1:La/g9i0;

    .line 201
    .line 202
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    .line 209
    .line 210
    .line 211
    move-result v11

    .line 212
    if-eqz v11, :cond_5

    .line 213
    .line 214
    if-eq v11, v5, :cond_4

    .line 215
    .line 216
    if-eq v11, v6, :cond_3

    .line 217
    .line 218
    if-ne v11, v13, :cond_2

    .line 219
    .line 220
    const v5, 0x7f130af1

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    goto :goto_0

    .line 231
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 232
    .line 233
    .line 234
    goto/16 :goto_2

    .line 235
    .line 236
    :cond_3
    const v5, 0x7f130aef

    .line 237
    .line 238
    .line 239
    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    goto :goto_0

    .line 247
    :cond_4
    const v5, 0x7f130af0

    .line 248
    .line 249
    .line 250
    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    goto :goto_0

    .line 258
    :cond_5
    const v5, 0x7f130aed

    .line 259
    .line 260
    .line 261
    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    :goto_0
    const-string v5, " "

    .line 269
    .line 270
    invoke-static {v2, v5, v0}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    const v2, 0x7f131258

    .line 275
    .line 276
    .line 277
    invoke-virtual {v4, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    new-instance v5, Ljava/lang/StringBuilder;

    .line 285
    .line 286
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    const-string v0, "<br/><br/><small><font color=#"

    .line 290
    .line 291
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    const-string v0, ">"

    .line 298
    .line 299
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    const-string v0, "</font><small/>"

    .line 303
    .line 304
    invoke-static {v5, v2, v0}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    iget-object v1, v4, La/m9i0;->N1:La/ii;

    .line 309
    .line 310
    if-eqz v1, :cond_6

    .line 311
    .line 312
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 313
    .line 314
    invoke-virtual {v4, v12}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v14

    .line 318
    new-instance v15, Landroid/text/SpannableString;

    .line 319
    .line 320
    invoke-static {v0, v3}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    invoke-direct {v15, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v4, v10}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v16

    .line 334
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v4, v9}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v17

    .line 341
    sget-object v22, La/n12;->a:La/n12;

    .line 342
    .line 343
    const/16 v23, 0x0

    .line 344
    .line 345
    const/16 v24, 0x5d0

    .line 346
    .line 347
    const/16 v18, 0x0

    .line 348
    .line 349
    const-string v19, "SET_LIMIT_REQUEST_KEY"

    .line 350
    .line 351
    const/16 v20, 0x0

    .line 352
    .line 353
    const/16 v21, 0x0

    .line 354
    .line 355
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v1, v13, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 366
    .line 367
    .line 368
    goto :goto_1

    .line 369
    :cond_6
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    throw v7

    .line 373
    :cond_7
    iget-object v0, v4, La/m9i0;->N1:La/ii;

    .line 374
    .line 375
    if-eqz v0, :cond_8

    .line 376
    .line 377
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 378
    .line 379
    invoke-virtual {v4, v12}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v14

    .line 383
    new-instance v15, Landroid/text/SpannableString;

    .line 384
    .line 385
    invoke-virtual {v4, v11}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    invoke-static {v1, v3}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 393
    .line 394
    .line 395
    move-result-object v1

    .line 396
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    invoke-direct {v15, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v4, v10}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v16

    .line 406
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    const v1, 0x7f130e07

    .line 410
    .line 411
    .line 412
    invoke-virtual {v4, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v17

    .line 416
    sget-object v22, La/n12;->a:La/n12;

    .line 417
    .line 418
    const/16 v23, 0x0

    .line 419
    .line 420
    const/16 v24, 0x5d0

    .line 421
    .line 422
    const/16 v18, 0x0

    .line 423
    .line 424
    const-string v19, "SET_LIMIT_REQUEST_KEY"

    .line 425
    .line 426
    const/16 v20, 0x0

    .line 427
    .line 428
    const/16 v21, 0x0

    .line 429
    .line 430
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 438
    .line 439
    .line 440
    invoke-virtual {v0, v13, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 441
    .line 442
    .line 443
    :goto_1
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 444
    .line 445
    :goto_2
    return-object v7

    .line 446
    :cond_8
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    throw v7

    .line 450
    :pswitch_2
    move-object v8, v4

    .line 451
    check-cast v8, La/cgx0;

    .line 452
    .line 453
    move-object v0, v1

    .line 454
    check-cast v0, La/dpa0;

    .line 455
    .line 456
    iget-wide v10, v0, La/dpa0;->c:J

    .line 457
    .line 458
    iget-object v1, v8, La/cgx0;->d:Ljava/lang/Object;

    .line 459
    .line 460
    check-cast v1, La/k7q0;

    .line 461
    .line 462
    invoke-virtual {v1}, La/k7q0;->i()Z

    .line 463
    .line 464
    .line 465
    move-result v2

    .line 466
    if-eqz v2, :cond_b

    .line 467
    .line 468
    invoke-virtual {v1}, La/k7q0;->l()La/a8q0;

    .line 469
    .line 470
    .line 471
    move-result-object v2

    .line 472
    iget-object v2, v2, La/a8q0;->a:La/j83;

    .line 473
    .line 474
    iget-object v2, v2, La/j83;->b:Ljava/lang/String;

    .line 475
    .line 476
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 477
    .line 478
    .line 479
    move-result v2

    .line 480
    if-nez v2, :cond_9

    .line 481
    .line 482
    goto :goto_3

    .line 483
    :cond_9
    iget-object v2, v1, La/k7q0;->d:La/djz;

    .line 484
    .line 485
    if-eqz v2, :cond_b

    .line 486
    .line 487
    invoke-virtual {v2}, La/djz;->d()La/b9q0;

    .line 488
    .line 489
    .line 490
    move-result-object v2

    .line 491
    if-nez v2, :cond_a

    .line 492
    .line 493
    goto :goto_3

    .line 494
    :cond_a
    invoke-virtual {v1}, La/k7q0;->l()La/a8q0;

    .line 495
    .line 496
    .line 497
    move-result-object v9

    .line 498
    const/4 v12, 0x0

    .line 499
    sget-object v13, La/m2a;->g1:La/e9d0;

    .line 500
    .line 501
    invoke-virtual/range {v8 .. v13}, La/cgx0;->x(La/a8q0;JZLa/w4i0;)J

    .line 502
    .line 503
    .line 504
    goto :goto_4

    .line 505
    :cond_b
    :goto_3
    move v5, v3

    .line 506
    :goto_4
    if-eqz v5, :cond_c

    .line 507
    .line 508
    invoke-virtual {v0}, La/dpa0;->a()V

    .line 509
    .line 510
    .line 511
    :cond_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 512
    .line 513
    return-object v0

    .line 514
    :pswitch_3
    check-cast v4, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;

    .line 515
    .line 516
    move-object v0, v1

    .line 517
    check-cast v0, La/vzg0;

    .line 518
    .line 519
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 520
    .line 521
    .line 522
    new-instance v0, La/m3i0;

    .line 523
    .line 524
    iget-object v1, v4, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->a:La/ygq0;

    .line 525
    .line 526
    iget-wide v2, v4, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->c:J

    .line 527
    .line 528
    iget-byte v1, v1, La/ygq0;->a:B

    .line 529
    .line 530
    iget-wide v5, v4, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->b:J

    .line 531
    .line 532
    const-wide/16 v7, 0x0

    .line 533
    .line 534
    cmp-long v9, v5, v7

    .line 535
    .line 536
    sget-object v10, La/kfj;->a:La/kfj;

    .line 537
    .line 538
    if-gtz v9, :cond_d

    .line 539
    .line 540
    move-object v9, v10

    .line 541
    goto :goto_5

    .line 542
    :cond_d
    new-instance v9, La/lfj;

    .line 543
    .line 544
    new-instance v11, Ljava/util/Date;

    .line 545
    .line 546
    invoke-direct {v11, v5, v6}, Ljava/util/Date;-><init>(J)V

    .line 547
    .line 548
    .line 549
    invoke-direct {v9, v11}, La/lfj;-><init>(Ljava/util/Date;)V

    .line 550
    .line 551
    .line 552
    :goto_5
    cmp-long v5, v2, v7

    .line 553
    .line 554
    if-gtz v5, :cond_e

    .line 555
    .line 556
    goto :goto_6

    .line 557
    :cond_e
    new-instance v10, La/lfj;

    .line 558
    .line 559
    new-instance v5, Ljava/util/Date;

    .line 560
    .line 561
    invoke-direct {v5, v2, v3}, Ljava/util/Date;-><init>(J)V

    .line 562
    .line 563
    .line 564
    invoke-direct {v10, v5}, La/lfj;-><init>(Ljava/util/Date;)V

    .line 565
    .line 566
    .line 567
    :goto_6
    iget-object v2, v4, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->h:La/jhq0;

    .line 568
    .line 569
    invoke-static {v2}, La/sqt;->f(La/jhq0;)Ljava/util/List;

    .line 570
    .line 571
    .line 572
    move-result-object v2

    .line 573
    invoke-direct {v0, v1, v9, v10, v2}, La/m3i0;-><init>(ILa/mfj;La/mfj;Ljava/util/List;)V

    .line 574
    .line 575
    .line 576
    return-object v0

    .line 577
    :pswitch_4
    check-cast v4, La/x1i0;

    .line 578
    .line 579
    move-object v0, v1

    .line 580
    check-cast v0, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 581
    .line 582
    sget-object v1, La/x1i0;->n2:La/zie0;

    .line 583
    .line 584
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 585
    .line 586
    .line 587
    invoke-virtual {v4}, La/x1i0;->Q0()La/k3t0;

    .line 588
    .line 589
    .line 590
    move-result-object v1

    .line 591
    new-instance v2, La/t1i0;

    .line 592
    .line 593
    invoke-direct {v2, v0}, La/t1i0;-><init>(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;)V

    .line 594
    .line 595
    .line 596
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 597
    .line 598
    .line 599
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 600
    .line 601
    return-object v0

    .line 602
    :pswitch_5
    check-cast v4, La/g1i0;

    .line 603
    .line 604
    move-object v0, v1

    .line 605
    check-cast v0, La/k0w0;

    .line 606
    .line 607
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 608
    .line 609
    .line 610
    iget-object v1, v4, La/g1i0;->q:La/gle0;

    .line 611
    .line 612
    new-instance v9, Lorg/xplatform/rules/api/presentation/models/RuleData;

    .line 613
    .line 614
    const-string v2, "rule_cashback_percent"

    .line 615
    .line 616
    const/16 v3, 0xe

    .line 617
    .line 618
    invoke-direct {v9, v2, v3, v7, v7}, Lorg/xplatform/rules/api/presentation/models/RuleData;-><init>(Ljava/lang/String;ILjava/util/Map;Ljava/lang/String;)V

    .line 619
    .line 620
    .line 621
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 622
    .line 623
    .line 624
    new-instance v8, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentScreen$1;

    .line 625
    .line 626
    const v10, 0x7f1311a1

    .line 627
    .line 628
    .line 629
    const/4 v11, 0x1

    .line 630
    const/4 v12, 0x0

    .line 631
    const/4 v13, 0x0

    .line 632
    invoke-direct/range {v8 .. v13}, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentScreen$1;-><init>(Lorg/xplatform/rules/api/presentation/models/RuleData;IZZZ)V

    .line 633
    .line 634
    .line 635
    invoke-virtual {v0, v8}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 636
    .line 637
    .line 638
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 639
    .line 640
    return-object v0

    .line 641
    :pswitch_6
    check-cast v4, La/nxh0;

    .line 642
    .line 643
    move-object v0, v1

    .line 644
    check-cast v0, La/iqt0;

    .line 645
    .line 646
    sget-object v1, La/n0i0;->R1:La/gne0;

    .line 647
    .line 648
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 649
    .line 650
    .line 651
    new-instance v1, La/b0i0;

    .line 652
    .line 653
    invoke-direct {v1, v0}, La/b0i0;-><init>(La/iqt0;)V

    .line 654
    .line 655
    .line 656
    invoke-virtual {v4, v1}, La/nxh0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 660
    .line 661
    return-object v0

    .line 662
    :pswitch_7
    invoke-direct/range {p0 .. p1}, La/gwg0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    return-object v0

    .line 667
    :pswitch_8
    check-cast v4, La/izh0;

    .line 668
    .line 669
    move-object v0, v1

    .line 670
    check-cast v0, La/fzh0;

    .line 671
    .line 672
    sget-object v1, La/izh0;->S1:La/lme0;

    .line 673
    .line 674
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 675
    .line 676
    .line 677
    invoke-virtual {v4}, La/izh0;->G0()La/k3t0;

    .line 678
    .line 679
    .line 680
    move-result-object v1

    .line 681
    invoke-virtual {v1, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 682
    .line 683
    .line 684
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 685
    .line 686
    return-object v0

    .line 687
    :pswitch_9
    check-cast v4, La/x6f;

    .line 688
    .line 689
    move-object v0, v1

    .line 690
    check-cast v0, Ljava/lang/String;

    .line 691
    .line 692
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 693
    .line 694
    .line 695
    invoke-virtual {v4, v0}, La/x6f;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 699
    .line 700
    return-object v0

    .line 701
    :pswitch_a
    check-cast v4, La/c5h;

    .line 702
    .line 703
    iget-object v0, v4, La/c5h;->d:La/hzg;

    .line 704
    .line 705
    check-cast v1, Ljava/lang/Integer;

    .line 706
    .line 707
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 708
    .line 709
    .line 710
    move-result v1

    .line 711
    if-eq v1, v5, :cond_12

    .line 712
    .line 713
    if-eq v1, v6, :cond_10

    .line 714
    .line 715
    if-eq v1, v13, :cond_f

    .line 716
    .line 717
    goto/16 :goto_9

    .line 718
    .line 719
    :cond_f
    iget-object v0, v4, La/c5h;->q:La/p7m0;

    .line 720
    .line 721
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object v1

    .line 725
    move-object v8, v1

    .line 726
    check-cast v8, La/l120;

    .line 727
    .line 728
    const/4 v13, 0x0

    .line 729
    const/16 v14, 0xbf

    .line 730
    .line 731
    const/4 v9, 0x0

    .line 732
    const/4 v10, 0x0

    .line 733
    const/4 v11, 0x0

    .line 734
    const/4 v12, 0x0

    .line 735
    invoke-static/range {v8 .. v14}, La/l120;->a(La/l120;Ljava/lang/String;ZZZZI)La/l120;

    .line 736
    .line 737
    .line 738
    move-result-object v1

    .line 739
    invoke-virtual {v0, v7, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 740
    .line 741
    .line 742
    iget-object v0, v4, La/c5h;->h:La/s31;

    .line 743
    .line 744
    sget-object v1, La/wgh0;->u:La/wgh0;

    .line 745
    .line 746
    invoke-virtual {v0, v1}, La/s31;->g(La/wgh0;)V

    .line 747
    .line 748
    .line 749
    iget-object v0, v4, La/c5h;->n:La/cyu;

    .line 750
    .line 751
    const-string v1, "cybersport_popular"

    .line 752
    .line 753
    invoke-virtual {v0, v1}, La/cyu;->C(Ljava/lang/String;)V

    .line 754
    .line 755
    .line 756
    goto/16 :goto_9

    .line 757
    .line 758
    :cond_10
    iget-object v1, v4, La/c5h;->o:La/zr1;

    .line 759
    .line 760
    iget-object v1, v1, La/zr1;->a:La/s1p;

    .line 761
    .line 762
    const-wide/16 v5, 0xd16

    .line 763
    .line 764
    sget-object v2, La/xun;->a:La/xun;

    .line 765
    .line 766
    invoke-virtual {v1, v2, v5, v6}, La/s1p;->a(Ljava/util/Set;J)V

    .line 767
    .line 768
    .line 769
    iget-object v1, v4, La/c5h;->i:La/ih5;

    .line 770
    .line 771
    iget-object v1, v1, La/ih5;->a:La/kt2;

    .line 772
    .line 773
    const-string v2, "cybersport_actions_call"

    .line 774
    .line 775
    invoke-interface {v1, v2}, La/kt2;->c(Ljava/lang/String;)V

    .line 776
    .line 777
    .line 778
    iget-object v1, v4, La/c5h;->b:Lorg/xplatform/cyber/section/api/presentation/CyberMainDisciplinesParams;

    .line 779
    .line 780
    check-cast v1, Lorg/xplatform/cyber/section/api/presentation/CyberMainDisciplinesParams$Disciplines;

    .line 781
    .line 782
    iget-object v1, v1, Lorg/xplatform/cyber/section/api/presentation/CyberMainDisciplinesParams$Disciplines;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 783
    .line 784
    check-cast v0, La/uzg;

    .line 785
    .line 786
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 787
    .line 788
    .line 789
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 790
    .line 791
    .line 792
    iget-object v2, v0, La/uzg;->a:La/oeg0;

    .line 793
    .line 794
    invoke-virtual {v2}, La/oeg0;->c()La/i1w0;

    .line 795
    .line 796
    .line 797
    move-result-object v2

    .line 798
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 799
    .line 800
    .line 801
    move-result-object v4

    .line 802
    iget-object v0, v0, La/uzg;->b:La/vqc;

    .line 803
    .line 804
    new-instance v5, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$stockScreen$1;

    .line 805
    .line 806
    invoke-direct {v5, v0, v1}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$stockScreen$1;-><init>(La/vqc;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)V

    .line 807
    .line 808
    .line 809
    instance-of v0, v5, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 810
    .line 811
    if-eqz v0, :cond_11

    .line 812
    .line 813
    new-instance v0, La/e1w0;

    .line 814
    .line 815
    check-cast v5, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 816
    .line 817
    invoke-direct {v0, v5}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 818
    .line 819
    .line 820
    new-instance v1, La/c8d;

    .line 821
    .line 822
    sget-object v5, La/y7d;->a:La/v7d;

    .line 823
    .line 824
    invoke-direct {v1, v5, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 825
    .line 826
    .line 827
    invoke-virtual {v4, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 828
    .line 829
    .line 830
    goto :goto_7

    .line 831
    :cond_11
    new-instance v0, La/w0w0;

    .line 832
    .line 833
    invoke-direct {v0, v5}, La/w0w0;-><init>(La/m7h0;)V

    .line 834
    .line 835
    .line 836
    new-instance v1, La/c8d;

    .line 837
    .line 838
    sget-object v5, La/y7d;->a:La/v7d;

    .line 839
    .line 840
    invoke-direct {v1, v5, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 841
    .line 842
    .line 843
    invoke-virtual {v4, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 844
    .line 845
    .line 846
    :goto_7
    invoke-static {v2, v4, v3}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 847
    .line 848
    .line 849
    move-result-object v0

    .line 850
    :goto_8
    move-object v1, v0

    .line 851
    check-cast v1, La/paw;

    .line 852
    .line 853
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 854
    .line 855
    .line 856
    move-result v3

    .line 857
    if-eqz v3, :cond_13

    .line 858
    .line 859
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 860
    .line 861
    .line 862
    move-result-object v1

    .line 863
    check-cast v1, La/oe50;

    .line 864
    .line 865
    invoke-virtual {v2, v1}, La/i1w0;->a(La/oe50;)V

    .line 866
    .line 867
    .line 868
    goto :goto_8

    .line 869
    :cond_12
    sget-object v1, La/iun;->a:La/iun;

    .line 870
    .line 871
    new-instance v2, Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;

    .line 872
    .line 873
    invoke-direct {v2, v3, v3, v1, v3}, Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;-><init>(IILjava/util/List;Z)V

    .line 874
    .line 875
    .line 876
    check-cast v0, La/uzg;

    .line 877
    .line 878
    invoke-virtual {v0, v2}, La/uzg;->b(Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;)V

    .line 879
    .line 880
    .line 881
    :cond_13
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 882
    .line 883
    return-object v0

    .line 884
    :pswitch_b
    check-cast v4, La/zuh0;

    .line 885
    .line 886
    move-object v0, v1

    .line 887
    check-cast v0, La/k0w0;

    .line 888
    .line 889
    iget-object v1, v4, La/zuh0;->x:La/svs0;

    .line 890
    .line 891
    invoke-static {v1}, La/svs0;->c(La/svs0;)Lorg/xplatform/security/impl/navigation/TwoFactorAuthenticationScreenFactoryImpl$getRemoveTwoFactoryAuthenticationScreen$1;

    .line 892
    .line 893
    .line 894
    move-result-object v1

    .line 895
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 896
    .line 897
    .line 898
    move-result-object v0

    .line 899
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 900
    .line 901
    check-cast v0, La/c8d;

    .line 902
    .line 903
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 904
    .line 905
    new-instance v2, La/v7d;

    .line 906
    .line 907
    invoke-direct {v2, v5, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 908
    .line 909
    .line 910
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 911
    .line 912
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 913
    .line 914
    return-object v0

    .line 915
    :pswitch_c
    check-cast v4, La/cqh0;

    .line 916
    .line 917
    move-object v0, v1

    .line 918
    check-cast v0, La/hqh0;

    .line 919
    .line 920
    sget-object v1, La/cqh0;->N1:La/gne0;

    .line 921
    .line 922
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 923
    .line 924
    .line 925
    invoke-virtual {v4}, La/cqh0;->H0()La/irh0;

    .line 926
    .line 927
    .line 928
    move-result-object v1

    .line 929
    iget-object v2, v1, La/irh0;->z:La/i1w0;

    .line 930
    .line 931
    iget-object v4, v1, La/irh0;->l:La/zg;

    .line 932
    .line 933
    iget-object v8, v1, La/irh0;->r:La/mne;

    .line 934
    .line 935
    invoke-interface {v0}, La/hqh0;->t()La/ssh0;

    .line 936
    .line 937
    .line 938
    move-result-object v9

    .line 939
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 940
    .line 941
    .line 942
    move-result v9

    .line 943
    if-eqz v9, :cond_1e

    .line 944
    .line 945
    if-eq v9, v5, :cond_1d

    .line 946
    .line 947
    if-eq v9, v6, :cond_1a

    .line 948
    .line 949
    if-eq v9, v13, :cond_19

    .line 950
    .line 951
    const/4 v6, 0x4

    .line 952
    if-eq v9, v6, :cond_16

    .line 953
    .line 954
    const/4 v6, 0x5

    .line 955
    if-ne v9, v6, :cond_15

    .line 956
    .line 957
    iget-object v2, v1, La/irh0;->F:La/bby;

    .line 958
    .line 959
    if-eqz v2, :cond_14

    .line 960
    .line 961
    invoke-interface {v2}, La/bby;->isActive()Z

    .line 962
    .line 963
    .line 964
    move-result v2

    .line 965
    if-ne v2, v5, :cond_14

    .line 966
    .line 967
    goto/16 :goto_e

    .line 968
    .line 969
    :cond_14
    iget-object v2, v1, La/irh0;->D:La/p7m0;

    .line 970
    .line 971
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 972
    .line 973
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 974
    .line 975
    .line 976
    invoke-virtual {v2, v7, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 977
    .line 978
    .line 979
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 980
    .line 981
    .line 982
    move-result-object v9

    .line 983
    new-instance v10, La/dff0;

    .line 984
    .line 985
    const/16 v2, 0x1c

    .line 986
    .line 987
    invoke-direct {v10, v1, v0, v2}, La/dff0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 988
    .line 989
    .line 990
    iget-object v12, v8, La/mne;->a:La/rwj;

    .line 991
    .line 992
    new-instance v13, La/zye0;

    .line 993
    .line 994
    const/16 v2, 0x14

    .line 995
    .line 996
    invoke-direct {v13, v1, v0, v7, v2}, La/zye0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 997
    .line 998
    .line 999
    const/16 v14, 0xa

    .line 1000
    .line 1001
    const/4 v11, 0x0

    .line 1002
    invoke-static/range {v9 .. v14}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v2

    .line 1006
    iput-object v2, v1, La/irh0;->F:La/bby;

    .line 1007
    .line 1008
    goto/16 :goto_e

    .line 1009
    .line 1010
    :cond_15
    invoke-static {}, La/t9f;->b()V

    .line 1011
    .line 1012
    .line 1013
    goto/16 :goto_f

    .line 1014
    .line 1015
    :cond_16
    invoke-interface {v0}, La/hqh0;->s()Z

    .line 1016
    .line 1017
    .line 1018
    move-result v5

    .line 1019
    if-eqz v5, :cond_17

    .line 1020
    .line 1021
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v2

    .line 1025
    new-instance v4, La/hrh0;

    .line 1026
    .line 1027
    invoke-direct {v4, v1, v7, v3}, La/hrh0;-><init>(La/irh0;La/yje;B)V

    .line 1028
    .line 1029
    .line 1030
    invoke-virtual {v1, v2, v4}, La/irh0;->w(La/bvc;Lkotlin/jvm/functions/Function2;)V

    .line 1031
    .line 1032
    .line 1033
    goto/16 :goto_e

    .line 1034
    .line 1035
    :cond_17
    invoke-virtual {v4, v15}, La/zg;->g(Ljava/lang/String;)V

    .line 1036
    .line 1037
    .line 1038
    iget-object v4, v1, La/irh0;->C:La/au0;

    .line 1039
    .line 1040
    invoke-virtual {v4, v15}, La/au0;->l(Ljava/lang/String;)V

    .line 1041
    .line 1042
    .line 1043
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1044
    .line 1045
    .line 1046
    new-instance v4, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1047
    .line 1048
    invoke-direct {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 1049
    .line 1050
    .line 1051
    iget-object v5, v1, La/irh0;->p:La/jh70;

    .line 1052
    .line 1053
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1054
    .line 1055
    .line 1056
    instance-of v5, v14, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 1057
    .line 1058
    if-eqz v5, :cond_18

    .line 1059
    .line 1060
    new-instance v5, La/e1w0;

    .line 1061
    .line 1062
    check-cast v14, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 1063
    .line 1064
    invoke-direct {v5, v14}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 1065
    .line 1066
    .line 1067
    new-instance v6, La/c8d;

    .line 1068
    .line 1069
    sget-object v7, La/y7d;->a:La/v7d;

    .line 1070
    .line 1071
    invoke-direct {v6, v7, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual {v4, v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1075
    .line 1076
    .line 1077
    goto :goto_a

    .line 1078
    :cond_18
    new-instance v5, La/w0w0;

    .line 1079
    .line 1080
    invoke-direct {v5, v14}, La/w0w0;-><init>(La/m7h0;)V

    .line 1081
    .line 1082
    .line 1083
    new-instance v6, La/c8d;

    .line 1084
    .line 1085
    sget-object v7, La/y7d;->a:La/v7d;

    .line 1086
    .line 1087
    invoke-direct {v6, v7, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1088
    .line 1089
    .line 1090
    invoke-virtual {v4, v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1091
    .line 1092
    .line 1093
    :goto_a
    invoke-static {v2, v4, v3}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v3

    .line 1097
    :goto_b
    move-object v4, v3

    .line 1098
    check-cast v4, La/paw;

    .line 1099
    .line 1100
    invoke-virtual {v4}, La/paw;->hasNext()Z

    .line 1101
    .line 1102
    .line 1103
    move-result v5

    .line 1104
    if-eqz v5, :cond_20

    .line 1105
    .line 1106
    invoke-virtual {v4}, La/paw;->next()Ljava/lang/Object;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v4

    .line 1110
    check-cast v4, La/oe50;

    .line 1111
    .line 1112
    invoke-virtual {v2, v4}, La/i1w0;->a(La/oe50;)V

    .line 1113
    .line 1114
    .line 1115
    goto :goto_b

    .line 1116
    :cond_19
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v5

    .line 1120
    new-instance v6, La/jjh0;

    .line 1121
    .line 1122
    const/16 v30, 0x0

    .line 1123
    .line 1124
    const/16 v31, 0x16

    .line 1125
    .line 1126
    const/16 v25, 0x1

    .line 1127
    .line 1128
    const-class v27, La/irh0;

    .line 1129
    .line 1130
    const-string v28, "onLoadingError"

    .line 1131
    .line 1132
    const-string v29, "onLoadingError(Ljava/lang/Throwable;)V"

    .line 1133
    .line 1134
    move-object/from16 v26, v1

    .line 1135
    .line 1136
    move-object/from16 v24, v6

    .line 1137
    .line 1138
    invoke-direct/range {v24 .. v31}, La/jjh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1139
    .line 1140
    .line 1141
    iget-object v8, v8, La/mne;->a:La/rwj;

    .line 1142
    .line 1143
    new-instance v9, La/frh0;

    .line 1144
    .line 1145
    const/4 v2, 0x5

    .line 1146
    invoke-direct {v9, v1, v7, v2}, La/frh0;-><init>(La/irh0;La/yje;B)V

    .line 1147
    .line 1148
    .line 1149
    const/16 v10, 0xa

    .line 1150
    .line 1151
    const/4 v7, 0x0

    .line 1152
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1153
    .line 1154
    .line 1155
    goto/16 :goto_e

    .line 1156
    .line 1157
    :cond_1a
    invoke-interface {v0}, La/hqh0;->s()Z

    .line 1158
    .line 1159
    .line 1160
    move-result v4

    .line 1161
    if-eqz v4, :cond_1b

    .line 1162
    .line 1163
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v2

    .line 1167
    new-instance v3, La/hrh0;

    .line 1168
    .line 1169
    invoke-direct {v3, v1, v7, v6}, La/hrh0;-><init>(La/irh0;La/yje;B)V

    .line 1170
    .line 1171
    .line 1172
    invoke-virtual {v1, v2, v3}, La/irh0;->w(La/bvc;Lkotlin/jvm/functions/Function2;)V

    .line 1173
    .line 1174
    .line 1175
    goto/16 :goto_e

    .line 1176
    .line 1177
    :cond_1b
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v4

    .line 1181
    iget-object v5, v1, La/irh0;->y:La/qgd;

    .line 1182
    .line 1183
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1184
    .line 1185
    .line 1186
    new-instance v5, Lorg/xplatform/security/impl/presentation/secret_question/screens/SecretQuestionScreen;

    .line 1187
    .line 1188
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 1189
    .line 1190
    .line 1191
    instance-of v6, v5, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 1192
    .line 1193
    if-eqz v6, :cond_1c

    .line 1194
    .line 1195
    new-instance v6, La/e1w0;

    .line 1196
    .line 1197
    check-cast v5, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 1198
    .line 1199
    invoke-direct {v6, v5}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 1200
    .line 1201
    .line 1202
    new-instance v5, La/c8d;

    .line 1203
    .line 1204
    sget-object v7, La/y7d;->a:La/v7d;

    .line 1205
    .line 1206
    invoke-direct {v5, v7, v6}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1207
    .line 1208
    .line 1209
    invoke-virtual {v4, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1210
    .line 1211
    .line 1212
    goto :goto_c

    .line 1213
    :cond_1c
    new-instance v6, La/w0w0;

    .line 1214
    .line 1215
    invoke-direct {v6, v5}, La/w0w0;-><init>(La/m7h0;)V

    .line 1216
    .line 1217
    .line 1218
    new-instance v5, La/c8d;

    .line 1219
    .line 1220
    sget-object v7, La/y7d;->a:La/v7d;

    .line 1221
    .line 1222
    invoke-direct {v5, v7, v6}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1223
    .line 1224
    .line 1225
    invoke-virtual {v4, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1226
    .line 1227
    .line 1228
    :goto_c
    invoke-static {v2, v4, v3}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v3

    .line 1232
    :goto_d
    move-object v4, v3

    .line 1233
    check-cast v4, La/paw;

    .line 1234
    .line 1235
    invoke-virtual {v4}, La/paw;->hasNext()Z

    .line 1236
    .line 1237
    .line 1238
    move-result v5

    .line 1239
    if-eqz v5, :cond_20

    .line 1240
    .line 1241
    invoke-virtual {v4}, La/paw;->next()Ljava/lang/Object;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v4

    .line 1245
    check-cast v4, La/oe50;

    .line 1246
    .line 1247
    invoke-virtual {v2, v4}, La/i1w0;->a(La/oe50;)V

    .line 1248
    .line 1249
    .line 1250
    goto :goto_d

    .line 1251
    :cond_1d
    invoke-virtual {v4}, La/zg;->f()V

    .line 1252
    .line 1253
    .line 1254
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v5

    .line 1258
    new-instance v24, La/jjh0;

    .line 1259
    .line 1260
    const/16 v30, 0x0

    .line 1261
    .line 1262
    const/16 v31, 0x12

    .line 1263
    .line 1264
    const/16 v25, 0x1

    .line 1265
    .line 1266
    const-class v27, La/irh0;

    .line 1267
    .line 1268
    const-string v28, "onLoadingError"

    .line 1269
    .line 1270
    const-string v29, "onLoadingError(Ljava/lang/Throwable;)V"

    .line 1271
    .line 1272
    move-object/from16 v26, v1

    .line 1273
    .line 1274
    invoke-direct/range {v24 .. v31}, La/jjh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1275
    .line 1276
    .line 1277
    iget-object v8, v8, La/mne;->a:La/rwj;

    .line 1278
    .line 1279
    new-instance v9, La/frh0;

    .line 1280
    .line 1281
    invoke-direct {v9, v1, v7, v6}, La/frh0;-><init>(La/irh0;La/yje;B)V

    .line 1282
    .line 1283
    .line 1284
    const/16 v10, 0xa

    .line 1285
    .line 1286
    const/4 v7, 0x0

    .line 1287
    move-object/from16 v6, v24

    .line 1288
    .line 1289
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1290
    .line 1291
    .line 1292
    goto :goto_e

    .line 1293
    :cond_1e
    invoke-interface {v0}, La/hqh0;->s()Z

    .line 1294
    .line 1295
    .line 1296
    move-result v2

    .line 1297
    if-eqz v2, :cond_1f

    .line 1298
    .line 1299
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v2

    .line 1303
    new-instance v3, La/hrh0;

    .line 1304
    .line 1305
    invoke-direct {v3, v1, v7, v5}, La/hrh0;-><init>(La/irh0;La/yje;B)V

    .line 1306
    .line 1307
    .line 1308
    invoke-virtual {v1, v2, v3}, La/irh0;->w(La/bvc;Lkotlin/jvm/functions/Function2;)V

    .line 1309
    .line 1310
    .line 1311
    goto :goto_e

    .line 1312
    :cond_1f
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v2

    .line 1316
    new-instance v24, La/jjh0;

    .line 1317
    .line 1318
    const/16 v30, 0x0

    .line 1319
    .line 1320
    const/16 v31, 0x13

    .line 1321
    .line 1322
    const/16 v25, 0x1

    .line 1323
    .line 1324
    const-class v27, La/irh0;

    .line 1325
    .line 1326
    const-string v28, "onLoadingError"

    .line 1327
    .line 1328
    const-string v29, "onLoadingError(Ljava/lang/Throwable;)V"

    .line 1329
    .line 1330
    move-object/from16 v26, v1

    .line 1331
    .line 1332
    invoke-direct/range {v24 .. v31}, La/jjh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1333
    .line 1334
    .line 1335
    iget-object v11, v8, La/mne;->a:La/rwj;

    .line 1336
    .line 1337
    new-instance v12, La/frh0;

    .line 1338
    .line 1339
    invoke-direct {v12, v1, v7, v13}, La/frh0;-><init>(La/irh0;La/yje;B)V

    .line 1340
    .line 1341
    .line 1342
    const/16 v13, 0xa

    .line 1343
    .line 1344
    const/4 v10, 0x0

    .line 1345
    move-object v8, v2

    .line 1346
    move-object/from16 v9, v24

    .line 1347
    .line 1348
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1349
    .line 1350
    .line 1351
    :cond_20
    :goto_e
    invoke-interface {v0}, La/hqh0;->t()La/ssh0;

    .line 1352
    .line 1353
    .line 1354
    move-result-object v2

    .line 1355
    sget-object v3, La/ssh0;->f:La/ssh0;

    .line 1356
    .line 1357
    if-eq v2, v3, :cond_21

    .line 1358
    .line 1359
    iget-object v2, v1, La/irh0;->B:La/ik4;

    .line 1360
    .line 1361
    invoke-interface {v0}, La/hqh0;->t()La/ssh0;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v3

    .line 1365
    invoke-static {v3}, La/w9x;->F(La/ssh0;)Ljava/lang/String;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v3

    .line 1369
    iget-object v2, v2, La/ik4;->a:La/s1p;

    .line 1370
    .line 1371
    const-wide/16 v4, 0xcaf

    .line 1372
    .line 1373
    invoke-static {v3, v2, v4, v5}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 1374
    .line 1375
    .line 1376
    :cond_21
    iget-object v1, v1, La/irh0;->k:La/vd1;

    .line 1377
    .line 1378
    invoke-interface {v0}, La/hqh0;->t()La/ssh0;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v0

    .line 1382
    invoke-static {v0}, La/w9x;->F(La/ssh0;)Ljava/lang/String;

    .line 1383
    .line 1384
    .line 1385
    move-result-object v0

    .line 1386
    invoke-virtual {v1, v0}, La/vd1;->f(Ljava/lang/String;)V

    .line 1387
    .line 1388
    .line 1389
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1390
    .line 1391
    :goto_f
    return-object v7

    .line 1392
    :pswitch_d
    check-cast v4, La/oph0;

    .line 1393
    .line 1394
    move-object v0, v1

    .line 1395
    check-cast v0, La/dth0;

    .line 1396
    .line 1397
    sget-object v1, La/oph0;->Q1:La/gle0;

    .line 1398
    .line 1399
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1400
    .line 1401
    .line 1402
    invoke-virtual {v4}, La/oph0;->I0()La/zuh0;

    .line 1403
    .line 1404
    .line 1405
    move-result-object v1

    .line 1406
    iget-object v2, v1, La/zuh0;->C:La/au0;

    .line 1407
    .line 1408
    iget-object v4, v1, La/zuh0;->l:La/zg;

    .line 1409
    .line 1410
    iget-object v8, v1, La/zuh0;->q:La/mne;

    .line 1411
    .line 1412
    invoke-interface {v0}, La/dth0;->t()La/ssh0;

    .line 1413
    .line 1414
    .line 1415
    move-result-object v9

    .line 1416
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 1417
    .line 1418
    .line 1419
    move-result v9

    .line 1420
    if-eqz v9, :cond_2a

    .line 1421
    .line 1422
    if-eq v9, v5, :cond_29

    .line 1423
    .line 1424
    if-eq v9, v6, :cond_28

    .line 1425
    .line 1426
    if-eq v9, v13, :cond_27

    .line 1427
    .line 1428
    const/4 v6, 0x4

    .line 1429
    if-eq v9, v6, :cond_24

    .line 1430
    .line 1431
    const/4 v6, 0x5

    .line 1432
    if-ne v9, v6, :cond_23

    .line 1433
    .line 1434
    iget-object v2, v1, La/zuh0;->K:La/bby;

    .line 1435
    .line 1436
    if-eqz v2, :cond_22

    .line 1437
    .line 1438
    invoke-interface {v2}, La/bby;->isActive()Z

    .line 1439
    .line 1440
    .line 1441
    move-result v2

    .line 1442
    if-ne v2, v5, :cond_22

    .line 1443
    .line 1444
    goto/16 :goto_12

    .line 1445
    .line 1446
    :cond_22
    iget-object v2, v1, La/zuh0;->F:La/p7m0;

    .line 1447
    .line 1448
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1449
    .line 1450
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1451
    .line 1452
    .line 1453
    invoke-virtual {v2, v7, v4}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1454
    .line 1455
    .line 1456
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v9

    .line 1460
    new-instance v10, La/huh0;

    .line 1461
    .line 1462
    invoke-direct {v10, v1, v0, v3}, La/huh0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1463
    .line 1464
    .line 1465
    iget-object v12, v8, La/mne;->a:La/rwj;

    .line 1466
    .line 1467
    new-instance v13, La/zye0;

    .line 1468
    .line 1469
    const/16 v2, 0x15

    .line 1470
    .line 1471
    invoke-direct {v13, v1, v0, v7, v2}, La/zye0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 1472
    .line 1473
    .line 1474
    const/16 v14, 0xa

    .line 1475
    .line 1476
    const/4 v11, 0x0

    .line 1477
    invoke-static/range {v9 .. v14}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v2

    .line 1481
    iput-object v2, v1, La/zuh0;->K:La/bby;

    .line 1482
    .line 1483
    goto/16 :goto_12

    .line 1484
    .line 1485
    :cond_23
    invoke-static {}, La/t9f;->b()V

    .line 1486
    .line 1487
    .line 1488
    goto/16 :goto_13

    .line 1489
    .line 1490
    :cond_24
    invoke-interface {v0}, La/dth0;->s()Z

    .line 1491
    .line 1492
    .line 1493
    move-result v6

    .line 1494
    if-eqz v6, :cond_25

    .line 1495
    .line 1496
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1497
    .line 1498
    .line 1499
    move-result-object v2

    .line 1500
    new-instance v3, La/uuh0;

    .line 1501
    .line 1502
    invoke-direct {v3, v1, v7, v5}, La/uuh0;-><init>(La/zuh0;La/yje;B)V

    .line 1503
    .line 1504
    .line 1505
    invoke-virtual {v1, v2, v3}, La/zuh0;->w(La/bvc;Lkotlin/jvm/functions/Function2;)V

    .line 1506
    .line 1507
    .line 1508
    goto/16 :goto_12

    .line 1509
    .line 1510
    :cond_25
    invoke-virtual {v4, v15}, La/zg;->g(Ljava/lang/String;)V

    .line 1511
    .line 1512
    .line 1513
    invoke-virtual {v2, v15}, La/au0;->l(Ljava/lang/String;)V

    .line 1514
    .line 1515
    .line 1516
    iget-object v2, v1, La/zuh0;->z:La/i1w0;

    .line 1517
    .line 1518
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v4

    .line 1522
    iget-object v5, v1, La/zuh0;->o:La/jh70;

    .line 1523
    .line 1524
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1525
    .line 1526
    .line 1527
    instance-of v5, v14, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 1528
    .line 1529
    if-eqz v5, :cond_26

    .line 1530
    .line 1531
    new-instance v5, La/e1w0;

    .line 1532
    .line 1533
    check-cast v14, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 1534
    .line 1535
    invoke-direct {v5, v14}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 1536
    .line 1537
    .line 1538
    new-instance v6, La/c8d;

    .line 1539
    .line 1540
    sget-object v7, La/y7d;->a:La/v7d;

    .line 1541
    .line 1542
    invoke-direct {v6, v7, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1543
    .line 1544
    .line 1545
    invoke-virtual {v4, v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1546
    .line 1547
    .line 1548
    goto :goto_10

    .line 1549
    :cond_26
    new-instance v5, La/w0w0;

    .line 1550
    .line 1551
    invoke-direct {v5, v14}, La/w0w0;-><init>(La/m7h0;)V

    .line 1552
    .line 1553
    .line 1554
    new-instance v6, La/c8d;

    .line 1555
    .line 1556
    sget-object v7, La/y7d;->a:La/v7d;

    .line 1557
    .line 1558
    invoke-direct {v6, v7, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1559
    .line 1560
    .line 1561
    invoke-virtual {v4, v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1562
    .line 1563
    .line 1564
    :goto_10
    invoke-static {v2, v4, v3}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 1565
    .line 1566
    .line 1567
    move-result-object v3

    .line 1568
    :goto_11
    move-object v4, v3

    .line 1569
    check-cast v4, La/paw;

    .line 1570
    .line 1571
    invoke-virtual {v4}, La/paw;->hasNext()Z

    .line 1572
    .line 1573
    .line 1574
    move-result v5

    .line 1575
    if-eqz v5, :cond_2c

    .line 1576
    .line 1577
    invoke-virtual {v4}, La/paw;->next()Ljava/lang/Object;

    .line 1578
    .line 1579
    .line 1580
    move-result-object v4

    .line 1581
    check-cast v4, La/oe50;

    .line 1582
    .line 1583
    invoke-virtual {v2, v4}, La/i1w0;->a(La/oe50;)V

    .line 1584
    .line 1585
    .line 1586
    goto :goto_11

    .line 1587
    :cond_27
    invoke-virtual {v1}, La/zuh0;->A()V

    .line 1588
    .line 1589
    .line 1590
    goto/16 :goto_12

    .line 1591
    .line 1592
    :cond_28
    invoke-interface {v0}, La/dth0;->s()Z

    .line 1593
    .line 1594
    .line 1595
    move-result v2

    .line 1596
    invoke-virtual {v1, v2}, La/zuh0;->z(Z)V

    .line 1597
    .line 1598
    .line 1599
    goto/16 :goto_12

    .line 1600
    .line 1601
    :cond_29
    invoke-virtual {v4}, La/zg;->f()V

    .line 1602
    .line 1603
    .line 1604
    iget-object v2, v2, La/au0;->a:La/s1p;

    .line 1605
    .line 1606
    new-instance v4, La/j1p;

    .line 1607
    .line 1608
    invoke-direct {v4, v15, v3}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 1609
    .line 1610
    .line 1611
    invoke-static {v4}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 1612
    .line 1613
    .line 1614
    move-result-object v3

    .line 1615
    const-wide/16 v4, 0xca8

    .line 1616
    .line 1617
    invoke-virtual {v2, v3, v4, v5}, La/s1p;->a(Ljava/util/Set;J)V

    .line 1618
    .line 1619
    .line 1620
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1621
    .line 1622
    .line 1623
    move-result-object v9

    .line 1624
    new-instance v24, La/jjh0;

    .line 1625
    .line 1626
    const/16 v30, 0x0

    .line 1627
    .line 1628
    const/16 v31, 0x19

    .line 1629
    .line 1630
    const/16 v25, 0x1

    .line 1631
    .line 1632
    const-class v27, La/zuh0;

    .line 1633
    .line 1634
    const-string v28, "onLoadingError"

    .line 1635
    .line 1636
    const-string v29, "onLoadingError(Ljava/lang/Throwable;)V"

    .line 1637
    .line 1638
    move-object/from16 v26, v1

    .line 1639
    .line 1640
    invoke-direct/range {v24 .. v31}, La/jjh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1641
    .line 1642
    .line 1643
    iget-object v12, v8, La/mne;->a:La/rwj;

    .line 1644
    .line 1645
    new-instance v13, La/xuh0;

    .line 1646
    .line 1647
    invoke-direct {v13, v1, v7, v6}, La/xuh0;-><init>(La/zuh0;La/yje;B)V

    .line 1648
    .line 1649
    .line 1650
    const/16 v14, 0xa

    .line 1651
    .line 1652
    const/4 v11, 0x0

    .line 1653
    move-object/from16 v10, v24

    .line 1654
    .line 1655
    invoke-static/range {v9 .. v14}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1656
    .line 1657
    .line 1658
    goto :goto_12

    .line 1659
    :cond_2a
    invoke-interface {v0}, La/dth0;->s()Z

    .line 1660
    .line 1661
    .line 1662
    move-result v2

    .line 1663
    if-eqz v2, :cond_2b

    .line 1664
    .line 1665
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1666
    .line 1667
    .line 1668
    move-result-object v2

    .line 1669
    new-instance v3, La/uuh0;

    .line 1670
    .line 1671
    invoke-direct {v3, v1, v7, v6}, La/uuh0;-><init>(La/zuh0;La/yje;B)V

    .line 1672
    .line 1673
    .line 1674
    invoke-virtual {v1, v2, v3}, La/zuh0;->w(La/bvc;Lkotlin/jvm/functions/Function2;)V

    .line 1675
    .line 1676
    .line 1677
    goto :goto_12

    .line 1678
    :cond_2b
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1679
    .line 1680
    .line 1681
    move-result-object v2

    .line 1682
    new-instance v24, La/jjh0;

    .line 1683
    .line 1684
    const/16 v30, 0x0

    .line 1685
    .line 1686
    const/16 v31, 0x1a

    .line 1687
    .line 1688
    const/16 v25, 0x1

    .line 1689
    .line 1690
    const-class v27, La/zuh0;

    .line 1691
    .line 1692
    const-string v28, "onLoadingError"

    .line 1693
    .line 1694
    const-string v29, "onLoadingError(Ljava/lang/Throwable;)V"

    .line 1695
    .line 1696
    move-object/from16 v26, v1

    .line 1697
    .line 1698
    invoke-direct/range {v24 .. v31}, La/jjh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1699
    .line 1700
    .line 1701
    iget-object v11, v8, La/mne;->a:La/rwj;

    .line 1702
    .line 1703
    new-instance v12, La/xuh0;

    .line 1704
    .line 1705
    invoke-direct {v12, v1, v7, v13}, La/xuh0;-><init>(La/zuh0;La/yje;B)V

    .line 1706
    .line 1707
    .line 1708
    const/16 v13, 0xa

    .line 1709
    .line 1710
    const/4 v10, 0x0

    .line 1711
    move-object v8, v2

    .line 1712
    move-object/from16 v9, v24

    .line 1713
    .line 1714
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1715
    .line 1716
    .line 1717
    :cond_2c
    :goto_12
    invoke-interface {v0}, La/dth0;->t()La/ssh0;

    .line 1718
    .line 1719
    .line 1720
    move-result-object v2

    .line 1721
    sget-object v3, La/ssh0;->f:La/ssh0;

    .line 1722
    .line 1723
    if-eq v2, v3, :cond_2d

    .line 1724
    .line 1725
    iget-object v2, v1, La/zuh0;->B:La/ik4;

    .line 1726
    .line 1727
    invoke-interface {v0}, La/dth0;->t()La/ssh0;

    .line 1728
    .line 1729
    .line 1730
    move-result-object v3

    .line 1731
    invoke-static {v3}, La/w9x;->F(La/ssh0;)Ljava/lang/String;

    .line 1732
    .line 1733
    .line 1734
    move-result-object v3

    .line 1735
    iget-object v2, v2, La/ik4;->a:La/s1p;

    .line 1736
    .line 1737
    const-wide/16 v4, 0xcaf

    .line 1738
    .line 1739
    invoke-static {v3, v2, v4, v5}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 1740
    .line 1741
    .line 1742
    :cond_2d
    iget-object v1, v1, La/zuh0;->k:La/vd1;

    .line 1743
    .line 1744
    invoke-interface {v0}, La/dth0;->t()La/ssh0;

    .line 1745
    .line 1746
    .line 1747
    move-result-object v0

    .line 1748
    invoke-static {v0}, La/w9x;->F(La/ssh0;)Ljava/lang/String;

    .line 1749
    .line 1750
    .line 1751
    move-result-object v0

    .line 1752
    invoke-virtual {v1, v0}, La/vd1;->f(Ljava/lang/String;)V

    .line 1753
    .line 1754
    .line 1755
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1756
    .line 1757
    :goto_13
    return-object v7

    .line 1758
    :pswitch_e
    check-cast v4, La/joh0;

    .line 1759
    .line 1760
    move-object v0, v1

    .line 1761
    check-cast v0, La/noh0;

    .line 1762
    .line 1763
    sget-object v1, La/joh0;->N1:La/eke0;

    .line 1764
    .line 1765
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1766
    .line 1767
    .line 1768
    invoke-virtual {v4}, La/joh0;->H0()La/iph0;

    .line 1769
    .line 1770
    .line 1771
    move-result-object v1

    .line 1772
    iget-object v2, v1, La/iph0;->A:La/i1w0;

    .line 1773
    .line 1774
    iget-object v4, v1, La/iph0;->m:La/zg;

    .line 1775
    .line 1776
    sget-object v8, La/pek0;->a:La/pek0;

    .line 1777
    .line 1778
    iget-object v9, v1, La/iph0;->J:La/ol60;

    .line 1779
    .line 1780
    iget-object v10, v1, La/iph0;->v:La/ctf0;

    .line 1781
    .line 1782
    iget-object v11, v1, La/iph0;->s:La/mne;

    .line 1783
    .line 1784
    invoke-interface {v0}, La/noh0;->t()La/ssh0;

    .line 1785
    .line 1786
    .line 1787
    move-result-object v12

    .line 1788
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    .line 1789
    .line 1790
    .line 1791
    move-result v12

    .line 1792
    if-eqz v12, :cond_3a

    .line 1793
    .line 1794
    if-eq v12, v5, :cond_38

    .line 1795
    .line 1796
    if-eq v12, v6, :cond_35

    .line 1797
    .line 1798
    if-eq v12, v13, :cond_33

    .line 1799
    .line 1800
    const/4 v6, 0x4

    .line 1801
    if-eq v12, v6, :cond_30

    .line 1802
    .line 1803
    const/4 v6, 0x5

    .line 1804
    if-ne v12, v6, :cond_2f

    .line 1805
    .line 1806
    iget-object v2, v1, La/iph0;->F:La/bby;

    .line 1807
    .line 1808
    if-eqz v2, :cond_2e

    .line 1809
    .line 1810
    invoke-interface {v2}, La/bby;->isActive()Z

    .line 1811
    .line 1812
    .line 1813
    move-result v2

    .line 1814
    if-ne v2, v5, :cond_2e

    .line 1815
    .line 1816
    goto/16 :goto_18

    .line 1817
    .line 1818
    :cond_2e
    iget-object v2, v1, La/iph0;->D:La/p7m0;

    .line 1819
    .line 1820
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1821
    .line 1822
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1823
    .line 1824
    .line 1825
    invoke-virtual {v2, v7, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1826
    .line 1827
    .line 1828
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1829
    .line 1830
    .line 1831
    move-result-object v12

    .line 1832
    new-instance v13, La/dff0;

    .line 1833
    .line 1834
    const/16 v2, 0x1a

    .line 1835
    .line 1836
    invoke-direct {v13, v1, v0, v2}, La/dff0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1837
    .line 1838
    .line 1839
    iget-object v15, v11, La/mne;->a:La/rwj;

    .line 1840
    .line 1841
    new-instance v2, La/zye0;

    .line 1842
    .line 1843
    const/16 v3, 0x13

    .line 1844
    .line 1845
    invoke-direct {v2, v1, v0, v7, v3}, La/zye0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 1846
    .line 1847
    .line 1848
    const/16 v17, 0xa

    .line 1849
    .line 1850
    const/4 v14, 0x0

    .line 1851
    move-object/from16 v16, v2

    .line 1852
    .line 1853
    invoke-static/range {v12 .. v17}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1854
    .line 1855
    .line 1856
    move-result-object v2

    .line 1857
    iput-object v2, v1, La/iph0;->F:La/bby;

    .line 1858
    .line 1859
    goto/16 :goto_18

    .line 1860
    .line 1861
    :cond_2f
    invoke-static {}, La/t9f;->b()V

    .line 1862
    .line 1863
    .line 1864
    goto/16 :goto_19

    .line 1865
    .line 1866
    :cond_30
    invoke-interface {v0}, La/noh0;->s()Z

    .line 1867
    .line 1868
    .line 1869
    move-result v5

    .line 1870
    if-eqz v5, :cond_31

    .line 1871
    .line 1872
    new-array v2, v3, [Ljava/lang/Object;

    .line 1873
    .line 1874
    const v3, 0x7f130f41

    .line 1875
    .line 1876
    .line 1877
    invoke-virtual {v10, v3, v2}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1878
    .line 1879
    .line 1880
    move-result-object v2

    .line 1881
    new-instance v3, La/woh0;

    .line 1882
    .line 1883
    invoke-direct {v3, v8, v2}, La/woh0;-><init>(La/sek0;Ljava/lang/String;)V

    .line 1884
    .line 1885
    .line 1886
    invoke-virtual {v9, v3}, La/ol60;->f(Ljava/lang/Object;)V

    .line 1887
    .line 1888
    .line 1889
    goto/16 :goto_18

    .line 1890
    .line 1891
    :cond_31
    invoke-virtual {v4, v15}, La/zg;->g(Ljava/lang/String;)V

    .line 1892
    .line 1893
    .line 1894
    iget-object v4, v1, La/iph0;->C:La/au0;

    .line 1895
    .line 1896
    invoke-virtual {v4, v15}, La/au0;->l(Ljava/lang/String;)V

    .line 1897
    .line 1898
    .line 1899
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1900
    .line 1901
    .line 1902
    new-instance v4, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1903
    .line 1904
    invoke-direct {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 1905
    .line 1906
    .line 1907
    iget-object v5, v1, La/iph0;->p:La/jh70;

    .line 1908
    .line 1909
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1910
    .line 1911
    .line 1912
    instance-of v5, v14, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 1913
    .line 1914
    if-eqz v5, :cond_32

    .line 1915
    .line 1916
    new-instance v5, La/e1w0;

    .line 1917
    .line 1918
    check-cast v14, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 1919
    .line 1920
    invoke-direct {v5, v14}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 1921
    .line 1922
    .line 1923
    new-instance v6, La/c8d;

    .line 1924
    .line 1925
    sget-object v7, La/y7d;->a:La/v7d;

    .line 1926
    .line 1927
    invoke-direct {v6, v7, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1928
    .line 1929
    .line 1930
    invoke-virtual {v4, v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1931
    .line 1932
    .line 1933
    goto :goto_14

    .line 1934
    :cond_32
    new-instance v5, La/w0w0;

    .line 1935
    .line 1936
    invoke-direct {v5, v14}, La/w0w0;-><init>(La/m7h0;)V

    .line 1937
    .line 1938
    .line 1939
    new-instance v6, La/c8d;

    .line 1940
    .line 1941
    sget-object v7, La/y7d;->a:La/v7d;

    .line 1942
    .line 1943
    invoke-direct {v6, v7, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1944
    .line 1945
    .line 1946
    invoke-virtual {v4, v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1947
    .line 1948
    .line 1949
    :goto_14
    invoke-static {v2, v4, v3}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 1950
    .line 1951
    .line 1952
    move-result-object v3

    .line 1953
    :goto_15
    move-object v4, v3

    .line 1954
    check-cast v4, La/paw;

    .line 1955
    .line 1956
    invoke-virtual {v4}, La/paw;->hasNext()Z

    .line 1957
    .line 1958
    .line 1959
    move-result v5

    .line 1960
    if-eqz v5, :cond_3d

    .line 1961
    .line 1962
    invoke-virtual {v4}, La/paw;->next()Ljava/lang/Object;

    .line 1963
    .line 1964
    .line 1965
    move-result-object v4

    .line 1966
    check-cast v4, La/oe50;

    .line 1967
    .line 1968
    invoke-virtual {v2, v4}, La/i1w0;->a(La/oe50;)V

    .line 1969
    .line 1970
    .line 1971
    goto :goto_15

    .line 1972
    :cond_33
    iget-object v2, v1, La/iph0;->H:La/bby;

    .line 1973
    .line 1974
    if-eqz v2, :cond_34

    .line 1975
    .line 1976
    invoke-interface {v2}, La/bby;->isActive()Z

    .line 1977
    .line 1978
    .line 1979
    move-result v2

    .line 1980
    if-ne v2, v5, :cond_34

    .line 1981
    .line 1982
    goto/16 :goto_18

    .line 1983
    .line 1984
    :cond_34
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1985
    .line 1986
    .line 1987
    move-result-object v12

    .line 1988
    new-instance v24, La/jjh0;

    .line 1989
    .line 1990
    const/16 v30, 0x0

    .line 1991
    .line 1992
    const/16 v31, 0xc

    .line 1993
    .line 1994
    const/16 v25, 0x1

    .line 1995
    .line 1996
    const-class v27, La/iph0;

    .line 1997
    .line 1998
    const-string v28, "onLoadingError"

    .line 1999
    .line 2000
    const-string v29, "onLoadingError(Ljava/lang/Throwable;)V"

    .line 2001
    .line 2002
    move-object/from16 v26, v1

    .line 2003
    .line 2004
    invoke-direct/range {v24 .. v31}, La/jjh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2005
    .line 2006
    .line 2007
    iget-object v15, v11, La/mne;->a:La/rwj;

    .line 2008
    .line 2009
    new-instance v2, La/fph0;

    .line 2010
    .line 2011
    const/4 v6, 0x5

    .line 2012
    invoke-direct {v2, v1, v7, v6}, La/fph0;-><init>(La/iph0;La/yje;B)V

    .line 2013
    .line 2014
    .line 2015
    const/16 v17, 0xa

    .line 2016
    .line 2017
    const/4 v14, 0x0

    .line 2018
    move-object/from16 v16, v2

    .line 2019
    .line 2020
    move-object/from16 v13, v24

    .line 2021
    .line 2022
    invoke-static/range {v12 .. v17}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 2023
    .line 2024
    .line 2025
    move-result-object v2

    .line 2026
    iput-object v2, v1, La/iph0;->H:La/bby;

    .line 2027
    .line 2028
    goto/16 :goto_18

    .line 2029
    .line 2030
    :cond_35
    invoke-interface {v0}, La/noh0;->s()Z

    .line 2031
    .line 2032
    .line 2033
    move-result v4

    .line 2034
    if-eqz v4, :cond_36

    .line 2035
    .line 2036
    new-array v2, v3, [Ljava/lang/Object;

    .line 2037
    .line 2038
    const v3, 0x7f131217

    .line 2039
    .line 2040
    .line 2041
    invoke-virtual {v10, v3, v2}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2042
    .line 2043
    .line 2044
    move-result-object v2

    .line 2045
    new-instance v3, La/woh0;

    .line 2046
    .line 2047
    invoke-direct {v3, v8, v2}, La/woh0;-><init>(La/sek0;Ljava/lang/String;)V

    .line 2048
    .line 2049
    .line 2050
    invoke-virtual {v9, v3}, La/ol60;->f(Ljava/lang/Object;)V

    .line 2051
    .line 2052
    .line 2053
    goto/16 :goto_18

    .line 2054
    .line 2055
    :cond_36
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2056
    .line 2057
    .line 2058
    move-result-object v4

    .line 2059
    iget-object v5, v1, La/iph0;->z:La/qgd;

    .line 2060
    .line 2061
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2062
    .line 2063
    .line 2064
    new-instance v5, Lorg/xplatform/security/impl/presentation/secret_question/screens/SecretQuestionScreen;

    .line 2065
    .line 2066
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 2067
    .line 2068
    .line 2069
    instance-of v6, v5, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 2070
    .line 2071
    if-eqz v6, :cond_37

    .line 2072
    .line 2073
    new-instance v6, La/e1w0;

    .line 2074
    .line 2075
    check-cast v5, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 2076
    .line 2077
    invoke-direct {v6, v5}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 2078
    .line 2079
    .line 2080
    new-instance v5, La/c8d;

    .line 2081
    .line 2082
    sget-object v7, La/y7d;->a:La/v7d;

    .line 2083
    .line 2084
    invoke-direct {v5, v7, v6}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 2085
    .line 2086
    .line 2087
    invoke-virtual {v4, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 2088
    .line 2089
    .line 2090
    goto :goto_16

    .line 2091
    :cond_37
    new-instance v6, La/w0w0;

    .line 2092
    .line 2093
    invoke-direct {v6, v5}, La/w0w0;-><init>(La/m7h0;)V

    .line 2094
    .line 2095
    .line 2096
    new-instance v5, La/c8d;

    .line 2097
    .line 2098
    sget-object v7, La/y7d;->a:La/v7d;

    .line 2099
    .line 2100
    invoke-direct {v5, v7, v6}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 2101
    .line 2102
    .line 2103
    invoke-virtual {v4, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 2104
    .line 2105
    .line 2106
    :goto_16
    invoke-static {v2, v4, v3}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 2107
    .line 2108
    .line 2109
    move-result-object v3

    .line 2110
    :goto_17
    move-object v4, v3

    .line 2111
    check-cast v4, La/paw;

    .line 2112
    .line 2113
    invoke-virtual {v4}, La/paw;->hasNext()Z

    .line 2114
    .line 2115
    .line 2116
    move-result v5

    .line 2117
    if-eqz v5, :cond_3d

    .line 2118
    .line 2119
    invoke-virtual {v4}, La/paw;->next()Ljava/lang/Object;

    .line 2120
    .line 2121
    .line 2122
    move-result-object v4

    .line 2123
    check-cast v4, La/oe50;

    .line 2124
    .line 2125
    invoke-virtual {v2, v4}, La/i1w0;->a(La/oe50;)V

    .line 2126
    .line 2127
    .line 2128
    goto :goto_17

    .line 2129
    :cond_38
    iget-object v2, v1, La/iph0;->H:La/bby;

    .line 2130
    .line 2131
    if-eqz v2, :cond_39

    .line 2132
    .line 2133
    invoke-interface {v2}, La/bby;->isActive()Z

    .line 2134
    .line 2135
    .line 2136
    move-result v2

    .line 2137
    if-ne v2, v5, :cond_39

    .line 2138
    .line 2139
    goto/16 :goto_18

    .line 2140
    .line 2141
    :cond_39
    invoke-virtual {v4}, La/zg;->f()V

    .line 2142
    .line 2143
    .line 2144
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2145
    .line 2146
    .line 2147
    move-result-object v12

    .line 2148
    new-instance v24, La/jjh0;

    .line 2149
    .line 2150
    const/16 v30, 0x0

    .line 2151
    .line 2152
    const/16 v31, 0x8

    .line 2153
    .line 2154
    const/16 v25, 0x1

    .line 2155
    .line 2156
    const-class v27, La/iph0;

    .line 2157
    .line 2158
    const-string v28, "onLoadingError"

    .line 2159
    .line 2160
    const-string v29, "onLoadingError(Ljava/lang/Throwable;)V"

    .line 2161
    .line 2162
    move-object/from16 v26, v1

    .line 2163
    .line 2164
    invoke-direct/range {v24 .. v31}, La/jjh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2165
    .line 2166
    .line 2167
    iget-object v15, v11, La/mne;->a:La/rwj;

    .line 2168
    .line 2169
    new-instance v2, La/fph0;

    .line 2170
    .line 2171
    invoke-direct {v2, v1, v7, v6}, La/fph0;-><init>(La/iph0;La/yje;B)V

    .line 2172
    .line 2173
    .line 2174
    const/16 v17, 0xa

    .line 2175
    .line 2176
    const/4 v14, 0x0

    .line 2177
    move-object/from16 v16, v2

    .line 2178
    .line 2179
    move-object/from16 v13, v24

    .line 2180
    .line 2181
    invoke-static/range {v12 .. v17}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 2182
    .line 2183
    .line 2184
    move-result-object v2

    .line 2185
    iput-object v2, v1, La/iph0;->H:La/bby;

    .line 2186
    .line 2187
    goto :goto_18

    .line 2188
    :cond_3a
    invoke-interface {v0}, La/noh0;->s()Z

    .line 2189
    .line 2190
    .line 2191
    move-result v2

    .line 2192
    iget-object v4, v1, La/iph0;->H:La/bby;

    .line 2193
    .line 2194
    if-eqz v4, :cond_3b

    .line 2195
    .line 2196
    invoke-interface {v4}, La/bby;->isActive()Z

    .line 2197
    .line 2198
    .line 2199
    move-result v4

    .line 2200
    if-ne v4, v5, :cond_3b

    .line 2201
    .line 2202
    goto :goto_18

    .line 2203
    :cond_3b
    if-eqz v2, :cond_3c

    .line 2204
    .line 2205
    new-instance v2, La/woh0;

    .line 2206
    .line 2207
    new-array v3, v3, [Ljava/lang/Object;

    .line 2208
    .line 2209
    const v4, 0x7f131213

    .line 2210
    .line 2211
    .line 2212
    invoke-virtual {v10, v4, v3}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2213
    .line 2214
    .line 2215
    move-result-object v3

    .line 2216
    invoke-direct {v2, v8, v3}, La/woh0;-><init>(La/sek0;Ljava/lang/String;)V

    .line 2217
    .line 2218
    .line 2219
    invoke-virtual {v9, v2}, La/ol60;->f(Ljava/lang/Object;)V

    .line 2220
    .line 2221
    .line 2222
    goto :goto_18

    .line 2223
    :cond_3c
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2224
    .line 2225
    .line 2226
    move-result-object v10

    .line 2227
    new-instance v24, La/jjh0;

    .line 2228
    .line 2229
    const/16 v30, 0x0

    .line 2230
    .line 2231
    const/16 v31, 0x9

    .line 2232
    .line 2233
    const/16 v25, 0x1

    .line 2234
    .line 2235
    const-class v27, La/iph0;

    .line 2236
    .line 2237
    const-string v28, "onLoadingError"

    .line 2238
    .line 2239
    const-string v29, "onLoadingError(Ljava/lang/Throwable;)V"

    .line 2240
    .line 2241
    move-object/from16 v26, v1

    .line 2242
    .line 2243
    invoke-direct/range {v24 .. v31}, La/jjh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2244
    .line 2245
    .line 2246
    iget-object v2, v11, La/mne;->a:La/rwj;

    .line 2247
    .line 2248
    new-instance v14, La/fph0;

    .line 2249
    .line 2250
    invoke-direct {v14, v1, v7, v13}, La/fph0;-><init>(La/iph0;La/yje;B)V

    .line 2251
    .line 2252
    .line 2253
    const/16 v15, 0xa

    .line 2254
    .line 2255
    const/4 v12, 0x0

    .line 2256
    move-object v13, v2

    .line 2257
    move-object/from16 v11, v24

    .line 2258
    .line 2259
    invoke-static/range {v10 .. v15}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 2260
    .line 2261
    .line 2262
    move-result-object v2

    .line 2263
    iput-object v2, v1, La/iph0;->H:La/bby;

    .line 2264
    .line 2265
    :cond_3d
    :goto_18
    iget-object v1, v1, La/iph0;->l:La/vd1;

    .line 2266
    .line 2267
    invoke-interface {v0}, La/noh0;->t()La/ssh0;

    .line 2268
    .line 2269
    .line 2270
    move-result-object v0

    .line 2271
    invoke-static {v0}, La/w9x;->F(La/ssh0;)Ljava/lang/String;

    .line 2272
    .line 2273
    .line 2274
    move-result-object v0

    .line 2275
    invoke-virtual {v1, v0}, La/vd1;->f(Ljava/lang/String;)V

    .line 2276
    .line 2277
    .line 2278
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2279
    .line 2280
    :goto_19
    return-object v7

    .line 2281
    :pswitch_f
    check-cast v4, La/slh0;

    .line 2282
    .line 2283
    move-object v0, v1

    .line 2284
    check-cast v0, Lorg/xplatform/security/api/domain/models/SecretQuestionModel;

    .line 2285
    .line 2286
    sget-object v1, La/slh0;->O1:La/cge0;

    .line 2287
    .line 2288
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2289
    .line 2290
    .line 2291
    invoke-virtual {v4}, La/slh0;->G0()La/k3t0;

    .line 2292
    .line 2293
    .line 2294
    move-result-object v1

    .line 2295
    new-instance v2, La/kkh0;

    .line 2296
    .line 2297
    invoke-direct {v2, v0}, La/kkh0;-><init>(Lorg/xplatform/security/api/domain/models/SecretQuestionModel;)V

    .line 2298
    .line 2299
    .line 2300
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2301
    .line 2302
    .line 2303
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2304
    .line 2305
    return-object v0

    .line 2306
    :pswitch_10
    check-cast v4, La/xkh0;

    .line 2307
    .line 2308
    move-object v0, v1

    .line 2309
    check-cast v0, La/dlh0;

    .line 2310
    .line 2311
    sget-object v1, La/xkh0;->n2:La/gne0;

    .line 2312
    .line 2313
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2314
    .line 2315
    .line 2316
    instance-of v1, v0, La/clh0;

    .line 2317
    .line 2318
    if-eqz v1, :cond_3e

    .line 2319
    .line 2320
    check-cast v0, La/clh0;

    .line 2321
    .line 2322
    iget-object v0, v0, La/clh0;->a:Lorg/xplatform/security/api/domain/models/SecretQuestionModel;

    .line 2323
    .line 2324
    iget-object v1, v4, La/xkh0;->m2:La/khf0;

    .line 2325
    .line 2326
    sget-object v2, La/xkh0;->o2:[La/iiy;

    .line 2327
    .line 2328
    aget-object v2, v2, v3

    .line 2329
    .line 2330
    invoke-virtual {v1, v4, v2}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 2331
    .line 2332
    .line 2333
    move-result-object v1

    .line 2334
    check-cast v1, Lorg/xplatform/security/impl/presentation/secret_question_choice/params/SecretQuestionChoiceScreenParams;

    .line 2335
    .line 2336
    iget-object v1, v1, Lorg/xplatform/security/impl/presentation/secret_question_choice/params/SecretQuestionChoiceScreenParams;->a:Ljava/lang/String;

    .line 2337
    .line 2338
    new-instance v2, Lkotlin/Pair;

    .line 2339
    .line 2340
    invoke-direct {v2, v1, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2341
    .line 2342
    .line 2343
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 2344
    .line 2345
    .line 2346
    move-result-object v0

    .line 2347
    invoke-static {v0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 2348
    .line 2349
    .line 2350
    move-result-object v0

    .line 2351
    invoke-static {v0, v4, v1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 2352
    .line 2353
    .line 2354
    invoke-virtual {v4}, La/yo8;->y0()V

    .line 2355
    .line 2356
    .line 2357
    goto :goto_1a

    .line 2358
    :cond_3e
    instance-of v0, v0, La/blh0;

    .line 2359
    .line 2360
    if-eqz v0, :cond_3f

    .line 2361
    .line 2362
    invoke-virtual {v4}, La/yo8;->y0()V

    .line 2363
    .line 2364
    .line 2365
    :goto_1a
    invoke-virtual {v4}, La/xkh0;->P0()La/k3t0;

    .line 2366
    .line 2367
    .line 2368
    move-result-object v0

    .line 2369
    sget-object v1, La/qkh0;->a:La/qkh0;

    .line 2370
    .line 2371
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2372
    .line 2373
    .line 2374
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2375
    .line 2376
    goto :goto_1b

    .line 2377
    :cond_3f
    invoke-static {}, La/t9f;->b()V

    .line 2378
    .line 2379
    .line 2380
    :goto_1b
    return-object v7

    .line 2381
    :pswitch_11
    check-cast v4, La/mjh0;

    .line 2382
    .line 2383
    move-object v0, v1

    .line 2384
    check-cast v0, Ljava/lang/Throwable;

    .line 2385
    .line 2386
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2387
    .line 2388
    .line 2389
    iget-object v1, v4, La/mjh0;->q:La/duj;

    .line 2390
    .line 2391
    new-instance v2, La/x0h0;

    .line 2392
    .line 2393
    const/16 v3, 0xe

    .line 2394
    .line 2395
    invoke-direct {v2, v3}, La/x0h0;-><init>(B)V

    .line 2396
    .line 2397
    .line 2398
    invoke-virtual {v1, v0, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 2399
    .line 2400
    .line 2401
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2402
    .line 2403
    return-object v0

    .line 2404
    :pswitch_12
    check-cast v4, La/ljh0;

    .line 2405
    .line 2406
    move-object v0, v1

    .line 2407
    check-cast v0, La/hcz;

    .line 2408
    .line 2409
    sget-object v1, La/ljh0;->m2:La/lme0;

    .line 2410
    .line 2411
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2412
    .line 2413
    .line 2414
    iget-object v1, v4, La/ljh0;->k2:La/es;

    .line 2415
    .line 2416
    sget-object v2, La/ljh0;->n2:[La/iiy;

    .line 2417
    .line 2418
    aget-object v2, v2, v3

    .line 2419
    .line 2420
    invoke-virtual {v1, v4, v2}, La/es;->j(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/util/List;

    .line 2421
    .line 2422
    .line 2423
    move-result-object v1

    .line 2424
    new-instance v2, La/x0h0;

    .line 2425
    .line 2426
    const/16 v3, 0xd

    .line 2427
    .line 2428
    invoke-direct {v2, v3}, La/x0h0;-><init>(B)V

    .line 2429
    .line 2430
    .line 2431
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 2432
    .line 2433
    .line 2434
    move-result v3

    .line 2435
    new-instance v6, La/pwe0;

    .line 2436
    .line 2437
    const/16 v7, 0xe

    .line 2438
    .line 2439
    invoke-direct {v6, v2, v1, v7}, La/pwe0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2440
    .line 2441
    .line 2442
    new-instance v2, La/d1c0;

    .line 2443
    .line 2444
    const/16 v7, 0x12

    .line 2445
    .line 2446
    invoke-direct {v2, v1, v7}, La/d1c0;-><init>(Ljava/util/List;B)V

    .line 2447
    .line 2448
    .line 2449
    new-instance v7, La/xe4;

    .line 2450
    .line 2451
    const/16 v8, 0x10

    .line 2452
    .line 2453
    invoke-direct {v7, v1, v4, v8}, La/xe4;-><init>(Ljava/util/List;Ljava/lang/Object;B)V

    .line 2454
    .line 2455
    .line 2456
    new-instance v1, La/ugd;

    .line 2457
    .line 2458
    const v4, 0x799532c4

    .line 2459
    .line 2460
    .line 2461
    invoke-direct {v1, v4, v5, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2462
    .line 2463
    .line 2464
    invoke-virtual {v0, v3, v6, v2, v1}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 2465
    .line 2466
    .line 2467
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2468
    .line 2469
    return-object v0

    .line 2470
    :pswitch_13
    check-cast v4, La/sch0;

    .line 2471
    .line 2472
    move-object v0, v1

    .line 2473
    check-cast v0, La/ne60;

    .line 2474
    .line 2475
    iget-object v1, v4, La/sch0;->k:La/qah0;

    .line 2476
    .line 2477
    iget-wide v2, v0, La/ne60;->a:J

    .line 2478
    .line 2479
    iget-byte v0, v4, La/sch0;->j:B

    .line 2480
    .line 2481
    invoke-virtual {v4, v1, v2, v3, v0}, La/sch0;->d(La/qah0;JI)J

    .line 2482
    .line 2483
    .line 2484
    move-result-wide v0

    .line 2485
    new-instance v2, La/ne60;

    .line 2486
    .line 2487
    invoke-direct {v2, v0, v1}, La/ne60;-><init>(J)V

    .line 2488
    .line 2489
    .line 2490
    return-object v2

    .line 2491
    :pswitch_14
    check-cast v4, La/nbh0;

    .line 2492
    .line 2493
    move-object v5, v1

    .line 2494
    check-cast v5, La/fhl;

    .line 2495
    .line 2496
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2497
    .line 2498
    .line 2499
    iget-wide v6, v4, La/nbh0;->b:J

    .line 2500
    .line 2501
    invoke-interface {v5}, La/fhl;->d()J

    .line 2502
    .line 2503
    .line 2504
    move-result-wide v10

    .line 2505
    const/4 v0, 0x0

    .line 2506
    invoke-interface {v5, v0}, La/w6k;->w0(F)F

    .line 2507
    .line 2508
    .line 2509
    move-result v0

    .line 2510
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 2511
    .line 2512
    .line 2513
    move-result v1

    .line 2514
    int-to-long v1, v1

    .line 2515
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 2516
    .line 2517
    .line 2518
    move-result v0

    .line 2519
    int-to-long v3, v0

    .line 2520
    shl-long v0, v1, v18

    .line 2521
    .line 2522
    and-long v2, v3, v16

    .line 2523
    .line 2524
    or-long v12, v0, v2

    .line 2525
    .line 2526
    const/4 v14, 0x0

    .line 2527
    const/16 v15, 0xf2

    .line 2528
    .line 2529
    const-wide/16 v8, 0x0

    .line 2530
    .line 2531
    invoke-static/range {v5 .. v15}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 2532
    .line 2533
    .line 2534
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2535
    .line 2536
    return-object v0

    .line 2537
    :pswitch_15
    check-cast v4, La/mbh0;

    .line 2538
    .line 2539
    move-object v5, v1

    .line 2540
    check-cast v5, La/fhl;

    .line 2541
    .line 2542
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2543
    .line 2544
    .line 2545
    iget-wide v6, v4, La/mbh0;->b:J

    .line 2546
    .line 2547
    invoke-interface {v5}, La/fhl;->d()J

    .line 2548
    .line 2549
    .line 2550
    move-result-wide v10

    .line 2551
    const/4 v0, 0x0

    .line 2552
    invoke-interface {v5, v0}, La/w6k;->w0(F)F

    .line 2553
    .line 2554
    .line 2555
    move-result v0

    .line 2556
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 2557
    .line 2558
    .line 2559
    move-result v1

    .line 2560
    int-to-long v1, v1

    .line 2561
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 2562
    .line 2563
    .line 2564
    move-result v0

    .line 2565
    int-to-long v3, v0

    .line 2566
    shl-long v0, v1, v18

    .line 2567
    .line 2568
    and-long v2, v3, v16

    .line 2569
    .line 2570
    or-long v12, v0, v2

    .line 2571
    .line 2572
    const/4 v14, 0x0

    .line 2573
    const/16 v15, 0xf2

    .line 2574
    .line 2575
    const-wide/16 v8, 0x0

    .line 2576
    .line 2577
    invoke-static/range {v5 .. v15}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 2578
    .line 2579
    .line 2580
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2581
    .line 2582
    return-object v0

    .line 2583
    :pswitch_16
    check-cast v4, La/rah0;

    .line 2584
    .line 2585
    move-object v0, v1

    .line 2586
    check-cast v0, Ljava/lang/Float;

    .line 2587
    .line 2588
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 2589
    .line 2590
    .line 2591
    move-result v0

    .line 2592
    iget-object v1, v4, La/rah0;->a:La/cgk0;

    .line 2593
    .line 2594
    invoke-virtual {v1}, La/cgk0;->l()I

    .line 2595
    .line 2596
    .line 2597
    move-result v2

    .line 2598
    int-to-float v2, v2

    .line 2599
    add-float/2addr v2, v0

    .line 2600
    iget v6, v4, La/rah0;->g:F

    .line 2601
    .line 2602
    add-float/2addr v2, v6

    .line 2603
    iget-object v6, v4, La/rah0;->f:La/cgk0;

    .line 2604
    .line 2605
    invoke-virtual {v6}, La/cgk0;->l()I

    .line 2606
    .line 2607
    .line 2608
    move-result v6

    .line 2609
    int-to-float v6, v6

    .line 2610
    const/4 v7, 0x0

    .line 2611
    invoke-static {v2, v7, v6}, La/l1e0;->c(FFF)F

    .line 2612
    .line 2613
    .line 2614
    move-result v6

    .line 2615
    cmpg-float v2, v2, v6

    .line 2616
    .line 2617
    if-nez v2, :cond_40

    .line 2618
    .line 2619
    goto :goto_1c

    .line 2620
    :cond_40
    move v5, v3

    .line 2621
    :goto_1c
    invoke-virtual {v1}, La/cgk0;->l()I

    .line 2622
    .line 2623
    .line 2624
    move-result v2

    .line 2625
    int-to-float v2, v2

    .line 2626
    sub-float/2addr v6, v2

    .line 2627
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    .line 2628
    .line 2629
    .line 2630
    move-result v2

    .line 2631
    invoke-virtual {v1}, La/cgk0;->l()I

    .line 2632
    .line 2633
    .line 2634
    move-result v3

    .line 2635
    add-int/2addr v3, v2

    .line 2636
    invoke-virtual {v1, v3}, La/cgk0;->m(I)V

    .line 2637
    .line 2638
    .line 2639
    int-to-float v1, v2

    .line 2640
    sub-float v1, v6, v1

    .line 2641
    .line 2642
    iput v1, v4, La/rah0;->g:F

    .line 2643
    .line 2644
    if-nez v5, :cond_41

    .line 2645
    .line 2646
    move v0, v6

    .line 2647
    :cond_41
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 2648
    .line 2649
    .line 2650
    move-result-object v0

    .line 2651
    return-object v0

    .line 2652
    :pswitch_17
    check-cast v4, La/w6h0;

    .line 2653
    .line 2654
    move-object v0, v1

    .line 2655
    check-cast v0, Ljava/lang/Throwable;

    .line 2656
    .line 2657
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2658
    .line 2659
    .line 2660
    invoke-virtual {v4, v0}, La/w6h0;->w(Ljava/lang/Throwable;)V

    .line 2661
    .line 2662
    .line 2663
    new-instance v0, La/q6h0;

    .line 2664
    .line 2665
    invoke-direct {v0, v3}, La/q6h0;-><init>(Z)V

    .line 2666
    .line 2667
    .line 2668
    invoke-virtual {v4, v0}, La/w6h0;->x(La/r6h0;)V

    .line 2669
    .line 2670
    .line 2671
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2672
    .line 2673
    return-object v0

    .line 2674
    :pswitch_18
    check-cast v4, La/fos;

    .line 2675
    .line 2676
    move-object v0, v1

    .line 2677
    check-cast v0, La/hcz;

    .line 2678
    .line 2679
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2680
    .line 2681
    .line 2682
    iget-object v1, v4, La/fos;->e:Ljava/util/ArrayList;

    .line 2683
    .line 2684
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 2685
    .line 2686
    .line 2687
    move-result v2

    .line 2688
    new-instance v4, La/j13;

    .line 2689
    .line 2690
    const/16 v6, 0x1b

    .line 2691
    .line 2692
    invoke-direct {v4, v1, v6, v3}, La/j13;-><init>(Ljava/util/ArrayList;BZ)V

    .line 2693
    .line 2694
    .line 2695
    new-instance v3, La/wyl0;

    .line 2696
    .line 2697
    invoke-direct {v3, v1, v5}, La/wyl0;-><init>(Ljava/lang/Object;B)V

    .line 2698
    .line 2699
    .line 2700
    new-instance v1, La/ugd;

    .line 2701
    .line 2702
    const v6, 0x2fd4df92

    .line 2703
    .line 2704
    .line 2705
    invoke-direct {v1, v6, v5, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2706
    .line 2707
    .line 2708
    invoke-virtual {v0, v2, v7, v4, v1}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 2709
    .line 2710
    .line 2711
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2712
    .line 2713
    return-object v0

    .line 2714
    :pswitch_19
    check-cast v4, La/ngk0;

    .line 2715
    .line 2716
    invoke-virtual {v4, v1}, La/ngk0;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2717
    .line 2718
    .line 2719
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2720
    .line 2721
    return-object v0

    .line 2722
    :pswitch_1a
    check-cast v4, La/bzg0;

    .line 2723
    .line 2724
    invoke-interface {v4, v1}, La/bzg0;->c(Ljava/lang/Object;)V

    .line 2725
    .line 2726
    .line 2727
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2728
    .line 2729
    return-object v0

    .line 2730
    :pswitch_1b
    check-cast v4, La/czg0;

    .line 2731
    .line 2732
    iget-object v0, v4, La/czg0;->c:La/fzg0;

    .line 2733
    .line 2734
    if-eqz v0, :cond_42

    .line 2735
    .line 2736
    invoke-interface {v0, v1}, La/fzg0;->d(Ljava/lang/Object;)Z

    .line 2737
    .line 2738
    .line 2739
    move-result v5

    .line 2740
    :cond_42
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2741
    .line 2742
    .line 2743
    move-result-object v0

    .line 2744
    return-object v0

    .line 2745
    :pswitch_1c
    check-cast v4, La/cxg0;

    .line 2746
    .line 2747
    move-object v0, v1

    .line 2748
    check-cast v0, Ljava/lang/Throwable;

    .line 2749
    .line 2750
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2751
    .line 2752
    .line 2753
    invoke-virtual {v4, v3}, La/cxg0;->F(Z)V

    .line 2754
    .line 2755
    .line 2756
    instance-of v1, v0, La/zhi0;

    .line 2757
    .line 2758
    if-eqz v1, :cond_43

    .line 2759
    .line 2760
    iget-object v1, v4, La/cxg0;->i:La/duj;

    .line 2761
    .line 2762
    new-instance v2, La/cwg0;

    .line 2763
    .line 2764
    invoke-direct {v2, v4, v5}, La/cwg0;-><init>(La/cxg0;B)V

    .line 2765
    .line 2766
    .line 2767
    invoke-virtual {v1, v0, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 2768
    .line 2769
    .line 2770
    iget-object v0, v4, La/cxg0;->h:La/i1w0;

    .line 2771
    .line 2772
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2773
    .line 2774
    .line 2775
    move-result-object v1

    .line 2776
    new-instance v2, La/c8d;

    .line 2777
    .line 2778
    sget-object v4, La/y7d;->a:La/v7d;

    .line 2779
    .line 2780
    sget-object v5, La/p0w0;->a:La/p0w0;

    .line 2781
    .line 2782
    invoke-direct {v2, v4, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 2783
    .line 2784
    .line 2785
    invoke-static {v1, v2, v0, v1, v3}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 2786
    .line 2787
    .line 2788
    move-result-object v1

    .line 2789
    :goto_1d
    move-object v2, v1

    .line 2790
    check-cast v2, La/paw;

    .line 2791
    .line 2792
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 2793
    .line 2794
    .line 2795
    move-result v3

    .line 2796
    if-eqz v3, :cond_44

    .line 2797
    .line 2798
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 2799
    .line 2800
    .line 2801
    move-result-object v2

    .line 2802
    check-cast v2, La/oe50;

    .line 2803
    .line 2804
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 2805
    .line 2806
    .line 2807
    goto :goto_1d

    .line 2808
    :cond_43
    invoke-virtual {v4, v0}, La/cxg0;->y(Ljava/lang/Throwable;)V

    .line 2809
    .line 2810
    .line 2811
    :cond_44
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2812
    .line 2813
    return-object v0

    .line 2814
    nop

    .line 2815
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
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
