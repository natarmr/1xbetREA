.class public final La/nyt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/syt;

.field public final b:La/uyn;

.field public final c:La/qyg0;

.field public final d:La/bzu;


# direct methods
.method public constructor <init>(La/syt;La/uyn;La/qyg0;La/bzu;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/nyt;->a:La/syt;

    .line 11
    .line 12
    iput-object p2, p0, La/nyt;->b:La/uyn;

    .line 13
    .line 14
    iput-object p3, p0, La/nyt;->c:La/qyg0;

    .line 15
    .line 16
    iput-object p4, p0, La/nyt;->d:La/bzu;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(La/mvc;La/zje;)Ljava/io/Serializable;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, La/nyt;->b:La/uyn;

    .line 6
    .line 7
    iget-object v2, v2, La/uyn;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, La/rwc;

    .line 10
    .line 11
    instance-of v3, v1, La/myt;

    .line 12
    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    move-object v3, v1

    .line 16
    check-cast v3, La/myt;

    .line 17
    .line 18
    iget v4, v3, La/myt;->m:I

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
    iput v4, v3, La/myt;->m:I

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance v3, La/myt;

    .line 31
    .line 32
    invoke-direct {v3, v0, v1}, La/myt;-><init>(La/nyt;La/zje;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    iget-object v1, v3, La/myt;->k:Ljava/lang/Object;

    .line 36
    .line 37
    sget-object v4, La/wne;->a:La/wne;

    .line 38
    .line 39
    iget v5, v3, La/myt;->m:I

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
    iget-object v0, v3, La/myt;->i:Ljava/util/List;

    .line 60
    .line 61
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto/16 :goto_e

    .line 65
    .line 66
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 67
    .line 68
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-object v6

    .line 72
    :cond_2
    iget-boolean v0, v3, La/myt;->j:Z

    .line 73
    .line 74
    iget-object v5, v3, La/myt;->i:Ljava/util/List;

    .line 75
    .line 76
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    goto/16 :goto_b

    .line 80
    .line 81
    :cond_3
    iget-boolean v5, v3, La/myt;->j:Z

    .line 82
    .line 83
    iget-object v10, v3, La/myt;->i:Ljava/util/List;

    .line 84
    .line 85
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_4
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_5
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    iput v11, v3, La/myt;->m:I

    .line 97
    .line 98
    iget-object v1, v0, La/nyt;->a:La/syt;

    .line 99
    .line 100
    move-object/from16 v5, p1

    .line 101
    .line 102
    invoke-virtual {v1, v5, v3}, La/syt;->b(La/mvc;La/zje;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    if-ne v1, v4, :cond_6

    .line 107
    .line 108
    goto/16 :goto_d

    .line 109
    .line 110
    :cond_6
    :goto_1
    check-cast v1, Ljava/util/List;

    .line 111
    .line 112
    iget-object v5, v0, La/nyt;->d:La/bzu;

    .line 113
    .line 114
    iget-object v5, v5, La/bzu;->b:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v5, La/rwc;

    .line 117
    .line 118
    iget-object v5, v5, La/rwc;->g:La/q7d0;

    .line 119
    .line 120
    const-string v13, "CMS_PROMOTIONS_WERE_LAUNCHED"

    .line 121
    .line 122
    invoke-virtual {v5}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    invoke-interface {v5, v13, v7}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    iput-object v1, v3, La/myt;->i:Ljava/util/List;

    .line 131
    .line 132
    iput-boolean v5, v3, La/myt;->j:Z

    .line 133
    .line 134
    iput v10, v3, La/myt;->m:I

    .line 135
    .line 136
    iget-object v10, v2, La/rwc;->c:La/nhf0;

    .line 137
    .line 138
    invoke-virtual {v10, v3}, La/nhf0;->k(La/zje;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v10

    .line 142
    if-ne v10, v4, :cond_7

    .line 143
    .line 144
    goto/16 :goto_d

    .line 145
    .line 146
    :cond_7
    move-object/from16 v18, v10

    .line 147
    .line 148
    move-object v10, v1

    .line 149
    move-object/from16 v1, v18

    .line 150
    .line 151
    :goto_2
    check-cast v1, Ljava/util/List;

    .line 152
    .line 153
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    if-nez v1, :cond_9

    .line 158
    .line 159
    if-nez v5, :cond_8

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_8
    move-object v0, v10

    .line 163
    goto/16 :goto_c

    .line 164
    .line 165
    :cond_9
    :goto_3
    new-instance v1, Ljava/util/ArrayList;

    .line 166
    .line 167
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 168
    .line 169
    .line 170
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object v13

    .line 174
    :goto_4
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result v14

    .line 178
    if-eqz v14, :cond_b

    .line 179
    .line 180
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v14

    .line 184
    check-cast v14, La/awc;

    .line 185
    .line 186
    iget-object v14, v14, La/awc;->c:Ljava/util/List;

    .line 187
    .line 188
    new-instance v15, Ljava/util/ArrayList;

    .line 189
    .line 190
    invoke-static {v14, v12}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 191
    .line 192
    .line 193
    move-result v8

    .line 194
    invoke-direct {v15, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 195
    .line 196
    .line 197
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 198
    .line 199
    .line 200
    move-result-object v8

    .line 201
    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 202
    .line 203
    .line 204
    move-result v14

    .line 205
    if-eqz v14, :cond_a

    .line 206
    .line 207
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v14

    .line 211
    check-cast v14, La/uvc;

    .line 212
    .line 213
    iget v14, v14, La/uvc;->a:I

    .line 214
    .line 215
    new-instance v7, Ljava/lang/Integer;

    .line 216
    .line 217
    invoke-direct {v7, v14}, Ljava/lang/Integer;-><init>(I)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v15, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    const/4 v7, 0x0

    .line 224
    goto :goto_5

    .line 225
    :cond_a
    invoke-static {v1, v15}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 226
    .line 227
    .line 228
    const/4 v7, 0x0

    .line 229
    const/4 v8, 0x4

    .line 230
    goto :goto_4

    .line 231
    :cond_b
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->O0(Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    iput-object v10, v3, La/myt;->i:Ljava/util/List;

    .line 240
    .line 241
    iput-boolean v5, v3, La/myt;->j:Z

    .line 242
    .line 243
    iput v9, v3, La/myt;->m:I

    .line 244
    .line 245
    iget-object v0, v0, La/nyt;->c:La/qyg0;

    .line 246
    .line 247
    iget-object v0, v0, La/qyg0;->a:La/rwc;

    .line 248
    .line 249
    iget-object v7, v0, La/rwc;->g:La/q7d0;

    .line 250
    .line 251
    invoke-virtual {v7}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 252
    .line 253
    .line 254
    move-result-object v7

    .line 255
    const-string v8, "FIRST_SAVE_SEEN_BANNER_TIMESTAMP"

    .line 256
    .line 257
    const-wide/16 v13, 0x0

    .line 258
    .line 259
    invoke-interface {v7, v8, v13, v14}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 260
    .line 261
    .line 262
    move-result-wide v16

    .line 263
    cmp-long v7, v16, v13

    .line 264
    .line 265
    if-nez v7, :cond_c

    .line 266
    .line 267
    iget-object v7, v0, La/rwc;->g:La/q7d0;

    .line 268
    .line 269
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 270
    .line 271
    .line 272
    move-result-wide v13

    .line 273
    invoke-virtual {v7, v8, v13, v14}, La/q7d0;->f(Ljava/lang/String;J)V

    .line 274
    .line 275
    .line 276
    :cond_c
    iget-object v0, v0, La/rwc;->c:La/nhf0;

    .line 277
    .line 278
    iget-object v7, v0, La/nhf0;->c:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v7, Ljava/util/LinkedHashSet;

    .line 281
    .line 282
    invoke-interface {v7, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 283
    .line 284
    .line 285
    iget-object v0, v0, La/nhf0;->b:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v0, La/n0o0;

    .line 288
    .line 289
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    check-cast v0, La/sr50;

    .line 294
    .line 295
    new-instance v7, Ljava/util/ArrayList;

    .line 296
    .line 297
    invoke-static {v1, v12}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 298
    .line 299
    .line 300
    move-result v8

    .line 301
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 302
    .line 303
    .line 304
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 309
    .line 310
    .line 311
    move-result v8

    .line 312
    if-eqz v8, :cond_d

    .line 313
    .line 314
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v8

    .line 318
    check-cast v8, Ljava/lang/Number;

    .line 319
    .line 320
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 321
    .line 322
    .line 323
    move-result v8

    .line 324
    new-instance v9, La/rr50;

    .line 325
    .line 326
    invoke-direct {v9, v8}, La/rr50;-><init>(I)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    goto :goto_6

    .line 333
    :cond_d
    iget-object v1, v0, La/sr50;->a:La/zdg0;

    .line 334
    .line 335
    new-instance v8, La/hk40;

    .line 336
    .line 337
    const/16 v9, 0x12

    .line 338
    .line 339
    invoke-direct {v8, v0, v7, v6, v9}, La/hk40;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 340
    .line 341
    .line 342
    const/4 v0, 0x0

    .line 343
    invoke-static {v3, v1, v8, v0, v11}, La/sj3;->w0(La/yje;La/zdg0;Lkotlin/jvm/functions/Function2;ZZ)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    sget-object v1, La/wne;->a:La/wne;

    .line 348
    .line 349
    if-ne v0, v1, :cond_e

    .line 350
    .line 351
    goto :goto_7

    .line 352
    :cond_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 353
    .line 354
    :goto_7
    if-ne v0, v1, :cond_f

    .line 355
    .line 356
    goto :goto_8

    .line 357
    :cond_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 358
    .line 359
    :goto_8
    if-ne v0, v1, :cond_10

    .line 360
    .line 361
    goto :goto_9

    .line 362
    :cond_10
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 363
    .line 364
    :goto_9
    if-ne v0, v1, :cond_11

    .line 365
    .line 366
    goto :goto_a

    .line 367
    :cond_11
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 368
    .line 369
    :goto_a
    if-ne v0, v4, :cond_12

    .line 370
    .line 371
    goto :goto_d

    .line 372
    :cond_12
    move v0, v5

    .line 373
    move-object v5, v10

    .line 374
    :goto_b
    move-object/from16 v18, v5

    .line 375
    .line 376
    move v5, v0

    .line 377
    move-object/from16 v0, v18

    .line 378
    .line 379
    :goto_c
    iput-object v0, v3, La/myt;->i:Ljava/util/List;

    .line 380
    .line 381
    iput-boolean v5, v3, La/myt;->j:Z

    .line 382
    .line 383
    const/4 v1, 0x4

    .line 384
    iput v1, v3, La/myt;->m:I

    .line 385
    .line 386
    iget-object v1, v2, La/rwc;->c:La/nhf0;

    .line 387
    .line 388
    invoke-virtual {v1, v3}, La/nhf0;->k(La/zje;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v1

    .line 392
    if-ne v1, v4, :cond_13

    .line 393
    .line 394
    :goto_d
    return-object v4

    .line 395
    :cond_13
    :goto_e
    check-cast v1, Ljava/util/List;

    .line 396
    .line 397
    new-instance v2, Ljava/util/ArrayList;

    .line 398
    .line 399
    invoke-static {v0, v12}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 400
    .line 401
    .line 402
    move-result v3

    .line 403
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 404
    .line 405
    .line 406
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 411
    .line 412
    .line 413
    move-result v3

    .line 414
    if-eqz v3, :cond_15

    .line 415
    .line 416
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v3

    .line 420
    check-cast v3, La/awc;

    .line 421
    .line 422
    iget-object v4, v3, La/awc;->a:La/mvc;

    .line 423
    .line 424
    iget-object v5, v3, La/awc;->b:Ljava/lang/String;

    .line 425
    .line 426
    iget-object v3, v3, La/awc;->c:Ljava/util/List;

    .line 427
    .line 428
    new-instance v6, Ljava/util/ArrayList;

    .line 429
    .line 430
    invoke-static {v3, v12}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 431
    .line 432
    .line 433
    move-result v7

    .line 434
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 435
    .line 436
    .line 437
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 438
    .line 439
    .line 440
    move-result-object v3

    .line 441
    :goto_10
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 442
    .line 443
    .line 444
    move-result v7

    .line 445
    if-eqz v7, :cond_14

    .line 446
    .line 447
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v7

    .line 451
    check-cast v7, La/uvc;

    .line 452
    .line 453
    new-instance v8, La/ivc;

    .line 454
    .line 455
    iget v9, v7, La/uvc;->a:I

    .line 456
    .line 457
    invoke-static {v9, v1}, La/rz4;->C(ILjava/util/List;)Z

    .line 458
    .line 459
    .line 460
    move-result v9

    .line 461
    xor-int/2addr v9, v11

    .line 462
    invoke-direct {v8, v7, v9}, La/ivc;-><init>(La/uvc;Z)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 466
    .line 467
    .line 468
    goto :goto_10

    .line 469
    :cond_14
    new-instance v3, La/zvc;

    .line 470
    .line 471
    invoke-direct {v3, v4, v5, v6}, La/zvc;-><init>(La/mvc;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 475
    .line 476
    .line 477
    goto :goto_f

    .line 478
    :cond_15
    return-object v2
.end method
