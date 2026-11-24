.class public final La/sne0;
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
    iput-byte p1, p0, La/sne0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v0, v0, La/sne0;->a:B

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    const/4 v4, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v0, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;

    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    if-eqz v6, :cond_0

    .line 31
    .line 32
    move v6, v3

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v6, v4

    .line 35
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move v3, v4

    .line 43
    :goto_1
    invoke-direct {v0, v2, v5, v6, v3}, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 44
    .line 45
    .line 46
    return-object v0

    .line 47
    :pswitch_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    new-instance v0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectTimeRangeScreenParams;

    .line 51
    .line 52
    const-class v2, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectTimeRangeScreenParams;

    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    check-cast v2, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/ChoosenDate;

    .line 63
    .line 64
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-direct {v0, v2, v1}, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectTimeRangeScreenParams;-><init>(Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/ChoosenDate;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-object v0

    .line 72
    :pswitch_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move v0, v3

    .line 76
    new-instance v3, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;

    .line 77
    .line 78
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-static {v2}, La/ygq0;->valueOf(Ljava/lang/String;)La/ygq0;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 87
    .line 88
    .line 89
    move-result-wide v5

    .line 90
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 91
    .line 92
    .line 93
    move-result-wide v7

    .line 94
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    if-eqz v9, :cond_2

    .line 99
    .line 100
    move v9, v0

    .line 101
    goto :goto_2

    .line 102
    :cond_2
    move v9, v4

    .line 103
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 104
    .line 105
    .line 106
    move-result v10

    .line 107
    if-eqz v10, :cond_3

    .line 108
    .line 109
    move v10, v0

    .line 110
    goto :goto_3

    .line 111
    :cond_3
    move v10, v4

    .line 112
    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 113
    .line 114
    .line 115
    move-result-object v11

    .line 116
    check-cast v11, Ljava/util/Date;

    .line 117
    .line 118
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 119
    .line 120
    .line 121
    move-result v12

    .line 122
    if-eqz v12, :cond_4

    .line 123
    .line 124
    move v12, v0

    .line 125
    goto :goto_4

    .line 126
    :cond_4
    move v12, v4

    .line 127
    :goto_4
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-static {v0}, La/jhq0;->valueOf(Ljava/lang/String;)La/jhq0;

    .line 132
    .line 133
    .line 134
    move-result-object v13

    .line 135
    move-object v4, v2

    .line 136
    invoke-direct/range {v3 .. v13}, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;-><init>(La/ygq0;JJZZLjava/util/Date;ZLa/jhq0;)V

    .line 137
    .line 138
    .line 139
    return-object v3

    .line 140
    :pswitch_2
    move v0, v3

    .line 141
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    move v2, v4

    .line 145
    new-instance v4, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;

    .line 146
    .line 147
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 148
    .line 149
    .line 150
    move-result-wide v5

    .line 151
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    move-object v7, v3

    .line 156
    check-cast v7, Ljava/util/Date;

    .line 157
    .line 158
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v8

    .line 162
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    invoke-static {v3}, La/j2i0;->valueOf(Ljava/lang/String;)La/j2i0;

    .line 167
    .line 168
    .line 169
    move-result-object v9

    .line 170
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v10

    .line 174
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    if-eqz v3, :cond_5

    .line 179
    .line 180
    move v11, v0

    .line 181
    goto :goto_5

    .line 182
    :cond_5
    move v11, v2

    .line 183
    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    move-object v12, v3

    .line 188
    check-cast v12, Ljava/util/Date;

    .line 189
    .line 190
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    if-eqz v3, :cond_6

    .line 195
    .line 196
    move v13, v0

    .line 197
    goto :goto_6

    .line 198
    :cond_6
    move v13, v2

    .line 199
    :goto_6
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    if-eqz v1, :cond_7

    .line 204
    .line 205
    move v14, v0

    .line 206
    goto :goto_7

    .line 207
    :cond_7
    move v14, v2

    .line 208
    :goto_7
    invoke-direct/range {v4 .. v14}, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;-><init>(JLjava/util/Date;Ljava/lang/String;La/j2i0;Ljava/lang/String;ZLjava/util/Date;ZZ)V

    .line 209
    .line 210
    .line 211
    return-object v4

    .line 212
    :pswitch_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    new-instance v0, Lorg/xplatform/results/impl/presentation/dialogs/results/params/SelectDateScreenParams;

    .line 216
    .line 217
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    check-cast v2, Ljava/util/Date;

    .line 222
    .line 223
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    invoke-direct {v0, v2, v1}, Lorg/xplatform/results/impl/presentation/dialogs/results/params/SelectDateScreenParams;-><init>(Ljava/util/Date;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    return-object v0

    .line 231
    :pswitch_4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    new-instance v3, Lorg/xplatform/cyber/section/api/championships/hltv/SelectAwardParams;

    .line 235
    .line 236
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 237
    .line 238
    .line 239
    move-result-wide v4

    .line 240
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 241
    .line 242
    .line 243
    move-result-wide v6

    .line 244
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 245
    .line 246
    .line 247
    move-result-wide v8

    .line 248
    invoke-direct/range {v3 .. v9}, Lorg/xplatform/cyber/section/api/championships/hltv/SelectAwardParams;-><init>(JJJ)V

    .line 249
    .line 250
    .line 251
    return-object v3

    .line 252
    :pswitch_5
    move v0, v3

    .line 253
    move v2, v4

    .line 254
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    new-instance v3, Lorg/xplatform/security/impl/presentation/secret_question/models/SecretQuestionUiModel;

    .line 258
    .line 259
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    if-eqz v1, :cond_8

    .line 272
    .line 273
    goto :goto_8

    .line 274
    :cond_8
    move v0, v2

    .line 275
    :goto_8
    invoke-direct {v3, v5, v4, v0}, Lorg/xplatform/security/impl/presentation/secret_question/models/SecretQuestionUiModel;-><init>(Ljava/lang/String;IZ)V

    .line 276
    .line 277
    .line 278
    return-object v3

    .line 279
    :pswitch_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    new-instance v0, Lorg/xplatform/security/api/domain/models/SecretQuestionModel;

    .line 283
    .line 284
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 285
    .line 286
    .line 287
    move-result v2

    .line 288
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    invoke-direct {v0, v2, v1}, Lorg/xplatform/security/api/domain/models/SecretQuestionModel;-><init>(ILjava/lang/String;)V

    .line 293
    .line 294
    .line 295
    return-object v0

    .line 296
    :pswitch_7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    new-instance v0, Lorg/xplatform/security/impl/presentation/secret_question_choice/params/SecretQuestionChoiceScreenParams;

    .line 300
    .line 301
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 306
    .line 307
    .line 308
    move-result v1

    .line 309
    invoke-direct {v0, v2, v1}, Lorg/xplatform/security/impl/presentation/secret_question_choice/params/SecretQuestionChoiceScreenParams;-><init>(Ljava/lang/String;I)V

    .line 310
    .line 311
    .line 312
    return-object v0

    .line 313
    :pswitch_8
    move v0, v3

    .line 314
    move v2, v4

    .line 315
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    new-instance v3, Lorg/xplatform/statistic/grand_prix/presentation/model/SeasonItemUIModel;

    .line 319
    .line 320
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v4

    .line 324
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v5

    .line 328
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 329
    .line 330
    .line 331
    move-result v1

    .line 332
    if-eqz v1, :cond_9

    .line 333
    .line 334
    goto :goto_9

    .line 335
    :cond_9
    move v0, v2

    .line 336
    :goto_9
    invoke-direct {v3, v4, v5, v0}, Lorg/xplatform/statistic/grand_prix/presentation/model/SeasonItemUIModel;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 337
    .line 338
    .line 339
    return-object v3

    .line 340
    :pswitch_9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    new-instance v0, Lorg/xplatform/top/impl/utils/nested_list_scroll_anchor_holder/model/ScrollPosition;

    .line 344
    .line 345
    const-class v2, Lorg/xplatform/top/impl/utils/nested_list_scroll_anchor_holder/model/ScrollPosition;

    .line 346
    .line 347
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 356
    .line 357
    .line 358
    move-result v3

    .line 359
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 360
    .line 361
    .line 362
    move-result v1

    .line 363
    invoke-direct {v0, v2, v3, v1}, Lorg/xplatform/top/impl/utils/nested_list_scroll_anchor_holder/model/ScrollPosition;-><init>(Landroid/os/Parcelable;II)V

    .line 364
    .line 365
    .line 366
    return-object v0

    .line 367
    :pswitch_a
    move v0, v3

    .line 368
    move v2, v4

    .line 369
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    new-instance v4, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;

    .line 373
    .line 374
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v5

    .line 378
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 379
    .line 380
    .line 381
    move-result v3

    .line 382
    if-eqz v3, :cond_a

    .line 383
    .line 384
    move v6, v0

    .line 385
    goto :goto_a

    .line 386
    :cond_a
    move v6, v2

    .line 387
    :goto_a
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 388
    .line 389
    .line 390
    move-result-wide v7

    .line 391
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 392
    .line 393
    .line 394
    move-result v3

    .line 395
    if-eqz v3, :cond_b

    .line 396
    .line 397
    move v9, v0

    .line 398
    goto :goto_b

    .line 399
    :cond_b
    move v9, v2

    .line 400
    :goto_b
    sget-object v0, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 401
    .line 402
    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    move-object v10, v0

    .line 407
    check-cast v10, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 408
    .line 409
    invoke-direct/range {v4 .. v10}, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;-><init>(Ljava/lang/String;ZJZLorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;)V

    .line 410
    .line 411
    .line 412
    return-object v4

    .line 413
    :pswitch_b
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    new-instance v5, Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;

    .line 417
    .line 418
    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    .line 419
    .line 420
    .line 421
    move-result-wide v6

    .line 422
    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    .line 423
    .line 424
    .line 425
    move-result-wide v8

    .line 426
    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    .line 427
    .line 428
    .line 429
    move-result-wide v10

    .line 430
    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    .line 431
    .line 432
    .line 433
    move-result-wide v12

    .line 434
    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    .line 435
    .line 436
    .line 437
    move-result-wide v14

    .line 438
    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    .line 439
    .line 440
    .line 441
    move-result-wide v16

    .line 442
    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    .line 443
    .line 444
    .line 445
    move-result-wide v18

    .line 446
    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    .line 447
    .line 448
    .line 449
    move-result-wide v20

    .line 450
    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    .line 451
    .line 452
    .line 453
    move-result-wide v22

    .line 454
    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    .line 455
    .line 456
    .line 457
    move-result-wide v24

    .line 458
    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    .line 459
    .line 460
    .line 461
    move-result-wide v26

    .line 462
    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    .line 463
    .line 464
    .line 465
    move-result-wide v28

    .line 466
    invoke-direct/range {v5 .. v29}, Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;-><init>(DDDDDDDDDDDD)V

    .line 467
    .line 468
    .line 469
    return-object v5

    .line 470
    :pswitch_c
    move v2, v4

    .line 471
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
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 479
    .line 480
    .line 481
    move-result v3

    .line 482
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 483
    .line 484
    invoke-direct {v4, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 485
    .line 486
    .line 487
    :goto_c
    if-eq v2, v3, :cond_c

    .line 488
    .line 489
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object v5

    .line 493
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v6

    .line 497
    invoke-virtual {v4, v5, v6}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    add-int/lit8 v2, v2, 0x1

    .line 501
    .line 502
    goto :goto_c

    .line 503
    :cond_c
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v2

    .line 507
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v1

    .line 511
    new-instance v3, Lorg/xplatform/rules/api/presentation/models/RuleData;

    .line 512
    .line 513
    invoke-direct {v3, v0, v2, v1, v4}, Lorg/xplatform/rules/api/presentation/models/RuleData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 514
    .line 515
    .line 516
    return-object v3

    .line 517
    :pswitch_d
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 518
    .line 519
    .line 520
    new-instance v0, Lorg/xplatform/special_event/impl/results/presentation/model/ResultsScreenParams;

    .line 521
    .line 522
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 523
    .line 524
    .line 525
    move-result v3

    .line 526
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 527
    .line 528
    .line 529
    move-result-wide v4

    .line 530
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 531
    .line 532
    .line 533
    move-result v6

    .line 534
    if-nez v6, :cond_d

    .line 535
    .line 536
    goto :goto_d

    .line 537
    :cond_d
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 538
    .line 539
    .line 540
    move-result-wide v1

    .line 541
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 542
    .line 543
    .line 544
    move-result-object v2

    .line 545
    :goto_d
    invoke-direct {v0, v3, v4, v5, v2}, Lorg/xplatform/special_event/impl/results/presentation/model/ResultsScreenParams;-><init>(IJLjava/lang/Long;)V

    .line 546
    .line 547
    .line 548
    return-object v0

    .line 549
    :pswitch_e
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 550
    .line 551
    .line 552
    move-result v0

    .line 553
    :goto_e
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 554
    .line 555
    .line 556
    move-result v3

    .line 557
    if-ge v3, v0, :cond_f

    .line 558
    .line 559
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 560
    .line 561
    .line 562
    move-result v3

    .line 563
    int-to-char v4, v3

    .line 564
    const/4 v5, 0x2

    .line 565
    if-eq v4, v5, :cond_e

    .line 566
    .line 567
    invoke-static {v1, v3}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 568
    .line 569
    .line 570
    goto :goto_e

    .line 571
    :cond_e
    invoke-static {v1, v3}, La/b5x;->y(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 572
    .line 573
    .line 574
    move-result-object v2

    .line 575
    goto :goto_e

    .line 576
    :cond_f
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 577
    .line 578
    .line 579
    new-instance v0, Lcom/google/firebase/messaging/RemoteMessage;

    .line 580
    .line 581
    invoke-direct {v0, v2}, Lcom/google/firebase/messaging/RemoteMessage;-><init>(Landroid/os/Bundle;)V

    .line 582
    .line 583
    .line 584
    return-object v0

    .line 585
    :pswitch_f
    move v0, v3

    .line 586
    move v2, v4

    .line 587
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 588
    .line 589
    .line 590
    new-instance v3, Lorg/xplatform/cyber/game/core/betting/domain/model/RelatedParams;

    .line 591
    .line 592
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 593
    .line 594
    .line 595
    move-result v4

    .line 596
    if-eqz v4, :cond_10

    .line 597
    .line 598
    move v4, v0

    .line 599
    goto :goto_f

    .line 600
    :cond_10
    move v4, v2

    .line 601
    :goto_f
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 602
    .line 603
    .line 604
    move-result-wide v5

    .line 605
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 606
    .line 607
    .line 608
    move-result-wide v7

    .line 609
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    invoke-static {v0}, La/pb10;->valueOf(Ljava/lang/String;)La/pb10;

    .line 614
    .line 615
    .line 616
    move-result-object v9

    .line 617
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 618
    .line 619
    .line 620
    move-result-wide v10

    .line 621
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 622
    .line 623
    .line 624
    move-result-wide v12

    .line 625
    invoke-direct/range {v3 .. v13}, Lorg/xplatform/cyber/game/core/betting/domain/model/RelatedParams;-><init>(ZJJLa/pb10;JJ)V

    .line 626
    .line 627
    .line 628
    return-object v3

    .line 629
    :pswitch_10
    move v0, v3

    .line 630
    move v2, v4

    .line 631
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 632
    .line 633
    .line 634
    new-instance v4, Lorg/xplatform/related/api/presentation/RelatedParams;

    .line 635
    .line 636
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 637
    .line 638
    .line 639
    move-result v3

    .line 640
    if-eqz v3, :cond_11

    .line 641
    .line 642
    move v5, v0

    .line 643
    goto :goto_10

    .line 644
    :cond_11
    move v5, v2

    .line 645
    :goto_10
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 646
    .line 647
    .line 648
    move-result-wide v6

    .line 649
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 650
    .line 651
    .line 652
    move-result-wide v8

    .line 653
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 654
    .line 655
    .line 656
    move-result-wide v10

    .line 657
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 658
    .line 659
    .line 660
    move-result-wide v12

    .line 661
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 662
    .line 663
    .line 664
    move-result-object v0

    .line 665
    invoke-static {v0}, La/tef0;->valueOf(Ljava/lang/String;)La/tef0;

    .line 666
    .line 667
    .line 668
    move-result-object v14

    .line 669
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 670
    .line 671
    .line 672
    move-result-object v0

    .line 673
    invoke-static {v0}, La/pb10;->valueOf(Ljava/lang/String;)La/pb10;

    .line 674
    .line 675
    .line 676
    move-result-object v15

    .line 677
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    move-object/from16 v16, v0

    .line 682
    .line 683
    check-cast v16, La/ms2;

    .line 684
    .line 685
    invoke-direct/range {v4 .. v16}, Lorg/xplatform/related/api/presentation/RelatedParams;-><init>(ZJJJJLa/tef0;La/pb10;La/ms2;)V

    .line 686
    .line 687
    .line 688
    return-object v4

    .line 689
    :pswitch_11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 690
    .line 691
    .line 692
    new-instance v5, Lorg/xplatform/registration/success/api/RegistrationSuccessParams;

    .line 693
    .line 694
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 695
    .line 696
    .line 697
    move-result-object v6

    .line 698
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 699
    .line 700
    .line 701
    move-result-object v7

    .line 702
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 703
    .line 704
    .line 705
    move-result-object v8

    .line 706
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    move-result-object v9

    .line 710
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 711
    .line 712
    .line 713
    move-result v0

    .line 714
    if-nez v0, :cond_12

    .line 715
    .line 716
    move-object v10, v2

    .line 717
    goto :goto_11

    .line 718
    :cond_12
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 719
    .line 720
    .line 721
    move-result v0

    .line 722
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 723
    .line 724
    .line 725
    move-result-object v0

    .line 726
    move-object v10, v0

    .line 727
    :goto_11
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 728
    .line 729
    .line 730
    move-result-object v0

    .line 731
    invoke-static {v0}, La/q7f0;->valueOf(Ljava/lang/String;)La/q7f0;

    .line 732
    .line 733
    .line 734
    move-result-object v11

    .line 735
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 736
    .line 737
    .line 738
    move-result-object v12

    .line 739
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 740
    .line 741
    .line 742
    move-result-object v13

    .line 743
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 744
    .line 745
    .line 746
    move-result-object v14

    .line 747
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 748
    .line 749
    .line 750
    move-result-object v15

    .line 751
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 752
    .line 753
    .line 754
    move-result-object v16

    .line 755
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 756
    .line 757
    .line 758
    move-result-object v17

    .line 759
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 760
    .line 761
    .line 762
    move-result v0

    .line 763
    if-nez v0, :cond_13

    .line 764
    .line 765
    :goto_12
    move-object/from16 v18, v2

    .line 766
    .line 767
    goto :goto_13

    .line 768
    :cond_13
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 769
    .line 770
    .line 771
    move-result v0

    .line 772
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 773
    .line 774
    .line 775
    move-result-object v2

    .line 776
    goto :goto_12

    .line 777
    :goto_13
    invoke-direct/range {v5 .. v18}, Lorg/xplatform/registration/success/api/RegistrationSuccessParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;La/q7f0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 778
    .line 779
    .line 780
    return-object v5

    .line 781
    :pswitch_12
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 782
    .line 783
    .line 784
    move-result v0

    .line 785
    :goto_14
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 786
    .line 787
    .line 788
    move-result v2

    .line 789
    if-ge v2, v0, :cond_14

    .line 790
    .line 791
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 792
    .line 793
    .line 794
    move-result v2

    .line 795
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 796
    .line 797
    .line 798
    goto :goto_14

    .line 799
    :cond_14
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 800
    .line 801
    .line 802
    new-instance v0, Lcom/google/android/gms/identitycredentials/RegistrationResponse;

    .line 803
    .line 804
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 805
    .line 806
    .line 807
    return-object v0

    .line 808
    :pswitch_13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 809
    .line 810
    .line 811
    new-instance v0, Lorg/xplatform/registration_default/api/presentation/model/RegistrationDefaultScreenParams;

    .line 812
    .line 813
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 814
    .line 815
    .line 816
    move-result-object v1

    .line 817
    invoke-static {v1}, La/q7f0;->valueOf(Ljava/lang/String;)La/q7f0;

    .line 818
    .line 819
    .line 820
    move-result-object v1

    .line 821
    invoke-direct {v0, v1}, Lorg/xplatform/registration_default/api/presentation/model/RegistrationDefaultScreenParams;-><init>(La/q7f0;)V

    .line 822
    .line 823
    .line 824
    return-object v0

    .line 825
    :pswitch_14
    move v0, v3

    .line 826
    move v2, v4

    .line 827
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 828
    .line 829
    .line 830
    move v3, v2

    .line 831
    new-instance v2, Lorg/xplatform/registration_default/impl/presentation/registration_bonus/models/RegistrationBonusDefaultScreenParams;

    .line 832
    .line 833
    move v4, v3

    .line 834
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 835
    .line 836
    .line 837
    move-result v3

    .line 838
    move v5, v4

    .line 839
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 840
    .line 841
    .line 842
    move-result v4

    .line 843
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 844
    .line 845
    .line 846
    move-result-wide v6

    .line 847
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 848
    .line 849
    .line 850
    move-result v8

    .line 851
    if-eqz v8, :cond_15

    .line 852
    .line 853
    move v8, v0

    .line 854
    goto :goto_15

    .line 855
    :cond_15
    move v8, v5

    .line 856
    :goto_15
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 857
    .line 858
    .line 859
    move-result v5

    .line 860
    invoke-direct/range {v2 .. v8}, Lorg/xplatform/registration_default/impl/presentation/registration_bonus/models/RegistrationBonusDefaultScreenParams;-><init>(IIIJZ)V

    .line 861
    .line 862
    .line 863
    return-object v2

    .line 864
    :pswitch_15
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 865
    .line 866
    .line 867
    move-result v0

    .line 868
    :goto_16
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 869
    .line 870
    .line 871
    move-result v2

    .line 872
    if-ge v2, v0, :cond_16

    .line 873
    .line 874
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 875
    .line 876
    .line 877
    move-result v2

    .line 878
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 879
    .line 880
    .line 881
    goto :goto_16

    .line 882
    :cond_16
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 883
    .line 884
    .line 885
    new-instance v0, Lcom/google/android/gms/identitycredentials/RegisterExportResponse;

    .line 886
    .line 887
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 888
    .line 889
    .line 890
    return-object v0

    .line 891
    :pswitch_16
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 892
    .line 893
    .line 894
    move-result v0

    .line 895
    :goto_17
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 896
    .line 897
    .line 898
    move-result v2

    .line 899
    if-ge v2, v0, :cond_17

    .line 900
    .line 901
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 902
    .line 903
    .line 904
    move-result v2

    .line 905
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 906
    .line 907
    .line 908
    goto :goto_17

    .line 909
    :cond_17
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 910
    .line 911
    .line 912
    new-instance v0, Lcom/google/android/gms/identitycredentials/RegisterCreationOptionsResponse;

    .line 913
    .line 914
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 915
    .line 916
    .line 917
    return-object v0

    .line 918
    :pswitch_17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 919
    .line 920
    .line 921
    new-instance v0, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;

    .line 922
    .line 923
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 924
    .line 925
    .line 926
    move-result v2

    .line 927
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 928
    .line 929
    .line 930
    move-result-object v1

    .line 931
    invoke-direct {v0, v2, v1}, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;-><init>(ILjava/lang/String;)V

    .line 932
    .line 933
    .line 934
    return-object v0

    .line 935
    :pswitch_18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 936
    .line 937
    .line 938
    new-instance v0, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;

    .line 939
    .line 940
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 941
    .line 942
    .line 943
    move-result v2

    .line 944
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 945
    .line 946
    .line 947
    move-result-object v1

    .line 948
    invoke-direct {v0, v2, v1}, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;-><init>(ILjava/lang/String;)V

    .line 949
    .line 950
    .line 951
    return-object v0

    .line 952
    :pswitch_19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 953
    .line 954
    .line 955
    new-instance v0, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;

    .line 956
    .line 957
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 958
    .line 959
    .line 960
    move-result v2

    .line 961
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 962
    .line 963
    .line 964
    move-result-object v1

    .line 965
    invoke-direct {v0, v2, v1}, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;-><init>(ILjava/lang/String;)V

    .line 966
    .line 967
    .line 968
    return-object v0

    .line 969
    :pswitch_1a
    move v5, v4

    .line 970
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 971
    .line 972
    .line 973
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 974
    .line 975
    .line 976
    move-result v0

    .line 977
    new-instance v2, Ljava/util/ArrayList;

    .line 978
    .line 979
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 980
    .line 981
    .line 982
    :goto_18
    if-eq v4, v0, :cond_18

    .line 983
    .line 984
    sget-object v3, Lorg/xplatform/referral/api/domain/model/ReferralUser;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 985
    .line 986
    invoke-interface {v3, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 987
    .line 988
    .line 989
    move-result-object v3

    .line 990
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 991
    .line 992
    .line 993
    add-int/lit8 v4, v4, 0x1

    .line 994
    .line 995
    goto :goto_18

    .line 996
    :cond_18
    new-instance v0, Lorg/xplatform/referral/api/presentation/ReferralsListParams;

    .line 997
    .line 998
    invoke-direct {v0, v2}, Lorg/xplatform/referral/api/presentation/ReferralsListParams;-><init>(Ljava/util/List;)V

    .line 999
    .line 1000
    .line 1001
    return-object v0

    .line 1002
    :pswitch_1b
    move v0, v3

    .line 1003
    move v5, v4

    .line 1004
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1005
    .line 1006
    .line 1007
    new-instance v3, Lorg/xplatform/referral/api/domain/model/ReferralUser;

    .line 1008
    .line 1009
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v4

    .line 1013
    move v2, v5

    .line 1014
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v5

    .line 1018
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v6

    .line 1022
    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    .line 1023
    .line 1024
    .line 1025
    move-result-wide v7

    .line 1026
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1027
    .line 1028
    .line 1029
    move-result v9

    .line 1030
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1031
    .line 1032
    .line 1033
    move-result v1

    .line 1034
    if-eqz v1, :cond_19

    .line 1035
    .line 1036
    move v10, v0

    .line 1037
    goto :goto_19

    .line 1038
    :cond_19
    move v10, v2

    .line 1039
    :goto_19
    invoke-direct/range {v3 .. v10}, Lorg/xplatform/referral/api/domain/model/ReferralUser;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DIZ)V

    .line 1040
    .line 1041
    .line 1042
    return-object v3

    .line 1043
    :pswitch_1c
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1044
    .line 1045
    .line 1046
    new-instance v0, Lorg/xplatform/referral/api/presentation/ReferralNetworkParams;

    .line 1047
    .line 1048
    sget-object v2, Lorg/xplatform/referral/api/domain/model/ReferralNetworkInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1049
    .line 1050
    invoke-interface {v2, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v1

    .line 1054
    check-cast v1, Lorg/xplatform/referral/api/domain/model/ReferralNetworkInfo;

    .line 1055
    .line 1056
    invoke-direct {v0, v1}, Lorg/xplatform/referral/api/presentation/ReferralNetworkParams;-><init>(Lorg/xplatform/referral/api/domain/model/ReferralNetworkInfo;)V

    .line 1057
    .line 1058
    .line 1059
    return-object v0

    .line 1060
    nop

    .line 1061
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
    iget-byte p0, p0, La/sne0;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectTimeRangeScreenParams;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    new-array p0, p1, [Lorg/xplatform/results/impl/presentation/dialogs/results/params/SelectDateScreenParams;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    new-array p0, p1, [Lorg/xplatform/cyber/section/api/championships/hltv/SelectAwardParams;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    new-array p0, p1, [Lorg/xplatform/security/impl/presentation/secret_question/models/SecretQuestionUiModel;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_6
    new-array p0, p1, [Lorg/xplatform/security/api/domain/models/SecretQuestionModel;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_7
    new-array p0, p1, [Lorg/xplatform/security/impl/presentation/secret_question_choice/params/SecretQuestionChoiceScreenParams;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_8
    new-array p0, p1, [Lorg/xplatform/statistic/grand_prix/presentation/model/SeasonItemUIModel;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_9
    new-array p0, p1, [Lorg/xplatform/top/impl/utils/nested_list_scroll_anchor_holder/model/ScrollPosition;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_a
    new-array p0, p1, [Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_b
    new-array p0, p1, [Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_c
    new-array p0, p1, [Lorg/xplatform/rules/api/presentation/models/RuleData;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_d
    new-array p0, p1, [Lorg/xplatform/special_event/impl/results/presentation/model/ResultsScreenParams;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_e
    new-array p0, p1, [Lcom/google/firebase/messaging/RemoteMessage;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_f
    new-array p0, p1, [Lorg/xplatform/cyber/game/core/betting/domain/model/RelatedParams;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_10
    new-array p0, p1, [Lorg/xplatform/related/api/presentation/RelatedParams;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_11
    new-array p0, p1, [Lorg/xplatform/registration/success/api/RegistrationSuccessParams;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_12
    new-array p0, p1, [Lcom/google/android/gms/identitycredentials/RegistrationResponse;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_13
    new-array p0, p1, [Lorg/xplatform/registration_default/api/presentation/model/RegistrationDefaultScreenParams;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_14
    new-array p0, p1, [Lorg/xplatform/registration_default/impl/presentation/registration_bonus/models/RegistrationBonusDefaultScreenParams;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_15
    new-array p0, p1, [Lcom/google/android/gms/identitycredentials/RegisterExportResponse;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_16
    new-array p0, p1, [Lcom/google/android/gms/identitycredentials/RegisterCreationOptionsResponse;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_17
    new-array p0, p1, [Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_18
    new-array p0, p1, [Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_19
    new-array p0, p1, [Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_1a
    new-array p0, p1, [Lorg/xplatform/referral/api/presentation/ReferralsListParams;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_1b
    new-array p0, p1, [Lorg/xplatform/referral/api/domain/model/ReferralUser;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_1c
    new-array p0, p1, [Lorg/xplatform/referral/api/presentation/ReferralNetworkParams;

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
