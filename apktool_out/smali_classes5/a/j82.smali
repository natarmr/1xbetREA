.class public final synthetic La/j82;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/y82;


# direct methods
.method public synthetic constructor <init>(La/y82;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/j82;->a:B

    iput-object p1, p0, La/j82;->b:La/y82;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/j82;->a:B

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Ljava/lang/Long;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    move-object/from16 v3, p2

    .line 17
    .line 18
    check-cast v3, Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    sget-object v4, La/y82;->V1:La/qek0;

    .line 25
    .line 26
    iget-object v0, v0, La/j82;->b:La/y82;

    .line 27
    .line 28
    invoke-virtual {v0}, La/y82;->I0()La/k3t0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v4, La/e82;

    .line 33
    .line 34
    invoke-direct {v4, v3, v1, v2}, La/e82;-><init>(ZJ)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v4}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object v0

    .line 43
    :pswitch_0
    move-object/from16 v4, p1

    .line 44
    .line 45
    check-cast v4, La/fet;

    .line 46
    .line 47
    move-object/from16 v1, p2

    .line 48
    .line 49
    check-cast v1, Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    sget-object v2, La/y82;->V1:La/qek0;

    .line 56
    .line 57
    and-int/lit8 v2, v1, 0x3

    .line 58
    .line 59
    const/4 v3, 0x2

    .line 60
    const/4 v7, 0x1

    .line 61
    const/4 v8, 0x0

    .line 62
    if-eq v2, v3, :cond_0

    .line 63
    .line 64
    move v2, v7

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    move v2, v8

    .line 67
    :goto_0
    and-int/2addr v1, v7

    .line 68
    invoke-virtual {v4, v1, v2}, La/fet;->U(IZ)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_1e

    .line 73
    .line 74
    iget-object v14, v0, La/j82;->b:La/y82;

    .line 75
    .line 76
    invoke-virtual {v4, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    sget-object v9, La/ukd;->a:La/cl5;

    .line 85
    .line 86
    if-nez v0, :cond_1

    .line 87
    .line 88
    if-ne v1, v9, :cond_2

    .line 89
    .line 90
    :cond_1
    new-instance v1, La/m82;

    .line 91
    .line 92
    const/4 v0, 0x6

    .line 93
    invoke-direct {v1, v14, v0}, La/m82;-><init>(La/y82;B)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v4, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_2
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 100
    .line 101
    invoke-virtual {v4, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    const/16 v10, 0x8

    .line 110
    .line 111
    if-nez v0, :cond_3

    .line 112
    .line 113
    if-ne v2, v9, :cond_4

    .line 114
    .line 115
    :cond_3
    new-instance v2, La/m82;

    .line 116
    .line 117
    invoke-direct {v2, v14, v10}, La/m82;-><init>(La/y82;B)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v4, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    :cond_4
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 124
    .line 125
    const/4 v5, 0x0

    .line 126
    const/4 v6, 0x4

    .line 127
    const/4 v3, 0x0

    .line 128
    invoke-static/range {v1 .. v6}, La/v3c;->A(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v14}, La/y82;->I0()La/k3t0;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    check-cast v0, La/i3t0;

    .line 136
    .line 137
    invoke-virtual {v0, v4}, La/i3t0;->y(La/fet;)La/pz40;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    new-array v1, v8, [Ljava/lang/Object;

    .line 142
    .line 143
    invoke-virtual {v4, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    if-nez v2, :cond_5

    .line 152
    .line 153
    if-ne v3, v9, :cond_6

    .line 154
    .line 155
    :cond_5
    new-instance v3, La/jb;

    .line 156
    .line 157
    invoke-direct {v3, v0, v10}, La/jb;-><init>(La/l7m0;B)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v4, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    :cond_6
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 164
    .line 165
    invoke-static {v1, v3, v4}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    new-array v2, v8, [Ljava/lang/Object;

    .line 170
    .line 171
    invoke-virtual {v4, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    if-nez v3, :cond_7

    .line 180
    .line 181
    if-ne v5, v9, :cond_8

    .line 182
    .line 183
    :cond_7
    new-instance v5, La/jb;

    .line 184
    .line 185
    const/16 v3, 0x9

    .line 186
    .line 187
    invoke-direct {v5, v1, v3}, La/jb;-><init>(La/l7m0;B)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v4, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    :cond_8
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 194
    .line 195
    invoke-static {v2, v5, v4}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 196
    .line 197
    .line 198
    move-result-object v13

    .line 199
    new-array v2, v8, [Ljava/lang/Object;

    .line 200
    .line 201
    invoke-virtual {v4, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    if-nez v3, :cond_9

    .line 210
    .line 211
    if-ne v5, v9, :cond_a

    .line 212
    .line 213
    :cond_9
    new-instance v5, La/jb;

    .line 214
    .line 215
    const/16 v3, 0xa

    .line 216
    .line 217
    invoke-direct {v5, v1, v3}, La/jb;-><init>(La/l7m0;B)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v4, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    :cond_a
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 224
    .line 225
    invoke-static {v2, v5, v4}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    new-array v3, v8, [Ljava/lang/Object;

    .line 230
    .line 231
    invoke-virtual {v4, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v5

    .line 235
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v6

    .line 239
    if-nez v5, :cond_b

    .line 240
    .line 241
    if-ne v6, v9, :cond_c

    .line 242
    .line 243
    :cond_b
    new-instance v6, La/jb;

    .line 244
    .line 245
    const/16 v5, 0xb

    .line 246
    .line 247
    invoke-direct {v6, v0, v5}, La/jb;-><init>(La/l7m0;B)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v4, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    :cond_c
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 254
    .line 255
    invoke-static {v3, v6, v4}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    new-array v5, v8, [Ljava/lang/Object;

    .line 260
    .line 261
    invoke-virtual {v4, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v6

    .line 265
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v10

    .line 269
    if-nez v6, :cond_d

    .line 270
    .line 271
    if-ne v10, v9, :cond_e

    .line 272
    .line 273
    :cond_d
    new-instance v10, La/jb;

    .line 274
    .line 275
    const/16 v6, 0xc

    .line 276
    .line 277
    invoke-direct {v10, v0, v6}, La/jb;-><init>(La/l7m0;B)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v4, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    :cond_e
    check-cast v10, Lkotlin/jvm/functions/Function0;

    .line 284
    .line 285
    invoke-static {v5, v10, v4}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 286
    .line 287
    .line 288
    move-result-object v5

    .line 289
    new-array v6, v8, [Ljava/lang/Object;

    .line 290
    .line 291
    invoke-virtual {v4, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v10

    .line 295
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v11

    .line 299
    if-nez v10, :cond_f

    .line 300
    .line 301
    if-ne v11, v9, :cond_10

    .line 302
    .line 303
    :cond_f
    new-instance v11, La/jb;

    .line 304
    .line 305
    const/16 v10, 0xd

    .line 306
    .line 307
    invoke-direct {v11, v0, v10}, La/jb;-><init>(La/l7m0;B)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v4, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    :cond_10
    check-cast v11, Lkotlin/jvm/functions/Function0;

    .line 314
    .line 315
    invoke-static {v6, v11, v4}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 316
    .line 317
    .line 318
    move-result-object v11

    .line 319
    new-array v6, v8, [Ljava/lang/Object;

    .line 320
    .line 321
    invoke-virtual {v4, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result v10

    .line 325
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v12

    .line 329
    if-nez v10, :cond_11

    .line 330
    .line 331
    if-ne v12, v9, :cond_12

    .line 332
    .line 333
    :cond_11
    new-instance v12, La/jb;

    .line 334
    .line 335
    const/16 v10, 0xe

    .line 336
    .line 337
    invoke-direct {v12, v0, v10}, La/jb;-><init>(La/l7m0;B)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v4, v12}, La/fet;->o0(Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    :cond_12
    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 344
    .line 345
    invoke-static {v6, v12, v4}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 346
    .line 347
    .line 348
    move-result-object v6

    .line 349
    new-array v10, v8, [Ljava/lang/Object;

    .line 350
    .line 351
    invoke-virtual {v4, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result v12

    .line 355
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v15

    .line 359
    if-nez v12, :cond_13

    .line 360
    .line 361
    if-ne v15, v9, :cond_14

    .line 362
    .line 363
    :cond_13
    new-instance v15, La/jb;

    .line 364
    .line 365
    const/16 v12, 0xf

    .line 366
    .line 367
    invoke-direct {v15, v0, v12}, La/jb;-><init>(La/l7m0;B)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v4, v15}, La/fet;->o0(Ljava/lang/Object;)V

    .line 371
    .line 372
    .line 373
    :cond_14
    check-cast v15, Lkotlin/jvm/functions/Function0;

    .line 374
    .line 375
    invoke-static {v10, v15, v4}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 376
    .line 377
    .line 378
    move-result-object v10

    .line 379
    new-array v12, v8, [Ljava/lang/Object;

    .line 380
    .line 381
    invoke-virtual {v4, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result v15

    .line 385
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v7

    .line 389
    if-nez v15, :cond_15

    .line 390
    .line 391
    if-ne v7, v9, :cond_16

    .line 392
    .line 393
    :cond_15
    new-instance v7, La/jb;

    .line 394
    .line 395
    const/16 v15, 0x10

    .line 396
    .line 397
    invoke-direct {v7, v0, v15}, La/jb;-><init>(La/l7m0;B)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v4, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    :cond_16
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 404
    .line 405
    invoke-static {v12, v7, v4}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 406
    .line 407
    .line 408
    move-result-object v7

    .line 409
    invoke-virtual {v4, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    move-result v12

    .line 413
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v15

    .line 417
    if-nez v12, :cond_17

    .line 418
    .line 419
    if-ne v15, v9, :cond_18

    .line 420
    .line 421
    :cond_17
    new-instance v15, La/m82;

    .line 422
    .line 423
    const/4 v12, 0x7

    .line 424
    invoke-direct {v15, v14, v12}, La/m82;-><init>(La/y82;B)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v4, v15}, La/fet;->o0(Ljava/lang/Object;)V

    .line 428
    .line 429
    .line 430
    :cond_18
    check-cast v15, Lkotlin/jvm/functions/Function0;

    .line 431
    .line 432
    const/4 v12, 0x1

    .line 433
    invoke-static {v8, v15, v4, v8, v12}, La/knx;->i(ZLkotlin/jvm/functions/Function0;La/fet;II)V

    .line 434
    .line 435
    .line 436
    invoke-static {v4}, La/vzb;->h0(La/fet;)La/f3d;

    .line 437
    .line 438
    .line 439
    move-result-object v12

    .line 440
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v15

    .line 444
    if-ne v15, v9, :cond_19

    .line 445
    .line 446
    new-instance v15, La/qno0;

    .line 447
    .line 448
    invoke-direct {v15}, La/qno0;-><init>()V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v4, v15}, La/fet;->o0(Ljava/lang/Object;)V

    .line 452
    .line 453
    .line 454
    :cond_19
    check-cast v15, La/qno0;

    .line 455
    .line 456
    sget-object v8, La/bmd;->h:La/zfn;

    .line 457
    .line 458
    invoke-virtual {v4, v8}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v8

    .line 462
    check-cast v8, La/w6k;

    .line 463
    .line 464
    sget-object v16, La/qmk;->a:La/zcl;

    .line 465
    .line 466
    move-object/from16 p0, v1

    .line 467
    .line 468
    const/high16 v1, 0x41c00000    # 24.0f

    .line 469
    .line 470
    invoke-interface {v8, v1}, La/w6k;->w0(F)F

    .line 471
    .line 472
    .line 473
    move-result v1

    .line 474
    const/4 v8, 0x0

    .line 475
    new-array v8, v8, [Ljava/lang/Object;

    .line 476
    .line 477
    invoke-virtual {v4, v1}, La/fet;->d(F)Z

    .line 478
    .line 479
    .line 480
    move-result v16

    .line 481
    invoke-virtual {v4, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 482
    .line 483
    .line 484
    move-result v17

    .line 485
    or-int v16, v16, v17

    .line 486
    .line 487
    move-object/from16 p2, v2

    .line 488
    .line 489
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v2

    .line 493
    if-nez v16, :cond_1a

    .line 494
    .line 495
    if-ne v2, v9, :cond_1b

    .line 496
    .line 497
    :cond_1a
    new-instance v2, La/q82;

    .line 498
    .line 499
    invoke-direct {v2, v1, v12}, La/q82;-><init>(FLa/f3d;)V

    .line 500
    .line 501
    .line 502
    invoke-virtual {v4, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 503
    .line 504
    .line 505
    :cond_1b
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 506
    .line 507
    invoke-static {v8, v2, v4}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 508
    .line 509
    .line 510
    move-result-object v2

    .line 511
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 512
    .line 513
    invoke-virtual {v4, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 514
    .line 515
    .line 516
    move-result v16

    .line 517
    invoke-virtual {v4, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 518
    .line 519
    .line 520
    move-result v17

    .line 521
    or-int v16, v16, v17

    .line 522
    .line 523
    invoke-virtual {v4, v15}, La/fet;->i(Ljava/lang/Object;)Z

    .line 524
    .line 525
    .line 526
    move-result v17

    .line 527
    or-int v16, v16, v17

    .line 528
    .line 529
    move-object/from16 v17, v0

    .line 530
    .line 531
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    if-nez v16, :cond_1c

    .line 536
    .line 537
    if-ne v0, v9, :cond_1d

    .line 538
    .line 539
    :cond_1c
    move-object/from16 v18, v15

    .line 540
    .line 541
    goto :goto_1

    .line 542
    :cond_1d
    move-object/from16 v21, v15

    .line 543
    .line 544
    move-object v15, v0

    .line 545
    move-object/from16 v0, v21

    .line 546
    .line 547
    goto :goto_2

    .line 548
    :goto_1
    new-instance v15, La/w82;

    .line 549
    .line 550
    const/16 v20, 0x0

    .line 551
    .line 552
    const/16 v19, 0x0

    .line 553
    .line 554
    move-object/from16 v16, v12

    .line 555
    .line 556
    invoke-direct/range {v15 .. v20}, La/w82;-><init>(La/f3d;La/l7m0;La/qno0;La/yje;B)V

    .line 557
    .line 558
    .line 559
    move-object/from16 v0, v18

    .line 560
    .line 561
    invoke-virtual {v4, v15}, La/fet;->o0(Ljava/lang/Object;)V

    .line 562
    .line 563
    .line 564
    :goto_2
    check-cast v15, Lkotlin/jvm/functions/Function2;

    .line 565
    .line 566
    invoke-static {v4, v8, v15}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 567
    .line 568
    .line 569
    sget-object v8, La/o7k0;->c:La/n0q;

    .line 570
    .line 571
    invoke-interface {v13}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v9

    .line 575
    check-cast v9, Ljava/lang/Boolean;

    .line 576
    .line 577
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 578
    .line 579
    .line 580
    move-result v9

    .line 581
    const/4 v15, 0x1

    .line 582
    xor-int/2addr v9, v15

    .line 583
    iget-object v15, v12, La/f3d;->g:La/a8z;

    .line 584
    .line 585
    invoke-interface {v15}, La/a8z;->getValue()Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v15

    .line 589
    check-cast v15, La/vj50;

    .line 590
    .line 591
    invoke-static {v8, v9, v15}, La/fww;->z(La/mm40;ZLa/vj50;)La/mm40;

    .line 592
    .line 593
    .line 594
    move-result-object v8

    .line 595
    new-instance v9, La/r82;

    .line 596
    .line 597
    move-object/from16 v15, p0

    .line 598
    .line 599
    move/from16 v20, v1

    .line 600
    .line 601
    move-object/from16 v19, v6

    .line 602
    .line 603
    move-object/from16 v17, v7

    .line 604
    .line 605
    move-object/from16 v16, v10

    .line 606
    .line 607
    move-object v10, v12

    .line 608
    move-object/from16 v18, v13

    .line 609
    .line 610
    move-object v12, v14

    .line 611
    move-object/from16 v13, p2

    .line 612
    .line 613
    move-object v14, v5

    .line 614
    invoke-direct/range {v9 .. v20}, La/r82;-><init>(La/f3d;La/l7m0;La/y82;La/l7m0;La/l7m0;La/l7m0;La/l7m0;La/l7m0;La/l7m0;La/l7m0;F)V

    .line 615
    .line 616
    .line 617
    move-object v14, v12

    .line 618
    move-object/from16 v13, v18

    .line 619
    .line 620
    move-object v12, v10

    .line 621
    const v1, -0x51fb9445

    .line 622
    .line 623
    .line 624
    invoke-static {v1, v9, v4}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 625
    .line 626
    .line 627
    move-result-object v1

    .line 628
    new-instance v9, La/s49;

    .line 629
    .line 630
    const/16 v16, 0x4

    .line 631
    .line 632
    move-object v15, v0

    .line 633
    move-object v11, v2

    .line 634
    move-object v10, v3

    .line 635
    invoke-direct/range {v9 .. v16}, La/s49;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 636
    .line 637
    .line 638
    const v0, 0x64a0633c

    .line 639
    .line 640
    .line 641
    invoke-static {v0, v9, v4}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 642
    .line 643
    .line 644
    move-result-object v0

    .line 645
    const/16 v6, 0xd80

    .line 646
    .line 647
    const/high16 v2, 0x41c00000    # 24.0f

    .line 648
    .line 649
    move-object v3, v1

    .line 650
    move-object v5, v4

    .line 651
    move-object v1, v8

    .line 652
    move-object v4, v0

    .line 653
    invoke-static/range {v1 .. v6}, La/jwb;->c(La/mm40;FLa/ugd;La/ugd;La/fet;I)V

    .line 654
    .line 655
    .line 656
    goto :goto_3

    .line 657
    :cond_1e
    invoke-virtual {v4}, La/fet;->X()V

    .line 658
    .line 659
    .line 660
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 661
    .line 662
    return-object v0

    .line 663
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
