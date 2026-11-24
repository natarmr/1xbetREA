.class public final synthetic La/lrc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ZB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/lrc0;->a:B

    iput-object p1, p0, La/lrc0;->c:Ljava/lang/Object;

    iput-object p2, p0, La/lrc0;->d:Ljava/lang/Object;

    iput-boolean p3, p0, La/lrc0;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZLjava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/lrc0;->a:B

    iput-object p1, p0, La/lrc0;->c:Ljava/lang/Object;

    iput-boolean p2, p0, La/lrc0;->b:Z

    iput-object p3, p0, La/lrc0;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 3
    iput-byte p4, p0, La/lrc0;->a:B

    iput-boolean p1, p0, La/lrc0;->b:Z

    iput-object p2, p0, La/lrc0;->c:Ljava/lang/Object;

    iput-object p3, p0, La/lrc0;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/lrc0;->a:B

    .line 4
    .line 5
    const v2, 0x2fd4df92

    .line 6
    .line 7
    .line 8
    const/16 v3, 0x20

    .line 9
    .line 10
    const/4 v4, 0x1

    .line 11
    iget-boolean v5, v0, La/lrc0;->b:Z

    .line 12
    .line 13
    iget-object v6, v0, La/lrc0;->d:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v7, v0, La/lrc0;->c:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object v9, v7

    .line 21
    check-cast v9, La/znj;

    .line 22
    .line 23
    move-object v12, v6

    .line 24
    check-cast v12, La/daf;

    .line 25
    .line 26
    move-object/from16 v11, p1

    .line 27
    .line 28
    check-cast v11, La/k0w0;

    .line 29
    .line 30
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    new-instance v8, La/hnp;

    .line 34
    .line 35
    const/4 v13, 0x0

    .line 36
    iget-boolean v10, v0, La/lrc0;->b:Z

    .line 37
    .line 38
    invoke-direct/range {v8 .. v13}, La/hnp;-><init>(La/znj;ZLa/k0w0;La/daf;La/yje;)V

    .line 39
    .line 40
    .line 41
    new-instance v0, La/b1w0;

    .line 42
    .line 43
    invoke-direct {v0, v8}, La/b1w0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v11, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, La/c8d;

    .line 53
    .line 54
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 55
    .line 56
    new-instance v2, La/v7d;

    .line 57
    .line 58
    invoke-direct {v2, v4, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 59
    .line 60
    .line 61
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 62
    .line 63
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object v0

    .line 66
    :pswitch_0
    check-cast v7, La/ren0;

    .line 67
    .line 68
    check-cast v6, La/nmp0;

    .line 69
    .line 70
    iget-wide v0, v6, La/nmp0;->a:J

    .line 71
    .line 72
    move-object/from16 v2, p1

    .line 73
    .line 74
    check-cast v2, La/k0w0;

    .line 75
    .line 76
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    if-eqz v5, :cond_0

    .line 80
    .line 81
    iget-object v3, v7, La/ren0;->y:La/kys0;

    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    new-instance v3, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getFighterFragmentScreen$1;

    .line 87
    .line 88
    invoke-direct {v3, v0, v1}, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getFighterFragmentScreen$1;-><init>(J)V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_0
    iget-object v3, v7, La/ren0;->z:La/lk5;

    .line 93
    .line 94
    iget-object v4, v6, La/nmp0;->b:Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    new-instance v5, Lorg/xplatform/favorites/impl/di/FavoritesScreenFactoryImpl$getGamesByTeamIdScreen$1;

    .line 100
    .line 101
    invoke-direct {v5, v3, v0, v1, v4}, Lorg/xplatform/favorites/impl/di/FavoritesScreenFactoryImpl$getGamesByTeamIdScreen$1;-><init>(La/lk5;JLjava/lang/String;)V

    .line 102
    .line 103
    .line 104
    move-object v3, v5

    .line 105
    :goto_0
    invoke-virtual {v2, v3}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 106
    .line 107
    .line 108
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 109
    .line 110
    return-object v0

    .line 111
    :pswitch_1
    check-cast v7, La/vh0;

    .line 112
    .line 113
    check-cast v6, La/sff0;

    .line 114
    .line 115
    move-object/from16 v0, p1

    .line 116
    .line 117
    check-cast v0, La/iz30;

    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-eq v1, v3, :cond_7

    .line 127
    .line 128
    const/16 v2, 0x21

    .line 129
    .line 130
    if-eq v1, v2, :cond_3

    .line 131
    .line 132
    const/16 v2, 0x3d

    .line 133
    .line 134
    if-eq v1, v2, :cond_2

    .line 135
    .line 136
    const/16 v2, 0x41

    .line 137
    .line 138
    if-eq v1, v2, :cond_1

    .line 139
    .line 140
    new-instance v1, La/sx10;

    .line 141
    .line 142
    invoke-direct {v1, v0, v5}, La/sx10;-><init>(La/iz30;Z)V

    .line 143
    .line 144
    .line 145
    goto/16 :goto_4

    .line 146
    .line 147
    :cond_1
    new-instance v1, La/vx10;

    .line 148
    .line 149
    invoke-direct {v1, v0}, La/vx10;-><init>(La/iz30;)V

    .line 150
    .line 151
    .line 152
    goto/16 :goto_4

    .line 153
    .line 154
    :cond_2
    new-instance v1, La/gx10;

    .line 155
    .line 156
    sget-object v0, La/iz30;->A:La/iz30;

    .line 157
    .line 158
    invoke-direct {v1, v0, v7}, La/gx10;-><init>(La/iz30;La/vh0;)V

    .line 159
    .line 160
    .line 161
    goto/16 :goto_4

    .line 162
    .line 163
    :cond_3
    new-instance v1, La/wx10;

    .line 164
    .line 165
    new-instance v2, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    sget-object v3, La/ujn;->h:Ljava/lang/String;

    .line 168
    .line 169
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    sget-object v3, La/ujn;->h:Ljava/lang/String;

    .line 173
    .line 174
    const-string v5, "/static/img/ImgDefault/MMA/UFC/Menu_Button.png"

    .line 175
    .line 176
    const/4 v6, 0x0

    .line 177
    invoke-static {v5, v3, v6}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    if-nez v3, :cond_6

    .line 182
    .line 183
    const-string v3, "https://"

    .line 184
    .line 185
    invoke-static {v5, v3, v6}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    if-eqz v3, :cond_4

    .line 190
    .line 191
    goto :goto_1

    .line 192
    :cond_4
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    const/16 v7, 0x2f

    .line 197
    .line 198
    if-lez v3, :cond_5

    .line 199
    .line 200
    const-string v3, "/"

    .line 201
    .line 202
    invoke-static {v2, v3}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    if-nez v3, :cond_5

    .line 207
    .line 208
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    :cond_5
    new-array v3, v4, [C

    .line 212
    .line 213
    aput-char v7, v3, v6

    .line 214
    .line 215
    invoke-static {v5, v3}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    goto :goto_2

    .line 223
    :cond_6
    :goto_1
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    :goto_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    invoke-direct {v1, v0, v2}, La/wx10;-><init>(La/iz30;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    goto :goto_4

    .line 237
    :cond_7
    new-instance v1, La/mx10;

    .line 238
    .line 239
    sget-object v0, La/iz30;->l:La/iz30;

    .line 240
    .line 241
    iget-object v2, v6, La/sff0;->c:La/ech;

    .line 242
    .line 243
    iget v2, v2, La/ech;->n:I

    .line 244
    .line 245
    if-eqz v2, :cond_8

    .line 246
    .line 247
    new-instance v3, La/bzu;

    .line 248
    .line 249
    const/16 v4, 0x17

    .line 250
    .line 251
    invoke-direct {v3, v4}, La/bzu;-><init>(B)V

    .line 252
    .line 253
    .line 254
    const-string v4, "static"

    .line 255
    .line 256
    invoke-virtual {v3, v4}, La/bzu;->g(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    const-string v4, "img"

    .line 260
    .line 261
    invoke-virtual {v3, v4}, La/bzu;->g(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    const-string v4, "ImgDefault"

    .line 265
    .line 266
    invoke-virtual {v3, v4}, La/bzu;->g(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    const-string v4, "Esports"

    .line 270
    .line 271
    invoke-virtual {v3, v4}, La/bzu;->g(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    const-string v4, "ButtonImage"

    .line 275
    .line 276
    invoke-virtual {v3, v4}, La/bzu;->g(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    new-instance v4, Ljava/lang/StringBuilder;

    .line 280
    .line 281
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    const-string v2, ".png"

    .line 288
    .line 289
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    invoke-virtual {v3, v2}, La/bzu;->g(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    iget-object v2, v3, La/bzu;->b:Ljava/lang/Object;

    .line 300
    .line 301
    check-cast v2, Ljava/lang/StringBuilder;

    .line 302
    .line 303
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    goto :goto_3

    .line 308
    :cond_8
    const-string v2, ""

    .line 309
    .line 310
    :goto_3
    invoke-direct {v1, v0, v2}, La/mx10;-><init>(La/iz30;Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    :goto_4
    return-object v1

    .line 314
    :pswitch_2
    check-cast v7, La/l7m0;

    .line 315
    .line 316
    move-object v9, v6

    .line 317
    check-cast v9, Ljava/util/List;

    .line 318
    .line 319
    move-object/from16 v0, p1

    .line 320
    .line 321
    check-cast v0, La/fhl;

    .line 322
    .line 323
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    invoke-interface {v0}, La/fhl;->d()J

    .line 327
    .line 328
    .line 329
    move-result-wide v1

    .line 330
    shr-long/2addr v1, v3

    .line 331
    long-to-int v1, v1

    .line 332
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 333
    .line 334
    .line 335
    move-result v1

    .line 336
    invoke-interface {v0}, La/fhl;->d()J

    .line 337
    .line 338
    .line 339
    move-result-wide v10

    .line 340
    const-wide v15, 0xffffffffL

    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    and-long/2addr v10, v15

    .line 346
    long-to-int v2, v10

    .line 347
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 348
    .line 349
    .line 350
    move-result v2

    .line 351
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v4

    .line 355
    check-cast v4, Ljava/lang/Number;

    .line 356
    .line 357
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 358
    .line 359
    .line 360
    move-result v4

    .line 361
    mul-float/2addr v4, v1

    .line 362
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 363
    .line 364
    mul-float/2addr v4, v6

    .line 365
    if-eqz v5, :cond_9

    .line 366
    .line 367
    sub-float v4, v1, v4

    .line 368
    .line 369
    :cond_9
    mul-float/2addr v6, v1

    .line 370
    if-eqz v5, :cond_a

    .line 371
    .line 372
    sub-float v5, v4, v6

    .line 373
    .line 374
    goto :goto_5

    .line 375
    :cond_a
    add-float v5, v4, v6

    .line 376
    .line 377
    :goto_5
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 378
    .line 379
    .line 380
    move-result v4

    .line 381
    int-to-long v6, v4

    .line 382
    const/4 v4, 0x0

    .line 383
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 384
    .line 385
    .line 386
    move-result v8

    .line 387
    int-to-long v10, v8

    .line 388
    shl-long/2addr v6, v3

    .line 389
    and-long/2addr v10, v15

    .line 390
    or-long v11, v6, v10

    .line 391
    .line 392
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 393
    .line 394
    .line 395
    move-result v5

    .line 396
    int-to-long v5, v5

    .line 397
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 398
    .line 399
    .line 400
    move-result v4

    .line 401
    int-to-long v7, v4

    .line 402
    shl-long v4, v5, v3

    .line 403
    .line 404
    and-long v6, v7, v15

    .line 405
    .line 406
    or-long v13, v4, v6

    .line 407
    .line 408
    new-instance v8, La/e900;

    .line 409
    .line 410
    const/4 v10, 0x0

    .line 411
    invoke-direct/range {v8 .. v14}, La/e900;-><init>(Ljava/util/List;Ljava/util/ArrayList;JJ)V

    .line 412
    .line 413
    .line 414
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 415
    .line 416
    .line 417
    move-result v1

    .line 418
    int-to-long v4, v1

    .line 419
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 420
    .line 421
    .line 422
    move-result v1

    .line 423
    int-to-long v1, v1

    .line 424
    shl-long v3, v4, v3

    .line 425
    .line 426
    and-long/2addr v1, v15

    .line 427
    or-long v14, v3, v1

    .line 428
    .line 429
    const/16 v19, 0x0

    .line 430
    .line 431
    const/16 v20, 0x7a

    .line 432
    .line 433
    const-wide/16 v12, 0x0

    .line 434
    .line 435
    const/16 v16, 0x0

    .line 436
    .line 437
    const/16 v17, 0x0

    .line 438
    .line 439
    const/16 v18, 0x0

    .line 440
    .line 441
    move-object v10, v0

    .line 442
    move-object v11, v8

    .line 443
    invoke-static/range {v10 .. v20}, La/fhl;->r(La/fhl;La/t89;JJFLa/agc;La/a4d;II)V

    .line 444
    .line 445
    .line 446
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 447
    .line 448
    return-object v0

    .line 449
    :pswitch_3
    check-cast v7, La/a4x;

    .line 450
    .line 451
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 452
    .line 453
    move-object/from16 v0, p1

    .line 454
    .line 455
    check-cast v0, La/hcz;

    .line 456
    .line 457
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 458
    .line 459
    .line 460
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 461
    .line 462
    .line 463
    move-result v1

    .line 464
    new-instance v3, La/d1c0;

    .line 465
    .line 466
    const/16 v8, 0x10

    .line 467
    .line 468
    invoke-direct {v3, v7, v8}, La/d1c0;-><init>(Ljava/util/List;B)V

    .line 469
    .line 470
    .line 471
    new-instance v8, La/o0i;

    .line 472
    .line 473
    const/4 v9, 0x5

    .line 474
    invoke-direct {v8, v7, v6, v9}, La/o0i;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function2;B)V

    .line 475
    .line 476
    .line 477
    new-instance v6, La/ugd;

    .line 478
    .line 479
    invoke-direct {v6, v2, v4, v8}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 480
    .line 481
    .line 482
    const/4 v2, 0x0

    .line 483
    invoke-virtual {v0, v1, v2, v3, v6}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 484
    .line 485
    .line 486
    if-eqz v5, :cond_b

    .line 487
    .line 488
    sget-object v1, La/y0x0;->f:La/ugd;

    .line 489
    .line 490
    const/4 v3, 0x3

    .line 491
    invoke-static {v0, v2, v2, v1, v3}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 492
    .line 493
    .line 494
    :cond_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 495
    .line 496
    return-object v0

    .line 497
    :pswitch_4
    check-cast v7, La/ekf0;

    .line 498
    .line 499
    move-object/from16 v0, p1

    .line 500
    .line 501
    check-cast v0, La/lwk;

    .line 502
    .line 503
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 504
    .line 505
    .line 506
    if-eqz v5, :cond_c

    .line 507
    .line 508
    iget-object v0, v7, La/ekf0;->p:Ljava/util/HashSet;

    .line 509
    .line 510
    invoke-virtual {v0, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 511
    .line 512
    .line 513
    :cond_c
    new-instance v0, La/pr0;

    .line 514
    .line 515
    const/16 v1, 0x14

    .line 516
    .line 517
    invoke-direct {v0, v7, v6, v1}, La/pr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 518
    .line 519
    .line 520
    return-object v0

    .line 521
    :pswitch_5
    check-cast v7, La/v7f0;

    .line 522
    .line 523
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 524
    .line 525
    move-object/from16 v8, p1

    .line 526
    .line 527
    check-cast v8, La/hcz;

    .line 528
    .line 529
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 530
    .line 531
    .line 532
    if-eqz v5, :cond_d

    .line 533
    .line 534
    sget-object v12, La/phu0;->g:La/ugd;

    .line 535
    .line 536
    const/4 v13, 0x6

    .line 537
    const/4 v9, 0x4

    .line 538
    const/4 v10, 0x0

    .line 539
    const/4 v11, 0x0

    .line 540
    invoke-static/range {v8 .. v13}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 541
    .line 542
    .line 543
    goto :goto_6

    .line 544
    :cond_d
    iget-object v0, v7, La/v7f0;->a:La/a4x;

    .line 545
    .line 546
    new-instance v1, La/bue0;

    .line 547
    .line 548
    invoke-direct {v1, v4}, La/bue0;-><init>(B)V

    .line 549
    .line 550
    .line 551
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 552
    .line 553
    .line 554
    move-result v3

    .line 555
    new-instance v5, La/zu90;

    .line 556
    .line 557
    const/16 v7, 0x1d

    .line 558
    .line 559
    invoke-direct {v5, v7, v1, v0}, La/zu90;-><init>(BLa/wdr;Ljava/lang/Object;)V

    .line 560
    .line 561
    .line 562
    new-instance v1, La/d1c0;

    .line 563
    .line 564
    const/16 v7, 0xc

    .line 565
    .line 566
    invoke-direct {v1, v0, v7}, La/d1c0;-><init>(Ljava/util/List;B)V

    .line 567
    .line 568
    .line 569
    new-instance v7, La/a100;

    .line 570
    .line 571
    const/16 v9, 0x1c

    .line 572
    .line 573
    invoke-direct {v7, v0, v6, v9}, La/a100;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 574
    .line 575
    .line 576
    new-instance v0, La/ugd;

    .line 577
    .line 578
    invoke-direct {v0, v2, v4, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 579
    .line 580
    .line 581
    invoke-virtual {v8, v3, v5, v1, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 582
    .line 583
    .line 584
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 585
    .line 586
    return-object v0

    .line 587
    :pswitch_6
    move-object v3, v7

    .line 588
    check-cast v3, La/qrc0;

    .line 589
    .line 590
    move-object v2, v6

    .line 591
    check-cast v2, La/a570;

    .line 592
    .line 593
    move-object/from16 v1, p1

    .line 594
    .line 595
    check-cast v1, Ljava/lang/Throwable;

    .line 596
    .line 597
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 598
    .line 599
    .line 600
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 601
    .line 602
    .line 603
    move-result-object v7

    .line 604
    new-instance v8, La/ljc0;

    .line 605
    .line 606
    const/16 v1, 0x8

    .line 607
    .line 608
    invoke-direct {v8, v1}, La/ljc0;-><init>(B)V

    .line 609
    .line 610
    .line 611
    new-instance v1, La/ys8;

    .line 612
    .line 613
    const/4 v5, 0x0

    .line 614
    const/16 v6, 0x1d

    .line 615
    .line 616
    iget-boolean v4, v0, La/lrc0;->b:Z

    .line 617
    .line 618
    invoke-direct/range {v1 .. v6}, La/ys8;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLa/yje;B)V

    .line 619
    .line 620
    .line 621
    const/16 v9, 0xe

    .line 622
    .line 623
    const/4 v6, 0x0

    .line 624
    move-object v4, v7

    .line 625
    const/4 v7, 0x0

    .line 626
    move-object v5, v8

    .line 627
    move-object v8, v1

    .line 628
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 629
    .line 630
    .line 631
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 632
    .line 633
    return-object v0

    .line 634
    nop

    .line 635
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
