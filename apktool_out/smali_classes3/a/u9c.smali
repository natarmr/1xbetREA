.class public final synthetic La/u9c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:F

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(FJJ)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/u9c;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/u9c;->c:F

    iput-wide p2, p0, La/u9c;->b:J

    iput-wide p4, p0, La/u9c;->d:J

    return-void
.end method

.method public synthetic constructor <init>(JFJB)V
    .locals 0

    .line 2
    iput-byte p6, p0, La/u9c;->a:B

    iput-wide p1, p0, La/u9c;->b:J

    iput p3, p0, La/u9c;->c:F

    iput-wide p4, p0, La/u9c;->d:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/u9c;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x40000000    # 2.0f

    .line 6
    .line 7
    const/high16 v3, 0x3f800000    # 1.0f

    .line 8
    .line 9
    const/high16 v6, 0x43b40000    # 360.0f

    .line 10
    .line 11
    const/4 v7, 0x1

    .line 12
    const-wide v8, 0xffffffffL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    const/16 v10, 0x20

    .line 18
    .line 19
    iget v11, v0, La/u9c;->c:F

    .line 20
    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    move-object/from16 v12, p1

    .line 25
    .line 26
    check-cast v12, La/fhl;

    .line 27
    .line 28
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    sget-object v1, La/qmk;->a:La/zcl;

    .line 32
    .line 33
    invoke-interface {v12, v6}, La/w6k;->w0(F)F

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    int-to-long v13, v6

    .line 42
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    const/16 v24, 0x0

    .line 47
    .line 48
    int-to-long v4, v1

    .line 49
    shl-long/2addr v13, v10

    .line 50
    and-long/2addr v4, v8

    .line 51
    or-long v19, v13, v4

    .line 52
    .line 53
    invoke-interface {v12, v3}, La/w6k;->w0(F)F

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    invoke-interface {v12}, La/fhl;->d()J

    .line 58
    .line 59
    .line 60
    move-result-wide v3

    .line 61
    and-long/2addr v3, v8

    .line 62
    long-to-int v3, v3

    .line 63
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    sub-float/2addr v3, v1

    .line 68
    div-float/2addr v3, v2

    .line 69
    invoke-static/range {v24 .. v24}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    int-to-long v4, v2

    .line 74
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    int-to-long v2, v2

    .line 79
    shl-long/2addr v4, v10

    .line 80
    and-long/2addr v2, v8

    .line 81
    or-long v15, v4, v2

    .line 82
    .line 83
    invoke-interface {v12}, La/fhl;->d()J

    .line 84
    .line 85
    .line 86
    move-result-wide v2

    .line 87
    shr-long/2addr v2, v10

    .line 88
    long-to-int v2, v2

    .line 89
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    int-to-long v2, v2

    .line 98
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    int-to-long v4, v1

    .line 103
    shl-long v1, v2, v10

    .line 104
    .line 105
    and-long v3, v4, v8

    .line 106
    .line 107
    or-long v17, v1, v3

    .line 108
    .line 109
    const/16 v21, 0x0

    .line 110
    .line 111
    const/16 v22, 0xf0

    .line 112
    .line 113
    iget-wide v13, v0, La/u9c;->b:J

    .line 114
    .line 115
    invoke-static/range {v12 .. v22}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 116
    .line 117
    .line 118
    invoke-interface {v12}, La/fhl;->d()J

    .line 119
    .line 120
    .line 121
    move-result-wide v1

    .line 122
    shr-long/2addr v1, v10

    .line 123
    long-to-int v1, v1

    .line 124
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    mul-float/2addr v1, v11

    .line 129
    invoke-interface {v12}, La/fhl;->getLayoutDirection()La/k6z;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    if-eqz v2, :cond_1

    .line 138
    .line 139
    if-ne v2, v7, :cond_0

    .line 140
    .line 141
    invoke-interface {v12}, La/fhl;->d()J

    .line 142
    .line 143
    .line 144
    move-result-wide v2

    .line 145
    shr-long/2addr v2, v10

    .line 146
    long-to-int v2, v2

    .line 147
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    sub-float/2addr v2, v1

    .line 152
    goto :goto_0

    .line 153
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 154
    .line 155
    .line 156
    const/4 v4, 0x0

    .line 157
    goto :goto_1

    .line 158
    :cond_1
    move/from16 v2, v24

    .line 159
    .line 160
    :goto_0
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    int-to-long v2, v2

    .line 165
    invoke-static/range {v24 .. v24}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    int-to-long v4, v4

    .line 170
    shl-long/2addr v2, v10

    .line 171
    and-long/2addr v4, v8

    .line 172
    or-long v15, v2, v4

    .line 173
    .line 174
    invoke-interface {v12}, La/fhl;->d()J

    .line 175
    .line 176
    .line 177
    move-result-wide v2

    .line 178
    and-long/2addr v2, v8

    .line 179
    long-to-int v2, v2

    .line 180
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    int-to-long v3, v1

    .line 189
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    int-to-long v1, v1

    .line 194
    shl-long/2addr v3, v10

    .line 195
    and-long/2addr v1, v8

    .line 196
    or-long v17, v3, v1

    .line 197
    .line 198
    const/16 v21, 0x0

    .line 199
    .line 200
    const/16 v22, 0xf0

    .line 201
    .line 202
    iget-wide v13, v0, La/u9c;->d:J

    .line 203
    .line 204
    invoke-static/range {v12 .. v22}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 205
    .line 206
    .line 207
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 208
    .line 209
    :goto_1
    return-object v4

    .line 210
    :pswitch_0
    const/16 v24, 0x0

    .line 211
    .line 212
    move-object/from16 v5, p1

    .line 213
    .line 214
    check-cast v5, La/fhl;

    .line 215
    .line 216
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    sget-object v1, La/qmk;->a:La/zcl;

    .line 220
    .line 221
    invoke-interface {v5, v6}, La/w6k;->w0(F)F

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    int-to-long v2, v2

    .line 230
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    int-to-long v12, v1

    .line 235
    shl-long v1, v2, v10

    .line 236
    .line 237
    and-long v3, v12, v8

    .line 238
    .line 239
    or-long v19, v1, v3

    .line 240
    .line 241
    const/16 v21, 0x0

    .line 242
    .line 243
    const/16 v22, 0xf6

    .line 244
    .line 245
    iget-wide v13, v0, La/u9c;->b:J

    .line 246
    .line 247
    const-wide/16 v15, 0x0

    .line 248
    .line 249
    const-wide/16 v17, 0x0

    .line 250
    .line 251
    move-object v12, v5

    .line 252
    invoke-static/range {v12 .. v22}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 253
    .line 254
    .line 255
    invoke-interface {v5}, La/fhl;->d()J

    .line 256
    .line 257
    .line 258
    move-result-wide v1

    .line 259
    shr-long/2addr v1, v10

    .line 260
    long-to-int v1, v1

    .line 261
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 262
    .line 263
    .line 264
    move-result v1

    .line 265
    mul-float/2addr v1, v11

    .line 266
    invoke-interface {v5}, La/fhl;->getLayoutDirection()La/k6z;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 271
    .line 272
    .line 273
    move-result v2

    .line 274
    if-eqz v2, :cond_3

    .line 275
    .line 276
    if-ne v2, v7, :cond_2

    .line 277
    .line 278
    invoke-interface {v5}, La/fhl;->d()J

    .line 279
    .line 280
    .line 281
    move-result-wide v2

    .line 282
    shr-long/2addr v2, v10

    .line 283
    long-to-int v2, v2

    .line 284
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 285
    .line 286
    .line 287
    move-result v2

    .line 288
    sub-float/2addr v2, v1

    .line 289
    goto :goto_2

    .line 290
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 291
    .line 292
    .line 293
    const/4 v4, 0x0

    .line 294
    goto :goto_3

    .line 295
    :cond_3
    move/from16 v2, v24

    .line 296
    .line 297
    :goto_2
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 298
    .line 299
    .line 300
    move-result v2

    .line 301
    int-to-long v2, v2

    .line 302
    invoke-static/range {v24 .. v24}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 303
    .line 304
    .line 305
    move-result v4

    .line 306
    int-to-long v6, v4

    .line 307
    shl-long/2addr v2, v10

    .line 308
    and-long/2addr v6, v8

    .line 309
    or-long/2addr v2, v6

    .line 310
    invoke-interface {v5}, La/fhl;->d()J

    .line 311
    .line 312
    .line 313
    move-result-wide v6

    .line 314
    and-long/2addr v6, v8

    .line 315
    long-to-int v4, v6

    .line 316
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 317
    .line 318
    .line 319
    move-result v4

    .line 320
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    int-to-long v6, v1

    .line 325
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 326
    .line 327
    .line 328
    move-result v1

    .line 329
    int-to-long v11, v1

    .line 330
    shl-long/2addr v6, v10

    .line 331
    and-long/2addr v8, v11

    .line 332
    or-long v10, v6, v8

    .line 333
    .line 334
    const/4 v14, 0x0

    .line 335
    const/16 v15, 0xf0

    .line 336
    .line 337
    iget-wide v6, v0, La/u9c;->d:J

    .line 338
    .line 339
    move-wide v8, v2

    .line 340
    move-wide/from16 v12, v19

    .line 341
    .line 342
    invoke-static/range {v5 .. v15}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 343
    .line 344
    .line 345
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 346
    .line 347
    :goto_3
    return-object v4

    .line 348
    :pswitch_1
    const/16 v24, 0x0

    .line 349
    .line 350
    move-object/from16 v5, p1

    .line 351
    .line 352
    check-cast v5, La/fhl;

    .line 353
    .line 354
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    sget-object v1, La/qmk;->a:La/zcl;

    .line 358
    .line 359
    invoke-interface {v5, v6}, La/w6k;->w0(F)F

    .line 360
    .line 361
    .line 362
    move-result v1

    .line 363
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 364
    .line 365
    .line 366
    move-result v2

    .line 367
    int-to-long v2, v2

    .line 368
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 369
    .line 370
    .line 371
    move-result v1

    .line 372
    int-to-long v12, v1

    .line 373
    shl-long v1, v2, v10

    .line 374
    .line 375
    and-long v3, v12, v8

    .line 376
    .line 377
    or-long v19, v1, v3

    .line 378
    .line 379
    const/16 v21, 0x0

    .line 380
    .line 381
    const/16 v22, 0xf6

    .line 382
    .line 383
    iget-wide v13, v0, La/u9c;->b:J

    .line 384
    .line 385
    const-wide/16 v15, 0x0

    .line 386
    .line 387
    const-wide/16 v17, 0x0

    .line 388
    .line 389
    move-object v12, v5

    .line 390
    invoke-static/range {v12 .. v22}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 391
    .line 392
    .line 393
    invoke-interface {v5}, La/fhl;->d()J

    .line 394
    .line 395
    .line 396
    move-result-wide v1

    .line 397
    shr-long/2addr v1, v10

    .line 398
    long-to-int v1, v1

    .line 399
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 400
    .line 401
    .line 402
    move-result v1

    .line 403
    mul-float/2addr v1, v11

    .line 404
    invoke-interface {v5}, La/fhl;->getLayoutDirection()La/k6z;

    .line 405
    .line 406
    .line 407
    move-result-object v2

    .line 408
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 409
    .line 410
    .line 411
    move-result v2

    .line 412
    if-eqz v2, :cond_5

    .line 413
    .line 414
    if-ne v2, v7, :cond_4

    .line 415
    .line 416
    invoke-interface {v5}, La/fhl;->d()J

    .line 417
    .line 418
    .line 419
    move-result-wide v2

    .line 420
    shr-long/2addr v2, v10

    .line 421
    long-to-int v2, v2

    .line 422
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 423
    .line 424
    .line 425
    move-result v2

    .line 426
    sub-float/2addr v2, v1

    .line 427
    goto :goto_4

    .line 428
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 429
    .line 430
    .line 431
    const/4 v4, 0x0

    .line 432
    goto :goto_5

    .line 433
    :cond_5
    move/from16 v2, v24

    .line 434
    .line 435
    :goto_4
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 436
    .line 437
    .line 438
    move-result v2

    .line 439
    int-to-long v2, v2

    .line 440
    invoke-static/range {v24 .. v24}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 441
    .line 442
    .line 443
    move-result v4

    .line 444
    int-to-long v6, v4

    .line 445
    shl-long/2addr v2, v10

    .line 446
    and-long/2addr v6, v8

    .line 447
    or-long/2addr v2, v6

    .line 448
    invoke-interface {v5}, La/fhl;->d()J

    .line 449
    .line 450
    .line 451
    move-result-wide v6

    .line 452
    and-long/2addr v6, v8

    .line 453
    long-to-int v4, v6

    .line 454
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 455
    .line 456
    .line 457
    move-result v4

    .line 458
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 459
    .line 460
    .line 461
    move-result v1

    .line 462
    int-to-long v6, v1

    .line 463
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 464
    .line 465
    .line 466
    move-result v1

    .line 467
    int-to-long v11, v1

    .line 468
    shl-long/2addr v6, v10

    .line 469
    and-long/2addr v8, v11

    .line 470
    or-long v10, v6, v8

    .line 471
    .line 472
    const/4 v14, 0x0

    .line 473
    const/16 v15, 0xf0

    .line 474
    .line 475
    iget-wide v6, v0, La/u9c;->d:J

    .line 476
    .line 477
    move-wide v8, v2

    .line 478
    move-wide/from16 v12, v19

    .line 479
    .line 480
    invoke-static/range {v5 .. v15}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 481
    .line 482
    .line 483
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 484
    .line 485
    :goto_5
    return-object v4

    .line 486
    :pswitch_2
    const/16 v24, 0x0

    .line 487
    .line 488
    move-object/from16 v5, p1

    .line 489
    .line 490
    check-cast v5, La/fhl;

    .line 491
    .line 492
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 493
    .line 494
    .line 495
    sget-object v1, La/qmk;->a:La/zcl;

    .line 496
    .line 497
    invoke-interface {v5, v6}, La/w6k;->w0(F)F

    .line 498
    .line 499
    .line 500
    move-result v1

    .line 501
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 502
    .line 503
    .line 504
    move-result v2

    .line 505
    int-to-long v2, v2

    .line 506
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 507
    .line 508
    .line 509
    move-result v1

    .line 510
    int-to-long v12, v1

    .line 511
    shl-long v1, v2, v10

    .line 512
    .line 513
    and-long v3, v12, v8

    .line 514
    .line 515
    or-long v19, v1, v3

    .line 516
    .line 517
    const/16 v21, 0x0

    .line 518
    .line 519
    const/16 v22, 0xf6

    .line 520
    .line 521
    iget-wide v13, v0, La/u9c;->b:J

    .line 522
    .line 523
    const-wide/16 v15, 0x0

    .line 524
    .line 525
    const-wide/16 v17, 0x0

    .line 526
    .line 527
    move-object v12, v5

    .line 528
    invoke-static/range {v12 .. v22}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 529
    .line 530
    .line 531
    invoke-interface {v5}, La/fhl;->d()J

    .line 532
    .line 533
    .line 534
    move-result-wide v1

    .line 535
    shr-long/2addr v1, v10

    .line 536
    long-to-int v1, v1

    .line 537
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 538
    .line 539
    .line 540
    move-result v1

    .line 541
    mul-float/2addr v1, v11

    .line 542
    invoke-interface {v5}, La/fhl;->getLayoutDirection()La/k6z;

    .line 543
    .line 544
    .line 545
    move-result-object v2

    .line 546
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 547
    .line 548
    .line 549
    move-result v2

    .line 550
    if-eqz v2, :cond_7

    .line 551
    .line 552
    if-ne v2, v7, :cond_6

    .line 553
    .line 554
    move/from16 v2, v24

    .line 555
    .line 556
    goto :goto_6

    .line 557
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 558
    .line 559
    .line 560
    const/4 v4, 0x0

    .line 561
    goto :goto_7

    .line 562
    :cond_7
    invoke-interface {v5}, La/fhl;->d()J

    .line 563
    .line 564
    .line 565
    move-result-wide v2

    .line 566
    shr-long/2addr v2, v10

    .line 567
    long-to-int v2, v2

    .line 568
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 569
    .line 570
    .line 571
    move-result v2

    .line 572
    sub-float/2addr v2, v1

    .line 573
    :goto_6
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 574
    .line 575
    .line 576
    move-result v2

    .line 577
    int-to-long v2, v2

    .line 578
    invoke-static/range {v24 .. v24}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 579
    .line 580
    .line 581
    move-result v4

    .line 582
    int-to-long v6, v4

    .line 583
    shl-long/2addr v2, v10

    .line 584
    and-long/2addr v6, v8

    .line 585
    or-long/2addr v2, v6

    .line 586
    invoke-interface {v5}, La/fhl;->d()J

    .line 587
    .line 588
    .line 589
    move-result-wide v6

    .line 590
    and-long/2addr v6, v8

    .line 591
    long-to-int v4, v6

    .line 592
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 593
    .line 594
    .line 595
    move-result v4

    .line 596
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 597
    .line 598
    .line 599
    move-result v1

    .line 600
    int-to-long v6, v1

    .line 601
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 602
    .line 603
    .line 604
    move-result v1

    .line 605
    int-to-long v11, v1

    .line 606
    shl-long/2addr v6, v10

    .line 607
    and-long/2addr v8, v11

    .line 608
    or-long v10, v6, v8

    .line 609
    .line 610
    const/4 v14, 0x0

    .line 611
    const/16 v15, 0xf0

    .line 612
    .line 613
    iget-wide v6, v0, La/u9c;->d:J

    .line 614
    .line 615
    move-wide v8, v2

    .line 616
    move-wide/from16 v12, v19

    .line 617
    .line 618
    invoke-static/range {v5 .. v15}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 619
    .line 620
    .line 621
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 622
    .line 623
    :goto_7
    return-object v4

    .line 624
    :pswitch_3
    const/16 v24, 0x0

    .line 625
    .line 626
    move-object/from16 v5, p1

    .line 627
    .line 628
    check-cast v5, La/fhl;

    .line 629
    .line 630
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 631
    .line 632
    .line 633
    sget-object v1, La/qmk;->a:La/zcl;

    .line 634
    .line 635
    invoke-interface {v5, v6}, La/w6k;->w0(F)F

    .line 636
    .line 637
    .line 638
    move-result v1

    .line 639
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 640
    .line 641
    .line 642
    move-result v2

    .line 643
    int-to-long v2, v2

    .line 644
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 645
    .line 646
    .line 647
    move-result v1

    .line 648
    int-to-long v12, v1

    .line 649
    shl-long v1, v2, v10

    .line 650
    .line 651
    and-long v3, v12, v8

    .line 652
    .line 653
    or-long v19, v1, v3

    .line 654
    .line 655
    const/16 v21, 0x0

    .line 656
    .line 657
    const/16 v22, 0xf6

    .line 658
    .line 659
    iget-wide v13, v0, La/u9c;->b:J

    .line 660
    .line 661
    const-wide/16 v15, 0x0

    .line 662
    .line 663
    const-wide/16 v17, 0x0

    .line 664
    .line 665
    move-object v12, v5

    .line 666
    invoke-static/range {v12 .. v22}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 667
    .line 668
    .line 669
    invoke-interface {v5}, La/fhl;->d()J

    .line 670
    .line 671
    .line 672
    move-result-wide v1

    .line 673
    shr-long/2addr v1, v10

    .line 674
    long-to-int v1, v1

    .line 675
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 676
    .line 677
    .line 678
    move-result v1

    .line 679
    mul-float/2addr v1, v11

    .line 680
    invoke-interface {v5}, La/fhl;->getLayoutDirection()La/k6z;

    .line 681
    .line 682
    .line 683
    move-result-object v2

    .line 684
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 685
    .line 686
    .line 687
    move-result v2

    .line 688
    if-eqz v2, :cond_9

    .line 689
    .line 690
    if-ne v2, v7, :cond_8

    .line 691
    .line 692
    move/from16 v2, v24

    .line 693
    .line 694
    goto :goto_8

    .line 695
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 696
    .line 697
    .line 698
    const/4 v4, 0x0

    .line 699
    goto :goto_9

    .line 700
    :cond_9
    invoke-interface {v5}, La/fhl;->d()J

    .line 701
    .line 702
    .line 703
    move-result-wide v2

    .line 704
    shr-long/2addr v2, v10

    .line 705
    long-to-int v2, v2

    .line 706
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 707
    .line 708
    .line 709
    move-result v2

    .line 710
    sub-float/2addr v2, v1

    .line 711
    :goto_8
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 712
    .line 713
    .line 714
    move-result v2

    .line 715
    int-to-long v2, v2

    .line 716
    invoke-static/range {v24 .. v24}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 717
    .line 718
    .line 719
    move-result v4

    .line 720
    int-to-long v6, v4

    .line 721
    shl-long/2addr v2, v10

    .line 722
    and-long/2addr v6, v8

    .line 723
    or-long/2addr v2, v6

    .line 724
    invoke-interface {v5}, La/fhl;->d()J

    .line 725
    .line 726
    .line 727
    move-result-wide v6

    .line 728
    and-long/2addr v6, v8

    .line 729
    long-to-int v4, v6

    .line 730
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 731
    .line 732
    .line 733
    move-result v4

    .line 734
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 735
    .line 736
    .line 737
    move-result v1

    .line 738
    int-to-long v6, v1

    .line 739
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 740
    .line 741
    .line 742
    move-result v1

    .line 743
    int-to-long v11, v1

    .line 744
    shl-long/2addr v6, v10

    .line 745
    and-long/2addr v8, v11

    .line 746
    or-long v10, v6, v8

    .line 747
    .line 748
    const/4 v14, 0x0

    .line 749
    const/16 v15, 0xf0

    .line 750
    .line 751
    iget-wide v6, v0, La/u9c;->d:J

    .line 752
    .line 753
    move-wide v8, v2

    .line 754
    move-wide/from16 v12, v19

    .line 755
    .line 756
    invoke-static/range {v5 .. v15}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 757
    .line 758
    .line 759
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 760
    .line 761
    :goto_9
    return-object v4

    .line 762
    :pswitch_4
    const/16 v24, 0x0

    .line 763
    .line 764
    move-object/from16 v5, p1

    .line 765
    .line 766
    check-cast v5, La/fhl;

    .line 767
    .line 768
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 769
    .line 770
    .line 771
    sget-object v1, La/qmk;->a:La/zcl;

    .line 772
    .line 773
    invoke-interface {v5, v6}, La/w6k;->w0(F)F

    .line 774
    .line 775
    .line 776
    move-result v1

    .line 777
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 778
    .line 779
    .line 780
    move-result v4

    .line 781
    int-to-long v12, v4

    .line 782
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 783
    .line 784
    .line 785
    move-result v1

    .line 786
    int-to-long v14, v1

    .line 787
    shl-long/2addr v12, v10

    .line 788
    and-long/2addr v14, v8

    .line 789
    or-long v19, v12, v14

    .line 790
    .line 791
    invoke-interface {v5, v3}, La/w6k;->w0(F)F

    .line 792
    .line 793
    .line 794
    move-result v1

    .line 795
    invoke-interface {v5}, La/fhl;->d()J

    .line 796
    .line 797
    .line 798
    move-result-wide v3

    .line 799
    and-long/2addr v3, v8

    .line 800
    long-to-int v3, v3

    .line 801
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 802
    .line 803
    .line 804
    move-result v3

    .line 805
    sub-float/2addr v3, v1

    .line 806
    div-float/2addr v3, v2

    .line 807
    invoke-static/range {v24 .. v24}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 808
    .line 809
    .line 810
    move-result v2

    .line 811
    int-to-long v12, v2

    .line 812
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 813
    .line 814
    .line 815
    move-result v2

    .line 816
    int-to-long v2, v2

    .line 817
    shl-long/2addr v12, v10

    .line 818
    and-long/2addr v2, v8

    .line 819
    or-long v15, v12, v2

    .line 820
    .line 821
    invoke-interface {v5}, La/fhl;->d()J

    .line 822
    .line 823
    .line 824
    move-result-wide v2

    .line 825
    shr-long/2addr v2, v10

    .line 826
    long-to-int v2, v2

    .line 827
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 828
    .line 829
    .line 830
    move-result v2

    .line 831
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 832
    .line 833
    .line 834
    move-result v2

    .line 835
    int-to-long v2, v2

    .line 836
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 837
    .line 838
    .line 839
    move-result v1

    .line 840
    int-to-long v12, v1

    .line 841
    shl-long v1, v2, v10

    .line 842
    .line 843
    and-long v3, v12, v8

    .line 844
    .line 845
    or-long v17, v1, v3

    .line 846
    .line 847
    const/16 v21, 0x0

    .line 848
    .line 849
    const/16 v22, 0xf0

    .line 850
    .line 851
    iget-wide v13, v0, La/u9c;->b:J

    .line 852
    .line 853
    move-object v12, v5

    .line 854
    invoke-static/range {v12 .. v22}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 855
    .line 856
    .line 857
    invoke-interface {v5}, La/fhl;->d()J

    .line 858
    .line 859
    .line 860
    move-result-wide v1

    .line 861
    shr-long/2addr v1, v10

    .line 862
    long-to-int v1, v1

    .line 863
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 864
    .line 865
    .line 866
    move-result v1

    .line 867
    mul-float/2addr v1, v11

    .line 868
    invoke-interface {v5}, La/fhl;->getLayoutDirection()La/k6z;

    .line 869
    .line 870
    .line 871
    move-result-object v2

    .line 872
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 873
    .line 874
    .line 875
    move-result v2

    .line 876
    if-eqz v2, :cond_b

    .line 877
    .line 878
    if-ne v2, v7, :cond_a

    .line 879
    .line 880
    move/from16 v2, v24

    .line 881
    .line 882
    goto :goto_a

    .line 883
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 884
    .line 885
    .line 886
    const/4 v4, 0x0

    .line 887
    goto :goto_b

    .line 888
    :cond_b
    invoke-interface {v5}, La/fhl;->d()J

    .line 889
    .line 890
    .line 891
    move-result-wide v2

    .line 892
    shr-long/2addr v2, v10

    .line 893
    long-to-int v2, v2

    .line 894
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 895
    .line 896
    .line 897
    move-result v2

    .line 898
    sub-float/2addr v2, v1

    .line 899
    :goto_a
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 900
    .line 901
    .line 902
    move-result v2

    .line 903
    int-to-long v2, v2

    .line 904
    invoke-static/range {v24 .. v24}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 905
    .line 906
    .line 907
    move-result v4

    .line 908
    int-to-long v6, v4

    .line 909
    shl-long/2addr v2, v10

    .line 910
    and-long/2addr v6, v8

    .line 911
    or-long/2addr v2, v6

    .line 912
    invoke-interface {v5}, La/fhl;->d()J

    .line 913
    .line 914
    .line 915
    move-result-wide v6

    .line 916
    and-long/2addr v6, v8

    .line 917
    long-to-int v4, v6

    .line 918
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 919
    .line 920
    .line 921
    move-result v4

    .line 922
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 923
    .line 924
    .line 925
    move-result v1

    .line 926
    int-to-long v6, v1

    .line 927
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 928
    .line 929
    .line 930
    move-result v1

    .line 931
    int-to-long v11, v1

    .line 932
    shl-long/2addr v6, v10

    .line 933
    and-long/2addr v8, v11

    .line 934
    or-long v10, v6, v8

    .line 935
    .line 936
    const/4 v14, 0x0

    .line 937
    const/16 v15, 0xf0

    .line 938
    .line 939
    iget-wide v6, v0, La/u9c;->d:J

    .line 940
    .line 941
    move-wide v8, v2

    .line 942
    move-wide/from16 v12, v19

    .line 943
    .line 944
    invoke-static/range {v5 .. v15}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 945
    .line 946
    .line 947
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 948
    .line 949
    :goto_b
    return-object v4

    .line 950
    :pswitch_5
    move-object/from16 v12, p1

    .line 951
    .line 952
    check-cast v12, La/fhl;

    .line 953
    .line 954
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 955
    .line 956
    .line 957
    invoke-interface {v12}, La/fhl;->d()J

    .line 958
    .line 959
    .line 960
    move-result-wide v1

    .line 961
    shr-long/2addr v1, v10

    .line 962
    long-to-int v1, v1

    .line 963
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 964
    .line 965
    .line 966
    move-result v1

    .line 967
    invoke-interface {v12}, La/fhl;->d()J

    .line 968
    .line 969
    .line 970
    move-result-wide v2

    .line 971
    and-long/2addr v2, v8

    .line 972
    long-to-int v2, v2

    .line 973
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 974
    .line 975
    .line 976
    move-result v2

    .line 977
    div-float v3, v1, v11

    .line 978
    .line 979
    float-to-int v3, v3

    .line 980
    add-int/2addr v3, v7

    .line 981
    div-float v4, v2, v11

    .line 982
    .line 983
    float-to-int v4, v4

    .line 984
    add-int/2addr v4, v7

    .line 985
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 986
    .line 987
    .line 988
    move-result v1

    .line 989
    int-to-long v5, v1

    .line 990
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 991
    .line 992
    .line 993
    move-result v1

    .line 994
    int-to-long v1, v1

    .line 995
    shl-long/2addr v5, v10

    .line 996
    and-long/2addr v1, v8

    .line 997
    or-long v17, v5, v1

    .line 998
    .line 999
    const/16 v22, 0x0

    .line 1000
    .line 1001
    const/16 v23, 0x78

    .line 1002
    .line 1003
    iget-wide v13, v0, La/u9c;->b:J

    .line 1004
    .line 1005
    const-wide/16 v15, 0x0

    .line 1006
    .line 1007
    const/16 v19, 0x0

    .line 1008
    .line 1009
    const/16 v20, 0x0

    .line 1010
    .line 1011
    const/16 v21, 0x0

    .line 1012
    .line 1013
    invoke-static/range {v12 .. v23}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 1014
    .line 1015
    .line 1016
    const/4 v1, 0x0

    .line 1017
    move v2, v1

    .line 1018
    :goto_c
    if-ge v2, v4, :cond_e

    .line 1019
    .line 1020
    move v5, v1

    .line 1021
    :goto_d
    if-ge v5, v3, :cond_d

    .line 1022
    .line 1023
    add-int v6, v2, v5

    .line 1024
    .line 1025
    rem-int/lit8 v6, v6, 0x2

    .line 1026
    .line 1027
    if-nez v6, :cond_c

    .line 1028
    .line 1029
    int-to-float v6, v5

    .line 1030
    mul-float/2addr v6, v11

    .line 1031
    int-to-float v7, v2

    .line 1032
    mul-float/2addr v7, v11

    .line 1033
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1034
    .line 1035
    .line 1036
    move-result v6

    .line 1037
    int-to-long v13, v6

    .line 1038
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1039
    .line 1040
    .line 1041
    move-result v6

    .line 1042
    int-to-long v6, v6

    .line 1043
    shl-long/2addr v13, v10

    .line 1044
    and-long/2addr v6, v8

    .line 1045
    or-long v15, v13, v6

    .line 1046
    .line 1047
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1048
    .line 1049
    .line 1050
    move-result v6

    .line 1051
    int-to-long v6, v6

    .line 1052
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1053
    .line 1054
    .line 1055
    move-result v13

    .line 1056
    int-to-long v13, v13

    .line 1057
    shl-long/2addr v6, v10

    .line 1058
    and-long/2addr v13, v8

    .line 1059
    or-long v17, v6, v13

    .line 1060
    .line 1061
    const/16 v22, 0x0

    .line 1062
    .line 1063
    const/16 v23, 0x78

    .line 1064
    .line 1065
    iget-wide v13, v0, La/u9c;->d:J

    .line 1066
    .line 1067
    const/16 v19, 0x0

    .line 1068
    .line 1069
    const/16 v20, 0x0

    .line 1070
    .line 1071
    const/16 v21, 0x0

    .line 1072
    .line 1073
    invoke-static/range {v12 .. v23}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 1074
    .line 1075
    .line 1076
    :cond_c
    add-int/lit8 v5, v5, 0x1

    .line 1077
    .line 1078
    goto :goto_d

    .line 1079
    :cond_d
    add-int/lit8 v2, v2, 0x1

    .line 1080
    .line 1081
    goto :goto_c

    .line 1082
    :cond_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1083
    .line 1084
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
