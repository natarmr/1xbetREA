.class final Lcom/appsflyer/internal/AFf1fSDK$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFf1cSDK$AFa1zSDK;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/appsflyer/internal/AFf1fSDK;->d(Lcom/appsflyer/internal/AFc1iSDK;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field private synthetic registerClient:Lcom/appsflyer/internal/AFf1fSDK;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFf1fSDK;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/appsflyer/internal/AFf1fSDK$3;->registerClient:Lcom/appsflyer/internal/AFf1fSDK;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1fSDK$3;->registerClient:Lcom/appsflyer/internal/AFf1fSDK;

    .line 2
    .line 3
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object v1, v0, Lcom/appsflyer/internal/AFf1fSDK;->AFKeystoreWrapper:Ljava/util/Map;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const-string v0, "unknown"

    .line 17
    .line 18
    :cond_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFf1fSDK$3;->registerClient:Lcom/appsflyer/internal/AFf1fSDK;

    .line 19
    .line 20
    invoke-virtual {v1}, Lcom/appsflyer/internal/AFf1fSDK;->registerClient()V

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, Lcom/appsflyer/internal/AFf1fSDK$3;->registerClient:Lcom/appsflyer/internal/AFf1fSDK;

    .line 24
    .line 25
    iget-object p0, p0, Lcom/appsflyer/internal/AFf1fSDK;->AFKeystoreWrapper:Ljava/util/Map;

    .line 26
    .line 27
    const-string v1, "error"

    .line 28
    .line 29
    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 33
    .line 34
    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->SECURITY:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 35
    .line 36
    const-string p0, "Failed to retrieve Google LVL data: "

    .line 37
    .line 38
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    const/4 v8, 0x0

    .line 47
    const/4 v9, 0x1

    .line 48
    const/4 v6, 0x1

    .line 49
    const/4 v7, 0x1

    .line 50
    move-object v5, p2

    .line 51
    invoke-virtual/range {v2 .. v9}, Lcom/appsflyer/AFLogger;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final registerClient(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1fSDK$3;->registerClient:Lcom/appsflyer/internal/AFf1fSDK;

    .line 2
    .line 3
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object v1, v0, Lcom/appsflyer/internal/AFf1fSDK;->AFKeystoreWrapper:Ljava/util/Map;

    .line 9
    .line 10
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1fSDK$3;->registerClient:Lcom/appsflyer/internal/AFf1fSDK;

    .line 11
    .line 12
    iget-object v0, v0, Lcom/appsflyer/internal/AFf1fSDK;->AFKeystoreWrapper:Ljava/util/Map;

    .line 13
    .line 14
    const-string v1, "signedData"

    .line 15
    .line 16
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lcom/appsflyer/internal/AFf1fSDK$3;->registerClient:Lcom/appsflyer/internal/AFf1fSDK;

    .line 20
    .line 21
    iget-object p1, p1, Lcom/appsflyer/internal/AFf1fSDK;->AFKeystoreWrapper:Ljava/util/Map;

    .line 22
    .line 23
    const-string v0, "signature"

    .line 24
    .line 25
    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lcom/appsflyer/internal/AFf1fSDK$3;->registerClient:Lcom/appsflyer/internal/AFf1fSDK;

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFf1fSDK;->registerClient()V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 34
    .line 35
    sget-object p1, Lcom/appsflyer/sdk_base/logger/LogTag;->SECURITY:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 36
    .line 37
    const-string p2, "Google License Verification Library (LVL) data retrieved successfully"

    .line 38
    .line 39
    invoke-virtual {p0, p1, p2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method
