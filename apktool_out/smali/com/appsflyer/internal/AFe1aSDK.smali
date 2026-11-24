.class public final Lcom/appsflyer/internal/AFe1aSDK;
.super Lcom/appsflyer/internal/AFe1kSDK;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/internal/AFe1aSDK$AFa1ySDK;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/appsflyer/internal/AFe1kSDK<",
        "Ljava/util/Map<",
        "Ljava/lang/String;",
        "+",
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation


# instance fields
.field private AFLoggerLogLevel:Ljava/lang/String;

.field private final afDebugLog:Ljava/util/UUID;

.field private afErrorLog:Ljava/lang/String;

.field private afInfoLog:Ljava/lang/String;

.field public force:Lcom/appsflyer/internal/AFe1aSDK$AFa1ySDK;

.field public final v:Z


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFc1bSDK;Ljava/util/UUID;Landroid/net/Uri;)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const v0, -0x7c1b5be4

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const v2, 0x59e3c68a

    .line 11
    .line 12
    .line 13
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const v3, 0xf8e7231

    .line 18
    .line 19
    .line 20
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    const v4, 0x5b131229

    .line 25
    .line 26
    .line 27
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    sget-object v5, Lcom/appsflyer/internal/AFd1bSDK;->i:Lcom/appsflyer/internal/AFd1bSDK;

    .line 41
    .line 42
    const/4 v6, 0x1

    .line 43
    new-array v7, v6, [Lcom/appsflyer/internal/AFe1zSDK;

    .line 44
    .line 45
    sget-object v8, Lcom/appsflyer/internal/AFd1bSDK;->d:Lcom/appsflyer/internal/AFd1bSDK;

    .line 46
    .line 47
    const/4 v9, 0x0

    .line 48
    aput-object v8, v7, v9

    .line 49
    .line 50
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    move-object/from16 v10, p1

    .line 55
    .line 56
    invoke-direct {v1, v5, v7, v10, v8}, Lcom/appsflyer/internal/AFe1kSDK;-><init>(Lcom/appsflyer/internal/AFe1zSDK;[Lcom/appsflyer/internal/AFe1zSDK;Lcom/appsflyer/internal/AFc1bSDK;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    move-object/from16 v5, p2

    .line 60
    .line 61
    iput-object v5, v1, Lcom/appsflyer/internal/AFe1aSDK;->afDebugLog:Ljava/util/UUID;

    .line 62
    .line 63
    :try_start_0
    invoke-virtual/range {p3 .. p3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    invoke-virtual/range {p3 .. p3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    if-eqz v5, :cond_b

    .line 72
    .line 73
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-nez v5, :cond_0

    .line 78
    .line 79
    goto/16 :goto_6

    .line 80
    .line 81
    :cond_0
    if-eqz v7, :cond_b

    .line 82
    .line 83
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-nez v5, :cond_1

    .line 88
    .line 89
    goto/16 :goto_6

    .line 90
    .line 91
    :cond_1
    invoke-interface {v10}, Lcom/appsflyer/internal/AFc1bSDK;->enableTCFDataCollection()Lcom/appsflyer/internal/AFa1qSDK;

    .line 92
    .line 93
    .line 94
    move-result-object v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 95
    const/4 v8, 0x2

    .line 96
    :try_start_1
    new-array v10, v8, [Ljava/lang/Object;

    .line 97
    .line 98
    aput-object v5, v10, v6

    .line 99
    .line 100
    aput-object p3, v10, v9

    .line 101
    .line 102
    sget-object v5, Lcom/appsflyer/internal/AFa1bSDK;->getInstance:Ljava/util/Map;

    .line 103
    .line 104
    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 108
    const-string v12, ""

    .line 109
    .line 110
    if-eqz v11, :cond_2

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_2
    :try_start_2
    invoke-static {v12, v9}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    .line 114
    .line 115
    .line 116
    move-result v11

    .line 117
    const v13, 0xa1c8

    .line 118
    .line 119
    .line 120
    sub-int/2addr v13, v11

    .line 121
    int-to-char v11, v13

    .line 122
    invoke-static {v9, v9}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 123
    .line 124
    .line 125
    move-result v13

    .line 126
    invoke-static {v12, v9, v9}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 127
    .line 128
    .line 129
    move-result v14

    .line 130
    add-int/lit8 v14, v14, 0x25

    .line 131
    .line 132
    invoke-static {v11, v13, v14}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v11

    .line 136
    check-cast v11, Ljava/lang/Class;

    .line 137
    .line 138
    const-class v13, Landroid/net/Uri;

    .line 139
    .line 140
    const-class v14, Lcom/appsflyer/internal/AFa1qSDK;

    .line 141
    .line 142
    filled-new-array {v13, v14}, [Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    move-result-object v13

    .line 146
    invoke-virtual {v11, v13}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 147
    .line 148
    .line 149
    move-result-object v11

    .line 150
    invoke-interface {v5, v4, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    :goto_0
    check-cast v11, Ljava/lang/reflect/Constructor;

    .line 154
    .line 155
    invoke-virtual {v11, v10}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 159
    :try_start_3
    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v10
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 163
    const-string v11, "AFLogger"

    .line 164
    .line 165
    const/4 v13, 0x0

    .line 166
    if-eqz v10, :cond_3

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_3
    const/16 v10, 0x30

    .line 170
    .line 171
    :try_start_4
    invoke-static {v12, v10}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    .line 172
    .line 173
    .line 174
    move-result v10

    .line 175
    const v14, 0xa1c7

    .line 176
    .line 177
    .line 178
    sub-int/2addr v14, v10

    .line 179
    int-to-char v10, v14

    .line 180
    invoke-static {v9, v9}, Landroid/view/View;->resolveSize(II)I

    .line 181
    .line 182
    .line 183
    move-result v14

    .line 184
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 185
    .line 186
    .line 187
    move-result v15

    .line 188
    const/16 v16, 0x0

    .line 189
    .line 190
    cmpl-float v15, v15, v16

    .line 191
    .line 192
    rsub-int/lit8 v15, v15, 0x25

    .line 193
    .line 194
    invoke-static {v10, v14, v15}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v10

    .line 198
    check-cast v10, Ljava/lang/Class;

    .line 199
    .line 200
    invoke-virtual {v10, v11, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 201
    .line 202
    .line 203
    move-result-object v10

    .line 204
    invoke-interface {v5, v3, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    :goto_1
    check-cast v10, Ljava/lang/reflect/Method;

    .line 208
    .line 209
    invoke-virtual {v10, v4, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 213
    :try_start_5
    invoke-interface {v5, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    const/4 v10, 0x6

    .line 218
    if-eqz v4, :cond_4

    .line 219
    .line 220
    goto :goto_2

    .line 221
    :cond_4
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    shr-int/lit8 v4, v4, 0x8

    .line 226
    .line 227
    int-to-char v4, v4

    .line 228
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 229
    .line 230
    .line 231
    move-result-wide v14

    .line 232
    const-wide/16 v16, 0x0

    .line 233
    .line 234
    cmp-long v14, v14, v16

    .line 235
    .line 236
    rsub-int/lit8 v14, v14, 0x26

    .line 237
    .line 238
    invoke-static {v9}, Landroid/os/Process;->getThreadPriority(I)I

    .line 239
    .line 240
    .line 241
    move-result v15

    .line 242
    add-int/lit8 v15, v15, 0x14

    .line 243
    .line 244
    shr-int/2addr v15, v10

    .line 245
    rsub-int/lit8 v15, v15, 0x32

    .line 246
    .line 247
    invoke-static {v4, v14, v15}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    check-cast v4, Ljava/lang/Class;

    .line 252
    .line 253
    invoke-virtual {v4, v11, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    invoke-interface {v5, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    :goto_2
    check-cast v4, Ljava/lang/reflect/Method;

    .line 261
    .line 262
    invoke-virtual {v4, v3, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    check-cast v2, Ljava/lang/Boolean;

    .line 267
    .line 268
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 269
    .line 270
    .line 271
    move-result v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 272
    :try_start_6
    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    if-eqz v4, :cond_5

    .line 277
    .line 278
    goto :goto_3

    .line 279
    :cond_5
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 280
    .line 281
    .line 282
    move-result v4

    .line 283
    shr-int/lit8 v4, v4, 0x10

    .line 284
    .line 285
    int-to-char v4, v4

    .line 286
    invoke-static {v12, v9}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    .line 287
    .line 288
    .line 289
    move-result v11

    .line 290
    add-int/lit8 v11, v11, 0x25

    .line 291
    .line 292
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 293
    .line 294
    .line 295
    move-result v12

    .line 296
    shr-int/lit8 v12, v12, 0x10

    .line 297
    .line 298
    rsub-int/lit8 v12, v12, 0x32

    .line 299
    .line 300
    invoke-static {v4, v11, v12}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v4

    .line 304
    check-cast v4, Ljava/lang/Class;

    .line 305
    .line 306
    const-string v11, "unregisterClient"

    .line 307
    .line 308
    invoke-virtual {v4, v11, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 309
    .line 310
    .line 311
    move-result-object v4

    .line 312
    invoke-interface {v5, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    :goto_3
    check-cast v4, Ljava/lang/reflect/Method;

    .line 316
    .line 317
    invoke-virtual {v4, v3, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    check-cast v0, Ljava/lang/Boolean;

    .line 322
    .line 323
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 324
    .line 325
    .line 326
    move-result v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 327
    :try_start_7
    const-string v0, "/"

    .line 328
    .line 329
    filled-new-array {v0}, [Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    invoke-static {v7, v0, v9, v10}, Lkotlin/text/StringsKt;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    if-eqz v2, :cond_6

    .line 338
    .line 339
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 340
    .line 341
    .line 342
    move-result v2

    .line 343
    const/4 v4, 0x3

    .line 344
    if-ne v2, v4, :cond_6

    .line 345
    .line 346
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    check-cast v2, Ljava/lang/String;

    .line 351
    .line 352
    iput-object v2, v1, Lcom/appsflyer/internal/AFe1aSDK;->afInfoLog:Ljava/lang/String;

    .line 353
    .line 354
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    check-cast v0, Ljava/lang/String;

    .line 359
    .line 360
    iput-object v0, v1, Lcom/appsflyer/internal/AFe1aSDK;->afErrorLog:Ljava/lang/String;

    .line 361
    .line 362
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    iput-object v0, v1, Lcom/appsflyer/internal/AFe1aSDK;->AFLoggerLogLevel:Ljava/lang/String;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    .line 367
    .line 368
    goto :goto_4

    .line 369
    :catch_0
    move-exception v0

    .line 370
    move-object v13, v0

    .line 371
    move v9, v3

    .line 372
    goto :goto_5

    .line 373
    :cond_6
    :goto_4
    move v9, v3

    .line 374
    goto :goto_6

    .line 375
    :catchall_0
    move-exception v0

    .line 376
    :try_start_8
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 377
    .line 378
    .line 379
    move-result-object v2

    .line 380
    if-eqz v2, :cond_7

    .line 381
    .line 382
    throw v2

    .line 383
    :catch_1
    move-exception v0

    .line 384
    move-object v13, v0

    .line 385
    goto :goto_5

    .line 386
    :cond_7
    throw v0

    .line 387
    :catchall_1
    move-exception v0

    .line 388
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    if-eqz v2, :cond_8

    .line 393
    .line 394
    throw v2

    .line 395
    :cond_8
    throw v0

    .line 396
    :catchall_2
    move-exception v0

    .line 397
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 398
    .line 399
    .line 400
    move-result-object v2

    .line 401
    if-eqz v2, :cond_9

    .line 402
    .line 403
    throw v2

    .line 404
    :cond_9
    throw v0

    .line 405
    :catchall_3
    move-exception v0

    .line 406
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    if-eqz v2, :cond_a

    .line 411
    .line 412
    throw v2

    .line 413
    :cond_a
    throw v0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1

    .line 414
    :goto_5
    sget-object v10, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 415
    .line 416
    sget-object v11, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 417
    .line 418
    const/16 v18, 0x60

    .line 419
    .line 420
    const/16 v19, 0x0

    .line 421
    .line 422
    const-string v12, "OneLinkValidator: reflection init failed"

    .line 423
    .line 424
    const/4 v14, 0x0

    .line 425
    const/4 v15, 0x0

    .line 426
    const/16 v16, 0x0

    .line 427
    .line 428
    const/16 v17, 0x0

    .line 429
    .line 430
    invoke-static/range {v10 .. v19}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 431
    .line 432
    .line 433
    :cond_b
    :goto_6
    iput-boolean v9, v1, Lcom/appsflyer/internal/AFe1aSDK;->v:Z

    .line 434
    .line 435
    return-void
.end method


# virtual methods
.method public final AFLogger(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1pSDK;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/appsflyer/internal/AFd1pSDK<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFe1kSDK;->afDebugLog()Lcom/appsflyer/internal/AFd1sSDK;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1aSDK;->afInfoLog:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const-string v3, "Required value was null."

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    iget-object v4, p0, Lcom/appsflyer/internal/AFe1aSDK;->afErrorLog:Ljava/lang/String;

    .line 16
    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    iget-object p0, p0, Lcom/appsflyer/internal/AFe1aSDK;->afDebugLog:Ljava/util/UUID;

    .line 20
    .line 21
    invoke-virtual {v0, v1, v4, p0, p1}, Lcom/appsflyer/internal/AFd1sSDK;->d(Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1pSDK;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_0
    invoke-static {v3}, La/jf4;->o(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object v2

    .line 33
    :cond_1
    invoke-static {v3}, La/jf4;->o(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object v2
.end method

.method public final bridge synthetic AFLogger()Z
    .locals 0

    .line 37
    const/4 p0, 0x0

    return p0
.end method

.method public final a_()Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public final afWarnLog()Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method

.method public final d()J
    .locals 2

    .line 1
    invoke-static {}, Lcom/appsflyer/internal/AFf1wSDK;->registerClient()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public final e()Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public final force()V
    .locals 4

    .line 1
    invoke-super {p0}, Lcom/appsflyer/internal/AFe1kSDK;->force()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1aSDK;->force:Lcom/appsflyer/internal/AFe1aSDK$AFa1ySDK;

    .line 5
    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1kSDK;->i:Lcom/appsflyer/internal/AFd1fSDK;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/appsflyer/internal/AFe1ySDK;->w:Lcom/appsflyer/internal/AFd1cSDK;

    .line 11
    .line 12
    sget-object v3, Lcom/appsflyer/internal/AFd1cSDK;->d:Lcom/appsflyer/internal/AFd1cSDK;

    .line 13
    .line 14
    if-ne v2, v3, :cond_0

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/appsflyer/internal/AFd1fSDK;->getBody()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    check-cast p0, Ljava/util/Map;

    .line 26
    .line 27
    invoke-interface {v0, p0}, Lcom/appsflyer/internal/AFe1aSDK$AFa1ySDK;->unregisterClient(Ljava/util/Map;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFe1ySDK;->AFKeystoreWrapper()Ljava/lang/Throwable;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    instance-of v2, v1, Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException;

    .line 36
    .line 37
    const-string v3, "Can\'t get OneLink data"

    .line 38
    .line 39
    if-eqz v2, :cond_3

    .line 40
    .line 41
    check-cast v1, Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException;

    .line 42
    .line 43
    invoke-virtual {v1}, Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException;->getRawResponse()Lcom/appsflyer/internal/AFd1fSDK;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1}, Lcom/appsflyer/internal/AFd1fSDK;->isSuccessful()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    const-string v3, "Can\'t parse one link data"

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    iget-object p0, p0, Lcom/appsflyer/internal/AFe1aSDK;->AFLoggerLogLevel:Ljava/lang/String;

    .line 57
    .line 58
    if-nez p0, :cond_2

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    move-object v3, p0

    .line 62
    :goto_0
    invoke-interface {v0, v3}, Lcom/appsflyer/internal/AFe1aSDK$AFa1ySDK;->d(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_3
    iget-object p0, p0, Lcom/appsflyer/internal/AFe1aSDK;->AFLoggerLogLevel:Ljava/lang/String;

    .line 67
    .line 68
    if-nez p0, :cond_4

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_4
    move-object v3, p0

    .line 72
    :goto_1
    invoke-interface {v0, v3}, Lcom/appsflyer/internal/AFe1aSDK$AFa1ySDK;->d(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :cond_5
    return-void
.end method

.method public final values()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1aSDK;->afInfoLog:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1aSDK;->afErrorLog:Ljava/lang/String;

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget-object p0, p0, Lcom/appsflyer/internal/AFe1aSDK;->afInfoLog:Ljava/lang/String;

    .line 24
    .line 25
    const-string v0, "app"

    .line 26
    .line 27
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-nez p0, :cond_2

    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    return p0

    .line 35
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 36
    return p0
.end method
