.class public final synthetic La/ypu0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gfg;


# direct methods
.method public synthetic constructor <init>(La/gfg;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ypu0;->a:B

    iput-object p1, p0, La/ypu0;->b:La/gfg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ypu0;->a:B

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    const/16 v4, 0xa

    .line 8
    .line 9
    const v5, 0x7f1300e4

    .line 10
    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    iget-object v0, v0, La/ypu0;->b:La/gfg;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v1, p1

    .line 19
    .line 20
    check-cast v1, Ljava/util/List;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object v0, v0, La/gfg;->c:La/ctf0;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v9

    .line 38
    if-eqz v9, :cond_0

    .line 39
    .line 40
    sget-object v0, La/iun;->a:La/iun;

    .line 41
    .line 42
    goto/16 :goto_5

    .line 43
    .line 44
    :cond_0
    new-instance v9, La/qpu0;

    .line 45
    .line 46
    new-array v10, v6, [Ljava/lang/Object;

    .line 47
    .line 48
    iget-object v11, v0, La/ctf0;->b:La/lsm0;

    .line 49
    .line 50
    invoke-static {v10, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v10

    .line 54
    const v12, 0x7f130403

    .line 55
    .line 56
    .line 57
    invoke-virtual {v11, v12, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v14

    .line 61
    new-instance v10, La/ue9;

    .line 62
    .line 63
    new-array v12, v6, [Ljava/lang/Object;

    .line 64
    .line 65
    invoke-static {v12, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v12

    .line 69
    invoke-virtual {v11, v5, v12}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-direct {v10, v5}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    new-instance v13, La/hjm;

    .line 77
    .line 78
    const/16 v25, 0x0

    .line 79
    .line 80
    const/16 v26, 0x1bbe

    .line 81
    .line 82
    const/4 v15, 0x0

    .line 83
    const/16 v16, 0x0

    .line 84
    .line 85
    const/16 v17, 0x0

    .line 86
    .line 87
    const/16 v18, 0x0

    .line 88
    .line 89
    const/16 v19, 0x0

    .line 90
    .line 91
    const/16 v20, 0x0

    .line 92
    .line 93
    const/16 v21, 0x0

    .line 94
    .line 95
    const/16 v22, 0x0

    .line 96
    .line 97
    const/16 v23, 0x0

    .line 98
    .line 99
    move-object/from16 v24, v10

    .line 100
    .line 101
    invoke-direct/range {v13 .. v26}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 102
    .line 103
    .line 104
    const-string v5, "HEADER_CHAMPIONSHIPS"

    .line 105
    .line 106
    invoke-direct {v9, v5, v13}, La/qpu0;-><init>(Ljava/lang/String;La/jjm;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v8, v9}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    const/4 v5, 0x2

    .line 113
    invoke-static {v1, v5}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    new-instance v5, Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-static {v1, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 124
    .line 125
    .line 126
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    move v4, v6

    .line 131
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v9

    .line 135
    if-eqz v9, :cond_6

    .line 136
    .line 137
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v9

    .line 141
    add-int/lit8 v10, v4, 0x1

    .line 142
    .line 143
    if-ltz v4, :cond_5

    .line 144
    .line 145
    check-cast v9, La/nyg;

    .line 146
    .line 147
    new-instance v12, La/fpu0;

    .line 148
    .line 149
    const-string v13, "CHAMPIONSHIPS_LIVE"

    .line 150
    .line 151
    invoke-static {v4, v13}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    new-instance v13, La/trm;

    .line 156
    .line 157
    iget-wide v14, v9, La/nyg;->g:J

    .line 158
    .line 159
    iget-object v3, v9, La/nyg;->f:Ljava/lang/String;

    .line 160
    .line 161
    move-object/from16 p1, v8

    .line 162
    .line 163
    iget-wide v7, v9, La/nyg;->i:J

    .line 164
    .line 165
    const-wide/16 v16, 0xf3

    .line 166
    .line 167
    cmp-long v7, v7, v16

    .line 168
    .line 169
    if-nez v7, :cond_1

    .line 170
    .line 171
    const-string v7, ". "

    .line 172
    .line 173
    invoke-static {v3, v7, v3}, Lkotlin/text/StringsKt;->m0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    :cond_1
    move-object/from16 v16, v3

    .line 178
    .line 179
    iget-boolean v3, v9, La/nyg;->m:Z

    .line 180
    .line 181
    if-eqz v3, :cond_2

    .line 182
    .line 183
    new-array v3, v6, [Ljava/lang/Object;

    .line 184
    .line 185
    invoke-static {v3, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    const v7, 0x7f130609

    .line 190
    .line 191
    .line 192
    invoke-virtual {v11, v7, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    move-object/from16 v17, v3

    .line 197
    .line 198
    goto :goto_1

    .line 199
    :cond_2
    move-object/from16 v17, v2

    .line 200
    .line 201
    :goto_1
    iget-object v3, v9, La/nyg;->j:Ljava/lang/String;

    .line 202
    .line 203
    invoke-virtual {v0}, La/ctf0;->j()Z

    .line 204
    .line 205
    .line 206
    move-result v7

    .line 207
    new-instance v8, La/n0x;

    .line 208
    .line 209
    if-eqz v7, :cond_3

    .line 210
    .line 211
    iget-object v7, v9, La/nyg;->b:Ljava/lang/String;

    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_3
    iget-object v7, v9, La/nyg;->a:Ljava/lang/String;

    .line 215
    .line 216
    :goto_2
    invoke-direct {v8, v7}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0}, La/ctf0;->j()Z

    .line 220
    .line 221
    .line 222
    move-result v7

    .line 223
    new-instance v9, La/m0x;

    .line 224
    .line 225
    if-eqz v7, :cond_4

    .line 226
    .line 227
    const v7, 0x7f08045c

    .line 228
    .line 229
    .line 230
    :goto_3
    move-object/from16 v23, v0

    .line 231
    .line 232
    const/4 v0, 0x0

    .line 233
    const/4 v6, 0x6

    .line 234
    goto :goto_4

    .line 235
    :cond_4
    const v7, 0x7f080455

    .line 236
    .line 237
    .line 238
    goto :goto_3

    .line 239
    :goto_4
    invoke-direct {v9, v7, v0, v6}, La/m0x;-><init>(ILa/bzw;I)V

    .line 240
    .line 241
    .line 242
    move-object/from16 v18, v3

    .line 243
    .line 244
    move-object/from16 v19, v8

    .line 245
    .line 246
    move-object/from16 v20, v9

    .line 247
    .line 248
    invoke-direct/range {v13 .. v20}, La/trm;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;La/n0x;La/m0x;)V

    .line 249
    .line 250
    .line 251
    invoke-direct {v12, v4, v13}, La/fpu0;-><init>(Ljava/lang/String;La/vrm;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-object/from16 v8, p1

    .line 258
    .line 259
    move v4, v10

    .line 260
    move-object/from16 v0, v23

    .line 261
    .line 262
    const/4 v6, 0x0

    .line 263
    goto/16 :goto_0

    .line 264
    .line 265
    :cond_5
    const/4 v0, 0x0

    .line 266
    invoke-static {}, La/q3d;->p()V

    .line 267
    .line 268
    .line 269
    throw v0

    .line 270
    :cond_6
    move-object v0, v8

    .line 271
    invoke-virtual {v0, v5}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 272
    .line 273
    .line 274
    invoke-static {v0}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    :goto_5
    return-object v0

    .line 279
    :pswitch_0
    move-object/from16 v1, p1

    .line 280
    .line 281
    check-cast v1, Ljava/util/List;

    .line 282
    .line 283
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    iget-object v0, v0, La/gfg;->c:La/ctf0;

    .line 287
    .line 288
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 296
    .line 297
    .line 298
    move-result v3

    .line 299
    if-nez v3, :cond_8

    .line 300
    .line 301
    new-instance v3, La/qpu0;

    .line 302
    .line 303
    const/4 v6, 0x0

    .line 304
    new-array v7, v6, [Ljava/lang/Object;

    .line 305
    .line 306
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 307
    .line 308
    invoke-static {v7, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v7

    .line 312
    const v8, 0x7f1306e2

    .line 313
    .line 314
    .line 315
    invoke-virtual {v0, v8, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v23

    .line 319
    new-instance v7, La/ue9;

    .line 320
    .line 321
    new-array v8, v6, [Ljava/lang/Object;

    .line 322
    .line 323
    invoke-static {v8, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v6

    .line 327
    invoke-virtual {v0, v5, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    invoke-direct {v7, v0}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    new-instance v22, La/hjm;

    .line 335
    .line 336
    const/16 v34, 0x0

    .line 337
    .line 338
    const/16 v35, 0x1bbe

    .line 339
    .line 340
    const/16 v24, 0x0

    .line 341
    .line 342
    const/16 v25, 0x0

    .line 343
    .line 344
    const/16 v26, 0x0

    .line 345
    .line 346
    const/16 v27, 0x0

    .line 347
    .line 348
    const/16 v28, 0x0

    .line 349
    .line 350
    const/16 v29, 0x0

    .line 351
    .line 352
    const/16 v30, 0x0

    .line 353
    .line 354
    const/16 v31, 0x0

    .line 355
    .line 356
    const/16 v32, 0x0

    .line 357
    .line 358
    move-object/from16 v33, v7

    .line 359
    .line 360
    invoke-direct/range {v22 .. v35}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 361
    .line 362
    .line 363
    move-object/from16 v0, v22

    .line 364
    .line 365
    const-string v5, "HEADER_DISCIPLINES"

    .line 366
    .line 367
    invoke-direct {v3, v5, v0}, La/qpu0;-><init>(Ljava/lang/String;La/jjm;)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v2, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    new-instance v0, Ljava/util/ArrayList;

    .line 374
    .line 375
    invoke-static {v1, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 376
    .line 377
    .line 378
    move-result v3

    .line 379
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 380
    .line 381
    .line 382
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 383
    .line 384
    .line 385
    move-result-object v1

    .line 386
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 387
    .line 388
    .line 389
    move-result v3

    .line 390
    if-eqz v3, :cond_7

    .line 391
    .line 392
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v3

    .line 396
    check-cast v3, La/ypl0;

    .line 397
    .line 398
    invoke-static {v3}, La/vic;->E(La/ypl0;)La/p3b;

    .line 399
    .line 400
    .line 401
    move-result-object v3

    .line 402
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    goto :goto_6

    .line 406
    :cond_7
    new-instance v1, La/m0x;

    .line 407
    .line 408
    const v3, 0x7f080457

    .line 409
    .line 410
    .line 411
    const/4 v4, 0x0

    .line 412
    const/4 v6, 0x6

    .line 413
    invoke-direct {v1, v3, v4, v6}, La/m0x;-><init>(ILa/bzw;I)V

    .line 414
    .line 415
    .line 416
    new-instance v3, La/w3b;

    .line 417
    .line 418
    invoke-direct {v3, v0, v1}, La/w3b;-><init>(Ljava/util/ArrayList;La/m0x;)V

    .line 419
    .line 420
    .line 421
    new-instance v0, La/jpu0;

    .line 422
    .line 423
    const-string v1, "DISCIPLINES"

    .line 424
    .line 425
    invoke-direct {v0, v1, v3}, La/jpu0;-><init>(Ljava/lang/String;La/y3b;)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v2, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 429
    .line 430
    .line 431
    :cond_8
    invoke-static {v2}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    return-object v0

    .line 436
    :pswitch_1
    move-object/from16 v1, p1

    .line 437
    .line 438
    check-cast v1, Ljava/util/List;

    .line 439
    .line 440
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    iget-object v3, v0, La/gfg;->h:Ljava/lang/Object;

    .line 444
    .line 445
    move-object v8, v3

    .line 446
    check-cast v8, La/y78;

    .line 447
    .line 448
    iget-object v7, v0, La/gfg;->c:La/ctf0;

    .line 449
    .line 450
    iget-object v0, v0, La/gfg;->g:Ljava/lang/Object;

    .line 451
    .line 452
    check-cast v0, La/upu0;

    .line 453
    .line 454
    iget-boolean v9, v0, La/upu0;->f:Z

    .line 455
    .line 456
    iget-object v3, v0, La/upu0;->b:La/sff0;

    .line 457
    .line 458
    iget-object v6, v0, La/upu0;->d:Ljava/util/List;

    .line 459
    .line 460
    iget-boolean v0, v0, La/upu0;->g:Z

    .line 461
    .line 462
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 466
    .line 467
    .line 468
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 469
    .line 470
    .line 471
    move-result-object v10

    .line 472
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 473
    .line 474
    .line 475
    move-result v11

    .line 476
    if-nez v11, :cond_16

    .line 477
    .line 478
    new-instance v11, La/qpu0;

    .line 479
    .line 480
    new-instance v23, La/hjm;

    .line 481
    .line 482
    const/4 v12, 0x0

    .line 483
    new-array v13, v12, [Ljava/lang/Object;

    .line 484
    .line 485
    iget-object v14, v7, La/ctf0;->b:La/lsm0;

    .line 486
    .line 487
    invoke-static {v13, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v13

    .line 491
    const v15, 0x7f130fc2

    .line 492
    .line 493
    .line 494
    invoke-virtual {v14, v15, v13}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v13

    .line 498
    new-array v15, v12, [Ljava/lang/Object;

    .line 499
    .line 500
    invoke-static {v15, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v15

    .line 504
    const v12, 0x7f1305ce

    .line 505
    .line 506
    .line 507
    invoke-virtual {v14, v12, v15}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v12

    .line 511
    const-string v15, " "

    .line 512
    .line 513
    invoke-static {v13, v15, v12}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v24

    .line 517
    const/16 v35, 0x0

    .line 518
    .line 519
    const/16 v36, 0x1fbe

    .line 520
    .line 521
    const/16 v25, 0x0

    .line 522
    .line 523
    const/16 v26, 0x0

    .line 524
    .line 525
    const/16 v27, 0x0

    .line 526
    .line 527
    const/16 v28, 0x0

    .line 528
    .line 529
    const/16 v29, 0x0

    .line 530
    .line 531
    const/16 v30, 0x1

    .line 532
    .line 533
    const/16 v31, 0x0

    .line 534
    .line 535
    const/16 v32, 0x0

    .line 536
    .line 537
    const/16 v33, 0x0

    .line 538
    .line 539
    const/16 v34, 0x0

    .line 540
    .line 541
    invoke-direct/range {v23 .. v36}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 542
    .line 543
    .line 544
    move-object/from16 v12, v23

    .line 545
    .line 546
    const-string v13, "HEADER_LIVE_GAMES"

    .line 547
    .line 548
    invoke-direct {v11, v13, v12}, La/qpu0;-><init>(Ljava/lang/String;La/jjm;)V

    .line 549
    .line 550
    .line 551
    invoke-virtual {v10, v11}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 552
    .line 553
    .line 554
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 555
    .line 556
    .line 557
    move-result-object v1

    .line 558
    const/4 v11, 0x0

    .line 559
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 560
    .line 561
    .line 562
    move-result v12

    .line 563
    if-eqz v12, :cond_16

    .line 564
    .line 565
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v12

    .line 569
    add-int/lit8 v23, v11, 0x1

    .line 570
    .line 571
    if-ltz v11, :cond_15

    .line 572
    .line 573
    check-cast v12, La/eih;

    .line 574
    .line 575
    new-instance v13, La/vpu0;

    .line 576
    .line 577
    iget-wide v4, v12, La/eih;->a:J

    .line 578
    .line 579
    const-string v15, "SUBHEADER_LIVE_GAMES"

    .line 580
    .line 581
    invoke-static {v4, v5, v15}, La/h97;->h(JLjava/lang/String;)Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    move-result-object v4

    .line 585
    move/from16 v20, v0

    .line 586
    .line 587
    move-object/from16 p1, v1

    .line 588
    .line 589
    iget-wide v0, v12, La/eih;->a:J

    .line 590
    .line 591
    iget-object v5, v12, La/eih;->c:Ljava/lang/String;

    .line 592
    .line 593
    new-instance v15, La/ue9;

    .line 594
    .line 595
    move-object/from16 v33, v2

    .line 596
    .line 597
    move-object/from16 v28, v5

    .line 598
    .line 599
    const/4 v2, 0x0

    .line 600
    new-array v5, v2, [Ljava/lang/Object;

    .line 601
    .line 602
    invoke-static {v5, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object v5

    .line 606
    const v2, 0x7f1300e4

    .line 607
    .line 608
    .line 609
    invoke-virtual {v14, v2, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object v5

    .line 613
    invoke-direct {v15, v5}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 614
    .line 615
    .line 616
    new-instance v5, La/n0x;

    .line 617
    .line 618
    iget-object v2, v12, La/eih;->d:Ljava/lang/String;

    .line 619
    .line 620
    invoke-direct {v5, v2}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 621
    .line 622
    .line 623
    new-instance v2, La/m0x;

    .line 624
    .line 625
    move-object/from16 v29, v5

    .line 626
    .line 627
    const v5, 0x7f0807b5

    .line 628
    .line 629
    .line 630
    move-object/from16 v16, v7

    .line 631
    .line 632
    move-object/from16 v17, v8

    .line 633
    .line 634
    const/4 v7, 0x6

    .line 635
    const/4 v8, 0x0

    .line 636
    invoke-direct {v2, v5, v8, v7}, La/m0x;-><init>(ILa/bzw;I)V

    .line 637
    .line 638
    .line 639
    new-instance v26, La/h5n;

    .line 640
    .line 641
    const/16 v27, 0x0

    .line 642
    .line 643
    const/16 v32, 0x45

    .line 644
    .line 645
    move-object/from16 v30, v2

    .line 646
    .line 647
    move-object/from16 v31, v15

    .line 648
    .line 649
    invoke-direct/range {v26 .. v32}, La/h5n;-><init>(La/i5n;Ljava/lang/CharSequence;La/n0x;La/m0x;La/ue9;I)V

    .line 650
    .line 651
    .line 652
    move-object/from16 v2, v26

    .line 653
    .line 654
    invoke-direct {v13, v4, v0, v1, v2}, La/vpu0;-><init>(Ljava/lang/String;JLa/h5n;)V

    .line 655
    .line 656
    .line 657
    invoke-virtual {v10, v13}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 658
    .line 659
    .line 660
    new-instance v0, La/epu0;

    .line 661
    .line 662
    const-string v1, "GAME_CARD"

    .line 663
    .line 664
    invoke-static {v11, v1}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 665
    .line 666
    .line 667
    move-result-object v1

    .line 668
    sget-object v2, La/q0s;->b:La/q0s;

    .line 669
    .line 670
    iget-object v4, v12, La/eih;->e:Ljava/util/ArrayList;

    .line 671
    .line 672
    new-instance v5, Ljava/util/ArrayList;

    .line 673
    .line 674
    const/16 v8, 0xa

    .line 675
    .line 676
    invoke-static {v4, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 677
    .line 678
    .line 679
    move-result v11

    .line 680
    invoke-direct {v5, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 681
    .line 682
    .line 683
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 684
    .line 685
    .line 686
    move-result-object v4

    .line 687
    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 688
    .line 689
    .line 690
    move-result v8

    .line 691
    if-eqz v8, :cond_14

    .line 692
    .line 693
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 694
    .line 695
    .line 696
    move-result-object v8

    .line 697
    check-cast v8, La/d0t;

    .line 698
    .line 699
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 700
    .line 701
    .line 702
    move-result-object v11

    .line 703
    :goto_9
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 704
    .line 705
    .line 706
    move-result v13

    .line 707
    if-eqz v13, :cond_a

    .line 708
    .line 709
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 710
    .line 711
    .line 712
    move-result-object v13

    .line 713
    move-object v15, v13

    .line 714
    check-cast v15, La/lok0;

    .line 715
    .line 716
    iget v15, v15, La/lok0;->a:I

    .line 717
    .line 718
    iget v7, v8, La/d0t;->O:I

    .line 719
    .line 720
    if-ne v15, v7, :cond_9

    .line 721
    .line 722
    goto :goto_a

    .line 723
    :cond_9
    const/4 v7, 0x6

    .line 724
    goto :goto_9

    .line 725
    :cond_a
    const/4 v13, 0x0

    .line 726
    :goto_a
    check-cast v13, La/lok0;

    .line 727
    .line 728
    move-object v7, v10

    .line 729
    iget-boolean v10, v3, La/sff0;->J:Z

    .line 730
    .line 731
    iget-object v11, v12, La/eih;->f:Ljava/lang/String;

    .line 732
    .line 733
    new-instance v15, Ljava/util/ArrayList;

    .line 734
    .line 735
    move-object/from16 v25, v4

    .line 736
    .line 737
    move-object/from16 v18, v12

    .line 738
    .line 739
    const/16 v12, 0xa

    .line 740
    .line 741
    invoke-static {v6, v12}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 742
    .line 743
    .line 744
    move-result v4

    .line 745
    invoke-direct {v15, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 746
    .line 747
    .line 748
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 749
    .line 750
    .line 751
    move-result-object v4

    .line 752
    :goto_b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 753
    .line 754
    .line 755
    move-result v19

    .line 756
    if-eqz v19, :cond_b

    .line 757
    .line 758
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 759
    .line 760
    .line 761
    move-result-object v19

    .line 762
    move-object/from16 v12, v19

    .line 763
    .line 764
    check-cast v12, La/lok0;

    .line 765
    .line 766
    iget v12, v12, La/lok0;->a:I

    .line 767
    .line 768
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 769
    .line 770
    .line 771
    move-result-object v12

    .line 772
    invoke-virtual {v15, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 773
    .line 774
    .line 775
    const/16 v12, 0xa

    .line 776
    .line 777
    goto :goto_b

    .line 778
    :cond_b
    if-eqz v13, :cond_c

    .line 779
    .line 780
    iget-boolean v4, v13, La/lok0;->n:Z

    .line 781
    .line 782
    move-object/from16 v37, v14

    .line 783
    .line 784
    move v14, v4

    .line 785
    move-object/from16 v4, v37

    .line 786
    .line 787
    goto :goto_c

    .line 788
    :cond_c
    move-object v4, v14

    .line 789
    const/4 v14, 0x0

    .line 790
    :goto_c
    if-eqz v13, :cond_d

    .line 791
    .line 792
    iget-boolean v12, v13, La/lok0;->p:Z

    .line 793
    .line 794
    move-object/from16 v19, v15

    .line 795
    .line 796
    move v15, v12

    .line 797
    move-object/from16 v12, v19

    .line 798
    .line 799
    :goto_d
    move-object/from16 v19, v4

    .line 800
    .line 801
    goto :goto_e

    .line 802
    :cond_d
    move-object v12, v15

    .line 803
    const/4 v15, 0x0

    .line 804
    goto :goto_d

    .line 805
    :goto_e
    iget-object v4, v3, La/sff0;->g:La/mum0;

    .line 806
    .line 807
    iget-object v4, v4, La/mum0;->y:La/v5l0;

    .line 808
    .line 809
    move-object/from16 v27, v3

    .line 810
    .line 811
    iget-object v3, v8, La/d0t;->K:Ljava/util/List;

    .line 812
    .line 813
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 814
    .line 815
    .line 816
    move-result v3

    .line 817
    if-eqz v3, :cond_11

    .line 818
    .line 819
    iget-object v3, v8, La/d0t;->k:Ljava/util/List;

    .line 820
    .line 821
    if-eqz v3, :cond_e

    .line 822
    .line 823
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 824
    .line 825
    .line 826
    move-result v28

    .line 827
    if-eqz v28, :cond_e

    .line 828
    .line 829
    goto :goto_10

    .line 830
    :cond_e
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 831
    .line 832
    .line 833
    move-result-object v3

    .line 834
    :goto_f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 835
    .line 836
    .line 837
    move-result v28

    .line 838
    if-eqz v28, :cond_10

    .line 839
    .line 840
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 841
    .line 842
    .line 843
    move-result-object v28

    .line 844
    move-object/from16 v29, v3

    .line 845
    .line 846
    move-object/from16 v3, v28

    .line 847
    .line 848
    check-cast v3, La/d0t;

    .line 849
    .line 850
    iget-object v3, v3, La/d0t;->K:Ljava/util/List;

    .line 851
    .line 852
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 853
    .line 854
    .line 855
    move-result v3

    .line 856
    if-nez v3, :cond_f

    .line 857
    .line 858
    goto :goto_11

    .line 859
    :cond_f
    move-object/from16 v3, v29

    .line 860
    .line 861
    goto :goto_f

    .line 862
    :cond_10
    :goto_10
    sget-object v3, La/i5l0;->a:La/i5l0;

    .line 863
    .line 864
    goto :goto_12

    .line 865
    :cond_11
    :goto_11
    sget-object v3, La/l5l0;->a:La/l5l0;

    .line 866
    .line 867
    :goto_12
    if-eqz v13, :cond_12

    .line 868
    .line 869
    iget-object v13, v13, La/lok0;->u:Ljava/lang/String;

    .line 870
    .line 871
    goto :goto_13

    .line 872
    :cond_12
    const/4 v13, 0x0

    .line 873
    :goto_13
    if-nez v13, :cond_13

    .line 874
    .line 875
    move-object/from16 v13, v33

    .line 876
    .line 877
    :cond_13
    move-object/from16 v28, v12

    .line 878
    .line 879
    const/4 v12, 0x0

    .line 880
    move-object/from16 v29, v7

    .line 881
    .line 882
    move-object/from16 v7, v16

    .line 883
    .line 884
    const/16 v16, 0x1

    .line 885
    .line 886
    move-object/from16 v26, v18

    .line 887
    .line 888
    move-object/from16 v21, v19

    .line 889
    .line 890
    move-object/from16 v18, v3

    .line 891
    .line 892
    move-object v3, v6

    .line 893
    move-object v6, v8

    .line 894
    move-object/from16 v19, v13

    .line 895
    .line 896
    move-object/from16 v8, v17

    .line 897
    .line 898
    move-object/from16 v13, v28

    .line 899
    .line 900
    const/16 v28, 0x6

    .line 901
    .line 902
    move-object/from16 v17, v4

    .line 903
    .line 904
    move-object/from16 v4, v29

    .line 905
    .line 906
    const/16 v29, 0xa

    .line 907
    .line 908
    invoke-static/range {v6 .. v20}, La/wwb;->V(La/d0t;La/ctf0;La/y78;ZZLjava/lang/String;ZLjava/util/List;ZZZLa/v5l0;La/m5l0;Ljava/lang/String;Z)La/a2n;

    .line 909
    .line 910
    .line 911
    move-result-object v6

    .line 912
    move-object/from16 v17, v8

    .line 913
    .line 914
    move/from16 v8, v20

    .line 915
    .line 916
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 917
    .line 918
    .line 919
    move-object v6, v3

    .line 920
    move-object v10, v4

    .line 921
    move-object/from16 v16, v7

    .line 922
    .line 923
    move-object/from16 v14, v21

    .line 924
    .line 925
    move-object/from16 v4, v25

    .line 926
    .line 927
    move-object/from16 v12, v26

    .line 928
    .line 929
    move-object/from16 v3, v27

    .line 930
    .line 931
    move/from16 v7, v28

    .line 932
    .line 933
    goto/16 :goto_8

    .line 934
    .line 935
    :cond_14
    move-object/from16 v27, v3

    .line 936
    .line 937
    move-object v3, v6

    .line 938
    move/from16 v28, v7

    .line 939
    .line 940
    move-object v4, v10

    .line 941
    move-object/from16 v21, v14

    .line 942
    .line 943
    move-object/from16 v7, v16

    .line 944
    .line 945
    move/from16 v8, v20

    .line 946
    .line 947
    const/16 v29, 0xa

    .line 948
    .line 949
    invoke-static {v5}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 950
    .line 951
    .line 952
    move-result-object v5

    .line 953
    new-instance v6, La/vb90;

    .line 954
    .line 955
    const/4 v10, 0x1

    .line 956
    invoke-direct {v6, v2, v5, v10, v8}, La/vb90;-><init>(La/q0s;La/a4x;ZZ)V

    .line 957
    .line 958
    .line 959
    invoke-direct {v0, v1, v6}, La/epu0;-><init>(Ljava/lang/String;La/vb90;)V

    .line 960
    .line 961
    .line 962
    invoke-virtual {v4, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 963
    .line 964
    .line 965
    move-object/from16 v1, p1

    .line 966
    .line 967
    move-object v6, v3

    .line 968
    move-object v10, v4

    .line 969
    move v0, v8

    .line 970
    move-object/from16 v8, v17

    .line 971
    .line 972
    move/from16 v11, v23

    .line 973
    .line 974
    move-object/from16 v3, v27

    .line 975
    .line 976
    move/from16 v4, v29

    .line 977
    .line 978
    move-object/from16 v2, v33

    .line 979
    .line 980
    const v5, 0x7f1300e4

    .line 981
    .line 982
    .line 983
    goto/16 :goto_7

    .line 984
    .line 985
    :cond_15
    invoke-static {}, La/q3d;->p()V

    .line 986
    .line 987
    .line 988
    const/4 v0, 0x0

    .line 989
    throw v0

    .line 990
    :cond_16
    move-object v4, v10

    .line 991
    invoke-static {v4}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 992
    .line 993
    .line 994
    move-result-object v0

    .line 995
    return-object v0

    .line 996
    nop

    .line 997
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
