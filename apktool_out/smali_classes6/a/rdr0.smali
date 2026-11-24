.class public final La/rdr0;
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
    iput-byte p1, p0, La/rdr0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v0, v0, La/rdr0;->a:B

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    new-instance v2, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    :goto_0
    if-eq v3, v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 27
    .line 28
    .line 29
    move-result-wide v4

    .line 30
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    add-int/lit8 v3, v3, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    new-instance v0, Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualCategoryDisciplinesParams;

    .line 41
    .line 42
    invoke-direct {v0, v2}, Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualCategoryDisciplinesParams;-><init>(Ljava/util/ArrayList;)V

    .line 43
    .line 44
    .line 45
    return-object v0

    .line 46
    :pswitch_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    new-instance v3, Lorg/xplatform/cyber/game/valorant/api/ValorantPostGameScreenParams;

    .line 50
    .line 51
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 56
    .line 57
    .line 58
    move-result-wide v7

    .line 59
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    invoke-direct/range {v3 .. v8}, Lorg/xplatform/cyber/game/valorant/api/ValorantPostGameScreenParams;-><init>(Ljava/lang/String;IIJ)V

    .line 68
    .line 69
    .line 70
    return-object v3

    .line 71
    :pswitch_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    new-instance v4, Lorg/xplatform/cyber/game/valorant/api/ValorantGameScreenParams;

    .line 75
    .line 76
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 77
    .line 78
    .line 79
    move-result-wide v6

    .line 80
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 81
    .line 82
    .line 83
    move-result-wide v8

    .line 84
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 85
    .line 86
    .line 87
    move-result-wide v10

    .line 88
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_1

    .line 93
    .line 94
    move/from16 v18, v2

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_1
    move/from16 v18, v3

    .line 98
    .line 99
    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 100
    .line 101
    .line 102
    move-result-wide v12

    .line 103
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_2

    .line 108
    .line 109
    move/from16 v19, v2

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_2
    move/from16 v19, v3

    .line 113
    .line 114
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v17

    .line 118
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 119
    .line 120
    .line 121
    move-result-wide v14

    .line 122
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-static {v0}, La/k1g;->valueOf(Ljava/lang/String;)La/k1g;

    .line 131
    .line 132
    .line 133
    move-result-object v16

    .line 134
    invoke-direct/range {v4 .. v19}, Lorg/xplatform/cyber/game/valorant/api/ValorantGameScreenParams;-><init>(IJJJJJLa/k1g;Ljava/lang/String;ZZ)V

    .line 135
    .line 136
    .line 137
    return-object v4

    .line 138
    :pswitch_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    new-instance v0, Lcom/vk/dto/common/id/UserId;

    .line 142
    .line 143
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 144
    .line 145
    .line 146
    move-result-wide v1

    .line 147
    invoke-direct {v0, v1, v2}, Lcom/vk/dto/common/id/UserId;-><init>(J)V

    .line 148
    .line 149
    .line 150
    return-object v0

    .line 151
    :pswitch_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    new-instance v0, Lorg/xplatform/aggregator/api/model/tournaments/UserActionButtonModel;

    .line 155
    .line 156
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-static {v1}, La/gqt0;->valueOf(Ljava/lang/String;)La/gqt0;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-direct {v0, v2, v1}, Lorg/xplatform/aggregator/api/model/tournaments/UserActionButtonModel;-><init>(Ljava/lang/String;La/gqt0;)V

    .line 169
    .line 170
    .line 171
    return-object v0

    .line 172
    :pswitch_4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    new-instance v3, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampResultsParams;

    .line 176
    .line 177
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 178
    .line 179
    .line 180
    move-result-wide v4

    .line 181
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v10

    .line 185
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 186
    .line 187
    .line 188
    move-result-wide v6

    .line 189
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 190
    .line 191
    .line 192
    move-result-wide v8

    .line 193
    invoke-direct/range {v3 .. v10}, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampResultsParams;-><init>(JJJLjava/lang/String;)V

    .line 194
    .line 195
    .line 196
    return-object v3

    .line 197
    :pswitch_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    new-instance v4, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampPrizePoolParams;

    .line 201
    .line 202
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 203
    .line 204
    .line 205
    move-result-wide v5

    .line 206
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v9

    .line 210
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 211
    .line 212
    .line 213
    move-result-wide v7

    .line 214
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v10

    .line 218
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v11

    .line 222
    invoke-direct/range {v4 .. v11}, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampPrizePoolParams;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    return-object v4

    .line 226
    :pswitch_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    new-instance v5, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampParams;

    .line 230
    .line 231
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 232
    .line 233
    .line 234
    move-result-wide v6

    .line 235
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v10

    .line 239
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 240
    .line 241
    .line 242
    move-result-wide v8

    .line 243
    invoke-direct/range {v5 .. v10}, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampParams;-><init>(JJLjava/lang/String;)V

    .line 244
    .line 245
    .line 246
    return-object v5

    .line 247
    :pswitch_7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    new-instance v6, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampInfoParams;

    .line 251
    .line 252
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 253
    .line 254
    .line 255
    move-result-wide v7

    .line 256
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v11

    .line 260
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 261
    .line 262
    .line 263
    move-result-wide v9

    .line 264
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v12

    .line 268
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v13

    .line 272
    invoke-direct/range {v6 .. v13}, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampInfoParams;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    return-object v6

    .line 276
    :pswitch_8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    new-instance v0, Lorg/xplatform/ufc/api/weight_class_rating/UfcWeightClassRatingParams;

    .line 280
    .line 281
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    invoke-static {v2}, La/kgz;->valueOf(Ljava/lang/String;)La/kgz;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    invoke-static {v1}, La/f7v0;->valueOf(Ljava/lang/String;)La/f7v0;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    invoke-direct {v0, v2, v1}, Lorg/xplatform/ufc/api/weight_class_rating/UfcWeightClassRatingParams;-><init>(La/kgz;La/f7v0;)V

    .line 298
    .line 299
    .line 300
    return-object v0

    .line 301
    :pswitch_9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    new-instance v3, Lorg/xplatform/ufc/api/game/UfcPostGameParams;

    .line 305
    .line 306
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v8

    .line 310
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 311
    .line 312
    .line 313
    move-result-wide v4

    .line 314
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 315
    .line 316
    .line 317
    move-result-wide v6

    .line 318
    invoke-direct/range {v3 .. v8}, Lorg/xplatform/ufc/api/game/UfcPostGameParams;-><init>(JJLjava/lang/String;)V

    .line 319
    .line 320
    .line 321
    return-object v3

    .line 322
    :pswitch_a
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    new-instance v4, Lorg/xplatform/ufc/api/game/UfcGameParams;

    .line 326
    .line 327
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 328
    .line 329
    .line 330
    move-result-wide v6

    .line 331
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 332
    .line 333
    .line 334
    move-result v0

    .line 335
    if-eqz v0, :cond_3

    .line 336
    .line 337
    move v15, v2

    .line 338
    goto :goto_3

    .line 339
    :cond_3
    move v15, v3

    .line 340
    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 341
    .line 342
    .line 343
    move-result-wide v8

    .line 344
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 345
    .line 346
    .line 347
    move-result-wide v10

    .line 348
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 349
    .line 350
    .line 351
    move-result-wide v12

    .line 352
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v14

    .line 356
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 357
    .line 358
    .line 359
    move-result v5

    .line 360
    invoke-direct/range {v4 .. v15}, Lorg/xplatform/ufc/api/game/UfcGameParams;-><init>(IJJJJLjava/lang/String;Z)V

    .line 361
    .line 362
    .line 363
    return-object v4

    .line 364
    :pswitch_b
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    new-instance v0, Lorg/xplatform/ufc/api/championship/UfcChampionshipParams;

    .line 368
    .line 369
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 370
    .line 371
    .line 372
    move-result-wide v2

    .line 373
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v1

    .line 377
    invoke-direct {v0, v2, v3, v1}, Lorg/xplatform/ufc/api/championship/UfcChampionshipParams;-><init>(JLjava/lang/String;)V

    .line 378
    .line 379
    .line 380
    return-object v0

    .line 381
    :pswitch_c
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    const-class v0, Lorg/xplatform/cyber/section/impl/transfers/presentation/dialogs/timefilter/model/TransfersTimeFilterBottomParams;

    .line 385
    .line 386
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 391
    .line 392
    .line 393
    move-result-object v2

    .line 394
    check-cast v2, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel;

    .line 395
    .line 396
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 397
    .line 398
    .line 399
    move-result v4

    .line 400
    new-instance v5, Ljava/util/ArrayList;

    .line 401
    .line 402
    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 403
    .line 404
    .line 405
    :goto_4
    if-eq v3, v4, :cond_4

    .line 406
    .line 407
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 408
    .line 409
    .line 410
    move-result-object v6

    .line 411
    invoke-virtual {v1, v6}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 412
    .line 413
    .line 414
    move-result-object v6

    .line 415
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    add-int/lit8 v3, v3, 0x1

    .line 419
    .line 420
    goto :goto_4

    .line 421
    :cond_4
    new-instance v0, Lorg/xplatform/cyber/section/impl/transfers/presentation/dialogs/timefilter/model/TransfersTimeFilterBottomParams;

    .line 422
    .line 423
    invoke-direct {v0, v2, v5}, Lorg/xplatform/cyber/section/impl/transfers/presentation/dialogs/timefilter/model/TransfersTimeFilterBottomParams;-><init>(Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel;Ljava/util/List;)V

    .line 424
    .line 425
    .line 426
    return-object v0

    .line 427
    :pswitch_d
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 431
    .line 432
    .line 433
    move-result-wide v4

    .line 434
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 435
    .line 436
    .line 437
    move-result v0

    .line 438
    new-instance v2, Ljava/util/ArrayList;

    .line 439
    .line 440
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 441
    .line 442
    .line 443
    :goto_5
    if-eq v3, v0, :cond_5

    .line 444
    .line 445
    sget-object v6, Lorg/xplatform/cyber/section/impl/transfers/presentation/dialogs/disciplinefilter/model/TransfersDisciplineFilter;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 446
    .line 447
    invoke-interface {v6, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v6

    .line 451
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    add-int/lit8 v3, v3, 0x1

    .line 455
    .line 456
    goto :goto_5

    .line 457
    :cond_5
    new-instance v0, Lorg/xplatform/cyber/section/impl/transfers/presentation/dialogs/disciplinefilter/model/TransfersDisciplineFilterBottomParams;

    .line 458
    .line 459
    invoke-direct {v0, v4, v5, v2}, Lorg/xplatform/cyber/section/impl/transfers/presentation/dialogs/disciplinefilter/model/TransfersDisciplineFilterBottomParams;-><init>(JLjava/util/List;)V

    .line 460
    .line 461
    .line 462
    return-object v0

    .line 463
    :pswitch_e
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 464
    .line 465
    .line 466
    new-instance v0, Lorg/xplatform/cyber/section/impl/transfers/presentation/dialogs/disciplinefilter/model/TransfersDisciplineFilter;

    .line 467
    .line 468
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 469
    .line 470
    .line 471
    move-result-wide v2

    .line 472
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v4

    .line 476
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object v1

    .line 480
    invoke-direct {v0, v2, v3, v4, v1}, Lorg/xplatform/cyber/section/impl/transfers/presentation/dialogs/disciplinefilter/model/TransfersDisciplineFilter;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 481
    .line 482
    .line 483
    return-object v0

    .line 484
    :pswitch_f
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 485
    .line 486
    .line 487
    new-instance v0, Lorg/xplatform/cyber/section/api/presentation/TransferScreenParams;

    .line 488
    .line 489
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 490
    .line 491
    .line 492
    move-result-wide v2

    .line 493
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 494
    .line 495
    .line 496
    move-result-wide v4

    .line 497
    invoke-direct {v0, v2, v3, v4, v5}, Lorg/xplatform/cyber/section/api/presentation/TransferScreenParams;-><init>(JJ)V

    .line 498
    .line 499
    .line 500
    return-object v0

    .line 501
    :pswitch_10
    new-instance v0, Lcom/google/firebase/perf/metrics/Trace;

    .line 502
    .line 503
    invoke-direct {v0, v1, v3}, Lcom/google/firebase/perf/metrics/Trace;-><init>(Landroid/os/Parcel;Z)V

    .line 504
    .line 505
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
    sget-object v0, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Sport$Games$Live;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Sport$Games$Live;

    .line 514
    .line 515
    return-object v0

    .line 516
    :pswitch_12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 517
    .line 518
    .line 519
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 520
    .line 521
    .line 522
    sget-object v0, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Sport$Games$Line;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Sport$Games$Line;

    .line 523
    .line 524
    return-object v0

    .line 525
    :pswitch_13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 529
    .line 530
    .line 531
    sget-object v0, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Sport$FilterTape;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Sport$FilterTape;

    .line 532
    .line 533
    return-object v0

    .line 534
    :pswitch_14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 535
    .line 536
    .line 537
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 538
    .line 539
    .line 540
    sget-object v0, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Sport$Champs$Live;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Sport$Champs$Live;

    .line 541
    .line 542
    return-object v0

    .line 543
    :pswitch_15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 544
    .line 545
    .line 546
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 547
    .line 548
    .line 549
    sget-object v0, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$OneXGames$Tape;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$OneXGames$Tape;

    .line 550
    .line 551
    return-object v0

    .line 552
    :pswitch_16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 556
    .line 557
    .line 558
    sget-object v0, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$OneXGames$Spotlight;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$OneXGames$Spotlight;

    .line 559
    .line 560
    return-object v0

    .line 561
    :pswitch_17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 562
    .line 563
    .line 564
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 565
    .line 566
    .line 567
    sget-object v0, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$OneXGames$Categories;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$OneXGames$Categories;

    .line 568
    .line 569
    return-object v0

    .line 570
    :pswitch_18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 571
    .line 572
    .line 573
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 574
    .line 575
    .line 576
    sget-object v0, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Cyber$Games$Live;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Cyber$Games$Live;

    .line 577
    .line 578
    return-object v0

    .line 579
    :pswitch_19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 580
    .line 581
    .line 582
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 583
    .line 584
    .line 585
    sget-object v0, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Cyber$Games$Line;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Cyber$Games$Line;

    .line 586
    .line 587
    return-object v0

    .line 588
    :pswitch_1a
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 589
    .line 590
    .line 591
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 592
    .line 593
    .line 594
    sget-object v0, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Cyber$Disciplines;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Cyber$Disciplines;

    .line 595
    .line 596
    return-object v0

    .line 597
    :pswitch_1b
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 598
    .line 599
    .line 600
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 601
    .line 602
    .line 603
    sget-object v0, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Cyber$Champs$Live;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Cyber$Champs$Live;

    .line 604
    .line 605
    return-object v0

    .line 606
    :pswitch_1c
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 607
    .line 608
    .line 609
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 610
    .line 611
    .line 612
    sget-object v0, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Cyber$Champs$Line;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Cyber$Champs$Line;

    .line 613
    .line 614
    return-object v0

    .line 615
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
    iget-byte p0, p0, La/rdr0;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualCategoryDisciplinesParams;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Lorg/xplatform/cyber/game/valorant/api/ValorantPostGameScreenParams;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Lorg/xplatform/cyber/game/valorant/api/ValorantGameScreenParams;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Lcom/vk/dto/common/id/UserId;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    new-array p0, p1, [Lorg/xplatform/aggregator/api/model/tournaments/UserActionButtonModel;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    new-array p0, p1, [Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampResultsParams;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    new-array p0, p1, [Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampPrizePoolParams;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_6
    new-array p0, p1, [Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampParams;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_7
    new-array p0, p1, [Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampInfoParams;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_8
    new-array p0, p1, [Lorg/xplatform/ufc/api/weight_class_rating/UfcWeightClassRatingParams;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_9
    new-array p0, p1, [Lorg/xplatform/ufc/api/game/UfcPostGameParams;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_a
    new-array p0, p1, [Lorg/xplatform/ufc/api/game/UfcGameParams;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_b
    new-array p0, p1, [Lorg/xplatform/ufc/api/championship/UfcChampionshipParams;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_c
    new-array p0, p1, [Lorg/xplatform/cyber/section/impl/transfers/presentation/dialogs/timefilter/model/TransfersTimeFilterBottomParams;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_d
    new-array p0, p1, [Lorg/xplatform/cyber/section/impl/transfers/presentation/dialogs/disciplinefilter/model/TransfersDisciplineFilterBottomParams;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_e
    new-array p0, p1, [Lorg/xplatform/cyber/section/impl/transfers/presentation/dialogs/disciplinefilter/model/TransfersDisciplineFilter;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_f
    new-array p0, p1, [Lorg/xplatform/cyber/section/api/presentation/TransferScreenParams;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_10
    new-array p0, p1, [Lcom/google/firebase/perf/metrics/Trace;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_11
    new-array p0, p1, [Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Sport$Games$Live;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_12
    new-array p0, p1, [Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Sport$Games$Line;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_13
    new-array p0, p1, [Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Sport$FilterTape;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_14
    new-array p0, p1, [Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Sport$Champs$Live;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_15
    new-array p0, p1, [Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$OneXGames$Tape;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_16
    new-array p0, p1, [Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$OneXGames$Spotlight;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_17
    new-array p0, p1, [Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$OneXGames$Categories;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_18
    new-array p0, p1, [Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Cyber$Games$Live;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_19
    new-array p0, p1, [Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Cyber$Games$Line;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_1a
    new-array p0, p1, [Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Cyber$Disciplines;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_1b
    new-array p0, p1, [Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Cyber$Champs$Live;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_1c
    new-array p0, p1, [Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Cyber$Champs$Line;

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
