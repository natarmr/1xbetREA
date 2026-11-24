.class public final synthetic La/onu0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/onu0;->a:B

    iput-object p1, p0, La/onu0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/onu0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IB)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/onu0;->a:B

    iput-object p1, p0, La/onu0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/onu0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/onu0;->a:B

    .line 4
    .line 5
    sget-object v2, La/jm40;->b:La/jm40;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object v6, v0, La/onu0;->c:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v0, v0, La/onu0;->b:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast v0, La/xak;

    .line 18
    .line 19
    check-cast v6, La/x39;

    .line 20
    .line 21
    move-object/from16 v1, p1

    .line 22
    .line 23
    check-cast v1, La/fet;

    .line 24
    .line 25
    move-object/from16 v7, p2

    .line 26
    .line 27
    check-cast v7, Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    and-int/lit8 v8, v7, 0x3

    .line 34
    .line 35
    if-eq v8, v4, :cond_0

    .line 36
    .line 37
    move v3, v5

    .line 38
    :cond_0
    and-int/lit8 v4, v7, 0x1

    .line 39
    .line 40
    invoke-virtual {v1, v4, v3}, La/fet;->U(IZ)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    iget-object v3, v6, La/x39;->a:Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;

    .line 47
    .line 48
    const/16 v4, 0x46

    .line 49
    .line 50
    invoke-virtual {v0, v2, v3, v1, v4}, La/xak;->o(La/mm40;Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;La/fet;I)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {v1}, La/fet;->X()V

    .line 55
    .line 56
    .line 57
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object v0

    .line 60
    :pswitch_0
    check-cast v0, La/jgc;

    .line 61
    .line 62
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 63
    .line 64
    move-object/from16 v1, p1

    .line 65
    .line 66
    check-cast v1, La/fwv0;

    .line 67
    .line 68
    move-object/from16 v2, p2

    .line 69
    .line 70
    check-cast v2, La/kvv0;

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    iget-object v1, v1, La/fwv0;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 79
    .line 80
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    check-cast v3, La/gwv0;

    .line 85
    .line 86
    if-nez v3, :cond_2

    .line 87
    .line 88
    new-instance v3, La/gwv0;

    .line 89
    .line 90
    invoke-direct {v3, v2, v6}, La/gwv0;-><init>(La/kvv0;Lkotlin/jvm/functions/Function1;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    sget-object v0, La/vsv0;->a:La/vsv0;

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_2
    if-eqz v2, :cond_3

    .line 100
    .line 101
    iget-object v0, v3, La/gwv0;->a:La/kvv0;

    .line 102
    .line 103
    if-ne v0, v2, :cond_3

    .line 104
    .line 105
    sget-object v0, La/vsv0;->b:La/vsv0;

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_3
    sget-object v0, La/vsv0;->c:La/vsv0;

    .line 109
    .line 110
    :goto_1
    return-object v0

    .line 111
    :pswitch_1
    check-cast v0, La/ugd;

    .line 112
    .line 113
    check-cast v6, La/qwv0;

    .line 114
    .line 115
    move-object/from16 v1, p1

    .line 116
    .line 117
    check-cast v1, La/fet;

    .line 118
    .line 119
    move-object/from16 v2, p2

    .line 120
    .line 121
    check-cast v2, Ljava/lang/Integer;

    .line 122
    .line 123
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    and-int/lit8 v7, v2, 0x3

    .line 128
    .line 129
    if-eq v7, v4, :cond_4

    .line 130
    .line 131
    move v4, v5

    .line 132
    goto :goto_2

    .line 133
    :cond_4
    move v4, v3

    .line 134
    :goto_2
    and-int/2addr v2, v5

    .line 135
    invoke-virtual {v1, v2, v4}, La/fet;->U(IZ)Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-eqz v2, :cond_5

    .line 140
    .line 141
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-virtual {v0, v6, v1, v2}, La/ugd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_5
    invoke-virtual {v1}, La/fet;->X()V

    .line 150
    .line 151
    .line 152
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    return-object v0

    .line 155
    :pswitch_2
    check-cast v0, La/mm40;

    .line 156
    .line 157
    check-cast v6, La/ywv0;

    .line 158
    .line 159
    move-object/from16 v1, p1

    .line 160
    .line 161
    check-cast v1, La/fet;

    .line 162
    .line 163
    move-object/from16 v2, p2

    .line 164
    .line 165
    check-cast v2, Ljava/lang/Integer;

    .line 166
    .line 167
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-static {v5}, La/x8x;->L(I)I

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    invoke-static {v0, v6, v1, v2}, La/luv0;->a(La/mm40;La/ywv0;La/fet;I)V

    .line 175
    .line 176
    .line 177
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 178
    .line 179
    return-object v0

    .line 180
    :pswitch_3
    check-cast v0, La/qtv0;

    .line 181
    .line 182
    check-cast v6, La/l7m0;

    .line 183
    .line 184
    move-object/from16 v13, p1

    .line 185
    .line 186
    check-cast v13, La/fet;

    .line 187
    .line 188
    move-object/from16 v1, p2

    .line 189
    .line 190
    check-cast v1, Ljava/lang/Integer;

    .line 191
    .line 192
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    and-int/lit8 v2, v1, 0x3

    .line 197
    .line 198
    if-eq v2, v4, :cond_6

    .line 199
    .line 200
    move v3, v5

    .line 201
    :cond_6
    and-int/2addr v1, v5

    .line 202
    invoke-virtual {v13, v1, v3}, La/fet;->U(IZ)Z

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    if-eqz v1, :cond_7

    .line 207
    .line 208
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    move-object v8, v1

    .line 213
    check-cast v8, La/jtv0;

    .line 214
    .line 215
    invoke-static {v0}, La/zsm0;->j(La/qtv0;)J

    .line 216
    .line 217
    .line 218
    move-result-wide v9

    .line 219
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    check-cast v0, La/jtv0;

    .line 224
    .line 225
    iget-wide v11, v0, La/jtv0;->b:J

    .line 226
    .line 227
    const/4 v14, 0x6

    .line 228
    const/4 v15, 0x0

    .line 229
    sget-object v7, La/jm40;->b:La/jm40;

    .line 230
    .line 231
    invoke-static/range {v7 .. v15}, La/btm0;->a(La/mm40;La/jtv0;JJLa/fet;II)V

    .line 232
    .line 233
    .line 234
    goto :goto_4

    .line 235
    :cond_7
    invoke-virtual {v13}, La/fet;->X()V

    .line 236
    .line 237
    .line 238
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 239
    .line 240
    return-object v0

    .line 241
    :pswitch_4
    check-cast v0, La/mm40;

    .line 242
    .line 243
    check-cast v6, La/m0x;

    .line 244
    .line 245
    move-object/from16 v1, p1

    .line 246
    .line 247
    check-cast v1, La/fet;

    .line 248
    .line 249
    move-object/from16 v2, p2

    .line 250
    .line 251
    check-cast v2, Ljava/lang/Integer;

    .line 252
    .line 253
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    invoke-static {v5}, La/x8x;->L(I)I

    .line 257
    .line 258
    .line 259
    move-result v2

    .line 260
    invoke-static {v0, v6, v1, v2}, La/ewm0;->o(La/mm40;La/m0x;La/fet;I)V

    .line 261
    .line 262
    .line 263
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 264
    .line 265
    return-object v0

    .line 266
    :pswitch_5
    check-cast v0, La/mm40;

    .line 267
    .line 268
    check-cast v6, La/n1v0;

    .line 269
    .line 270
    move-object/from16 v1, p1

    .line 271
    .line 272
    check-cast v1, La/fet;

    .line 273
    .line 274
    move-object/from16 v2, p2

    .line 275
    .line 276
    check-cast v2, Ljava/lang/Integer;

    .line 277
    .line 278
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    invoke-static {v5}, La/x8x;->L(I)I

    .line 282
    .line 283
    .line 284
    move-result v2

    .line 285
    invoke-static {v0, v6, v1, v2}, La/msm0;->f(La/mm40;La/n1v0;La/fet;I)V

    .line 286
    .line 287
    .line 288
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 289
    .line 290
    return-object v0

    .line 291
    :pswitch_6
    check-cast v0, La/mm40;

    .line 292
    .line 293
    check-cast v6, La/m1v0;

    .line 294
    .line 295
    move-object/from16 v1, p1

    .line 296
    .line 297
    check-cast v1, La/fet;

    .line 298
    .line 299
    move-object/from16 v2, p2

    .line 300
    .line 301
    check-cast v2, Ljava/lang/Integer;

    .line 302
    .line 303
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    invoke-static {v5}, La/x8x;->L(I)I

    .line 307
    .line 308
    .line 309
    move-result v2

    .line 310
    invoke-static {v0, v6, v1, v2}, La/yqm0;->g(La/mm40;La/m1v0;La/fet;I)V

    .line 311
    .line 312
    .line 313
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 314
    .line 315
    return-object v0

    .line 316
    :pswitch_7
    check-cast v0, La/mm40;

    .line 317
    .line 318
    check-cast v6, La/l1v0;

    .line 319
    .line 320
    move-object/from16 v1, p1

    .line 321
    .line 322
    check-cast v1, La/fet;

    .line 323
    .line 324
    move-object/from16 v2, p2

    .line 325
    .line 326
    check-cast v2, Ljava/lang/Integer;

    .line 327
    .line 328
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    invoke-static {v5}, La/x8x;->L(I)I

    .line 332
    .line 333
    .line 334
    move-result v2

    .line 335
    invoke-static {v0, v6, v1, v2}, La/dqm0;->i(La/mm40;La/l1v0;La/fet;I)V

    .line 336
    .line 337
    .line 338
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 339
    .line 340
    return-object v0

    .line 341
    :pswitch_8
    check-cast v0, La/mm40;

    .line 342
    .line 343
    check-cast v6, La/j1v0;

    .line 344
    .line 345
    move-object/from16 v1, p1

    .line 346
    .line 347
    check-cast v1, La/fet;

    .line 348
    .line 349
    move-object/from16 v2, p2

    .line 350
    .line 351
    check-cast v2, Ljava/lang/Integer;

    .line 352
    .line 353
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    invoke-static {v5}, La/x8x;->L(I)I

    .line 357
    .line 358
    .line 359
    move-result v2

    .line 360
    invoke-static {v0, v6, v1, v2}, La/wpm0;->h(La/mm40;La/j1v0;La/fet;I)V

    .line 361
    .line 362
    .line 363
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 364
    .line 365
    return-object v0

    .line 366
    :pswitch_9
    check-cast v0, La/g2v;

    .line 367
    .line 368
    check-cast v6, La/esu0;

    .line 369
    .line 370
    move-object/from16 v1, p1

    .line 371
    .line 372
    check-cast v1, La/fet;

    .line 373
    .line 374
    move-object/from16 v2, p2

    .line 375
    .line 376
    check-cast v2, Ljava/lang/Integer;

    .line 377
    .line 378
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 379
    .line 380
    .line 381
    const/16 v2, 0x41

    .line 382
    .line 383
    invoke-static {v2}, La/x8x;->L(I)I

    .line 384
    .line 385
    .line 386
    move-result v2

    .line 387
    invoke-static {v0, v6, v1, v2}, La/zgc;->H(La/g2v;La/esu0;La/fet;I)V

    .line 388
    .line 389
    .line 390
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 391
    .line 392
    return-object v0

    .line 393
    :pswitch_a
    check-cast v0, La/l7m0;

    .line 394
    .line 395
    check-cast v6, La/wpu0;

    .line 396
    .line 397
    move-object/from16 v1, p1

    .line 398
    .line 399
    check-cast v1, La/fet;

    .line 400
    .line 401
    move-object/from16 v7, p2

    .line 402
    .line 403
    check-cast v7, Ljava/lang/Integer;

    .line 404
    .line 405
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 406
    .line 407
    .line 408
    move-result v7

    .line 409
    and-int/lit8 v8, v7, 0x3

    .line 410
    .line 411
    if-eq v8, v4, :cond_8

    .line 412
    .line 413
    move v3, v5

    .line 414
    :cond_8
    and-int/lit8 v4, v7, 0x1

    .line 415
    .line 416
    invoke-virtual {v1, v4, v3}, La/fet;->U(IZ)Z

    .line 417
    .line 418
    .line 419
    move-result v3

    .line 420
    if-eqz v3, :cond_b

    .line 421
    .line 422
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    move-result v3

    .line 426
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v4

    .line 430
    if-nez v3, :cond_9

    .line 431
    .line 432
    sget-object v3, La/ukd;->a:La/cl5;

    .line 433
    .line 434
    if-ne v4, v3, :cond_a

    .line 435
    .line 436
    :cond_9
    new-instance v4, La/mqr0;

    .line 437
    .line 438
    const/16 v3, 0x8

    .line 439
    .line 440
    invoke-direct {v4, v0, v3}, La/mqr0;-><init>(La/l7m0;B)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    :cond_a
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 447
    .line 448
    invoke-static {v2, v4}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    const/high16 v2, 0x3f800000    # 1.0f

    .line 453
    .line 454
    invoke-static {v0, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 455
    .line 456
    .line 457
    move-result-object v7

    .line 458
    sget-object v0, La/qmk;->a:La/zcl;

    .line 459
    .line 460
    const/4 v11, 0x0

    .line 461
    const/16 v12, 0xa

    .line 462
    .line 463
    const/high16 v8, 0x41000000    # 8.0f

    .line 464
    .line 465
    const/4 v9, 0x0

    .line 466
    const/high16 v10, 0x42800000    # 64.0f

    .line 467
    .line 468
    invoke-static/range {v7 .. v12}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    const-string v2, "VIRTUAL_GAME_CATEGORY_MAIN_TOOLBAR_COLLAPSED_TITLE"

    .line 473
    .line 474
    invoke-static {v0, v2}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 475
    .line 476
    .line 477
    move-result-object v8

    .line 478
    iget-object v7, v6, La/wpu0;->c:Ljava/lang/String;

    .line 479
    .line 480
    sget-object v15, La/j1t0;->b:La/qrq;

    .line 481
    .line 482
    sget-wide v12, La/qmk;->u:J

    .line 483
    .line 484
    sget-wide v21, La/qmk;->H:J

    .line 485
    .line 486
    new-instance v9, La/y9q0;

    .line 487
    .line 488
    const/16 v20, 0x0

    .line 489
    .line 490
    const v23, 0xfdffdd

    .line 491
    .line 492
    .line 493
    const-wide/16 v10, 0x0

    .line 494
    .line 495
    const/4 v14, 0x0

    .line 496
    const-wide/16 v16, 0x0

    .line 497
    .line 498
    const/16 v18, 0x0

    .line 499
    .line 500
    const/16 v19, 0x0

    .line 501
    .line 502
    invoke-direct/range {v9 .. v23}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 503
    .line 504
    .line 505
    sget-object v0, La/zaq0;->b:La/zfn;

    .line 506
    .line 507
    invoke-virtual {v1, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 512
    .line 513
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 514
    .line 515
    .line 516
    move-result-wide v2

    .line 517
    new-instance v0, La/f2q0;

    .line 518
    .line 519
    const/4 v4, 0x3

    .line 520
    invoke-direct {v0, v4}, La/f2q0;-><init>(I)V

    .line 521
    .line 522
    .line 523
    const/16 v30, 0x6180

    .line 524
    .line 525
    const v31, 0x1abf8

    .line 526
    .line 527
    .line 528
    const/4 v11, 0x0

    .line 529
    const-wide/16 v12, 0x0

    .line 530
    .line 531
    const/4 v15, 0x0

    .line 532
    const/16 v16, 0x0

    .line 533
    .line 534
    const-wide/16 v17, 0x0

    .line 535
    .line 536
    const-wide/16 v20, 0x0

    .line 537
    .line 538
    const/16 v22, 0x2

    .line 539
    .line 540
    const/16 v23, 0x0

    .line 541
    .line 542
    const/16 v24, 0x1

    .line 543
    .line 544
    const/16 v25, 0x0

    .line 545
    .line 546
    const/16 v26, 0x0

    .line 547
    .line 548
    const/16 v29, 0x0

    .line 549
    .line 550
    move-object/from16 v19, v0

    .line 551
    .line 552
    move-object/from16 v28, v1

    .line 553
    .line 554
    move-object/from16 v27, v9

    .line 555
    .line 556
    move-wide v9, v2

    .line 557
    invoke-static/range {v7 .. v31}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 558
    .line 559
    .line 560
    goto :goto_5

    .line 561
    :cond_b
    move-object/from16 v28, v1

    .line 562
    .line 563
    invoke-virtual/range {v28 .. v28}, La/fet;->X()V

    .line 564
    .line 565
    .line 566
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 567
    .line 568
    return-object v0

    .line 569
    :pswitch_b
    check-cast v0, La/pnu0;

    .line 570
    .line 571
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 572
    .line 573
    move-object/from16 v1, p1

    .line 574
    .line 575
    check-cast v1, La/fet;

    .line 576
    .line 577
    move-object/from16 v2, p2

    .line 578
    .line 579
    check-cast v2, Ljava/lang/Integer;

    .line 580
    .line 581
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 582
    .line 583
    .line 584
    invoke-static {v5}, La/x8x;->L(I)I

    .line 585
    .line 586
    .line 587
    move-result v2

    .line 588
    invoke-static {v0, v6, v1, v2}, La/uc9;->Q(La/pnu0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 589
    .line 590
    .line 591
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 592
    .line 593
    return-object v0

    .line 594
    nop

    .line 595
    :pswitch_data_0
    .packed-switch 0x0
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
