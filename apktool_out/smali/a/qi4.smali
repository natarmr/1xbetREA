.class public final synthetic La/qi4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLjava/io/Serializable;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/qi4;->a:B

    iput-wide p1, p0, La/qi4;->b:J

    iput-object p3, p0, La/qi4;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;JB)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/qi4;->a:B

    iput-object p1, p0, La/qi4;->c:Ljava/lang/Object;

    iput-wide p2, p0, La/qi4;->b:J

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
    iget-byte v1, v0, La/qi4;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x3f800000    # 1.0f

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x3

    .line 10
    const/high16 v6, 0x41800000    # 16.0f

    .line 11
    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x1

    .line 14
    const/4 v9, 0x0

    .line 15
    iget-wide v10, v0, La/qi4;->b:J

    .line 16
    .line 17
    iget-object v12, v0, La/qi4;->c:Ljava/lang/Object;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    move-object v14, v12

    .line 23
    check-cast v14, La/zco0;

    .line 24
    .line 25
    move-object/from16 v1, p1

    .line 26
    .line 27
    check-cast v1, La/k0w0;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    new-instance v13, La/fd60;

    .line 33
    .line 34
    const/16 v17, 0x0

    .line 35
    .line 36
    const/16 v18, 0x2

    .line 37
    .line 38
    iget-wide v2, v0, La/qi4;->b:J

    .line 39
    .line 40
    move-wide v15, v2

    .line 41
    invoke-direct/range {v13 .. v18}, La/fd60;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 42
    .line 43
    .line 44
    new-instance v0, La/b1w0;

    .line 45
    .line 46
    invoke-direct {v0, v13}, La/b1w0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, La/c8d;

    .line 56
    .line 57
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 58
    .line 59
    new-instance v2, La/v7d;

    .line 60
    .line 61
    invoke-direct {v2, v8, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 62
    .line 63
    .line 64
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 65
    .line 66
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object v0

    .line 69
    :pswitch_0
    check-cast v12, La/caj;

    .line 70
    .line 71
    move-object/from16 v0, p1

    .line 72
    .line 73
    check-cast v0, La/fhl;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    iget-object v1, v12, La/caj;->b:La/kmo;

    .line 79
    .line 80
    if-nez v1, :cond_0

    .line 81
    .line 82
    sget-object v1, La/qmk;->a:La/zcl;

    .line 83
    .line 84
    invoke-static {v6}, La/vgg0;->a(F)La/ugg0;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-interface {v0}, La/fhl;->d()J

    .line 89
    .line 90
    .line 91
    move-result-wide v2

    .line 92
    invoke-interface {v0}, La/fhl;->getLayoutDirection()La/k6z;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-virtual {v1, v2, v3, v4, v0}, La/cne;->a(JLa/k6z;La/w6k;)La/x1x;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-static {v0, v1, v10, v11}, La/z1x;->E(La/fhl;La/x1x;J)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_0
    sget-object v1, La/qmk;->a:La/zcl;

    .line 105
    .line 106
    const/16 v1, 0xc

    .line 107
    .line 108
    invoke-static {v6, v6, v7, v7, v1}, La/vgg0;->c(FFFFI)La/ugg0;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-interface {v0}, La/fhl;->d()J

    .line 113
    .line 114
    .line 115
    move-result-wide v2

    .line 116
    invoke-interface {v0}, La/fhl;->getLayoutDirection()La/k6z;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    invoke-virtual {v1, v2, v3, v4, v0}, La/cne;->a(JLa/k6z;La/w6k;)La/x1x;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-static {v0, v1, v10, v11}, La/z1x;->E(La/fhl;La/x1x;J)V

    .line 125
    .line 126
    .line 127
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 128
    .line 129
    return-object v0

    .line 130
    :pswitch_1
    move-object v2, v12

    .line 131
    check-cast v2, La/g2g0;

    .line 132
    .line 133
    move-object/from16 v7, p1

    .line 134
    .line 135
    check-cast v7, La/k0w0;

    .line 136
    .line 137
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    new-instance v1, La/uw;

    .line 141
    .line 142
    const/4 v5, 0x0

    .line 143
    const/4 v6, 0x4

    .line 144
    iget-wide v3, v0, La/qi4;->b:J

    .line 145
    .line 146
    invoke-direct/range {v1 .. v6}, La/uw;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 147
    .line 148
    .line 149
    new-instance v0, La/b1w0;

    .line 150
    .line 151
    invoke-direct {v0, v1}, La/b1w0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v7, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v0, La/c8d;

    .line 161
    .line 162
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 163
    .line 164
    new-instance v2, La/v7d;

    .line 165
    .line 166
    invoke-direct {v2, v8, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 167
    .line 168
    .line 169
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 170
    .line 171
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 172
    .line 173
    return-object v0

    .line 174
    :pswitch_2
    check-cast v12, La/iij;

    .line 175
    .line 176
    move-object/from16 v0, p1

    .line 177
    .line 178
    check-cast v0, La/k0w0;

    .line 179
    .line 180
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    iget-object v1, v12, La/iij;->e:Ljava/lang/Object;

    .line 184
    .line 185
    move-object v12, v1

    .line 186
    check-cast v12, La/vjp;

    .line 187
    .line 188
    sget-object v13, La/j700;->b:La/j700;

    .line 189
    .line 190
    new-instance v14, La/d8h0;

    .line 191
    .line 192
    invoke-direct {v14, v5, v9}, La/d8h0;-><init>(ILjava/util/Set;)V

    .line 193
    .line 194
    .line 195
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    invoke-static {v1}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 200
    .line 201
    .line 202
    move-result-object v15

    .line 203
    const-string v18, ""

    .line 204
    .line 205
    const-wide/16 v16, -0x1

    .line 206
    .line 207
    invoke-virtual/range {v12 .. v18}, La/vjp;->b(La/j700;La/f9h0;Ljava/util/Set;JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 212
    .line 213
    .line 214
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 215
    .line 216
    return-object v0

    .line 217
    :pswitch_3
    check-cast v12, La/tjb0;

    .line 218
    .line 219
    move-object/from16 v0, p1

    .line 220
    .line 221
    check-cast v0, La/k0w0;

    .line 222
    .line 223
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    iget-object v13, v12, La/tjb0;->l:La/vjp;

    .line 227
    .line 228
    sget-object v14, La/j700;->b:La/j700;

    .line 229
    .line 230
    new-instance v15, La/d8h0;

    .line 231
    .line 232
    invoke-direct {v15, v5, v9}, La/d8h0;-><init>(ILjava/util/Set;)V

    .line 233
    .line 234
    .line 235
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    invoke-static {v1}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 240
    .line 241
    .line 242
    move-result-object v16

    .line 243
    const-string v19, ""

    .line 244
    .line 245
    const-wide/16 v17, -0x1

    .line 246
    .line 247
    invoke-virtual/range {v13 .. v19}, La/vjp;->b(La/j700;La/f9h0;Ljava/util/Set;JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 252
    .line 253
    .line 254
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 255
    .line 256
    return-object v0

    .line 257
    :pswitch_4
    check-cast v12, La/v3b0;

    .line 258
    .line 259
    move-object/from16 v0, p1

    .line 260
    .line 261
    check-cast v0, Ljava/lang/Throwable;

    .line 262
    .line 263
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    new-instance v1, La/e3b0;

    .line 267
    .line 268
    invoke-direct {v1, v4, v10, v11}, La/e3b0;-><init>(BJ)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v12, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 275
    .line 276
    .line 277
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 278
    .line 279
    return-object v0

    .line 280
    :pswitch_5
    check-cast v12, La/gl60;

    .line 281
    .line 282
    move-object/from16 v0, p1

    .line 283
    .line 284
    check-cast v0, La/k0w0;

    .line 285
    .line 286
    iget-object v1, v12, La/gl60;->s:La/r990;

    .line 287
    .line 288
    iget-object v2, v12, La/gl60;->t:La/rqt;

    .line 289
    .line 290
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    new-instance v2, Lorg/xplatform/feature/office/payment/impl/di/navigation/PaymentScreenFactoryImpl$getPaymentScreen$1;

    .line 297
    .line 298
    invoke-direct {v2, v1, v8, v10, v11}, Lorg/xplatform/feature/office/payment/impl/di/navigation/PaymentScreenFactoryImpl$getPaymentScreen$1;-><init>(La/r990;ZJ)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v0, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 302
    .line 303
    .line 304
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 305
    .line 306
    return-object v0

    .line 307
    :pswitch_6
    check-cast v12, La/d650;

    .line 308
    .line 309
    move-object/from16 v0, p1

    .line 310
    .line 311
    check-cast v0, Ljava/lang/Throwable;

    .line 312
    .line 313
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    iget-object v1, v12, La/d650;->g1:La/p7m0;

    .line 317
    .line 318
    :cond_1
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    move-object v2, v0

    .line 323
    check-cast v2, Ljava/util/List;

    .line 324
    .line 325
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    check-cast v2, Ljava/lang/Iterable;

    .line 330
    .line 331
    new-instance v3, Ljava/util/ArrayList;

    .line 332
    .line 333
    const/16 v4, 0xa

    .line 334
    .line 335
    invoke-static {v2, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 336
    .line 337
    .line 338
    move-result v4

    .line 339
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 340
    .line 341
    .line 342
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 343
    .line 344
    .line 345
    move-result-object v2

    .line 346
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 347
    .line 348
    .line 349
    move-result v4

    .line 350
    if-eqz v4, :cond_3

    .line 351
    .line 352
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v4

    .line 356
    check-cast v4, La/ef40;

    .line 357
    .line 358
    instance-of v5, v4, La/qe40;

    .line 359
    .line 360
    if-eqz v5, :cond_2

    .line 361
    .line 362
    move-object v5, v4

    .line 363
    check-cast v5, La/qe40;

    .line 364
    .line 365
    iget-object v5, v5, La/qe40;->a:La/x4t;

    .line 366
    .line 367
    instance-of v6, v5, La/r4t;

    .line 368
    .line 369
    if-eqz v6, :cond_2

    .line 370
    .line 371
    move-object v6, v5

    .line 372
    check-cast v6, La/r4t;

    .line 373
    .line 374
    iget-wide v6, v6, La/r4t;->a:J

    .line 375
    .line 376
    cmp-long v6, v6, v10

    .line 377
    .line 378
    if-nez v6, :cond_2

    .line 379
    .line 380
    new-instance v4, La/qe40;

    .line 381
    .line 382
    sget-object v6, La/obj;->a:La/obj;

    .line 383
    .line 384
    invoke-direct {v4, v5, v6}, La/qe40;-><init>(La/x4t;La/vbj;)V

    .line 385
    .line 386
    .line 387
    :cond_2
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    goto :goto_1

    .line 391
    :cond_3
    invoke-virtual {v1, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 392
    .line 393
    .line 394
    move-result v0

    .line 395
    if-eqz v0, :cond_1

    .line 396
    .line 397
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 398
    .line 399
    return-object v0

    .line 400
    :pswitch_7
    check-cast v12, La/j340;

    .line 401
    .line 402
    move-object/from16 v1, p1

    .line 403
    .line 404
    check-cast v1, La/k0w0;

    .line 405
    .line 406
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    iget-object v2, v12, La/j340;->W:La/peg0;

    .line 410
    .line 411
    new-instance v4, La/fr1;

    .line 412
    .line 413
    new-instance v10, La/fs80;

    .line 414
    .line 415
    const/16 v18, 0x0

    .line 416
    .line 417
    const/16 v19, 0x7c

    .line 418
    .line 419
    const-string v11, ""

    .line 420
    .line 421
    iget-wide v12, v0, La/qi4;->b:J

    .line 422
    .line 423
    const/4 v14, 0x0

    .line 424
    const/4 v15, 0x0

    .line 425
    const-wide/16 v16, 0x0

    .line 426
    .line 427
    invoke-direct/range {v10 .. v19}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    .line 428
    .line 429
    .line 430
    invoke-direct {v4, v10, v9, v3}, La/fr1;-><init>(La/fs80;La/q91;I)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v2, v4}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 438
    .line 439
    .line 440
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 441
    .line 442
    return-object v0

    .line 443
    :pswitch_8
    check-cast v12, La/zaz;

    .line 444
    .line 445
    move-object/from16 v0, p1

    .line 446
    .line 447
    check-cast v0, La/t33;

    .line 448
    .line 449
    invoke-virtual {v0}, La/t33;->d()Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    check-cast v0, La/ikx;

    .line 454
    .line 455
    iget-wide v0, v0, La/ikx;->a:J

    .line 456
    .line 457
    invoke-static {v0, v1, v10, v11}, La/ikx;->c(JJ)J

    .line 458
    .line 459
    .line 460
    move-result-wide v0

    .line 461
    invoke-virtual {v12, v0, v1}, La/zaz;->e(J)V

    .line 462
    .line 463
    .line 464
    iget-object v0, v12, La/zaz;->c:La/y2x;

    .line 465
    .line 466
    invoke-virtual {v0}, La/y2x;->invoke()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 470
    .line 471
    return-object v0

    .line 472
    :pswitch_9
    check-cast v12, La/n3w;

    .line 473
    .line 474
    move-object/from16 v1, p1

    .line 475
    .line 476
    check-cast v1, La/k0w0;

    .line 477
    .line 478
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 479
    .line 480
    .line 481
    new-instance v13, Lorg/xplatform/bethistory/transaction_history/presentation/TransactionHistoryScreenOld;

    .line 482
    .line 483
    iget-object v2, v12, La/n3w;->c:La/s77;

    .line 484
    .line 485
    iget-byte v2, v2, La/s77;->a:B

    .line 486
    .line 487
    iget-object v3, v12, La/n3w;->a:Ljava/lang/String;

    .line 488
    .line 489
    iget-object v4, v12, La/n3w;->b:Ljava/lang/String;

    .line 490
    .line 491
    iget-wide v5, v12, La/n3w;->j:J

    .line 492
    .line 493
    iget-object v7, v12, La/n3w;->m1:Ljava/lang/String;

    .line 494
    .line 495
    iget-object v8, v12, La/n3w;->f:Ljava/lang/String;

    .line 496
    .line 497
    iget-wide v14, v12, La/n3w;->o:D

    .line 498
    .line 499
    iget-object v9, v12, La/n3w;->g:Ljava/lang/String;

    .line 500
    .line 501
    iget-wide v10, v12, La/n3w;->m:D

    .line 502
    .line 503
    move/from16 v20, v2

    .line 504
    .line 505
    move-object/from16 v25, v3

    .line 506
    .line 507
    iget-wide v2, v12, La/n3w;->n:D

    .line 508
    .line 509
    move-wide/from16 v18, v2

    .line 510
    .line 511
    iget-wide v2, v0, La/qi4;->b:J

    .line 512
    .line 513
    move-wide/from16 v21, v2

    .line 514
    .line 515
    move-object/from16 v26, v4

    .line 516
    .line 517
    move-wide/from16 v23, v5

    .line 518
    .line 519
    move-object/from16 v27, v7

    .line 520
    .line 521
    move-object/from16 v28, v8

    .line 522
    .line 523
    move-object/from16 v29, v9

    .line 524
    .line 525
    move-wide/from16 v16, v10

    .line 526
    .line 527
    invoke-direct/range {v13 .. v29}, Lorg/xplatform/bethistory/transaction_history/presentation/TransactionHistoryScreenOld;-><init>(DDDIJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v1, v13}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 531
    .line 532
    .line 533
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 534
    .line 535
    return-object v0

    .line 536
    :pswitch_a
    check-cast v12, La/cr;

    .line 537
    .line 538
    move-object/from16 v0, p1

    .line 539
    .line 540
    check-cast v0, La/k0w0;

    .line 541
    .line 542
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 543
    .line 544
    .line 545
    iget-object v1, v12, La/cr;->h:Ljava/lang/Object;

    .line 546
    .line 547
    check-cast v1, La/peg0;

    .line 548
    .line 549
    new-instance v2, La/fr1;

    .line 550
    .line 551
    new-instance v13, La/fs80;

    .line 552
    .line 553
    iget-object v4, v12, La/cr;->c:Ljava/lang/Object;

    .line 554
    .line 555
    check-cast v4, La/us00;

    .line 556
    .line 557
    const v5, 0x7f13015a

    .line 558
    .line 559
    .line 560
    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 561
    .line 562
    .line 563
    move-result-object v14

    .line 564
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 565
    .line 566
    .line 567
    sget-object v4, La/nw80;->b:La/nw80;

    .line 568
    .line 569
    invoke-virtual {v4}, La/nw80;->getId()J

    .line 570
    .line 571
    .line 572
    move-result-wide v15

    .line 573
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 574
    .line 575
    .line 576
    move-result-object v4

    .line 577
    invoke-static {v4}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 578
    .line 579
    .line 580
    move-result-object v18

    .line 581
    const/16 v21, 0x0

    .line 582
    .line 583
    const/16 v22, 0x74

    .line 584
    .line 585
    const/16 v17, 0x0

    .line 586
    .line 587
    const-wide/16 v19, 0x0

    .line 588
    .line 589
    invoke-direct/range {v13 .. v22}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    .line 590
    .line 591
    .line 592
    invoke-direct {v2, v13, v9, v3}, La/fr1;-><init>(La/fs80;La/q91;I)V

    .line 593
    .line 594
    .line 595
    invoke-virtual {v1, v2}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 596
    .line 597
    .line 598
    move-result-object v1

    .line 599
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 600
    .line 601
    .line 602
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 603
    .line 604
    return-object v0

    .line 605
    :pswitch_b
    check-cast v12, La/k1g;

    .line 606
    .line 607
    move-object/from16 v0, p1

    .line 608
    .line 609
    check-cast v0, La/n1g;

    .line 610
    .line 611
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 612
    .line 613
    .line 614
    iput-wide v10, v0, La/n1g;->c:J

    .line 615
    .line 616
    sget-object v1, La/j1g;->c:La/j1g;

    .line 617
    .line 618
    iput-object v1, v0, La/n1g;->d:La/j1g;

    .line 619
    .line 620
    new-instance v1, La/sq2;

    .line 621
    .line 622
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 623
    .line 624
    .line 625
    iput-object v1, v0, La/n1g;->e:La/ms2;

    .line 626
    .line 627
    sget-object v1, La/l1g;->b:La/l1g;

    .line 628
    .line 629
    iput-object v1, v0, La/n1g;->f:La/l1g;

    .line 630
    .line 631
    iput-object v12, v0, La/n1g;->g:La/k1g;

    .line 632
    .line 633
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 634
    .line 635
    return-object v0

    .line 636
    :pswitch_c
    check-cast v12, La/xcz;

    .line 637
    .line 638
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
    invoke-virtual {v12}, La/xcz;->j()La/mcz;

    .line 646
    .line 647
    .line 648
    move-result-object v2

    .line 649
    sget-object v3, La/qmk;->a:La/zcl;

    .line 650
    .line 651
    invoke-interface {v1, v6}, La/w6k;->w0(F)F

    .line 652
    .line 653
    .line 654
    move-result v18

    .line 655
    const/high16 v3, 0x41000000    # 8.0f

    .line 656
    .line 657
    invoke-interface {v1, v3}, La/w6k;->w0(F)F

    .line 658
    .line 659
    .line 660
    move-result v21

    .line 661
    iget v3, v2, La/mcz;->m:I

    .line 662
    .line 663
    neg-int v3, v3

    .line 664
    new-instance v14, La/mie0;

    .line 665
    .line 666
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 667
    .line 668
    .line 669
    new-instance v22, La/jie0;

    .line 670
    .line 671
    invoke-direct/range {v22 .. v22}, Ljava/lang/Object;-><init>()V

    .line 672
    .line 673
    .line 674
    new-instance v16, La/jie0;

    .line 675
    .line 676
    invoke-direct/range {v16 .. v16}, Ljava/lang/Object;-><init>()V

    .line 677
    .line 678
    .line 679
    new-instance v15, La/hie0;

    .line 680
    .line 681
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 682
    .line 683
    .line 684
    new-instance v13, La/qbg;

    .line 685
    .line 686
    iget-wide v4, v0, La/qi4;->b:J

    .line 687
    .line 688
    move-object/from16 v17, v1

    .line 689
    .line 690
    move-wide/from16 v19, v4

    .line 691
    .line 692
    invoke-direct/range {v13 .. v22}, La/qbg;-><init>(La/mie0;La/hie0;La/jie0;La/fhl;FJFLa/jie0;)V

    .line 693
    .line 694
    .line 695
    move-object/from16 v4, v16

    .line 696
    .line 697
    move/from16 v0, v18

    .line 698
    .line 699
    move-object/from16 v1, v22

    .line 700
    .line 701
    iget-object v2, v2, La/mcz;->l:Ljava/util/List;

    .line 702
    .line 703
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 704
    .line 705
    .line 706
    move-result-object v2

    .line 707
    :cond_4
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 708
    .line 709
    .line 710
    move-result v5

    .line 711
    if-eqz v5, :cond_9

    .line 712
    .line 713
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 714
    .line 715
    .line 716
    move-result-object v5

    .line 717
    check-cast v5, La/ncz;

    .line 718
    .line 719
    iget-object v6, v5, La/ncz;->l:Ljava/lang/Object;

    .line 720
    .line 721
    iget-object v7, v5, La/ncz;->m:Ljava/lang/Object;

    .line 722
    .line 723
    instance-of v8, v6, Ljava/lang/String;

    .line 724
    .line 725
    if-eqz v8, :cond_5

    .line 726
    .line 727
    check-cast v6, Ljava/lang/String;

    .line 728
    .line 729
    goto :goto_3

    .line 730
    :cond_5
    move-object v6, v9

    .line 731
    :goto_3
    if-eqz v6, :cond_4

    .line 732
    .line 733
    const-string v8, "sub_game_gap"

    .line 734
    .line 735
    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 736
    .line 737
    .line 738
    move-result v8

    .line 739
    if-eqz v8, :cond_6

    .line 740
    .line 741
    goto :goto_2

    .line 742
    :cond_6
    const-string v8, "_"

    .line 743
    .line 744
    invoke-static {v6, v8}, Lkotlin/text/StringsKt;->r0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 745
    .line 746
    .line 747
    move-result-object v6

    .line 748
    iget v8, v5, La/ncz;->p:I

    .line 749
    .line 750
    add-int/2addr v8, v3

    .line 751
    int-to-float v8, v8

    .line 752
    iget-object v10, v14, La/mie0;->a:Ljava/lang/Object;

    .line 753
    .line 754
    invoke-virtual {v6, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 755
    .line 756
    .line 757
    move-result v10

    .line 758
    if-nez v10, :cond_8

    .line 759
    .line 760
    invoke-virtual {v13}, La/qbg;->invoke()Ljava/lang/Object;

    .line 761
    .line 762
    .line 763
    iput-object v6, v14, La/mie0;->a:Ljava/lang/Object;

    .line 764
    .line 765
    const-string v6, "sub_game_header"

    .line 766
    .line 767
    invoke-static {v7, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 768
    .line 769
    .line 770
    move-result v6

    .line 771
    if-eqz v6, :cond_7

    .line 772
    .line 773
    move v6, v8

    .line 774
    goto :goto_4

    .line 775
    :cond_7
    neg-float v6, v0

    .line 776
    :goto_4
    iput v6, v1, La/jie0;->a:F

    .line 777
    .line 778
    :cond_8
    iget v5, v5, La/ncz;->q:I

    .line 779
    .line 780
    int-to-float v5, v5

    .line 781
    add-float/2addr v8, v5

    .line 782
    iput v8, v4, La/jie0;->a:F

    .line 783
    .line 784
    const-string v5, "sub_game_footer"

    .line 785
    .line 786
    invoke-static {v7, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 787
    .line 788
    .line 789
    move-result v5

    .line 790
    iput-boolean v5, v15, La/hie0;->a:Z

    .line 791
    .line 792
    goto :goto_2

    .line 793
    :cond_9
    invoke-virtual {v13}, La/qbg;->invoke()Ljava/lang/Object;

    .line 794
    .line 795
    .line 796
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 797
    .line 798
    return-object v0

    .line 799
    :pswitch_d
    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 800
    .line 801
    move-object/from16 v13, p1

    .line 802
    .line 803
    check-cast v13, La/fhl;

    .line 804
    .line 805
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 806
    .line 807
    .line 808
    invoke-interface {v12}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 809
    .line 810
    .line 811
    move-result-object v1

    .line 812
    check-cast v1, Ljava/lang/Number;

    .line 813
    .line 814
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 815
    .line 816
    .line 817
    move-result v1

    .line 818
    sub-float v1, v2, v1

    .line 819
    .line 820
    const v3, 0x3f2aaaab

    .line 821
    .line 822
    .line 823
    cmpl-float v4, v1, v3

    .line 824
    .line 825
    if-lez v4, :cond_a

    .line 826
    .line 827
    sub-float v3, v1, v3

    .line 828
    .line 829
    const v4, 0x3eaaaaaa

    .line 830
    .line 831
    .line 832
    div-float/2addr v3, v4

    .line 833
    invoke-static {v3, v7, v2}, La/l1e0;->c(FFF)F

    .line 834
    .line 835
    .line 836
    move-result v19

    .line 837
    invoke-interface {v13}, La/fhl;->d()J

    .line 838
    .line 839
    .line 840
    move-result-wide v2

    .line 841
    invoke-static {v2, v3}, La/h7k0;->d(J)F

    .line 842
    .line 843
    .line 844
    move-result v2

    .line 845
    const/high16 v3, 0x40000000    # 2.0f

    .line 846
    .line 847
    div-float/2addr v2, v3

    .line 848
    mul-float v16, v2, v1

    .line 849
    .line 850
    const/16 v20, 0x0

    .line 851
    .line 852
    const/16 v21, 0x74

    .line 853
    .line 854
    iget-wide v14, v0, La/qi4;->b:J

    .line 855
    .line 856
    const-wide/16 v17, 0x0

    .line 857
    .line 858
    invoke-static/range {v13 .. v21}, La/fhl;->E(La/fhl;JFJFLa/agc;I)V

    .line 859
    .line 860
    .line 861
    :cond_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 862
    .line 863
    return-object v0

    .line 864
    :pswitch_e
    check-cast v12, La/h2b;

    .line 865
    .line 866
    move-object/from16 v0, p1

    .line 867
    .line 868
    check-cast v0, La/k0w0;

    .line 869
    .line 870
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 871
    .line 872
    .line 873
    iget-object v1, v12, La/h2b;->o:La/uf3;

    .line 874
    .line 875
    iget-object v1, v1, La/uf3;->a:La/oct;

    .line 876
    .line 877
    iget-object v1, v1, La/oct;->b:La/r9u;

    .line 878
    .line 879
    sget-object v2, La/ygp;->y1:La/ygp;

    .line 880
    .line 881
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 882
    .line 883
    .line 884
    iget-object v1, v1, La/r9u;->a:La/j1q0;

    .line 885
    .line 886
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 887
    .line 888
    .line 889
    iget-object v1, v1, La/j1q0;->a:La/m1q0;

    .line 890
    .line 891
    invoke-virtual {v1, v2}, La/m1q0;->d(La/ygp;)Z

    .line 892
    .line 893
    .line 894
    move-result v1

    .line 895
    if-eqz v1, :cond_b

    .line 896
    .line 897
    new-instance v1, Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$CashbackChoosingFragmentScreen;

    .line 898
    .line 899
    invoke-direct {v1, v10, v11}, Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$CashbackChoosingFragmentScreen;-><init>(J)V

    .line 900
    .line 901
    .line 902
    goto :goto_5

    .line 903
    :cond_b
    new-instance v1, Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$CashbackChoosingFragmentScreenOld;

    .line 904
    .line 905
    invoke-direct {v1, v10, v11}, Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$CashbackChoosingFragmentScreenOld;-><init>(J)V

    .line 906
    .line 907
    .line 908
    :goto_5
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 909
    .line 910
    .line 911
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 912
    .line 913
    return-object v0

    .line 914
    :pswitch_f
    move-object v0, v12

    .line 915
    check-cast v0, La/dk6;

    .line 916
    .line 917
    move-object/from16 v1, p1

    .line 918
    .line 919
    check-cast v1, Ljava/lang/Throwable;

    .line 920
    .line 921
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 922
    .line 923
    .line 924
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 925
    .line 926
    .line 927
    iget-object v1, v0, La/dk6;->w:La/owp0;

    .line 928
    .line 929
    sget-object v2, La/idf0;->a:La/idf0;

    .line 930
    .line 931
    invoke-virtual {v1, v2}, La/owp0;->g(La/ldf0;)V

    .line 932
    .line 933
    .line 934
    iget-object v1, v0, La/dk6;->x:La/ikt0;

    .line 935
    .line 936
    sget-object v2, La/lx7;->a:La/lx7;

    .line 937
    .line 938
    invoke-virtual {v1, v2}, La/ikt0;->b(La/px7;)V

    .line 939
    .line 940
    .line 941
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 942
    .line 943
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 944
    .line 945
    :cond_c
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 946
    .line 947
    .line 948
    move-result-object v2

    .line 949
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 950
    .line 951
    .line 952
    iget-object v3, v0, La/i3t0;->f:La/oyg0;

    .line 953
    .line 954
    move-object v12, v2

    .line 955
    check-cast v12, La/hj6;

    .line 956
    .line 957
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 958
    .line 959
    .line 960
    new-instance v14, La/ii6;

    .line 961
    .line 962
    invoke-direct {v14, v10, v11}, La/ii6;-><init>(J)V

    .line 963
    .line 964
    .line 965
    const/16 v20, 0x0

    .line 966
    .line 967
    const/16 v21, 0x1ffd

    .line 968
    .line 969
    const/4 v13, 0x0

    .line 970
    const/4 v15, 0x0

    .line 971
    const/16 v16, 0x0

    .line 972
    .line 973
    const/16 v17, 0x0

    .line 974
    .line 975
    const/16 v18, 0x0

    .line 976
    .line 977
    const/16 v19, 0x0

    .line 978
    .line 979
    invoke-static/range {v12 .. v21}, La/hj6;->a(La/hj6;ZLa/ji6;La/l9s;Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;ZLjava/util/List;I)La/hj6;

    .line 980
    .line 981
    .line 982
    move-result-object v3

    .line 983
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 984
    .line 985
    .line 986
    move-result v2

    .line 987
    if-eqz v2, :cond_c

    .line 988
    .line 989
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 990
    .line 991
    return-object v0

    .line 992
    :pswitch_10
    check-cast v12, Ljava/util/ArrayList;

    .line 993
    .line 994
    move-object/from16 v0, p1

    .line 995
    .line 996
    check-cast v0, La/ou90;

    .line 997
    .line 998
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 999
    .line 1000
    .line 1001
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v1

    .line 1005
    :cond_d
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1006
    .line 1007
    .line 1008
    move-result v3

    .line 1009
    if-eqz v3, :cond_11

    .line 1010
    .line 1011
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v3

    .line 1015
    check-cast v3, La/pu90;

    .line 1016
    .line 1017
    invoke-virtual {v3}, La/pu90;->n()Ljava/lang/Object;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v5

    .line 1021
    instance-of v6, v5, La/p6z;

    .line 1022
    .line 1023
    if-eqz v6, :cond_e

    .line 1024
    .line 1025
    check-cast v5, La/p6z;

    .line 1026
    .line 1027
    goto :goto_7

    .line 1028
    :cond_e
    move-object v5, v9

    .line 1029
    :goto_7
    if-eqz v5, :cond_f

    .line 1030
    .line 1031
    invoke-interface {v5}, La/p6z;->g0()Ljava/lang/Object;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v5

    .line 1035
    goto :goto_8

    .line 1036
    :cond_f
    move-object v5, v9

    .line 1037
    :goto_8
    const-string v6, "AUTH_LOGIN_VISUAL_CONTENT"

    .line 1038
    .line 1039
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1040
    .line 1041
    .line 1042
    move-result v6

    .line 1043
    if-eqz v6, :cond_10

    .line 1044
    .line 1045
    invoke-static {v10, v11}, La/p4e;->h(J)I

    .line 1046
    .line 1047
    .line 1048
    move-result v5

    .line 1049
    iget v6, v3, La/pu90;->b:I

    .line 1050
    .line 1051
    sub-int/2addr v5, v6

    .line 1052
    invoke-virtual {v0, v3, v4, v5, v2}, La/ou90;->m(La/pu90;IIF)V

    .line 1053
    .line 1054
    .line 1055
    goto :goto_6

    .line 1056
    :cond_10
    const-string v6, "AUTH_LOGIN_VISUAL_BACKGROUND"

    .line 1057
    .line 1058
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1059
    .line 1060
    .line 1061
    move-result v5

    .line 1062
    if-eqz v5, :cond_d

    .line 1063
    .line 1064
    invoke-virtual {v0, v3, v4, v4, v7}, La/ou90;->m(La/pu90;IIF)V

    .line 1065
    .line 1066
    .line 1067
    goto :goto_6

    .line 1068
    :cond_11
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1069
    .line 1070
    return-object v0

    .line 1071
    :pswitch_data_0
    .packed-switch 0x0
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
