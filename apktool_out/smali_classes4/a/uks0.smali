.class public final La/uks0;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/uks0;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/s9m0",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final l2:La/s9m0;

.field public static final synthetic m2:[La/iiy;


# instance fields
.field public final k2:La/khf0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/uks0;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/cyber/section/impl/transfers/presentation/dialogs/timefilter/model/TransfersTimeFilterBottomParams;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/uks0;->m2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/s9m0;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/uks0;->l2:La/s9m0;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/khf0;

    .line 5
    .line 6
    const-string v1, "params_key"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/uks0;->k2:La/khf0;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const v2, 0x56e1f4d5

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 9
    .line 10
    .line 11
    sget-object v2, La/dy2;->a:La/zfn;

    .line 12
    .line 13
    invoke-virtual {v1, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Landroid/content/res/Configuration;

    .line 18
    .line 19
    invoke-virtual {v2}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-virtual {v2, v3}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    sget-object v4, La/uks0;->m2:[La/iiy;

    .line 32
    .line 33
    aget-object v5, v4, v3

    .line 34
    .line 35
    iget-object v6, v0, La/uks0;->k2:La/khf0;

    .line 36
    .line 37
    invoke-virtual {v6, v0, v5}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    check-cast v5, Lorg/xplatform/cyber/section/impl/transfers/presentation/dialogs/timefilter/model/TransfersTimeFilterBottomParams;

    .line 42
    .line 43
    iget-object v5, v5, Lorg/xplatform/cyber/section/impl/transfers/presentation/dialogs/timefilter/model/TransfersTimeFilterBottomParams;->a:Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel;

    .line 44
    .line 45
    aget-object v4, v4, v3

    .line 46
    .line 47
    invoke-virtual {v6, v0, v4}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, Lorg/xplatform/cyber/section/impl/transfers/presentation/dialogs/timefilter/model/TransfersTimeFilterBottomParams;

    .line 52
    .line 53
    iget-object v4, v4, Lorg/xplatform/cyber/section/impl/transfers/presentation/dialogs/timefilter/model/TransfersTimeFilterBottomParams;->b:Ljava/util/List;

    .line 54
    .line 55
    invoke-static {v4}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    const v6, 0x7f131223

    .line 66
    .line 67
    .line 68
    invoke-static {v6, v3, v1}, La/rsm0;->w(IILa/fet;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-virtual {v1, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    sget-object v9, La/ukd;->a:La/cl5;

    .line 81
    .line 82
    if-nez v7, :cond_0

    .line 83
    .line 84
    if-ne v8, v9, :cond_1

    .line 85
    .line 86
    :cond_0
    invoke-static {v5}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :cond_1
    check-cast v8, La/pz40;

    .line 94
    .line 95
    invoke-virtual {v1, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v7

    .line 99
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v10

    .line 103
    if-nez v7, :cond_3

    .line 104
    .line 105
    if-ne v10, v9, :cond_2

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_2
    const/16 v16, 0x0

    .line 109
    .line 110
    goto/16 :goto_7

    .line 111
    .line 112
    :cond_3
    :goto_0
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v10

    .line 124
    if-eqz v10, :cond_12

    .line 125
    .line 126
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v10

    .line 130
    check-cast v10, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel;

    .line 131
    .line 132
    if-eqz v10, :cond_10

    .line 133
    .line 134
    instance-of v14, v10, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel$CustomTime;

    .line 135
    .line 136
    if-eqz v14, :cond_a

    .line 137
    .line 138
    new-instance v14, La/wks0;

    .line 139
    .line 140
    invoke-interface {v8}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v15

    .line 144
    instance-of v15, v15, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel$CustomTime;

    .line 145
    .line 146
    const/16 v16, 0x0

    .line 147
    .line 148
    const v12, 0x7f131236

    .line 149
    .line 150
    .line 151
    invoke-direct {v14, v10, v15, v12}, La/wks0;-><init>(Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel;ZI)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v7, v14}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    invoke-interface {v8}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v10

    .line 161
    instance-of v12, v10, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel$CustomTime;

    .line 162
    .line 163
    if-eqz v12, :cond_4

    .line 164
    .line 165
    check-cast v10, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel$CustomTime;

    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_4
    move-object/from16 v10, v16

    .line 169
    .line 170
    :goto_2
    if-eqz v10, :cond_9

    .line 171
    .line 172
    new-instance v12, La/yks0;

    .line 173
    .line 174
    iget-object v14, v10, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel$CustomTime;->a:Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferFilterTimeCustomDateValue;

    .line 175
    .line 176
    instance-of v15, v14, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferFilterTimeCustomDateValue$Selected;

    .line 177
    .line 178
    sget-object v3, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferFilterTimeCustomDateValue$Unselected;->a:Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferFilterTimeCustomDateValue$Unselected;

    .line 179
    .line 180
    const-string v11, "."

    .line 181
    .line 182
    const-string v13, "%02d"

    .line 183
    .line 184
    if-eqz v15, :cond_5

    .line 185
    .line 186
    check-cast v14, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferFilterTimeCustomDateValue$Selected;

    .line 187
    .line 188
    iget-object v14, v14, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferFilterTimeCustomDateValue$Selected;->a:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 189
    .line 190
    iget v15, v14, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;->c:I

    .line 191
    .line 192
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 193
    .line 194
    .line 195
    move-result-object v15

    .line 196
    filled-new-array {v15}, [Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v15

    .line 200
    move-object/from16 v17, v4

    .line 201
    .line 202
    const/4 v4, 0x1

    .line 203
    invoke-static {v15, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v15

    .line 207
    invoke-static {v13, v15}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v15

    .line 211
    iget v4, v14, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;->b:I

    .line 212
    .line 213
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    move-object/from16 v18, v6

    .line 222
    .line 223
    const/4 v6, 0x1

    .line 224
    invoke-static {v4, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    invoke-static {v13, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v4

    .line 232
    iget v6, v14, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;->a:I

    .line 233
    .line 234
    new-instance v14, Ljava/lang/StringBuilder;

    .line 235
    .line 236
    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    goto :goto_3

    .line 256
    :cond_5
    move-object/from16 v17, v4

    .line 257
    .line 258
    move-object/from16 v18, v6

    .line 259
    .line 260
    invoke-static {v14, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v4

    .line 264
    if-eqz v4, :cond_8

    .line 265
    .line 266
    move-object/from16 v4, v18

    .line 267
    .line 268
    :goto_3
    sget-object v6, La/wui0;->b:La/wui0;

    .line 269
    .line 270
    const v14, 0x7f131379

    .line 271
    .line 272
    .line 273
    invoke-direct {v12, v10, v14, v4, v6}, La/yks0;-><init>(Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel$CustomTime;ILjava/lang/String;La/wui0;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v7, v12}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    new-instance v4, La/yks0;

    .line 280
    .line 281
    iget-object v6, v10, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel$CustomTime;->b:Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferFilterTimeCustomDateValue;

    .line 282
    .line 283
    instance-of v12, v6, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferFilterTimeCustomDateValue$Selected;

    .line 284
    .line 285
    if-eqz v12, :cond_6

    .line 286
    .line 287
    check-cast v6, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferFilterTimeCustomDateValue$Selected;

    .line 288
    .line 289
    iget-object v3, v6, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferFilterTimeCustomDateValue$Selected;->a:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 290
    .line 291
    iget v6, v3, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;->c:I

    .line 292
    .line 293
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 294
    .line 295
    .line 296
    move-result-object v6

    .line 297
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v6

    .line 301
    const/4 v12, 0x1

    .line 302
    invoke-static {v6, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v6

    .line 306
    invoke-static {v13, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v6

    .line 310
    iget v14, v3, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;->b:I

    .line 311
    .line 312
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 313
    .line 314
    .line 315
    move-result-object v14

    .line 316
    filled-new-array {v14}, [Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v14

    .line 320
    invoke-static {v14, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v14

    .line 324
    invoke-static {v13, v14}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v12

    .line 328
    iget v3, v3, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;->a:I

    .line 329
    .line 330
    new-instance v13, Ljava/lang/StringBuilder;

    .line 331
    .line 332
    invoke-direct {v13, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v3

    .line 351
    goto :goto_4

    .line 352
    :cond_6
    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v3

    .line 356
    if-eqz v3, :cond_7

    .line 357
    .line 358
    move-object/from16 v3, v18

    .line 359
    .line 360
    :goto_4
    sget-object v6, La/wui0;->d:La/wui0;

    .line 361
    .line 362
    const v11, 0x7f130798

    .line 363
    .line 364
    .line 365
    invoke-direct {v4, v10, v11, v3, v6}, La/yks0;-><init>(Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel$CustomTime;ILjava/lang/String;La/wui0;)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v7, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    goto :goto_6

    .line 372
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 373
    .line 374
    .line 375
    return-object v16

    .line 376
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 377
    .line 378
    .line 379
    return-object v16

    .line 380
    :cond_9
    move-object/from16 v17, v4

    .line 381
    .line 382
    move-object/from16 v18, v6

    .line 383
    .line 384
    goto :goto_6

    .line 385
    :cond_a
    move-object/from16 v17, v4

    .line 386
    .line 387
    move-object/from16 v18, v6

    .line 388
    .line 389
    const/16 v16, 0x0

    .line 390
    .line 391
    instance-of v3, v10, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel$SimpleTime;

    .line 392
    .line 393
    if-eqz v3, :cond_11

    .line 394
    .line 395
    new-instance v3, La/wks0;

    .line 396
    .line 397
    invoke-virtual {v10, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    move-result v4

    .line 401
    move-object v6, v10

    .line 402
    check-cast v6, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel$SimpleTime;

    .line 403
    .line 404
    iget-object v6, v6, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel$SimpleTime;->a:La/xhs0;

    .line 405
    .line 406
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 407
    .line 408
    .line 409
    move-result v6

    .line 410
    if-eqz v6, :cond_f

    .line 411
    .line 412
    const/4 v12, 0x1

    .line 413
    if-eq v6, v12, :cond_e

    .line 414
    .line 415
    const/4 v11, 0x2

    .line 416
    if-eq v6, v11, :cond_d

    .line 417
    .line 418
    const/4 v11, 0x3

    .line 419
    if-eq v6, v11, :cond_c

    .line 420
    .line 421
    const/4 v11, 0x4

    .line 422
    if-ne v6, v11, :cond_b

    .line 423
    .line 424
    const v6, 0x7f130e90

    .line 425
    .line 426
    .line 427
    goto :goto_5

    .line 428
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 429
    .line 430
    .line 431
    return-object v16

    .line 432
    :cond_c
    const v6, 0x7f1317e6

    .line 433
    .line 434
    .line 435
    goto :goto_5

    .line 436
    :cond_d
    const v6, 0x7f1308a4

    .line 437
    .line 438
    .line 439
    goto :goto_5

    .line 440
    :cond_e
    const v6, 0x7f1308a0

    .line 441
    .line 442
    .line 443
    goto :goto_5

    .line 444
    :cond_f
    const v6, 0x7f1300ee

    .line 445
    .line 446
    .line 447
    :goto_5
    invoke-direct {v3, v10, v4, v6}, La/wks0;-><init>(Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel;ZI)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v7, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 451
    .line 452
    .line 453
    :goto_6
    move-object/from16 v4, v17

    .line 454
    .line 455
    move-object/from16 v6, v18

    .line 456
    .line 457
    const/4 v3, 0x0

    .line 458
    goto/16 :goto_1

    .line 459
    .line 460
    :cond_10
    const/16 v16, 0x0

    .line 461
    .line 462
    :cond_11
    invoke-static {}, La/t9f;->b()V

    .line 463
    .line 464
    .line 465
    return-object v16

    .line 466
    :cond_12
    const/16 v16, 0x0

    .line 467
    .line 468
    invoke-static {v7}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 469
    .line 470
    .line 471
    move-result-object v10

    .line 472
    invoke-virtual {v1, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    :goto_7
    check-cast v10, Ljava/util/List;

    .line 476
    .line 477
    const v3, 0x7f13030f

    .line 478
    .line 479
    .line 480
    const/4 v4, 0x0

    .line 481
    invoke-static {v3, v4, v1}, La/rsm0;->w(IILa/fet;)Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v18

    .line 485
    invoke-virtual {v1, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    move-result v3

    .line 489
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v4

    .line 493
    if-nez v3, :cond_13

    .line 494
    .line 495
    if-ne v4, v9, :cond_1b

    .line 496
    .line 497
    :cond_13
    instance-of v3, v5, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel$CustomTime;

    .line 498
    .line 499
    if-eqz v3, :cond_14

    .line 500
    .line 501
    move-object v3, v5

    .line 502
    check-cast v3, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel$CustomTime;

    .line 503
    .line 504
    goto :goto_8

    .line 505
    :cond_14
    move-object/from16 v3, v16

    .line 506
    .line 507
    :goto_8
    invoke-static {v2}, Ljava/util/Calendar;->getInstance(Ljava/util/Locale;)Ljava/util/Calendar;

    .line 508
    .line 509
    .line 510
    move-result-object v4

    .line 511
    if-eqz v3, :cond_15

    .line 512
    .line 513
    iget-object v6, v3, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel$CustomTime;->a:Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferFilterTimeCustomDateValue;

    .line 514
    .line 515
    goto :goto_9

    .line 516
    :cond_15
    move-object/from16 v6, v16

    .line 517
    .line 518
    :goto_9
    instance-of v7, v6, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferFilterTimeCustomDateValue$Selected;

    .line 519
    .line 520
    if-eqz v7, :cond_16

    .line 521
    .line 522
    check-cast v6, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferFilterTimeCustomDateValue$Selected;

    .line 523
    .line 524
    goto :goto_a

    .line 525
    :cond_16
    move-object/from16 v6, v16

    .line 526
    .line 527
    :goto_a
    if-eqz v6, :cond_17

    .line 528
    .line 529
    iget-object v6, v6, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferFilterTimeCustomDateValue$Selected;->a:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 530
    .line 531
    if-eqz v6, :cond_17

    .line 532
    .line 533
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 534
    .line 535
    .line 536
    invoke-static {v6, v4}, La/wdx;->J(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Ljava/util/Calendar;)V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 540
    .line 541
    .line 542
    move-result-wide v6

    .line 543
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 544
    .line 545
    .line 546
    move-result-object v6

    .line 547
    goto :goto_b

    .line 548
    :cond_17
    move-object/from16 v6, v16

    .line 549
    .line 550
    :goto_b
    if-eqz v3, :cond_18

    .line 551
    .line 552
    iget-object v3, v3, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel$CustomTime;->b:Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferFilterTimeCustomDateValue;

    .line 553
    .line 554
    goto :goto_c

    .line 555
    :cond_18
    move-object/from16 v3, v16

    .line 556
    .line 557
    :goto_c
    instance-of v7, v3, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferFilterTimeCustomDateValue$Selected;

    .line 558
    .line 559
    if-eqz v7, :cond_19

    .line 560
    .line 561
    check-cast v3, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferFilterTimeCustomDateValue$Selected;

    .line 562
    .line 563
    goto :goto_d

    .line 564
    :cond_19
    move-object/from16 v3, v16

    .line 565
    .line 566
    :goto_d
    if-eqz v3, :cond_1a

    .line 567
    .line 568
    iget-object v3, v3, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferFilterTimeCustomDateValue$Selected;->a:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 569
    .line 570
    if-eqz v3, :cond_1a

    .line 571
    .line 572
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 573
    .line 574
    .line 575
    invoke-static {v3, v4}, La/wdx;->J(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Ljava/util/Calendar;)V

    .line 576
    .line 577
    .line 578
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 579
    .line 580
    .line 581
    move-result-wide v3

    .line 582
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 583
    .line 584
    .line 585
    move-result-object v3

    .line 586
    goto :goto_e

    .line 587
    :cond_1a
    move-object/from16 v3, v16

    .line 588
    .line 589
    :goto_e
    new-instance v4, Lkotlin/Pair;

    .line 590
    .line 591
    invoke-direct {v4, v6, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 592
    .line 593
    .line 594
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 595
    .line 596
    .line 597
    :cond_1b
    check-cast v4, Lkotlin/Pair;

    .line 598
    .line 599
    invoke-virtual {v1, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 600
    .line 601
    .line 602
    move-result v3

    .line 603
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v6

    .line 607
    const/16 v7, 0xc

    .line 608
    .line 609
    if-nez v3, :cond_1c

    .line 610
    .line 611
    if-ne v6, v9, :cond_1d

    .line 612
    .line 613
    :cond_1c
    invoke-static {v2}, Ljava/util/Calendar;->getInstance(Ljava/util/Locale;)Ljava/util/Calendar;

    .line 614
    .line 615
    .line 616
    move-result-object v3

    .line 617
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 618
    .line 619
    .line 620
    const/16 v6, 0xb

    .line 621
    .line 622
    const/4 v11, 0x0

    .line 623
    invoke-virtual {v3, v6, v11}, Ljava/util/Calendar;->set(II)V

    .line 624
    .line 625
    .line 626
    invoke-virtual {v3, v7, v11}, Ljava/util/Calendar;->set(II)V

    .line 627
    .line 628
    .line 629
    const/16 v6, 0xd

    .line 630
    .line 631
    invoke-virtual {v3, v6, v11}, Ljava/util/Calendar;->set(II)V

    .line 632
    .line 633
    .line 634
    const/16 v6, 0xe

    .line 635
    .line 636
    invoke-virtual {v3, v6, v11}, Ljava/util/Calendar;->set(II)V

    .line 637
    .line 638
    .line 639
    invoke-static {v3}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 640
    .line 641
    .line 642
    move-result-object v6

    .line 643
    invoke-virtual {v1, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 644
    .line 645
    .line 646
    :cond_1d
    check-cast v6, La/pz40;

    .line 647
    .line 648
    new-instance v3, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 649
    .line 650
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    move-result-object v11

    .line 654
    check-cast v11, Ljava/util/Calendar;

    .line 655
    .line 656
    const/4 v12, 0x1

    .line 657
    invoke-virtual {v11, v12}, Ljava/util/Calendar;->get(I)I

    .line 658
    .line 659
    .line 660
    move-result v11

    .line 661
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    move-result-object v13

    .line 665
    check-cast v13, Ljava/util/Calendar;

    .line 666
    .line 667
    const/4 v14, 0x2

    .line 668
    invoke-virtual {v13, v14}, Ljava/util/Calendar;->get(I)I

    .line 669
    .line 670
    .line 671
    move-result v13

    .line 672
    add-int/2addr v13, v12

    .line 673
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 674
    .line 675
    .line 676
    move-result-object v6

    .line 677
    check-cast v6, Ljava/util/Calendar;

    .line 678
    .line 679
    const/4 v14, 0x5

    .line 680
    invoke-virtual {v6, v14}, Ljava/util/Calendar;->get(I)I

    .line 681
    .line 682
    .line 683
    move-result v6

    .line 684
    invoke-direct {v3, v11, v13, v6}, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;-><init>(III)V

    .line 685
    .line 686
    .line 687
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 688
    .line 689
    .line 690
    move-result-object v6

    .line 691
    if-ne v6, v9, :cond_1e

    .line 692
    .line 693
    new-instance v6, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 694
    .line 695
    const/16 v11, 0x7d0

    .line 696
    .line 697
    invoke-direct {v6, v11, v12, v12}, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;-><init>(III)V

    .line 698
    .line 699
    .line 700
    invoke-virtual {v1, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 701
    .line 702
    .line 703
    :cond_1e
    check-cast v6, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 704
    .line 705
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 706
    .line 707
    .line 708
    move-result-object v11

    .line 709
    if-ne v11, v9, :cond_1f

    .line 710
    .line 711
    sget-object v11, La/ulq0;->a:La/ulq0;

    .line 712
    .line 713
    new-instance v11, Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;

    .line 714
    .line 715
    move-object/from16 v12, v16

    .line 716
    .line 717
    invoke-direct {v11, v6, v12}, Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;-><init>(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/TimeOfDay23;)V

    .line 718
    .line 719
    .line 720
    new-instance v6, Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;

    .line 721
    .line 722
    invoke-direct {v6, v3, v12}, Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;-><init>(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/TimeOfDay23;)V

    .line 723
    .line 724
    .line 725
    iget-object v3, v4, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 726
    .line 727
    move-object/from16 v21, v3

    .line 728
    .line 729
    check-cast v21, Ljava/lang/Long;

    .line 730
    .line 731
    iget-object v3, v4, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 732
    .line 733
    move-object/from16 v22, v3

    .line 734
    .line 735
    check-cast v22, Ljava/lang/Long;

    .line 736
    .line 737
    new-instance v17, Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;

    .line 738
    .line 739
    const/16 v23, 0x10

    .line 740
    .line 741
    move-object/from16 v20, v6

    .line 742
    .line 743
    move-object/from16 v19, v11

    .line 744
    .line 745
    invoke-direct/range {v17 .. v23}, Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;-><init>(Ljava/lang/String;Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;Ljava/lang/Long;Ljava/lang/Long;I)V

    .line 746
    .line 747
    .line 748
    move-object/from16 v11, v17

    .line 749
    .line 750
    invoke-virtual {v1, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 751
    .line 752
    .line 753
    :cond_1f
    check-cast v11, Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;

    .line 754
    .line 755
    invoke-virtual {v1, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 756
    .line 757
    .line 758
    move-result v3

    .line 759
    invoke-virtual {v1, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 760
    .line 761
    .line 762
    move-result v4

    .line 763
    or-int/2addr v3, v4

    .line 764
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 765
    .line 766
    .line 767
    move-result-object v4

    .line 768
    if-nez v3, :cond_20

    .line 769
    .line 770
    if-ne v4, v9, :cond_21

    .line 771
    .line 772
    :cond_20
    new-instance v4, La/yhs0;

    .line 773
    .line 774
    invoke-static {v10}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 775
    .line 776
    .line 777
    move-result-object v3

    .line 778
    invoke-direct {v4, v2, v3, v11, v8}, La/yhs0;-><init>(Ljava/util/Locale;La/a4x;Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;La/pz40;)V

    .line 779
    .line 780
    .line 781
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 782
    .line 783
    .line 784
    :cond_21
    check-cast v4, La/yhs0;

    .line 785
    .line 786
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 787
    .line 788
    invoke-virtual {v1, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 789
    .line 790
    .line 791
    move-result v3

    .line 792
    invoke-virtual {v1, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 793
    .line 794
    .line 795
    move-result v5

    .line 796
    or-int/2addr v3, v5

    .line 797
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    move-result-object v5

    .line 801
    if-nez v3, :cond_22

    .line 802
    .line 803
    if-ne v5, v9, :cond_23

    .line 804
    .line 805
    :cond_22
    new-instance v5, La/rtq0;

    .line 806
    .line 807
    const/4 v12, 0x0

    .line 808
    invoke-direct {v5, v0, v4, v12, v7}, La/rtq0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 809
    .line 810
    .line 811
    invoke-virtual {v1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 812
    .line 813
    .line 814
    :cond_23
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 815
    .line 816
    invoke-static {v1, v2, v5}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 817
    .line 818
    .line 819
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 820
    .line 821
    .line 822
    move-result-object v2

    .line 823
    if-ne v2, v9, :cond_24

    .line 824
    .line 825
    new-instance v2, La/yip0;

    .line 826
    .line 827
    const/16 v3, 0x18

    .line 828
    .line 829
    invoke-direct {v2, v4, v0, v3}, La/yip0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 830
    .line 831
    .line 832
    invoke-virtual {v1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 833
    .line 834
    .line 835
    :cond_24
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 836
    .line 837
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 838
    .line 839
    .line 840
    move-result-object v3

    .line 841
    if-ne v3, v9, :cond_25

    .line 842
    .line 843
    new-instance v3, La/lcr0;

    .line 844
    .line 845
    const/16 v5, 0x13

    .line 846
    .line 847
    invoke-direct {v3, v0, v5}, La/lcr0;-><init>(Ljava/lang/Object;B)V

    .line 848
    .line 849
    .line 850
    invoke-virtual {v1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 851
    .line 852
    .line 853
    :cond_25
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 854
    .line 855
    new-instance v5, La/bw5;

    .line 856
    .line 857
    const/4 v12, 0x1

    .line 858
    invoke-static {v12, v1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 859
    .line 860
    .line 861
    move-result-object v6

    .line 862
    sget-object v7, La/vbw0;->e:La/ugd;

    .line 863
    .line 864
    new-instance v0, La/sqc0;

    .line 865
    .line 866
    const/16 v8, 0x15

    .line 867
    .line 868
    invoke-direct {v0, v8, v4, v2, v3}, La/sqc0;-><init>(BLjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    .line 869
    .line 870
    .line 871
    const v2, -0x1341e37a

    .line 872
    .line 873
    .line 874
    invoke-static {v2, v0, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 875
    .line 876
    .line 877
    move-result-object v9

    .line 878
    const/16 v10, 0xa

    .line 879
    .line 880
    const/4 v8, 0x0

    .line 881
    invoke-direct/range {v5 .. v10}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 882
    .line 883
    .line 884
    const/4 v4, 0x0

    .line 885
    invoke-virtual {v1, v4}, La/fet;->r(Z)V

    .line 886
    .line 887
    .line 888
    return-object v5
.end method
