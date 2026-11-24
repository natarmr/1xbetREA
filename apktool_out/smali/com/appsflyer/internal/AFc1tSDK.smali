.class public final Lcom/appsflyer/internal/AFc1tSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFb1aSDK;


# instance fields
.field private final AFLogger:Lcom/appsflyer/internal/AFc1eSDK;

.field private final d:Lcom/appsflyer/internal/AFf1fSDK;

.field private final unregisterClient:Lcom/appsflyer/internal/AFd1zSDK;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFc1eSDK;Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/internal/AFf1fSDK;)V
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
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/appsflyer/internal/AFc1tSDK;->AFLogger:Lcom/appsflyer/internal/AFc1eSDK;

    .line 14
    .line 15
    iput-object p2, p0, Lcom/appsflyer/internal/AFc1tSDK;->unregisterClient:Lcom/appsflyer/internal/AFd1zSDK;

    .line 16
    .line 17
    iput-object p3, p0, Lcom/appsflyer/internal/AFc1tSDK;->d:Lcom/appsflyer/internal/AFf1fSDK;

    .line 18
    .line 19
    return-void
.end method

.method public static synthetic a(Lcom/appsflyer/internal/AFc1tSDK;Lcom/google/android/gms/appset/AppSetIdInfo;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/appsflyer/internal/AFc1tSDK;->registerClient(Lcom/appsflyer/internal/AFc1tSDK;Lcom/google/android/gms/appset/AppSetIdInfo;)V

    return-void
.end method

.method private static final registerClient(Lcom/appsflyer/internal/AFc1tSDK;Lcom/google/android/gms/appset/AppSetIdInfo;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFc1tSDK;->AFLogger:Lcom/appsflyer/internal/AFc1eSDK;

    .line 2
    .line 3
    new-instance v0, Lcom/appsflyer/internal/AFc1rSDK;

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/appset/AppSetIdInfo;->getScope()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p1}, Lcom/google/android/gms/appset/AppSetIdInfo;->getId()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1, p1}, Lcom/appsflyer/internal/AFc1rSDK;-><init>(ILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1eSDK;->setUserEmail:Lcom/appsflyer/internal/AFc1rSDK;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final AFLogger()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1tSDK;->d:Lcom/appsflyer/internal/AFf1fSDK;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFf1fSDK;->AFLogger()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1tSDK;->AFLogger:Lcom/appsflyer/internal/AFc1eSDK;

    .line 10
    .line 11
    iget-boolean v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->setCustomerUserId:Z

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1tSDK;->unregisterClient:Lcom/appsflyer/internal/AFd1zSDK;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 18
    .line 19
    invoke-static {v0}, Lcom/appsflyer/internal/AFj1qSDK;->AFLogger(Landroid/content/Context;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object p0, p0, Lcom/appsflyer/internal/AFc1tSDK;->unregisterClient:Lcom/appsflyer/internal/AFd1zSDK;

    .line 26
    .line 27
    iget-object p0, p0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 28
    .line 29
    invoke-static {p0}, Lcom/appsflyer/internal/AFj1qSDK;->registerClient(Landroid/content/Context;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_0
    const/4 p0, 0x0

    .line 38
    return p0
.end method

.method public final unregisterClient()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1tSDK;->unregisterClient:Lcom/appsflyer/internal/AFd1zSDK;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    :try_start_0
    invoke-static {v0}, Lcom/google/android/gms/appset/AppSet;->getClient(Landroid/content/Context;)Lcom/google/android/gms/appset/AppSetIdClient;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Lcom/google/android/gms/appset/AppSetIdClient;->getAppSetIdInfo()Lcom/google/android/gms/tasks/Task;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lcom/appsflyer/internal/m;

    .line 16
    .line 17
    invoke-direct {v1, p0}, Lcom/appsflyer/internal/m;-><init>(Lcom/appsflyer/internal/AFc1tSDK;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    move-object p0, v0

    .line 26
    move-object v3, p0

    .line 27
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 28
    .line 29
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->APP_SET_ID:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 30
    .line 31
    const/16 v8, 0x78

    .line 32
    .line 33
    const/4 v9, 0x0

    .line 34
    const-string v2, "Error while trying to  fetch App set ID"

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    const/4 v5, 0x0

    .line 38
    const/4 v6, 0x0

    .line 39
    const/4 v7, 0x0

    .line 40
    invoke-static/range {v0 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    return-void
.end method
