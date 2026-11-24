.class public final La/dst;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/fst;

.field public final b:La/nmo;

.field public final c:La/onv;

.field public final d:La/pyg0;


# direct methods
.method public constructor <init>(La/fst;La/nmo;La/onv;La/pyg0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/dst;->a:La/fst;

    .line 11
    .line 12
    iput-object p2, p0, La/dst;->b:La/nmo;

    .line 13
    .line 14
    iput-object p3, p0, La/dst;->c:La/onv;

    .line 15
    .line 16
    iput-object p4, p0, La/dst;->d:La/pyg0;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic b(La/dst;La/zje;)Ljava/io/Serializable;
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    invoke-virtual {p0, v0, p1}, La/dst;->a(ILa/zje;)Ljava/io/Serializable;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method


# virtual methods
.method public final a(ILa/zje;)Ljava/io/Serializable;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, La/dst;->b:La/nmo;

    .line 6
    .line 7
    iget-object v2, v2, La/nmo;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, La/cu5;

    .line 10
    .line 11
    instance-of v3, v1, La/cst;

    .line 12
    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    move-object v3, v1

    .line 16
    check-cast v3, La/cst;

    .line 17
    .line 18
    iget v4, v3, La/cst;->n:I

    .line 19
    .line 20
    const/high16 v5, -0x80000000

    .line 21
    .line 22
    and-int v6, v4, v5

    .line 23
    .line 24
    if-eqz v6, :cond_0

    .line 25
    .line 26
    sub-int/2addr v4, v5

    .line 27
    iput v4, v3, La/cst;->n:I

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance v3, La/cst;

    .line 31
    .line 32
    invoke-direct {v3, v0, v1}, La/cst;-><init>(La/dst;La/zje;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    iget-object v1, v3, La/cst;->l:Ljava/lang/Object;

    .line 36
    .line 37
    sget-object v4, La/wne;->a:La/wne;

    .line 38
    .line 39
    iget v5, v3, La/cst;->n:I

    .line 40
    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v7, 0x0

    .line 43
    const/4 v8, 0x4

    .line 44
    const/4 v9, 0x3

    .line 45
    const/4 v10, 0x2

    .line 46
    const/4 v11, 0x1

    .line 47
    const/16 v12, 0xa

    .line 48
    .line 49
    if-eqz v5, :cond_5

    .line 50
    .line 51
    if-eq v5, v11, :cond_4

    .line 52
    .line 53
    if-eq v5, v10, :cond_3

    .line 54
    .line 55
    if-eq v5, v9, :cond_2

    .line 56
    .line 57
    if-ne v5, v8, :cond_1

    .line 58
    .line 59
    iget v0, v3, La/cst;->i:I

    .line 60
    .line 61
    iget-object v2, v3, La/cst;->j:Ljava/util/List;

    .line 62
    .line 63
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto/16 :goto_10

    .line 67
    .line 68
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-object v6

    .line 74
    :cond_2
    iget-boolean v0, v3, La/cst;->k:Z

    .line 75
    .line 76
    iget v5, v3, La/cst;->i:I

    .line 77
    .line 78
    iget-object v6, v3, La/cst;->j:Ljava/util/List;

    .line 79
    .line 80
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    goto/16 :goto_d

    .line 84
    .line 85
    :cond_3
    iget-boolean v5, v3, La/cst;->k:Z

    .line 86
    .line 87
    iget v10, v3, La/cst;->i:I

    .line 88
    .line 89
    iget-object v13, v3, La/cst;->j:Ljava/util/List;

    .line 90
    .line 91
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    move-object/from16 v19, v13

    .line 95
    .line 96
    move v13, v5

    .line 97
    move v5, v10

    .line 98
    :goto_1
    move-object/from16 v10, v19

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_4
    iget v5, v3, La/cst;->i:I

    .line 102
    .line 103
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    move/from16 v19, v5

    .line 107
    .line 108
    move-object v5, v1

    .line 109
    move/from16 v1, v19

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_5
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    move/from16 v1, p1

    .line 116
    .line 117
    iput v1, v3, La/cst;->i:I

    .line 118
    .line 119
    iput v11, v3, La/cst;->n:I

    .line 120
    .line 121
    iget-object v5, v0, La/dst;->a:La/fst;

    .line 122
    .line 123
    invoke-virtual {v5, v3}, La/fst;->a(La/zje;)Ljava/io/Serializable;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    if-ne v5, v4, :cond_6

    .line 128
    .line 129
    goto/16 :goto_f

    .line 130
    .line 131
    :cond_6
    :goto_2
    check-cast v5, Ljava/util/List;

    .line 132
    .line 133
    iget-object v13, v0, La/dst;->c:La/onv;

    .line 134
    .line 135
    iget-object v13, v13, La/onv;->a:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v13, La/cu5;

    .line 138
    .line 139
    iget-object v13, v13, La/cu5;->f:La/q7d0;

    .line 140
    .line 141
    const-string v14, "PROMOTIONS_WERE_LAUNCHED"

    .line 142
    .line 143
    invoke-virtual {v13}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 144
    .line 145
    .line 146
    move-result-object v13

    .line 147
    invoke-interface {v13, v14, v7}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 148
    .line 149
    .line 150
    move-result v13

    .line 151
    iput-object v5, v3, La/cst;->j:Ljava/util/List;

    .line 152
    .line 153
    iput v1, v3, La/cst;->i:I

    .line 154
    .line 155
    iput-boolean v13, v3, La/cst;->k:Z

    .line 156
    .line 157
    iput v10, v3, La/cst;->n:I

    .line 158
    .line 159
    iget-object v10, v2, La/cu5;->b:La/jr5;

    .line 160
    .line 161
    invoke-virtual {v10, v3}, La/jr5;->a(La/zje;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v10

    .line 165
    if-ne v10, v4, :cond_7

    .line 166
    .line 167
    goto/16 :goto_f

    .line 168
    .line 169
    :cond_7
    move-object/from16 v19, v5

    .line 170
    .line 171
    move v5, v1

    .line 172
    move-object v1, v10

    .line 173
    goto :goto_1

    .line 174
    :goto_3
    check-cast v1, Ljava/util/List;

    .line 175
    .line 176
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    if-nez v1, :cond_9

    .line 181
    .line 182
    if-nez v13, :cond_8

    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_8
    move-object v6, v10

    .line 186
    :goto_4
    move v0, v5

    .line 187
    goto/16 :goto_e

    .line 188
    .line 189
    :cond_9
    :goto_5
    new-instance v1, Ljava/util/ArrayList;

    .line 190
    .line 191
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 192
    .line 193
    .line 194
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 195
    .line 196
    .line 197
    move-result-object v14

    .line 198
    :goto_6
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 199
    .line 200
    .line 201
    move-result v15

    .line 202
    if-eqz v15, :cond_b

    .line 203
    .line 204
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v15

    .line 208
    check-cast v15, Lkotlin/Pair;

    .line 209
    .line 210
    iget-object v15, v15, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v15, Ljava/util/List;

    .line 213
    .line 214
    new-instance v8, Ljava/util/ArrayList;

    .line 215
    .line 216
    invoke-static {v15, v12}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 217
    .line 218
    .line 219
    move-result v7

    .line 220
    invoke-direct {v8, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 221
    .line 222
    .line 223
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 224
    .line 225
    .line 226
    move-result-object v7

    .line 227
    :goto_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 228
    .line 229
    .line 230
    move-result v15

    .line 231
    if-eqz v15, :cond_a

    .line 232
    .line 233
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v15

    .line 237
    check-cast v15, La/kr5;

    .line 238
    .line 239
    iget v15, v15, La/kr5;->b:I

    .line 240
    .line 241
    new-instance v11, Ljava/lang/Integer;

    .line 242
    .line 243
    invoke-direct {v11, v15}, Ljava/lang/Integer;-><init>(I)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    const/4 v11, 0x1

    .line 250
    goto :goto_7

    .line 251
    :cond_a
    invoke-static {v1, v8}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 252
    .line 253
    .line 254
    const/4 v7, 0x0

    .line 255
    const/4 v8, 0x4

    .line 256
    const/4 v11, 0x1

    .line 257
    goto :goto_6

    .line 258
    :cond_b
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->O0(Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    iput-object v10, v3, La/cst;->j:Ljava/util/List;

    .line 267
    .line 268
    iput v5, v3, La/cst;->i:I

    .line 269
    .line 270
    iput-boolean v13, v3, La/cst;->k:Z

    .line 271
    .line 272
    iput v9, v3, La/cst;->n:I

    .line 273
    .line 274
    iget-object v0, v0, La/dst;->d:La/pyg0;

    .line 275
    .line 276
    iget-object v0, v0, La/pyg0;->a:La/cu5;

    .line 277
    .line 278
    iget-object v7, v0, La/cu5;->f:La/q7d0;

    .line 279
    .line 280
    invoke-virtual {v7}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 281
    .line 282
    .line 283
    move-result-object v7

    .line 284
    const-string v8, "FIRST_SAVE_SEEN_CMS_BANNER_TIMESTAMP"

    .line 285
    .line 286
    const-wide/16 v14, 0x0

    .line 287
    .line 288
    invoke-interface {v7, v8, v14, v15}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 289
    .line 290
    .line 291
    move-result-wide v17

    .line 292
    cmp-long v7, v17, v14

    .line 293
    .line 294
    if-nez v7, :cond_c

    .line 295
    .line 296
    iget-object v7, v0, La/cu5;->f:La/q7d0;

    .line 297
    .line 298
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 299
    .line 300
    .line 301
    move-result-wide v14

    .line 302
    invoke-virtual {v7, v8, v14, v15}, La/q7d0;->f(Ljava/lang/String;J)V

    .line 303
    .line 304
    .line 305
    :cond_c
    iget-object v0, v0, La/cu5;->b:La/jr5;

    .line 306
    .line 307
    iget-object v7, v0, La/jr5;->n:Ljava/util/LinkedHashSet;

    .line 308
    .line 309
    invoke-interface {v7, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 310
    .line 311
    .line 312
    iget-object v0, v0, La/jr5;->m:La/n0o0;

    .line 313
    .line 314
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    check-cast v0, La/vn50;

    .line 319
    .line 320
    new-instance v7, Ljava/util/ArrayList;

    .line 321
    .line 322
    invoke-static {v1, v12}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 323
    .line 324
    .line 325
    move-result v8

    .line 326
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 327
    .line 328
    .line 329
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 334
    .line 335
    .line 336
    move-result v8

    .line 337
    if-eqz v8, :cond_d

    .line 338
    .line 339
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v8

    .line 343
    check-cast v8, Ljava/lang/Number;

    .line 344
    .line 345
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 346
    .line 347
    .line 348
    move-result v8

    .line 349
    new-instance v9, La/un50;

    .line 350
    .line 351
    invoke-direct {v9, v8}, La/un50;-><init>(I)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    goto :goto_8

    .line 358
    :cond_d
    iget-object v1, v0, La/vn50;->a:La/zdg0;

    .line 359
    .line 360
    new-instance v8, La/hk40;

    .line 361
    .line 362
    const/16 v9, 0xc

    .line 363
    .line 364
    invoke-direct {v8, v0, v7, v6, v9}, La/hk40;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 365
    .line 366
    .line 367
    const/4 v0, 0x0

    .line 368
    const/4 v6, 0x1

    .line 369
    invoke-static {v3, v1, v8, v0, v6}, La/sj3;->w0(La/yje;La/zdg0;Lkotlin/jvm/functions/Function2;ZZ)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    sget-object v1, La/wne;->a:La/wne;

    .line 374
    .line 375
    if-ne v0, v1, :cond_e

    .line 376
    .line 377
    goto :goto_9

    .line 378
    :cond_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 379
    .line 380
    :goto_9
    if-ne v0, v1, :cond_f

    .line 381
    .line 382
    goto :goto_a

    .line 383
    :cond_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 384
    .line 385
    :goto_a
    if-ne v0, v1, :cond_10

    .line 386
    .line 387
    goto :goto_b

    .line 388
    :cond_10
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 389
    .line 390
    :goto_b
    if-ne v0, v1, :cond_11

    .line 391
    .line 392
    goto :goto_c

    .line 393
    :cond_11
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 394
    .line 395
    :goto_c
    if-ne v0, v4, :cond_12

    .line 396
    .line 397
    goto :goto_f

    .line 398
    :cond_12
    move-object v6, v10

    .line 399
    move v0, v13

    .line 400
    :goto_d
    move v13, v0

    .line 401
    goto/16 :goto_4

    .line 402
    .line 403
    :goto_e
    iput-object v6, v3, La/cst;->j:Ljava/util/List;

    .line 404
    .line 405
    iput v0, v3, La/cst;->i:I

    .line 406
    .line 407
    iput-boolean v13, v3, La/cst;->k:Z

    .line 408
    .line 409
    const/4 v1, 0x4

    .line 410
    iput v1, v3, La/cst;->n:I

    .line 411
    .line 412
    iget-object v1, v2, La/cu5;->b:La/jr5;

    .line 413
    .line 414
    invoke-virtual {v1, v3}, La/jr5;->a(La/zje;)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v1

    .line 418
    if-ne v1, v4, :cond_13

    .line 419
    .line 420
    :goto_f
    return-object v4

    .line 421
    :cond_13
    move-object v2, v6

    .line 422
    :goto_10
    check-cast v1, Ljava/util/List;

    .line 423
    .line 424
    new-instance v3, Ljava/util/ArrayList;

    .line 425
    .line 426
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 427
    .line 428
    .line 429
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 430
    .line 431
    .line 432
    move-result-object v2

    .line 433
    :cond_14
    :goto_11
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 434
    .line 435
    .line 436
    move-result v4

    .line 437
    if-eqz v4, :cond_16

    .line 438
    .line 439
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v4

    .line 443
    move-object v5, v4

    .line 444
    check-cast v5, Lkotlin/Pair;

    .line 445
    .line 446
    iget-object v5, v5, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 447
    .line 448
    check-cast v5, La/xs5;

    .line 449
    .line 450
    const/4 v6, -0x1

    .line 451
    if-eq v0, v6, :cond_15

    .line 452
    .line 453
    iget v5, v5, La/xs5;->a:I

    .line 454
    .line 455
    if-ne v0, v5, :cond_14

    .line 456
    .line 457
    :cond_15
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    goto :goto_11

    .line 461
    :cond_16
    new-instance v0, Ljava/util/ArrayList;

    .line 462
    .line 463
    invoke-static {v3, v12}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 464
    .line 465
    .line 466
    move-result v2

    .line 467
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 468
    .line 469
    .line 470
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 471
    .line 472
    .line 473
    move-result-object v2

    .line 474
    :goto_12
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 475
    .line 476
    .line 477
    move-result v3

    .line 478
    if-eqz v3, :cond_18

    .line 479
    .line 480
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v3

    .line 484
    check-cast v3, Lkotlin/Pair;

    .line 485
    .line 486
    iget-object v4, v3, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 487
    .line 488
    check-cast v4, La/xs5;

    .line 489
    .line 490
    iget-object v3, v3, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 491
    .line 492
    check-cast v3, Ljava/util/List;

    .line 493
    .line 494
    new-instance v5, Ljava/util/ArrayList;

    .line 495
    .line 496
    invoke-static {v3, v12}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 497
    .line 498
    .line 499
    move-result v6

    .line 500
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 501
    .line 502
    .line 503
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 504
    .line 505
    .line 506
    move-result-object v3

    .line 507
    :goto_13
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 508
    .line 509
    .line 510
    move-result v6

    .line 511
    if-eqz v6, :cond_17

    .line 512
    .line 513
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v6

    .line 517
    check-cast v6, La/kr5;

    .line 518
    .line 519
    new-instance v7, La/q2b;

    .line 520
    .line 521
    iget v8, v6, La/kr5;->b:I

    .line 522
    .line 523
    invoke-static {v8, v1}, La/rz4;->C(ILjava/util/List;)Z

    .line 524
    .line 525
    .line 526
    move-result v8

    .line 527
    const/16 v16, 0x1

    .line 528
    .line 529
    xor-int/lit8 v8, v8, 0x1

    .line 530
    .line 531
    invoke-direct {v7, v6, v8}, La/q2b;-><init>(La/kr5;Z)V

    .line 532
    .line 533
    .line 534
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 535
    .line 536
    .line 537
    goto :goto_13

    .line 538
    :cond_17
    const/16 v16, 0x1

    .line 539
    .line 540
    new-instance v3, La/ft5;

    .line 541
    .line 542
    invoke-direct {v3, v4, v5}, La/ft5;-><init>(La/xs5;Ljava/util/ArrayList;)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 546
    .line 547
    .line 548
    goto :goto_12

    .line 549
    :cond_18
    return-object v0
.end method
