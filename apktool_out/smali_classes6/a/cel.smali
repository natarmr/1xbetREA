.class public final synthetic La/cel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FLjava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/cel;->a:B

    iput p1, p0, La/cel;->b:F

    iput-object p2, p0, La/cel;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;FB)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/cel;->a:B

    iput-object p1, p0, La/cel;->c:Ljava/lang/Object;

    iput p2, p0, La/cel;->b:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/cel;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x3f800000    # 1.0f

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x1

    .line 11
    iget v7, v0, La/cel;->b:F

    .line 12
    .line 13
    iget-object v8, v0, La/cel;->c:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v8, La/oms0;

    .line 19
    .line 20
    move-object/from16 v0, p1

    .line 21
    .line 22
    check-cast v0, Ljava/lang/Long;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    invoke-virtual {v8}, La/oms0;->h()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    iget-object v3, v8, La/oms0;->h:La/egk0;

    .line 33
    .line 34
    if-nez v2, :cond_3

    .line 35
    .line 36
    invoke-virtual {v3}, La/egk0;->l()J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    const-wide/high16 v11, -0x8000000000000000L

    .line 41
    .line 42
    cmp-long v2, v9, v11

    .line 43
    .line 44
    if-nez v2, :cond_0

    .line 45
    .line 46
    invoke-virtual {v3, v0, v1}, La/egk0;->m(J)V

    .line 47
    .line 48
    .line 49
    iget-object v2, v8, La/oms0;->a:La/p4;

    .line 50
    .line 51
    iget-object v2, v2, La/p4;->b:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v2, La/pz40;

    .line 54
    .line 55
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 56
    .line 57
    check-cast v2, La/hgk0;

    .line 58
    .line 59
    invoke-virtual {v2, v9}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :cond_0
    invoke-virtual {v3}, La/egk0;->l()J

    .line 63
    .line 64
    .line 65
    move-result-wide v2

    .line 66
    sub-long/2addr v0, v2

    .line 67
    cmpg-float v2, v7, v5

    .line 68
    .line 69
    if-nez v2, :cond_1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    long-to-double v0, v0

    .line 73
    float-to-double v9, v7

    .line 74
    div-double/2addr v0, v9

    .line 75
    invoke-static {v0, v1}, La/si30;->c(D)J

    .line 76
    .line 77
    .line 78
    move-result-wide v0

    .line 79
    :goto_0
    invoke-virtual {v8, v0, v1}, La/oms0;->o(J)V

    .line 80
    .line 81
    .line 82
    if-nez v2, :cond_2

    .line 83
    .line 84
    move v4, v6

    .line 85
    :cond_2
    invoke-virtual {v8, v4, v0, v1}, La/oms0;->i(ZJ)V

    .line 86
    .line 87
    .line 88
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    return-object v0

    .line 91
    :pswitch_0
    check-cast v8, La/fqj0;

    .line 92
    .line 93
    move-object/from16 v0, p1

    .line 94
    .line 95
    check-cast v0, La/hcz;

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    new-instance v1, La/u57;

    .line 101
    .line 102
    invoke-direct {v1, v7, v8, v6}, La/u57;-><init>(FLa/fqj0;B)V

    .line 103
    .line 104
    .line 105
    new-instance v4, La/ugd;

    .line 106
    .line 107
    const v2, -0x3c07dfd0

    .line 108
    .line 109
    .line 110
    invoke-direct {v4, v2, v6, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    const/4 v5, 0x6

    .line 114
    const/4 v1, 0x2

    .line 115
    const/4 v2, 0x0

    .line 116
    const/4 v3, 0x0

    .line 117
    invoke-static/range {v0 .. v5}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 118
    .line 119
    .line 120
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    return-object v0

    .line 123
    :pswitch_1
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 124
    .line 125
    move-object/from16 v0, p1

    .line 126
    .line 127
    check-cast v0, La/c53;

    .line 128
    .line 129
    new-instance v1, La/lie;

    .line 130
    .line 131
    invoke-interface {v8, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    check-cast v2, La/lie;

    .line 136
    .line 137
    iget-object v2, v2, La/lie;->a:La/pzn;

    .line 138
    .line 139
    invoke-interface {v8, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    check-cast v0, La/lie;

    .line 144
    .line 145
    iget-object v0, v0, La/lie;->b:La/alo;

    .line 146
    .line 147
    invoke-direct {v1, v2, v0, v7, v3}, La/lie;-><init>(La/pzn;La/alo;FLa/u7k0;)V

    .line 148
    .line 149
    .line 150
    return-object v1

    .line 151
    :pswitch_2
    check-cast v8, La/pqb0;

    .line 152
    .line 153
    move-object/from16 v0, p1

    .line 154
    .line 155
    check-cast v0, La/kqb0;

    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    iget-object v1, v0, La/kqb0;->c:Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/table/PowerOfPowerScrollableTableView;

    .line 161
    .line 162
    invoke-virtual {v1}, Landroid/view/View;->getPaddingStart()I

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    cmpg-float v5, v7, v5

    .line 178
    .line 179
    if-nez v5, :cond_4

    .line 180
    .line 181
    goto :goto_1

    .line 182
    :cond_4
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    .line 191
    .line 192
    mul-float/2addr v4, v7

    .line 193
    float-to-double v4, v4

    .line 194
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 195
    .line 196
    .line 197
    move-result-wide v4

    .line 198
    double-to-float v4, v4

    .line 199
    float-to-int v4, v4

    .line 200
    :goto_1
    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    .line 201
    .line 202
    .line 203
    move-result v5

    .line 204
    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 205
    .line 206
    .line 207
    iget-object v0, v0, La/kqb0;->b:Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/table/PowerOfPowerColumnView;

    .line 208
    .line 209
    iget-object v2, v8, La/pqb0;->a:La/jqb0;

    .line 210
    .line 211
    invoke-virtual {v0, v2}, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/table/PowerOfPowerColumnView;->setColumn(La/jqb0;)V

    .line 212
    .line 213
    .line 214
    iget-object v0, v8, La/pqb0;->b:Ljava/util/ArrayList;

    .line 215
    .line 216
    invoke-virtual {v1, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/table/PowerOfPowerScrollableTableView;->setColumns(Ljava/util/List;)V

    .line 217
    .line 218
    .line 219
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 220
    .line 221
    return-object v0

    .line 222
    :pswitch_3
    check-cast v8, La/l7m0;

    .line 223
    .line 224
    move-object/from16 v9, p1

    .line 225
    .line 226
    check-cast v9, La/fhl;

    .line 227
    .line 228
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    invoke-interface {v8}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    check-cast v1, La/y3d;

    .line 236
    .line 237
    iget-wide v10, v1, La/y3d;->a:J

    .line 238
    .line 239
    const/16 v16, 0x0

    .line 240
    .line 241
    const/16 v17, 0x7c

    .line 242
    .line 243
    iget v12, v0, La/cel;->b:F

    .line 244
    .line 245
    const-wide/16 v13, 0x0

    .line 246
    .line 247
    const/4 v15, 0x0

    .line 248
    invoke-static/range {v9 .. v17}, La/fhl;->E(La/fhl;JFJFLa/agc;I)V

    .line 249
    .line 250
    .line 251
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 252
    .line 253
    return-object v0

    .line 254
    :pswitch_4
    check-cast v8, La/pvi0;

    .line 255
    .line 256
    move-object/from16 v0, p1

    .line 257
    .line 258
    check-cast v0, La/uag0;

    .line 259
    .line 260
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    if-eqz v8, :cond_11

    .line 264
    .line 265
    instance-of v1, v8, La/cvi0;

    .line 266
    .line 267
    if-eqz v1, :cond_5

    .line 268
    .line 269
    :goto_2
    move v2, v7

    .line 270
    goto :goto_3

    .line 271
    :cond_5
    instance-of v1, v8, La/dvi0;

    .line 272
    .line 273
    if-eqz v1, :cond_6

    .line 274
    .line 275
    goto :goto_2

    .line 276
    :cond_6
    instance-of v1, v8, La/evi0;

    .line 277
    .line 278
    if-eqz v1, :cond_7

    .line 279
    .line 280
    goto :goto_2

    .line 281
    :cond_7
    instance-of v1, v8, La/fvi0;

    .line 282
    .line 283
    if-eqz v1, :cond_8

    .line 284
    .line 285
    goto :goto_2

    .line 286
    :cond_8
    instance-of v1, v8, La/gvi0;

    .line 287
    .line 288
    if-eqz v1, :cond_9

    .line 289
    .line 290
    goto :goto_2

    .line 291
    :cond_9
    instance-of v1, v8, La/hvi0;

    .line 292
    .line 293
    if-eqz v1, :cond_a

    .line 294
    .line 295
    goto :goto_2

    .line 296
    :cond_a
    instance-of v1, v8, La/ivi0;

    .line 297
    .line 298
    if-eqz v1, :cond_b

    .line 299
    .line 300
    goto :goto_2

    .line 301
    :cond_b
    instance-of v1, v8, La/jvi0;

    .line 302
    .line 303
    if-eqz v1, :cond_c

    .line 304
    .line 305
    goto :goto_2

    .line 306
    :cond_c
    instance-of v1, v8, La/kvi0;

    .line 307
    .line 308
    if-eqz v1, :cond_d

    .line 309
    .line 310
    goto :goto_2

    .line 311
    :cond_d
    instance-of v1, v8, La/lvi0;

    .line 312
    .line 313
    if-eqz v1, :cond_e

    .line 314
    .line 315
    goto :goto_2

    .line 316
    :cond_e
    instance-of v1, v8, La/mvi0;

    .line 317
    .line 318
    if-eqz v1, :cond_f

    .line 319
    .line 320
    goto :goto_2

    .line 321
    :cond_f
    instance-of v1, v8, La/nvi0;

    .line 322
    .line 323
    if-eqz v1, :cond_10

    .line 324
    .line 325
    goto :goto_2

    .line 326
    :cond_10
    instance-of v1, v8, La/ovi0;

    .line 327
    .line 328
    if-eqz v1, :cond_11

    .line 329
    .line 330
    :goto_3
    invoke-virtual {v0, v2}, La/uag0;->b(F)V

    .line 331
    .line 332
    .line 333
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 334
    .line 335
    goto :goto_4

    .line 336
    :cond_11
    invoke-static {}, La/t9f;->b()V

    .line 337
    .line 338
    .line 339
    :goto_4
    return-object v3

    .line 340
    :pswitch_5
    check-cast v8, La/unm;

    .line 341
    .line 342
    move-object/from16 v9, p1

    .line 343
    .line 344
    check-cast v9, La/fhl;

    .line 345
    .line 346
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    iget v0, v8, La/unm;->e:F

    .line 350
    .line 351
    invoke-interface {v9, v0}, La/w6k;->w0(F)F

    .line 352
    .line 353
    .line 354
    move-result v0

    .line 355
    iget v1, v8, La/unm;->h:I

    .line 356
    .line 357
    int-to-float v1, v1

    .line 358
    div-float v3, v7, v1

    .line 359
    .line 360
    invoke-static {v3, v5, v2}, La/l1e0;->c(FFF)F

    .line 361
    .line 362
    .line 363
    move-result v2

    .line 364
    invoke-interface {v9}, La/fhl;->d()J

    .line 365
    .line 366
    .line 367
    move-result-wide v3

    .line 368
    const/16 v6, 0x20

    .line 369
    .line 370
    shr-long/2addr v3, v6

    .line 371
    long-to-int v3, v3

    .line 372
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 373
    .line 374
    .line 375
    move-result v3

    .line 376
    mul-float/2addr v3, v2

    .line 377
    cmpg-float v2, v7, v5

    .line 378
    .line 379
    if-gtz v2, :cond_12

    .line 380
    .line 381
    move v0, v5

    .line 382
    goto :goto_5

    .line 383
    :cond_12
    cmpl-float v1, v7, v1

    .line 384
    .line 385
    if-ltz v1, :cond_13

    .line 386
    .line 387
    invoke-interface {v9}, La/fhl;->d()J

    .line 388
    .line 389
    .line 390
    move-result-wide v0

    .line 391
    shr-long/2addr v0, v6

    .line 392
    long-to-int v0, v0

    .line 393
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 394
    .line 395
    .line 396
    move-result v0

    .line 397
    goto :goto_5

    .line 398
    :cond_13
    invoke-interface {v9}, La/fhl;->d()J

    .line 399
    .line 400
    .line 401
    move-result-wide v1

    .line 402
    shr-long/2addr v1, v6

    .line 403
    long-to-int v1, v1

    .line 404
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 405
    .line 406
    .line 407
    move-result v1

    .line 408
    sub-float/2addr v1, v0

    .line 409
    invoke-static {v3, v0, v1}, La/l1e0;->c(FFF)F

    .line 410
    .line 411
    .line 412
    move-result v0

    .line 413
    :goto_5
    iget-wide v1, v8, La/unm;->b:J

    .line 414
    .line 415
    new-instance v3, La/y3d;

    .line 416
    .line 417
    invoke-direct {v3, v1, v2}, La/y3d;-><init>(J)V

    .line 418
    .line 419
    .line 420
    iget-wide v1, v8, La/unm;->c:J

    .line 421
    .line 422
    new-instance v4, La/y3d;

    .line 423
    .line 424
    invoke-direct {v4, v1, v2}, La/y3d;-><init>(J)V

    .line 425
    .line 426
    .line 427
    filled-new-array {v3, v4}, [La/y3d;

    .line 428
    .line 429
    .line 430
    move-result-object v1

    .line 431
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    const/16 v2, 0x8

    .line 436
    .line 437
    invoke-static {v1, v5, v0, v2}, La/yk5;->g(Ljava/util/List;FFI)La/e900;

    .line 438
    .line 439
    .line 440
    move-result-object v10

    .line 441
    invoke-interface {v9}, La/fhl;->d()J

    .line 442
    .line 443
    .line 444
    move-result-wide v1

    .line 445
    const/4 v3, 0x2

    .line 446
    invoke-static {v1, v2, v0, v5, v3}, La/h7k0;->a(JFFI)J

    .line 447
    .line 448
    .line 449
    move-result-wide v13

    .line 450
    const/16 v18, 0x0

    .line 451
    .line 452
    const/16 v19, 0x7a

    .line 453
    .line 454
    const-wide/16 v11, 0x0

    .line 455
    .line 456
    const/4 v15, 0x0

    .line 457
    const/16 v16, 0x0

    .line 458
    .line 459
    const/16 v17, 0x0

    .line 460
    .line 461
    invoke-static/range {v9 .. v19}, La/fhl;->r(La/fhl;La/t89;JJFLa/agc;La/a4d;II)V

    .line 462
    .line 463
    .line 464
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 465
    .line 466
    return-object v0

    .line 467
    :pswitch_6
    check-cast v8, La/uzb;

    .line 468
    .line 469
    move-object/from16 v0, p1

    .line 470
    .line 471
    check-cast v0, La/hcz;

    .line 472
    .line 473
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 474
    .line 475
    .line 476
    float-to-int v1, v7

    .line 477
    new-instance v2, La/awh;

    .line 478
    .line 479
    const/16 v3, 0x1b

    .line 480
    .line 481
    invoke-direct {v2, v8, v3}, La/awh;-><init>(Ljava/lang/Object;B)V

    .line 482
    .line 483
    .line 484
    new-instance v4, La/ugd;

    .line 485
    .line 486
    const v3, -0x5e817fab

    .line 487
    .line 488
    .line 489
    invoke-direct {v4, v3, v6, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 490
    .line 491
    .line 492
    const/4 v5, 0x6

    .line 493
    const/4 v2, 0x0

    .line 494
    const/4 v3, 0x0

    .line 495
    invoke-static/range {v0 .. v5}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 496
    .line 497
    .line 498
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 499
    .line 500
    return-object v0

    .line 501
    :pswitch_7
    check-cast v8, La/hie0;

    .line 502
    .line 503
    move-object/from16 v0, p1

    .line 504
    .line 505
    check-cast v0, La/tel;

    .line 506
    .line 507
    invoke-interface {v0}, La/zlt;->F()Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v1

    .line 511
    const-string v2, "waiting"

    .line 512
    .line 513
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 514
    .line 515
    .line 516
    move-result v1

    .line 517
    invoke-interface {v0}, La/tel;->J()La/ma80;

    .line 518
    .line 519
    .line 520
    move-result-object v2

    .line 521
    if-nez v2, :cond_15

    .line 522
    .line 523
    :cond_14
    move v0, v4

    .line 524
    goto :goto_7

    .line 525
    :cond_15
    invoke-interface {v0}, La/tel;->J()La/ma80;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 530
    .line 531
    .line 532
    sget-object v2, La/uel;->a:La/bk9;

    .line 533
    .line 534
    sget-object v2, La/ma80;->b:La/ma80;

    .line 535
    .line 536
    const/high16 v3, 0x41f00000    # 30.0f

    .line 537
    .line 538
    if-ne v0, v2, :cond_16

    .line 539
    .line 540
    cmpg-float v0, v7, v3

    .line 541
    .line 542
    if-gtz v0, :cond_14

    .line 543
    .line 544
    :goto_6
    move v0, v6

    .line 545
    goto :goto_7

    .line 546
    :cond_16
    cmpl-float v0, v7, v3

    .line 547
    .line 548
    if-lez v0, :cond_14

    .line 549
    .line 550
    const/high16 v0, 0x42b40000    # 90.0f

    .line 551
    .line 552
    cmpg-float v0, v7, v0

    .line 553
    .line 554
    if-gtz v0, :cond_14

    .line 555
    .line 556
    goto :goto_6

    .line 557
    :goto_7
    iget-boolean v2, v8, La/hie0;->a:Z

    .line 558
    .line 559
    if-nez v2, :cond_17

    .line 560
    .line 561
    if-eqz v1, :cond_18

    .line 562
    .line 563
    if-eqz v0, :cond_18

    .line 564
    .line 565
    :cond_17
    move v4, v6

    .line 566
    :cond_18
    iput-boolean v4, v8, La/hie0;->a:Z

    .line 567
    .line 568
    xor-int/lit8 v0, v4, 0x1

    .line 569
    .line 570
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    return-object v0

    .line 575
    :pswitch_data_0
    .packed-switch 0x0
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
