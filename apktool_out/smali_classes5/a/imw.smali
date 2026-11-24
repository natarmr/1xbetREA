.class public final La/imw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/imw;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v0, v0, La/imw;->a:B

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v4, Lorg/xplatform/authenticator/impl/util/NotificationPeriodInfo;

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, La/q760;->valueOf(Ljava/lang/String;)La/q760;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 30
    .line 31
    .line 32
    move-result-wide v7

    .line 33
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 34
    .line 35
    .line 36
    move-result-wide v9

    .line 37
    invoke-direct/range {v4 .. v10}, Lorg/xplatform/authenticator/impl/util/NotificationPeriodInfo;-><init>(La/q760;Ljava/lang/String;JJ)V

    .line 38
    .line 39
    .line 40
    return-object v4

    .line 41
    :pswitch_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    new-instance v5, Lorg/xplatform/feed/notifictation/data/NotificationInfoUiModel;

    .line 45
    .line 46
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {v0}, La/j760;->valueOf(Ljava/lang/String;)La/j760;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_0

    .line 63
    .line 64
    move v8, v3

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    move v8, v2

    .line 67
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 68
    .line 69
    .line 70
    move-result-wide v9

    .line 71
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 72
    .line 73
    .line 74
    move-result-wide v11

    .line 75
    invoke-direct/range {v5 .. v12}, Lorg/xplatform/feed/notifictation/data/NotificationInfoUiModel;-><init>(La/j760;Ljava/lang/String;ZJJ)V

    .line 76
    .line 77
    .line 78
    return-object v5

    .line 79
    :pswitch_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    new-instance v0, Lorg/xplatform/uikit/components/toolbar/base/styles/NavigationBarSavedState;

    .line 83
    .line 84
    invoke-direct {v0, v1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_1

    .line 92
    .line 93
    move v2, v3

    .line 94
    :cond_1
    iput-boolean v2, v0, Lorg/xplatform/uikit/components/toolbar/base/styles/NavigationBarSavedState;->a:Z

    .line 95
    .line 96
    return-object v0

    .line 97
    :pswitch_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    new-instance v0, Lorg/xplatform/cyber/game/mlbb/api/MlbbPostGameStatScreenParams;

    .line 101
    .line 102
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 107
    .line 108
    .line 109
    move-result-wide v3

    .line 110
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    invoke-direct {v0, v2, v3, v4, v1}, Lorg/xplatform/cyber/game/mlbb/api/MlbbPostGameStatScreenParams;-><init>(Ljava/lang/String;JI)V

    .line 115
    .line 116
    .line 117
    return-object v0

    .line 118
    :pswitch_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    new-instance v5, Lorg/xplatform/cyber/game/mlbb/api/MlbbGameScreenParams;

    .line 122
    .line 123
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 124
    .line 125
    .line 126
    move-result-wide v6

    .line 127
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_2

    .line 132
    .line 133
    move v8, v3

    .line 134
    goto :goto_1

    .line 135
    :cond_2
    move v8, v2

    .line 136
    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 137
    .line 138
    .line 139
    move-result-wide v9

    .line 140
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 141
    .line 142
    .line 143
    move-result-wide v11

    .line 144
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 145
    .line 146
    .line 147
    move-result-wide v13

    .line 148
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-static {v0}, La/grs;->valueOf(Ljava/lang/String;)La/grs;

    .line 153
    .line 154
    .line 155
    move-result-object v15

    .line 156
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-eqz v0, :cond_3

    .line 161
    .line 162
    move/from16 v16, v3

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_3
    move/from16 v16, v2

    .line 166
    .line 167
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v17

    .line 171
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 172
    .line 173
    .line 174
    move-result-wide v18

    .line 175
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 176
    .line 177
    .line 178
    move-result v20

    .line 179
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-static {v0}, La/k1g;->valueOf(Ljava/lang/String;)La/k1g;

    .line 184
    .line 185
    .line 186
    move-result-object v21

    .line 187
    invoke-direct/range {v5 .. v21}, Lorg/xplatform/cyber/game/mlbb/api/MlbbGameScreenParams;-><init>(JZJJJLa/grs;ZLjava/lang/String;JILa/k1g;)V

    .line 188
    .line 189
    .line 190
    return-object v5

    .line 191
    :pswitch_4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-static {v0}, La/xb40;->valueOf(Ljava/lang/String;)La/xb40;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    new-instance v4, Ljava/util/ArrayList;

    .line 207
    .line 208
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 209
    .line 210
    .line 211
    :goto_3
    if-eq v2, v3, :cond_4

    .line 212
    .line 213
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    invoke-static {v5}, La/xb40;->valueOf(Ljava/lang/String;)La/xb40;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    add-int/lit8 v2, v2, 0x1

    .line 225
    .line 226
    goto :goto_3

    .line 227
    :cond_4
    new-instance v1, Lorg/xplatform/cyber/section/impl/meta_heroes/presentation/dialog/MetaHeroesRoleModelParams;

    .line 228
    .line 229
    invoke-direct {v1, v0, v4}, Lorg/xplatform/cyber/section/impl/meta_heroes/presentation/dialog/MetaHeroesRoleModelParams;-><init>(La/xb40;Ljava/util/List;)V

    .line 230
    .line 231
    .line 232
    return-object v1

    .line 233
    :pswitch_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    new-instance v0, Lorg/xplatform/cyber/section/api/meta_heroes/presentation/MetaHeroesParams;

    .line 237
    .line 238
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 239
    .line 240
    .line 241
    move-result-wide v1

    .line 242
    invoke-direct {v0, v1, v2}, Lorg/xplatform/cyber/section/api/meta_heroes/presentation/MetaHeroesParams;-><init>(J)V

    .line 243
    .line 244
    .line 245
    return-object v0

    .line 246
    :pswitch_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    move v0, v3

    .line 250
    new-instance v3, Lorg/xplatform/sportgame/categories_subgames/api/MarketsCategoriesParams;

    .line 251
    .line 252
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 253
    .line 254
    .line 255
    move-result-wide v4

    .line 256
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 257
    .line 258
    .line 259
    move-result v6

    .line 260
    if-eqz v6, :cond_5

    .line 261
    .line 262
    move v12, v0

    .line 263
    goto :goto_4

    .line 264
    :cond_5
    move v12, v2

    .line 265
    :goto_4
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 266
    .line 267
    .line 268
    move-result-wide v6

    .line 269
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 270
    .line 271
    .line 272
    move-result-wide v8

    .line 273
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    move-object v10, v0

    .line 278
    check-cast v10, La/ms2;

    .line 279
    .line 280
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v11

    .line 284
    invoke-direct/range {v3 .. v12}, Lorg/xplatform/sportgame/categories_subgames/api/MarketsCategoriesParams;-><init>(JJJLa/ms2;Ljava/lang/String;Z)V

    .line 285
    .line 286
    .line 287
    return-object v3

    .line 288
    :pswitch_7
    move v0, v3

    .line 289
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    new-instance v3, Lorg/xplatform/market_statistic/api/presentation/MarketStatisticParams;

    .line 293
    .line 294
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 295
    .line 296
    .line 297
    move-result-wide v4

    .line 298
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    if-eqz v1, :cond_6

    .line 303
    .line 304
    move v2, v0

    .line 305
    :cond_6
    invoke-direct {v3, v2, v4, v5}, Lorg/xplatform/market_statistic/api/presentation/MarketStatisticParams;-><init>(ZJ)V

    .line 306
    .line 307
    .line 308
    return-object v3

    .line 309
    :pswitch_8
    move v0, v3

    .line 310
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    new-instance v3, Lorg/xplatform/aggregator/loyalty_program/api/navigation/models/LoyaltyProgramScreenParams;

    .line 314
    .line 315
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    if-eqz v1, :cond_7

    .line 320
    .line 321
    move v2, v0

    .line 322
    :cond_7
    invoke-direct {v3, v2}, Lorg/xplatform/aggregator/loyalty_program/api/navigation/models/LoyaltyProgramScreenParams;-><init>(Z)V

    .line 323
    .line 324
    .line 325
    return-object v3

    .line 326
    :pswitch_9
    move v0, v3

    .line 327
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    new-instance v4, Lorg/xplatform/cyber/game/lol/api/LolScreenParams;

    .line 331
    .line 332
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 333
    .line 334
    .line 335
    move-result-wide v6

    .line 336
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 337
    .line 338
    .line 339
    move-result v3

    .line 340
    if-eqz v3, :cond_8

    .line 341
    .line 342
    move/from16 v18, v0

    .line 343
    .line 344
    goto :goto_5

    .line 345
    :cond_8
    move/from16 v18, v2

    .line 346
    .line 347
    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 348
    .line 349
    .line 350
    move-result-wide v8

    .line 351
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 352
    .line 353
    .line 354
    move-result-wide v10

    .line 355
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 356
    .line 357
    .line 358
    move-result-wide v12

    .line 359
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 360
    .line 361
    .line 362
    move-result v3

    .line 363
    if-eqz v3, :cond_9

    .line 364
    .line 365
    move/from16 v19, v0

    .line 366
    .line 367
    goto :goto_6

    .line 368
    :cond_9
    move/from16 v19, v2

    .line 369
    .line 370
    :goto_6
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v17

    .line 374
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 375
    .line 376
    .line 377
    move-result-wide v14

    .line 378
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 379
    .line 380
    .line 381
    move-result v5

    .line 382
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    invoke-static {v0}, La/k1g;->valueOf(Ljava/lang/String;)La/k1g;

    .line 387
    .line 388
    .line 389
    move-result-object v16

    .line 390
    invoke-direct/range {v4 .. v19}, Lorg/xplatform/cyber/game/lol/api/LolScreenParams;-><init>(IJJJJJLa/k1g;Ljava/lang/String;ZZ)V

    .line 391
    .line 392
    .line 393
    return-object v4

    .line 394
    :pswitch_a
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    new-instance v5, Lorg/xplatform/cyber/game/lol/api/LolPostGameStatScreenParams;

    .line 398
    .line 399
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v6

    .line 403
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 404
    .line 405
    .line 406
    move-result-wide v9

    .line 407
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 408
    .line 409
    .line 410
    move-result v7

    .line 411
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 412
    .line 413
    .line 414
    move-result v8

    .line 415
    invoke-direct/range {v5 .. v10}, Lorg/xplatform/cyber/game/lol/api/LolPostGameStatScreenParams;-><init>(Ljava/lang/String;IIJ)V

    .line 416
    .line 417
    .line 418
    return-object v5

    .line 419
    :pswitch_b
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 420
    .line 421
    .line 422
    new-instance v6, Lorg/xplatform/feed/linelive/presentation/feeds/child/liveexpress/models/LiveExpressItemsScreenParams;

    .line 423
    .line 424
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 425
    .line 426
    .line 427
    move-result-wide v7

    .line 428
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    move-object v9, v0

    .line 433
    check-cast v9, La/aj00;

    .line 434
    .line 435
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v10

    .line 439
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v11

    .line 443
    invoke-direct/range {v6 .. v11}, Lorg/xplatform/feed/linelive/presentation/feeds/child/liveexpress/models/LiveExpressItemsScreenParams;-><init>(JLa/aj00;Ljava/lang/String;Ljava/lang/String;)V

    .line 444
    .line 445
    .line 446
    return-object v6

    .line 447
    :pswitch_c
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    invoke-static {v0}, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->valueOf(Ljava/lang/String;)Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    return-object v0

    .line 459
    :pswitch_d
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    invoke-static {v0}, Lorg/xplatform/limits_ne/api/domain/LimitNeGroupEnum;->valueOf(Ljava/lang/String;)Lorg/xplatform/limits_ne/api/domain/LimitNeGroupEnum;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    return-object v0

    .line 471
    :pswitch_e
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    invoke-static {v0}, Lorg/xplatform/limits_kenya/api/domain/LimitKenyaGroupEnum;->valueOf(Ljava/lang/String;)Lorg/xplatform/limits_kenya/api/domain/LimitKenyaGroupEnum;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    return-object v0

    .line 483
    :pswitch_f
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    invoke-static {v0}, Lorg/xplatform/limits_africa/api/domain/LimitGroupEnum;->valueOf(Ljava/lang/String;)Lorg/xplatform/limits_africa/api/domain/LimitGroupEnum;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    return-object v0

    .line 495
    :pswitch_10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    invoke-static {v0}, Lorg/xplatform/limits_ee/api/domain/LimitGroupEnum;->valueOf(Ljava/lang/String;)Lorg/xplatform/limits_ee/api/domain/LimitGroupEnum;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    return-object v0

    .line 507
    :pswitch_11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 511
    .line 512
    .line 513
    move-result v0

    .line 514
    new-instance v3, Ljava/util/ArrayList;

    .line 515
    .line 516
    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 517
    .line 518
    .line 519
    :goto_7
    if-eq v2, v0, :cond_a

    .line 520
    .line 521
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v4

    .line 525
    invoke-static {v4}, La/xhz;->valueOf(Ljava/lang/String;)La/xhz;

    .line 526
    .line 527
    .line 528
    move-result-object v4

    .line 529
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    add-int/lit8 v2, v2, 0x1

    .line 533
    .line 534
    goto :goto_7

    .line 535
    :cond_a
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    invoke-static {v0}, La/xhz;->valueOf(Ljava/lang/String;)La/xhz;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    new-instance v1, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/type/model/LeaderboardTypeModelParams;

    .line 544
    .line 545
    invoke-direct {v1, v3, v0}, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/type/model/LeaderboardTypeModelParams;-><init>(Ljava/util/List;La/xhz;)V

    .line 546
    .line 547
    .line 548
    return-object v1

    .line 549
    :pswitch_12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 550
    .line 551
    .line 552
    new-instance v0, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/time_filter/LeaderboardTimeFilterYearsModel;

    .line 553
    .line 554
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 555
    .line 556
    .line 557
    move-result v2

    .line 558
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 559
    .line 560
    .line 561
    move-result-object v1

    .line 562
    invoke-direct {v0, v2, v1}, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/time_filter/LeaderboardTimeFilterYearsModel;-><init>(ILjava/lang/String;)V

    .line 563
    .line 564
    .line 565
    return-object v0

    .line 566
    :pswitch_13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 567
    .line 568
    .line 569
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 570
    .line 571
    .line 572
    move-result v0

    .line 573
    new-instance v3, Ljava/util/ArrayList;

    .line 574
    .line 575
    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 576
    .line 577
    .line 578
    :goto_8
    if-eq v2, v0, :cond_b

    .line 579
    .line 580
    sget-object v4, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/time_filter/LeaderboardTimeFilterYearsModel;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 581
    .line 582
    invoke-interface {v4, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object v4

    .line 586
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 587
    .line 588
    .line 589
    add-int/lit8 v2, v2, 0x1

    .line 590
    .line 591
    goto :goto_8

    .line 592
    :cond_b
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 593
    .line 594
    .line 595
    move-result v0

    .line 596
    new-instance v1, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/time_filter/LeaderboardTimeFilterModelParams;

    .line 597
    .line 598
    invoke-direct {v1, v3, v0}, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/time_filter/LeaderboardTimeFilterModelParams;-><init>(Ljava/util/AbstractList;I)V

    .line 599
    .line 600
    .line 601
    return-object v1

    .line 602
    :pswitch_14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 603
    .line 604
    .line 605
    new-instance v0, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/teams_type/model/LeaderboardTeamsTypeModelParams;

    .line 606
    .line 607
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object v1

    .line 611
    invoke-static {v1}, La/epe;->valueOf(Ljava/lang/String;)La/epe;

    .line 612
    .line 613
    .line 614
    move-result-object v1

    .line 615
    invoke-direct {v0, v1}, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/teams_type/model/LeaderboardTeamsTypeModelParams;-><init>(La/epe;)V

    .line 616
    .line 617
    .line 618
    return-object v0

    .line 619
    :pswitch_15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 620
    .line 621
    .line 622
    new-instance v0, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/regions/LeaderboardRegionModelParams;

    .line 623
    .line 624
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v1

    .line 628
    invoke-static {v1}, La/qgz;->valueOf(Ljava/lang/String;)La/qgz;

    .line 629
    .line 630
    .line 631
    move-result-object v1

    .line 632
    invoke-direct {v0, v1}, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/regions/LeaderboardRegionModelParams;-><init>(La/qgz;)V

    .line 633
    .line 634
    .line 635
    return-object v0

    .line 636
    :pswitch_16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 637
    .line 638
    .line 639
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 640
    .line 641
    .line 642
    move-result-wide v3

    .line 643
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 644
    .line 645
    .line 646
    move-result v0

    .line 647
    new-instance v5, Ljava/util/ArrayList;

    .line 648
    .line 649
    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 650
    .line 651
    .line 652
    :goto_9
    if-eq v2, v0, :cond_c

    .line 653
    .line 654
    sget-object v6, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/discipline_filter/model/LeaderboardDisciplineFilter;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 655
    .line 656
    invoke-interface {v6, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v6

    .line 660
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 661
    .line 662
    .line 663
    add-int/lit8 v2, v2, 0x1

    .line 664
    .line 665
    goto :goto_9

    .line 666
    :cond_c
    new-instance v0, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/discipline_filter/model/LeaderboardDisciplineFilterParams;

    .line 667
    .line 668
    invoke-direct {v0, v3, v4, v5}, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/discipline_filter/model/LeaderboardDisciplineFilterParams;-><init>(JLjava/util/List;)V

    .line 669
    .line 670
    .line 671
    return-object v0

    .line 672
    :pswitch_17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 673
    .line 674
    .line 675
    new-instance v0, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/discipline_filter/model/LeaderboardDisciplineFilter;

    .line 676
    .line 677
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 678
    .line 679
    .line 680
    move-result-wide v2

    .line 681
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 682
    .line 683
    .line 684
    move-result-object v4

    .line 685
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 686
    .line 687
    .line 688
    move-result-object v1

    .line 689
    invoke-direct {v0, v2, v3, v4, v1}, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/discipline_filter/model/LeaderboardDisciplineFilter;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 690
    .line 691
    .line 692
    return-object v0

    .line 693
    :pswitch_18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 694
    .line 695
    .line 696
    new-instance v5, Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;

    .line 697
    .line 698
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 699
    .line 700
    .line 701
    move-result-wide v6

    .line 702
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 703
    .line 704
    .line 705
    move-result-wide v8

    .line 706
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    move-result-object v0

    .line 710
    invoke-static {v0}, La/ggz;->valueOf(Ljava/lang/String;)La/ggz;

    .line 711
    .line 712
    .line 713
    move-result-object v10

    .line 714
    invoke-direct/range {v5 .. v10}, Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;-><init>(JJLa/ggz;)V

    .line 715
    .line 716
    .line 717
    return-object v5

    .line 718
    :pswitch_19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 719
    .line 720
    .line 721
    new-instance v0, Lorg/xplatform/ufc/api/last_fights/LastFightsParams;

    .line 722
    .line 723
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 724
    .line 725
    .line 726
    move-result-wide v1

    .line 727
    invoke-direct {v0, v1, v2}, Lorg/xplatform/ufc/api/last_fights/LastFightsParams;-><init>(J)V

    .line 728
    .line 729
    .line 730
    return-object v0

    .line 731
    :pswitch_1a
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 732
    .line 733
    .line 734
    new-instance v0, Landroidx/activity/result/IntentSenderRequest;

    .line 735
    .line 736
    const-class v2, Landroid/content/IntentSender;

    .line 737
    .line 738
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 739
    .line 740
    .line 741
    move-result-object v2

    .line 742
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 743
    .line 744
    .line 745
    move-result-object v2

    .line 746
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 747
    .line 748
    .line 749
    check-cast v2, Landroid/content/IntentSender;

    .line 750
    .line 751
    const-class v3, Landroid/content/Intent;

    .line 752
    .line 753
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 754
    .line 755
    .line 756
    move-result-object v3

    .line 757
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 758
    .line 759
    .line 760
    move-result-object v3

    .line 761
    check-cast v3, Landroid/content/Intent;

    .line 762
    .line 763
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 764
    .line 765
    .line 766
    move-result v4

    .line 767
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 768
    .line 769
    .line 770
    move-result v1

    .line 771
    invoke-direct {v0, v2, v3, v4, v1}, Landroidx/activity/result/IntentSenderRequest;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    .line 772
    .line 773
    .line 774
    return-object v0

    .line 775
    :pswitch_1b
    move v0, v3

    .line 776
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 777
    .line 778
    .line 779
    move-result v2

    .line 780
    const/4 v3, 0x0

    .line 781
    :goto_a
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 782
    .line 783
    .line 784
    move-result v4

    .line 785
    if-ge v4, v2, :cond_e

    .line 786
    .line 787
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 788
    .line 789
    .line 790
    move-result v4

    .line 791
    int-to-char v5, v4

    .line 792
    if-eq v5, v0, :cond_d

    .line 793
    .line 794
    invoke-static {v1, v4}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 795
    .line 796
    .line 797
    goto :goto_a

    .line 798
    :cond_d
    invoke-static {v1, v4}, La/b5x;->y(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 799
    .line 800
    .line 801
    move-result-object v3

    .line 802
    goto :goto_a

    .line 803
    :cond_e
    invoke-static {v1, v2}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 804
    .line 805
    .line 806
    new-instance v0, Lcom/google/android/gms/identitycredentials/ImportCredentialsForDeviceSetupResponse;

    .line 807
    .line 808
    invoke-direct {v0, v3}, Lcom/google/android/gms/identitycredentials/ImportCredentialsForDeviceSetupResponse;-><init>(Landroid/os/Bundle;)V

    .line 809
    .line 810
    .line 811
    return-object v0

    .line 812
    :pswitch_1c
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 813
    .line 814
    .line 815
    new-instance v4, Lorg/xplatform/statistic/horse_menu/domain/model/HorseInfoModel;

    .line 816
    .line 817
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 818
    .line 819
    .line 820
    move-result-wide v10

    .line 821
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 822
    .line 823
    .line 824
    move-result-object v5

    .line 825
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 826
    .line 827
    .line 828
    move-result-object v6

    .line 829
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 830
    .line 831
    .line 832
    move-result-object v7

    .line 833
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 834
    .line 835
    .line 836
    move-result-object v8

    .line 837
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 838
    .line 839
    .line 840
    move-result-object v9

    .line 841
    invoke-direct/range {v4 .. v11}, Lorg/xplatform/statistic/horse_menu/domain/model/HorseInfoModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 842
    .line 843
    .line 844
    return-object v4

    .line 845
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

.method public final newArray(I)[Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte p0, p0, La/imw;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Lorg/xplatform/authenticator/impl/util/NotificationPeriodInfo;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Lorg/xplatform/feed/notifictation/data/NotificationInfoUiModel;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Lorg/xplatform/uikit/components/toolbar/base/styles/NavigationBarSavedState;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    :goto_0
    if-ge v0, p1, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    aput-object v1, p0, v0

    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-object p0

    .line 24
    :pswitch_2
    new-array p0, p1, [Lorg/xplatform/cyber/game/mlbb/api/MlbbPostGameStatScreenParams;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_3
    new-array p0, p1, [Lorg/xplatform/cyber/game/mlbb/api/MlbbGameScreenParams;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_4
    new-array p0, p1, [Lorg/xplatform/cyber/section/impl/meta_heroes/presentation/dialog/MetaHeroesRoleModelParams;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_5
    new-array p0, p1, [Lorg/xplatform/cyber/section/api/meta_heroes/presentation/MetaHeroesParams;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_6
    new-array p0, p1, [Lorg/xplatform/sportgame/categories_subgames/api/MarketsCategoriesParams;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_7
    new-array p0, p1, [Lorg/xplatform/market_statistic/api/presentation/MarketStatisticParams;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_8
    new-array p0, p1, [Lorg/xplatform/aggregator/loyalty_program/api/navigation/models/LoyaltyProgramScreenParams;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_9
    new-array p0, p1, [Lorg/xplatform/cyber/game/lol/api/LolScreenParams;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_a
    new-array p0, p1, [Lorg/xplatform/cyber/game/lol/api/LolPostGameStatScreenParams;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_b
    new-array p0, p1, [Lorg/xplatform/feed/linelive/presentation/feeds/child/liveexpress/models/LiveExpressItemsScreenParams;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_c
    new-array p0, p1, [Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_d
    new-array p0, p1, [Lorg/xplatform/limits_ne/api/domain/LimitNeGroupEnum;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_e
    new-array p0, p1, [Lorg/xplatform/limits_kenya/api/domain/LimitKenyaGroupEnum;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_f
    new-array p0, p1, [Lorg/xplatform/limits_africa/api/domain/LimitGroupEnum;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_10
    new-array p0, p1, [Lorg/xplatform/limits_ee/api/domain/LimitGroupEnum;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_11
    new-array p0, p1, [Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/type/model/LeaderboardTypeModelParams;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_12
    new-array p0, p1, [Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/time_filter/LeaderboardTimeFilterYearsModel;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_13
    new-array p0, p1, [Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/time_filter/LeaderboardTimeFilterModelParams;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_14
    new-array p0, p1, [Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/teams_type/model/LeaderboardTeamsTypeModelParams;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_15
    new-array p0, p1, [Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/regions/LeaderboardRegionModelParams;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_16
    new-array p0, p1, [Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/discipline_filter/model/LeaderboardDisciplineFilterParams;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_17
    new-array p0, p1, [Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/discipline_filter/model/LeaderboardDisciplineFilter;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_18
    new-array p0, p1, [Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_19
    new-array p0, p1, [Lorg/xplatform/ufc/api/last_fights/LastFightsParams;

    .line 94
    .line 95
    return-object p0

    .line 96
    :pswitch_1a
    new-array p0, p1, [Landroidx/activity/result/IntentSenderRequest;

    .line 97
    .line 98
    return-object p0

    .line 99
    :pswitch_1b
    new-array p0, p1, [Lcom/google/android/gms/identitycredentials/ImportCredentialsForDeviceSetupResponse;

    .line 100
    .line 101
    return-object p0

    .line 102
    :pswitch_1c
    new-array p0, p1, [Lorg/xplatform/statistic/horse_menu/domain/model/HorseInfoModel;

    .line 103
    .line 104
    return-object p0

    .line 105
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
