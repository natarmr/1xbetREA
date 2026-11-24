.class public final La/h9g;
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
    iput-byte p1, p0, La/h9g;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 56

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v0, v0, La/h9g;->a:B

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
    new-instance v0, Lorg/xplatform/betting/core/zip/model/zip/EventParams;

    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-direct {v0, v2, v1}, Lorg/xplatform/betting/core/zip/model/zip/EventParams;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move v0, v3

    .line 34
    new-instance v3, Lorg/xplatform/betting/core/zip/model/EventItem;

    .line 35
    .line 36
    move v6, v4

    .line 37
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 38
    .line 39
    .line 40
    move-result-wide v4

    .line 41
    move v7, v6

    .line 42
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    move v9, v7

    .line 47
    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    .line 48
    .line 49
    .line 50
    move-result-wide v7

    .line 51
    move v10, v9

    .line 52
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v9

    .line 56
    move v12, v10

    .line 57
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 58
    .line 59
    .line 60
    move-result-wide v10

    .line 61
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    move v13, v12

    .line 66
    if-eqz v2, :cond_0

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    move v12, v0

    .line 70
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 71
    .line 72
    .line 73
    move-result-wide v14

    .line 74
    move v2, v13

    .line 75
    move-wide v13, v14

    .line 76
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 77
    .line 78
    .line 79
    move-result-wide v15

    .line 80
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v17

    .line 84
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v18

    .line 88
    invoke-static/range {v18 .. v18}, La/lvn;->valueOf(Ljava/lang/String;)La/lvn;

    .line 89
    .line 90
    .line 91
    move-result-object v18

    .line 92
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 93
    .line 94
    .line 95
    move-result v19

    .line 96
    if-eqz v19, :cond_1

    .line 97
    .line 98
    move/from16 v19, v2

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_1
    move/from16 v19, v0

    .line 102
    .line 103
    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v20

    .line 107
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 108
    .line 109
    .line 110
    move-result-wide v21

    .line 111
    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 112
    .line 113
    .line 114
    move-result-object v23

    .line 115
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v24

    .line 119
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 120
    .line 121
    .line 122
    move-result-wide v25

    .line 123
    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 124
    .line 125
    .line 126
    move-result-object v27

    .line 127
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v28

    .line 131
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 132
    .line 133
    .line 134
    move-result-wide v29

    .line 135
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v31

    .line 139
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 140
    .line 141
    .line 142
    move-result v32

    .line 143
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v33

    .line 147
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 148
    .line 149
    .line 150
    move-result-wide v34

    .line 151
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 152
    .line 153
    .line 154
    move-result v36

    .line 155
    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    .line 156
    .line 157
    .line 158
    move-result-wide v37

    .line 159
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v39

    .line 163
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 164
    .line 165
    .line 166
    move-result v40

    .line 167
    if-eqz v40, :cond_2

    .line 168
    .line 169
    move/from16 v40, v2

    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_2
    move/from16 v40, v0

    .line 173
    .line 174
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-static {v0}, La/q4f;->valueOf(Ljava/lang/String;)La/q4f;

    .line 179
    .line 180
    .line 181
    move-result-object v41

    .line 182
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v42

    .line 186
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v43

    .line 190
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v44

    .line 194
    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    .line 195
    .line 196
    .line 197
    move-result-wide v45

    .line 198
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 199
    .line 200
    .line 201
    move-result-wide v47

    .line 202
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 203
    .line 204
    .line 205
    move-result-wide v49

    .line 206
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v51

    .line 210
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 211
    .line 212
    .line 213
    move-result v52

    .line 214
    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    .line 215
    .line 216
    .line 217
    move-result-wide v53

    .line 218
    sget-object v0, Lorg/xplatform/betting/core/zip/model/zip/EventParams;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 219
    .line 220
    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    move-object/from16 v55, v0

    .line 225
    .line 226
    check-cast v55, Lorg/xplatform/betting/core/zip/model/zip/EventParams;

    .line 227
    .line 228
    invoke-direct/range {v3 .. v55}, Lorg/xplatform/betting/core/zip/model/EventItem;-><init>(JLjava/lang/String;DLjava/lang/String;JZJJLjava/lang/String;La/lvn;ZLjava/lang/String;JLjava/util/List;Ljava/lang/String;JLjava/util/List;Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;JIDLjava/lang/String;ZLa/q4f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DJJLjava/lang/String;IDLorg/xplatform/betting/core/zip/model/zip/EventParams;)V

    .line 229
    .line 230
    .line 231
    return-object v3

    .line 232
    :pswitch_1
    move v0, v3

    .line 233
    move v2, v4

    .line 234
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    new-instance v4, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;

    .line 238
    .line 239
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 240
    .line 241
    .line 242
    move-result-wide v5

    .line 243
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 244
    .line 245
    .line 246
    move-result v3

    .line 247
    if-eqz v3, :cond_3

    .line 248
    .line 249
    move v7, v2

    .line 250
    goto :goto_3

    .line 251
    :cond_3
    move v7, v0

    .line 252
    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 253
    .line 254
    .line 255
    move-result-wide v8

    .line 256
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 257
    .line 258
    .line 259
    move-result-wide v10

    .line 260
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 261
    .line 262
    .line 263
    move-result-wide v12

    .line 264
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    invoke-static {v3}, La/grs;->valueOf(Ljava/lang/String;)La/grs;

    .line 269
    .line 270
    .line 271
    move-result-object v14

    .line 272
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 273
    .line 274
    .line 275
    move-result v3

    .line 276
    if-eqz v3, :cond_4

    .line 277
    .line 278
    move v15, v2

    .line 279
    goto :goto_4

    .line 280
    :cond_4
    move v15, v0

    .line 281
    :goto_4
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 282
    .line 283
    .line 284
    move-result v3

    .line 285
    if-eqz v3, :cond_5

    .line 286
    .line 287
    move/from16 v16, v2

    .line 288
    .line 289
    goto :goto_5

    .line 290
    :cond_5
    move/from16 v16, v0

    .line 291
    .line 292
    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v17

    .line 296
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 297
    .line 298
    .line 299
    move-result-wide v18

    .line 300
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 301
    .line 302
    .line 303
    move-result v20

    .line 304
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    invoke-static {v0}, La/k1g;->valueOf(Ljava/lang/String;)La/k1g;

    .line 309
    .line 310
    .line 311
    move-result-object v21

    .line 312
    invoke-direct/range {v4 .. v21}, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;-><init>(JZJJJLa/grs;ZZLjava/lang/String;JILa/k1g;)V

    .line 313
    .line 314
    .line 315
    return-object v4

    .line 316
    :pswitch_2
    move v6, v4

    .line 317
    new-instance v0, Lcom/github/mikephil/charting/data/Entry;

    .line 318
    .line 319
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 320
    .line 321
    .line 322
    const/4 v3, 0x0

    .line 323
    iput v3, v0, Lcom/github/mikephil/charting/data/Entry;->a:F

    .line 324
    .line 325
    iput-object v2, v0, Lcom/github/mikephil/charting/data/Entry;->b:Landroid/os/Parcelable;

    .line 326
    .line 327
    iput v3, v0, Lcom/github/mikephil/charting/data/Entry;->c:F

    .line 328
    .line 329
    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    .line 330
    .line 331
    .line 332
    move-result v2

    .line 333
    iput v2, v0, Lcom/github/mikephil/charting/data/Entry;->c:F

    .line 334
    .line 335
    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    .line 336
    .line 337
    .line 338
    move-result v2

    .line 339
    iput v2, v0, Lcom/github/mikephil/charting/data/Entry;->a:F

    .line 340
    .line 341
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 342
    .line 343
    .line 344
    move-result v2

    .line 345
    if-ne v2, v6, :cond_6

    .line 346
    .line 347
    const-class v2, Ljava/lang/Object;

    .line 348
    .line 349
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    iput-object v1, v0, Lcom/github/mikephil/charting/data/Entry;->b:Landroid/os/Parcelable;

    .line 358
    .line 359
    :cond_6
    return-object v0

    .line 360
    :pswitch_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    invoke-static {v0}, Lorg/xplatform/personal/impl/presentation/edit_tj/models/EditProfileTjItemEnum;->valueOf(Ljava/lang/String;)Lorg/xplatform/personal/impl/presentation/edit_tj/models/EditProfileTjItemEnum;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    return-object v0

    .line 372
    :pswitch_4
    new-instance v0, Landroidx/media3/common/DrmInitData;

    .line 373
    .line 374
    invoke-direct {v0, v1}, Landroidx/media3/common/DrmInitData;-><init>(Landroid/os/Parcel;)V

    .line 375
    .line 376
    .line 377
    return-object v0

    .line 378
    :pswitch_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 379
    .line 380
    .line 381
    new-instance v0, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/DocumentStateModel;

    .line 382
    .line 383
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 384
    .line 385
    .line 386
    move-result v2

    .line 387
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v1

    .line 391
    invoke-direct {v0, v2, v1}, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/DocumentStateModel;-><init>(ILjava/lang/String;)V

    .line 392
    .line 393
    .line 394
    return-object v0

    .line 395
    :pswitch_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 396
    .line 397
    .line 398
    new-instance v0, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/DocumentStateModel;

    .line 399
    .line 400
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 401
    .line 402
    .line 403
    move-result v2

    .line 404
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    invoke-direct {v0, v2, v1}, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/DocumentStateModel;-><init>(ILjava/lang/String;)V

    .line 409
    .line 410
    .line 411
    return-object v0

    .line 412
    :pswitch_7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 413
    .line 414
    .line 415
    new-instance v0, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/DocumentStateModel;

    .line 416
    .line 417
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 418
    .line 419
    .line 420
    move-result v2

    .line 421
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    invoke-direct {v0, v2, v1}, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/DocumentStateModel;-><init>(ILjava/lang/String;)V

    .line 426
    .line 427
    .line 428
    return-object v0

    .line 429
    :pswitch_8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 430
    .line 431
    .line 432
    new-instance v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineListParams;

    .line 433
    .line 434
    const-class v2, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineListParams;

    .line 435
    .line 436
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 437
    .line 438
    .line 439
    move-result-object v2

    .line 440
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    check-cast v1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 445
    .line 446
    invoke-direct {v0, v1}, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineListParams;-><init>(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)V

    .line 447
    .line 448
    .line 449
    return-object v0

    .line 450
    :pswitch_9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    new-instance v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 454
    .line 455
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 456
    .line 457
    .line 458
    move-result-wide v2

    .line 459
    const-class v4, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 460
    .line 461
    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 462
    .line 463
    .line 464
    move-result-object v4

    .line 465
    invoke-virtual {v1, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    check-cast v1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 470
    .line 471
    invoke-direct {v0, v2, v3, v1}, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;-><init>(JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)V

    .line 472
    .line 473
    .line 474
    return-object v0

    .line 475
    :pswitch_a
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 476
    .line 477
    .line 478
    new-instance v4, Lorg/xplatform/core/presentation/common/DiceImageView$ViewState;

    .line 479
    .line 480
    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    .line 481
    .line 482
    .line 483
    move-result v5

    .line 484
    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    .line 485
    .line 486
    .line 487
    move-result v6

    .line 488
    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    .line 489
    .line 490
    .line 491
    move-result v7

    .line 492
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 493
    .line 494
    .line 495
    move-result v8

    .line 496
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 497
    .line 498
    .line 499
    move-result v9

    .line 500
    invoke-direct/range {v4 .. v9}, Lorg/xplatform/core/presentation/common/DiceImageView$ViewState;-><init>(FFFII)V

    .line 501
    .line 502
    .line 503
    return-object v4

    .line 504
    :pswitch_b
    move v0, v3

    .line 505
    move v6, v4

    .line 506
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 507
    .line 508
    .line 509
    new-instance v5, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 510
    .line 511
    sget-object v3, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    .line 512
    .line 513
    invoke-interface {v3, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v4

    .line 517
    check-cast v4, Ljava/lang/CharSequence;

    .line 518
    .line 519
    invoke-interface {v3, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object v7

    .line 523
    check-cast v7, Ljava/lang/CharSequence;

    .line 524
    .line 525
    invoke-interface {v3, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v8

    .line 529
    check-cast v8, Ljava/lang/CharSequence;

    .line 530
    .line 531
    invoke-interface {v3, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v9

    .line 535
    check-cast v9, Ljava/lang/CharSequence;

    .line 536
    .line 537
    invoke-interface {v3, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v10

    .line 541
    check-cast v10, Ljava/lang/CharSequence;

    .line 542
    .line 543
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object v11

    .line 547
    invoke-interface {v3, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v3

    .line 551
    move-object v12, v3

    .line 552
    check-cast v12, Ljava/lang/CharSequence;

    .line 553
    .line 554
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 555
    .line 556
    .line 557
    move-result v3

    .line 558
    if-nez v3, :cond_7

    .line 559
    .line 560
    :goto_6
    move-object v13, v2

    .line 561
    goto :goto_7

    .line 562
    :cond_7
    sget-object v2, Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 563
    .line 564
    invoke-interface {v2, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v2

    .line 568
    check-cast v2, Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;

    .line 569
    .line 570
    goto :goto_6

    .line 571
    :goto_7
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 572
    .line 573
    .line 574
    move-result v14

    .line 575
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 576
    .line 577
    .line 578
    move-result-object v2

    .line 579
    invoke-static {v2}, La/n12;->valueOf(Ljava/lang/String;)La/n12;

    .line 580
    .line 581
    .line 582
    move-result-object v15

    .line 583
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 584
    .line 585
    .line 586
    move-result v1

    .line 587
    if-eqz v1, :cond_8

    .line 588
    .line 589
    move/from16 v16, v6

    .line 590
    .line 591
    :goto_8
    move-object v6, v4

    .line 592
    goto :goto_9

    .line 593
    :cond_8
    move/from16 v16, v0

    .line 594
    .line 595
    goto :goto_8

    .line 596
    :goto_9
    invoke-direct/range {v5 .. v16}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/CharSequence;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;ILa/n12;Z)V

    .line 597
    .line 598
    .line 599
    return-object v5

    .line 600
    :pswitch_c
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 601
    .line 602
    .line 603
    new-instance v0, Lorg/xplatform/responsible_game/impl/presentation/limits/deposit_limit/gambling_exam/models/DepositLimitScreenParams;

    .line 604
    .line 605
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 606
    .line 607
    .line 608
    move-result v2

    .line 609
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 610
    .line 611
    .line 612
    move-result v1

    .line 613
    invoke-direct {v0, v2, v1}, Lorg/xplatform/responsible_game/impl/presentation/limits/deposit_limit/gambling_exam/models/DepositLimitScreenParams;-><init>(II)V

    .line 614
    .line 615
    .line 616
    return-object v0

    .line 617
    :pswitch_d
    new-instance v0, Lcom/google/android/material/datepicker/DateValidatorPointForward;

    .line 618
    .line 619
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 620
    .line 621
    .line 622
    move-result-wide v1

    .line 623
    invoke-direct {v0, v1, v2}, Lcom/google/android/material/datepicker/DateValidatorPointForward;-><init>(J)V

    .line 624
    .line 625
    .line 626
    return-object v0

    .line 627
    :pswitch_e
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 628
    .line 629
    .line 630
    new-instance v3, Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;

    .line 631
    .line 632
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 633
    .line 634
    .line 635
    move-result-object v4

    .line 636
    sget-object v0, Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 637
    .line 638
    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 639
    .line 640
    .line 641
    move-result-object v5

    .line 642
    check-cast v5, Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;

    .line 643
    .line 644
    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    move-result-object v0

    .line 648
    move-object v6, v0

    .line 649
    check-cast v6, Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;

    .line 650
    .line 651
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 652
    .line 653
    .line 654
    move-result-object v0

    .line 655
    invoke-static {v0}, La/ulq0;->valueOf(Ljava/lang/String;)La/ulq0;

    .line 656
    .line 657
    .line 658
    move-result-object v7

    .line 659
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    invoke-static {v0}, La/yg40;->valueOf(Ljava/lang/String;)La/yg40;

    .line 664
    .line 665
    .line 666
    move-result-object v8

    .line 667
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 668
    .line 669
    .line 670
    move-result v0

    .line 671
    if-nez v0, :cond_9

    .line 672
    .line 673
    move-object v9, v2

    .line 674
    goto :goto_a

    .line 675
    :cond_9
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 676
    .line 677
    .line 678
    move-result-wide v9

    .line 679
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 680
    .line 681
    .line 682
    move-result-object v0

    .line 683
    move-object v9, v0

    .line 684
    :goto_a
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 685
    .line 686
    .line 687
    move-result v0

    .line 688
    if-nez v0, :cond_a

    .line 689
    .line 690
    :goto_b
    move-object v10, v2

    .line 691
    goto :goto_c

    .line 692
    :cond_a
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 693
    .line 694
    .line 695
    move-result-wide v0

    .line 696
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 697
    .line 698
    .line 699
    move-result-object v2

    .line 700
    goto :goto_b

    .line 701
    :goto_c
    invoke-direct/range {v3 .. v10}, Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;-><init>(Ljava/lang/String;Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;La/ulq0;La/yg40;Ljava/lang/Long;Ljava/lang/Long;)V

    .line 702
    .line 703
    .line 704
    return-object v3

    .line 705
    :pswitch_f
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 706
    .line 707
    .line 708
    new-instance v0, Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;

    .line 709
    .line 710
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 711
    .line 712
    .line 713
    move-result v3

    .line 714
    if-nez v3, :cond_b

    .line 715
    .line 716
    move-object v3, v2

    .line 717
    goto :goto_d

    .line 718
    :cond_b
    sget-object v3, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 719
    .line 720
    invoke-interface {v3, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object v3

    .line 724
    check-cast v3, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 725
    .line 726
    :goto_d
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 727
    .line 728
    .line 729
    move-result v4

    .line 730
    if-nez v4, :cond_c

    .line 731
    .line 732
    goto :goto_e

    .line 733
    :cond_c
    sget-object v2, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 734
    .line 735
    invoke-interface {v2, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 736
    .line 737
    .line 738
    move-result-object v1

    .line 739
    move-object v2, v1

    .line 740
    check-cast v2, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 741
    .line 742
    :goto_e
    invoke-direct {v0, v3, v2}, Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;-><init>(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;)V

    .line 743
    .line 744
    .line 745
    return-object v0

    .line 746
    :pswitch_10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 747
    .line 748
    .line 749
    new-instance v4, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;

    .line 750
    .line 751
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 752
    .line 753
    .line 754
    move-result-object v5

    .line 755
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 756
    .line 757
    .line 758
    move-result-object v6

    .line 759
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 760
    .line 761
    .line 762
    move-result-object v7

    .line 763
    const-class v0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;

    .line 764
    .line 765
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 766
    .line 767
    .line 768
    move-result-object v3

    .line 769
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 770
    .line 771
    .line 772
    move-result-object v3

    .line 773
    move-object v8, v3

    .line 774
    check-cast v8, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 775
    .line 776
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 777
    .line 778
    .line 779
    move-result-object v3

    .line 780
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 781
    .line 782
    .line 783
    move-result-object v3

    .line 784
    move-object v9, v3

    .line 785
    check-cast v9, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 786
    .line 787
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 788
    .line 789
    .line 790
    move-result v3

    .line 791
    if-nez v3, :cond_d

    .line 792
    .line 793
    :goto_f
    move-object v10, v2

    .line 794
    goto :goto_10

    .line 795
    :cond_d
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 796
    .line 797
    .line 798
    move-result v2

    .line 799
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 800
    .line 801
    .line 802
    move-result-object v2

    .line 803
    goto :goto_f

    .line 804
    :goto_10
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 805
    .line 806
    .line 807
    move-result v11

    .line 808
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 809
    .line 810
    .line 811
    move-result-object v0

    .line 812
    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 813
    .line 814
    .line 815
    move-result-object v0

    .line 816
    move-object v12, v0

    .line 817
    check-cast v12, Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;

    .line 818
    .line 819
    invoke-direct/range {v4 .. v12}, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Ljava/lang/Integer;ILorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;)V

    .line 820
    .line 821
    .line 822
    return-object v4

    .line 823
    :pswitch_11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 824
    .line 825
    .line 826
    new-instance v0, Lorg/xplatform/ui_core/calendar/model/DateCalendarBottomSheetParams;

    .line 827
    .line 828
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 829
    .line 830
    .line 831
    move-result-object v2

    .line 832
    const-class v3, Lorg/xplatform/ui_core/calendar/model/DateCalendarBottomSheetParams;

    .line 833
    .line 834
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 835
    .line 836
    .line 837
    move-result-object v4

    .line 838
    invoke-virtual {v1, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 839
    .line 840
    .line 841
    move-result-object v4

    .line 842
    check-cast v4, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 843
    .line 844
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 845
    .line 846
    .line 847
    move-result-object v5

    .line 848
    invoke-virtual {v1, v5}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 849
    .line 850
    .line 851
    move-result-object v5

    .line 852
    check-cast v5, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 853
    .line 854
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 855
    .line 856
    .line 857
    move-result-object v3

    .line 858
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 859
    .line 860
    .line 861
    move-result-object v1

    .line 862
    check-cast v1, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 863
    .line 864
    invoke-direct {v0, v2, v4, v5, v1}, Lorg/xplatform/ui_core/calendar/model/DateCalendarBottomSheetParams;-><init>(Ljava/lang/String;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;)V

    .line 865
    .line 866
    .line 867
    return-object v0

    .line 868
    :pswitch_12
    move v0, v3

    .line 869
    move v6, v4

    .line 870
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 871
    .line 872
    .line 873
    move v2, v6

    .line 874
    new-instance v6, Lorg/xplatform/cyber/section/api/tournament_bracket/CyberTournamentBracketParams;

    .line 875
    .line 876
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 877
    .line 878
    .line 879
    move-result-wide v7

    .line 880
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 881
    .line 882
    .line 883
    move-result-object v15

    .line 884
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 885
    .line 886
    .line 887
    move-result-wide v9

    .line 888
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 889
    .line 890
    .line 891
    move-result-wide v11

    .line 892
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 893
    .line 894
    .line 895
    move-result v3

    .line 896
    if-eqz v3, :cond_e

    .line 897
    .line 898
    move/from16 v16, v2

    .line 899
    .line 900
    goto :goto_11

    .line 901
    :cond_e
    move/from16 v16, v0

    .line 902
    .line 903
    :goto_11
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 904
    .line 905
    .line 906
    move-result-wide v13

    .line 907
    invoke-direct/range {v6 .. v16}, Lorg/xplatform/cyber/section/api/tournament_bracket/CyberTournamentBracketParams;-><init>(JJJJLjava/lang/String;Z)V

    .line 908
    .line 909
    .line 910
    return-object v6

    .line 911
    :pswitch_13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 912
    .line 913
    .line 914
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 915
    .line 916
    .line 917
    move-result-object v0

    .line 918
    invoke-static {v0}, Lorg/xplatform/cyber/section/api/tournament_bracket/domain/model/CyberTournamentBracketMatchStatusModel;->valueOf(Ljava/lang/String;)Lorg/xplatform/cyber/section/api/tournament_bracket/domain/model/CyberTournamentBracketMatchStatusModel;

    .line 919
    .line 920
    .line 921
    move-result-object v0

    .line 922
    return-object v0

    .line 923
    :pswitch_14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 924
    .line 925
    .line 926
    new-instance v0, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;

    .line 927
    .line 928
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 929
    .line 930
    .line 931
    move-result-object v2

    .line 932
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 933
    .line 934
    .line 935
    move-result-object v3

    .line 936
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 937
    .line 938
    .line 939
    move-result-object v4

    .line 940
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 941
    .line 942
    .line 943
    move-result-object v5

    .line 944
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 945
    .line 946
    .line 947
    move-result v6

    .line 948
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 949
    .line 950
    .line 951
    move-result v7

    .line 952
    const-class v8, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;

    .line 953
    .line 954
    invoke-virtual {v8}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 955
    .line 956
    .line 957
    move-result-object v8

    .line 958
    invoke-virtual {v1, v8}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 959
    .line 960
    .line 961
    move-result-object v8

    .line 962
    check-cast v8, Lorg/xplatform/cyber/section/api/tournament_bracket/domain/model/CyberTournamentBracketMatchStatusModel;

    .line 963
    .line 964
    sget-object v9, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 965
    .line 966
    invoke-interface {v9, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 967
    .line 968
    .line 969
    move-result-object v10

    .line 970
    check-cast v10, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;

    .line 971
    .line 972
    invoke-interface {v9, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 973
    .line 974
    .line 975
    move-result-object v9

    .line 976
    check-cast v9, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;

    .line 977
    .line 978
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 979
    .line 980
    .line 981
    move-result-wide v11

    .line 982
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 983
    .line 984
    .line 985
    move-result-object v13

    .line 986
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 987
    .line 988
    .line 989
    move-result v14

    .line 990
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 991
    .line 992
    .line 993
    move-result-wide v15

    .line 994
    move-object v1, v10

    .line 995
    move-object v10, v9

    .line 996
    move-object v9, v1

    .line 997
    move-object v1, v0

    .line 998
    invoke-direct/range {v1 .. v16}, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILorg/xplatform/cyber/section/api/tournament_bracket/domain/model/CyberTournamentBracketMatchStatusModel;Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;JLjava/lang/String;IJ)V

    .line 999
    .line 1000
    .line 1001
    return-object v1

    .line 1002
    :pswitch_15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1003
    .line 1004
    .line 1005
    new-instance v0, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;

    .line 1006
    .line 1007
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v2

    .line 1011
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v1

    .line 1015
    invoke-direct {v0, v2, v1}, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1016
    .line 1017
    .line 1018
    return-object v0

    .line 1019
    :pswitch_16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1020
    .line 1021
    .line 1022
    new-instance v0, Lorg/xplatform/cyber/section/api/home/CyberHomeParams;

    .line 1023
    .line 1024
    const-class v2, Lorg/xplatform/cyber/section/api/home/CyberHomeParams;

    .line 1025
    .line 1026
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v3

    .line 1030
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v3

    .line 1034
    check-cast v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1035
    .line 1036
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v2

    .line 1040
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v1

    .line 1044
    check-cast v1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;

    .line 1045
    .line 1046
    invoke-direct {v0, v3, v1}, Lorg/xplatform/cyber/section/api/home/CyberHomeParams;-><init>(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;)V

    .line 1047
    .line 1048
    .line 1049
    return-object v0

    .line 1050
    :pswitch_17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1051
    .line 1052
    .line 1053
    new-instance v4, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;

    .line 1054
    .line 1055
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v5

    .line 1059
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 1060
    .line 1061
    .line 1062
    move-result-wide v6

    .line 1063
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1064
    .line 1065
    .line 1066
    move-result v8

    .line 1067
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1068
    .line 1069
    .line 1070
    move-result v9

    .line 1071
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v10

    .line 1075
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v11

    .line 1079
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v12

    .line 1083
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v13

    .line 1087
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 1088
    .line 1089
    .line 1090
    move-result-wide v14

    .line 1091
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v16

    .line 1095
    invoke-direct/range {v4 .. v16}, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;-><init>(Ljava/lang/String;JIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    .line 1096
    .line 1097
    .line 1098
    return-object v4

    .line 1099
    :pswitch_18
    move v0, v3

    .line 1100
    move v2, v4

    .line 1101
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1102
    .line 1103
    .line 1104
    new-instance v5, Lorg/xplatform/cyber/game/dota/api/presentation/CyberGameDotaScreenParams;

    .line 1105
    .line 1106
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 1107
    .line 1108
    .line 1109
    move-result-wide v7

    .line 1110
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1111
    .line 1112
    .line 1113
    move-result v3

    .line 1114
    if-eqz v3, :cond_f

    .line 1115
    .line 1116
    move/from16 v19, v2

    .line 1117
    .line 1118
    goto :goto_12

    .line 1119
    :cond_f
    move/from16 v19, v0

    .line 1120
    .line 1121
    :goto_12
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 1122
    .line 1123
    .line 1124
    move-result-wide v9

    .line 1125
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 1126
    .line 1127
    .line 1128
    move-result-wide v11

    .line 1129
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 1130
    .line 1131
    .line 1132
    move-result-wide v13

    .line 1133
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1134
    .line 1135
    .line 1136
    move-result v3

    .line 1137
    if-eqz v3, :cond_10

    .line 1138
    .line 1139
    move/from16 v20, v2

    .line 1140
    .line 1141
    goto :goto_13

    .line 1142
    :cond_10
    move/from16 v20, v0

    .line 1143
    .line 1144
    :goto_13
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v18

    .line 1148
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 1149
    .line 1150
    .line 1151
    move-result-wide v15

    .line 1152
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1153
    .line 1154
    .line 1155
    move-result v6

    .line 1156
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v0

    .line 1160
    invoke-static {v0}, La/k1g;->valueOf(Ljava/lang/String;)La/k1g;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v17

    .line 1164
    invoke-direct/range {v5 .. v20}, Lorg/xplatform/cyber/game/dota/api/presentation/CyberGameDotaScreenParams;-><init>(IJJJJJLa/k1g;Ljava/lang/String;ZZ)V

    .line 1165
    .line 1166
    .line 1167
    return-object v5

    .line 1168
    :pswitch_19
    move v0, v3

    .line 1169
    move v2, v4

    .line 1170
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1171
    .line 1172
    .line 1173
    const-class v3, Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;

    .line 1174
    .line 1175
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v3

    .line 1179
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v3

    .line 1183
    move-object v5, v3

    .line 1184
    check-cast v5, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1185
    .line 1186
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 1187
    .line 1188
    .line 1189
    move-result-wide v6

    .line 1190
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1191
    .line 1192
    .line 1193
    move-result v3

    .line 1194
    if-eqz v3, :cond_11

    .line 1195
    .line 1196
    move v8, v2

    .line 1197
    goto :goto_14

    .line 1198
    :cond_11
    move v8, v0

    .line 1199
    :goto_14
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1200
    .line 1201
    .line 1202
    move-result v2

    .line 1203
    new-instance v9, Ljava/util/ArrayList;

    .line 1204
    .line 1205
    invoke-direct {v9, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1206
    .line 1207
    .line 1208
    move v3, v0

    .line 1209
    :goto_15
    if-eq v3, v2, :cond_12

    .line 1210
    .line 1211
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 1212
    .line 1213
    .line 1214
    move-result-wide v10

    .line 1215
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v0

    .line 1219
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1220
    .line 1221
    .line 1222
    add-int/lit8 v3, v3, 0x1

    .line 1223
    .line 1224
    goto :goto_15

    .line 1225
    :cond_12
    new-instance v4, Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;

    .line 1226
    .line 1227
    invoke-direct/range {v4 .. v9}, Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;-><init>(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;JZLjava/util/List;)V

    .line 1228
    .line 1229
    .line 1230
    return-object v4

    .line 1231
    :pswitch_1a
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1232
    .line 1233
    .line 1234
    new-instance v5, Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;

    .line 1235
    .line 1236
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 1237
    .line 1238
    .line 1239
    move-result-wide v7

    .line 1240
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v6

    .line 1244
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 1245
    .line 1246
    .line 1247
    move-result-wide v9

    .line 1248
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1249
    .line 1250
    .line 1251
    move-result v11

    .line 1252
    invoke-direct/range {v5 .. v11}, Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;-><init>(Ljava/lang/String;JJI)V

    .line 1253
    .line 1254
    .line 1255
    return-object v5

    .line 1256
    :pswitch_1b
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1257
    .line 1258
    .line 1259
    new-instance v0, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 1260
    .line 1261
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 1262
    .line 1263
    .line 1264
    move-result-wide v2

    .line 1265
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 1266
    .line 1267
    .line 1268
    move-result-wide v4

    .line 1269
    invoke-direct {v0, v2, v3, v4, v5}, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;-><init>(JJ)V

    .line 1270
    .line 1271
    .line 1272
    return-object v0

    .line 1273
    :pswitch_1c
    move v0, v3

    .line 1274
    move v2, v4

    .line 1275
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1276
    .line 1277
    .line 1278
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1279
    .line 1280
    .line 1281
    move-result v3

    .line 1282
    new-instance v4, Ljava/util/ArrayList;

    .line 1283
    .line 1284
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1285
    .line 1286
    .line 1287
    move v5, v0

    .line 1288
    :goto_16
    if-eq v5, v3, :cond_13

    .line 1289
    .line 1290
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 1291
    .line 1292
    .line 1293
    move-result-wide v6

    .line 1294
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v6

    .line 1298
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1299
    .line 1300
    .line 1301
    add-int/lit8 v5, v5, 0x1

    .line 1302
    .line 1303
    goto :goto_16

    .line 1304
    :cond_13
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1305
    .line 1306
    .line 1307
    move-result v3

    .line 1308
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1309
    .line 1310
    .line 1311
    move-result v5

    .line 1312
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1313
    .line 1314
    .line 1315
    move-result v1

    .line 1316
    if-eqz v1, :cond_14

    .line 1317
    .line 1318
    move v0, v2

    .line 1319
    :cond_14
    new-instance v1, Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;

    .line 1320
    .line 1321
    invoke-direct {v1, v3, v5, v4, v0}, Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;-><init>(IILjava/util/List;Z)V

    .line 1322
    .line 1323
    .line 1324
    return-object v1

    .line 1325
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
    iget-byte p0, p0, La/h9g;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Lorg/xplatform/betting/core/zip/model/zip/EventParams;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Lorg/xplatform/betting/core/zip/model/EventItem;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Lcom/github/mikephil/charting/data/Entry;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    new-array p0, p1, [Lorg/xplatform/personal/impl/presentation/edit_tj/models/EditProfileTjItemEnum;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    new-array p0, p1, [Landroidx/media3/common/DrmInitData;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    new-array p0, p1, [Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/DocumentStateModel;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_6
    new-array p0, p1, [Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/DocumentStateModel;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_7
    new-array p0, p1, [Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/DocumentStateModel;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_8
    new-array p0, p1, [Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineListParams;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_9
    new-array p0, p1, [Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_a
    new-array p0, p1, [Lorg/xplatform/core/presentation/common/DiceImageView$ViewState;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_b
    new-array p0, p1, [Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_c
    new-array p0, p1, [Lorg/xplatform/responsible_game/impl/presentation/limits/deposit_limit/gambling_exam/models/DepositLimitScreenParams;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_d
    new-array p0, p1, [Lcom/google/android/material/datepicker/DateValidatorPointForward;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_e
    new-array p0, p1, [Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_f
    new-array p0, p1, [Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_10
    new-array p0, p1, [Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_11
    new-array p0, p1, [Lorg/xplatform/ui_core/calendar/model/DateCalendarBottomSheetParams;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_12
    new-array p0, p1, [Lorg/xplatform/cyber/section/api/tournament_bracket/CyberTournamentBracketParams;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_13
    new-array p0, p1, [Lorg/xplatform/cyber/section/api/tournament_bracket/domain/model/CyberTournamentBracketMatchStatusModel;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_14
    new-array p0, p1, [Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_15
    new-array p0, p1, [Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_16
    new-array p0, p1, [Lorg/xplatform/cyber/section/api/home/CyberHomeParams;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_17
    new-array p0, p1, [Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_18
    new-array p0, p1, [Lorg/xplatform/cyber/game/dota/api/presentation/CyberGameDotaScreenParams;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_19
    new-array p0, p1, [Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_1a
    new-array p0, p1, [Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_1b
    new-array p0, p1, [Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_1c
    new-array p0, p1, [Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;

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
