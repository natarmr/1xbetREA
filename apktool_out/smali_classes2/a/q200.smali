.class public final La/q200;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/c200;

.field public final b:La/btt0;

.field public final c:La/knf0;

.field public final d:La/us00;


# direct methods
.method public constructor <init>(La/c200;La/btt0;La/knf0;La/us00;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/q200;->a:La/c200;

    .line 14
    .line 15
    iput-object p2, p0, La/q200;->b:La/btt0;

    .line 16
    .line 17
    iput-object p3, p0, La/q200;->c:La/knf0;

    .line 18
    .line 19
    iput-object p4, p0, La/q200;->d:La/us00;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a(ZLa/zje;)Ljava/lang/Object;
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v1, La/g200;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/g200;

    .line 11
    .line 12
    iget v3, v2, La/g200;->k:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/g200;->k:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/g200;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/g200;-><init>(La/q200;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/g200;->i:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/g200;->k:I

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    sget-object v6, La/jyz;->a:La/u8u;

    .line 37
    .line 38
    const/4 v7, 0x1

    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    if-ne v4, v7, :cond_1

    .line 42
    .line 43
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v5

    .line 53
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object v1, v6, La/u8u;->c:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v1, La/izz;

    .line 59
    .line 60
    if-nez p1, :cond_4

    .line 61
    .line 62
    if-nez v1, :cond_3

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    return-object v1

    .line 66
    :cond_4
    :goto_1
    iget-object v1, v0, La/q200;->b:La/btt0;

    .line 67
    .line 68
    invoke-virtual {v1}, La/btt0;->a()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    iget-object v4, v0, La/q200;->c:La/knf0;

    .line 73
    .line 74
    invoke-virtual {v4}, La/knf0;->c()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    iput v7, v2, La/g200;->k:I

    .line 79
    .line 80
    iget-object v7, v0, La/q200;->a:La/c200;

    .line 81
    .line 82
    iget-object v7, v7, La/c200;->a:La/iuz;

    .line 83
    .line 84
    invoke-interface {v7, v1, v4, v2}, La/iuz;->a(Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    if-ne v1, v3, :cond_5

    .line 89
    .line 90
    return-object v3

    .line 91
    :cond_5
    :goto_2
    check-cast v1, La/dx5;

    .line 92
    .line 93
    invoke-virtual {v1}, La/dx5;->a()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    check-cast v1, La/n300;

    .line 98
    .line 99
    iget-object v2, v1, La/n300;->a:Ljava/util/List;

    .line 100
    .line 101
    if-nez v2, :cond_6

    .line 102
    .line 103
    sget-object v2, La/iun;->a:La/iun;

    .line 104
    .line 105
    :cond_6
    new-instance v3, Ljava/util/ArrayList;

    .line 106
    .line 107
    const/16 v4, 0xa

    .line 108
    .line 109
    invoke-static {v2, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    invoke-direct {v3, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 114
    .line 115
    .line 116
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v7

    .line 124
    const/4 v8, 0x0

    .line 125
    const-wide/16 v9, 0x0

    .line 126
    .line 127
    const-string v11, ""

    .line 128
    .line 129
    if-eqz v7, :cond_1e

    .line 130
    .line 131
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    check-cast v7, La/jo40;

    .line 136
    .line 137
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    sget-object v12, La/zrz;->a:La/sqt;

    .line 141
    .line 142
    iget-object v13, v7, La/jo40;->a:Ljava/lang/Integer;

    .line 143
    .line 144
    if-eqz v13, :cond_1d

    .line 145
    .line 146
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 147
    .line 148
    .line 149
    move-result v13

    .line 150
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-static {v13}, La/sqt;->c(I)La/vrz;

    .line 154
    .line 155
    .line 156
    move-result-object v16

    .line 157
    invoke-static/range {v16 .. v16}, La/b5x;->O(La/vrz;)Lorg/xplatform/limits_kenya/api/domain/LimitKenyaGroupEnum;

    .line 158
    .line 159
    .line 160
    move-result-object v15

    .line 161
    iget-object v12, v7, La/jo40;->b:Ljava/lang/String;

    .line 162
    .line 163
    if-eqz v12, :cond_1c

    .line 164
    .line 165
    iget-object v13, v7, La/jo40;->c:Ljava/lang/Double;

    .line 166
    .line 167
    if-eqz v13, :cond_7

    .line 168
    .line 169
    invoke-virtual {v13}, Ljava/lang/Double;->doubleValue()D

    .line 170
    .line 171
    .line 172
    move-result-wide v13

    .line 173
    invoke-static {v13, v14}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v13

    .line 177
    goto :goto_4

    .line 178
    :cond_7
    move-object v13, v5

    .line 179
    :goto_4
    if-nez v13, :cond_8

    .line 180
    .line 181
    move-object/from16 v18, v11

    .line 182
    .line 183
    goto :goto_5

    .line 184
    :cond_8
    move-object/from16 v18, v13

    .line 185
    .line 186
    :goto_5
    iget-object v13, v7, La/jo40;->d:Ljava/lang/Boolean;

    .line 187
    .line 188
    if-eqz v13, :cond_1b

    .line 189
    .line 190
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 191
    .line 192
    .line 193
    move-result v19

    .line 194
    iget-object v13, v7, La/jo40;->e:Ljava/lang/Boolean;

    .line 195
    .line 196
    if-eqz v13, :cond_1a

    .line 197
    .line 198
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 199
    .line 200
    .line 201
    move-result v20

    .line 202
    iget-object v13, v7, La/jo40;->f:Ljava/lang/Boolean;

    .line 203
    .line 204
    if-eqz v13, :cond_19

    .line 205
    .line 206
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 207
    .line 208
    .line 209
    move-result v21

    .line 210
    sget-object v13, La/nrz;->a:La/tqt;

    .line 211
    .line 212
    iget-object v14, v7, La/jo40;->g:Ljava/lang/String;

    .line 213
    .line 214
    if-eqz v14, :cond_18

    .line 215
    .line 216
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    invoke-static {v14}, La/tqt;->c(Ljava/lang/String;)La/nrz;

    .line 220
    .line 221
    .line 222
    move-result-object v22

    .line 223
    iget-object v13, v7, La/jo40;->h:Ljava/lang/Long;

    .line 224
    .line 225
    if-eqz v13, :cond_9

    .line 226
    .line 227
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 228
    .line 229
    .line 230
    move-result-wide v13

    .line 231
    move-wide/from16 v23, v13

    .line 232
    .line 233
    goto :goto_6

    .line 234
    :cond_9
    move-wide/from16 v23, v9

    .line 235
    .line 236
    :goto_6
    iget-object v13, v7, La/jo40;->i:Ljava/lang/Long;

    .line 237
    .line 238
    if-eqz v13, :cond_a

    .line 239
    .line 240
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 241
    .line 242
    .line 243
    move-result-wide v13

    .line 244
    move-wide/from16 v25, v13

    .line 245
    .line 246
    goto :goto_7

    .line 247
    :cond_a
    move-wide/from16 v25, v9

    .line 248
    .line 249
    :goto_7
    iget-object v13, v7, La/jo40;->j:Ljava/lang/Long;

    .line 250
    .line 251
    if-eqz v13, :cond_b

    .line 252
    .line 253
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 254
    .line 255
    .line 256
    move-result-wide v13

    .line 257
    move-wide/from16 v27, v13

    .line 258
    .line 259
    goto :goto_8

    .line 260
    :cond_b
    move-wide/from16 v27, v9

    .line 261
    .line 262
    :goto_8
    iget-object v13, v7, La/jo40;->k:Ljava/lang/Integer;

    .line 263
    .line 264
    if-eqz v13, :cond_c

    .line 265
    .line 266
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 267
    .line 268
    .line 269
    move-result v13

    .line 270
    invoke-static {v13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v13

    .line 274
    goto :goto_9

    .line 275
    :cond_c
    move-object v13, v5

    .line 276
    :goto_9
    if-nez v13, :cond_d

    .line 277
    .line 278
    move-object/from16 v29, v11

    .line 279
    .line 280
    goto :goto_a

    .line 281
    :cond_d
    move-object/from16 v29, v13

    .line 282
    .line 283
    :goto_a
    iget-object v13, v7, La/jo40;->l:Ljava/lang/Boolean;

    .line 284
    .line 285
    if-eqz v13, :cond_e

    .line 286
    .line 287
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 288
    .line 289
    .line 290
    move-result v8

    .line 291
    :cond_e
    move/from16 v30, v8

    .line 292
    .line 293
    iget-object v8, v7, La/jo40;->m:Ljava/lang/Integer;

    .line 294
    .line 295
    if-eqz v8, :cond_f

    .line 296
    .line 297
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 298
    .line 299
    .line 300
    move-result v8

    .line 301
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v8

    .line 305
    goto :goto_b

    .line 306
    :cond_f
    move-object v8, v5

    .line 307
    :goto_b
    if-nez v8, :cond_10

    .line 308
    .line 309
    move-object/from16 v31, v11

    .line 310
    .line 311
    goto :goto_c

    .line 312
    :cond_10
    move-object/from16 v31, v8

    .line 313
    .line 314
    :goto_c
    iget-object v8, v7, La/jo40;->n:Ljava/lang/Long;

    .line 315
    .line 316
    if-eqz v8, :cond_11

    .line 317
    .line 318
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 319
    .line 320
    .line 321
    move-result-wide v9

    .line 322
    :cond_11
    move-wide/from16 v32, v9

    .line 323
    .line 324
    iget-object v8, v7, La/jo40;->o:Ljava/util/List;

    .line 325
    .line 326
    if-eqz v8, :cond_14

    .line 327
    .line 328
    new-instance v9, Ljava/util/ArrayList;

    .line 329
    .line 330
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 331
    .line 332
    .line 333
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 334
    .line 335
    .line 336
    move-result-object v8

    .line 337
    :cond_12
    :goto_d
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 338
    .line 339
    .line 340
    move-result v10

    .line 341
    if-eqz v10, :cond_15

    .line 342
    .line 343
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v10

    .line 347
    check-cast v10, La/r95;

    .line 348
    .line 349
    if-eqz v10, :cond_13

    .line 350
    .line 351
    invoke-static {v10}, La/u7x;->J(La/r95;)La/y85;

    .line 352
    .line 353
    .line 354
    move-result-object v10

    .line 355
    goto :goto_e

    .line 356
    :cond_13
    move-object v10, v5

    .line 357
    :goto_e
    if-eqz v10, :cond_12

    .line 358
    .line 359
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    goto :goto_d

    .line 363
    :cond_14
    move-object v9, v5

    .line 364
    :cond_15
    if-nez v9, :cond_16

    .line 365
    .line 366
    sget-object v9, La/iun;->a:La/iun;

    .line 367
    .line 368
    :cond_16
    move-object/from16 v34, v9

    .line 369
    .line 370
    iget-object v7, v7, La/jo40;->p:Ljava/lang/Boolean;

    .line 371
    .line 372
    if-eqz v7, :cond_17

    .line 373
    .line 374
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 375
    .line 376
    .line 377
    move-result v35

    .line 378
    new-instance v14, La/rn40;

    .line 379
    .line 380
    move-object/from16 v17, v12

    .line 381
    .line 382
    invoke-direct/range {v14 .. v35}, La/rn40;-><init>(Lorg/xplatform/limits_kenya/api/domain/LimitKenyaGroupEnum;La/vrz;Ljava/lang/String;Ljava/lang/String;ZZZLa/nrz;JJJLjava/lang/String;ZLjava/lang/String;JLjava/util/List;Z)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    goto/16 :goto_3

    .line 389
    .line 390
    :cond_17
    invoke-static {v5}, La/jf4;->k(Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    return-object v5

    .line 394
    :cond_18
    invoke-static {v5}, La/jf4;->k(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    return-object v5

    .line 398
    :cond_19
    invoke-static {v5}, La/jf4;->k(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    return-object v5

    .line 402
    :cond_1a
    invoke-static {v5}, La/jf4;->k(Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    return-object v5

    .line 406
    :cond_1b
    invoke-static {v5}, La/jf4;->k(Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    return-object v5

    .line 410
    :cond_1c
    invoke-static {v5}, La/jf4;->k(Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    return-object v5

    .line 414
    :cond_1d
    invoke-static {v5}, La/jf4;->k(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    return-object v5

    .line 418
    :cond_1e
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 419
    .line 420
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 424
    .line 425
    .line 426
    move-result-object v3

    .line 427
    :goto_f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 428
    .line 429
    .line 430
    move-result v7

    .line 431
    if-eqz v7, :cond_20

    .line 432
    .line 433
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v7

    .line 437
    move-object v12, v7

    .line 438
    check-cast v12, La/rn40;

    .line 439
    .line 440
    iget-object v12, v12, La/rn40;->a:Lorg/xplatform/limits_kenya/api/domain/LimitKenyaGroupEnum;

    .line 441
    .line 442
    invoke-virtual {v2, v12}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v13

    .line 446
    if-nez v13, :cond_1f

    .line 447
    .line 448
    new-instance v13, Ljava/util/ArrayList;

    .line 449
    .line 450
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 451
    .line 452
    .line 453
    invoke-interface {v2, v12, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    :cond_1f
    check-cast v13, Ljava/util/List;

    .line 457
    .line 458
    invoke-interface {v13, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 459
    .line 460
    .line 461
    goto :goto_f

    .line 462
    :cond_20
    iget-object v1, v1, La/n300;->b:Ljava/util/List;

    .line 463
    .line 464
    if-nez v1, :cond_21

    .line 465
    .line 466
    sget-object v1, La/iun;->a:La/iun;

    .line 467
    .line 468
    :cond_21
    new-instance v3, Ljava/util/ArrayList;

    .line 469
    .line 470
    invoke-static {v1, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 471
    .line 472
    .line 473
    move-result v4

    .line 474
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 475
    .line 476
    .line 477
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    :goto_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 482
    .line 483
    .line 484
    move-result v4

    .line 485
    if-eqz v4, :cond_32

    .line 486
    .line 487
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v4

    .line 491
    check-cast v4, La/ijq0;

    .line 492
    .line 493
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 494
    .line 495
    .line 496
    sget-object v7, La/zrz;->a:La/sqt;

    .line 497
    .line 498
    iget-object v12, v4, La/ijq0;->a:Ljava/lang/Integer;

    .line 499
    .line 500
    iget-object v13, v4, La/ijq0;->b:Ljava/lang/Long;

    .line 501
    .line 502
    if-eqz v12, :cond_31

    .line 503
    .line 504
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 505
    .line 506
    .line 507
    move-result v12

    .line 508
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 509
    .line 510
    .line 511
    invoke-static {v12}, La/sqt;->c(I)La/vrz;

    .line 512
    .line 513
    .line 514
    move-result-object v16

    .line 515
    invoke-static/range {v16 .. v16}, La/b5x;->O(La/vrz;)Lorg/xplatform/limits_kenya/api/domain/LimitKenyaGroupEnum;

    .line 516
    .line 517
    .line 518
    move-result-object v15

    .line 519
    if-eqz v13, :cond_22

    .line 520
    .line 521
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 522
    .line 523
    .line 524
    move-result-wide v17

    .line 525
    goto :goto_11

    .line 526
    :cond_22
    move-wide/from16 v17, v9

    .line 527
    .line 528
    :goto_11
    if-eqz v13, :cond_24

    .line 529
    .line 530
    invoke-virtual {v13}, Ljava/lang/Number;->longValue()J

    .line 531
    .line 532
    .line 533
    move-result-wide v12

    .line 534
    const-wide/16 v19, -0x1

    .line 535
    .line 536
    cmp-long v7, v12, v19

    .line 537
    .line 538
    if-nez v7, :cond_23

    .line 539
    .line 540
    move-object/from16 p2, v5

    .line 541
    .line 542
    move-object v5, v11

    .line 543
    goto :goto_12

    .line 544
    :cond_23
    sget-object v7, La/rdj;->a:La/rdj;

    .line 545
    .line 546
    iget-object v7, v0, La/q200;->d:La/us00;

    .line 547
    .line 548
    invoke-static {v7}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    .line 549
    .line 550
    .line 551
    move-result v7

    .line 552
    sget-object v14, La/efj;->c:La/efj;

    .line 553
    .line 554
    move-object/from16 p2, v5

    .line 555
    .line 556
    new-instance v5, La/znq0;

    .line 557
    .line 558
    invoke-direct {v5, v12, v13}, La/znq0;-><init>(J)V

    .line 559
    .line 560
    .line 561
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 562
    .line 563
    .line 564
    move-result-object v7

    .line 565
    const/16 v12, 0x38

    .line 566
    .line 567
    invoke-static {v5, v14, v7, v8, v12}, La/rdj;->g(La/aoq0;La/efj;Ljava/lang/Boolean;ZI)Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    move-result-object v5

    .line 571
    goto :goto_12

    .line 572
    :cond_24
    move-object/from16 p2, v5

    .line 573
    .line 574
    :goto_12
    if-nez v5, :cond_25

    .line 575
    .line 576
    move-object/from16 v19, v11

    .line 577
    .line 578
    goto :goto_13

    .line 579
    :cond_25
    move-object/from16 v19, v5

    .line 580
    .line 581
    :goto_13
    iget-object v5, v4, La/ijq0;->c:Ljava/lang/Integer;

    .line 582
    .line 583
    if-eqz v5, :cond_26

    .line 584
    .line 585
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 586
    .line 587
    .line 588
    move-result v5

    .line 589
    int-to-long v12, v5

    .line 590
    move-wide/from16 v20, v12

    .line 591
    .line 592
    goto :goto_14

    .line 593
    :cond_26
    move-wide/from16 v20, v9

    .line 594
    .line 595
    :goto_14
    iget-object v5, v4, La/ijq0;->d:Ljava/lang/Boolean;

    .line 596
    .line 597
    if-eqz v5, :cond_27

    .line 598
    .line 599
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 600
    .line 601
    .line 602
    move-result v5

    .line 603
    move/from16 v22, v5

    .line 604
    .line 605
    goto :goto_15

    .line 606
    :cond_27
    move/from16 v22, v8

    .line 607
    .line 608
    :goto_15
    iget-object v5, v4, La/ijq0;->e:Ljava/lang/Boolean;

    .line 609
    .line 610
    if-eqz v5, :cond_30

    .line 611
    .line 612
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 613
    .line 614
    .line 615
    move-result v23

    .line 616
    iget-object v5, v4, La/ijq0;->f:Ljava/lang/Boolean;

    .line 617
    .line 618
    if-eqz v5, :cond_2f

    .line 619
    .line 620
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 621
    .line 622
    .line 623
    move-result v24

    .line 624
    sget-object v5, La/nrz;->a:La/tqt;

    .line 625
    .line 626
    iget-object v7, v4, La/ijq0;->g:Ljava/lang/String;

    .line 627
    .line 628
    if-eqz v7, :cond_2e

    .line 629
    .line 630
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 631
    .line 632
    .line 633
    invoke-static {v7}, La/tqt;->c(Ljava/lang/String;)La/nrz;

    .line 634
    .line 635
    .line 636
    move-result-object v25

    .line 637
    iget-object v5, v4, La/ijq0;->h:Ljava/util/List;

    .line 638
    .line 639
    if-eqz v5, :cond_2a

    .line 640
    .line 641
    new-instance v7, Ljava/util/ArrayList;

    .line 642
    .line 643
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 644
    .line 645
    .line 646
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 647
    .line 648
    .line 649
    move-result-object v5

    .line 650
    :cond_28
    :goto_16
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 651
    .line 652
    .line 653
    move-result v12

    .line 654
    if-eqz v12, :cond_2b

    .line 655
    .line 656
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v12

    .line 660
    check-cast v12, La/r95;

    .line 661
    .line 662
    if-eqz v12, :cond_29

    .line 663
    .line 664
    invoke-static {v12}, La/u7x;->J(La/r95;)La/y85;

    .line 665
    .line 666
    .line 667
    move-result-object v12

    .line 668
    goto :goto_17

    .line 669
    :cond_29
    move-object/from16 v12, p2

    .line 670
    .line 671
    :goto_17
    if-eqz v12, :cond_28

    .line 672
    .line 673
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 674
    .line 675
    .line 676
    goto :goto_16

    .line 677
    :cond_2a
    move-object/from16 v7, p2

    .line 678
    .line 679
    :cond_2b
    if-nez v7, :cond_2c

    .line 680
    .line 681
    sget-object v7, La/iun;->a:La/iun;

    .line 682
    .line 683
    :cond_2c
    move-object/from16 v26, v7

    .line 684
    .line 685
    iget-object v4, v4, La/ijq0;->i:Ljava/lang/Boolean;

    .line 686
    .line 687
    if-eqz v4, :cond_2d

    .line 688
    .line 689
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 690
    .line 691
    .line 692
    move-result v27

    .line 693
    new-instance v14, La/qiq0;

    .line 694
    .line 695
    invoke-direct/range {v14 .. v27}, La/qiq0;-><init>(Lorg/xplatform/limits_kenya/api/domain/LimitKenyaGroupEnum;La/vrz;JLjava/lang/String;JZZZLa/nrz;Ljava/util/List;Z)V

    .line 696
    .line 697
    .line 698
    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 699
    .line 700
    .line 701
    move-object/from16 v5, p2

    .line 702
    .line 703
    goto/16 :goto_10

    .line 704
    .line 705
    :cond_2d
    invoke-static/range {p2 .. p2}, La/jf4;->k(Ljava/lang/String;)V

    .line 706
    .line 707
    .line 708
    return-object p2

    .line 709
    :cond_2e
    invoke-static/range {p2 .. p2}, La/jf4;->k(Ljava/lang/String;)V

    .line 710
    .line 711
    .line 712
    return-object p2

    .line 713
    :cond_2f
    invoke-static/range {p2 .. p2}, La/jf4;->k(Ljava/lang/String;)V

    .line 714
    .line 715
    .line 716
    return-object p2

    .line 717
    :cond_30
    invoke-static/range {p2 .. p2}, La/jf4;->k(Ljava/lang/String;)V

    .line 718
    .line 719
    .line 720
    return-object p2

    .line 721
    :cond_31
    move-object/from16 p2, v5

    .line 722
    .line 723
    invoke-static/range {p2 .. p2}, La/jf4;->k(Ljava/lang/String;)V

    .line 724
    .line 725
    .line 726
    return-object p2

    .line 727
    :cond_32
    move-object/from16 p2, v5

    .line 728
    .line 729
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 730
    .line 731
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 732
    .line 733
    .line 734
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 735
    .line 736
    .line 737
    move-result-object v1

    .line 738
    :goto_18
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 739
    .line 740
    .line 741
    move-result v3

    .line 742
    if-eqz v3, :cond_34

    .line 743
    .line 744
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 745
    .line 746
    .line 747
    move-result-object v3

    .line 748
    move-object v4, v3

    .line 749
    check-cast v4, La/qiq0;

    .line 750
    .line 751
    iget-object v4, v4, La/qiq0;->a:Lorg/xplatform/limits_kenya/api/domain/LimitKenyaGroupEnum;

    .line 752
    .line 753
    invoke-virtual {v0, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 754
    .line 755
    .line 756
    move-result-object v5

    .line 757
    if-nez v5, :cond_33

    .line 758
    .line 759
    new-instance v5, Ljava/util/ArrayList;

    .line 760
    .line 761
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 762
    .line 763
    .line 764
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 765
    .line 766
    .line 767
    :cond_33
    check-cast v5, Ljava/util/List;

    .line 768
    .line 769
    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 770
    .line 771
    .line 772
    goto :goto_18

    .line 773
    :cond_34
    new-instance v1, La/izz;

    .line 774
    .line 775
    invoke-direct {v1, v2, v0}, La/izz;-><init>(Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)V

    .line 776
    .line 777
    .line 778
    iput-object v1, v6, La/u8u;->c:Ljava/lang/Object;

    .line 779
    .line 780
    sget-object v2, Lorg/xplatform/limits_kenya/api/domain/LimitKenyaGroupEnum;->c:Lorg/xplatform/limits_kenya/api/domain/LimitKenyaGroupEnum;

    .line 781
    .line 782
    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 783
    .line 784
    .line 785
    move-result-object v0

    .line 786
    check-cast v0, Ljava/util/List;

    .line 787
    .line 788
    if-nez v0, :cond_35

    .line 789
    .line 790
    sget-object v0, La/iun;->a:La/iun;

    .line 791
    .line 792
    :cond_35
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 793
    .line 794
    .line 795
    move-result-object v0

    .line 796
    :cond_36
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 797
    .line 798
    .line 799
    move-result v2

    .line 800
    if-eqz v2, :cond_37

    .line 801
    .line 802
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 803
    .line 804
    .line 805
    move-result-object v2

    .line 806
    move-object v3, v2

    .line 807
    check-cast v3, La/qiq0;

    .line 808
    .line 809
    iget-object v3, v3, La/qiq0;->b:La/vrz;

    .line 810
    .line 811
    sget-object v4, La/liq0;->a:La/liq0;

    .line 812
    .line 813
    if-ne v3, v4, :cond_36

    .line 814
    .line 815
    move-object v5, v2

    .line 816
    goto :goto_19

    .line 817
    :cond_37
    move-object/from16 v5, p2

    .line 818
    .line 819
    :goto_19
    check-cast v5, La/qiq0;

    .line 820
    .line 821
    iput-object v5, v6, La/u8u;->b:Ljava/lang/Object;

    .line 822
    .line 823
    return-object v1
.end method
