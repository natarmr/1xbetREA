.class public final Lcom/appsflyer/internal/AFi1bSDK;
.super Lcom/appsflyer/sdk_base/referrer/Referrer;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "preload"

    .line 5
    .line 6
    const-string v1, "samsung"

    .line 7
    .line 8
    invoke-direct {p0, v0, v1, p1}, Lcom/appsflyer/sdk_base/referrer/Referrer;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private static final AFKeystoreWrapper(Lcom/appsflyer/internal/AFi1bSDK;Landroid/content/Context;)V
    .locals 10

    .line 1
    const-string v0, "com.samsung.android.mapsagent"

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/appsflyer/sdk_base/referrer/Referrer;->start()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :try_start_0
    const-string v2, "content://com.samsung.android.mapsagent.providers.apptracking/info"

    .line 8
    .line 9
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2, v4}, Landroid/content/ContentResolver;->acquireUnstableContentProviderClient(Landroid/net/Uri;)Landroid/content/ContentProviderClient;

    .line 18
    .line 19
    .line 20
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    :try_start_1
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    const-string v2, "appsflyer001"

    .line 28
    .line 29
    filled-new-array {v2}, [Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    const/4 v8, 0x0

    .line 34
    const/4 v5, 0x0

    .line 35
    invoke-virtual/range {v3 .. v8}, Landroid/content/ContentProviderClient;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 36
    .line 37
    .line 38
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    move-object p1, v0

    .line 42
    move-object v5, p1

    .line 43
    :goto_0
    move-object p1, v3

    .line 44
    goto/16 :goto_6

    .line 45
    .line 46
    :cond_0
    move-object v2, v1

    .line 47
    :goto_1
    if-eqz v2, :cond_b

    .line 48
    .line 49
    :try_start_2
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-nez v4, :cond_1

    .line 54
    .line 55
    goto/16 :goto_5

    .line 56
    .line 57
    :cond_1
    const-string v4, "RESULT"

    .line 58
    .line 59
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    const/4 v5, -0x1

    .line 64
    if-eq v4, v5, :cond_2

    .line 65
    .line 66
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-static {v4}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    goto :goto_2

    .line 75
    :catchall_1
    move-exception v0

    .line 76
    move-object p1, v0

    .line 77
    move-object v5, p1

    .line 78
    move-object v1, v2

    .line 79
    goto :goto_0

    .line 80
    :cond_2
    sget-object v4, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 81
    .line 82
    sget-object v5, Lcom/appsflyer/sdk_base/logger/LogTag;->SAMSUNG_PRELOAD_REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 83
    .line 84
    const-string v6, "No such column"

    .line 85
    .line 86
    const/4 v8, 0x4

    .line 87
    const/4 v9, 0x0

    .line 88
    const/4 v7, 0x0

    .line 89
    invoke-static/range {v4 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    const/4 v4, 0x0

    .line 93
    :goto_2
    if-eqz v4, :cond_a

    .line 94
    .line 95
    const-string v4, "INSTALLED_TIME_TEXT"

    .line 96
    .line 97
    invoke-static {v2, v4}, Lcom/appsflyer/internal/AFj1pSDK;->Y_(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    if-eqz v4, :cond_3

    .line 102
    .line 103
    const-string v5, "yy:MM:dd:hh:mm"

    .line 104
    .line 105
    invoke-static {v4, v5}, Lcom/appsflyer/internal/AFj1rSDK;->unregisterClient(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    if-eqz v4, :cond_3

    .line 110
    .line 111
    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    .line 112
    .line 113
    .line 114
    move-result-wide v4

    .line 115
    const-wide/16 v6, 0x3e8

    .line 116
    .line 117
    div-long/2addr v4, v6

    .line 118
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    :cond_3
    if-eqz v1, :cond_4

    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 125
    .line 126
    .line 127
    move-result-wide v4

    .line 128
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    iget-object v4, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 133
    .line 134
    const-string v5, "install_begin_ts"

    .line 135
    .line 136
    invoke-interface {v4, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    :cond_4
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 140
    .line 141
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 142
    .line 143
    .line 144
    const-string v4, "MAPS_ID"

    .line 145
    .line 146
    invoke-static {v2, v4}, Lcom/appsflyer/internal/AFj1pSDK;->Y_(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    if-eqz v4, :cond_5

    .line 151
    .line 152
    const-string v5, "maps_id"

    .line 153
    .line 154
    invoke-interface {v1, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    :cond_5
    const-string v4, "DEVICE_NAME"

    .line 158
    .line 159
    invoke-static {v2, v4}, Lcom/appsflyer/internal/AFj1pSDK;->Y_(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    if-eqz v4, :cond_6

    .line 164
    .line 165
    const-string v5, "device_model"

    .line 166
    .line 167
    invoke-interface {v1, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    :cond_6
    const-string v4, "COUNTRY"

    .line 171
    .line 172
    invoke-static {v2, v4}, Lcom/appsflyer/internal/AFj1pSDK;->Y_(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    if-eqz v4, :cond_7

    .line 177
    .line 178
    const-string v5, "country"

    .line 179
    .line 180
    invoke-interface {v1, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    :cond_7
    const-string v4, "CAMPAIGN_ID"

    .line 184
    .line 185
    invoke-static {v2, v4}, Lcom/appsflyer/internal/AFj1pSDK;->Y_(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    if-eqz v4, :cond_8

    .line 190
    .line 191
    const-string v5, "campaign_id"

    .line 192
    .line 193
    invoke-interface {v1, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    :cond_8
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    if-nez v4, :cond_9

    .line 201
    .line 202
    iget-object v4, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 203
    .line 204
    const-string v5, "samsung_custom"

    .line 205
    .line 206
    invoke-interface {v4, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    :cond_9
    iget-object v1, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 210
    .line 211
    const-string v4, "api_ver"

    .line 212
    .line 213
    invoke-static {p1, v0}, Lcom/appsflyer/internal/AFj1qSDK;->unregisterClient(Landroid/content/Context;Ljava/lang/String;)J

    .line 214
    .line 215
    .line 216
    move-result-wide v5

    .line 217
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    iget-object v1, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 225
    .line 226
    const-string v4, "api_ver_name"

    .line 227
    .line 228
    invoke-static {p1, v0}, Lcom/appsflyer/internal/AFj1qSDK;->AFKeystoreWrapper(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    invoke-interface {v1, v4, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    goto :goto_3

    .line 236
    :cond_a
    sget-object v4, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 237
    .line 238
    sget-object v5, Lcom/appsflyer/sdk_base/logger/LogTag;->SAMSUNG_PRELOAD_REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 239
    .line 240
    const-string v6, "App was not installed via Samsung MAPS."

    .line 241
    .line 242
    const/4 v8, 0x4

    .line 243
    const/4 v9, 0x0

    .line 244
    const/4 v7, 0x0

    .line 245
    invoke-static/range {v4 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 246
    .line 247
    .line 248
    :goto_3
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 249
    .line 250
    .line 251
    if-eqz v3, :cond_e

    .line 252
    .line 253
    :goto_4
    invoke-virtual {v3}, Landroid/content/ContentProviderClient;->close()V

    .line 254
    .line 255
    .line 256
    goto :goto_7

    .line 257
    :cond_b
    :goto_5
    :try_start_3
    sget-object v4, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 258
    .line 259
    sget-object v5, Lcom/appsflyer/sdk_base/logger/LogTag;->SAMSUNG_PRELOAD_REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 260
    .line 261
    const-string v6, "Content provider returned no data"

    .line 262
    .line 263
    const/4 v8, 0x4

    .line 264
    const/4 v9, 0x0

    .line 265
    const/4 v7, 0x0

    .line 266
    invoke-static/range {v4 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 267
    .line 268
    .line 269
    if-eqz v2, :cond_c

    .line 270
    .line 271
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 272
    .line 273
    .line 274
    :cond_c
    if-eqz v3, :cond_e

    .line 275
    .line 276
    goto :goto_4

    .line 277
    :catchall_2
    move-exception v0

    .line 278
    move-object p1, v0

    .line 279
    move-object v5, p1

    .line 280
    move-object p1, v1

    .line 281
    :goto_6
    :try_start_4
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 282
    .line 283
    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->SAMSUNG_PRELOAD_REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 284
    .line 285
    const-string v4, "Error while collecting referrer data"

    .line 286
    .line 287
    const/4 v8, 0x1

    .line 288
    const/4 v9, 0x1

    .line 289
    const/4 v6, 0x0

    .line 290
    const/4 v7, 0x0

    .line 291
    invoke-virtual/range {v2 .. v9}, Lcom/appsflyer/AFLogger;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 292
    .line 293
    .line 294
    if-eqz v1, :cond_d

    .line 295
    .line 296
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 297
    .line 298
    .line 299
    :cond_d
    if-eqz p1, :cond_e

    .line 300
    .line 301
    invoke-virtual {p1}, Landroid/content/ContentProviderClient;->close()V

    .line 302
    .line 303
    .line 304
    :cond_e
    :goto_7
    invoke-virtual {p0}, Lcom/appsflyer/sdk_base/referrer/Referrer;->finish()V

    .line 305
    .line 306
    .line 307
    return-void

    .line 308
    :catchall_3
    move-exception v0

    .line 309
    move-object p0, v0

    .line 310
    if-eqz v1, :cond_f

    .line 311
    .line 312
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 313
    .line 314
    .line 315
    :cond_f
    if-eqz p1, :cond_10

    .line 316
    .line 317
    invoke-virtual {p1}, Landroid/content/ContentProviderClient;->close()V

    .line 318
    .line 319
    .line 320
    :cond_10
    throw p0
.end method

.method public static synthetic a(Lcom/appsflyer/internal/AFi1bSDK;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/appsflyer/internal/AFi1bSDK;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFi1bSDK;Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final addLatency()V
    .locals 0

    return-void
.end method

.method public final start(Landroid/content/Context;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "com.samsung.android.mapsagent.providers.apptracking"

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/appsflyer/sdk_base/referrer/Referrer;->getProp()Lcom/appsflyer/sdk_base/referrer/ReferrerProp;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lcom/appsflyer/sdk_base/referrer/ReferrerProp;->getBackgroundExecutor()Ljava/util/concurrent/ExecutorService;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v1, Lcom/appsflyer/internal/o;

    .line 26
    .line 27
    const/4 v2, 0x2

    .line 28
    invoke-direct {v1, p0, p1, v2}, Lcom/appsflyer/internal/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 36
    .line 37
    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->SAMSUNG_PRELOAD_REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 38
    .line 39
    const/4 v7, 0x4

    .line 40
    const/4 v8, 0x0

    .line 41
    const-string v5, "Referrer collection disallowed by missing content provider."

    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    invoke-static/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method
