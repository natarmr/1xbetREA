.class public final La/p4b0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/diu0;


# direct methods
.method public synthetic constructor <init>(La/diu0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/p4b0;->i:B

    iput-object p1, p0, La/p4b0;->l:La/diu0;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method private final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 58

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/p4b0;->l:La/diu0;

    .line 4
    .line 5
    check-cast v1, La/ncl0;

    .line 6
    .line 7
    iget-object v2, v1, La/ncl0;->h:La/ctf0;

    .line 8
    .line 9
    iget-object v3, v0, La/p4b0;->k:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, La/yqs;

    .line 12
    .line 13
    iget-object v0, v0, La/p4b0;->j:Ljava/lang/Object;

    .line 14
    .line 15
    move-object/from16 v17, v0

    .line 16
    .line 17
    check-cast v17, Ljava/util/List;

    .line 18
    .line 19
    sget-object v0, La/wne;->a:La/wne;

    .line 20
    .line 21
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, v3, La/yqs;->a:La/gna;

    .line 25
    .line 26
    iget-object v4, v3, La/yqs;->b:La/anq0;

    .line 27
    .line 28
    const/16 v18, 0x0

    .line 29
    .line 30
    if-eqz v0, :cond_53

    .line 31
    .line 32
    invoke-virtual {v1}, La/ncl0;->w()La/qz40;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    check-cast v5, La/p7m0;

    .line 37
    .line 38
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    check-cast v5, La/zqs;

    .line 43
    .line 44
    iget-boolean v5, v5, La/zqs;->g:Z

    .line 45
    .line 46
    const/4 v6, 0x1

    .line 47
    const/4 v7, 0x0

    .line 48
    if-nez v5, :cond_1

    .line 49
    .line 50
    invoke-virtual {v1}, La/ncl0;->w()La/qz40;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    check-cast v5, La/p7m0;

    .line 55
    .line 56
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    check-cast v5, La/zqs;

    .line 61
    .line 62
    iget-boolean v5, v5, La/zqs;->h:Z

    .line 63
    .line 64
    if-eqz v5, :cond_0

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    move v5, v7

    .line 68
    goto :goto_1

    .line 69
    :cond_1
    :goto_0
    move v5, v7

    .line 70
    move v7, v6

    .line 71
    :goto_1
    iget-object v8, v3, La/yqs;->e:La/y930;

    .line 72
    .line 73
    invoke-static {v8}, La/bww;->Q(La/y930;)Z

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    iget-object v9, v1, La/ncl0;->L:La/n0o0;

    .line 78
    .line 79
    invoke-virtual {v9}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v9

    .line 83
    check-cast v9, Ljava/lang/Boolean;

    .line 84
    .line 85
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 86
    .line 87
    .line 88
    move-result v10

    .line 89
    iget-object v9, v1, La/ncl0;->N:La/p7m0;

    .line 90
    .line 91
    invoke-virtual {v9}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    check-cast v9, La/wqs;

    .line 96
    .line 97
    iget-object v9, v9, La/wqs;->c:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 98
    .line 99
    iget-object v9, v9, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;->a:La/dja;

    .line 100
    .line 101
    iget-object v11, v3, La/yqs;->f:Ljava/util/List;

    .line 102
    .line 103
    invoke-virtual {v1}, La/ncl0;->w()La/qz40;

    .line 104
    .line 105
    .line 106
    move-result-object v12

    .line 107
    check-cast v12, La/p7m0;

    .line 108
    .line 109
    invoke-virtual {v12}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v12

    .line 113
    check-cast v12, La/zqs;

    .line 114
    .line 115
    iget-wide v12, v12, La/zqs;->c:J

    .line 116
    .line 117
    move v14, v6

    .line 118
    iget-object v6, v3, La/yqs;->c:La/bg30;

    .line 119
    .line 120
    iget-object v3, v3, La/yqs;->d:La/ui9;

    .line 121
    .line 122
    invoke-virtual {v1}, La/ncl0;->w()La/qz40;

    .line 123
    .line 124
    .line 125
    move-result-object v15

    .line 126
    check-cast v15, La/p7m0;

    .line 127
    .line 128
    invoke-virtual {v15}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v15

    .line 132
    check-cast v15, La/zqs;

    .line 133
    .line 134
    iget-object v15, v15, La/zqs;->j:La/vzj0;

    .line 135
    .line 136
    if-eqz v15, :cond_2

    .line 137
    .line 138
    invoke-static {v15, v4, v2}, La/qxw;->W(La/vzj0;La/anq0;La/ctf0;)La/d0k0;

    .line 139
    .line 140
    .line 141
    move-result-object v15

    .line 142
    goto :goto_2

    .line 143
    :cond_2
    move-object/from16 v15, v18

    .line 144
    .line 145
    :goto_2
    iget-object v1, v1, La/ncl0;->M:La/n0o0;

    .line 146
    .line 147
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    check-cast v1, Ljava/lang/Boolean;

    .line 152
    .line 153
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    if-nez v4, :cond_3

    .line 170
    .line 171
    new-instance v19, La/anq0;

    .line 172
    .line 173
    const/16 v32, 0x0

    .line 174
    .line 175
    const/16 v33, 0x0

    .line 176
    .line 177
    const/16 v20, 0x0

    .line 178
    .line 179
    const/16 v21, 0x0

    .line 180
    .line 181
    const-string v22, ""

    .line 182
    .line 183
    const-wide/16 v23, 0x0

    .line 184
    .line 185
    const-wide/16 v25, 0x0

    .line 186
    .line 187
    const-wide/16 v27, 0x0

    .line 188
    .line 189
    const-wide/16 v29, 0x0

    .line 190
    .line 191
    const/16 v31, 0x0

    .line 192
    .line 193
    invoke-direct/range {v19 .. v33}, La/anq0;-><init>(ZZLjava/lang/String;JJJJLa/znq0;ZZ)V

    .line 194
    .line 195
    .line 196
    move-object/from16 v4, v19

    .line 197
    .line 198
    :cond_3
    move-object/from16 v16, v3

    .line 199
    .line 200
    new-instance v3, La/prs;

    .line 201
    .line 202
    move-object/from16 p0, v3

    .line 203
    .line 204
    new-instance v3, La/r0s;

    .line 205
    .line 206
    new-instance v19, Ljava/util/ArrayList;

    .line 207
    .line 208
    invoke-direct/range {v19 .. v19}, Ljava/util/ArrayList;-><init>()V

    .line 209
    .line 210
    .line 211
    move-object/from16 p1, v3

    .line 212
    .line 213
    instance-of v3, v0, La/ena;

    .line 214
    .line 215
    if-eqz v3, :cond_8

    .line 216
    .line 217
    move-object v5, v0

    .line 218
    check-cast v5, La/ena;

    .line 219
    .line 220
    iget-object v14, v5, La/ena;->m:La/loa;

    .line 221
    .line 222
    move/from16 v22, v3

    .line 223
    .line 224
    if-eqz v6, :cond_4

    .line 225
    .line 226
    iget-object v3, v6, La/bg30;->a:La/pz10;

    .line 227
    .line 228
    :goto_3
    move-object/from16 v23, v5

    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_4
    move-object/from16 v3, v18

    .line 232
    .line 233
    goto :goto_3

    .line 234
    :goto_4
    iget-object v5, v14, La/loa;->a:Ljava/lang/String;

    .line 235
    .line 236
    iget-object v14, v14, La/loa;->b:Ljava/lang/String;

    .line 237
    .line 238
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 239
    .line 240
    .line 241
    move-result v24

    .line 242
    if-lez v24, :cond_6

    .line 243
    .line 244
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 245
    .line 246
    .line 247
    move-result v24

    .line 248
    if-lez v24, :cond_6

    .line 249
    .line 250
    invoke-static {}, La/cy7;->c()Z

    .line 251
    .line 252
    .line 253
    move-result v24

    .line 254
    move-object/from16 v25, v6

    .line 255
    .line 256
    const-string v6, "\u2069"

    .line 257
    .line 258
    move/from16 v26, v7

    .line 259
    .line 260
    const-string v7, "\u2069 - \u2066"

    .line 261
    .line 262
    move/from16 v27, v8

    .line 263
    .line 264
    const-string v8, "\u2066"

    .line 265
    .line 266
    if-eqz v24, :cond_5

    .line 267
    .line 268
    if-eqz v1, :cond_5

    .line 269
    .line 270
    invoke-static {v8, v14, v7, v5, v6}, La/b1j;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v5

    .line 274
    goto :goto_5

    .line 275
    :cond_5
    invoke-static {v8, v5, v7, v14, v6}, La/b1j;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v5

    .line 279
    goto :goto_5

    .line 280
    :cond_6
    move-object/from16 v25, v6

    .line 281
    .line 282
    move/from16 v26, v7

    .line 283
    .line 284
    move/from16 v27, v8

    .line 285
    .line 286
    :goto_5
    if-eqz v3, :cond_7

    .line 287
    .line 288
    new-instance v6, Ljava/util/ArrayList;

    .line 289
    .line 290
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 291
    .line 292
    .line 293
    new-instance v7, La/ij90;

    .line 294
    .line 295
    const/16 v8, 0xe

    .line 296
    .line 297
    invoke-direct {v7, v3, v1, v8}, La/ij90;-><init>(Ljava/lang/Object;ZB)V

    .line 298
    .line 299
    .line 300
    new-instance v3, La/bnk0;

    .line 301
    .line 302
    invoke-direct {v3}, La/bnk0;-><init>()V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v7, v3}, La/ij90;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    iget-object v3, v3, La/bnk0;->a:Ljava/util/ArrayList;

    .line 309
    .line 310
    invoke-static {v6, v3, v6}, La/w6x;->l(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)La/ank0;

    .line 311
    .line 312
    .line 313
    move-result-object v3

    .line 314
    goto :goto_6

    .line 315
    :cond_7
    new-instance v3, Ljava/util/ArrayList;

    .line 316
    .line 317
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 318
    .line 319
    .line 320
    new-instance v6, La/ank0;

    .line 321
    .line 322
    invoke-direct {v6, v3}, La/ank0;-><init>(Ljava/util/List;)V

    .line 323
    .line 324
    .line 325
    move-object v3, v6

    .line 326
    :goto_6
    new-instance v6, Ljava/util/ArrayList;

    .line 327
    .line 328
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 329
    .line 330
    .line 331
    new-instance v7, La/b8q0;

    .line 332
    .line 333
    const/16 v8, 0x8

    .line 334
    .line 335
    invoke-direct {v7, v4, v2, v8}, La/b8q0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 336
    .line 337
    .line 338
    new-instance v8, La/bnk0;

    .line 339
    .line 340
    invoke-direct {v8}, La/bnk0;-><init>()V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v7, v8}, La/b8q0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    iget-object v7, v8, La/bnk0;->a:Ljava/util/ArrayList;

    .line 347
    .line 348
    invoke-static {v6, v7, v6}, La/w6x;->l(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)La/ank0;

    .line 349
    .line 350
    .line 351
    move-result-object v6

    .line 352
    new-instance v7, La/ymq0;

    .line 353
    .line 354
    invoke-direct {v7, v3, v6, v5}, La/ymq0;-><init>(La/ank0;La/ank0;Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    move-object/from16 v35, p0

    .line 358
    .line 359
    move-object/from16 v36, p1

    .line 360
    .line 361
    move-object v3, v2

    .line 362
    move-object v5, v7

    .line 363
    move-object/from16 v34, v15

    .line 364
    .line 365
    move-object/from16 v14, v16

    .line 366
    .line 367
    move-object/from16 v2, v23

    .line 368
    .line 369
    move-object/from16 v6, v25

    .line 370
    .line 371
    move/from16 v7, v26

    .line 372
    .line 373
    move/from16 v8, v27

    .line 374
    .line 375
    move/from16 v16, v1

    .line 376
    .line 377
    move-object v15, v4

    .line 378
    move-object/from16 v4, v19

    .line 379
    .line 380
    const/4 v1, 0x0

    .line 381
    invoke-static/range {v2 .. v17}, La/b5x;->s(La/ena;La/ctf0;Ljava/util/ArrayList;La/ymq0;La/bg30;ZZLa/dja;ZLjava/util/List;JLa/ui9;La/anq0;ZLjava/util/List;)V

    .line 382
    .line 383
    .line 384
    move-object v2, v3

    .line 385
    move-object v11, v4

    .line 386
    move-object v10, v6

    .line 387
    move-object v4, v15

    .line 388
    move/from16 v9, v16

    .line 389
    .line 390
    goto :goto_7

    .line 391
    :cond_8
    move-object/from16 v35, p0

    .line 392
    .line 393
    move-object/from16 v36, p1

    .line 394
    .line 395
    move v9, v1

    .line 396
    move/from16 v22, v3

    .line 397
    .line 398
    move v1, v5

    .line 399
    move-object v10, v6

    .line 400
    move-object/from16 v34, v15

    .line 401
    .line 402
    move-object/from16 v11, v19

    .line 403
    .line 404
    instance-of v3, v0, La/fna;

    .line 405
    .line 406
    if-eqz v3, :cond_52

    .line 407
    .line 408
    move-object v3, v0

    .line 409
    check-cast v3, La/fna;

    .line 410
    .line 411
    new-instance v5, La/kfa;

    .line 412
    .line 413
    iget-object v3, v3, La/fna;->a:La/k3z;

    .line 414
    .line 415
    invoke-static {v3, v2}, La/d9x;->L(La/k3z;La/ctf0;)Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v3

    .line 419
    new-instance v6, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 420
    .line 421
    sget-object v7, La/dja;->c:La/dja;

    .line 422
    .line 423
    invoke-direct {v6, v7, v1}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;-><init>(La/dja;I)V

    .line 424
    .line 425
    .line 426
    invoke-direct {v5, v3, v6}, La/kfa;-><init>(Ljava/lang/String;Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    :goto_7
    new-instance v12, Ljava/util/ArrayList;

    .line 433
    .line 434
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 435
    .line 436
    .line 437
    if-eqz v22, :cond_50

    .line 438
    .line 439
    check-cast v0, La/ena;

    .line 440
    .line 441
    iget-object v3, v0, La/ena;->b:La/mnd;

    .line 442
    .line 443
    instance-of v5, v3, La/nnd;

    .line 444
    .line 445
    const-string v16, "/"

    .line 446
    .line 447
    const-wide/16 v19, 0x42

    .line 448
    .line 449
    const-string v17, ""

    .line 450
    .line 451
    if-eqz v5, :cond_19

    .line 452
    .line 453
    check-cast v3, La/nnd;

    .line 454
    .line 455
    iget-object v5, v3, La/nnd;->d:Ljava/lang/String;

    .line 456
    .line 457
    iget-object v6, v3, La/nnd;->c:Ljava/lang/String;

    .line 458
    .line 459
    move-object/from16 v22, v6

    .line 460
    .line 461
    iget-boolean v6, v0, La/ena;->p:Z

    .line 462
    .line 463
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 464
    .line 465
    .line 466
    move-result v7

    .line 467
    iget-boolean v8, v3, La/nnd;->m:Z

    .line 468
    .line 469
    if-eqz v10, :cond_9

    .line 470
    .line 471
    iget-object v14, v10, La/bg30;->b:La/izm0;

    .line 472
    .line 473
    if-eqz v14, :cond_9

    .line 474
    .line 475
    goto :goto_8

    .line 476
    :cond_9
    if-eqz v10, :cond_a

    .line 477
    .line 478
    iget-object v14, v10, La/bg30;->a:La/pz10;

    .line 479
    .line 480
    goto :goto_8

    .line 481
    :cond_a
    move-object/from16 v14, v18

    .line 482
    .line 483
    :goto_8
    iget-object v15, v3, La/nnd;->b:Ljava/util/List;

    .line 484
    .line 485
    iget-object v1, v3, La/nnd;->f:Ljava/util/List;

    .line 486
    .line 487
    iget-object v13, v3, La/nnd;->a:Ljava/util/List;

    .line 488
    .line 489
    move-object/from16 v28, v4

    .line 490
    .line 491
    iget-object v4, v3, La/nnd;->e:Ljava/util/List;

    .line 492
    .line 493
    move-object/from16 v29, v5

    .line 494
    .line 495
    iget-boolean v5, v3, La/nnd;->o:Z

    .line 496
    .line 497
    if-eqz v8, :cond_b

    .line 498
    .line 499
    if-nez v5, :cond_b

    .line 500
    .line 501
    move/from16 v30, v5

    .line 502
    .line 503
    const/4 v5, 0x1

    .line 504
    goto :goto_9

    .line 505
    :cond_b
    move/from16 v30, v5

    .line 506
    .line 507
    const/4 v5, 0x0

    .line 508
    :goto_9
    invoke-static {v2, v14, v5}, La/pzb;->J(La/ctf0;La/d3h0;Z)La/ank0;

    .line 509
    .line 510
    .line 511
    move-result-object v31

    .line 512
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v5

    .line 516
    check-cast v5, Ljava/lang/String;

    .line 517
    .line 518
    if-nez v5, :cond_c

    .line 519
    .line 520
    move-object/from16 v5, v17

    .line 521
    .line 522
    :cond_c
    invoke-static {v13}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v21

    .line 526
    check-cast v21, Ljava/lang/Long;

    .line 527
    .line 528
    if-eqz v21, :cond_d

    .line 529
    .line 530
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Long;->longValue()J

    .line 531
    .line 532
    .line 533
    move-result-wide v23

    .line 534
    move/from16 v32, v6

    .line 535
    .line 536
    move/from16 v33, v7

    .line 537
    .line 538
    move-wide/from16 v6, v23

    .line 539
    .line 540
    goto :goto_a

    .line 541
    :cond_d
    move/from16 v32, v6

    .line 542
    .line 543
    move/from16 v33, v7

    .line 544
    .line 545
    const-wide/16 v6, 0x0

    .line 546
    .line 547
    :goto_a
    invoke-static {v6, v7, v5}, La/vsm0;->s(JLjava/lang/String;)Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v37

    .line 551
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v5

    .line 555
    check-cast v5, Ljava/lang/String;

    .line 556
    .line 557
    if-nez v5, :cond_e

    .line 558
    .line 559
    move-object/from16 v5, v17

    .line 560
    .line 561
    :cond_e
    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v6

    .line 565
    check-cast v6, Ljava/lang/Long;

    .line 566
    .line 567
    if-eqz v6, :cond_f

    .line 568
    .line 569
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 570
    .line 571
    .line 572
    move-result-wide v6

    .line 573
    goto :goto_b

    .line 574
    :cond_f
    const-wide/16 v6, 0x0

    .line 575
    .line 576
    :goto_b
    invoke-static {v6, v7, v5}, La/vsm0;->s(JLjava/lang/String;)Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v38

    .line 580
    const/4 v5, 0x1

    .line 581
    invoke-static {v5, v4}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object v4

    .line 585
    check-cast v4, Ljava/lang/String;

    .line 586
    .line 587
    if-nez v4, :cond_10

    .line 588
    .line 589
    move-object/from16 v4, v17

    .line 590
    .line 591
    :cond_10
    invoke-static {v5, v13}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object v6

    .line 595
    check-cast v6, Ljava/lang/Long;

    .line 596
    .line 597
    if-eqz v6, :cond_11

    .line 598
    .line 599
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 600
    .line 601
    .line 602
    move-result-wide v6

    .line 603
    goto :goto_c

    .line 604
    :cond_11
    const-wide/16 v6, 0x0

    .line 605
    .line 606
    :goto_c
    invoke-static {v6, v7, v4}, La/vsm0;->s(JLjava/lang/String;)Ljava/lang/String;

    .line 607
    .line 608
    .line 609
    move-result-object v13

    .line 610
    invoke-static {v5, v1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v1

    .line 614
    check-cast v1, Ljava/lang/String;

    .line 615
    .line 616
    if-nez v1, :cond_12

    .line 617
    .line 618
    move-object/from16 v1, v17

    .line 619
    .line 620
    :cond_12
    invoke-static {v5, v15}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    move-result-object v4

    .line 624
    check-cast v4, Ljava/lang/Long;

    .line 625
    .line 626
    if-eqz v4, :cond_13

    .line 627
    .line 628
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 629
    .line 630
    .line 631
    move-result-wide v4

    .line 632
    goto :goto_d

    .line 633
    :cond_13
    const-wide/16 v4, 0x0

    .line 634
    .line 635
    :goto_d
    invoke-static {v4, v5, v1}, La/vsm0;->s(JLjava/lang/String;)Ljava/lang/String;

    .line 636
    .line 637
    .line 638
    move-result-object v1

    .line 639
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 640
    .line 641
    .line 642
    new-instance v21, La/zmk0;

    .line 643
    .line 644
    const/16 v23, -0x1

    .line 645
    .line 646
    const/high16 v24, -0x40800000    # -1.0f

    .line 647
    .line 648
    const v25, 0x7f0606da

    .line 649
    .line 650
    .line 651
    move/from16 v26, v23

    .line 652
    .line 653
    move/from16 v27, v23

    .line 654
    .line 655
    invoke-direct/range {v21 .. v27}, La/zmk0;-><init>(Ljava/lang/String;IFIII)V

    .line 656
    .line 657
    .line 658
    move-object/from16 v39, v21

    .line 659
    .line 660
    move-object/from16 v15, v22

    .line 661
    .line 662
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 663
    .line 664
    .line 665
    new-instance v21, La/zmk0;

    .line 666
    .line 667
    move-object/from16 v22, v29

    .line 668
    .line 669
    invoke-direct/range {v21 .. v27}, La/zmk0;-><init>(Ljava/lang/String;IFIII)V

    .line 670
    .line 671
    .line 672
    if-eqz v8, :cond_14

    .line 673
    .line 674
    if-nez v30, :cond_14

    .line 675
    .line 676
    const/4 v7, 0x1

    .line 677
    goto :goto_e

    .line 678
    :cond_14
    const/4 v7, 0x0

    .line 679
    :goto_e
    iget-boolean v8, v3, La/nnd;->g:Z

    .line 680
    .line 681
    if-eqz v10, :cond_16

    .line 682
    .line 683
    iget-object v4, v10, La/bg30;->a:La/pz10;

    .line 684
    .line 685
    invoke-interface {v4}, La/d3h0;->n()Ljava/lang/String;

    .line 686
    .line 687
    .line 688
    move-result-object v4

    .line 689
    if-nez v4, :cond_15

    .line 690
    .line 691
    goto :goto_10

    .line 692
    :cond_15
    move-object v5, v14

    .line 693
    move-object v14, v3

    .line 694
    move-object v3, v5

    .line 695
    move-object v5, v4

    .line 696
    :goto_f
    move-object/from16 v24, v1

    .line 697
    .line 698
    move-object/from16 v23, v13

    .line 699
    .line 700
    move-object/from16 v1, v22

    .line 701
    .line 702
    move-object/from16 v4, v28

    .line 703
    .line 704
    move/from16 v6, v32

    .line 705
    .line 706
    move/from16 v13, v33

    .line 707
    .line 708
    goto :goto_11

    .line 709
    :cond_16
    :goto_10
    move-object v4, v14

    .line 710
    move-object v14, v3

    .line 711
    move-object v3, v4

    .line 712
    move-object/from16 v5, v17

    .line 713
    .line 714
    goto :goto_f

    .line 715
    :goto_11
    invoke-static/range {v2 .. v9}, La/pzb;->L(La/ctf0;La/d3h0;La/anq0;Ljava/lang/String;ZZZZ)La/ank0;

    .line 716
    .line 717
    .line 718
    move-result-object v27

    .line 719
    iget-boolean v2, v14, La/nnd;->m:Z

    .line 720
    .line 721
    iget-wide v3, v14, La/nnd;->h:J

    .line 722
    .line 723
    cmp-long v3, v3, v19

    .line 724
    .line 725
    if-nez v3, :cond_17

    .line 726
    .line 727
    const/16 v29, 0x1

    .line 728
    .line 729
    goto :goto_12

    .line 730
    :cond_17
    const/16 v29, 0x0

    .line 731
    .line 732
    :goto_12
    filled-new-array/range {v16 .. v16}, [Ljava/lang/String;

    .line 733
    .line 734
    .line 735
    move-result-object v3

    .line 736
    const/4 v4, 0x6

    .line 737
    const/4 v5, 0x0

    .line 738
    invoke-static {v15, v3, v5, v4}, Lkotlin/text/StringsKt;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 739
    .line 740
    .line 741
    move-result-object v3

    .line 742
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 743
    .line 744
    .line 745
    move-result v3

    .line 746
    const/4 v6, 0x1

    .line 747
    if-le v3, v6, :cond_18

    .line 748
    .line 749
    filled-new-array/range {v16 .. v16}, [Ljava/lang/String;

    .line 750
    .line 751
    .line 752
    move-result-object v3

    .line 753
    invoke-static {v1, v3, v5, v4}, Lkotlin/text/StringsKt;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 754
    .line 755
    .line 756
    move-result-object v1

    .line 757
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 758
    .line 759
    .line 760
    move-result v1

    .line 761
    if-le v1, v6, :cond_18

    .line 762
    .line 763
    const/16 v30, 0x1

    .line 764
    .line 765
    goto :goto_13

    .line 766
    :cond_18
    const/16 v30, 0x0

    .line 767
    .line 768
    :goto_13
    iget-boolean v1, v14, La/nnd;->l:Z

    .line 769
    .line 770
    new-instance v3, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 771
    .line 772
    sget-object v4, La/dja;->c:La/dja;

    .line 773
    .line 774
    invoke-direct {v3, v4, v13}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;-><init>(La/dja;I)V

    .line 775
    .line 776
    .line 777
    new-instance v19, La/ond;

    .line 778
    .line 779
    move/from16 v28, v2

    .line 780
    .line 781
    move-object/from16 v32, v3

    .line 782
    .line 783
    move/from16 v33, v9

    .line 784
    .line 785
    move-object/from16 v26, v21

    .line 786
    .line 787
    move-object/from16 v20, v31

    .line 788
    .line 789
    move-object/from16 v21, v37

    .line 790
    .line 791
    move-object/from16 v22, v38

    .line 792
    .line 793
    move-object/from16 v25, v39

    .line 794
    .line 795
    move/from16 v31, v1

    .line 796
    .line 797
    invoke-direct/range {v19 .. v33}, La/ond;-><init>(La/ank0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/zmk0;La/zmk0;La/ank0;ZZZZLorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;Z)V

    .line 798
    .line 799
    .line 800
    :goto_14
    move-object/from16 v1, v19

    .line 801
    .line 802
    goto/16 :goto_25

    .line 803
    .line 804
    :cond_19
    instance-of v1, v3, La/rnd;

    .line 805
    .line 806
    if-eqz v1, :cond_26

    .line 807
    .line 808
    move-object v1, v3

    .line 809
    check-cast v1, La/rnd;

    .line 810
    .line 811
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 812
    .line 813
    .line 814
    move-result v13

    .line 815
    iget-boolean v6, v0, La/ena;->p:Z

    .line 816
    .line 817
    if-eqz v10, :cond_1a

    .line 818
    .line 819
    iget-object v3, v10, La/bg30;->b:La/izm0;

    .line 820
    .line 821
    if-eqz v3, :cond_1a

    .line 822
    .line 823
    goto :goto_15

    .line 824
    :cond_1a
    if-eqz v10, :cond_1b

    .line 825
    .line 826
    iget-object v3, v10, La/bg30;->a:La/pz10;

    .line 827
    .line 828
    goto :goto_15

    .line 829
    :cond_1b
    move-object/from16 v3, v18

    .line 830
    .line 831
    :goto_15
    instance-of v5, v3, La/lz10;

    .line 832
    .line 833
    if-eqz v5, :cond_1c

    .line 834
    .line 835
    move-object v7, v3

    .line 836
    check-cast v7, La/lz10;

    .line 837
    .line 838
    goto :goto_16

    .line 839
    :cond_1c
    move-object/from16 v7, v18

    .line 840
    .line 841
    :goto_16
    if-eqz v7, :cond_1d

    .line 842
    .line 843
    invoke-static {v7, v9}, La/pzb;->i0(La/lz10;Z)La/ank0;

    .line 844
    .line 845
    .line 846
    move-result-object v7

    .line 847
    :goto_17
    move-object/from16 v25, v7

    .line 848
    .line 849
    goto :goto_19

    .line 850
    :cond_1d
    instance-of v7, v3, La/hzm0;

    .line 851
    .line 852
    if-eqz v7, :cond_1e

    .line 853
    .line 854
    move-object v7, v3

    .line 855
    check-cast v7, La/hzm0;

    .line 856
    .line 857
    goto :goto_18

    .line 858
    :cond_1e
    move-object/from16 v7, v18

    .line 859
    .line 860
    :goto_18
    if-eqz v7, :cond_1f

    .line 861
    .line 862
    invoke-static {v7, v9}, La/pzb;->j0(La/hzm0;Z)La/ank0;

    .line 863
    .line 864
    .line 865
    move-result-object v7

    .line 866
    goto :goto_17

    .line 867
    :cond_1f
    new-instance v7, Ljava/util/ArrayList;

    .line 868
    .line 869
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 870
    .line 871
    .line 872
    new-instance v8, La/ank0;

    .line 873
    .line 874
    invoke-direct {v8, v7}, La/ank0;-><init>(Ljava/util/List;)V

    .line 875
    .line 876
    .line 877
    move-object/from16 v25, v8

    .line 878
    .line 879
    :goto_19
    if-eqz v5, :cond_20

    .line 880
    .line 881
    move-object v5, v3

    .line 882
    check-cast v5, La/lz10;

    .line 883
    .line 884
    goto :goto_1a

    .line 885
    :cond_20
    move-object/from16 v5, v18

    .line 886
    .line 887
    :goto_1a
    if-eqz v5, :cond_21

    .line 888
    .line 889
    invoke-static {v5, v9}, La/pzb;->k0(La/lz10;Z)La/ank0;

    .line 890
    .line 891
    .line 892
    move-result-object v5

    .line 893
    :goto_1b
    move-object/from16 v26, v5

    .line 894
    .line 895
    goto :goto_1d

    .line 896
    :cond_21
    instance-of v5, v3, La/hzm0;

    .line 897
    .line 898
    if-eqz v5, :cond_22

    .line 899
    .line 900
    move-object v5, v3

    .line 901
    check-cast v5, La/hzm0;

    .line 902
    .line 903
    goto :goto_1c

    .line 904
    :cond_22
    move-object/from16 v5, v18

    .line 905
    .line 906
    :goto_1c
    if-eqz v5, :cond_23

    .line 907
    .line 908
    invoke-static {v5, v9}, La/pzb;->l0(La/hzm0;Z)La/ank0;

    .line 909
    .line 910
    .line 911
    move-result-object v5

    .line 912
    goto :goto_1b

    .line 913
    :cond_23
    new-instance v5, Ljava/util/ArrayList;

    .line 914
    .line 915
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 916
    .line 917
    .line 918
    new-instance v7, La/ank0;

    .line 919
    .line 920
    invoke-direct {v7, v5}, La/ank0;-><init>(Ljava/util/List;)V

    .line 921
    .line 922
    .line 923
    move-object/from16 v26, v7

    .line 924
    .line 925
    :goto_1d
    new-instance v19, La/aqd;

    .line 926
    .line 927
    iget-boolean v8, v1, La/rnd;->a:Z

    .line 928
    .line 929
    iget-object v14, v1, La/rnd;->c:La/rpp0;

    .line 930
    .line 931
    if-eqz v10, :cond_24

    .line 932
    .line 933
    iget-object v5, v10, La/bg30;->a:La/pz10;

    .line 934
    .line 935
    invoke-interface {v5}, La/d3h0;->n()Ljava/lang/String;

    .line 936
    .line 937
    .line 938
    move-result-object v5

    .line 939
    if-nez v5, :cond_25

    .line 940
    .line 941
    :cond_24
    move-object/from16 v5, v17

    .line 942
    .line 943
    :cond_25
    iget-boolean v7, v1, La/rnd;->b:Z

    .line 944
    .line 945
    invoke-static/range {v2 .. v9}, La/pzb;->L(La/ctf0;La/d3h0;La/anq0;Ljava/lang/String;ZZZZ)La/ank0;

    .line 946
    .line 947
    .line 948
    move-result-object v20

    .line 949
    invoke-virtual {v14}, La/rpp0;->b()Ljava/lang/String;

    .line 950
    .line 951
    .line 952
    move-result-object v21

    .line 953
    invoke-virtual {v14}, La/rpp0;->d()Ljava/lang/String;

    .line 954
    .line 955
    .line 956
    move-result-object v22

    .line 957
    iget-object v2, v1, La/rnd;->d:Ljava/lang/String;

    .line 958
    .line 959
    iget-object v1, v1, La/rnd;->e:Ljava/lang/String;

    .line 960
    .line 961
    new-instance v3, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 962
    .line 963
    sget-object v4, La/dja;->c:La/dja;

    .line 964
    .line 965
    invoke-direct {v3, v4, v13}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;-><init>(La/dja;I)V

    .line 966
    .line 967
    .line 968
    move-object/from16 v24, v1

    .line 969
    .line 970
    move-object/from16 v23, v2

    .line 971
    .line 972
    move-object/from16 v27, v3

    .line 973
    .line 974
    invoke-direct/range {v19 .. v27}, La/aqd;-><init>(La/ank0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/ank0;La/ank0;Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;)V

    .line 975
    .line 976
    .line 977
    goto/16 :goto_14

    .line 978
    .line 979
    :cond_26
    instance-of v1, v3, La/zod;

    .line 980
    .line 981
    if-eqz v1, :cond_2e

    .line 982
    .line 983
    move-object v1, v3

    .line 984
    check-cast v1, La/zod;

    .line 985
    .line 986
    iget-boolean v6, v0, La/ena;->p:Z

    .line 987
    .line 988
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 989
    .line 990
    .line 991
    move-result v13

    .line 992
    iget-boolean v3, v1, La/zod;->e:Z

    .line 993
    .line 994
    if-eqz v10, :cond_27

    .line 995
    .line 996
    iget-object v5, v10, La/bg30;->b:La/izm0;

    .line 997
    .line 998
    if-eqz v5, :cond_27

    .line 999
    .line 1000
    goto :goto_1e

    .line 1001
    :cond_27
    if-eqz v10, :cond_28

    .line 1002
    .line 1003
    iget-object v5, v10, La/bg30;->a:La/pz10;

    .line 1004
    .line 1005
    goto :goto_1e

    .line 1006
    :cond_28
    move-object/from16 v5, v18

    .line 1007
    .line 1008
    :goto_1e
    iget-boolean v7, v1, La/zod;->f:Z

    .line 1009
    .line 1010
    if-eqz v3, :cond_29

    .line 1011
    .line 1012
    if-nez v7, :cond_29

    .line 1013
    .line 1014
    const/4 v8, 0x1

    .line 1015
    goto :goto_1f

    .line 1016
    :cond_29
    const/4 v8, 0x0

    .line 1017
    :goto_1f
    invoke-static {v2, v5, v8}, La/pzb;->J(La/ctf0;La/d3h0;Z)La/ank0;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v14

    .line 1021
    iget-object v8, v1, La/zod;->a:Ljava/lang/String;

    .line 1022
    .line 1023
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1024
    .line 1025
    .line 1026
    new-instance v21, La/zmk0;

    .line 1027
    .line 1028
    const/16 v23, -0x1

    .line 1029
    .line 1030
    const/high16 v24, -0x40800000    # -1.0f

    .line 1031
    .line 1032
    const v25, 0x7f0606da

    .line 1033
    .line 1034
    .line 1035
    move/from16 v26, v23

    .line 1036
    .line 1037
    move/from16 v27, v23

    .line 1038
    .line 1039
    move-object/from16 v22, v8

    .line 1040
    .line 1041
    invoke-direct/range {v21 .. v27}, La/zmk0;-><init>(Ljava/lang/String;IFIII)V

    .line 1042
    .line 1043
    .line 1044
    iget-object v8, v1, La/zod;->b:Ljava/lang/String;

    .line 1045
    .line 1046
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1047
    .line 1048
    .line 1049
    new-instance v22, La/zmk0;

    .line 1050
    .line 1051
    const/16 v24, -0x1

    .line 1052
    .line 1053
    const/high16 v25, -0x40800000    # -1.0f

    .line 1054
    .line 1055
    const v26, 0x7f0606da

    .line 1056
    .line 1057
    .line 1058
    move/from16 v27, v24

    .line 1059
    .line 1060
    move/from16 v28, v24

    .line 1061
    .line 1062
    move-object/from16 v23, v8

    .line 1063
    .line 1064
    invoke-direct/range {v22 .. v28}, La/zmk0;-><init>(Ljava/lang/String;IFIII)V

    .line 1065
    .line 1066
    .line 1067
    if-eqz v3, :cond_2a

    .line 1068
    .line 1069
    if-nez v7, :cond_2a

    .line 1070
    .line 1071
    const/4 v7, 0x1

    .line 1072
    goto :goto_20

    .line 1073
    :cond_2a
    const/4 v7, 0x0

    .line 1074
    :goto_20
    iget-boolean v8, v1, La/zod;->c:Z

    .line 1075
    .line 1076
    if-eqz v10, :cond_2c

    .line 1077
    .line 1078
    iget-object v3, v10, La/bg30;->a:La/pz10;

    .line 1079
    .line 1080
    invoke-interface {v3}, La/d3h0;->n()Ljava/lang/String;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v3

    .line 1084
    if-nez v3, :cond_2b

    .line 1085
    .line 1086
    goto :goto_21

    .line 1087
    :cond_2b
    move-object/from16 v57, v5

    .line 1088
    .line 1089
    move-object v5, v3

    .line 1090
    move-object/from16 v3, v57

    .line 1091
    .line 1092
    goto :goto_22

    .line 1093
    :cond_2c
    :goto_21
    move-object v3, v5

    .line 1094
    move-object/from16 v5, v17

    .line 1095
    .line 1096
    :goto_22
    invoke-static/range {v2 .. v9}, La/pzb;->L(La/ctf0;La/d3h0;La/anq0;Ljava/lang/String;ZZZZ)La/ank0;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v23

    .line 1100
    iget-boolean v2, v1, La/zod;->e:Z

    .line 1101
    .line 1102
    iget-wide v3, v1, La/zod;->d:J

    .line 1103
    .line 1104
    cmp-long v1, v3, v19

    .line 1105
    .line 1106
    if-nez v1, :cond_2d

    .line 1107
    .line 1108
    const/16 v25, 0x1

    .line 1109
    .line 1110
    goto :goto_23

    .line 1111
    :cond_2d
    const/16 v25, 0x0

    .line 1112
    .line 1113
    :goto_23
    new-instance v1, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 1114
    .line 1115
    sget-object v3, La/dja;->c:La/dja;

    .line 1116
    .line 1117
    invoke-direct {v1, v3, v13}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;-><init>(La/dja;I)V

    .line 1118
    .line 1119
    .line 1120
    new-instance v19, La/apd;

    .line 1121
    .line 1122
    move-object/from16 v26, v1

    .line 1123
    .line 1124
    move/from16 v24, v2

    .line 1125
    .line 1126
    move/from16 v27, v9

    .line 1127
    .line 1128
    move-object/from16 v20, v14

    .line 1129
    .line 1130
    invoke-direct/range {v19 .. v27}, La/apd;-><init>(La/ank0;La/zmk0;La/zmk0;La/ank0;ZZLorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;Z)V

    .line 1131
    .line 1132
    .line 1133
    goto/16 :goto_14

    .line 1134
    .line 1135
    :cond_2e
    instance-of v1, v3, La/lpd;

    .line 1136
    .line 1137
    if-eqz v1, :cond_4f

    .line 1138
    .line 1139
    check-cast v3, La/lpd;

    .line 1140
    .line 1141
    iget-boolean v6, v0, La/ena;->p:Z

    .line 1142
    .line 1143
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 1144
    .line 1145
    .line 1146
    move-result v1

    .line 1147
    new-instance v5, Ljava/util/ArrayList;

    .line 1148
    .line 1149
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1150
    .line 1151
    .line 1152
    new-instance v7, Ljava/util/ArrayList;

    .line 1153
    .line 1154
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1155
    .line 1156
    .line 1157
    iget-object v8, v3, La/lpd;->e:Ljava/lang/String;

    .line 1158
    .line 1159
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1160
    .line 1161
    .line 1162
    new-instance v19, La/zmk0;

    .line 1163
    .line 1164
    const/16 v21, -0x1

    .line 1165
    .line 1166
    const/high16 v22, -0x40800000    # -1.0f

    .line 1167
    .line 1168
    const v23, 0x7f0606da

    .line 1169
    .line 1170
    .line 1171
    const/16 v24, -0x1

    .line 1172
    .line 1173
    const/16 v25, -0x1

    .line 1174
    .line 1175
    move-object/from16 v20, v8

    .line 1176
    .line 1177
    invoke-direct/range {v19 .. v25}, La/zmk0;-><init>(Ljava/lang/String;IFIII)V

    .line 1178
    .line 1179
    .line 1180
    move-object/from16 v8, v19

    .line 1181
    .line 1182
    invoke-static {v7, v8, v5, v7, v5}, La/axq;->d(Ljava/util/ArrayList;La/zmk0;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)La/ank0;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v13

    .line 1186
    iget-boolean v5, v3, La/lpd;->g:Z

    .line 1187
    .line 1188
    if-eqz v5, :cond_2f

    .line 1189
    .line 1190
    iget-boolean v5, v3, La/lpd;->h:Z

    .line 1191
    .line 1192
    if-nez v5, :cond_2f

    .line 1193
    .line 1194
    const/4 v7, 0x1

    .line 1195
    goto :goto_24

    .line 1196
    :cond_2f
    const/4 v7, 0x0

    .line 1197
    :goto_24
    iget-boolean v8, v3, La/lpd;->f:Z

    .line 1198
    .line 1199
    const/4 v3, 0x0

    .line 1200
    const-string v5, ""

    .line 1201
    .line 1202
    invoke-static/range {v2 .. v9}, La/pzb;->L(La/ctf0;La/d3h0;La/anq0;Ljava/lang/String;ZZZZ)La/ank0;

    .line 1203
    .line 1204
    .line 1205
    move-result-object v2

    .line 1206
    new-instance v3, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 1207
    .line 1208
    sget-object v4, La/dja;->c:La/dja;

    .line 1209
    .line 1210
    invoke-direct {v3, v4, v1}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;-><init>(La/dja;I)V

    .line 1211
    .line 1212
    .line 1213
    new-instance v1, La/mpd;

    .line 1214
    .line 1215
    invoke-direct {v1, v13, v2, v3}, La/mpd;-><init>(La/ank0;La/ank0;Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;)V

    .line 1216
    .line 1217
    .line 1218
    :goto_25
    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1219
    .line 1220
    .line 1221
    if-eqz v10, :cond_4e

    .line 1222
    .line 1223
    iget-object v1, v10, La/bg30;->a:La/pz10;

    .line 1224
    .line 1225
    iget-object v2, v0, La/ena;->g:La/bpd;

    .line 1226
    .line 1227
    if-eqz v2, :cond_4c

    .line 1228
    .line 1229
    iget-object v4, v2, La/bpd;->g:Ljava/lang/String;

    .line 1230
    .line 1231
    iget-object v3, v2, La/bpd;->d:Ljava/lang/String;

    .line 1232
    .line 1233
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 1234
    .line 1235
    .line 1236
    move-result v10

    .line 1237
    instance-of v5, v1, La/oz10;

    .line 1238
    .line 1239
    if-eqz v5, :cond_30

    .line 1240
    .line 1241
    move-object v6, v1

    .line 1242
    check-cast v6, La/oz10;

    .line 1243
    .line 1244
    move-object v13, v6

    .line 1245
    goto :goto_26

    .line 1246
    :cond_30
    move-object/from16 v13, v18

    .line 1247
    .line 1248
    :goto_26
    const v6, 0x7f0606da

    .line 1249
    .line 1250
    .line 1251
    const v7, 0x7f0606c1

    .line 1252
    .line 1253
    .line 1254
    if-eqz v5, :cond_33

    .line 1255
    .line 1256
    move-object v8, v1

    .line 1257
    check-cast v8, La/oz10;

    .line 1258
    .line 1259
    iget-object v9, v8, La/oz10;->k:Ljava/lang/String;

    .line 1260
    .line 1261
    iget-boolean v14, v8, La/oz10;->l:Z

    .line 1262
    .line 1263
    if-eqz v14, :cond_31

    .line 1264
    .line 1265
    move/from16 v23, v7

    .line 1266
    .line 1267
    goto :goto_27

    .line 1268
    :cond_31
    move/from16 v23, v6

    .line 1269
    .line 1270
    :goto_27
    new-instance v19, La/zmk0;

    .line 1271
    .line 1272
    const/16 v21, -0x1

    .line 1273
    .line 1274
    const/high16 v22, -0x40800000    # -1.0f

    .line 1275
    .line 1276
    move/from16 v24, v21

    .line 1277
    .line 1278
    move/from16 v25, v21

    .line 1279
    .line 1280
    move-object/from16 v20, v9

    .line 1281
    .line 1282
    invoke-direct/range {v19 .. v25}, La/zmk0;-><init>(Ljava/lang/String;IFIII)V

    .line 1283
    .line 1284
    .line 1285
    iget-object v9, v8, La/oz10;->m:Ljava/lang/String;

    .line 1286
    .line 1287
    iget-boolean v8, v8, La/oz10;->n:Z

    .line 1288
    .line 1289
    if-eqz v8, :cond_32

    .line 1290
    .line 1291
    move/from16 v24, v7

    .line 1292
    .line 1293
    goto :goto_28

    .line 1294
    :cond_32
    move/from16 v24, v6

    .line 1295
    .line 1296
    :goto_28
    new-instance v20, La/zmk0;

    .line 1297
    .line 1298
    const/16 v22, -0x1

    .line 1299
    .line 1300
    const/high16 v23, -0x40800000    # -1.0f

    .line 1301
    .line 1302
    move/from16 v25, v22

    .line 1303
    .line 1304
    move/from16 v26, v22

    .line 1305
    .line 1306
    move-object/from16 v21, v9

    .line 1307
    .line 1308
    invoke-direct/range {v20 .. v26}, La/zmk0;-><init>(Ljava/lang/String;IFIII)V

    .line 1309
    .line 1310
    .line 1311
    :goto_29
    move-object/from16 v14, v19

    .line 1312
    .line 1313
    move-object/from16 v15, v20

    .line 1314
    .line 1315
    goto/16 :goto_2c

    .line 1316
    .line 1317
    :cond_33
    instance-of v8, v1, La/mz10;

    .line 1318
    .line 1319
    if-eqz v8, :cond_36

    .line 1320
    .line 1321
    move-object v8, v1

    .line 1322
    check-cast v8, La/mz10;

    .line 1323
    .line 1324
    iget-object v9, v8, La/mz10;->h:Ljava/lang/String;

    .line 1325
    .line 1326
    iget-boolean v14, v8, La/mz10;->i:Z

    .line 1327
    .line 1328
    if-eqz v14, :cond_34

    .line 1329
    .line 1330
    move/from16 v23, v7

    .line 1331
    .line 1332
    goto :goto_2a

    .line 1333
    :cond_34
    move/from16 v23, v6

    .line 1334
    .line 1335
    :goto_2a
    new-instance v19, La/zmk0;

    .line 1336
    .line 1337
    const/16 v21, -0x1

    .line 1338
    .line 1339
    const/high16 v22, -0x40800000    # -1.0f

    .line 1340
    .line 1341
    move/from16 v24, v21

    .line 1342
    .line 1343
    move/from16 v25, v21

    .line 1344
    .line 1345
    move-object/from16 v20, v9

    .line 1346
    .line 1347
    invoke-direct/range {v19 .. v25}, La/zmk0;-><init>(Ljava/lang/String;IFIII)V

    .line 1348
    .line 1349
    .line 1350
    iget-object v9, v8, La/mz10;->j:Ljava/lang/String;

    .line 1351
    .line 1352
    iget-boolean v8, v8, La/mz10;->k:Z

    .line 1353
    .line 1354
    if-eqz v8, :cond_35

    .line 1355
    .line 1356
    move/from16 v24, v7

    .line 1357
    .line 1358
    goto :goto_2b

    .line 1359
    :cond_35
    move/from16 v24, v6

    .line 1360
    .line 1361
    :goto_2b
    new-instance v20, La/zmk0;

    .line 1362
    .line 1363
    const/16 v22, -0x1

    .line 1364
    .line 1365
    const/high16 v23, -0x40800000    # -1.0f

    .line 1366
    .line 1367
    move/from16 v25, v22

    .line 1368
    .line 1369
    move/from16 v26, v22

    .line 1370
    .line 1371
    move-object/from16 v21, v9

    .line 1372
    .line 1373
    invoke-direct/range {v20 .. v26}, La/zmk0;-><init>(Ljava/lang/String;IFIII)V

    .line 1374
    .line 1375
    .line 1376
    goto :goto_29

    .line 1377
    :cond_36
    new-instance v21, La/zmk0;

    .line 1378
    .line 1379
    const-string v22, ""

    .line 1380
    .line 1381
    const/16 v23, -0x1

    .line 1382
    .line 1383
    const/high16 v24, -0x40800000    # -1.0f

    .line 1384
    .line 1385
    move/from16 v25, v23

    .line 1386
    .line 1387
    move/from16 v26, v23

    .line 1388
    .line 1389
    move/from16 v27, v23

    .line 1390
    .line 1391
    invoke-direct/range {v21 .. v27}, La/zmk0;-><init>(Ljava/lang/String;IFIII)V

    .line 1392
    .line 1393
    .line 1394
    new-instance v22, La/zmk0;

    .line 1395
    .line 1396
    const-string v23, ""

    .line 1397
    .line 1398
    const/16 v24, -0x1

    .line 1399
    .line 1400
    const/high16 v25, -0x40800000    # -1.0f

    .line 1401
    .line 1402
    move/from16 v26, v24

    .line 1403
    .line 1404
    move/from16 v27, v24

    .line 1405
    .line 1406
    move/from16 v28, v24

    .line 1407
    .line 1408
    invoke-direct/range {v22 .. v28}, La/zmk0;-><init>(Ljava/lang/String;IFIII)V

    .line 1409
    .line 1410
    .line 1411
    move-object/from16 v14, v21

    .line 1412
    .line 1413
    move-object/from16 v15, v22

    .line 1414
    .line 1415
    :goto_2c
    iget-object v6, v14, La/zmk0;->a:Ljava/lang/String;

    .line 1416
    .line 1417
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 1418
    .line 1419
    .line 1420
    move-result v7

    .line 1421
    const-string v8, "0"

    .line 1422
    .line 1423
    if-lez v7, :cond_37

    .line 1424
    .line 1425
    invoke-virtual {v6, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1426
    .line 1427
    .line 1428
    move-result v6

    .line 1429
    if-eqz v6, :cond_38

    .line 1430
    .line 1431
    :cond_37
    iget-object v6, v15, La/zmk0;->a:Ljava/lang/String;

    .line 1432
    .line 1433
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 1434
    .line 1435
    .line 1436
    move-result v7

    .line 1437
    if-lez v7, :cond_39

    .line 1438
    .line 1439
    invoke-virtual {v6, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1440
    .line 1441
    .line 1442
    move-result v6

    .line 1443
    if-nez v6, :cond_39

    .line 1444
    .line 1445
    :cond_38
    const/16 v52, 0x1

    .line 1446
    .line 1447
    goto :goto_2d

    .line 1448
    :cond_39
    const/16 v52, 0x0

    .line 1449
    .line 1450
    :goto_2d
    instance-of v6, v1, La/kz10;

    .line 1451
    .line 1452
    if-eqz v6, :cond_3a

    .line 1453
    .line 1454
    move-object v5, v1

    .line 1455
    check-cast v5, La/kz10;

    .line 1456
    .line 1457
    iget v5, v5, La/kz10;->g:I

    .line 1458
    .line 1459
    goto :goto_2e

    .line 1460
    :cond_3a
    instance-of v6, v1, La/lz10;

    .line 1461
    .line 1462
    if-eqz v6, :cond_3b

    .line 1463
    .line 1464
    move-object v5, v1

    .line 1465
    check-cast v5, La/lz10;

    .line 1466
    .line 1467
    iget v5, v5, La/lz10;->i:I

    .line 1468
    .line 1469
    goto :goto_2e

    .line 1470
    :cond_3b
    instance-of v6, v1, La/mz10;

    .line 1471
    .line 1472
    if-eqz v6, :cond_3c

    .line 1473
    .line 1474
    move-object v5, v1

    .line 1475
    check-cast v5, La/mz10;

    .line 1476
    .line 1477
    iget v5, v5, La/mz10;->g:I

    .line 1478
    .line 1479
    goto :goto_2e

    .line 1480
    :cond_3c
    if-eqz v5, :cond_4b

    .line 1481
    .line 1482
    move-object v5, v1

    .line 1483
    check-cast v5, La/oz10;

    .line 1484
    .line 1485
    iget v5, v5, La/oz10;->o:I

    .line 1486
    .line 1487
    :goto_2e
    iget-object v6, v2, La/bpd;->c:Ljava/util/List;

    .line 1488
    .line 1489
    iget-object v7, v2, La/bpd;->f:Ljava/util/List;

    .line 1490
    .line 1491
    iget-object v8, v2, La/bpd;->b:Ljava/util/List;

    .line 1492
    .line 1493
    iget-object v9, v2, La/bpd;->e:Ljava/util/List;

    .line 1494
    .line 1495
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1496
    .line 1497
    .line 1498
    new-instance v19, La/zmk0;

    .line 1499
    .line 1500
    const/16 v21, -0x1

    .line 1501
    .line 1502
    const/high16 v22, -0x40800000    # -1.0f

    .line 1503
    .line 1504
    const v23, 0x7f0606da

    .line 1505
    .line 1506
    .line 1507
    move/from16 v24, v21

    .line 1508
    .line 1509
    move/from16 v25, v21

    .line 1510
    .line 1511
    move-object/from16 v20, v3

    .line 1512
    .line 1513
    invoke-direct/range {v19 .. v25}, La/zmk0;-><init>(Ljava/lang/String;IFIII)V

    .line 1514
    .line 1515
    .line 1516
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1517
    .line 1518
    .line 1519
    new-instance v3, La/zmk0;

    .line 1520
    .line 1521
    move/from16 v18, v5

    .line 1522
    .line 1523
    const/4 v5, -0x1

    .line 1524
    move-object/from16 v21, v6

    .line 1525
    .line 1526
    const/high16 v6, -0x40800000    # -1.0f

    .line 1527
    .line 1528
    move-object/from16 v22, v7

    .line 1529
    .line 1530
    const v7, 0x7f0606da

    .line 1531
    .line 1532
    .line 1533
    move-object/from16 v23, v8

    .line 1534
    .line 1535
    move v8, v5

    .line 1536
    move-object/from16 v24, v9

    .line 1537
    .line 1538
    move v9, v5

    .line 1539
    move-object/from16 v25, v1

    .line 1540
    .line 1541
    move-object/from16 v1, v20

    .line 1542
    .line 1543
    move-object/from16 v20, v13

    .line 1544
    .line 1545
    move/from16 v13, v18

    .line 1546
    .line 1547
    invoke-direct/range {v3 .. v9}, La/zmk0;-><init>(Ljava/lang/String;IFIII)V

    .line 1548
    .line 1549
    .line 1550
    invoke-static/range {v24 .. v24}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1551
    .line 1552
    .line 1553
    move-result-object v5

    .line 1554
    check-cast v5, Ljava/lang/String;

    .line 1555
    .line 1556
    if-nez v5, :cond_3d

    .line 1557
    .line 1558
    move-object/from16 v5, v17

    .line 1559
    .line 1560
    :cond_3d
    invoke-static/range {v23 .. v23}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v6

    .line 1564
    check-cast v6, Ljava/lang/Long;

    .line 1565
    .line 1566
    if-eqz v6, :cond_3e

    .line 1567
    .line 1568
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 1569
    .line 1570
    .line 1571
    move-result-wide v6

    .line 1572
    goto :goto_2f

    .line 1573
    :cond_3e
    const-wide/16 v6, 0x0

    .line 1574
    .line 1575
    :goto_2f
    invoke-static {v6, v7, v5}, La/vsm0;->s(JLjava/lang/String;)Ljava/lang/String;

    .line 1576
    .line 1577
    .line 1578
    move-result-object v40

    .line 1579
    move-object/from16 v5, v24

    .line 1580
    .line 1581
    const/4 v6, 0x1

    .line 1582
    invoke-static {v6, v5}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 1583
    .line 1584
    .line 1585
    move-result-object v5

    .line 1586
    check-cast v5, Ljava/lang/String;

    .line 1587
    .line 1588
    if-nez v5, :cond_3f

    .line 1589
    .line 1590
    move-object/from16 v5, v17

    .line 1591
    .line 1592
    :cond_3f
    move-object/from16 v7, v23

    .line 1593
    .line 1594
    invoke-static {v6, v7}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 1595
    .line 1596
    .line 1597
    move-result-object v7

    .line 1598
    check-cast v7, Ljava/lang/Long;

    .line 1599
    .line 1600
    if-eqz v7, :cond_40

    .line 1601
    .line 1602
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 1603
    .line 1604
    .line 1605
    move-result-wide v6

    .line 1606
    goto :goto_30

    .line 1607
    :cond_40
    const-wide/16 v6, 0x0

    .line 1608
    .line 1609
    :goto_30
    invoke-static {v6, v7, v5}, La/vsm0;->s(JLjava/lang/String;)Ljava/lang/String;

    .line 1610
    .line 1611
    .line 1612
    move-result-object v41

    .line 1613
    invoke-static/range {v22 .. v22}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1614
    .line 1615
    .line 1616
    move-result-object v5

    .line 1617
    check-cast v5, Ljava/lang/String;

    .line 1618
    .line 1619
    if-nez v5, :cond_41

    .line 1620
    .line 1621
    move-object/from16 v5, v17

    .line 1622
    .line 1623
    :cond_41
    invoke-static/range {v21 .. v21}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v6

    .line 1627
    check-cast v6, Ljava/lang/Long;

    .line 1628
    .line 1629
    if-eqz v6, :cond_42

    .line 1630
    .line 1631
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 1632
    .line 1633
    .line 1634
    move-result-wide v6

    .line 1635
    goto :goto_31

    .line 1636
    :cond_42
    const-wide/16 v6, 0x0

    .line 1637
    .line 1638
    :goto_31
    invoke-static {v6, v7, v5}, La/vsm0;->s(JLjava/lang/String;)Ljava/lang/String;

    .line 1639
    .line 1640
    .line 1641
    move-result-object v42

    .line 1642
    move-object/from16 v5, v22

    .line 1643
    .line 1644
    const/4 v6, 0x1

    .line 1645
    invoke-static {v6, v5}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 1646
    .line 1647
    .line 1648
    move-result-object v5

    .line 1649
    check-cast v5, Ljava/lang/String;

    .line 1650
    .line 1651
    if-nez v5, :cond_43

    .line 1652
    .line 1653
    move-object/from16 v5, v17

    .line 1654
    .line 1655
    :cond_43
    move-object/from16 v7, v21

    .line 1656
    .line 1657
    invoke-static {v6, v7}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 1658
    .line 1659
    .line 1660
    move-result-object v7

    .line 1661
    check-cast v7, Ljava/lang/Long;

    .line 1662
    .line 1663
    if-eqz v7, :cond_44

    .line 1664
    .line 1665
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 1666
    .line 1667
    .line 1668
    move-result-wide v6

    .line 1669
    goto :goto_32

    .line 1670
    :cond_44
    const-wide/16 v6, 0x0

    .line 1671
    .line 1672
    :goto_32
    invoke-static {v6, v7, v5}, La/vsm0;->s(JLjava/lang/String;)Ljava/lang/String;

    .line 1673
    .line 1674
    .line 1675
    move-result-object v43

    .line 1676
    invoke-static/range {v25 .. v25}, La/pzb;->O(La/pz10;)La/zmk0;

    .line 1677
    .line 1678
    .line 1679
    move-result-object v44

    .line 1680
    invoke-static/range {v25 .. v25}, La/pzb;->R(La/pz10;)La/zmk0;

    .line 1681
    .line 1682
    .line 1683
    move-result-object v45

    .line 1684
    iget-object v5, v2, La/bpd;->a:Ljava/lang/String;

    .line 1685
    .line 1686
    invoke-static {v5}, La/sj3;->N(Ljava/lang/String;)Ljava/lang/String;

    .line 1687
    .line 1688
    .line 1689
    move-result-object v27

    .line 1690
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1691
    .line 1692
    .line 1693
    new-instance v46, La/zmk0;

    .line 1694
    .line 1695
    const/16 v28, -0x1

    .line 1696
    .line 1697
    const/high16 v29, -0x40800000    # -1.0f

    .line 1698
    .line 1699
    const v30, 0x7f0606da

    .line 1700
    .line 1701
    .line 1702
    move/from16 v31, v28

    .line 1703
    .line 1704
    move/from16 v32, v28

    .line 1705
    .line 1706
    move-object/from16 v26, v46

    .line 1707
    .line 1708
    invoke-direct/range {v26 .. v32}, La/zmk0;-><init>(Ljava/lang/String;IFIII)V

    .line 1709
    .line 1710
    .line 1711
    invoke-interface/range {v25 .. v25}, La/pz10;->d()Ljava/util/List;

    .line 1712
    .line 1713
    .line 1714
    move-result-object v5

    .line 1715
    new-instance v6, Ljava/util/ArrayList;

    .line 1716
    .line 1717
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1718
    .line 1719
    .line 1720
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1721
    .line 1722
    .line 1723
    move-result-object v5

    .line 1724
    :goto_33
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1725
    .line 1726
    .line 1727
    move-result v7

    .line 1728
    if-eqz v7, :cond_45

    .line 1729
    .line 1730
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1731
    .line 1732
    .line 1733
    move-result-object v7

    .line 1734
    check-cast v7, La/te90;

    .line 1735
    .line 1736
    new-instance v8, La/gqd;

    .line 1737
    .line 1738
    iget-object v9, v7, La/te90;->a:Ljava/lang/String;

    .line 1739
    .line 1740
    move-object/from16 v39, v3

    .line 1741
    .line 1742
    invoke-static {v7}, La/pzb;->P(La/te90;)La/zmk0;

    .line 1743
    .line 1744
    .line 1745
    move-result-object v3

    .line 1746
    invoke-static {v7}, La/pzb;->S(La/te90;)La/zmk0;

    .line 1747
    .line 1748
    .line 1749
    move-result-object v7

    .line 1750
    invoke-direct {v8, v9, v3, v7}, La/gqd;-><init>(Ljava/lang/String;La/zmk0;La/zmk0;)V

    .line 1751
    .line 1752
    .line 1753
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1754
    .line 1755
    .line 1756
    move-object/from16 v3, v39

    .line 1757
    .line 1758
    goto :goto_33

    .line 1759
    :cond_45
    move-object/from16 v39, v3

    .line 1760
    .line 1761
    if-eqz v20, :cond_46

    .line 1762
    .line 1763
    invoke-static/range {v20 .. v20}, La/pzb;->O(La/pz10;)La/zmk0;

    .line 1764
    .line 1765
    .line 1766
    move-result-object v3

    .line 1767
    move-object/from16 v48, v3

    .line 1768
    .line 1769
    goto :goto_34

    .line 1770
    :cond_46
    new-instance v26, La/zmk0;

    .line 1771
    .line 1772
    const-string v27, ""

    .line 1773
    .line 1774
    const/16 v28, -0x1

    .line 1775
    .line 1776
    const/high16 v29, -0x40800000    # -1.0f

    .line 1777
    .line 1778
    move/from16 v30, v28

    .line 1779
    .line 1780
    move/from16 v31, v28

    .line 1781
    .line 1782
    move/from16 v32, v28

    .line 1783
    .line 1784
    invoke-direct/range {v26 .. v32}, La/zmk0;-><init>(Ljava/lang/String;IFIII)V

    .line 1785
    .line 1786
    .line 1787
    move-object/from16 v48, v26

    .line 1788
    .line 1789
    :goto_34
    if-eqz v20, :cond_47

    .line 1790
    .line 1791
    invoke-static/range {v20 .. v20}, La/pzb;->R(La/pz10;)La/zmk0;

    .line 1792
    .line 1793
    .line 1794
    move-result-object v3

    .line 1795
    move-object/from16 v49, v3

    .line 1796
    .line 1797
    goto :goto_35

    .line 1798
    :cond_47
    new-instance v26, La/zmk0;

    .line 1799
    .line 1800
    const-string v27, ""

    .line 1801
    .line 1802
    const/16 v28, -0x1

    .line 1803
    .line 1804
    const/high16 v29, -0x40800000    # -1.0f

    .line 1805
    .line 1806
    move/from16 v30, v28

    .line 1807
    .line 1808
    move/from16 v31, v28

    .line 1809
    .line 1810
    move/from16 v32, v28

    .line 1811
    .line 1812
    invoke-direct/range {v26 .. v32}, La/zmk0;-><init>(Ljava/lang/String;IFIII)V

    .line 1813
    .line 1814
    .line 1815
    move-object/from16 v49, v26

    .line 1816
    .line 1817
    :goto_35
    iget-boolean v2, v2, La/bpd;->h:Z

    .line 1818
    .line 1819
    filled-new-array/range {v16 .. v16}, [Ljava/lang/String;

    .line 1820
    .line 1821
    .line 1822
    move-result-object v3

    .line 1823
    const/4 v5, 0x6

    .line 1824
    const/4 v7, 0x0

    .line 1825
    invoke-static {v1, v3, v7, v5}, Lkotlin/text/StringsKt;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 1826
    .line 1827
    .line 1828
    move-result-object v1

    .line 1829
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1830
    .line 1831
    .line 1832
    move-result v1

    .line 1833
    const/4 v3, 0x1

    .line 1834
    if-le v1, v3, :cond_48

    .line 1835
    .line 1836
    filled-new-array/range {v16 .. v16}, [Ljava/lang/String;

    .line 1837
    .line 1838
    .line 1839
    move-result-object v1

    .line 1840
    invoke-static {v4, v1, v7, v5}, Lkotlin/text/StringsKt;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 1841
    .line 1842
    .line 1843
    move-result-object v1

    .line 1844
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1845
    .line 1846
    .line 1847
    move-result v1

    .line 1848
    if-le v1, v3, :cond_48

    .line 1849
    .line 1850
    move/from16 v54, v3

    .line 1851
    .line 1852
    goto :goto_36

    .line 1853
    :cond_48
    const/16 v54, 0x0

    .line 1854
    .line 1855
    :goto_36
    new-instance v1, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 1856
    .line 1857
    sget-object v4, La/dja;->d:La/dja;

    .line 1858
    .line 1859
    invoke-direct {v1, v4, v10}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;-><init>(La/dja;I)V

    .line 1860
    .line 1861
    .line 1862
    if-eq v13, v3, :cond_4a

    .line 1863
    .line 1864
    const/4 v3, 0x2

    .line 1865
    if-eq v13, v3, :cond_49

    .line 1866
    .line 1867
    sget-object v3, La/bex;->c:La/bex;

    .line 1868
    .line 1869
    :goto_37
    move-object/from16 v55, v3

    .line 1870
    .line 1871
    goto :goto_38

    .line 1872
    :cond_49
    sget-object v3, La/bex;->b:La/bex;

    .line 1873
    .line 1874
    goto :goto_37

    .line 1875
    :cond_4a
    sget-object v3, La/bex;->a:La/bex;

    .line 1876
    .line 1877
    goto :goto_37

    .line 1878
    :goto_38
    new-instance v37, La/cpd;

    .line 1879
    .line 1880
    move-object/from16 v56, v1

    .line 1881
    .line 1882
    move/from16 v53, v2

    .line 1883
    .line 1884
    move-object/from16 v47, v6

    .line 1885
    .line 1886
    move-object/from16 v50, v14

    .line 1887
    .line 1888
    move-object/from16 v51, v15

    .line 1889
    .line 1890
    move-object/from16 v38, v19

    .line 1891
    .line 1892
    invoke-direct/range {v37 .. v56}, La/cpd;-><init>(La/zmk0;La/zmk0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/zmk0;La/zmk0;La/zmk0;Ljava/util/ArrayList;La/zmk0;La/zmk0;La/zmk0;La/zmk0;ZZZLa/bex;Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;)V

    .line 1893
    .line 1894
    .line 1895
    move-object/from16 v1, v37

    .line 1896
    .line 1897
    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1898
    .line 1899
    .line 1900
    goto :goto_39

    .line 1901
    :cond_4b
    invoke-static {}, La/t9f;->b()V

    .line 1902
    .line 1903
    .line 1904
    return-object v18

    .line 1905
    :cond_4c
    move-object/from16 v25, v1

    .line 1906
    .line 1907
    :goto_39
    iget-object v0, v0, La/ena;->e:La/wnd;

    .line 1908
    .line 1909
    if-eqz v0, :cond_4e

    .line 1910
    .line 1911
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 1912
    .line 1913
    .line 1914
    move-result v1

    .line 1915
    iget-object v3, v0, La/wnd;->a:Ljava/lang/String;

    .line 1916
    .line 1917
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1918
    .line 1919
    .line 1920
    new-instance v14, La/zmk0;

    .line 1921
    .line 1922
    const/4 v4, -0x1

    .line 1923
    const/high16 v5, -0x40800000    # -1.0f

    .line 1924
    .line 1925
    const v6, 0x7f0606da

    .line 1926
    .line 1927
    .line 1928
    move v7, v4

    .line 1929
    move v8, v4

    .line 1930
    move-object v2, v14

    .line 1931
    invoke-direct/range {v2 .. v8}, La/zmk0;-><init>(Ljava/lang/String;IFIII)V

    .line 1932
    .line 1933
    .line 1934
    iget-object v3, v0, La/wnd;->f:Ljava/lang/String;

    .line 1935
    .line 1936
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1937
    .line 1938
    .line 1939
    new-instance v15, La/zmk0;

    .line 1940
    .line 1941
    move-object v2, v15

    .line 1942
    invoke-direct/range {v2 .. v8}, La/zmk0;-><init>(Ljava/lang/String;IFIII)V

    .line 1943
    .line 1944
    .line 1945
    iget-object v2, v0, La/wnd;->b:Ljava/lang/String;

    .line 1946
    .line 1947
    iget-object v3, v0, La/wnd;->g:Ljava/lang/String;

    .line 1948
    .line 1949
    invoke-static/range {v25 .. v25}, La/pzb;->O(La/pz10;)La/zmk0;

    .line 1950
    .line 1951
    .line 1952
    move-result-object v18

    .line 1953
    invoke-static/range {v25 .. v25}, La/pzb;->R(La/pz10;)La/zmk0;

    .line 1954
    .line 1955
    .line 1956
    move-result-object v19

    .line 1957
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 1958
    .line 1959
    .line 1960
    move-result-object v4

    .line 1961
    iget v5, v0, La/wnd;->e:I

    .line 1962
    .line 1963
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1964
    .line 1965
    .line 1966
    move-result-object v27

    .line 1967
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1968
    .line 1969
    .line 1970
    new-instance v26, La/zmk0;

    .line 1971
    .line 1972
    const/16 v28, -0x1

    .line 1973
    .line 1974
    const/high16 v29, -0x40800000    # -1.0f

    .line 1975
    .line 1976
    const v30, 0x7f0606da

    .line 1977
    .line 1978
    .line 1979
    move/from16 v31, v28

    .line 1980
    .line 1981
    move/from16 v32, v28

    .line 1982
    .line 1983
    invoke-direct/range {v26 .. v32}, La/zmk0;-><init>(Ljava/lang/String;IFIII)V

    .line 1984
    .line 1985
    .line 1986
    move-object/from16 v5, v26

    .line 1987
    .line 1988
    iget v6, v0, La/wnd;->j:I

    .line 1989
    .line 1990
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1991
    .line 1992
    .line 1993
    move-result-object v27

    .line 1994
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1995
    .line 1996
    .line 1997
    new-instance v26, La/zmk0;

    .line 1998
    .line 1999
    invoke-direct/range {v26 .. v32}, La/zmk0;-><init>(Ljava/lang/String;IFIII)V

    .line 2000
    .line 2001
    .line 2002
    move-object/from16 v6, v26

    .line 2003
    .line 2004
    new-instance v7, La/ee90;

    .line 2005
    .line 2006
    const v8, 0x7f080b60

    .line 2007
    .line 2008
    .line 2009
    invoke-direct {v7, v8, v5, v6}, La/ee90;-><init>(ILa/zmk0;La/zmk0;)V

    .line 2010
    .line 2011
    .line 2012
    invoke-virtual {v4, v7}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2013
    .line 2014
    .line 2015
    iget v5, v0, La/wnd;->d:I

    .line 2016
    .line 2017
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 2018
    .line 2019
    .line 2020
    move-result-object v27

    .line 2021
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2022
    .line 2023
    .line 2024
    new-instance v26, La/zmk0;

    .line 2025
    .line 2026
    invoke-direct/range {v26 .. v32}, La/zmk0;-><init>(Ljava/lang/String;IFIII)V

    .line 2027
    .line 2028
    .line 2029
    move-object/from16 v5, v26

    .line 2030
    .line 2031
    iget v6, v0, La/wnd;->i:I

    .line 2032
    .line 2033
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 2034
    .line 2035
    .line 2036
    move-result-object v27

    .line 2037
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2038
    .line 2039
    .line 2040
    new-instance v26, La/zmk0;

    .line 2041
    .line 2042
    invoke-direct/range {v26 .. v32}, La/zmk0;-><init>(Ljava/lang/String;IFIII)V

    .line 2043
    .line 2044
    .line 2045
    move-object/from16 v6, v26

    .line 2046
    .line 2047
    new-instance v7, La/ee90;

    .line 2048
    .line 2049
    const v8, 0x7f080cef

    .line 2050
    .line 2051
    .line 2052
    invoke-direct {v7, v8, v5, v6}, La/ee90;-><init>(ILa/zmk0;La/zmk0;)V

    .line 2053
    .line 2054
    .line 2055
    invoke-virtual {v4, v7}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2056
    .line 2057
    .line 2058
    iget v5, v0, La/wnd;->c:I

    .line 2059
    .line 2060
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 2061
    .line 2062
    .line 2063
    move-result-object v27

    .line 2064
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2065
    .line 2066
    .line 2067
    new-instance v26, La/zmk0;

    .line 2068
    .line 2069
    invoke-direct/range {v26 .. v32}, La/zmk0;-><init>(Ljava/lang/String;IFIII)V

    .line 2070
    .line 2071
    .line 2072
    move-object/from16 v5, v26

    .line 2073
    .line 2074
    iget v6, v0, La/wnd;->h:I

    .line 2075
    .line 2076
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 2077
    .line 2078
    .line 2079
    move-result-object v27

    .line 2080
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2081
    .line 2082
    .line 2083
    new-instance v26, La/zmk0;

    .line 2084
    .line 2085
    invoke-direct/range {v26 .. v32}, La/zmk0;-><init>(Ljava/lang/String;IFIII)V

    .line 2086
    .line 2087
    .line 2088
    move-object/from16 v6, v26

    .line 2089
    .line 2090
    new-instance v7, La/ee90;

    .line 2091
    .line 2092
    const v8, 0x7f080723

    .line 2093
    .line 2094
    .line 2095
    invoke-direct {v7, v8, v5, v6}, La/ee90;-><init>(ILa/zmk0;La/zmk0;)V

    .line 2096
    .line 2097
    .line 2098
    invoke-virtual {v4, v7}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2099
    .line 2100
    .line 2101
    invoke-interface/range {v25 .. v25}, La/pz10;->d()Ljava/util/List;

    .line 2102
    .line 2103
    .line 2104
    move-result-object v5

    .line 2105
    new-instance v6, Ljava/util/ArrayList;

    .line 2106
    .line 2107
    const/16 v7, 0xa

    .line 2108
    .line 2109
    invoke-static {v5, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2110
    .line 2111
    .line 2112
    move-result v7

    .line 2113
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 2114
    .line 2115
    .line 2116
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2117
    .line 2118
    .line 2119
    move-result-object v5

    .line 2120
    :goto_3a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 2121
    .line 2122
    .line 2123
    move-result v7

    .line 2124
    if-eqz v7, :cond_4d

    .line 2125
    .line 2126
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2127
    .line 2128
    .line 2129
    move-result-object v7

    .line 2130
    check-cast v7, La/te90;

    .line 2131
    .line 2132
    new-instance v8, La/cf90;

    .line 2133
    .line 2134
    iget-object v9, v7, La/te90;->a:Ljava/lang/String;

    .line 2135
    .line 2136
    invoke-static {v7}, La/pzb;->P(La/te90;)La/zmk0;

    .line 2137
    .line 2138
    .line 2139
    move-result-object v10

    .line 2140
    invoke-static {v7}, La/pzb;->S(La/te90;)La/zmk0;

    .line 2141
    .line 2142
    .line 2143
    move-result-object v7

    .line 2144
    invoke-direct {v8, v9, v10, v7}, La/cf90;-><init>(Ljava/lang/String;La/zmk0;La/zmk0;)V

    .line 2145
    .line 2146
    .line 2147
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2148
    .line 2149
    .line 2150
    goto :goto_3a

    .line 2151
    :cond_4d
    invoke-virtual {v4, v6}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 2152
    .line 2153
    .line 2154
    invoke-static {v4}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 2155
    .line 2156
    .line 2157
    move-result-object v21

    .line 2158
    iget-boolean v0, v0, La/wnd;->k:Z

    .line 2159
    .line 2160
    new-instance v4, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 2161
    .line 2162
    sget-object v5, La/dja;->d:La/dja;

    .line 2163
    .line 2164
    invoke-direct {v4, v5, v1}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;-><init>(La/dja;I)V

    .line 2165
    .line 2166
    .line 2167
    new-instance v13, La/xnd;

    .line 2168
    .line 2169
    move/from16 v20, v0

    .line 2170
    .line 2171
    move-object/from16 v16, v2

    .line 2172
    .line 2173
    move-object/from16 v17, v3

    .line 2174
    .line 2175
    move-object/from16 v22, v4

    .line 2176
    .line 2177
    invoke-direct/range {v13 .. v22}, La/xnd;-><init>(La/zmk0;La/zmk0;Ljava/lang/String;Ljava/lang/String;La/zmk0;La/zmk0;ZLa/lc00;Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;)V

    .line 2178
    .line 2179
    .line 2180
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2181
    .line 2182
    .line 2183
    :cond_4e
    :goto_3b
    move-object/from16 v0, v36

    .line 2184
    .line 2185
    goto :goto_3c

    .line 2186
    :cond_4f
    invoke-static {}, La/t9f;->b()V

    .line 2187
    .line 2188
    .line 2189
    return-object v18

    .line 2190
    :cond_50
    instance-of v1, v0, La/fna;

    .line 2191
    .line 2192
    if-eqz v1, :cond_51

    .line 2193
    .line 2194
    check-cast v0, La/fna;

    .line 2195
    .line 2196
    new-instance v1, La/tnd;

    .line 2197
    .line 2198
    iget-object v0, v0, La/fna;->a:La/k3z;

    .line 2199
    .line 2200
    invoke-static {v0, v2}, La/d9x;->L(La/k3z;La/ctf0;)Ljava/lang/String;

    .line 2201
    .line 2202
    .line 2203
    move-result-object v0

    .line 2204
    new-instance v2, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 2205
    .line 2206
    sget-object v3, La/dja;->c:La/dja;

    .line 2207
    .line 2208
    const/4 v5, 0x0

    .line 2209
    invoke-direct {v2, v3, v5}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;-><init>(La/dja;I)V

    .line 2210
    .line 2211
    .line 2212
    invoke-direct {v1, v0, v2}, La/tnd;-><init>(Ljava/lang/String;Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;)V

    .line 2213
    .line 2214
    .line 2215
    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2216
    .line 2217
    .line 2218
    goto :goto_3b

    .line 2219
    :goto_3c
    invoke-direct {v0, v11, v12}, La/r0s;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 2220
    .line 2221
    .line 2222
    move-object/from16 v15, v34

    .line 2223
    .line 2224
    move-object/from16 v1, v35

    .line 2225
    .line 2226
    invoke-direct {v1, v0, v15}, La/prs;-><init>(La/r0s;La/d0k0;)V

    .line 2227
    .line 2228
    .line 2229
    return-object v1

    .line 2230
    :cond_51
    invoke-static {}, La/t9f;->b()V

    .line 2231
    .line 2232
    .line 2233
    return-object v18

    .line 2234
    :cond_52
    invoke-static {}, La/t9f;->b()V

    .line 2235
    .line 2236
    .line 2237
    :cond_53
    return-object v18
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/p4b0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/p4b0;->l:La/diu0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/util/List;

    .line 9
    .line 10
    check-cast p2, La/crp0;

    .line 11
    .line 12
    check-cast p3, La/yje;

    .line 13
    .line 14
    new-instance v0, La/p4b0;

    .line 15
    .line 16
    check-cast p0, La/urp0;

    .line 17
    .line 18
    const/16 v1, 0xe

    .line 19
    .line 20
    invoke-direct {v0, p0, p3, v1}, La/p4b0;-><init>(La/diu0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/p4b0;->j:Ljava/lang/Object;

    .line 24
    .line 25
    iput-object p2, v0, La/p4b0;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {v0, p0}, La/p4b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 35
    .line 36
    check-cast p2, Ljava/util/List;

    .line 37
    .line 38
    check-cast p3, La/yje;

    .line 39
    .line 40
    new-instance v0, La/p4b0;

    .line 41
    .line 42
    check-cast p0, La/b0p0;

    .line 43
    .line 44
    const/16 v1, 0xd

    .line 45
    .line 46
    invoke-direct {v0, p0, p3, v1}, La/p4b0;-><init>(La/diu0;La/yje;B)V

    .line 47
    .line 48
    .line 49
    iput-object p1, v0, La/p4b0;->j:Ljava/lang/Object;

    .line 50
    .line 51
    iput-object p2, v0, La/p4b0;->k:Ljava/lang/Object;

    .line 52
    .line 53
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {v0, p0}, La/p4b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_1
    check-cast p1, Ljava/util/List;

    .line 61
    .line 62
    check-cast p2, Ljava/lang/String;

    .line 63
    .line 64
    check-cast p3, La/yje;

    .line 65
    .line 66
    new-instance v0, La/p4b0;

    .line 67
    .line 68
    check-cast p0, La/rio0;

    .line 69
    .line 70
    const/16 v1, 0xc

    .line 71
    .line 72
    invoke-direct {v0, p0, p3, v1}, La/p4b0;-><init>(La/diu0;La/yje;B)V

    .line 73
    .line 74
    .line 75
    iput-object p1, v0, La/p4b0;->j:Ljava/lang/Object;

    .line 76
    .line 77
    iput-object p2, v0, La/p4b0;->k:Ljava/lang/Object;

    .line 78
    .line 79
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    invoke-virtual {v0, p0}, La/p4b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :pswitch_2
    check-cast p1, Ljava/util/List;

    .line 87
    .line 88
    check-cast p2, Ljava/lang/String;

    .line 89
    .line 90
    check-cast p3, La/yje;

    .line 91
    .line 92
    new-instance v0, La/p4b0;

    .line 93
    .line 94
    check-cast p0, La/fho0;

    .line 95
    .line 96
    const/16 v1, 0xb

    .line 97
    .line 98
    invoke-direct {v0, p0, p3, v1}, La/p4b0;-><init>(La/diu0;La/yje;B)V

    .line 99
    .line 100
    .line 101
    iput-object p1, v0, La/p4b0;->j:Ljava/lang/Object;

    .line 102
    .line 103
    iput-object p2, v0, La/p4b0;->k:Ljava/lang/Object;

    .line 104
    .line 105
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    invoke-virtual {v0, p0}, La/p4b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0

    .line 112
    :pswitch_3
    check-cast p1, La/l1q0;

    .line 113
    .line 114
    check-cast p2, La/ljj;

    .line 115
    .line 116
    check-cast p3, La/yje;

    .line 117
    .line 118
    new-instance v0, La/p4b0;

    .line 119
    .line 120
    check-cast p0, La/a3n0;

    .line 121
    .line 122
    const/16 v1, 0xa

    .line 123
    .line 124
    invoke-direct {v0, p0, p3, v1}, La/p4b0;-><init>(La/diu0;La/yje;B)V

    .line 125
    .line 126
    .line 127
    iput-object p1, v0, La/p4b0;->j:Ljava/lang/Object;

    .line 128
    .line 129
    iput-object p2, v0, La/p4b0;->k:Ljava/lang/Object;

    .line 130
    .line 131
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    invoke-virtual {v0, p0}, La/p4b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    return-object p0

    .line 138
    :pswitch_4
    check-cast p1, Ljava/util/List;

    .line 139
    .line 140
    check-cast p2, Ljava/util/List;

    .line 141
    .line 142
    check-cast p3, La/yje;

    .line 143
    .line 144
    new-instance v0, La/p4b0;

    .line 145
    .line 146
    check-cast p0, La/vsl0;

    .line 147
    .line 148
    const/16 v1, 0x9

    .line 149
    .line 150
    invoke-direct {v0, p0, p3, v1}, La/p4b0;-><init>(La/diu0;La/yje;B)V

    .line 151
    .line 152
    .line 153
    iput-object p1, v0, La/p4b0;->j:Ljava/lang/Object;

    .line 154
    .line 155
    iput-object p2, v0, La/p4b0;->k:Ljava/lang/Object;

    .line 156
    .line 157
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 158
    .line 159
    invoke-virtual {v0, p0}, La/p4b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    return-object p0

    .line 164
    :pswitch_5
    check-cast p1, La/yqs;

    .line 165
    .line 166
    check-cast p2, Ljava/util/List;

    .line 167
    .line 168
    check-cast p3, La/yje;

    .line 169
    .line 170
    new-instance v0, La/p4b0;

    .line 171
    .line 172
    check-cast p0, La/ncl0;

    .line 173
    .line 174
    const/16 v1, 0x8

    .line 175
    .line 176
    invoke-direct {v0, p0, p3, v1}, La/p4b0;-><init>(La/diu0;La/yje;B)V

    .line 177
    .line 178
    .line 179
    iput-object p1, v0, La/p4b0;->k:Ljava/lang/Object;

    .line 180
    .line 181
    iput-object p2, v0, La/p4b0;->j:Ljava/lang/Object;

    .line 182
    .line 183
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 184
    .line 185
    invoke-virtual {v0, p0}, La/p4b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    return-object p0

    .line 190
    :pswitch_6
    check-cast p1, La/uwk0;

    .line 191
    .line 192
    check-cast p2, La/ktk0;

    .line 193
    .line 194
    check-cast p3, La/yje;

    .line 195
    .line 196
    new-instance v0, La/p4b0;

    .line 197
    .line 198
    check-cast p0, La/iwk0;

    .line 199
    .line 200
    const/4 v1, 0x7

    .line 201
    invoke-direct {v0, p0, p3, v1}, La/p4b0;-><init>(La/diu0;La/yje;B)V

    .line 202
    .line 203
    .line 204
    iput-object p1, v0, La/p4b0;->j:Ljava/lang/Object;

    .line 205
    .line 206
    iput-object p2, v0, La/p4b0;->k:Ljava/lang/Object;

    .line 207
    .line 208
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 209
    .line 210
    invoke-virtual {v0, p0}, La/p4b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    return-object p0

    .line 215
    :pswitch_7
    check-cast p1, La/od7;

    .line 216
    .line 217
    check-cast p2, La/ql5;

    .line 218
    .line 219
    check-cast p3, La/yje;

    .line 220
    .line 221
    new-instance v0, La/p4b0;

    .line 222
    .line 223
    check-cast p0, La/wyj0;

    .line 224
    .line 225
    const/4 v1, 0x6

    .line 226
    invoke-direct {v0, p0, p3, v1}, La/p4b0;-><init>(La/diu0;La/yje;B)V

    .line 227
    .line 228
    .line 229
    iput-object p1, v0, La/p4b0;->j:Ljava/lang/Object;

    .line 230
    .line 231
    iput-object p2, v0, La/p4b0;->k:Ljava/lang/Object;

    .line 232
    .line 233
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 234
    .line 235
    invoke-virtual {v0, p0}, La/p4b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    return-object p0

    .line 240
    :pswitch_8
    check-cast p1, Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;

    .line 241
    .line 242
    check-cast p2, La/n0d;

    .line 243
    .line 244
    check-cast p3, La/yje;

    .line 245
    .line 246
    new-instance v0, La/p4b0;

    .line 247
    .line 248
    check-cast p0, La/yxj0;

    .line 249
    .line 250
    const/4 v1, 0x5

    .line 251
    invoke-direct {v0, p0, p3, v1}, La/p4b0;-><init>(La/diu0;La/yje;B)V

    .line 252
    .line 253
    .line 254
    iput-object p1, v0, La/p4b0;->j:Ljava/lang/Object;

    .line 255
    .line 256
    iput-object p2, v0, La/p4b0;->k:Ljava/lang/Object;

    .line 257
    .line 258
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 259
    .line 260
    invoke-virtual {v0, p0}, La/p4b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    return-object p0

    .line 265
    :pswitch_9
    check-cast p1, Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;

    .line 266
    .line 267
    check-cast p2, La/ql5;

    .line 268
    .line 269
    check-cast p3, La/yje;

    .line 270
    .line 271
    new-instance v0, La/p4b0;

    .line 272
    .line 273
    check-cast p0, La/yxj0;

    .line 274
    .line 275
    const/4 v1, 0x4

    .line 276
    invoke-direct {v0, p0, p3, v1}, La/p4b0;-><init>(La/diu0;La/yje;B)V

    .line 277
    .line 278
    .line 279
    iput-object p1, v0, La/p4b0;->j:Ljava/lang/Object;

    .line 280
    .line 281
    iput-object p2, v0, La/p4b0;->k:Ljava/lang/Object;

    .line 282
    .line 283
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 284
    .line 285
    invoke-virtual {v0, p0}, La/p4b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object p0

    .line 289
    return-object p0

    .line 290
    :pswitch_a
    check-cast p1, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 291
    .line 292
    check-cast p2, La/ql5;

    .line 293
    .line 294
    check-cast p3, La/yje;

    .line 295
    .line 296
    new-instance v0, La/p4b0;

    .line 297
    .line 298
    check-cast p0, La/xxj0;

    .line 299
    .line 300
    const/4 v1, 0x3

    .line 301
    invoke-direct {v0, p0, p3, v1}, La/p4b0;-><init>(La/diu0;La/yje;B)V

    .line 302
    .line 303
    .line 304
    iput-object p1, v0, La/p4b0;->j:Ljava/lang/Object;

    .line 305
    .line 306
    iput-object p2, v0, La/p4b0;->k:Ljava/lang/Object;

    .line 307
    .line 308
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 309
    .line 310
    invoke-virtual {v0, p0}, La/p4b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object p0

    .line 314
    return-object p0

    .line 315
    :pswitch_b
    check-cast p1, Ljava/util/List;

    .line 316
    .line 317
    check-cast p2, Ljava/util/Set;

    .line 318
    .line 319
    check-cast p3, La/yje;

    .line 320
    .line 321
    new-instance v0, La/p4b0;

    .line 322
    .line 323
    check-cast p0, La/p1i0;

    .line 324
    .line 325
    const/4 v1, 0x2

    .line 326
    invoke-direct {v0, p0, p3, v1}, La/p4b0;-><init>(La/diu0;La/yje;B)V

    .line 327
    .line 328
    .line 329
    iput-object p1, v0, La/p4b0;->j:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast p2, Ljava/util/Set;

    .line 332
    .line 333
    iput-object p2, v0, La/p4b0;->k:Ljava/lang/Object;

    .line 334
    .line 335
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 336
    .line 337
    invoke-virtual {v0, p0}, La/p4b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object p0

    .line 341
    return-object p0

    .line 342
    :pswitch_c
    check-cast p1, Ljava/util/List;

    .line 343
    .line 344
    check-cast p2, La/v5g0;

    .line 345
    .line 346
    check-cast p3, La/yje;

    .line 347
    .line 348
    new-instance v0, La/p4b0;

    .line 349
    .line 350
    check-cast p0, La/o9g0;

    .line 351
    .line 352
    const/4 v1, 0x1

    .line 353
    invoke-direct {v0, p0, p3, v1}, La/p4b0;-><init>(La/diu0;La/yje;B)V

    .line 354
    .line 355
    .line 356
    iput-object p1, v0, La/p4b0;->j:Ljava/lang/Object;

    .line 357
    .line 358
    iput-object p2, v0, La/p4b0;->k:Ljava/lang/Object;

    .line 359
    .line 360
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 361
    .line 362
    invoke-virtual {v0, p0}, La/p4b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object p0

    .line 366
    return-object p0

    .line 367
    :pswitch_d
    check-cast p1, Ljava/util/List;

    .line 368
    .line 369
    check-cast p2, Ljava/util/Set;

    .line 370
    .line 371
    check-cast p3, La/yje;

    .line 372
    .line 373
    new-instance v0, La/p4b0;

    .line 374
    .line 375
    check-cast p0, La/r4b0;

    .line 376
    .line 377
    const/4 v1, 0x0

    .line 378
    invoke-direct {v0, p0, p3, v1}, La/p4b0;-><init>(La/diu0;La/yje;B)V

    .line 379
    .line 380
    .line 381
    iput-object p1, v0, La/p4b0;->j:Ljava/lang/Object;

    .line 382
    .line 383
    check-cast p2, Ljava/util/Set;

    .line 384
    .line 385
    iput-object p2, v0, La/p4b0;->k:Ljava/lang/Object;

    .line 386
    .line 387
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 388
    .line 389
    invoke-virtual {v0, p0}, La/p4b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object p0

    .line 393
    return-object p0

    .line 394
    nop

    .line 395
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/p4b0;->i:B

    .line 4
    .line 5
    const-wide/16 v2, -0x141

    .line 6
    .line 7
    const v4, 0x7f0807fe

    .line 8
    .line 9
    .line 10
    const v5, 0x7f0807fc

    .line 11
    .line 12
    .line 13
    const v6, 0x7f130eb5

    .line 14
    .line 15
    .line 16
    const/16 v7, 0xa

    .line 17
    .line 18
    const/4 v8, 0x6

    .line 19
    const/4 v9, 0x1

    .line 20
    const-wide/16 v10, 0x0

    .line 21
    .line 22
    const/4 v12, 0x0

    .line 23
    const/4 v13, 0x0

    .line 24
    iget-object v14, v0, La/p4b0;->l:La/diu0;

    .line 25
    .line 26
    packed-switch v1, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    iget-object v1, v0, La/p4b0;->j:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Ljava/util/List;

    .line 32
    .line 33
    iget-object v0, v0, La/p4b0;->k:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, La/crp0;

    .line 36
    .line 37
    sget-object v2, La/wne;->a:La/wne;

    .line 38
    .line 39
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    check-cast v14, La/urp0;

    .line 43
    .line 44
    invoke-static {v1, v7}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    new-instance v3, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-static {v2, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 55
    .line 56
    .line 57
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    if-eqz v4, :cond_0

    .line 66
    .line 67
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    check-cast v4, La/rfp0;

    .line 72
    .line 73
    iget v4, v4, La/rfp0;->b:I

    .line 74
    .line 75
    new-instance v5, Ljava/lang/Integer;

    .line 76
    .line 77
    invoke-direct {v5, v4}, Ljava/lang/Integer;-><init>(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    iput-object v3, v14, La/urp0;->r:Ljava/util/List;

    .line 85
    .line 86
    invoke-virtual {v14, v0}, La/urp0;->E(La/erp0;)V

    .line 87
    .line 88
    .line 89
    new-instance v2, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-static {v1, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 96
    .line 97
    .line 98
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-eqz v3, :cond_3

    .line 107
    .line 108
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    check-cast v3, La/rfp0;

    .line 113
    .line 114
    iget-object v4, v0, La/crp0;->a:Ljava/util/Set;

    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    iget v5, v3, La/rfp0;->b:I

    .line 123
    .line 124
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v18

    .line 132
    new-instance v14, La/tjp0;

    .line 133
    .line 134
    iget v15, v3, La/rfp0;->b:I

    .line 135
    .line 136
    iget-object v5, v3, La/rfp0;->c:Ljava/lang/String;

    .line 137
    .line 138
    iget-object v3, v3, La/rfp0;->d:Ljava/lang/String;

    .line 139
    .line 140
    int-to-long v10, v15

    .line 141
    invoke-static {v10, v11, v3}, La/vsm0;->s(JLjava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v17

    .line 145
    if-nez v18, :cond_2

    .line 146
    .line 147
    invoke-interface {v4}, Ljava/util/Set;->size()I

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    if-ge v3, v7, :cond_1

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_1
    move/from16 v19, v13

    .line 155
    .line 156
    :goto_2
    move-object/from16 v16, v5

    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_2
    :goto_3
    move/from16 v19, v9

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :goto_4
    invoke-direct/range {v14 .. v19}, La/tjp0;-><init>(ILjava/lang/String;Ljava/lang/String;ZZ)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_3
    return-object v2

    .line 170
    :pswitch_0
    iget-object v1, v0, La/p4b0;->j:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v1, Ljava/util/List;

    .line 173
    .line 174
    iget-object v0, v0, La/p4b0;->k:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v0, Ljava/util/List;

    .line 177
    .line 178
    sget-object v2, La/wne;->a:La/wne;

    .line 179
    .line 180
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    sget v2, La/b0p0;->I:I

    .line 184
    .line 185
    new-instance v2, La/tgo0;

    .line 186
    .line 187
    invoke-direct {v2, v8}, La/tgo0;-><init>(B)V

    .line 188
    .line 189
    .line 190
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    new-instance v2, La/tgo0;

    .line 195
    .line 196
    const/4 v3, 0x7

    .line 197
    invoke-direct {v2, v3}, La/tgo0;-><init>(B)V

    .line 198
    .line 199
    .line 200
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    check-cast v1, La/d0t;

    .line 209
    .line 210
    if-nez v1, :cond_4

    .line 211
    .line 212
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    check-cast v1, La/d0t;

    .line 217
    .line 218
    :cond_4
    new-instance v2, Ljava/util/ArrayList;

    .line 219
    .line 220
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 221
    .line 222
    .line 223
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    if-eqz v3, :cond_6

    .line 232
    .line 233
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    move-object v4, v3

    .line 238
    check-cast v4, La/d0t;

    .line 239
    .line 240
    if-eqz v1, :cond_5

    .line 241
    .line 242
    iget-wide v4, v4, La/d0t;->a:J

    .line 243
    .line 244
    iget-wide v6, v1, La/d0t;->a:J

    .line 245
    .line 246
    cmp-long v4, v4, v6

    .line 247
    .line 248
    if-nez v4, :cond_5

    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_5
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    goto :goto_5

    .line 255
    :cond_6
    new-instance v0, La/jzo0;

    .line 256
    .line 257
    invoke-direct {v0, v1, v2}, La/jzo0;-><init>(La/d0t;Ljava/util/ArrayList;)V

    .line 258
    .line 259
    .line 260
    return-object v0

    .line 261
    :pswitch_1
    iget-object v1, v0, La/p4b0;->j:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v1, Ljava/util/List;

    .line 264
    .line 265
    iget-object v0, v0, La/p4b0;->k:Ljava/lang/Object;

    .line 266
    .line 267
    move-object/from16 v20, v0

    .line 268
    .line 269
    check-cast v20, Ljava/lang/String;

    .line 270
    .line 271
    sget-object v0, La/wne;->a:La/wne;

    .line 272
    .line 273
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    check-cast v14, La/rio0;

    .line 277
    .line 278
    sget-object v0, La/iz30;->y:La/iz30;

    .line 279
    .line 280
    new-instance v21, La/gy30;

    .line 281
    .line 282
    new-instance v15, La/ux30;

    .line 283
    .line 284
    iget-object v2, v14, La/rio0;->x:La/ctf0;

    .line 285
    .line 286
    new-array v3, v13, [Ljava/lang/Object;

    .line 287
    .line 288
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 289
    .line 290
    invoke-static {v3, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v3

    .line 294
    invoke-virtual {v2, v6, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v19

    .line 298
    const-wide/16 v17, 0x0

    .line 299
    .line 300
    const/16 v16, 0xa

    .line 301
    .line 302
    invoke-direct/range {v15 .. v20}, La/ux30;-><init>(IJLjava/lang/String;Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    sget-object v2, La/qmk;->a:La/zcl;

    .line 306
    .line 307
    new-instance v2, La/m0x;

    .line 308
    .line 309
    invoke-direct {v2, v5, v12, v8}, La/m0x;-><init>(ILa/bzw;I)V

    .line 310
    .line 311
    .line 312
    new-instance v22, La/qx30;

    .line 313
    .line 314
    const-wide/16 v24, 0x0

    .line 315
    .line 316
    const/16 v29, 0x12

    .line 317
    .line 318
    sget-object v26, La/liz;->a:La/liz;

    .line 319
    .line 320
    const v27, 0x7f0807fc

    .line 321
    .line 322
    .line 323
    const/high16 v28, 0x42400000    # 48.0f

    .line 324
    .line 325
    move-object/from16 v23, v2

    .line 326
    .line 327
    invoke-direct/range {v22 .. v29}, La/qx30;-><init>(La/o0x;JLa/miz;IFI)V

    .line 328
    .line 329
    .line 330
    new-instance v2, La/ay30;

    .line 331
    .line 332
    new-instance v3, La/m0x;

    .line 333
    .line 334
    invoke-direct {v3, v4, v12, v8}, La/m0x;-><init>(ILa/bzw;I)V

    .line 335
    .line 336
    .line 337
    invoke-direct {v2, v3}, La/ay30;-><init>(La/m0x;)V

    .line 338
    .line 339
    .line 340
    const/16 v28, 0x0

    .line 341
    .line 342
    const/16 v29, 0xf8

    .line 343
    .line 344
    const-wide/16 v25, 0x0

    .line 345
    .line 346
    const/16 v27, 0x0

    .line 347
    .line 348
    move-object/from16 v24, v2

    .line 349
    .line 350
    move-object/from16 v23, v22

    .line 351
    .line 352
    move-object/from16 v22, v15

    .line 353
    .line 354
    invoke-direct/range {v21 .. v29}, La/gy30;-><init>(La/wx30;La/sx30;La/fy30;JLjava/util/List;La/xx30;I)V

    .line 355
    .line 356
    .line 357
    move-object/from16 v2, v21

    .line 358
    .line 359
    sget-object v3, La/r040;->i:La/r040;

    .line 360
    .line 361
    new-instance v4, La/i140;

    .line 362
    .line 363
    invoke-direct {v4, v13, v0, v3, v2}, La/i140;-><init>(ZLa/iz30;La/r040;La/gy30;)V

    .line 364
    .line 365
    .line 366
    invoke-static {v4}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    return-object v0

    .line 375
    :pswitch_2
    iget-object v1, v0, La/p4b0;->j:Ljava/lang/Object;

    .line 376
    .line 377
    check-cast v1, Ljava/util/List;

    .line 378
    .line 379
    iget-object v0, v0, La/p4b0;->k:Ljava/lang/Object;

    .line 380
    .line 381
    move-object/from16 v20, v0

    .line 382
    .line 383
    check-cast v20, Ljava/lang/String;

    .line 384
    .line 385
    sget-object v0, La/wne;->a:La/wne;

    .line 386
    .line 387
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 388
    .line 389
    .line 390
    check-cast v14, La/fho0;

    .line 391
    .line 392
    sget-object v0, La/iz30;->y:La/iz30;

    .line 393
    .line 394
    new-instance v21, La/gy30;

    .line 395
    .line 396
    new-instance v15, La/ux30;

    .line 397
    .line 398
    iget-object v2, v14, La/fho0;->w:La/ctf0;

    .line 399
    .line 400
    new-array v3, v13, [Ljava/lang/Object;

    .line 401
    .line 402
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 403
    .line 404
    invoke-static {v3, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    invoke-virtual {v2, v6, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v19

    .line 412
    const-wide/16 v17, 0x0

    .line 413
    .line 414
    const/16 v16, 0xa

    .line 415
    .line 416
    invoke-direct/range {v15 .. v20}, La/ux30;-><init>(IJLjava/lang/String;Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    sget-object v2, La/qmk;->a:La/zcl;

    .line 420
    .line 421
    new-instance v2, La/m0x;

    .line 422
    .line 423
    invoke-direct {v2, v5, v12, v8}, La/m0x;-><init>(ILa/bzw;I)V

    .line 424
    .line 425
    .line 426
    new-instance v22, La/qx30;

    .line 427
    .line 428
    const-wide/16 v24, 0x0

    .line 429
    .line 430
    const/16 v29, 0x12

    .line 431
    .line 432
    sget-object v26, La/liz;->a:La/liz;

    .line 433
    .line 434
    const v27, 0x7f0807fc

    .line 435
    .line 436
    .line 437
    const/high16 v28, 0x42400000    # 48.0f

    .line 438
    .line 439
    move-object/from16 v23, v2

    .line 440
    .line 441
    invoke-direct/range {v22 .. v29}, La/qx30;-><init>(La/o0x;JLa/miz;IFI)V

    .line 442
    .line 443
    .line 444
    new-instance v2, La/ay30;

    .line 445
    .line 446
    new-instance v3, La/m0x;

    .line 447
    .line 448
    invoke-direct {v3, v4, v12, v8}, La/m0x;-><init>(ILa/bzw;I)V

    .line 449
    .line 450
    .line 451
    invoke-direct {v2, v3}, La/ay30;-><init>(La/m0x;)V

    .line 452
    .line 453
    .line 454
    const/16 v28, 0x0

    .line 455
    .line 456
    const/16 v29, 0xf8

    .line 457
    .line 458
    const-wide/16 v25, 0x0

    .line 459
    .line 460
    const/16 v27, 0x0

    .line 461
    .line 462
    move-object/from16 v24, v2

    .line 463
    .line 464
    move-object/from16 v23, v22

    .line 465
    .line 466
    move-object/from16 v22, v15

    .line 467
    .line 468
    invoke-direct/range {v21 .. v29}, La/gy30;-><init>(La/wx30;La/sx30;La/fy30;JLjava/util/List;La/xx30;I)V

    .line 469
    .line 470
    .line 471
    move-object/from16 v2, v21

    .line 472
    .line 473
    sget-object v3, La/r040;->i:La/r040;

    .line 474
    .line 475
    new-instance v4, La/i140;

    .line 476
    .line 477
    invoke-direct {v4, v13, v0, v3, v2}, La/i140;-><init>(ZLa/iz30;La/r040;La/gy30;)V

    .line 478
    .line 479
    .line 480
    invoke-static {v4}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    return-object v0

    .line 489
    :pswitch_3
    iget-object v1, v0, La/p4b0;->j:Ljava/lang/Object;

    .line 490
    .line 491
    check-cast v1, La/l1q0;

    .line 492
    .line 493
    iget-object v0, v0, La/p4b0;->k:Ljava/lang/Object;

    .line 494
    .line 495
    move-object/from16 v22, v0

    .line 496
    .line 497
    check-cast v22, La/ljj;

    .line 498
    .line 499
    sget-object v0, La/wne;->a:La/wne;

    .line 500
    .line 501
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 502
    .line 503
    .line 504
    check-cast v14, La/a3n0;

    .line 505
    .line 506
    iget-object v0, v14, La/a3n0;->w:La/dot;

    .line 507
    .line 508
    iget-object v0, v0, La/dot;->a:La/j1q0;

    .line 509
    .line 510
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 511
    .line 512
    invoke-virtual {v0}, La/m1q0;->n()La/z0q0;

    .line 513
    .line 514
    .line 515
    move-result-object v17

    .line 516
    iget-object v0, v1, La/l1q0;->l:La/cre;

    .line 517
    .line 518
    iput-object v0, v14, La/a3n0;->L:La/cre;

    .line 519
    .line 520
    iget-object v0, v14, La/i3t0;->i:La/ocj;

    .line 521
    .line 522
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 523
    .line 524
    :goto_6
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 529
    .line 530
    .line 531
    move-object v15, v0

    .line 532
    check-cast v15, La/w0n0;

    .line 533
    .line 534
    iget-object v3, v1, La/l1q0;->w:Ljava/lang/String;

    .line 535
    .line 536
    iget-object v4, v1, La/l1q0;->i:Ljava/lang/String;

    .line 537
    .line 538
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 539
    .line 540
    .line 541
    move-result v5

    .line 542
    if-lez v5, :cond_7

    .line 543
    .line 544
    move/from16 v20, v9

    .line 545
    .line 546
    goto :goto_7

    .line 547
    :cond_7
    move/from16 v20, v13

    .line 548
    .line 549
    :goto_7
    const/16 v21, 0x0

    .line 550
    .line 551
    const/16 v23, 0x41

    .line 552
    .line 553
    move-object/from16 v16, v1

    .line 554
    .line 555
    move-object/from16 v18, v3

    .line 556
    .line 557
    move-object/from16 v19, v4

    .line 558
    .line 559
    invoke-static/range {v15 .. v23}, La/w0n0;->a(La/w0n0;La/l1q0;La/z0q0;Ljava/lang/String;Ljava/lang/String;ZILa/ljj;I)La/w0n0;

    .line 560
    .line 561
    .line 562
    move-result-object v1

    .line 563
    invoke-virtual {v2, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 564
    .line 565
    .line 566
    move-result v0

    .line 567
    if-eqz v0, :cond_8

    .line 568
    .line 569
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 570
    .line 571
    return-object v0

    .line 572
    :cond_8
    move-object/from16 v1, v16

    .line 573
    .line 574
    goto :goto_6

    .line 575
    :pswitch_4
    iget-object v1, v0, La/p4b0;->j:Ljava/lang/Object;

    .line 576
    .line 577
    move-object v3, v1

    .line 578
    check-cast v3, Ljava/util/List;

    .line 579
    .line 580
    iget-object v0, v0, La/p4b0;->k:Ljava/lang/Object;

    .line 581
    .line 582
    move-object v4, v0

    .line 583
    check-cast v4, Ljava/util/List;

    .line 584
    .line 585
    sget-object v0, La/wne;->a:La/wne;

    .line 586
    .line 587
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 588
    .line 589
    .line 590
    check-cast v14, La/vsl0;

    .line 591
    .line 592
    sget v0, La/vsl0;->F:I

    .line 593
    .line 594
    iget-object v0, v14, La/i3t0;->i:La/ocj;

    .line 595
    .line 596
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 597
    .line 598
    :cond_9
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 603
    .line 604
    .line 605
    move-object v2, v0

    .line 606
    check-cast v2, La/lsl0;

    .line 607
    .line 608
    const/4 v11, 0x0

    .line 609
    const/16 v12, 0x1ffc

    .line 610
    .line 611
    const/4 v5, 0x0

    .line 612
    const/4 v6, 0x0

    .line 613
    const/4 v7, 0x0

    .line 614
    const/4 v8, 0x0

    .line 615
    const/4 v9, 0x0

    .line 616
    const/4 v10, 0x0

    .line 617
    invoke-static/range {v2 .. v12}, La/lsl0;->a(La/lsl0;Ljava/util/List;Ljava/util/List;ZZZZZLjava/util/List;Ljava/util/List;I)La/lsl0;

    .line 618
    .line 619
    .line 620
    move-result-object v2

    .line 621
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 622
    .line 623
    .line 624
    move-result v0

    .line 625
    if-eqz v0, :cond_9

    .line 626
    .line 627
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 628
    .line 629
    return-object v0

    .line 630
    :pswitch_5
    invoke-direct/range {p0 .. p1}, La/p4b0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    return-object v0

    .line 635
    :pswitch_6
    check-cast v14, La/iwk0;

    .line 636
    .line 637
    iget-object v1, v0, La/p4b0;->j:Ljava/lang/Object;

    .line 638
    .line 639
    check-cast v1, La/uwk0;

    .line 640
    .line 641
    iget-object v0, v0, La/p4b0;->k:Ljava/lang/Object;

    .line 642
    .line 643
    check-cast v0, La/ktk0;

    .line 644
    .line 645
    sget-object v4, La/wne;->a:La/wne;

    .line 646
    .line 647
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 648
    .line 649
    .line 650
    instance-of v4, v1, La/twk0;

    .line 651
    .line 652
    if-eqz v4, :cond_18

    .line 653
    .line 654
    iget-object v4, v14, La/iwk0;->s0:La/gst;

    .line 655
    .line 656
    check-cast v1, La/twk0;

    .line 657
    .line 658
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 659
    .line 660
    .line 661
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 662
    .line 663
    .line 664
    iget-wide v4, v0, La/ktk0;->b:J

    .line 665
    .line 666
    iget-object v6, v0, La/ktk0;->a:Ljava/util/Date;

    .line 667
    .line 668
    iget-object v7, v1, La/twk0;->a:Ljava/util/List;

    .line 669
    .line 670
    invoke-static {v7, v0}, La/gst;->e(Ljava/util/List;La/ktk0;)Ljava/util/ArrayList;

    .line 671
    .line 672
    .line 673
    move-result-object v17

    .line 674
    iget-object v7, v1, La/twk0;->b:Ljava/util/List;

    .line 675
    .line 676
    invoke-static {v7, v0}, La/gst;->e(Ljava/util/List;La/ktk0;)Ljava/util/ArrayList;

    .line 677
    .line 678
    .line 679
    move-result-object v18

    .line 680
    iget-object v0, v1, La/twk0;->c:Ljava/util/List;

    .line 681
    .line 682
    new-instance v7, Ljava/util/ArrayList;

    .line 683
    .line 684
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 685
    .line 686
    .line 687
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 688
    .line 689
    .line 690
    move-result-object v0

    .line 691
    :cond_a
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 692
    .line 693
    .line 694
    move-result v8

    .line 695
    if-eqz v8, :cond_b

    .line 696
    .line 697
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-result-object v8

    .line 701
    move-object v9, v8

    .line 702
    check-cast v9, La/d2w;

    .line 703
    .line 704
    instance-of v9, v9, La/z1w;

    .line 705
    .line 706
    if-nez v9, :cond_a

    .line 707
    .line 708
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 709
    .line 710
    .line 711
    goto :goto_8

    .line 712
    :cond_b
    new-instance v0, Ljava/util/ArrayList;

    .line 713
    .line 714
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 715
    .line 716
    .line 717
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 718
    .line 719
    .line 720
    move-result-object v7

    .line 721
    :cond_c
    :goto_9
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 722
    .line 723
    .line 724
    move-result v8

    .line 725
    if-eqz v8, :cond_e

    .line 726
    .line 727
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 728
    .line 729
    .line 730
    move-result-object v8

    .line 731
    move-object v9, v8

    .line 732
    check-cast v9, La/d2w;

    .line 733
    .line 734
    cmp-long v10, v4, v2

    .line 735
    .line 736
    if-nez v10, :cond_d

    .line 737
    .line 738
    goto :goto_a

    .line 739
    :cond_d
    invoke-virtual {v9}, La/d2w;->d()J

    .line 740
    .line 741
    .line 742
    move-result-wide v9

    .line 743
    cmp-long v9, v9, v4

    .line 744
    .line 745
    if-nez v9, :cond_c

    .line 746
    .line 747
    :goto_a
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 748
    .line 749
    .line 750
    goto :goto_9

    .line 751
    :cond_e
    new-instance v2, Ljava/util/ArrayList;

    .line 752
    .line 753
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 754
    .line 755
    .line 756
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 757
    .line 758
    .line 759
    move-result-object v0

    .line 760
    :cond_f
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 761
    .line 762
    .line 763
    move-result v3

    .line 764
    if-eqz v3, :cond_15

    .line 765
    .line 766
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 767
    .line 768
    .line 769
    move-result-object v3

    .line 770
    move-object v4, v3

    .line 771
    check-cast v4, La/d2w;

    .line 772
    .line 773
    if-nez v4, :cond_10

    .line 774
    .line 775
    goto :goto_c

    .line 776
    :cond_10
    instance-of v5, v4, La/u1w;

    .line 777
    .line 778
    if-eqz v5, :cond_11

    .line 779
    .line 780
    check-cast v4, La/u1w;

    .line 781
    .line 782
    iget-wide v4, v4, La/u1w;->l:J

    .line 783
    .line 784
    invoke-static {v4, v5}, La/gst;->f(J)Ljava/util/Date;

    .line 785
    .line 786
    .line 787
    move-result-object v4

    .line 788
    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 789
    .line 790
    .line 791
    move-result v4

    .line 792
    goto :goto_d

    .line 793
    :cond_11
    instance-of v5, v4, La/x1w;

    .line 794
    .line 795
    if-eqz v5, :cond_12

    .line 796
    .line 797
    check-cast v4, La/x1w;

    .line 798
    .line 799
    iget-wide v4, v4, La/x1w;->l:J

    .line 800
    .line 801
    invoke-static {v4, v5}, La/gst;->f(J)Ljava/util/Date;

    .line 802
    .line 803
    .line 804
    move-result-object v4

    .line 805
    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 806
    .line 807
    .line 808
    move-result v4

    .line 809
    goto :goto_d

    .line 810
    :cond_12
    instance-of v5, v4, La/y1w;

    .line 811
    .line 812
    if-eqz v5, :cond_13

    .line 813
    .line 814
    check-cast v4, La/y1w;

    .line 815
    .line 816
    iget-wide v4, v4, La/y1w;->l:J

    .line 817
    .line 818
    invoke-static {v4, v5}, La/gst;->f(J)Ljava/util/Date;

    .line 819
    .line 820
    .line 821
    move-result-object v4

    .line 822
    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 823
    .line 824
    .line 825
    move-result v4

    .line 826
    goto :goto_d

    .line 827
    :cond_13
    instance-of v5, v4, La/c2w;

    .line 828
    .line 829
    if-eqz v5, :cond_14

    .line 830
    .line 831
    check-cast v4, La/c2w;

    .line 832
    .line 833
    iget-wide v4, v4, La/c2w;->l:J

    .line 834
    .line 835
    invoke-static {v4, v5}, La/gst;->f(J)Ljava/util/Date;

    .line 836
    .line 837
    .line 838
    move-result-object v4

    .line 839
    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 840
    .line 841
    .line 842
    move-result v4

    .line 843
    goto :goto_d

    .line 844
    :cond_14
    :goto_c
    move v4, v13

    .line 845
    :goto_d
    if-eqz v4, :cond_f

    .line 846
    .line 847
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 848
    .line 849
    .line 850
    goto :goto_b

    .line 851
    :cond_15
    new-instance v0, Ljava/util/ArrayList;

    .line 852
    .line 853
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 854
    .line 855
    .line 856
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 857
    .line 858
    .line 859
    move-result-object v2

    .line 860
    :cond_16
    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 861
    .line 862
    .line 863
    move-result v3

    .line 864
    if-eqz v3, :cond_17

    .line 865
    .line 866
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 867
    .line 868
    .line 869
    move-result-object v3

    .line 870
    move-object v4, v3

    .line 871
    check-cast v4, La/d2w;

    .line 872
    .line 873
    instance-of v4, v4, La/z1w;

    .line 874
    .line 875
    if-nez v4, :cond_16

    .line 876
    .line 877
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 878
    .line 879
    .line 880
    goto :goto_e

    .line 881
    :cond_17
    iget-boolean v1, v1, La/twk0;->d:Z

    .line 882
    .line 883
    new-instance v15, La/xrk0;

    .line 884
    .line 885
    sget-object v16, La/ysk0;->a:La/ysk0;

    .line 886
    .line 887
    move-object/from16 v19, v0

    .line 888
    .line 889
    move/from16 v20, v1

    .line 890
    .line 891
    invoke-direct/range {v15 .. v20}, La/xrk0;-><init>(La/btk0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Z)V

    .line 892
    .line 893
    .line 894
    invoke-virtual {v14, v15}, La/iwk0;->W(La/usk0;)V

    .line 895
    .line 896
    .line 897
    goto :goto_f

    .line 898
    :cond_18
    sget-object v0, La/swk0;->a:La/swk0;

    .line 899
    .line 900
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 901
    .line 902
    .line 903
    move-result v0

    .line 904
    if-eqz v0, :cond_19

    .line 905
    .line 906
    new-instance v2, La/xrk0;

    .line 907
    .line 908
    sget-object v4, La/iun;->a:La/iun;

    .line 909
    .line 910
    const/4 v7, 0x0

    .line 911
    sget-object v3, La/wsk0;->a:La/wsk0;

    .line 912
    .line 913
    move-object v5, v4

    .line 914
    move-object v6, v4

    .line 915
    invoke-direct/range {v2 .. v7}, La/xrk0;-><init>(La/btk0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Z)V

    .line 916
    .line 917
    .line 918
    sget v0, La/iwk0;->X0:I

    .line 919
    .line 920
    invoke-virtual {v14, v2}, La/iwk0;->W(La/usk0;)V

    .line 921
    .line 922
    .line 923
    goto :goto_f

    .line 924
    :cond_19
    sget-object v0, La/swk0;->b:La/swk0;

    .line 925
    .line 926
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 927
    .line 928
    .line 929
    move-result v0

    .line 930
    if-eqz v0, :cond_1a

    .line 931
    .line 932
    new-instance v1, La/xrk0;

    .line 933
    .line 934
    sget-object v3, La/iun;->a:La/iun;

    .line 935
    .line 936
    const/4 v6, 0x0

    .line 937
    sget-object v2, La/vsk0;->a:La/vsk0;

    .line 938
    .line 939
    move-object v4, v3

    .line 940
    move-object v5, v3

    .line 941
    invoke-direct/range {v1 .. v6}, La/xrk0;-><init>(La/btk0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Z)V

    .line 942
    .line 943
    .line 944
    sget v0, La/iwk0;->X0:I

    .line 945
    .line 946
    invoke-virtual {v14, v1}, La/iwk0;->W(La/usk0;)V

    .line 947
    .line 948
    .line 949
    :goto_f
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 950
    .line 951
    goto :goto_10

    .line 952
    :cond_1a
    invoke-static {}, La/t9f;->b()V

    .line 953
    .line 954
    .line 955
    :goto_10
    return-object v12

    .line 956
    :pswitch_7
    iget-object v1, v0, La/p4b0;->j:Ljava/lang/Object;

    .line 957
    .line 958
    check-cast v1, La/od7;

    .line 959
    .line 960
    iget-object v0, v0, La/p4b0;->k:Ljava/lang/Object;

    .line 961
    .line 962
    check-cast v0, La/ql5;

    .line 963
    .line 964
    sget-object v2, La/wne;->a:La/wne;

    .line 965
    .line 966
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 967
    .line 968
    .line 969
    check-cast v14, La/wyj0;

    .line 970
    .line 971
    iget-object v2, v14, La/wyj0;->H:La/p7m0;

    .line 972
    .line 973
    iget-object v1, v1, La/od7;->a:Ljava/math/BigDecimal;

    .line 974
    .line 975
    invoke-virtual {v1}, Ljava/math/BigDecimal;->doubleValue()D

    .line 976
    .line 977
    .line 978
    move-result-wide v3

    .line 979
    iget-wide v0, v0, La/ql5;->b:D

    .line 980
    .line 981
    cmpl-double v3, v3, v0

    .line 982
    .line 983
    if-gtz v3, :cond_1c

    .line 984
    .line 985
    cmpg-double v0, v0, v10

    .line 986
    .line 987
    if-nez v0, :cond_1b

    .line 988
    .line 989
    goto :goto_11

    .line 990
    :cond_1b
    sget-object v0, La/ah5;->a:La/ah5;

    .line 991
    .line 992
    goto :goto_12

    .line 993
    :cond_1c
    :goto_11
    sget-object v0, La/wg5;->a:La/wg5;

    .line 994
    .line 995
    :goto_12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 996
    .line 997
    .line 998
    invoke-virtual {v2, v12, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 999
    .line 1000
    .line 1001
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1002
    .line 1003
    return-object v0

    .line 1004
    :pswitch_8
    iget-object v1, v0, La/p4b0;->j:Ljava/lang/Object;

    .line 1005
    .line 1006
    move-object v15, v1

    .line 1007
    check-cast v15, Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;

    .line 1008
    .line 1009
    iget-object v0, v0, La/p4b0;->k:Ljava/lang/Object;

    .line 1010
    .line 1011
    check-cast v0, La/n0d;

    .line 1012
    .line 1013
    sget-object v1, La/wne;->a:La/wne;

    .line 1014
    .line 1015
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1016
    .line 1017
    .line 1018
    check-cast v14, La/yxj0;

    .line 1019
    .line 1020
    iget-object v1, v14, La/yxj0;->Z:La/p7m0;

    .line 1021
    .line 1022
    iget-object v2, v14, La/yxj0;->M:La/vzg0;

    .line 1023
    .line 1024
    const/16 v30, 0x0

    .line 1025
    .line 1026
    const/16 v31, 0x17ff

    .line 1027
    .line 1028
    const-wide/16 v16, 0x0

    .line 1029
    .line 1030
    const-wide/16 v18, 0x0

    .line 1031
    .line 1032
    const-wide/16 v20, 0x0

    .line 1033
    .line 1034
    const-wide/16 v22, 0x0

    .line 1035
    .line 1036
    const/16 v24, 0x0

    .line 1037
    .line 1038
    const/16 v25, 0x0

    .line 1039
    .line 1040
    const/16 v26, 0x0

    .line 1041
    .line 1042
    const/16 v27, 0x0

    .line 1043
    .line 1044
    const/16 v28, 0x0

    .line 1045
    .line 1046
    const/16 v29, 0x1

    .line 1047
    .line 1048
    invoke-static/range {v15 .. v31}, Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;->a(Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;DDDDLjava/lang/String;ZZZZZZI)Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v3

    .line 1052
    const-string v4, "SAVED_STATE_STEP_INPUT_KEY"

    .line 1053
    .line 1054
    invoke-virtual {v2, v4, v3}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1055
    .line 1056
    .line 1057
    iget-wide v2, v15, Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;->d:D

    .line 1058
    .line 1059
    iget-wide v4, v15, Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;->e:D

    .line 1060
    .line 1061
    iget-wide v6, v15, Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;->a:D

    .line 1062
    .line 1063
    cmpg-double v2, v2, v6

    .line 1064
    .line 1065
    sget-object v3, La/cnb0;->a:La/cnb0;

    .line 1066
    .line 1067
    if-gtz v2, :cond_1d

    .line 1068
    .line 1069
    cmpg-double v2, v6, v4

    .line 1070
    .line 1071
    if-gtz v2, :cond_1d

    .line 1072
    .line 1073
    goto :goto_13

    .line 1074
    :cond_1d
    iget-boolean v2, v15, Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;->g:Z

    .line 1075
    .line 1076
    if-eqz v2, :cond_21

    .line 1077
    .line 1078
    cmpl-double v2, v6, v4

    .line 1079
    .line 1080
    if-lez v2, :cond_21

    .line 1081
    .line 1082
    :goto_13
    iget-wide v4, v0, La/n0d;->a:D

    .line 1083
    .line 1084
    mul-double/2addr v6, v4

    .line 1085
    invoke-virtual {v14}, La/yxj0;->D()La/ql5;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v0

    .line 1089
    if-eqz v0, :cond_1e

    .line 1090
    .line 1091
    iget-object v0, v0, La/ql5;->f:Ljava/lang/String;

    .line 1092
    .line 1093
    if-nez v0, :cond_1f

    .line 1094
    .line 1095
    :cond_1e
    const-string v0, ""

    .line 1096
    .line 1097
    :cond_1f
    cmpg-double v2, v6, v10

    .line 1098
    .line 1099
    if-nez v2, :cond_20

    .line 1100
    .line 1101
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1102
    .line 1103
    .line 1104
    invoke-virtual {v1, v12, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1105
    .line 1106
    .line 1107
    goto :goto_14

    .line 1108
    :cond_20
    new-instance v2, La/dnb0;

    .line 1109
    .line 1110
    iget-object v3, v14, La/yxj0;->D:La/ctf0;

    .line 1111
    .line 1112
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1113
    .line 1114
    .line 1115
    new-instance v4, Ljava/util/ArrayList;

    .line 1116
    .line 1117
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1118
    .line 1119
    .line 1120
    new-instance v14, La/bnk0;

    .line 1121
    .line 1122
    invoke-direct {v14}, La/bnk0;-><init>()V

    .line 1123
    .line 1124
    .line 1125
    new-array v5, v13, [Ljava/lang/Object;

    .line 1126
    .line 1127
    iget-object v3, v3, La/ctf0;->b:La/lsm0;

    .line 1128
    .line 1129
    const-string v8, " "

    .line 1130
    .line 1131
    const v9, 0x7f1309eb

    .line 1132
    .line 1133
    .line 1134
    invoke-static {v5, v13, v3, v9, v8}, La/w6x;->r([Ljava/lang/Object;ILa/lsm0;ILjava/lang/String;)Ljava/lang/String;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v15

    .line 1138
    const v19, 0x7f040b72

    .line 1139
    .line 1140
    .line 1141
    const/16 v20, 0x1e

    .line 1142
    .line 1143
    const/16 v16, 0x0

    .line 1144
    .line 1145
    const/16 v17, 0x0

    .line 1146
    .line 1147
    const/16 v18, 0x0

    .line 1148
    .line 1149
    invoke-static/range {v14 .. v20}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 1150
    .line 1151
    .line 1152
    sget v3, La/cy7;->a:I

    .line 1153
    .line 1154
    sget-object v3, La/pn40;->a:La/pn40;

    .line 1155
    .line 1156
    invoke-static {v0, v6, v7}, La/pn40;->p(Ljava/lang/String;D)Ljava/lang/String;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v0

    .line 1160
    invoke-static {v0}, La/cy7;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v15

    .line 1164
    const/16 v18, 0x1

    .line 1165
    .line 1166
    const/16 v20, 0xe

    .line 1167
    .line 1168
    const v19, 0x7f040aeb

    .line 1169
    .line 1170
    .line 1171
    invoke-static/range {v14 .. v20}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 1172
    .line 1173
    .line 1174
    iget-object v0, v14, La/bnk0;->a:Ljava/util/ArrayList;

    .line 1175
    .line 1176
    invoke-static {v4, v0, v4}, La/w6x;->l(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)La/ank0;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v0

    .line 1180
    invoke-direct {v2, v0}, La/dnb0;-><init>(La/ank0;)V

    .line 1181
    .line 1182
    .line 1183
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1184
    .line 1185
    .line 1186
    invoke-virtual {v1, v12, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1187
    .line 1188
    .line 1189
    goto :goto_14

    .line 1190
    :cond_21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1191
    .line 1192
    .line 1193
    invoke-virtual {v1, v12, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1194
    .line 1195
    .line 1196
    :goto_14
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1197
    .line 1198
    return-object v0

    .line 1199
    :pswitch_9
    iget-object v1, v0, La/p4b0;->j:Ljava/lang/Object;

    .line 1200
    .line 1201
    check-cast v1, Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;

    .line 1202
    .line 1203
    iget-object v0, v0, La/p4b0;->k:Ljava/lang/Object;

    .line 1204
    .line 1205
    check-cast v0, La/ql5;

    .line 1206
    .line 1207
    sget-object v2, La/wne;->a:La/wne;

    .line 1208
    .line 1209
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1210
    .line 1211
    .line 1212
    check-cast v14, La/yxj0;

    .line 1213
    .line 1214
    iget-object v2, v14, La/yxj0;->c0:La/p7m0;

    .line 1215
    .line 1216
    iget-wide v3, v1, Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;->a:D

    .line 1217
    .line 1218
    iget-wide v0, v0, La/ql5;->b:D

    .line 1219
    .line 1220
    cmpl-double v3, v3, v0

    .line 1221
    .line 1222
    if-gtz v3, :cond_23

    .line 1223
    .line 1224
    cmpg-double v0, v0, v10

    .line 1225
    .line 1226
    if-nez v0, :cond_22

    .line 1227
    .line 1228
    goto :goto_15

    .line 1229
    :cond_22
    sget-object v0, La/yg5;->a:La/yg5;

    .line 1230
    .line 1231
    goto :goto_16

    .line 1232
    :cond_23
    :goto_15
    sget-object v0, La/ug5;->a:La/ug5;

    .line 1233
    .line 1234
    :goto_16
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1235
    .line 1236
    .line 1237
    invoke-virtual {v2, v12, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1238
    .line 1239
    .line 1240
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1241
    .line 1242
    return-object v0

    .line 1243
    :pswitch_a
    iget-object v1, v0, La/p4b0;->j:Ljava/lang/Object;

    .line 1244
    .line 1245
    check-cast v1, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 1246
    .line 1247
    iget-object v0, v0, La/p4b0;->k:Ljava/lang/Object;

    .line 1248
    .line 1249
    check-cast v0, La/ql5;

    .line 1250
    .line 1251
    sget-object v2, La/wne;->a:La/wne;

    .line 1252
    .line 1253
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1254
    .line 1255
    .line 1256
    check-cast v14, La/xxj0;

    .line 1257
    .line 1258
    iget-object v2, v14, La/xxj0;->E0:La/p7m0;

    .line 1259
    .line 1260
    iget-wide v3, v1, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->a:D

    .line 1261
    .line 1262
    iget-boolean v1, v1, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->q:Z

    .line 1263
    .line 1264
    if-eqz v1, :cond_24

    .line 1265
    .line 1266
    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    .line 1267
    .line 1268
    goto :goto_17

    .line 1269
    :cond_24
    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    .line 1270
    .line 1271
    :goto_17
    mul-double/2addr v5, v3

    .line 1272
    iget-wide v0, v0, La/ql5;->b:D

    .line 1273
    .line 1274
    cmpl-double v3, v5, v0

    .line 1275
    .line 1276
    if-gtz v3, :cond_26

    .line 1277
    .line 1278
    cmpg-double v0, v0, v10

    .line 1279
    .line 1280
    if-nez v0, :cond_25

    .line 1281
    .line 1282
    goto :goto_18

    .line 1283
    :cond_25
    sget-object v0, La/zg5;->a:La/zg5;

    .line 1284
    .line 1285
    goto :goto_19

    .line 1286
    :cond_26
    :goto_18
    sget-object v0, La/vg5;->a:La/vg5;

    .line 1287
    .line 1288
    :goto_19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1289
    .line 1290
    .line 1291
    invoke-virtual {v2, v12, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1292
    .line 1293
    .line 1294
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1295
    .line 1296
    return-object v0

    .line 1297
    :pswitch_b
    iget-object v1, v0, La/p4b0;->j:Ljava/lang/Object;

    .line 1298
    .line 1299
    move-object v6, v1

    .line 1300
    check-cast v6, Ljava/util/List;

    .line 1301
    .line 1302
    iget-object v0, v0, La/p4b0;->k:Ljava/lang/Object;

    .line 1303
    .line 1304
    check-cast v0, Ljava/util/Set;

    .line 1305
    .line 1306
    move-object v1, v0

    .line 1307
    check-cast v1, Ljava/util/Set;

    .line 1308
    .line 1309
    sget-object v0, La/wne;->a:La/wne;

    .line 1310
    .line 1311
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1312
    .line 1313
    .line 1314
    move-object v9, v14

    .line 1315
    check-cast v9, La/p1i0;

    .line 1316
    .line 1317
    sget v0, La/p1i0;->A:I

    .line 1318
    .line 1319
    iget-object v0, v9, La/i3t0;->i:La/ocj;

    .line 1320
    .line 1321
    iget-object v10, v0, La/ocj;->a:La/p7m0;

    .line 1322
    .line 1323
    :cond_27
    invoke-virtual {v10}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v0

    .line 1327
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1328
    .line 1329
    .line 1330
    iget-object v2, v9, La/i3t0;->f:La/oyg0;

    .line 1331
    .line 1332
    move-object v3, v0

    .line 1333
    check-cast v3, La/tec;

    .line 1334
    .line 1335
    const-string v4, "SELECTED_IDS_KEY"

    .line 1336
    .line 1337
    invoke-static {v2, v1, v4}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1338
    .line 1339
    .line 1340
    move-object v7, v1

    .line 1341
    check-cast v7, Ljava/util/Set;

    .line 1342
    .line 1343
    const/16 v8, 0x4e

    .line 1344
    .line 1345
    move-object v2, v3

    .line 1346
    const/4 v3, 0x0

    .line 1347
    const/4 v4, 0x0

    .line 1348
    const/4 v5, 0x0

    .line 1349
    invoke-static/range {v2 .. v8}, La/tec;->a(La/tec;ZZLjava/lang/String;Ljava/util/List;Ljava/util/Set;I)La/tec;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v2

    .line 1353
    invoke-virtual {v10, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1354
    .line 1355
    .line 1356
    move-result v0

    .line 1357
    if-eqz v0, :cond_27

    .line 1358
    .line 1359
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1360
    .line 1361
    return-object v0

    .line 1362
    :pswitch_c
    iget-object v1, v0, La/p4b0;->j:Ljava/lang/Object;

    .line 1363
    .line 1364
    check-cast v1, Ljava/util/List;

    .line 1365
    .line 1366
    iget-object v0, v0, La/p4b0;->k:Ljava/lang/Object;

    .line 1367
    .line 1368
    move-object v4, v0

    .line 1369
    check-cast v4, La/v5g0;

    .line 1370
    .line 1371
    sget-object v0, La/wne;->a:La/wne;

    .line 1372
    .line 1373
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1374
    .line 1375
    .line 1376
    check-cast v14, La/o9g0;

    .line 1377
    .line 1378
    iget-object v0, v14, La/o9g0;->F:La/art;

    .line 1379
    .line 1380
    iget-object v5, v4, La/v5g0;->b:Ljava/util/Date;

    .line 1381
    .line 1382
    iget-wide v6, v4, La/v5g0;->a:J

    .line 1383
    .line 1384
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1385
    .line 1386
    .line 1387
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1388
    .line 1389
    .line 1390
    new-instance v0, Ljava/util/ArrayList;

    .line 1391
    .line 1392
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1393
    .line 1394
    .line 1395
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v8

    .line 1399
    :cond_28
    :goto_1a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1400
    .line 1401
    .line 1402
    move-result v9

    .line 1403
    if-eqz v9, :cond_2a

    .line 1404
    .line 1405
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v9

    .line 1409
    move-object v10, v9

    .line 1410
    check-cast v10, La/d2w;

    .line 1411
    .line 1412
    cmp-long v11, v6, v2

    .line 1413
    .line 1414
    if-nez v11, :cond_29

    .line 1415
    .line 1416
    goto :goto_1b

    .line 1417
    :cond_29
    invoke-virtual {v10}, La/d2w;->d()J

    .line 1418
    .line 1419
    .line 1420
    move-result-wide v10

    .line 1421
    cmp-long v10, v10, v6

    .line 1422
    .line 1423
    if-nez v10, :cond_28

    .line 1424
    .line 1425
    :goto_1b
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1426
    .line 1427
    .line 1428
    goto :goto_1a

    .line 1429
    :cond_2a
    new-instance v2, Ljava/util/ArrayList;

    .line 1430
    .line 1431
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1432
    .line 1433
    .line 1434
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v0

    .line 1438
    :cond_2b
    :goto_1c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1439
    .line 1440
    .line 1441
    move-result v3

    .line 1442
    if-eqz v3, :cond_31

    .line 1443
    .line 1444
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v3

    .line 1448
    move-object v6, v3

    .line 1449
    check-cast v6, La/d2w;

    .line 1450
    .line 1451
    if-nez v6, :cond_2c

    .line 1452
    .line 1453
    goto :goto_1d

    .line 1454
    :cond_2c
    instance-of v7, v6, La/u1w;

    .line 1455
    .line 1456
    if-eqz v7, :cond_2d

    .line 1457
    .line 1458
    check-cast v6, La/u1w;

    .line 1459
    .line 1460
    iget-wide v6, v6, La/u1w;->l:J

    .line 1461
    .line 1462
    invoke-static {v6, v7}, La/art;->f(J)Ljava/util/Date;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v6

    .line 1466
    invoke-virtual {v6, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1467
    .line 1468
    .line 1469
    move-result v6

    .line 1470
    goto :goto_1e

    .line 1471
    :cond_2d
    instance-of v7, v6, La/x1w;

    .line 1472
    .line 1473
    if-eqz v7, :cond_2e

    .line 1474
    .line 1475
    check-cast v6, La/x1w;

    .line 1476
    .line 1477
    iget-wide v6, v6, La/x1w;->l:J

    .line 1478
    .line 1479
    invoke-static {v6, v7}, La/art;->f(J)Ljava/util/Date;

    .line 1480
    .line 1481
    .line 1482
    move-result-object v6

    .line 1483
    invoke-virtual {v6, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1484
    .line 1485
    .line 1486
    move-result v6

    .line 1487
    goto :goto_1e

    .line 1488
    :cond_2e
    instance-of v7, v6, La/y1w;

    .line 1489
    .line 1490
    if-eqz v7, :cond_2f

    .line 1491
    .line 1492
    check-cast v6, La/y1w;

    .line 1493
    .line 1494
    iget-wide v6, v6, La/y1w;->l:J

    .line 1495
    .line 1496
    invoke-static {v6, v7}, La/art;->f(J)Ljava/util/Date;

    .line 1497
    .line 1498
    .line 1499
    move-result-object v6

    .line 1500
    invoke-virtual {v6, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1501
    .line 1502
    .line 1503
    move-result v6

    .line 1504
    goto :goto_1e

    .line 1505
    :cond_2f
    instance-of v7, v6, La/c2w;

    .line 1506
    .line 1507
    if-eqz v7, :cond_30

    .line 1508
    .line 1509
    check-cast v6, La/c2w;

    .line 1510
    .line 1511
    iget-wide v6, v6, La/c2w;->l:J

    .line 1512
    .line 1513
    invoke-static {v6, v7}, La/art;->f(J)Ljava/util/Date;

    .line 1514
    .line 1515
    .line 1516
    move-result-object v6

    .line 1517
    invoke-virtual {v6, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1518
    .line 1519
    .line 1520
    move-result v6

    .line 1521
    goto :goto_1e

    .line 1522
    :cond_30
    :goto_1d
    move v6, v13

    .line 1523
    :goto_1e
    if-eqz v6, :cond_2b

    .line 1524
    .line 1525
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1526
    .line 1527
    .line 1528
    goto :goto_1c

    .line 1529
    :cond_31
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 1530
    .line 1531
    .line 1532
    move-result v0

    .line 1533
    if-eqz v0, :cond_32

    .line 1534
    .line 1535
    sget-object v0, La/q5g0;->c:La/q5g0;

    .line 1536
    .line 1537
    :goto_1f
    move-object/from16 v18, v0

    .line 1538
    .line 1539
    goto :goto_20

    .line 1540
    :cond_32
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1541
    .line 1542
    .line 1543
    move-result v0

    .line 1544
    if-eqz v0, :cond_33

    .line 1545
    .line 1546
    sget-object v0, La/q5g0;->d:La/q5g0;

    .line 1547
    .line 1548
    goto :goto_1f

    .line 1549
    :cond_33
    sget-object v0, La/q5g0;->a:La/q5g0;

    .line 1550
    .line 1551
    goto :goto_1f

    .line 1552
    :goto_20
    iget-object v0, v14, La/i3t0;->i:La/ocj;

    .line 1553
    .line 1554
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 1555
    .line 1556
    :goto_21
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1557
    .line 1558
    .line 1559
    move-result-object v0

    .line 1560
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1561
    .line 1562
    .line 1563
    move-object v15, v0

    .line 1564
    check-cast v15, La/e9g0;

    .line 1565
    .line 1566
    iget-object v3, v15, La/e9g0;->m:La/yl9;

    .line 1567
    .line 1568
    iget-object v5, v4, La/v5g0;->b:Ljava/util/Date;

    .line 1569
    .line 1570
    iget-object v3, v3, La/yl9;->a:Ljava/util/Set;

    .line 1571
    .line 1572
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1573
    .line 1574
    .line 1575
    new-instance v6, La/yl9;

    .line 1576
    .line 1577
    invoke-direct {v6, v3, v5}, La/yl9;-><init>(Ljava/util/Set;Ljava/util/Date;)V

    .line 1578
    .line 1579
    .line 1580
    iget-wide v7, v4, La/v5g0;->a:J

    .line 1581
    .line 1582
    const/16 v22, 0x0

    .line 1583
    .line 1584
    const/16 v24, 0x2e3f

    .line 1585
    .line 1586
    const/16 v16, 0x0

    .line 1587
    .line 1588
    const/16 v21, 0x0

    .line 1589
    .line 1590
    move-object/from16 v17, v2

    .line 1591
    .line 1592
    move-object/from16 v23, v6

    .line 1593
    .line 1594
    move-wide/from16 v19, v7

    .line 1595
    .line 1596
    invoke-static/range {v15 .. v24}, La/e9g0;->a(La/e9g0;Ljava/util/Set;Ljava/util/List;La/q5g0;JLjava/util/List;La/wcb;La/yl9;I)La/e9g0;

    .line 1597
    .line 1598
    .line 1599
    move-result-object v2

    .line 1600
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1601
    .line 1602
    .line 1603
    move-result v0

    .line 1604
    if-eqz v0, :cond_34

    .line 1605
    .line 1606
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1607
    .line 1608
    return-object v0

    .line 1609
    :cond_34
    move-object/from16 v2, v17

    .line 1610
    .line 1611
    goto :goto_21

    .line 1612
    :pswitch_d
    iget-object v1, v0, La/p4b0;->j:Ljava/lang/Object;

    .line 1613
    .line 1614
    check-cast v1, Ljava/util/List;

    .line 1615
    .line 1616
    iget-object v0, v0, La/p4b0;->k:Ljava/lang/Object;

    .line 1617
    .line 1618
    check-cast v0, Ljava/util/Set;

    .line 1619
    .line 1620
    check-cast v0, Ljava/util/Set;

    .line 1621
    .line 1622
    sget-object v2, La/wne;->a:La/wne;

    .line 1623
    .line 1624
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1625
    .line 1626
    .line 1627
    check-cast v14, La/r4b0;

    .line 1628
    .line 1629
    iget-object v2, v14, La/r4b0;->u:La/p7m0;

    .line 1630
    .line 1631
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 1632
    .line 1633
    .line 1634
    move-result v3

    .line 1635
    if-nez v3, :cond_3c

    .line 1636
    .line 1637
    new-instance v3, La/j4b0;

    .line 1638
    .line 1639
    iget-object v4, v14, La/r4b0;->h:La/lbu;

    .line 1640
    .line 1641
    invoke-virtual {v4}, La/lbu;->j()Z

    .line 1642
    .line 1643
    .line 1644
    move-result v28

    .line 1645
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1646
    .line 1647
    .line 1648
    new-instance v4, Ljava/util/ArrayList;

    .line 1649
    .line 1650
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1651
    .line 1652
    .line 1653
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1654
    .line 1655
    .line 1656
    move-result-object v1

    .line 1657
    :goto_22
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1658
    .line 1659
    .line 1660
    move-result v5

    .line 1661
    if-eqz v5, :cond_3b

    .line 1662
    .line 1663
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1664
    .line 1665
    .line 1666
    move-result-object v5

    .line 1667
    check-cast v5, La/zlb;

    .line 1668
    .line 1669
    new-instance v6, La/fcb;

    .line 1670
    .line 1671
    iget-wide v10, v5, La/zlb;->a:J

    .line 1672
    .line 1673
    iget-object v8, v5, La/zlb;->b:Ljava/lang/String;

    .line 1674
    .line 1675
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1676
    .line 1677
    .line 1678
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1679
    .line 1680
    .line 1681
    move-result-object v13

    .line 1682
    invoke-interface {v0, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1683
    .line 1684
    .line 1685
    move-result v13

    .line 1686
    xor-int/2addr v13, v9

    .line 1687
    invoke-direct {v6, v8, v10, v11, v13}, La/fcb;-><init>(Ljava/lang/String;JZ)V

    .line 1688
    .line 1689
    .line 1690
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1691
    .line 1692
    .line 1693
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1694
    .line 1695
    .line 1696
    move-result-object v6

    .line 1697
    invoke-interface {v0, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1698
    .line 1699
    .line 1700
    move-result v6

    .line 1701
    if-nez v6, :cond_3a

    .line 1702
    .line 1703
    iget-object v5, v5, La/zlb;->c:Ljava/util/List;

    .line 1704
    .line 1705
    new-instance v6, Ljava/util/ArrayList;

    .line 1706
    .line 1707
    invoke-static {v5, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1708
    .line 1709
    .line 1710
    move-result v8

    .line 1711
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 1712
    .line 1713
    .line 1714
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1715
    .line 1716
    .line 1717
    move-result-object v5

    .line 1718
    :goto_23
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1719
    .line 1720
    .line 1721
    move-result v8

    .line 1722
    if-eqz v8, :cond_39

    .line 1723
    .line 1724
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1725
    .line 1726
    .line 1727
    move-result-object v8

    .line 1728
    check-cast v8, La/rbb;

    .line 1729
    .line 1730
    iget-wide v14, v8, La/rbb;->a:J

    .line 1731
    .line 1732
    iget-object v10, v8, La/rbb;->p:Ljava/util/List;

    .line 1733
    .line 1734
    iget-object v11, v8, La/rbb;->c:Ljava/lang/String;

    .line 1735
    .line 1736
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1737
    .line 1738
    .line 1739
    iget-object v13, v8, La/rbb;->g:Ljava/lang/String;

    .line 1740
    .line 1741
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1742
    .line 1743
    .line 1744
    new-instance v7, La/ncb;

    .line 1745
    .line 1746
    invoke-direct {v7, v13}, La/ncb;-><init>(Ljava/lang/String;)V

    .line 1747
    .line 1748
    .line 1749
    iget-object v13, v8, La/rbb;->h:Ljava/lang/String;

    .line 1750
    .line 1751
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1752
    .line 1753
    .line 1754
    new-instance v12, La/ocb;

    .line 1755
    .line 1756
    invoke-direct {v12, v13}, La/ocb;-><init>(Ljava/lang/String;)V

    .line 1757
    .line 1758
    .line 1759
    iget v13, v8, La/rbb;->k:I

    .line 1760
    .line 1761
    move-object/from16 v16, v10

    .line 1762
    .line 1763
    int-to-long v9, v13

    .line 1764
    invoke-static {v7, v12, v9, v10}, La/rcb;->d0(La/qcb;La/qcb;J)Ljava/lang/String;

    .line 1765
    .line 1766
    .line 1767
    move-result-object v21

    .line 1768
    iget-boolean v7, v8, La/rbb;->l:Z

    .line 1769
    .line 1770
    iget-object v9, v8, La/rbb;->o:La/pgb;

    .line 1771
    .line 1772
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 1773
    .line 1774
    .line 1775
    move-result v9

    .line 1776
    const/4 v10, 0x1

    .line 1777
    if-eq v9, v10, :cond_36

    .line 1778
    .line 1779
    const/4 v12, 0x2

    .line 1780
    if-eq v9, v12, :cond_35

    .line 1781
    .line 1782
    const/16 v23, 0x0

    .line 1783
    .line 1784
    goto :goto_25

    .line 1785
    :cond_35
    sget-object v9, La/vf5;->f:La/vf5;

    .line 1786
    .line 1787
    :goto_24
    move-object/from16 v23, v9

    .line 1788
    .line 1789
    goto :goto_25

    .line 1790
    :cond_36
    sget-object v9, La/vf5;->e:La/vf5;

    .line 1791
    .line 1792
    goto :goto_24

    .line 1793
    :goto_25
    iget-wide v12, v8, La/rbb;->n:J

    .line 1794
    .line 1795
    invoke-static/range {v16 .. v16}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1796
    .line 1797
    .line 1798
    move-result-object v9

    .line 1799
    check-cast v9, La/ygs;

    .line 1800
    .line 1801
    const-wide/16 v17, 0x0

    .line 1802
    .line 1803
    move-object/from16 v20, v11

    .line 1804
    .line 1805
    if-eqz v9, :cond_37

    .line 1806
    .line 1807
    iget-wide v10, v9, La/ygs;->B:J

    .line 1808
    .line 1809
    goto :goto_26

    .line 1810
    :cond_37
    move-wide/from16 v10, v17

    .line 1811
    .line 1812
    :goto_26
    iget-boolean v9, v8, La/rbb;->m:Z

    .line 1813
    .line 1814
    move-object/from16 p0, v0

    .line 1815
    .line 1816
    move-object/from16 p1, v1

    .line 1817
    .line 1818
    iget-wide v0, v8, La/rbb;->f:J

    .line 1819
    .line 1820
    long-to-int v0, v0

    .line 1821
    invoke-static/range {v16 .. v16}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1822
    .line 1823
    .line 1824
    move-result-object v1

    .line 1825
    check-cast v1, La/ygs;

    .line 1826
    .line 1827
    move/from16 v25, v0

    .line 1828
    .line 1829
    if-eqz v1, :cond_38

    .line 1830
    .line 1831
    iget-wide v0, v1, La/ygs;->a:J

    .line 1832
    .line 1833
    move-wide/from16 v26, v0

    .line 1834
    .line 1835
    goto :goto_27

    .line 1836
    :cond_38
    move-wide/from16 v26, v17

    .line 1837
    .line 1838
    :goto_27
    iget-wide v0, v8, La/rbb;->b:J

    .line 1839
    .line 1840
    move-wide/from16 v16, v12

    .line 1841
    .line 1842
    new-instance v13, La/zgb;

    .line 1843
    .line 1844
    move-wide/from16 v29, v0

    .line 1845
    .line 1846
    move/from16 v22, v7

    .line 1847
    .line 1848
    move/from16 v24, v9

    .line 1849
    .line 1850
    move-wide/from16 v18, v10

    .line 1851
    .line 1852
    invoke-direct/range {v13 .. v30}, La/zgb;-><init>(JJJLjava/lang/String;Ljava/lang/String;ZLa/vf5;ZIJZJ)V

    .line 1853
    .line 1854
    .line 1855
    invoke-virtual {v6, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1856
    .line 1857
    .line 1858
    move-object/from16 v0, p0

    .line 1859
    .line 1860
    move-object/from16 v1, p1

    .line 1861
    .line 1862
    const/16 v7, 0xa

    .line 1863
    .line 1864
    const/4 v9, 0x1

    .line 1865
    const/4 v12, 0x0

    .line 1866
    goto/16 :goto_23

    .line 1867
    .line 1868
    :cond_39
    move-object/from16 p0, v0

    .line 1869
    .line 1870
    move-object/from16 p1, v1

    .line 1871
    .line 1872
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1873
    .line 1874
    .line 1875
    goto :goto_28

    .line 1876
    :cond_3a
    move-object/from16 p0, v0

    .line 1877
    .line 1878
    move-object/from16 p1, v1

    .line 1879
    .line 1880
    :goto_28
    move-object/from16 v0, p0

    .line 1881
    .line 1882
    move-object/from16 v1, p1

    .line 1883
    .line 1884
    const/16 v7, 0xa

    .line 1885
    .line 1886
    const/4 v9, 0x1

    .line 1887
    const/4 v12, 0x0

    .line 1888
    goto/16 :goto_22

    .line 1889
    .line 1890
    :cond_3b
    invoke-direct {v3, v4}, La/j4b0;-><init>(Ljava/util/ArrayList;)V

    .line 1891
    .line 1892
    .line 1893
    goto :goto_29

    .line 1894
    :cond_3c
    new-instance v3, La/m4b0;

    .line 1895
    .line 1896
    iget-object v4, v14, La/r4b0;->g:La/g2v;

    .line 1897
    .line 1898
    sget-object v5, La/pb10;->g:La/pb10;

    .line 1899
    .line 1900
    new-instance v10, La/g4b0;

    .line 1901
    .line 1902
    invoke-direct {v10, v14, v13}, La/g4b0;-><init>(La/r4b0;B)V

    .line 1903
    .line 1904
    .line 1905
    const/16 v11, 0x5e

    .line 1906
    .line 1907
    const/4 v6, 0x0

    .line 1908
    const/4 v7, 0x0

    .line 1909
    const v8, 0x7f1305c0

    .line 1910
    .line 1911
    .line 1912
    const v9, 0x7f131111

    .line 1913
    .line 1914
    .line 1915
    invoke-static/range {v4 .. v11}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 1916
    .line 1917
    .line 1918
    move-result-object v0

    .line 1919
    invoke-direct {v3, v0}, La/m4b0;-><init>(La/jkm;)V

    .line 1920
    .line 1921
    .line 1922
    :goto_29
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1923
    .line 1924
    .line 1925
    const/4 v0, 0x0

    .line 1926
    invoke-virtual {v2, v0, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1927
    .line 1928
    .line 1929
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1930
    .line 1931
    return-object v0

    .line 1932
    nop

    .line 1933
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
