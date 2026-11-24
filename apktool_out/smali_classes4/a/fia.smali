.class public abstract La/fia;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lkotlin/ranges/IntRange;

.field public static final b:Lkotlin/ranges/IntRange;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lkotlin/ranges/IntRange;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-direct {v0, v2, v1, v2}, Lkotlin/ranges/a;-><init>(III)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/fia;->a:Lkotlin/ranges/IntRange;

    .line 9
    .line 10
    new-instance v0, Lkotlin/ranges/IntRange;

    .line 11
    .line 12
    const/4 v1, 0x4

    .line 13
    const/4 v3, 0x6

    .line 14
    invoke-direct {v0, v1, v3, v2}, Lkotlin/ranges/a;-><init>(III)V

    .line 15
    .line 16
    .line 17
    sput-object v0, La/fia;->b:Lkotlin/ranges/IntRange;

    .line 18
    .line 19
    return-void
.end method

.method public static final a(La/lc00;La/kha;La/ctf0;La/m9s;)V
    .locals 29

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const v3, 0x7f08031f

    .line 12
    .line 13
    .line 14
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    iget-object v4, v0, La/kha;->h:Ljava/util/List;

    .line 19
    .line 20
    iget v5, v0, La/kha;->a:I

    .line 21
    .line 22
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    check-cast v6, La/ve90;

    .line 27
    .line 28
    const/4 v7, 0x1

    .line 29
    invoke-static {v7, v4}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    check-cast v4, La/ve90;

    .line 34
    .line 35
    iget-boolean v8, v0, La/kha;->d:Z

    .line 36
    .line 37
    iget-object v9, v0, La/kha;->b:La/tha;

    .line 38
    .line 39
    iget-object v10, v9, La/tha;->b:Ljava/util/List;

    .line 40
    .line 41
    iget-object v9, v9, La/tha;->a:Ljava/util/List;

    .line 42
    .line 43
    iget-object v11, v0, La/kha;->c:La/tha;

    .line 44
    .line 45
    iget-object v12, v11, La/tha;->b:Ljava/util/List;

    .line 46
    .line 47
    iget-boolean v13, v0, La/kha;->e:Z

    .line 48
    .line 49
    if-eqz v8, :cond_0

    .line 50
    .line 51
    if-eqz v13, :cond_0

    .line 52
    .line 53
    sget-object v8, La/dha;->c:La/dha;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    if-eqz v13, :cond_1

    .line 57
    .line 58
    sget-object v8, La/dha;->a:La/dha;

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    if-eqz v8, :cond_2

    .line 62
    .line 63
    sget-object v8, La/dha;->b:La/dha;

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    sget-object v8, La/dha;->d:La/dha;

    .line 67
    .line 68
    :goto_0
    new-instance v13, La/eha;

    .line 69
    .line 70
    invoke-direct {v13, v8}, La/eha;-><init>(La/dha;)V

    .line 71
    .line 72
    .line 73
    sget-object v8, La/fha;->c:La/bj5;

    .line 74
    .line 75
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    packed-switch v5, :pswitch_data_0

    .line 79
    .line 80
    .line 81
    sget-object v8, La/fha;->d:La/fha;

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :pswitch_0
    sget-object v8, La/fha;->j:La/fha;

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :pswitch_1
    sget-object v8, La/fha;->i:La/fha;

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :pswitch_2
    sget-object v8, La/fha;->h:La/fha;

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :pswitch_3
    sget-object v8, La/fha;->g:La/fha;

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :pswitch_4
    sget-object v8, La/fha;->f:La/fha;

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :pswitch_5
    sget-object v8, La/fha;->e:La/fha;

    .line 100
    .line 101
    :goto_1
    iget-object v11, v11, La/tha;->a:Ljava/util/List;

    .line 102
    .line 103
    new-instance v14, Ljava/util/ArrayList;

    .line 104
    .line 105
    const/16 v15, 0xa

    .line 106
    .line 107
    invoke-static {v12, v15}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 108
    .line 109
    .line 110
    move-result v7

    .line 111
    invoke-direct {v14, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 112
    .line 113
    .line 114
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    const/4 v15, 0x0

    .line 119
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v18

    .line 123
    const/16 v19, 0x0

    .line 124
    .line 125
    if-eqz v18, :cond_5

    .line 126
    .line 127
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v18

    .line 131
    add-int/lit8 v20, v15, 0x1

    .line 132
    .line 133
    if-ltz v15, :cond_4

    .line 134
    .line 135
    move-object/from16 v21, v7

    .line 136
    .line 137
    move-object/from16 v7, v18

    .line 138
    .line 139
    check-cast v7, La/tna0;

    .line 140
    .line 141
    move-object/from16 v18, v12

    .line 142
    .line 143
    new-instance v12, La/cha;

    .line 144
    .line 145
    invoke-static {v7}, La/z1x;->F(La/tna0;)I

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    iget-object v7, v7, La/tna0;->b:La/rna0;

    .line 150
    .line 151
    iget v7, v7, La/rna0;->a:I

    .line 152
    .line 153
    invoke-interface {v9, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v15

    .line 157
    check-cast v15, La/tna0;

    .line 158
    .line 159
    iget-object v15, v15, La/tna0;->b:La/rna0;

    .line 160
    .line 161
    iget v15, v15, La/rna0;->a:I

    .line 162
    .line 163
    if-le v7, v15, :cond_3

    .line 164
    .line 165
    const/4 v7, 0x1

    .line 166
    goto :goto_3

    .line 167
    :cond_3
    const/4 v7, 0x0

    .line 168
    :goto_3
    invoke-direct {v12, v2, v7}, La/cha;-><init>(IZ)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v14, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-object/from16 v12, v18

    .line 175
    .line 176
    move/from16 v15, v20

    .line 177
    .line 178
    move-object/from16 v7, v21

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_4
    invoke-static {}, La/q3d;->p()V

    .line 182
    .line 183
    .line 184
    throw v19

    .line 185
    :cond_5
    move-object/from16 v18, v12

    .line 186
    .line 187
    new-instance v2, Ljava/util/ArrayList;

    .line 188
    .line 189
    const/16 v7, 0xa

    .line 190
    .line 191
    invoke-static {v10, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 192
    .line 193
    .line 194
    move-result v12

    .line 195
    invoke-direct {v2, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 196
    .line 197
    .line 198
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 199
    .line 200
    .line 201
    move-result-object v7

    .line 202
    const/4 v12, 0x0

    .line 203
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 204
    .line 205
    .line 206
    move-result v15

    .line 207
    if-eqz v15, :cond_8

    .line 208
    .line 209
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v15

    .line 213
    add-int/lit8 v20, v12, 0x1

    .line 214
    .line 215
    if-ltz v12, :cond_7

    .line 216
    .line 217
    check-cast v15, La/tna0;

    .line 218
    .line 219
    move-object/from16 v21, v7

    .line 220
    .line 221
    new-instance v7, La/cha;

    .line 222
    .line 223
    move-object/from16 v22, v10

    .line 224
    .line 225
    invoke-static {v15}, La/z1x;->F(La/tna0;)I

    .line 226
    .line 227
    .line 228
    move-result v10

    .line 229
    iget-object v15, v15, La/tna0;->b:La/rna0;

    .line 230
    .line 231
    iget v15, v15, La/rna0;->a:I

    .line 232
    .line 233
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v12

    .line 237
    check-cast v12, La/tna0;

    .line 238
    .line 239
    iget-object v12, v12, La/tna0;->b:La/rna0;

    .line 240
    .line 241
    iget v12, v12, La/rna0;->a:I

    .line 242
    .line 243
    if-le v15, v12, :cond_6

    .line 244
    .line 245
    const/4 v12, 0x1

    .line 246
    goto :goto_5

    .line 247
    :cond_6
    const/4 v12, 0x0

    .line 248
    :goto_5
    invoke-direct {v7, v10, v12}, La/cha;-><init>(IZ)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move/from16 v12, v20

    .line 255
    .line 256
    move-object/from16 v7, v21

    .line 257
    .line 258
    move-object/from16 v10, v22

    .line 259
    .line 260
    goto :goto_4

    .line 261
    :cond_7
    invoke-static {}, La/q3d;->p()V

    .line 262
    .line 263
    .line 264
    throw v19

    .line 265
    :cond_8
    move-object/from16 v22, v10

    .line 266
    .line 267
    new-instance v7, La/xha;

    .line 268
    .line 269
    invoke-direct {v7, v14, v2, v8}, La/xha;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;La/fha;)V

    .line 270
    .line 271
    .line 272
    new-instance v2, La/gha;

    .line 273
    .line 274
    invoke-direct {v2, v7, v13}, La/gha;-><init>(La/xha;La/eha;)V

    .line 275
    .line 276
    .line 277
    new-instance v7, Ljava/util/ArrayList;

    .line 278
    .line 279
    const/16 v8, 0xa

    .line 280
    .line 281
    invoke-static {v9, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 282
    .line 283
    .line 284
    move-result v10

    .line 285
    invoke-direct {v7, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 286
    .line 287
    .line 288
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 289
    .line 290
    .line 291
    move-result-object v8

    .line 292
    :goto_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 293
    .line 294
    .line 295
    move-result v10

    .line 296
    if-eqz v10, :cond_9

    .line 297
    .line 298
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v10

    .line 302
    check-cast v10, La/tna0;

    .line 303
    .line 304
    invoke-static {v10}, La/z1x;->F(La/tna0;)I

    .line 305
    .line 306
    .line 307
    move-result v10

    .line 308
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 309
    .line 310
    .line 311
    move-result-object v10

    .line 312
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    goto :goto_6

    .line 316
    :cond_9
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 317
    .line 318
    .line 319
    move-result v8

    .line 320
    if-eqz v8, :cond_a

    .line 321
    .line 322
    filled-new-array {v3, v3, v3}, [Ljava/lang/Integer;

    .line 323
    .line 324
    .line 325
    move-result-object v7

    .line 326
    invoke-static {v7}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 327
    .line 328
    .line 329
    move-result-object v7

    .line 330
    :cond_a
    new-instance v8, Ljava/util/ArrayList;

    .line 331
    .line 332
    const/16 v10, 0xa

    .line 333
    .line 334
    invoke-static {v11, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 335
    .line 336
    .line 337
    move-result v10

    .line 338
    invoke-direct {v8, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 339
    .line 340
    .line 341
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 342
    .line 343
    .line 344
    move-result-object v10

    .line 345
    :goto_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 346
    .line 347
    .line 348
    move-result v12

    .line 349
    if-eqz v12, :cond_b

    .line 350
    .line 351
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v12

    .line 355
    check-cast v12, La/tna0;

    .line 356
    .line 357
    invoke-static {v12}, La/z1x;->F(La/tna0;)I

    .line 358
    .line 359
    .line 360
    move-result v12

    .line 361
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 362
    .line 363
    .line 364
    move-result-object v12

    .line 365
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    goto :goto_7

    .line 369
    :cond_b
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 370
    .line 371
    .line 372
    move-result v10

    .line 373
    if-eqz v10, :cond_c

    .line 374
    .line 375
    filled-new-array {v3, v3, v3}, [Ljava/lang/Integer;

    .line 376
    .line 377
    .line 378
    move-result-object v3

    .line 379
    invoke-static {v3}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 380
    .line 381
    .line 382
    move-result-object v8

    .line 383
    :cond_c
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 384
    .line 385
    .line 386
    move-result v3

    .line 387
    if-nez v3, :cond_d

    .line 388
    .line 389
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 390
    .line 391
    .line 392
    move-result v3

    .line 393
    if-nez v3, :cond_d

    .line 394
    .line 395
    const/4 v3, 0x1

    .line 396
    goto :goto_8

    .line 397
    :cond_d
    const/4 v3, 0x0

    .line 398
    :goto_8
    iget-boolean v9, v0, La/kha;->i:Z

    .line 399
    .line 400
    new-instance v10, La/cia;

    .line 401
    .line 402
    invoke-direct {v10, v7, v8, v3, v9}, La/cia;-><init>(Ljava/util/List;Ljava/util/List;ZZ)V

    .line 403
    .line 404
    .line 405
    new-instance v3, La/mha;

    .line 406
    .line 407
    const-string v7, ""

    .line 408
    .line 409
    if-eqz v6, :cond_e

    .line 410
    .line 411
    iget-object v8, v6, La/ve90;->b:Ljava/lang/String;

    .line 412
    .line 413
    if-nez v8, :cond_f

    .line 414
    .line 415
    :cond_e
    move-object v8, v7

    .line 416
    :cond_f
    if-eqz v6, :cond_10

    .line 417
    .line 418
    iget-object v9, v6, La/ve90;->c:Ljava/lang/String;

    .line 419
    .line 420
    if-nez v9, :cond_11

    .line 421
    .line 422
    :cond_10
    move-object v9, v7

    .line 423
    :cond_11
    if-eqz v6, :cond_12

    .line 424
    .line 425
    iget-object v6, v6, La/ve90;->a:Ljava/lang/String;

    .line 426
    .line 427
    if-nez v6, :cond_13

    .line 428
    .line 429
    :cond_12
    move-object v6, v7

    .line 430
    :cond_13
    invoke-static {v8, v9, v6, v1}, La/fia;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/ctf0;)Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v6

    .line 434
    sget-object v8, La/fia;->a:Lkotlin/ranges/IntRange;

    .line 435
    .line 436
    iget v9, v8, Lkotlin/ranges/a;->a:I

    .line 437
    .line 438
    iget v8, v8, Lkotlin/ranges/a;->b:I

    .line 439
    .line 440
    const v11, 0x7f0803dd

    .line 441
    .line 442
    .line 443
    const v12, 0x7f0803dc

    .line 444
    .line 445
    .line 446
    if-gt v9, v5, :cond_14

    .line 447
    .line 448
    if-gt v5, v8, :cond_14

    .line 449
    .line 450
    move v13, v12

    .line 451
    goto :goto_9

    .line 452
    :cond_14
    move v13, v11

    .line 453
    :goto_9
    const v14, 0x7f06069d

    .line 454
    .line 455
    .line 456
    const v15, 0x7f0606da

    .line 457
    .line 458
    .line 459
    if-gt v9, v5, :cond_15

    .line 460
    .line 461
    if-gt v5, v8, :cond_15

    .line 462
    .line 463
    move v8, v15

    .line 464
    goto :goto_a

    .line 465
    :cond_15
    move v8, v14

    .line 466
    :goto_a
    invoke-direct {v3, v6, v13, v8}, La/mha;-><init>(Ljava/lang/String;II)V

    .line 467
    .line 468
    .line 469
    new-instance v6, La/mha;

    .line 470
    .line 471
    if-eqz v4, :cond_16

    .line 472
    .line 473
    iget-object v8, v4, La/ve90;->b:Ljava/lang/String;

    .line 474
    .line 475
    if-nez v8, :cond_17

    .line 476
    .line 477
    :cond_16
    move-object v8, v7

    .line 478
    :cond_17
    if-eqz v4, :cond_18

    .line 479
    .line 480
    iget-object v9, v4, La/ve90;->c:Ljava/lang/String;

    .line 481
    .line 482
    if-nez v9, :cond_19

    .line 483
    .line 484
    :cond_18
    move-object v9, v7

    .line 485
    :cond_19
    if-eqz v4, :cond_1a

    .line 486
    .line 487
    iget-object v4, v4, La/ve90;->a:Ljava/lang/String;

    .line 488
    .line 489
    if-nez v4, :cond_1b

    .line 490
    .line 491
    :cond_1a
    move-object v4, v7

    .line 492
    :cond_1b
    invoke-static {v8, v9, v4, v1}, La/fia;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/ctf0;)Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v4

    .line 496
    sget-object v8, La/fia;->b:Lkotlin/ranges/IntRange;

    .line 497
    .line 498
    iget v9, v8, Lkotlin/ranges/a;->a:I

    .line 499
    .line 500
    iget v8, v8, Lkotlin/ranges/a;->b:I

    .line 501
    .line 502
    if-gt v9, v5, :cond_1c

    .line 503
    .line 504
    if-gt v5, v8, :cond_1c

    .line 505
    .line 506
    move v11, v12

    .line 507
    :cond_1c
    if-gt v9, v5, :cond_1d

    .line 508
    .line 509
    if-gt v5, v8, :cond_1d

    .line 510
    .line 511
    move v14, v15

    .line 512
    :cond_1d
    invoke-direct {v6, v4, v11, v14}, La/mha;-><init>(Ljava/lang/String;II)V

    .line 513
    .line 514
    .line 515
    move-object/from16 v4, p3

    .line 516
    .line 517
    iget-wide v8, v4, La/m9s;->v:J

    .line 518
    .line 519
    invoke-static {v8, v9}, La/znq0;->g(J)J

    .line 520
    .line 521
    .line 522
    move-result-wide v8

    .line 523
    sget-object v11, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 524
    .line 525
    iget-wide v12, v0, La/kha;->f:J

    .line 526
    .line 527
    invoke-virtual {v11, v12, v13}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 528
    .line 529
    .line 530
    move-result-wide v11

    .line 531
    iget-object v0, v4, La/m9s;->h:La/qqs;

    .line 532
    .line 533
    iget-object v13, v0, La/qqs;->l:Ljava/lang/String;

    .line 534
    .line 535
    iget-boolean v4, v4, La/m9s;->r:Z

    .line 536
    .line 537
    iget-object v0, v0, La/qqs;->k:La/znq0;

    .line 538
    .line 539
    if-eqz v0, :cond_1e

    .line 540
    .line 541
    iget-wide v14, v0, La/znq0;->a:J

    .line 542
    .line 543
    invoke-static {v14, v15}, La/znq0;->f(J)J

    .line 544
    .line 545
    .line 546
    move-result-wide v14

    .line 547
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 548
    .line 549
    .line 550
    move-result-object v19

    .line 551
    :cond_1e
    move-object/from16 v0, v19

    .line 552
    .line 553
    if-eqz v4, :cond_1f

    .line 554
    .line 555
    new-instance v0, La/qha;

    .line 556
    .line 557
    const/4 v4, 0x0

    .line 558
    new-array v5, v4, [Ljava/lang/Object;

    .line 559
    .line 560
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 561
    .line 562
    invoke-static {v5, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    move-result-object v4

    .line 566
    const v5, 0x7f130de6

    .line 567
    .line 568
    .line 569
    invoke-virtual {v1, v5, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v1

    .line 573
    invoke-direct {v0, v1}, La/qha;-><init>(Ljava/lang/String;)V

    .line 574
    .line 575
    .line 576
    :goto_b
    move-object/from16 v28, v0

    .line 577
    .line 578
    goto :goto_c

    .line 579
    :cond_1f
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 580
    .line 581
    .line 582
    move-result-wide v14

    .line 583
    const-wide/16 v16, 0x3e8

    .line 584
    .line 585
    div-long v14, v14, v16

    .line 586
    .line 587
    sub-long/2addr v8, v14

    .line 588
    const-wide/16 v14, 0x0

    .line 589
    .line 590
    cmp-long v4, v8, v14

    .line 591
    .line 592
    if-gez v4, :cond_23

    .line 593
    .line 594
    if-eqz v5, :cond_20

    .line 595
    .line 596
    const/4 v1, 0x3

    .line 597
    if-ne v5, v1, :cond_21

    .line 598
    .line 599
    :cond_20
    invoke-static {v13}, La/msm0;->j(Ljava/lang/String;)Z

    .line 600
    .line 601
    .line 602
    move-result v1

    .line 603
    if-nez v1, :cond_21

    .line 604
    .line 605
    new-instance v0, La/qha;

    .line 606
    .line 607
    invoke-direct {v0, v13}, La/qha;-><init>(Ljava/lang/String;)V

    .line 608
    .line 609
    .line 610
    goto :goto_b

    .line 611
    :cond_21
    cmp-long v1, v11, v14

    .line 612
    .line 613
    if-eqz v1, :cond_22

    .line 614
    .line 615
    invoke-interface/range {v22 .. v22}, Ljava/util/List;->isEmpty()Z

    .line 616
    .line 617
    .line 618
    move-result v1

    .line 619
    if-eqz v1, :cond_22

    .line 620
    .line 621
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->isEmpty()Z

    .line 622
    .line 623
    .line 624
    move-result v1

    .line 625
    if-eqz v1, :cond_22

    .line 626
    .line 627
    new-instance v1, La/rha;

    .line 628
    .line 629
    invoke-direct {v1, v0, v11, v12}, La/rha;-><init>(Ljava/lang/Long;J)V

    .line 630
    .line 631
    .line 632
    move-object/from16 v28, v1

    .line 633
    .line 634
    goto :goto_c

    .line 635
    :cond_22
    new-instance v0, La/qha;

    .line 636
    .line 637
    invoke-direct {v0, v7}, La/qha;-><init>(Ljava/lang/String;)V

    .line 638
    .line 639
    .line 640
    goto :goto_b

    .line 641
    :cond_23
    new-instance v0, La/qha;

    .line 642
    .line 643
    const/4 v4, 0x0

    .line 644
    new-array v5, v4, [Ljava/lang/Object;

    .line 645
    .line 646
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 647
    .line 648
    invoke-static {v5, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v4

    .line 652
    const v5, 0x7f130232

    .line 653
    .line 654
    .line 655
    invoke-virtual {v1, v5, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 656
    .line 657
    .line 658
    move-result-object v1

    .line 659
    invoke-direct {v0, v1}, La/qha;-><init>(Ljava/lang/String;)V

    .line 660
    .line 661
    .line 662
    goto :goto_b

    .line 663
    :goto_c
    new-instance v23, La/eia;

    .line 664
    .line 665
    move-object/from16 v24, v2

    .line 666
    .line 667
    move-object/from16 v26, v3

    .line 668
    .line 669
    move-object/from16 v27, v6

    .line 670
    .line 671
    move-object/from16 v25, v10

    .line 672
    .line 673
    invoke-direct/range {v23 .. v28}, La/eia;-><init>(La/gha;La/cia;La/mha;La/mha;La/sha;)V

    .line 674
    .line 675
    .line 676
    move-object/from16 v0, p0

    .line 677
    .line 678
    move-object/from16 v1, v23

    .line 679
    .line 680
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 681
    .line 682
    .line 683
    return-void

    .line 684
    nop

    .line 685
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/ctf0;)Ljava/lang/String;
    .locals 2

    .line 1
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object p3, p3, La/ctf0;->b:La/lsm0;

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    const v0, 0x7f130632

    .line 13
    .line 14
    .line 15
    invoke-virtual {p3, v0, p2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    if-lez p3, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result p3

    .line 29
    if-lez p3, :cond_0

    .line 30
    .line 31
    const-string p3, ":"

    .line 32
    .line 33
    const-string v0, ")"

    .line 34
    .line 35
    const-string v1, "("

    .line 36
    .line 37
    invoke-static {v1, p0, p3, p1, v0}, La/b1j;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const-string p0, ""

    .line 43
    .line 44
    :goto_0
    const-string p1, " "

    .line 45
    .line 46
    invoke-static {p2, p1, p0}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method
