.class public final synthetic La/ezv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/izv;


# direct methods
.method public synthetic constructor <init>(La/izv;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ezv;->a:B

    iput-object p1, p0, La/ezv;->b:La/izv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ezv;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/ezv;->b:La/izv;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p1

    .line 12
    .line 13
    check-cast v1, Landroid/view/View;

    .line 14
    .line 15
    sget-object v2, La/izv;->d2:La/rqt;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, La/izv;->M0()La/jzv;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v0, v0, La/jzv;->e:La/q5w;

    .line 25
    .line 26
    iget-object v1, v0, La/q5w;->A:La/nhf0;

    .line 27
    .line 28
    invoke-virtual {v0}, La/q5w;->v()La/n3w;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v2}, La/xkb;->N(La/n3w;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v0}, La/q5w;->v()La/n3w;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-static {v3}, La/xkb;->f0(La/n3w;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 48
    .line 49
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-lez v5, :cond_0

    .line 57
    .line 58
    sget-object v5, La/a1w;->d:La/a1w;

    .line 59
    .line 60
    invoke-virtual {v5}, La/a1w;->a()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-interface {v4, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-lez v5, :cond_1

    .line 72
    .line 73
    sget-object v5, La/a1w;->e:La/a1w;

    .line 74
    .line 75
    invoke-virtual {v5}, La/a1w;->a()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    :cond_1
    sget-object v5, La/a1w;->k:La/a1w;

    .line 83
    .line 84
    iget-object v6, v1, La/nhf0;->c:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v6, La/b4j;

    .line 87
    .line 88
    sget-object v7, La/r6w;->g:La/r6w;

    .line 89
    .line 90
    invoke-virtual {v6, v5, v7, v4}, La/b4j;->g(La/a1w;La/r6w;Ljava/util/Map;)V

    .line 91
    .line 92
    .line 93
    iget-object v1, v1, La/nhf0;->a:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v1, La/au0;

    .line 96
    .line 97
    invoke-virtual {v7}, La/r6w;->a()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-virtual {v1, v4, v2, v3}, La/au0;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    iget-object v1, v0, La/q5w;->D:La/ol60;

    .line 105
    .line 106
    new-instance v2, La/h5w;

    .line 107
    .line 108
    invoke-virtual {v0}, La/q5w;->v()La/n3w;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-direct {v2, v0}, La/h5w;-><init>(La/n3w;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v2}, La/ol60;->f(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    return-object v0

    .line 121
    :pswitch_0
    move-object/from16 v1, p1

    .line 122
    .line 123
    check-cast v1, Landroid/view/View;

    .line 124
    .line 125
    sget-object v3, La/izv;->d2:La/rqt;

    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0}, La/izv;->M0()La/jzv;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    iget-object v0, v0, La/jzv;->e:La/q5w;

    .line 135
    .line 136
    iget-object v1, v0, La/q5w;->j:La/o470;

    .line 137
    .line 138
    invoke-virtual {v0}, La/q5w;->v()La/n3w;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-static {v3}, La/piz;->X(La/n3w;)La/uob0;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    invoke-virtual {v1, v3}, La/o470;->g(La/uob0;)V

    .line 147
    .line 148
    .line 149
    iget-object v1, v0, La/q5w;->v:La/i1w0;

    .line 150
    .line 151
    new-instance v3, La/k0w0;

    .line 152
    .line 153
    invoke-direct {v3, v1}, La/k0w0;-><init>(La/i1w0;)V

    .line 154
    .line 155
    .line 156
    new-instance v4, Lorg/xplatform/bethistory/powerbet/presentation/PowerbetOldScreen;

    .line 157
    .line 158
    invoke-virtual {v0}, La/q5w;->v()La/n3w;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    iget-object v5, v5, La/n3w;->a:Ljava/lang/String;

    .line 163
    .line 164
    iget-wide v6, v0, La/q5w;->u:J

    .line 165
    .line 166
    invoke-direct {v4, v5, v6, v7}, Lorg/xplatform/bethistory/powerbet/presentation/PowerbetOldScreen;-><init>(Ljava/lang/String;J)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v3, v4}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 170
    .line 171
    .line 172
    iget-object v0, v3, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 173
    .line 174
    invoke-static {v1, v0, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    :goto_0
    move-object v2, v0

    .line 179
    check-cast v2, La/paw;

    .line 180
    .line 181
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    if-eqz v3, :cond_2

    .line 186
    .line 187
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    check-cast v2, La/oe50;

    .line 192
    .line 193
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 194
    .line 195
    .line 196
    goto :goto_0

    .line 197
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 198
    .line 199
    return-object v0

    .line 200
    :pswitch_1
    move-object/from16 v1, p1

    .line 201
    .line 202
    check-cast v1, La/uv6;

    .line 203
    .line 204
    sget-object v3, La/izv;->d2:La/rqt;

    .line 205
    .line 206
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0}, La/izv;->M0()La/jzv;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    iget-object v3, v3, La/jzv;->c:La/r2w;

    .line 214
    .line 215
    iget-object v3, v3, La/r2w;->y:La/p7m0;

    .line 216
    .line 217
    :cond_3
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    move-object v5, v4

    .line 222
    check-cast v5, La/d3w;

    .line 223
    .line 224
    const/4 v12, 0x0

    .line 225
    const/16 v13, 0xe7

    .line 226
    .line 227
    const/4 v6, 0x0

    .line 228
    const/4 v7, 0x0

    .line 229
    const/4 v8, 0x0

    .line 230
    const/4 v9, 0x0

    .line 231
    const-wide/16 v10, 0x0

    .line 232
    .line 233
    invoke-static/range {v5 .. v13}, La/d3w;->a(La/d3w;La/n3w;Ljava/util/List;ZZJZI)La/d3w;

    .line 234
    .line 235
    .line 236
    move-result-object v5

    .line 237
    invoke-virtual {v3, v4, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v4

    .line 241
    if-eqz v4, :cond_3

    .line 242
    .line 243
    invoke-virtual {v0}, La/izv;->M0()La/jzv;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    iget-object v5, v0, La/jzv;->e:La/q5w;

    .line 248
    .line 249
    iget-object v0, v5, La/q5w;->t:La/mne;

    .line 250
    .line 251
    invoke-virtual {v5}, La/q5w;->v()La/n3w;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    iget-object v3, v3, La/n3w;->c:La/s77;

    .line 256
    .line 257
    sget-object v4, La/s77;->d:La/s77;

    .line 258
    .line 259
    if-eq v3, v4, :cond_d

    .line 260
    .line 261
    invoke-virtual {v5}, La/q5w;->v()La/n3w;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    iget-object v3, v3, La/n3w;->c:La/s77;

    .line 266
    .line 267
    sget-object v4, La/s77;->i:La/s77;

    .line 268
    .line 269
    if-eq v3, v4, :cond_d

    .line 270
    .line 271
    sget-object v3, La/q5w;->G:Ljava/util/List;

    .line 272
    .line 273
    iget-wide v6, v1, La/uv6;->t:J

    .line 274
    .line 275
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 276
    .line 277
    .line 278
    move-result-object v4

    .line 279
    invoke-interface {v3, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v3

    .line 283
    if-eqz v3, :cond_4

    .line 284
    .line 285
    goto/16 :goto_5

    .line 286
    .line 287
    :cond_4
    iget-boolean v3, v1, La/uv6;->g:Z

    .line 288
    .line 289
    const/4 v11, 0x0

    .line 290
    if-eqz v3, :cond_c

    .line 291
    .line 292
    invoke-virtual {v5}, La/q5w;->v()La/n3w;

    .line 293
    .line 294
    .line 295
    move-result-object v3

    .line 296
    iget-object v3, v3, La/n3w;->J1:Ljava/util/List;

    .line 297
    .line 298
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    :cond_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 303
    .line 304
    .line 305
    move-result v4

    .line 306
    if-eqz v4, :cond_6

    .line 307
    .line 308
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v4

    .line 312
    move-object v6, v4

    .line 313
    check-cast v6, La/su6;

    .line 314
    .line 315
    iget-wide v6, v6, La/su6;->i:J

    .line 316
    .line 317
    iget-wide v8, v1, La/uv6;->i:J

    .line 318
    .line 319
    cmp-long v6, v6, v8

    .line 320
    .line 321
    if-nez v6, :cond_5

    .line 322
    .line 323
    goto :goto_1

    .line 324
    :cond_6
    move-object v4, v11

    .line 325
    :goto_1
    check-cast v4, La/su6;

    .line 326
    .line 327
    if-eqz v4, :cond_7

    .line 328
    .line 329
    iget-boolean v3, v4, La/su6;->s1:Z

    .line 330
    .line 331
    goto :goto_2

    .line 332
    :cond_7
    move v3, v2

    .line 333
    :goto_2
    const/4 v12, 0x1

    .line 334
    if-eqz v3, :cond_8

    .line 335
    .line 336
    invoke-virtual {v5}, La/q5w;->v()La/n3w;

    .line 337
    .line 338
    .line 339
    move-result-object v3

    .line 340
    invoke-static {v3}, La/xkb;->H(La/n3w;)Z

    .line 341
    .line 342
    .line 343
    move-result v3

    .line 344
    if-eqz v3, :cond_8

    .line 345
    .line 346
    move v2, v12

    .line 347
    :cond_8
    const-string v3, ""

    .line 348
    .line 349
    if-eqz v2, :cond_9

    .line 350
    .line 351
    invoke-virtual {v5}, La/q5w;->v()La/n3w;

    .line 352
    .line 353
    .line 354
    move-result-object v6

    .line 355
    iget-object v6, v6, La/n3w;->a:Ljava/lang/String;

    .line 356
    .line 357
    move-object/from16 v23, v6

    .line 358
    .line 359
    goto :goto_3

    .line 360
    :cond_9
    move-object/from16 v23, v3

    .line 361
    .line 362
    :goto_3
    const-wide/16 v6, 0x0

    .line 363
    .line 364
    if-eqz v4, :cond_a

    .line 365
    .line 366
    iget-wide v8, v4, La/su6;->h1:J

    .line 367
    .line 368
    goto :goto_4

    .line 369
    :cond_a
    move-wide v8, v6

    .line 370
    :goto_4
    if-eqz v2, :cond_b

    .line 371
    .line 372
    cmp-long v2, v8, v6

    .line 373
    .line 374
    if-eqz v2, :cond_b

    .line 375
    .line 376
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v3

    .line 380
    :cond_b
    move-object/from16 v24, v3

    .line 381
    .line 382
    iget-object v2, v5, La/q5w;->A:La/nhf0;

    .line 383
    .line 384
    iget-wide v14, v1, La/uv6;->t:J

    .line 385
    .line 386
    iget v3, v1, La/uv6;->I:I

    .line 387
    .line 388
    int-to-long v3, v3

    .line 389
    iget-wide v6, v1, La/uv6;->a:J

    .line 390
    .line 391
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    iget-object v2, v2, La/nhf0;->b:Ljava/lang/Object;

    .line 398
    .line 399
    move-object v13, v2

    .line 400
    check-cast v13, La/bn6;

    .line 401
    .line 402
    const/16 v20, 0x1

    .line 403
    .line 404
    const/16 v21, 0x0

    .line 405
    .line 406
    const-string v22, "bet_history"

    .line 407
    .line 408
    move-wide/from16 v16, v3

    .line 409
    .line 410
    move-wide/from16 v18, v6

    .line 411
    .line 412
    invoke-virtual/range {v13 .. v24}, La/bn6;->e(JJJZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 413
    .line 414
    .line 415
    iget-object v2, v5, La/q5w;->B:La/je;

    .line 416
    .line 417
    iget-wide v3, v1, La/uv6;->t:J

    .line 418
    .line 419
    iget-wide v6, v1, La/uv6;->a:J

    .line 420
    .line 421
    const-string v32, "bet_history"

    .line 422
    .line 423
    move-object/from16 v25, v2

    .line 424
    .line 425
    move-wide/from16 v26, v3

    .line 426
    .line 427
    move-wide/from16 v30, v6

    .line 428
    .line 429
    move-wide/from16 v28, v16

    .line 430
    .line 431
    invoke-virtual/range {v25 .. v32}, La/je;->h(JJJLjava/lang/String;)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v5}, La/eiu0;->s()La/diu0;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 439
    .line 440
    .line 441
    move-result-object v13

    .line 442
    new-instance v14, La/n5w;

    .line 443
    .line 444
    const/4 v9, 0x0

    .line 445
    const/4 v10, 0x2

    .line 446
    const/4 v4, 0x1

    .line 447
    const-class v6, La/q5w;

    .line 448
    .line 449
    const-string v7, "handleError"

    .line 450
    .line 451
    const-string v8, "handleError(Ljava/lang/Throwable;)V"

    .line 452
    .line 453
    move-object v3, v14

    .line 454
    invoke-direct/range {v3 .. v10}, La/n5w;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 455
    .line 456
    .line 457
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 458
    .line 459
    new-instance v2, La/o5w;

    .line 460
    .line 461
    invoke-direct {v2, v5, v1, v11, v12}, La/o5w;-><init>(La/q5w;La/uv6;La/yje;B)V

    .line 462
    .line 463
    .line 464
    const/16 v18, 0xa

    .line 465
    .line 466
    const/4 v15, 0x0

    .line 467
    move-object/from16 v16, v0

    .line 468
    .line 469
    move-object/from16 v17, v2

    .line 470
    .line 471
    invoke-static/range {v13 .. v18}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 472
    .line 473
    .line 474
    goto :goto_5

    .line 475
    :cond_c
    invoke-virtual {v5}, La/eiu0;->s()La/diu0;

    .line 476
    .line 477
    .line 478
    move-result-object v3

    .line 479
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 480
    .line 481
    .line 482
    move-result-object v12

    .line 483
    iget-object v15, v0, La/mne;->a:La/rwj;

    .line 484
    .line 485
    new-instance v0, La/o5w;

    .line 486
    .line 487
    invoke-direct {v0, v5, v1, v11, v2}, La/o5w;-><init>(La/q5w;La/uv6;La/yje;B)V

    .line 488
    .line 489
    .line 490
    const/16 v17, 0xb

    .line 491
    .line 492
    const/4 v13, 0x0

    .line 493
    const/4 v14, 0x0

    .line 494
    move-object/from16 v16, v0

    .line 495
    .line 496
    invoke-static/range {v12 .. v17}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 497
    .line 498
    .line 499
    :cond_d
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 500
    .line 501
    return-object v0

    .line 502
    nop

    .line 503
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
