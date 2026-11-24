.class public final synthetic La/f2s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/j2s;


# direct methods
.method public synthetic constructor <init>(La/j2s;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/f2s;->a:B

    iput-object p1, p0, La/f2s;->b:La/j2s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/f2s;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/f2s;->b:La/j2s;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v0, p1

    .line 11
    .line 12
    check-cast v0, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    move-object/from16 v1, p2

    .line 19
    .line 20
    check-cast v1, Ljava/util/List;

    .line 21
    .line 22
    sget-object v3, La/j2s;->b2:La/xak;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, La/j2s;->J0()La/k3t0;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    new-instance v3, La/o1s;

    .line 32
    .line 33
    invoke-direct {v3, v0, v1}, La/o1s;-><init>(ILjava/util/List;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v3}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object v0

    .line 42
    :pswitch_0
    move-object/from16 v0, p1

    .line 43
    .line 44
    check-cast v0, Ljava/lang/Long;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 47
    .line 48
    .line 49
    move-result-wide v0

    .line 50
    move-object/from16 v3, p2

    .line 51
    .line 52
    check-cast v3, Ljava/lang/Boolean;

    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    sget-object v4, La/j2s;->b2:La/xak;

    .line 59
    .line 60
    invoke-virtual {v2}, La/j2s;->J0()La/k3t0;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    new-instance v4, La/j1s;

    .line 65
    .line 66
    invoke-direct {v4, v3, v0, v1}, La/j1s;-><init>(ZJ)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v4}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object v0

    .line 75
    :pswitch_1
    move-object/from16 v1, p1

    .line 76
    .line 77
    check-cast v1, La/fet;

    .line 78
    .line 79
    move-object/from16 v2, p2

    .line 80
    .line 81
    check-cast v2, Ljava/lang/Integer;

    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    sget-object v3, La/j2s;->b2:La/xak;

    .line 88
    .line 89
    and-int/lit8 v3, v2, 0x3

    .line 90
    .line 91
    const/4 v4, 0x2

    .line 92
    const/4 v5, 0x1

    .line 93
    const/4 v6, 0x0

    .line 94
    if-eq v3, v4, :cond_0

    .line 95
    .line 96
    move v3, v5

    .line 97
    goto :goto_0

    .line 98
    :cond_0
    move v3, v6

    .line 99
    :goto_0
    and-int/2addr v2, v5

    .line 100
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-eqz v2, :cond_26

    .line 105
    .line 106
    iget-object v9, v0, La/f2s;->b:La/j2s;

    .line 107
    .line 108
    invoke-virtual {v9}, La/j2s;->J0()La/k3t0;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v1, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    sget-object v4, La/ukd;->a:La/cl5;

    .line 121
    .line 122
    if-nez v2, :cond_1

    .line 123
    .line 124
    if-ne v3, v4, :cond_2

    .line 125
    .line 126
    :cond_1
    new-instance v7, La/pop;

    .line 127
    .line 128
    const/4 v13, 0x0

    .line 129
    const/16 v14, 0x1d

    .line 130
    .line 131
    const/4 v8, 0x1

    .line 132
    const-class v10, La/j2s;

    .line 133
    .line 134
    const-string v11, "handleSideEffect"

    .line 135
    .line 136
    const-string v12, "handleSideEffect(Lorg/xplatform/sportgame/classic/impl/presentation/GameClassicSideEffect;)V"

    .line 137
    .line 138
    invoke-direct/range {v7 .. v14}, La/pop;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    move-object v3, v7

    .line 145
    :cond_2
    check-cast v3, La/jhy;

    .line 146
    .line 147
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 148
    .line 149
    sget-object v2, La/lkz;->a:La/lkz;

    .line 150
    .line 151
    invoke-static {v3, v1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 152
    .line 153
    .line 154
    move-result-object v10

    .line 155
    invoke-virtual {v1, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    invoke-virtual {v1, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    or-int/2addr v2, v3

    .line 164
    const/4 v3, 0x3

    .line 165
    invoke-virtual {v1, v3}, La/fet;->e(I)Z

    .line 166
    .line 167
    .line 168
    move-result v7

    .line 169
    or-int/2addr v2, v7

    .line 170
    invoke-virtual {v1, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v7

    .line 174
    or-int/2addr v2, v7

    .line 175
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v7

    .line 179
    const/4 v11, 0x0

    .line 180
    if-nez v2, :cond_3

    .line 181
    .line 182
    if-ne v7, v4, :cond_4

    .line 183
    .line 184
    :cond_3
    new-instance v7, La/bio;

    .line 185
    .line 186
    const/16 v12, 0x8

    .line 187
    .line 188
    move-object v8, v0

    .line 189
    invoke-direct/range {v7 .. v12}, La/bio;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    :cond_4
    check-cast v7, Lkotlin/jvm/functions/Function2;

    .line 196
    .line 197
    invoke-static {v1, v9, v7}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v9}, La/j2s;->J0()La/k3t0;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    check-cast v0, La/i3t0;

    .line 205
    .line 206
    invoke-virtual {v0, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    new-array v2, v6, [Ljava/lang/Object;

    .line 211
    .line 212
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v7

    .line 216
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v8

    .line 220
    if-nez v7, :cond_5

    .line 221
    .line 222
    if-ne v8, v4, :cond_6

    .line 223
    .line 224
    :cond_5
    new-instance v8, La/zwp;

    .line 225
    .line 226
    const/16 v7, 0x15

    .line 227
    .line 228
    invoke-direct {v8, v0, v7}, La/zwp;-><init>(La/l7m0;B)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    :cond_6
    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 235
    .line 236
    invoke-static {v2, v8, v1}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 237
    .line 238
    .line 239
    move-result-object v19

    .line 240
    new-array v2, v6, [Ljava/lang/Object;

    .line 241
    .line 242
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v7

    .line 246
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v8

    .line 250
    const/16 v10, 0x17

    .line 251
    .line 252
    if-nez v7, :cond_7

    .line 253
    .line 254
    if-ne v8, v4, :cond_8

    .line 255
    .line 256
    :cond_7
    new-instance v8, La/zwp;

    .line 257
    .line 258
    invoke-direct {v8, v0, v10}, La/zwp;-><init>(La/l7m0;B)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    :cond_8
    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 265
    .line 266
    invoke-static {v2, v8, v1}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 267
    .line 268
    .line 269
    move-result-object v18

    .line 270
    new-array v2, v6, [Ljava/lang/Object;

    .line 271
    .line 272
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result v7

    .line 276
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v8

    .line 280
    if-nez v7, :cond_9

    .line 281
    .line 282
    if-ne v8, v4, :cond_a

    .line 283
    .line 284
    :cond_9
    new-instance v8, La/zwp;

    .line 285
    .line 286
    const/16 v7, 0x18

    .line 287
    .line 288
    invoke-direct {v8, v0, v7}, La/zwp;-><init>(La/l7m0;B)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    :cond_a
    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 295
    .line 296
    invoke-static {v2, v8, v1}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 297
    .line 298
    .line 299
    move-result-object v17

    .line 300
    new-array v2, v6, [Ljava/lang/Object;

    .line 301
    .line 302
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result v7

    .line 306
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v8

    .line 310
    if-nez v7, :cond_b

    .line 311
    .line 312
    if-ne v8, v4, :cond_c

    .line 313
    .line 314
    :cond_b
    new-instance v8, La/zwp;

    .line 315
    .line 316
    const/16 v7, 0x19

    .line 317
    .line 318
    invoke-direct {v8, v0, v7}, La/zwp;-><init>(La/l7m0;B)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    :cond_c
    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 325
    .line 326
    invoke-static {v2, v8, v1}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    new-array v7, v6, [Ljava/lang/Object;

    .line 331
    .line 332
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result v8

    .line 336
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v12

    .line 340
    if-nez v8, :cond_d

    .line 341
    .line 342
    if-ne v12, v4, :cond_e

    .line 343
    .line 344
    :cond_d
    new-instance v12, La/zwp;

    .line 345
    .line 346
    const/16 v8, 0xe

    .line 347
    .line 348
    invoke-direct {v12, v0, v8}, La/zwp;-><init>(La/l7m0;B)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v1, v12}, La/fet;->o0(Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    :cond_e
    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 355
    .line 356
    invoke-static {v7, v12, v1}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 357
    .line 358
    .line 359
    move-result-object v14

    .line 360
    new-array v7, v6, [Ljava/lang/Object;

    .line 361
    .line 362
    invoke-virtual {v1, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    move-result v8

    .line 366
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v12

    .line 370
    if-nez v8, :cond_f

    .line 371
    .line 372
    if-ne v12, v4, :cond_10

    .line 373
    .line 374
    :cond_f
    new-instance v12, La/zwp;

    .line 375
    .line 376
    const/16 v8, 0xf

    .line 377
    .line 378
    invoke-direct {v12, v2, v8}, La/zwp;-><init>(La/l7m0;B)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v1, v12}, La/fet;->o0(Ljava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    :cond_10
    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 385
    .line 386
    invoke-static {v7, v12, v1}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 387
    .line 388
    .line 389
    move-result-object v7

    .line 390
    new-array v8, v6, [Ljava/lang/Object;

    .line 391
    .line 392
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result v12

    .line 396
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v13

    .line 400
    if-nez v12, :cond_11

    .line 401
    .line 402
    if-ne v13, v4, :cond_12

    .line 403
    .line 404
    :cond_11
    new-instance v13, La/zwp;

    .line 405
    .line 406
    const/16 v12, 0x10

    .line 407
    .line 408
    invoke-direct {v13, v0, v12}, La/zwp;-><init>(La/l7m0;B)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v1, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 412
    .line 413
    .line 414
    :cond_12
    check-cast v13, Lkotlin/jvm/functions/Function0;

    .line 415
    .line 416
    invoke-static {v8, v13, v1}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 417
    .line 418
    .line 419
    move-result-object v15

    .line 420
    new-array v8, v6, [Ljava/lang/Object;

    .line 421
    .line 422
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    move-result v12

    .line 426
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v13

    .line 430
    if-nez v12, :cond_13

    .line 431
    .line 432
    if-ne v13, v4, :cond_14

    .line 433
    .line 434
    :cond_13
    new-instance v13, La/zwp;

    .line 435
    .line 436
    const/16 v12, 0x11

    .line 437
    .line 438
    invoke-direct {v13, v0, v12}, La/zwp;-><init>(La/l7m0;B)V

    .line 439
    .line 440
    .line 441
    invoke-virtual {v1, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    :cond_14
    check-cast v13, Lkotlin/jvm/functions/Function0;

    .line 445
    .line 446
    invoke-static {v8, v13, v1}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 447
    .line 448
    .line 449
    move-result-object v12

    .line 450
    sget-object v8, La/dy2;->a:La/zfn;

    .line 451
    .line 452
    invoke-virtual {v1, v8}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v8

    .line 456
    check-cast v8, Landroid/content/res/Configuration;

    .line 457
    .line 458
    invoke-static {v6, v6, v1, v6, v3}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 459
    .line 460
    .line 461
    move-result-object v13

    .line 462
    invoke-static {v6, v6, v1, v6, v3}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 463
    .line 464
    .line 465
    move-result-object v3

    .line 466
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v5

    .line 470
    const/16 v16, 0x0

    .line 471
    .line 472
    if-ne v5, v4, :cond_15

    .line 473
    .line 474
    invoke-static/range {v16 .. v16}, La/xf0;->c(F)La/t33;

    .line 475
    .line 476
    .line 477
    move-result-object v5

    .line 478
    invoke-virtual {v1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 479
    .line 480
    .line 481
    :cond_15
    check-cast v5, La/t33;

    .line 482
    .line 483
    move-object/from16 p0, v11

    .line 484
    .line 485
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v11

    .line 489
    if-ne v11, v4, :cond_16

    .line 490
    .line 491
    invoke-static/range {v16 .. v16}, La/xf0;->c(F)La/t33;

    .line 492
    .line 493
    .line 494
    move-result-object v11

    .line 495
    invoke-virtual {v1, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 496
    .line 497
    .line 498
    :cond_16
    check-cast v11, La/t33;

    .line 499
    .line 500
    new-array v10, v6, [Ljava/lang/Object;

    .line 501
    .line 502
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v6

    .line 506
    if-ne v6, v4, :cond_17

    .line 507
    .line 508
    new-instance v6, La/s9r;

    .line 509
    .line 510
    move-object/from16 v31, v7

    .line 511
    .line 512
    const/16 v7, 0x17

    .line 513
    .line 514
    invoke-direct {v6, v7}, La/s9r;-><init>(B)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v1, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 518
    .line 519
    .line 520
    goto :goto_1

    .line 521
    :cond_17
    move-object/from16 v31, v7

    .line 522
    .line 523
    :goto_1
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 524
    .line 525
    const/16 v7, 0x30

    .line 526
    .line 527
    invoke-static {v10, v6, v1, v7}, La/e9x;->Q([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;I)Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v6

    .line 531
    check-cast v6, La/agk0;

    .line 532
    .line 533
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v10

    .line 537
    if-ne v10, v4, :cond_18

    .line 538
    .line 539
    invoke-static/range {p0 .. p0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 540
    .line 541
    .line 542
    move-result-object v10

    .line 543
    invoke-virtual {v1, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 544
    .line 545
    .line 546
    :cond_18
    move-object/from16 v26, v10

    .line 547
    .line 548
    check-cast v26, La/pz40;

    .line 549
    .line 550
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v10

    .line 554
    if-ne v10, v4, :cond_19

    .line 555
    .line 556
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 557
    .line 558
    invoke-static {v10}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 559
    .line 560
    .line 561
    move-result-object v10

    .line 562
    invoke-virtual {v1, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 563
    .line 564
    .line 565
    :cond_19
    move-object/from16 v27, v10

    .line 566
    .line 567
    check-cast v27, La/pz40;

    .line 568
    .line 569
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v10

    .line 573
    if-ne v10, v4, :cond_1a

    .line 574
    .line 575
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 576
    .line 577
    invoke-static {v10}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 578
    .line 579
    .line 580
    move-result-object v10

    .line 581
    invoke-virtual {v1, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 582
    .line 583
    .line 584
    :cond_1a
    move-object/from16 v28, v10

    .line 585
    .line 586
    check-cast v28, La/pz40;

    .line 587
    .line 588
    sget-object v10, La/qmk;->a:La/zcl;

    .line 589
    .line 590
    const/high16 v10, 0x42b40000    # 90.0f

    .line 591
    .line 592
    invoke-static {v10, v1}, La/pkd;->b(FLa/fet;)F

    .line 593
    .line 594
    .line 595
    move-result v10

    .line 596
    iget v8, v8, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 597
    .line 598
    int-to-float v8, v8

    .line 599
    invoke-static {v1}, La/qmk;->a(La/fet;)La/wfn;

    .line 600
    .line 601
    .line 602
    move-result-object v7

    .line 603
    iget v7, v7, La/wfn;->d:F

    .line 604
    .line 605
    move/from16 v20, v7

    .line 606
    .line 607
    invoke-static {v1}, La/qmk;->a(La/fet;)La/wfn;

    .line 608
    .line 609
    .line 610
    move-result-object v7

    .line 611
    iget v7, v7, La/wfn;->d:F

    .line 612
    .line 613
    add-float v7, v20, v7

    .line 614
    .line 615
    sub-float/2addr v8, v7

    .line 616
    const/high16 v7, 0x3f100000    # 0.5625f

    .line 617
    .line 618
    mul-float/2addr v8, v7

    .line 619
    new-instance v7, La/ycl;

    .line 620
    .line 621
    invoke-direct {v7, v8}, La/ycl;-><init>(F)V

    .line 622
    .line 623
    .line 624
    new-instance v8, La/ycl;

    .line 625
    .line 626
    move-object/from16 v32, v12

    .line 627
    .line 628
    const/high16 v12, 0x43520000    # 210.0f

    .line 629
    .line 630
    invoke-direct {v8, v12}, La/ycl;-><init>(F)V

    .line 631
    .line 632
    .line 633
    new-instance v12, La/ycl;

    .line 634
    .line 635
    move-object/from16 v33, v14

    .line 636
    .line 637
    const/high16 v14, 0x43ac0000    # 344.0f

    .line 638
    .line 639
    invoke-direct {v12, v14}, La/ycl;-><init>(F)V

    .line 640
    .line 641
    .line 642
    invoke-static {v7, v8, v12}, La/l1e0;->h(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;

    .line 643
    .line 644
    .line 645
    move-result-object v7

    .line 646
    check-cast v7, La/ycl;

    .line 647
    .line 648
    iget v7, v7, La/ycl;->a:F

    .line 649
    .line 650
    invoke-static {v7, v1}, La/pkd;->b(FLa/fet;)F

    .line 651
    .line 652
    .line 653
    move-result v7

    .line 654
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 655
    .line 656
    .line 657
    move-result-object v8

    .line 658
    if-ne v8, v4, :cond_1b

    .line 659
    .line 660
    invoke-static {v7}, Landroidx/compose/runtime/e;->a(F)La/agk0;

    .line 661
    .line 662
    .line 663
    move-result-object v8

    .line 664
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 665
    .line 666
    .line 667
    :cond_1b
    move-object/from16 v29, v8

    .line 668
    .line 669
    check-cast v29, La/agk0;

    .line 670
    .line 671
    invoke-virtual {v1, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 672
    .line 673
    .line 674
    move-result v7

    .line 675
    invoke-virtual {v1, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 676
    .line 677
    .line 678
    move-result v8

    .line 679
    or-int/2addr v7, v8

    .line 680
    invoke-virtual {v1, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 681
    .line 682
    .line 683
    move-result v8

    .line 684
    or-int/2addr v7, v8

    .line 685
    invoke-virtual {v1, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 686
    .line 687
    .line 688
    move-result v8

    .line 689
    or-int/2addr v7, v8

    .line 690
    invoke-virtual {v1, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 691
    .line 692
    .line 693
    move-result v8

    .line 694
    or-int/2addr v7, v8

    .line 695
    invoke-virtual {v1, v10}, La/fet;->d(F)Z

    .line 696
    .line 697
    .line 698
    move-result v8

    .line 699
    or-int/2addr v7, v8

    .line 700
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 701
    .line 702
    .line 703
    move-result-object v8

    .line 704
    if-nez v7, :cond_1c

    .line 705
    .line 706
    if-ne v8, v4, :cond_1d

    .line 707
    .line 708
    :cond_1c
    new-instance v20, La/o2s;

    .line 709
    .line 710
    move-object/from16 v22, v3

    .line 711
    .line 712
    move-object/from16 v23, v5

    .line 713
    .line 714
    move-object/from16 v25, v6

    .line 715
    .line 716
    move/from16 v30, v10

    .line 717
    .line 718
    move-object/from16 v24, v11

    .line 719
    .line 720
    move-object/from16 v21, v13

    .line 721
    .line 722
    invoke-direct/range {v20 .. v30}, La/o2s;-><init>(La/xcz;La/xcz;La/t33;La/t33;La/agk0;La/pz40;La/pz40;La/pz40;La/agk0;F)V

    .line 723
    .line 724
    .line 725
    move-object/from16 v8, v20

    .line 726
    .line 727
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 728
    .line 729
    .line 730
    :cond_1d
    check-cast v8, La/o2s;

    .line 731
    .line 732
    const/4 v3, 0x0

    .line 733
    new-array v5, v3, [Ljava/lang/Object;

    .line 734
    .line 735
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 736
    .line 737
    .line 738
    move-result v3

    .line 739
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 740
    .line 741
    .line 742
    move-result-object v6

    .line 743
    if-nez v3, :cond_1e

    .line 744
    .line 745
    if-ne v6, v4, :cond_1f

    .line 746
    .line 747
    :cond_1e
    new-instance v6, La/zwp;

    .line 748
    .line 749
    const/16 v3, 0x12

    .line 750
    .line 751
    invoke-direct {v6, v0, v3}, La/zwp;-><init>(La/l7m0;B)V

    .line 752
    .line 753
    .line 754
    invoke-virtual {v1, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 755
    .line 756
    .line 757
    :cond_1f
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 758
    .line 759
    invoke-static {v5, v6, v1}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 760
    .line 761
    .line 762
    move-result-object v3

    .line 763
    const/4 v5, 0x0

    .line 764
    new-array v6, v5, [Ljava/lang/Object;

    .line 765
    .line 766
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 767
    .line 768
    .line 769
    move-result v5

    .line 770
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object v7

    .line 774
    if-nez v5, :cond_20

    .line 775
    .line 776
    if-ne v7, v4, :cond_21

    .line 777
    .line 778
    :cond_20
    new-instance v7, La/zwp;

    .line 779
    .line 780
    const/16 v5, 0x13

    .line 781
    .line 782
    invoke-direct {v7, v0, v5}, La/zwp;-><init>(La/l7m0;B)V

    .line 783
    .line 784
    .line 785
    invoke-virtual {v1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 786
    .line 787
    .line 788
    :cond_21
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 789
    .line 790
    invoke-static {v6, v7, v1}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 791
    .line 792
    .line 793
    move-result-object v13

    .line 794
    const/4 v5, 0x0

    .line 795
    new-array v0, v5, [Ljava/lang/Object;

    .line 796
    .line 797
    invoke-virtual {v1, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 798
    .line 799
    .line 800
    move-result v5

    .line 801
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 802
    .line 803
    .line 804
    move-result-object v6

    .line 805
    if-nez v5, :cond_22

    .line 806
    .line 807
    if-ne v6, v4, :cond_23

    .line 808
    .line 809
    :cond_22
    new-instance v6, La/zwp;

    .line 810
    .line 811
    const/16 v5, 0x16

    .line 812
    .line 813
    invoke-direct {v6, v2, v5}, La/zwp;-><init>(La/l7m0;B)V

    .line 814
    .line 815
    .line 816
    invoke-virtual {v1, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 817
    .line 818
    .line 819
    :cond_23
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 820
    .line 821
    invoke-static {v0, v6, v1}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 822
    .line 823
    .line 824
    move-result-object v0

    .line 825
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 826
    .line 827
    .line 828
    move-result-object v5

    .line 829
    invoke-virtual {v1, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 830
    .line 831
    .line 832
    move-result v6

    .line 833
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 834
    .line 835
    .line 836
    move-result v7

    .line 837
    or-int/2addr v6, v7

    .line 838
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 839
    .line 840
    .line 841
    move-result-object v7

    .line 842
    if-nez v6, :cond_24

    .line 843
    .line 844
    if-ne v7, v4, :cond_25

    .line 845
    .line 846
    :cond_24
    new-instance v7, La/j0s;

    .line 847
    .line 848
    move-object/from16 v11, p0

    .line 849
    .line 850
    const/4 v4, 0x1

    .line 851
    invoke-direct {v7, v9, v0, v11, v4}, La/j0s;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 852
    .line 853
    .line 854
    invoke-virtual {v1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 855
    .line 856
    .line 857
    :cond_25
    check-cast v7, Lkotlin/jvm/functions/Function2;

    .line 858
    .line 859
    invoke-static {v1, v5, v7}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 860
    .line 861
    .line 862
    new-instance v7, La/pej;

    .line 863
    .line 864
    move-object v10, v2

    .line 865
    move-object/from16 v16, v3

    .line 866
    .line 867
    move-object v11, v9

    .line 868
    move-object/from16 v9, v31

    .line 869
    .line 870
    move-object/from16 v12, v32

    .line 871
    .line 872
    move-object/from16 v14, v33

    .line 873
    .line 874
    const/16 v0, 0x30

    .line 875
    .line 876
    invoke-direct/range {v7 .. v19}, La/pej;-><init>(La/o2s;La/l7m0;La/l7m0;La/j2s;La/l7m0;La/l7m0;La/l7m0;La/l7m0;La/l7m0;La/l7m0;La/l7m0;La/l7m0;)V

    .line 877
    .line 878
    .line 879
    const v2, 0xfb5809c

    .line 880
    .line 881
    .line 882
    invoke-static {v2, v7, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 883
    .line 884
    .line 885
    move-result-object v2

    .line 886
    invoke-static {v2, v1, v0}, La/w9x;->m(La/ugd;La/fet;I)V

    .line 887
    .line 888
    .line 889
    goto :goto_2

    .line 890
    :cond_26
    invoke-virtual {v1}, La/fet;->X()V

    .line 891
    .line 892
    .line 893
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 894
    .line 895
    return-object v0

    .line 896
    nop

    .line 897
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
