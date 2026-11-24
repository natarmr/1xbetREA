.class public final synthetic La/yn8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:Z

.field public final synthetic d:J

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLjava/util/List;ZJ)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/yn8;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La/yn8;->b:J

    iput-object p3, p0, La/yn8;->e:Ljava/lang/Object;

    iput-boolean p4, p0, La/yn8;->c:Z

    iput-wide p5, p0, La/yn8;->d:J

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;JJZ)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/yn8;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/yn8;->e:Ljava/lang/Object;

    iput-wide p2, p0, La/yn8;->b:J

    iput-wide p4, p0, La/yn8;->d:J

    iput-boolean p6, p0, La/yn8;->c:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/yn8;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/high16 v3, 0x40000000    # 2.0f

    .line 7
    .line 8
    const-wide v4, 0xffffffffL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    const/16 v6, 0x20

    .line 14
    .line 15
    const/high16 v7, 0x3f800000    # 1.0f

    .line 16
    .line 17
    iget-boolean v8, v0, La/yn8;->c:Z

    .line 18
    .line 19
    iget-object v9, v0, La/yn8;->e:Ljava/lang/Object;

    .line 20
    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    move-object v11, v9

    .line 25
    check-cast v11, Ljava/util/List;

    .line 26
    .line 27
    move-object/from16 v12, p1

    .line 28
    .line 29
    check-cast v12, La/fhl;

    .line 30
    .line 31
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    const/16 v22, 0x1

    .line 35
    .line 36
    const/16 v23, 0x3e

    .line 37
    .line 38
    iget-wide v13, v0, La/yn8;->b:J

    .line 39
    .line 40
    const-wide/16 v15, 0x0

    .line 41
    .line 42
    const-wide/16 v17, 0x0

    .line 43
    .line 44
    const/16 v19, 0x0

    .line 45
    .line 46
    const/16 v20, 0x0

    .line 47
    .line 48
    const/16 v21, 0x0

    .line 49
    .line 50
    invoke-static/range {v12 .. v23}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 51
    .line 52
    .line 53
    move-object v1, v12

    .line 54
    new-instance v10, La/e900;

    .line 55
    .line 56
    const/4 v12, 0x0

    .line 57
    const-wide/16 v13, 0x0

    .line 58
    .line 59
    const-wide v15, 0x7f8000007f800000L    # 1.404448428688076E306

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    invoke-direct/range {v10 .. v16}, La/e900;-><init>(Ljava/util/List;Ljava/util/ArrayList;JJ)V

    .line 65
    .line 66
    .line 67
    const/16 v21, 0xf

    .line 68
    .line 69
    const/16 v22, 0x3e

    .line 70
    .line 71
    const-wide/16 v14, 0x0

    .line 72
    .line 73
    const-wide/16 v16, 0x0

    .line 74
    .line 75
    const/16 v18, 0x0

    .line 76
    .line 77
    const/16 v19, 0x0

    .line 78
    .line 79
    move-object v12, v1

    .line 80
    move-object v13, v10

    .line 81
    invoke-static/range {v12 .. v22}, La/fhl;->r(La/fhl;La/t89;JJFLa/agc;La/a4d;II)V

    .line 82
    .line 83
    .line 84
    if-eqz v8, :cond_0

    .line 85
    .line 86
    invoke-interface {v12}, La/fhl;->d()J

    .line 87
    .line 88
    .line 89
    move-result-wide v8

    .line 90
    and-long/2addr v8, v4

    .line 91
    long-to-int v1, v8

    .line 92
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    invoke-interface {v12, v7}, La/w6k;->w0(F)F

    .line 97
    .line 98
    .line 99
    move-result v8

    .line 100
    div-float/2addr v8, v3

    .line 101
    sub-float/2addr v1, v8

    .line 102
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    int-to-long v2, v2

    .line 107
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 108
    .line 109
    .line 110
    move-result v8

    .line 111
    int-to-long v8, v8

    .line 112
    shl-long/2addr v2, v6

    .line 113
    and-long/2addr v8, v4

    .line 114
    or-long v15, v2, v8

    .line 115
    .line 116
    invoke-interface {v12}, La/fhl;->d()J

    .line 117
    .line 118
    .line 119
    move-result-wide v2

    .line 120
    shr-long/2addr v2, v6

    .line 121
    long-to-int v2, v2

    .line 122
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    int-to-long v2, v2

    .line 131
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    int-to-long v8, v1

    .line 136
    shl-long v1, v2, v6

    .line 137
    .line 138
    and-long v3, v8, v4

    .line 139
    .line 140
    or-long v17, v1, v3

    .line 141
    .line 142
    invoke-interface {v12, v7}, La/w6k;->w0(F)F

    .line 143
    .line 144
    .line 145
    move-result v19

    .line 146
    const/16 v21, 0x0

    .line 147
    .line 148
    const/16 v22, 0x1f0

    .line 149
    .line 150
    iget-wide v13, v0, La/yn8;->d:J

    .line 151
    .line 152
    const/16 v20, 0x0

    .line 153
    .line 154
    invoke-static/range {v12 .. v22}, La/fhl;->Q(La/fhl;JJJFILa/x03;I)V

    .line 155
    .line 156
    .line 157
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 158
    .line 159
    return-object v0

    .line 160
    :pswitch_0
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 161
    .line 162
    move-object/from16 v10, p1

    .line 163
    .line 164
    check-cast v10, La/fhl;

    .line 165
    .line 166
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-interface {v10}, La/fhl;->d()J

    .line 170
    .line 171
    .line 172
    move-result-wide v11

    .line 173
    and-long/2addr v11, v4

    .line 174
    long-to-int v1, v11

    .line 175
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 176
    .line 177
    .line 178
    move-result v17

    .line 179
    invoke-interface {v9}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    check-cast v1, Ljava/lang/Number;

    .line 184
    .line 185
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    invoke-interface {v10}, La/fhl;->d()J

    .line 190
    .line 191
    .line 192
    move-result-wide v11

    .line 193
    shr-long/2addr v11, v6

    .line 194
    long-to-int v9, v11

    .line 195
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 196
    .line 197
    .line 198
    move-result v9

    .line 199
    invoke-interface {v10}, La/fhl;->d()J

    .line 200
    .line 201
    .line 202
    move-result-wide v11

    .line 203
    and-long/2addr v11, v4

    .line 204
    long-to-int v11, v11

    .line 205
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 206
    .line 207
    .line 208
    move-result v11

    .line 209
    div-float/2addr v11, v3

    .line 210
    div-float v21, v17, v3

    .line 211
    .line 212
    sub-float v9, v9, v21

    .line 213
    .line 214
    invoke-static/range {v21 .. v21}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 215
    .line 216
    .line 217
    move-result v12

    .line 218
    int-to-long v12, v12

    .line 219
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 220
    .line 221
    .line 222
    move-result v14

    .line 223
    int-to-long v14, v14

    .line 224
    shl-long/2addr v12, v6

    .line 225
    and-long/2addr v14, v4

    .line 226
    or-long v13, v12, v14

    .line 227
    .line 228
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 229
    .line 230
    .line 231
    move-result v9

    .line 232
    move/from16 v23, v2

    .line 233
    .line 234
    move/from16 v22, v3

    .line 235
    .line 236
    int-to-long v2, v9

    .line 237
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 238
    .line 239
    .line 240
    move-result v9

    .line 241
    int-to-long v11, v9

    .line 242
    shl-long/2addr v2, v6

    .line 243
    and-long/2addr v11, v4

    .line 244
    or-long v15, v2, v11

    .line 245
    .line 246
    const/16 v19, 0x0

    .line 247
    .line 248
    const/16 v20, 0x1e0

    .line 249
    .line 250
    iget-wide v11, v0, La/yn8;->b:J

    .line 251
    .line 252
    const/16 v18, 0x1

    .line 253
    .line 254
    invoke-static/range {v10 .. v20}, La/fhl;->Q(La/fhl;JJJFILa/x03;I)V

    .line 255
    .line 256
    .line 257
    cmpg-float v2, v1, v23

    .line 258
    .line 259
    if-nez v2, :cond_1

    .line 260
    .line 261
    goto/16 :goto_0

    .line 262
    .line 263
    :cond_1
    cmpg-float v2, v1, v7

    .line 264
    .line 265
    iget-wide v11, v0, La/yn8;->d:J

    .line 266
    .line 267
    if-nez v2, :cond_2

    .line 268
    .line 269
    invoke-interface {v10}, La/fhl;->d()J

    .line 270
    .line 271
    .line 272
    move-result-wide v0

    .line 273
    and-long/2addr v0, v4

    .line 274
    long-to-int v0, v0

    .line 275
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    div-float v0, v0, v22

    .line 280
    .line 281
    invoke-static/range {v21 .. v21}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 282
    .line 283
    .line 284
    move-result v1

    .line 285
    int-to-long v1, v1

    .line 286
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 287
    .line 288
    .line 289
    move-result v3

    .line 290
    int-to-long v7, v3

    .line 291
    shl-long/2addr v1, v6

    .line 292
    and-long/2addr v7, v4

    .line 293
    or-long v13, v1, v7

    .line 294
    .line 295
    invoke-interface {v10}, La/fhl;->d()J

    .line 296
    .line 297
    .line 298
    move-result-wide v1

    .line 299
    shr-long/2addr v1, v6

    .line 300
    long-to-int v1, v1

    .line 301
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 302
    .line 303
    .line 304
    move-result v1

    .line 305
    sub-float v1, v1, v21

    .line 306
    .line 307
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 308
    .line 309
    .line 310
    move-result v1

    .line 311
    int-to-long v1, v1

    .line 312
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 313
    .line 314
    .line 315
    move-result v0

    .line 316
    int-to-long v7, v0

    .line 317
    shl-long v0, v1, v6

    .line 318
    .line 319
    and-long v2, v7, v4

    .line 320
    .line 321
    or-long v15, v0, v2

    .line 322
    .line 323
    const/16 v19, 0x0

    .line 324
    .line 325
    const/16 v20, 0x1e0

    .line 326
    .line 327
    const/16 v18, 0x1

    .line 328
    .line 329
    invoke-static/range {v10 .. v20}, La/fhl;->Q(La/fhl;JJJFILa/x03;I)V

    .line 330
    .line 331
    .line 332
    goto/16 :goto_0

    .line 333
    .line 334
    :cond_2
    const/high16 v0, 0x41000000    # 8.0f

    .line 335
    .line 336
    if-eqz v8, :cond_4

    .line 337
    .line 338
    invoke-interface {v10}, La/fhl;->d()J

    .line 339
    .line 340
    .line 341
    move-result-wide v2

    .line 342
    shr-long/2addr v2, v6

    .line 343
    long-to-int v2, v2

    .line 344
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 345
    .line 346
    .line 347
    move-result v2

    .line 348
    invoke-interface {v10}, La/fhl;->d()J

    .line 349
    .line 350
    .line 351
    move-result-wide v7

    .line 352
    and-long/2addr v7, v4

    .line 353
    long-to-int v3, v7

    .line 354
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 355
    .line 356
    .line 357
    move-result v3

    .line 358
    div-float v3, v3, v22

    .line 359
    .line 360
    sget-object v7, La/qmk;->a:La/zcl;

    .line 361
    .line 362
    invoke-interface {v10, v0}, La/w6k;->w0(F)F

    .line 363
    .line 364
    .line 365
    move-result v0

    .line 366
    mul-float v7, v0, v22

    .line 367
    .line 368
    sub-float v7, v2, v7

    .line 369
    .line 370
    cmpg-float v8, v7, v0

    .line 371
    .line 372
    if-gez v8, :cond_3

    .line 373
    .line 374
    move v7, v0

    .line 375
    :cond_3
    new-instance v8, La/cvc;

    .line 376
    .line 377
    invoke-direct {v8, v0, v7}, La/cvc;-><init>(FF)V

    .line 378
    .line 379
    .line 380
    mul-float/2addr v1, v2

    .line 381
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    invoke-static {v0, v8}, La/l1e0;->g(Ljava/lang/Comparable;La/cvc;)Ljava/lang/Comparable;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    check-cast v0, Ljava/lang/Number;

    .line 390
    .line 391
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 392
    .line 393
    .line 394
    move-result v0

    .line 395
    invoke-interface {v10}, La/fhl;->d()J

    .line 396
    .line 397
    .line 398
    move-result-wide v1

    .line 399
    shr-long/2addr v1, v6

    .line 400
    long-to-int v1, v1

    .line 401
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 402
    .line 403
    .line 404
    move-result v1

    .line 405
    sub-float/2addr v1, v0

    .line 406
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 407
    .line 408
    .line 409
    move-result v0

    .line 410
    int-to-long v0, v0

    .line 411
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 412
    .line 413
    .line 414
    move-result v2

    .line 415
    int-to-long v7, v2

    .line 416
    shl-long/2addr v0, v6

    .line 417
    and-long/2addr v7, v4

    .line 418
    or-long v13, v0, v7

    .line 419
    .line 420
    invoke-interface {v10}, La/fhl;->d()J

    .line 421
    .line 422
    .line 423
    move-result-wide v0

    .line 424
    shr-long/2addr v0, v6

    .line 425
    long-to-int v0, v0

    .line 426
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 427
    .line 428
    .line 429
    move-result v0

    .line 430
    sub-float v0, v0, v21

    .line 431
    .line 432
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 433
    .line 434
    .line 435
    move-result v0

    .line 436
    int-to-long v0, v0

    .line 437
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 438
    .line 439
    .line 440
    move-result v2

    .line 441
    int-to-long v2, v2

    .line 442
    shl-long/2addr v0, v6

    .line 443
    and-long/2addr v2, v4

    .line 444
    or-long v15, v0, v2

    .line 445
    .line 446
    const/16 v19, 0x0

    .line 447
    .line 448
    const/16 v20, 0x1e0

    .line 449
    .line 450
    const/16 v18, 0x1

    .line 451
    .line 452
    invoke-static/range {v10 .. v20}, La/fhl;->Q(La/fhl;JJJFILa/x03;I)V

    .line 453
    .line 454
    .line 455
    goto :goto_0

    .line 456
    :cond_4
    invoke-interface {v10}, La/fhl;->d()J

    .line 457
    .line 458
    .line 459
    move-result-wide v2

    .line 460
    shr-long/2addr v2, v6

    .line 461
    long-to-int v2, v2

    .line 462
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 463
    .line 464
    .line 465
    move-result v2

    .line 466
    invoke-interface {v10}, La/fhl;->d()J

    .line 467
    .line 468
    .line 469
    move-result-wide v7

    .line 470
    and-long/2addr v7, v4

    .line 471
    long-to-int v3, v7

    .line 472
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 473
    .line 474
    .line 475
    move-result v3

    .line 476
    div-float v3, v3, v22

    .line 477
    .line 478
    sget-object v7, La/qmk;->a:La/zcl;

    .line 479
    .line 480
    invoke-interface {v10, v0}, La/w6k;->w0(F)F

    .line 481
    .line 482
    .line 483
    move-result v0

    .line 484
    mul-float v7, v0, v22

    .line 485
    .line 486
    sub-float v7, v2, v7

    .line 487
    .line 488
    cmpg-float v8, v7, v0

    .line 489
    .line 490
    if-gez v8, :cond_5

    .line 491
    .line 492
    move v7, v0

    .line 493
    :cond_5
    new-instance v8, La/cvc;

    .line 494
    .line 495
    invoke-direct {v8, v0, v7}, La/cvc;-><init>(FF)V

    .line 496
    .line 497
    .line 498
    mul-float/2addr v1, v2

    .line 499
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    invoke-static {v0, v8}, La/l1e0;->g(Ljava/lang/Comparable;La/cvc;)Ljava/lang/Comparable;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    check-cast v0, Ljava/lang/Number;

    .line 508
    .line 509
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 510
    .line 511
    .line 512
    move-result v0

    .line 513
    invoke-static/range {v21 .. v21}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 514
    .line 515
    .line 516
    move-result v1

    .line 517
    int-to-long v1, v1

    .line 518
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 519
    .line 520
    .line 521
    move-result v7

    .line 522
    int-to-long v7, v7

    .line 523
    shl-long/2addr v1, v6

    .line 524
    and-long/2addr v7, v4

    .line 525
    or-long v13, v1, v7

    .line 526
    .line 527
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 528
    .line 529
    .line 530
    move-result v0

    .line 531
    int-to-long v0, v0

    .line 532
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 533
    .line 534
    .line 535
    move-result v2

    .line 536
    int-to-long v2, v2

    .line 537
    shl-long/2addr v0, v6

    .line 538
    and-long/2addr v2, v4

    .line 539
    or-long v15, v0, v2

    .line 540
    .line 541
    const/16 v19, 0x0

    .line 542
    .line 543
    const/16 v20, 0x1e0

    .line 544
    .line 545
    const/16 v18, 0x1

    .line 546
    .line 547
    invoke-static/range {v10 .. v20}, La/fhl;->Q(La/fhl;JJJFILa/x03;I)V

    .line 548
    .line 549
    .line 550
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 551
    .line 552
    return-object v0

    .line 553
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
