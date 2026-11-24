.class public final La/yoo;
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
    iput-byte p1, p0, La/yoo;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v0, v0, La/yoo;->a:B

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;->valueOf(Ljava/lang/String;)Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0

    .line 25
    :pswitch_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    new-instance v0, Lorg/xplatform/bet_history/history/presentation/dialog/history_menu/model/HistoryMenuItemUiModel;

    .line 29
    .line 30
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    sget-object v4, Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 39
    .line 40
    invoke-interface {v4, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;

    .line 45
    .line 46
    invoke-direct {v0, v2, v3, v1}, Lorg/xplatform/bet_history/history/presentation/dialog/history_menu/model/HistoryMenuItemUiModel;-><init>(Ljava/lang/String;ILorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;)V

    .line 47
    .line 48
    .line 49
    return-object v0

    .line 50
    :pswitch_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0}, Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;->valueOf(Ljava/lang/String;)Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    return-object v0

    .line 62
    :pswitch_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    new-instance v0, Lorg/xplatform/bet_history/history/presentation/dialog/history_data_filter/model/HistoryDateFilterTypeUiModel;

    .line 66
    .line 67
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    sget-object v6, Lorg/xplatform/bet_history/history/presentation/dialog/history_data_filter/model/HistoryDateFilterTypeModel;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 76
    .line 77
    invoke-interface {v6, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    check-cast v6, Lorg/xplatform/bet_history/history/presentation/dialog/history_data_filter/model/HistoryDateFilterTypeModel;

    .line 82
    .line 83
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_0

    .line 88
    .line 89
    move v3, v4

    .line 90
    :cond_0
    invoke-direct {v0, v2, v5, v6, v3}, Lorg/xplatform/bet_history/history/presentation/dialog/history_data_filter/model/HistoryDateFilterTypeUiModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/bet_history/history/presentation/dialog/history_data_filter/model/HistoryDateFilterTypeModel;Z)V

    .line 91
    .line 92
    .line 93
    return-object v0

    .line 94
    :pswitch_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-static {v0}, Lorg/xplatform/bet_history/history/presentation/dialog/history_data_filter/model/HistoryDateFilterTypeModel;->valueOf(Ljava/lang/String;)Lorg/xplatform/bet_history/history/presentation/dialog/history_data_filter/model/HistoryDateFilterTypeModel;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    return-object v0

    .line 106
    :pswitch_4
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    move-object v3, v2

    .line 111
    move-object v5, v3

    .line 112
    move-object v6, v5

    .line 113
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    if-ge v7, v0, :cond_5

    .line 118
    .line 119
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    int-to-char v8, v7

    .line 124
    if-eq v8, v4, :cond_4

    .line 125
    .line 126
    const/4 v9, 0x2

    .line 127
    if-eq v8, v9, :cond_3

    .line 128
    .line 129
    const/4 v9, 0x3

    .line 130
    if-eq v8, v9, :cond_2

    .line 131
    .line 132
    const/4 v9, 0x4

    .line 133
    if-eq v8, v9, :cond_1

    .line 134
    .line 135
    invoke-static {v1, v7}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 136
    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_1
    sget-object v6, Landroid/os/ResultReceiver;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 140
    .line 141
    invoke-static {v1, v7, v6}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    check-cast v6, Landroid/os/ResultReceiver;

    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_2
    invoke-static {v1, v7}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    goto :goto_0

    .line 153
    :cond_3
    invoke-static {v1, v7}, La/b5x;->y(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    goto :goto_0

    .line 158
    :cond_4
    sget-object v2, Lcom/google/android/gms/identitycredentials/CredentialOption;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 159
    .line 160
    invoke-static {v1, v7, v2}, La/b5x;->G(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    goto :goto_0

    .line 165
    :cond_5
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 166
    .line 167
    .line 168
    new-instance v0, Lcom/google/android/gms/identitycredentials/GetCredentialRequest;

    .line 169
    .line 170
    invoke-direct {v0, v2, v3, v5, v6}, Lcom/google/android/gms/identitycredentials/GetCredentialRequest;-><init>(Ljava/util/ArrayList;Landroid/os/Bundle;Ljava/lang/String;Landroid/os/ResultReceiver;)V

    .line 171
    .line 172
    .line 173
    return-object v0

    .line 174
    :pswitch_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    new-instance v0, Lorg/xplatform/coupon/impl/generate_coupon/presentation/model/compose/GenerateCouponTypeUiModel;

    .line 178
    .line 179
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 184
    .line 185
    .line 186
    move-result v5

    .line 187
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    if-eqz v1, :cond_6

    .line 192
    .line 193
    move v3, v4

    .line 194
    :cond_6
    invoke-direct {v0, v2, v5, v3}, Lorg/xplatform/coupon/impl/generate_coupon/presentation/model/compose/GenerateCouponTypeUiModel;-><init>(Ljava/lang/String;IZ)V

    .line 195
    .line 196
    .line 197
    return-object v0

    .line 198
    :pswitch_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    new-instance v6, Lorg/xplatform/bethistory/domain/model/GeneralBetInfoModel;

    .line 202
    .line 203
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 204
    .line 205
    .line 206
    move-result v7

    .line 207
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v8

    .line 211
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v9

    .line 215
    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    .line 216
    .line 217
    .line 218
    move-result-wide v10

    .line 219
    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    .line 220
    .line 221
    .line 222
    move-result-wide v12

    .line 223
    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    .line 224
    .line 225
    .line 226
    move-result-wide v14

    .line 227
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v16

    .line 231
    invoke-direct/range {v6 .. v16}, Lorg/xplatform/bethistory/domain/model/GeneralBetInfoModel;-><init>(ILjava/lang/String;Ljava/lang/String;DDDLjava/lang/String;)V

    .line 232
    .line 233
    .line 234
    return-object v6

    .line 235
    :pswitch_7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 239
    .line 240
    .line 241
    move-result v0

    .line 242
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 243
    .line 244
    invoke-direct {v2, v0}, Ljava/util/LinkedHashSet;-><init>(I)V

    .line 245
    .line 246
    .line 247
    :goto_1
    if-eq v3, v0, :cond_7

    .line 248
    .line 249
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 250
    .line 251
    .line 252
    move-result-wide v4

    .line 253
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    invoke-virtual {v2, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    add-int/lit8 v3, v3, 0x1

    .line 261
    .line 262
    goto :goto_1

    .line 263
    :cond_7
    new-instance v0, Lorg/xplatform/results/impl/presentation/alt_live_games/GamesLiveResultsParams;

    .line 264
    .line 265
    invoke-direct {v0, v2}, Lorg/xplatform/results/impl/presentation/alt_live_games/GamesLiveResultsParams;-><init>(Ljava/util/Set;)V

    .line 266
    .line 267
    .line 268
    return-object v0

    .line 269
    :pswitch_8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 277
    .line 278
    .line 279
    move-result v2

    .line 280
    new-instance v5, Ljava/util/ArrayList;

    .line 281
    .line 282
    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 283
    .line 284
    .line 285
    move v6, v3

    .line 286
    :goto_2
    if-eq v6, v2, :cond_8

    .line 287
    .line 288
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 289
    .line 290
    .line 291
    move-result-wide v7

    .line 292
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 293
    .line 294
    .line 295
    move-result-object v7

    .line 296
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    add-int/lit8 v6, v6, 0x1

    .line 300
    .line 301
    goto :goto_2

    .line 302
    :cond_8
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 303
    .line 304
    .line 305
    move-result v2

    .line 306
    if-eqz v2, :cond_9

    .line 307
    .line 308
    move v3, v4

    .line 309
    :cond_9
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 310
    .line 311
    .line 312
    move-result v1

    .line 313
    new-instance v2, Lorg/xplatform/results/impl/presentation/alt_history/GamesHistoryResultsParams;

    .line 314
    .line 315
    invoke-direct {v2, v1, v0, v5, v3}, Lorg/xplatform/results/impl/presentation/alt_history/GamesHistoryResultsParams;-><init>(ILjava/lang/String;Ljava/util/List;Z)V

    .line 316
    .line 317
    .line 318
    return-object v2

    .line 319
    :pswitch_9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    new-instance v6, Lorg/xplatform/game_broadcasting/api/presentation/models/GameVideoUiConfig;

    .line 323
    .line 324
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v7

    .line 328
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 329
    .line 330
    .line 331
    move-result v8

    .line 332
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 333
    .line 334
    .line 335
    move-result v9

    .line 336
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 337
    .line 338
    .line 339
    move-result v10

    .line 340
    const-class v0, Lorg/xplatform/game_broadcasting/api/presentation/models/GameVideoUiConfig;

    .line 341
    .line 342
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    move-object v11, v0

    .line 351
    check-cast v11, Lorg/xplatform/game_broadcasting/api/presentation/GameVideoPlayerColorScheme;

    .line 352
    .line 353
    invoke-direct/range {v6 .. v11}, Lorg/xplatform/game_broadcasting/api/presentation/models/GameVideoUiConfig;-><init>(Ljava/lang/String;IIILorg/xplatform/game_broadcasting/api/presentation/GameVideoPlayerColorScheme;)V

    .line 354
    .line 355
    .line 356
    return-object v6

    .line 357
    :pswitch_a
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 361
    .line 362
    .line 363
    move-result-wide v5

    .line 364
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 365
    .line 366
    .line 367
    move-result v0

    .line 368
    if-eqz v0, :cond_a

    .line 369
    .line 370
    goto :goto_3

    .line 371
    :cond_a
    move v4, v3

    .line 372
    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 373
    .line 374
    .line 375
    move-result v0

    .line 376
    new-instance v2, Ljava/util/ArrayList;

    .line 377
    .line 378
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 379
    .line 380
    .line 381
    :goto_4
    if-eq v3, v0, :cond_b

    .line 382
    .line 383
    sget-object v7, Lorg/xplatform/feed/notifictation/presentation/models/PeriodSubscriptionSettingsScreenUiModel;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 384
    .line 385
    invoke-interface {v7, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v7

    .line 389
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    add-int/lit8 v3, v3, 0x1

    .line 393
    .line 394
    goto :goto_4

    .line 395
    :cond_b
    new-instance v0, Lorg/xplatform/feed/notifictation/presentation/models/GameSubscriptionSettingsScreenUiModel;

    .line 396
    .line 397
    invoke-direct {v0, v5, v6, v4, v2}, Lorg/xplatform/feed/notifictation/presentation/models/GameSubscriptionSettingsScreenUiModel;-><init>(JZLjava/util/ArrayList;)V

    .line 398
    .line 399
    .line 400
    return-object v0

    .line 401
    :pswitch_b
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 402
    .line 403
    .line 404
    new-instance v0, Lorg/xplatform/betting/core/zip/model/zip/game/GameStatistic;

    .line 405
    .line 406
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    invoke-static {v2}, La/z6m0;->valueOf(Ljava/lang/String;)La/z6m0;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v3

    .line 418
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v4

    .line 422
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v1

    .line 426
    invoke-direct {v0, v2, v3, v4, v1}, Lorg/xplatform/betting/core/zip/model/zip/game/GameStatistic;-><init>(La/z6m0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 427
    .line 428
    .line 429
    return-object v0

    .line 430
    :pswitch_c
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 431
    .line 432
    .line 433
    new-instance v5, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;

    .line 434
    .line 435
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 436
    .line 437
    .line 438
    move-result-wide v6

    .line 439
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 440
    .line 441
    .line 442
    move-result-wide v8

    .line 443
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 444
    .line 445
    .line 446
    move-result-wide v10

    .line 447
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 448
    .line 449
    .line 450
    move-result-wide v12

    .line 451
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 452
    .line 453
    .line 454
    move-result v0

    .line 455
    if-eqz v0, :cond_c

    .line 456
    .line 457
    move v14, v4

    .line 458
    goto :goto_5

    .line 459
    :cond_c
    move v14, v3

    .line 460
    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 461
    .line 462
    .line 463
    move-result-wide v15

    .line 464
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 465
    .line 466
    .line 467
    move-result v0

    .line 468
    if-eqz v0, :cond_d

    .line 469
    .line 470
    move/from16 v17, v4

    .line 471
    .line 472
    goto :goto_6

    .line 473
    :cond_d
    move/from16 v17, v3

    .line 474
    .line 475
    :goto_6
    const-class v0, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;

    .line 476
    .line 477
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    move-object/from16 v18, v0

    .line 486
    .line 487
    check-cast v18, Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 488
    .line 489
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    invoke-static {v0}, La/grs;->valueOf(Ljava/lang/String;)La/grs;

    .line 494
    .line 495
    .line 496
    move-result-object v19

    .line 497
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v20

    .line 501
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v21

    .line 505
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    invoke-static {v0}, La/ors;->valueOf(Ljava/lang/String;)La/ors;

    .line 510
    .line 511
    .line 512
    move-result-object v22

    .line 513
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 514
    .line 515
    .line 516
    move-result v23

    .line 517
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 518
    .line 519
    .line 520
    move-result v0

    .line 521
    if-eqz v0, :cond_e

    .line 522
    .line 523
    move/from16 v24, v4

    .line 524
    .line 525
    goto :goto_7

    .line 526
    :cond_e
    move/from16 v24, v3

    .line 527
    .line 528
    :goto_7
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    invoke-static {v0}, La/k1g;->valueOf(Ljava/lang/String;)La/k1g;

    .line 533
    .line 534
    .line 535
    move-result-object v25

    .line 536
    invoke-direct/range {v5 .. v25}, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;-><init>(JJJJZJZLorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;La/grs;Ljava/lang/String;Ljava/lang/String;La/ors;IZLa/k1g;)V

    .line 537
    .line 538
    .line 539
    return-object v5

    .line 540
    :pswitch_d
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    new-instance v6, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;

    .line 544
    .line 545
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 546
    .line 547
    .line 548
    move-result-wide v7

    .line 549
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 550
    .line 551
    .line 552
    move-result-wide v9

    .line 553
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object v15

    .line 557
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 558
    .line 559
    .line 560
    move-result-wide v11

    .line 561
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 562
    .line 563
    .line 564
    move-result-wide v13

    .line 565
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 566
    .line 567
    .line 568
    move-result v0

    .line 569
    if-eqz v0, :cond_f

    .line 570
    .line 571
    move/from16 v16, v4

    .line 572
    .line 573
    goto :goto_8

    .line 574
    :cond_f
    move/from16 v16, v3

    .line 575
    .line 576
    :goto_8
    invoke-direct/range {v6 .. v16}, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;-><init>(JJJJLjava/lang/String;Z)V

    .line 577
    .line 578
    .line 579
    return-object v6

    .line 580
    :pswitch_e
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 581
    .line 582
    .line 583
    new-instance v7, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;

    .line 584
    .line 585
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 586
    .line 587
    .line 588
    move-result-wide v8

    .line 589
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 590
    .line 591
    .line 592
    move-result v0

    .line 593
    if-eqz v0, :cond_10

    .line 594
    .line 595
    move v10, v4

    .line 596
    goto :goto_9

    .line 597
    :cond_10
    move v10, v3

    .line 598
    :goto_9
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 599
    .line 600
    .line 601
    move-result v0

    .line 602
    if-eqz v0, :cond_11

    .line 603
    .line 604
    move v11, v4

    .line 605
    goto :goto_a

    .line 606
    :cond_11
    move v11, v3

    .line 607
    :goto_a
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 608
    .line 609
    .line 610
    move-result-wide v12

    .line 611
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 612
    .line 613
    .line 614
    move-result v14

    .line 615
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 616
    .line 617
    .line 618
    move-result-object v15

    .line 619
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 620
    .line 621
    .line 622
    move-result-wide v16

    .line 623
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v18

    .line 627
    invoke-direct/range {v7 .. v18}, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;-><init>(JZZJILjava/lang/String;JLjava/lang/String;)V

    .line 628
    .line 629
    .line 630
    return-object v7

    .line 631
    :pswitch_f
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 632
    .line 633
    .line 634
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    invoke-static {v0}, Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;->valueOf(Ljava/lang/String;)Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 639
    .line 640
    .line 641
    move-result-object v0

    .line 642
    return-object v0

    .line 643
    :pswitch_10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 644
    .line 645
    .line 646
    move-object v0, v1

    .line 647
    new-instance v1, Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;

    .line 648
    .line 649
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 650
    .line 651
    .line 652
    move-result v2

    .line 653
    move v5, v3

    .line 654
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 655
    .line 656
    .line 657
    move-result-object v3

    .line 658
    move v6, v4

    .line 659
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 660
    .line 661
    .line 662
    move-result v4

    .line 663
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 664
    .line 665
    .line 666
    move-result-object v7

    .line 667
    invoke-static {v7}, La/fcq;->valueOf(Ljava/lang/String;)La/fcq;

    .line 668
    .line 669
    .line 670
    move-result-object v7

    .line 671
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 672
    .line 673
    .line 674
    move-result v0

    .line 675
    if-eqz v0, :cond_12

    .line 676
    .line 677
    :goto_b
    move-object v5, v7

    .line 678
    goto :goto_c

    .line 679
    :cond_12
    move v6, v5

    .line 680
    goto :goto_b

    .line 681
    :goto_c
    invoke-direct/range {v1 .. v6}, Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;-><init>(ILjava/lang/String;ILa/fcq;Z)V

    .line 682
    .line 683
    .line 684
    return-object v1

    .line 685
    :pswitch_11
    move-object v0, v1

    .line 686
    move v5, v3

    .line 687
    move v6, v4

    .line 688
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 689
    .line 690
    .line 691
    new-instance v2, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;

    .line 692
    .line 693
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 694
    .line 695
    .line 696
    move-result v3

    .line 697
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 698
    .line 699
    .line 700
    move-result-object v4

    .line 701
    move v1, v5

    .line 702
    move v7, v6

    .line 703
    invoke-virtual {v0}, Landroid/os/Parcel;->readDouble()D

    .line 704
    .line 705
    .line 706
    move-result-wide v5

    .line 707
    move v8, v7

    .line 708
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 709
    .line 710
    .line 711
    move-result-object v7

    .line 712
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 713
    .line 714
    .line 715
    move-result-object v9

    .line 716
    invoke-static {v9}, La/fcq;->valueOf(Ljava/lang/String;)La/fcq;

    .line 717
    .line 718
    .line 719
    move-result-object v9

    .line 720
    move v11, v8

    .line 721
    move-object v8, v9

    .line 722
    invoke-virtual {v0}, Landroid/os/Parcel;->readDouble()D

    .line 723
    .line 724
    .line 725
    move-result-wide v9

    .line 726
    move v12, v11

    .line 727
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 728
    .line 729
    .line 730
    move-result v11

    .line 731
    move v14, v12

    .line 732
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 733
    .line 734
    .line 735
    move-result-wide v12

    .line 736
    move v1, v14

    .line 737
    invoke-virtual {v0}, Landroid/os/Parcel;->readDouble()D

    .line 738
    .line 739
    .line 740
    move-result-wide v14

    .line 741
    invoke-virtual {v0}, Landroid/os/Parcel;->readDouble()D

    .line 742
    .line 743
    .line 744
    move-result-wide v16

    .line 745
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 746
    .line 747
    .line 748
    move-result v18

    .line 749
    if-eqz v18, :cond_13

    .line 750
    .line 751
    move/from16 v18, v1

    .line 752
    .line 753
    goto :goto_d

    .line 754
    :cond_13
    const/16 v18, 0x0

    .line 755
    .line 756
    :goto_d
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 757
    .line 758
    .line 759
    move-result v19

    .line 760
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 761
    .line 762
    .line 763
    move-result-wide v20

    .line 764
    invoke-direct/range {v2 .. v21}, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;-><init>(ILjava/lang/String;DLjava/lang/String;La/fcq;DIJDDZIJ)V

    .line 765
    .line 766
    .line 767
    return-object v2

    .line 768
    :pswitch_12
    move-object v0, v1

    .line 769
    move v1, v4

    .line 770
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 771
    .line 772
    .line 773
    new-instance v2, Lorg/xplatform/aggregator/impl/category/presentation/models/FilterUiModel;

    .line 774
    .line 775
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 776
    .line 777
    .line 778
    move-result-object v3

    .line 779
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 780
    .line 781
    .line 782
    move-result-object v4

    .line 783
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 784
    .line 785
    .line 786
    move-result v5

    .line 787
    if-eqz v5, :cond_14

    .line 788
    .line 789
    goto :goto_e

    .line 790
    :cond_14
    const/4 v1, 0x0

    .line 791
    :goto_e
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 792
    .line 793
    .line 794
    move-result-object v0

    .line 795
    invoke-direct {v2, v3, v4, v0, v1}, Lorg/xplatform/aggregator/impl/category/presentation/models/FilterUiModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 796
    .line 797
    .line 798
    return-object v2

    .line 799
    :pswitch_13
    move-object v0, v1

    .line 800
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 801
    .line 802
    .line 803
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 804
    .line 805
    .line 806
    move-result-object v1

    .line 807
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 808
    .line 809
    .line 810
    move-result-object v2

    .line 811
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 812
    .line 813
    .line 814
    move-result-object v3

    .line 815
    invoke-static {v3}, La/w3q;->valueOf(Ljava/lang/String;)La/w3q;

    .line 816
    .line 817
    .line 818
    move-result-object v3

    .line 819
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 820
    .line 821
    .line 822
    move-result v4

    .line 823
    new-instance v5, Ljava/util/ArrayList;

    .line 824
    .line 825
    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 826
    .line 827
    .line 828
    const/4 v6, 0x0

    .line 829
    :goto_f
    if-eq v6, v4, :cond_15

    .line 830
    .line 831
    const-class v7, Lorg/xplatform/aggregator/impl/category/presentation/models/FilterCategoryUiModel;

    .line 832
    .line 833
    invoke-virtual {v7}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 834
    .line 835
    .line 836
    move-result-object v7

    .line 837
    invoke-virtual {v0, v7}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 838
    .line 839
    .line 840
    move-result-object v7

    .line 841
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 842
    .line 843
    .line 844
    add-int/lit8 v6, v6, 0x1

    .line 845
    .line 846
    goto :goto_f

    .line 847
    :cond_15
    new-instance v0, Lorg/xplatform/aggregator/impl/category/presentation/models/FilterCategoryUiModel;

    .line 848
    .line 849
    invoke-direct {v0, v1, v2, v3, v5}, Lorg/xplatform/aggregator/impl/category/presentation/models/FilterCategoryUiModel;-><init>(Ljava/lang/String;Ljava/lang/String;La/w3q;Ljava/util/List;)V

    .line 850
    .line 851
    .line 852
    return-object v0

    .line 853
    :pswitch_14
    move-object v0, v1

    .line 854
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 855
    .line 856
    .line 857
    new-instance v1, Lorg/xplatform/cyber/game/core/betting/presentation/filter/FilterActionResultUiModel;

    .line 858
    .line 859
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 860
    .line 861
    .line 862
    move-result-wide v2

    .line 863
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 864
    .line 865
    .line 866
    move-result v0

    .line 867
    invoke-direct {v1, v2, v3, v0}, Lorg/xplatform/cyber/game/core/betting/presentation/filter/FilterActionResultUiModel;-><init>(JI)V

    .line 868
    .line 869
    .line 870
    return-object v1

    .line 871
    :pswitch_15
    move-object v0, v1

    .line 872
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 873
    .line 874
    .line 875
    new-instance v1, Lorg/xplatform/sportgame/markets/settings/impl/presentation/models/FilterActionResultUiModel;

    .line 876
    .line 877
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 878
    .line 879
    .line 880
    move-result-wide v2

    .line 881
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 882
    .line 883
    .line 884
    move-result v0

    .line 885
    invoke-direct {v1, v2, v3, v0}, Lorg/xplatform/sportgame/markets/settings/impl/presentation/models/FilterActionResultUiModel;-><init>(JI)V

    .line 886
    .line 887
    .line 888
    return-object v1

    .line 889
    :pswitch_16
    move-object v0, v1

    .line 890
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 891
    .line 892
    .line 893
    new-instance v4, Lorg/xplatform/cyber/game/core/betting/presentation/settings/FilterActionDialogUiModel;

    .line 894
    .line 895
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 896
    .line 897
    .line 898
    move-result-object v5

    .line 899
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 900
    .line 901
    .line 902
    move-result-wide v6

    .line 903
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 904
    .line 905
    .line 906
    move-result-object v1

    .line 907
    invoke-static {v1}, La/ki;->valueOf(Ljava/lang/String;)La/ki;

    .line 908
    .line 909
    .line 910
    move-result-object v8

    .line 911
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 912
    .line 913
    .line 914
    move-result-object v0

    .line 915
    invoke-static {v0}, La/ki;->valueOf(Ljava/lang/String;)La/ki;

    .line 916
    .line 917
    .line 918
    move-result-object v9

    .line 919
    invoke-direct/range {v4 .. v9}, Lorg/xplatform/cyber/game/core/betting/presentation/settings/FilterActionDialogUiModel;-><init>(Ljava/lang/String;JLa/ki;La/ki;)V

    .line 920
    .line 921
    .line 922
    return-object v4

    .line 923
    :pswitch_17
    move-object v0, v1

    .line 924
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 925
    .line 926
    .line 927
    new-instance v5, Lorg/xplatform/sportgame/markets/settings/impl/presentation/models/FilterActionDialogUiModel;

    .line 928
    .line 929
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 930
    .line 931
    .line 932
    move-result-object v6

    .line 933
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 934
    .line 935
    .line 936
    move-result-wide v7

    .line 937
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 938
    .line 939
    .line 940
    move-result-object v1

    .line 941
    invoke-static {v1}, La/ji;->valueOf(Ljava/lang/String;)La/ji;

    .line 942
    .line 943
    .line 944
    move-result-object v9

    .line 945
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 946
    .line 947
    .line 948
    move-result-object v0

    .line 949
    invoke-static {v0}, La/ji;->valueOf(Ljava/lang/String;)La/ji;

    .line 950
    .line 951
    .line 952
    move-result-object v10

    .line 953
    invoke-direct/range {v5 .. v10}, Lorg/xplatform/sportgame/markets/settings/impl/presentation/models/FilterActionDialogUiModel;-><init>(Ljava/lang/String;JLa/ji;La/ji;)V

    .line 954
    .line 955
    .line 956
    return-object v5

    .line 957
    :pswitch_18
    move-object v0, v1

    .line 958
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 959
    .line 960
    .line 961
    new-instance v1, Lorg/xplatform/ufc/api/fighter/FighterParams;

    .line 962
    .line 963
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 964
    .line 965
    .line 966
    move-result-wide v2

    .line 967
    invoke-direct {v1, v2, v3}, Lorg/xplatform/ufc/api/fighter/FighterParams;-><init>(J)V

    .line 968
    .line 969
    .line 970
    return-object v1

    .line 971
    :pswitch_19
    move-object v0, v1

    .line 972
    move v1, v4

    .line 973
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 974
    .line 975
    .line 976
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 977
    .line 978
    .line 979
    move-result v2

    .line 980
    if-eqz v2, :cond_16

    .line 981
    .line 982
    move v4, v1

    .line 983
    goto :goto_10

    .line 984
    :cond_16
    const/4 v4, 0x0

    .line 985
    :goto_10
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 986
    .line 987
    .line 988
    move-result v1

    .line 989
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 990
    .line 991
    invoke-direct {v2, v1}, Ljava/util/LinkedHashSet;-><init>(I)V

    .line 992
    .line 993
    .line 994
    const/4 v3, 0x0

    .line 995
    :goto_11
    if-eq v3, v1, :cond_17

    .line 996
    .line 997
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 998
    .line 999
    .line 1000
    move-result-wide v5

    .line 1001
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v5

    .line 1005
    invoke-virtual {v2, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 1006
    .line 1007
    .line 1008
    add-int/lit8 v3, v3, 0x1

    .line 1009
    .line 1010
    goto :goto_11

    .line 1011
    :cond_17
    new-instance v0, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;

    .line 1012
    .line 1013
    invoke-direct {v0, v2, v4}, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;-><init>(Ljava/util/Set;Z)V

    .line 1014
    .line 1015
    .line 1016
    return-object v0

    .line 1017
    :pswitch_1a
    move-object v0, v1

    .line 1018
    move v1, v4

    .line 1019
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1023
    .line 1024
    .line 1025
    move-result v2

    .line 1026
    new-instance v4, Ljava/util/ArrayList;

    .line 1027
    .line 1028
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1029
    .line 1030
    .line 1031
    const/4 v3, 0x0

    .line 1032
    :goto_12
    if-eq v3, v2, :cond_18

    .line 1033
    .line 1034
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 1035
    .line 1036
    .line 1037
    move-result-wide v5

    .line 1038
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v5

    .line 1042
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1043
    .line 1044
    .line 1045
    add-int/lit8 v3, v3, 0x1

    .line 1046
    .line 1047
    goto :goto_12

    .line 1048
    :cond_18
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v2

    .line 1052
    invoke-static {v2}, La/j700;->valueOf(Ljava/lang/String;)La/j700;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v5

    .line 1056
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1057
    .line 1058
    .line 1059
    move-result v2

    .line 1060
    new-instance v6, Ljava/util/LinkedHashSet;

    .line 1061
    .line 1062
    invoke-direct {v6, v2}, Ljava/util/LinkedHashSet;-><init>(I)V

    .line 1063
    .line 1064
    .line 1065
    const/4 v3, 0x0

    .line 1066
    :goto_13
    if-eq v3, v2, :cond_19

    .line 1067
    .line 1068
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1069
    .line 1070
    .line 1071
    move-result v7

    .line 1072
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v7

    .line 1076
    invoke-virtual {v6, v7}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 1077
    .line 1078
    .line 1079
    add-int/lit8 v3, v3, 0x1

    .line 1080
    .line 1081
    goto :goto_13

    .line 1082
    :cond_19
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v7

    .line 1086
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1087
    .line 1088
    .line 1089
    move-result v0

    .line 1090
    if-eqz v0, :cond_1a

    .line 1091
    .line 1092
    move v8, v1

    .line 1093
    goto :goto_14

    .line 1094
    :cond_1a
    const/4 v8, 0x0

    .line 1095
    :goto_14
    new-instance v3, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsScreenParams;

    .line 1096
    .line 1097
    invoke-direct/range {v3 .. v8}, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsScreenParams;-><init>(Ljava/util/List;La/j700;Ljava/util/Set;Ljava/lang/String;Z)V

    .line 1098
    .line 1099
    .line 1100
    return-object v3

    .line 1101
    :pswitch_1b
    move-object v0, v1

    .line 1102
    move v1, v4

    .line 1103
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1104
    .line 1105
    .line 1106
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1107
    .line 1108
    .line 1109
    move-result v2

    .line 1110
    new-instance v4, Ljava/util/ArrayList;

    .line 1111
    .line 1112
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1113
    .line 1114
    .line 1115
    const/4 v3, 0x0

    .line 1116
    :goto_15
    if-eq v3, v2, :cond_1b

    .line 1117
    .line 1118
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 1119
    .line 1120
    .line 1121
    move-result-wide v5

    .line 1122
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v5

    .line 1126
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1127
    .line 1128
    .line 1129
    add-int/lit8 v3, v3, 0x1

    .line 1130
    .line 1131
    goto :goto_15

    .line 1132
    :cond_1b
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v2

    .line 1136
    invoke-static {v2}, La/j700;->valueOf(Ljava/lang/String;)La/j700;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v5

    .line 1140
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1141
    .line 1142
    .line 1143
    move-result v2

    .line 1144
    new-instance v6, Ljava/util/LinkedHashSet;

    .line 1145
    .line 1146
    invoke-direct {v6, v2}, Ljava/util/LinkedHashSet;-><init>(I)V

    .line 1147
    .line 1148
    .line 1149
    const/4 v3, 0x0

    .line 1150
    :goto_16
    if-eq v3, v2, :cond_1c

    .line 1151
    .line 1152
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1153
    .line 1154
    .line 1155
    move-result v7

    .line 1156
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v7

    .line 1160
    invoke-virtual {v6, v7}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 1161
    .line 1162
    .line 1163
    add-int/lit8 v3, v3, 0x1

    .line 1164
    .line 1165
    goto :goto_16

    .line 1166
    :cond_1c
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1167
    .line 1168
    .line 1169
    move-result v2

    .line 1170
    if-eqz v2, :cond_1d

    .line 1171
    .line 1172
    move v7, v1

    .line 1173
    goto :goto_17

    .line 1174
    :cond_1d
    const/4 v7, 0x0

    .line 1175
    :goto_17
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v8

    .line 1179
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v9

    .line 1183
    new-instance v3, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedGameItemsScreenParams;

    .line 1184
    .line 1185
    invoke-direct/range {v3 .. v9}, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedGameItemsScreenParams;-><init>(Ljava/util/List;La/j700;Ljava/util/Set;ZLjava/lang/String;Ljava/lang/String;)V

    .line 1186
    .line 1187
    .line 1188
    return-object v3

    .line 1189
    :pswitch_1c
    move-object v0, v1

    .line 1190
    move v1, v4

    .line 1191
    invoke-static {v0}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1192
    .line 1193
    .line 1194
    move-result v3

    .line 1195
    :goto_18
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 1196
    .line 1197
    .line 1198
    move-result v4

    .line 1199
    if-ge v4, v3, :cond_1f

    .line 1200
    .line 1201
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1202
    .line 1203
    .line 1204
    move-result v4

    .line 1205
    int-to-char v5, v4

    .line 1206
    if-eq v5, v1, :cond_1e

    .line 1207
    .line 1208
    invoke-static {v0, v4}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1209
    .line 1210
    .line 1211
    goto :goto_18

    .line 1212
    :cond_1e
    invoke-static {v0, v4}, La/b5x;->y(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v2

    .line 1216
    goto :goto_18

    .line 1217
    :cond_1f
    invoke-static {v0, v3}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1218
    .line 1219
    .line 1220
    new-instance v0, Lcom/google/android/gms/identitycredentials/ExportCredentialsToDeviceSetupResponse;

    .line 1221
    .line 1222
    invoke-direct {v0, v2}, Lcom/google/android/gms/identitycredentials/ExportCredentialsToDeviceSetupResponse;-><init>(Landroid/os/Bundle;)V

    .line 1223
    .line 1224
    .line 1225
    return-object v0

    .line 1226
    nop

    .line 1227
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
    .locals 0

    .line 1
    iget-byte p0, p0, La/yoo;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Lorg/xplatform/bet_history/history/presentation/dialog/history_menu/model/HistoryMenuItemUiModel;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Lorg/xplatform/bet_history/history/presentation/dialog/history_data_filter/model/HistoryDateFilterTypeUiModel;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    new-array p0, p1, [Lorg/xplatform/bet_history/history/presentation/dialog/history_data_filter/model/HistoryDateFilterTypeModel;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    new-array p0, p1, [Lcom/google/android/gms/identitycredentials/GetCredentialRequest;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    new-array p0, p1, [Lorg/xplatform/coupon/impl/generate_coupon/presentation/model/compose/GenerateCouponTypeUiModel;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_6
    new-array p0, p1, [Lorg/xplatform/bethistory/domain/model/GeneralBetInfoModel;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_7
    new-array p0, p1, [Lorg/xplatform/results/impl/presentation/alt_live_games/GamesLiveResultsParams;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_8
    new-array p0, p1, [Lorg/xplatform/results/impl/presentation/alt_history/GamesHistoryResultsParams;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_9
    new-array p0, p1, [Lorg/xplatform/game_broadcasting/api/presentation/models/GameVideoUiConfig;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_a
    new-array p0, p1, [Lorg/xplatform/feed/notifictation/presentation/models/GameSubscriptionSettingsScreenUiModel;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_b
    new-array p0, p1, [Lorg/xplatform/betting/core/zip/model/zip/game/GameStatistic;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_c
    new-array p0, p1, [Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_d
    new-array p0, p1, [Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_e
    new-array p0, p1, [Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_f
    new-array p0, p1, [Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_10
    new-array p0, p1, [Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_11
    new-array p0, p1, [Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_12
    new-array p0, p1, [Lorg/xplatform/aggregator/impl/category/presentation/models/FilterUiModel;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_13
    new-array p0, p1, [Lorg/xplatform/aggregator/impl/category/presentation/models/FilterCategoryUiModel;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_14
    new-array p0, p1, [Lorg/xplatform/cyber/game/core/betting/presentation/filter/FilterActionResultUiModel;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_15
    new-array p0, p1, [Lorg/xplatform/sportgame/markets/settings/impl/presentation/models/FilterActionResultUiModel;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_16
    new-array p0, p1, [Lorg/xplatform/cyber/game/core/betting/presentation/settings/FilterActionDialogUiModel;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_17
    new-array p0, p1, [Lorg/xplatform/sportgame/markets/settings/impl/presentation/models/FilterActionDialogUiModel;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_18
    new-array p0, p1, [Lorg/xplatform/ufc/api/fighter/FighterParams;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_19
    new-array p0, p1, [Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_1a
    new-array p0, p1, [Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsScreenParams;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_1b
    new-array p0, p1, [Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedGameItemsScreenParams;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_1c
    new-array p0, p1, [Lcom/google/android/gms/identitycredentials/ExportCredentialsToDeviceSetupResponse;

    .line 94
    .line 95
    return-object p0

    .line 96
    nop

    .line 97
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
