.class public final Lcom/appsflyer/internal/AFh1tSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFh1wSDK;


# instance fields
.field private AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1ySDK;

.field private AFLogger:Lcom/appsflyer/internal/AFh1vSDK;

.field private d:Lcom/appsflyer/internal/AFh1zSDK;

.field private final registerClient:Lcom/appsflyer/internal/AFc1bSDK;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFc1bSDK;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/appsflyer/internal/AFh1tSDK;->registerClient:Lcom/appsflyer/internal/AFc1bSDK;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final AFKeystoreWrapper()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFh1tSDK;->d:Lcom/appsflyer/internal/AFh1zSDK;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 6
    .line 7
    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->RD:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 8
    .line 9
    const/4 v5, 0x4

    .line 10
    const/4 v6, 0x0

    .line 11
    const-string v3, "Releasing Proxy Manager Client"

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    invoke-static/range {v1 .. v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->v$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    new-array v2, v2, [Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    aput-object v0, v2, v3

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Lcom/appsflyer/AFLogger;->unregisterClient([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    iput-object v0, p0, Lcom/appsflyer/internal/AFh1tSDK;->d:Lcom/appsflyer/internal/AFh1zSDK;

    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public final AFLogger()V
    .locals 3

    .line 1
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/appsflyer/internal/AFh1tSDK;->AFLogger:Lcom/appsflyer/internal/AFh1vSDK;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    new-instance v1, Lcom/appsflyer/internal/AFh1vSDK;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/appsflyer/internal/AFh1tSDK;->registerClient:Lcom/appsflyer/internal/AFc1bSDK;

    .line 10
    .line 11
    invoke-direct {v1, v2}, Lcom/appsflyer/internal/AFh1vSDK;-><init>(Lcom/appsflyer/internal/AFc1bSDK;)V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Lcom/appsflyer/internal/AFh1tSDK;->AFLogger:Lcom/appsflyer/internal/AFh1vSDK;

    .line 15
    .line 16
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    new-array p0, p0, [Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    aput-object v1, p0, v2

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Lcom/appsflyer/AFLogger;->registerClient([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final d()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFh1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1ySDK;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 6
    .line 7
    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->EXCEPTION_MANAGER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 8
    .line 9
    const/4 v5, 0x4

    .line 10
    const/4 v6, 0x0

    .line 11
    const-string v3, "Releasing Exception Manager Client"

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    invoke-static/range {v1 .. v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->v$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    new-array v2, v2, [Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    aput-object v0, v2, v3

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Lcom/appsflyer/AFLogger;->unregisterClient([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    iput-object v0, p0, Lcom/appsflyer/internal/AFh1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1ySDK;

    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public final e()V
    .locals 3

    .line 1
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/appsflyer/internal/AFh1tSDK;->d:Lcom/appsflyer/internal/AFh1zSDK;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    new-instance v1, Lcom/appsflyer/internal/AFh1zSDK;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/appsflyer/internal/AFh1tSDK;->registerClient:Lcom/appsflyer/internal/AFc1bSDK;

    .line 10
    .line 11
    invoke-interface {v2}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v2}, Lcom/appsflyer/internal/AFh1zSDK;-><init>(Lcom/appsflyer/internal/AFc1iSDK;)V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, Lcom/appsflyer/internal/AFh1tSDK;->d:Lcom/appsflyer/internal/AFh1zSDK;

    .line 22
    .line 23
    :cond_0
    const/4 p0, 0x1

    .line 24
    new-array p0, p0, [Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    aput-object v1, p0, v2

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Lcom/appsflyer/AFLogger;->registerClient([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final registerClient()V
    .locals 3

    .line 1
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/appsflyer/internal/AFh1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1ySDK;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    new-instance v1, Lcom/appsflyer/internal/AFh1ySDK;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/appsflyer/internal/AFh1tSDK;->registerClient:Lcom/appsflyer/internal/AFc1bSDK;

    .line 10
    .line 11
    invoke-direct {v1, v2}, Lcom/appsflyer/internal/AFh1ySDK;-><init>(Lcom/appsflyer/internal/AFc1bSDK;)V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Lcom/appsflyer/internal/AFh1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1ySDK;

    .line 15
    .line 16
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    new-array p0, p0, [Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    aput-object v1, p0, v2

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Lcom/appsflyer/AFLogger;->registerClient([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final unregisterClient()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFh1tSDK;->AFLogger:Lcom/appsflyer/internal/AFh1vSDK;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 6
    .line 7
    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->RD:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 8
    .line 9
    const/4 v5, 0x4

    .line 10
    const/4 v6, 0x0

    .line 11
    const-string v3, "Releasing Proxy Manager Client"

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    invoke-static/range {v1 .. v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->v$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    new-array v2, v2, [Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    aput-object v0, v2, v3

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Lcom/appsflyer/AFLogger;->unregisterClient([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    iput-object v0, p0, Lcom/appsflyer/internal/AFh1tSDK;->AFLogger:Lcom/appsflyer/internal/AFh1vSDK;

    .line 28
    .line 29
    :cond_0
    return-void
.end method
