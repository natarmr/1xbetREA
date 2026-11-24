.class public final synthetic La/y0e0;
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
    iput-byte p2, p0, La/y0e0;->a:B

    iput-object p1, p0, La/y0e0;->b:La/v6o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 44

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/y0e0;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/y0e0;->b:La/v6o;

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
    check-cast v2, La/qyd0;

    .line 34
    .line 35
    iget-object v2, v2, La/qyd0;->t:La/sff0;

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
    sget-object v4, La/pb10;->y:La/pb10;

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
    const-wide/16 v6, 0xf

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
    sget-object v4, La/pb10;->y:La/pb10;

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
    if-eqz v3, :cond_79

    .line 345
    .line 346
    check-cast v1, La/xkr;

    .line 347
    .line 348
    iget-object v1, v1, La/xkr;->d:La/m9s;

    .line 349
    .line 350
    iget-object v3, v0, La/v6o;->e:La/n0o0;

    .line 351
    .line 352
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v3

    .line 356
    check-cast v3, La/fee;

    .line 357
    .line 358
    iget-object v7, v0, La/v6o;->b:La/ctf0;

    .line 359
    .line 360
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v3

    .line 364
    check-cast v3, La/vvd0;

    .line 365
    .line 366
    iget-object v4, v0, La/v6o;->r:La/n0o0;

    .line 367
    .line 368
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v4

    .line 372
    check-cast v4, La/fee;

    .line 373
    .line 374
    invoke-virtual {v4}, La/fee;->c()Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v4

    .line 378
    move-object v13, v4

    .line 379
    check-cast v13, La/rud0;

    .line 380
    .line 381
    iget-object v4, v0, La/v6o;->s:La/n0o0;

    .line 382
    .line 383
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v4

    .line 387
    check-cast v4, La/fee;

    .line 388
    .line 389
    invoke-virtual {v4}, La/fee;->c()Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v4

    .line 393
    move-object v14, v4

    .line 394
    check-cast v14, La/ixd0;

    .line 395
    .line 396
    iget-object v4, v0, La/v6o;->q:La/n0o0;

    .line 397
    .line 398
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v4

    .line 402
    check-cast v4, La/fee;

    .line 403
    .line 404
    invoke-virtual {v4}, La/fee;->c()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v4

    .line 408
    move-object v15, v4

    .line 409
    check-cast v15, Ljava/util/List;

    .line 410
    .line 411
    invoke-virtual {v7}, La/ctf0;->j()Z

    .line 412
    .line 413
    .line 414
    move-result v11

    .line 415
    iget-object v4, v0, La/v6o;->l:La/n0o0;

    .line 416
    .line 417
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v4

    .line 421
    check-cast v4, La/fee;

    .line 422
    .line 423
    invoke-virtual {v4}, La/fee;->c()Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v4

    .line 427
    check-cast v4, La/yws;

    .line 428
    .line 429
    iget-object v0, v0, La/v6o;->D:Ljava/lang/Object;

    .line 430
    .line 431
    check-cast v0, La/qyd0;

    .line 432
    .line 433
    iget-boolean v9, v0, La/qyd0;->A:Z

    .line 434
    .line 435
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    iget-object v0, v1, La/m9s;->n:Ljava/util/List;

    .line 439
    .line 440
    iget-object v12, v1, La/m9s;->m:Ljava/util/List;

    .line 441
    .line 442
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 443
    .line 444
    .line 445
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 452
    .line 453
    .line 454
    if-nez v3, :cond_8

    .line 455
    .line 456
    sget-object v2, La/lak0;->c:La/lak0;

    .line 457
    .line 458
    goto/16 :goto_53

    .line 459
    .line 460
    :cond_8
    iget-object v5, v3, La/vvd0;->c:La/ljg;

    .line 461
    .line 462
    iget-object v6, v3, La/vvd0;->a:La/bvd0;

    .line 463
    .line 464
    iget-object v8, v6, La/bvd0;->c:La/myd0;

    .line 465
    .line 466
    iget-object v10, v6, La/bvd0;->a:La/ivd0;

    .line 467
    .line 468
    const/16 v25, 0x0

    .line 469
    .line 470
    iget-object v2, v6, La/bvd0;->b:La/ivd0;

    .line 471
    .line 472
    move-object/from16 v24, v8

    .line 473
    .line 474
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 475
    .line 476
    .line 477
    move-result-object v8

    .line 478
    if-eqz v4, :cond_9

    .line 479
    .line 480
    iget-boolean v4, v4, La/yws;->c:Z

    .line 481
    .line 482
    if-nez v4, :cond_9

    .line 483
    .line 484
    goto :goto_2

    .line 485
    :cond_9
    new-instance v4, La/kxs;

    .line 486
    .line 487
    invoke-direct {v4}, La/kxs;-><init>()V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v8, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 491
    .line 492
    .line 493
    :goto_2
    new-instance v4, Ljava/util/ArrayList;

    .line 494
    .line 495
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 496
    .line 497
    .line 498
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 499
    .line 500
    .line 501
    move-result-object v16

    .line 502
    :goto_3
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 503
    .line 504
    .line 505
    move-result v17

    .line 506
    if-eqz v17, :cond_b

    .line 507
    .line 508
    move-object/from16 p0, v0

    .line 509
    .line 510
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    move-object/from16 p1, v6

    .line 515
    .line 516
    move-object v6, v0

    .line 517
    check-cast v6, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;

    .line 518
    .line 519
    iget-boolean v6, v6, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;->c:Z

    .line 520
    .line 521
    if-eqz v6, :cond_a

    .line 522
    .line 523
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 524
    .line 525
    .line 526
    :cond_a
    move-object/from16 v0, p0

    .line 527
    .line 528
    move-object/from16 v6, p1

    .line 529
    .line 530
    goto :goto_3

    .line 531
    :cond_b
    move-object/from16 p0, v0

    .line 532
    .line 533
    move-object/from16 p1, v6

    .line 534
    .line 535
    new-instance v0, La/lk30;

    .line 536
    .line 537
    const/16 v6, 0x15

    .line 538
    .line 539
    invoke-direct {v0, v6}, La/lk30;-><init>(B)V

    .line 540
    .line 541
    .line 542
    invoke-static {v4, v0}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    new-instance v4, Ljava/util/ArrayList;

    .line 547
    .line 548
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 549
    .line 550
    .line 551
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 556
    .line 557
    .line 558
    move-result v6

    .line 559
    if-eqz v6, :cond_f

    .line 560
    .line 561
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v6

    .line 565
    check-cast v6, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;

    .line 566
    .line 567
    sget-object v16, La/ryd0;->c:La/c0o;

    .line 568
    .line 569
    invoke-virtual/range {v16 .. v16}, La/b3;->iterator()Ljava/util/Iterator;

    .line 570
    .line 571
    .line 572
    move-result-object v16

    .line 573
    :goto_5
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 574
    .line 575
    .line 576
    move-result v17

    .line 577
    if-eqz v17, :cond_d

    .line 578
    .line 579
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object v17

    .line 583
    move-object/from16 v18, v0

    .line 584
    .line 585
    move-object/from16 v0, v17

    .line 586
    .line 587
    check-cast v0, La/ryd0;

    .line 588
    .line 589
    iget-object v0, v0, La/ryd0;->a:La/t9m0;

    .line 590
    .line 591
    move-object/from16 v26, v8

    .line 592
    .line 593
    iget-object v8, v6, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;->a:La/t9m0;

    .line 594
    .line 595
    if-ne v0, v8, :cond_c

    .line 596
    .line 597
    goto :goto_6

    .line 598
    :cond_c
    move-object/from16 v0, v18

    .line 599
    .line 600
    move-object/from16 v8, v26

    .line 601
    .line 602
    goto :goto_5

    .line 603
    :cond_d
    move-object/from16 v18, v0

    .line 604
    .line 605
    move-object/from16 v26, v8

    .line 606
    .line 607
    move-object/from16 v17, v25

    .line 608
    .line 609
    :goto_6
    move-object/from16 v0, v17

    .line 610
    .line 611
    check-cast v0, La/ryd0;

    .line 612
    .line 613
    if-eqz v0, :cond_e

    .line 614
    .line 615
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 616
    .line 617
    .line 618
    :cond_e
    move-object/from16 v0, v18

    .line 619
    .line 620
    move-object/from16 v8, v26

    .line 621
    .line 622
    goto :goto_4

    .line 623
    :cond_f
    move-object/from16 v26, v8

    .line 624
    .line 625
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 630
    .line 631
    .line 632
    move-result v4

    .line 633
    if-eqz v4, :cond_75

    .line 634
    .line 635
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v4

    .line 639
    check-cast v4, La/ryd0;

    .line 640
    .line 641
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 642
    .line 643
    .line 644
    move-result v4

    .line 645
    const-string v6, "https://"

    .line 646
    .line 647
    const-string v8, "/"

    .line 648
    .line 649
    const-string v27, ""

    .line 650
    .line 651
    packed-switch v4, :pswitch_data_1

    .line 652
    .line 653
    .line 654
    invoke-static {}, La/t9f;->b()V

    .line 655
    .line 656
    .line 657
    :goto_8
    move-object/from16 v2, v25

    .line 658
    .line 659
    goto/16 :goto_53

    .line 660
    .line 661
    :pswitch_2
    move v4, v9

    .line 662
    iget-wide v8, v14, La/ixd0;->d:J

    .line 663
    .line 664
    iget-boolean v6, v14, La/ixd0;->e:Z

    .line 665
    .line 666
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 667
    .line 668
    .line 669
    invoke-static {v5, v1}, La/x2x;->b0(La/ljg;La/m9s;)Z

    .line 670
    .line 671
    .line 672
    move-result v16

    .line 673
    if-eqz v16, :cond_10

    .line 674
    .line 675
    move-object/from16 v28, v0

    .line 676
    .line 677
    goto :goto_9

    .line 678
    :cond_10
    move-object/from16 v28, v0

    .line 679
    .line 680
    sget-object v0, La/n2z;->a:Ljava/util/List;

    .line 681
    .line 682
    invoke-static {v5, v0}, La/n2z;->a(La/ljg;Ljava/util/List;)Ljava/util/ArrayList;

    .line 683
    .line 684
    .line 685
    move-result-object v0

    .line 686
    invoke-static {v8, v9, v0}, La/n2z;->d(JLjava/util/ArrayList;)La/l2z;

    .line 687
    .line 688
    .line 689
    move-result-object v18

    .line 690
    if-nez v18, :cond_11

    .line 691
    .line 692
    :goto_9
    move-object/from16 v30, v5

    .line 693
    .line 694
    move/from16 v18, v11

    .line 695
    .line 696
    move-object/from16 v19, v12

    .line 697
    .line 698
    move-object/from16 v29, v15

    .line 699
    .line 700
    move-object/from16 v11, v26

    .line 701
    .line 702
    move-object v15, v10

    .line 703
    move-object/from16 v26, v24

    .line 704
    .line 705
    move/from16 v24, v4

    .line 706
    .line 707
    goto :goto_a

    .line 708
    :cond_11
    sget-wide v20, La/ijg;->k1:J

    .line 709
    .line 710
    const/4 v8, 0x0

    .line 711
    new-array v9, v8, [Ljava/lang/Object;

    .line 712
    .line 713
    move-object/from16 v19, v0

    .line 714
    .line 715
    iget-object v0, v7, La/ctf0;->b:La/lsm0;

    .line 716
    .line 717
    invoke-static {v9, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-result-object v8

    .line 721
    const v9, 0x7f1309aa

    .line 722
    .line 723
    .line 724
    invoke-virtual {v0, v9, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 725
    .line 726
    .line 727
    move-result-object v22

    .line 728
    invoke-virtual {v7}, La/ctf0;->j()Z

    .line 729
    .line 730
    .line 731
    move-result v23

    .line 732
    const-string v17, "LAST_MATCHES_TABS"

    .line 733
    .line 734
    move-object/from16 v16, v5

    .line 735
    .line 736
    invoke-static/range {v16 .. v23}, La/q5x;->C(La/ljg;Ljava/lang/String;La/l2z;Ljava/util/ArrayList;JLjava/lang/String;Z)La/boo0;

    .line 737
    .line 738
    .line 739
    move-result-object v0

    .line 740
    new-instance v5, La/psv;

    .line 741
    .line 742
    const-string v8, "LAST_MATCHES_HEADER"

    .line 743
    .line 744
    const v9, 0x7f130abc

    .line 745
    .line 746
    .line 747
    invoke-direct {v5, v8, v9}, La/psv;-><init>(Ljava/lang/String;I)V

    .line 748
    .line 749
    .line 750
    const/4 v8, 0x0

    .line 751
    const/4 v9, 0x0

    .line 752
    move-object/from16 v19, v12

    .line 753
    .line 754
    move-object/from16 v29, v15

    .line 755
    .line 756
    move-object v12, v5

    .line 757
    move-object v15, v10

    .line 758
    move-object/from16 v5, v18

    .line 759
    .line 760
    move v10, v4

    .line 761
    move/from16 v18, v11

    .line 762
    .line 763
    move-object/from16 v4, v16

    .line 764
    .line 765
    move-object/from16 v11, v26

    .line 766
    .line 767
    move-object/from16 v26, v24

    .line 768
    .line 769
    invoke-static/range {v4 .. v10}, La/n2z;->c(La/ljg;La/l2z;ZLa/ctf0;ZZZ)La/m2z;

    .line 770
    .line 771
    .line 772
    move-result-object v5

    .line 773
    move-object/from16 v30, v4

    .line 774
    .line 775
    move/from16 v24, v10

    .line 776
    .line 777
    invoke-virtual {v11, v12}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 778
    .line 779
    .line 780
    invoke-virtual {v11, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 781
    .line 782
    .line 783
    invoke-virtual {v11, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 784
    .line 785
    .line 786
    :goto_a
    move-object/from16 v33, p1

    .line 787
    .line 788
    move-object/from16 v21, v1

    .line 789
    .line 790
    move-object/from16 v31, v3

    .line 791
    .line 792
    move-object v4, v11

    .line 793
    :goto_b
    move-object v3, v13

    .line 794
    move-object/from16 v34, v14

    .line 795
    .line 796
    move/from16 v23, v18

    .line 797
    .line 798
    move-object/from16 v22, v26

    .line 799
    .line 800
    move-object/from16 v26, v19

    .line 801
    .line 802
    goto/16 :goto_51

    .line 803
    .line 804
    :pswitch_3
    move-object/from16 v28, v0

    .line 805
    .line 806
    move-object/from16 v30, v5

    .line 807
    .line 808
    move/from16 v18, v11

    .line 809
    .line 810
    move-object/from16 v19, v12

    .line 811
    .line 812
    move-object/from16 v29, v15

    .line 813
    .line 814
    move-object/from16 v11, v26

    .line 815
    .line 816
    move-object v15, v10

    .line 817
    move-object/from16 v26, v24

    .line 818
    .line 819
    move/from16 v24, v9

    .line 820
    .line 821
    invoke-static/range {v19 .. v19}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 822
    .line 823
    .line 824
    move-result-object v0

    .line 825
    check-cast v0, Ljava/lang/String;

    .line 826
    .line 827
    if-nez v0, :cond_12

    .line 828
    .line 829
    move-object/from16 v0, v27

    .line 830
    .line 831
    :cond_12
    invoke-static {v0}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 832
    .line 833
    .line 834
    move-result-object v6

    .line 835
    invoke-static/range {p0 .. p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 836
    .line 837
    .line 838
    move-result-object v0

    .line 839
    check-cast v0, Ljava/lang/String;

    .line 840
    .line 841
    if-nez v0, :cond_13

    .line 842
    .line 843
    goto :goto_c

    .line 844
    :cond_13
    move-object/from16 v27, v0

    .line 845
    .line 846
    :goto_c
    invoke-static/range {v27 .. v27}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 847
    .line 848
    .line 849
    move-result-object v0

    .line 850
    iget-object v5, v3, La/vvd0;->d:La/g0e0;

    .line 851
    .line 852
    move-object v8, v7

    .line 853
    move-object v4, v11

    .line 854
    move/from16 v9, v24

    .line 855
    .line 856
    move-object v7, v0

    .line 857
    invoke-static/range {v4 .. v9}, La/jwb;->x(La/lc00;La/g0e0;Ljava/lang/String;Ljava/lang/String;La/ctf0;Z)V

    .line 858
    .line 859
    .line 860
    move-object/from16 v33, p1

    .line 861
    .line 862
    move-object/from16 v21, v1

    .line 863
    .line 864
    move-object/from16 v31, v3

    .line 865
    .line 866
    move-object v7, v8

    .line 867
    goto :goto_b

    .line 868
    :pswitch_4
    move-object/from16 v28, v0

    .line 869
    .line 870
    move-object/from16 v30, v5

    .line 871
    .line 872
    move-object v8, v7

    .line 873
    move/from16 v18, v11

    .line 874
    .line 875
    move-object/from16 v19, v12

    .line 876
    .line 877
    move-object/from16 v29, v15

    .line 878
    .line 879
    move-object/from16 v4, v26

    .line 880
    .line 881
    move-object v15, v10

    .line 882
    move-object/from16 v26, v24

    .line 883
    .line 884
    move/from16 v24, v9

    .line 885
    .line 886
    iget-object v7, v3, La/vvd0;->d:La/g0e0;

    .line 887
    .line 888
    move-object v10, v8

    .line 889
    iget-wide v8, v14, La/ixd0;->b:J

    .line 890
    .line 891
    invoke-static/range {v19 .. v19}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 892
    .line 893
    .line 894
    move-result-object v0

    .line 895
    check-cast v0, Ljava/lang/String;

    .line 896
    .line 897
    if-nez v0, :cond_14

    .line 898
    .line 899
    move-object/from16 v0, v27

    .line 900
    .line 901
    :cond_14
    invoke-static {v0}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 902
    .line 903
    .line 904
    move-result-object v5

    .line 905
    invoke-static/range {p0 .. p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 906
    .line 907
    .line 908
    move-result-object v0

    .line 909
    check-cast v0, Ljava/lang/String;

    .line 910
    .line 911
    if-nez v0, :cond_15

    .line 912
    .line 913
    goto :goto_d

    .line 914
    :cond_15
    move-object/from16 v27, v0

    .line 915
    .line 916
    :goto_d
    invoke-static/range {v27 .. v27}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 917
    .line 918
    .line 919
    move-result-object v6

    .line 920
    move/from16 v11, v18

    .line 921
    .line 922
    move-object/from16 v0, v19

    .line 923
    .line 924
    move/from16 v12, v24

    .line 925
    .line 926
    invoke-static/range {v4 .. v12}, La/yyw;->A(La/lc00;Ljava/lang/String;Ljava/lang/String;La/g0e0;JLa/ctf0;ZZ)V

    .line 927
    .line 928
    .line 929
    move-object/from16 v33, p1

    .line 930
    .line 931
    move-object/from16 v21, v1

    .line 932
    .line 933
    move-object/from16 v31, v3

    .line 934
    .line 935
    move-object v7, v10

    .line 936
    :goto_e
    move/from16 v23, v11

    .line 937
    .line 938
    move-object v3, v13

    .line 939
    move-object/from16 v34, v14

    .line 940
    .line 941
    move-object/from16 v22, v26

    .line 942
    .line 943
    move-object/from16 v26, v0

    .line 944
    .line 945
    goto/16 :goto_51

    .line 946
    .line 947
    :pswitch_5
    move-object/from16 v28, v0

    .line 948
    .line 949
    move-object/from16 v30, v5

    .line 950
    .line 951
    move-object v0, v12

    .line 952
    move-object/from16 v29, v15

    .line 953
    .line 954
    move-object/from16 v4, v26

    .line 955
    .line 956
    move-object v15, v10

    .line 957
    move-object/from16 v26, v24

    .line 958
    .line 959
    move/from16 v24, v9

    .line 960
    .line 961
    iget-object v5, v3, La/vvd0;->e:La/oxd0;

    .line 962
    .line 963
    iget-object v6, v14, La/ixd0;->a:La/o4i0;

    .line 964
    .line 965
    invoke-static/range {v30 .. v30}, La/zsm0;->m(La/ljg;)Ljava/util/List;

    .line 966
    .line 967
    .line 968
    move-result-object v8

    .line 969
    invoke-static {v4, v5, v6, v7, v8}, La/n2x;->s(La/lc00;La/oxd0;La/o4i0;La/ctf0;Ljava/util/List;)V

    .line 970
    .line 971
    .line 972
    move-object/from16 v33, p1

    .line 973
    .line 974
    move-object/from16 v21, v1

    .line 975
    .line 976
    move-object/from16 v31, v3

    .line 977
    .line 978
    goto :goto_e

    .line 979
    :pswitch_6
    move-object/from16 v28, v0

    .line 980
    .line 981
    move-object/from16 v30, v5

    .line 982
    .line 983
    move-object v0, v12

    .line 984
    move-object/from16 v29, v15

    .line 985
    .line 986
    move-object/from16 v4, v26

    .line 987
    .line 988
    move-object v15, v10

    .line 989
    move-object/from16 v26, v24

    .line 990
    .line 991
    move/from16 v24, v9

    .line 992
    .line 993
    invoke-static/range {v26 .. v26}, La/x2x;->c0(La/myd0;)Z

    .line 994
    .line 995
    .line 996
    move-result v5

    .line 997
    if-eqz v5, :cond_16

    .line 998
    .line 999
    move-object/from16 v32, v2

    .line 1000
    .line 1001
    move-object/from16 v31, v3

    .line 1002
    .line 1003
    move-object/from16 v35, v13

    .line 1004
    .line 1005
    move-object/from16 v34, v14

    .line 1006
    .line 1007
    move-object/from16 v9, v26

    .line 1008
    .line 1009
    move-object/from16 v26, v0

    .line 1010
    .line 1011
    goto/16 :goto_18

    .line 1012
    .line 1013
    :cond_16
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v5

    .line 1017
    move-object/from16 v9, v26

    .line 1018
    .line 1019
    iget-object v6, v9, La/myd0;->b:Ljava/util/List;

    .line 1020
    .line 1021
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v6

    .line 1025
    :goto_f
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1026
    .line 1027
    .line 1028
    move-result v8

    .line 1029
    if-eqz v8, :cond_1d

    .line 1030
    .line 1031
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v8

    .line 1035
    check-cast v8, La/iyd0;

    .line 1036
    .line 1037
    iget v10, v8, La/iyd0;->b:I

    .line 1038
    .line 1039
    iget-object v12, v8, La/iyd0;->a:Ljava/lang/String;

    .line 1040
    .line 1041
    iget v8, v8, La/iyd0;->c:I

    .line 1042
    .line 1043
    move-object/from16 v26, v0

    .line 1044
    .line 1045
    const/4 v0, -0x1

    .line 1046
    if-eq v10, v0, :cond_17

    .line 1047
    .line 1048
    if-eq v8, v0, :cond_17

    .line 1049
    .line 1050
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 1051
    .line 1052
    .line 1053
    move-result v0

    .line 1054
    if-nez v0, :cond_18

    .line 1055
    .line 1056
    :cond_17
    move-object/from16 v32, v2

    .line 1057
    .line 1058
    move-object/from16 v31, v3

    .line 1059
    .line 1060
    move-object/from16 v33, v6

    .line 1061
    .line 1062
    move-object/from16 v35, v13

    .line 1063
    .line 1064
    move-object/from16 v34, v14

    .line 1065
    .line 1066
    goto/16 :goto_11

    .line 1067
    .line 1068
    :cond_18
    if-le v10, v8, :cond_19

    .line 1069
    .line 1070
    move-object v0, v2

    .line 1071
    move-object/from16 v31, v3

    .line 1072
    .line 1073
    sget-wide v2, La/ijg;->k1:J

    .line 1074
    .line 1075
    move-object/from16 v32, v0

    .line 1076
    .line 1077
    new-instance v0, La/y3d;

    .line 1078
    .line 1079
    invoke-direct {v0, v2, v3}, La/y3d;-><init>(J)V

    .line 1080
    .line 1081
    .line 1082
    sget-object v2, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 1083
    .line 1084
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 1085
    .line 1086
    .line 1087
    move-result-wide v2

    .line 1088
    move-object/from16 v33, v6

    .line 1089
    .line 1090
    new-instance v6, La/y3d;

    .line 1091
    .line 1092
    invoke-direct {v6, v2, v3}, La/y3d;-><init>(J)V

    .line 1093
    .line 1094
    .line 1095
    new-instance v2, Lkotlin/Pair;

    .line 1096
    .line 1097
    invoke-direct {v2, v0, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1098
    .line 1099
    .line 1100
    goto :goto_10

    .line 1101
    :cond_19
    move-object/from16 v32, v2

    .line 1102
    .line 1103
    move-object/from16 v31, v3

    .line 1104
    .line 1105
    move-object/from16 v33, v6

    .line 1106
    .line 1107
    if-ge v10, v8, :cond_1a

    .line 1108
    .line 1109
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 1110
    .line 1111
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 1112
    .line 1113
    .line 1114
    move-result-wide v2

    .line 1115
    new-instance v0, La/y3d;

    .line 1116
    .line 1117
    invoke-direct {v0, v2, v3}, La/y3d;-><init>(J)V

    .line 1118
    .line 1119
    .line 1120
    sget-wide v2, La/ijg;->k1:J

    .line 1121
    .line 1122
    new-instance v6, La/y3d;

    .line 1123
    .line 1124
    invoke-direct {v6, v2, v3}, La/y3d;-><init>(J)V

    .line 1125
    .line 1126
    .line 1127
    new-instance v2, Lkotlin/Pair;

    .line 1128
    .line 1129
    invoke-direct {v2, v0, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1130
    .line 1131
    .line 1132
    goto :goto_10

    .line 1133
    :cond_1a
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 1134
    .line 1135
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 1136
    .line 1137
    .line 1138
    move-result-wide v2

    .line 1139
    new-instance v6, La/y3d;

    .line 1140
    .line 1141
    invoke-direct {v6, v2, v3}, La/y3d;-><init>(J)V

    .line 1142
    .line 1143
    .line 1144
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 1145
    .line 1146
    .line 1147
    move-result-wide v2

    .line 1148
    new-instance v0, La/y3d;

    .line 1149
    .line 1150
    invoke-direct {v0, v2, v3}, La/y3d;-><init>(J)V

    .line 1151
    .line 1152
    .line 1153
    new-instance v2, Lkotlin/Pair;

    .line 1154
    .line 1155
    invoke-direct {v2, v6, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1156
    .line 1157
    .line 1158
    :goto_10
    iget-object v0, v2, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 1159
    .line 1160
    check-cast v0, La/y3d;

    .line 1161
    .line 1162
    move-object v3, v13

    .line 1163
    move-object/from16 v34, v14

    .line 1164
    .line 1165
    iget-wide v13, v0, La/y3d;->a:J

    .line 1166
    .line 1167
    iget-object v0, v2, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 1168
    .line 1169
    check-cast v0, La/y3d;

    .line 1170
    .line 1171
    move-object/from16 v35, v3

    .line 1172
    .line 1173
    iget-wide v2, v0, La/y3d;->a:J

    .line 1174
    .line 1175
    new-instance v0, La/wls;

    .line 1176
    .line 1177
    new-instance v16, La/fp20;

    .line 1178
    .line 1179
    invoke-static/range {v26 .. v26}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v6

    .line 1183
    check-cast v6, Ljava/lang/String;

    .line 1184
    .line 1185
    if-nez v6, :cond_1b

    .line 1186
    .line 1187
    move-object/from16 v6, v27

    .line 1188
    .line 1189
    :cond_1b
    invoke-static {v6}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v19

    .line 1193
    iget-object v6, v1, La/m9s;->i:Ljava/lang/String;

    .line 1194
    .line 1195
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v21

    .line 1199
    move-object/from16 v20, v6

    .line 1200
    .line 1201
    move-wide/from16 v17, v13

    .line 1202
    .line 1203
    invoke-direct/range {v16 .. v21}, La/fp20;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1204
    .line 1205
    .line 1206
    move-object/from16 v6, v16

    .line 1207
    .line 1208
    new-instance v16, La/fp20;

    .line 1209
    .line 1210
    invoke-static/range {p0 .. p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v10

    .line 1214
    check-cast v10, Ljava/lang/String;

    .line 1215
    .line 1216
    if-nez v10, :cond_1c

    .line 1217
    .line 1218
    move-object/from16 v10, v27

    .line 1219
    .line 1220
    :cond_1c
    invoke-static {v10}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v19

    .line 1224
    iget-object v10, v1, La/m9s;->j:Ljava/lang/String;

    .line 1225
    .line 1226
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v21

    .line 1230
    move-wide/from16 v17, v2

    .line 1231
    .line 1232
    move-object/from16 v20, v10

    .line 1233
    .line 1234
    invoke-direct/range {v16 .. v21}, La/fp20;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1235
    .line 1236
    .line 1237
    invoke-static {v12, v11}, La/x9x;->P(Ljava/lang/String;Z)Ljava/lang/String;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v20

    .line 1241
    const/4 v8, 0x0

    .line 1242
    new-array v2, v8, [Ljava/lang/Object;

    .line 1243
    .line 1244
    iget-object v3, v7, La/ctf0;->b:La/lsm0;

    .line 1245
    .line 1246
    invoke-static {v2, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v2

    .line 1250
    const v8, 0x7f13058d

    .line 1251
    .line 1252
    .line 1253
    invoke-virtual {v3, v8, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1254
    .line 1255
    .line 1256
    move-result-object v21

    .line 1257
    const/16 v22, 0x0

    .line 1258
    .line 1259
    const/16 v23, 0x0

    .line 1260
    .line 1261
    move-object/from16 v17, v6

    .line 1262
    .line 1263
    move-object/from16 v19, v12

    .line 1264
    .line 1265
    move-object/from16 v18, v16

    .line 1266
    .line 1267
    move-object/from16 v16, v0

    .line 1268
    .line 1269
    invoke-direct/range {v16 .. v24}, La/wls;-><init>(La/fp20;La/fp20;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Z)V

    .line 1270
    .line 1271
    .line 1272
    invoke-virtual {v5, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1273
    .line 1274
    .line 1275
    :goto_11
    move-object/from16 v0, v26

    .line 1276
    .line 1277
    move-object/from16 v3, v31

    .line 1278
    .line 1279
    move-object/from16 v2, v32

    .line 1280
    .line 1281
    move-object/from16 v6, v33

    .line 1282
    .line 1283
    move-object/from16 v14, v34

    .line 1284
    .line 1285
    move-object/from16 v13, v35

    .line 1286
    .line 1287
    goto/16 :goto_f

    .line 1288
    .line 1289
    :cond_1d
    move-object/from16 v26, v0

    .line 1290
    .line 1291
    move-object/from16 v32, v2

    .line 1292
    .line 1293
    move-object/from16 v31, v3

    .line 1294
    .line 1295
    move-object/from16 v35, v13

    .line 1296
    .line 1297
    move-object/from16 v34, v14

    .line 1298
    .line 1299
    iget-object v0, v9, La/myd0;->a:Ljava/lang/String;

    .line 1300
    .line 1301
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1302
    .line 1303
    .line 1304
    move-result v2

    .line 1305
    if-nez v2, :cond_1e

    .line 1306
    .line 1307
    goto/16 :goto_17

    .line 1308
    .line 1309
    :cond_1e
    iget-object v2, v1, La/m9s;->h:La/qqs;

    .line 1310
    .line 1311
    iget-object v2, v2, La/qqs;->c:Ljava/util/List;

    .line 1312
    .line 1313
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 1314
    .line 1315
    .line 1316
    move-result v3

    .line 1317
    if-eqz v3, :cond_1f

    .line 1318
    .line 1319
    goto/16 :goto_17

    .line 1320
    .line 1321
    :cond_1f
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v3

    .line 1325
    check-cast v3, La/ve90;

    .line 1326
    .line 1327
    if-eqz v3, :cond_20

    .line 1328
    .line 1329
    iget-object v3, v3, La/ve90;->b:Ljava/lang/String;

    .line 1330
    .line 1331
    goto :goto_12

    .line 1332
    :cond_20
    move-object/from16 v3, v25

    .line 1333
    .line 1334
    :goto_12
    if-nez v3, :cond_21

    .line 1335
    .line 1336
    move-object/from16 v21, v27

    .line 1337
    .line 1338
    goto :goto_13

    .line 1339
    :cond_21
    move-object/from16 v21, v3

    .line 1340
    .line 1341
    :goto_13
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v2

    .line 1345
    check-cast v2, La/ve90;

    .line 1346
    .line 1347
    if-eqz v2, :cond_22

    .line 1348
    .line 1349
    iget-object v2, v2, La/ve90;->c:Ljava/lang/String;

    .line 1350
    .line 1351
    goto :goto_14

    .line 1352
    :cond_22
    move-object/from16 v2, v25

    .line 1353
    .line 1354
    :goto_14
    if-nez v2, :cond_23

    .line 1355
    .line 1356
    move-object/from16 v41, v27

    .line 1357
    .line 1358
    goto :goto_15

    .line 1359
    :cond_23
    move-object/from16 v41, v2

    .line 1360
    .line 1361
    :goto_15
    new-instance v2, La/wls;

    .line 1362
    .line 1363
    new-instance v16, La/fp20;

    .line 1364
    .line 1365
    invoke-static/range {v26 .. v26}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v3

    .line 1369
    check-cast v3, Ljava/lang/String;

    .line 1370
    .line 1371
    if-nez v3, :cond_24

    .line 1372
    .line 1373
    move-object/from16 v3, v27

    .line 1374
    .line 1375
    :cond_24
    invoke-static {v3}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v19

    .line 1379
    iget-object v3, v1, La/m9s;->i:Ljava/lang/String;

    .line 1380
    .line 1381
    sget-object v6, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 1382
    .line 1383
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 1384
    .line 1385
    .line 1386
    move-result-wide v17

    .line 1387
    move-object/from16 v20, v3

    .line 1388
    .line 1389
    invoke-direct/range {v16 .. v21}, La/fp20;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1390
    .line 1391
    .line 1392
    new-instance v18, La/fp20;

    .line 1393
    .line 1394
    invoke-static/range {p0 .. p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v3

    .line 1398
    check-cast v3, Ljava/lang/String;

    .line 1399
    .line 1400
    if-nez v3, :cond_25

    .line 1401
    .line 1402
    goto :goto_16

    .line 1403
    :cond_25
    move-object/from16 v27, v3

    .line 1404
    .line 1405
    :goto_16
    invoke-static/range {v27 .. v27}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v39

    .line 1409
    iget-object v3, v1, La/m9s;->j:Ljava/lang/String;

    .line 1410
    .line 1411
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 1412
    .line 1413
    .line 1414
    move-result-wide v37

    .line 1415
    move-object/from16 v40, v3

    .line 1416
    .line 1417
    move-object/from16 v36, v18

    .line 1418
    .line 1419
    invoke-direct/range {v36 .. v41}, La/fp20;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1420
    .line 1421
    .line 1422
    invoke-static {v0, v11}, La/x9x;->P(Ljava/lang/String;Z)Ljava/lang/String;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v20

    .line 1426
    const/4 v8, 0x0

    .line 1427
    new-array v3, v8, [Ljava/lang/Object;

    .line 1428
    .line 1429
    iget-object v6, v7, La/ctf0;->b:La/lsm0;

    .line 1430
    .line 1431
    invoke-static {v3, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v3

    .line 1435
    const v8, 0x7f130609

    .line 1436
    .line 1437
    .line 1438
    invoke-virtual {v6, v8, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v21

    .line 1442
    const/16 v22, 0x1

    .line 1443
    .line 1444
    const/16 v23, 0x0

    .line 1445
    .line 1446
    move-object/from16 v19, v0

    .line 1447
    .line 1448
    move-object/from16 v17, v16

    .line 1449
    .line 1450
    move-object/from16 v16, v2

    .line 1451
    .line 1452
    invoke-direct/range {v16 .. v24}, La/wls;-><init>(La/fp20;La/fp20;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Z)V

    .line 1453
    .line 1454
    .line 1455
    move-object/from16 v0, v16

    .line 1456
    .line 1457
    invoke-virtual {v5, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1458
    .line 1459
    .line 1460
    :goto_17
    invoke-static {v5}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v0

    .line 1464
    invoke-virtual {v0}, La/lc00;->isEmpty()Z

    .line 1465
    .line 1466
    .line 1467
    move-result v2

    .line 1468
    if-eqz v2, :cond_26

    .line 1469
    .line 1470
    goto :goto_18

    .line 1471
    :cond_26
    new-instance v2, La/psv;

    .line 1472
    .line 1473
    const-string v3, "MAPS_IN_SERIES_HEADER"

    .line 1474
    .line 1475
    const v5, 0x7f13126f

    .line 1476
    .line 1477
    .line 1478
    invoke-direct {v2, v3, v5}, La/psv;-><init>(Ljava/lang/String;I)V

    .line 1479
    .line 1480
    .line 1481
    invoke-virtual {v4, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1482
    .line 1483
    .line 1484
    new-instance v2, La/up20;

    .line 1485
    .line 1486
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v0

    .line 1490
    invoke-direct {v2, v0}, La/up20;-><init>(La/i4;)V

    .line 1491
    .line 1492
    .line 1493
    invoke-virtual {v4, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1494
    .line 1495
    .line 1496
    :goto_18
    move-object/from16 v33, p1

    .line 1497
    .line 1498
    move-object/from16 v21, v1

    .line 1499
    .line 1500
    move-object/from16 v22, v9

    .line 1501
    .line 1502
    move/from16 v23, v11

    .line 1503
    .line 1504
    move-object/from16 v2, v32

    .line 1505
    .line 1506
    :goto_19
    move-object/from16 v3, v35

    .line 1507
    .line 1508
    goto/16 :goto_51

    .line 1509
    .line 1510
    :pswitch_7
    move-object/from16 v4, v24

    .line 1511
    .line 1512
    move/from16 v24, v9

    .line 1513
    .line 1514
    move-object v9, v4

    .line 1515
    move-object/from16 v28, v0

    .line 1516
    .line 1517
    move-object/from16 v32, v2

    .line 1518
    .line 1519
    move-object/from16 v31, v3

    .line 1520
    .line 1521
    move-object/from16 v30, v5

    .line 1522
    .line 1523
    move-object/from16 v35, v13

    .line 1524
    .line 1525
    move-object v0, v14

    .line 1526
    move-object/from16 v29, v15

    .line 1527
    .line 1528
    move-object/from16 v4, v26

    .line 1529
    .line 1530
    move-object v15, v10

    .line 1531
    move-object/from16 v26, v12

    .line 1532
    .line 1533
    iget-wide v2, v0, La/ixd0;->c:J

    .line 1534
    .line 1535
    invoke-static/range {p1 .. p1}, La/x2x;->W(La/bvd0;)Z

    .line 1536
    .line 1537
    .line 1538
    move-result v5

    .line 1539
    if-eqz v5, :cond_27

    .line 1540
    .line 1541
    move-object/from16 v33, p1

    .line 1542
    .line 1543
    move-object/from16 v34, v0

    .line 1544
    .line 1545
    move-object/from16 v21, v1

    .line 1546
    .line 1547
    move-object/from16 v22, v9

    .line 1548
    .line 1549
    move/from16 v23, v11

    .line 1550
    .line 1551
    move-object/from16 v2, v32

    .line 1552
    .line 1553
    move-object/from16 v32, v7

    .line 1554
    .line 1555
    goto/16 :goto_38

    .line 1556
    .line 1557
    :cond_27
    sget-object v5, La/v0e0;->b:Ljava/util/List;

    .line 1558
    .line 1559
    new-instance v10, La/v6d0;

    .line 1560
    .line 1561
    const/16 v12, 0xe

    .line 1562
    .line 1563
    move-object/from16 v13, p1

    .line 1564
    .line 1565
    invoke-direct {v10, v13, v12}, La/v6d0;-><init>(Ljava/lang/Object;B)V

    .line 1566
    .line 1567
    .line 1568
    invoke-static {v5, v10}, La/ewm0;->s(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/ArrayList;

    .line 1569
    .line 1570
    .line 1571
    move-result-object v5

    .line 1572
    invoke-static {v2, v3, v5}, La/ewm0;->t(JLjava/util/List;)La/aco0;

    .line 1573
    .line 1574
    .line 1575
    move-result-object v37

    .line 1576
    sget-wide v39, La/ijg;->k1:J

    .line 1577
    .line 1578
    sget-object v41, La/pno0;->a:La/pno0;

    .line 1579
    .line 1580
    invoke-virtual {v7}, La/ctf0;->j()Z

    .line 1581
    .line 1582
    .line 1583
    move-result v42

    .line 1584
    new-instance v10, La/iv80;

    .line 1585
    .line 1586
    const/16 v12, 0xd

    .line 1587
    .line 1588
    invoke-direct {v10, v7, v12}, La/iv80;-><init>(La/ctf0;B)V

    .line 1589
    .line 1590
    .line 1591
    const-string v36, "BANS_TABS"

    .line 1592
    .line 1593
    move-object/from16 v38, v5

    .line 1594
    .line 1595
    move-object/from16 v43, v10

    .line 1596
    .line 1597
    invoke-static/range {v36 .. v43}, La/qem0;->k(Ljava/lang/String;La/aco0;Ljava/util/List;JLa/pno0;ZLkotlin/jvm/functions/Function1;)La/boo0;

    .line 1598
    .line 1599
    .line 1600
    move-result-object v5

    .line 1601
    move-object/from16 v10, v37

    .line 1602
    .line 1603
    if-eqz v10, :cond_28

    .line 1604
    .line 1605
    iget-byte v2, v10, La/aco0;->a:B

    .line 1606
    .line 1607
    int-to-long v2, v2

    .line 1608
    :cond_28
    sget-object v10, La/u0e0;->a:[La/u0e0;

    .line 1609
    .line 1610
    const-wide/16 v18, 0x6

    .line 1611
    .line 1612
    cmp-long v10, v2, v18

    .line 1613
    .line 1614
    const-string v14, "%s/playerlogo/%s"

    .line 1615
    .line 1616
    const-string v18, "%s/%s"

    .line 1617
    .line 1618
    const-string v12, "playerlogo/"

    .line 1619
    .line 1620
    move-object/from16 v34, v0

    .line 1621
    .line 1622
    const-string v0, ".png"

    .line 1623
    .line 1624
    move-wide/from16 v19, v2

    .line 1625
    .line 1626
    const/16 v2, 0xa

    .line 1627
    .line 1628
    if-nez v10, :cond_3a

    .line 1629
    .line 1630
    iget-object v3, v9, La/myd0;->c:Ljava/util/List;

    .line 1631
    .line 1632
    new-instance v10, Ljava/util/ArrayList;

    .line 1633
    .line 1634
    invoke-static {v3, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1635
    .line 1636
    .line 1637
    move-result v2

    .line 1638
    invoke-direct {v10, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1639
    .line 1640
    .line 1641
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1642
    .line 1643
    .line 1644
    move-result-object v2

    .line 1645
    const/4 v3, 0x0

    .line 1646
    :goto_1a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1647
    .line 1648
    .line 1649
    move-result v19

    .line 1650
    if-eqz v19, :cond_39

    .line 1651
    .line 1652
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1653
    .line 1654
    .line 1655
    move-result-object v19

    .line 1656
    add-int/lit8 v20, v3, 0x1

    .line 1657
    .line 1658
    if-ltz v3, :cond_38

    .line 1659
    .line 1660
    move-object/from16 v21, v2

    .line 1661
    .line 1662
    move-object/from16 v2, v19

    .line 1663
    .line 1664
    check-cast v2, La/ayd0;

    .line 1665
    .line 1666
    move-object/from16 v22, v9

    .line 1667
    .line 1668
    iget v9, v2, La/ayd0;->b:I

    .line 1669
    .line 1670
    move/from16 v23, v11

    .line 1671
    .line 1672
    iget-object v11, v2, La/ayd0;->a:Ljava/lang/String;

    .line 1673
    .line 1674
    move-object/from16 v33, v13

    .line 1675
    .line 1676
    const/4 v13, 0x1

    .line 1677
    if-eq v9, v13, :cond_2a

    .line 1678
    .line 1679
    const/4 v13, 0x2

    .line 1680
    if-eq v9, v13, :cond_29

    .line 1681
    .line 1682
    :goto_1b
    move-object/from16 v9, v27

    .line 1683
    .line 1684
    goto :goto_1c

    .line 1685
    :cond_29
    invoke-static/range {p0 .. p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1686
    .line 1687
    .line 1688
    move-result-object v9

    .line 1689
    check-cast v9, Ljava/lang/String;

    .line 1690
    .line 1691
    if-nez v9, :cond_2b

    .line 1692
    .line 1693
    goto :goto_1b

    .line 1694
    :cond_2a
    invoke-static/range {v26 .. v26}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1695
    .line 1696
    .line 1697
    move-result-object v9

    .line 1698
    check-cast v9, Ljava/lang/String;

    .line 1699
    .line 1700
    if-nez v9, :cond_2b

    .line 1701
    .line 1702
    goto :goto_1b

    .line 1703
    :cond_2b
    :goto_1c
    invoke-static {v3, v11}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 1704
    .line 1705
    .line 1706
    move-result-object v37

    .line 1707
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1708
    .line 1709
    sget-object v13, La/ujn;->h:Ljava/lang/String;

    .line 1710
    .line 1711
    invoke-direct {v3, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1712
    .line 1713
    .line 1714
    sget-object v13, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 1715
    .line 1716
    invoke-virtual {v11, v13}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1717
    .line 1718
    .line 1719
    move-result-object v13

    .line 1720
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1721
    .line 1722
    .line 1723
    move-object/from16 v40, v11

    .line 1724
    .line 1725
    new-instance v11, Ljava/lang/StringBuilder;

    .line 1726
    .line 1727
    move-object/from16 v43, v14

    .line 1728
    .line 1729
    const-string v14, "static/img/ImgDefault/Esports/Real/Rainbow/MapPicks/"

    .line 1730
    .line 1731
    invoke-direct {v11, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1732
    .line 1733
    .line 1734
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1735
    .line 1736
    .line 1737
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1738
    .line 1739
    .line 1740
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1741
    .line 1742
    .line 1743
    move-result-object v11

    .line 1744
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 1745
    .line 1746
    .line 1747
    move-result v13

    .line 1748
    if-nez v13, :cond_2c

    .line 1749
    .line 1750
    const/4 v13, 0x0

    .line 1751
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1752
    .line 1753
    .line 1754
    move v14, v13

    .line 1755
    goto :goto_1f

    .line 1756
    :cond_2c
    const/4 v13, 0x0

    .line 1757
    sget-object v14, La/ujn;->h:Ljava/lang/String;

    .line 1758
    .line 1759
    invoke-static {v11, v14, v13}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1760
    .line 1761
    .line 1762
    move-result v14

    .line 1763
    if-nez v14, :cond_2f

    .line 1764
    .line 1765
    invoke-static {v11, v6, v13}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1766
    .line 1767
    .line 1768
    move-result v14

    .line 1769
    if-eqz v14, :cond_2d

    .line 1770
    .line 1771
    const/4 v14, 0x0

    .line 1772
    goto :goto_1e

    .line 1773
    :cond_2d
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    .line 1774
    .line 1775
    .line 1776
    move-result v13

    .line 1777
    if-lez v13, :cond_2e

    .line 1778
    .line 1779
    invoke-static {v3, v8}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 1780
    .line 1781
    .line 1782
    move-result v13

    .line 1783
    if-nez v13, :cond_2e

    .line 1784
    .line 1785
    const/16 v13, 0x2f

    .line 1786
    .line 1787
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1788
    .line 1789
    .line 1790
    move/from16 v17, v13

    .line 1791
    .line 1792
    const/4 v14, 0x1

    .line 1793
    goto :goto_1d

    .line 1794
    :cond_2e
    const/4 v14, 0x1

    .line 1795
    const/16 v17, 0x2f

    .line 1796
    .line 1797
    :goto_1d
    new-array v13, v14, [C

    .line 1798
    .line 1799
    const/4 v14, 0x0

    .line 1800
    aput-char v17, v13, v14

    .line 1801
    .line 1802
    invoke-static {v11, v13}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 1803
    .line 1804
    .line 1805
    move-result-object v11

    .line 1806
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1807
    .line 1808
    .line 1809
    goto :goto_1f

    .line 1810
    :cond_2f
    move v14, v13

    .line 1811
    :goto_1e
    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1812
    .line 1813
    .line 1814
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1815
    .line 1816
    .line 1817
    :goto_1f
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1818
    .line 1819
    .line 1820
    move-result-object v39

    .line 1821
    sget-object v3, La/ujn;->h:Ljava/lang/String;

    .line 1822
    .line 1823
    invoke-static {v9, v3, v14}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1824
    .line 1825
    .line 1826
    move-result v3

    .line 1827
    if-eqz v3, :cond_30

    .line 1828
    .line 1829
    move-object/from16 v38, v9

    .line 1830
    .line 1831
    :goto_20
    const/4 v13, 0x2

    .line 1832
    goto :goto_23

    .line 1833
    :cond_30
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 1834
    .line 1835
    .line 1836
    move-result v3

    .line 1837
    if-nez v3, :cond_31

    .line 1838
    .line 1839
    goto :goto_21

    .line 1840
    :cond_31
    sget-object v3, La/u0d;->a:Ljava/util/List;

    .line 1841
    .line 1842
    invoke-static {v9}, La/u0d;->c(Ljava/lang/String;)Z

    .line 1843
    .line 1844
    .line 1845
    move-result v3

    .line 1846
    if-eqz v3, :cond_32

    .line 1847
    .line 1848
    :goto_21
    move-object/from16 v38, v27

    .line 1849
    .line 1850
    goto :goto_20

    .line 1851
    :cond_32
    const/4 v14, 0x1

    .line 1852
    invoke-static {v9, v12, v14}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1853
    .line 1854
    .line 1855
    move-result v3

    .line 1856
    if-eqz v3, :cond_33

    .line 1857
    .line 1858
    move-object/from16 v3, v18

    .line 1859
    .line 1860
    goto :goto_22

    .line 1861
    :cond_33
    move-object/from16 v3, v43

    .line 1862
    .line 1863
    :goto_22
    sget-object v11, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 1864
    .line 1865
    sget-object v13, La/ujn;->h:Ljava/lang/String;

    .line 1866
    .line 1867
    filled-new-array {v13, v9}, [Ljava/lang/Object;

    .line 1868
    .line 1869
    .line 1870
    move-result-object v9

    .line 1871
    const/4 v13, 0x2

    .line 1872
    invoke-static {v9, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1873
    .line 1874
    .line 1875
    move-result-object v9

    .line 1876
    invoke-static {v11, v3, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1877
    .line 1878
    .line 1879
    move-result-object v9

    .line 1880
    move-object/from16 v38, v9

    .line 1881
    .line 1882
    :goto_23
    iget-object v2, v2, La/ayd0;->d:La/eyd0;

    .line 1883
    .line 1884
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 1885
    .line 1886
    .line 1887
    move-result v2

    .line 1888
    if-eqz v2, :cond_37

    .line 1889
    .line 1890
    const/4 v14, 0x1

    .line 1891
    if-eq v2, v14, :cond_36

    .line 1892
    .line 1893
    if-eq v2, v13, :cond_35

    .line 1894
    .line 1895
    const/4 v3, 0x3

    .line 1896
    if-ne v2, v3, :cond_34

    .line 1897
    .line 1898
    sget-object v2, La/oud0;->c:La/oud0;

    .line 1899
    .line 1900
    :goto_24
    move-object/from16 v41, v2

    .line 1901
    .line 1902
    goto :goto_25

    .line 1903
    :cond_34
    invoke-static {}, La/t9f;->b()V

    .line 1904
    .line 1905
    .line 1906
    goto/16 :goto_8

    .line 1907
    .line 1908
    :cond_35
    sget-object v2, La/oud0;->b:La/oud0;

    .line 1909
    .line 1910
    goto :goto_24

    .line 1911
    :cond_36
    sget-object v2, La/oud0;->a:La/oud0;

    .line 1912
    .line 1913
    goto :goto_24

    .line 1914
    :cond_37
    sget-object v2, La/oud0;->d:La/oud0;

    .line 1915
    .line 1916
    goto :goto_24

    .line 1917
    :goto_25
    sget-object v42, La/nud0;->a:La/nud0;

    .line 1918
    .line 1919
    new-instance v36, La/pud0;

    .line 1920
    .line 1921
    invoke-direct/range {v36 .. v42}, La/pud0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/oud0;La/nud0;)V

    .line 1922
    .line 1923
    .line 1924
    move-object/from16 v2, v36

    .line 1925
    .line 1926
    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1927
    .line 1928
    .line 1929
    move/from16 v3, v20

    .line 1930
    .line 1931
    move-object/from16 v2, v21

    .line 1932
    .line 1933
    move-object/from16 v9, v22

    .line 1934
    .line 1935
    move/from16 v11, v23

    .line 1936
    .line 1937
    move-object/from16 v13, v33

    .line 1938
    .line 1939
    move-object/from16 v14, v43

    .line 1940
    .line 1941
    goto/16 :goto_1a

    .line 1942
    .line 1943
    :cond_38
    invoke-static {}, La/q3d;->p()V

    .line 1944
    .line 1945
    .line 1946
    throw v25

    .line 1947
    :cond_39
    move-object/from16 v22, v9

    .line 1948
    .line 1949
    move/from16 v23, v11

    .line 1950
    .line 1951
    move-object/from16 v33, v13

    .line 1952
    .line 1953
    new-instance v0, La/qud0;

    .line 1954
    .line 1955
    const-string v2, "BANS_MAPS"

    .line 1956
    .line 1957
    invoke-static {v10}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 1958
    .line 1959
    .line 1960
    move-result-object v3

    .line 1961
    invoke-direct {v0, v3, v2}, La/qud0;-><init>(La/i4;Ljava/lang/String;)V

    .line 1962
    .line 1963
    .line 1964
    move-object/from16 v21, v1

    .line 1965
    .line 1966
    move-object/from16 v2, v32

    .line 1967
    .line 1968
    move-object/from16 v32, v7

    .line 1969
    .line 1970
    goto/16 :goto_37

    .line 1971
    .line 1972
    :cond_3a
    move-object/from16 v22, v9

    .line 1973
    .line 1974
    move/from16 v23, v11

    .line 1975
    .line 1976
    move-object/from16 v33, v13

    .line 1977
    .line 1978
    move-object/from16 v43, v14

    .line 1979
    .line 1980
    const-wide/16 v9, 0x5

    .line 1981
    .line 1982
    cmp-long v3, v19, v9

    .line 1983
    .line 1984
    if-nez v3, :cond_51

    .line 1985
    .line 1986
    iget-object v3, v15, La/ivd0;->i:Ljava/util/List;

    .line 1987
    .line 1988
    new-instance v9, Ljava/util/ArrayList;

    .line 1989
    .line 1990
    invoke-static {v3, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1991
    .line 1992
    .line 1993
    move-result v10

    .line 1994
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 1995
    .line 1996
    .line 1997
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1998
    .line 1999
    .line 2000
    move-result-object v3

    .line 2001
    const/4 v10, 0x0

    .line 2002
    :goto_26
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 2003
    .line 2004
    .line 2005
    move-result v11

    .line 2006
    const-string v13, "static/img/ImgDefault/Esports/Real/Rainbow/Operators/"

    .line 2007
    .line 2008
    if-eqz v11, :cond_45

    .line 2009
    .line 2010
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2011
    .line 2012
    .line 2013
    move-result-object v11

    .line 2014
    add-int/lit8 v14, v10, 0x1

    .line 2015
    .line 2016
    if-ltz v10, :cond_44

    .line 2017
    .line 2018
    check-cast v11, La/wud0;

    .line 2019
    .line 2020
    iget v2, v11, La/wud0;->a:I

    .line 2021
    .line 2022
    iget-object v11, v11, La/wud0;->b:Ljava/lang/String;

    .line 2023
    .line 2024
    move-object/from16 v20, v3

    .line 2025
    .line 2026
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2027
    .line 2028
    move/from16 v21, v14

    .line 2029
    .line 2030
    const-string v14, "first_team_ban_"

    .line 2031
    .line 2032
    invoke-direct {v3, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2033
    .line 2034
    .line 2035
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2036
    .line 2037
    .line 2038
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2039
    .line 2040
    .line 2041
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2042
    .line 2043
    .line 2044
    move-result-object v37

    .line 2045
    invoke-static/range {v26 .. v26}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 2046
    .line 2047
    .line 2048
    move-result-object v2

    .line 2049
    check-cast v2, Ljava/lang/String;

    .line 2050
    .line 2051
    if-nez v2, :cond_3b

    .line 2052
    .line 2053
    move-object/from16 v2, v27

    .line 2054
    .line 2055
    :cond_3b
    sget-object v3, La/ujn;->h:Ljava/lang/String;

    .line 2056
    .line 2057
    const/4 v14, 0x0

    .line 2058
    invoke-static {v2, v3, v14}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 2059
    .line 2060
    .line 2061
    move-result v3

    .line 2062
    if-eqz v3, :cond_3c

    .line 2063
    .line 2064
    :goto_27
    move-object/from16 v38, v2

    .line 2065
    .line 2066
    goto :goto_2a

    .line 2067
    :cond_3c
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 2068
    .line 2069
    .line 2070
    move-result v3

    .line 2071
    if-nez v3, :cond_3d

    .line 2072
    .line 2073
    goto :goto_28

    .line 2074
    :cond_3d
    sget-object v3, La/u0d;->a:Ljava/util/List;

    .line 2075
    .line 2076
    invoke-static {v2}, La/u0d;->c(Ljava/lang/String;)Z

    .line 2077
    .line 2078
    .line 2079
    move-result v3

    .line 2080
    if-eqz v3, :cond_3e

    .line 2081
    .line 2082
    :goto_28
    move-object/from16 v38, v27

    .line 2083
    .line 2084
    goto :goto_2a

    .line 2085
    :cond_3e
    const/4 v14, 0x1

    .line 2086
    invoke-static {v2, v12, v14}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 2087
    .line 2088
    .line 2089
    move-result v3

    .line 2090
    if-eqz v3, :cond_3f

    .line 2091
    .line 2092
    move-object/from16 v3, v18

    .line 2093
    .line 2094
    goto :goto_29

    .line 2095
    :cond_3f
    move-object/from16 v3, v43

    .line 2096
    .line 2097
    :goto_29
    sget-object v10, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 2098
    .line 2099
    sget-object v14, La/ujn;->h:Ljava/lang/String;

    .line 2100
    .line 2101
    filled-new-array {v14, v2}, [Ljava/lang/Object;

    .line 2102
    .line 2103
    .line 2104
    move-result-object v2

    .line 2105
    const/4 v14, 0x2

    .line 2106
    invoke-static {v2, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2107
    .line 2108
    .line 2109
    move-result-object v2

    .line 2110
    invoke-static {v10, v3, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 2111
    .line 2112
    .line 2113
    move-result-object v2

    .line 2114
    goto :goto_27

    .line 2115
    :goto_2a
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2116
    .line 2117
    sget-object v3, La/ujn;->h:Ljava/lang/String;

    .line 2118
    .line 2119
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2120
    .line 2121
    .line 2122
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 2123
    .line 2124
    invoke-virtual {v11, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 2125
    .line 2126
    .line 2127
    move-result-object v3

    .line 2128
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2129
    .line 2130
    .line 2131
    new-instance v10, Ljava/lang/StringBuilder;

    .line 2132
    .line 2133
    invoke-direct {v10, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2134
    .line 2135
    .line 2136
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2137
    .line 2138
    .line 2139
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2140
    .line 2141
    .line 2142
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2143
    .line 2144
    .line 2145
    move-result-object v3

    .line 2146
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 2147
    .line 2148
    .line 2149
    move-result v10

    .line 2150
    if-nez v10, :cond_40

    .line 2151
    .line 2152
    const/4 v14, 0x0

    .line 2153
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 2154
    .line 2155
    .line 2156
    goto :goto_2e

    .line 2157
    :cond_40
    const/4 v14, 0x0

    .line 2158
    sget-object v10, La/ujn;->h:Ljava/lang/String;

    .line 2159
    .line 2160
    invoke-static {v3, v10, v14}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 2161
    .line 2162
    .line 2163
    move-result v10

    .line 2164
    if-nez v10, :cond_43

    .line 2165
    .line 2166
    invoke-static {v3, v6, v14}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 2167
    .line 2168
    .line 2169
    move-result v10

    .line 2170
    if-eqz v10, :cond_41

    .line 2171
    .line 2172
    const/4 v14, 0x0

    .line 2173
    goto :goto_2d

    .line 2174
    :cond_41
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    .line 2175
    .line 2176
    .line 2177
    move-result v10

    .line 2178
    if-lez v10, :cond_42

    .line 2179
    .line 2180
    invoke-static {v2, v8}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 2181
    .line 2182
    .line 2183
    move-result v10

    .line 2184
    if-nez v10, :cond_42

    .line 2185
    .line 2186
    const/16 v13, 0x2f

    .line 2187
    .line 2188
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 2189
    .line 2190
    .line 2191
    :goto_2b
    const/4 v14, 0x1

    .line 2192
    goto :goto_2c

    .line 2193
    :cond_42
    const/16 v13, 0x2f

    .line 2194
    .line 2195
    goto :goto_2b

    .line 2196
    :goto_2c
    new-array v10, v14, [C

    .line 2197
    .line 2198
    const/4 v14, 0x0

    .line 2199
    aput-char v13, v10, v14

    .line 2200
    .line 2201
    invoke-static {v3, v10}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 2202
    .line 2203
    .line 2204
    move-result-object v3

    .line 2205
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2206
    .line 2207
    .line 2208
    goto :goto_2e

    .line 2209
    :cond_43
    :goto_2d
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 2210
    .line 2211
    .line 2212
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2213
    .line 2214
    .line 2215
    :goto_2e
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2216
    .line 2217
    .line 2218
    move-result-object v39

    .line 2219
    sget-object v41, La/oud0;->b:La/oud0;

    .line 2220
    .line 2221
    sget-object v42, La/nud0;->b:La/nud0;

    .line 2222
    .line 2223
    new-instance v36, La/pud0;

    .line 2224
    .line 2225
    move-object/from16 v40, v11

    .line 2226
    .line 2227
    invoke-direct/range {v36 .. v42}, La/pud0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/oud0;La/nud0;)V

    .line 2228
    .line 2229
    .line 2230
    move-object/from16 v2, v36

    .line 2231
    .line 2232
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2233
    .line 2234
    .line 2235
    move-object/from16 v3, v20

    .line 2236
    .line 2237
    move/from16 v10, v21

    .line 2238
    .line 2239
    const/16 v2, 0xa

    .line 2240
    .line 2241
    goto/16 :goto_26

    .line 2242
    .line 2243
    :cond_44
    invoke-static {}, La/q3d;->p()V

    .line 2244
    .line 2245
    .line 2246
    throw v25

    .line 2247
    :cond_45
    move-object/from16 v2, v32

    .line 2248
    .line 2249
    iget-object v3, v2, La/ivd0;->i:Ljava/util/List;

    .line 2250
    .line 2251
    new-instance v10, Ljava/util/ArrayList;

    .line 2252
    .line 2253
    const/16 v11, 0xa

    .line 2254
    .line 2255
    invoke-static {v3, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2256
    .line 2257
    .line 2258
    move-result v11

    .line 2259
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 2260
    .line 2261
    .line 2262
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2263
    .line 2264
    .line 2265
    move-result-object v3

    .line 2266
    const/4 v11, 0x0

    .line 2267
    :goto_2f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 2268
    .line 2269
    .line 2270
    move-result v14

    .line 2271
    if-eqz v14, :cond_50

    .line 2272
    .line 2273
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2274
    .line 2275
    .line 2276
    move-result-object v14

    .line 2277
    add-int/lit8 v19, v11, 0x1

    .line 2278
    .line 2279
    if-ltz v11, :cond_4f

    .line 2280
    .line 2281
    check-cast v14, La/wud0;

    .line 2282
    .line 2283
    move-object/from16 v20, v3

    .line 2284
    .line 2285
    iget v3, v14, La/wud0;->a:I

    .line 2286
    .line 2287
    iget-object v14, v14, La/wud0;->b:Ljava/lang/String;

    .line 2288
    .line 2289
    move-object/from16 v21, v1

    .line 2290
    .line 2291
    new-instance v1, Ljava/lang/StringBuilder;

    .line 2292
    .line 2293
    move-object/from16 v32, v7

    .line 2294
    .line 2295
    const-string v7, "second_team_ban_"

    .line 2296
    .line 2297
    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2298
    .line 2299
    .line 2300
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2301
    .line 2302
    .line 2303
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2304
    .line 2305
    .line 2306
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2307
    .line 2308
    .line 2309
    move-result-object v37

    .line 2310
    invoke-static/range {p0 .. p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 2311
    .line 2312
    .line 2313
    move-result-object v1

    .line 2314
    check-cast v1, Ljava/lang/String;

    .line 2315
    .line 2316
    if-nez v1, :cond_46

    .line 2317
    .line 2318
    move-object/from16 v1, v27

    .line 2319
    .line 2320
    :cond_46
    sget-object v3, La/ujn;->h:Ljava/lang/String;

    .line 2321
    .line 2322
    const/4 v7, 0x0

    .line 2323
    invoke-static {v1, v3, v7}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 2324
    .line 2325
    .line 2326
    move-result v3

    .line 2327
    if-eqz v3, :cond_47

    .line 2328
    .line 2329
    move-object/from16 v38, v1

    .line 2330
    .line 2331
    :goto_30
    const/4 v11, 0x2

    .line 2332
    goto :goto_33

    .line 2333
    :cond_47
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 2334
    .line 2335
    .line 2336
    move-result v3

    .line 2337
    if-nez v3, :cond_48

    .line 2338
    .line 2339
    goto :goto_31

    .line 2340
    :cond_48
    sget-object v3, La/u0d;->a:Ljava/util/List;

    .line 2341
    .line 2342
    invoke-static {v1}, La/u0d;->c(Ljava/lang/String;)Z

    .line 2343
    .line 2344
    .line 2345
    move-result v3

    .line 2346
    if-eqz v3, :cond_49

    .line 2347
    .line 2348
    :goto_31
    move-object/from16 v38, v27

    .line 2349
    .line 2350
    goto :goto_30

    .line 2351
    :cond_49
    const/4 v3, 0x1

    .line 2352
    invoke-static {v1, v12, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 2353
    .line 2354
    .line 2355
    move-result v7

    .line 2356
    if-eqz v7, :cond_4a

    .line 2357
    .line 2358
    move-object/from16 v3, v18

    .line 2359
    .line 2360
    goto :goto_32

    .line 2361
    :cond_4a
    move-object/from16 v3, v43

    .line 2362
    .line 2363
    :goto_32
    sget-object v7, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 2364
    .line 2365
    sget-object v11, La/ujn;->h:Ljava/lang/String;

    .line 2366
    .line 2367
    filled-new-array {v11, v1}, [Ljava/lang/Object;

    .line 2368
    .line 2369
    .line 2370
    move-result-object v1

    .line 2371
    const/4 v11, 0x2

    .line 2372
    invoke-static {v1, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2373
    .line 2374
    .line 2375
    move-result-object v1

    .line 2376
    invoke-static {v7, v3, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 2377
    .line 2378
    .line 2379
    move-result-object v1

    .line 2380
    move-object/from16 v38, v1

    .line 2381
    .line 2382
    :goto_33
    new-instance v1, Ljava/lang/StringBuilder;

    .line 2383
    .line 2384
    sget-object v3, La/ujn;->h:Ljava/lang/String;

    .line 2385
    .line 2386
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2387
    .line 2388
    .line 2389
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 2390
    .line 2391
    invoke-virtual {v14, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 2392
    .line 2393
    .line 2394
    move-result-object v3

    .line 2395
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2396
    .line 2397
    .line 2398
    new-instance v7, Ljava/lang/StringBuilder;

    .line 2399
    .line 2400
    invoke-direct {v7, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2401
    .line 2402
    .line 2403
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2404
    .line 2405
    .line 2406
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2407
    .line 2408
    .line 2409
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2410
    .line 2411
    .line 2412
    move-result-object v3

    .line 2413
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 2414
    .line 2415
    .line 2416
    move-result v7

    .line 2417
    if-nez v7, :cond_4b

    .line 2418
    .line 2419
    const/4 v7, 0x0

    .line 2420
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 2421
    .line 2422
    .line 2423
    goto :goto_36

    .line 2424
    :cond_4b
    const/4 v7, 0x0

    .line 2425
    sget-object v11, La/ujn;->h:Ljava/lang/String;

    .line 2426
    .line 2427
    invoke-static {v3, v11, v7}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 2428
    .line 2429
    .line 2430
    move-result v11

    .line 2431
    if-nez v11, :cond_4e

    .line 2432
    .line 2433
    invoke-static {v3, v6, v7}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 2434
    .line 2435
    .line 2436
    move-result v11

    .line 2437
    if-eqz v11, :cond_4c

    .line 2438
    .line 2439
    const/4 v11, 0x0

    .line 2440
    goto :goto_35

    .line 2441
    :cond_4c
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 2442
    .line 2443
    .line 2444
    move-result v7

    .line 2445
    if-lez v7, :cond_4d

    .line 2446
    .line 2447
    invoke-static {v1, v8}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 2448
    .line 2449
    .line 2450
    move-result v7

    .line 2451
    if-nez v7, :cond_4d

    .line 2452
    .line 2453
    const/16 v7, 0x2f

    .line 2454
    .line 2455
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 2456
    .line 2457
    .line 2458
    move/from16 v17, v7

    .line 2459
    .line 2460
    const/4 v11, 0x1

    .line 2461
    goto :goto_34

    .line 2462
    :cond_4d
    const/4 v11, 0x1

    .line 2463
    const/16 v17, 0x2f

    .line 2464
    .line 2465
    :goto_34
    new-array v7, v11, [C

    .line 2466
    .line 2467
    const/4 v11, 0x0

    .line 2468
    aput-char v17, v7, v11

    .line 2469
    .line 2470
    invoke-static {v3, v7}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 2471
    .line 2472
    .line 2473
    move-result-object v3

    .line 2474
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2475
    .line 2476
    .line 2477
    goto :goto_36

    .line 2478
    :cond_4e
    move v11, v7

    .line 2479
    :goto_35
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 2480
    .line 2481
    .line 2482
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2483
    .line 2484
    .line 2485
    :goto_36
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2486
    .line 2487
    .line 2488
    move-result-object v39

    .line 2489
    sget-object v41, La/oud0;->b:La/oud0;

    .line 2490
    .line 2491
    sget-object v42, La/nud0;->b:La/nud0;

    .line 2492
    .line 2493
    new-instance v36, La/pud0;

    .line 2494
    .line 2495
    move-object/from16 v40, v14

    .line 2496
    .line 2497
    invoke-direct/range {v36 .. v42}, La/pud0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/oud0;La/nud0;)V

    .line 2498
    .line 2499
    .line 2500
    move-object/from16 v1, v36

    .line 2501
    .line 2502
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2503
    .line 2504
    .line 2505
    move/from16 v11, v19

    .line 2506
    .line 2507
    move-object/from16 v3, v20

    .line 2508
    .line 2509
    move-object/from16 v1, v21

    .line 2510
    .line 2511
    move-object/from16 v7, v32

    .line 2512
    .line 2513
    goto/16 :goto_2f

    .line 2514
    .line 2515
    :cond_4f
    invoke-static {}, La/q3d;->p()V

    .line 2516
    .line 2517
    .line 2518
    throw v25

    .line 2519
    :cond_50
    move-object/from16 v21, v1

    .line 2520
    .line 2521
    move-object/from16 v32, v7

    .line 2522
    .line 2523
    invoke-static {v9, v10}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 2524
    .line 2525
    .line 2526
    move-result-object v0

    .line 2527
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 2528
    .line 2529
    .line 2530
    move-result-object v0

    .line 2531
    new-instance v1, La/qud0;

    .line 2532
    .line 2533
    const-string v3, "BANS_OPERATIVES"

    .line 2534
    .line 2535
    invoke-direct {v1, v0, v3}, La/qud0;-><init>(La/i4;Ljava/lang/String;)V

    .line 2536
    .line 2537
    .line 2538
    move-object v0, v1

    .line 2539
    goto :goto_37

    .line 2540
    :cond_51
    move-object/from16 v21, v1

    .line 2541
    .line 2542
    move-object/from16 v2, v32

    .line 2543
    .line 2544
    move-object/from16 v32, v7

    .line 2545
    .line 2546
    move-object/from16 v0, v25

    .line 2547
    .line 2548
    :goto_37
    if-nez v0, :cond_52

    .line 2549
    .line 2550
    goto :goto_38

    .line 2551
    :cond_52
    new-instance v1, La/psv;

    .line 2552
    .line 2553
    const-string v3, "BANS_HEADER"

    .line 2554
    .line 2555
    const v6, 0x7f13021b

    .line 2556
    .line 2557
    .line 2558
    invoke-direct {v1, v3, v6}, La/psv;-><init>(Ljava/lang/String;I)V

    .line 2559
    .line 2560
    .line 2561
    invoke-virtual {v4, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2562
    .line 2563
    .line 2564
    invoke-virtual {v4, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2565
    .line 2566
    .line 2567
    invoke-virtual {v4, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2568
    .line 2569
    .line 2570
    :goto_38
    move-object/from16 v7, v32

    .line 2571
    .line 2572
    goto/16 :goto_19

    .line 2573
    .line 2574
    :pswitch_8
    move-object/from16 v33, p1

    .line 2575
    .line 2576
    move-object/from16 v28, v0

    .line 2577
    .line 2578
    move-object/from16 v21, v1

    .line 2579
    .line 2580
    move-object/from16 v31, v3

    .line 2581
    .line 2582
    move-object/from16 v30, v5

    .line 2583
    .line 2584
    move-object/from16 v32, v7

    .line 2585
    .line 2586
    move/from16 v23, v11

    .line 2587
    .line 2588
    move-object/from16 v35, v13

    .line 2589
    .line 2590
    move-object/from16 v34, v14

    .line 2591
    .line 2592
    move-object/from16 v29, v15

    .line 2593
    .line 2594
    move-object/from16 v22, v24

    .line 2595
    .line 2596
    move-object/from16 v4, v26

    .line 2597
    .line 2598
    move/from16 v24, v9

    .line 2599
    .line 2600
    move-object v15, v10

    .line 2601
    move-object/from16 v26, v12

    .line 2602
    .line 2603
    invoke-static/range {v33 .. v33}, La/x2x;->e0(La/bvd0;)Z

    .line 2604
    .line 2605
    .line 2606
    move-result v0

    .line 2607
    if-eqz v0, :cond_54

    .line 2608
    .line 2609
    :cond_53
    :goto_39
    move-object/from16 v3, v35

    .line 2610
    .line 2611
    goto/16 :goto_4c

    .line 2612
    .line 2613
    :cond_54
    sget-object v0, La/rvd0;->a:La/rvd0;

    .line 2614
    .line 2615
    iget-object v1, v15, La/ivd0;->h:La/rvd0;

    .line 2616
    .line 2617
    if-ne v1, v0, :cond_55

    .line 2618
    .line 2619
    move-object v10, v15

    .line 2620
    goto :goto_3a

    .line 2621
    :cond_55
    move-object/from16 v10, v25

    .line 2622
    .line 2623
    :goto_3a
    if-nez v10, :cond_57

    .line 2624
    .line 2625
    iget-object v3, v2, La/ivd0;->h:La/rvd0;

    .line 2626
    .line 2627
    if-ne v3, v0, :cond_56

    .line 2628
    .line 2629
    move-object v10, v2

    .line 2630
    goto :goto_3b

    .line 2631
    :cond_56
    move-object/from16 v10, v25

    .line 2632
    .line 2633
    :cond_57
    :goto_3b
    sget-object v0, La/rvd0;->b:La/rvd0;

    .line 2634
    .line 2635
    if-ne v1, v0, :cond_58

    .line 2636
    .line 2637
    move-object v1, v15

    .line 2638
    goto :goto_3c

    .line 2639
    :cond_58
    move-object/from16 v1, v25

    .line 2640
    .line 2641
    :goto_3c
    if-nez v1, :cond_5a

    .line 2642
    .line 2643
    iget-object v1, v2, La/ivd0;->h:La/rvd0;

    .line 2644
    .line 2645
    if-ne v1, v0, :cond_59

    .line 2646
    .line 2647
    move-object v1, v2

    .line 2648
    goto :goto_3d

    .line 2649
    :cond_59
    move-object/from16 v1, v25

    .line 2650
    .line 2651
    :cond_5a
    :goto_3d
    if-eqz v10, :cond_53

    .line 2652
    .line 2653
    if-nez v1, :cond_5b

    .line 2654
    .line 2655
    goto :goto_39

    .line 2656
    :cond_5b
    move-object/from16 v3, v35

    .line 2657
    .line 2658
    iget v0, v3, La/rud0;->a:I

    .line 2659
    .line 2660
    sget-object v5, La/jqs;->a:La/zfg0;

    .line 2661
    .line 2662
    iget-object v5, v10, La/ivd0;->f:Ljava/util/Map;

    .line 2663
    .line 2664
    new-instance v7, Ljava/util/ArrayList;

    .line 2665
    .line 2666
    invoke-interface {v5}, Ljava/util/Map;->size()I

    .line 2667
    .line 2668
    .line 2669
    move-result v9

    .line 2670
    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 2671
    .line 2672
    .line 2673
    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 2674
    .line 2675
    .line 2676
    move-result-object v5

    .line 2677
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 2678
    .line 2679
    .line 2680
    move-result-object v5

    .line 2681
    :goto_3e
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 2682
    .line 2683
    .line 2684
    move-result v9

    .line 2685
    if-eqz v9, :cond_5d

    .line 2686
    .line 2687
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2688
    .line 2689
    .line 2690
    move-result-object v9

    .line 2691
    check-cast v9, Ljava/util/Map$Entry;

    .line 2692
    .line 2693
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2694
    .line 2695
    .line 2696
    move-result-object v12

    .line 2697
    check-cast v12, Ljava/lang/Number;

    .line 2698
    .line 2699
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 2700
    .line 2701
    .line 2702
    move-result v12

    .line 2703
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 2704
    .line 2705
    .line 2706
    move-result-object v9

    .line 2707
    check-cast v9, Ljava/lang/Number;

    .line 2708
    .line 2709
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 2710
    .line 2711
    .line 2712
    move-result v9

    .line 2713
    iget-object v13, v1, La/ivd0;->f:Ljava/util/Map;

    .line 2714
    .line 2715
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2716
    .line 2717
    .line 2718
    move-result-object v14

    .line 2719
    invoke-interface {v13, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2720
    .line 2721
    .line 2722
    move-result-object v13

    .line 2723
    check-cast v13, Ljava/lang/Integer;

    .line 2724
    .line 2725
    if-eqz v13, :cond_5c

    .line 2726
    .line 2727
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 2728
    .line 2729
    .line 2730
    move-result v11

    .line 2731
    goto :goto_3f

    .line 2732
    :cond_5c
    const/4 v11, 0x5

    .line 2733
    :goto_3f
    invoke-static {v12, v9, v11}, La/jqs;->a(III)La/zfg0;

    .line 2734
    .line 2735
    .line 2736
    move-result-object v9

    .line 2737
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2738
    .line 2739
    .line 2740
    goto :goto_3e

    .line 2741
    :cond_5d
    iget-object v5, v10, La/ivd0;->g:Ljava/util/Map;

    .line 2742
    .line 2743
    new-instance v9, Ljava/util/ArrayList;

    .line 2744
    .line 2745
    invoke-interface {v5}, Ljava/util/Map;->size()I

    .line 2746
    .line 2747
    .line 2748
    move-result v12

    .line 2749
    invoke-direct {v9, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 2750
    .line 2751
    .line 2752
    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 2753
    .line 2754
    .line 2755
    move-result-object v5

    .line 2756
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 2757
    .line 2758
    .line 2759
    move-result-object v5

    .line 2760
    :goto_40
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 2761
    .line 2762
    .line 2763
    move-result v12

    .line 2764
    if-eqz v12, :cond_5f

    .line 2765
    .line 2766
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2767
    .line 2768
    .line 2769
    move-result-object v12

    .line 2770
    check-cast v12, Ljava/util/Map$Entry;

    .line 2771
    .line 2772
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2773
    .line 2774
    .line 2775
    move-result-object v13

    .line 2776
    check-cast v13, Ljava/lang/Number;

    .line 2777
    .line 2778
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 2779
    .line 2780
    .line 2781
    move-result v13

    .line 2782
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 2783
    .line 2784
    .line 2785
    move-result-object v12

    .line 2786
    check-cast v12, Ljava/lang/Number;

    .line 2787
    .line 2788
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 2789
    .line 2790
    .line 2791
    move-result v12

    .line 2792
    iget-object v14, v1, La/ivd0;->g:Ljava/util/Map;

    .line 2793
    .line 2794
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2795
    .line 2796
    .line 2797
    move-result-object v11

    .line 2798
    invoke-interface {v14, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2799
    .line 2800
    .line 2801
    move-result-object v11

    .line 2802
    check-cast v11, Ljava/lang/Integer;

    .line 2803
    .line 2804
    if-eqz v11, :cond_5e

    .line 2805
    .line 2806
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 2807
    .line 2808
    .line 2809
    move-result v11

    .line 2810
    goto :goto_41

    .line 2811
    :cond_5e
    const/4 v11, 0x5

    .line 2812
    :goto_41
    invoke-static {v13, v12, v11}, La/jqs;->a(III)La/zfg0;

    .line 2813
    .line 2814
    .line 2815
    move-result-object v11

    .line 2816
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2817
    .line 2818
    .line 2819
    goto :goto_40

    .line 2820
    :cond_5f
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 2821
    .line 2822
    .line 2823
    move-result-object v5

    .line 2824
    sget-object v11, La/jqs;->a:La/zfg0;

    .line 2825
    .line 2826
    invoke-virtual {v5, v11}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2827
    .line 2828
    .line 2829
    invoke-virtual {v5, v7}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 2830
    .line 2831
    .line 2832
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2833
    .line 2834
    .line 2835
    move-result v7

    .line 2836
    if-nez v7, :cond_60

    .line 2837
    .line 2838
    sget-object v7, La/jqs;->b:La/zfg0;

    .line 2839
    .line 2840
    invoke-virtual {v5, v7}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2841
    .line 2842
    .line 2843
    :cond_60
    invoke-static {v5, v5, v9}, La/cs0;->f(La/lc00;La/lc00;Ljava/util/ArrayList;)La/a4x;

    .line 2844
    .line 2845
    .line 2846
    move-result-object v5

    .line 2847
    new-instance v7, La/hgg0;

    .line 2848
    .line 2849
    new-instance v9, Ljava/lang/StringBuilder;

    .line 2850
    .line 2851
    sget-object v11, La/ujn;->h:Ljava/lang/String;

    .line 2852
    .line 2853
    invoke-direct {v9, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2854
    .line 2855
    .line 2856
    iget-object v10, v10, La/ivd0;->c:Ljava/util/List;

    .line 2857
    .line 2858
    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 2859
    .line 2860
    .line 2861
    move-result-object v10

    .line 2862
    check-cast v10, Ljava/lang/String;

    .line 2863
    .line 2864
    if-nez v10, :cond_61

    .line 2865
    .line 2866
    move-object/from16 v10, v27

    .line 2867
    .line 2868
    :cond_61
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 2869
    .line 2870
    .line 2871
    move-result v11

    .line 2872
    if-nez v11, :cond_62

    .line 2873
    .line 2874
    const/4 v14, 0x0

    .line 2875
    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 2876
    .line 2877
    .line 2878
    goto :goto_45

    .line 2879
    :cond_62
    const/4 v14, 0x0

    .line 2880
    sget-object v11, La/ujn;->h:Ljava/lang/String;

    .line 2881
    .line 2882
    invoke-static {v10, v11, v14}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 2883
    .line 2884
    .line 2885
    move-result v11

    .line 2886
    if-nez v11, :cond_65

    .line 2887
    .line 2888
    invoke-static {v10, v6, v14}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 2889
    .line 2890
    .line 2891
    move-result v11

    .line 2892
    if-eqz v11, :cond_63

    .line 2893
    .line 2894
    const/4 v14, 0x0

    .line 2895
    goto :goto_44

    .line 2896
    :cond_63
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->length()I

    .line 2897
    .line 2898
    .line 2899
    move-result v11

    .line 2900
    if-lez v11, :cond_64

    .line 2901
    .line 2902
    invoke-static {v9, v8}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 2903
    .line 2904
    .line 2905
    move-result v11

    .line 2906
    if-nez v11, :cond_64

    .line 2907
    .line 2908
    const/16 v13, 0x2f

    .line 2909
    .line 2910
    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 2911
    .line 2912
    .line 2913
    :goto_42
    const/4 v14, 0x1

    .line 2914
    goto :goto_43

    .line 2915
    :cond_64
    const/16 v13, 0x2f

    .line 2916
    .line 2917
    goto :goto_42

    .line 2918
    :goto_43
    new-array v11, v14, [C

    .line 2919
    .line 2920
    const/4 v14, 0x0

    .line 2921
    aput-char v13, v11, v14

    .line 2922
    .line 2923
    invoke-static {v10, v11}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 2924
    .line 2925
    .line 2926
    move-result-object v10

    .line 2927
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2928
    .line 2929
    .line 2930
    goto :goto_45

    .line 2931
    :cond_65
    :goto_44
    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 2932
    .line 2933
    .line 2934
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2935
    .line 2936
    .line 2937
    :goto_45
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2938
    .line 2939
    .line 2940
    move-result-object v9

    .line 2941
    new-instance v10, Ljava/lang/StringBuilder;

    .line 2942
    .line 2943
    sget-object v11, La/ujn;->h:Ljava/lang/String;

    .line 2944
    .line 2945
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2946
    .line 2947
    .line 2948
    iget-object v1, v1, La/ivd0;->c:Ljava/util/List;

    .line 2949
    .line 2950
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 2951
    .line 2952
    .line 2953
    move-result-object v1

    .line 2954
    check-cast v1, Ljava/lang/String;

    .line 2955
    .line 2956
    if-nez v1, :cond_66

    .line 2957
    .line 2958
    move-object/from16 v1, v27

    .line 2959
    .line 2960
    :cond_66
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 2961
    .line 2962
    .line 2963
    move-result v11

    .line 2964
    if-nez v11, :cond_67

    .line 2965
    .line 2966
    const/4 v14, 0x0

    .line 2967
    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 2968
    .line 2969
    .line 2970
    move v8, v14

    .line 2971
    const/4 v14, 0x1

    .line 2972
    goto :goto_4a

    .line 2973
    :cond_67
    const/4 v14, 0x0

    .line 2974
    sget-object v11, La/ujn;->h:Ljava/lang/String;

    .line 2975
    .line 2976
    invoke-static {v1, v11, v14}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 2977
    .line 2978
    .line 2979
    move-result v11

    .line 2980
    if-nez v11, :cond_6a

    .line 2981
    .line 2982
    invoke-static {v1, v6, v14}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 2983
    .line 2984
    .line 2985
    move-result v6

    .line 2986
    if-eqz v6, :cond_68

    .line 2987
    .line 2988
    const/4 v8, 0x0

    .line 2989
    :goto_46
    const/4 v14, 0x1

    .line 2990
    goto :goto_49

    .line 2991
    :cond_68
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->length()I

    .line 2992
    .line 2993
    .line 2994
    move-result v6

    .line 2995
    if-lez v6, :cond_69

    .line 2996
    .line 2997
    invoke-static {v10, v8}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 2998
    .line 2999
    .line 3000
    move-result v6

    .line 3001
    if-nez v6, :cond_69

    .line 3002
    .line 3003
    const/16 v13, 0x2f

    .line 3004
    .line 3005
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 3006
    .line 3007
    .line 3008
    :goto_47
    const/4 v14, 0x1

    .line 3009
    goto :goto_48

    .line 3010
    :cond_69
    const/16 v13, 0x2f

    .line 3011
    .line 3012
    goto :goto_47

    .line 3013
    :goto_48
    new-array v6, v14, [C

    .line 3014
    .line 3015
    const/4 v8, 0x0

    .line 3016
    aput-char v13, v6, v8

    .line 3017
    .line 3018
    invoke-static {v1, v6}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 3019
    .line 3020
    .line 3021
    move-result-object v1

    .line 3022
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3023
    .line 3024
    .line 3025
    goto :goto_4a

    .line 3026
    :cond_6a
    move v8, v14

    .line 3027
    goto :goto_46

    .line 3028
    :goto_49
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 3029
    .line 3030
    .line 3031
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3032
    .line 3033
    .line 3034
    :goto_4a
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3035
    .line 3036
    .line 3037
    move-result-object v1

    .line 3038
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 3039
    .line 3040
    .line 3041
    move-result v6

    .line 3042
    if-le v6, v0, :cond_6b

    .line 3043
    .line 3044
    move v6, v14

    .line 3045
    goto :goto_4b

    .line 3046
    :cond_6b
    move v6, v8

    .line 3047
    :goto_4b
    invoke-direct {v7, v5, v9, v1, v6}, La/hgg0;-><init>(La/a4x;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3048
    .line 3049
    .line 3050
    new-instance v0, La/psv;

    .line 3051
    .line 3052
    const-string v1, "STATISTIC_ROUND_STAT_HEADER"

    .line 3053
    .line 3054
    const v5, 0x7f13119f

    .line 3055
    .line 3056
    .line 3057
    invoke-direct {v0, v1, v5}, La/psv;-><init>(Ljava/lang/String;I)V

    .line 3058
    .line 3059
    .line 3060
    invoke-virtual {v4, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3061
    .line 3062
    .line 3063
    invoke-virtual {v4, v7}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3064
    .line 3065
    .line 3066
    :cond_6c
    :goto_4c
    move-object/from16 v7, v32

    .line 3067
    .line 3068
    goto/16 :goto_51

    .line 3069
    .line 3070
    :pswitch_9
    move-object/from16 v33, p1

    .line 3071
    .line 3072
    move-object/from16 v28, v0

    .line 3073
    .line 3074
    move-object/from16 v21, v1

    .line 3075
    .line 3076
    move-object/from16 v31, v3

    .line 3077
    .line 3078
    move-object/from16 v30, v5

    .line 3079
    .line 3080
    move-object/from16 v32, v7

    .line 3081
    .line 3082
    move/from16 v23, v11

    .line 3083
    .line 3084
    move-object v3, v13

    .line 3085
    move-object/from16 v34, v14

    .line 3086
    .line 3087
    move-object/from16 v29, v15

    .line 3088
    .line 3089
    move-object/from16 v22, v24

    .line 3090
    .line 3091
    move-object/from16 v4, v26

    .line 3092
    .line 3093
    move/from16 v24, v9

    .line 3094
    .line 3095
    move-object v15, v10

    .line 3096
    move-object/from16 v26, v12

    .line 3097
    .line 3098
    invoke-static/range {v33 .. v33}, La/x2x;->f0(La/bvd0;)Z

    .line 3099
    .line 3100
    .line 3101
    move-result v0

    .line 3102
    if-eqz v0, :cond_6d

    .line 3103
    .line 3104
    goto :goto_4c

    .line 3105
    :cond_6d
    sget-object v0, La/rvd0;->a:La/rvd0;

    .line 3106
    .line 3107
    iget-object v1, v15, La/ivd0;->h:La/rvd0;

    .line 3108
    .line 3109
    if-ne v1, v0, :cond_6e

    .line 3110
    .line 3111
    move-object v10, v15

    .line 3112
    goto :goto_4d

    .line 3113
    :cond_6e
    move-object/from16 v10, v25

    .line 3114
    .line 3115
    :goto_4d
    if-nez v10, :cond_70

    .line 3116
    .line 3117
    iget-object v5, v2, La/ivd0;->h:La/rvd0;

    .line 3118
    .line 3119
    if-ne v5, v0, :cond_6f

    .line 3120
    .line 3121
    move-object v10, v2

    .line 3122
    goto :goto_4e

    .line 3123
    :cond_6f
    move-object/from16 v10, v25

    .line 3124
    .line 3125
    :cond_70
    :goto_4e
    sget-object v0, La/rvd0;->b:La/rvd0;

    .line 3126
    .line 3127
    if-ne v1, v0, :cond_71

    .line 3128
    .line 3129
    move-object v1, v15

    .line 3130
    goto :goto_4f

    .line 3131
    :cond_71
    move-object/from16 v1, v25

    .line 3132
    .line 3133
    :goto_4f
    if-nez v1, :cond_73

    .line 3134
    .line 3135
    iget-object v1, v2, La/ivd0;->h:La/rvd0;

    .line 3136
    .line 3137
    if-ne v1, v0, :cond_72

    .line 3138
    .line 3139
    move-object v1, v2

    .line 3140
    goto :goto_50

    .line 3141
    :cond_72
    move-object/from16 v1, v25

    .line 3142
    .line 3143
    :cond_73
    :goto_50
    if-eqz v10, :cond_6c

    .line 3144
    .line 3145
    if-nez v1, :cond_74

    .line 3146
    .line 3147
    goto :goto_4c

    .line 3148
    :cond_74
    sget-object v0, La/amo0;->b:La/amo0;

    .line 3149
    .line 3150
    move-object/from16 v7, v32

    .line 3151
    .line 3152
    invoke-static {v10, v0, v7}, La/d7x;->s(La/ivd0;La/amo0;La/ctf0;)La/jlo0;

    .line 3153
    .line 3154
    .line 3155
    move-result-object v0

    .line 3156
    sget-object v5, La/amo0;->a:La/amo0;

    .line 3157
    .line 3158
    invoke-static {v1, v5, v7}, La/d7x;->s(La/ivd0;La/amo0;La/ctf0;)La/jlo0;

    .line 3159
    .line 3160
    .line 3161
    move-result-object v1

    .line 3162
    new-instance v5, La/psv;

    .line 3163
    .line 3164
    const-string v6, "STATISTIC_HEADER"

    .line 3165
    .line 3166
    const v8, 0x7f1313ae

    .line 3167
    .line 3168
    .line 3169
    invoke-direct {v5, v6, v8}, La/psv;-><init>(Ljava/lang/String;I)V

    .line 3170
    .line 3171
    .line 3172
    invoke-virtual {v4, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3173
    .line 3174
    .line 3175
    invoke-virtual {v4, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3176
    .line 3177
    .line 3178
    invoke-virtual {v4, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3179
    .line 3180
    .line 3181
    :goto_51
    move-object v13, v3

    .line 3182
    move-object v10, v15

    .line 3183
    move-object/from16 v1, v21

    .line 3184
    .line 3185
    move/from16 v11, v23

    .line 3186
    .line 3187
    move/from16 v9, v24

    .line 3188
    .line 3189
    move-object/from16 v12, v26

    .line 3190
    .line 3191
    move-object/from16 v0, v28

    .line 3192
    .line 3193
    move-object/from16 v15, v29

    .line 3194
    .line 3195
    move-object/from16 v5, v30

    .line 3196
    .line 3197
    move-object/from16 v3, v31

    .line 3198
    .line 3199
    move-object/from16 p1, v33

    .line 3200
    .line 3201
    move-object/from16 v14, v34

    .line 3202
    .line 3203
    move-object/from16 v26, v4

    .line 3204
    .line 3205
    move-object/from16 v24, v22

    .line 3206
    .line 3207
    goto/16 :goto_7

    .line 3208
    .line 3209
    :cond_75
    move-object/from16 v21, v1

    .line 3210
    .line 3211
    move-object v0, v3

    .line 3212
    move-object/from16 v29, v15

    .line 3213
    .line 3214
    move-object/from16 v4, v26

    .line 3215
    .line 3216
    iget-boolean v0, v0, La/vvd0;->b:Z

    .line 3217
    .line 3218
    new-instance v1, Ljava/util/ArrayList;

    .line 3219
    .line 3220
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 3221
    .line 3222
    .line 3223
    move-object/from16 v2, v21

    .line 3224
    .line 3225
    iget v2, v2, La/m9s;->D:I

    .line 3226
    .line 3227
    if-lez v2, :cond_76

    .line 3228
    .line 3229
    if-eqz v0, :cond_76

    .line 3230
    .line 3231
    invoke-static {v7}, La/feb;->K(La/ctf0;)La/rx;

    .line 3232
    .line 3233
    .line 3234
    move-result-object v2

    .line 3235
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3236
    .line 3237
    .line 3238
    :cond_76
    if-eqz v0, :cond_77

    .line 3239
    .line 3240
    move-object/from16 v0, v29

    .line 3241
    .line 3242
    invoke-static {v7, v0}, La/n7x;->w(La/ctf0;Ljava/util/List;)La/rx;

    .line 3243
    .line 3244
    .line 3245
    move-result-object v0

    .line 3246
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3247
    .line 3248
    .line 3249
    :cond_77
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 3250
    .line 3251
    .line 3252
    move-result v0

    .line 3253
    if-eqz v0, :cond_78

    .line 3254
    .line 3255
    goto :goto_52

    .line 3256
    :cond_78
    new-instance v0, La/psv;

    .line 3257
    .line 3258
    const-string v2, "ADDITIONAL_INFO_HEADER"

    .line 3259
    .line 3260
    const v3, 0x7f13006f

    .line 3261
    .line 3262
    .line 3263
    invoke-direct {v0, v2, v3}, La/psv;-><init>(Ljava/lang/String;I)V

    .line 3264
    .line 3265
    .line 3266
    invoke-virtual {v4, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3267
    .line 3268
    .line 3269
    new-instance v0, La/wy;

    .line 3270
    .line 3271
    const-string v2, "ADDITIONAL_INFO"

    .line 3272
    .line 3273
    invoke-static {v1}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 3274
    .line 3275
    .line 3276
    move-result-object v1

    .line 3277
    invoke-direct {v0, v1, v2}, La/wy;-><init>(La/i4;Ljava/lang/String;)V

    .line 3278
    .line 3279
    .line 3280
    invoke-virtual {v4, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3281
    .line 3282
    .line 3283
    :goto_52
    invoke-static {v4}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 3284
    .line 3285
    .line 3286
    move-result-object v0

    .line 3287
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 3288
    .line 3289
    .line 3290
    move-result-object v2

    .line 3291
    goto :goto_53

    .line 3292
    :cond_79
    sget-object v2, La/lak0;->c:La/lak0;

    .line 3293
    .line 3294
    :goto_53
    return-object v2

    .line 3295
    :pswitch_a
    move-object/from16 v1, p1

    .line 3296
    .line 3297
    check-cast v1, La/fee;

    .line 3298
    .line 3299
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3300
    .line 3301
    .line 3302
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 3303
    .line 3304
    .line 3305
    move-result-object v1

    .line 3306
    move-object v2, v1

    .line 3307
    check-cast v2, La/jlr;

    .line 3308
    .line 3309
    iget-object v1, v0, La/v6o;->g:La/n0o0;

    .line 3310
    .line 3311
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3312
    .line 3313
    .line 3314
    move-result-object v1

    .line 3315
    check-cast v1, La/fee;

    .line 3316
    .line 3317
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 3318
    .line 3319
    .line 3320
    move-result-object v1

    .line 3321
    check-cast v1, Ljava/lang/Boolean;

    .line 3322
    .line 3323
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 3324
    .line 3325
    .line 3326
    move-result v3

    .line 3327
    iget-object v1, v0, La/v6o;->D:Ljava/lang/Object;

    .line 3328
    .line 3329
    check-cast v1, La/qyd0;

    .line 3330
    .line 3331
    iget-object v4, v1, La/qyd0;->t:La/sff0;

    .line 3332
    .line 3333
    iget-boolean v4, v4, La/sff0;->J:Z

    .line 3334
    .line 3335
    iget-object v5, v0, La/v6o;->m:La/n0o0;

    .line 3336
    .line 3337
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3338
    .line 3339
    .line 3340
    move-result-object v5

    .line 3341
    check-cast v5, La/fee;

    .line 3342
    .line 3343
    invoke-virtual {v5}, La/fee;->c()Ljava/lang/Object;

    .line 3344
    .line 3345
    .line 3346
    move-result-object v5

    .line 3347
    check-cast v5, Ljava/lang/Boolean;

    .line 3348
    .line 3349
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 3350
    .line 3351
    .line 3352
    move-result v5

    .line 3353
    iget-object v6, v0, La/v6o;->n:La/n0o0;

    .line 3354
    .line 3355
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3356
    .line 3357
    .line 3358
    move-result-object v6

    .line 3359
    check-cast v6, La/fee;

    .line 3360
    .line 3361
    invoke-virtual {v6}, La/fee;->c()Ljava/lang/Object;

    .line 3362
    .line 3363
    .line 3364
    move-result-object v6

    .line 3365
    check-cast v6, Ljava/lang/Boolean;

    .line 3366
    .line 3367
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 3368
    .line 3369
    .line 3370
    move-result v6

    .line 3371
    iget-boolean v7, v1, La/qyd0;->w:Z

    .line 3372
    .line 3373
    iget-object v0, v0, La/v6o;->l:La/n0o0;

    .line 3374
    .line 3375
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3376
    .line 3377
    .line 3378
    move-result-object v0

    .line 3379
    check-cast v0, La/fee;

    .line 3380
    .line 3381
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 3382
    .line 3383
    .line 3384
    move-result-object v0

    .line 3385
    move-object v8, v0

    .line 3386
    check-cast v8, La/yws;

    .line 3387
    .line 3388
    invoke-static/range {v2 .. v8}, La/ulb;->j0(La/jlr;ZZZZZLa/yws;)La/its;

    .line 3389
    .line 3390
    .line 3391
    move-result-object v0

    .line 3392
    return-object v0

    .line 3393
    :pswitch_b
    const/16 v25, 0x0

    .line 3394
    .line 3395
    move-object/from16 v1, p1

    .line 3396
    .line 3397
    check-cast v1, La/fee;

    .line 3398
    .line 3399
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3400
    .line 3401
    .line 3402
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 3403
    .line 3404
    .line 3405
    move-result-object v1

    .line 3406
    check-cast v1, La/jlr;

    .line 3407
    .line 3408
    invoke-static {v1}, La/d5c;->C(La/jlr;)La/m9s;

    .line 3409
    .line 3410
    .line 3411
    move-result-object v2

    .line 3412
    iget-object v5, v0, La/v6o;->b:La/ctf0;

    .line 3413
    .line 3414
    iget-object v1, v0, La/v6o;->D:Ljava/lang/Object;

    .line 3415
    .line 3416
    check-cast v1, La/qyd0;

    .line 3417
    .line 3418
    if-eqz v2, :cond_7b

    .line 3419
    .line 3420
    iget-object v3, v0, La/v6o;->e:La/n0o0;

    .line 3421
    .line 3422
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3423
    .line 3424
    .line 3425
    move-result-object v3

    .line 3426
    check-cast v3, La/fee;

    .line 3427
    .line 3428
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 3429
    .line 3430
    .line 3431
    move-result-object v3

    .line 3432
    check-cast v3, La/vvd0;

    .line 3433
    .line 3434
    if-eqz v3, :cond_7a

    .line 3435
    .line 3436
    invoke-static {v3, v2}, La/lgb;->q0(La/vvd0;La/m9s;)La/la30;

    .line 3437
    .line 3438
    .line 3439
    move-result-object v3

    .line 3440
    goto :goto_54

    .line 3441
    :cond_7a
    move-object/from16 v3, v25

    .line 3442
    .line 3443
    :goto_54
    move-object v6, v3

    .line 3444
    goto :goto_55

    .line 3445
    :cond_7b
    move-object/from16 v6, v25

    .line 3446
    .line 3447
    :goto_55
    iget-object v3, v0, La/v6o;->g:La/n0o0;

    .line 3448
    .line 3449
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3450
    .line 3451
    .line 3452
    move-result-object v3

    .line 3453
    check-cast v3, La/fee;

    .line 3454
    .line 3455
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 3456
    .line 3457
    .line 3458
    move-result-object v3

    .line 3459
    check-cast v3, Ljava/lang/Boolean;

    .line 3460
    .line 3461
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 3462
    .line 3463
    .line 3464
    move-result v7

    .line 3465
    iget-object v3, v0, La/v6o;->j:La/n0o0;

    .line 3466
    .line 3467
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3468
    .line 3469
    .line 3470
    move-result-object v3

    .line 3471
    check-cast v3, La/fee;

    .line 3472
    .line 3473
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 3474
    .line 3475
    .line 3476
    move-result-object v3

    .line 3477
    move-object v8, v3

    .line 3478
    check-cast v8, Ljava/util/List;

    .line 3479
    .line 3480
    iget-boolean v9, v1, La/qyd0;->A:Z

    .line 3481
    .line 3482
    iget-object v0, v0, La/v6o;->f:La/n0o0;

    .line 3483
    .line 3484
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3485
    .line 3486
    .line 3487
    move-result-object v0

    .line 3488
    check-cast v0, La/fee;

    .line 3489
    .line 3490
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 3491
    .line 3492
    .line 3493
    move-result-object v0

    .line 3494
    check-cast v0, La/ypl0;

    .line 3495
    .line 3496
    iget-object v0, v0, La/ypl0;->c:La/lel0;

    .line 3497
    .line 3498
    iget-object v11, v0, La/lel0;->a:Ljava/lang/String;

    .line 3499
    .line 3500
    iget-object v12, v1, La/qyd0;->s:Ljava/lang/String;

    .line 3501
    .line 3502
    const/4 v3, 0x0

    .line 3503
    const/4 v4, 0x0

    .line 3504
    const/4 v10, 0x1

    .line 3505
    invoke-static/range {v2 .. v12}, La/hkb;->P(La/m9s;ZZLa/ctf0;La/la30;ZLjava/util/List;ZZLjava/lang/String;Ljava/lang/String;)La/zqg;

    .line 3506
    .line 3507
    .line 3508
    move-result-object v0

    .line 3509
    return-object v0

    .line 3510
    :pswitch_c
    move-object/from16 v1, p1

    .line 3511
    .line 3512
    check-cast v1, La/fee;

    .line 3513
    .line 3514
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3515
    .line 3516
    .line 3517
    new-instance v1, La/avs;

    .line 3518
    .line 3519
    iget-object v2, v0, La/v6o;->k:La/n0o0;

    .line 3520
    .line 3521
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3522
    .line 3523
    .line 3524
    move-result-object v2

    .line 3525
    check-cast v2, La/fee;

    .line 3526
    .line 3527
    iget-object v2, v2, La/fee;->d:La/pz40;

    .line 3528
    .line 3529
    iget-object v3, v0, La/v6o;->o:La/n0o0;

    .line 3530
    .line 3531
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3532
    .line 3533
    .line 3534
    move-result-object v3

    .line 3535
    check-cast v3, La/fee;

    .line 3536
    .line 3537
    iget-object v3, v3, La/fee;->d:La/pz40;

    .line 3538
    .line 3539
    iget-object v4, v0, La/v6o;->h:La/n0o0;

    .line 3540
    .line 3541
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3542
    .line 3543
    .line 3544
    move-result-object v4

    .line 3545
    check-cast v4, La/fee;

    .line 3546
    .line 3547
    iget-object v4, v4, La/fee;->d:La/pz40;

    .line 3548
    .line 3549
    iget-object v0, v0, La/v6o;->i:La/n0o0;

    .line 3550
    .line 3551
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3552
    .line 3553
    .line 3554
    move-result-object v0

    .line 3555
    check-cast v0, La/fee;

    .line 3556
    .line 3557
    iget-object v0, v0, La/fee;->d:La/pz40;

    .line 3558
    .line 3559
    invoke-direct {v1, v2, v3, v4, v0}, La/avs;-><init>(La/l7m0;La/l7m0;La/l7m0;La/l7m0;)V

    .line 3560
    .line 3561
    .line 3562
    return-object v1

    .line 3563
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 3564
    .line 3565
    .line 3566
    .line 3567
    .line 3568
    .line 3569
    .line 3570
    .line 3571
    .line 3572
    .line 3573
    .line 3574
    .line 3575
    .line 3576
    .line 3577
    :pswitch_data_1
    .packed-switch 0x0
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
