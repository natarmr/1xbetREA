.class public final Lcom/appsflyer/internal/AFf1ySDK;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final AFKeystoreWrapper:J

.field private static final d:I

.field private static final unregisterClient:Lkotlin/ranges/IntRange;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, La/wen;->b:La/uen;

    .line 2
    .line 3
    sget-object v0, La/bfn;->e:La/bfn;

    .line 4
    .line 5
    const/16 v1, 0x3c

    .line 6
    .line 7
    invoke-static {v1, v0}, La/ibc;->v0(ILa/bfn;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    invoke-static {v1, v2}, La/wen;->e(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    sput-wide v1, Lcom/appsflyer/internal/AFf1ySDK;->AFKeystoreWrapper:J

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    invoke-static {v1, v0}, La/ibc;->v0(ILa/bfn;)J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    invoke-static {v0, v1}, La/wen;->e(J)J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    long-to-int v0, v0

    .line 27
    sput v0, Lcom/appsflyer/internal/AFf1ySDK;->d:I

    .line 28
    .line 29
    new-instance v0, Lkotlin/ranges/IntRange;

    .line 30
    .line 31
    const/16 v1, 0x131

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    const/16 v3, 0x12c

    .line 35
    .line 36
    invoke-direct {v0, v3, v1, v2}, Lkotlin/ranges/a;-><init>(III)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lcom/appsflyer/internal/AFf1ySDK;->unregisterClient:Lkotlin/ranges/IntRange;

    .line 40
    .line 41
    return-void
.end method

.method public static final synthetic unregisterClient()J
    .locals 2

    .line 1
    sget-wide v0, Lcom/appsflyer/internal/AFf1ySDK;->AFKeystoreWrapper:J

    .line 2
    .line 3
    return-wide v0
.end method

.method private static final x_(Landroid/net/Uri;)Ljava/util/Map;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 7
    .line 8
    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v4, "ESP deeplink resolving is started: "

    .line 13
    .line 14
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    const/4 v6, 0x4

    .line 25
    const/4 v7, 0x0

    .line 26
    const/4 v5, 0x0

    .line 27
    invoke-static/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    :try_start_0
    new-instance v0, Ljava/net/URL;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {p0}, Lcom/google/firebase/perf/network/FirebasePerfUrlConnection;->instrument(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, Ljava/net/URLConnection;

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    check-cast p0, Ljava/net/HttpURLConnection;

    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    invoke-virtual {p0, v0}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 57
    .line 58
    .line 59
    sget v0, Lcom/appsflyer/internal/AFf1ySDK;->d:I

    .line 60
    .line 61
    invoke-virtual {p0, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 65
    .line 66
    .line 67
    const-string v0, "User-agent"

    .line 68
    .line 69
    const-string v5, "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)"

    .line 70
    .line 71
    invoke-virtual {p0, v0, v5}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const-string v0, "af-esp"

    .line 75
    .line 76
    const-string v5, "7.0.1"

    .line 77
    .line 78
    invoke-virtual {p0, v0, v5}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 79
    .line 80
    .line 81
    :try_start_1
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    const-string v5, "status"

    .line 90
    .line 91
    invoke-interface {v1, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    sget-object v4, Lcom/appsflyer/internal/AFf1ySDK;->unregisterClient:Lkotlin/ranges/IntRange;

    .line 95
    .line 96
    iget v5, v4, Lkotlin/ranges/a;->a:I

    .line 97
    .line 98
    iget v4, v4, Lkotlin/ranges/a;->b:I

    .line 99
    .line 100
    if-gt v0, v4, :cond_0

    .line 101
    .line 102
    if-gt v5, v0, :cond_0

    .line 103
    .line 104
    const-string v0, "Location"

    .line 105
    .line 106
    invoke-virtual {p0, v0}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    if-eqz v0, :cond_0

    .line 111
    .line 112
    const-string v4, "res"

    .line 113
    .line 114
    invoke-interface {v1, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :catchall_0
    move-exception v0

    .line 119
    move-object v4, p0

    .line 120
    :goto_0
    move-object v8, v0

    .line 121
    goto :goto_2

    .line 122
    :cond_0
    :goto_1
    const-string v4, "ESP deeplink resolving is finished"

    .line 123
    .line 124
    const/4 v6, 0x4

    .line 125
    const/4 v7, 0x0

    .line 126
    const/4 v5, 0x0

    .line 127
    invoke-static/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 131
    .line 132
    .line 133
    return-object v1

    .line 134
    :catchall_1
    move-exception v0

    .line 135
    goto :goto_0

    .line 136
    :goto_2
    :try_start_2
    invoke-virtual {v8}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    if-eqz p0, :cond_1

    .line 141
    .line 142
    const-string v0, "error"

    .line 143
    .line 144
    invoke-interface {v1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    goto :goto_3

    .line 148
    :catchall_2
    move-exception v0

    .line 149
    move-object p0, v0

    .line 150
    goto :goto_4

    .line 151
    :cond_1
    :goto_3
    sget-object v5, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 152
    .line 153
    sget-object v6, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 154
    .line 155
    invoke-virtual {v8}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    if-nez p0, :cond_2

    .line 160
    .line 161
    const-string p0, "Error resolving ESP deeplink"

    .line 162
    .line 163
    :cond_2
    move-object v7, p0

    .line 164
    const/16 v13, 0x78

    .line 165
    .line 166
    const/4 v14, 0x0

    .line 167
    const/4 v9, 0x0

    .line 168
    const/4 v10, 0x0

    .line 169
    const/4 v11, 0x0

    .line 170
    const/4 v12, 0x0

    .line 171
    invoke-static/range {v5 .. v14}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 172
    .line 173
    .line 174
    if-eqz v4, :cond_3

    .line 175
    .line 176
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 177
    .line 178
    .line 179
    :cond_3
    return-object v1

    .line 180
    :goto_4
    if-eqz v4, :cond_4

    .line 181
    .line 182
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 183
    .line 184
    .line 185
    :cond_4
    throw p0
.end method

.method public static final synthetic y_(Landroid/net/Uri;)Ljava/util/Map;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/appsflyer/internal/AFf1ySDK;->x_(Landroid/net/Uri;)Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
