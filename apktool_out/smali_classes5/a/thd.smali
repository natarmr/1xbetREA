.class public final synthetic La/thd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/thd;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/cp;)V
    .locals 0

    .line 1
    const/16 p1, 0x16

    iput-byte p1, p0, La/thd;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/thd;->a:B

    .line 4
    .line 5
    const/high16 v1, 0x41800000    # 16.0f

    .line 6
    .line 7
    const/high16 v2, 0x41400000    # 12.0f

    .line 8
    .line 9
    const/high16 v3, 0x41000000    # 8.0f

    .line 10
    .line 11
    const-string v4, "rootView"

    .line 12
    .line 13
    const/high16 v5, 0x42400000    # 48.0f

    .line 14
    .line 15
    const/16 v6, 0x10

    .line 16
    .line 17
    const/high16 v7, 0x40800000    # 4.0f

    .line 18
    .line 19
    const/4 v8, 0x0

    .line 20
    const/high16 v9, 0x40000000    # 2.0f

    .line 21
    .line 22
    const/4 v10, 0x1

    .line 23
    const/4 v11, 0x0

    .line 24
    packed-switch v0, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    move-object/from16 v0, p1

    .line 28
    .line 29
    check-cast v0, La/p6t0;

    .line 30
    .line 31
    move-object/from16 v1, p2

    .line 32
    .line 33
    check-cast v1, Ljava/util/List;

    .line 34
    .line 35
    move-object/from16 v2, p3

    .line 36
    .line 37
    check-cast v2, Ljava/lang/Integer;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    instance-of v1, v0, La/a240;

    .line 49
    .line 50
    if-eqz v1, :cond_0

    .line 51
    .line 52
    move-object v8, v0

    .line 53
    check-cast v8, La/a240;

    .line 54
    .line 55
    :cond_0
    if-eqz v8, :cond_1

    .line 56
    .line 57
    iget v0, v8, La/a240;->g:I

    .line 58
    .line 59
    if-nez v0, :cond_1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    move v10, v11

    .line 63
    :goto_0
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    return-object v0

    .line 68
    :pswitch_0
    move-object/from16 v0, p1

    .line 69
    .line 70
    check-cast v0, La/p6t0;

    .line 71
    .line 72
    move-object/from16 v1, p2

    .line 73
    .line 74
    check-cast v1, Ljava/util/List;

    .line 75
    .line 76
    move-object/from16 v2, p3

    .line 77
    .line 78
    check-cast v2, Ljava/lang/Integer;

    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    instance-of v1, v0, La/a240;

    .line 90
    .line 91
    if-eqz v1, :cond_2

    .line 92
    .line 93
    move-object v8, v0

    .line 94
    check-cast v8, La/a240;

    .line 95
    .line 96
    :cond_2
    if-eqz v8, :cond_3

    .line 97
    .line 98
    iget v0, v8, La/a240;->g:I

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_3
    move v0, v11

    .line 102
    :goto_1
    if-lez v0, :cond_4

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_4
    move v10, v11

    .line 106
    :goto_2
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    return-object v0

    .line 111
    :pswitch_1
    move-object/from16 v0, p1

    .line 112
    .line 113
    check-cast v0, La/p6t0;

    .line 114
    .line 115
    move-object/from16 v1, p2

    .line 116
    .line 117
    check-cast v1, Ljava/util/List;

    .line 118
    .line 119
    move-object/from16 v2, p3

    .line 120
    .line 121
    check-cast v2, Ljava/lang/Integer;

    .line 122
    .line 123
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    instance-of v1, v0, La/cax;

    .line 133
    .line 134
    if-eqz v1, :cond_5

    .line 135
    .line 136
    check-cast v0, La/cax;

    .line 137
    .line 138
    iget-object v0, v0, La/cax;->d:La/l9x;

    .line 139
    .line 140
    sget-object v1, La/l9x;->c:La/l9x;

    .line 141
    .line 142
    if-ne v0, v1, :cond_5

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_5
    move v10, v11

    .line 146
    :goto_3
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    return-object v0

    .line 151
    :pswitch_2
    move-object/from16 v0, p1

    .line 152
    .line 153
    check-cast v0, La/p6t0;

    .line 154
    .line 155
    move-object/from16 v1, p2

    .line 156
    .line 157
    check-cast v1, Ljava/util/List;

    .line 158
    .line 159
    move-object/from16 v2, p3

    .line 160
    .line 161
    check-cast v2, Ljava/lang/Integer;

    .line 162
    .line 163
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    instance-of v1, v0, La/cax;

    .line 173
    .line 174
    if-eqz v1, :cond_6

    .line 175
    .line 176
    check-cast v0, La/cax;

    .line 177
    .line 178
    iget-object v0, v0, La/cax;->d:La/l9x;

    .line 179
    .line 180
    sget-object v1, La/l9x;->b:La/l9x;

    .line 181
    .line 182
    if-ne v0, v1, :cond_6

    .line 183
    .line 184
    goto :goto_4

    .line 185
    :cond_6
    move v10, v11

    .line 186
    :goto_4
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    return-object v0

    .line 191
    :pswitch_3
    move-object/from16 v0, p1

    .line 192
    .line 193
    check-cast v0, Ljava/lang/Integer;

    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    move-object/from16 v0, p2

    .line 199
    .line 200
    check-cast v0, Ljava/lang/Boolean;

    .line 201
    .line 202
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    move-object/from16 v0, p3

    .line 206
    .line 207
    check-cast v0, Ljava/lang/Boolean;

    .line 208
    .line 209
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 213
    .line 214
    return-object v0

    .line 215
    :pswitch_4
    move-object/from16 v0, p1

    .line 216
    .line 217
    check-cast v0, La/tcz;

    .line 218
    .line 219
    move-object/from16 v1, p2

    .line 220
    .line 221
    check-cast v1, Ljava/lang/Integer;

    .line 222
    .line 223
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    move-object/from16 v2, p3

    .line 228
    .line 229
    check-cast v2, Ljava/lang/Integer;

    .line 230
    .line 231
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 232
    .line 233
    .line 234
    move-result v2

    .line 235
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    add-int/lit8 v0, v1, -0x1

    .line 239
    .line 240
    add-int/2addr v1, v10

    .line 241
    invoke-static {v2, v0, v1}, La/l1e0;->d(III)I

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    return-object v0

    .line 250
    :pswitch_5
    move-object/from16 v0, p1

    .line 251
    .line 252
    check-cast v0, La/tcz;

    .line 253
    .line 254
    move-object/from16 v1, p2

    .line 255
    .line 256
    check-cast v1, Ljava/lang/Integer;

    .line 257
    .line 258
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    move-object/from16 v2, p3

    .line 263
    .line 264
    check-cast v2, Ljava/lang/Integer;

    .line 265
    .line 266
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 267
    .line 268
    .line 269
    move-result v2

    .line 270
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    add-int/lit8 v0, v1, -0x1

    .line 274
    .line 275
    add-int/2addr v1, v10

    .line 276
    invoke-static {v2, v0, v1}, La/l1e0;->d(III)I

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    return-object v0

    .line 285
    :pswitch_6
    move-object/from16 v0, p1

    .line 286
    .line 287
    check-cast v0, Landroid/view/View;

    .line 288
    .line 289
    move-object/from16 v1, p2

    .line 290
    .line 291
    check-cast v1, Ljava/lang/Integer;

    .line 292
    .line 293
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    move-object/from16 v1, p3

    .line 297
    .line 298
    check-cast v1, Ljava/lang/Boolean;

    .line 299
    .line 300
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 307
    .line 308
    return-object v0

    .line 309
    :pswitch_7
    move-object/from16 v0, p1

    .line 310
    .line 311
    check-cast v0, La/vj30;

    .line 312
    .line 313
    move-object/from16 v1, p2

    .line 314
    .line 315
    check-cast v1, La/pj30;

    .line 316
    .line 317
    move-object/from16 v2, p3

    .line 318
    .line 319
    check-cast v2, La/p4e;

    .line 320
    .line 321
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    iget-wide v2, v2, La/p4e;->a:J

    .line 328
    .line 329
    invoke-interface {v1, v2, v3}, La/pj30;->S(J)La/pu90;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    iget v2, v1, La/pu90;->b:I

    .line 334
    .line 335
    const/high16 v3, 0x42000000    # 32.0f

    .line 336
    .line 337
    invoke-interface {v0, v3}, La/w6k;->T(F)I

    .line 338
    .line 339
    .line 340
    move-result v3

    .line 341
    sub-int/2addr v2, v3

    .line 342
    if-gez v2, :cond_7

    .line 343
    .line 344
    goto :goto_5

    .line 345
    :cond_7
    move v11, v2

    .line 346
    :goto_5
    iget v2, v1, La/pu90;->a:I

    .line 347
    .line 348
    new-instance v3, La/cam;

    .line 349
    .line 350
    const/4 v4, 0x5

    .line 351
    invoke-direct {v3, v1, v4}, La/cam;-><init>(La/pu90;B)V

    .line 352
    .line 353
    .line 354
    invoke-static {v0, v2, v11, v3}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    return-object v0

    .line 359
    :pswitch_8
    move-object/from16 v0, p1

    .line 360
    .line 361
    check-cast v0, Landroid/view/LayoutInflater;

    .line 362
    .line 363
    move-object/from16 v1, p2

    .line 364
    .line 365
    check-cast v1, Landroid/view/ViewGroup;

    .line 366
    .line 367
    move-object/from16 v2, p3

    .line 368
    .line 369
    check-cast v2, Ljava/lang/Boolean;

    .line 370
    .line 371
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 372
    .line 373
    .line 374
    move-result v2

    .line 375
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 379
    .line 380
    .line 381
    const v3, 0x7f0d05bd

    .line 382
    .line 383
    .line 384
    invoke-virtual {v0, v3, v1, v11}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    if-eqz v2, :cond_8

    .line 389
    .line 390
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 391
    .line 392
    .line 393
    :cond_8
    if-eqz v0, :cond_9

    .line 394
    .line 395
    check-cast v0, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;

    .line 396
    .line 397
    new-instance v8, La/h1o0;

    .line 398
    .line 399
    invoke-direct {v8, v0, v0}, La/h1o0;-><init>(Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v0, v11}, Landroid/view/View;->setLayoutDirection(I)V

    .line 403
    .line 404
    .line 405
    goto :goto_6

    .line 406
    :cond_9
    invoke-static {v4}, La/hny;->u(Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    :goto_6
    return-object v8

    .line 410
    :pswitch_9
    move-object/from16 v0, p1

    .line 411
    .line 412
    check-cast v0, Landroid/view/LayoutInflater;

    .line 413
    .line 414
    move-object/from16 v1, p2

    .line 415
    .line 416
    check-cast v1, Landroid/view/ViewGroup;

    .line 417
    .line 418
    move-object/from16 v2, p3

    .line 419
    .line 420
    check-cast v2, Ljava/lang/Boolean;

    .line 421
    .line 422
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 423
    .line 424
    .line 425
    move-result v2

    .line 426
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 430
    .line 431
    .line 432
    const v3, 0x7f0d05b2

    .line 433
    .line 434
    .line 435
    invoke-virtual {v0, v3, v1, v11}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    if-eqz v2, :cond_a

    .line 440
    .line 441
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 442
    .line 443
    .line 444
    :cond_a
    if-eqz v0, :cond_b

    .line 445
    .line 446
    check-cast v0, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;

    .line 447
    .line 448
    new-instance v8, La/y0o0;

    .line 449
    .line 450
    invoke-direct {v8, v0, v0}, La/y0o0;-><init>(Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v0, v11}, Landroid/view/View;->setLayoutDirection(I)V

    .line 454
    .line 455
    .line 456
    goto :goto_7

    .line 457
    :cond_b
    invoke-static {v4}, La/hny;->u(Ljava/lang/String;)V

    .line 458
    .line 459
    .line 460
    :goto_7
    return-object v8

    .line 461
    :pswitch_a
    move-object/from16 v0, p1

    .line 462
    .line 463
    check-cast v0, La/vj30;

    .line 464
    .line 465
    move-object/from16 v1, p2

    .line 466
    .line 467
    check-cast v1, La/pj30;

    .line 468
    .line 469
    move-object/from16 v2, p3

    .line 470
    .line 471
    check-cast v2, La/p4e;

    .line 472
    .line 473
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 477
    .line 478
    .line 479
    iget-wide v2, v2, La/p4e;->a:J

    .line 480
    .line 481
    invoke-interface {v1, v2, v3}, La/pj30;->S(J)La/pu90;

    .line 482
    .line 483
    .line 484
    move-result-object v1

    .line 485
    const/high16 v2, 0x40400000    # 3.0f

    .line 486
    .line 487
    invoke-interface {v0, v2}, La/w6k;->T(F)I

    .line 488
    .line 489
    .line 490
    move-result v2

    .line 491
    iget v3, v1, La/pu90;->a:I

    .line 492
    .line 493
    iget v4, v1, La/pu90;->b:I

    .line 494
    .line 495
    new-instance v5, La/n7;

    .line 496
    .line 497
    const/16 v6, 0xc

    .line 498
    .line 499
    invoke-direct {v5, v1, v2, v6}, La/n7;-><init>(La/pu90;IB)V

    .line 500
    .line 501
    .line 502
    invoke-static {v0, v3, v4, v5}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    return-object v0

    .line 507
    :pswitch_b
    move-object/from16 v0, p1

    .line 508
    .line 509
    check-cast v0, La/vj30;

    .line 510
    .line 511
    move-object/from16 v1, p2

    .line 512
    .line 513
    check-cast v1, La/pj30;

    .line 514
    .line 515
    move-object/from16 v2, p3

    .line 516
    .line 517
    check-cast v2, La/p4e;

    .line 518
    .line 519
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 520
    .line 521
    .line 522
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 523
    .line 524
    .line 525
    iget-wide v3, v2, La/p4e;->a:J

    .line 526
    .line 527
    invoke-static {v3, v4}, La/p4e;->i(J)I

    .line 528
    .line 529
    .line 530
    move-result v3

    .line 531
    invoke-interface {v0, v3}, La/w6k;->r0(I)F

    .line 532
    .line 533
    .line 534
    move-result v3

    .line 535
    sget-object v4, La/qmk;->a:La/zcl;

    .line 536
    .line 537
    invoke-static {v3, v7, v9, v7}, La/rw2;->z(FFFF)F

    .line 538
    .line 539
    .line 540
    move-result v3

    .line 541
    iget-wide v4, v2, La/p4e;->a:J

    .line 542
    .line 543
    invoke-interface {v0, v3}, La/w6k;->T(F)I

    .line 544
    .line 545
    .line 546
    move-result v8

    .line 547
    invoke-interface {v0, v3}, La/w6k;->T(F)I

    .line 548
    .line 549
    .line 550
    move-result v9

    .line 551
    const/4 v10, 0x3

    .line 552
    const/4 v6, 0x0

    .line 553
    const/4 v7, 0x0

    .line 554
    invoke-static/range {v4 .. v10}, La/p4e;->b(JIIIII)J

    .line 555
    .line 556
    .line 557
    move-result-wide v2

    .line 558
    invoke-interface {v1, v2, v3}, La/pj30;->S(J)La/pu90;

    .line 559
    .line 560
    .line 561
    move-result-object v1

    .line 562
    iget v2, v1, La/pu90;->a:I

    .line 563
    .line 564
    iget v3, v1, La/pu90;->b:I

    .line 565
    .line 566
    new-instance v4, La/y1;

    .line 567
    .line 568
    const/16 v5, 0x1c

    .line 569
    .line 570
    invoke-direct {v4, v1, v5}, La/y1;-><init>(La/pu90;B)V

    .line 571
    .line 572
    .line 573
    invoke-static {v0, v2, v3, v4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 574
    .line 575
    .line 576
    move-result-object v0

    .line 577
    return-object v0

    .line 578
    :pswitch_c
    move-object/from16 v0, p1

    .line 579
    .line 580
    check-cast v0, La/vj30;

    .line 581
    .line 582
    move-object/from16 v1, p2

    .line 583
    .line 584
    check-cast v1, La/pj30;

    .line 585
    .line 586
    move-object/from16 v2, p3

    .line 587
    .line 588
    check-cast v2, La/p4e;

    .line 589
    .line 590
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 591
    .line 592
    .line 593
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 594
    .line 595
    .line 596
    iget-wide v3, v2, La/p4e;->a:J

    .line 597
    .line 598
    invoke-static {v3, v4}, La/p4e;->i(J)I

    .line 599
    .line 600
    .line 601
    move-result v3

    .line 602
    invoke-interface {v0, v3}, La/w6k;->r0(I)F

    .line 603
    .line 604
    .line 605
    move-result v3

    .line 606
    sget-object v4, La/qmk;->a:La/zcl;

    .line 607
    .line 608
    const/high16 v4, 0x42880000    # 68.0f

    .line 609
    .line 610
    sub-float/2addr v3, v4

    .line 611
    sub-float/2addr v3, v7

    .line 612
    div-float/2addr v3, v9

    .line 613
    add-float/2addr v3, v7

    .line 614
    iget-wide v4, v2, La/p4e;->a:J

    .line 615
    .line 616
    invoke-interface {v0, v3}, La/w6k;->T(F)I

    .line 617
    .line 618
    .line 619
    move-result v8

    .line 620
    invoke-interface {v0, v3}, La/w6k;->T(F)I

    .line 621
    .line 622
    .line 623
    move-result v9

    .line 624
    const/4 v10, 0x3

    .line 625
    const/4 v6, 0x0

    .line 626
    const/4 v7, 0x0

    .line 627
    invoke-static/range {v4 .. v10}, La/p4e;->b(JIIIII)J

    .line 628
    .line 629
    .line 630
    move-result-wide v2

    .line 631
    invoke-interface {v1, v2, v3}, La/pj30;->S(J)La/pu90;

    .line 632
    .line 633
    .line 634
    move-result-object v1

    .line 635
    iget v2, v1, La/pu90;->a:I

    .line 636
    .line 637
    iget v3, v1, La/pu90;->b:I

    .line 638
    .line 639
    new-instance v4, La/y1;

    .line 640
    .line 641
    const/16 v5, 0x1b

    .line 642
    .line 643
    invoke-direct {v4, v1, v5}, La/y1;-><init>(La/pu90;B)V

    .line 644
    .line 645
    .line 646
    invoke-static {v0, v2, v3, v4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    return-object v0

    .line 651
    :pswitch_d
    move-object/from16 v0, p1

    .line 652
    .line 653
    check-cast v0, La/vj30;

    .line 654
    .line 655
    move-object/from16 v1, p2

    .line 656
    .line 657
    check-cast v1, La/pj30;

    .line 658
    .line 659
    move-object/from16 v2, p3

    .line 660
    .line 661
    check-cast v2, La/p4e;

    .line 662
    .line 663
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 664
    .line 665
    .line 666
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 667
    .line 668
    .line 669
    iget-wide v3, v2, La/p4e;->a:J

    .line 670
    .line 671
    invoke-static {v3, v4}, La/p4e;->i(J)I

    .line 672
    .line 673
    .line 674
    move-result v3

    .line 675
    invoke-interface {v0, v3}, La/w6k;->r0(I)F

    .line 676
    .line 677
    .line 678
    move-result v3

    .line 679
    sget-object v4, La/qmk;->a:La/zcl;

    .line 680
    .line 681
    sub-float/2addr v3, v5

    .line 682
    sub-float/2addr v3, v7

    .line 683
    div-float/2addr v3, v9

    .line 684
    add-float/2addr v3, v7

    .line 685
    iget-wide v4, v2, La/p4e;->a:J

    .line 686
    .line 687
    invoke-interface {v0, v3}, La/w6k;->T(F)I

    .line 688
    .line 689
    .line 690
    move-result v8

    .line 691
    invoke-interface {v0, v3}, La/w6k;->T(F)I

    .line 692
    .line 693
    .line 694
    move-result v9

    .line 695
    const/4 v10, 0x3

    .line 696
    const/4 v6, 0x0

    .line 697
    const/4 v7, 0x0

    .line 698
    invoke-static/range {v4 .. v10}, La/p4e;->b(JIIIII)J

    .line 699
    .line 700
    .line 701
    move-result-wide v2

    .line 702
    invoke-interface {v1, v2, v3}, La/pj30;->S(J)La/pu90;

    .line 703
    .line 704
    .line 705
    move-result-object v1

    .line 706
    iget v2, v1, La/pu90;->a:I

    .line 707
    .line 708
    iget v3, v1, La/pu90;->b:I

    .line 709
    .line 710
    new-instance v4, La/y1;

    .line 711
    .line 712
    const/16 v5, 0x1a

    .line 713
    .line 714
    invoke-direct {v4, v1, v5}, La/y1;-><init>(La/pu90;B)V

    .line 715
    .line 716
    .line 717
    invoke-static {v0, v2, v3, v4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 718
    .line 719
    .line 720
    move-result-object v0

    .line 721
    return-object v0

    .line 722
    :pswitch_e
    move-object/from16 v0, p1

    .line 723
    .line 724
    check-cast v0, La/vj30;

    .line 725
    .line 726
    move-object/from16 v1, p2

    .line 727
    .line 728
    check-cast v1, La/pj30;

    .line 729
    .line 730
    move-object/from16 v4, p3

    .line 731
    .line 732
    check-cast v4, La/p4e;

    .line 733
    .line 734
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 735
    .line 736
    .line 737
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 738
    .line 739
    .line 740
    iget-wide v5, v4, La/p4e;->a:J

    .line 741
    .line 742
    invoke-static {v5, v6}, La/p4e;->i(J)I

    .line 743
    .line 744
    .line 745
    move-result v5

    .line 746
    invoke-interface {v0, v5}, La/w6k;->r0(I)F

    .line 747
    .line 748
    .line 749
    move-result v5

    .line 750
    sget-object v6, La/qmk;->a:La/zcl;

    .line 751
    .line 752
    sub-float/2addr v5, v3

    .line 753
    div-float/2addr v5, v9

    .line 754
    add-float/2addr v5, v2

    .line 755
    const/high16 v2, 0x42200000    # 40.0f

    .line 756
    .line 757
    add-float/2addr v5, v2

    .line 758
    iget-wide v6, v4, La/p4e;->a:J

    .line 759
    .line 760
    invoke-interface {v0, v5}, La/w6k;->T(F)I

    .line 761
    .line 762
    .line 763
    move-result v10

    .line 764
    invoke-interface {v0, v5}, La/w6k;->T(F)I

    .line 765
    .line 766
    .line 767
    move-result v11

    .line 768
    const/4 v12, 0x3

    .line 769
    const/4 v8, 0x0

    .line 770
    const/4 v9, 0x0

    .line 771
    invoke-static/range {v6 .. v12}, La/p4e;->b(JIIIII)J

    .line 772
    .line 773
    .line 774
    move-result-wide v2

    .line 775
    invoke-interface {v1, v2, v3}, La/pj30;->S(J)La/pu90;

    .line 776
    .line 777
    .line 778
    move-result-object v1

    .line 779
    iget v2, v1, La/pu90;->a:I

    .line 780
    .line 781
    iget v3, v1, La/pu90;->b:I

    .line 782
    .line 783
    new-instance v4, La/y1;

    .line 784
    .line 785
    const/16 v5, 0x19

    .line 786
    .line 787
    invoke-direct {v4, v1, v5}, La/y1;-><init>(La/pu90;B)V

    .line 788
    .line 789
    .line 790
    invoke-static {v0, v2, v3, v4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 791
    .line 792
    .line 793
    move-result-object v0

    .line 794
    return-object v0

    .line 795
    :pswitch_f
    move-object/from16 v0, p1

    .line 796
    .line 797
    check-cast v0, La/vj30;

    .line 798
    .line 799
    move-object/from16 v1, p2

    .line 800
    .line 801
    check-cast v1, La/pj30;

    .line 802
    .line 803
    move-object/from16 v2, p3

    .line 804
    .line 805
    check-cast v2, La/p4e;

    .line 806
    .line 807
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 808
    .line 809
    .line 810
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 811
    .line 812
    .line 813
    iget-wide v10, v2, La/p4e;->a:J

    .line 814
    .line 815
    invoke-static {v10, v11}, La/p4e;->i(J)I

    .line 816
    .line 817
    .line 818
    move-result v4

    .line 819
    invoke-interface {v0, v4}, La/w6k;->r0(I)F

    .line 820
    .line 821
    .line 822
    move-result v4

    .line 823
    sget-object v6, La/qmk;->a:La/zcl;

    .line 824
    .line 825
    sub-float/2addr v4, v3

    .line 826
    div-float/2addr v4, v9

    .line 827
    add-float/2addr v4, v7

    .line 828
    add-float/2addr v4, v5

    .line 829
    iget-wide v5, v2, La/p4e;->a:J

    .line 830
    .line 831
    invoke-interface {v0, v4}, La/w6k;->T(F)I

    .line 832
    .line 833
    .line 834
    move-result v9

    .line 835
    invoke-interface {v0, v4}, La/w6k;->T(F)I

    .line 836
    .line 837
    .line 838
    move-result v10

    .line 839
    const/4 v11, 0x3

    .line 840
    const/4 v7, 0x0

    .line 841
    const/4 v8, 0x0

    .line 842
    invoke-static/range {v5 .. v11}, La/p4e;->b(JIIIII)J

    .line 843
    .line 844
    .line 845
    move-result-wide v2

    .line 846
    invoke-interface {v1, v2, v3}, La/pj30;->S(J)La/pu90;

    .line 847
    .line 848
    .line 849
    move-result-object v1

    .line 850
    iget v2, v1, La/pu90;->a:I

    .line 851
    .line 852
    iget v3, v1, La/pu90;->b:I

    .line 853
    .line 854
    new-instance v4, La/y1;

    .line 855
    .line 856
    const/16 v5, 0x18

    .line 857
    .line 858
    invoke-direct {v4, v1, v5}, La/y1;-><init>(La/pu90;B)V

    .line 859
    .line 860
    .line 861
    invoke-static {v0, v2, v3, v4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 862
    .line 863
    .line 864
    move-result-object v0

    .line 865
    return-object v0

    .line 866
    :pswitch_10
    move-object/from16 v0, p1

    .line 867
    .line 868
    check-cast v0, La/vj30;

    .line 869
    .line 870
    move-object/from16 v2, p2

    .line 871
    .line 872
    check-cast v2, La/pj30;

    .line 873
    .line 874
    move-object/from16 v3, p3

    .line 875
    .line 876
    check-cast v3, La/p4e;

    .line 877
    .line 878
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 879
    .line 880
    .line 881
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 882
    .line 883
    .line 884
    iget-wide v4, v3, La/p4e;->a:J

    .line 885
    .line 886
    invoke-static {v4, v5}, La/p4e;->i(J)I

    .line 887
    .line 888
    .line 889
    move-result v4

    .line 890
    invoke-interface {v0, v4}, La/w6k;->r0(I)F

    .line 891
    .line 892
    .line 893
    move-result v4

    .line 894
    sget-object v5, La/qmk;->a:La/zcl;

    .line 895
    .line 896
    invoke-static {v4, v1, v9, v1}, La/rw2;->z(FFFF)F

    .line 897
    .line 898
    .line 899
    move-result v1

    .line 900
    iget-wide v4, v3, La/p4e;->a:J

    .line 901
    .line 902
    invoke-interface {v0, v1}, La/w6k;->T(F)I

    .line 903
    .line 904
    .line 905
    move-result v8

    .line 906
    invoke-interface {v0, v1}, La/w6k;->T(F)I

    .line 907
    .line 908
    .line 909
    move-result v9

    .line 910
    const/4 v10, 0x3

    .line 911
    const/4 v6, 0x0

    .line 912
    const/4 v7, 0x0

    .line 913
    invoke-static/range {v4 .. v10}, La/p4e;->b(JIIIII)J

    .line 914
    .line 915
    .line 916
    move-result-wide v3

    .line 917
    invoke-interface {v2, v3, v4}, La/pj30;->S(J)La/pu90;

    .line 918
    .line 919
    .line 920
    move-result-object v1

    .line 921
    iget v2, v1, La/pu90;->a:I

    .line 922
    .line 923
    iget v3, v1, La/pu90;->b:I

    .line 924
    .line 925
    new-instance v4, La/y1;

    .line 926
    .line 927
    const/16 v5, 0x17

    .line 928
    .line 929
    invoke-direct {v4, v1, v5}, La/y1;-><init>(La/pu90;B)V

    .line 930
    .line 931
    .line 932
    invoke-static {v0, v2, v3, v4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 933
    .line 934
    .line 935
    move-result-object v0

    .line 936
    return-object v0

    .line 937
    :pswitch_11
    move-object/from16 v0, p1

    .line 938
    .line 939
    check-cast v0, La/vj30;

    .line 940
    .line 941
    move-object/from16 v3, p2

    .line 942
    .line 943
    check-cast v3, La/pj30;

    .line 944
    .line 945
    move-object/from16 v4, p3

    .line 946
    .line 947
    check-cast v4, La/p4e;

    .line 948
    .line 949
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 950
    .line 951
    .line 952
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 953
    .line 954
    .line 955
    iget-wide v6, v4, La/p4e;->a:J

    .line 956
    .line 957
    invoke-static {v6, v7}, La/p4e;->i(J)I

    .line 958
    .line 959
    .line 960
    move-result v6

    .line 961
    invoke-interface {v0, v6}, La/w6k;->r0(I)F

    .line 962
    .line 963
    .line 964
    move-result v6

    .line 965
    sget-object v7, La/qmk;->a:La/zcl;

    .line 966
    .line 967
    sub-float/2addr v6, v1

    .line 968
    div-float/2addr v6, v9

    .line 969
    add-float/2addr v6, v2

    .line 970
    add-float/2addr v6, v5

    .line 971
    iget-wide v7, v4, La/p4e;->a:J

    .line 972
    .line 973
    invoke-interface {v0, v6}, La/w6k;->T(F)I

    .line 974
    .line 975
    .line 976
    move-result v11

    .line 977
    invoke-interface {v0, v6}, La/w6k;->T(F)I

    .line 978
    .line 979
    .line 980
    move-result v12

    .line 981
    const/4 v13, 0x3

    .line 982
    const/4 v9, 0x0

    .line 983
    const/4 v10, 0x0

    .line 984
    invoke-static/range {v7 .. v13}, La/p4e;->b(JIIIII)J

    .line 985
    .line 986
    .line 987
    move-result-wide v1

    .line 988
    invoke-interface {v3, v1, v2}, La/pj30;->S(J)La/pu90;

    .line 989
    .line 990
    .line 991
    move-result-object v1

    .line 992
    iget v2, v1, La/pu90;->a:I

    .line 993
    .line 994
    iget v3, v1, La/pu90;->b:I

    .line 995
    .line 996
    new-instance v4, La/y1;

    .line 997
    .line 998
    const/16 v5, 0x16

    .line 999
    .line 1000
    invoke-direct {v4, v1, v5}, La/y1;-><init>(La/pu90;B)V

    .line 1001
    .line 1002
    .line 1003
    invoke-static {v0, v2, v3, v4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v0

    .line 1007
    return-object v0

    .line 1008
    :pswitch_12
    move-object/from16 v0, p1

    .line 1009
    .line 1010
    check-cast v0, Ljava/lang/Integer;

    .line 1011
    .line 1012
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1013
    .line 1014
    .line 1015
    move-object/from16 v0, p2

    .line 1016
    .line 1017
    check-cast v0, Ljava/lang/Integer;

    .line 1018
    .line 1019
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1020
    .line 1021
    .line 1022
    move-object/from16 v0, p3

    .line 1023
    .line 1024
    check-cast v0, Ljava/lang/Integer;

    .line 1025
    .line 1026
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1027
    .line 1028
    .line 1029
    sget-object v0, La/bej;->i2:La/qud;

    .line 1030
    .line 1031
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1032
    .line 1033
    return-object v0

    .line 1034
    :pswitch_13
    move-object/from16 v0, p1

    .line 1035
    .line 1036
    check-cast v0, La/vj30;

    .line 1037
    .line 1038
    move-object/from16 v1, p2

    .line 1039
    .line 1040
    check-cast v1, La/pj30;

    .line 1041
    .line 1042
    move-object/from16 v2, p3

    .line 1043
    .line 1044
    check-cast v2, La/p4e;

    .line 1045
    .line 1046
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1047
    .line 1048
    .line 1049
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1050
    .line 1051
    .line 1052
    iget-wide v2, v2, La/p4e;->a:J

    .line 1053
    .line 1054
    invoke-interface {v1, v2, v3}, La/pj30;->S(J)La/pu90;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v1

    .line 1058
    invoke-interface {v0, v9}, La/w6k;->T(F)I

    .line 1059
    .line 1060
    .line 1061
    move-result v2

    .line 1062
    iget v3, v1, La/pu90;->a:I

    .line 1063
    .line 1064
    iget v4, v1, La/pu90;->b:I

    .line 1065
    .line 1066
    new-instance v5, La/n7;

    .line 1067
    .line 1068
    const/16 v6, 0xa

    .line 1069
    .line 1070
    invoke-direct {v5, v1, v2, v6}, La/n7;-><init>(La/pu90;IB)V

    .line 1071
    .line 1072
    .line 1073
    invoke-static {v0, v3, v4, v5}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v0

    .line 1077
    return-object v0

    .line 1078
    :pswitch_14
    move-object/from16 v0, p1

    .line 1079
    .line 1080
    check-cast v0, La/vj30;

    .line 1081
    .line 1082
    move-object/from16 v1, p2

    .line 1083
    .line 1084
    check-cast v1, La/pj30;

    .line 1085
    .line 1086
    move-object/from16 v2, p3

    .line 1087
    .line 1088
    check-cast v2, La/p4e;

    .line 1089
    .line 1090
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1091
    .line 1092
    .line 1093
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1094
    .line 1095
    .line 1096
    iget-wide v3, v2, La/p4e;->a:J

    .line 1097
    .line 1098
    invoke-static {v3, v4}, La/p4e;->i(J)I

    .line 1099
    .line 1100
    .line 1101
    move-result v2

    .line 1102
    div-int/lit8 v6, v2, 0x2

    .line 1103
    .line 1104
    const/4 v8, 0x0

    .line 1105
    const/16 v9, 0xd

    .line 1106
    .line 1107
    const/4 v5, 0x0

    .line 1108
    const/4 v7, 0x0

    .line 1109
    invoke-static/range {v3 .. v9}, La/p4e;->b(JIIIII)J

    .line 1110
    .line 1111
    .line 1112
    move-result-wide v2

    .line 1113
    invoke-interface {v1, v2, v3}, La/pj30;->S(J)La/pu90;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v1

    .line 1117
    iget v2, v1, La/pu90;->a:I

    .line 1118
    .line 1119
    iget v3, v1, La/pu90;->b:I

    .line 1120
    .line 1121
    new-instance v4, La/y1;

    .line 1122
    .line 1123
    const/16 v5, 0x14

    .line 1124
    .line 1125
    invoke-direct {v4, v1, v5}, La/y1;-><init>(La/pu90;B)V

    .line 1126
    .line 1127
    .line 1128
    invoke-static {v0, v2, v3, v4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v0

    .line 1132
    return-object v0

    .line 1133
    :pswitch_15
    move-object/from16 v0, p1

    .line 1134
    .line 1135
    check-cast v0, La/vj30;

    .line 1136
    .line 1137
    move-object/from16 v1, p2

    .line 1138
    .line 1139
    check-cast v1, La/pj30;

    .line 1140
    .line 1141
    move-object/from16 v2, p3

    .line 1142
    .line 1143
    check-cast v2, La/p4e;

    .line 1144
    .line 1145
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1146
    .line 1147
    .line 1148
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1149
    .line 1150
    .line 1151
    iget-wide v3, v2, La/p4e;->a:J

    .line 1152
    .line 1153
    invoke-static {v3, v4}, La/p4e;->i(J)I

    .line 1154
    .line 1155
    .line 1156
    move-result v2

    .line 1157
    div-int/lit8 v6, v2, 0x2

    .line 1158
    .line 1159
    const/4 v8, 0x0

    .line 1160
    const/16 v9, 0xd

    .line 1161
    .line 1162
    const/4 v5, 0x0

    .line 1163
    const/4 v7, 0x0

    .line 1164
    invoke-static/range {v3 .. v9}, La/p4e;->b(JIIIII)J

    .line 1165
    .line 1166
    .line 1167
    move-result-wide v2

    .line 1168
    invoke-interface {v1, v2, v3}, La/pj30;->S(J)La/pu90;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v1

    .line 1172
    iget v2, v1, La/pu90;->a:I

    .line 1173
    .line 1174
    iget v3, v1, La/pu90;->b:I

    .line 1175
    .line 1176
    new-instance v4, La/y1;

    .line 1177
    .line 1178
    const/16 v5, 0x13

    .line 1179
    .line 1180
    invoke-direct {v4, v1, v5}, La/y1;-><init>(La/pu90;B)V

    .line 1181
    .line 1182
    .line 1183
    invoke-static {v0, v2, v3, v4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v0

    .line 1187
    return-object v0

    .line 1188
    :pswitch_16
    move-object/from16 v0, p1

    .line 1189
    .line 1190
    check-cast v0, La/vj30;

    .line 1191
    .line 1192
    move-object/from16 v1, p2

    .line 1193
    .line 1194
    check-cast v1, La/pj30;

    .line 1195
    .line 1196
    move-object/from16 v2, p3

    .line 1197
    .line 1198
    check-cast v2, La/p4e;

    .line 1199
    .line 1200
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1201
    .line 1202
    .line 1203
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1204
    .line 1205
    .line 1206
    iget-wide v3, v2, La/p4e;->a:J

    .line 1207
    .line 1208
    invoke-static {v3, v4}, La/p4e;->i(J)I

    .line 1209
    .line 1210
    .line 1211
    move-result v2

    .line 1212
    div-int/lit8 v6, v2, 0x2

    .line 1213
    .line 1214
    const/4 v8, 0x0

    .line 1215
    const/16 v9, 0xd

    .line 1216
    .line 1217
    const/4 v5, 0x0

    .line 1218
    const/4 v7, 0x0

    .line 1219
    invoke-static/range {v3 .. v9}, La/p4e;->b(JIIIII)J

    .line 1220
    .line 1221
    .line 1222
    move-result-wide v2

    .line 1223
    invoke-interface {v1, v2, v3}, La/pj30;->S(J)La/pu90;

    .line 1224
    .line 1225
    .line 1226
    move-result-object v1

    .line 1227
    iget v2, v1, La/pu90;->a:I

    .line 1228
    .line 1229
    iget v3, v1, La/pu90;->b:I

    .line 1230
    .line 1231
    new-instance v4, La/y1;

    .line 1232
    .line 1233
    const/16 v5, 0x12

    .line 1234
    .line 1235
    invoke-direct {v4, v1, v5}, La/y1;-><init>(La/pu90;B)V

    .line 1236
    .line 1237
    .line 1238
    invoke-static {v0, v2, v3, v4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v0

    .line 1242
    return-object v0

    .line 1243
    :pswitch_17
    move-object/from16 v0, p1

    .line 1244
    .line 1245
    check-cast v0, La/vj30;

    .line 1246
    .line 1247
    move-object/from16 v1, p2

    .line 1248
    .line 1249
    check-cast v1, La/pj30;

    .line 1250
    .line 1251
    move-object/from16 v2, p3

    .line 1252
    .line 1253
    check-cast v2, La/p4e;

    .line 1254
    .line 1255
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1256
    .line 1257
    .line 1258
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1259
    .line 1260
    .line 1261
    iget-wide v3, v2, La/p4e;->a:J

    .line 1262
    .line 1263
    invoke-static {v3, v4}, La/p4e;->i(J)I

    .line 1264
    .line 1265
    .line 1266
    move-result v2

    .line 1267
    div-int/lit8 v6, v2, 0x2

    .line 1268
    .line 1269
    const/4 v8, 0x0

    .line 1270
    const/16 v9, 0xd

    .line 1271
    .line 1272
    const/4 v5, 0x0

    .line 1273
    const/4 v7, 0x0

    .line 1274
    invoke-static/range {v3 .. v9}, La/p4e;->b(JIIIII)J

    .line 1275
    .line 1276
    .line 1277
    move-result-wide v2

    .line 1278
    invoke-interface {v1, v2, v3}, La/pj30;->S(J)La/pu90;

    .line 1279
    .line 1280
    .line 1281
    move-result-object v1

    .line 1282
    iget v2, v1, La/pu90;->a:I

    .line 1283
    .line 1284
    iget v3, v1, La/pu90;->b:I

    .line 1285
    .line 1286
    new-instance v4, La/y1;

    .line 1287
    .line 1288
    const/16 v5, 0x11

    .line 1289
    .line 1290
    invoke-direct {v4, v1, v5}, La/y1;-><init>(La/pu90;B)V

    .line 1291
    .line 1292
    .line 1293
    invoke-static {v0, v2, v3, v4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v0

    .line 1297
    return-object v0

    .line 1298
    :pswitch_18
    move-object/from16 v0, p1

    .line 1299
    .line 1300
    check-cast v0, La/vj30;

    .line 1301
    .line 1302
    move-object/from16 v1, p2

    .line 1303
    .line 1304
    check-cast v1, La/pj30;

    .line 1305
    .line 1306
    move-object/from16 v2, p3

    .line 1307
    .line 1308
    check-cast v2, La/p4e;

    .line 1309
    .line 1310
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1311
    .line 1312
    .line 1313
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1314
    .line 1315
    .line 1316
    iget-wide v7, v2, La/p4e;->a:J

    .line 1317
    .line 1318
    invoke-static {v7, v8}, La/p4e;->i(J)I

    .line 1319
    .line 1320
    .line 1321
    move-result v2

    .line 1322
    div-int/lit8 v10, v2, 0x2

    .line 1323
    .line 1324
    const/4 v12, 0x0

    .line 1325
    const/16 v13, 0xd

    .line 1326
    .line 1327
    const/4 v9, 0x0

    .line 1328
    const/4 v11, 0x0

    .line 1329
    invoke-static/range {v7 .. v13}, La/p4e;->b(JIIIII)J

    .line 1330
    .line 1331
    .line 1332
    move-result-wide v2

    .line 1333
    invoke-interface {v1, v2, v3}, La/pj30;->S(J)La/pu90;

    .line 1334
    .line 1335
    .line 1336
    move-result-object v1

    .line 1337
    iget v2, v1, La/pu90;->a:I

    .line 1338
    .line 1339
    iget v3, v1, La/pu90;->b:I

    .line 1340
    .line 1341
    new-instance v4, La/y1;

    .line 1342
    .line 1343
    invoke-direct {v4, v1, v6}, La/y1;-><init>(La/pu90;B)V

    .line 1344
    .line 1345
    .line 1346
    invoke-static {v0, v2, v3, v4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 1347
    .line 1348
    .line 1349
    move-result-object v0

    .line 1350
    return-object v0

    .line 1351
    :pswitch_19
    move-object/from16 v0, p1

    .line 1352
    .line 1353
    check-cast v0, La/vj30;

    .line 1354
    .line 1355
    move-object/from16 v1, p2

    .line 1356
    .line 1357
    check-cast v1, La/pj30;

    .line 1358
    .line 1359
    move-object/from16 v2, p3

    .line 1360
    .line 1361
    check-cast v2, La/p4e;

    .line 1362
    .line 1363
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1364
    .line 1365
    .line 1366
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1367
    .line 1368
    .line 1369
    iget-wide v3, v2, La/p4e;->a:J

    .line 1370
    .line 1371
    invoke-static {v3, v4}, La/p4e;->h(J)I

    .line 1372
    .line 1373
    .line 1374
    move-result v3

    .line 1375
    int-to-float v3, v3

    .line 1376
    const/high16 v4, 0x3f000000    # 0.5f

    .line 1377
    .line 1378
    mul-float/2addr v3, v4

    .line 1379
    float-to-int v3, v3

    .line 1380
    iget-wide v4, v2, La/p4e;->a:J

    .line 1381
    .line 1382
    invoke-static {v4, v5}, La/p4e;->j(J)I

    .line 1383
    .line 1384
    .line 1385
    move-result v2

    .line 1386
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 1387
    .line 1388
    .line 1389
    move-result v8

    .line 1390
    const/4 v9, 0x0

    .line 1391
    const/16 v10, 0xb

    .line 1392
    .line 1393
    const/4 v6, 0x0

    .line 1394
    const/4 v7, 0x0

    .line 1395
    invoke-static/range {v4 .. v10}, La/p4e;->b(JIIIII)J

    .line 1396
    .line 1397
    .line 1398
    move-result-wide v2

    .line 1399
    invoke-interface {v1, v2, v3}, La/pj30;->S(J)La/pu90;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v1

    .line 1403
    iget v2, v1, La/pu90;->a:I

    .line 1404
    .line 1405
    iget v3, v1, La/pu90;->b:I

    .line 1406
    .line 1407
    new-instance v4, La/y1;

    .line 1408
    .line 1409
    const/16 v5, 0xf

    .line 1410
    .line 1411
    invoke-direct {v4, v1, v5}, La/y1;-><init>(La/pu90;B)V

    .line 1412
    .line 1413
    .line 1414
    invoke-static {v0, v2, v3, v4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 1415
    .line 1416
    .line 1417
    move-result-object v0

    .line 1418
    return-object v0

    .line 1419
    :pswitch_1a
    move-object/from16 v0, p1

    .line 1420
    .line 1421
    check-cast v0, La/k8z;

    .line 1422
    .line 1423
    move-object/from16 v1, p2

    .line 1424
    .line 1425
    check-cast v1, La/fet;

    .line 1426
    .line 1427
    move-object/from16 v2, p3

    .line 1428
    .line 1429
    check-cast v2, Ljava/lang/Integer;

    .line 1430
    .line 1431
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1432
    .line 1433
    .line 1434
    move-result v2

    .line 1435
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1436
    .line 1437
    .line 1438
    and-int/lit8 v0, v2, 0x11

    .line 1439
    .line 1440
    if-eq v0, v6, :cond_c

    .line 1441
    .line 1442
    move v11, v10

    .line 1443
    :cond_c
    and-int/lit8 v0, v2, 0x1

    .line 1444
    .line 1445
    invoke-virtual {v1, v0, v11}, La/fet;->U(IZ)Z

    .line 1446
    .line 1447
    .line 1448
    move-result v0

    .line 1449
    if-eqz v0, :cond_d

    .line 1450
    .line 1451
    sget-object v0, La/qmk;->a:La/zcl;

    .line 1452
    .line 1453
    const/4 v6, 0x0

    .line 1454
    const/16 v7, 0xe

    .line 1455
    .line 1456
    sget-object v2, La/jm40;->b:La/jm40;

    .line 1457
    .line 1458
    const/high16 v3, 0x41000000    # 8.0f

    .line 1459
    .line 1460
    const/4 v4, 0x0

    .line 1461
    const/4 v5, 0x0

    .line 1462
    invoke-static/range {v2 .. v7}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v12

    .line 1466
    new-instance v13, La/ijm;

    .line 1467
    .line 1468
    invoke-direct {v13}, La/ijm;-><init>()V

    .line 1469
    .line 1470
    .line 1471
    sget-object v14, La/kjm;->a:La/kjm;

    .line 1472
    .line 1473
    const/16 v19, 0x180

    .line 1474
    .line 1475
    const/16 v20, 0x38

    .line 1476
    .line 1477
    const/4 v15, 0x0

    .line 1478
    const/16 v16, 0x0

    .line 1479
    .line 1480
    const/16 v17, 0x0

    .line 1481
    .line 1482
    move-object/from16 v18, v1

    .line 1483
    .line 1484
    invoke-static/range {v12 .. v20}, La/nkb;->h(La/mm40;La/jjm;La/kjm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 1485
    .line 1486
    .line 1487
    goto :goto_8

    .line 1488
    :cond_d
    move-object/from16 v18, v1

    .line 1489
    .line 1490
    invoke-virtual/range {v18 .. v18}, La/fet;->X()V

    .line 1491
    .line 1492
    .line 1493
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1494
    .line 1495
    return-object v0

    .line 1496
    :pswitch_1b
    move-object/from16 v0, p1

    .line 1497
    .line 1498
    check-cast v0, La/k8z;

    .line 1499
    .line 1500
    move-object/from16 v1, p2

    .line 1501
    .line 1502
    check-cast v1, La/fet;

    .line 1503
    .line 1504
    move-object/from16 v2, p3

    .line 1505
    .line 1506
    check-cast v2, Ljava/lang/Integer;

    .line 1507
    .line 1508
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1509
    .line 1510
    .line 1511
    move-result v2

    .line 1512
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1513
    .line 1514
    .line 1515
    and-int/lit8 v0, v2, 0x11

    .line 1516
    .line 1517
    if-eq v0, v6, :cond_e

    .line 1518
    .line 1519
    move v11, v10

    .line 1520
    :cond_e
    and-int/lit8 v0, v2, 0x1

    .line 1521
    .line 1522
    invoke-virtual {v1, v0, v11}, La/fet;->U(IZ)Z

    .line 1523
    .line 1524
    .line 1525
    move-result v0

    .line 1526
    if-eqz v0, :cond_f

    .line 1527
    .line 1528
    sget-object v0, La/qmk;->a:La/zcl;

    .line 1529
    .line 1530
    const/4 v6, 0x0

    .line 1531
    const/16 v7, 0xe

    .line 1532
    .line 1533
    sget-object v2, La/jm40;->b:La/jm40;

    .line 1534
    .line 1535
    const/high16 v3, 0x41000000    # 8.0f

    .line 1536
    .line 1537
    const/4 v4, 0x0

    .line 1538
    const/4 v5, 0x0

    .line 1539
    invoke-static/range {v2 .. v7}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1540
    .line 1541
    .line 1542
    move-result-object v12

    .line 1543
    new-instance v13, La/hjm;

    .line 1544
    .line 1545
    const v0, 0x7f1310d6

    .line 1546
    .line 1547
    .line 1548
    invoke-static {v0, v1}, La/xsm0;->s(ILa/fet;)Ljava/lang/String;

    .line 1549
    .line 1550
    .line 1551
    move-result-object v14

    .line 1552
    new-instance v0, La/m0x;

    .line 1553
    .line 1554
    const v2, 0x7f0809d5

    .line 1555
    .line 1556
    .line 1557
    const/4 v3, 0x6

    .line 1558
    invoke-direct {v0, v2, v8, v3}, La/m0x;-><init>(ILa/bzw;I)V

    .line 1559
    .line 1560
    .line 1561
    const/16 v25, 0x0

    .line 1562
    .line 1563
    const/16 v26, 0x1ff6

    .line 1564
    .line 1565
    const/4 v15, 0x0

    .line 1566
    const/16 v16, 0x0

    .line 1567
    .line 1568
    const/16 v18, 0x0

    .line 1569
    .line 1570
    const/16 v19, 0x0

    .line 1571
    .line 1572
    const/16 v20, 0x0

    .line 1573
    .line 1574
    const/16 v21, 0x0

    .line 1575
    .line 1576
    const/16 v22, 0x0

    .line 1577
    .line 1578
    const/16 v23, 0x0

    .line 1579
    .line 1580
    const/16 v24, 0x0

    .line 1581
    .line 1582
    move-object/from16 v17, v0

    .line 1583
    .line 1584
    invoke-direct/range {v13 .. v26}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 1585
    .line 1586
    .line 1587
    sget-object v14, La/kjm;->a:La/kjm;

    .line 1588
    .line 1589
    const/16 v19, 0x180

    .line 1590
    .line 1591
    const/16 v20, 0x38

    .line 1592
    .line 1593
    const/16 v17, 0x0

    .line 1594
    .line 1595
    move-object/from16 v18, v1

    .line 1596
    .line 1597
    invoke-static/range {v12 .. v20}, La/nkb;->h(La/mm40;La/jjm;La/kjm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 1598
    .line 1599
    .line 1600
    goto :goto_9

    .line 1601
    :cond_f
    move-object/from16 v18, v1

    .line 1602
    .line 1603
    invoke-virtual/range {v18 .. v18}, La/fet;->X()V

    .line 1604
    .line 1605
    .line 1606
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1607
    .line 1608
    return-object v0

    .line 1609
    :pswitch_1c
    move-object/from16 v0, p1

    .line 1610
    .line 1611
    check-cast v0, La/rb50;

    .line 1612
    .line 1613
    move-object/from16 v1, p2

    .line 1614
    .line 1615
    check-cast v1, La/fet;

    .line 1616
    .line 1617
    move-object/from16 v2, p3

    .line 1618
    .line 1619
    check-cast v2, Ljava/lang/Integer;

    .line 1620
    .line 1621
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1622
    .line 1623
    .line 1624
    move-result v2

    .line 1625
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1626
    .line 1627
    .line 1628
    and-int/lit8 v0, v2, 0x11

    .line 1629
    .line 1630
    if-eq v0, v6, :cond_10

    .line 1631
    .line 1632
    move v11, v10

    .line 1633
    :cond_10
    and-int/lit8 v0, v2, 0x1

    .line 1634
    .line 1635
    invoke-virtual {v1, v0, v11}, La/fet;->U(IZ)Z

    .line 1636
    .line 1637
    .line 1638
    move-result v0

    .line 1639
    if-eqz v0, :cond_11

    .line 1640
    .line 1641
    goto :goto_a

    .line 1642
    :cond_11
    invoke-virtual {v1}, La/fet;->X()V

    .line 1643
    .line 1644
    .line 1645
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1646
    .line 1647
    return-object v0

    .line 1648
    nop

    .line 1649
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
