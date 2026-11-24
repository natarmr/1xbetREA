.class public final synthetic La/o610;
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
    iput-byte p2, p0, La/o610;->a:B

    iput-object p1, p0, La/o610;->b:La/v6o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 56

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/o610;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/o610;->b:La/v6o;

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
    iget-object v1, v0, La/v6o;->v:La/n0o0;

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
    check-cast v2, La/m310;

    .line 34
    .line 35
    iget-object v2, v2, La/m310;->r:La/sff0;

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
    iget-object v0, v0, La/v6o;->e:La/n0o0;

    .line 70
    .line 71
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, La/fee;

    .line 76
    .line 77
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    if-nez v0, :cond_0

    .line 82
    .line 83
    sget-object v4, La/pb10;->o:La/pb10;

    .line 84
    .line 85
    const-wide/16 v14, 0x0

    .line 86
    .line 87
    const/16 v16, 0x3fe

    .line 88
    .line 89
    const/4 v5, 0x0

    .line 90
    const/4 v6, 0x0

    .line 91
    const/4 v7, 0x0

    .line 92
    const/4 v8, 0x0

    .line 93
    const/4 v9, 0x0

    .line 94
    const/4 v10, 0x0

    .line 95
    const/4 v11, 0x0

    .line 96
    const-wide/16 v12, 0x0

    .line 97
    .line 98
    invoke-static/range {v3 .. v16}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    new-instance v2, La/nss;

    .line 103
    .line 104
    invoke-direct {v2, v0}, La/nss;-><init>(La/mdm;)V

    .line 105
    .line 106
    .line 107
    goto/16 :goto_1

    .line 108
    .line 109
    :cond_0
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, La/fee;

    .line 114
    .line 115
    iget-object v0, v0, La/fee;->e:La/zbk;

    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    new-instance v2, La/pss;

    .line 121
    .line 122
    invoke-direct {v2, v0}, La/pss;-><init>(La/l7m0;)V

    .line 123
    .line 124
    .line 125
    goto/16 :goto_1

    .line 126
    .line 127
    :cond_1
    instance-of v5, v4, La/alr;

    .line 128
    .line 129
    const-wide/16 v6, 0x2

    .line 130
    .line 131
    if-eqz v5, :cond_2

    .line 132
    .line 133
    new-instance v2, La/lss;

    .line 134
    .line 135
    sget-object v1, La/pb10;->v:La/pb10;

    .line 136
    .line 137
    invoke-static {v6, v7, v1}, La/ozb;->J(JLa/pb10;)La/pb10;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    sget-object v6, La/ldm;->b:La/ldm;

    .line 142
    .line 143
    const-wide/16 v14, 0x0

    .line 144
    .line 145
    const/16 v16, 0x25a

    .line 146
    .line 147
    const/4 v5, 0x0

    .line 148
    const/4 v7, 0x0

    .line 149
    const/4 v8, 0x0

    .line 150
    const v9, 0x7f130677

    .line 151
    .line 152
    .line 153
    const/4 v10, 0x0

    .line 154
    const v11, 0x7f131690

    .line 155
    .line 156
    .line 157
    const-wide/16 v12, 0x2710

    .line 158
    .line 159
    invoke-static/range {v3 .. v16}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    iget-object v0, v0, La/v6o;->u:La/n0o0;

    .line 164
    .line 165
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    check-cast v0, La/fee;

    .line 170
    .line 171
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    check-cast v0, La/da10;

    .line 176
    .line 177
    iget-short v0, v0, La/da10;->a:S

    .line 178
    .line 179
    int-to-long v3, v0

    .line 180
    invoke-direct {v2, v3, v4, v1}, La/lss;-><init>(JLa/mdm;)V

    .line 181
    .line 182
    .line 183
    goto/16 :goto_1

    .line 184
    .line 185
    :cond_2
    instance-of v0, v4, La/blr;

    .line 186
    .line 187
    if-eqz v0, :cond_3

    .line 188
    .line 189
    new-instance v0, La/pdq;

    .line 190
    .line 191
    move-object v1, v4

    .line 192
    invoke-static {v6, v7}, La/ozb;->K(J)La/pb10;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    sget-object v6, La/ldm;->b:La/ldm;

    .line 197
    .line 198
    const-wide/16 v14, 0x0

    .line 199
    .line 200
    const/16 v16, 0x3fa

    .line 201
    .line 202
    const/4 v5, 0x0

    .line 203
    const/4 v7, 0x0

    .line 204
    const/4 v8, 0x0

    .line 205
    const/4 v9, 0x0

    .line 206
    const/4 v10, 0x0

    .line 207
    const/4 v11, 0x0

    .line 208
    const-wide/16 v12, 0x0

    .line 209
    .line 210
    invoke-static/range {v3 .. v16}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    move-object v4, v1

    .line 215
    check-cast v4, La/blr;

    .line 216
    .line 217
    iget-wide v3, v4, La/blr;->c:J

    .line 218
    .line 219
    const v1, 0x7f13168b

    .line 220
    .line 221
    .line 222
    invoke-direct {v0, v2, v3, v4, v1}, La/pdq;-><init>(La/mdm;JI)V

    .line 223
    .line 224
    .line 225
    new-instance v2, La/mss;

    .line 226
    .line 227
    invoke-direct {v2, v0}, La/mss;-><init>(La/pdq;)V

    .line 228
    .line 229
    .line 230
    goto :goto_1

    .line 231
    :cond_3
    instance-of v0, v4, La/clr;

    .line 232
    .line 233
    if-eqz v0, :cond_4

    .line 234
    .line 235
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    check-cast v0, La/fee;

    .line 240
    .line 241
    iget-object v0, v0, La/fee;->e:La/zbk;

    .line 242
    .line 243
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    new-instance v2, La/pss;

    .line 247
    .line 248
    invoke-direct {v2, v0}, La/pss;-><init>(La/l7m0;)V

    .line 249
    .line 250
    .line 251
    goto :goto_1

    .line 252
    :cond_4
    instance-of v0, v4, La/dlr;

    .line 253
    .line 254
    if-eqz v0, :cond_5

    .line 255
    .line 256
    goto :goto_0

    .line 257
    :cond_5
    instance-of v0, v4, La/ilr;

    .line 258
    .line 259
    if-eqz v0, :cond_6

    .line 260
    .line 261
    :goto_0
    sget-object v4, La/pb10;->o:La/pb10;

    .line 262
    .line 263
    const-wide/16 v14, 0x0

    .line 264
    .line 265
    const/16 v16, 0x3fe

    .line 266
    .line 267
    const/4 v5, 0x0

    .line 268
    const/4 v6, 0x0

    .line 269
    const/4 v7, 0x0

    .line 270
    const/4 v8, 0x0

    .line 271
    const/4 v9, 0x0

    .line 272
    const/4 v10, 0x0

    .line 273
    const/4 v11, 0x0

    .line 274
    const-wide/16 v12, 0x0

    .line 275
    .line 276
    invoke-static/range {v3 .. v16}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    new-instance v2, La/nss;

    .line 281
    .line 282
    invoke-direct {v2, v0}, La/nss;-><init>(La/mdm;)V

    .line 283
    .line 284
    .line 285
    goto :goto_1

    .line 286
    :cond_6
    instance-of v0, v4, La/elr;

    .line 287
    .line 288
    if-eqz v0, :cond_7

    .line 289
    .line 290
    sget-object v0, La/pb10;->v:La/pb10;

    .line 291
    .line 292
    invoke-static {v6, v7, v0}, La/ozb;->J(JLa/pb10;)La/pb10;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    sget-object v6, La/ldm;->b:La/ldm;

    .line 297
    .line 298
    const-wide/16 v14, 0x0

    .line 299
    .line 300
    const/16 v16, 0x35a

    .line 301
    .line 302
    const/4 v5, 0x0

    .line 303
    const/4 v7, 0x0

    .line 304
    const/4 v8, 0x0

    .line 305
    const v9, 0x7f130922

    .line 306
    .line 307
    .line 308
    const/4 v10, 0x0

    .line 309
    const v11, 0x7f130987

    .line 310
    .line 311
    .line 312
    const-wide/16 v12, 0x0

    .line 313
    .line 314
    invoke-static/range {v3 .. v16}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    new-instance v2, La/oss;

    .line 319
    .line 320
    invoke-direct {v2, v0}, La/oss;-><init>(La/mdm;)V

    .line 321
    .line 322
    .line 323
    goto :goto_1

    .line 324
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 325
    .line 326
    .line 327
    const/4 v2, 0x0

    .line 328
    :goto_1
    return-object v2

    .line 329
    :pswitch_1
    move-object/from16 v1, p1

    .line 330
    .line 331
    check-cast v1, La/fee;

    .line 332
    .line 333
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    check-cast v1, La/jlr;

    .line 341
    .line 342
    instance-of v3, v1, La/xkr;

    .line 343
    .line 344
    if-eqz v3, :cond_66

    .line 345
    .line 346
    check-cast v1, La/xkr;

    .line 347
    .line 348
    iget-object v5, v1, La/xkr;->d:La/m9s;

    .line 349
    .line 350
    iget-object v1, v0, La/v6o;->e:La/n0o0;

    .line 351
    .line 352
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v1

    .line 356
    check-cast v1, La/fee;

    .line 357
    .line 358
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    check-cast v1, La/k4h;

    .line 363
    .line 364
    iget-object v3, v0, La/v6o;->r:La/n0o0;

    .line 365
    .line 366
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v3

    .line 370
    check-cast v3, La/fee;

    .line 371
    .line 372
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v3

    .line 376
    move-object v10, v3

    .line 377
    check-cast v10, La/mz00;

    .line 378
    .line 379
    iget-object v3, v0, La/v6o;->s:La/n0o0;

    .line 380
    .line 381
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v3

    .line 385
    check-cast v3, La/fee;

    .line 386
    .line 387
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v3

    .line 391
    move-object v11, v3

    .line 392
    check-cast v11, La/g310;

    .line 393
    .line 394
    iget-object v6, v0, La/v6o;->b:La/ctf0;

    .line 395
    .line 396
    iget-object v3, v0, La/v6o;->q:La/n0o0;

    .line 397
    .line 398
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v3

    .line 402
    check-cast v3, La/fee;

    .line 403
    .line 404
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    check-cast v3, Ljava/util/List;

    .line 409
    .line 410
    iget-object v4, v0, La/v6o;->l:La/n0o0;

    .line 411
    .line 412
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v4

    .line 416
    check-cast v4, La/fee;

    .line 417
    .line 418
    invoke-virtual {v4}, La/fee;->c()Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v4

    .line 422
    check-cast v4, La/yws;

    .line 423
    .line 424
    iget-object v0, v0, La/v6o;->D:Ljava/lang/Object;

    .line 425
    .line 426
    check-cast v0, La/m310;

    .line 427
    .line 428
    iget-boolean v0, v0, La/m310;->y:Z

    .line 429
    .line 430
    sget-object v7, La/w510;->a:Ljava/util/List;

    .line 431
    .line 432
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 433
    .line 434
    .line 435
    iget-object v7, v5, La/m9s;->n:Ljava/util/List;

    .line 436
    .line 437
    iget-object v8, v5, La/m9s;->m:Ljava/util/List;

    .line 438
    .line 439
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 440
    .line 441
    .line 442
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 443
    .line 444
    .line 445
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    if-nez v1, :cond_8

    .line 452
    .line 453
    sget-object v2, La/lak0;->c:La/lak0;

    .line 454
    .line 455
    goto/16 :goto_57

    .line 456
    .line 457
    :cond_8
    iget-object v12, v1, La/k4h;->e:La/ljg;

    .line 458
    .line 459
    iget-object v9, v1, La/k4h;->c:La/y3h;

    .line 460
    .line 461
    iget-object v13, v1, La/k4h;->a:La/p310;

    .line 462
    .line 463
    move-object/from16 v26, v3

    .line 464
    .line 465
    iget-object v3, v13, La/p310;->a:La/o310;

    .line 466
    .line 467
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 468
    .line 469
    .line 470
    move-result-object v14

    .line 471
    if-eqz v4, :cond_9

    .line 472
    .line 473
    iget-boolean v4, v4, La/yws;->c:Z

    .line 474
    .line 475
    if-nez v4, :cond_9

    .line 476
    .line 477
    goto :goto_2

    .line 478
    :cond_9
    new-instance v4, La/kxs;

    .line 479
    .line 480
    invoke-direct {v4}, La/kxs;-><init>()V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v14, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 484
    .line 485
    .line 486
    :goto_2
    new-instance v4, Ljava/util/ArrayList;

    .line 487
    .line 488
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 489
    .line 490
    .line 491
    invoke-interface/range {v26 .. v26}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 492
    .line 493
    .line 494
    move-result-object v15

    .line 495
    :goto_3
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 496
    .line 497
    .line 498
    move-result v16

    .line 499
    if-eqz v16, :cond_b

    .line 500
    .line 501
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v2

    .line 505
    move/from16 v25, v0

    .line 506
    .line 507
    move-object v0, v2

    .line 508
    check-cast v0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;

    .line 509
    .line 510
    iget-boolean v0, v0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;->c:Z

    .line 511
    .line 512
    if-eqz v0, :cond_a

    .line 513
    .line 514
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 515
    .line 516
    .line 517
    :cond_a
    move/from16 v0, v25

    .line 518
    .line 519
    goto :goto_3

    .line 520
    :cond_b
    move/from16 v25, v0

    .line 521
    .line 522
    new-instance v0, La/wpv;

    .line 523
    .line 524
    const/16 v2, 0x1d

    .line 525
    .line 526
    invoke-direct {v0, v2}, La/wpv;-><init>(B)V

    .line 527
    .line 528
    .line 529
    invoke-static {v4, v0}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    new-instance v2, Ljava/util/ArrayList;

    .line 534
    .line 535
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 536
    .line 537
    .line 538
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 543
    .line 544
    .line 545
    move-result v4

    .line 546
    if-eqz v4, :cond_f

    .line 547
    .line 548
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    move-result-object v4

    .line 552
    check-cast v4, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;

    .line 553
    .line 554
    sget-object v15, La/n310;->g:La/c0o;

    .line 555
    .line 556
    invoke-virtual {v15}, La/b3;->iterator()Ljava/util/Iterator;

    .line 557
    .line 558
    .line 559
    move-result-object v15

    .line 560
    :goto_5
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 561
    .line 562
    .line 563
    move-result v16

    .line 564
    if-eqz v16, :cond_d

    .line 565
    .line 566
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v16

    .line 570
    move-object/from16 p0, v0

    .line 571
    .line 572
    move-object/from16 v0, v16

    .line 573
    .line 574
    check-cast v0, La/n310;

    .line 575
    .line 576
    iget-object v0, v0, La/n310;->a:La/t9m0;

    .line 577
    .line 578
    move-object/from16 p1, v7

    .line 579
    .line 580
    iget-object v7, v4, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;->a:La/t9m0;

    .line 581
    .line 582
    if-ne v0, v7, :cond_c

    .line 583
    .line 584
    goto :goto_6

    .line 585
    :cond_c
    move-object/from16 v0, p0

    .line 586
    .line 587
    move-object/from16 v7, p1

    .line 588
    .line 589
    goto :goto_5

    .line 590
    :cond_d
    move-object/from16 p0, v0

    .line 591
    .line 592
    move-object/from16 p1, v7

    .line 593
    .line 594
    const/16 v16, 0x0

    .line 595
    .line 596
    :goto_6
    move-object/from16 v0, v16

    .line 597
    .line 598
    check-cast v0, La/n310;

    .line 599
    .line 600
    if-eqz v0, :cond_e

    .line 601
    .line 602
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 603
    .line 604
    .line 605
    :cond_e
    move-object/from16 v0, p0

    .line 606
    .line 607
    move-object/from16 v7, p1

    .line 608
    .line 609
    goto :goto_4

    .line 610
    :cond_f
    move-object/from16 p1, v7

    .line 611
    .line 612
    iget-object v0, v6, La/ctf0;->b:La/lsm0;

    .line 613
    .line 614
    invoke-virtual {v6}, La/ctf0;->j()Z

    .line 615
    .line 616
    .line 617
    move-result v4

    .line 618
    if-eqz v4, :cond_15

    .line 619
    .line 620
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 621
    .line 622
    .line 623
    move-result-object v4

    .line 624
    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 625
    .line 626
    .line 627
    move-result v7

    .line 628
    if-eqz v7, :cond_11

    .line 629
    .line 630
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 631
    .line 632
    .line 633
    move-result-object v7

    .line 634
    move-object v15, v7

    .line 635
    check-cast v15, La/n310;

    .line 636
    .line 637
    move-object/from16 p0, v2

    .line 638
    .line 639
    sget-object v2, La/n310;->d:La/n310;

    .line 640
    .line 641
    if-ne v15, v2, :cond_10

    .line 642
    .line 643
    goto :goto_8

    .line 644
    :cond_10
    move-object/from16 v2, p0

    .line 645
    .line 646
    goto :goto_7

    .line 647
    :cond_11
    move-object/from16 p0, v2

    .line 648
    .line 649
    const/4 v7, 0x0

    .line 650
    :goto_8
    check-cast v7, La/n310;

    .line 651
    .line 652
    if-eqz v7, :cond_14

    .line 653
    .line 654
    invoke-static {v7}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 655
    .line 656
    .line 657
    move-result-object v2

    .line 658
    new-instance v4, Ljava/util/ArrayList;

    .line 659
    .line 660
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 661
    .line 662
    .line 663
    invoke-virtual/range {p0 .. p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 664
    .line 665
    .line 666
    move-result-object v15

    .line 667
    :goto_9
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 668
    .line 669
    .line 670
    move-result v16

    .line 671
    if-eqz v16, :cond_13

    .line 672
    .line 673
    move-object/from16 v20, v6

    .line 674
    .line 675
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 676
    .line 677
    .line 678
    move-result-object v6

    .line 679
    move-object/from16 v28, v8

    .line 680
    .line 681
    move-object v8, v6

    .line 682
    check-cast v8, La/n310;

    .line 683
    .line 684
    if-eq v8, v7, :cond_12

    .line 685
    .line 686
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 687
    .line 688
    .line 689
    :cond_12
    move-object/from16 v6, v20

    .line 690
    .line 691
    move-object/from16 v8, v28

    .line 692
    .line 693
    goto :goto_9

    .line 694
    :cond_13
    move-object/from16 v20, v6

    .line 695
    .line 696
    move-object/from16 v28, v8

    .line 697
    .line 698
    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 699
    .line 700
    .line 701
    move-result-object v2

    .line 702
    goto :goto_c

    .line 703
    :cond_14
    :goto_a
    move-object/from16 v20, v6

    .line 704
    .line 705
    move-object/from16 v28, v8

    .line 706
    .line 707
    goto :goto_b

    .line 708
    :cond_15
    move-object/from16 p0, v2

    .line 709
    .line 710
    goto :goto_a

    .line 711
    :goto_b
    move-object/from16 v2, p0

    .line 712
    .line 713
    :goto_c
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 714
    .line 715
    .line 716
    move-result-object v2

    .line 717
    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 718
    .line 719
    .line 720
    move-result v4

    .line 721
    if-eqz v4, :cond_62

    .line 722
    .line 723
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 724
    .line 725
    .line 726
    move-result-object v4

    .line 727
    check-cast v4, La/n310;

    .line 728
    .line 729
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 730
    .line 731
    .line 732
    move-result v4

    .line 733
    const-string v8, "/"

    .line 734
    .line 735
    const-string v15, "https://"

    .line 736
    .line 737
    const-string v30, ""

    .line 738
    .line 739
    packed-switch v4, :pswitch_data_1

    .line 740
    .line 741
    .line 742
    invoke-static {}, La/t9f;->b()V

    .line 743
    .line 744
    .line 745
    const/4 v2, 0x0

    .line 746
    goto/16 :goto_57

    .line 747
    .line 748
    :pswitch_2
    iget-wide v7, v11, La/g310;->f:J

    .line 749
    .line 750
    iget-boolean v6, v11, La/g310;->g:Z

    .line 751
    .line 752
    invoke-static {v12, v5}, La/x2x;->b0(La/ljg;La/m9s;)Z

    .line 753
    .line 754
    .line 755
    move-result v15

    .line 756
    if-eqz v15, :cond_16

    .line 757
    .line 758
    goto :goto_e

    .line 759
    :cond_16
    sget-object v15, La/n2z;->a:Ljava/util/List;

    .line 760
    .line 761
    invoke-static {v12, v15}, La/n2z;->a(La/ljg;Ljava/util/List;)Ljava/util/ArrayList;

    .line 762
    .line 763
    .line 764
    move-result-object v15

    .line 765
    invoke-static {v7, v8, v15}, La/n2z;->d(JLjava/util/ArrayList;)La/l2z;

    .line 766
    .line 767
    .line 768
    move-result-object v7

    .line 769
    if-nez v7, :cond_17

    .line 770
    .line 771
    :goto_e
    move-object/from16 v31, v2

    .line 772
    .line 773
    move-object/from16 v32, v12

    .line 774
    .line 775
    move-object v7, v13

    .line 776
    move-object v8, v14

    .line 777
    move-object/from16 v12, v20

    .line 778
    .line 779
    move/from16 v13, v25

    .line 780
    .line 781
    goto :goto_f

    .line 782
    :cond_17
    sget-wide v16, La/kkg;->h:J

    .line 783
    .line 784
    const/4 v4, 0x0

    .line 785
    new-array v8, v4, [Ljava/lang/Object;

    .line 786
    .line 787
    invoke-static {v8, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 788
    .line 789
    .line 790
    move-result-object v4

    .line 791
    const v8, 0x7f1309aa

    .line 792
    .line 793
    .line 794
    invoke-virtual {v0, v8, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 795
    .line 796
    .line 797
    move-result-object v18

    .line 798
    invoke-virtual/range {v20 .. v20}, La/ctf0;->j()Z

    .line 799
    .line 800
    .line 801
    move-result v19

    .line 802
    move-object v4, v13

    .line 803
    const-string v13, "LAST_MATCHES_TABS"

    .line 804
    .line 805
    move-object v8, v14

    .line 806
    move-object v14, v7

    .line 807
    move-object v7, v4

    .line 808
    invoke-static/range {v12 .. v19}, La/q5x;->C(La/ljg;Ljava/lang/String;La/l2z;Ljava/util/ArrayList;JLjava/lang/String;Z)La/boo0;

    .line 809
    .line 810
    .line 811
    move-result-object v4

    .line 812
    new-instance v13, La/psv;

    .line 813
    .line 814
    const-string v15, "LAST_MATCHES_HEADER"

    .line 815
    .line 816
    move-object/from16 v31, v2

    .line 817
    .line 818
    const v2, 0x7f130abc

    .line 819
    .line 820
    .line 821
    invoke-direct {v13, v15, v2}, La/psv;-><init>(Ljava/lang/String;I)V

    .line 822
    .line 823
    .line 824
    new-instance v2, La/dlf;

    .line 825
    .line 826
    const/4 v15, 0x1

    .line 827
    invoke-direct {v2, v5, v15}, La/dlf;-><init>(La/m9s;B)V

    .line 828
    .line 829
    .line 830
    move-object v15, v13

    .line 831
    move-object v13, v12

    .line 832
    const-string v12, "LAST_MATCHES"

    .line 833
    .line 834
    const/16 v17, 0x0

    .line 835
    .line 836
    const/16 v18, 0x0

    .line 837
    .line 838
    move-object/from16 v16, v20

    .line 839
    .line 840
    move/from16 v19, v25

    .line 841
    .line 842
    move-object/from16 v20, v2

    .line 843
    .line 844
    move-object v2, v15

    .line 845
    move v15, v6

    .line 846
    invoke-static/range {v12 .. v20}, La/n2z;->b(Ljava/lang/String;La/ljg;La/l2z;ZLa/ctf0;ZZZLkotlin/jvm/functions/Function1;)La/m2z;

    .line 847
    .line 848
    .line 849
    move-result-object v6

    .line 850
    move-object/from16 v32, v13

    .line 851
    .line 852
    move-object/from16 v12, v16

    .line 853
    .line 854
    move/from16 v13, v19

    .line 855
    .line 856
    invoke-virtual {v8, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 857
    .line 858
    .line 859
    invoke-virtual {v8, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 860
    .line 861
    .line 862
    invoke-virtual {v8, v6}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 863
    .line 864
    .line 865
    :goto_f
    move-object/from16 v16, p1

    .line 866
    .line 867
    move-object/from16 v30, v0

    .line 868
    .line 869
    move-object/from16 v37, v7

    .line 870
    .line 871
    move-object v2, v8

    .line 872
    move-object/from16 v38, v9

    .line 873
    .line 874
    move-object/from16 v33, v10

    .line 875
    .line 876
    move-object/from16 p1, v11

    .line 877
    .line 878
    move-object v6, v12

    .line 879
    move/from16 v25, v13

    .line 880
    .line 881
    goto/16 :goto_55

    .line 882
    .line 883
    :pswitch_3
    move-object/from16 v31, v2

    .line 884
    .line 885
    move-object/from16 v32, v12

    .line 886
    .line 887
    move-object v7, v13

    .line 888
    move-object v8, v14

    .line 889
    move-object/from16 v12, v20

    .line 890
    .line 891
    move/from16 v13, v25

    .line 892
    .line 893
    iget-object v2, v9, La/y3h;->d:La/c110;

    .line 894
    .line 895
    iget-object v6, v9, La/y3h;->h:La/c110;

    .line 896
    .line 897
    new-instance v33, La/c110;

    .line 898
    .line 899
    const/high16 v41, -0x40800000    # -1.0f

    .line 900
    .line 901
    const/high16 v42, -0x40800000    # -1.0f

    .line 902
    .line 903
    const/16 v34, -0x1

    .line 904
    .line 905
    const/16 v35, -0x1

    .line 906
    .line 907
    const/high16 v36, -0x40800000    # -1.0f

    .line 908
    .line 909
    const/high16 v37, -0x40800000    # -1.0f

    .line 910
    .line 911
    const/high16 v38, -0x40800000    # -1.0f

    .line 912
    .line 913
    const/16 v39, -0x1

    .line 914
    .line 915
    const/high16 v40, -0x40800000    # -1.0f

    .line 916
    .line 917
    invoke-direct/range {v33 .. v42}, La/c110;-><init>(IIFFFIFFF)V

    .line 918
    .line 919
    .line 920
    move-object/from16 v14, v33

    .line 921
    .line 922
    invoke-virtual {v2, v14}, La/c110;->equals(Ljava/lang/Object;)Z

    .line 923
    .line 924
    .line 925
    move-result v14

    .line 926
    if-eqz v14, :cond_18

    .line 927
    .line 928
    new-instance v33, La/c110;

    .line 929
    .line 930
    const/high16 v41, -0x40800000    # -1.0f

    .line 931
    .line 932
    const/high16 v42, -0x40800000    # -1.0f

    .line 933
    .line 934
    const/16 v34, -0x1

    .line 935
    .line 936
    const/16 v35, -0x1

    .line 937
    .line 938
    const/high16 v36, -0x40800000    # -1.0f

    .line 939
    .line 940
    const/high16 v37, -0x40800000    # -1.0f

    .line 941
    .line 942
    const/high16 v38, -0x40800000    # -1.0f

    .line 943
    .line 944
    const/16 v39, -0x1

    .line 945
    .line 946
    const/high16 v40, -0x40800000    # -1.0f

    .line 947
    .line 948
    invoke-direct/range {v33 .. v42}, La/c110;-><init>(IIFFFIFFF)V

    .line 949
    .line 950
    .line 951
    move-object/from16 v14, v33

    .line 952
    .line 953
    invoke-virtual {v6, v14}, La/c110;->equals(Ljava/lang/Object;)Z

    .line 954
    .line 955
    .line 956
    move-result v14

    .line 957
    if-eqz v14, :cond_18

    .line 958
    .line 959
    move-object/from16 v34, v5

    .line 960
    .line 961
    move-object/from16 v33, v10

    .line 962
    .line 963
    move/from16 v25, v13

    .line 964
    .line 965
    goto/16 :goto_21

    .line 966
    .line 967
    :cond_18
    invoke-static/range {v28 .. v28}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 968
    .line 969
    .line 970
    move-result-object v14

    .line 971
    check-cast v14, Ljava/lang/String;

    .line 972
    .line 973
    if-nez v14, :cond_19

    .line 974
    .line 975
    move-object/from16 v14, v30

    .line 976
    .line 977
    :cond_19
    invoke-static {v14}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 978
    .line 979
    .line 980
    move-result-object v14

    .line 981
    invoke-static/range {p1 .. p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 982
    .line 983
    .line 984
    move-result-object v15

    .line 985
    check-cast v15, Ljava/lang/String;

    .line 986
    .line 987
    if-nez v15, :cond_1a

    .line 988
    .line 989
    goto :goto_10

    .line 990
    :cond_1a
    move-object/from16 v30, v15

    .line 991
    .line 992
    :goto_10
    invoke-static/range {v30 .. v30}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 993
    .line 994
    .line 995
    move-result-object v15

    .line 996
    invoke-static {v14, v15, v12, v13}, La/vtb;->S(Ljava/lang/String;Ljava/lang/String;La/ctf0;Z)La/add;

    .line 997
    .line 998
    .line 999
    move-result-object v14

    .line 1000
    iget v15, v2, La/c110;->a:I

    .line 1001
    .line 1002
    const/4 v4, -0x1

    .line 1003
    move/from16 v25, v13

    .line 1004
    .line 1005
    if-eq v15, v4, :cond_1b

    .line 1006
    .line 1007
    iget v13, v6, La/c110;->a:I

    .line 1008
    .line 1009
    if-eq v13, v4, :cond_1b

    .line 1010
    .line 1011
    sget-object v18, La/zcd;->a:[La/zcd;

    .line 1012
    .line 1013
    move-object/from16 v33, v10

    .line 1014
    .line 1015
    const/4 v4, 0x0

    .line 1016
    new-array v10, v4, [Ljava/lang/Object;

    .line 1017
    .line 1018
    invoke-static {v10, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v10

    .line 1022
    const v4, 0x7f1310ec

    .line 1023
    .line 1024
    .line 1025
    invoke-virtual {v0, v4, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v4

    .line 1029
    const-string v10, "COMPARE_TEAMSWIN"

    .line 1030
    .line 1031
    move-object/from16 v34, v5

    .line 1032
    .line 1033
    const/4 v5, 0x0

    .line 1034
    invoke-static {v15, v13, v4, v10, v5}, La/vtb;->R(IILjava/lang/String;Ljava/lang/String;Z)La/bdd;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v4

    .line 1038
    move-object/from16 v35, v4

    .line 1039
    .line 1040
    goto :goto_11

    .line 1041
    :cond_1b
    move-object/from16 v34, v5

    .line 1042
    .line 1043
    move-object/from16 v33, v10

    .line 1044
    .line 1045
    const/4 v5, 0x0

    .line 1046
    const/16 v35, 0x0

    .line 1047
    .line 1048
    :goto_11
    iget v4, v2, La/c110;->b:I

    .line 1049
    .line 1050
    const/4 v10, -0x1

    .line 1051
    if-eq v4, v10, :cond_1c

    .line 1052
    .line 1053
    iget v13, v6, La/c110;->b:I

    .line 1054
    .line 1055
    if-eq v13, v10, :cond_1c

    .line 1056
    .line 1057
    sget-object v10, La/zcd;->a:[La/zcd;

    .line 1058
    .line 1059
    new-array v10, v5, [Ljava/lang/Object;

    .line 1060
    .line 1061
    invoke-static {v10, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v10

    .line 1065
    const v5, 0x7f1314e4

    .line 1066
    .line 1067
    .line 1068
    invoke-virtual {v0, v5, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v5

    .line 1072
    const-string v10, "COMPARE_TEAMSLOSE"

    .line 1073
    .line 1074
    const/4 v15, 0x1

    .line 1075
    invoke-static {v4, v13, v5, v10, v15}, La/vtb;->R(IILjava/lang/String;Ljava/lang/String;Z)La/bdd;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v4

    .line 1079
    move-object/from16 v36, v4

    .line 1080
    .line 1081
    goto :goto_12

    .line 1082
    :cond_1c
    const/16 v36, 0x0

    .line 1083
    .line 1084
    :goto_12
    iget v4, v2, La/c110;->c:F

    .line 1085
    .line 1086
    const/high16 v5, -0x40800000    # -1.0f

    .line 1087
    .line 1088
    cmpg-float v10, v4, v5

    .line 1089
    .line 1090
    if-nez v10, :cond_1d

    .line 1091
    .line 1092
    goto :goto_13

    .line 1093
    :cond_1d
    iget v10, v6, La/c110;->c:F

    .line 1094
    .line 1095
    cmpg-float v13, v10, v5

    .line 1096
    .line 1097
    if-nez v13, :cond_1e

    .line 1098
    .line 1099
    :goto_13
    move/from16 v17, v5

    .line 1100
    .line 1101
    const/16 v37, 0x0

    .line 1102
    .line 1103
    goto :goto_14

    .line 1104
    :cond_1e
    sget-object v13, La/zcd;->a:[La/zcd;

    .line 1105
    .line 1106
    const/4 v13, 0x0

    .line 1107
    new-array v15, v13, [Ljava/lang/Object;

    .line 1108
    .line 1109
    invoke-static {v15, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v15

    .line 1113
    move/from16 v17, v5

    .line 1114
    .line 1115
    const v5, 0x7f130b98

    .line 1116
    .line 1117
    .line 1118
    invoke-virtual {v0, v5, v15}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v5

    .line 1122
    const-string v15, "COMPARE_TEAMSKILLS"

    .line 1123
    .line 1124
    invoke-static {v4, v10, v5, v15, v13}, La/vtb;->Q(FFLjava/lang/String;Ljava/lang/String;Z)La/bdd;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v4

    .line 1128
    move-object/from16 v37, v4

    .line 1129
    .line 1130
    :goto_14
    iget v4, v2, La/c110;->d:F

    .line 1131
    .line 1132
    cmpg-float v10, v4, v17

    .line 1133
    .line 1134
    if-nez v10, :cond_1f

    .line 1135
    .line 1136
    goto :goto_15

    .line 1137
    :cond_1f
    iget v10, v6, La/c110;->d:F

    .line 1138
    .line 1139
    cmpg-float v13, v10, v17

    .line 1140
    .line 1141
    if-nez v13, :cond_20

    .line 1142
    .line 1143
    :goto_15
    const/16 v38, 0x0

    .line 1144
    .line 1145
    goto :goto_16

    .line 1146
    :cond_20
    sget-object v13, La/zcd;->a:[La/zcd;

    .line 1147
    .line 1148
    const/4 v5, 0x0

    .line 1149
    new-array v13, v5, [Ljava/lang/Object;

    .line 1150
    .line 1151
    invoke-static {v13, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v13

    .line 1155
    const v15, 0x7f130b69

    .line 1156
    .line 1157
    .line 1158
    invoke-virtual {v0, v15, v13}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v13

    .line 1162
    const-string v15, "COMPARE_TEAMSDEATH"

    .line 1163
    .line 1164
    const/4 v5, 0x1

    .line 1165
    invoke-static {v4, v10, v13, v15, v5}, La/vtb;->Q(FFLjava/lang/String;Ljava/lang/String;Z)La/bdd;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v4

    .line 1169
    move-object/from16 v38, v4

    .line 1170
    .line 1171
    :goto_16
    iget v4, v2, La/c110;->e:F

    .line 1172
    .line 1173
    cmpg-float v5, v4, v17

    .line 1174
    .line 1175
    if-nez v5, :cond_21

    .line 1176
    .line 1177
    goto :goto_17

    .line 1178
    :cond_21
    iget v5, v6, La/c110;->e:F

    .line 1179
    .line 1180
    cmpg-float v10, v5, v17

    .line 1181
    .line 1182
    if-nez v10, :cond_22

    .line 1183
    .line 1184
    :goto_17
    const/4 v13, 0x0

    .line 1185
    const/16 v39, 0x0

    .line 1186
    .line 1187
    goto :goto_18

    .line 1188
    :cond_22
    sget-object v10, La/zcd;->a:[La/zcd;

    .line 1189
    .line 1190
    const/4 v13, 0x0

    .line 1191
    new-array v10, v13, [Ljava/lang/Object;

    .line 1192
    .line 1193
    invoke-static {v10, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v10

    .line 1197
    const v15, 0x7f130b97

    .line 1198
    .line 1199
    .line 1200
    invoke-virtual {v0, v15, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v10

    .line 1204
    const-string v15, "COMPARE_TEAMSASSIST"

    .line 1205
    .line 1206
    invoke-static {v4, v5, v10, v15, v13}, La/vtb;->Q(FFLjava/lang/String;Ljava/lang/String;Z)La/bdd;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v4

    .line 1210
    move-object/from16 v39, v4

    .line 1211
    .line 1212
    :goto_18
    iget v4, v2, La/c110;->f:I

    .line 1213
    .line 1214
    const/4 v10, -0x1

    .line 1215
    if-eq v4, v10, :cond_23

    .line 1216
    .line 1217
    iget v5, v6, La/c110;->f:I

    .line 1218
    .line 1219
    if-eq v5, v10, :cond_23

    .line 1220
    .line 1221
    sget-object v10, La/zcd;->a:[La/zcd;

    .line 1222
    .line 1223
    new-array v10, v13, [Ljava/lang/Object;

    .line 1224
    .line 1225
    invoke-static {v10, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v10

    .line 1229
    const v15, 0x7f130619

    .line 1230
    .line 1231
    .line 1232
    invoke-virtual {v0, v15, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v10

    .line 1236
    const-string v15, "COMPARE_TEAMSGOLD"

    .line 1237
    .line 1238
    invoke-static {v4, v5, v10, v15, v13}, La/vtb;->R(IILjava/lang/String;Ljava/lang/String;Z)La/bdd;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v5

    .line 1242
    move-object/from16 v40, v5

    .line 1243
    .line 1244
    goto :goto_19

    .line 1245
    :cond_23
    const/16 v40, 0x0

    .line 1246
    .line 1247
    :goto_19
    iget v5, v2, La/c110;->g:F

    .line 1248
    .line 1249
    cmpg-float v10, v5, v17

    .line 1250
    .line 1251
    if-nez v10, :cond_24

    .line 1252
    .line 1253
    goto :goto_1a

    .line 1254
    :cond_24
    iget v10, v6, La/c110;->g:F

    .line 1255
    .line 1256
    cmpg-float v13, v10, v17

    .line 1257
    .line 1258
    if-nez v13, :cond_25

    .line 1259
    .line 1260
    :goto_1a
    const/16 v41, 0x0

    .line 1261
    .line 1262
    goto :goto_1b

    .line 1263
    :cond_25
    sget-object v13, La/zcd;->a:[La/zcd;

    .line 1264
    .line 1265
    const/4 v4, 0x0

    .line 1266
    new-array v13, v4, [Ljava/lang/Object;

    .line 1267
    .line 1268
    invoke-static {v13, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v13

    .line 1272
    const v15, 0x7f130b62

    .line 1273
    .line 1274
    .line 1275
    invoke-virtual {v0, v15, v13}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v13

    .line 1279
    const-string v15, "COMPARE_TEAMSBARON"

    .line 1280
    .line 1281
    invoke-static {v5, v10, v13, v15, v4}, La/vtb;->Q(FFLjava/lang/String;Ljava/lang/String;Z)La/bdd;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v5

    .line 1285
    move-object/from16 v41, v5

    .line 1286
    .line 1287
    :goto_1b
    iget v5, v2, La/c110;->h:F

    .line 1288
    .line 1289
    cmpg-float v10, v5, v17

    .line 1290
    .line 1291
    if-nez v10, :cond_26

    .line 1292
    .line 1293
    goto :goto_1c

    .line 1294
    :cond_26
    iget v10, v6, La/c110;->h:F

    .line 1295
    .line 1296
    cmpg-float v13, v10, v17

    .line 1297
    .line 1298
    if-nez v13, :cond_27

    .line 1299
    .line 1300
    :goto_1c
    const/16 v42, 0x0

    .line 1301
    .line 1302
    goto :goto_1d

    .line 1303
    :cond_27
    sget-object v13, La/zcd;->a:[La/zcd;

    .line 1304
    .line 1305
    const/4 v4, 0x0

    .line 1306
    new-array v13, v4, [Ljava/lang/Object;

    .line 1307
    .line 1308
    invoke-static {v13, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v13

    .line 1312
    const v15, 0x7f130b6b

    .line 1313
    .line 1314
    .line 1315
    invoke-virtual {v0, v15, v13}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v13

    .line 1319
    const-string v15, "COMPARE_TEAMSDRAGON"

    .line 1320
    .line 1321
    invoke-static {v5, v10, v13, v15, v4}, La/vtb;->Q(FFLjava/lang/String;Ljava/lang/String;Z)La/bdd;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v5

    .line 1325
    move-object/from16 v42, v5

    .line 1326
    .line 1327
    :goto_1d
    iget v2, v2, La/c110;->i:F

    .line 1328
    .line 1329
    cmpg-float v5, v2, v17

    .line 1330
    .line 1331
    if-nez v5, :cond_28

    .line 1332
    .line 1333
    goto :goto_1e

    .line 1334
    :cond_28
    iget v5, v6, La/c110;->i:F

    .line 1335
    .line 1336
    cmpg-float v6, v5, v17

    .line 1337
    .line 1338
    if-nez v6, :cond_29

    .line 1339
    .line 1340
    :goto_1e
    const/16 v43, 0x0

    .line 1341
    .line 1342
    goto :goto_1f

    .line 1343
    :cond_29
    sget-object v6, La/zcd;->a:[La/zcd;

    .line 1344
    .line 1345
    const/4 v4, 0x0

    .line 1346
    new-array v6, v4, [Ljava/lang/Object;

    .line 1347
    .line 1348
    invoke-static {v6, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v6

    .line 1352
    const v10, 0x7f130ba1

    .line 1353
    .line 1354
    .line 1355
    invoke-virtual {v0, v10, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1356
    .line 1357
    .line 1358
    move-result-object v6

    .line 1359
    const-string v10, "COMPARE_TEAMSTOWER"

    .line 1360
    .line 1361
    invoke-static {v2, v5, v6, v10, v4}, La/vtb;->Q(FFLjava/lang/String;Ljava/lang/String;Z)La/bdd;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v2

    .line 1365
    move-object/from16 v43, v2

    .line 1366
    .line 1367
    :goto_1f
    filled-new-array/range {v35 .. v43}, [La/bdd;

    .line 1368
    .line 1369
    .line 1370
    move-result-object v2

    .line 1371
    invoke-static {v2}, La/tx3;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v2

    .line 1375
    check-cast v2, Ljava/util/ArrayList;

    .line 1376
    .line 1377
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1378
    .line 1379
    .line 1380
    move-result v4

    .line 1381
    if-nez v4, :cond_2a

    .line 1382
    .line 1383
    new-instance v4, La/psv;

    .line 1384
    .line 1385
    const-string v5, "COMPARE_TEAMS_HEADER"

    .line 1386
    .line 1387
    const v6, 0x7f1304c8

    .line 1388
    .line 1389
    .line 1390
    invoke-direct {v4, v5, v6}, La/psv;-><init>(Ljava/lang/String;I)V

    .line 1391
    .line 1392
    .line 1393
    invoke-virtual {v8, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1394
    .line 1395
    .line 1396
    invoke-virtual {v8, v14}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1397
    .line 1398
    .line 1399
    :cond_2a
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v2

    .line 1403
    :goto_20
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1404
    .line 1405
    .line 1406
    move-result v4

    .line 1407
    if-eqz v4, :cond_2b

    .line 1408
    .line 1409
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v4

    .line 1413
    check-cast v4, La/bdd;

    .line 1414
    .line 1415
    invoke-virtual {v8, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1416
    .line 1417
    .line 1418
    goto :goto_20

    .line 1419
    :cond_2b
    :goto_21
    move-object/from16 v16, p1

    .line 1420
    .line 1421
    move-object/from16 v30, v0

    .line 1422
    .line 1423
    move-object/from16 v37, v7

    .line 1424
    .line 1425
    move-object v2, v8

    .line 1426
    :goto_22
    move-object/from16 v38, v9

    .line 1427
    .line 1428
    move-object/from16 p1, v11

    .line 1429
    .line 1430
    move-object v6, v12

    .line 1431
    :goto_23
    move-object/from16 v5, v34

    .line 1432
    .line 1433
    goto/16 :goto_55

    .line 1434
    .line 1435
    :pswitch_4
    move-object/from16 v31, v2

    .line 1436
    .line 1437
    move-object/from16 v34, v5

    .line 1438
    .line 1439
    move-object/from16 v33, v10

    .line 1440
    .line 1441
    move-object/from16 v32, v12

    .line 1442
    .line 1443
    move-object v7, v13

    .line 1444
    move-object v8, v14

    .line 1445
    move-object/from16 v12, v20

    .line 1446
    .line 1447
    iget-object v15, v1, La/k4h;->d:La/ic6;

    .line 1448
    .line 1449
    sget-object v17, La/q4h;->c:Ljava/util/List;

    .line 1450
    .line 1451
    iget-object v2, v11, La/g310;->e:Ljava/util/List;

    .line 1452
    .line 1453
    iget-wide v4, v11, La/g310;->d:J

    .line 1454
    .line 1455
    invoke-virtual {v12}, La/ctf0;->j()Z

    .line 1456
    .line 1457
    .line 1458
    move-result v20

    .line 1459
    move-object/from16 v16, v2

    .line 1460
    .line 1461
    move-wide/from16 v18, v4

    .line 1462
    .line 1463
    invoke-static/range {v14 .. v20}, La/rq8;->F(La/lc00;La/ic6;Ljava/util/List;Ljava/util/List;JZ)V

    .line 1464
    .line 1465
    .line 1466
    move-object v2, v14

    .line 1467
    :goto_24
    move-object/from16 v16, p1

    .line 1468
    .line 1469
    move-object/from16 v30, v0

    .line 1470
    .line 1471
    move-object/from16 v37, v7

    .line 1472
    .line 1473
    goto :goto_22

    .line 1474
    :pswitch_5
    move-object/from16 v31, v2

    .line 1475
    .line 1476
    move-object/from16 v34, v5

    .line 1477
    .line 1478
    move-object/from16 v33, v10

    .line 1479
    .line 1480
    move-object/from16 v32, v12

    .line 1481
    .line 1482
    move-object v7, v13

    .line 1483
    move-object v2, v14

    .line 1484
    move-object/from16 v12, v20

    .line 1485
    .line 1486
    iget-object v4, v11, La/g310;->c:La/o4i0;

    .line 1487
    .line 1488
    invoke-static/range {v32 .. v32}, La/zsm0;->m(La/ljg;)Ljava/util/List;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v5

    .line 1492
    invoke-static {v2, v9, v4, v12, v5}, La/fww;->r(La/lc00;La/y3h;La/o4i0;La/ctf0;Ljava/util/List;)V

    .line 1493
    .line 1494
    .line 1495
    goto :goto_24

    .line 1496
    :pswitch_6
    move-object/from16 v31, v2

    .line 1497
    .line 1498
    move-object/from16 v34, v5

    .line 1499
    .line 1500
    move-object/from16 v33, v10

    .line 1501
    .line 1502
    move-object/from16 v32, v12

    .line 1503
    .line 1504
    move-object v7, v13

    .line 1505
    move-object v2, v14

    .line 1506
    move-object/from16 v12, v20

    .line 1507
    .line 1508
    invoke-virtual {v12}, La/ctf0;->j()Z

    .line 1509
    .line 1510
    .line 1511
    move-result v5

    .line 1512
    iget-object v10, v7, La/p310;->b:Ljava/util/List;

    .line 1513
    .line 1514
    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->t0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1515
    .line 1516
    .line 1517
    move-result-object v10

    .line 1518
    new-instance v13, Ljava/util/ArrayList;

    .line 1519
    .line 1520
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 1521
    .line 1522
    .line 1523
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1524
    .line 1525
    .line 1526
    move-result-object v10

    .line 1527
    :cond_2c
    :goto_25
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 1528
    .line 1529
    .line 1530
    move-result v14

    .line 1531
    if-eqz v14, :cond_2d

    .line 1532
    .line 1533
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1534
    .line 1535
    .line 1536
    move-result-object v14

    .line 1537
    move-object v4, v14

    .line 1538
    check-cast v4, La/cah;

    .line 1539
    .line 1540
    iget-object v4, v4, La/cah;->d:La/zf90;

    .line 1541
    .line 1542
    sget-object v6, La/zf90;->d:La/zf90;

    .line 1543
    .line 1544
    if-eq v4, v6, :cond_2c

    .line 1545
    .line 1546
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1547
    .line 1548
    .line 1549
    goto :goto_25

    .line 1550
    :cond_2d
    new-instance v6, Ljava/util/ArrayList;

    .line 1551
    .line 1552
    const/16 v4, 0xa

    .line 1553
    .line 1554
    invoke-static {v13, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1555
    .line 1556
    .line 1557
    move-result v4

    .line 1558
    invoke-direct {v6, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 1559
    .line 1560
    .line 1561
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1562
    .line 1563
    .line 1564
    move-result-object v10

    .line 1565
    :goto_26
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 1566
    .line 1567
    .line 1568
    move-result v4

    .line 1569
    if-eqz v4, :cond_3b

    .line 1570
    .line 1571
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1572
    .line 1573
    .line 1574
    move-result-object v4

    .line 1575
    move-object v13, v4

    .line 1576
    check-cast v13, La/cah;

    .line 1577
    .line 1578
    iget-object v14, v13, La/cah;->d:La/zf90;

    .line 1579
    .line 1580
    const/4 v4, 0x1

    .line 1581
    invoke-static {v14, v4}, La/w510;->b(La/zf90;I)Ljava/lang/Integer;

    .line 1582
    .line 1583
    .line 1584
    move-result-object v16

    .line 1585
    if-eqz v16, :cond_2e

    .line 1586
    .line 1587
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Number;->intValue()I

    .line 1588
    .line 1589
    .line 1590
    move-result v4

    .line 1591
    move/from16 v36, v5

    .line 1592
    .line 1593
    move-object/from16 v37, v7

    .line 1594
    .line 1595
    const/4 v5, 0x0

    .line 1596
    new-array v7, v5, [Ljava/lang/Object;

    .line 1597
    .line 1598
    invoke-static {v7, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1599
    .line 1600
    .line 1601
    move-result-object v7

    .line 1602
    invoke-virtual {v0, v4, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1603
    .line 1604
    .line 1605
    move-result-object v4

    .line 1606
    goto :goto_27

    .line 1607
    :cond_2e
    move/from16 v36, v5

    .line 1608
    .line 1609
    move-object/from16 v37, v7

    .line 1610
    .line 1611
    const/4 v5, 0x0

    .line 1612
    const/4 v4, 0x0

    .line 1613
    :goto_27
    if-nez v4, :cond_2f

    .line 1614
    .line 1615
    move-object/from16 v7, v30

    .line 1616
    .line 1617
    :goto_28
    const/4 v4, 0x2

    .line 1618
    goto :goto_29

    .line 1619
    :cond_2f
    move-object v7, v4

    .line 1620
    goto :goto_28

    .line 1621
    :goto_29
    invoke-static {v14, v4}, La/w510;->b(La/zf90;I)Ljava/lang/Integer;

    .line 1622
    .line 1623
    .line 1624
    move-result-object v16

    .line 1625
    if-eqz v16, :cond_30

    .line 1626
    .line 1627
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Number;->intValue()I

    .line 1628
    .line 1629
    .line 1630
    move-result v4

    .line 1631
    move/from16 v16, v4

    .line 1632
    .line 1633
    new-array v4, v5, [Ljava/lang/Object;

    .line 1634
    .line 1635
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1636
    .line 1637
    .line 1638
    move-result-object v4

    .line 1639
    move/from16 v5, v16

    .line 1640
    .line 1641
    invoke-virtual {v0, v5, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1642
    .line 1643
    .line 1644
    move-result-object v4

    .line 1645
    goto :goto_2a

    .line 1646
    :cond_30
    const/4 v4, 0x0

    .line 1647
    :goto_2a
    if-nez v4, :cond_31

    .line 1648
    .line 1649
    move-object/from16 v18, v30

    .line 1650
    .line 1651
    goto :goto_2b

    .line 1652
    :cond_31
    move-object/from16 v18, v4

    .line 1653
    .line 1654
    :goto_2b
    invoke-static/range {v28 .. v28}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1655
    .line 1656
    .line 1657
    move-result-object v4

    .line 1658
    check-cast v4, Ljava/lang/String;

    .line 1659
    .line 1660
    if-nez v4, :cond_32

    .line 1661
    .line 1662
    move-object/from16 v4, v30

    .line 1663
    .line 1664
    :cond_32
    invoke-static {v4}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 1665
    .line 1666
    .line 1667
    move-result-object v5

    .line 1668
    invoke-static/range {p1 .. p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1669
    .line 1670
    .line 1671
    move-result-object v4

    .line 1672
    check-cast v4, Ljava/lang/String;

    .line 1673
    .line 1674
    if-nez v4, :cond_33

    .line 1675
    .line 1676
    move-object/from16 v4, v30

    .line 1677
    .line 1678
    :cond_33
    invoke-static {v4}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 1679
    .line 1680
    .line 1681
    move-result-object v16

    .line 1682
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1683
    .line 1684
    move-object/from16 v19, v5

    .line 1685
    .line 1686
    sget-object v5, La/ujn;->h:Ljava/lang/String;

    .line 1687
    .line 1688
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1689
    .line 1690
    .line 1691
    if-eqz v36, :cond_34

    .line 1692
    .line 1693
    const-string v5, "static/img/ImgDefault/Esports/LoL/Previos_Maps_Tablet.png"

    .line 1694
    .line 1695
    goto :goto_2c

    .line 1696
    :cond_34
    const-string v5, "static/img/ImgDefault/Esports/LoL/Previos_Maps.png"

    .line 1697
    .line 1698
    :goto_2c
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 1699
    .line 1700
    .line 1701
    move-result v20

    .line 1702
    if-nez v20, :cond_35

    .line 1703
    .line 1704
    move-object/from16 v20, v7

    .line 1705
    .line 1706
    const/4 v7, 0x0

    .line 1707
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1708
    .line 1709
    .line 1710
    move-object v7, v4

    .line 1711
    move-object/from16 v38, v9

    .line 1712
    .line 1713
    goto :goto_30

    .line 1714
    :cond_35
    move-object/from16 v17, v4

    .line 1715
    .line 1716
    move-object/from16 v20, v7

    .line 1717
    .line 1718
    const/4 v7, 0x0

    .line 1719
    sget-object v4, La/ujn;->h:Ljava/lang/String;

    .line 1720
    .line 1721
    invoke-static {v5, v4, v7}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1722
    .line 1723
    .line 1724
    move-result v4

    .line 1725
    if-nez v4, :cond_38

    .line 1726
    .line 1727
    invoke-static {v5, v15, v7}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1728
    .line 1729
    .line 1730
    move-result v21

    .line 1731
    move-object/from16 v7, v17

    .line 1732
    .line 1733
    if-eqz v21, :cond_36

    .line 1734
    .line 1735
    const/4 v4, 0x0

    .line 1736
    :goto_2d
    move-object/from16 v38, v9

    .line 1737
    .line 1738
    goto :goto_2f

    .line 1739
    :cond_36
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->length()I

    .line 1740
    .line 1741
    .line 1742
    move-result v17

    .line 1743
    if-lez v17, :cond_37

    .line 1744
    .line 1745
    invoke-static {v7, v8}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 1746
    .line 1747
    .line 1748
    move-result v17

    .line 1749
    if-nez v17, :cond_37

    .line 1750
    .line 1751
    const/16 v4, 0x2f

    .line 1752
    .line 1753
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1754
    .line 1755
    .line 1756
    move/from16 v29, v4

    .line 1757
    .line 1758
    move-object/from16 v38, v9

    .line 1759
    .line 1760
    const/4 v4, 0x1

    .line 1761
    goto :goto_2e

    .line 1762
    :cond_37
    move-object/from16 v38, v9

    .line 1763
    .line 1764
    const/4 v4, 0x1

    .line 1765
    const/16 v29, 0x2f

    .line 1766
    .line 1767
    :goto_2e
    new-array v9, v4, [C

    .line 1768
    .line 1769
    const/4 v4, 0x0

    .line 1770
    aput-char v29, v9, v4

    .line 1771
    .line 1772
    invoke-static {v5, v9}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 1773
    .line 1774
    .line 1775
    move-result-object v5

    .line 1776
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1777
    .line 1778
    .line 1779
    goto :goto_30

    .line 1780
    :cond_38
    move v4, v7

    .line 1781
    move-object/from16 v7, v17

    .line 1782
    .line 1783
    goto :goto_2d

    .line 1784
    :goto_2f
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1785
    .line 1786
    .line 1787
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1788
    .line 1789
    .line 1790
    :goto_30
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1791
    .line 1792
    .line 1793
    move-result-object v21

    .line 1794
    sget-object v5, La/zf90;->a:La/zf90;

    .line 1795
    .line 1796
    if-ne v14, v5, :cond_39

    .line 1797
    .line 1798
    sget-object v5, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 1799
    .line 1800
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/StaticColors;->getGamesTextVictory-0d7_KjU()J

    .line 1801
    .line 1802
    .line 1803
    move-result-wide v22

    .line 1804
    goto :goto_31

    .line 1805
    :cond_39
    sget-object v5, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 1806
    .line 1807
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite80-0d7_KjU()J

    .line 1808
    .line 1809
    .line 1810
    move-result-wide v22

    .line 1811
    :goto_31
    sget-object v7, La/zf90;->b:La/zf90;

    .line 1812
    .line 1813
    if-ne v14, v7, :cond_3a

    .line 1814
    .line 1815
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/StaticColors;->getGamesTextVictory-0d7_KjU()J

    .line 1816
    .line 1817
    .line 1818
    move-result-wide v39

    .line 1819
    goto :goto_32

    .line 1820
    :cond_3a
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite80-0d7_KjU()J

    .line 1821
    .line 1822
    .line 1823
    move-result-wide v39

    .line 1824
    :goto_32
    iget v5, v13, La/cah;->c:I

    .line 1825
    .line 1826
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1827
    .line 1828
    .line 1829
    move-result-object v5

    .line 1830
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 1831
    .line 1832
    .line 1833
    move-result-object v5

    .line 1834
    const/4 v7, 0x1

    .line 1835
    invoke-static {v5, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1836
    .line 1837
    .line 1838
    move-result-object v5

    .line 1839
    const v7, 0x7f13071d

    .line 1840
    .line 1841
    .line 1842
    invoke-virtual {v0, v7, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1843
    .line 1844
    .line 1845
    move-result-object v5

    .line 1846
    iget v7, v13, La/cah;->a:I

    .line 1847
    .line 1848
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1849
    .line 1850
    .line 1851
    move-result-object v7

    .line 1852
    iget v9, v13, La/cah;->b:I

    .line 1853
    .line 1854
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1855
    .line 1856
    .line 1857
    move-result-object v9

    .line 1858
    const-string v14, " : "

    .line 1859
    .line 1860
    invoke-static {v7, v14, v9}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1861
    .line 1862
    .line 1863
    move-result-object v7

    .line 1864
    iget v9, v13, La/cah;->c:I

    .line 1865
    .line 1866
    move-object v13, v12

    .line 1867
    new-instance v12, La/xls;

    .line 1868
    .line 1869
    move/from16 v24, v9

    .line 1870
    .line 1871
    move-object/from16 v17, v16

    .line 1872
    .line 1873
    move-object/from16 v14, v20

    .line 1874
    .line 1875
    move-wide/from16 v54, v22

    .line 1876
    .line 1877
    move-object/from16 v22, v5

    .line 1878
    .line 1879
    move-object/from16 v23, v7

    .line 1880
    .line 1881
    move-object v5, v13

    .line 1882
    move-object v7, v15

    .line 1883
    move-object/from16 v13, v19

    .line 1884
    .line 1885
    move-wide/from16 v15, v54

    .line 1886
    .line 1887
    move-wide/from16 v19, v39

    .line 1888
    .line 1889
    invoke-direct/range {v12 .. v25}, La/xls;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V

    .line 1890
    .line 1891
    .line 1892
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1893
    .line 1894
    .line 1895
    move-object v12, v5

    .line 1896
    move-object v15, v7

    .line 1897
    move/from16 v5, v36

    .line 1898
    .line 1899
    move-object/from16 v7, v37

    .line 1900
    .line 1901
    move-object/from16 v9, v38

    .line 1902
    .line 1903
    goto/16 :goto_26

    .line 1904
    .line 1905
    :cond_3b
    move-object/from16 v37, v7

    .line 1906
    .line 1907
    move-object/from16 v38, v9

    .line 1908
    .line 1909
    move-object v5, v12

    .line 1910
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1911
    .line 1912
    .line 1913
    move-result v4

    .line 1914
    if-eqz v4, :cond_3c

    .line 1915
    .line 1916
    goto :goto_33

    .line 1917
    :cond_3c
    new-instance v4, La/psv;

    .line 1918
    .line 1919
    const-string v7, "PREVIOUS_MAPS_HEADER"

    .line 1920
    .line 1921
    const v8, 0x7f130ff8

    .line 1922
    .line 1923
    .line 1924
    invoke-direct {v4, v7, v8}, La/psv;-><init>(Ljava/lang/String;I)V

    .line 1925
    .line 1926
    .line 1927
    invoke-virtual {v2, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1928
    .line 1929
    .line 1930
    new-instance v4, La/hvb0;

    .line 1931
    .line 1932
    invoke-static {v6}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1933
    .line 1934
    .line 1935
    move-result-object v6

    .line 1936
    invoke-direct {v4, v6}, La/hvb0;-><init>(La/a4x;)V

    .line 1937
    .line 1938
    .line 1939
    invoke-virtual {v2, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1940
    .line 1941
    .line 1942
    :goto_33
    move-object/from16 v16, p1

    .line 1943
    .line 1944
    move-object/from16 v30, v0

    .line 1945
    .line 1946
    :goto_34
    move-object v6, v5

    .line 1947
    move-object/from16 p1, v11

    .line 1948
    .line 1949
    goto/16 :goto_23

    .line 1950
    .line 1951
    :pswitch_7
    move-object/from16 v31, v2

    .line 1952
    .line 1953
    move-object/from16 v34, v5

    .line 1954
    .line 1955
    move-object/from16 v38, v9

    .line 1956
    .line 1957
    move-object/from16 v33, v10

    .line 1958
    .line 1959
    move-object/from16 v32, v12

    .line 1960
    .line 1961
    move-object/from16 v37, v13

    .line 1962
    .line 1963
    move-object v2, v14

    .line 1964
    move-object/from16 v5, v20

    .line 1965
    .line 1966
    invoke-static {v3}, La/idx;->G(La/o310;)Z

    .line 1967
    .line 1968
    .line 1969
    move-result v6

    .line 1970
    if-eqz v6, :cond_3d

    .line 1971
    .line 1972
    move-object/from16 v8, v34

    .line 1973
    .line 1974
    goto/16 :goto_3a

    .line 1975
    .line 1976
    :cond_3d
    new-instance v6, La/psv;

    .line 1977
    .line 1978
    const-string v7, "GRAPH_HEADER"

    .line 1979
    .line 1980
    const v8, 0x7f13099e

    .line 1981
    .line 1982
    .line 1983
    invoke-direct {v6, v7, v8}, La/psv;-><init>(Ljava/lang/String;I)V

    .line 1984
    .line 1985
    .line 1986
    invoke-virtual {v2, v6}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1987
    .line 1988
    .line 1989
    new-instance v6, La/boo0;

    .line 1990
    .line 1991
    new-instance v18, La/fyl;

    .line 1992
    .line 1993
    new-instance v39, La/lxl;

    .line 1994
    .line 1995
    new-instance v7, La/ggh;

    .line 1996
    .line 1997
    invoke-direct {v7}, La/ggh;-><init>()V

    .line 1998
    .line 1999
    .line 2000
    new-instance v7, La/xxl;

    .line 2001
    .line 2002
    new-instance v8, La/ggh;

    .line 2003
    .line 2004
    invoke-direct {v8}, La/ggh;-><init>()V

    .line 2005
    .line 2006
    .line 2007
    const/4 v4, 0x0

    .line 2008
    new-array v8, v4, [Ljava/lang/Object;

    .line 2009
    .line 2010
    invoke-static {v8, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2011
    .line 2012
    .line 2013
    move-result-object v8

    .line 2014
    const v15, 0x7f130619

    .line 2015
    .line 2016
    .line 2017
    invoke-virtual {v0, v15, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2018
    .line 2019
    .line 2020
    move-result-object v8

    .line 2021
    invoke-direct {v7, v8}, La/xxl;-><init>(Ljava/lang/String;)V

    .line 2022
    .line 2023
    .line 2024
    sget-object v44, La/uxl;->b:La/uxl;

    .line 2025
    .line 2026
    const/16 v45, 0x0

    .line 2027
    .line 2028
    const/16 v46, 0x6c

    .line 2029
    .line 2030
    const-wide/16 v40, 0x15

    .line 2031
    .line 2032
    const/16 v43, 0x0

    .line 2033
    .line 2034
    move-object/from16 v42, v7

    .line 2035
    .line 2036
    invoke-direct/range {v39 .. v46}, La/lxl;-><init>(JLa/dyl;ZLa/uxl;La/cwl;I)V

    .line 2037
    .line 2038
    .line 2039
    filled-new-array/range {v39 .. v39}, [La/lxl;

    .line 2040
    .line 2041
    .line 2042
    move-result-object v7

    .line 2043
    invoke-static {v7}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 2044
    .line 2045
    .line 2046
    move-result-object v19

    .line 2047
    invoke-virtual {v5}, La/ctf0;->j()Z

    .line 2048
    .line 2049
    .line 2050
    move-result v7

    .line 2051
    invoke-static {v7}, La/xfn;->b(Z)La/wfn;

    .line 2052
    .line 2053
    .line 2054
    move-result-object v7

    .line 2055
    iget v7, v7, La/wfn;->e:F

    .line 2056
    .line 2057
    const/4 v8, 0x0

    .line 2058
    const/4 v9, 0x2

    .line 2059
    invoke-static {v7, v8, v9}, La/s5x0;->t(FFI)La/lh80;

    .line 2060
    .line 2061
    .line 2062
    move-result-object v22

    .line 2063
    new-instance v7, La/jyl;

    .line 2064
    .line 2065
    sget-wide v8, La/kkg;->h:J

    .line 2066
    .line 2067
    new-instance v10, La/y3d;

    .line 2068
    .line 2069
    invoke-direct {v10, v8, v9}, La/y3d;-><init>(J)V

    .line 2070
    .line 2071
    .line 2072
    const/16 v8, 0x7e

    .line 2073
    .line 2074
    const/4 v9, 0x0

    .line 2075
    invoke-direct {v7, v10, v9, v9, v8}, La/jyl;-><init>(La/y3d;La/y3d;La/y3d;I)V

    .line 2076
    .line 2077
    .line 2078
    const/16 v24, 0x6

    .line 2079
    .line 2080
    const/16 v20, 0x0

    .line 2081
    .line 2082
    const/16 v21, 0x0

    .line 2083
    .line 2084
    move-object/from16 v23, v7

    .line 2085
    .line 2086
    invoke-direct/range {v18 .. v24}, La/fyl;-><init>(La/a4x;La/tyl;La/syl;La/hh80;La/jyl;I)V

    .line 2087
    .line 2088
    .line 2089
    move-object/from16 v7, v18

    .line 2090
    .line 2091
    sget-object v8, La/pno0;->a:La/pno0;

    .line 2092
    .line 2093
    const-string v9, "GRAPH_TABS"

    .line 2094
    .line 2095
    invoke-direct {v6, v9, v7, v8}, La/boo0;-><init>(Ljava/lang/String;La/fyl;La/pno0;)V

    .line 2096
    .line 2097
    .line 2098
    invoke-virtual {v2, v6}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2099
    .line 2100
    .line 2101
    iget-object v6, v3, La/o310;->f:La/a610;

    .line 2102
    .line 2103
    iget-object v7, v3, La/o310;->g:La/a610;

    .line 2104
    .line 2105
    iget-object v8, v6, La/a610;->g:La/d310;

    .line 2106
    .line 2107
    iget-object v6, v6, La/a610;->i:Ljava/util/List;

    .line 2108
    .line 2109
    sget-object v9, La/d310;->c:La/d310;

    .line 2110
    .line 2111
    iget-object v7, v7, La/a610;->i:Ljava/util/List;

    .line 2112
    .line 2113
    if-ne v8, v9, :cond_3e

    .line 2114
    .line 2115
    move-object/from16 v8, v34

    .line 2116
    .line 2117
    const/4 v15, 0x1

    .line 2118
    invoke-static {v8, v15}, La/vcc;->R(La/m9s;Z)La/kiq;

    .line 2119
    .line 2120
    .line 2121
    move-result-object v9

    .line 2122
    const/4 v4, 0x0

    .line 2123
    invoke-static {v8, v4}, La/vcc;->S(La/m9s;Z)La/kiq;

    .line 2124
    .line 2125
    .line 2126
    move-result-object v10

    .line 2127
    :goto_35
    move-object/from16 v21, v9

    .line 2128
    .line 2129
    move-object/from16 v22, v10

    .line 2130
    .line 2131
    goto :goto_36

    .line 2132
    :cond_3e
    move-object/from16 v8, v34

    .line 2133
    .line 2134
    const/4 v4, 0x0

    .line 2135
    const/4 v15, 0x1

    .line 2136
    invoke-static {v8, v15}, La/vcc;->S(La/m9s;Z)La/kiq;

    .line 2137
    .line 2138
    .line 2139
    move-result-object v9

    .line 2140
    invoke-static {v8, v4}, La/vcc;->R(La/m9s;Z)La/kiq;

    .line 2141
    .line 2142
    .line 2143
    move-result-object v10

    .line 2144
    move-object/from16 v21, v7

    .line 2145
    .line 2146
    move-object v7, v6

    .line 2147
    move-object/from16 v6, v21

    .line 2148
    .line 2149
    goto :goto_35

    .line 2150
    :goto_36
    new-instance v18, La/liq;

    .line 2151
    .line 2152
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2153
    .line 2154
    .line 2155
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2156
    .line 2157
    .line 2158
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 2159
    .line 2160
    .line 2161
    move-result v9

    .line 2162
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 2163
    .line 2164
    .line 2165
    move-result v10

    .line 2166
    if-eq v9, v10, :cond_3f

    .line 2167
    .line 2168
    sget-object v4, La/lak0;->c:La/lak0;

    .line 2169
    .line 2170
    :goto_37
    move-object/from16 v20, v4

    .line 2171
    .line 2172
    goto :goto_39

    .line 2173
    :cond_3f
    new-instance v9, Ljava/util/ArrayList;

    .line 2174
    .line 2175
    const/16 v10, 0xa

    .line 2176
    .line 2177
    invoke-static {v6, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2178
    .line 2179
    .line 2180
    move-result v10

    .line 2181
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 2182
    .line 2183
    .line 2184
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2185
    .line 2186
    .line 2187
    move-result-object v6

    .line 2188
    const/4 v4, 0x0

    .line 2189
    :goto_38
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 2190
    .line 2191
    .line 2192
    move-result v10

    .line 2193
    if-eqz v10, :cond_41

    .line 2194
    .line 2195
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2196
    .line 2197
    .line 2198
    move-result-object v10

    .line 2199
    add-int/lit8 v12, v4, 0x1

    .line 2200
    .line 2201
    if-ltz v4, :cond_40

    .line 2202
    .line 2203
    check-cast v10, La/a010;

    .line 2204
    .line 2205
    iget v13, v10, La/a010;->a:I

    .line 2206
    .line 2207
    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2208
    .line 2209
    .line 2210
    move-result-object v4

    .line 2211
    check-cast v4, La/a010;

    .line 2212
    .line 2213
    iget v4, v4, La/a010;->a:I

    .line 2214
    .line 2215
    sub-int/2addr v13, v4

    .line 2216
    new-instance v4, La/miq;

    .line 2217
    .line 2218
    iget-wide v14, v10, La/a010;->b:J

    .line 2219
    .line 2220
    invoke-direct {v4, v13, v14, v15}, La/miq;-><init>(IJ)V

    .line 2221
    .line 2222
    .line 2223
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2224
    .line 2225
    .line 2226
    move v4, v12

    .line 2227
    goto :goto_38

    .line 2228
    :cond_40
    invoke-static {}, La/q3d;->p()V

    .line 2229
    .line 2230
    .line 2231
    const/16 v27, 0x0

    .line 2232
    .line 2233
    throw v27

    .line 2234
    :cond_41
    invoke-static {v9}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 2235
    .line 2236
    .line 2237
    move-result-object v4

    .line 2238
    goto :goto_37

    .line 2239
    :goto_39
    sget-object v23, La/wev;->a:La/wev;

    .line 2240
    .line 2241
    const-string v19, "GRAPH"

    .line 2242
    .line 2243
    invoke-direct/range {v18 .. v23}, La/liq;-><init>(Ljava/lang/String;La/i4;La/kiq;La/kiq;La/wev;)V

    .line 2244
    .line 2245
    .line 2246
    move-object/from16 v4, v18

    .line 2247
    .line 2248
    invoke-virtual {v2, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2249
    .line 2250
    .line 2251
    :goto_3a
    move-object/from16 v16, p1

    .line 2252
    .line 2253
    move-object/from16 v30, v0

    .line 2254
    .line 2255
    :goto_3b
    move-object v6, v5

    .line 2256
    move-object v5, v8

    .line 2257
    move-object/from16 p1, v11

    .line 2258
    .line 2259
    goto/16 :goto_55

    .line 2260
    .line 2261
    :pswitch_8
    move-object/from16 v31, v2

    .line 2262
    .line 2263
    move-object v8, v5

    .line 2264
    move-object/from16 v38, v9

    .line 2265
    .line 2266
    move-object/from16 v33, v10

    .line 2267
    .line 2268
    move-object/from16 v32, v12

    .line 2269
    .line 2270
    move-object/from16 v37, v13

    .line 2271
    .line 2272
    move-object v2, v14

    .line 2273
    move-object/from16 v5, v20

    .line 2274
    .line 2275
    invoke-static {v3}, La/idx;->F(La/o310;)Z

    .line 2276
    .line 2277
    .line 2278
    move-result v6

    .line 2279
    if-eqz v6, :cond_42

    .line 2280
    .line 2281
    move-object/from16 v30, v0

    .line 2282
    .line 2283
    goto/16 :goto_3f

    .line 2284
    .line 2285
    :cond_42
    sget-object v6, La/d310;->c:La/d310;

    .line 2286
    .line 2287
    invoke-static {v8, v6, v3}, La/w510;->a(La/m9s;La/d310;La/o310;)La/b610;

    .line 2288
    .line 2289
    .line 2290
    move-result-object v6

    .line 2291
    sget-object v7, La/d310;->b:La/d310;

    .line 2292
    .line 2293
    invoke-static {v8, v7, v3}, La/w510;->a(La/m9s;La/d310;La/o310;)La/b610;

    .line 2294
    .line 2295
    .line 2296
    move-result-object v7

    .line 2297
    new-instance v9, La/psv;

    .line 2298
    .line 2299
    const-string v10, "GAME_LOG_HEADER"

    .line 2300
    .line 2301
    const v12, 0x7f13057e

    .line 2302
    .line 2303
    .line 2304
    invoke-direct {v9, v10, v12}, La/psv;-><init>(Ljava/lang/String;I)V

    .line 2305
    .line 2306
    .line 2307
    invoke-virtual {v2, v9}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2308
    .line 2309
    .line 2310
    iget-object v9, v3, La/o310;->q:Ljava/util/List;

    .line 2311
    .line 2312
    new-instance v10, Ljava/util/ArrayList;

    .line 2313
    .line 2314
    const/16 v12, 0xa

    .line 2315
    .line 2316
    invoke-static {v9, v12}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2317
    .line 2318
    .line 2319
    move-result v12

    .line 2320
    invoke-direct {v10, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 2321
    .line 2322
    .line 2323
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2324
    .line 2325
    .line 2326
    move-result-object v9

    .line 2327
    :goto_3c
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 2328
    .line 2329
    .line 2330
    move-result v12

    .line 2331
    if-eqz v12, :cond_45

    .line 2332
    .line 2333
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2334
    .line 2335
    .line 2336
    move-result-object v12

    .line 2337
    check-cast v12, La/xz00;

    .line 2338
    .line 2339
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2340
    .line 2341
    .line 2342
    iget-object v13, v12, La/xz00;->c:La/d310;

    .line 2343
    .line 2344
    iget-object v14, v12, La/xz00;->d:La/qz00;

    .line 2345
    .line 2346
    sget-object v15, La/d310;->b:La/d310;

    .line 2347
    .line 2348
    invoke-static {v13, v14, v15}, La/vfc;->G(La/d310;La/qz00;La/d310;)I

    .line 2349
    .line 2350
    .line 2351
    move-result v17

    .line 2352
    sget-object v4, La/d310;->c:La/d310;

    .line 2353
    .line 2354
    invoke-static {v13, v14, v4}, La/vfc;->G(La/d310;La/qz00;La/d310;)I

    .line 2355
    .line 2356
    .line 2357
    move-result v18

    .line 2358
    new-instance v16, La/bls;

    .line 2359
    .line 2360
    move-object/from16 v30, v0

    .line 2361
    .line 2362
    iget v0, v12, La/xz00;->a:I

    .line 2363
    .line 2364
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 2365
    .line 2366
    .line 2367
    move-result-object v19

    .line 2368
    iget-object v0, v12, La/xz00;->b:La/pz00;

    .line 2369
    .line 2370
    invoke-static {v13, v0, v14, v15, v5}, La/vfc;->F(La/d310;La/pz00;La/qz00;La/d310;La/ctf0;)Ljava/lang/String;

    .line 2371
    .line 2372
    .line 2373
    move-result-object v20

    .line 2374
    invoke-static {v13, v0, v14, v4, v5}, La/vfc;->F(La/d310;La/pz00;La/qz00;La/d310;La/ctf0;)Ljava/lang/String;

    .line 2375
    .line 2376
    .line 2377
    move-result-object v21

    .line 2378
    if-eqz v17, :cond_43

    .line 2379
    .line 2380
    const/16 v22, 0x1

    .line 2381
    .line 2382
    goto :goto_3d

    .line 2383
    :cond_43
    const/16 v22, 0x0

    .line 2384
    .line 2385
    :goto_3d
    if-eqz v18, :cond_44

    .line 2386
    .line 2387
    const/16 v23, 0x1

    .line 2388
    .line 2389
    goto :goto_3e

    .line 2390
    :cond_44
    const/16 v23, 0x0

    .line 2391
    .line 2392
    :goto_3e
    invoke-direct/range {v16 .. v23}, La/bls;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 2393
    .line 2394
    .line 2395
    move-object/from16 v0, v16

    .line 2396
    .line 2397
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2398
    .line 2399
    .line 2400
    move-object/from16 v0, v30

    .line 2401
    .line 2402
    goto :goto_3c

    .line 2403
    :cond_45
    move-object/from16 v30, v0

    .line 2404
    .line 2405
    invoke-static {v10}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 2406
    .line 2407
    .line 2408
    move-result-object v0

    .line 2409
    new-instance v4, La/pls;

    .line 2410
    .line 2411
    invoke-direct {v4, v6, v7, v0}, La/pls;-><init>(La/b610;La/b610;La/i4;)V

    .line 2412
    .line 2413
    .line 2414
    invoke-virtual {v2, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2415
    .line 2416
    .line 2417
    :goto_3f
    move-object/from16 v16, p1

    .line 2418
    .line 2419
    goto/16 :goto_3b

    .line 2420
    .line 2421
    :pswitch_9
    move-object/from16 v30, v0

    .line 2422
    .line 2423
    move-object/from16 v31, v2

    .line 2424
    .line 2425
    move-object v8, v5

    .line 2426
    move-object/from16 v38, v9

    .line 2427
    .line 2428
    move-object/from16 v33, v10

    .line 2429
    .line 2430
    move-object/from16 v32, v12

    .line 2431
    .line 2432
    move-object/from16 v37, v13

    .line 2433
    .line 2434
    move-object v2, v14

    .line 2435
    move-object/from16 v5, v20

    .line 2436
    .line 2437
    iget-object v0, v3, La/o310;->p:Ljava/util/List;

    .line 2438
    .line 2439
    iget-object v4, v3, La/o310;->o:Ljava/util/List;

    .line 2440
    .line 2441
    iget-object v6, v3, La/o310;->l:La/zz00;

    .line 2442
    .line 2443
    sget-object v7, La/d310;->b:La/d310;

    .line 2444
    .line 2445
    iget-object v9, v3, La/o310;->f:La/a610;

    .line 2446
    .line 2447
    iget-object v9, v9, La/a610;->g:La/d310;

    .line 2448
    .line 2449
    if-ne v9, v7, :cond_46

    .line 2450
    .line 2451
    move-object v10, v4

    .line 2452
    goto :goto_40

    .line 2453
    :cond_46
    move-object v10, v0

    .line 2454
    :goto_40
    sget-object v12, La/d310;->c:La/d310;

    .line 2455
    .line 2456
    if-ne v9, v12, :cond_47

    .line 2457
    .line 2458
    move-object v0, v4

    .line 2459
    :cond_47
    invoke-static {v10, v0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 2460
    .line 2461
    .line 2462
    move-result-object v4

    .line 2463
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2464
    .line 2465
    .line 2466
    move-result v4

    .line 2467
    if-nez v4, :cond_48

    .line 2468
    .line 2469
    sget-object v4, La/zz00;->e:La/zz00;

    .line 2470
    .line 2471
    if-ne v6, v4, :cond_49

    .line 2472
    .line 2473
    :cond_48
    move-object/from16 v34, v8

    .line 2474
    .line 2475
    goto/16 :goto_45

    .line 2476
    .line 2477
    :cond_49
    invoke-static {v8, v7, v3}, La/w510;->a(La/m9s;La/d310;La/o310;)La/b610;

    .line 2478
    .line 2479
    .line 2480
    move-result-object v4

    .line 2481
    invoke-static {v8, v12, v3}, La/w510;->a(La/m9s;La/d310;La/o310;)La/b610;

    .line 2482
    .line 2483
    .line 2484
    move-result-object v6

    .line 2485
    new-instance v7, Ljava/util/ArrayList;

    .line 2486
    .line 2487
    invoke-direct {v7, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 2488
    .line 2489
    .line 2490
    new-instance v9, Ljava/util/ArrayList;

    .line 2491
    .line 2492
    invoke-direct {v9, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 2493
    .line 2494
    .line 2495
    move-object/from16 v0, v33

    .line 2496
    .line 2497
    iget v10, v0, La/mz00;->a:I

    .line 2498
    .line 2499
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 2500
    .line 2501
    .line 2502
    move-result v12

    .line 2503
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 2504
    .line 2505
    .line 2506
    move-result v13

    .line 2507
    invoke-static {v12, v13}, Ljava/lang/Math;->max(II)I

    .line 2508
    .line 2509
    .line 2510
    move-result v12

    .line 2511
    const/4 v13, 0x0

    .line 2512
    :goto_41
    if-ge v13, v12, :cond_4c

    .line 2513
    .line 2514
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 2515
    .line 2516
    .line 2517
    move-result v14

    .line 2518
    if-ge v13, v14, :cond_4b

    .line 2519
    .line 2520
    mul-int/lit8 v14, v13, 0x2

    .line 2521
    .line 2522
    const/4 v15, 0x1

    .line 2523
    add-int/2addr v14, v15

    .line 2524
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 2525
    .line 2526
    .line 2527
    move-result v15

    .line 2528
    if-le v14, v15, :cond_4a

    .line 2529
    .line 2530
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2531
    .line 2532
    .line 2533
    move-result-object v14

    .line 2534
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2535
    .line 2536
    .line 2537
    goto :goto_42

    .line 2538
    :cond_4a
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2539
    .line 2540
    .line 2541
    move-result-object v15

    .line 2542
    invoke-virtual {v9, v14, v15}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 2543
    .line 2544
    .line 2545
    :cond_4b
    :goto_42
    add-int/lit8 v13, v13, 0x1

    .line 2546
    .line 2547
    goto :goto_41

    .line 2548
    :cond_4c
    iget-object v6, v6, La/b610;->b:Ljava/lang/String;

    .line 2549
    .line 2550
    invoke-static {v6}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 2551
    .line 2552
    .line 2553
    move-result-object v6

    .line 2554
    iget-object v4, v4, La/b610;->b:Ljava/lang/String;

    .line 2555
    .line 2556
    invoke-static {v4}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 2557
    .line 2558
    .line 2559
    move-result-object v4

    .line 2560
    new-instance v7, Ljava/util/ArrayList;

    .line 2561
    .line 2562
    const/16 v12, 0xa

    .line 2563
    .line 2564
    invoke-static {v9, v12}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2565
    .line 2566
    .line 2567
    move-result v12

    .line 2568
    invoke-direct {v7, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 2569
    .line 2570
    .line 2571
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2572
    .line 2573
    .line 2574
    move-result-object v12

    .line 2575
    const/4 v13, 0x0

    .line 2576
    :goto_43
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 2577
    .line 2578
    .line 2579
    move-result v14

    .line 2580
    if-eqz v14, :cond_4e

    .line 2581
    .line 2582
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2583
    .line 2584
    .line 2585
    move-result-object v14

    .line 2586
    add-int/lit8 v15, v13, 0x1

    .line 2587
    .line 2588
    if-ltz v13, :cond_4d

    .line 2589
    .line 2590
    check-cast v14, La/gah;

    .line 2591
    .line 2592
    new-instance v13, La/ko5;

    .line 2593
    .line 2594
    move-object/from16 v33, v0

    .line 2595
    .line 2596
    const-string v0, "BAN_PICKS_HERO"

    .line 2597
    .line 2598
    invoke-static {v15, v0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 2599
    .line 2600
    .line 2601
    move-result-object v0

    .line 2602
    move-object/from16 v34, v8

    .line 2603
    .line 2604
    iget-object v8, v14, La/gah;->d:Ljava/lang/String;

    .line 2605
    .line 2606
    move-object/from16 v16, v9

    .line 2607
    .line 2608
    invoke-static {v15}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 2609
    .line 2610
    .line 2611
    move-result-object v9

    .line 2612
    iget-boolean v14, v14, La/gah;->a:Z

    .line 2613
    .line 2614
    invoke-direct {v13, v0, v8, v9, v14}, La/ko5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2615
    .line 2616
    .line 2617
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2618
    .line 2619
    .line 2620
    move v13, v15

    .line 2621
    move-object/from16 v9, v16

    .line 2622
    .line 2623
    move-object/from16 v0, v33

    .line 2624
    .line 2625
    move-object/from16 v8, v34

    .line 2626
    .line 2627
    goto :goto_43

    .line 2628
    :cond_4d
    invoke-static {}, La/q3d;->p()V

    .line 2629
    .line 2630
    .line 2631
    const/16 v27, 0x0

    .line 2632
    .line 2633
    throw v27

    .line 2634
    :cond_4e
    move-object/from16 v33, v0

    .line 2635
    .line 2636
    move-object/from16 v34, v8

    .line 2637
    .line 2638
    move-object/from16 v16, v9

    .line 2639
    .line 2640
    invoke-static {v7}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 2641
    .line 2642
    .line 2643
    move-result-object v0

    .line 2644
    invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->size()I

    .line 2645
    .line 2646
    .line 2647
    move-result v7

    .line 2648
    if-le v7, v10, :cond_4f

    .line 2649
    .line 2650
    const/4 v7, 0x1

    .line 2651
    goto :goto_44

    .line 2652
    :cond_4f
    const/4 v7, 0x0

    .line 2653
    :goto_44
    new-instance v8, La/lo5;

    .line 2654
    .line 2655
    invoke-direct {v8, v0, v6, v4, v7}, La/lo5;-><init>(La/a4x;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2656
    .line 2657
    .line 2658
    new-instance v0, La/psv;

    .line 2659
    .line 2660
    const-string v4, "BAN_PICKS_HEADER"

    .line 2661
    .line 2662
    const v6, 0x7f13021b

    .line 2663
    .line 2664
    .line 2665
    invoke-direct {v0, v4, v6}, La/psv;-><init>(Ljava/lang/String;I)V

    .line 2666
    .line 2667
    .line 2668
    invoke-virtual {v2, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2669
    .line 2670
    .line 2671
    invoke-virtual {v2, v8}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2672
    .line 2673
    .line 2674
    :goto_45
    move-object/from16 v16, p1

    .line 2675
    .line 2676
    goto/16 :goto_34

    .line 2677
    .line 2678
    :pswitch_a
    move-object/from16 v30, v0

    .line 2679
    .line 2680
    move-object/from16 v31, v2

    .line 2681
    .line 2682
    move-object/from16 v34, v5

    .line 2683
    .line 2684
    move-object/from16 v38, v9

    .line 2685
    .line 2686
    move-object/from16 v33, v10

    .line 2687
    .line 2688
    move-object/from16 v32, v12

    .line 2689
    .line 2690
    move-object/from16 v37, v13

    .line 2691
    .line 2692
    move-object v2, v14

    .line 2693
    move-object/from16 v5, v20

    .line 2694
    .line 2695
    iget-wide v6, v11, La/g310;->a:J

    .line 2696
    .line 2697
    iget-object v0, v3, La/o310;->i:Ljava/util/List;

    .line 2698
    .line 2699
    iget-object v4, v3, La/o310;->h:Ljava/util/List;

    .line 2700
    .line 2701
    sget-object v8, La/d310;->c:La/d310;

    .line 2702
    .line 2703
    iget-object v9, v3, La/o310;->f:La/a610;

    .line 2704
    .line 2705
    iget-object v9, v9, La/a610;->g:La/d310;

    .line 2706
    .line 2707
    if-ne v9, v8, :cond_50

    .line 2708
    .line 2709
    move-object v8, v4

    .line 2710
    goto :goto_46

    .line 2711
    :cond_50
    move-object v8, v4

    .line 2712
    move-object v4, v0

    .line 2713
    :goto_46
    sget-object v10, La/d310;->b:La/d310;

    .line 2714
    .line 2715
    if-ne v9, v10, :cond_51

    .line 2716
    .line 2717
    move-object v0, v8

    .line 2718
    :cond_51
    sget-object v8, La/w510;->a:Ljava/util/List;

    .line 2719
    .line 2720
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2721
    .line 2722
    .line 2723
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2724
    .line 2725
    .line 2726
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2727
    .line 2728
    .line 2729
    new-instance v9, La/wvv;

    .line 2730
    .line 2731
    const/4 v13, 0x0

    .line 2732
    invoke-direct {v9, v4, v0, v13}, La/wvv;-><init>(Ljava/util/List;Ljava/util/List;B)V

    .line 2733
    .line 2734
    .line 2735
    invoke-static {v8, v9}, La/ewm0;->s(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/ArrayList;

    .line 2736
    .line 2737
    .line 2738
    move-result-object v8

    .line 2739
    invoke-static {v6, v7, v8}, La/ewm0;->t(JLjava/util/List;)La/aco0;

    .line 2740
    .line 2741
    .line 2742
    move-result-object v6

    .line 2743
    sget-wide v17, La/kkg;->h:J

    .line 2744
    .line 2745
    sget-object v19, La/pno0;->b:La/pno0;

    .line 2746
    .line 2747
    invoke-virtual {v5}, La/ctf0;->j()Z

    .line 2748
    .line 2749
    .line 2750
    move-result v20

    .line 2751
    new-instance v7, La/v510;

    .line 2752
    .line 2753
    invoke-direct {v7, v5, v13}, La/v510;-><init>(La/ctf0;B)V

    .line 2754
    .line 2755
    .line 2756
    const-string v14, "STAT_INFO_TABS"

    .line 2757
    .line 2758
    move-object v15, v6

    .line 2759
    move-object/from16 v21, v7

    .line 2760
    .line 2761
    move-object/from16 v16, v8

    .line 2762
    .line 2763
    invoke-static/range {v14 .. v21}, La/qem0;->k(Ljava/lang/String;La/aco0;Ljava/util/List;JLa/pno0;ZLkotlin/jvm/functions/Function1;)La/boo0;

    .line 2764
    .line 2765
    .line 2766
    move-result-object v10

    .line 2767
    sget-object v7, La/amo0;->a:La/amo0;

    .line 2768
    .line 2769
    const/4 v9, 0x1

    .line 2770
    move-object/from16 v13, p1

    .line 2771
    .line 2772
    move-object v8, v5

    .line 2773
    move-object/from16 v12, v26

    .line 2774
    .line 2775
    move-object/from16 v5, v34

    .line 2776
    .line 2777
    invoke-static/range {v3 .. v9}, La/wdx;->K(La/o310;Ljava/util/List;La/m9s;La/aco0;La/amo0;La/ctf0;Z)La/jlo0;

    .line 2778
    .line 2779
    .line 2780
    move-result-object v14

    .line 2781
    move-object v6, v8

    .line 2782
    sget-object v7, La/amo0;->b:La/amo0;

    .line 2783
    .line 2784
    const/4 v9, 0x0

    .line 2785
    move-object v4, v0

    .line 2786
    move-object v6, v15

    .line 2787
    invoke-static/range {v3 .. v9}, La/wdx;->K(La/o310;Ljava/util/List;La/m9s;La/aco0;La/amo0;La/ctf0;Z)La/jlo0;

    .line 2788
    .line 2789
    .line 2790
    move-result-object v0

    .line 2791
    move-object v6, v8

    .line 2792
    if-eqz v14, :cond_53

    .line 2793
    .line 2794
    if-eqz v0, :cond_53

    .line 2795
    .line 2796
    iget-object v4, v3, La/o310;->l:La/zz00;

    .line 2797
    .line 2798
    sget-object v7, La/zz00;->e:La/zz00;

    .line 2799
    .line 2800
    if-ne v4, v7, :cond_52

    .line 2801
    .line 2802
    goto :goto_47

    .line 2803
    :cond_52
    invoke-virtual {v2, v10}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2804
    .line 2805
    .line 2806
    invoke-virtual {v2, v14}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2807
    .line 2808
    .line 2809
    invoke-virtual {v2, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2810
    .line 2811
    .line 2812
    :cond_53
    :goto_47
    move-object/from16 p1, v11

    .line 2813
    .line 2814
    move-object/from16 v26, v12

    .line 2815
    .line 2816
    :goto_48
    move-object/from16 v16, v13

    .line 2817
    .line 2818
    goto/16 :goto_55

    .line 2819
    .line 2820
    :pswitch_b
    move-object/from16 v30, v0

    .line 2821
    .line 2822
    move-object/from16 v31, v2

    .line 2823
    .line 2824
    move-object/from16 v38, v9

    .line 2825
    .line 2826
    move-object/from16 v33, v10

    .line 2827
    .line 2828
    move-object/from16 v32, v12

    .line 2829
    .line 2830
    move-object/from16 v37, v13

    .line 2831
    .line 2832
    move-object v2, v14

    .line 2833
    move-object/from16 v6, v20

    .line 2834
    .line 2835
    move-object/from16 v12, v26

    .line 2836
    .line 2837
    const/4 v4, 0x0

    .line 2838
    move-object/from16 v13, p1

    .line 2839
    .line 2840
    invoke-static {v2, v1, v5, v6, v4}, La/n8n0;->g(La/lc00;La/k4h;La/m9s;La/ctf0;Z)V

    .line 2841
    .line 2842
    .line 2843
    move-object/from16 p1, v11

    .line 2844
    .line 2845
    goto :goto_48

    .line 2846
    :pswitch_c
    move-object/from16 v30, v0

    .line 2847
    .line 2848
    move-object/from16 v31, v2

    .line 2849
    .line 2850
    move-object/from16 v38, v9

    .line 2851
    .line 2852
    move-object/from16 v33, v10

    .line 2853
    .line 2854
    move-object/from16 v32, v12

    .line 2855
    .line 2856
    move-object/from16 v37, v13

    .line 2857
    .line 2858
    move-object v2, v14

    .line 2859
    move-object v7, v15

    .line 2860
    move-object/from16 v6, v20

    .line 2861
    .line 2862
    move-object/from16 v12, v26

    .line 2863
    .line 2864
    move-object/from16 v13, p1

    .line 2865
    .line 2866
    invoke-static {v3}, La/idx;->I(La/o310;)Z

    .line 2867
    .line 2868
    .line 2869
    move-result v0

    .line 2870
    iget-wide v9, v3, La/o310;->b:J

    .line 2871
    .line 2872
    if-eqz v0, :cond_54

    .line 2873
    .line 2874
    move-object/from16 v34, v5

    .line 2875
    .line 2876
    move-object/from16 p1, v11

    .line 2877
    .line 2878
    move-object/from16 v26, v12

    .line 2879
    .line 2880
    move-object/from16 v16, v13

    .line 2881
    .line 2882
    goto/16 :goto_23

    .line 2883
    .line 2884
    :cond_54
    sget-object v0, La/k3m0;->a:Lkotlin/ranges/IntRange;

    .line 2885
    .line 2886
    iget-wide v14, v3, La/o310;->n:J

    .line 2887
    .line 2888
    move-object/from16 v34, v5

    .line 2889
    .line 2890
    iget-wide v4, v3, La/o310;->a:J

    .line 2891
    .line 2892
    move-object/from16 p1, v11

    .line 2893
    .line 2894
    move-object/from16 v26, v12

    .line 2895
    .line 2896
    const-wide/16 v11, 0x0

    .line 2897
    .line 2898
    cmp-long v0, v4, v11

    .line 2899
    .line 2900
    if-nez v0, :cond_55

    .line 2901
    .line 2902
    cmp-long v16, v9, v11

    .line 2903
    .line 2904
    if-eqz v16, :cond_56

    .line 2905
    .line 2906
    :cond_55
    move-wide/from16 v18, v11

    .line 2907
    .line 2908
    goto :goto_4a

    .line 2909
    :cond_56
    sget-object v4, La/lak0;->c:La/lak0;

    .line 2910
    .line 2911
    move/from16 v16, v0

    .line 2912
    .line 2913
    move-wide/from16 v18, v11

    .line 2914
    .line 2915
    :goto_49
    move-object/from16 v40, v4

    .line 2916
    .line 2917
    goto :goto_4c

    .line 2918
    :goto_4a
    sget-object v11, La/d310;->c:La/d310;

    .line 2919
    .line 2920
    invoke-static {v11}, La/k3m0;->b(La/d310;)La/lc00;

    .line 2921
    .line 2922
    .line 2923
    move-result-object v12

    .line 2924
    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->I(Ljava/lang/Iterable;)La/sx3;

    .line 2925
    .line 2926
    .line 2927
    move-result-object v12

    .line 2928
    move/from16 v16, v0

    .line 2929
    .line 2930
    invoke-static {v9, v10, v11}, La/k3m0;->c(JLa/d310;)La/lc00;

    .line 2931
    .line 2932
    .line 2933
    move-result-object v0

    .line 2934
    invoke-static {v12, v0}, La/pgi0;->s(Lkotlin/sequences/Sequence;Ljava/util/List;)La/ckq;

    .line 2935
    .line 2936
    .line 2937
    move-result-object v0

    .line 2938
    invoke-static {v4, v5, v11}, La/k3m0;->i(JLa/d310;)La/lc00;

    .line 2939
    .line 2940
    .line 2941
    move-result-object v11

    .line 2942
    invoke-static {v0, v11}, La/pgi0;->s(Lkotlin/sequences/Sequence;Ljava/util/List;)La/ckq;

    .line 2943
    .line 2944
    .line 2945
    move-result-object v0

    .line 2946
    sget-object v11, La/d310;->b:La/d310;

    .line 2947
    .line 2948
    invoke-static {v4, v5, v11}, La/k3m0;->i(JLa/d310;)La/lc00;

    .line 2949
    .line 2950
    .line 2951
    move-result-object v4

    .line 2952
    invoke-static {v0, v4}, La/pgi0;->s(Lkotlin/sequences/Sequence;Ljava/util/List;)La/ckq;

    .line 2953
    .line 2954
    .line 2955
    move-result-object v0

    .line 2956
    invoke-static {v9, v10, v11}, La/k3m0;->c(JLa/d310;)La/lc00;

    .line 2957
    .line 2958
    .line 2959
    move-result-object v4

    .line 2960
    invoke-static {v0, v4}, La/pgi0;->s(Lkotlin/sequences/Sequence;Ljava/util/List;)La/ckq;

    .line 2961
    .line 2962
    .line 2963
    move-result-object v0

    .line 2964
    invoke-static {v11}, La/k3m0;->b(La/d310;)La/lc00;

    .line 2965
    .line 2966
    .line 2967
    move-result-object v4

    .line 2968
    invoke-static {v0, v4}, La/pgi0;->s(Lkotlin/sequences/Sequence;Ljava/util/List;)La/ckq;

    .line 2969
    .line 2970
    .line 2971
    move-result-object v0

    .line 2972
    sget-object v4, La/lak0;->c:La/lak0;

    .line 2973
    .line 2974
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2975
    .line 2976
    .line 2977
    invoke-virtual {v4}, La/lak0;->g()La/hi90;

    .line 2978
    .line 2979
    .line 2980
    move-result-object v4

    .line 2981
    new-instance v5, La/bkq;

    .line 2982
    .line 2983
    invoke-direct {v5, v0}, La/bkq;-><init>(La/ckq;)V

    .line 2984
    .line 2985
    .line 2986
    :goto_4b
    invoke-virtual {v5}, La/bkq;->hasNext()Z

    .line 2987
    .line 2988
    .line 2989
    move-result v0

    .line 2990
    if-eqz v0, :cond_57

    .line 2991
    .line 2992
    invoke-virtual {v5}, La/bkq;->next()Ljava/lang/Object;

    .line 2993
    .line 2994
    .line 2995
    move-result-object v0

    .line 2996
    invoke-virtual {v4, v0}, La/hi90;->add(Ljava/lang/Object;)Z

    .line 2997
    .line 2998
    .line 2999
    goto :goto_4b

    .line 3000
    :cond_57
    invoke-virtual {v4}, La/hi90;->f()La/i4;

    .line 3001
    .line 3002
    .line 3003
    move-result-object v4

    .line 3004
    goto :goto_49

    .line 3005
    :goto_4c
    sget-object v0, La/d310;->b:La/d310;

    .line 3006
    .line 3007
    move-object/from16 v5, v34

    .line 3008
    .line 3009
    invoke-static {v5, v0, v3}, La/k3m0;->h(La/m9s;La/d310;La/o310;)La/z510;

    .line 3010
    .line 3011
    .line 3012
    move-result-object v41

    .line 3013
    sget-object v0, La/d310;->c:La/d310;

    .line 3014
    .line 3015
    invoke-static {v5, v0, v3}, La/k3m0;->h(La/m9s;La/d310;La/o310;)La/z510;

    .line 3016
    .line 3017
    .line 3018
    move-result-object v42

    .line 3019
    iget-wide v11, v3, La/o310;->a:J

    .line 3020
    .line 3021
    move-wide/from16 v20, v9

    .line 3022
    .line 3023
    iget-wide v9, v3, La/o310;->b:J

    .line 3024
    .line 3025
    move-wide/from16 v45, v9

    .line 3026
    .line 3027
    iget-wide v9, v3, La/o310;->n:J

    .line 3028
    .line 3029
    sget-object v49, La/k3m0;->b:Lkotlin/ranges/IntRange;

    .line 3030
    .line 3031
    move-wide/from16 v47, v9

    .line 3032
    .line 3033
    iget-wide v9, v3, La/o310;->m:J

    .line 3034
    .line 3035
    move-wide/from16 v50, v9

    .line 3036
    .line 3037
    move-wide/from16 v43, v11

    .line 3038
    .line 3039
    invoke-static/range {v43 .. v51}, La/k3m0;->e(JJJLkotlin/ranges/IntRange;J)I

    .line 3040
    .line 3041
    .line 3042
    move-result v44

    .line 3043
    iget-wide v9, v3, La/o310;->a:J

    .line 3044
    .line 3045
    iget-wide v11, v3, La/o310;->b:J

    .line 3046
    .line 3047
    move-wide/from16 v45, v9

    .line 3048
    .line 3049
    iget-wide v9, v3, La/o310;->n:J

    .line 3050
    .line 3051
    sget-object v51, La/k3m0;->a:Lkotlin/ranges/IntRange;

    .line 3052
    .line 3053
    move-wide/from16 v49, v9

    .line 3054
    .line 3055
    iget-wide v9, v3, La/o310;->m:J

    .line 3056
    .line 3057
    move-wide/from16 v52, v9

    .line 3058
    .line 3059
    move-wide/from16 v47, v11

    .line 3060
    .line 3061
    invoke-static/range {v45 .. v53}, La/k3m0;->e(JJJLkotlin/ranges/IntRange;J)I

    .line 3062
    .line 3063
    .line 3064
    move-result v45

    .line 3065
    cmp-long v0, v20, v18

    .line 3066
    .line 3067
    if-nez v0, :cond_58

    .line 3068
    .line 3069
    if-nez v16, :cond_58

    .line 3070
    .line 3071
    new-instance v0, La/m0x;

    .line 3072
    .line 3073
    const v4, 0x7f0803c7

    .line 3074
    .line 3075
    .line 3076
    const/4 v7, 0x6

    .line 3077
    const/4 v9, 0x0

    .line 3078
    invoke-direct {v0, v4, v9, v7}, La/m0x;-><init>(ILa/bzw;I)V

    .line 3079
    .line 3080
    .line 3081
    const/4 v4, 0x0

    .line 3082
    :goto_4d
    move-object/from16 v43, v0

    .line 3083
    .line 3084
    goto :goto_52

    .line 3085
    :cond_58
    const/4 v9, 0x0

    .line 3086
    new-instance v0, La/n0x;

    .line 3087
    .line 3088
    new-instance v10, Ljava/lang/StringBuilder;

    .line 3089
    .line 3090
    sget-object v4, La/ujn;->h:Ljava/lang/String;

    .line 3091
    .line 3092
    invoke-direct {v10, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3093
    .line 3094
    .line 3095
    sget-object v4, La/ujn;->h:Ljava/lang/String;

    .line 3096
    .line 3097
    const-string v11, "static/img/ImgDefault/Esports/LoL/Map.png"

    .line 3098
    .line 3099
    const/4 v12, 0x0

    .line 3100
    invoke-static {v11, v4, v12}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 3101
    .line 3102
    .line 3103
    move-result v4

    .line 3104
    if-nez v4, :cond_5b

    .line 3105
    .line 3106
    invoke-static {v11, v7, v12}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 3107
    .line 3108
    .line 3109
    move-result v7

    .line 3110
    if-eqz v7, :cond_59

    .line 3111
    .line 3112
    const/4 v4, 0x0

    .line 3113
    goto :goto_50

    .line 3114
    :cond_59
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->length()I

    .line 3115
    .line 3116
    .line 3117
    move-result v7

    .line 3118
    if-lez v7, :cond_5a

    .line 3119
    .line 3120
    invoke-static {v10, v8}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 3121
    .line 3122
    .line 3123
    move-result v7

    .line 3124
    if-nez v7, :cond_5a

    .line 3125
    .line 3126
    const/16 v7, 0x2f

    .line 3127
    .line 3128
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 3129
    .line 3130
    .line 3131
    :goto_4e
    const/4 v8, 0x1

    .line 3132
    goto :goto_4f

    .line 3133
    :cond_5a
    const/16 v7, 0x2f

    .line 3134
    .line 3135
    goto :goto_4e

    .line 3136
    :goto_4f
    new-array v12, v8, [C

    .line 3137
    .line 3138
    const/4 v4, 0x0

    .line 3139
    aput-char v7, v12, v4

    .line 3140
    .line 3141
    invoke-static {v11, v12}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 3142
    .line 3143
    .line 3144
    move-result-object v7

    .line 3145
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3146
    .line 3147
    .line 3148
    goto :goto_51

    .line 3149
    :cond_5b
    move v4, v12

    .line 3150
    :goto_50
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 3151
    .line 3152
    .line 3153
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3154
    .line 3155
    .line 3156
    :goto_51
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3157
    .line 3158
    .line 3159
    move-result-object v7

    .line 3160
    invoke-direct {v0, v7}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 3161
    .line 3162
    .line 3163
    goto :goto_4d

    .line 3164
    :goto_52
    new-instance v39, La/b110;

    .line 3165
    .line 3166
    invoke-direct/range {v39 .. v45}, La/b110;-><init>(La/i4;La/z510;La/z510;La/o0x;II)V

    .line 3167
    .line 3168
    .line 3169
    move-object/from16 v0, v39

    .line 3170
    .line 3171
    iget v7, v3, La/o310;->e:I

    .line 3172
    .line 3173
    int-to-long v7, v7

    .line 3174
    sget-object v10, La/k3m0;->c:Ljava/util/List;

    .line 3175
    .line 3176
    if-eqz v10, :cond_5d

    .line 3177
    .line 3178
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    .line 3179
    .line 3180
    .line 3181
    move-result v11

    .line 3182
    if-eqz v11, :cond_5d

    .line 3183
    .line 3184
    :cond_5c
    move v10, v4

    .line 3185
    goto :goto_53

    .line 3186
    :cond_5d
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3187
    .line 3188
    .line 3189
    move-result-object v10

    .line 3190
    :cond_5e
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 3191
    .line 3192
    .line 3193
    move-result v11

    .line 3194
    if-eqz v11, :cond_5c

    .line 3195
    .line 3196
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3197
    .line 3198
    .line 3199
    move-result-object v11

    .line 3200
    check-cast v11, La/oz00;

    .line 3201
    .line 3202
    iget-byte v11, v11, La/oz00;->a:B

    .line 3203
    .line 3204
    invoke-static {v11, v14, v15}, La/k3m0;->g(IJ)Z

    .line 3205
    .line 3206
    .line 3207
    move-result v11

    .line 3208
    if-eqz v11, :cond_5e

    .line 3209
    .line 3210
    const/4 v10, 0x1

    .line 3211
    :goto_53
    new-instance v11, La/hin0;

    .line 3212
    .line 3213
    const v12, 0x7f08073b

    .line 3214
    .line 3215
    .line 3216
    invoke-direct {v11, v12, v7, v8, v10}, La/hin0;-><init>(IJZ)V

    .line 3217
    .line 3218
    .line 3219
    new-instance v7, La/hin0;

    .line 3220
    .line 3221
    sget-object v8, La/oz00;->c:La/oz00;

    .line 3222
    .line 3223
    const/16 v8, 0x9

    .line 3224
    .line 3225
    invoke-static {v8, v14, v15}, La/k3m0;->g(IJ)Z

    .line 3226
    .line 3227
    .line 3228
    move-result v8

    .line 3229
    const v10, 0x7f080747

    .line 3230
    .line 3231
    .line 3232
    move-object/from16 v34, v5

    .line 3233
    .line 3234
    move-wide/from16 v4, v18

    .line 3235
    .line 3236
    invoke-direct {v7, v10, v4, v5, v8}, La/hin0;-><init>(IJZ)V

    .line 3237
    .line 3238
    .line 3239
    new-instance v4, La/hin0;

    .line 3240
    .line 3241
    iget v5, v3, La/o310;->d:I

    .line 3242
    .line 3243
    int-to-long v9, v5

    .line 3244
    const/4 v5, 0x7

    .line 3245
    invoke-static {v5, v14, v15}, La/k3m0;->g(IJ)Z

    .line 3246
    .line 3247
    .line 3248
    move-result v5

    .line 3249
    if-eqz v5, :cond_5f

    .line 3250
    .line 3251
    sget-object v5, La/k3m0;->d:Lkotlin/ranges/IntRange;

    .line 3252
    .line 3253
    iget v8, v5, Lkotlin/ranges/a;->a:I

    .line 3254
    .line 3255
    iget v5, v5, Lkotlin/ranges/a;->b:I

    .line 3256
    .line 3257
    move-object/from16 v16, v13

    .line 3258
    .line 3259
    iget-wide v12, v3, La/o310;->m:J

    .line 3260
    .line 3261
    move-wide/from16 v18, v12

    .line 3262
    .line 3263
    int-to-long v12, v8

    .line 3264
    cmp-long v8, v12, v18

    .line 3265
    .line 3266
    if-gtz v8, :cond_60

    .line 3267
    .line 3268
    int-to-long v12, v5

    .line 3269
    cmp-long v5, v18, v12

    .line 3270
    .line 3271
    if-gtz v5, :cond_60

    .line 3272
    .line 3273
    const/4 v5, 0x1

    .line 3274
    goto :goto_54

    .line 3275
    :cond_5f
    move-object/from16 v16, v13

    .line 3276
    .line 3277
    :cond_60
    const/4 v5, 0x0

    .line 3278
    :goto_54
    const v8, 0x7f08073d

    .line 3279
    .line 3280
    .line 3281
    invoke-direct {v4, v8, v9, v10, v5}, La/hin0;-><init>(IJZ)V

    .line 3282
    .line 3283
    .line 3284
    new-instance v5, La/hin0;

    .line 3285
    .line 3286
    iget v8, v3, La/o310;->c:I

    .line 3287
    .line 3288
    int-to-long v8, v8

    .line 3289
    const/16 v10, 0x8

    .line 3290
    .line 3291
    invoke-static {v10, v14, v15}, La/k3m0;->g(IJ)Z

    .line 3292
    .line 3293
    .line 3294
    move-result v10

    .line 3295
    const v12, 0x7f080738

    .line 3296
    .line 3297
    .line 3298
    invoke-direct {v5, v12, v8, v9, v10}, La/hin0;-><init>(IJZ)V

    .line 3299
    .line 3300
    .line 3301
    filled-new-array {v11, v7, v4, v5}, [La/hin0;

    .line 3302
    .line 3303
    .line 3304
    move-result-object v4

    .line 3305
    invoke-static {v4}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 3306
    .line 3307
    .line 3308
    move-result-object v4

    .line 3309
    new-instance v5, La/j3m0;

    .line 3310
    .line 3311
    invoke-direct {v5, v0, v4}, La/j3m0;-><init>(La/b110;Ljava/util/List;)V

    .line 3312
    .line 3313
    .line 3314
    invoke-virtual {v2, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3315
    .line 3316
    .line 3317
    goto/16 :goto_23

    .line 3318
    .line 3319
    :pswitch_d
    move-object/from16 v16, p1

    .line 3320
    .line 3321
    move-object/from16 v30, v0

    .line 3322
    .line 3323
    move-object/from16 v31, v2

    .line 3324
    .line 3325
    move-object/from16 v38, v9

    .line 3326
    .line 3327
    move-object/from16 v33, v10

    .line 3328
    .line 3329
    move-object/from16 p1, v11

    .line 3330
    .line 3331
    move-object/from16 v32, v12

    .line 3332
    .line 3333
    move-object/from16 v37, v13

    .line 3334
    .line 3335
    move-object v2, v14

    .line 3336
    move-object/from16 v6, v20

    .line 3337
    .line 3338
    const/4 v15, 0x1

    .line 3339
    invoke-static {v2, v1, v5, v6, v15}, La/n8n0;->g(La/lc00;La/k4h;La/m9s;La/ctf0;Z)V

    .line 3340
    .line 3341
    .line 3342
    goto :goto_55

    .line 3343
    :pswitch_e
    move-object/from16 v16, p1

    .line 3344
    .line 3345
    move-object/from16 v30, v0

    .line 3346
    .line 3347
    move-object/from16 v31, v2

    .line 3348
    .line 3349
    move-object/from16 v38, v9

    .line 3350
    .line 3351
    move-object/from16 v33, v10

    .line 3352
    .line 3353
    move-object/from16 p1, v11

    .line 3354
    .line 3355
    move-object/from16 v32, v12

    .line 3356
    .line 3357
    move-object/from16 v37, v13

    .line 3358
    .line 3359
    move-object v2, v14

    .line 3360
    move-object/from16 v6, v20

    .line 3361
    .line 3362
    invoke-static {v3}, La/idx;->J(La/o310;)Z

    .line 3363
    .line 3364
    .line 3365
    move-result v0

    .line 3366
    if-eqz v0, :cond_61

    .line 3367
    .line 3368
    goto :goto_55

    .line 3369
    :cond_61
    iget-object v4, v1, La/k4h;->c:La/y3h;

    .line 3370
    .line 3371
    new-instance v0, La/tlp0;

    .line 3372
    .line 3373
    const/4 v7, 0x1

    .line 3374
    const/4 v8, 0x1

    .line 3375
    invoke-static/range {v3 .. v8}, La/bcm0;->k(La/o310;La/y3h;La/m9s;La/ctf0;ZZ)La/ylp0;

    .line 3376
    .line 3377
    .line 3378
    move-result-object v9

    .line 3379
    const/4 v7, 0x0

    .line 3380
    invoke-static/range {v3 .. v8}, La/bcm0;->k(La/o310;La/y3h;La/m9s;La/ctf0;ZZ)La/ylp0;

    .line 3381
    .line 3382
    .line 3383
    move-result-object v4

    .line 3384
    invoke-direct {v0, v9, v4}, La/tlp0;-><init>(La/ylp0;La/ylp0;)V

    .line 3385
    .line 3386
    .line 3387
    invoke-virtual {v2, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3388
    .line 3389
    .line 3390
    :goto_55
    move-object/from16 v11, p1

    .line 3391
    .line 3392
    move-object v14, v2

    .line 3393
    move-object/from16 v20, v6

    .line 3394
    .line 3395
    move-object/from16 p1, v16

    .line 3396
    .line 3397
    move-object/from16 v0, v30

    .line 3398
    .line 3399
    move-object/from16 v2, v31

    .line 3400
    .line 3401
    move-object/from16 v12, v32

    .line 3402
    .line 3403
    move-object/from16 v10, v33

    .line 3404
    .line 3405
    move-object/from16 v13, v37

    .line 3406
    .line 3407
    move-object/from16 v9, v38

    .line 3408
    .line 3409
    goto/16 :goto_d

    .line 3410
    .line 3411
    :cond_62
    move-object v2, v14

    .line 3412
    move-object/from16 v6, v20

    .line 3413
    .line 3414
    iget-boolean v0, v1, La/k4h;->b:Z

    .line 3415
    .line 3416
    new-instance v1, Ljava/util/ArrayList;

    .line 3417
    .line 3418
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 3419
    .line 3420
    .line 3421
    iget v3, v5, La/m9s;->D:I

    .line 3422
    .line 3423
    if-lez v3, :cond_63

    .line 3424
    .line 3425
    if-eqz v0, :cond_63

    .line 3426
    .line 3427
    invoke-static {v6}, La/feb;->K(La/ctf0;)La/rx;

    .line 3428
    .line 3429
    .line 3430
    move-result-object v3

    .line 3431
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3432
    .line 3433
    .line 3434
    :cond_63
    if-eqz v0, :cond_64

    .line 3435
    .line 3436
    move-object/from16 v12, v26

    .line 3437
    .line 3438
    invoke-static {v6, v12}, La/n7x;->w(La/ctf0;Ljava/util/List;)La/rx;

    .line 3439
    .line 3440
    .line 3441
    move-result-object v0

    .line 3442
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3443
    .line 3444
    .line 3445
    :cond_64
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 3446
    .line 3447
    .line 3448
    move-result v0

    .line 3449
    if-eqz v0, :cond_65

    .line 3450
    .line 3451
    goto :goto_56

    .line 3452
    :cond_65
    new-instance v0, La/psv;

    .line 3453
    .line 3454
    const-string v3, "ADDITIONAL_INFO_HEADER"

    .line 3455
    .line 3456
    const v4, 0x7f13006f

    .line 3457
    .line 3458
    .line 3459
    invoke-direct {v0, v3, v4}, La/psv;-><init>(Ljava/lang/String;I)V

    .line 3460
    .line 3461
    .line 3462
    invoke-virtual {v2, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3463
    .line 3464
    .line 3465
    new-instance v0, La/wy;

    .line 3466
    .line 3467
    const-string v3, "ADDITIONAL_INFO"

    .line 3468
    .line 3469
    invoke-static {v1}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 3470
    .line 3471
    .line 3472
    move-result-object v1

    .line 3473
    invoke-direct {v0, v1, v3}, La/wy;-><init>(La/i4;Ljava/lang/String;)V

    .line 3474
    .line 3475
    .line 3476
    invoke-virtual {v2, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3477
    .line 3478
    .line 3479
    :goto_56
    invoke-static {v2}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 3480
    .line 3481
    .line 3482
    move-result-object v0

    .line 3483
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 3484
    .line 3485
    .line 3486
    move-result-object v2

    .line 3487
    goto :goto_57

    .line 3488
    :cond_66
    sget-object v2, La/lak0;->c:La/lak0;

    .line 3489
    .line 3490
    :goto_57
    return-object v2

    .line 3491
    :pswitch_f
    move-object/from16 v1, p1

    .line 3492
    .line 3493
    check-cast v1, La/fee;

    .line 3494
    .line 3495
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3496
    .line 3497
    .line 3498
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 3499
    .line 3500
    .line 3501
    move-result-object v1

    .line 3502
    move-object v2, v1

    .line 3503
    check-cast v2, La/jlr;

    .line 3504
    .line 3505
    iget-object v1, v0, La/v6o;->g:La/n0o0;

    .line 3506
    .line 3507
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3508
    .line 3509
    .line 3510
    move-result-object v1

    .line 3511
    check-cast v1, La/fee;

    .line 3512
    .line 3513
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 3514
    .line 3515
    .line 3516
    move-result-object v1

    .line 3517
    check-cast v1, Ljava/lang/Boolean;

    .line 3518
    .line 3519
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 3520
    .line 3521
    .line 3522
    move-result v3

    .line 3523
    iget-object v1, v0, La/v6o;->D:Ljava/lang/Object;

    .line 3524
    .line 3525
    check-cast v1, La/m310;

    .line 3526
    .line 3527
    iget-object v4, v1, La/m310;->r:La/sff0;

    .line 3528
    .line 3529
    iget-boolean v4, v4, La/sff0;->J:Z

    .line 3530
    .line 3531
    iget-object v5, v0, La/v6o;->m:La/n0o0;

    .line 3532
    .line 3533
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3534
    .line 3535
    .line 3536
    move-result-object v5

    .line 3537
    check-cast v5, La/fee;

    .line 3538
    .line 3539
    invoke-virtual {v5}, La/fee;->c()Ljava/lang/Object;

    .line 3540
    .line 3541
    .line 3542
    move-result-object v5

    .line 3543
    check-cast v5, Ljava/lang/Boolean;

    .line 3544
    .line 3545
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 3546
    .line 3547
    .line 3548
    move-result v5

    .line 3549
    iget-object v6, v0, La/v6o;->n:La/n0o0;

    .line 3550
    .line 3551
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3552
    .line 3553
    .line 3554
    move-result-object v6

    .line 3555
    check-cast v6, La/fee;

    .line 3556
    .line 3557
    invoke-virtual {v6}, La/fee;->c()Ljava/lang/Object;

    .line 3558
    .line 3559
    .line 3560
    move-result-object v6

    .line 3561
    check-cast v6, Ljava/lang/Boolean;

    .line 3562
    .line 3563
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 3564
    .line 3565
    .line 3566
    move-result v6

    .line 3567
    iget-boolean v7, v1, La/m310;->u:Z

    .line 3568
    .line 3569
    iget-object v0, v0, La/v6o;->l:La/n0o0;

    .line 3570
    .line 3571
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3572
    .line 3573
    .line 3574
    move-result-object v0

    .line 3575
    check-cast v0, La/fee;

    .line 3576
    .line 3577
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 3578
    .line 3579
    .line 3580
    move-result-object v0

    .line 3581
    move-object v8, v0

    .line 3582
    check-cast v8, La/yws;

    .line 3583
    .line 3584
    invoke-static/range {v2 .. v8}, La/ulb;->j0(La/jlr;ZZZZZLa/yws;)La/its;

    .line 3585
    .line 3586
    .line 3587
    move-result-object v0

    .line 3588
    return-object v0

    .line 3589
    :pswitch_10
    move-object/from16 v1, p1

    .line 3590
    .line 3591
    check-cast v1, La/fee;

    .line 3592
    .line 3593
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3594
    .line 3595
    .line 3596
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 3597
    .line 3598
    .line 3599
    move-result-object v1

    .line 3600
    check-cast v1, La/jlr;

    .line 3601
    .line 3602
    invoke-static {v1}, La/d5c;->C(La/jlr;)La/m9s;

    .line 3603
    .line 3604
    .line 3605
    move-result-object v2

    .line 3606
    iget-object v5, v0, La/v6o;->b:La/ctf0;

    .line 3607
    .line 3608
    iget-object v1, v0, La/v6o;->D:Ljava/lang/Object;

    .line 3609
    .line 3610
    check-cast v1, La/m310;

    .line 3611
    .line 3612
    if-eqz v2, :cond_68

    .line 3613
    .line 3614
    iget-object v3, v0, La/v6o;->e:La/n0o0;

    .line 3615
    .line 3616
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3617
    .line 3618
    .line 3619
    move-result-object v3

    .line 3620
    check-cast v3, La/fee;

    .line 3621
    .line 3622
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 3623
    .line 3624
    .line 3625
    move-result-object v3

    .line 3626
    check-cast v3, La/k4h;

    .line 3627
    .line 3628
    if-eqz v3, :cond_67

    .line 3629
    .line 3630
    invoke-static {v3, v2}, La/thb;->Y(La/k4h;La/m9s;)La/la30;

    .line 3631
    .line 3632
    .line 3633
    move-result-object v3

    .line 3634
    goto :goto_58

    .line 3635
    :cond_67
    const/4 v3, 0x0

    .line 3636
    :goto_58
    move-object v6, v3

    .line 3637
    goto :goto_59

    .line 3638
    :cond_68
    const/4 v6, 0x0

    .line 3639
    :goto_59
    iget-object v3, v0, La/v6o;->g:La/n0o0;

    .line 3640
    .line 3641
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3642
    .line 3643
    .line 3644
    move-result-object v3

    .line 3645
    check-cast v3, La/fee;

    .line 3646
    .line 3647
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 3648
    .line 3649
    .line 3650
    move-result-object v3

    .line 3651
    check-cast v3, Ljava/lang/Boolean;

    .line 3652
    .line 3653
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 3654
    .line 3655
    .line 3656
    move-result v7

    .line 3657
    iget-object v3, v0, La/v6o;->j:La/n0o0;

    .line 3658
    .line 3659
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3660
    .line 3661
    .line 3662
    move-result-object v3

    .line 3663
    check-cast v3, La/fee;

    .line 3664
    .line 3665
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 3666
    .line 3667
    .line 3668
    move-result-object v3

    .line 3669
    move-object v8, v3

    .line 3670
    check-cast v8, Ljava/util/List;

    .line 3671
    .line 3672
    iget-boolean v9, v1, La/m310;->y:Z

    .line 3673
    .line 3674
    iget-object v0, v0, La/v6o;->f:La/n0o0;

    .line 3675
    .line 3676
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3677
    .line 3678
    .line 3679
    move-result-object v0

    .line 3680
    check-cast v0, La/fee;

    .line 3681
    .line 3682
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 3683
    .line 3684
    .line 3685
    move-result-object v0

    .line 3686
    check-cast v0, La/ypl0;

    .line 3687
    .line 3688
    iget-object v0, v0, La/ypl0;->c:La/lel0;

    .line 3689
    .line 3690
    iget-object v11, v0, La/lel0;->a:Ljava/lang/String;

    .line 3691
    .line 3692
    iget-object v0, v1, La/m310;->a:Lorg/xplatform/cyber/game/lol/api/LolScreenParams;

    .line 3693
    .line 3694
    iget-object v12, v0, Lorg/xplatform/cyber/game/lol/api/LolScreenParams;->g:Ljava/lang/String;

    .line 3695
    .line 3696
    const/4 v3, 0x0

    .line 3697
    const/4 v4, 0x0

    .line 3698
    const/4 v10, 0x1

    .line 3699
    invoke-static/range {v2 .. v12}, La/hkb;->P(La/m9s;ZZLa/ctf0;La/la30;ZLjava/util/List;ZZLjava/lang/String;Ljava/lang/String;)La/zqg;

    .line 3700
    .line 3701
    .line 3702
    move-result-object v0

    .line 3703
    return-object v0

    .line 3704
    :pswitch_11
    move-object/from16 v1, p1

    .line 3705
    .line 3706
    check-cast v1, La/fee;

    .line 3707
    .line 3708
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3709
    .line 3710
    .line 3711
    new-instance v1, La/avs;

    .line 3712
    .line 3713
    iget-object v2, v0, La/v6o;->k:La/n0o0;

    .line 3714
    .line 3715
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3716
    .line 3717
    .line 3718
    move-result-object v2

    .line 3719
    check-cast v2, La/fee;

    .line 3720
    .line 3721
    iget-object v2, v2, La/fee;->d:La/pz40;

    .line 3722
    .line 3723
    iget-object v3, v0, La/v6o;->o:La/n0o0;

    .line 3724
    .line 3725
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3726
    .line 3727
    .line 3728
    move-result-object v3

    .line 3729
    check-cast v3, La/fee;

    .line 3730
    .line 3731
    iget-object v3, v3, La/fee;->d:La/pz40;

    .line 3732
    .line 3733
    iget-object v4, v0, La/v6o;->h:La/n0o0;

    .line 3734
    .line 3735
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3736
    .line 3737
    .line 3738
    move-result-object v4

    .line 3739
    check-cast v4, La/fee;

    .line 3740
    .line 3741
    iget-object v4, v4, La/fee;->d:La/pz40;

    .line 3742
    .line 3743
    iget-object v0, v0, La/v6o;->i:La/n0o0;

    .line 3744
    .line 3745
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3746
    .line 3747
    .line 3748
    move-result-object v0

    .line 3749
    check-cast v0, La/fee;

    .line 3750
    .line 3751
    iget-object v0, v0, La/fee;->d:La/pz40;

    .line 3752
    .line 3753
    invoke-direct {v1, v2, v3, v4, v0}, La/avs;-><init>(La/l7m0;La/l7m0;La/l7m0;La/l7m0;)V

    .line 3754
    .line 3755
    .line 3756
    return-object v1

    .line 3757
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 3758
    .line 3759
    .line 3760
    .line 3761
    .line 3762
    .line 3763
    .line 3764
    .line 3765
    .line 3766
    .line 3767
    .line 3768
    .line 3769
    .line 3770
    .line 3771
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_e
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
    .end packed-switch
.end method
