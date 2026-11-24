.class public final La/d860;
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
    iput-byte p1, p0, La/d860;->a:B

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
    iget-byte v0, v0, La/d860;->a:B

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
    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    .line 17
    .line 18
    .line 19
    move-result-wide v6

    .line 20
    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    .line 21
    .line 22
    .line 23
    move-result-wide v8

    .line 24
    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    .line 25
    .line 26
    .line 27
    move-result-wide v10

    .line 28
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v12

    .line 32
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    new-instance v13, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v13, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 39
    .line 40
    .line 41
    :goto_0
    if-eq v3, v0, :cond_0

    .line 42
    .line 43
    sget-object v2, Lorg/xplatform/referral/api/domain/model/ReferralUser;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 44
    .line 45
    invoke-interface {v2, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    add-int/lit8 v3, v3, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    new-instance v5, Lorg/xplatform/referral/api/domain/model/ReferralNetworkInfo;

    .line 56
    .line 57
    invoke-direct/range {v5 .. v13}, Lorg/xplatform/referral/api/domain/model/ReferralNetworkInfo;-><init>(DDDLjava/lang/String;Ljava/util/List;)V

    .line 58
    .line 59
    .line 60
    return-object v5

    .line 61
    :pswitch_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    new-instance v6, Lorg/xplatform/cyber/game/rainbow/api/RainbowPostGameScreenParams;

    .line 65
    .line 66
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 71
    .line 72
    .line 73
    move-result-wide v8

    .line 74
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 75
    .line 76
    .line 77
    move-result v10

    .line 78
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 79
    .line 80
    .line 81
    move-result v11

    .line 82
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v12

    .line 86
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v13

    .line 90
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v14

    .line 94
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v15

    .line 98
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 99
    .line 100
    .line 101
    move-result-wide v16

    .line 102
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v18

    .line 106
    invoke-direct/range {v6 .. v18}, Lorg/xplatform/cyber/game/rainbow/api/RainbowPostGameScreenParams;-><init>(Ljava/lang/String;JIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    .line 107
    .line 108
    .line 109
    return-object v6

    .line 110
    :pswitch_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    new-instance v7, Lorg/xplatform/cyber/game/rainbow/api/RainbowGameScreenParams;

    .line 114
    .line 115
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 116
    .line 117
    .line 118
    move-result-wide v9

    .line 119
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_1

    .line 124
    .line 125
    move/from16 v21, v4

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_1
    move/from16 v21, v3

    .line 129
    .line 130
    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 131
    .line 132
    .line 133
    move-result-wide v11

    .line 134
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 135
    .line 136
    .line 137
    move-result-wide v13

    .line 138
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 139
    .line 140
    .line 141
    move-result-wide v15

    .line 142
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-eqz v0, :cond_2

    .line 147
    .line 148
    move/from16 v22, v4

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_2
    move/from16 v22, v3

    .line 152
    .line 153
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v20

    .line 157
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 158
    .line 159
    .line 160
    move-result-wide v17

    .line 161
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 162
    .line 163
    .line 164
    move-result v8

    .line 165
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-static {v0}, La/k1g;->valueOf(Ljava/lang/String;)La/k1g;

    .line 170
    .line 171
    .line 172
    move-result-object v19

    .line 173
    invoke-direct/range {v7 .. v22}, Lorg/xplatform/cyber/game/rainbow/api/RainbowGameScreenParams;-><init>(IJJJJJLa/k1g;Ljava/lang/String;ZZ)V

    .line 174
    .line 175
    .line 176
    return-object v7

    .line 177
    :pswitch_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    check-cast v0, La/swp0;

    .line 185
    .line 186
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    new-instance v4, Ljava/util/ArrayList;

    .line 191
    .line 192
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 193
    .line 194
    .line 195
    :goto_3
    if-eq v3, v2, :cond_3

    .line 196
    .line 197
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    invoke-static {v5}, La/obk0;->valueOf(Ljava/lang/String;)La/obk0;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    add-int/lit8 v3, v3, 0x1

    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_3
    new-instance v1, Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/send/params/QrSendConfirmationSmsParams;

    .line 212
    .line 213
    invoke-direct {v1, v0, v4}, Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/send/params/QrSendConfirmationSmsParams;-><init>(La/swp0;Ljava/util/List;)V

    .line 214
    .line 215
    .line 216
    return-object v1

    .line 217
    :pswitch_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    new-instance v0, Lorg/xplatform/authqr/impl/qr/presentation/confirmation/mail/send/params/QrSendConfirmationMailParams;

    .line 221
    .line 222
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    check-cast v1, La/swp0;

    .line 227
    .line 228
    invoke-direct {v0, v1}, Lorg/xplatform/authqr/impl/qr/presentation/confirmation/mail/send/params/QrSendConfirmationMailParams;-><init>(La/swp0;)V

    .line 229
    .line 230
    .line 231
    return-object v0

    .line 232
    :pswitch_4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    new-instance v0, Lorg/xplatform/authqr/impl/qr/presentation/confirmation/secret_question/params/QrConfirmSecretQuestionFragmentScreenParams;

    .line 236
    .line 237
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    check-cast v3, La/swp0;

    .line 246
    .line 247
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    invoke-direct {v0, v3, v2, v1}, Lorg/xplatform/authqr/impl/qr/presentation/confirmation/secret_question/params/QrConfirmSecretQuestionFragmentScreenParams;-><init>(La/swp0;Ljava/lang/String;Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    return-object v0

    .line 255
    :pswitch_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    move-object v5, v0

    .line 263
    check-cast v5, La/swp0;

    .line 264
    .line 265
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 266
    .line 267
    .line 268
    move-result-wide v6

    .line 269
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-static {v0}, La/yed0;->valueOf(Ljava/lang/String;)La/yed0;

    .line 274
    .line 275
    .line 276
    move-result-object v8

    .line 277
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 278
    .line 279
    .line 280
    move-result v0

    .line 281
    new-instance v9, Ljava/util/ArrayList;

    .line 282
    .line 283
    invoke-direct {v9, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 284
    .line 285
    .line 286
    :goto_4
    if-eq v3, v0, :cond_4

    .line 287
    .line 288
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v2

    .line 292
    invoke-static {v2}, La/obk0;->valueOf(Ljava/lang/String;)La/obk0;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    add-int/lit8 v3, v3, 0x1

    .line 300
    .line 301
    goto :goto_4

    .line 302
    :cond_4
    new-instance v4, Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/check/params/QrCheckCodeBySmsParams;

    .line 303
    .line 304
    invoke-direct/range {v4 .. v9}, Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/check/params/QrCheckCodeBySmsParams;-><init>(La/swp0;JLa/yed0;Ljava/util/List;)V

    .line 305
    .line 306
    .line 307
    return-object v4

    .line 308
    :pswitch_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    new-instance v0, Lorg/xplatform/authqr/impl/qr/presentation/confirmation/mail/check/params/QrCheckCodeByMailParams;

    .line 312
    .line 313
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    check-cast v2, La/swp0;

    .line 318
    .line 319
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 320
    .line 321
    .line 322
    move-result-wide v3

    .line 323
    invoke-direct {v0, v2, v3, v4}, Lorg/xplatform/authqr/impl/qr/presentation/confirmation/mail/check/params/QrCheckCodeByMailParams;-><init>(La/swp0;J)V

    .line 324
    .line 325
    .line 326
    return-object v0

    .line 327
    :pswitch_7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    new-instance v5, Lorg/xplatform/aggregator/impl/category/presentation/models/ProviderUIModel;

    .line 331
    .line 332
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v6

    .line 336
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v7

    .line 340
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 341
    .line 342
    .line 343
    move-result v0

    .line 344
    if-eqz v0, :cond_5

    .line 345
    .line 346
    move v8, v4

    .line 347
    goto :goto_5

    .line 348
    :cond_5
    move v8, v3

    .line 349
    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v9

    .line 353
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v10

    .line 357
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v11

    .line 361
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 362
    .line 363
    .line 364
    move-result v0

    .line 365
    if-eqz v0, :cond_6

    .line 366
    .line 367
    move v12, v4

    .line 368
    goto :goto_6

    .line 369
    :cond_6
    move v12, v3

    .line 370
    :goto_6
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    invoke-static {v0}, La/rh1;->valueOf(Ljava/lang/String;)La/rh1;

    .line 375
    .line 376
    .line 377
    move-result-object v13

    .line 378
    invoke-direct/range {v5 .. v13}, Lorg/xplatform/aggregator/impl/category/presentation/models/ProviderUIModel;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLa/rh1;)V

    .line 379
    .line 380
    .line 381
    return-object v5

    .line 382
    :pswitch_8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    .line 384
    .line 385
    new-instance v0, Lorg/xplatform/aggregator/impl/category/presentation/models/PromotedCategoryUiModel;

    .line 386
    .line 387
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v5

    .line 395
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 396
    .line 397
    .line 398
    move-result v6

    .line 399
    if-eqz v6, :cond_7

    .line 400
    .line 401
    move v3, v4

    .line 402
    :cond_7
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v1

    .line 406
    invoke-direct {v0, v2, v5, v1, v3}, Lorg/xplatform/aggregator/impl/category/presentation/models/PromotedCategoryUiModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 407
    .line 408
    .line 409
    return-object v0

    .line 410
    :pswitch_9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    new-instance v6, Lorg/xplatform/makebet_promocodes/api/presentation/models/PromoCodeInfoUiModel;

    .line 414
    .line 415
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v10

    .line 419
    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    .line 420
    .line 421
    .line 422
    move-result-wide v7

    .line 423
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v11

    .line 427
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v12

    .line 431
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 432
    .line 433
    .line 434
    move-result v9

    .line 435
    invoke-direct/range {v6 .. v12}, Lorg/xplatform/makebet_promocodes/api/presentation/models/PromoCodeInfoUiModel;-><init>(DILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    return-object v6

    .line 439
    :pswitch_a
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 440
    .line 441
    .line 442
    new-instance v0, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelTitle;

    .line 443
    .line 444
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 445
    .line 446
    .line 447
    move-result v1

    .line 448
    invoke-direct {v0, v1}, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelTitle;-><init>(I)V

    .line 449
    .line 450
    .line 451
    return-object v0

    .line 452
    :pswitch_b
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 456
    .line 457
    .line 458
    move-result v0

    .line 459
    if-nez v0, :cond_8

    .line 460
    .line 461
    move-object v4, v2

    .line 462
    goto :goto_8

    .line 463
    :cond_8
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 464
    .line 465
    .line 466
    move-result v0

    .line 467
    new-instance v4, Ljava/util/ArrayList;

    .line 468
    .line 469
    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 470
    .line 471
    .line 472
    move v5, v3

    .line 473
    :goto_7
    if-eq v5, v0, :cond_9

    .line 474
    .line 475
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 476
    .line 477
    .line 478
    move-result-wide v6

    .line 479
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 480
    .line 481
    .line 482
    move-result-object v6

    .line 483
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 484
    .line 485
    .line 486
    add-int/lit8 v5, v5, 0x1

    .line 487
    .line 488
    goto :goto_7

    .line 489
    :cond_9
    :goto_8
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 490
    .line 491
    .line 492
    move-result v0

    .line 493
    if-nez v0, :cond_a

    .line 494
    .line 495
    goto :goto_a

    .line 496
    :cond_a
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 497
    .line 498
    .line 499
    move-result v0

    .line 500
    new-instance v2, Ljava/util/ArrayList;

    .line 501
    .line 502
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 503
    .line 504
    .line 505
    :goto_9
    if-eq v3, v0, :cond_b

    .line 506
    .line 507
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 508
    .line 509
    .line 510
    move-result-wide v5

    .line 511
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 512
    .line 513
    .line 514
    move-result-object v5

    .line 515
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 516
    .line 517
    .line 518
    add-int/lit8 v3, v3, 0x1

    .line 519
    .line 520
    goto :goto_9

    .line 521
    :cond_b
    :goto_a
    new-instance v0, Lorg/xplatform/betting/core/zip/model/zip/PlayersDuelZip;

    .line 522
    .line 523
    invoke-direct {v0, v4, v2}, Lorg/xplatform/betting/core/zip/model/zip/PlayersDuelZip;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 524
    .line 525
    .line 526
    return-object v0

    .line 527
    :pswitch_c
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 528
    .line 529
    .line 530
    new-instance v5, Lorg/xplatform/playersduel/impl/presentation/players_duel/screen/PlayersDuelParams;

    .line 531
    .line 532
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 533
    .line 534
    .line 535
    move-result-wide v6

    .line 536
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 537
    .line 538
    .line 539
    move-result-wide v8

    .line 540
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 541
    .line 542
    .line 543
    move-result v0

    .line 544
    if-eqz v0, :cond_c

    .line 545
    .line 546
    move v12, v4

    .line 547
    goto :goto_b

    .line 548
    :cond_c
    move v12, v3

    .line 549
    :goto_b
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 550
    .line 551
    .line 552
    move-result-wide v10

    .line 553
    invoke-direct/range {v5 .. v12}, Lorg/xplatform/playersduel/impl/presentation/players_duel/screen/PlayersDuelParams;-><init>(JJJZ)V

    .line 554
    .line 555
    .line 556
    return-object v5

    .line 557
    :pswitch_d
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 558
    .line 559
    .line 560
    new-instance v0, Lorg/xplatform/cyber/section/api/presentation/player_transfers/PlayerTransfersScreenParams;

    .line 561
    .line 562
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 563
    .line 564
    .line 565
    move-result-wide v2

    .line 566
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object v1

    .line 570
    invoke-direct {v0, v2, v3, v1}, Lorg/xplatform/cyber/section/api/presentation/player_transfers/PlayerTransfersScreenParams;-><init>(JLjava/lang/String;)V

    .line 571
    .line 572
    .line 573
    return-object v0

    .line 574
    :pswitch_e
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 575
    .line 576
    .line 577
    move v0, v4

    .line 578
    new-instance v4, Lorg/xplatform/playersduel/api/presentation/PlayerDuelParams;

    .line 579
    .line 580
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 581
    .line 582
    .line 583
    move-result-wide v5

    .line 584
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 585
    .line 586
    .line 587
    move-result v2

    .line 588
    if-eqz v2, :cond_d

    .line 589
    .line 590
    move v7, v0

    .line 591
    goto :goto_c

    .line 592
    :cond_d
    move v7, v3

    .line 593
    :goto_c
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 594
    .line 595
    .line 596
    move-result-wide v8

    .line 597
    invoke-direct/range {v4 .. v9}, Lorg/xplatform/playersduel/api/presentation/PlayerDuelParams;-><init>(JZJ)V

    .line 598
    .line 599
    .line 600
    return-object v4

    .line 601
    :pswitch_f
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 602
    .line 603
    .line 604
    new-instance v0, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/PhoneStateModel;

    .line 605
    .line 606
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 607
    .line 608
    .line 609
    move-result-object v2

    .line 610
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 611
    .line 612
    .line 613
    move-result-object v3

    .line 614
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v1

    .line 618
    invoke-direct {v0, v2, v3, v1}, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/PhoneStateModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 619
    .line 620
    .line 621
    return-object v0

    .line 622
    :pswitch_10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 623
    .line 624
    .line 625
    new-instance v0, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/PhoneStateModel;

    .line 626
    .line 627
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 628
    .line 629
    .line 630
    move-result-object v3

    .line 631
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 632
    .line 633
    .line 634
    move-result-object v4

    .line 635
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 636
    .line 637
    .line 638
    move-result-object v5

    .line 639
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 640
    .line 641
    .line 642
    move-result v6

    .line 643
    if-nez v6, :cond_e

    .line 644
    .line 645
    goto :goto_d

    .line 646
    :cond_e
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 647
    .line 648
    .line 649
    move-result v1

    .line 650
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 651
    .line 652
    .line 653
    move-result-object v2

    .line 654
    :goto_d
    invoke-direct {v0, v3, v4, v5, v2}, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/PhoneStateModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 655
    .line 656
    .line 657
    return-object v0

    .line 658
    :pswitch_11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 659
    .line 660
    .line 661
    new-instance v0, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/PhoneStateModel;

    .line 662
    .line 663
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 664
    .line 665
    .line 666
    move-result-object v3

    .line 667
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v4

    .line 671
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 672
    .line 673
    .line 674
    move-result-object v5

    .line 675
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 676
    .line 677
    .line 678
    move-result v6

    .line 679
    if-nez v6, :cond_f

    .line 680
    .line 681
    goto :goto_e

    .line 682
    :cond_f
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 683
    .line 684
    .line 685
    move-result v1

    .line 686
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 687
    .line 688
    .line 689
    move-result-object v2

    .line 690
    :goto_e
    invoke-direct {v0, v3, v4, v5, v2}, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/PhoneStateModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 691
    .line 692
    .line 693
    return-object v0

    .line 694
    :pswitch_12
    move v0, v4

    .line 695
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 696
    .line 697
    .line 698
    new-instance v2, Lorg/xplatform/personal/impl/presentation/documentchoice/models/PersonalDocumentUiModel;

    .line 699
    .line 700
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 701
    .line 702
    .line 703
    move-result v4

    .line 704
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 705
    .line 706
    .line 707
    move-result-object v5

    .line 708
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 709
    .line 710
    .line 711
    move-result v6

    .line 712
    if-eqz v6, :cond_10

    .line 713
    .line 714
    move v3, v0

    .line 715
    :cond_10
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 716
    .line 717
    .line 718
    move-result v0

    .line 719
    invoke-direct {v2, v4, v0, v5, v3}, Lorg/xplatform/personal/impl/presentation/documentchoice/models/PersonalDocumentUiModel;-><init>(IILjava/lang/String;Z)V

    .line 720
    .line 721
    .line 722
    return-object v2

    .line 723
    :pswitch_13
    move v0, v4

    .line 724
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 725
    .line 726
    .line 727
    new-instance v2, Lorg/xplatform/personal/impl/presentation/documentchoice/models/PersonalDocumentRedesignUiModel;

    .line 728
    .line 729
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 730
    .line 731
    .line 732
    move-result v4

    .line 733
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 734
    .line 735
    .line 736
    move-result-object v5

    .line 737
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 738
    .line 739
    .line 740
    move-result v6

    .line 741
    if-eqz v6, :cond_11

    .line 742
    .line 743
    move v3, v0

    .line 744
    :cond_11
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 745
    .line 746
    .line 747
    move-result-object v0

    .line 748
    invoke-static {v0}, La/d4d;->valueOf(Ljava/lang/String;)La/d4d;

    .line 749
    .line 750
    .line 751
    move-result-object v0

    .line 752
    invoke-direct {v2, v4, v5, v3, v0}, Lorg/xplatform/personal/impl/presentation/documentchoice/models/PersonalDocumentRedesignUiModel;-><init>(ILjava/lang/String;ZLa/d4d;)V

    .line 753
    .line 754
    .line 755
    return-object v2

    .line 756
    :pswitch_14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 757
    .line 758
    .line 759
    sget-object v0, Lorg/xplatform/feed/notifictation/presentation/models/SubscriptionPeriodUiModel;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 760
    .line 761
    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    move-result-object v0

    .line 765
    check-cast v0, Lorg/xplatform/feed/notifictation/presentation/models/SubscriptionPeriodUiModel;

    .line 766
    .line 767
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 768
    .line 769
    .line 770
    move-result v2

    .line 771
    new-instance v4, Ljava/util/ArrayList;

    .line 772
    .line 773
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 774
    .line 775
    .line 776
    :goto_f
    if-eq v3, v2, :cond_12

    .line 777
    .line 778
    sget-object v5, Lorg/xplatform/feed/notifictation/presentation/models/SubscriptionEventSettingsUiModel;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 779
    .line 780
    invoke-interface {v5, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 781
    .line 782
    .line 783
    move-result-object v5

    .line 784
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 785
    .line 786
    .line 787
    add-int/lit8 v3, v3, 0x1

    .line 788
    .line 789
    goto :goto_f

    .line 790
    :cond_12
    new-instance v1, Lorg/xplatform/feed/notifictation/presentation/models/PeriodSubscriptionSettingsScreenUiModel;

    .line 791
    .line 792
    invoke-direct {v1, v0, v4}, Lorg/xplatform/feed/notifictation/presentation/models/PeriodSubscriptionSettingsScreenUiModel;-><init>(Lorg/xplatform/feed/notifictation/presentation/models/SubscriptionPeriodUiModel;Ljava/util/ArrayList;)V

    .line 793
    .line 794
    .line 795
    return-object v1

    .line 796
    :pswitch_15
    new-instance v0, Lcom/google/firebase/perf/session/PerfSession;

    .line 797
    .line 798
    invoke-direct {v0, v1}, Lcom/google/firebase/perf/session/PerfSession;-><init>(Landroid/os/Parcel;)V

    .line 799
    .line 800
    .line 801
    return-object v0

    .line 802
    :pswitch_16
    move v0, v4

    .line 803
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 804
    .line 805
    .line 806
    move-result v3

    .line 807
    :goto_10
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 808
    .line 809
    .line 810
    move-result v4

    .line 811
    if-ge v4, v3, :cond_14

    .line 812
    .line 813
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 814
    .line 815
    .line 816
    move-result v4

    .line 817
    int-to-char v5, v4

    .line 818
    if-eq v5, v0, :cond_13

    .line 819
    .line 820
    invoke-static {v1, v4}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 821
    .line 822
    .line 823
    goto :goto_10

    .line 824
    :cond_13
    sget-object v2, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 825
    .line 826
    invoke-static {v1, v4, v2}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 827
    .line 828
    .line 829
    move-result-object v2

    .line 830
    check-cast v2, Landroid/app/PendingIntent;

    .line 831
    .line 832
    goto :goto_10

    .line 833
    :cond_14
    invoke-static {v1, v3}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 834
    .line 835
    .line 836
    new-instance v0, Lcom/google/android/gms/identitycredentials/PendingImportCredentialsHandle;

    .line 837
    .line 838
    invoke-direct {v0, v2}, Lcom/google/android/gms/identitycredentials/PendingImportCredentialsHandle;-><init>(Landroid/app/PendingIntent;)V

    .line 839
    .line 840
    .line 841
    return-object v0

    .line 842
    :pswitch_17
    move v0, v4

    .line 843
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 844
    .line 845
    .line 846
    move-result v3

    .line 847
    :goto_11
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 848
    .line 849
    .line 850
    move-result v4

    .line 851
    if-ge v4, v3, :cond_16

    .line 852
    .line 853
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 854
    .line 855
    .line 856
    move-result v4

    .line 857
    int-to-char v5, v4

    .line 858
    if-eq v5, v0, :cond_15

    .line 859
    .line 860
    invoke-static {v1, v4}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 861
    .line 862
    .line 863
    goto :goto_11

    .line 864
    :cond_15
    sget-object v2, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 865
    .line 866
    invoke-static {v1, v4, v2}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 867
    .line 868
    .line 869
    move-result-object v2

    .line 870
    check-cast v2, Landroid/app/PendingIntent;

    .line 871
    .line 872
    goto :goto_11

    .line 873
    :cond_16
    invoke-static {v1, v3}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 874
    .line 875
    .line 876
    new-instance v0, Lcom/google/android/gms/identitycredentials/PendingGetCredentialHandle;

    .line 877
    .line 878
    invoke-direct {v0, v2}, Lcom/google/android/gms/identitycredentials/PendingGetCredentialHandle;-><init>(Landroid/app/PendingIntent;)V

    .line 879
    .line 880
    .line 881
    return-object v0

    .line 882
    :pswitch_18
    move v0, v4

    .line 883
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 884
    .line 885
    .line 886
    new-instance v2, Lorg/xplatform/rules/impl/presentation/models/PaymentInfoParams;

    .line 887
    .line 888
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 889
    .line 890
    .line 891
    move-result v4

    .line 892
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 893
    .line 894
    .line 895
    move-result-object v5

    .line 896
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 897
    .line 898
    .line 899
    move-result v6

    .line 900
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 901
    .line 902
    .line 903
    move-result v1

    .line 904
    if-eqz v1, :cond_17

    .line 905
    .line 906
    move v3, v0

    .line 907
    :cond_17
    invoke-direct {v2, v4, v6, v5, v3}, Lorg/xplatform/rules/impl/presentation/models/PaymentInfoParams;-><init>(IILjava/lang/String;Z)V

    .line 908
    .line 909
    .line 910
    return-object v2

    .line 911
    :pswitch_19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 912
    .line 913
    .line 914
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 915
    .line 916
    .line 917
    move-result-object v8

    .line 918
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 919
    .line 920
    .line 921
    move-result-object v9

    .line 922
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 923
    .line 924
    .line 925
    move-result-object v10

    .line 926
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 927
    .line 928
    .line 929
    move-result-object v11

    .line 930
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 931
    .line 932
    .line 933
    move-result v0

    .line 934
    new-instance v12, Ljava/util/ArrayList;

    .line 935
    .line 936
    invoke-direct {v12, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 937
    .line 938
    .line 939
    :goto_12
    if-eq v3, v0, :cond_18

    .line 940
    .line 941
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 942
    .line 943
    .line 944
    move-result-wide v4

    .line 945
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 946
    .line 947
    .line 948
    move-result-object v2

    .line 949
    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 950
    .line 951
    .line 952
    add-int/lit8 v3, v3, 0x1

    .line 953
    .line 954
    goto :goto_12

    .line 955
    :cond_18
    new-instance v7, Lorg/xplatform/banners/api/domain/models/PartnersTeamInfoBannerModel;

    .line 956
    .line 957
    invoke-direct/range {v7 .. v12}, Lorg/xplatform/banners/api/domain/models/PartnersTeamInfoBannerModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 958
    .line 959
    .line 960
    return-object v7

    .line 961
    :pswitch_1a
    new-instance v0, Landroidx/versionedparcelable/ParcelImpl;

    .line 962
    .line 963
    invoke-direct {v0, v1}, Landroidx/versionedparcelable/ParcelImpl;-><init>(Landroid/os/Parcel;)V

    .line 964
    .line 965
    .line 966
    return-object v0

    .line 967
    :pswitch_1b
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 968
    .line 969
    .line 970
    new-instance v1, Lorg/xplatform/bet_history/edit_coupon/presentation/model/OptionSelectBottomSheetDialogModel;

    .line 971
    .line 972
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 973
    .line 974
    .line 975
    move-result-object v3

    .line 976
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 977
    .line 978
    .line 979
    move-result-object v4

    .line 980
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 981
    .line 982
    .line 983
    move-result v2

    .line 984
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 985
    .line 986
    .line 987
    move-result-object v5

    .line 988
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 989
    .line 990
    .line 991
    move-result-object v6

    .line 992
    invoke-direct/range {v1 .. v6}, Lorg/xplatform/bet_history/edit_coupon/presentation/model/OptionSelectBottomSheetDialogModel;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 993
    .line 994
    .line 995
    return-object v1

    .line 996
    :pswitch_1c
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 997
    .line 998
    .line 999
    new-instance v0, Lorg/xplatform/authenticator/impl/util/NotificationTypeInfo;

    .line 1000
    .line 1001
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v1

    .line 1005
    invoke-static {v1}, La/c860;->valueOf(Ljava/lang/String;)La/c860;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v1

    .line 1009
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v2

    .line 1013
    invoke-direct {v0, v1, v2}, Lorg/xplatform/authenticator/impl/util/NotificationTypeInfo;-><init>(La/c860;Ljava/lang/String;)V

    .line 1014
    .line 1015
    .line 1016
    return-object v0

    .line 1017
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
    iget-byte p0, p0, La/d860;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Lorg/xplatform/referral/api/domain/model/ReferralNetworkInfo;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Lorg/xplatform/cyber/game/rainbow/api/RainbowPostGameScreenParams;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Lorg/xplatform/cyber/game/rainbow/api/RainbowGameScreenParams;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/send/params/QrSendConfirmationSmsParams;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    new-array p0, p1, [Lorg/xplatform/authqr/impl/qr/presentation/confirmation/mail/send/params/QrSendConfirmationMailParams;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    new-array p0, p1, [Lorg/xplatform/authqr/impl/qr/presentation/confirmation/secret_question/params/QrConfirmSecretQuestionFragmentScreenParams;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    new-array p0, p1, [Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/check/params/QrCheckCodeBySmsParams;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_6
    new-array p0, p1, [Lorg/xplatform/authqr/impl/qr/presentation/confirmation/mail/check/params/QrCheckCodeByMailParams;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_7
    new-array p0, p1, [Lorg/xplatform/aggregator/impl/category/presentation/models/ProviderUIModel;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_8
    new-array p0, p1, [Lorg/xplatform/aggregator/impl/category/presentation/models/PromotedCategoryUiModel;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_9
    new-array p0, p1, [Lorg/xplatform/makebet_promocodes/api/presentation/models/PromoCodeInfoUiModel;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_a
    new-array p0, p1, [Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelTitle;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_b
    new-array p0, p1, [Lorg/xplatform/betting/core/zip/model/zip/PlayersDuelZip;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_c
    new-array p0, p1, [Lorg/xplatform/playersduel/impl/presentation/players_duel/screen/PlayersDuelParams;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_d
    new-array p0, p1, [Lorg/xplatform/cyber/section/api/presentation/player_transfers/PlayerTransfersScreenParams;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_e
    new-array p0, p1, [Lorg/xplatform/playersduel/api/presentation/PlayerDuelParams;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_f
    new-array p0, p1, [Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/PhoneStateModel;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_10
    new-array p0, p1, [Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/PhoneStateModel;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_11
    new-array p0, p1, [Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/PhoneStateModel;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_12
    new-array p0, p1, [Lorg/xplatform/personal/impl/presentation/documentchoice/models/PersonalDocumentUiModel;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_13
    new-array p0, p1, [Lorg/xplatform/personal/impl/presentation/documentchoice/models/PersonalDocumentRedesignUiModel;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_14
    new-array p0, p1, [Lorg/xplatform/feed/notifictation/presentation/models/PeriodSubscriptionSettingsScreenUiModel;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_15
    new-array p0, p1, [Lcom/google/firebase/perf/session/PerfSession;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_16
    new-array p0, p1, [Lcom/google/android/gms/identitycredentials/PendingImportCredentialsHandle;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_17
    new-array p0, p1, [Lcom/google/android/gms/identitycredentials/PendingGetCredentialHandle;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_18
    new-array p0, p1, [Lorg/xplatform/rules/impl/presentation/models/PaymentInfoParams;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_19
    new-array p0, p1, [Lorg/xplatform/banners/api/domain/models/PartnersTeamInfoBannerModel;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_1a
    new-array p0, p1, [Landroidx/versionedparcelable/ParcelImpl;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_1b
    new-array p0, p1, [Lorg/xplatform/bet_history/edit_coupon/presentation/model/OptionSelectBottomSheetDialogModel;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_1c
    new-array p0, p1, [Lorg/xplatform/authenticator/impl/util/NotificationTypeInfo;

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
