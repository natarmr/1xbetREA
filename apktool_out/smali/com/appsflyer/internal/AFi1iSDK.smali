.class public final Lcom/appsflyer/internal/AFi1iSDK;
.super Lcom/appsflyer/sdk_base/referrer/Referrer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/internal/AFi1iSDK$AFa1ySDK;
    }
.end annotation


# instance fields
.field private AFKeystoreWrapper:Ljava/lang/String;

.field private final d:Lcom/appsflyer/internal/AFc1iSDK;

.field private final registerClient:Lcom/appsflyer/internal/AFi1jSDK;

.field private final unregisterClient:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFi1jSDK;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget-object v0, Lcom/appsflyer/internal/AFi1fSDK$AFa1tSDK;->AFKeystoreWrapper:[I

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    aget v0, v0, v1

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    if-eq v0, v1, :cond_2

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    if-eq v0, v1, :cond_1

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    if-ne v0, v1, :cond_0

    .line 29
    .line 30
    const-string v0, "facebook_lite"

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    throw p0

    .line 38
    :cond_1
    const-string v0, "instagram"

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    const-string v0, "facebook"

    .line 42
    .line 43
    :goto_0
    const-string v1, "app"

    .line 44
    .line 45
    invoke-direct {p0, v1, v0, p3}, Lcom/appsflyer/sdk_base/referrer/Referrer;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lcom/appsflyer/internal/AFi1iSDK;->d:Lcom/appsflyer/internal/AFc1iSDK;

    .line 49
    .line 50
    iput-object p2, p0, Lcom/appsflyer/internal/AFi1iSDK;->registerClient:Lcom/appsflyer/internal/AFi1jSDK;

    .line 51
    .line 52
    iput-object p4, p0, Lcom/appsflyer/internal/AFi1iSDK;->unregisterClient:Ljava/lang/Runnable;

    .line 53
    .line 54
    return-void
.end method

.method public static synthetic a(Lcom/appsflyer/internal/AFi1iSDK;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/appsflyer/internal/AFi1iSDK;->d(Lcom/appsflyer/internal/AFi1iSDK;Landroid/content/Context;)V

    return-void
.end method

.method private static final d(Lcom/appsflyer/internal/AFi1iSDK;Landroid/content/Context;)V
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const-string v2, "content://com.facebook.katana.provider.InstallReferrerProvider/"

    .line 6
    .line 7
    const-string v3, "content://com.instagram.contentprovider.InstallReferrerProvider/"

    .line 8
    .line 9
    const-string v4, "content://com.facebook.lite.provider.InstallReferrerProvider/"

    .line 10
    .line 11
    const-string v5, " provider"

    .line 12
    .line 13
    const-string v6, "actual_timestamp"

    .line 14
    .line 15
    const-string v7, "install_referrer"

    .line 16
    .line 17
    const-string v8, "is_ct"

    .line 18
    .line 19
    const-string v9, "Error while collecting Meta Install Referrer for "

    .line 20
    .line 21
    const-string v10, "Collected "

    .line 22
    .line 23
    const-string v11, "No such column, "

    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/appsflyer/sdk_base/referrer/Referrer;->start()V

    .line 26
    .line 27
    .line 28
    iget-object v12, v1, Lcom/appsflyer/internal/AFi1iSDK;->AFKeystoreWrapper:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    :try_start_0
    iget-object v14, v1, Lcom/appsflyer/internal/AFi1iSDK;->registerClient:Lcom/appsflyer/internal/AFi1jSDK;

    .line 34
    .line 35
    sget-object v15, Lcom/appsflyer/internal/AFi1iSDK$AFa1ySDK;->AFKeystoreWrapper:[I

    .line 36
    .line 37
    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    .line 38
    .line 39
    .line 40
    move-result v14

    .line 41
    aget v14, v15, v14

    .line 42
    .line 43
    const/4 v13, 0x1

    .line 44
    move-object/from16 v18, v15

    .line 45
    .line 46
    const/4 v15, 0x0

    .line 47
    if-eq v14, v13, :cond_4

    .line 48
    .line 49
    const/4 v13, 0x2

    .line 50
    if-eq v14, v13, :cond_2

    .line 51
    .line 52
    const/4 v2, 0x3

    .line 53
    if-ne v14, v2, :cond_1

    .line 54
    .line 55
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    const-string v3, "com.facebook.lite.provider.InstallReferrerProvider"

    .line 60
    .line 61
    invoke-virtual {v2, v3, v15}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    if-eqz v2, :cond_0

    .line 66
    .line 67
    sget-object v20, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 68
    .line 69
    sget-object v21, Lcom/appsflyer/sdk_base/logger/LogTag;->META_REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 70
    .line 71
    const-string v22, "Found Facebook Lite content provider"

    .line 72
    .line 73
    const/16 v24, 0x4

    .line 74
    .line 75
    const/16 v25, 0x0

    .line 76
    .line 77
    const/16 v23, 0x0

    .line 78
    .line 79
    invoke-static/range {v20 .. v25}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    goto/16 :goto_2

    .line 91
    .line 92
    :catchall_0
    move-exception v0

    .line 93
    move-object/from16 v19, v0

    .line 94
    .line 95
    const/4 v3, 0x0

    .line 96
    :goto_0
    const/4 v13, 0x0

    .line 97
    goto/16 :goto_a

    .line 98
    .line 99
    :cond_0
    sget-object v20, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 100
    .line 101
    sget-object v21, Lcom/appsflyer/sdk_base/logger/LogTag;->META_REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 102
    .line 103
    const-string v22, "Facebook Lite content provider not found"

    .line 104
    .line 105
    const/16 v24, 0x4

    .line 106
    .line 107
    const/16 v25, 0x0

    .line 108
    .line 109
    const/16 v23, 0x0

    .line 110
    .line 111
    invoke-static/range {v20 .. v25}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    :goto_1
    const/4 v2, 0x0

    .line 115
    goto :goto_2

    .line 116
    :cond_1
    new-instance v0, La/m460;

    .line 117
    .line 118
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 119
    .line 120
    .line 121
    throw v0

    .line 122
    :cond_2
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    const-string v4, "com.instagram.contentprovider.InstallReferrerProvider"

    .line 127
    .line 128
    invoke-virtual {v2, v4, v15}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    if-eqz v2, :cond_3

    .line 133
    .line 134
    sget-object v20, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 135
    .line 136
    sget-object v21, Lcom/appsflyer/sdk_base/logger/LogTag;->META_REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 137
    .line 138
    const-string v22, "Found Instagram content provider"

    .line 139
    .line 140
    const/16 v24, 0x4

    .line 141
    .line 142
    const/16 v25, 0x0

    .line 143
    .line 144
    const/16 v23, 0x0

    .line 145
    .line 146
    invoke-static/range {v20 .. v25}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v3, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    goto :goto_2

    .line 158
    :cond_3
    sget-object v20, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 159
    .line 160
    sget-object v21, Lcom/appsflyer/sdk_base/logger/LogTag;->META_REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 161
    .line 162
    const-string v22, "Instagram content provider not found"

    .line 163
    .line 164
    const/16 v24, 0x4

    .line 165
    .line 166
    const/16 v25, 0x0

    .line 167
    .line 168
    const/16 v23, 0x0

    .line 169
    .line 170
    invoke-static/range {v20 .. v25}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_4
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    const-string v4, "com.facebook.katana.provider.InstallReferrerProvider"

    .line 179
    .line 180
    invoke-virtual {v3, v4, v15}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    if-eqz v3, :cond_5

    .line 185
    .line 186
    sget-object v20, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 187
    .line 188
    sget-object v21, Lcom/appsflyer/sdk_base/logger/LogTag;->META_REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 189
    .line 190
    const-string v22, "Found Facebook content provider"

    .line 191
    .line 192
    const/16 v24, 0x4

    .line 193
    .line 194
    const/16 v25, 0x0

    .line 195
    .line 196
    const/16 v23, 0x0

    .line 197
    .line 198
    invoke-static/range {v20 .. v25}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    goto :goto_2

    .line 210
    :cond_5
    sget-object v20, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 211
    .line 212
    sget-object v21, Lcom/appsflyer/sdk_base/logger/LogTag;->META_REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 213
    .line 214
    const-string v22, "Facebook content provider not found"

    .line 215
    .line 216
    const/16 v24, 0x4

    .line 217
    .line 218
    const/16 v25, 0x0

    .line 219
    .line 220
    const/16 v23, 0x0

    .line 221
    .line 222
    invoke-static/range {v20 .. v25}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    goto :goto_1

    .line 226
    :goto_2
    if-nez v2, :cond_6

    .line 227
    .line 228
    goto/16 :goto_b

    .line 229
    .line 230
    :cond_6
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    invoke-virtual {v3, v2}, Landroid/content/ContentResolver;->acquireUnstableContentProviderClient(Landroid/net/Uri;)Landroid/content/ContentProviderClient;

    .line 235
    .line 236
    .line 237
    move-result-object v22
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 238
    :try_start_1
    filled-new-array {v7, v8, v6}, [Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v24

    .line 242
    if-eqz v22, :cond_7

    .line 243
    .line 244
    const/16 v26, 0x0

    .line 245
    .line 246
    const/16 v27, 0x0

    .line 247
    .line 248
    const/16 v25, 0x0

    .line 249
    .line 250
    move-object/from16 v23, v2

    .line 251
    .line 252
    invoke-virtual/range {v22 .. v27}, Landroid/content/ContentProviderClient;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 253
    .line 254
    .line 255
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 256
    move-object/from16 v3, v22

    .line 257
    .line 258
    goto :goto_3

    .line 259
    :catchall_1
    move-exception v0

    .line 260
    move-object/from16 v3, v22

    .line 261
    .line 262
    move-object/from16 v19, v0

    .line 263
    .line 264
    goto/16 :goto_0

    .line 265
    .line 266
    :cond_7
    move-object/from16 v3, v22

    .line 267
    .line 268
    const/4 v2, 0x0

    .line 269
    :goto_3
    if-eqz v2, :cond_12

    .line 270
    .line 271
    :try_start_2
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 272
    .line 273
    .line 274
    move-result v4

    .line 275
    if-nez v4, :cond_8

    .line 276
    .line 277
    goto/16 :goto_9

    .line 278
    .line 279
    :cond_8
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 280
    .line 281
    .line 282
    move-result v4

    .line 283
    const/4 v7, -0x1

    .line 284
    if-eq v4, v7, :cond_9

    .line 285
    .line 286
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v4

    .line 290
    goto :goto_4

    .line 291
    :catchall_2
    move-exception v0

    .line 292
    move-object/from16 v19, v0

    .line 293
    .line 294
    move-object v13, v2

    .line 295
    goto/16 :goto_a

    .line 296
    .line 297
    :cond_9
    iget-object v4, v1, Lcom/appsflyer/internal/AFi1iSDK;->registerClient:Lcom/appsflyer/internal/AFi1jSDK;

    .line 298
    .line 299
    new-instance v12, Ljava/lang/StringBuilder;

    .line 300
    .line 301
    invoke-direct {v12, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v22

    .line 314
    const/16 v24, 0x4

    .line 315
    .line 316
    const/16 v25, 0x0

    .line 317
    .line 318
    const/16 v23, 0x0

    .line 319
    .line 320
    invoke-static/range {v20 .. v25}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    const/4 v4, 0x0

    .line 324
    :goto_4
    if-eqz v4, :cond_11

    .line 325
    .line 326
    iget-object v11, v1, Lcom/appsflyer/internal/AFi1iSDK;->registerClient:Lcom/appsflyer/internal/AFi1jSDK;

    .line 327
    .line 328
    new-instance v12, Ljava/lang/StringBuilder;

    .line 329
    .line 330
    invoke-direct {v12, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    const-string v10, " attribution data."

    .line 337
    .line 338
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v22

    .line 345
    const/16 v24, 0x4

    .line 346
    .line 347
    const/16 v25, 0x0

    .line 348
    .line 349
    const/16 v23, 0x0

    .line 350
    .line 351
    invoke-static/range {v20 .. v25}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    iget-object v10, v1, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 355
    .line 356
    const-string v11, "response"

    .line 357
    .line 358
    const-string v12, "OK"

    .line 359
    .line 360
    invoke-interface {v10, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    iget-object v10, v1, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 364
    .line 365
    const-string v11, "referrer"

    .line 366
    .line 367
    invoke-interface {v10, v11, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 371
    .line 372
    .line 373
    move-result v4

    .line 374
    if-eq v4, v7, :cond_a

    .line 375
    .line 376
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getLong(I)J

    .line 377
    .line 378
    .line 379
    move-result-wide v10

    .line 380
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 381
    .line 382
    .line 383
    move-result-object v4

    .line 384
    goto :goto_5

    .line 385
    :cond_a
    const/4 v4, 0x0

    .line 386
    :goto_5
    if-eqz v4, :cond_b

    .line 387
    .line 388
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 389
    .line 390
    .line 391
    move-result-wide v10

    .line 392
    iget-object v4, v1, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 393
    .line 394
    const-string v6, "click_ts"

    .line 395
    .line 396
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 397
    .line 398
    .line 399
    move-result-object v10

    .line 400
    invoke-interface {v4, v6, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    :cond_b
    invoke-interface {v2, v8}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 404
    .line 405
    .line 406
    move-result v4

    .line 407
    if-eq v4, v7, :cond_c

    .line 408
    .line 409
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getInt(I)I

    .line 410
    .line 411
    .line 412
    move-result v4

    .line 413
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 414
    .line 415
    .line 416
    move-result-object v13

    .line 417
    goto :goto_6

    .line 418
    :cond_c
    const/4 v13, 0x0

    .line 419
    :goto_6
    if-eqz v13, :cond_d

    .line 420
    .line 421
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 422
    .line 423
    .line 424
    move-result v4

    .line 425
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 426
    .line 427
    .line 428
    move-result-object v4

    .line 429
    new-instance v6, Lkotlin/Pair;

    .line 430
    .line 431
    invoke-direct {v6, v8, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    filled-new-array {v6}, [Lkotlin/Pair;

    .line 435
    .line 436
    .line 437
    move-result-object v4

    .line 438
    invoke-static {v4}, La/xp20;->h([Lkotlin/Pair;)Ljava/util/LinkedHashMap;

    .line 439
    .line 440
    .line 441
    move-result-object v4

    .line 442
    iget-object v6, v1, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 443
    .line 444
    const-string v7, "meta_custom"

    .line 445
    .line 446
    invoke-interface {v6, v7, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    :cond_d
    iget-object v4, v1, Lcom/appsflyer/internal/AFi1iSDK;->registerClient:Lcom/appsflyer/internal/AFi1jSDK;

    .line 450
    .line 451
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 452
    .line 453
    .line 454
    move-result v4

    .line 455
    aget v4, v18, v4

    .line 456
    .line 457
    const/4 v6, 0x1

    .line 458
    if-eq v4, v6, :cond_10

    .line 459
    .line 460
    const/4 v13, 0x2

    .line 461
    if-eq v4, v13, :cond_f

    .line 462
    .line 463
    const/4 v6, 0x3

    .line 464
    if-ne v4, v6, :cond_e

    .line 465
    .line 466
    const-string v4, "com.facebook.lite"

    .line 467
    .line 468
    goto :goto_7

    .line 469
    :cond_e
    new-instance v0, La/m460;

    .line 470
    .line 471
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 472
    .line 473
    .line 474
    throw v0

    .line 475
    :cond_f
    const-string v4, "com.instagram.android"

    .line 476
    .line 477
    goto :goto_7

    .line 478
    :cond_10
    const-string v4, "com.facebook.katana"

    .line 479
    .line 480
    :goto_7
    iget-object v6, v1, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 481
    .line 482
    const-string v7, "api_ver"

    .line 483
    .line 484
    invoke-static {v0, v4}, Lcom/appsflyer/internal/AFj1qSDK;->unregisterClient(Landroid/content/Context;Ljava/lang/String;)J

    .line 485
    .line 486
    .line 487
    move-result-wide v10

    .line 488
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 489
    .line 490
    .line 491
    move-result-object v8

    .line 492
    invoke-interface {v6, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    iget-object v6, v1, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 496
    .line 497
    const-string v7, "api_ver_name"

    .line 498
    .line 499
    invoke-static {v0, v4}, Lcom/appsflyer/internal/AFj1qSDK;->AFKeystoreWrapper(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    invoke-interface {v6, v7, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 504
    .line 505
    .line 506
    :cond_11
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 507
    .line 508
    .line 509
    if-eqz v3, :cond_15

    .line 510
    .line 511
    :goto_8
    invoke-virtual {v3}, Landroid/content/ContentProviderClient;->close()V

    .line 512
    .line 513
    .line 514
    goto :goto_b

    .line 515
    :cond_12
    :goto_9
    :try_start_3
    const-string v22, "Content provider returned no data"

    .line 516
    .line 517
    const/16 v24, 0x4

    .line 518
    .line 519
    const/16 v25, 0x0

    .line 520
    .line 521
    const/16 v23, 0x0

    .line 522
    .line 523
    invoke-static/range {v20 .. v25}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 524
    .line 525
    .line 526
    if-eqz v2, :cond_13

    .line 527
    .line 528
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 529
    .line 530
    .line 531
    :cond_13
    if-eqz v3, :cond_15

    .line 532
    .line 533
    goto :goto_8

    .line 534
    :goto_a
    :try_start_4
    sget-object v16, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 535
    .line 536
    sget-object v17, Lcom/appsflyer/sdk_base/logger/LogTag;->META_REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 537
    .line 538
    iget-object v0, v1, Lcom/appsflyer/internal/AFi1iSDK;->registerClient:Lcom/appsflyer/internal/AFi1jSDK;

    .line 539
    .line 540
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    new-instance v2, Ljava/lang/StringBuilder;

    .line 545
    .line 546
    invoke-direct {v2, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 550
    .line 551
    .line 552
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    move-result-object v18

    .line 559
    const/16 v24, 0x78

    .line 560
    .line 561
    const/16 v25, 0x0

    .line 562
    .line 563
    const/16 v20, 0x0

    .line 564
    .line 565
    const/16 v21, 0x0

    .line 566
    .line 567
    const/16 v22, 0x0

    .line 568
    .line 569
    const/16 v23, 0x0

    .line 570
    .line 571
    invoke-static/range {v16 .. v25}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 572
    .line 573
    .line 574
    if-eqz v13, :cond_14

    .line 575
    .line 576
    invoke-interface {v13}, Landroid/database/Cursor;->close()V

    .line 577
    .line 578
    .line 579
    :cond_14
    if-eqz v3, :cond_15

    .line 580
    .line 581
    goto :goto_8

    .line 582
    :cond_15
    :goto_b
    invoke-virtual {v1}, Lcom/appsflyer/sdk_base/referrer/Referrer;->finish()V

    .line 583
    .line 584
    .line 585
    iget-object v0, v1, Lcom/appsflyer/internal/AFi1iSDK;->unregisterClient:Ljava/lang/Runnable;

    .line 586
    .line 587
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 588
    .line 589
    .line 590
    return-void

    .line 591
    :catchall_3
    move-exception v0

    .line 592
    if-eqz v13, :cond_16

    .line 593
    .line 594
    invoke-interface {v13}, Landroid/database/Cursor;->close()V

    .line 595
    .line 596
    .line 597
    :cond_16
    if-eqz v3, :cond_17

    .line 598
    .line 599
    invoke-virtual {v3}, Landroid/content/ContentProviderClient;->close()V

    .line 600
    .line 601
    .line 602
    :cond_17
    throw v0
.end method


# virtual methods
.method public final start(Landroid/content/Context;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/appsflyer/internal/AFi1iSDK;->d:Lcom/appsflyer/internal/AFc1iSDK;

    .line 5
    .line 6
    const-string v1, "com.facebook.sdk.ApplicationId"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "fb"

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-static {v1, v0}, Lkotlin/text/StringsKt;->d0(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v0, v2

    .line 23
    :goto_0
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-nez v3, :cond_2

    .line 30
    .line 31
    :cond_1
    sget-object v4, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 32
    .line 33
    sget-object v5, Lcom/appsflyer/sdk_base/logger/LogTag;->META_REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 34
    .line 35
    const/4 v8, 0x4

    .line 36
    const/4 v9, 0x0

    .line 37
    const-string v6, "Facebook app id Manifest metadata is not found."

    .line 38
    .line 39
    const/4 v7, 0x0

    .line 40
    invoke-static/range {v4 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    move-object v0, v2

    .line 44
    :cond_2
    if-nez v0, :cond_9

    .line 45
    .line 46
    iget-object v0, p0, Lcom/appsflyer/internal/AFi1iSDK;->d:Lcom/appsflyer/internal/AFc1iSDK;

    .line 47
    .line 48
    const-string v3, "facebook_application_id"

    .line 49
    .line 50
    invoke-virtual {v0, v3}, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    invoke-static {v1, v0}, Lkotlin/text/StringsKt;->d0(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    goto :goto_1

    .line 61
    :cond_3
    move-object v0, v2

    .line 62
    :goto_1
    if-eqz v0, :cond_4

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-nez v3, :cond_5

    .line 69
    .line 70
    :cond_4
    sget-object v4, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 71
    .line 72
    sget-object v5, Lcom/appsflyer/sdk_base/logger/LogTag;->META_REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 73
    .line 74
    const/4 v8, 0x4

    .line 75
    const/4 v9, 0x0

    .line 76
    const-string v6, "Facebook app id string resource is not found."

    .line 77
    .line 78
    const/4 v7, 0x0

    .line 79
    invoke-static/range {v4 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    move-object v0, v2

    .line 83
    :cond_5
    if-nez v0, :cond_9

    .line 84
    .line 85
    iget-object v0, p0, Lcom/appsflyer/internal/AFi1iSDK;->d:Lcom/appsflyer/internal/AFc1iSDK;

    .line 86
    .line 87
    const-string v3, "com.appsflyer.FacebookApplicationId"

    .line 88
    .line 89
    invoke-virtual {v0, v3}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    if-eqz v0, :cond_6

    .line 94
    .line 95
    invoke-static {v1, v0}, Lkotlin/text/StringsKt;->d0(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    goto :goto_2

    .line 100
    :cond_6
    move-object v0, v2

    .line 101
    :goto_2
    if-eqz v0, :cond_7

    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-nez v1, :cond_8

    .line 108
    .line 109
    :cond_7
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 110
    .line 111
    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->META_REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 112
    .line 113
    const/4 v7, 0x4

    .line 114
    const/4 v8, 0x0

    .line 115
    const-string v5, "AF Facebook app id Manifest metadata is not found."

    .line 116
    .line 117
    const/4 v6, 0x0

    .line 118
    invoke-static/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    move-object v0, v2

    .line 122
    :cond_8
    if-nez v0, :cond_9

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_9
    move-object v2, v0

    .line 126
    :goto_3
    iput-object v2, p0, Lcom/appsflyer/internal/AFi1iSDK;->AFKeystoreWrapper:Ljava/lang/String;

    .line 127
    .line 128
    if-nez v2, :cond_a

    .line 129
    .line 130
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 131
    .line 132
    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->META_REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 133
    .line 134
    const/4 v7, 0x4

    .line 135
    const/4 v8, 0x0

    .line 136
    const-string v5, "Referrer collection disallowed by missing Facebook app id."

    .line 137
    .line 138
    const/4 v6, 0x0

    .line 139
    invoke-static/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    goto :goto_5

    .line 143
    :cond_a
    iget-object v0, p0, Lcom/appsflyer/internal/AFi1iSDK;->registerClient:Lcom/appsflyer/internal/AFi1jSDK;

    .line 144
    .line 145
    sget-object v1, Lcom/appsflyer/internal/AFi1iSDK$AFa1ySDK;->AFKeystoreWrapper:[I

    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    aget v0, v1, v0

    .line 152
    .line 153
    const/4 v1, 0x1

    .line 154
    const/4 v2, 0x0

    .line 155
    if-eq v0, v1, :cond_d

    .line 156
    .line 157
    const/4 v1, 0x2

    .line 158
    if-eq v0, v1, :cond_c

    .line 159
    .line 160
    const/4 v1, 0x3

    .line 161
    if-ne v0, v1, :cond_b

    .line 162
    .line 163
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    const-string v1, "com.facebook.lite.provider.InstallReferrerProvider"

    .line 168
    .line 169
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    if-eqz v0, :cond_e

    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :cond_c
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    const-string v1, "com.instagram.contentprovider.InstallReferrerProvider"

    .line 185
    .line 186
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    if-eqz v0, :cond_e

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_d
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    const-string v1, "com.facebook.katana.provider.InstallReferrerProvider"

    .line 198
    .line 199
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    if-eqz v0, :cond_e

    .line 204
    .line 205
    :goto_4
    invoke-virtual {p0}, Lcom/appsflyer/sdk_base/referrer/Referrer;->getProp()Lcom/appsflyer/sdk_base/referrer/ReferrerProp;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {v0}, Lcom/appsflyer/sdk_base/referrer/ReferrerProp;->getBackgroundExecutor()Ljava/util/concurrent/ExecutorService;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    new-instance v1, Lcom/appsflyer/internal/o;

    .line 214
    .line 215
    const/4 v2, 0x5

    .line 216
    invoke-direct {v1, p0, p1, v2}, Lcom/appsflyer/internal/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 217
    .line 218
    .line 219
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 220
    .line 221
    .line 222
    return-void

    .line 223
    :cond_e
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 224
    .line 225
    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->META_REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 226
    .line 227
    const/4 v7, 0x4

    .line 228
    const/4 v8, 0x0

    .line 229
    const-string v5, "Referrer collection disallowed by missing content providers."

    .line 230
    .line 231
    const/4 v6, 0x0

    .line 232
    invoke-static/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    :goto_5
    iget-object p0, p0, Lcom/appsflyer/internal/AFi1iSDK;->unregisterClient:Ljava/lang/Runnable;

    .line 236
    .line 237
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 238
    .line 239
    .line 240
    return-void
.end method
