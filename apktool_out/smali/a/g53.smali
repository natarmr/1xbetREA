.class public final La/g53;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;JB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/g53;->a:B

    iput-object p1, p0, La/g53;->b:Ljava/lang/Object;

    iput-wide p2, p0, La/g53;->c:J

    const/4 p1, 0x1

    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v2, v0, La/g53;->a:B

    .line 6
    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    const-wide v5, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v8, 0x0

    .line 16
    iget-wide v9, v0, La/g53;->c:J

    .line 17
    .line 18
    iget-object v0, v0, La/g53;->b:Ljava/lang/Object;

    .line 19
    .line 20
    packed-switch v2, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    check-cast v1, Ljava/lang/Number;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 26
    .line 27
    .line 28
    move-result-wide v1

    .line 29
    check-cast v0, La/lms0;

    .line 30
    .line 31
    iget-object v3, v0, La/lms0;->a:La/ot40;

    .line 32
    .line 33
    iget-object v3, v3, La/ot40;->i:La/fms0;

    .line 34
    .line 35
    iget-object v0, v0, La/lms0;->b:La/agk0;

    .line 36
    .line 37
    invoke-virtual {v0}, La/agk0;->l()F

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-static {v9, v10}, La/g6u0;->b(J)F

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    invoke-static {v9, v10}, La/g6u0;->c(J)F

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    iget-object v6, v3, La/fms0;->f:La/yls0;

    .line 50
    .line 51
    if-eqz v6, :cond_e

    .line 52
    .line 53
    iget-object v9, v3, La/fms0;->b:Ljava/util/HashMap;

    .line 54
    .line 55
    iget-object v6, v6, La/yls0;->a:Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v9, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    check-cast v6, La/ems0;

    .line 62
    .line 63
    const/4 v9, 0x2

    .line 64
    new-array v9, v9, [F

    .line 65
    .line 66
    iget-object v10, v3, La/fms0;->f:La/yls0;

    .line 67
    .line 68
    sget-object v11, La/yls0;->x:[[F

    .line 69
    .line 70
    iget v12, v10, La/yls0;->e:I

    .line 71
    .line 72
    aget-object v11, v11, v12

    .line 73
    .line 74
    sget-object v12, La/yls0;->s:[[F

    .line 75
    .line 76
    iget v10, v10, La/yls0;->b:I

    .line 77
    .line 78
    aget-object v10, v12, v10

    .line 79
    .line 80
    iget-object v6, v6, La/ems0;->d:La/zr40;

    .line 81
    .line 82
    const/4 v12, 0x0

    .line 83
    aget v13, v10, v12

    .line 84
    .line 85
    const/4 v14, 0x1

    .line 86
    aget v10, v10, v14

    .line 87
    .line 88
    invoke-virtual {v6, v0, v13, v10, v9}, La/zr40;->f(FFF[F)V

    .line 89
    .line 90
    .line 91
    aget v6, v11, v12

    .line 92
    .line 93
    aget v10, v9, v12

    .line 94
    .line 95
    mul-float/2addr v6, v10

    .line 96
    aget v10, v11, v14

    .line 97
    .line 98
    aget v13, v9, v14

    .line 99
    .line 100
    mul-float/2addr v10, v13

    .line 101
    add-float/2addr v10, v6

    .line 102
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    move/from16 p0, v14

    .line 107
    .line 108
    float-to-double v14, v6

    .line 109
    const-wide v16, 0x3f847ae147ae147bL    # 0.01

    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    cmpg-double v6, v14, v16

    .line 115
    .line 116
    if-gez v6, :cond_0

    .line 117
    .line 118
    const v6, 0x3c23d70a    # 0.01f

    .line 119
    .line 120
    .line 121
    aput v6, v9, v12

    .line 122
    .line 123
    aput v6, v9, p0

    .line 124
    .line 125
    :cond_0
    aget v6, v11, v12

    .line 126
    .line 127
    cmpl-float v6, v6, v8

    .line 128
    .line 129
    if-eqz v6, :cond_1

    .line 130
    .line 131
    aget v5, v9, v12

    .line 132
    .line 133
    div-float/2addr v4, v5

    .line 134
    goto :goto_0

    .line 135
    :cond_1
    aget v4, v9, p0

    .line 136
    .line 137
    div-float v4, v5, v4

    .line 138
    .line 139
    :goto_0
    iget-object v3, v3, La/fms0;->f:La/yls0;

    .line 140
    .line 141
    iget v5, v3, La/yls0;->f:F

    .line 142
    .line 143
    mul-float/2addr v4, v5

    .line 144
    iput-wide v1, v3, La/yls0;->q:J

    .line 145
    .line 146
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    iget v2, v3, La/yls0;->h:F

    .line 151
    .line 152
    cmpl-float v1, v1, v2

    .line 153
    .line 154
    if-lez v1, :cond_2

    .line 155
    .line 156
    invoke-static {v4}, Ljava/lang/Math;->signum(F)F

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    mul-float v4, v1, v2

    .line 161
    .line 162
    :cond_2
    move v14, v4

    .line 163
    invoke-static {v14}, Ljava/lang/Math;->abs(F)F

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    const/high16 v2, 0x3f000000    # 0.5f

    .line 168
    .line 169
    mul-float/2addr v1, v2

    .line 170
    mul-float/2addr v1, v14

    .line 171
    iget v4, v3, La/yls0;->i:F

    .line 172
    .line 173
    div-float/2addr v1, v4

    .line 174
    add-float/2addr v1, v0

    .line 175
    iget v4, v3, La/yls0;->j:I

    .line 176
    .line 177
    const/high16 v5, 0x3f800000    # 1.0f

    .line 178
    .line 179
    packed-switch v4, :pswitch_data_1

    .line 180
    .line 181
    .line 182
    float-to-double v1, v1

    .line 183
    const-wide/high16 v9, 0x3fe0000000000000L    # 0.5

    .line 184
    .line 185
    cmpl-double v1, v1, v9

    .line 186
    .line 187
    if-lez v1, :cond_4

    .line 188
    .line 189
    :cond_3
    :goto_1
    :pswitch_0
    move v1, v5

    .line 190
    goto :goto_3

    .line 191
    :cond_4
    :goto_2
    :pswitch_1
    move v1, v8

    .line 192
    goto :goto_3

    .line 193
    :pswitch_2
    const v4, 0x3e4ccccd    # 0.2f

    .line 194
    .line 195
    .line 196
    cmpl-float v4, v1, v4

    .line 197
    .line 198
    if-lez v4, :cond_5

    .line 199
    .line 200
    const v4, 0x3f4ccccd    # 0.8f

    .line 201
    .line 202
    .line 203
    cmpg-float v4, v1, v4

    .line 204
    .line 205
    if-gez v4, :cond_5

    .line 206
    .line 207
    goto :goto_3

    .line 208
    :cond_5
    cmpl-float v1, v1, v2

    .line 209
    .line 210
    if-lez v1, :cond_4

    .line 211
    .line 212
    goto :goto_1

    .line 213
    :pswitch_3
    invoke-static {v5, v1}, Ljava/lang/Math;->min(FF)F

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    invoke-static {v8, v1}, Ljava/lang/Math;->max(FF)F

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    goto :goto_3

    .line 222
    :pswitch_4
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 223
    .line 224
    goto :goto_3

    .line 225
    :pswitch_5
    cmpg-float v1, v0, v8

    .line 226
    .line 227
    if-gtz v1, :cond_3

    .line 228
    .line 229
    goto :goto_2

    .line 230
    :pswitch_6
    cmpl-float v1, v0, v5

    .line 231
    .line 232
    if-ltz v1, :cond_4

    .line 233
    .line 234
    goto :goto_1

    .line 235
    :goto_3
    iput v1, v3, La/yls0;->o:F

    .line 236
    .line 237
    cmpl-float v2, v1, v0

    .line 238
    .line 239
    if-nez v2, :cond_6

    .line 240
    .line 241
    iput-object v7, v3, La/yls0;->c:La/sqm0;

    .line 242
    .line 243
    goto/16 :goto_8

    .line 244
    .line 245
    :cond_6
    iget v2, v3, La/yls0;->j:I

    .line 246
    .line 247
    const/4 v4, 0x4

    .line 248
    if-ne v2, v4, :cond_8

    .line 249
    .line 250
    iget v2, v3, La/yls0;->g:I

    .line 251
    .line 252
    if-nez v2, :cond_8

    .line 253
    .line 254
    iget-object v2, v3, La/yls0;->c:La/sqm0;

    .line 255
    .line 256
    instance-of v4, v2, La/uqm0;

    .line 257
    .line 258
    if-eqz v4, :cond_7

    .line 259
    .line 260
    check-cast v2, La/uqm0;

    .line 261
    .line 262
    goto :goto_4

    .line 263
    :cond_7
    new-instance v2, La/uqm0;

    .line 264
    .line 265
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 266
    .line 267
    .line 268
    iput-boolean v12, v2, La/uqm0;->g:Z

    .line 269
    .line 270
    iput-object v2, v3, La/yls0;->c:La/sqm0;

    .line 271
    .line 272
    :goto_4
    iput-boolean v12, v2, La/uqm0;->g:Z

    .line 273
    .line 274
    iput v1, v2, La/uqm0;->a:F

    .line 275
    .line 276
    iput v14, v2, La/uqm0;->b:F

    .line 277
    .line 278
    iput v0, v2, La/uqm0;->f:F

    .line 279
    .line 280
    sub-float/2addr v1, v0

    .line 281
    const/high16 v0, 0x40000000    # 2.0f

    .line 282
    .line 283
    div-float v0, v14, v0

    .line 284
    .line 285
    div-float/2addr v1, v0

    .line 286
    iput v1, v2, La/uqm0;->e:F

    .line 287
    .line 288
    neg-float v0, v14

    .line 289
    div-float/2addr v0, v1

    .line 290
    iput v0, v2, La/uqm0;->c:F

    .line 291
    .line 292
    goto/16 :goto_8

    .line 293
    .line 294
    :cond_8
    iget v2, v3, La/yls0;->g:I

    .line 295
    .line 296
    iget-object v4, v3, La/yls0;->c:La/sqm0;

    .line 297
    .line 298
    if-nez v2, :cond_c

    .line 299
    .line 300
    instance-of v2, v4, La/vqm0;

    .line 301
    .line 302
    if-eqz v2, :cond_9

    .line 303
    .line 304
    check-cast v4, La/vqm0;

    .line 305
    .line 306
    :goto_5
    move-object v5, v4

    .line 307
    goto :goto_6

    .line 308
    :cond_9
    new-instance v4, La/vqm0;

    .line 309
    .line 310
    invoke-direct {v4}, La/vqm0;-><init>()V

    .line 311
    .line 312
    .line 313
    iput-object v4, v3, La/yls0;->c:La/sqm0;

    .line 314
    .line 315
    goto :goto_5

    .line 316
    :goto_6
    iget v8, v3, La/yls0;->i:F

    .line 317
    .line 318
    iget v9, v3, La/yls0;->h:F

    .line 319
    .line 320
    iput v0, v5, La/vqm0;->l:F

    .line 321
    .line 322
    cmpl-float v2, v0, v1

    .line 323
    .line 324
    if-lez v2, :cond_a

    .line 325
    .line 326
    move/from16 v12, p0

    .line 327
    .line 328
    :cond_a
    iput-boolean v12, v5, La/vqm0;->k:Z

    .line 329
    .line 330
    const v18, 0x3ecccccd    # 0.4f

    .line 331
    .line 332
    .line 333
    if-eqz v12, :cond_b

    .line 334
    .line 335
    neg-float v6, v14

    .line 336
    sub-float v7, v0, v1

    .line 337
    .line 338
    move/from16 v10, v18

    .line 339
    .line 340
    invoke-virtual/range {v5 .. v10}, La/vqm0;->d(FFFFF)V

    .line 341
    .line 342
    .line 343
    goto :goto_8

    .line 344
    :cond_b
    move/from16 v16, v8

    .line 345
    .line 346
    move/from16 v17, v9

    .line 347
    .line 348
    sub-float v15, v1, v0

    .line 349
    .line 350
    move-object v13, v5

    .line 351
    invoke-virtual/range {v13 .. v18}, La/vqm0;->d(FFFFF)V

    .line 352
    .line 353
    .line 354
    goto :goto_8

    .line 355
    :cond_c
    instance-of v2, v4, La/oul0;

    .line 356
    .line 357
    if-eqz v2, :cond_d

    .line 358
    .line 359
    check-cast v4, La/oul0;

    .line 360
    .line 361
    goto :goto_7

    .line 362
    :cond_d
    new-instance v4, La/oul0;

    .line 363
    .line 364
    invoke-direct {v4}, La/oul0;-><init>()V

    .line 365
    .line 366
    .line 367
    iput-object v4, v3, La/yls0;->c:La/sqm0;

    .line 368
    .line 369
    :goto_7
    iget v2, v3, La/yls0;->k:F

    .line 370
    .line 371
    iget v5, v3, La/yls0;->l:F

    .line 372
    .line 373
    iget v6, v3, La/yls0;->m:F

    .line 374
    .line 375
    iget v7, v3, La/yls0;->n:F

    .line 376
    .line 377
    iget v3, v3, La/yls0;->p:I

    .line 378
    .line 379
    float-to-double v9, v1

    .line 380
    iput-wide v9, v4, La/oul0;->c:D

    .line 381
    .line 382
    float-to-double v9, v6

    .line 383
    iput-wide v9, v4, La/oul0;->a:D

    .line 384
    .line 385
    iput v0, v4, La/oul0;->e:F

    .line 386
    .line 387
    float-to-double v0, v5

    .line 388
    iput-wide v0, v4, La/oul0;->b:D

    .line 389
    .line 390
    iput v2, v4, La/oul0;->g:F

    .line 391
    .line 392
    iput v7, v4, La/oul0;->h:F

    .line 393
    .line 394
    iput v3, v4, La/oul0;->i:I

    .line 395
    .line 396
    iput v8, v4, La/oul0;->d:F

    .line 397
    .line 398
    :cond_e
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 399
    .line 400
    return-object v0

    .line 401
    :pswitch_7
    check-cast v0, La/h53;

    .line 402
    .line 403
    iget-object v2, v0, La/h53;->r:La/i53;

    .line 404
    .line 405
    invoke-virtual {v2}, La/i53;->d()Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v2

    .line 409
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    move-result v2

    .line 413
    if-eqz v2, :cond_10

    .line 414
    .line 415
    iget-wide v1, v0, La/h53;->y:J

    .line 416
    .line 417
    invoke-static {v1, v2, v5, v6}, La/qkx;->a(JJ)Z

    .line 418
    .line 419
    .line 420
    move-result v1

    .line 421
    if-eqz v1, :cond_f

    .line 422
    .line 423
    move-wide v3, v9

    .line 424
    goto :goto_9

    .line 425
    :cond_f
    iget-wide v0, v0, La/h53;->y:J

    .line 426
    .line 427
    move-wide v3, v0

    .line 428
    goto :goto_9

    .line 429
    :cond_10
    iget-object v0, v0, La/h53;->r:La/i53;

    .line 430
    .line 431
    iget-object v0, v0, La/i53;->d:La/hz40;

    .line 432
    .line 433
    invoke-virtual {v0, v1}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    check-cast v0, La/l7m0;

    .line 438
    .line 439
    if-eqz v0, :cond_11

    .line 440
    .line 441
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    check-cast v0, La/qkx;

    .line 446
    .line 447
    iget-wide v3, v0, La/qkx;->a:J

    .line 448
    .line 449
    :cond_11
    :goto_9
    new-instance v0, La/qkx;

    .line 450
    .line 451
    invoke-direct {v0, v3, v4}, La/qkx;-><init>(J)V

    .line 452
    .line 453
    .line 454
    return-object v0

    .line 455
    :pswitch_8
    check-cast v1, La/ams0;

    .line 456
    .line 457
    invoke-interface {v1}, La/ams0;->d()Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    check-cast v0, La/h53;

    .line 462
    .line 463
    iget-object v11, v0, La/h53;->r:La/i53;

    .line 464
    .line 465
    invoke-virtual {v11}, La/i53;->d()Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v11

    .line 469
    invoke-static {v2, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    move-result v2

    .line 473
    if-eqz v2, :cond_13

    .line 474
    .line 475
    iget-wide v11, v0, La/h53;->y:J

    .line 476
    .line 477
    invoke-static {v11, v12, v5, v6}, La/qkx;->a(JJ)Z

    .line 478
    .line 479
    .line 480
    move-result v2

    .line 481
    if-eqz v2, :cond_12

    .line 482
    .line 483
    goto :goto_a

    .line 484
    :cond_12
    iget-wide v9, v0, La/h53;->y:J

    .line 485
    .line 486
    goto :goto_a

    .line 487
    :cond_13
    iget-object v2, v0, La/h53;->r:La/i53;

    .line 488
    .line 489
    iget-object v2, v2, La/i53;->d:La/hz40;

    .line 490
    .line 491
    invoke-interface {v1}, La/ams0;->d()Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v5

    .line 495
    invoke-virtual {v2, v5}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v2

    .line 499
    check-cast v2, La/l7m0;

    .line 500
    .line 501
    if-eqz v2, :cond_14

    .line 502
    .line 503
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v2

    .line 507
    check-cast v2, La/qkx;

    .line 508
    .line 509
    iget-wide v9, v2, La/qkx;->a:J

    .line 510
    .line 511
    goto :goto_a

    .line 512
    :cond_14
    move-wide v9, v3

    .line 513
    :goto_a
    iget-object v2, v0, La/h53;->r:La/i53;

    .line 514
    .line 515
    iget-object v2, v2, La/i53;->d:La/hz40;

    .line 516
    .line 517
    invoke-interface {v1}, La/ams0;->b()Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v1

    .line 521
    invoke-virtual {v2, v1}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v1

    .line 525
    check-cast v1, La/l7m0;

    .line 526
    .line 527
    if-eqz v1, :cond_15

    .line 528
    .line 529
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v1

    .line 533
    check-cast v1, La/qkx;

    .line 534
    .line 535
    iget-wide v3, v1, La/qkx;->a:J

    .line 536
    .line 537
    :cond_15
    iget-object v0, v0, La/h53;->q:La/pz40;

    .line 538
    .line 539
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    check-cast v0, La/u7k0;

    .line 544
    .line 545
    if-eqz v0, :cond_16

    .line 546
    .line 547
    iget-object v0, v0, La/u7k0;->b:Lkotlin/jvm/functions/Function2;

    .line 548
    .line 549
    new-instance v1, La/qkx;

    .line 550
    .line 551
    invoke-direct {v1, v9, v10}, La/qkx;-><init>(J)V

    .line 552
    .line 553
    .line 554
    new-instance v2, La/qkx;

    .line 555
    .line 556
    invoke-direct {v2, v3, v4}, La/qkx;-><init>(J)V

    .line 557
    .line 558
    .line 559
    invoke-interface {v0, v1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    check-cast v0, La/cfq;

    .line 564
    .line 565
    if-nez v0, :cond_17

    .line 566
    .line 567
    :cond_16
    const/high16 v0, 0x43c80000    # 400.0f

    .line 568
    .line 569
    const/4 v1, 0x5

    .line 570
    invoke-static {v8, v0, v7, v1}, La/ro4;->g0(FFLjava/lang/Object;I)La/nul0;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    :cond_17
    return-object v0

    .line 575
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
    .end packed-switch

    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
