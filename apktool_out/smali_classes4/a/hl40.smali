.class public final synthetic La/hl40;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/v6o;


# direct methods
.method public synthetic constructor <init>(La/v6o;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/hl40;->a:B

    iput-object p1, p0, La/hl40;->b:La/v6o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 46

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/hl40;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/hl40;->b:La/v6o;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, La/fee;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, La/v6o;->s:La/n0o0;

    .line 18
    .line 19
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, La/fee;

    .line 24
    .line 25
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, La/szj0;

    .line 30
    .line 31
    iget-object v2, v0, La/v6o;->D:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v2, La/dl40;

    .line 34
    .line 35
    iget-object v2, v2, La/dl40;->m:La/sff0;

    .line 36
    .line 37
    iget-boolean v2, v2, La/sff0;->K1:Z

    .line 38
    .line 39
    iget-object v0, v0, La/v6o;->b:La/ctf0;

    .line 40
    .line 41
    invoke-static {v1, v2, v0}, La/pzw;->W(La/szj0;ZLa/ctf0;)La/sam;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0

    .line 46
    :pswitch_0
    iget-object v1, v0, La/v6o;->A:La/n0o0;

    .line 47
    .line 48
    iget-object v3, v0, La/v6o;->c:La/g2v;

    .line 49
    .line 50
    move-object/from16 v4, p1

    .line 51
    .line 52
    check-cast v4, La/fee;

    .line 53
    .line 54
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v4}, La/fee;->c()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    check-cast v4, La/jlr;

    .line 62
    .line 63
    if-eqz v4, :cond_7

    .line 64
    .line 65
    instance-of v5, v4, La/xkr;

    .line 66
    .line 67
    if-eqz v5, :cond_1

    .line 68
    .line 69
    iget-object v2, v0, La/v6o;->e:La/n0o0;

    .line 70
    .line 71
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    check-cast v2, La/fee;

    .line 76
    .line 77
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    if-nez v2, :cond_0

    .line 82
    .line 83
    invoke-virtual {v0}, La/v6o;->f()La/nss;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    goto/16 :goto_1

    .line 88
    .line 89
    :cond_0
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    check-cast v0, La/fee;

    .line 94
    .line 95
    iget-object v0, v0, La/fee;->e:La/zbk;

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    new-instance v2, La/pss;

    .line 101
    .line 102
    invoke-direct {v2, v0}, La/pss;-><init>(La/l7m0;)V

    .line 103
    .line 104
    .line 105
    goto/16 :goto_1

    .line 106
    .line 107
    :cond_1
    instance-of v5, v4, La/alr;

    .line 108
    .line 109
    const-wide/16 v6, 0x24

    .line 110
    .line 111
    if-eqz v5, :cond_2

    .line 112
    .line 113
    new-instance v2, La/lss;

    .line 114
    .line 115
    sget-object v1, La/pb10;->v:La/pb10;

    .line 116
    .line 117
    invoke-static {v6, v7, v1}, La/ozb;->J(JLa/pb10;)La/pb10;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    sget-object v6, La/ldm;->b:La/ldm;

    .line 122
    .line 123
    const-wide/16 v14, 0x0

    .line 124
    .line 125
    const/16 v16, 0x25a

    .line 126
    .line 127
    const/4 v5, 0x0

    .line 128
    const/4 v7, 0x0

    .line 129
    const/4 v8, 0x0

    .line 130
    const v9, 0x7f130677

    .line 131
    .line 132
    .line 133
    const/4 v10, 0x0

    .line 134
    const v11, 0x7f131690

    .line 135
    .line 136
    .line 137
    const-wide/16 v12, 0x2710

    .line 138
    .line 139
    invoke-static/range {v3 .. v16}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    iget-object v0, v0, La/v6o;->r:La/n0o0;

    .line 144
    .line 145
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    check-cast v0, La/fee;

    .line 150
    .line 151
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    check-cast v0, La/da10;

    .line 156
    .line 157
    iget-short v0, v0, La/da10;->a:S

    .line 158
    .line 159
    int-to-long v3, v0

    .line 160
    invoke-direct {v2, v3, v4, v1}, La/lss;-><init>(JLa/mdm;)V

    .line 161
    .line 162
    .line 163
    goto/16 :goto_1

    .line 164
    .line 165
    :cond_2
    instance-of v5, v4, La/blr;

    .line 166
    .line 167
    if-eqz v5, :cond_3

    .line 168
    .line 169
    new-instance v0, La/pdq;

    .line 170
    .line 171
    move-object v1, v4

    .line 172
    invoke-static {v6, v7}, La/ozb;->K(J)La/pb10;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    sget-object v6, La/ldm;->b:La/ldm;

    .line 177
    .line 178
    const-wide/16 v14, 0x0

    .line 179
    .line 180
    const/16 v16, 0x3fa

    .line 181
    .line 182
    const/4 v5, 0x0

    .line 183
    const/4 v7, 0x0

    .line 184
    const/4 v8, 0x0

    .line 185
    const/4 v9, 0x0

    .line 186
    const/4 v10, 0x0

    .line 187
    const/4 v11, 0x0

    .line 188
    const-wide/16 v12, 0x0

    .line 189
    .line 190
    invoke-static/range {v3 .. v16}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    move-object v4, v1

    .line 195
    check-cast v4, La/blr;

    .line 196
    .line 197
    iget-wide v3, v4, La/blr;->c:J

    .line 198
    .line 199
    const v1, 0x7f13168b

    .line 200
    .line 201
    .line 202
    invoke-direct {v0, v2, v3, v4, v1}, La/pdq;-><init>(La/mdm;JI)V

    .line 203
    .line 204
    .line 205
    new-instance v2, La/mss;

    .line 206
    .line 207
    invoke-direct {v2, v0}, La/mss;-><init>(La/pdq;)V

    .line 208
    .line 209
    .line 210
    goto :goto_1

    .line 211
    :cond_3
    instance-of v5, v4, La/clr;

    .line 212
    .line 213
    if-eqz v5, :cond_4

    .line 214
    .line 215
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    check-cast v0, La/fee;

    .line 220
    .line 221
    iget-object v0, v0, La/fee;->e:La/zbk;

    .line 222
    .line 223
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    new-instance v2, La/pss;

    .line 227
    .line 228
    invoke-direct {v2, v0}, La/pss;-><init>(La/l7m0;)V

    .line 229
    .line 230
    .line 231
    goto :goto_1

    .line 232
    :cond_4
    instance-of v1, v4, La/dlr;

    .line 233
    .line 234
    if-eqz v1, :cond_5

    .line 235
    .line 236
    goto :goto_0

    .line 237
    :cond_5
    instance-of v1, v4, La/ilr;

    .line 238
    .line 239
    if-eqz v1, :cond_6

    .line 240
    .line 241
    :goto_0
    invoke-virtual {v0}, La/v6o;->f()La/nss;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    goto :goto_1

    .line 246
    :cond_6
    instance-of v0, v4, La/elr;

    .line 247
    .line 248
    if-eqz v0, :cond_7

    .line 249
    .line 250
    sget-object v0, La/pb10;->v:La/pb10;

    .line 251
    .line 252
    invoke-static {v6, v7, v0}, La/ozb;->J(JLa/pb10;)La/pb10;

    .line 253
    .line 254
    .line 255
    move-result-object v4

    .line 256
    sget-object v6, La/ldm;->b:La/ldm;

    .line 257
    .line 258
    const-wide/16 v14, 0x0

    .line 259
    .line 260
    const/16 v16, 0x35a

    .line 261
    .line 262
    const/4 v5, 0x0

    .line 263
    const/4 v7, 0x0

    .line 264
    const/4 v8, 0x0

    .line 265
    const v9, 0x7f130922

    .line 266
    .line 267
    .line 268
    const/4 v10, 0x0

    .line 269
    const v11, 0x7f130987

    .line 270
    .line 271
    .line 272
    const-wide/16 v12, 0x0

    .line 273
    .line 274
    invoke-static/range {v3 .. v16}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    new-instance v2, La/oss;

    .line 279
    .line 280
    invoke-direct {v2, v0}, La/oss;-><init>(La/mdm;)V

    .line 281
    .line 282
    .line 283
    goto :goto_1

    .line 284
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 285
    .line 286
    .line 287
    const/4 v2, 0x0

    .line 288
    :goto_1
    return-object v2

    .line 289
    :pswitch_1
    move-object/from16 v1, p1

    .line 290
    .line 291
    check-cast v1, La/fee;

    .line 292
    .line 293
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    check-cast v1, La/jlr;

    .line 301
    .line 302
    instance-of v3, v1, La/xkr;

    .line 303
    .line 304
    if-eqz v3, :cond_61

    .line 305
    .line 306
    check-cast v1, La/xkr;

    .line 307
    .line 308
    iget-object v5, v1, La/xkr;->d:La/m9s;

    .line 309
    .line 310
    iget-object v1, v0, La/v6o;->e:La/n0o0;

    .line 311
    .line 312
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    check-cast v1, La/fee;

    .line 317
    .line 318
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    check-cast v1, La/mi40;

    .line 323
    .line 324
    iget-object v3, v0, La/v6o;->m:La/n0o0;

    .line 325
    .line 326
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v3

    .line 330
    check-cast v3, La/fee;

    .line 331
    .line 332
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    move-object v9, v3

    .line 337
    check-cast v9, La/o4i0;

    .line 338
    .line 339
    iget-object v3, v0, La/v6o;->l:La/n0o0;

    .line 340
    .line 341
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v3

    .line 345
    check-cast v3, La/fee;

    .line 346
    .line 347
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v3

    .line 351
    check-cast v3, La/yws;

    .line 352
    .line 353
    iget-object v4, v0, La/v6o;->t:La/n0o0;

    .line 354
    .line 355
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v4

    .line 359
    check-cast v4, La/fee;

    .line 360
    .line 361
    invoke-virtual {v4}, La/fee;->c()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v4

    .line 365
    check-cast v4, Ljava/util/List;

    .line 366
    .line 367
    iget-object v6, v0, La/v6o;->u:La/n0o0;

    .line 368
    .line 369
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v6

    .line 373
    check-cast v6, La/fee;

    .line 374
    .line 375
    invoke-virtual {v6}, La/fee;->c()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v6

    .line 379
    check-cast v6, Ljava/lang/Number;

    .line 380
    .line 381
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 382
    .line 383
    .line 384
    move-result-wide v10

    .line 385
    iget-object v8, v0, La/v6o;->b:La/ctf0;

    .line 386
    .line 387
    iget-object v0, v0, La/v6o;->D:Ljava/lang/Object;

    .line 388
    .line 389
    check-cast v0, La/dl40;

    .line 390
    .line 391
    iget-boolean v0, v0, La/dl40;->t:Z

    .line 392
    .line 393
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 406
    .line 407
    .line 408
    move-result-object v6

    .line 409
    if-eqz v3, :cond_8

    .line 410
    .line 411
    iget-boolean v3, v3, La/yws;->c:Z

    .line 412
    .line 413
    if-nez v3, :cond_8

    .line 414
    .line 415
    goto :goto_2

    .line 416
    :cond_8
    new-instance v3, La/kxs;

    .line 417
    .line 418
    invoke-direct {v3}, La/kxs;-><init>()V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v6, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    :goto_2
    if-eqz v1, :cond_a

    .line 425
    .line 426
    iget-object v3, v1, La/mi40;->b:La/hj40;

    .line 427
    .line 428
    iget-object v7, v5, La/m9s;->I:La/cqg;

    .line 429
    .line 430
    iget-object v12, v5, La/m9s;->m:Ljava/util/List;

    .line 431
    .line 432
    iget-object v13, v5, La/m9s;->n:Ljava/util/List;

    .line 433
    .line 434
    instance-of v14, v7, La/el40;

    .line 435
    .line 436
    if-eqz v14, :cond_9

    .line 437
    .line 438
    check-cast v7, La/el40;

    .line 439
    .line 440
    goto :goto_3

    .line 441
    :cond_9
    const/4 v7, 0x0

    .line 442
    :goto_3
    if-nez v7, :cond_b

    .line 443
    .line 444
    :cond_a
    move-object v3, v6

    .line 445
    goto/16 :goto_42

    .line 446
    .line 447
    :cond_b
    iget-object v14, v7, La/el40;->d:Ljava/util/List;

    .line 448
    .line 449
    iget-object v15, v7, La/el40;->b:La/fl40;

    .line 450
    .line 451
    const/16 p0, 0x0

    .line 452
    .line 453
    iget-object v2, v7, La/el40;->a:La/fl40;

    .line 454
    .line 455
    move/from16 v19, v0

    .line 456
    .line 457
    new-instance v0, Ljava/util/ArrayList;

    .line 458
    .line 459
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 460
    .line 461
    .line 462
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 463
    .line 464
    .line 465
    move-result-object v4

    .line 466
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 467
    .line 468
    .line 469
    move-result v16

    .line 470
    if-eqz v16, :cond_d

    .line 471
    .line 472
    move-object/from16 p1, v4

    .line 473
    .line 474
    invoke-interface/range {p1 .. p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v4

    .line 478
    move-wide/from16 v20, v10

    .line 479
    .line 480
    move-object v10, v4

    .line 481
    check-cast v10, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;

    .line 482
    .line 483
    iget-boolean v10, v10, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;->c:Z

    .line 484
    .line 485
    if-eqz v10, :cond_c

    .line 486
    .line 487
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 488
    .line 489
    .line 490
    :cond_c
    move-object/from16 v4, p1

    .line 491
    .line 492
    move-wide/from16 v10, v20

    .line 493
    .line 494
    goto :goto_4

    .line 495
    :cond_d
    move-wide/from16 v20, v10

    .line 496
    .line 497
    new-instance v4, La/lk30;

    .line 498
    .line 499
    const/4 v10, 0x6

    .line 500
    invoke-direct {v4, v10}, La/lk30;-><init>(B)V

    .line 501
    .line 502
    .line 503
    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    new-instance v4, Ljava/util/ArrayList;

    .line 508
    .line 509
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 510
    .line 511
    .line 512
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 517
    .line 518
    .line 519
    move-result v11

    .line 520
    if-eqz v11, :cond_11

    .line 521
    .line 522
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v11

    .line 526
    check-cast v11, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;

    .line 527
    .line 528
    sget-object v16, La/zrs;->g:La/c0o;

    .line 529
    .line 530
    invoke-virtual/range {v16 .. v16}, La/b3;->iterator()Ljava/util/Iterator;

    .line 531
    .line 532
    .line 533
    move-result-object v16

    .line 534
    :goto_6
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 535
    .line 536
    .line 537
    move-result v17

    .line 538
    if-eqz v17, :cond_f

    .line 539
    .line 540
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v17

    .line 544
    move-object/from16 v10, v17

    .line 545
    .line 546
    check-cast v10, La/zrs;

    .line 547
    .line 548
    iget-object v10, v10, La/zrs;->a:La/t9m0;

    .line 549
    .line 550
    move-object/from16 v18, v0

    .line 551
    .line 552
    iget-object v0, v11, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;->a:La/t9m0;

    .line 553
    .line 554
    if-ne v10, v0, :cond_e

    .line 555
    .line 556
    goto :goto_7

    .line 557
    :cond_e
    move-object/from16 v0, v18

    .line 558
    .line 559
    const/4 v10, 0x6

    .line 560
    goto :goto_6

    .line 561
    :cond_f
    move-object/from16 v18, v0

    .line 562
    .line 563
    move-object/from16 v17, p0

    .line 564
    .line 565
    :goto_7
    move-object/from16 v0, v17

    .line 566
    .line 567
    check-cast v0, La/zrs;

    .line 568
    .line 569
    if-eqz v0, :cond_10

    .line 570
    .line 571
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 572
    .line 573
    .line 574
    :cond_10
    move-object/from16 v0, v18

    .line 575
    .line 576
    const/4 v10, 0x6

    .line 577
    goto :goto_5

    .line 578
    :cond_11
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 583
    .line 584
    .line 585
    move-result v4

    .line 586
    if-eqz v4, :cond_a

    .line 587
    .line 588
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v4

    .line 592
    check-cast v4, La/zrs;

    .line 593
    .line 594
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 595
    .line 596
    .line 597
    move-result v4

    .line 598
    const/16 v11, 0xa

    .line 599
    .line 600
    const-string v23, ""

    .line 601
    .line 602
    packed-switch v4, :pswitch_data_1

    .line 603
    .line 604
    .line 605
    invoke-static {}, La/t9f;->b()V

    .line 606
    .line 607
    .line 608
    :goto_9
    move-object/from16 v2, p0

    .line 609
    .line 610
    goto/16 :goto_43

    .line 611
    .line 612
    :pswitch_2
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 613
    .line 614
    .line 615
    invoke-static {v3}, La/vdx;->T(La/hj40;)Z

    .line 616
    .line 617
    .line 618
    move-result v4

    .line 619
    if-eqz v4, :cond_12

    .line 620
    .line 621
    move-object/from16 v24, v0

    .line 622
    .line 623
    move-object/from16 v28, v1

    .line 624
    .line 625
    move-object/from16 v30, v2

    .line 626
    .line 627
    move-object/from16 v29, v5

    .line 628
    .line 629
    move-object v1, v6

    .line 630
    move-object/from16 v31, v7

    .line 631
    .line 632
    move-object/from16 v32, v8

    .line 633
    .line 634
    move-object/from16 v25, v9

    .line 635
    .line 636
    move-object/from16 v17, v12

    .line 637
    .line 638
    move-object/from16 v18, v13

    .line 639
    .line 640
    move-object/from16 v26, v14

    .line 641
    .line 642
    move-object/from16 v27, v15

    .line 643
    .line 644
    goto/16 :goto_a

    .line 645
    .line 646
    :cond_12
    new-instance v4, La/psv;

    .line 647
    .line 648
    const-string v11, "TEAM_LINEUPS_HEADER"

    .line 649
    .line 650
    const v10, 0x7f1304cc

    .line 651
    .line 652
    .line 653
    invoke-direct {v4, v11, v10}, La/psv;-><init>(Ljava/lang/String;I)V

    .line 654
    .line 655
    .line 656
    invoke-virtual {v6, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 657
    .line 658
    .line 659
    new-instance v4, La/ti40;

    .line 660
    .line 661
    iget-object v10, v3, La/hj40;->c:Ljava/util/List;

    .line 662
    .line 663
    invoke-static {v10}, La/ufx;->y(Ljava/util/List;)Ljava/util/ArrayList;

    .line 664
    .line 665
    .line 666
    move-result-object v10

    .line 667
    iget-object v11, v3, La/hj40;->f:Ljava/util/List;

    .line 668
    .line 669
    invoke-static {v11}, La/ufx;->y(Ljava/util/List;)Ljava/util/ArrayList;

    .line 670
    .line 671
    .line 672
    move-result-object v11

    .line 673
    move-object/from16 v24, v0

    .line 674
    .line 675
    iget-object v0, v9, La/o4i0;->a:Ljava/lang/String;

    .line 676
    .line 677
    invoke-static {v0, v10}, La/ufx;->z(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    move-object/from16 v17, v12

    .line 682
    .line 683
    iget-object v12, v9, La/o4i0;->b:Ljava/lang/String;

    .line 684
    .line 685
    invoke-static {v12, v11}, La/ufx;->z(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 686
    .line 687
    .line 688
    move-result-object v12

    .line 689
    move-object/from16 v25, v9

    .line 690
    .line 691
    new-instance v9, La/m7m;

    .line 692
    .line 693
    move-object/from16 v18, v13

    .line 694
    .line 695
    iget-object v13, v3, La/hj40;->a:Ljava/lang/String;

    .line 696
    .line 697
    move-object/from16 v26, v14

    .line 698
    .line 699
    iget-object v14, v3, La/hj40;->b:Ljava/lang/String;

    .line 700
    .line 701
    move-object/from16 v27, v15

    .line 702
    .line 703
    const-string v15, "MLBB_FIRST_TEAM_LINEUP_ID"

    .line 704
    .line 705
    invoke-static {v15, v13, v14, v0, v10}, La/ufx;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)La/jbm;

    .line 706
    .line 707
    .line 708
    move-result-object v13

    .line 709
    invoke-static {v0, v10}, La/ufx;->D(Ljava/lang/String;Ljava/util/ArrayList;)La/jj40;

    .line 710
    .line 711
    .line 712
    move-result-object v0

    .line 713
    invoke-static {v12, v11}, La/ufx;->D(Ljava/lang/String;Ljava/util/ArrayList;)La/jj40;

    .line 714
    .line 715
    .line 716
    move-result-object v10

    .line 717
    new-instance v14, La/cbm;

    .line 718
    .line 719
    new-instance v15, La/n0x;

    .line 720
    .line 721
    move-object/from16 v28, v1

    .line 722
    .line 723
    iget-object v1, v0, La/jj40;->c:Ljava/lang/String;

    .line 724
    .line 725
    invoke-direct {v15, v1}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 726
    .line 727
    .line 728
    new-instance v1, La/n0x;

    .line 729
    .line 730
    move-object/from16 v29, v5

    .line 731
    .line 732
    iget-object v5, v10, La/jj40;->c:Ljava/lang/String;

    .line 733
    .line 734
    invoke-direct {v1, v5}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 735
    .line 736
    .line 737
    move-object/from16 v30, v2

    .line 738
    .line 739
    const/4 v5, 0x0

    .line 740
    new-array v2, v5, [Ljava/lang/Object;

    .line 741
    .line 742
    move-object/from16 v31, v7

    .line 743
    .line 744
    iget-object v7, v8, La/ctf0;->b:La/lsm0;

    .line 745
    .line 746
    invoke-static {v2, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 747
    .line 748
    .line 749
    move-result-object v2

    .line 750
    const v5, 0x7f1317ff

    .line 751
    .line 752
    .line 753
    invoke-virtual {v7, v5, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 754
    .line 755
    .line 756
    move-result-object v2

    .line 757
    iget-object v0, v0, La/jj40;->f:La/oj40;

    .line 758
    .line 759
    iget-object v5, v0, La/oj40;->a:Ljava/lang/Integer;

    .line 760
    .line 761
    iget-object v10, v10, La/jj40;->f:La/oj40;

    .line 762
    .line 763
    move-object/from16 v32, v8

    .line 764
    .line 765
    iget-object v8, v10, La/oj40;->a:Ljava/lang/Integer;

    .line 766
    .line 767
    move-object/from16 v33, v6

    .line 768
    .line 769
    sget-object v6, La/cdd;->a:La/cdd;

    .line 770
    .line 771
    move-object/from16 v16, v4

    .line 772
    .line 773
    new-instance v4, La/xam;

    .line 774
    .line 775
    sget-object v22, La/zam;->a:La/zam;

    .line 776
    .line 777
    move-object/from16 v22, v9

    .line 778
    .line 779
    invoke-static {v5, v8, v6}, La/ufx;->J(Ljava/lang/Integer;Ljava/lang/Integer;La/cdd;)La/abm;

    .line 780
    .line 781
    .line 782
    move-result-object v9

    .line 783
    invoke-static {v8, v5, v6}, La/ufx;->J(Ljava/lang/Integer;Ljava/lang/Integer;La/cdd;)La/abm;

    .line 784
    .line 785
    .line 786
    move-result-object v5

    .line 787
    invoke-direct {v4, v2, v9, v5}, La/xam;-><init>(Ljava/lang/String;La/abm;La/abm;)V

    .line 788
    .line 789
    .line 790
    const/4 v5, 0x0

    .line 791
    new-array v2, v5, [Ljava/lang/Object;

    .line 792
    .line 793
    invoke-static {v2, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 794
    .line 795
    .line 796
    move-result-object v2

    .line 797
    const v6, 0x7f130bb0

    .line 798
    .line 799
    .line 800
    invoke-virtual {v7, v6, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 801
    .line 802
    .line 803
    move-result-object v2

    .line 804
    iget-object v6, v0, La/oj40;->b:Ljava/lang/Integer;

    .line 805
    .line 806
    iget-object v8, v10, La/oj40;->b:Ljava/lang/Integer;

    .line 807
    .line 808
    sget-object v9, La/cdd;->b:La/cdd;

    .line 809
    .line 810
    new-instance v5, La/xam;

    .line 811
    .line 812
    move-object/from16 v23, v13

    .line 813
    .line 814
    invoke-static {v6, v8, v9}, La/ufx;->J(Ljava/lang/Integer;Ljava/lang/Integer;La/cdd;)La/abm;

    .line 815
    .line 816
    .line 817
    move-result-object v13

    .line 818
    invoke-static {v8, v6, v9}, La/ufx;->J(Ljava/lang/Integer;Ljava/lang/Integer;La/cdd;)La/abm;

    .line 819
    .line 820
    .line 821
    move-result-object v6

    .line 822
    invoke-direct {v5, v2, v13, v6}, La/xam;-><init>(Ljava/lang/String;La/abm;La/abm;)V

    .line 823
    .line 824
    .line 825
    const/4 v2, 0x0

    .line 826
    new-array v6, v2, [Ljava/lang/Object;

    .line 827
    .line 828
    invoke-static {v6, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 829
    .line 830
    .line 831
    move-result-object v2

    .line 832
    const v6, 0x7f13073c

    .line 833
    .line 834
    .line 835
    invoke-virtual {v7, v6, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 836
    .line 837
    .line 838
    move-result-object v2

    .line 839
    iget-object v0, v0, La/oj40;->c:Ljava/lang/Integer;

    .line 840
    .line 841
    iget-object v6, v10, La/oj40;->c:Ljava/lang/Integer;

    .line 842
    .line 843
    new-instance v7, La/xam;

    .line 844
    .line 845
    invoke-static {v0, v6, v9}, La/ufx;->J(Ljava/lang/Integer;Ljava/lang/Integer;La/cdd;)La/abm;

    .line 846
    .line 847
    .line 848
    move-result-object v8

    .line 849
    invoke-static {v6, v0, v9}, La/ufx;->J(Ljava/lang/Integer;Ljava/lang/Integer;La/cdd;)La/abm;

    .line 850
    .line 851
    .line 852
    move-result-object v0

    .line 853
    invoke-direct {v7, v2, v8, v0}, La/xam;-><init>(Ljava/lang/String;La/abm;La/abm;)V

    .line 854
    .line 855
    .line 856
    filled-new-array {v4, v5, v7}, [La/xam;

    .line 857
    .line 858
    .line 859
    move-result-object v0

    .line 860
    invoke-static {v0}, La/tx3;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 861
    .line 862
    .line 863
    move-result-object v0

    .line 864
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 865
    .line 866
    .line 867
    move-result-object v0

    .line 868
    invoke-direct {v14, v15, v1, v0}, La/cbm;-><init>(La/n0x;La/n0x;La/i4;)V

    .line 869
    .line 870
    .line 871
    iget-object v0, v3, La/hj40;->d:Ljava/lang/String;

    .line 872
    .line 873
    iget-object v1, v3, La/hj40;->e:Ljava/lang/String;

    .line 874
    .line 875
    const-string v2, "MLBB_SECOND_TEAM_LINEUP_ID"

    .line 876
    .line 877
    invoke-static {v2, v0, v1, v12, v11}, La/ufx;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)La/jbm;

    .line 878
    .line 879
    .line 880
    move-result-object v0

    .line 881
    move-object/from16 v1, v22

    .line 882
    .line 883
    move-object/from16 v2, v23

    .line 884
    .line 885
    invoke-direct {v1, v2, v14, v0}, La/m7m;-><init>(La/jbm;La/cbm;La/jbm;)V

    .line 886
    .line 887
    .line 888
    move-object/from16 v0, v16

    .line 889
    .line 890
    invoke-direct {v0, v1}, La/ti40;-><init>(La/m7m;)V

    .line 891
    .line 892
    .line 893
    move-object/from16 v1, v33

    .line 894
    .line 895
    invoke-virtual {v1, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 896
    .line 897
    .line 898
    :goto_a
    move-object v5, v3

    .line 899
    move-object v3, v1

    .line 900
    move-object v1, v5

    .line 901
    move-object/from16 v11, p0

    .line 902
    .line 903
    move-object/from16 v36, v17

    .line 904
    .line 905
    move-object/from16 v39, v26

    .line 906
    .line 907
    move-object/from16 v9, v28

    .line 908
    .line 909
    move-object/from16 v5, v29

    .line 910
    .line 911
    move-object/from16 v6, v31

    .line 912
    .line 913
    move-object/from16 v8, v32

    .line 914
    .line 915
    const/4 v15, 0x6

    .line 916
    move-object/from16 v26, v18

    .line 917
    .line 918
    goto/16 :goto_41

    .line 919
    .line 920
    :pswitch_3
    move-object/from16 v24, v0

    .line 921
    .line 922
    move-object/from16 v28, v1

    .line 923
    .line 924
    move-object/from16 v30, v2

    .line 925
    .line 926
    move-object/from16 v29, v5

    .line 927
    .line 928
    move-object v1, v6

    .line 929
    move-object/from16 v31, v7

    .line 930
    .line 931
    move-object/from16 v32, v8

    .line 932
    .line 933
    move-object/from16 v25, v9

    .line 934
    .line 935
    move-object/from16 v17, v12

    .line 936
    .line 937
    move-object/from16 v18, v13

    .line 938
    .line 939
    move-object/from16 v26, v14

    .line 940
    .line 941
    move-object/from16 v27, v15

    .line 942
    .line 943
    invoke-static/range {v31 .. v31}, La/vdx;->R(La/el40;)Z

    .line 944
    .line 945
    .line 946
    move-result v0

    .line 947
    if-eqz v0, :cond_14

    .line 948
    .line 949
    move-object/from16 v6, v31

    .line 950
    .line 951
    :cond_13
    move-object/from16 v10, v17

    .line 952
    .line 953
    move-object/from16 v7, v26

    .line 954
    .line 955
    move-object/from16 v2, v27

    .line 956
    .line 957
    move-object/from16 v9, v32

    .line 958
    .line 959
    move-object/from16 v26, v18

    .line 960
    .line 961
    goto/16 :goto_12

    .line 962
    .line 963
    :cond_14
    new-instance v0, La/psv;

    .line 964
    .line 965
    const-string v2, "PREVIOUS_MAPS_HEADER"

    .line 966
    .line 967
    const v4, 0x7f130ff8

    .line 968
    .line 969
    .line 970
    invoke-direct {v0, v2, v4}, La/psv;-><init>(Ljava/lang/String;I)V

    .line 971
    .line 972
    .line 973
    invoke-virtual {v1, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 974
    .line 975
    .line 976
    new-instance v14, La/n0x;

    .line 977
    .line 978
    invoke-virtual/range {v32 .. v32}, La/ctf0;->j()Z

    .line 979
    .line 980
    .line 981
    move-result v0

    .line 982
    new-instance v2, Ljava/lang/StringBuilder;

    .line 983
    .line 984
    sget-object v4, La/ujn;->h:Ljava/lang/String;

    .line 985
    .line 986
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 987
    .line 988
    .line 989
    if-eqz v0, :cond_15

    .line 990
    .line 991
    const-string v0, "static/img/ImgDefault/Esports/MLBB/Previos_Maps_Tablet.png"

    .line 992
    .line 993
    goto :goto_b

    .line 994
    :cond_15
    const-string v0, "static/img/ImgDefault/Esports/MLBB/Previos_Maps.png"

    .line 995
    .line 996
    :goto_b
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 997
    .line 998
    .line 999
    move-result v4

    .line 1000
    if-nez v4, :cond_16

    .line 1001
    .line 1002
    const/4 v5, 0x0

    .line 1003
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1004
    .line 1005
    .line 1006
    goto :goto_d

    .line 1007
    :cond_16
    const/4 v5, 0x0

    .line 1008
    sget-object v4, La/ujn;->h:Ljava/lang/String;

    .line 1009
    .line 1010
    invoke-static {v0, v4, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1011
    .line 1012
    .line 1013
    move-result v4

    .line 1014
    if-nez v4, :cond_19

    .line 1015
    .line 1016
    const-string v4, "https://"

    .line 1017
    .line 1018
    invoke-static {v0, v4, v5}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1019
    .line 1020
    .line 1021
    move-result v4

    .line 1022
    if-eqz v4, :cond_17

    .line 1023
    .line 1024
    const/4 v4, 0x0

    .line 1025
    goto :goto_c

    .line 1026
    :cond_17
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    .line 1027
    .line 1028
    .line 1029
    move-result v4

    .line 1030
    const/16 v5, 0x2f

    .line 1031
    .line 1032
    if-lez v4, :cond_18

    .line 1033
    .line 1034
    const-string v4, "/"

    .line 1035
    .line 1036
    invoke-static {v2, v4}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 1037
    .line 1038
    .line 1039
    move-result v4

    .line 1040
    if-nez v4, :cond_18

    .line 1041
    .line 1042
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1043
    .line 1044
    .line 1045
    :cond_18
    const/4 v4, 0x1

    .line 1046
    new-array v6, v4, [C

    .line 1047
    .line 1048
    const/4 v4, 0x0

    .line 1049
    aput-char v5, v6, v4

    .line 1050
    .line 1051
    invoke-static {v0, v6}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v0

    .line 1055
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1056
    .line 1057
    .line 1058
    goto :goto_d

    .line 1059
    :cond_19
    move v4, v5

    .line 1060
    :goto_c
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1061
    .line 1062
    .line 1063
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1064
    .line 1065
    .line 1066
    :goto_d
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v0

    .line 1070
    invoke-direct {v14, v0}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 1071
    .line 1072
    .line 1073
    move-object/from16 v6, v31

    .line 1074
    .line 1075
    iget-object v0, v6, La/el40;->h:Ljava/util/List;

    .line 1076
    .line 1077
    new-instance v2, Ljava/util/ArrayList;

    .line 1078
    .line 1079
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1080
    .line 1081
    .line 1082
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v0

    .line 1086
    :cond_1a
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1087
    .line 1088
    .line 1089
    move-result v4

    .line 1090
    if-eqz v4, :cond_1b

    .line 1091
    .line 1092
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v4

    .line 1096
    move-object v5, v4

    .line 1097
    check-cast v5, La/cah;

    .line 1098
    .line 1099
    iget v5, v5, La/cah;->c:I

    .line 1100
    .line 1101
    iget v7, v6, La/el40;->i:I

    .line 1102
    .line 1103
    if-ge v5, v7, :cond_1a

    .line 1104
    .line 1105
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1106
    .line 1107
    .line 1108
    goto :goto_e

    .line 1109
    :cond_1b
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v0

    .line 1113
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1114
    .line 1115
    .line 1116
    move-result v2

    .line 1117
    if-eqz v2, :cond_13

    .line 1118
    .line 1119
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v2

    .line 1123
    check-cast v2, La/cah;

    .line 1124
    .line 1125
    new-instance v4, La/xk40;

    .line 1126
    .line 1127
    iget v5, v2, La/cah;->c:I

    .line 1128
    .line 1129
    const-string v7, "PREVIOUS_MAP_"

    .line 1130
    .line 1131
    invoke-static {v5, v7}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v5

    .line 1135
    new-instance v12, La/o6m;

    .line 1136
    .line 1137
    iget v7, v2, La/cah;->c:I

    .line 1138
    .line 1139
    iget-object v8, v2, La/cah;->d:La/zf90;

    .line 1140
    .line 1141
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v7

    .line 1145
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v7

    .line 1149
    move-object/from16 v9, v32

    .line 1150
    .line 1151
    iget-object v10, v9, La/ctf0;->b:La/lsm0;

    .line 1152
    .line 1153
    const/4 v11, 0x1

    .line 1154
    invoke-static {v7, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v7

    .line 1158
    const v11, 0x7f13071d

    .line 1159
    .line 1160
    .line 1161
    invoke-virtual {v10, v11, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v13

    .line 1165
    invoke-static/range {v17 .. v17}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v7

    .line 1169
    check-cast v7, Ljava/lang/String;

    .line 1170
    .line 1171
    if-nez v7, :cond_1c

    .line 1172
    .line 1173
    move-object/from16 v7, v23

    .line 1174
    .line 1175
    :cond_1c
    sget-object v10, La/zf90;->a:La/zf90;

    .line 1176
    .line 1177
    if-ne v8, v10, :cond_1d

    .line 1178
    .line 1179
    const/4 v10, 0x1

    .line 1180
    goto :goto_10

    .line 1181
    :cond_1d
    const/4 v10, 0x0

    .line 1182
    :goto_10
    invoke-static {v9, v7, v10}, La/zdx;->v(La/ctf0;Ljava/lang/String;Z)La/p6m;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v15

    .line 1186
    invoke-static/range {v18 .. v18}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v7

    .line 1190
    check-cast v7, Ljava/lang/String;

    .line 1191
    .line 1192
    if-nez v7, :cond_1e

    .line 1193
    .line 1194
    move-object/from16 v7, v23

    .line 1195
    .line 1196
    :cond_1e
    sget-object v10, La/zf90;->b:La/zf90;

    .line 1197
    .line 1198
    if-ne v8, v10, :cond_1f

    .line 1199
    .line 1200
    const/4 v8, 0x1

    .line 1201
    goto :goto_11

    .line 1202
    :cond_1f
    const/4 v8, 0x0

    .line 1203
    :goto_11
    invoke-static {v9, v7, v8}, La/zdx;->v(La/ctf0;Ljava/lang/String;Z)La/p6m;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v16

    .line 1207
    iget v7, v2, La/cah;->a:I

    .line 1208
    .line 1209
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v7

    .line 1213
    iget v2, v2, La/cah;->b:I

    .line 1214
    .line 1215
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v2

    .line 1219
    move-object/from16 v10, v17

    .line 1220
    .line 1221
    move-object/from16 v17, v7

    .line 1222
    .line 1223
    move-object/from16 v7, v26

    .line 1224
    .line 1225
    move-object/from16 v26, v18

    .line 1226
    .line 1227
    move-object/from16 v18, v2

    .line 1228
    .line 1229
    move-object/from16 v2, v27

    .line 1230
    .line 1231
    invoke-direct/range {v12 .. v19}, La/o6m;-><init>(Ljava/lang/String;La/n0x;La/p6m;La/p6m;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1232
    .line 1233
    .line 1234
    invoke-direct {v4, v5, v12}, La/xk40;-><init>(Ljava/lang/String;La/o6m;)V

    .line 1235
    .line 1236
    .line 1237
    invoke-virtual {v1, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1238
    .line 1239
    .line 1240
    move-object/from16 v32, v9

    .line 1241
    .line 1242
    move-object/from16 v17, v10

    .line 1243
    .line 1244
    move-object/from16 v18, v26

    .line 1245
    .line 1246
    move-object/from16 v26, v7

    .line 1247
    .line 1248
    goto/16 :goto_f

    .line 1249
    .line 1250
    :goto_12
    move-object v5, v3

    .line 1251
    move-object v3, v1

    .line 1252
    move-object v1, v5

    .line 1253
    move-object/from16 v11, p0

    .line 1254
    .line 1255
    move-object/from16 v27, v2

    .line 1256
    .line 1257
    move-object/from16 v39, v7

    .line 1258
    .line 1259
    move-object v8, v9

    .line 1260
    move-object/from16 v36, v10

    .line 1261
    .line 1262
    :goto_13
    move-object/from16 v9, v28

    .line 1263
    .line 1264
    move-object/from16 v5, v29

    .line 1265
    .line 1266
    :goto_14
    const/4 v15, 0x6

    .line 1267
    goto/16 :goto_41

    .line 1268
    .line 1269
    :pswitch_4
    move-object/from16 v24, v0

    .line 1270
    .line 1271
    move-object/from16 v28, v1

    .line 1272
    .line 1273
    move-object/from16 v30, v2

    .line 1274
    .line 1275
    move-object/from16 v29, v5

    .line 1276
    .line 1277
    move-object v1, v6

    .line 1278
    move-object v6, v7

    .line 1279
    move-object/from16 v25, v9

    .line 1280
    .line 1281
    move-object v10, v12

    .line 1282
    move-object/from16 v26, v13

    .line 1283
    .line 1284
    move-object v7, v14

    .line 1285
    move-object v2, v15

    .line 1286
    move-object v9, v8

    .line 1287
    invoke-static {v6}, La/vdx;->Q(La/el40;)Z

    .line 1288
    .line 1289
    .line 1290
    move-result v0

    .line 1291
    if-eqz v0, :cond_20

    .line 1292
    .line 1293
    move-object/from16 v17, v3

    .line 1294
    .line 1295
    move-object/from16 v0, v30

    .line 1296
    .line 1297
    goto/16 :goto_19

    .line 1298
    .line 1299
    :cond_20
    move-object/from16 v0, v30

    .line 1300
    .line 1301
    iget-object v4, v0, La/fl40;->b:La/cl40;

    .line 1302
    .line 1303
    sget-object v5, La/cl40;->b:La/cl40;

    .line 1304
    .line 1305
    if-ne v4, v5, :cond_23

    .line 1306
    .line 1307
    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1308
    .line 1309
    .line 1310
    move-result-object v4

    .line 1311
    check-cast v4, Ljava/lang/String;

    .line 1312
    .line 1313
    if-nez v4, :cond_21

    .line 1314
    .line 1315
    move-object/from16 v4, v23

    .line 1316
    .line 1317
    :cond_21
    invoke-static/range {v26 .. v26}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v5

    .line 1321
    check-cast v5, Ljava/lang/String;

    .line 1322
    .line 1323
    if-nez v5, :cond_22

    .line 1324
    .line 1325
    goto :goto_15

    .line 1326
    :cond_22
    move-object/from16 v23, v5

    .line 1327
    .line 1328
    :goto_15
    move-object v5, v0

    .line 1329
    move-object v15, v2

    .line 1330
    move-object/from16 v8, v23

    .line 1331
    .line 1332
    goto :goto_17

    .line 1333
    :cond_23
    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1334
    .line 1335
    .line 1336
    move-result-object v4

    .line 1337
    check-cast v4, Ljava/lang/String;

    .line 1338
    .line 1339
    if-nez v4, :cond_24

    .line 1340
    .line 1341
    move-object/from16 v4, v23

    .line 1342
    .line 1343
    :cond_24
    invoke-static/range {v26 .. v26}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v5

    .line 1347
    check-cast v5, Ljava/lang/String;

    .line 1348
    .line 1349
    if-nez v5, :cond_25

    .line 1350
    .line 1351
    goto :goto_16

    .line 1352
    :cond_25
    move-object/from16 v23, v5

    .line 1353
    .line 1354
    :goto_16
    move-object v15, v0

    .line 1355
    move-object v5, v2

    .line 1356
    move-object v8, v4

    .line 1357
    move-object/from16 v4, v23

    .line 1358
    .line 1359
    :goto_17
    iget-object v12, v15, La/fl40;->g:Ljava/util/List;

    .line 1360
    .line 1361
    new-instance v13, Ljava/util/ArrayList;

    .line 1362
    .line 1363
    invoke-static {v12, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1364
    .line 1365
    .line 1366
    move-result v11

    .line 1367
    invoke-direct {v13, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 1368
    .line 1369
    .line 1370
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v11

    .line 1374
    const/4 v12, 0x0

    .line 1375
    :goto_18
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 1376
    .line 1377
    .line 1378
    move-result v14

    .line 1379
    if-eqz v14, :cond_27

    .line 1380
    .line 1381
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v14

    .line 1385
    add-int/lit8 v15, v12, 0x1

    .line 1386
    .line 1387
    if-ltz v12, :cond_26

    .line 1388
    .line 1389
    check-cast v14, La/vi40;

    .line 1390
    .line 1391
    move-object/from16 v17, v3

    .line 1392
    .line 1393
    iget v3, v14, La/vi40;->a:I

    .line 1394
    .line 1395
    move/from16 v16, v3

    .line 1396
    .line 1397
    iget-object v3, v5, La/fl40;->g:Ljava/util/List;

    .line 1398
    .line 1399
    invoke-interface {v3, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v3

    .line 1403
    check-cast v3, La/vi40;

    .line 1404
    .line 1405
    iget v3, v3, La/vi40;->a:I

    .line 1406
    .line 1407
    sub-int v3, v16, v3

    .line 1408
    .line 1409
    const/16 v12, -0x4e20

    .line 1410
    .line 1411
    move-object/from16 v16, v5

    .line 1412
    .line 1413
    const/16 v5, 0x4e20

    .line 1414
    .line 1415
    invoke-static {v3, v12, v5}, La/l1e0;->d(III)I

    .line 1416
    .line 1417
    .line 1418
    move-result v3

    .line 1419
    new-instance v5, La/v4m;

    .line 1420
    .line 1421
    iget v12, v14, La/vi40;->b:I

    .line 1422
    .line 1423
    invoke-direct {v5, v12, v3}, La/v4m;-><init>(II)V

    .line 1424
    .line 1425
    .line 1426
    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1427
    .line 1428
    .line 1429
    move v12, v15

    .line 1430
    move-object/from16 v5, v16

    .line 1431
    .line 1432
    move-object/from16 v3, v17

    .line 1433
    .line 1434
    goto :goto_18

    .line 1435
    :cond_26
    invoke-static {}, La/q3d;->p()V

    .line 1436
    .line 1437
    .line 1438
    throw p0

    .line 1439
    :cond_27
    move-object/from16 v17, v3

    .line 1440
    .line 1441
    invoke-static {v13}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1442
    .line 1443
    .line 1444
    move-result-object v3

    .line 1445
    new-instance v5, La/psv;

    .line 1446
    .line 1447
    const-string v11, "GOLD_CHART_HEADER"

    .line 1448
    .line 1449
    const v12, 0x7f130619

    .line 1450
    .line 1451
    .line 1452
    invoke-direct {v5, v11, v12}, La/psv;-><init>(Ljava/lang/String;I)V

    .line 1453
    .line 1454
    .line 1455
    invoke-virtual {v1, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1456
    .line 1457
    .line 1458
    new-instance v5, La/ui40;

    .line 1459
    .line 1460
    new-instance v11, La/t4m;

    .line 1461
    .line 1462
    new-instance v12, La/w4m;

    .line 1463
    .line 1464
    new-instance v13, La/y4m;

    .line 1465
    .line 1466
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 1467
    .line 1468
    .line 1469
    sget-object v14, La/a5m;->a:La/a5m;

    .line 1470
    .line 1471
    invoke-direct {v12, v3, v13, v14}, La/w4m;-><init>(La/a4x;La/z4m;La/a5m;)V

    .line 1472
    .line 1473
    .line 1474
    const v3, 0x7f080878

    .line 1475
    .line 1476
    .line 1477
    sget-wide v13, La/ijg;->l0:J

    .line 1478
    .line 1479
    invoke-static {v8, v3, v13, v14}, La/idx;->D(Ljava/lang/String;IJ)La/s4m;

    .line 1480
    .line 1481
    .line 1482
    move-result-object v3

    .line 1483
    const v8, 0x7f080876

    .line 1484
    .line 1485
    .line 1486
    sget-wide v13, La/ijg;->L0:J

    .line 1487
    .line 1488
    invoke-static {v4, v8, v13, v14}, La/idx;->D(Ljava/lang/String;IJ)La/s4m;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v4

    .line 1492
    invoke-direct {v11, v12, v3, v4}, La/t4m;-><init>(La/w4m;La/s4m;La/s4m;)V

    .line 1493
    .line 1494
    .line 1495
    invoke-direct {v5, v11}, La/ui40;-><init>(La/t4m;)V

    .line 1496
    .line 1497
    .line 1498
    invoke-virtual {v1, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1499
    .line 1500
    .line 1501
    :cond_28
    :goto_19
    move-object/from16 v11, p0

    .line 1502
    .line 1503
    move-object/from16 v30, v0

    .line 1504
    .line 1505
    move-object v3, v1

    .line 1506
    move-object/from16 v27, v2

    .line 1507
    .line 1508
    move-object/from16 v39, v7

    .line 1509
    .line 1510
    move-object v8, v9

    .line 1511
    move-object/from16 v36, v10

    .line 1512
    .line 1513
    move-object/from16 v1, v17

    .line 1514
    .line 1515
    goto/16 :goto_13

    .line 1516
    .line 1517
    :pswitch_5
    move-object/from16 v24, v0

    .line 1518
    .line 1519
    move-object/from16 v28, v1

    .line 1520
    .line 1521
    move-object v0, v2

    .line 1522
    move-object/from16 v17, v3

    .line 1523
    .line 1524
    move-object/from16 v29, v5

    .line 1525
    .line 1526
    move-object v1, v6

    .line 1527
    move-object v6, v7

    .line 1528
    move-object/from16 v25, v9

    .line 1529
    .line 1530
    move-object v10, v12

    .line 1531
    move-object/from16 v26, v13

    .line 1532
    .line 1533
    move-object v7, v14

    .line 1534
    move-object v2, v15

    .line 1535
    move-object v9, v8

    .line 1536
    sget-object v3, La/fj40;->a:Ljava/util/List;

    .line 1537
    .line 1538
    invoke-static {v6}, La/vdx;->V(La/el40;)Z

    .line 1539
    .line 1540
    .line 1541
    move-result v3

    .line 1542
    if-nez v3, :cond_28

    .line 1543
    .line 1544
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 1545
    .line 1546
    .line 1547
    move-result v3

    .line 1548
    if-eqz v3, :cond_29

    .line 1549
    .line 1550
    goto :goto_19

    .line 1551
    :cond_29
    new-instance v3, La/psv;

    .line 1552
    .line 1553
    const-string v4, "PICK_BAN_HEADER"

    .line 1554
    .line 1555
    const v5, 0x7f13021b

    .line 1556
    .line 1557
    .line 1558
    invoke-direct {v3, v4, v5}, La/psv;-><init>(Ljava/lang/String;I)V

    .line 1559
    .line 1560
    .line 1561
    invoke-virtual {v1, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1562
    .line 1563
    .line 1564
    new-instance v3, Ljava/util/ArrayList;

    .line 1565
    .line 1566
    invoke-static {v7, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1567
    .line 1568
    .line 1569
    move-result v4

    .line 1570
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 1571
    .line 1572
    .line 1573
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1574
    .line 1575
    .line 1576
    move-result-object v4

    .line 1577
    const/4 v5, 0x0

    .line 1578
    :goto_1a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1579
    .line 1580
    .line 1581
    move-result v8

    .line 1582
    if-eqz v8, :cond_2b

    .line 1583
    .line 1584
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1585
    .line 1586
    .line 1587
    move-result-object v8

    .line 1588
    add-int/lit8 v11, v5, 0x1

    .line 1589
    .line 1590
    if-ltz v5, :cond_2a

    .line 1591
    .line 1592
    check-cast v8, La/xh40;

    .line 1593
    .line 1594
    new-instance v5, La/b960;

    .line 1595
    .line 1596
    invoke-direct {v5, v8, v11}, La/b960;-><init>(La/xh40;I)V

    .line 1597
    .line 1598
    .line 1599
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1600
    .line 1601
    .line 1602
    move v5, v11

    .line 1603
    goto :goto_1a

    .line 1604
    :cond_2a
    invoke-static {}, La/q3d;->p()V

    .line 1605
    .line 1606
    .line 1607
    throw p0

    .line 1608
    :cond_2b
    new-instance v4, Ljava/util/ArrayList;

    .line 1609
    .line 1610
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1611
    .line 1612
    .line 1613
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1614
    .line 1615
    .line 1616
    move-result-object v5

    .line 1617
    :cond_2c
    :goto_1b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1618
    .line 1619
    .line 1620
    move-result v8

    .line 1621
    if-eqz v8, :cond_2d

    .line 1622
    .line 1623
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v8

    .line 1627
    move-object v11, v8

    .line 1628
    check-cast v11, La/b960;

    .line 1629
    .line 1630
    iget-object v11, v11, La/b960;->a:La/xh40;

    .line 1631
    .line 1632
    invoke-interface {v11}, La/xh40;->a()I

    .line 1633
    .line 1634
    .line 1635
    move-result v11

    .line 1636
    const/4 v12, 0x1

    .line 1637
    if-ne v11, v12, :cond_2c

    .line 1638
    .line 1639
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1640
    .line 1641
    .line 1642
    goto :goto_1b

    .line 1643
    :cond_2d
    new-instance v5, Ljava/util/ArrayList;

    .line 1644
    .line 1645
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1646
    .line 1647
    .line 1648
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1649
    .line 1650
    .line 1651
    move-result-object v3

    .line 1652
    :cond_2e
    :goto_1c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1653
    .line 1654
    .line 1655
    move-result v8

    .line 1656
    if-eqz v8, :cond_2f

    .line 1657
    .line 1658
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1659
    .line 1660
    .line 1661
    move-result-object v8

    .line 1662
    move-object v11, v8

    .line 1663
    check-cast v11, La/b960;

    .line 1664
    .line 1665
    iget-object v11, v11, La/b960;->a:La/xh40;

    .line 1666
    .line 1667
    invoke-interface {v11}, La/xh40;->a()I

    .line 1668
    .line 1669
    .line 1670
    move-result v11

    .line 1671
    const/4 v12, 0x2

    .line 1672
    if-ne v11, v12, :cond_2e

    .line 1673
    .line 1674
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1675
    .line 1676
    .line 1677
    goto :goto_1c

    .line 1678
    :cond_2f
    sget-object v3, La/fj40;->a:Ljava/util/List;

    .line 1679
    .line 1680
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1681
    .line 1682
    .line 1683
    move-result v3

    .line 1684
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 1685
    .line 1686
    .line 1687
    move-result v8

    .line 1688
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 1689
    .line 1690
    .line 1691
    move-result v11

    .line 1692
    invoke-static {v8, v11}, Ljava/lang/Math;->max(II)I

    .line 1693
    .line 1694
    .line 1695
    move-result v8

    .line 1696
    invoke-static {v3, v8}, Ljava/lang/Math;->max(II)I

    .line 1697
    .line 1698
    .line 1699
    move-result v3

    .line 1700
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 1701
    .line 1702
    .line 1703
    move-result v8

    .line 1704
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 1705
    .line 1706
    .line 1707
    move-result v11

    .line 1708
    invoke-static {v8, v11}, Ljava/lang/Math;->min(II)I

    .line 1709
    .line 1710
    .line 1711
    move-result v8

    .line 1712
    add-int/lit8 v11, v3, -0x1

    .line 1713
    .line 1714
    if-le v8, v11, :cond_30

    .line 1715
    .line 1716
    move v8, v11

    .line 1717
    :cond_30
    new-instance v11, La/gj40;

    .line 1718
    .line 1719
    new-instance v12, La/x6m;

    .line 1720
    .line 1721
    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1722
    .line 1723
    .line 1724
    move-result-object v13

    .line 1725
    check-cast v13, Ljava/lang/String;

    .line 1726
    .line 1727
    if-nez v13, :cond_31

    .line 1728
    .line 1729
    move-object/from16 v13, v23

    .line 1730
    .line 1731
    :cond_31
    invoke-static {v13}, La/fj40;->a(Ljava/lang/String;)La/c280;

    .line 1732
    .line 1733
    .line 1734
    move-result-object v13

    .line 1735
    invoke-static/range {v26 .. v26}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1736
    .line 1737
    .line 1738
    move-result-object v14

    .line 1739
    check-cast v14, Ljava/lang/String;

    .line 1740
    .line 1741
    if-nez v14, :cond_32

    .line 1742
    .line 1743
    goto :goto_1d

    .line 1744
    :cond_32
    move-object/from16 v23, v14

    .line 1745
    .line 1746
    :goto_1d
    invoke-static/range {v23 .. v23}, La/fj40;->a(Ljava/lang/String;)La/c280;

    .line 1747
    .line 1748
    .line 1749
    move-result-object v14

    .line 1750
    invoke-direct {v12, v13, v14}, La/x6m;-><init>(La/c280;La/c280;)V

    .line 1751
    .line 1752
    .line 1753
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 1754
    .line 1755
    .line 1756
    move-result-object v13

    .line 1757
    const/4 v14, 0x0

    .line 1758
    :goto_1e
    if-ge v14, v3, :cond_33

    .line 1759
    .line 1760
    invoke-static {v14, v4}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 1761
    .line 1762
    .line 1763
    move-result-object v15

    .line 1764
    check-cast v15, La/b960;

    .line 1765
    .line 1766
    invoke-static {v14, v5}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 1767
    .line 1768
    .line 1769
    move-result-object v16

    .line 1770
    move/from16 v18, v3

    .line 1771
    .line 1772
    move-object/from16 v3, v16

    .line 1773
    .line 1774
    check-cast v3, La/b960;

    .line 1775
    .line 1776
    move-object/from16 v27, v4

    .line 1777
    .line 1778
    invoke-static {v15, v14, v3}, La/fj40;->b(La/b960;ILa/b960;)La/b7m;

    .line 1779
    .line 1780
    .line 1781
    move-result-object v4

    .line 1782
    invoke-virtual {v13, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1783
    .line 1784
    .line 1785
    invoke-static {v3, v14, v15}, La/fj40;->b(La/b960;ILa/b960;)La/b7m;

    .line 1786
    .line 1787
    .line 1788
    move-result-object v3

    .line 1789
    invoke-virtual {v13, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1790
    .line 1791
    .line 1792
    add-int/lit8 v14, v14, 0x1

    .line 1793
    .line 1794
    move/from16 v3, v18

    .line 1795
    .line 1796
    move-object/from16 v4, v27

    .line 1797
    .line 1798
    goto :goto_1e

    .line 1799
    :cond_33
    invoke-static {v13}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 1800
    .line 1801
    .line 1802
    move-result-object v3

    .line 1803
    invoke-static {v3}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 1804
    .line 1805
    .line 1806
    move-result-object v3

    .line 1807
    invoke-direct {v11, v12, v3, v8}, La/gj40;-><init>(La/x6m;La/i4;I)V

    .line 1808
    .line 1809
    .line 1810
    invoke-virtual {v1, v11}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1811
    .line 1812
    .line 1813
    goto/16 :goto_19

    .line 1814
    .line 1815
    :pswitch_6
    move-object/from16 v24, v0

    .line 1816
    .line 1817
    move-object/from16 v28, v1

    .line 1818
    .line 1819
    move-object v0, v2

    .line 1820
    move-object/from16 v17, v3

    .line 1821
    .line 1822
    move-object/from16 v29, v5

    .line 1823
    .line 1824
    move-object v1, v6

    .line 1825
    move-object v6, v7

    .line 1826
    move-object/from16 v25, v9

    .line 1827
    .line 1828
    move-object v10, v12

    .line 1829
    move-object/from16 v26, v13

    .line 1830
    .line 1831
    move-object v7, v14

    .line 1832
    move-object v2, v15

    .line 1833
    move-object v9, v8

    .line 1834
    invoke-static {v6}, La/vdx;->V(La/el40;)Z

    .line 1835
    .line 1836
    .line 1837
    move-result v3

    .line 1838
    if-nez v3, :cond_34

    .line 1839
    .line 1840
    invoke-static {v0}, La/vdx;->P(La/fl40;)Z

    .line 1841
    .line 1842
    .line 1843
    move-result v3

    .line 1844
    if-nez v3, :cond_34

    .line 1845
    .line 1846
    invoke-static {v2}, La/vdx;->P(La/fl40;)Z

    .line 1847
    .line 1848
    .line 1849
    move-result v3

    .line 1850
    if-eqz v3, :cond_35

    .line 1851
    .line 1852
    :cond_34
    move-object/from16 v38, v6

    .line 1853
    .line 1854
    move-object/from16 v39, v7

    .line 1855
    .line 1856
    move-object/from16 v35, v9

    .line 1857
    .line 1858
    move-object/from16 v36, v10

    .line 1859
    .line 1860
    move-object/from16 v37, v29

    .line 1861
    .line 1862
    goto/16 :goto_34

    .line 1863
    .line 1864
    :cond_35
    new-instance v3, La/xj40;

    .line 1865
    .line 1866
    move-object/from16 v5, v29

    .line 1867
    .line 1868
    iget-object v4, v5, La/m9s;->i:Ljava/lang/String;

    .line 1869
    .line 1870
    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1871
    .line 1872
    .line 1873
    move-result-object v8

    .line 1874
    check-cast v8, Ljava/lang/String;

    .line 1875
    .line 1876
    if-nez v8, :cond_36

    .line 1877
    .line 1878
    move-object/from16 v8, v23

    .line 1879
    .line 1880
    :cond_36
    invoke-direct {v3, v4, v8, v0}, La/xj40;-><init>(Ljava/lang/String;Ljava/lang/String;La/fl40;)V

    .line 1881
    .line 1882
    .line 1883
    new-instance v4, La/xj40;

    .line 1884
    .line 1885
    iget-object v8, v5, La/m9s;->j:Ljava/lang/String;

    .line 1886
    .line 1887
    invoke-static/range {v26 .. v26}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1888
    .line 1889
    .line 1890
    move-result-object v12

    .line 1891
    check-cast v12, Ljava/lang/String;

    .line 1892
    .line 1893
    if-nez v12, :cond_37

    .line 1894
    .line 1895
    move-object/from16 v12, v23

    .line 1896
    .line 1897
    :cond_37
    invoke-direct {v4, v8, v12, v2}, La/xj40;-><init>(Ljava/lang/String;Ljava/lang/String;La/fl40;)V

    .line 1898
    .line 1899
    .line 1900
    filled-new-array {v3, v4}, [La/xj40;

    .line 1901
    .line 1902
    .line 1903
    move-result-object v3

    .line 1904
    invoke-static {v3}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 1905
    .line 1906
    .line 1907
    move-result-object v3

    .line 1908
    sget-object v4, La/vj40;->c:La/c0o;

    .line 1909
    .line 1910
    new-instance v8, Ljava/util/ArrayList;

    .line 1911
    .line 1912
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1913
    .line 1914
    .line 1915
    invoke-virtual {v4}, La/b3;->iterator()Ljava/util/Iterator;

    .line 1916
    .line 1917
    .line 1918
    move-result-object v4

    .line 1919
    :cond_38
    :goto_1f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1920
    .line 1921
    .line 1922
    move-result v12

    .line 1923
    if-eqz v12, :cond_3f

    .line 1924
    .line 1925
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1926
    .line 1927
    .line 1928
    move-result-object v12

    .line 1929
    move-object v13, v12

    .line 1930
    check-cast v13, La/vj40;

    .line 1931
    .line 1932
    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    .line 1933
    .line 1934
    .line 1935
    move-result v13

    .line 1936
    if-eqz v13, :cond_3e

    .line 1937
    .line 1938
    const/4 v14, 0x1

    .line 1939
    if-ne v13, v14, :cond_3d

    .line 1940
    .line 1941
    if-eqz v3, :cond_39

    .line 1942
    .line 1943
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 1944
    .line 1945
    .line 1946
    move-result v13

    .line 1947
    if-eqz v13, :cond_39

    .line 1948
    .line 1949
    goto :goto_1f

    .line 1950
    :cond_39
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1951
    .line 1952
    .line 1953
    move-result-object v13

    .line 1954
    :cond_3a
    :goto_20
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 1955
    .line 1956
    .line 1957
    move-result v14

    .line 1958
    if-eqz v14, :cond_38

    .line 1959
    .line 1960
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1961
    .line 1962
    .line 1963
    move-result-object v14

    .line 1964
    check-cast v14, La/xj40;

    .line 1965
    .line 1966
    iget-object v14, v14, La/xj40;->c:La/fl40;

    .line 1967
    .line 1968
    iget-object v14, v14, La/fl40;->a:Ljava/util/List;

    .line 1969
    .line 1970
    if-eqz v14, :cond_3b

    .line 1971
    .line 1972
    invoke-interface {v14}, Ljava/util/Collection;->isEmpty()Z

    .line 1973
    .line 1974
    .line 1975
    move-result v15

    .line 1976
    if-eqz v15, :cond_3b

    .line 1977
    .line 1978
    goto :goto_20

    .line 1979
    :cond_3b
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1980
    .line 1981
    .line 1982
    move-result-object v14

    .line 1983
    :cond_3c
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 1984
    .line 1985
    .line 1986
    move-result v15

    .line 1987
    if-eqz v15, :cond_3a

    .line 1988
    .line 1989
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1990
    .line 1991
    .line 1992
    move-result-object v15

    .line 1993
    check-cast v15, La/xi40;

    .line 1994
    .line 1995
    iget-object v15, v15, La/xi40;->n:Ljava/util/List;

    .line 1996
    .line 1997
    invoke-interface {v15}, Ljava/util/Collection;->isEmpty()Z

    .line 1998
    .line 1999
    .line 2000
    move-result v15

    .line 2001
    if-nez v15, :cond_3c

    .line 2002
    .line 2003
    goto :goto_21

    .line 2004
    :cond_3d
    invoke-static {}, La/t9f;->b()V

    .line 2005
    .line 2006
    .line 2007
    goto/16 :goto_9

    .line 2008
    .line 2009
    :cond_3e
    :goto_21
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2010
    .line 2011
    .line 2012
    goto :goto_1f

    .line 2013
    :cond_3f
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2014
    .line 2015
    .line 2016
    move-result-object v4

    .line 2017
    :cond_40
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 2018
    .line 2019
    .line 2020
    move-result v12

    .line 2021
    if-eqz v12, :cond_41

    .line 2022
    .line 2023
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2024
    .line 2025
    .line 2026
    move-result-object v12

    .line 2027
    move-object v13, v12

    .line 2028
    check-cast v13, La/vj40;

    .line 2029
    .line 2030
    iget-byte v13, v13, La/vj40;->a:B

    .line 2031
    .line 2032
    int-to-long v13, v13

    .line 2033
    cmp-long v13, v13, v20

    .line 2034
    .line 2035
    if-nez v13, :cond_40

    .line 2036
    .line 2037
    goto :goto_22

    .line 2038
    :cond_41
    move-object/from16 v12, p0

    .line 2039
    .line 2040
    :goto_22
    check-cast v12, La/vj40;

    .line 2041
    .line 2042
    if-nez v12, :cond_42

    .line 2043
    .line 2044
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 2045
    .line 2046
    .line 2047
    move-result-object v4

    .line 2048
    move-object v12, v4

    .line 2049
    check-cast v12, La/vj40;

    .line 2050
    .line 2051
    :cond_42
    new-instance v4, La/psv;

    .line 2052
    .line 2053
    const-string v13, "PLAYERS_STATISTIC_HEADER"

    .line 2054
    .line 2055
    const v14, 0x7f130fa7

    .line 2056
    .line 2057
    .line 2058
    invoke-direct {v4, v13, v14}, La/psv;-><init>(Ljava/lang/String;I)V

    .line 2059
    .line 2060
    .line 2061
    invoke-virtual {v1, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2062
    .line 2063
    .line 2064
    new-instance v4, Ljava/util/ArrayList;

    .line 2065
    .line 2066
    invoke-static {v8, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2067
    .line 2068
    .line 2069
    move-result v13

    .line 2070
    invoke-direct {v4, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 2071
    .line 2072
    .line 2073
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2074
    .line 2075
    .line 2076
    move-result-object v8

    .line 2077
    :goto_23
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 2078
    .line 2079
    .line 2080
    move-result v13

    .line 2081
    if-eqz v13, :cond_46

    .line 2082
    .line 2083
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2084
    .line 2085
    .line 2086
    move-result-object v13

    .line 2087
    check-cast v13, La/vj40;

    .line 2088
    .line 2089
    new-instance v29, La/lxl;

    .line 2090
    .line 2091
    iget-byte v15, v13, La/vj40;->a:B

    .line 2092
    .line 2093
    int-to-long v14, v15

    .line 2094
    new-instance v11, La/xxl;

    .line 2095
    .line 2096
    move-object/from16 v37, v5

    .line 2097
    .line 2098
    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    .line 2099
    .line 2100
    .line 2101
    move-result v5

    .line 2102
    if-eqz v5, :cond_44

    .line 2103
    .line 2104
    move-object/from16 v38, v6

    .line 2105
    .line 2106
    const/4 v6, 0x1

    .line 2107
    if-ne v5, v6, :cond_43

    .line 2108
    .line 2109
    const v5, 0x7f130b9a

    .line 2110
    .line 2111
    .line 2112
    :goto_24
    move-object/from16 v39, v7

    .line 2113
    .line 2114
    const/4 v6, 0x0

    .line 2115
    goto :goto_25

    .line 2116
    :cond_43
    invoke-static {}, La/t9f;->b()V

    .line 2117
    .line 2118
    .line 2119
    goto/16 :goto_9

    .line 2120
    .line 2121
    :cond_44
    move-object/from16 v38, v6

    .line 2122
    .line 2123
    const v5, 0x7f131388

    .line 2124
    .line 2125
    .line 2126
    goto :goto_24

    .line 2127
    :goto_25
    new-array v7, v6, [Ljava/lang/Object;

    .line 2128
    .line 2129
    move-object/from16 v40, v8

    .line 2130
    .line 2131
    iget-object v8, v9, La/ctf0;->b:La/lsm0;

    .line 2132
    .line 2133
    invoke-static {v7, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2134
    .line 2135
    .line 2136
    move-result-object v7

    .line 2137
    invoke-virtual {v8, v5, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2138
    .line 2139
    .line 2140
    move-result-object v5

    .line 2141
    invoke-direct {v11, v5}, La/xxl;-><init>(Ljava/lang/String;)V

    .line 2142
    .line 2143
    .line 2144
    if-ne v13, v12, :cond_45

    .line 2145
    .line 2146
    sget-object v5, La/uxl;->b:La/uxl;

    .line 2147
    .line 2148
    :goto_26
    move-object/from16 v34, v5

    .line 2149
    .line 2150
    goto :goto_27

    .line 2151
    :cond_45
    sget-object v5, La/uxl;->a:La/uxl;

    .line 2152
    .line 2153
    goto :goto_26

    .line 2154
    :goto_27
    const/16 v35, 0x0

    .line 2155
    .line 2156
    const/16 v36, 0x6c

    .line 2157
    .line 2158
    const/16 v33, 0x0

    .line 2159
    .line 2160
    move-object/from16 v32, v11

    .line 2161
    .line 2162
    move-wide/from16 v30, v14

    .line 2163
    .line 2164
    invoke-direct/range {v29 .. v36}, La/lxl;-><init>(JLa/dyl;ZLa/uxl;La/cwl;I)V

    .line 2165
    .line 2166
    .line 2167
    move-object/from16 v5, v29

    .line 2168
    .line 2169
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2170
    .line 2171
    .line 2172
    move-object/from16 v5, v37

    .line 2173
    .line 2174
    move-object/from16 v6, v38

    .line 2175
    .line 2176
    move-object/from16 v7, v39

    .line 2177
    .line 2178
    move-object/from16 v8, v40

    .line 2179
    .line 2180
    const/16 v11, 0xa

    .line 2181
    .line 2182
    goto :goto_23

    .line 2183
    :cond_46
    move-object/from16 v37, v5

    .line 2184
    .line 2185
    move-object/from16 v38, v6

    .line 2186
    .line 2187
    move-object/from16 v39, v7

    .line 2188
    .line 2189
    invoke-static {v4}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 2190
    .line 2191
    .line 2192
    move-result-object v30

    .line 2193
    iget-object v4, v9, La/ctf0;->b:La/lsm0;

    .line 2194
    .line 2195
    invoke-virtual {v9}, La/ctf0;->j()Z

    .line 2196
    .line 2197
    .line 2198
    move-result v5

    .line 2199
    invoke-static {v5}, La/xfn;->b(Z)La/wfn;

    .line 2200
    .line 2201
    .line 2202
    move-result-object v5

    .line 2203
    iget v5, v5, La/wfn;->e:F

    .line 2204
    .line 2205
    const/4 v6, 0x0

    .line 2206
    const/4 v7, 0x2

    .line 2207
    invoke-static {v5, v6, v7}, La/s5x0;->t(FFI)La/lh80;

    .line 2208
    .line 2209
    .line 2210
    move-result-object v33

    .line 2211
    new-instance v29, La/fyl;

    .line 2212
    .line 2213
    const/16 v31, 0x0

    .line 2214
    .line 2215
    const/16 v32, 0x0

    .line 2216
    .line 2217
    const/16 v34, 0x0

    .line 2218
    .line 2219
    const/16 v35, 0x16

    .line 2220
    .line 2221
    invoke-direct/range {v29 .. v35}, La/fyl;-><init>(La/a4x;La/tyl;La/syl;La/hh80;La/jyl;I)V

    .line 2222
    .line 2223
    .line 2224
    move-object/from16 v5, v29

    .line 2225
    .line 2226
    sget-object v6, La/pno0;->a:La/pno0;

    .line 2227
    .line 2228
    new-instance v7, La/boo0;

    .line 2229
    .line 2230
    const-string v8, "PLAYERS_STATISTIC_TABS"

    .line 2231
    .line 2232
    invoke-direct {v7, v8, v5, v6}, La/boo0;-><init>(Ljava/lang/String;La/fyl;La/pno0;)V

    .line 2233
    .line 2234
    .line 2235
    invoke-virtual {v1, v7}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2236
    .line 2237
    .line 2238
    new-instance v5, Ljava/util/ArrayList;

    .line 2239
    .line 2240
    const/16 v6, 0xa

    .line 2241
    .line 2242
    invoke-static {v3, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2243
    .line 2244
    .line 2245
    move-result v7

    .line 2246
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 2247
    .line 2248
    .line 2249
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2250
    .line 2251
    .line 2252
    move-result-object v3

    .line 2253
    :goto_28
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 2254
    .line 2255
    .line 2256
    move-result v6

    .line 2257
    if-eqz v6, :cond_54

    .line 2258
    .line 2259
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2260
    .line 2261
    .line 2262
    move-result-object v6

    .line 2263
    check-cast v6, La/xj40;

    .line 2264
    .line 2265
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    .line 2266
    .line 2267
    .line 2268
    move-result v7

    .line 2269
    const v8, 0x7f130f92

    .line 2270
    .line 2271
    .line 2272
    if-eqz v7, :cond_4d

    .line 2273
    .line 2274
    const/4 v14, 0x1

    .line 2275
    if-ne v7, v14, :cond_4c

    .line 2276
    .line 2277
    invoke-static {v6}, La/ydx;->d0(La/xj40;)La/g7m;

    .line 2278
    .line 2279
    .line 2280
    move-result-object v30

    .line 2281
    new-instance v7, La/q7m;

    .line 2282
    .line 2283
    const/4 v11, 0x0

    .line 2284
    new-array v13, v11, [Ljava/lang/Object;

    .line 2285
    .line 2286
    invoke-static {v13, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2287
    .line 2288
    .line 2289
    move-result-object v13

    .line 2290
    invoke-virtual {v4, v8, v13}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2291
    .line 2292
    .line 2293
    move-result-object v8

    .line 2294
    invoke-direct {v7, v8}, La/q7m;-><init>(Ljava/lang/String;)V

    .line 2295
    .line 2296
    .line 2297
    iget-object v6, v6, La/xj40;->c:La/fl40;

    .line 2298
    .line 2299
    iget-object v6, v6, La/fl40;->a:Ljava/util/List;

    .line 2300
    .line 2301
    new-instance v8, Ljava/util/ArrayList;

    .line 2302
    .line 2303
    const/16 v11, 0xa

    .line 2304
    .line 2305
    invoke-static {v6, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2306
    .line 2307
    .line 2308
    move-result v13

    .line 2309
    invoke-direct {v8, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 2310
    .line 2311
    .line 2312
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2313
    .line 2314
    .line 2315
    move-result-object v11

    .line 2316
    :goto_29
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 2317
    .line 2318
    .line 2319
    move-result v13

    .line 2320
    if-eqz v13, :cond_47

    .line 2321
    .line 2322
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2323
    .line 2324
    .line 2325
    move-result-object v13

    .line 2326
    check-cast v13, La/xi40;

    .line 2327
    .line 2328
    invoke-static {v13}, La/ydx;->Z(La/xi40;)La/l8m;

    .line 2329
    .line 2330
    .line 2331
    move-result-object v13

    .line 2332
    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2333
    .line 2334
    .line 2335
    goto :goto_29

    .line 2336
    :cond_47
    invoke-static {v8}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 2337
    .line 2338
    .line 2339
    move-result-object v32

    .line 2340
    new-instance v8, Ljava/util/ArrayList;

    .line 2341
    .line 2342
    const/4 v11, 0x6

    .line 2343
    invoke-direct {v8, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 2344
    .line 2345
    .line 2346
    const/4 v13, 0x0

    .line 2347
    :goto_2a
    if-ge v13, v11, :cond_4b

    .line 2348
    .line 2349
    new-instance v11, Ljava/util/ArrayList;

    .line 2350
    .line 2351
    const/16 v15, 0xa

    .line 2352
    .line 2353
    invoke-static {v6, v15}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2354
    .line 2355
    .line 2356
    move-result v14

    .line 2357
    invoke-direct {v11, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 2358
    .line 2359
    .line 2360
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2361
    .line 2362
    .line 2363
    move-result-object v14

    .line 2364
    :goto_2b
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 2365
    .line 2366
    .line 2367
    move-result v15

    .line 2368
    if-eqz v15, :cond_4a

    .line 2369
    .line 2370
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2371
    .line 2372
    .line 2373
    move-result-object v15

    .line 2374
    check-cast v15, La/xi40;

    .line 2375
    .line 2376
    iget-object v15, v15, La/xi40;->n:Ljava/util/List;

    .line 2377
    .line 2378
    invoke-static {v13, v15}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 2379
    .line 2380
    .line 2381
    move-result-object v15

    .line 2382
    check-cast v15, La/wi40;

    .line 2383
    .line 2384
    move-object/from16 v16, v3

    .line 2385
    .line 2386
    new-instance v3, La/l9m;

    .line 2387
    .line 2388
    move-object/from16 v29, v6

    .line 2389
    .line 2390
    new-instance v6, La/n0x;

    .line 2391
    .line 2392
    if-eqz v15, :cond_48

    .line 2393
    .line 2394
    iget-object v15, v15, La/wi40;->b:Ljava/lang/String;

    .line 2395
    .line 2396
    goto :goto_2c

    .line 2397
    :cond_48
    move-object/from16 v15, p0

    .line 2398
    .line 2399
    :goto_2c
    if-nez v15, :cond_49

    .line 2400
    .line 2401
    move-object/from16 v15, v23

    .line 2402
    .line 2403
    :cond_49
    invoke-direct {v6, v15}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 2404
    .line 2405
    .line 2406
    sget-object v15, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 2407
    .line 2408
    move-object/from16 v35, v9

    .line 2409
    .line 2410
    move-object/from16 v36, v10

    .line 2411
    .line 2412
    invoke-virtual {v15}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite20-0d7_KjU()J

    .line 2413
    .line 2414
    .line 2415
    move-result-wide v9

    .line 2416
    new-instance v15, La/y3d;

    .line 2417
    .line 2418
    invoke-direct {v15, v9, v10}, La/y3d;-><init>(J)V

    .line 2419
    .line 2420
    .line 2421
    invoke-direct {v3, v6, v15}, La/l9m;-><init>(La/n0x;La/y3d;)V

    .line 2422
    .line 2423
    .line 2424
    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2425
    .line 2426
    .line 2427
    move-object/from16 v3, v16

    .line 2428
    .line 2429
    move-object/from16 v6, v29

    .line 2430
    .line 2431
    move-object/from16 v9, v35

    .line 2432
    .line 2433
    move-object/from16 v10, v36

    .line 2434
    .line 2435
    goto :goto_2b

    .line 2436
    :cond_4a
    move-object/from16 v16, v3

    .line 2437
    .line 2438
    move-object/from16 v29, v6

    .line 2439
    .line 2440
    move-object/from16 v35, v9

    .line 2441
    .line 2442
    move-object/from16 v36, v10

    .line 2443
    .line 2444
    invoke-static {v11}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 2445
    .line 2446
    .line 2447
    move-result-object v3

    .line 2448
    new-instance v6, La/f7m;

    .line 2449
    .line 2450
    invoke-direct {v6, v3}, La/f7m;-><init>(La/i4;)V

    .line 2451
    .line 2452
    .line 2453
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2454
    .line 2455
    .line 2456
    add-int/lit8 v13, v13, 0x1

    .line 2457
    .line 2458
    move-object/from16 v3, v16

    .line 2459
    .line 2460
    move-object/from16 v6, v29

    .line 2461
    .line 2462
    const/4 v11, 0x6

    .line 2463
    const/4 v14, 0x1

    .line 2464
    goto :goto_2a

    .line 2465
    :cond_4b
    move-object/from16 v16, v3

    .line 2466
    .line 2467
    move-object/from16 v35, v9

    .line 2468
    .line 2469
    move-object/from16 v36, v10

    .line 2470
    .line 2471
    invoke-static {v8}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 2472
    .line 2473
    .line 2474
    move-result-object v33

    .line 2475
    new-instance v3, La/q7m;

    .line 2476
    .line 2477
    const/4 v6, 0x0

    .line 2478
    new-array v8, v6, [Ljava/lang/Object;

    .line 2479
    .line 2480
    invoke-static {v8, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2481
    .line 2482
    .line 2483
    move-result-object v8

    .line 2484
    const v9, 0x7f130b9a

    .line 2485
    .line 2486
    .line 2487
    invoke-virtual {v4, v9, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2488
    .line 2489
    .line 2490
    move-result-object v6

    .line 2491
    invoke-direct {v3, v6}, La/q7m;-><init>(Ljava/lang/String;)V

    .line 2492
    .line 2493
    .line 2494
    filled-new-array {v3}, [La/q7m;

    .line 2495
    .line 2496
    .line 2497
    move-result-object v3

    .line 2498
    invoke-static {v3}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 2499
    .line 2500
    .line 2501
    move-result-object v34

    .line 2502
    new-instance v29, La/l7m;

    .line 2503
    .line 2504
    move-object/from16 v31, v7

    .line 2505
    .line 2506
    invoke-direct/range {v29 .. v34}, La/l7m;-><init>(La/g7m;La/q7m;La/i4;La/i4;La/i4;)V

    .line 2507
    .line 2508
    .line 2509
    move-object/from16 v3, v29

    .line 2510
    .line 2511
    const/4 v11, 0x0

    .line 2512
    goto/16 :goto_33

    .line 2513
    .line 2514
    :cond_4c
    invoke-static {}, La/t9f;->b()V

    .line 2515
    .line 2516
    .line 2517
    goto/16 :goto_9

    .line 2518
    .line 2519
    :cond_4d
    move-object/from16 v16, v3

    .line 2520
    .line 2521
    move-object/from16 v35, v9

    .line 2522
    .line 2523
    move-object/from16 v36, v10

    .line 2524
    .line 2525
    const v9, 0x7f130b9a

    .line 2526
    .line 2527
    .line 2528
    invoke-static {v6}, La/ydx;->d0(La/xj40;)La/g7m;

    .line 2529
    .line 2530
    .line 2531
    move-result-object v41

    .line 2532
    new-instance v3, La/q7m;

    .line 2533
    .line 2534
    const/4 v11, 0x0

    .line 2535
    new-array v7, v11, [Ljava/lang/Object;

    .line 2536
    .line 2537
    invoke-static {v7, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2538
    .line 2539
    .line 2540
    move-result-object v7

    .line 2541
    invoke-virtual {v4, v8, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2542
    .line 2543
    .line 2544
    move-result-object v7

    .line 2545
    invoke-direct {v3, v7}, La/q7m;-><init>(Ljava/lang/String;)V

    .line 2546
    .line 2547
    .line 2548
    iget-object v6, v6, La/xj40;->c:La/fl40;

    .line 2549
    .line 2550
    iget-object v6, v6, La/fl40;->a:Ljava/util/List;

    .line 2551
    .line 2552
    new-instance v7, Ljava/util/ArrayList;

    .line 2553
    .line 2554
    const/16 v15, 0xa

    .line 2555
    .line 2556
    invoke-static {v6, v15}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2557
    .line 2558
    .line 2559
    move-result v8

    .line 2560
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 2561
    .line 2562
    .line 2563
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2564
    .line 2565
    .line 2566
    move-result-object v8

    .line 2567
    :goto_2d
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 2568
    .line 2569
    .line 2570
    move-result v10

    .line 2571
    if-eqz v10, :cond_4e

    .line 2572
    .line 2573
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2574
    .line 2575
    .line 2576
    move-result-object v10

    .line 2577
    check-cast v10, La/xi40;

    .line 2578
    .line 2579
    invoke-static {v10}, La/ydx;->Z(La/xi40;)La/l8m;

    .line 2580
    .line 2581
    .line 2582
    move-result-object v10

    .line 2583
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2584
    .line 2585
    .line 2586
    goto :goto_2d

    .line 2587
    :cond_4e
    invoke-static {v7}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 2588
    .line 2589
    .line 2590
    move-result-object v43

    .line 2591
    new-instance v7, Ljava/util/ArrayList;

    .line 2592
    .line 2593
    const/16 v15, 0xa

    .line 2594
    .line 2595
    invoke-static {v6, v15}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2596
    .line 2597
    .line 2598
    move-result v8

    .line 2599
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 2600
    .line 2601
    .line 2602
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2603
    .line 2604
    .line 2605
    move-result-object v8

    .line 2606
    :goto_2e
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 2607
    .line 2608
    .line 2609
    move-result v10

    .line 2610
    if-eqz v10, :cond_4f

    .line 2611
    .line 2612
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2613
    .line 2614
    .line 2615
    move-result-object v10

    .line 2616
    check-cast v10, La/xi40;

    .line 2617
    .line 2618
    new-instance v11, La/lbm;

    .line 2619
    .line 2620
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2621
    .line 2622
    .line 2623
    iget v13, v10, La/xi40;->i:I

    .line 2624
    .line 2625
    invoke-static {v13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 2626
    .line 2627
    .line 2628
    move-result-object v13

    .line 2629
    invoke-virtual {v10}, La/xi40;->a()Z

    .line 2630
    .line 2631
    .line 2632
    move-result v10

    .line 2633
    invoke-direct {v11, v13, v10}, La/lbm;-><init>(Ljava/lang/String;Z)V

    .line 2634
    .line 2635
    .line 2636
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2637
    .line 2638
    .line 2639
    goto :goto_2e

    .line 2640
    :cond_4f
    invoke-static {v7}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 2641
    .line 2642
    .line 2643
    move-result-object v7

    .line 2644
    new-instance v8, La/f7m;

    .line 2645
    .line 2646
    invoke-direct {v8, v7}, La/f7m;-><init>(La/i4;)V

    .line 2647
    .line 2648
    .line 2649
    new-instance v7, Ljava/util/ArrayList;

    .line 2650
    .line 2651
    const/16 v15, 0xa

    .line 2652
    .line 2653
    invoke-static {v6, v15}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2654
    .line 2655
    .line 2656
    move-result v10

    .line 2657
    invoke-direct {v7, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 2658
    .line 2659
    .line 2660
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2661
    .line 2662
    .line 2663
    move-result-object v10

    .line 2664
    :goto_2f
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 2665
    .line 2666
    .line 2667
    move-result v11

    .line 2668
    if-eqz v11, :cond_50

    .line 2669
    .line 2670
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2671
    .line 2672
    .line 2673
    move-result-object v11

    .line 2674
    check-cast v11, La/xi40;

    .line 2675
    .line 2676
    new-instance v13, La/lbm;

    .line 2677
    .line 2678
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2679
    .line 2680
    .line 2681
    iget v14, v11, La/xi40;->j:F

    .line 2682
    .line 2683
    float-to-long v14, v14

    .line 2684
    invoke-static {v14, v15}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 2685
    .line 2686
    .line 2687
    move-result-object v14

    .line 2688
    invoke-virtual {v11}, La/xi40;->a()Z

    .line 2689
    .line 2690
    .line 2691
    move-result v11

    .line 2692
    invoke-direct {v13, v14, v11}, La/lbm;-><init>(Ljava/lang/String;Z)V

    .line 2693
    .line 2694
    .line 2695
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2696
    .line 2697
    .line 2698
    goto :goto_2f

    .line 2699
    :cond_50
    invoke-static {v7}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 2700
    .line 2701
    .line 2702
    move-result-object v7

    .line 2703
    new-instance v10, La/f7m;

    .line 2704
    .line 2705
    invoke-direct {v10, v7}, La/f7m;-><init>(La/i4;)V

    .line 2706
    .line 2707
    .line 2708
    new-instance v7, Ljava/util/ArrayList;

    .line 2709
    .line 2710
    const/16 v15, 0xa

    .line 2711
    .line 2712
    invoke-static {v6, v15}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2713
    .line 2714
    .line 2715
    move-result v11

    .line 2716
    invoke-direct {v7, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 2717
    .line 2718
    .line 2719
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2720
    .line 2721
    .line 2722
    move-result-object v11

    .line 2723
    :goto_30
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 2724
    .line 2725
    .line 2726
    move-result v13

    .line 2727
    if-eqz v13, :cond_51

    .line 2728
    .line 2729
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2730
    .line 2731
    .line 2732
    move-result-object v13

    .line 2733
    check-cast v13, La/xi40;

    .line 2734
    .line 2735
    new-instance v14, La/lbm;

    .line 2736
    .line 2737
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2738
    .line 2739
    .line 2740
    iget v15, v13, La/xi40;->k:I

    .line 2741
    .line 2742
    invoke-static {v15}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 2743
    .line 2744
    .line 2745
    move-result-object v15

    .line 2746
    invoke-virtual {v13}, La/xi40;->a()Z

    .line 2747
    .line 2748
    .line 2749
    move-result v13

    .line 2750
    invoke-direct {v14, v15, v13}, La/lbm;-><init>(Ljava/lang/String;Z)V

    .line 2751
    .line 2752
    .line 2753
    invoke-virtual {v7, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2754
    .line 2755
    .line 2756
    goto :goto_30

    .line 2757
    :cond_51
    invoke-static {v7}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 2758
    .line 2759
    .line 2760
    move-result-object v7

    .line 2761
    new-instance v11, La/f7m;

    .line 2762
    .line 2763
    invoke-direct {v11, v7}, La/f7m;-><init>(La/i4;)V

    .line 2764
    .line 2765
    .line 2766
    new-instance v7, Ljava/util/ArrayList;

    .line 2767
    .line 2768
    const/16 v15, 0xa

    .line 2769
    .line 2770
    invoke-static {v6, v15}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2771
    .line 2772
    .line 2773
    move-result v13

    .line 2774
    invoke-direct {v7, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 2775
    .line 2776
    .line 2777
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2778
    .line 2779
    .line 2780
    move-result-object v13

    .line 2781
    :goto_31
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 2782
    .line 2783
    .line 2784
    move-result v14

    .line 2785
    if-eqz v14, :cond_52

    .line 2786
    .line 2787
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2788
    .line 2789
    .line 2790
    move-result-object v14

    .line 2791
    check-cast v14, La/xi40;

    .line 2792
    .line 2793
    new-instance v15, La/lbm;

    .line 2794
    .line 2795
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2796
    .line 2797
    .line 2798
    iget v9, v14, La/xi40;->l:I

    .line 2799
    .line 2800
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 2801
    .line 2802
    .line 2803
    move-result-object v9

    .line 2804
    invoke-virtual {v14}, La/xi40;->a()Z

    .line 2805
    .line 2806
    .line 2807
    move-result v14

    .line 2808
    invoke-direct {v15, v9, v14}, La/lbm;-><init>(Ljava/lang/String;Z)V

    .line 2809
    .line 2810
    .line 2811
    invoke-virtual {v7, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2812
    .line 2813
    .line 2814
    const v9, 0x7f130b9a

    .line 2815
    .line 2816
    .line 2817
    goto :goto_31

    .line 2818
    :cond_52
    invoke-static {v7}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 2819
    .line 2820
    .line 2821
    move-result-object v7

    .line 2822
    new-instance v9, La/f7m;

    .line 2823
    .line 2824
    invoke-direct {v9, v7}, La/f7m;-><init>(La/i4;)V

    .line 2825
    .line 2826
    .line 2827
    new-instance v7, Ljava/util/ArrayList;

    .line 2828
    .line 2829
    const/16 v15, 0xa

    .line 2830
    .line 2831
    invoke-static {v6, v15}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2832
    .line 2833
    .line 2834
    move-result v13

    .line 2835
    invoke-direct {v7, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 2836
    .line 2837
    .line 2838
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2839
    .line 2840
    .line 2841
    move-result-object v6

    .line 2842
    :goto_32
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 2843
    .line 2844
    .line 2845
    move-result v13

    .line 2846
    if-eqz v13, :cond_53

    .line 2847
    .line 2848
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2849
    .line 2850
    .line 2851
    move-result-object v13

    .line 2852
    check-cast v13, La/xi40;

    .line 2853
    .line 2854
    new-instance v14, La/lbm;

    .line 2855
    .line 2856
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2857
    .line 2858
    .line 2859
    iget v15, v13, La/xi40;->m:I

    .line 2860
    .line 2861
    invoke-static {v15}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 2862
    .line 2863
    .line 2864
    move-result-object v15

    .line 2865
    invoke-virtual {v13}, La/xi40;->a()Z

    .line 2866
    .line 2867
    .line 2868
    move-result v13

    .line 2869
    invoke-direct {v14, v15, v13}, La/lbm;-><init>(Ljava/lang/String;Z)V

    .line 2870
    .line 2871
    .line 2872
    invoke-virtual {v7, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2873
    .line 2874
    .line 2875
    goto :goto_32

    .line 2876
    :cond_53
    invoke-static {v7}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 2877
    .line 2878
    .line 2879
    move-result-object v6

    .line 2880
    new-instance v7, La/f7m;

    .line 2881
    .line 2882
    invoke-direct {v7, v6}, La/f7m;-><init>(La/i4;)V

    .line 2883
    .line 2884
    .line 2885
    filled-new-array {v8, v10, v11, v9, v7}, [La/f7m;

    .line 2886
    .line 2887
    .line 2888
    move-result-object v6

    .line 2889
    invoke-static {v6}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 2890
    .line 2891
    .line 2892
    move-result-object v44

    .line 2893
    new-instance v6, La/q7m;

    .line 2894
    .line 2895
    const/4 v11, 0x0

    .line 2896
    new-array v7, v11, [Ljava/lang/Object;

    .line 2897
    .line 2898
    invoke-static {v7, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2899
    .line 2900
    .line 2901
    move-result-object v7

    .line 2902
    const v8, 0x7f130d38

    .line 2903
    .line 2904
    .line 2905
    invoke-virtual {v4, v8, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2906
    .line 2907
    .line 2908
    move-result-object v7

    .line 2909
    invoke-direct {v6, v7}, La/q7m;-><init>(Ljava/lang/String;)V

    .line 2910
    .line 2911
    .line 2912
    new-instance v7, La/q7m;

    .line 2913
    .line 2914
    new-array v8, v11, [Ljava/lang/Object;

    .line 2915
    .line 2916
    invoke-static {v8, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2917
    .line 2918
    .line 2919
    move-result-object v8

    .line 2920
    const v9, 0x7f13098c

    .line 2921
    .line 2922
    .line 2923
    invoke-virtual {v4, v9, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2924
    .line 2925
    .line 2926
    move-result-object v8

    .line 2927
    invoke-direct {v7, v8}, La/q7m;-><init>(Ljava/lang/String;)V

    .line 2928
    .line 2929
    .line 2930
    new-instance v8, La/q7m;

    .line 2931
    .line 2932
    new-array v9, v11, [Ljava/lang/Object;

    .line 2933
    .line 2934
    invoke-static {v9, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2935
    .line 2936
    .line 2937
    move-result-object v9

    .line 2938
    const v10, 0x7f130d37

    .line 2939
    .line 2940
    .line 2941
    invoke-virtual {v4, v10, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2942
    .line 2943
    .line 2944
    move-result-object v9

    .line 2945
    invoke-direct {v8, v9}, La/q7m;-><init>(Ljava/lang/String;)V

    .line 2946
    .line 2947
    .line 2948
    new-instance v9, La/q7m;

    .line 2949
    .line 2950
    new-array v10, v11, [Ljava/lang/Object;

    .line 2951
    .line 2952
    invoke-static {v10, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2953
    .line 2954
    .line 2955
    move-result-object v10

    .line 2956
    const v13, 0x7f130d35

    .line 2957
    .line 2958
    .line 2959
    invoke-virtual {v4, v13, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2960
    .line 2961
    .line 2962
    move-result-object v10

    .line 2963
    invoke-direct {v9, v10}, La/q7m;-><init>(Ljava/lang/String;)V

    .line 2964
    .line 2965
    .line 2966
    new-instance v10, La/q7m;

    .line 2967
    .line 2968
    new-array v13, v11, [Ljava/lang/Object;

    .line 2969
    .line 2970
    invoke-static {v13, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2971
    .line 2972
    .line 2973
    move-result-object v13

    .line 2974
    const v14, 0x7f130d34

    .line 2975
    .line 2976
    .line 2977
    invoke-virtual {v4, v14, v13}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2978
    .line 2979
    .line 2980
    move-result-object v13

    .line 2981
    invoke-direct {v10, v13}, La/q7m;-><init>(Ljava/lang/String;)V

    .line 2982
    .line 2983
    .line 2984
    filled-new-array {v6, v7, v8, v9, v10}, [La/q7m;

    .line 2985
    .line 2986
    .line 2987
    move-result-object v6

    .line 2988
    invoke-static {v6}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 2989
    .line 2990
    .line 2991
    move-result-object v45

    .line 2992
    new-instance v40, La/l7m;

    .line 2993
    .line 2994
    move-object/from16 v42, v3

    .line 2995
    .line 2996
    invoke-direct/range {v40 .. v45}, La/l7m;-><init>(La/g7m;La/q7m;La/i4;La/i4;La/i4;)V

    .line 2997
    .line 2998
    .line 2999
    move-object/from16 v3, v40

    .line 3000
    .line 3001
    :goto_33
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3002
    .line 3003
    .line 3004
    move-object/from16 v3, v16

    .line 3005
    .line 3006
    move-object/from16 v9, v35

    .line 3007
    .line 3008
    move-object/from16 v10, v36

    .line 3009
    .line 3010
    goto/16 :goto_28

    .line 3011
    .line 3012
    :cond_54
    move-object/from16 v35, v9

    .line 3013
    .line 3014
    move-object/from16 v36, v10

    .line 3015
    .line 3016
    invoke-static {v5}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 3017
    .line 3018
    .line 3019
    move-result-object v3

    .line 3020
    new-instance v4, La/wj40;

    .line 3021
    .line 3022
    invoke-direct {v4, v12, v3}, La/wj40;-><init>(La/vj40;La/i4;)V

    .line 3023
    .line 3024
    .line 3025
    invoke-virtual {v1, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3026
    .line 3027
    .line 3028
    :goto_34
    move-object/from16 v11, p0

    .line 3029
    .line 3030
    move-object/from16 v30, v0

    .line 3031
    .line 3032
    move-object v3, v1

    .line 3033
    move-object/from16 v27, v2

    .line 3034
    .line 3035
    move-object/from16 v1, v17

    .line 3036
    .line 3037
    move-object/from16 v9, v28

    .line 3038
    .line 3039
    move-object/from16 v8, v35

    .line 3040
    .line 3041
    move-object/from16 v5, v37

    .line 3042
    .line 3043
    move-object/from16 v6, v38

    .line 3044
    .line 3045
    goto/16 :goto_14

    .line 3046
    .line 3047
    :pswitch_7
    move-object/from16 v24, v0

    .line 3048
    .line 3049
    move-object/from16 v28, v1

    .line 3050
    .line 3051
    move-object v0, v2

    .line 3052
    move-object/from16 v17, v3

    .line 3053
    .line 3054
    move-object/from16 v37, v5

    .line 3055
    .line 3056
    move-object v1, v6

    .line 3057
    move-object/from16 v38, v7

    .line 3058
    .line 3059
    move-object/from16 v35, v8

    .line 3060
    .line 3061
    move-object/from16 v25, v9

    .line 3062
    .line 3063
    move-object/from16 v36, v12

    .line 3064
    .line 3065
    move-object/from16 v26, v13

    .line 3066
    .line 3067
    move-object/from16 v39, v14

    .line 3068
    .line 3069
    move-object v2, v15

    .line 3070
    sget-object v4, La/cl40;->b:La/cl40;

    .line 3071
    .line 3072
    move-object/from16 v9, v28

    .line 3073
    .line 3074
    iget-object v7, v9, La/mi40;->b:La/hj40;

    .line 3075
    .line 3076
    move-object v3, v1

    .line 3077
    move-object/from16 v1, v17

    .line 3078
    .line 3079
    move-object/from16 v6, v38

    .line 3080
    .line 3081
    invoke-static/range {v3 .. v8}, La/tfx;->u(La/lc00;La/cl40;La/m9s;La/el40;La/hj40;La/ctf0;)V

    .line 3082
    .line 3083
    .line 3084
    :goto_35
    const/4 v15, 0x6

    .line 3085
    move-object/from16 v11, p0

    .line 3086
    .line 3087
    move-object/from16 v30, v0

    .line 3088
    .line 3089
    move-object/from16 v27, v2

    .line 3090
    .line 3091
    goto/16 :goto_41

    .line 3092
    .line 3093
    :pswitch_8
    move-object/from16 v24, v0

    .line 3094
    .line 3095
    move-object v0, v2

    .line 3096
    move-object/from16 v25, v9

    .line 3097
    .line 3098
    move-object/from16 v36, v12

    .line 3099
    .line 3100
    move-object/from16 v26, v13

    .line 3101
    .line 3102
    move-object/from16 v39, v14

    .line 3103
    .line 3104
    move-object v2, v15

    .line 3105
    const/4 v11, 0x0

    .line 3106
    move-object v9, v1

    .line 3107
    move-object v1, v3

    .line 3108
    move-object v3, v6

    .line 3109
    move-object v6, v7

    .line 3110
    invoke-static {v6}, La/vdx;->V(La/el40;)Z

    .line 3111
    .line 3112
    .line 3113
    move-result v4

    .line 3114
    if-nez v4, :cond_57

    .line 3115
    .line 3116
    iget-object v4, v0, La/fl40;->b:La/cl40;

    .line 3117
    .line 3118
    sget-object v7, La/cl40;->d:La/cl40;

    .line 3119
    .line 3120
    if-eq v4, v7, :cond_57

    .line 3121
    .line 3122
    iget-object v4, v0, La/fl40;->a:Ljava/util/List;

    .line 3123
    .line 3124
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 3125
    .line 3126
    .line 3127
    move-result v4

    .line 3128
    const/4 v10, 0x5

    .line 3129
    if-eq v4, v10, :cond_55

    .line 3130
    .line 3131
    goto :goto_36

    .line 3132
    :cond_55
    iget-object v4, v2, La/fl40;->b:La/cl40;

    .line 3133
    .line 3134
    if-eq v4, v7, :cond_57

    .line 3135
    .line 3136
    iget-object v4, v2, La/fl40;->a:Ljava/util/List;

    .line 3137
    .line 3138
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 3139
    .line 3140
    .line 3141
    move-result v4

    .line 3142
    if-eq v4, v10, :cond_56

    .line 3143
    .line 3144
    goto :goto_36

    .line 3145
    :cond_56
    move v4, v11

    .line 3146
    goto :goto_37

    .line 3147
    :cond_57
    :goto_36
    const/4 v4, 0x1

    .line 3148
    :goto_37
    iget-wide v12, v6, La/el40;->e:J

    .line 3149
    .line 3150
    if-eqz v4, :cond_58

    .line 3151
    .line 3152
    goto :goto_35

    .line 3153
    :cond_58
    const-wide/16 v14, 0x0

    .line 3154
    .line 3155
    cmp-long v4, v12, v14

    .line 3156
    .line 3157
    if-eqz v4, :cond_59

    .line 3158
    .line 3159
    const/4 v4, 0x1

    .line 3160
    goto :goto_38

    .line 3161
    :cond_59
    move v4, v11

    .line 3162
    :goto_38
    if-eqz v4, :cond_5e

    .line 3163
    .line 3164
    new-instance v7, La/ji40;

    .line 3165
    .line 3166
    new-instance v10, La/m0x;

    .line 3167
    .line 3168
    const v14, 0x7f0803ce

    .line 3169
    .line 3170
    .line 3171
    const/4 v15, 0x6

    .line 3172
    move-object/from16 v11, p0

    .line 3173
    .line 3174
    invoke-direct {v10, v14, v11, v15}, La/m0x;-><init>(ILa/bzw;I)V

    .line 3175
    .line 3176
    .line 3177
    invoke-static {v0}, La/vdx;->D(La/fl40;)Z

    .line 3178
    .line 3179
    .line 3180
    move-result v11

    .line 3181
    if-eqz v11, :cond_5a

    .line 3182
    .line 3183
    invoke-static {v2}, La/vdx;->D(La/fl40;)Z

    .line 3184
    .line 3185
    .line 3186
    move-result v11

    .line 3187
    if-eqz v11, :cond_5a

    .line 3188
    .line 3189
    invoke-static {v0}, La/kcx;->B(La/fl40;)Ljava/util/ArrayList;

    .line 3190
    .line 3191
    .line 3192
    move-result-object v11

    .line 3193
    invoke-static {v2}, La/kcx;->B(La/fl40;)Ljava/util/ArrayList;

    .line 3194
    .line 3195
    .line 3196
    move-result-object v14

    .line 3197
    invoke-static {v11, v14}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 3198
    .line 3199
    .line 3200
    move-result-object v11

    .line 3201
    goto :goto_39

    .line 3202
    :cond_5a
    sget-object v11, La/iun;->a:La/iun;

    .line 3203
    .line 3204
    :goto_39
    invoke-static {v11}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 3205
    .line 3206
    .line 3207
    move-result-object v11

    .line 3208
    sget-object v14, La/gi40;->f:La/c0o;

    .line 3209
    .line 3210
    new-instance v15, Ljava/util/ArrayList;

    .line 3211
    .line 3212
    move-object/from16 v30, v0

    .line 3213
    .line 3214
    const/16 v0, 0xa

    .line 3215
    .line 3216
    invoke-static {v14, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 3217
    .line 3218
    .line 3219
    move-result v0

    .line 3220
    invoke-direct {v15, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 3221
    .line 3222
    .line 3223
    invoke-virtual {v14}, La/b3;->iterator()Ljava/util/Iterator;

    .line 3224
    .line 3225
    .line 3226
    move-result-object v0

    .line 3227
    :goto_3a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 3228
    .line 3229
    .line 3230
    move-result v14

    .line 3231
    if-eqz v14, :cond_5d

    .line 3232
    .line 3233
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3234
    .line 3235
    .line 3236
    move-result-object v14

    .line 3237
    check-cast v14, La/gi40;

    .line 3238
    .line 3239
    move-object/from16 v16, v0

    .line 3240
    .line 3241
    iget-byte v0, v14, La/gi40;->b:B

    .line 3242
    .line 3243
    shr-long v17, v12, v0

    .line 3244
    .line 3245
    const-wide/16 v27, 0x1

    .line 3246
    .line 3247
    and-long v17, v17, v27

    .line 3248
    .line 3249
    cmp-long v0, v17, v27

    .line 3250
    .line 3251
    if-nez v0, :cond_5b

    .line 3252
    .line 3253
    const/16 v17, 0x1

    .line 3254
    .line 3255
    goto :goto_3b

    .line 3256
    :cond_5b
    const/16 v17, 0x0

    .line 3257
    .line 3258
    :goto_3b
    new-instance v0, La/hi40;

    .line 3259
    .line 3260
    move-object/from16 v27, v2

    .line 3261
    .line 3262
    if-eqz v17, :cond_5c

    .line 3263
    .line 3264
    iget-object v2, v14, La/gi40;->a:La/fi40;

    .line 3265
    .line 3266
    invoke-static {v2}, La/kcx;->Q(La/fi40;)J

    .line 3267
    .line 3268
    .line 3269
    move-result-wide v17

    .line 3270
    :goto_3c
    move-wide/from16 v28, v12

    .line 3271
    .line 3272
    move-wide/from16 v12, v17

    .line 3273
    .line 3274
    goto :goto_3d

    .line 3275
    :cond_5c
    sget-object v2, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 3276
    .line 3277
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite40-0d7_KjU()J

    .line 3278
    .line 3279
    .line 3280
    move-result-wide v17

    .line 3281
    goto :goto_3c

    .line 3282
    :goto_3d
    invoke-direct {v0, v14, v12, v13}, La/hi40;-><init>(La/gi40;J)V

    .line 3283
    .line 3284
    .line 3285
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3286
    .line 3287
    .line 3288
    move-object/from16 v0, v16

    .line 3289
    .line 3290
    move-object/from16 v2, v27

    .line 3291
    .line 3292
    move-wide/from16 v12, v28

    .line 3293
    .line 3294
    goto :goto_3a

    .line 3295
    :cond_5d
    move-object/from16 v27, v2

    .line 3296
    .line 3297
    invoke-static {v15}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 3298
    .line 3299
    .line 3300
    move-result-object v0

    .line 3301
    invoke-direct {v7, v10, v11, v0}, La/ji40;-><init>(La/m0x;La/i4;La/i4;)V

    .line 3302
    .line 3303
    .line 3304
    const/4 v11, 0x0

    .line 3305
    const/4 v15, 0x6

    .line 3306
    goto :goto_3e

    .line 3307
    :cond_5e
    move-object/from16 v30, v0

    .line 3308
    .line 3309
    move-object/from16 v27, v2

    .line 3310
    .line 3311
    new-instance v7, La/ki40;

    .line 3312
    .line 3313
    new-instance v0, La/m0x;

    .line 3314
    .line 3315
    const v2, 0x7f0803cf

    .line 3316
    .line 3317
    .line 3318
    const/4 v11, 0x0

    .line 3319
    const/4 v15, 0x6

    .line 3320
    invoke-direct {v0, v2, v11, v15}, La/m0x;-><init>(ILa/bzw;I)V

    .line 3321
    .line 3322
    .line 3323
    invoke-direct {v7, v0}, La/ki40;-><init>(La/m0x;)V

    .line 3324
    .line 3325
    .line 3326
    :goto_3e
    iget-object v0, v6, La/el40;->g:Ljava/lang/Long;

    .line 3327
    .line 3328
    if-eqz v0, :cond_5f

    .line 3329
    .line 3330
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 3331
    .line 3332
    .line 3333
    move-result-wide v12

    .line 3334
    const v0, 0x7f0808c5

    .line 3335
    .line 3336
    .line 3337
    invoke-static {v0, v12, v13, v4}, La/kcx;->z(IJZ)La/ci40;

    .line 3338
    .line 3339
    .line 3340
    move-result-object v0

    .line 3341
    goto :goto_3f

    .line 3342
    :cond_5f
    move-object v0, v11

    .line 3343
    :goto_3f
    iget-object v2, v6, La/el40;->f:Ljava/lang/Long;

    .line 3344
    .line 3345
    if-eqz v2, :cond_60

    .line 3346
    .line 3347
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 3348
    .line 3349
    .line 3350
    move-result-wide v12

    .line 3351
    const v2, 0x7f0808cc

    .line 3352
    .line 3353
    .line 3354
    invoke-static {v2, v12, v13, v4}, La/kcx;->z(IJZ)La/ci40;

    .line 3355
    .line 3356
    .line 3357
    move-result-object v2

    .line 3358
    goto :goto_40

    .line 3359
    :cond_60
    move-object v2, v11

    .line 3360
    :goto_40
    new-instance v4, La/ii40;

    .line 3361
    .line 3362
    invoke-direct {v4, v7, v0, v2}, La/ii40;-><init>(La/li40;La/ci40;La/ci40;)V

    .line 3363
    .line 3364
    .line 3365
    invoke-virtual {v3, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3366
    .line 3367
    .line 3368
    goto :goto_41

    .line 3369
    :pswitch_9
    move-object/from16 v11, p0

    .line 3370
    .line 3371
    move-object/from16 v24, v0

    .line 3372
    .line 3373
    move-object/from16 v30, v2

    .line 3374
    .line 3375
    move-object/from16 v25, v9

    .line 3376
    .line 3377
    move-object/from16 v36, v12

    .line 3378
    .line 3379
    move-object/from16 v26, v13

    .line 3380
    .line 3381
    move-object/from16 v39, v14

    .line 3382
    .line 3383
    move-object/from16 v27, v15

    .line 3384
    .line 3385
    const/4 v15, 0x6

    .line 3386
    move-object v9, v1

    .line 3387
    move-object v1, v3

    .line 3388
    move-object v3, v6

    .line 3389
    move-object v6, v7

    .line 3390
    sget-object v4, La/cl40;->c:La/cl40;

    .line 3391
    .line 3392
    iget-object v7, v9, La/mi40;->b:La/hj40;

    .line 3393
    .line 3394
    invoke-static/range {v3 .. v8}, La/tfx;->u(La/lc00;La/cl40;La/m9s;La/el40;La/hj40;La/ctf0;)V

    .line 3395
    .line 3396
    .line 3397
    goto :goto_41

    .line 3398
    :pswitch_a
    move-object/from16 v11, p0

    .line 3399
    .line 3400
    move-object/from16 v24, v0

    .line 3401
    .line 3402
    move-object/from16 v30, v2

    .line 3403
    .line 3404
    move-object/from16 v25, v9

    .line 3405
    .line 3406
    move-object/from16 v36, v12

    .line 3407
    .line 3408
    move-object/from16 v26, v13

    .line 3409
    .line 3410
    move-object/from16 v39, v14

    .line 3411
    .line 3412
    move-object/from16 v27, v15

    .line 3413
    .line 3414
    const/4 v15, 0x6

    .line 3415
    move-object v9, v1

    .line 3416
    move-object v1, v3

    .line 3417
    move-object v3, v6

    .line 3418
    move-object v6, v7

    .line 3419
    invoke-static {v3, v5, v6, v1, v8}, La/tfx;->r(La/lc00;La/m9s;La/el40;La/hj40;La/ctf0;)V

    .line 3420
    .line 3421
    .line 3422
    invoke-static {v3, v5, v6, v1, v8}, La/tfx;->s(La/lc00;La/m9s;La/el40;La/hj40;La/ctf0;)V

    .line 3423
    .line 3424
    .line 3425
    :goto_41
    move-object v7, v6

    .line 3426
    move-object/from16 p0, v11

    .line 3427
    .line 3428
    move-object/from16 v0, v24

    .line 3429
    .line 3430
    move-object/from16 v13, v26

    .line 3431
    .line 3432
    move-object/from16 v15, v27

    .line 3433
    .line 3434
    move-object/from16 v2, v30

    .line 3435
    .line 3436
    move-object/from16 v12, v36

    .line 3437
    .line 3438
    move-object/from16 v14, v39

    .line 3439
    .line 3440
    move-object v6, v3

    .line 3441
    move-object v3, v1

    .line 3442
    move-object v1, v9

    .line 3443
    move-object/from16 v9, v25

    .line 3444
    .line 3445
    goto/16 :goto_8

    .line 3446
    .line 3447
    :goto_42
    invoke-static {v3}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 3448
    .line 3449
    .line 3450
    move-result-object v0

    .line 3451
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 3452
    .line 3453
    .line 3454
    move-result-object v2

    .line 3455
    goto :goto_43

    .line 3456
    :cond_61
    sget-object v2, La/lak0;->c:La/lak0;

    .line 3457
    .line 3458
    :goto_43
    return-object v2

    .line 3459
    :pswitch_b
    move-object/from16 v1, p1

    .line 3460
    .line 3461
    check-cast v1, La/fee;

    .line 3462
    .line 3463
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3464
    .line 3465
    .line 3466
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 3467
    .line 3468
    .line 3469
    move-result-object v1

    .line 3470
    move-object v2, v1

    .line 3471
    check-cast v2, La/jlr;

    .line 3472
    .line 3473
    iget-object v1, v0, La/v6o;->g:La/n0o0;

    .line 3474
    .line 3475
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3476
    .line 3477
    .line 3478
    move-result-object v1

    .line 3479
    check-cast v1, La/fee;

    .line 3480
    .line 3481
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 3482
    .line 3483
    .line 3484
    move-result-object v1

    .line 3485
    check-cast v1, Ljava/lang/Boolean;

    .line 3486
    .line 3487
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 3488
    .line 3489
    .line 3490
    move-result v3

    .line 3491
    iget-object v1, v0, La/v6o;->D:Ljava/lang/Object;

    .line 3492
    .line 3493
    check-cast v1, La/dl40;

    .line 3494
    .line 3495
    iget-object v4, v1, La/dl40;->m:La/sff0;

    .line 3496
    .line 3497
    iget-boolean v4, v4, La/sff0;->J:Z

    .line 3498
    .line 3499
    iget-object v5, v0, La/v6o;->n:La/n0o0;

    .line 3500
    .line 3501
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3502
    .line 3503
    .line 3504
    move-result-object v5

    .line 3505
    check-cast v5, La/fee;

    .line 3506
    .line 3507
    invoke-virtual {v5}, La/fee;->c()Ljava/lang/Object;

    .line 3508
    .line 3509
    .line 3510
    move-result-object v5

    .line 3511
    check-cast v5, Ljava/lang/Boolean;

    .line 3512
    .line 3513
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 3514
    .line 3515
    .line 3516
    move-result v5

    .line 3517
    iget-object v6, v0, La/v6o;->o:La/n0o0;

    .line 3518
    .line 3519
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3520
    .line 3521
    .line 3522
    move-result-object v6

    .line 3523
    check-cast v6, La/fee;

    .line 3524
    .line 3525
    invoke-virtual {v6}, La/fee;->c()Ljava/lang/Object;

    .line 3526
    .line 3527
    .line 3528
    move-result-object v6

    .line 3529
    check-cast v6, Ljava/lang/Boolean;

    .line 3530
    .line 3531
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 3532
    .line 3533
    .line 3534
    move-result v6

    .line 3535
    iget-object v1, v1, La/dl40;->a:Lorg/xplatform/cyber/game/mlbb/api/MlbbGameScreenParams;

    .line 3536
    .line 3537
    iget-boolean v7, v1, Lorg/xplatform/cyber/game/mlbb/api/MlbbGameScreenParams;->g:Z

    .line 3538
    .line 3539
    iget-object v0, v0, La/v6o;->l:La/n0o0;

    .line 3540
    .line 3541
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3542
    .line 3543
    .line 3544
    move-result-object v0

    .line 3545
    check-cast v0, La/fee;

    .line 3546
    .line 3547
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 3548
    .line 3549
    .line 3550
    move-result-object v0

    .line 3551
    move-object v8, v0

    .line 3552
    check-cast v8, La/yws;

    .line 3553
    .line 3554
    invoke-static/range {v2 .. v8}, La/ulb;->j0(La/jlr;ZZZZZLa/yws;)La/its;

    .line 3555
    .line 3556
    .line 3557
    move-result-object v0

    .line 3558
    return-object v0

    .line 3559
    :pswitch_c
    const/4 v11, 0x0

    .line 3560
    move-object/from16 v1, p1

    .line 3561
    .line 3562
    check-cast v1, La/fee;

    .line 3563
    .line 3564
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3565
    .line 3566
    .line 3567
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 3568
    .line 3569
    .line 3570
    move-result-object v1

    .line 3571
    check-cast v1, La/jlr;

    .line 3572
    .line 3573
    invoke-static {v1}, La/d5c;->C(La/jlr;)La/m9s;

    .line 3574
    .line 3575
    .line 3576
    move-result-object v12

    .line 3577
    iget-object v15, v0, La/v6o;->b:La/ctf0;

    .line 3578
    .line 3579
    iget-object v1, v0, La/v6o;->D:Ljava/lang/Object;

    .line 3580
    .line 3581
    check-cast v1, La/dl40;

    .line 3582
    .line 3583
    if-eqz v12, :cond_62

    .line 3584
    .line 3585
    invoke-static {v12}, La/xww;->Z(La/m9s;)La/la30;

    .line 3586
    .line 3587
    .line 3588
    move-result-object v2

    .line 3589
    move-object/from16 v16, v2

    .line 3590
    .line 3591
    goto :goto_44

    .line 3592
    :cond_62
    move-object/from16 v16, v11

    .line 3593
    .line 3594
    :goto_44
    iget-object v2, v0, La/v6o;->g:La/n0o0;

    .line 3595
    .line 3596
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3597
    .line 3598
    .line 3599
    move-result-object v2

    .line 3600
    check-cast v2, La/fee;

    .line 3601
    .line 3602
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 3603
    .line 3604
    .line 3605
    move-result-object v2

    .line 3606
    check-cast v2, Ljava/lang/Boolean;

    .line 3607
    .line 3608
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 3609
    .line 3610
    .line 3611
    move-result v17

    .line 3612
    iget-object v2, v0, La/v6o;->j:La/n0o0;

    .line 3613
    .line 3614
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3615
    .line 3616
    .line 3617
    move-result-object v2

    .line 3618
    check-cast v2, La/fee;

    .line 3619
    .line 3620
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 3621
    .line 3622
    .line 3623
    move-result-object v2

    .line 3624
    move-object/from16 v18, v2

    .line 3625
    .line 3626
    check-cast v18, Ljava/util/List;

    .line 3627
    .line 3628
    iget-boolean v2, v1, La/dl40;->t:Z

    .line 3629
    .line 3630
    iget-object v0, v0, La/v6o;->f:La/n0o0;

    .line 3631
    .line 3632
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3633
    .line 3634
    .line 3635
    move-result-object v0

    .line 3636
    check-cast v0, La/fee;

    .line 3637
    .line 3638
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 3639
    .line 3640
    .line 3641
    move-result-object v0

    .line 3642
    check-cast v0, La/ypl0;

    .line 3643
    .line 3644
    iget-object v0, v0, La/ypl0;->c:La/lel0;

    .line 3645
    .line 3646
    iget-object v0, v0, La/lel0;->a:Ljava/lang/String;

    .line 3647
    .line 3648
    iget-object v1, v1, La/dl40;->a:Lorg/xplatform/cyber/game/mlbb/api/MlbbGameScreenParams;

    .line 3649
    .line 3650
    iget-object v1, v1, Lorg/xplatform/cyber/game/mlbb/api/MlbbGameScreenParams;->h:Ljava/lang/String;

    .line 3651
    .line 3652
    const/4 v13, 0x0

    .line 3653
    const/4 v14, 0x0

    .line 3654
    const/16 v20, 0x1

    .line 3655
    .line 3656
    move-object/from16 v21, v0

    .line 3657
    .line 3658
    move-object/from16 v22, v1

    .line 3659
    .line 3660
    move/from16 v19, v2

    .line 3661
    .line 3662
    invoke-static/range {v12 .. v22}, La/hkb;->P(La/m9s;ZZLa/ctf0;La/la30;ZLjava/util/List;ZZLjava/lang/String;Ljava/lang/String;)La/zqg;

    .line 3663
    .line 3664
    .line 3665
    move-result-object v0

    .line 3666
    return-object v0

    .line 3667
    :pswitch_d
    move-object/from16 v1, p1

    .line 3668
    .line 3669
    check-cast v1, La/fee;

    .line 3670
    .line 3671
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3672
    .line 3673
    .line 3674
    new-instance v1, La/avs;

    .line 3675
    .line 3676
    iget-object v2, v0, La/v6o;->k:La/n0o0;

    .line 3677
    .line 3678
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3679
    .line 3680
    .line 3681
    move-result-object v2

    .line 3682
    check-cast v2, La/fee;

    .line 3683
    .line 3684
    iget-object v2, v2, La/fee;->d:La/pz40;

    .line 3685
    .line 3686
    iget-object v3, v0, La/v6o;->p:La/n0o0;

    .line 3687
    .line 3688
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3689
    .line 3690
    .line 3691
    move-result-object v3

    .line 3692
    check-cast v3, La/fee;

    .line 3693
    .line 3694
    iget-object v3, v3, La/fee;->d:La/pz40;

    .line 3695
    .line 3696
    iget-object v4, v0, La/v6o;->h:La/n0o0;

    .line 3697
    .line 3698
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3699
    .line 3700
    .line 3701
    move-result-object v4

    .line 3702
    check-cast v4, La/fee;

    .line 3703
    .line 3704
    iget-object v4, v4, La/fee;->d:La/pz40;

    .line 3705
    .line 3706
    iget-object v0, v0, La/v6o;->i:La/n0o0;

    .line 3707
    .line 3708
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3709
    .line 3710
    .line 3711
    move-result-object v0

    .line 3712
    check-cast v0, La/fee;

    .line 3713
    .line 3714
    iget-object v0, v0, La/fee;->d:La/pz40;

    .line 3715
    .line 3716
    invoke-direct {v1, v2, v3, v4, v0}, La/avs;-><init>(La/l7m0;La/l7m0;La/l7m0;La/l7m0;)V

    .line 3717
    .line 3718
    .line 3719
    return-object v1

    .line 3720
    nop

    .line 3721
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 3722
    .line 3723
    .line 3724
    .line 3725
    .line 3726
    .line 3727
    .line 3728
    .line 3729
    .line 3730
    .line 3731
    .line 3732
    .line 3733
    .line 3734
    .line 3735
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method
