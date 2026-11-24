.class public final synthetic La/nme;
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
    iput-byte p1, p0, La/nme;->a:B

    iput-wide p2, p0, La/nme;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/nme;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x41a00000    # 20.0f

    .line 6
    .line 7
    const/high16 v3, 0x3f800000    # 1.0f

    .line 8
    .line 9
    const/high16 v4, 0x41000000    # 8.0f

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    const/high16 v7, 0x40000000    # 2.0f

    .line 14
    .line 15
    iget-wide v8, v0, La/nme;->b:J

    .line 16
    .line 17
    const/high16 v10, 0x41200000    # 10.0f

    .line 18
    .line 19
    const/high16 v11, 0x41800000    # 16.0f

    .line 20
    .line 21
    const-wide v12, 0xffffffffL

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    const/16 v14, 0x20

    .line 27
    .line 28
    packed-switch v1, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    move-object/from16 v15, p1

    .line 32
    .line 33
    check-cast v15, La/fhl;

    .line 34
    .line 35
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    sget-object v1, La/qmk;->a:La/zcl;

    .line 39
    .line 40
    invoke-interface {v15, v11}, La/w6k;->w0(F)F

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    int-to-long v2, v2

    .line 49
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    int-to-long v4, v1

    .line 54
    shl-long v1, v2, v14

    .line 55
    .line 56
    and-long v3, v4, v12

    .line 57
    .line 58
    or-long v22, v1, v3

    .line 59
    .line 60
    const/16 v24, 0x0

    .line 61
    .line 62
    const/16 v25, 0xf6

    .line 63
    .line 64
    iget-wide v0, v0, La/nme;->b:J

    .line 65
    .line 66
    const-wide/16 v18, 0x0

    .line 67
    .line 68
    const-wide/16 v20, 0x0

    .line 69
    .line 70
    move-wide/from16 v16, v0

    .line 71
    .line 72
    invoke-static/range {v15 .. v25}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 73
    .line 74
    .line 75
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object v0

    .line 78
    :pswitch_0
    move-object/from16 v1, p1

    .line 79
    .line 80
    check-cast v1, La/fhl;

    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    sget-object v2, La/qmk;->a:La/zcl;

    .line 86
    .line 87
    invoke-interface {v1, v11}, La/w6k;->w0(F)F

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    int-to-long v3, v3

    .line 96
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    int-to-long v5, v2

    .line 101
    shl-long v2, v3, v14

    .line 102
    .line 103
    and-long v4, v5, v12

    .line 104
    .line 105
    or-long v8, v2, v4

    .line 106
    .line 107
    const/4 v10, 0x0

    .line 108
    const/16 v11, 0xf6

    .line 109
    .line 110
    iget-wide v2, v0, La/nme;->b:J

    .line 111
    .line 112
    const-wide/16 v4, 0x0

    .line 113
    .line 114
    const-wide/16 v6, 0x0

    .line 115
    .line 116
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 117
    .line 118
    .line 119
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    return-object v0

    .line 122
    :pswitch_1
    move-object/from16 v1, p1

    .line 123
    .line 124
    check-cast v1, La/fhl;

    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    sget-object v2, La/qmk;->a:La/zcl;

    .line 130
    .line 131
    invoke-interface {v1, v11}, La/w6k;->w0(F)F

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    int-to-long v3, v3

    .line 140
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    int-to-long v5, v2

    .line 145
    shl-long v2, v3, v14

    .line 146
    .line 147
    and-long v4, v5, v12

    .line 148
    .line 149
    or-long v8, v2, v4

    .line 150
    .line 151
    const/4 v10, 0x0

    .line 152
    const/16 v11, 0xf6

    .line 153
    .line 154
    iget-wide v2, v0, La/nme;->b:J

    .line 155
    .line 156
    const-wide/16 v4, 0x0

    .line 157
    .line 158
    const-wide/16 v6, 0x0

    .line 159
    .line 160
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 161
    .line 162
    .line 163
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 164
    .line 165
    return-object v0

    .line 166
    :pswitch_2
    move-object/from16 v1, p1

    .line 167
    .line 168
    check-cast v1, La/fhl;

    .line 169
    .line 170
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    sget-object v2, La/qmk;->a:La/zcl;

    .line 174
    .line 175
    invoke-interface {v1, v10}, La/w6k;->w0(F)F

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    int-to-long v3, v3

    .line 184
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    int-to-long v5, v2

    .line 189
    shl-long v2, v3, v14

    .line 190
    .line 191
    and-long v4, v5, v12

    .line 192
    .line 193
    or-long v8, v2, v4

    .line 194
    .line 195
    const/4 v10, 0x0

    .line 196
    const/16 v11, 0xf6

    .line 197
    .line 198
    iget-wide v2, v0, La/nme;->b:J

    .line 199
    .line 200
    const-wide/16 v4, 0x0

    .line 201
    .line 202
    const-wide/16 v6, 0x0

    .line 203
    .line 204
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 205
    .line 206
    .line 207
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 208
    .line 209
    return-object v0

    .line 210
    :pswitch_3
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    return-object v0

    .line 215
    :pswitch_4
    move-object/from16 v1, p1

    .line 216
    .line 217
    check-cast v1, La/fhl;

    .line 218
    .line 219
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    sget-object v2, La/qmk;->a:La/zcl;

    .line 223
    .line 224
    invoke-interface {v1, v11}, La/w6k;->w0(F)F

    .line 225
    .line 226
    .line 227
    move-result v2

    .line 228
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    int-to-long v3, v3

    .line 233
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    int-to-long v5, v2

    .line 238
    shl-long v2, v3, v14

    .line 239
    .line 240
    and-long v4, v5, v12

    .line 241
    .line 242
    or-long v8, v2, v4

    .line 243
    .line 244
    const/4 v10, 0x0

    .line 245
    const/16 v11, 0xf6

    .line 246
    .line 247
    iget-wide v2, v0, La/nme;->b:J

    .line 248
    .line 249
    const-wide/16 v4, 0x0

    .line 250
    .line 251
    const-wide/16 v6, 0x0

    .line 252
    .line 253
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 254
    .line 255
    .line 256
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 257
    .line 258
    return-object v0

    .line 259
    :pswitch_5
    move-object/from16 v1, p1

    .line 260
    .line 261
    check-cast v1, La/fhl;

    .line 262
    .line 263
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    invoke-interface {v1}, La/fhl;->d()J

    .line 267
    .line 268
    .line 269
    move-result-wide v6

    .line 270
    invoke-interface {v1, v4}, La/w6k;->w0(F)F

    .line 271
    .line 272
    .line 273
    move-result v2

    .line 274
    invoke-interface {v1, v4}, La/w6k;->w0(F)F

    .line 275
    .line 276
    .line 277
    move-result v4

    .line 278
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 279
    .line 280
    .line 281
    move-result v2

    .line 282
    int-to-long v8, v2

    .line 283
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 284
    .line 285
    .line 286
    move-result v2

    .line 287
    int-to-long v4, v2

    .line 288
    shl-long/2addr v8, v14

    .line 289
    and-long/2addr v4, v12

    .line 290
    or-long/2addr v8, v4

    .line 291
    new-instance v10, La/vtm0;

    .line 292
    .line 293
    sget-object v2, La/qmk;->a:La/zcl;

    .line 294
    .line 295
    invoke-interface {v1, v3}, La/w6k;->w0(F)F

    .line 296
    .line 297
    .line 298
    move-result v11

    .line 299
    const/4 v15, 0x0

    .line 300
    const/16 v16, 0x1e

    .line 301
    .line 302
    const/4 v12, 0x0

    .line 303
    const/4 v13, 0x0

    .line 304
    const/4 v14, 0x0

    .line 305
    invoke-direct/range {v10 .. v16}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 306
    .line 307
    .line 308
    const/16 v11, 0xe0

    .line 309
    .line 310
    iget-wide v2, v0, La/nme;->b:J

    .line 311
    .line 312
    const-wide/16 v4, 0x0

    .line 313
    .line 314
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 315
    .line 316
    .line 317
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 318
    .line 319
    return-object v0

    .line 320
    :pswitch_6
    move-object/from16 v0, p1

    .line 321
    .line 322
    check-cast v0, La/abi0;

    .line 323
    .line 324
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    invoke-static {v0, v8, v9}, La/cbi0;->a(La/abi0;J)V

    .line 328
    .line 329
    .line 330
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 331
    .line 332
    return-object v0

    .line 333
    :pswitch_7
    move-object/from16 v0, p1

    .line 334
    .line 335
    check-cast v0, La/abi0;

    .line 336
    .line 337
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    invoke-static {v0, v8, v9}, La/cbi0;->f(La/abi0;J)V

    .line 341
    .line 342
    .line 343
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 344
    .line 345
    return-object v0

    .line 346
    :pswitch_8
    move-object/from16 v1, p1

    .line 347
    .line 348
    check-cast v1, La/fhl;

    .line 349
    .line 350
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 351
    .line 352
    .line 353
    const/4 v8, 0x0

    .line 354
    const/16 v9, 0x7e

    .line 355
    .line 356
    iget-wide v2, v0, La/nme;->b:J

    .line 357
    .line 358
    const/4 v4, 0x0

    .line 359
    const-wide/16 v5, 0x0

    .line 360
    .line 361
    const/4 v7, 0x0

    .line 362
    invoke-static/range {v1 .. v9}, La/fhl;->E(La/fhl;JFJFLa/agc;I)V

    .line 363
    .line 364
    .line 365
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 366
    .line 367
    return-object v0

    .line 368
    :pswitch_9
    move-object/from16 v1, p1

    .line 369
    .line 370
    check-cast v1, La/fhl;

    .line 371
    .line 372
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    const/4 v8, 0x0

    .line 376
    const/16 v9, 0x7e

    .line 377
    .line 378
    iget-wide v2, v0, La/nme;->b:J

    .line 379
    .line 380
    const/4 v4, 0x0

    .line 381
    const-wide/16 v5, 0x0

    .line 382
    .line 383
    const/4 v7, 0x0

    .line 384
    invoke-static/range {v1 .. v9}, La/fhl;->E(La/fhl;JFJFLa/agc;I)V

    .line 385
    .line 386
    .line 387
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 388
    .line 389
    return-object v0

    .line 390
    :pswitch_a
    move-object/from16 v1, p1

    .line 391
    .line 392
    check-cast v1, La/fhl;

    .line 393
    .line 394
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    sget-object v2, La/qmk;->a:La/zcl;

    .line 398
    .line 399
    const/high16 v2, 0x43b40000    # 360.0f

    .line 400
    .line 401
    invoke-interface {v1, v2}, La/w6k;->w0(F)F

    .line 402
    .line 403
    .line 404
    move-result v2

    .line 405
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 406
    .line 407
    .line 408
    move-result v3

    .line 409
    int-to-long v3, v3

    .line 410
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 411
    .line 412
    .line 413
    move-result v2

    .line 414
    int-to-long v5, v2

    .line 415
    shl-long v2, v3, v14

    .line 416
    .line 417
    and-long v4, v5, v12

    .line 418
    .line 419
    or-long v8, v2, v4

    .line 420
    .line 421
    const/4 v10, 0x0

    .line 422
    const/16 v11, 0xf6

    .line 423
    .line 424
    iget-wide v2, v0, La/nme;->b:J

    .line 425
    .line 426
    const-wide/16 v4, 0x0

    .line 427
    .line 428
    const-wide/16 v6, 0x0

    .line 429
    .line 430
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 431
    .line 432
    .line 433
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 434
    .line 435
    return-object v0

    .line 436
    :pswitch_b
    move-object/from16 v1, p1

    .line 437
    .line 438
    check-cast v1, La/fhl;

    .line 439
    .line 440
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    sget-object v2, La/qmk;->a:La/zcl;

    .line 444
    .line 445
    invoke-interface {v1, v10}, La/w6k;->w0(F)F

    .line 446
    .line 447
    .line 448
    move-result v2

    .line 449
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 450
    .line 451
    .line 452
    move-result v3

    .line 453
    int-to-long v3, v3

    .line 454
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 455
    .line 456
    .line 457
    move-result v2

    .line 458
    int-to-long v5, v2

    .line 459
    shl-long v2, v3, v14

    .line 460
    .line 461
    and-long v4, v5, v12

    .line 462
    .line 463
    or-long v8, v2, v4

    .line 464
    .line 465
    const/4 v10, 0x0

    .line 466
    const/16 v11, 0xf6

    .line 467
    .line 468
    iget-wide v2, v0, La/nme;->b:J

    .line 469
    .line 470
    const-wide/16 v4, 0x0

    .line 471
    .line 472
    const-wide/16 v6, 0x0

    .line 473
    .line 474
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 475
    .line 476
    .line 477
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 478
    .line 479
    return-object v0

    .line 480
    :pswitch_c
    move-object/from16 v1, p1

    .line 481
    .line 482
    check-cast v1, La/fhl;

    .line 483
    .line 484
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 485
    .line 486
    .line 487
    sget-object v2, La/qmk;->a:La/zcl;

    .line 488
    .line 489
    invoke-interface {v1, v11}, La/w6k;->w0(F)F

    .line 490
    .line 491
    .line 492
    move-result v2

    .line 493
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 494
    .line 495
    .line 496
    move-result v3

    .line 497
    int-to-long v3, v3

    .line 498
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 499
    .line 500
    .line 501
    move-result v2

    .line 502
    int-to-long v5, v2

    .line 503
    shl-long v2, v3, v14

    .line 504
    .line 505
    and-long v4, v5, v12

    .line 506
    .line 507
    or-long v8, v2, v4

    .line 508
    .line 509
    const/4 v10, 0x0

    .line 510
    const/16 v11, 0xf6

    .line 511
    .line 512
    iget-wide v2, v0, La/nme;->b:J

    .line 513
    .line 514
    const-wide/16 v4, 0x0

    .line 515
    .line 516
    const-wide/16 v6, 0x0

    .line 517
    .line 518
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 519
    .line 520
    .line 521
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 522
    .line 523
    return-object v0

    .line 524
    :pswitch_d
    move-object/from16 v1, p1

    .line 525
    .line 526
    check-cast v1, La/fhl;

    .line 527
    .line 528
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 529
    .line 530
    .line 531
    move v3, v2

    .line 532
    invoke-static {}, La/z03;->a()La/w03;

    .line 533
    .line 534
    .line 535
    move-result-object v2

    .line 536
    invoke-interface {v1}, La/fhl;->d()J

    .line 537
    .line 538
    .line 539
    move-result-wide v8

    .line 540
    shr-long/2addr v8, v14

    .line 541
    long-to-int v5, v8

    .line 542
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 543
    .line 544
    .line 545
    move-result v5

    .line 546
    div-float/2addr v5, v7

    .line 547
    invoke-interface {v1}, La/fhl;->d()J

    .line 548
    .line 549
    .line 550
    move-result-wide v7

    .line 551
    and-long/2addr v7, v12

    .line 552
    long-to-int v7, v7

    .line 553
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 554
    .line 555
    .line 556
    move-result v7

    .line 557
    div-float/2addr v7, v3

    .line 558
    float-to-double v7, v7

    .line 559
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    .line 560
    .line 561
    .line 562
    move-result-wide v7

    .line 563
    double-to-float v7, v7

    .line 564
    float-to-int v7, v7

    .line 565
    :goto_0
    if-ge v6, v7, :cond_1

    .line 566
    .line 567
    int-to-float v8, v6

    .line 568
    mul-float/2addr v8, v3

    .line 569
    invoke-virtual {v2, v5, v8}, La/w03;->f(FF)V

    .line 570
    .line 571
    .line 572
    add-float/2addr v8, v4

    .line 573
    invoke-interface {v1}, La/fhl;->d()J

    .line 574
    .line 575
    .line 576
    move-result-wide v9

    .line 577
    and-long/2addr v9, v12

    .line 578
    long-to-int v9, v9

    .line 579
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 580
    .line 581
    .line 582
    move-result v9

    .line 583
    cmpl-float v10, v8, v9

    .line 584
    .line 585
    if-lez v10, :cond_0

    .line 586
    .line 587
    move v8, v9

    .line 588
    :cond_0
    invoke-virtual {v2, v5, v8}, La/w03;->e(FF)V

    .line 589
    .line 590
    .line 591
    add-int/lit8 v6, v6, 0x1

    .line 592
    .line 593
    goto :goto_0

    .line 594
    :cond_1
    new-instance v15, La/vtm0;

    .line 595
    .line 596
    invoke-interface {v1}, La/fhl;->d()J

    .line 597
    .line 598
    .line 599
    move-result-wide v3

    .line 600
    shr-long/2addr v3, v14

    .line 601
    long-to-int v3, v3

    .line 602
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 603
    .line 604
    .line 605
    move-result v16

    .line 606
    const/16 v20, 0x0

    .line 607
    .line 608
    const/16 v21, 0x1a

    .line 609
    .line 610
    const/16 v17, 0x0

    .line 611
    .line 612
    const/16 v18, 0x1

    .line 613
    .line 614
    const/16 v19, 0x0

    .line 615
    .line 616
    invoke-direct/range {v15 .. v21}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 617
    .line 618
    .line 619
    const/16 v7, 0x34

    .line 620
    .line 621
    iget-wide v3, v0, La/nme;->b:J

    .line 622
    .line 623
    const/4 v5, 0x0

    .line 624
    move-object v6, v15

    .line 625
    invoke-static/range {v1 .. v7}, La/fhl;->C0(La/fhl;La/w03;JFLa/agc;I)V

    .line 626
    .line 627
    .line 628
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 629
    .line 630
    return-object v0

    .line 631
    :pswitch_e
    move v3, v2

    .line 632
    move-object/from16 v1, p1

    .line 633
    .line 634
    check-cast v1, La/fhl;

    .line 635
    .line 636
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 637
    .line 638
    .line 639
    invoke-static {}, La/z03;->a()La/w03;

    .line 640
    .line 641
    .line 642
    move-result-object v2

    .line 643
    invoke-interface {v1}, La/fhl;->d()J

    .line 644
    .line 645
    .line 646
    move-result-wide v8

    .line 647
    shr-long/2addr v8, v14

    .line 648
    long-to-int v5, v8

    .line 649
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 650
    .line 651
    .line 652
    move-result v5

    .line 653
    div-float/2addr v5, v7

    .line 654
    invoke-interface {v1}, La/fhl;->d()J

    .line 655
    .line 656
    .line 657
    move-result-wide v7

    .line 658
    and-long/2addr v7, v12

    .line 659
    long-to-int v7, v7

    .line 660
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 661
    .line 662
    .line 663
    move-result v7

    .line 664
    div-float/2addr v7, v3

    .line 665
    float-to-double v7, v7

    .line 666
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    .line 667
    .line 668
    .line 669
    move-result-wide v7

    .line 670
    double-to-float v7, v7

    .line 671
    float-to-int v7, v7

    .line 672
    :goto_1
    if-ge v6, v7, :cond_3

    .line 673
    .line 674
    int-to-float v8, v6

    .line 675
    mul-float/2addr v8, v3

    .line 676
    invoke-virtual {v2, v5, v8}, La/w03;->f(FF)V

    .line 677
    .line 678
    .line 679
    add-float/2addr v8, v4

    .line 680
    invoke-interface {v1}, La/fhl;->d()J

    .line 681
    .line 682
    .line 683
    move-result-wide v9

    .line 684
    and-long/2addr v9, v12

    .line 685
    long-to-int v9, v9

    .line 686
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 687
    .line 688
    .line 689
    move-result v9

    .line 690
    cmpl-float v10, v8, v9

    .line 691
    .line 692
    if-lez v10, :cond_2

    .line 693
    .line 694
    move v8, v9

    .line 695
    :cond_2
    invoke-virtual {v2, v5, v8}, La/w03;->e(FF)V

    .line 696
    .line 697
    .line 698
    add-int/lit8 v6, v6, 0x1

    .line 699
    .line 700
    goto :goto_1

    .line 701
    :cond_3
    new-instance v15, La/vtm0;

    .line 702
    .line 703
    invoke-interface {v1}, La/fhl;->d()J

    .line 704
    .line 705
    .line 706
    move-result-wide v3

    .line 707
    shr-long/2addr v3, v14

    .line 708
    long-to-int v3, v3

    .line 709
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 710
    .line 711
    .line 712
    move-result v16

    .line 713
    const/16 v20, 0x0

    .line 714
    .line 715
    const/16 v21, 0x1a

    .line 716
    .line 717
    const/16 v17, 0x0

    .line 718
    .line 719
    const/16 v18, 0x1

    .line 720
    .line 721
    const/16 v19, 0x0

    .line 722
    .line 723
    invoke-direct/range {v15 .. v21}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 724
    .line 725
    .line 726
    const/16 v7, 0x34

    .line 727
    .line 728
    iget-wide v3, v0, La/nme;->b:J

    .line 729
    .line 730
    const/4 v5, 0x0

    .line 731
    move-object v6, v15

    .line 732
    invoke-static/range {v1 .. v7}, La/fhl;->C0(La/fhl;La/w03;JFLa/agc;I)V

    .line 733
    .line 734
    .line 735
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 736
    .line 737
    return-object v0

    .line 738
    :pswitch_f
    move-object/from16 v1, p1

    .line 739
    .line 740
    check-cast v1, La/fhl;

    .line 741
    .line 742
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 743
    .line 744
    .line 745
    invoke-static {}, La/z03;->a()La/w03;

    .line 746
    .line 747
    .line 748
    move-result-object v2

    .line 749
    invoke-interface {v1}, La/fhl;->d()J

    .line 750
    .line 751
    .line 752
    move-result-wide v3

    .line 753
    and-long/2addr v3, v12

    .line 754
    long-to-int v3, v3

    .line 755
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 756
    .line 757
    .line 758
    move-result v3

    .line 759
    div-float/2addr v3, v7

    .line 760
    invoke-interface {v1}, La/fhl;->d()J

    .line 761
    .line 762
    .line 763
    move-result-wide v4

    .line 764
    shr-long/2addr v4, v14

    .line 765
    long-to-int v4, v4

    .line 766
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 767
    .line 768
    .line 769
    move-result v4

    .line 770
    div-float/2addr v4, v10

    .line 771
    float-to-double v4, v4

    .line 772
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 773
    .line 774
    .line 775
    move-result-wide v4

    .line 776
    double-to-float v4, v4

    .line 777
    float-to-int v4, v4

    .line 778
    :goto_2
    if-ge v6, v4, :cond_5

    .line 779
    .line 780
    int-to-float v5, v6

    .line 781
    mul-float/2addr v5, v10

    .line 782
    invoke-virtual {v2, v5, v3}, La/w03;->f(FF)V

    .line 783
    .line 784
    .line 785
    const/high16 v7, 0x40a00000    # 5.0f

    .line 786
    .line 787
    add-float/2addr v5, v7

    .line 788
    invoke-interface {v1}, La/fhl;->d()J

    .line 789
    .line 790
    .line 791
    move-result-wide v7

    .line 792
    shr-long/2addr v7, v14

    .line 793
    long-to-int v7, v7

    .line 794
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 795
    .line 796
    .line 797
    move-result v7

    .line 798
    cmpl-float v8, v5, v7

    .line 799
    .line 800
    if-lez v8, :cond_4

    .line 801
    .line 802
    move v5, v7

    .line 803
    :cond_4
    invoke-virtual {v2, v5, v3}, La/w03;->e(FF)V

    .line 804
    .line 805
    .line 806
    add-int/lit8 v6, v6, 0x1

    .line 807
    .line 808
    goto :goto_2

    .line 809
    :cond_5
    new-instance v15, La/vtm0;

    .line 810
    .line 811
    invoke-interface {v1}, La/fhl;->d()J

    .line 812
    .line 813
    .line 814
    move-result-wide v3

    .line 815
    and-long/2addr v3, v12

    .line 816
    long-to-int v3, v3

    .line 817
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 818
    .line 819
    .line 820
    move-result v16

    .line 821
    const/16 v20, 0x0

    .line 822
    .line 823
    const/16 v21, 0x1a

    .line 824
    .line 825
    const/16 v17, 0x0

    .line 826
    .line 827
    const/16 v18, 0x0

    .line 828
    .line 829
    const/16 v19, 0x0

    .line 830
    .line 831
    invoke-direct/range {v15 .. v21}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 832
    .line 833
    .line 834
    const/16 v7, 0x34

    .line 835
    .line 836
    iget-wide v3, v0, La/nme;->b:J

    .line 837
    .line 838
    const/4 v5, 0x0

    .line 839
    move-object v6, v15

    .line 840
    invoke-static/range {v1 .. v7}, La/fhl;->C0(La/fhl;La/w03;JFLa/agc;I)V

    .line 841
    .line 842
    .line 843
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 844
    .line 845
    return-object v0

    .line 846
    :pswitch_10
    move-object/from16 v1, p1

    .line 847
    .line 848
    check-cast v1, La/fhl;

    .line 849
    .line 850
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 851
    .line 852
    .line 853
    sget-object v2, La/qmk;->a:La/zcl;

    .line 854
    .line 855
    const/high16 v2, 0x41400000    # 12.0f

    .line 856
    .line 857
    invoke-interface {v1, v2}, La/w6k;->w0(F)F

    .line 858
    .line 859
    .line 860
    move-result v2

    .line 861
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 862
    .line 863
    .line 864
    move-result v3

    .line 865
    int-to-long v3, v3

    .line 866
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 867
    .line 868
    .line 869
    move-result v2

    .line 870
    int-to-long v5, v2

    .line 871
    shl-long v2, v3, v14

    .line 872
    .line 873
    and-long v4, v5, v12

    .line 874
    .line 875
    or-long v8, v2, v4

    .line 876
    .line 877
    const/4 v10, 0x0

    .line 878
    const/16 v11, 0xf6

    .line 879
    .line 880
    iget-wide v2, v0, La/nme;->b:J

    .line 881
    .line 882
    const-wide/16 v4, 0x0

    .line 883
    .line 884
    const-wide/16 v6, 0x0

    .line 885
    .line 886
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 887
    .line 888
    .line 889
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 890
    .line 891
    return-object v0

    .line 892
    :pswitch_11
    move-object/from16 v0, p1

    .line 893
    .line 894
    check-cast v0, La/daq0;

    .line 895
    .line 896
    iget-wide v0, v0, La/daq0;->a:J

    .line 897
    .line 898
    invoke-static {v0, v1, v8, v9}, La/idm0;->n(JJ)V

    .line 899
    .line 900
    .line 901
    invoke-static {v0, v1}, La/daq0;->c(J)F

    .line 902
    .line 903
    .line 904
    move-result v0

    .line 905
    invoke-static {v8, v9}, La/daq0;->c(J)F

    .line 906
    .line 907
    .line 908
    move-result v1

    .line 909
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    .line 910
    .line 911
    .line 912
    move-result v0

    .line 913
    if-ltz v0, :cond_6

    .line 914
    .line 915
    goto :goto_3

    .line 916
    :cond_6
    move v5, v6

    .line 917
    :goto_3
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 918
    .line 919
    .line 920
    move-result-object v0

    .line 921
    return-object v0

    .line 922
    :pswitch_12
    move-object/from16 v1, p1

    .line 923
    .line 924
    check-cast v1, La/fhl;

    .line 925
    .line 926
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 927
    .line 928
    .line 929
    sget-object v2, La/qmk;->a:La/zcl;

    .line 930
    .line 931
    const/high16 v2, 0x40800000    # 4.0f

    .line 932
    .line 933
    invoke-interface {v1, v2}, La/w6k;->w0(F)F

    .line 934
    .line 935
    .line 936
    move-result v4

    .line 937
    invoke-interface {v1, v2}, La/w6k;->w0(F)F

    .line 938
    .line 939
    .line 940
    move-result v2

    .line 941
    invoke-interface {v1, v7}, La/w6k;->w0(F)F

    .line 942
    .line 943
    .line 944
    move-result v8

    .line 945
    invoke-interface {v1, v3}, La/w6k;->w0(F)F

    .line 946
    .line 947
    .line 948
    move-result v16

    .line 949
    invoke-interface {v1}, La/fhl;->d()J

    .line 950
    .line 951
    .line 952
    move-result-wide v9

    .line 953
    and-long/2addr v9, v12

    .line 954
    long-to-int v3, v9

    .line 955
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 956
    .line 957
    .line 958
    move-result v3

    .line 959
    div-float v9, v3, v7

    .line 960
    .line 961
    const/4 v3, 0x2

    .line 962
    new-array v3, v3, [F

    .line 963
    .line 964
    aput v4, v3, v6

    .line 965
    .line 966
    aput v2, v3, v5

    .line 967
    .line 968
    const/4 v10, 0x0

    .line 969
    invoke-static {v10, v3}, La/qjj;->K(F[F)La/x03;

    .line 970
    .line 971
    .line 972
    move-result-object v20

    .line 973
    move v3, v2

    .line 974
    invoke-static {}, La/z03;->a()La/w03;

    .line 975
    .line 976
    .line 977
    move-result-object v2

    .line 978
    add-float v4, v8, v3

    .line 979
    .line 980
    invoke-virtual {v2, v4, v9}, La/w03;->f(FF)V

    .line 981
    .line 982
    .line 983
    invoke-interface {v1}, La/fhl;->d()J

    .line 984
    .line 985
    .line 986
    move-result-wide v4

    .line 987
    shr-long/2addr v4, v14

    .line 988
    long-to-int v4, v4

    .line 989
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 990
    .line 991
    .line 992
    move-result v4

    .line 993
    sub-float/2addr v4, v8

    .line 994
    sub-float/2addr v4, v3

    .line 995
    invoke-virtual {v2, v4, v9}, La/w03;->e(FF)V

    .line 996
    .line 997
    .line 998
    new-instance v15, La/vtm0;

    .line 999
    .line 1000
    const/16 v19, 0x0

    .line 1001
    .line 1002
    const/16 v21, 0xa

    .line 1003
    .line 1004
    const/16 v17, 0x0

    .line 1005
    .line 1006
    const/16 v18, 0x1

    .line 1007
    .line 1008
    invoke-direct/range {v15 .. v21}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 1009
    .line 1010
    .line 1011
    const/16 v7, 0x34

    .line 1012
    .line 1013
    iget-wide v3, v0, La/nme;->b:J

    .line 1014
    .line 1015
    const/4 v5, 0x0

    .line 1016
    move-object v6, v15

    .line 1017
    invoke-static/range {v1 .. v7}, La/fhl;->C0(La/fhl;La/w03;JFLa/agc;I)V

    .line 1018
    .line 1019
    .line 1020
    invoke-static {}, La/z03;->a()La/w03;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v2

    .line 1024
    invoke-virtual {v2, v10, v9}, La/w03;->f(FF)V

    .line 1025
    .line 1026
    .line 1027
    invoke-virtual {v2, v8, v9}, La/w03;->e(FF)V

    .line 1028
    .line 1029
    .line 1030
    new-instance v15, La/vtm0;

    .line 1031
    .line 1032
    const/16 v20, 0x0

    .line 1033
    .line 1034
    const/16 v21, 0x1a

    .line 1035
    .line 1036
    invoke-direct/range {v15 .. v21}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 1037
    .line 1038
    .line 1039
    move-object v6, v15

    .line 1040
    invoke-static/range {v1 .. v7}, La/fhl;->C0(La/fhl;La/w03;JFLa/agc;I)V

    .line 1041
    .line 1042
    .line 1043
    invoke-static {}, La/z03;->a()La/w03;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v2

    .line 1047
    invoke-interface {v1}, La/fhl;->d()J

    .line 1048
    .line 1049
    .line 1050
    move-result-wide v5

    .line 1051
    shr-long/2addr v5, v14

    .line 1052
    long-to-int v0, v5

    .line 1053
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1054
    .line 1055
    .line 1056
    move-result v0

    .line 1057
    sub-float/2addr v0, v8

    .line 1058
    invoke-virtual {v2, v0, v9}, La/w03;->f(FF)V

    .line 1059
    .line 1060
    .line 1061
    invoke-interface {v1}, La/fhl;->d()J

    .line 1062
    .line 1063
    .line 1064
    move-result-wide v5

    .line 1065
    shr-long/2addr v5, v14

    .line 1066
    long-to-int v0, v5

    .line 1067
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1068
    .line 1069
    .line 1070
    move-result v0

    .line 1071
    invoke-virtual {v2, v0, v9}, La/w03;->e(FF)V

    .line 1072
    .line 1073
    .line 1074
    new-instance v15, La/vtm0;

    .line 1075
    .line 1076
    invoke-direct/range {v15 .. v21}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 1077
    .line 1078
    .line 1079
    const/4 v5, 0x0

    .line 1080
    move-object v6, v15

    .line 1081
    invoke-static/range {v1 .. v7}, La/fhl;->C0(La/fhl;La/w03;JFLa/agc;I)V

    .line 1082
    .line 1083
    .line 1084
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1085
    .line 1086
    return-object v0

    .line 1087
    :pswitch_13
    move-object/from16 v1, p1

    .line 1088
    .line 1089
    check-cast v1, La/fhl;

    .line 1090
    .line 1091
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1092
    .line 1093
    .line 1094
    sget-object v2, La/qmk;->a:La/zcl;

    .line 1095
    .line 1096
    invoke-interface {v1, v3}, La/w6k;->w0(F)F

    .line 1097
    .line 1098
    .line 1099
    move-result v9

    .line 1100
    invoke-interface {v1}, La/fhl;->d()J

    .line 1101
    .line 1102
    .line 1103
    move-result-wide v2

    .line 1104
    invoke-static {v2, v3}, La/h7k0;->d(J)F

    .line 1105
    .line 1106
    .line 1107
    move-result v2

    .line 1108
    sub-float/2addr v2, v9

    .line 1109
    div-float v4, v2, v7

    .line 1110
    .line 1111
    invoke-interface {v1}, La/fhl;->E0()J

    .line 1112
    .line 1113
    .line 1114
    move-result-wide v5

    .line 1115
    new-instance v8, La/vtm0;

    .line 1116
    .line 1117
    const/4 v13, 0x0

    .line 1118
    const/16 v14, 0x1e

    .line 1119
    .line 1120
    const/4 v10, 0x0

    .line 1121
    const/4 v11, 0x0

    .line 1122
    const/4 v12, 0x0

    .line 1123
    invoke-direct/range {v8 .. v14}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 1124
    .line 1125
    .line 1126
    const/16 v9, 0x68

    .line 1127
    .line 1128
    iget-wide v2, v0, La/nme;->b:J

    .line 1129
    .line 1130
    const/4 v7, 0x0

    .line 1131
    invoke-static/range {v1 .. v9}, La/fhl;->E(La/fhl;JFJFLa/agc;I)V

    .line 1132
    .line 1133
    .line 1134
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1135
    .line 1136
    return-object v0

    .line 1137
    :pswitch_14
    move-object/from16 v1, p1

    .line 1138
    .line 1139
    check-cast v1, La/fhl;

    .line 1140
    .line 1141
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1142
    .line 1143
    .line 1144
    sget-object v2, La/qmk;->a:La/zcl;

    .line 1145
    .line 1146
    invoke-interface {v1, v10}, La/w6k;->w0(F)F

    .line 1147
    .line 1148
    .line 1149
    move-result v2

    .line 1150
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1151
    .line 1152
    .line 1153
    move-result v3

    .line 1154
    int-to-long v3, v3

    .line 1155
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1156
    .line 1157
    .line 1158
    move-result v2

    .line 1159
    int-to-long v5, v2

    .line 1160
    shl-long v2, v3, v14

    .line 1161
    .line 1162
    and-long v4, v5, v12

    .line 1163
    .line 1164
    or-long v8, v2, v4

    .line 1165
    .line 1166
    const/4 v10, 0x0

    .line 1167
    const/16 v11, 0xf6

    .line 1168
    .line 1169
    iget-wide v2, v0, La/nme;->b:J

    .line 1170
    .line 1171
    const-wide/16 v4, 0x0

    .line 1172
    .line 1173
    const-wide/16 v6, 0x0

    .line 1174
    .line 1175
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 1176
    .line 1177
    .line 1178
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1179
    .line 1180
    return-object v0

    .line 1181
    :pswitch_15
    move-object/from16 v1, p1

    .line 1182
    .line 1183
    check-cast v1, La/fhl;

    .line 1184
    .line 1185
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1186
    .line 1187
    .line 1188
    sget-object v2, La/qmk;->a:La/zcl;

    .line 1189
    .line 1190
    invoke-interface {v1, v10}, La/w6k;->w0(F)F

    .line 1191
    .line 1192
    .line 1193
    move-result v2

    .line 1194
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1195
    .line 1196
    .line 1197
    move-result v3

    .line 1198
    int-to-long v3, v3

    .line 1199
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1200
    .line 1201
    .line 1202
    move-result v2

    .line 1203
    int-to-long v5, v2

    .line 1204
    shl-long v2, v3, v14

    .line 1205
    .line 1206
    and-long v4, v5, v12

    .line 1207
    .line 1208
    or-long v8, v2, v4

    .line 1209
    .line 1210
    const/4 v10, 0x0

    .line 1211
    const/16 v11, 0xf6

    .line 1212
    .line 1213
    iget-wide v2, v0, La/nme;->b:J

    .line 1214
    .line 1215
    const-wide/16 v4, 0x0

    .line 1216
    .line 1217
    const-wide/16 v6, 0x0

    .line 1218
    .line 1219
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 1220
    .line 1221
    .line 1222
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1223
    .line 1224
    return-object v0

    .line 1225
    :pswitch_16
    move-object/from16 v1, p1

    .line 1226
    .line 1227
    check-cast v1, La/fhl;

    .line 1228
    .line 1229
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1230
    .line 1231
    .line 1232
    sget-object v2, La/qmk;->a:La/zcl;

    .line 1233
    .line 1234
    invoke-interface {v1, v10}, La/w6k;->w0(F)F

    .line 1235
    .line 1236
    .line 1237
    move-result v2

    .line 1238
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1239
    .line 1240
    .line 1241
    move-result v3

    .line 1242
    int-to-long v3, v3

    .line 1243
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1244
    .line 1245
    .line 1246
    move-result v2

    .line 1247
    int-to-long v5, v2

    .line 1248
    shl-long v2, v3, v14

    .line 1249
    .line 1250
    and-long v4, v5, v12

    .line 1251
    .line 1252
    or-long v8, v2, v4

    .line 1253
    .line 1254
    const/4 v10, 0x0

    .line 1255
    const/16 v11, 0xf6

    .line 1256
    .line 1257
    iget-wide v2, v0, La/nme;->b:J

    .line 1258
    .line 1259
    const-wide/16 v4, 0x0

    .line 1260
    .line 1261
    const-wide/16 v6, 0x0

    .line 1262
    .line 1263
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 1264
    .line 1265
    .line 1266
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1267
    .line 1268
    return-object v0

    .line 1269
    :pswitch_17
    move-object/from16 v1, p1

    .line 1270
    .line 1271
    check-cast v1, La/fhl;

    .line 1272
    .line 1273
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1274
    .line 1275
    .line 1276
    sget-object v2, La/qmk;->a:La/zcl;

    .line 1277
    .line 1278
    invoke-interface {v1, v11}, La/w6k;->w0(F)F

    .line 1279
    .line 1280
    .line 1281
    move-result v2

    .line 1282
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1283
    .line 1284
    .line 1285
    move-result v3

    .line 1286
    int-to-long v3, v3

    .line 1287
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1288
    .line 1289
    .line 1290
    move-result v2

    .line 1291
    int-to-long v5, v2

    .line 1292
    shl-long v2, v3, v14

    .line 1293
    .line 1294
    and-long v4, v5, v12

    .line 1295
    .line 1296
    or-long v8, v2, v4

    .line 1297
    .line 1298
    const/4 v10, 0x0

    .line 1299
    const/16 v11, 0xf6

    .line 1300
    .line 1301
    iget-wide v2, v0, La/nme;->b:J

    .line 1302
    .line 1303
    const-wide/16 v4, 0x0

    .line 1304
    .line 1305
    const-wide/16 v6, 0x0

    .line 1306
    .line 1307
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 1308
    .line 1309
    .line 1310
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1311
    .line 1312
    return-object v0

    .line 1313
    :pswitch_18
    move-object/from16 v1, p1

    .line 1314
    .line 1315
    check-cast v1, La/fhl;

    .line 1316
    .line 1317
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1318
    .line 1319
    .line 1320
    sget-object v2, La/qmk;->a:La/zcl;

    .line 1321
    .line 1322
    invoke-interface {v1, v11}, La/w6k;->w0(F)F

    .line 1323
    .line 1324
    .line 1325
    move-result v2

    .line 1326
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1327
    .line 1328
    .line 1329
    move-result v3

    .line 1330
    int-to-long v3, v3

    .line 1331
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1332
    .line 1333
    .line 1334
    move-result v2

    .line 1335
    int-to-long v5, v2

    .line 1336
    shl-long v2, v3, v14

    .line 1337
    .line 1338
    and-long v4, v5, v12

    .line 1339
    .line 1340
    or-long v8, v2, v4

    .line 1341
    .line 1342
    const/4 v10, 0x0

    .line 1343
    const/16 v11, 0xf6

    .line 1344
    .line 1345
    iget-wide v2, v0, La/nme;->b:J

    .line 1346
    .line 1347
    const-wide/16 v4, 0x0

    .line 1348
    .line 1349
    const-wide/16 v6, 0x0

    .line 1350
    .line 1351
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 1352
    .line 1353
    .line 1354
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1355
    .line 1356
    return-object v0

    .line 1357
    :pswitch_19
    move-object/from16 v1, p1

    .line 1358
    .line 1359
    check-cast v1, La/fhl;

    .line 1360
    .line 1361
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1362
    .line 1363
    .line 1364
    sget-object v2, La/qmk;->a:La/zcl;

    .line 1365
    .line 1366
    invoke-interface {v1, v11}, La/w6k;->w0(F)F

    .line 1367
    .line 1368
    .line 1369
    move-result v2

    .line 1370
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1371
    .line 1372
    .line 1373
    move-result v3

    .line 1374
    int-to-long v3, v3

    .line 1375
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1376
    .line 1377
    .line 1378
    move-result v2

    .line 1379
    int-to-long v5, v2

    .line 1380
    shl-long v2, v3, v14

    .line 1381
    .line 1382
    and-long v4, v5, v12

    .line 1383
    .line 1384
    or-long v8, v2, v4

    .line 1385
    .line 1386
    const/4 v10, 0x0

    .line 1387
    const/16 v11, 0xf6

    .line 1388
    .line 1389
    iget-wide v2, v0, La/nme;->b:J

    .line 1390
    .line 1391
    const-wide/16 v4, 0x0

    .line 1392
    .line 1393
    const-wide/16 v6, 0x0

    .line 1394
    .line 1395
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 1396
    .line 1397
    .line 1398
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1399
    .line 1400
    return-object v0

    .line 1401
    :pswitch_1a
    move-object/from16 v0, p1

    .line 1402
    .line 1403
    check-cast v0, La/n1g;

    .line 1404
    .line 1405
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1406
    .line 1407
    .line 1408
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v1

    .line 1412
    invoke-virtual {v0, v1}, La/n1g;->b(Ljava/lang/String;)V

    .line 1413
    .line 1414
    .line 1415
    new-instance v1, La/lq2;

    .line 1416
    .line 1417
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1418
    .line 1419
    .line 1420
    iput-object v1, v0, La/n1g;->e:La/ms2;

    .line 1421
    .line 1422
    sget-object v1, La/l1g;->d:La/l1g;

    .line 1423
    .line 1424
    iput-object v1, v0, La/n1g;->f:La/l1g;

    .line 1425
    .line 1426
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1427
    .line 1428
    return-object v0

    .line 1429
    :pswitch_1b
    move-object/from16 v0, p1

    .line 1430
    .line 1431
    check-cast v0, La/abi0;

    .line 1432
    .line 1433
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1434
    .line 1435
    .line 1436
    invoke-static {v0, v8, v9}, La/cbi0;->a(La/abi0;J)V

    .line 1437
    .line 1438
    .line 1439
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1440
    .line 1441
    return-object v0

    .line 1442
    :pswitch_1c
    move-object/from16 v1, p1

    .line 1443
    .line 1444
    check-cast v1, La/abi0;

    .line 1445
    .line 1446
    sget-object v2, La/h5i0;->a:La/zai0;

    .line 1447
    .line 1448
    new-instance v3, La/g5i0;

    .line 1449
    .line 1450
    sget-object v4, La/blv;->a:La/blv;

    .line 1451
    .line 1452
    sget-object v7, La/f5i0;->b:La/f5i0;

    .line 1453
    .line 1454
    const/4 v8, 0x1

    .line 1455
    iget-wide v5, v0, La/nme;->b:J

    .line 1456
    .line 1457
    invoke-direct/range {v3 .. v8}, La/g5i0;-><init>(La/blv;JLa/f5i0;Z)V

    .line 1458
    .line 1459
    .line 1460
    invoke-interface {v1, v2, v3}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 1461
    .line 1462
    .line 1463
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1464
    .line 1465
    return-object v0

    .line 1466
    nop

    .line 1467
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
