.class public final La/tvu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public synthetic k:Ljava/lang/Object;

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/tvu;->i:B

    iput-object p1, p0, La/tvu;->m:Ljava/lang/Object;

    iput-object p2, p0, La/tvu;->n:Ljava/lang/Object;

    const/4 p1, 0x4

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/tvu;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/tvu;->n:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, p0, La/tvu;->m:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, La/tvu;->j:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v11, v0

    .line 15
    check-cast v11, Ljava/util/List;

    .line 16
    .line 17
    iget-object v0, p0, La/tvu;->k:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, La/w2s0;

    .line 20
    .line 21
    iget-object p0, p0, La/tvu;->l:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Ljava/util/List;

    .line 24
    .line 25
    sget-object v5, La/wne;->a:La/wne;

    .line 26
    .line 27
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    move-object v5, v4

    .line 31
    check-cast v5, La/gu1;

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-nez p1, :cond_1

    .line 40
    .line 41
    :cond_0
    sget-object p1, La/iun;->a:La/iun;

    .line 42
    .line 43
    :cond_1
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    iget-wide v6, v5, La/gu1;->a:J

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    invoke-interface {p1, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    :cond_2
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eqz v4, :cond_3

    .line 70
    .line 71
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    move-object v8, v4

    .line 76
    check-cast v8, La/w2s0;

    .line 77
    .line 78
    iget-wide v8, v8, La/w2s0;->a:J

    .line 79
    .line 80
    cmp-long v8, v8, v6

    .line 81
    .line 82
    if-nez v8, :cond_2

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_3
    move-object v4, v2

    .line 86
    :goto_0
    check-cast v4, La/w2s0;

    .line 87
    .line 88
    if-eqz v4, :cond_4

    .line 89
    .line 90
    iget-boolean v0, v4, La/w2s0;->b:Z

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_4
    move v0, v3

    .line 94
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    invoke-interface {p1, v4}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    :cond_5
    invoke-interface {v4}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    if-eqz v8, :cond_6

    .line 107
    .line 108
    invoke-interface {v4}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    move-object v9, v8

    .line 113
    check-cast v9, La/w2s0;

    .line 114
    .line 115
    iget-wide v9, v9, La/w2s0;->a:J

    .line 116
    .line 117
    cmp-long v9, v9, v6

    .line 118
    .line 119
    if-nez v9, :cond_5

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_6
    move-object v8, v2

    .line 123
    :goto_2
    check-cast v8, La/w2s0;

    .line 124
    .line 125
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    const/4 v9, 0x1

    .line 130
    if-nez v4, :cond_7

    .line 131
    .line 132
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    if-ne v4, v9, :cond_7

    .line 137
    .line 138
    move v3, v9

    .line 139
    :cond_7
    iget-object v4, v5, La/gu1;->p:La/re9;

    .line 140
    .line 141
    sget-object v10, La/re9;->c:La/re9;

    .line 142
    .line 143
    if-ne v4, v10, :cond_8

    .line 144
    .line 145
    sget-object v3, La/gqt0;->h:La/gqt0;

    .line 146
    .line 147
    :goto_3
    move-object v8, v3

    .line 148
    goto :goto_5

    .line 149
    :cond_8
    if-eqz v8, :cond_9

    .line 150
    .line 151
    iget-boolean v4, v8, La/w2s0;->d:Z

    .line 152
    .line 153
    if-ne v4, v9, :cond_9

    .line 154
    .line 155
    sget-object v3, La/gqt0;->d:La/gqt0;

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_9
    iget-object v4, v5, La/gu1;->b:La/z1s0;

    .line 159
    .line 160
    sget-object v10, La/z1s0;->b:La/z1s0;

    .line 161
    .line 162
    if-eq v4, v10, :cond_b

    .line 163
    .line 164
    sget-object v10, La/z1s0;->a:La/z1s0;

    .line 165
    .line 166
    if-ne v4, v10, :cond_a

    .line 167
    .line 168
    if-eqz v8, :cond_a

    .line 169
    .line 170
    iget-boolean v4, v8, La/w2s0;->b:Z

    .line 171
    .line 172
    if-ne v4, v9, :cond_a

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_a
    sget-object v3, La/gqt0;->a:La/gqt0;

    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_b
    :goto_4
    if-eqz v3, :cond_c

    .line 179
    .line 180
    sget-object v3, La/gqt0;->g:La/gqt0;

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_c
    sget-object v3, La/gqt0;->f:La/gqt0;

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :goto_5
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    :cond_d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    if-eqz v3, :cond_e

    .line 195
    .line 196
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    move-object v4, v3

    .line 201
    check-cast v4, La/w2s0;

    .line 202
    .line 203
    iget-wide v9, v4, La/w2s0;->a:J

    .line 204
    .line 205
    cmp-long v4, v9, v6

    .line 206
    .line 207
    if-nez v4, :cond_d

    .line 208
    .line 209
    move-object v2, v3

    .line 210
    :cond_e
    check-cast v2, La/w2s0;

    .line 211
    .line 212
    if-eqz v2, :cond_f

    .line 213
    .line 214
    iget-wide v2, v2, La/w2s0;->c:J

    .line 215
    .line 216
    :goto_6
    move-wide v9, v2

    .line 217
    goto :goto_7

    .line 218
    :cond_f
    const-wide/16 v2, 0x0

    .line 219
    .line 220
    goto :goto_6

    .line 221
    :goto_7
    new-instance v7, La/k98;

    .line 222
    .line 223
    invoke-direct {v7, p0}, La/k98;-><init>(Ljava/util/List;)V

    .line 224
    .line 225
    .line 226
    const v12, 0xdf7b

    .line 227
    .line 228
    .line 229
    move v6, v0

    .line 230
    invoke-static/range {v5 .. v12}, La/gu1;->a(La/gu1;ZLa/k98;La/gqt0;JLjava/util/List;I)La/gu1;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    check-cast v1, La/wdu;

    .line 235
    .line 236
    iget-object p1, v1, La/wdu;->j:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast p1, La/r2v;

    .line 239
    .line 240
    iget-wide v0, p0, La/gu1;->a:J

    .line 241
    .line 242
    iget-object v2, p0, La/gu1;->n:La/gqt0;

    .line 243
    .line 244
    iget-object p1, p1, La/r2v;->a:La/j9s0;

    .line 245
    .line 246
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    iget-object p1, p1, La/j9s0;->d:La/r9s0;

    .line 250
    .line 251
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    iget-object p1, p1, La/r9s0;->a:La/p7m0;

    .line 255
    .line 256
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    check-cast v3, Ljava/util/Map;

    .line 261
    .line 262
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    new-instance v1, Lkotlin/Pair;

    .line 267
    .line 268
    invoke-direct {v1, v0, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    invoke-static {v3, v1}, La/xp20;->k(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-virtual {p1, v0}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    return-object p0

    .line 279
    :pswitch_0
    iget-object v0, p0, La/tvu;->j:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v0, La/dqk0;

    .line 282
    .line 283
    iget-object v5, p0, La/tvu;->k:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast v5, La/dqk0;

    .line 286
    .line 287
    iget-object p0, p0, La/tvu;->l:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast p0, La/dqk0;

    .line 290
    .line 291
    sget-object v6, La/wne;->a:La/wne;

    .line 292
    .line 293
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    check-cast v4, La/lhf0;

    .line 297
    .line 298
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    invoke-static {v0}, La/lhf0;->D(La/dqk0;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    check-cast p1, Ljava/util/List;

    .line 306
    .line 307
    invoke-static {v5}, La/lhf0;->D(La/dqk0;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    check-cast v0, Ljava/util/List;

    .line 312
    .line 313
    invoke-static {p0}, La/lhf0;->D(La/dqk0;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object p0

    .line 317
    check-cast p0, La/rzv;

    .line 318
    .line 319
    check-cast v1, Ljava/util/ArrayList;

    .line 320
    .line 321
    new-instance v4, Ljava/util/ArrayList;

    .line 322
    .line 323
    const/16 v5, 0xa

    .line 324
    .line 325
    invoke-static {v1, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 326
    .line 327
    .line 328
    move-result v5

    .line 329
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 337
    .line 338
    .line 339
    move-result v5

    .line 340
    if-eqz v5, :cond_1f

    .line 341
    .line 342
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v5

    .line 346
    check-cast v5, Ljava/lang/Number;

    .line 347
    .line 348
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 349
    .line 350
    .line 351
    move-result-wide v5

    .line 352
    if-eqz p1, :cond_13

    .line 353
    .line 354
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 355
    .line 356
    .line 357
    move-result v7

    .line 358
    if-eqz v7, :cond_10

    .line 359
    .line 360
    goto :goto_a

    .line 361
    :cond_10
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 362
    .line 363
    .line 364
    move-result-object v7

    .line 365
    move v8, v3

    .line 366
    :cond_11
    :goto_9
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 367
    .line 368
    .line 369
    move-result v9

    .line 370
    if-eqz v9, :cond_14

    .line 371
    .line 372
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v9

    .line 376
    check-cast v9, La/d0t;

    .line 377
    .line 378
    iget-wide v9, v9, La/d0t;->L:J

    .line 379
    .line 380
    cmp-long v9, v9, v5

    .line 381
    .line 382
    if-nez v9, :cond_11

    .line 383
    .line 384
    add-int/lit8 v8, v8, 0x1

    .line 385
    .line 386
    if-ltz v8, :cond_12

    .line 387
    .line 388
    goto :goto_9

    .line 389
    :cond_12
    invoke-static {}, La/q3d;->o()V

    .line 390
    .line 391
    .line 392
    throw v2

    .line 393
    :cond_13
    :goto_a
    move v8, v3

    .line 394
    :cond_14
    if-eqz v0, :cond_18

    .line 395
    .line 396
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 397
    .line 398
    .line 399
    move-result v7

    .line 400
    if-eqz v7, :cond_15

    .line 401
    .line 402
    goto :goto_c

    .line 403
    :cond_15
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 404
    .line 405
    .line 406
    move-result-object v7

    .line 407
    move v9, v3

    .line 408
    :cond_16
    :goto_b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 409
    .line 410
    .line 411
    move-result v10

    .line 412
    if-eqz v10, :cond_19

    .line 413
    .line 414
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v10

    .line 418
    check-cast v10, La/d0t;

    .line 419
    .line 420
    iget-wide v10, v10, La/d0t;->L:J

    .line 421
    .line 422
    cmp-long v10, v10, v5

    .line 423
    .line 424
    if-nez v10, :cond_16

    .line 425
    .line 426
    add-int/lit8 v9, v9, 0x1

    .line 427
    .line 428
    if-ltz v9, :cond_17

    .line 429
    .line 430
    goto :goto_b

    .line 431
    :cond_17
    invoke-static {}, La/q3d;->o()V

    .line 432
    .line 433
    .line 434
    throw v2

    .line 435
    :cond_18
    :goto_c
    move v9, v3

    .line 436
    :cond_19
    if-eqz p0, :cond_1d

    .line 437
    .line 438
    iget-object v7, p0, La/rzv;->a:Ljava/util/ArrayList;

    .line 439
    .line 440
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 441
    .line 442
    .line 443
    move-result v10

    .line 444
    if-eqz v10, :cond_1a

    .line 445
    .line 446
    goto :goto_e

    .line 447
    :cond_1a
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 448
    .line 449
    .line 450
    move-result-object v7

    .line 451
    move v10, v3

    .line 452
    :cond_1b
    :goto_d
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 453
    .line 454
    .line 455
    move-result v11

    .line 456
    if-eqz v11, :cond_1e

    .line 457
    .line 458
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v11

    .line 462
    check-cast v11, La/d2w;

    .line 463
    .line 464
    invoke-virtual {v11}, La/d2w;->e()J

    .line 465
    .line 466
    .line 467
    move-result-wide v11

    .line 468
    cmp-long v11, v11, v5

    .line 469
    .line 470
    if-nez v11, :cond_1b

    .line 471
    .line 472
    add-int/lit8 v10, v10, 0x1

    .line 473
    .line 474
    if-ltz v10, :cond_1c

    .line 475
    .line 476
    goto :goto_d

    .line 477
    :cond_1c
    invoke-static {}, La/q3d;->o()V

    .line 478
    .line 479
    .line 480
    throw v2

    .line 481
    :cond_1d
    :goto_e
    move v10, v3

    .line 482
    :cond_1e
    add-int/2addr v8, v9

    .line 483
    add-int/2addr v8, v10

    .line 484
    new-instance v7, Ljava/lang/Long;

    .line 485
    .line 486
    invoke-direct {v7, v5, v6}, Ljava/lang/Long;-><init>(J)V

    .line 487
    .line 488
    .line 489
    new-instance v5, Ljava/lang/Integer;

    .line 490
    .line 491
    invoke-direct {v5, v8}, Ljava/lang/Integer;-><init>(I)V

    .line 492
    .line 493
    .line 494
    new-instance v6, Lkotlin/Pair;

    .line 495
    .line 496
    invoke-direct {v6, v7, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 497
    .line 498
    .line 499
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 500
    .line 501
    .line 502
    goto/16 :goto_8

    .line 503
    .line 504
    :cond_1f
    return-object v4

    .line 505
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/tvu;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/tvu;->n:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, La/tvu;->m:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/util/List;

    .line 11
    .line 12
    check-cast p2, La/w2s0;

    .line 13
    .line 14
    check-cast p3, Ljava/util/List;

    .line 15
    .line 16
    check-cast p4, La/yje;

    .line 17
    .line 18
    new-instance v0, La/tvu;

    .line 19
    .line 20
    check-cast p0, La/gu1;

    .line 21
    .line 22
    check-cast v1, La/wdu;

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    invoke-direct {v0, p0, v1, p4, v2}, La/tvu;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 26
    .line 27
    .line 28
    iput-object p1, v0, La/tvu;->j:Ljava/lang/Object;

    .line 29
    .line 30
    iput-object p2, v0, La/tvu;->k:Ljava/lang/Object;

    .line 31
    .line 32
    iput-object p3, v0, La/tvu;->l:Ljava/lang/Object;

    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    invoke-virtual {v0, p0}, La/tvu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :pswitch_0
    check-cast p1, La/dqk0;

    .line 42
    .line 43
    check-cast p2, La/dqk0;

    .line 44
    .line 45
    check-cast p3, La/dqk0;

    .line 46
    .line 47
    check-cast p4, La/yje;

    .line 48
    .line 49
    new-instance v0, La/tvu;

    .line 50
    .line 51
    check-cast p0, La/lhf0;

    .line 52
    .line 53
    check-cast v1, Ljava/util/ArrayList;

    .line 54
    .line 55
    const/4 v2, 0x0

    .line 56
    invoke-direct {v0, p0, v1, p4, v2}, La/tvu;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 57
    .line 58
    .line 59
    iput-object p1, v0, La/tvu;->j:Ljava/lang/Object;

    .line 60
    .line 61
    iput-object p2, v0, La/tvu;->k:Ljava/lang/Object;

    .line 62
    .line 63
    iput-object p3, v0, La/tvu;->l:Ljava/lang/Object;

    .line 64
    .line 65
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    invoke-virtual {v0, p0}, La/tvu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
