.class public final La/kxu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/hru;

.field public final b:La/gs;

.field public final c:La/hsj;

.field public final d:La/j9c;

.field public final e:La/pmi;

.field public final f:La/rou;


# direct methods
.method public constructor <init>(La/hru;La/gs;La/hsj;La/j9c;La/pmi;La/rou;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/kxu;->a:La/hru;

    .line 5
    .line 6
    iput-object p2, p0, La/kxu;->b:La/gs;

    .line 7
    .line 8
    iput-object p3, p0, La/kxu;->c:La/hsj;

    .line 9
    .line 10
    iput-object p4, p0, La/kxu;->d:La/j9c;

    .line 11
    .line 12
    iput-object p5, p0, La/kxu;->e:La/pmi;

    .line 13
    .line 14
    iput-object p6, p0, La/kxu;->f:La/rou;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(DLa/q4f;JLjava/lang/Double;La/ozc;La/zje;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v3, p3

    .line 6
    .line 7
    move-object/from16 v4, p8

    .line 8
    .line 9
    instance-of v5, v4, La/ixu;

    .line 10
    .line 11
    if-eqz v5, :cond_0

    .line 12
    .line 13
    move-object v5, v4

    .line 14
    check-cast v5, La/ixu;

    .line 15
    .line 16
    iget v6, v5, La/ixu;->w:I

    .line 17
    .line 18
    const/high16 v7, -0x80000000

    .line 19
    .line 20
    and-int v8, v6, v7

    .line 21
    .line 22
    if-eqz v8, :cond_0

    .line 23
    .line 24
    sub-int/2addr v6, v7

    .line 25
    iput v6, v5, La/ixu;->w:I

    .line 26
    .line 27
    :goto_0
    move-object v15, v5

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    new-instance v5, La/ixu;

    .line 30
    .line 31
    invoke-direct {v5, v0, v4}, La/ixu;-><init>(La/kxu;La/zje;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :goto_1
    iget-object v4, v15, La/ixu;->u:Ljava/lang/Object;

    .line 36
    .line 37
    sget-object v5, La/wne;->a:La/wne;

    .line 38
    .line 39
    iget v6, v15, La/ixu;->w:I

    .line 40
    .line 41
    const/4 v13, 0x4

    .line 42
    const/4 v14, 0x2

    .line 43
    const-wide/high16 v16, 0x4000000000000000L    # 2.0

    .line 44
    .line 45
    const/4 v10, 0x1

    .line 46
    const/4 v11, 0x3

    .line 47
    const/4 v12, 0x0

    .line 48
    if-eqz v6, :cond_5

    .line 49
    .line 50
    if-eq v6, v10, :cond_4

    .line 51
    .line 52
    if-eq v6, v14, :cond_3

    .line 53
    .line 54
    if-eq v6, v11, :cond_2

    .line 55
    .line 56
    if-ne v6, v13, :cond_1

    .line 57
    .line 58
    invoke-static {v4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    return-object v4

    .line 62
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-object v12

    .line 68
    :cond_2
    iget v0, v15, La/ixu;->t:I

    .line 69
    .line 70
    iget-wide v1, v15, La/ixu;->r:J

    .line 71
    .line 72
    iget-wide v6, v15, La/ixu;->k:D

    .line 73
    .line 74
    iget-wide v8, v15, La/ixu;->j:D

    .line 75
    .line 76
    iget-boolean v3, v15, La/ixu;->s:Z

    .line 77
    .line 78
    iget-wide v10, v15, La/ixu;->q:J

    .line 79
    .line 80
    iget-wide v13, v15, La/ixu;->i:D

    .line 81
    .line 82
    iget-object v12, v15, La/ixu;->o:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v12, La/qvo0;

    .line 85
    .line 86
    move/from16 v16, v0

    .line 87
    .line 88
    iget-object v0, v15, La/ixu;->n:La/hru;

    .line 89
    .line 90
    invoke-static {v4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    move-object/from16 p0, v4

    .line 94
    .line 95
    move-object/from16 v23, v5

    .line 96
    .line 97
    move-wide v4, v13

    .line 98
    move-wide v13, v1

    .line 99
    move-wide/from16 v27, v6

    .line 100
    .line 101
    move-object v6, v0

    .line 102
    move-wide v7, v8

    .line 103
    move-wide v0, v10

    .line 104
    move/from16 v11, v16

    .line 105
    .line 106
    move-wide/from16 v9, v27

    .line 107
    .line 108
    move-object/from16 v16, v12

    .line 109
    .line 110
    goto/16 :goto_f

    .line 111
    .line 112
    :cond_3
    iget-wide v1, v15, La/ixu;->r:J

    .line 113
    .line 114
    iget-wide v6, v15, La/ixu;->k:D

    .line 115
    .line 116
    iget-wide v8, v15, La/ixu;->j:D

    .line 117
    .line 118
    iget-boolean v3, v15, La/ixu;->s:Z

    .line 119
    .line 120
    iget-wide v12, v15, La/ixu;->q:J

    .line 121
    .line 122
    move-wide/from16 v16, v12

    .line 123
    .line 124
    iget-wide v11, v15, La/ixu;->i:D

    .line 125
    .line 126
    iget-object v10, v15, La/ixu;->o:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v10, La/qvo0;

    .line 129
    .line 130
    iget-object v13, v15, La/ixu;->n:La/hru;

    .line 131
    .line 132
    invoke-static {v4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    move-wide/from16 v27, v8

    .line 136
    .line 137
    move-object v9, v5

    .line 138
    move-wide v5, v6

    .line 139
    move-object v8, v10

    .line 140
    move-object v7, v13

    .line 141
    move-wide/from16 v29, v16

    .line 142
    .line 143
    move-wide/from16 v16, v1

    .line 144
    .line 145
    move-wide v0, v11

    .line 146
    move-wide/from16 v12, v29

    .line 147
    .line 148
    move-wide/from16 v10, v27

    .line 149
    .line 150
    goto/16 :goto_e

    .line 151
    .line 152
    :cond_4
    iget-wide v1, v15, La/ixu;->j:D

    .line 153
    .line 154
    iget-boolean v3, v15, La/ixu;->s:Z

    .line 155
    .line 156
    iget-wide v10, v15, La/ixu;->q:J

    .line 157
    .line 158
    iget-wide v12, v15, La/ixu;->i:D

    .line 159
    .line 160
    iget-object v6, v15, La/ixu;->p:La/kxu;

    .line 161
    .line 162
    iget-object v14, v15, La/ixu;->o:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v14, La/kxu;

    .line 165
    .line 166
    iget-object v7, v15, La/ixu;->n:La/hru;

    .line 167
    .line 168
    iget-object v8, v15, La/ixu;->m:La/ozc;

    .line 169
    .line 170
    iget-object v9, v15, La/ixu;->l:La/q4f;

    .line 171
    .line 172
    invoke-static {v4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    goto/16 :goto_6

    .line 176
    .line 177
    :cond_5
    invoke-static {v4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    iget-object v4, v0, La/kxu;->d:La/j9c;

    .line 181
    .line 182
    invoke-virtual {v4}, La/j9c;->c()La/cit0;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    iget-boolean v4, v4, La/cit0;->f0:Z

    .line 187
    .line 188
    if-eqz v4, :cond_6

    .line 189
    .line 190
    sget-object v4, La/q4f;->c:La/q4f;

    .line 191
    .line 192
    if-ne v3, v4, :cond_6

    .line 193
    .line 194
    move v4, v10

    .line 195
    goto :goto_2

    .line 196
    :cond_6
    const/4 v4, 0x0

    .line 197
    :goto_2
    if-eqz v4, :cond_7

    .line 198
    .line 199
    move-wide/from16 v6, v16

    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_7
    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    .line 203
    .line 204
    :goto_3
    mul-double/2addr v6, v1

    .line 205
    iput-object v3, v15, La/ixu;->l:La/q4f;

    .line 206
    .line 207
    move-object/from16 v8, p7

    .line 208
    .line 209
    iput-object v8, v15, La/ixu;->m:La/ozc;

    .line 210
    .line 211
    iget-object v9, v0, La/kxu;->a:La/hru;

    .line 212
    .line 213
    iput-object v9, v15, La/ixu;->n:La/hru;

    .line 214
    .line 215
    iput-object v0, v15, La/ixu;->o:Ljava/lang/Object;

    .line 216
    .line 217
    iput-object v0, v15, La/ixu;->p:La/kxu;

    .line 218
    .line 219
    iput-wide v1, v15, La/ixu;->i:D

    .line 220
    .line 221
    move-wide/from16 v11, p4

    .line 222
    .line 223
    iput-wide v11, v15, La/ixu;->q:J

    .line 224
    .line 225
    iput-boolean v4, v15, La/ixu;->s:Z

    .line 226
    .line 227
    iput-wide v6, v15, La/ixu;->j:D

    .line 228
    .line 229
    iput v10, v15, La/ixu;->w:I

    .line 230
    .line 231
    sget-object v21, La/q4f;->f:La/q4f;

    .line 232
    .line 233
    sget-object v22, La/q4f;->g:La/q4f;

    .line 234
    .line 235
    sget-object v23, La/q4f;->j:La/q4f;

    .line 236
    .line 237
    sget-object v24, La/q4f;->k:La/q4f;

    .line 238
    .line 239
    sget-object v25, La/q4f;->m:La/q4f;

    .line 240
    .line 241
    sget-object v26, La/q4f;->h:La/q4f;

    .line 242
    .line 243
    filled-new-array/range {v21 .. v26}, [La/q4f;

    .line 244
    .line 245
    .line 246
    move-result-object v10

    .line 247
    invoke-static {v10}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 248
    .line 249
    .line 250
    move-result-object v10

    .line 251
    invoke-interface {v10, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v10

    .line 255
    if-nez v10, :cond_a

    .line 256
    .line 257
    if-eqz p6, :cond_8

    .line 258
    .line 259
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Double;->doubleValue()D

    .line 260
    .line 261
    .line 262
    move-result-wide v13

    .line 263
    goto :goto_4

    .line 264
    :cond_8
    iget-object v10, v0, La/kxu;->c:La/hsj;

    .line 265
    .line 266
    invoke-virtual {v10}, La/hsj;->i()D

    .line 267
    .line 268
    .line 269
    move-result-wide v13

    .line 270
    :goto_4
    iget-object v10, v0, La/kxu;->b:La/gs;

    .line 271
    .line 272
    iget-object v1, v10, La/gs;->a:La/g45;

    .line 273
    .line 274
    iget-object v1, v1, La/g45;->c:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v1, La/ave;

    .line 277
    .line 278
    iget-object v1, v1, La/ave;->a:La/q4f;

    .line 279
    .line 280
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    const/4 v2, 0x3

    .line 285
    if-eq v1, v2, :cond_9

    .line 286
    .line 287
    const/4 v2, 0x5

    .line 288
    if-eq v1, v2, :cond_9

    .line 289
    .line 290
    new-instance v1, Ljava/lang/Double;

    .line 291
    .line 292
    invoke-direct {v1, v13, v14}, Ljava/lang/Double;-><init>(D)V

    .line 293
    .line 294
    .line 295
    goto :goto_5

    .line 296
    :cond_9
    invoke-virtual {v10, v13, v14, v15}, La/gs;->a(DLa/zje;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    goto :goto_5

    .line 301
    :cond_a
    new-instance v1, Ljava/lang/Double;

    .line 302
    .line 303
    const-wide/16 v13, 0x0

    .line 304
    .line 305
    invoke-direct {v1, v13, v14}, Ljava/lang/Double;-><init>(D)V

    .line 306
    .line 307
    .line 308
    :goto_5
    if-ne v1, v5, :cond_b

    .line 309
    .line 310
    move-object v0, v5

    .line 311
    goto/16 :goto_10

    .line 312
    .line 313
    :cond_b
    move v10, v4

    .line 314
    move-object v4, v1

    .line 315
    move-wide v1, v6

    .line 316
    move-object v7, v9

    .line 317
    move-object v9, v3

    .line 318
    move v3, v10

    .line 319
    move-object v6, v0

    .line 320
    move-object v14, v6

    .line 321
    move-wide v10, v11

    .line 322
    move-wide/from16 v12, p1

    .line 323
    .line 324
    :goto_6
    check-cast v4, Ljava/lang/Number;

    .line 325
    .line 326
    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    .line 327
    .line 328
    .line 329
    move-result-wide v21

    .line 330
    if-eqz v3, :cond_d

    .line 331
    .line 332
    iget-object v4, v6, La/kxu;->d:La/j9c;

    .line 333
    .line 334
    invoke-virtual {v4}, La/j9c;->c()La/cit0;

    .line 335
    .line 336
    .line 337
    move-result-object v4

    .line 338
    move-object/from16 v23, v5

    .line 339
    .line 340
    iget-wide v4, v4, La/cit0;->e0:D

    .line 341
    .line 342
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 343
    .line 344
    .line 345
    move-result-object v6

    .line 346
    const-wide/16 v19, 0x0

    .line 347
    .line 348
    cmpg-double v4, v4, v19

    .line 349
    .line 350
    if-nez v4, :cond_c

    .line 351
    .line 352
    const/4 v6, 0x0

    .line 353
    :cond_c
    if-eqz v6, :cond_e

    .line 354
    .line 355
    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    .line 356
    .line 357
    .line 358
    move-result-wide v21

    .line 359
    goto :goto_7

    .line 360
    :cond_d
    move-object/from16 v23, v5

    .line 361
    .line 362
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    :cond_e
    :goto_7
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    if-eqz v3, :cond_f

    .line 369
    .line 370
    div-double v21, v21, v16

    .line 371
    .line 372
    :cond_f
    move-wide/from16 v4, v21

    .line 373
    .line 374
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 375
    .line 376
    .line 377
    move-result v6

    .line 378
    const/4 v9, 0x3

    .line 379
    if-eq v6, v9, :cond_11

    .line 380
    .line 381
    const/4 v9, 0x5

    .line 382
    if-eq v6, v9, :cond_11

    .line 383
    .line 384
    sget-object v6, La/qvo0;->b:La/qvo0;

    .line 385
    .line 386
    :cond_10
    :goto_8
    const/4 v8, 0x0

    .line 387
    goto :goto_c

    .line 388
    :cond_11
    sget-object v6, La/qvo0;->d:La/c0o;

    .line 389
    .line 390
    invoke-static {v6, v6}, La/ohs0;->h(La/c0o;La/c0o;)La/y2;

    .line 391
    .line 392
    .line 393
    move-result-object v6

    .line 394
    :goto_9
    invoke-virtual {v6}, La/y2;->hasNext()Z

    .line 395
    .line 396
    .line 397
    move-result v9

    .line 398
    if-eqz v9, :cond_14

    .line 399
    .line 400
    invoke-virtual {v6}, La/y2;->next()Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v9

    .line 404
    move-object v14, v9

    .line 405
    check-cast v14, La/qvo0;

    .line 406
    .line 407
    move-object/from16 p1, v6

    .line 408
    .line 409
    iget-byte v6, v8, La/ozc;->a:B

    .line 410
    .line 411
    iget-object v14, v14, La/qvo0;->a:Ljava/lang/Integer;

    .line 412
    .line 413
    if-nez v14, :cond_12

    .line 414
    .line 415
    goto :goto_a

    .line 416
    :cond_12
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 417
    .line 418
    .line 419
    move-result v14

    .line 420
    if-ne v6, v14, :cond_13

    .line 421
    .line 422
    goto :goto_b

    .line 423
    :cond_13
    :goto_a
    move-object/from16 v6, p1

    .line 424
    .line 425
    goto :goto_9

    .line 426
    :cond_14
    const/4 v9, 0x0

    .line 427
    :goto_b
    move-object v6, v9

    .line 428
    check-cast v6, La/qvo0;

    .line 429
    .line 430
    if-nez v6, :cond_10

    .line 431
    .line 432
    sget-object v6, La/qvo0;->b:La/qvo0;

    .line 433
    .line 434
    goto :goto_8

    .line 435
    :goto_c
    iput-object v8, v15, La/ixu;->l:La/q4f;

    .line 436
    .line 437
    iput-object v8, v15, La/ixu;->m:La/ozc;

    .line 438
    .line 439
    iput-object v7, v15, La/ixu;->n:La/hru;

    .line 440
    .line 441
    iput-object v6, v15, La/ixu;->o:Ljava/lang/Object;

    .line 442
    .line 443
    iput-object v8, v15, La/ixu;->p:La/kxu;

    .line 444
    .line 445
    iput-wide v12, v15, La/ixu;->i:D

    .line 446
    .line 447
    iput-wide v10, v15, La/ixu;->q:J

    .line 448
    .line 449
    iput-boolean v3, v15, La/ixu;->s:Z

    .line 450
    .line 451
    iput-wide v1, v15, La/ixu;->j:D

    .line 452
    .line 453
    iput-wide v4, v15, La/ixu;->k:D

    .line 454
    .line 455
    iput-wide v10, v15, La/ixu;->r:J

    .line 456
    .line 457
    const/4 v8, 0x2

    .line 458
    iput v8, v15, La/ixu;->w:I

    .line 459
    .line 460
    iget-object v8, v0, La/kxu;->e:La/pmi;

    .line 461
    .line 462
    invoke-virtual {v8, v15}, La/pmi;->x(La/yje;)Ljava/io/Serializable;

    .line 463
    .line 464
    .line 465
    move-result-object v8

    .line 466
    move-object/from16 v9, v23

    .line 467
    .line 468
    if-ne v8, v9, :cond_15

    .line 469
    .line 470
    :goto_d
    move-object v0, v9

    .line 471
    goto/16 :goto_10

    .line 472
    .line 473
    :cond_15
    move-object/from16 v16, v8

    .line 474
    .line 475
    move-object v8, v6

    .line 476
    move-wide v5, v4

    .line 477
    move-object/from16 v4, v16

    .line 478
    .line 479
    move-wide/from16 v16, v10

    .line 480
    .line 481
    move-wide v10, v1

    .line 482
    move-wide v0, v12

    .line 483
    move-wide/from16 v12, v16

    .line 484
    .line 485
    :goto_e
    check-cast v4, Ljava/lang/Number;

    .line 486
    .line 487
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 488
    .line 489
    .line 490
    move-result v2

    .line 491
    const/4 v4, 0x0

    .line 492
    iput-object v4, v15, La/ixu;->l:La/q4f;

    .line 493
    .line 494
    iput-object v4, v15, La/ixu;->m:La/ozc;

    .line 495
    .line 496
    iput-object v7, v15, La/ixu;->n:La/hru;

    .line 497
    .line 498
    iput-object v8, v15, La/ixu;->o:Ljava/lang/Object;

    .line 499
    .line 500
    iput-wide v0, v15, La/ixu;->i:D

    .line 501
    .line 502
    iput-wide v12, v15, La/ixu;->q:J

    .line 503
    .line 504
    iput-boolean v3, v15, La/ixu;->s:Z

    .line 505
    .line 506
    iput-wide v10, v15, La/ixu;->j:D

    .line 507
    .line 508
    iput-wide v5, v15, La/ixu;->k:D

    .line 509
    .line 510
    move-wide/from16 v18, v0

    .line 511
    .line 512
    move-wide/from16 v0, v16

    .line 513
    .line 514
    iput-wide v0, v15, La/ixu;->r:J

    .line 515
    .line 516
    iput v2, v15, La/ixu;->t:I

    .line 517
    .line 518
    const/4 v4, 0x3

    .line 519
    iput v4, v15, La/ixu;->w:I

    .line 520
    .line 521
    move-object/from16 v4, p0

    .line 522
    .line 523
    iget-object v4, v4, La/kxu;->f:La/rou;

    .line 524
    .line 525
    const/4 v14, 0x0

    .line 526
    invoke-virtual {v4, v14, v15}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v4

    .line 530
    if-ne v4, v9, :cond_16

    .line 531
    .line 532
    goto :goto_d

    .line 533
    :cond_16
    move-wide/from16 v27, v12

    .line 534
    .line 535
    move-wide v13, v0

    .line 536
    move-wide/from16 v0, v27

    .line 537
    .line 538
    move-object/from16 p0, v4

    .line 539
    .line 540
    move-object/from16 v16, v8

    .line 541
    .line 542
    move-object/from16 v23, v9

    .line 543
    .line 544
    move-wide/from16 v27, v10

    .line 545
    .line 546
    move v11, v2

    .line 547
    move-wide v9, v5

    .line 548
    move-object v6, v7

    .line 549
    move-wide/from16 v7, v27

    .line 550
    .line 551
    move-wide/from16 v4, v18

    .line 552
    .line 553
    :goto_f
    move-object/from16 v2, p0

    .line 554
    .line 555
    check-cast v2, La/m2c0;

    .line 556
    .line 557
    iget v12, v2, La/m2c0;->F:I

    .line 558
    .line 559
    const/4 v2, 0x0

    .line 560
    iput-object v2, v15, La/ixu;->l:La/q4f;

    .line 561
    .line 562
    iput-object v2, v15, La/ixu;->m:La/ozc;

    .line 563
    .line 564
    iput-object v2, v15, La/ixu;->n:La/hru;

    .line 565
    .line 566
    iput-object v2, v15, La/ixu;->o:Ljava/lang/Object;

    .line 567
    .line 568
    iput-wide v4, v15, La/ixu;->i:D

    .line 569
    .line 570
    iput-wide v0, v15, La/ixu;->q:J

    .line 571
    .line 572
    iput-boolean v3, v15, La/ixu;->s:Z

    .line 573
    .line 574
    const/4 v0, 0x4

    .line 575
    iput v0, v15, La/ixu;->w:I

    .line 576
    .line 577
    move-object/from16 v0, v23

    .line 578
    .line 579
    invoke-virtual/range {v6 .. v16}, La/hru;->c(DDIIJLa/zje;La/qvo0;)Ljava/io/Serializable;

    .line 580
    .line 581
    .line 582
    move-result-object v1

    .line 583
    if-ne v1, v0, :cond_17

    .line 584
    .line 585
    :goto_10
    return-object v0

    .line 586
    :cond_17
    return-object v1
.end method
