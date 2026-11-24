.class public final La/l7n0;
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
    iput-byte p1, p0, La/l7n0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v0, v0, La/l7n0;->a:B

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
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 17
    .line 18
    .line 19
    sget-object v0, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Aggregator$Tournaments;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Aggregator$Tournaments;

    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 26
    .line 27
    .line 28
    sget-object v0, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Aggregator$Recommended;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Aggregator$Recommended;

    .line 29
    .line 30
    return-object v0

    .line 31
    :pswitch_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 35
    .line 36
    .line 37
    sget-object v0, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Aggregator$PromoGames;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Aggregator$PromoGames;

    .line 38
    .line 39
    return-object v0

    .line 40
    :pswitch_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 44
    .line 45
    .line 46
    sget-object v0, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Aggregator$MonthProvider;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Aggregator$MonthProvider;

    .line 47
    .line 48
    return-object v0

    .line 49
    :pswitch_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 53
    .line 54
    .line 55
    sget-object v0, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Aggregator$Categories;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Aggregator$Categories;

    .line 56
    .line 57
    return-object v0

    .line 58
    :pswitch_4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    new-instance v0, Lorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;

    .line 62
    .line 63
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_0

    .line 68
    .line 69
    move v3, v4

    .line 70
    :cond_0
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-direct {v0, v1, v3}, Lorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;-><init>(Ljava/lang/String;Z)V

    .line 75
    .line 76
    .line 77
    return-object v0

    .line 78
    :pswitch_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_1

    .line 86
    .line 87
    move v14, v4

    .line 88
    goto :goto_0

    .line 89
    :cond_1
    move v14, v3

    .line 90
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    new-instance v13, Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-direct {v13, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 97
    .line 98
    .line 99
    :goto_1
    if-eq v3, v0, :cond_2

    .line 100
    .line 101
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 102
    .line 103
    .line 104
    move-result-wide v4

    .line 105
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    add-int/lit8 v3, v3, 0x1

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_2
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 116
    .line 117
    .line 118
    move-result-wide v6

    .line 119
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 120
    .line 121
    .line 122
    move-result-wide v8

    .line 123
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 124
    .line 125
    .line 126
    move-result-wide v10

    .line 127
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v12

    .line 131
    new-instance v5, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;

    .line 132
    .line 133
    invoke-direct/range {v5 .. v14}, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;-><init>(JJJLjava/lang/String;Ljava/util/List;Z)V

    .line 134
    .line 135
    .line 136
    return-object v5

    .line 137
    :pswitch_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    new-instance v0, Lorg/xplatform/security/api/presentation/models/TokenRestoreData;

    .line 141
    .line 142
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-static {v1}, La/tzf0;->valueOf(Ljava/lang/String;)La/tzf0;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-direct {v0, v2, v3, v1}, Lorg/xplatform/security/api/presentation/models/TokenRestoreData;-><init>(Ljava/lang/String;Ljava/lang/String;La/tzf0;)V

    .line 159
    .line 160
    .line 161
    return-object v0

    .line 162
    :pswitch_7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    new-instance v0, Lorg/xplatform/uikit/components/successbetalert/model/TmpBetDoneUiModel;

    .line 166
    .line 167
    sget-object v2, Lorg/xplatform/uikit/components/successbetalert/model/BetDoneScreenStyleEnum;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 168
    .line 169
    invoke-interface {v2, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    check-cast v2, Lorg/xplatform/uikit/components/successbetalert/model/BetDoneScreenStyleEnum;

    .line 174
    .line 175
    sget-object v3, Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 176
    .line 177
    invoke-interface {v3, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    check-cast v1, Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;

    .line 182
    .line 183
    invoke-direct {v0, v2, v1}, Lorg/xplatform/uikit/components/successbetalert/model/TmpBetDoneUiModel;-><init>(Lorg/xplatform/uikit/components/successbetalert/model/BetDoneScreenStyleEnum;Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;)V

    .line 184
    .line 185
    .line 186
    return-object v0

    .line 187
    :pswitch_8
    new-instance v0, Lcom/google/firebase/perf/util/Timer;

    .line 188
    .line 189
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 190
    .line 191
    .line 192
    move-result-wide v2

    .line 193
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 194
    .line 195
    .line 196
    move-result-wide v4

    .line 197
    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/firebase/perf/util/Timer;-><init>(JJ)V

    .line 198
    .line 199
    .line 200
    return-object v0

    .line 201
    :pswitch_9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-static {v0}, Lorg/xplatform/bet_history/history/domain/model/bet_history/TimeTypeModel;->valueOf(Ljava/lang/String;)Lorg/xplatform/bet_history/history/domain/model/bet_history/TimeTypeModel;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    return-object v0

    .line 213
    :pswitch_a
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    new-instance v0, Lorg/xplatform/uikit/compose/components/picker/model/TimeOfDay23;

    .line 217
    .line 218
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    invoke-direct {v0, v2, v1}, Lorg/xplatform/uikit/compose/components/picker/model/TimeOfDay23;-><init>(II)V

    .line 227
    .line 228
    .line 229
    return-object v0

    .line 230
    :pswitch_b
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-static {v0}, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;->valueOf(Ljava/lang/String;)Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    return-object v0

    .line 242
    :pswitch_c
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    new-instance v0, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;

    .line 246
    .line 247
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    sget-object v3, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 252
    .line 253
    invoke-interface {v3, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    check-cast v1, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;

    .line 258
    .line 259
    invoke-direct {v0, v2, v1}, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;-><init>(Ljava/lang/String;Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;)V

    .line 260
    .line 261
    .line 262
    return-object v0

    .line 263
    :pswitch_d
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    new-instance v0, Lorg/xplatform/mailing/api/presentation/models/TelegramBonusCodeParams;

    .line 267
    .line 268
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    invoke-direct {v0, v2, v1}, Lorg/xplatform/mailing/api/presentation/models/TelegramBonusCodeParams;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    return-object v0

    .line 280
    :pswitch_e
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    new-instance v3, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsResultsParams;

    .line 284
    .line 285
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 286
    .line 287
    .line 288
    move-result-wide v4

    .line 289
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 290
    .line 291
    .line 292
    move-result-wide v6

    .line 293
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 294
    .line 295
    .line 296
    move-result v0

    .line 297
    if-nez v0, :cond_3

    .line 298
    .line 299
    :goto_2
    move-object v8, v2

    .line 300
    goto :goto_3

    .line 301
    :cond_3
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    goto :goto_2

    .line 310
    :goto_3
    invoke-direct/range {v3 .. v8}, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsResultsParams;-><init>(JJLjava/lang/Integer;)V

    .line 311
    .line 312
    .line 313
    return-object v3

    .line 314
    :pswitch_f
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    new-instance v4, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;

    .line 318
    .line 319
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 320
    .line 321
    .line 322
    move-result-wide v5

    .line 323
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 324
    .line 325
    .line 326
    move-result-wide v7

    .line 327
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v9

    .line 331
    invoke-direct/range {v4 .. v9}, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;-><init>(JJLjava/lang/String;)V

    .line 332
    .line 333
    .line 334
    return-object v4

    .line 335
    :pswitch_10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    new-instance v0, Lorg/xplatform/cyber/section/impl/team_details/presentation/main/dialog/model/TeamDetailsDisciplineLineupModel;

    .line 339
    .line 340
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 341
    .line 342
    .line 343
    move-result-wide v2

    .line 344
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v4

    .line 348
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    invoke-direct {v0, v2, v3, v4, v1}, Lorg/xplatform/cyber/section/impl/team_details/presentation/main/dialog/model/TeamDetailsDisciplineLineupModel;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    return-object v0

    .line 356
    :pswitch_11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 360
    .line 361
    .line 362
    move-result-wide v4

    .line 363
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    new-instance v2, Ljava/util/ArrayList;

    .line 368
    .line 369
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 370
    .line 371
    .line 372
    :goto_4
    if-eq v3, v0, :cond_4

    .line 373
    .line 374
    sget-object v6, Lorg/xplatform/cyber/section/impl/team_details/presentation/main/dialog/model/TeamDetailsDisciplineLineupModel;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 375
    .line 376
    invoke-interface {v6, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v6

    .line 380
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    add-int/lit8 v3, v3, 0x1

    .line 384
    .line 385
    goto :goto_4

    .line 386
    :cond_4
    new-instance v0, Lorg/xplatform/cyber/section/impl/team_details/presentation/main/dialog/model/TeamDetailsDisciplineDialogParams;

    .line 387
    .line 388
    invoke-direct {v0, v4, v5, v2}, Lorg/xplatform/cyber/section/impl/team_details/presentation/main/dialog/model/TeamDetailsDisciplineDialogParams;-><init>(JLjava/util/List;)V

    .line 389
    .line 390
    .line 391
    return-object v0

    .line 392
    :pswitch_12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    new-instance v0, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsAchievementParams;

    .line 396
    .line 397
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 398
    .line 399
    .line 400
    move-result-wide v2

    .line 401
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    invoke-direct {v0, v2, v3, v1}, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsAchievementParams;-><init>(JLjava/lang/String;)V

    .line 406
    .line 407
    .line 408
    return-object v0

    .line 409
    :pswitch_13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    new-instance v4, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;

    .line 413
    .line 414
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 415
    .line 416
    .line 417
    move-result-wide v5

    .line 418
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v11

    .line 422
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 423
    .line 424
    .line 425
    move-result-wide v7

    .line 426
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 427
    .line 428
    .line 429
    move-result-wide v9

    .line 430
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v12

    .line 434
    invoke-direct/range {v4 .. v12}, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;-><init>(JJJLjava/lang/String;Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    return-object v4

    .line 438
    :pswitch_14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    new-instance v5, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;

    .line 442
    .line 443
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 444
    .line 445
    .line 446
    move-result-wide v6

    .line 447
    sget-object v0, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 448
    .line 449
    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    move-object v8, v0

    .line 454
    check-cast v8, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;

    .line 455
    .line 456
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 457
    .line 458
    .line 459
    move-result v0

    .line 460
    if-eqz v0, :cond_5

    .line 461
    .line 462
    move v9, v4

    .line 463
    goto :goto_5

    .line 464
    :cond_5
    move v9, v3

    .line 465
    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    .line 466
    .line 467
    .line 468
    move-result-wide v10

    .line 469
    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    .line 470
    .line 471
    .line 472
    move-result-wide v12

    .line 473
    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    .line 474
    .line 475
    .line 476
    move-result-wide v14

    .line 477
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v16

    .line 481
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 482
    .line 483
    .line 484
    move-result v0

    .line 485
    if-eqz v0, :cond_6

    .line 486
    .line 487
    move/from16 v17, v4

    .line 488
    .line 489
    goto :goto_6

    .line 490
    :cond_6
    move/from16 v17, v3

    .line 491
    .line 492
    :goto_6
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 493
    .line 494
    .line 495
    move-result v0

    .line 496
    if-eqz v0, :cond_7

    .line 497
    .line 498
    move/from16 v18, v4

    .line 499
    .line 500
    goto :goto_7

    .line 501
    :cond_7
    move/from16 v18, v3

    .line 502
    .line 503
    :goto_7
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 504
    .line 505
    .line 506
    move-result v0

    .line 507
    if-eqz v0, :cond_8

    .line 508
    .line 509
    move/from16 v19, v4

    .line 510
    .line 511
    goto :goto_8

    .line 512
    :cond_8
    move/from16 v19, v3

    .line 513
    .line 514
    :goto_8
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 515
    .line 516
    .line 517
    move-result v0

    .line 518
    if-eqz v0, :cond_9

    .line 519
    .line 520
    move/from16 v20, v4

    .line 521
    .line 522
    goto :goto_9

    .line 523
    :cond_9
    move/from16 v20, v3

    .line 524
    .line 525
    :goto_9
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 526
    .line 527
    .line 528
    move-result v0

    .line 529
    if-eqz v0, :cond_a

    .line 530
    .line 531
    move/from16 v21, v4

    .line 532
    .line 533
    goto :goto_a

    .line 534
    :cond_a
    move/from16 v21, v3

    .line 535
    .line 536
    :goto_a
    sget-object v0, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    .line 537
    .line 538
    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    move-object/from16 v22, v0

    .line 543
    .line 544
    check-cast v22, Ljava/lang/CharSequence;

    .line 545
    .line 546
    invoke-direct/range {v5 .. v22}, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;-><init>(JLorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;ZDDDLjava/lang/String;ZZZZZLjava/lang/CharSequence;)V

    .line 547
    .line 548
    .line 549
    return-object v5

    .line 550
    :pswitch_15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 551
    .line 552
    .line 553
    new-instance v0, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;

    .line 554
    .line 555
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    move-result-object v1

    .line 559
    invoke-direct {v0, v1}, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;-><init>(Ljava/lang/String;)V

    .line 560
    .line 561
    .line 562
    return-object v0

    .line 563
    :pswitch_16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 564
    .line 565
    .line 566
    new-instance v0, Lorg/xplatform/swipex/impl/presentation/dialogs/confirmation/models/SwipeActionConfirmationParams;

    .line 567
    .line 568
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object v2

    .line 572
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v1

    .line 576
    invoke-direct {v0, v2, v1}, Lorg/xplatform/swipex/impl/presentation/dialogs/confirmation/models/SwipeActionConfirmationParams;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 577
    .line 578
    .line 579
    return-object v0

    .line 580
    :pswitch_17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 581
    .line 582
    .line 583
    new-instance v0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;

    .line 584
    .line 585
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v2

    .line 589
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 590
    .line 591
    .line 592
    move-result-object v3

    .line 593
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 594
    .line 595
    .line 596
    move-result-object v4

    .line 597
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object v1

    .line 601
    invoke-direct {v0, v2, v3, v4, v1}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 602
    .line 603
    .line 604
    return-object v0

    .line 605
    :pswitch_18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 606
    .line 607
    .line 608
    new-instance v5, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetStringModel;

    .line 609
    .line 610
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 611
    .line 612
    .line 613
    move-result-object v6

    .line 614
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v7

    .line 618
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object v8

    .line 622
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    move-result-object v9

    .line 626
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v10

    .line 630
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object v11

    .line 634
    invoke-direct/range {v5 .. v11}, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetStringModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 635
    .line 636
    .line 637
    return-object v5

    .line 638
    :pswitch_19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 639
    .line 640
    .line 641
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 642
    .line 643
    .line 644
    move-result-object v7

    .line 645
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    move-result-object v8

    .line 649
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v9

    .line 653
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 654
    .line 655
    .line 656
    move-result v0

    .line 657
    if-nez v0, :cond_b

    .line 658
    .line 659
    :goto_b
    move-object v10, v2

    .line 660
    goto :goto_c

    .line 661
    :cond_b
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 662
    .line 663
    .line 664
    move-result-wide v4

    .line 665
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 666
    .line 667
    .line 668
    move-result-object v2

    .line 669
    goto :goto_b

    .line 670
    :goto_c
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 671
    .line 672
    .line 673
    move-result-object v11

    .line 674
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 675
    .line 676
    .line 677
    move-result v0

    .line 678
    new-instance v12, Ljava/util/ArrayList;

    .line 679
    .line 680
    invoke-direct {v12, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 681
    .line 682
    .line 683
    :goto_d
    if-eq v3, v0, :cond_c

    .line 684
    .line 685
    const-class v2, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;

    .line 686
    .line 687
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 688
    .line 689
    .line 690
    move-result-object v2

    .line 691
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 692
    .line 693
    .line 694
    move-result-object v2

    .line 695
    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 696
    .line 697
    .line 698
    add-int/lit8 v3, v3, 0x1

    .line 699
    .line 700
    goto :goto_d

    .line 701
    :cond_c
    new-instance v6, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;

    .line 702
    .line 703
    invoke-direct/range {v6 .. v12}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;)V

    .line 704
    .line 705
    .line 706
    return-object v6

    .line 707
    :pswitch_1a
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 708
    .line 709
    .line 710
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 711
    .line 712
    .line 713
    move-result-object v8

    .line 714
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 715
    .line 716
    .line 717
    move-result-object v9

    .line 718
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 719
    .line 720
    .line 721
    move-result-object v10

    .line 722
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 723
    .line 724
    .line 725
    move-result v0

    .line 726
    if-nez v0, :cond_d

    .line 727
    .line 728
    move-object v11, v2

    .line 729
    goto :goto_e

    .line 730
    :cond_d
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 731
    .line 732
    .line 733
    move-result-wide v4

    .line 734
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 735
    .line 736
    .line 737
    move-result-object v0

    .line 738
    move-object v11, v0

    .line 739
    :goto_e
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 740
    .line 741
    .line 742
    move-result-object v12

    .line 743
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 744
    .line 745
    .line 746
    move-result v0

    .line 747
    new-instance v13, Ljava/util/ArrayList;

    .line 748
    .line 749
    invoke-direct {v13, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 750
    .line 751
    .line 752
    :goto_f
    if-eq v3, v0, :cond_e

    .line 753
    .line 754
    const-class v4, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;

    .line 755
    .line 756
    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 757
    .line 758
    .line 759
    move-result-object v4

    .line 760
    invoke-virtual {v1, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 761
    .line 762
    .line 763
    move-result-object v4

    .line 764
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 765
    .line 766
    .line 767
    add-int/lit8 v3, v3, 0x1

    .line 768
    .line 769
    goto :goto_f

    .line 770
    :cond_e
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 771
    .line 772
    .line 773
    move-result v0

    .line 774
    if-nez v0, :cond_f

    .line 775
    .line 776
    :goto_10
    move-object v14, v2

    .line 777
    goto :goto_11

    .line 778
    :cond_f
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 779
    .line 780
    .line 781
    move-result v0

    .line 782
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 783
    .line 784
    .line 785
    move-result-object v2

    .line 786
    goto :goto_10

    .line 787
    :goto_11
    new-instance v7, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;

    .line 788
    .line 789
    invoke-direct/range {v7 .. v14}, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)V

    .line 790
    .line 791
    .line 792
    return-object v7

    .line 793
    :pswitch_1b
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 794
    .line 795
    .line 796
    new-instance v0, Lorg/xplatform/feed/notifictation/presentation/models/SubscriptionPeriodUiModel;

    .line 797
    .line 798
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 799
    .line 800
    .line 801
    move-result-wide v2

    .line 802
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 803
    .line 804
    .line 805
    move-result-object v1

    .line 806
    invoke-direct {v0, v2, v3, v1}, Lorg/xplatform/feed/notifictation/presentation/models/SubscriptionPeriodUiModel;-><init>(JLjava/lang/String;)V

    .line 807
    .line 808
    .line 809
    return-object v0

    .line 810
    :pswitch_1c
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 811
    .line 812
    .line 813
    new-instance v0, Lorg/xplatform/feed/notifictation/presentation/models/SubscriptionEventUiModel;

    .line 814
    .line 815
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 816
    .line 817
    .line 818
    move-result-wide v2

    .line 819
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 820
    .line 821
    .line 822
    move-result-object v1

    .line 823
    invoke-direct {v0, v2, v3, v1}, Lorg/xplatform/feed/notifictation/presentation/models/SubscriptionEventUiModel;-><init>(JLjava/lang/String;)V

    .line 824
    .line 825
    .line 826
    return-object v0

    .line 827
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
    iget-byte p0, p0, La/l7n0;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Aggregator$Tournaments;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Aggregator$Recommended;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Aggregator$PromoGames;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Aggregator$MonthProvider;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    new-array p0, p1, [Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Aggregator$Categories;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    new-array p0, p1, [Lorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    new-array p0, p1, [Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_6
    new-array p0, p1, [Lorg/xplatform/security/api/presentation/models/TokenRestoreData;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_7
    new-array p0, p1, [Lorg/xplatform/uikit/components/successbetalert/model/TmpBetDoneUiModel;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_8
    new-array p0, p1, [Lcom/google/firebase/perf/util/Timer;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_9
    new-array p0, p1, [Lorg/xplatform/bet_history/history/domain/model/bet_history/TimeTypeModel;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_a
    new-array p0, p1, [Lorg/xplatform/uikit/compose/components/picker/model/TimeOfDay23;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_b
    new-array p0, p1, [Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_c
    new-array p0, p1, [Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_d
    new-array p0, p1, [Lorg/xplatform/mailing/api/presentation/models/TelegramBonusCodeParams;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_e
    new-array p0, p1, [Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsResultsParams;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_f
    new-array p0, p1, [Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_10
    new-array p0, p1, [Lorg/xplatform/cyber/section/impl/team_details/presentation/main/dialog/model/TeamDetailsDisciplineLineupModel;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_11
    new-array p0, p1, [Lorg/xplatform/cyber/section/impl/team_details/presentation/main/dialog/model/TeamDetailsDisciplineDialogParams;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_12
    new-array p0, p1, [Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsAchievementParams;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_13
    new-array p0, p1, [Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_14
    new-array p0, p1, [Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_15
    new-array p0, p1, [Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_16
    new-array p0, p1, [Lorg/xplatform/swipex/impl/presentation/dialogs/confirmation/models/SwipeActionConfirmationParams;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_17
    new-array p0, p1, [Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_18
    new-array p0, p1, [Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetStringModel;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_19
    new-array p0, p1, [Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_1a
    new-array p0, p1, [Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_1b
    new-array p0, p1, [Lorg/xplatform/feed/notifictation/presentation/models/SubscriptionPeriodUiModel;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_1c
    new-array p0, p1, [Lorg/xplatform/feed/notifictation/presentation/models/SubscriptionEventUiModel;

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
