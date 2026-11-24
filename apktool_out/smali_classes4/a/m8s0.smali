.class public final synthetic La/m8s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/pz40;La/d930;La/jpu0;)V
    .locals 1

    .line 1
    const/16 v0, 0x9

    iput-byte v0, p0, La/m8s0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/m8s0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/m8s0;->d:Ljava/lang/Object;

    iput-object p3, p0, La/m8s0;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/m8s0;->a:B

    iput-object p1, p0, La/m8s0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/m8s0;->c:Ljava/lang/Object;

    iput-object p3, p0, La/m8s0;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 54

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/m8s0;->a:B

    .line 4
    .line 5
    const/16 v2, 0x11

    .line 6
    .line 7
    const/16 v6, 0x9

    .line 8
    .line 9
    const/4 v7, 0x5

    .line 10
    const/4 v8, 0x4

    .line 11
    const/4 v9, 0x3

    .line 12
    const/4 v10, 0x0

    .line 13
    const/4 v11, 0x0

    .line 14
    const/4 v12, 0x1

    .line 15
    iget-object v13, v0, La/m8s0;->d:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v14, v0, La/m8s0;->c:Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v0, v0, La/m8s0;->b:Ljava/lang/Object;

    .line 20
    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    check-cast v0, La/ctf0;

    .line 25
    .line 26
    check-cast v14, La/bzt;

    .line 27
    .line 28
    check-cast v13, La/pru;

    .line 29
    .line 30
    move-object/from16 v1, p1

    .line 31
    .line 32
    check-cast v1, La/bzv0;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    new-instance v1, La/fgh0;

    .line 38
    .line 39
    iget-object v2, v14, La/bzt;->a:La/fsd;

    .line 40
    .line 41
    invoke-virtual {v2}, La/fsd;->a()La/v8d;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    iget v2, v2, La/v8d;->r:I

    .line 46
    .line 47
    invoke-virtual {v13}, La/pru;->a()La/sff0;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    iget-object v3, v3, La/sff0;->d:La/q1w0;

    .line 52
    .line 53
    iget-object v3, v3, La/q1w0;->a:La/dyv0;

    .line 54
    .line 55
    iget-boolean v3, v3, La/dyv0;->d:Z

    .line 56
    .line 57
    invoke-direct {v1, v0, v2, v3}, La/fgh0;-><init>(La/ctf0;IZ)V

    .line 58
    .line 59
    .line 60
    return-object v1

    .line 61
    :pswitch_0
    check-cast v0, La/lsv0;

    .line 62
    .line 63
    check-cast v14, La/ywv0;

    .line 64
    .line 65
    check-cast v13, Lkotlin/jvm/functions/Function0;

    .line 66
    .line 67
    move-object/from16 v1, p1

    .line 68
    .line 69
    check-cast v1, La/ne60;

    .line 70
    .line 71
    instance-of v1, v0, La/isv0;

    .line 72
    .line 73
    if-eqz v1, :cond_0

    .line 74
    .line 75
    check-cast v0, La/isv0;

    .line 76
    .line 77
    iget-boolean v0, v0, La/isv0;->a:Z

    .line 78
    .line 79
    if-eqz v0, :cond_1

    .line 80
    .line 81
    iget-object v0, v14, La/ywv0;->f:La/mkt0;

    .line 82
    .line 83
    invoke-virtual {v0}, La/mkt0;->b()Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_1

    .line 88
    .line 89
    invoke-interface {v13}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_0
    invoke-interface {v13}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    :cond_1
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    return-object v0

    .line 99
    :pswitch_1
    check-cast v0, La/fuj0;

    .line 100
    .line 101
    check-cast v14, La/tsv0;

    .line 102
    .line 103
    check-cast v13, La/w6k;

    .line 104
    .line 105
    move-object/from16 v1, p1

    .line 106
    .line 107
    check-cast v1, La/bff0;

    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, La/bff0;->b()La/mkx;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    iget v4, v1, La/mkx;->b:I

    .line 117
    .line 118
    invoke-virtual {v1}, La/mkx;->a()I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    add-int v5, v4, v3

    .line 123
    .line 124
    invoke-interface {v13, v3}, La/w6k;->r0(I)F

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    invoke-interface {v13, v4}, La/w6k;->r0(I)F

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    invoke-interface {v13, v5}, La/w6k;->r0(I)F

    .line 133
    .line 134
    .line 135
    move-result v8

    .line 136
    new-instance v2, La/nsv0;

    .line 137
    .line 138
    invoke-direct/range {v2 .. v8}, La/nsv0;-><init>(IIIFFF)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, v14, v2}, La/fuj0;->j(La/tsv0;La/nsv0;)V

    .line 142
    .line 143
    .line 144
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 145
    .line 146
    return-object v0

    .line 147
    :pswitch_2
    check-cast v0, Ljava/lang/String;

    .line 148
    .line 149
    check-cast v14, Ljava/util/List;

    .line 150
    .line 151
    check-cast v13, La/upv0;

    .line 152
    .line 153
    move-object/from16 v1, p1

    .line 154
    .line 155
    check-cast v1, La/qpg0;

    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-interface {v1, v0}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 161
    .line 162
    .line 163
    move-result-object v10

    .line 164
    :try_start_0
    invoke-interface {v14}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    move v14, v12

    .line 169
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result v15

    .line 173
    if-eqz v15, :cond_2

    .line 174
    .line 175
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v15

    .line 179
    check-cast v15, Ljava/lang/String;

    .line 180
    .line 181
    invoke-interface {v10, v14, v15}, La/xpg0;->z(ILjava/lang/String;)V

    .line 182
    .line 183
    .line 184
    add-int/lit8 v14, v14, 0x1

    .line 185
    .line 186
    goto :goto_1

    .line 187
    :catchall_0
    move-exception v0

    .line 188
    goto/16 :goto_a

    .line 189
    .line 190
    :cond_2
    new-instance v0, La/gx3;

    .line 191
    .line 192
    invoke-direct {v0, v11}, La/nuj0;-><init>(I)V

    .line 193
    .line 194
    .line 195
    new-instance v14, La/gx3;

    .line 196
    .line 197
    invoke-direct {v14, v11}, La/nuj0;-><init>(I)V

    .line 198
    .line 199
    .line 200
    :cond_3
    :goto_2
    invoke-interface {v10}, La/xpg0;->W0()Z

    .line 201
    .line 202
    .line 203
    move-result v15

    .line 204
    if-eqz v15, :cond_5

    .line 205
    .line 206
    invoke-interface {v10, v11}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v15

    .line 210
    invoke-virtual {v0, v15}, La/nuj0;->containsKey(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v16

    .line 214
    if-nez v16, :cond_4

    .line 215
    .line 216
    new-instance v3, Ljava/util/ArrayList;

    .line 217
    .line 218
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0, v15, v3}, La/nuj0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    :cond_4
    invoke-interface {v10, v11}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    invoke-virtual {v14, v3}, La/nuj0;->containsKey(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v15

    .line 232
    if-nez v15, :cond_3

    .line 233
    .line 234
    new-instance v15, Ljava/util/ArrayList;

    .line 235
    .line 236
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v14, v3, v15}, La/nuj0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    goto :goto_2

    .line 243
    :cond_5
    invoke-interface {v10}, La/xpg0;->reset()V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v13, v1, v0}, La/upv0;->b(La/qpg0;La/gx3;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v13, v1, v14}, La/upv0;->a(La/qpg0;La/gx3;)V

    .line 250
    .line 251
    .line 252
    new-instance v1, Ljava/util/ArrayList;

    .line 253
    .line 254
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 255
    .line 256
    .line 257
    :goto_3
    invoke-interface {v10}, La/xpg0;->W0()Z

    .line 258
    .line 259
    .line 260
    move-result v3

    .line 261
    if-eqz v3, :cond_a

    .line 262
    .line 263
    invoke-interface {v10, v11}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v18

    .line 267
    invoke-interface {v10, v12}, La/xpg0;->getLong(I)J

    .line 268
    .line 269
    .line 270
    move-result-wide v4

    .line 271
    long-to-int v4, v4

    .line 272
    invoke-static {v4}, La/dqm0;->v(I)La/zov0;

    .line 273
    .line 274
    .line 275
    move-result-object v19

    .line 276
    const/4 v4, 0x2

    .line 277
    invoke-interface {v10, v4}, La/xpg0;->getBlob(I)[B

    .line 278
    .line 279
    .line 280
    move-result-object v4

    .line 281
    sget-object v5, La/maj;->b:La/maj;

    .line 282
    .line 283
    invoke-static {v4}, La/nkb;->B([B)La/maj;

    .line 284
    .line 285
    .line 286
    move-result-object v20

    .line 287
    invoke-interface {v10, v9}, La/xpg0;->getLong(I)J

    .line 288
    .line 289
    .line 290
    move-result-wide v4

    .line 291
    long-to-int v4, v4

    .line 292
    move/from16 v28, v4

    .line 293
    .line 294
    invoke-interface {v10, v8}, La/xpg0;->getLong(I)J

    .line 295
    .line 296
    .line 297
    move-result-wide v3

    .line 298
    long-to-int v4, v3

    .line 299
    const/16 v3, 0xe

    .line 300
    .line 301
    invoke-interface {v10, v3}, La/xpg0;->getLong(I)J

    .line 302
    .line 303
    .line 304
    move-result-wide v21

    .line 305
    const/16 v3, 0xf

    .line 306
    .line 307
    invoke-interface {v10, v3}, La/xpg0;->getLong(I)J

    .line 308
    .line 309
    .line 310
    move-result-wide v23

    .line 311
    const/16 v3, 0x10

    .line 312
    .line 313
    invoke-interface {v10, v3}, La/xpg0;->getLong(I)J

    .line 314
    .line 315
    .line 316
    move-result-wide v25

    .line 317
    invoke-interface {v10, v2}, La/xpg0;->getLong(I)J

    .line 318
    .line 319
    .line 320
    move-result-wide v8

    .line 321
    long-to-int v3, v8

    .line 322
    invoke-static {v3}, La/dqm0;->s(I)La/af5;

    .line 323
    .line 324
    .line 325
    move-result-object v29

    .line 326
    const/16 v3, 0x12

    .line 327
    .line 328
    invoke-interface {v10, v3}, La/xpg0;->getLong(I)J

    .line 329
    .line 330
    .line 331
    move-result-wide v30

    .line 332
    const/16 v3, 0x13

    .line 333
    .line 334
    invoke-interface {v10, v3}, La/xpg0;->getLong(I)J

    .line 335
    .line 336
    .line 337
    move-result-wide v32

    .line 338
    const/16 v3, 0x14

    .line 339
    .line 340
    invoke-interface {v10, v3}, La/xpg0;->getLong(I)J

    .line 341
    .line 342
    .line 343
    move-result-wide v8

    .line 344
    long-to-int v8, v8

    .line 345
    const/16 v3, 0x15

    .line 346
    .line 347
    invoke-interface {v10, v3}, La/xpg0;->getLong(I)J

    .line 348
    .line 349
    .line 350
    move-result-wide v36

    .line 351
    const/16 v3, 0x16

    .line 352
    .line 353
    invoke-interface {v10, v3}, La/xpg0;->getLong(I)J

    .line 354
    .line 355
    .line 356
    move-result-wide v2

    .line 357
    long-to-int v2, v2

    .line 358
    const/16 v3, 0x17

    .line 359
    .line 360
    invoke-interface {v10, v3}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v40

    .line 364
    invoke-interface {v10, v7}, La/xpg0;->getLong(I)J

    .line 365
    .line 366
    .line 367
    move-result-wide v12

    .line 368
    long-to-int v3, v12

    .line 369
    invoke-static {v3}, La/dqm0;->t(I)La/sl50;

    .line 370
    .line 371
    .line 372
    move-result-object v44

    .line 373
    const/4 v3, 0x6

    .line 374
    invoke-interface {v10, v3}, La/xpg0;->getBlob(I)[B

    .line 375
    .line 376
    .line 377
    move-result-object v3

    .line 378
    invoke-static {v3}, La/dqm0;->A([B)La/hl50;

    .line 379
    .line 380
    .line 381
    move-result-object v43

    .line 382
    const/4 v3, 0x7

    .line 383
    invoke-interface {v10, v3}, La/xpg0;->getLong(I)J

    .line 384
    .line 385
    .line 386
    move-result-wide v12

    .line 387
    long-to-int v3, v12

    .line 388
    if-eqz v3, :cond_6

    .line 389
    .line 390
    const/16 v45, 0x1

    .line 391
    .line 392
    goto :goto_4

    .line 393
    :cond_6
    move/from16 v45, v11

    .line 394
    .line 395
    :goto_4
    const/16 v3, 0x8

    .line 396
    .line 397
    invoke-interface {v10, v3}, La/xpg0;->getLong(I)J

    .line 398
    .line 399
    .line 400
    move-result-wide v12

    .line 401
    long-to-int v3, v12

    .line 402
    if-eqz v3, :cond_7

    .line 403
    .line 404
    const/16 v46, 0x1

    .line 405
    .line 406
    goto :goto_5

    .line 407
    :cond_7
    move/from16 v46, v11

    .line 408
    .line 409
    :goto_5
    invoke-interface {v10, v6}, La/xpg0;->getLong(I)J

    .line 410
    .line 411
    .line 412
    move-result-wide v12

    .line 413
    long-to-int v3, v12

    .line 414
    if-eqz v3, :cond_8

    .line 415
    .line 416
    const/16 v47, 0x1

    .line 417
    .line 418
    :goto_6
    const/16 v15, 0xa

    .line 419
    .line 420
    goto :goto_7

    .line 421
    :cond_8
    move/from16 v47, v11

    .line 422
    .line 423
    goto :goto_6

    .line 424
    :goto_7
    invoke-interface {v10, v15}, La/xpg0;->getLong(I)J

    .line 425
    .line 426
    .line 427
    move-result-wide v12

    .line 428
    long-to-int v3, v12

    .line 429
    if-eqz v3, :cond_9

    .line 430
    .line 431
    const/16 v48, 0x1

    .line 432
    .line 433
    :goto_8
    const/16 v3, 0xb

    .line 434
    .line 435
    goto :goto_9

    .line 436
    :cond_9
    move/from16 v48, v11

    .line 437
    .line 438
    goto :goto_8

    .line 439
    :goto_9
    invoke-interface {v10, v3}, La/xpg0;->getLong(I)J

    .line 440
    .line 441
    .line 442
    move-result-wide v49

    .line 443
    const/16 v12, 0xc

    .line 444
    .line 445
    invoke-interface {v10, v12}, La/xpg0;->getLong(I)J

    .line 446
    .line 447
    .line 448
    move-result-wide v51

    .line 449
    const/16 v12, 0xd

    .line 450
    .line 451
    invoke-interface {v10, v12}, La/xpg0;->getBlob(I)[B

    .line 452
    .line 453
    .line 454
    move-result-object v13

    .line 455
    invoke-static {v13}, La/dqm0;->n([B)Ljava/util/LinkedHashSet;

    .line 456
    .line 457
    .line 458
    move-result-object v53

    .line 459
    new-instance v27, La/o4e;

    .line 460
    .line 461
    move-object/from16 v42, v27

    .line 462
    .line 463
    invoke-direct/range {v42 .. v53}, La/o4e;-><init>(La/hl50;La/sl50;ZZZZJJLjava/util/Set;)V

    .line 464
    .line 465
    .line 466
    move-object/from16 v27, v42

    .line 467
    .line 468
    invoke-interface {v10, v11}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v12

    .line 472
    invoke-static {v0, v12}, La/xp20;->d(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v12

    .line 476
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 477
    .line 478
    .line 479
    move-object/from16 v39, v12

    .line 480
    .line 481
    check-cast v39, Ljava/util/List;

    .line 482
    .line 483
    invoke-interface {v10, v11}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v12

    .line 487
    invoke-static {v14, v12}, La/xp20;->d(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v12

    .line 491
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 492
    .line 493
    .line 494
    move-object/from16 v41, v12

    .line 495
    .line 496
    check-cast v41, Ljava/util/List;

    .line 497
    .line 498
    new-instance v17, La/opv0;

    .line 499
    .line 500
    move/from16 v38, v2

    .line 501
    .line 502
    move/from16 v35, v4

    .line 503
    .line 504
    move/from16 v34, v8

    .line 505
    .line 506
    invoke-direct/range {v17 .. v41}, La/opv0;-><init>(Ljava/lang/String;La/zov0;La/maj;JJJLa/o4e;ILa/af5;JJIIJILjava/util/List;Ljava/lang/String;Ljava/util/List;)V

    .line 507
    .line 508
    .line 509
    move-object/from16 v2, v17

    .line 510
    .line 511
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 512
    .line 513
    .line 514
    const/16 v2, 0x11

    .line 515
    .line 516
    const/4 v8, 0x4

    .line 517
    const/4 v9, 0x3

    .line 518
    const/4 v12, 0x1

    .line 519
    goto/16 :goto_3

    .line 520
    .line 521
    :cond_a
    invoke-interface {v10}, Ljava/lang/AutoCloseable;->close()V

    .line 522
    .line 523
    .line 524
    return-object v1

    .line 525
    :goto_a
    invoke-interface {v10}, Ljava/lang/AutoCloseable;->close()V

    .line 526
    .line 527
    .line 528
    throw v0

    .line 529
    :pswitch_3
    check-cast v0, Lorg/xplatform/ufc/api/weight_class_rating/UfcWeightClassRatingParams;

    .line 530
    .line 531
    check-cast v14, La/g2v;

    .line 532
    .line 533
    check-cast v13, La/ctf0;

    .line 534
    .line 535
    move-object/from16 v1, p1

    .line 536
    .line 537
    check-cast v1, La/z7v0;

    .line 538
    .line 539
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 540
    .line 541
    .line 542
    new-instance v2, La/s7p0;

    .line 543
    .line 544
    invoke-direct {v2, v0, v1, v14, v13}, La/s7p0;-><init>(Lorg/xplatform/ufc/api/weight_class_rating/UfcWeightClassRatingParams;La/z7v0;La/g2v;La/ctf0;)V

    .line 545
    .line 546
    .line 547
    return-object v2

    .line 548
    :pswitch_4
    check-cast v0, La/pz40;

    .line 549
    .line 550
    check-cast v13, La/d930;

    .line 551
    .line 552
    check-cast v14, La/jpu0;

    .line 553
    .line 554
    move-object/from16 v1, p1

    .line 555
    .line 556
    check-cast v1, La/lwk;

    .line 557
    .line 558
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 559
    .line 560
    .line 561
    new-instance v1, La/u43;

    .line 562
    .line 563
    const/16 v15, 0xa

    .line 564
    .line 565
    invoke-direct {v1, v0, v13, v14, v15}, La/u43;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 566
    .line 567
    .line 568
    return-object v1

    .line 569
    :pswitch_5
    check-cast v0, La/mk50;

    .line 570
    .line 571
    check-cast v14, La/vju0;

    .line 572
    .line 573
    check-cast v13, La/ss8;

    .line 574
    .line 575
    move-object/from16 v1, p1

    .line 576
    .line 577
    check-cast v1, La/bem;

    .line 578
    .line 579
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 580
    .line 581
    .line 582
    instance-of v1, v1, La/wdm;

    .line 583
    .line 584
    if-eqz v1, :cond_c

    .line 585
    .line 586
    iget-object v1, v0, La/mk50;->m:La/cys0;

    .line 587
    .line 588
    sget-object v2, La/cys0;->b:La/cys0;

    .line 589
    .line 590
    if-ne v1, v2, :cond_b

    .line 591
    .line 592
    iget-object v1, v14, La/vju0;->x:Lkotlin/jvm/functions/Function2;

    .line 593
    .line 594
    iget-object v2, v13, La/ss8;->d:Ljava/lang/String;

    .line 595
    .line 596
    invoke-interface {v1, v0, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    goto :goto_b

    .line 600
    :cond_b
    iget-object v1, v14, La/vju0;->y:Lkotlin/jvm/functions/Function1;

    .line 601
    .line 602
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    :cond_c
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 606
    .line 607
    return-object v0

    .line 608
    :pswitch_6
    check-cast v0, Landroidx/media3/exoplayer/ExoPlayer;

    .line 609
    .line 610
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 611
    .line 612
    check-cast v13, La/pz40;

    .line 613
    .line 614
    move-object/from16 v1, p1

    .line 615
    .line 616
    check-cast v1, La/lwk;

    .line 617
    .line 618
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 619
    .line 620
    .line 621
    new-instance v2, La/jeu0;

    .line 622
    .line 623
    invoke-direct {v2, v14, v13}, La/jeu0;-><init>(Lkotlin/jvm/functions/Function0;La/pz40;)V

    .line 624
    .line 625
    .line 626
    move-object v3, v0

    .line 627
    check-cast v3, La/ulo;

    .line 628
    .line 629
    iget-object v3, v3, La/ulo;->m:La/vg00;

    .line 630
    .line 631
    invoke-virtual {v3, v2}, La/vg00;->a(Ljava/lang/Object;)V

    .line 632
    .line 633
    .line 634
    new-instance v3, La/pr0;

    .line 635
    .line 636
    invoke-direct {v3, v0, v2, v1}, La/pr0;-><init>(Landroidx/media3/exoplayer/ExoPlayer;La/jeu0;La/lwk;)V

    .line 637
    .line 638
    .line 639
    return-object v3

    .line 640
    :pswitch_7
    check-cast v0, La/szj0;

    .line 641
    .line 642
    move-object v1, v14

    .line 643
    check-cast v1, La/f2u0;

    .line 644
    .line 645
    check-cast v13, Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 646
    .line 647
    move-object/from16 v7, p1

    .line 648
    .line 649
    check-cast v7, La/k0w0;

    .line 650
    .line 651
    iget-object v0, v0, La/szj0;->e:La/rzj0;

    .line 652
    .line 653
    sget-object v2, La/pzj0;->a:La/pzj0;

    .line 654
    .line 655
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 656
    .line 657
    .line 658
    move-result v2

    .line 659
    if-eqz v2, :cond_d

    .line 660
    .line 661
    iget-object v2, v1, La/f2u0;->R:La/xpr;

    .line 662
    .line 663
    new-instance v3, La/vpr;

    .line 664
    .line 665
    invoke-direct {v3, v11}, La/vpr;-><init>(Z)V

    .line 666
    .line 667
    .line 668
    const/4 v5, 0x0

    .line 669
    const/4 v6, 0x6

    .line 670
    const/4 v4, 0x0

    .line 671
    invoke-static/range {v1 .. v6}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 672
    .line 673
    .line 674
    invoke-virtual {v7, v13}, La/k0w0;->c(La/m7h0;)V

    .line 675
    .line 676
    .line 677
    goto :goto_c

    .line 678
    :cond_d
    sget-object v2, La/qzj0;->a:La/qzj0;

    .line 679
    .line 680
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 681
    .line 682
    .line 683
    move-result v0

    .line 684
    if-eqz v0, :cond_e

    .line 685
    .line 686
    iget-object v2, v1, La/f2u0;->R:La/xpr;

    .line 687
    .line 688
    new-instance v3, La/vpr;

    .line 689
    .line 690
    const/4 v0, 0x1

    .line 691
    invoke-direct {v3, v0}, La/vpr;-><init>(Z)V

    .line 692
    .line 693
    .line 694
    const/4 v5, 0x0

    .line 695
    const/4 v6, 0x6

    .line 696
    const/4 v4, 0x0

    .line 697
    invoke-static/range {v1 .. v6}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 698
    .line 699
    .line 700
    invoke-virtual {v7, v13}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 701
    .line 702
    .line 703
    :goto_c
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 704
    .line 705
    goto :goto_d

    .line 706
    :cond_e
    invoke-static {}, La/t9f;->b()V

    .line 707
    .line 708
    .line 709
    :goto_d
    return-object v10

    .line 710
    :pswitch_8
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 711
    .line 712
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 713
    .line 714
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 715
    .line 716
    move-object/from16 v1, p1

    .line 717
    .line 718
    check-cast v1, La/lz3;

    .line 719
    .line 720
    instance-of v2, v1, La/jz3;

    .line 721
    .line 722
    if-eqz v2, :cond_f

    .line 723
    .line 724
    if-eqz v0, :cond_12

    .line 725
    .line 726
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 727
    .line 728
    .line 729
    goto :goto_e

    .line 730
    :cond_f
    instance-of v0, v1, La/kz3;

    .line 731
    .line 732
    if-eqz v0, :cond_10

    .line 733
    .line 734
    if-eqz v14, :cond_12

    .line 735
    .line 736
    invoke-interface {v14, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 737
    .line 738
    .line 739
    goto :goto_e

    .line 740
    :cond_10
    instance-of v0, v1, La/iz3;

    .line 741
    .line 742
    if-eqz v0, :cond_11

    .line 743
    .line 744
    if-eqz v13, :cond_12

    .line 745
    .line 746
    invoke-interface {v13, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 747
    .line 748
    .line 749
    goto :goto_e

    .line 750
    :cond_11
    instance-of v0, v1, La/hz3;

    .line 751
    .line 752
    if-eqz v0, :cond_13

    .line 753
    .line 754
    :cond_12
    :goto_e
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 755
    .line 756
    goto :goto_f

    .line 757
    :cond_13
    invoke-static {}, La/t9f;->b()V

    .line 758
    .line 759
    .line 760
    :goto_f
    return-object v10

    .line 761
    :pswitch_9
    check-cast v0, La/pm80;

    .line 762
    .line 763
    check-cast v14, La/pm80;

    .line 764
    .line 765
    check-cast v13, La/pm80;

    .line 766
    .line 767
    move-object/from16 v1, p1

    .line 768
    .line 769
    check-cast v1, La/lz3;

    .line 770
    .line 771
    instance-of v2, v1, La/jz3;

    .line 772
    .line 773
    if-eqz v2, :cond_15

    .line 774
    .line 775
    if-eqz v0, :cond_14

    .line 776
    .line 777
    new-instance v1, La/jz3;

    .line 778
    .line 779
    invoke-direct {v1, v0}, La/jz3;-><init>(La/pm80;)V

    .line 780
    .line 781
    .line 782
    goto :goto_10

    .line 783
    :cond_14
    check-cast v1, La/jz3;

    .line 784
    .line 785
    goto :goto_10

    .line 786
    :cond_15
    instance-of v0, v1, La/iz3;

    .line 787
    .line 788
    if-eqz v0, :cond_17

    .line 789
    .line 790
    check-cast v1, La/iz3;

    .line 791
    .line 792
    iget-object v0, v1, La/iz3;->b:La/r1o;

    .line 793
    .line 794
    iget-object v2, v0, La/r1o;->c:Ljava/lang/Throwable;

    .line 795
    .line 796
    instance-of v2, v2, La/j860;

    .line 797
    .line 798
    if-eqz v2, :cond_16

    .line 799
    .line 800
    if-eqz v14, :cond_17

    .line 801
    .line 802
    new-instance v1, La/iz3;

    .line 803
    .line 804
    invoke-direct {v1, v14, v0}, La/iz3;-><init>(La/pm80;La/r1o;)V

    .line 805
    .line 806
    .line 807
    goto :goto_10

    .line 808
    :cond_16
    if-eqz v13, :cond_17

    .line 809
    .line 810
    new-instance v1, La/iz3;

    .line 811
    .line 812
    invoke-direct {v1, v13, v0}, La/iz3;-><init>(La/pm80;La/r1o;)V

    .line 813
    .line 814
    .line 815
    :cond_17
    :goto_10
    return-object v1

    .line 816
    :pswitch_a
    check-cast v0, La/daf;

    .line 817
    .line 818
    check-cast v14, La/i1w0;

    .line 819
    .line 820
    check-cast v13, La/zuc0;

    .line 821
    .line 822
    move-object/from16 v1, p1

    .line 823
    .line 824
    check-cast v1, La/k0w0;

    .line 825
    .line 826
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 827
    .line 828
    .line 829
    new-instance v2, La/hot0;

    .line 830
    .line 831
    const/4 v3, 0x1

    .line 832
    invoke-direct {v2, v0, v14, v13, v3}, La/hot0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 833
    .line 834
    .line 835
    new-instance v0, La/a1w0;

    .line 836
    .line 837
    invoke-direct {v0, v2}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 838
    .line 839
    .line 840
    invoke-virtual {v1, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 841
    .line 842
    .line 843
    move-result-object v0

    .line 844
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 845
    .line 846
    check-cast v0, La/c8d;

    .line 847
    .line 848
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 849
    .line 850
    new-instance v2, La/v7d;

    .line 851
    .line 852
    invoke-direct {v2, v3, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 853
    .line 854
    .line 855
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 856
    .line 857
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 858
    .line 859
    return-object v0

    .line 860
    :pswitch_b
    check-cast v0, La/yhs0;

    .line 861
    .line 862
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 863
    .line 864
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 865
    .line 866
    move-object/from16 v1, p1

    .line 867
    .line 868
    check-cast v1, La/hcz;

    .line 869
    .line 870
    sget-object v2, La/uks0;->l2:La/s9m0;

    .line 871
    .line 872
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 873
    .line 874
    .line 875
    iget-object v0, v0, La/yhs0;->a:La/a4x;

    .line 876
    .line 877
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 878
    .line 879
    .line 880
    move-result v2

    .line 881
    new-instance v4, La/vdr0;

    .line 882
    .line 883
    const/16 v3, 0xb

    .line 884
    .line 885
    invoke-direct {v4, v0, v3}, La/vdr0;-><init>(Ljava/util/List;B)V

    .line 886
    .line 887
    .line 888
    new-instance v3, La/p6p0;

    .line 889
    .line 890
    const/4 v5, 0x1

    .line 891
    invoke-direct {v3, v0, v14, v13, v5}, La/p6p0;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;B)V

    .line 892
    .line 893
    .line 894
    new-instance v0, La/ugd;

    .line 895
    .line 896
    const v6, 0x799532c4

    .line 897
    .line 898
    .line 899
    invoke-direct {v0, v6, v5, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 900
    .line 901
    .line 902
    invoke-virtual {v1, v2, v10, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 903
    .line 904
    .line 905
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 906
    .line 907
    return-object v0

    .line 908
    :pswitch_c
    check-cast v0, La/ryu;

    .line 909
    .line 910
    check-cast v14, Ljava/lang/String;

    .line 911
    .line 912
    check-cast v13, La/luu;

    .line 913
    .line 914
    move-object/from16 v1, p1

    .line 915
    .line 916
    check-cast v1, La/vzg0;

    .line 917
    .line 918
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 919
    .line 920
    .line 921
    new-instance v2, La/ifs0;

    .line 922
    .line 923
    invoke-virtual {v0, v14}, La/ryu;->a(Ljava/lang/String;)La/a5w;

    .line 924
    .line 925
    .line 926
    move-result-object v5

    .line 927
    iget-object v0, v13, La/luu;->a:La/nok0;

    .line 928
    .line 929
    invoke-virtual {v0}, La/nok0;->a()Ljava/util/List;

    .line 930
    .line 931
    .line 932
    move-result-object v8

    .line 933
    sget-object v9, La/iun;->a:La/iun;

    .line 934
    .line 935
    const/4 v3, 0x0

    .line 936
    sget-object v4, La/jgs0;->a:La/jgs0;

    .line 937
    .line 938
    const/4 v6, 0x0

    .line 939
    const/4 v7, 0x0

    .line 940
    move-object v10, v9

    .line 941
    move-object v11, v9

    .line 942
    invoke-direct/range {v2 .. v11}, La/ifs0;-><init>(ZLa/lgs0;La/a5w;La/ql5;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 943
    .line 944
    .line 945
    return-object v2

    .line 946
    :pswitch_d
    check-cast v0, La/t9f;

    .line 947
    .line 948
    check-cast v14, La/nhe0;

    .line 949
    .line 950
    check-cast v13, La/d930;

    .line 951
    .line 952
    move-object/from16 v1, p1

    .line 953
    .line 954
    check-cast v1, La/cp;

    .line 955
    .line 956
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 957
    .line 958
    .line 959
    new-instance v2, La/bg5;

    .line 960
    .line 961
    sget-object v3, La/bg5;->g:La/pn20;

    .line 962
    .line 963
    invoke-direct {v2, v3}, La/qv5;-><init>(La/dtb;)V

    .line 964
    .line 965
    .line 966
    new-instance v3, La/efr0;

    .line 967
    .line 968
    const/16 v9, 0x11

    .line 969
    .line 970
    invoke-direct {v3, v9}, La/efr0;-><init>(B)V

    .line 971
    .line 972
    .line 973
    new-instance v4, La/lcr0;

    .line 974
    .line 975
    invoke-direct {v4, v0, v6}, La/lcr0;-><init>(Ljava/lang/Object;B)V

    .line 976
    .line 977
    .line 978
    new-instance v0, La/d8q0;

    .line 979
    .line 980
    const/4 v6, 0x3

    .line 981
    const/16 v12, 0xd

    .line 982
    .line 983
    invoke-direct {v0, v6, v12}, La/d8q0;-><init>(IB)V

    .line 984
    .line 985
    .line 986
    sget-object v6, La/pfo0;->v:La/pfo0;

    .line 987
    .line 988
    new-instance v8, La/gbn;

    .line 989
    .line 990
    invoke-direct {v8, v3, v0, v4, v6}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 991
    .line 992
    .line 993
    iget-object v0, v2, La/zz3;->d:La/dp;

    .line 994
    .line 995
    invoke-virtual {v0, v8}, La/dp;->b(La/gbn;)V

    .line 996
    .line 997
    .line 998
    iget-object v0, v1, La/cp;->u:La/yfu0;

    .line 999
    .line 1000
    check-cast v0, La/js10;

    .line 1001
    .line 1002
    iget-object v3, v0, La/js10;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 1003
    .line 1004
    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 1005
    .line 1006
    .line 1007
    iget-object v3, v0, La/js10;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 1008
    .line 1009
    new-instance v4, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 1010
    .line 1011
    iget-object v6, v1, La/cp;->w:Landroid/content/Context;

    .line 1012
    .line 1013
    invoke-direct {v4, v6, v11, v11}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 1014
    .line 1015
    .line 1016
    invoke-virtual {v3, v4}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 1017
    .line 1018
    .line 1019
    iget-object v0, v0, La/js10;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 1020
    .line 1021
    invoke-virtual {v0, v14}, Landroidx/recyclerview/widget/RecyclerView;->setRecycledViewPool(La/nhe0;)V

    .line 1022
    .line 1023
    .line 1024
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v3

    .line 1028
    const v4, 0x7f0704be

    .line 1029
    .line 1030
    .line 1031
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 1032
    .line 1033
    .line 1034
    move-result v16

    .line 1035
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v3

    .line 1039
    const v4, 0x7f0706e2

    .line 1040
    .line 1041
    .line 1042
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 1043
    .line 1044
    .line 1045
    move-result v15

    .line 1046
    new-instance v14, La/qmk0;

    .line 1047
    .line 1048
    const/16 v22, 0x0

    .line 1049
    .line 1050
    const/16 v23, 0x1d4

    .line 1051
    .line 1052
    const/16 v17, 0x0

    .line 1053
    .line 1054
    const/16 v19, 0x0

    .line 1055
    .line 1056
    const/16 v20, 0x0

    .line 1057
    .line 1058
    const/16 v21, 0x0

    .line 1059
    .line 1060
    move/from16 v18, v16

    .line 1061
    .line 1062
    invoke-direct/range {v14 .. v23}, La/qmk0;-><init>(IIIIIILkotlin/jvm/functions/Function1;La/rmk0;I)V

    .line 1063
    .line 1064
    .line 1065
    invoke-virtual {v0, v14}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 1066
    .line 1067
    .line 1068
    new-instance v0, La/b8q0;

    .line 1069
    .line 1070
    const/16 v3, 0x1c

    .line 1071
    .line 1072
    invoke-direct {v0, v2, v1, v3}, La/b8q0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1073
    .line 1074
    .line 1075
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 1076
    .line 1077
    .line 1078
    new-instance v0, La/e5t;

    .line 1079
    .line 1080
    const/4 v5, 0x4

    .line 1081
    invoke-direct {v0, v5, v1, v13}, La/e5t;-><init>(BLa/cp;La/d930;)V

    .line 1082
    .line 1083
    .line 1084
    invoke-virtual {v1, v0}, La/cp;->x(Lkotlin/jvm/functions/Function0;)V

    .line 1085
    .line 1086
    .line 1087
    new-instance v0, La/e5t;

    .line 1088
    .line 1089
    invoke-direct {v0, v7, v1, v13}, La/e5t;-><init>(BLa/cp;La/d930;)V

    .line 1090
    .line 1091
    .line 1092
    invoke-virtual {v1, v0}, La/cp;->y(Lkotlin/jvm/functions/Function0;)V

    .line 1093
    .line 1094
    .line 1095
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1096
    .line 1097
    return-object v0

    .line 1098
    nop

    .line 1099
    :pswitch_data_0
    .packed-switch 0x0
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
