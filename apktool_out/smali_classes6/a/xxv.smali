.class public final synthetic La/xxv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/qow;)V
    .locals 1

    .line 1
    const/16 v0, 0xc

    iput-byte v0, p0, La/xxv;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/xxv;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/xxv;->a:B

    iput-object p1, p0, La/xxv;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;IB)V
    .locals 0

    .line 3
    iput-byte p3, p0, La/xxv;->a:B

    iput-object p1, p0, La/xxv;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/xxv;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    sget-object v3, La/ukd;->a:La/cl5;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x3

    .line 10
    const/4 v6, 0x2

    .line 11
    const/4 v7, 0x1

    .line 12
    iget-object v0, v0, La/xxv;->b:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast v0, La/gin0;

    .line 18
    .line 19
    move-object/from16 v1, p1

    .line 20
    .line 21
    check-cast v1, La/fet;

    .line 22
    .line 23
    move-object/from16 v2, p2

    .line 24
    .line 25
    check-cast v2, Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {v7}, La/x8x;->L(I)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-static {v0, v1, v2}, La/ntr;->V(La/gin0;La/fet;I)V

    .line 35
    .line 36
    .line 37
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object v0

    .line 40
    :pswitch_0
    check-cast v0, La/csv;

    .line 41
    .line 42
    move-object/from16 v1, p1

    .line 43
    .line 44
    check-cast v1, La/fet;

    .line 45
    .line 46
    move-object/from16 v2, p2

    .line 47
    .line 48
    check-cast v2, Ljava/lang/Integer;

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    and-int/lit8 v3, v2, 0x3

    .line 55
    .line 56
    if-eq v3, v6, :cond_0

    .line 57
    .line 58
    move v3, v7

    .line 59
    goto :goto_0

    .line 60
    :cond_0
    move v3, v4

    .line 61
    :goto_0
    and-int/2addr v2, v7

    .line 62
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_3

    .line 67
    .line 68
    iget-boolean v2, v0, La/csv;->c:Z

    .line 69
    .line 70
    if-eqz v2, :cond_2

    .line 71
    .line 72
    const v2, -0xd9f711f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 76
    .line 77
    .line 78
    iget-object v0, v0, La/csv;->b:La/a4x;

    .line 79
    .line 80
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_1

    .line 89
    .line 90
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    check-cast v2, La/gin0;

    .line 95
    .line 96
    invoke-static {v2, v1, v4}, La/ntr;->V(La/gin0;La/fet;I)V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    invoke-virtual {v1, v4}, La/fet;->r(Z)V

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_2
    const v0, -0xd9d2f05

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, v0}, La/fet;->e0(I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, v4}, La/fet;->r(Z)V

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_3
    invoke-virtual {v1}, La/fet;->X()V

    .line 115
    .line 116
    .line 117
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    return-object v0

    .line 120
    :pswitch_1
    move-object v8, v0

    .line 121
    check-cast v8, La/s0z;

    .line 122
    .line 123
    iget-object v0, v8, La/s0z;->S1:La/a8z;

    .line 124
    .line 125
    move-object/from16 v1, p1

    .line 126
    .line 127
    check-cast v1, La/fet;

    .line 128
    .line 129
    move-object/from16 v2, p2

    .line 130
    .line 131
    check-cast v2, Ljava/lang/Integer;

    .line 132
    .line 133
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    sget-object v9, La/s0z;->U1:La/bst;

    .line 138
    .line 139
    and-int/lit8 v9, v2, 0x3

    .line 140
    .line 141
    if-eq v9, v6, :cond_4

    .line 142
    .line 143
    move v6, v7

    .line 144
    goto :goto_3

    .line 145
    :cond_4
    move v6, v4

    .line 146
    :goto_3
    and-int/2addr v2, v7

    .line 147
    invoke-virtual {v1, v2, v6}, La/fet;->U(IZ)Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    if-eqz v2, :cond_b

    .line 152
    .line 153
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    check-cast v2, La/k3t0;

    .line 158
    .line 159
    invoke-virtual {v1, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v6

    .line 163
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    if-nez v6, :cond_6

    .line 168
    .line 169
    if-ne v7, v3, :cond_5

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_5
    move-object v6, v7

    .line 173
    move-object v7, v8

    .line 174
    goto :goto_5

    .line 175
    :cond_6
    :goto_4
    new-instance v6, La/g1y;

    .line 176
    .line 177
    const/4 v12, 0x0

    .line 178
    const/16 v13, 0x10

    .line 179
    .line 180
    const/4 v7, 0x1

    .line 181
    const-class v9, La/s0z;

    .line 182
    .line 183
    const-string v10, "collectSideEffect"

    .line 184
    .line 185
    const-string v11, "collectSideEffect(Lorg/xplatform/statistic/lastgames/presentation/models/LastGamesSideEffect;)V"

    .line 186
    .line 187
    invoke-direct/range {v6 .. v13}, La/g1y;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 188
    .line 189
    .line 190
    move-object v7, v8

    .line 191
    invoke-virtual {v1, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    :goto_5
    check-cast v6, La/jhy;

    .line 195
    .line 196
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 197
    .line 198
    sget-object v8, La/lkz;->a:La/lkz;

    .line 199
    .line 200
    invoke-static {v6, v1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 201
    .line 202
    .line 203
    move-result-object v8

    .line 204
    invoke-virtual {v1, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v6

    .line 208
    invoke-virtual {v1, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v9

    .line 212
    or-int/2addr v6, v9

    .line 213
    invoke-virtual {v1, v5}, La/fet;->e(I)Z

    .line 214
    .line 215
    .line 216
    move-result v5

    .line 217
    or-int/2addr v5, v6

    .line 218
    invoke-virtual {v1, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v6

    .line 222
    or-int/2addr v5, v6

    .line 223
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v6

    .line 227
    const/4 v9, 0x0

    .line 228
    if-nez v5, :cond_7

    .line 229
    .line 230
    if-ne v6, v3, :cond_8

    .line 231
    .line 232
    :cond_7
    new-instance v5, La/bio;

    .line 233
    .line 234
    const/16 v10, 0x15

    .line 235
    .line 236
    move-object v6, v2

    .line 237
    invoke-direct/range {v5 .. v10}, La/bio;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    move-object v6, v5

    .line 244
    :cond_8
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 245
    .line 246
    invoke-static {v1, v7, v6}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 247
    .line 248
    .line 249
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    check-cast v2, La/k3t0;

    .line 254
    .line 255
    check-cast v2, La/i3t0;

    .line 256
    .line 257
    invoke-virtual {v2, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    move-object v12, v0

    .line 266
    check-cast v12, La/k3t0;

    .line 267
    .line 268
    invoke-virtual {v1, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v0

    .line 272
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v5

    .line 276
    if-nez v0, :cond_9

    .line 277
    .line 278
    if-ne v5, v3, :cond_a

    .line 279
    .line 280
    :cond_9
    new-instance v10, La/g1y;

    .line 281
    .line 282
    const/16 v16, 0x0

    .line 283
    .line 284
    const/16 v17, 0x11

    .line 285
    .line 286
    const/4 v11, 0x1

    .line 287
    const-class v13, La/k3t0;

    .line 288
    .line 289
    const-string v14, "onAction"

    .line 290
    .line 291
    const-string v15, "onAction(Ljava/lang/Object;)V"

    .line 292
    .line 293
    invoke-direct/range {v10 .. v17}, La/g1y;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v1, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    move-object v5, v10

    .line 300
    :cond_a
    check-cast v5, La/jhy;

    .line 301
    .line 302
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 303
    .line 304
    invoke-static {v4, v1, v9, v2, v5}, La/ntr;->E(ILa/fet;La/mm40;La/l7m0;Lkotlin/jvm/functions/Function1;)V

    .line 305
    .line 306
    .line 307
    goto :goto_6

    .line 308
    :cond_b
    invoke-virtual {v1}, La/fet;->X()V

    .line 309
    .line 310
    .line 311
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 312
    .line 313
    return-object v0

    .line 314
    :pswitch_2
    check-cast v0, La/wzy;

    .line 315
    .line 316
    iget-object v1, v0, La/i3t0;->f:La/oyg0;

    .line 317
    .line 318
    iget-object v0, v0, La/i3t0;->i:La/ocj;

    .line 319
    .line 320
    move-object/from16 v2, p1

    .line 321
    .line 322
    check-cast v2, Ljava/lang/Throwable;

    .line 323
    .line 324
    move-object/from16 v3, p2

    .line 325
    .line 326
    check-cast v3, Ljava/lang/String;

    .line 327
    .line 328
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    instance-of v2, v2, La/ff5;

    .line 335
    .line 336
    if-eqz v2, :cond_d

    .line 337
    .line 338
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 339
    .line 340
    :cond_c
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    move-object v3, v0

    .line 348
    check-cast v3, La/rzy;

    .line 349
    .line 350
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 351
    .line 352
    .line 353
    invoke-static {v3, v4, v4, v7}, La/rzy;->a(La/rzy;ZZZ)La/rzy;

    .line 354
    .line 355
    .line 356
    move-result-object v3

    .line 357
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v0

    .line 361
    if-eqz v0, :cond_c

    .line 362
    .line 363
    goto :goto_7

    .line 364
    :cond_d
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 365
    .line 366
    :cond_e
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    move-object v3, v0

    .line 374
    check-cast v3, La/rzy;

    .line 375
    .line 376
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    invoke-static {v3, v4, v7, v4}, La/rzy;->a(La/rzy;ZZZ)La/rzy;

    .line 380
    .line 381
    .line 382
    move-result-object v3

    .line 383
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    move-result v0

    .line 387
    if-eqz v0, :cond_e

    .line 388
    .line 389
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 390
    .line 391
    return-object v0

    .line 392
    :pswitch_3
    check-cast v0, La/pzy;

    .line 393
    .line 394
    iget-object v0, v0, La/pzy;->M1:La/a8z;

    .line 395
    .line 396
    move-object/from16 v1, p1

    .line 397
    .line 398
    check-cast v1, La/fet;

    .line 399
    .line 400
    move-object/from16 v2, p2

    .line 401
    .line 402
    check-cast v2, Ljava/lang/Integer;

    .line 403
    .line 404
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 405
    .line 406
    .line 407
    move-result v2

    .line 408
    sget-object v5, La/pzy;->Q1:La/sqt;

    .line 409
    .line 410
    and-int/lit8 v5, v2, 0x3

    .line 411
    .line 412
    if-eq v5, v6, :cond_f

    .line 413
    .line 414
    move v5, v7

    .line 415
    goto :goto_8

    .line 416
    :cond_f
    move v5, v4

    .line 417
    :goto_8
    and-int/2addr v2, v7

    .line 418
    invoke-virtual {v1, v2, v5}, La/fet;->U(IZ)Z

    .line 419
    .line 420
    .line 421
    move-result v2

    .line 422
    if-eqz v2, :cond_12

    .line 423
    .line 424
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v2

    .line 428
    check-cast v2, La/k3t0;

    .line 429
    .line 430
    check-cast v2, La/i3t0;

    .line 431
    .line 432
    invoke-virtual {v2, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    move-object v7, v0

    .line 441
    check-cast v7, La/k3t0;

    .line 442
    .line 443
    invoke-virtual {v1, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    move-result v0

    .line 447
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v5

    .line 451
    if-nez v0, :cond_10

    .line 452
    .line 453
    if-ne v5, v3, :cond_11

    .line 454
    .line 455
    :cond_10
    new-instance v5, La/g1y;

    .line 456
    .line 457
    const/4 v11, 0x0

    .line 458
    const/16 v12, 0xf

    .line 459
    .line 460
    const/4 v6, 0x1

    .line 461
    const-class v8, La/k3t0;

    .line 462
    .line 463
    const-string v9, "onAction"

    .line 464
    .line 465
    const-string v10, "onAction(Ljava/lang/Object;)V"

    .line 466
    .line 467
    invoke-direct/range {v5 .. v12}, La/g1y;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 468
    .line 469
    .line 470
    invoke-virtual {v1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 471
    .line 472
    .line 473
    :cond_11
    check-cast v5, La/jhy;

    .line 474
    .line 475
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 476
    .line 477
    invoke-static {v2, v5, v1, v4}, La/eeq;->y(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 478
    .line 479
    .line 480
    goto :goto_9

    .line 481
    :cond_12
    invoke-virtual {v1}, La/fet;->X()V

    .line 482
    .line 483
    .line 484
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 485
    .line 486
    return-object v0

    .line 487
    :pswitch_4
    move-object v8, v0

    .line 488
    check-cast v8, La/gyy;

    .line 489
    .line 490
    move-object/from16 v12, p1

    .line 491
    .line 492
    check-cast v12, La/fet;

    .line 493
    .line 494
    move-object/from16 v0, p2

    .line 495
    .line 496
    check-cast v0, Ljava/lang/Integer;

    .line 497
    .line 498
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 499
    .line 500
    .line 501
    move-result v0

    .line 502
    sget-object v1, La/gyy;->P1:La/rqt;

    .line 503
    .line 504
    and-int/lit8 v1, v0, 0x3

    .line 505
    .line 506
    if-eq v1, v6, :cond_13

    .line 507
    .line 508
    move v1, v7

    .line 509
    goto :goto_a

    .line 510
    :cond_13
    move v1, v4

    .line 511
    :goto_a
    and-int/2addr v0, v7

    .line 512
    invoke-virtual {v12, v0, v1}, La/fet;->U(IZ)Z

    .line 513
    .line 514
    .line 515
    move-result v0

    .line 516
    if-eqz v0, :cond_1e

    .line 517
    .line 518
    invoke-virtual {v12, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 519
    .line 520
    .line 521
    move-result v0

    .line 522
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v1

    .line 526
    if-nez v0, :cond_14

    .line 527
    .line 528
    if-ne v1, v3, :cond_15

    .line 529
    .line 530
    :cond_14
    new-instance v1, La/fyy;

    .line 531
    .line 532
    invoke-direct {v1, v8, v7}, La/fyy;-><init>(La/gyy;B)V

    .line 533
    .line 534
    .line 535
    invoke-virtual {v12, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 536
    .line 537
    .line 538
    :cond_15
    move-object v9, v1

    .line 539
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 540
    .line 541
    invoke-virtual {v12, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 542
    .line 543
    .line 544
    move-result v0

    .line 545
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object v1

    .line 549
    if-nez v0, :cond_16

    .line 550
    .line 551
    if-ne v1, v3, :cond_17

    .line 552
    .line 553
    :cond_16
    new-instance v1, La/fyy;

    .line 554
    .line 555
    invoke-direct {v1, v8, v6}, La/fyy;-><init>(La/gyy;B)V

    .line 556
    .line 557
    .line 558
    invoke-virtual {v12, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 559
    .line 560
    .line 561
    :cond_17
    move-object v10, v1

    .line 562
    check-cast v10, Lkotlin/jvm/functions/Function0;

    .line 563
    .line 564
    const/4 v13, 0x0

    .line 565
    const/4 v14, 0x4

    .line 566
    const/4 v11, 0x0

    .line 567
    invoke-static/range {v9 .. v14}, La/v3c;->z(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 568
    .line 569
    .line 570
    move-object v0, v12

    .line 571
    invoke-virtual {v8}, La/gyy;->G0()La/k3t0;

    .line 572
    .line 573
    .line 574
    move-result-object v1

    .line 575
    invoke-virtual {v0, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 576
    .line 577
    .line 578
    move-result v2

    .line 579
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object v6

    .line 583
    if-nez v2, :cond_19

    .line 584
    .line 585
    if-ne v6, v3, :cond_18

    .line 586
    .line 587
    goto :goto_b

    .line 588
    :cond_18
    move-object v7, v8

    .line 589
    goto :goto_c

    .line 590
    :cond_19
    :goto_b
    new-instance v6, La/g1y;

    .line 591
    .line 592
    const/4 v12, 0x0

    .line 593
    const/16 v13, 0xd

    .line 594
    .line 595
    const/4 v7, 0x1

    .line 596
    const-class v9, La/gyy;

    .line 597
    .line 598
    const-string v10, "handleSideEffect"

    .line 599
    .line 600
    const-string v11, "handleSideEffect(Lorg/xplatform/ufc/impl/last_fights/presentation/model/LastFightsSideEffect;)V"

    .line 601
    .line 602
    invoke-direct/range {v6 .. v13}, La/g1y;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 603
    .line 604
    .line 605
    move-object v7, v8

    .line 606
    invoke-virtual {v0, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 607
    .line 608
    .line 609
    :goto_c
    check-cast v6, La/jhy;

    .line 610
    .line 611
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 612
    .line 613
    sget-object v2, La/lkz;->a:La/lkz;

    .line 614
    .line 615
    invoke-static {v6, v0}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 616
    .line 617
    .line 618
    move-result-object v8

    .line 619
    invoke-virtual {v0, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 620
    .line 621
    .line 622
    move-result v2

    .line 623
    invoke-virtual {v0, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 624
    .line 625
    .line 626
    move-result v6

    .line 627
    or-int/2addr v2, v6

    .line 628
    invoke-virtual {v0, v5}, La/fet;->e(I)Z

    .line 629
    .line 630
    .line 631
    move-result v5

    .line 632
    or-int/2addr v2, v5

    .line 633
    invoke-virtual {v0, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 634
    .line 635
    .line 636
    move-result v5

    .line 637
    or-int/2addr v2, v5

    .line 638
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 639
    .line 640
    .line 641
    move-result-object v5

    .line 642
    if-nez v2, :cond_1a

    .line 643
    .line 644
    if-ne v5, v3, :cond_1b

    .line 645
    .line 646
    :cond_1a
    new-instance v5, La/bio;

    .line 647
    .line 648
    const/4 v9, 0x0

    .line 649
    const/16 v10, 0x14

    .line 650
    .line 651
    move-object v6, v1

    .line 652
    invoke-direct/range {v5 .. v10}, La/bio;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 653
    .line 654
    .line 655
    invoke-virtual {v0, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 656
    .line 657
    .line 658
    :cond_1b
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 659
    .line 660
    invoke-static {v0, v7, v5}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 661
    .line 662
    .line 663
    invoke-virtual {v7}, La/gyy;->G0()La/k3t0;

    .line 664
    .line 665
    .line 666
    move-result-object v1

    .line 667
    check-cast v1, La/i3t0;

    .line 668
    .line 669
    invoke-virtual {v1, v0}, La/i3t0;->y(La/fet;)La/pz40;

    .line 670
    .line 671
    .line 672
    move-result-object v1

    .line 673
    invoke-virtual {v7}, La/gyy;->G0()La/k3t0;

    .line 674
    .line 675
    .line 676
    move-result-object v10

    .line 677
    invoke-virtual {v0, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 678
    .line 679
    .line 680
    move-result v2

    .line 681
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 682
    .line 683
    .line 684
    move-result-object v5

    .line 685
    if-nez v2, :cond_1c

    .line 686
    .line 687
    if-ne v5, v3, :cond_1d

    .line 688
    .line 689
    :cond_1c
    new-instance v8, La/g1y;

    .line 690
    .line 691
    const/4 v14, 0x0

    .line 692
    const/16 v15, 0xe

    .line 693
    .line 694
    const/4 v9, 0x1

    .line 695
    const-class v11, La/k3t0;

    .line 696
    .line 697
    const-string v12, "onAction"

    .line 698
    .line 699
    const-string v13, "onAction(Ljava/lang/Object;)V"

    .line 700
    .line 701
    invoke-direct/range {v8 .. v15}, La/g1y;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 702
    .line 703
    .line 704
    invoke-virtual {v0, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 705
    .line 706
    .line 707
    move-object v5, v8

    .line 708
    :cond_1d
    check-cast v5, La/jhy;

    .line 709
    .line 710
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 711
    .line 712
    invoke-static {v1, v5, v0, v4}, La/qjj;->y(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 713
    .line 714
    .line 715
    goto :goto_d

    .line 716
    :cond_1e
    move-object v0, v12

    .line 717
    invoke-virtual {v0}, La/fet;->X()V

    .line 718
    .line 719
    .line 720
    :goto_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 721
    .line 722
    return-object v0

    .line 723
    :pswitch_5
    check-cast v0, La/v6y;

    .line 724
    .line 725
    move-object/from16 v1, p1

    .line 726
    .line 727
    check-cast v1, La/fet;

    .line 728
    .line 729
    move-object/from16 v2, p2

    .line 730
    .line 731
    check-cast v2, Ljava/lang/Integer;

    .line 732
    .line 733
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 734
    .line 735
    .line 736
    invoke-static {v7}, La/x8x;->L(I)I

    .line 737
    .line 738
    .line 739
    move-result v2

    .line 740
    invoke-static {v0, v1, v2}, La/y9a;->C(La/v6y;La/fet;I)V

    .line 741
    .line 742
    .line 743
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 744
    .line 745
    return-object v0

    .line 746
    :pswitch_6
    check-cast v0, La/d0s;

    .line 747
    .line 748
    move-object/from16 v1, p1

    .line 749
    .line 750
    check-cast v1, La/fet;

    .line 751
    .line 752
    move-object/from16 v2, p2

    .line 753
    .line 754
    check-cast v2, Ljava/lang/Integer;

    .line 755
    .line 756
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 757
    .line 758
    .line 759
    invoke-static {v7}, La/x8x;->L(I)I

    .line 760
    .line 761
    .line 762
    move-result v2

    .line 763
    invoke-static {v0, v1, v2}, La/e9x;->B(La/d0s;La/fet;I)V

    .line 764
    .line 765
    .line 766
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 767
    .line 768
    return-object v0

    .line 769
    :pswitch_7
    check-cast v0, La/e0s;

    .line 770
    .line 771
    move-object/from16 v1, p1

    .line 772
    .line 773
    check-cast v1, La/fet;

    .line 774
    .line 775
    move-object/from16 v2, p2

    .line 776
    .line 777
    check-cast v2, Ljava/lang/Integer;

    .line 778
    .line 779
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 780
    .line 781
    .line 782
    invoke-static {v7}, La/x8x;->L(I)I

    .line 783
    .line 784
    .line 785
    move-result v2

    .line 786
    invoke-static {v0, v1, v2}, La/r8x;->x(La/e0s;La/fet;I)V

    .line 787
    .line 788
    .line 789
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 790
    .line 791
    return-object v0

    .line 792
    :pswitch_8
    check-cast v0, La/t0y;

    .line 793
    .line 794
    move-object/from16 v1, p1

    .line 795
    .line 796
    check-cast v1, La/fet;

    .line 797
    .line 798
    move-object/from16 v2, p2

    .line 799
    .line 800
    check-cast v2, Ljava/lang/Integer;

    .line 801
    .line 802
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 803
    .line 804
    .line 805
    move-result v2

    .line 806
    sget-object v8, La/t0y;->P1:La/gst;

    .line 807
    .line 808
    and-int/lit8 v8, v2, 0x3

    .line 809
    .line 810
    if-eq v8, v6, :cond_1f

    .line 811
    .line 812
    move v6, v7

    .line 813
    goto :goto_e

    .line 814
    :cond_1f
    move v6, v4

    .line 815
    :goto_e
    and-int/2addr v2, v7

    .line 816
    invoke-virtual {v1, v2, v6}, La/fet;->U(IZ)Z

    .line 817
    .line 818
    .line 819
    move-result v2

    .line 820
    if-eqz v2, :cond_26

    .line 821
    .line 822
    invoke-virtual {v0}, La/t0y;->G0()La/k3t0;

    .line 823
    .line 824
    .line 825
    move-result-object v2

    .line 826
    check-cast v2, La/i3t0;

    .line 827
    .line 828
    invoke-virtual {v2, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 829
    .line 830
    .line 831
    move-result-object v2

    .line 832
    invoke-virtual {v0}, La/t0y;->G0()La/k3t0;

    .line 833
    .line 834
    .line 835
    move-result-object v7

    .line 836
    sget-object v6, La/or00;->a:La/zfn;

    .line 837
    .line 838
    invoke-virtual {v1, v6}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 839
    .line 840
    .line 841
    move-result-object v6

    .line 842
    move-object v8, v6

    .line 843
    check-cast v8, La/clz;

    .line 844
    .line 845
    invoke-virtual {v1, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 846
    .line 847
    .line 848
    move-result v6

    .line 849
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 850
    .line 851
    .line 852
    move-result-object v9

    .line 853
    if-nez v6, :cond_20

    .line 854
    .line 855
    if-ne v9, v3, :cond_21

    .line 856
    .line 857
    :cond_20
    new-instance v9, La/adw;

    .line 858
    .line 859
    const/16 v6, 0x13

    .line 860
    .line 861
    invoke-direct {v9, v0, v6}, La/adw;-><init>(Ljava/lang/Object;B)V

    .line 862
    .line 863
    .line 864
    invoke-virtual {v1, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 865
    .line 866
    .line 867
    :cond_21
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 868
    .line 869
    sget-object v6, La/lkz;->a:La/lkz;

    .line 870
    .line 871
    invoke-static {v9, v1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 872
    .line 873
    .line 874
    move-result-object v9

    .line 875
    invoke-virtual {v1, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 876
    .line 877
    .line 878
    move-result v6

    .line 879
    invoke-virtual {v1, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 880
    .line 881
    .line 882
    move-result v10

    .line 883
    or-int/2addr v6, v10

    .line 884
    invoke-virtual {v1, v5}, La/fet;->e(I)Z

    .line 885
    .line 886
    .line 887
    move-result v5

    .line 888
    or-int/2addr v5, v6

    .line 889
    invoke-virtual {v1, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 890
    .line 891
    .line 892
    move-result v6

    .line 893
    or-int/2addr v5, v6

    .line 894
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 895
    .line 896
    .line 897
    move-result-object v6

    .line 898
    if-nez v5, :cond_22

    .line 899
    .line 900
    if-ne v6, v3, :cond_23

    .line 901
    .line 902
    :cond_22
    new-instance v6, La/pc;

    .line 903
    .line 904
    const/4 v10, 0x0

    .line 905
    const/16 v11, 0x16

    .line 906
    .line 907
    invoke-direct/range {v6 .. v11}, La/pc;-><init>(La/k3t0;La/clz;La/pz40;La/yje;B)V

    .line 908
    .line 909
    .line 910
    invoke-virtual {v1, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 911
    .line 912
    .line 913
    :cond_23
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 914
    .line 915
    invoke-static {v1, v8, v6}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 916
    .line 917
    .line 918
    invoke-virtual {v0}, La/t0y;->G0()La/k3t0;

    .line 919
    .line 920
    .line 921
    move-result-object v11

    .line 922
    invoke-virtual {v1, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 923
    .line 924
    .line 925
    move-result v0

    .line 926
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 927
    .line 928
    .line 929
    move-result-object v5

    .line 930
    if-nez v0, :cond_24

    .line 931
    .line 932
    if-ne v5, v3, :cond_25

    .line 933
    .line 934
    :cond_24
    new-instance v9, La/n5w;

    .line 935
    .line 936
    const/4 v15, 0x0

    .line 937
    const/16 v16, 0x1d

    .line 938
    .line 939
    const/4 v10, 0x1

    .line 940
    const-class v12, La/k3t0;

    .line 941
    .line 942
    const-string v13, "onAction"

    .line 943
    .line 944
    const-string v14, "onAction(Ljava/lang/Object;)V"

    .line 945
    .line 946
    invoke-direct/range {v9 .. v16}, La/n5w;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 947
    .line 948
    .line 949
    invoke-virtual {v1, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 950
    .line 951
    .line 952
    move-object v5, v9

    .line 953
    :cond_25
    check-cast v5, La/jhy;

    .line 954
    .line 955
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 956
    .line 957
    invoke-static {v2, v5, v1, v4}, La/y9a;->E(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 958
    .line 959
    .line 960
    goto :goto_f

    .line 961
    :cond_26
    invoke-virtual {v1}, La/fet;->X()V

    .line 962
    .line 963
    .line 964
    :goto_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 965
    .line 966
    return-object v0

    .line 967
    :pswitch_9
    check-cast v0, La/voa0;

    .line 968
    .line 969
    move-object/from16 v1, p1

    .line 970
    .line 971
    check-cast v1, La/fet;

    .line 972
    .line 973
    move-object/from16 v2, p2

    .line 974
    .line 975
    check-cast v2, Ljava/lang/Integer;

    .line 976
    .line 977
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 978
    .line 979
    .line 980
    invoke-static {v7}, La/x8x;->L(I)I

    .line 981
    .line 982
    .line 983
    move-result v2

    .line 984
    invoke-static {v0, v1, v2}, La/m7x;->a(La/voa0;La/fet;I)V

    .line 985
    .line 986
    .line 987
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 988
    .line 989
    return-object v0

    .line 990
    :pswitch_a
    check-cast v0, La/wbx;

    .line 991
    .line 992
    iget-object v0, v0, La/wbx;->M1:La/a8z;

    .line 993
    .line 994
    move-object/from16 v1, p1

    .line 995
    .line 996
    check-cast v1, La/fet;

    .line 997
    .line 998
    move-object/from16 v2, p2

    .line 999
    .line 1000
    check-cast v2, Ljava/lang/Integer;

    .line 1001
    .line 1002
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1003
    .line 1004
    .line 1005
    move-result v2

    .line 1006
    sget-object v5, La/wbx;->P1:La/bst;

    .line 1007
    .line 1008
    and-int/lit8 v5, v2, 0x3

    .line 1009
    .line 1010
    if-eq v5, v6, :cond_27

    .line 1011
    .line 1012
    move v5, v7

    .line 1013
    goto :goto_10

    .line 1014
    :cond_27
    move v5, v4

    .line 1015
    :goto_10
    and-int/2addr v2, v7

    .line 1016
    invoke-virtual {v1, v2, v5}, La/fet;->U(IZ)Z

    .line 1017
    .line 1018
    .line 1019
    move-result v2

    .line 1020
    if-eqz v2, :cond_2a

    .line 1021
    .line 1022
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v2

    .line 1026
    check-cast v2, La/k3t0;

    .line 1027
    .line 1028
    check-cast v2, La/i3t0;

    .line 1029
    .line 1030
    invoke-virtual {v2, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v2

    .line 1034
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v2

    .line 1038
    check-cast v2, La/fcx;

    .line 1039
    .line 1040
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v0

    .line 1044
    move-object v7, v0

    .line 1045
    check-cast v7, La/k3t0;

    .line 1046
    .line 1047
    invoke-virtual {v1, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1048
    .line 1049
    .line 1050
    move-result v0

    .line 1051
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v5

    .line 1055
    if-nez v0, :cond_28

    .line 1056
    .line 1057
    if-ne v5, v3, :cond_29

    .line 1058
    .line 1059
    :cond_28
    new-instance v5, La/n5w;

    .line 1060
    .line 1061
    const/4 v11, 0x0

    .line 1062
    const/16 v12, 0x1b

    .line 1063
    .line 1064
    const/4 v6, 0x1

    .line 1065
    const-class v8, La/k3t0;

    .line 1066
    .line 1067
    const-string v9, "onAction"

    .line 1068
    .line 1069
    const-string v10, "onAction(Ljava/lang/Object;)V"

    .line 1070
    .line 1071
    invoke-direct/range {v5 .. v12}, La/n5w;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual {v1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1075
    .line 1076
    .line 1077
    :cond_29
    check-cast v5, La/jhy;

    .line 1078
    .line 1079
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 1080
    .line 1081
    invoke-static {v2, v5, v1, v4}, La/uc9;->B(La/fcx;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1082
    .line 1083
    .line 1084
    goto :goto_11

    .line 1085
    :cond_2a
    invoke-virtual {v1}, La/fet;->X()V

    .line 1086
    .line 1087
    .line 1088
    :goto_11
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1089
    .line 1090
    return-object v0

    .line 1091
    :pswitch_b
    check-cast v0, La/beo;

    .line 1092
    .line 1093
    move-object/from16 v15, p1

    .line 1094
    .line 1095
    check-cast v15, La/fet;

    .line 1096
    .line 1097
    move-object/from16 v1, p2

    .line 1098
    .line 1099
    check-cast v1, Ljava/lang/Integer;

    .line 1100
    .line 1101
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1102
    .line 1103
    .line 1104
    move-result v1

    .line 1105
    and-int/lit8 v2, v1, 0x3

    .line 1106
    .line 1107
    if-eq v2, v6, :cond_2b

    .line 1108
    .line 1109
    move v4, v7

    .line 1110
    :cond_2b
    and-int/2addr v1, v7

    .line 1111
    invoke-virtual {v15, v1, v4}, La/fet;->U(IZ)Z

    .line 1112
    .line 1113
    .line 1114
    move-result v1

    .line 1115
    if-eqz v1, :cond_2c

    .line 1116
    .line 1117
    sget-object v1, La/qmk;->a:La/zcl;

    .line 1118
    .line 1119
    const/4 v12, 0x0

    .line 1120
    const/16 v13, 0xd

    .line 1121
    .line 1122
    sget-object v8, La/jm40;->b:La/jm40;

    .line 1123
    .line 1124
    const/4 v9, 0x0

    .line 1125
    const/high16 v10, 0x40000000    # 2.0f

    .line 1126
    .line 1127
    const/4 v11, 0x0

    .line 1128
    invoke-static/range {v8 .. v13}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v8

    .line 1132
    new-instance v9, La/qw3;

    .line 1133
    .line 1134
    new-instance v1, La/jf4;

    .line 1135
    .line 1136
    const/16 v2, 0xe

    .line 1137
    .line 1138
    invoke-direct {v1, v2}, La/jf4;-><init>(B)V

    .line 1139
    .line 1140
    .line 1141
    const/high16 v3, 0x40800000    # 4.0f

    .line 1142
    .line 1143
    invoke-direct {v9, v3, v7, v1}, La/qw3;-><init>(FZLa/rw3;)V

    .line 1144
    .line 1145
    .line 1146
    new-instance v10, La/qw3;

    .line 1147
    .line 1148
    new-instance v1, La/jf4;

    .line 1149
    .line 1150
    invoke-direct {v1, v2}, La/jf4;-><init>(B)V

    .line 1151
    .line 1152
    .line 1153
    invoke-direct {v10, v3, v7, v1}, La/qw3;-><init>(FZLa/rw3;)V

    .line 1154
    .line 1155
    .line 1156
    sget-object v11, La/gqw0;->k:La/yx7;

    .line 1157
    .line 1158
    new-instance v1, La/elm;

    .line 1159
    .line 1160
    const/16 v2, 0x16

    .line 1161
    .line 1162
    invoke-direct {v1, v0, v2}, La/elm;-><init>(Ljava/lang/Object;B)V

    .line 1163
    .line 1164
    .line 1165
    const v0, -0x15679208

    .line 1166
    .line 1167
    .line 1168
    invoke-static {v0, v1, v15}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v14

    .line 1172
    const v16, 0x180c00

    .line 1173
    .line 1174
    .line 1175
    const/16 v17, 0x30

    .line 1176
    .line 1177
    const/4 v12, 0x0

    .line 1178
    const/4 v13, 0x0

    .line 1179
    invoke-static/range {v8 .. v17}, La/jwb;->p(La/mm40;La/ow3;La/sw3;La/yx7;IILa/ugd;La/fet;II)V

    .line 1180
    .line 1181
    .line 1182
    goto :goto_12

    .line 1183
    :cond_2c
    invoke-virtual {v15}, La/fet;->X()V

    .line 1184
    .line 1185
    .line 1186
    :goto_12
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1187
    .line 1188
    return-object v0

    .line 1189
    :pswitch_c
    check-cast v0, La/z7x;

    .line 1190
    .line 1191
    move-object/from16 v1, p1

    .line 1192
    .line 1193
    check-cast v1, La/fet;

    .line 1194
    .line 1195
    move-object/from16 v2, p2

    .line 1196
    .line 1197
    check-cast v2, Ljava/lang/Integer;

    .line 1198
    .line 1199
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1200
    .line 1201
    .line 1202
    invoke-static {v7}, La/x8x;->L(I)I

    .line 1203
    .line 1204
    .line 1205
    move-result v2

    .line 1206
    invoke-virtual {v0, v2, v1}, La/z7x;->a(ILa/fet;)V

    .line 1207
    .line 1208
    .line 1209
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1210
    .line 1211
    return-object v0

    .line 1212
    :pswitch_d
    check-cast v0, La/c0x;

    .line 1213
    .line 1214
    move-object/from16 v1, p1

    .line 1215
    .line 1216
    check-cast v1, Ljava/lang/Float;

    .line 1217
    .line 1218
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1219
    .line 1220
    .line 1221
    move-object/from16 v1, p2

    .line 1222
    .line 1223
    check-cast v1, Ljava/lang/Float;

    .line 1224
    .line 1225
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 1226
    .line 1227
    .line 1228
    move-result v1

    .line 1229
    iget-object v0, v0, La/c0x;->d:La/uk5;

    .line 1230
    .line 1231
    iget-object v0, v0, La/uk5;->e:Landroid/view/View;

    .line 1232
    .line 1233
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1234
    .line 1235
    const/high16 v2, 0x3f800000    # 1.0f

    .line 1236
    .line 1237
    sub-float/2addr v2, v1

    .line 1238
    invoke-virtual {v0, v2}, Landroid/view/View;->setAlpha(F)V

    .line 1239
    .line 1240
    .line 1241
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1242
    .line 1243
    return-object v0

    .line 1244
    :pswitch_e
    check-cast v0, La/arw;

    .line 1245
    .line 1246
    iget-object v0, v0, La/arw;->O1:La/a8z;

    .line 1247
    .line 1248
    move-object/from16 v1, p1

    .line 1249
    .line 1250
    check-cast v1, La/fet;

    .line 1251
    .line 1252
    move-object/from16 v5, p2

    .line 1253
    .line 1254
    check-cast v5, Ljava/lang/Integer;

    .line 1255
    .line 1256
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1257
    .line 1258
    .line 1259
    move-result v5

    .line 1260
    sget-object v8, La/arw;->Q1:La/sqt;

    .line 1261
    .line 1262
    and-int/lit8 v8, v5, 0x3

    .line 1263
    .line 1264
    if-eq v8, v6, :cond_2d

    .line 1265
    .line 1266
    move v6, v7

    .line 1267
    goto :goto_13

    .line 1268
    :cond_2d
    move v6, v4

    .line 1269
    :goto_13
    and-int/2addr v5, v7

    .line 1270
    invoke-virtual {v1, v5, v6}, La/fet;->U(IZ)Z

    .line 1271
    .line 1272
    .line 1273
    move-result v5

    .line 1274
    if-eqz v5, :cond_30

    .line 1275
    .line 1276
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v5

    .line 1280
    check-cast v5, La/k3t0;

    .line 1281
    .line 1282
    check-cast v5, La/i3t0;

    .line 1283
    .line 1284
    invoke-virtual {v5, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v5

    .line 1288
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v0

    .line 1292
    move-object v8, v0

    .line 1293
    check-cast v8, La/k3t0;

    .line 1294
    .line 1295
    invoke-virtual {v1, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1296
    .line 1297
    .line 1298
    move-result v0

    .line 1299
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v6

    .line 1303
    if-nez v0, :cond_2e

    .line 1304
    .line 1305
    if-ne v6, v3, :cond_2f

    .line 1306
    .line 1307
    :cond_2e
    new-instance v6, La/n5w;

    .line 1308
    .line 1309
    const/4 v12, 0x0

    .line 1310
    const/16 v13, 0x1a

    .line 1311
    .line 1312
    const/4 v7, 0x1

    .line 1313
    const-class v9, La/k3t0;

    .line 1314
    .line 1315
    const-string v10, "onAction"

    .line 1316
    .line 1317
    const-string v11, "onAction(Ljava/lang/Object;)V"

    .line 1318
    .line 1319
    invoke-direct/range {v6 .. v13}, La/n5w;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1320
    .line 1321
    .line 1322
    invoke-virtual {v1, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1323
    .line 1324
    .line 1325
    :cond_2f
    check-cast v6, La/jhy;

    .line 1326
    .line 1327
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 1328
    .line 1329
    invoke-static {v4, v1, v2, v5, v6}, La/b34;->z(ILa/fet;La/mm40;La/l7m0;Lkotlin/jvm/functions/Function1;)V

    .line 1330
    .line 1331
    .line 1332
    goto :goto_14

    .line 1333
    :cond_30
    invoke-virtual {v1}, La/fet;->X()V

    .line 1334
    .line 1335
    .line 1336
    :goto_14
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1337
    .line 1338
    return-object v0

    .line 1339
    :pswitch_f
    check-cast v0, La/cqw;

    .line 1340
    .line 1341
    move-object/from16 v1, p1

    .line 1342
    .line 1343
    check-cast v1, La/fet;

    .line 1344
    .line 1345
    move-object/from16 v2, p2

    .line 1346
    .line 1347
    check-cast v2, Ljava/lang/Integer;

    .line 1348
    .line 1349
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1350
    .line 1351
    .line 1352
    move-result v2

    .line 1353
    sget-object v3, La/cqw;->S1:La/rqt;

    .line 1354
    .line 1355
    and-int/lit8 v3, v2, 0x3

    .line 1356
    .line 1357
    if-eq v3, v6, :cond_31

    .line 1358
    .line 1359
    move v3, v7

    .line 1360
    goto :goto_15

    .line 1361
    :cond_31
    move v3, v4

    .line 1362
    :goto_15
    and-int/2addr v2, v7

    .line 1363
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 1364
    .line 1365
    .line 1366
    move-result v2

    .line 1367
    if-eqz v2, :cond_32

    .line 1368
    .line 1369
    iget-object v2, v0, La/cqw;->Q1:La/a8z;

    .line 1370
    .line 1371
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v2

    .line 1375
    check-cast v2, La/k3t0;

    .line 1376
    .line 1377
    iget-object v3, v0, La/cqw;->N1:La/yzn0;

    .line 1378
    .line 1379
    sget-object v5, La/cqw;->U1:[La/iiy;

    .line 1380
    .line 1381
    aget-object v5, v5, v6

    .line 1382
    .line 1383
    invoke-virtual {v3, v0, v5}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v0

    .line 1387
    check-cast v0, La/llm0;

    .line 1388
    .line 1389
    invoke-static {v2, v0, v1, v4}, La/qcc;->v(La/k3t0;La/llm0;La/fet;I)V

    .line 1390
    .line 1391
    .line 1392
    goto :goto_16

    .line 1393
    :cond_32
    invoke-virtual {v1}, La/fet;->X()V

    .line 1394
    .line 1395
    .line 1396
    :goto_16
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1397
    .line 1398
    return-object v0

    .line 1399
    :pswitch_10
    check-cast v0, La/qow;

    .line 1400
    .line 1401
    move-object/from16 v11, p1

    .line 1402
    .line 1403
    check-cast v11, La/fet;

    .line 1404
    .line 1405
    move-object/from16 v1, p2

    .line 1406
    .line 1407
    check-cast v1, Ljava/lang/Integer;

    .line 1408
    .line 1409
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1410
    .line 1411
    .line 1412
    move-result v1

    .line 1413
    and-int/lit8 v2, v1, 0x3

    .line 1414
    .line 1415
    if-eq v2, v6, :cond_33

    .line 1416
    .line 1417
    move v4, v7

    .line 1418
    :cond_33
    and-int/2addr v1, v7

    .line 1419
    invoke-virtual {v11, v1, v4}, La/fet;->U(IZ)Z

    .line 1420
    .line 1421
    .line 1422
    move-result v1

    .line 1423
    if-eqz v1, :cond_37

    .line 1424
    .line 1425
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v1

    .line 1429
    if-ne v1, v3, :cond_34

    .line 1430
    .line 1431
    new-instance v1, La/h7w;

    .line 1432
    .line 1433
    const/16 v2, 0xa

    .line 1434
    .line 1435
    invoke-direct {v1, v2}, La/h7w;-><init>(B)V

    .line 1436
    .line 1437
    .line 1438
    invoke-virtual {v11, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1439
    .line 1440
    .line 1441
    :cond_34
    move-object v8, v1

    .line 1442
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 1443
    .line 1444
    invoke-virtual {v11, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1445
    .line 1446
    .line 1447
    move-result v1

    .line 1448
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 1449
    .line 1450
    .line 1451
    move-result-object v2

    .line 1452
    if-nez v1, :cond_35

    .line 1453
    .line 1454
    if-ne v2, v3, :cond_36

    .line 1455
    .line 1456
    :cond_35
    new-instance v2, La/adw;

    .line 1457
    .line 1458
    invoke-direct {v2, v0, v6}, La/adw;-><init>(Ljava/lang/Object;B)V

    .line 1459
    .line 1460
    .line 1461
    invoke-virtual {v11, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1462
    .line 1463
    .line 1464
    :cond_36
    move-object v10, v2

    .line 1465
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 1466
    .line 1467
    const/4 v12, 0x6

    .line 1468
    const/4 v13, 0x0

    .line 1469
    sget-object v9, La/jm40;->b:La/jm40;

    .line 1470
    .line 1471
    invoke-static/range {v8 .. v13}, La/dwi0;->b(Lkotlin/jvm/functions/Function1;La/mm40;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 1472
    .line 1473
    .line 1474
    goto :goto_17

    .line 1475
    :cond_37
    invoke-virtual {v11}, La/fet;->X()V

    .line 1476
    .line 1477
    .line 1478
    :goto_17
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1479
    .line 1480
    return-object v0

    .line 1481
    :pswitch_11
    check-cast v0, La/dpw;

    .line 1482
    .line 1483
    move-object/from16 v1, p1

    .line 1484
    .line 1485
    check-cast v1, La/fet;

    .line 1486
    .line 1487
    move-object/from16 v2, p2

    .line 1488
    .line 1489
    check-cast v2, Ljava/lang/Integer;

    .line 1490
    .line 1491
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1492
    .line 1493
    .line 1494
    const/4 v2, 0x7

    .line 1495
    invoke-static {v2}, La/x8x;->L(I)I

    .line 1496
    .line 1497
    .line 1498
    move-result v2

    .line 1499
    invoke-static {v0, v1, v2}, La/qbc;->w(La/dpw;La/fet;I)V

    .line 1500
    .line 1501
    .line 1502
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1503
    .line 1504
    return-object v0

    .line 1505
    :pswitch_12
    check-cast v0, La/fow;

    .line 1506
    .line 1507
    iget-object v0, v0, La/fow;->N1:La/a8z;

    .line 1508
    .line 1509
    move-object/from16 v1, p1

    .line 1510
    .line 1511
    check-cast v1, La/fet;

    .line 1512
    .line 1513
    move-object/from16 v5, p2

    .line 1514
    .line 1515
    check-cast v5, Ljava/lang/Integer;

    .line 1516
    .line 1517
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1518
    .line 1519
    .line 1520
    move-result v5

    .line 1521
    sget-object v8, La/fow;->P1:La/art;

    .line 1522
    .line 1523
    and-int/lit8 v8, v5, 0x3

    .line 1524
    .line 1525
    if-eq v8, v6, :cond_38

    .line 1526
    .line 1527
    move v6, v7

    .line 1528
    goto :goto_18

    .line 1529
    :cond_38
    move v6, v4

    .line 1530
    :goto_18
    and-int/2addr v5, v7

    .line 1531
    invoke-virtual {v1, v5, v6}, La/fet;->U(IZ)Z

    .line 1532
    .line 1533
    .line 1534
    move-result v5

    .line 1535
    if-eqz v5, :cond_3b

    .line 1536
    .line 1537
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1538
    .line 1539
    .line 1540
    move-result-object v5

    .line 1541
    check-cast v5, La/k3t0;

    .line 1542
    .line 1543
    check-cast v5, La/i3t0;

    .line 1544
    .line 1545
    invoke-virtual {v5, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 1546
    .line 1547
    .line 1548
    move-result-object v5

    .line 1549
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1550
    .line 1551
    .line 1552
    move-result-object v0

    .line 1553
    move-object v8, v0

    .line 1554
    check-cast v8, La/k3t0;

    .line 1555
    .line 1556
    invoke-virtual {v1, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1557
    .line 1558
    .line 1559
    move-result v0

    .line 1560
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v6

    .line 1564
    if-nez v0, :cond_39

    .line 1565
    .line 1566
    if-ne v6, v3, :cond_3a

    .line 1567
    .line 1568
    :cond_39
    new-instance v6, La/n5w;

    .line 1569
    .line 1570
    const/4 v12, 0x0

    .line 1571
    const/16 v13, 0x16

    .line 1572
    .line 1573
    const/4 v7, 0x1

    .line 1574
    const-class v9, La/k3t0;

    .line 1575
    .line 1576
    const-string v10, "onAction"

    .line 1577
    .line 1578
    const-string v11, "onAction(Ljava/lang/Object;)V"

    .line 1579
    .line 1580
    invoke-direct/range {v6 .. v13}, La/n5w;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1581
    .line 1582
    .line 1583
    invoke-virtual {v1, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1584
    .line 1585
    .line 1586
    :cond_3a
    check-cast v6, La/jhy;

    .line 1587
    .line 1588
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 1589
    .line 1590
    invoke-static {v4, v1, v2, v5, v6}, La/ay3;->s(ILa/fet;La/mm40;La/l7m0;Lkotlin/jvm/functions/Function1;)V

    .line 1591
    .line 1592
    .line 1593
    goto :goto_19

    .line 1594
    :cond_3b
    invoke-virtual {v1}, La/fet;->X()V

    .line 1595
    .line 1596
    .line 1597
    :goto_19
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1598
    .line 1599
    return-object v0

    .line 1600
    :pswitch_13
    check-cast v0, La/xmw;

    .line 1601
    .line 1602
    move-object/from16 v1, p1

    .line 1603
    .line 1604
    check-cast v1, La/fet;

    .line 1605
    .line 1606
    move-object/from16 v2, p2

    .line 1607
    .line 1608
    check-cast v2, Ljava/lang/Integer;

    .line 1609
    .line 1610
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1611
    .line 1612
    .line 1613
    invoke-static {v7}, La/x8x;->L(I)I

    .line 1614
    .line 1615
    .line 1616
    move-result v2

    .line 1617
    invoke-static {v0, v1, v2}, La/kbc;->v(La/xmw;La/fet;I)V

    .line 1618
    .line 1619
    .line 1620
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1621
    .line 1622
    return-object v0

    .line 1623
    :pswitch_14
    check-cast v0, La/vmw;

    .line 1624
    .line 1625
    iget-object v0, v0, La/vmw;->O1:La/a8z;

    .line 1626
    .line 1627
    move-object/from16 v1, p1

    .line 1628
    .line 1629
    check-cast v1, La/fet;

    .line 1630
    .line 1631
    move-object/from16 v5, p2

    .line 1632
    .line 1633
    check-cast v5, Ljava/lang/Integer;

    .line 1634
    .line 1635
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1636
    .line 1637
    .line 1638
    move-result v5

    .line 1639
    sget-object v8, La/vmw;->Q1:La/tqt;

    .line 1640
    .line 1641
    and-int/lit8 v8, v5, 0x3

    .line 1642
    .line 1643
    if-eq v8, v6, :cond_3c

    .line 1644
    .line 1645
    move v6, v7

    .line 1646
    goto :goto_1a

    .line 1647
    :cond_3c
    move v6, v4

    .line 1648
    :goto_1a
    and-int/2addr v5, v7

    .line 1649
    invoke-virtual {v1, v5, v6}, La/fet;->U(IZ)Z

    .line 1650
    .line 1651
    .line 1652
    move-result v5

    .line 1653
    if-eqz v5, :cond_3f

    .line 1654
    .line 1655
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1656
    .line 1657
    .line 1658
    move-result-object v5

    .line 1659
    check-cast v5, La/k3t0;

    .line 1660
    .line 1661
    check-cast v5, La/i3t0;

    .line 1662
    .line 1663
    invoke-virtual {v5, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 1664
    .line 1665
    .line 1666
    move-result-object v5

    .line 1667
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1668
    .line 1669
    .line 1670
    move-result-object v0

    .line 1671
    move-object v8, v0

    .line 1672
    check-cast v8, La/k3t0;

    .line 1673
    .line 1674
    invoke-virtual {v1, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1675
    .line 1676
    .line 1677
    move-result v0

    .line 1678
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1679
    .line 1680
    .line 1681
    move-result-object v6

    .line 1682
    if-nez v0, :cond_3d

    .line 1683
    .line 1684
    if-ne v6, v3, :cond_3e

    .line 1685
    .line 1686
    :cond_3d
    new-instance v6, La/n5w;

    .line 1687
    .line 1688
    const/4 v12, 0x0

    .line 1689
    const/16 v13, 0x15

    .line 1690
    .line 1691
    const/4 v7, 0x1

    .line 1692
    const-class v9, La/k3t0;

    .line 1693
    .line 1694
    const-string v10, "onAction"

    .line 1695
    .line 1696
    const-string v11, "onAction(Ljava/lang/Object;)V"

    .line 1697
    .line 1698
    invoke-direct/range {v6 .. v13}, La/n5w;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1699
    .line 1700
    .line 1701
    invoke-virtual {v1, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1702
    .line 1703
    .line 1704
    :cond_3e
    check-cast v6, La/jhy;

    .line 1705
    .line 1706
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 1707
    .line 1708
    invoke-static {v4, v1, v2, v5, v6}, La/xf0;->r(ILa/fet;La/mm40;La/l7m0;Lkotlin/jvm/functions/Function1;)V

    .line 1709
    .line 1710
    .line 1711
    goto :goto_1b

    .line 1712
    :cond_3f
    invoke-virtual {v1}, La/fet;->X()V

    .line 1713
    .line 1714
    .line 1715
    :goto_1b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1716
    .line 1717
    return-object v0

    .line 1718
    :pswitch_15
    check-cast v0, La/cjw;

    .line 1719
    .line 1720
    move-object/from16 v1, p1

    .line 1721
    .line 1722
    check-cast v1, La/fet;

    .line 1723
    .line 1724
    move-object/from16 v2, p2

    .line 1725
    .line 1726
    check-cast v2, Ljava/lang/Integer;

    .line 1727
    .line 1728
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1729
    .line 1730
    .line 1731
    invoke-static {v7}, La/x8x;->L(I)I

    .line 1732
    .line 1733
    .line 1734
    move-result v2

    .line 1735
    invoke-static {v0, v1, v2}, La/s5x0;->p(La/cjw;La/fet;I)V

    .line 1736
    .line 1737
    .line 1738
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1739
    .line 1740
    return-object v0

    .line 1741
    :pswitch_16
    move-object v10, v0

    .line 1742
    check-cast v10, La/piw;

    .line 1743
    .line 1744
    move-object/from16 v14, p1

    .line 1745
    .line 1746
    check-cast v14, La/fet;

    .line 1747
    .line 1748
    move-object/from16 v0, p2

    .line 1749
    .line 1750
    check-cast v0, Ljava/lang/Integer;

    .line 1751
    .line 1752
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1753
    .line 1754
    .line 1755
    move-result v0

    .line 1756
    sget-object v1, La/piw;->Y1:La/sqt;

    .line 1757
    .line 1758
    and-int/lit8 v1, v0, 0x3

    .line 1759
    .line 1760
    if-eq v1, v6, :cond_40

    .line 1761
    .line 1762
    move v4, v7

    .line 1763
    :cond_40
    and-int/2addr v0, v7

    .line 1764
    invoke-virtual {v14, v0, v4}, La/fet;->U(IZ)Z

    .line 1765
    .line 1766
    .line 1767
    move-result v0

    .line 1768
    if-eqz v0, :cond_4f

    .line 1769
    .line 1770
    invoke-virtual {v14, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1771
    .line 1772
    .line 1773
    move-result v0

    .line 1774
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 1775
    .line 1776
    .line 1777
    move-result-object v1

    .line 1778
    if-nez v0, :cond_41

    .line 1779
    .line 1780
    if-ne v1, v3, :cond_42

    .line 1781
    .line 1782
    :cond_41
    new-instance v1, La/miw;

    .line 1783
    .line 1784
    const/4 v0, 0x4

    .line 1785
    invoke-direct {v1, v10, v0}, La/miw;-><init>(La/piw;B)V

    .line 1786
    .line 1787
    .line 1788
    invoke-virtual {v14, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1789
    .line 1790
    .line 1791
    :cond_42
    move-object v11, v1

    .line 1792
    check-cast v11, Lkotlin/jvm/functions/Function0;

    .line 1793
    .line 1794
    invoke-virtual {v14, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1795
    .line 1796
    .line 1797
    move-result v0

    .line 1798
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 1799
    .line 1800
    .line 1801
    move-result-object v1

    .line 1802
    if-nez v0, :cond_43

    .line 1803
    .line 1804
    if-ne v1, v3, :cond_44

    .line 1805
    .line 1806
    :cond_43
    new-instance v1, La/miw;

    .line 1807
    .line 1808
    const/4 v0, 0x5

    .line 1809
    invoke-direct {v1, v10, v0}, La/miw;-><init>(La/piw;B)V

    .line 1810
    .line 1811
    .line 1812
    invoke-virtual {v14, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1813
    .line 1814
    .line 1815
    :cond_44
    move-object v12, v1

    .line 1816
    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 1817
    .line 1818
    const/4 v15, 0x0

    .line 1819
    const/16 v16, 0x4

    .line 1820
    .line 1821
    const/4 v13, 0x0

    .line 1822
    invoke-static/range {v11 .. v16}, La/v3c;->z(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 1823
    .line 1824
    .line 1825
    move-object v0, v14

    .line 1826
    invoke-virtual {v10}, La/piw;->H0()La/k3t0;

    .line 1827
    .line 1828
    .line 1829
    move-result-object v1

    .line 1830
    check-cast v1, La/i3t0;

    .line 1831
    .line 1832
    invoke-virtual {v1, v0}, La/i3t0;->y(La/fet;)La/pz40;

    .line 1833
    .line 1834
    .line 1835
    move-result-object v1

    .line 1836
    invoke-virtual {v10}, La/piw;->H0()La/k3t0;

    .line 1837
    .line 1838
    .line 1839
    move-result-object v2

    .line 1840
    invoke-virtual {v0, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1841
    .line 1842
    .line 1843
    move-result v4

    .line 1844
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1845
    .line 1846
    .line 1847
    move-result-object v8

    .line 1848
    if-nez v4, :cond_45

    .line 1849
    .line 1850
    if-ne v8, v3, :cond_46

    .line 1851
    .line 1852
    :cond_45
    new-instance v8, La/n5w;

    .line 1853
    .line 1854
    const/4 v14, 0x0

    .line 1855
    const/16 v15, 0x14

    .line 1856
    .line 1857
    const/4 v9, 0x1

    .line 1858
    const-class v11, La/piw;

    .line 1859
    .line 1860
    const-string v12, "handleSideEffect"

    .line 1861
    .line 1862
    const-string v13, "handleSideEffect(Lorg/xplatform/cyber/section/impl/home/presentation/screen/common/model/HomeSideEffect;)V"

    .line 1863
    .line 1864
    invoke-direct/range {v8 .. v15}, La/n5w;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1865
    .line 1866
    .line 1867
    invoke-virtual {v0, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1868
    .line 1869
    .line 1870
    :cond_46
    check-cast v8, La/jhy;

    .line 1871
    .line 1872
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 1873
    .line 1874
    sget-object v4, La/lkz;->a:La/lkz;

    .line 1875
    .line 1876
    invoke-static {v8, v0}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 1877
    .line 1878
    .line 1879
    move-result-object v11

    .line 1880
    invoke-virtual {v0, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1881
    .line 1882
    .line 1883
    move-result v4

    .line 1884
    invoke-virtual {v0, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1885
    .line 1886
    .line 1887
    move-result v8

    .line 1888
    or-int/2addr v4, v8

    .line 1889
    invoke-virtual {v0, v5}, La/fet;->e(I)Z

    .line 1890
    .line 1891
    .line 1892
    move-result v8

    .line 1893
    or-int/2addr v4, v8

    .line 1894
    invoke-virtual {v0, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1895
    .line 1896
    .line 1897
    move-result v8

    .line 1898
    or-int/2addr v4, v8

    .line 1899
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1900
    .line 1901
    .line 1902
    move-result-object v8

    .line 1903
    if-nez v4, :cond_47

    .line 1904
    .line 1905
    if-ne v8, v3, :cond_48

    .line 1906
    .line 1907
    :cond_47
    new-instance v8, La/bio;

    .line 1908
    .line 1909
    const/4 v12, 0x0

    .line 1910
    const/16 v13, 0xf

    .line 1911
    .line 1912
    move-object v9, v2

    .line 1913
    invoke-direct/range {v8 .. v13}, La/bio;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 1914
    .line 1915
    .line 1916
    invoke-virtual {v0, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1917
    .line 1918
    .line 1919
    :cond_48
    check-cast v8, Lkotlin/jvm/functions/Function2;

    .line 1920
    .line 1921
    invoke-static {v0, v10, v8}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1922
    .line 1923
    .line 1924
    iget-object v12, v10, La/piw;->V1:La/qdz;

    .line 1925
    .line 1926
    invoke-virtual {v0, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1927
    .line 1928
    .line 1929
    move-result v2

    .line 1930
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1931
    .line 1932
    .line 1933
    move-result-object v4

    .line 1934
    if-nez v2, :cond_49

    .line 1935
    .line 1936
    if-ne v4, v3, :cond_4a

    .line 1937
    .line 1938
    :cond_49
    new-instance v4, La/kiw;

    .line 1939
    .line 1940
    invoke-direct {v4, v10, v6}, La/kiw;-><init>(La/piw;B)V

    .line 1941
    .line 1942
    .line 1943
    invoke-virtual {v0, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1944
    .line 1945
    .line 1946
    :cond_4a
    move-object v13, v4

    .line 1947
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 1948
    .line 1949
    invoke-virtual {v0, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1950
    .line 1951
    .line 1952
    move-result v2

    .line 1953
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1954
    .line 1955
    .line 1956
    move-result-object v4

    .line 1957
    if-nez v2, :cond_4b

    .line 1958
    .line 1959
    if-ne v4, v3, :cond_4c

    .line 1960
    .line 1961
    :cond_4b
    new-instance v4, La/kiw;

    .line 1962
    .line 1963
    invoke-direct {v4, v10, v5}, La/kiw;-><init>(La/piw;B)V

    .line 1964
    .line 1965
    .line 1966
    invoke-virtual {v0, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1967
    .line 1968
    .line 1969
    :cond_4c
    move-object v14, v4

    .line 1970
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 1971
    .line 1972
    invoke-virtual {v0, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1973
    .line 1974
    .line 1975
    move-result v2

    .line 1976
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1977
    .line 1978
    .line 1979
    move-result-object v4

    .line 1980
    if-nez v2, :cond_4d

    .line 1981
    .line 1982
    if-ne v4, v3, :cond_4e

    .line 1983
    .line 1984
    :cond_4d
    new-instance v4, La/kiw;

    .line 1985
    .line 1986
    invoke-direct {v4, v10, v7}, La/kiw;-><init>(La/piw;B)V

    .line 1987
    .line 1988
    .line 1989
    invoke-virtual {v0, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1990
    .line 1991
    .line 1992
    :cond_4e
    move-object v15, v4

    .line 1993
    check-cast v15, Lkotlin/jvm/functions/Function1;

    .line 1994
    .line 1995
    const/16 v17, 0x0

    .line 1996
    .line 1997
    move-object/from16 v16, v0

    .line 1998
    .line 1999
    move-object v11, v1

    .line 2000
    invoke-static/range {v11 .. v17}, La/cfx0;->l(La/l7m0;La/qdz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 2001
    .line 2002
    .line 2003
    goto :goto_1c

    .line 2004
    :cond_4f
    invoke-virtual {v14}, La/fet;->X()V

    .line 2005
    .line 2006
    .line 2007
    :goto_1c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2008
    .line 2009
    return-object v0

    .line 2010
    :pswitch_17
    move-object v8, v0

    .line 2011
    check-cast v8, La/oiw;

    .line 2012
    .line 2013
    iget-object v0, v8, La/oiw;->N1:La/a8z;

    .line 2014
    .line 2015
    move-object/from16 v1, p1

    .line 2016
    .line 2017
    check-cast v1, La/fet;

    .line 2018
    .line 2019
    move-object/from16 v2, p2

    .line 2020
    .line 2021
    check-cast v2, Ljava/lang/Integer;

    .line 2022
    .line 2023
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 2024
    .line 2025
    .line 2026
    move-result v2

    .line 2027
    and-int/lit8 v9, v2, 0x3

    .line 2028
    .line 2029
    if-eq v9, v6, :cond_50

    .line 2030
    .line 2031
    move v6, v7

    .line 2032
    goto :goto_1d

    .line 2033
    :cond_50
    move v6, v4

    .line 2034
    :goto_1d
    and-int/2addr v2, v7

    .line 2035
    invoke-virtual {v1, v2, v6}, La/fet;->U(IZ)Z

    .line 2036
    .line 2037
    .line 2038
    move-result v2

    .line 2039
    if-eqz v2, :cond_57

    .line 2040
    .line 2041
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 2042
    .line 2043
    .line 2044
    move-result-object v2

    .line 2045
    check-cast v2, La/k3t0;

    .line 2046
    .line 2047
    invoke-virtual {v1, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2048
    .line 2049
    .line 2050
    move-result v6

    .line 2051
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 2052
    .line 2053
    .line 2054
    move-result-object v7

    .line 2055
    if-nez v6, :cond_52

    .line 2056
    .line 2057
    if-ne v7, v3, :cond_51

    .line 2058
    .line 2059
    goto :goto_1e

    .line 2060
    :cond_51
    move-object v6, v7

    .line 2061
    move-object v7, v8

    .line 2062
    goto :goto_1f

    .line 2063
    :cond_52
    :goto_1e
    new-instance v6, La/n5w;

    .line 2064
    .line 2065
    const/4 v12, 0x0

    .line 2066
    const/16 v13, 0x12

    .line 2067
    .line 2068
    const/4 v7, 0x1

    .line 2069
    const-class v9, La/oiw;

    .line 2070
    .line 2071
    const-string v10, "handleSideEffect"

    .line 2072
    .line 2073
    const-string v11, "handleSideEffect(Lorg/xplatform/ufc/impl/home/presentation/model/HomeSideEffect;)V"

    .line 2074
    .line 2075
    invoke-direct/range {v6 .. v13}, La/n5w;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2076
    .line 2077
    .line 2078
    move-object v7, v8

    .line 2079
    invoke-virtual {v1, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2080
    .line 2081
    .line 2082
    :goto_1f
    check-cast v6, La/jhy;

    .line 2083
    .line 2084
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 2085
    .line 2086
    sget-object v8, La/lkz;->a:La/lkz;

    .line 2087
    .line 2088
    invoke-static {v6, v1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 2089
    .line 2090
    .line 2091
    move-result-object v8

    .line 2092
    invoke-virtual {v1, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2093
    .line 2094
    .line 2095
    move-result v6

    .line 2096
    invoke-virtual {v1, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2097
    .line 2098
    .line 2099
    move-result v9

    .line 2100
    or-int/2addr v6, v9

    .line 2101
    invoke-virtual {v1, v5}, La/fet;->e(I)Z

    .line 2102
    .line 2103
    .line 2104
    move-result v5

    .line 2105
    or-int/2addr v5, v6

    .line 2106
    invoke-virtual {v1, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 2107
    .line 2108
    .line 2109
    move-result v6

    .line 2110
    or-int/2addr v5, v6

    .line 2111
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 2112
    .line 2113
    .line 2114
    move-result-object v6

    .line 2115
    if-nez v5, :cond_53

    .line 2116
    .line 2117
    if-ne v6, v3, :cond_54

    .line 2118
    .line 2119
    :cond_53
    new-instance v5, La/bio;

    .line 2120
    .line 2121
    const/4 v9, 0x0

    .line 2122
    const/16 v10, 0xe

    .line 2123
    .line 2124
    move-object v6, v2

    .line 2125
    invoke-direct/range {v5 .. v10}, La/bio;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 2126
    .line 2127
    .line 2128
    invoke-virtual {v1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2129
    .line 2130
    .line 2131
    move-object v6, v5

    .line 2132
    :cond_54
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 2133
    .line 2134
    invoke-static {v1, v7, v6}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2135
    .line 2136
    .line 2137
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 2138
    .line 2139
    .line 2140
    move-result-object v2

    .line 2141
    check-cast v2, La/k3t0;

    .line 2142
    .line 2143
    check-cast v2, La/i3t0;

    .line 2144
    .line 2145
    invoke-virtual {v2, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 2146
    .line 2147
    .line 2148
    move-result-object v2

    .line 2149
    iget-object v5, v7, La/oiw;->O1:La/qdz;

    .line 2150
    .line 2151
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 2152
    .line 2153
    .line 2154
    move-result-object v0

    .line 2155
    move-object v8, v0

    .line 2156
    check-cast v8, La/k3t0;

    .line 2157
    .line 2158
    invoke-virtual {v1, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2159
    .line 2160
    .line 2161
    move-result v0

    .line 2162
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 2163
    .line 2164
    .line 2165
    move-result-object v6

    .line 2166
    if-nez v0, :cond_55

    .line 2167
    .line 2168
    if-ne v6, v3, :cond_56

    .line 2169
    .line 2170
    :cond_55
    new-instance v6, La/n5w;

    .line 2171
    .line 2172
    const/4 v12, 0x0

    .line 2173
    const/16 v13, 0x13

    .line 2174
    .line 2175
    const/4 v7, 0x1

    .line 2176
    const-class v9, La/k3t0;

    .line 2177
    .line 2178
    const-string v10, "onAction"

    .line 2179
    .line 2180
    const-string v11, "onAction(Ljava/lang/Object;)V"

    .line 2181
    .line 2182
    invoke-direct/range {v6 .. v13}, La/n5w;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2183
    .line 2184
    .line 2185
    invoke-virtual {v1, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2186
    .line 2187
    .line 2188
    :cond_56
    check-cast v6, La/jhy;

    .line 2189
    .line 2190
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 2191
    .line 2192
    invoke-static {v2, v5, v6, v1, v4}, La/s5x0;->q(La/l7m0;La/qdz;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 2193
    .line 2194
    .line 2195
    goto :goto_20

    .line 2196
    :cond_57
    invoke-virtual {v1}, La/fet;->X()V

    .line 2197
    .line 2198
    .line 2199
    :goto_20
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2200
    .line 2201
    return-object v0

    .line 2202
    :pswitch_18
    move-object v4, v0

    .line 2203
    check-cast v4, La/tew;

    .line 2204
    .line 2205
    move-object/from16 v0, p1

    .line 2206
    .line 2207
    check-cast v0, La/oyg0;

    .line 2208
    .line 2209
    move-object/from16 v1, p2

    .line 2210
    .line 2211
    check-cast v1, La/lew;

    .line 2212
    .line 2213
    iget-object v0, v4, La/tew;->a:La/j0g0;

    .line 2214
    .line 2215
    if-eqz v0, :cond_59

    .line 2216
    .line 2217
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 2218
    .line 2219
    instance-of v3, v0, La/g0g0;

    .line 2220
    .line 2221
    if-eqz v3, :cond_58

    .line 2222
    .line 2223
    goto :goto_21

    .line 2224
    :cond_58
    move-object v2, v0

    .line 2225
    :goto_21
    check-cast v2, La/new;

    .line 2226
    .line 2227
    :cond_59
    iget-wide v5, v1, La/lew;->a:J

    .line 2228
    .line 2229
    const-wide/16 v7, 0x0

    .line 2230
    .line 2231
    cmp-long v0, v5, v7

    .line 2232
    .line 2233
    if-eqz v0, :cond_5a

    .line 2234
    .line 2235
    :goto_22
    move-wide v2, v5

    .line 2236
    goto :goto_23

    .line 2237
    :cond_5a
    if-eqz v2, :cond_5b

    .line 2238
    .line 2239
    iget-object v0, v2, La/new;->b:Ljava/util/List;

    .line 2240
    .line 2241
    if-eqz v0, :cond_5b

    .line 2242
    .line 2243
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 2244
    .line 2245
    .line 2246
    move-result-object v0

    .line 2247
    check-cast v0, La/vcw;

    .line 2248
    .line 2249
    if-eqz v0, :cond_5b

    .line 2250
    .line 2251
    iget-wide v5, v0, La/vcw;->a:J

    .line 2252
    .line 2253
    goto :goto_22

    .line 2254
    :cond_5b
    move-wide v2, v7

    .line 2255
    :goto_23
    const/4 v5, 0x0

    .line 2256
    const/16 v6, 0xc

    .line 2257
    .line 2258
    invoke-static/range {v1 .. v6}, La/lew;->a(La/lew;JLa/tew;Ljava/util/LinkedHashMap;I)La/lew;

    .line 2259
    .line 2260
    .line 2261
    move-result-object v0

    .line 2262
    return-object v0

    .line 2263
    :pswitch_19
    move-object v8, v0

    .line 2264
    check-cast v8, La/cdw;

    .line 2265
    .line 2266
    move-object/from16 v12, p1

    .line 2267
    .line 2268
    check-cast v12, La/fet;

    .line 2269
    .line 2270
    move-object/from16 v0, p2

    .line 2271
    .line 2272
    check-cast v0, Ljava/lang/Integer;

    .line 2273
    .line 2274
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 2275
    .line 2276
    .line 2277
    move-result v0

    .line 2278
    sget-object v1, La/cdw;->R1:La/rqt;

    .line 2279
    .line 2280
    and-int/lit8 v1, v0, 0x3

    .line 2281
    .line 2282
    if-eq v1, v6, :cond_5c

    .line 2283
    .line 2284
    move v1, v7

    .line 2285
    goto :goto_24

    .line 2286
    :cond_5c
    move v1, v4

    .line 2287
    :goto_24
    and-int/2addr v0, v7

    .line 2288
    invoke-virtual {v12, v0, v1}, La/fet;->U(IZ)Z

    .line 2289
    .line 2290
    .line 2291
    move-result v0

    .line 2292
    if-eqz v0, :cond_67

    .line 2293
    .line 2294
    invoke-virtual {v12, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2295
    .line 2296
    .line 2297
    move-result v0

    .line 2298
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 2299
    .line 2300
    .line 2301
    move-result-object v1

    .line 2302
    if-nez v0, :cond_5d

    .line 2303
    .line 2304
    if-ne v1, v3, :cond_5e

    .line 2305
    .line 2306
    :cond_5d
    new-instance v1, La/zcw;

    .line 2307
    .line 2308
    invoke-direct {v1, v8, v6}, La/zcw;-><init>(La/cdw;B)V

    .line 2309
    .line 2310
    .line 2311
    invoke-virtual {v12, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2312
    .line 2313
    .line 2314
    :cond_5e
    move-object v9, v1

    .line 2315
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 2316
    .line 2317
    invoke-virtual {v12, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2318
    .line 2319
    .line 2320
    move-result v0

    .line 2321
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 2322
    .line 2323
    .line 2324
    move-result-object v1

    .line 2325
    if-nez v0, :cond_5f

    .line 2326
    .line 2327
    if-ne v1, v3, :cond_60

    .line 2328
    .line 2329
    :cond_5f
    new-instance v1, La/zcw;

    .line 2330
    .line 2331
    invoke-direct {v1, v8, v5}, La/zcw;-><init>(La/cdw;B)V

    .line 2332
    .line 2333
    .line 2334
    invoke-virtual {v12, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2335
    .line 2336
    .line 2337
    :cond_60
    move-object v10, v1

    .line 2338
    check-cast v10, Lkotlin/jvm/functions/Function0;

    .line 2339
    .line 2340
    const/4 v13, 0x0

    .line 2341
    const/4 v14, 0x4

    .line 2342
    const/4 v11, 0x0

    .line 2343
    invoke-static/range {v9 .. v14}, La/v3c;->z(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 2344
    .line 2345
    .line 2346
    move-object v0, v12

    .line 2347
    invoke-virtual {v8}, La/cdw;->G0()La/k3t0;

    .line 2348
    .line 2349
    .line 2350
    move-result-object v1

    .line 2351
    invoke-virtual {v0, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2352
    .line 2353
    .line 2354
    move-result v2

    .line 2355
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 2356
    .line 2357
    .line 2358
    move-result-object v6

    .line 2359
    if-nez v2, :cond_62

    .line 2360
    .line 2361
    if-ne v6, v3, :cond_61

    .line 2362
    .line 2363
    goto :goto_25

    .line 2364
    :cond_61
    move-object v7, v8

    .line 2365
    goto :goto_26

    .line 2366
    :cond_62
    :goto_25
    new-instance v6, La/n5w;

    .line 2367
    .line 2368
    const/4 v12, 0x0

    .line 2369
    const/16 v13, 0xd

    .line 2370
    .line 2371
    const/4 v7, 0x1

    .line 2372
    const-class v9, La/cdw;

    .line 2373
    .line 2374
    const-string v10, "handleSideEffect"

    .line 2375
    .line 2376
    const-string v11, "handleSideEffect(Lorg/xplatform/cyber/section/impl/championships/hltv_awards/presentation/main/screen/model/HltvAwardsSideEffect;)V"

    .line 2377
    .line 2378
    invoke-direct/range {v6 .. v13}, La/n5w;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2379
    .line 2380
    .line 2381
    move-object v7, v8

    .line 2382
    invoke-virtual {v0, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2383
    .line 2384
    .line 2385
    :goto_26
    check-cast v6, La/jhy;

    .line 2386
    .line 2387
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 2388
    .line 2389
    sget-object v2, La/lkz;->a:La/lkz;

    .line 2390
    .line 2391
    invoke-static {v6, v0}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 2392
    .line 2393
    .line 2394
    move-result-object v8

    .line 2395
    invoke-virtual {v0, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2396
    .line 2397
    .line 2398
    move-result v2

    .line 2399
    invoke-virtual {v0, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2400
    .line 2401
    .line 2402
    move-result v6

    .line 2403
    or-int/2addr v2, v6

    .line 2404
    invoke-virtual {v0, v5}, La/fet;->e(I)Z

    .line 2405
    .line 2406
    .line 2407
    move-result v5

    .line 2408
    or-int/2addr v2, v5

    .line 2409
    invoke-virtual {v0, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 2410
    .line 2411
    .line 2412
    move-result v5

    .line 2413
    or-int/2addr v2, v5

    .line 2414
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 2415
    .line 2416
    .line 2417
    move-result-object v5

    .line 2418
    if-nez v2, :cond_63

    .line 2419
    .line 2420
    if-ne v5, v3, :cond_64

    .line 2421
    .line 2422
    :cond_63
    new-instance v5, La/bio;

    .line 2423
    .line 2424
    const/4 v9, 0x0

    .line 2425
    const/16 v10, 0xd

    .line 2426
    .line 2427
    move-object v6, v1

    .line 2428
    invoke-direct/range {v5 .. v10}, La/bio;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 2429
    .line 2430
    .line 2431
    invoke-virtual {v0, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2432
    .line 2433
    .line 2434
    :cond_64
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 2435
    .line 2436
    invoke-static {v0, v7, v5}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2437
    .line 2438
    .line 2439
    invoke-virtual {v7}, La/cdw;->G0()La/k3t0;

    .line 2440
    .line 2441
    .line 2442
    move-result-object v1

    .line 2443
    check-cast v1, La/i3t0;

    .line 2444
    .line 2445
    invoke-virtual {v1, v0}, La/i3t0;->y(La/fet;)La/pz40;

    .line 2446
    .line 2447
    .line 2448
    move-result-object v1

    .line 2449
    invoke-virtual {v0, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2450
    .line 2451
    .line 2452
    move-result v2

    .line 2453
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 2454
    .line 2455
    .line 2456
    move-result-object v5

    .line 2457
    if-nez v2, :cond_65

    .line 2458
    .line 2459
    if-ne v5, v3, :cond_66

    .line 2460
    .line 2461
    :cond_65
    new-instance v5, La/adw;

    .line 2462
    .line 2463
    invoke-direct {v5, v7, v4}, La/adw;-><init>(Ljava/lang/Object;B)V

    .line 2464
    .line 2465
    .line 2466
    invoke-virtual {v0, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2467
    .line 2468
    .line 2469
    :cond_66
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 2470
    .line 2471
    invoke-static {v1, v5, v0, v4}, La/wwb;->r(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 2472
    .line 2473
    .line 2474
    goto :goto_27

    .line 2475
    :cond_67
    move-object v0, v12

    .line 2476
    invoke-virtual {v0}, La/fet;->X()V

    .line 2477
    .line 2478
    .line 2479
    :goto_27
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2480
    .line 2481
    return-object v0

    .line 2482
    :pswitch_1a
    check-cast v0, La/naw;

    .line 2483
    .line 2484
    move-object/from16 v1, p1

    .line 2485
    .line 2486
    check-cast v1, Ljava/lang/Throwable;

    .line 2487
    .line 2488
    move-object/from16 v3, p2

    .line 2489
    .line 2490
    check-cast v3, Ljava/lang/String;

    .line 2491
    .line 2492
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2493
    .line 2494
    .line 2495
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2496
    .line 2497
    .line 2498
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2499
    .line 2500
    .line 2501
    move-result-object v1

    .line 2502
    new-instance v4, La/j0s;

    .line 2503
    .line 2504
    const/16 v6, 0x1d

    .line 2505
    .line 2506
    invoke-direct {v4, v0, v3, v2, v6}, La/j0s;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 2507
    .line 2508
    .line 2509
    invoke-static {v1, v2, v2, v4, v5}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 2510
    .line 2511
    .line 2512
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2513
    .line 2514
    return-object v0

    .line 2515
    :pswitch_1b
    check-cast v0, La/r2w;

    .line 2516
    .line 2517
    move-object/from16 v1, p1

    .line 2518
    .line 2519
    check-cast v1, Ljava/lang/Throwable;

    .line 2520
    .line 2521
    move-object/from16 v2, p2

    .line 2522
    .line 2523
    check-cast v2, Ljava/lang/String;

    .line 2524
    .line 2525
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2526
    .line 2527
    .line 2528
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2529
    .line 2530
    .line 2531
    iget-object v1, v0, La/r2w;->y:La/p7m0;

    .line 2532
    .line 2533
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 2534
    .line 2535
    .line 2536
    move-result-object v1

    .line 2537
    check-cast v1, La/d3w;

    .line 2538
    .line 2539
    iget-boolean v2, v1, La/d3w;->d:Z

    .line 2540
    .line 2541
    if-nez v2, :cond_68

    .line 2542
    .line 2543
    iget-boolean v2, v1, La/d3w;->e:Z

    .line 2544
    .line 2545
    if-nez v2, :cond_68

    .line 2546
    .line 2547
    iget-boolean v1, v1, La/d3w;->f:Z

    .line 2548
    .line 2549
    if-nez v1, :cond_68

    .line 2550
    .line 2551
    goto :goto_28

    .line 2552
    :cond_68
    invoke-virtual {v0}, La/r2w;->D()V

    .line 2553
    .line 2554
    .line 2555
    :goto_28
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2556
    .line 2557
    return-object v0

    .line 2558
    :pswitch_1c
    check-cast v0, La/vmu0;

    .line 2559
    .line 2560
    move-object/from16 v1, p1

    .line 2561
    .line 2562
    check-cast v1, La/yxv;

    .line 2563
    .line 2564
    move-object/from16 v2, p2

    .line 2565
    .line 2566
    check-cast v2, La/yxv;

    .line 2567
    .line 2568
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2569
    .line 2570
    .line 2571
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2572
    .line 2573
    .line 2574
    iget-object v3, v1, La/yxv;->a:La/vmu0;

    .line 2575
    .line 2576
    sget-object v4, La/gp00;->b:La/gp00;

    .line 2577
    .line 2578
    invoke-static {v0, v3, v4}, La/qcc;->e0(La/vmu0;La/vmu0;La/gp00;)Z

    .line 2579
    .line 2580
    .line 2581
    move-result v3

    .line 2582
    if-eqz v3, :cond_69

    .line 2583
    .line 2584
    iput-object v0, v1, La/yxv;->a:La/vmu0;

    .line 2585
    .line 2586
    iget-object v1, v1, La/yxv;->b:La/qoj0;

    .line 2587
    .line 2588
    invoke-virtual {v1, v0}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 2589
    .line 2590
    .line 2591
    :cond_69
    iget-object v1, v2, La/yxv;->a:La/vmu0;

    .line 2592
    .line 2593
    sget-object v3, La/gp00;->c:La/gp00;

    .line 2594
    .line 2595
    invoke-static {v0, v1, v3}, La/qcc;->e0(La/vmu0;La/vmu0;La/gp00;)Z

    .line 2596
    .line 2597
    .line 2598
    move-result v1

    .line 2599
    if-eqz v1, :cond_6a

    .line 2600
    .line 2601
    iput-object v0, v2, La/yxv;->a:La/vmu0;

    .line 2602
    .line 2603
    iget-object v1, v2, La/yxv;->b:La/qoj0;

    .line 2604
    .line 2605
    invoke-virtual {v1, v0}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 2606
    .line 2607
    .line 2608
    :cond_6a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2609
    .line 2610
    return-object v0

    .line 2611
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
