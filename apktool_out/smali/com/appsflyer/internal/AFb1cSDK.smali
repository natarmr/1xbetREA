.class public final Lcom/appsflyer/internal/AFb1cSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFb1bSDK;


# instance fields
.field private AFKeystoreWrapper:Lcom/appsflyer/internal/AFb1gSDK;

.field private final AFLogger:Ljava/util/concurrent/ScheduledExecutorService;

.field private final registerClient:Lcom/appsflyer/internal/AFa1qSDK;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ScheduledExecutorService;Lcom/appsflyer/internal/AFa1qSDK;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/appsflyer/internal/AFb1cSDK;->AFLogger:Ljava/util/concurrent/ScheduledExecutorService;

    .line 11
    .line 12
    iput-object p2, p0, Lcom/appsflyer/internal/AFb1cSDK;->registerClient:Lcom/appsflyer/internal/AFa1qSDK;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final AFKeystoreWrapper()V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFb1cSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFb1gSDK;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/appsflyer/internal/AFb1gSDK;->AFLogger:Lcom/appsflyer/internal/AFb1bSDK$AFa1zSDK;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-interface {p0}, Lcom/appsflyer/internal/AFb1bSDK$AFa1zSDK;->registerClient()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final unregisterClient(Landroid/content/Context;Lcom/appsflyer/internal/AFb1bSDK$AFa1zSDK;)V
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
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/appsflyer/internal/AFb1cSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFb1gSDK;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    check-cast v0, Landroid/app/Application;

    .line 22
    .line 23
    iget-object v1, p0, Lcom/appsflyer/internal/AFb1cSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFb1gSDK;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    iput-object v0, p0, Lcom/appsflyer/internal/AFb1cSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFb1gSDK;

    .line 30
    .line 31
    new-instance v0, Lcom/appsflyer/internal/AFb1gSDK;

    .line 32
    .line 33
    iget-object v1, p0, Lcom/appsflyer/internal/AFb1cSDK;->AFLogger:Ljava/util/concurrent/ScheduledExecutorService;

    .line 34
    .line 35
    iget-object v2, p0, Lcom/appsflyer/internal/AFb1cSDK;->registerClient:Lcom/appsflyer/internal/AFa1qSDK;

    .line 36
    .line 37
    invoke-direct {v0, v1, p2, v2}, Lcom/appsflyer/internal/AFb1gSDK;-><init>(Ljava/util/concurrent/ScheduledExecutorService;Lcom/appsflyer/internal/AFb1bSDK$AFa1zSDK;Lcom/appsflyer/internal/AFa1qSDK;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lcom/appsflyer/internal/AFb1cSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFb1gSDK;

    .line 41
    .line 42
    instance-of p2, p1, Landroid/app/Activity;

    .line 43
    .line 44
    if-eqz p2, :cond_1

    .line 45
    .line 46
    move-object p2, p1

    .line 47
    check-cast p2, Landroid/app/Activity;

    .line 48
    .line 49
    invoke-virtual {v0, p2}, Lcom/appsflyer/internal/AFb1gSDK;->onActivityResumed(Landroid/app/Activity;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-static {p1}, Lcom/appsflyer/internal/AFj1qSDK;->X_(Landroid/content/Context;)Landroid/app/Application;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-eqz p1, :cond_2

    .line 57
    .line 58
    iget-object p0, p0, Lcom/appsflyer/internal/AFb1cSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFb1gSDK;

    .line 59
    .line 60
    invoke-virtual {p1, p0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 61
    .line 62
    .line 63
    :cond_2
    return-void
.end method
