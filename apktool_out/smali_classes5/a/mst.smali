.class public final La/mst;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:La/kmq;

.field public final synthetic b:La/kki;

.field public final synthetic c:J

.field public final synthetic d:Z

.field public final synthetic e:J

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Ljava/util/List;

.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:Z

.field public final synthetic j:Z


# direct methods
.method public constructor <init>(La/kmq;La/kki;JZJLjava/lang/String;Ljava/util/List;Ljava/util/List;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/mst;->a:La/kmq;

    .line 5
    .line 6
    iput-object p2, p0, La/mst;->b:La/kki;

    .line 7
    .line 8
    iput-wide p3, p0, La/mst;->c:J

    .line 9
    .line 10
    iput-boolean p5, p0, La/mst;->d:Z

    .line 11
    .line 12
    iput-wide p6, p0, La/mst;->e:J

    .line 13
    .line 14
    iput-object p8, p0, La/mst;->f:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p9, p0, La/mst;->g:Ljava/util/List;

    .line 17
    .line 18
    iput-object p10, p0, La/mst;->h:Ljava/util/List;

    .line 19
    .line 20
    iput-boolean p11, p0, La/mst;->i:Z

    .line 21
    .line 22
    iput-boolean p12, p0, La/mst;->j:Z

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 48

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, La/mst;->b:La/kki;

    .line 6
    .line 7
    iget-object v3, v2, La/kki;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, La/j1q0;

    .line 10
    .line 11
    iget-object v2, v2, La/kki;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, La/yi6;

    .line 14
    .line 15
    instance-of v4, v1, La/lst;

    .line 16
    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    move-object v4, v1

    .line 20
    check-cast v4, La/lst;

    .line 21
    .line 22
    iget v5, v4, La/lst;->j:I

    .line 23
    .line 24
    const/high16 v6, -0x80000000

    .line 25
    .line 26
    and-int v7, v5, v6

    .line 27
    .line 28
    if-eqz v7, :cond_0

    .line 29
    .line 30
    sub-int/2addr v5, v6

    .line 31
    iput v5, v4, La/lst;->j:I

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance v4, La/lst;

    .line 35
    .line 36
    invoke-direct {v4, v0, v1}, La/lst;-><init>(La/mst;La/yje;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    iget-object v1, v4, La/lst;->i:Ljava/lang/Object;

    .line 40
    .line 41
    sget-object v5, La/wne;->a:La/wne;

    .line 42
    .line 43
    iget v6, v4, La/lst;->j:I

    .line 44
    .line 45
    const/4 v7, 0x1

    .line 46
    const/4 v8, 0x0

    .line 47
    if-eqz v6, :cond_2

    .line 48
    .line 49
    if-ne v6, v7, :cond_1

    .line 50
    .line 51
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_13

    .line 55
    .line 56
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object v8

    .line 62
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    move-object/from16 v1, p1

    .line 66
    .line 67
    check-cast v1, La/eh6;

    .line 68
    .line 69
    instance-of v6, v1, La/dh6;

    .line 70
    .line 71
    if-eqz v6, :cond_3

    .line 72
    .line 73
    check-cast v1, La/dh6;

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    move-object v1, v8

    .line 77
    :goto_1
    if-eqz v1, :cond_4

    .line 78
    .line 79
    iget-object v1, v1, La/dh6;->a:Ljava/util/ArrayList;

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_4
    move-object v1, v8

    .line 83
    :goto_2
    if-nez v1, :cond_5

    .line 84
    .line 85
    sget-object v1, La/iun;->a:La/iun;

    .line 86
    .line 87
    :cond_5
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    iget-wide v9, v0, La/mst;->c:J

    .line 96
    .line 97
    if-eqz v6, :cond_7

    .line 98
    .line 99
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    move-object v11, v6

    .line 104
    check-cast v11, La/xf6;

    .line 105
    .line 106
    iget-object v11, v11, La/xf6;->a:La/mh6;

    .line 107
    .line 108
    iget-wide v11, v11, La/mh6;->a:J

    .line 109
    .line 110
    cmp-long v11, v11, v9

    .line 111
    .line 112
    if-nez v11, :cond_6

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_7
    move-object v6, v8

    .line 116
    :goto_3
    check-cast v6, La/xf6;

    .line 117
    .line 118
    iget-object v1, v2, La/yi6;->a:La/xi6;

    .line 119
    .line 120
    iget-object v1, v1, La/xi6;->b:Ljava/util/LinkedHashMap;

    .line 121
    .line 122
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 123
    .line 124
    .line 125
    move-result-object v11

    .line 126
    invoke-virtual {v1, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    check-cast v1, Ljava/util/List;

    .line 131
    .line 132
    if-nez v1, :cond_8

    .line 133
    .line 134
    sget-object v1, La/iun;->a:La/iun;

    .line 135
    .line 136
    :cond_8
    move-object v12, v1

    .line 137
    const/16 v18, 0x0

    .line 138
    .line 139
    if-eqz v6, :cond_14

    .line 140
    .line 141
    iget-object v11, v0, La/mst;->f:Ljava/lang/String;

    .line 142
    .line 143
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    iget-object v13, v6, La/xf6;->a:La/mh6;

    .line 147
    .line 148
    iget-wide v13, v13, La/mh6;->a:J

    .line 149
    .line 150
    iget-object v6, v6, La/xf6;->b:Ljava/util/List;

    .line 151
    .line 152
    new-instance v15, Ljava/util/LinkedHashMap;

    .line 153
    .line 154
    invoke-direct {v15}, Ljava/util/LinkedHashMap;-><init>()V

    .line 155
    .line 156
    .line 157
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v16

    .line 165
    if-eqz v16, :cond_a

    .line 166
    .line 167
    move-object/from16 p2, v8

    .line 168
    .line 169
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    move-object v7, v8

    .line 174
    check-cast v7, La/ei6;

    .line 175
    .line 176
    move-object/from16 v43, v2

    .line 177
    .line 178
    iget-wide v1, v7, La/ei6;->k:J

    .line 179
    .line 180
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-virtual {v15, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    if-nez v2, :cond_9

    .line 189
    .line 190
    new-instance v2, Ljava/util/ArrayList;

    .line 191
    .line 192
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 193
    .line 194
    .line 195
    invoke-interface {v15, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    :cond_9
    check-cast v2, Ljava/util/List;

    .line 199
    .line 200
    invoke-interface {v2, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-object/from16 v8, p2

    .line 204
    .line 205
    move-object/from16 v2, v43

    .line 206
    .line 207
    const/4 v7, 0x1

    .line 208
    goto :goto_4

    .line 209
    :cond_a
    move-object/from16 v43, v2

    .line 210
    .line 211
    move-object/from16 p2, v8

    .line 212
    .line 213
    new-instance v1, Ljava/util/ArrayList;

    .line 214
    .line 215
    invoke-interface {v15}, Ljava/util/Map;->size()I

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v15}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 231
    .line 232
    .line 233
    move-result v6

    .line 234
    if-eqz v6, :cond_13

    .line 235
    .line 236
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v6

    .line 240
    check-cast v6, Ljava/util/Map$Entry;

    .line 241
    .line 242
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v7

    .line 246
    check-cast v7, Ljava/lang/Number;

    .line 247
    .line 248
    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    .line 249
    .line 250
    .line 251
    move-result-wide v21

    .line 252
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v6

    .line 256
    check-cast v6, Ljava/util/List;

    .line 257
    .line 258
    new-instance v7, Ljava/util/ArrayList;

    .line 259
    .line 260
    const/16 v8, 0xa

    .line 261
    .line 262
    invoke-static {v6, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 263
    .line 264
    .line 265
    move-result v15

    .line 266
    invoke-direct {v7, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 267
    .line 268
    .line 269
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 270
    .line 271
    .line 272
    move-result-object v6

    .line 273
    move/from16 v20, v18

    .line 274
    .line 275
    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 276
    .line 277
    .line 278
    move-result v8

    .line 279
    iget-boolean v15, v0, La/mst;->d:Z

    .line 280
    .line 281
    if-eqz v8, :cond_12

    .line 282
    .line 283
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v8

    .line 287
    add-int/lit8 v16, v20, 0x1

    .line 288
    .line 289
    if-ltz v20, :cond_11

    .line 290
    .line 291
    check-cast v8, La/ei6;

    .line 292
    .line 293
    new-instance v19, La/ig7;

    .line 294
    .line 295
    move-wide/from16 v44, v9

    .line 296
    .line 297
    iget-wide v9, v8, La/ei6;->a:J

    .line 298
    .line 299
    move-object/from16 v17, v2

    .line 300
    .line 301
    iget-object v2, v8, La/ei6;->f:Ljava/lang/String;

    .line 302
    .line 303
    move-wide/from16 v23, v9

    .line 304
    .line 305
    iget-wide v9, v8, La/ei6;->e:D

    .line 306
    .line 307
    move-wide/from16 v25, v9

    .line 308
    .line 309
    iget-wide v9, v8, La/ei6;->d:D

    .line 310
    .line 311
    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v31

    .line 315
    move-object/from16 v46, v6

    .line 316
    .line 317
    iget-boolean v6, v8, La/ei6;->b:Z

    .line 318
    .line 319
    move-wide/from16 v29, v9

    .line 320
    .line 321
    iget-wide v9, v8, La/ei6;->e:D

    .line 322
    .line 323
    const-wide/16 v27, 0x0

    .line 324
    .line 325
    cmpg-double v27, v9, v27

    .line 326
    .line 327
    move/from16 v32, v6

    .line 328
    .line 329
    const-string v6, "SP"

    .line 330
    .line 331
    if-nez v27, :cond_b

    .line 332
    .line 333
    goto :goto_7

    .line 334
    :cond_b
    invoke-virtual {v2, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    move-result v28

    .line 338
    if-eqz v28, :cond_c

    .line 339
    .line 340
    :goto_7
    move-object/from16 v34, v6

    .line 341
    .line 342
    :goto_8
    move-object/from16 v47, v11

    .line 343
    .line 344
    goto :goto_9

    .line 345
    :cond_c
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 346
    .line 347
    .line 348
    move-result v28

    .line 349
    if-lez v28, :cond_d

    .line 350
    .line 351
    move-object/from16 v34, v2

    .line 352
    .line 353
    goto :goto_8

    .line 354
    :cond_d
    sget-object v28, La/pn40;->a:La/pn40;

    .line 355
    .line 356
    move-object/from16 v47, v11

    .line 357
    .line 358
    sget-object v11, La/p3u0;->e:La/p3u0;

    .line 359
    .line 360
    invoke-static {v9, v10, v11}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v9

    .line 364
    move-object/from16 v34, v9

    .line 365
    .line 366
    :goto_9
    iget-object v9, v8, La/ei6;->c:La/rh7;

    .line 367
    .line 368
    if-eqz v15, :cond_e

    .line 369
    .line 370
    sget-object v10, La/uoy;->d:La/uoy;

    .line 371
    .line 372
    :goto_a
    move-object/from16 v36, v10

    .line 373
    .line 374
    goto :goto_b

    .line 375
    :cond_e
    sget-object v10, La/uoy;->e:La/uoy;

    .line 376
    .line 377
    goto :goto_a

    .line 378
    :goto_b
    if-nez v27, :cond_f

    .line 379
    .line 380
    goto :goto_c

    .line 381
    :cond_f
    invoke-virtual {v2, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result v6

    .line 385
    if-eqz v6, :cond_10

    .line 386
    .line 387
    :goto_c
    const/16 v37, 0x1

    .line 388
    .line 389
    goto :goto_d

    .line 390
    :cond_10
    move/from16 v37, v18

    .line 391
    .line 392
    :goto_d
    sget-object v38, La/yfa0;->INSTANCE:La/yfa0;

    .line 393
    .line 394
    iget-wide v10, v8, La/ei6;->h:J

    .line 395
    .line 396
    iget-object v6, v8, La/ei6;->i:La/afo;

    .line 397
    .line 398
    const/16 v39, 0x0

    .line 399
    .line 400
    move-object/from16 v33, v2

    .line 401
    .line 402
    move-object/from16 v42, v6

    .line 403
    .line 404
    move-object/from16 v35, v9

    .line 405
    .line 406
    move-wide/from16 v40, v10

    .line 407
    .line 408
    move-wide/from16 v27, v21

    .line 409
    .line 410
    move-wide/from16 v21, v23

    .line 411
    .line 412
    move-wide/from16 v23, v13

    .line 413
    .line 414
    invoke-direct/range {v19 .. v42}, La/ig7;-><init>(IJJDJDLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;La/rh7;La/uoy;ZLa/yfa0;ZJLa/afo;)V

    .line 415
    .line 416
    .line 417
    move-object/from16 v2, v19

    .line 418
    .line 419
    move-wide/from16 v21, v27

    .line 420
    .line 421
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move/from16 v20, v16

    .line 425
    .line 426
    move-object/from16 v2, v17

    .line 427
    .line 428
    move-wide/from16 v9, v44

    .line 429
    .line 430
    move-object/from16 v6, v46

    .line 431
    .line 432
    move-object/from16 v11, v47

    .line 433
    .line 434
    goto/16 :goto_6

    .line 435
    .line 436
    :cond_11
    invoke-static {}, La/q3d;->p()V

    .line 437
    .line 438
    .line 439
    throw p2

    .line 440
    :cond_12
    move-object/from16 v17, v2

    .line 441
    .line 442
    move-wide/from16 v44, v9

    .line 443
    .line 444
    move-object/from16 v47, v11

    .line 445
    .line 446
    move-wide/from16 v23, v13

    .line 447
    .line 448
    invoke-static {v7}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 449
    .line 450
    .line 451
    move-result-object v20

    .line 452
    new-instance v19, La/h07;

    .line 453
    .line 454
    move-wide/from16 v26, v23

    .line 455
    .line 456
    const/16 v23, 0x0

    .line 457
    .line 458
    iget-wide v6, v0, La/mst;->e:J

    .line 459
    .line 460
    move-wide/from16 v28, v6

    .line 461
    .line 462
    move/from16 v25, v15

    .line 463
    .line 464
    move-object/from16 v24, v47

    .line 465
    .line 466
    invoke-direct/range {v19 .. v29}, La/h07;-><init>(Ljava/util/List;JZLjava/lang/String;ZJJ)V

    .line 467
    .line 468
    .line 469
    move-object/from16 v2, v19

    .line 470
    .line 471
    move-wide/from16 v23, v26

    .line 472
    .line 473
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 474
    .line 475
    .line 476
    move-object/from16 v2, v17

    .line 477
    .line 478
    move-wide/from16 v13, v23

    .line 479
    .line 480
    goto/16 :goto_5

    .line 481
    .line 482
    :cond_13
    move-object v8, v1

    .line 483
    :goto_e
    move-wide/from16 v44, v9

    .line 484
    .line 485
    goto :goto_f

    .line 486
    :cond_14
    move-object/from16 v43, v2

    .line 487
    .line 488
    move-object/from16 p2, v8

    .line 489
    .line 490
    goto :goto_e

    .line 491
    :goto_f
    if-nez v8, :cond_15

    .line 492
    .line 493
    sget-object v8, La/iun;->a:La/iun;

    .line 494
    .line 495
    :cond_15
    new-instance v1, Ljava/util/ArrayList;

    .line 496
    .line 497
    const/16 v2, 0xa

    .line 498
    .line 499
    invoke-static {v8, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 500
    .line 501
    .line 502
    move-result v2

    .line 503
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 504
    .line 505
    .line 506
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 507
    .line 508
    .line 509
    move-result-object v2

    .line 510
    :goto_10
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 511
    .line 512
    .line 513
    move-result v6

    .line 514
    if-eqz v6, :cond_18

    .line 515
    .line 516
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v6

    .line 520
    move-object v11, v6

    .line 521
    check-cast v11, La/h07;

    .line 522
    .line 523
    iget-object v6, v3, La/j1q0;->a:La/m1q0;

    .line 524
    .line 525
    invoke-virtual {v6}, La/m1q0;->j()Z

    .line 526
    .line 527
    .line 528
    move-result v15

    .line 529
    iget-object v6, v3, La/j1q0;->a:La/m1q0;

    .line 530
    .line 531
    invoke-virtual {v6}, La/m1q0;->f()Z

    .line 532
    .line 533
    .line 534
    move-result v6

    .line 535
    if-nez v6, :cond_17

    .line 536
    .line 537
    iget-boolean v6, v0, La/mst;->j:Z

    .line 538
    .line 539
    if-eqz v6, :cond_16

    .line 540
    .line 541
    goto :goto_11

    .line 542
    :cond_16
    move/from16 v17, v18

    .line 543
    .line 544
    goto :goto_12

    .line 545
    :cond_17
    :goto_11
    const/16 v17, 0x1

    .line 546
    .line 547
    :goto_12
    iget-object v13, v0, La/mst;->g:Ljava/util/List;

    .line 548
    .line 549
    iget-object v14, v0, La/mst;->h:Ljava/util/List;

    .line 550
    .line 551
    iget-boolean v6, v0, La/mst;->i:Z

    .line 552
    .line 553
    move/from16 v16, v6

    .line 554
    .line 555
    invoke-static/range {v11 .. v17}, La/vdx;->c0(La/h07;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZ)La/sr20;

    .line 556
    .line 557
    .line 558
    move-result-object v6

    .line 559
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 560
    .line 561
    .line 562
    goto :goto_10

    .line 563
    :cond_18
    move-object/from16 v6, v43

    .line 564
    .line 565
    iget-object v2, v6, La/yi6;->a:La/xi6;

    .line 566
    .line 567
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 568
    .line 569
    .line 570
    iget-object v2, v2, La/xi6;->b:Ljava/util/LinkedHashMap;

    .line 571
    .line 572
    invoke-static/range {v44 .. v45}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 573
    .line 574
    .line 575
    move-result-object v3

    .line 576
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    const/4 v2, 0x1

    .line 580
    iput v2, v4, La/lst;->j:I

    .line 581
    .line 582
    iget-object v0, v0, La/mst;->a:La/kmq;

    .line 583
    .line 584
    invoke-interface {v0, v1, v4}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    if-ne v0, v5, :cond_19

    .line 589
    .line 590
    return-object v5

    .line 591
    :cond_19
    :goto_13
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 592
    .line 593
    return-object v0
.end method
