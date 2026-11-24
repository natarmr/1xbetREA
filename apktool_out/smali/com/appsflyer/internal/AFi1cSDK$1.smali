.class final Lcom/appsflyer/internal/AFi1cSDK$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/appsflyer/internal/AFi1cSDK;->start(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field private synthetic d:Lcom/appsflyer/internal/AFi1cSDK;

.field private synthetic registerClient:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFi1cSDK;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/appsflyer/internal/AFi1cSDK$1;->d:Lcom/appsflyer/internal/AFi1cSDK;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/appsflyer/internal/AFi1cSDK$1;->registerClient:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFi1cSDK$1;->d:Lcom/appsflyer/internal/AFi1cSDK;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/appsflyer/sdk_base/referrer/Referrer;->start()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v1, "content://"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/appsflyer/internal/AFi1cSDK$1;->d:Lcom/appsflyer/internal/AFi1cSDK;

    .line 14
    .line 15
    iget-object v1, v1, Lcom/appsflyer/internal/AFi1cSDK;->registerClient:Landroid/content/pm/ProviderInfo;

    .line 16
    .line 17
    iget-object v1, v1, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, "/transaction_id"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    iget-object v0, p0, Lcom/appsflyer/internal/AFi1cSDK$1;->registerClient:Landroid/content/Context;

    .line 36
    .line 37
    invoke-static {v0, v2}, Lcom/appsflyer/internal/AFi1cSDK;->N_(Landroid/content/Context;Landroid/net/Uri;)Landroid/content/ContentProviderClient;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string v3, "app_id="

    .line 46
    .line 47
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iget-object v3, p0, Lcom/appsflyer/internal/AFi1cSDK$1;->registerClient:Landroid/content/Context;

    .line 51
    .line 52
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    const/4 v5, 0x0

    .line 64
    const/4 v6, 0x0

    .line 65
    const/4 v3, 0x0

    .line 66
    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentProviderClient;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 67
    .line 68
    .line 69
    move-result-object v0
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    invoke-virtual {v1}, Landroid/content/ContentProviderClient;->close()V

    .line 71
    .line 72
    .line 73
    goto :goto_6

    .line 74
    :catchall_0
    move-exception v0

    .line 75
    move-object v5, v0

    .line 76
    goto :goto_0

    .line 77
    :catch_0
    move-exception v0

    .line 78
    move-object v5, v0

    .line 79
    goto :goto_2

    .line 80
    :catch_1
    move-exception v0

    .line 81
    move-object v5, v0

    .line 82
    goto :goto_3

    .line 83
    :goto_0
    :try_start_1
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 84
    .line 85
    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->PREINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 86
    .line 87
    const-string v4, "Error to get data from providerClient "

    .line 88
    .line 89
    const/4 v7, 0x1

    .line 90
    const/4 v8, 0x0

    .line 91
    const/4 v6, 0x0

    .line 92
    invoke-virtual/range {v2 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 93
    .line 94
    .line 95
    :goto_1
    invoke-virtual {v1}, Landroid/content/ContentProviderClient;->close()V

    .line 96
    .line 97
    .line 98
    goto :goto_5

    .line 99
    :catchall_1
    move-exception v0

    .line 100
    move-object p0, v0

    .line 101
    goto :goto_4

    .line 102
    :goto_2
    :try_start_2
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 103
    .line 104
    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->PREINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 105
    .line 106
    const-string v4, "Failed to query unstable content providerClient"

    .line 107
    .line 108
    const/4 v7, 0x1

    .line 109
    const/4 v8, 0x0

    .line 110
    const/4 v6, 0x0

    .line 111
    invoke-virtual/range {v2 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :goto_3
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 116
    .line 117
    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->PREINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 118
    .line 119
    const-string v4, "Failed to acquire unstable content providerClient"

    .line 120
    .line 121
    const/4 v7, 0x1

    .line 122
    const/4 v8, 0x0

    .line 123
    const/4 v6, 0x0

    .line 124
    invoke-virtual/range {v2 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :goto_4
    invoke-virtual {v1}, Landroid/content/ContentProviderClient;->close()V

    .line 129
    .line 130
    .line 131
    throw p0

    .line 132
    :cond_0
    :goto_5
    const/4 v0, 0x0

    .line 133
    :goto_6
    const-string v1, "response"

    .line 134
    .line 135
    if-eqz v0, :cond_3

    .line 136
    .line 137
    const-string v2, "transaction_id"

    .line 138
    .line 139
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    const/4 v3, -0x1

    .line 144
    if-ne v2, v3, :cond_1

    .line 145
    .line 146
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 147
    .line 148
    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->PREINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 149
    .line 150
    const-string v4, "Wrong column name"

    .line 151
    .line 152
    invoke-virtual {v2, v3, v4}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    iget-object v2, p0, Lcom/appsflyer/internal/AFi1cSDK$1;->d:Lcom/appsflyer/internal/AFi1cSDK;

    .line 156
    .line 157
    iget-object v2, v2, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 158
    .line 159
    const-string v3, "FEATURE_NOT_SUPPORTED"

    .line 160
    .line 161
    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    goto :goto_7

    .line 165
    :cond_1
    iget-object v3, p0, Lcom/appsflyer/internal/AFi1cSDK$1;->d:Lcom/appsflyer/internal/AFi1cSDK;

    .line 166
    .line 167
    iget-object v3, v3, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 168
    .line 169
    const-string v4, "OK"

    .line 170
    .line 171
    invoke-interface {v3, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    if-eqz v1, :cond_2

    .line 179
    .line 180
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 185
    .line 186
    .line 187
    if-eqz v1, :cond_2

    .line 188
    .line 189
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    if-nez v2, :cond_2

    .line 194
    .line 195
    iget-object v2, p0, Lcom/appsflyer/internal/AFi1cSDK$1;->d:Lcom/appsflyer/internal/AFi1cSDK;

    .line 196
    .line 197
    iget-object v2, v2, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 198
    .line 199
    const-string v3, "referrer"

    .line 200
    .line 201
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    :cond_2
    :goto_7
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 205
    .line 206
    .line 207
    goto :goto_8

    .line 208
    :cond_3
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 209
    .line 210
    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->PREINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 211
    .line 212
    const-string v3, "ContentProvider query failed, got null Cursor"

    .line 213
    .line 214
    invoke-virtual {v0, v2, v3}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    iget-object v0, p0, Lcom/appsflyer/internal/AFi1cSDK$1;->d:Lcom/appsflyer/internal/AFi1cSDK;

    .line 218
    .line 219
    iget-object v0, v0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 220
    .line 221
    const-string v2, "SERVICE_UNAVAILABLE"

    .line 222
    .line 223
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    :goto_8
    iget-object v0, p0, Lcom/appsflyer/internal/AFi1cSDK$1;->d:Lcom/appsflyer/internal/AFi1cSDK;

    .line 227
    .line 228
    iget-object v1, v0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 229
    .line 230
    iget-object v2, p0, Lcom/appsflyer/internal/AFi1cSDK$1;->registerClient:Landroid/content/Context;

    .line 231
    .line 232
    iget-object v0, v0, Lcom/appsflyer/internal/AFi1cSDK;->registerClient:Landroid/content/pm/ProviderInfo;

    .line 233
    .line 234
    iget-object v0, v0, Landroid/content/pm/PackageItemInfo;->packageName:Ljava/lang/String;

    .line 235
    .line 236
    invoke-static {v2, v0}, Lcom/appsflyer/internal/AFj1qSDK;->unregisterClient(Landroid/content/Context;Ljava/lang/String;)J

    .line 237
    .line 238
    .line 239
    move-result-wide v2

    .line 240
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    const-string v2, "api_ver"

    .line 245
    .line 246
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    iget-object v0, p0, Lcom/appsflyer/internal/AFi1cSDK$1;->d:Lcom/appsflyer/internal/AFi1cSDK;

    .line 250
    .line 251
    iget-object v1, v0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 252
    .line 253
    iget-object v2, p0, Lcom/appsflyer/internal/AFi1cSDK$1;->registerClient:Landroid/content/Context;

    .line 254
    .line 255
    iget-object v0, v0, Lcom/appsflyer/internal/AFi1cSDK;->registerClient:Landroid/content/pm/ProviderInfo;

    .line 256
    .line 257
    iget-object v0, v0, Landroid/content/pm/PackageItemInfo;->packageName:Ljava/lang/String;

    .line 258
    .line 259
    invoke-static {v2, v0}, Lcom/appsflyer/internal/AFj1qSDK;->AFKeystoreWrapper(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    const-string v2, "api_ver_name"

    .line 264
    .line 265
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    iget-object p0, p0, Lcom/appsflyer/internal/AFi1cSDK$1;->d:Lcom/appsflyer/internal/AFi1cSDK;

    .line 269
    .line 270
    invoke-virtual {p0}, Lcom/appsflyer/sdk_base/referrer/Referrer;->finish()V

    .line 271
    .line 272
    .line 273
    return-void
.end method
