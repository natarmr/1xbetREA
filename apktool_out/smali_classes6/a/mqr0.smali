.class public final synthetic La/mqr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;


# direct methods
.method public synthetic constructor <init>(La/l7m0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/mqr0;->a:B

    iput-object p1, p0, La/mqr0;->b:La/l7m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/mqr0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/16 v3, 0x20

    .line 7
    .line 8
    iget-object v0, v0, La/mqr0;->b:La/l7m0;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v4, p1

    .line 14
    .line 15
    check-cast v4, La/fhl;

    .line 16
    .line 17
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, La/y3d;

    .line 25
    .line 26
    iget-wide v5, v0, La/y3d;->a:J

    .line 27
    .line 28
    invoke-interface {v4}, La/fhl;->d()J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    shr-long/2addr v0, v3

    .line 33
    long-to-int v0, v0

    .line 34
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const/high16 v1, 0x40400000    # 3.0f

    .line 39
    .line 40
    div-float v7, v0, v1

    .line 41
    .line 42
    const/4 v11, 0x0

    .line 43
    const/16 v12, 0x7c

    .line 44
    .line 45
    const-wide/16 v8, 0x0

    .line 46
    .line 47
    const/4 v10, 0x0

    .line 48
    invoke-static/range {v4 .. v12}, La/fhl;->E(La/fhl;JFJFLa/agc;I)V

    .line 49
    .line 50
    .line 51
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    return-object v0

    .line 54
    :pswitch_0
    move-object/from16 v1, p1

    .line 55
    .line 56
    check-cast v1, La/g7z;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, La/g7z;->a()V

    .line 62
    .line 63
    .line 64
    const/high16 v4, 0x42100000    # 36.0f

    .line 65
    .line 66
    invoke-virtual {v1, v4}, La/g7z;->w0(F)F

    .line 67
    .line 68
    .line 69
    move-result v15

    .line 70
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    sget-wide v5, La/y3d;->f:J

    .line 75
    .line 76
    new-instance v7, La/y3d;

    .line 77
    .line 78
    invoke-direct {v7, v5, v6}, La/y3d;-><init>(J)V

    .line 79
    .line 80
    .line 81
    new-instance v8, Lkotlin/Pair;

    .line 82
    .line 83
    invoke-direct {v8, v4, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    check-cast v4, Lkotlin/Pair;

    .line 91
    .line 92
    iget-object v4, v4, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 93
    .line 94
    sget-wide v9, La/y3d;->b:J

    .line 95
    .line 96
    new-instance v7, La/y3d;

    .line 97
    .line 98
    invoke-direct {v7, v9, v10}, La/y3d;-><init>(J)V

    .line 99
    .line 100
    .line 101
    new-instance v11, Lkotlin/Pair;

    .line 102
    .line 103
    invoke-direct {v11, v4, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    filled-new-array {v8, v11}, [Lkotlin/Pair;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    const/16 v7, 0x8

    .line 111
    .line 112
    invoke-static {v4, v2, v15, v7}, La/yk5;->h([Lkotlin/Pair;FFI)La/e900;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    const/4 v13, 0x6

    .line 117
    const/16 v14, 0x3e

    .line 118
    .line 119
    move-wide v4, v5

    .line 120
    move v8, v7

    .line 121
    const-wide/16 v6, 0x0

    .line 122
    .line 123
    move v12, v8

    .line 124
    move-wide v10, v9

    .line 125
    const-wide/16 v8, 0x0

    .line 126
    .line 127
    move-wide/from16 v16, v10

    .line 128
    .line 129
    const/4 v10, 0x0

    .line 130
    const/4 v11, 0x0

    .line 131
    move/from16 v18, v12

    .line 132
    .line 133
    const/4 v12, 0x0

    .line 134
    move-wide/from16 v19, v16

    .line 135
    .line 136
    move-object/from16 v16, v0

    .line 137
    .line 138
    move-wide/from16 v21, v4

    .line 139
    .line 140
    move-object v4, v1

    .line 141
    move-object v5, v2

    .line 142
    move-wide/from16 v0, v19

    .line 143
    .line 144
    move/from16 v2, v18

    .line 145
    .line 146
    move-wide/from16 v17, v21

    .line 147
    .line 148
    invoke-static/range {v4 .. v14}, La/fhl;->r(La/fhl;La/t89;JJFLa/agc;La/a4d;II)V

    .line 149
    .line 150
    .line 151
    invoke-interface/range {v16 .. v16}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    check-cast v5, Lkotlin/Pair;

    .line 156
    .line 157
    iget-object v5, v5, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v5, Ljava/lang/Number;

    .line 160
    .line 161
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 162
    .line 163
    .line 164
    move-result v5

    .line 165
    const/high16 v6, 0x3f800000    # 1.0f

    .line 166
    .line 167
    sub-float v5, v6, v5

    .line 168
    .line 169
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    new-instance v7, La/y3d;

    .line 174
    .line 175
    invoke-direct {v7, v0, v1}, La/y3d;-><init>(J)V

    .line 176
    .line 177
    .line 178
    new-instance v0, Lkotlin/Pair;

    .line 179
    .line 180
    invoke-direct {v0, v5, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    new-instance v5, La/y3d;

    .line 188
    .line 189
    move-wide/from16 v6, v17

    .line 190
    .line 191
    invoke-direct {v5, v6, v7}, La/y3d;-><init>(J)V

    .line 192
    .line 193
    .line 194
    new-instance v6, Lkotlin/Pair;

    .line 195
    .line 196
    invoke-direct {v6, v1, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    filled-new-array {v0, v6}, [Lkotlin/Pair;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    iget-object v1, v4, La/g7z;->a:La/a6a;

    .line 204
    .line 205
    invoke-interface {v1}, La/fhl;->d()J

    .line 206
    .line 207
    .line 208
    move-result-wide v5

    .line 209
    shr-long/2addr v5, v3

    .line 210
    long-to-int v5, v5

    .line 211
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 212
    .line 213
    .line 214
    move-result v5

    .line 215
    sub-float/2addr v5, v15

    .line 216
    invoke-interface {v1}, La/fhl;->d()J

    .line 217
    .line 218
    .line 219
    move-result-wide v6

    .line 220
    shr-long/2addr v6, v3

    .line 221
    long-to-int v1, v6

    .line 222
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    invoke-static {v0, v5, v1, v2}, La/yk5;->h([Lkotlin/Pair;FFI)La/e900;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    const/4 v10, 0x6

    .line 231
    const/16 v11, 0x3e

    .line 232
    .line 233
    move-object v1, v4

    .line 234
    const-wide/16 v3, 0x0

    .line 235
    .line 236
    const-wide/16 v5, 0x0

    .line 237
    .line 238
    const/4 v7, 0x0

    .line 239
    const/4 v8, 0x0

    .line 240
    const/4 v9, 0x0

    .line 241
    invoke-static/range {v1 .. v11}, La/fhl;->r(La/fhl;La/t89;JJFLa/agc;La/a4d;II)V

    .line 242
    .line 243
    .line 244
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 245
    .line 246
    return-object v0

    .line 247
    :pswitch_1
    move-object/from16 v16, v0

    .line 248
    .line 249
    move-object/from16 v0, p1

    .line 250
    .line 251
    check-cast v0, La/abi0;

    .line 252
    .line 253
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    invoke-interface/range {v16 .. v16}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    check-cast v1, Ljava/lang/Boolean;

    .line 261
    .line 262
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    if-eqz v1, :cond_0

    .line 267
    .line 268
    const-string v1, "Expanded"

    .line 269
    .line 270
    goto :goto_0

    .line 271
    :cond_0
    const-string v1, "Collapsed"

    .line 272
    .line 273
    :goto_0
    invoke-static {v0, v1}, La/yai0;->h(La/abi0;Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 277
    .line 278
    return-object v0

    .line 279
    :pswitch_2
    move-object/from16 v16, v0

    .line 280
    .line 281
    move-object/from16 v0, p1

    .line 282
    .line 283
    check-cast v0, La/uag0;

    .line 284
    .line 285
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    invoke-interface/range {v16 .. v16}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    check-cast v1, Ljava/lang/Number;

    .line 293
    .line 294
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 295
    .line 296
    .line 297
    move-result v1

    .line 298
    invoke-virtual {v0, v1}, La/uag0;->b(F)V

    .line 299
    .line 300
    .line 301
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 302
    .line 303
    return-object v0

    .line 304
    :pswitch_3
    move-object/from16 v16, v0

    .line 305
    .line 306
    move-object/from16 v0, p1

    .line 307
    .line 308
    check-cast v0, La/abi0;

    .line 309
    .line 310
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    invoke-interface/range {v16 .. v16}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    check-cast v1, Ljava/lang/Number;

    .line 318
    .line 319
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 320
    .line 321
    .line 322
    move-result v1

    .line 323
    sget-object v2, La/cbi0;->p:La/zai0;

    .line 324
    .line 325
    sget-object v3, La/cbi0;->a:[La/iiy;

    .line 326
    .line 327
    const/16 v4, 0xd

    .line 328
    .line 329
    aget-object v3, v3, v4

    .line 330
    .line 331
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    invoke-interface {v0, v2, v1}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 342
    .line 343
    return-object v0

    .line 344
    :pswitch_4
    move-object/from16 v16, v0

    .line 345
    .line 346
    move-object/from16 v0, p1

    .line 347
    .line 348
    check-cast v0, La/uag0;

    .line 349
    .line 350
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 351
    .line 352
    .line 353
    invoke-interface/range {v16 .. v16}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    check-cast v1, Ljava/lang/Number;

    .line 358
    .line 359
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 360
    .line 361
    .line 362
    move-result v1

    .line 363
    invoke-virtual {v0, v1}, La/uag0;->b(F)V

    .line 364
    .line 365
    .line 366
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 367
    .line 368
    return-object v0

    .line 369
    :pswitch_5
    move-object/from16 v16, v0

    .line 370
    .line 371
    move-object/from16 v1, p1

    .line 372
    .line 373
    check-cast v1, La/fhl;

    .line 374
    .line 375
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 376
    .line 377
    .line 378
    invoke-static {}, La/z03;->a()La/w03;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    invoke-interface {v1}, La/fhl;->d()J

    .line 383
    .line 384
    .line 385
    move-result-wide v4

    .line 386
    const-wide v6, 0xffffffffL

    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    and-long/2addr v4, v6

    .line 392
    long-to-int v4, v4

    .line 393
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 394
    .line 395
    .line 396
    move-result v4

    .line 397
    const/high16 v5, 0x40000000    # 2.0f

    .line 398
    .line 399
    div-float/2addr v4, v5

    .line 400
    invoke-virtual {v0, v2, v4}, La/w03;->f(FF)V

    .line 401
    .line 402
    .line 403
    invoke-interface {v1}, La/fhl;->d()J

    .line 404
    .line 405
    .line 406
    move-result-wide v8

    .line 407
    shr-long/2addr v8, v3

    .line 408
    long-to-int v2, v8

    .line 409
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 410
    .line 411
    .line 412
    move-result v2

    .line 413
    div-float/2addr v2, v5

    .line 414
    invoke-interface {v1}, La/fhl;->d()J

    .line 415
    .line 416
    .line 417
    move-result-wide v8

    .line 418
    and-long/2addr v8, v6

    .line 419
    long-to-int v4, v8

    .line 420
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 421
    .line 422
    .line 423
    move-result v4

    .line 424
    invoke-virtual {v0, v2, v4}, La/w03;->e(FF)V

    .line 425
    .line 426
    .line 427
    invoke-interface {v1}, La/fhl;->d()J

    .line 428
    .line 429
    .line 430
    move-result-wide v8

    .line 431
    shr-long v2, v8, v3

    .line 432
    .line 433
    long-to-int v2, v2

    .line 434
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 435
    .line 436
    .line 437
    move-result v2

    .line 438
    invoke-interface {v1}, La/fhl;->d()J

    .line 439
    .line 440
    .line 441
    move-result-wide v3

    .line 442
    and-long/2addr v3, v6

    .line 443
    long-to-int v3, v3

    .line 444
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 445
    .line 446
    .line 447
    move-result v3

    .line 448
    div-float/2addr v3, v5

    .line 449
    invoke-virtual {v0, v2, v3}, La/w03;->e(FF)V

    .line 450
    .line 451
    .line 452
    invoke-virtual {v0}, La/w03;->c()V

    .line 453
    .line 454
    .line 455
    sget-wide v3, La/y3d;->c:J

    .line 456
    .line 457
    invoke-interface/range {v16 .. v16}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    check-cast v2, Ljava/lang/Number;

    .line 462
    .line 463
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 464
    .line 465
    .line 466
    move-result v5

    .line 467
    const/16 v7, 0x30

    .line 468
    .line 469
    sget-object v6, La/l0q;->a:La/l0q;

    .line 470
    .line 471
    move-object v2, v0

    .line 472
    invoke-static/range {v1 .. v7}, La/fhl;->C0(La/fhl;La/w03;JFLa/agc;I)V

    .line 473
    .line 474
    .line 475
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 476
    .line 477
    return-object v0

    .line 478
    :pswitch_6
    move-object/from16 v16, v0

    .line 479
    .line 480
    move-object/from16 v0, p1

    .line 481
    .line 482
    check-cast v0, La/uag0;

    .line 483
    .line 484
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 485
    .line 486
    .line 487
    invoke-interface/range {v16 .. v16}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v1

    .line 491
    check-cast v1, Ljava/lang/Number;

    .line 492
    .line 493
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 494
    .line 495
    .line 496
    move-result v1

    .line 497
    invoke-virtual {v0, v1}, La/uag0;->b(F)V

    .line 498
    .line 499
    .line 500
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 501
    .line 502
    return-object v0

    .line 503
    :pswitch_7
    move-object/from16 v16, v0

    .line 504
    .line 505
    move-object/from16 v0, p1

    .line 506
    .line 507
    check-cast v0, La/uag0;

    .line 508
    .line 509
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 510
    .line 511
    .line 512
    invoke-interface/range {v16 .. v16}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v1

    .line 516
    check-cast v1, Ljava/lang/Number;

    .line 517
    .line 518
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 519
    .line 520
    .line 521
    move-result v1

    .line 522
    invoke-virtual {v0, v1}, La/uag0;->b(F)V

    .line 523
    .line 524
    .line 525
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 526
    .line 527
    return-object v0

    .line 528
    :pswitch_8
    move-object/from16 v16, v0

    .line 529
    .line 530
    move-object/from16 v0, p1

    .line 531
    .line 532
    check-cast v0, La/uag0;

    .line 533
    .line 534
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 535
    .line 536
    .line 537
    invoke-interface/range {v16 .. v16}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v1

    .line 541
    check-cast v1, Ljava/lang/Number;

    .line 542
    .line 543
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 544
    .line 545
    .line 546
    move-result v1

    .line 547
    invoke-virtual {v0, v1}, La/uag0;->b(F)V

    .line 548
    .line 549
    .line 550
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 551
    .line 552
    return-object v0

    .line 553
    :pswitch_9
    move-object/from16 v16, v0

    .line 554
    .line 555
    move-object/from16 v0, p1

    .line 556
    .line 557
    check-cast v0, La/uag0;

    .line 558
    .line 559
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 560
    .line 561
    .line 562
    invoke-interface/range {v16 .. v16}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    move-result-object v1

    .line 566
    check-cast v1, Ljava/lang/Number;

    .line 567
    .line 568
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 569
    .line 570
    .line 571
    move-result v1

    .line 572
    invoke-virtual {v0, v1}, La/uag0;->b(F)V

    .line 573
    .line 574
    .line 575
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 576
    .line 577
    return-object v0

    .line 578
    :pswitch_a
    move-object/from16 v16, v0

    .line 579
    .line 580
    move-object/from16 v0, p1

    .line 581
    .line 582
    check-cast v0, La/uag0;

    .line 583
    .line 584
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 585
    .line 586
    .line 587
    invoke-interface/range {v16 .. v16}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v1

    .line 591
    check-cast v1, Ljava/lang/Number;

    .line 592
    .line 593
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 594
    .line 595
    .line 596
    move-result v1

    .line 597
    invoke-virtual {v0, v1}, La/uag0;->b(F)V

    .line 598
    .line 599
    .line 600
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 601
    .line 602
    return-object v0

    .line 603
    :pswitch_data_0
    .packed-switch 0x0
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
