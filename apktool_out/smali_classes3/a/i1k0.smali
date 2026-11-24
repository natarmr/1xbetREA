.class public final La/i1k0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/i9u;

.field public final b:La/b3c;

.field public final c:La/sjl0;

.field public final d:La/q0u;


# direct methods
.method public constructor <init>(La/i9u;La/b3c;La/sjl0;La/q0u;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
    iput-object p1, p0, La/i1k0;->a:La/i9u;

    .line 11
    .line 12
    iput-object p2, p0, La/i1k0;->b:La/b3c;

    .line 13
    .line 14
    iput-object p3, p0, La/i1k0;->c:La/sjl0;

    .line 15
    .line 16
    iput-object p4, p0, La/i1k0;->d:La/q0u;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;La/zje;)Ljava/lang/Object;
    .locals 76

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    instance-of v2, v0, La/h1k0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, La/h1k0;

    .line 11
    .line 12
    iget v3, v2, La/h1k0;->u:I

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
    iput v3, v2, La/h1k0;->u:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/h1k0;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, La/h1k0;-><init>(La/i1k0;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, La/h1k0;->s:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/h1k0;->u:I

    .line 34
    .line 35
    const/4 v7, 0x3

    .line 36
    const/4 v8, 0x2

    .line 37
    const/4 v9, 0x0

    .line 38
    const/4 v10, 0x1

    .line 39
    const/4 v11, 0x0

    .line 40
    if-eqz v4, :cond_4

    .line 41
    .line 42
    if-eq v4, v10, :cond_3

    .line 43
    .line 44
    if-eq v4, v8, :cond_2

    .line 45
    .line 46
    if-ne v4, v7, :cond_1

    .line 47
    .line 48
    iget-boolean v4, v2, La/h1k0;->r:Z

    .line 49
    .line 50
    iget-boolean v12, v2, La/h1k0;->q:Z

    .line 51
    .line 52
    iget-object v13, v2, La/h1k0;->o:Ljava/util/Collection;

    .line 53
    .line 54
    check-cast v13, Ljava/util/Collection;

    .line 55
    .line 56
    iget-object v14, v2, La/h1k0;->n:La/j1k0;

    .line 57
    .line 58
    iget-object v15, v2, La/h1k0;->m:Ljava/util/Collection;

    .line 59
    .line 60
    check-cast v15, La/d0t;

    .line 61
    .line 62
    iget-object v15, v2, La/h1k0;->l:La/d0t;

    .line 63
    .line 64
    check-cast v15, Ljava/util/List;

    .line 65
    .line 66
    iget-object v15, v2, La/h1k0;->j:Ljava/util/Iterator;

    .line 67
    .line 68
    const-wide/16 v16, 0x28

    .line 69
    .line 70
    iget-object v5, v2, La/h1k0;->i:Ljava/util/Collection;

    .line 71
    .line 72
    check-cast v5, Ljava/util/Collection;

    .line 73
    .line 74
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    move-object v9, v11

    .line 78
    move-object v6, v15

    .line 79
    move v11, v7

    .line 80
    move v15, v8

    .line 81
    move-object v7, v14

    .line 82
    move v14, v10

    .line 83
    goto/16 :goto_e

    .line 84
    .line 85
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 86
    .line 87
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    return-object v11

    .line 91
    :cond_2
    const-wide/16 v16, 0x28

    .line 92
    .line 93
    iget v4, v2, La/h1k0;->p:I

    .line 94
    .line 95
    iget-object v5, v2, La/h1k0;->m:Ljava/util/Collection;

    .line 96
    .line 97
    check-cast v5, Ljava/util/Collection;

    .line 98
    .line 99
    iget-object v6, v2, La/h1k0;->l:La/d0t;

    .line 100
    .line 101
    iget-object v12, v2, La/h1k0;->k:La/j1k0;

    .line 102
    .line 103
    iget-object v13, v2, La/h1k0;->j:Ljava/util/Iterator;

    .line 104
    .line 105
    iget-object v14, v2, La/h1k0;->i:Ljava/util/Collection;

    .line 106
    .line 107
    check-cast v14, Ljava/util/Collection;

    .line 108
    .line 109
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    move v15, v8

    .line 113
    move-object v7, v13

    .line 114
    move-object v13, v5

    .line 115
    move-object v5, v14

    .line 116
    move v14, v10

    .line 117
    goto/16 :goto_a

    .line 118
    .line 119
    :cond_3
    const-wide/16 v16, 0x28

    .line 120
    .line 121
    iget-object v4, v2, La/h1k0;->m:Ljava/util/Collection;

    .line 122
    .line 123
    check-cast v4, Ljava/util/Collection;

    .line 124
    .line 125
    iget-object v5, v2, La/h1k0;->l:La/d0t;

    .line 126
    .line 127
    check-cast v5, La/i1k0;

    .line 128
    .line 129
    iget-object v5, v2, La/h1k0;->k:La/j1k0;

    .line 130
    .line 131
    iget-object v6, v2, La/h1k0;->j:Ljava/util/Iterator;

    .line 132
    .line 133
    iget-object v12, v2, La/h1k0;->i:Ljava/util/Collection;

    .line 134
    .line 135
    check-cast v12, Ljava/util/Collection;

    .line 136
    .line 137
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 138
    .line 139
    .line 140
    goto :goto_2

    .line 141
    :catchall_0
    move-exception v0

    .line 142
    goto :goto_3

    .line 143
    :cond_4
    const-wide/16 v16, 0x28

    .line 144
    .line 145
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    new-instance v0, Ljava/util/ArrayList;

    .line 149
    .line 150
    const/16 v4, 0xa

    .line 151
    .line 152
    move-object/from16 v5, p1

    .line 153
    .line 154
    invoke-static {v5, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 159
    .line 160
    .line 161
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    move-object v6, v4

    .line 166
    move-object v4, v0

    .line 167
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-eqz v0, :cond_11

    .line 172
    .line 173
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    move-object v5, v0

    .line 178
    check-cast v5, La/j1k0;

    .line 179
    .line 180
    iget-wide v12, v5, La/j1k0;->p:J

    .line 181
    .line 182
    cmp-long v0, v12, v16

    .line 183
    .line 184
    if-eqz v0, :cond_9

    .line 185
    .line 186
    :try_start_1
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 187
    .line 188
    iget-object v0, v1, La/i1k0;->c:La/sjl0;

    .line 189
    .line 190
    move-object v14, v4

    .line 191
    check-cast v14, Ljava/util/Collection;

    .line 192
    .line 193
    iput-object v14, v2, La/h1k0;->i:Ljava/util/Collection;

    .line 194
    .line 195
    iput-object v6, v2, La/h1k0;->j:Ljava/util/Iterator;

    .line 196
    .line 197
    iput-object v5, v2, La/h1k0;->k:La/j1k0;

    .line 198
    .line 199
    iput-object v11, v2, La/h1k0;->l:La/d0t;

    .line 200
    .line 201
    move-object v14, v4

    .line 202
    check-cast v14, Ljava/util/Collection;

    .line 203
    .line 204
    iput-object v14, v2, La/h1k0;->m:Ljava/util/Collection;

    .line 205
    .line 206
    iput-object v11, v2, La/h1k0;->n:La/j1k0;

    .line 207
    .line 208
    iput-object v11, v2, La/h1k0;->o:Ljava/util/Collection;

    .line 209
    .line 210
    iput v10, v2, La/h1k0;->u:I

    .line 211
    .line 212
    invoke-virtual {v0, v12, v13, v2}, La/sjl0;->c(JLa/zje;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 216
    if-ne v0, v3, :cond_5

    .line 217
    .line 218
    goto/16 :goto_d

    .line 219
    .line 220
    :cond_5
    move-object v12, v4

    .line 221
    :goto_2
    :try_start_2
    check-cast v0, La/ril0;

    .line 222
    .line 223
    sget-object v13, La/j0g0;->b:La/e0g0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 224
    .line 225
    move-object/from16 v75, v5

    .line 226
    .line 227
    move-object v5, v4

    .line 228
    move-object v4, v12

    .line 229
    move-object v12, v6

    .line 230
    move-object/from16 v6, v75

    .line 231
    .line 232
    goto :goto_4

    .line 233
    :catchall_1
    move-exception v0

    .line 234
    move-object v12, v4

    .line 235
    :goto_3
    sget-object v13, La/j0g0;->b:La/e0g0;

    .line 236
    .line 237
    new-instance v13, La/g0g0;

    .line 238
    .line 239
    invoke-direct {v13, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 240
    .line 241
    .line 242
    move-object v0, v5

    .line 243
    move-object v5, v4

    .line 244
    move-object v4, v12

    .line 245
    move-object v12, v6

    .line 246
    move-object v6, v0

    .line 247
    move-object v0, v13

    .line 248
    :goto_4
    nop

    .line 249
    instance-of v13, v0, La/g0g0;

    .line 250
    .line 251
    if-eqz v13, :cond_6

    .line 252
    .line 253
    move-object v0, v11

    .line 254
    :cond_6
    check-cast v0, La/ril0;

    .line 255
    .line 256
    if-eqz v0, :cond_7

    .line 257
    .line 258
    iget-boolean v0, v0, La/ril0;->e:Z

    .line 259
    .line 260
    goto :goto_5

    .line 261
    :cond_7
    move v0, v9

    .line 262
    :goto_5
    if-eqz v0, :cond_8

    .line 263
    .line 264
    goto :goto_6

    .line 265
    :cond_8
    move-object v0, v4

    .line 266
    move v4, v9

    .line 267
    goto :goto_7

    .line 268
    :cond_9
    move-object v12, v6

    .line 269
    move-object v6, v5

    .line 270
    move-object v5, v4

    .line 271
    :goto_6
    move-object v0, v4

    .line 272
    move v4, v10

    .line 273
    :goto_7
    iget-wide v13, v6, La/j1k0;->l:J

    .line 274
    .line 275
    new-instance v18, La/f0t;

    .line 276
    .line 277
    iget-wide v7, v6, La/j1k0;->c:J

    .line 278
    .line 279
    sget-object v23, La/iun;->a:La/iun;

    .line 280
    .line 281
    const/16 v19, 0x0

    .line 282
    .line 283
    const-string v22, ""

    .line 284
    .line 285
    move-object/from16 v24, v23

    .line 286
    .line 287
    move-wide/from16 v20, v7

    .line 288
    .line 289
    invoke-direct/range {v18 .. v24}, La/f0t;-><init>(IJLjava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 290
    .line 291
    .line 292
    new-instance v19, La/f0t;

    .line 293
    .line 294
    iget-wide v7, v6, La/j1k0;->f:J

    .line 295
    .line 296
    move-object/from16 v29, v23

    .line 297
    .line 298
    const-string v23, ""

    .line 299
    .line 300
    const/16 v20, 0x0

    .line 301
    .line 302
    move-object/from16 v25, v29

    .line 303
    .line 304
    move-wide/from16 v21, v7

    .line 305
    .line 306
    move-object/from16 v24, v29

    .line 307
    .line 308
    invoke-direct/range {v19 .. v25}, La/f0t;-><init>(IJLjava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 309
    .line 310
    .line 311
    move-object/from16 v7, v19

    .line 312
    .line 313
    move-object/from16 v23, v24

    .line 314
    .line 315
    iget-boolean v8, v6, La/j1k0;->m:Z

    .line 316
    .line 317
    iget-wide v10, v6, La/j1k0;->p:J

    .line 318
    .line 319
    new-instance v19, La/rqs;

    .line 320
    .line 321
    new-instance v15, La/kts;

    .line 322
    .line 323
    move-object/from16 v74, v0

    .line 324
    .line 325
    const-string v0, ""

    .line 326
    .line 327
    invoke-direct {v15, v0, v0, v9, v9}, La/kts;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 328
    .line 329
    .line 330
    new-instance v0, La/ubr;

    .line 331
    .line 332
    invoke-direct {v0, v9, v9}, La/ubr;-><init>(II)V

    .line 333
    .line 334
    .line 335
    const-string v20, ""

    .line 336
    .line 337
    const/16 v21, 0x0

    .line 338
    .line 339
    const-string v22, ""

    .line 340
    .line 341
    const/16 v24, 0x0

    .line 342
    .line 343
    const/16 v25, 0x0

    .line 344
    .line 345
    const/16 v26, 0x0

    .line 346
    .line 347
    const-string v28, ""

    .line 348
    .line 349
    const-wide/16 v29, 0x0

    .line 350
    .line 351
    const/16 v31, 0x0

    .line 352
    .line 353
    const/16 v32, 0x0

    .line 354
    .line 355
    const-string v33, ""

    .line 356
    .line 357
    const/16 v36, 0x0

    .line 358
    .line 359
    const/16 v37, 0x0

    .line 360
    .line 361
    const/16 v38, 0x0

    .line 362
    .line 363
    const/16 v39, 0x0

    .line 364
    .line 365
    const/16 v40, 0x0

    .line 366
    .line 367
    const/16 v41, 0x0

    .line 368
    .line 369
    const/16 v42, 0x0

    .line 370
    .line 371
    const/16 v43, 0x0

    .line 372
    .line 373
    const/16 v44, 0x0

    .line 374
    .line 375
    const/16 v45, 0x0

    .line 376
    .line 377
    const/16 v46, 0x0

    .line 378
    .line 379
    const/16 v47, 0x0

    .line 380
    .line 381
    move-object/from16 v34, v23

    .line 382
    .line 383
    move-object/from16 v35, v23

    .line 384
    .line 385
    move-object/from16 v48, v0

    .line 386
    .line 387
    move-object/from16 v27, v15

    .line 388
    .line 389
    invoke-direct/range {v19 .. v48}, La/rqs;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;IIILa/kts;Ljava/lang/String;JIILjava/lang/String;Ljava/util/List;Ljava/util/List;ZIZZZZZZZZZILa/ubr;)V

    .line 390
    .line 391
    .line 392
    new-instance v51, La/pfs;

    .line 393
    .line 394
    const-string v30, ""

    .line 395
    .line 396
    const-string v31, ""

    .line 397
    .line 398
    const-string v25, ""

    .line 399
    .line 400
    const-string v26, ""

    .line 401
    .line 402
    const-string v27, ""

    .line 403
    .line 404
    const-string v28, ""

    .line 405
    .line 406
    const-string v29, ""

    .line 407
    .line 408
    move-object/from16 v24, v51

    .line 409
    .line 410
    invoke-direct/range {v24 .. v31}, La/pfs;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    new-instance v69, Ljava/util/Date;

    .line 414
    .line 415
    invoke-direct/range {v69 .. v69}, Ljava/util/Date;-><init>()V

    .line 416
    .line 417
    .line 418
    if-eqz v4, :cond_a

    .line 419
    .line 420
    sget-object v0, La/boh;->d:La/boh;

    .line 421
    .line 422
    :goto_8
    move-object/from16 v53, v0

    .line 423
    .line 424
    move-object/from16 v38, v18

    .line 425
    .line 426
    goto :goto_9

    .line 427
    :cond_a
    sget-object v0, La/boh;->c:La/boh;

    .line 428
    .line 429
    goto :goto_8

    .line 430
    :goto_9
    new-instance v18, La/d0t;

    .line 431
    .line 432
    const/16 v72, 0x0

    .line 433
    .line 434
    const/16 v73, 0x0

    .line 435
    .line 436
    const-string v21, ""

    .line 437
    .line 438
    const-string v22, ""

    .line 439
    .line 440
    move-object/from16 v29, v23

    .line 441
    .line 442
    const-string v23, ""

    .line 443
    .line 444
    const-string v24, ""

    .line 445
    .line 446
    const-string v25, ""

    .line 447
    .line 448
    const/16 v26, 0x0

    .line 449
    .line 450
    const/16 v27, 0x0

    .line 451
    .line 452
    const-string v28, ""

    .line 453
    .line 454
    const-wide/16 v34, 0x0

    .line 455
    .line 456
    const-string v36, ""

    .line 457
    .line 458
    const-wide/16 v40, 0x0

    .line 459
    .line 460
    const-wide/16 v42, 0x0

    .line 461
    .line 462
    const-wide/16 v44, 0x0

    .line 463
    .line 464
    const-wide/16 v49, 0x0

    .line 465
    .line 466
    const/16 v52, 0x0

    .line 467
    .line 468
    const/16 v54, 0x0

    .line 469
    .line 470
    const/16 v56, 0x0

    .line 471
    .line 472
    const/16 v57, 0x0

    .line 473
    .line 474
    const/16 v58, 0x0

    .line 475
    .line 476
    const/16 v59, 0x0

    .line 477
    .line 478
    const/16 v60, 0x0

    .line 479
    .line 480
    const-string v61, ""

    .line 481
    .line 482
    const-string v62, ""

    .line 483
    .line 484
    const-wide/16 v64, 0x0

    .line 485
    .line 486
    const/16 v66, 0x0

    .line 487
    .line 488
    const/16 v67, 0x0

    .line 489
    .line 490
    const/16 v68, 0x0

    .line 491
    .line 492
    const-string v70, ""

    .line 493
    .line 494
    const-string v71, ""

    .line 495
    .line 496
    move-object/from16 v30, v29

    .line 497
    .line 498
    move-object/from16 v31, v29

    .line 499
    .line 500
    move-wide/from16 v32, v13

    .line 501
    .line 502
    move-object/from16 v48, v29

    .line 503
    .line 504
    move-object/from16 v63, v29

    .line 505
    .line 506
    move-object/from16 v39, v7

    .line 507
    .line 508
    move/from16 v55, v8

    .line 509
    .line 510
    move-wide/from16 v46, v10

    .line 511
    .line 512
    move-object/from16 v37, v19

    .line 513
    .line 514
    move-wide/from16 v19, v13

    .line 515
    .line 516
    invoke-direct/range {v18 .. v73}, La/d0t;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JJLjava/lang/String;La/rqs;La/f0t;La/f0t;JJJJLjava/util/List;JLa/pfs;ZLa/boh;ZZZZZZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;JZZILjava/util/Date;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 517
    .line 518
    .line 519
    move-object/from16 v0, v18

    .line 520
    .line 521
    iget-object v7, v1, La/i1k0;->a:La/i9u;

    .line 522
    .line 523
    iget-object v7, v7, La/i9u;->a:La/kki;

    .line 524
    .line 525
    iget-object v7, v7, La/kki;->b:Ljava/lang/Object;

    .line 526
    .line 527
    check-cast v7, La/abp;

    .line 528
    .line 529
    iget-object v8, v7, La/abp;->b:La/p7m0;

    .line 530
    .line 531
    invoke-static {v8}, La/abp;->d(La/gmq;)La/rwk;

    .line 532
    .line 533
    .line 534
    move-result-object v8

    .line 535
    iget-object v7, v7, La/abp;->f:La/p7m0;

    .line 536
    .line 537
    new-instance v10, La/h2c;

    .line 538
    .line 539
    const/4 v11, 0x6

    .line 540
    invoke-direct {v10, v7, v11}, La/h2c;-><init>(La/p7m0;B)V

    .line 541
    .line 542
    .line 543
    new-instance v7, La/y8p;

    .line 544
    .line 545
    const/4 v11, 0x3

    .line 546
    const/4 v13, 0x0

    .line 547
    invoke-direct {v7, v11, v13, v9}, La/y8p;-><init>(ILa/yje;B)V

    .line 548
    .line 549
    .line 550
    new-instance v11, La/p6d;

    .line 551
    .line 552
    const/4 v14, 0x1

    .line 553
    invoke-direct {v11, v8, v10, v7, v14}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 554
    .line 555
    .line 556
    invoke-static {v11}, La/i120;->W(La/gmq;)La/gmq;

    .line 557
    .line 558
    .line 559
    move-result-object v7

    .line 560
    move-object/from16 v8, v74

    .line 561
    .line 562
    check-cast v8, Ljava/util/Collection;

    .line 563
    .line 564
    iput-object v8, v2, La/h1k0;->i:Ljava/util/Collection;

    .line 565
    .line 566
    iput-object v12, v2, La/h1k0;->j:Ljava/util/Iterator;

    .line 567
    .line 568
    iput-object v6, v2, La/h1k0;->k:La/j1k0;

    .line 569
    .line 570
    iput-object v0, v2, La/h1k0;->l:La/d0t;

    .line 571
    .line 572
    move-object v8, v5

    .line 573
    check-cast v8, Ljava/util/Collection;

    .line 574
    .line 575
    iput-object v8, v2, La/h1k0;->m:Ljava/util/Collection;

    .line 576
    .line 577
    iput-object v13, v2, La/h1k0;->n:La/j1k0;

    .line 578
    .line 579
    iput-object v13, v2, La/h1k0;->o:Ljava/util/Collection;

    .line 580
    .line 581
    iput v4, v2, La/h1k0;->p:I

    .line 582
    .line 583
    const/4 v15, 0x2

    .line 584
    iput v15, v2, La/h1k0;->u:I

    .line 585
    .line 586
    invoke-static {v7, v2}, La/ntb;->M(La/gmq;La/yje;)Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v7

    .line 590
    if-ne v7, v3, :cond_b

    .line 591
    .line 592
    goto/16 :goto_d

    .line 593
    .line 594
    :cond_b
    move-object v13, v6

    .line 595
    move-object v6, v0

    .line 596
    move-object v0, v7

    .line 597
    move-object v7, v12

    .line 598
    move-object v12, v13

    .line 599
    move-object v13, v5

    .line 600
    move-object/from16 v5, v74

    .line 601
    .line 602
    :goto_a
    check-cast v0, Ljava/util/List;

    .line 603
    .line 604
    if-nez v0, :cond_c

    .line 605
    .line 606
    sget-object v0, La/iun;->a:La/iun;

    .line 607
    .line 608
    :cond_c
    iget-wide v10, v6, La/d0t;->a:J

    .line 609
    .line 610
    invoke-static {v10, v11, v0}, La/axq;->y(JLjava/util/List;)Z

    .line 611
    .line 612
    .line 613
    move-result v0

    .line 614
    iget-boolean v8, v6, La/d0t;->F:Z

    .line 615
    .line 616
    if-eqz v8, :cond_e

    .line 617
    .line 618
    iget-wide v10, v6, La/d0t;->v:J

    .line 619
    .line 620
    iget-boolean v8, v6, La/d0t;->C:Z

    .line 621
    .line 622
    cmp-long v10, v10, v16

    .line 623
    .line 624
    if-nez v10, :cond_d

    .line 625
    .line 626
    if-nez v8, :cond_e

    .line 627
    .line 628
    :cond_d
    move v8, v14

    .line 629
    goto :goto_b

    .line 630
    :cond_e
    move v8, v9

    .line 631
    :goto_b
    invoke-static {v6}, La/qzb;->i0(La/d0t;)J

    .line 632
    .line 633
    .line 634
    move-result-wide v10

    .line 635
    iget-object v9, v1, La/i1k0;->b:La/b3c;

    .line 636
    .line 637
    iget-object v9, v9, La/b3c;->a:La/nvu;

    .line 638
    .line 639
    iget-object v9, v9, La/nvu;->b:Ljava/lang/Object;

    .line 640
    .line 641
    check-cast v9, La/g8n0;

    .line 642
    .line 643
    invoke-virtual {v9, v10, v11}, La/g8n0;->c(J)La/ots;

    .line 644
    .line 645
    .line 646
    move-result-object v9

    .line 647
    if-eqz v9, :cond_f

    .line 648
    .line 649
    move v9, v14

    .line 650
    goto :goto_c

    .line 651
    :cond_f
    const/4 v9, 0x0

    .line 652
    :goto_c
    invoke-static {v6, v8, v0, v9}, La/w7n0;->H(La/d0t;ZZZ)La/d0t;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    iget-boolean v6, v0, La/d0t;->D:Z

    .line 657
    .line 658
    iget-boolean v0, v0, La/d0t;->F:Z

    .line 659
    .line 660
    iget-object v8, v12, La/j1k0;->g:Ljava/lang/String;

    .line 661
    .line 662
    move-object v9, v5

    .line 663
    check-cast v9, Ljava/util/Collection;

    .line 664
    .line 665
    iput-object v9, v2, La/h1k0;->i:Ljava/util/Collection;

    .line 666
    .line 667
    iput-object v7, v2, La/h1k0;->j:Ljava/util/Iterator;

    .line 668
    .line 669
    const/4 v9, 0x0

    .line 670
    iput-object v9, v2, La/h1k0;->k:La/j1k0;

    .line 671
    .line 672
    iput-object v9, v2, La/h1k0;->l:La/d0t;

    .line 673
    .line 674
    iput-object v9, v2, La/h1k0;->m:Ljava/util/Collection;

    .line 675
    .line 676
    iput-object v12, v2, La/h1k0;->n:La/j1k0;

    .line 677
    .line 678
    move-object v10, v13

    .line 679
    check-cast v10, Ljava/util/Collection;

    .line 680
    .line 681
    iput-object v10, v2, La/h1k0;->o:Ljava/util/Collection;

    .line 682
    .line 683
    iput v4, v2, La/h1k0;->p:I

    .line 684
    .line 685
    iput-boolean v0, v2, La/h1k0;->q:Z

    .line 686
    .line 687
    iput-boolean v6, v2, La/h1k0;->r:Z

    .line 688
    .line 689
    const/4 v11, 0x3

    .line 690
    iput v11, v2, La/h1k0;->u:I

    .line 691
    .line 692
    iget-object v4, v1, La/i1k0;->d:La/q0u;

    .line 693
    .line 694
    invoke-virtual {v4, v8, v2}, La/q0u;->a(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 695
    .line 696
    .line 697
    move-result-object v4

    .line 698
    if-ne v4, v3, :cond_10

    .line 699
    .line 700
    :goto_d
    return-object v3

    .line 701
    :cond_10
    move-object/from16 v75, v12

    .line 702
    .line 703
    move v12, v0

    .line 704
    move-object v0, v4

    .line 705
    move v4, v6

    .line 706
    move-object v6, v7

    .line 707
    move-object/from16 v7, v75

    .line 708
    .line 709
    :goto_e
    check-cast v0, Ljava/lang/String;

    .line 710
    .line 711
    new-instance v8, La/g1k0;

    .line 712
    .line 713
    invoke-direct {v8, v7, v4, v12, v0}, La/g1k0;-><init>(La/j1k0;ZZLjava/lang/String;)V

    .line 714
    .line 715
    .line 716
    invoke-interface {v13, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 717
    .line 718
    .line 719
    move-object v4, v5

    .line 720
    move v7, v11

    .line 721
    move v10, v14

    .line 722
    move v8, v15

    .line 723
    move-object v11, v9

    .line 724
    const/4 v9, 0x0

    .line 725
    goto/16 :goto_1

    .line 726
    .line 727
    :cond_11
    check-cast v4, Ljava/util/List;

    .line 728
    .line 729
    return-object v4
.end method
