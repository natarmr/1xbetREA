.class public final La/okc;
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
    iput-byte p1, p0, La/okc;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v0, v0, La/okc;->a:B

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v0, Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweek/CyberCalendarDaysOfWeekParams;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v2}, La/yag;->valueOf(Ljava/lang/String;)La/yag;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    sget-object v3, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 28
    .line 29
    invoke-interface {v3, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 34
    .line 35
    invoke-direct {v0, v2, v1}, Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweek/CyberCalendarDaysOfWeekParams;-><init>(La/yag;Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;)V

    .line 36
    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    new-instance v3, Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;

    .line 43
    .line 44
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v9

    .line 68
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 69
    .line 70
    .line 71
    move-result-wide v10

    .line 72
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 73
    .line 74
    .line 75
    move-result-wide v12

    .line 76
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 77
    .line 78
    .line 79
    move-result-wide v14

    .line 80
    invoke-direct/range {v3 .. v15}, Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJ)V

    .line 81
    .line 82
    .line 83
    return-object v3

    .line 84
    :pswitch_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move v0, v4

    .line 88
    new-instance v4, Lorg/xplatform/cyber/game/core/game_screen/presentation/bottomsheet/CyberBottomSheetParams;

    .line 89
    .line 90
    move v7, v5

    .line 91
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 92
    .line 93
    .line 94
    move-result-wide v5

    .line 95
    move v9, v7

    .line 96
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 97
    .line 98
    .line 99
    move-result-wide v7

    .line 100
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-eqz v2, :cond_0

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_0
    move v9, v0

    .line 108
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 109
    .line 110
    .line 111
    move-result-wide v10

    .line 112
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 113
    .line 114
    .line 115
    move-result-wide v12

    .line 116
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 117
    .line 118
    .line 119
    move-result-wide v14

    .line 120
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    move-object/from16 v16, v0

    .line 125
    .line 126
    check-cast v16, La/ms2;

    .line 127
    .line 128
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-static {v0}, La/grs;->valueOf(Ljava/lang/String;)La/grs;

    .line 133
    .line 134
    .line 135
    move-result-object v17

    .line 136
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v18

    .line 140
    invoke-direct/range {v4 .. v18}, Lorg/xplatform/cyber/game/core/game_screen/presentation/bottomsheet/CyberBottomSheetParams;-><init>(JJZJJJLa/ms2;La/grs;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    return-object v4

    .line 144
    :pswitch_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    new-instance v0, Lorg/xplatform/cyber/section/api/activeteams/CyberActiveTeamsParams;

    .line 148
    .line 149
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 150
    .line 151
    .line 152
    move-result-wide v1

    .line 153
    invoke-direct {v0, v1, v2}, Lorg/xplatform/cyber/section/api/activeteams/CyberActiveTeamsParams;-><init>(J)V

    .line 154
    .line 155
    .line 156
    return-object v0

    .line 157
    :pswitch_3
    move v0, v4

    .line 158
    move v9, v5

    .line 159
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 163
    .line 164
    .line 165
    move-result-wide v5

    .line 166
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 167
    .line 168
    .line 169
    move-result-wide v7

    .line 170
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    if-eqz v2, :cond_1

    .line 175
    .line 176
    move v4, v9

    .line 177
    move/from16 v24, v4

    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_1
    move/from16 v24, v0

    .line 181
    .line 182
    move v4, v9

    .line 183
    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 184
    .line 185
    .line 186
    move-result-wide v9

    .line 187
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 188
    .line 189
    .line 190
    move-result-wide v11

    .line 191
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    if-eqz v2, :cond_2

    .line 196
    .line 197
    move/from16 v25, v4

    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_2
    move/from16 v25, v0

    .line 201
    .line 202
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 203
    .line 204
    .line 205
    move-result-wide v13

    .line 206
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 207
    .line 208
    .line 209
    move-result-wide v15

    .line 210
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v19

    .line 214
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    new-instance v3, Ljava/util/ArrayList;

    .line 219
    .line 220
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 221
    .line 222
    .line 223
    :goto_3
    if-eq v0, v2, :cond_3

    .line 224
    .line 225
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 226
    .line 227
    .line 228
    move-result v17

    .line 229
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    add-int/lit8 v0, v0, 0x1

    .line 237
    .line 238
    const/4 v4, 0x1

    .line 239
    goto :goto_3

    .line 240
    :cond_3
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    new-instance v2, Ljava/util/ArrayList;

    .line 245
    .line 246
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 247
    .line 248
    .line 249
    const/4 v4, 0x0

    .line 250
    :goto_4
    if-eq v4, v0, :cond_4

    .line 251
    .line 252
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 253
    .line 254
    .line 255
    move-result v17

    .line 256
    move/from16 v20, v0

    .line 257
    .line 258
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    add-int/lit8 v4, v4, 0x1

    .line 266
    .line 267
    move/from16 v0, v20

    .line 268
    .line 269
    goto :goto_4

    .line 270
    :cond_4
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    if-eqz v0, :cond_5

    .line 275
    .line 276
    const/16 v26, 0x1

    .line 277
    .line 278
    goto :goto_5

    .line 279
    :cond_5
    const/16 v26, 0x0

    .line 280
    .line 281
    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v20

    .line 285
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 286
    .line 287
    .line 288
    move-result v4

    .line 289
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 290
    .line 291
    .line 292
    move-result-wide v17

    .line 293
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v21

    .line 297
    move-object/from16 v22, v3

    .line 298
    .line 299
    new-instance v3, Lorg/xplatform/cyber/game/core/presentation/action/CyberActionDialogParams;

    .line 300
    .line 301
    move-object/from16 v23, v2

    .line 302
    .line 303
    invoke-direct/range {v3 .. v26}, Lorg/xplatform/cyber/game/core/presentation/action/CyberActionDialogParams;-><init>(IJJJJJJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZZ)V

    .line 304
    .line 305
    .line 306
    return-object v3

    .line 307
    :pswitch_4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    new-instance v0, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;

    .line 311
    .line 312
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 313
    .line 314
    .line 315
    move-result v2

    .line 316
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v1

    .line 324
    invoke-direct {v0, v2, v3, v1}, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    return-object v0

    .line 328
    :pswitch_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    new-instance v0, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;

    .line 332
    .line 333
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 334
    .line 335
    .line 336
    move-result v2

    .line 337
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v3

    .line 341
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    invoke-direct {v0, v2, v3, v1}, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    return-object v0

    .line 349
    :pswitch_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    new-instance v0, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;

    .line 353
    .line 354
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 355
    .line 356
    .line 357
    move-result v2

    .line 358
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v3

    .line 362
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    invoke-direct {v0, v2, v3, v1}, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    return-object v0

    .line 370
    :pswitch_7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    new-instance v4, Lorg/xplatform/cyber/game/counterstrike/api/Cs2GameScreenParams;

    .line 374
    .line 375
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 376
    .line 377
    .line 378
    move-result-wide v6

    .line 379
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 380
    .line 381
    .line 382
    move-result v0

    .line 383
    if-eqz v0, :cond_6

    .line 384
    .line 385
    const/16 v18, 0x1

    .line 386
    .line 387
    :goto_6
    const/4 v9, 0x1

    .line 388
    goto :goto_7

    .line 389
    :cond_6
    const/16 v18, 0x0

    .line 390
    .line 391
    goto :goto_6

    .line 392
    :goto_7
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 393
    .line 394
    .line 395
    move-result-wide v2

    .line 396
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 397
    .line 398
    .line 399
    move-result-wide v10

    .line 400
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 401
    .line 402
    .line 403
    move-result-wide v12

    .line 404
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 405
    .line 406
    .line 407
    move-result v0

    .line 408
    if-eqz v0, :cond_7

    .line 409
    .line 410
    move/from16 v19, v9

    .line 411
    .line 412
    goto :goto_8

    .line 413
    :cond_7
    const/16 v19, 0x0

    .line 414
    .line 415
    :goto_8
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v17

    .line 419
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 420
    .line 421
    .line 422
    move-result-wide v14

    .line 423
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 424
    .line 425
    .line 426
    move-result v5

    .line 427
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    invoke-static {v0}, La/k1g;->valueOf(Ljava/lang/String;)La/k1g;

    .line 432
    .line 433
    .line 434
    move-result-object v16

    .line 435
    move-wide v8, v2

    .line 436
    invoke-direct/range {v4 .. v19}, Lorg/xplatform/cyber/game/counterstrike/api/Cs2GameScreenParams;-><init>(IJJJJJLa/k1g;Ljava/lang/String;ZZ)V

    .line 437
    .line 438
    .line 439
    return-object v4

    .line 440
    :pswitch_8
    move v9, v5

    .line 441
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 442
    .line 443
    .line 444
    move-result v0

    .line 445
    :goto_9
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 446
    .line 447
    .line 448
    move-result v2

    .line 449
    if-ge v2, v0, :cond_9

    .line 450
    .line 451
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 452
    .line 453
    .line 454
    move-result v2

    .line 455
    int-to-char v4, v2

    .line 456
    if-eq v4, v9, :cond_8

    .line 457
    .line 458
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 459
    .line 460
    .line 461
    :goto_a
    const/4 v9, 0x1

    .line 462
    goto :goto_9

    .line 463
    :cond_8
    invoke-static {v1, v2}, La/b5x;->y(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 464
    .line 465
    .line 466
    move-result-object v3

    .line 467
    goto :goto_a

    .line 468
    :cond_9
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 469
    .line 470
    .line 471
    new-instance v0, Lcom/google/android/gms/identitycredentials/CredentialTransferCapabilities;

    .line 472
    .line 473
    invoke-direct {v0, v3}, Lcom/google/android/gms/identitycredentials/CredentialTransferCapabilities;-><init>(Landroid/os/Bundle;)V

    .line 474
    .line 475
    .line 476
    return-object v0

    .line 477
    :pswitch_9
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 478
    .line 479
    .line 480
    move-result v0

    .line 481
    const-string v2, ""

    .line 482
    .line 483
    move-object v5, v2

    .line 484
    move-object v9, v5

    .line 485
    move-object v10, v9

    .line 486
    move-object v6, v3

    .line 487
    move-object v7, v6

    .line 488
    move-object v8, v7

    .line 489
    :goto_b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 490
    .line 491
    .line 492
    move-result v2

    .line 493
    if-ge v2, v0, :cond_a

    .line 494
    .line 495
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 496
    .line 497
    .line 498
    move-result v2

    .line 499
    int-to-char v3, v2

    .line 500
    packed-switch v3, :pswitch_data_1

    .line 501
    .line 502
    .line 503
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 504
    .line 505
    .line 506
    goto :goto_b

    .line 507
    :pswitch_a
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v10

    .line 511
    goto :goto_b

    .line 512
    :pswitch_b
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object v9

    .line 516
    goto :goto_b

    .line 517
    :pswitch_c
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object v8

    .line 521
    goto :goto_b

    .line 522
    :pswitch_d
    invoke-static {v1, v2}, La/b5x;->y(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 523
    .line 524
    .line 525
    move-result-object v7

    .line 526
    goto :goto_b

    .line 527
    :pswitch_e
    invoke-static {v1, v2}, La/b5x;->y(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 528
    .line 529
    .line 530
    move-result-object v6

    .line 531
    goto :goto_b

    .line 532
    :pswitch_f
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v5

    .line 536
    goto :goto_b

    .line 537
    :cond_a
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 538
    .line 539
    .line 540
    new-instance v4, Lcom/google/android/gms/identitycredentials/CredentialOption;

    .line 541
    .line 542
    invoke-direct/range {v4 .. v10}, Lcom/google/android/gms/identitycredentials/CredentialOption;-><init>(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 543
    .line 544
    .line 545
    return-object v4

    .line 546
    :pswitch_10
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 547
    .line 548
    .line 549
    move-result v0

    .line 550
    move-object v4, v3

    .line 551
    :goto_c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 552
    .line 553
    .line 554
    move-result v5

    .line 555
    if-ge v5, v0, :cond_d

    .line 556
    .line 557
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 558
    .line 559
    .line 560
    move-result v5

    .line 561
    int-to-char v6, v5

    .line 562
    const/4 v9, 0x1

    .line 563
    if-eq v6, v9, :cond_c

    .line 564
    .line 565
    if-eq v6, v2, :cond_b

    .line 566
    .line 567
    invoke-static {v1, v5}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 568
    .line 569
    .line 570
    goto :goto_c

    .line 571
    :cond_b
    invoke-static {v1, v5}, La/b5x;->y(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 572
    .line 573
    .line 574
    move-result-object v4

    .line 575
    goto :goto_c

    .line 576
    :cond_c
    invoke-static {v1, v5}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v3

    .line 580
    goto :goto_c

    .line 581
    :cond_d
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 582
    .line 583
    .line 584
    new-instance v0, Lcom/google/android/gms/identitycredentials/CreateCredentialResponse;

    .line 585
    .line 586
    invoke-direct {v0, v4, v3}, Lcom/google/android/gms/identitycredentials/CreateCredentialResponse;-><init>(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 587
    .line 588
    .line 589
    return-object v0

    .line 590
    :pswitch_11
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 591
    .line 592
    .line 593
    move-result v0

    .line 594
    move-object v4, v3

    .line 595
    :goto_d
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 596
    .line 597
    .line 598
    move-result v5

    .line 599
    if-ge v5, v0, :cond_10

    .line 600
    .line 601
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 602
    .line 603
    .line 604
    move-result v5

    .line 605
    int-to-char v6, v5

    .line 606
    const/4 v9, 0x1

    .line 607
    if-eq v6, v9, :cond_f

    .line 608
    .line 609
    if-eq v6, v2, :cond_e

    .line 610
    .line 611
    invoke-static {v1, v5}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 612
    .line 613
    .line 614
    goto :goto_d

    .line 615
    :cond_e
    sget-object v4, Lcom/google/android/gms/identitycredentials/CreateCredentialResponse;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 616
    .line 617
    invoke-static {v1, v5, v4}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 618
    .line 619
    .line 620
    move-result-object v4

    .line 621
    check-cast v4, Lcom/google/android/gms/identitycredentials/CreateCredentialResponse;

    .line 622
    .line 623
    goto :goto_d

    .line 624
    :cond_f
    sget-object v3, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 625
    .line 626
    invoke-static {v1, v5, v3}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 627
    .line 628
    .line 629
    move-result-object v3

    .line 630
    check-cast v3, Landroid/app/PendingIntent;

    .line 631
    .line 632
    goto :goto_d

    .line 633
    :cond_10
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 634
    .line 635
    .line 636
    new-instance v0, Lcom/google/android/gms/identitycredentials/CreateCredentialHandle;

    .line 637
    .line 638
    invoke-direct {v0, v3, v4}, Lcom/google/android/gms/identitycredentials/CreateCredentialHandle;-><init>(Landroid/app/PendingIntent;Lcom/google/android/gms/identitycredentials/CreateCredentialResponse;)V

    .line 639
    .line 640
    .line 641
    return-object v0

    .line 642
    :pswitch_12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 643
    .line 644
    .line 645
    new-instance v0, Lorg/xplatform/coupon/impl/coupon/presentation/models/CouponTypeUiModel;

    .line 646
    .line 647
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v2

    .line 651
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 652
    .line 653
    .line 654
    move-result v3

    .line 655
    if-eqz v3, :cond_11

    .line 656
    .line 657
    const/4 v3, 0x1

    .line 658
    goto :goto_e

    .line 659
    :cond_11
    const/4 v3, 0x0

    .line 660
    :goto_e
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 661
    .line 662
    .line 663
    move-result v4

    .line 664
    if-eqz v4, :cond_12

    .line 665
    .line 666
    const/4 v4, 0x1

    .line 667
    goto :goto_f

    .line 668
    :cond_12
    const/4 v4, 0x0

    .line 669
    :goto_f
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 670
    .line 671
    .line 672
    move-result v1

    .line 673
    if-eqz v1, :cond_13

    .line 674
    .line 675
    const/4 v1, 0x1

    .line 676
    goto :goto_10

    .line 677
    :cond_13
    const/4 v1, 0x0

    .line 678
    :goto_10
    invoke-direct {v0, v2, v3, v4, v1}, Lorg/xplatform/coupon/impl/coupon/presentation/models/CouponTypeUiModel;-><init>(Ljava/lang/String;ZZZ)V

    .line 679
    .line 680
    .line 681
    return-object v0

    .line 682
    :pswitch_13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 683
    .line 684
    .line 685
    new-instance v5, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;

    .line 686
    .line 687
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 688
    .line 689
    .line 690
    move-result v6

    .line 691
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 692
    .line 693
    .line 694
    move-result-object v9

    .line 695
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 696
    .line 697
    .line 698
    move-result-object v10

    .line 699
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 700
    .line 701
    .line 702
    move-result-wide v7

    .line 703
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 704
    .line 705
    .line 706
    move-result-object v11

    .line 707
    invoke-direct/range {v5 .. v11}, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;-><init>(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 708
    .line 709
    .line 710
    return-object v5

    .line 711
    :pswitch_14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 712
    .line 713
    .line 714
    new-instance v6, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;

    .line 715
    .line 716
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 717
    .line 718
    .line 719
    move-result v7

    .line 720
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 721
    .line 722
    .line 723
    move-result-object v10

    .line 724
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 725
    .line 726
    .line 727
    move-result-object v11

    .line 728
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 729
    .line 730
    .line 731
    move-result-wide v8

    .line 732
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 733
    .line 734
    .line 735
    move-result-object v12

    .line 736
    invoke-direct/range {v6 .. v12}, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;-><init>(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 737
    .line 738
    .line 739
    return-object v6

    .line 740
    :pswitch_15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 741
    .line 742
    .line 743
    new-instance v7, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;

    .line 744
    .line 745
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 746
    .line 747
    .line 748
    move-result v8

    .line 749
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 750
    .line 751
    .line 752
    move-result-object v11

    .line 753
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 754
    .line 755
    .line 756
    move-result-object v12

    .line 757
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 758
    .line 759
    .line 760
    move-result-wide v9

    .line 761
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 762
    .line 763
    .line 764
    move-result-object v13

    .line 765
    invoke-direct/range {v7 .. v13}, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;-><init>(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 766
    .line 767
    .line 768
    return-object v7

    .line 769
    :pswitch_16
    new-instance v0, Lcom/google/firebase/perf/metrics/Counter;

    .line 770
    .line 771
    invoke-direct {v0, v1}, Lcom/google/firebase/perf/metrics/Counter;-><init>(Landroid/os/Parcel;)V

    .line 772
    .line 773
    .line 774
    return-object v0

    .line 775
    :pswitch_17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 776
    .line 777
    .line 778
    move-object v0, v1

    .line 779
    new-instance v1, Lorg/xplatform/make_bet/impl/presentation/model/CoefUiModel;

    .line 780
    .line 781
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 782
    .line 783
    .line 784
    move-result-object v2

    .line 785
    move-object v5, v3

    .line 786
    invoke-virtual {v0}, Landroid/os/Parcel;->readDouble()D

    .line 787
    .line 788
    .line 789
    move-result-wide v3

    .line 790
    move-object v6, v5

    .line 791
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 792
    .line 793
    .line 794
    move-result-object v5

    .line 795
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 796
    .line 797
    .line 798
    move-result-object v7

    .line 799
    invoke-static {v7}, La/l0d;->valueOf(Ljava/lang/String;)La/l0d;

    .line 800
    .line 801
    .line 802
    move-result-object v7

    .line 803
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 804
    .line 805
    .line 806
    move-result v8

    .line 807
    if-nez v8, :cond_14

    .line 808
    .line 809
    goto :goto_11

    .line 810
    :cond_14
    invoke-virtual {v0}, Landroid/os/Parcel;->readDouble()D

    .line 811
    .line 812
    .line 813
    move-result-wide v8

    .line 814
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 815
    .line 816
    .line 817
    move-result-object v6

    .line 818
    :goto_11
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 819
    .line 820
    .line 821
    move-result-object v8

    .line 822
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 823
    .line 824
    .line 825
    move-result-object v9

    .line 826
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 827
    .line 828
    .line 829
    move-result-object v10

    .line 830
    invoke-static {v10}, La/l0d;->valueOf(Ljava/lang/String;)La/l0d;

    .line 831
    .line 832
    .line 833
    move-result-object v10

    .line 834
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 835
    .line 836
    .line 837
    move-result v0

    .line 838
    move-object v11, v7

    .line 839
    move-object v7, v6

    .line 840
    move-object v6, v11

    .line 841
    if-eqz v0, :cond_15

    .line 842
    .line 843
    const/4 v11, 0x1

    .line 844
    goto :goto_12

    .line 845
    :cond_15
    const/4 v11, 0x0

    .line 846
    :goto_12
    invoke-direct/range {v1 .. v11}, Lorg/xplatform/make_bet/impl/presentation/model/CoefUiModel;-><init>(Ljava/lang/String;DLjava/lang/String;La/l0d;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;La/l0d;Z)V

    .line 847
    .line 848
    .line 849
    return-object v1

    .line 850
    :pswitch_18
    move-object v0, v1

    .line 851
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 852
    .line 853
    .line 854
    new-instance v2, Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;

    .line 855
    .line 856
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 857
    .line 858
    .line 859
    move-result-object v1

    .line 860
    move-object v3, v1

    .line 861
    check-cast v3, Ljava/math/BigDecimal;

    .line 862
    .line 863
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 864
    .line 865
    .line 866
    move-result-object v1

    .line 867
    move-object v4, v1

    .line 868
    check-cast v4, Ljava/math/BigDecimal;

    .line 869
    .line 870
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 871
    .line 872
    .line 873
    move-result-object v1

    .line 874
    move-object v5, v1

    .line 875
    check-cast v5, Ljava/math/BigDecimal;

    .line 876
    .line 877
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 878
    .line 879
    .line 880
    move-result-object v1

    .line 881
    move-object v6, v1

    .line 882
    check-cast v6, Ljava/math/BigDecimal;

    .line 883
    .line 884
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 885
    .line 886
    .line 887
    move-result-object v1

    .line 888
    move-object v7, v1

    .line 889
    check-cast v7, Ljava/math/BigDecimal;

    .line 890
    .line 891
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 892
    .line 893
    .line 894
    move-result v1

    .line 895
    if-eqz v1, :cond_16

    .line 896
    .line 897
    const/4 v8, 0x1

    .line 898
    goto :goto_13

    .line 899
    :cond_16
    const/4 v8, 0x0

    .line 900
    :goto_13
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 901
    .line 902
    .line 903
    move-result v1

    .line 904
    if-eqz v1, :cond_17

    .line 905
    .line 906
    const/4 v9, 0x1

    .line 907
    goto :goto_14

    .line 908
    :cond_17
    const/4 v9, 0x0

    .line 909
    :goto_14
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 910
    .line 911
    .line 912
    move-result v1

    .line 913
    if-eqz v1, :cond_18

    .line 914
    .line 915
    const/4 v10, 0x1

    .line 916
    goto :goto_15

    .line 917
    :cond_18
    const/4 v10, 0x0

    .line 918
    :goto_15
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 919
    .line 920
    .line 921
    move-result v0

    .line 922
    if-eqz v0, :cond_19

    .line 923
    .line 924
    const/4 v11, 0x1

    .line 925
    goto :goto_16

    .line 926
    :cond_19
    const/4 v11, 0x0

    .line 927
    :goto_16
    invoke-direct/range {v2 .. v11}, Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;-><init>(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZZZZ)V

    .line 928
    .line 929
    .line 930
    return-object v2

    .line 931
    :pswitch_19
    move-object v0, v1

    .line 932
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 933
    .line 934
    .line 935
    new-instance v3, Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;

    .line 936
    .line 937
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 938
    .line 939
    .line 940
    move-result-object v1

    .line 941
    move-object v4, v1

    .line 942
    check-cast v4, Ljava/math/BigDecimal;

    .line 943
    .line 944
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 945
    .line 946
    .line 947
    move-result-object v1

    .line 948
    move-object v5, v1

    .line 949
    check-cast v5, Ljava/math/BigDecimal;

    .line 950
    .line 951
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 952
    .line 953
    .line 954
    move-result-object v1

    .line 955
    move-object v6, v1

    .line 956
    check-cast v6, Ljava/math/BigDecimal;

    .line 957
    .line 958
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 959
    .line 960
    .line 961
    move-result-object v1

    .line 962
    move-object v7, v1

    .line 963
    check-cast v7, Ljava/math/BigDecimal;

    .line 964
    .line 965
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 966
    .line 967
    .line 968
    move-result-object v1

    .line 969
    move-object v8, v1

    .line 970
    check-cast v8, Ljava/math/BigDecimal;

    .line 971
    .line 972
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 973
    .line 974
    .line 975
    move-result v1

    .line 976
    if-eqz v1, :cond_1a

    .line 977
    .line 978
    const/4 v9, 0x1

    .line 979
    goto :goto_17

    .line 980
    :cond_1a
    const/4 v9, 0x0

    .line 981
    :goto_17
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 982
    .line 983
    .line 984
    move-result v1

    .line 985
    if-eqz v1, :cond_1b

    .line 986
    .line 987
    const/4 v10, 0x1

    .line 988
    goto :goto_18

    .line 989
    :cond_1b
    const/4 v10, 0x0

    .line 990
    :goto_18
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 991
    .line 992
    .line 993
    move-result v1

    .line 994
    if-eqz v1, :cond_1c

    .line 995
    .line 996
    const/4 v11, 0x1

    .line 997
    goto :goto_19

    .line 998
    :cond_1c
    const/4 v11, 0x0

    .line 999
    :goto_19
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1000
    .line 1001
    .line 1002
    move-result v0

    .line 1003
    if-eqz v0, :cond_1d

    .line 1004
    .line 1005
    const/4 v12, 0x1

    .line 1006
    goto :goto_1a

    .line 1007
    :cond_1d
    const/4 v12, 0x0

    .line 1008
    :goto_1a
    invoke-direct/range {v3 .. v12}, Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;-><init>(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZZZZ)V

    .line 1009
    .line 1010
    .line 1011
    return-object v3

    .line 1012
    :pswitch_1a
    move-object v0, v1

    .line 1013
    invoke-static {v0}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1014
    .line 1015
    .line 1016
    move-result v1

    .line 1017
    const/4 v4, 0x0

    .line 1018
    :goto_1b
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 1019
    .line 1020
    .line 1021
    move-result v2

    .line 1022
    if-ge v2, v1, :cond_1f

    .line 1023
    .line 1024
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1025
    .line 1026
    .line 1027
    move-result v2

    .line 1028
    int-to-char v3, v2

    .line 1029
    const/4 v9, 0x1

    .line 1030
    if-eq v3, v9, :cond_1e

    .line 1031
    .line 1032
    invoke-static {v0, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1033
    .line 1034
    .line 1035
    goto :goto_1b

    .line 1036
    :cond_1e
    invoke-static {v0, v2}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 1037
    .line 1038
    .line 1039
    move-result v4

    .line 1040
    goto :goto_1b

    .line 1041
    :cond_1f
    invoke-static {v0, v1}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1042
    .line 1043
    .line 1044
    new-instance v0, Lcom/google/android/gms/identitycredentials/ClearRegistryResponse;

    .line 1045
    .line 1046
    invoke-direct {v0, v4}, Lcom/google/android/gms/identitycredentials/ClearRegistryResponse;-><init>(Z)V

    .line 1047
    .line 1048
    .line 1049
    return-object v0

    .line 1050
    :pswitch_1b
    move-object v0, v1

    .line 1051
    invoke-static {v0}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1052
    .line 1053
    .line 1054
    move-result v1

    .line 1055
    const/4 v4, 0x0

    .line 1056
    :goto_1c
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 1057
    .line 1058
    .line 1059
    move-result v2

    .line 1060
    if-ge v2, v1, :cond_21

    .line 1061
    .line 1062
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1063
    .line 1064
    .line 1065
    move-result v2

    .line 1066
    int-to-char v3, v2

    .line 1067
    const/4 v9, 0x1

    .line 1068
    if-eq v3, v9, :cond_20

    .line 1069
    .line 1070
    invoke-static {v0, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1071
    .line 1072
    .line 1073
    goto :goto_1c

    .line 1074
    :cond_20
    invoke-static {v0, v2}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 1075
    .line 1076
    .line 1077
    move-result v4

    .line 1078
    goto :goto_1c

    .line 1079
    :cond_21
    invoke-static {v0, v1}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1080
    .line 1081
    .line 1082
    new-instance v0, Lcom/google/android/gms/identitycredentials/ClearExportResponse;

    .line 1083
    .line 1084
    invoke-direct {v0, v4}, Lcom/google/android/gms/identitycredentials/ClearExportResponse;-><init>(Z)V

    .line 1085
    .line 1086
    .line 1087
    return-object v0

    .line 1088
    :pswitch_1c
    move-object v0, v1

    .line 1089
    invoke-static {v0}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1090
    .line 1091
    .line 1092
    move-result v1

    .line 1093
    :goto_1d
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 1094
    .line 1095
    .line 1096
    move-result v2

    .line 1097
    if-ge v2, v1, :cond_22

    .line 1098
    .line 1099
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1100
    .line 1101
    .line 1102
    move-result v2

    .line 1103
    invoke-static {v0, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1104
    .line 1105
    .line 1106
    goto :goto_1d

    .line 1107
    :cond_22
    invoke-static {v0, v1}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1108
    .line 1109
    .line 1110
    new-instance v0, Lcom/google/android/gms/identitycredentials/ClearCredentialStateResponse;

    .line 1111
    .line 1112
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1113
    .line 1114
    .line 1115
    return-object v0

    .line 1116
    :pswitch_1d
    move-object v0, v1

    .line 1117
    invoke-static {v0}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1118
    .line 1119
    .line 1120
    move-result v1

    .line 1121
    const/4 v4, 0x0

    .line 1122
    :goto_1e
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 1123
    .line 1124
    .line 1125
    move-result v2

    .line 1126
    if-ge v2, v1, :cond_24

    .line 1127
    .line 1128
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1129
    .line 1130
    .line 1131
    move-result v2

    .line 1132
    int-to-char v3, v2

    .line 1133
    const/4 v9, 0x1

    .line 1134
    if-eq v3, v9, :cond_23

    .line 1135
    .line 1136
    invoke-static {v0, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1137
    .line 1138
    .line 1139
    goto :goto_1e

    .line 1140
    :cond_23
    invoke-static {v0, v2}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 1141
    .line 1142
    .line 1143
    move-result v4

    .line 1144
    goto :goto_1e

    .line 1145
    :cond_24
    invoke-static {v0, v1}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1146
    .line 1147
    .line 1148
    new-instance v0, Lcom/google/android/gms/identitycredentials/ClearCreationOptionsResponse;

    .line 1149
    .line 1150
    invoke-direct {v0, v4}, Lcom/google/android/gms/identitycredentials/ClearCreationOptionsResponse;-><init>(Z)V

    .line 1151
    .line 1152
    .line 1153
    return-object v0

    .line 1154
    :pswitch_1e
    move-object v0, v1

    .line 1155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1156
    .line 1157
    .line 1158
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v0

    .line 1162
    invoke-static {v0}, Lorg/xplatform/favorites/impl/presentation/screen/classic/models/ClassicFavoriteTab;->valueOf(Ljava/lang/String;)Lorg/xplatform/favorites/impl/presentation/screen/classic/models/ClassicFavoriteTab;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v0

    .line 1166
    return-object v0

    .line 1167
    :pswitch_1f
    move-object v0, v1

    .line 1168
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1169
    .line 1170
    .line 1171
    new-instance v1, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;

    .line 1172
    .line 1173
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1174
    .line 1175
    .line 1176
    move-result v2

    .line 1177
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v0

    .line 1181
    invoke-direct {v1, v2, v0}, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;-><init>(ILjava/lang/String;)V

    .line 1182
    .line 1183
    .line 1184
    return-object v1

    .line 1185
    :pswitch_20
    move-object v0, v1

    .line 1186
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1187
    .line 1188
    .line 1189
    new-instance v1, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;

    .line 1190
    .line 1191
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1192
    .line 1193
    .line 1194
    move-result v2

    .line 1195
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v0

    .line 1199
    invoke-direct {v1, v2, v0}, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;-><init>(ILjava/lang/String;)V

    .line 1200
    .line 1201
    .line 1202
    return-object v1

    .line 1203
    :pswitch_21
    move-object v0, v1

    .line 1204
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1205
    .line 1206
    .line 1207
    new-instance v1, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;

    .line 1208
    .line 1209
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1210
    .line 1211
    .line 1212
    move-result v2

    .line 1213
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v0

    .line 1217
    invoke-direct {v1, v2, v0}, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;-><init>(ILjava/lang/String;)V

    .line 1218
    .line 1219
    .line 1220
    return-object v1

    .line 1221
    :pswitch_22
    move-object v0, v1

    .line 1222
    move v9, v5

    .line 1223
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1224
    .line 1225
    .line 1226
    new-instance v1, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;

    .line 1227
    .line 1228
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1229
    .line 1230
    .line 1231
    move-result v2

    .line 1232
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v3

    .line 1236
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1237
    .line 1238
    .line 1239
    move-result v0

    .line 1240
    if-eqz v0, :cond_25

    .line 1241
    .line 1242
    move v4, v9

    .line 1243
    goto :goto_1f

    .line 1244
    :cond_25
    const/4 v4, 0x0

    .line 1245
    :goto_1f
    invoke-direct {v1, v3, v2, v4}, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;-><init>(Ljava/lang/String;IZ)V

    .line 1246
    .line 1247
    .line 1248
    return-object v1

    .line 1249
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
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

    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget-byte p0, p0, La/okc;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweek/CyberCalendarDaysOfWeekParams;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Lorg/xplatform/cyber/game/core/game_screen/presentation/bottomsheet/CyberBottomSheetParams;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Lorg/xplatform/cyber/section/api/activeteams/CyberActiveTeamsParams;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    new-array p0, p1, [Lorg/xplatform/cyber/game/core/presentation/action/CyberActionDialogParams;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    new-array p0, p1, [Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    new-array p0, p1, [Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_6
    new-array p0, p1, [Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_7
    new-array p0, p1, [Lorg/xplatform/cyber/game/counterstrike/api/Cs2GameScreenParams;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_8
    new-array p0, p1, [Lcom/google/android/gms/identitycredentials/CredentialTransferCapabilities;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_9
    new-array p0, p1, [Lcom/google/android/gms/identitycredentials/CredentialOption;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_a
    new-array p0, p1, [Lcom/google/android/gms/identitycredentials/CreateCredentialResponse;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_b
    new-array p0, p1, [Lcom/google/android/gms/identitycredentials/CreateCredentialHandle;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_c
    new-array p0, p1, [Lorg/xplatform/coupon/impl/coupon/presentation/models/CouponTypeUiModel;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_d
    new-array p0, p1, [Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_e
    new-array p0, p1, [Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_f
    new-array p0, p1, [Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_10
    new-array p0, p1, [Lcom/google/firebase/perf/metrics/Counter;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_11
    new-array p0, p1, [Lorg/xplatform/make_bet/impl/presentation/model/CoefUiModel;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_12
    new-array p0, p1, [Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_13
    new-array p0, p1, [Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_14
    new-array p0, p1, [Lcom/google/android/gms/identitycredentials/ClearRegistryResponse;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_15
    new-array p0, p1, [Lcom/google/android/gms/identitycredentials/ClearExportResponse;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_16
    new-array p0, p1, [Lcom/google/android/gms/identitycredentials/ClearCredentialStateResponse;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_17
    new-array p0, p1, [Lcom/google/android/gms/identitycredentials/ClearCreationOptionsResponse;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_18
    new-array p0, p1, [Lorg/xplatform/favorites/impl/presentation/screen/classic/models/ClassicFavoriteTab;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_19
    new-array p0, p1, [Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_1a
    new-array p0, p1, [Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_1b
    new-array p0, p1, [Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_1c
    new-array p0, p1, [Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;

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
