.class public final Lcom/appsflyer/internal/AFh1xSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

.field public final AFLogger:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public afDebugLog:J

.field public afErrorLog:J

.field public afInfoLog:J

.field public final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public e:J

.field public final force:[J

.field public i:J

.field public final registerClient:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final unregisterClient:Lcom/appsflyer/internal/AFc1iSDK;

.field public final v:[J

.field public final w:[J


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFc1kSDK;Lcom/appsflyer/internal/AFc1iSDK;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/appsflyer/internal/AFh1xSDK;->d:Ljava/util/Map;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/appsflyer/internal/AFh1xSDK;->registerClient:Ljava/util/Map;

    .line 17
    .line 18
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/appsflyer/internal/AFh1xSDK;->AFLogger:Ljava/util/Map;

    .line 24
    .line 25
    const-wide/16 v0, 0x0

    .line 26
    .line 27
    iput-wide v0, p0, Lcom/appsflyer/internal/AFh1xSDK;->i:J

    .line 28
    .line 29
    iput-wide v0, p0, Lcom/appsflyer/internal/AFh1xSDK;->e:J

    .line 30
    .line 31
    const/4 v2, 0x2

    .line 32
    new-array v3, v2, [J

    .line 33
    .line 34
    iput-object v3, p0, Lcom/appsflyer/internal/AFh1xSDK;->force:[J

    .line 35
    .line 36
    new-array v3, v2, [J

    .line 37
    .line 38
    iput-object v3, p0, Lcom/appsflyer/internal/AFh1xSDK;->v:[J

    .line 39
    .line 40
    new-array v2, v2, [J

    .line 41
    .line 42
    iput-object v2, p0, Lcom/appsflyer/internal/AFh1xSDK;->w:[J

    .line 43
    .line 44
    iput-wide v0, p0, Lcom/appsflyer/internal/AFh1xSDK;->afErrorLog:J

    .line 45
    .line 46
    iput-wide v0, p0, Lcom/appsflyer/internal/AFh1xSDK;->afDebugLog:J

    .line 47
    .line 48
    iput-object p1, p0, Lcom/appsflyer/internal/AFh1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 49
    .line 50
    iput-object p2, p0, Lcom/appsflyer/internal/AFh1xSDK;->unregisterClient:Lcom/appsflyer/internal/AFc1iSDK;

    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final AFLogger(Ljava/lang/String;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 79
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 80
    iget-object p0, p0, Lcom/appsflyer/internal/AFh1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-interface {p0, p1}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 81
    :try_start_0
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 82
    invoke-static {p1}, Lcom/appsflyer/internal/AFg1dSDK;->unregisterClient(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 83
    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v2, "Error while parsing cached JSON data for metrics"

    invoke-virtual {p1, v1, v2, p0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-object v0
.end method

.method public final AFLogger()V
    .locals 5

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, Lcom/appsflyer/internal/AFh1xSDK;->e:J

    .line 6
    .line 7
    iget-object v0, p0, Lcom/appsflyer/internal/AFh1xSDK;->unregisterClient:Lcom/appsflyer/internal/AFc1iSDK;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 10
    .line 11
    const-string v1, "appsFlyerCount"

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-interface {v0, v1, v2}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    iget-wide v0, p0, Lcom/appsflyer/internal/AFh1xSDK;->i:J

    .line 21
    .line 22
    const-wide/16 v2, 0x0

    .line 23
    .line 24
    cmp-long v2, v0, v2

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    iget-object v2, p0, Lcom/appsflyer/internal/AFh1xSDK;->d:Ljava/util/Map;

    .line 29
    .line 30
    iget-wide v3, p0, Lcom/appsflyer/internal/AFh1xSDK;->e:J

    .line 31
    .line 32
    sub-long/2addr v3, v0

    .line 33
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v1, "init_to_fg"

    .line 38
    .line 39
    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/appsflyer/internal/AFh1xSDK;->d:Ljava/util/Map;

    .line 43
    .line 44
    new-instance v1, Lorg/json/JSONObject;

    .line 45
    .line 46
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 47
    .line 48
    .line 49
    iget-object p0, p0, Lcom/appsflyer/internal/AFh1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 50
    .line 51
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const-string v1, "first_launch"

    .line 56
    .line 57
    invoke-interface {p0, v1, v0}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_0
    sget-object p0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 62
    .line 63
    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 64
    .line 65
    const-string v1, "Metrics collection skipped: initialization timestamp not recorded"

    .line 66
    .line 67
    invoke-virtual {p0, v0, v1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    return-void
.end method

.method public final AFLogger(I)V
    .locals 6

    .line 71
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 72
    iget-wide v2, p0, Lcom/appsflyer/internal/AFh1xSDK;->afDebugLog:J

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-eqz v4, :cond_0

    .line 73
    iget-object v4, p0, Lcom/appsflyer/internal/AFh1xSDK;->AFLogger:Ljava/util/Map;

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "net"

    invoke-interface {v4, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 74
    :cond_0
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v2, "Metrics collection skipped: GCD start timestamp not recorded"

    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 75
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFh1xSDK;->AFLogger:Ljava/util/Map;

    const-string v1, "retries"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    iget-object p1, p0, Lcom/appsflyer/internal/AFh1xSDK;->AFLogger:Ljava/util/Map;

    .line 77
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 78
    iget-object p0, p0, Lcom/appsflyer/internal/AFh1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "gcd"

    invoke-interface {p0, v0, p1}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final registerClient(Lcom/appsflyer/share/deeplink/DeepLinkResult;J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFh1xSDK;->registerClient:Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/appsflyer/share/deeplink/DeepLinkResult;->getStatus()Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string v1, "status"

    .line 12
    .line 13
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lcom/appsflyer/internal/AFh1xSDK;->registerClient:Ljava/util/Map;

    .line 17
    .line 18
    const-string p1, "timeout_value"

    .line 19
    .line 20
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final unregisterClient(Lcom/appsflyer/internal/AFh1uSDK;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFh1xSDK;->unregisterClient:Lcom/appsflyer/internal/AFc1iSDK;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 4
    .line 5
    const-string v1, "appsFlyerCount"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-interface {v0, v1, v2}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/appsflyer/internal/AFh1xSDK;->d:Ljava/util/Map;

    .line 15
    .line 16
    const-string v1, "api_name"

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lcom/appsflyer/internal/AFh1xSDK;->d:Ljava/util/Map;

    .line 26
    .line 27
    new-instance v0, Lorg/json/JSONObject;

    .line 28
    .line 29
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, Lcom/appsflyer/internal/AFh1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 33
    .line 34
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const-string v0, "first_launch"

    .line 39
    .line 40
    invoke-interface {p0, v0, p1}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    return-void
.end method
