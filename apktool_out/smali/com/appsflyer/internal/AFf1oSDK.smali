.class public final Lcom/appsflyer/internal/AFf1oSDK;
.super Lcom/appsflyer/internal/AFe1ySDK;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/appsflyer/internal/AFe1ySDK<",
        "Lcom/appsflyer/internal/AFf1pSDK;",
        ">;"
    }
.end annotation


# instance fields
.field private final AFLoggerLogLevel:Lcom/appsflyer/internal/AFc1iSDK;

.field private final AppsFlyerLib:Lcom/appsflyer/internal/AFc1eSDK;

.field private final afDebugLog:Lcom/appsflyer/internal/AFf1jSDK;

.field private final afErrorLog:Lcom/appsflyer/internal/AFd1sSDK;

.field private final afInfoLog:Lcom/appsflyer/internal/AFf1fSDK;

.field private final afWarnLog:Lcom/appsflyer/internal/AFf1kSDK;

.field public e:Lcom/appsflyer/internal/AFh1bSDK;

.field public final force:Lcom/appsflyer/internal/AFf1mSDK;

.field private final getLevel:Ljava/lang/String;

.field public i:Lcom/appsflyer/internal/AFf1pSDK;

.field private final v:Lcom/appsflyer/internal/AFf1nSDK;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFf1nSDK;Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFf1fSDK;Lcom/appsflyer/internal/AFf1jSDK;Lcom/appsflyer/internal/AFd1sSDK;Lcom/appsflyer/internal/AFf1kSDK;Lcom/appsflyer/internal/AFc1eSDK;Ljava/lang/String;Lcom/appsflyer/internal/AFf1mSDK;)V
    .locals 3

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
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    sget-object v0, Lcom/appsflyer/internal/AFd1bSDK;->d:Lcom/appsflyer/internal/AFd1bSDK;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    new-array v1, v1, [Lcom/appsflyer/internal/AFe1zSDK;

    .line 29
    .line 30
    const-string v2, "UpdateRemoteConfiguration"

    .line 31
    .line 32
    invoke-direct {p0, v0, v1, v2}, Lcom/appsflyer/internal/AFe1ySDK;-><init>(Lcom/appsflyer/internal/AFe1zSDK;[Lcom/appsflyer/internal/AFe1zSDK;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lcom/appsflyer/internal/AFf1oSDK;->v:Lcom/appsflyer/internal/AFf1nSDK;

    .line 36
    .line 37
    iput-object p2, p0, Lcom/appsflyer/internal/AFf1oSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFc1iSDK;

    .line 38
    .line 39
    iput-object p3, p0, Lcom/appsflyer/internal/AFf1oSDK;->afInfoLog:Lcom/appsflyer/internal/AFf1fSDK;

    .line 40
    .line 41
    iput-object p4, p0, Lcom/appsflyer/internal/AFf1oSDK;->afDebugLog:Lcom/appsflyer/internal/AFf1jSDK;

    .line 42
    .line 43
    iput-object p5, p0, Lcom/appsflyer/internal/AFf1oSDK;->afErrorLog:Lcom/appsflyer/internal/AFd1sSDK;

    .line 44
    .line 45
    iput-object p6, p0, Lcom/appsflyer/internal/AFf1oSDK;->afWarnLog:Lcom/appsflyer/internal/AFf1kSDK;

    .line 46
    .line 47
    iput-object p7, p0, Lcom/appsflyer/internal/AFf1oSDK;->AppsFlyerLib:Lcom/appsflyer/internal/AFc1eSDK;

    .line 48
    .line 49
    iput-object p8, p0, Lcom/appsflyer/internal/AFf1oSDK;->getLevel:Ljava/lang/String;

    .line 50
    .line 51
    iput-object p9, p0, Lcom/appsflyer/internal/AFf1oSDK;->force:Lcom/appsflyer/internal/AFf1mSDK;

    .line 52
    .line 53
    return-void
.end method

.method private final AFKeystoreWrapper(Lcom/appsflyer/internal/AFf1xSDK;)V
    .locals 14

    .line 1
    iget-object v0, p1, Lcom/appsflyer/internal/AFf1xSDK;->d:Lcom/appsflyer/internal/AFd1fSDK;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, v0, Lcom/appsflyer/internal/AFd1fSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFd1nSDK;

    .line 6
    .line 7
    iget-wide v1, v1, Lcom/appsflyer/internal/AFd1nSDK;->registerClient:J

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFd1fSDK;->getStatusCode()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    :goto_0
    move v10, v0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    const-wide/16 v1, 0x0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    goto :goto_0

    .line 19
    :goto_1
    iget-object v0, p1, Lcom/appsflyer/internal/AFf1xSDK;->v:Ljava/lang/Throwable;

    .line 20
    .line 21
    instance-of v3, v0, Lcom/appsflyer/internal/components/network/http/exceptions/HttpException;

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    check-cast v0, Lcom/appsflyer/internal/components/network/http/exceptions/HttpException;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0}, Lcom/appsflyer/internal/components/network/http/exceptions/HttpException;->getMetrics()Lcom/appsflyer/internal/AFd1nSDK;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-wide v2, v0, Lcom/appsflyer/internal/AFd1nSDK;->registerClient:J

    .line 36
    .line 37
    move-object v13, v1

    .line 38
    move-wide v6, v2

    .line 39
    goto :goto_2

    .line 40
    :cond_1
    move-object v13, v0

    .line 41
    move-wide v6, v1

    .line 42
    :goto_2
    iget-object v0, p1, Lcom/appsflyer/internal/AFf1xSDK;->unregisterClient:Lcom/appsflyer/internal/AFh1aSDK;

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    iget-object v0, v0, Lcom/appsflyer/internal/AFh1aSDK;->AFKeystoreWrapper:Ljava/lang/String;

    .line 47
    .line 48
    :goto_3
    move-object v4, v0

    .line 49
    goto :goto_4

    .line 50
    :cond_2
    const/4 v0, 0x0

    .line 51
    goto :goto_3

    .line 52
    :goto_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 53
    .line 54
    .line 55
    move-result-wide v0

    .line 56
    iget-wide v2, p1, Lcom/appsflyer/internal/AFf1xSDK;->registerClient:J

    .line 57
    .line 58
    sub-long v8, v0, v2

    .line 59
    .line 60
    new-instance v3, Lcom/appsflyer/internal/AFh1bSDK;

    .line 61
    .line 62
    iget-object v5, p1, Lcom/appsflyer/internal/AFf1xSDK;->AFLogger:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v11, p1, Lcom/appsflyer/internal/AFf1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1dSDK;

    .line 65
    .line 66
    iget-object v12, p1, Lcom/appsflyer/internal/AFf1xSDK;->e:Ljava/lang/String;

    .line 67
    .line 68
    invoke-direct/range {v3 .. v13}, Lcom/appsflyer/internal/AFh1bSDK;-><init>(Ljava/lang/String;Ljava/lang/String;JJILcom/appsflyer/internal/AFh1dSDK;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    iput-object v3, p0, Lcom/appsflyer/internal/AFf1oSDK;->e:Lcom/appsflyer/internal/AFh1bSDK;

    .line 72
    .line 73
    return-void
.end method

.method private final d(Ljava/lang/String;JLjava/io/IOException;Lcom/appsflyer/internal/AFd1fSDK;)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Ljava/io/IOException;",
            "Lcom/appsflyer/internal/AFd1fSDK<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "failed to fetch remote config: "

    .line 6
    .line 7
    invoke-static {v1, v0}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 12
    .line 13
    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->REMOTE_CONTROL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 14
    .line 15
    const/16 v10, 0x40

    .line 16
    .line 17
    const/4 v11, 0x0

    .line 18
    const/4 v6, 0x1

    .line 19
    const/4 v7, 0x0

    .line 20
    const/4 v8, 0x0

    .line 21
    const/4 v9, 0x0

    .line 22
    move-object/from16 v5, p4

    .line 23
    .line 24
    invoke-static/range {v2 .. v11}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    new-instance v12, Lcom/appsflyer/internal/AFf1xSDK;

    .line 28
    .line 29
    const/16 v18, 0x0

    .line 30
    .line 31
    const/16 v19, 0x0

    .line 32
    .line 33
    const/16 v17, 0x0

    .line 34
    .line 35
    move-object/from16 v13, p1

    .line 36
    .line 37
    move-wide/from16 v14, p2

    .line 38
    .line 39
    move-object/from16 v20, p4

    .line 40
    .line 41
    move-object/from16 v16, p5

    .line 42
    .line 43
    invoke-direct/range {v12 .. v20}, Lcom/appsflyer/internal/AFf1xSDK;-><init>(Ljava/lang/String;JLcom/appsflyer/internal/AFd1fSDK;Lcom/appsflyer/internal/AFh1aSDK;Lcom/appsflyer/internal/AFh1dSDK;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    move-object/from16 v0, p0

    .line 47
    .line 48
    invoke-direct {v0, v12}, Lcom/appsflyer/internal/AFf1oSDK;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFf1xSDK;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method private final e()Lcom/appsflyer/internal/AFf1pSDK;
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, " seconds"

    .line 4
    .line 5
    const-string v2, "failed to fetch remote config from CDN with status code: "

    .line 6
    .line 7
    const-string v3, "Config successfully updated, timeToLive: "

    .line 8
    .line 9
    const-string v4, "using max-age fallback: "

    .line 10
    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v7

    .line 15
    iget-object v5, v1, Lcom/appsflyer/internal/AFf1oSDK;->getLevel:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v6, v1, Lcom/appsflyer/internal/AFf1oSDK;->afInfoLog:Lcom/appsflyer/internal/AFf1fSDK;

    .line 18
    .line 19
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v9

    .line 23
    invoke-static {v6}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    const v10, -0x62ff1f55

    .line 28
    .line 29
    .line 30
    const v11, 0x62ff1f57

    .line 31
    .line 32
    .line 33
    invoke-static {v9, v10, v11, v6}, Lcom/appsflyer/internal/AFf1fSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    check-cast v6, Ljava/lang/String;

    .line 38
    .line 39
    const/4 v9, 0x0

    .line 40
    if-eqz v6, :cond_2

    .line 41
    .line 42
    invoke-static {v6}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 43
    .line 44
    .line 45
    move-result v12

    .line 46
    if-eqz v12, :cond_0

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    if-nez v5, :cond_1

    .line 50
    .line 51
    sget-object v13, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 52
    .line 53
    sget-object v14, Lcom/appsflyer/sdk_base/logger/LogTag;->REMOTE_CONTROL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 54
    .line 55
    const/16 v17, 0x4

    .line 56
    .line 57
    const/16 v18, 0x0

    .line 58
    .line 59
    const-string v15, "Can\'t create CDN token, domain or version is not provided."

    .line 60
    .line 61
    const/16 v16, 0x0

    .line 62
    .line 63
    invoke-static/range {v13 .. v18}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :goto_0
    move-object v6, v9

    .line 67
    goto :goto_2

    .line 68
    :cond_1
    iget-object v9, v1, Lcom/appsflyer/internal/AFf1oSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFc1iSDK;

    .line 69
    .line 70
    iget-object v9, v9, Lcom/appsflyer/internal/AFc1iSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 71
    .line 72
    iget-object v9, v9, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 73
    .line 74
    invoke-virtual {v9}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    const-string v12, "appsflyersdk.com"

    .line 79
    .line 80
    filled-new-array {v12, v5, v9}, [Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    const-string v9, "\u2063"

    .line 85
    .line 86
    invoke-static {v9, v5}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-static {v5, v6}, Lcom/appsflyer/internal/AFj1nSDK;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v9

    .line 94
    goto :goto_0

    .line 95
    :cond_2
    :goto_1
    sget-object v12, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 96
    .line 97
    sget-object v13, Lcom/appsflyer/sdk_base/logger/LogTag;->REMOTE_CONTROL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 98
    .line 99
    const/16 v16, 0x4

    .line 100
    .line 101
    const/16 v17, 0x0

    .line 102
    .line 103
    const-string v14, "Dev key is not set, SDK is not started."

    .line 104
    .line 105
    const/4 v15, 0x0

    .line 106
    invoke-static/range {v12 .. v17}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :goto_2
    if-nez v6, :cond_3

    .line 111
    .line 112
    sget-object v12, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 113
    .line 114
    sget-object v13, Lcom/appsflyer/sdk_base/logger/LogTag;->REMOTE_CONTROL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 115
    .line 116
    const/16 v16, 0x4

    .line 117
    .line 118
    const/16 v17, 0x0

    .line 119
    .line 120
    const-string v14, "can\'t create CDN token, skipping fetch config"

    .line 121
    .line 122
    const/4 v15, 0x0

    .line 123
    invoke-static/range {v12 .. v17}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->v$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    sget-object v0, Lcom/appsflyer/internal/AFf1pSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFf1pSDK;

    .line 127
    .line 128
    return-object v0

    .line 129
    :cond_3
    :try_start_0
    iget-object v5, v1, Lcom/appsflyer/internal/AFf1oSDK;->afWarnLog:Lcom/appsflyer/internal/AFf1kSDK;
    :try_end_0
    .catch Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 130
    .line 131
    :try_start_1
    iget-object v5, v5, Lcom/appsflyer/internal/AFf1kSDK;->AFKeystoreWrapper:La/a8z;

    .line 132
    .line 133
    invoke-interface {v5}, La/a8z;->getValue()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    check-cast v5, Ljava/lang/Boolean;

    .line 138
    .line 139
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 140
    .line 141
    .line 142
    iget-object v9, v1, Lcom/appsflyer/internal/AFf1oSDK;->afWarnLog:Lcom/appsflyer/internal/AFf1kSDK;

    .line 143
    .line 144
    iget-object v9, v9, Lcom/appsflyer/internal/AFf1kSDK;->registerClient:La/a8z;

    .line 145
    .line 146
    invoke-interface {v9}, La/a8z;->getValue()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v9

    .line 150
    check-cast v9, Ljava/lang/Boolean;

    .line 151
    .line 152
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 153
    .line 154
    .line 155
    iget-object v12, v1, Lcom/appsflyer/internal/AFf1oSDK;->afWarnLog:Lcom/appsflyer/internal/AFf1kSDK;

    .line 156
    .line 157
    iget-object v13, v12, Lcom/appsflyer/internal/AFf1kSDK;->d:Lcom/appsflyer/internal/AFc1eSDK;

    .line 158
    .line 159
    iget-object v13, v13, Lcom/appsflyer/internal/AFc1eSDK;->getOutOfStore:Ljava/lang/String;
    :try_end_1
    .catch Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException; {:try_start_1 .. :try_end_1} :catch_b
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_a
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    .line 160
    .line 161
    if-nez v13, :cond_4

    .line 162
    .line 163
    :try_start_2
    sget-object v14, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 164
    .line 165
    sget-object v15, Lcom/appsflyer/sdk_base/logger/LogTag;->REMOTE_CONTROL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 166
    .line 167
    const-string v16, "Cold start detected - fetching config from CDN"

    .line 168
    .line 169
    const/16 v18, 0x4

    .line 170
    .line 171
    const/16 v19, 0x0

    .line 172
    .line 173
    const/16 v17, 0x0

    .line 174
    .line 175
    invoke-static/range {v14 .. v19}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V
    :try_end_2
    .catch Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 176
    .line 177
    .line 178
    :goto_3
    move-wide/from16 v18, v7

    .line 179
    .line 180
    goto/16 :goto_9

    .line 181
    .line 182
    :catchall_0
    move-exception v0

    .line 183
    :goto_4
    move-object v10, v0

    .line 184
    move-wide v3, v7

    .line 185
    goto/16 :goto_13

    .line 186
    .line 187
    :catch_0
    move-exception v0

    .line 188
    :goto_5
    move-object v5, v0

    .line 189
    :goto_6
    move-object v2, v6

    .line 190
    goto/16 :goto_14

    .line 191
    .line 192
    :catch_1
    move-exception v0

    .line 193
    :goto_7
    move-object v5, v0

    .line 194
    :goto_8
    move-object v2, v6

    .line 195
    goto/16 :goto_15

    .line 196
    .line 197
    :cond_4
    :try_start_3
    iget-object v13, v12, Lcom/appsflyer/internal/AFf1kSDK;->unregisterClient:Lcom/appsflyer/internal/AFf1jSDK;

    .line 198
    .line 199
    iget-object v13, v13, Lcom/appsflyer/internal/AFf1jSDK;->AFLogger:Lcom/appsflyer/internal/AFh1aSDK;
    :try_end_3
    .catch Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException; {:try_start_3 .. :try_end_3} :catch_b
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_a
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    .line 200
    .line 201
    if-nez v13, :cond_5

    .line 202
    .line 203
    :try_start_4
    sget-object v14, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 204
    .line 205
    sget-object v15, Lcom/appsflyer/sdk_base/logger/LogTag;->REMOTE_CONTROL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 206
    .line 207
    const-string v16, "active config is missing - fetching from CDN"

    .line 208
    .line 209
    const/16 v18, 0x4

    .line 210
    .line 211
    const/16 v19, 0x0

    .line 212
    .line 213
    const/16 v17, 0x0

    .line 214
    .line 215
    invoke-static/range {v14 .. v19}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V
    :try_end_4
    .catch Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 216
    .line 217
    .line 218
    goto :goto_3

    .line 219
    :cond_5
    :try_start_5
    iget-object v13, v13, Lcom/appsflyer/internal/AFh1aSDK;->registerClient:Lcom/appsflyer/internal/AFh1gSDK;
    :try_end_5
    .catch Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException; {:try_start_5 .. :try_end_5} :catch_b
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_a
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 220
    .line 221
    const/4 v14, 0x0

    .line 222
    sget-object v15, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 223
    .line 224
    if-eqz v13, :cond_6

    .line 225
    .line 226
    :try_start_6
    iget-object v13, v13, Lcom/appsflyer/internal/AFh1gSDK;->unregisterClient:Lcom/appsflyer/internal/AFh1cSDK;

    .line 227
    .line 228
    if-eqz v13, :cond_6

    .line 229
    .line 230
    iget-wide v10, v13, Lcom/appsflyer/internal/AFh1cSDK;->d:J

    .line 231
    .line 232
    invoke-virtual {v15, v10, v11}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 233
    .line 234
    .line 235
    move-result-wide v10

    .line 236
    invoke-static {}, Lcom/appsflyer/internal/AFh1cSDK;->registerClient()J

    .line 237
    .line 238
    .line 239
    move-result-wide v18
    :try_end_6
    .catch Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 240
    cmp-long v10, v10, v18

    .line 241
    .line 242
    if-lez v10, :cond_6

    .line 243
    .line 244
    const/4 v14, 0x1

    .line 245
    :cond_6
    :try_start_7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 246
    .line 247
    .line 248
    move-result-wide v10

    .line 249
    iget-object v12, v12, Lcom/appsflyer/internal/AFf1kSDK;->unregisterClient:Lcom/appsflyer/internal/AFf1jSDK;
    :try_end_7
    .catch Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException; {:try_start_7 .. :try_end_7} :catch_b
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_a
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 250
    .line 251
    move-wide/from16 v18, v7

    .line 252
    .line 253
    :try_start_8
    iget-wide v7, v12, Lcom/appsflyer/internal/AFf1jSDK;->registerClient:J

    .line 254
    .line 255
    sub-long/2addr v10, v7

    .line 256
    iget-wide v7, v12, Lcom/appsflyer/internal/AFf1jSDK;->unregisterClient:J

    .line 257
    .line 258
    invoke-virtual {v15, v7, v8}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 259
    .line 260
    .line 261
    move-result-wide v7
    :try_end_8
    .catch Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException; {:try_start_8 .. :try_end_8} :catch_d
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_c
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 262
    if-nez v14, :cond_8

    .line 263
    .line 264
    cmp-long v7, v10, v7

    .line 265
    .line 266
    if-lez v7, :cond_7

    .line 267
    .line 268
    goto :goto_9

    .line 269
    :cond_7
    :try_start_9
    sget-object v10, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 270
    .line 271
    sget-object v11, Lcom/appsflyer/sdk_base/logger/LogTag;->REMOTE_CONTROL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 272
    .line 273
    const-string v12, "Using cached config (warm start, config valid)"

    .line 274
    .line 275
    const/4 v14, 0x4

    .line 276
    const/4 v15, 0x0

    .line 277
    const/4 v13, 0x0

    .line 278
    invoke-static/range {v10 .. v15}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    sget-object v0, Lcom/appsflyer/internal/AFf1pSDK;->d:Lcom/appsflyer/internal/AFf1pSDK;
    :try_end_9
    .catch Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException; {:try_start_9 .. :try_end_9} :catch_3
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_2
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 282
    .line 283
    return-object v0

    .line 284
    :catchall_1
    move-exception v0

    .line 285
    move-object v10, v0

    .line 286
    move-wide/from16 v3, v18

    .line 287
    .line 288
    goto/16 :goto_13

    .line 289
    .line 290
    :catch_2
    move-exception v0

    .line 291
    move-object v5, v0

    .line 292
    move-object v2, v6

    .line 293
    move-wide/from16 v7, v18

    .line 294
    .line 295
    goto/16 :goto_14

    .line 296
    .line 297
    :catch_3
    move-exception v0

    .line 298
    move-object v5, v0

    .line 299
    move-object v2, v6

    .line 300
    move-wide/from16 v7, v18

    .line 301
    .line 302
    goto/16 :goto_15

    .line 303
    .line 304
    :cond_8
    :goto_9
    :try_start_a
    sget-object v7, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 305
    .line 306
    sget-object v8, Lcom/appsflyer/sdk_base/logger/LogTag;->REMOTE_CONTROL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 307
    .line 308
    const-string v12, "Fetching config (cold start or stale)..."

    .line 309
    .line 310
    const/4 v14, 0x4

    .line 311
    const/4 v15, 0x0

    .line 312
    const/4 v13, 0x0

    .line 313
    move-object v10, v7

    .line 314
    move-object v11, v8

    .line 315
    invoke-static/range {v10 .. v15}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    iget-object v10, v1, Lcom/appsflyer/internal/AFf1oSDK;->afErrorLog:Lcom/appsflyer/internal/AFd1sSDK;

    .line 319
    .line 320
    const/16 v11, 0x5dc

    .line 321
    .line 322
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 323
    .line 324
    .line 325
    move-result-object v12

    .line 326
    filled-new-array {v10, v5, v9, v6, v12}, [Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v5

    .line 330
    const v9, 0x70f95d4b

    .line 331
    .line 332
    .line 333
    const v10, -0x70f95d49

    .line 334
    .line 335
    .line 336
    invoke-static {v5, v9, v10, v11}, Lcom/appsflyer/internal/AFd1sSDK;->d([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v5

    .line 340
    check-cast v5, Lcom/appsflyer/internal/AFd1pSDK;

    .line 341
    .line 342
    invoke-virtual {v5}, Lcom/appsflyer/internal/AFd1pSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFd1fSDK;

    .line 343
    .line 344
    .line 345
    move-result-object v5

    .line 346
    invoke-virtual {v5}, Lcom/appsflyer/internal/AFd1fSDK;->isSuccessful()Z

    .line 347
    .line 348
    .line 349
    move-result v9

    .line 350
    if-eqz v9, :cond_e

    .line 351
    .line 352
    invoke-virtual {v5}, Lcom/appsflyer/internal/AFd1fSDK;->getBody()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 357
    .line 358
    .line 359
    check-cast v2, Lcom/appsflyer/internal/AFh1aSDK;

    .line 360
    .line 361
    const-string v9, "x-amz-meta-af-auth-v1"

    .line 362
    .line 363
    invoke-virtual {v5, v9}, Lcom/appsflyer/internal/AFd1fSDK;->AFKeystoreWrapper(Ljava/lang/String;)Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v13

    .line 367
    const-string v9, "CF-Cache-Status"

    .line 368
    .line 369
    invoke-virtual {v5, v9}, Lcom/appsflyer/internal/AFd1fSDK;->AFKeystoreWrapper(Ljava/lang/String;)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v14

    .line 373
    const-string v9, "af-net-tkn"

    .line 374
    .line 375
    invoke-virtual {v5, v9}, Lcom/appsflyer/internal/AFd1fSDK;->AFKeystoreWrapper(Ljava/lang/String;)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v9
    :try_end_a
    .catch Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException; {:try_start_a .. :try_end_a} :catch_d
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_c
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 379
    if-eqz v9, :cond_a

    .line 380
    .line 381
    :try_start_b
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 382
    .line 383
    .line 384
    move-result v10

    .line 385
    if-nez v10, :cond_9

    .line 386
    .line 387
    goto :goto_a

    .line 388
    :cond_9
    iget-object v10, v1, Lcom/appsflyer/internal/AFf1oSDK;->AppsFlyerLib:Lcom/appsflyer/internal/AFc1eSDK;

    .line 389
    .line 390
    iput-object v9, v10, Lcom/appsflyer/internal/AFc1eSDK;->getOutOfStore:Ljava/lang/String;
    :try_end_b
    .catch Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException; {:try_start_b .. :try_end_b} :catch_3
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_2
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 391
    .line 392
    goto :goto_b

    .line 393
    :cond_a
    :goto_a
    :try_start_c
    const-string v9, "Network token header not present in the response"

    .line 394
    .line 395
    const/4 v11, 0x4

    .line 396
    const/4 v12, 0x0

    .line 397
    const/4 v10, 0x0

    .line 398
    invoke-static/range {v7 .. v12}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 399
    .line 400
    .line 401
    :goto_b
    iget-object v9, v1, Lcom/appsflyer/internal/AFf1oSDK;->afInfoLog:Lcom/appsflyer/internal/AFf1fSDK;

    .line 402
    .line 403
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v10

    .line 407
    invoke-static {v9}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 408
    .line 409
    .line 410
    move-result v9

    .line 411
    const v11, -0x62ff1f55

    .line 412
    .line 413
    .line 414
    const v12, 0x62ff1f57

    .line 415
    .line 416
    .line 417
    invoke-static {v10, v11, v12, v9}, Lcom/appsflyer/internal/AFf1fSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v9

    .line 421
    check-cast v9, Ljava/lang/String;

    .line 422
    .line 423
    if-eqz v9, :cond_b

    .line 424
    .line 425
    invoke-static {v9}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 426
    .line 427
    .line 428
    move-result v10

    .line 429
    if-eqz v10, :cond_c

    .line 430
    .line 431
    :cond_b
    move-wide/from16 v3, v18

    .line 432
    .line 433
    goto/16 :goto_12

    .line 434
    .line 435
    :cond_c
    iget-object v10, v1, Lcom/appsflyer/internal/AFf1oSDK;->v:Lcom/appsflyer/internal/AFf1nSDK;

    .line 436
    .line 437
    invoke-virtual {v10, v2, v13, v6, v9}, Lcom/appsflyer/internal/AFf1nSDK;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFh1aSDK;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/AFi1uSDK;

    .line 438
    .line 439
    .line 440
    move-result-object v13

    .line 441
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    iget-boolean v9, v13, Lcom/appsflyer/internal/AFi1uSDK;->AFKeystoreWrapper:Z
    :try_end_c
    .catch Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException; {:try_start_c .. :try_end_c} :catch_d
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 445
    .line 446
    if-eqz v9, :cond_d

    .line 447
    .line 448
    :try_start_d
    iget-object v9, v1, Lcom/appsflyer/internal/AFf1oSDK;->afWarnLog:Lcom/appsflyer/internal/AFf1kSDK;

    .line 449
    .line 450
    invoke-virtual {v9}, Lcom/appsflyer/internal/AFf1kSDK;->AFKeystoreWrapper()J

    .line 451
    .line 452
    .line 453
    move-result-wide v9

    .line 454
    new-instance v11, Ljava/lang/StringBuilder;

    .line 455
    .line 456
    invoke-direct {v11, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v11, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v4

    .line 469
    const/4 v11, 0x4

    .line 470
    const/4 v12, 0x0

    .line 471
    move-wide v15, v9

    .line 472
    const/4 v10, 0x0

    .line 473
    move-object v9, v4

    .line 474
    move-object/from16 v17, v5

    .line 475
    .line 476
    move-wide v4, v15

    .line 477
    invoke-static/range {v7 .. v12}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->v$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 481
    .line 482
    .line 483
    move-result-wide v9

    .line 484
    iget-object v11, v1, Lcom/appsflyer/internal/AFf1oSDK;->afDebugLog:Lcom/appsflyer/internal/AFf1jSDK;

    .line 485
    .line 486
    iget-object v12, v2, Lcom/appsflyer/internal/AFh1aSDK;->d:Ljava/lang/String;

    .line 487
    .line 488
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 489
    .line 490
    .line 491
    move-result-object v15

    .line 492
    invoke-virtual {v12, v15}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 493
    .line 494
    .line 495
    move-result-object v12

    .line 496
    const/4 v15, 0x2

    .line 497
    invoke-static {v12, v15}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v12

    .line 501
    iget-object v15, v11, Lcom/appsflyer/internal/AFf1jSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;
    :try_end_d
    .catch Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException; {:try_start_d .. :try_end_d} :catch_7
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_6
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 502
    .line 503
    move-object/from16 v16, v6

    .line 504
    .line 505
    :try_start_e
    const-string v6, "af_remote_config"

    .line 506
    .line 507
    invoke-interface {v15, v6, v12}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 508
    .line 509
    .line 510
    iget-object v6, v11, Lcom/appsflyer/internal/AFf1jSDK;->AFLogger:Lcom/appsflyer/internal/AFh1aSDK;

    .line 511
    .line 512
    iput-object v6, v11, Lcom/appsflyer/internal/AFf1jSDK;->d:Lcom/appsflyer/internal/AFh1aSDK;

    .line 513
    .line 514
    iget-object v6, v11, Lcom/appsflyer/internal/AFf1jSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 515
    .line 516
    const-string v12, "af_rc_timestamp"

    .line 517
    .line 518
    invoke-interface {v6, v12, v9, v10}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;J)V

    .line 519
    .line 520
    .line 521
    iget-object v6, v11, Lcom/appsflyer/internal/AFf1jSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 522
    .line 523
    const-string v12, "af_rc_max_age"

    .line 524
    .line 525
    invoke-interface {v6, v12, v4, v5}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;J)V

    .line 526
    .line 527
    .line 528
    iput-object v2, v11, Lcom/appsflyer/internal/AFf1jSDK;->AFLogger:Lcom/appsflyer/internal/AFh1aSDK;

    .line 529
    .line 530
    iput-wide v9, v11, Lcom/appsflyer/internal/AFf1jSDK;->registerClient:J

    .line 531
    .line 532
    iput-wide v4, v11, Lcom/appsflyer/internal/AFf1jSDK;->unregisterClient:J

    .line 533
    .line 534
    new-instance v2, Ljava/lang/StringBuilder;

    .line 535
    .line 536
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 540
    .line 541
    .line 542
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 543
    .line 544
    .line 545
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v9

    .line 549
    const/4 v11, 0x4

    .line 550
    const/4 v12, 0x0

    .line 551
    const/4 v10, 0x0

    .line 552
    invoke-static/range {v7 .. v12}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 553
    .line 554
    .line 555
    new-instance v5, Lcom/appsflyer/internal/AFf1xSDK;

    .line 556
    .line 557
    invoke-virtual/range {v17 .. v17}, Lcom/appsflyer/internal/AFd1fSDK;->getBody()Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    move-object v10, v0

    .line 562
    check-cast v10, Lcom/appsflyer/internal/AFh1aSDK;

    .line 563
    .line 564
    iget-object v11, v13, Lcom/appsflyer/internal/AFi1uSDK;->AFLogger:Lcom/appsflyer/internal/AFh1dSDK;
    :try_end_e
    .catch Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException; {:try_start_e .. :try_end_e} :catch_5
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_4
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    .line 565
    .line 566
    const/4 v13, 0x0

    .line 567
    move-object v12, v14

    .line 568
    move-object/from16 v6, v16

    .line 569
    .line 570
    move-object/from16 v9, v17

    .line 571
    .line 572
    move-wide/from16 v7, v18

    .line 573
    .line 574
    :try_start_f
    invoke-direct/range {v5 .. v13}, Lcom/appsflyer/internal/AFf1xSDK;-><init>(Ljava/lang/String;JLcom/appsflyer/internal/AFd1fSDK;Lcom/appsflyer/internal/AFh1aSDK;Lcom/appsflyer/internal/AFh1dSDK;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 575
    .line 576
    .line 577
    invoke-direct {v1, v5}, Lcom/appsflyer/internal/AFf1oSDK;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFf1xSDK;)V

    .line 578
    .line 579
    .line 580
    sget-object v0, Lcom/appsflyer/internal/AFf1pSDK;->AFLogger:Lcom/appsflyer/internal/AFf1pSDK;
    :try_end_f
    .catch Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException; {:try_start_f .. :try_end_f} :catch_1
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_0
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    .line 581
    .line 582
    return-object v0

    .line 583
    :catchall_2
    move-exception v0

    .line 584
    move-object/from16 v6, v16

    .line 585
    .line 586
    :goto_c
    move-wide/from16 v7, v18

    .line 587
    .line 588
    goto/16 :goto_4

    .line 589
    .line 590
    :catch_4
    move-exception v0

    .line 591
    move-object/from16 v6, v16

    .line 592
    .line 593
    :goto_d
    move-wide/from16 v7, v18

    .line 594
    .line 595
    goto/16 :goto_5

    .line 596
    .line 597
    :catch_5
    move-exception v0

    .line 598
    move-object/from16 v6, v16

    .line 599
    .line 600
    :goto_e
    move-wide/from16 v7, v18

    .line 601
    .line 602
    goto/16 :goto_7

    .line 603
    .line 604
    :catchall_3
    move-exception v0

    .line 605
    goto :goto_c

    .line 606
    :catch_6
    move-exception v0

    .line 607
    goto :goto_d

    .line 608
    :catch_7
    move-exception v0

    .line 609
    goto :goto_e

    .line 610
    :cond_d
    move-object v9, v5

    .line 611
    move-object v0, v7

    .line 612
    move-object v2, v8

    .line 613
    move-object v12, v14

    .line 614
    move-wide/from16 v7, v18

    .line 615
    .line 616
    :try_start_10
    new-instance v5, Lcom/appsflyer/internal/AFf1xSDK;

    .line 617
    .line 618
    invoke-virtual {v9}, Lcom/appsflyer/internal/AFd1fSDK;->getBody()Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object v3

    .line 622
    move-object v10, v3

    .line 623
    check-cast v10, Lcom/appsflyer/internal/AFh1aSDK;

    .line 624
    .line 625
    iget-object v11, v13, Lcom/appsflyer/internal/AFi1uSDK;->AFLogger:Lcom/appsflyer/internal/AFh1dSDK;

    .line 626
    .line 627
    const/4 v13, 0x0

    .line 628
    invoke-direct/range {v5 .. v13}, Lcom/appsflyer/internal/AFf1xSDK;-><init>(Ljava/lang/String;JLcom/appsflyer/internal/AFd1fSDK;Lcom/appsflyer/internal/AFh1aSDK;Lcom/appsflyer/internal/AFh1dSDK;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_10
    .catch Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException; {:try_start_10 .. :try_end_10} :catch_b
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_a
    .catchall {:try_start_10 .. :try_end_10} :catchall_5

    .line 629
    .line 630
    .line 631
    move-wide v3, v7

    .line 632
    :try_start_11
    invoke-direct {v1, v5}, Lcom/appsflyer/internal/AFf1oSDK;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFf1xSDK;)V

    .line 633
    .line 634
    .line 635
    const-string v9, "fetched config is not valid (MITM?) refuse to use it."

    .line 636
    .line 637
    const/4 v11, 0x4

    .line 638
    const/4 v12, 0x0

    .line 639
    const/4 v10, 0x0

    .line 640
    move-object v7, v0

    .line 641
    move-object v8, v2

    .line 642
    invoke-static/range {v7 .. v12}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 643
    .line 644
    .line 645
    sget-object v0, Lcom/appsflyer/internal/AFf1pSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFf1pSDK;

    .line 646
    .line 647
    return-object v0

    .line 648
    :catchall_4
    move-exception v0

    .line 649
    :goto_f
    move-object v10, v0

    .line 650
    goto/16 :goto_13

    .line 651
    .line 652
    :catch_8
    move-exception v0

    .line 653
    :goto_10
    move-object v5, v0

    .line 654
    move-wide v7, v3

    .line 655
    goto/16 :goto_6

    .line 656
    .line 657
    :catch_9
    move-exception v0

    .line 658
    :goto_11
    move-object v5, v0

    .line 659
    move-wide v7, v3

    .line 660
    goto/16 :goto_8

    .line 661
    .line 662
    :catchall_5
    move-exception v0

    .line 663
    move-wide v3, v7

    .line 664
    goto :goto_f

    .line 665
    :catch_a
    move-exception v0

    .line 666
    move-wide v3, v7

    .line 667
    goto/16 :goto_5

    .line 668
    .line 669
    :catch_b
    move-exception v0

    .line 670
    move-wide v3, v7

    .line 671
    goto/16 :goto_7

    .line 672
    .line 673
    :catchall_6
    move-exception v0

    .line 674
    move-wide/from16 v3, v18

    .line 675
    .line 676
    goto :goto_f

    .line 677
    :catch_c
    move-exception v0

    .line 678
    move-wide/from16 v3, v18

    .line 679
    .line 680
    goto :goto_10

    .line 681
    :catch_d
    move-exception v0

    .line 682
    move-wide/from16 v3, v18

    .line 683
    .line 684
    goto :goto_11

    .line 685
    :goto_12
    const-string v9, "Dev key is not set, SDK is not started."

    .line 686
    .line 687
    const/4 v11, 0x4

    .line 688
    const/4 v12, 0x0

    .line 689
    const/4 v10, 0x0

    .line 690
    invoke-static/range {v7 .. v12}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 691
    .line 692
    .line 693
    sget-object v0, Lcom/appsflyer/internal/AFf1pSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFf1pSDK;

    .line 694
    .line 695
    return-object v0

    .line 696
    :cond_e
    move-object v9, v5

    .line 697
    move-object v0, v7

    .line 698
    move-object v14, v8

    .line 699
    move-wide/from16 v3, v18

    .line 700
    .line 701
    new-instance v5, Lcom/appsflyer/internal/AFf1xSDK;

    .line 702
    .line 703
    invoke-virtual {v9}, Lcom/appsflyer/internal/AFd1fSDK;->getBody()Ljava/lang/Object;

    .line 704
    .line 705
    .line 706
    move-result-object v7

    .line 707
    move-object v10, v7

    .line 708
    check-cast v10, Lcom/appsflyer/internal/AFh1aSDK;
    :try_end_11
    .catch Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException; {:try_start_11 .. :try_end_11} :catch_9
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_8
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    .line 709
    .line 710
    const/4 v12, 0x0

    .line 711
    const/4 v13, 0x0

    .line 712
    const/4 v11, 0x0

    .line 713
    move-wide v7, v3

    .line 714
    :try_start_12
    invoke-direct/range {v5 .. v13}, Lcom/appsflyer/internal/AFf1xSDK;-><init>(Ljava/lang/String;JLcom/appsflyer/internal/AFd1fSDK;Lcom/appsflyer/internal/AFh1aSDK;Lcom/appsflyer/internal/AFh1dSDK;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_12
    .catch Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException; {:try_start_12 .. :try_end_12} :catch_b
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_a
    .catchall {:try_start_12 .. :try_end_12} :catchall_5

    .line 715
    .line 716
    .line 717
    :try_start_13
    invoke-direct {v1, v5}, Lcom/appsflyer/internal/AFf1oSDK;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFf1xSDK;)V

    .line 718
    .line 719
    .line 720
    invoke-virtual {v9}, Lcom/appsflyer/internal/AFd1fSDK;->getStatusCode()I

    .line 721
    .line 722
    .line 723
    move-result v5

    .line 724
    new-instance v7, Ljava/lang/StringBuilder;

    .line 725
    .line 726
    invoke-direct {v7, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 727
    .line 728
    .line 729
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 730
    .line 731
    .line 732
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 733
    .line 734
    .line 735
    move-result-object v9

    .line 736
    const/4 v11, 0x4

    .line 737
    const/4 v12, 0x0

    .line 738
    const/4 v10, 0x0

    .line 739
    move-object v7, v0

    .line 740
    move-object v8, v14

    .line 741
    invoke-static/range {v7 .. v12}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 742
    .line 743
    .line 744
    sget-object v0, Lcom/appsflyer/internal/AFf1pSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFf1pSDK;
    :try_end_13
    .catch Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException; {:try_start_13 .. :try_end_13} :catch_9
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_8
    .catchall {:try_start_13 .. :try_end_13} :catchall_4

    .line 745
    .line 746
    return-object v0

    .line 747
    :goto_13
    invoke-virtual {v10}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 748
    .line 749
    .line 750
    move-result-object v0

    .line 751
    const-string v2, "failed to update remote config: "

    .line 752
    .line 753
    invoke-static {v2, v0}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 754
    .line 755
    .line 756
    move-result-object v9

    .line 757
    sget-object v7, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 758
    .line 759
    sget-object v8, Lcom/appsflyer/sdk_base/logger/LogTag;->REMOTE_CONTROL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 760
    .line 761
    const/16 v15, 0x40

    .line 762
    .line 763
    const/16 v16, 0x0

    .line 764
    .line 765
    const/4 v11, 0x1

    .line 766
    const/4 v12, 0x0

    .line 767
    const/4 v13, 0x0

    .line 768
    const/4 v14, 0x0

    .line 769
    invoke-static/range {v7 .. v16}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 770
    .line 771
    .line 772
    new-instance v5, Lcom/appsflyer/internal/AFf1xSDK;

    .line 773
    .line 774
    const/4 v11, 0x0

    .line 775
    const/4 v12, 0x0

    .line 776
    const/4 v9, 0x0

    .line 777
    move-object v13, v10

    .line 778
    const/4 v10, 0x0

    .line 779
    move-wide v7, v3

    .line 780
    invoke-direct/range {v5 .. v13}, Lcom/appsflyer/internal/AFf1xSDK;-><init>(Ljava/lang/String;JLcom/appsflyer/internal/AFd1fSDK;Lcom/appsflyer/internal/AFh1aSDK;Lcom/appsflyer/internal/AFh1dSDK;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 781
    .line 782
    .line 783
    move-object v10, v13

    .line 784
    invoke-direct {v1, v5}, Lcom/appsflyer/internal/AFf1oSDK;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFf1xSDK;)V

    .line 785
    .line 786
    .line 787
    invoke-virtual {v10}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 788
    .line 789
    .line 790
    move-result-object v0

    .line 791
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 792
    .line 793
    if-nez v1, :cond_f

    .line 794
    .line 795
    sget-object v0, Lcom/appsflyer/internal/AFf1pSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFf1pSDK;

    .line 796
    .line 797
    goto :goto_16

    .line 798
    :cond_f
    throw v0

    .line 799
    :goto_14
    const/4 v6, 0x0

    .line 800
    move-wide v3, v7

    .line 801
    invoke-direct/range {v1 .. v6}, Lcom/appsflyer/internal/AFf1oSDK;->d(Ljava/lang/String;JLjava/io/IOException;Lcom/appsflyer/internal/AFd1fSDK;)V

    .line 802
    .line 803
    .line 804
    invoke-virtual {v5}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 805
    .line 806
    .line 807
    move-result-object v0

    .line 808
    instance-of v1, v0, Ljava/io/InterruptedIOException;

    .line 809
    .line 810
    if-nez v1, :cond_10

    .line 811
    .line 812
    sget-object v0, Lcom/appsflyer/internal/AFf1pSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFf1pSDK;

    .line 813
    .line 814
    goto :goto_16

    .line 815
    :cond_10
    throw v0

    .line 816
    :goto_15
    invoke-virtual {v5}, Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException;->getRawResponse()Lcom/appsflyer/internal/AFd1fSDK;

    .line 817
    .line 818
    .line 819
    move-result-object v6

    .line 820
    move-object/from16 v1, p0

    .line 821
    .line 822
    move-wide v3, v7

    .line 823
    invoke-direct/range {v1 .. v6}, Lcom/appsflyer/internal/AFf1oSDK;->d(Ljava/lang/String;JLjava/io/IOException;Lcom/appsflyer/internal/AFd1fSDK;)V

    .line 824
    .line 825
    .line 826
    invoke-virtual {v5}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 827
    .line 828
    .line 829
    move-result-object v0

    .line 830
    instance-of v1, v0, Ljava/io/InterruptedIOException;

    .line 831
    .line 832
    if-nez v1, :cond_11

    .line 833
    .line 834
    sget-object v0, Lcom/appsflyer/internal/AFf1pSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFf1pSDK;

    .line 835
    .line 836
    :goto_16
    return-object v0

    .line 837
    :cond_11
    throw v0
.end method


# virtual methods
.method public final AFLogger()Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public final d()J
    .locals 2

    .line 52
    const-wide/16 v0, 0x5dc

    return-wide v0
.end method

.method public final registerClient()Lcom/appsflyer/internal/AFd1cSDK;
    .locals 11

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/appsflyer/internal/AFf1oSDK;->e()Lcom/appsflyer/internal/AFf1pSDK;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lcom/appsflyer/internal/AFf1oSDK;->i:Lcom/appsflyer/internal/AFf1pSDK;
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/InterruptedIOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    sget-object p0, Lcom/appsflyer/internal/AFf1pSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFf1pSDK;

    .line 8
    .line 9
    if-ne v0, p0, :cond_0

    .line 10
    .line 11
    sget-object p0, Lcom/appsflyer/internal/AFd1cSDK;->registerClient:Lcom/appsflyer/internal/AFd1cSDK;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    sget-object p0, Lcom/appsflyer/internal/AFd1cSDK;->d:Lcom/appsflyer/internal/AFd1cSDK;

    .line 15
    .line 16
    return-object p0

    .line 17
    :catch_0
    move-exception v0

    .line 18
    move-object v4, v0

    .line 19
    goto :goto_0

    .line 20
    :catch_1
    move-exception v0

    .line 21
    move-object v4, v0

    .line 22
    goto :goto_1

    .line 23
    :goto_0
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 24
    .line 25
    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->REMOTE_CONTROL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 26
    .line 27
    const/16 v9, 0x40

    .line 28
    .line 29
    const/4 v10, 0x0

    .line 30
    const-string v3, "RC update config failed"

    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    const/4 v6, 0x0

    .line 34
    const/4 v7, 0x0

    .line 35
    const/4 v8, 0x0

    .line 36
    invoke-static/range {v1 .. v10}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    sget-object v0, Lcom/appsflyer/internal/AFf1pSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFf1pSDK;

    .line 40
    .line 41
    iput-object v0, p0, Lcom/appsflyer/internal/AFf1oSDK;->i:Lcom/appsflyer/internal/AFf1pSDK;

    .line 42
    .line 43
    sget-object p0, Lcom/appsflyer/internal/AFd1cSDK;->unregisterClient:Lcom/appsflyer/internal/AFd1cSDK;

    .line 44
    .line 45
    return-object p0

    .line 46
    :goto_1
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 47
    .line 48
    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->REMOTE_CONTROL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 49
    .line 50
    const/16 v9, 0x40

    .line 51
    .line 52
    const/4 v10, 0x0

    .line 53
    const-string v3, "RC update config failed"

    .line 54
    .line 55
    const/4 v5, 0x0

    .line 56
    const/4 v6, 0x0

    .line 57
    const/4 v7, 0x0

    .line 58
    const/4 v8, 0x0

    .line 59
    invoke-static/range {v1 .. v10}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    sget-object v0, Lcom/appsflyer/internal/AFf1pSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFf1pSDK;

    .line 63
    .line 64
    iput-object v0, p0, Lcom/appsflyer/internal/AFf1oSDK;->i:Lcom/appsflyer/internal/AFf1pSDK;

    .line 65
    .line 66
    sget-object p0, Lcom/appsflyer/internal/AFd1cSDK;->unregisterClient:Lcom/appsflyer/internal/AFd1cSDK;

    .line 67
    .line 68
    return-object p0

    .line 69
    :catch_2
    sget-object v0, Lcom/appsflyer/internal/AFf1pSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFf1pSDK;

    .line 70
    .line 71
    iput-object v0, p0, Lcom/appsflyer/internal/AFf1oSDK;->i:Lcom/appsflyer/internal/AFf1pSDK;

    .line 72
    .line 73
    sget-object p0, Lcom/appsflyer/internal/AFd1cSDK;->unregisterClient:Lcom/appsflyer/internal/AFd1cSDK;

    .line 74
    .line 75
    return-object p0
.end method
