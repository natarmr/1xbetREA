.class public final Lcom/appsflyer/internal/AFe1cSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final registerClient:Lcom/appsflyer/internal/AFd1uSDK;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFd1uSDK;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/appsflyer/internal/AFe1cSDK;->registerClient:Lcom/appsflyer/internal/AFd1uSDK;

    .line 8
    .line 9
    return-void
.end method

.method private static AFLogger(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-static {}, Lcom/appsflyer/internal/AFe1bSDK;->AFKeystoreWrapper()Lkotlin/text/Regex;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "*Non-printing character*"

    .line 8
    .line 9
    invoke-virtual {v0, p0, v1}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string p0, "JSON toString of eventParams map returns null"

    .line 15
    .line 16
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method


# virtual methods
.method public final registerClient(Ljava/lang/String;Lcom/appsflyer/internal/AFd1pSDK;Ljava/util/Map;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/appsflyer/internal/AFd1pSDK<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p2

    .line 2
    .line 3
    const v0, 0x1d672567

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const-string v3, ""

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 20
    .line 21
    move-object/from16 v6, p3

    .line 22
    .line 23
    :try_start_1
    invoke-direct {v5, v6}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 24
    .line 25
    .line 26
    :try_start_2
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v7
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 30
    :try_start_3
    invoke-static {v7}, Lcom/appsflyer/internal/AFe1cSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0
    :try_end_3
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 34
    :goto_0
    move-object v2, v0

    .line 35
    goto/16 :goto_9

    .line 36
    .line 37
    :catchall_0
    move-exception v0

    .line 38
    move-object v8, v0

    .line 39
    move-object v0, v5

    .line 40
    move-object v2, v7

    .line 41
    goto :goto_2

    .line 42
    :catch_0
    move-exception v0

    .line 43
    move-object v10, v0

    .line 44
    move-object/from16 v17, v7

    .line 45
    .line 46
    goto :goto_3

    .line 47
    :catchall_1
    move-exception v0

    .line 48
    move-object v8, v0

    .line 49
    move-object v2, v4

    .line 50
    move-object v0, v5

    .line 51
    goto :goto_2

    .line 52
    :catch_1
    move-exception v0

    .line 53
    move-object v10, v0

    .line 54
    move-object/from16 v17, v4

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :catchall_2
    move-exception v0

    .line 58
    move-object v8, v0

    .line 59
    move-object v0, v4

    .line 60
    move-object v2, v0

    .line 61
    goto :goto_2

    .line 62
    :catch_2
    move-exception v0

    .line 63
    :goto_1
    move-object v10, v0

    .line 64
    move-object v5, v4

    .line 65
    move-object/from16 v17, v5

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :goto_2
    sget-object v5, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 69
    .line 70
    sget-object v6, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 71
    .line 72
    const/16 v13, 0x78

    .line 73
    .line 74
    const/4 v14, 0x0

    .line 75
    const-string v7, "Unexpected error"

    .line 76
    .line 77
    const/4 v9, 0x0

    .line 78
    const/4 v10, 0x0

    .line 79
    const/4 v11, 0x0

    .line 80
    const/4 v12, 0x0

    .line 81
    invoke-static/range {v5 .. v14}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    move-object v5, v0

    .line 85
    move-object v7, v2

    .line 86
    move-object v2, v3

    .line 87
    goto/16 :goto_9

    .line 88
    .line 89
    :catch_3
    move-exception v0

    .line 90
    move-object/from16 v6, p3

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :goto_3
    sget-object v7, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 94
    .line 95
    sget-object v8, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 96
    .line 97
    const/16 v15, 0x78

    .line 98
    .line 99
    const/16 v16, 0x0

    .line 100
    .line 101
    const-string v9, "JSONObject return null String object. Trying to create AFJsonObject."

    .line 102
    .line 103
    const/4 v11, 0x0

    .line 104
    const/4 v12, 0x0

    .line 105
    const/4 v13, 0x0

    .line 106
    const/4 v14, 0x0

    .line 107
    invoke-static/range {v7 .. v16}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    :try_start_4
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    sget-object v6, Lcom/appsflyer/internal/AFa1bSDK;->getInstance:Ljava/util/Map;

    .line 115
    .line 116
    invoke-interface {v6, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    if-eqz v7, :cond_0

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    shr-int/lit8 v7, v7, 0x18

    .line 128
    .line 129
    int-to-char v7, v7

    .line 130
    const-wide/16 v8, 0x0

    .line 131
    .line 132
    invoke-static {v8, v9}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 133
    .line 134
    .line 135
    move-result v8

    .line 136
    add-int/lit16 v8, v8, 0xc6

    .line 137
    .line 138
    const/4 v9, 0x0

    .line 139
    invoke-static {v9, v9}, Landroid/view/View;->getDefaultSize(II)I

    .line 140
    .line 141
    .line 142
    move-result v9

    .line 143
    add-int/lit8 v9, v9, 0x23

    .line 144
    .line 145
    invoke-static {v7, v8, v9}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    check-cast v7, Ljava/lang/Class;

    .line 150
    .line 151
    const-string v8, "d"

    .line 152
    .line 153
    const-class v9, Ljava/util/Map;

    .line 154
    .line 155
    filled-new-array {v9}, [Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    move-result-object v9

    .line 159
    invoke-virtual {v7, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 160
    .line 161
    .line 162
    move-result-object v7

    .line 163
    invoke-interface {v6, v2, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    :goto_4
    check-cast v7, Ljava/lang/reflect/Method;

    .line 167
    .line 168
    invoke-virtual {v7, v4, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    move-object v7, v0

    .line 173
    check-cast v7, Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 174
    .line 175
    :try_start_5
    invoke-static {v7}, Lcom/appsflyer/internal/AFe1cSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v0
    :try_end_5
    .catch Ljava/lang/NullPointerException; {:try_start_5 .. :try_end_5} :catch_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 179
    goto/16 :goto_0

    .line 180
    .line 181
    :catchall_3
    move-exception v0

    .line 182
    move-object v9, v0

    .line 183
    move-object/from16 v17, v7

    .line 184
    .line 185
    goto :goto_5

    .line 186
    :catch_4
    move-exception v0

    .line 187
    move-object v9, v0

    .line 188
    move-object/from16 v17, v7

    .line 189
    .line 190
    goto :goto_7

    .line 191
    :catch_5
    move-exception v0

    .line 192
    move-object v9, v0

    .line 193
    move-object/from16 v17, v7

    .line 194
    .line 195
    goto :goto_8

    .line 196
    :catchall_4
    move-exception v0

    .line 197
    :try_start_6
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    if-eqz v2, :cond_1

    .line 202
    .line 203
    throw v2

    .line 204
    :catchall_5
    move-exception v0

    .line 205
    move-object v9, v0

    .line 206
    goto :goto_5

    .line 207
    :catch_6
    move-exception v0

    .line 208
    move-object v9, v0

    .line 209
    goto :goto_7

    .line 210
    :catch_7
    move-exception v0

    .line 211
    move-object v9, v0

    .line 212
    goto :goto_8

    .line 213
    :cond_1
    throw v0
    :try_end_6
    .catch Ljava/lang/NullPointerException; {:try_start_6 .. :try_end_6} :catch_7
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 214
    :goto_5
    sget-object v6, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 215
    .line 216
    sget-object v7, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 217
    .line 218
    const/16 v14, 0x78

    .line 219
    .line 220
    const/4 v15, 0x0

    .line 221
    const-string v8, "Unexpected error"

    .line 222
    .line 223
    const/4 v10, 0x0

    .line 224
    const/4 v11, 0x0

    .line 225
    const/4 v12, 0x0

    .line 226
    const/4 v13, 0x0

    .line 227
    invoke-static/range {v6 .. v15}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    :goto_6
    move-object v2, v3

    .line 231
    move-object/from16 v7, v17

    .line 232
    .line 233
    goto :goto_9

    .line 234
    :goto_7
    sget-object v6, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 235
    .line 236
    sget-object v7, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 237
    .line 238
    const/16 v14, 0x60

    .line 239
    .line 240
    const/4 v15, 0x0

    .line 241
    const-string v8, "AFFinalizer: reflection init failed."

    .line 242
    .line 243
    const/4 v10, 0x0

    .line 244
    const/4 v11, 0x0

    .line 245
    const/4 v12, 0x0

    .line 246
    const/4 v13, 0x0

    .line 247
    invoke-static/range {v6 .. v15}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    goto :goto_6

    .line 251
    :goto_8
    sget-object v6, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 252
    .line 253
    sget-object v7, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 254
    .line 255
    const/16 v14, 0x78

    .line 256
    .line 257
    const/4 v15, 0x0

    .line 258
    const-string v8, "AFJsonObject return null String object."

    .line 259
    .line 260
    const/4 v10, 0x0

    .line 261
    const/4 v11, 0x0

    .line 262
    const/4 v12, 0x0

    .line 263
    const/4 v13, 0x0

    .line 264
    invoke-static/range {v6 .. v15}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    goto :goto_6

    .line 268
    :goto_9
    if-nez v7, :cond_2

    .line 269
    .line 270
    goto :goto_a

    .line 271
    :cond_2
    move-object v3, v7

    .line 272
    :goto_a
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    if-nez v0, :cond_3

    .line 277
    .line 278
    sget-object v6, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 279
    .line 280
    sget-object v7, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 281
    .line 282
    const/4 v10, 0x4

    .line 283
    const/4 v11, 0x0

    .line 284
    const-string v8, "Payload contains non-printing characters"

    .line 285
    .line 286
    const/4 v9, 0x0

    .line 287
    invoke-static/range {v6 .. v11}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    :try_start_7
    new-instance v0, Lorg/json/JSONObject;

    .line 291
    .line 292
    invoke-direct {v0, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_7
    .catch Lorg/json/JSONException; {:try_start_7 .. :try_end_7} :catch_8

    .line 293
    .line 294
    .line 295
    move-object v5, v0

    .line 296
    goto :goto_b

    .line 297
    :catch_8
    move-exception v0

    .line 298
    move-object v9, v0

    .line 299
    sget-object v6, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 300
    .line 301
    sget-object v7, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 302
    .line 303
    const/16 v14, 0x78

    .line 304
    .line 305
    const/4 v15, 0x0

    .line 306
    const-string v8, "Couldn\'t parse the payload to a json object"

    .line 307
    .line 308
    const/4 v10, 0x0

    .line 309
    const/4 v11, 0x0

    .line 310
    const/4 v12, 0x0

    .line 311
    const/4 v13, 0x0

    .line 312
    invoke-static/range {v6 .. v15}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    goto :goto_b

    .line 316
    :cond_3
    move-object v2, v3

    .line 317
    :goto_b
    new-instance v0, Ljava/lang/StringBuilder;

    .line 318
    .line 319
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 320
    .line 321
    .line 322
    move-object/from16 v3, p1

    .line 323
    .line 324
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    const-string v3, ": preparing data: "

    .line 328
    .line 329
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    invoke-static {v0, v5}, Lcom/appsflyer/internal/AFg1bSDK;->registerClient(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 337
    .line 338
    .line 339
    if-eqz v1, :cond_4

    .line 340
    .line 341
    iget-object v0, v1, Lcom/appsflyer/internal/AFd1pSDK;->unregisterClient:Lcom/appsflyer/internal/AFd1oSDK;

    .line 342
    .line 343
    if-eqz v0, :cond_4

    .line 344
    .line 345
    iget-object v4, v0, Lcom/appsflyer/internal/AFd1oSDK;->d:Ljava/lang/String;

    .line 346
    .line 347
    :cond_4
    move-object/from16 v1, p0

    .line 348
    .line 349
    iget-object v0, v1, Lcom/appsflyer/internal/AFe1cSDK;->registerClient:Lcom/appsflyer/internal/AFd1uSDK;

    .line 350
    .line 351
    invoke-interface {v0, v4, v2}, Lcom/appsflyer/internal/AFd1uSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    return-void
.end method
