.class public final La/dzg;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/clc;

.field public final b:La/nhf0;


# direct methods
.method public constructor <init>(La/clc;La/nhf0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/dzg;->a:La/clc;

    .line 5
    .line 6
    iput-object p2, p0, La/dzg;->b:La/nhf0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(IJLa/zje;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    instance-of v2, v1, La/zyg;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/zyg;

    .line 11
    .line 12
    iget v3, v2, La/zyg;->u:I

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
    iput v3, v2, La/zyg;->u:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/zyg;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/zyg;-><init>(La/dzg;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/zyg;->s:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/zyg;->u:I

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
    iget v0, v2, La/zyg;->o:I

    .line 47
    .line 48
    iget v4, v2, La/zyg;->n:I

    .line 49
    .line 50
    iget v10, v2, La/zyg;->m:I

    .line 51
    .line 52
    iget-wide v11, v2, La/zyg;->k:J

    .line 53
    .line 54
    iget-wide v13, v2, La/zyg;->j:J

    .line 55
    .line 56
    iget v15, v2, La/zyg;->l:I

    .line 57
    .line 58
    const/16 p4, 0x0

    .line 59
    .line 60
    iget-wide v7, v2, La/zyg;->i:J

    .line 61
    .line 62
    iget-object v5, v2, La/zyg;->r:Ljava/lang/Throwable;

    .line 63
    .line 64
    iget-object v6, v2, La/zyg;->q:La/zyg;

    .line 65
    .line 66
    iget-object v9, v2, La/zyg;->p:La/dzg;

    .line 67
    .line 68
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    const/4 v1, 0x3

    .line 72
    move-object/from16 v18, v6

    .line 73
    .line 74
    move-object v6, v2

    .line 75
    move v2, v15

    .line 76
    move-object v15, v9

    .line 77
    move v9, v10

    .line 78
    move-wide v10, v11

    .line 79
    move-wide v12, v13

    .line 80
    move-object v14, v5

    .line 81
    move-wide/from16 v19, v7

    .line 82
    .line 83
    move v8, v4

    .line 84
    move-object/from16 v7, v18

    .line 85
    .line 86
    move-wide/from16 v4, v19

    .line 87
    .line 88
    goto/16 :goto_9

    .line 89
    .line 90
    :cond_1
    const/16 p4, 0x0

    .line 91
    .line 92
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 93
    .line 94
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    return-object p4

    .line 98
    :cond_2
    const/16 p4, 0x0

    .line 99
    .line 100
    iget v0, v2, La/zyg;->o:I

    .line 101
    .line 102
    iget v4, v2, La/zyg;->n:I

    .line 103
    .line 104
    iget v5, v2, La/zyg;->m:I

    .line 105
    .line 106
    iget-wide v6, v2, La/zyg;->k:J

    .line 107
    .line 108
    iget-wide v8, v2, La/zyg;->j:J

    .line 109
    .line 110
    iget v10, v2, La/zyg;->l:I

    .line 111
    .line 112
    iget-wide v11, v2, La/zyg;->i:J

    .line 113
    .line 114
    iget-object v13, v2, La/zyg;->r:Ljava/lang/Throwable;

    .line 115
    .line 116
    iget-object v14, v2, La/zyg;->q:La/zyg;

    .line 117
    .line 118
    iget-object v15, v2, La/zyg;->p:La/dzg;

    .line 119
    .line 120
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    const/4 v1, 0x2

    .line 124
    move-wide/from16 v18, v6

    .line 125
    .line 126
    move-object v6, v2

    .line 127
    move v2, v10

    .line 128
    move-object v7, v14

    .line 129
    move-object v14, v13

    .line 130
    move-wide/from16 v20, v8

    .line 131
    .line 132
    move v8, v4

    .line 133
    move v9, v5

    .line 134
    move-wide v4, v11

    .line 135
    move-wide/from16 v10, v18

    .line 136
    .line 137
    move-wide/from16 v12, v20

    .line 138
    .line 139
    goto/16 :goto_9

    .line 140
    .line 141
    :cond_3
    const/16 p4, 0x0

    .line 142
    .line 143
    iget v4, v2, La/zyg;->n:I

    .line 144
    .line 145
    iget v5, v2, La/zyg;->m:I

    .line 146
    .line 147
    iget-wide v6, v2, La/zyg;->k:J

    .line 148
    .line 149
    iget-wide v8, v2, La/zyg;->j:J

    .line 150
    .line 151
    iget v10, v2, La/zyg;->l:I

    .line 152
    .line 153
    iget-wide v11, v2, La/zyg;->i:J

    .line 154
    .line 155
    iget-object v13, v2, La/zyg;->r:Ljava/lang/Throwable;

    .line 156
    .line 157
    iget-object v14, v2, La/zyg;->q:La/zyg;

    .line 158
    .line 159
    iget-object v15, v2, La/zyg;->p:La/dzg;

    .line 160
    .line 161
    :try_start_0
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 162
    .line 163
    .line 164
    move-object v0, v1

    .line 165
    const/4 v1, 0x1

    .line 166
    goto/16 :goto_4

    .line 167
    .line 168
    :catchall_0
    move-exception v0

    .line 169
    const/4 v1, 0x1

    .line 170
    :goto_1
    move-wide/from16 v18, v6

    .line 171
    .line 172
    move-object v6, v2

    .line 173
    move v2, v10

    .line 174
    move-object v7, v14

    .line 175
    move-object v14, v13

    .line 176
    move-wide/from16 v20, v8

    .line 177
    .line 178
    move v8, v4

    .line 179
    move v9, v5

    .line 180
    move-wide v4, v11

    .line 181
    move-wide/from16 v10, v18

    .line 182
    .line 183
    move-wide/from16 v12, v20

    .line 184
    .line 185
    goto/16 :goto_6

    .line 186
    .line 187
    :cond_4
    const/16 p4, 0x0

    .line 188
    .line 189
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    iget-object v1, v0, La/dzg;->b:La/nhf0;

    .line 193
    .line 194
    iget-object v1, v1, La/nhf0;->a:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 197
    .line 198
    invoke-static/range {p2 .. p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    invoke-virtual {v1, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    check-cast v1, Ljava/util/Map;

    .line 207
    .line 208
    if-eqz v1, :cond_5

    .line 209
    .line 210
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    check-cast v1, La/yyg;

    .line 219
    .line 220
    goto :goto_2

    .line 221
    :cond_5
    move-object/from16 v1, p4

    .line 222
    .line 223
    :goto_2
    if-nez v1, :cond_12

    .line 224
    .line 225
    sget-wide v4, La/cag0;->a:J

    .line 226
    .line 227
    const-wide/16 v6, 0x3

    .line 228
    .line 229
    move-object/from16 v14, p4

    .line 230
    .line 231
    move-object v1, v0

    .line 232
    move-wide v10, v4

    .line 233
    move-wide v12, v6

    .line 234
    const/4 v0, 0x1

    .line 235
    const/4 v8, 0x0

    .line 236
    const/4 v9, 0x0

    .line 237
    move-wide/from16 v4, p2

    .line 238
    .line 239
    move-object v6, v2

    .line 240
    move-object v7, v6

    .line 241
    move/from16 v2, p1

    .line 242
    .line 243
    :goto_3
    if-eqz v0, :cond_10

    .line 244
    .line 245
    :try_start_1
    iget-object v15, v1, La/dzg;->a:La/clc;

    .line 246
    .line 247
    iput-object v1, v6, La/zyg;->p:La/dzg;

    .line 248
    .line 249
    iput-object v7, v6, La/zyg;->q:La/zyg;

    .line 250
    .line 251
    iput-object v14, v6, La/zyg;->r:Ljava/lang/Throwable;

    .line 252
    .line 253
    iput-wide v4, v6, La/zyg;->i:J

    .line 254
    .line 255
    iput v2, v6, La/zyg;->l:I

    .line 256
    .line 257
    iput-wide v12, v6, La/zyg;->j:J

    .line 258
    .line 259
    iput-wide v10, v6, La/zyg;->k:J

    .line 260
    .line 261
    iput v9, v6, La/zyg;->m:I

    .line 262
    .line 263
    iput v8, v6, La/zyg;->n:I

    .line 264
    .line 265
    iput v0, v6, La/zyg;->o:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 266
    .line 267
    move-object/from16 p0, v1

    .line 268
    .line 269
    const/4 v1, 0x1

    .line 270
    :try_start_2
    iput v1, v6, La/zyg;->u:I

    .line 271
    .line 272
    iget-object v0, v15, La/clc;->b:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast v0, La/sza;

    .line 275
    .line 276
    invoke-virtual {v0}, La/sza;->invoke()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    check-cast v0, La/xyg;

    .line 281
    .line 282
    invoke-interface {v0, v4, v5, v2, v6}, La/xyg;->d(JILa/yje;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 286
    if-ne v0, v3, :cond_6

    .line 287
    .line 288
    goto/16 :goto_c

    .line 289
    .line 290
    :cond_6
    move-object/from16 v15, p0

    .line 291
    .line 292
    move-wide/from16 v18, v10

    .line 293
    .line 294
    move v10, v2

    .line 295
    move-object v2, v6

    .line 296
    move-object/from16 v20, v14

    .line 297
    .line 298
    move-object v14, v7

    .line 299
    move-wide/from16 v6, v18

    .line 300
    .line 301
    move-wide/from16 v18, v4

    .line 302
    .line 303
    move v4, v8

    .line 304
    move v5, v9

    .line 305
    move-wide v8, v12

    .line 306
    move-object/from16 v13, v20

    .line 307
    .line 308
    move-wide/from16 v11, v18

    .line 309
    .line 310
    :goto_4
    :try_start_3
    check-cast v0, La/dx5;

    .line 311
    .line 312
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    check-cast v0, La/tyg;

    .line 317
    .line 318
    invoke-static {v0}, La/tlb;->e0(La/tyg;)La/yyg;

    .line 319
    .line 320
    .line 321
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 322
    iget-object v1, v15, La/dzg;->b:La/nhf0;

    .line 323
    .line 324
    iget-object v1, v1, La/nhf0;->a:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 327
    .line 328
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    if-nez v3, :cond_7

    .line 337
    .line 338
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 339
    .line 340
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 341
    .line 342
    .line 343
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    :cond_7
    check-cast v3, Ljava/util/Map;

    .line 347
    .line 348
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    invoke-interface {v3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    return-object v0

    .line 356
    :catchall_1
    move-exception v0

    .line 357
    goto/16 :goto_1

    .line 358
    .line 359
    :goto_5
    move-object/from16 v15, p0

    .line 360
    .line 361
    goto :goto_6

    .line 362
    :catchall_2
    move-exception v0

    .line 363
    goto :goto_5

    .line 364
    :catchall_3
    move-exception v0

    .line 365
    move-object/from16 p0, v1

    .line 366
    .line 367
    const/4 v1, 0x1

    .line 368
    goto :goto_5

    .line 369
    :goto_6
    invoke-static {v0}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 370
    .line 371
    .line 372
    move-result v17

    .line 373
    if-eqz v17, :cond_c

    .line 374
    .line 375
    if-nez v9, :cond_8

    .line 376
    .line 377
    new-instance v14, La/el50;

    .line 378
    .line 379
    invoke-direct {v14, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 380
    .line 381
    .line 382
    :goto_7
    move-object v1, v15

    .line 383
    const/4 v0, 0x0

    .line 384
    goto/16 :goto_3

    .line 385
    .line 386
    :cond_8
    move/from16 p0, v2

    .line 387
    .line 388
    int-to-long v1, v8

    .line 389
    cmp-long v1, v1, v12

    .line 390
    .line 391
    if-gez v1, :cond_9

    .line 392
    .line 393
    const/4 v1, 0x1

    .line 394
    goto :goto_8

    .line 395
    :cond_9
    const/4 v1, 0x0

    .line 396
    :goto_8
    add-int/lit8 v8, v8, 0x1

    .line 397
    .line 398
    if-eqz v1, :cond_a

    .line 399
    .line 400
    iput-object v15, v6, La/zyg;->p:La/dzg;

    .line 401
    .line 402
    iput-object v7, v6, La/zyg;->q:La/zyg;

    .line 403
    .line 404
    iput-object v14, v6, La/zyg;->r:Ljava/lang/Throwable;

    .line 405
    .line 406
    iput-wide v4, v6, La/zyg;->i:J

    .line 407
    .line 408
    move/from16 v2, p0

    .line 409
    .line 410
    iput v2, v6, La/zyg;->l:I

    .line 411
    .line 412
    iput-wide v12, v6, La/zyg;->j:J

    .line 413
    .line 414
    iput-wide v10, v6, La/zyg;->k:J

    .line 415
    .line 416
    iput v9, v6, La/zyg;->m:I

    .line 417
    .line 418
    iput v8, v6, La/zyg;->n:I

    .line 419
    .line 420
    iput v1, v6, La/zyg;->o:I

    .line 421
    .line 422
    move/from16 p0, v1

    .line 423
    .line 424
    const/4 v1, 0x2

    .line 425
    iput v1, v6, La/zyg;->u:I

    .line 426
    .line 427
    invoke-static {v10, v11, v7}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    if-ne v0, v3, :cond_b

    .line 432
    .line 433
    goto :goto_c

    .line 434
    :goto_9
    move-object v1, v15

    .line 435
    goto/16 :goto_3

    .line 436
    .line 437
    :cond_a
    move/from16 v2, p0

    .line 438
    .line 439
    move/from16 p0, v1

    .line 440
    .line 441
    const/4 v1, 0x2

    .line 442
    new-instance v14, La/el50;

    .line 443
    .line 444
    invoke-direct {v14, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 445
    .line 446
    .line 447
    :cond_b
    :goto_a
    move/from16 v0, p0

    .line 448
    .line 449
    goto :goto_9

    .line 450
    :cond_c
    const/4 v1, 0x2

    .line 451
    invoke-static {v0}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 452
    .line 453
    .line 454
    move-result v16

    .line 455
    if-eqz v16, :cond_f

    .line 456
    .line 457
    move/from16 p0, v2

    .line 458
    .line 459
    int-to-long v1, v8

    .line 460
    cmp-long v1, v1, v12

    .line 461
    .line 462
    if-gez v1, :cond_d

    .line 463
    .line 464
    const/4 v1, 0x1

    .line 465
    goto :goto_b

    .line 466
    :cond_d
    const/4 v1, 0x0

    .line 467
    :goto_b
    add-int/lit8 v8, v8, 0x1

    .line 468
    .line 469
    if-eqz v1, :cond_e

    .line 470
    .line 471
    iput-object v15, v6, La/zyg;->p:La/dzg;

    .line 472
    .line 473
    iput-object v7, v6, La/zyg;->q:La/zyg;

    .line 474
    .line 475
    iput-object v14, v6, La/zyg;->r:Ljava/lang/Throwable;

    .line 476
    .line 477
    iput-wide v4, v6, La/zyg;->i:J

    .line 478
    .line 479
    move/from16 v2, p0

    .line 480
    .line 481
    iput v2, v6, La/zyg;->l:I

    .line 482
    .line 483
    iput-wide v12, v6, La/zyg;->j:J

    .line 484
    .line 485
    iput-wide v10, v6, La/zyg;->k:J

    .line 486
    .line 487
    iput v9, v6, La/zyg;->m:I

    .line 488
    .line 489
    iput v8, v6, La/zyg;->n:I

    .line 490
    .line 491
    iput v1, v6, La/zyg;->o:I

    .line 492
    .line 493
    move/from16 p0, v1

    .line 494
    .line 495
    const/4 v1, 0x3

    .line 496
    iput v1, v6, La/zyg;->u:I

    .line 497
    .line 498
    invoke-static {v10, v11, v7}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    if-ne v0, v3, :cond_b

    .line 503
    .line 504
    :goto_c
    return-object v3

    .line 505
    :cond_e
    move/from16 v2, p0

    .line 506
    .line 507
    move/from16 p0, v1

    .line 508
    .line 509
    const/4 v1, 0x3

    .line 510
    new-instance v14, La/dag0;

    .line 511
    .line 512
    invoke-direct {v14, v0}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 513
    .line 514
    .line 515
    goto :goto_a

    .line 516
    :cond_f
    const/4 v1, 0x3

    .line 517
    invoke-static {v0}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 518
    .line 519
    .line 520
    move-object v14, v0

    .line 521
    goto/16 :goto_7

    .line 522
    .line 523
    :cond_10
    if-nez v14, :cond_11

    .line 524
    .line 525
    const-string v0, "Unexpected error"

    .line 526
    .line 527
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    return-object p4

    .line 531
    :cond_11
    throw v14

    .line 532
    :cond_12
    return-object v1
.end method

.method public final b(Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v1, La/azg;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/azg;

    .line 11
    .line 12
    iget v3, v2, La/azg;->t:I

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
    iput v3, v2, La/azg;->t:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/azg;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/azg;-><init>(La/dzg;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/azg;->r:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/azg;->t:I

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
    iget v0, v2, La/azg;->q:I

    .line 47
    .line 48
    iget v4, v2, La/azg;->p:I

    .line 49
    .line 50
    iget v10, v2, La/azg;->o:I

    .line 51
    .line 52
    iget-wide v11, v2, La/azg;->n:J

    .line 53
    .line 54
    iget-wide v13, v2, La/azg;->m:J

    .line 55
    .line 56
    iget-object v15, v2, La/azg;->l:Ljava/lang/Throwable;

    .line 57
    .line 58
    const/16 p2, 0x0

    .line 59
    .line 60
    iget-object v7, v2, La/azg;->k:La/azg;

    .line 61
    .line 62
    iget-object v8, v2, La/azg;->j:La/dzg;

    .line 63
    .line 64
    iget-object v5, v2, La/azg;->i:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move-object v1, v7

    .line 70
    move v7, v4

    .line 71
    move-object v4, v5

    .line 72
    move-object v5, v1

    .line 73
    move-object v1, v8

    .line 74
    move v8, v10

    .line 75
    move-wide v10, v11

    .line 76
    move-wide v12, v13

    .line 77
    const/4 v9, 0x3

    .line 78
    goto/16 :goto_b

    .line 79
    .line 80
    :cond_1
    const/16 p2, 0x0

    .line 81
    .line 82
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 83
    .line 84
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-object p2

    .line 88
    :cond_2
    const/16 p2, 0x0

    .line 89
    .line 90
    iget v0, v2, La/azg;->q:I

    .line 91
    .line 92
    iget v4, v2, La/azg;->p:I

    .line 93
    .line 94
    iget v5, v2, La/azg;->o:I

    .line 95
    .line 96
    iget-wide v7, v2, La/azg;->n:J

    .line 97
    .line 98
    iget-wide v10, v2, La/azg;->m:J

    .line 99
    .line 100
    iget-object v12, v2, La/azg;->l:Ljava/lang/Throwable;

    .line 101
    .line 102
    iget-object v13, v2, La/azg;->k:La/azg;

    .line 103
    .line 104
    iget-object v14, v2, La/azg;->j:La/dzg;

    .line 105
    .line 106
    iget-object v15, v2, La/azg;->i:Ljava/lang/String;

    .line 107
    .line 108
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    move-object v1, v14

    .line 112
    move-object v14, v12

    .line 113
    move-wide/from16 v16, v7

    .line 114
    .line 115
    move v7, v4

    .line 116
    move v8, v5

    .line 117
    move-object v5, v13

    .line 118
    move-object v4, v15

    .line 119
    move-wide v12, v10

    .line 120
    move-wide/from16 v10, v16

    .line 121
    .line 122
    goto/16 :goto_7

    .line 123
    .line 124
    :cond_3
    const/16 p2, 0x0

    .line 125
    .line 126
    iget v4, v2, La/azg;->p:I

    .line 127
    .line 128
    iget v5, v2, La/azg;->o:I

    .line 129
    .line 130
    iget-wide v7, v2, La/azg;->n:J

    .line 131
    .line 132
    iget-wide v10, v2, La/azg;->m:J

    .line 133
    .line 134
    iget-object v12, v2, La/azg;->l:Ljava/lang/Throwable;

    .line 135
    .line 136
    iget-object v13, v2, La/azg;->k:La/azg;

    .line 137
    .line 138
    iget-object v14, v2, La/azg;->j:La/dzg;

    .line 139
    .line 140
    iget-object v15, v2, La/azg;->i:Ljava/lang/String;

    .line 141
    .line 142
    :try_start_0
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 143
    .line 144
    .line 145
    goto/16 :goto_2

    .line 146
    .line 147
    :catchall_0
    move-exception v0

    .line 148
    move-object v1, v14

    .line 149
    move-object v14, v0

    .line 150
    move-wide/from16 v16, v7

    .line 151
    .line 152
    move v7, v4

    .line 153
    move v8, v5

    .line 154
    move-object v5, v13

    .line 155
    move-object v4, v15

    .line 156
    move-object v15, v12

    .line 157
    move-wide v12, v10

    .line 158
    move-wide/from16 v10, v16

    .line 159
    .line 160
    goto/16 :goto_5

    .line 161
    .line 162
    :cond_4
    const/16 p2, 0x0

    .line 163
    .line 164
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    iget-object v1, v0, La/dzg;->b:La/nhf0;

    .line 171
    .line 172
    iget-object v1, v1, La/nhf0;->d:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 175
    .line 176
    move-object/from16 v4, p1

    .line 177
    .line 178
    invoke-virtual {v1, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    check-cast v1, Ljava/util/List;

    .line 183
    .line 184
    if-nez v1, :cond_11

    .line 185
    .line 186
    sget-wide v7, La/cag0;->a:J

    .line 187
    .line 188
    const-wide/16 v10, 0x3

    .line 189
    .line 190
    move-object/from16 v14, p2

    .line 191
    .line 192
    move-object v1, v0

    .line 193
    move-object v5, v2

    .line 194
    move v0, v9

    .line 195
    move-wide v12, v10

    .line 196
    move-wide v10, v7

    .line 197
    const/4 v7, 0x0

    .line 198
    const/4 v8, 0x0

    .line 199
    :goto_1
    if-eqz v0, :cond_f

    .line 200
    .line 201
    :try_start_1
    iget-object v15, v1, La/dzg;->a:La/clc;

    .line 202
    .line 203
    iput-object v4, v2, La/azg;->i:Ljava/lang/String;

    .line 204
    .line 205
    iput-object v1, v2, La/azg;->j:La/dzg;

    .line 206
    .line 207
    iput-object v5, v2, La/azg;->k:La/azg;

    .line 208
    .line 209
    iput-object v14, v2, La/azg;->l:Ljava/lang/Throwable;

    .line 210
    .line 211
    iput-wide v12, v2, La/azg;->m:J

    .line 212
    .line 213
    iput-wide v10, v2, La/azg;->n:J

    .line 214
    .line 215
    iput v8, v2, La/azg;->o:I

    .line 216
    .line 217
    iput v7, v2, La/azg;->p:I

    .line 218
    .line 219
    iput v0, v2, La/azg;->q:I

    .line 220
    .line 221
    iput v9, v2, La/azg;->t:I

    .line 222
    .line 223
    iget-object v0, v15, La/clc;->b:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v0, La/sza;

    .line 226
    .line 227
    invoke-virtual {v0}, La/sza;->invoke()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    check-cast v0, La/xyg;

    .line 232
    .line 233
    invoke-interface {v0, v4, v2}, La/xyg;->b(Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 237
    if-ne v0, v3, :cond_5

    .line 238
    .line 239
    goto/16 :goto_a

    .line 240
    .line 241
    :cond_5
    move-object v15, v4

    .line 242
    move v4, v7

    .line 243
    move-object/from16 v16, v1

    .line 244
    .line 245
    move-object v1, v0

    .line 246
    move-object/from16 v17, v14

    .line 247
    .line 248
    move-object/from16 v14, v16

    .line 249
    .line 250
    move-wide/from16 v18, v12

    .line 251
    .line 252
    move-object v13, v5

    .line 253
    move v5, v8

    .line 254
    move-wide v7, v10

    .line 255
    move-wide/from16 v10, v18

    .line 256
    .line 257
    move-object/from16 v12, v17

    .line 258
    .line 259
    :goto_2
    :try_start_2
    check-cast v1, La/dx5;

    .line 260
    .line 261
    invoke-virtual {v1}, La/dx5;->a()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    check-cast v0, Ljava/lang/Iterable;

    .line 266
    .line 267
    new-instance v1, Ljava/util/ArrayList;

    .line 268
    .line 269
    const/16 v9, 0xa

    .line 270
    .line 271
    invoke-static {v0, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 272
    .line 273
    .line 274
    move-result v9

    .line 275
    invoke-direct {v1, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 276
    .line 277
    .line 278
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 283
    .line 284
    .line 285
    move-result v9

    .line 286
    if-eqz v9, :cond_6

    .line 287
    .line 288
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v9

    .line 292
    check-cast v9, La/y5l;

    .line 293
    .line 294
    invoke-static {v9}, La/ntb;->b0(La/y5l;)La/v5l;

    .line 295
    .line 296
    .line 297
    move-result-object v9

    .line 298
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 299
    .line 300
    .line 301
    goto :goto_3

    .line 302
    :cond_6
    iget-object v0, v14, La/dzg;->b:La/nhf0;

    .line 303
    .line 304
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    iget-object v0, v0, La/nhf0;->d:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 310
    .line 311
    invoke-interface {v0, v15, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    return-object v1

    .line 315
    :goto_4
    move-object v15, v14

    .line 316
    move-object v14, v0

    .line 317
    goto :goto_5

    .line 318
    :catchall_1
    move-exception v0

    .line 319
    goto :goto_4

    .line 320
    :goto_5
    invoke-static {v14}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    if-eqz v0, :cond_a

    .line 325
    .line 326
    if-nez v8, :cond_7

    .line 327
    .line 328
    new-instance v0, La/el50;

    .line 329
    .line 330
    invoke-direct {v0, v14}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 331
    .line 332
    .line 333
    move-object v14, v0

    .line 334
    :goto_6
    const/4 v0, 0x0

    .line 335
    :goto_7
    const/4 v9, 0x1

    .line 336
    goto/16 :goto_1

    .line 337
    .line 338
    :cond_7
    move/from16 p0, v8

    .line 339
    .line 340
    int-to-long v8, v7

    .line 341
    cmp-long v0, v8, v12

    .line 342
    .line 343
    if-gez v0, :cond_8

    .line 344
    .line 345
    const/4 v0, 0x1

    .line 346
    goto :goto_8

    .line 347
    :cond_8
    const/4 v0, 0x0

    .line 348
    :goto_8
    add-int/lit8 v7, v7, 0x1

    .line 349
    .line 350
    if-eqz v0, :cond_9

    .line 351
    .line 352
    iput-object v4, v2, La/azg;->i:Ljava/lang/String;

    .line 353
    .line 354
    iput-object v1, v2, La/azg;->j:La/dzg;

    .line 355
    .line 356
    iput-object v5, v2, La/azg;->k:La/azg;

    .line 357
    .line 358
    iput-object v15, v2, La/azg;->l:Ljava/lang/Throwable;

    .line 359
    .line 360
    iput-wide v12, v2, La/azg;->m:J

    .line 361
    .line 362
    iput-wide v10, v2, La/azg;->n:J

    .line 363
    .line 364
    move/from16 v8, p0

    .line 365
    .line 366
    iput v8, v2, La/azg;->o:I

    .line 367
    .line 368
    iput v7, v2, La/azg;->p:I

    .line 369
    .line 370
    iput v0, v2, La/azg;->q:I

    .line 371
    .line 372
    iput v6, v2, La/azg;->t:I

    .line 373
    .line 374
    invoke-static {v10, v11, v5}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v9

    .line 378
    if-ne v9, v3, :cond_d

    .line 379
    .line 380
    goto :goto_a

    .line 381
    :cond_9
    move/from16 v8, p0

    .line 382
    .line 383
    new-instance v9, La/el50;

    .line 384
    .line 385
    invoke-direct {v9, v14}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 386
    .line 387
    .line 388
    move-object v14, v9

    .line 389
    goto :goto_7

    .line 390
    :cond_a
    invoke-static {v14}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 391
    .line 392
    .line 393
    move-result v0

    .line 394
    if-eqz v0, :cond_e

    .line 395
    .line 396
    move/from16 p0, v8

    .line 397
    .line 398
    int-to-long v8, v7

    .line 399
    cmp-long v0, v8, v12

    .line 400
    .line 401
    if-gez v0, :cond_b

    .line 402
    .line 403
    const/4 v0, 0x1

    .line 404
    goto :goto_9

    .line 405
    :cond_b
    const/4 v0, 0x0

    .line 406
    :goto_9
    add-int/lit8 v7, v7, 0x1

    .line 407
    .line 408
    if-eqz v0, :cond_c

    .line 409
    .line 410
    iput-object v4, v2, La/azg;->i:Ljava/lang/String;

    .line 411
    .line 412
    iput-object v1, v2, La/azg;->j:La/dzg;

    .line 413
    .line 414
    iput-object v5, v2, La/azg;->k:La/azg;

    .line 415
    .line 416
    iput-object v15, v2, La/azg;->l:Ljava/lang/Throwable;

    .line 417
    .line 418
    iput-wide v12, v2, La/azg;->m:J

    .line 419
    .line 420
    iput-wide v10, v2, La/azg;->n:J

    .line 421
    .line 422
    move/from16 v8, p0

    .line 423
    .line 424
    iput v8, v2, La/azg;->o:I

    .line 425
    .line 426
    iput v7, v2, La/azg;->p:I

    .line 427
    .line 428
    iput v0, v2, La/azg;->q:I

    .line 429
    .line 430
    const/4 v9, 0x3

    .line 431
    iput v9, v2, La/azg;->t:I

    .line 432
    .line 433
    invoke-static {v10, v11, v5}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v14

    .line 437
    if-ne v14, v3, :cond_d

    .line 438
    .line 439
    :goto_a
    return-object v3

    .line 440
    :cond_c
    move/from16 v8, p0

    .line 441
    .line 442
    const/4 v9, 0x3

    .line 443
    new-instance v15, La/dag0;

    .line 444
    .line 445
    invoke-direct {v15, v14}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 446
    .line 447
    .line 448
    :cond_d
    :goto_b
    move-object v14, v15

    .line 449
    goto :goto_7

    .line 450
    :cond_e
    const/4 v9, 0x3

    .line 451
    invoke-static {v14}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 452
    .line 453
    .line 454
    goto :goto_6

    .line 455
    :cond_f
    if-nez v14, :cond_10

    .line 456
    .line 457
    const-string v0, "Unexpected error"

    .line 458
    .line 459
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    return-object p2

    .line 463
    :cond_10
    throw v14

    .line 464
    :cond_11
    return-object v1
.end method

.method public final c(La/zje;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    instance-of v2, v1, La/bzg;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/bzg;

    .line 11
    .line 12
    iget v3, v2, La/bzg;->s:I

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
    iput v3, v2, La/bzg;->s:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/bzg;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/bzg;-><init>(La/dzg;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/bzg;->q:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/bzg;->s:I

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v9, 0x1

    .line 38
    if-eqz v4, :cond_5

    .line 39
    .line 40
    if-eq v4, v9, :cond_4

    .line 41
    .line 42
    if-eq v4, v6, :cond_3

    .line 43
    .line 44
    if-ne v4, v5, :cond_2

    .line 45
    .line 46
    iget v0, v2, La/bzg;->p:I

    .line 47
    .line 48
    iget v4, v2, La/bzg;->o:I

    .line 49
    .line 50
    iget v10, v2, La/bzg;->n:I

    .line 51
    .line 52
    iget-wide v11, v2, La/bzg;->m:J

    .line 53
    .line 54
    iget-wide v13, v2, La/bzg;->l:J

    .line 55
    .line 56
    iget-object v15, v2, La/bzg;->k:Ljava/lang/Throwable;

    .line 57
    .line 58
    const/16 p1, 0x0

    .line 59
    .line 60
    iget-object v7, v2, La/bzg;->j:La/bzg;

    .line 61
    .line 62
    iget-object v8, v2, La/bzg;->i:La/dzg;

    .line 63
    .line 64
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    move-object v1, v7

    .line 68
    move v7, v4

    .line 69
    move-object v4, v1

    .line 70
    move v9, v5

    .line 71
    move-object v1, v8

    .line 72
    move v8, v10

    .line 73
    :cond_1
    move-object v10, v15

    .line 74
    goto/16 :goto_e

    .line 75
    .line 76
    :cond_2
    const/16 p1, 0x0

    .line 77
    .line 78
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 79
    .line 80
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-object p1

    .line 84
    :cond_3
    const/16 p1, 0x0

    .line 85
    .line 86
    iget v0, v2, La/bzg;->p:I

    .line 87
    .line 88
    iget v4, v2, La/bzg;->o:I

    .line 89
    .line 90
    iget v7, v2, La/bzg;->n:I

    .line 91
    .line 92
    iget-wide v10, v2, La/bzg;->m:J

    .line 93
    .line 94
    iget-wide v12, v2, La/bzg;->l:J

    .line 95
    .line 96
    iget-object v8, v2, La/bzg;->k:Ljava/lang/Throwable;

    .line 97
    .line 98
    iget-object v14, v2, La/bzg;->j:La/bzg;

    .line 99
    .line 100
    iget-object v15, v2, La/bzg;->i:La/dzg;

    .line 101
    .line 102
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    move v1, v7

    .line 106
    move v7, v4

    .line 107
    move-object v4, v14

    .line 108
    move-wide v13, v12

    .line 109
    move-wide v11, v10

    .line 110
    move-object v10, v8

    .line 111
    move v8, v1

    .line 112
    move-object v1, v15

    .line 113
    goto/16 :goto_9

    .line 114
    .line 115
    :cond_4
    const/16 p1, 0x0

    .line 116
    .line 117
    iget v4, v2, La/bzg;->o:I

    .line 118
    .line 119
    iget v7, v2, La/bzg;->n:I

    .line 120
    .line 121
    iget-wide v10, v2, La/bzg;->m:J

    .line 122
    .line 123
    iget-wide v12, v2, La/bzg;->l:J

    .line 124
    .line 125
    iget-object v8, v2, La/bzg;->k:Ljava/lang/Throwable;

    .line 126
    .line 127
    iget-object v14, v2, La/bzg;->j:La/bzg;

    .line 128
    .line 129
    iget-object v15, v2, La/bzg;->i:La/dzg;

    .line 130
    .line 131
    :try_start_0
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 132
    .line 133
    .line 134
    goto/16 :goto_3

    .line 135
    .line 136
    :catchall_0
    move-exception v0

    .line 137
    move-object v1, v15

    .line 138
    move-object v15, v8

    .line 139
    move v8, v7

    .line 140
    move v7, v4

    .line 141
    move-object v4, v14

    .line 142
    move-wide v13, v12

    .line 143
    move-wide v11, v10

    .line 144
    :goto_1
    move-object v10, v0

    .line 145
    goto/16 :goto_8

    .line 146
    .line 147
    :cond_5
    const/16 p1, 0x0

    .line 148
    .line 149
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    iget-object v1, v0, La/dzg;->b:La/nhf0;

    .line 153
    .line 154
    iget-object v1, v1, La/nhf0;->c:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v1, Ljava/util/ArrayList;

    .line 157
    .line 158
    if-nez v1, :cond_15

    .line 159
    .line 160
    sget-wide v7, La/cag0;->a:J

    .line 161
    .line 162
    const-wide/16 v10, 0x3

    .line 163
    .line 164
    move-object v1, v0

    .line 165
    move-object v4, v2

    .line 166
    move v0, v9

    .line 167
    move-wide v13, v10

    .line 168
    move-object/from16 v10, p1

    .line 169
    .line 170
    move-wide v11, v7

    .line 171
    const/4 v7, 0x0

    .line 172
    const/4 v8, 0x0

    .line 173
    :goto_2
    if-eqz v0, :cond_13

    .line 174
    .line 175
    :try_start_1
    iget-object v15, v1, La/dzg;->a:La/clc;

    .line 176
    .line 177
    iput-object v1, v2, La/bzg;->i:La/dzg;

    .line 178
    .line 179
    iput-object v4, v2, La/bzg;->j:La/bzg;

    .line 180
    .line 181
    iput-object v10, v2, La/bzg;->k:Ljava/lang/Throwable;

    .line 182
    .line 183
    iput-wide v13, v2, La/bzg;->l:J

    .line 184
    .line 185
    iput-wide v11, v2, La/bzg;->m:J

    .line 186
    .line 187
    iput v8, v2, La/bzg;->n:I

    .line 188
    .line 189
    iput v7, v2, La/bzg;->o:I

    .line 190
    .line 191
    iput v0, v2, La/bzg;->p:I

    .line 192
    .line 193
    iput v9, v2, La/bzg;->s:I

    .line 194
    .line 195
    iget-object v0, v15, La/clc;->b:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v0, La/sza;

    .line 198
    .line 199
    invoke-virtual {v0}, La/sza;->invoke()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    check-cast v0, La/xyg;

    .line 204
    .line 205
    invoke-interface {v0, v2}, La/xyg;->c(La/yje;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 209
    if-ne v0, v3, :cond_6

    .line 210
    .line 211
    goto/16 :goto_d

    .line 212
    .line 213
    :cond_6
    move-wide/from16 v23, v13

    .line 214
    .line 215
    move-object v14, v4

    .line 216
    move v4, v7

    .line 217
    move v7, v8

    .line 218
    move-object v8, v10

    .line 219
    move-wide v10, v11

    .line 220
    move-wide/from16 v12, v23

    .line 221
    .line 222
    move-object v15, v1

    .line 223
    move-object v1, v0

    .line 224
    :goto_3
    :try_start_2
    check-cast v1, La/dx5;

    .line 225
    .line 226
    invoke-virtual {v1}, La/dx5;->a()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    check-cast v0, Ljava/lang/Iterable;

    .line 231
    .line 232
    new-instance v1, Ljava/util/ArrayList;

    .line 233
    .line 234
    const/16 v9, 0xa

    .line 235
    .line 236
    invoke-static {v0, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 237
    .line 238
    .line 239
    move-result v9

    .line 240
    invoke-direct {v1, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 241
    .line 242
    .line 243
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 248
    .line 249
    .line 250
    move-result v9

    .line 251
    if-eqz v9, :cond_a

    .line 252
    .line 253
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v9

    .line 257
    check-cast v9, La/ial;

    .line 258
    .line 259
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    new-instance v16, La/fal;

    .line 263
    .line 264
    iget-object v5, v9, La/ial;->a:Ljava/lang/Long;

    .line 265
    .line 266
    if-eqz v5, :cond_7

    .line 267
    .line 268
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 269
    .line 270
    .line 271
    move-result-wide v17

    .line 272
    goto :goto_5

    .line 273
    :cond_7
    const-wide/16 v17, 0x0

    .line 274
    .line 275
    :goto_5
    iget-object v5, v9, La/ial;->d:Ljava/lang/String;

    .line 276
    .line 277
    invoke-static {v5}, La/lmc;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v21

    .line 281
    iget-object v5, v9, La/ial;->b:Ljava/lang/String;

    .line 282
    .line 283
    if-nez v5, :cond_8

    .line 284
    .line 285
    const-string v5, ""

    .line 286
    .line 287
    :cond_8
    move-object/from16 v22, v5

    .line 288
    .line 289
    iget-object v5, v9, La/ial;->c:Ljava/lang/Long;

    .line 290
    .line 291
    if-eqz v5, :cond_9

    .line 292
    .line 293
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 294
    .line 295
    .line 296
    move-result-wide v19

    .line 297
    goto :goto_6

    .line 298
    :cond_9
    const-wide/16 v19, -0x1

    .line 299
    .line 300
    :goto_6
    invoke-direct/range {v16 .. v22}, La/fal;-><init>(JJLjava/lang/String;Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    move-object/from16 v5, v16

    .line 304
    .line 305
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 306
    .line 307
    .line 308
    const/4 v5, 0x3

    .line 309
    goto :goto_4

    .line 310
    :cond_a
    iget-object v0, v15, La/dzg;->b:La/nhf0;

    .line 311
    .line 312
    iput-object v1, v0, La/nhf0;->c:Ljava/lang/Object;

    .line 313
    .line 314
    return-object v1

    .line 315
    :goto_7
    move-object v15, v10

    .line 316
    goto/16 :goto_1

    .line 317
    .line 318
    :catchall_1
    move-exception v0

    .line 319
    goto :goto_7

    .line 320
    :goto_8
    invoke-static {v10}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    if-eqz v0, :cond_f

    .line 325
    .line 326
    if-nez v8, :cond_b

    .line 327
    .line 328
    new-instance v0, La/el50;

    .line 329
    .line 330
    invoke-direct {v0, v10}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 331
    .line 332
    .line 333
    move-object v10, v0

    .line 334
    const/4 v0, 0x0

    .line 335
    :goto_9
    const/4 v5, 0x3

    .line 336
    :goto_a
    const/4 v9, 0x1

    .line 337
    goto/16 :goto_2

    .line 338
    .line 339
    :cond_b
    move-object/from16 p0, v10

    .line 340
    .line 341
    int-to-long v9, v7

    .line 342
    cmp-long v0, v9, v13

    .line 343
    .line 344
    if-gez v0, :cond_c

    .line 345
    .line 346
    const/4 v0, 0x1

    .line 347
    goto :goto_b

    .line 348
    :cond_c
    const/4 v0, 0x0

    .line 349
    :goto_b
    add-int/lit8 v7, v7, 0x1

    .line 350
    .line 351
    if-eqz v0, :cond_e

    .line 352
    .line 353
    iput-object v1, v2, La/bzg;->i:La/dzg;

    .line 354
    .line 355
    iput-object v4, v2, La/bzg;->j:La/bzg;

    .line 356
    .line 357
    iput-object v15, v2, La/bzg;->k:Ljava/lang/Throwable;

    .line 358
    .line 359
    iput-wide v13, v2, La/bzg;->l:J

    .line 360
    .line 361
    iput-wide v11, v2, La/bzg;->m:J

    .line 362
    .line 363
    iput v8, v2, La/bzg;->n:I

    .line 364
    .line 365
    iput v7, v2, La/bzg;->o:I

    .line 366
    .line 367
    iput v0, v2, La/bzg;->p:I

    .line 368
    .line 369
    iput v6, v2, La/bzg;->s:I

    .line 370
    .line 371
    invoke-static {v11, v12, v4}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v5

    .line 375
    if-ne v5, v3, :cond_d

    .line 376
    .line 377
    goto :goto_d

    .line 378
    :cond_d
    move-object v10, v15

    .line 379
    goto :goto_9

    .line 380
    :cond_e
    new-instance v10, La/el50;

    .line 381
    .line 382
    move-object/from16 v5, p0

    .line 383
    .line 384
    invoke-direct {v10, v5}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 385
    .line 386
    .line 387
    goto :goto_9

    .line 388
    :cond_f
    move-object v5, v10

    .line 389
    invoke-static {v5}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 390
    .line 391
    .line 392
    move-result v0

    .line 393
    if-eqz v0, :cond_12

    .line 394
    .line 395
    int-to-long v9, v7

    .line 396
    cmp-long v0, v9, v13

    .line 397
    .line 398
    if-gez v0, :cond_10

    .line 399
    .line 400
    const/4 v0, 0x1

    .line 401
    goto :goto_c

    .line 402
    :cond_10
    const/4 v0, 0x0

    .line 403
    :goto_c
    add-int/lit8 v7, v7, 0x1

    .line 404
    .line 405
    if-eqz v0, :cond_11

    .line 406
    .line 407
    iput-object v1, v2, La/bzg;->i:La/dzg;

    .line 408
    .line 409
    iput-object v4, v2, La/bzg;->j:La/bzg;

    .line 410
    .line 411
    iput-object v15, v2, La/bzg;->k:Ljava/lang/Throwable;

    .line 412
    .line 413
    iput-wide v13, v2, La/bzg;->l:J

    .line 414
    .line 415
    iput-wide v11, v2, La/bzg;->m:J

    .line 416
    .line 417
    iput v8, v2, La/bzg;->n:I

    .line 418
    .line 419
    iput v7, v2, La/bzg;->o:I

    .line 420
    .line 421
    iput v0, v2, La/bzg;->p:I

    .line 422
    .line 423
    const/4 v9, 0x3

    .line 424
    iput v9, v2, La/bzg;->s:I

    .line 425
    .line 426
    invoke-static {v11, v12, v4}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v5

    .line 430
    if-ne v5, v3, :cond_1

    .line 431
    .line 432
    :goto_d
    return-object v3

    .line 433
    :goto_e
    move v5, v9

    .line 434
    goto :goto_a

    .line 435
    :cond_11
    const/4 v9, 0x3

    .line 436
    new-instance v10, La/dag0;

    .line 437
    .line 438
    invoke-direct {v10, v5}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 439
    .line 440
    .line 441
    goto :goto_e

    .line 442
    :cond_12
    const/4 v9, 0x3

    .line 443
    invoke-static {v5}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 444
    .line 445
    .line 446
    move-object v10, v5

    .line 447
    move v5, v9

    .line 448
    const/4 v0, 0x0

    .line 449
    goto :goto_a

    .line 450
    :cond_13
    if-nez v10, :cond_14

    .line 451
    .line 452
    const-string v0, "Unexpected error"

    .line 453
    .line 454
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 455
    .line 456
    .line 457
    return-object p1

    .line 458
    :cond_14
    throw v10

    .line 459
    :cond_15
    return-object v1
.end method

.method public final d(ILa/epe;La/zje;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    instance-of v2, v1, La/czg;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/czg;

    .line 11
    .line 12
    iget v3, v2, La/czg;->u:I

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
    iput v3, v2, La/czg;->u:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/czg;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/czg;-><init>(La/dzg;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/czg;->s:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/czg;->u:I

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
    iget v0, v2, La/czg;->l:I

    .line 47
    .line 48
    iget v4, v2, La/czg;->k:I

    .line 49
    .line 50
    iget v10, v2, La/czg;->j:I

    .line 51
    .line 52
    iget-wide v11, v2, La/czg;->r:J

    .line 53
    .line 54
    iget-wide v13, v2, La/czg;->q:J

    .line 55
    .line 56
    iget v15, v2, La/czg;->i:I

    .line 57
    .line 58
    const/16 p3, 0x0

    .line 59
    .line 60
    iget-object v7, v2, La/czg;->p:Ljava/lang/Throwable;

    .line 61
    .line 62
    iget-object v8, v2, La/czg;->o:La/czg;

    .line 63
    .line 64
    iget-object v5, v2, La/czg;->n:La/dzg;

    .line 65
    .line 66
    iget-object v6, v2, La/czg;->m:La/epe;

    .line 67
    .line 68
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    move-object v1, v5

    .line 72
    move-object v9, v7

    .line 73
    move-object v5, v2

    .line 74
    move v7, v4

    .line 75
    move-object v4, v6

    .line 76
    move-object v6, v8

    .line 77
    move v8, v10

    .line 78
    move-wide v10, v11

    .line 79
    move-wide v12, v13

    .line 80
    move v2, v15

    .line 81
    const/4 v14, 0x3

    .line 82
    goto/16 :goto_b

    .line 83
    .line 84
    :cond_1
    const/16 p3, 0x0

    .line 85
    .line 86
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 87
    .line 88
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-object p3

    .line 92
    :cond_2
    const/16 p3, 0x0

    .line 93
    .line 94
    iget v0, v2, La/czg;->l:I

    .line 95
    .line 96
    iget v4, v2, La/czg;->k:I

    .line 97
    .line 98
    iget v5, v2, La/czg;->j:I

    .line 99
    .line 100
    iget-wide v6, v2, La/czg;->r:J

    .line 101
    .line 102
    iget-wide v10, v2, La/czg;->q:J

    .line 103
    .line 104
    iget v8, v2, La/czg;->i:I

    .line 105
    .line 106
    iget-object v12, v2, La/czg;->p:Ljava/lang/Throwable;

    .line 107
    .line 108
    iget-object v13, v2, La/czg;->o:La/czg;

    .line 109
    .line 110
    iget-object v14, v2, La/czg;->n:La/dzg;

    .line 111
    .line 112
    iget-object v15, v2, La/czg;->m:La/epe;

    .line 113
    .line 114
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    move v1, v5

    .line 118
    move-object v5, v2

    .line 119
    move v2, v8

    .line 120
    move v8, v1

    .line 121
    move-object v1, v14

    .line 122
    move-wide/from16 v17, v6

    .line 123
    .line 124
    move v7, v4

    .line 125
    move-object v6, v13

    .line 126
    move-object v4, v15

    .line 127
    const/4 v13, 0x2

    .line 128
    move-wide v14, v10

    .line 129
    move-wide/from16 v10, v17

    .line 130
    .line 131
    goto/16 :goto_8

    .line 132
    .line 133
    :cond_3
    const/16 p3, 0x0

    .line 134
    .line 135
    iget v4, v2, La/czg;->k:I

    .line 136
    .line 137
    iget v5, v2, La/czg;->j:I

    .line 138
    .line 139
    iget-wide v6, v2, La/czg;->r:J

    .line 140
    .line 141
    iget-wide v10, v2, La/czg;->q:J

    .line 142
    .line 143
    iget v8, v2, La/czg;->i:I

    .line 144
    .line 145
    iget-object v12, v2, La/czg;->p:Ljava/lang/Throwable;

    .line 146
    .line 147
    iget-object v13, v2, La/czg;->o:La/czg;

    .line 148
    .line 149
    iget-object v14, v2, La/czg;->n:La/dzg;

    .line 150
    .line 151
    iget-object v15, v2, La/czg;->m:La/epe;

    .line 152
    .line 153
    :try_start_0
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 154
    .line 155
    .line 156
    move-object v0, v1

    .line 157
    move v1, v9

    .line 158
    goto/16 :goto_3

    .line 159
    .line 160
    :catchall_0
    move-exception v0

    .line 161
    move-object v9, v0

    .line 162
    move v0, v8

    .line 163
    move v8, v5

    .line 164
    move-object v5, v2

    .line 165
    move-wide v1, v10

    .line 166
    move-wide v10, v6

    .line 167
    move-object v6, v13

    .line 168
    move v7, v4

    .line 169
    move-object v4, v15

    .line 170
    goto/16 :goto_5

    .line 171
    .line 172
    :cond_4
    const/16 p3, 0x0

    .line 173
    .line 174
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    move-object/from16 v1, p2

    .line 178
    .line 179
    iget-object v4, v1, La/epe;->a:Ljava/lang/String;

    .line 180
    .line 181
    iget-object v5, v0, La/dzg;->b:La/nhf0;

    .line 182
    .line 183
    iget-object v5, v5, La/nhf0;->b:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v5, Ljava/util/LinkedHashMap;

    .line 186
    .line 187
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    invoke-virtual {v5, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    check-cast v5, Ljava/util/Map;

    .line 196
    .line 197
    if-eqz v5, :cond_5

    .line 198
    .line 199
    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    check-cast v4, Ljava/util/List;

    .line 204
    .line 205
    goto :goto_1

    .line 206
    :cond_5
    move-object/from16 v4, p3

    .line 207
    .line 208
    :goto_1
    if-nez v4, :cond_13

    .line 209
    .line 210
    sget-wide v4, La/cag0;->a:J

    .line 211
    .line 212
    const-wide/16 v6, 0x3

    .line 213
    .line 214
    move-object/from16 v14, p3

    .line 215
    .line 216
    move-wide v10, v4

    .line 217
    move-wide v12, v6

    .line 218
    const/4 v7, 0x0

    .line 219
    const/4 v8, 0x0

    .line 220
    move-object v4, v1

    .line 221
    move-object v5, v2

    .line 222
    move-object v6, v5

    .line 223
    move/from16 v2, p1

    .line 224
    .line 225
    move-object v1, v0

    .line 226
    move v0, v9

    .line 227
    :goto_2
    if-eqz v0, :cond_11

    .line 228
    .line 229
    :try_start_1
    iget-object v15, v1, La/dzg;->a:La/clc;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 230
    .line 231
    :try_start_2
    iget-object v9, v4, La/epe;->a:Ljava/lang/String;

    .line 232
    .line 233
    iput-object v4, v5, La/czg;->m:La/epe;

    .line 234
    .line 235
    iput-object v1, v5, La/czg;->n:La/dzg;

    .line 236
    .line 237
    iput-object v6, v5, La/czg;->o:La/czg;

    .line 238
    .line 239
    iput-object v14, v5, La/czg;->p:Ljava/lang/Throwable;

    .line 240
    .line 241
    iput v2, v5, La/czg;->i:I

    .line 242
    .line 243
    iput-wide v12, v5, La/czg;->q:J

    .line 244
    .line 245
    iput-wide v10, v5, La/czg;->r:J

    .line 246
    .line 247
    iput v8, v5, La/czg;->j:I

    .line 248
    .line 249
    iput v7, v5, La/czg;->k:I

    .line 250
    .line 251
    iput v0, v5, La/czg;->l:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 252
    .line 253
    move-object/from16 p0, v1

    .line 254
    .line 255
    const/4 v1, 0x1

    .line 256
    :try_start_3
    iput v1, v5, La/czg;->u:I

    .line 257
    .line 258
    iget-object v0, v15, La/clc;->b:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v0, La/sza;

    .line 261
    .line 262
    invoke-virtual {v0}, La/sza;->invoke()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    check-cast v0, La/xyg;

    .line 267
    .line 268
    invoke-interface {v0, v2, v9, v5}, La/xyg;->a(ILjava/lang/String;La/yje;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 272
    if-ne v0, v3, :cond_6

    .line 273
    .line 274
    goto/16 :goto_a

    .line 275
    .line 276
    :cond_6
    move v15, v8

    .line 277
    move v8, v2

    .line 278
    move-object v2, v5

    .line 279
    move v5, v15

    .line 280
    move-object v15, v4

    .line 281
    move v4, v7

    .line 282
    move-object/from16 v17, v14

    .line 283
    .line 284
    move-object/from16 v14, p0

    .line 285
    .line 286
    move-wide/from16 v18, v12

    .line 287
    .line 288
    move-object v13, v6

    .line 289
    move-wide v6, v10

    .line 290
    move-wide/from16 v10, v18

    .line 291
    .line 292
    move-object/from16 v12, v17

    .line 293
    .line 294
    :goto_3
    :try_start_4
    check-cast v0, La/dx5;

    .line 295
    .line 296
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    check-cast v0, La/jyg;

    .line 301
    .line 302
    invoke-static {v0}, La/slb;->Z(La/jyg;)Ljava/util/List;

    .line 303
    .line 304
    .line 305
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 306
    iget-object v1, v14, La/dzg;->b:La/nhf0;

    .line 307
    .line 308
    iget-object v2, v15, La/epe;->a:Ljava/lang/String;

    .line 309
    .line 310
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    iget-object v1, v1, La/nhf0;->b:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 316
    .line 317
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    invoke-virtual {v1, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v4

    .line 325
    if-nez v4, :cond_7

    .line 326
    .line 327
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 328
    .line 329
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 330
    .line 331
    .line 332
    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    :cond_7
    check-cast v4, Ljava/util/Map;

    .line 336
    .line 337
    invoke-interface {v4, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    return-object v0

    .line 341
    :goto_4
    move-object v9, v0

    .line 342
    move v0, v2

    .line 343
    move-wide v1, v12

    .line 344
    move-object v12, v14

    .line 345
    move-object/from16 v14, p0

    .line 346
    .line 347
    goto :goto_5

    .line 348
    :catchall_1
    move-exception v0

    .line 349
    goto :goto_4

    .line 350
    :catchall_2
    move-exception v0

    .line 351
    move-object/from16 p0, v1

    .line 352
    .line 353
    const/4 v1, 0x1

    .line 354
    goto :goto_4

    .line 355
    :catchall_3
    move-exception v0

    .line 356
    move-object/from16 p0, v1

    .line 357
    .line 358
    move v1, v9

    .line 359
    goto :goto_4

    .line 360
    :goto_5
    invoke-static {v9}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 361
    .line 362
    .line 363
    move-result v13

    .line 364
    if-eqz v13, :cond_c

    .line 365
    .line 366
    if-nez v8, :cond_8

    .line 367
    .line 368
    new-instance v12, La/el50;

    .line 369
    .line 370
    invoke-direct {v12, v9}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 371
    .line 372
    .line 373
    move-object v9, v14

    .line 374
    move-object v14, v12

    .line 375
    move-wide v12, v1

    .line 376
    move-object v1, v9

    .line 377
    move v2, v0

    .line 378
    const/4 v0, 0x0

    .line 379
    :goto_6
    const/4 v9, 0x1

    .line 380
    goto/16 :goto_2

    .line 381
    .line 382
    :cond_8
    move/from16 p0, v8

    .line 383
    .line 384
    move-object/from16 p1, v9

    .line 385
    .line 386
    int-to-long v8, v7

    .line 387
    cmp-long v8, v8, v1

    .line 388
    .line 389
    if-gez v8, :cond_9

    .line 390
    .line 391
    const/4 v8, 0x1

    .line 392
    goto :goto_7

    .line 393
    :cond_9
    const/4 v8, 0x0

    .line 394
    :goto_7
    add-int/lit8 v7, v7, 0x1

    .line 395
    .line 396
    if-eqz v8, :cond_b

    .line 397
    .line 398
    iput-object v4, v5, La/czg;->m:La/epe;

    .line 399
    .line 400
    iput-object v14, v5, La/czg;->n:La/dzg;

    .line 401
    .line 402
    iput-object v6, v5, La/czg;->o:La/czg;

    .line 403
    .line 404
    iput-object v12, v5, La/czg;->p:Ljava/lang/Throwable;

    .line 405
    .line 406
    iput v0, v5, La/czg;->i:I

    .line 407
    .line 408
    iput-wide v1, v5, La/czg;->q:J

    .line 409
    .line 410
    iput-wide v10, v5, La/czg;->r:J

    .line 411
    .line 412
    move/from16 v9, p0

    .line 413
    .line 414
    iput v9, v5, La/czg;->j:I

    .line 415
    .line 416
    iput v7, v5, La/czg;->k:I

    .line 417
    .line 418
    iput v8, v5, La/czg;->l:I

    .line 419
    .line 420
    const/4 v13, 0x2

    .line 421
    iput v13, v5, La/czg;->u:I

    .line 422
    .line 423
    invoke-static {v10, v11, v6}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v15

    .line 427
    if-ne v15, v3, :cond_a

    .line 428
    .line 429
    goto/16 :goto_a

    .line 430
    .line 431
    :cond_a
    move-wide/from16 v17, v1

    .line 432
    .line 433
    move-object v1, v14

    .line 434
    move-wide/from16 v14, v17

    .line 435
    .line 436
    move v2, v0

    .line 437
    move v0, v8

    .line 438
    move v8, v9

    .line 439
    :goto_8
    move-wide/from16 v17, v14

    .line 440
    .line 441
    move-object v14, v12

    .line 442
    move-wide/from16 v12, v17

    .line 443
    .line 444
    goto :goto_6

    .line 445
    :cond_b
    move/from16 v9, p0

    .line 446
    .line 447
    const/4 v13, 0x2

    .line 448
    new-instance v12, La/el50;

    .line 449
    .line 450
    move-object/from16 v15, p1

    .line 451
    .line 452
    invoke-direct {v12, v15}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 453
    .line 454
    .line 455
    move-object/from16 v17, v14

    .line 456
    .line 457
    move-object v14, v12

    .line 458
    move-wide v12, v1

    .line 459
    move-object/from16 v1, v17

    .line 460
    .line 461
    move v2, v0

    .line 462
    move v0, v8

    .line 463
    move v8, v9

    .line 464
    goto :goto_6

    .line 465
    :cond_c
    move-object v15, v9

    .line 466
    const/4 v13, 0x2

    .line 467
    move v9, v8

    .line 468
    invoke-static {v15}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 469
    .line 470
    .line 471
    move-result v8

    .line 472
    if-eqz v8, :cond_10

    .line 473
    .line 474
    move-object v8, v14

    .line 475
    int-to-long v13, v7

    .line 476
    cmp-long v13, v13, v1

    .line 477
    .line 478
    if-gez v13, :cond_d

    .line 479
    .line 480
    const/4 v13, 0x1

    .line 481
    goto :goto_9

    .line 482
    :cond_d
    const/4 v13, 0x0

    .line 483
    :goto_9
    add-int/lit8 v7, v7, 0x1

    .line 484
    .line 485
    if-eqz v13, :cond_f

    .line 486
    .line 487
    iput-object v4, v5, La/czg;->m:La/epe;

    .line 488
    .line 489
    iput-object v8, v5, La/czg;->n:La/dzg;

    .line 490
    .line 491
    iput-object v6, v5, La/czg;->o:La/czg;

    .line 492
    .line 493
    iput-object v12, v5, La/czg;->p:Ljava/lang/Throwable;

    .line 494
    .line 495
    iput v0, v5, La/czg;->i:I

    .line 496
    .line 497
    iput-wide v1, v5, La/czg;->q:J

    .line 498
    .line 499
    iput-wide v10, v5, La/czg;->r:J

    .line 500
    .line 501
    iput v9, v5, La/czg;->j:I

    .line 502
    .line 503
    iput v7, v5, La/czg;->k:I

    .line 504
    .line 505
    iput v13, v5, La/czg;->l:I

    .line 506
    .line 507
    const/4 v14, 0x3

    .line 508
    iput v14, v5, La/czg;->u:I

    .line 509
    .line 510
    invoke-static {v10, v11, v6}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v15

    .line 514
    if-ne v15, v3, :cond_e

    .line 515
    .line 516
    :goto_a
    return-object v3

    .line 517
    :cond_e
    move-wide/from16 v17, v1

    .line 518
    .line 519
    move v2, v0

    .line 520
    move-object v1, v8

    .line 521
    move v8, v9

    .line 522
    move-object v9, v12

    .line 523
    move v0, v13

    .line 524
    move-wide/from16 v12, v17

    .line 525
    .line 526
    :goto_b
    move-object v14, v9

    .line 527
    goto/16 :goto_6

    .line 528
    .line 529
    :cond_f
    const/4 v14, 0x3

    .line 530
    new-instance v12, La/dag0;

    .line 531
    .line 532
    invoke-direct {v12, v15}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 533
    .line 534
    .line 535
    move-object v14, v12

    .line 536
    move-wide/from16 v17, v1

    .line 537
    .line 538
    move v2, v0

    .line 539
    move-object v1, v8

    .line 540
    move v8, v9

    .line 541
    move v0, v13

    .line 542
    const/4 v9, 0x1

    .line 543
    move-wide/from16 v12, v17

    .line 544
    .line 545
    goto/16 :goto_2

    .line 546
    .line 547
    :cond_10
    move-object v8, v14

    .line 548
    const/4 v14, 0x3

    .line 549
    invoke-static {v15}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 550
    .line 551
    .line 552
    move-wide v12, v1

    .line 553
    move-object v1, v8

    .line 554
    move v8, v9

    .line 555
    move-object v14, v15

    .line 556
    const/4 v9, 0x1

    .line 557
    move v2, v0

    .line 558
    const/4 v0, 0x0

    .line 559
    goto/16 :goto_2

    .line 560
    .line 561
    :cond_11
    if-nez v14, :cond_12

    .line 562
    .line 563
    const-string v0, "Unexpected error"

    .line 564
    .line 565
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 566
    .line 567
    .line 568
    return-object p3

    .line 569
    :cond_12
    throw v14

    .line 570
    :cond_13
    return-object v4
.end method
