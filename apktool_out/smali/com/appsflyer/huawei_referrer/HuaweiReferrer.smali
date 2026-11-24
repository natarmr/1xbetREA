.class public Lcom/appsflyer/huawei_referrer/HuaweiReferrer;
.super Lcom/appsflyer/sdk_base/referrer/Referrer;
.source "SourceFile"


# static fields
.field private static final HUAWEI_CONTENT_PROVIDER_NAME:Ljava/lang/String; = "com.huawei.appmarket.commondata"


# instance fields
.field private final contentProviderValidator:Lcom/appsflyer/huawei_referrer/HuaweiContentProviderValidator;

.field private final executorService:Ljava/util/concurrent/ExecutorService;

.field private final logger:Lcom/appsflyer/sdk_base/logger/AFLoggerBase;


# direct methods
.method public constructor <init>(Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V
    .locals 2

    .line 1
    const-string v0, "store"

    .line 2
    .line 3
    const-string v1, "huawei"

    .line 4
    .line 5
    invoke-direct {p0, v0, v1, p1}, Lcom/appsflyer/sdk_base/referrer/Referrer;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/appsflyer/sdk_base/referrer/ReferrerProp;->getLogger()Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lcom/appsflyer/huawei_referrer/HuaweiReferrer;->logger:Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/appsflyer/sdk_base/referrer/ReferrerProp;->getBackgroundExecutor()Ljava/util/concurrent/ExecutorService;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lcom/appsflyer/huawei_referrer/HuaweiReferrer;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 19
    .line 20
    new-instance p1, Lcom/appsflyer/huawei_referrer/HuaweiContentProviderValidatorImpl;

    .line 21
    .line 22
    invoke-direct {p1, v0}, Lcom/appsflyer/huawei_referrer/HuaweiContentProviderValidatorImpl;-><init>(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lcom/appsflyer/huawei_referrer/HuaweiReferrer;->contentProviderValidator:Lcom/appsflyer/huawei_referrer/HuaweiContentProviderValidator;

    .line 26
    .line 27
    return-void
.end method

.method public static synthetic a(Lcom/appsflyer/huawei_referrer/HuaweiReferrer;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/appsflyer/huawei_referrer/HuaweiReferrer;->lambda$start$0(Landroid/content/Context;)V

    return-void
.end method

.method private fetchAttributionData(Landroid/content/Context;)V
    .locals 9

    .line 1
    const-string v1, "FEATURE_NOT_SUPPORTED"

    .line 2
    .line 3
    const-string v2, "response"

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    const-string v0, "content://com.huawei.appmarket.commondata/item/5"

    .line 10
    .line 11
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    filled-new-array {v0}, [Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    const/4 v8, 0x0

    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v6, 0x0

    .line 26
    invoke-virtual/range {v3 .. v8}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 27
    .line 28
    .line 29
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 30
    :try_start_1
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v4, "com.huawei.appmarket.commondata"

    .line 35
    .line 36
    const/16 v5, 0x80

    .line 37
    .line 38
    invoke-virtual {v0, v4, v5}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object v0, v0, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v4, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 45
    .line 46
    const-string v5, "api_ver"

    .line 47
    .line 48
    invoke-static {p1, v0}, Lcom/appsflyer/sdk_base/util/AndroidExtensionsKt;->getVersionCode(Landroid/content/Context;Ljava/lang/String;)J

    .line 49
    .line 50
    .line 51
    move-result-wide v6

    .line 52
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    iget-object v4, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 60
    .line 61
    const-string v5, "api_ver_name"

    .line 62
    .line 63
    invoke-static {p1, v0}, Lcom/appsflyer/sdk_base/util/AndroidExtensionsKt;->getVersionName(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-interface {v4, v5, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    if-eqz v3, :cond_2

    .line 71
    .line 72
    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    .line 73
    .line 74
    .line 75
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    iget-object v0, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 77
    .line 78
    if-eqz p1, :cond_1

    .line 79
    .line 80
    :try_start_2
    const-string p1, "OK"

    .line 81
    .line 82
    invoke-interface {v0, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    iget-object p1, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 86
    .line 87
    const-string v0, "referrer"

    .line 88
    .line 89
    const/4 v4, 0x0

    .line 90
    invoke-interface {v3, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-interface {p1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    iget-object p1, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 98
    .line 99
    const-string v0, "click_ts"

    .line 100
    .line 101
    const/4 v4, 0x1

    .line 102
    invoke-interface {v3, v4}, Landroid/database/Cursor;->getLong(I)J

    .line 103
    .line 104
    .line 105
    move-result-wide v4

    .line 106
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-interface {p1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    iget-object p1, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 114
    .line 115
    const-string v0, "install_end_ts"

    .line 116
    .line 117
    const/4 v4, 0x2

    .line 118
    invoke-interface {v3, v4}, Landroid/database/Cursor;->getLong(I)J

    .line 119
    .line 120
    .line 121
    move-result-wide v4

    .line 122
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    invoke-interface {p1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    invoke-interface {v3}, Landroid/database/Cursor;->getColumnCount()I

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    const/4 v0, 0x3

    .line 134
    if-le p1, v0, :cond_3

    .line 135
    .line 136
    iget-object p1, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 137
    .line 138
    const-string v4, "install_begin_ts"

    .line 139
    .line 140
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 141
    .line 142
    .line 143
    move-result-wide v5

    .line 144
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-interface {p1, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    new-instance p1, Ljava/util/HashMap;

    .line 152
    .line 153
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 154
    .line 155
    .line 156
    const/4 v0, 0x4

    .line 157
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    if-eqz v0, :cond_0

    .line 162
    .line 163
    const-string v4, "track_id"

    .line 164
    .line 165
    invoke-virtual {p1, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    goto :goto_0

    .line 169
    :catchall_0
    move-exception v0

    .line 170
    move-object p1, v0

    .line 171
    goto :goto_2

    .line 172
    :cond_0
    :goto_0
    const-string v0, "referrer_ex"

    .line 173
    .line 174
    const/4 v4, 0x5

    .line 175
    invoke-interface {v3, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    invoke-virtual {p1, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    iget-object v0, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 183
    .line 184
    const-string v4, "huawei_custom"

    .line 185
    .line 186
    invoke-interface {v0, v4, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    goto :goto_1

    .line 190
    :cond_1
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    goto :goto_1

    .line 194
    :cond_2
    iget-object p1, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 195
    .line 196
    const-string v0, "SERVICE_UNAVAILABLE"

    .line 197
    .line 198
    invoke-interface {p1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 199
    .line 200
    .line 201
    :cond_3
    :goto_1
    if-eqz v3, :cond_4

    .line 202
    .line 203
    :try_start_3
    invoke-interface {v3}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 204
    .line 205
    .line 206
    return-void

    .line 207
    :catchall_1
    move-exception v0

    .line 208
    move-object p1, v0

    .line 209
    goto :goto_4

    .line 210
    :cond_4
    return-void

    .line 211
    :goto_2
    if-eqz v3, :cond_5

    .line 212
    .line 213
    :try_start_4
    invoke-interface {v3}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 214
    .line 215
    .line 216
    goto :goto_3

    .line 217
    :catchall_2
    move-exception v0

    .line 218
    :try_start_5
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 219
    .line 220
    .line 221
    :cond_5
    :goto_3
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 222
    :goto_4
    iget-object v0, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 223
    .line 224
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    invoke-virtual {p0, p1}, Lcom/appsflyer/huawei_referrer/HuaweiReferrer;->onError(Ljava/lang/Throwable;)V

    .line 228
    .line 229
    .line 230
    return-void
.end method

.method private isAllowedToRun(Landroid/content/Context;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/appsflyer/huawei_referrer/HuaweiReferrer;->contentProviderValidator:Lcom/appsflyer/huawei_referrer/HuaweiContentProviderValidator;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lcom/appsflyer/huawei_referrer/HuaweiContentProviderValidator;->isContentProviderPresent(Landroid/content/Context;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object p0, p0, Lcom/appsflyer/huawei_referrer/HuaweiReferrer;->logger:Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    .line 11
    .line 12
    sget-object p1, Lcom/appsflyer/sdk_base/logger/LogTag;->REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 13
    .line 14
    const-string v0, "Huawei referrer collection disallowed by missing content provider."

    .line 15
    .line 16
    invoke-virtual {p0, p1, v0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return v1

    .line 20
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/huawei_referrer/HuaweiReferrer;->contentProviderValidator:Lcom/appsflyer/huawei_referrer/HuaweiContentProviderValidator;

    .line 21
    .line 22
    invoke-interface {v0, p1}, Lcom/appsflyer/huawei_referrer/HuaweiContentProviderValidator;->isProviderSignatureValid(Landroid/content/Context;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    iget-object p0, p0, Lcom/appsflyer/huawei_referrer/HuaweiReferrer;->logger:Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    .line 29
    .line 30
    sget-object p1, Lcom/appsflyer/sdk_base/logger/LogTag;->REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 31
    .line 32
    const-string v0, "Huawei referrer collection disallowed by invalid content provider."

    .line 33
    .line 34
    invoke-virtual {p0, p1, v0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return v1

    .line 38
    :cond_1
    const/4 p0, 0x1

    .line 39
    return p0
.end method

.method private synthetic lambda$start$0(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/appsflyer/sdk_base/referrer/Referrer;->start()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lcom/appsflyer/huawei_referrer/HuaweiReferrer;->fetchAttributionData(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/appsflyer/sdk_base/referrer/Referrer;->finish()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public onError(Ljava/lang/Throwable;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/appsflyer/huawei_referrer/HuaweiReferrer;->logger:Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    .line 2
    .line 3
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :goto_0
    move-object v2, p0

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    const-string p0, ""

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :goto_1
    const/4 v4, 0x0

    .line 21
    const/4 v5, 0x1

    .line 22
    move-object v3, p1

    .line 23
    invoke-virtual/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public start(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lcom/appsflyer/huawei_referrer/HuaweiReferrer;->isAllowedToRun(Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/huawei_referrer/HuaweiReferrer;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 9
    .line 10
    new-instance v1, La/llo;

    .line 11
    .line 12
    const/16 v2, 0x8

    .line 13
    .line 14
    invoke-direct {v1, p0, p1, v2}, La/llo;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
