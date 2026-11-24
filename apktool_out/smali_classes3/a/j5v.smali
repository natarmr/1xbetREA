.class public final La/j5v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/dn0;

.field public final b:La/j1q0;

.field public final c:La/svu;

.field public final d:La/mne;


# direct methods
.method public constructor <init>(La/dn0;La/j1q0;La/svu;La/mne;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/j5v;->a:La/dn0;

    .line 8
    .line 9
    iput-object p2, p0, La/j5v;->b:La/j1q0;

    .line 10
    .line 11
    iput-object p3, p0, La/j5v;->c:La/svu;

    .line 12
    .line 13
    iput-object p4, p0, La/j5v;->d:La/mne;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;La/qmu0;Ljava/lang/String;ZLa/zje;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    move-object/from16 v2, p5

    .line 6
    .line 7
    instance-of v3, v2, La/c5v;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, La/c5v;

    .line 13
    .line 14
    iget v4, v3, La/c5v;->s:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, La/c5v;->s:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, La/c5v;

    .line 27
    .line 28
    invoke-direct {v3, v1, v2}, La/c5v;-><init>(La/j5v;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, La/c5v;->q:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v5, v3, La/c5v;->s:I

    .line 36
    .line 37
    const/4 v6, 0x2

    .line 38
    const/4 v7, 0x3

    .line 39
    const/16 v8, 0xa

    .line 40
    .line 41
    const/4 v10, 0x1

    .line 42
    const/4 v11, 0x0

    .line 43
    if-eqz v5, :cond_4

    .line 44
    .line 45
    if-eq v5, v10, :cond_3

    .line 46
    .line 47
    if-eq v5, v6, :cond_2

    .line 48
    .line 49
    if-ne v5, v7, :cond_1

    .line 50
    .line 51
    iget-object v0, v3, La/c5v;->m:Ljava/util/LinkedHashSet;

    .line 52
    .line 53
    iget-object v1, v3, La/c5v;->l:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, Ljava/util/List;

    .line 56
    .line 57
    iget-object v3, v3, La/c5v;->i:La/qmu0;

    .line 58
    .line 59
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    move v6, v8

    .line 63
    goto/16 :goto_11

    .line 64
    .line 65
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 66
    .line 67
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-object v11

    .line 71
    :cond_2
    iget v0, v3, La/c5v;->p:I

    .line 72
    .line 73
    iget v5, v3, La/c5v;->o:I

    .line 74
    .line 75
    iget-boolean v12, v3, La/c5v;->n:Z

    .line 76
    .line 77
    iget-object v13, v3, La/c5v;->l:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v13, La/j5v;

    .line 80
    .line 81
    iget-object v14, v3, La/c5v;->k:Ljava/util/List;

    .line 82
    .line 83
    iget-object v15, v3, La/c5v;->j:Ljava/lang/String;

    .line 84
    .line 85
    iget-object v9, v3, La/c5v;->i:La/qmu0;

    .line 86
    .line 87
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    move v2, v12

    .line 91
    move v12, v5

    .line 92
    move v5, v2

    .line 93
    move v11, v0

    .line 94
    move-object v2, v9

    .line 95
    move/from16 v23, v10

    .line 96
    .line 97
    :goto_1
    move-object v9, v3

    .line 98
    move-object v3, v15

    .line 99
    goto/16 :goto_b

    .line 100
    .line 101
    :cond_3
    iget v5, v3, La/c5v;->p:I

    .line 102
    .line 103
    iget v9, v3, La/c5v;->o:I

    .line 104
    .line 105
    iget-boolean v12, v3, La/c5v;->n:Z

    .line 106
    .line 107
    iget-object v0, v3, La/c5v;->l:Ljava/lang/Object;

    .line 108
    .line 109
    move-object v13, v0

    .line 110
    check-cast v13, La/j5v;

    .line 111
    .line 112
    iget-object v14, v3, La/c5v;->k:Ljava/util/List;

    .line 113
    .line 114
    iget-object v15, v3, La/c5v;->j:Ljava/lang/String;

    .line 115
    .line 116
    iget-object v11, v3, La/c5v;->i:La/qmu0;

    .line 117
    .line 118
    :try_start_0
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    .line 120
    .line 121
    goto/16 :goto_4

    .line 122
    .line 123
    :catchall_0
    move-exception v0

    .line 124
    move-object v2, v11

    .line 125
    move v11, v5

    .line 126
    move v5, v9

    .line 127
    goto/16 :goto_6

    .line 128
    .line 129
    :cond_4
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    if-eqz v2, :cond_5

    .line 137
    .line 138
    sget-object v0, La/iun;->a:La/iun;

    .line 139
    .line 140
    return-object v0

    .line 141
    :cond_5
    new-instance v2, La/vvt;

    .line 142
    .line 143
    const/16 v5, 0x1c

    .line 144
    .line 145
    invoke-direct {v2, v5}, La/vvt;-><init>(B)V

    .line 146
    .line 147
    .line 148
    move-object/from16 v5, p1

    .line 149
    .line 150
    invoke-static {v5, v2}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    instance-of v5, v0, La/omu0;

    .line 155
    .line 156
    if-eqz v5, :cond_6

    .line 157
    .line 158
    move-object v5, v0

    .line 159
    check-cast v5, La/omu0;

    .line 160
    .line 161
    iget-byte v5, v5, La/omu0;->a:B

    .line 162
    .line 163
    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    :cond_6
    move/from16 v5, p4

    .line 168
    .line 169
    move-object v13, v1

    .line 170
    move-object v14, v2

    .line 171
    move-object v9, v3

    .line 172
    const/4 v11, 0x0

    .line 173
    const/4 v12, 0x0

    .line 174
    move-object/from16 v3, p3

    .line 175
    .line 176
    move-object v2, v0

    .line 177
    :goto_2
    :try_start_1
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 178
    .line 179
    iget-object v0, v13, La/j5v;->a:La/dn0;

    .line 180
    .line 181
    new-instance v15, Ljava/util/ArrayList;

    .line 182
    .line 183
    invoke-static {v14, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 184
    .line 185
    .line 186
    move-result v6

    .line 187
    invoke-direct {v15, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 188
    .line 189
    .line 190
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 195
    .line 196
    .line 197
    move-result v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 198
    if-eqz v16, :cond_7

    .line 199
    .line 200
    :try_start_2
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v16

    .line 204
    move-object/from16 v8, v16

    .line 205
    .line 206
    check-cast v8, La/gxy;

    .line 207
    .line 208
    iget-wide v7, v8, La/gxy;->a:J

    .line 209
    .line 210
    new-instance v10, Ljava/lang/Long;

    .line 211
    .line 212
    invoke-direct {v10, v7, v8}, Ljava/lang/Long;-><init>(J)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v15, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 216
    .line 217
    .line 218
    const/4 v7, 0x3

    .line 219
    const/16 v8, 0xa

    .line 220
    .line 221
    const/4 v10, 0x1

    .line 222
    goto :goto_3

    .line 223
    :catchall_1
    move-exception v0

    .line 224
    move v15, v12

    .line 225
    move v12, v5

    .line 226
    move v5, v15

    .line 227
    move-object v15, v3

    .line 228
    move-object v3, v9

    .line 229
    goto :goto_6

    .line 230
    :cond_7
    :try_start_3
    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 231
    .line 232
    .line 233
    move-result-object v17

    .line 234
    iget-object v6, v13, La/j5v;->b:La/j1q0;

    .line 235
    .line 236
    iget-object v6, v6, La/j1q0;->a:La/m1q0;

    .line 237
    .line 238
    invoke-virtual {v6}, La/m1q0;->a()Z

    .line 239
    .line 240
    .line 241
    move-result v18

    .line 242
    iput-object v2, v9, La/c5v;->i:La/qmu0;

    .line 243
    .line 244
    iput-object v3, v9, La/c5v;->j:Ljava/lang/String;

    .line 245
    .line 246
    iput-object v14, v9, La/c5v;->k:Ljava/util/List;

    .line 247
    .line 248
    iput-object v13, v9, La/c5v;->l:Ljava/lang/Object;

    .line 249
    .line 250
    iput-boolean v5, v9, La/c5v;->n:Z

    .line 251
    .line 252
    iput v12, v9, La/c5v;->o:I

    .line 253
    .line 254
    iput v11, v9, La/c5v;->p:I

    .line 255
    .line 256
    const/4 v6, 0x1

    .line 257
    iput v6, v9, La/c5v;->s:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 258
    .line 259
    const/16 v21, 0x1

    .line 260
    .line 261
    move-object/from16 v16, v0

    .line 262
    .line 263
    move-object/from16 v19, v3

    .line 264
    .line 265
    move/from16 v20, v5

    .line 266
    .line 267
    move-object/from16 v22, v9

    .line 268
    .line 269
    :try_start_4
    invoke-virtual/range {v16 .. v22}, La/dn0;->d(Ljava/util/Set;ZLjava/lang/String;ZZLa/zje;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 273
    if-ne v0, v4, :cond_8

    .line 274
    .line 275
    goto/16 :goto_10

    .line 276
    .line 277
    :cond_8
    move v5, v11

    .line 278
    move v9, v12

    .line 279
    move-object/from16 v15, v19

    .line 280
    .line 281
    move/from16 v12, v20

    .line 282
    .line 283
    move-object/from16 v3, v22

    .line 284
    .line 285
    move-object v11, v2

    .line 286
    move-object v2, v0

    .line 287
    :goto_4
    :try_start_5
    check-cast v2, Ljava/util/List;

    .line 288
    .line 289
    sget-object v0, La/j0g0;->b:La/e0g0;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 290
    .line 291
    move-object v0, v3

    .line 292
    move-object v3, v11

    .line 293
    goto/16 :goto_d

    .line 294
    .line 295
    :catchall_2
    move-exception v0

    .line 296
    :goto_5
    move v5, v12

    .line 297
    move-object/from16 v15, v19

    .line 298
    .line 299
    move/from16 v12, v20

    .line 300
    .line 301
    move-object/from16 v3, v22

    .line 302
    .line 303
    goto :goto_6

    .line 304
    :catchall_3
    move-exception v0

    .line 305
    move-object/from16 v19, v3

    .line 306
    .line 307
    move/from16 v20, v5

    .line 308
    .line 309
    move-object/from16 v22, v9

    .line 310
    .line 311
    goto :goto_5

    .line 312
    :goto_6
    if-eqz v5, :cond_9

    .line 313
    .line 314
    instance-of v6, v0, La/zhi0;

    .line 315
    .line 316
    if-eqz v6, :cond_9

    .line 317
    .line 318
    move-object v6, v0

    .line 319
    check-cast v6, La/zhi0;

    .line 320
    .line 321
    iget-boolean v6, v6, La/zhi0;->e:Z

    .line 322
    .line 323
    if-eqz v6, :cond_9

    .line 324
    .line 325
    const/4 v6, 0x1

    .line 326
    goto :goto_7

    .line 327
    :cond_9
    const/4 v6, 0x0

    .line 328
    :goto_7
    instance-of v7, v0, Ljava/util/concurrent/CancellationException;

    .line 329
    .line 330
    if-nez v7, :cond_1a

    .line 331
    .line 332
    instance-of v7, v0, Ljava/net/ConnectException;

    .line 333
    .line 334
    if-nez v7, :cond_1a

    .line 335
    .line 336
    if-nez v6, :cond_1a

    .line 337
    .line 338
    instance-of v6, v0, La/zhi0;

    .line 339
    .line 340
    if-eqz v6, :cond_c

    .line 341
    .line 342
    move-object v6, v0

    .line 343
    check-cast v6, La/zhi0;

    .line 344
    .line 345
    iget-boolean v7, v6, La/zhi0;->f:Z

    .line 346
    .line 347
    if-nez v7, :cond_b

    .line 348
    .line 349
    iget-boolean v6, v6, La/zhi0;->e:Z

    .line 350
    .line 351
    if-eqz v6, :cond_a

    .line 352
    .line 353
    goto :goto_9

    .line 354
    :cond_a
    const/4 v6, 0x0

    .line 355
    :goto_8
    const/16 v23, 0x1

    .line 356
    .line 357
    goto :goto_a

    .line 358
    :cond_b
    :goto_9
    const/4 v6, 0x1

    .line 359
    goto :goto_8

    .line 360
    :cond_c
    invoke-static {v0}, La/hic;->C(Ljava/lang/Throwable;)Z

    .line 361
    .line 362
    .line 363
    move-result v6

    .line 364
    if-nez v6, :cond_a

    .line 365
    .line 366
    goto :goto_9

    .line 367
    :goto_a
    add-int/lit8 v7, v11, 0x1

    .line 368
    .line 369
    const/4 v8, 0x3

    .line 370
    if-gt v7, v8, :cond_f

    .line 371
    .line 372
    if-eqz v6, :cond_d

    .line 373
    .line 374
    goto :goto_c

    .line 375
    :cond_d
    const-string v6, "error ("

    .line 376
    .line 377
    const-string v8, "): "

    .line 378
    .line 379
    invoke-static {v7, v6, v8, v0}, La/b1j;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    sget-object v6, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 384
    .line 385
    invoke-virtual {v6, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    iput-object v2, v3, La/c5v;->i:La/qmu0;

    .line 389
    .line 390
    iput-object v15, v3, La/c5v;->j:Ljava/lang/String;

    .line 391
    .line 392
    iput-object v14, v3, La/c5v;->k:Ljava/util/List;

    .line 393
    .line 394
    iput-object v13, v3, La/c5v;->l:Ljava/lang/Object;

    .line 395
    .line 396
    iput-boolean v12, v3, La/c5v;->n:Z

    .line 397
    .line 398
    iput v5, v3, La/c5v;->o:I

    .line 399
    .line 400
    iput v7, v3, La/c5v;->p:I

    .line 401
    .line 402
    const/4 v6, 0x2

    .line 403
    iput v6, v3, La/c5v;->s:I

    .line 404
    .line 405
    const-wide/16 v8, 0xbb8

    .line 406
    .line 407
    invoke-static {v8, v9, v3}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    if-ne v0, v4, :cond_e

    .line 412
    .line 413
    goto/16 :goto_10

    .line 414
    .line 415
    :cond_e
    move v9, v12

    .line 416
    move v12, v5

    .line 417
    move v5, v9

    .line 418
    move v11, v7

    .line 419
    goto/16 :goto_1

    .line 420
    .line 421
    :goto_b
    move/from16 v10, v23

    .line 422
    .line 423
    const/4 v7, 0x3

    .line 424
    const/16 v8, 0xa

    .line 425
    .line 426
    goto/16 :goto_2

    .line 427
    .line 428
    :cond_f
    :goto_c
    sget-object v5, La/j0g0;->b:La/e0g0;

    .line 429
    .line 430
    new-instance v5, La/g0g0;

    .line 431
    .line 432
    invoke-direct {v5, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 433
    .line 434
    .line 435
    move-object v0, v3

    .line 436
    move-object v3, v2

    .line 437
    move-object v2, v5

    .line 438
    :goto_d
    nop

    .line 439
    instance-of v5, v2, La/g0g0;

    .line 440
    .line 441
    if-eqz v5, :cond_10

    .line 442
    .line 443
    const/4 v2, 0x0

    .line 444
    :cond_10
    check-cast v2, Ljava/util/List;

    .line 445
    .line 446
    if-nez v2, :cond_11

    .line 447
    .line 448
    sget-object v0, La/iun;->a:La/iun;

    .line 449
    .line 450
    goto/16 :goto_14

    .line 451
    .line 452
    :cond_11
    new-instance v5, Ljava/util/ArrayList;

    .line 453
    .line 454
    const/16 v6, 0xa

    .line 455
    .line 456
    invoke-static {v14, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 457
    .line 458
    .line 459
    move-result v7

    .line 460
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 461
    .line 462
    .line 463
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 464
    .line 465
    .line 466
    move-result-object v6

    .line 467
    :goto_e
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 468
    .line 469
    .line 470
    move-result v7

    .line 471
    if-eqz v7, :cond_12

    .line 472
    .line 473
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v7

    .line 477
    check-cast v7, La/gxy;

    .line 478
    .line 479
    iget-wide v7, v7, La/gxy;->a:J

    .line 480
    .line 481
    invoke-static {v7, v8, v5}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 482
    .line 483
    .line 484
    goto :goto_e

    .line 485
    :cond_12
    new-instance v6, Ljava/util/ArrayList;

    .line 486
    .line 487
    const/16 v7, 0xa

    .line 488
    .line 489
    invoke-static {v2, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 490
    .line 491
    .line 492
    move-result v8

    .line 493
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 494
    .line 495
    .line 496
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 497
    .line 498
    .line 499
    move-result-object v7

    .line 500
    :goto_f
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 501
    .line 502
    .line 503
    move-result v8

    .line 504
    if-eqz v8, :cond_13

    .line 505
    .line 506
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v8

    .line 510
    check-cast v8, La/mlr;

    .line 511
    .line 512
    iget-wide v8, v8, La/mlr;->a:J

    .line 513
    .line 514
    invoke-static {v8, v9, v6}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 515
    .line 516
    .line 517
    goto :goto_f

    .line 518
    :cond_13
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 519
    .line 520
    .line 521
    move-result-object v6

    .line 522
    check-cast v6, Ljava/lang/Iterable;

    .line 523
    .line 524
    invoke-static {v5, v6}, Lkotlin/collections/CollectionsKt;->B0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 525
    .line 526
    .line 527
    move-result-object v7

    .line 528
    invoke-static {v5, v6}, Lkotlin/collections/CollectionsKt;->Z(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 529
    .line 530
    .line 531
    move-result-object v5

    .line 532
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 533
    .line 534
    .line 535
    move-result-object v6

    .line 536
    iput-object v3, v0, La/c5v;->i:La/qmu0;

    .line 537
    .line 538
    const/4 v7, 0x0

    .line 539
    iput-object v7, v0, La/c5v;->j:Ljava/lang/String;

    .line 540
    .line 541
    iput-object v7, v0, La/c5v;->k:Ljava/util/List;

    .line 542
    .line 543
    iput-object v2, v0, La/c5v;->l:Ljava/lang/Object;

    .line 544
    .line 545
    iput-object v5, v0, La/c5v;->m:Ljava/util/LinkedHashSet;

    .line 546
    .line 547
    iput-boolean v12, v0, La/c5v;->n:Z

    .line 548
    .line 549
    const/4 v8, 0x3

    .line 550
    iput v8, v0, La/c5v;->s:I

    .line 551
    .line 552
    iget-object v1, v1, La/j5v;->c:La/svu;

    .line 553
    .line 554
    invoke-virtual {v1, v6, v0}, La/svu;->c(Ljava/util/List;La/zje;)Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    if-ne v0, v4, :cond_14

    .line 559
    .line 560
    :goto_10
    return-object v4

    .line 561
    :cond_14
    move-object v1, v2

    .line 562
    move-object v0, v5

    .line 563
    const/16 v6, 0xa

    .line 564
    .line 565
    :goto_11
    invoke-static {v1, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 566
    .line 567
    .line 568
    move-result v2

    .line 569
    invoke-static {v2}, La/wp20;->a(I)I

    .line 570
    .line 571
    .line 572
    move-result v2

    .line 573
    const/16 v4, 0x10

    .line 574
    .line 575
    if-ge v2, v4, :cond_15

    .line 576
    .line 577
    move v2, v4

    .line 578
    :cond_15
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 579
    .line 580
    invoke-direct {v4, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 581
    .line 582
    .line 583
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 584
    .line 585
    .line 586
    move-result-object v1

    .line 587
    :goto_12
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 588
    .line 589
    .line 590
    move-result v2

    .line 591
    if-eqz v2, :cond_16

    .line 592
    .line 593
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    move-result-object v2

    .line 597
    move-object v5, v2

    .line 598
    check-cast v5, La/mlr;

    .line 599
    .line 600
    iget-wide v5, v5, La/mlr;->a:J

    .line 601
    .line 602
    new-instance v7, Ljava/lang/Long;

    .line 603
    .line 604
    invoke-direct {v7, v5, v6}, Ljava/lang/Long;-><init>(J)V

    .line 605
    .line 606
    .line 607
    invoke-interface {v4, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    goto :goto_12

    .line 611
    :cond_16
    new-instance v1, Ljava/util/ArrayList;

    .line 612
    .line 613
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 614
    .line 615
    .line 616
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 617
    .line 618
    .line 619
    move-result-object v0

    .line 620
    :cond_17
    :goto_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 621
    .line 622
    .line 623
    move-result v2

    .line 624
    if-eqz v2, :cond_18

    .line 625
    .line 626
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 627
    .line 628
    .line 629
    move-result-object v2

    .line 630
    check-cast v2, Ljava/lang/Number;

    .line 631
    .line 632
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 633
    .line 634
    .line 635
    move-result-wide v5

    .line 636
    new-instance v2, Ljava/lang/Long;

    .line 637
    .line 638
    invoke-direct {v2, v5, v6}, Ljava/lang/Long;-><init>(J)V

    .line 639
    .line 640
    .line 641
    invoke-virtual {v4, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 642
    .line 643
    .line 644
    move-result-object v2

    .line 645
    check-cast v2, La/mlr;

    .line 646
    .line 647
    if-eqz v2, :cond_17

    .line 648
    .line 649
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 650
    .line 651
    .line 652
    goto :goto_13

    .line 653
    :cond_18
    instance-of v0, v3, La/omu0;

    .line 654
    .line 655
    if-eqz v0, :cond_19

    .line 656
    .line 657
    check-cast v3, La/omu0;

    .line 658
    .line 659
    iget-byte v0, v3, La/omu0;->a:B

    .line 660
    .line 661
    invoke-static {v1, v0}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 662
    .line 663
    .line 664
    move-result-object v0

    .line 665
    goto :goto_14

    .line 666
    :cond_19
    move-object v0, v1

    .line 667
    :goto_14
    return-object v0

    .line 668
    :cond_1a
    throw v0
.end method
