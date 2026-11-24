.class public final synthetic La/wbb0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ccb0;


# direct methods
.method public synthetic constructor <init>(La/ccb0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wbb0;->a:B

    iput-object p1, p0, La/wbb0;->b:La/ccb0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/wbb0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object/from16 v8, p1

    .line 12
    .line 13
    check-cast v8, La/fet;

    .line 14
    .line 15
    move-object/from16 v1, p2

    .line 16
    .line 17
    check-cast v1, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    sget-object v5, La/ccb0;->X1:La/mi70;

    .line 24
    .line 25
    and-int/lit8 v5, v1, 0x3

    .line 26
    .line 27
    if-eq v5, v2, :cond_0

    .line 28
    .line 29
    move v5, v4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v5, v3

    .line 32
    :goto_0
    and-int/2addr v1, v4

    .line 33
    invoke-virtual {v8, v1, v5}, La/fet;->U(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_26

    .line 38
    .line 39
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    iget-object v11, v0, La/wbb0;->b:La/ccb0;

    .line 42
    .line 43
    invoke-virtual {v8, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    const/4 v12, 0x3

    .line 52
    sget-object v14, La/ukd;->a:La/cl5;

    .line 53
    .line 54
    if-nez v0, :cond_1

    .line 55
    .line 56
    if-ne v5, v14, :cond_2

    .line 57
    .line 58
    :cond_1
    new-instance v5, La/ybb0;

    .line 59
    .line 60
    invoke-direct {v5, v11, v12}, La/ybb0;-><init>(La/ccb0;B)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v8, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :cond_2
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 67
    .line 68
    invoke-static {v1, v5, v8}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v8, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    if-nez v0, :cond_3

    .line 80
    .line 81
    if-ne v1, v14, :cond_4

    .line 82
    .line 83
    :cond_3
    new-instance v1, La/xbb0;

    .line 84
    .line 85
    invoke-direct {v1, v11, v4}, La/xbb0;-><init>(La/ccb0;B)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v8, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_4
    move-object v5, v1

    .line 92
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 93
    .line 94
    invoke-virtual {v8, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    if-nez v0, :cond_5

    .line 103
    .line 104
    if-ne v1, v14, :cond_6

    .line 105
    .line 106
    :cond_5
    new-instance v1, La/xbb0;

    .line 107
    .line 108
    invoke-direct {v1, v11, v2}, La/xbb0;-><init>(La/ccb0;B)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v8, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    :cond_6
    move-object v6, v1

    .line 115
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 116
    .line 117
    const/4 v9, 0x0

    .line 118
    const/4 v10, 0x4

    .line 119
    const/4 v7, 0x0

    .line 120
    invoke-static/range {v5 .. v10}, La/v3c;->A(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v8, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    if-nez v0, :cond_7

    .line 132
    .line 133
    if-ne v1, v14, :cond_8

    .line 134
    .line 135
    :cond_7
    new-instance v1, La/xbb0;

    .line 136
    .line 137
    invoke-direct {v1, v11, v12}, La/xbb0;-><init>(La/ccb0;B)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v8, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_8
    move-object v5, v1

    .line 144
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 145
    .line 146
    invoke-virtual {v8, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    const/4 v2, 0x4

    .line 155
    if-nez v0, :cond_9

    .line 156
    .line 157
    if-ne v1, v14, :cond_a

    .line 158
    .line 159
    :cond_9
    new-instance v1, La/xbb0;

    .line 160
    .line 161
    invoke-direct {v1, v11, v2}, La/xbb0;-><init>(La/ccb0;B)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v8, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    :cond_a
    move-object v6, v1

    .line 168
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 169
    .line 170
    const/4 v9, 0x0

    .line 171
    const/4 v10, 0x4

    .line 172
    const/4 v7, 0x0

    .line 173
    invoke-static/range {v5 .. v10}, La/v3c;->z(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v11}, La/ccb0;->I0()La/k3t0;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    check-cast v0, La/i3t0;

    .line 181
    .line 182
    invoke-virtual {v0, v8}, La/i3t0;->y(La/fet;)La/pz40;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    new-array v1, v3, [Ljava/lang/Object;

    .line 187
    .line 188
    invoke-virtual {v8, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v5

    .line 192
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    if-nez v5, :cond_b

    .line 197
    .line 198
    if-ne v6, v14, :cond_c

    .line 199
    .line 200
    :cond_b
    new-instance v6, La/wda0;

    .line 201
    .line 202
    const/4 v5, 0x6

    .line 203
    invoke-direct {v6, v0, v5}, La/wda0;-><init>(La/l7m0;B)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v8, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    :cond_c
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 210
    .line 211
    invoke-static {v1, v6, v8}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    iget-object v5, v11, La/ccb0;->Q1:La/ib50;

    .line 216
    .line 217
    const/16 v19, 0x0

    .line 218
    .line 219
    if-eqz v5, :cond_25

    .line 220
    .line 221
    invoke-static {v5, v8}, La/tfx;->I(La/ib50;La/fet;)La/rzg0;

    .line 222
    .line 223
    .line 224
    move-result-object v5

    .line 225
    invoke-virtual {v8, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v6

    .line 229
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v7

    .line 233
    if-nez v6, :cond_d

    .line 234
    .line 235
    if-ne v7, v14, :cond_e

    .line 236
    .line 237
    :cond_d
    new-instance v7, La/ybb0;

    .line 238
    .line 239
    invoke-direct {v7, v11, v3}, La/ybb0;-><init>(La/ccb0;B)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v8, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    :cond_e
    move-object v6, v7

    .line 246
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 247
    .line 248
    invoke-virtual {v8, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v7

    .line 252
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v9

    .line 256
    if-nez v7, :cond_f

    .line 257
    .line 258
    if-ne v9, v14, :cond_10

    .line 259
    .line 260
    :cond_f
    new-instance v9, La/ybb0;

    .line 261
    .line 262
    invoke-direct {v9, v11, v4}, La/ybb0;-><init>(La/ccb0;B)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v8, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    :cond_10
    move-object v7, v9

    .line 269
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 270
    .line 271
    invoke-virtual {v8, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v4

    .line 275
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v9

    .line 279
    if-nez v4, :cond_11

    .line 280
    .line 281
    if-ne v9, v14, :cond_12

    .line 282
    .line 283
    :cond_11
    new-instance v9, La/ufp;

    .line 284
    .line 285
    const/16 v4, 0x15

    .line 286
    .line 287
    invoke-direct {v9, v0, v4}, La/ufp;-><init>(La/l7m0;B)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v8, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    :cond_12
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 294
    .line 295
    const/4 v10, 0x0

    .line 296
    move-object/from16 v23, v9

    .line 297
    .line 298
    move-object v9, v8

    .line 299
    move-object/from16 v8, v23

    .line 300
    .line 301
    invoke-static/range {v5 .. v10}, La/p7x;->G(La/rzg0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)La/pv40;

    .line 302
    .line 303
    .line 304
    move-result-object v4

    .line 305
    move-object v8, v9

    .line 306
    invoke-virtual {v11}, La/ccb0;->I0()La/k3t0;

    .line 307
    .line 308
    .line 309
    move-result-object v5

    .line 310
    invoke-virtual {v8, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    move-result v6

    .line 314
    invoke-virtual {v8, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    move-result v7

    .line 318
    or-int/2addr v6, v7

    .line 319
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v7

    .line 323
    const/16 v9, 0xf

    .line 324
    .line 325
    if-nez v6, :cond_13

    .line 326
    .line 327
    if-ne v7, v14, :cond_14

    .line 328
    .line 329
    :cond_13
    new-instance v7, La/zga0;

    .line 330
    .line 331
    invoke-direct {v7, v11, v4, v9}, La/zga0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v8, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    :cond_14
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 338
    .line 339
    sget-object v6, La/or00;->a:La/zfn;

    .line 340
    .line 341
    invoke-virtual {v8, v6}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v6

    .line 345
    check-cast v6, La/clz;

    .line 346
    .line 347
    sget-object v10, La/lkz;->a:La/lkz;

    .line 348
    .line 349
    invoke-static {v7, v8}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 350
    .line 351
    .line 352
    move-result-object v7

    .line 353
    invoke-virtual {v8, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    move-result v10

    .line 357
    invoke-virtual {v8, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v13

    .line 361
    or-int/2addr v10, v13

    .line 362
    invoke-virtual {v8, v12}, La/fet;->e(I)Z

    .line 363
    .line 364
    .line 365
    move-result v12

    .line 366
    or-int/2addr v10, v12

    .line 367
    invoke-virtual {v8, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v12

    .line 371
    or-int/2addr v10, v12

    .line 372
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v12

    .line 376
    if-nez v10, :cond_15

    .line 377
    .line 378
    if-ne v12, v14, :cond_16

    .line 379
    .line 380
    :cond_15
    new-instance v15, La/kc70;

    .line 381
    .line 382
    const/16 v20, 0x3

    .line 383
    .line 384
    move-object/from16 v16, v5

    .line 385
    .line 386
    move-object/from16 v17, v6

    .line 387
    .line 388
    move-object/from16 v18, v7

    .line 389
    .line 390
    invoke-direct/range {v15 .. v20}, La/kc70;-><init>(La/k3t0;La/clz;La/pz40;La/yje;B)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v8, v15}, La/fet;->o0(Ljava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    move-object v12, v15

    .line 397
    :cond_16
    check-cast v12, Lkotlin/jvm/functions/Function2;

    .line 398
    .line 399
    invoke-static {v8, v6, v12}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 400
    .line 401
    .line 402
    new-array v5, v3, [Ljava/lang/Object;

    .line 403
    .line 404
    invoke-virtual {v8, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result v6

    .line 408
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v7

    .line 412
    if-nez v6, :cond_17

    .line 413
    .line 414
    if-ne v7, v14, :cond_18

    .line 415
    .line 416
    :cond_17
    new-instance v7, La/wda0;

    .line 417
    .line 418
    const/16 v6, 0xa

    .line 419
    .line 420
    invoke-direct {v7, v0, v6}, La/wda0;-><init>(La/l7m0;B)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v8, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 424
    .line 425
    .line 426
    :cond_18
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 427
    .line 428
    invoke-static {v5, v7, v8}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 429
    .line 430
    .line 431
    move-result-object v6

    .line 432
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v5

    .line 436
    if-ne v5, v14, :cond_1a

    .line 437
    .line 438
    iget-object v5, v11, La/ccb0;->L1:La/poq0;

    .line 439
    .line 440
    if-eqz v5, :cond_19

    .line 441
    .line 442
    new-instance v5, La/roq0;

    .line 443
    .line 444
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v8, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 448
    .line 449
    .line 450
    goto :goto_1

    .line 451
    :cond_19
    const-string v0, "tipsDialogFeature"

    .line 452
    .line 453
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    throw v19

    .line 457
    :cond_1a
    :goto_1
    move-object v7, v5

    .line 458
    check-cast v7, La/roq0;

    .line 459
    .line 460
    iget-object v5, v11, La/ccb0;->M1:La/lme0;

    .line 461
    .line 462
    if-eqz v5, :cond_24

    .line 463
    .line 464
    invoke-virtual {v8, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 465
    .line 466
    .line 467
    move-result v10

    .line 468
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v12

    .line 472
    if-nez v10, :cond_1b

    .line 473
    .line 474
    if-ne v12, v14, :cond_1c

    .line 475
    .line 476
    :cond_1b
    new-instance v12, La/ybb0;

    .line 477
    .line 478
    invoke-direct {v12, v11, v2}, La/ybb0;-><init>(La/ccb0;B)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v8, v12}, La/fet;->o0(Ljava/lang/Object;)V

    .line 482
    .line 483
    .line 484
    :cond_1c
    check-cast v12, Lkotlin/jvm/functions/Function1;

    .line 485
    .line 486
    invoke-virtual {v8, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 487
    .line 488
    .line 489
    move-result v2

    .line 490
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v10

    .line 494
    if-nez v2, :cond_1d

    .line 495
    .line 496
    if-ne v10, v14, :cond_1e

    .line 497
    .line 498
    :cond_1d
    new-instance v10, La/xbb0;

    .line 499
    .line 500
    invoke-direct {v10, v11, v9}, La/xbb0;-><init>(La/ccb0;B)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v8, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 504
    .line 505
    .line 506
    :cond_1e
    check-cast v10, Lkotlin/jvm/functions/Function0;

    .line 507
    .line 508
    invoke-virtual {v8, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 509
    .line 510
    .line 511
    move-result v2

    .line 512
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v9

    .line 516
    if-nez v2, :cond_1f

    .line 517
    .line 518
    if-ne v9, v14, :cond_20

    .line 519
    .line 520
    :cond_1f
    new-instance v9, La/xbb0;

    .line 521
    .line 522
    invoke-direct {v9, v11, v3}, La/xbb0;-><init>(La/ccb0;B)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v8, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 526
    .line 527
    .line 528
    :cond_20
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 529
    .line 530
    const/4 v13, 0x0

    .line 531
    move-object/from16 v23, v8

    .line 532
    .line 533
    move-object v8, v5

    .line 534
    move-object v5, v11

    .line 535
    move-object v11, v9

    .line 536
    move-object v9, v12

    .line 537
    move-object/from16 v12, v23

    .line 538
    .line 539
    invoke-static/range {v5 .. v13}, La/d9x;->r(Landroidx/fragment/app/Fragment;La/l7m0;La/roq0;La/lme0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 540
    .line 541
    .line 542
    move-object v8, v12

    .line 543
    sget-object v2, La/jm40;->b:La/jm40;

    .line 544
    .line 545
    const/high16 v3, 0x3f800000    # 1.0f

    .line 546
    .line 547
    invoke-static {v2, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 548
    .line 549
    .line 550
    move-result-object v2

    .line 551
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v3

    .line 555
    if-ne v3, v14, :cond_21

    .line 556
    .line 557
    new-instance v3, La/kma0;

    .line 558
    .line 559
    const/16 v6, 0x1c

    .line 560
    .line 561
    invoke-direct {v3, v6}, La/kma0;-><init>(B)V

    .line 562
    .line 563
    .line 564
    invoke-virtual {v8, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 565
    .line 566
    .line 567
    :cond_21
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 568
    .line 569
    invoke-static {v2, v3}, La/rq8;->K(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 570
    .line 571
    .line 572
    move-result-object v2

    .line 573
    invoke-virtual {v5}, La/ccb0;->I0()La/k3t0;

    .line 574
    .line 575
    .line 576
    move-result-object v3

    .line 577
    invoke-virtual {v8, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 578
    .line 579
    .line 580
    move-result v6

    .line 581
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object v7

    .line 585
    if-nez v6, :cond_22

    .line 586
    .line 587
    if-ne v7, v14, :cond_23

    .line 588
    .line 589
    :cond_22
    new-instance v15, La/e9b0;

    .line 590
    .line 591
    const/16 v21, 0x0

    .line 592
    .line 593
    const/16 v22, 0x2

    .line 594
    .line 595
    const/16 v16, 0x1

    .line 596
    .line 597
    const-class v18, La/k3t0;

    .line 598
    .line 599
    const-string v19, "onAction"

    .line 600
    .line 601
    const-string v20, "onAction(Ljava/lang/Object;)V"

    .line 602
    .line 603
    move-object/from16 v17, v3

    .line 604
    .line 605
    invoke-direct/range {v15 .. v22}, La/e9b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 606
    .line 607
    .line 608
    invoke-virtual {v8, v15}, La/fet;->o0(Ljava/lang/Object;)V

    .line 609
    .line 610
    .line 611
    move-object v7, v15

    .line 612
    :cond_23
    check-cast v7, La/jhy;

    .line 613
    .line 614
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 615
    .line 616
    new-instance v9, La/x2g;

    .line 617
    .line 618
    const/16 v14, 0x1a

    .line 619
    .line 620
    move-object v10, v0

    .line 621
    move-object v12, v1

    .line 622
    move-object v13, v4

    .line 623
    move-object v11, v5

    .line 624
    invoke-direct/range {v9 .. v14}, La/x2g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 625
    .line 626
    .line 627
    move-object v6, v10

    .line 628
    const v0, 0x1752af65

    .line 629
    .line 630
    .line 631
    invoke-static {v0, v9, v8}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 632
    .line 633
    .line 634
    move-result-object v0

    .line 635
    const/16 v10, 0xc00

    .line 636
    .line 637
    move-object v5, v2

    .line 638
    move-object v9, v8

    .line 639
    move-object v8, v0

    .line 640
    invoke-static/range {v5 .. v10}, La/k9x;->n(La/mm40;La/l7m0;Lkotlin/jvm/functions/Function1;La/ugd;La/fet;I)V

    .line 641
    .line 642
    .line 643
    goto :goto_2

    .line 644
    :cond_24
    const-string v0, "responsibleGameDialogFactory"

    .line 645
    .line 646
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 647
    .line 648
    .line 649
    throw v19

    .line 650
    :cond_25
    const-string v0, "navDestinations"

    .line 651
    .line 652
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 653
    .line 654
    .line 655
    throw v19

    .line 656
    :cond_26
    invoke-virtual {v8}, La/fet;->X()V

    .line 657
    .line 658
    .line 659
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 660
    .line 661
    return-object v0

    .line 662
    :pswitch_0
    move-object/from16 v1, p1

    .line 663
    .line 664
    check-cast v1, La/fet;

    .line 665
    .line 666
    move-object/from16 v5, p2

    .line 667
    .line 668
    check-cast v5, Ljava/lang/Integer;

    .line 669
    .line 670
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 671
    .line 672
    .line 673
    move-result v5

    .line 674
    sget-object v6, La/ccb0;->X1:La/mi70;

    .line 675
    .line 676
    and-int/lit8 v6, v5, 0x3

    .line 677
    .line 678
    if-eq v6, v2, :cond_27

    .line 679
    .line 680
    move v3, v4

    .line 681
    :cond_27
    and-int/lit8 v2, v5, 0x1

    .line 682
    .line 683
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 684
    .line 685
    .line 686
    move-result v2

    .line 687
    if-eqz v2, :cond_28

    .line 688
    .line 689
    sget-object v2, La/nhb0;->a:La/zfn;

    .line 690
    .line 691
    iget-object v0, v0, La/wbb0;->b:La/ccb0;

    .line 692
    .line 693
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 694
    .line 695
    .line 696
    move-result-object v3

    .line 697
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 698
    .line 699
    .line 700
    invoke-virtual {v2, v3}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 701
    .line 702
    .line 703
    move-result-object v2

    .line 704
    new-instance v3, La/wbb0;

    .line 705
    .line 706
    invoke-direct {v3, v0, v4}, La/wbb0;-><init>(La/ccb0;B)V

    .line 707
    .line 708
    .line 709
    const v0, 0x947d08c

    .line 710
    .line 711
    .line 712
    invoke-static {v0, v3, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    const/16 v3, 0x30

    .line 717
    .line 718
    invoke-static {v2, v0, v1, v3}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 719
    .line 720
    .line 721
    goto :goto_3

    .line 722
    :cond_28
    invoke-virtual {v1}, La/fet;->X()V

    .line 723
    .line 724
    .line 725
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 726
    .line 727
    return-object v0

    .line 728
    nop

    .line 729
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
