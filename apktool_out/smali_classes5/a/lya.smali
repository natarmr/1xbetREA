.class public final synthetic La/lya;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/lya;->a:B

    iput-object p1, p0, La/lya;->b:Ljava/lang/Object;

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
    iget-byte v1, v0, La/lya;->a:B

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const-string v3, ""

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
    const/16 v7, 0x9

    .line 16
    .line 17
    const/4 v8, 0x1

    .line 18
    const/4 v9, 0x0

    .line 19
    const/4 v10, 0x0

    .line 20
    iget-object v0, v0, La/lya;->b:Ljava/lang/Object;

    .line 21
    .line 22
    packed-switch v1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    check-cast v0, La/mc90;

    .line 26
    .line 27
    move-object/from16 v11, p1

    .line 28
    .line 29
    check-cast v11, La/fhl;

    .line 30
    .line 31
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    sget-object v1, La/qmk;->a:La/zcl;

    .line 35
    .line 36
    const/high16 v1, 0x41000000    # 8.0f

    .line 37
    .line 38
    invoke-interface {v11, v1}, La/w6k;->w0(F)F

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    int-to-long v2, v2

    .line 47
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    int-to-long v7, v1

    .line 52
    shl-long v1, v2, v6

    .line 53
    .line 54
    and-long v3, v7, v4

    .line 55
    .line 56
    or-long v18, v1, v3

    .line 57
    .line 58
    check-cast v0, La/cc90;

    .line 59
    .line 60
    instance-of v1, v0, La/xb90;

    .line 61
    .line 62
    if-eqz v1, :cond_0

    .line 63
    .line 64
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 65
    .line 66
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 67
    .line 68
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite20-0d7_KjU()J

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    :goto_0
    move-wide v12, v0

    .line 73
    goto :goto_1

    .line 74
    :cond_0
    instance-of v0, v0, La/zb90;

    .line 75
    .line 76
    if-eqz v0, :cond_1

    .line 77
    .line 78
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 79
    .line 80
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 81
    .line 82
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite10-0d7_KjU()J

    .line 83
    .line 84
    .line 85
    move-result-wide v0

    .line 86
    goto :goto_0

    .line 87
    :goto_1
    const/16 v20, 0x0

    .line 88
    .line 89
    const/16 v21, 0xf6

    .line 90
    .line 91
    const-wide/16 v14, 0x0

    .line 92
    .line 93
    const-wide/16 v16, 0x0

    .line 94
    .line 95
    invoke-static/range {v11 .. v21}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 96
    .line 97
    .line 98
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 102
    .line 103
    .line 104
    :goto_2
    return-object v10

    .line 105
    :pswitch_0
    check-cast v0, La/nc90;

    .line 106
    .line 107
    move-object/from16 v1, p1

    .line 108
    .line 109
    check-cast v1, La/fhl;

    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    check-cast v0, La/dc90;

    .line 115
    .line 116
    instance-of v2, v0, La/wb90;

    .line 117
    .line 118
    if-eqz v2, :cond_2

    .line 119
    .line 120
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 121
    .line 122
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 127
    .line 128
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary20-0d7_KjU()J

    .line 129
    .line 130
    .line 131
    move-result-wide v2

    .line 132
    goto :goto_3

    .line 133
    :cond_2
    instance-of v0, v0, La/yb90;

    .line 134
    .line 135
    if-eqz v0, :cond_3

    .line 136
    .line 137
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 138
    .line 139
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 144
    .line 145
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 146
    .line 147
    .line 148
    move-result-wide v2

    .line 149
    :goto_3
    const/4 v8, 0x0

    .line 150
    const/16 v9, 0x7e

    .line 151
    .line 152
    const/4 v4, 0x0

    .line 153
    const-wide/16 v5, 0x0

    .line 154
    .line 155
    const/4 v7, 0x0

    .line 156
    invoke-static/range {v1 .. v9}, La/fhl;->E(La/fhl;JFJFLa/agc;I)V

    .line 157
    .line 158
    .line 159
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 163
    .line 164
    .line 165
    :goto_4
    return-object v10

    .line 166
    :pswitch_1
    check-cast v0, La/gfd;

    .line 167
    .line 168
    move-object/from16 v1, p1

    .line 169
    .line 170
    check-cast v1, Ljava/lang/Throwable;

    .line 171
    .line 172
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    iget-object v2, v0, La/gfd;->o:La/duj;

    .line 176
    .line 177
    new-instance v3, La/cnc;

    .line 178
    .line 179
    const/16 v4, 0x8

    .line 180
    .line 181
    invoke-direct {v3, v0, v4}, La/cnc;-><init>(Ljava/lang/Object;B)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 185
    .line 186
    .line 187
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 188
    .line 189
    return-object v0

    .line 190
    :pswitch_2
    check-cast v0, La/jh5;

    .line 191
    .line 192
    move-object/from16 v1, p1

    .line 193
    .line 194
    check-cast v1, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;

    .line 195
    .line 196
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    if-eqz v0, :cond_4

    .line 200
    .line 201
    sget-object v2, La/pn40;->a:La/pn40;

    .line 202
    .line 203
    iget-wide v2, v0, La/jh5;->c:D

    .line 204
    .line 205
    sget-object v4, La/p3u0;->c:La/p3u0;

    .line 206
    .line 207
    invoke-static {v2, v3, v4}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    iget-object v0, v0, La/jh5;->d:Ljava/lang/String;

    .line 212
    .line 213
    invoke-virtual {v1, v2, v0}, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 217
    .line 218
    .line 219
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 220
    .line 221
    return-object v0

    .line 222
    :pswitch_3
    check-cast v0, La/m4d;

    .line 223
    .line 224
    move-object/from16 v11, p1

    .line 225
    .line 226
    check-cast v11, La/fhl;

    .line 227
    .line 228
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    iget-object v0, v0, La/m4d;->c:La/mbc;

    .line 232
    .line 233
    instance-of v1, v0, La/k4d;

    .line 234
    .line 235
    if-eqz v1, :cond_5

    .line 236
    .line 237
    check-cast v0, La/k4d;

    .line 238
    .line 239
    iget-wide v12, v0, La/k4d;->a:J

    .line 240
    .line 241
    const/16 v21, 0x0

    .line 242
    .line 243
    const/16 v22, 0x7e

    .line 244
    .line 245
    const-wide/16 v14, 0x0

    .line 246
    .line 247
    const-wide/16 v16, 0x0

    .line 248
    .line 249
    const/16 v18, 0x0

    .line 250
    .line 251
    const/16 v19, 0x0

    .line 252
    .line 253
    const/16 v20, 0x0

    .line 254
    .line 255
    invoke-static/range {v11 .. v22}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 256
    .line 257
    .line 258
    goto :goto_5

    .line 259
    :cond_5
    instance-of v1, v0, La/l4d;

    .line 260
    .line 261
    if-eqz v1, :cond_6

    .line 262
    .line 263
    invoke-static {}, La/z03;->a()La/w03;

    .line 264
    .line 265
    .line 266
    move-result-object v12

    .line 267
    const/4 v1, 0x0

    .line 268
    invoke-virtual {v12, v1, v1}, La/w03;->f(FF)V

    .line 269
    .line 270
    .line 271
    invoke-interface {v11}, La/fhl;->d()J

    .line 272
    .line 273
    .line 274
    move-result-wide v2

    .line 275
    and-long/2addr v2, v4

    .line 276
    long-to-int v2, v2

    .line 277
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 278
    .line 279
    .line 280
    move-result v2

    .line 281
    invoke-virtual {v12, v1, v2}, La/w03;->e(FF)V

    .line 282
    .line 283
    .line 284
    invoke-interface {v11}, La/fhl;->d()J

    .line 285
    .line 286
    .line 287
    move-result-wide v2

    .line 288
    shr-long/2addr v2, v6

    .line 289
    long-to-int v2, v2

    .line 290
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 291
    .line 292
    .line 293
    move-result v2

    .line 294
    invoke-interface {v11}, La/fhl;->d()J

    .line 295
    .line 296
    .line 297
    move-result-wide v7

    .line 298
    and-long/2addr v7, v4

    .line 299
    long-to-int v3, v7

    .line 300
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 301
    .line 302
    .line 303
    move-result v3

    .line 304
    invoke-virtual {v12, v2, v3}, La/w03;->e(FF)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v12}, La/w03;->c()V

    .line 308
    .line 309
    .line 310
    check-cast v0, La/l4d;

    .line 311
    .line 312
    iget-wide v13, v0, La/l4d;->a:J

    .line 313
    .line 314
    const/16 v16, 0x0

    .line 315
    .line 316
    const/16 v17, 0x3c

    .line 317
    .line 318
    const/4 v15, 0x0

    .line 319
    invoke-static/range {v11 .. v17}, La/fhl;->C0(La/fhl;La/w03;JFLa/agc;I)V

    .line 320
    .line 321
    .line 322
    invoke-static {}, La/z03;->a()La/w03;

    .line 323
    .line 324
    .line 325
    move-result-object v12

    .line 326
    invoke-virtual {v12, v1, v1}, La/w03;->f(FF)V

    .line 327
    .line 328
    .line 329
    invoke-interface {v11}, La/fhl;->d()J

    .line 330
    .line 331
    .line 332
    move-result-wide v2

    .line 333
    shr-long/2addr v2, v6

    .line 334
    long-to-int v2, v2

    .line 335
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 336
    .line 337
    .line 338
    move-result v2

    .line 339
    invoke-virtual {v12, v2, v1}, La/w03;->e(FF)V

    .line 340
    .line 341
    .line 342
    invoke-interface {v11}, La/fhl;->d()J

    .line 343
    .line 344
    .line 345
    move-result-wide v1

    .line 346
    shr-long/2addr v1, v6

    .line 347
    long-to-int v1, v1

    .line 348
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 349
    .line 350
    .line 351
    move-result v1

    .line 352
    invoke-interface {v11}, La/fhl;->d()J

    .line 353
    .line 354
    .line 355
    move-result-wide v2

    .line 356
    and-long/2addr v2, v4

    .line 357
    long-to-int v2, v2

    .line 358
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 359
    .line 360
    .line 361
    move-result v2

    .line 362
    invoke-virtual {v12, v1, v2}, La/w03;->e(FF)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v12}, La/w03;->c()V

    .line 366
    .line 367
    .line 368
    iget-wide v13, v0, La/l4d;->b:J

    .line 369
    .line 370
    invoke-static/range {v11 .. v17}, La/fhl;->C0(La/fhl;La/w03;JFLa/agc;I)V

    .line 371
    .line 372
    .line 373
    :goto_5
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 374
    .line 375
    goto :goto_6

    .line 376
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 377
    .line 378
    .line 379
    :goto_6
    return-object v10

    .line 380
    :pswitch_4
    check-cast v0, La/x2d;

    .line 381
    .line 382
    move-object/from16 v1, p1

    .line 383
    .line 384
    check-cast v1, La/i73;

    .line 385
    .line 386
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    iget-object v1, v1, La/i73;->e:La/pz40;

    .line 390
    .line 391
    check-cast v1, La/hgk0;

    .line 392
    .line 393
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    check-cast v1, Ljava/lang/Number;

    .line 398
    .line 399
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 400
    .line 401
    .line 402
    move-result v1

    .line 403
    invoke-virtual {v0, v1}, La/x2d;->b(F)V

    .line 404
    .line 405
    .line 406
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 407
    .line 408
    return-object v0

    .line 409
    :pswitch_5
    check-cast v0, La/nyq0;

    .line 410
    .line 411
    move-object/from16 v1, p1

    .line 412
    .line 413
    check-cast v1, Ljava/lang/Float;

    .line 414
    .line 415
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 416
    .line 417
    .line 418
    move-result v1

    .line 419
    invoke-interface {v0}, La/nyq0;->getState()La/oyq0;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    iget-object v2, v0, La/oyq0;->c:La/agk0;

    .line 424
    .line 425
    invoke-virtual {v2}, La/agk0;->l()F

    .line 426
    .line 427
    .line 428
    move-result v2

    .line 429
    add-float/2addr v2, v1

    .line 430
    invoke-virtual {v0, v2}, La/oyq0;->c(F)V

    .line 431
    .line 432
    .line 433
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 434
    .line 435
    return-object v0

    .line 436
    :pswitch_6
    check-cast v0, La/ywc;

    .line 437
    .line 438
    move-object/from16 v1, p1

    .line 439
    .line 440
    check-cast v1, Landroid/net/Uri;

    .line 441
    .line 442
    sget-object v2, La/ywc;->W1:La/kl5;

    .line 443
    .line 444
    invoke-virtual {v0}, La/ywc;->H0()La/qxc;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    if-eqz v1, :cond_7

    .line 449
    .line 450
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v10

    .line 454
    :cond_7
    if-nez v10, :cond_8

    .line 455
    .line 456
    goto :goto_7

    .line 457
    :cond_8
    move-object v3, v10

    .line 458
    :goto_7
    const-string v1, "http"

    .line 459
    .line 460
    invoke-static {v3, v1, v9}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 461
    .line 462
    .line 463
    move-result v1

    .line 464
    if-nez v1, :cond_a

    .line 465
    .line 466
    const-string v1, "mailto"

    .line 467
    .line 468
    invoke-static {v3, v1, v9}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 469
    .line 470
    .line 471
    move-result v1

    .line 472
    if-nez v1, :cond_a

    .line 473
    .line 474
    const-string v1, "tel"

    .line 475
    .line 476
    invoke-static {v3, v1, v9}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 477
    .line 478
    .line 479
    move-result v1

    .line 480
    if-eqz v1, :cond_9

    .line 481
    .line 482
    goto :goto_8

    .line 483
    :cond_9
    iget-object v1, v0, La/qxc;->k:La/n0o0;

    .line 484
    .line 485
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v1

    .line 489
    check-cast v1, Ljava/lang/String;

    .line 490
    .line 491
    invoke-static {v3, v1, v9}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 492
    .line 493
    .line 494
    move-result v1

    .line 495
    if-eqz v1, :cond_b

    .line 496
    .line 497
    iget-object v0, v0, La/qxc;->j:La/grj;

    .line 498
    .line 499
    invoke-virtual {v0, v3}, La/grj;->a(Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    goto :goto_9

    .line 503
    :cond_a
    :goto_8
    iget-object v0, v0, La/qxc;->l:La/ol60;

    .line 504
    .line 505
    new-instance v1, La/hxc;

    .line 506
    .line 507
    invoke-direct {v1, v3}, La/hxc;-><init>(Ljava/lang/String;)V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 511
    .line 512
    .line 513
    :cond_b
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 514
    .line 515
    return-object v0

    .line 516
    :pswitch_7
    check-cast v0, La/iwc;

    .line 517
    .line 518
    move-object/from16 v1, p1

    .line 519
    .line 520
    check-cast v1, Ljava/lang/Throwable;

    .line 521
    .line 522
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 523
    .line 524
    .line 525
    iget-object v2, v0, La/iwc;->g:La/duj;

    .line 526
    .line 527
    new-instance v3, La/cnc;

    .line 528
    .line 529
    invoke-direct {v3, v0, v8}, La/cnc;-><init>(Ljava/lang/Object;B)V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 533
    .line 534
    .line 535
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 536
    .line 537
    return-object v0

    .line 538
    :pswitch_8
    check-cast v0, La/iz;

    .line 539
    .line 540
    move-object/from16 v1, p1

    .line 541
    .line 542
    check-cast v1, La/cp;

    .line 543
    .line 544
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 545
    .line 546
    .line 547
    iget-object v3, v1, La/cp;->u:La/yfu0;

    .line 548
    .line 549
    check-cast v3, La/etc;

    .line 550
    .line 551
    iget-object v3, v3, La/etc;->c:Landroid/view/View;

    .line 552
    .line 553
    new-instance v4, La/h6c;

    .line 554
    .line 555
    invoke-direct {v4, v0, v1, v7}, La/h6c;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 556
    .line 557
    .line 558
    invoke-static {v3, v4}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 559
    .line 560
    .line 561
    new-instance v0, La/rn5;

    .line 562
    .line 563
    invoke-direct {v0, v1, v2}, La/rn5;-><init>(La/cp;B)V

    .line 564
    .line 565
    .line 566
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 567
    .line 568
    .line 569
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 570
    .line 571
    return-object v0

    .line 572
    :pswitch_9
    check-cast v0, La/pw4;

    .line 573
    .line 574
    move-object/from16 v1, p1

    .line 575
    .line 576
    check-cast v1, La/cp;

    .line 577
    .line 578
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 579
    .line 580
    .line 581
    iget-object v1, v1, La/xhe0;->a:Landroid/view/View;

    .line 582
    .line 583
    new-instance v2, La/q10;

    .line 584
    .line 585
    invoke-direct {v2, v0, v7}, La/q10;-><init>(Ljava/lang/Object;B)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 589
    .line 590
    .line 591
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 592
    .line 593
    return-object v0

    .line 594
    :pswitch_a
    check-cast v0, La/oic;

    .line 595
    .line 596
    move-object/from16 v1, p1

    .line 597
    .line 598
    check-cast v1, La/hcz;

    .line 599
    .line 600
    sget-object v3, La/oic;->l2:La/yk5;

    .line 601
    .line 602
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v0}, La/oic;->P0()Lorg/xplatform/statistic/tennis/impl/summary/presentation/chose_filter/ChoseFilterScreenParams;

    .line 606
    .line 607
    .line 608
    move-result-object v3

    .line 609
    iget-object v3, v3, Lorg/xplatform/statistic/tennis/impl/summary/presentation/chose_filter/ChoseFilterScreenParams;->c:Ljava/util/ArrayList;

    .line 610
    .line 611
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 612
    .line 613
    .line 614
    move-result v4

    .line 615
    new-instance v5, La/j13;

    .line 616
    .line 617
    invoke-direct {v5, v3, v7, v9}, La/j13;-><init>(Ljava/util/ArrayList;BZ)V

    .line 618
    .line 619
    .line 620
    new-instance v6, La/xe4;

    .line 621
    .line 622
    invoke-direct {v6, v3, v0, v2}, La/xe4;-><init>(Ljava/util/List;Ljava/lang/Object;B)V

    .line 623
    .line 624
    .line 625
    new-instance v0, La/ugd;

    .line 626
    .line 627
    const v2, 0x799532c4

    .line 628
    .line 629
    .line 630
    invoke-direct {v0, v2, v8, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 631
    .line 632
    .line 633
    invoke-virtual {v1, v4, v10, v5, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 634
    .line 635
    .line 636
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 637
    .line 638
    return-object v0

    .line 639
    :pswitch_b
    check-cast v0, La/dic;

    .line 640
    .line 641
    move-object/from16 v1, p1

    .line 642
    .line 643
    check-cast v1, Ljava/lang/Long;

    .line 644
    .line 645
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 646
    .line 647
    .line 648
    move-result-wide v1

    .line 649
    sget-object v3, La/dic;->n2:La/kj5;

    .line 650
    .line 651
    iget-object v0, v0, La/dic;->m2:La/a8z;

    .line 652
    .line 653
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    move-result-object v0

    .line 657
    check-cast v0, La/k3t0;

    .line 658
    .line 659
    new-instance v3, La/aic;

    .line 660
    .line 661
    invoke-direct {v3, v1, v2}, La/aic;-><init>(J)V

    .line 662
    .line 663
    .line 664
    invoke-virtual {v0, v3}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 665
    .line 666
    .line 667
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 668
    .line 669
    return-object v0

    .line 670
    :pswitch_c
    check-cast v0, La/yhc;

    .line 671
    .line 672
    move-object/from16 v1, p1

    .line 673
    .line 674
    check-cast v1, Ljava/lang/Throwable;

    .line 675
    .line 676
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 677
    .line 678
    .line 679
    iget-object v2, v0, La/yhc;->q:La/duj;

    .line 680
    .line 681
    new-instance v3, La/bna;

    .line 682
    .line 683
    const/16 v4, 0x1d

    .line 684
    .line 685
    invoke-direct {v3, v0, v4}, La/bna;-><init>(Ljava/lang/Object;B)V

    .line 686
    .line 687
    .line 688
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 689
    .line 690
    .line 691
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 692
    .line 693
    return-object v0

    .line 694
    :pswitch_d
    check-cast v0, La/rcc;

    .line 695
    .line 696
    move-object/from16 v1, p1

    .line 697
    .line 698
    check-cast v1, Lorg/xplatform/uikit/components/chips/DsChips;

    .line 699
    .line 700
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 701
    .line 702
    .line 703
    iget-object v0, v0, La/rcc;->a:La/a4x;

    .line 704
    .line 705
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/chips/DsChips;->setChips(Ljava/util/List;)V

    .line 706
    .line 707
    .line 708
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 709
    .line 710
    return-object v0

    .line 711
    :pswitch_e
    check-cast v0, La/r0c;

    .line 712
    .line 713
    move-object/from16 v1, p1

    .line 714
    .line 715
    check-cast v1, Landroid/view/View;

    .line 716
    .line 717
    sget-object v2, La/r0c;->S1:La/cl5;

    .line 718
    .line 719
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 720
    .line 721
    .line 722
    iget-object v1, v0, La/r0c;->M1:La/ii;

    .line 723
    .line 724
    if-eqz v1, :cond_c

    .line 725
    .line 726
    new-instance v11, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 727
    .line 728
    const v2, 0x7f1304e4

    .line 729
    .line 730
    .line 731
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 732
    .line 733
    .line 734
    move-result-object v12

    .line 735
    const v2, 0x7f1304e7

    .line 736
    .line 737
    .line 738
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 739
    .line 740
    .line 741
    move-result-object v13

    .line 742
    const v2, 0x7f1304e8

    .line 743
    .line 744
    .line 745
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 746
    .line 747
    .line 748
    move-result-object v14

    .line 749
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 750
    .line 751
    .line 752
    const v2, 0x7f13032f

    .line 753
    .line 754
    .line 755
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 756
    .line 757
    .line 758
    move-result-object v15

    .line 759
    sget-object v20, La/n12;->a:La/n12;

    .line 760
    .line 761
    const/16 v21, 0x0

    .line 762
    .line 763
    const/16 v22, 0x5d0

    .line 764
    .line 765
    const/16 v16, 0x0

    .line 766
    .line 767
    const-string v17, "REQUEST_CONSULTANT_KEY"

    .line 768
    .line 769
    const/16 v18, 0x0

    .line 770
    .line 771
    const/16 v19, 0x0

    .line 772
    .line 773
    invoke-direct/range {v11 .. v22}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 774
    .line 775
    .line 776
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 777
    .line 778
    .line 779
    move-result-object v0

    .line 780
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 781
    .line 782
    .line 783
    invoke-virtual {v1, v11, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 784
    .line 785
    .line 786
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 787
    .line 788
    return-object v0

    .line 789
    :cond_c
    const-string v0, "actionDialogManager"

    .line 790
    .line 791
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 792
    .line 793
    .line 794
    throw v10

    .line 795
    :pswitch_f
    check-cast v0, La/hrb;

    .line 796
    .line 797
    move-object/from16 v1, p1

    .line 798
    .line 799
    check-cast v1, Ljava/lang/Throwable;

    .line 800
    .line 801
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 802
    .line 803
    .line 804
    iget-object v0, v0, La/hrb;->k:La/rjo;

    .line 805
    .line 806
    invoke-virtual {v0, v1}, La/rjo;->a(Ljava/lang/Throwable;)V

    .line 807
    .line 808
    .line 809
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 810
    .line 811
    return-object v0

    .line 812
    :pswitch_10
    check-cast v0, La/rqb;

    .line 813
    .line 814
    move-object/from16 v1, p1

    .line 815
    .line 816
    check-cast v1, La/iqt0;

    .line 817
    .line 818
    sget-object v2, La/rqb;->U1:La/bj5;

    .line 819
    .line 820
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 821
    .line 822
    .line 823
    invoke-virtual {v0}, La/rqb;->H0()La/hrb;

    .line 824
    .line 825
    .line 826
    move-result-object v0

    .line 827
    iget-object v0, v0, La/hrb;->o:La/z4w0;

    .line 828
    .line 829
    invoke-virtual {v0, v1}, La/z4w0;->a(La/iqt0;)V

    .line 830
    .line 831
    .line 832
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 833
    .line 834
    return-object v0

    .line 835
    :pswitch_11
    check-cast v0, La/xpb;

    .line 836
    .line 837
    move-object/from16 v1, p1

    .line 838
    .line 839
    check-cast v1, La/iqt0;

    .line 840
    .line 841
    sget-object v2, La/xpb;->S1:La/gl5;

    .line 842
    .line 843
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 844
    .line 845
    .line 846
    invoke-virtual {v0}, La/xpb;->H0()La/eqb;

    .line 847
    .line 848
    .line 849
    move-result-object v0

    .line 850
    iget-object v0, v0, La/eqb;->f:La/z4w0;

    .line 851
    .line 852
    invoke-virtual {v0, v1}, La/z4w0;->a(La/iqt0;)V

    .line 853
    .line 854
    .line 855
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 856
    .line 857
    return-object v0

    .line 858
    :pswitch_12
    check-cast v0, La/job;

    .line 859
    .line 860
    move-object/from16 v1, p1

    .line 861
    .line 862
    check-cast v1, Ljava/lang/Integer;

    .line 863
    .line 864
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 865
    .line 866
    .line 867
    sget-object v2, La/job;->o2:La/yk5;

    .line 868
    .line 869
    iget-object v2, v0, La/job;->g2:La/phf0;

    .line 870
    .line 871
    sget-object v3, La/job;->p2:[La/iiy;

    .line 872
    .line 873
    aget-object v4, v3, v9

    .line 874
    .line 875
    invoke-virtual {v2, v0, v4}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 876
    .line 877
    .line 878
    move-result-object v4

    .line 879
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 880
    .line 881
    .line 882
    move-result v4

    .line 883
    if-lez v4, :cond_d

    .line 884
    .line 885
    aget-object v3, v3, v9

    .line 886
    .line 887
    invoke-virtual {v2, v0, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 888
    .line 889
    .line 890
    move-result-object v2

    .line 891
    new-instance v3, Lkotlin/Pair;

    .line 892
    .line 893
    const-string v4, "RESULT_BLOCK_ID"

    .line 894
    .line 895
    invoke-direct {v3, v4, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 896
    .line 897
    .line 898
    filled-new-array {v3}, [Lkotlin/Pair;

    .line 899
    .line 900
    .line 901
    move-result-object v1

    .line 902
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 903
    .line 904
    .line 905
    move-result-object v1

    .line 906
    invoke-static {v1, v0, v2}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 907
    .line 908
    .line 909
    :cond_d
    invoke-virtual {v0}, La/yo8;->x0()V

    .line 910
    .line 911
    .line 912
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 913
    .line 914
    return-object v0

    .line 915
    :pswitch_13
    check-cast v0, La/xnb;

    .line 916
    .line 917
    move-object/from16 v1, p1

    .line 918
    .line 919
    check-cast v1, La/ql5;

    .line 920
    .line 921
    sget-object v2, La/xnb;->w2:La/kj5;

    .line 922
    .line 923
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 924
    .line 925
    .line 926
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->R()Z

    .line 927
    .line 928
    .line 929
    move-result v2

    .line 930
    if-eqz v2, :cond_e

    .line 931
    .line 932
    goto :goto_a

    .line 933
    :cond_e
    invoke-virtual {v0}, La/xnb;->R0()Ljava/lang/String;

    .line 934
    .line 935
    .line 936
    move-result-object v2

    .line 937
    new-instance v3, Lkotlin/Pair;

    .line 938
    .line 939
    const-string v4, "RESULT_ON_ITEM_SELECTED_LISTENER_KEY"

    .line 940
    .line 941
    invoke-direct {v3, v4, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 942
    .line 943
    .line 944
    filled-new-array {v3}, [Lkotlin/Pair;

    .line 945
    .line 946
    .line 947
    move-result-object v1

    .line 948
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 949
    .line 950
    .line 951
    move-result-object v1

    .line 952
    invoke-static {v1, v0, v2}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 953
    .line 954
    .line 955
    invoke-virtual {v0}, La/yo8;->y0()V

    .line 956
    .line 957
    .line 958
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 959
    .line 960
    return-object v0

    .line 961
    :pswitch_14
    check-cast v0, La/cmb;

    .line 962
    .line 963
    move-object/from16 v1, p1

    .line 964
    .line 965
    check-cast v1, Ljava/lang/Integer;

    .line 966
    .line 967
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 968
    .line 969
    .line 970
    sget-object v1, La/cmb;->O1:La/yk5;

    .line 971
    .line 972
    invoke-virtual {v0}, La/cmb;->G0()La/k3t0;

    .line 973
    .line 974
    .line 975
    move-result-object v0

    .line 976
    sget-object v1, La/xi2;->a:La/xi2;

    .line 977
    .line 978
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 979
    .line 980
    .line 981
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 982
    .line 983
    return-object v0

    .line 984
    :pswitch_15
    check-cast v0, La/bib;

    .line 985
    .line 986
    move-object/from16 v1, p1

    .line 987
    .line 988
    check-cast v1, Ljava/lang/String;

    .line 989
    .line 990
    sget-object v2, La/bib;->X1:La/bj5;

    .line 991
    .line 992
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 993
    .line 994
    .line 995
    invoke-virtual {v0}, La/bib;->J0()La/k3t0;

    .line 996
    .line 997
    .line 998
    move-result-object v0

    .line 999
    new-instance v2, La/phb;

    .line 1000
    .line 1001
    invoke-direct {v2, v1}, La/phb;-><init>(Ljava/lang/String;)V

    .line 1002
    .line 1003
    .line 1004
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1005
    .line 1006
    .line 1007
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1008
    .line 1009
    return-object v0

    .line 1010
    :pswitch_16
    check-cast v0, La/z8b;

    .line 1011
    .line 1012
    move-object/from16 v1, p1

    .line 1013
    .line 1014
    check-cast v1, La/uag0;

    .line 1015
    .line 1016
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1017
    .line 1018
    .line 1019
    iget v2, v0, La/z8b;->a:F

    .line 1020
    .line 1021
    invoke-virtual {v1, v2}, La/uag0;->w(F)V

    .line 1022
    .line 1023
    .line 1024
    invoke-virtual {v1, v2}, La/uag0;->y(F)V

    .line 1025
    .line 1026
    .line 1027
    iget v0, v0, La/z8b;->b:F

    .line 1028
    .line 1029
    invoke-virtual {v1, v0}, La/uag0;->b(F)V

    .line 1030
    .line 1031
    .line 1032
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1033
    .line 1034
    return-object v0

    .line 1035
    :pswitch_17
    move-object v1, v0

    .line 1036
    check-cast v1, La/y7b;

    .line 1037
    .line 1038
    move-object/from16 v0, p1

    .line 1039
    .line 1040
    check-cast v0, Ljava/lang/Throwable;

    .line 1041
    .line 1042
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1043
    .line 1044
    .line 1045
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 1046
    .line 1047
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 1048
    .line 1049
    :cond_f
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v0

    .line 1053
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1054
    .line 1055
    .line 1056
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 1057
    .line 1058
    move-object v4, v0

    .line 1059
    check-cast v4, La/r6b;

    .line 1060
    .line 1061
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1062
    .line 1063
    .line 1064
    const/16 v20, 0x0

    .line 1065
    .line 1066
    const v21, 0x7bfff

    .line 1067
    .line 1068
    .line 1069
    const/4 v5, 0x0

    .line 1070
    const/4 v6, 0x0

    .line 1071
    const/4 v7, 0x0

    .line 1072
    const/4 v8, 0x0

    .line 1073
    const/4 v9, 0x0

    .line 1074
    const/4 v10, 0x0

    .line 1075
    const/4 v11, 0x0

    .line 1076
    const/4 v12, 0x0

    .line 1077
    const/4 v13, 0x0

    .line 1078
    const/4 v14, 0x0

    .line 1079
    const/4 v15, 0x0

    .line 1080
    const/16 v16, 0x0

    .line 1081
    .line 1082
    const/16 v17, 0x0

    .line 1083
    .line 1084
    const/16 v18, 0x0

    .line 1085
    .line 1086
    const/16 v19, 0x0

    .line 1087
    .line 1088
    invoke-static/range {v4 .. v21}, La/r6b;->a(La/r6b;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;La/l9s;La/js20;La/js20;Ljava/util/List;La/xvm0;La/xvm0;Ljava/util/List;La/aw20;La/ycs;Ljava/lang/String;ZZI)La/r6b;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v3

    .line 1092
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1093
    .line 1094
    .line 1095
    move-result v0

    .line 1096
    if-eqz v0, :cond_f

    .line 1097
    .line 1098
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1099
    .line 1100
    return-object v0

    .line 1101
    :pswitch_18
    check-cast v0, La/w5b;

    .line 1102
    .line 1103
    move-object/from16 v1, p1

    .line 1104
    .line 1105
    check-cast v1, La/k0w0;

    .line 1106
    .line 1107
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1108
    .line 1109
    .line 1110
    iget-object v0, v0, La/w5b;->w:La/eke0;

    .line 1111
    .line 1112
    sget-object v2, La/bhh0;->c:La/bhh0;

    .line 1113
    .line 1114
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1115
    .line 1116
    .line 1117
    new-instance v0, Lorg/xplatform/search/impl/navigation/SearchScreenFactoryImpl$getSectionSearchFragmentScreen$1;

    .line 1118
    .line 1119
    invoke-direct {v0, v2}, Lorg/xplatform/search/impl/navigation/SearchScreenFactoryImpl$getSectionSearchFragmentScreen$1;-><init>(La/bhh0;)V

    .line 1120
    .line 1121
    .line 1122
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1123
    .line 1124
    .line 1125
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1126
    .line 1127
    return-object v0

    .line 1128
    :pswitch_19
    check-cast v0, La/n3b;

    .line 1129
    .line 1130
    move-object/from16 v1, p1

    .line 1131
    .line 1132
    check-cast v1, La/p3b;

    .line 1133
    .line 1134
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1135
    .line 1136
    .line 1137
    iget-object v0, v0, La/n3b;->g:Lkotlin/jvm/functions/Function1;

    .line 1138
    .line 1139
    if-eqz v0, :cond_10

    .line 1140
    .line 1141
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1142
    .line 1143
    .line 1144
    :cond_10
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1145
    .line 1146
    return-object v0

    .line 1147
    :pswitch_1a
    check-cast v0, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackView;

    .line 1148
    .line 1149
    move-object/from16 v1, p1

    .line 1150
    .line 1151
    check-cast v1, Landroid/view/View;

    .line 1152
    .line 1153
    sget v2, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackView;->c:I

    .line 1154
    .line 1155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1156
    .line 1157
    .line 1158
    iget-object v0, v0, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackView;->b:Lkotlin/jvm/functions/Function0;

    .line 1159
    .line 1160
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 1161
    .line 1162
    .line 1163
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1164
    .line 1165
    return-object v0

    .line 1166
    :pswitch_1b
    check-cast v0, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;

    .line 1167
    .line 1168
    move-object/from16 v1, p1

    .line 1169
    .line 1170
    check-cast v1, Ljava/lang/String;

    .line 1171
    .line 1172
    iput-object v1, v0, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;->c:Ljava/lang/String;

    .line 1173
    .line 1174
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1175
    .line 1176
    return-object v0

    .line 1177
    :pswitch_1c
    check-cast v0, La/mya;

    .line 1178
    .line 1179
    move-object/from16 v1, p1

    .line 1180
    .line 1181
    check-cast v1, Ljava/lang/String;

    .line 1182
    .line 1183
    new-instance v2, La/bya;

    .line 1184
    .line 1185
    new-instance v10, La/imm;

    .line 1186
    .line 1187
    new-instance v11, La/ilm;

    .line 1188
    .line 1189
    sget-object v4, La/s6t0;->a:La/pz40;

    .line 1190
    .line 1191
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v4

    .line 1195
    iget-object v4, v4, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1196
    .line 1197
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 1198
    .line 1199
    .line 1200
    move-result-wide v4

    .line 1201
    invoke-direct {v11, v4, v5}, La/ilm;-><init>(J)V

    .line 1202
    .line 1203
    .line 1204
    new-instance v12, La/plm;

    .line 1205
    .line 1206
    iget-object v0, v0, La/mya;->b:La/ctf0;

    .line 1207
    .line 1208
    new-array v4, v9, [Ljava/lang/Object;

    .line 1209
    .line 1210
    iget-object v5, v0, La/ctf0;->b:La/lsm0;

    .line 1211
    .line 1212
    invoke-static {v4, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v4

    .line 1216
    const v6, 0x7f130949

    .line 1217
    .line 1218
    .line 1219
    invoke-virtual {v5, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v4

    .line 1223
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 1224
    .line 1225
    .line 1226
    move-result-object v5

    .line 1227
    iget-object v5, v5, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1228
    .line 1229
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 1230
    .line 1231
    .line 1232
    move-result-wide v5

    .line 1233
    sget-object v7, La/fa50;->a:La/fa50;

    .line 1234
    .line 1235
    invoke-direct {v12, v4, v5, v6, v7}, La/plm;-><init>(Ljava/lang/String;JLa/ga50;)V

    .line 1236
    .line 1237
    .line 1238
    new-instance v13, La/dmm;

    .line 1239
    .line 1240
    new-instance v4, La/ta50;

    .line 1241
    .line 1242
    new-instance v14, La/wkm;

    .line 1243
    .line 1244
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v5

    .line 1248
    iget-object v5, v5, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1249
    .line 1250
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 1251
    .line 1252
    .line 1253
    move-result-wide v19

    .line 1254
    const/4 v15, 0x0

    .line 1255
    const v16, 0x7f0809ee

    .line 1256
    .line 1257
    .line 1258
    const/16 v17, 0x1

    .line 1259
    .line 1260
    sget-object v18, La/ra50;->a:La/ra50;

    .line 1261
    .line 1262
    invoke-direct/range {v14 .. v20}, La/wkm;-><init>(IIZLa/sa50;J)V

    .line 1263
    .line 1264
    .line 1265
    invoke-direct {v4, v14}, La/ta50;-><init>(La/wkm;)V

    .line 1266
    .line 1267
    .line 1268
    invoke-direct {v13, v4}, La/dmm;-><init>(La/wa50;)V

    .line 1269
    .line 1270
    .line 1271
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v4

    .line 1275
    iget-object v4, v4, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1276
    .line 1277
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 1278
    .line 1279
    .line 1280
    move-result-wide v14

    .line 1281
    const/16 v16, 0x0

    .line 1282
    .line 1283
    const/16 v17, 0x0

    .line 1284
    .line 1285
    invoke-direct/range {v10 .. v17}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 1286
    .line 1287
    .line 1288
    new-instance v11, La/imm;

    .line 1289
    .line 1290
    new-instance v12, La/ilm;

    .line 1291
    .line 1292
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v4

    .line 1296
    iget-object v4, v4, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1297
    .line 1298
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 1299
    .line 1300
    .line 1301
    move-result-wide v4

    .line 1302
    invoke-direct {v12, v4, v5}, La/ilm;-><init>(J)V

    .line 1303
    .line 1304
    .line 1305
    new-instance v13, La/nlm;

    .line 1306
    .line 1307
    new-instance v4, La/hmm;

    .line 1308
    .line 1309
    if-nez v1, :cond_11

    .line 1310
    .line 1311
    goto :goto_b

    .line 1312
    :cond_11
    move-object v3, v1

    .line 1313
    :goto_b
    new-array v1, v9, [Ljava/lang/Object;

    .line 1314
    .line 1315
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 1316
    .line 1317
    invoke-static {v1, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v1

    .line 1321
    const v5, 0x7f1311c4

    .line 1322
    .line 1323
    .line 1324
    invoke-virtual {v0, v5, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v0

    .line 1328
    const/4 v1, 0x2

    .line 1329
    invoke-direct {v4, v1, v3, v0, v8}, La/hmm;-><init>(ILjava/lang/String;Ljava/lang/String;Z)V

    .line 1330
    .line 1331
    .line 1332
    invoke-direct {v13, v4}, La/nlm;-><init>(La/hmm;)V

    .line 1333
    .line 1334
    .line 1335
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v0

    .line 1339
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1340
    .line 1341
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 1342
    .line 1343
    .line 1344
    move-result-wide v15

    .line 1345
    const/16 v17, 0x0

    .line 1346
    .line 1347
    const/16 v18, 0x0

    .line 1348
    .line 1349
    sget-object v14, La/fmm;->a:La/fmm;

    .line 1350
    .line 1351
    invoke-direct/range {v11 .. v18}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 1352
    .line 1353
    .line 1354
    invoke-direct {v2, v10, v11}, La/bya;-><init>(La/imm;La/imm;)V

    .line 1355
    .line 1356
    .line 1357
    return-object v2

    .line 1358
    nop

    .line 1359
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
