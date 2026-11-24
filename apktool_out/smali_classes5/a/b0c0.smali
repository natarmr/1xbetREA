.class public final synthetic La/b0c0;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/b0c0;->a:B

    invoke-direct/range {p0 .. p6}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/b0c0;->a:B

    .line 4
    .line 5
    sget-object v2, La/pjc0;->a:La/pjc0;

    .line 6
    .line 7
    const-string v3, "coroutineScope"

    .line 8
    .line 9
    const-string v4, "connectionManager"

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x0

    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 18
    .line 19
    move-object v10, v0

    .line 20
    check-cast v10, La/iph0;

    .line 21
    .line 22
    iget-object v0, v10, La/iph0;->G:La/bby;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-ne v0, v6, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object v0, v10, La/iph0;->D:La/p7m0;

    .line 34
    .line 35
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v7, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    invoke-static {v10}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    new-instance v8, La/jjh0;

    .line 48
    .line 49
    const/4 v14, 0x0

    .line 50
    const/16 v15, 0xa

    .line 51
    .line 52
    const/4 v9, 0x1

    .line 53
    const-class v11, La/iph0;

    .line 54
    .line 55
    const-string v12, "onError"

    .line 56
    .line 57
    const-string v13, "onError(Ljava/lang/Throwable;)V"

    .line 58
    .line 59
    invoke-direct/range {v8 .. v15}, La/jjh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 60
    .line 61
    .line 62
    iget-object v1, v10, La/iph0;->s:La/mne;

    .line 63
    .line 64
    iget-object v14, v1, La/mne;->a:La/rwj;

    .line 65
    .line 66
    new-instance v15, La/fph0;

    .line 67
    .line 68
    const/4 v1, 0x4

    .line 69
    invoke-direct {v15, v10, v7, v1}, La/fph0;-><init>(La/iph0;La/yje;B)V

    .line 70
    .line 71
    .line 72
    const/16 v16, 0xa

    .line 73
    .line 74
    const/4 v13, 0x0

    .line 75
    move-object v11, v0

    .line 76
    move-object v12, v8

    .line 77
    invoke-static/range {v11 .. v16}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iput-object v0, v10, La/iph0;->G:La/bby;

    .line 82
    .line 83
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    return-object v0

    .line 86
    :pswitch_0
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, La/iph0;

    .line 89
    .line 90
    invoke-virtual {v0}, La/iph0;->x()V

    .line 91
    .line 92
    .line 93
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    return-object v0

    .line 96
    :pswitch_1
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, La/iph0;

    .line 99
    .line 100
    iget-object v0, v0, La/iph0;->A:La/i1w0;

    .line 101
    .line 102
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    new-instance v2, La/c8d;

    .line 107
    .line 108
    sget-object v3, La/y7d;->a:La/v7d;

    .line 109
    .line 110
    sget-object v4, La/p0w0;->a:La/p0w0;

    .line 111
    .line 112
    invoke-direct {v2, v3, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 113
    .line 114
    .line 115
    invoke-static {v1, v2, v0, v1, v5}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    :goto_1
    move-object v2, v1

    .line 120
    check-cast v2, La/paw;

    .line 121
    .line 122
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    if-eqz v3, :cond_1

    .line 127
    .line 128
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    check-cast v2, La/oe50;

    .line 133
    .line 134
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 135
    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 139
    .line 140
    return-object v0

    .line 141
    :pswitch_2
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v0, La/iph0;

    .line 144
    .line 145
    invoke-virtual {v0}, La/iph0;->x()V

    .line 146
    .line 147
    .line 148
    iget-object v0, v0, La/iph0;->F:La/bby;

    .line 149
    .line 150
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 151
    .line 152
    .line 153
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 154
    .line 155
    return-object v0

    .line 156
    :pswitch_3
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v0, La/on4;

    .line 159
    .line 160
    invoke-virtual {v0}, La/on4;->b()Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    return-object v0

    .line 169
    :pswitch_4
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v0, La/on4;

    .line 172
    .line 173
    invoke-virtual {v0}, La/on4;->b()Z

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    return-object v0

    .line 182
    :pswitch_5
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v0, La/mog0;

    .line 185
    .line 186
    new-instance v1, La/iog0;

    .line 187
    .line 188
    invoke-virtual {v0}, La/mog0;->w()La/jkm;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    invoke-direct {v1, v2}, La/iog0;-><init>(La/jkm;)V

    .line 193
    .line 194
    .line 195
    iget-object v2, v0, La/mog0;->s:La/p7m0;

    .line 196
    .line 197
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2, v7, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0}, La/mog0;->x()V

    .line 204
    .line 205
    .line 206
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 207
    .line 208
    return-object v0

    .line 209
    :pswitch_6
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v0, La/aeg0;

    .line 212
    .line 213
    iget-object v1, v0, La/aeg0;->a:La/sje;

    .line 214
    .line 215
    if-eqz v1, :cond_3

    .line 216
    .line 217
    invoke-static {v1, v7}, La/d5c;->G(La/vne;Ljava/util/concurrent/CancellationException;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0}, La/aeg0;->g()La/mox;

    .line 221
    .line 222
    .line 223
    iget-object v0, v0, La/aeg0;->e:La/udg0;

    .line 224
    .line 225
    if-eqz v0, :cond_2

    .line 226
    .line 227
    iget-object v0, v0, La/udg0;->f:La/t1e;

    .line 228
    .line 229
    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    .line 230
    .line 231
    .line 232
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 233
    .line 234
    return-object v0

    .line 235
    :cond_2
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    throw v7

    .line 239
    :cond_3
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    throw v7

    .line 243
    :pswitch_7
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v0, La/zdg0;

    .line 246
    .line 247
    iget-object v1, v0, La/zdg0;->a:La/sje;

    .line 248
    .line 249
    if-eqz v1, :cond_5

    .line 250
    .line 251
    invoke-static {v1, v7}, La/d5c;->G(La/vne;Ljava/util/concurrent/CancellationException;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0}, La/zdg0;->d()La/lox;

    .line 255
    .line 256
    .line 257
    iget-object v0, v0, La/zdg0;->c:La/tdg0;

    .line 258
    .line 259
    if-eqz v0, :cond_4

    .line 260
    .line 261
    iget-object v0, v0, La/tdg0;->f:La/s1e;

    .line 262
    .line 263
    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    .line 264
    .line 265
    .line 266
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 267
    .line 268
    return-object v0

    .line 269
    :cond_4
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    throw v7

    .line 273
    :cond_5
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    throw v7

    .line 277
    :pswitch_8
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v0, La/aqf0;

    .line 280
    .line 281
    iput-boolean v6, v0, La/aqf0;->A:Z

    .line 282
    .line 283
    iget-object v1, v0, La/aqf0;->F:La/p7m0;

    .line 284
    .line 285
    :cond_6
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    move-object v2, v0

    .line 290
    check-cast v2, La/jpf0;

    .line 291
    .line 292
    const/16 v3, 0xd

    .line 293
    .line 294
    invoke-static {v2, v5, v3}, La/jpf0;->a(La/jpf0;ZI)La/jpf0;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    if-eqz v0, :cond_6

    .line 303
    .line 304
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 305
    .line 306
    return-object v0

    .line 307
    :pswitch_9
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast v0, La/vof0;

    .line 310
    .line 311
    sget-object v1, La/vof0;->O1:[La/iiy;

    .line 312
    .line 313
    invoke-virtual {v0}, La/vof0;->G0()V

    .line 314
    .line 315
    .line 316
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 317
    .line 318
    return-object v0

    .line 319
    :pswitch_a
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast v0, La/aqf0;

    .line 322
    .line 323
    invoke-virtual {v0}, La/aqf0;->C()V

    .line 324
    .line 325
    .line 326
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 327
    .line 328
    return-object v0

    .line 329
    :pswitch_b
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v0, La/ere0;

    .line 332
    .line 333
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    invoke-interface {v0}, La/qgy;->getParameters()Ljava/util/List;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    invoke-static {v0}, La/fre0;->X(La/dre0;)Z

    .line 341
    .line 342
    .line 343
    move-result v2

    .line 344
    if-eqz v2, :cond_8

    .line 345
    .line 346
    invoke-interface {v0}, La/dre0;->x()La/bv9;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    invoke-interface {v2}, La/bv9;->b()Ljava/lang/reflect/Member;

    .line 351
    .line 352
    .line 353
    move-result-object v2

    .line 354
    instance-of v3, v2, Ljava/lang/reflect/Constructor;

    .line 355
    .line 356
    if-eqz v3, :cond_7

    .line 357
    .line 358
    check-cast v2, Ljava/lang/reflect/Constructor;

    .line 359
    .line 360
    goto :goto_2

    .line 361
    :cond_7
    move-object v2, v7

    .line 362
    :goto_2
    if-eqz v2, :cond_8

    .line 363
    .line 364
    invoke-static {v2}, La/acb;->V(Ljava/lang/reflect/Constructor;)Z

    .line 365
    .line 366
    .line 367
    move-result v2

    .line 368
    if-ne v2, v6, :cond_8

    .line 369
    .line 370
    move v2, v6

    .line 371
    goto :goto_3

    .line 372
    :cond_8
    move v2, v5

    .line 373
    :goto_3
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 374
    .line 375
    .line 376
    move-result v3

    .line 377
    invoke-interface {v0}, La/qgy;->isSuspend()Z

    .line 378
    .line 379
    .line 380
    move-result v0

    .line 381
    add-int/2addr v0, v3

    .line 382
    add-int/2addr v0, v2

    .line 383
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 384
    .line 385
    .line 386
    move-result v3

    .line 387
    if-eqz v3, :cond_9

    .line 388
    .line 389
    move v4, v5

    .line 390
    goto :goto_5

    .line 391
    :cond_9
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 392
    .line 393
    .line 394
    move-result-object v3

    .line 395
    move v4, v5

    .line 396
    :cond_a
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 397
    .line 398
    .line 399
    move-result v8

    .line 400
    if-eqz v8, :cond_d

    .line 401
    .line 402
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v8

    .line 406
    check-cast v8, La/hre0;

    .line 407
    .line 408
    invoke-virtual {v8}, La/hre0;->n()La/aiy;

    .line 409
    .line 410
    .line 411
    move-result-object v9

    .line 412
    sget-object v10, La/aiy;->d:La/aiy;

    .line 413
    .line 414
    if-eq v9, v10, :cond_b

    .line 415
    .line 416
    invoke-virtual {v8}, La/hre0;->n()La/aiy;

    .line 417
    .line 418
    .line 419
    move-result-object v8

    .line 420
    sget-object v9, La/aiy;->b:La/aiy;

    .line 421
    .line 422
    if-ne v8, v9, :cond_a

    .line 423
    .line 424
    :cond_b
    add-int/lit8 v4, v4, 0x1

    .line 425
    .line 426
    if-ltz v4, :cond_c

    .line 427
    .line 428
    goto :goto_4

    .line 429
    :cond_c
    invoke-static {}, La/q3d;->o()V

    .line 430
    .line 431
    .line 432
    throw v7

    .line 433
    :cond_d
    :goto_5
    add-int/2addr v4, v2

    .line 434
    add-int/lit8 v4, v4, 0x1f

    .line 435
    .line 436
    div-int/lit8 v4, v4, 0x20

    .line 437
    .line 438
    add-int v2, v0, v4

    .line 439
    .line 440
    add-int/2addr v2, v6

    .line 441
    new-array v2, v2, [Ljava/lang/Object;

    .line 442
    .line 443
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 444
    .line 445
    .line 446
    move-result-object v1

    .line 447
    :cond_e
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 448
    .line 449
    .line 450
    move-result v3

    .line 451
    if-eqz v3, :cond_12

    .line 452
    .line 453
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v3

    .line 457
    check-cast v3, La/hre0;

    .line 458
    .line 459
    invoke-virtual {v3}, La/hre0;->q()Z

    .line 460
    .line 461
    .line 462
    move-result v6

    .line 463
    if-eqz v6, :cond_11

    .line 464
    .line 465
    invoke-virtual {v3}, La/hre0;->p()La/kiy;

    .line 466
    .line 467
    .line 468
    move-result-object v6

    .line 469
    invoke-static {v6}, La/xtt0;->i(La/kiy;)Z

    .line 470
    .line 471
    .line 472
    move-result v6

    .line 473
    if-nez v6, :cond_11

    .line 474
    .line 475
    invoke-virtual {v3}, La/hre0;->j()I

    .line 476
    .line 477
    .line 478
    move-result v6

    .line 479
    invoke-virtual {v3}, La/hre0;->p()La/kiy;

    .line 480
    .line 481
    .line 482
    move-result-object v3

    .line 483
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 484
    .line 485
    .line 486
    instance-of v8, v3, La/v2;

    .line 487
    .line 488
    if-eqz v8, :cond_10

    .line 489
    .line 490
    move-object v8, v3

    .line 491
    check-cast v8, La/v2;

    .line 492
    .line 493
    iget-object v8, v8, La/v2;->a:La/mre0;

    .line 494
    .line 495
    if-eqz v8, :cond_f

    .line 496
    .line 497
    invoke-virtual {v8}, La/mre0;->invoke()Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v8

    .line 501
    check-cast v8, Ljava/lang/reflect/Type;

    .line 502
    .line 503
    goto :goto_7

    .line 504
    :cond_f
    move-object v8, v7

    .line 505
    :goto_7
    if-eqz v8, :cond_10

    .line 506
    .line 507
    goto :goto_8

    .line 508
    :cond_10
    invoke-static {v3, v5}, La/f1t0;->N(La/kiy;Z)Ljava/lang/reflect/Type;

    .line 509
    .line 510
    .line 511
    move-result-object v8

    .line 512
    :goto_8
    invoke-static {v8}, La/xtt0;->f(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v3

    .line 516
    aput-object v3, v2, v6

    .line 517
    .line 518
    goto :goto_6

    .line 519
    :cond_11
    invoke-virtual {v3}, La/hre0;->u()Z

    .line 520
    .line 521
    .line 522
    move-result v6

    .line 523
    if-eqz v6, :cond_e

    .line 524
    .line 525
    invoke-virtual {v3}, La/hre0;->j()I

    .line 526
    .line 527
    .line 528
    move-result v6

    .line 529
    invoke-virtual {v3}, La/hre0;->p()La/kiy;

    .line 530
    .line 531
    .line 532
    move-result-object v3

    .line 533
    invoke-static {v3}, La/fre0;->M(La/kiy;)Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v3

    .line 537
    aput-object v3, v2, v6

    .line 538
    .line 539
    goto :goto_6

    .line 540
    :cond_12
    move v1, v5

    .line 541
    :goto_9
    if-ge v1, v4, :cond_13

    .line 542
    .line 543
    add-int v3, v0, v1

    .line 544
    .line 545
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 546
    .line 547
    .line 548
    move-result-object v6

    .line 549
    aput-object v6, v2, v3

    .line 550
    .line 551
    add-int/lit8 v1, v1, 0x1

    .line 552
    .line 553
    goto :goto_9

    .line 554
    :cond_13
    return-object v2

    .line 555
    :pswitch_c
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 556
    .line 557
    check-cast v0, La/sld0;

    .line 558
    .line 559
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 560
    .line 561
    .line 562
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 563
    .line 564
    .line 565
    move-result-object v8

    .line 566
    iget-object v1, v0, La/sld0;->h:La/mne;

    .line 567
    .line 568
    iget-object v11, v1, La/mne;->a:La/rwj;

    .line 569
    .line 570
    new-instance v9, La/ljc0;

    .line 571
    .line 572
    const/16 v1, 0x1c

    .line 573
    .line 574
    invoke-direct {v9, v1}, La/ljc0;-><init>(B)V

    .line 575
    .line 576
    .line 577
    new-instance v12, La/rld0;

    .line 578
    .line 579
    invoke-direct {v12, v0, v7, v6}, La/rld0;-><init>(La/sld0;La/yje;B)V

    .line 580
    .line 581
    .line 582
    const/16 v13, 0xa

    .line 583
    .line 584
    const/4 v10, 0x0

    .line 585
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 586
    .line 587
    .line 588
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 589
    .line 590
    return-object v0

    .line 591
    :pswitch_d
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 592
    .line 593
    check-cast v0, La/doc0;

    .line 594
    .line 595
    iget-object v0, v0, La/doc0;->c:La/tac0;

    .line 596
    .line 597
    invoke-virtual {v0}, La/tac0;->B()V

    .line 598
    .line 599
    .line 600
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 601
    .line 602
    return-object v0

    .line 603
    :pswitch_e
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 604
    .line 605
    check-cast v0, La/hyc0;

    .line 606
    .line 607
    iget-object v0, v0, La/hyc0;->c:La/tac0;

    .line 608
    .line 609
    invoke-virtual {v0}, La/tac0;->y()V

    .line 610
    .line 611
    .line 612
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 613
    .line 614
    return-object v0

    .line 615
    :pswitch_f
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 616
    .line 617
    check-cast v0, La/hyc0;

    .line 618
    .line 619
    iget-object v0, v0, La/hyc0;->c:La/tac0;

    .line 620
    .line 621
    invoke-virtual {v0}, La/tac0;->B()V

    .line 622
    .line 623
    .line 624
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 625
    .line 626
    return-object v0

    .line 627
    :pswitch_10
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 628
    .line 629
    check-cast v0, La/hyc0;

    .line 630
    .line 631
    invoke-virtual {v0}, La/hyc0;->B()V

    .line 632
    .line 633
    .line 634
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 635
    .line 636
    return-object v0

    .line 637
    :pswitch_11
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 638
    .line 639
    check-cast v0, La/gkc0;

    .line 640
    .line 641
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 642
    .line 643
    .line 644
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 645
    .line 646
    .line 647
    move-result-object v8

    .line 648
    iget-object v1, v0, La/gkc0;->i:La/mne;

    .line 649
    .line 650
    iget-object v12, v1, La/mne;->b:La/dvj;

    .line 651
    .line 652
    new-instance v11, La/ekc0;

    .line 653
    .line 654
    const/4 v1, 0x2

    .line 655
    invoke-direct {v11, v0, v7, v1}, La/ekc0;-><init>(La/gkc0;La/yje;B)V

    .line 656
    .line 657
    .line 658
    new-instance v13, La/ppb0;

    .line 659
    .line 660
    const/16 v1, 0x11

    .line 661
    .line 662
    invoke-direct {v13, v0, v1}, La/ppb0;-><init>(Ljava/lang/Object;B)V

    .line 663
    .line 664
    .line 665
    new-instance v14, La/ssa0;

    .line 666
    .line 667
    const/16 v1, 0x19

    .line 668
    .line 669
    invoke-direct {v14, v0, v1}, La/ssa0;-><init>(Ljava/lang/Object;B)V

    .line 670
    .line 671
    .line 672
    const/16 v15, 0x14

    .line 673
    .line 674
    const-string v9, "PromoGamesHolderViewModel.onTechnicalDialogGameClick"

    .line 675
    .line 676
    const/4 v10, 0x1

    .line 677
    invoke-static/range {v8 .. v15}, La/sac;->h0(La/bvc;Ljava/lang/String;ILkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;I)La/bby;

    .line 678
    .line 679
    .line 680
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 681
    .line 682
    return-object v0

    .line 683
    :pswitch_12
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 684
    .line 685
    check-cast v0, La/gkc0;

    .line 686
    .line 687
    iget-object v1, v0, La/gkc0;->p:La/p7m0;

    .line 688
    .line 689
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 690
    .line 691
    .line 692
    invoke-virtual {v1, v7, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 693
    .line 694
    .line 695
    invoke-virtual {v0}, La/gkc0;->w()V

    .line 696
    .line 697
    .line 698
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 699
    .line 700
    return-object v0

    .line 701
    :pswitch_13
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 702
    .line 703
    check-cast v0, La/gkc0;

    .line 704
    .line 705
    iget-object v1, v0, La/gkc0;->p:La/p7m0;

    .line 706
    .line 707
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 708
    .line 709
    .line 710
    invoke-virtual {v1, v7, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 711
    .line 712
    .line 713
    iget-object v0, v0, La/gkc0;->n:La/p7m0;

    .line 714
    .line 715
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 716
    .line 717
    .line 718
    sget-object v1, La/xjc0;->a:La/xjc0;

    .line 719
    .line 720
    invoke-virtual {v0, v7, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 721
    .line 722
    .line 723
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 724
    .line 725
    return-object v0

    .line 726
    :pswitch_14
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 727
    .line 728
    check-cast v0, La/gkc0;

    .line 729
    .line 730
    invoke-virtual {v0}, La/gkc0;->w()V

    .line 731
    .line 732
    .line 733
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 734
    .line 735
    return-object v0

    .line 736
    :pswitch_15
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 737
    .line 738
    check-cast v0, La/hjc0;

    .line 739
    .line 740
    iget-object v1, v0, La/hjc0;->j:La/p7m0;

    .line 741
    .line 742
    :cond_14
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    move-result-object v0

    .line 746
    move-object v7, v0

    .line 747
    check-cast v7, La/zic0;

    .line 748
    .line 749
    iget v2, v7, La/zic0;->b:I

    .line 750
    .line 751
    if-lez v2, :cond_15

    .line 752
    .line 753
    iget-boolean v2, v7, La/zic0;->d:Z

    .line 754
    .line 755
    if-nez v2, :cond_15

    .line 756
    .line 757
    move v8, v6

    .line 758
    goto :goto_a

    .line 759
    :cond_15
    move v8, v5

    .line 760
    :goto_a
    const/4 v11, 0x0

    .line 761
    const/16 v12, 0xe

    .line 762
    .line 763
    const/4 v9, 0x0

    .line 764
    const/4 v10, 0x0

    .line 765
    invoke-static/range {v7 .. v12}, La/zic0;->a(La/zic0;ZIZZI)La/zic0;

    .line 766
    .line 767
    .line 768
    move-result-object v2

    .line 769
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 770
    .line 771
    .line 772
    move-result v0

    .line 773
    if-eqz v0, :cond_14

    .line 774
    .line 775
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 776
    .line 777
    return-object v0

    .line 778
    :pswitch_16
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 779
    .line 780
    check-cast v0, La/qyc0;

    .line 781
    .line 782
    iget-object v0, v0, La/qyc0;->c:La/tac0;

    .line 783
    .line 784
    invoke-virtual {v0}, La/tac0;->y()V

    .line 785
    .line 786
    .line 787
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 788
    .line 789
    return-object v0

    .line 790
    :pswitch_17
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 791
    .line 792
    check-cast v0, La/qyc0;

    .line 793
    .line 794
    iget-object v0, v0, La/qyc0;->c:La/tac0;

    .line 795
    .line 796
    invoke-virtual {v0}, La/tac0;->B()V

    .line 797
    .line 798
    .line 799
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 800
    .line 801
    return-object v0

    .line 802
    :pswitch_18
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 803
    .line 804
    check-cast v0, La/hyc0;

    .line 805
    .line 806
    iget-object v0, v0, La/hyc0;->c:La/tac0;

    .line 807
    .line 808
    invoke-virtual {v0}, La/tac0;->y()V

    .line 809
    .line 810
    .line 811
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 812
    .line 813
    return-object v0

    .line 814
    :pswitch_19
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 815
    .line 816
    check-cast v0, La/hyc0;

    .line 817
    .line 818
    iget-object v0, v0, La/hyc0;->c:La/tac0;

    .line 819
    .line 820
    invoke-virtual {v0}, La/tac0;->B()V

    .line 821
    .line 822
    .line 823
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 824
    .line 825
    return-object v0

    .line 826
    :pswitch_1a
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 827
    .line 828
    check-cast v0, La/hyc0;

    .line 829
    .line 830
    invoke-virtual {v0}, La/hyc0;->B()V

    .line 831
    .line 832
    .line 833
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 834
    .line 835
    return-object v0

    .line 836
    :pswitch_1b
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 837
    .line 838
    check-cast v0, Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 839
    .line 840
    invoke-virtual {v0}, Lorg/xplatform/personal/impl/presentation/edit/n;->C()V

    .line 841
    .line 842
    .line 843
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 844
    .line 845
    return-object v0

    .line 846
    :pswitch_1c
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 847
    .line 848
    check-cast v0, Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 849
    .line 850
    invoke-virtual {v0}, Lorg/xplatform/personal/impl/presentation/edit/n;->C()V

    .line 851
    .line 852
    .line 853
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 854
    .line 855
    return-object v0

    .line 856
    nop

    .line 857
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
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
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
