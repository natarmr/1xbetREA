.class public final La/njg;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/qjg;

.field public final b:La/ojg;

.field public final c:La/knf0;


# direct methods
.method public constructor <init>(La/qjg;La/ojg;La/knf0;)V
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
    iput-object p1, p0, La/njg;->a:La/qjg;

    .line 11
    .line 12
    iput-object p2, p0, La/njg;->b:La/ojg;

    .line 13
    .line 14
    iput-object p3, p0, La/njg;->c:La/knf0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, La/njg;->b:La/ojg;

    .line 6
    .line 7
    iget-object v2, v2, La/ojg;->a:Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    instance-of v3, v1, La/mjg;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    move-object v3, v1

    .line 14
    check-cast v3, La/mjg;

    .line 15
    .line 16
    iget v4, v3, La/mjg;->t:I

    .line 17
    .line 18
    const/high16 v5, -0x80000000

    .line 19
    .line 20
    and-int v6, v4, v5

    .line 21
    .line 22
    if-eqz v6, :cond_0

    .line 23
    .line 24
    sub-int/2addr v4, v5

    .line 25
    iput v4, v3, La/mjg;->t:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v3, La/mjg;

    .line 29
    .line 30
    invoke-direct {v3, v0, v1}, La/mjg;-><init>(La/njg;La/zje;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v1, v3, La/mjg;->r:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v4, La/wne;->a:La/wne;

    .line 36
    .line 37
    iget v5, v3, La/mjg;->t:I

    .line 38
    .line 39
    const/4 v6, 0x3

    .line 40
    const/4 v7, 0x2

    .line 41
    const/4 v8, 0x0

    .line 42
    const/4 v10, 0x1

    .line 43
    if-eqz v5, :cond_4

    .line 44
    .line 45
    if-eq v5, v10, :cond_3

    .line 46
    .line 47
    if-eq v5, v7, :cond_2

    .line 48
    .line 49
    if-ne v5, v6, :cond_1

    .line 50
    .line 51
    iget v0, v3, La/mjg;->q:I

    .line 52
    .line 53
    iget v5, v3, La/mjg;->p:I

    .line 54
    .line 55
    iget v8, v3, La/mjg;->o:I

    .line 56
    .line 57
    iget-wide v11, v3, La/mjg;->n:J

    .line 58
    .line 59
    iget-wide v13, v3, La/mjg;->m:J

    .line 60
    .line 61
    iget-object v15, v3, La/mjg;->l:Ljava/lang/Throwable;

    .line 62
    .line 63
    iget-object v9, v3, La/mjg;->k:La/mjg;

    .line 64
    .line 65
    iget-object v6, v3, La/mjg;->j:La/njg;

    .line 66
    .line 67
    iget-object v7, v3, La/mjg;->i:Ljava/lang/String;

    .line 68
    .line 69
    :try_start_0
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    .line 72
    move v1, v5

    .line 73
    move-object v5, v3

    .line 74
    move-object v3, v7

    .line 75
    move v7, v1

    .line 76
    move-object v1, v6

    .line 77
    move-object v6, v9

    .line 78
    move-object v9, v15

    .line 79
    const/4 v15, 0x2

    .line 80
    goto/16 :goto_6

    .line 81
    .line 82
    :catchall_0
    move-exception v0

    .line 83
    move-object v3, v7

    .line 84
    goto/16 :goto_a

    .line 85
    .line 86
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 87
    .line 88
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-object v8

    .line 92
    :cond_2
    iget v0, v3, La/mjg;->q:I

    .line 93
    .line 94
    iget v5, v3, La/mjg;->p:I

    .line 95
    .line 96
    iget v6, v3, La/mjg;->o:I

    .line 97
    .line 98
    iget-wide v7, v3, La/mjg;->n:J

    .line 99
    .line 100
    iget-wide v11, v3, La/mjg;->m:J

    .line 101
    .line 102
    iget-object v9, v3, La/mjg;->l:Ljava/lang/Throwable;

    .line 103
    .line 104
    iget-object v13, v3, La/mjg;->k:La/mjg;

    .line 105
    .line 106
    iget-object v14, v3, La/mjg;->j:La/njg;

    .line 107
    .line 108
    iget-object v15, v3, La/mjg;->i:Ljava/lang/String;

    .line 109
    .line 110
    :try_start_1
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 111
    .line 112
    .line 113
    move-object v1, v14

    .line 114
    move/from16 v27, v5

    .line 115
    .line 116
    move-object v5, v3

    .line 117
    move-object v3, v15

    .line 118
    const/4 v15, 0x2

    .line 119
    move-wide/from16 v28, v7

    .line 120
    .line 121
    move/from16 v7, v27

    .line 122
    .line 123
    move v8, v6

    .line 124
    move-object v6, v13

    .line 125
    move-wide v13, v11

    .line 126
    move-wide/from16 v11, v28

    .line 127
    .line 128
    goto/16 :goto_6

    .line 129
    .line 130
    :catchall_1
    move-exception v0

    .line 131
    move-object v3, v15

    .line 132
    goto/16 :goto_a

    .line 133
    .line 134
    :cond_3
    iget v5, v3, La/mjg;->p:I

    .line 135
    .line 136
    iget v6, v3, La/mjg;->o:I

    .line 137
    .line 138
    iget-wide v7, v3, La/mjg;->n:J

    .line 139
    .line 140
    iget-wide v11, v3, La/mjg;->m:J

    .line 141
    .line 142
    iget-object v9, v3, La/mjg;->l:Ljava/lang/Throwable;

    .line 143
    .line 144
    iget-object v13, v3, La/mjg;->k:La/mjg;

    .line 145
    .line 146
    iget-object v14, v3, La/mjg;->j:La/njg;

    .line 147
    .line 148
    iget-object v15, v3, La/mjg;->i:Ljava/lang/String;

    .line 149
    .line 150
    :try_start_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 151
    .line 152
    .line 153
    goto/16 :goto_2

    .line 154
    .line 155
    :catchall_2
    move-exception v0

    .line 156
    move-object v1, v9

    .line 157
    move-object v9, v0

    .line 158
    move-object v0, v1

    .line 159
    move-object v1, v14

    .line 160
    move/from16 v27, v5

    .line 161
    .line 162
    move-object v5, v3

    .line 163
    move-object v3, v15

    .line 164
    move-wide/from16 v28, v7

    .line 165
    .line 166
    move/from16 v7, v27

    .line 167
    .line 168
    move v8, v6

    .line 169
    move-object v6, v13

    .line 170
    move-wide v13, v11

    .line 171
    move-wide/from16 v11, v28

    .line 172
    .line 173
    goto/16 :goto_4

    .line 174
    .line 175
    :cond_4
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    move-object/from16 v1, p1

    .line 182
    .line 183
    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    check-cast v5, La/ljg;

    .line 188
    .line 189
    if-nez v5, :cond_15

    .line 190
    .line 191
    :try_start_3
    sget-object v5, La/j0g0;->b:La/e0g0;

    .line 192
    .line 193
    sget-wide v5, La/cag0;->a:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_8

    .line 194
    .line 195
    const-wide/16 v11, 0x3

    .line 196
    .line 197
    move-object v9, v8

    .line 198
    move-wide v13, v11

    .line 199
    const/4 v7, 0x0

    .line 200
    const/4 v8, 0x0

    .line 201
    move-wide v11, v5

    .line 202
    move-object v5, v3

    .line 203
    move-object v6, v5

    .line 204
    move-object v3, v1

    .line 205
    move-object v1, v0

    .line 206
    move v0, v10

    .line 207
    :goto_1
    if-eqz v0, :cond_f

    .line 208
    .line 209
    :try_start_4
    iget-object v15, v1, La/njg;->a:La/qjg;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 210
    .line 211
    :try_start_5
    iget-object v10, v1, La/njg;->c:La/knf0;

    .line 212
    .line 213
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    iget-object v10, v1, La/njg;->c:La/knf0;

    .line 217
    .line 218
    invoke-virtual {v10}, La/knf0;->b()I

    .line 219
    .line 220
    .line 221
    move-result v21

    .line 222
    iget-object v10, v1, La/njg;->c:La/knf0;

    .line 223
    .line 224
    invoke-virtual {v10}, La/knf0;->c()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v22

    .line 228
    iput-object v3, v5, La/mjg;->i:Ljava/lang/String;

    .line 229
    .line 230
    iput-object v1, v5, La/mjg;->j:La/njg;

    .line 231
    .line 232
    iput-object v6, v5, La/mjg;->k:La/mjg;

    .line 233
    .line 234
    iput-object v9, v5, La/mjg;->l:Ljava/lang/Throwable;

    .line 235
    .line 236
    iput-wide v13, v5, La/mjg;->m:J

    .line 237
    .line 238
    iput-wide v11, v5, La/mjg;->n:J

    .line 239
    .line 240
    iput v8, v5, La/mjg;->o:I

    .line 241
    .line 242
    iput v7, v5, La/mjg;->p:I

    .line 243
    .line 244
    iput v0, v5, La/mjg;->q:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 245
    .line 246
    const/4 v10, 0x1

    .line 247
    :try_start_6
    iput v10, v5, La/mjg;->t:I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 248
    .line 249
    const/16 v20, 0x1

    .line 250
    .line 251
    move-object/from16 v19, v3

    .line 252
    .line 253
    move-object/from16 v23, v5

    .line 254
    .line 255
    move-object/from16 v18, v15

    .line 256
    .line 257
    :try_start_7
    invoke-virtual/range {v18 .. v23}, La/qjg;->a(Ljava/lang/String;IILjava/lang/String;La/zje;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 261
    if-ne v0, v4, :cond_5

    .line 262
    .line 263
    goto/16 :goto_9

    .line 264
    .line 265
    :cond_5
    move v5, v7

    .line 266
    move-object/from16 v15, v19

    .line 267
    .line 268
    move-object/from16 v3, v23

    .line 269
    .line 270
    move-object/from16 v27, v1

    .line 271
    .line 272
    move-object v1, v0

    .line 273
    move-wide/from16 v28, v13

    .line 274
    .line 275
    move-object/from16 v14, v27

    .line 276
    .line 277
    move-object v13, v6

    .line 278
    move v6, v8

    .line 279
    move-wide v7, v11

    .line 280
    move-wide/from16 v11, v28

    .line 281
    .line 282
    :goto_2
    :try_start_8
    check-cast v1, La/e2h;

    .line 283
    .line 284
    invoke-static {v1}, La/cjx;->a0(La/e2h;)La/ljg;

    .line 285
    .line 286
    .line 287
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 288
    :try_start_9
    sget-object v1, La/j0g0;->b:La/e0g0;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 289
    .line 290
    goto/16 :goto_b

    .line 291
    .line 292
    :catchall_3
    move-exception v0

    .line 293
    move-object v3, v9

    .line 294
    move-object v9, v0

    .line 295
    move-object v0, v3

    .line 296
    move-object/from16 v3, v19

    .line 297
    .line 298
    move-object/from16 v5, v23

    .line 299
    .line 300
    goto :goto_4

    .line 301
    :catchall_4
    move-exception v0

    .line 302
    move-object/from16 v19, v3

    .line 303
    .line 304
    move-object/from16 v23, v5

    .line 305
    .line 306
    :goto_3
    move-object v3, v9

    .line 307
    move-object v9, v0

    .line 308
    move-object v0, v3

    .line 309
    move-object/from16 v3, v19

    .line 310
    .line 311
    goto :goto_4

    .line 312
    :catchall_5
    move-exception v0

    .line 313
    move-object/from16 v19, v3

    .line 314
    .line 315
    move-object/from16 v23, v5

    .line 316
    .line 317
    const/4 v10, 0x1

    .line 318
    goto :goto_3

    .line 319
    :goto_4
    :try_start_a
    invoke-static {v9}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 320
    .line 321
    .line 322
    move-result v15

    .line 323
    if-eqz v15, :cond_a

    .line 324
    .line 325
    if-nez v8, :cond_6

    .line 326
    .line 327
    new-instance v0, La/el50;

    .line 328
    .line 329
    invoke-direct {v0, v9}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 330
    .line 331
    .line 332
    move-object v9, v0

    .line 333
    const/4 v0, 0x0

    .line 334
    goto :goto_1

    .line 335
    :catchall_6
    move-exception v0

    .line 336
    goto/16 :goto_a

    .line 337
    .line 338
    :cond_6
    move-wide/from16 v18, v11

    .line 339
    .line 340
    int-to-long v10, v7

    .line 341
    cmp-long v10, v10, v13

    .line 342
    .line 343
    if-gez v10, :cond_7

    .line 344
    .line 345
    const/4 v10, 0x1

    .line 346
    goto :goto_5

    .line 347
    :cond_7
    const/4 v10, 0x0

    .line 348
    :goto_5
    add-int/lit8 v7, v7, 0x1

    .line 349
    .line 350
    if-eqz v10, :cond_8

    .line 351
    .line 352
    iput-object v3, v5, La/mjg;->i:Ljava/lang/String;

    .line 353
    .line 354
    iput-object v1, v5, La/mjg;->j:La/njg;

    .line 355
    .line 356
    iput-object v6, v5, La/mjg;->k:La/mjg;

    .line 357
    .line 358
    iput-object v0, v5, La/mjg;->l:Ljava/lang/Throwable;

    .line 359
    .line 360
    iput-wide v13, v5, La/mjg;->m:J

    .line 361
    .line 362
    move-wide/from16 v11, v18

    .line 363
    .line 364
    iput-wide v11, v5, La/mjg;->n:J

    .line 365
    .line 366
    iput v8, v5, La/mjg;->o:I

    .line 367
    .line 368
    iput v7, v5, La/mjg;->p:I

    .line 369
    .line 370
    iput v10, v5, La/mjg;->q:I

    .line 371
    .line 372
    const/4 v15, 0x2

    .line 373
    iput v15, v5, La/mjg;->t:I

    .line 374
    .line 375
    invoke-static {v11, v12, v6}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v9

    .line 379
    if-ne v9, v4, :cond_9

    .line 380
    .line 381
    goto :goto_9

    .line 382
    :goto_6
    const/4 v10, 0x1

    .line 383
    goto/16 :goto_1

    .line 384
    .line 385
    :cond_8
    move-wide/from16 v11, v18

    .line 386
    .line 387
    const/4 v15, 0x2

    .line 388
    new-instance v0, La/el50;

    .line 389
    .line 390
    invoke-direct {v0, v9}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 391
    .line 392
    .line 393
    :cond_9
    :goto_7
    move-object v9, v0

    .line 394
    move v0, v10

    .line 395
    goto :goto_6

    .line 396
    :cond_a
    const/4 v15, 0x2

    .line 397
    invoke-static {v9}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 398
    .line 399
    .line 400
    move-result v10

    .line 401
    if-eqz v10, :cond_e

    .line 402
    .line 403
    move-object/from16 p0, v9

    .line 404
    .line 405
    int-to-long v9, v7

    .line 406
    cmp-long v9, v9, v13

    .line 407
    .line 408
    if-gez v9, :cond_b

    .line 409
    .line 410
    const/4 v9, 0x1

    .line 411
    goto :goto_8

    .line 412
    :cond_b
    const/4 v9, 0x0

    .line 413
    :goto_8
    add-int/lit8 v7, v7, 0x1

    .line 414
    .line 415
    if-eqz v9, :cond_d

    .line 416
    .line 417
    iput-object v3, v5, La/mjg;->i:Ljava/lang/String;

    .line 418
    .line 419
    iput-object v1, v5, La/mjg;->j:La/njg;

    .line 420
    .line 421
    iput-object v6, v5, La/mjg;->k:La/mjg;

    .line 422
    .line 423
    iput-object v0, v5, La/mjg;->l:Ljava/lang/Throwable;

    .line 424
    .line 425
    iput-wide v13, v5, La/mjg;->m:J

    .line 426
    .line 427
    iput-wide v11, v5, La/mjg;->n:J

    .line 428
    .line 429
    iput v8, v5, La/mjg;->o:I

    .line 430
    .line 431
    iput v7, v5, La/mjg;->p:I

    .line 432
    .line 433
    iput v9, v5, La/mjg;->q:I

    .line 434
    .line 435
    const/4 v10, 0x3

    .line 436
    iput v10, v5, La/mjg;->t:I

    .line 437
    .line 438
    invoke-static {v11, v12, v6}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v10

    .line 442
    if-ne v10, v4, :cond_c

    .line 443
    .line 444
    :goto_9
    return-object v4

    .line 445
    :cond_c
    move/from16 v27, v9

    .line 446
    .line 447
    move-object v9, v0

    .line 448
    move/from16 v0, v27

    .line 449
    .line 450
    goto :goto_6

    .line 451
    :cond_d
    new-instance v0, La/dag0;

    .line 452
    .line 453
    move-object/from16 v10, p0

    .line 454
    .line 455
    invoke-direct {v0, v10}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 456
    .line 457
    .line 458
    move v10, v9

    .line 459
    goto :goto_7

    .line 460
    :cond_e
    move-object v10, v9

    .line 461
    invoke-static {v10}, La/agc;->L(Ljava/lang/Throwable;)Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 462
    .line 463
    .line 464
    move-object v9, v10

    .line 465
    const/4 v0, 0x0

    .line 466
    goto :goto_6

    .line 467
    :cond_f
    move-object/from16 v19, v3

    .line 468
    .line 469
    if-nez v9, :cond_10

    .line 470
    .line 471
    :try_start_b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 472
    .line 473
    const-string v1, "Unexpected error"

    .line 474
    .line 475
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 476
    .line 477
    .line 478
    throw v0

    .line 479
    :catchall_7
    move-exception v0

    .line 480
    move-object/from16 v3, v19

    .line 481
    .line 482
    goto :goto_a

    .line 483
    :cond_10
    throw v9
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 484
    :catchall_8
    move-exception v0

    .line 485
    move-object v3, v1

    .line 486
    :goto_a
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 487
    .line 488
    new-instance v1, La/g0g0;

    .line 489
    .line 490
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 491
    .line 492
    .line 493
    move-object v0, v1

    .line 494
    move-object v15, v3

    .line 495
    :goto_b
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 496
    .line 497
    .line 498
    move-result-object v1

    .line 499
    if-nez v1, :cond_11

    .line 500
    .line 501
    goto :goto_c

    .line 502
    :cond_11
    instance-of v0, v1, Ljava/util/concurrent/CancellationException;

    .line 503
    .line 504
    if-nez v0, :cond_14

    .line 505
    .line 506
    instance-of v0, v1, La/el50;

    .line 507
    .line 508
    const-wide/16 v3, 0x0

    .line 509
    .line 510
    if-nez v0, :cond_13

    .line 511
    .line 512
    instance-of v0, v1, Ljava/net/ConnectException;

    .line 513
    .line 514
    if-nez v0, :cond_13

    .line 515
    .line 516
    instance-of v0, v1, Ljava/net/SocketException;

    .line 517
    .line 518
    if-nez v0, :cond_13

    .line 519
    .line 520
    instance-of v0, v1, Ljava/net/SocketTimeoutException;

    .line 521
    .line 522
    if-eqz v0, :cond_12

    .line 523
    .line 524
    goto :goto_d

    .line 525
    :cond_12
    new-instance v16, La/ljg;

    .line 526
    .line 527
    sget-object v17, La/iun;->a:La/iun;

    .line 528
    .line 529
    new-instance v18, La/f2h;

    .line 530
    .line 531
    const-string v9, ""

    .line 532
    .line 533
    const-string v10, ""

    .line 534
    .line 535
    const-wide/16 v6, 0x0

    .line 536
    .line 537
    const-string v8, ""

    .line 538
    .line 539
    move-object/from16 v5, v18

    .line 540
    .line 541
    invoke-direct/range {v5 .. v10}, La/f2h;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    new-instance v19, La/f2h;

    .line 545
    .line 546
    const-string v9, ""

    .line 547
    .line 548
    const-string v10, ""

    .line 549
    .line 550
    const-string v8, ""

    .line 551
    .line 552
    move-object/from16 v5, v19

    .line 553
    .line 554
    invoke-direct/range {v5 .. v10}, La/f2h;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    new-instance v20, La/v1h;

    .line 558
    .line 559
    const/4 v7, 0x0

    .line 560
    const/4 v8, 0x0

    .line 561
    const/4 v6, 0x0

    .line 562
    move-object/from16 v10, v17

    .line 563
    .line 564
    move-object/from16 v11, v17

    .line 565
    .line 566
    move-object/from16 v12, v17

    .line 567
    .line 568
    move-object/from16 v13, v17

    .line 569
    .line 570
    move-object/from16 v9, v17

    .line 571
    .line 572
    move-object/from16 v5, v20

    .line 573
    .line 574
    invoke-direct/range {v5 .. v13}, La/v1h;-><init>(IIILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 575
    .line 576
    .line 577
    new-instance v0, La/znq0;

    .line 578
    .line 579
    invoke-direct {v0, v3, v4}, La/znq0;-><init>(J)V

    .line 580
    .line 581
    .line 582
    const-string v24, ""

    .line 583
    .line 584
    const-wide/16 v25, 0x0

    .line 585
    .line 586
    const-string v23, ""

    .line 587
    .line 588
    move-object/from16 v21, v17

    .line 589
    .line 590
    move-object/from16 v22, v0

    .line 591
    .line 592
    invoke-direct/range {v16 .. v26}, La/ljg;-><init>(Ljava/util/List;La/f2h;La/f2h;La/v1h;Ljava/util/List;La/znq0;Ljava/lang/String;Ljava/lang/String;J)V

    .line 593
    .line 594
    .line 595
    move-object/from16 v0, v16

    .line 596
    .line 597
    :goto_c
    check-cast v0, La/ljg;

    .line 598
    .line 599
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 600
    .line 601
    .line 602
    invoke-interface {v2, v15}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    invoke-interface {v2, v15, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    return-object v0

    .line 609
    :cond_13
    :goto_d
    new-instance v0, La/ljg;

    .line 610
    .line 611
    sget-object v9, La/iun;->a:La/iun;

    .line 612
    .line 613
    new-instance v5, La/f2h;

    .line 614
    .line 615
    const-string v14, ""

    .line 616
    .line 617
    const-string v15, ""

    .line 618
    .line 619
    const-wide/16 v11, 0x0

    .line 620
    .line 621
    const-string v13, ""

    .line 622
    .line 623
    move-object v10, v5

    .line 624
    invoke-direct/range {v10 .. v15}, La/f2h;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 625
    .line 626
    .line 627
    move-object v1, v10

    .line 628
    new-instance v6, La/f2h;

    .line 629
    .line 630
    const-string v14, ""

    .line 631
    .line 632
    const-string v15, ""

    .line 633
    .line 634
    const-string v13, ""

    .line 635
    .line 636
    move-object v10, v6

    .line 637
    invoke-direct/range {v10 .. v15}, La/f2h;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 638
    .line 639
    .line 640
    move-object v2, v10

    .line 641
    new-instance v5, La/v1h;

    .line 642
    .line 643
    const/4 v7, 0x0

    .line 644
    const/4 v8, 0x0

    .line 645
    const/4 v6, 0x0

    .line 646
    move-object v10, v9

    .line 647
    move-object v11, v9

    .line 648
    move-object v12, v9

    .line 649
    move-object v13, v9

    .line 650
    invoke-direct/range {v5 .. v13}, La/v1h;-><init>(IIILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 651
    .line 652
    .line 653
    new-instance v6, La/znq0;

    .line 654
    .line 655
    invoke-direct {v6, v3, v4}, La/znq0;-><init>(J)V

    .line 656
    .line 657
    .line 658
    const-string v11, ""

    .line 659
    .line 660
    const-wide/16 v12, 0x0

    .line 661
    .line 662
    const-string v10, ""

    .line 663
    .line 664
    move-object v8, v9

    .line 665
    move-object v3, v0

    .line 666
    move-object v7, v5

    .line 667
    move-object v4, v9

    .line 668
    move-object v5, v1

    .line 669
    move-object v9, v6

    .line 670
    move-object v6, v2

    .line 671
    invoke-direct/range {v3 .. v13}, La/ljg;-><init>(Ljava/util/List;La/f2h;La/f2h;La/v1h;Ljava/util/List;La/znq0;Ljava/lang/String;Ljava/lang/String;J)V

    .line 672
    .line 673
    .line 674
    return-object v3

    .line 675
    :cond_14
    throw v1

    .line 676
    :cond_15
    return-object v5
.end method
