.class public final synthetic La/ec3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/ec3;->a:B

    iput-object p1, p0, La/ec3;->c:Ljava/lang/Object;

    iput p2, p0, La/ec3;->b:I

    iput-object p3, p0, La/ec3;->d:Ljava/lang/Object;

    iput-object p4, p0, La/ec3;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p5, p0, La/ec3;->a:B

    iput-object p1, p0, La/ec3;->c:Ljava/lang/Object;

    iput-object p2, p0, La/ec3;->d:Ljava/lang/Object;

    iput p3, p0, La/ec3;->b:I

    iput-object p4, p0, La/ec3;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V
    .locals 0

    .line 3
    iput-byte p5, p0, La/ec3;->a:B

    iput-object p1, p0, La/ec3;->c:Ljava/lang/Object;

    iput-object p2, p0, La/ec3;->d:Ljava/lang/Object;

    iput-object p3, p0, La/ec3;->e:Ljava/lang/Object;

    iput p4, p0, La/ec3;->b:I

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
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v2, v0, La/ec3;->a:B

    .line 6
    .line 7
    const/16 v3, 0x20

    .line 8
    .line 9
    const v4, 0x3f666666    # 0.9f

    .line 10
    .line 11
    .line 12
    const/high16 v5, 0x3f800000    # 1.0f

    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x0

    .line 17
    const/4 v9, 0x1

    .line 18
    iget v10, v0, La/ec3;->b:I

    .line 19
    .line 20
    iget-object v11, v0, La/ec3;->e:Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v12, v0, La/ec3;->d:Ljava/lang/Object;

    .line 23
    .line 24
    iget-object v13, v0, La/ec3;->c:Ljava/lang/Object;

    .line 25
    .line 26
    packed-switch v2, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    check-cast v13, La/xk80;

    .line 30
    .line 31
    check-cast v12, La/l7m0;

    .line 32
    .line 33
    check-cast v11, La/l7m0;

    .line 34
    .line 35
    move-object v0, v1

    .line 36
    check-cast v0, La/uag0;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v13}, La/xk80;->k()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    sub-int/2addr v1, v10

    .line 46
    int-to-float v1, v1

    .line 47
    invoke-virtual {v13}, La/xk80;->l()F

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    add-float/2addr v2, v1

    .line 52
    iget-wide v7, v0, La/uag0;->r:J

    .line 53
    .line 54
    shr-long/2addr v7, v3

    .line 55
    long-to-int v1, v7

    .line 56
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    mul-float/2addr v1, v2

    .line 61
    invoke-virtual {v0, v1}, La/uag0;->H(F)V

    .line 62
    .line 63
    .line 64
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, Ljava/lang/Number;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    cmpg-float v1, v1, v6

    .line 75
    .line 76
    if-nez v1, :cond_0

    .line 77
    .line 78
    move v1, v4

    .line 79
    goto :goto_0

    .line 80
    :cond_0
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, Ljava/lang/Number;

    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    :goto_0
    invoke-virtual {v0, v1}, La/uag0;->w(F)V

    .line 91
    .line 92
    .line 93
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    check-cast v1, Ljava/lang/Number;

    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    cmpg-float v1, v1, v6

    .line 104
    .line 105
    if-nez v1, :cond_1

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_1
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    check-cast v1, Ljava/lang/Number;

    .line 113
    .line 114
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    :goto_1
    invoke-virtual {v0, v4}, La/uag0;->y(F)V

    .line 119
    .line 120
    .line 121
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    check-cast v1, Ljava/lang/Number;

    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    invoke-virtual {v0, v1}, La/uag0;->b(F)V

    .line 132
    .line 133
    .line 134
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 135
    .line 136
    return-object v0

    .line 137
    :pswitch_0
    check-cast v13, La/v3b0;

    .line 138
    .line 139
    check-cast v12, La/mlr;

    .line 140
    .line 141
    move-object/from16 v28, v11

    .line 142
    .line 143
    check-cast v28, Ljava/lang/String;

    .line 144
    .line 145
    check-cast v1, La/k0w0;

    .line 146
    .line 147
    iget-object v2, v13, La/v3b0;->L:La/jdk0;

    .line 148
    .line 149
    iget-wide v14, v12, La/mlr;->a:J

    .line 150
    .line 151
    iget-object v3, v12, La/mlr;->f:Ljava/lang/String;

    .line 152
    .line 153
    iget-wide v4, v12, La/mlr;->c:J

    .line 154
    .line 155
    iget-boolean v6, v12, La/mlr;->l:Z

    .line 156
    .line 157
    iget-wide v7, v12, La/mlr;->b:J

    .line 158
    .line 159
    iget-boolean v10, v12, La/mlr;->m:Z

    .line 160
    .line 161
    iget-boolean v11, v12, La/mlr;->n:Z

    .line 162
    .line 163
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    const/16 v23, 0x0

    .line 167
    .line 168
    iget v0, v0, La/ec3;->b:I

    .line 169
    .line 170
    const/16 v26, 0x0

    .line 171
    .line 172
    const/16 v27, 0x0

    .line 173
    .line 174
    const/16 v29, 0x1

    .line 175
    .line 176
    move/from16 v24, v0

    .line 177
    .line 178
    move-object/from16 v16, v3

    .line 179
    .line 180
    move-wide/from16 v17, v4

    .line 181
    .line 182
    move/from16 v19, v6

    .line 183
    .line 184
    move-wide/from16 v20, v7

    .line 185
    .line 186
    move/from16 v22, v10

    .line 187
    .line 188
    move/from16 v25, v11

    .line 189
    .line 190
    invoke-static/range {v14 .. v29}, La/jdk0;->f(JLjava/lang/String;JZJZZIZZZLjava/lang/String;Z)Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorPreloadGameScreen;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v0, La/c8d;

    .line 201
    .line 202
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 203
    .line 204
    iget-boolean v2, v12, La/mlr;->n:Z

    .line 205
    .line 206
    xor-int/2addr v2, v9

    .line 207
    new-instance v3, La/v7d;

    .line 208
    .line 209
    invoke-direct {v3, v2, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 210
    .line 211
    .line 212
    iput-object v3, v0, La/c8d;->a:La/w7d;

    .line 213
    .line 214
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 215
    .line 216
    return-object v0

    .line 217
    :pswitch_1
    check-cast v13, La/gt50;

    .line 218
    .line 219
    check-cast v12, Ljava/lang/String;

    .line 220
    .line 221
    check-cast v11, La/mvc;

    .line 222
    .line 223
    move-object v0, v1

    .line 224
    check-cast v0, La/k0w0;

    .line 225
    .line 226
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    iget-object v1, v13, La/gt50;->v:La/uzc0;

    .line 230
    .line 231
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    new-instance v1, Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getNewsCatalogTypeScreen$1;

    .line 241
    .line 242
    invoke-direct {v1, v10, v12, v11}, Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getNewsCatalogTypeScreen$1;-><init>(ILjava/lang/String;La/mvc;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 246
    .line 247
    .line 248
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 249
    .line 250
    return-object v0

    .line 251
    :pswitch_2
    check-cast v13, La/xp50;

    .line 252
    .line 253
    check-cast v12, Ljava/lang/String;

    .line 254
    .line 255
    check-cast v11, La/mvc;

    .line 256
    .line 257
    move-object v0, v1

    .line 258
    check-cast v0, La/k0w0;

    .line 259
    .line 260
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    iget-object v1, v13, La/xp50;->v:La/uzc0;

    .line 264
    .line 265
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    new-instance v1, Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getNewsCatalogTypeScreen$1;

    .line 275
    .line 276
    invoke-direct {v1, v10, v12, v11}, Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getNewsCatalogTypeScreen$1;-><init>(ILjava/lang/String;La/mvc;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 280
    .line 281
    .line 282
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 283
    .line 284
    return-object v0

    .line 285
    :pswitch_3
    check-cast v13, La/ip50;

    .line 286
    .line 287
    check-cast v12, Ljava/lang/String;

    .line 288
    .line 289
    check-cast v11, La/mvc;

    .line 290
    .line 291
    move-object v0, v1

    .line 292
    check-cast v0, La/k0w0;

    .line 293
    .line 294
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    iget-object v1, v13, La/ip50;->v:La/uzc0;

    .line 298
    .line 299
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    new-instance v1, Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getNewsCatalogTypeScreen$1;

    .line 309
    .line 310
    invoke-direct {v1, v10, v12, v11}, Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getNewsCatalogTypeScreen$1;-><init>(ILjava/lang/String;La/mvc;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 314
    .line 315
    .line 316
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 317
    .line 318
    return-object v0

    .line 319
    :pswitch_4
    check-cast v13, La/ylw;

    .line 320
    .line 321
    check-cast v12, La/vj30;

    .line 322
    .line 323
    check-cast v11, La/pu90;

    .line 324
    .line 325
    move-object v0, v1

    .line 326
    check-cast v0, La/ou90;

    .line 327
    .line 328
    iget v1, v13, La/ylw;->c:I

    .line 329
    .line 330
    iget-object v14, v13, La/ylw;->b:La/d7q0;

    .line 331
    .line 332
    iget-object v2, v13, La/ylw;->d:La/nls0;

    .line 333
    .line 334
    iget-object v3, v13, La/ylw;->e:Lkotlin/jvm/functions/Function0;

    .line 335
    .line 336
    invoke-interface {v3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v3

    .line 340
    check-cast v3, La/b9q0;

    .line 341
    .line 342
    if-eqz v3, :cond_2

    .line 343
    .line 344
    iget-object v8, v3, La/b9q0;->a:La/a9q0;

    .line 345
    .line 346
    :cond_2
    move-object v3, v8

    .line 347
    invoke-interface {v12}, La/cnx;->getLayoutDirection()La/k6z;

    .line 348
    .line 349
    .line 350
    move-result-object v4

    .line 351
    sget-object v5, La/k6z;->b:La/k6z;

    .line 352
    .line 353
    if-ne v4, v5, :cond_3

    .line 354
    .line 355
    move v4, v9

    .line 356
    goto :goto_2

    .line 357
    :cond_3
    move v4, v7

    .line 358
    :goto_2
    iget v5, v11, La/pu90;->a:I

    .line 359
    .line 360
    invoke-static/range {v0 .. v5}, La/yum0;->g(La/ou90;ILa/nls0;La/a9q0;ZI)La/jge0;

    .line 361
    .line 362
    .line 363
    move-result-object v1

    .line 364
    sget-object v2, La/ma80;->b:La/ma80;

    .line 365
    .line 366
    iget v3, v11, La/pu90;->a:I

    .line 367
    .line 368
    invoke-virtual {v14, v2, v1, v10, v3}, La/d7q0;->a(La/ma80;La/jge0;II)V

    .line 369
    .line 370
    .line 371
    iget-object v1, v14, La/d7q0;->a:La/agk0;

    .line 372
    .line 373
    invoke-virtual {v1}, La/agk0;->l()F

    .line 374
    .line 375
    .line 376
    move-result v1

    .line 377
    neg-float v1, v1

    .line 378
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 379
    .line 380
    .line 381
    move-result v1

    .line 382
    invoke-virtual {v0, v11, v1, v7, v6}, La/ou90;->m(La/pu90;IIF)V

    .line 383
    .line 384
    .line 385
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 386
    .line 387
    return-object v0

    .line 388
    :pswitch_5
    check-cast v13, La/pu90;

    .line 389
    .line 390
    check-cast v12, La/pu90;

    .line 391
    .line 392
    check-cast v11, La/pu90;

    .line 393
    .line 394
    move-object v0, v1

    .line 395
    check-cast v0, La/ou90;

    .line 396
    .line 397
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 398
    .line 399
    .line 400
    if-eqz v13, :cond_4

    .line 401
    .line 402
    invoke-virtual {v0, v13, v7, v7, v6}, La/ou90;->m(La/pu90;IIF)V

    .line 403
    .line 404
    .line 405
    :cond_4
    if-eqz v12, :cond_5

    .line 406
    .line 407
    invoke-virtual {v0, v12, v7, v7, v6}, La/ou90;->m(La/pu90;IIF)V

    .line 408
    .line 409
    .line 410
    :cond_5
    if-eqz v11, :cond_6

    .line 411
    .line 412
    iget v1, v11, La/pu90;->b:I

    .line 413
    .line 414
    sub-int/2addr v10, v1

    .line 415
    invoke-virtual {v0, v11, v7, v10, v6}, La/ou90;->m(La/pu90;IIF)V

    .line 416
    .line 417
    .line 418
    :cond_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 419
    .line 420
    return-object v0

    .line 421
    :pswitch_6
    check-cast v13, La/o4s;

    .line 422
    .line 423
    check-cast v12, La/u4s;

    .line 424
    .line 425
    check-cast v11, La/n4s;

    .line 426
    .line 427
    move-object v0, v1

    .line 428
    check-cast v0, Landroid/view/View;

    .line 429
    .line 430
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 431
    .line 432
    .line 433
    iget-object v0, v13, La/o4s;->h:La/xdr;

    .line 434
    .line 435
    if-eqz v0, :cond_7

    .line 436
    .line 437
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 438
    .line 439
    .line 440
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    iget-object v2, v11, La/n4s;->u:La/s4s;

    .line 445
    .line 446
    invoke-virtual {v2}, La/s4s;->getLoadedPictureUrl()Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v2

    .line 450
    invoke-interface {v0, v12, v1, v2}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    :cond_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 454
    .line 455
    return-object v0

    .line 456
    :pswitch_7
    check-cast v13, La/xk80;

    .line 457
    .line 458
    check-cast v12, La/k6z;

    .line 459
    .line 460
    check-cast v11, La/t33;

    .line 461
    .line 462
    move-object v0, v1

    .line 463
    check-cast v0, La/uag0;

    .line 464
    .line 465
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 466
    .line 467
    .line 468
    invoke-virtual {v13}, La/xk80;->k()I

    .line 469
    .line 470
    .line 471
    move-result v1

    .line 472
    sub-int/2addr v1, v10

    .line 473
    int-to-float v1, v1

    .line 474
    invoke-virtual {v13}, La/xk80;->l()F

    .line 475
    .line 476
    .line 477
    move-result v2

    .line 478
    add-float/2addr v2, v1

    .line 479
    sget-object v1, La/k6z;->b:La/k6z;

    .line 480
    .line 481
    if-ne v12, v1, :cond_8

    .line 482
    .line 483
    const/high16 v5, -0x40800000    # -1.0f

    .line 484
    .line 485
    :cond_8
    invoke-virtual {v11}, La/t33;->d()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v1

    .line 489
    check-cast v1, Ljava/lang/Number;

    .line 490
    .line 491
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 492
    .line 493
    .line 494
    move-result v1

    .line 495
    const v6, 0x3dccccd0    # 0.100000024f

    .line 496
    .line 497
    .line 498
    mul-float/2addr v6, v1

    .line 499
    add-float/2addr v6, v4

    .line 500
    iget-wide v7, v0, La/uag0;->r:J

    .line 501
    .line 502
    shr-long v3, v7, v3

    .line 503
    .line 504
    long-to-int v3, v3

    .line 505
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 506
    .line 507
    .line 508
    move-result v3

    .line 509
    mul-float/2addr v3, v2

    .line 510
    mul-float/2addr v3, v5

    .line 511
    invoke-virtual {v0, v3}, La/uag0;->H(F)V

    .line 512
    .line 513
    .line 514
    invoke-virtual {v0, v6}, La/uag0;->w(F)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v0, v6}, La/uag0;->y(F)V

    .line 518
    .line 519
    .line 520
    invoke-virtual {v0, v1}, La/uag0;->b(F)V

    .line 521
    .line 522
    .line 523
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 524
    .line 525
    return-object v0

    .line 526
    :pswitch_8
    check-cast v13, La/yyl;

    .line 527
    .line 528
    check-cast v12, Lorg/xplatform/uikit/components/chips/DsChip;

    .line 529
    .line 530
    check-cast v11, La/mxl;

    .line 531
    .line 532
    move-object v0, v1

    .line 533
    check-cast v0, Landroid/view/View;

    .line 534
    .line 535
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 536
    .line 537
    .line 538
    iget-object v0, v13, La/yyl;->e:La/uyl;

    .line 539
    .line 540
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 541
    .line 542
    .line 543
    move-result v0

    .line 544
    if-eqz v0, :cond_b

    .line 545
    .line 546
    if-eq v0, v9, :cond_a

    .line 547
    .line 548
    const/4 v1, 0x2

    .line 549
    if-ne v0, v1, :cond_9

    .line 550
    .line 551
    iget-object v0, v13, La/yyl;->g:Lkotlin/jvm/functions/Function2;

    .line 552
    .line 553
    if-eqz v0, :cond_e

    .line 554
    .line 555
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 556
    .line 557
    .line 558
    move-result-object v1

    .line 559
    invoke-interface {v0, v11, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    goto :goto_4

    .line 563
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 564
    .line 565
    .line 566
    goto :goto_5

    .line 567
    :cond_a
    invoke-virtual {v12}, Lorg/xplatform/uikit/components/chips/DsChip;->isSelected()Z

    .line 568
    .line 569
    .line 570
    move-result v0

    .line 571
    xor-int/2addr v0, v9

    .line 572
    invoke-virtual {v12, v0}, Lorg/xplatform/uikit/components/chips/DsChip;->setSelected(Z)V

    .line 573
    .line 574
    .line 575
    iget-object v1, v13, La/yyl;->g:Lkotlin/jvm/functions/Function2;

    .line 576
    .line 577
    if-eqz v1, :cond_e

    .line 578
    .line 579
    invoke-static {v11, v0}, La/mxl;->a(La/mxl;Z)La/mxl;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 584
    .line 585
    .line 586
    move-result-object v2

    .line 587
    invoke-interface {v1, v0, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    goto :goto_4

    .line 591
    :cond_b
    invoke-virtual {v13}, Landroid/view/ViewGroup;->getChildCount()I

    .line 592
    .line 593
    .line 594
    move-result v0

    .line 595
    move v1, v7

    .line 596
    :goto_3
    if-ge v1, v0, :cond_d

    .line 597
    .line 598
    invoke-virtual {v13, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 599
    .line 600
    .line 601
    move-result-object v2

    .line 602
    instance-of v3, v2, Lorg/xplatform/uikit/components/chips/DsChip;

    .line 603
    .line 604
    if-eqz v3, :cond_c

    .line 605
    .line 606
    if-eq v2, v12, :cond_c

    .line 607
    .line 608
    check-cast v2, Lorg/xplatform/uikit/components/chips/DsChip;

    .line 609
    .line 610
    invoke-virtual {v2, v7}, Lorg/xplatform/uikit/components/chips/DsChip;->setSelected(Z)V

    .line 611
    .line 612
    .line 613
    :cond_c
    add-int/lit8 v1, v1, 0x1

    .line 614
    .line 615
    goto :goto_3

    .line 616
    :cond_d
    invoke-virtual {v12}, Lorg/xplatform/uikit/components/chips/DsChip;->isSelected()Z

    .line 617
    .line 618
    .line 619
    move-result v0

    .line 620
    xor-int/2addr v0, v9

    .line 621
    invoke-virtual {v12, v0}, Lorg/xplatform/uikit/components/chips/DsChip;->setSelected(Z)V

    .line 622
    .line 623
    .line 624
    iget-object v1, v13, La/yyl;->g:Lkotlin/jvm/functions/Function2;

    .line 625
    .line 626
    if-eqz v1, :cond_e

    .line 627
    .line 628
    invoke-static {v11, v0}, La/mxl;->a(La/mxl;Z)La/mxl;

    .line 629
    .line 630
    .line 631
    move-result-object v0

    .line 632
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 633
    .line 634
    .line 635
    move-result-object v2

    .line 636
    invoke-interface {v1, v0, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    :cond_e
    :goto_4
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 640
    .line 641
    :goto_5
    return-object v8

    .line 642
    :pswitch_9
    check-cast v13, La/zbk;

    .line 643
    .line 644
    check-cast v12, La/nkx;

    .line 645
    .line 646
    check-cast v11, La/ry40;

    .line 647
    .line 648
    if-eq v1, v13, :cond_11

    .line 649
    .line 650
    instance-of v0, v1, La/b8m0;

    .line 651
    .line 652
    if-eqz v0, :cond_10

    .line 653
    .line 654
    iget v0, v12, La/nkx;->a:I

    .line 655
    .line 656
    sub-int/2addr v0, v10

    .line 657
    invoke-virtual {v11, v1}, La/ry40;->d(Ljava/lang/Object;)I

    .line 658
    .line 659
    .line 660
    move-result v2

    .line 661
    if-ltz v2, :cond_f

    .line 662
    .line 663
    iget-object v3, v11, La/ry40;->c:[I

    .line 664
    .line 665
    aget v2, v3, v2

    .line 666
    .line 667
    goto :goto_6

    .line 668
    :cond_f
    const v2, 0x7fffffff

    .line 669
    .line 670
    .line 671
    :goto_6
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 672
    .line 673
    .line 674
    move-result v0

    .line 675
    invoke-virtual {v11, v0, v1}, La/ry40;->g(ILjava/lang/Object;)V

    .line 676
    .line 677
    .line 678
    :cond_10
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 679
    .line 680
    goto :goto_7

    .line 681
    :cond_11
    const-string v0, "A derived state calculation cannot read itself"

    .line 682
    .line 683
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 684
    .line 685
    .line 686
    :goto_7
    return-object v8

    .line 687
    :pswitch_a
    check-cast v13, La/f3d;

    .line 688
    .line 689
    check-cast v12, Ljava/util/List;

    .line 690
    .line 691
    check-cast v11, La/pz40;

    .line 692
    .line 693
    move-object v0, v1

    .line 694
    check-cast v0, La/ou90;

    .line 695
    .line 696
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 697
    .line 698
    .line 699
    iget-object v1, v13, La/f3d;->a:La/agk0;

    .line 700
    .line 701
    invoke-virtual {v1}, La/agk0;->l()F

    .line 702
    .line 703
    .line 704
    move-result v1

    .line 705
    invoke-interface {v12}, Ljava/util/Collection;->size()I

    .line 706
    .line 707
    .line 708
    move-result v2

    .line 709
    move v3, v7

    .line 710
    :goto_8
    if-ge v3, v2, :cond_19

    .line 711
    .line 712
    invoke-interface {v12, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    move-result-object v4

    .line 716
    check-cast v4, La/pu90;

    .line 717
    .line 718
    invoke-virtual {v4}, La/pu90;->n()Ljava/lang/Object;

    .line 719
    .line 720
    .line 721
    move-result-object v9

    .line 722
    instance-of v13, v9, La/p6z;

    .line 723
    .line 724
    if-eqz v13, :cond_12

    .line 725
    .line 726
    check-cast v9, La/p6z;

    .line 727
    .line 728
    goto :goto_9

    .line 729
    :cond_12
    move-object v9, v8

    .line 730
    :goto_9
    if-eqz v9, :cond_13

    .line 731
    .line 732
    invoke-interface {v9}, La/p6z;->g0()Ljava/lang/Object;

    .line 733
    .line 734
    .line 735
    move-result-object v9

    .line 736
    goto :goto_a

    .line 737
    :cond_13
    move-object v9, v8

    .line 738
    :goto_a
    const-string v13, "BACKGROUND_KEY"

    .line 739
    .line 740
    invoke-static {v9, v13}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 741
    .line 742
    .line 743
    move-result v13

    .line 744
    if-eqz v13, :cond_14

    .line 745
    .line 746
    invoke-virtual {v0, v4, v7, v7, v6}, La/ou90;->m(La/pu90;IIF)V

    .line 747
    .line 748
    .line 749
    goto :goto_b

    .line 750
    :cond_14
    const-string v13, "STATIC_HEADER_KEY"

    .line 751
    .line 752
    invoke-static {v9, v13}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 753
    .line 754
    .line 755
    move-result v13

    .line 756
    if-eqz v13, :cond_15

    .line 757
    .line 758
    invoke-static {v11}, La/wzb;->b(La/pz40;)I

    .line 759
    .line 760
    .line 761
    move-result v9

    .line 762
    invoke-virtual {v0, v4, v7, v9, v6}, La/ou90;->m(La/pu90;IIF)V

    .line 763
    .line 764
    .line 765
    goto :goto_b

    .line 766
    :cond_15
    const-string v13, "COLLAPSING_HEADER_KEY"

    .line 767
    .line 768
    invoke-static {v9, v13}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 769
    .line 770
    .line 771
    move-result v13

    .line 772
    if-eqz v13, :cond_16

    .line 773
    .line 774
    invoke-static {v11}, La/wzb;->b(La/pz40;)I

    .line 775
    .line 776
    .line 777
    move-result v9

    .line 778
    invoke-static {v1}, La/si30;->b(F)I

    .line 779
    .line 780
    .line 781
    move-result v13

    .line 782
    sub-int/2addr v9, v13

    .line 783
    invoke-virtual {v0, v4, v7, v9, v6}, La/ou90;->m(La/pu90;IIF)V

    .line 784
    .line 785
    .line 786
    goto :goto_b

    .line 787
    :cond_16
    const-string v13, "ANIMATED_CONTENT_KEY"

    .line 788
    .line 789
    invoke-static {v9, v13}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 790
    .line 791
    .line 792
    move-result v13

    .line 793
    if-eqz v13, :cond_17

    .line 794
    .line 795
    invoke-static {v11}, La/wzb;->b(La/pz40;)I

    .line 796
    .line 797
    .line 798
    move-result v9

    .line 799
    add-int/2addr v9, v10

    .line 800
    invoke-static {v1}, La/si30;->b(F)I

    .line 801
    .line 802
    .line 803
    move-result v13

    .line 804
    sub-int/2addr v9, v13

    .line 805
    invoke-virtual {v0, v4, v7, v9, v5}, La/ou90;->m(La/pu90;IIF)V

    .line 806
    .line 807
    .line 808
    goto :goto_b

    .line 809
    :cond_17
    const-string v13, "TOOLBAR_KEY"

    .line 810
    .line 811
    invoke-static {v9, v13}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 812
    .line 813
    .line 814
    move-result v9

    .line 815
    if-eqz v9, :cond_18

    .line 816
    .line 817
    invoke-virtual {v0, v4, v7, v7, v5}, La/ou90;->m(La/pu90;IIF)V

    .line 818
    .line 819
    .line 820
    :cond_18
    :goto_b
    add-int/lit8 v3, v3, 0x1

    .line 821
    .line 822
    goto :goto_8

    .line 823
    :cond_19
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 824
    .line 825
    return-object v0

    .line 826
    :pswitch_b
    check-cast v13, La/a4x;

    .line 827
    .line 828
    check-cast v12, La/fop0;

    .line 829
    .line 830
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 831
    .line 832
    move-object v0, v1

    .line 833
    check-cast v0, La/hcz;

    .line 834
    .line 835
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 836
    .line 837
    .line 838
    new-instance v1, La/y26;

    .line 839
    .line 840
    invoke-direct {v1, v12, v10, v11, v9}, La/y26;-><init>(Ljava/lang/Object;ILjava/lang/Object;B)V

    .line 841
    .line 842
    .line 843
    new-instance v2, La/ugd;

    .line 844
    .line 845
    const v3, 0x21e7678e

    .line 846
    .line 847
    .line 848
    invoke-direct {v2, v3, v9, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 849
    .line 850
    .line 851
    const/4 v1, 0x3

    .line 852
    invoke-static {v0, v8, v8, v2, v1}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 853
    .line 854
    .line 855
    new-instance v2, La/nk7;

    .line 856
    .line 857
    invoke-direct {v2, v1}, La/nk7;-><init>(B)V

    .line 858
    .line 859
    .line 860
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 861
    .line 862
    .line 863
    move-result v1

    .line 864
    new-instance v3, La/at7;

    .line 865
    .line 866
    invoke-direct {v3, v2, v13, v7}, La/at7;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 867
    .line 868
    .line 869
    new-instance v2, La/b8;

    .line 870
    .line 871
    const/16 v4, 0x1b

    .line 872
    .line 873
    invoke-direct {v2, v13, v4}, La/b8;-><init>(Ljava/util/List;B)V

    .line 874
    .line 875
    .line 876
    new-instance v4, La/vb;

    .line 877
    .line 878
    const/16 v5, 0xb

    .line 879
    .line 880
    invoke-direct {v4, v13, v11, v5}, La/vb;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 881
    .line 882
    .line 883
    new-instance v5, La/ugd;

    .line 884
    .line 885
    const v6, 0x2fd4df92

    .line 886
    .line 887
    .line 888
    invoke-direct {v5, v6, v9, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 889
    .line 890
    .line 891
    invoke-virtual {v0, v1, v3, v2, v5}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 892
    .line 893
    .line 894
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 895
    .line 896
    return-object v0

    .line 897
    :pswitch_c
    check-cast v13, La/jp5;

    .line 898
    .line 899
    check-cast v12, La/fp5;

    .line 900
    .line 901
    check-cast v11, La/xhe0;

    .line 902
    .line 903
    move-object v0, v1

    .line 904
    check-cast v0, Landroid/view/View;

    .line 905
    .line 906
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 907
    .line 908
    .line 909
    iget-object v0, v13, La/jp5;->g:La/xdr;

    .line 910
    .line 911
    if-eqz v0, :cond_1c

    .line 912
    .line 913
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 914
    .line 915
    .line 916
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 917
    .line 918
    .line 919
    move-result-object v1

    .line 920
    iget-object v2, v11, La/xhe0;->a:Landroid/view/View;

    .line 921
    .line 922
    instance-of v3, v2, La/gr5;

    .line 923
    .line 924
    if-eqz v3, :cond_1a

    .line 925
    .line 926
    check-cast v2, La/gr5;

    .line 927
    .line 928
    goto :goto_c

    .line 929
    :cond_1a
    move-object v2, v8

    .line 930
    :goto_c
    if-eqz v2, :cond_1b

    .line 931
    .line 932
    invoke-interface {v2}, La/gr5;->getLoadedImageUrl()Ljava/lang/String;

    .line 933
    .line 934
    .line 935
    move-result-object v8

    .line 936
    :cond_1b
    invoke-interface {v0, v12, v1, v8}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 937
    .line 938
    .line 939
    :cond_1c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 940
    .line 941
    return-object v0

    .line 942
    :pswitch_d
    check-cast v13, La/do20;

    .line 943
    .line 944
    check-cast v12, La/kie0;

    .line 945
    .line 946
    check-cast v11, Landroid/view/ViewGroup;

    .line 947
    .line 948
    move-object v0, v1

    .line 949
    check-cast v0, Ljava/lang/Float;

    .line 950
    .line 951
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 952
    .line 953
    .line 954
    move-result v1

    .line 955
    iget-object v2, v13, La/do20;->a:Ljava/lang/Object;

    .line 956
    .line 957
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 958
    .line 959
    if-eqz v2, :cond_1d

    .line 960
    .line 961
    invoke-interface {v2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 962
    .line 963
    .line 964
    :cond_1d
    sub-float/2addr v1, v5

    .line 965
    int-to-float v0, v10

    .line 966
    mul-float/2addr v1, v0

    .line 967
    float-to-int v0, v1

    .line 968
    iput v0, v12, La/kie0;->a:I

    .line 969
    .line 970
    invoke-static {v11, v0}, La/do20;->q(Landroid/view/ViewGroup;I)V

    .line 971
    .line 972
    .line 973
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 974
    .line 975
    return-object v0

    .line 976
    nop

    .line 977
    :pswitch_data_0
    .packed-switch 0x0
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
