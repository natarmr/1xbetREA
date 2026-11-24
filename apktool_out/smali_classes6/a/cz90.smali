.class public final synthetic La/cz90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/cz90;->a:B

    iput-object p1, p0, La/cz90;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;IB)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/cz90;->a:B

    iput-object p1, p0, La/cz90;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/cz90;->a:B

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    const/4 v3, 0x0

    .line 7
    sget-object v4, La/ukd;->a:La/cl5;

    .line 8
    .line 9
    const/4 v5, 0x2

    .line 10
    const/4 v6, 0x3

    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v8, 0x1

    .line 13
    iget-object v0, v0, La/cz90;->b:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v0, La/rma0;

    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, La/fet;

    .line 23
    .line 24
    move-object/from16 v2, p2

    .line 25
    .line 26
    check-cast v2, Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {v8}, La/x8x;->L(I)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-static {v0, v1, v2}, La/ahy;->I(La/rma0;La/fet;I)V

    .line 36
    .line 37
    .line 38
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object v0

    .line 41
    :pswitch_0
    move-object v10, v0

    .line 42
    check-cast v10, La/ema0;

    .line 43
    .line 44
    iget-object v0, v10, La/ema0;->P1:La/a8z;

    .line 45
    .line 46
    move-object/from16 v1, p1

    .line 47
    .line 48
    check-cast v1, La/fet;

    .line 49
    .line 50
    move-object/from16 v2, p2

    .line 51
    .line 52
    check-cast v2, Ljava/lang/Integer;

    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    sget-object v3, La/ema0;->R1:La/xi70;

    .line 59
    .line 60
    and-int/lit8 v3, v2, 0x3

    .line 61
    .line 62
    if-eq v3, v5, :cond_0

    .line 63
    .line 64
    move v3, v8

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    move v3, v7

    .line 67
    :goto_0
    and-int/2addr v2, v8

    .line 68
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_5

    .line 73
    .line 74
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    check-cast v2, La/k3t0;

    .line 79
    .line 80
    check-cast v2, La/i3t0;

    .line 81
    .line 82
    invoke-virtual {v2}, La/i3t0;->C()La/gmq;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v1, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    if-nez v3, :cond_1

    .line 95
    .line 96
    if-ne v5, v4, :cond_2

    .line 97
    .line 98
    :cond_1
    new-instance v8, La/hi70;

    .line 99
    .line 100
    const/4 v14, 0x4

    .line 101
    const/16 v15, 0x16

    .line 102
    .line 103
    const/4 v9, 0x2

    .line 104
    const-class v11, La/ema0;

    .line 105
    .line 106
    const-string v12, "handleSideEffects"

    .line 107
    .line 108
    const-string v13, "handleSideEffects(Lorg/xplatform/statistic/player/impl/player/players_statistic/presentation/models/PlayersStatisticsSideEffect;)V"

    .line 109
    .line 110
    invoke-direct/range {v8 .. v15}, La/hi70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    move-object v5, v8

    .line 117
    :cond_2
    move-object v14, v5

    .line 118
    check-cast v14, Lkotlin/jvm/functions/Function2;

    .line 119
    .line 120
    sget-object v3, La/lkz;->a:La/lkz;

    .line 121
    .line 122
    invoke-static {v10}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 123
    .line 124
    .line 125
    move-result-object v13

    .line 126
    invoke-interface {v13}, La/clz;->x()La/glz;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    new-instance v11, La/ji60;

    .line 135
    .line 136
    move-object v12, v2

    .line 137
    check-cast v12, La/i89;

    .line 138
    .line 139
    const/16 v16, 0x3

    .line 140
    .line 141
    const/4 v15, 0x0

    .line 142
    invoke-direct/range {v11 .. v16}, La/ji60;-><init>(La/i89;La/clz;Lkotlin/jvm/functions/Function2;La/yje;B)V

    .line 143
    .line 144
    .line 145
    invoke-static {v3, v15, v15, v11, v6}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 146
    .line 147
    .line 148
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    check-cast v2, La/k3t0;

    .line 153
    .line 154
    check-cast v2, La/i3t0;

    .line 155
    .line 156
    invoke-virtual {v2, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    move-object v10, v0

    .line 165
    check-cast v10, La/k3t0;

    .line 166
    .line 167
    invoke-virtual {v1, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    if-nez v0, :cond_3

    .line 176
    .line 177
    if-ne v3, v4, :cond_4

    .line 178
    .line 179
    :cond_3
    new-instance v8, La/yi90;

    .line 180
    .line 181
    const/4 v14, 0x0

    .line 182
    const/16 v15, 0x1d

    .line 183
    .line 184
    const/4 v9, 0x1

    .line 185
    const-class v11, La/k3t0;

    .line 186
    .line 187
    const-string v12, "onAction"

    .line 188
    .line 189
    const-string v13, "onAction(Ljava/lang/Object;)V"

    .line 190
    .line 191
    invoke-direct/range {v8 .. v15}, La/yi90;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    move-object v3, v8

    .line 198
    :cond_4
    check-cast v3, La/jhy;

    .line 199
    .line 200
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 201
    .line 202
    invoke-static {v2, v3, v1, v7}, La/ahy;->H(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 203
    .line 204
    .line 205
    goto :goto_1

    .line 206
    :cond_5
    invoke-virtual {v1}, La/fet;->X()V

    .line 207
    .line 208
    .line 209
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 210
    .line 211
    return-object v0

    .line 212
    :pswitch_1
    check-cast v0, La/cma0;

    .line 213
    .line 214
    iget-object v1, v0, La/i3t0;->f:La/oyg0;

    .line 215
    .line 216
    iget-object v0, v0, La/i3t0;->i:La/ocj;

    .line 217
    .line 218
    move-object/from16 v2, p1

    .line 219
    .line 220
    check-cast v2, Ljava/lang/Throwable;

    .line 221
    .line 222
    move-object/from16 v3, p2

    .line 223
    .line 224
    check-cast v3, Ljava/lang/String;

    .line 225
    .line 226
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    instance-of v2, v2, La/ff5;

    .line 233
    .line 234
    if-eqz v2, :cond_7

    .line 235
    .line 236
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 237
    .line 238
    :cond_6
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    move-object v3, v0

    .line 246
    check-cast v3, La/lla0;

    .line 247
    .line 248
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    sget-object v10, La/hko0;->d:La/hko0;

    .line 252
    .line 253
    const/4 v14, 0x0

    .line 254
    const/16 v15, 0x37f

    .line 255
    .line 256
    const/4 v4, 0x0

    .line 257
    const/4 v5, 0x0

    .line 258
    const/4 v6, 0x0

    .line 259
    const/4 v7, 0x0

    .line 260
    const/4 v8, 0x0

    .line 261
    const/4 v9, 0x0

    .line 262
    const/4 v11, 0x0

    .line 263
    const/4 v12, 0x0

    .line 264
    const/4 v13, 0x0

    .line 265
    invoke-static/range {v3 .. v15}, La/lla0;->a(La/lla0;La/hdm0;La/nc5;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ILa/hko0;ZZZZI)La/lla0;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-eqz v0, :cond_6

    .line 274
    .line 275
    goto :goto_2

    .line 276
    :cond_7
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 277
    .line 278
    :cond_8
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    move-object v3, v0

    .line 286
    check-cast v3, La/lla0;

    .line 287
    .line 288
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    const/4 v14, 0x1

    .line 292
    const/16 v15, 0x3ff

    .line 293
    .line 294
    const/4 v4, 0x0

    .line 295
    const/4 v5, 0x0

    .line 296
    const/4 v6, 0x0

    .line 297
    const/4 v7, 0x0

    .line 298
    const/4 v8, 0x0

    .line 299
    const/4 v9, 0x0

    .line 300
    const/4 v10, 0x0

    .line 301
    const/4 v11, 0x0

    .line 302
    const/4 v12, 0x0

    .line 303
    const/4 v13, 0x0

    .line 304
    invoke-static/range {v3 .. v15}, La/lla0;->a(La/lla0;La/hdm0;La/nc5;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ILa/hko0;ZZZZI)La/lla0;

    .line 305
    .line 306
    .line 307
    move-result-object v3

    .line 308
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    if-eqz v0, :cond_8

    .line 313
    .line 314
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 315
    .line 316
    return-object v0

    .line 317
    :pswitch_2
    check-cast v0, La/ola0;

    .line 318
    .line 319
    move-object/from16 v1, p1

    .line 320
    .line 321
    check-cast v1, La/fet;

    .line 322
    .line 323
    move-object/from16 v2, p2

    .line 324
    .line 325
    check-cast v2, Ljava/lang/Integer;

    .line 326
    .line 327
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 328
    .line 329
    .line 330
    move-result v2

    .line 331
    and-int/lit8 v3, v2, 0x3

    .line 332
    .line 333
    if-eq v3, v5, :cond_9

    .line 334
    .line 335
    move v3, v8

    .line 336
    goto :goto_3

    .line 337
    :cond_9
    move v3, v7

    .line 338
    :goto_3
    and-int/2addr v2, v8

    .line 339
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 340
    .line 341
    .line 342
    move-result v2

    .line 343
    if-eqz v2, :cond_a

    .line 344
    .line 345
    iget-object v0, v0, La/ola0;->i:La/nla0;

    .line 346
    .line 347
    invoke-static {v0, v1, v7}, La/knx;->t(La/nla0;La/fet;I)V

    .line 348
    .line 349
    .line 350
    goto :goto_4

    .line 351
    :cond_a
    invoke-virtual {v1}, La/fet;->X()V

    .line 352
    .line 353
    .line 354
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 355
    .line 356
    return-object v0

    .line 357
    :pswitch_3
    check-cast v0, La/nla0;

    .line 358
    .line 359
    move-object/from16 v1, p1

    .line 360
    .line 361
    check-cast v1, La/fet;

    .line 362
    .line 363
    move-object/from16 v2, p2

    .line 364
    .line 365
    check-cast v2, Ljava/lang/Integer;

    .line 366
    .line 367
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 368
    .line 369
    .line 370
    invoke-static {v8}, La/x8x;->L(I)I

    .line 371
    .line 372
    .line 373
    move-result v2

    .line 374
    invoke-static {v0, v1, v2}, La/knx;->t(La/nla0;La/fet;I)V

    .line 375
    .line 376
    .line 377
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 378
    .line 379
    return-object v0

    .line 380
    :pswitch_4
    check-cast v0, La/c5g0;

    .line 381
    .line 382
    move-object/from16 v1, p1

    .line 383
    .line 384
    check-cast v1, La/fet;

    .line 385
    .line 386
    move-object/from16 v2, p2

    .line 387
    .line 388
    check-cast v2, Ljava/lang/Integer;

    .line 389
    .line 390
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 391
    .line 392
    .line 393
    invoke-static {v8}, La/x8x;->L(I)I

    .line 394
    .line 395
    .line 396
    move-result v2

    .line 397
    invoke-static {v0, v1, v2}, La/cjx;->C(La/c5g0;La/fet;I)V

    .line 398
    .line 399
    .line 400
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 401
    .line 402
    return-object v0

    .line 403
    :pswitch_5
    check-cast v0, La/n2g0;

    .line 404
    .line 405
    move-object/from16 v1, p1

    .line 406
    .line 407
    check-cast v1, La/fet;

    .line 408
    .line 409
    move-object/from16 v2, p2

    .line 410
    .line 411
    check-cast v2, Ljava/lang/Integer;

    .line 412
    .line 413
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    invoke-static {v8}, La/x8x;->L(I)I

    .line 417
    .line 418
    .line 419
    move-result v2

    .line 420
    invoke-static {v0, v1, v2}, La/cjx;->A(La/n2g0;La/fet;I)V

    .line 421
    .line 422
    .line 423
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 424
    .line 425
    return-object v0

    .line 426
    :pswitch_6
    check-cast v0, La/ala0;

    .line 427
    .line 428
    iget-object v0, v0, La/ala0;->N1:La/a8z;

    .line 429
    .line 430
    move-object/from16 v1, p1

    .line 431
    .line 432
    check-cast v1, La/fet;

    .line 433
    .line 434
    move-object/from16 v2, p2

    .line 435
    .line 436
    check-cast v2, Ljava/lang/Integer;

    .line 437
    .line 438
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 439
    .line 440
    .line 441
    move-result v2

    .line 442
    sget-object v3, La/ala0;->O1:La/mi70;

    .line 443
    .line 444
    and-int/lit8 v3, v2, 0x3

    .line 445
    .line 446
    if-eq v3, v5, :cond_b

    .line 447
    .line 448
    move v3, v8

    .line 449
    goto :goto_5

    .line 450
    :cond_b
    move v3, v7

    .line 451
    :goto_5
    and-int/2addr v2, v8

    .line 452
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 453
    .line 454
    .line 455
    move-result v2

    .line 456
    if-eqz v2, :cond_e

    .line 457
    .line 458
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v2

    .line 462
    check-cast v2, La/k3t0;

    .line 463
    .line 464
    check-cast v2, La/i3t0;

    .line 465
    .line 466
    invoke-virtual {v2, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 467
    .line 468
    .line 469
    move-result-object v2

    .line 470
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    move-object v10, v0

    .line 475
    check-cast v10, La/k3t0;

    .line 476
    .line 477
    invoke-virtual {v1, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 478
    .line 479
    .line 480
    move-result v0

    .line 481
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v3

    .line 485
    if-nez v0, :cond_c

    .line 486
    .line 487
    if-ne v3, v4, :cond_d

    .line 488
    .line 489
    :cond_c
    new-instance v8, La/yi90;

    .line 490
    .line 491
    const/4 v14, 0x0

    .line 492
    const/16 v15, 0x1b

    .line 493
    .line 494
    const/4 v9, 0x1

    .line 495
    const-class v11, La/k3t0;

    .line 496
    .line 497
    const-string v12, "onAction"

    .line 498
    .line 499
    const-string v13, "onAction(Ljava/lang/Object;)V"

    .line 500
    .line 501
    invoke-direct/range {v8 .. v15}, La/yi90;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 502
    .line 503
    .line 504
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 505
    .line 506
    .line 507
    move-object v3, v8

    .line 508
    :cond_d
    check-cast v3, La/jhy;

    .line 509
    .line 510
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 511
    .line 512
    invoke-static {v2, v3, v1, v7}, La/cjx;->z(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 513
    .line 514
    .line 515
    goto :goto_6

    .line 516
    :cond_e
    invoke-virtual {v1}, La/fet;->X()V

    .line 517
    .line 518
    .line 519
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 520
    .line 521
    return-object v0

    .line 522
    :pswitch_7
    move-object v10, v0

    .line 523
    check-cast v10, La/vka0;

    .line 524
    .line 525
    iget-object v0, v10, La/vka0;->P1:La/a8z;

    .line 526
    .line 527
    move-object/from16 v1, p1

    .line 528
    .line 529
    check-cast v1, La/fet;

    .line 530
    .line 531
    move-object/from16 v2, p2

    .line 532
    .line 533
    check-cast v2, Ljava/lang/Integer;

    .line 534
    .line 535
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 536
    .line 537
    .line 538
    move-result v2

    .line 539
    sget-object v3, La/vka0;->R1:La/nh70;

    .line 540
    .line 541
    and-int/lit8 v3, v2, 0x3

    .line 542
    .line 543
    if-eq v3, v5, :cond_f

    .line 544
    .line 545
    move v3, v8

    .line 546
    goto :goto_7

    .line 547
    :cond_f
    move v3, v7

    .line 548
    :goto_7
    and-int/2addr v2, v8

    .line 549
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 550
    .line 551
    .line 552
    move-result v2

    .line 553
    if-eqz v2, :cond_14

    .line 554
    .line 555
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v2

    .line 559
    check-cast v2, La/k3t0;

    .line 560
    .line 561
    check-cast v2, La/i3t0;

    .line 562
    .line 563
    invoke-virtual {v2}, La/i3t0;->C()La/gmq;

    .line 564
    .line 565
    .line 566
    move-result-object v2

    .line 567
    invoke-virtual {v1, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 568
    .line 569
    .line 570
    move-result v3

    .line 571
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v5

    .line 575
    if-nez v3, :cond_10

    .line 576
    .line 577
    if-ne v5, v4, :cond_11

    .line 578
    .line 579
    :cond_10
    new-instance v8, La/hi70;

    .line 580
    .line 581
    const/4 v14, 0x4

    .line 582
    const/16 v15, 0x15

    .line 583
    .line 584
    const/4 v9, 0x2

    .line 585
    const-class v11, La/vka0;

    .line 586
    .line 587
    const-string v12, "handleSideEffects"

    .line 588
    .line 589
    const-string v13, "handleSideEffects(Lorg/xplatform/statistic/player/impl/player/players_statistic_cricket/presentation/models/PlayersStatisticsCricketSideEffect;)V"

    .line 590
    .line 591
    invoke-direct/range {v8 .. v15}, La/hi70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 592
    .line 593
    .line 594
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 595
    .line 596
    .line 597
    move-object v5, v8

    .line 598
    :cond_11
    move-object v14, v5

    .line 599
    check-cast v14, Lkotlin/jvm/functions/Function2;

    .line 600
    .line 601
    sget-object v3, La/lkz;->a:La/lkz;

    .line 602
    .line 603
    invoke-static {v10}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 604
    .line 605
    .line 606
    move-result-object v13

    .line 607
    invoke-interface {v13}, La/clz;->x()La/glz;

    .line 608
    .line 609
    .line 610
    move-result-object v3

    .line 611
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 612
    .line 613
    .line 614
    move-result-object v3

    .line 615
    new-instance v11, La/ji60;

    .line 616
    .line 617
    move-object v12, v2

    .line 618
    check-cast v12, La/i89;

    .line 619
    .line 620
    const/16 v16, 0x2

    .line 621
    .line 622
    const/4 v15, 0x0

    .line 623
    invoke-direct/range {v11 .. v16}, La/ji60;-><init>(La/i89;La/clz;Lkotlin/jvm/functions/Function2;La/yje;B)V

    .line 624
    .line 625
    .line 626
    invoke-static {v3, v15, v15, v11, v6}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 627
    .line 628
    .line 629
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object v2

    .line 633
    check-cast v2, La/k3t0;

    .line 634
    .line 635
    check-cast v2, La/i3t0;

    .line 636
    .line 637
    invoke-virtual {v2, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 638
    .line 639
    .line 640
    move-result-object v2

    .line 641
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 642
    .line 643
    .line 644
    move-result-object v0

    .line 645
    move-object v10, v0

    .line 646
    check-cast v10, La/k3t0;

    .line 647
    .line 648
    invoke-virtual {v1, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 649
    .line 650
    .line 651
    move-result v0

    .line 652
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object v3

    .line 656
    if-nez v0, :cond_12

    .line 657
    .line 658
    if-ne v3, v4, :cond_13

    .line 659
    .line 660
    :cond_12
    new-instance v8, La/yi90;

    .line 661
    .line 662
    const/4 v14, 0x0

    .line 663
    const/16 v15, 0x1a

    .line 664
    .line 665
    const/4 v9, 0x1

    .line 666
    const-class v11, La/k3t0;

    .line 667
    .line 668
    const-string v12, "onAction"

    .line 669
    .line 670
    const-string v13, "onAction(Ljava/lang/Object;)V"

    .line 671
    .line 672
    invoke-direct/range {v8 .. v15}, La/yi90;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 673
    .line 674
    .line 675
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 676
    .line 677
    .line 678
    move-object v3, v8

    .line 679
    :cond_13
    check-cast v3, La/jhy;

    .line 680
    .line 681
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 682
    .line 683
    invoke-static {v2, v3, v1, v7}, La/knx;->E(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 684
    .line 685
    .line 686
    goto :goto_8

    .line 687
    :cond_14
    invoke-virtual {v1}, La/fet;->X()V

    .line 688
    .line 689
    .line 690
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 691
    .line 692
    return-object v0

    .line 693
    :pswitch_8
    check-cast v0, La/xja0;

    .line 694
    .line 695
    iget-object v1, v0, La/i3t0;->f:La/oyg0;

    .line 696
    .line 697
    iget-object v0, v0, La/i3t0;->i:La/ocj;

    .line 698
    .line 699
    move-object/from16 v2, p1

    .line 700
    .line 701
    check-cast v2, Ljava/lang/Throwable;

    .line 702
    .line 703
    move-object/from16 v3, p2

    .line 704
    .line 705
    check-cast v3, Ljava/lang/String;

    .line 706
    .line 707
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 708
    .line 709
    .line 710
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 711
    .line 712
    .line 713
    instance-of v2, v2, La/ff5;

    .line 714
    .line 715
    if-eqz v2, :cond_16

    .line 716
    .line 717
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 718
    .line 719
    :cond_15
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 720
    .line 721
    .line 722
    move-result-object v0

    .line 723
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 724
    .line 725
    .line 726
    move-object v3, v0

    .line 727
    check-cast v3, La/rja0;

    .line 728
    .line 729
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 730
    .line 731
    .line 732
    const/4 v12, 0x0

    .line 733
    const/16 v13, 0x18f

    .line 734
    .line 735
    const/4 v4, 0x0

    .line 736
    const/4 v5, 0x0

    .line 737
    const/4 v6, 0x0

    .line 738
    const/4 v7, 0x0

    .line 739
    const/4 v8, 0x0

    .line 740
    const/4 v9, 0x0

    .line 741
    const/4 v10, 0x1

    .line 742
    const/4 v11, 0x0

    .line 743
    invoke-static/range {v3 .. v13}, La/rja0;->a(La/rja0;La/cca0;ZIZZZZLjava/lang/String;ZI)La/rja0;

    .line 744
    .line 745
    .line 746
    move-result-object v3

    .line 747
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 748
    .line 749
    .line 750
    move-result v0

    .line 751
    if-eqz v0, :cond_15

    .line 752
    .line 753
    goto :goto_9

    .line 754
    :cond_16
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 755
    .line 756
    :cond_17
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 757
    .line 758
    .line 759
    move-result-object v0

    .line 760
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 761
    .line 762
    .line 763
    move-object v3, v0

    .line 764
    check-cast v3, La/rja0;

    .line 765
    .line 766
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 767
    .line 768
    .line 769
    const/4 v12, 0x0

    .line 770
    const/16 v13, 0x18f

    .line 771
    .line 772
    const/4 v4, 0x0

    .line 773
    const/4 v5, 0x0

    .line 774
    const/4 v6, 0x0

    .line 775
    const/4 v7, 0x0

    .line 776
    const/4 v8, 0x0

    .line 777
    const/4 v9, 0x1

    .line 778
    const/4 v10, 0x0

    .line 779
    const/4 v11, 0x0

    .line 780
    invoke-static/range {v3 .. v13}, La/rja0;->a(La/rja0;La/cca0;ZIZZZZLjava/lang/String;ZI)La/rja0;

    .line 781
    .line 782
    .line 783
    move-result-object v3

    .line 784
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 785
    .line 786
    .line 787
    move-result v0

    .line 788
    if-eqz v0, :cond_17

    .line 789
    .line 790
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 791
    .line 792
    return-object v0

    .line 793
    :pswitch_9
    check-cast v0, La/tia0;

    .line 794
    .line 795
    iget-object v0, v0, La/tia0;->P1:La/a8z;

    .line 796
    .line 797
    move-object/from16 v1, p1

    .line 798
    .line 799
    check-cast v1, La/fet;

    .line 800
    .line 801
    move-object/from16 v2, p2

    .line 802
    .line 803
    check-cast v2, Ljava/lang/Integer;

    .line 804
    .line 805
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 806
    .line 807
    .line 808
    move-result v2

    .line 809
    sget-object v6, La/tia0;->R1:La/fl70;

    .line 810
    .line 811
    and-int/lit8 v6, v2, 0x3

    .line 812
    .line 813
    if-eq v6, v5, :cond_18

    .line 814
    .line 815
    move v5, v8

    .line 816
    goto :goto_a

    .line 817
    :cond_18
    move v5, v7

    .line 818
    :goto_a
    and-int/2addr v2, v8

    .line 819
    invoke-virtual {v1, v2, v5}, La/fet;->U(IZ)Z

    .line 820
    .line 821
    .line 822
    move-result v2

    .line 823
    if-eqz v2, :cond_1b

    .line 824
    .line 825
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 826
    .line 827
    .line 828
    move-result-object v2

    .line 829
    check-cast v2, La/k3t0;

    .line 830
    .line 831
    check-cast v2, La/i3t0;

    .line 832
    .line 833
    invoke-virtual {v2, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 834
    .line 835
    .line 836
    move-result-object v2

    .line 837
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 838
    .line 839
    .line 840
    move-result-object v0

    .line 841
    move-object v10, v0

    .line 842
    check-cast v10, La/k3t0;

    .line 843
    .line 844
    invoke-virtual {v1, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 845
    .line 846
    .line 847
    move-result v0

    .line 848
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 849
    .line 850
    .line 851
    move-result-object v5

    .line 852
    if-nez v0, :cond_19

    .line 853
    .line 854
    if-ne v5, v4, :cond_1a

    .line 855
    .line 856
    :cond_19
    new-instance v8, La/yi90;

    .line 857
    .line 858
    const/4 v14, 0x0

    .line 859
    const/16 v15, 0x17

    .line 860
    .line 861
    const/4 v9, 0x1

    .line 862
    const-class v11, La/k3t0;

    .line 863
    .line 864
    const-string v12, "onAction"

    .line 865
    .line 866
    const-string v13, "onAction(Ljava/lang/Object;)V"

    .line 867
    .line 868
    invoke-direct/range {v8 .. v15}, La/yi90;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 869
    .line 870
    .line 871
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 872
    .line 873
    .line 874
    move-object v5, v8

    .line 875
    :cond_1a
    check-cast v5, La/jhy;

    .line 876
    .line 877
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 878
    .line 879
    invoke-static {v7, v1, v3, v2, v5}, La/mrv;->T(ILa/fet;La/mm40;La/l7m0;Lkotlin/jvm/functions/Function1;)V

    .line 880
    .line 881
    .line 882
    goto :goto_b

    .line 883
    :cond_1b
    invoke-virtual {v1}, La/fet;->X()V

    .line 884
    .line 885
    .line 886
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 887
    .line 888
    return-object v0

    .line 889
    :pswitch_a
    check-cast v0, La/vja0;

    .line 890
    .line 891
    move-object/from16 v1, p1

    .line 892
    .line 893
    check-cast v1, La/fet;

    .line 894
    .line 895
    move-object/from16 v3, p2

    .line 896
    .line 897
    check-cast v3, Ljava/lang/Integer;

    .line 898
    .line 899
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 900
    .line 901
    .line 902
    invoke-static {v2}, La/x8x;->L(I)I

    .line 903
    .line 904
    .line 905
    move-result v2

    .line 906
    invoke-static {v0, v1, v2}, La/mrv;->R(La/vja0;La/fet;I)V

    .line 907
    .line 908
    .line 909
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 910
    .line 911
    return-object v0

    .line 912
    :pswitch_b
    check-cast v0, La/j9m0;

    .line 913
    .line 914
    move-object/from16 v1, p1

    .line 915
    .line 916
    check-cast v1, La/fet;

    .line 917
    .line 918
    move-object/from16 v2, p2

    .line 919
    .line 920
    check-cast v2, Ljava/lang/Integer;

    .line 921
    .line 922
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 923
    .line 924
    .line 925
    invoke-static {v8}, La/x8x;->L(I)I

    .line 926
    .line 927
    .line 928
    move-result v2

    .line 929
    invoke-static {v0, v1, v2}, La/mrv;->Y(La/j9m0;La/fet;I)V

    .line 930
    .line 931
    .line 932
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 933
    .line 934
    return-object v0

    .line 935
    :pswitch_c
    check-cast v0, La/iha0;

    .line 936
    .line 937
    iget-object v1, v0, La/i3t0;->f:La/oyg0;

    .line 938
    .line 939
    iget-object v0, v0, La/i3t0;->i:La/ocj;

    .line 940
    .line 941
    move-object/from16 v2, p1

    .line 942
    .line 943
    check-cast v2, Ljava/lang/Throwable;

    .line 944
    .line 945
    move-object/from16 v3, p2

    .line 946
    .line 947
    check-cast v3, Ljava/lang/String;

    .line 948
    .line 949
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 950
    .line 951
    .line 952
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 953
    .line 954
    .line 955
    instance-of v2, v2, La/ff5;

    .line 956
    .line 957
    if-eqz v2, :cond_1d

    .line 958
    .line 959
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 960
    .line 961
    :cond_1c
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 962
    .line 963
    .line 964
    move-result-object v0

    .line 965
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 966
    .line 967
    .line 968
    move-object v3, v0

    .line 969
    check-cast v3, La/dha0;

    .line 970
    .line 971
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 972
    .line 973
    .line 974
    const/4 v7, 0x0

    .line 975
    const/4 v8, 0x1

    .line 976
    const/4 v4, 0x0

    .line 977
    const/4 v5, 0x0

    .line 978
    const/4 v6, 0x1

    .line 979
    invoke-static/range {v3 .. v8}, La/dha0;->a(La/dha0;La/cca0;ZZZI)La/dha0;

    .line 980
    .line 981
    .line 982
    move-result-object v3

    .line 983
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 984
    .line 985
    .line 986
    move-result v0

    .line 987
    if-eqz v0, :cond_1c

    .line 988
    .line 989
    goto :goto_c

    .line 990
    :cond_1d
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 991
    .line 992
    :cond_1e
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 993
    .line 994
    .line 995
    move-result-object v0

    .line 996
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 997
    .line 998
    .line 999
    move-object v3, v0

    .line 1000
    check-cast v3, La/dha0;

    .line 1001
    .line 1002
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1003
    .line 1004
    .line 1005
    const/4 v7, 0x1

    .line 1006
    const/4 v8, 0x1

    .line 1007
    const/4 v4, 0x0

    .line 1008
    const/4 v5, 0x0

    .line 1009
    const/4 v6, 0x0

    .line 1010
    invoke-static/range {v3 .. v8}, La/dha0;->a(La/dha0;La/cca0;ZZZI)La/dha0;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v3

    .line 1014
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1015
    .line 1016
    .line 1017
    move-result v0

    .line 1018
    if-eqz v0, :cond_1e

    .line 1019
    .line 1020
    :goto_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1021
    .line 1022
    return-object v0

    .line 1023
    :pswitch_d
    check-cast v0, La/cha0;

    .line 1024
    .line 1025
    iget-object v0, v0, La/cha0;->N1:La/a8z;

    .line 1026
    .line 1027
    move-object/from16 v1, p1

    .line 1028
    .line 1029
    check-cast v1, La/fet;

    .line 1030
    .line 1031
    move-object/from16 v2, p2

    .line 1032
    .line 1033
    check-cast v2, Ljava/lang/Integer;

    .line 1034
    .line 1035
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1036
    .line 1037
    .line 1038
    move-result v2

    .line 1039
    sget-object v6, La/cha0;->P1:La/xi70;

    .line 1040
    .line 1041
    and-int/lit8 v6, v2, 0x3

    .line 1042
    .line 1043
    if-eq v6, v5, :cond_1f

    .line 1044
    .line 1045
    move v5, v8

    .line 1046
    goto :goto_d

    .line 1047
    :cond_1f
    move v5, v7

    .line 1048
    :goto_d
    and-int/2addr v2, v8

    .line 1049
    invoke-virtual {v1, v2, v5}, La/fet;->U(IZ)Z

    .line 1050
    .line 1051
    .line 1052
    move-result v2

    .line 1053
    if-eqz v2, :cond_22

    .line 1054
    .line 1055
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v2

    .line 1059
    check-cast v2, La/k3t0;

    .line 1060
    .line 1061
    check-cast v2, La/i3t0;

    .line 1062
    .line 1063
    invoke-virtual {v2, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v2

    .line 1067
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v0

    .line 1071
    move-object v10, v0

    .line 1072
    check-cast v10, La/k3t0;

    .line 1073
    .line 1074
    invoke-virtual {v1, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1075
    .line 1076
    .line 1077
    move-result v0

    .line 1078
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v5

    .line 1082
    if-nez v0, :cond_20

    .line 1083
    .line 1084
    if-ne v5, v4, :cond_21

    .line 1085
    .line 1086
    :cond_20
    new-instance v8, La/yi90;

    .line 1087
    .line 1088
    const/4 v14, 0x0

    .line 1089
    const/16 v15, 0x14

    .line 1090
    .line 1091
    const/4 v9, 0x1

    .line 1092
    const-class v11, La/k3t0;

    .line 1093
    .line 1094
    const-string v12, "onAction"

    .line 1095
    .line 1096
    const-string v13, "onAction(Ljava/lang/Object;)V"

    .line 1097
    .line 1098
    invoke-direct/range {v8 .. v15}, La/yi90;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1099
    .line 1100
    .line 1101
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1102
    .line 1103
    .line 1104
    move-object v5, v8

    .line 1105
    :cond_21
    check-cast v5, La/jhy;

    .line 1106
    .line 1107
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 1108
    .line 1109
    invoke-static {v7, v1, v3, v2, v5}, La/ntr;->M(ILa/fet;La/mm40;La/l7m0;Lkotlin/jvm/functions/Function1;)V

    .line 1110
    .line 1111
    .line 1112
    goto :goto_e

    .line 1113
    :cond_22
    invoke-virtual {v1}, La/fet;->X()V

    .line 1114
    .line 1115
    .line 1116
    :goto_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1117
    .line 1118
    return-object v0

    .line 1119
    :pswitch_e
    check-cast v0, La/lga0;

    .line 1120
    .line 1121
    move-object/from16 v1, p1

    .line 1122
    .line 1123
    check-cast v1, La/fet;

    .line 1124
    .line 1125
    move-object/from16 v2, p2

    .line 1126
    .line 1127
    check-cast v2, Ljava/lang/Integer;

    .line 1128
    .line 1129
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1130
    .line 1131
    .line 1132
    invoke-static {v8}, La/x8x;->L(I)I

    .line 1133
    .line 1134
    .line 1135
    move-result v2

    .line 1136
    invoke-static {v0, v1, v2}, La/pzw;->m(La/lga0;La/fet;I)V

    .line 1137
    .line 1138
    .line 1139
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1140
    .line 1141
    return-object v0

    .line 1142
    :pswitch_f
    check-cast v0, La/q2a0;

    .line 1143
    .line 1144
    move-object/from16 v1, p1

    .line 1145
    .line 1146
    check-cast v1, La/fet;

    .line 1147
    .line 1148
    move-object/from16 v2, p2

    .line 1149
    .line 1150
    check-cast v2, Ljava/lang/Integer;

    .line 1151
    .line 1152
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1153
    .line 1154
    .line 1155
    invoke-static {v8}, La/x8x;->L(I)I

    .line 1156
    .line 1157
    .line 1158
    move-result v2

    .line 1159
    invoke-static {v0, v1, v2}, La/azw;->o(La/q2a0;La/fet;I)V

    .line 1160
    .line 1161
    .line 1162
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1163
    .line 1164
    return-object v0

    .line 1165
    :pswitch_10
    move-object v3, v0

    .line 1166
    check-cast v3, La/hda0;

    .line 1167
    .line 1168
    move-object/from16 v12, p1

    .line 1169
    .line 1170
    check-cast v12, La/fet;

    .line 1171
    .line 1172
    move-object/from16 v0, p2

    .line 1173
    .line 1174
    check-cast v0, Ljava/lang/Integer;

    .line 1175
    .line 1176
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1177
    .line 1178
    .line 1179
    move-result v0

    .line 1180
    sget-object v1, La/hda0;->R1:La/mi70;

    .line 1181
    .line 1182
    and-int/lit8 v1, v0, 0x3

    .line 1183
    .line 1184
    if-eq v1, v5, :cond_23

    .line 1185
    .line 1186
    move v1, v8

    .line 1187
    goto :goto_f

    .line 1188
    :cond_23
    move v1, v7

    .line 1189
    :goto_f
    and-int/2addr v0, v8

    .line 1190
    invoke-virtual {v12, v0, v1}, La/fet;->U(IZ)Z

    .line 1191
    .line 1192
    .line 1193
    move-result v0

    .line 1194
    if-eqz v0, :cond_2e

    .line 1195
    .line 1196
    invoke-virtual {v12, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1197
    .line 1198
    .line 1199
    move-result v0

    .line 1200
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v1

    .line 1204
    if-nez v0, :cond_24

    .line 1205
    .line 1206
    if-ne v1, v4, :cond_25

    .line 1207
    .line 1208
    :cond_24
    new-instance v1, La/eda0;

    .line 1209
    .line 1210
    invoke-direct {v1, v3, v6}, La/eda0;-><init>(La/hda0;B)V

    .line 1211
    .line 1212
    .line 1213
    invoke-virtual {v12, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1214
    .line 1215
    .line 1216
    :cond_25
    move-object v9, v1

    .line 1217
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 1218
    .line 1219
    invoke-virtual {v12, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1220
    .line 1221
    .line 1222
    move-result v0

    .line 1223
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 1224
    .line 1225
    .line 1226
    move-result-object v1

    .line 1227
    if-nez v0, :cond_26

    .line 1228
    .line 1229
    if-ne v1, v4, :cond_27

    .line 1230
    .line 1231
    :cond_26
    new-instance v1, La/eda0;

    .line 1232
    .line 1233
    const/4 v0, 0x4

    .line 1234
    invoke-direct {v1, v3, v0}, La/eda0;-><init>(La/hda0;B)V

    .line 1235
    .line 1236
    .line 1237
    invoke-virtual {v12, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1238
    .line 1239
    .line 1240
    :cond_27
    move-object v10, v1

    .line 1241
    check-cast v10, Lkotlin/jvm/functions/Function0;

    .line 1242
    .line 1243
    const/4 v13, 0x0

    .line 1244
    const/4 v14, 0x4

    .line 1245
    const/4 v11, 0x0

    .line 1246
    invoke-static/range {v9 .. v14}, La/v3c;->z(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 1247
    .line 1248
    .line 1249
    invoke-virtual {v3}, La/hda0;->G0()La/k3t0;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v0

    .line 1253
    check-cast v0, La/i3t0;

    .line 1254
    .line 1255
    invoke-virtual {v0, v12}, La/i3t0;->y(La/fet;)La/pz40;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v0

    .line 1259
    invoke-virtual {v12, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1260
    .line 1261
    .line 1262
    move-result v1

    .line 1263
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v2

    .line 1267
    if-nez v1, :cond_28

    .line 1268
    .line 1269
    if-ne v2, v4, :cond_29

    .line 1270
    .line 1271
    :cond_28
    new-instance v2, La/fda0;

    .line 1272
    .line 1273
    invoke-direct {v2, v3, v7}, La/fda0;-><init>(La/hda0;B)V

    .line 1274
    .line 1275
    .line 1276
    invoke-virtual {v12, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1277
    .line 1278
    .line 1279
    :cond_29
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 1280
    .line 1281
    invoke-static {v0, v2, v12, v7}, La/eeq;->A(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1282
    .line 1283
    .line 1284
    invoke-virtual {v3}, La/hda0;->G0()La/k3t0;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v2

    .line 1288
    invoke-virtual {v12, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1289
    .line 1290
    .line 1291
    move-result v0

    .line 1292
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v1

    .line 1296
    if-nez v0, :cond_2a

    .line 1297
    .line 1298
    if-ne v1, v4, :cond_2b

    .line 1299
    .line 1300
    :cond_2a
    new-instance v1, La/fda0;

    .line 1301
    .line 1302
    invoke-direct {v1, v3, v8}, La/fda0;-><init>(La/hda0;B)V

    .line 1303
    .line 1304
    .line 1305
    invoke-virtual {v12, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1306
    .line 1307
    .line 1308
    :cond_2b
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 1309
    .line 1310
    sget-object v0, La/lkz;->a:La/lkz;

    .line 1311
    .line 1312
    invoke-static {v1, v12}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v0

    .line 1316
    invoke-virtual {v12, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1317
    .line 1318
    .line 1319
    move-result v1

    .line 1320
    invoke-virtual {v12, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1321
    .line 1322
    .line 1323
    move-result v5

    .line 1324
    or-int/2addr v1, v5

    .line 1325
    invoke-virtual {v12, v6}, La/fet;->e(I)Z

    .line 1326
    .line 1327
    .line 1328
    move-result v5

    .line 1329
    or-int/2addr v1, v5

    .line 1330
    invoke-virtual {v12, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1331
    .line 1332
    .line 1333
    move-result v5

    .line 1334
    or-int/2addr v1, v5

    .line 1335
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v5

    .line 1339
    if-nez v1, :cond_2c

    .line 1340
    .line 1341
    if-ne v5, v4, :cond_2d

    .line 1342
    .line 1343
    :cond_2c
    new-instance v1, La/nu80;

    .line 1344
    .line 1345
    const/4 v5, 0x0

    .line 1346
    const/4 v6, 0x5

    .line 1347
    move-object v4, v0

    .line 1348
    invoke-direct/range {v1 .. v6}, La/nu80;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 1349
    .line 1350
    .line 1351
    invoke-virtual {v12, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1352
    .line 1353
    .line 1354
    move-object v5, v1

    .line 1355
    :cond_2d
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 1356
    .line 1357
    invoke-static {v12, v3, v5}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1358
    .line 1359
    .line 1360
    goto :goto_10

    .line 1361
    :cond_2e
    invoke-virtual {v12}, La/fet;->X()V

    .line 1362
    .line 1363
    .line 1364
    :goto_10
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1365
    .line 1366
    return-object v0

    .line 1367
    :pswitch_11
    move-object v1, v0

    .line 1368
    check-cast v1, La/z7a0;

    .line 1369
    .line 1370
    move-object/from16 v0, p1

    .line 1371
    .line 1372
    check-cast v0, Ljava/lang/Throwable;

    .line 1373
    .line 1374
    move-object/from16 v2, p2

    .line 1375
    .line 1376
    check-cast v2, Ljava/lang/String;

    .line 1377
    .line 1378
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1379
    .line 1380
    .line 1381
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1382
    .line 1383
    .line 1384
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 1385
    .line 1386
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 1387
    .line 1388
    :cond_2f
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v0

    .line 1392
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1393
    .line 1394
    .line 1395
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 1396
    .line 1397
    move-object v4, v0

    .line 1398
    check-cast v4, La/s7a0;

    .line 1399
    .line 1400
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1401
    .line 1402
    .line 1403
    invoke-static {v4, v7, v8}, La/s7a0;->a(La/s7a0;ZZ)La/s7a0;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v3

    .line 1407
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1408
    .line 1409
    .line 1410
    move-result v0

    .line 1411
    if-eqz v0, :cond_2f

    .line 1412
    .line 1413
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1414
    .line 1415
    return-object v0

    .line 1416
    :pswitch_12
    check-cast v0, La/u7a0;

    .line 1417
    .line 1418
    move-object/from16 v1, p1

    .line 1419
    .line 1420
    check-cast v1, La/fet;

    .line 1421
    .line 1422
    move-object/from16 v2, p2

    .line 1423
    .line 1424
    check-cast v2, Ljava/lang/Integer;

    .line 1425
    .line 1426
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1427
    .line 1428
    .line 1429
    invoke-static {v8}, La/x8x;->L(I)I

    .line 1430
    .line 1431
    .line 1432
    move-result v2

    .line 1433
    invoke-static {v0, v1, v2}, La/qjj;->j(La/u7a0;La/fet;I)V

    .line 1434
    .line 1435
    .line 1436
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1437
    .line 1438
    return-object v0

    .line 1439
    :pswitch_13
    check-cast v0, La/q7a0;

    .line 1440
    .line 1441
    iget-object v0, v0, La/q7a0;->N1:La/a8z;

    .line 1442
    .line 1443
    move-object/from16 v1, p1

    .line 1444
    .line 1445
    check-cast v1, La/fet;

    .line 1446
    .line 1447
    move-object/from16 v2, p2

    .line 1448
    .line 1449
    check-cast v2, Ljava/lang/Integer;

    .line 1450
    .line 1451
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1452
    .line 1453
    .line 1454
    move-result v2

    .line 1455
    sget-object v3, La/q7a0;->P1:La/fl70;

    .line 1456
    .line 1457
    and-int/lit8 v3, v2, 0x3

    .line 1458
    .line 1459
    if-eq v3, v5, :cond_30

    .line 1460
    .line 1461
    move v3, v8

    .line 1462
    goto :goto_11

    .line 1463
    :cond_30
    move v3, v7

    .line 1464
    :goto_11
    and-int/2addr v2, v8

    .line 1465
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 1466
    .line 1467
    .line 1468
    move-result v2

    .line 1469
    if-eqz v2, :cond_33

    .line 1470
    .line 1471
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1472
    .line 1473
    .line 1474
    move-result-object v2

    .line 1475
    check-cast v2, La/k3t0;

    .line 1476
    .line 1477
    check-cast v2, La/i3t0;

    .line 1478
    .line 1479
    invoke-virtual {v2, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 1480
    .line 1481
    .line 1482
    move-result-object v2

    .line 1483
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1484
    .line 1485
    .line 1486
    move-result-object v0

    .line 1487
    move-object v10, v0

    .line 1488
    check-cast v10, La/k3t0;

    .line 1489
    .line 1490
    invoke-virtual {v1, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1491
    .line 1492
    .line 1493
    move-result v0

    .line 1494
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1495
    .line 1496
    .line 1497
    move-result-object v3

    .line 1498
    if-nez v0, :cond_31

    .line 1499
    .line 1500
    if-ne v3, v4, :cond_32

    .line 1501
    .line 1502
    :cond_31
    new-instance v8, La/yi90;

    .line 1503
    .line 1504
    const/4 v14, 0x0

    .line 1505
    const/16 v15, 0x13

    .line 1506
    .line 1507
    const/4 v9, 0x1

    .line 1508
    const-class v11, La/k3t0;

    .line 1509
    .line 1510
    const-string v12, "onAction"

    .line 1511
    .line 1512
    const-string v13, "onAction(Ljava/lang/Object;)V"

    .line 1513
    .line 1514
    invoke-direct/range {v8 .. v15}, La/yi90;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1515
    .line 1516
    .line 1517
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1518
    .line 1519
    .line 1520
    move-object v3, v8

    .line 1521
    :cond_32
    check-cast v3, La/jhy;

    .line 1522
    .line 1523
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 1524
    .line 1525
    invoke-static {v2, v3, v1, v7}, La/qjj;->F(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1526
    .line 1527
    .line 1528
    goto :goto_12

    .line 1529
    :cond_33
    invoke-virtual {v1}, La/fet;->X()V

    .line 1530
    .line 1531
    .line 1532
    :goto_12
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1533
    .line 1534
    return-object v0

    .line 1535
    :pswitch_14
    check-cast v0, La/r5a0;

    .line 1536
    .line 1537
    iget-object v0, v0, La/r5a0;->R1:La/a8z;

    .line 1538
    .line 1539
    move-object/from16 v1, p1

    .line 1540
    .line 1541
    check-cast v1, La/fet;

    .line 1542
    .line 1543
    move-object/from16 v2, p2

    .line 1544
    .line 1545
    check-cast v2, Ljava/lang/Integer;

    .line 1546
    .line 1547
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1548
    .line 1549
    .line 1550
    move-result v2

    .line 1551
    sget-object v3, La/r5a0;->S1:La/mi70;

    .line 1552
    .line 1553
    and-int/lit8 v3, v2, 0x3

    .line 1554
    .line 1555
    if-eq v3, v5, :cond_34

    .line 1556
    .line 1557
    move v3, v8

    .line 1558
    goto :goto_13

    .line 1559
    :cond_34
    move v3, v7

    .line 1560
    :goto_13
    and-int/2addr v2, v8

    .line 1561
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 1562
    .line 1563
    .line 1564
    move-result v2

    .line 1565
    if-eqz v2, :cond_37

    .line 1566
    .line 1567
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v2

    .line 1571
    check-cast v2, La/k3t0;

    .line 1572
    .line 1573
    check-cast v2, La/i3t0;

    .line 1574
    .line 1575
    invoke-virtual {v2, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 1576
    .line 1577
    .line 1578
    move-result-object v2

    .line 1579
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1580
    .line 1581
    .line 1582
    move-result-object v0

    .line 1583
    move-object v10, v0

    .line 1584
    check-cast v10, La/k3t0;

    .line 1585
    .line 1586
    invoke-virtual {v1, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1587
    .line 1588
    .line 1589
    move-result v0

    .line 1590
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1591
    .line 1592
    .line 1593
    move-result-object v3

    .line 1594
    if-nez v0, :cond_35

    .line 1595
    .line 1596
    if-ne v3, v4, :cond_36

    .line 1597
    .line 1598
    :cond_35
    new-instance v8, La/yi90;

    .line 1599
    .line 1600
    const/4 v14, 0x0

    .line 1601
    const/16 v15, 0x11

    .line 1602
    .line 1603
    const/4 v9, 0x1

    .line 1604
    const-class v11, La/k3t0;

    .line 1605
    .line 1606
    const-string v12, "onAction"

    .line 1607
    .line 1608
    const-string v13, "onAction(Ljava/lang/Object;)V"

    .line 1609
    .line 1610
    invoke-direct/range {v8 .. v15}, La/yi90;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1611
    .line 1612
    .line 1613
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1614
    .line 1615
    .line 1616
    move-object v3, v8

    .line 1617
    :cond_36
    check-cast v3, La/jhy;

    .line 1618
    .line 1619
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 1620
    .line 1621
    invoke-static {v2, v3, v1, v7}, La/saj;->F(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1622
    .line 1623
    .line 1624
    goto :goto_14

    .line 1625
    :cond_37
    invoke-virtual {v1}, La/fet;->X()V

    .line 1626
    .line 1627
    .line 1628
    :goto_14
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1629
    .line 1630
    return-object v0

    .line 1631
    :pswitch_15
    move-object v1, v0

    .line 1632
    check-cast v1, La/u3a0;

    .line 1633
    .line 1634
    move-object/from16 v0, p1

    .line 1635
    .line 1636
    check-cast v0, Ljava/lang/Throwable;

    .line 1637
    .line 1638
    move-object/from16 v2, p2

    .line 1639
    .line 1640
    check-cast v2, Ljava/lang/String;

    .line 1641
    .line 1642
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1643
    .line 1644
    .line 1645
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1646
    .line 1647
    .line 1648
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 1649
    .line 1650
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 1651
    .line 1652
    :cond_38
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1653
    .line 1654
    .line 1655
    move-result-object v0

    .line 1656
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1657
    .line 1658
    .line 1659
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 1660
    .line 1661
    move-object v4, v0

    .line 1662
    check-cast v4, La/n3a0;

    .line 1663
    .line 1664
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1665
    .line 1666
    .line 1667
    const/4 v10, 0x1

    .line 1668
    const/16 v11, 0xf

    .line 1669
    .line 1670
    const/4 v5, 0x0

    .line 1671
    const/4 v6, 0x0

    .line 1672
    const/4 v7, 0x0

    .line 1673
    const/4 v8, 0x0

    .line 1674
    const/4 v9, 0x0

    .line 1675
    invoke-static/range {v4 .. v11}, La/n3a0;->a(La/n3a0;La/vgn;IIIZZI)La/n3a0;

    .line 1676
    .line 1677
    .line 1678
    move-result-object v3

    .line 1679
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1680
    .line 1681
    .line 1682
    move-result v0

    .line 1683
    if-eqz v0, :cond_38

    .line 1684
    .line 1685
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1686
    .line 1687
    return-object v0

    .line 1688
    :pswitch_16
    check-cast v0, La/h3a0;

    .line 1689
    .line 1690
    move-object/from16 v1, p1

    .line 1691
    .line 1692
    check-cast v1, La/fet;

    .line 1693
    .line 1694
    move-object/from16 v2, p2

    .line 1695
    .line 1696
    check-cast v2, Ljava/lang/Integer;

    .line 1697
    .line 1698
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1699
    .line 1700
    .line 1701
    invoke-static {v8}, La/x8x;->L(I)I

    .line 1702
    .line 1703
    .line 1704
    move-result v2

    .line 1705
    invoke-static {v0, v1, v2}, La/x8f;->j(La/h3a0;La/fet;I)V

    .line 1706
    .line 1707
    .line 1708
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1709
    .line 1710
    return-object v0

    .line 1711
    :pswitch_17
    check-cast v0, La/m1e0;

    .line 1712
    .line 1713
    move-object/from16 v1, p1

    .line 1714
    .line 1715
    check-cast v1, La/fet;

    .line 1716
    .line 1717
    move-object/from16 v2, p2

    .line 1718
    .line 1719
    check-cast v2, Ljava/lang/Integer;

    .line 1720
    .line 1721
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1722
    .line 1723
    .line 1724
    invoke-static {v8}, La/x8x;->L(I)I

    .line 1725
    .line 1726
    .line 1727
    move-result v2

    .line 1728
    invoke-static {v0, v1, v2}, La/x8f;->K(La/m1e0;La/fet;I)V

    .line 1729
    .line 1730
    .line 1731
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1732
    .line 1733
    return-object v0

    .line 1734
    :pswitch_18
    check-cast v0, La/j3a0;

    .line 1735
    .line 1736
    iget-object v0, v0, La/j3a0;->N1:La/a8z;

    .line 1737
    .line 1738
    move-object/from16 v1, p1

    .line 1739
    .line 1740
    check-cast v1, La/fet;

    .line 1741
    .line 1742
    move-object/from16 v2, p2

    .line 1743
    .line 1744
    check-cast v2, Ljava/lang/Integer;

    .line 1745
    .line 1746
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1747
    .line 1748
    .line 1749
    move-result v2

    .line 1750
    sget-object v3, La/j3a0;->P1:La/jh70;

    .line 1751
    .line 1752
    and-int/lit8 v3, v2, 0x3

    .line 1753
    .line 1754
    if-eq v3, v5, :cond_39

    .line 1755
    .line 1756
    move v3, v8

    .line 1757
    goto :goto_15

    .line 1758
    :cond_39
    move v3, v7

    .line 1759
    :goto_15
    and-int/2addr v2, v8

    .line 1760
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 1761
    .line 1762
    .line 1763
    move-result v2

    .line 1764
    if-eqz v2, :cond_3c

    .line 1765
    .line 1766
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1767
    .line 1768
    .line 1769
    move-result-object v2

    .line 1770
    check-cast v2, La/k3t0;

    .line 1771
    .line 1772
    check-cast v2, La/i3t0;

    .line 1773
    .line 1774
    invoke-virtual {v2, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 1775
    .line 1776
    .line 1777
    move-result-object v2

    .line 1778
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1779
    .line 1780
    .line 1781
    move-result-object v0

    .line 1782
    move-object v10, v0

    .line 1783
    check-cast v10, La/k3t0;

    .line 1784
    .line 1785
    invoke-virtual {v1, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1786
    .line 1787
    .line 1788
    move-result v0

    .line 1789
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1790
    .line 1791
    .line 1792
    move-result-object v3

    .line 1793
    if-nez v0, :cond_3a

    .line 1794
    .line 1795
    if-ne v3, v4, :cond_3b

    .line 1796
    .line 1797
    :cond_3a
    new-instance v8, La/yi90;

    .line 1798
    .line 1799
    const/4 v14, 0x0

    .line 1800
    const/16 v15, 0xf

    .line 1801
    .line 1802
    const/4 v9, 0x1

    .line 1803
    const-class v11, La/k3t0;

    .line 1804
    .line 1805
    const-string v12, "onAction"

    .line 1806
    .line 1807
    const-string v13, "onAction(Ljava/lang/Object;)V"

    .line 1808
    .line 1809
    invoke-direct/range {v8 .. v15}, La/yi90;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1810
    .line 1811
    .line 1812
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1813
    .line 1814
    .line 1815
    move-object v3, v8

    .line 1816
    :cond_3b
    check-cast v3, La/jhy;

    .line 1817
    .line 1818
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 1819
    .line 1820
    invoke-static {v2, v3, v1, v7}, La/x8f;->H(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1821
    .line 1822
    .line 1823
    goto :goto_16

    .line 1824
    :cond_3c
    invoke-virtual {v1}, La/fet;->X()V

    .line 1825
    .line 1826
    .line 1827
    :goto_16
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1828
    .line 1829
    return-object v0

    .line 1830
    :pswitch_19
    move-object v9, v0

    .line 1831
    check-cast v9, La/z1a0;

    .line 1832
    .line 1833
    move-object/from16 v0, p1

    .line 1834
    .line 1835
    check-cast v0, La/fet;

    .line 1836
    .line 1837
    move-object/from16 v1, p2

    .line 1838
    .line 1839
    check-cast v1, Ljava/lang/Integer;

    .line 1840
    .line 1841
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1842
    .line 1843
    .line 1844
    move-result v1

    .line 1845
    sget-object v3, La/z1a0;->U1:La/fl70;

    .line 1846
    .line 1847
    and-int/lit8 v3, v1, 0x3

    .line 1848
    .line 1849
    if-eq v3, v5, :cond_3d

    .line 1850
    .line 1851
    move v7, v8

    .line 1852
    :cond_3d
    and-int/2addr v1, v8

    .line 1853
    invoke-virtual {v0, v1, v7}, La/fet;->U(IZ)Z

    .line 1854
    .line 1855
    .line 1856
    move-result v1

    .line 1857
    if-eqz v1, :cond_44

    .line 1858
    .line 1859
    invoke-virtual {v9}, La/z1a0;->G0()La/k3t0;

    .line 1860
    .line 1861
    .line 1862
    move-result-object v1

    .line 1863
    check-cast v1, La/i3t0;

    .line 1864
    .line 1865
    invoke-virtual {v1, v0}, La/i3t0;->y(La/fet;)La/pz40;

    .line 1866
    .line 1867
    .line 1868
    move-result-object v1

    .line 1869
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1870
    .line 1871
    .line 1872
    move-result-object v1

    .line 1873
    check-cast v1, La/x2a0;

    .line 1874
    .line 1875
    invoke-virtual {v9}, La/z1a0;->G0()La/k3t0;

    .line 1876
    .line 1877
    .line 1878
    move-result-object v3

    .line 1879
    invoke-virtual {v0, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1880
    .line 1881
    .line 1882
    move-result v5

    .line 1883
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1884
    .line 1885
    .line 1886
    move-result-object v7

    .line 1887
    if-nez v5, :cond_3e

    .line 1888
    .line 1889
    if-ne v7, v4, :cond_3f

    .line 1890
    .line 1891
    :cond_3e
    new-instance v7, La/yi90;

    .line 1892
    .line 1893
    const/4 v13, 0x0

    .line 1894
    const/16 v14, 0xd

    .line 1895
    .line 1896
    const/4 v8, 0x1

    .line 1897
    const-class v10, La/z1a0;

    .line 1898
    .line 1899
    const-string v11, "handleSideEffect"

    .line 1900
    .line 1901
    const-string v12, "handleSideEffect(Lorg/xplatform/playersduel/impl/presentation/players_duel/PlayerDuelSideEffect;)V"

    .line 1902
    .line 1903
    invoke-direct/range {v7 .. v14}, La/yi90;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1904
    .line 1905
    .line 1906
    invoke-virtual {v0, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1907
    .line 1908
    .line 1909
    :cond_3f
    check-cast v7, La/jhy;

    .line 1910
    .line 1911
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 1912
    .line 1913
    sget-object v5, La/lkz;->a:La/lkz;

    .line 1914
    .line 1915
    invoke-static {v7, v0}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 1916
    .line 1917
    .line 1918
    move-result-object v8

    .line 1919
    invoke-virtual {v0, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1920
    .line 1921
    .line 1922
    move-result v5

    .line 1923
    invoke-virtual {v0, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1924
    .line 1925
    .line 1926
    move-result v7

    .line 1927
    or-int/2addr v5, v7

    .line 1928
    invoke-virtual {v0, v6}, La/fet;->e(I)Z

    .line 1929
    .line 1930
    .line 1931
    move-result v6

    .line 1932
    or-int/2addr v5, v6

    .line 1933
    invoke-virtual {v0, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1934
    .line 1935
    .line 1936
    move-result v6

    .line 1937
    or-int/2addr v5, v6

    .line 1938
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1939
    .line 1940
    .line 1941
    move-result-object v6

    .line 1942
    if-nez v5, :cond_41

    .line 1943
    .line 1944
    if-ne v6, v4, :cond_40

    .line 1945
    .line 1946
    goto :goto_17

    .line 1947
    :cond_40
    move-object v7, v9

    .line 1948
    goto :goto_18

    .line 1949
    :cond_41
    :goto_17
    new-instance v5, La/nu80;

    .line 1950
    .line 1951
    move-object v7, v9

    .line 1952
    const/4 v9, 0x0

    .line 1953
    const/4 v10, 0x4

    .line 1954
    move-object v6, v3

    .line 1955
    invoke-direct/range {v5 .. v10}, La/nu80;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 1956
    .line 1957
    .line 1958
    invoke-virtual {v0, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1959
    .line 1960
    .line 1961
    move-object v6, v5

    .line 1962
    :goto_18
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 1963
    .line 1964
    invoke-static {v0, v7, v6}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1965
    .line 1966
    .line 1967
    invoke-virtual {v7}, La/z1a0;->G0()La/k3t0;

    .line 1968
    .line 1969
    .line 1970
    move-result-object v10

    .line 1971
    invoke-virtual {v0, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1972
    .line 1973
    .line 1974
    move-result v3

    .line 1975
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1976
    .line 1977
    .line 1978
    move-result-object v5

    .line 1979
    if-nez v3, :cond_42

    .line 1980
    .line 1981
    if-ne v5, v4, :cond_43

    .line 1982
    .line 1983
    :cond_42
    new-instance v8, La/yi90;

    .line 1984
    .line 1985
    const/4 v14, 0x0

    .line 1986
    const/16 v15, 0xe

    .line 1987
    .line 1988
    const/4 v9, 0x1

    .line 1989
    const-class v11, La/k3t0;

    .line 1990
    .line 1991
    const-string v12, "onAction"

    .line 1992
    .line 1993
    const-string v13, "onAction(Ljava/lang/Object;)V"

    .line 1994
    .line 1995
    invoke-direct/range {v8 .. v15}, La/yi90;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1996
    .line 1997
    .line 1998
    invoke-virtual {v0, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1999
    .line 2000
    .line 2001
    move-object v5, v8

    .line 2002
    :cond_43
    check-cast v5, La/jhy;

    .line 2003
    .line 2004
    move-object v12, v5

    .line 2005
    check-cast v12, Lkotlin/jvm/functions/Function1;

    .line 2006
    .line 2007
    new-instance v3, La/csw;

    .line 2008
    .line 2009
    invoke-direct {v3, v7, v2}, La/csw;-><init>(Ljava/lang/Object;B)V

    .line 2010
    .line 2011
    .line 2012
    const v2, 0x22f5f474

    .line 2013
    .line 2014
    .line 2015
    invoke-static {v2, v3, v0}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 2016
    .line 2017
    .line 2018
    move-result-object v13

    .line 2019
    const/16 v15, 0xc00

    .line 2020
    .line 2021
    const/4 v10, 0x0

    .line 2022
    move-object v14, v0

    .line 2023
    move-object v11, v1

    .line 2024
    invoke-static/range {v10 .. v15}, La/g2a0;->a(La/mm40;La/x2a0;Lkotlin/jvm/functions/Function1;La/ugd;La/fet;I)V

    .line 2025
    .line 2026
    .line 2027
    goto :goto_19

    .line 2028
    :cond_44
    move-object v14, v0

    .line 2029
    invoke-virtual {v14}, La/fet;->X()V

    .line 2030
    .line 2031
    .line 2032
    :goto_19
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2033
    .line 2034
    return-object v0

    .line 2035
    :pswitch_1a
    check-cast v0, La/r0a0;

    .line 2036
    .line 2037
    move-object/from16 v1, p1

    .line 2038
    .line 2039
    check-cast v1, Ljava/lang/Throwable;

    .line 2040
    .line 2041
    move-object/from16 v2, p2

    .line 2042
    .line 2043
    check-cast v2, Ljava/lang/String;

    .line 2044
    .line 2045
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2046
    .line 2047
    .line 2048
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2049
    .line 2050
    .line 2051
    instance-of v1, v1, La/ff5;

    .line 2052
    .line 2053
    if-eqz v1, :cond_45

    .line 2054
    .line 2055
    new-instance v1, La/so90;

    .line 2056
    .line 2057
    const/16 v2, 0x10

    .line 2058
    .line 2059
    invoke-direct {v1, v2}, La/so90;-><init>(B)V

    .line 2060
    .line 2061
    .line 2062
    invoke-virtual {v0, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 2063
    .line 2064
    .line 2065
    goto :goto_1a

    .line 2066
    :cond_45
    new-instance v1, La/so90;

    .line 2067
    .line 2068
    const/16 v2, 0x11

    .line 2069
    .line 2070
    invoke-direct {v1, v2}, La/so90;-><init>(B)V

    .line 2071
    .line 2072
    .line 2073
    invoke-virtual {v0, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 2074
    .line 2075
    .line 2076
    :goto_1a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2077
    .line 2078
    return-object v0

    .line 2079
    :pswitch_1b
    check-cast v0, La/f0a0;

    .line 2080
    .line 2081
    iget-object v0, v0, La/f0a0;->O1:La/a8z;

    .line 2082
    .line 2083
    move-object/from16 v1, p1

    .line 2084
    .line 2085
    check-cast v1, La/fet;

    .line 2086
    .line 2087
    move-object/from16 v2, p2

    .line 2088
    .line 2089
    check-cast v2, Ljava/lang/Integer;

    .line 2090
    .line 2091
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 2092
    .line 2093
    .line 2094
    move-result v2

    .line 2095
    sget-object v3, La/f0a0;->P1:La/xi70;

    .line 2096
    .line 2097
    and-int/lit8 v3, v2, 0x3

    .line 2098
    .line 2099
    if-eq v3, v5, :cond_46

    .line 2100
    .line 2101
    move v3, v8

    .line 2102
    goto :goto_1b

    .line 2103
    :cond_46
    move v3, v7

    .line 2104
    :goto_1b
    and-int/2addr v2, v8

    .line 2105
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 2106
    .line 2107
    .line 2108
    move-result v2

    .line 2109
    if-eqz v2, :cond_49

    .line 2110
    .line 2111
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 2112
    .line 2113
    .line 2114
    move-result-object v2

    .line 2115
    check-cast v2, La/k3t0;

    .line 2116
    .line 2117
    check-cast v2, La/i3t0;

    .line 2118
    .line 2119
    invoke-virtual {v2, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 2120
    .line 2121
    .line 2122
    move-result-object v2

    .line 2123
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 2124
    .line 2125
    .line 2126
    move-result-object v0

    .line 2127
    move-object v10, v0

    .line 2128
    check-cast v10, La/k3t0;

    .line 2129
    .line 2130
    invoke-virtual {v1, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2131
    .line 2132
    .line 2133
    move-result v0

    .line 2134
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 2135
    .line 2136
    .line 2137
    move-result-object v3

    .line 2138
    if-nez v0, :cond_47

    .line 2139
    .line 2140
    if-ne v3, v4, :cond_48

    .line 2141
    .line 2142
    :cond_47
    new-instance v8, La/yi90;

    .line 2143
    .line 2144
    const/4 v14, 0x0

    .line 2145
    const/16 v15, 0xb

    .line 2146
    .line 2147
    const/4 v9, 0x1

    .line 2148
    const-class v11, La/k3t0;

    .line 2149
    .line 2150
    const-string v12, "onAction"

    .line 2151
    .line 2152
    const-string v13, "onAction(Ljava/lang/Object;)V"

    .line 2153
    .line 2154
    invoke-direct/range {v8 .. v15}, La/yi90;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2155
    .line 2156
    .line 2157
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2158
    .line 2159
    .line 2160
    move-object v3, v8

    .line 2161
    :cond_48
    check-cast v3, La/jhy;

    .line 2162
    .line 2163
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 2164
    .line 2165
    invoke-static {v2, v3, v1, v7}, La/o2e;->H(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 2166
    .line 2167
    .line 2168
    goto :goto_1c

    .line 2169
    :cond_49
    invoke-virtual {v1}, La/fet;->X()V

    .line 2170
    .line 2171
    .line 2172
    :goto_1c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2173
    .line 2174
    return-object v0

    .line 2175
    :pswitch_1c
    check-cast v0, La/ez90;

    .line 2176
    .line 2177
    iget-object v0, v0, La/ez90;->M1:La/a8z;

    .line 2178
    .line 2179
    move-object/from16 v1, p1

    .line 2180
    .line 2181
    check-cast v1, La/fet;

    .line 2182
    .line 2183
    move-object/from16 v2, p2

    .line 2184
    .line 2185
    check-cast v2, Ljava/lang/Integer;

    .line 2186
    .line 2187
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 2188
    .line 2189
    .line 2190
    move-result v2

    .line 2191
    sget-object v3, La/ez90;->P1:La/mi70;

    .line 2192
    .line 2193
    and-int/lit8 v3, v2, 0x3

    .line 2194
    .line 2195
    if-eq v3, v5, :cond_4a

    .line 2196
    .line 2197
    move v3, v8

    .line 2198
    goto :goto_1d

    .line 2199
    :cond_4a
    move v3, v7

    .line 2200
    :goto_1d
    and-int/2addr v2, v8

    .line 2201
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 2202
    .line 2203
    .line 2204
    move-result v2

    .line 2205
    if-eqz v2, :cond_4d

    .line 2206
    .line 2207
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 2208
    .line 2209
    .line 2210
    move-result-object v2

    .line 2211
    check-cast v2, La/k3t0;

    .line 2212
    .line 2213
    check-cast v2, La/i3t0;

    .line 2214
    .line 2215
    invoke-virtual {v2, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 2216
    .line 2217
    .line 2218
    move-result-object v2

    .line 2219
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 2220
    .line 2221
    .line 2222
    move-result-object v2

    .line 2223
    check-cast v2, La/c58;

    .line 2224
    .line 2225
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 2226
    .line 2227
    .line 2228
    move-result-object v0

    .line 2229
    move-object v10, v0

    .line 2230
    check-cast v10, La/k3t0;

    .line 2231
    .line 2232
    invoke-virtual {v1, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2233
    .line 2234
    .line 2235
    move-result v0

    .line 2236
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 2237
    .line 2238
    .line 2239
    move-result-object v3

    .line 2240
    if-nez v0, :cond_4b

    .line 2241
    .line 2242
    if-ne v3, v4, :cond_4c

    .line 2243
    .line 2244
    :cond_4b
    new-instance v8, La/yi90;

    .line 2245
    .line 2246
    const/4 v14, 0x0

    .line 2247
    const/16 v15, 0xa

    .line 2248
    .line 2249
    const/4 v9, 0x1

    .line 2250
    const-class v11, La/k3t0;

    .line 2251
    .line 2252
    const-string v12, "onAction"

    .line 2253
    .line 2254
    const-string v13, "onAction(Ljava/lang/Object;)V"

    .line 2255
    .line 2256
    invoke-direct/range {v8 .. v15}, La/yi90;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2257
    .line 2258
    .line 2259
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2260
    .line 2261
    .line 2262
    move-object v3, v8

    .line 2263
    :cond_4c
    check-cast v3, La/jhy;

    .line 2264
    .line 2265
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 2266
    .line 2267
    invoke-static {v2, v3, v1, v7}, La/unh0;->g(La/c58;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 2268
    .line 2269
    .line 2270
    goto :goto_1e

    .line 2271
    :cond_4d
    invoke-virtual {v1}, La/fet;->X()V

    .line 2272
    .line 2273
    .line 2274
    :goto_1e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2275
    .line 2276
    return-object v0

    .line 2277
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
