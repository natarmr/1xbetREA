.class public final synthetic La/p730;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/s730;


# direct methods
.method public synthetic constructor <init>(La/s730;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/p730;->a:B

    iput-object p1, p0, La/p730;->b:La/s730;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/p730;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/p730;->b:La/s730;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, Ljava/lang/Float;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    move-object/from16 v2, p2

    .line 19
    .line 20
    check-cast v2, Ljava/lang/Float;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    sget-object v3, La/s730;->Q1:La/atz;

    .line 27
    .line 28
    invoke-virtual {v0}, La/s730;->G0()La/z1r;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    iget-object v3, v3, La/z1r;->f:Landroid/widget/LinearLayout;

    .line 33
    .line 34
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    int-to-float v3, v3

    .line 39
    const/high16 v4, 0x40000000    # 2.0f

    .line 40
    .line 41
    div-float/2addr v3, v4

    .line 42
    invoke-virtual {v0}, La/s730;->G0()La/z1r;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    iget-object v4, v4, La/z1r;->f:Landroid/widget/LinearLayout;

    .line 47
    .line 48
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    div-int/lit8 v4, v4, 0x2

    .line 53
    .line 54
    invoke-virtual {v0}, La/s730;->G0()La/z1r;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    iget-object v5, v5, La/z1r;->b:Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;

    .line 59
    .line 60
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    int-to-float v5, v5

    .line 65
    sub-float/2addr v5, v3

    .line 66
    invoke-virtual {v0}, La/s730;->G0()La/z1r;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    iget-object v6, v6, La/z1r;->f:Landroid/widget/LinearLayout;

    .line 71
    .line 72
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    int-to-float v6, v6

    .line 77
    const/high16 v7, 0x3fc00000    # 1.5f

    .line 78
    .line 79
    mul-float/2addr v6, v7

    .line 80
    sub-float v6, v1, v6

    .line 81
    .line 82
    const/4 v7, 0x0

    .line 83
    cmpg-float v8, v6, v7

    .line 84
    .line 85
    if-gez v8, :cond_0

    .line 86
    .line 87
    invoke-virtual {v0}, La/s730;->G0()La/z1r;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    iget-object v6, v6, La/z1r;->f:Landroid/widget/LinearLayout;

    .line 92
    .line 93
    int-to-float v4, v4

    .line 94
    add-float/2addr v1, v4

    .line 95
    invoke-virtual {v6, v1}, Landroid/view/View;->setX(F)V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_0
    invoke-virtual {v0}, La/s730;->G0()La/z1r;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    iget-object v1, v1, La/z1r;->f:Landroid/widget/LinearLayout;

    .line 104
    .line 105
    invoke-virtual {v1, v6}, Landroid/view/View;->setX(F)V

    .line 106
    .line 107
    .line 108
    :goto_0
    cmpl-float v1, v2, v5

    .line 109
    .line 110
    if-lez v1, :cond_1

    .line 111
    .line 112
    invoke-virtual {v0}, La/s730;->G0()La/z1r;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    iget-object v0, v0, La/z1r;->f:Landroid/widget/LinearLayout;

    .line 117
    .line 118
    sub-float/2addr v5, v3

    .line 119
    invoke-virtual {v0, v5}, Landroid/view/View;->setY(F)V

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_1
    cmpg-float v1, v2, v3

    .line 124
    .line 125
    if-gez v1, :cond_2

    .line 126
    .line 127
    invoke-virtual {v0}, La/s730;->G0()La/z1r;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    iget-object v0, v0, La/z1r;->f:Landroid/widget/LinearLayout;

    .line 132
    .line 133
    invoke-virtual {v0, v7}, Landroid/view/View;->setY(F)V

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_2
    invoke-virtual {v0}, La/s730;->G0()La/z1r;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    iget-object v0, v0, La/z1r;->f:Landroid/widget/LinearLayout;

    .line 142
    .line 143
    sub-float/2addr v2, v3

    .line 144
    invoke-virtual {v0, v2}, Landroid/view/View;->setY(F)V

    .line 145
    .line 146
    .line 147
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    return-object v0

    .line 150
    :pswitch_0
    move-object/from16 v1, p1

    .line 151
    .line 152
    check-cast v1, Ljava/lang/Boolean;

    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    move-object/from16 v2, p2

    .line 159
    .line 160
    check-cast v2, Ljava/lang/Long;

    .line 161
    .line 162
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 163
    .line 164
    .line 165
    move-result-wide v2

    .line 166
    sget-object v4, La/s730;->Q1:La/atz;

    .line 167
    .line 168
    iget-object v0, v0, La/s730;->M1:La/kiu0;

    .line 169
    .line 170
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    check-cast v0, La/dy20;

    .line 175
    .line 176
    iget-object v4, v0, La/dy20;->t:La/p7m0;

    .line 177
    .line 178
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    instance-of v6, v5, La/fx20;

    .line 183
    .line 184
    if-eqz v6, :cond_3

    .line 185
    .line 186
    check-cast v5, La/fx20;

    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_3
    const/4 v5, 0x0

    .line 190
    :goto_2
    if-eqz v5, :cond_6

    .line 191
    .line 192
    iget-object v5, v5, La/fx20;->a:Ljava/util/List;

    .line 193
    .line 194
    new-instance v6, Ljava/util/ArrayList;

    .line 195
    .line 196
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 197
    .line 198
    .line 199
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 200
    .line 201
    .line 202
    move-result-object v5

    .line 203
    :cond_4
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 204
    .line 205
    .line 206
    move-result v8

    .line 207
    if-eqz v8, :cond_5

    .line 208
    .line 209
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v8

    .line 213
    move-object v9, v8

    .line 214
    check-cast v9, La/dx20;

    .line 215
    .line 216
    iget-boolean v9, v9, La/dx20;->d:Z

    .line 217
    .line 218
    if-eqz v9, :cond_4

    .line 219
    .line 220
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    goto :goto_3

    .line 224
    :cond_5
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 225
    .line 226
    .line 227
    move-result v5

    .line 228
    const/4 v6, 0x1

    .line 229
    if-ne v5, v6, :cond_6

    .line 230
    .line 231
    if-eqz v1, :cond_6

    .line 232
    .line 233
    goto/16 :goto_c

    .line 234
    .line 235
    :cond_6
    xor-int/lit8 v16, v1, 0x1

    .line 236
    .line 237
    iget-object v5, v0, La/dy20;->i:La/ctf0;

    .line 238
    .line 239
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v6

    .line 243
    check-cast v6, La/hx20;

    .line 244
    .line 245
    instance-of v8, v6, La/fx20;

    .line 246
    .line 247
    if-eqz v8, :cond_b

    .line 248
    .line 249
    check-cast v6, La/fx20;

    .line 250
    .line 251
    iget-object v6, v6, La/fx20;->a:Ljava/util/List;

    .line 252
    .line 253
    new-instance v8, Ljava/util/ArrayList;

    .line 254
    .line 255
    const/16 v9, 0xa

    .line 256
    .line 257
    invoke-static {v6, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 258
    .line 259
    .line 260
    move-result v9

    .line 261
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 262
    .line 263
    .line 264
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 265
    .line 266
    .line 267
    move-result-object v6

    .line 268
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 269
    .line 270
    .line 271
    move-result v9

    .line 272
    if-eqz v9, :cond_a

    .line 273
    .line 274
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v9

    .line 278
    check-cast v9, La/dx20;

    .line 279
    .line 280
    iget-wide v10, v9, La/dx20;->b:J

    .line 281
    .line 282
    cmp-long v10, v10, v2

    .line 283
    .line 284
    if-nez v10, :cond_9

    .line 285
    .line 286
    const v10, 0x7f0606da

    .line 287
    .line 288
    .line 289
    if-nez v1, :cond_7

    .line 290
    .line 291
    invoke-virtual {v5, v10}, La/ctf0;->a(I)I

    .line 292
    .line 293
    .line 294
    move-result v11

    .line 295
    goto :goto_5

    .line 296
    :cond_7
    const v11, 0x7f040b0b

    .line 297
    .line 298
    .line 299
    invoke-static {v11, v5}, La/ctf0;->b(ILa/ctf0;)I

    .line 300
    .line 301
    .line 302
    move-result v11

    .line 303
    :goto_5
    if-nez v1, :cond_8

    .line 304
    .line 305
    invoke-virtual {v5, v10}, La/ctf0;->a(I)I

    .line 306
    .line 307
    .line 308
    move-result v10

    .line 309
    goto :goto_6

    .line 310
    :cond_8
    const v10, 0x7f040b72

    .line 311
    .line 312
    .line 313
    invoke-static {v10, v5}, La/ctf0;->b(ILa/ctf0;)I

    .line 314
    .line 315
    .line 316
    move-result v10

    .line 317
    :goto_6
    iget-object v14, v9, La/dx20;->a:Ljava/lang/String;

    .line 318
    .line 319
    iget-wide v12, v9, La/dx20;->b:J

    .line 320
    .line 321
    iget-object v15, v9, La/dx20;->c:Ljava/lang/String;

    .line 322
    .line 323
    move/from16 v17, v11

    .line 324
    .line 325
    iget v11, v9, La/dx20;->g:I

    .line 326
    .line 327
    move-object v9, v8

    .line 328
    new-instance v8, La/dx20;

    .line 329
    .line 330
    move-object v7, v9

    .line 331
    move/from16 v9, v17

    .line 332
    .line 333
    invoke-direct/range {v8 .. v16}, La/dx20;-><init>(IIIJLjava/lang/String;Ljava/lang/String;Z)V

    .line 334
    .line 335
    .line 336
    move-object v9, v8

    .line 337
    goto :goto_7

    .line 338
    :cond_9
    move-object v7, v8

    .line 339
    :goto_7
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-object v8, v7

    .line 343
    goto :goto_4

    .line 344
    :cond_a
    move-object v7, v8

    .line 345
    new-instance v1, La/fx20;

    .line 346
    .line 347
    invoke-direct {v1, v7}, La/fx20;-><init>(Ljava/util/List;)V

    .line 348
    .line 349
    .line 350
    const/4 v2, 0x0

    .line 351
    invoke-virtual {v4, v2, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    :cond_b
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    instance-of v2, v1, La/fx20;

    .line 359
    .line 360
    if-eqz v2, :cond_c

    .line 361
    .line 362
    move-object v2, v1

    .line 363
    check-cast v2, La/fx20;

    .line 364
    .line 365
    goto :goto_8

    .line 366
    :cond_c
    const/4 v2, 0x0

    .line 367
    :goto_8
    if-eqz v2, :cond_d

    .line 368
    .line 369
    iget-object v2, v2, La/fx20;->a:Ljava/util/List;

    .line 370
    .line 371
    goto :goto_9

    .line 372
    :cond_d
    const/4 v2, 0x0

    .line 373
    :goto_9
    if-nez v2, :cond_e

    .line 374
    .line 375
    sget-object v2, La/iun;->a:La/iun;

    .line 376
    .line 377
    :cond_e
    iget-object v1, v0, La/dy20;->u:Ljava/util/List;

    .line 378
    .line 379
    new-instance v3, Ljava/util/ArrayList;

    .line 380
    .line 381
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 382
    .line 383
    .line 384
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    :cond_f
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 389
    .line 390
    .line 391
    move-result v4

    .line 392
    if-eqz v4, :cond_12

    .line 393
    .line 394
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v4

    .line 398
    move-object v5, v4

    .line 399
    check-cast v5, La/kx20;

    .line 400
    .line 401
    if-eqz v2, :cond_10

    .line 402
    .line 403
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 404
    .line 405
    .line 406
    move-result v6

    .line 407
    if-eqz v6, :cond_10

    .line 408
    .line 409
    goto :goto_a

    .line 410
    :cond_10
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 411
    .line 412
    .line 413
    move-result-object v6

    .line 414
    :cond_11
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 415
    .line 416
    .line 417
    move-result v7

    .line 418
    if-eqz v7, :cond_f

    .line 419
    .line 420
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v7

    .line 424
    check-cast v7, La/dx20;

    .line 425
    .line 426
    iget-wide v8, v7, La/dx20;->b:J

    .line 427
    .line 428
    iget v10, v5, La/kx20;->a:I

    .line 429
    .line 430
    int-to-long v10, v10

    .line 431
    cmp-long v8, v8, v10

    .line 432
    .line 433
    if-nez v8, :cond_11

    .line 434
    .line 435
    iget-boolean v7, v7, La/dx20;->d:Z

    .line 436
    .line 437
    if-eqz v7, :cond_11

    .line 438
    .line 439
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 440
    .line 441
    .line 442
    goto :goto_a

    .line 443
    :cond_12
    iget-object v1, v0, La/dy20;->v:Ljava/util/List;

    .line 444
    .line 445
    new-instance v4, Ljava/util/ArrayList;

    .line 446
    .line 447
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 448
    .line 449
    .line 450
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 451
    .line 452
    .line 453
    move-result-object v1

    .line 454
    :cond_13
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 455
    .line 456
    .line 457
    move-result v5

    .line 458
    if-eqz v5, :cond_16

    .line 459
    .line 460
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v5

    .line 464
    move-object v6, v5

    .line 465
    check-cast v6, La/lx20;

    .line 466
    .line 467
    if-eqz v2, :cond_14

    .line 468
    .line 469
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 470
    .line 471
    .line 472
    move-result v7

    .line 473
    if-eqz v7, :cond_14

    .line 474
    .line 475
    goto :goto_b

    .line 476
    :cond_14
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 477
    .line 478
    .line 479
    move-result-object v7

    .line 480
    :cond_15
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 481
    .line 482
    .line 483
    move-result v8

    .line 484
    if-eqz v8, :cond_13

    .line 485
    .line 486
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v8

    .line 490
    check-cast v8, La/dx20;

    .line 491
    .line 492
    iget-wide v9, v8, La/dx20;->b:J

    .line 493
    .line 494
    iget-wide v11, v6, La/lx20;->a:J

    .line 495
    .line 496
    cmp-long v9, v9, v11

    .line 497
    .line 498
    if-nez v9, :cond_15

    .line 499
    .line 500
    iget-boolean v8, v8, La/dx20;->d:Z

    .line 501
    .line 502
    if-eqz v8, :cond_15

    .line 503
    .line 504
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 505
    .line 506
    .line 507
    goto :goto_b

    .line 508
    :cond_16
    new-instance v1, La/qx20;

    .line 509
    .line 510
    iget-object v2, v0, La/dy20;->j:La/sqt;

    .line 511
    .line 512
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 513
    .line 514
    .line 515
    invoke-static {v3}, La/sqt;->e(Ljava/util/List;)La/mx20;

    .line 516
    .line 517
    .line 518
    move-result-object v2

    .line 519
    iget-object v3, v0, La/dy20;->c:La/k7u;

    .line 520
    .line 521
    iget-object v3, v3, La/k7u;->a:La/uzc;

    .line 522
    .line 523
    invoke-virtual {v3}, La/uzc;->b()La/jvn;

    .line 524
    .line 525
    .line 526
    move-result-object v3

    .line 527
    invoke-virtual {v3}, La/jvn;->getId()I

    .line 528
    .line 529
    .line 530
    move-result v3

    .line 531
    iget-object v5, v0, La/dy20;->b:Lorg/xplatform/market_statistic/api/presentation/MarketStatisticParams;

    .line 532
    .line 533
    iget-boolean v5, v5, Lorg/xplatform/market_statistic/api/presentation/MarketStatisticParams;->b:Z

    .line 534
    .line 535
    invoke-direct {v1, v2, v4, v3, v5}, La/qx20;-><init>(La/mx20;Ljava/util/List;IZ)V

    .line 536
    .line 537
    .line 538
    iget-object v0, v0, La/dy20;->s:La/p7m0;

    .line 539
    .line 540
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    const/4 v2, 0x0

    .line 544
    invoke-virtual {v0, v2, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 545
    .line 546
    .line 547
    :goto_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 548
    .line 549
    return-object v0

    .line 550
    nop

    .line 551
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
