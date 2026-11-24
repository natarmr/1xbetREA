.class public final Lcom/appsflyer/internal/AFf1hSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFe1vSDK;


# instance fields
.field private final AFKeystoreWrapper:Lcom/appsflyer/internal/AFf1nSDK;

.field private final AFLogger:Lcom/appsflyer/internal/AFf1fSDK;

.field private afWarnLog:Lcom/appsflyer/internal/AFf1pSDK;

.field private final d:Lcom/appsflyer/internal/AFc1iSDK;

.field private final e:Lcom/appsflyer/internal/AFd1sSDK;

.field private final force:Lcom/appsflyer/internal/AFe1wSDK;

.field private final i:Lcom/appsflyer/internal/AFc1eSDK;

.field private final registerClient:Ljava/lang/Object;

.field public final unregisterClient:Lcom/appsflyer/internal/AFf1jSDK;

.field private final v:Lcom/appsflyer/internal/AFf1kSDK;

.field private w:Lcom/appsflyer/internal/AFh1bSDK;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFf1nSDK;Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFf1fSDK;Lcom/appsflyer/internal/AFf1jSDK;Lcom/appsflyer/internal/AFd1sSDK;Lcom/appsflyer/internal/AFf1kSDK;Lcom/appsflyer/internal/AFc1eSDK;Lcom/appsflyer/internal/AFe1wSDK;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/appsflyer/internal/AFf1hSDK;->registerClient:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/appsflyer/internal/AFf1hSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFf1nSDK;

    .line 12
    .line 13
    iput-object p2, p0, Lcom/appsflyer/internal/AFf1hSDK;->d:Lcom/appsflyer/internal/AFc1iSDK;

    .line 14
    .line 15
    iput-object p3, p0, Lcom/appsflyer/internal/AFf1hSDK;->AFLogger:Lcom/appsflyer/internal/AFf1fSDK;

    .line 16
    .line 17
    iput-object p4, p0, Lcom/appsflyer/internal/AFf1hSDK;->unregisterClient:Lcom/appsflyer/internal/AFf1jSDK;

    .line 18
    .line 19
    iput-object p5, p0, Lcom/appsflyer/internal/AFf1hSDK;->e:Lcom/appsflyer/internal/AFd1sSDK;

    .line 20
    .line 21
    iput-object p6, p0, Lcom/appsflyer/internal/AFf1hSDK;->v:Lcom/appsflyer/internal/AFf1kSDK;

    .line 22
    .line 23
    iput-object p7, p0, Lcom/appsflyer/internal/AFf1hSDK;->i:Lcom/appsflyer/internal/AFc1eSDK;

    .line 24
    .line 25
    iput-object p8, p0, Lcom/appsflyer/internal/AFf1hSDK;->force:Lcom/appsflyer/internal/AFe1wSDK;

    .line 26
    .line 27
    iget-object p1, p8, Lcom/appsflyer/internal/AFe1wSDK;->unregisterClient:Ljava/util/List;

    .line 28
    .line 29
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method private AFKeystoreWrapper(Lcom/appsflyer/internal/AFf1pSDK;Lcom/appsflyer/internal/AFf1mSDK;)V
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1hSDK;->registerClient:Ljava/lang/Object;

    monitor-enter v0

    .line 45
    :try_start_0
    iput-object p1, p0, Lcom/appsflyer/internal/AFf1hSDK;->afWarnLog:Lcom/appsflyer/internal/AFf1pSDK;

    .line 46
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p2, :cond_0

    .line 47
    invoke-interface {p2, p1}, Lcom/appsflyer/internal/AFf1mSDK;->onRemoteConfigUpdateFinished(Lcom/appsflyer/internal/AFf1pSDK;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p0

    .line 48
    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public final AFKeystoreWrapper(Lcom/appsflyer/internal/AFe1ySDK;Lcom/appsflyer/internal/AFd1cSDK;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFe1ySDK<",
            "*>;",
            "Lcom/appsflyer/internal/AFd1cSDK;",
            ")V"
        }
    .end annotation

    .line 1
    instance-of p2, p1, Lcom/appsflyer/internal/AFf1oSDK;

    .line 2
    .line 3
    if-eqz p2, :cond_2

    .line 4
    .line 5
    check-cast p1, Lcom/appsflyer/internal/AFf1oSDK;

    .line 6
    .line 7
    iget-object p2, p1, Lcom/appsflyer/internal/AFf1oSDK;->i:Lcom/appsflyer/internal/AFf1pSDK;

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    sget-object p2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 12
    .line 13
    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->REMOTE_CONTROL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 14
    .line 15
    const-string v1, "update RC returned null result, something went wrong!"

    .line 16
    .line 17
    invoke-virtual {p2, v0, v1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sget-object p2, Lcom/appsflyer/internal/AFf1pSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFf1pSDK;

    .line 21
    .line 22
    :cond_0
    sget-object v0, Lcom/appsflyer/internal/AFf1pSDK;->d:Lcom/appsflyer/internal/AFf1pSDK;

    .line 23
    .line 24
    if-eq p2, v0, :cond_1

    .line 25
    .line 26
    iget-object v0, p1, Lcom/appsflyer/internal/AFf1oSDK;->e:Lcom/appsflyer/internal/AFh1bSDK;

    .line 27
    .line 28
    iget-object v1, p0, Lcom/appsflyer/internal/AFf1hSDK;->registerClient:Ljava/lang/Object;

    .line 29
    .line 30
    monitor-enter v1

    .line 31
    :try_start_0
    iput-object v0, p0, Lcom/appsflyer/internal/AFf1hSDK;->w:Lcom/appsflyer/internal/AFh1bSDK;

    .line 32
    .line 33
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    monitor-exit v1

    .line 37
    throw p0

    .line 38
    :cond_1
    :goto_0
    iget-object p1, p1, Lcom/appsflyer/internal/AFf1oSDK;->force:Lcom/appsflyer/internal/AFf1mSDK;

    .line 39
    .line 40
    invoke-direct {p0, p2, p1}, Lcom/appsflyer/internal/AFf1hSDK;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFf1pSDK;Lcom/appsflyer/internal/AFf1mSDK;)V

    .line 41
    .line 42
    .line 43
    :cond_2
    return-void
.end method

.method public final AFKeystoreWrapper(Lcom/appsflyer/internal/AFf1mSDK;)V
    .locals 10

    .line 49
    new-instance v0, Lcom/appsflyer/internal/AFf1oSDK;

    iget-object v1, p0, Lcom/appsflyer/internal/AFf1hSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFf1nSDK;

    iget-object v2, p0, Lcom/appsflyer/internal/AFf1hSDK;->d:Lcom/appsflyer/internal/AFc1iSDK;

    iget-object v3, p0, Lcom/appsflyer/internal/AFf1hSDK;->AFLogger:Lcom/appsflyer/internal/AFf1fSDK;

    iget-object v4, p0, Lcom/appsflyer/internal/AFf1hSDK;->unregisterClient:Lcom/appsflyer/internal/AFf1jSDK;

    iget-object v5, p0, Lcom/appsflyer/internal/AFf1hSDK;->e:Lcom/appsflyer/internal/AFd1sSDK;

    iget-object v6, p0, Lcom/appsflyer/internal/AFf1hSDK;->v:Lcom/appsflyer/internal/AFf1kSDK;

    iget-object v7, p0, Lcom/appsflyer/internal/AFf1hSDK;->i:Lcom/appsflyer/internal/AFc1eSDK;

    const-string v8, "v1"

    move-object v9, p1

    invoke-direct/range {v0 .. v9}, Lcom/appsflyer/internal/AFf1oSDK;-><init>(Lcom/appsflyer/internal/AFf1nSDK;Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFf1fSDK;Lcom/appsflyer/internal/AFf1jSDK;Lcom/appsflyer/internal/AFd1sSDK;Lcom/appsflyer/internal/AFf1kSDK;Lcom/appsflyer/internal/AFc1eSDK;Ljava/lang/String;Lcom/appsflyer/internal/AFf1mSDK;)V

    .line 50
    iget-object p0, p0, Lcom/appsflyer/internal/AFf1hSDK;->force:Lcom/appsflyer/internal/AFe1wSDK;

    invoke-virtual {p0, v0}, Lcom/appsflyer/internal/AFe1wSDK;->d(Lcom/appsflyer/internal/AFe1ySDK;)V

    return-void
.end method

.method public final d()Lcom/appsflyer/internal/AFh1bSDK;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1hSDK;->registerClient:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFf1hSDK;->w:Lcom/appsflyer/internal/AFh1bSDK;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    iput-object v2, p0, Lcom/appsflyer/internal/AFf1hSDK;->w:Lcom/appsflyer/internal/AFh1bSDK;

    .line 8
    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    return-object v1

    .line 11
    :catchall_0
    move-exception p0

    .line 12
    monitor-exit v0

    .line 13
    throw p0
.end method

.method public final d(Lcom/appsflyer/internal/AFe1ySDK;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFe1ySDK<",
            "*>;)V"
        }
    .end annotation

    .line 14
    return-void
.end method

.method public final registerClient(Lcom/appsflyer/internal/AFe1ySDK;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFe1ySDK<",
            "*>;)V"
        }
    .end annotation

    return-void
.end method

.method public final unregisterClient(Lcom/appsflyer/internal/AFe1ySDK;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFe1ySDK<",
            "*>;)V"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lcom/appsflyer/internal/AFf1oSDK;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lcom/appsflyer/internal/AFf1oSDK;

    .line 6
    .line 7
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1hSDK;->registerClient:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    const/4 v1, 0x0

    .line 11
    :try_start_0
    iput-object v1, p0, Lcom/appsflyer/internal/AFf1hSDK;->w:Lcom/appsflyer/internal/AFh1bSDK;

    .line 12
    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    sget-object v0, Lcom/appsflyer/internal/AFf1pSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFf1pSDK;

    .line 15
    .line 16
    iget-object p1, p1, Lcom/appsflyer/internal/AFf1oSDK;->force:Lcom/appsflyer/internal/AFf1mSDK;

    .line 17
    .line 18
    invoke-direct {p0, v0, p1}, Lcom/appsflyer/internal/AFf1hSDK;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFf1pSDK;Lcom/appsflyer/internal/AFf1mSDK;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    monitor-exit v0

    .line 24
    throw p0

    .line 25
    :cond_0
    return-void
.end method
