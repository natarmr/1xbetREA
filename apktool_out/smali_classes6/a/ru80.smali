.class public final synthetic La/ru80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ru80;->a:B

    iput-object p1, p0, La/ru80;->b:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v2, v0, La/ru80;->a:B

    .line 6
    .line 7
    const/4 v3, 0x6

    .line 8
    sget-object v4, La/ukd;->a:La/cl5;

    .line 9
    .line 10
    const/high16 v5, 0x3f800000    # 1.0f

    .line 11
    .line 12
    sget-object v6, La/jm40;->b:La/jm40;

    .line 13
    .line 14
    const/4 v7, 0x2

    .line 15
    const/4 v8, 0x0

    .line 16
    const/4 v9, 0x1

    .line 17
    iget-object v0, v0, La/ru80;->b:Lkotlin/jvm/functions/Function1;

    .line 18
    .line 19
    packed-switch v2, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    check-cast v1, La/m9n;

    .line 23
    .line 24
    move-object/from16 v2, p2

    .line 25
    .line 26
    check-cast v2, Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance v3, La/kyv0;

    .line 32
    .line 33
    invoke-interface {v1}, La/m9n;->getId()J

    .line 34
    .line 35
    .line 36
    move-result-wide v4

    .line 37
    invoke-direct {v3, v4, v5, v2}, La/kyv0;-><init>(JLjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object v0

    .line 46
    :pswitch_0
    check-cast v1, La/m9n;

    .line 47
    .line 48
    move-object/from16 v2, p2

    .line 49
    .line 50
    check-cast v2, Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    new-instance v3, La/qfv0;

    .line 56
    .line 57
    invoke-direct {v3, v1, v2}, La/qfv0;-><init>(La/m9n;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object v0

    .line 66
    :pswitch_1
    move-object/from16 v2, p2

    .line 67
    .line 68
    check-cast v2, Lkotlin/Unit;

    .line 69
    .line 70
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object v0

    .line 76
    :pswitch_2
    check-cast v1, Ljava/lang/Integer;

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    move-object/from16 v2, p2

    .line 83
    .line 84
    check-cast v2, Ljava/lang/String;

    .line 85
    .line 86
    new-instance v2, La/i8t0;

    .line 87
    .line 88
    invoke-direct {v2, v1}, La/i8t0;-><init>(I)V

    .line 89
    .line 90
    .line 91
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    return-object v0

    .line 97
    :pswitch_3
    check-cast v1, Ljava/lang/String;

    .line 98
    .line 99
    move-object/from16 v2, p2

    .line 100
    .line 101
    check-cast v2, Ljava/lang/Long;

    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 104
    .line 105
    .line 106
    move-result-wide v2

    .line 107
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    new-instance v4, La/c5t0;

    .line 111
    .line 112
    invoke-direct {v4, v1, v2, v3}, La/c5t0;-><init>(Ljava/lang/String;J)V

    .line 113
    .line 114
    .line 115
    invoke-interface {v0, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    return-object v0

    .line 121
    :pswitch_4
    check-cast v1, Ljava/lang/String;

    .line 122
    .line 123
    move-object/from16 v2, p2

    .line 124
    .line 125
    check-cast v2, Ljava/lang/Long;

    .line 126
    .line 127
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 128
    .line 129
    .line 130
    move-result-wide v2

    .line 131
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    new-instance v4, La/c5t0;

    .line 135
    .line 136
    invoke-direct {v4, v1, v2, v3}, La/c5t0;-><init>(Ljava/lang/String;J)V

    .line 137
    .line 138
    .line 139
    invoke-interface {v0, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 143
    .line 144
    return-object v0

    .line 145
    :pswitch_5
    check-cast v1, La/fet;

    .line 146
    .line 147
    move-object/from16 v2, p2

    .line 148
    .line 149
    check-cast v2, Ljava/lang/Integer;

    .line 150
    .line 151
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    and-int/lit8 v10, v2, 0x3

    .line 156
    .line 157
    if-eq v10, v7, :cond_0

    .line 158
    .line 159
    move v7, v9

    .line 160
    goto :goto_0

    .line 161
    :cond_0
    move v7, v8

    .line 162
    :goto_0
    and-int/2addr v2, v9

    .line 163
    invoke-virtual {v1, v2, v7}, La/fet;->U(IZ)Z

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    if-eqz v2, :cond_3

    .line 168
    .line 169
    invoke-static {v6, v5}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    const v5, 0x7f13167e

    .line 174
    .line 175
    .line 176
    invoke-static {v5, v8, v1}, La/rsm0;->w(IILa/fet;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v6

    .line 184
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    if-nez v6, :cond_1

    .line 189
    .line 190
    if-ne v7, v4, :cond_2

    .line 191
    .line 192
    :cond_1
    new-instance v7, La/nas0;

    .line 193
    .line 194
    invoke-direct {v7, v0, v9}, La/nas0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    :cond_2
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 201
    .line 202
    invoke-static {v2, v5, v7, v1, v3}, La/dnm0;->f(La/mm40;Ljava/lang/String;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 203
    .line 204
    .line 205
    goto :goto_1

    .line 206
    :cond_3
    invoke-virtual {v1}, La/fet;->X()V

    .line 207
    .line 208
    .line 209
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 210
    .line 211
    return-object v0

    .line 212
    :pswitch_6
    check-cast v1, Ljava/lang/Integer;

    .line 213
    .line 214
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    move-object/from16 v2, p2

    .line 219
    .line 220
    check-cast v2, Ljava/lang/Long;

    .line 221
    .line 222
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 223
    .line 224
    .line 225
    move-result-wide v2

    .line 226
    new-instance v4, La/utr0;

    .line 227
    .line 228
    long-to-int v2, v2

    .line 229
    invoke-direct {v4, v1, v2}, La/utr0;-><init>(II)V

    .line 230
    .line 231
    .line 232
    invoke-interface {v0, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 236
    .line 237
    return-object v0

    .line 238
    :pswitch_7
    check-cast v1, Ljava/lang/Integer;

    .line 239
    .line 240
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    move-object/from16 v2, p2

    .line 245
    .line 246
    check-cast v2, La/iqr0;

    .line 247
    .line 248
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    new-instance v3, La/dpr0;

    .line 252
    .line 253
    invoke-direct {v3, v1, v2}, La/dpr0;-><init>(ILa/iqr0;)V

    .line 254
    .line 255
    .line 256
    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 260
    .line 261
    return-object v0

    .line 262
    :pswitch_8
    check-cast v1, Ljava/lang/Integer;

    .line 263
    .line 264
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 265
    .line 266
    .line 267
    move-result v1

    .line 268
    move-object/from16 v2, p2

    .line 269
    .line 270
    check-cast v2, Ljava/lang/String;

    .line 271
    .line 272
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    new-instance v3, La/vxq0;

    .line 276
    .line 277
    new-instance v4, La/a5l0;

    .line 278
    .line 279
    invoke-direct {v4, v1, v2}, La/a5l0;-><init>(ILjava/lang/String;)V

    .line 280
    .line 281
    .line 282
    invoke-direct {v3, v4}, La/vxq0;-><init>(La/b5l0;)V

    .line 283
    .line 284
    .line 285
    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 289
    .line 290
    return-object v0

    .line 291
    :pswitch_9
    check-cast v1, Ljava/lang/Integer;

    .line 292
    .line 293
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 294
    .line 295
    .line 296
    move-result v1

    .line 297
    move-object/from16 v2, p2

    .line 298
    .line 299
    check-cast v2, Ljava/lang/String;

    .line 300
    .line 301
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    new-instance v3, La/vxq0;

    .line 305
    .line 306
    new-instance v4, La/a5l0;

    .line 307
    .line 308
    invoke-direct {v4, v1, v2}, La/a5l0;-><init>(ILjava/lang/String;)V

    .line 309
    .line 310
    .line 311
    invoke-direct {v3, v4}, La/vxq0;-><init>(La/b5l0;)V

    .line 312
    .line 313
    .line 314
    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 318
    .line 319
    return-object v0

    .line 320
    :pswitch_a
    check-cast v1, Ljava/lang/Long;

    .line 321
    .line 322
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 323
    .line 324
    .line 325
    move-result-wide v1

    .line 326
    move-object/from16 v3, p2

    .line 327
    .line 328
    check-cast v3, Ljava/lang/String;

    .line 329
    .line 330
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    new-instance v4, La/frk0;

    .line 334
    .line 335
    invoke-direct {v4, v1, v2, v3}, La/frk0;-><init>(JLjava/lang/String;)V

    .line 336
    .line 337
    .line 338
    invoke-interface {v0, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 342
    .line 343
    return-object v0

    .line 344
    :pswitch_b
    check-cast v1, La/dpa0;

    .line 345
    .line 346
    move-object/from16 v2, p2

    .line 347
    .line 348
    check-cast v2, La/ne60;

    .line 349
    .line 350
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v1}, La/dpa0;->a()V

    .line 354
    .line 355
    .line 356
    if-eqz v0, :cond_4

    .line 357
    .line 358
    new-instance v1, La/i2l0;

    .line 359
    .line 360
    iget-wide v2, v2, La/ne60;->a:J

    .line 361
    .line 362
    invoke-direct {v1, v2, v3}, La/i2l0;-><init>(J)V

    .line 363
    .line 364
    .line 365
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 369
    .line 370
    return-object v0

    .line 371
    :pswitch_c
    check-cast v1, La/dpa0;

    .line 372
    .line 373
    move-object/from16 v2, p2

    .line 374
    .line 375
    check-cast v2, La/ne60;

    .line 376
    .line 377
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v1}, La/dpa0;->a()V

    .line 381
    .line 382
    .line 383
    if-eqz v0, :cond_5

    .line 384
    .line 385
    new-instance v1, La/xui0;

    .line 386
    .line 387
    iget-wide v2, v2, La/ne60;->a:J

    .line 388
    .line 389
    invoke-direct {v1, v2, v3}, La/xui0;-><init>(J)V

    .line 390
    .line 391
    .line 392
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    :cond_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 396
    .line 397
    return-object v0

    .line 398
    :pswitch_d
    check-cast v1, Ljava/lang/String;

    .line 399
    .line 400
    move-object/from16 v2, p2

    .line 401
    .line 402
    check-cast v2, Ljava/lang/Boolean;

    .line 403
    .line 404
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 405
    .line 406
    .line 407
    move-result v2

    .line 408
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 409
    .line 410
    .line 411
    new-instance v3, La/llg0;

    .line 412
    .line 413
    invoke-direct {v3, v1, v2}, La/llg0;-><init>(Ljava/lang/String;Z)V

    .line 414
    .line 415
    .line 416
    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 420
    .line 421
    return-object v0

    .line 422
    :pswitch_e
    check-cast v1, La/oyg0;

    .line 423
    .line 424
    move-object/from16 v2, p2

    .line 425
    .line 426
    check-cast v2, La/mbf0;

    .line 427
    .line 428
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 432
    .line 433
    .line 434
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    check-cast v0, Lkotlin/Pair;

    .line 439
    .line 440
    iget-object v1, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 441
    .line 442
    move-object v9, v1

    .line 443
    check-cast v9, La/p1f0;

    .line 444
    .line 445
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 446
    .line 447
    move-object v7, v0

    .line 448
    check-cast v7, Ljava/util/Map;

    .line 449
    .line 450
    const/16 v24, 0x0

    .line 451
    .line 452
    const v25, 0x3fffffaf    # 1.9999903f

    .line 453
    .line 454
    .line 455
    const/4 v3, 0x0

    .line 456
    const/4 v4, 0x0

    .line 457
    const/4 v5, 0x0

    .line 458
    const/4 v6, 0x0

    .line 459
    const/4 v8, 0x0

    .line 460
    const/4 v10, 0x0

    .line 461
    const/4 v11, 0x0

    .line 462
    const/4 v12, 0x0

    .line 463
    const/4 v13, 0x0

    .line 464
    const/4 v14, 0x0

    .line 465
    const/4 v15, 0x0

    .line 466
    const/16 v16, 0x0

    .line 467
    .line 468
    const/16 v17, 0x0

    .line 469
    .line 470
    const/16 v18, 0x0

    .line 471
    .line 472
    const/16 v19, 0x0

    .line 473
    .line 474
    const/16 v20, 0x0

    .line 475
    .line 476
    const/16 v21, 0x0

    .line 477
    .line 478
    const/16 v22, 0x0

    .line 479
    .line 480
    const/16 v23, 0x0

    .line 481
    .line 482
    invoke-static/range {v2 .. v25}, La/mbf0;->a(La/mbf0;ZZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/ArrayList;La/p1f0;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;La/q7f0;Ljava/util/List;La/u0f0;Ljava/util/List;ZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;Ljava/lang/String;Ljava/lang/Integer;I)La/mbf0;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    return-object v0

    .line 487
    :pswitch_f
    check-cast v1, La/oyg0;

    .line 488
    .line 489
    move-object/from16 v2, p2

    .line 490
    .line 491
    check-cast v2, La/u4f0;

    .line 492
    .line 493
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 494
    .line 495
    .line 496
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 497
    .line 498
    .line 499
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    check-cast v0, Lkotlin/Pair;

    .line 504
    .line 505
    iget-object v1, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 506
    .line 507
    move-object v9, v1

    .line 508
    check-cast v9, La/r1f0;

    .line 509
    .line 510
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 511
    .line 512
    move-object v7, v0

    .line 513
    check-cast v7, Ljava/util/Map;

    .line 514
    .line 515
    const/16 v24, 0x0

    .line 516
    .line 517
    const v25, 0x3fffffaf    # 1.9999903f

    .line 518
    .line 519
    .line 520
    const/4 v3, 0x0

    .line 521
    const/4 v4, 0x0

    .line 522
    const/4 v5, 0x0

    .line 523
    const/4 v6, 0x0

    .line 524
    const/4 v8, 0x0

    .line 525
    const/4 v10, 0x0

    .line 526
    const/4 v11, 0x0

    .line 527
    const/4 v12, 0x0

    .line 528
    const/4 v13, 0x0

    .line 529
    const/4 v14, 0x0

    .line 530
    const/4 v15, 0x0

    .line 531
    const/16 v16, 0x0

    .line 532
    .line 533
    const/16 v17, 0x0

    .line 534
    .line 535
    const/16 v18, 0x0

    .line 536
    .line 537
    const/16 v19, 0x0

    .line 538
    .line 539
    const/16 v20, 0x0

    .line 540
    .line 541
    const/16 v21, 0x0

    .line 542
    .line 543
    const/16 v22, 0x0

    .line 544
    .line 545
    const/16 v23, 0x0

    .line 546
    .line 547
    invoke-static/range {v2 .. v25}, La/u4f0;->a(La/u4f0;ZZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/ArrayList;La/r1f0;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;La/q7f0;Ljava/util/List;ZLjava/util/List;ZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;Ljava/lang/String;Ljava/lang/Integer;I)La/u4f0;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    return-object v0

    .line 552
    :pswitch_10
    check-cast v1, La/oyg0;

    .line 553
    .line 554
    move-object/from16 v2, p2

    .line 555
    .line 556
    check-cast v2, La/aye0;

    .line 557
    .line 558
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 559
    .line 560
    .line 561
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 562
    .line 563
    .line 564
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    check-cast v0, Lkotlin/Pair;

    .line 569
    .line 570
    iget-object v1, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 571
    .line 572
    move-object v10, v1

    .line 573
    check-cast v10, La/q1f0;

    .line 574
    .line 575
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 576
    .line 577
    move-object v8, v0

    .line 578
    check-cast v8, Ljava/util/Map;

    .line 579
    .line 580
    const/16 v23, 0x0

    .line 581
    .line 582
    const v24, 0x7fffff5f

    .line 583
    .line 584
    .line 585
    const/4 v3, 0x0

    .line 586
    const/4 v4, 0x0

    .line 587
    const/4 v5, 0x0

    .line 588
    const/4 v6, 0x0

    .line 589
    const/4 v7, 0x0

    .line 590
    const/4 v9, 0x0

    .line 591
    const/4 v11, 0x0

    .line 592
    const/4 v12, 0x0

    .line 593
    const/4 v13, 0x0

    .line 594
    const/4 v14, 0x0

    .line 595
    const/4 v15, 0x0

    .line 596
    const/16 v16, 0x0

    .line 597
    .line 598
    const/16 v17, 0x0

    .line 599
    .line 600
    const/16 v18, 0x0

    .line 601
    .line 602
    const/16 v19, 0x0

    .line 603
    .line 604
    const/16 v20, 0x0

    .line 605
    .line 606
    const/16 v21, 0x0

    .line 607
    .line 608
    const/16 v22, 0x0

    .line 609
    .line 610
    invoke-static/range {v2 .. v24}, La/aye0;->a(La/aye0;ZZZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/ArrayList;La/q1f0;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;La/u0f0;Ljava/util/List;ZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/BonusStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;Ljava/lang/String;Ljava/lang/Integer;I)La/aye0;

    .line 611
    .line 612
    .line 613
    move-result-object v0

    .line 614
    return-object v0

    .line 615
    :pswitch_11
    check-cast v1, Ljava/lang/Integer;

    .line 616
    .line 617
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 618
    .line 619
    .line 620
    move-result v1

    .line 621
    move-object/from16 v2, p2

    .line 622
    .line 623
    check-cast v2, Ljava/lang/String;

    .line 624
    .line 625
    new-instance v2, La/zqk0;

    .line 626
    .line 627
    invoke-direct {v2, v1}, La/zqk0;-><init>(I)V

    .line 628
    .line 629
    .line 630
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 631
    .line 632
    .line 633
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 634
    .line 635
    return-object v0

    .line 636
    :pswitch_12
    check-cast v1, La/wim;

    .line 637
    .line 638
    move-object/from16 v2, p2

    .line 639
    .line 640
    check-cast v2, Ljava/lang/String;

    .line 641
    .line 642
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 643
    .line 644
    .line 645
    new-instance v2, La/xlc0;

    .line 646
    .line 647
    invoke-direct {v2, v1}, La/xlc0;-><init>(La/wim;)V

    .line 648
    .line 649
    .line 650
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 654
    .line 655
    return-object v0

    .line 656
    :pswitch_13
    check-cast v1, La/o4c0;

    .line 657
    .line 658
    move-object/from16 v2, p2

    .line 659
    .line 660
    check-cast v2, Ljava/lang/Integer;

    .line 661
    .line 662
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 663
    .line 664
    .line 665
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 666
    .line 667
    .line 668
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 672
    .line 673
    return-object v0

    .line 674
    :pswitch_14
    check-cast v1, La/fet;

    .line 675
    .line 676
    move-object/from16 v2, p2

    .line 677
    .line 678
    check-cast v2, Ljava/lang/Integer;

    .line 679
    .line 680
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 681
    .line 682
    .line 683
    move-result v2

    .line 684
    and-int/lit8 v3, v2, 0x3

    .line 685
    .line 686
    if-eq v3, v7, :cond_6

    .line 687
    .line 688
    move v8, v9

    .line 689
    :cond_6
    and-int/2addr v2, v9

    .line 690
    invoke-virtual {v1, v2, v8}, La/fet;->U(IZ)Z

    .line 691
    .line 692
    .line 693
    move-result v2

    .line 694
    if-eqz v2, :cond_9

    .line 695
    .line 696
    new-instance v3, La/uc50;

    .line 697
    .line 698
    const v2, 0x7f130899

    .line 699
    .line 700
    .line 701
    invoke-static {v2, v1}, La/xsm0;->s(ILa/fet;)Ljava/lang/String;

    .line 702
    .line 703
    .line 704
    move-result-object v2

    .line 705
    invoke-direct {v3, v2}, La/uc50;-><init>(Ljava/lang/String;)V

    .line 706
    .line 707
    .line 708
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 709
    .line 710
    .line 711
    move-result v2

    .line 712
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    move-result-object v5

    .line 716
    if-nez v2, :cond_7

    .line 717
    .line 718
    if-ne v5, v4, :cond_8

    .line 719
    .line 720
    :cond_7
    new-instance v5, La/rpa0;

    .line 721
    .line 722
    const/16 v2, 0x10

    .line 723
    .line 724
    invoke-direct {v5, v0, v2}, La/rpa0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 725
    .line 726
    .line 727
    invoke-virtual {v1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 728
    .line 729
    .line 730
    :cond_8
    move-object v2, v5

    .line 731
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 732
    .line 733
    const/4 v5, 0x6

    .line 734
    const/16 v6, 0x8

    .line 735
    .line 736
    move-object v4, v1

    .line 737
    sget-object v1, La/jm40;->b:La/jm40;

    .line 738
    .line 739
    invoke-static/range {v1 .. v6}, La/vtb;->v(La/mm40;Lkotlin/jvm/functions/Function1;La/vc50;La/fet;II)V

    .line 740
    .line 741
    .line 742
    goto :goto_2

    .line 743
    :cond_9
    move-object v4, v1

    .line 744
    invoke-virtual {v4}, La/fet;->X()V

    .line 745
    .line 746
    .line 747
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 748
    .line 749
    return-object v0

    .line 750
    :pswitch_15
    check-cast v1, La/fet;

    .line 751
    .line 752
    move-object/from16 v2, p2

    .line 753
    .line 754
    check-cast v2, Ljava/lang/Integer;

    .line 755
    .line 756
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 757
    .line 758
    .line 759
    move-result v2

    .line 760
    and-int/lit8 v4, v2, 0x3

    .line 761
    .line 762
    if-eq v4, v7, :cond_a

    .line 763
    .line 764
    move v8, v9

    .line 765
    :cond_a
    and-int/2addr v2, v9

    .line 766
    invoke-virtual {v1, v2, v8}, La/fet;->U(IZ)Z

    .line 767
    .line 768
    .line 769
    move-result v2

    .line 770
    if-eqz v2, :cond_b

    .line 771
    .line 772
    invoke-static {v6, v5}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 773
    .line 774
    .line 775
    move-result-object v2

    .line 776
    invoke-static {v2, v0, v1, v3}, La/yyw;->q(La/mm40;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 777
    .line 778
    .line 779
    goto :goto_3

    .line 780
    :cond_b
    invoke-virtual {v1}, La/fet;->X()V

    .line 781
    .line 782
    .line 783
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 784
    .line 785
    return-object v0

    .line 786
    :pswitch_16
    check-cast v1, Ljava/lang/Long;

    .line 787
    .line 788
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 789
    .line 790
    .line 791
    move-result-wide v1

    .line 792
    move-object/from16 v3, p2

    .line 793
    .line 794
    check-cast v3, Ljava/lang/Boolean;

    .line 795
    .line 796
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 797
    .line 798
    .line 799
    new-instance v3, La/xya0;

    .line 800
    .line 801
    invoke-direct {v3, v1, v2}, La/xya0;-><init>(J)V

    .line 802
    .line 803
    .line 804
    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 805
    .line 806
    .line 807
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 808
    .line 809
    return-object v0

    .line 810
    :pswitch_17
    check-cast v1, Ljava/lang/Integer;

    .line 811
    .line 812
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 813
    .line 814
    .line 815
    move-result v1

    .line 816
    move-object/from16 v2, p2

    .line 817
    .line 818
    check-cast v2, Ljava/lang/String;

    .line 819
    .line 820
    new-instance v3, La/bh1;

    .line 821
    .line 822
    const/4 v4, 0x7

    .line 823
    invoke-direct {v3, v0, v1, v2, v4}, La/bh1;-><init>(Ljava/lang/Object;ILjava/lang/Object;B)V

    .line 824
    .line 825
    .line 826
    sget-object v0, La/ivb0;->b:La/ymx;

    .line 827
    .line 828
    invoke-static {v0, v3}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 829
    .line 830
    .line 831
    move-result-object v0

    .line 832
    invoke-virtual {v0}, La/bjj;->a()V

    .line 833
    .line 834
    .line 835
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 836
    .line 837
    return-object v0

    .line 838
    :pswitch_18
    check-cast v1, Ljava/lang/Integer;

    .line 839
    .line 840
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 841
    .line 842
    .line 843
    move-result v1

    .line 844
    move-object/from16 v2, p2

    .line 845
    .line 846
    check-cast v2, Ljava/lang/String;

    .line 847
    .line 848
    new-instance v2, La/tt80;

    .line 849
    .line 850
    invoke-direct {v2, v1}, La/tt80;-><init>(I)V

    .line 851
    .line 852
    .line 853
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 854
    .line 855
    .line 856
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 857
    .line 858
    return-object v0

    .line 859
    :pswitch_data_0
    .packed-switch 0x0
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
