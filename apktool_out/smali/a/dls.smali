.class public final synthetic La/dls;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(BJ)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/dls;->a:B

    iput-wide p2, p0, La/dls;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/dls;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x43340000    # 180.0f

    .line 6
    .line 7
    const/high16 v3, 0x40000000    # 2.0f

    .line 8
    .line 9
    const/16 v4, 0xc

    .line 10
    .line 11
    const/high16 v5, 0x41400000    # 12.0f

    .line 12
    .line 13
    const/high16 v6, 0x40800000    # 4.0f

    .line 14
    .line 15
    const/high16 v7, 0x41a00000    # 20.0f

    .line 16
    .line 17
    const/4 v8, 0x0

    .line 18
    const/high16 v9, 0x41200000    # 10.0f

    .line 19
    .line 20
    const/high16 v10, 0x43b40000    # 360.0f

    .line 21
    .line 22
    const/high16 v11, 0x41000000    # 8.0f

    .line 23
    .line 24
    const/high16 v12, 0x41800000    # 16.0f

    .line 25
    .line 26
    iget-wide v13, v0, La/dls;->b:J

    .line 27
    .line 28
    const/4 v15, 0x0

    .line 29
    const-wide v16, 0xffffffffL

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    const/16 v18, 0x20

    .line 35
    .line 36
    packed-switch v1, :pswitch_data_0

    .line 37
    .line 38
    .line 39
    move-object/from16 v1, p1

    .line 40
    .line 41
    check-cast v1, La/fhl;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    sget-object v2, La/qmk;->a:La/zcl;

    .line 47
    .line 48
    invoke-interface {v1, v9}, La/w6k;->w0(F)F

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    int-to-long v3, v3

    .line 57
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    int-to-long v5, v2

    .line 62
    shl-long v2, v3, v18

    .line 63
    .line 64
    and-long v4, v5, v16

    .line 65
    .line 66
    or-long v26, v2, v4

    .line 67
    .line 68
    const/16 v28, 0x0

    .line 69
    .line 70
    const/16 v29, 0xf6

    .line 71
    .line 72
    iget-wide v2, v0, La/dls;->b:J

    .line 73
    .line 74
    const-wide/16 v22, 0x0

    .line 75
    .line 76
    const-wide/16 v24, 0x0

    .line 77
    .line 78
    move-object/from16 v19, v1

    .line 79
    .line 80
    move-wide/from16 v20, v2

    .line 81
    .line 82
    invoke-static/range {v19 .. v29}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 83
    .line 84
    .line 85
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    return-object v0

    .line 88
    :pswitch_0
    move-object/from16 v1, p1

    .line 89
    .line 90
    check-cast v1, La/pi9;

    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    mul-float/2addr v2, v7

    .line 100
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    int-to-long v3, v3

    .line 105
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    int-to-long v5, v2

    .line 110
    shl-long v2, v3, v18

    .line 111
    .line 112
    and-long v4, v5, v16

    .line 113
    .line 114
    or-long v10, v2, v4

    .line 115
    .line 116
    new-instance v6, La/lf4;

    .line 117
    .line 118
    const/4 v7, 0x6

    .line 119
    iget-wide v8, v0, La/dls;->b:J

    .line 120
    .line 121
    invoke-direct/range {v6 .. v11}, La/lf4;-><init>(BJJ)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1, v6}, La/pi9;->a(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    return-object v0

    .line 129
    :pswitch_1
    move-object/from16 v1, p1

    .line 130
    .line 131
    check-cast v1, La/fhl;

    .line 132
    .line 133
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    sget-object v2, La/qmk;->a:La/zcl;

    .line 137
    .line 138
    invoke-interface {v1, v12}, La/w6k;->w0(F)F

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    int-to-long v3, v3

    .line 147
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    int-to-long v5, v2

    .line 152
    shl-long v2, v3, v18

    .line 153
    .line 154
    and-long v4, v5, v16

    .line 155
    .line 156
    or-long v8, v2, v4

    .line 157
    .line 158
    const/4 v10, 0x0

    .line 159
    const/16 v11, 0xf6

    .line 160
    .line 161
    iget-wide v2, v0, La/dls;->b:J

    .line 162
    .line 163
    const-wide/16 v4, 0x0

    .line 164
    .line 165
    const-wide/16 v6, 0x0

    .line 166
    .line 167
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 168
    .line 169
    .line 170
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 171
    .line 172
    return-object v0

    .line 173
    :pswitch_2
    move-object/from16 v1, p1

    .line 174
    .line 175
    check-cast v1, La/fhl;

    .line 176
    .line 177
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    const/4 v11, 0x0

    .line 181
    const/16 v12, 0x7e

    .line 182
    .line 183
    iget-wide v2, v0, La/dls;->b:J

    .line 184
    .line 185
    const-wide/16 v4, 0x0

    .line 186
    .line 187
    const-wide/16 v6, 0x0

    .line 188
    .line 189
    const/4 v8, 0x0

    .line 190
    const/4 v9, 0x0

    .line 191
    const/4 v10, 0x0

    .line 192
    invoke-static/range {v1 .. v12}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 193
    .line 194
    .line 195
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 196
    .line 197
    return-object v0

    .line 198
    :pswitch_3
    move-object/from16 v1, p1

    .line 199
    .line 200
    check-cast v1, La/fhl;

    .line 201
    .line 202
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    sget-object v2, La/qmk;->a:La/zcl;

    .line 206
    .line 207
    invoke-interface {v1, v9}, La/w6k;->w0(F)F

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    int-to-long v3, v3

    .line 216
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    int-to-long v5, v2

    .line 221
    shl-long v2, v3, v18

    .line 222
    .line 223
    and-long v4, v5, v16

    .line 224
    .line 225
    or-long v8, v2, v4

    .line 226
    .line 227
    const/4 v10, 0x0

    .line 228
    const/16 v11, 0xf6

    .line 229
    .line 230
    iget-wide v2, v0, La/dls;->b:J

    .line 231
    .line 232
    const-wide/16 v4, 0x0

    .line 233
    .line 234
    const-wide/16 v6, 0x0

    .line 235
    .line 236
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 237
    .line 238
    .line 239
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 240
    .line 241
    return-object v0

    .line 242
    :pswitch_4
    move-object/from16 v1, p1

    .line 243
    .line 244
    check-cast v1, La/fhl;

    .line 245
    .line 246
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    sget-object v2, La/qmk;->a:La/zcl;

    .line 250
    .line 251
    invoke-interface {v1, v6}, La/w6k;->w0(F)F

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 256
    .line 257
    .line 258
    move-result v3

    .line 259
    int-to-long v3, v3

    .line 260
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 261
    .line 262
    .line 263
    move-result v2

    .line 264
    int-to-long v5, v2

    .line 265
    shl-long v2, v3, v18

    .line 266
    .line 267
    and-long v4, v5, v16

    .line 268
    .line 269
    or-long v8, v2, v4

    .line 270
    .line 271
    const/4 v10, 0x0

    .line 272
    const/16 v11, 0xf6

    .line 273
    .line 274
    iget-wide v2, v0, La/dls;->b:J

    .line 275
    .line 276
    const-wide/16 v4, 0x0

    .line 277
    .line 278
    const-wide/16 v6, 0x0

    .line 279
    .line 280
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 281
    .line 282
    .line 283
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 284
    .line 285
    return-object v0

    .line 286
    :pswitch_5
    move-object/from16 v1, p1

    .line 287
    .line 288
    check-cast v1, La/fhl;

    .line 289
    .line 290
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    sget-object v2, La/qmk;->a:La/zcl;

    .line 294
    .line 295
    invoke-interface {v1, v7}, La/w6k;->w0(F)F

    .line 296
    .line 297
    .line 298
    move-result v2

    .line 299
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 300
    .line 301
    .line 302
    move-result v3

    .line 303
    int-to-long v3, v3

    .line 304
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 305
    .line 306
    .line 307
    move-result v2

    .line 308
    int-to-long v5, v2

    .line 309
    shl-long v2, v3, v18

    .line 310
    .line 311
    and-long v4, v5, v16

    .line 312
    .line 313
    or-long v8, v2, v4

    .line 314
    .line 315
    const/4 v10, 0x0

    .line 316
    const/16 v11, 0xf6

    .line 317
    .line 318
    iget-wide v2, v0, La/dls;->b:J

    .line 319
    .line 320
    const-wide/16 v4, 0x0

    .line 321
    .line 322
    const-wide/16 v6, 0x0

    .line 323
    .line 324
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 325
    .line 326
    .line 327
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 328
    .line 329
    return-object v0

    .line 330
    :pswitch_6
    move-object/from16 v1, p1

    .line 331
    .line 332
    check-cast v1, La/fhl;

    .line 333
    .line 334
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    sget-object v2, La/qmk;->a:La/zcl;

    .line 338
    .line 339
    invoke-interface {v1, v11}, La/w6k;->w0(F)F

    .line 340
    .line 341
    .line 342
    move-result v2

    .line 343
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 344
    .line 345
    .line 346
    move-result v3

    .line 347
    int-to-long v3, v3

    .line 348
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 349
    .line 350
    .line 351
    move-result v2

    .line 352
    int-to-long v5, v2

    .line 353
    shl-long v2, v3, v18

    .line 354
    .line 355
    and-long v4, v5, v16

    .line 356
    .line 357
    or-long v8, v2, v4

    .line 358
    .line 359
    const/4 v10, 0x0

    .line 360
    const/16 v11, 0xf6

    .line 361
    .line 362
    iget-wide v2, v0, La/dls;->b:J

    .line 363
    .line 364
    const-wide/16 v4, 0x0

    .line 365
    .line 366
    const-wide/16 v6, 0x0

    .line 367
    .line 368
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 369
    .line 370
    .line 371
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 372
    .line 373
    return-object v0

    .line 374
    :pswitch_7
    move-object/from16 v1, p1

    .line 375
    .line 376
    check-cast v1, La/fhl;

    .line 377
    .line 378
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 379
    .line 380
    .line 381
    sget-object v2, La/qmk;->a:La/zcl;

    .line 382
    .line 383
    invoke-interface {v1, v11}, La/w6k;->w0(F)F

    .line 384
    .line 385
    .line 386
    move-result v2

    .line 387
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 388
    .line 389
    .line 390
    move-result v3

    .line 391
    int-to-long v3, v3

    .line 392
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 393
    .line 394
    .line 395
    move-result v2

    .line 396
    int-to-long v5, v2

    .line 397
    shl-long v2, v3, v18

    .line 398
    .line 399
    and-long v4, v5, v16

    .line 400
    .line 401
    or-long v8, v2, v4

    .line 402
    .line 403
    const/4 v10, 0x0

    .line 404
    const/16 v11, 0xf6

    .line 405
    .line 406
    iget-wide v2, v0, La/dls;->b:J

    .line 407
    .line 408
    const-wide/16 v4, 0x0

    .line 409
    .line 410
    const-wide/16 v6, 0x0

    .line 411
    .line 412
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 413
    .line 414
    .line 415
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 416
    .line 417
    return-object v0

    .line 418
    :pswitch_8
    move-object/from16 v1, p1

    .line 419
    .line 420
    check-cast v1, La/fhl;

    .line 421
    .line 422
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 423
    .line 424
    .line 425
    sget-object v2, La/qmk;->a:La/zcl;

    .line 426
    .line 427
    invoke-interface {v1, v11}, La/w6k;->w0(F)F

    .line 428
    .line 429
    .line 430
    move-result v2

    .line 431
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 432
    .line 433
    .line 434
    move-result v3

    .line 435
    int-to-long v3, v3

    .line 436
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 437
    .line 438
    .line 439
    move-result v2

    .line 440
    int-to-long v5, v2

    .line 441
    shl-long v2, v3, v18

    .line 442
    .line 443
    and-long v4, v5, v16

    .line 444
    .line 445
    or-long v8, v2, v4

    .line 446
    .line 447
    const/4 v10, 0x0

    .line 448
    const/16 v11, 0xf6

    .line 449
    .line 450
    iget-wide v2, v0, La/dls;->b:J

    .line 451
    .line 452
    const-wide/16 v4, 0x0

    .line 453
    .line 454
    const-wide/16 v6, 0x0

    .line 455
    .line 456
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 457
    .line 458
    .line 459
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 460
    .line 461
    return-object v0

    .line 462
    :pswitch_9
    move-object/from16 v1, p1

    .line 463
    .line 464
    check-cast v1, La/fhl;

    .line 465
    .line 466
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 467
    .line 468
    .line 469
    sget-object v2, La/qmk;->a:La/zcl;

    .line 470
    .line 471
    invoke-interface {v1, v5}, La/w6k;->w0(F)F

    .line 472
    .line 473
    .line 474
    move-result v2

    .line 475
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 476
    .line 477
    .line 478
    move-result v3

    .line 479
    int-to-long v3, v3

    .line 480
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 481
    .line 482
    .line 483
    move-result v2

    .line 484
    int-to-long v5, v2

    .line 485
    shl-long v2, v3, v18

    .line 486
    .line 487
    and-long v4, v5, v16

    .line 488
    .line 489
    or-long v8, v2, v4

    .line 490
    .line 491
    const/4 v10, 0x0

    .line 492
    const/16 v11, 0xf6

    .line 493
    .line 494
    iget-wide v2, v0, La/dls;->b:J

    .line 495
    .line 496
    const-wide/16 v4, 0x0

    .line 497
    .line 498
    const-wide/16 v6, 0x0

    .line 499
    .line 500
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 501
    .line 502
    .line 503
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 504
    .line 505
    return-object v0

    .line 506
    :pswitch_a
    move-object/from16 v1, p1

    .line 507
    .line 508
    check-cast v1, La/fhl;

    .line 509
    .line 510
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 511
    .line 512
    .line 513
    sget-object v2, La/qmk;->a:La/zcl;

    .line 514
    .line 515
    invoke-interface {v1, v10}, La/w6k;->w0(F)F

    .line 516
    .line 517
    .line 518
    move-result v2

    .line 519
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 520
    .line 521
    .line 522
    move-result v3

    .line 523
    int-to-long v3, v3

    .line 524
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 525
    .line 526
    .line 527
    move-result v2

    .line 528
    int-to-long v5, v2

    .line 529
    shl-long v2, v3, v18

    .line 530
    .line 531
    and-long v4, v5, v16

    .line 532
    .line 533
    or-long v8, v2, v4

    .line 534
    .line 535
    const/4 v10, 0x0

    .line 536
    const/16 v11, 0xf6

    .line 537
    .line 538
    iget-wide v2, v0, La/dls;->b:J

    .line 539
    .line 540
    const-wide/16 v4, 0x0

    .line 541
    .line 542
    const-wide/16 v6, 0x0

    .line 543
    .line 544
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 545
    .line 546
    .line 547
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 548
    .line 549
    return-object v0

    .line 550
    :pswitch_b
    move-object/from16 v1, p1

    .line 551
    .line 552
    check-cast v1, La/fhl;

    .line 553
    .line 554
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 555
    .line 556
    .line 557
    sget-object v2, La/qmk;->a:La/zcl;

    .line 558
    .line 559
    invoke-interface {v1, v10}, La/w6k;->w0(F)F

    .line 560
    .line 561
    .line 562
    move-result v2

    .line 563
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 564
    .line 565
    .line 566
    move-result v3

    .line 567
    int-to-long v3, v3

    .line 568
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 569
    .line 570
    .line 571
    move-result v2

    .line 572
    int-to-long v5, v2

    .line 573
    shl-long v2, v3, v18

    .line 574
    .line 575
    and-long v4, v5, v16

    .line 576
    .line 577
    or-long v8, v2, v4

    .line 578
    .line 579
    const/4 v10, 0x0

    .line 580
    const/16 v11, 0xf6

    .line 581
    .line 582
    iget-wide v2, v0, La/dls;->b:J

    .line 583
    .line 584
    const-wide/16 v4, 0x0

    .line 585
    .line 586
    const-wide/16 v6, 0x0

    .line 587
    .line 588
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 589
    .line 590
    .line 591
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 592
    .line 593
    return-object v0

    .line 594
    :pswitch_c
    move-object/from16 v1, p1

    .line 595
    .line 596
    check-cast v1, La/fhl;

    .line 597
    .line 598
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 599
    .line 600
    .line 601
    sget-object v2, La/qmk;->a:La/zcl;

    .line 602
    .line 603
    invoke-interface {v1, v10}, La/w6k;->w0(F)F

    .line 604
    .line 605
    .line 606
    move-result v2

    .line 607
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 608
    .line 609
    .line 610
    move-result v3

    .line 611
    int-to-long v3, v3

    .line 612
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 613
    .line 614
    .line 615
    move-result v2

    .line 616
    int-to-long v5, v2

    .line 617
    shl-long v2, v3, v18

    .line 618
    .line 619
    and-long v4, v5, v16

    .line 620
    .line 621
    or-long v8, v2, v4

    .line 622
    .line 623
    const/4 v10, 0x0

    .line 624
    const/16 v11, 0xf6

    .line 625
    .line 626
    iget-wide v2, v0, La/dls;->b:J

    .line 627
    .line 628
    const-wide/16 v4, 0x0

    .line 629
    .line 630
    const-wide/16 v6, 0x0

    .line 631
    .line 632
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 633
    .line 634
    .line 635
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 636
    .line 637
    return-object v0

    .line 638
    :pswitch_d
    move-object/from16 v1, p1

    .line 639
    .line 640
    check-cast v1, La/fhl;

    .line 641
    .line 642
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 643
    .line 644
    .line 645
    const/4 v10, 0x0

    .line 646
    const/16 v11, 0xfe

    .line 647
    .line 648
    iget-wide v2, v0, La/dls;->b:J

    .line 649
    .line 650
    const-wide/16 v4, 0x0

    .line 651
    .line 652
    const-wide/16 v6, 0x0

    .line 653
    .line 654
    const-wide/16 v8, 0x0

    .line 655
    .line 656
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 657
    .line 658
    .line 659
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 660
    .line 661
    return-object v0

    .line 662
    :pswitch_e
    move-object/from16 v0, p1

    .line 663
    .line 664
    check-cast v0, La/fhl;

    .line 665
    .line 666
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 667
    .line 668
    .line 669
    sget-object v1, La/qmk;->a:La/zcl;

    .line 670
    .line 671
    const/4 v1, 0x3

    .line 672
    invoke-static {v15, v15, v12, v12, v1}, La/vgg0;->c(FFFFI)La/ugg0;

    .line 673
    .line 674
    .line 675
    move-result-object v1

    .line 676
    invoke-interface {v0}, La/fhl;->d()J

    .line 677
    .line 678
    .line 679
    move-result-wide v2

    .line 680
    invoke-interface {v0}, La/fhl;->getLayoutDirection()La/k6z;

    .line 681
    .line 682
    .line 683
    move-result-object v4

    .line 684
    invoke-virtual {v1, v2, v3, v4, v0}, La/cne;->a(JLa/k6z;La/w6k;)La/x1x;

    .line 685
    .line 686
    .line 687
    move-result-object v1

    .line 688
    invoke-static {v0, v1, v13, v14}, La/z1x;->E(La/fhl;La/x1x;J)V

    .line 689
    .line 690
    .line 691
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 692
    .line 693
    return-object v0

    .line 694
    :pswitch_f
    move-object/from16 v0, p1

    .line 695
    .line 696
    check-cast v0, La/fhl;

    .line 697
    .line 698
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 699
    .line 700
    .line 701
    sget-object v1, La/qmk;->a:La/zcl;

    .line 702
    .line 703
    invoke-static {v12, v12, v15, v15, v4}, La/vgg0;->c(FFFFI)La/ugg0;

    .line 704
    .line 705
    .line 706
    move-result-object v1

    .line 707
    invoke-interface {v0}, La/fhl;->d()J

    .line 708
    .line 709
    .line 710
    move-result-wide v2

    .line 711
    invoke-interface {v0}, La/fhl;->getLayoutDirection()La/k6z;

    .line 712
    .line 713
    .line 714
    move-result-object v4

    .line 715
    invoke-virtual {v1, v2, v3, v4, v0}, La/cne;->a(JLa/k6z;La/w6k;)La/x1x;

    .line 716
    .line 717
    .line 718
    move-result-object v1

    .line 719
    invoke-static {v0, v1, v13, v14}, La/z1x;->E(La/fhl;La/x1x;J)V

    .line 720
    .line 721
    .line 722
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 723
    .line 724
    return-object v0

    .line 725
    :pswitch_10
    move-object/from16 v1, p1

    .line 726
    .line 727
    check-cast v1, La/fhl;

    .line 728
    .line 729
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 730
    .line 731
    .line 732
    sget-object v2, La/qmk;->a:La/zcl;

    .line 733
    .line 734
    invoke-interface {v1, v11}, La/w6k;->w0(F)F

    .line 735
    .line 736
    .line 737
    move-result v2

    .line 738
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 739
    .line 740
    .line 741
    move-result v3

    .line 742
    int-to-long v3, v3

    .line 743
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 744
    .line 745
    .line 746
    move-result v2

    .line 747
    int-to-long v5, v2

    .line 748
    shl-long v2, v3, v18

    .line 749
    .line 750
    and-long v4, v5, v16

    .line 751
    .line 752
    or-long v8, v2, v4

    .line 753
    .line 754
    const/4 v10, 0x0

    .line 755
    const/16 v11, 0xf6

    .line 756
    .line 757
    iget-wide v2, v0, La/dls;->b:J

    .line 758
    .line 759
    const-wide/16 v4, 0x0

    .line 760
    .line 761
    const-wide/16 v6, 0x0

    .line 762
    .line 763
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 764
    .line 765
    .line 766
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 767
    .line 768
    return-object v0

    .line 769
    :pswitch_11
    move-object/from16 v1, p1

    .line 770
    .line 771
    check-cast v1, La/fhl;

    .line 772
    .line 773
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 774
    .line 775
    .line 776
    sget-object v2, La/qmk;->a:La/zcl;

    .line 777
    .line 778
    invoke-interface {v1, v10}, La/w6k;->w0(F)F

    .line 779
    .line 780
    .line 781
    move-result v2

    .line 782
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 783
    .line 784
    .line 785
    move-result v3

    .line 786
    int-to-long v3, v3

    .line 787
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 788
    .line 789
    .line 790
    move-result v2

    .line 791
    int-to-long v5, v2

    .line 792
    shl-long v2, v3, v18

    .line 793
    .line 794
    and-long v4, v5, v16

    .line 795
    .line 796
    or-long v8, v2, v4

    .line 797
    .line 798
    const/4 v10, 0x0

    .line 799
    const/16 v11, 0xf6

    .line 800
    .line 801
    iget-wide v2, v0, La/dls;->b:J

    .line 802
    .line 803
    const-wide/16 v4, 0x0

    .line 804
    .line 805
    const-wide/16 v6, 0x0

    .line 806
    .line 807
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 808
    .line 809
    .line 810
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 811
    .line 812
    return-object v0

    .line 813
    :pswitch_12
    move-object/from16 v1, p1

    .line 814
    .line 815
    check-cast v1, La/fhl;

    .line 816
    .line 817
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 818
    .line 819
    .line 820
    sget-object v2, La/qmk;->a:La/zcl;

    .line 821
    .line 822
    invoke-interface {v1, v5}, La/w6k;->w0(F)F

    .line 823
    .line 824
    .line 825
    move-result v2

    .line 826
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 827
    .line 828
    .line 829
    move-result v3

    .line 830
    int-to-long v3, v3

    .line 831
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 832
    .line 833
    .line 834
    move-result v2

    .line 835
    int-to-long v5, v2

    .line 836
    shl-long v2, v3, v18

    .line 837
    .line 838
    and-long v4, v5, v16

    .line 839
    .line 840
    or-long v8, v2, v4

    .line 841
    .line 842
    const/4 v10, 0x0

    .line 843
    const/16 v11, 0xf6

    .line 844
    .line 845
    iget-wide v2, v0, La/dls;->b:J

    .line 846
    .line 847
    const-wide/16 v4, 0x0

    .line 848
    .line 849
    const-wide/16 v6, 0x0

    .line 850
    .line 851
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 852
    .line 853
    .line 854
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 855
    .line 856
    return-object v0

    .line 857
    :pswitch_13
    move-object/from16 v1, p1

    .line 858
    .line 859
    check-cast v1, La/fhl;

    .line 860
    .line 861
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 862
    .line 863
    .line 864
    sget-object v2, La/qmk;->a:La/zcl;

    .line 865
    .line 866
    invoke-interface {v1, v9}, La/w6k;->w0(F)F

    .line 867
    .line 868
    .line 869
    move-result v2

    .line 870
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 871
    .line 872
    .line 873
    move-result v3

    .line 874
    int-to-long v3, v3

    .line 875
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 876
    .line 877
    .line 878
    move-result v2

    .line 879
    int-to-long v5, v2

    .line 880
    shl-long v2, v3, v18

    .line 881
    .line 882
    and-long v4, v5, v16

    .line 883
    .line 884
    or-long v8, v2, v4

    .line 885
    .line 886
    const/4 v10, 0x0

    .line 887
    const/16 v11, 0xf6

    .line 888
    .line 889
    iget-wide v2, v0, La/dls;->b:J

    .line 890
    .line 891
    const-wide/16 v4, 0x0

    .line 892
    .line 893
    const-wide/16 v6, 0x0

    .line 894
    .line 895
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 896
    .line 897
    .line 898
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 899
    .line 900
    return-object v0

    .line 901
    :pswitch_14
    move-object/from16 v0, p1

    .line 902
    .line 903
    check-cast v0, La/fhl;

    .line 904
    .line 905
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 906
    .line 907
    .line 908
    sget-object v1, La/qmk;->a:La/zcl;

    .line 909
    .line 910
    invoke-static {v12, v12, v15, v15, v4}, La/vgg0;->c(FFFFI)La/ugg0;

    .line 911
    .line 912
    .line 913
    move-result-object v1

    .line 914
    invoke-interface {v0}, La/fhl;->d()J

    .line 915
    .line 916
    .line 917
    move-result-wide v2

    .line 918
    invoke-interface {v0}, La/fhl;->getLayoutDirection()La/k6z;

    .line 919
    .line 920
    .line 921
    move-result-object v4

    .line 922
    invoke-virtual {v1, v2, v3, v4, v0}, La/cne;->a(JLa/k6z;La/w6k;)La/x1x;

    .line 923
    .line 924
    .line 925
    move-result-object v1

    .line 926
    invoke-static {v0, v1, v13, v14}, La/z1x;->E(La/fhl;La/x1x;J)V

    .line 927
    .line 928
    .line 929
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 930
    .line 931
    return-object v0

    .line 932
    :pswitch_15
    move-object/from16 v1, p1

    .line 933
    .line 934
    check-cast v1, La/fhl;

    .line 935
    .line 936
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 937
    .line 938
    .line 939
    invoke-interface {v1}, La/fhl;->d()J

    .line 940
    .line 941
    .line 942
    move-result-wide v4

    .line 943
    shr-long v4, v4, v18

    .line 944
    .line 945
    long-to-int v4, v4

    .line 946
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 947
    .line 948
    .line 949
    move-result v4

    .line 950
    invoke-interface {v1}, La/fhl;->d()J

    .line 951
    .line 952
    .line 953
    move-result-wide v5

    .line 954
    and-long v5, v5, v16

    .line 955
    .line 956
    long-to-int v5, v5

    .line 957
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 958
    .line 959
    .line 960
    move-result v5

    .line 961
    invoke-static {}, La/z03;->a()La/w03;

    .line 962
    .line 963
    .line 964
    move-result-object v6

    .line 965
    invoke-virtual {v6, v4, v5}, La/w03;->f(FF)V

    .line 966
    .line 967
    .line 968
    mul-float/2addr v4, v3

    .line 969
    iget-object v3, v6, La/w03;->b:Landroid/graphics/RectF;

    .line 970
    .line 971
    if-nez v3, :cond_0

    .line 972
    .line 973
    new-instance v3, Landroid/graphics/RectF;

    .line 974
    .line 975
    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    .line 976
    .line 977
    .line 978
    iput-object v3, v6, La/w03;->b:Landroid/graphics/RectF;

    .line 979
    .line 980
    :cond_0
    invoke-virtual {v3, v15, v15, v4, v5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 981
    .line 982
    .line 983
    iget-object v3, v6, La/w03;->a:Landroid/graphics/Path;

    .line 984
    .line 985
    iget-object v4, v6, La/w03;->b:Landroid/graphics/RectF;

    .line 986
    .line 987
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 988
    .line 989
    .line 990
    const/high16 v5, 0x42b40000    # 90.0f

    .line 991
    .line 992
    invoke-virtual {v3, v4, v5, v2, v8}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    .line 993
    .line 994
    .line 995
    invoke-virtual {v6}, La/w03;->c()V

    .line 996
    .line 997
    .line 998
    move-object v2, v6

    .line 999
    sget-object v6, La/l0q;->a:La/l0q;

    .line 1000
    .line 1001
    const/16 v7, 0x34

    .line 1002
    .line 1003
    iget-wide v3, v0, La/dls;->b:J

    .line 1004
    .line 1005
    const/4 v5, 0x0

    .line 1006
    invoke-static/range {v1 .. v7}, La/fhl;->C0(La/fhl;La/w03;JFLa/agc;I)V

    .line 1007
    .line 1008
    .line 1009
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1010
    .line 1011
    return-object v0

    .line 1012
    :pswitch_16
    move-object/from16 v1, p1

    .line 1013
    .line 1014
    check-cast v1, La/fhl;

    .line 1015
    .line 1016
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1017
    .line 1018
    .line 1019
    sget-object v2, La/qmk;->a:La/zcl;

    .line 1020
    .line 1021
    invoke-interface {v1, v6}, La/w6k;->w0(F)F

    .line 1022
    .line 1023
    .line 1024
    move-result v2

    .line 1025
    invoke-interface {v1, v6}, La/w6k;->w0(F)F

    .line 1026
    .line 1027
    .line 1028
    move-result v4

    .line 1029
    invoke-interface {v1, v3}, La/w6k;->w0(F)F

    .line 1030
    .line 1031
    .line 1032
    move-result v9

    .line 1033
    const/high16 v5, 0x3f800000    # 1.0f

    .line 1034
    .line 1035
    invoke-interface {v1, v5}, La/w6k;->w0(F)F

    .line 1036
    .line 1037
    .line 1038
    move-result v20

    .line 1039
    invoke-interface {v1}, La/fhl;->d()J

    .line 1040
    .line 1041
    .line 1042
    move-result-wide v5

    .line 1043
    and-long v5, v5, v16

    .line 1044
    .line 1045
    long-to-int v5, v5

    .line 1046
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1047
    .line 1048
    .line 1049
    move-result v5

    .line 1050
    div-float v10, v5, v3

    .line 1051
    .line 1052
    const/4 v3, 0x2

    .line 1053
    new-array v3, v3, [F

    .line 1054
    .line 1055
    aput v2, v3, v8

    .line 1056
    .line 1057
    const/4 v2, 0x1

    .line 1058
    aput v4, v3, v2

    .line 1059
    .line 1060
    invoke-static {v15, v3}, La/qjj;->K(F[F)La/x03;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v24

    .line 1064
    invoke-static {}, La/z03;->a()La/w03;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v2

    .line 1068
    add-float v3, v9, v4

    .line 1069
    .line 1070
    invoke-virtual {v2, v3, v10}, La/w03;->f(FF)V

    .line 1071
    .line 1072
    .line 1073
    invoke-interface {v1}, La/fhl;->d()J

    .line 1074
    .line 1075
    .line 1076
    move-result-wide v5

    .line 1077
    shr-long v5, v5, v18

    .line 1078
    .line 1079
    long-to-int v3, v5

    .line 1080
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1081
    .line 1082
    .line 1083
    move-result v3

    .line 1084
    sub-float/2addr v3, v9

    .line 1085
    sub-float/2addr v3, v4

    .line 1086
    invoke-virtual {v2, v3, v10}, La/w03;->e(FF)V

    .line 1087
    .line 1088
    .line 1089
    new-instance v19, La/vtm0;

    .line 1090
    .line 1091
    const/16 v23, 0x0

    .line 1092
    .line 1093
    const/16 v25, 0xa

    .line 1094
    .line 1095
    const/16 v21, 0x0

    .line 1096
    .line 1097
    const/16 v22, 0x1

    .line 1098
    .line 1099
    invoke-direct/range {v19 .. v25}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 1100
    .line 1101
    .line 1102
    const/16 v7, 0x34

    .line 1103
    .line 1104
    iget-wide v3, v0, La/dls;->b:J

    .line 1105
    .line 1106
    const/4 v5, 0x0

    .line 1107
    move-object/from16 v6, v19

    .line 1108
    .line 1109
    invoke-static/range {v1 .. v7}, La/fhl;->C0(La/fhl;La/w03;JFLa/agc;I)V

    .line 1110
    .line 1111
    .line 1112
    invoke-static {}, La/z03;->a()La/w03;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v2

    .line 1116
    invoke-virtual {v2, v15, v10}, La/w03;->f(FF)V

    .line 1117
    .line 1118
    .line 1119
    invoke-virtual {v2, v9, v10}, La/w03;->e(FF)V

    .line 1120
    .line 1121
    .line 1122
    new-instance v19, La/vtm0;

    .line 1123
    .line 1124
    const/16 v24, 0x0

    .line 1125
    .line 1126
    const/16 v25, 0x1a

    .line 1127
    .line 1128
    invoke-direct/range {v19 .. v25}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 1129
    .line 1130
    .line 1131
    move-object/from16 v6, v19

    .line 1132
    .line 1133
    invoke-static/range {v1 .. v7}, La/fhl;->C0(La/fhl;La/w03;JFLa/agc;I)V

    .line 1134
    .line 1135
    .line 1136
    invoke-static {}, La/z03;->a()La/w03;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v2

    .line 1140
    invoke-interface {v1}, La/fhl;->d()J

    .line 1141
    .line 1142
    .line 1143
    move-result-wide v5

    .line 1144
    shr-long v5, v5, v18

    .line 1145
    .line 1146
    long-to-int v0, v5

    .line 1147
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1148
    .line 1149
    .line 1150
    move-result v0

    .line 1151
    sub-float/2addr v0, v9

    .line 1152
    invoke-virtual {v2, v0, v10}, La/w03;->f(FF)V

    .line 1153
    .line 1154
    .line 1155
    invoke-interface {v1}, La/fhl;->d()J

    .line 1156
    .line 1157
    .line 1158
    move-result-wide v5

    .line 1159
    shr-long v5, v5, v18

    .line 1160
    .line 1161
    long-to-int v0, v5

    .line 1162
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1163
    .line 1164
    .line 1165
    move-result v0

    .line 1166
    invoke-virtual {v2, v0, v10}, La/w03;->e(FF)V

    .line 1167
    .line 1168
    .line 1169
    new-instance v19, La/vtm0;

    .line 1170
    .line 1171
    invoke-direct/range {v19 .. v25}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 1172
    .line 1173
    .line 1174
    const/4 v5, 0x0

    .line 1175
    move-object/from16 v6, v19

    .line 1176
    .line 1177
    invoke-static/range {v1 .. v7}, La/fhl;->C0(La/fhl;La/w03;JFLa/agc;I)V

    .line 1178
    .line 1179
    .line 1180
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1181
    .line 1182
    return-object v0

    .line 1183
    :pswitch_17
    move-object/from16 v1, p1

    .line 1184
    .line 1185
    check-cast v1, La/fhl;

    .line 1186
    .line 1187
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1188
    .line 1189
    .line 1190
    invoke-interface {v1}, La/fhl;->d()J

    .line 1191
    .line 1192
    .line 1193
    move-result-wide v3

    .line 1194
    shr-long v3, v3, v18

    .line 1195
    .line 1196
    long-to-int v3, v3

    .line 1197
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1198
    .line 1199
    .line 1200
    move-result v3

    .line 1201
    invoke-interface {v1}, La/fhl;->d()J

    .line 1202
    .line 1203
    .line 1204
    move-result-wide v4

    .line 1205
    and-long v4, v4, v16

    .line 1206
    .line 1207
    long-to-int v4, v4

    .line 1208
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1209
    .line 1210
    .line 1211
    move-result v4

    .line 1212
    invoke-static {}, La/z03;->a()La/w03;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v5

    .line 1216
    invoke-virtual {v5, v15, v15}, La/w03;->f(FF)V

    .line 1217
    .line 1218
    .line 1219
    neg-float v6, v3

    .line 1220
    iget-object v7, v5, La/w03;->b:Landroid/graphics/RectF;

    .line 1221
    .line 1222
    if-nez v7, :cond_1

    .line 1223
    .line 1224
    new-instance v7, Landroid/graphics/RectF;

    .line 1225
    .line 1226
    invoke-direct {v7}, Landroid/graphics/RectF;-><init>()V

    .line 1227
    .line 1228
    .line 1229
    iput-object v7, v5, La/w03;->b:Landroid/graphics/RectF;

    .line 1230
    .line 1231
    :cond_1
    invoke-virtual {v7, v6, v15, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 1232
    .line 1233
    .line 1234
    iget-object v3, v5, La/w03;->a:Landroid/graphics/Path;

    .line 1235
    .line 1236
    iget-object v4, v5, La/w03;->b:Landroid/graphics/RectF;

    .line 1237
    .line 1238
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1239
    .line 1240
    .line 1241
    const/high16 v6, -0x3d4c0000    # -90.0f

    .line 1242
    .line 1243
    invoke-virtual {v3, v4, v6, v2, v8}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    .line 1244
    .line 1245
    .line 1246
    invoke-virtual {v5}, La/w03;->c()V

    .line 1247
    .line 1248
    .line 1249
    sget-object v6, La/l0q;->a:La/l0q;

    .line 1250
    .line 1251
    const/16 v7, 0x34

    .line 1252
    .line 1253
    iget-wide v3, v0, La/dls;->b:J

    .line 1254
    .line 1255
    move-object v2, v5

    .line 1256
    const/4 v5, 0x0

    .line 1257
    invoke-static/range {v1 .. v7}, La/fhl;->C0(La/fhl;La/w03;JFLa/agc;I)V

    .line 1258
    .line 1259
    .line 1260
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1261
    .line 1262
    return-object v0

    .line 1263
    :pswitch_18
    move-object/from16 v1, p1

    .line 1264
    .line 1265
    check-cast v1, La/fhl;

    .line 1266
    .line 1267
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1268
    .line 1269
    .line 1270
    const/4 v11, 0x0

    .line 1271
    const/16 v12, 0x7e

    .line 1272
    .line 1273
    iget-wide v2, v0, La/dls;->b:J

    .line 1274
    .line 1275
    const-wide/16 v4, 0x0

    .line 1276
    .line 1277
    const-wide/16 v6, 0x0

    .line 1278
    .line 1279
    const/4 v8, 0x0

    .line 1280
    const/4 v9, 0x0

    .line 1281
    const/4 v10, 0x0

    .line 1282
    invoke-static/range {v1 .. v12}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 1283
    .line 1284
    .line 1285
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1286
    .line 1287
    return-object v0

    .line 1288
    :pswitch_19
    move-object/from16 v0, p1

    .line 1289
    .line 1290
    check-cast v0, La/az40;

    .line 1291
    .line 1292
    sget-object v1, La/mtv;->b:La/zsb0;

    .line 1293
    .line 1294
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v2

    .line 1298
    invoke-virtual {v0, v1, v2}, La/az40;->c(La/zsb0;Ljava/lang/Object;)V

    .line 1299
    .line 1300
    .line 1301
    const/4 v0, 0x0

    .line 1302
    return-object v0

    .line 1303
    :pswitch_1a
    move-object/from16 v1, p1

    .line 1304
    .line 1305
    check-cast v1, La/fhl;

    .line 1306
    .line 1307
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1308
    .line 1309
    .line 1310
    const/4 v8, 0x0

    .line 1311
    const/16 v9, 0x7e

    .line 1312
    .line 1313
    iget-wide v2, v0, La/dls;->b:J

    .line 1314
    .line 1315
    const/4 v4, 0x0

    .line 1316
    const-wide/16 v5, 0x0

    .line 1317
    .line 1318
    const/4 v7, 0x0

    .line 1319
    invoke-static/range {v1 .. v9}, La/fhl;->E(La/fhl;JFJFLa/agc;I)V

    .line 1320
    .line 1321
    .line 1322
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1323
    .line 1324
    return-object v0

    .line 1325
    :pswitch_1b
    move-object/from16 v1, p1

    .line 1326
    .line 1327
    check-cast v1, La/fhl;

    .line 1328
    .line 1329
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1330
    .line 1331
    .line 1332
    const/4 v8, 0x0

    .line 1333
    const/16 v9, 0x7e

    .line 1334
    .line 1335
    iget-wide v2, v0, La/dls;->b:J

    .line 1336
    .line 1337
    const/4 v4, 0x0

    .line 1338
    const-wide/16 v5, 0x0

    .line 1339
    .line 1340
    const/4 v7, 0x0

    .line 1341
    invoke-static/range {v1 .. v9}, La/fhl;->E(La/fhl;JFJFLa/agc;I)V

    .line 1342
    .line 1343
    .line 1344
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1345
    .line 1346
    return-object v0

    .line 1347
    :pswitch_1c
    move-object/from16 v0, p1

    .line 1348
    .line 1349
    check-cast v0, La/abi0;

    .line 1350
    .line 1351
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1352
    .line 1353
    .line 1354
    invoke-static {v0, v13, v14}, La/cbi0;->f(La/abi0;J)V

    .line 1355
    .line 1356
    .line 1357
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1358
    .line 1359
    return-object v0

    .line 1360
    nop

    .line 1361
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
