.class public final La/m4h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ehf0;


# direct methods
.method public constructor <init>(La/ehf0;La/qud;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/m4h;->a:La/ehf0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p4

    .line 4
    .line 5
    instance-of v2, v0, La/l4h;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, La/l4h;

    .line 11
    .line 12
    iget v3, v2, La/l4h;->t:I

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
    iput v3, v2, La/l4h;->t:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/l4h;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, La/l4h;-><init>(La/m4h;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, La/l4h;->r:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/l4h;->t:I

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
    iget v4, v2, La/l4h;->q:I

    .line 47
    .line 48
    iget v10, v2, La/l4h;->p:I

    .line 49
    .line 50
    iget v11, v2, La/l4h;->o:I

    .line 51
    .line 52
    iget-wide v12, v2, La/l4h;->n:J

    .line 53
    .line 54
    iget-wide v14, v2, La/l4h;->m:J

    .line 55
    .line 56
    const/16 p4, 0x0

    .line 57
    .line 58
    iget-object v7, v2, La/l4h;->l:Ljava/lang/Throwable;

    .line 59
    .line 60
    iget-object v8, v2, La/l4h;->k:Ljava/lang/String;

    .line 61
    .line 62
    iget-object v5, v2, La/l4h;->j:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v6, v2, La/l4h;->i:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move-object v0, v6

    .line 70
    move-object v6, v2

    .line 71
    move-object v2, v0

    .line 72
    move v0, v4

    .line 73
    move-object v4, v5

    .line 74
    move-object v5, v8

    .line 75
    move v8, v11

    .line 76
    const/4 v1, 0x3

    .line 77
    move-wide/from16 v29, v12

    .line 78
    .line 79
    move-object v12, v7

    .line 80
    move v7, v10

    .line 81
    move-wide/from16 v10, v29

    .line 82
    .line 83
    move-wide v13, v14

    .line 84
    const/4 v15, 0x2

    .line 85
    goto/16 :goto_9

    .line 86
    .line 87
    :cond_1
    const/16 p4, 0x0

    .line 88
    .line 89
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 90
    .line 91
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-object p4

    .line 95
    :cond_2
    const/16 p4, 0x0

    .line 96
    .line 97
    iget v4, v2, La/l4h;->q:I

    .line 98
    .line 99
    iget v5, v2, La/l4h;->p:I

    .line 100
    .line 101
    iget v6, v2, La/l4h;->o:I

    .line 102
    .line 103
    iget-wide v7, v2, La/l4h;->n:J

    .line 104
    .line 105
    iget-wide v10, v2, La/l4h;->m:J

    .line 106
    .line 107
    iget-object v12, v2, La/l4h;->l:Ljava/lang/Throwable;

    .line 108
    .line 109
    iget-object v13, v2, La/l4h;->k:Ljava/lang/String;

    .line 110
    .line 111
    iget-object v14, v2, La/l4h;->j:Ljava/lang/String;

    .line 112
    .line 113
    iget-object v15, v2, La/l4h;->i:Ljava/lang/String;

    .line 114
    .line 115
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    move v0, v4

    .line 119
    move-object v4, v14

    .line 120
    move/from16 v29, v6

    .line 121
    .line 122
    move-object v6, v2

    .line 123
    move-object v2, v15

    .line 124
    const/4 v15, 0x2

    .line 125
    move-wide/from16 v30, v7

    .line 126
    .line 127
    move v7, v5

    .line 128
    move/from16 v8, v29

    .line 129
    .line 130
    move-object v5, v13

    .line 131
    move-wide v13, v10

    .line 132
    move-wide/from16 v10, v30

    .line 133
    .line 134
    goto/16 :goto_6

    .line 135
    .line 136
    :cond_3
    const/16 p4, 0x0

    .line 137
    .line 138
    iget v4, v2, La/l4h;->p:I

    .line 139
    .line 140
    iget v5, v2, La/l4h;->o:I

    .line 141
    .line 142
    iget-wide v6, v2, La/l4h;->n:J

    .line 143
    .line 144
    iget-wide v10, v2, La/l4h;->m:J

    .line 145
    .line 146
    iget-object v8, v2, La/l4h;->l:Ljava/lang/Throwable;

    .line 147
    .line 148
    iget-object v12, v2, La/l4h;->k:Ljava/lang/String;

    .line 149
    .line 150
    iget-object v13, v2, La/l4h;->j:Ljava/lang/String;

    .line 151
    .line 152
    iget-object v14, v2, La/l4h;->i:Ljava/lang/String;

    .line 153
    .line 154
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 155
    .line 156
    .line 157
    goto/16 :goto_2

    .line 158
    .line 159
    :catchall_0
    move-exception v0

    .line 160
    move-object/from16 v29, v8

    .line 161
    .line 162
    move v8, v5

    .line 163
    move-object v5, v12

    .line 164
    move-object/from16 v12, v29

    .line 165
    .line 166
    move-wide/from16 v29, v6

    .line 167
    .line 168
    move-object v6, v2

    .line 169
    move v7, v4

    .line 170
    move-object v4, v13

    .line 171
    move-object v2, v14

    .line 172
    move-wide v13, v10

    .line 173
    move-wide/from16 v10, v29

    .line 174
    .line 175
    goto/16 :goto_4

    .line 176
    .line 177
    :cond_4
    const/16 p4, 0x0

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
    move-object/from16 v12, p4

    .line 187
    .line 188
    move-wide v10, v4

    .line 189
    move-wide v13, v6

    .line 190
    move v0, v9

    .line 191
    const/4 v7, 0x0

    .line 192
    const/4 v8, 0x0

    .line 193
    move-object/from16 v4, p2

    .line 194
    .line 195
    move-object/from16 v5, p3

    .line 196
    .line 197
    move-object v6, v2

    .line 198
    move-object/from16 v2, p1

    .line 199
    .line 200
    :goto_1
    if-eqz v0, :cond_10

    .line 201
    .line 202
    :try_start_1
    iget-object v15, v1, La/m4h;->a:La/ehf0;

    .line 203
    .line 204
    iput-object v2, v6, La/l4h;->i:Ljava/lang/String;

    .line 205
    .line 206
    iput-object v4, v6, La/l4h;->j:Ljava/lang/String;

    .line 207
    .line 208
    iput-object v5, v6, La/l4h;->k:Ljava/lang/String;

    .line 209
    .line 210
    iput-object v12, v6, La/l4h;->l:Ljava/lang/Throwable;

    .line 211
    .line 212
    iput-wide v13, v6, La/l4h;->m:J

    .line 213
    .line 214
    iput-wide v10, v6, La/l4h;->n:J

    .line 215
    .line 216
    iput v8, v6, La/l4h;->o:I

    .line 217
    .line 218
    iput v7, v6, La/l4h;->p:I

    .line 219
    .line 220
    iput v0, v6, La/l4h;->q:I

    .line 221
    .line 222
    iput v9, v6, La/l4h;->t:I

    .line 223
    .line 224
    invoke-virtual {v15, v2, v4, v5, v6}, La/ehf0;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 228
    if-ne v0, v3, :cond_5

    .line 229
    .line 230
    goto/16 :goto_8

    .line 231
    .line 232
    :cond_5
    move-object/from16 v29, v12

    .line 233
    .line 234
    move-object v12, v5

    .line 235
    move v5, v8

    .line 236
    move-object/from16 v8, v29

    .line 237
    .line 238
    move-wide/from16 v29, v13

    .line 239
    .line 240
    move-object v14, v2

    .line 241
    move-object v13, v4

    .line 242
    move-object v2, v6

    .line 243
    move v4, v7

    .line 244
    move-wide v6, v10

    .line 245
    move-wide/from16 v10, v29

    .line 246
    .line 247
    :goto_2
    :try_start_2
    check-cast v0, Ljava/util/List;

    .line 248
    .line 249
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    check-cast v0, La/q510;

    .line 254
    .line 255
    if-eqz v0, :cond_6

    .line 256
    .line 257
    invoke-static {v0}, La/zdx;->K(La/q510;)La/q310;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    goto :goto_3

    .line 262
    :cond_6
    new-instance v16, La/q310;

    .line 263
    .line 264
    new-instance v17, La/r510;

    .line 265
    .line 266
    const-string v21, ""

    .line 267
    .line 268
    const-string v22, ""

    .line 269
    .line 270
    const/16 v18, -0x1

    .line 271
    .line 272
    const-wide/16 v19, -0x1

    .line 273
    .line 274
    invoke-direct/range {v17 .. v22}, La/r510;-><init>(IJLjava/lang/String;Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    new-instance v18, La/r510;

    .line 278
    .line 279
    const-string v22, ""

    .line 280
    .line 281
    const-string v23, ""

    .line 282
    .line 283
    const/16 v19, -0x1

    .line 284
    .line 285
    const-wide/16 v20, -0x1

    .line 286
    .line 287
    invoke-direct/range {v18 .. v23}, La/r510;-><init>(IJLjava/lang/String;Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    const-string v22, ""

    .line 291
    .line 292
    const-string v25, ""

    .line 293
    .line 294
    sget-object v28, La/iun;->a:La/iun;

    .line 295
    .line 296
    move-object/from16 v20, v17

    .line 297
    .line 298
    const/16 v17, -0x1

    .line 299
    .line 300
    move-object/from16 v21, v18

    .line 301
    .line 302
    const-wide/16 v18, -0x1

    .line 303
    .line 304
    const/16 v23, -0x1

    .line 305
    .line 306
    const/16 v24, -0x1

    .line 307
    .line 308
    const-wide/16 v26, -0x1

    .line 309
    .line 310
    invoke-direct/range {v16 .. v28}, La/q310;-><init>(IJLa/r510;La/r510;Ljava/lang/String;IILjava/lang/String;JLjava/util/List;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 311
    .line 312
    .line 313
    move-object/from16 v0, v16

    .line 314
    .line 315
    :goto_3
    return-object v0

    .line 316
    :catchall_1
    move-exception v0

    .line 317
    :goto_4
    invoke-static {v0}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 318
    .line 319
    .line 320
    move-result v15

    .line 321
    if-eqz v15, :cond_b

    .line 322
    .line 323
    if-nez v8, :cond_7

    .line 324
    .line 325
    new-instance v12, La/el50;

    .line 326
    .line 327
    invoke-direct {v12, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 328
    .line 329
    .line 330
    const/4 v0, 0x0

    .line 331
    goto/16 :goto_1

    .line 332
    .line 333
    :cond_7
    move-wide/from16 v16, v10

    .line 334
    .line 335
    int-to-long v9, v7

    .line 336
    cmp-long v9, v9, v13

    .line 337
    .line 338
    if-gez v9, :cond_8

    .line 339
    .line 340
    const/4 v9, 0x1

    .line 341
    goto :goto_5

    .line 342
    :cond_8
    const/4 v9, 0x0

    .line 343
    :goto_5
    add-int/lit8 v7, v7, 0x1

    .line 344
    .line 345
    if-eqz v9, :cond_9

    .line 346
    .line 347
    iput-object v2, v6, La/l4h;->i:Ljava/lang/String;

    .line 348
    .line 349
    iput-object v4, v6, La/l4h;->j:Ljava/lang/String;

    .line 350
    .line 351
    iput-object v5, v6, La/l4h;->k:Ljava/lang/String;

    .line 352
    .line 353
    iput-object v12, v6, La/l4h;->l:Ljava/lang/Throwable;

    .line 354
    .line 355
    iput-wide v13, v6, La/l4h;->m:J

    .line 356
    .line 357
    move-wide/from16 v10, v16

    .line 358
    .line 359
    iput-wide v10, v6, La/l4h;->n:J

    .line 360
    .line 361
    iput v8, v6, La/l4h;->o:I

    .line 362
    .line 363
    iput v7, v6, La/l4h;->p:I

    .line 364
    .line 365
    iput v9, v6, La/l4h;->q:I

    .line 366
    .line 367
    const/4 v15, 0x2

    .line 368
    iput v15, v6, La/l4h;->t:I

    .line 369
    .line 370
    invoke-static {v10, v11, v6}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    if-ne v0, v3, :cond_a

    .line 375
    .line 376
    goto :goto_8

    .line 377
    :goto_6
    const/4 v9, 0x1

    .line 378
    goto/16 :goto_1

    .line 379
    .line 380
    :cond_9
    move-wide/from16 v10, v16

    .line 381
    .line 382
    const/4 v15, 0x2

    .line 383
    new-instance v12, La/el50;

    .line 384
    .line 385
    invoke-direct {v12, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 386
    .line 387
    .line 388
    :cond_a
    move v0, v9

    .line 389
    goto :goto_6

    .line 390
    :cond_b
    const/4 v15, 0x2

    .line 391
    invoke-static {v0}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 392
    .line 393
    .line 394
    move-result v9

    .line 395
    if-eqz v9, :cond_f

    .line 396
    .line 397
    move-object/from16 p2, v0

    .line 398
    .line 399
    int-to-long v0, v7

    .line 400
    cmp-long v0, v0, v13

    .line 401
    .line 402
    if-gez v0, :cond_c

    .line 403
    .line 404
    const/4 v0, 0x1

    .line 405
    goto :goto_7

    .line 406
    :cond_c
    const/4 v0, 0x0

    .line 407
    :goto_7
    add-int/lit8 v7, v7, 0x1

    .line 408
    .line 409
    if-eqz v0, :cond_e

    .line 410
    .line 411
    iput-object v2, v6, La/l4h;->i:Ljava/lang/String;

    .line 412
    .line 413
    iput-object v4, v6, La/l4h;->j:Ljava/lang/String;

    .line 414
    .line 415
    iput-object v5, v6, La/l4h;->k:Ljava/lang/String;

    .line 416
    .line 417
    iput-object v12, v6, La/l4h;->l:Ljava/lang/Throwable;

    .line 418
    .line 419
    iput-wide v13, v6, La/l4h;->m:J

    .line 420
    .line 421
    iput-wide v10, v6, La/l4h;->n:J

    .line 422
    .line 423
    iput v8, v6, La/l4h;->o:I

    .line 424
    .line 425
    iput v7, v6, La/l4h;->p:I

    .line 426
    .line 427
    iput v0, v6, La/l4h;->q:I

    .line 428
    .line 429
    const/4 v1, 0x3

    .line 430
    iput v1, v6, La/l4h;->t:I

    .line 431
    .line 432
    invoke-static {v10, v11, v6}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v9

    .line 436
    if-ne v9, v3, :cond_d

    .line 437
    .line 438
    :goto_8
    return-object v3

    .line 439
    :cond_d
    :goto_9
    move-object/from16 v1, p0

    .line 440
    .line 441
    goto :goto_6

    .line 442
    :cond_e
    const/4 v1, 0x3

    .line 443
    new-instance v12, La/dag0;

    .line 444
    .line 445
    move-object/from16 v9, p2

    .line 446
    .line 447
    invoke-direct {v12, v9}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 448
    .line 449
    .line 450
    goto :goto_9

    .line 451
    :cond_f
    move-object v9, v0

    .line 452
    const/4 v1, 0x3

    .line 453
    invoke-static {v9}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 454
    .line 455
    .line 456
    const/4 v0, 0x0

    .line 457
    move-object/from16 v1, p0

    .line 458
    .line 459
    move-object v12, v9

    .line 460
    goto :goto_6

    .line 461
    :cond_10
    if-nez v12, :cond_11

    .line 462
    .line 463
    const-string v0, "Unexpected error"

    .line 464
    .line 465
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    return-object p4

    .line 469
    :cond_11
    throw v12
.end method
