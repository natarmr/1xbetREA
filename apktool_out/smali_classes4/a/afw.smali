.class public final synthetic La/afw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/bfw;


# direct methods
.method public synthetic constructor <init>(La/bfw;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/afw;->a:B

    iput-object p1, p0, La/afw;->b:La/bfw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/afw;->a:B

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/16 v4, 0xa

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x1

    .line 12
    iget-object v0, v0, La/afw;->b:La/bfw;

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object/from16 v1, p1

    .line 18
    .line 19
    check-cast v1, La/lew;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v7, v1, La/lew;->d:Ljava/util/Map;

    .line 25
    .line 26
    iget-object v8, v0, La/bfw;->d:La/n0o0;

    .line 27
    .line 28
    invoke-virtual {v8}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v9

    .line 32
    check-cast v9, La/fee;

    .line 33
    .line 34
    invoke-virtual {v9}, La/fee;->c()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v9

    .line 38
    invoke-interface {v7, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    if-nez v7, :cond_0

    .line 43
    .line 44
    sget-object v7, La/j0g0;->b:La/e0g0;

    .line 45
    .line 46
    invoke-static {}, La/uzb;->X()La/m9s;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    invoke-static {}, La/uzb;->X()La/m9s;

    .line 51
    .line 52
    .line 53
    move-result-object v9

    .line 54
    new-instance v10, La/edw;

    .line 55
    .line 56
    invoke-direct {v10, v9, v7}, La/edw;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    move-object v7, v10

    .line 60
    :cond_0
    check-cast v7, La/edw;

    .line 61
    .line 62
    iget-object v1, v1, La/lew;->b:La/tew;

    .line 63
    .line 64
    invoke-virtual {v8}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    check-cast v8, La/fee;

    .line 69
    .line 70
    invoke-virtual {v8}, La/fee;->c()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    check-cast v8, Ljava/lang/Number;

    .line 75
    .line 76
    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    .line 77
    .line 78
    .line 79
    move-result-wide v8

    .line 80
    iget-object v0, v0, La/bfw;->c:La/ctf0;

    .line 81
    .line 82
    iget-object v10, v7, La/edw;->a:Ljava/lang/Object;

    .line 83
    .line 84
    sget-object v11, La/j0g0;->b:La/e0g0;

    .line 85
    .line 86
    instance-of v11, v10, La/g0g0;

    .line 87
    .line 88
    if-eqz v11, :cond_1

    .line 89
    .line 90
    move-object v10, v5

    .line 91
    :cond_1
    check-cast v10, La/m9s;

    .line 92
    .line 93
    iget-object v7, v7, La/edw;->b:Ljava/lang/Object;

    .line 94
    .line 95
    instance-of v11, v7, La/g0g0;

    .line 96
    .line 97
    if-eqz v11, :cond_2

    .line 98
    .line 99
    move-object v7, v5

    .line 100
    :cond_2
    check-cast v7, La/m9s;

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    iget-object v1, v1, La/tew;->a:La/j0g0;

    .line 106
    .line 107
    if-eqz v1, :cond_6

    .line 108
    .line 109
    iget-object v1, v1, La/j0g0;->a:Ljava/lang/Object;

    .line 110
    .line 111
    instance-of v11, v1, La/g0g0;

    .line 112
    .line 113
    if-eqz v11, :cond_3

    .line 114
    .line 115
    move-object v1, v5

    .line 116
    :cond_3
    check-cast v1, La/new;

    .line 117
    .line 118
    if-eqz v1, :cond_6

    .line 119
    .line 120
    iget-object v1, v1, La/new;->b:Ljava/util/List;

    .line 121
    .line 122
    if-eqz v1, :cond_6

    .line 123
    .line 124
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v11

    .line 132
    if-eqz v11, :cond_5

    .line 133
    .line 134
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v11

    .line 138
    move-object v12, v11

    .line 139
    check-cast v12, La/vcw;

    .line 140
    .line 141
    iget-wide v12, v12, La/vcw;->a:J

    .line 142
    .line 143
    cmp-long v12, v12, v8

    .line 144
    .line 145
    if-nez v12, :cond_4

    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_5
    move-object v11, v5

    .line 149
    :goto_0
    check-cast v11, La/vcw;

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_6
    move-object v11, v5

    .line 153
    :goto_1
    if-eqz v11, :cond_7

    .line 154
    .line 155
    iget-object v1, v11, La/vcw;->c:Ljava/util/List;

    .line 156
    .line 157
    if-eqz v1, :cond_7

    .line 158
    .line 159
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    check-cast v1, La/jdw;

    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_7
    move-object v1, v5

    .line 167
    :goto_2
    if-eqz v1, :cond_9

    .line 168
    .line 169
    iget-object v8, v1, La/jdw;->g:Ljava/util/List;

    .line 170
    .line 171
    if-eqz v8, :cond_9

    .line 172
    .line 173
    new-instance v9, Ljava/util/ArrayList;

    .line 174
    .line 175
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 176
    .line 177
    .line 178
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 179
    .line 180
    .line 181
    move-result-object v8

    .line 182
    :cond_8
    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 183
    .line 184
    .line 185
    move-result v11

    .line 186
    if-eqz v11, :cond_a

    .line 187
    .line 188
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v11

    .line 192
    move-object v12, v11

    .line 193
    check-cast v12, La/odw;

    .line 194
    .line 195
    iget-object v12, v12, La/odw;->b:Ljava/lang/String;

    .line 196
    .line 197
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 198
    .line 199
    .line 200
    move-result v12

    .line 201
    if-lez v12, :cond_8

    .line 202
    .line 203
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    goto :goto_3

    .line 207
    :cond_9
    sget-object v9, La/iun;->a:La/iun;

    .line 208
    .line 209
    :cond_a
    const-wide/16 v11, 0x0

    .line 210
    .line 211
    if-eqz v1, :cond_b

    .line 212
    .line 213
    iget-wide v13, v1, La/jdw;->a:J

    .line 214
    .line 215
    goto :goto_4

    .line 216
    :cond_b
    move-wide v13, v11

    .line 217
    :goto_4
    invoke-static {v13, v14}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v16

    .line 221
    if-eqz v1, :cond_c

    .line 222
    .line 223
    iget-wide v11, v1, La/jdw;->a:J

    .line 224
    .line 225
    :cond_c
    move-wide/from16 v17, v11

    .line 226
    .line 227
    new-instance v21, La/ljm;

    .line 228
    .line 229
    invoke-direct/range {v21 .. v21}, La/ljm;-><init>()V

    .line 230
    .line 231
    .line 232
    if-eqz v1, :cond_d

    .line 233
    .line 234
    iget-object v8, v1, La/jdw;->b:Ljava/lang/String;

    .line 235
    .line 236
    goto :goto_5

    .line 237
    :cond_d
    move-object v8, v5

    .line 238
    :goto_5
    if-nez v8, :cond_e

    .line 239
    .line 240
    move-object/from16 v20, v2

    .line 241
    .line 242
    goto :goto_6

    .line 243
    :cond_e
    move-object/from16 v20, v8

    .line 244
    .line 245
    :goto_6
    sget-object v8, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 246
    .line 247
    invoke-virtual {v8}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 248
    .line 249
    .line 250
    move-result-wide v11

    .line 251
    new-instance v8, La/n0x;

    .line 252
    .line 253
    if-eqz v1, :cond_f

    .line 254
    .line 255
    iget-object v1, v1, La/jdw;->e:Ljava/lang/String;

    .line 256
    .line 257
    goto :goto_7

    .line 258
    :cond_f
    move-object v1, v5

    .line 259
    :goto_7
    if-nez v1, :cond_10

    .line 260
    .line 261
    goto :goto_8

    .line 262
    :cond_10
    move-object v2, v1

    .line 263
    :goto_8
    invoke-direct {v8, v2}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    new-instance v1, La/ue9;

    .line 267
    .line 268
    new-array v2, v3, [Ljava/lang/Object;

    .line 269
    .line 270
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 271
    .line 272
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    const v3, 0x7f1300e4

    .line 277
    .line 278
    .line 279
    invoke-virtual {v0, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    invoke-direct {v1, v2}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    new-instance v2, La/m0x;

    .line 287
    .line 288
    const v3, 0x7f080a6b

    .line 289
    .line 290
    .line 291
    const/4 v13, 0x6

    .line 292
    invoke-direct {v2, v3, v5, v13}, La/m0x;-><init>(ILa/bzw;I)V

    .line 293
    .line 294
    .line 295
    new-instance v19, La/hjm;

    .line 296
    .line 297
    new-instance v3, La/y3d;

    .line 298
    .line 299
    invoke-direct {v3, v11, v12}, La/y3d;-><init>(J)V

    .line 300
    .line 301
    .line 302
    const/16 v31, 0x0

    .line 303
    .line 304
    const/16 v32, 0x19d0

    .line 305
    .line 306
    const/16 v24, 0x0

    .line 307
    .line 308
    const/16 v26, 0x0

    .line 309
    .line 310
    const/16 v27, 0x0

    .line 311
    .line 312
    const/16 v28, 0x0

    .line 313
    .line 314
    const/16 v29, 0x0

    .line 315
    .line 316
    move-object/from16 v30, v1

    .line 317
    .line 318
    move-object/from16 v25, v2

    .line 319
    .line 320
    move-object/from16 v22, v3

    .line 321
    .line 322
    move-object/from16 v23, v8

    .line 323
    .line 324
    invoke-direct/range {v19 .. v32}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 325
    .line 326
    .line 327
    new-instance v1, Ljava/util/ArrayList;

    .line 328
    .line 329
    invoke-static {v9, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 330
    .line 331
    .line 332
    move-result v2

    .line 333
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 334
    .line 335
    .line 336
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 337
    .line 338
    .line 339
    move-result-object v2

    .line 340
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 341
    .line 342
    .line 343
    move-result v3

    .line 344
    if-eqz v3, :cond_1d

    .line 345
    .line 346
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v3

    .line 350
    check-cast v3, La/odw;

    .line 351
    .line 352
    if-eqz v10, :cond_11

    .line 353
    .line 354
    iget-object v4, v10, La/m9s;->H:Ljava/util/List;

    .line 355
    .line 356
    if-nez v4, :cond_12

    .line 357
    .line 358
    :cond_11
    sget-object v4, La/iun;->a:La/iun;

    .line 359
    .line 360
    :cond_12
    if-eqz v7, :cond_13

    .line 361
    .line 362
    iget-object v8, v7, La/m9s;->H:Ljava/util/List;

    .line 363
    .line 364
    if-nez v8, :cond_14

    .line 365
    .line 366
    :cond_13
    sget-object v8, La/iun;->a:La/iun;

    .line 367
    .line 368
    :cond_14
    iget-wide v11, v3, La/odw;->d:J

    .line 369
    .line 370
    invoke-static {v11, v12, v4}, La/yum0;->e(JLjava/util/List;)La/dao;

    .line 371
    .line 372
    .line 373
    move-result-object v4

    .line 374
    if-nez v4, :cond_15

    .line 375
    .line 376
    iget-wide v11, v3, La/odw;->d:J

    .line 377
    .line 378
    invoke-static {v11, v12, v8}, La/yum0;->e(JLjava/util/List;)La/dao;

    .line 379
    .line 380
    .line 381
    move-result-object v4

    .line 382
    :cond_15
    new-instance v20, La/hdw;

    .line 383
    .line 384
    iget-wide v8, v3, La/odw;->a:J

    .line 385
    .line 386
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v21

    .line 390
    iget-object v8, v3, La/odw;->c:Ljava/lang/String;

    .line 391
    .line 392
    iget-object v9, v3, La/odw;->b:Ljava/lang/String;

    .line 393
    .line 394
    iget v11, v3, La/odw;->e:I

    .line 395
    .line 396
    if-eqz v11, :cond_16

    .line 397
    .line 398
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 399
    .line 400
    .line 401
    move-result-object v4

    .line 402
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v4

    .line 406
    invoke-static {v4, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v4

    .line 410
    const v11, 0x7f13164b

    .line 411
    .line 412
    .line 413
    invoke-virtual {v0, v11, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v4

    .line 417
    new-instance v11, La/id6;

    .line 418
    .line 419
    invoke-direct {v11, v4}, La/id6;-><init>(Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    :goto_a
    move-object/from16 v24, v11

    .line 423
    .line 424
    goto/16 :goto_e

    .line 425
    .line 426
    :cond_16
    if-eqz v4, :cond_1c

    .line 427
    .line 428
    iget-wide v11, v4, La/dao;->d:D

    .line 429
    .line 430
    const-wide/16 v13, 0x0

    .line 431
    .line 432
    cmpg-double v11, v11, v13

    .line 433
    .line 434
    if-nez v11, :cond_17

    .line 435
    .line 436
    iget-object v11, v4, La/dao;->i:Ljava/lang/String;

    .line 437
    .line 438
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 439
    .line 440
    .line 441
    move-result v11

    .line 442
    if-nez v11, :cond_17

    .line 443
    .line 444
    goto :goto_d

    .line 445
    :cond_17
    iget-boolean v11, v4, La/dao;->h:Z

    .line 446
    .line 447
    if-eqz v11, :cond_18

    .line 448
    .line 449
    iget-boolean v11, v4, La/dao;->o:Z

    .line 450
    .line 451
    invoke-static {v4}, La/xkb;->O(La/dao;)Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v12

    .line 455
    iget-boolean v4, v4, La/dao;->p:Z

    .line 456
    .line 457
    new-instance v13, La/fd6;

    .line 458
    .line 459
    invoke-direct {v13, v12, v4, v11}, La/fd6;-><init>(Ljava/lang/String;ZZ)V

    .line 460
    .line 461
    .line 462
    move-object/from16 v24, v13

    .line 463
    .line 464
    goto :goto_e

    .line 465
    :cond_18
    iget-object v11, v4, La/dao;->n:La/cao;

    .line 466
    .line 467
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    .line 468
    .line 469
    .line 470
    move-result v11

    .line 471
    if-eqz v11, :cond_1b

    .line 472
    .line 473
    if-eq v11, v6, :cond_1a

    .line 474
    .line 475
    const/4 v12, 0x2

    .line 476
    if-ne v11, v12, :cond_19

    .line 477
    .line 478
    sget-object v11, La/cd6;->b:La/cd6;

    .line 479
    .line 480
    :goto_b
    move-object/from16 v26, v11

    .line 481
    .line 482
    goto :goto_c

    .line 483
    :cond_19
    invoke-static {}, La/t9f;->b()V

    .line 484
    .line 485
    .line 486
    goto :goto_f

    .line 487
    :cond_1a
    sget-object v11, La/cd6;->c:La/cd6;

    .line 488
    .line 489
    goto :goto_b

    .line 490
    :cond_1b
    sget-object v11, La/cd6;->d:La/cd6;

    .line 491
    .line 492
    goto :goto_b

    .line 493
    :goto_c
    invoke-static {v4}, La/xkb;->O(La/dao;)Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v25

    .line 497
    iget-object v11, v4, La/dao;->m:La/sh7;

    .line 498
    .line 499
    iget-wide v11, v11, La/sh7;->a:J

    .line 500
    .line 501
    iget-boolean v13, v4, La/dao;->o:Z

    .line 502
    .line 503
    iget-boolean v4, v4, La/dao;->p:Z

    .line 504
    .line 505
    new-instance v22, La/hd6;

    .line 506
    .line 507
    move/from16 v24, v4

    .line 508
    .line 509
    move-wide/from16 v27, v11

    .line 510
    .line 511
    move/from16 v23, v13

    .line 512
    .line 513
    invoke-direct/range {v22 .. v28}, La/hd6;-><init>(ZZLjava/lang/String;La/cd6;J)V

    .line 514
    .line 515
    .line 516
    move-object/from16 v24, v22

    .line 517
    .line 518
    goto :goto_e

    .line 519
    :cond_1c
    :goto_d
    new-instance v11, La/ed6;

    .line 520
    .line 521
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 522
    .line 523
    .line 524
    goto :goto_a

    .line 525
    :goto_e
    iget v3, v3, La/odw;->e:I

    .line 526
    .line 527
    move/from16 v25, v3

    .line 528
    .line 529
    move-object/from16 v22, v8

    .line 530
    .line 531
    move-object/from16 v23, v9

    .line 532
    .line 533
    invoke-direct/range {v20 .. v25}, La/hdw;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/jd6;I)V

    .line 534
    .line 535
    .line 536
    move-object/from16 v3, v20

    .line 537
    .line 538
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 539
    .line 540
    .line 541
    goto/16 :goto_9

    .line 542
    .line 543
    :cond_1d
    new-instance v0, La/wpv;

    .line 544
    .line 545
    invoke-direct {v0, v6}, La/wpv;-><init>(B)V

    .line 546
    .line 547
    .line 548
    invoke-static {v1, v0}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 549
    .line 550
    .line 551
    move-result-object v20

    .line 552
    new-instance v15, La/idw;

    .line 553
    .line 554
    invoke-direct/range {v15 .. v20}, La/idw;-><init>(Ljava/lang/String;JLa/hjm;Ljava/util/List;)V

    .line 555
    .line 556
    .line 557
    move-object v5, v15

    .line 558
    :goto_f
    return-object v5

    .line 559
    :pswitch_0
    move-object/from16 v1, p1

    .line 560
    .line 561
    check-cast v1, Ljava/util/List;

    .line 562
    .line 563
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 564
    .line 565
    .line 566
    iget-object v0, v0, La/bfw;->d:La/n0o0;

    .line 567
    .line 568
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    check-cast v0, La/fee;

    .line 573
    .line 574
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    check-cast v0, Ljava/lang/Number;

    .line 579
    .line 580
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 581
    .line 582
    .line 583
    move-result-wide v2

    .line 584
    new-instance v0, Ljava/util/ArrayList;

    .line 585
    .line 586
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 587
    .line 588
    .line 589
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 590
    .line 591
    .line 592
    move-result-object v1

    .line 593
    :cond_1e
    :goto_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 594
    .line 595
    .line 596
    move-result v5

    .line 597
    if-eqz v5, :cond_1f

    .line 598
    .line 599
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v5

    .line 603
    move-object v7, v5

    .line 604
    check-cast v7, La/vcw;

    .line 605
    .line 606
    iget-wide v7, v7, La/vcw;->a:J

    .line 607
    .line 608
    cmp-long v7, v7, v2

    .line 609
    .line 610
    if-nez v7, :cond_1e

    .line 611
    .line 612
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 613
    .line 614
    .line 615
    goto :goto_10

    .line 616
    :cond_1f
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v0

    .line 620
    check-cast v0, La/vcw;

    .line 621
    .line 622
    if-eqz v0, :cond_20

    .line 623
    .line 624
    iget-object v0, v0, La/vcw;->c:Ljava/util/List;

    .line 625
    .line 626
    if-eqz v0, :cond_20

    .line 627
    .line 628
    invoke-static {v0, v6}, Lkotlin/collections/CollectionsKt;->O(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 629
    .line 630
    .line 631
    move-result-object v0

    .line 632
    if-eqz v0, :cond_20

    .line 633
    .line 634
    new-instance v1, Ljava/util/ArrayList;

    .line 635
    .line 636
    invoke-static {v0, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 637
    .line 638
    .line 639
    move-result v2

    .line 640
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 641
    .line 642
    .line 643
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 644
    .line 645
    .line 646
    move-result-object v0

    .line 647
    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 648
    .line 649
    .line 650
    move-result v2

    .line 651
    if-eqz v2, :cond_21

    .line 652
    .line 653
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    move-result-object v2

    .line 657
    check-cast v2, La/jdw;

    .line 658
    .line 659
    new-instance v3, La/fr5;

    .line 660
    .line 661
    iget-wide v4, v2, La/jdw;->a:J

    .line 662
    .line 663
    long-to-int v4, v4

    .line 664
    new-instance v5, La/n0x;

    .line 665
    .line 666
    iget-object v6, v2, La/jdw;->f:Ljava/lang/String;

    .line 667
    .line 668
    invoke-direct {v5, v6}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 669
    .line 670
    .line 671
    iget-object v7, v2, La/jdw;->b:Ljava/lang/String;

    .line 672
    .line 673
    const/4 v9, 0x0

    .line 674
    const/16 v10, 0x54

    .line 675
    .line 676
    const/4 v6, 0x0

    .line 677
    const/4 v8, 0x0

    .line 678
    invoke-direct/range {v3 .. v10}, La/fr5;-><init>(ILa/n0x;La/n0x;Ljava/lang/String;Ljava/lang/String;La/er5;I)V

    .line 679
    .line 680
    .line 681
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 682
    .line 683
    .line 684
    goto :goto_11

    .line 685
    :cond_20
    sget-object v1, La/iun;->a:La/iun;

    .line 686
    .line 687
    :cond_21
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 688
    .line 689
    .line 690
    move-result v0

    .line 691
    if-eqz v0, :cond_22

    .line 692
    .line 693
    sget-object v0, La/iun;->a:La/iun;

    .line 694
    .line 695
    goto :goto_12

    .line 696
    :cond_22
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 697
    .line 698
    .line 699
    move-result-object v0

    .line 700
    new-instance v2, La/t93;

    .line 701
    .line 702
    invoke-static {v1}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 703
    .line 704
    .line 705
    move-result-object v1

    .line 706
    invoke-direct {v2, v1}, La/t93;-><init>(La/i4;)V

    .line 707
    .line 708
    .line 709
    invoke-virtual {v0, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 710
    .line 711
    .line 712
    invoke-static {v0}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    :goto_12
    return-object v0

    .line 717
    :pswitch_1
    move-object/from16 v1, p1

    .line 718
    .line 719
    check-cast v1, Ljava/util/List;

    .line 720
    .line 721
    if-nez v1, :cond_23

    .line 722
    .line 723
    sget-object v1, La/iun;->a:La/iun;

    .line 724
    .line 725
    :cond_23
    iget-object v0, v0, La/bfw;->c:La/ctf0;

    .line 726
    .line 727
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 728
    .line 729
    .line 730
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 731
    .line 732
    .line 733
    new-instance v5, La/hjm;

    .line 734
    .line 735
    new-array v2, v3, [Ljava/lang/Object;

    .line 736
    .line 737
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 738
    .line 739
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 740
    .line 741
    .line 742
    move-result-object v2

    .line 743
    const v3, 0x7f1305fe

    .line 744
    .line 745
    .line 746
    invoke-virtual {v0, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 747
    .line 748
    .line 749
    move-result-object v6

    .line 750
    new-instance v7, La/ljm;

    .line 751
    .line 752
    invoke-direct {v7}, La/ljm;-><init>()V

    .line 753
    .line 754
    .line 755
    const/16 v17, 0x0

    .line 756
    .line 757
    const/16 v18, 0x1ffc

    .line 758
    .line 759
    const/4 v8, 0x0

    .line 760
    const/4 v9, 0x0

    .line 761
    const/4 v10, 0x0

    .line 762
    const/4 v11, 0x0

    .line 763
    const/4 v12, 0x0

    .line 764
    const/4 v13, 0x0

    .line 765
    const/4 v14, 0x0

    .line 766
    const/4 v15, 0x0

    .line 767
    const/16 v16, 0x0

    .line 768
    .line 769
    invoke-direct/range {v5 .. v18}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 770
    .line 771
    .line 772
    new-instance v0, Ljava/util/ArrayList;

    .line 773
    .line 774
    invoke-static {v1, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 775
    .line 776
    .line 777
    move-result v2

    .line 778
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 779
    .line 780
    .line 781
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 782
    .line 783
    .line 784
    move-result-object v1

    .line 785
    :goto_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 786
    .line 787
    .line 788
    move-result v2

    .line 789
    if-eqz v2, :cond_24

    .line 790
    .line 791
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    move-result-object v2

    .line 795
    check-cast v2, La/uog;

    .line 796
    .line 797
    iget v7, v2, La/uog;->a:I

    .line 798
    .line 799
    iget-object v8, v2, La/uog;->b:Ljava/lang/String;

    .line 800
    .line 801
    iget-object v9, v2, La/uog;->d:Ljava/lang/String;

    .line 802
    .line 803
    new-instance v10, La/n0x;

    .line 804
    .line 805
    iget-object v3, v2, La/uog;->l:Ljava/lang/String;

    .line 806
    .line 807
    invoke-direct {v10, v3}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 808
    .line 809
    .line 810
    new-instance v6, La/kzc0;

    .line 811
    .line 812
    const/4 v11, 0x0

    .line 813
    invoke-direct/range {v6 .. v11}, La/kzc0;-><init>(ILjava/lang/String;Ljava/lang/String;La/n0x;La/jzc0;)V

    .line 814
    .line 815
    .line 816
    new-instance v3, La/jfw;

    .line 817
    .line 818
    iget-boolean v4, v2, La/uog;->f:Z

    .line 819
    .line 820
    iget-object v7, v2, La/uog;->g:Ljava/lang/String;

    .line 821
    .line 822
    iget-object v2, v2, La/uog;->h:Ljava/lang/String;

    .line 823
    .line 824
    invoke-direct {v3, v6, v4, v7, v2}, La/jfw;-><init>(La/kzc0;ZLjava/lang/String;Ljava/lang/String;)V

    .line 825
    .line 826
    .line 827
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 828
    .line 829
    .line 830
    goto :goto_13

    .line 831
    :cond_24
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 832
    .line 833
    .line 834
    move-result-object v0

    .line 835
    new-instance v1, La/bew;

    .line 836
    .line 837
    invoke-direct {v1, v5, v0}, La/bew;-><init>(La/hjm;La/a4x;)V

    .line 838
    .line 839
    .line 840
    return-object v1

    .line 841
    :pswitch_2
    move-object/from16 v6, p1

    .line 842
    .line 843
    check-cast v6, La/new;

    .line 844
    .line 845
    iget-object v1, v0, La/bfw;->d:La/n0o0;

    .line 846
    .line 847
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 848
    .line 849
    .line 850
    move-result-object v1

    .line 851
    check-cast v1, La/fee;

    .line 852
    .line 853
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 854
    .line 855
    .line 856
    move-result-object v1

    .line 857
    check-cast v1, Ljava/lang/Number;

    .line 858
    .line 859
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 860
    .line 861
    .line 862
    move-result-wide v7

    .line 863
    if-eqz v6, :cond_25

    .line 864
    .line 865
    iget-object v5, v6, La/new;->a:Ljava/lang/String;

    .line 866
    .line 867
    :cond_25
    if-nez v5, :cond_26

    .line 868
    .line 869
    move-object v9, v2

    .line 870
    goto :goto_14

    .line 871
    :cond_26
    move-object v9, v5

    .line 872
    :goto_14
    iget-boolean v10, v0, La/bfw;->b:Z

    .line 873
    .line 874
    const/4 v11, 0x0

    .line 875
    invoke-static/range {v6 .. v11}, La/yew;->a(La/new;JLjava/lang/String;ZZ)La/xew;

    .line 876
    .line 877
    .line 878
    move-result-object v0

    .line 879
    return-object v0

    .line 880
    nop

    .line 881
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
