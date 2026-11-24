.class public final synthetic La/gg4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/gg4;->a:B

    iput-object p1, p0, La/gg4;->b:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/gg4;->a:B

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    const v3, 0x799532c4

    .line 7
    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const v5, 0x2fd4df92

    .line 11
    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x1

    .line 15
    iget-object v0, v0, La/gg4;->b:Ljava/util/List;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, Ljava/lang/Throwable;

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, La/hzj;

    .line 39
    .line 40
    invoke-virtual {v1}, La/hzj;->b()V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object v0

    .line 47
    :pswitch_0
    move-object/from16 v1, p1

    .line 48
    .line 49
    check-cast v1, La/hcz;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    new-instance v3, La/adn0;

    .line 59
    .line 60
    const/16 v8, 0x19

    .line 61
    .line 62
    invoke-direct {v3, v0, v8}, La/adn0;-><init>(Ljava/util/List;B)V

    .line 63
    .line 64
    .line 65
    new-instance v8, La/bzp0;

    .line 66
    .line 67
    invoke-direct {v8, v0, v4}, La/bzp0;-><init>(Ljava/util/List;B)V

    .line 68
    .line 69
    .line 70
    new-instance v0, La/ugd;

    .line 71
    .line 72
    invoke-direct {v0, v5, v7, v8}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v2, v6, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 76
    .line 77
    .line 78
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object v0

    .line 81
    :pswitch_1
    move-object/from16 v1, p1

    .line 82
    .line 83
    check-cast v1, La/hcz;

    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    new-instance v4, La/t4c0;

    .line 89
    .line 90
    const/16 v5, 0x1b

    .line 91
    .line 92
    invoke-direct {v4, v5}, La/t4c0;-><init>(B)V

    .line 93
    .line 94
    .line 95
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    new-instance v6, La/zu90;

    .line 100
    .line 101
    const/16 v8, 0x15

    .line 102
    .line 103
    invoke-direct {v6, v8, v4, v0}, La/zu90;-><init>(BLa/wdr;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    new-instance v4, La/d1c0;

    .line 107
    .line 108
    invoke-direct {v4, v0, v2}, La/d1c0;-><init>(Ljava/util/List;B)V

    .line 109
    .line 110
    .line 111
    new-instance v2, La/xy1;

    .line 112
    .line 113
    const/16 v8, 0x18

    .line 114
    .line 115
    invoke-direct {v2, v0, v8}, La/xy1;-><init>(Ljava/util/List;B)V

    .line 116
    .line 117
    .line 118
    new-instance v0, La/ugd;

    .line 119
    .line 120
    invoke-direct {v0, v3, v7, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1, v5, v6, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 124
    .line 125
    .line 126
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    return-object v0

    .line 129
    :pswitch_2
    move-object/from16 v1, p1

    .line 130
    .line 131
    check-cast v1, Ljava/lang/Integer;

    .line 132
    .line 133
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    check-cast v0, La/cav0;

    .line 142
    .line 143
    iget-boolean v0, v0, La/cav0;->c:Z

    .line 144
    .line 145
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    return-object v0

    .line 150
    :pswitch_3
    move-object/from16 v1, p1

    .line 151
    .line 152
    check-cast v1, La/hcz;

    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    new-instance v4, La/ap30;

    .line 162
    .line 163
    const/16 v5, 0x14

    .line 164
    .line 165
    invoke-direct {v4, v0, v5}, La/ap30;-><init>(Ljava/util/List;B)V

    .line 166
    .line 167
    .line 168
    new-instance v5, La/lvo;

    .line 169
    .line 170
    invoke-direct {v5, v0, v0, v7}, La/lvo;-><init>(Ljava/util/List;Ljava/util/List;B)V

    .line 171
    .line 172
    .line 173
    new-instance v0, La/ugd;

    .line 174
    .line 175
    invoke-direct {v0, v3, v7, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1, v2, v6, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 179
    .line 180
    .line 181
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 182
    .line 183
    return-object v0

    .line 184
    :pswitch_4
    move-object/from16 v1, p1

    .line 185
    .line 186
    check-cast v1, La/hcz;

    .line 187
    .line 188
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    new-instance v4, La/v2m;

    .line 196
    .line 197
    const/16 v5, 0x16

    .line 198
    .line 199
    invoke-direct {v4, v0, v5}, La/v2m;-><init>(Ljava/util/List;B)V

    .line 200
    .line 201
    .line 202
    new-instance v5, La/lvo;

    .line 203
    .line 204
    const/4 v8, 0x0

    .line 205
    invoke-direct {v5, v0, v0, v8}, La/lvo;-><init>(Ljava/util/List;Ljava/util/List;B)V

    .line 206
    .line 207
    .line 208
    new-instance v0, La/ugd;

    .line 209
    .line 210
    invoke-direct {v0, v3, v7, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v1, v2, v6, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 214
    .line 215
    .line 216
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 217
    .line 218
    return-object v0

    .line 219
    :pswitch_5
    move-object/from16 v1, p1

    .line 220
    .line 221
    check-cast v1, La/hcz;

    .line 222
    .line 223
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 227
    .line 228
    .line 229
    move-result v3

    .line 230
    new-instance v4, La/v2m;

    .line 231
    .line 232
    invoke-direct {v4, v0, v2}, La/v2m;-><init>(Ljava/util/List;B)V

    .line 233
    .line 234
    .line 235
    new-instance v2, La/xy1;

    .line 236
    .line 237
    const/16 v8, 0x9

    .line 238
    .line 239
    invoke-direct {v2, v0, v8}, La/xy1;-><init>(Ljava/util/List;B)V

    .line 240
    .line 241
    .line 242
    new-instance v0, La/ugd;

    .line 243
    .line 244
    invoke-direct {v0, v5, v7, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v1, v3, v6, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 248
    .line 249
    .line 250
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 251
    .line 252
    return-object v0

    .line 253
    :pswitch_6
    move-object/from16 v1, p1

    .line 254
    .line 255
    check-cast v1, La/hcz;

    .line 256
    .line 257
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 261
    .line 262
    .line 263
    move-result v2

    .line 264
    new-instance v3, La/v2m;

    .line 265
    .line 266
    invoke-direct {v3, v0, v4}, La/v2m;-><init>(Ljava/util/List;B)V

    .line 267
    .line 268
    .line 269
    new-instance v4, La/xy1;

    .line 270
    .line 271
    const/16 v8, 0x8

    .line 272
    .line 273
    invoke-direct {v4, v0, v8}, La/xy1;-><init>(Ljava/util/List;B)V

    .line 274
    .line 275
    .line 276
    new-instance v0, La/ugd;

    .line 277
    .line 278
    invoke-direct {v0, v5, v7, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v1, v2, v6, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 282
    .line 283
    .line 284
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 285
    .line 286
    return-object v0

    .line 287
    :pswitch_7
    move-object/from16 v1, p1

    .line 288
    .line 289
    check-cast v1, La/hcz;

    .line 290
    .line 291
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 295
    .line 296
    .line 297
    move-result v2

    .line 298
    new-instance v3, La/bzh;

    .line 299
    .line 300
    const/16 v4, 0x12

    .line 301
    .line 302
    invoke-direct {v3, v0, v4}, La/bzh;-><init>(Ljava/util/List;B)V

    .line 303
    .line 304
    .line 305
    new-instance v4, La/xy1;

    .line 306
    .line 307
    const/4 v8, 0x6

    .line 308
    invoke-direct {v4, v0, v8}, La/xy1;-><init>(Ljava/util/List;B)V

    .line 309
    .line 310
    .line 311
    new-instance v0, La/ugd;

    .line 312
    .line 313
    invoke-direct {v0, v5, v7, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v1, v2, v6, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 317
    .line 318
    .line 319
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 320
    .line 321
    return-object v0

    .line 322
    :pswitch_8
    move-object/from16 v1, p1

    .line 323
    .line 324
    check-cast v1, La/fhl;

    .line 325
    .line 326
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 327
    .line 328
    .line 329
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 330
    .line 331
    .line 332
    move-result v2

    .line 333
    if-lt v2, v4, :cond_8

    .line 334
    .line 335
    sget-object v2, La/qmk;->a:La/zcl;

    .line 336
    .line 337
    const/high16 v12, 0x40000000    # 2.0f

    .line 338
    .line 339
    invoke-interface {v1, v12}, La/w6k;->w0(F)F

    .line 340
    .line 341
    .line 342
    move-result v2

    .line 343
    invoke-interface {v1}, La/fhl;->d()J

    .line 344
    .line 345
    .line 346
    move-result-wide v3

    .line 347
    const/16 v5, 0x20

    .line 348
    .line 349
    shr-long/2addr v3, v5

    .line 350
    long-to-int v3, v3

    .line 351
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 352
    .line 353
    .line 354
    move-result v3

    .line 355
    const/high16 v4, 0x40400000    # 3.0f

    .line 356
    .line 357
    div-float/2addr v3, v4

    .line 358
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v4

    .line 362
    check-cast v4, Ljava/lang/Number;

    .line 363
    .line 364
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 365
    .line 366
    .line 367
    move-result v4

    .line 368
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    check-cast v0, Ljava/lang/Number;

    .line 373
    .line 374
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 375
    .line 376
    .line 377
    move-result v0

    .line 378
    div-int/lit8 v6, v4, 0x3

    .line 379
    .line 380
    rem-int/lit8 v4, v4, 0x3

    .line 381
    .line 382
    div-int/lit8 v7, v0, 0x3

    .line 383
    .line 384
    rem-int/lit8 v0, v0, 0x3

    .line 385
    .line 386
    const/high16 v8, 0x3f000000    # 0.5f

    .line 387
    .line 388
    if-ne v6, v7, :cond_1

    .line 389
    .line 390
    int-to-float v11, v4

    .line 391
    mul-float/2addr v11, v3

    .line 392
    add-float/2addr v11, v2

    .line 393
    int-to-float v13, v6

    .line 394
    mul-float/2addr v13, v3

    .line 395
    mul-float v14, v3, v8

    .line 396
    .line 397
    add-float/2addr v14, v13

    .line 398
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 399
    .line 400
    .line 401
    move-result v11

    .line 402
    move/from16 p0, v8

    .line 403
    .line 404
    const-wide v15, 0xffffffffL

    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    int-to-long v8, v11

    .line 410
    invoke-static {v14}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 411
    .line 412
    .line 413
    move-result v10

    .line 414
    int-to-long v10, v10

    .line 415
    shl-long/2addr v8, v5

    .line 416
    and-long/2addr v10, v15

    .line 417
    :goto_1
    or-long/2addr v8, v10

    .line 418
    :goto_2
    move-wide v13, v8

    .line 419
    goto :goto_4

    .line 420
    :cond_1
    move/from16 p0, v8

    .line 421
    .line 422
    const-wide v15, 0xffffffffL

    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    if-ne v4, v0, :cond_2

    .line 428
    .line 429
    int-to-float v8, v4

    .line 430
    mul-float/2addr v8, v3

    .line 431
    mul-float v9, v3, p0

    .line 432
    .line 433
    add-float/2addr v9, v8

    .line 434
    int-to-float v8, v6

    .line 435
    mul-float/2addr v8, v3

    .line 436
    add-float/2addr v8, v2

    .line 437
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 438
    .line 439
    .line 440
    move-result v9

    .line 441
    int-to-long v9, v9

    .line 442
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 443
    .line 444
    .line 445
    move-result v8

    .line 446
    int-to-long v13, v8

    .line 447
    shl-long v8, v9, v5

    .line 448
    .line 449
    and-long v10, v13, v15

    .line 450
    .line 451
    goto :goto_1

    .line 452
    :cond_2
    if-ge v4, v0, :cond_3

    .line 453
    .line 454
    int-to-float v8, v4

    .line 455
    mul-float/2addr v8, v3

    .line 456
    add-float/2addr v8, v2

    .line 457
    int-to-float v9, v6

    .line 458
    mul-float/2addr v9, v3

    .line 459
    add-float/2addr v9, v2

    .line 460
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 461
    .line 462
    .line 463
    move-result v8

    .line 464
    int-to-long v10, v8

    .line 465
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 466
    .line 467
    .line 468
    move-result v8

    .line 469
    :goto_3
    int-to-long v8, v8

    .line 470
    shl-long/2addr v10, v5

    .line 471
    and-long/2addr v8, v15

    .line 472
    or-long/2addr v8, v10

    .line 473
    goto :goto_2

    .line 474
    :cond_3
    int-to-float v8, v4

    .line 475
    mul-float/2addr v8, v3

    .line 476
    add-float/2addr v8, v3

    .line 477
    sub-float/2addr v8, v2

    .line 478
    int-to-float v9, v6

    .line 479
    mul-float/2addr v9, v3

    .line 480
    add-float/2addr v9, v2

    .line 481
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 482
    .line 483
    .line 484
    move-result v8

    .line 485
    int-to-long v10, v8

    .line 486
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 487
    .line 488
    .line 489
    move-result v8

    .line 490
    goto :goto_3

    .line 491
    :goto_4
    if-ne v6, v7, :cond_4

    .line 492
    .line 493
    int-to-float v0, v0

    .line 494
    mul-float/2addr v0, v3

    .line 495
    add-float/2addr v0, v3

    .line 496
    sub-float/2addr v0, v2

    .line 497
    int-to-float v2, v7

    .line 498
    mul-float/2addr v2, v3

    .line 499
    mul-float v3, v3, p0

    .line 500
    .line 501
    add-float/2addr v3, v2

    .line 502
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 503
    .line 504
    .line 505
    move-result v0

    .line 506
    int-to-long v8, v0

    .line 507
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 508
    .line 509
    .line 510
    move-result v0

    .line 511
    int-to-long v2, v0

    .line 512
    shl-long/2addr v8, v5

    .line 513
    and-long/2addr v2, v15

    .line 514
    or-long/2addr v2, v8

    .line 515
    goto :goto_6

    .line 516
    :cond_4
    if-ne v4, v0, :cond_5

    .line 517
    .line 518
    int-to-float v0, v0

    .line 519
    mul-float/2addr v0, v3

    .line 520
    mul-float v8, v3, p0

    .line 521
    .line 522
    add-float/2addr v8, v0

    .line 523
    int-to-float v0, v7

    .line 524
    mul-float/2addr v0, v3

    .line 525
    add-float/2addr v0, v3

    .line 526
    sub-float/2addr v0, v2

    .line 527
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 528
    .line 529
    .line 530
    move-result v2

    .line 531
    int-to-long v2, v2

    .line 532
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 533
    .line 534
    .line 535
    move-result v0

    .line 536
    :goto_5
    int-to-long v8, v0

    .line 537
    shl-long/2addr v2, v5

    .line 538
    and-long/2addr v8, v15

    .line 539
    or-long/2addr v2, v8

    .line 540
    goto :goto_6

    .line 541
    :cond_5
    if-ge v4, v0, :cond_6

    .line 542
    .line 543
    int-to-float v0, v0

    .line 544
    mul-float/2addr v0, v3

    .line 545
    add-float/2addr v0, v3

    .line 546
    sub-float/2addr v0, v2

    .line 547
    int-to-float v4, v7

    .line 548
    mul-float/2addr v4, v3

    .line 549
    add-float/2addr v4, v3

    .line 550
    sub-float/2addr v4, v2

    .line 551
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 552
    .line 553
    .line 554
    move-result v0

    .line 555
    int-to-long v2, v0

    .line 556
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 557
    .line 558
    .line 559
    move-result v0

    .line 560
    goto :goto_5

    .line 561
    :cond_6
    int-to-float v0, v0

    .line 562
    mul-float/2addr v0, v3

    .line 563
    add-float/2addr v0, v2

    .line 564
    int-to-float v4, v7

    .line 565
    mul-float/2addr v4, v3

    .line 566
    add-float/2addr v4, v3

    .line 567
    sub-float/2addr v4, v2

    .line 568
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 569
    .line 570
    .line 571
    move-result v0

    .line 572
    int-to-long v2, v0

    .line 573
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 574
    .line 575
    .line 576
    move-result v0

    .line 577
    goto :goto_5

    .line 578
    :goto_6
    const/high16 v0, 0x3f800000    # 1.0f

    .line 579
    .line 580
    const/4 v4, 0x0

    .line 581
    if-ne v6, v7, :cond_7

    .line 582
    .line 583
    invoke-interface {v1, v0}, La/w6k;->w0(F)F

    .line 584
    .line 585
    .line 586
    move-result v0

    .line 587
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 588
    .line 589
    .line 590
    move-result v4

    .line 591
    int-to-long v6, v4

    .line 592
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 593
    .line 594
    .line 595
    move-result v0

    .line 596
    :goto_7
    int-to-long v8, v0

    .line 597
    shl-long v4, v6, v5

    .line 598
    .line 599
    and-long v6, v8, v15

    .line 600
    .line 601
    or-long/2addr v4, v6

    .line 602
    goto :goto_8

    .line 603
    :cond_7
    invoke-interface {v1, v0}, La/w6k;->w0(F)F

    .line 604
    .line 605
    .line 606
    move-result v0

    .line 607
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 608
    .line 609
    .line 610
    move-result v0

    .line 611
    int-to-long v6, v0

    .line 612
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 613
    .line 614
    .line 615
    move-result v0

    .line 616
    goto :goto_7

    .line 617
    :goto_8
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 618
    .line 619
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getBlack-0d7_KjU()J

    .line 620
    .line 621
    .line 622
    move-result-wide v6

    .line 623
    invoke-static {v13, v14, v4, v5}, La/ne60;->f(JJ)J

    .line 624
    .line 625
    .line 626
    move-result-wide v8

    .line 627
    invoke-static {v2, v3, v4, v5}, La/ne60;->f(JJ)J

    .line 628
    .line 629
    .line 630
    move-result-wide v4

    .line 631
    move-wide/from16 v17, v8

    .line 632
    .line 633
    move-wide v9, v2

    .line 634
    move-wide v2, v6

    .line 635
    move-wide v6, v4

    .line 636
    move-wide/from16 v4, v17

    .line 637
    .line 638
    invoke-interface {v1, v12}, La/w6k;->w0(F)F

    .line 639
    .line 640
    .line 641
    move-result v8

    .line 642
    move-wide v15, v9

    .line 643
    const/4 v10, 0x0

    .line 644
    const/16 v11, 0x1e0

    .line 645
    .line 646
    const/4 v9, 0x1

    .line 647
    invoke-static/range {v1 .. v11}, La/fhl;->Q(La/fhl;JJJFILa/x03;I)V

    .line 648
    .line 649
    .line 650
    sget-wide v2, La/ijg;->e0:J

    .line 651
    .line 652
    invoke-interface {v1, v12}, La/w6k;->w0(F)F

    .line 653
    .line 654
    .line 655
    move-result v8

    .line 656
    move-wide v4, v13

    .line 657
    move-wide v6, v15

    .line 658
    invoke-static/range {v1 .. v11}, La/fhl;->Q(La/fhl;JJJFILa/x03;I)V

    .line 659
    .line 660
    .line 661
    :cond_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 662
    .line 663
    return-object v0

    .line 664
    :pswitch_9
    move-object/from16 v1, p1

    .line 665
    .line 666
    check-cast v1, Ljava/lang/Integer;

    .line 667
    .line 668
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 669
    .line 670
    .line 671
    move-result v1

    .line 672
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    return-object v0

    .line 677
    :pswitch_a
    move-object/from16 v1, p1

    .line 678
    .line 679
    check-cast v1, La/fhl;

    .line 680
    .line 681
    sget-object v2, La/ig4;->O1:La/rek0;

    .line 682
    .line 683
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 684
    .line 685
    .line 686
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 691
    .line 692
    .line 693
    move-result v2

    .line 694
    if-eqz v2, :cond_9

    .line 695
    .line 696
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 697
    .line 698
    .line 699
    move-result-object v2

    .line 700
    check-cast v2, La/t89;

    .line 701
    .line 702
    const/4 v10, 0x0

    .line 703
    const/16 v11, 0x7e

    .line 704
    .line 705
    const-wide/16 v3, 0x0

    .line 706
    .line 707
    const-wide/16 v5, 0x0

    .line 708
    .line 709
    const/4 v7, 0x0

    .line 710
    const/4 v8, 0x0

    .line 711
    const/4 v9, 0x0

    .line 712
    invoke-static/range {v1 .. v11}, La/fhl;->r(La/fhl;La/t89;JJFLa/agc;La/a4d;II)V

    .line 713
    .line 714
    .line 715
    goto :goto_9

    .line 716
    :cond_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 717
    .line 718
    return-object v0

    .line 719
    :pswitch_data_0
    .packed-switch 0x0
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
