.class public final Lcom/appsflyer/internal/AFh1nSDK;
.super Lcom/appsflyer/internal/AFh1pSDK;
.source "SourceFile"


# instance fields
.field public final AFLoggerLogLevel:Lcom/appsflyer/internal/AFe1zSDK;


# direct methods
.method public constructor <init>(Ljava/lang/String;[BLjava/lang/String;Lcom/appsflyer/internal/AFe1zSDK;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[B",
            "Ljava/lang/String;",
            "Lcom/appsflyer/internal/AFe1zSDK;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 3
    .line 4
    invoke-direct {p0, v0, p1, v1}, Lcom/appsflyer/internal/AFh1pSDK;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 5
    .line 6
    .line 7
    iput-object p3, p0, Lcom/appsflyer/internal/AFh1pSDK;->w:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, Lcom/appsflyer/internal/AFh1pSDK;->force:[B

    .line 10
    .line 11
    iput-object p4, p0, Lcom/appsflyer/internal/AFh1nSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFe1zSDK;

    .line 12
    .line 13
    if-eqz p5, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lcom/appsflyer/internal/AFh1pSDK;->registerClient:Ljava/util/Map;

    .line 16
    .line 17
    invoke-interface {p0, p5}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method


# virtual methods
.method public final AFKeystoreWrapper()Lcom/appsflyer/internal/AFe1zSDK;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFh1nSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFe1zSDK;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    sget-object p0, Lcom/appsflyer/internal/AFd1bSDK;->AFLogger:Lcom/appsflyer/internal/AFd1bSDK;

    .line 7
    .line 8
    return-object p0
.end method
