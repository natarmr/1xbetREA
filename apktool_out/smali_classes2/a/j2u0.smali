.class public final La/j2u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/bv9;


# instance fields
.field public final a:La/bv9;

.field public final b:Z

.field public final c:La/glt0;


# direct methods
.method public constructor <init>(La/bv9;La/dre0;Ljava/util/List;Z)V
    .locals 10

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/j2u0;->a:La/bv9;

    .line 8
    .line 9
    iput-boolean p4, p0, La/j2u0;->b:Z

    .line 10
    .line 11
    invoke-interface {p2}, La/qgy;->getReturnType()La/kiy;

    .line 12
    .line 13
    .line 14
    move-result-object p4

    .line 15
    instance-of v0, p2, La/gre0;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    const/4 v2, 0x1

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    move-object v3, p2

    .line 22
    check-cast v3, La/gre0;

    .line 23
    .line 24
    invoke-interface {v3}, La/jhy;->isSuspend()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    invoke-static {p4}, La/xtt0;->s(La/kiy;)La/kiy;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    invoke-static {v3}, La/gnm0;->o(La/kiy;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-ne v3, v2, :cond_1

    .line 41
    .line 42
    :cond_0
    move-object v3, v1

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-static {p4}, La/gnm0;->v(La/kiy;)Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object p4

    .line 48
    if-eqz p4, :cond_0

    .line 49
    .line 50
    :try_start_0
    const-string v3, "box-impl"

    .line 51
    .line 52
    invoke-static {p4, p2}, La/gnm0;->l(Ljava/lang/Class;La/dre0;)Ljava/lang/reflect/Method;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-virtual {p4, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :catch_0
    const-string p0, "No box method found in inline class: "

    .line 73
    .line 74
    const-string p1, " (calling "

    .line 75
    .line 76
    invoke-static {p0, p4, p1, p2}, La/c99;->u(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    throw v1

    .line 80
    :goto_0
    instance-of p4, p2, La/ciy;

    .line 81
    .line 82
    const/4 v4, 0x0

    .line 83
    if-eqz p4, :cond_2

    .line 84
    .line 85
    move-object p4, p2

    .line 86
    check-cast p4, La/ciy;

    .line 87
    .line 88
    invoke-interface {p4}, La/biy;->c()La/iiy;

    .line 89
    .line 90
    .line 91
    move-result-object p4

    .line 92
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    check-cast p4, La/ire0;

    .line 96
    .line 97
    invoke-static {p4}, La/gnm0;->p(La/ire0;)Z

    .line 98
    .line 99
    .line 100
    move-result p4

    .line 101
    if-eqz p4, :cond_2

    .line 102
    .line 103
    new-instance p1, La/glt0;

    .line 104
    .line 105
    sget-object p2, Lkotlin/ranges/IntRange;->e:La/lkx;

    .line 106
    .line 107
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    sget-object p2, Lkotlin/ranges/IntRange;->f:Lkotlin/ranges/IntRange;

    .line 111
    .line 112
    new-array p3, v4, [Ljava/lang/reflect/Method;

    .line 113
    .line 114
    invoke-direct {p1, p2, p3, v3}, La/glt0;-><init>(Lkotlin/ranges/IntRange;[Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 115
    .line 116
    .line 117
    goto/16 :goto_12

    .line 118
    .line 119
    :cond_2
    instance-of p4, p1, La/qv9;

    .line 120
    .line 121
    const/4 v5, -0x1

    .line 122
    if-eqz p4, :cond_3

    .line 123
    .line 124
    move-object p4, p1

    .line 125
    check-cast p4, La/qv9;

    .line 126
    .line 127
    iget-boolean p4, p4, La/qv9;->f:Z

    .line 128
    .line 129
    if-nez p4, :cond_3

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_3
    invoke-static {p2}, La/fre0;->X(La/dre0;)Z

    .line 133
    .line 134
    .line 135
    move-result p4

    .line 136
    if-eqz p4, :cond_5

    .line 137
    .line 138
    instance-of p1, p1, La/oq8;

    .line 139
    .line 140
    if-eqz p1, :cond_4

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_4
    :goto_1
    move v5, v4

    .line 144
    goto :goto_4

    .line 145
    :cond_5
    invoke-interface {p2}, La/qgy;->getParameters()Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    if-eqz p1, :cond_6

    .line 150
    .line 151
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 152
    .line 153
    .line 154
    move-result p4

    .line 155
    if-eqz p4, :cond_6

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    :cond_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result p4

    .line 166
    if-eqz p4, :cond_4

    .line 167
    .line 168
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p4

    .line 172
    check-cast p4, La/hre0;

    .line 173
    .line 174
    invoke-virtual {p4}, La/hre0;->n()La/aiy;

    .line 175
    .line 176
    .line 177
    move-result-object p4

    .line 178
    sget-object v5, La/aiy;->a:La/aiy;

    .line 179
    .line 180
    if-ne p4, v5, :cond_7

    .line 181
    .line 182
    invoke-interface {p2}, La/dre0;->K()La/ihy;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    instance-of p4, p1, La/xgy;

    .line 187
    .line 188
    if-eqz p4, :cond_8

    .line 189
    .line 190
    check-cast p1, La/xgy;

    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_8
    move-object p1, v1

    .line 194
    :goto_2
    if-eqz p1, :cond_a

    .line 195
    .line 196
    invoke-virtual {p1}, La/xgy;->I()Z

    .line 197
    .line 198
    .line 199
    move-result p4

    .line 200
    if-eqz p4, :cond_a

    .line 201
    .line 202
    invoke-virtual {p1}, La/xgy;->X()La/qpy;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    if-eqz p1, :cond_9

    .line 207
    .line 208
    iget-object p1, p1, La/qpy;->m:Ljava/lang/String;

    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_9
    move-object p1, v1

    .line 212
    :goto_3
    if-eqz p1, :cond_a

    .line 213
    .line 214
    goto :goto_1

    .line 215
    :cond_a
    move v5, v2

    .line 216
    :goto_4
    iget-object p1, p0, La/j2u0;->a:La/bv9;

    .line 217
    .line 218
    invoke-interface {p1}, La/bv9;->b()Ljava/lang/reflect/Member;

    .line 219
    .line 220
    .line 221
    new-instance p1, Ljava/util/ArrayList;

    .line 222
    .line 223
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 224
    .line 225
    .line 226
    invoke-interface {p2}, La/dre0;->K()La/ihy;

    .line 227
    .line 228
    .line 229
    move-result-object p4

    .line 230
    invoke-static {p2}, La/fre0;->X(La/dre0;)Z

    .line 231
    .line 232
    .line 233
    move-result v6

    .line 234
    if-nez v6, :cond_b

    .line 235
    .line 236
    instance-of v6, p4, La/sgy;

    .line 237
    .line 238
    if-eqz v6, :cond_b

    .line 239
    .line 240
    move-object v6, p4

    .line 241
    check-cast v6, La/sgy;

    .line 242
    .line 243
    invoke-interface {v6}, La/sgy;->I()Z

    .line 244
    .line 245
    .line 246
    move-result v7

    .line 247
    if-eqz v7, :cond_b

    .line 248
    .line 249
    invoke-static {v6}, La/n2x;->v(La/sgy;)La/v2;

    .line 250
    .line 251
    .line 252
    move-result-object v6

    .line 253
    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    :cond_b
    invoke-static {p2}, La/fre0;->X(La/dre0;)Z

    .line 257
    .line 258
    .line 259
    move-result v6

    .line 260
    if-eqz v6, :cond_d

    .line 261
    .line 262
    instance-of v6, p4, La/sgy;

    .line 263
    .line 264
    if-eqz v6, :cond_c

    .line 265
    .line 266
    check-cast p4, La/sgy;

    .line 267
    .line 268
    goto :goto_5

    .line 269
    :cond_c
    move-object p4, v1

    .line 270
    :goto_5
    if-eqz p4, :cond_d

    .line 271
    .line 272
    invoke-interface {p4}, La/sgy;->i()Z

    .line 273
    .line 274
    .line 275
    move-result p4

    .line 276
    if-ne p4, v2, :cond_d

    .line 277
    .line 278
    move p4, v2

    .line 279
    goto :goto_6

    .line 280
    :cond_d
    move p4, v4

    .line 281
    :goto_6
    invoke-interface {p2}, La/dre0;->a()Ljava/util/List;

    .line 282
    .line 283
    .line 284
    move-result-object v6

    .line 285
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 286
    .line 287
    .line 288
    move-result-object v6

    .line 289
    :cond_e
    :goto_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 290
    .line 291
    .line 292
    move-result v7

    .line 293
    if-eqz v7, :cond_10

    .line 294
    .line 295
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v7

    .line 299
    check-cast v7, La/hre0;

    .line 300
    .line 301
    invoke-virtual {v7}, La/hre0;->n()La/aiy;

    .line 302
    .line 303
    .line 304
    move-result-object v8

    .line 305
    sget-object v9, La/aiy;->a:La/aiy;

    .line 306
    .line 307
    if-ne v8, v9, :cond_f

    .line 308
    .line 309
    if-eqz p4, :cond_e

    .line 310
    .line 311
    :cond_f
    invoke-virtual {v7}, La/hre0;->p()La/kiy;

    .line 312
    .line 313
    .line 314
    move-result-object v7

    .line 315
    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    goto :goto_7

    .line 319
    :cond_10
    invoke-interface {p2}, La/dre0;->a()Ljava/util/List;

    .line 320
    .line 321
    .line 322
    move-result-object p4

    .line 323
    if-eqz p4, :cond_11

    .line 324
    .line 325
    invoke-interface {p4}, Ljava/util/Collection;->isEmpty()Z

    .line 326
    .line 327
    .line 328
    move-result v6

    .line 329
    if-eqz v6, :cond_11

    .line 330
    .line 331
    goto :goto_8

    .line 332
    :cond_11
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 333
    .line 334
    .line 335
    move-result-object p4

    .line 336
    :cond_12
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 337
    .line 338
    .line 339
    move-result v6

    .line 340
    if-eqz v6, :cond_13

    .line 341
    .line 342
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v6

    .line 346
    check-cast v6, La/hre0;

    .line 347
    .line 348
    invoke-virtual {v6}, La/hre0;->n()La/aiy;

    .line 349
    .line 350
    .line 351
    move-result-object v6

    .line 352
    sget-object v7, La/aiy;->c:La/aiy;

    .line 353
    .line 354
    if-ne v6, v7, :cond_12

    .line 355
    .line 356
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 357
    .line 358
    .line 359
    move-result p4

    .line 360
    sub-int/2addr p4, v2

    .line 361
    goto :goto_9

    .line 362
    :cond_13
    :goto_8
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 363
    .line 364
    .line 365
    move-result p4

    .line 366
    :goto_9
    iget-object v6, p0, La/j2u0;->a:La/bv9;

    .line 367
    .line 368
    invoke-interface {v6}, La/bv9;->a()Ljava/util/List;

    .line 369
    .line 370
    .line 371
    move-result-object v6

    .line 372
    if-eqz v6, :cond_14

    .line 373
    .line 374
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 375
    .line 376
    .line 377
    move-result v7

    .line 378
    if-eqz v7, :cond_14

    .line 379
    .line 380
    move v7, v4

    .line 381
    goto :goto_b

    .line 382
    :cond_14
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 383
    .line 384
    .line 385
    move-result-object v6

    .line 386
    move v7, v4

    .line 387
    :cond_15
    :goto_a
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 388
    .line 389
    .line 390
    move-result v8

    .line 391
    if-eqz v8, :cond_17

    .line 392
    .line 393
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v8

    .line 397
    check-cast v8, Ljava/lang/reflect/Type;

    .line 398
    .line 399
    instance-of v9, v8, Ljava/lang/Class;

    .line 400
    .line 401
    if-eqz v9, :cond_15

    .line 402
    .line 403
    check-cast v8, Ljava/lang/Class;

    .line 404
    .line 405
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v8

    .line 409
    sget-object v9, La/fgy;->a:La/swq;

    .line 410
    .line 411
    iget-object v9, v9, La/swq;->a:La/twq;

    .line 412
    .line 413
    iget-object v9, v9, La/twq;->a:Ljava/lang/String;

    .line 414
    .line 415
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    move-result v8

    .line 419
    if-eqz v8, :cond_15

    .line 420
    .line 421
    add-int/lit8 v7, v7, 0x1

    .line 422
    .line 423
    if-ltz v7, :cond_16

    .line 424
    .line 425
    goto :goto_a

    .line 426
    :cond_16
    invoke-static {}, La/q3d;->o()V

    .line 427
    .line 428
    .line 429
    throw v1

    .line 430
    :cond_17
    :goto_b
    iget-boolean v6, p0, La/j2u0;->b:Z

    .line 431
    .line 432
    if-eqz v6, :cond_18

    .line 433
    .line 434
    add-int/2addr p4, v7

    .line 435
    add-int/lit8 p4, p4, 0x1f

    .line 436
    .line 437
    div-int/lit8 p4, p4, 0x20

    .line 438
    .line 439
    add-int/2addr p4, v2

    .line 440
    goto :goto_c

    .line 441
    :cond_18
    move p4, v4

    .line 442
    :goto_c
    if-eqz v0, :cond_19

    .line 443
    .line 444
    move-object v0, p2

    .line 445
    check-cast v0, La/gre0;

    .line 446
    .line 447
    invoke-interface {v0}, La/jhy;->isSuspend()Z

    .line 448
    .line 449
    .line 450
    move-result v0

    .line 451
    if-eqz v0, :cond_19

    .line 452
    .line 453
    move v0, v2

    .line 454
    goto :goto_d

    .line 455
    :cond_19
    move v0, v4

    .line 456
    :goto_d
    add-int/2addr p4, v0

    .line 457
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 458
    .line 459
    .line 460
    move-result v0

    .line 461
    add-int/2addr v0, v5

    .line 462
    add-int/2addr v0, p4

    .line 463
    add-int/2addr v0, v7

    .line 464
    iget-boolean p4, p0, La/j2u0;->b:Z

    .line 465
    .line 466
    invoke-virtual {p0}, La/j2u0;->a()Ljava/util/List;

    .line 467
    .line 468
    .line 469
    move-result-object v6

    .line 470
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 471
    .line 472
    .line 473
    move-result v6

    .line 474
    if-ne v6, v0, :cond_1f

    .line 475
    .line 476
    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    .line 477
    .line 478
    .line 479
    move-result p4

    .line 480
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 481
    .line 482
    .line 483
    move-result v6

    .line 484
    add-int/2addr v6, v5

    .line 485
    invoke-static {p4, v6}, La/l1e0;->o(II)Lkotlin/ranges/IntRange;

    .line 486
    .line 487
    .line 488
    move-result-object p4

    .line 489
    new-array v6, v0, [Ljava/lang/reflect/Method;

    .line 490
    .line 491
    move v7, v4

    .line 492
    :goto_e
    if-ge v7, v0, :cond_1b

    .line 493
    .line 494
    iget v8, p4, Lkotlin/ranges/a;->a:I

    .line 495
    .line 496
    iget v9, p4, Lkotlin/ranges/a;->b:I

    .line 497
    .line 498
    if-gt v7, v9, :cond_1a

    .line 499
    .line 500
    if-gt v8, v7, :cond_1a

    .line 501
    .line 502
    sub-int v8, v7, v5

    .line 503
    .line 504
    invoke-virtual {p1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v8

    .line 508
    check-cast v8, La/kiy;

    .line 509
    .line 510
    invoke-static {v8}, La/gnm0;->v(La/kiy;)Ljava/lang/Class;

    .line 511
    .line 512
    .line 513
    move-result-object v8

    .line 514
    if-eqz v8, :cond_1a

    .line 515
    .line 516
    invoke-static {v8, p2}, La/gnm0;->l(Ljava/lang/Class;La/dre0;)Ljava/lang/reflect/Method;

    .line 517
    .line 518
    .line 519
    move-result-object v8

    .line 520
    goto :goto_f

    .line 521
    :cond_1a
    move-object v8, v1

    .line 522
    :goto_f
    aput-object v8, v6, v7

    .line 523
    .line 524
    add-int/lit8 v7, v7, 0x1

    .line 525
    .line 526
    goto :goto_e

    .line 527
    :cond_1b
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 528
    .line 529
    .line 530
    move-result-object p1

    .line 531
    :goto_10
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 532
    .line 533
    .line 534
    move-result p3

    .line 535
    if-eqz p3, :cond_1c

    .line 536
    .line 537
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object p3

    .line 541
    check-cast p3, Ljava/lang/Number;

    .line 542
    .line 543
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 544
    .line 545
    .line 546
    move-result p3

    .line 547
    aput-object v1, v6, p3

    .line 548
    .line 549
    goto :goto_10

    .line 550
    :cond_1c
    invoke-interface {p2}, La/dre0;->K()La/ihy;

    .line 551
    .line 552
    .line 553
    move-result-object p1

    .line 554
    invoke-static {p2}, La/fre0;->X(La/dre0;)Z

    .line 555
    .line 556
    .line 557
    move-result p2

    .line 558
    if-nez p2, :cond_1e

    .line 559
    .line 560
    instance-of p2, p1, La/sgy;

    .line 561
    .line 562
    if-eqz p2, :cond_1e

    .line 563
    .line 564
    check-cast p1, La/sgy;

    .line 565
    .line 566
    invoke-interface {p1}, La/sgy;->I()Z

    .line 567
    .line 568
    .line 569
    move-result p1

    .line 570
    if-eqz p1, :cond_1e

    .line 571
    .line 572
    iget-object p1, p0, La/j2u0;->a:La/bv9;

    .line 573
    .line 574
    invoke-interface {p1}, La/bv9;->b()Ljava/lang/reflect/Member;

    .line 575
    .line 576
    .line 577
    move-result-object p1

    .line 578
    if-eqz p1, :cond_1e

    .line 579
    .line 580
    invoke-interface {p1}, Ljava/lang/reflect/Member;->getDeclaringClass()Ljava/lang/Class;

    .line 581
    .line 582
    .line 583
    move-result-object p1

    .line 584
    if-nez p1, :cond_1d

    .line 585
    .line 586
    move p1, v4

    .line 587
    goto :goto_11

    .line 588
    :cond_1d
    sget-object p2, La/sre0;->a:La/tre0;

    .line 589
    .line 590
    invoke-virtual {p2, p1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 591
    .line 592
    .line 593
    move-result-object p1

    .line 594
    invoke-interface {p1}, La/sgy;->I()Z

    .line 595
    .line 596
    .line 597
    move-result p1

    .line 598
    xor-int/2addr p1, v2

    .line 599
    :goto_11
    if-ne p1, v2, :cond_1e

    .line 600
    .line 601
    aput-object v1, v6, v4

    .line 602
    .line 603
    :cond_1e
    new-instance p1, La/glt0;

    .line 604
    .line 605
    invoke-direct {p1, p4, v6, v3}, La/glt0;-><init>(Lkotlin/ranges/IntRange;[Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 606
    .line 607
    .line 608
    :goto_12
    iput-object p1, p0, La/j2u0;->c:La/glt0;

    .line 609
    .line 610
    return-void

    .line 611
    :cond_1f
    new-instance p1, La/poe;

    .line 612
    .line 613
    new-instance p3, Ljava/lang/StringBuilder;

    .line 614
    .line 615
    const-string v1, "Inconsistent number of parameters in the descriptor and Java reflection object: "

    .line 616
    .line 617
    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 618
    .line 619
    .line 620
    iget-object v1, p0, La/j2u0;->a:La/bv9;

    .line 621
    .line 622
    invoke-interface {v1}, La/bv9;->a()Ljava/util/List;

    .line 623
    .line 624
    .line 625
    move-result-object v1

    .line 626
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 627
    .line 628
    .line 629
    move-result v1

    .line 630
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 631
    .line 632
    .line 633
    const-string v1, " != "

    .line 634
    .line 635
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 636
    .line 637
    .line 638
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 639
    .line 640
    .line 641
    const-string v0, "\nCalling: "

    .line 642
    .line 643
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 644
    .line 645
    .line 646
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 647
    .line 648
    .line 649
    iget-object p0, p0, La/j2u0;->a:La/bv9;

    .line 650
    .line 651
    invoke-interface {p0}, La/bv9;->a()Ljava/util/List;

    .line 652
    .line 653
    .line 654
    move-result-object p0

    .line 655
    const-string p2, "\nParameter types: "

    .line 656
    .line 657
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 658
    .line 659
    .line 660
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 661
    .line 662
    .line 663
    const-string p0, ")\nDefault: "

    .line 664
    .line 665
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 666
    .line 667
    .line 668
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 669
    .line 670
    .line 671
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 672
    .line 673
    .line 674
    move-result-object p0

    .line 675
    invoke-direct {p1, p0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 676
    .line 677
    .line 678
    throw p1
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/j2u0;->a:La/bv9;

    .line 2
    .line 3
    invoke-interface {p0}, La/bv9;->a()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final b()Ljava/lang/reflect/Member;
    .locals 0

    .line 1
    iget-object p0, p0, La/j2u0;->a:La/bv9;

    .line 2
    .line 3
    invoke-interface {p0}, La/bv9;->b()Ljava/lang/reflect/Member;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final c()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/j2u0;->a:La/bv9;

    .line 2
    .line 3
    instance-of p0, p0, La/ov9;

    .line 4
    .line 5
    return p0
.end method

.method public final call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/j2u0;->c:La/glt0;

    .line 5
    .line 6
    iget-object v1, v0, La/glt0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lkotlin/ranges/IntRange;

    .line 9
    .line 10
    iget-object v2, v0, La/glt0;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, [Ljava/lang/reflect/Method;

    .line 13
    .line 14
    iget-object v0, v0, La/glt0;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ljava/lang/reflect/Method;

    .line 17
    .line 18
    array-length v3, p1

    .line 19
    new-array v4, v3, [Ljava/lang/Object;

    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    :goto_0
    const/4 v6, 0x0

    .line 23
    if-ge v5, v3, :cond_3

    .line 24
    .line 25
    aget-object v7, p1, v5

    .line 26
    .line 27
    iget v8, v1, Lkotlin/ranges/a;->a:I

    .line 28
    .line 29
    iget v9, v1, Lkotlin/ranges/a;->b:I

    .line 30
    .line 31
    if-gt v5, v9, :cond_2

    .line 32
    .line 33
    if-gt v8, v5, :cond_2

    .line 34
    .line 35
    aget-object v8, v2, v5

    .line 36
    .line 37
    if-nez v8, :cond_0

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    if-eqz v7, :cond_1

    .line 41
    .line 42
    invoke-virtual {v8, v7, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-static {v6}, La/xtt0;->f(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    :cond_2
    :goto_1
    aput-object v7, v4, v5

    .line 59
    .line 60
    add-int/lit8 v5, v5, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    iget-object p0, p0, La/j2u0;->a:La/bv9;

    .line 64
    .line 65
    invoke-interface {p0, v4}, La/bv9;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    sget-object p1, La/wne;->a:La/wne;

    .line 70
    .line 71
    if-ne p0, p1, :cond_4

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    if-eqz v0, :cond_6

    .line 75
    .line 76
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {v0, v6, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-nez p1, :cond_5

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_5
    return-object p1

    .line 88
    :cond_6
    :goto_2
    return-object p0
.end method

.method public final getReturnType()Ljava/lang/reflect/Type;
    .locals 0

    .line 1
    iget-object p0, p0, La/j2u0;->a:La/bv9;

    .line 2
    .line 3
    invoke-interface {p0}, La/bv9;->getReturnType()Ljava/lang/reflect/Type;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
