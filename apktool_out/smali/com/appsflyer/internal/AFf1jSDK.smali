.class public final Lcom/appsflyer/internal/AFf1jSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

.field public AFLogger:Lcom/appsflyer/internal/AFh1aSDK;

.field public d:Lcom/appsflyer/internal/AFh1aSDK;

.field public registerClient:J

.field public unregisterClient:J


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFc1kSDK;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/appsflyer/internal/AFf1jSDK;->d:Lcom/appsflyer/internal/AFh1aSDK;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/appsflyer/internal/AFf1jSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/appsflyer/internal/AFf1jSDK;->unregisterClient()Lcom/appsflyer/internal/AFh1aSDK;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/appsflyer/internal/AFf1jSDK;->AFLogger:Lcom/appsflyer/internal/AFh1aSDK;

    .line 14
    .line 15
    const-string v0, "af_rc_timestamp"

    .line 16
    .line 17
    const-wide/16 v1, 0x0

    .line 18
    .line 19
    invoke-interface {p1, v0, v1, v2}, Lcom/appsflyer/internal/AFc1kSDK;->unregisterClient(Ljava/lang/String;J)J

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    iput-wide v3, p0, Lcom/appsflyer/internal/AFf1jSDK;->registerClient:J

    .line 24
    .line 25
    const-string v0, "af_rc_max_age"

    .line 26
    .line 27
    invoke-interface {p1, v0, v1, v2}, Lcom/appsflyer/internal/AFc1kSDK;->unregisterClient(Ljava/lang/String;J)J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    iput-wide v0, p0, Lcom/appsflyer/internal/AFf1jSDK;->unregisterClient:J

    .line 32
    .line 33
    return-void
.end method

.method private unregisterClient()Lcom/appsflyer/internal/AFh1aSDK;
    .locals 5

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFf1jSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 2
    .line 3
    const-string v0, "af_remote_config"

    .line 4
    .line 5
    invoke-interface {p0, v0}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    sget-object p0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 13
    .line 14
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->REMOTE_CONTROL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 15
    .line 16
    const-string v2, "No configuration found in cache"

    .line 17
    .line 18
    invoke-virtual {p0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    :try_start_0
    new-instance v1, Ljava/lang/String;

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    invoke-static {p0, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-direct {v1, p0, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 34
    .line 35
    .line 36
    new-instance p0, Lcom/appsflyer/internal/AFh1aSDK;

    .line 37
    .line 38
    invoke-direct {p0, v1}, Lcom/appsflyer/internal/AFh1aSDK;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    .line 41
    return-object p0

    .line 42
    :catch_0
    move-exception p0

    .line 43
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 44
    .line 45
    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->REMOTE_CONTROL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 46
    .line 47
    const-string v3, "Error reading malformed configuration from cache, requires fetching from remote again"

    .line 48
    .line 49
    const/4 v4, 0x1

    .line 50
    invoke-virtual {v1, v2, v3, p0, v4}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 51
    .line 52
    .line 53
    return-object v0
.end method
