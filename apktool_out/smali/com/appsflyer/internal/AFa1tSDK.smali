.class public final Lcom/appsflyer/internal/AFa1tSDK;
.super Lcom/appsflyer/AppsFlyerLib;
.source "SourceFile"


# static fields
.field private static d:Lcom/appsflyer/internal/AFa1tSDK; = null

.field public static final registerClient:Ljava/lang/String; = "7.0"

.field public static final unregisterClient:Ljava/lang/String; = "386"


# instance fields
.field public final AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

.field private AFLogger:Lcom/appsflyer/internal/AFb1hSDK;

.field private e:Lcom/appsflyer/internal/AFf1mSDK;

.field private w:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/appsflyer/internal/AFa1tSDK;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/appsflyer/internal/AFa1tSDK;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/appsflyer/internal/AFa1tSDK;->d:Lcom/appsflyer/internal/AFa1tSDK;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/appsflyer/AppsFlyerLib;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/appsflyer/internal/AFc1aSDK;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/appsflyer/internal/AFc1aSDK;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 10
    .line 11
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setDebugLog()Lcom/appsflyer/internal/AFh1wSDK;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p0}, Lcom/appsflyer/internal/AFh1wSDK;->AFLogger()V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setDebugLog()Lcom/appsflyer/internal/AFh1wSDK;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {p0}, Lcom/appsflyer/internal/AFh1wSDK;->AFKeystoreWrapper()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method private declared-synchronized AFKeystoreWrapper()Lcom/appsflyer/internal/AFf1mSDK;
    .locals 1

    monitor-enter p0

    .line 37
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->e:Lcom/appsflyer/internal/AFf1mSDK;

    if-nez v0, :cond_0

    .line 38
    new-instance v0, Lcom/appsflyer/internal/f;

    invoke-direct {v0, p0}, Lcom/appsflyer/internal/f;-><init>(Lcom/appsflyer/internal/AFa1tSDK;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->e:Lcom/appsflyer/internal/AFf1mSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    .line 39
    :cond_0
    :goto_0
    monitor-exit p0

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private AFKeystoreWrapper(Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/appsflyer/internal/AFh1fSDK;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/appsflyer/internal/AFh1fSDK;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 7
    .line 8
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v2, v1, Lcom/appsflyer/internal/AFc1eSDK;->setUserLastName:Ljava/lang/String;

    .line 13
    .line 14
    iput-object v2, v0, Lcom/appsflyer/internal/AFh1pSDK;->e:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v2, v1, Lcom/appsflyer/internal/AFc1eSDK;->clearUserPii:Ljava/lang/String;

    .line 17
    .line 18
    iput-object v2, v0, Lcom/appsflyer/internal/AFh1pSDK;->afInfoLog:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p1, v0, Lcom/appsflyer/internal/AFh1pSDK;->AFLogger:Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;

    .line 21
    .line 22
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 23
    .line 24
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->w()Lcom/appsflyer/internal/AFf1aSDK;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p0, v0}, Lcom/appsflyer/internal/AFf1aSDK;->d(Lcom/appsflyer/internal/AFh1pSDK;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    iput-object p0, v1, Lcom/appsflyer/internal/AFc1eSDK;->setUserLastName:Ljava/lang/String;

    .line 33
    .line 34
    iput-object p0, v1, Lcom/appsflyer/internal/AFc1eSDK;->clearUserPii:Ljava/lang/String;

    .line 35
    .line 36
    return-void
.end method

.method private AFLogger()V
    .locals 6

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/appsflyer/internal/AFj1qSDK;->AFLogger(Landroid/content/Context;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-static {v0}, Lcom/appsflyer/internal/AFj1qSDK;->unregisterClient(Landroid/content/Context;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 22
    .line 23
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setImeiData()Lcom/appsflyer/internal/AFi1oSDK;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    new-instance v1, Lcom/appsflyer/internal/e;

    .line 30
    .line 31
    invoke-direct {v1, p0, v0}, Lcom/appsflyer/internal/e;-><init>(Lcom/appsflyer/internal/AFa1tSDK;Lcom/appsflyer/internal/AFi1oSDK;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, v1}, Lcom/appsflyer/internal/AFi1oSDK;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFi1kSDK;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    invoke-static {v0}, Lcom/appsflyer/internal/AFj1qSDK;->unregisterClient(Landroid/content/Context;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 45
    .line 46
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setImeiData()Lcom/appsflyer/internal/AFi1oSDK;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    invoke-direct {p0, v0}, Lcom/appsflyer/internal/AFa1tSDK;->AFLogger(Lcom/appsflyer/internal/AFi1oSDK;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    :cond_1
    return-void

    .line 56
    :catchall_0
    move-exception v0

    .line 57
    move-object p0, v0

    .line 58
    move-object v3, p0

    .line 59
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 60
    .line 61
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->PLAY_INTEGRITY_API:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    const/4 v5, 0x0

    .line 65
    const-string v2, "Failed to request Play Integrity API token"

    .line 66
    .line 67
    invoke-virtual/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 68
    .line 69
    .line 70
    const-string p0, "Play Integrity API token request exception: "

    .line 71
    .line 72
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {p0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {v0, v1, p0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->v(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method private synthetic AFLogger(Lcom/appsflyer/internal/AFf1pSDK;)V
    .locals 1

    .line 93
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 94
    sget-object v0, Lcom/appsflyer/internal/AFf1pSDK;->AFLogger:Lcom/appsflyer/internal/AFf1pSDK;

    if-ne p1, v0, :cond_0

    .line 95
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->getEntries()Lcom/appsflyer/exception_manager/ExceptionManager;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 96
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->getEntries()Lcom/appsflyer/exception_manager/ExceptionManager;

    move-result-object p1

    invoke-interface {p1}, Lcom/appsflyer/exception_manager/ExceptionManager;->updateExceptionManagerConfiguration()V

    .line 97
    :cond_0
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object p1

    invoke-interface {p1}, Lcom/appsflyer/internal/AFd1uSDK;->AFLogger()Z

    move-result p1

    if-nez p1, :cond_1

    .line 98
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setDebugLog()Lcom/appsflyer/internal/AFh1wSDK;

    move-result-object p0

    invoke-interface {p0}, Lcom/appsflyer/internal/AFh1wSDK;->unregisterClient()V

    return-void

    .line 99
    :cond_1
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setDebugLog()Lcom/appsflyer/internal/AFh1wSDK;

    move-result-object p0

    invoke-interface {p0}, Lcom/appsflyer/internal/AFh1wSDK;->AFLogger()V

    return-void
.end method

.method private AFLogger(Lcom/appsflyer/internal/AFi1oSDK;)V
    .locals 6

    .line 84
    new-instance v0, Lcom/appsflyer/internal/AFe1dSDK;

    .line 85
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 86
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v2

    .line 87
    iget-object v3, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 88
    invoke-interface {v3}, Lcom/appsflyer/internal/AFc1bSDK;->force()Lcom/appsflyer/internal/AFg1rSDK;

    move-result-object v4

    .line 89
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 90
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    move-result-object v5

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/appsflyer/internal/AFe1dSDK;-><init>(Lcom/appsflyer/internal/AFi1oSDK;Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/internal/AFg1rSDK;Lcom/appsflyer/internal/AFd1zSDK;)V

    .line 91
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 92
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->afWarnLog()Lcom/appsflyer/internal/AFe1wSDK;

    move-result-object p0

    invoke-virtual {p0, v0}, Lcom/appsflyer/internal/AFe1wSDK;->d(Lcom/appsflyer/internal/AFe1ySDK;)V

    return-void
.end method

.method public static synthetic a(Lcom/appsflyer/internal/AFa1tSDK;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/appsflyer/internal/AFa1tSDK;->unregisterClient()V

    return-void
.end method

.method public static synthetic b(Lcom/appsflyer/internal/AFa1tSDK;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/appsflyer/internal/AFa1tSDK;->registerClient()Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/appsflyer/internal/AFa1tSDK;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/appsflyer/internal/AFa1tSDK;->AFLogger()V

    return-void
.end method

.method public static d()Lcom/appsflyer/internal/AFa1tSDK;
    .locals 1

    .line 32
    sget-object v0, Lcom/appsflyer/internal/AFa1tSDK;->d:Lcom/appsflyer/internal/AFa1tSDK;

    return-object v0
.end method

.method public static d(Lcom/appsflyer/internal/AFc1kSDK;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 30
    const-string v0, "CACHED_CHANNEL"

    invoke-interface {p0, v0}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    .line 31
    :cond_0
    invoke-interface {p0, v0, p1}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method private static synthetic d(Lcom/appsflyer/internal/AFc1bSDK;)V
    .locals 0

    .line 28
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->values()Lcom/appsflyer/internal/AFc1vSDK;

    move-result-object p0

    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1vSDK;->unregisterClient()V

    return-void
.end method

.method private synthetic d(Lcom/appsflyer/internal/AFi1oSDK;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFa1tSDK;->AFLogger(Lcom/appsflyer/internal/AFi1oSDK;)V

    return-void
.end method

.method private static d(Ljava/lang/String;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 2
    .line 3
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 4
    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v3, "WARNING: AppsFlyer SDK is not initialized! The API call \'"

    .line 8
    .line 9
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string p0, "()\' must be called after the \'init(String, AppsFlyerConversionListener)\' API method, which should be called on the Application\'s onCreate."

    .line 16
    .line 17
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {v0, v1, p0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public static synthetic e(Lcom/appsflyer/internal/AFc1bSDK;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/appsflyer/internal/AFa1tSDK;->d(Lcom/appsflyer/internal/AFc1bSDK;)V

    return-void
.end method

.method public static synthetic f(Lcom/appsflyer/internal/AFa1tSDK;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/appsflyer/internal/AFa1tSDK;->v()V

    return-void
.end method

.method public static synthetic g(Lcom/appsflyer/internal/AFa1tSDK;Lcom/appsflyer/internal/AFi1oSDK;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFa1tSDK;->d(Lcom/appsflyer/internal/AFi1oSDK;)V

    return-void
.end method

.method public static synthetic h(Lcom/appsflyer/internal/AFa1tSDK;Lcom/appsflyer/internal/AFf1pSDK;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFa1tSDK;->AFLogger(Lcom/appsflyer/internal/AFf1pSDK;)V

    return-void
.end method

.method private static registerClient(Landroid/app/Activity;)Ljava/lang/String;
    .locals 7

    .line 181
    const-string v0, "af"

    const/4 v1, 0x0

    if-eqz p0, :cond_1

    .line 182
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 183
    :try_start_0
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 184
    invoke-virtual {v3, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 185
    sget-object v4, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v5, Lcom/appsflyer/sdk_base/logger/LogTag;->ENGAGEMENT:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v6, "Push Notification received af payload = "

    invoke-virtual {v6, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 186
    invoke-virtual {v3, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 187
    invoke-virtual {v2, v3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    :catchall_0
    move-exception p0

    goto :goto_0

    :cond_0
    return-object v1

    .line 188
    :goto_0
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->ENGAGEMENT:Lcom/appsflyer/sdk_base/logger/LogTag;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3, p0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-object v1
.end method

.method private synthetic registerClient()Lkotlin/Unit;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->setUserFirstName:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string p0, "finishSdkSession"

    .line 12
    .line 13
    invoke-static {p0}, Lcom/appsflyer/internal/AFa1tSDK;->d(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    goto/16 :goto_1

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 19
    .line 20
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-boolean v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->setUserPhone:Z

    .line 25
    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    sget-object p0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 29
    .line 30
    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 31
    .line 32
    const-string v1, "ERROR: AppsFlyer SDK session not started. Skipping session finish."

    .line 33
    .line 34
    invoke-virtual {p0, v0, v1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    goto/16 :goto_1

    .line 38
    .line 39
    :cond_1
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 40
    .line 41
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 42
    .line 43
    const-string v2, "Finishing AppsFlyer session"

    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 49
    .line 50
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->setUserPhone()Lcom/appsflyer/internal/AFa1lSDK;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-interface {v1}, Lcom/appsflyer/internal/AFa1lSDK;->registerClient()V

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 58
    .line 59
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->afInfoLog()Lcom/appsflyer/internal/AFj1ySDK;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-interface {v1}, Lcom/appsflyer/internal/AFj1ySDK;->AFKeystoreWrapper()V

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 67
    .line 68
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->getEntries()Lcom/appsflyer/exception_manager/ExceptionManager;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    if-eqz v1, :cond_2

    .line 73
    .line 74
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 75
    .line 76
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->getEntries()Lcom/appsflyer/exception_manager/ExceptionManager;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-interface {v1}, Lcom/appsflyer/exception_manager/ExceptionManager;->sendExceptionsToServerIfNeeded()V

    .line 81
    .line 82
    .line 83
    :cond_2
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 84
    .line 85
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-interface {v1}, Lcom/appsflyer/internal/AFd1uSDK;->i()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_4

    .line 94
    .line 95
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 96
    .line 97
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-interface {v0}, Lcom/appsflyer/internal/AFd1uSDK;->d()V

    .line 102
    .line 103
    .line 104
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 105
    .line 106
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    iget-object v0, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 111
    .line 112
    if-eqz v0, :cond_3

    .line 113
    .line 114
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {v1}, Lcom/appsflyer/AppsFlyerLib;->isStopped()Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-nez v1, :cond_3

    .line 123
    .line 124
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 125
    .line 126
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-interface {v1, v2, v0}, Lcom/appsflyer/internal/AFd1uSDK;->v_(Ljava/lang/String;Landroid/content/pm/PackageManager;)V

    .line 139
    .line 140
    .line 141
    :cond_3
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 142
    .line 143
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-interface {v0}, Lcom/appsflyer/internal/AFd1uSDK;->unregisterClient()V

    .line 148
    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_4
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->PROXY:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 152
    .line 153
    const-string v2, "RD status is OFF"

    .line 154
    .line 155
    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 159
    .line 160
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setUserLastName()Lcom/appsflyer/internal/AFh1sSDK;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    if-eqz v0, :cond_5

    .line 165
    .line 166
    invoke-interface {v0}, Lcom/appsflyer/internal/AFh1sSDK;->AFLogger()V

    .line 167
    .line 168
    .line 169
    :cond_5
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 170
    .line 171
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    const/4 v0, 0x0

    .line 176
    iput-boolean v0, p0, Lcom/appsflyer/internal/AFc1eSDK;->setUserPhone:Z

    .line 177
    .line 178
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 179
    .line 180
    return-object p0
.end method

.method private synthetic registerClient(Z)V
    .locals 0

    .line 189
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    if-eqz p1, :cond_0

    .line 190
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setDebugLog()Lcom/appsflyer/internal/AFh1wSDK;

    move-result-object p0

    invoke-interface {p0}, Lcom/appsflyer/internal/AFh1wSDK;->registerClient()V

    return-void

    .line 191
    :cond_0
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setDebugLog()Lcom/appsflyer/internal/AFh1wSDK;

    move-result-object p0

    invoke-interface {p0}, Lcom/appsflyer/internal/AFh1wSDK;->d()V

    return-void
.end method

.method private synthetic unregisterClient()V
    .locals 1

    .line 151
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 152
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->w()Lcom/appsflyer/internal/AFf1aSDK;

    move-result-object p0

    new-instance v0, Lcom/appsflyer/internal/AFh1kSDK;

    invoke-direct {v0}, Lcom/appsflyer/internal/AFh1kSDK;-><init>()V

    invoke-interface {p0, v0}, Lcom/appsflyer/internal/AFf1aSDK;->d(Lcom/appsflyer/internal/AFh1pSDK;)V

    return-void
.end method

.method private unregisterClient(Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->setUserFirstName:Z

    .line 8
    .line 9
    const-string v1, "start"

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {v1}, Lcom/appsflyer/internal/AFa1tSDK;->d(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 18
    .line 19
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAppInviteOneLink()Lcom/appsflyer/internal/AFj1wSDK;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0}, Lcom/appsflyer/internal/AFj1wSDK;->AFLogger()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    sget-object p0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 30
    .line 31
    sget-object p1, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 32
    .line 33
    const-string v0, "WARNING: SessionReadyListener is not registered! You must call \'registerSessionReadyListener(SessionReadyListener)\' before calling \'start()\'. The listener ensures that all required data (e.g., deeplink parameters) is available before session initialization."

    .line 34
    .line 35
    invoke-virtual {p0, p1, v0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 40
    .line 41
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-boolean v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->setUserPhone:Z

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    sget-object p0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 50
    .line 51
    sget-object p1, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 52
    .line 53
    const-string v0, "AppsFlyer SDK session already started. Skipping duplicate start call."

    .line 54
    .line 55
    invoke-virtual {p0, p1, v0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 60
    .line 61
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    const/4 v2, 0x0

    .line 66
    new-array v2, v2, [Ljava/lang/String;

    .line 67
    .line 68
    invoke-interface {v0, v1, v2}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 72
    .line 73
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 74
    .line 75
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 76
    .line 77
    sget-object v2, Lcom/appsflyer/internal/AFa1tSDK;->unregisterClient:Ljava/lang/String;

    .line 78
    .line 79
    new-instance v3, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    const-string v4, "Starting AppsFlyer: (v7.0.1."

    .line 82
    .line 83
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string v4, ")"

    .line 90
    .line 91
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-virtual {v0, v1, v3}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    new-instance v3, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    const-string v4, "Build Number: "

    .line 104
    .line 105
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 119
    .line 120
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->getSdkVersion()Lcom/appsflyer/internal/AFa1aSDK;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-interface {v0}, Lcom/appsflyer/internal/AFa1aSDK;->unregisterClient()V

    .line 125
    .line 126
    .line 127
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 128
    .line 129
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setUserLastName()Lcom/appsflyer/internal/AFh1sSDK;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    if-eqz v0, :cond_3

    .line 134
    .line 135
    invoke-interface {v0}, Lcom/appsflyer/internal/AFh1sSDK;->d()V

    .line 136
    .line 137
    .line 138
    :cond_3
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 139
    .line 140
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    const/4 v1, 0x1

    .line 145
    iput-boolean v1, v0, Lcom/appsflyer/internal/AFc1eSDK;->setUserPhone:Z

    .line 146
    .line 147
    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper(Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;)V

    .line 148
    .line 149
    .line 150
    return-void
.end method

.method private synthetic v()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setUserEmail()Lcom/appsflyer/internal/AFb1aSDK;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lcom/appsflyer/internal/AFb1aSDK;->AFLogger()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 14
    .line 15
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setUserEmail()Lcom/appsflyer/internal/AFb1aSDK;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Lcom/appsflyer/internal/AFb1aSDK;->unregisterClient()V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 23
    .line 24
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->getInstance()Lcom/appsflyer/internal/AFi1vSDK;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 29
    .line 30
    const/16 v2, 0x1f

    .line 31
    .line 32
    if-lt v1, v2, :cond_1

    .line 33
    .line 34
    new-instance v1, Lcom/appsflyer/internal/AFi1sSDK;

    .line 35
    .line 36
    iget-object v2, v0, Lcom/appsflyer/internal/AFi1vSDK;->AFLogger:Landroid/content/Context;

    .line 37
    .line 38
    invoke-direct {v1, v2}, Lcom/appsflyer/internal/AFi1sSDK;-><init>(Landroid/content/Context;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    new-instance v1, Lcom/appsflyer/internal/AFi1wSDK;

    .line 43
    .line 44
    iget-object v2, v0, Lcom/appsflyer/internal/AFi1vSDK;->AFLogger:Landroid/content/Context;

    .line 45
    .line 46
    invoke-direct {v1, v2}, Lcom/appsflyer/internal/AFi1wSDK;-><init>(Landroid/content/Context;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    iput-object v1, v0, Lcom/appsflyer/internal/AFi1vSDK;->d:Lcom/appsflyer/internal/AFi1ySDK;

    .line 50
    .line 51
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 52
    .line 53
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AppsFlyerLib()Lcom/appsflyer/internal/AFf1fSDK;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 58
    .line 59
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v0, v1}, Lcom/appsflyer/internal/AFf1fSDK;->d(Lcom/appsflyer/internal/AFc1iSDK;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 67
    .line 68
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->e()Lcom/appsflyer/internal/AFh1xSDK;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 73
    .line 74
    .line 75
    move-result-wide v1

    .line 76
    iput-wide v1, v0, Lcom/appsflyer/internal/AFh1xSDK;->i:J

    .line 77
    .line 78
    iget-object v1, v0, Lcom/appsflyer/internal/AFh1xSDK;->unregisterClient:Lcom/appsflyer/internal/AFc1iSDK;

    .line 79
    .line 80
    iget-object v1, v1, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 81
    .line 82
    const-string v2, "appsFlyerCount"

    .line 83
    .line 84
    const/4 v3, 0x0

    .line 85
    invoke-interface {v1, v2, v3}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    const/4 v2, 0x1

    .line 90
    if-ne v1, v2, :cond_2

    .line 91
    .line 92
    iget-object v2, v0, Lcom/appsflyer/internal/AFh1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 93
    .line 94
    const-string v3, "first_launch"

    .line 95
    .line 96
    invoke-interface {v2, v3}, Lcom/appsflyer/internal/AFc1kSDK;->registerClient(Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-eqz v2, :cond_2

    .line 101
    .line 102
    iget-object v2, v0, Lcom/appsflyer/internal/AFh1xSDK;->d:Ljava/util/Map;

    .line 103
    .line 104
    invoke-virtual {v0, v3}, Lcom/appsflyer/internal/AFh1xSDK;->AFLogger(Ljava/lang/String;)Ljava/util/Map;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-interface {v2, v3}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 109
    .line 110
    .line 111
    :cond_2
    if-lez v1, :cond_3

    .line 112
    .line 113
    iget-object v1, v0, Lcom/appsflyer/internal/AFh1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 114
    .line 115
    const-string v2, "gcd"

    .line 116
    .line 117
    invoke-interface {v1, v2}, Lcom/appsflyer/internal/AFc1kSDK;->registerClient(Ljava/lang/String;)Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-eqz v1, :cond_3

    .line 122
    .line 123
    iget-object v1, v0, Lcom/appsflyer/internal/AFh1xSDK;->AFLogger:Ljava/util/Map;

    .line 124
    .line 125
    invoke-virtual {v0, v2}, Lcom/appsflyer/internal/AFh1xSDK;->AFLogger(Ljava/lang/String;)Ljava/util/Map;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-interface {v1, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 130
    .line 131
    .line 132
    :cond_3
    iget-object v1, v0, Lcom/appsflyer/internal/AFh1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 133
    .line 134
    const-string v2, "prev_session_dur"

    .line 135
    .line 136
    const-wide/16 v3, 0x0

    .line 137
    .line 138
    invoke-interface {v1, v2, v3, v4}, Lcom/appsflyer/internal/AFc1kSDK;->unregisterClient(Ljava/lang/String;J)J

    .line 139
    .line 140
    .line 141
    move-result-wide v1

    .line 142
    iput-wide v1, v0, Lcom/appsflyer/internal/AFh1xSDK;->afInfoLog:J

    .line 143
    .line 144
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 145
    .line 146
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->i()Lcom/appsflyer/internal/AFf1hSDK;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-direct {p0}, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFf1mSDK;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-virtual {v0, v1}, Lcom/appsflyer/internal/AFf1hSDK;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFf1mSDK;)V

    .line 155
    .line 156
    .line 157
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 158
    .line 159
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->values()Lcom/appsflyer/internal/AFc1vSDK;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1vSDK;->d()V

    .line 164
    .line 165
    .line 166
    return-void
.end method


# virtual methods
.method public final varargs addPushNotificationDeepLinkPath([Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 6
    .line 7
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->enableTCFDataCollection()Lcom/appsflyer/internal/AFa1qSDK;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1qSDK;->registerClient:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {p0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final anonymizeUser(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    filled-new-array {v1}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "anonymizeUser"

    .line 16
    .line 17
    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 21
    .line 22
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    iput-boolean p1, p0, Lcom/appsflyer/internal/AFc1eSDK;->afInfoLog:Z

    .line 27
    .line 28
    return-void
.end method

.method public final appendParametersToDeepLinkingURL(Ljava/lang/String;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->enableTCFDataCollection()Lcom/appsflyer/internal/AFa1qSDK;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iput-object p1, p0, Lcom/appsflyer/internal/AFa1qSDK;->AFLogger:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, Lcom/appsflyer/internal/AFa1qSDK;->d:Ljava/util/Map;

    .line 10
    .line 11
    return-void
.end method

.method public final clearUserPii()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    new-array v1, v1, [Ljava/lang/String;

    .line 9
    .line 10
    const-string v2, "clearUserPii"

    .line 11
    .line 12
    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 16
    .line 17
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 23
    .line 24
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const/4 v0, 0x0

    .line 29
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1eSDK;->AFLogger:Ljava/lang/String;

    .line 30
    .line 31
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1eSDK;->d:Ljava/lang/String;

    .line 32
    .line 33
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1eSDK;->registerClient:Ljava/lang/String;

    .line 34
    .line 35
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1eSDK;->AFKeystoreWrapper:Ljava/lang/String;

    .line 36
    .line 37
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1eSDK;->e:Ljava/lang/String;

    .line 38
    .line 39
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1eSDK;->i:Ljava/lang/Long;

    .line 40
    .line 41
    return-void
.end method

.method public final collectDataFromLauncherActivity(Landroid/app/Activity;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->stop()Lcom/appsflyer/internal/AFi1tSDK;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 8
    .line 9
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v0, p1}, Lcom/appsflyer/internal/AFi1tSDK;->registerClient(Landroid/app/Activity;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iput-object v2, v1, Lcom/appsflyer/internal/AFc1eSDK;->setUserLastName:Ljava/lang/String;

    .line 18
    .line 19
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 20
    .line 21
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {v0, p1}, Lcom/appsflyer/internal/AFi1tSDK;->AFLogger(Landroid/app/Activity;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Lcom/appsflyer/internal/AFc1eSDK;->clearUserPii:Ljava/lang/String;

    .line 30
    .line 31
    return-void
.end method

.method public final disableAppSetId()V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lcom/appsflyer/internal/AFc1eSDK;->setCustomerUserId:Z

    .line 9
    .line 10
    return-void
.end method

.method public final enableFacebookDeferredApplinks(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->getSdkVersion()Lcom/appsflyer/internal/AFa1aSDK;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0, p1}, Lcom/appsflyer/internal/AFa1aSDK;->AFLogger(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final enableTCFDataCollection(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lcom/appsflyer/internal/AFc1eSDK;->afDebugLog:Ljava/lang/Boolean;

    .line 12
    .line 13
    return-void
.end method

.method public final getAppsFlyerUID(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    new-array v1, v1, [Ljava/lang/String;

    .line 9
    .line 10
    const-string v2, "getAppsFlyerUID"

    .line 11
    .line 12
    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0

    .line 19
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 20
    .line 21
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 28
    .line 29
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 30
    .line 31
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    iget-object p0, p0, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 36
    .line 37
    invoke-static {p0}, Lcom/appsflyer/internal/AFb1jSDK;->AFLogger(Lcom/appsflyer/internal/AFc1kSDK;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method

.method public final getAttributionId(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iput-object v1, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 12
    .line 13
    :cond_0
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 14
    .line 15
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0, p1}, Lcom/appsflyer/internal/AFc1iSDK;->registerClient(Landroid/content/Context;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public final getHostName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->getLevel()Lcom/appsflyer/internal/AFd1jSDK;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFd1jSDK;->d()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final getHostPrefix()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->getLevel()Lcom/appsflyer/internal/AFd1jSDK;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFd1jSDK;->registerClient()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final getOutOfStore(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->getLevel:Ljava/lang/String;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    move-object p0, v0

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 18
    .line 19
    iget-object v1, v1, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, v1, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 26
    .line 27
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 28
    .line 29
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const-string p1, "AF_STORE"

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    :goto_0
    if-eqz p0, :cond_2

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_2
    sget-object p0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 43
    .line 44
    sget-object p1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 45
    .line 46
    const-string v1, "Out-of-store value not configured via API or manifest"

    .line 47
    .line 48
    invoke-virtual {p0, p1, v1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v0
.end method

.method public final getSdkVersion()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 v0, 0x0

    .line 8
    new-array v0, v0, [Ljava/lang/String;

    .line 9
    .line 10
    const-string v1, "getSdkVersion"

    .line 11
    .line 12
    invoke-interface {p0, v1, v0}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lcom/appsflyer/internal/AFc1iSDK;->d()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public final init(Ljava/lang/String;Lcom/appsflyer/share/AppsFlyerConversionListener;Landroid/content/Context;)Lcom/appsflyer/AppsFlyerLib;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->setUserFirstName:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 19
    .line 20
    sget-object p2, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 21
    .line 22
    const-string p3, "WARNING: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key in the \'init\' API method (should be called on Application\'s onCreate)"

    .line 23
    .line 24
    invoke-virtual {p1, p2, p3}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_1
    if-nez p3, :cond_2

    .line 29
    .line 30
    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 31
    .line 32
    sget-object p2, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 33
    .line 34
    const-string p3, "ERROR: AppsFlyer SDK requires a valid Context! Ensure \'init\' is called with a non-null Context, typically from Application\'s onCreate."

    .line 35
    .line 36
    invoke-virtual {p1, p2, p3}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_2
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 41
    .line 42
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AppsFlyerLib()Lcom/appsflyer/internal/AFf1fSDK;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0, p1}, Lcom/appsflyer/internal/AFf1fSDK;->d(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 50
    .line 51
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 52
    .line 53
    invoke-virtual {p3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iput-object v1, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 58
    .line 59
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 60
    .line 61
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    const/4 v1, 0x1

    .line 66
    iput-boolean v1, v0, Lcom/appsflyer/internal/AFc1eSDK;->setUserFirstName:Z

    .line 67
    .line 68
    invoke-static {p3}, Lcom/appsflyer/internal/AFj1qSDK;->X_(Landroid/content/Context;)Landroid/app/Application;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-nez v0, :cond_3

    .line 73
    .line 74
    :goto_0
    return-object p0

    .line 75
    :cond_3
    sget-object v2, Lcom/appsflyer/internal/AFa1zSDK;->INSTANCE:Lcom/appsflyer/internal/AFa1zSDK;

    .line 76
    .line 77
    invoke-virtual {v2, p3}, Lcom/appsflyer/internal/AFa1zSDK;->AFLogger(Landroid/content/Context;)V

    .line 78
    .line 79
    .line 80
    iget-object v2, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 81
    .line 82
    invoke-interface {v2}, Lcom/appsflyer/internal/AFc1bSDK;->d()Ljava/util/concurrent/ExecutorService;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    new-instance v3, Lcom/appsflyer/internal/b;

    .line 87
    .line 88
    const/4 v4, 0x0

    .line 89
    invoke-direct {v3, p0, v4}, Lcom/appsflyer/internal/b;-><init>(Lcom/appsflyer/internal/AFa1tSDK;B)V

    .line 90
    .line 91
    .line 92
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 93
    .line 94
    .line 95
    iget-object v2, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 96
    .line 97
    invoke-interface {v2}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    iget-object v3, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 102
    .line 103
    invoke-interface {v3}, Lcom/appsflyer/internal/AFc1bSDK;->AppsFlyerLib()Lcom/appsflyer/internal/AFf1fSDK;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    iget-object v2, v2, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 114
    .line 115
    const-string v5, "appsFlyerCount"

    .line 116
    .line 117
    invoke-interface {v2, v5, v4}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-nez v2, :cond_4

    .line 122
    .line 123
    invoke-virtual {v3}, Lcom/appsflyer/internal/AFf1fSDK;->AFLogger()Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-nez v2, :cond_4

    .line 128
    .line 129
    iget-object v2, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 130
    .line 131
    invoke-interface {v2}, Lcom/appsflyer/internal/AFc1bSDK;->d()Ljava/util/concurrent/ExecutorService;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    new-instance v3, Lcom/appsflyer/internal/b;

    .line 136
    .line 137
    invoke-direct {v3, p0, v1}, Lcom/appsflyer/internal/b;-><init>(Lcom/appsflyer/internal/AFa1tSDK;B)V

    .line 138
    .line 139
    .line 140
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 141
    .line 142
    .line 143
    :cond_4
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 144
    .line 145
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->afWarnLog()Lcom/appsflyer/internal/AFe1wSDK;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    iget-object v2, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 150
    .line 151
    invoke-interface {v2}, Lcom/appsflyer/internal/AFc1bSDK;->setCustomerUserId()Lcom/appsflyer/internal/AFe1vSDK;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    iget-object v1, v1, Lcom/appsflyer/internal/AFe1wSDK;->unregisterClient:Ljava/util/List;

    .line 159
    .line 160
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 164
    .line 165
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->afWarnLog()Lcom/appsflyer/internal/AFe1wSDK;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    new-instance v2, Lcom/appsflyer/internal/AFe1iSDK;

    .line 170
    .line 171
    iget-object v3, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 172
    .line 173
    invoke-direct {v2, v3}, Lcom/appsflyer/internal/AFe1iSDK;-><init>(Lcom/appsflyer/internal/AFc1bSDK;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v1, v2}, Lcom/appsflyer/internal/AFe1wSDK;->d(Lcom/appsflyer/internal/AFe1ySDK;)V

    .line 177
    .line 178
    .line 179
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 180
    .line 181
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->getEntries()Lcom/appsflyer/exception_manager/ExceptionManager;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    if-eqz v1, :cond_5

    .line 186
    .line 187
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 188
    .line 189
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->getEntries()Lcom/appsflyer/exception_manager/ExceptionManager;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    new-instance v2, Lcom/appsflyer/internal/c;

    .line 194
    .line 195
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 196
    .line 197
    .line 198
    invoke-interface {v1, v2}, Lcom/appsflyer/exception_manager/ExceptionManager;->init(Lcom/appsflyer/exception_manager/ExceptionManager$ConfigurationChangedListener;)V

    .line 199
    .line 200
    .line 201
    :cond_5
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 202
    .line 203
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->afDebugLog()Lcom/appsflyer/internal/AFi1aSDK;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    new-instance v2, Lcom/appsflyer/internal/b;

    .line 208
    .line 209
    const/4 v3, 0x2

    .line 210
    invoke-direct {v2, p0, v3}, Lcom/appsflyer/internal/b;-><init>(Lcom/appsflyer/internal/AFa1tSDK;B)V

    .line 211
    .line 212
    .line 213
    iget-object v3, v1, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    .line 214
    .line 215
    invoke-interface {v3}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    iget-object v3, v3, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 220
    .line 221
    invoke-interface {v3, v5, v4}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    if-lez v3, :cond_6

    .line 226
    .line 227
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 228
    .line 229
    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 230
    .line 231
    const-string v3, "Referrers collection disallowed by counter."

    .line 232
    .line 233
    invoke-virtual {v1, v2, v3}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    goto/16 :goto_4

    .line 237
    .line 238
    :cond_6
    invoke-virtual {v1, v2}, Lcom/appsflyer/internal/AFi1aSDK;->d(Ljava/lang/Runnable;)Lcom/appsflyer/internal/AFi1gSDK;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    invoke-virtual {v1, v3, v2}, Lcom/appsflyer/internal/AFi1aSDK;->unregisterClient(Lcom/appsflyer/internal/AFi1gSDK;Ljava/lang/Runnable;)Ljava/lang/Runnable;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    new-instance v5, Lcom/appsflyer/sdk_base/referrer/ReferrerProp;

    .line 247
    .line 248
    iget-object v6, v1, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    .line 249
    .line 250
    invoke-interface {v6}, Lcom/appsflyer/internal/AFc1bSDK;->afErrorLog()Lcom/appsflyer/sdk_base/logger/LoggerDelegate;

    .line 251
    .line 252
    .line 253
    move-result-object v6

    .line 254
    iget-object v7, v1, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    .line 255
    .line 256
    invoke-interface {v7}, Lcom/appsflyer/internal/AFc1bSDK;->d()Ljava/util/concurrent/ExecutorService;

    .line 257
    .line 258
    .line 259
    move-result-object v7

    .line 260
    invoke-direct {v5, v2, v6, v7}, Lcom/appsflyer/sdk_base/referrer/ReferrerProp;-><init>(Ljava/lang/Runnable;Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Ljava/util/concurrent/ExecutorService;)V

    .line 261
    .line 262
    .line 263
    iget-object v2, v1, Lcom/appsflyer/internal/AFi1aSDK;->unregisterClient:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 264
    .line 265
    invoke-virtual {v2, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    new-instance v2, Lcom/appsflyer/internal/AFi1bSDK;

    .line 269
    .line 270
    invoke-direct {v2, v5}, Lcom/appsflyer/internal/AFi1bSDK;-><init>(Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V

    .line 271
    .line 272
    .line 273
    iget-object v3, v1, Lcom/appsflyer/internal/AFi1aSDK;->unregisterClient:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 274
    .line 275
    invoke-virtual {v3, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    invoke-virtual {v1, v5}, Lcom/appsflyer/internal/AFi1aSDK;->unregisterClient(Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V

    .line 279
    .line 280
    .line 281
    iget-object v2, v1, Lcom/appsflyer/internal/AFi1aSDK;->d:Lcom/appsflyer/internal/AFi1hSDK;

    .line 282
    .line 283
    invoke-interface {v2, v5}, Lcom/appsflyer/internal/AFi1hSDK;->AFKeystoreWrapper(Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)Ljava/util/List;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    iget-object v3, v1, Lcom/appsflyer/internal/AFi1aSDK;->unregisterClient:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 288
    .line 289
    invoke-virtual {v3, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    .line 290
    .line 291
    .line 292
    invoke-static {}, Lcom/appsflyer/sdk_base/referrer/Referrer;->getExternalReferrers()Ljava/util/Set;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 301
    .line 302
    .line 303
    move-result v3

    .line 304
    if-eqz v3, :cond_7

    .line 305
    .line 306
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v3

    .line 310
    check-cast v3, Lkotlin/Pair;

    .line 311
    .line 312
    iget-object v3, v3, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 313
    .line 314
    check-cast v3, Ljava/lang/Class;

    .line 315
    .line 316
    iget-object v6, v1, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    .line 317
    .line 318
    invoke-interface {v6}, Lcom/appsflyer/internal/AFc1bSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    .line 319
    .line 320
    .line 321
    move-result-object v6

    .line 322
    iget-object v6, v6, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 323
    .line 324
    iget-object v7, v1, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    .line 325
    .line 326
    invoke-interface {v7}, Lcom/appsflyer/internal/AFc1bSDK;->afErrorLog()Lcom/appsflyer/sdk_base/logger/LoggerDelegate;

    .line 327
    .line 328
    .line 329
    move-result-object v7

    .line 330
    invoke-static {v3, v6, v7}, Lcom/appsflyer/sdk_base/referrer/ReferrerKt;->disableInitProvider(Ljava/lang/Class;Landroid/content/Context;Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    goto :goto_1

    .line 334
    :cond_7
    iget-object v2, v1, Lcom/appsflyer/internal/AFi1aSDK;->unregisterClient:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 335
    .line 336
    new-array v3, v4, [Lcom/appsflyer/sdk_base/referrer/Referrer;

    .line 337
    .line 338
    invoke-virtual {v2, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    check-cast v2, [Lcom/appsflyer/sdk_base/referrer/Referrer;

    .line 343
    .line 344
    array-length v3, v2

    .line 345
    move v6, v4

    .line 346
    :goto_2
    if-ge v6, v3, :cond_8

    .line 347
    .line 348
    aget-object v7, v2, v6

    .line 349
    .line 350
    iget-object v8, v1, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    .line 351
    .line 352
    invoke-interface {v8}, Lcom/appsflyer/internal/AFc1bSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    .line 353
    .line 354
    .line 355
    move-result-object v8

    .line 356
    iget-object v8, v8, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 357
    .line 358
    invoke-virtual {v7, v8}, Lcom/appsflyer/sdk_base/referrer/Referrer;->start(Landroid/content/Context;)V

    .line 359
    .line 360
    .line 361
    add-int/lit8 v6, v6, 0x1

    .line 362
    .line 363
    goto :goto_2

    .line 364
    :cond_8
    iget-object v2, v1, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    .line 365
    .line 366
    invoke-interface {v2}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    const-string v3, "AF_PREINSTALL_DISABLED"

    .line 371
    .line 372
    invoke-virtual {v2, v3}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    if-eqz v2, :cond_9

    .line 377
    .line 378
    invoke-static {v2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 379
    .line 380
    .line 381
    move-result v2

    .line 382
    goto :goto_3

    .line 383
    :cond_9
    move v2, v4

    .line 384
    :goto_3
    if-nez v2, :cond_a

    .line 385
    .line 386
    iget-object v2, v1, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    .line 387
    .line 388
    invoke-interface {v2}, Lcom/appsflyer/internal/AFc1bSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    iget-object v2, v2, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 393
    .line 394
    iget-object v3, v1, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    .line 395
    .line 396
    invoke-virtual {v1, v2, v5, v3}, Lcom/appsflyer/internal/AFi1aSDK;->unregisterClient(Landroid/content/Context;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;Lcom/appsflyer/internal/AFc1bSDK;)V

    .line 397
    .line 398
    .line 399
    :cond_a
    :goto_4
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFLogger:Lcom/appsflyer/internal/AFb1hSDK;

    .line 400
    .line 401
    if-nez v1, :cond_b

    .line 402
    .line 403
    new-instance v1, Lcom/appsflyer/internal/AFb1hSDK;

    .line 404
    .line 405
    iget-object v2, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 406
    .line 407
    new-instance v3, Lcom/appsflyer/internal/d;

    .line 408
    .line 409
    invoke-direct {v3, p0, v4}, Lcom/appsflyer/internal/d;-><init>(Ljava/lang/Object;B)V

    .line 410
    .line 411
    .line 412
    invoke-direct {p0}, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFf1mSDK;

    .line 413
    .line 414
    .line 415
    move-result-object v4

    .line 416
    iget-object v5, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 417
    .line 418
    invoke-interface {v5}, Lcom/appsflyer/internal/AFc1bSDK;->setUserLastName()Lcom/appsflyer/internal/AFh1sSDK;

    .line 419
    .line 420
    .line 421
    move-result-object v5

    .line 422
    invoke-direct {v1, v2, v3, v4, v5}, Lcom/appsflyer/internal/AFb1hSDK;-><init>(Lcom/appsflyer/internal/AFc1bSDK;Lkotlin/jvm/functions/Function0;Lcom/appsflyer/internal/AFf1mSDK;Lcom/appsflyer/internal/AFh1sSDK;)V

    .line 423
    .line 424
    .line 425
    iput-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFLogger:Lcom/appsflyer/internal/AFb1hSDK;

    .line 426
    .line 427
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 428
    .line 429
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->updateServerUninstallToken()Lcom/appsflyer/internal/AFb1bSDK;

    .line 430
    .line 431
    .line 432
    move-result-object v1

    .line 433
    iget-object v2, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFLogger:Lcom/appsflyer/internal/AFb1hSDK;

    .line 434
    .line 435
    invoke-interface {v1, p3, v2}, Lcom/appsflyer/internal/AFb1bSDK;->unregisterClient(Landroid/content/Context;Lcom/appsflyer/internal/AFb1bSDK$AFa1zSDK;)V

    .line 436
    .line 437
    .line 438
    :cond_b
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 439
    .line 440
    .line 441
    move-result-object p3

    .line 442
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 443
    .line 444
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFc1iSDK;->r_()Landroid/content/pm/PackageInfo;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    :try_start_0
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 453
    .line 454
    if-eqz v0, :cond_f

    .line 455
    .line 456
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 457
    .line 458
    const v1, 0x8000

    .line 459
    .line 460
    .line 461
    and-int/2addr v0, v1

    .line 462
    if-eqz v0, :cond_f

    .line 463
    .line 464
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 465
    .line 466
    const/16 v1, 0x1f

    .line 467
    .line 468
    const-string v2, "xml"

    .line 469
    .line 470
    if-lt v0, v1, :cond_d

    .line 471
    .line 472
    :try_start_1
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    const-string v1, "appsflyer_data_extraction_rules"

    .line 477
    .line 478
    invoke-virtual {p3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object p3

    .line 482
    invoke-virtual {v0, v1, v2, p3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 483
    .line 484
    .line 485
    move-result p3

    .line 486
    if-eqz p3, :cond_c

    .line 487
    .line 488
    sget-object p3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 489
    .line 490
    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 491
    .line 492
    const-string v1, "appsflyer_data_extraction_rules.xml detected, using AppsFlyer data extraction rules for AppsFlyer SDK data"

    .line 493
    .line 494
    invoke-virtual {p3, v0, v1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 495
    .line 496
    .line 497
    goto :goto_6

    .line 498
    :catchall_0
    move-exception p3

    .line 499
    goto :goto_5

    .line 500
    :cond_c
    sget-object p3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 501
    .line 502
    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 503
    .line 504
    const-string v1, "\'allowBackup\' is set to true; appsflyer_data_extraction_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application\'s <data-extraction-rules> both in <device-transfer> and <cloud-backup>.\nIf Appsflyer\'s Purchase Connector is in use then you also must add to <device-transfer> and <cloud-backup> the following excludes: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>"

    .line 505
    .line 506
    invoke-virtual {p3, v0, v1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 507
    .line 508
    .line 509
    goto :goto_6

    .line 510
    :cond_d
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    const-string v1, "appsflyer_backup_rules"

    .line 515
    .line 516
    invoke-virtual {p3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 517
    .line 518
    .line 519
    move-result-object p3

    .line 520
    invoke-virtual {v0, v1, v2, p3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 521
    .line 522
    .line 523
    move-result p3

    .line 524
    if-eqz p3, :cond_e

    .line 525
    .line 526
    sget-object p3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 527
    .line 528
    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 529
    .line 530
    const-string v1, "appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data"

    .line 531
    .line 532
    invoke-virtual {p3, v0, v1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 533
    .line 534
    .line 535
    goto :goto_6

    .line 536
    :cond_e
    sget-object p3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 537
    .line 538
    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 539
    .line 540
    const-string v1, "\'allowBackup\' is set to true; appsflyer_backup_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application\'s <full-backup-content> rules.\nIf Appsflyer\'s Purchase Connector is in use then you also must add the following to your rules: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>"

    .line 541
    .line 542
    invoke-virtual {p3, v0, v1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 543
    .line 544
    .line 545
    goto :goto_6

    .line 546
    :goto_5
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 547
    .line 548
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 549
    .line 550
    const-string v2, "Exception while checking BackupRules: "

    .line 551
    .line 552
    invoke-virtual {v0, v1, v2, p3}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 553
    .line 554
    .line 555
    :cond_f
    :goto_6
    iget-object p3, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 556
    .line 557
    invoke-interface {p3}, Lcom/appsflyer/internal/AFc1bSDK;->registerClient()Lcom/appsflyer/AppsFlyerProperties;

    .line 558
    .line 559
    .line 560
    move-result-object p3

    .line 561
    invoke-interface {p3}, Lcom/appsflyer/AppsFlyerProperties;->loadProperties()V

    .line 562
    .line 563
    .line 564
    iget-object p3, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 565
    .line 566
    invoke-interface {p3}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 567
    .line 568
    .line 569
    move-result-object p3

    .line 570
    if-nez p2, :cond_10

    .line 571
    .line 572
    const-string v0, "null"

    .line 573
    .line 574
    goto :goto_7

    .line 575
    :cond_10
    const-string v0, "conversionDataListener"

    .line 576
    .line 577
    :goto_7
    filled-new-array {p1, v0}, [Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object p1

    .line 581
    const-string v0, "init"

    .line 582
    .line 583
    invoke-interface {p3, v0, p1}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 584
    .line 585
    .line 586
    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 587
    .line 588
    sget-object p3, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 589
    .line 590
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 591
    .line 592
    sget-object v0, Lcom/appsflyer/internal/AFa1tSDK;->unregisterClient:Ljava/lang/String;

    .line 593
    .line 594
    new-instance v1, Ljava/lang/StringBuilder;

    .line 595
    .line 596
    const-string v2, "Initializing AppsFlyer SDK: (v7.0.1."

    .line 597
    .line 598
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 599
    .line 600
    .line 601
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 602
    .line 603
    .line 604
    const-string v0, ")"

    .line 605
    .line 606
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 607
    .line 608
    .line 609
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    invoke-virtual {p1, p3, v0}, Lcom/appsflyer/AFLogger;->force(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 614
    .line 615
    .line 616
    iget-object p1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 617
    .line 618
    invoke-interface {p1, p2}, Lcom/appsflyer/internal/AFc1bSDK;->registerClient(Lcom/appsflyer/share/AppsFlyerConversionListener;)V

    .line 619
    .line 620
    .line 621
    return-object p0
.end method

.method public final isPreInstalledApp(Landroid/content/Context;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iput-object v1, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 12
    .line 13
    :cond_0
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 14
    .line 15
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0, p1}, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper(Landroid/content/Context;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0
.end method

.method public final isSessionReady()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    new-array v1, v1, [Ljava/lang/String;

    .line 9
    .line 10
    const-string v2, "isSessionReady"

    .line 11
    .line 12
    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 16
    .line 17
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setAppInviteOneLink()Lcom/appsflyer/internal/AFj1wSDK;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-interface {p0}, Lcom/appsflyer/internal/AFj1wSDK;->AFKeystoreWrapper()Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0
.end method

.method public final isStopped()Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->AppsFlyerLib()Lcom/appsflyer/internal/AFf1fSDK;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFf1fSDK;->AFLogger()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final logAdRevenue(Lcom/appsflyer/share/AFAdRevenueData;Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/share/AFAdRevenueData;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->setUserFirstName:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string p0, "logAdRevenue"

    .line 12
    .line 13
    invoke-static {p0}, Lcom/appsflyer/internal/AFa1tSDK;->d(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-virtual {p1}, Lcom/appsflyer/share/AFAdRevenueData;->areAllFieldsValid()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    sget-object p0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 24
    .line 25
    sget-object p1, Lcom/appsflyer/sdk_base/logger/LogTag;->AD_REVENUE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 26
    .line 27
    const-string p2, "Invalid ad revenue parameters provided"

    .line 28
    .line 29
    invoke-virtual {p0, p1, p2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 34
    .line 35
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AppsFlyerLib()Lcom/appsflyer/internal/AFf1fSDK;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFf1fSDK;->AFLogger()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    sget-object p0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 46
    .line 47
    sget-object p1, Lcom/appsflyer/sdk_base/logger/LogTag;->AD_REVENUE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 48
    .line 49
    const-string p2, "SDK is stopped"

    .line 50
    .line 51
    invoke-virtual {p0, p1, p2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_2
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 56
    .line 57
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AppsFlyerLib()Lcom/appsflyer/internal/AFf1fSDK;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    const v2, -0x62ff1f55

    .line 70
    .line 71
    .line 72
    const v3, 0x62ff1f57

    .line 73
    .line 74
    .line 75
    invoke-static {v1, v2, v3, v0}, Lcom/appsflyer/internal/AFf1fSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Ljava/lang/String;

    .line 80
    .line 81
    if-eqz v0, :cond_4

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_3

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_3
    new-instance v0, Lcom/appsflyer/internal/AFh1lSDK;

    .line 91
    .line 92
    invoke-direct {v0, p1, p2}, Lcom/appsflyer/internal/AFh1lSDK;-><init>(Lcom/appsflyer/share/AFAdRevenueData;Ljava/util/Map;)V

    .line 93
    .line 94
    .line 95
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 96
    .line 97
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->w()Lcom/appsflyer/internal/AFf1aSDK;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-interface {p0, v0}, Lcom/appsflyer/internal/AFf1aSDK;->d(Lcom/appsflyer/internal/AFh1pSDK;)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_4
    :goto_0
    sget-object p0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 106
    .line 107
    sget-object p1, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 108
    .line 109
    const-string p2, "WARNING: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key in the \'init\' API method (should be called on Application\'s onCreate)"

    .line 110
    .line 111
    invoke-virtual {p0, p1, p2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return-void
.end method

.method public final logEvent(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 222
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/appsflyer/internal/AFa1tSDK;->logEvent(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;)V

    return-void
.end method

.method public final logEvent(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;",
            ")V"
        }
    .end annotation

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    const/4 p3, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-direct {v0, p3}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 8
    .line 9
    .line 10
    move-object p3, v0

    .line 11
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iput-object v1, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 22
    .line 23
    :cond_1
    new-instance v0, Lcom/appsflyer/internal/AFh1jSDK;

    .line 24
    .line 25
    invoke-direct {v0}, Lcom/appsflyer/internal/AFh1jSDK;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p2, v0, Lcom/appsflyer/internal/AFh1pSDK;->v:Ljava/lang/String;

    .line 29
    .line 30
    iput-object p4, v0, Lcom/appsflyer/internal/AFh1pSDK;->AFLogger:Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;

    .line 31
    .line 32
    if-eqz p3, :cond_3

    .line 33
    .line 34
    const-string p4, "af_touch_obj"

    .line 35
    .line 36
    invoke-interface {p3, p4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    new-instance v1, Ljava/util/HashMap;

    .line 43
    .line 44
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-interface {p3, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    instance-of v3, v2, Landroid/view/MotionEvent;

    .line 52
    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    check-cast v2, Landroid/view/MotionEvent;

    .line 56
    .line 57
    new-instance v3, Ljava/util/HashMap;

    .line 58
    .line 59
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getX()F

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    const-string v5, "x"

    .line 71
    .line 72
    invoke-virtual {v3, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getY()F

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    const-string v5, "y"

    .line 84
    .line 85
    invoke-virtual {v3, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    const-string v4, "loc"

    .line 89
    .line 90
    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getPressure()F

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    const-string v4, "pf"

    .line 102
    .line 103
    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getTouchMajor()F

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    const/high16 v3, 0x40000000    # 2.0f

    .line 111
    .line 112
    div-float/2addr v2, v3

    .line 113
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    const-string v3, "rad"

    .line 118
    .line 119
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_2
    const-string v2, "error"

    .line 124
    .line 125
    const-string v3, "Parsing failed due to invalid input in \'af_touch_obj\'."

    .line 126
    .line 127
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 131
    .line 132
    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->PREDICT:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 133
    .line 134
    invoke-virtual {v2, v4, v3}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    :goto_1
    const-string v2, "tch_data"

    .line 138
    .line 139
    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-interface {p3, p4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, v1}, Lcom/appsflyer/internal/AFh1pSDK;->AFKeystoreWrapper(Ljava/util/Map;)Lcom/appsflyer/internal/AFh1pSDK;

    .line 147
    .line 148
    .line 149
    :cond_3
    iput-object p3, v0, Lcom/appsflyer/internal/AFh1pSDK;->AFKeystoreWrapper:Ljava/util/Map;

    .line 150
    .line 151
    iget-object p3, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 152
    .line 153
    invoke-interface {p3}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 154
    .line 155
    .line 156
    move-result-object p3

    .line 157
    new-instance p4, Lorg/json/JSONObject;

    .line 158
    .line 159
    iget-object v1, v0, Lcom/appsflyer/internal/AFh1pSDK;->AFKeystoreWrapper:Ljava/util/Map;

    .line 160
    .line 161
    if-nez v1, :cond_4

    .line 162
    .line 163
    new-instance v1, Ljava/util/HashMap;

    .line 164
    .line 165
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 166
    .line 167
    .line 168
    :cond_4
    invoke-direct {p4, v1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p4

    .line 175
    filled-new-array {p2, p4}, [Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p4

    .line 179
    const-string v1, "logEvent"

    .line 180
    .line 181
    invoke-interface {p3, v1, p4}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    if-nez p2, :cond_6

    .line 185
    .line 186
    sget-object p2, Lcom/appsflyer/internal/AFh1uSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1uSDK;

    .line 187
    .line 188
    iget-object p3, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 189
    .line 190
    if-eqz p1, :cond_5

    .line 191
    .line 192
    iget-object p3, p3, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 193
    .line 194
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    iput-object p1, p3, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 199
    .line 200
    :cond_5
    iget-object p1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 201
    .line 202
    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->e()Lcom/appsflyer/internal/AFh1xSDK;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-virtual {p1, p2}, Lcom/appsflyer/internal/AFh1xSDK;->unregisterClient(Lcom/appsflyer/internal/AFh1uSDK;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {p1}, Lcom/appsflyer/internal/AFh1xSDK;->AFLogger()V

    .line 210
    .line 211
    .line 212
    :cond_6
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 213
    .line 214
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->w()Lcom/appsflyer/internal/AFf1aSDK;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    invoke-interface {p0, v0}, Lcom/appsflyer/internal/AFf1aSDK;->d(Lcom/appsflyer/internal/AFh1pSDK;)V

    .line 219
    .line 220
    .line 221
    return-void
.end method

.method public final logLocation(Landroid/content/Context;DD)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p4, p5}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "logLocation"

    .line 20
    .line 21
    invoke-interface {p1, v1, v0}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    new-instance p1, Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v0, "af_long"

    .line 30
    .line 31
    invoke-static {p4, p5}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p4

    .line 35
    invoke-virtual {p1, v0, p4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    const-string p4, "af_lat"

    .line 39
    .line 40
    invoke-static {p2, p3}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-virtual {p1, p4, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    new-instance p2, Lcom/appsflyer/internal/AFh1jSDK;

    .line 48
    .line 49
    invoke-direct {p2}, Lcom/appsflyer/internal/AFh1jSDK;-><init>()V

    .line 50
    .line 51
    .line 52
    const-string p3, "af_location_coordinates"

    .line 53
    .line 54
    iput-object p3, p2, Lcom/appsflyer/internal/AFh1pSDK;->v:Ljava/lang/String;

    .line 55
    .line 56
    iput-object p1, p2, Lcom/appsflyer/internal/AFh1pSDK;->AFKeystoreWrapper:Ljava/util/Map;

    .line 57
    .line 58
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 59
    .line 60
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->w()Lcom/appsflyer/internal/AFf1aSDK;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-interface {p0, p2}, Lcom/appsflyer/internal/AFf1aSDK;->d(Lcom/appsflyer/internal/AFh1pSDK;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final logSession(Landroid/content/Context;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    new-array v1, v1, [Ljava/lang/String;

    .line 9
    .line 10
    const-string v2, "logSession"

    .line 11
    .line 12
    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 16
    .line 17
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Lcom/appsflyer/internal/AFd1uSDK;->AFKeystoreWrapper()V

    .line 22
    .line 23
    .line 24
    sget-object v0, Lcom/appsflyer/internal/AFh1uSDK;->AFLogger:Lcom/appsflyer/internal/AFh1uSDK;

    .line 25
    .line 26
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    iget-object v1, v1, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, v1, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 37
    .line 38
    :cond_0
    iget-object p1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 39
    .line 40
    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->e()Lcom/appsflyer/internal/AFh1xSDK;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1, v0}, Lcom/appsflyer/internal/AFh1xSDK;->unregisterClient(Lcom/appsflyer/internal/AFh1uSDK;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/appsflyer/internal/AFh1xSDK;->AFLogger()V

    .line 48
    .line 49
    .line 50
    new-instance p1, Lcom/appsflyer/internal/AFh1jSDK;

    .line 51
    .line 52
    invoke-direct {p1}, Lcom/appsflyer/internal/AFh1jSDK;-><init>()V

    .line 53
    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    iput-object v0, p1, Lcom/appsflyer/internal/AFh1pSDK;->v:Ljava/lang/String;

    .line 57
    .line 58
    iput-object v0, p1, Lcom/appsflyer/internal/AFh1pSDK;->AFKeystoreWrapper:Ljava/util/Map;

    .line 59
    .line 60
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 61
    .line 62
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->w()Lcom/appsflyer/internal/AFf1aSDK;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-interface {p0, p1}, Lcom/appsflyer/internal/AFf1aSDK;->d(Lcom/appsflyer/internal/AFh1pSDK;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final onPause(Landroid/content/Context;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->updateServerUninstallToken()Lcom/appsflyer/internal/AFb1bSDK;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Lcom/appsflyer/internal/AFb1bSDK;->AFKeystoreWrapper()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final performDeepLinking(Ljava/lang/String;Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 11
    .line 12
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-boolean v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->setUserFirstName:Z

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    const-string p0, "performDeepLinking"

    .line 21
    .line 22
    invoke-static {p0}, Lcom/appsflyer/internal/AFa1tSDK;->d(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    if-eqz p2, :cond_2

    .line 27
    .line 28
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 29
    .line 30
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setUserPhone()Lcom/appsflyer/internal/AFa1lSDK;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-interface {v0}, Lcom/appsflyer/internal/AFa1lSDK;->registerClient()V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 38
    .line 39
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setUserPhone()Lcom/appsflyer/internal/AFa1lSDK;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, Lcom/appsflyer/internal/AFa1kSDK;->unregisterClient(Lcom/appsflyer/internal/AFa1lSDK;)Lcom/appsflyer/internal/AFa1kSDK;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    goto :goto_0

    .line 48
    :cond_2
    new-instance v0, Ljava/util/HashMap;

    .line 49
    .line 50
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, Lcom/appsflyer/internal/AFa1kSDK;->unregisterClient(Ljava/util/Map;)Lcom/appsflyer/internal/AFa1kSDK;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    :goto_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 58
    .line 59
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->enableTCFDataCollection()Lcom/appsflyer/internal/AFa1qSDK;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {v1, v0, p1}, Lcom/appsflyer/internal/AFa1qSDK;->c_(Lcom/appsflyer/internal/AFa1kSDK;Landroid/net/Uri;)V

    .line 68
    .line 69
    .line 70
    if-eqz p2, :cond_3

    .line 71
    .line 72
    new-instance p1, Lcom/appsflyer/internal/AFh1fSDK;

    .line 73
    .line 74
    invoke-direct {p1}, Lcom/appsflyer/internal/AFh1fSDK;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Lcom/appsflyer/internal/AFh1pSDK;->unregisterClient()Lcom/appsflyer/internal/AFh1pSDK;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 82
    .line 83
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->w()Lcom/appsflyer/internal/AFf1aSDK;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-interface {p0, p1}, Lcom/appsflyer/internal/AFf1aSDK;->d(Lcom/appsflyer/internal/AFh1pSDK;)V

    .line 88
    .line 89
    .line 90
    :cond_3
    return-void

    .line 91
    :cond_4
    :goto_1
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 92
    .line 93
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->enableTCFDataCollection()Lcom/appsflyer/internal/AFa1qSDK;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    const-string p1, "performDeepLinking was called with null or empty url"

    .line 98
    .line 99
    sget-object p2, Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;->DEVELOPER_ERROR:Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;

    .line 100
    .line 101
    invoke-virtual {p0, p1, p2}, Lcom/appsflyer/internal/AFa1qSDK;->d(Ljava/lang/String;Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;)V

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method public final registerConversionListener(Lcom/appsflyer/share/AppsFlyerConversionListener;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    new-array v1, v1, [Ljava/lang/String;

    .line 9
    .line 10
    const-string v2, "registerConversionListener"

    .line 11
    .line 12
    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 16
    .line 17
    invoke-interface {p0, p1}, Lcom/appsflyer/internal/AFc1bSDK;->registerClient(Lcom/appsflyer/share/AppsFlyerConversionListener;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final registerSessionReadyListener(Lcom/appsflyer/share/SessionReadyListener;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "listener"

    .line 8
    .line 9
    filled-new-array {v1}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "registerSessionReadyListener"

    .line 14
    .line 15
    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 19
    .line 20
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setAppInviteOneLink()Lcom/appsflyer/internal/AFj1wSDK;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-interface {p0, p1}, Lcom/appsflyer/internal/AFj1wSDK;->d(Lcom/appsflyer/share/SessionReadyListener;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final sendInAppPurchaseData(Landroid/content/Context;Ljava/util/Map;Lcom/appsflyer/PurchaseHandler$PurchaseValidationCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/appsflyer/PurchaseHandler$PurchaseValidationCallback;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 12
    .line 13
    :cond_0
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 14
    .line 15
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->v()Lcom/appsflyer/PurchaseHandler;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const-string p1, "purchases"

    .line 20
    .line 21
    filled-new-array {p1}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0, p2, p3, p1}, Lcom/appsflyer/PurchaseHandler;->registerClient(Ljava/util/Map;Lcom/appsflyer/PurchaseHandler$PurchaseValidationCallback;[Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    new-instance p1, Lcom/appsflyer/internal/AFe1gSDK;

    .line 32
    .line 33
    iget-object v0, p0, Lcom/appsflyer/PurchaseHandler;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    .line 34
    .line 35
    invoke-direct {p1, p2, p3, v0}, Lcom/appsflyer/internal/AFe1gSDK;-><init>(Ljava/util/Map;Lcom/appsflyer/PurchaseHandler$PurchaseValidationCallback;Lcom/appsflyer/internal/AFc1bSDK;)V

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Lcom/appsflyer/PurchaseHandler;->unregisterClient:Lcom/appsflyer/internal/AFe1wSDK;

    .line 39
    .line 40
    invoke-virtual {p0, p1}, Lcom/appsflyer/internal/AFe1wSDK;->d(Lcom/appsflyer/internal/AFe1ySDK;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method public final sendPurchaseData(Landroid/content/Context;Ljava/util/Map;Lcom/appsflyer/PurchaseHandler$PurchaseValidationCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/appsflyer/PurchaseHandler$PurchaseValidationCallback;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 12
    .line 13
    :cond_0
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 14
    .line 15
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->v()Lcom/appsflyer/PurchaseHandler;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const-string p1, "subscriptions"

    .line 20
    .line 21
    filled-new-array {p1}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0, p2, p3, p1}, Lcom/appsflyer/PurchaseHandler;->registerClient(Ljava/util/Map;Lcom/appsflyer/PurchaseHandler$PurchaseValidationCallback;[Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    new-instance p1, Lcom/appsflyer/internal/AFe1tSDK;

    .line 32
    .line 33
    iget-object v0, p0, Lcom/appsflyer/PurchaseHandler;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    .line 34
    .line 35
    invoke-direct {p1, p2, p3, v0}, Lcom/appsflyer/internal/AFe1tSDK;-><init>(Ljava/util/Map;Lcom/appsflyer/PurchaseHandler$PurchaseValidationCallback;Lcom/appsflyer/internal/AFc1bSDK;)V

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Lcom/appsflyer/PurchaseHandler;->unregisterClient:Lcom/appsflyer/internal/AFe1wSDK;

    .line 39
    .line 40
    invoke-virtual {p0, p1}, Lcom/appsflyer/internal/AFe1wSDK;->d(Lcom/appsflyer/internal/AFe1ySDK;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method public final sendPushNotificationData(Landroid/app/Activity;)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "c"

    .line 4
    .line 5
    const-string v2, "pid"

    .line 6
    .line 7
    const-string v3, "sendPushNotificationData"

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual/range {p1 .. p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    iget-object v4, v1, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 18
    .line 19
    invoke-interface {v4}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual/range {p1 .. p1}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    new-instance v6, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v7, "activity_intent_"

    .line 30
    .line 31
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual/range {p1 .. p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    filled-new-array {v5, v6}, [Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-interface {v4, v3, v5}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iget-object v4, v1, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 58
    .line 59
    if-eqz p1, :cond_1

    .line 60
    .line 61
    invoke-interface {v4}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-virtual/range {p1 .. p1}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    const-string v6, "activity_intent_null"

    .line 70
    .line 71
    filled-new-array {v5, v6}, [Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-interface {v4, v3, v5}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    invoke-interface {v4}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    const-string v5, "activity_null"

    .line 84
    .line 85
    filled-new-array {v5}, [Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    invoke-interface {v4, v3, v5}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    :goto_0
    iget-object v3, v1, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 93
    .line 94
    invoke-interface {v3}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-static/range {p1 .. p1}, Lcom/appsflyer/internal/AFa1tSDK;->registerClient(Landroid/app/Activity;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    iput-object v4, v3, Lcom/appsflyer/internal/AFc1eSDK;->unregisterClient:Ljava/lang/String;

    .line 103
    .line 104
    if-eqz v4, :cond_8

    .line 105
    .line 106
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 107
    .line 108
    .line 109
    move-result-wide v4

    .line 110
    iget-object v6, v1, Lcom/appsflyer/internal/AFa1tSDK;->w:Ljava/util/Map;

    .line 111
    .line 112
    const-string v7, ")"

    .line 113
    .line 114
    if-nez v6, :cond_2

    .line 115
    .line 116
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 117
    .line 118
    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->ENGAGEMENT:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 119
    .line 120
    const-string v6, "Initializing push notification history cache"

    .line 121
    .line 122
    invoke-virtual {v0, v2, v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 126
    .line 127
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 128
    .line 129
    .line 130
    iput-object v0, v1, Lcom/appsflyer/internal/AFa1tSDK;->w:Ljava/util/Map;

    .line 131
    .line 132
    move-wide v10, v4

    .line 133
    move-wide/from16 v16, v10

    .line 134
    .line 135
    goto/16 :goto_3

    .line 136
    .line 137
    :cond_2
    :try_start_0
    iget-object v6, v1, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 138
    .line 139
    invoke-interface {v6}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    const-string v8, "AF_PUSH_PAYLOAD_MAX_AGING_MILLIS"

    .line 144
    .line 145
    const-wide/32 v9, 0x1b7740

    .line 146
    .line 147
    .line 148
    invoke-virtual {v6, v8, v9, v10}, Lcom/appsflyer/internal/AFc1iSDK;->unregisterClient(Ljava/lang/String;J)J

    .line 149
    .line 150
    .line 151
    move-result-wide v8

    .line 152
    iget-object v6, v1, Lcom/appsflyer/internal/AFa1tSDK;->w:Ljava/util/Map;

    .line 153
    .line 154
    invoke-interface {v6}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 162
    move-wide v10, v4

    .line 163
    :goto_1
    :try_start_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v12

    .line 167
    if-eqz v12, :cond_6

    .line 168
    .line 169
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v12

    .line 173
    check-cast v12, Ljava/lang/Long;

    .line 174
    .line 175
    new-instance v13, Lorg/json/JSONObject;

    .line 176
    .line 177
    iget-object v14, v3, Lcom/appsflyer/internal/AFc1eSDK;->unregisterClient:Ljava/lang/String;

    .line 178
    .line 179
    invoke-direct {v13, v14}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    new-instance v14, Lorg/json/JSONObject;

    .line 183
    .line 184
    iget-object v15, v1, Lcom/appsflyer/internal/AFa1tSDK;->w:Ljava/util/Map;

    .line 185
    .line 186
    invoke-interface {v15, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v15

    .line 190
    check-cast v15, Ljava/lang/String;

    .line 191
    .line 192
    invoke-direct {v14, v15}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v13, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v15
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 199
    move-wide/from16 v16, v4

    .line 200
    .line 201
    :try_start_2
    invoke-virtual {v14, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    invoke-virtual {v15, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    if-eqz v4, :cond_3

    .line 210
    .line 211
    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    invoke-virtual {v14, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    if-eqz v4, :cond_3

    .line 224
    .line 225
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 226
    .line 227
    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->ENGAGEMENT:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 228
    .line 229
    new-instance v4, Ljava/lang/StringBuilder;

    .line 230
    .line 231
    const-string v5, "Push notification already processed: duplicate PID and campaign detected (old: "

    .line 232
    .line 233
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    const-string v5, ", new: "

    .line 240
    .line 241
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    invoke-virtual {v0, v2, v4}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    const/4 v0, 0x0

    .line 258
    iput-object v0, v3, Lcom/appsflyer/internal/AFc1eSDK;->unregisterClient:Ljava/lang/String;

    .line 259
    .line 260
    return-void

    .line 261
    :catchall_0
    move-exception v0

    .line 262
    goto :goto_2

    .line 263
    :cond_3
    invoke-virtual {v12}, Ljava/lang/Number;->longValue()J

    .line 264
    .line 265
    .line 266
    move-result-wide v4

    .line 267
    sub-long v4, v16, v4

    .line 268
    .line 269
    cmp-long v4, v4, v8

    .line 270
    .line 271
    if-lez v4, :cond_4

    .line 272
    .line 273
    iget-object v4, v1, Lcom/appsflyer/internal/AFa1tSDK;->w:Ljava/util/Map;

    .line 274
    .line 275
    invoke-interface {v4, v12}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    :cond_4
    invoke-virtual {v12}, Ljava/lang/Number;->longValue()J

    .line 279
    .line 280
    .line 281
    move-result-wide v4

    .line 282
    cmp-long v4, v4, v10

    .line 283
    .line 284
    if-gtz v4, :cond_5

    .line 285
    .line 286
    invoke-virtual {v12}, Ljava/lang/Number;->longValue()J

    .line 287
    .line 288
    .line 289
    move-result-wide v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 290
    :cond_5
    move-wide/from16 v4, v16

    .line 291
    .line 292
    goto/16 :goto_1

    .line 293
    .line 294
    :catchall_1
    move-exception v0

    .line 295
    move-wide/from16 v16, v4

    .line 296
    .line 297
    goto :goto_2

    .line 298
    :cond_6
    move-wide/from16 v16, v4

    .line 299
    .line 300
    goto :goto_3

    .line 301
    :catchall_2
    move-exception v0

    .line 302
    move-wide/from16 v16, v4

    .line 303
    .line 304
    move-wide/from16 v10, v16

    .line 305
    .line 306
    :goto_2
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 307
    .line 308
    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->ENGAGEMENT:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 309
    .line 310
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    move-result-object v5

    .line 314
    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v5

    .line 318
    const-string v6, "Error while handling push notification measurement: "

    .line 319
    .line 320
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v5

    .line 324
    invoke-virtual {v2, v4, v5, v0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 325
    .line 326
    .line 327
    :goto_3
    iget-object v0, v1, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 328
    .line 329
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    const-string v2, "AF_PUSH_PAYLOAD_HISTORY_SIZE"

    .line 334
    .line 335
    const-wide/16 v4, 0x2

    .line 336
    .line 337
    invoke-virtual {v0, v2, v4, v5}, Lcom/appsflyer/internal/AFc1iSDK;->unregisterClient(Ljava/lang/String;J)J

    .line 338
    .line 339
    .line 340
    move-result-wide v4

    .line 341
    iget-object v0, v1, Lcom/appsflyer/internal/AFa1tSDK;->w:Ljava/util/Map;

    .line 342
    .line 343
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 344
    .line 345
    .line 346
    move-result v0

    .line 347
    int-to-long v8, v0

    .line 348
    cmp-long v0, v8, v4

    .line 349
    .line 350
    if-nez v0, :cond_7

    .line 351
    .line 352
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 353
    .line 354
    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->ENGAGEMENT:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 355
    .line 356
    new-instance v4, Ljava/lang/StringBuilder;

    .line 357
    .line 358
    const-string v5, "Push history limit reached, removing oldest entry (timestamp: "

    .line 359
    .line 360
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v4, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v4

    .line 373
    invoke-virtual {v0, v2, v4}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    iget-object v0, v1, Lcom/appsflyer/internal/AFa1tSDK;->w:Ljava/util/Map;

    .line 377
    .line 378
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    :cond_7
    iget-object v0, v1, Lcom/appsflyer/internal/AFa1tSDK;->w:Ljava/util/Map;

    .line 386
    .line 387
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    iget-object v3, v3, Lcom/appsflyer/internal/AFc1eSDK;->unregisterClient:Ljava/lang/String;

    .line 392
    .line 393
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v1}, Lcom/appsflyer/internal/AFa1tSDK;->start()V

    .line 397
    .line 398
    .line 399
    :cond_8
    return-void
.end method

.method public final sendPushNotificationData(Lcom/appsflyer/share/AFPushData;)V
    .locals 4

    .line 400
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 401
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    .line 402
    iget-boolean v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->setUserFirstName:Z

    .line 403
    const-string v1, "sendPushNotificationData"

    if-nez v0, :cond_0

    .line 404
    invoke-static {v1}, Lcom/appsflyer/internal/AFa1tSDK;->d(Ljava/lang/String;)V

    return-void

    .line 405
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 406
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v0

    const-string v2, "push_data:"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 407
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->ATTRIBUTION:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v2, "Received campaign details from push"

    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 408
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 409
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setUserPhone()Lcom/appsflyer/internal/AFa1lSDK;

    move-result-object v0

    invoke-interface {v0}, Lcom/appsflyer/internal/AFa1lSDK;->registerClient()V

    .line 410
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 411
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    invoke-virtual {p1}, Lcom/appsflyer/share/AFPushData;->toJson()Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    .line 412
    iput-object p1, v0, Lcom/appsflyer/internal/AFc1eSDK;->unregisterClient:Ljava/lang/String;

    .line 413
    new-instance p1, Lcom/appsflyer/internal/AFh1fSDK;

    invoke-direct {p1}, Lcom/appsflyer/internal/AFh1fSDK;-><init>()V

    .line 414
    invoke-virtual {p1}, Lcom/appsflyer/internal/AFh1pSDK;->unregisterClient()Lcom/appsflyer/internal/AFh1pSDK;

    move-result-object p1

    .line 415
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 416
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->w()Lcom/appsflyer/internal/AFf1aSDK;

    move-result-object p0

    invoke-interface {p0, p1}, Lcom/appsflyer/internal/AFf1aSDK;->d(Lcom/appsflyer/internal/AFh1pSDK;)V

    return-void
.end method

.method public final setAdditionalData(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    filled-new-array {v1}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "setAdditionalData"

    .line 18
    .line 19
    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance v0, Lorg/json/JSONObject;

    .line 23
    .line 24
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 28
    .line 29
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lcom/appsflyer/internal/AFc1eSDK;->getSdkVersion:Ljava/lang/String;

    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method public final setAndroidIdData(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "setAndroidIdData"

    .line 8
    .line 9
    filled-new-array {p1}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-interface {v0, v1, v2}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 17
    .line 18
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    iput-object p1, p0, Lcom/appsflyer/internal/AFc1eSDK;->force:Ljava/lang/String;

    .line 23
    .line 24
    return-void
.end method

.method public final setAppId(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "setAppId"

    .line 8
    .line 9
    filled-new-array {p1}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-interface {v0, v1, v2}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 17
    .line 18
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    iput-object p1, p0, Lcom/appsflyer/internal/AFc1eSDK;->values:Ljava/lang/String;

    .line 23
    .line 24
    return-void
.end method

.method public final setAppInviteOneLink(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "setAppInviteOneLink"

    .line 8
    .line 9
    filled-new-array {p1}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-interface {v0, v1, v2}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 17
    .line 18
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_SETTERS:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 19
    .line 20
    const-string v2, "setAppInviteOneLink = "

    .line 21
    .line 22
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 36
    .line 37
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->AppsFlyerLib:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 50
    .line 51
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->registerClient()Lcom/appsflyer/AppsFlyerProperties;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const-string v1, "onelinkDomain"

    .line 56
    .line 57
    invoke-interface {v0, v1}, Lcom/appsflyer/AppsFlyerProperties;->remove(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const-string v1, "onelinkVersion"

    .line 61
    .line 62
    invoke-interface {v0, v1}, Lcom/appsflyer/AppsFlyerProperties;->remove(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const-string v1, "onelinkScheme"

    .line 66
    .line 67
    invoke-interface {v0, v1}, Lcom/appsflyer/AppsFlyerProperties;->remove(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 71
    .line 72
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    iput-object p1, p0, Lcom/appsflyer/internal/AFc1eSDK;->AppsFlyerLib:Ljava/lang/String;

    .line 77
    .line 78
    return-void
.end method

.method public final setCollectAndroidID(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    filled-new-array {v1}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "setCollectAndroidID"

    .line 16
    .line 17
    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 21
    .line 22
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    iput-boolean p1, p0, Lcom/appsflyer/internal/AFc1eSDK;->afWarnLog:Z

    .line 27
    .line 28
    return-void
.end method

.method public final setConsentData(Lcom/appsflyer/share/AppsFlyerConsent;)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 5
    .line 6
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    iput-object p1, p0, Lcom/appsflyer/internal/AFc1eSDK;->setImeiData:Lcom/appsflyer/share/AppsFlyerConsent;

    .line 11
    .line 12
    return-void
.end method

.method public final setCurrencyCode(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "setCurrencyCode"

    .line 8
    .line 9
    filled-new-array {p1}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-interface {v0, v1, v2}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 17
    .line 18
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    iput-object p1, p0, Lcom/appsflyer/internal/AFc1eSDK;->stop:Ljava/lang/String;

    .line 23
    .line 24
    return-void
.end method

.method public final setCustomerUserId(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "setCustomerUserId"

    .line 8
    .line 9
    filled-new-array {p1}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-interface {v0, v1, v2}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 17
    .line 18
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 19
    .line 20
    const-string v2, "setCustomerUserId = "

    .line 21
    .line 22
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 34
    .line 35
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    iput-object p1, p0, Lcom/appsflyer/internal/AFc1eSDK;->valueOf:Ljava/lang/String;

    .line 40
    .line 41
    return-void
.end method

.method public final setDebugLog(Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lcom/appsflyer/AFLogger$LogLevel;->DEBUG:Lcom/appsflyer/AFLogger$LogLevel;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object p1, Lcom/appsflyer/AFLogger$LogLevel;->NONE:Lcom/appsflyer/AFLogger$LogLevel;

    .line 7
    .line 8
    :goto_0
    invoke-virtual {p0, p1}, Lcom/appsflyer/internal/AFa1tSDK;->setLogLevel(Lcom/appsflyer/AFLogger$LogLevel;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setDeepLinkTimeout(J)V
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-gtz v0, :cond_0

    .line 6
    .line 7
    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 8
    .line 9
    sget-object p2, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 10
    .line 11
    const-string v0, "Invalid timeout value. Using default value of 3000 milliseconds"

    .line 12
    .line 13
    invoke-virtual {p1, p2, v0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-wide/16 p1, 0xbb8

    .line 17
    .line 18
    :cond_0
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 19
    .line 20
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 21
    .line 22
    new-instance v2, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v3, "Setting DeepLink timeout to  "

    .line 25
    .line 26
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v3, " milliseconds"

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 45
    .line 46
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->enableTCFDataCollection()Lcom/appsflyer/internal/AFa1qSDK;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    iput-wide p1, p0, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper:J

    .line 51
    .line 52
    return-void
.end method

.method public final setDisableAdvertisingIdentifiers(Z)V
    .locals 4

    .line 1
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 2
    .line 3
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_SETTERS:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 4
    .line 5
    const-string v2, "setDisableAdvertisingIdentifiers: "

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    xor-int/lit8 v0, p1, 0x1

    .line 19
    .line 20
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Lcom/appsflyer/internal/AFb1iSDK;->unregisterClient:Ljava/lang/Boolean;

    .line 25
    .line 26
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 27
    .line 28
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iput-boolean p1, v1, Lcom/appsflyer/internal/AFc1eSDK;->setAndroidIdData:Z

    .line 33
    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    const/4 p1, 0x0

    .line 41
    iput-object p1, p0, Lcom/appsflyer/internal/AFc1eSDK;->updateServerUninstallToken:Lcom/appsflyer/internal/AFh1qSDK;

    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->afWarnLog()Lcom/appsflyer/internal/AFe1wSDK;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    new-instance v0, Lcom/appsflyer/internal/AFe1iSDK;

    .line 49
    .line 50
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 51
    .line 52
    invoke-direct {v0, p0}, Lcom/appsflyer/internal/AFe1iSDK;-><init>(Lcom/appsflyer/internal/AFc1bSDK;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v0}, Lcom/appsflyer/internal/AFe1wSDK;->d(Lcom/appsflyer/internal/AFe1ySDK;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final setDisableNetworkData(Z)V
    .locals 4

    .line 1
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 2
    .line 3
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_SETTERS:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 4
    .line 5
    const-string v2, "setDisableNetworkData: "

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 19
    .line 20
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    iput-boolean p1, p0, Lcom/appsflyer/internal/AFc1eSDK;->afErrorLog:Z

    .line 25
    .line 26
    return-void
.end method

.method public final setHost(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p2, :cond_2

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    if-eqz p1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const-string p0, ""

    .line 22
    .line 23
    :goto_0
    new-instance p1, Lcom/appsflyer/internal/AFd1gSDK;

    .line 24
    .line 25
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-direct {p1, p0, p2}, Lcom/appsflyer/internal/AFd1gSDK;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-static {p1}, Lcom/appsflyer/internal/AFd1jSDK;->AFLogger(Lcom/appsflyer/internal/AFd1gSDK;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_2
    :goto_1
    sget-object p0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 37
    .line 38
    sget-object p1, Lcom/appsflyer/sdk_base/logger/LogTag;->HTTP_CLIENT:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 39
    .line 40
    const-string p2, "setHost call ignored: hostname parameter is empty or null"

    .line 41
    .line 42
    invoke-virtual {p0, p1, p2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final setImeiData(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "setImeiData"

    .line 8
    .line 9
    filled-new-array {p1}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-interface {v0, v1, v2}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 17
    .line 18
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    iput-object p1, p0, Lcom/appsflyer/internal/AFc1eSDK;->AFLoggerLogLevel:Ljava/lang/String;

    .line 23
    .line 24
    return-void
.end method

.method public final setInstallId(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    new-array v2, v1, [Ljava/lang/String;

    .line 9
    .line 10
    const-string v3, "setInstallId"

    .line 11
    .line 12
    invoke-interface {v0, v3, v2}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 16
    .line 17
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-boolean v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->setUserFirstName:Z

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    sget-object p0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 26
    .line 27
    sget-object p1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 28
    .line 29
    const-string v0, "AppsFlyerLib.init() method should be called first"

    .line 30
    .line 31
    invoke-virtual {p0, p1, v0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 36
    .line 37
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const-string v2, "APPSFLYER_ALLOW_CUSTOM_INSTALL_ID"

    .line 42
    .line 43
    invoke-virtual {v0, v2}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    :cond_1
    if-nez v1, :cond_2

    .line 54
    .line 55
    sget-object p0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 56
    .line 57
    sget-object p1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 58
    .line 59
    const-string v0, "APPSFLYER_ALLOW_CUSTOM_INSTALL_ID Manifest flag should be set to true first"

    .line 60
    .line 61
    invoke-virtual {p0, p1, v0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    if-nez p1, :cond_3

    .line 66
    .line 67
    sget-object p0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 68
    .line 69
    sget-object p1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 70
    .line 71
    const-string v0, "AppsFlyer installId can\'t be null"

    .line 72
    .line 73
    invoke-virtual {p0, p1, v0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_3
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 78
    .line 79
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-static {p1, p0}, Lcom/appsflyer/internal/AFb1jSDK;->d(Ljava/lang/String;Lcom/appsflyer/internal/AFc1kSDK;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public final setIsUpdate(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    filled-new-array {v1}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "setIsUpdate"

    .line 16
    .line 17
    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 21
    .line 22
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    iput-boolean p1, p0, Lcom/appsflyer/internal/AFc1eSDK;->getEntries:Z

    .line 27
    .line 28
    return-void
.end method

.method public final setLogLevel(Lcom/appsflyer/AFLogger$LogLevel;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/appsflyer/AFLogger$LogLevel;->getLevel()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-object v1, Lcom/appsflyer/AFLogger$LogLevel;->NONE:Lcom/appsflyer/AFLogger$LogLevel;

    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/appsflyer/AFLogger$LogLevel;->getLevel()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-le v0, v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 17
    .line 18
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    filled-new-array {v2}, [Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const-string v3, "log"

    .line 31
    .line 32
    invoke-interface {v1, v3, v2}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 36
    .line 37
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iput-object p1, v1, Lcom/appsflyer/internal/AFc1eSDK;->enableTCFDataCollection:Lcom/appsflyer/AFLogger$LogLevel;

    .line 42
    .line 43
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 44
    .line 45
    if-nez v0, :cond_1

    .line 46
    .line 47
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setDebugLog()Lcom/appsflyer/internal/AFh1wSDK;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-interface {p0}, Lcom/appsflyer/internal/AFh1wSDK;->AFKeystoreWrapper()V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setDebugLog()Lcom/appsflyer/internal/AFh1wSDK;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-interface {p0}, Lcom/appsflyer/internal/AFh1wSDK;->e()V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final setMinTimeBetweenSessions(I)V
    .locals 3

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 8
    .line 9
    int-to-long v1, p1

    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iput-wide v0, p0, Lcom/appsflyer/internal/AFc1eSDK;->setDebugLog:J

    .line 15
    .line 16
    return-void
.end method

.method public final setOaidData(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "setOaidData"

    .line 8
    .line 9
    filled-new-array {p1}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {p0, v0, v1}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sput-object p1, Lcom/appsflyer/internal/AFb1iSDK;->AFLogger:Ljava/lang/String;

    .line 17
    .line 18
    return-void
.end method

.method public final varargs setOneLinkCustomDomain([Ljava/lang/String;)V
    .locals 5

    .line 1
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 2
    .line 3
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 4
    .line 5
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    new-instance v3, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v4, "setOneLinkCustomDomain "

    .line 14
    .line 15
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 29
    .line 30
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->enableTCFDataCollection()Lcom/appsflyer/internal/AFa1qSDK;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    iput-object p1, p0, Lcom/appsflyer/internal/AFa1qSDK;->force:[Ljava/lang/String;

    .line 35
    .line 36
    return-void
.end method

.method public final setOutOfStore(Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 10
    .line 11
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    iput-object p1, p0, Lcom/appsflyer/internal/AFc1eSDK;->getLevel:Ljava/lang/String;

    .line 16
    .line 17
    sget-object p0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 18
    .line 19
    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_SETTERS:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 20
    .line 21
    const-string v1, "Store API set with value: "

    .line 22
    .line 23
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p0, v0, p1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    sget-object p0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 36
    .line 37
    sget-object p1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 38
    .line 39
    const-string v0, "Cannot set setOutOfStore with null"

    .line 40
    .line 41
    invoke-virtual {p0, p1, v0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final setPartnerData(Ljava/lang/String;Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1eSDK;->v:Lcom/appsflyer/internal/AFb1qSDK;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lcom/appsflyer/internal/AFb1qSDK;

    .line 12
    .line 13
    invoke-direct {v0}, Lcom/appsflyer/internal/AFb1qSDK;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1eSDK;->v:Lcom/appsflyer/internal/AFb1qSDK;

    .line 17
    .line 18
    :cond_0
    if-eqz p1, :cond_6

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    goto/16 :goto_2

    .line 27
    .line 28
    :cond_1
    if-eqz p2, :cond_4

    .line 29
    .line 30
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_2

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    sget-object p0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 38
    .line 39
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->PUBLIC_API:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 40
    .line 41
    new-instance v2, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v3, "Setting partner data for "

    .line 44
    .line 45
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v3, ": "

    .line 52
    .line 53
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {p0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    new-instance v2, Lorg/json/JSONObject;

    .line 67
    .line 68
    invoke-direct {v2, p2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    const/16 v3, 0x3e8

    .line 80
    .line 81
    if-le v2, v3, :cond_3

    .line 82
    .line 83
    const-string p2, "Partner data 1000 characters limit exceeded"

    .line 84
    .line 85
    invoke-virtual {p0, v1, p2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    new-instance p0, Ljava/util/HashMap;

    .line 89
    .line 90
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 91
    .line 92
    .line 93
    const-string p2, "limit exceeded: "

    .line 94
    .line 95
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {p2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    const-string v1, "error"

    .line 104
    .line 105
    invoke-virtual {p0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    iget-object p2, v0, Lcom/appsflyer/internal/AFb1qSDK;->AFKeystoreWrapper:Ljava/util/Map;

    .line 109
    .line 110
    invoke-interface {p2, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_3
    iget-object p0, v0, Lcom/appsflyer/internal/AFb1qSDK;->d:Ljava/util/Map;

    .line 115
    .line 116
    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    iget-object p0, v0, Lcom/appsflyer/internal/AFb1qSDK;->AFKeystoreWrapper:Ljava/util/Map;

    .line 120
    .line 121
    invoke-interface {p0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :cond_4
    :goto_0
    sget-object p0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 126
    .line 127
    sget-object p2, Lcom/appsflyer/sdk_base/logger/LogTag;->PUBLIC_API:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 128
    .line 129
    iget-object v0, v0, Lcom/appsflyer/internal/AFb1qSDK;->d:Ljava/util/Map;

    .line 130
    .line 131
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    if-nez v0, :cond_5

    .line 136
    .line 137
    const-string p1, "Partner data is missing or null"

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_5
    const-string v0, "Cleared partner data for "

    .line 141
    .line 142
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    :goto_1
    invoke-virtual {p0, p2, p1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :cond_6
    :goto_2
    sget-object p0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 151
    .line 152
    sget-object p1, Lcom/appsflyer/sdk_base/logger/LogTag;->PUBLIC_API:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 153
    .line 154
    const-string p2, "Partner ID is missing or null"

    .line 155
    .line 156
    invoke-virtual {p0, p1, p2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    return-void
.end method

.method public final setPluginInfo(Lcom/appsflyer/share/platform_extension/PluginInfo;)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 5
    .line 6
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->onPause()Lcom/appsflyer/internal/AFj1cSDK;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p0, p1}, Lcom/appsflyer/internal/AFj1cSDK;->registerClient(Lcom/appsflyer/share/platform_extension/PluginInfo;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setPreinstallAttribution(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 2
    .line 3
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->PREINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 4
    .line 5
    const-string v2, "setPreinstallAttribution API called"

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance v2, Lorg/json/JSONObject;

    .line 11
    .line 12
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v3, "pid"

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    :try_start_0
    invoke-virtual {v2, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-exception p1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    :goto_0
    if-eqz p2, :cond_1

    .line 26
    .line 27
    const-string p1, "c"

    .line 28
    .line 29
    invoke-virtual {v2, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 30
    .line 31
    .line 32
    :cond_1
    if-eqz p3, :cond_3

    .line 33
    .line 34
    const-string p1, "af_siteid"

    .line 35
    .line 36
    invoke-virtual {v2, p1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    goto :goto_3

    .line 40
    :goto_1
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 41
    .line 42
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->PREINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    if-eqz p2, :cond_2

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    goto :goto_2

    .line 55
    :cond_2
    const-string p2, "Failed to serialize preinstall attribution parameters"

    .line 56
    .line 57
    :goto_2
    invoke-virtual {v0, v1, p2, p1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    :cond_3
    :goto_3
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_4

    .line 65
    .line 66
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 67
    .line 68
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->registerClient()Lcom/appsflyer/AppsFlyerProperties;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    const-string p1, "preInstallName"

    .line 73
    .line 74
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    invoke-interface {p0, p1, p2}, Lcom/appsflyer/AppsFlyerProperties;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_4
    const-string p0, "Preinstall attribution rejected: media source parameter is required"

    .line 83
    .line 84
    invoke-virtual {v0, v1, p0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public final varargs setResolveDeepLinkURLs([Ljava/lang/String;)V
    .locals 5

    .line 1
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 2
    .line 3
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 4
    .line 5
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    new-instance v3, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v4, "setResolveDeepLinkURLs "

    .line 14
    .line 15
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 29
    .line 30
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->enableTCFDataCollection()Lcom/appsflyer/internal/AFa1qSDK;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1qSDK;->w:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 37
    .line 38
    .line 39
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1qSDK;->w:Ljava/util/List;

    .line 40
    .line 41
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-interface {p0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final varargs setSharingFilterForPartners([Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance v0, Lcom/appsflyer/internal/AFb1rSDK;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Lcom/appsflyer/internal/AFb1rSDK;-><init>([Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1eSDK;->w:Lcom/appsflyer/internal/AFb1rSDK;

    .line 13
    .line 14
    return-void
.end method

.method public final setUserEmail(Ljava/lang/String;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 4
    .line 5
    sget-object p1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 6
    .line 7
    const-string v0, "setUserEmail called with null email"

    .line 8
    .line 9
    invoke-virtual {p0, p1, v0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 14
    .line 15
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x0

    .line 20
    new-array v1, v1, [Ljava/lang/String;

    .line 21
    .line 22
    const-string v2, "setUserEmail"

    .line 23
    .line 24
    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 28
    .line 29
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, Lcom/appsflyer/internal/AFj1jSDK;->AFKeystoreWrapper(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 39
    .line 40
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {p1}, Lcom/appsflyer/internal/AFj1nSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, Lcom/appsflyer/internal/AFc1eSDK;->AFLogger:Ljava/lang/String;

    .line 49
    .line 50
    return-void
.end method

.method public final setUserFbLoginId(J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    new-array v1, v1, [Ljava/lang/String;

    .line 9
    .line 10
    const-string v2, "setUserFbLoginId"

    .line 11
    .line 12
    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 16
    .line 17
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 23
    .line 24
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lcom/appsflyer/internal/AFc1eSDK;->i:Ljava/lang/Long;

    .line 33
    .line 34
    return-void
.end method

.method public final setUserFirstName(Ljava/lang/String;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 4
    .line 5
    sget-object p1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 6
    .line 7
    const-string v0, "setUserFirstName called with null firstName"

    .line 8
    .line 9
    invoke-virtual {p0, p1, v0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 14
    .line 15
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x0

    .line 20
    new-array v1, v1, [Ljava/lang/String;

    .line 21
    .line 22
    const-string v2, "setUserFirstName"

    .line 23
    .line 24
    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 28
    .line 29
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, Lcom/appsflyer/internal/AFj1jSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 39
    .line 40
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {p1}, Lcom/appsflyer/internal/AFj1nSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, Lcom/appsflyer/internal/AFc1eSDK;->AFKeystoreWrapper:Ljava/lang/String;

    .line 49
    .line 50
    return-void
.end method

.method public final setUserLastName(Ljava/lang/String;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 4
    .line 5
    sget-object p1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 6
    .line 7
    const-string v0, "setUserLastName called with null lastName"

    .line 8
    .line 9
    invoke-virtual {p0, p1, v0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 14
    .line 15
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x0

    .line 20
    new-array v1, v1, [Ljava/lang/String;

    .line 21
    .line 22
    const-string v2, "setUserLastName"

    .line 23
    .line 24
    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 28
    .line 29
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, Lcom/appsflyer/internal/AFj1jSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 39
    .line 40
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {p1}, Lcom/appsflyer/internal/AFj1nSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, Lcom/appsflyer/internal/AFc1eSDK;->e:Ljava/lang/String;

    .line 49
    .line 50
    return-void
.end method

.method public final setUserPhone(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 7
    .line 8
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    new-array v2, v1, [Ljava/lang/String;

    .line 14
    .line 15
    const-string v3, "setUserPhone"

    .line 16
    .line 17
    invoke-interface {v0, v3, v2}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 21
    .line 22
    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 23
    .line 24
    invoke-virtual {v0, v2, v3}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p1, p2}, Lcom/appsflyer/internal/AFj1jSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const/4 v2, 0x1

    .line 32
    new-array v2, v2, [C

    .line 33
    .line 34
    const/16 v3, 0x30

    .line 35
    .line 36
    aput-char v3, v2, v1

    .line 37
    .line 38
    invoke-static {v0, v2}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {p1, p2}, Lcom/appsflyer/internal/AFj1jSDK;->unregisterClient(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 47
    .line 48
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-static {v0}, Lcom/appsflyer/internal/AFj1nSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    iput-object p2, p0, Lcom/appsflyer/internal/AFc1eSDK;->d:Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {p1}, Lcom/appsflyer/internal/AFj1nSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iput-object p1, p0, Lcom/appsflyer/internal/AFc1eSDK;->registerClient:Ljava/lang/String;

    .line 63
    .line 64
    return-void

    .line 65
    :cond_1
    :goto_0
    sget-object p0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 66
    .line 67
    sget-object p1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 68
    .line 69
    const-string p2, "setUserPhone called with null argument"

    .line 70
    .line 71
    invoke-virtual {p0, p1, p2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public final start()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/appsflyer/internal/AFa1tSDK;->unregisterClient(Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final start(Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFa1tSDK;->unregisterClient(Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;)V

    return-void
.end method

.method public final stop(ZLandroid/content/Context;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    iput-object p2, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 12
    .line 13
    :cond_0
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 14
    .line 15
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->AppsFlyerLib()Lcom/appsflyer/internal/AFf1fSDK;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {p2, p1}, Lcom/appsflyer/internal/AFf1fSDK;->AFLogger(Z)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->d()Ljava/util/concurrent/ExecutorService;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    new-instance v0, Lcom/appsflyer/internal/g;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {v0, p0, v1}, Lcom/appsflyer/internal/g;-><init>(Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p2, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 33
    .line 34
    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const-string p1, "is_stop_tracking_used"

    .line 42
    .line 43
    invoke-interface {p0, p1, v1}, Lcom/appsflyer/internal/AFc1kSDK;->registerClient(Ljava/lang/String;Z)V

    .line 44
    .line 45
    .line 46
    :cond_1
    return-void
.end method

.method public final subscribeForDeepLink(Lcom/appsflyer/share/deeplink/DeepLinkListener;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->enableTCFDataCollection()Lcom/appsflyer/internal/AFa1qSDK;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iput-object p1, p0, Lcom/appsflyer/internal/AFa1qSDK;->unregisterClient:Lcom/appsflyer/share/deeplink/DeepLinkListener;

    .line 8
    .line 9
    return-void
.end method

.method public final unregisterConversionListener()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    new-array v1, v1, [Ljava/lang/String;

    .line 9
    .line 10
    const-string v2, "unregisterConversionListener"

    .line 11
    .line 12
    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-interface {p0, v0}, Lcom/appsflyer/internal/AFc1bSDK;->registerClient(Lcom/appsflyer/share/AppsFlyerConversionListener;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final unregisterSessionReadyListener()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    new-array v1, v1, [Ljava/lang/String;

    .line 9
    .line 10
    const-string v2, "unregisterSessionReadyListener"

    .line 11
    .line 12
    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 16
    .line 17
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setAppInviteOneLink()Lcom/appsflyer/internal/AFj1wSDK;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-interface {p0, v0}, Lcom/appsflyer/internal/AFj1wSDK;->d(Lcom/appsflyer/share/SessionReadyListener;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final updateServerUninstallToken(Landroid/content/Context;Ljava/lang/String;)V
    .locals 6

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 12
    .line 13
    :cond_0
    new-instance p0, Lcom/appsflyer/internal/AFg1vSDK;

    .line 14
    .line 15
    invoke-direct {p0}, Lcom/appsflyer/internal/AFg1vSDK;-><init>()V

    .line 16
    .line 17
    .line 18
    if-eqz p2, :cond_6

    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_1
    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 32
    .line 33
    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->UNINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 34
    .line 35
    const-string v1, "Firebase Refreshed Token = "

    .line 36
    .line 37
    invoke-virtual {v1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {p1, v0, v1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFg1vSDK;->d()Lcom/appsflyer/internal/AFg1sSDK;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    iget-object v0, p1, Lcom/appsflyer/internal/AFg1sSDK;->AFKeystoreWrapper:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_5

    .line 57
    .line 58
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 59
    .line 60
    .line 61
    move-result-wide v0

    .line 62
    if-eqz p1, :cond_4

    .line 63
    .line 64
    iget-wide v2, p1, Lcom/appsflyer/internal/AFg1sSDK;->unregisterClient:J

    .line 65
    .line 66
    sub-long v2, v0, v2

    .line 67
    .line 68
    const-wide/16 v4, 0x7d0

    .line 69
    .line 70
    cmp-long p1, v2, v4

    .line 71
    .line 72
    if-lez p1, :cond_3

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    const/4 p1, 0x0

    .line 76
    goto :goto_1

    .line 77
    :cond_4
    :goto_0
    const/4 p1, 0x1

    .line 78
    :goto_1
    new-instance v2, Lcom/appsflyer/internal/AFg1sSDK;

    .line 79
    .line 80
    xor-int/lit8 v3, p1, 0x1

    .line 81
    .line 82
    invoke-direct {v2, p2, v0, v1, v3}, Lcom/appsflyer/internal/AFg1sSDK;-><init>(Ljava/lang/String;JZ)V

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1vSDK;->registerClient:Lcom/appsflyer/internal/AFc1kSDK;

    .line 86
    .line 87
    const-string v1, "afUninstallToken"

    .line 88
    .line 89
    iget-object v3, v2, Lcom/appsflyer/internal/AFg1sSDK;->AFKeystoreWrapper:Ljava/lang/String;

    .line 90
    .line 91
    invoke-interface {v0, v1, v3}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1vSDK;->registerClient:Lcom/appsflyer/internal/AFc1kSDK;

    .line 95
    .line 96
    const-string v1, "afUninstallToken_received_time"

    .line 97
    .line 98
    iget-wide v3, v2, Lcom/appsflyer/internal/AFg1sSDK;->unregisterClient:J

    .line 99
    .line 100
    invoke-interface {v0, v1, v3, v4}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;J)V

    .line 101
    .line 102
    .line 103
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1vSDK;->registerClient:Lcom/appsflyer/internal/AFc1kSDK;

    .line 104
    .line 105
    const-string v0, "afUninstallToken_queued"

    .line 106
    .line 107
    iget-boolean v1, v2, Lcom/appsflyer/internal/AFg1sSDK;->AFLogger:Z

    .line 108
    .line 109
    invoke-interface {p0, v0, v1}, Lcom/appsflyer/internal/AFc1kSDK;->registerClient(Ljava/lang/String;Z)V

    .line 110
    .line 111
    .line 112
    if-eqz p1, :cond_5

    .line 113
    .line 114
    sget-object p0, Lcom/appsflyer/internal/AFa1tSDK;->d:Lcom/appsflyer/internal/AFa1tSDK;

    .line 115
    .line 116
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 117
    .line 118
    new-instance p1, Lcom/appsflyer/internal/AFf1qSDK;

    .line 119
    .line 120
    invoke-direct {p1, p2, p0}, Lcom/appsflyer/internal/AFf1qSDK;-><init>(Ljava/lang/String;Lcom/appsflyer/internal/AFc1bSDK;)V

    .line 121
    .line 122
    .line 123
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->afWarnLog()Lcom/appsflyer/internal/AFe1wSDK;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-virtual {p0, p1}, Lcom/appsflyer/internal/AFe1wSDK;->d(Lcom/appsflyer/internal/AFe1ySDK;)V

    .line 128
    .line 129
    .line 130
    :cond_5
    return-void

    .line 131
    :cond_6
    :goto_2
    sget-object p0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 132
    .line 133
    sget-object p1, Lcom/appsflyer/sdk_base/logger/LogTag;->UNINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 134
    .line 135
    const-string p2, "Firebase Token is either empty or null and was not registered."

    .line 136
    .line 137
    invoke-virtual {p0, p1, p2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    return-void
.end method

.method public final validateAndLogInAppPurchase(Lcom/appsflyer/share/AFPurchaseDetails;Ljava/util/Map;Lcom/appsflyer/share/AppsFlyerInAppPurchaseValidationCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/share/AFPurchaseDetails;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/appsflyer/share/AppsFlyerInAppPurchaseValidationCallback;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->afWarnLog()Lcom/appsflyer/internal/AFe1wSDK;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lcom/appsflyer/internal/AFe1eSDK;

    .line 8
    .line 9
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 10
    .line 11
    invoke-direct {v1, p0, p1, p2, p3}, Lcom/appsflyer/internal/AFe1eSDK;-><init>(Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/share/AFPurchaseDetails;Ljava/util/Map;Lcom/appsflyer/share/AppsFlyerInAppPurchaseValidationCallback;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/appsflyer/internal/AFe1wSDK;->d(Lcom/appsflyer/internal/AFe1ySDK;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
