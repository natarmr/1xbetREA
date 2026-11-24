.class public final Lcom/appsflyer/internal/AFd1pSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ResponseBody:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final AFKeystoreWrapper:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final AFLogger:Ljava/util/concurrent/ExecutorService;

.field private final d:Lcom/appsflyer/internal/AFd1iSDK;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/appsflyer/internal/AFd1iSDK<",
            "TResponseBody;>;"
        }
    .end annotation
.end field

.field private final registerClient:Lcom/appsflyer/internal/AFd1mSDK;

.field public final unregisterClient:Lcom/appsflyer/internal/AFd1oSDK;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFd1oSDK;Ljava/util/concurrent/ExecutorService;Lcom/appsflyer/internal/AFd1mSDK;Lcom/appsflyer/internal/AFd1iSDK;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFd1oSDK;",
            "Ljava/util/concurrent/ExecutorService;",
            "Lcom/appsflyer/internal/AFd1mSDK;",
            "Lcom/appsflyer/internal/AFd1iSDK<",
            "TResponseBody;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/appsflyer/internal/AFd1pSDK;->AFKeystoreWrapper:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    iput-object p1, p0, Lcom/appsflyer/internal/AFd1pSDK;->unregisterClient:Lcom/appsflyer/internal/AFd1oSDK;

    .line 13
    .line 14
    iput-object p2, p0, Lcom/appsflyer/internal/AFd1pSDK;->AFLogger:Ljava/util/concurrent/ExecutorService;

    .line 15
    .line 16
    iput-object p3, p0, Lcom/appsflyer/internal/AFd1pSDK;->registerClient:Lcom/appsflyer/internal/AFd1mSDK;

    .line 17
    .line 18
    iput-object p4, p0, Lcom/appsflyer/internal/AFd1pSDK;->d:Lcom/appsflyer/internal/AFd1iSDK;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final AFKeystoreWrapper()Lcom/appsflyer/internal/AFd1fSDK;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/appsflyer/internal/AFd1fSDK<",
            "TResponseBody;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1pSDK;->AFKeystoreWrapper:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1pSDK;->registerClient:Lcom/appsflyer/internal/AFd1mSDK;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/appsflyer/internal/AFd1pSDK;->unregisterClient:Lcom/appsflyer/internal/AFd1oSDK;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/appsflyer/internal/AFd1mSDK;->registerClient(Lcom/appsflyer/internal/AFd1oSDK;)Lcom/appsflyer/internal/AFd1fSDK;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :try_start_0
    iget-object p0, p0, Lcom/appsflyer/internal/AFd1pSDK;->d:Lcom/appsflyer/internal/AFd1iSDK;

    .line 19
    .line 20
    invoke-virtual {v1}, Lcom/appsflyer/internal/AFd1fSDK;->getBody()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Ljava/lang/String;

    .line 25
    .line 26
    invoke-interface {p0, v0}, Lcom/appsflyer/internal/AFd1iSDK;->registerClient(Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    new-instance v2, Lcom/appsflyer/internal/AFd1fSDK;

    .line 31
    .line 32
    iget v4, v1, Lcom/appsflyer/internal/AFd1fSDK;->unregisterClient:I

    .line 33
    .line 34
    iget-boolean v5, v1, Lcom/appsflyer/internal/AFd1fSDK;->AFLogger:Z

    .line 35
    .line 36
    iget-object v6, v1, Lcom/appsflyer/internal/AFd1fSDK;->d:Ljava/util/Map;

    .line 37
    .line 38
    iget-object v7, v1, Lcom/appsflyer/internal/AFd1fSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFd1nSDK;

    .line 39
    .line 40
    invoke-direct/range {v2 .. v7}, Lcom/appsflyer/internal/AFd1fSDK;-><init>(Ljava/lang/Object;IZLjava/util/Map;Lcom/appsflyer/internal/AFd1nSDK;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    return-object v2

    .line 44
    :catch_0
    move-exception v0

    .line 45
    move-object p0, v0

    .line 46
    move-object v5, p0

    .line 47
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 48
    .line 49
    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->HTTP_CLIENT:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 50
    .line 51
    const/4 v6, 0x0

    .line 52
    const/4 v7, 0x0

    .line 53
    const-string v4, "Could not parse raw response during execute"

    .line 54
    .line 55
    invoke-virtual/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 56
    .line 57
    .line 58
    new-instance p0, Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException;

    .line 59
    .line 60
    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-direct {p0, v0, v5, v1}, Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lcom/appsflyer/internal/AFd1fSDK;)V

    .line 65
    .line 66
    .line 67
    throw p0

    .line 68
    :cond_0
    const-string p0, "Http call is already executed"

    .line 69
    .line 70
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const/4 p0, 0x0

    .line 74
    return-object p0
.end method
