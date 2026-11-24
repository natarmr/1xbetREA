.class public final La/b3g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/hie0;ZLa/x3m;La/pz40;ZLa/pz40;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/b3g;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/b3g;->d:Ljava/lang/Object;

    .line 8
    .line 9
    iput-boolean p2, p0, La/b3g;->b:Z

    .line 10
    .line 11
    iput-object p3, p0, La/b3g;->e:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, La/b3g;->f:Ljava/lang/Object;

    .line 14
    .line 15
    iput-boolean p5, p0, La/b3g;->c:Z

    .line 16
    .line 17
    iput-object p6, p0, La/b3g;->g:Ljava/lang/Object;

    .line 18
    .line 19
    return-void
.end method

.method public synthetic constructor <init>(La/kmq;Ljava/lang/Object;Ljava/util/List;Ljava/util/List;ZZB)V
    .locals 0

    .line 20
    iput-byte p7, p0, La/b3g;->a:B

    iput-object p1, p0, La/b3g;->d:Ljava/lang/Object;

    iput-object p2, p0, La/b3g;->e:Ljava/lang/Object;

    iput-object p3, p0, La/b3g;->f:Ljava/lang/Object;

    iput-object p4, p0, La/b3g;->g:Ljava/lang/Object;

    iput-boolean p5, p0, La/b3g;->b:Z

    iput-boolean p6, p0, La/b3g;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    iget-byte v2, v0, La/b3g;->a:B

    .line 6
    .line 7
    iget-boolean v3, v0, La/b3g;->c:Z

    .line 8
    .line 9
    iget-object v4, v0, La/b3g;->g:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, La/b3g;->f:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v6, v0, La/b3g;->d:Ljava/lang/Object;

    .line 14
    .line 15
    const-string v7, "call to \'resume\' before \'invoke\' with coroutine"

    .line 16
    .line 17
    const/4 v8, 0x1

    .line 18
    iget-object v9, v0, La/b3g;->e:Ljava/lang/Object;

    .line 19
    .line 20
    const/high16 v10, -0x80000000

    .line 21
    .line 22
    const/16 v11, 0xa

    .line 23
    .line 24
    packed-switch v2, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    check-cast v9, La/dgu;

    .line 28
    .line 29
    iget-object v2, v9, La/dgu;->d:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v2, La/j1q0;

    .line 32
    .line 33
    iget-object v9, v9, La/dgu;->a:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v9, La/fix;

    .line 36
    .line 37
    instance-of v14, v1, La/bgu;

    .line 38
    .line 39
    if-eqz v14, :cond_0

    .line 40
    .line 41
    move-object v14, v1

    .line 42
    check-cast v14, La/bgu;

    .line 43
    .line 44
    iget v15, v14, La/bgu;->j:I

    .line 45
    .line 46
    and-int v16, v15, v10

    .line 47
    .line 48
    if-eqz v16, :cond_0

    .line 49
    .line 50
    sub-int/2addr v15, v10

    .line 51
    iput v15, v14, La/bgu;->j:I

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    new-instance v14, La/bgu;

    .line 55
    .line 56
    invoke-direct {v14, v0, v1}, La/bgu;-><init>(La/b3g;La/yje;)V

    .line 57
    .line 58
    .line 59
    :goto_0
    iget-object v1, v14, La/bgu;->i:Ljava/lang/Object;

    .line 60
    .line 61
    sget-object v15, La/wne;->a:La/wne;

    .line 62
    .line 63
    iget v10, v14, La/bgu;->j:I

    .line 64
    .line 65
    if-eqz v10, :cond_2

    .line 66
    .line 67
    if-ne v10, v8, :cond_1

    .line 68
    .line 69
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    goto/16 :goto_d

    .line 73
    .line 74
    :cond_1
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const/4 v13, 0x0

    .line 78
    goto/16 :goto_e

    .line 79
    .line 80
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    move-object v1, v6

    .line 84
    check-cast v1, La/kmq;

    .line 85
    .line 86
    move-object/from16 v6, p1

    .line 87
    .line 88
    check-cast v6, Ljava/util/List;

    .line 89
    .line 90
    iget-object v7, v9, La/fix;->b:La/ugx;

    .line 91
    .line 92
    iget-object v7, v7, La/ugx;->a:La/p7m0;

    .line 93
    .line 94
    invoke-virtual {v7}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    check-cast v7, Ljava/util/List;

    .line 99
    .line 100
    if-nez v7, :cond_3

    .line 101
    .line 102
    sget-object v7, La/iun;->a:La/iun;

    .line 103
    .line 104
    :cond_3
    new-instance v10, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-static {v6, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 107
    .line 108
    .line 109
    move-result v12

    .line 110
    invoke-direct {v10, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 111
    .line 112
    .line 113
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v12

    .line 121
    if-eqz v12, :cond_10

    .line 122
    .line 123
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v12

    .line 127
    check-cast v12, La/fgx;

    .line 128
    .line 129
    move-object/from16 v25, v5

    .line 130
    .line 131
    check-cast v25, Ljava/util/List;

    .line 132
    .line 133
    move-object/from16 v17, v4

    .line 134
    .line 135
    check-cast v17, Ljava/util/List;

    .line 136
    .line 137
    const/16 v33, 0x0

    .line 138
    .line 139
    iget-object v13, v2, La/j1q0;->a:La/m1q0;

    .line 140
    .line 141
    invoke-virtual {v13}, La/m1q0;->j()Z

    .line 142
    .line 143
    .line 144
    move-result v27

    .line 145
    iget-object v13, v2, La/j1q0;->a:La/m1q0;

    .line 146
    .line 147
    invoke-virtual {v13}, La/m1q0;->f()Z

    .line 148
    .line 149
    .line 150
    move-result v13

    .line 151
    if-nez v13, :cond_5

    .line 152
    .line 153
    if-eqz v3, :cond_4

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_4
    const/16 v32, 0x0

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_5
    :goto_2
    move/from16 v32, v8

    .line 160
    .line 161
    :goto_3
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    move-object/from16 v34, v9

    .line 165
    .line 166
    iget-wide v8, v12, La/fgx;->b:J

    .line 167
    .line 168
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-interface/range {v17 .. v17}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 178
    .line 179
    .line 180
    move-result-object v17

    .line 181
    :goto_4
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    .line 182
    .line 183
    .line 184
    move-result v18

    .line 185
    if-eqz v18, :cond_7

    .line 186
    .line 187
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v18

    .line 191
    move-object/from16 v13, v18

    .line 192
    .line 193
    check-cast v13, La/xco;

    .line 194
    .line 195
    move-object/from16 p2, v12

    .line 196
    .line 197
    iget-wide v11, v13, La/xco;->a:J

    .line 198
    .line 199
    cmp-long v11, v11, v8

    .line 200
    .line 201
    if-nez v11, :cond_6

    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_6
    move-object/from16 v12, p2

    .line 205
    .line 206
    const/16 v11, 0xa

    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_7
    move-object/from16 p2, v12

    .line 210
    .line 211
    move-object/from16 v18, v33

    .line 212
    .line 213
    :goto_5
    move-object/from16 v11, v18

    .line 214
    .line 215
    check-cast v11, La/xco;

    .line 216
    .line 217
    if-eqz v11, :cond_8

    .line 218
    .line 219
    iget-object v11, v11, La/xco;->b:Ljava/lang/String;

    .line 220
    .line 221
    goto :goto_6

    .line 222
    :cond_8
    move-object/from16 v11, v33

    .line 223
    .line 224
    :goto_6
    if-nez v11, :cond_9

    .line 225
    .line 226
    const-string v11, ""

    .line 227
    .line 228
    :cond_9
    move-object/from16 v22, v11

    .line 229
    .line 230
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 231
    .line 232
    .line 233
    move-result-object v11

    .line 234
    :goto_7
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 235
    .line 236
    .line 237
    move-result v12

    .line 238
    if-eqz v12, :cond_b

    .line 239
    .line 240
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v12

    .line 244
    move-object v13, v12

    .line 245
    check-cast v13, La/ggx;

    .line 246
    .line 247
    move-object/from16 v45, v2

    .line 248
    .line 249
    move/from16 v44, v3

    .line 250
    .line 251
    iget-wide v2, v13, La/ggx;->b:J

    .line 252
    .line 253
    cmp-long v2, v2, v8

    .line 254
    .line 255
    if-nez v2, :cond_a

    .line 256
    .line 257
    goto :goto_8

    .line 258
    :cond_a
    move/from16 v3, v44

    .line 259
    .line 260
    move-object/from16 v2, v45

    .line 261
    .line 262
    goto :goto_7

    .line 263
    :cond_b
    move-object/from16 v45, v2

    .line 264
    .line 265
    move/from16 v44, v3

    .line 266
    .line 267
    move-object/from16 v12, v33

    .line 268
    .line 269
    :goto_8
    check-cast v12, La/ggx;

    .line 270
    .line 271
    if-eqz v12, :cond_c

    .line 272
    .line 273
    iget-object v2, v12, La/ggx;->a:Ljava/util/ArrayList;

    .line 274
    .line 275
    invoke-static {v2}, La/r3d;->r(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    :goto_9
    move-object/from16 v12, p2

    .line 280
    .line 281
    move-object/from16 v26, v2

    .line 282
    .line 283
    goto :goto_a

    .line 284
    :cond_c
    sget-object v2, La/iun;->a:La/iun;

    .line 285
    .line 286
    goto :goto_9

    .line 287
    :goto_a
    iget-object v2, v12, La/fgx;->a:Ljava/util/List;

    .line 288
    .line 289
    new-instance v3, Ljava/util/ArrayList;

    .line 290
    .line 291
    const/16 v8, 0xa

    .line 292
    .line 293
    invoke-static {v2, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 294
    .line 295
    .line 296
    move-result v9

    .line 297
    invoke-direct {v3, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 298
    .line 299
    .line 300
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 301
    .line 302
    .line 303
    move-result-object v2

    .line 304
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 305
    .line 306
    .line 307
    move-result v9

    .line 308
    if-eqz v9, :cond_f

    .line 309
    .line 310
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v9

    .line 314
    check-cast v9, Ljava/util/List;

    .line 315
    .line 316
    new-instance v11, Ljava/util/ArrayList;

    .line 317
    .line 318
    invoke-static {v9, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 319
    .line 320
    .line 321
    move-result v13

    .line 322
    invoke-direct {v11, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 323
    .line 324
    .line 325
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 326
    .line 327
    .line 328
    move-result-object v8

    .line 329
    const/16 v18, 0x0

    .line 330
    .line 331
    :goto_c
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 332
    .line 333
    .line 334
    move-result v9

    .line 335
    if-eqz v9, :cond_e

    .line 336
    .line 337
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v9

    .line 341
    add-int/lit8 v13, v18, 0x1

    .line 342
    .line 343
    if-ltz v18, :cond_d

    .line 344
    .line 345
    move-object/from16 v17, v9

    .line 346
    .line 347
    check-cast v17, La/ig7;

    .line 348
    .line 349
    move-object/from16 v46, v4

    .line 350
    .line 351
    move-object/from16 v47, v5

    .line 352
    .line 353
    iget-wide v4, v12, La/fgx;->g:J

    .line 354
    .line 355
    move-wide/from16 v20, v4

    .line 356
    .line 357
    iget-wide v4, v12, La/fgx;->h:J

    .line 358
    .line 359
    iget-object v9, v12, La/fgx;->f:Ljava/lang/String;

    .line 360
    .line 361
    move-wide/from16 v23, v4

    .line 362
    .line 363
    iget-wide v4, v12, La/fgx;->b:J

    .line 364
    .line 365
    const/16 v19, 0x0

    .line 366
    .line 367
    move-object/from16 p2, v2

    .line 368
    .line 369
    iget-boolean v2, v0, La/b3g;->b:Z

    .line 370
    .line 371
    move/from16 v31, v2

    .line 372
    .line 373
    move-wide/from16 v29, v4

    .line 374
    .line 375
    move-object/from16 v28, v9

    .line 376
    .line 377
    invoke-static/range {v17 .. v32}, La/xdx;->M(La/ig7;IZJLjava/lang/String;JLjava/util/List;Ljava/util/List;ZLjava/lang/String;JZZ)La/vr20;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-object/from16 v2, p2

    .line 385
    .line 386
    move/from16 v18, v13

    .line 387
    .line 388
    move-object/from16 v4, v46

    .line 389
    .line 390
    move-object/from16 v5, v47

    .line 391
    .line 392
    goto :goto_c

    .line 393
    :cond_d
    invoke-static {}, La/q3d;->p()V

    .line 394
    .line 395
    .line 396
    throw v33

    .line 397
    :cond_e
    move-object/from16 p2, v2

    .line 398
    .line 399
    move-object/from16 v46, v4

    .line 400
    .line 401
    move-object/from16 v47, v5

    .line 402
    .line 403
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    const/16 v8, 0xa

    .line 407
    .line 408
    goto :goto_b

    .line 409
    :cond_f
    move-object/from16 v46, v4

    .line 410
    .line 411
    move-object/from16 v47, v5

    .line 412
    .line 413
    iget-wide v4, v12, La/fgx;->b:J

    .line 414
    .line 415
    iget-wide v8, v12, La/fgx;->c:J

    .line 416
    .line 417
    iget-object v2, v12, La/fgx;->d:Ljava/lang/String;

    .line 418
    .line 419
    iget-object v11, v12, La/fgx;->e:Ljava/lang/String;

    .line 420
    .line 421
    new-instance v35, La/ggx;

    .line 422
    .line 423
    move-object/from16 v41, v2

    .line 424
    .line 425
    move-object/from16 v43, v3

    .line 426
    .line 427
    move-wide/from16 v36, v4

    .line 428
    .line 429
    move-wide/from16 v38, v8

    .line 430
    .line 431
    move-object/from16 v42, v11

    .line 432
    .line 433
    move-object/from16 v40, v22

    .line 434
    .line 435
    invoke-direct/range {v35 .. v43}, La/ggx;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 436
    .line 437
    .line 438
    move-object/from16 v2, v35

    .line 439
    .line 440
    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    move-object/from16 v9, v34

    .line 444
    .line 445
    move/from16 v3, v44

    .line 446
    .line 447
    move-object/from16 v2, v45

    .line 448
    .line 449
    move-object/from16 v4, v46

    .line 450
    .line 451
    move-object/from16 v5, v47

    .line 452
    .line 453
    const/4 v8, 0x1

    .line 454
    const/16 v11, 0xa

    .line 455
    .line 456
    goto/16 :goto_1

    .line 457
    .line 458
    :cond_10
    iget-object v0, v9, La/fix;->b:La/ugx;

    .line 459
    .line 460
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    iget-object v2, v0, La/ugx;->a:La/p7m0;

    .line 464
    .line 465
    :cond_11
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    move-object v3, v0

    .line 470
    check-cast v3, Ljava/util/List;

    .line 471
    .line 472
    invoke-virtual {v2, v0, v10}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 473
    .line 474
    .line 475
    move-result v0

    .line 476
    if-eqz v0, :cond_11

    .line 477
    .line 478
    const/4 v13, 0x1

    .line 479
    iput v13, v14, La/bgu;->j:I

    .line 480
    .line 481
    invoke-interface {v1, v10, v14}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    if-ne v0, v15, :cond_12

    .line 486
    .line 487
    move-object v13, v15

    .line 488
    goto :goto_e

    .line 489
    :cond_12
    :goto_d
    sget-object v13, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 490
    .line 491
    :goto_e
    return-object v13

    .line 492
    :pswitch_0
    move/from16 v44, v3

    .line 493
    .line 494
    move-object/from16 v46, v4

    .line 495
    .line 496
    move-object/from16 v47, v5

    .line 497
    .line 498
    const/16 v33, 0x0

    .line 499
    .line 500
    check-cast v9, La/f7u;

    .line 501
    .line 502
    iget-object v2, v9, La/f7u;->c:Ljava/lang/Object;

    .line 503
    .line 504
    check-cast v2, La/j1q0;

    .line 505
    .line 506
    iget-object v3, v9, La/f7u;->b:Ljava/lang/Object;

    .line 507
    .line 508
    check-cast v3, La/adn;

    .line 509
    .line 510
    instance-of v4, v1, La/c7u;

    .line 511
    .line 512
    if-eqz v4, :cond_13

    .line 513
    .line 514
    move-object v4, v1

    .line 515
    check-cast v4, La/c7u;

    .line 516
    .line 517
    iget v5, v4, La/c7u;->j:I

    .line 518
    .line 519
    and-int v8, v5, v10

    .line 520
    .line 521
    if-eqz v8, :cond_13

    .line 522
    .line 523
    sub-int/2addr v5, v10

    .line 524
    iput v5, v4, La/c7u;->j:I

    .line 525
    .line 526
    goto :goto_f

    .line 527
    :cond_13
    new-instance v4, La/c7u;

    .line 528
    .line 529
    invoke-direct {v4, v0, v1}, La/c7u;-><init>(La/b3g;La/yje;)V

    .line 530
    .line 531
    .line 532
    :goto_f
    iget-object v1, v4, La/c7u;->i:Ljava/lang/Object;

    .line 533
    .line 534
    sget-object v5, La/wne;->a:La/wne;

    .line 535
    .line 536
    iget v8, v4, La/c7u;->j:I

    .line 537
    .line 538
    if-eqz v8, :cond_15

    .line 539
    .line 540
    const/4 v13, 0x1

    .line 541
    if-ne v8, v13, :cond_14

    .line 542
    .line 543
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 544
    .line 545
    .line 546
    goto/16 :goto_13

    .line 547
    .line 548
    :cond_14
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 549
    .line 550
    .line 551
    move-object/from16 v13, v33

    .line 552
    .line 553
    goto/16 :goto_14

    .line 554
    .line 555
    :cond_15
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 556
    .line 557
    .line 558
    check-cast v6, La/kmq;

    .line 559
    .line 560
    move-object/from16 v1, p1

    .line 561
    .line 562
    check-cast v1, Ljava/util/List;

    .line 563
    .line 564
    iget-object v7, v3, La/adn;->a:La/f430;

    .line 565
    .line 566
    iget-object v7, v7, La/f430;->b:La/p7m0;

    .line 567
    .line 568
    invoke-virtual {v7}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object v7

    .line 572
    check-cast v7, Ljava/util/List;

    .line 573
    .line 574
    if-nez v7, :cond_16

    .line 575
    .line 576
    sget-object v7, La/iun;->a:La/iun;

    .line 577
    .line 578
    :cond_16
    move-object/from16 v18, v7

    .line 579
    .line 580
    new-instance v7, Ljava/util/ArrayList;

    .line 581
    .line 582
    const/16 v8, 0xa

    .line 583
    .line 584
    invoke-static {v1, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 585
    .line 586
    .line 587
    move-result v8

    .line 588
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 589
    .line 590
    .line 591
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 592
    .line 593
    .line 594
    move-result-object v1

    .line 595
    :goto_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 596
    .line 597
    .line 598
    move-result v8

    .line 599
    if-eqz v8, :cond_19

    .line 600
    .line 601
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object v8

    .line 605
    move-object/from16 v17, v8

    .line 606
    .line 607
    check-cast v17, La/h07;

    .line 608
    .line 609
    move-object/from16 v19, v47

    .line 610
    .line 611
    check-cast v19, Ljava/util/List;

    .line 612
    .line 613
    move-object/from16 v20, v46

    .line 614
    .line 615
    check-cast v20, Ljava/util/List;

    .line 616
    .line 617
    iget-object v8, v2, La/j1q0;->a:La/m1q0;

    .line 618
    .line 619
    invoke-virtual {v8}, La/m1q0;->j()Z

    .line 620
    .line 621
    .line 622
    move-result v21

    .line 623
    iget-object v8, v2, La/j1q0;->a:La/m1q0;

    .line 624
    .line 625
    invoke-virtual {v8}, La/m1q0;->f()Z

    .line 626
    .line 627
    .line 628
    move-result v8

    .line 629
    if-nez v8, :cond_18

    .line 630
    .line 631
    if-eqz v44, :cond_17

    .line 632
    .line 633
    goto :goto_11

    .line 634
    :cond_17
    const/16 v23, 0x0

    .line 635
    .line 636
    goto :goto_12

    .line 637
    :cond_18
    :goto_11
    const/16 v23, 0x1

    .line 638
    .line 639
    :goto_12
    iget-boolean v8, v0, La/b3g;->b:Z

    .line 640
    .line 641
    move/from16 v22, v8

    .line 642
    .line 643
    invoke-static/range {v17 .. v23}, La/vdx;->c0(La/h07;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZ)La/sr20;

    .line 644
    .line 645
    .line 646
    move-result-object v8

    .line 647
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 648
    .line 649
    .line 650
    goto :goto_10

    .line 651
    :cond_19
    iget-object v0, v3, La/adn;->a:La/f430;

    .line 652
    .line 653
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 654
    .line 655
    .line 656
    iget-object v2, v0, La/f430;->b:La/p7m0;

    .line 657
    .line 658
    :cond_1a
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 659
    .line 660
    .line 661
    move-result-object v0

    .line 662
    move-object v1, v0

    .line 663
    check-cast v1, Ljava/util/List;

    .line 664
    .line 665
    invoke-virtual {v2, v0, v7}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 666
    .line 667
    .line 668
    move-result v0

    .line 669
    const/4 v13, 0x1

    .line 670
    if-eqz v0, :cond_1a

    .line 671
    .line 672
    iput v13, v4, La/c7u;->j:I

    .line 673
    .line 674
    invoke-interface {v6, v7, v4}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    move-result-object v0

    .line 678
    if-ne v0, v5, :cond_1b

    .line 679
    .line 680
    move-object v13, v5

    .line 681
    goto :goto_14

    .line 682
    :cond_1b
    :goto_13
    sget-object v13, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 683
    .line 684
    :goto_14
    return-object v13

    .line 685
    :pswitch_1
    move-object/from16 v2, p1

    .line 686
    .line 687
    check-cast v2, La/prs0;

    .line 688
    .line 689
    invoke-virtual {v0, v2, v1}, La/b3g;->b(La/prs0;La/yje;)Ljava/lang/Object;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    return-object v0

    .line 694
    nop

    .line 695
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(La/prs0;La/yje;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, La/b3g;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/hie0;

    .line 4
    .line 5
    iget-object v1, p0, La/b3g;->f:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La/pz40;

    .line 8
    .line 9
    iget-object v2, p0, La/b3g;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, La/x3m;

    .line 12
    .line 13
    instance-of v3, p2, La/a3g;

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    move-object v3, p2

    .line 18
    check-cast v3, La/a3g;

    .line 19
    .line 20
    iget v4, v3, La/a3g;->k:I

    .line 21
    .line 22
    const/high16 v5, -0x80000000

    .line 23
    .line 24
    and-int v6, v4, v5

    .line 25
    .line 26
    if-eqz v6, :cond_0

    .line 27
    .line 28
    sub-int/2addr v4, v5

    .line 29
    iput v4, v3, La/a3g;->k:I

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance v3, La/a3g;

    .line 33
    .line 34
    invoke-direct {v3, p0, p2}, La/a3g;-><init>(La/b3g;La/yje;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    iget-object p2, v3, La/a3g;->i:Ljava/lang/Object;

    .line 38
    .line 39
    sget-object v4, La/wne;->a:La/wne;

    .line 40
    .line 41
    iget v5, v3, La/a3g;->k:I

    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    packed-switch v5, :pswitch_data_0

    .line 45
    .line 46
    .line 47
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    return-object p0

    .line 54
    :pswitch_0
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto/16 :goto_3

    .line 58
    .line 59
    :pswitch_1
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object p2, p1, La/prs0;->a:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p2, La/h3g;

    .line 65
    .line 66
    iget-object v5, p1, La/prs0;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v5, Ljava/lang/Boolean;

    .line 69
    .line 70
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    iget-object p1, p1, La/prs0;->c:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p1, Ljava/lang/Boolean;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    iget-boolean v7, p2, La/h3g;->c:Z

    .line 83
    .line 84
    iget-object v8, p2, La/h3g;->b:La/w2g;

    .line 85
    .line 86
    const/4 v9, 0x1

    .line 87
    if-eqz v7, :cond_1

    .line 88
    .line 89
    if-eqz p1, :cond_1

    .line 90
    .line 91
    move p1, v9

    .line 92
    goto :goto_1

    .line 93
    :cond_1
    move p1, v6

    .line 94
    :goto_1
    iget-object v7, p0, La/b3g;->g:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v7, La/pz40;

    .line 97
    .line 98
    sget-object v10, La/e3g;->a:La/v0h0;

    .line 99
    .line 100
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    check-cast v7, La/y3m;

    .line 105
    .line 106
    if-eqz v7, :cond_9

    .line 107
    .line 108
    iget-boolean v7, v0, La/hie0;->a:Z

    .line 109
    .line 110
    if-nez v7, :cond_9

    .line 111
    .line 112
    iget-boolean v7, p0, La/b3g;->b:Z

    .line 113
    .line 114
    if-eqz v7, :cond_2

    .line 115
    .line 116
    sget-object p0, La/w2g;->b:La/w2g;

    .line 117
    .line 118
    if-eq v8, p0, :cond_9

    .line 119
    .line 120
    iput v9, v3, La/a3g;->k:I

    .line 121
    .line 122
    invoke-virtual {v2, v9, v3}, La/x3m;->b(ZLa/zje;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    if-ne p0, v4, :cond_9

    .line 127
    .line 128
    goto/16 :goto_2

    .line 129
    .line 130
    :cond_2
    iget-boolean p2, p2, La/h3g;->d:Z

    .line 131
    .line 132
    if-eqz p2, :cond_3

    .line 133
    .line 134
    sget-object p2, La/w2g;->b:La/w2g;

    .line 135
    .line 136
    if-eq v8, p2, :cond_3

    .line 137
    .line 138
    const/4 p0, 0x2

    .line 139
    iput p0, v3, La/a3g;->k:I

    .line 140
    .line 141
    invoke-virtual {v2, v9, v3}, La/x3m;->b(ZLa/zje;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    if-ne p0, v4, :cond_9

    .line 146
    .line 147
    goto/16 :goto_2

    .line 148
    .line 149
    :cond_3
    iget-boolean p0, p0, La/b3g;->c:Z

    .line 150
    .line 151
    if-eqz v5, :cond_5

    .line 152
    .line 153
    if-eqz p1, :cond_5

    .line 154
    .line 155
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    check-cast p2, Ljava/lang/Boolean;

    .line 160
    .line 161
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 162
    .line 163
    .line 164
    move-result p2

    .line 165
    if-nez p2, :cond_5

    .line 166
    .line 167
    if-eqz p0, :cond_4

    .line 168
    .line 169
    const/4 p0, 0x3

    .line 170
    iput p0, v3, La/a3g;->k:I

    .line 171
    .line 172
    invoke-virtual {v2, v3}, La/x3m;->e(La/zje;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    if-ne p0, v4, :cond_9

    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_4
    const/4 p0, 0x4

    .line 180
    iput p0, v3, La/a3g;->k:I

    .line 181
    .line 182
    invoke-virtual {v2, v3}, La/x3m;->a(La/zje;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    if-ne p0, v4, :cond_9

    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_5
    if-eqz p1, :cond_6

    .line 190
    .line 191
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    check-cast p1, Ljava/lang/Boolean;

    .line 196
    .line 197
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 198
    .line 199
    .line 200
    move-result p1

    .line 201
    if-nez p1, :cond_6

    .line 202
    .line 203
    const/4 p0, 0x5

    .line 204
    iput p0, v3, La/a3g;->k:I

    .line 205
    .line 206
    invoke-virtual {v2, v3}, La/x3m;->e(La/zje;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    if-ne p0, v4, :cond_9

    .line 211
    .line 212
    goto :goto_2

    .line 213
    :cond_6
    if-eqz v5, :cond_8

    .line 214
    .line 215
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    check-cast p1, Ljava/lang/Boolean;

    .line 220
    .line 221
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 222
    .line 223
    .line 224
    move-result p1

    .line 225
    if-nez p1, :cond_8

    .line 226
    .line 227
    if-eqz p0, :cond_7

    .line 228
    .line 229
    const/4 p0, 0x6

    .line 230
    iput p0, v3, La/a3g;->k:I

    .line 231
    .line 232
    invoke-virtual {v2, v3}, La/x3m;->e(La/zje;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    if-ne p0, v4, :cond_9

    .line 237
    .line 238
    goto :goto_2

    .line 239
    :cond_7
    const/4 p0, 0x7

    .line 240
    iput p0, v3, La/a3g;->k:I

    .line 241
    .line 242
    invoke-virtual {v2, v3}, La/x3m;->a(La/zje;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    if-ne p0, v4, :cond_9

    .line 247
    .line 248
    goto :goto_2

    .line 249
    :cond_8
    sget-object p0, La/w2g;->b:La/w2g;

    .line 250
    .line 251
    if-eq v8, p0, :cond_9

    .line 252
    .line 253
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    check-cast p0, Ljava/lang/Boolean;

    .line 258
    .line 259
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 260
    .line 261
    .line 262
    move-result p0

    .line 263
    if-nez p0, :cond_9

    .line 264
    .line 265
    const/16 p0, 0x8

    .line 266
    .line 267
    iput p0, v3, La/a3g;->k:I

    .line 268
    .line 269
    invoke-virtual {v2, v9, v3}, La/x3m;->b(ZLa/zje;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object p0

    .line 273
    if-ne p0, v4, :cond_9

    .line 274
    .line 275
    :goto_2
    return-object v4

    .line 276
    :cond_9
    :goto_3
    iput-boolean v6, v0, La/hie0;->a:Z

    .line 277
    .line 278
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 279
    .line 280
    return-object p0

    .line 281
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
