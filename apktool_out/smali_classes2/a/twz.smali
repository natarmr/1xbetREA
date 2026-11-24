.class public final La/twz;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/lwz;

.field public final b:La/btt0;

.field public final c:La/kwz;

.field public final d:La/njo;

.field public final e:La/ctf0;


# direct methods
.method public constructor <init>(La/lwz;La/btt0;La/kwz;La/njo;La/ctf0;)V
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
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, La/twz;->a:La/lwz;

    .line 20
    .line 21
    iput-object p2, p0, La/twz;->b:La/btt0;

    .line 22
    .line 23
    iput-object p3, p0, La/twz;->c:La/kwz;

    .line 24
    .line 25
    iput-object p4, p0, La/twz;->d:La/njo;

    .line 26
    .line 27
    iput-object p5, p0, La/twz;->e:La/ctf0;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 44

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    instance-of v2, v0, La/mwz;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, La/mwz;

    .line 11
    .line 12
    iget v3, v2, La/mwz;->r:I

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
    iput v3, v2, La/mwz;->r:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/mwz;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, La/mwz;-><init>(La/twz;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, La/mwz;->p:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/mwz;->r:I

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v8, 0x0

    .line 38
    const/4 v9, 0x1

    .line 39
    if-eqz v4, :cond_4

    .line 40
    .line 41
    if-eq v4, v9, :cond_3

    .line 42
    .line 43
    if-eq v4, v6, :cond_2

    .line 44
    .line 45
    if-ne v4, v5, :cond_1

    .line 46
    .line 47
    iget v4, v2, La/mwz;->o:I

    .line 48
    .line 49
    iget v10, v2, La/mwz;->n:I

    .line 50
    .line 51
    iget v11, v2, La/mwz;->m:I

    .line 52
    .line 53
    iget-wide v12, v2, La/mwz;->l:J

    .line 54
    .line 55
    iget-wide v14, v2, La/mwz;->k:J

    .line 56
    .line 57
    const/16 p2, 0x0

    .line 58
    .line 59
    iget-object v7, v2, La/mwz;->j:Ljava/lang/Throwable;

    .line 60
    .line 61
    iget-object v5, v2, La/mwz;->i:Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    move v0, v4

    .line 67
    move v9, v6

    .line 68
    move v8, v11

    .line 69
    move-wide v11, v12

    .line 70
    move-wide v13, v14

    .line 71
    move-object v4, v2

    .line 72
    move-object v2, v5

    .line 73
    move v5, v10

    .line 74
    move-object v10, v7

    .line 75
    const/4 v7, 0x3

    .line 76
    goto/16 :goto_1f

    .line 77
    .line 78
    :cond_1
    const/16 p2, 0x0

    .line 79
    .line 80
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 81
    .line 82
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-object p2

    .line 86
    :cond_2
    const/16 p2, 0x0

    .line 87
    .line 88
    iget v4, v2, La/mwz;->o:I

    .line 89
    .line 90
    iget v5, v2, La/mwz;->n:I

    .line 91
    .line 92
    iget v7, v2, La/mwz;->m:I

    .line 93
    .line 94
    iget-wide v10, v2, La/mwz;->l:J

    .line 95
    .line 96
    iget-wide v12, v2, La/mwz;->k:J

    .line 97
    .line 98
    iget-object v14, v2, La/mwz;->j:Ljava/lang/Throwable;

    .line 99
    .line 100
    iget-object v15, v2, La/mwz;->i:Ljava/lang/String;

    .line 101
    .line 102
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    move-wide/from16 v42, v10

    .line 106
    .line 107
    move-object v10, v14

    .line 108
    move-wide v13, v12

    .line 109
    move-wide/from16 v11, v42

    .line 110
    .line 111
    move v0, v4

    .line 112
    move v9, v6

    .line 113
    move-object v4, v2

    .line 114
    move-object v2, v15

    .line 115
    goto/16 :goto_1b

    .line 116
    .line 117
    :cond_3
    const/16 p2, 0x0

    .line 118
    .line 119
    iget v4, v2, La/mwz;->n:I

    .line 120
    .line 121
    iget v5, v2, La/mwz;->m:I

    .line 122
    .line 123
    iget-wide v10, v2, La/mwz;->l:J

    .line 124
    .line 125
    iget-wide v12, v2, La/mwz;->k:J

    .line 126
    .line 127
    iget-object v7, v2, La/mwz;->j:Ljava/lang/Throwable;

    .line 128
    .line 129
    iget-object v14, v2, La/mwz;->i:Ljava/lang/String;

    .line 130
    .line 131
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 132
    .line 133
    .line 134
    goto/16 :goto_2

    .line 135
    .line 136
    :catchall_0
    move-exception v0

    .line 137
    move/from16 v42, v4

    .line 138
    .line 139
    move-object v4, v2

    .line 140
    move-object v2, v14

    .line 141
    move-wide v13, v12

    .line 142
    move-wide v11, v10

    .line 143
    move-object v10, v7

    .line 144
    move v7, v5

    .line 145
    move/from16 v5, v42

    .line 146
    .line 147
    goto/16 :goto_19

    .line 148
    .line 149
    :cond_4
    const/16 p2, 0x0

    .line 150
    .line 151
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    sget-wide v4, La/cag0;->a:J

    .line 155
    .line 156
    const-wide/16 v10, 0x3

    .line 157
    .line 158
    move v7, v8

    .line 159
    move v0, v9

    .line 160
    move-wide v13, v10

    .line 161
    move-object/from16 v10, p2

    .line 162
    .line 163
    move-wide v11, v4

    .line 164
    move v5, v7

    .line 165
    move-object v4, v2

    .line 166
    move-object/from16 v2, p1

    .line 167
    .line 168
    :goto_1
    if-eqz v0, :cond_3c

    .line 169
    .line 170
    :try_start_1
    iget-object v15, v1, La/twz;->a:La/lwz;

    .line 171
    .line 172
    iget-object v6, v1, La/twz;->b:La/btt0;

    .line 173
    .line 174
    invoke-virtual {v6}, La/btt0;->a()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    iput-object v2, v4, La/mwz;->i:Ljava/lang/String;

    .line 179
    .line 180
    iput-object v10, v4, La/mwz;->j:Ljava/lang/Throwable;

    .line 181
    .line 182
    iput-wide v13, v4, La/mwz;->k:J

    .line 183
    .line 184
    iput-wide v11, v4, La/mwz;->l:J

    .line 185
    .line 186
    iput v7, v4, La/mwz;->m:I

    .line 187
    .line 188
    iput v5, v4, La/mwz;->n:I

    .line 189
    .line 190
    iput v0, v4, La/mwz;->o:I

    .line 191
    .line 192
    iput v9, v4, La/mwz;->r:I

    .line 193
    .line 194
    iget-object v0, v15, La/lwz;->a:La/tpv;

    .line 195
    .line 196
    invoke-virtual {v0}, La/tpv;->invoke()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    check-cast v0, La/fuz;

    .line 201
    .line 202
    invoke-interface {v0, v6, v2, v4}, La/fuz;->a(Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 206
    if-ne v0, v3, :cond_5

    .line 207
    .line 208
    goto/16 :goto_1e

    .line 209
    .line 210
    :cond_5
    move-wide/from16 v42, v13

    .line 211
    .line 212
    move-object v14, v2

    .line 213
    move-object v2, v4

    .line 214
    move v4, v5

    .line 215
    move v5, v7

    .line 216
    move-object v7, v10

    .line 217
    move-wide v10, v11

    .line 218
    move-wide/from16 v12, v42

    .line 219
    .line 220
    :goto_2
    :try_start_2
    check-cast v0, La/dx5;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 221
    .line 222
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    check-cast v0, La/j300;

    .line 227
    .line 228
    iget-object v2, v1, La/twz;->e:La/ctf0;

    .line 229
    .line 230
    invoke-virtual {v2}, La/ctf0;->h()Z

    .line 231
    .line 232
    .line 233
    move-result v2

    .line 234
    iget-object v3, v0, La/j300;->a:Ljava/util/List;

    .line 235
    .line 236
    if-nez v3, :cond_6

    .line 237
    .line 238
    sget-object v3, La/iun;->a:La/iun;

    .line 239
    .line 240
    :cond_6
    new-instance v4, Ljava/util/ArrayList;

    .line 241
    .line 242
    const/16 v5, 0xa

    .line 243
    .line 244
    invoke-static {v3, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 245
    .line 246
    .line 247
    move-result v6

    .line 248
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 249
    .line 250
    .line 251
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 256
    .line 257
    .line 258
    move-result v6

    .line 259
    const-wide/16 v12, 0x0

    .line 260
    .line 261
    if-eqz v6, :cond_1e

    .line 262
    .line 263
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v6

    .line 267
    check-cast v6, La/lo40;

    .line 268
    .line 269
    iget-object v7, v6, La/lo40;->a:Ljava/lang/Integer;

    .line 270
    .line 271
    if-eqz v7, :cond_1d

    .line 272
    .line 273
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 274
    .line 275
    .line 276
    move-result v7

    .line 277
    invoke-static {v7}, La/tlb;->T(I)La/xrz;

    .line 278
    .line 279
    .line 280
    move-result-object v7

    .line 281
    instance-of v14, v7, La/uvj;

    .line 282
    .line 283
    if-nez v14, :cond_1c

    .line 284
    .line 285
    invoke-interface {v7}, La/xrz;->a()La/bnz;

    .line 286
    .line 287
    .line 288
    move-result-object v15

    .line 289
    iget-object v14, v6, La/lo40;->b:Ljava/lang/String;

    .line 290
    .line 291
    if-eqz v14, :cond_1b

    .line 292
    .line 293
    iget-object v10, v6, La/lo40;->c:Ljava/lang/Double;

    .line 294
    .line 295
    if-eqz v10, :cond_7

    .line 296
    .line 297
    invoke-virtual {v10}, Ljava/lang/Double;->doubleValue()D

    .line 298
    .line 299
    .line 300
    move-result-wide v10

    .line 301
    move-wide/from16 v18, v10

    .line 302
    .line 303
    goto :goto_4

    .line 304
    :cond_7
    move-wide/from16 v18, v12

    .line 305
    .line 306
    :goto_4
    iget-object v10, v6, La/lo40;->d:Ljava/lang/Boolean;

    .line 307
    .line 308
    if-eqz v10, :cond_1a

    .line 309
    .line 310
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 311
    .line 312
    .line 313
    move-result v20

    .line 314
    iget-object v10, v6, La/lo40;->e:Ljava/lang/Boolean;

    .line 315
    .line 316
    if-eqz v10, :cond_19

    .line 317
    .line 318
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 319
    .line 320
    .line 321
    move-result v21

    .line 322
    iget-object v10, v6, La/lo40;->f:Ljava/lang/Boolean;

    .line 323
    .line 324
    if-eqz v10, :cond_18

    .line 325
    .line 326
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 327
    .line 328
    .line 329
    move-result v22

    .line 330
    sget-object v10, La/lrz;->a:La/rqt;

    .line 331
    .line 332
    iget-object v11, v6, La/lo40;->g:Ljava/lang/String;

    .line 333
    .line 334
    if-eqz v11, :cond_17

    .line 335
    .line 336
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 337
    .line 338
    .line 339
    invoke-static {v11}, La/rqt;->c(Ljava/lang/String;)La/lrz;

    .line 340
    .line 341
    .line 342
    move-result-object v23

    .line 343
    iget-object v10, v6, La/lo40;->h:Ljava/lang/Long;

    .line 344
    .line 345
    if-eqz v10, :cond_8

    .line 346
    .line 347
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 348
    .line 349
    .line 350
    move-result-wide v10

    .line 351
    move-wide/from16 v24, v10

    .line 352
    .line 353
    goto :goto_5

    .line 354
    :cond_8
    const-wide/16 v24, 0x0

    .line 355
    .line 356
    :goto_5
    iget-object v10, v6, La/lo40;->i:Ljava/lang/Long;

    .line 357
    .line 358
    if-eqz v10, :cond_9

    .line 359
    .line 360
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 361
    .line 362
    .line 363
    move-result-wide v10

    .line 364
    move-wide/from16 v26, v10

    .line 365
    .line 366
    goto :goto_6

    .line 367
    :cond_9
    const-wide/16 v26, 0x0

    .line 368
    .line 369
    :goto_6
    iget-object v10, v6, La/lo40;->j:Ljava/lang/Long;

    .line 370
    .line 371
    if-eqz v10, :cond_a

    .line 372
    .line 373
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 374
    .line 375
    .line 376
    move-result-wide v10

    .line 377
    move-wide/from16 v28, v10

    .line 378
    .line 379
    goto :goto_7

    .line 380
    :cond_a
    const-wide/16 v28, 0x0

    .line 381
    .line 382
    :goto_7
    iget-object v10, v6, La/lo40;->k:Ljava/lang/Long;

    .line 383
    .line 384
    if-eqz v10, :cond_b

    .line 385
    .line 386
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 387
    .line 388
    .line 389
    move-result-wide v10

    .line 390
    move-wide/from16 v30, v10

    .line 391
    .line 392
    goto :goto_8

    .line 393
    :cond_b
    const-wide/16 v30, 0x0

    .line 394
    .line 395
    :goto_8
    iget-object v10, v6, La/lo40;->l:Ljava/lang/Double;

    .line 396
    .line 397
    if-eqz v10, :cond_c

    .line 398
    .line 399
    invoke-virtual {v10}, Ljava/lang/Double;->doubleValue()D

    .line 400
    .line 401
    .line 402
    move-result-wide v10

    .line 403
    move-wide/from16 v32, v10

    .line 404
    .line 405
    goto :goto_9

    .line 406
    :cond_c
    move-wide/from16 v32, v12

    .line 407
    .line 408
    :goto_9
    iget-object v10, v6, La/lo40;->m:Ljava/lang/Boolean;

    .line 409
    .line 410
    if-eqz v10, :cond_d

    .line 411
    .line 412
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 413
    .line 414
    .line 415
    move-result v10

    .line 416
    move/from16 v34, v10

    .line 417
    .line 418
    goto :goto_a

    .line 419
    :cond_d
    move/from16 v34, v8

    .line 420
    .line 421
    :goto_a
    iget-object v10, v6, La/lo40;->n:Ljava/lang/Double;

    .line 422
    .line 423
    if-eqz v10, :cond_e

    .line 424
    .line 425
    invoke-virtual {v10}, Ljava/lang/Double;->doubleValue()D

    .line 426
    .line 427
    .line 428
    move-result-wide v12

    .line 429
    :cond_e
    move-wide/from16 v35, v12

    .line 430
    .line 431
    iget-object v10, v6, La/lo40;->o:Ljava/lang/Long;

    .line 432
    .line 433
    if-eqz v10, :cond_f

    .line 434
    .line 435
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 436
    .line 437
    .line 438
    move-result-wide v10

    .line 439
    move-wide/from16 v37, v10

    .line 440
    .line 441
    goto :goto_b

    .line 442
    :cond_f
    const-wide/16 v37, 0x0

    .line 443
    .line 444
    :goto_b
    iget-object v10, v6, La/lo40;->p:Ljava/util/List;

    .line 445
    .line 446
    if-eqz v10, :cond_12

    .line 447
    .line 448
    new-instance v11, Ljava/util/ArrayList;

    .line 449
    .line 450
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 451
    .line 452
    .line 453
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 454
    .line 455
    .line 456
    move-result-object v10

    .line 457
    :cond_10
    :goto_c
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 458
    .line 459
    .line 460
    move-result v12

    .line 461
    if-eqz v12, :cond_13

    .line 462
    .line 463
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v12

    .line 467
    check-cast v12, La/t95;

    .line 468
    .line 469
    if-eqz v12, :cond_11

    .line 470
    .line 471
    invoke-static {v12, v8}, La/b8k0;->X(La/t95;Z)La/a95;

    .line 472
    .line 473
    .line 474
    move-result-object v12

    .line 475
    goto :goto_d

    .line 476
    :cond_11
    move-object/from16 v12, p2

    .line 477
    .line 478
    :goto_d
    if-eqz v12, :cond_10

    .line 479
    .line 480
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 481
    .line 482
    .line 483
    goto :goto_c

    .line 484
    :cond_12
    move-object/from16 v11, p2

    .line 485
    .line 486
    :cond_13
    if-nez v11, :cond_14

    .line 487
    .line 488
    sget-object v11, La/iun;->a:La/iun;

    .line 489
    .line 490
    :cond_14
    move-object/from16 v39, v11

    .line 491
    .line 492
    iget-object v10, v6, La/lo40;->q:La/zl;

    .line 493
    .line 494
    if-eqz v10, :cond_15

    .line 495
    .line 496
    invoke-static {v10}, La/b8k0;->W(La/zl;)La/tl;

    .line 497
    .line 498
    .line 499
    move-result-object v10

    .line 500
    move-object/from16 v40, v10

    .line 501
    .line 502
    goto :goto_e

    .line 503
    :cond_15
    move-object/from16 v40, p2

    .line 504
    .line 505
    :goto_e
    iget-object v6, v6, La/lo40;->r:Ljava/lang/Boolean;

    .line 506
    .line 507
    if-eqz v6, :cond_16

    .line 508
    .line 509
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 510
    .line 511
    .line 512
    move-result v41

    .line 513
    move-object/from16 v17, v14

    .line 514
    .line 515
    new-instance v14, La/qcq;

    .line 516
    .line 517
    move-object/from16 v16, v7

    .line 518
    .line 519
    invoke-direct/range {v14 .. v41}, La/qcq;-><init>(La/bnz;La/xrz;Ljava/lang/String;DZZZLa/lrz;JJJJDZDJLjava/util/List;La/tl;Z)V

    .line 520
    .line 521
    .line 522
    invoke-virtual {v4, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 523
    .line 524
    .line 525
    goto/16 :goto_3

    .line 526
    .line 527
    :cond_16
    invoke-static/range {p2 .. p2}, La/jf4;->k(Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    return-object p2

    .line 531
    :cond_17
    invoke-static/range {p2 .. p2}, La/jf4;->k(Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    return-object p2

    .line 535
    :cond_18
    invoke-static/range {p2 .. p2}, La/jf4;->k(Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    return-object p2

    .line 539
    :cond_19
    invoke-static/range {p2 .. p2}, La/jf4;->k(Ljava/lang/String;)V

    .line 540
    .line 541
    .line 542
    return-object p2

    .line 543
    :cond_1a
    invoke-static/range {p2 .. p2}, La/jf4;->k(Ljava/lang/String;)V

    .line 544
    .line 545
    .line 546
    return-object p2

    .line 547
    :cond_1b
    invoke-static/range {p2 .. p2}, La/jf4;->k(Ljava/lang/String;)V

    .line 548
    .line 549
    .line 550
    return-object p2

    .line 551
    :cond_1c
    invoke-static/range {p2 .. p2}, La/jf4;->k(Ljava/lang/String;)V

    .line 552
    .line 553
    .line 554
    return-object p2

    .line 555
    :cond_1d
    invoke-static/range {p2 .. p2}, La/jf4;->k(Ljava/lang/String;)V

    .line 556
    .line 557
    .line 558
    return-object p2

    .line 559
    :cond_1e
    iget-object v0, v0, La/j300;->b:Ljava/util/List;

    .line 560
    .line 561
    if-nez v0, :cond_1f

    .line 562
    .line 563
    sget-object v0, La/iun;->a:La/iun;

    .line 564
    .line 565
    :cond_1f
    new-instance v3, Ljava/util/ArrayList;

    .line 566
    .line 567
    invoke-static {v0, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 568
    .line 569
    .line 570
    move-result v5

    .line 571
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 572
    .line 573
    .line 574
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 579
    .line 580
    .line 581
    move-result v5

    .line 582
    if-eqz v5, :cond_32

    .line 583
    .line 584
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    move-result-object v5

    .line 588
    check-cast v5, La/kjq0;

    .line 589
    .line 590
    iget-object v6, v5, La/kjq0;->a:Ljava/lang/Integer;

    .line 591
    .line 592
    iget-object v7, v5, La/kjq0;->b:Ljava/lang/Long;

    .line 593
    .line 594
    if-eqz v6, :cond_31

    .line 595
    .line 596
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 597
    .line 598
    .line 599
    move-result v6

    .line 600
    invoke-static {v6}, La/tlb;->T(I)La/xrz;

    .line 601
    .line 602
    .line 603
    move-result-object v20

    .line 604
    invoke-interface/range {v20 .. v20}, La/xrz;->a()La/bnz;

    .line 605
    .line 606
    .line 607
    move-result-object v19

    .line 608
    if-eqz v7, :cond_20

    .line 609
    .line 610
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 611
    .line 612
    .line 613
    move-result-wide v10

    .line 614
    move-wide/from16 v21, v10

    .line 615
    .line 616
    goto :goto_10

    .line 617
    :cond_20
    const-wide/16 v21, 0x0

    .line 618
    .line 619
    :goto_10
    const-string v6, ""

    .line 620
    .line 621
    if-eqz v7, :cond_22

    .line 622
    .line 623
    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    .line 624
    .line 625
    .line 626
    move-result-wide v10

    .line 627
    const-wide/16 v14, -0x1

    .line 628
    .line 629
    cmp-long v7, v10, v14

    .line 630
    .line 631
    if-nez v7, :cond_21

    .line 632
    .line 633
    move-object v7, v6

    .line 634
    goto :goto_11

    .line 635
    :cond_21
    sget-object v7, La/rdj;->a:La/rdj;

    .line 636
    .line 637
    sget-object v7, La/efj;->c:La/efj;

    .line 638
    .line 639
    new-instance v14, La/znq0;

    .line 640
    .line 641
    invoke-direct {v14, v10, v11}, La/znq0;-><init>(J)V

    .line 642
    .line 643
    .line 644
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 645
    .line 646
    .line 647
    move-result-object v10

    .line 648
    const/16 v11, 0x38

    .line 649
    .line 650
    invoke-static {v14, v7, v10, v8, v11}, La/rdj;->g(La/aoq0;La/efj;Ljava/lang/Boolean;ZI)Ljava/lang/String;

    .line 651
    .line 652
    .line 653
    move-result-object v7

    .line 654
    goto :goto_11

    .line 655
    :cond_22
    move-object/from16 v7, p2

    .line 656
    .line 657
    :goto_11
    if-nez v7, :cond_23

    .line 658
    .line 659
    move-object/from16 v23, v6

    .line 660
    .line 661
    goto :goto_12

    .line 662
    :cond_23
    move-object/from16 v23, v7

    .line 663
    .line 664
    :goto_12
    iget-object v6, v5, La/kjq0;->c:Ljava/lang/Double;

    .line 665
    .line 666
    if-eqz v6, :cond_24

    .line 667
    .line 668
    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    .line 669
    .line 670
    .line 671
    move-result-wide v6

    .line 672
    move-wide/from16 v24, v6

    .line 673
    .line 674
    goto :goto_13

    .line 675
    :cond_24
    move-wide/from16 v24, v12

    .line 676
    .line 677
    :goto_13
    iget-object v6, v5, La/kjq0;->d:Ljava/lang/Boolean;

    .line 678
    .line 679
    if-eqz v6, :cond_25

    .line 680
    .line 681
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 682
    .line 683
    .line 684
    move-result v6

    .line 685
    move/from16 v26, v6

    .line 686
    .line 687
    goto :goto_14

    .line 688
    :cond_25
    move/from16 v26, v8

    .line 689
    .line 690
    :goto_14
    iget-object v6, v5, La/kjq0;->e:Ljava/lang/Boolean;

    .line 691
    .line 692
    if-eqz v6, :cond_26

    .line 693
    .line 694
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 695
    .line 696
    .line 697
    move-result v6

    .line 698
    move/from16 v27, v6

    .line 699
    .line 700
    goto :goto_15

    .line 701
    :cond_26
    move/from16 v27, v8

    .line 702
    .line 703
    :goto_15
    iget-object v6, v5, La/kjq0;->f:Ljava/lang/Boolean;

    .line 704
    .line 705
    if-eqz v6, :cond_30

    .line 706
    .line 707
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 708
    .line 709
    .line 710
    move-result v28

    .line 711
    iget-object v6, v5, La/kjq0;->g:Ljava/lang/Boolean;

    .line 712
    .line 713
    if-eqz v6, :cond_2f

    .line 714
    .line 715
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 716
    .line 717
    .line 718
    move-result v29

    .line 719
    sget-object v6, La/lrz;->a:La/rqt;

    .line 720
    .line 721
    iget-object v7, v5, La/kjq0;->h:Ljava/lang/String;

    .line 722
    .line 723
    if-eqz v7, :cond_2e

    .line 724
    .line 725
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 726
    .line 727
    .line 728
    invoke-static {v7}, La/rqt;->c(Ljava/lang/String;)La/lrz;

    .line 729
    .line 730
    .line 731
    move-result-object v30

    .line 732
    iget-object v6, v5, La/kjq0;->i:Ljava/util/List;

    .line 733
    .line 734
    if-eqz v6, :cond_29

    .line 735
    .line 736
    new-instance v7, Ljava/util/ArrayList;

    .line 737
    .line 738
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 739
    .line 740
    .line 741
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 742
    .line 743
    .line 744
    move-result-object v6

    .line 745
    :cond_27
    :goto_16
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 746
    .line 747
    .line 748
    move-result v10

    .line 749
    if-eqz v10, :cond_2a

    .line 750
    .line 751
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 752
    .line 753
    .line 754
    move-result-object v10

    .line 755
    check-cast v10, La/t95;

    .line 756
    .line 757
    if-eqz v10, :cond_28

    .line 758
    .line 759
    invoke-static {v10, v9}, La/b8k0;->X(La/t95;Z)La/a95;

    .line 760
    .line 761
    .line 762
    move-result-object v10

    .line 763
    goto :goto_17

    .line 764
    :cond_28
    move-object/from16 v10, p2

    .line 765
    .line 766
    :goto_17
    if-eqz v10, :cond_27

    .line 767
    .line 768
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 769
    .line 770
    .line 771
    goto :goto_16

    .line 772
    :cond_29
    move-object/from16 v7, p2

    .line 773
    .line 774
    :cond_2a
    if-nez v7, :cond_2b

    .line 775
    .line 776
    sget-object v7, La/iun;->a:La/iun;

    .line 777
    .line 778
    :cond_2b
    move-object/from16 v31, v7

    .line 779
    .line 780
    iget-object v6, v5, La/kjq0;->j:La/zl;

    .line 781
    .line 782
    if-eqz v6, :cond_2c

    .line 783
    .line 784
    invoke-static {v6}, La/b8k0;->W(La/zl;)La/tl;

    .line 785
    .line 786
    .line 787
    move-result-object v6

    .line 788
    move-object/from16 v32, v6

    .line 789
    .line 790
    goto :goto_18

    .line 791
    :cond_2c
    move-object/from16 v32, p2

    .line 792
    .line 793
    :goto_18
    iget-object v5, v5, La/kjq0;->k:Ljava/lang/Boolean;

    .line 794
    .line 795
    if-eqz v5, :cond_2d

    .line 796
    .line 797
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 798
    .line 799
    .line 800
    move-result v33

    .line 801
    new-instance v18, La/siq0;

    .line 802
    .line 803
    invoke-direct/range {v18 .. v33}, La/siq0;-><init>(La/bnz;La/xrz;JLjava/lang/String;DZZZZLa/lrz;Ljava/util/List;La/tl;Z)V

    .line 804
    .line 805
    .line 806
    move-object/from16 v5, v18

    .line 807
    .line 808
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 809
    .line 810
    .line 811
    goto/16 :goto_f

    .line 812
    .line 813
    :cond_2d
    invoke-static/range {p2 .. p2}, La/jf4;->k(Ljava/lang/String;)V

    .line 814
    .line 815
    .line 816
    return-object p2

    .line 817
    :cond_2e
    invoke-static/range {p2 .. p2}, La/jf4;->k(Ljava/lang/String;)V

    .line 818
    .line 819
    .line 820
    return-object p2

    .line 821
    :cond_2f
    invoke-static/range {p2 .. p2}, La/jf4;->k(Ljava/lang/String;)V

    .line 822
    .line 823
    .line 824
    return-object p2

    .line 825
    :cond_30
    invoke-static/range {p2 .. p2}, La/jf4;->k(Ljava/lang/String;)V

    .line 826
    .line 827
    .line 828
    return-object p2

    .line 829
    :cond_31
    invoke-static/range {p2 .. p2}, La/jf4;->k(Ljava/lang/String;)V

    .line 830
    .line 831
    .line 832
    return-object p2

    .line 833
    :cond_32
    new-instance v0, La/lzz;

    .line 834
    .line 835
    invoke-direct {v0, v4, v3}, La/lzz;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 836
    .line 837
    .line 838
    iget-object v1, v1, La/twz;->c:La/kwz;

    .line 839
    .line 840
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 841
    .line 842
    .line 843
    iput-object v0, v1, La/kwz;->a:La/lzz;

    .line 844
    .line 845
    return-object v0

    .line 846
    :catchall_1
    move-exception v0

    .line 847
    :goto_19
    invoke-static {v0}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 848
    .line 849
    .line 850
    move-result v6

    .line 851
    if-eqz v6, :cond_37

    .line 852
    .line 853
    if-nez v7, :cond_33

    .line 854
    .line 855
    new-instance v10, La/el50;

    .line 856
    .line 857
    invoke-direct {v10, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 858
    .line 859
    .line 860
    move v0, v8

    .line 861
    const/4 v6, 0x2

    .line 862
    goto/16 :goto_1

    .line 863
    .line 864
    :cond_33
    int-to-long v8, v5

    .line 865
    cmp-long v8, v8, v13

    .line 866
    .line 867
    if-gez v8, :cond_34

    .line 868
    .line 869
    const/4 v8, 0x1

    .line 870
    goto :goto_1a

    .line 871
    :cond_34
    const/4 v8, 0x0

    .line 872
    :goto_1a
    add-int/lit8 v5, v5, 0x1

    .line 873
    .line 874
    if-eqz v8, :cond_35

    .line 875
    .line 876
    iput-object v2, v4, La/mwz;->i:Ljava/lang/String;

    .line 877
    .line 878
    iput-object v10, v4, La/mwz;->j:Ljava/lang/Throwable;

    .line 879
    .line 880
    iput-wide v13, v4, La/mwz;->k:J

    .line 881
    .line 882
    iput-wide v11, v4, La/mwz;->l:J

    .line 883
    .line 884
    iput v7, v4, La/mwz;->m:I

    .line 885
    .line 886
    iput v5, v4, La/mwz;->n:I

    .line 887
    .line 888
    iput v8, v4, La/mwz;->o:I

    .line 889
    .line 890
    const/4 v9, 0x2

    .line 891
    iput v9, v4, La/mwz;->r:I

    .line 892
    .line 893
    invoke-static {v11, v12, v4}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 894
    .line 895
    .line 896
    move-result-object v0

    .line 897
    if-ne v0, v3, :cond_36

    .line 898
    .line 899
    goto :goto_1e

    .line 900
    :goto_1b
    move v6, v9

    .line 901
    :goto_1c
    const/4 v8, 0x0

    .line 902
    const/4 v9, 0x1

    .line 903
    goto/16 :goto_1

    .line 904
    .line 905
    :cond_35
    const/4 v9, 0x2

    .line 906
    new-instance v10, La/el50;

    .line 907
    .line 908
    invoke-direct {v10, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 909
    .line 910
    .line 911
    :cond_36
    move v0, v8

    .line 912
    goto :goto_1b

    .line 913
    :cond_37
    const/4 v9, 0x2

    .line 914
    invoke-static {v0}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 915
    .line 916
    .line 917
    move-result v8

    .line 918
    if-eqz v8, :cond_3b

    .line 919
    .line 920
    move v8, v7

    .line 921
    int-to-long v6, v5

    .line 922
    cmp-long v6, v6, v13

    .line 923
    .line 924
    if-gez v6, :cond_38

    .line 925
    .line 926
    const/4 v6, 0x1

    .line 927
    goto :goto_1d

    .line 928
    :cond_38
    const/4 v6, 0x0

    .line 929
    :goto_1d
    add-int/lit8 v5, v5, 0x1

    .line 930
    .line 931
    if-eqz v6, :cond_39

    .line 932
    .line 933
    iput-object v2, v4, La/mwz;->i:Ljava/lang/String;

    .line 934
    .line 935
    iput-object v10, v4, La/mwz;->j:Ljava/lang/Throwable;

    .line 936
    .line 937
    iput-wide v13, v4, La/mwz;->k:J

    .line 938
    .line 939
    iput-wide v11, v4, La/mwz;->l:J

    .line 940
    .line 941
    iput v8, v4, La/mwz;->m:I

    .line 942
    .line 943
    iput v5, v4, La/mwz;->n:I

    .line 944
    .line 945
    iput v6, v4, La/mwz;->o:I

    .line 946
    .line 947
    const/4 v7, 0x3

    .line 948
    iput v7, v4, La/mwz;->r:I

    .line 949
    .line 950
    invoke-static {v11, v12, v4}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 951
    .line 952
    .line 953
    move-result-object v0

    .line 954
    if-ne v0, v3, :cond_3a

    .line 955
    .line 956
    :goto_1e
    return-object v3

    .line 957
    :goto_1f
    move v7, v8

    .line 958
    goto :goto_1b

    .line 959
    :cond_39
    const/4 v7, 0x3

    .line 960
    new-instance v10, La/dag0;

    .line 961
    .line 962
    invoke-direct {v10, v0}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 963
    .line 964
    .line 965
    :cond_3a
    move v0, v6

    .line 966
    goto :goto_1f

    .line 967
    :cond_3b
    move v8, v7

    .line 968
    const/4 v7, 0x3

    .line 969
    invoke-static {v0}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 970
    .line 971
    .line 972
    move-object v10, v0

    .line 973
    move v7, v8

    .line 974
    move v6, v9

    .line 975
    const/4 v0, 0x0

    .line 976
    goto :goto_1c

    .line 977
    :cond_3c
    if-nez v10, :cond_3d

    .line 978
    .line 979
    const-string v0, "Unexpected error"

    .line 980
    .line 981
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 982
    .line 983
    .line 984
    return-object p2

    .line 985
    :cond_3d
    throw v10
.end method

.method public final b(La/hac;La/zje;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    instance-of v2, v0, La/nwz;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, La/nwz;

    .line 11
    .line 12
    iget v3, v2, La/nwz;->r:I

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
    iput v3, v2, La/nwz;->r:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/nwz;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, La/nwz;-><init>(La/twz;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, La/nwz;->p:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/nwz;->r:I

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v9, 0x1

    .line 38
    if-eqz v4, :cond_4

    .line 39
    .line 40
    if-eq v4, v9, :cond_3

    .line 41
    .line 42
    if-eq v4, v6, :cond_2

    .line 43
    .line 44
    if-ne v4, v5, :cond_1

    .line 45
    .line 46
    iget v4, v2, La/nwz;->o:I

    .line 47
    .line 48
    iget v10, v2, La/nwz;->n:I

    .line 49
    .line 50
    iget v11, v2, La/nwz;->m:I

    .line 51
    .line 52
    iget-wide v12, v2, La/nwz;->l:J

    .line 53
    .line 54
    iget-wide v14, v2, La/nwz;->k:J

    .line 55
    .line 56
    const/16 p2, 0x0

    .line 57
    .line 58
    iget-object v7, v2, La/nwz;->j:Ljava/lang/Throwable;

    .line 59
    .line 60
    iget-object v8, v2, La/nwz;->i:La/hac;

    .line 61
    .line 62
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    move v0, v4

    .line 66
    move v9, v6

    .line 67
    move-object v4, v2

    .line 68
    move-object v2, v8

    .line 69
    move-object v8, v7

    .line 70
    move v7, v10

    .line 71
    move-wide/from16 v16, v14

    .line 72
    .line 73
    move v14, v11

    .line 74
    move-wide v10, v12

    .line 75
    move-wide/from16 v12, v16

    .line 76
    .line 77
    goto/16 :goto_d

    .line 78
    .line 79
    :cond_1
    const/16 p2, 0x0

    .line 80
    .line 81
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 82
    .line 83
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-object p2

    .line 87
    :cond_2
    const/16 p2, 0x0

    .line 88
    .line 89
    iget v4, v2, La/nwz;->o:I

    .line 90
    .line 91
    iget v7, v2, La/nwz;->n:I

    .line 92
    .line 93
    iget v8, v2, La/nwz;->m:I

    .line 94
    .line 95
    iget-wide v10, v2, La/nwz;->l:J

    .line 96
    .line 97
    iget-wide v12, v2, La/nwz;->k:J

    .line 98
    .line 99
    iget-object v14, v2, La/nwz;->j:Ljava/lang/Throwable;

    .line 100
    .line 101
    iget-object v15, v2, La/nwz;->i:La/hac;

    .line 102
    .line 103
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    move-object v0, v14

    .line 107
    move v14, v8

    .line 108
    move-object v8, v0

    .line 109
    move v0, v4

    .line 110
    move v9, v6

    .line 111
    move-object v4, v2

    .line 112
    move-object v2, v15

    .line 113
    goto/16 :goto_8

    .line 114
    .line 115
    :cond_3
    const/16 p2, 0x0

    .line 116
    .line 117
    iget v4, v2, La/nwz;->n:I

    .line 118
    .line 119
    iget v7, v2, La/nwz;->m:I

    .line 120
    .line 121
    iget-wide v10, v2, La/nwz;->l:J

    .line 122
    .line 123
    iget-wide v12, v2, La/nwz;->k:J

    .line 124
    .line 125
    iget-object v8, v2, La/nwz;->j:Ljava/lang/Throwable;

    .line 126
    .line 127
    iget-object v14, v2, La/nwz;->i:La/hac;

    .line 128
    .line 129
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    .line 131
    .line 132
    goto/16 :goto_5

    .line 133
    .line 134
    :catchall_0
    move-exception v0

    .line 135
    move v5, v4

    .line 136
    move-object v4, v2

    .line 137
    move-object v2, v14

    .line 138
    move v14, v7

    .line 139
    move v7, v5

    .line 140
    :goto_1
    move v5, v9

    .line 141
    goto/16 :goto_6

    .line 142
    .line 143
    :cond_4
    const/16 p2, 0x0

    .line 144
    .line 145
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    sget-wide v7, La/cag0;->a:J

    .line 149
    .line 150
    const-wide/16 v10, 0x3

    .line 151
    .line 152
    move-object v4, v2

    .line 153
    move v0, v9

    .line 154
    move v14, v0

    .line 155
    move-wide v12, v10

    .line 156
    move-object/from16 v2, p1

    .line 157
    .line 158
    move-wide v10, v7

    .line 159
    const/4 v7, 0x0

    .line 160
    move-object/from16 v8, p2

    .line 161
    .line 162
    :goto_2
    if-eqz v0, :cond_15

    .line 163
    .line 164
    :try_start_1
    iget-object v15, v1, La/twz;->a:La/lwz;

    .line 165
    .line 166
    iget-object v5, v1, La/twz;->b:La/btt0;

    .line 167
    .line 168
    invoke-virtual {v5}, La/btt0;->a()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    iget-object v6, v2, La/hac;->c:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v6, La/ace0;

    .line 178
    .line 179
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 180
    .line 181
    .line 182
    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 183
    if-eqz v6, :cond_9

    .line 184
    .line 185
    if-eq v6, v9, :cond_8

    .line 186
    .line 187
    const/4 v9, 0x2

    .line 188
    if-eq v6, v9, :cond_7

    .line 189
    .line 190
    const/4 v9, 0x3

    .line 191
    if-eq v6, v9, :cond_6

    .line 192
    .line 193
    const/4 v9, 0x4

    .line 194
    if-ne v6, v9, :cond_5

    .line 195
    .line 196
    move-object/from16 p1, v5

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_5
    :try_start_2
    new-instance v0, La/m460;

    .line 200
    .line 201
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 202
    .line 203
    .line 204
    throw v0

    .line 205
    :cond_6
    move-object/from16 p1, v5

    .line 206
    .line 207
    const/4 v9, 0x3

    .line 208
    goto :goto_3

    .line 209
    :cond_7
    move-object/from16 p1, v5

    .line 210
    .line 211
    const/4 v9, 0x2

    .line 212
    goto :goto_3

    .line 213
    :cond_8
    move-object/from16 p1, v5

    .line 214
    .line 215
    const/4 v9, 0x1

    .line 216
    goto :goto_3

    .line 217
    :cond_9
    move-object/from16 p1, v5

    .line 218
    .line 219
    const/4 v9, 0x0

    .line 220
    :goto_3
    iget-wide v5, v2, La/hac;->b:J

    .line 221
    .line 222
    new-instance v1, La/gce0;

    .line 223
    .line 224
    invoke-direct {v1, v5, v6, v9}, La/gce0;-><init>(JI)V

    .line 225
    .line 226
    .line 227
    iput-object v2, v4, La/nwz;->i:La/hac;

    .line 228
    .line 229
    iput-object v8, v4, La/nwz;->j:Ljava/lang/Throwable;

    .line 230
    .line 231
    iput-wide v12, v4, La/nwz;->k:J

    .line 232
    .line 233
    iput-wide v10, v4, La/nwz;->l:J

    .line 234
    .line 235
    iput v14, v4, La/nwz;->m:I

    .line 236
    .line 237
    iput v7, v4, La/nwz;->n:I

    .line 238
    .line 239
    iput v0, v4, La/nwz;->o:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 240
    .line 241
    const/4 v5, 0x1

    .line 242
    :try_start_3
    iput v5, v4, La/nwz;->r:I

    .line 243
    .line 244
    iget-object v0, v15, La/lwz;->a:La/tpv;

    .line 245
    .line 246
    invoke-virtual {v0}, La/tpv;->invoke()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    check-cast v0, La/fuz;

    .line 251
    .line 252
    move-object/from16 v6, p1

    .line 253
    .line 254
    invoke-interface {v0, v6, v1, v4}, La/fuz;->d(Ljava/lang/String;La/gce0;La/yje;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    sget-object v1, La/wne;->a:La/wne;

    .line 259
    .line 260
    if-ne v0, v1, :cond_a

    .line 261
    .line 262
    goto :goto_4

    .line 263
    :cond_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 264
    .line 265
    :goto_4
    if-ne v0, v3, :cond_b

    .line 266
    .line 267
    goto/16 :goto_c

    .line 268
    .line 269
    :cond_b
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 270
    .line 271
    return-object v0

    .line 272
    :catchall_1
    move-exception v0

    .line 273
    goto :goto_6

    .line 274
    :catchall_2
    move-exception v0

    .line 275
    const/4 v5, 0x1

    .line 276
    goto :goto_6

    .line 277
    :catchall_3
    move-exception v0

    .line 278
    goto/16 :goto_1

    .line 279
    .line 280
    :goto_6
    invoke-static {v0}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    if-eqz v1, :cond_10

    .line 285
    .line 286
    if-nez v14, :cond_c

    .line 287
    .line 288
    new-instance v8, La/el50;

    .line 289
    .line 290
    invoke-direct {v8, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 291
    .line 292
    .line 293
    move-object/from16 v1, p0

    .line 294
    .line 295
    move v9, v5

    .line 296
    const/4 v0, 0x0

    .line 297
    const/4 v5, 0x3

    .line 298
    const/4 v6, 0x2

    .line 299
    goto/16 :goto_2

    .line 300
    .line 301
    :cond_c
    int-to-long v5, v7

    .line 302
    cmp-long v1, v5, v12

    .line 303
    .line 304
    if-gez v1, :cond_d

    .line 305
    .line 306
    const/4 v1, 0x1

    .line 307
    goto :goto_7

    .line 308
    :cond_d
    const/4 v1, 0x0

    .line 309
    :goto_7
    add-int/lit8 v7, v7, 0x1

    .line 310
    .line 311
    if-eqz v1, :cond_f

    .line 312
    .line 313
    iput-object v2, v4, La/nwz;->i:La/hac;

    .line 314
    .line 315
    iput-object v8, v4, La/nwz;->j:Ljava/lang/Throwable;

    .line 316
    .line 317
    iput-wide v12, v4, La/nwz;->k:J

    .line 318
    .line 319
    iput-wide v10, v4, La/nwz;->l:J

    .line 320
    .line 321
    iput v14, v4, La/nwz;->m:I

    .line 322
    .line 323
    iput v7, v4, La/nwz;->n:I

    .line 324
    .line 325
    iput v1, v4, La/nwz;->o:I

    .line 326
    .line 327
    const/4 v9, 0x2

    .line 328
    iput v9, v4, La/nwz;->r:I

    .line 329
    .line 330
    invoke-static {v10, v11, v4}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    if-ne v0, v3, :cond_e

    .line 335
    .line 336
    goto :goto_c

    .line 337
    :cond_e
    move v0, v1

    .line 338
    :goto_8
    move-object/from16 v1, p0

    .line 339
    .line 340
    move v6, v9

    .line 341
    const/4 v5, 0x3

    .line 342
    :goto_9
    const/4 v9, 0x1

    .line 343
    goto/16 :goto_2

    .line 344
    .line 345
    :cond_f
    const/4 v9, 0x2

    .line 346
    new-instance v8, La/el50;

    .line 347
    .line 348
    invoke-direct {v8, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 349
    .line 350
    .line 351
    move v0, v1

    .line 352
    move v6, v9

    .line 353
    const/4 v5, 0x3

    .line 354
    :goto_a
    const/4 v9, 0x1

    .line 355
    move-object/from16 v1, p0

    .line 356
    .line 357
    goto/16 :goto_2

    .line 358
    .line 359
    :cond_10
    const/4 v9, 0x2

    .line 360
    invoke-static {v0}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 361
    .line 362
    .line 363
    move-result v1

    .line 364
    if-eqz v1, :cond_14

    .line 365
    .line 366
    int-to-long v5, v7

    .line 367
    cmp-long v1, v5, v12

    .line 368
    .line 369
    if-gez v1, :cond_11

    .line 370
    .line 371
    const/4 v1, 0x1

    .line 372
    goto :goto_b

    .line 373
    :cond_11
    const/4 v1, 0x0

    .line 374
    :goto_b
    add-int/lit8 v7, v7, 0x1

    .line 375
    .line 376
    if-eqz v1, :cond_13

    .line 377
    .line 378
    iput-object v2, v4, La/nwz;->i:La/hac;

    .line 379
    .line 380
    iput-object v8, v4, La/nwz;->j:Ljava/lang/Throwable;

    .line 381
    .line 382
    iput-wide v12, v4, La/nwz;->k:J

    .line 383
    .line 384
    iput-wide v10, v4, La/nwz;->l:J

    .line 385
    .line 386
    iput v14, v4, La/nwz;->m:I

    .line 387
    .line 388
    iput v7, v4, La/nwz;->n:I

    .line 389
    .line 390
    iput v1, v4, La/nwz;->o:I

    .line 391
    .line 392
    const/4 v5, 0x3

    .line 393
    iput v5, v4, La/nwz;->r:I

    .line 394
    .line 395
    invoke-static {v10, v11, v4}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    if-ne v0, v3, :cond_12

    .line 400
    .line 401
    :goto_c
    return-object v3

    .line 402
    :cond_12
    move v0, v1

    .line 403
    :goto_d
    move-object/from16 v1, p0

    .line 404
    .line 405
    move v6, v9

    .line 406
    goto :goto_9

    .line 407
    :cond_13
    const/4 v5, 0x3

    .line 408
    new-instance v8, La/dag0;

    .line 409
    .line 410
    invoke-direct {v8, v0}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 411
    .line 412
    .line 413
    move v0, v1

    .line 414
    move v6, v9

    .line 415
    goto :goto_a

    .line 416
    :cond_14
    const/4 v5, 0x3

    .line 417
    invoke-static {v0}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 418
    .line 419
    .line 420
    move-object/from16 v1, p0

    .line 421
    .line 422
    move-object v8, v0

    .line 423
    move v6, v9

    .line 424
    const/4 v0, 0x0

    .line 425
    goto :goto_9

    .line 426
    :cond_15
    if-nez v8, :cond_16

    .line 427
    .line 428
    const-string v0, "Unexpected error"

    .line 429
    .line 430
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 431
    .line 432
    .line 433
    return-object p2

    .line 434
    :cond_16
    throw v8
.end method

.method public final c(ZLa/cnz;La/zje;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p3

    .line 4
    .line 5
    instance-of v2, v0, La/owz;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, La/owz;

    .line 11
    .line 12
    iget v3, v2, La/owz;->s:I

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
    iput v3, v2, La/owz;->s:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/owz;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, La/owz;-><init>(La/twz;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, La/owz;->q:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/owz;->s:I

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v9, 0x1

    .line 38
    if-eqz v4, :cond_4

    .line 39
    .line 40
    if-eq v4, v9, :cond_3

    .line 41
    .line 42
    if-eq v4, v6, :cond_2

    .line 43
    .line 44
    if-ne v4, v5, :cond_1

    .line 45
    .line 46
    iget v4, v2, La/owz;->p:I

    .line 47
    .line 48
    iget v10, v2, La/owz;->o:I

    .line 49
    .line 50
    iget v11, v2, La/owz;->n:I

    .line 51
    .line 52
    iget-wide v12, v2, La/owz;->m:J

    .line 53
    .line 54
    iget-wide v14, v2, La/owz;->l:J

    .line 55
    .line 56
    const/16 p3, 0x0

    .line 57
    .line 58
    iget-boolean v7, v2, La/owz;->i:Z

    .line 59
    .line 60
    iget-object v8, v2, La/owz;->k:Ljava/lang/Throwable;

    .line 61
    .line 62
    iget-object v5, v2, La/owz;->j:La/cnz;

    .line 63
    .line 64
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    move-object v1, v3

    .line 68
    move v0, v4

    .line 69
    move-object v4, v5

    .line 70
    const/4 v3, 0x3

    .line 71
    move-object v5, v2

    .line 72
    move v2, v7

    .line 73
    move-wide/from16 v16, v12

    .line 74
    .line 75
    move-object v13, v8

    .line 76
    move-wide/from16 v7, v16

    .line 77
    .line 78
    move-wide/from16 v16, v14

    .line 79
    .line 80
    move v14, v11

    .line 81
    move-wide/from16 v11, v16

    .line 82
    .line 83
    goto/16 :goto_d

    .line 84
    .line 85
    :cond_1
    const/16 p3, 0x0

    .line 86
    .line 87
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 88
    .line 89
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-object p3

    .line 93
    :cond_2
    const/16 p3, 0x0

    .line 94
    .line 95
    iget v4, v2, La/owz;->p:I

    .line 96
    .line 97
    iget v5, v2, La/owz;->o:I

    .line 98
    .line 99
    iget v7, v2, La/owz;->n:I

    .line 100
    .line 101
    iget-wide v10, v2, La/owz;->m:J

    .line 102
    .line 103
    iget-wide v12, v2, La/owz;->l:J

    .line 104
    .line 105
    iget-boolean v8, v2, La/owz;->i:Z

    .line 106
    .line 107
    iget-object v14, v2, La/owz;->k:Ljava/lang/Throwable;

    .line 108
    .line 109
    iget-object v15, v2, La/owz;->j:La/cnz;

    .line 110
    .line 111
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    move v0, v4

    .line 115
    move-object v4, v15

    .line 116
    move/from16 v16, v5

    .line 117
    .line 118
    move-object v5, v2

    .line 119
    move v2, v6

    .line 120
    move v6, v8

    .line 121
    move-wide/from16 v17, v10

    .line 122
    .line 123
    move/from16 v10, v16

    .line 124
    .line 125
    move-wide v11, v12

    .line 126
    move-object v13, v14

    .line 127
    move v14, v7

    .line 128
    move-wide/from16 v7, v17

    .line 129
    .line 130
    goto/16 :goto_9

    .line 131
    .line 132
    :cond_3
    const/16 p3, 0x0

    .line 133
    .line 134
    iget v4, v2, La/owz;->o:I

    .line 135
    .line 136
    iget v5, v2, La/owz;->n:I

    .line 137
    .line 138
    iget-wide v7, v2, La/owz;->m:J

    .line 139
    .line 140
    iget-wide v10, v2, La/owz;->l:J

    .line 141
    .line 142
    iget-boolean v12, v2, La/owz;->i:Z

    .line 143
    .line 144
    iget-object v13, v2, La/owz;->k:Ljava/lang/Throwable;

    .line 145
    .line 146
    iget-object v14, v2, La/owz;->j:La/cnz;

    .line 147
    .line 148
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 149
    .line 150
    .line 151
    goto/16 :goto_5

    .line 152
    .line 153
    :catchall_0
    move-exception v0

    .line 154
    move v1, v5

    .line 155
    move-object v5, v2

    .line 156
    move v2, v12

    .line 157
    move-wide v11, v10

    .line 158
    move v10, v4

    .line 159
    move-object v4, v14

    .line 160
    move v14, v1

    .line 161
    :goto_1
    move v1, v9

    .line 162
    goto :goto_6

    .line 163
    :cond_4
    const/16 p3, 0x0

    .line 164
    .line 165
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    sget-wide v4, La/cag0;->a:J

    .line 169
    .line 170
    const-wide/16 v7, 0x3

    .line 171
    .line 172
    move-object/from16 v13, p3

    .line 173
    .line 174
    move-wide v11, v7

    .line 175
    move v0, v9

    .line 176
    move v14, v0

    .line 177
    const/4 v10, 0x0

    .line 178
    move-wide v7, v4

    .line 179
    move-object/from16 v4, p2

    .line 180
    .line 181
    move-object v5, v2

    .line 182
    move/from16 v2, p1

    .line 183
    .line 184
    :goto_2
    if-eqz v0, :cond_10

    .line 185
    .line 186
    :try_start_1
    iget-object v15, v1, La/twz;->a:La/lwz;

    .line 187
    .line 188
    iget-object v6, v1, La/twz;->b:La/btt0;

    .line 189
    .line 190
    invoke-virtual {v6}, La/btt0;->a()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 194
    :try_start_2
    new-instance v9, La/ymz;

    .line 195
    .line 196
    iget-byte v1, v4, La/cnz;->a:B

    .line 197
    .line 198
    invoke-direct {v9, v1, v2}, La/ymz;-><init>(II)V

    .line 199
    .line 200
    .line 201
    iput-object v4, v5, La/owz;->j:La/cnz;

    .line 202
    .line 203
    iput-object v13, v5, La/owz;->k:Ljava/lang/Throwable;

    .line 204
    .line 205
    iput-boolean v2, v5, La/owz;->i:Z

    .line 206
    .line 207
    iput-wide v11, v5, La/owz;->l:J

    .line 208
    .line 209
    iput-wide v7, v5, La/owz;->m:J

    .line 210
    .line 211
    iput v14, v5, La/owz;->n:I

    .line 212
    .line 213
    iput v10, v5, La/owz;->o:I

    .line 214
    .line 215
    iput v0, v5, La/owz;->p:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 216
    .line 217
    const/4 v1, 0x1

    .line 218
    :try_start_3
    iput v1, v5, La/owz;->s:I

    .line 219
    .line 220
    iget-object v0, v15, La/lwz;->a:La/tpv;

    .line 221
    .line 222
    invoke-virtual {v0}, La/tpv;->invoke()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    check-cast v0, La/fuz;

    .line 227
    .line 228
    invoke-interface {v0, v6, v9, v5}, La/fuz;->c(Ljava/lang/String;La/ymz;La/yje;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    sget-object v6, La/wne;->a:La/wne;

    .line 233
    .line 234
    if-ne v0, v6, :cond_5

    .line 235
    .line 236
    goto :goto_3

    .line 237
    :cond_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 238
    .line 239
    :goto_3
    if-ne v0, v3, :cond_6

    .line 240
    .line 241
    :goto_4
    move-object v1, v3

    .line 242
    goto/16 :goto_c

    .line 243
    .line 244
    :cond_6
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 245
    .line 246
    return-object v0

    .line 247
    :catchall_1
    move-exception v0

    .line 248
    goto :goto_6

    .line 249
    :catchall_2
    move-exception v0

    .line 250
    const/4 v1, 0x1

    .line 251
    goto :goto_6

    .line 252
    :catchall_3
    move-exception v0

    .line 253
    goto :goto_1

    .line 254
    :goto_6
    invoke-static {v0}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 255
    .line 256
    .line 257
    move-result v6

    .line 258
    if-eqz v6, :cond_b

    .line 259
    .line 260
    if-nez v14, :cond_7

    .line 261
    .line 262
    new-instance v13, La/el50;

    .line 263
    .line 264
    invoke-direct {v13, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 265
    .line 266
    .line 267
    move v9, v1

    .line 268
    const/4 v0, 0x0

    .line 269
    const/4 v6, 0x2

    .line 270
    :goto_7
    move-object/from16 v1, p0

    .line 271
    .line 272
    goto :goto_2

    .line 273
    :cond_7
    move v6, v2

    .line 274
    int-to-long v1, v10

    .line 275
    cmp-long v1, v1, v11

    .line 276
    .line 277
    if-gez v1, :cond_8

    .line 278
    .line 279
    const/4 v1, 0x1

    .line 280
    goto :goto_8

    .line 281
    :cond_8
    const/4 v1, 0x0

    .line 282
    :goto_8
    add-int/lit8 v10, v10, 0x1

    .line 283
    .line 284
    if-eqz v1, :cond_a

    .line 285
    .line 286
    iput-object v4, v5, La/owz;->j:La/cnz;

    .line 287
    .line 288
    iput-object v13, v5, La/owz;->k:Ljava/lang/Throwable;

    .line 289
    .line 290
    iput-boolean v6, v5, La/owz;->i:Z

    .line 291
    .line 292
    iput-wide v11, v5, La/owz;->l:J

    .line 293
    .line 294
    iput-wide v7, v5, La/owz;->m:J

    .line 295
    .line 296
    iput v14, v5, La/owz;->n:I

    .line 297
    .line 298
    iput v10, v5, La/owz;->o:I

    .line 299
    .line 300
    iput v1, v5, La/owz;->p:I

    .line 301
    .line 302
    const/4 v2, 0x2

    .line 303
    iput v2, v5, La/owz;->s:I

    .line 304
    .line 305
    invoke-static {v7, v8, v5}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    if-ne v0, v3, :cond_9

    .line 310
    .line 311
    goto :goto_4

    .line 312
    :cond_9
    move v0, v1

    .line 313
    :goto_9
    move v1, v6

    .line 314
    move v6, v2

    .line 315
    move v2, v1

    .line 316
    move-object/from16 v1, p0

    .line 317
    .line 318
    const/4 v9, 0x1

    .line 319
    goto/16 :goto_2

    .line 320
    .line 321
    :cond_a
    const/4 v2, 0x2

    .line 322
    new-instance v13, La/el50;

    .line 323
    .line 324
    invoke-direct {v13, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 325
    .line 326
    .line 327
    move v0, v6

    .line 328
    move v6, v2

    .line 329
    move v2, v0

    .line 330
    move v0, v1

    .line 331
    :goto_a
    const/4 v9, 0x1

    .line 332
    goto :goto_7

    .line 333
    :cond_b
    move v6, v2

    .line 334
    const/4 v2, 0x2

    .line 335
    invoke-static {v0}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 336
    .line 337
    .line 338
    move-result v1

    .line 339
    if-eqz v1, :cond_f

    .line 340
    .line 341
    move-object v1, v3

    .line 342
    int-to-long v2, v10

    .line 343
    cmp-long v2, v2, v11

    .line 344
    .line 345
    if-gez v2, :cond_c

    .line 346
    .line 347
    const/4 v2, 0x1

    .line 348
    goto :goto_b

    .line 349
    :cond_c
    const/4 v2, 0x0

    .line 350
    :goto_b
    add-int/lit8 v10, v10, 0x1

    .line 351
    .line 352
    if-eqz v2, :cond_e

    .line 353
    .line 354
    iput-object v4, v5, La/owz;->j:La/cnz;

    .line 355
    .line 356
    iput-object v13, v5, La/owz;->k:Ljava/lang/Throwable;

    .line 357
    .line 358
    iput-boolean v6, v5, La/owz;->i:Z

    .line 359
    .line 360
    iput-wide v11, v5, La/owz;->l:J

    .line 361
    .line 362
    iput-wide v7, v5, La/owz;->m:J

    .line 363
    .line 364
    iput v14, v5, La/owz;->n:I

    .line 365
    .line 366
    iput v10, v5, La/owz;->o:I

    .line 367
    .line 368
    iput v2, v5, La/owz;->p:I

    .line 369
    .line 370
    const/4 v3, 0x3

    .line 371
    iput v3, v5, La/owz;->s:I

    .line 372
    .line 373
    invoke-static {v7, v8, v5}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    if-ne v0, v1, :cond_d

    .line 378
    .line 379
    :goto_c
    return-object v1

    .line 380
    :cond_d
    move v0, v2

    .line 381
    move v2, v6

    .line 382
    :goto_d
    move-object v3, v1

    .line 383
    :goto_e
    const/4 v6, 0x2

    .line 384
    goto :goto_a

    .line 385
    :cond_e
    const/4 v3, 0x3

    .line 386
    new-instance v13, La/dag0;

    .line 387
    .line 388
    invoke-direct {v13, v0}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 389
    .line 390
    .line 391
    move-object v3, v1

    .line 392
    move v0, v2

    .line 393
    move v2, v6

    .line 394
    goto :goto_e

    .line 395
    :cond_f
    move-object v1, v3

    .line 396
    const/4 v3, 0x3

    .line 397
    invoke-static {v0}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 398
    .line 399
    .line 400
    move-object v13, v0

    .line 401
    move-object v3, v1

    .line 402
    move v2, v6

    .line 403
    const/4 v0, 0x0

    .line 404
    goto :goto_e

    .line 405
    :cond_10
    if-nez v13, :cond_11

    .line 406
    .line 407
    const-string v0, "Unexpected error"

    .line 408
    .line 409
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    return-object p3

    .line 413
    :cond_11
    throw v13
.end method

.method public final d(IJLa/zje;Ljava/lang/String;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p4

    .line 4
    .line 5
    instance-of v2, v0, La/pwz;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, La/pwz;

    .line 11
    .line 12
    iget v3, v2, La/pwz;->t:I

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
    iput v3, v2, La/pwz;->t:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/pwz;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, La/pwz;-><init>(La/twz;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, La/pwz;->r:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/pwz;->t:I

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v9, 0x1

    .line 38
    if-eqz v4, :cond_4

    .line 39
    .line 40
    if-eq v4, v9, :cond_3

    .line 41
    .line 42
    if-eq v4, v6, :cond_2

    .line 43
    .line 44
    if-ne v4, v5, :cond_1

    .line 45
    .line 46
    iget v4, v2, La/pwz;->o:I

    .line 47
    .line 48
    iget v10, v2, La/pwz;->n:I

    .line 49
    .line 50
    iget v11, v2, La/pwz;->m:I

    .line 51
    .line 52
    iget-wide v12, v2, La/pwz;->k:J

    .line 53
    .line 54
    iget-wide v14, v2, La/pwz;->j:J

    .line 55
    .line 56
    const/16 p4, 0x0

    .line 57
    .line 58
    iget v7, v2, La/pwz;->l:I

    .line 59
    .line 60
    iget-wide v5, v2, La/pwz;->i:J

    .line 61
    .line 62
    iget-object v8, v2, La/pwz;->q:Ljava/lang/Throwable;

    .line 63
    .line 64
    iget-object v9, v2, La/pwz;->p:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move v0, v7

    .line 70
    move-object v7, v2

    .line 71
    move v2, v0

    .line 72
    move-object v1, v3

    .line 73
    move v0, v4

    .line 74
    move-wide v4, v5

    .line 75
    move-object v6, v9

    .line 76
    move v9, v11

    .line 77
    move-wide/from16 v17, v14

    .line 78
    .line 79
    move-object v14, v8

    .line 80
    move v8, v10

    .line 81
    move-wide v10, v12

    .line 82
    move-wide/from16 v12, v17

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    const/16 p4, 0x0

    .line 86
    .line 87
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 88
    .line 89
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-object p4

    .line 93
    :cond_2
    const/16 p4, 0x0

    .line 94
    .line 95
    iget v4, v2, La/pwz;->o:I

    .line 96
    .line 97
    iget v5, v2, La/pwz;->n:I

    .line 98
    .line 99
    iget v6, v2, La/pwz;->m:I

    .line 100
    .line 101
    iget-wide v7, v2, La/pwz;->k:J

    .line 102
    .line 103
    iget-wide v9, v2, La/pwz;->j:J

    .line 104
    .line 105
    iget v11, v2, La/pwz;->l:I

    .line 106
    .line 107
    iget-wide v12, v2, La/pwz;->i:J

    .line 108
    .line 109
    iget-object v14, v2, La/pwz;->q:Ljava/lang/Throwable;

    .line 110
    .line 111
    iget-object v15, v2, La/pwz;->p:Ljava/lang/String;

    .line 112
    .line 113
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    move-object v1, v3

    .line 117
    move v0, v4

    .line 118
    move-wide/from16 v17, v7

    .line 119
    .line 120
    move-object v7, v2

    .line 121
    move v8, v5

    .line 122
    move v2, v11

    .line 123
    move-wide v4, v12

    .line 124
    move-wide v12, v9

    .line 125
    move v9, v6

    .line 126
    move-wide/from16 v10, v17

    .line 127
    .line 128
    move-object v6, v15

    .line 129
    :goto_1
    const/4 v15, 0x2

    .line 130
    goto/16 :goto_7

    .line 131
    .line 132
    :cond_3
    const/16 p4, 0x0

    .line 133
    .line 134
    iget v4, v2, La/pwz;->n:I

    .line 135
    .line 136
    iget v5, v2, La/pwz;->m:I

    .line 137
    .line 138
    iget-wide v6, v2, La/pwz;->k:J

    .line 139
    .line 140
    iget-wide v8, v2, La/pwz;->j:J

    .line 141
    .line 142
    iget v10, v2, La/pwz;->l:I

    .line 143
    .line 144
    iget-wide v11, v2, La/pwz;->i:J

    .line 145
    .line 146
    iget-object v13, v2, La/pwz;->q:Ljava/lang/Throwable;

    .line 147
    .line 148
    iget-object v14, v2, La/pwz;->p:Ljava/lang/String;

    .line 149
    .line 150
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 151
    .line 152
    .line 153
    move-object v1, v3

    .line 154
    move-object v3, v13

    .line 155
    move-wide/from16 v17, v8

    .line 156
    .line 157
    move-object v8, v14

    .line 158
    move-wide v14, v11

    .line 159
    const/4 v9, 0x1

    .line 160
    move-wide/from16 v12, v17

    .line 161
    .line 162
    goto/16 :goto_3

    .line 163
    .line 164
    :catchall_0
    move-exception v0

    .line 165
    move-object v1, v3

    .line 166
    move v3, v5

    .line 167
    move-wide/from16 v17, v6

    .line 168
    .line 169
    move-object v7, v2

    .line 170
    move v2, v10

    .line 171
    move-object v6, v14

    .line 172
    move-object v14, v13

    .line 173
    move-wide/from16 v19, v8

    .line 174
    .line 175
    move v8, v4

    .line 176
    move-wide v4, v11

    .line 177
    const/4 v9, 0x1

    .line 178
    move-wide/from16 v10, v17

    .line 179
    .line 180
    move-wide/from16 v12, v19

    .line 181
    .line 182
    goto/16 :goto_6

    .line 183
    .line 184
    :cond_4
    const/16 p4, 0x0

    .line 185
    .line 186
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    sget-wide v4, La/cag0;->a:J

    .line 190
    .line 191
    const-wide/16 v6, 0x3

    .line 192
    .line 193
    move-object/from16 v14, p4

    .line 194
    .line 195
    move-wide v10, v4

    .line 196
    move-wide v12, v6

    .line 197
    const/4 v0, 0x1

    .line 198
    const/4 v8, 0x0

    .line 199
    const/4 v9, 0x1

    .line 200
    move-wide/from16 v4, p2

    .line 201
    .line 202
    move-object/from16 v6, p5

    .line 203
    .line 204
    move-object v7, v2

    .line 205
    move/from16 v2, p1

    .line 206
    .line 207
    :goto_2
    if-eqz v0, :cond_f

    .line 208
    .line 209
    :try_start_1
    iget-object v15, v1, La/twz;->a:La/lwz;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_7

    .line 210
    .line 211
    move-object/from16 v16, v3

    .line 212
    .line 213
    :try_start_2
    iget-object v3, v1, La/twz;->b:La/btt0;

    .line 214
    .line 215
    invoke-virtual {v3}, La/btt0;->a()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    new-instance v1, La/mni0;

    .line 220
    .line 221
    move-object/from16 p1, v3

    .line 222
    .line 223
    new-instance v3, La/tcq;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    .line 224
    .line 225
    move/from16 p2, v8

    .line 226
    .line 227
    move/from16 p3, v9

    .line 228
    .line 229
    long-to-double v8, v4

    .line 230
    :try_start_3
    invoke-direct {v3, v8, v9, v2, v6}, La/tcq;-><init>(DILjava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    invoke-direct {v1, v3}, La/mni0;-><init>(Ljava/util/List;)V

    .line 238
    .line 239
    .line 240
    iput-object v6, v7, La/pwz;->p:Ljava/lang/String;

    .line 241
    .line 242
    iput-object v14, v7, La/pwz;->q:Ljava/lang/Throwable;

    .line 243
    .line 244
    iput-wide v4, v7, La/pwz;->i:J

    .line 245
    .line 246
    iput v2, v7, La/pwz;->l:I

    .line 247
    .line 248
    iput-wide v12, v7, La/pwz;->j:J

    .line 249
    .line 250
    iput-wide v10, v7, La/pwz;->k:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    .line 251
    .line 252
    move/from16 v3, p3

    .line 253
    .line 254
    :try_start_4
    iput v3, v7, La/pwz;->m:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 255
    .line 256
    move/from16 v8, p2

    .line 257
    .line 258
    :try_start_5
    iput v8, v7, La/pwz;->n:I

    .line 259
    .line 260
    iput v0, v7, La/pwz;->o:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 261
    .line 262
    const/4 v9, 0x1

    .line 263
    :try_start_6
    iput v9, v7, La/pwz;->t:I

    .line 264
    .line 265
    iget-object v0, v15, La/lwz;->a:La/tpv;

    .line 266
    .line 267
    invoke-virtual {v0}, La/tpv;->invoke()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    check-cast v0, La/fuz;

    .line 272
    .line 273
    move-object/from16 v15, p1

    .line 274
    .line 275
    invoke-interface {v0, v15, v1, v7}, La/fuz;->b(Ljava/lang/String;La/mni0;La/yje;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 279
    move-object/from16 v1, v16

    .line 280
    .line 281
    if-ne v0, v1, :cond_5

    .line 282
    .line 283
    goto/16 :goto_b

    .line 284
    .line 285
    :cond_5
    move-wide/from16 v17, v4

    .line 286
    .line 287
    move v5, v3

    .line 288
    move-object v3, v14

    .line 289
    move-wide/from16 v14, v17

    .line 290
    .line 291
    move v4, v8

    .line 292
    move-object v8, v6

    .line 293
    move-wide/from16 v17, v10

    .line 294
    .line 295
    move v10, v2

    .line 296
    move-object v2, v7

    .line 297
    move-wide/from16 v6, v17

    .line 298
    .line 299
    :goto_3
    :try_start_7
    check-cast v0, La/dx5;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 300
    .line 301
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 305
    .line 306
    return-object v0

    .line 307
    :catchall_1
    move-exception v0

    .line 308
    move-wide/from16 v17, v6

    .line 309
    .line 310
    move-object v7, v2

    .line 311
    move v2, v10

    .line 312
    move-wide/from16 v10, v17

    .line 313
    .line 314
    move-object v6, v8

    .line 315
    move v8, v4

    .line 316
    move-wide/from16 v17, v14

    .line 317
    .line 318
    move-object v14, v3

    .line 319
    move v3, v5

    .line 320
    move-wide/from16 v4, v17

    .line 321
    .line 322
    goto :goto_6

    .line 323
    :catchall_2
    move-exception v0

    .line 324
    move-object/from16 v1, v16

    .line 325
    .line 326
    goto :goto_6

    .line 327
    :catchall_3
    move-exception v0

    .line 328
    :goto_4
    move-object/from16 v1, v16

    .line 329
    .line 330
    :goto_5
    const/4 v9, 0x1

    .line 331
    goto :goto_6

    .line 332
    :catchall_4
    move-exception v0

    .line 333
    move/from16 v8, p2

    .line 334
    .line 335
    goto :goto_4

    .line 336
    :catchall_5
    move-exception v0

    .line 337
    move/from16 v8, p2

    .line 338
    .line 339
    move/from16 v3, p3

    .line 340
    .line 341
    goto :goto_4

    .line 342
    :catchall_6
    move-exception v0

    .line 343
    move v3, v9

    .line 344
    goto :goto_4

    .line 345
    :catchall_7
    move-exception v0

    .line 346
    move-object v1, v3

    .line 347
    move v3, v9

    .line 348
    goto :goto_5

    .line 349
    :goto_6
    invoke-static {v0}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 350
    .line 351
    .line 352
    move-result v15

    .line 353
    if-eqz v15, :cond_b

    .line 354
    .line 355
    if-nez v3, :cond_6

    .line 356
    .line 357
    new-instance v14, La/el50;

    .line 358
    .line 359
    invoke-direct {v14, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 360
    .line 361
    .line 362
    move v9, v3

    .line 363
    const/4 v0, 0x0

    .line 364
    :goto_7
    move-object v3, v1

    .line 365
    move-object/from16 v1, p0

    .line 366
    .line 367
    goto/16 :goto_2

    .line 368
    .line 369
    :cond_6
    move-wide/from16 p1, v10

    .line 370
    .line 371
    int-to-long v9, v8

    .line 372
    cmp-long v9, v9, v12

    .line 373
    .line 374
    if-gez v9, :cond_7

    .line 375
    .line 376
    const/4 v9, 0x1

    .line 377
    goto :goto_8

    .line 378
    :cond_7
    const/4 v9, 0x0

    .line 379
    :goto_8
    add-int/lit8 v8, v8, 0x1

    .line 380
    .line 381
    if-eqz v9, :cond_9

    .line 382
    .line 383
    iput-object v6, v7, La/pwz;->p:Ljava/lang/String;

    .line 384
    .line 385
    iput-object v14, v7, La/pwz;->q:Ljava/lang/Throwable;

    .line 386
    .line 387
    iput-wide v4, v7, La/pwz;->i:J

    .line 388
    .line 389
    iput v2, v7, La/pwz;->l:I

    .line 390
    .line 391
    iput-wide v12, v7, La/pwz;->j:J

    .line 392
    .line 393
    move-wide/from16 v10, p1

    .line 394
    .line 395
    iput-wide v10, v7, La/pwz;->k:J

    .line 396
    .line 397
    iput v3, v7, La/pwz;->m:I

    .line 398
    .line 399
    iput v8, v7, La/pwz;->n:I

    .line 400
    .line 401
    iput v9, v7, La/pwz;->o:I

    .line 402
    .line 403
    const/4 v15, 0x2

    .line 404
    iput v15, v7, La/pwz;->t:I

    .line 405
    .line 406
    invoke-static {v10, v11, v7}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    if-ne v0, v1, :cond_8

    .line 411
    .line 412
    goto :goto_b

    .line 413
    :cond_8
    move v0, v9

    .line 414
    goto :goto_9

    .line 415
    :cond_9
    move-wide/from16 v10, p1

    .line 416
    .line 417
    const/4 v15, 0x2

    .line 418
    new-instance v14, La/el50;

    .line 419
    .line 420
    invoke-direct {v14, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 421
    .line 422
    .line 423
    move v0, v9

    .line 424
    :cond_a
    :goto_9
    move v9, v3

    .line 425
    goto :goto_7

    .line 426
    :cond_b
    const/4 v15, 0x2

    .line 427
    invoke-static {v0}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 428
    .line 429
    .line 430
    move-result v9

    .line 431
    if-eqz v9, :cond_e

    .line 432
    .line 433
    move-object/from16 p1, v0

    .line 434
    .line 435
    move-object/from16 v16, v1

    .line 436
    .line 437
    int-to-long v0, v8

    .line 438
    cmp-long v0, v0, v12

    .line 439
    .line 440
    if-gez v0, :cond_c

    .line 441
    .line 442
    const/4 v0, 0x1

    .line 443
    goto :goto_a

    .line 444
    :cond_c
    const/4 v0, 0x0

    .line 445
    :goto_a
    add-int/lit8 v8, v8, 0x1

    .line 446
    .line 447
    if-eqz v0, :cond_d

    .line 448
    .line 449
    iput-object v6, v7, La/pwz;->p:Ljava/lang/String;

    .line 450
    .line 451
    iput-object v14, v7, La/pwz;->q:Ljava/lang/Throwable;

    .line 452
    .line 453
    iput-wide v4, v7, La/pwz;->i:J

    .line 454
    .line 455
    iput v2, v7, La/pwz;->l:I

    .line 456
    .line 457
    iput-wide v12, v7, La/pwz;->j:J

    .line 458
    .line 459
    iput-wide v10, v7, La/pwz;->k:J

    .line 460
    .line 461
    iput v3, v7, La/pwz;->m:I

    .line 462
    .line 463
    iput v8, v7, La/pwz;->n:I

    .line 464
    .line 465
    iput v0, v7, La/pwz;->o:I

    .line 466
    .line 467
    const/4 v1, 0x3

    .line 468
    iput v1, v7, La/pwz;->t:I

    .line 469
    .line 470
    invoke-static {v10, v11, v7}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v9

    .line 474
    move-object/from16 v1, v16

    .line 475
    .line 476
    if-ne v9, v1, :cond_a

    .line 477
    .line 478
    :goto_b
    return-object v1

    .line 479
    :cond_d
    move-object/from16 v1, v16

    .line 480
    .line 481
    new-instance v14, La/dag0;

    .line 482
    .line 483
    move-object/from16 v9, p1

    .line 484
    .line 485
    invoke-direct {v14, v9}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 486
    .line 487
    .line 488
    goto :goto_9

    .line 489
    :cond_e
    move-object v9, v0

    .line 490
    invoke-static {v9}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 491
    .line 492
    .line 493
    move-object v14, v9

    .line 494
    const/4 v0, 0x0

    .line 495
    goto :goto_9

    .line 496
    :cond_f
    if-nez v14, :cond_10

    .line 497
    .line 498
    const-string v0, "Unexpected error"

    .line 499
    .line 500
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 501
    .line 502
    .line 503
    return-object p4

    .line 504
    :cond_10
    throw v14
.end method

.method public final e(IJJLa/zje;Ljava/lang/String;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p6

    .line 4
    .line 5
    instance-of v2, v0, La/qwz;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, La/qwz;

    .line 11
    .line 12
    iget v3, v2, La/qwz;->u:I

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
    iput v3, v2, La/qwz;->u:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/qwz;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, La/qwz;-><init>(La/twz;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, La/qwz;->s:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/qwz;->u:I

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v9, 0x1

    .line 38
    if-eqz v4, :cond_4

    .line 39
    .line 40
    if-eq v4, v9, :cond_3

    .line 41
    .line 42
    if-eq v4, v6, :cond_2

    .line 43
    .line 44
    if-ne v4, v5, :cond_1

    .line 45
    .line 46
    iget v4, v2, La/qwz;->p:I

    .line 47
    .line 48
    iget v10, v2, La/qwz;->o:I

    .line 49
    .line 50
    iget v11, v2, La/qwz;->n:I

    .line 51
    .line 52
    iget-wide v12, v2, La/qwz;->l:J

    .line 53
    .line 54
    iget-wide v14, v2, La/qwz;->k:J

    .line 55
    .line 56
    const/16 p6, 0x0

    .line 57
    .line 58
    iget-wide v7, v2, La/qwz;->j:J

    .line 59
    .line 60
    iget v5, v2, La/qwz;->m:I

    .line 61
    .line 62
    move-wide/from16 p1, v7

    .line 63
    .line 64
    iget-wide v6, v2, La/qwz;->i:J

    .line 65
    .line 66
    iget-object v8, v2, La/qwz;->r:Ljava/lang/Throwable;

    .line 67
    .line 68
    iget-object v9, v2, La/qwz;->q:Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    move v0, v4

    .line 74
    move/from16 v17, v11

    .line 75
    .line 76
    move v11, v5

    .line 77
    move-wide v4, v6

    .line 78
    move-wide v6, v14

    .line 79
    move v15, v10

    .line 80
    move-object v10, v8

    .line 81
    move-wide/from16 v23, v12

    .line 82
    .line 83
    move-object v12, v9

    .line 84
    move-wide/from16 v13, p1

    .line 85
    .line 86
    move-wide/from16 v8, v23

    .line 87
    .line 88
    goto/16 :goto_a

    .line 89
    .line 90
    :cond_1
    const/16 p6, 0x0

    .line 91
    .line 92
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 93
    .line 94
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    return-object p6

    .line 98
    :cond_2
    const/16 p6, 0x0

    .line 99
    .line 100
    iget v4, v2, La/qwz;->p:I

    .line 101
    .line 102
    iget v5, v2, La/qwz;->o:I

    .line 103
    .line 104
    iget v6, v2, La/qwz;->n:I

    .line 105
    .line 106
    iget-wide v7, v2, La/qwz;->l:J

    .line 107
    .line 108
    iget-wide v9, v2, La/qwz;->k:J

    .line 109
    .line 110
    iget-wide v11, v2, La/qwz;->j:J

    .line 111
    .line 112
    iget v13, v2, La/qwz;->m:I

    .line 113
    .line 114
    iget-wide v14, v2, La/qwz;->i:J

    .line 115
    .line 116
    move-object/from16 v17, v0

    .line 117
    .line 118
    iget-object v0, v2, La/qwz;->r:Ljava/lang/Throwable;

    .line 119
    .line 120
    move-object/from16 p1, v0

    .line 121
    .line 122
    iget-object v0, v2, La/qwz;->q:Ljava/lang/String;

    .line 123
    .line 124
    invoke-static/range {v17 .. v17}, La/z1x;->P(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    move/from16 v17, v6

    .line 128
    .line 129
    move-wide/from16 v23, v9

    .line 130
    .line 131
    move-object/from16 v10, p1

    .line 132
    .line 133
    move-wide v8, v7

    .line 134
    move-wide/from16 v6, v23

    .line 135
    .line 136
    move-wide/from16 v23, v11

    .line 137
    .line 138
    move-object v12, v0

    .line 139
    move v0, v4

    .line 140
    move v11, v13

    .line 141
    move-wide/from16 v25, v14

    .line 142
    .line 143
    move v15, v5

    .line 144
    move-wide/from16 v13, v23

    .line 145
    .line 146
    move-wide/from16 v4, v25

    .line 147
    .line 148
    goto/16 :goto_a

    .line 149
    .line 150
    :cond_3
    move-object/from16 v17, v0

    .line 151
    .line 152
    const/16 p6, 0x0

    .line 153
    .line 154
    iget v4, v2, La/qwz;->o:I

    .line 155
    .line 156
    iget v5, v2, La/qwz;->n:I

    .line 157
    .line 158
    iget-wide v6, v2, La/qwz;->l:J

    .line 159
    .line 160
    iget-wide v8, v2, La/qwz;->k:J

    .line 161
    .line 162
    iget-wide v10, v2, La/qwz;->j:J

    .line 163
    .line 164
    iget v12, v2, La/qwz;->m:I

    .line 165
    .line 166
    iget-wide v13, v2, La/qwz;->i:J

    .line 167
    .line 168
    iget-object v15, v2, La/qwz;->r:Ljava/lang/Throwable;

    .line 169
    .line 170
    move/from16 p1, v4

    .line 171
    .line 172
    iget-object v4, v2, La/qwz;->q:Ljava/lang/String;

    .line 173
    .line 174
    :try_start_0
    invoke-static/range {v17 .. v17}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 175
    .line 176
    .line 177
    move-object/from16 v0, v17

    .line 178
    .line 179
    const/4 v1, 0x1

    .line 180
    move-wide/from16 v16, v13

    .line 181
    .line 182
    move-wide v13, v10

    .line 183
    move v10, v5

    .line 184
    :goto_1
    move/from16 v5, p1

    .line 185
    .line 186
    goto/16 :goto_3

    .line 187
    .line 188
    :catchall_0
    move-exception v0

    .line 189
    move-wide/from16 v23, v8

    .line 190
    .line 191
    move-wide v8, v6

    .line 192
    move-wide/from16 v6, v23

    .line 193
    .line 194
    move v1, v5

    .line 195
    move-object/from16 v23, v0

    .line 196
    .line 197
    move/from16 v0, p1

    .line 198
    .line 199
    move-wide/from16 v24, v10

    .line 200
    .line 201
    move-object/from16 v10, v23

    .line 202
    .line 203
    move v11, v12

    .line 204
    move-object v12, v4

    .line 205
    move-wide v4, v13

    .line 206
    move-wide/from16 v13, v24

    .line 207
    .line 208
    goto/16 :goto_8

    .line 209
    .line 210
    :cond_4
    move-object/from16 v17, v0

    .line 211
    .line 212
    const/16 p6, 0x0

    .line 213
    .line 214
    invoke-static/range {v17 .. v17}, La/z1x;->P(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    sget-wide v4, La/cag0;->a:J

    .line 218
    .line 219
    const-wide/16 v6, 0x3

    .line 220
    .line 221
    move/from16 v11, p1

    .line 222
    .line 223
    move-wide/from16 v13, p4

    .line 224
    .line 225
    move-object/from16 v10, p6

    .line 226
    .line 227
    move-object/from16 v12, p7

    .line 228
    .line 229
    move-wide v8, v4

    .line 230
    const/4 v0, 0x1

    .line 231
    const/4 v15, 0x0

    .line 232
    const/16 v17, 0x1

    .line 233
    .line 234
    move-wide/from16 v4, p2

    .line 235
    .line 236
    :goto_2
    if-eqz v0, :cond_f

    .line 237
    .line 238
    move/from16 p1, v15

    .line 239
    .line 240
    :try_start_1
    iget-object v15, v1, La/twz;->a:La/lwz;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_8

    .line 241
    .line 242
    move-wide/from16 p2, v8

    .line 243
    .line 244
    :try_start_2
    iget-object v8, v1, La/twz;->b:La/btt0;

    .line 245
    .line 246
    invoke-virtual {v8}, La/btt0;->a()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v8

    .line 250
    new-instance v9, La/pni0;

    .line 251
    .line 252
    move-object/from16 v18, v8

    .line 253
    .line 254
    new-instance v8, La/yf7;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_7

    .line 255
    .line 256
    move-object/from16 v20, v9

    .line 257
    .line 258
    move-object/from16 v19, v10

    .line 259
    .line 260
    long-to-double v9, v4

    .line 261
    move-wide/from16 v21, p2

    .line 262
    .line 263
    move-object/from16 v1, v19

    .line 264
    .line 265
    move-object/from16 v19, v18

    .line 266
    .line 267
    move-object/from16 v18, v3

    .line 268
    .line 269
    move-object/from16 v3, v20

    .line 270
    .line 271
    :try_start_3
    invoke-direct/range {v8 .. v14}, La/yf7;-><init>(DILjava/lang/String;J)V

    .line 272
    .line 273
    .line 274
    invoke-static {v8}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 275
    .line 276
    .line 277
    move-result-object v8

    .line 278
    invoke-direct {v3, v8}, La/pni0;-><init>(Ljava/util/List;)V

    .line 279
    .line 280
    .line 281
    iput-object v12, v2, La/qwz;->q:Ljava/lang/String;

    .line 282
    .line 283
    iput-object v1, v2, La/qwz;->r:Ljava/lang/Throwable;

    .line 284
    .line 285
    iput-wide v4, v2, La/qwz;->i:J

    .line 286
    .line 287
    iput v11, v2, La/qwz;->m:I

    .line 288
    .line 289
    iput-wide v13, v2, La/qwz;->j:J

    .line 290
    .line 291
    iput-wide v6, v2, La/qwz;->k:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_6

    .line 292
    .line 293
    move-wide/from16 v8, v21

    .line 294
    .line 295
    :try_start_4
    iput-wide v8, v2, La/qwz;->l:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 296
    .line 297
    move/from16 v10, v17

    .line 298
    .line 299
    :try_start_5
    iput v10, v2, La/qwz;->n:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 300
    .line 301
    move-object/from16 v17, v1

    .line 302
    .line 303
    move/from16 v1, p1

    .line 304
    .line 305
    :try_start_6
    iput v1, v2, La/qwz;->o:I

    .line 306
    .line 307
    iput v0, v2, La/qwz;->p:I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 308
    .line 309
    move/from16 p1, v1

    .line 310
    .line 311
    const/4 v1, 0x1

    .line 312
    :try_start_7
    iput v1, v2, La/qwz;->u:I

    .line 313
    .line 314
    iget-object v0, v15, La/lwz;->a:La/tpv;

    .line 315
    .line 316
    invoke-virtual {v0}, La/tpv;->invoke()Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    check-cast v0, La/fuz;

    .line 321
    .line 322
    move-object/from16 v15, v19

    .line 323
    .line 324
    invoke-interface {v0, v15, v3, v2}, La/fuz;->e(Ljava/lang/String;La/pni0;La/yje;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 328
    move-object/from16 v3, v18

    .line 329
    .line 330
    if-ne v0, v3, :cond_5

    .line 331
    .line 332
    goto/16 :goto_c

    .line 333
    .line 334
    :cond_5
    move-wide/from16 v23, v8

    .line 335
    .line 336
    move-wide v8, v6

    .line 337
    move-wide/from16 v6, v23

    .line 338
    .line 339
    move-object/from16 v15, v17

    .line 340
    .line 341
    move-wide/from16 v16, v4

    .line 342
    .line 343
    move-object v4, v12

    .line 344
    move v12, v11

    .line 345
    goto/16 :goto_1

    .line 346
    .line 347
    :goto_3
    :try_start_8
    check-cast v0, La/dx5;

    .line 348
    .line 349
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 350
    .line 351
    .line 352
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 353
    .line 354
    return-object v0

    .line 355
    :catchall_1
    move-exception v0

    .line 356
    move-wide/from16 v23, v8

    .line 357
    .line 358
    move-wide v8, v6

    .line 359
    move-wide/from16 v6, v23

    .line 360
    .line 361
    move v1, v10

    .line 362
    move v11, v12

    .line 363
    move-object v10, v0

    .line 364
    move-object v12, v4

    .line 365
    move v0, v5

    .line 366
    move-wide/from16 v4, v16

    .line 367
    .line 368
    goto :goto_8

    .line 369
    :goto_4
    move v1, v10

    .line 370
    move-object/from16 v15, v17

    .line 371
    .line 372
    move-object v10, v0

    .line 373
    move/from16 v0, p1

    .line 374
    .line 375
    goto :goto_8

    .line 376
    :catchall_2
    move-exception v0

    .line 377
    move-object/from16 v3, v18

    .line 378
    .line 379
    goto :goto_4

    .line 380
    :catchall_3
    move-exception v0

    .line 381
    move/from16 p1, v1

    .line 382
    .line 383
    :goto_5
    move-object/from16 v3, v18

    .line 384
    .line 385
    :goto_6
    const/4 v1, 0x1

    .line 386
    goto :goto_4

    .line 387
    :catchall_4
    move-exception v0

    .line 388
    move-object/from16 v17, v1

    .line 389
    .line 390
    goto :goto_5

    .line 391
    :catchall_5
    move-exception v0

    .line 392
    move/from16 v10, v17

    .line 393
    .line 394
    move-object/from16 v3, v18

    .line 395
    .line 396
    :goto_7
    move-object/from16 v17, v1

    .line 397
    .line 398
    goto :goto_6

    .line 399
    :catchall_6
    move-exception v0

    .line 400
    move/from16 v10, v17

    .line 401
    .line 402
    move-object/from16 v3, v18

    .line 403
    .line 404
    move-wide/from16 v8, v21

    .line 405
    .line 406
    goto :goto_7

    .line 407
    :catchall_7
    move-exception v0

    .line 408
    move/from16 v1, v17

    .line 409
    .line 410
    move-object/from16 v17, v10

    .line 411
    .line 412
    move v10, v1

    .line 413
    move-wide/from16 v8, p2

    .line 414
    .line 415
    goto :goto_6

    .line 416
    :catchall_8
    move-exception v0

    .line 417
    move/from16 v1, v17

    .line 418
    .line 419
    move-object/from16 v17, v10

    .line 420
    .line 421
    move v10, v1

    .line 422
    goto :goto_6

    .line 423
    :goto_8
    invoke-static {v10}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 424
    .line 425
    .line 426
    move-result v17

    .line 427
    if-eqz v17, :cond_a

    .line 428
    .line 429
    if-nez v1, :cond_6

    .line 430
    .line 431
    new-instance v15, La/el50;

    .line 432
    .line 433
    invoke-direct {v15, v10}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 434
    .line 435
    .line 436
    move/from16 v17, v1

    .line 437
    .line 438
    move-object v10, v15

    .line 439
    move-object/from16 v1, p0

    .line 440
    .line 441
    move v15, v0

    .line 442
    const/4 v0, 0x0

    .line 443
    goto/16 :goto_2

    .line 444
    .line 445
    :cond_6
    move-wide/from16 v17, v8

    .line 446
    .line 447
    int-to-long v8, v0

    .line 448
    cmp-long v8, v8, v6

    .line 449
    .line 450
    if-gez v8, :cond_7

    .line 451
    .line 452
    const/4 v8, 0x1

    .line 453
    goto :goto_9

    .line 454
    :cond_7
    const/4 v8, 0x0

    .line 455
    :goto_9
    add-int/lit8 v0, v0, 0x1

    .line 456
    .line 457
    if-eqz v8, :cond_9

    .line 458
    .line 459
    iput-object v12, v2, La/qwz;->q:Ljava/lang/String;

    .line 460
    .line 461
    iput-object v15, v2, La/qwz;->r:Ljava/lang/Throwable;

    .line 462
    .line 463
    iput-wide v4, v2, La/qwz;->i:J

    .line 464
    .line 465
    iput v11, v2, La/qwz;->m:I

    .line 466
    .line 467
    iput-wide v13, v2, La/qwz;->j:J

    .line 468
    .line 469
    iput-wide v6, v2, La/qwz;->k:J

    .line 470
    .line 471
    move-wide/from16 v9, v17

    .line 472
    .line 473
    iput-wide v9, v2, La/qwz;->l:J

    .line 474
    .line 475
    iput v1, v2, La/qwz;->n:I

    .line 476
    .line 477
    iput v0, v2, La/qwz;->o:I

    .line 478
    .line 479
    iput v8, v2, La/qwz;->p:I

    .line 480
    .line 481
    move/from16 p1, v8

    .line 482
    .line 483
    const/4 v8, 0x2

    .line 484
    iput v8, v2, La/qwz;->u:I

    .line 485
    .line 486
    invoke-static {v9, v10, v2}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v8

    .line 490
    if-ne v8, v3, :cond_8

    .line 491
    .line 492
    goto :goto_c

    .line 493
    :cond_8
    move/from16 v17, v1

    .line 494
    .line 495
    move-wide v8, v9

    .line 496
    move-object v10, v15

    .line 497
    move v15, v0

    .line 498
    move/from16 v0, p1

    .line 499
    .line 500
    :goto_a
    move-object/from16 v1, p0

    .line 501
    .line 502
    goto/16 :goto_2

    .line 503
    .line 504
    :cond_9
    move/from16 p1, v8

    .line 505
    .line 506
    move-wide/from16 v8, v17

    .line 507
    .line 508
    new-instance v15, La/el50;

    .line 509
    .line 510
    invoke-direct {v15, v10}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 511
    .line 512
    .line 513
    move/from16 v17, v1

    .line 514
    .line 515
    move-object v10, v15

    .line 516
    move-object/from16 v1, p0

    .line 517
    .line 518
    move v15, v0

    .line 519
    move/from16 v0, p1

    .line 520
    .line 521
    goto/16 :goto_2

    .line 522
    .line 523
    :cond_a
    invoke-static {v10}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 524
    .line 525
    .line 526
    move-result v17

    .line 527
    if-eqz v17, :cond_e

    .line 528
    .line 529
    move-wide/from16 v17, v8

    .line 530
    .line 531
    int-to-long v8, v0

    .line 532
    cmp-long v8, v8, v6

    .line 533
    .line 534
    if-gez v8, :cond_b

    .line 535
    .line 536
    const/4 v8, 0x1

    .line 537
    goto :goto_b

    .line 538
    :cond_b
    const/4 v8, 0x0

    .line 539
    :goto_b
    add-int/lit8 v0, v0, 0x1

    .line 540
    .line 541
    if-eqz v8, :cond_d

    .line 542
    .line 543
    iput-object v12, v2, La/qwz;->q:Ljava/lang/String;

    .line 544
    .line 545
    iput-object v15, v2, La/qwz;->r:Ljava/lang/Throwable;

    .line 546
    .line 547
    iput-wide v4, v2, La/qwz;->i:J

    .line 548
    .line 549
    iput v11, v2, La/qwz;->m:I

    .line 550
    .line 551
    iput-wide v13, v2, La/qwz;->j:J

    .line 552
    .line 553
    iput-wide v6, v2, La/qwz;->k:J

    .line 554
    .line 555
    move-wide/from16 v9, v17

    .line 556
    .line 557
    iput-wide v9, v2, La/qwz;->l:J

    .line 558
    .line 559
    iput v1, v2, La/qwz;->n:I

    .line 560
    .line 561
    iput v0, v2, La/qwz;->o:I

    .line 562
    .line 563
    iput v8, v2, La/qwz;->p:I

    .line 564
    .line 565
    move/from16 p1, v1

    .line 566
    .line 567
    const/4 v1, 0x3

    .line 568
    iput v1, v2, La/qwz;->u:I

    .line 569
    .line 570
    invoke-static {v9, v10, v2}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v1

    .line 574
    if-ne v1, v3, :cond_c

    .line 575
    .line 576
    :goto_c
    return-object v3

    .line 577
    :cond_c
    move-object/from16 v17, v15

    .line 578
    .line 579
    move v15, v0

    .line 580
    move v0, v8

    .line 581
    move-wide v8, v9

    .line 582
    move-object/from16 v10, v17

    .line 583
    .line 584
    move/from16 v17, p1

    .line 585
    .line 586
    goto :goto_a

    .line 587
    :cond_d
    move/from16 p1, v1

    .line 588
    .line 589
    new-instance v1, La/dag0;

    .line 590
    .line 591
    invoke-direct {v1, v10}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 592
    .line 593
    .line 594
    move v15, v0

    .line 595
    move-object v10, v1

    .line 596
    move v0, v8

    .line 597
    move-wide/from16 v8, v17

    .line 598
    .line 599
    move-object/from16 v1, p0

    .line 600
    .line 601
    :goto_d
    move/from16 v17, p1

    .line 602
    .line 603
    goto/16 :goto_2

    .line 604
    .line 605
    :cond_e
    move/from16 p1, v1

    .line 606
    .line 607
    move-wide/from16 v17, v8

    .line 608
    .line 609
    invoke-static {v10}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 610
    .line 611
    .line 612
    move-object/from16 v1, p0

    .line 613
    .line 614
    move v15, v0

    .line 615
    const/4 v0, 0x0

    .line 616
    goto :goto_d

    .line 617
    :cond_f
    move-object/from16 v17, v10

    .line 618
    .line 619
    if-nez v17, :cond_10

    .line 620
    .line 621
    const-string v0, "Unexpected error"

    .line 622
    .line 623
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 624
    .line 625
    .line 626
    return-object p6

    .line 627
    :cond_10
    throw v17
.end method

.method public final f(IJLa/zje;Ljava/lang/String;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p4

    .line 4
    .line 5
    instance-of v2, v0, La/rwz;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, La/rwz;

    .line 11
    .line 12
    iget v3, v2, La/rwz;->t:I

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
    iput v3, v2, La/rwz;->t:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/rwz;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, La/rwz;-><init>(La/twz;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, La/rwz;->r:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/rwz;->t:I

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v9, 0x1

    .line 38
    if-eqz v4, :cond_4

    .line 39
    .line 40
    if-eq v4, v9, :cond_3

    .line 41
    .line 42
    if-eq v4, v6, :cond_2

    .line 43
    .line 44
    if-ne v4, v5, :cond_1

    .line 45
    .line 46
    iget v4, v2, La/rwz;->o:I

    .line 47
    .line 48
    iget v10, v2, La/rwz;->n:I

    .line 49
    .line 50
    iget v11, v2, La/rwz;->m:I

    .line 51
    .line 52
    iget-wide v12, v2, La/rwz;->k:J

    .line 53
    .line 54
    iget-wide v14, v2, La/rwz;->j:J

    .line 55
    .line 56
    const/16 p4, 0x0

    .line 57
    .line 58
    iget v7, v2, La/rwz;->l:I

    .line 59
    .line 60
    iget-wide v5, v2, La/rwz;->i:J

    .line 61
    .line 62
    iget-object v8, v2, La/rwz;->q:Ljava/lang/Throwable;

    .line 63
    .line 64
    iget-object v9, v2, La/rwz;->p:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move v0, v7

    .line 70
    move-object v7, v2

    .line 71
    move v2, v0

    .line 72
    move-object v1, v3

    .line 73
    move v0, v4

    .line 74
    move-wide v4, v5

    .line 75
    move-object v6, v9

    .line 76
    move v9, v11

    .line 77
    move-wide/from16 v17, v14

    .line 78
    .line 79
    move-object v14, v8

    .line 80
    move v8, v10

    .line 81
    move-wide v10, v12

    .line 82
    move-wide/from16 v12, v17

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    const/16 p4, 0x0

    .line 86
    .line 87
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 88
    .line 89
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-object p4

    .line 93
    :cond_2
    const/16 p4, 0x0

    .line 94
    .line 95
    iget v4, v2, La/rwz;->o:I

    .line 96
    .line 97
    iget v5, v2, La/rwz;->n:I

    .line 98
    .line 99
    iget v6, v2, La/rwz;->m:I

    .line 100
    .line 101
    iget-wide v7, v2, La/rwz;->k:J

    .line 102
    .line 103
    iget-wide v9, v2, La/rwz;->j:J

    .line 104
    .line 105
    iget v11, v2, La/rwz;->l:I

    .line 106
    .line 107
    iget-wide v12, v2, La/rwz;->i:J

    .line 108
    .line 109
    iget-object v14, v2, La/rwz;->q:Ljava/lang/Throwable;

    .line 110
    .line 111
    iget-object v15, v2, La/rwz;->p:Ljava/lang/String;

    .line 112
    .line 113
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    move-object v1, v3

    .line 117
    move v0, v4

    .line 118
    move-wide/from16 v17, v7

    .line 119
    .line 120
    move-object v7, v2

    .line 121
    move v8, v5

    .line 122
    move v2, v11

    .line 123
    move-wide v4, v12

    .line 124
    move-wide v12, v9

    .line 125
    move v9, v6

    .line 126
    move-wide/from16 v10, v17

    .line 127
    .line 128
    move-object v6, v15

    .line 129
    :goto_1
    const/4 v15, 0x2

    .line 130
    goto/16 :goto_a

    .line 131
    .line 132
    :cond_3
    const/16 p4, 0x0

    .line 133
    .line 134
    iget v4, v2, La/rwz;->n:I

    .line 135
    .line 136
    iget v5, v2, La/rwz;->m:I

    .line 137
    .line 138
    iget-wide v6, v2, La/rwz;->k:J

    .line 139
    .line 140
    iget-wide v8, v2, La/rwz;->j:J

    .line 141
    .line 142
    iget v10, v2, La/rwz;->l:I

    .line 143
    .line 144
    iget-wide v11, v2, La/rwz;->i:J

    .line 145
    .line 146
    iget-object v13, v2, La/rwz;->q:Ljava/lang/Throwable;

    .line 147
    .line 148
    iget-object v14, v2, La/rwz;->p:Ljava/lang/String;

    .line 149
    .line 150
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 151
    .line 152
    .line 153
    move-object v1, v3

    .line 154
    move-object v3, v13

    .line 155
    move-wide/from16 v17, v8

    .line 156
    .line 157
    move-object v8, v14

    .line 158
    move-wide v14, v11

    .line 159
    const/4 v9, 0x1

    .line 160
    move-wide/from16 v12, v17

    .line 161
    .line 162
    goto/16 :goto_3

    .line 163
    .line 164
    :catchall_0
    move-exception v0

    .line 165
    move-object v1, v3

    .line 166
    move v3, v5

    .line 167
    move-wide/from16 v17, v6

    .line 168
    .line 169
    move-object v7, v2

    .line 170
    move v2, v10

    .line 171
    move-object v6, v14

    .line 172
    move-object v14, v13

    .line 173
    move-wide/from16 v19, v8

    .line 174
    .line 175
    move v8, v4

    .line 176
    move-wide v4, v11

    .line 177
    const/4 v9, 0x1

    .line 178
    move-wide/from16 v10, v17

    .line 179
    .line 180
    move-wide/from16 v12, v19

    .line 181
    .line 182
    goto/16 :goto_9

    .line 183
    .line 184
    :cond_4
    const/16 p4, 0x0

    .line 185
    .line 186
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    sget-wide v4, La/cag0;->a:J

    .line 190
    .line 191
    const-wide/16 v6, 0x3

    .line 192
    .line 193
    move-object/from16 v14, p4

    .line 194
    .line 195
    move-wide v10, v4

    .line 196
    move-wide v12, v6

    .line 197
    const/4 v0, 0x1

    .line 198
    const/4 v8, 0x0

    .line 199
    const/4 v9, 0x1

    .line 200
    move-wide/from16 v4, p2

    .line 201
    .line 202
    move-object/from16 v6, p5

    .line 203
    .line 204
    move-object v7, v2

    .line 205
    move/from16 v2, p1

    .line 206
    .line 207
    :goto_2
    if-eqz v0, :cond_16

    .line 208
    .line 209
    :try_start_1
    iget-object v15, v1, La/twz;->a:La/lwz;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_7

    .line 210
    .line 211
    move-object/from16 v16, v3

    .line 212
    .line 213
    :try_start_2
    iget-object v3, v1, La/twz;->b:La/btt0;

    .line 214
    .line 215
    invoke-virtual {v3}, La/btt0;->a()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    new-instance v1, La/woi0;

    .line 220
    .line 221
    move-object/from16 p1, v3

    .line 222
    .line 223
    new-instance v3, La/tcq;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    .line 224
    .line 225
    move/from16 p2, v8

    .line 226
    .line 227
    move/from16 p3, v9

    .line 228
    .line 229
    long-to-double v8, v4

    .line 230
    :try_start_3
    invoke-direct {v3, v8, v9, v2, v6}, La/tcq;-><init>(DILjava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    invoke-direct {v1, v3}, La/woi0;-><init>(Ljava/util/List;)V

    .line 238
    .line 239
    .line 240
    iput-object v6, v7, La/rwz;->p:Ljava/lang/String;

    .line 241
    .line 242
    iput-object v14, v7, La/rwz;->q:Ljava/lang/Throwable;

    .line 243
    .line 244
    iput-wide v4, v7, La/rwz;->i:J

    .line 245
    .line 246
    iput v2, v7, La/rwz;->l:I

    .line 247
    .line 248
    iput-wide v12, v7, La/rwz;->j:J

    .line 249
    .line 250
    iput-wide v10, v7, La/rwz;->k:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    .line 251
    .line 252
    move/from16 v3, p3

    .line 253
    .line 254
    :try_start_4
    iput v3, v7, La/rwz;->m:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 255
    .line 256
    move/from16 v8, p2

    .line 257
    .line 258
    :try_start_5
    iput v8, v7, La/rwz;->n:I

    .line 259
    .line 260
    iput v0, v7, La/rwz;->o:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 261
    .line 262
    const/4 v9, 0x1

    .line 263
    :try_start_6
    iput v9, v7, La/rwz;->t:I

    .line 264
    .line 265
    iget-object v0, v15, La/lwz;->a:La/tpv;

    .line 266
    .line 267
    invoke-virtual {v0}, La/tpv;->invoke()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    check-cast v0, La/fuz;

    .line 272
    .line 273
    move-object/from16 v15, p1

    .line 274
    .line 275
    invoke-interface {v0, v15, v1, v7}, La/fuz;->g(Ljava/lang/String;La/woi0;La/yje;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 279
    move-object/from16 v1, v16

    .line 280
    .line 281
    if-ne v0, v1, :cond_5

    .line 282
    .line 283
    goto/16 :goto_e

    .line 284
    .line 285
    :cond_5
    move-wide/from16 v17, v4

    .line 286
    .line 287
    move v5, v3

    .line 288
    move-object v3, v14

    .line 289
    move-wide/from16 v14, v17

    .line 290
    .line 291
    move v4, v8

    .line 292
    move-object v8, v6

    .line 293
    move-wide/from16 v17, v10

    .line 294
    .line 295
    move v10, v2

    .line 296
    move-object v2, v7

    .line 297
    move-wide/from16 v6, v17

    .line 298
    .line 299
    :goto_3
    :try_start_7
    check-cast v0, La/dx5;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 300
    .line 301
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    check-cast v0, La/zpi0;

    .line 306
    .line 307
    iget-object v0, v0, La/zpi0;->a:La/wkd0;

    .line 308
    .line 309
    if-eqz v0, :cond_6

    .line 310
    .line 311
    iget-object v1, v0, La/wkd0;->a:Ljava/lang/String;

    .line 312
    .line 313
    goto :goto_4

    .line 314
    :cond_6
    move-object/from16 v1, p4

    .line 315
    .line 316
    :goto_4
    const-string v2, ""

    .line 317
    .line 318
    if-nez v1, :cond_7

    .line 319
    .line 320
    move-object v1, v2

    .line 321
    :cond_7
    if-eqz v0, :cond_b

    .line 322
    .line 323
    iget-object v0, v0, La/wkd0;->b:Ljava/util/List;

    .line 324
    .line 325
    if-eqz v0, :cond_b

    .line 326
    .line 327
    new-instance v3, Ljava/util/ArrayList;

    .line 328
    .line 329
    const/16 v4, 0xa

    .line 330
    .line 331
    invoke-static {v0, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 332
    .line 333
    .line 334
    move-result v4

    .line 335
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 336
    .line 337
    .line 338
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 343
    .line 344
    .line 345
    move-result v4

    .line 346
    if-eqz v4, :cond_a

    .line 347
    .line 348
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v4

    .line 352
    check-cast v4, La/dld0;

    .line 353
    .line 354
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    new-instance v5, La/ikr;

    .line 358
    .line 359
    iget-object v6, v4, La/dld0;->a:Ljava/lang/Integer;

    .line 360
    .line 361
    if-eqz v6, :cond_9

    .line 362
    .line 363
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 364
    .line 365
    .line 366
    move-result v6

    .line 367
    iget-object v4, v4, La/dld0;->b:Ljava/lang/String;

    .line 368
    .line 369
    if-nez v4, :cond_8

    .line 370
    .line 371
    move-object v4, v2

    .line 372
    :cond_8
    sget-object v7, La/djr;->a:La/djr;

    .line 373
    .line 374
    invoke-direct {v5, v6, v4, v7}, La/ikr;-><init>(ILjava/lang/String;La/djr;)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    goto :goto_5

    .line 381
    :cond_9
    invoke-static/range {p4 .. p4}, La/jf4;->k(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    return-object p4

    .line 385
    :cond_a
    move-object v7, v3

    .line 386
    goto :goto_6

    .line 387
    :cond_b
    move-object/from16 v7, p4

    .line 388
    .line 389
    :goto_6
    if-nez v7, :cond_c

    .line 390
    .line 391
    sget-object v7, La/iun;->a:La/iun;

    .line 392
    .line 393
    :cond_c
    new-instance v0, La/i500;

    .line 394
    .line 395
    invoke-direct {v0, v1, v7}, La/i500;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 396
    .line 397
    .line 398
    move-object/from16 v11, p0

    .line 399
    .line 400
    iget-object v2, v11, La/twz;->d:La/njo;

    .line 401
    .line 402
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    iput-object v1, v2, La/njo;->a:Ljava/lang/String;

    .line 406
    .line 407
    return-object v0

    .line 408
    :catchall_1
    move-exception v0

    .line 409
    move-object/from16 v11, p0

    .line 410
    .line 411
    move-wide/from16 v17, v6

    .line 412
    .line 413
    move-object v7, v2

    .line 414
    move v2, v10

    .line 415
    move-wide/from16 v10, v17

    .line 416
    .line 417
    move-object v6, v8

    .line 418
    move v8, v4

    .line 419
    move-wide/from16 v17, v14

    .line 420
    .line 421
    move-object v14, v3

    .line 422
    move v3, v5

    .line 423
    move-wide/from16 v4, v17

    .line 424
    .line 425
    goto :goto_9

    .line 426
    :catchall_2
    move-exception v0

    .line 427
    move-object/from16 v1, v16

    .line 428
    .line 429
    goto :goto_9

    .line 430
    :catchall_3
    move-exception v0

    .line 431
    :goto_7
    move-object/from16 v1, v16

    .line 432
    .line 433
    :goto_8
    const/4 v9, 0x1

    .line 434
    goto :goto_9

    .line 435
    :catchall_4
    move-exception v0

    .line 436
    move/from16 v8, p2

    .line 437
    .line 438
    goto :goto_7

    .line 439
    :catchall_5
    move-exception v0

    .line 440
    move/from16 v8, p2

    .line 441
    .line 442
    move/from16 v3, p3

    .line 443
    .line 444
    goto :goto_7

    .line 445
    :catchall_6
    move-exception v0

    .line 446
    move v3, v9

    .line 447
    goto :goto_7

    .line 448
    :catchall_7
    move-exception v0

    .line 449
    move-object v1, v3

    .line 450
    move v3, v9

    .line 451
    goto :goto_8

    .line 452
    :goto_9
    invoke-static {v0}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 453
    .line 454
    .line 455
    move-result v15

    .line 456
    if-eqz v15, :cond_12

    .line 457
    .line 458
    if-nez v3, :cond_d

    .line 459
    .line 460
    new-instance v14, La/el50;

    .line 461
    .line 462
    invoke-direct {v14, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 463
    .line 464
    .line 465
    move v9, v3

    .line 466
    const/4 v0, 0x0

    .line 467
    :goto_a
    move-object v3, v1

    .line 468
    move-object/from16 v1, p0

    .line 469
    .line 470
    goto/16 :goto_2

    .line 471
    .line 472
    :cond_d
    move-wide/from16 p1, v10

    .line 473
    .line 474
    int-to-long v9, v8

    .line 475
    cmp-long v9, v9, v12

    .line 476
    .line 477
    if-gez v9, :cond_e

    .line 478
    .line 479
    const/4 v9, 0x1

    .line 480
    goto :goto_b

    .line 481
    :cond_e
    const/4 v9, 0x0

    .line 482
    :goto_b
    add-int/lit8 v8, v8, 0x1

    .line 483
    .line 484
    if-eqz v9, :cond_10

    .line 485
    .line 486
    iput-object v6, v7, La/rwz;->p:Ljava/lang/String;

    .line 487
    .line 488
    iput-object v14, v7, La/rwz;->q:Ljava/lang/Throwable;

    .line 489
    .line 490
    iput-wide v4, v7, La/rwz;->i:J

    .line 491
    .line 492
    iput v2, v7, La/rwz;->l:I

    .line 493
    .line 494
    iput-wide v12, v7, La/rwz;->j:J

    .line 495
    .line 496
    move-wide/from16 v10, p1

    .line 497
    .line 498
    iput-wide v10, v7, La/rwz;->k:J

    .line 499
    .line 500
    iput v3, v7, La/rwz;->m:I

    .line 501
    .line 502
    iput v8, v7, La/rwz;->n:I

    .line 503
    .line 504
    iput v9, v7, La/rwz;->o:I

    .line 505
    .line 506
    const/4 v15, 0x2

    .line 507
    iput v15, v7, La/rwz;->t:I

    .line 508
    .line 509
    invoke-static {v10, v11, v7}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    if-ne v0, v1, :cond_f

    .line 514
    .line 515
    goto :goto_e

    .line 516
    :cond_f
    move v0, v9

    .line 517
    goto :goto_c

    .line 518
    :cond_10
    move-wide/from16 v10, p1

    .line 519
    .line 520
    const/4 v15, 0x2

    .line 521
    new-instance v14, La/el50;

    .line 522
    .line 523
    invoke-direct {v14, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 524
    .line 525
    .line 526
    move v0, v9

    .line 527
    :cond_11
    :goto_c
    move v9, v3

    .line 528
    goto :goto_a

    .line 529
    :cond_12
    const/4 v15, 0x2

    .line 530
    invoke-static {v0}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 531
    .line 532
    .line 533
    move-result v9

    .line 534
    if-eqz v9, :cond_15

    .line 535
    .line 536
    move-object/from16 p1, v0

    .line 537
    .line 538
    move-object/from16 v16, v1

    .line 539
    .line 540
    int-to-long v0, v8

    .line 541
    cmp-long v0, v0, v12

    .line 542
    .line 543
    if-gez v0, :cond_13

    .line 544
    .line 545
    const/4 v0, 0x1

    .line 546
    goto :goto_d

    .line 547
    :cond_13
    const/4 v0, 0x0

    .line 548
    :goto_d
    add-int/lit8 v8, v8, 0x1

    .line 549
    .line 550
    if-eqz v0, :cond_14

    .line 551
    .line 552
    iput-object v6, v7, La/rwz;->p:Ljava/lang/String;

    .line 553
    .line 554
    iput-object v14, v7, La/rwz;->q:Ljava/lang/Throwable;

    .line 555
    .line 556
    iput-wide v4, v7, La/rwz;->i:J

    .line 557
    .line 558
    iput v2, v7, La/rwz;->l:I

    .line 559
    .line 560
    iput-wide v12, v7, La/rwz;->j:J

    .line 561
    .line 562
    iput-wide v10, v7, La/rwz;->k:J

    .line 563
    .line 564
    iput v3, v7, La/rwz;->m:I

    .line 565
    .line 566
    iput v8, v7, La/rwz;->n:I

    .line 567
    .line 568
    iput v0, v7, La/rwz;->o:I

    .line 569
    .line 570
    const/4 v1, 0x3

    .line 571
    iput v1, v7, La/rwz;->t:I

    .line 572
    .line 573
    invoke-static {v10, v11, v7}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v9

    .line 577
    move-object/from16 v1, v16

    .line 578
    .line 579
    if-ne v9, v1, :cond_11

    .line 580
    .line 581
    :goto_e
    return-object v1

    .line 582
    :cond_14
    move-object/from16 v1, v16

    .line 583
    .line 584
    new-instance v14, La/dag0;

    .line 585
    .line 586
    move-object/from16 v9, p1

    .line 587
    .line 588
    invoke-direct {v14, v9}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 589
    .line 590
    .line 591
    goto :goto_c

    .line 592
    :cond_15
    move-object v9, v0

    .line 593
    invoke-static {v9}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 594
    .line 595
    .line 596
    move-object v14, v9

    .line 597
    const/4 v0, 0x0

    .line 598
    goto :goto_c

    .line 599
    :cond_16
    if-nez v14, :cond_17

    .line 600
    .line 601
    const-string v0, "Unexpected error"

    .line 602
    .line 603
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 604
    .line 605
    .line 606
    return-object p4

    .line 607
    :cond_17
    throw v14
.end method

.method public final g(DILjava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p5

    .line 4
    .line 5
    instance-of v2, v0, La/swz;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, La/swz;

    .line 11
    .line 12
    iget v3, v2, La/swz;->t:I

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
    iput v3, v2, La/swz;->t:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/swz;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, La/swz;-><init>(La/twz;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, La/swz;->r:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/swz;->t:I

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v9, 0x1

    .line 38
    if-eqz v4, :cond_4

    .line 39
    .line 40
    if-eq v4, v9, :cond_3

    .line 41
    .line 42
    if-eq v4, v6, :cond_2

    .line 43
    .line 44
    if-ne v4, v5, :cond_1

    .line 45
    .line 46
    iget v4, v2, La/swz;->m:I

    .line 47
    .line 48
    iget v10, v2, La/swz;->l:I

    .line 49
    .line 50
    iget v11, v2, La/swz;->k:I

    .line 51
    .line 52
    iget-wide v12, v2, La/swz;->q:J

    .line 53
    .line 54
    iget-wide v14, v2, La/swz;->p:J

    .line 55
    .line 56
    const/16 p5, 0x0

    .line 57
    .line 58
    iget v7, v2, La/swz;->j:I

    .line 59
    .line 60
    iget-wide v5, v2, La/swz;->i:D

    .line 61
    .line 62
    iget-object v8, v2, La/swz;->o:Ljava/lang/Throwable;

    .line 63
    .line 64
    iget-object v9, v2, La/swz;->n:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move v0, v7

    .line 70
    move-object v7, v2

    .line 71
    move v2, v0

    .line 72
    move-object v1, v3

    .line 73
    move v0, v4

    .line 74
    move-wide v4, v5

    .line 75
    move-object v6, v9

    .line 76
    move v9, v11

    .line 77
    move-wide/from16 v17, v14

    .line 78
    .line 79
    move-object v14, v8

    .line 80
    move v8, v10

    .line 81
    move-wide v10, v12

    .line 82
    move-wide/from16 v12, v17

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    const/16 p5, 0x0

    .line 86
    .line 87
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 88
    .line 89
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-object p5

    .line 93
    :cond_2
    const/16 p5, 0x0

    .line 94
    .line 95
    iget v4, v2, La/swz;->m:I

    .line 96
    .line 97
    iget v5, v2, La/swz;->l:I

    .line 98
    .line 99
    iget v6, v2, La/swz;->k:I

    .line 100
    .line 101
    iget-wide v7, v2, La/swz;->q:J

    .line 102
    .line 103
    iget-wide v9, v2, La/swz;->p:J

    .line 104
    .line 105
    iget v11, v2, La/swz;->j:I

    .line 106
    .line 107
    iget-wide v12, v2, La/swz;->i:D

    .line 108
    .line 109
    iget-object v14, v2, La/swz;->o:Ljava/lang/Throwable;

    .line 110
    .line 111
    iget-object v15, v2, La/swz;->n:Ljava/lang/String;

    .line 112
    .line 113
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    move-object v1, v3

    .line 117
    move v0, v4

    .line 118
    move-wide/from16 v17, v7

    .line 119
    .line 120
    move-object v7, v2

    .line 121
    move v8, v5

    .line 122
    move v2, v11

    .line 123
    move-wide v4, v12

    .line 124
    move-wide v12, v9

    .line 125
    move v9, v6

    .line 126
    move-wide/from16 v10, v17

    .line 127
    .line 128
    move-object v6, v15

    .line 129
    :goto_1
    const/4 v15, 0x2

    .line 130
    goto/16 :goto_9

    .line 131
    .line 132
    :cond_3
    const/16 p5, 0x0

    .line 133
    .line 134
    iget v4, v2, La/swz;->l:I

    .line 135
    .line 136
    iget v5, v2, La/swz;->k:I

    .line 137
    .line 138
    iget-wide v6, v2, La/swz;->q:J

    .line 139
    .line 140
    iget-wide v8, v2, La/swz;->p:J

    .line 141
    .line 142
    iget v10, v2, La/swz;->j:I

    .line 143
    .line 144
    iget-wide v11, v2, La/swz;->i:D

    .line 145
    .line 146
    iget-object v13, v2, La/swz;->o:Ljava/lang/Throwable;

    .line 147
    .line 148
    iget-object v14, v2, La/swz;->n:Ljava/lang/String;

    .line 149
    .line 150
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 151
    .line 152
    .line 153
    move-object v1, v3

    .line 154
    const/4 v3, 0x1

    .line 155
    goto/16 :goto_4

    .line 156
    .line 157
    :catchall_0
    move-exception v0

    .line 158
    move-object v1, v3

    .line 159
    const/4 v3, 0x1

    .line 160
    :goto_2
    move-wide/from16 v17, v6

    .line 161
    .line 162
    move-object v7, v2

    .line 163
    move v2, v10

    .line 164
    move-object v6, v14

    .line 165
    move-object v14, v13

    .line 166
    move-wide/from16 v19, v8

    .line 167
    .line 168
    move v8, v4

    .line 169
    move v9, v5

    .line 170
    move-wide v4, v11

    .line 171
    move-wide/from16 v10, v17

    .line 172
    .line 173
    move-wide/from16 v12, v19

    .line 174
    .line 175
    goto/16 :goto_6

    .line 176
    .line 177
    :cond_4
    const/16 p5, 0x0

    .line 178
    .line 179
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    sget-wide v4, La/cag0;->a:J

    .line 183
    .line 184
    const-wide/16 v6, 0x3

    .line 185
    .line 186
    move-object/from16 v14, p5

    .line 187
    .line 188
    move-wide v10, v4

    .line 189
    move-wide v12, v6

    .line 190
    const/4 v0, 0x1

    .line 191
    const/4 v8, 0x0

    .line 192
    const/4 v9, 0x1

    .line 193
    move-wide/from16 v4, p1

    .line 194
    .line 195
    move-object/from16 v6, p4

    .line 196
    .line 197
    move-object v7, v2

    .line 198
    move/from16 v2, p3

    .line 199
    .line 200
    :goto_3
    if-eqz v0, :cond_f

    .line 201
    .line 202
    :try_start_1
    iget-object v15, v1, La/twz;->a:La/lwz;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 203
    .line 204
    move-object/from16 v16, v3

    .line 205
    .line 206
    :try_start_2
    iget-object v3, v1, La/twz;->b:La/btt0;

    .line 207
    .line 208
    invoke-virtual {v3}, La/btt0;->a()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    new-instance v1, La/qti0;

    .line 213
    .line 214
    move-object/from16 p1, v3

    .line 215
    .line 216
    new-instance v3, La/ukq0;

    .line 217
    .line 218
    invoke-direct {v3, v4, v5, v2, v6}, La/ukq0;-><init>(DILjava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    invoke-direct {v1, v3}, La/qti0;-><init>(Ljava/util/List;)V

    .line 226
    .line 227
    .line 228
    iput-object v6, v7, La/swz;->n:Ljava/lang/String;

    .line 229
    .line 230
    iput-object v14, v7, La/swz;->o:Ljava/lang/Throwable;

    .line 231
    .line 232
    iput-wide v4, v7, La/swz;->i:D

    .line 233
    .line 234
    iput v2, v7, La/swz;->j:I

    .line 235
    .line 236
    iput-wide v12, v7, La/swz;->p:J

    .line 237
    .line 238
    iput-wide v10, v7, La/swz;->q:J

    .line 239
    .line 240
    iput v9, v7, La/swz;->k:I

    .line 241
    .line 242
    iput v8, v7, La/swz;->l:I

    .line 243
    .line 244
    iput v0, v7, La/swz;->m:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 245
    .line 246
    const/4 v3, 0x1

    .line 247
    :try_start_3
    iput v3, v7, La/swz;->t:I

    .line 248
    .line 249
    iget-object v0, v15, La/lwz;->a:La/tpv;

    .line 250
    .line 251
    invoke-virtual {v0}, La/tpv;->invoke()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    check-cast v0, La/fuz;

    .line 256
    .line 257
    move-object/from16 v15, p1

    .line 258
    .line 259
    invoke-interface {v0, v15, v1, v7}, La/fuz;->f(Ljava/lang/String;La/qti0;La/yje;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 263
    move-object/from16 v1, v16

    .line 264
    .line 265
    if-ne v0, v1, :cond_5

    .line 266
    .line 267
    goto/16 :goto_b

    .line 268
    .line 269
    :cond_5
    move-wide/from16 v17, v10

    .line 270
    .line 271
    move v10, v2

    .line 272
    move-object v2, v7

    .line 273
    move-object/from16 v19, v14

    .line 274
    .line 275
    move-object v14, v6

    .line 276
    move-wide/from16 v6, v17

    .line 277
    .line 278
    move-wide/from16 v17, v4

    .line 279
    .line 280
    move v4, v8

    .line 281
    move v5, v9

    .line 282
    move-wide v8, v12

    .line 283
    move-object/from16 v13, v19

    .line 284
    .line 285
    move-wide/from16 v11, v17

    .line 286
    .line 287
    :goto_4
    :try_start_4
    check-cast v0, La/dx5;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 288
    .line 289
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 290
    .line 291
    return-object v0

    .line 292
    :catchall_1
    move-exception v0

    .line 293
    goto/16 :goto_2

    .line 294
    .line 295
    :catchall_2
    move-exception v0

    .line 296
    move-object/from16 v1, v16

    .line 297
    .line 298
    goto :goto_6

    .line 299
    :catchall_3
    move-exception v0

    .line 300
    move-object/from16 v1, v16

    .line 301
    .line 302
    :goto_5
    const/4 v3, 0x1

    .line 303
    goto :goto_6

    .line 304
    :catchall_4
    move-exception v0

    .line 305
    move-object v1, v3

    .line 306
    goto :goto_5

    .line 307
    :goto_6
    invoke-static {v0}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 308
    .line 309
    .line 310
    move-result v15

    .line 311
    if-eqz v15, :cond_b

    .line 312
    .line 313
    if-nez v9, :cond_6

    .line 314
    .line 315
    new-instance v14, La/el50;

    .line 316
    .line 317
    invoke-direct {v14, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 318
    .line 319
    .line 320
    move-object v3, v1

    .line 321
    const/4 v0, 0x0

    .line 322
    :goto_7
    move-object/from16 v1, p0

    .line 323
    .line 324
    goto :goto_3

    .line 325
    :cond_6
    move-wide/from16 p1, v4

    .line 326
    .line 327
    int-to-long v3, v8

    .line 328
    cmp-long v3, v3, v12

    .line 329
    .line 330
    if-gez v3, :cond_7

    .line 331
    .line 332
    const/4 v3, 0x1

    .line 333
    goto :goto_8

    .line 334
    :cond_7
    const/4 v3, 0x0

    .line 335
    :goto_8
    add-int/lit8 v8, v8, 0x1

    .line 336
    .line 337
    if-eqz v3, :cond_9

    .line 338
    .line 339
    iput-object v6, v7, La/swz;->n:Ljava/lang/String;

    .line 340
    .line 341
    iput-object v14, v7, La/swz;->o:Ljava/lang/Throwable;

    .line 342
    .line 343
    move-wide/from16 v4, p1

    .line 344
    .line 345
    iput-wide v4, v7, La/swz;->i:D

    .line 346
    .line 347
    iput v2, v7, La/swz;->j:I

    .line 348
    .line 349
    iput-wide v12, v7, La/swz;->p:J

    .line 350
    .line 351
    iput-wide v10, v7, La/swz;->q:J

    .line 352
    .line 353
    iput v9, v7, La/swz;->k:I

    .line 354
    .line 355
    iput v8, v7, La/swz;->l:I

    .line 356
    .line 357
    iput v3, v7, La/swz;->m:I

    .line 358
    .line 359
    const/4 v15, 0x2

    .line 360
    iput v15, v7, La/swz;->t:I

    .line 361
    .line 362
    invoke-static {v10, v11, v7}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    if-ne v0, v1, :cond_a

    .line 367
    .line 368
    goto :goto_b

    .line 369
    :cond_8
    :goto_9
    move-object v3, v1

    .line 370
    goto :goto_7

    .line 371
    :cond_9
    move-wide/from16 v4, p1

    .line 372
    .line 373
    const/4 v15, 0x2

    .line 374
    new-instance v14, La/el50;

    .line 375
    .line 376
    invoke-direct {v14, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 377
    .line 378
    .line 379
    :cond_a
    move v0, v3

    .line 380
    goto :goto_9

    .line 381
    :cond_b
    const/4 v15, 0x2

    .line 382
    invoke-static {v0}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 383
    .line 384
    .line 385
    move-result v3

    .line 386
    if-eqz v3, :cond_e

    .line 387
    .line 388
    move-object/from16 p1, v0

    .line 389
    .line 390
    move-object/from16 v16, v1

    .line 391
    .line 392
    int-to-long v0, v8

    .line 393
    cmp-long v0, v0, v12

    .line 394
    .line 395
    if-gez v0, :cond_c

    .line 396
    .line 397
    const/4 v0, 0x1

    .line 398
    goto :goto_a

    .line 399
    :cond_c
    const/4 v0, 0x0

    .line 400
    :goto_a
    add-int/lit8 v8, v8, 0x1

    .line 401
    .line 402
    if-eqz v0, :cond_d

    .line 403
    .line 404
    iput-object v6, v7, La/swz;->n:Ljava/lang/String;

    .line 405
    .line 406
    iput-object v14, v7, La/swz;->o:Ljava/lang/Throwable;

    .line 407
    .line 408
    iput-wide v4, v7, La/swz;->i:D

    .line 409
    .line 410
    iput v2, v7, La/swz;->j:I

    .line 411
    .line 412
    iput-wide v12, v7, La/swz;->p:J

    .line 413
    .line 414
    iput-wide v10, v7, La/swz;->q:J

    .line 415
    .line 416
    iput v9, v7, La/swz;->k:I

    .line 417
    .line 418
    iput v8, v7, La/swz;->l:I

    .line 419
    .line 420
    iput v0, v7, La/swz;->m:I

    .line 421
    .line 422
    const/4 v1, 0x3

    .line 423
    iput v1, v7, La/swz;->t:I

    .line 424
    .line 425
    invoke-static {v10, v11, v7}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v3

    .line 429
    move-object/from16 v1, v16

    .line 430
    .line 431
    if-ne v3, v1, :cond_8

    .line 432
    .line 433
    :goto_b
    return-object v1

    .line 434
    :cond_d
    move-object/from16 v1, v16

    .line 435
    .line 436
    new-instance v14, La/dag0;

    .line 437
    .line 438
    move-object/from16 v3, p1

    .line 439
    .line 440
    invoke-direct {v14, v3}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 441
    .line 442
    .line 443
    goto :goto_9

    .line 444
    :cond_e
    move-object v3, v0

    .line 445
    invoke-static {v3}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 446
    .line 447
    .line 448
    move-object v14, v3

    .line 449
    const/4 v0, 0x0

    .line 450
    goto :goto_9

    .line 451
    :cond_f
    if-nez v14, :cond_10

    .line 452
    .line 453
    const-string v0, "Unexpected error"

    .line 454
    .line 455
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 456
    .line 457
    .line 458
    return-object p5

    .line 459
    :cond_10
    throw v14
.end method
