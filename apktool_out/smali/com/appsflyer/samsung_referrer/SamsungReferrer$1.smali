.class Lcom/appsflyer/samsung_referrer/SamsungReferrer$1;
.super Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/appsflyer/samsung_referrer/SamsungReferrer;->start(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/appsflyer/sdk_base/util/ContentProviderFetcher<",
        "Ljava/util/Map<",
        "Ljava/lang/String;",
        "Ljava/lang/Object;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/appsflyer/samsung_referrer/SamsungReferrer;


# direct methods
.method public varargs constructor <init>(Lcom/appsflyer/samsung_referrer/SamsungReferrer;Landroid/content/Context;Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Ljava/util/concurrent/Executor;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/appsflyer/samsung_referrer/SamsungReferrer$1;->this$0:Lcom/appsflyer/samsung_referrer/SamsungReferrer;

    .line 2
    .line 3
    move-object p1, p2

    .line 4
    move-object p2, p3

    .line 5
    move-object p3, p4

    .line 6
    move-object p4, p5

    .line 7
    move-object p5, p6

    .line 8
    invoke-direct/range {p0 .. p5}, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;-><init>(Landroid/content/Context;Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Ljava/util/concurrent/Executor;Ljava/lang/String;[Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private addBoolean(Ljava/lang/String;Ljava/util/Map;Landroid/database/Cursor;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Landroid/database/Cursor;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-interface {p3, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, -0x1

    .line 6
    if-ne p0, v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-interface {p3, p0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-nez p0, :cond_1

    .line 14
    .line 15
    :goto_0
    return-void

    .line 16
    :cond_1
    invoke-static {p0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-interface {p2, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private addLong(Ljava/lang/String;Ljava/util/Map;Landroid/database/Cursor;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Landroid/database/Cursor;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-interface {p3, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, -0x1

    .line 6
    if-ne p0, v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-interface {p3, p0}, Landroid/database/Cursor;->getLong(I)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    const-wide/16 v2, 0x0

    .line 14
    .line 15
    cmp-long p0, v0, v2

    .line 16
    .line 17
    if-nez p0, :cond_1

    .line 18
    .line 19
    :goto_0
    return-void

    .line 20
    :cond_1
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-interface {p2, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private addString(Ljava/lang/String;Ljava/util/Map;Landroid/database/Cursor;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Landroid/database/Cursor;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-interface {p3, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, -0x1

    .line 6
    if-ne p0, v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-interface {p3, p0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-nez p0, :cond_1

    .line 14
    .line 15
    :goto_0
    return-void

    .line 16
    :cond_1
    invoke-interface {p2, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public bridge synthetic query()Ljava/lang/Object;
    .locals 0

    .line 265
    invoke-virtual {p0}, Lcom/appsflyer/samsung_referrer/SamsungReferrer$1;->query()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public query()Ljava/util/Map;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v1, "FEATURE_NOT_SUPPORTED"

    .line 2
    .line 3
    const-string v2, "response"

    .line 4
    .line 5
    const-string v0, "content://"

    .line 6
    .line 7
    :try_start_0
    iget-object v3, p0, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->context:Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    new-instance v3, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->authority:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    const/4 v8, 0x0

    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v6, 0x0

    .line 34
    const/4 v7, 0x0

    .line 35
    invoke-virtual/range {v4 .. v9}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 36
    .line 37
    .line 38
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    :try_start_1
    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    .line 42
    .line 43
    .line 44
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    iget-object v4, p0, Lcom/appsflyer/samsung_referrer/SamsungReferrer$1;->this$0:Lcom/appsflyer/samsung_referrer/SamsungReferrer;

    .line 46
    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    :try_start_2
    iget-object v0, v4, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 50
    .line 51
    const-string v4, "OK"

    .line 52
    .line 53
    invoke-interface {v0, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    const-string v0, "referrer"

    .line 57
    .line 58
    iget-object v4, p0, Lcom/appsflyer/samsung_referrer/SamsungReferrer$1;->this$0:Lcom/appsflyer/samsung_referrer/SamsungReferrer;

    .line 59
    .line 60
    iget-object v4, v4, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 61
    .line 62
    invoke-direct {p0, v0, v4, v3}, Lcom/appsflyer/samsung_referrer/SamsungReferrer$1;->addString(Ljava/lang/String;Ljava/util/Map;Landroid/database/Cursor;)V

    .line 63
    .line 64
    .line 65
    const-string v0, "click_ts"

    .line 66
    .line 67
    iget-object v4, p0, Lcom/appsflyer/samsung_referrer/SamsungReferrer$1;->this$0:Lcom/appsflyer/samsung_referrer/SamsungReferrer;

    .line 68
    .line 69
    iget-object v4, v4, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 70
    .line 71
    invoke-direct {p0, v0, v4, v3}, Lcom/appsflyer/samsung_referrer/SamsungReferrer$1;->addLong(Ljava/lang/String;Ljava/util/Map;Landroid/database/Cursor;)V

    .line 72
    .line 73
    .line 74
    const-string v0, "install_begin_ts"

    .line 75
    .line 76
    iget-object v4, p0, Lcom/appsflyer/samsung_referrer/SamsungReferrer$1;->this$0:Lcom/appsflyer/samsung_referrer/SamsungReferrer;

    .line 77
    .line 78
    iget-object v4, v4, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 79
    .line 80
    invoke-direct {p0, v0, v4, v3}, Lcom/appsflyer/samsung_referrer/SamsungReferrer$1;->addLong(Ljava/lang/String;Ljava/util/Map;Landroid/database/Cursor;)V

    .line 81
    .line 82
    .line 83
    const-string v0, "install_end_ts"

    .line 84
    .line 85
    iget-object v4, p0, Lcom/appsflyer/samsung_referrer/SamsungReferrer$1;->this$0:Lcom/appsflyer/samsung_referrer/SamsungReferrer;

    .line 86
    .line 87
    iget-object v4, v4, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 88
    .line 89
    invoke-direct {p0, v0, v4, v3}, Lcom/appsflyer/samsung_referrer/SamsungReferrer$1;->addLong(Ljava/lang/String;Ljava/util/Map;Landroid/database/Cursor;)V

    .line 90
    .line 91
    .line 92
    const-string v0, "organic_keywords"

    .line 93
    .line 94
    iget-object v4, p0, Lcom/appsflyer/samsung_referrer/SamsungReferrer$1;->this$0:Lcom/appsflyer/samsung_referrer/SamsungReferrer;

    .line 95
    .line 96
    iget-object v4, v4, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 97
    .line 98
    invoke-direct {p0, v0, v4, v3}, Lcom/appsflyer/samsung_referrer/SamsungReferrer$1;->addString(Ljava/lang/String;Ljava/util/Map;Landroid/database/Cursor;)V

    .line 99
    .line 100
    .line 101
    const-string v0, "attr_type"

    .line 102
    .line 103
    iget-object v4, p0, Lcom/appsflyer/samsung_referrer/SamsungReferrer$1;->this$0:Lcom/appsflyer/samsung_referrer/SamsungReferrer;

    .line 104
    .line 105
    iget-object v4, v4, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 106
    .line 107
    invoke-direct {p0, v0, v4, v3}, Lcom/appsflyer/samsung_referrer/SamsungReferrer$1;->addString(Ljava/lang/String;Ljava/util/Map;Landroid/database/Cursor;)V

    .line 108
    .line 109
    .line 110
    new-instance v0, Ljava/util/HashMap;

    .line 111
    .line 112
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 113
    .line 114
    .line 115
    const-string v4, "instant"

    .line 116
    .line 117
    invoke-direct {p0, v4, v0, v3}, Lcom/appsflyer/samsung_referrer/SamsungReferrer$1;->addBoolean(Ljava/lang/String;Ljava/util/Map;Landroid/database/Cursor;)V

    .line 118
    .line 119
    .line 120
    const-string v4, "click_server_ts"

    .line 121
    .line 122
    invoke-direct {p0, v4, v0, v3}, Lcom/appsflyer/samsung_referrer/SamsungReferrer$1;->addLong(Ljava/lang/String;Ljava/util/Map;Landroid/database/Cursor;)V

    .line 123
    .line 124
    .line 125
    const-string v4, "install_begin_server_ts"

    .line 126
    .line 127
    invoke-direct {p0, v4, v0, v3}, Lcom/appsflyer/samsung_referrer/SamsungReferrer$1;->addLong(Ljava/lang/String;Ljava/util/Map;Landroid/database/Cursor;)V

    .line 128
    .line 129
    .line 130
    const-string v4, "install_version"

    .line 131
    .line 132
    invoke-direct {p0, v4, v0, v3}, Lcom/appsflyer/samsung_referrer/SamsungReferrer$1;->addString(Ljava/lang/String;Ljava/util/Map;Landroid/database/Cursor;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    .line 136
    .line 137
    .line 138
    move-result v4

    .line 139
    if-nez v4, :cond_2

    .line 140
    .line 141
    iget-object v4, p0, Lcom/appsflyer/samsung_referrer/SamsungReferrer$1;->this$0:Lcom/appsflyer/samsung_referrer/SamsungReferrer;

    .line 142
    .line 143
    iget-object v4, v4, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 144
    .line 145
    const-string v5, "custom"

    .line 146
    .line 147
    invoke-interface {v4, v5, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    goto :goto_0

    .line 151
    :catchall_0
    move-exception v0

    .line 152
    move-object v4, v0

    .line 153
    goto :goto_1

    .line 154
    :cond_0
    iget-object v0, v4, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 155
    .line 156
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_1
    iget-object v0, p0, Lcom/appsflyer/samsung_referrer/SamsungReferrer$1;->this$0:Lcom/appsflyer/samsung_referrer/SamsungReferrer;

    .line 161
    .line 162
    iget-object v0, v0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 163
    .line 164
    const-string v4, "SERVICE_UNAVAILABLE"

    .line 165
    .line 166
    invoke-interface {v0, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 167
    .line 168
    .line 169
    :cond_2
    :goto_0
    if-eqz v3, :cond_4

    .line 170
    .line 171
    :try_start_3
    invoke-interface {v3}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 172
    .line 173
    .line 174
    goto :goto_4

    .line 175
    :catch_0
    move-exception v0

    .line 176
    goto :goto_3

    .line 177
    :goto_1
    if-eqz v3, :cond_3

    .line 178
    .line 179
    :try_start_4
    invoke-interface {v3}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 180
    .line 181
    .line 182
    goto :goto_2

    .line 183
    :catchall_1
    move-exception v0

    .line 184
    :try_start_5
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 185
    .line 186
    .line 187
    :cond_3
    :goto_2
    throw v4
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 188
    :goto_3
    iget-object v3, p0, Lcom/appsflyer/samsung_referrer/SamsungReferrer$1;->this$0:Lcom/appsflyer/samsung_referrer/SamsungReferrer;

    .line 189
    .line 190
    iget-object v3, v3, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 191
    .line 192
    invoke-interface {v3, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    const/4 v1, 0x1

    .line 196
    invoke-virtual {p0, v0, v1}, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->onError(Ljava/lang/Throwable;Z)V

    .line 197
    .line 198
    .line 199
    :cond_4
    :goto_4
    :try_start_6
    iget-object v0, p0, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->context:Landroid/content/Context;

    .line 200
    .line 201
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    iget-object v1, p0, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->authority:Ljava/lang/String;

    .line 206
    .line 207
    const/16 v2, 0x80

    .line 208
    .line 209
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    iget-object v0, v0, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    .line 214
    .line 215
    iget-object v1, p0, Lcom/appsflyer/samsung_referrer/SamsungReferrer$1;->this$0:Lcom/appsflyer/samsung_referrer/SamsungReferrer;

    .line 216
    .line 217
    iget-object v1, v1, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 218
    .line 219
    const-string v2, "api_ver"

    .line 220
    .line 221
    iget-object v3, p0, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->context:Landroid/content/Context;

    .line 222
    .line 223
    invoke-static {v3, v0}, Lcom/appsflyer/sdk_base/util/AndroidExtensionsKt;->getVersionCode(Landroid/content/Context;Ljava/lang/String;)J

    .line 224
    .line 225
    .line 226
    move-result-wide v3

    .line 227
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    iget-object v1, p0, Lcom/appsflyer/samsung_referrer/SamsungReferrer$1;->this$0:Lcom/appsflyer/samsung_referrer/SamsungReferrer;

    .line 235
    .line 236
    iget-object v1, v1, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 237
    .line 238
    const-string v2, "api_ver_name"

    .line 239
    .line 240
    iget-object v3, p0, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->context:Landroid/content/Context;

    .line 241
    .line 242
    invoke-static {v3, v0}, Lcom/appsflyer/sdk_base/util/AndroidExtensionsKt;->getVersionName(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 247
    .line 248
    .line 249
    goto :goto_5

    .line 250
    :catchall_2
    move-exception v0

    .line 251
    const/4 v1, 0x0

    .line 252
    invoke-virtual {p0, v0, v1}, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->onError(Ljava/lang/Throwable;Z)V

    .line 253
    .line 254
    .line 255
    :goto_5
    iget-object v0, p0, Lcom/appsflyer/samsung_referrer/SamsungReferrer$1;->this$0:Lcom/appsflyer/samsung_referrer/SamsungReferrer;

    .line 256
    .line 257
    invoke-virtual {v0}, Lcom/appsflyer/sdk_base/referrer/Referrer;->finish()V

    .line 258
    .line 259
    .line 260
    iget-object p0, p0, Lcom/appsflyer/samsung_referrer/SamsungReferrer$1;->this$0:Lcom/appsflyer/samsung_referrer/SamsungReferrer;

    .line 261
    .line 262
    iget-object p0, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 263
    .line 264
    return-object p0
.end method
