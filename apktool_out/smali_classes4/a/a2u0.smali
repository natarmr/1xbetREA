.class public final synthetic La/a2u0;
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
    iput-byte p2, p0, La/a2u0;->a:B

    iput-object p1, p0, La/a2u0;->b:La/v6o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 49

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/a2u0;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/a2u0;->b:La/v6o;

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
    check-cast v2, La/b0u0;

    .line 34
    .line 35
    iget-object v2, v2, La/b0u0;->r:La/sff0;

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
    sget-object v4, La/pb10;->s:La/pb10;

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
    const-wide/16 v6, 0x1b

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
    sget-object v4, La/pb10;->s:La/pb10;

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
    if-eqz v3, :cond_82

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
    iget-object v8, v0, La/v6o;->b:La/ctf0;

    .line 359
    .line 360
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v3

    .line 364
    check-cast v3, La/vxt0;

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
    check-cast v13, La/nxt0;

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
    check-cast v14, La/vzt0;

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
    invoke-virtual {v8}, La/ctf0;->j()Z

    .line 412
    .line 413
    .line 414
    move-result v4

    .line 415
    iget-object v5, v0, La/v6o;->l:La/n0o0;

    .line 416
    .line 417
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v5

    .line 421
    check-cast v5, La/fee;

    .line 422
    .line 423
    invoke-virtual {v5}, La/fee;->c()Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v5

    .line 427
    check-cast v5, La/yws;

    .line 428
    .line 429
    iget-object v0, v0, La/v6o;->D:Ljava/lang/Object;

    .line 430
    .line 431
    check-cast v0, La/b0u0;

    .line 432
    .line 433
    iget-boolean v11, v0, La/b0u0;->y:Z

    .line 434
    .line 435
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    iget-object v0, v1, La/m9s;->m:Ljava/util/List;

    .line 439
    .line 440
    iget-object v6, v1, La/m9s;->n:Ljava/util/List;

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
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
    goto/16 :goto_55

    .line 459
    .line 460
    :cond_8
    iget-object v7, v3, La/vxt0;->d:La/ljg;

    .line 461
    .line 462
    iget-object v9, v3, La/vxt0;->c:La/qrh;

    .line 463
    .line 464
    iget-object v10, v3, La/vxt0;->a:La/d0u0;

    .line 465
    .line 466
    iget-object v12, v10, La/d0u0;->c:La/g2u0;

    .line 467
    .line 468
    iget-object v2, v10, La/d0u0;->b:La/g2u0;

    .line 469
    .line 470
    move-object/from16 v24, v9

    .line 471
    .line 472
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 473
    .line 474
    .line 475
    move-result-object v9

    .line 476
    if-eqz v5, :cond_9

    .line 477
    .line 478
    iget-boolean v5, v5, La/yws;->c:Z

    .line 479
    .line 480
    if-nez v5, :cond_9

    .line 481
    .line 482
    goto :goto_2

    .line 483
    :cond_9
    new-instance v5, La/kxs;

    .line 484
    .line 485
    invoke-direct {v5}, La/kxs;-><init>()V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v9, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 489
    .line 490
    .line 491
    :goto_2
    new-instance v5, Ljava/util/ArrayList;

    .line 492
    .line 493
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 494
    .line 495
    .line 496
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 497
    .line 498
    .line 499
    move-result-object v16

    .line 500
    :goto_3
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 501
    .line 502
    .line 503
    move-result v17

    .line 504
    if-eqz v17, :cond_b

    .line 505
    .line 506
    move-object/from16 p0, v0

    .line 507
    .line 508
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    move/from16 p1, v4

    .line 513
    .line 514
    move-object v4, v0

    .line 515
    check-cast v4, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;

    .line 516
    .line 517
    iget-boolean v4, v4, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;->c:Z

    .line 518
    .line 519
    if-eqz v4, :cond_a

    .line 520
    .line 521
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 522
    .line 523
    .line 524
    :cond_a
    move-object/from16 v0, p0

    .line 525
    .line 526
    move/from16 v4, p1

    .line 527
    .line 528
    goto :goto_3

    .line 529
    :cond_b
    move-object/from16 p0, v0

    .line 530
    .line 531
    move/from16 p1, v4

    .line 532
    .line 533
    new-instance v0, La/jzt0;

    .line 534
    .line 535
    const/4 v4, 0x1

    .line 536
    invoke-direct {v0, v4}, La/jzt0;-><init>(B)V

    .line 537
    .line 538
    .line 539
    invoke-static {v5, v0}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    new-instance v5, Ljava/util/ArrayList;

    .line 544
    .line 545
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 546
    .line 547
    .line 548
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 553
    .line 554
    .line 555
    move-result v16

    .line 556
    if-eqz v16, :cond_f

    .line 557
    .line 558
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v16

    .line 562
    move-object/from16 v4, v16

    .line 563
    .line 564
    check-cast v4, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;

    .line 565
    .line 566
    sget-object v16, La/c0u0;->c:La/c0o;

    .line 567
    .line 568
    invoke-virtual/range {v16 .. v16}, La/b3;->iterator()Ljava/util/Iterator;

    .line 569
    .line 570
    .line 571
    move-result-object v16

    .line 572
    :goto_5
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 573
    .line 574
    .line 575
    move-result v17

    .line 576
    if-eqz v17, :cond_d

    .line 577
    .line 578
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v17

    .line 582
    move-object/from16 v18, v0

    .line 583
    .line 584
    move-object/from16 v0, v17

    .line 585
    .line 586
    check-cast v0, La/c0u0;

    .line 587
    .line 588
    iget-object v0, v0, La/c0u0;->a:La/t9m0;

    .line 589
    .line 590
    move-object/from16 v26, v6

    .line 591
    .line 592
    iget-object v6, v4, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;->a:La/t9m0;

    .line 593
    .line 594
    if-ne v0, v6, :cond_c

    .line 595
    .line 596
    goto :goto_6

    .line 597
    :cond_c
    move-object/from16 v0, v18

    .line 598
    .line 599
    move-object/from16 v6, v26

    .line 600
    .line 601
    goto :goto_5

    .line 602
    :cond_d
    move-object/from16 v18, v0

    .line 603
    .line 604
    move-object/from16 v26, v6

    .line 605
    .line 606
    const/16 v17, 0x0

    .line 607
    .line 608
    :goto_6
    move-object/from16 v0, v17

    .line 609
    .line 610
    check-cast v0, La/c0u0;

    .line 611
    .line 612
    if-eqz v0, :cond_e

    .line 613
    .line 614
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 615
    .line 616
    .line 617
    :cond_e
    move-object/from16 v0, v18

    .line 618
    .line 619
    move-object/from16 v6, v26

    .line 620
    .line 621
    const/4 v4, 0x1

    .line 622
    goto :goto_4

    .line 623
    :cond_f
    move-object/from16 v26, v6

    .line 624
    .line 625
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

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
    if-eqz v4, :cond_7e

    .line 634
    .line 635
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v4

    .line 639
    check-cast v4, La/c0u0;

    .line 640
    .line 641
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 642
    .line 643
    .line 644
    move-result v4

    .line 645
    const-string v5, ""

    .line 646
    .line 647
    if-eqz v4, :cond_54

    .line 648
    .line 649
    const/4 v6, 0x1

    .line 650
    if-eq v4, v6, :cond_48

    .line 651
    .line 652
    const v25, 0x7f080f7f

    .line 653
    .line 654
    .line 655
    const v28, 0x7f080f80

    .line 656
    .line 657
    .line 658
    const/4 v6, 0x2

    .line 659
    if-eq v4, v6, :cond_35

    .line 660
    .line 661
    const/4 v6, 0x3

    .line 662
    if-eq v4, v6, :cond_34

    .line 663
    .line 664
    const/4 v6, 0x4

    .line 665
    if-eq v4, v6, :cond_13

    .line 666
    .line 667
    const/4 v5, 0x5

    .line 668
    if-ne v4, v5, :cond_12

    .line 669
    .line 670
    iget-wide v4, v14, La/vzt0;->c:J

    .line 671
    .line 672
    iget-boolean v6, v14, La/vzt0;->d:Z

    .line 673
    .line 674
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 675
    .line 676
    .line 677
    invoke-static {v7, v1}, La/x2x;->b0(La/ljg;La/m9s;)Z

    .line 678
    .line 679
    .line 680
    move-result v16

    .line 681
    if-eqz v16, :cond_10

    .line 682
    .line 683
    move-object/from16 v30, v0

    .line 684
    .line 685
    goto :goto_8

    .line 686
    :cond_10
    move-object/from16 v30, v0

    .line 687
    .line 688
    sget-object v0, La/n2z;->a:Ljava/util/List;

    .line 689
    .line 690
    invoke-static {v7, v0}, La/n2z;->a(La/ljg;Ljava/util/List;)Ljava/util/ArrayList;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    invoke-static {v4, v5, v0}, La/n2z;->d(JLjava/util/ArrayList;)La/l2z;

    .line 695
    .line 696
    .line 697
    move-result-object v18

    .line 698
    if-nez v18, :cond_11

    .line 699
    .line 700
    :goto_8
    move-object/from16 v35, v2

    .line 701
    .line 702
    move-object/from16 v32, v3

    .line 703
    .line 704
    move-object v6, v7

    .line 705
    move-object v3, v10

    .line 706
    move-object/from16 v34, v12

    .line 707
    .line 708
    move-object/from16 v33, v13

    .line 709
    .line 710
    move-object/from16 v31, v15

    .line 711
    .line 712
    move/from16 v15, p1

    .line 713
    .line 714
    move-object v13, v9

    .line 715
    move-object/from16 p1, v24

    .line 716
    .line 717
    move/from16 v24, v11

    .line 718
    .line 719
    goto :goto_9

    .line 720
    :cond_11
    sget-wide v20, La/ijg;->U:J

    .line 721
    .line 722
    const/4 v4, 0x0

    .line 723
    new-array v5, v4, [Ljava/lang/Object;

    .line 724
    .line 725
    move-object/from16 v19, v0

    .line 726
    .line 727
    iget-object v0, v8, La/ctf0;->b:La/lsm0;

    .line 728
    .line 729
    invoke-static {v5, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object v4

    .line 733
    const v5, 0x7f1309aa

    .line 734
    .line 735
    .line 736
    invoke-virtual {v0, v5, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 737
    .line 738
    .line 739
    move-result-object v22

    .line 740
    invoke-virtual {v8}, La/ctf0;->j()Z

    .line 741
    .line 742
    .line 743
    move-result v23

    .line 744
    const-string v17, "LAST_MATCHES_TABS"

    .line 745
    .line 746
    move-object/from16 v16, v7

    .line 747
    .line 748
    invoke-static/range {v16 .. v23}, La/q5x;->C(La/ljg;Ljava/lang/String;La/l2z;Ljava/util/ArrayList;JLjava/lang/String;Z)La/boo0;

    .line 749
    .line 750
    .line 751
    move-result-object v0

    .line 752
    new-instance v4, La/psv;

    .line 753
    .line 754
    const-string v5, "LAST_MATCHES_HEADER"

    .line 755
    .line 756
    const v7, 0x7f130abc

    .line 757
    .line 758
    .line 759
    invoke-direct {v4, v5, v7}, La/psv;-><init>(Ljava/lang/String;I)V

    .line 760
    .line 761
    .line 762
    move-object v5, v12

    .line 763
    new-instance v12, La/dlf;

    .line 764
    .line 765
    const/4 v7, 0x2

    .line 766
    invoke-direct {v12, v1, v7}, La/dlf;-><init>(La/m9s;B)V

    .line 767
    .line 768
    .line 769
    move-object v7, v4

    .line 770
    const-string v4, "LAST_MATCHES"

    .line 771
    .line 772
    move-object/from16 v17, v9

    .line 773
    .line 774
    const/4 v9, 0x1

    .line 775
    move-object/from16 v19, v10

    .line 776
    .line 777
    const/4 v10, 0x1

    .line 778
    move-object/from16 v35, v2

    .line 779
    .line 780
    move-object/from16 v32, v3

    .line 781
    .line 782
    move-object/from16 v34, v5

    .line 783
    .line 784
    move-object v2, v7

    .line 785
    move-object/from16 v33, v13

    .line 786
    .line 787
    move-object/from16 v31, v15

    .line 788
    .line 789
    move-object/from16 v5, v16

    .line 790
    .line 791
    move-object/from16 v13, v17

    .line 792
    .line 793
    move-object/from16 v3, v19

    .line 794
    .line 795
    move/from16 v15, p1

    .line 796
    .line 797
    move v7, v6

    .line 798
    move-object/from16 v6, v18

    .line 799
    .line 800
    move-object/from16 p1, v24

    .line 801
    .line 802
    invoke-static/range {v4 .. v12}, La/n2z;->b(Ljava/lang/String;La/ljg;La/l2z;ZLa/ctf0;ZZZLkotlin/jvm/functions/Function1;)La/m2z;

    .line 803
    .line 804
    .line 805
    move-result-object v4

    .line 806
    move-object v6, v5

    .line 807
    move/from16 v24, v11

    .line 808
    .line 809
    invoke-virtual {v13, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 810
    .line 811
    .line 812
    invoke-virtual {v13, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 813
    .line 814
    .line 815
    invoke-virtual {v13, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 816
    .line 817
    .line 818
    :goto_9
    move-object/from16 v37, p1

    .line 819
    .line 820
    move-object v2, v1

    .line 821
    move-object/from16 v19, v3

    .line 822
    .line 823
    move-object/from16 v36, v6

    .line 824
    .line 825
    :goto_a
    move-object/from16 v3, v34

    .line 826
    .line 827
    goto/16 :goto_53

    .line 828
    .line 829
    :cond_12
    invoke-static {}, La/t9f;->b()V

    .line 830
    .line 831
    .line 832
    :goto_b
    const/4 v2, 0x0

    .line 833
    goto/16 :goto_55

    .line 834
    .line 835
    :cond_13
    move-object/from16 v30, v0

    .line 836
    .line 837
    move-object/from16 v35, v2

    .line 838
    .line 839
    move-object/from16 v32, v3

    .line 840
    .line 841
    move-object v6, v7

    .line 842
    move-object v3, v10

    .line 843
    move-object/from16 v34, v12

    .line 844
    .line 845
    move-object/from16 v33, v13

    .line 846
    .line 847
    move-object/from16 v31, v15

    .line 848
    .line 849
    move/from16 v15, p1

    .line 850
    .line 851
    move-object v13, v9

    .line 852
    move-object/from16 p1, v24

    .line 853
    .line 854
    move/from16 v24, v11

    .line 855
    .line 856
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 857
    .line 858
    .line 859
    invoke-static/range {p1 .. p1}, La/ofm0;->s(La/qrh;)Z

    .line 860
    .line 861
    .line 862
    move-result v0

    .line 863
    move-object/from16 v2, p1

    .line 864
    .line 865
    iget-object v4, v2, La/qrh;->a:La/vrh;

    .line 866
    .line 867
    iget-object v4, v4, La/vrh;->d:Ljava/util/List;

    .line 868
    .line 869
    if-eqz v0, :cond_14

    .line 870
    .line 871
    move-object/from16 p1, v1

    .line 872
    .line 873
    move-object/from16 v36, v6

    .line 874
    .line 875
    move-object v6, v2

    .line 876
    goto/16 :goto_24

    .line 877
    .line 878
    :cond_14
    iget-object v0, v2, La/qrh;->b:La/vrh;

    .line 879
    .line 880
    iget-object v0, v0, La/vrh;->d:Ljava/util/List;

    .line 881
    .line 882
    const/16 v7, 0xa

    .line 883
    .line 884
    invoke-static {v4, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 885
    .line 886
    .line 887
    move-result v9

    .line 888
    invoke-static {v9}, La/wp20;->a(I)I

    .line 889
    .line 890
    .line 891
    move-result v7

    .line 892
    const/16 v9, 0x10

    .line 893
    .line 894
    if-ge v7, v9, :cond_15

    .line 895
    .line 896
    move v7, v9

    .line 897
    :cond_15
    new-instance v10, Ljava/util/LinkedHashMap;

    .line 898
    .line 899
    invoke-direct {v10, v7}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 900
    .line 901
    .line 902
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 903
    .line 904
    .line 905
    move-result-object v7

    .line 906
    :goto_c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 907
    .line 908
    .line 909
    move-result v11

    .line 910
    if-eqz v11, :cond_16

    .line 911
    .line 912
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 913
    .line 914
    .line 915
    move-result-object v11

    .line 916
    check-cast v11, La/wxt0;

    .line 917
    .line 918
    iget-object v12, v11, La/wxt0;->a:Ljava/lang/String;

    .line 919
    .line 920
    invoke-interface {v10, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 921
    .line 922
    .line 923
    goto :goto_c

    .line 924
    :cond_16
    const/16 v11, 0xa

    .line 925
    .line 926
    invoke-static {v0, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 927
    .line 928
    .line 929
    move-result v7

    .line 930
    invoke-static {v7}, La/wp20;->a(I)I

    .line 931
    .line 932
    .line 933
    move-result v7

    .line 934
    if-ge v7, v9, :cond_17

    .line 935
    .line 936
    goto :goto_d

    .line 937
    :cond_17
    move v9, v7

    .line 938
    :goto_d
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 939
    .line 940
    invoke-direct {v7, v9}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 941
    .line 942
    .line 943
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 944
    .line 945
    .line 946
    move-result-object v9

    .line 947
    :goto_e
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 948
    .line 949
    .line 950
    move-result v11

    .line 951
    if-eqz v11, :cond_18

    .line 952
    .line 953
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 954
    .line 955
    .line 956
    move-result-object v11

    .line 957
    check-cast v11, La/wxt0;

    .line 958
    .line 959
    iget-object v12, v11, La/wxt0;->a:Ljava/lang/String;

    .line 960
    .line 961
    invoke-interface {v7, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 962
    .line 963
    .line 964
    goto :goto_e

    .line 965
    :cond_18
    new-instance v9, Ljava/util/ArrayList;

    .line 966
    .line 967
    const/16 v11, 0xa

    .line 968
    .line 969
    invoke-static {v4, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 970
    .line 971
    .line 972
    move-result v12

    .line 973
    invoke-direct {v9, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 974
    .line 975
    .line 976
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 977
    .line 978
    .line 979
    move-result-object v4

    .line 980
    :goto_f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 981
    .line 982
    .line 983
    move-result v11

    .line 984
    if-eqz v11, :cond_19

    .line 985
    .line 986
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 987
    .line 988
    .line 989
    move-result-object v11

    .line 990
    check-cast v11, La/wxt0;

    .line 991
    .line 992
    iget-object v11, v11, La/wxt0;->a:Ljava/lang/String;

    .line 993
    .line 994
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 995
    .line 996
    .line 997
    goto :goto_f

    .line 998
    :cond_19
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->O0(Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 999
    .line 1000
    .line 1001
    move-result-object v4

    .line 1002
    new-instance v9, Ljava/util/ArrayList;

    .line 1003
    .line 1004
    const/16 v11, 0xa

    .line 1005
    .line 1006
    invoke-static {v0, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1007
    .line 1008
    .line 1009
    move-result v12

    .line 1010
    invoke-direct {v9, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 1011
    .line 1012
    .line 1013
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v0

    .line 1017
    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1018
    .line 1019
    .line 1020
    move-result v11

    .line 1021
    if-eqz v11, :cond_1a

    .line 1022
    .line 1023
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v11

    .line 1027
    check-cast v11, La/wxt0;

    .line 1028
    .line 1029
    iget-object v11, v11, La/wxt0;->a:Ljava/lang/String;

    .line 1030
    .line 1031
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1032
    .line 1033
    .line 1034
    goto :goto_10

    .line 1035
    :cond_1a
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->O0(Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v0

    .line 1039
    invoke-static {v4, v0}, La/eui0;->g(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v0

    .line 1043
    new-instance v4, Ljava/util/ArrayList;

    .line 1044
    .line 1045
    const/16 v11, 0xa

    .line 1046
    .line 1047
    invoke-static {v0, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1048
    .line 1049
    .line 1050
    move-result v9

    .line 1051
    invoke-direct {v4, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 1052
    .line 1053
    .line 1054
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v0

    .line 1058
    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1059
    .line 1060
    .line 1061
    move-result v9

    .line 1062
    if-eqz v9, :cond_1d

    .line 1063
    .line 1064
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v9

    .line 1068
    check-cast v9, Ljava/lang/String;

    .line 1069
    .line 1070
    invoke-virtual {v10, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v11

    .line 1074
    check-cast v11, La/wxt0;

    .line 1075
    .line 1076
    if-nez v11, :cond_1b

    .line 1077
    .line 1078
    new-instance v11, La/wxt0;

    .line 1079
    .line 1080
    const/4 v12, 0x0

    .line 1081
    invoke-direct {v11, v12, v9, v12, v5}, La/wxt0;-><init>(ILjava/lang/String;ILjava/lang/String;)V

    .line 1082
    .line 1083
    .line 1084
    goto :goto_12

    .line 1085
    :cond_1b
    const/4 v12, 0x0

    .line 1086
    :goto_12
    invoke-virtual {v7, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v17

    .line 1090
    check-cast v17, La/wxt0;

    .line 1091
    .line 1092
    move-object/from16 p1, v0

    .line 1093
    .line 1094
    if-nez v17, :cond_1c

    .line 1095
    .line 1096
    new-instance v0, La/wxt0;

    .line 1097
    .line 1098
    invoke-direct {v0, v12, v9, v12, v5}, La/wxt0;-><init>(ILjava/lang/String;ILjava/lang/String;)V

    .line 1099
    .line 1100
    .line 1101
    goto :goto_13

    .line 1102
    :cond_1c
    move-object/from16 v0, v17

    .line 1103
    .line 1104
    :goto_13
    new-instance v9, Lkotlin/Pair;

    .line 1105
    .line 1106
    invoke-direct {v9, v11, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1107
    .line 1108
    .line 1109
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1110
    .line 1111
    .line 1112
    move-object/from16 v0, p1

    .line 1113
    .line 1114
    goto :goto_11

    .line 1115
    :cond_1d
    new-instance v0, Ljava/util/ArrayList;

    .line 1116
    .line 1117
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1118
    .line 1119
    .line 1120
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v4

    .line 1124
    :cond_1e
    :goto_14
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1125
    .line 1126
    .line 1127
    move-result v5

    .line 1128
    if-eqz v5, :cond_24

    .line 1129
    .line 1130
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v5

    .line 1134
    move-object v7, v5

    .line 1135
    check-cast v7, Lkotlin/Pair;

    .line 1136
    .line 1137
    iget-object v9, v7, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 1138
    .line 1139
    iget-object v10, v7, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 1140
    .line 1141
    check-cast v9, La/wxt0;

    .line 1142
    .line 1143
    iget v9, v9, La/wxt0;->c:I

    .line 1144
    .line 1145
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v9

    .line 1149
    iget-object v7, v7, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 1150
    .line 1151
    check-cast v7, La/wxt0;

    .line 1152
    .line 1153
    iget v7, v7, La/wxt0;->d:I

    .line 1154
    .line 1155
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v7

    .line 1159
    filled-new-array {v9, v7}, [Ljava/lang/Integer;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v7

    .line 1163
    invoke-static {v7}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v7

    .line 1167
    check-cast v10, La/wxt0;

    .line 1168
    .line 1169
    iget v9, v10, La/wxt0;->c:I

    .line 1170
    .line 1171
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v9

    .line 1175
    iget v10, v10, La/wxt0;->d:I

    .line 1176
    .line 1177
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v10

    .line 1181
    filled-new-array {v9, v10}, [Ljava/lang/Integer;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v9

    .line 1185
    invoke-static {v9}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v9

    .line 1189
    if-eqz v7, :cond_1f

    .line 1190
    .line 1191
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 1192
    .line 1193
    .line 1194
    move-result v10

    .line 1195
    if-eqz v10, :cond_1f

    .line 1196
    .line 1197
    goto :goto_15

    .line 1198
    :cond_1f
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v7

    .line 1202
    :cond_20
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1203
    .line 1204
    .line 1205
    move-result v10

    .line 1206
    if-eqz v10, :cond_21

    .line 1207
    .line 1208
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v10

    .line 1212
    check-cast v10, Ljava/lang/Number;

    .line 1213
    .line 1214
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 1215
    .line 1216
    .line 1217
    move-result v10

    .line 1218
    if-eqz v10, :cond_20

    .line 1219
    .line 1220
    goto :goto_16

    .line 1221
    :cond_21
    :goto_15
    if-eqz v9, :cond_22

    .line 1222
    .line 1223
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 1224
    .line 1225
    .line 1226
    move-result v7

    .line 1227
    if-eqz v7, :cond_22

    .line 1228
    .line 1229
    goto :goto_14

    .line 1230
    :cond_22
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v7

    .line 1234
    :cond_23
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1235
    .line 1236
    .line 1237
    move-result v9

    .line 1238
    if-eqz v9, :cond_1e

    .line 1239
    .line 1240
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v9

    .line 1244
    check-cast v9, Ljava/lang/Number;

    .line 1245
    .line 1246
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 1247
    .line 1248
    .line 1249
    move-result v9

    .line 1250
    if-eqz v9, :cond_23

    .line 1251
    .line 1252
    :goto_16
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1253
    .line 1254
    .line 1255
    goto/16 :goto_14

    .line 1256
    .line 1257
    :cond_24
    new-instance v4, Ljava/util/ArrayList;

    .line 1258
    .line 1259
    const/16 v11, 0xa

    .line 1260
    .line 1261
    invoke-static {v0, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1262
    .line 1263
    .line 1264
    move-result v5

    .line 1265
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 1266
    .line 1267
    .line 1268
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v0

    .line 1272
    :goto_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1273
    .line 1274
    .line 1275
    move-result v5

    .line 1276
    if-eqz v5, :cond_33

    .line 1277
    .line 1278
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1279
    .line 1280
    .line 1281
    move-result-object v5

    .line 1282
    check-cast v5, Lkotlin/Pair;

    .line 1283
    .line 1284
    iget-object v7, v5, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 1285
    .line 1286
    check-cast v7, La/wxt0;

    .line 1287
    .line 1288
    iget-object v9, v5, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 1289
    .line 1290
    check-cast v9, La/wxt0;

    .line 1291
    .line 1292
    iget v10, v7, La/wxt0;->c:I

    .line 1293
    .line 1294
    iget v11, v7, La/wxt0;->d:I

    .line 1295
    .line 1296
    add-int/2addr v11, v10

    .line 1297
    iget v12, v9, La/wxt0;->c:I

    .line 1298
    .line 1299
    iget v9, v9, La/wxt0;->d:I

    .line 1300
    .line 1301
    add-int/2addr v9, v12

    .line 1302
    if-nez v10, :cond_25

    .line 1303
    .line 1304
    const/4 v10, 0x0

    .line 1305
    goto :goto_18

    .line 1306
    :cond_25
    mul-int/lit8 v10, v10, 0x64

    .line 1307
    .line 1308
    div-int/2addr v10, v11

    .line 1309
    :goto_18
    if-nez v12, :cond_26

    .line 1310
    .line 1311
    const/4 v12, 0x0

    .line 1312
    goto :goto_19

    .line 1313
    :cond_26
    mul-int/lit8 v12, v12, 0x64

    .line 1314
    .line 1315
    div-int/2addr v12, v9

    .line 1316
    :goto_19
    if-le v10, v12, :cond_27

    .line 1317
    .line 1318
    move-object/from16 v16, v0

    .line 1319
    .line 1320
    move-object/from16 p1, v1

    .line 1321
    .line 1322
    sget-wide v0, La/ijg;->U:J

    .line 1323
    .line 1324
    move-object/from16 v36, v6

    .line 1325
    .line 1326
    new-instance v6, La/y3d;

    .line 1327
    .line 1328
    invoke-direct {v6, v0, v1}, La/y3d;-><init>(J)V

    .line 1329
    .line 1330
    .line 1331
    sget-wide v0, La/y3d;->c:J

    .line 1332
    .line 1333
    move/from16 v17, v9

    .line 1334
    .line 1335
    new-instance v9, La/y3d;

    .line 1336
    .line 1337
    invoke-direct {v9, v0, v1}, La/y3d;-><init>(J)V

    .line 1338
    .line 1339
    .line 1340
    new-instance v0, Lkotlin/Pair;

    .line 1341
    .line 1342
    invoke-direct {v0, v6, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1343
    .line 1344
    .line 1345
    goto :goto_1a

    .line 1346
    :cond_27
    move-object/from16 v16, v0

    .line 1347
    .line 1348
    move-object/from16 p1, v1

    .line 1349
    .line 1350
    move-object/from16 v36, v6

    .line 1351
    .line 1352
    move/from16 v17, v9

    .line 1353
    .line 1354
    if-le v12, v10, :cond_28

    .line 1355
    .line 1356
    sget-wide v0, La/y3d;->c:J

    .line 1357
    .line 1358
    new-instance v6, La/y3d;

    .line 1359
    .line 1360
    invoke-direct {v6, v0, v1}, La/y3d;-><init>(J)V

    .line 1361
    .line 1362
    .line 1363
    sget-wide v0, La/ijg;->U:J

    .line 1364
    .line 1365
    new-instance v9, La/y3d;

    .line 1366
    .line 1367
    invoke-direct {v9, v0, v1}, La/y3d;-><init>(J)V

    .line 1368
    .line 1369
    .line 1370
    new-instance v0, Lkotlin/Pair;

    .line 1371
    .line 1372
    invoke-direct {v0, v6, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1373
    .line 1374
    .line 1375
    goto :goto_1a

    .line 1376
    :cond_28
    sget-wide v0, La/y3d;->c:J

    .line 1377
    .line 1378
    new-instance v6, La/y3d;

    .line 1379
    .line 1380
    invoke-direct {v6, v0, v1}, La/y3d;-><init>(J)V

    .line 1381
    .line 1382
    .line 1383
    new-instance v9, La/y3d;

    .line 1384
    .line 1385
    invoke-direct {v9, v0, v1}, La/y3d;-><init>(J)V

    .line 1386
    .line 1387
    .line 1388
    new-instance v0, Lkotlin/Pair;

    .line 1389
    .line 1390
    invoke-direct {v0, v6, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1391
    .line 1392
    .line 1393
    :goto_1a
    iget-object v1, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 1394
    .line 1395
    check-cast v1, La/y3d;

    .line 1396
    .line 1397
    move-object v6, v2

    .line 1398
    iget-wide v1, v1, La/y3d;->a:J

    .line 1399
    .line 1400
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 1401
    .line 1402
    check-cast v0, La/y3d;

    .line 1403
    .line 1404
    move-wide/from16 v42, v1

    .line 1405
    .line 1406
    iget-wide v0, v0, La/y3d;->a:J

    .line 1407
    .line 1408
    new-instance v37, La/jp20;

    .line 1409
    .line 1410
    iget-object v2, v5, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 1411
    .line 1412
    check-cast v2, La/wxt0;

    .line 1413
    .line 1414
    iget-object v2, v2, La/wxt0;->a:Ljava/lang/String;

    .line 1415
    .line 1416
    iget-object v5, v7, La/wxt0;->a:Ljava/lang/String;

    .line 1417
    .line 1418
    sget-object v7, La/i5h;->b:La/i5h;

    .line 1419
    .line 1420
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1421
    .line 1422
    .line 1423
    if-eqz v15, :cond_29

    .line 1424
    .line 1425
    const-string v7, "tablet"

    .line 1426
    .line 1427
    goto :goto_1b

    .line 1428
    :cond_29
    const-string v7, "mob"

    .line 1429
    .line 1430
    :goto_1b
    new-instance v9, Ljava/lang/StringBuilder;

    .line 1431
    .line 1432
    move-wide/from16 v44, v0

    .line 1433
    .line 1434
    sget-object v0, La/ujn;->h:Ljava/lang/String;

    .line 1435
    .line 1436
    invoke-direct {v9, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1437
    .line 1438
    .line 1439
    const-string v0, "/static/img/ImgDefault/Esports/Valorant/Center/"

    .line 1440
    .line 1441
    const-string v1, ".png"

    .line 1442
    .line 1443
    move-object/from16 v38, v2

    .line 1444
    .line 1445
    const-string v2, "/"

    .line 1446
    .line 1447
    invoke-static {v0, v7, v2, v5, v1}, La/b1j;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v0

    .line 1451
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1452
    .line 1453
    .line 1454
    move-result v1

    .line 1455
    if-nez v1, :cond_2a

    .line 1456
    .line 1457
    const/4 v1, 0x0

    .line 1458
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1459
    .line 1460
    .line 1461
    goto :goto_1d

    .line 1462
    :cond_2a
    const/4 v1, 0x0

    .line 1463
    sget-object v5, La/ujn;->h:Ljava/lang/String;

    .line 1464
    .line 1465
    invoke-static {v0, v5, v1}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1466
    .line 1467
    .line 1468
    move-result v5

    .line 1469
    if-nez v5, :cond_2d

    .line 1470
    .line 1471
    const-string v5, "https://"

    .line 1472
    .line 1473
    invoke-static {v0, v5, v1}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1474
    .line 1475
    .line 1476
    move-result v5

    .line 1477
    if-eqz v5, :cond_2b

    .line 1478
    .line 1479
    const/4 v1, 0x0

    .line 1480
    goto :goto_1c

    .line 1481
    :cond_2b
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->length()I

    .line 1482
    .line 1483
    .line 1484
    move-result v1

    .line 1485
    const/16 v5, 0x2f

    .line 1486
    .line 1487
    if-lez v1, :cond_2c

    .line 1488
    .line 1489
    invoke-static {v9, v2}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 1490
    .line 1491
    .line 1492
    move-result v1

    .line 1493
    if-nez v1, :cond_2c

    .line 1494
    .line 1495
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1496
    .line 1497
    .line 1498
    :cond_2c
    const/4 v1, 0x1

    .line 1499
    new-array v2, v1, [C

    .line 1500
    .line 1501
    const/4 v1, 0x0

    .line 1502
    aput-char v5, v2, v1

    .line 1503
    .line 1504
    invoke-static {v0, v2}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 1505
    .line 1506
    .line 1507
    move-result-object v0

    .line 1508
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1509
    .line 1510
    .line 1511
    goto :goto_1d

    .line 1512
    :cond_2d
    :goto_1c
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1513
    .line 1514
    .line 1515
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1516
    .line 1517
    .line 1518
    :goto_1d
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v39

    .line 1522
    const-string v0, "%"

    .line 1523
    .line 1524
    const-string v1, "-"

    .line 1525
    .line 1526
    if-nez v10, :cond_2e

    .line 1527
    .line 1528
    if-nez v11, :cond_2e

    .line 1529
    .line 1530
    move-object/from16 v40, v1

    .line 1531
    .line 1532
    goto :goto_1e

    .line 1533
    :cond_2e
    invoke-static {v10, v0}, La/f140;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 1534
    .line 1535
    .line 1536
    move-result-object v2

    .line 1537
    move-object/from16 v40, v2

    .line 1538
    .line 1539
    :goto_1e
    if-nez v12, :cond_2f

    .line 1540
    .line 1541
    if-nez v17, :cond_2f

    .line 1542
    .line 1543
    move-object/from16 v41, v1

    .line 1544
    .line 1545
    goto :goto_1f

    .line 1546
    :cond_2f
    invoke-static {v12, v0}, La/f140;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 1547
    .line 1548
    .line 1549
    move-result-object v0

    .line 1550
    move-object/from16 v41, v0

    .line 1551
    .line 1552
    :goto_1f
    const v0, 0x7f13020f

    .line 1553
    .line 1554
    .line 1555
    if-nez v11, :cond_30

    .line 1556
    .line 1557
    move-object/from16 v46, v1

    .line 1558
    .line 1559
    const/4 v7, 0x1

    .line 1560
    goto :goto_20

    .line 1561
    :cond_30
    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1562
    .line 1563
    .line 1564
    move-result-object v2

    .line 1565
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 1566
    .line 1567
    .line 1568
    move-result-object v2

    .line 1569
    iget-object v5, v8, La/ctf0;->b:La/lsm0;

    .line 1570
    .line 1571
    const/4 v7, 0x1

    .line 1572
    invoke-static {v2, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1573
    .line 1574
    .line 1575
    move-result-object v2

    .line 1576
    invoke-virtual {v5, v0, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1577
    .line 1578
    .line 1579
    move-result-object v2

    .line 1580
    move-object/from16 v46, v2

    .line 1581
    .line 1582
    :goto_20
    if-nez v17, :cond_31

    .line 1583
    .line 1584
    :goto_21
    move-object/from16 v47, v1

    .line 1585
    .line 1586
    goto :goto_22

    .line 1587
    :cond_31
    invoke-static/range {v17 .. v17}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1588
    .line 1589
    .line 1590
    move-result-object v1

    .line 1591
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 1592
    .line 1593
    .line 1594
    move-result-object v1

    .line 1595
    iget-object v2, v8, La/ctf0;->b:La/lsm0;

    .line 1596
    .line 1597
    invoke-static {v1, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1598
    .line 1599
    .line 1600
    move-result-object v1

    .line 1601
    invoke-virtual {v2, v0, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1602
    .line 1603
    .line 1604
    move-result-object v1

    .line 1605
    goto :goto_21

    .line 1606
    :goto_22
    if-eqz v15, :cond_32

    .line 1607
    .line 1608
    move/from16 v48, v28

    .line 1609
    .line 1610
    goto :goto_23

    .line 1611
    :cond_32
    move/from16 v48, v25

    .line 1612
    .line 1613
    :goto_23
    invoke-direct/range {v37 .. v48}, La/jp20;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;I)V

    .line 1614
    .line 1615
    .line 1616
    move-object/from16 v0, v37

    .line 1617
    .line 1618
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1619
    .line 1620
    .line 1621
    move-object/from16 v1, p1

    .line 1622
    .line 1623
    move-object v2, v6

    .line 1624
    move-object/from16 v0, v16

    .line 1625
    .line 1626
    move-object/from16 v6, v36

    .line 1627
    .line 1628
    goto/16 :goto_17

    .line 1629
    .line 1630
    :cond_33
    move-object/from16 p1, v1

    .line 1631
    .line 1632
    move-object/from16 v36, v6

    .line 1633
    .line 1634
    move-object v6, v2

    .line 1635
    new-instance v0, La/psv;

    .line 1636
    .line 1637
    const-string v1, "MAPS_STATISTIC_HEADER"

    .line 1638
    .line 1639
    const v2, 0x7f13180a

    .line 1640
    .line 1641
    .line 1642
    invoke-direct {v0, v1, v2}, La/psv;-><init>(Ljava/lang/String;I)V

    .line 1643
    .line 1644
    .line 1645
    invoke-virtual {v13, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1646
    .line 1647
    .line 1648
    new-instance v0, La/aq20;

    .line 1649
    .line 1650
    invoke-static {v4}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 1651
    .line 1652
    .line 1653
    move-result-object v1

    .line 1654
    invoke-direct {v0, v1}, La/aq20;-><init>(La/i4;)V

    .line 1655
    .line 1656
    .line 1657
    invoke-virtual {v13, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1658
    .line 1659
    .line 1660
    :goto_24
    move-object/from16 v2, p1

    .line 1661
    .line 1662
    move-object/from16 v19, v3

    .line 1663
    .line 1664
    move-object/from16 v37, v6

    .line 1665
    .line 1666
    goto/16 :goto_a

    .line 1667
    .line 1668
    :cond_34
    move-object/from16 v30, v0

    .line 1669
    .line 1670
    move-object/from16 v35, v2

    .line 1671
    .line 1672
    move-object/from16 v32, v3

    .line 1673
    .line 1674
    move-object/from16 v36, v7

    .line 1675
    .line 1676
    move-object v3, v10

    .line 1677
    move-object/from16 v34, v12

    .line 1678
    .line 1679
    move-object/from16 v33, v13

    .line 1680
    .line 1681
    move-object/from16 v31, v15

    .line 1682
    .line 1683
    move-object/from16 v6, v24

    .line 1684
    .line 1685
    move/from16 v15, p1

    .line 1686
    .line 1687
    move-object/from16 p1, v1

    .line 1688
    .line 1689
    move-object v13, v9

    .line 1690
    move/from16 v24, v11

    .line 1691
    .line 1692
    iget-object v0, v14, La/vzt0;->a:La/o4i0;

    .line 1693
    .line 1694
    invoke-static/range {v36 .. v36}, La/zsm0;->m(La/ljg;)Ljava/util/List;

    .line 1695
    .line 1696
    .line 1697
    move-result-object v1

    .line 1698
    move-object v2, v6

    .line 1699
    invoke-static {v13, v2, v0, v8, v1}, La/dem0;->k(La/lc00;La/qrh;La/o4i0;La/ctf0;Ljava/util/List;)V

    .line 1700
    .line 1701
    .line 1702
    move-object/from16 v37, v2

    .line 1703
    .line 1704
    move-object/from16 v19, v3

    .line 1705
    .line 1706
    move-object/from16 v3, v34

    .line 1707
    .line 1708
    move-object/from16 v2, p1

    .line 1709
    .line 1710
    goto/16 :goto_53

    .line 1711
    .line 1712
    :cond_35
    move-object/from16 v30, v0

    .line 1713
    .line 1714
    move-object/from16 v35, v2

    .line 1715
    .line 1716
    move-object/from16 v32, v3

    .line 1717
    .line 1718
    move-object/from16 v36, v7

    .line 1719
    .line 1720
    move-object v3, v10

    .line 1721
    move-object/from16 v34, v12

    .line 1722
    .line 1723
    move-object/from16 v33, v13

    .line 1724
    .line 1725
    move-object/from16 v31, v15

    .line 1726
    .line 1727
    move-object/from16 v2, v24

    .line 1728
    .line 1729
    move/from16 v15, p1

    .line 1730
    .line 1731
    move-object/from16 p1, v1

    .line 1732
    .line 1733
    move-object v13, v9

    .line 1734
    move/from16 v24, v11

    .line 1735
    .line 1736
    iget-object v0, v3, La/d0u0;->a:La/i1u0;

    .line 1737
    .line 1738
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 1739
    .line 1740
    .line 1741
    move-result-object v1

    .line 1742
    iget-object v4, v0, La/i1u0;->c:Ljava/util/List;

    .line 1743
    .line 1744
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1745
    .line 1746
    .line 1747
    move-result-object v4

    .line 1748
    :goto_25
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1749
    .line 1750
    .line 1751
    move-result v6

    .line 1752
    if-eqz v6, :cond_3d

    .line 1753
    .line 1754
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1755
    .line 1756
    .line 1757
    move-result-object v6

    .line 1758
    check-cast v6, La/xxt0;

    .line 1759
    .line 1760
    iget v7, v6, La/xxt0;->c:I

    .line 1761
    .line 1762
    iget-object v9, v6, La/xxt0;->a:Ljava/lang/String;

    .line 1763
    .line 1764
    iget v10, v6, La/xxt0;->d:I

    .line 1765
    .line 1766
    const/4 v11, -0x1

    .line 1767
    if-eq v7, v11, :cond_36

    .line 1768
    .line 1769
    if-eq v10, v11, :cond_36

    .line 1770
    .line 1771
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 1772
    .line 1773
    .line 1774
    move-result v7

    .line 1775
    if-nez v7, :cond_37

    .line 1776
    .line 1777
    :cond_36
    move-object/from16 v37, v2

    .line 1778
    .line 1779
    move-object v7, v3

    .line 1780
    move-object/from16 v2, p1

    .line 1781
    .line 1782
    goto/16 :goto_28

    .line 1783
    .line 1784
    :cond_37
    iget v7, v6, La/xxt0;->e:I

    .line 1785
    .line 1786
    const/4 v11, 0x1

    .line 1787
    if-eq v7, v11, :cond_39

    .line 1788
    .line 1789
    const/4 v11, 0x2

    .line 1790
    if-eq v7, v11, :cond_38

    .line 1791
    .line 1792
    sget-object v7, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 1793
    .line 1794
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 1795
    .line 1796
    .line 1797
    move-result-wide v11

    .line 1798
    move-object/from16 v37, v2

    .line 1799
    .line 1800
    new-instance v2, La/y3d;

    .line 1801
    .line 1802
    invoke-direct {v2, v11, v12}, La/y3d;-><init>(J)V

    .line 1803
    .line 1804
    .line 1805
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 1806
    .line 1807
    .line 1808
    move-result-wide v11

    .line 1809
    new-instance v7, La/y3d;

    .line 1810
    .line 1811
    invoke-direct {v7, v11, v12}, La/y3d;-><init>(J)V

    .line 1812
    .line 1813
    .line 1814
    new-instance v11, Lkotlin/Pair;

    .line 1815
    .line 1816
    invoke-direct {v11, v2, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1817
    .line 1818
    .line 1819
    goto :goto_26

    .line 1820
    :cond_38
    move-object/from16 v37, v2

    .line 1821
    .line 1822
    sget-object v2, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 1823
    .line 1824
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 1825
    .line 1826
    .line 1827
    move-result-wide v11

    .line 1828
    new-instance v2, La/y3d;

    .line 1829
    .line 1830
    invoke-direct {v2, v11, v12}, La/y3d;-><init>(J)V

    .line 1831
    .line 1832
    .line 1833
    sget-wide v11, La/ijg;->U:J

    .line 1834
    .line 1835
    new-instance v7, La/y3d;

    .line 1836
    .line 1837
    invoke-direct {v7, v11, v12}, La/y3d;-><init>(J)V

    .line 1838
    .line 1839
    .line 1840
    new-instance v11, Lkotlin/Pair;

    .line 1841
    .line 1842
    invoke-direct {v11, v2, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1843
    .line 1844
    .line 1845
    goto :goto_26

    .line 1846
    :cond_39
    move-object/from16 v37, v2

    .line 1847
    .line 1848
    sget-wide v11, La/ijg;->U:J

    .line 1849
    .line 1850
    new-instance v2, La/y3d;

    .line 1851
    .line 1852
    invoke-direct {v2, v11, v12}, La/y3d;-><init>(J)V

    .line 1853
    .line 1854
    .line 1855
    sget-object v7, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 1856
    .line 1857
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 1858
    .line 1859
    .line 1860
    move-result-wide v11

    .line 1861
    new-instance v7, La/y3d;

    .line 1862
    .line 1863
    invoke-direct {v7, v11, v12}, La/y3d;-><init>(J)V

    .line 1864
    .line 1865
    .line 1866
    new-instance v11, Lkotlin/Pair;

    .line 1867
    .line 1868
    invoke-direct {v11, v2, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1869
    .line 1870
    .line 1871
    :goto_26
    iget-object v2, v11, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 1872
    .line 1873
    check-cast v2, La/y3d;

    .line 1874
    .line 1875
    move-object v7, v3

    .line 1876
    iget-wide v2, v2, La/y3d;->a:J

    .line 1877
    .line 1878
    iget-object v11, v11, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 1879
    .line 1880
    check-cast v11, La/y3d;

    .line 1881
    .line 1882
    iget-wide v11, v11, La/y3d;->a:J

    .line 1883
    .line 1884
    new-instance v22, La/wls;

    .line 1885
    .line 1886
    new-instance v16, La/fp20;

    .line 1887
    .line 1888
    invoke-static/range {p0 .. p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1889
    .line 1890
    .line 1891
    move-result-object v17

    .line 1892
    check-cast v17, Ljava/lang/String;

    .line 1893
    .line 1894
    if-nez v17, :cond_3a

    .line 1895
    .line 1896
    move-object/from16 v17, v5

    .line 1897
    .line 1898
    :cond_3a
    invoke-static/range {v17 .. v17}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 1899
    .line 1900
    .line 1901
    move-result-object v19

    .line 1902
    move-wide/from16 v17, v2

    .line 1903
    .line 1904
    move-object/from16 v2, p1

    .line 1905
    .line 1906
    iget-object v3, v2, La/m9s;->i:Ljava/lang/String;

    .line 1907
    .line 1908
    iget v6, v6, La/xxt0;->c:I

    .line 1909
    .line 1910
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1911
    .line 1912
    .line 1913
    move-result-object v21

    .line 1914
    move-object/from16 v20, v3

    .line 1915
    .line 1916
    invoke-direct/range {v16 .. v21}, La/fp20;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1917
    .line 1918
    .line 1919
    move-object/from16 v3, v16

    .line 1920
    .line 1921
    new-instance v16, La/fp20;

    .line 1922
    .line 1923
    invoke-static/range {v26 .. v26}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1924
    .line 1925
    .line 1926
    move-result-object v6

    .line 1927
    check-cast v6, Ljava/lang/String;

    .line 1928
    .line 1929
    if-nez v6, :cond_3b

    .line 1930
    .line 1931
    move-object v6, v5

    .line 1932
    :cond_3b
    invoke-static {v6}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 1933
    .line 1934
    .line 1935
    move-result-object v19

    .line 1936
    iget-object v6, v2, La/m9s;->j:Ljava/lang/String;

    .line 1937
    .line 1938
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1939
    .line 1940
    .line 1941
    move-result-object v21

    .line 1942
    move-object/from16 v20, v6

    .line 1943
    .line 1944
    move-wide/from16 v17, v11

    .line 1945
    .line 1946
    invoke-direct/range {v16 .. v21}, La/fp20;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1947
    .line 1948
    .line 1949
    invoke-static {v9, v15}, La/w9x;->G(Ljava/lang/String;Z)Ljava/lang/String;

    .line 1950
    .line 1951
    .line 1952
    move-result-object v20

    .line 1953
    const/4 v12, 0x0

    .line 1954
    new-array v6, v12, [Ljava/lang/Object;

    .line 1955
    .line 1956
    iget-object v10, v8, La/ctf0;->b:La/lsm0;

    .line 1957
    .line 1958
    invoke-static {v6, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1959
    .line 1960
    .line 1961
    move-result-object v6

    .line 1962
    const v11, 0x7f13058d

    .line 1963
    .line 1964
    .line 1965
    invoke-virtual {v10, v11, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1966
    .line 1967
    .line 1968
    move-result-object v21

    .line 1969
    if-eqz v15, :cond_3c

    .line 1970
    .line 1971
    move/from16 v6, v28

    .line 1972
    .line 1973
    goto :goto_27

    .line 1974
    :cond_3c
    move/from16 v6, v25

    .line 1975
    .line 1976
    :goto_27
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1977
    .line 1978
    .line 1979
    move-result-object v23

    .line 1980
    move-object/from16 v18, v16

    .line 1981
    .line 1982
    move-object/from16 v16, v22

    .line 1983
    .line 1984
    const/16 v22, 0x0

    .line 1985
    .line 1986
    move-object/from16 v17, v3

    .line 1987
    .line 1988
    move-object/from16 v19, v9

    .line 1989
    .line 1990
    invoke-direct/range {v16 .. v24}, La/wls;-><init>(La/fp20;La/fp20;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Z)V

    .line 1991
    .line 1992
    .line 1993
    move-object/from16 v3, v16

    .line 1994
    .line 1995
    invoke-virtual {v1, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1996
    .line 1997
    .line 1998
    :goto_28
    move-object/from16 p1, v2

    .line 1999
    .line 2000
    move-object v3, v7

    .line 2001
    move-object/from16 v2, v37

    .line 2002
    .line 2003
    goto/16 :goto_25

    .line 2004
    .line 2005
    :cond_3d
    move-object/from16 v37, v2

    .line 2006
    .line 2007
    move-object v7, v3

    .line 2008
    move-object/from16 v2, p1

    .line 2009
    .line 2010
    iget-object v0, v0, La/i1u0;->b:Ljava/lang/String;

    .line 2011
    .line 2012
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 2013
    .line 2014
    .line 2015
    move-result v3

    .line 2016
    if-nez v3, :cond_3e

    .line 2017
    .line 2018
    goto/16 :goto_2e

    .line 2019
    .line 2020
    :cond_3e
    iget-object v3, v2, La/m9s;->h:La/qqs;

    .line 2021
    .line 2022
    iget-object v3, v3, La/qqs;->c:Ljava/util/List;

    .line 2023
    .line 2024
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 2025
    .line 2026
    .line 2027
    move-result v4

    .line 2028
    if-eqz v4, :cond_3f

    .line 2029
    .line 2030
    goto/16 :goto_2e

    .line 2031
    .line 2032
    :cond_3f
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 2033
    .line 2034
    .line 2035
    move-result-object v4

    .line 2036
    check-cast v4, La/ve90;

    .line 2037
    .line 2038
    if-eqz v4, :cond_40

    .line 2039
    .line 2040
    iget-object v4, v4, La/ve90;->b:Ljava/lang/String;

    .line 2041
    .line 2042
    goto :goto_29

    .line 2043
    :cond_40
    const/4 v4, 0x0

    .line 2044
    :goto_29
    if-nez v4, :cond_41

    .line 2045
    .line 2046
    move-object/from16 v21, v5

    .line 2047
    .line 2048
    goto :goto_2a

    .line 2049
    :cond_41
    move-object/from16 v21, v4

    .line 2050
    .line 2051
    :goto_2a
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 2052
    .line 2053
    .line 2054
    move-result-object v3

    .line 2055
    check-cast v3, La/ve90;

    .line 2056
    .line 2057
    if-eqz v3, :cond_42

    .line 2058
    .line 2059
    iget-object v3, v3, La/ve90;->c:Ljava/lang/String;

    .line 2060
    .line 2061
    goto :goto_2b

    .line 2062
    :cond_42
    const/4 v3, 0x0

    .line 2063
    :goto_2b
    if-nez v3, :cond_43

    .line 2064
    .line 2065
    move-object/from16 v43, v5

    .line 2066
    .line 2067
    goto :goto_2c

    .line 2068
    :cond_43
    move-object/from16 v43, v3

    .line 2069
    .line 2070
    :goto_2c
    new-instance v3, La/wls;

    .line 2071
    .line 2072
    new-instance v16, La/fp20;

    .line 2073
    .line 2074
    invoke-static/range {p0 .. p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 2075
    .line 2076
    .line 2077
    move-result-object v4

    .line 2078
    check-cast v4, Ljava/lang/String;

    .line 2079
    .line 2080
    if-nez v4, :cond_44

    .line 2081
    .line 2082
    move-object v4, v5

    .line 2083
    :cond_44
    invoke-static {v4}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 2084
    .line 2085
    .line 2086
    move-result-object v19

    .line 2087
    iget-object v4, v2, La/m9s;->i:Ljava/lang/String;

    .line 2088
    .line 2089
    sget-object v6, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 2090
    .line 2091
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 2092
    .line 2093
    .line 2094
    move-result-wide v17

    .line 2095
    move-object/from16 v20, v4

    .line 2096
    .line 2097
    invoke-direct/range {v16 .. v21}, La/fp20;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2098
    .line 2099
    .line 2100
    new-instance v18, La/fp20;

    .line 2101
    .line 2102
    invoke-static/range {v26 .. v26}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 2103
    .line 2104
    .line 2105
    move-result-object v4

    .line 2106
    check-cast v4, Ljava/lang/String;

    .line 2107
    .line 2108
    if-nez v4, :cond_45

    .line 2109
    .line 2110
    goto :goto_2d

    .line 2111
    :cond_45
    move-object v5, v4

    .line 2112
    :goto_2d
    invoke-static {v5}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 2113
    .line 2114
    .line 2115
    move-result-object v41

    .line 2116
    iget-object v4, v2, La/m9s;->j:Ljava/lang/String;

    .line 2117
    .line 2118
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 2119
    .line 2120
    .line 2121
    move-result-wide v39

    .line 2122
    move-object/from16 v42, v4

    .line 2123
    .line 2124
    move-object/from16 v38, v18

    .line 2125
    .line 2126
    invoke-direct/range {v38 .. v43}, La/fp20;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2127
    .line 2128
    .line 2129
    invoke-static {v0, v15}, La/w9x;->G(Ljava/lang/String;Z)Ljava/lang/String;

    .line 2130
    .line 2131
    .line 2132
    move-result-object v20

    .line 2133
    const/4 v12, 0x0

    .line 2134
    new-array v4, v12, [Ljava/lang/Object;

    .line 2135
    .line 2136
    iget-object v5, v8, La/ctf0;->b:La/lsm0;

    .line 2137
    .line 2138
    invoke-static {v4, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2139
    .line 2140
    .line 2141
    move-result-object v4

    .line 2142
    const v6, 0x7f130609

    .line 2143
    .line 2144
    .line 2145
    invoke-virtual {v5, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2146
    .line 2147
    .line 2148
    move-result-object v21

    .line 2149
    if-eqz v15, :cond_46

    .line 2150
    .line 2151
    move/from16 v25, v28

    .line 2152
    .line 2153
    :cond_46
    invoke-static/range {v25 .. v25}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2154
    .line 2155
    .line 2156
    move-result-object v23

    .line 2157
    const/16 v22, 0x1

    .line 2158
    .line 2159
    move-object/from16 v19, v0

    .line 2160
    .line 2161
    move-object/from16 v17, v16

    .line 2162
    .line 2163
    move-object/from16 v16, v3

    .line 2164
    .line 2165
    invoke-direct/range {v16 .. v24}, La/wls;-><init>(La/fp20;La/fp20;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Z)V

    .line 2166
    .line 2167
    .line 2168
    move-object/from16 v0, v16

    .line 2169
    .line 2170
    invoke-virtual {v1, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2171
    .line 2172
    .line 2173
    :goto_2e
    invoke-static {v1}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 2174
    .line 2175
    .line 2176
    move-result-object v0

    .line 2177
    invoke-virtual {v0}, La/lc00;->isEmpty()Z

    .line 2178
    .line 2179
    .line 2180
    move-result v1

    .line 2181
    if-eqz v1, :cond_47

    .line 2182
    .line 2183
    goto :goto_2f

    .line 2184
    :cond_47
    new-instance v1, La/psv;

    .line 2185
    .line 2186
    const-string v3, "MAPS_IN_SERIES_HEADER"

    .line 2187
    .line 2188
    const v4, 0x7f13126f

    .line 2189
    .line 2190
    .line 2191
    invoke-direct {v1, v3, v4}, La/psv;-><init>(Ljava/lang/String;I)V

    .line 2192
    .line 2193
    .line 2194
    invoke-virtual {v13, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2195
    .line 2196
    .line 2197
    new-instance v1, La/up20;

    .line 2198
    .line 2199
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 2200
    .line 2201
    .line 2202
    move-result-object v0

    .line 2203
    invoke-direct {v1, v0}, La/up20;-><init>(La/i4;)V

    .line 2204
    .line 2205
    .line 2206
    invoke-virtual {v13, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2207
    .line 2208
    .line 2209
    :goto_2f
    move-object/from16 v19, v7

    .line 2210
    .line 2211
    goto/16 :goto_a

    .line 2212
    .line 2213
    :cond_48
    move-object/from16 v30, v0

    .line 2214
    .line 2215
    move-object/from16 v35, v2

    .line 2216
    .line 2217
    move-object/from16 v32, v3

    .line 2218
    .line 2219
    move-object/from16 v36, v7

    .line 2220
    .line 2221
    move-object v7, v10

    .line 2222
    move-object/from16 v34, v12

    .line 2223
    .line 2224
    move-object/from16 v33, v13

    .line 2225
    .line 2226
    move-object/from16 v31, v15

    .line 2227
    .line 2228
    move-object/from16 v37, v24

    .line 2229
    .line 2230
    move/from16 v15, p1

    .line 2231
    .line 2232
    move-object v2, v1

    .line 2233
    move-object v13, v9

    .line 2234
    move/from16 v24, v11

    .line 2235
    .line 2236
    sget-object v0, La/pgg0;->a:Ljava/util/List;

    .line 2237
    .line 2238
    invoke-static {v7}, La/ofm0;->t(La/d0u0;)Z

    .line 2239
    .line 2240
    .line 2241
    move-result v0

    .line 2242
    if-eqz v0, :cond_49

    .line 2243
    .line 2244
    move-object/from16 v10, v33

    .line 2245
    .line 2246
    move-object/from16 v3, v34

    .line 2247
    .line 2248
    move-object/from16 v0, v35

    .line 2249
    .line 2250
    goto/16 :goto_37

    .line 2251
    .line 2252
    :cond_49
    move-object/from16 v0, v35

    .line 2253
    .line 2254
    iget-object v1, v0, La/g2u0;->b:Ljava/util/Map;

    .line 2255
    .line 2256
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 2257
    .line 2258
    .line 2259
    move-result-object v1

    .line 2260
    check-cast v1, Ljava/lang/Iterable;

    .line 2261
    .line 2262
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->I(Ljava/lang/Iterable;)La/sx3;

    .line 2263
    .line 2264
    .line 2265
    move-result-object v1

    .line 2266
    move-object/from16 v3, v34

    .line 2267
    .line 2268
    iget-object v4, v3, La/g2u0;->b:Ljava/util/Map;

    .line 2269
    .line 2270
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 2271
    .line 2272
    .line 2273
    move-result-object v4

    .line 2274
    check-cast v4, Ljava/lang/Iterable;

    .line 2275
    .line 2276
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->I(Ljava/lang/Iterable;)La/sx3;

    .line 2277
    .line 2278
    .line 2279
    move-result-object v4

    .line 2280
    const/4 v6, 0x2

    .line 2281
    new-array v6, v6, [Lkotlin/sequences/Sequence;

    .line 2282
    .line 2283
    const/16 v27, 0x0

    .line 2284
    .line 2285
    aput-object v1, v6, v27

    .line 2286
    .line 2287
    const/16 v29, 0x1

    .line 2288
    .line 2289
    aput-object v4, v6, v29

    .line 2290
    .line 2291
    invoke-static {v6}, La/tx3;->t([Ljava/lang/Object;)Lkotlin/sequences/Sequence;

    .line 2292
    .line 2293
    .line 2294
    move-result-object v1

    .line 2295
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2296
    .line 2297
    .line 2298
    new-instance v4, La/eoh0;

    .line 2299
    .line 2300
    const/16 v6, 0x16

    .line 2301
    .line 2302
    invoke-direct {v4, v6}, La/eoh0;-><init>(B)V

    .line 2303
    .line 2304
    .line 2305
    invoke-static {v1, v4}, La/lgi0;->c(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/ckq;

    .line 2306
    .line 2307
    .line 2308
    move-result-object v1

    .line 2309
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 2310
    .line 2311
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 2312
    .line 2313
    .line 2314
    new-instance v6, La/bkq;

    .line 2315
    .line 2316
    invoke-direct {v6, v1}, La/bkq;-><init>(La/ckq;)V

    .line 2317
    .line 2318
    .line 2319
    :goto_30
    invoke-virtual {v6}, La/bkq;->hasNext()Z

    .line 2320
    .line 2321
    .line 2322
    move-result v1

    .line 2323
    if-eqz v1, :cond_4b

    .line 2324
    .line 2325
    invoke-virtual {v6}, La/bkq;->next()Ljava/lang/Object;

    .line 2326
    .line 2327
    .line 2328
    move-result-object v1

    .line 2329
    check-cast v1, Ljava/util/Map$Entry;

    .line 2330
    .line 2331
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2332
    .line 2333
    .line 2334
    move-result-object v9

    .line 2335
    check-cast v9, Ljava/lang/Number;

    .line 2336
    .line 2337
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 2338
    .line 2339
    .line 2340
    move-result v9

    .line 2341
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2342
    .line 2343
    .line 2344
    move-result-object v9

    .line 2345
    invoke-virtual {v4, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2346
    .line 2347
    .line 2348
    move-result-object v10

    .line 2349
    if-nez v10, :cond_4a

    .line 2350
    .line 2351
    new-instance v10, Ljava/util/ArrayList;

    .line 2352
    .line 2353
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 2354
    .line 2355
    .line 2356
    invoke-interface {v4, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2357
    .line 2358
    .line 2359
    :cond_4a
    check-cast v10, Ljava/util/List;

    .line 2360
    .line 2361
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 2362
    .line 2363
    .line 2364
    move-result-object v1

    .line 2365
    check-cast v1, Ljava/lang/Number;

    .line 2366
    .line 2367
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 2368
    .line 2369
    .line 2370
    move-result v1

    .line 2371
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2372
    .line 2373
    .line 2374
    move-result-object v1

    .line 2375
    invoke-interface {v10, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2376
    .line 2377
    .line 2378
    goto :goto_30

    .line 2379
    :cond_4b
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 2380
    .line 2381
    invoke-interface {v4}, Ljava/util/Map;->size()I

    .line 2382
    .line 2383
    .line 2384
    move-result v6

    .line 2385
    invoke-static {v6}, La/wp20;->a(I)I

    .line 2386
    .line 2387
    .line 2388
    move-result v6

    .line 2389
    invoke-direct {v1, v6}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 2390
    .line 2391
    .line 2392
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 2393
    .line 2394
    .line 2395
    move-result-object v4

    .line 2396
    check-cast v4, Ljava/lang/Iterable;

    .line 2397
    .line 2398
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2399
    .line 2400
    .line 2401
    move-result-object v4

    .line 2402
    :goto_31
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 2403
    .line 2404
    .line 2405
    move-result v6

    .line 2406
    if-eqz v6, :cond_4c

    .line 2407
    .line 2408
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2409
    .line 2410
    .line 2411
    move-result-object v6

    .line 2412
    check-cast v6, Ljava/util/Map$Entry;

    .line 2413
    .line 2414
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2415
    .line 2416
    .line 2417
    move-result-object v9

    .line 2418
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 2419
    .line 2420
    .line 2421
    move-result-object v6

    .line 2422
    check-cast v6, Ljava/util/List;

    .line 2423
    .line 2424
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 2425
    .line 2426
    .line 2427
    move-result-object v10

    .line 2428
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 2429
    .line 2430
    .line 2431
    move-result-object v6

    .line 2432
    new-instance v11, Lkotlin/Pair;

    .line 2433
    .line 2434
    invoke-direct {v11, v10, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2435
    .line 2436
    .line 2437
    invoke-interface {v1, v9, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2438
    .line 2439
    .line 2440
    goto :goto_31

    .line 2441
    :cond_4c
    new-instance v4, Ljava/util/ArrayList;

    .line 2442
    .line 2443
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 2444
    .line 2445
    .line 2446
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 2447
    .line 2448
    .line 2449
    move-result-object v1

    .line 2450
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 2451
    .line 2452
    .line 2453
    move-result-object v1

    .line 2454
    :cond_4d
    :goto_32
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2455
    .line 2456
    .line 2457
    move-result v6

    .line 2458
    if-eqz v6, :cond_4e

    .line 2459
    .line 2460
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2461
    .line 2462
    .line 2463
    move-result-object v6

    .line 2464
    check-cast v6, Ljava/util/Map$Entry;

    .line 2465
    .line 2466
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2467
    .line 2468
    .line 2469
    move-result-object v9

    .line 2470
    check-cast v9, Ljava/lang/Number;

    .line 2471
    .line 2472
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 2473
    .line 2474
    .line 2475
    move-result v9

    .line 2476
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 2477
    .line 2478
    .line 2479
    move-result-object v6

    .line 2480
    check-cast v6, Lkotlin/Pair;

    .line 2481
    .line 2482
    new-instance v10, La/jgg0;

    .line 2483
    .line 2484
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2485
    .line 2486
    .line 2487
    move-result-object v11

    .line 2488
    filled-new-array {v11}, [Ljava/lang/Object;

    .line 2489
    .line 2490
    .line 2491
    move-result-object v11

    .line 2492
    const/4 v12, 0x1

    .line 2493
    invoke-static {v11, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2494
    .line 2495
    .line 2496
    move-result-object v11

    .line 2497
    const-string v12, "%02d"

    .line 2498
    .line 2499
    invoke-static {v12, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 2500
    .line 2501
    .line 2502
    move-result-object v11

    .line 2503
    iget-object v12, v6, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 2504
    .line 2505
    check-cast v12, Ljava/lang/Number;

    .line 2506
    .line 2507
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 2508
    .line 2509
    .line 2510
    move-result v12

    .line 2511
    invoke-static {v12}, La/pgg0;->a(I)La/ngg0;

    .line 2512
    .line 2513
    .line 2514
    move-result-object v12

    .line 2515
    iget-object v6, v6, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 2516
    .line 2517
    check-cast v6, Ljava/lang/Number;

    .line 2518
    .line 2519
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 2520
    .line 2521
    .line 2522
    move-result v6

    .line 2523
    invoke-static {v6}, La/pgg0;->a(I)La/ngg0;

    .line 2524
    .line 2525
    .line 2526
    move-result-object v6

    .line 2527
    invoke-direct {v10, v11, v12, v6}, La/jgg0;-><init>(Ljava/lang/String;La/ngg0;La/ngg0;)V

    .line 2528
    .line 2529
    .line 2530
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2531
    .line 2532
    .line 2533
    sget-object v6, La/pgg0;->a:Ljava/util/List;

    .line 2534
    .line 2535
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2536
    .line 2537
    .line 2538
    move-result-object v9

    .line 2539
    invoke-interface {v6, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 2540
    .line 2541
    .line 2542
    move-result v6

    .line 2543
    if-eqz v6, :cond_4d

    .line 2544
    .line 2545
    sget-object v6, La/kgg0;->a:La/kgg0;

    .line 2546
    .line 2547
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2548
    .line 2549
    .line 2550
    goto :goto_32

    .line 2551
    :cond_4e
    invoke-static {v4}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 2552
    .line 2553
    .line 2554
    move-result-object v1

    .line 2555
    new-instance v4, La/psv;

    .line 2556
    .line 2557
    const-string v6, "ROUND_STATISTIC_HEADER"

    .line 2558
    .line 2559
    const v9, 0x7f13119f

    .line 2560
    .line 2561
    .line 2562
    invoke-direct {v4, v6, v9}, La/psv;-><init>(Ljava/lang/String;I)V

    .line 2563
    .line 2564
    .line 2565
    invoke-virtual {v13, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2566
    .line 2567
    .line 2568
    new-instance v4, La/ogg0;

    .line 2569
    .line 2570
    invoke-static/range {p0 .. p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 2571
    .line 2572
    .line 2573
    move-result-object v6

    .line 2574
    check-cast v6, Ljava/lang/String;

    .line 2575
    .line 2576
    if-nez v6, :cond_4f

    .line 2577
    .line 2578
    move-object v6, v5

    .line 2579
    :cond_4f
    iget-object v9, v2, La/m9s;->c:Ljava/util/List;

    .line 2580
    .line 2581
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 2582
    .line 2583
    .line 2584
    move-result-object v9

    .line 2585
    check-cast v9, Ljava/lang/Long;

    .line 2586
    .line 2587
    if-eqz v9, :cond_50

    .line 2588
    .line 2589
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 2590
    .line 2591
    .line 2592
    move-result-wide v16

    .line 2593
    move-wide/from16 v10, v16

    .line 2594
    .line 2595
    goto :goto_33

    .line 2596
    :cond_50
    const-wide/16 v10, 0x0

    .line 2597
    .line 2598
    :goto_33
    invoke-static {v10, v11, v6}, La/vsm0;->s(JLjava/lang/String;)Ljava/lang/String;

    .line 2599
    .line 2600
    .line 2601
    move-result-object v6

    .line 2602
    invoke-static/range {v26 .. v26}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 2603
    .line 2604
    .line 2605
    move-result-object v9

    .line 2606
    check-cast v9, Ljava/lang/String;

    .line 2607
    .line 2608
    if-nez v9, :cond_51

    .line 2609
    .line 2610
    goto :goto_34

    .line 2611
    :cond_51
    move-object v5, v9

    .line 2612
    :goto_34
    iget-object v9, v2, La/m9s;->d:Ljava/util/List;

    .line 2613
    .line 2614
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 2615
    .line 2616
    .line 2617
    move-result-object v9

    .line 2618
    check-cast v9, Ljava/lang/Long;

    .line 2619
    .line 2620
    if-eqz v9, :cond_52

    .line 2621
    .line 2622
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 2623
    .line 2624
    .line 2625
    move-result-wide v10

    .line 2626
    goto :goto_35

    .line 2627
    :cond_52
    const-wide/16 v10, 0x0

    .line 2628
    .line 2629
    :goto_35
    invoke-static {v10, v11, v5}, La/vsm0;->s(JLjava/lang/String;)Ljava/lang/String;

    .line 2630
    .line 2631
    .line 2632
    move-result-object v5

    .line 2633
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 2634
    .line 2635
    .line 2636
    move-result v9

    .line 2637
    move-object/from16 v10, v33

    .line 2638
    .line 2639
    iget v11, v10, La/nxt0;->a:I

    .line 2640
    .line 2641
    if-le v9, v11, :cond_53

    .line 2642
    .line 2643
    const/4 v9, 0x1

    .line 2644
    goto :goto_36

    .line 2645
    :cond_53
    move/from16 v9, v27

    .line 2646
    .line 2647
    :goto_36
    invoke-direct {v4, v6, v5, v1, v9}, La/ogg0;-><init>(Ljava/lang/String;Ljava/lang/String;La/i4;Z)V

    .line 2648
    .line 2649
    .line 2650
    invoke-virtual {v13, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2651
    .line 2652
    .line 2653
    :goto_37
    move-object/from16 v35, v0

    .line 2654
    .line 2655
    move-object/from16 v19, v7

    .line 2656
    .line 2657
    move-object/from16 v33, v10

    .line 2658
    .line 2659
    goto/16 :goto_53

    .line 2660
    .line 2661
    :cond_54
    move-object/from16 v30, v0

    .line 2662
    .line 2663
    move-object v0, v2

    .line 2664
    move-object/from16 v32, v3

    .line 2665
    .line 2666
    move-object/from16 v36, v7

    .line 2667
    .line 2668
    move-object v7, v10

    .line 2669
    move-object v3, v12

    .line 2670
    move-object v10, v13

    .line 2671
    move-object/from16 v31, v15

    .line 2672
    .line 2673
    move-object/from16 v37, v24

    .line 2674
    .line 2675
    move/from16 v15, p1

    .line 2676
    .line 2677
    move-object v2, v1

    .line 2678
    move-object v13, v9

    .line 2679
    move/from16 v24, v11

    .line 2680
    .line 2681
    iget-wide v11, v14, La/vzt0;->b:J

    .line 2682
    .line 2683
    iget-object v1, v2, La/m9s;->i:Ljava/lang/String;

    .line 2684
    .line 2685
    iget-object v4, v2, La/m9s;->j:Ljava/lang/String;

    .line 2686
    .line 2687
    invoke-static {v7}, La/ofm0;->u(La/d0u0;)Z

    .line 2688
    .line 2689
    .line 2690
    move-result v6

    .line 2691
    if-eqz v6, :cond_55

    .line 2692
    .line 2693
    goto :goto_37

    .line 2694
    :cond_55
    iget-object v6, v0, La/g2u0;->d:Ljava/util/List;

    .line 2695
    .line 2696
    iget-object v9, v3, La/g2u0;->d:Ljava/util/List;

    .line 2697
    .line 2698
    sget-object v17, La/s1u0;->a:Ljava/util/List;

    .line 2699
    .line 2700
    move-object/from16 p1, v5

    .line 2701
    .line 2702
    new-instance v5, Ljava/util/ArrayList;

    .line 2703
    .line 2704
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 2705
    .line 2706
    .line 2707
    invoke-interface/range {v17 .. v17}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2708
    .line 2709
    .line 2710
    move-result-object v17

    .line 2711
    :goto_38
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    .line 2712
    .line 2713
    .line 2714
    move-result v18

    .line 2715
    if-eqz v18, :cond_6a

    .line 2716
    .line 2717
    move-object/from16 v19, v7

    .line 2718
    .line 2719
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2720
    .line 2721
    .line 2722
    move-result-object v7

    .line 2723
    move-object/from16 v33, v10

    .line 2724
    .line 2725
    move-object v10, v7

    .line 2726
    check-cast v10, La/mgm0;

    .line 2727
    .line 2728
    iget-byte v10, v10, La/mgm0;->a:B

    .line 2729
    .line 2730
    move-wide/from16 v20, v11

    .line 2731
    .line 2732
    int-to-long v10, v10

    .line 2733
    const-wide/16 v22, 0x1

    .line 2734
    .line 2735
    cmp-long v12, v10, v22

    .line 2736
    .line 2737
    if-nez v12, :cond_61

    .line 2738
    .line 2739
    if-eqz v6, :cond_56

    .line 2740
    .line 2741
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 2742
    .line 2743
    .line 2744
    move-result v10

    .line 2745
    if-eqz v10, :cond_56

    .line 2746
    .line 2747
    goto :goto_3c

    .line 2748
    :cond_56
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2749
    .line 2750
    .line 2751
    move-result-object v10

    .line 2752
    :goto_39
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 2753
    .line 2754
    .line 2755
    move-result v11

    .line 2756
    if-eqz v11, :cond_5a

    .line 2757
    .line 2758
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2759
    .line 2760
    .line 2761
    move-result-object v11

    .line 2762
    check-cast v11, La/byt0;

    .line 2763
    .line 2764
    iget-object v12, v11, La/byt0;->c:Ljava/lang/String;

    .line 2765
    .line 2766
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 2767
    .line 2768
    .line 2769
    move-result v12

    .line 2770
    if-lez v12, :cond_57

    .line 2771
    .line 2772
    :goto_3a
    move-object/from16 v18, v10

    .line 2773
    .line 2774
    goto :goto_3b

    .line 2775
    :cond_57
    iget-object v12, v11, La/byt0;->i:Ljava/lang/String;

    .line 2776
    .line 2777
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 2778
    .line 2779
    .line 2780
    move-result v12

    .line 2781
    if-lez v12, :cond_58

    .line 2782
    .line 2783
    goto :goto_3a

    .line 2784
    :cond_58
    iget v12, v11, La/byt0;->e:I

    .line 2785
    .line 2786
    move-object/from16 v18, v10

    .line 2787
    .line 2788
    const/4 v10, -0x1

    .line 2789
    if-ne v12, v10, :cond_59

    .line 2790
    .line 2791
    iget v12, v11, La/byt0;->g:I

    .line 2792
    .line 2793
    if-ne v12, v10, :cond_59

    .line 2794
    .line 2795
    iget v11, v11, La/byt0;->f:I

    .line 2796
    .line 2797
    if-eq v11, v10, :cond_5e

    .line 2798
    .line 2799
    :cond_59
    :goto_3b
    move-object/from16 v10, v18

    .line 2800
    .line 2801
    goto :goto_39

    .line 2802
    :cond_5a
    :goto_3c
    if-eqz v9, :cond_5b

    .line 2803
    .line 2804
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 2805
    .line 2806
    .line 2807
    move-result v10

    .line 2808
    if-eqz v10, :cond_5b

    .line 2809
    .line 2810
    goto :goto_40

    .line 2811
    :cond_5b
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2812
    .line 2813
    .line 2814
    move-result-object v10

    .line 2815
    :goto_3d
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 2816
    .line 2817
    .line 2818
    move-result v11

    .line 2819
    if-eqz v11, :cond_60

    .line 2820
    .line 2821
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2822
    .line 2823
    .line 2824
    move-result-object v11

    .line 2825
    check-cast v11, La/byt0;

    .line 2826
    .line 2827
    iget-object v12, v11, La/byt0;->c:Ljava/lang/String;

    .line 2828
    .line 2829
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 2830
    .line 2831
    .line 2832
    move-result v12

    .line 2833
    if-lez v12, :cond_5c

    .line 2834
    .line 2835
    :goto_3e
    move-object/from16 v18, v10

    .line 2836
    .line 2837
    goto :goto_3f

    .line 2838
    :cond_5c
    iget-object v12, v11, La/byt0;->i:Ljava/lang/String;

    .line 2839
    .line 2840
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 2841
    .line 2842
    .line 2843
    move-result v12

    .line 2844
    if-lez v12, :cond_5d

    .line 2845
    .line 2846
    goto :goto_3e

    .line 2847
    :cond_5d
    iget v12, v11, La/byt0;->e:I

    .line 2848
    .line 2849
    move-object/from16 v18, v10

    .line 2850
    .line 2851
    const/4 v10, -0x1

    .line 2852
    if-ne v12, v10, :cond_5f

    .line 2853
    .line 2854
    iget v12, v11, La/byt0;->g:I

    .line 2855
    .line 2856
    if-ne v12, v10, :cond_5f

    .line 2857
    .line 2858
    iget v11, v11, La/byt0;->f:I

    .line 2859
    .line 2860
    if-eq v11, v10, :cond_5e

    .line 2861
    .line 2862
    goto :goto_3f

    .line 2863
    :cond_5e
    const/4 v10, -0x1

    .line 2864
    goto/16 :goto_47

    .line 2865
    .line 2866
    :cond_5f
    :goto_3f
    move-object/from16 v10, v18

    .line 2867
    .line 2868
    goto :goto_3d

    .line 2869
    :cond_60
    :goto_40
    const/4 v10, -0x1

    .line 2870
    goto/16 :goto_46

    .line 2871
    .line 2872
    :cond_61
    const-wide/16 v22, 0x2

    .line 2873
    .line 2874
    cmp-long v10, v10, v22

    .line 2875
    .line 2876
    if-nez v10, :cond_5e

    .line 2877
    .line 2878
    if-eqz v6, :cond_62

    .line 2879
    .line 2880
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 2881
    .line 2882
    .line 2883
    move-result v10

    .line 2884
    if-eqz v10, :cond_62

    .line 2885
    .line 2886
    goto :goto_43

    .line 2887
    :cond_62
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2888
    .line 2889
    .line 2890
    move-result-object v10

    .line 2891
    :goto_41
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 2892
    .line 2893
    .line 2894
    move-result v11

    .line 2895
    if-eqz v11, :cond_65

    .line 2896
    .line 2897
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2898
    .line 2899
    .line 2900
    move-result-object v11

    .line 2901
    check-cast v11, La/byt0;

    .line 2902
    .line 2903
    iget-object v12, v11, La/byt0;->c:Ljava/lang/String;

    .line 2904
    .line 2905
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 2906
    .line 2907
    .line 2908
    move-result v12

    .line 2909
    if-lez v12, :cond_63

    .line 2910
    .line 2911
    move-object/from16 v18, v10

    .line 2912
    .line 2913
    goto :goto_42

    .line 2914
    :cond_63
    iget v12, v11, La/byt0;->k:I

    .line 2915
    .line 2916
    move-object/from16 v18, v10

    .line 2917
    .line 2918
    const/4 v10, -0x1

    .line 2919
    if-ne v12, v10, :cond_64

    .line 2920
    .line 2921
    iget v12, v11, La/byt0;->j:I

    .line 2922
    .line 2923
    if-ne v12, v10, :cond_64

    .line 2924
    .line 2925
    iget v12, v11, La/byt0;->l:I

    .line 2926
    .line 2927
    if-ne v12, v10, :cond_64

    .line 2928
    .line 2929
    iget v11, v11, La/byt0;->m:I

    .line 2930
    .line 2931
    if-eq v11, v10, :cond_69

    .line 2932
    .line 2933
    :cond_64
    :goto_42
    move-object/from16 v10, v18

    .line 2934
    .line 2935
    goto :goto_41

    .line 2936
    :cond_65
    :goto_43
    if-eqz v9, :cond_66

    .line 2937
    .line 2938
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 2939
    .line 2940
    .line 2941
    move-result v10

    .line 2942
    if-eqz v10, :cond_66

    .line 2943
    .line 2944
    goto :goto_40

    .line 2945
    :cond_66
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2946
    .line 2947
    .line 2948
    move-result-object v10

    .line 2949
    :goto_44
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 2950
    .line 2951
    .line 2952
    move-result v11

    .line 2953
    if-eqz v11, :cond_60

    .line 2954
    .line 2955
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2956
    .line 2957
    .line 2958
    move-result-object v11

    .line 2959
    check-cast v11, La/byt0;

    .line 2960
    .line 2961
    iget-object v12, v11, La/byt0;->c:Ljava/lang/String;

    .line 2962
    .line 2963
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 2964
    .line 2965
    .line 2966
    move-result v12

    .line 2967
    if-lez v12, :cond_67

    .line 2968
    .line 2969
    move-object/from16 v18, v10

    .line 2970
    .line 2971
    const/4 v10, -0x1

    .line 2972
    goto :goto_45

    .line 2973
    :cond_67
    iget v12, v11, La/byt0;->k:I

    .line 2974
    .line 2975
    move-object/from16 v18, v10

    .line 2976
    .line 2977
    const/4 v10, -0x1

    .line 2978
    if-ne v12, v10, :cond_68

    .line 2979
    .line 2980
    iget v12, v11, La/byt0;->j:I

    .line 2981
    .line 2982
    if-ne v12, v10, :cond_68

    .line 2983
    .line 2984
    iget v12, v11, La/byt0;->l:I

    .line 2985
    .line 2986
    if-ne v12, v10, :cond_68

    .line 2987
    .line 2988
    iget v11, v11, La/byt0;->m:I

    .line 2989
    .line 2990
    if-eq v11, v10, :cond_69

    .line 2991
    .line 2992
    :cond_68
    :goto_45
    move-object/from16 v10, v18

    .line 2993
    .line 2994
    goto :goto_44

    .line 2995
    :goto_46
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2996
    .line 2997
    .line 2998
    :cond_69
    :goto_47
    move-object/from16 v7, v19

    .line 2999
    .line 3000
    move-wide/from16 v11, v20

    .line 3001
    .line 3002
    move-object/from16 v10, v33

    .line 3003
    .line 3004
    goto/16 :goto_38

    .line 3005
    .line 3006
    :cond_6a
    move-object/from16 v19, v7

    .line 3007
    .line 3008
    move-object/from16 v33, v10

    .line 3009
    .line 3010
    move-wide/from16 v20, v11

    .line 3011
    .line 3012
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 3013
    .line 3014
    .line 3015
    move-result-object v7

    .line 3016
    :cond_6b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 3017
    .line 3018
    .line 3019
    move-result v10

    .line 3020
    if-eqz v10, :cond_6c

    .line 3021
    .line 3022
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3023
    .line 3024
    .line 3025
    move-result-object v10

    .line 3026
    move-object v11, v10

    .line 3027
    check-cast v11, La/mgm0;

    .line 3028
    .line 3029
    iget-byte v11, v11, La/mgm0;->a:B

    .line 3030
    .line 3031
    int-to-long v11, v11

    .line 3032
    cmp-long v11, v11, v20

    .line 3033
    .line 3034
    if-nez v11, :cond_6b

    .line 3035
    .line 3036
    goto :goto_48

    .line 3037
    :cond_6c
    const/4 v10, 0x0

    .line 3038
    :goto_48
    check-cast v10, La/mgm0;

    .line 3039
    .line 3040
    if-nez v10, :cond_6d

    .line 3041
    .line 3042
    sget-object v7, La/s1u0;->a:Ljava/util/List;

    .line 3043
    .line 3044
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 3045
    .line 3046
    .line 3047
    move-result-object v7

    .line 3048
    move-object v10, v7

    .line 3049
    check-cast v10, La/mgm0;

    .line 3050
    .line 3051
    :cond_6d
    iget-object v7, v3, La/g2u0;->c:La/u1u0;

    .line 3052
    .line 3053
    sget-object v11, La/u1u0;->b:La/u1u0;

    .line 3054
    .line 3055
    if-ne v7, v11, :cond_6e

    .line 3056
    .line 3057
    move-object v7, v9

    .line 3058
    goto :goto_49

    .line 3059
    :cond_6e
    const/4 v7, 0x0

    .line 3060
    :goto_49
    if-eqz v7, :cond_70

    .line 3061
    .line 3062
    new-instance v11, La/rgm0;

    .line 3063
    .line 3064
    invoke-static/range {v26 .. v26}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 3065
    .line 3066
    .line 3067
    move-result-object v12

    .line 3068
    check-cast v12, Ljava/lang/String;

    .line 3069
    .line 3070
    if-nez v12, :cond_6f

    .line 3071
    .line 3072
    move-object/from16 v12, p1

    .line 3073
    .line 3074
    :cond_6f
    invoke-direct {v11, v7, v12, v4}, La/rgm0;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 3075
    .line 3076
    .line 3077
    goto :goto_4a

    .line 3078
    :cond_70
    new-instance v11, La/rgm0;

    .line 3079
    .line 3080
    invoke-static/range {p0 .. p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 3081
    .line 3082
    .line 3083
    move-result-object v7

    .line 3084
    check-cast v7, Ljava/lang/String;

    .line 3085
    .line 3086
    if-nez v7, :cond_71

    .line 3087
    .line 3088
    move-object/from16 v7, p1

    .line 3089
    .line 3090
    :cond_71
    invoke-direct {v11, v6, v7, v1}, La/rgm0;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 3091
    .line 3092
    .line 3093
    :goto_4a
    iget-object v7, v0, La/g2u0;->c:La/u1u0;

    .line 3094
    .line 3095
    sget-object v12, La/u1u0;->a:La/u1u0;

    .line 3096
    .line 3097
    if-ne v7, v12, :cond_72

    .line 3098
    .line 3099
    goto :goto_4b

    .line 3100
    :cond_72
    const/4 v6, 0x0

    .line 3101
    :goto_4b
    if-eqz v6, :cond_74

    .line 3102
    .line 3103
    new-instance v4, La/rgm0;

    .line 3104
    .line 3105
    invoke-static/range {p0 .. p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 3106
    .line 3107
    .line 3108
    move-result-object v7

    .line 3109
    check-cast v7, Ljava/lang/String;

    .line 3110
    .line 3111
    if-nez v7, :cond_73

    .line 3112
    .line 3113
    move-object/from16 v7, p1

    .line 3114
    .line 3115
    :cond_73
    invoke-direct {v4, v6, v7, v1}, La/rgm0;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 3116
    .line 3117
    .line 3118
    goto :goto_4c

    .line 3119
    :cond_74
    new-instance v1, La/rgm0;

    .line 3120
    .line 3121
    invoke-static/range {v26 .. v26}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 3122
    .line 3123
    .line 3124
    move-result-object v6

    .line 3125
    check-cast v6, Ljava/lang/String;

    .line 3126
    .line 3127
    if-nez v6, :cond_75

    .line 3128
    .line 3129
    move-object/from16 v6, p1

    .line 3130
    .line 3131
    :cond_75
    invoke-direct {v1, v9, v6, v4}, La/rgm0;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 3132
    .line 3133
    .line 3134
    move-object v4, v1

    .line 3135
    :goto_4c
    new-instance v1, La/psv;

    .line 3136
    .line 3137
    const-string v6, "STATISTIC_TABLE_HEADER"

    .line 3138
    .line 3139
    const v7, 0x7f131388

    .line 3140
    .line 3141
    .line 3142
    invoke-direct {v1, v6, v7}, La/psv;-><init>(Ljava/lang/String;I)V

    .line 3143
    .line 3144
    .line 3145
    invoke-virtual {v13, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3146
    .line 3147
    .line 3148
    invoke-static {v10, v5, v8}, La/ibm0;->i(La/mgm0;Ljava/util/List;La/ctf0;)La/boo0;

    .line 3149
    .line 3150
    .line 3151
    move-result-object v1

    .line 3152
    invoke-virtual {v13, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3153
    .line 3154
    .line 3155
    instance-of v1, v10, La/lgm0;

    .line 3156
    .line 3157
    iget-object v5, v11, La/rgm0;->a:Ljava/util/List;

    .line 3158
    .line 3159
    iget-object v6, v11, La/rgm0;->c:Ljava/lang/String;

    .line 3160
    .line 3161
    iget-object v7, v11, La/rgm0;->b:Ljava/lang/String;

    .line 3162
    .line 3163
    iget-object v9, v4, La/rgm0;->a:Ljava/util/List;

    .line 3164
    .line 3165
    iget-object v11, v4, La/rgm0;->c:Ljava/lang/String;

    .line 3166
    .line 3167
    iget-object v4, v4, La/rgm0;->b:Ljava/lang/String;

    .line 3168
    .line 3169
    move-object/from16 v35, v0

    .line 3170
    .line 3171
    move v12, v1

    .line 3172
    if-eqz v1, :cond_78

    .line 3173
    .line 3174
    sget-wide v0, La/ijg;->p0:J

    .line 3175
    .line 3176
    invoke-static {v0, v1, v8, v6, v7}, La/jcb;->S(JLa/ctf0;Ljava/lang/String;Ljava/lang/String;)La/qgm0;

    .line 3177
    .line 3178
    .line 3179
    move-result-object v0

    .line 3180
    new-instance v1, Ljava/util/ArrayList;

    .line 3181
    .line 3182
    const/16 v7, 0xa

    .line 3183
    .line 3184
    invoke-static {v5, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 3185
    .line 3186
    .line 3187
    move-result v6

    .line 3188
    invoke-direct {v1, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 3189
    .line 3190
    .line 3191
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3192
    .line 3193
    .line 3194
    move-result-object v5

    .line 3195
    :goto_4d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 3196
    .line 3197
    .line 3198
    move-result v6

    .line 3199
    if-eqz v6, :cond_76

    .line 3200
    .line 3201
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3202
    .line 3203
    .line 3204
    move-result-object v6

    .line 3205
    check-cast v6, La/byt0;

    .line 3206
    .line 3207
    invoke-static {v6}, La/rcb;->f0(La/byt0;)La/qgm0;

    .line 3208
    .line 3209
    .line 3210
    move-result-object v6

    .line 3211
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3212
    .line 3213
    .line 3214
    goto :goto_4d

    .line 3215
    :cond_76
    sget-wide v5, La/ijg;->k0:J

    .line 3216
    .line 3217
    invoke-static {v5, v6, v8, v11, v4}, La/jcb;->S(JLa/ctf0;Ljava/lang/String;Ljava/lang/String;)La/qgm0;

    .line 3218
    .line 3219
    .line 3220
    move-result-object v4

    .line 3221
    new-instance v5, Ljava/util/ArrayList;

    .line 3222
    .line 3223
    const/16 v11, 0xa

    .line 3224
    .line 3225
    invoke-static {v9, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 3226
    .line 3227
    .line 3228
    move-result v6

    .line 3229
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 3230
    .line 3231
    .line 3232
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3233
    .line 3234
    .line 3235
    move-result-object v6

    .line 3236
    :goto_4e
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 3237
    .line 3238
    .line 3239
    move-result v7

    .line 3240
    if-eqz v7, :cond_77

    .line 3241
    .line 3242
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3243
    .line 3244
    .line 3245
    move-result-object v7

    .line 3246
    check-cast v7, La/byt0;

    .line 3247
    .line 3248
    invoke-static {v7}, La/rcb;->f0(La/byt0;)La/qgm0;

    .line 3249
    .line 3250
    .line 3251
    move-result-object v7

    .line 3252
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3253
    .line 3254
    .line 3255
    goto :goto_4e

    .line 3256
    :cond_77
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 3257
    .line 3258
    .line 3259
    move-result-object v6

    .line 3260
    invoke-virtual {v6, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3261
    .line 3262
    .line 3263
    invoke-virtual {v6, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 3264
    .line 3265
    .line 3266
    invoke-virtual {v6, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3267
    .line 3268
    .line 3269
    invoke-virtual {v6, v5}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 3270
    .line 3271
    .line 3272
    invoke-static {v6}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 3273
    .line 3274
    .line 3275
    move-result-object v0

    .line 3276
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 3277
    .line 3278
    .line 3279
    move-result-object v0

    .line 3280
    goto :goto_51

    .line 3281
    :cond_78
    instance-of v0, v10, La/kgm0;

    .line 3282
    .line 3283
    if-eqz v0, :cond_7d

    .line 3284
    .line 3285
    sget-wide v0, La/ijg;->p0:J

    .line 3286
    .line 3287
    invoke-static {v0, v1, v8, v6, v7}, La/slb;->K(JLa/ctf0;Ljava/lang/String;Ljava/lang/String;)La/qgm0;

    .line 3288
    .line 3289
    .line 3290
    move-result-object v0

    .line 3291
    new-instance v1, Ljava/util/ArrayList;

    .line 3292
    .line 3293
    const/16 v7, 0xa

    .line 3294
    .line 3295
    invoke-static {v5, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 3296
    .line 3297
    .line 3298
    move-result v6

    .line 3299
    invoke-direct {v1, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 3300
    .line 3301
    .line 3302
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3303
    .line 3304
    .line 3305
    move-result-object v5

    .line 3306
    :goto_4f
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 3307
    .line 3308
    .line 3309
    move-result v6

    .line 3310
    if-eqz v6, :cond_79

    .line 3311
    .line 3312
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3313
    .line 3314
    .line 3315
    move-result-object v6

    .line 3316
    check-cast v6, La/byt0;

    .line 3317
    .line 3318
    invoke-static {v6}, La/tlb;->F(La/byt0;)La/qgm0;

    .line 3319
    .line 3320
    .line 3321
    move-result-object v6

    .line 3322
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3323
    .line 3324
    .line 3325
    goto :goto_4f

    .line 3326
    :cond_79
    sget-wide v5, La/ijg;->k0:J

    .line 3327
    .line 3328
    invoke-static {v5, v6, v8, v11, v4}, La/slb;->K(JLa/ctf0;Ljava/lang/String;Ljava/lang/String;)La/qgm0;

    .line 3329
    .line 3330
    .line 3331
    move-result-object v4

    .line 3332
    new-instance v5, Ljava/util/ArrayList;

    .line 3333
    .line 3334
    const/16 v11, 0xa

    .line 3335
    .line 3336
    invoke-static {v9, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 3337
    .line 3338
    .line 3339
    move-result v6

    .line 3340
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 3341
    .line 3342
    .line 3343
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3344
    .line 3345
    .line 3346
    move-result-object v6

    .line 3347
    :goto_50
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 3348
    .line 3349
    .line 3350
    move-result v7

    .line 3351
    if-eqz v7, :cond_7a

    .line 3352
    .line 3353
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3354
    .line 3355
    .line 3356
    move-result-object v7

    .line 3357
    check-cast v7, La/byt0;

    .line 3358
    .line 3359
    invoke-static {v7}, La/tlb;->F(La/byt0;)La/qgm0;

    .line 3360
    .line 3361
    .line 3362
    move-result-object v7

    .line 3363
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3364
    .line 3365
    .line 3366
    goto :goto_50

    .line 3367
    :cond_7a
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 3368
    .line 3369
    .line 3370
    move-result-object v6

    .line 3371
    invoke-virtual {v6, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3372
    .line 3373
    .line 3374
    invoke-virtual {v6, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 3375
    .line 3376
    .line 3377
    invoke-virtual {v6, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3378
    .line 3379
    .line 3380
    invoke-virtual {v6, v5}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 3381
    .line 3382
    .line 3383
    invoke-static {v6}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 3384
    .line 3385
    .line 3386
    move-result-object v0

    .line 3387
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 3388
    .line 3389
    .line 3390
    move-result-object v0

    .line 3391
    :goto_51
    if-eqz v12, :cond_7b

    .line 3392
    .line 3393
    const-string v1, "STATISTIC_TABLE_MAIN"

    .line 3394
    .line 3395
    goto :goto_52

    .line 3396
    :cond_7b
    instance-of v1, v10, La/kgm0;

    .line 3397
    .line 3398
    if-eqz v1, :cond_7c

    .line 3399
    .line 3400
    const-string v1, "STATISTIC_TABLE_ADDITIONAL"

    .line 3401
    .line 3402
    :goto_52
    new-instance v4, La/fhm0;

    .line 3403
    .line 3404
    invoke-direct {v4, v0, v1}, La/fhm0;-><init>(La/a4x;Ljava/lang/String;)V

    .line 3405
    .line 3406
    .line 3407
    invoke-virtual {v13, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3408
    .line 3409
    .line 3410
    :goto_53
    move-object v1, v2

    .line 3411
    move-object v12, v3

    .line 3412
    move-object v9, v13

    .line 3413
    move/from16 p1, v15

    .line 3414
    .line 3415
    move-object/from16 v10, v19

    .line 3416
    .line 3417
    move/from16 v11, v24

    .line 3418
    .line 3419
    move-object/from16 v0, v30

    .line 3420
    .line 3421
    move-object/from16 v15, v31

    .line 3422
    .line 3423
    move-object/from16 v3, v32

    .line 3424
    .line 3425
    move-object/from16 v13, v33

    .line 3426
    .line 3427
    move-object/from16 v2, v35

    .line 3428
    .line 3429
    move-object/from16 v7, v36

    .line 3430
    .line 3431
    move-object/from16 v24, v37

    .line 3432
    .line 3433
    goto/16 :goto_7

    .line 3434
    .line 3435
    :cond_7c
    invoke-static {}, La/t9f;->b()V

    .line 3436
    .line 3437
    .line 3438
    goto/16 :goto_b

    .line 3439
    .line 3440
    :cond_7d
    invoke-static {}, La/t9f;->b()V

    .line 3441
    .line 3442
    .line 3443
    goto/16 :goto_b

    .line 3444
    .line 3445
    :cond_7e
    move-object v2, v1

    .line 3446
    move-object v13, v9

    .line 3447
    move-object/from16 v31, v15

    .line 3448
    .line 3449
    iget-boolean v0, v3, La/vxt0;->b:Z

    .line 3450
    .line 3451
    new-instance v1, Ljava/util/ArrayList;

    .line 3452
    .line 3453
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 3454
    .line 3455
    .line 3456
    iget v2, v2, La/m9s;->D:I

    .line 3457
    .line 3458
    if-lez v2, :cond_7f

    .line 3459
    .line 3460
    if-eqz v0, :cond_7f

    .line 3461
    .line 3462
    invoke-static {v8}, La/feb;->K(La/ctf0;)La/rx;

    .line 3463
    .line 3464
    .line 3465
    move-result-object v2

    .line 3466
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3467
    .line 3468
    .line 3469
    :cond_7f
    if-eqz v0, :cond_80

    .line 3470
    .line 3471
    move-object/from16 v4, v31

    .line 3472
    .line 3473
    invoke-static {v8, v4}, La/n7x;->w(La/ctf0;Ljava/util/List;)La/rx;

    .line 3474
    .line 3475
    .line 3476
    move-result-object v0

    .line 3477
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3478
    .line 3479
    .line 3480
    :cond_80
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 3481
    .line 3482
    .line 3483
    move-result v0

    .line 3484
    if-eqz v0, :cond_81

    .line 3485
    .line 3486
    goto :goto_54

    .line 3487
    :cond_81
    new-instance v0, La/psv;

    .line 3488
    .line 3489
    const-string v2, "ADDITIONAL_INFO_HEADER"

    .line 3490
    .line 3491
    const v3, 0x7f13006f

    .line 3492
    .line 3493
    .line 3494
    invoke-direct {v0, v2, v3}, La/psv;-><init>(Ljava/lang/String;I)V

    .line 3495
    .line 3496
    .line 3497
    invoke-virtual {v13, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3498
    .line 3499
    .line 3500
    new-instance v0, La/wy;

    .line 3501
    .line 3502
    const-string v2, "ADDITIONAL_INFO"

    .line 3503
    .line 3504
    invoke-static {v1}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 3505
    .line 3506
    .line 3507
    move-result-object v1

    .line 3508
    invoke-direct {v0, v1, v2}, La/wy;-><init>(La/i4;Ljava/lang/String;)V

    .line 3509
    .line 3510
    .line 3511
    invoke-virtual {v13, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3512
    .line 3513
    .line 3514
    :goto_54
    invoke-static {v13}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 3515
    .line 3516
    .line 3517
    move-result-object v0

    .line 3518
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 3519
    .line 3520
    .line 3521
    move-result-object v2

    .line 3522
    goto :goto_55

    .line 3523
    :cond_82
    sget-object v2, La/lak0;->c:La/lak0;

    .line 3524
    .line 3525
    :goto_55
    return-object v2

    .line 3526
    :pswitch_2
    move-object/from16 v1, p1

    .line 3527
    .line 3528
    check-cast v1, La/fee;

    .line 3529
    .line 3530
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3531
    .line 3532
    .line 3533
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 3534
    .line 3535
    .line 3536
    move-result-object v1

    .line 3537
    move-object v2, v1

    .line 3538
    check-cast v2, La/jlr;

    .line 3539
    .line 3540
    iget-object v1, v0, La/v6o;->g:La/n0o0;

    .line 3541
    .line 3542
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3543
    .line 3544
    .line 3545
    move-result-object v1

    .line 3546
    check-cast v1, La/fee;

    .line 3547
    .line 3548
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 3549
    .line 3550
    .line 3551
    move-result-object v1

    .line 3552
    check-cast v1, Ljava/lang/Boolean;

    .line 3553
    .line 3554
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 3555
    .line 3556
    .line 3557
    move-result v3

    .line 3558
    iget-object v1, v0, La/v6o;->D:Ljava/lang/Object;

    .line 3559
    .line 3560
    check-cast v1, La/b0u0;

    .line 3561
    .line 3562
    iget-object v4, v1, La/b0u0;->r:La/sff0;

    .line 3563
    .line 3564
    iget-boolean v4, v4, La/sff0;->J:Z

    .line 3565
    .line 3566
    iget-object v5, v0, La/v6o;->m:La/n0o0;

    .line 3567
    .line 3568
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3569
    .line 3570
    .line 3571
    move-result-object v5

    .line 3572
    check-cast v5, La/fee;

    .line 3573
    .line 3574
    invoke-virtual {v5}, La/fee;->c()Ljava/lang/Object;

    .line 3575
    .line 3576
    .line 3577
    move-result-object v5

    .line 3578
    check-cast v5, Ljava/lang/Boolean;

    .line 3579
    .line 3580
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 3581
    .line 3582
    .line 3583
    move-result v5

    .line 3584
    iget-object v6, v0, La/v6o;->n:La/n0o0;

    .line 3585
    .line 3586
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3587
    .line 3588
    .line 3589
    move-result-object v6

    .line 3590
    check-cast v6, La/fee;

    .line 3591
    .line 3592
    invoke-virtual {v6}, La/fee;->c()Ljava/lang/Object;

    .line 3593
    .line 3594
    .line 3595
    move-result-object v6

    .line 3596
    check-cast v6, Ljava/lang/Boolean;

    .line 3597
    .line 3598
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 3599
    .line 3600
    .line 3601
    move-result v6

    .line 3602
    iget-boolean v7, v1, La/b0u0;->u:Z

    .line 3603
    .line 3604
    iget-object v0, v0, La/v6o;->l:La/n0o0;

    .line 3605
    .line 3606
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3607
    .line 3608
    .line 3609
    move-result-object v0

    .line 3610
    check-cast v0, La/fee;

    .line 3611
    .line 3612
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 3613
    .line 3614
    .line 3615
    move-result-object v0

    .line 3616
    move-object v8, v0

    .line 3617
    check-cast v8, La/yws;

    .line 3618
    .line 3619
    invoke-static/range {v2 .. v8}, La/ulb;->j0(La/jlr;ZZZZZLa/yws;)La/its;

    .line 3620
    .line 3621
    .line 3622
    move-result-object v0

    .line 3623
    return-object v0

    .line 3624
    :pswitch_3
    move-object/from16 v1, p1

    .line 3625
    .line 3626
    check-cast v1, La/fee;

    .line 3627
    .line 3628
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3629
    .line 3630
    .line 3631
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 3632
    .line 3633
    .line 3634
    move-result-object v1

    .line 3635
    check-cast v1, La/jlr;

    .line 3636
    .line 3637
    invoke-static {v1}, La/d5c;->C(La/jlr;)La/m9s;

    .line 3638
    .line 3639
    .line 3640
    move-result-object v2

    .line 3641
    iget-object v5, v0, La/v6o;->b:La/ctf0;

    .line 3642
    .line 3643
    iget-object v1, v0, La/v6o;->D:Ljava/lang/Object;

    .line 3644
    .line 3645
    check-cast v1, La/b0u0;

    .line 3646
    .line 3647
    if-eqz v2, :cond_84

    .line 3648
    .line 3649
    iget-object v3, v0, La/v6o;->e:La/n0o0;

    .line 3650
    .line 3651
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3652
    .line 3653
    .line 3654
    move-result-object v3

    .line 3655
    check-cast v3, La/fee;

    .line 3656
    .line 3657
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 3658
    .line 3659
    .line 3660
    move-result-object v3

    .line 3661
    check-cast v3, La/vxt0;

    .line 3662
    .line 3663
    if-eqz v3, :cond_83

    .line 3664
    .line 3665
    invoke-static {v3, v2}, La/ahb;->b0(La/vxt0;La/m9s;)La/la30;

    .line 3666
    .line 3667
    .line 3668
    move-result-object v3

    .line 3669
    goto :goto_56

    .line 3670
    :cond_83
    const/4 v3, 0x0

    .line 3671
    :goto_56
    move-object v6, v3

    .line 3672
    goto :goto_57

    .line 3673
    :cond_84
    const/4 v6, 0x0

    .line 3674
    :goto_57
    iget-object v3, v0, La/v6o;->g:La/n0o0;

    .line 3675
    .line 3676
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3677
    .line 3678
    .line 3679
    move-result-object v3

    .line 3680
    check-cast v3, La/fee;

    .line 3681
    .line 3682
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 3683
    .line 3684
    .line 3685
    move-result-object v3

    .line 3686
    check-cast v3, Ljava/lang/Boolean;

    .line 3687
    .line 3688
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 3689
    .line 3690
    .line 3691
    move-result v7

    .line 3692
    iget-object v3, v0, La/v6o;->j:La/n0o0;

    .line 3693
    .line 3694
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3695
    .line 3696
    .line 3697
    move-result-object v3

    .line 3698
    check-cast v3, La/fee;

    .line 3699
    .line 3700
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 3701
    .line 3702
    .line 3703
    move-result-object v3

    .line 3704
    move-object v8, v3

    .line 3705
    check-cast v8, Ljava/util/List;

    .line 3706
    .line 3707
    iget-boolean v9, v1, La/b0u0;->y:Z

    .line 3708
    .line 3709
    iget-object v0, v0, La/v6o;->f:La/n0o0;

    .line 3710
    .line 3711
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3712
    .line 3713
    .line 3714
    move-result-object v0

    .line 3715
    check-cast v0, La/fee;

    .line 3716
    .line 3717
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 3718
    .line 3719
    .line 3720
    move-result-object v0

    .line 3721
    check-cast v0, La/ypl0;

    .line 3722
    .line 3723
    iget-object v0, v0, La/ypl0;->c:La/lel0;

    .line 3724
    .line 3725
    iget-object v11, v0, La/lel0;->a:Ljava/lang/String;

    .line 3726
    .line 3727
    iget-object v0, v1, La/b0u0;->a:Lorg/xplatform/cyber/game/valorant/api/ValorantGameScreenParams;

    .line 3728
    .line 3729
    iget-object v12, v0, Lorg/xplatform/cyber/game/valorant/api/ValorantGameScreenParams;->g:Ljava/lang/String;

    .line 3730
    .line 3731
    const/4 v3, 0x0

    .line 3732
    const/4 v4, 0x0

    .line 3733
    const/4 v10, 0x1

    .line 3734
    invoke-static/range {v2 .. v12}, La/hkb;->P(La/m9s;ZZLa/ctf0;La/la30;ZLjava/util/List;ZZLjava/lang/String;Ljava/lang/String;)La/zqg;

    .line 3735
    .line 3736
    .line 3737
    move-result-object v0

    .line 3738
    return-object v0

    .line 3739
    :pswitch_4
    move-object/from16 v1, p1

    .line 3740
    .line 3741
    check-cast v1, La/fee;

    .line 3742
    .line 3743
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3744
    .line 3745
    .line 3746
    new-instance v1, La/avs;

    .line 3747
    .line 3748
    iget-object v2, v0, La/v6o;->k:La/n0o0;

    .line 3749
    .line 3750
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3751
    .line 3752
    .line 3753
    move-result-object v2

    .line 3754
    check-cast v2, La/fee;

    .line 3755
    .line 3756
    iget-object v2, v2, La/fee;->d:La/pz40;

    .line 3757
    .line 3758
    iget-object v3, v0, La/v6o;->o:La/n0o0;

    .line 3759
    .line 3760
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3761
    .line 3762
    .line 3763
    move-result-object v3

    .line 3764
    check-cast v3, La/fee;

    .line 3765
    .line 3766
    iget-object v3, v3, La/fee;->d:La/pz40;

    .line 3767
    .line 3768
    iget-object v4, v0, La/v6o;->h:La/n0o0;

    .line 3769
    .line 3770
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3771
    .line 3772
    .line 3773
    move-result-object v4

    .line 3774
    check-cast v4, La/fee;

    .line 3775
    .line 3776
    iget-object v4, v4, La/fee;->d:La/pz40;

    .line 3777
    .line 3778
    iget-object v0, v0, La/v6o;->i:La/n0o0;

    .line 3779
    .line 3780
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 3781
    .line 3782
    .line 3783
    move-result-object v0

    .line 3784
    check-cast v0, La/fee;

    .line 3785
    .line 3786
    iget-object v0, v0, La/fee;->d:La/pz40;

    .line 3787
    .line 3788
    invoke-direct {v1, v2, v3, v4, v0}, La/avs;-><init>(La/l7m0;La/l7m0;La/l7m0;La/l7m0;)V

    .line 3789
    .line 3790
    .line 3791
    return-object v1

    .line 3792
    nop

    .line 3793
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
