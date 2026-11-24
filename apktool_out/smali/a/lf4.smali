.class public final synthetic La/lf4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(BJJ)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/lf4;->a:B

    iput-wide p2, p0, La/lf4;->b:J

    iput-wide p4, p0, La/lf4;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/lf4;->a:B

    .line 4
    .line 5
    const/high16 v5, 0x42100000    # 36.0f

    .line 6
    .line 7
    const-wide/16 v6, 0x0

    .line 8
    .line 9
    const/4 v8, 0x0

    .line 10
    const/high16 v9, 0x41a00000    # 20.0f

    .line 11
    .line 12
    const/high16 v10, 0x3f800000    # 1.0f

    .line 13
    .line 14
    const/high16 v11, 0x41000000    # 8.0f

    .line 15
    .line 16
    const/high16 v12, 0x40000000    # 2.0f

    .line 17
    .line 18
    const-wide v13, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    const/16 v15, 0x20

    .line 24
    .line 25
    packed-switch v1, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    move-object/from16 v1, p1

    .line 29
    .line 30
    check-cast v1, La/fhl;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    sget-object v2, La/qmk;->a:La/zcl;

    .line 36
    .line 37
    const/high16 v2, 0x41600000    # 14.0f

    .line 38
    .line 39
    invoke-interface {v1, v2}, La/w6k;->w0(F)F

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    int-to-long v3, v3

    .line 48
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    int-to-long v5, v2

    .line 53
    shl-long v2, v3, v15

    .line 54
    .line 55
    and-long v4, v5, v13

    .line 56
    .line 57
    or-long v23, v2, v4

    .line 58
    .line 59
    invoke-interface {v1}, La/fhl;->d()J

    .line 60
    .line 61
    .line 62
    move-result-wide v21

    .line 63
    const/16 v25, 0x0

    .line 64
    .line 65
    const/16 v26, 0xf2

    .line 66
    .line 67
    iget-wide v2, v0, La/lf4;->b:J

    .line 68
    .line 69
    const-wide/16 v19, 0x0

    .line 70
    .line 71
    move-object/from16 v16, v1

    .line 72
    .line 73
    move-wide/from16 v17, v2

    .line 74
    .line 75
    invoke-static/range {v16 .. v26}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 76
    .line 77
    .line 78
    invoke-interface {v1, v10}, La/w6k;->w0(F)F

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    div-float v2, v3, v12

    .line 83
    .line 84
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    int-to-long v4, v4

    .line 89
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    int-to-long v6, v2

    .line 94
    shl-long/2addr v4, v15

    .line 95
    and-long/2addr v6, v13

    .line 96
    or-long v19, v4, v6

    .line 97
    .line 98
    invoke-interface {v1}, La/fhl;->d()J

    .line 99
    .line 100
    .line 101
    move-result-wide v4

    .line 102
    shr-long/2addr v4, v15

    .line 103
    long-to-int v2, v4

    .line 104
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    sub-float/2addr v2, v3

    .line 109
    invoke-interface {v1}, La/fhl;->d()J

    .line 110
    .line 111
    .line 112
    move-result-wide v4

    .line 113
    and-long/2addr v4, v13

    .line 114
    long-to-int v4, v4

    .line 115
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    sub-float/2addr v4, v3

    .line 120
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    int-to-long v5, v2

    .line 125
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    int-to-long v7, v2

    .line 130
    shl-long v4, v5, v15

    .line 131
    .line 132
    and-long v6, v7, v13

    .line 133
    .line 134
    or-long v21, v4, v6

    .line 135
    .line 136
    new-instance v2, La/vtm0;

    .line 137
    .line 138
    const/4 v7, 0x0

    .line 139
    const/16 v8, 0x1e

    .line 140
    .line 141
    const/4 v4, 0x0

    .line 142
    const/4 v5, 0x0

    .line 143
    const/4 v6, 0x0

    .line 144
    invoke-direct/range {v2 .. v8}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 145
    .line 146
    .line 147
    const/16 v26, 0xe0

    .line 148
    .line 149
    iget-wide v3, v0, La/lf4;->c:J

    .line 150
    .line 151
    move-object/from16 v25, v2

    .line 152
    .line 153
    move-wide/from16 v17, v3

    .line 154
    .line 155
    invoke-static/range {v16 .. v26}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 156
    .line 157
    .line 158
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 159
    .line 160
    return-object v0

    .line 161
    :pswitch_0
    move-object/from16 v1, p1

    .line 162
    .line 163
    check-cast v1, La/fhl;

    .line 164
    .line 165
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    sget-object v2, La/qmk;->a:La/zcl;

    .line 169
    .line 170
    invoke-interface {v1, v11}, La/w6k;->w0(F)F

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    int-to-long v3, v3

    .line 179
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    int-to-long v5, v2

    .line 184
    shl-long v2, v3, v15

    .line 185
    .line 186
    and-long v4, v5, v13

    .line 187
    .line 188
    or-long v23, v2, v4

    .line 189
    .line 190
    invoke-interface {v1}, La/fhl;->d()J

    .line 191
    .line 192
    .line 193
    move-result-wide v21

    .line 194
    const/16 v25, 0x0

    .line 195
    .line 196
    const/16 v26, 0xf2

    .line 197
    .line 198
    iget-wide v2, v0, La/lf4;->b:J

    .line 199
    .line 200
    const-wide/16 v19, 0x0

    .line 201
    .line 202
    move-object/from16 v16, v1

    .line 203
    .line 204
    move-wide/from16 v17, v2

    .line 205
    .line 206
    invoke-static/range {v16 .. v26}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 207
    .line 208
    .line 209
    invoke-interface {v1, v10}, La/w6k;->w0(F)F

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    div-float v2, v3, v12

    .line 214
    .line 215
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 216
    .line 217
    .line 218
    move-result v4

    .line 219
    int-to-long v4, v4

    .line 220
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    int-to-long v6, v2

    .line 225
    shl-long/2addr v4, v15

    .line 226
    and-long/2addr v6, v13

    .line 227
    or-long v9, v4, v6

    .line 228
    .line 229
    invoke-interface {v1}, La/fhl;->d()J

    .line 230
    .line 231
    .line 232
    move-result-wide v4

    .line 233
    shr-long/2addr v4, v15

    .line 234
    long-to-int v2, v4

    .line 235
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    sub-float/2addr v2, v3

    .line 240
    invoke-interface {v1}, La/fhl;->d()J

    .line 241
    .line 242
    .line 243
    move-result-wide v4

    .line 244
    and-long/2addr v4, v13

    .line 245
    long-to-int v4, v4

    .line 246
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 247
    .line 248
    .line 249
    move-result v4

    .line 250
    sub-float/2addr v4, v3

    .line 251
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    int-to-long v5, v2

    .line 256
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 257
    .line 258
    .line 259
    move-result v2

    .line 260
    int-to-long v7, v2

    .line 261
    shl-long v4, v5, v15

    .line 262
    .line 263
    and-long v6, v7, v13

    .line 264
    .line 265
    or-long v11, v4, v6

    .line 266
    .line 267
    new-instance v2, La/vtm0;

    .line 268
    .line 269
    const/4 v7, 0x0

    .line 270
    const/16 v8, 0x1e

    .line 271
    .line 272
    const/4 v4, 0x0

    .line 273
    const/4 v5, 0x0

    .line 274
    const/4 v6, 0x0

    .line 275
    invoke-direct/range {v2 .. v8}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 276
    .line 277
    .line 278
    move-wide v6, v11

    .line 279
    const/16 v11, 0xe0

    .line 280
    .line 281
    move-wide v4, v9

    .line 282
    move-object v10, v2

    .line 283
    iget-wide v2, v0, La/lf4;->c:J

    .line 284
    .line 285
    move-wide/from16 v8, v23

    .line 286
    .line 287
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 288
    .line 289
    .line 290
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 291
    .line 292
    return-object v0

    .line 293
    :pswitch_1
    move-object/from16 v1, p1

    .line 294
    .line 295
    check-cast v1, La/n1g;

    .line 296
    .line 297
    iget-wide v2, v0, La/lf4;->b:J

    .line 298
    .line 299
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    invoke-virtual {v1, v2}, La/n1g;->b(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    iget-wide v2, v0, La/lf4;->c:J

    .line 307
    .line 308
    iput-wide v2, v1, La/n1g;->c:J

    .line 309
    .line 310
    new-instance v0, La/mr2;

    .line 311
    .line 312
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 313
    .line 314
    .line 315
    iput-object v0, v1, La/n1g;->e:La/ms2;

    .line 316
    .line 317
    sget-object v0, La/j1g;->c:La/j1g;

    .line 318
    .line 319
    iput-object v0, v1, La/n1g;->d:La/j1g;

    .line 320
    .line 321
    sget-object v0, La/l1g;->b:La/l1g;

    .line 322
    .line 323
    iput-object v0, v1, La/n1g;->f:La/l1g;

    .line 324
    .line 325
    sget-object v0, La/k1g;->b:La/k1g;

    .line 326
    .line 327
    iput-object v0, v1, La/n1g;->g:La/k1g;

    .line 328
    .line 329
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 330
    .line 331
    return-object v0

    .line 332
    :pswitch_2
    move-object/from16 v1, p1

    .line 333
    .line 334
    check-cast v1, La/fhl;

    .line 335
    .line 336
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 337
    .line 338
    .line 339
    const/4 v10, 0x0

    .line 340
    const/16 v11, 0xf6

    .line 341
    .line 342
    iget-wide v2, v0, La/lf4;->b:J

    .line 343
    .line 344
    const-wide/16 v4, 0x0

    .line 345
    .line 346
    const-wide/16 v6, 0x0

    .line 347
    .line 348
    iget-wide v8, v0, La/lf4;->c:J

    .line 349
    .line 350
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 351
    .line 352
    .line 353
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 354
    .line 355
    return-object v0

    .line 356
    :pswitch_3
    move-object/from16 v1, p1

    .line 357
    .line 358
    check-cast v1, La/fhl;

    .line 359
    .line 360
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 361
    .line 362
    .line 363
    const/4 v10, 0x0

    .line 364
    const/16 v11, 0xf6

    .line 365
    .line 366
    iget-wide v2, v0, La/lf4;->b:J

    .line 367
    .line 368
    const-wide/16 v4, 0x0

    .line 369
    .line 370
    const-wide/16 v6, 0x0

    .line 371
    .line 372
    iget-wide v8, v0, La/lf4;->c:J

    .line 373
    .line 374
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 375
    .line 376
    .line 377
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 378
    .line 379
    return-object v0

    .line 380
    :pswitch_4
    move-object/from16 v1, p1

    .line 381
    .line 382
    check-cast v1, La/pi9;

    .line 383
    .line 384
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 385
    .line 386
    .line 387
    invoke-static {}, La/z03;->a()La/w03;

    .line 388
    .line 389
    .line 390
    move-result-object v10

    .line 391
    const/high16 v16, 0x43b40000    # 360.0f

    .line 392
    .line 393
    iget-object v2, v1, La/pi9;->a:La/y99;

    .line 394
    .line 395
    const/high16 v17, 0x41900000    # 18.0f

    .line 396
    .line 397
    const/high16 v18, 0x40800000    # 4.0f

    .line 398
    .line 399
    invoke-interface {v2}, La/y99;->d()J

    .line 400
    .line 401
    .line 402
    move-result-wide v3

    .line 403
    invoke-static {v6, v7, v3, v4}, La/k9x;->r(JJ)La/jge0;

    .line 404
    .line 405
    .line 406
    move-result-object v19

    .line 407
    invoke-static {v1, v9}, La/xww;->D(La/pi9;F)J

    .line 408
    .line 409
    .line 410
    move-result-wide v20

    .line 411
    invoke-static {v1, v9}, La/xww;->D(La/pi9;F)J

    .line 412
    .line 413
    .line 414
    move-result-wide v22

    .line 415
    invoke-static {v1, v8}, La/xww;->D(La/pi9;F)J

    .line 416
    .line 417
    .line 418
    move-result-wide v26

    .line 419
    invoke-static {v1, v8}, La/xww;->D(La/pi9;F)J

    .line 420
    .line 421
    .line 422
    move-result-wide v24

    .line 423
    invoke-static/range {v19 .. v27}, La/r8x;->u(La/jge0;JJJJ)La/wfg0;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    invoke-static {v10, v2}, La/w03;->b(La/w03;La/wfg0;)V

    .line 428
    .line 429
    .line 430
    sget-object v2, La/qmk;->a:La/zcl;

    .line 431
    .line 432
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 433
    .line 434
    .line 435
    move-result v2

    .line 436
    mul-float/2addr v2, v5

    .line 437
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 438
    .line 439
    .line 440
    move-result v3

    .line 441
    mul-float v3, v3, v18

    .line 442
    .line 443
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 444
    .line 445
    .line 446
    move-result v2

    .line 447
    int-to-long v4, v2

    .line 448
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 449
    .line 450
    .line 451
    move-result v2

    .line 452
    int-to-long v2, v2

    .line 453
    shl-long/2addr v4, v15

    .line 454
    and-long/2addr v2, v13

    .line 455
    or-long v24, v4, v2

    .line 456
    .line 457
    iget-object v2, v1, La/pi9;->a:La/y99;

    .line 458
    .line 459
    invoke-interface {v2}, La/y99;->d()J

    .line 460
    .line 461
    .line 462
    move-result-wide v2

    .line 463
    shr-long/2addr v2, v15

    .line 464
    long-to-int v2, v2

    .line 465
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 466
    .line 467
    .line 468
    move-result v2

    .line 469
    div-float/2addr v2, v12

    .line 470
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 471
    .line 472
    .line 473
    move-result v3

    .line 474
    mul-float v3, v3, v17

    .line 475
    .line 476
    sub-float/2addr v2, v3

    .line 477
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 478
    .line 479
    .line 480
    move-result v3

    .line 481
    mul-float/2addr v3, v11

    .line 482
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 483
    .line 484
    .line 485
    move-result v2

    .line 486
    int-to-long v4, v2

    .line 487
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 488
    .line 489
    .line 490
    move-result v2

    .line 491
    int-to-long v2, v2

    .line 492
    shl-long/2addr v4, v15

    .line 493
    and-long/2addr v2, v13

    .line 494
    or-long v22, v4, v2

    .line 495
    .line 496
    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 497
    .line 498
    .line 499
    move-result v2

    .line 500
    int-to-long v2, v2

    .line 501
    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 502
    .line 503
    .line 504
    move-result v4

    .line 505
    int-to-long v4, v4

    .line 506
    shl-long/2addr v2, v15

    .line 507
    and-long/2addr v4, v13

    .line 508
    or-long v26, v2, v4

    .line 509
    .line 510
    new-instance v16, La/om40;

    .line 511
    .line 512
    const/16 v28, 0x0

    .line 513
    .line 514
    iget-wide v2, v0, La/lf4;->b:J

    .line 515
    .line 516
    iget-wide v4, v0, La/lf4;->c:J

    .line 517
    .line 518
    move-wide/from16 v18, v2

    .line 519
    .line 520
    move-wide/from16 v20, v4

    .line 521
    .line 522
    move-object/from16 v17, v10

    .line 523
    .line 524
    invoke-direct/range {v16 .. v28}, La/om40;-><init>(La/w03;JJJJJB)V

    .line 525
    .line 526
    .line 527
    move-object/from16 v0, v16

    .line 528
    .line 529
    invoke-virtual {v1, v0}, La/pi9;->a(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    return-object v0

    .line 534
    :pswitch_5
    const/high16 v16, 0x43b40000    # 360.0f

    .line 535
    .line 536
    const/high16 v17, 0x41900000    # 18.0f

    .line 537
    .line 538
    const/high16 v18, 0x40800000    # 4.0f

    .line 539
    .line 540
    move-object/from16 v1, p1

    .line 541
    .line 542
    check-cast v1, La/pi9;

    .line 543
    .line 544
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 545
    .line 546
    .line 547
    invoke-static {}, La/z03;->a()La/w03;

    .line 548
    .line 549
    .line 550
    move-result-object v2

    .line 551
    iget-object v3, v1, La/pi9;->a:La/y99;

    .line 552
    .line 553
    invoke-interface {v3}, La/y99;->d()J

    .line 554
    .line 555
    .line 556
    move-result-wide v3

    .line 557
    invoke-static {v6, v7, v3, v4}, La/k9x;->r(JJ)La/jge0;

    .line 558
    .line 559
    .line 560
    move-result-object v19

    .line 561
    invoke-static {v1, v9}, La/xvw;->F(La/pi9;F)J

    .line 562
    .line 563
    .line 564
    move-result-wide v20

    .line 565
    invoke-static {v1, v9}, La/xvw;->F(La/pi9;F)J

    .line 566
    .line 567
    .line 568
    move-result-wide v22

    .line 569
    invoke-static {v1, v8}, La/xvw;->F(La/pi9;F)J

    .line 570
    .line 571
    .line 572
    move-result-wide v26

    .line 573
    invoke-static {v1, v8}, La/xvw;->F(La/pi9;F)J

    .line 574
    .line 575
    .line 576
    move-result-wide v24

    .line 577
    invoke-static/range {v19 .. v27}, La/r8x;->u(La/jge0;JJJJ)La/wfg0;

    .line 578
    .line 579
    .line 580
    move-result-object v3

    .line 581
    invoke-static {v2, v3}, La/w03;->b(La/w03;La/wfg0;)V

    .line 582
    .line 583
    .line 584
    sget-object v3, La/qmk;->a:La/zcl;

    .line 585
    .line 586
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 587
    .line 588
    .line 589
    move-result v3

    .line 590
    mul-float/2addr v3, v5

    .line 591
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 592
    .line 593
    .line 594
    move-result v4

    .line 595
    mul-float v4, v4, v18

    .line 596
    .line 597
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 598
    .line 599
    .line 600
    move-result v3

    .line 601
    int-to-long v5, v3

    .line 602
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 603
    .line 604
    .line 605
    move-result v3

    .line 606
    int-to-long v3, v3

    .line 607
    shl-long/2addr v5, v15

    .line 608
    and-long/2addr v3, v13

    .line 609
    or-long v27, v5, v3

    .line 610
    .line 611
    iget-object v3, v1, La/pi9;->a:La/y99;

    .line 612
    .line 613
    invoke-interface {v3}, La/y99;->d()J

    .line 614
    .line 615
    .line 616
    move-result-wide v3

    .line 617
    shr-long/2addr v3, v15

    .line 618
    long-to-int v3, v3

    .line 619
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 620
    .line 621
    .line 622
    move-result v3

    .line 623
    div-float/2addr v3, v12

    .line 624
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 625
    .line 626
    .line 627
    move-result v4

    .line 628
    mul-float v4, v4, v17

    .line 629
    .line 630
    sub-float/2addr v3, v4

    .line 631
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 632
    .line 633
    .line 634
    move-result v4

    .line 635
    mul-float/2addr v4, v11

    .line 636
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 637
    .line 638
    .line 639
    move-result v3

    .line 640
    int-to-long v5, v3

    .line 641
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 642
    .line 643
    .line 644
    move-result v3

    .line 645
    int-to-long v3, v3

    .line 646
    shl-long/2addr v5, v15

    .line 647
    and-long/2addr v3, v13

    .line 648
    or-long v25, v5, v3

    .line 649
    .line 650
    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 651
    .line 652
    .line 653
    move-result v3

    .line 654
    int-to-long v3, v3

    .line 655
    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 656
    .line 657
    .line 658
    move-result v5

    .line 659
    int-to-long v5, v5

    .line 660
    shl-long/2addr v3, v15

    .line 661
    and-long/2addr v5, v13

    .line 662
    or-long v29, v3, v5

    .line 663
    .line 664
    new-instance v19, La/om40;

    .line 665
    .line 666
    const/16 v31, 0x1

    .line 667
    .line 668
    iget-wide v3, v0, La/lf4;->b:J

    .line 669
    .line 670
    iget-wide v5, v0, La/lf4;->c:J

    .line 671
    .line 672
    move-object/from16 v20, v2

    .line 673
    .line 674
    move-wide/from16 v21, v3

    .line 675
    .line 676
    move-wide/from16 v23, v5

    .line 677
    .line 678
    invoke-direct/range {v19 .. v31}, La/om40;-><init>(La/w03;JJJJJB)V

    .line 679
    .line 680
    .line 681
    move-object/from16 v0, v19

    .line 682
    .line 683
    invoke-virtual {v1, v0}, La/pi9;->a(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    return-object v0

    .line 688
    :pswitch_6
    move-object/from16 v1, p1

    .line 689
    .line 690
    check-cast v1, La/fhl;

    .line 691
    .line 692
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 693
    .line 694
    .line 695
    const/4 v10, 0x0

    .line 696
    const/16 v11, 0xf6

    .line 697
    .line 698
    iget-wide v2, v0, La/lf4;->b:J

    .line 699
    .line 700
    const-wide/16 v4, 0x0

    .line 701
    .line 702
    const-wide/16 v6, 0x0

    .line 703
    .line 704
    iget-wide v8, v0, La/lf4;->c:J

    .line 705
    .line 706
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 707
    .line 708
    .line 709
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 710
    .line 711
    return-object v0

    .line 712
    :pswitch_7
    move-object/from16 v1, p1

    .line 713
    .line 714
    check-cast v1, La/fhl;

    .line 715
    .line 716
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 717
    .line 718
    .line 719
    sget-object v2, La/s6t0;->a:La/pz40;

    .line 720
    .line 721
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 722
    .line 723
    .line 724
    move-result-object v2

    .line 725
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 726
    .line 727
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 728
    .line 729
    .line 730
    move-result-wide v2

    .line 731
    const/4 v11, 0x0

    .line 732
    const/16 v12, 0x78

    .line 733
    .line 734
    iget-wide v4, v0, La/lf4;->b:J

    .line 735
    .line 736
    iget-wide v6, v0, La/lf4;->c:J

    .line 737
    .line 738
    const/4 v8, 0x0

    .line 739
    const/4 v9, 0x0

    .line 740
    const/4 v10, 0x0

    .line 741
    invoke-static/range {v1 .. v12}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 742
    .line 743
    .line 744
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 745
    .line 746
    return-object v0

    .line 747
    :pswitch_8
    move-object/from16 v1, p1

    .line 748
    .line 749
    check-cast v1, La/fhl;

    .line 750
    .line 751
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 752
    .line 753
    .line 754
    sget-object v2, La/s6t0;->a:La/pz40;

    .line 755
    .line 756
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 757
    .line 758
    .line 759
    move-result-object v2

    .line 760
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 761
    .line 762
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 763
    .line 764
    .line 765
    move-result-wide v2

    .line 766
    const/4 v11, 0x0

    .line 767
    const/16 v12, 0x78

    .line 768
    .line 769
    iget-wide v4, v0, La/lf4;->b:J

    .line 770
    .line 771
    iget-wide v6, v0, La/lf4;->c:J

    .line 772
    .line 773
    const/4 v8, 0x0

    .line 774
    const/4 v9, 0x0

    .line 775
    const/4 v10, 0x0

    .line 776
    invoke-static/range {v1 .. v12}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 777
    .line 778
    .line 779
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 780
    .line 781
    return-object v0

    .line 782
    :pswitch_9
    move-object/from16 v1, p1

    .line 783
    .line 784
    check-cast v1, La/fhl;

    .line 785
    .line 786
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 787
    .line 788
    .line 789
    invoke-interface {v1}, La/fhl;->d()J

    .line 790
    .line 791
    .line 792
    move-result-wide v6

    .line 793
    const/4 v11, 0x0

    .line 794
    const/16 v12, 0x78

    .line 795
    .line 796
    iget-wide v2, v0, La/lf4;->b:J

    .line 797
    .line 798
    iget-wide v4, v0, La/lf4;->c:J

    .line 799
    .line 800
    const/4 v8, 0x0

    .line 801
    const/4 v9, 0x0

    .line 802
    const/4 v10, 0x0

    .line 803
    invoke-static/range {v1 .. v12}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 804
    .line 805
    .line 806
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 807
    .line 808
    return-object v0

    .line 809
    :pswitch_data_0
    .packed-switch 0x0
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
