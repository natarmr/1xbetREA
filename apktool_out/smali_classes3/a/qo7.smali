.class public final La/qo7;
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
    iput-byte p1, p0, La/qo7;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 46

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v0, v0, La/qo7;->a:B

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
    new-instance v0, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    move v2, v3

    .line 32
    :cond_0
    invoke-direct {v0, v5, v4, v2}, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;-><init>(Ljava/lang/String;IZ)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    new-instance v0, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;

    .line 40
    .line 41
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    move v2, v3

    .line 56
    :cond_1
    invoke-direct {v0, v5, v4, v2}, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;-><init>(Ljava/lang/String;IZ)V

    .line 57
    .line 58
    .line 59
    return-object v0

    .line 60
    :pswitch_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    new-instance v0, Lorg/xplatform/statistic/tennis/impl/summary/presentation/chose_filter/ChoseFilterUiModel;

    .line 64
    .line 65
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_2

    .line 78
    .line 79
    move v2, v3

    .line 80
    :cond_2
    invoke-direct {v0, v4, v5, v2}, Lorg/xplatform/statistic/tennis/impl/summary/presentation/chose_filter/ChoseFilterUiModel;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 81
    .line 82
    .line 83
    return-object v0

    .line 84
    :pswitch_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    new-instance v5, Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 102
    .line 103
    .line 104
    :goto_0
    if-eq v2, v4, :cond_3

    .line 105
    .line 106
    sget-object v6, Lorg/xplatform/statistic/tennis/impl/summary/presentation/chose_filter/ChoseFilterUiModel;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 107
    .line 108
    invoke-interface {v6, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    add-int/lit8 v2, v2, 0x1

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_3
    new-instance v1, Lorg/xplatform/statistic/tennis/impl/summary/presentation/chose_filter/ChoseFilterScreenParams;

    .line 119
    .line 120
    invoke-direct {v1, v0, v3, v5}, Lorg/xplatform/statistic/tennis/impl/summary/presentation/chose_filter/ChoseFilterScreenParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 121
    .line 122
    .line 123
    return-object v1

    .line 124
    :pswitch_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    new-instance v0, Lorg/xplatform/sportgame/bets_on_players/impl/presentation/model/ChooseSubGameParams;

    .line 128
    .line 129
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 130
    .line 131
    .line 132
    move-result-wide v2

    .line 133
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 134
    .line 135
    .line 136
    move-result-wide v4

    .line 137
    invoke-direct {v0, v2, v3, v4, v5}, Lorg/xplatform/sportgame/bets_on_players/impl/presentation/model/ChooseSubGameParams;-><init>(JJ)V

    .line 138
    .line 139
    .line 140
    return-object v0

    .line 141
    :pswitch_4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    new-instance v4, Ljava/util/ArrayList;

    .line 153
    .line 154
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 155
    .line 156
    .line 157
    :goto_1
    if-eq v2, v3, :cond_4

    .line 158
    .line 159
    sget-object v5, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 160
    .line 161
    invoke-interface {v5, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    add-int/lit8 v2, v2, 0x1

    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_4
    new-instance v1, Lorg/xplatform/betting/core/zip/model/zip/bet/ChildBets;

    .line 172
    .line 173
    invoke-direct {v1, v0, v4}, Lorg/xplatform/betting/core/zip/model/zip/bet/ChildBets;-><init>(ILjava/util/ArrayList;)V

    .line 174
    .line 175
    .line 176
    return-object v1

    .line 177
    :pswitch_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    new-instance v0, Lorg/xplatform/security/impl/navigation/ChangePhoneNumberScreen;

    .line 181
    .line 182
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    check-cast v1, La/uqb;

    .line 187
    .line 188
    invoke-direct {v0, v1}, Lorg/xplatform/security/impl/navigation/ChangePhoneNumberScreen;-><init>(La/uqb;)V

    .line 189
    .line 190
    .line 191
    return-object v0

    .line 192
    :pswitch_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    new-instance v8, Ljava/util/ArrayList;

    .line 200
    .line 201
    invoke-direct {v8, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 202
    .line 203
    .line 204
    move v4, v2

    .line 205
    :goto_2
    if-eq v4, v0, :cond_5

    .line 206
    .line 207
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 208
    .line 209
    .line 210
    move-result-wide v5

    .line 211
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 212
    .line 213
    .line 214
    move-result-object v5

    .line 215
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    add-int/lit8 v4, v4, 0x1

    .line 219
    .line 220
    goto :goto_2

    .line 221
    :cond_5
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 222
    .line 223
    .line 224
    move-result-wide v6

    .line 225
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 226
    .line 227
    .line 228
    move-result v5

    .line 229
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    if-eqz v0, :cond_6

    .line 234
    .line 235
    move v9, v3

    .line 236
    goto :goto_3

    .line 237
    :cond_6
    move v9, v2

    .line 238
    :goto_3
    new-instance v4, Lorg/xplatform/results/impl/presentation/alt_champs/ChampsResultsParams;

    .line 239
    .line 240
    invoke-direct/range {v4 .. v9}, Lorg/xplatform/results/impl/presentation/alt_champs/ChampsResultsParams;-><init>(IJLjava/util/List;Z)V

    .line 241
    .line 242
    .line 243
    return-object v4

    .line 244
    :pswitch_7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    new-instance v0, Lorg/xplatform/statistic/champ_statistic/presentation/models/ChampSubMenuItem;

    .line 248
    .line 249
    const-class v2, Lorg/xplatform/statistic/champ_statistic/presentation/models/ChampSubMenuItem;

    .line 250
    .line 251
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    check-cast v2, Lorg/xplatform/statistic/champ_statistic/presentation/models/ChampMenuType;

    .line 260
    .line 261
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    invoke-direct {v0, v2, v3, v1}, Lorg/xplatform/statistic/champ_statistic/presentation/models/ChampSubMenuItem;-><init>(Lorg/xplatform/statistic/champ_statistic/presentation/models/ChampMenuType;Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    return-object v0

    .line 273
    :pswitch_8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    new-instance v4, Lorg/xplatform/sportgame/markets/categories/api/navigation/CategoryMarketsParams;

    .line 277
    .line 278
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 279
    .line 280
    .line 281
    move-result-wide v5

    .line 282
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 283
    .line 284
    .line 285
    move-result-wide v7

    .line 286
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 287
    .line 288
    .line 289
    move-result-wide v9

    .line 290
    invoke-direct/range {v4 .. v10}, Lorg/xplatform/sportgame/markets/categories/api/navigation/CategoryMarketsParams;-><init>(JJJ)V

    .line 291
    .line 292
    .line 293
    return-object v4

    .line 294
    :pswitch_9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    invoke-static {v0}, Lorg/xplatform/favorites/impl/presentation/screen/category_image_header/models/CategoryImageHeaderTab;->valueOf(Ljava/lang/String;)Lorg/xplatform/favorites/impl/presentation/screen/category_image_header/models/CategoryImageHeaderTab;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    return-object v0

    .line 306
    :pswitch_a
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    new-instance v0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 310
    .line 311
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    invoke-static {v2}, La/dja;->valueOf(Ljava/lang/String;)La/dja;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 320
    .line 321
    .line 322
    move-result v1

    .line 323
    invoke-direct {v0, v2, v1}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;-><init>(La/dja;I)V

    .line 324
    .line 325
    .line 326
    return-object v0

    .line 327
    :pswitch_b
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    invoke-static {v0}, Lorg/xplatform/cyber/section/impl/championships/universal/domain/model/calendar_tournament/CalendarTournamentMatchStatusModel;->valueOf(Ljava/lang/String;)Lorg/xplatform/cyber/section/impl/championships/universal/domain/model/calendar_tournament/CalendarTournamentMatchStatusModel;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    return-object v0

    .line 339
    :pswitch_c
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    move-object v0, v1

    .line 343
    new-instance v1, Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;

    .line 344
    .line 345
    move v4, v2

    .line 346
    move v5, v3

    .line 347
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 348
    .line 349
    .line 350
    move-result-wide v2

    .line 351
    move v6, v4

    .line 352
    move v7, v5

    .line 353
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 354
    .line 355
    .line 356
    move-result-wide v4

    .line 357
    move v8, v6

    .line 358
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 359
    .line 360
    .line 361
    move-result v6

    .line 362
    move v10, v7

    .line 363
    move v9, v8

    .line 364
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 365
    .line 366
    .line 367
    move-result-wide v7

    .line 368
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    if-eqz v0, :cond_7

    .line 373
    .line 374
    move v9, v10

    .line 375
    :cond_7
    invoke-direct/range {v1 .. v9}, Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;-><init>(JJIJZ)V

    .line 376
    .line 377
    .line 378
    return-object v1

    .line 379
    :pswitch_d
    move-object v0, v1

    .line 380
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 384
    .line 385
    .line 386
    sget-object v0, Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingZoneEvent$Fullscreen;->a:Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingZoneEvent$Fullscreen;

    .line 387
    .line 388
    return-object v0

    .line 389
    :pswitch_e
    move-object v0, v1

    .line 390
    move v9, v2

    .line 391
    move v10, v3

    .line 392
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    new-instance v1, Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingVideoLandscapeParams;

    .line 396
    .line 397
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 398
    .line 399
    .line 400
    move-result-wide v2

    .line 401
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 402
    .line 403
    .line 404
    move-result-wide v4

    .line 405
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v8

    .line 409
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 410
    .line 411
    .line 412
    move-result-wide v6

    .line 413
    move v11, v9

    .line 414
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v9

    .line 418
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 419
    .line 420
    .line 421
    move-result v0

    .line 422
    if-eqz v0, :cond_8

    .line 423
    .line 424
    goto :goto_4

    .line 425
    :cond_8
    move v10, v11

    .line 426
    :goto_4
    invoke-direct/range {v1 .. v10}, Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingVideoLandscapeParams;-><init>(JJJLjava/lang/String;Ljava/lang/String;Z)V

    .line 427
    .line 428
    .line 429
    return-object v1

    .line 430
    :pswitch_f
    move-object v0, v1

    .line 431
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 432
    .line 433
    .line 434
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 435
    .line 436
    .line 437
    sget-object v0, Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingVideoEvent$Fullscreen;->a:Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingVideoEvent$Fullscreen;

    .line 438
    .line 439
    return-object v0

    .line 440
    :pswitch_10
    move-object v0, v1

    .line 441
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    new-instance v1, Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;

    .line 445
    .line 446
    const-class v2, Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;

    .line 447
    .line 448
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 449
    .line 450
    .line 451
    move-result-object v3

    .line 452
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 453
    .line 454
    .line 455
    move-result-object v3

    .line 456
    check-cast v3, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 457
    .line 458
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 459
    .line 460
    .line 461
    move-result-object v2

    .line 462
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    check-cast v0, Lorg/xplatform/uikit/compose/components/picker/model/TimeOfDay23;

    .line 467
    .line 468
    invoke-direct {v1, v3, v0}, Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;-><init>(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/TimeOfDay23;)V

    .line 469
    .line 470
    .line 471
    return-object v1

    .line 472
    :pswitch_11
    move-object v0, v1

    .line 473
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 474
    .line 475
    .line 476
    new-instance v1, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;

    .line 477
    .line 478
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 479
    .line 480
    .line 481
    move-result v2

    .line 482
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v3

    .line 486
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    invoke-direct {v1, v2, v3, v0}, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 491
    .line 492
    .line 493
    return-object v1

    .line 494
    :pswitch_12
    move-object v0, v1

    .line 495
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 496
    .line 497
    .line 498
    new-instance v1, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/BonusStateModel;

    .line 499
    .line 500
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 501
    .line 502
    .line 503
    move-result v2

    .line 504
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v3

    .line 508
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    invoke-direct {v1, v2, v3, v0}, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/BonusStateModel;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 513
    .line 514
    .line 515
    return-object v1

    .line 516
    :pswitch_13
    move-object v0, v1

    .line 517
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 518
    .line 519
    .line 520
    new-instance v1, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;

    .line 521
    .line 522
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 523
    .line 524
    .line 525
    move-result v2

    .line 526
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object v3

    .line 530
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    invoke-direct {v1, v2, v3, v0}, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    return-object v1

    .line 538
    :pswitch_14
    move-object v0, v1

    .line 539
    move v11, v2

    .line 540
    move v10, v3

    .line 541
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 542
    .line 543
    .line 544
    new-instance v4, Lorg/xplatform/registration/bonus/api/BonusSelectionScreenParams;

    .line 545
    .line 546
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 547
    .line 548
    .line 549
    move-result v5

    .line 550
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 551
    .line 552
    .line 553
    move-result v6

    .line 554
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 555
    .line 556
    .line 557
    move-result-wide v8

    .line 558
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 559
    .line 560
    .line 561
    move-result v1

    .line 562
    if-eqz v1, :cond_9

    .line 563
    .line 564
    goto :goto_5

    .line 565
    :cond_9
    move v10, v11

    .line 566
    :goto_5
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 567
    .line 568
    .line 569
    move-result v7

    .line 570
    invoke-direct/range {v4 .. v10}, Lorg/xplatform/registration/bonus/api/BonusSelectionScreenParams;-><init>(IIIJZ)V

    .line 571
    .line 572
    .line 573
    return-object v4

    .line 574
    :pswitch_15
    move-object v0, v1

    .line 575
    move v11, v2

    .line 576
    move v10, v3

    .line 577
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 578
    .line 579
    .line 580
    new-instance v1, Lorg/xplatform/registration/api/domain/models/BonusInfoModel;

    .line 581
    .line 582
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 583
    .line 584
    .line 585
    move-result v2

    .line 586
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 587
    .line 588
    .line 589
    move-result-object v3

    .line 590
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 591
    .line 592
    .line 593
    move-result-object v4

    .line 594
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 595
    .line 596
    .line 597
    move-result v0

    .line 598
    if-eqz v0, :cond_a

    .line 599
    .line 600
    goto :goto_6

    .line 601
    :cond_a
    move v10, v11

    .line 602
    :goto_6
    invoke-direct {v1, v2, v3, v4, v10}, Lorg/xplatform/registration/api/domain/models/BonusInfoModel;-><init>(ILjava/lang/String;Ljava/lang/String;Z)V

    .line 603
    .line 604
    .line 605
    return-object v1

    .line 606
    :pswitch_16
    move-object v0, v1

    .line 607
    move v11, v2

    .line 608
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 609
    .line 610
    .line 611
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object v1

    .line 615
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 616
    .line 617
    .line 618
    move-result v2

    .line 619
    new-instance v3, Ljava/util/ArrayList;

    .line 620
    .line 621
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 622
    .line 623
    .line 624
    :goto_7
    if-eq v11, v2, :cond_b

    .line 625
    .line 626
    const-class v4, Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/params/BonusAccountScreenParams;

    .line 627
    .line 628
    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 629
    .line 630
    .line 631
    move-result-object v4

    .line 632
    invoke-virtual {v0, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 633
    .line 634
    .line 635
    move-result-object v4

    .line 636
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 637
    .line 638
    .line 639
    add-int/lit8 v11, v11, 0x1

    .line 640
    .line 641
    goto :goto_7

    .line 642
    :cond_b
    new-instance v0, Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/params/BonusAccountScreenParams;

    .line 643
    .line 644
    invoke-direct {v0, v1, v3}, Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/params/BonusAccountScreenParams;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 645
    .line 646
    .line 647
    return-object v0

    .line 648
    :pswitch_17
    move-object v0, v1

    .line 649
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 650
    .line 651
    .line 652
    new-instance v1, Lorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;

    .line 653
    .line 654
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 655
    .line 656
    .line 657
    move-result-object v0

    .line 658
    check-cast v0, La/l38;

    .line 659
    .line 660
    invoke-direct {v1, v0}, Lorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;-><init>(La/l38;)V

    .line 661
    .line 662
    .line 663
    return-object v1

    .line 664
    :pswitch_18
    move-object v0, v1

    .line 665
    move v11, v2

    .line 666
    move v10, v3

    .line 667
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 668
    .line 669
    .line 670
    new-instance v1, Lorg/xplatform/security/api/presentation/models/BindEmailScreenParams;

    .line 671
    .line 672
    const-class v2, Lorg/xplatform/security/api/presentation/models/BindEmailScreenParams;

    .line 673
    .line 674
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 675
    .line 676
    .line 677
    move-result-object v2

    .line 678
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 679
    .line 680
    .line 681
    move-result-object v2

    .line 682
    check-cast v2, Lorg/xplatform/security/api/navigation/EndFlowNavigation;

    .line 683
    .line 684
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 685
    .line 686
    .line 687
    move-result v3

    .line 688
    if-eqz v3, :cond_c

    .line 689
    .line 690
    goto :goto_8

    .line 691
    :cond_c
    move v10, v11

    .line 692
    :goto_8
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 693
    .line 694
    .line 695
    move-result v0

    .line 696
    invoke-direct {v1, v2, v10, v0}, Lorg/xplatform/security/api/presentation/models/BindEmailScreenParams;-><init>(Lorg/xplatform/security/api/navigation/EndFlowNavigation;ZI)V

    .line 697
    .line 698
    .line 699
    return-object v1

    .line 700
    :pswitch_19
    move-object v0, v1

    .line 701
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 702
    .line 703
    .line 704
    new-instance v11, Lorg/xplatform/bet_history/history/presentation/dialog/bet_summary/BetsSummaryInfoUiModel;

    .line 705
    .line 706
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    move-result-object v12

    .line 710
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 711
    .line 712
    .line 713
    move-result-object v13

    .line 714
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 715
    .line 716
    .line 717
    move-result-object v14

    .line 718
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 719
    .line 720
    .line 721
    move-result-object v15

    .line 722
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v16

    .line 726
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 727
    .line 728
    .line 729
    move-result-object v17

    .line 730
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 731
    .line 732
    .line 733
    move-result-object v18

    .line 734
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 735
    .line 736
    .line 737
    move-result-object v19

    .line 738
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 739
    .line 740
    .line 741
    move-result-object v20

    .line 742
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 743
    .line 744
    .line 745
    move-result-object v21

    .line 746
    invoke-direct/range {v11 .. v21}, Lorg/xplatform/bet_history/history/presentation/dialog/bet_summary/BetsSummaryInfoUiModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 747
    .line 748
    .line 749
    return-object v11

    .line 750
    :pswitch_1a
    move-object v0, v1

    .line 751
    move v11, v2

    .line 752
    move v10, v3

    .line 753
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 754
    .line 755
    .line 756
    new-instance v0, Lorg/xplatform/sportgame/bets_on_players/api/navigation/BetsOnPlayersScreenParams;

    .line 757
    .line 758
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readLong()J

    .line 759
    .line 760
    .line 761
    move-result-wide v1

    .line 762
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 763
    .line 764
    .line 765
    move-result v4

    .line 766
    if-eqz v4, :cond_d

    .line 767
    .line 768
    move v3, v10

    .line 769
    :goto_9
    move-object/from16 v4, p1

    .line 770
    .line 771
    goto :goto_a

    .line 772
    :cond_d
    move v3, v11

    .line 773
    goto :goto_9

    .line 774
    :goto_a
    invoke-virtual {v4}, Landroid/os/Parcel;->readLong()J

    .line 775
    .line 776
    .line 777
    move-result-wide v4

    .line 778
    invoke-direct/range {v0 .. v5}, Lorg/xplatform/sportgame/bets_on_players/api/navigation/BetsOnPlayersScreenParams;-><init>(JZJ)V

    .line 779
    .line 780
    .line 781
    return-object v0

    .line 782
    :pswitch_1b
    move-object v4, v1

    .line 783
    move v11, v2

    .line 784
    move v10, v3

    .line 785
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 786
    .line 787
    .line 788
    new-instance v1, Lorg/xplatform/betting/core/zip/model/zip/BetZip;

    .line 789
    .line 790
    invoke-virtual {v4}, Landroid/os/Parcel;->readLong()J

    .line 791
    .line 792
    .line 793
    move-result-wide v2

    .line 794
    invoke-virtual {v4}, Landroid/os/Parcel;->readDouble()D

    .line 795
    .line 796
    .line 797
    move-result-wide v5

    .line 798
    move-wide v8, v5

    .line 799
    invoke-virtual {v4}, Landroid/os/Parcel;->readLong()J

    .line 800
    .line 801
    .line 802
    move-result-wide v6

    .line 803
    move-wide v12, v8

    .line 804
    invoke-virtual {v4}, Landroid/os/Parcel;->readDouble()D

    .line 805
    .line 806
    .line 807
    move-result-wide v8

    .line 808
    move v5, v10

    .line 809
    invoke-virtual {v4}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 810
    .line 811
    .line 812
    move-result-object v10

    .line 813
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    .line 814
    .line 815
    .line 816
    move-result v0

    .line 817
    if-eqz v0, :cond_e

    .line 818
    .line 819
    move v0, v11

    .line 820
    move v11, v5

    .line 821
    :goto_b
    move-wide v13, v12

    .line 822
    goto :goto_c

    .line 823
    :cond_e
    move v0, v11

    .line 824
    goto :goto_b

    .line 825
    :goto_c
    invoke-virtual {v4}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 826
    .line 827
    .line 828
    move-result-object v12

    .line 829
    move-wide v14, v13

    .line 830
    invoke-virtual {v4}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 831
    .line 832
    .line 833
    move-result-object v13

    .line 834
    sget-object v0, Lorg/xplatform/betting/core/zip/model/zip/BetPlayerZip;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 835
    .line 836
    invoke-interface {v0, v4}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 837
    .line 838
    .line 839
    move-result-object v0

    .line 840
    check-cast v0, Lorg/xplatform/betting/core/zip/model/zip/BetPlayerZip;

    .line 841
    .line 842
    move-wide/from16 v16, v14

    .line 843
    .line 844
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    .line 845
    .line 846
    .line 847
    move-result v15

    .line 848
    move-wide/from16 v18, v16

    .line 849
    .line 850
    invoke-virtual {v4}, Landroid/os/Parcel;->readLong()J

    .line 851
    .line 852
    .line 853
    move-result-wide v16

    .line 854
    invoke-virtual {v4}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 855
    .line 856
    .line 857
    move-result-object v14

    .line 858
    invoke-static {v14}, La/uoy;->valueOf(Ljava/lang/String;)La/uoy;

    .line 859
    .line 860
    .line 861
    move-result-object v14

    .line 862
    move-wide/from16 v21, v18

    .line 863
    .line 864
    invoke-virtual {v4}, Landroid/os/Parcel;->readLong()J

    .line 865
    .line 866
    .line 867
    move-result-wide v19

    .line 868
    move-wide/from16 v22, v21

    .line 869
    .line 870
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    .line 871
    .line 872
    .line 873
    move-result v21

    .line 874
    move-wide/from16 v24, v22

    .line 875
    .line 876
    invoke-virtual {v4}, Landroid/os/Parcel;->readLong()J

    .line 877
    .line 878
    .line 879
    move-result-wide v22

    .line 880
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    .line 881
    .line 882
    .line 883
    move-result v18

    .line 884
    move-wide/from16 v25, v24

    .line 885
    .line 886
    if-eqz v18, :cond_f

    .line 887
    .line 888
    move/from16 v24, v5

    .line 889
    .line 890
    goto :goto_d

    .line 891
    :cond_f
    const/16 v24, 0x0

    .line 892
    .line 893
    :goto_d
    invoke-virtual {v4}, Landroid/os/Parcel;->readLong()J

    .line 894
    .line 895
    .line 896
    move-result-wide v27

    .line 897
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    .line 898
    .line 899
    .line 900
    move-result v18

    .line 901
    move-wide/from16 v44, v27

    .line 902
    .line 903
    if-eqz v18, :cond_10

    .line 904
    .line 905
    move/from16 v27, v5

    .line 906
    .line 907
    :goto_e
    move-wide/from16 v28, v25

    .line 908
    .line 909
    move-wide/from16 v25, v44

    .line 910
    .line 911
    goto :goto_f

    .line 912
    :cond_10
    const/16 v27, 0x0

    .line 913
    .line 914
    goto :goto_e

    .line 915
    :goto_f
    sget-object v5, Lorg/xplatform/betting/core/zip/model/zip/PlayersDuelZip;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 916
    .line 917
    invoke-interface {v5, v4}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 918
    .line 919
    .line 920
    move-result-object v5

    .line 921
    check-cast v5, Lorg/xplatform/betting/core/zip/model/zip/PlayersDuelZip;

    .line 922
    .line 923
    move-wide/from16 v30, v28

    .line 924
    .line 925
    invoke-virtual {v4}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 926
    .line 927
    .line 928
    move-result-object v29

    .line 929
    move-wide/from16 v31, v30

    .line 930
    .line 931
    invoke-virtual {v4}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 932
    .line 933
    .line 934
    move-result-object v30

    .line 935
    invoke-virtual {v4}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 936
    .line 937
    .line 938
    move-result-object v28

    .line 939
    invoke-static/range {v28 .. v28}, La/izc;->valueOf(Ljava/lang/String;)La/izc;

    .line 940
    .line 941
    .line 942
    move-result-object v28

    .line 943
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    .line 944
    .line 945
    .line 946
    move-result v33

    .line 947
    if-eqz v33, :cond_11

    .line 948
    .line 949
    move-wide/from16 v33, v31

    .line 950
    .line 951
    const/16 v32, 0x1

    .line 952
    .line 953
    goto :goto_10

    .line 954
    :cond_11
    move-wide/from16 v33, v31

    .line 955
    .line 956
    const/16 v32, 0x0

    .line 957
    .line 958
    :goto_10
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    .line 959
    .line 960
    .line 961
    move-result v31

    .line 962
    move-wide/from16 v34, v33

    .line 963
    .line 964
    if-eqz v31, :cond_12

    .line 965
    .line 966
    const/16 v33, 0x1

    .line 967
    .line 968
    goto :goto_11

    .line 969
    :cond_12
    const/16 v33, 0x0

    .line 970
    .line 971
    :goto_11
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    .line 972
    .line 973
    .line 974
    move-result v31

    .line 975
    move-wide/from16 v35, v34

    .line 976
    .line 977
    if-eqz v31, :cond_13

    .line 978
    .line 979
    const/16 v34, 0x1

    .line 980
    .line 981
    goto :goto_12

    .line 982
    :cond_13
    const/16 v34, 0x0

    .line 983
    .line 984
    :goto_12
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    .line 985
    .line 986
    .line 987
    move-result v31

    .line 988
    move-wide/from16 v36, v35

    .line 989
    .line 990
    if-eqz v31, :cond_14

    .line 991
    .line 992
    const/16 v35, 0x1

    .line 993
    .line 994
    goto :goto_13

    .line 995
    :cond_14
    const/16 v35, 0x0

    .line 996
    .line 997
    :goto_13
    invoke-virtual {v4}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 998
    .line 999
    .line 1000
    move-result-object v31

    .line 1001
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    .line 1002
    .line 1003
    .line 1004
    move-result v38

    .line 1005
    if-eqz v38, :cond_15

    .line 1006
    .line 1007
    move-wide/from16 v38, v36

    .line 1008
    .line 1009
    const/16 v37, 0x1

    .line 1010
    .line 1011
    goto :goto_14

    .line 1012
    :cond_15
    move-wide/from16 v38, v36

    .line 1013
    .line 1014
    const/16 v37, 0x0

    .line 1015
    .line 1016
    :goto_14
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    .line 1017
    .line 1018
    .line 1019
    move-result v36

    .line 1020
    move-wide/from16 v39, v38

    .line 1021
    .line 1022
    if-eqz v36, :cond_16

    .line 1023
    .line 1024
    const/16 v38, 0x1

    .line 1025
    .line 1026
    goto :goto_15

    .line 1027
    :cond_16
    const/16 v38, 0x0

    .line 1028
    .line 1029
    :goto_15
    invoke-virtual {v4}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v36

    .line 1033
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    .line 1034
    .line 1035
    .line 1036
    move-result v41

    .line 1037
    if-eqz v41, :cond_17

    .line 1038
    .line 1039
    move-wide/from16 v41, v39

    .line 1040
    .line 1041
    const/16 v40, 0x1

    .line 1042
    .line 1043
    goto :goto_16

    .line 1044
    :cond_17
    move-wide/from16 v41, v39

    .line 1045
    .line 1046
    const/16 v40, 0x0

    .line 1047
    .line 1048
    :goto_16
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    .line 1049
    .line 1050
    .line 1051
    move-result v39

    .line 1052
    move-wide/from16 v42, v41

    .line 1053
    .line 1054
    if-eqz v39, :cond_18

    .line 1055
    .line 1056
    const/16 v41, 0x1

    .line 1057
    .line 1058
    goto :goto_17

    .line 1059
    :cond_18
    const/16 v41, 0x0

    .line 1060
    .line 1061
    :goto_17
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    .line 1062
    .line 1063
    .line 1064
    move-result v39

    .line 1065
    if-eqz v39, :cond_19

    .line 1066
    .line 1067
    const/16 v18, 0x1

    .line 1068
    .line 1069
    :goto_18
    move-object/from16 p0, v0

    .line 1070
    .line 1071
    goto :goto_19

    .line 1072
    :cond_19
    const/16 v18, 0x0

    .line 1073
    .line 1074
    goto :goto_18

    .line 1075
    :goto_19
    sget-object v0, Lorg/xplatform/betting/core/zip/model/zip/EventParams;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1076
    .line 1077
    invoke-interface {v0, v4}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v0

    .line 1081
    check-cast v0, Lorg/xplatform/betting/core/zip/model/zip/EventParams;

    .line 1082
    .line 1083
    move-object/from16 v39, v36

    .line 1084
    .line 1085
    move-object/from16 v36, v31

    .line 1086
    .line 1087
    move-object/from16 v31, v28

    .line 1088
    .line 1089
    move-object/from16 v28, v5

    .line 1090
    .line 1091
    move-wide/from16 v4, v42

    .line 1092
    .line 1093
    move-object/from16 v43, v0

    .line 1094
    .line 1095
    move/from16 v42, v18

    .line 1096
    .line 1097
    move-object/from16 v18, v14

    .line 1098
    .line 1099
    move-object/from16 v14, p0

    .line 1100
    .line 1101
    invoke-direct/range {v1 .. v43}, Lorg/xplatform/betting/core/zip/model/zip/BetZip;-><init>(JDJDLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lorg/xplatform/betting/core/zip/model/zip/BetPlayerZip;IJLa/uoy;JIJZJZLorg/xplatform/betting/core/zip/model/zip/PlayersDuelZip;Ljava/lang/String;Ljava/lang/String;La/izc;ZZZZLjava/lang/String;ZZLjava/lang/String;ZZZLorg/xplatform/betting/core/zip/model/zip/EventParams;)V

    .line 1102
    .line 1103
    .line 1104
    return-object v1

    .line 1105
    :pswitch_1c
    move-object v4, v1

    .line 1106
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1107
    .line 1108
    .line 1109
    invoke-virtual {v4}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v0

    .line 1113
    invoke-static {v0}, Lorg/xplatform/betting/core/zip/model/zip/bet/BetViewType;->valueOf(Ljava/lang/String;)Lorg/xplatform/betting/core/zip/model/zip/bet/BetViewType;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v0

    .line 1117
    return-object v0

    .line 1118
    nop

    .line 1119
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
    iget-byte p0, p0, La/qo7;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Lorg/xplatform/statistic/tennis/impl/summary/presentation/chose_filter/ChoseFilterUiModel;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Lorg/xplatform/statistic/tennis/impl/summary/presentation/chose_filter/ChoseFilterScreenParams;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    new-array p0, p1, [Lorg/xplatform/sportgame/bets_on_players/impl/presentation/model/ChooseSubGameParams;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    new-array p0, p1, [Lorg/xplatform/betting/core/zip/model/zip/bet/ChildBets;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    new-array p0, p1, [Lorg/xplatform/security/impl/navigation/ChangePhoneNumberScreen;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_6
    new-array p0, p1, [Lorg/xplatform/results/impl/presentation/alt_champs/ChampsResultsParams;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_7
    new-array p0, p1, [Lorg/xplatform/statistic/champ_statistic/presentation/models/ChampSubMenuItem;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_8
    new-array p0, p1, [Lorg/xplatform/sportgame/markets/categories/api/navigation/CategoryMarketsParams;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_9
    new-array p0, p1, [Lorg/xplatform/favorites/impl/presentation/screen/category_image_header/models/CategoryImageHeaderTab;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_a
    new-array p0, p1, [Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_b
    new-array p0, p1, [Lorg/xplatform/cyber/section/impl/championships/universal/domain/model/calendar_tournament/CalendarTournamentMatchStatusModel;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_c
    new-array p0, p1, [Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_d
    new-array p0, p1, [Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingZoneEvent$Fullscreen;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_e
    new-array p0, p1, [Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingVideoLandscapeParams;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_f
    new-array p0, p1, [Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingVideoEvent$Fullscreen;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_10
    new-array p0, p1, [Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_11
    new-array p0, p1, [Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_12
    new-array p0, p1, [Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/BonusStateModel;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_13
    new-array p0, p1, [Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_14
    new-array p0, p1, [Lorg/xplatform/registration/bonus/api/BonusSelectionScreenParams;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_15
    new-array p0, p1, [Lorg/xplatform/registration/api/domain/models/BonusInfoModel;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_16
    new-array p0, p1, [Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/params/BonusAccountScreenParams;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_17
    new-array p0, p1, [Lorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_18
    new-array p0, p1, [Lorg/xplatform/security/api/presentation/models/BindEmailScreenParams;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_19
    new-array p0, p1, [Lorg/xplatform/bet_history/history/presentation/dialog/bet_summary/BetsSummaryInfoUiModel;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_1a
    new-array p0, p1, [Lorg/xplatform/sportgame/bets_on_players/api/navigation/BetsOnPlayersScreenParams;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_1b
    new-array p0, p1, [Lorg/xplatform/betting/core/zip/model/zip/BetZip;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_1c
    new-array p0, p1, [Lorg/xplatform/betting/core/zip/model/zip/bet/BetViewType;

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
