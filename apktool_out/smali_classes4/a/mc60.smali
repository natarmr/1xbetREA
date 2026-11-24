.class public final La/mc60;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/aer;


# instance fields
.field public i:La/pzu;

.field public j:J

.field public k:Z

.field public synthetic l:La/o530;

.field public synthetic m:Ljava/util/HashMap;

.field public synthetic n:Ljava/util/List;

.field public synthetic o:Ljava/util/List;

.field public synthetic p:Ljava/util/List;

.field public final synthetic q:J

.field public final synthetic r:La/pzu;

.field public final synthetic s:J


# direct methods
.method public constructor <init>(JLa/pzu;JLa/yje;)V
    .locals 0

    .line 1
    iput-wide p1, p0, La/mc60;->q:J

    .line 2
    .line 3
    iput-object p3, p0, La/mc60;->r:La/pzu;

    .line 4
    .line 5
    iput-wide p4, p0, La/mc60;->s:J

    .line 6
    .line 7
    const/4 p1, 0x6

    .line 8
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    iget-object v8, v7, La/mc60;->l:La/o530;

    .line 4
    .line 5
    iget-object v2, v7, La/mc60;->m:Ljava/util/HashMap;

    .line 6
    .line 7
    iget-object v9, v7, La/mc60;->n:Ljava/util/List;

    .line 8
    .line 9
    iget-object v10, v7, La/mc60;->o:Ljava/util/List;

    .line 10
    .line 11
    iget-object v0, v7, La/mc60;->p:Ljava/util/List;

    .line 12
    .line 13
    sget-object v11, La/wne;->a:La/wne;

    .line 14
    .line 15
    iget-boolean v1, v7, La/mc60;->k:Z

    .line 16
    .line 17
    const/4 v12, 0x1

    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    if-ne v1, v12, :cond_0

    .line 22
    .line 23
    iget-wide v0, v7, La/mc60;->j:J

    .line 24
    .line 25
    iget-object v2, v7, La/mc60;->i:La/pzu;

    .line 26
    .line 27
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    move v14, v12

    .line 31
    move-wide v12, v0

    .line 32
    move-object/from16 v1, p1

    .line 33
    .line 34
    goto/16 :goto_d

    .line 35
    .line 36
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 37
    .line 38
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-object v3

    .line 42
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-wide v4, v7, La/mc60;->q:J

    .line 46
    .line 47
    const-wide/16 v13, -0x1a

    .line 48
    .line 49
    cmp-long v1, v4, v13

    .line 50
    .line 51
    if-nez v1, :cond_2

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    sget-object v0, La/iun;->a:La/iun;

    .line 55
    .line 56
    :goto_0
    iget-object v1, v8, La/o530;->b:Ljava/util/List;

    .line 57
    .line 58
    iget-object v4, v7, La/mc60;->r:La/pzu;

    .line 59
    .line 60
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-nez v4, :cond_9

    .line 68
    .line 69
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->N0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    new-instance v5, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 76
    .line 77
    .line 78
    new-instance v6, Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object v13

    .line 87
    :cond_3
    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v14

    .line 91
    if-eqz v14, :cond_4

    .line 92
    .line 93
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v14

    .line 97
    move-object v15, v14

    .line 98
    check-cast v15, La/wt20;

    .line 99
    .line 100
    iget v15, v15, La/wt20;->c:I

    .line 101
    .line 102
    if-eqz v15, :cond_3

    .line 103
    .line 104
    invoke-virtual {v6, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_4
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v13

    .line 116
    if-eqz v13, :cond_8

    .line 117
    .line 118
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v13

    .line 122
    check-cast v13, La/wt20;

    .line 123
    .line 124
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object v14

    .line 128
    :goto_3
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v15

    .line 132
    if-eqz v15, :cond_6

    .line 133
    .line 134
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v15

    .line 138
    move-object v12, v15

    .line 139
    check-cast v12, La/xt20;

    .line 140
    .line 141
    move-object/from16 p1, v4

    .line 142
    .line 143
    iget-wide v3, v12, La/xt20;->b:J

    .line 144
    .line 145
    move-object v12, v0

    .line 146
    move-object/from16 v18, v1

    .line 147
    .line 148
    iget-wide v0, v13, La/wt20;->a:J

    .line 149
    .line 150
    cmp-long v0, v3, v0

    .line 151
    .line 152
    if-nez v0, :cond_5

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_5
    move-object/from16 v4, p1

    .line 156
    .line 157
    move-object v0, v12

    .line 158
    move-object/from16 v1, v18

    .line 159
    .line 160
    const/4 v3, 0x0

    .line 161
    const/4 v12, 0x1

    .line 162
    goto :goto_3

    .line 163
    :cond_6
    move-object v12, v0

    .line 164
    move-object/from16 v18, v1

    .line 165
    .line 166
    move-object/from16 p1, v4

    .line 167
    .line 168
    const/4 v15, 0x0

    .line 169
    :goto_4
    move-object/from16 v19, v15

    .line 170
    .line 171
    check-cast v19, La/xt20;

    .line 172
    .line 173
    if-eqz v19, :cond_7

    .line 174
    .line 175
    const-wide/16 v24, 0x0

    .line 176
    .line 177
    const/16 v26, 0xbf

    .line 178
    .line 179
    const/16 v20, 0x0

    .line 180
    .line 181
    const/16 v21, 0x0

    .line 182
    .line 183
    const-wide/16 v22, 0x0

    .line 184
    .line 185
    invoke-static/range {v19 .. v26}, La/xt20;->a(La/xt20;Ljava/util/ArrayList;ZJDI)La/xt20;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    move-object/from16 v15, v19

    .line 190
    .line 191
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-object/from16 v0, p1

    .line 195
    .line 196
    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    goto :goto_5

    .line 200
    :cond_7
    move-object/from16 v0, p1

    .line 201
    .line 202
    :goto_5
    move-object v4, v0

    .line 203
    move-object v0, v12

    .line 204
    move-object/from16 v1, v18

    .line 205
    .line 206
    const/4 v3, 0x0

    .line 207
    const/4 v12, 0x1

    .line 208
    goto :goto_2

    .line 209
    :cond_8
    move-object v12, v0

    .line 210
    move-object v0, v4

    .line 211
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 212
    .line 213
    .line 214
    move-object v1, v5

    .line 215
    goto :goto_6

    .line 216
    :cond_9
    move-object v12, v0

    .line 217
    move-object/from16 v18, v1

    .line 218
    .line 219
    :goto_6
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->N0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    const-wide/16 v3, 0x0

    .line 228
    .line 229
    if-nez v0, :cond_10

    .line 230
    .line 231
    new-instance v0, Ljava/util/ArrayList;

    .line 232
    .line 233
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 234
    .line 235
    .line 236
    new-instance v5, Ljava/util/ArrayList;

    .line 237
    .line 238
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 239
    .line 240
    .line 241
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 242
    .line 243
    .line 244
    move-result-object v6

    .line 245
    :cond_a
    :goto_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 246
    .line 247
    .line 248
    move-result v12

    .line 249
    if-eqz v12, :cond_b

    .line 250
    .line 251
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v12

    .line 255
    move-object v13, v12

    .line 256
    check-cast v13, La/wt20;

    .line 257
    .line 258
    iget-boolean v13, v13, La/wt20;->d:Z

    .line 259
    .line 260
    if-eqz v13, :cond_a

    .line 261
    .line 262
    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    goto :goto_7

    .line 266
    :cond_b
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 267
    .line 268
    .line 269
    move-result-object v6

    .line 270
    :goto_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 271
    .line 272
    .line 273
    move-result v12

    .line 274
    if-eqz v12, :cond_f

    .line 275
    .line 276
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v12

    .line 280
    check-cast v12, La/xt20;

    .line 281
    .line 282
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 283
    .line 284
    .line 285
    move-result-object v13

    .line 286
    :goto_9
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 287
    .line 288
    .line 289
    move-result v14

    .line 290
    if-eqz v14, :cond_d

    .line 291
    .line 292
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v14

    .line 296
    move-object v15, v14

    .line 297
    check-cast v15, La/wt20;

    .line 298
    .line 299
    move-object/from16 v18, v2

    .line 300
    .line 301
    move-wide/from16 v19, v3

    .line 302
    .line 303
    iget-wide v2, v15, La/wt20;->a:J

    .line 304
    .line 305
    move-wide/from16 v21, v2

    .line 306
    .line 307
    iget-wide v2, v12, La/xt20;->b:J

    .line 308
    .line 309
    cmp-long v2, v21, v2

    .line 310
    .line 311
    if-nez v2, :cond_c

    .line 312
    .line 313
    goto :goto_a

    .line 314
    :cond_c
    move-object/from16 v2, v18

    .line 315
    .line 316
    move-wide/from16 v3, v19

    .line 317
    .line 318
    goto :goto_9

    .line 319
    :cond_d
    move-object/from16 v18, v2

    .line 320
    .line 321
    move-wide/from16 v19, v3

    .line 322
    .line 323
    const/4 v14, 0x0

    .line 324
    :goto_a
    check-cast v14, La/wt20;

    .line 325
    .line 326
    if-nez v14, :cond_e

    .line 327
    .line 328
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    move-wide/from16 v3, v19

    .line 332
    .line 333
    goto :goto_b

    .line 334
    :cond_e
    const-wide/16 v2, 0x1

    .line 335
    .line 336
    add-long v3, v19, v2

    .line 337
    .line 338
    :goto_b
    move-object/from16 v2, v18

    .line 339
    .line 340
    goto :goto_8

    .line 341
    :cond_f
    move-object/from16 v18, v2

    .line 342
    .line 343
    move-wide/from16 v19, v3

    .line 344
    .line 345
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 349
    .line 350
    .line 351
    move-wide/from16 v12, v19

    .line 352
    .line 353
    goto :goto_c

    .line 354
    :cond_10
    move-object/from16 v18, v2

    .line 355
    .line 356
    move-wide v12, v3

    .line 357
    :goto_c
    iput-object v8, v7, La/mc60;->l:La/o530;

    .line 358
    .line 359
    const/4 v0, 0x0

    .line 360
    iput-object v0, v7, La/mc60;->m:Ljava/util/HashMap;

    .line 361
    .line 362
    iput-object v9, v7, La/mc60;->n:Ljava/util/List;

    .line 363
    .line 364
    iput-object v10, v7, La/mc60;->o:Ljava/util/List;

    .line 365
    .line 366
    iput-object v0, v7, La/mc60;->p:Ljava/util/List;

    .line 367
    .line 368
    iget-object v0, v7, La/mc60;->r:La/pzu;

    .line 369
    .line 370
    iput-object v0, v7, La/mc60;->i:La/pzu;

    .line 371
    .line 372
    iput-wide v12, v7, La/mc60;->j:J

    .line 373
    .line 374
    const/4 v14, 0x1

    .line 375
    iput-boolean v14, v7, La/mc60;->k:Z

    .line 376
    .line 377
    iget-wide v3, v7, La/mc60;->q:J

    .line 378
    .line 379
    iget-wide v5, v7, La/mc60;->s:J

    .line 380
    .line 381
    move-object/from16 v2, v18

    .line 382
    .line 383
    invoke-virtual/range {v0 .. v7}, La/pzu;->s0(Ljava/util/ArrayList;Ljava/util/HashMap;JJLa/zje;)Ljava/io/Serializable;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    if-ne v1, v11, :cond_11

    .line 388
    .line 389
    return-object v11

    .line 390
    :cond_11
    move-object v2, v0

    .line 391
    :goto_d
    check-cast v1, Ljava/util/List;

    .line 392
    .line 393
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    new-instance v0, Ljava/util/ArrayList;

    .line 397
    .line 398
    const/16 v2, 0xa

    .line 399
    .line 400
    invoke-static {v1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 401
    .line 402
    .line 403
    move-result v3

    .line 404
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 405
    .line 406
    .line 407
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 412
    .line 413
    .line 414
    move-result v3

    .line 415
    if-eqz v3, :cond_1b

    .line 416
    .line 417
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v3

    .line 421
    move-object v15, v3

    .line 422
    check-cast v15, La/xt20;

    .line 423
    .line 424
    iget-object v3, v15, La/xt20;->a:Ljava/util/List;

    .line 425
    .line 426
    new-instance v4, Ljava/util/ArrayList;

    .line 427
    .line 428
    invoke-static {v3, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 429
    .line 430
    .line 431
    move-result v5

    .line 432
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 433
    .line 434
    .line 435
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 436
    .line 437
    .line 438
    move-result-object v3

    .line 439
    :goto_f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 440
    .line 441
    .line 442
    move-result v5

    .line 443
    if-eqz v5, :cond_1a

    .line 444
    .line 445
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v5

    .line 449
    check-cast v5, Ljava/util/List;

    .line 450
    .line 451
    new-instance v6, Ljava/util/ArrayList;

    .line 452
    .line 453
    invoke-static {v5, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 454
    .line 455
    .line 456
    move-result v11

    .line 457
    invoke-direct {v6, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 458
    .line 459
    .line 460
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 461
    .line 462
    .line 463
    move-result-object v5

    .line 464
    :goto_10
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 465
    .line 466
    .line 467
    move-result v11

    .line 468
    if-eqz v11, :cond_19

    .line 469
    .line 470
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v11

    .line 474
    check-cast v11, La/dao;

    .line 475
    .line 476
    move-object/from16 v16, v3

    .line 477
    .line 478
    iget-wide v2, v7, La/mc60;->s:J

    .line 479
    .line 480
    const/16 v17, 0x0

    .line 481
    .line 482
    if-eqz v9, :cond_13

    .line 483
    .line 484
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 485
    .line 486
    .line 487
    move-result v18

    .line 488
    if-eqz v18, :cond_13

    .line 489
    .line 490
    :cond_12
    move-object/from16 v24, v1

    .line 491
    .line 492
    move-wide/from16 v19, v2

    .line 493
    .line 494
    move/from16 v1, v17

    .line 495
    .line 496
    goto :goto_12

    .line 497
    :cond_13
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 498
    .line 499
    .line 500
    move-result-object v18

    .line 501
    :goto_11
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    .line 502
    .line 503
    .line 504
    move-result v19

    .line 505
    if-eqz v19, :cond_12

    .line 506
    .line 507
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object v19

    .line 511
    move-object/from16 v14, v19

    .line 512
    .line 513
    check-cast v14, La/ru6;

    .line 514
    .line 515
    move-object/from16 v24, v1

    .line 516
    .line 517
    move-wide/from16 v19, v2

    .line 518
    .line 519
    iget-wide v1, v14, La/ru6;->d:J

    .line 520
    .line 521
    cmp-long v1, v1, v19

    .line 522
    .line 523
    if-nez v1, :cond_14

    .line 524
    .line 525
    iget-wide v1, v14, La/ru6;->h:J

    .line 526
    .line 527
    move-wide/from16 v21, v1

    .line 528
    .line 529
    iget-wide v1, v11, La/dao;->b:J

    .line 530
    .line 531
    cmp-long v1, v21, v1

    .line 532
    .line 533
    if-nez v1, :cond_14

    .line 534
    .line 535
    iget-wide v1, v14, La/ru6;->g:J

    .line 536
    .line 537
    iget-object v3, v11, La/dao;->m:La/sh7;

    .line 538
    .line 539
    move-wide/from16 v21, v1

    .line 540
    .line 541
    iget-wide v1, v3, La/sh7;->a:J

    .line 542
    .line 543
    cmp-long v1, v21, v1

    .line 544
    .line 545
    if-nez v1, :cond_14

    .line 546
    .line 547
    iget-wide v1, v14, La/ru6;->f:D

    .line 548
    .line 549
    move-wide/from16 v21, v1

    .line 550
    .line 551
    iget-wide v1, v11, La/dao;->f:D

    .line 552
    .line 553
    cmpg-double v1, v21, v1

    .line 554
    .line 555
    if-nez v1, :cond_14

    .line 556
    .line 557
    const/4 v1, 0x1

    .line 558
    goto :goto_12

    .line 559
    :cond_14
    move-wide/from16 v2, v19

    .line 560
    .line 561
    move-object/from16 v1, v24

    .line 562
    .line 563
    const/4 v14, 0x1

    .line 564
    goto :goto_11

    .line 565
    :goto_12
    if-eqz v10, :cond_16

    .line 566
    .line 567
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    .line 568
    .line 569
    .line 570
    move-result v2

    .line 571
    if-eqz v2, :cond_16

    .line 572
    .line 573
    :cond_15
    move-object v14, v9

    .line 574
    move-object/from16 v25, v10

    .line 575
    .line 576
    move/from16 v2, v17

    .line 577
    .line 578
    goto :goto_14

    .line 579
    :cond_16
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 580
    .line 581
    .line 582
    move-result-object v2

    .line 583
    :goto_13
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 584
    .line 585
    .line 586
    move-result v3

    .line 587
    if-eqz v3, :cond_15

    .line 588
    .line 589
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v3

    .line 593
    check-cast v3, La/pbs0;

    .line 594
    .line 595
    iget-object v3, v3, La/pbs0;->b:La/m97;

    .line 596
    .line 597
    move-object v14, v9

    .line 598
    move-object/from16 v25, v10

    .line 599
    .line 600
    iget-wide v9, v3, La/m97;->a:J

    .line 601
    .line 602
    cmp-long v9, v9, v19

    .line 603
    .line 604
    if-nez v9, :cond_17

    .line 605
    .line 606
    iget-wide v9, v3, La/m97;->h:J

    .line 607
    .line 608
    move-wide/from16 v21, v9

    .line 609
    .line 610
    iget-wide v9, v11, La/dao;->b:J

    .line 611
    .line 612
    cmp-long v9, v21, v9

    .line 613
    .line 614
    if-nez v9, :cond_17

    .line 615
    .line 616
    iget-wide v9, v3, La/m97;->f:J

    .line 617
    .line 618
    move-object/from16 v18, v2

    .line 619
    .line 620
    iget-object v2, v11, La/dao;->m:La/sh7;

    .line 621
    .line 622
    move-wide/from16 v21, v9

    .line 623
    .line 624
    iget-wide v9, v2, La/sh7;->a:J

    .line 625
    .line 626
    cmp-long v2, v21, v9

    .line 627
    .line 628
    if-nez v2, :cond_18

    .line 629
    .line 630
    iget-wide v2, v3, La/m97;->k:D

    .line 631
    .line 632
    iget-wide v9, v11, La/dao;->f:D

    .line 633
    .line 634
    cmpg-double v2, v2, v9

    .line 635
    .line 636
    if-nez v2, :cond_18

    .line 637
    .line 638
    const/4 v2, 0x1

    .line 639
    goto :goto_14

    .line 640
    :cond_17
    move-object/from16 v18, v2

    .line 641
    .line 642
    :cond_18
    move-object v9, v14

    .line 643
    move-object/from16 v2, v18

    .line 644
    .line 645
    move-object/from16 v10, v25

    .line 646
    .line 647
    goto :goto_13

    .line 648
    :goto_14
    const v3, 0x73fff

    .line 649
    .line 650
    .line 651
    invoke-static {v11, v1, v2, v3}, La/dao;->a(La/dao;ZZI)La/dao;

    .line 652
    .line 653
    .line 654
    move-result-object v1

    .line 655
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 656
    .line 657
    .line 658
    move-object v9, v14

    .line 659
    move-object/from16 v3, v16

    .line 660
    .line 661
    move-object/from16 v1, v24

    .line 662
    .line 663
    move-object/from16 v10, v25

    .line 664
    .line 665
    const/16 v2, 0xa

    .line 666
    .line 667
    const/4 v14, 0x1

    .line 668
    goto/16 :goto_10

    .line 669
    .line 670
    :cond_19
    move-object/from16 v24, v1

    .line 671
    .line 672
    move-object/from16 v16, v3

    .line 673
    .line 674
    move-object v14, v9

    .line 675
    move-object/from16 v25, v10

    .line 676
    .line 677
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 678
    .line 679
    .line 680
    const/16 v2, 0xa

    .line 681
    .line 682
    const/4 v14, 0x1

    .line 683
    goto/16 :goto_f

    .line 684
    .line 685
    :cond_1a
    move-object/from16 v24, v1

    .line 686
    .line 687
    move-object v14, v9

    .line 688
    move-object/from16 v25, v10

    .line 689
    .line 690
    const-wide/16 v20, 0x0

    .line 691
    .line 692
    const/16 v22, 0xfe

    .line 693
    .line 694
    const/16 v17, 0x0

    .line 695
    .line 696
    const-wide/16 v18, 0x0

    .line 697
    .line 698
    move-object/from16 v16, v4

    .line 699
    .line 700
    invoke-static/range {v15 .. v22}, La/xt20;->a(La/xt20;Ljava/util/ArrayList;ZJDI)La/xt20;

    .line 701
    .line 702
    .line 703
    move-result-object v1

    .line 704
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 705
    .line 706
    .line 707
    move-object/from16 v1, v24

    .line 708
    .line 709
    const/16 v2, 0xa

    .line 710
    .line 711
    const/4 v14, 0x1

    .line 712
    goto/16 :goto_e

    .line 713
    .line 714
    :cond_1b
    iget-boolean v1, v8, La/o530;->a:Z

    .line 715
    .line 716
    if-eqz v1, :cond_1c

    .line 717
    .line 718
    sget-object v0, La/bx7;->a:La/bx7;

    .line 719
    .line 720
    return-object v0

    .line 721
    :cond_1c
    iget-object v1, v8, La/o530;->b:Ljava/util/List;

    .line 722
    .line 723
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 724
    .line 725
    .line 726
    move-result v1

    .line 727
    if-eqz v1, :cond_1d

    .line 728
    .line 729
    sget-object v0, La/zw7;->a:La/zw7;

    .line 730
    .line 731
    return-object v0

    .line 732
    :cond_1d
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 733
    .line 734
    .line 735
    move-result v1

    .line 736
    if-nez v1, :cond_1e

    .line 737
    .line 738
    new-instance v1, La/xw7;

    .line 739
    .line 740
    invoke-direct {v1, v12, v13, v0}, La/xw7;-><init>(JLjava/util/ArrayList;)V

    .line 741
    .line 742
    .line 743
    return-object v1

    .line 744
    :cond_1e
    new-instance v0, La/vw7;

    .line 745
    .line 746
    invoke-direct {v0, v12, v13}, La/vw7;-><init>(J)V

    .line 747
    .line 748
    .line 749
    return-object v0
.end method

.method public final n(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, La/o530;

    .line 2
    .line 3
    check-cast p2, Ljava/util/HashMap;

    .line 4
    .line 5
    check-cast p3, Ljava/util/List;

    .line 6
    .line 7
    check-cast p4, Ljava/util/List;

    .line 8
    .line 9
    check-cast p5, Ljava/util/List;

    .line 10
    .line 11
    move-object v6, p6

    .line 12
    check-cast v6, La/yje;

    .line 13
    .line 14
    new-instance v0, La/mc60;

    .line 15
    .line 16
    iget-object v3, p0, La/mc60;->r:La/pzu;

    .line 17
    .line 18
    iget-wide v4, p0, La/mc60;->s:J

    .line 19
    .line 20
    iget-wide v1, p0, La/mc60;->q:J

    .line 21
    .line 22
    invoke-direct/range {v0 .. v6}, La/mc60;-><init>(JLa/pzu;JLa/yje;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, v0, La/mc60;->l:La/o530;

    .line 26
    .line 27
    iput-object p2, v0, La/mc60;->m:Ljava/util/HashMap;

    .line 28
    .line 29
    iput-object p3, v0, La/mc60;->n:Ljava/util/List;

    .line 30
    .line 31
    iput-object p4, v0, La/mc60;->o:Ljava/util/List;

    .line 32
    .line 33
    iput-object p5, v0, La/mc60;->p:Ljava/util/List;

    .line 34
    .line 35
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    invoke-virtual {v0, p0}, La/mc60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method
