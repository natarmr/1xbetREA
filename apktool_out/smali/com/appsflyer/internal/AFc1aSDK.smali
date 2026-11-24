.class public final Lcom/appsflyer/internal/AFc1aSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFc1bSDK;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/internal/AFc1aSDK$AFa1tSDK;
    }
.end annotation


# static fields
.field private static final registerClient:I


# instance fields
.field private AFKeystoreWrapper:Ljava/util/concurrent/ScheduledExecutorService;

.field private AFLogger:Ljava/util/concurrent/ExecutorService;

.field private AFLoggerLogLevel:Lcom/appsflyer/internal/AFh1xSDK;

.field private AppsFlyerLib:Lcom/appsflyer/internal/AFi1hSDK;

.field private afDebugLog:Lcom/appsflyer/internal/AFg1rSDK;

.field private afErrorLog:Lcom/appsflyer/AppsFlyerProperties;

.field private afInfoLog:Landroid/content/SharedPreferences;

.field private afWarnLog:Lcom/appsflyer/internal/AFf1aSDK;

.field private clearUserPii:Lcom/appsflyer/internal/AFf1eSDK;

.field public final d:Lcom/appsflyer/internal/AFd1zSDK;

.field private e:Lcom/appsflyer/internal/AFd1xSDK;

.field private enableTCFDataCollection:Lcom/appsflyer/sdk_base/logger/LoggerDelegate;

.field private force:Lcom/appsflyer/PurchaseHandler;

.field private getEntries:Lcom/appsflyer/internal/AFi1aSDK;

.field private getInstance:Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;

.field private getLevel:Lcom/appsflyer/internal/AFe1wSDK;

.field private getOutOfStore:Lcom/appsflyer/internal/AFh1sSDK;

.field private getSdkVersion:Lcom/appsflyer/internal/AFf1fSDK;

.field private i:Lcom/appsflyer/internal/AFc1gSDK;

.field private onPause:Lcom/appsflyer/internal/AFc1vSDK;

.field private sendPushNotificationData:Lcom/appsflyer/internal/AFf1bSDK;

.field private setAdditionalData:Lcom/appsflyer/internal/AFd1eSDK;

.field private setAndroidIdData:Lcom/appsflyer/internal/AFd1jSDK;

.field private setAppInviteOneLink:Lcom/appsflyer/internal/AFi1oSDK;

.field private setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

.field private setCustomerUserId:Lcom/appsflyer/internal/AFg1qSDK;

.field private setDebugLog:Lcom/appsflyer/internal/AFj1cSDK;

.field private setImeiData:Lcom/appsflyer/internal/AFj1mSDK;

.field private setOaidData:Lcom/appsflyer/internal/AFg1wSDK;

.field private volatile setOneLinkCustomDomain:Lcom/appsflyer/share/AppsFlyerConversionListener;

.field private setOutOfStore:Lcom/appsflyer/internal/AFh1wSDK;

.field private setResolveDeepLinkURLs:Lcom/appsflyer/internal/AFj1wSDK;

.field private setUserEmail:Lcom/appsflyer/internal/AFa1qSDK;

.field private setUserFbLoginId:Lcom/appsflyer/internal/AFa1lSDK;

.field private setUserFirstName:Lcom/appsflyer/internal/AFa1aSDK;

.field private setUserLastName:Lcom/appsflyer/internal/AFi1tSDK;

.field private setUserPhone:Lcom/appsflyer/internal/AFb1bSDK;

.field private stop:Lcom/appsflyer/exception_manager/ExceptionManager;

.field private unregisterClient:Ljava/util/concurrent/ExecutorService;

.field private updateServerUninstallToken:Lcom/appsflyer/internal/AFi1vSDK;

.field private v:Lcom/appsflyer/internal/AFf1hSDK;

.field private valueOf:Lcom/appsflyer/internal/AFj1ySDK;

.field private values:Lcom/appsflyer/internal/AFd1uSDK;

.field private w:Lcom/appsflyer/internal/AFc1iSDK;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x7530

    .line 2
    .line 3
    sput v0, Lcom/appsflyer/internal/AFc1aSDK;->registerClient:I

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/appsflyer/internal/AFd1zSDK;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/appsflyer/internal/AFd1zSDK;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setOneLinkCustomDomain:Lcom/appsflyer/share/AppsFlyerConversionListener;

    .line 13
    .line 14
    return-void
.end method

.method private static synthetic AFKeystoreWrapper(Ljava/lang/String;)Lkotlin/Unit;
    .locals 2

    .line 25
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->EXCEPTION_MANAGER:Lcom/appsflyer/sdk_base/logger/LogTag;

    invoke-virtual {v0, v1, p0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method private static synthetic AFLogger(Ljava/lang/Runnable;Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 6

    .line 43
    :try_start_0
    invoke-virtual {p1}, Ljava/util/concurrent/ThreadPoolExecutor;->getQueue()Ljava/util/concurrent/BlockingQueue;

    move-result-object p1

    invoke-interface {p1, p0}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object p0, v0

    move-object v3, p0

    .line 44
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v2, "Could not create executor for queue"

    invoke-virtual/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 45
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    return-void
.end method

.method public static synthetic a(Lcom/appsflyer/internal/AFc1aSDK;)Landroid/content/SharedPreferences;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1aSDK;->t_()Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Runnable;Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger(Ljava/lang/Runnable;Ljava/util/concurrent/ThreadPoolExecutor;)V

    return-void
.end method

.method public static synthetic c(Lcom/appsflyer/internal/AFc1aSDK;)Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1aSDK;->setAdditionalData()Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;

    move-result-object p0

    return-object p0
.end method

.method private declared-synchronized clearUserPii()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->AFKeystoreWrapper:Ljava/util/concurrent/ScheduledExecutorService;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-static {}, Lcom/appsflyer/internal/AFc1jSDK;->AFKeystoreWrapper()Ljava/util/concurrent/ScheduledExecutorService;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->AFKeystoreWrapper:Ljava/util/concurrent/ScheduledExecutorService;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    :goto_0
    monitor-exit p0

    .line 16
    return-object v0

    .line 17
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw v0
.end method

.method public static synthetic f()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lcom/appsflyer/internal/AFc1aSDK;->setResolveDeepLinkURLs()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g(Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFKeystoreWrapper(Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private declared-synchronized getOutOfStore()Lcom/appsflyer/internal/AFd1xSDK;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->e:Lcom/appsflyer/internal/AFd1xSDK;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/appsflyer/internal/AFd1xSDK;

    .line 7
    .line 8
    new-instance v1, Lcom/appsflyer/internal/AFd1mSDK;

    .line 9
    .line 10
    sget v2, Lcom/appsflyer/internal/AFc1aSDK;->registerClient:I

    .line 11
    .line 12
    invoke-direct {v1, v2}, Lcom/appsflyer/internal/AFd1mSDK;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->d()Ljava/util/concurrent/ExecutorService;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFd1xSDK;-><init>(Lcom/appsflyer/internal/AFd1mSDK;Ljava/util/concurrent/ExecutorService;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->e:Lcom/appsflyer/internal/AFd1xSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    :goto_0
    monitor-exit p0

    .line 28
    return-object v0

    .line 29
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    throw v0
.end method

.method private s_(Landroid/content/Context;)Landroid/content/SharedPreferences;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->afInfoLog:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskReads()Landroid/os/StrictMode$ThreadPolicy;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string v1, "appsflyer-data"

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lcom/appsflyer/internal/AFc1aSDK;->afInfoLog:Landroid/content/SharedPreferences;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 28
    .line 29
    .line 30
    throw p0

    .line 31
    :cond_0
    :goto_0
    iget-object p0, p0, Lcom/appsflyer/internal/AFc1aSDK;->afInfoLog:Landroid/content/SharedPreferences;

    .line 32
    .line 33
    return-object p0
.end method

.method private declared-synchronized sendPushNotificationData()Lcom/appsflyer/internal/AFj1mSDK;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setImeiData:Lcom/appsflyer/internal/AFj1mSDK;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/appsflyer/internal/AFj1mSDK;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFj1mSDK;-><init>(Lcom/appsflyer/internal/AFc1iSDK;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setImeiData:Lcom/appsflyer/internal/AFj1mSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    monitor-exit p0

    .line 21
    return-object v0

    .line 22
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw v0
.end method

.method private setAdditionalData()Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->i()Lcom/appsflyer/internal/AFf1hSDK;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Lcom/appsflyer/internal/AFf1hSDK;->unregisterClient:Lcom/appsflyer/internal/AFf1jSDK;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/appsflyer/internal/AFf1jSDK;->AFLogger:Lcom/appsflyer/internal/AFh1aSDK;

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    iget-object p0, p0, Lcom/appsflyer/internal/AFh1aSDK;->registerClient:Lcom/appsflyer/internal/AFh1gSDK;

    .line 12
    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p0, p0, Lcom/appsflyer/internal/AFh1gSDK;->d:Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method private declared-synchronized setCollectAndroidID()Lcom/appsflyer/internal/AFf1bSDK;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->sendPushNotificationData:Lcom/appsflyer/internal/AFf1bSDK;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/appsflyer/internal/AFf1bSDK;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFf1bSDK;-><init>(Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/internal/AFc1iSDK;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->sendPushNotificationData:Lcom/appsflyer/internal/AFf1bSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    :goto_0
    monitor-exit p0

    .line 25
    return-object v0

    .line 26
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    throw v0
.end method

.method private declared-synchronized setOutOfStore()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->AFKeystoreWrapper:Ljava/util/concurrent/ScheduledExecutorService;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-static {}, Lcom/appsflyer/internal/AFc1jSDK;->AFLogger()Ljava/util/concurrent/ScheduledExecutorService;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->AFKeystoreWrapper:Ljava/util/concurrent/ScheduledExecutorService;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    :goto_0
    monitor-exit p0

    .line 16
    return-object v0

    .line 17
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw v0
.end method

.method private static synthetic setResolveDeepLinkURLs()Ljava/lang/String;
    .locals 4

    .line 1
    sget-object v0, Lcom/appsflyer/internal/AFj1mSDK;->e:Ljava/lang/String;

    .line 2
    .line 3
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 4
    .line 5
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2}, Lcom/appsflyer/AppsFlyerLib;->getHostPrefix()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {}, Lcom/appsflyer/internal/AFa1tSDK;->d()Lcom/appsflyer/internal/AFa1tSDK;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v3}, Lcom/appsflyer/internal/AFa1tSDK;->getHostName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v1, v0, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0
.end method

.method private declared-synchronized setUserFbLoginId()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger:Ljava/util/concurrent/ExecutorService;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-static {}, Lcom/appsflyer/internal/AFc1jSDK;->d()Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger:Ljava/util/concurrent/ExecutorService;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    :goto_0
    monitor-exit p0

    .line 16
    return-object v0

    .line 17
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw v0
.end method

.method private synthetic t_()Landroid/content/SharedPreferences;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0, v0}, Lcom/appsflyer/internal/AFc1aSDK;->s_(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "Context must be set via setContext method before calling this dependency."

    .line 13
    .line 14
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method


# virtual methods
.method public final AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->i:Lcom/appsflyer/internal/AFc1gSDK;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/appsflyer/internal/AFc1dSDK;

    .line 6
    .line 7
    new-instance v1, Lcom/appsflyer/internal/i;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, p0, v2}, Lcom/appsflyer/internal/i;-><init>(Lcom/appsflyer/internal/AFc1aSDK;B)V

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFc1dSDK;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Lcom/appsflyer/internal/AFc1gSDK;

    .line 17
    .line 18
    invoke-direct {v1, v0}, Lcom/appsflyer/internal/AFc1gSDK;-><init>(Lcom/appsflyer/internal/AFc1dSDK;)V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, Lcom/appsflyer/internal/AFc1aSDK;->i:Lcom/appsflyer/internal/AFc1gSDK;

    .line 22
    .line 23
    return-object v1

    .line 24
    :cond_0
    return-object v0
.end method

.method public final declared-synchronized AFLogger()Lcom/appsflyer/internal/AFc1iSDK;
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->w:Lcom/appsflyer/internal/AFc1iSDK;

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    new-instance v0, Lcom/appsflyer/internal/AFc1iSDK;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget-object v3, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    .line 17
    .line 18
    if-nez v3, :cond_0

    .line 19
    .line 20
    new-instance v3, Lcom/appsflyer/internal/AFc1eSDK;

    .line 21
    .line 22
    invoke-direct {v3}, Lcom/appsflyer/internal/AFc1eSDK;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v3, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception v0

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->d()Ljava/util/concurrent/ExecutorService;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/appsflyer/internal/AFc1iSDK;-><init>(Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/internal/AFc1kSDK;Lcom/appsflyer/internal/AFc1eSDK;Ljava/util/concurrent/Executor;)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->w:Lcom/appsflyer/internal/AFc1iSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    :cond_1
    monitor-exit p0

    .line 40
    return-object v0

    .line 41
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    throw v0
.end method

.method public final declared-synchronized AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->values:Lcom/appsflyer/internal/AFd1uSDK;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/appsflyer/internal/AFd1wSDK;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/appsflyer/internal/AFd1wSDK;-><init>(Lcom/appsflyer/internal/AFc1bSDK;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->values:Lcom/appsflyer/internal/AFd1uSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    :goto_0
    monitor-exit p0

    .line 17
    return-object v0

    .line 18
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    throw v0
.end method

.method public final declared-synchronized AppsFlyerLib()Lcom/appsflyer/internal/AFf1fSDK;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->getSdkVersion:Lcom/appsflyer/internal/AFf1fSDK;

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    new-instance v0, Lcom/appsflyer/internal/AFf1fSDK;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v2, p0, Lcom/appsflyer/internal/AFc1aSDK;->getInstance:Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    new-instance v2, Lcom/appsflyer/internal/AFj1hSDK;

    .line 17
    .line 18
    invoke-direct {v2}, Lcom/appsflyer/internal/AFj1hSDK;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v2, p0, Lcom/appsflyer/internal/AFc1aSDK;->getInstance:Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    :goto_0
    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFf1fSDK;-><init>(Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->getSdkVersion:Lcom/appsflyer/internal/AFf1fSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    :cond_1
    monitor-exit p0

    .line 32
    return-object v0

    .line 33
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    throw v0
.end method

.method public final declared-synchronized afDebugLog()Lcom/appsflyer/internal/AFi1aSDK;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->getEntries:Lcom/appsflyer/internal/AFi1aSDK;

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    new-instance v0, Lcom/appsflyer/internal/AFi1aSDK;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/appsflyer/internal/AFc1aSDK;->AppsFlyerLib:Lcom/appsflyer/internal/AFi1hSDK;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lcom/appsflyer/internal/AFi1eSDK;

    .line 13
    .line 14
    invoke-direct {v1}, Lcom/appsflyer/internal/AFi1eSDK;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lcom/appsflyer/internal/AFc1aSDK;->AppsFlyerLib:Lcom/appsflyer/internal/AFi1hSDK;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    invoke-direct {v0, p0, v1}, Lcom/appsflyer/internal/AFi1aSDK;-><init>(Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/internal/AFi1hSDK;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->getEntries:Lcom/appsflyer/internal/AFi1aSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    :cond_1
    monitor-exit p0

    .line 28
    return-object v0

    .line 29
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    throw v0
.end method

.method public final afErrorLog()Lcom/appsflyer/sdk_base/logger/LoggerDelegate;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->enableTCFDataCollection:Lcom/appsflyer/sdk_base/logger/LoggerDelegate;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/appsflyer/sdk_base/logger/LoggerDelegate;

    .line 6
    .line 7
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lcom/appsflyer/sdk_base/logger/LoggerDelegate;-><init>(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->enableTCFDataCollection:Lcom/appsflyer/sdk_base/logger/LoggerDelegate;

    .line 13
    .line 14
    :cond_0
    return-object v0
.end method

.method public final afInfoLog()Lcom/appsflyer/internal/AFj1ySDK;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->valueOf:Lcom/appsflyer/internal/AFj1ySDK;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Lcom/appsflyer/internal/AFj1vSDK;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 8
    .line 9
    iget-object v1, v1, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1aSDK;->setUserFbLoginId()Ljava/util/concurrent/ExecutorService;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFj1vSDK;-><init>(Landroid/content/Context;Ljava/util/concurrent/ExecutorService;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->valueOf:Lcom/appsflyer/internal/AFj1ySDK;

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    const-string p0, "Context must be set via setContext method before calling this dependency."

    .line 24
    .line 25
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return-object p0

    .line 30
    :cond_1
    return-object v0
.end method

.method public final declared-synchronized afWarnLog()Lcom/appsflyer/internal/AFe1wSDK;
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->getLevel:Lcom/appsflyer/internal/AFe1wSDK;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 7
    .line 8
    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 9
    .line 10
    new-instance v7, Lcom/appsflyer/internal/AFc1aSDK$5;

    .line 11
    .line 12
    invoke-direct {v7}, Lcom/appsflyer/internal/AFc1aSDK$5;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v8, Lcom/appsflyer/internal/AFc1aSDK$AFa1tSDK;

    .line 16
    .line 17
    invoke-direct {v8}, Lcom/appsflyer/internal/AFc1aSDK$AFa1tSDK;-><init>()V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    const/4 v3, 0x6

    .line 22
    const-wide/16 v4, 0x3c

    .line 23
    .line 24
    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 25
    .line 26
    .line 27
    new-instance v0, Lcom/appsflyer/internal/j;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->setRejectedExecutionHandler(Ljava/util/concurrent/RejectedExecutionHandler;)V

    .line 33
    .line 34
    .line 35
    new-instance v0, Lcom/appsflyer/internal/AFe1wSDK;

    .line 36
    .line 37
    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFe1wSDK;-><init>(Ljava/util/concurrent/ExecutorService;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->getLevel:Lcom/appsflyer/internal/AFe1wSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    :goto_0
    monitor-exit p0

    .line 46
    return-object v0

    .line 47
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    throw v0
.end method

.method public final declared-synchronized d()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->unregisterClient:Ljava/util/concurrent/ExecutorService;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-static {}, Lcom/appsflyer/internal/AFc1jSDK;->unregisterClient()Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->unregisterClient:Ljava/util/concurrent/ExecutorService;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    :goto_0
    monitor-exit p0

    .line 16
    return-object v0

    .line 17
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw v0
.end method

.method public final declared-synchronized e()Lcom/appsflyer/internal/AFh1xSDK;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFh1xSDK;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/appsflyer/internal/AFh1xSDK;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFh1xSDK;-><init>(Lcom/appsflyer/internal/AFc1kSDK;Lcom/appsflyer/internal/AFc1iSDK;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFh1xSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    :goto_0
    monitor-exit p0

    .line 25
    return-object v0

    .line 26
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    throw v0
.end method

.method public final declared-synchronized enableTCFDataCollection()Lcom/appsflyer/internal/AFa1qSDK;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setUserEmail:Lcom/appsflyer/internal/AFa1qSDK;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/appsflyer/internal/AFa1qSDK;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/appsflyer/internal/AFa1qSDK;-><init>(Lcom/appsflyer/internal/AFc1bSDK;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setUserEmail:Lcom/appsflyer/internal/AFa1qSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    :goto_0
    monitor-exit p0

    .line 17
    return-object v0

    .line 18
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    throw v0
.end method

.method public final force()Lcom/appsflyer/internal/AFg1rSDK;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/appsflyer/internal/AFc1aSDK;->afDebugLog:Lcom/appsflyer/internal/AFg1rSDK;

    .line 4
    .line 5
    if-nez v1, :cond_9

    .line 6
    .line 7
    new-instance v2, Lcom/appsflyer/internal/AFg1oSDK;

    .line 8
    .line 9
    iget-object v1, v0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 10
    .line 11
    iget-object v3, v1, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const-string v4, "Context must be set via setContext method before calling this dependency."

    .line 15
    .line 16
    if-eqz v3, :cond_8

    .line 17
    .line 18
    iget-object v5, v0, Lcom/appsflyer/internal/AFc1aSDK;->setDebugLog:Lcom/appsflyer/internal/AFj1cSDK;

    .line 19
    .line 20
    if-nez v5, :cond_0

    .line 21
    .line 22
    new-instance v5, Lcom/appsflyer/internal/AFj1eSDK;

    .line 23
    .line 24
    invoke-direct {v5}, Lcom/appsflyer/internal/AFj1eSDK;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v5, v0, Lcom/appsflyer/internal/AFc1aSDK;->setDebugLog:Lcom/appsflyer/internal/AFj1cSDK;

    .line 28
    .line 29
    :cond_0
    iget-object v6, v0, Lcom/appsflyer/internal/AFc1aSDK;->setOaidData:Lcom/appsflyer/internal/AFg1wSDK;

    .line 30
    .line 31
    if-nez v6, :cond_1

    .line 32
    .line 33
    new-instance v6, Lcom/appsflyer/internal/AFg1pSDK;

    .line 34
    .line 35
    invoke-direct {v6}, Lcom/appsflyer/internal/AFg1pSDK;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v6, v0, Lcom/appsflyer/internal/AFc1aSDK;->setOaidData:Lcom/appsflyer/internal/AFg1wSDK;

    .line 39
    .line 40
    :cond_1
    iget-object v7, v0, Lcom/appsflyer/internal/AFc1aSDK;->valueOf:Lcom/appsflyer/internal/AFj1ySDK;

    .line 41
    .line 42
    if-nez v7, :cond_3

    .line 43
    .line 44
    new-instance v7, Lcom/appsflyer/internal/AFj1vSDK;

    .line 45
    .line 46
    iget-object v8, v0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 47
    .line 48
    iget-object v8, v8, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 49
    .line 50
    if-eqz v8, :cond_2

    .line 51
    .line 52
    invoke-direct {v0}, Lcom/appsflyer/internal/AFc1aSDK;->setUserFbLoginId()Ljava/util/concurrent/ExecutorService;

    .line 53
    .line 54
    .line 55
    move-result-object v9

    .line 56
    invoke-direct {v7, v8, v9}, Lcom/appsflyer/internal/AFj1vSDK;-><init>(Landroid/content/Context;Ljava/util/concurrent/ExecutorService;)V

    .line 57
    .line 58
    .line 59
    iput-object v7, v0, Lcom/appsflyer/internal/AFc1aSDK;->valueOf:Lcom/appsflyer/internal/AFj1ySDK;

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_3
    :goto_0
    iget-object v8, v0, Lcom/appsflyer/internal/AFc1aSDK;->setCustomerUserId:Lcom/appsflyer/internal/AFg1qSDK;

    .line 67
    .line 68
    if-nez v8, :cond_4

    .line 69
    .line 70
    new-instance v8, Lcom/appsflyer/internal/AFg1nSDK;

    .line 71
    .line 72
    invoke-direct {v8}, Lcom/appsflyer/internal/AFg1nSDK;-><init>()V

    .line 73
    .line 74
    .line 75
    iput-object v8, v0, Lcom/appsflyer/internal/AFc1aSDK;->setCustomerUserId:Lcom/appsflyer/internal/AFg1qSDK;

    .line 76
    .line 77
    :cond_4
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFc1aSDK;->e()Lcom/appsflyer/internal/AFh1xSDK;

    .line 78
    .line 79
    .line 80
    move-result-object v9

    .line 81
    move-object v10, v4

    .line 82
    move-object v4, v5

    .line 83
    move-object v5, v6

    .line 84
    move-object v6, v7

    .line 85
    move-object v7, v8

    .line 86
    move-object v8, v9

    .line 87
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFc1aSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    .line 88
    .line 89
    .line 90
    move-result-object v9

    .line 91
    move-object v11, v10

    .line 92
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 93
    .line 94
    .line 95
    move-result-object v10

    .line 96
    iget-object v12, v0, Lcom/appsflyer/internal/AFc1aSDK;->updateServerUninstallToken:Lcom/appsflyer/internal/AFi1vSDK;

    .line 97
    .line 98
    if-nez v12, :cond_5

    .line 99
    .line 100
    new-instance v12, Lcom/appsflyer/internal/AFi1vSDK;

    .line 101
    .line 102
    iget-object v13, v0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 103
    .line 104
    iget-object v13, v13, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 105
    .line 106
    if-eqz v13, :cond_6

    .line 107
    .line 108
    invoke-direct {v12, v13}, Lcom/appsflyer/internal/AFi1vSDK;-><init>(Landroid/content/Context;)V

    .line 109
    .line 110
    .line 111
    iput-object v12, v0, Lcom/appsflyer/internal/AFc1aSDK;->updateServerUninstallToken:Lcom/appsflyer/internal/AFi1vSDK;

    .line 112
    .line 113
    :cond_5
    move-object v11, v12

    .line 114
    goto :goto_1

    .line 115
    :cond_6
    invoke-static {v11}, La/jf4;->n(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    return-object v1

    .line 119
    :goto_1
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFc1aSDK;->AppsFlyerLib()Lcom/appsflyer/internal/AFf1fSDK;

    .line 120
    .line 121
    .line 122
    move-result-object v12

    .line 123
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFc1aSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    .line 124
    .line 125
    .line 126
    move-result-object v13

    .line 127
    invoke-direct {v0}, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID()Lcom/appsflyer/internal/AFf1bSDK;

    .line 128
    .line 129
    .line 130
    move-result-object v14

    .line 131
    iget-object v1, v0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    .line 132
    .line 133
    if-nez v1, :cond_7

    .line 134
    .line 135
    new-instance v1, Lcom/appsflyer/internal/AFc1eSDK;

    .line 136
    .line 137
    invoke-direct {v1}, Lcom/appsflyer/internal/AFc1eSDK;-><init>()V

    .line 138
    .line 139
    .line 140
    iput-object v1, v0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    .line 141
    .line 142
    :cond_7
    move-object v15, v1

    .line 143
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFc1aSDK;->registerClient()Lcom/appsflyer/AppsFlyerProperties;

    .line 144
    .line 145
    .line 146
    move-result-object v16

    .line 147
    invoke-direct/range {v2 .. v16}, Lcom/appsflyer/internal/AFg1oSDK;-><init>(Landroid/content/Context;Lcom/appsflyer/internal/AFj1cSDK;Lcom/appsflyer/internal/AFg1wSDK;Lcom/appsflyer/internal/AFj1ySDK;Lcom/appsflyer/internal/AFg1qSDK;Lcom/appsflyer/internal/AFh1xSDK;Lcom/appsflyer/internal/AFc1kSDK;Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFi1vSDK;Lcom/appsflyer/internal/AFf1fSDK;Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/internal/AFf1bSDK;Lcom/appsflyer/internal/AFc1eSDK;Lcom/appsflyer/AppsFlyerProperties;)V

    .line 148
    .line 149
    .line 150
    iput-object v2, v0, Lcom/appsflyer/internal/AFc1aSDK;->afDebugLog:Lcom/appsflyer/internal/AFg1rSDK;

    .line 151
    .line 152
    return-object v2

    .line 153
    :cond_8
    move-object v11, v4

    .line 154
    invoke-static {v11}, La/jf4;->n(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    :cond_9
    return-object v1
.end method

.method public final declared-synchronized getEntries()Lcom/appsflyer/exception_manager/ExceptionManager;
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->getInstance:Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/appsflyer/internal/AFj1hSDK;

    .line 7
    .line 8
    invoke-direct {v0}, Lcom/appsflyer/internal/AFj1hSDK;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->getInstance:Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    goto/16 :goto_2

    .line 16
    .line 17
    :cond_0
    :goto_0
    sget-object v1, Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;->EXCEPTION_MANAGER:Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;

    .line 18
    .line 19
    invoke-interface {v0, v1}, Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;->isOptionalFeaturePresent(Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->stop:Lcom/appsflyer/exception_manager/ExceptionManager;

    .line 26
    .line 27
    if-nez v0, :cond_3

    .line 28
    .line 29
    new-instance v1, Lcom/appsflyer/exception_manager/SdkData;

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AppsFlyerLib()Lcom/appsflyer/internal/AFf1fSDK;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    const v3, -0x62ff1f55

    .line 44
    .line 45
    .line 46
    const v4, 0x62ff1f57

    .line 47
    .line 48
    .line 49
    invoke-static {v2, v3, v4, v0}, Lcom/appsflyer/internal/AFf1fSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    move-object v2, v0

    .line 54
    check-cast v2, Ljava/lang/String;

    .line 55
    .line 56
    new-instance v3, Lcom/appsflyer/c;

    .line 57
    .line 58
    const/4 v0, 0x2

    .line 59
    invoke-direct {v3, v0}, Lcom/appsflyer/c;-><init>(B)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 63
    .line 64
    .line 65
    invoke-static {}, Lcom/appsflyer/internal/AFc1iSDK;->unregisterClient()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 74
    .line 75
    invoke-static {v0}, Lcom/appsflyer/internal/AFb1jSDK;->AFLogger(Lcom/appsflyer/internal/AFc1kSDK;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1iSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 84
    .line 85
    iget-object v0, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 86
    .line 87
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setDebugLog:Lcom/appsflyer/internal/AFj1cSDK;

    .line 92
    .line 93
    if-nez v0, :cond_1

    .line 94
    .line 95
    new-instance v0, Lcom/appsflyer/internal/AFj1eSDK;

    .line 96
    .line 97
    invoke-direct {v0}, Lcom/appsflyer/internal/AFj1eSDK;-><init>()V

    .line 98
    .line 99
    .line 100
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setDebugLog:Lcom/appsflyer/internal/AFj1cSDK;

    .line 101
    .line 102
    :cond_1
    invoke-interface {v0}, Lcom/appsflyer/internal/AFj1cSDK;->unregisterClient()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    invoke-direct/range {v1 .. v7}, Lcom/appsflyer/exception_manager/SdkData;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    move-object v2, v1

    .line 110
    new-instance v1, Lcom/appsflyer/exception_manager/ExceptionManagerImpl;

    .line 111
    .line 112
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 113
    .line 114
    iget-object v3, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 115
    .line 116
    if-eqz v3, :cond_2

    .line 117
    .line 118
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->d()Ljava/util/concurrent/ExecutorService;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1kSDK;->p_()Landroid/content/SharedPreferences;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    new-instance v6, Lcom/appsflyer/internal/i;

    .line 131
    .line 132
    const/4 v0, 0x3

    .line 133
    invoke-direct {v6, p0, v0}, Lcom/appsflyer/internal/i;-><init>(Lcom/appsflyer/internal/AFc1aSDK;B)V

    .line 134
    .line 135
    .line 136
    new-instance v7, Lcom/appsflyer/internal/a;

    .line 137
    .line 138
    const/4 v0, 0x6

    .line 139
    invoke-direct {v7, v0}, Lcom/appsflyer/internal/a;-><init>(B)V

    .line 140
    .line 141
    .line 142
    invoke-direct/range {v1 .. v7}, Lcom/appsflyer/exception_manager/ExceptionManagerImpl;-><init>(Lcom/appsflyer/exception_manager/SdkData;Landroid/content/Context;Ljava/util/concurrent/ExecutorService;Landroid/content/SharedPreferences;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    .line 143
    .line 144
    .line 145
    iput-object v1, p0, Lcom/appsflyer/internal/AFc1aSDK;->stop:Lcom/appsflyer/exception_manager/ExceptionManager;

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 149
    .line 150
    const-string v1, "Context must be set via setContext method before calling this dependency."

    .line 151
    .line 152
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw v0

    .line 156
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->stop:Lcom/appsflyer/exception_manager/ExceptionManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 157
    .line 158
    monitor-exit p0

    .line 159
    return-object v0

    .line 160
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 161
    throw v0
.end method

.method public final getInstance()Lcom/appsflyer/internal/AFi1vSDK;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->updateServerUninstallToken:Lcom/appsflyer/internal/AFi1vSDK;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Lcom/appsflyer/internal/AFi1vSDK;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 8
    .line 9
    iget-object v1, v1, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFi1vSDK;-><init>(Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->updateServerUninstallToken:Lcom/appsflyer/internal/AFi1vSDK;

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    const-string p0, "Context must be set via setContext method before calling this dependency."

    .line 20
    .line 21
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return-object p0

    .line 26
    :cond_1
    return-object v0
.end method

.method public final declared-synchronized getLevel()Lcom/appsflyer/internal/AFd1jSDK;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setAndroidIdData:Lcom/appsflyer/internal/AFd1jSDK;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/appsflyer/internal/AFd1jSDK;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFd1jSDK;-><init>(Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFc1kSDK;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setAndroidIdData:Lcom/appsflyer/internal/AFd1jSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    :goto_0
    monitor-exit p0

    .line 25
    return-object v0

    .line 26
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    throw v0
.end method

.method public final declared-synchronized getSdkVersion()Lcom/appsflyer/internal/AFa1aSDK;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setUserFirstName:Lcom/appsflyer/internal/AFa1aSDK;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/appsflyer/internal/AFb1tSDK;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFb1tSDK;-><init>(Lcom/appsflyer/internal/AFd1zSDK;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setUserFirstName:Lcom/appsflyer/internal/AFa1aSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    monitor-exit p0

    .line 21
    return-object v0

    .line 22
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw v0
.end method

.method public final declared-synchronized i()Lcom/appsflyer/internal/AFf1hSDK;
    .locals 10

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->v:Lcom/appsflyer/internal/AFf1hSDK;

    .line 3
    .line 4
    if-nez v0, :cond_2

    .line 5
    .line 6
    new-instance v5, Lcom/appsflyer/internal/AFf1jSDK;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-direct {v5, v0}, Lcom/appsflyer/internal/AFf1jSDK;-><init>(Lcom/appsflyer/internal/AFc1kSDK;)V

    .line 13
    .line 14
    .line 15
    new-instance v7, Lcom/appsflyer/internal/AFf1kSDK;

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v1, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    new-instance v1, Lcom/appsflyer/internal/AFc1eSDK;

    .line 26
    .line 27
    invoke-direct {v1}, Lcom/appsflyer/internal/AFc1eSDK;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    :goto_0
    invoke-direct {v7, v0, v5, v1}, Lcom/appsflyer/internal/AFf1kSDK;-><init>(Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFf1jSDK;Lcom/appsflyer/internal/AFc1eSDK;)V

    .line 36
    .line 37
    .line 38
    new-instance v1, Lcom/appsflyer/internal/AFf1hSDK;

    .line 39
    .line 40
    new-instance v2, Lcom/appsflyer/internal/AFf1nSDK;

    .line 41
    .line 42
    invoke-direct {v2}, Lcom/appsflyer/internal/AFf1nSDK;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AppsFlyerLib()Lcom/appsflyer/internal/AFf1fSDK;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->unregisterClient()Lcom/appsflyer/internal/AFd1sSDK;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    .line 58
    .line 59
    if-nez v0, :cond_1

    .line 60
    .line 61
    new-instance v0, Lcom/appsflyer/internal/AFc1eSDK;

    .line 62
    .line 63
    invoke-direct {v0}, Lcom/appsflyer/internal/AFc1eSDK;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    .line 67
    .line 68
    :cond_1
    move-object v8, v0

    .line 69
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->afWarnLog()Lcom/appsflyer/internal/AFe1wSDK;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    invoke-direct/range {v1 .. v9}, Lcom/appsflyer/internal/AFf1hSDK;-><init>(Lcom/appsflyer/internal/AFf1nSDK;Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFf1fSDK;Lcom/appsflyer/internal/AFf1jSDK;Lcom/appsflyer/internal/AFd1sSDK;Lcom/appsflyer/internal/AFf1kSDK;Lcom/appsflyer/internal/AFc1eSDK;Lcom/appsflyer/internal/AFe1wSDK;)V

    .line 74
    .line 75
    .line 76
    iput-object v1, p0, Lcom/appsflyer/internal/AFc1aSDK;->v:Lcom/appsflyer/internal/AFf1hSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    .line 78
    move-object v0, v1

    .line 79
    :cond_2
    monitor-exit p0

    .line 80
    return-object v0

    .line 81
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    throw v0
.end method

.method public final onPause()Lcom/appsflyer/internal/AFj1cSDK;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setDebugLog:Lcom/appsflyer/internal/AFj1cSDK;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/appsflyer/internal/AFj1eSDK;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/appsflyer/internal/AFj1eSDK;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setDebugLog:Lcom/appsflyer/internal/AFj1cSDK;

    .line 11
    .line 12
    :cond_0
    return-object v0
.end method

.method public final declared-synchronized registerClient()Lcom/appsflyer/AppsFlyerProperties;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->afErrorLog:Lcom/appsflyer/AppsFlyerProperties;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/appsflyer/internal/AFa1vSDK;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFa1vSDK;-><init>(Lcom/appsflyer/internal/AFc1kSDK;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->afErrorLog:Lcom/appsflyer/AppsFlyerProperties;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    monitor-exit p0

    .line 21
    return-object v0

    .line 22
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw v0
.end method

.method public final registerClient(Lcom/appsflyer/share/AppsFlyerConversionListener;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/appsflyer/internal/AFc1aSDK;->setOneLinkCustomDomain:Lcom/appsflyer/share/AppsFlyerConversionListener;

    return-void
.end method

.method public final setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/appsflyer/internal/AFc1eSDK;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/appsflyer/internal/AFc1eSDK;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    .line 11
    .line 12
    :cond_0
    return-object v0
.end method

.method public final declared-synchronized setAppInviteOneLink()Lcom/appsflyer/internal/AFj1wSDK;
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setResolveDeepLinkURLs:Lcom/appsflyer/internal/AFj1wSDK;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/appsflyer/internal/AFj1xSDK;

    .line 7
    .line 8
    new-instance v1, Lcom/appsflyer/internal/AFc1dSDK;

    .line 9
    .line 10
    new-instance v2, Lcom/appsflyer/internal/i;

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-direct {v2, p0, v3}, Lcom/appsflyer/internal/i;-><init>(Lcom/appsflyer/internal/AFc1aSDK;B)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, v2}, Lcom/appsflyer/internal/AFc1dSDK;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 17
    .line 18
    .line 19
    new-instance v2, Lcom/appsflyer/internal/AFc1dSDK;

    .line 20
    .line 21
    new-instance v3, Lcom/appsflyer/internal/i;

    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    invoke-direct {v3, p0, v4}, Lcom/appsflyer/internal/i;-><init>(Lcom/appsflyer/internal/AFc1aSDK;B)V

    .line 25
    .line 26
    .line 27
    invoke-direct {v2, v3}, Lcom/appsflyer/internal/AFc1dSDK;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFj1xSDK;-><init>(Lcom/appsflyer/internal/AFc1dSDK;Lcom/appsflyer/internal/AFc1dSDK;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setResolveDeepLinkURLs:Lcom/appsflyer/internal/AFj1wSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    :goto_0
    monitor-exit p0

    .line 39
    return-object v0

    .line 40
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    throw v0
.end method

.method public final declared-synchronized setCustomerUserId()Lcom/appsflyer/internal/AFe1vSDK;
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setAdditionalData:Lcom/appsflyer/internal/AFd1eSDK;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/appsflyer/internal/AFd1eSDK;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->registerClient()Lcom/appsflyer/AppsFlyerProperties;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->afWarnLog()Lcom/appsflyer/internal/AFe1wSDK;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-direct {v0, v1, v2, v3, p0}, Lcom/appsflyer/internal/AFd1eSDK;-><init>(Lcom/appsflyer/internal/AFc1kSDK;Lcom/appsflyer/AppsFlyerProperties;Lcom/appsflyer/internal/AFe1wSDK;Lcom/appsflyer/internal/AFc1bSDK;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setAdditionalData:Lcom/appsflyer/internal/AFd1eSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    :goto_0
    monitor-exit p0

    .line 29
    return-object v0

    .line 30
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    throw v0
.end method

.method public final setDebugLog()Lcom/appsflyer/internal/AFh1wSDK;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setOutOfStore:Lcom/appsflyer/internal/AFh1wSDK;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/appsflyer/internal/AFh1tSDK;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lcom/appsflyer/internal/AFh1tSDK;-><init>(Lcom/appsflyer/internal/AFc1bSDK;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setOutOfStore:Lcom/appsflyer/internal/AFh1wSDK;

    .line 11
    .line 12
    :cond_0
    return-object v0
.end method

.method public final setImeiData()Lcom/appsflyer/internal/AFi1oSDK;
    .locals 7

    .line 1
    const v0, -0xd61e06d

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    :try_start_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFc1aSDK;->setAppInviteOneLink:Lcom/appsflyer/internal/AFi1oSDK;

    .line 9
    .line 10
    if-nez v1, :cond_3

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    .line 17
    .line 18
    .line 19
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    const/4 v3, 0x2

    .line 21
    :try_start_1
    new-array v3, v3, [Ljava/lang/Object;

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    aput-object v2, v3, v4

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    aput-object v1, v3, v2

    .line 28
    .line 29
    sget-object v1, Lcom/appsflyer/internal/AFi1nSDK;->getSdkVersion:Ljava/util/Map;

    .line 30
    .line 31
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    if-eqz v4, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v4, 0x0

    .line 39
    invoke-static {v4, v4}, Landroid/graphics/PointF;->length(FF)F

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    cmpl-float v4, v5, v4

    .line 44
    .line 45
    invoke-static {v2}, Landroid/os/Process;->getThreadPriority(I)I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    add-int/lit8 v5, v5, 0x14

    .line 50
    .line 51
    shr-int/lit8 v5, v5, 0x6

    .line 52
    .line 53
    add-int/lit8 v5, v5, 0x25

    .line 54
    .line 55
    invoke-static {v2, v2}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    int-to-char v2, v2

    .line 60
    invoke-static {v4, v5, v2}, Lcom/appsflyer/internal/AFi1nSDK;->AFKeystoreWrapper(IIC)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Ljava/lang/Class;

    .line 65
    .line 66
    const-class v4, Lcom/appsflyer/internal/AFc1iSDK;

    .line 67
    .line 68
    const-class v5, Lcom/appsflyer/internal/AFd1zSDK;

    .line 69
    .line 70
    filled-new-array {v4, v5}, [Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-virtual {v2, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    :goto_0
    check-cast v4, Ljava/lang/reflect/Constructor;

    .line 82
    .line 83
    invoke-virtual {v4, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, Lcom/appsflyer/internal/AFi1oSDK;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 88
    .line 89
    :try_start_2
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setAppInviteOneLink:Lcom/appsflyer/internal/AFi1oSDK;

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :catchall_0
    move-exception v0

    .line 93
    move-object v4, v0

    .line 94
    goto :goto_1

    .line 95
    :catchall_1
    move-exception v0

    .line 96
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    if-eqz v1, :cond_1

    .line 101
    .line 102
    throw v1

    .line 103
    :cond_1
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 104
    :goto_1
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 105
    .line 106
    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->PLAY_INTEGRITY_API:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 107
    .line 108
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    if-eqz v0, :cond_2

    .line 113
    .line 114
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    :goto_2
    move-object v3, v0

    .line 119
    goto :goto_3

    .line 120
    :cond_2
    const-string v0, ""

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :goto_3
    const/4 v5, 0x0

    .line 124
    const/4 v6, 0x0

    .line 125
    invoke-virtual/range {v1 .. v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 126
    .line 127
    .line 128
    :cond_3
    :goto_4
    iget-object p0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setAppInviteOneLink:Lcom/appsflyer/internal/AFi1oSDK;

    .line 129
    .line 130
    return-object p0
.end method

.method public final setOaidData()Lcom/appsflyer/internal/AFf1eSDK;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->clearUserPii:Lcom/appsflyer/internal/AFf1eSDK;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    new-instance v0, Lcom/appsflyer/internal/AFf1gSDK;

    .line 6
    .line 7
    new-instance v1, Lcom/appsflyer/internal/AFg1zSDK;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 10
    .line 11
    iget-object v2, v2, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 12
    .line 13
    if-eqz v2, :cond_2

    .line 14
    .line 15
    iget-object v3, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    .line 16
    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    new-instance v3, Lcom/appsflyer/internal/AFc1eSDK;

    .line 20
    .line 21
    invoke-direct {v3}, Lcom/appsflyer/internal/AFc1eSDK;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v3, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    .line 25
    .line 26
    :cond_0
    invoke-direct {v1, v2, v3}, Lcom/appsflyer/internal/AFg1zSDK;-><init>(Landroid/content/Context;Lcom/appsflyer/internal/AFc1eSDK;)V

    .line 27
    .line 28
    .line 29
    iget-object v2, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    .line 30
    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    new-instance v2, Lcom/appsflyer/internal/AFc1eSDK;

    .line 34
    .line 35
    invoke-direct {v2}, Lcom/appsflyer/internal/AFc1eSDK;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v2, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    .line 39
    .line 40
    :cond_1
    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFf1gSDK;-><init>(Lcom/appsflyer/internal/AFg1xSDK;Lcom/appsflyer/internal/AFc1eSDK;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->clearUserPii:Lcom/appsflyer/internal/AFf1eSDK;

    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_2
    const-string p0, "Context must be set via setContext method before calling this dependency."

    .line 47
    .line 48
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    return-object p0

    .line 53
    :cond_3
    return-object v0
.end method

.method public final setUserEmail()Lcom/appsflyer/internal/AFb1aSDK;
    .locals 3

    .line 1
    new-instance v0, Lcom/appsflyer/internal/AFc1tSDK;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    new-instance v1, Lcom/appsflyer/internal/AFc1eSDK;

    .line 8
    .line 9
    invoke-direct {v1}, Lcom/appsflyer/internal/AFc1eSDK;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AppsFlyerLib()Lcom/appsflyer/internal/AFf1fSDK;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-direct {v0, v1, v2, p0}, Lcom/appsflyer/internal/AFc1tSDK;-><init>(Lcom/appsflyer/internal/AFc1eSDK;Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/internal/AFf1fSDK;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public final setUserFirstName()Lcom/appsflyer/share/AppsFlyerConversionListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setOneLinkCustomDomain:Lcom/appsflyer/share/AppsFlyerConversionListener;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setUserLastName()Lcom/appsflyer/internal/AFh1sSDK;
    .locals 3

    .line 1
    invoke-static {}, Lcom/appsflyer/internal/AFh1rSDK;->unregisterClient()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->getOutOfStore:Lcom/appsflyer/internal/AFh1sSDK;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lcom/appsflyer/internal/AFh1oSDK;

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->afDebugLog()Lcom/appsflyer/internal/AFi1aSDK;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFh1oSDK;-><init>(Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFi1aSDK;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->getOutOfStore:Lcom/appsflyer/internal/AFh1sSDK;

    .line 25
    .line 26
    :cond_0
    iget-object p0, p0, Lcom/appsflyer/internal/AFc1aSDK;->getOutOfStore:Lcom/appsflyer/internal/AFh1sSDK;

    .line 27
    .line 28
    return-object p0
.end method

.method public final setUserPhone()Lcom/appsflyer/internal/AFa1lSDK;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setUserFbLoginId:Lcom/appsflyer/internal/AFa1lSDK;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/appsflyer/internal/AFa1hSDK;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFa1hSDK;-><init>(Lcom/appsflyer/internal/AFc1kSDK;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setUserFbLoginId:Lcom/appsflyer/internal/AFa1lSDK;

    .line 15
    .line 16
    :cond_0
    return-object v0
.end method

.method public final stop()Lcom/appsflyer/internal/AFi1tSDK;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setUserLastName:Lcom/appsflyer/internal/AFi1tSDK;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/appsflyer/internal/AFi1qSDK;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/appsflyer/internal/AFi1qSDK;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setUserLastName:Lcom/appsflyer/internal/AFi1tSDK;

    .line 11
    .line 12
    :cond_0
    return-object v0
.end method

.method public final unregisterClient()Lcom/appsflyer/internal/AFd1sSDK;
    .locals 7

    .line 1
    new-instance v0, Lcom/appsflyer/internal/AFd1sSDK;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1aSDK;->getOutOfStore()Lcom/appsflyer/internal/AFd1xSDK;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->getLevel()Lcom/appsflyer/internal/AFd1jSDK;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1aSDK;->sendPushNotificationData()Lcom/appsflyer/internal/AFj1mSDK;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    iget-object v5, p0, Lcom/appsflyer/internal/AFc1aSDK;->setDebugLog:Lcom/appsflyer/internal/AFj1cSDK;

    .line 20
    .line 21
    if-nez v5, :cond_0

    .line 22
    .line 23
    new-instance v5, Lcom/appsflyer/internal/AFj1eSDK;

    .line 24
    .line 25
    invoke-direct {v5}, Lcom/appsflyer/internal/AFj1eSDK;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v5, p0, Lcom/appsflyer/internal/AFc1aSDK;->setDebugLog:Lcom/appsflyer/internal/AFj1cSDK;

    .line 29
    .line 30
    :cond_0
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AppsFlyerLib()Lcom/appsflyer/internal/AFf1fSDK;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    invoke-direct/range {v0 .. v6}, Lcom/appsflyer/internal/AFd1sSDK;-><init>(Lcom/appsflyer/internal/AFd1xSDK;Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFd1jSDK;Lcom/appsflyer/internal/AFj1mSDK;Lcom/appsflyer/internal/AFj1cSDK;Lcom/appsflyer/internal/AFf1fSDK;)V

    .line 35
    .line 36
    .line 37
    return-object v0
.end method

.method public final updateServerUninstallToken()Lcom/appsflyer/internal/AFb1bSDK;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setUserPhone:Lcom/appsflyer/internal/AFb1bSDK;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/appsflyer/internal/AFb1cSDK;

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1aSDK;->setOutOfStore()Ljava/util/concurrent/ScheduledExecutorService;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->enableTCFDataCollection()Lcom/appsflyer/internal/AFa1qSDK;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFb1cSDK;-><init>(Ljava/util/concurrent/ScheduledExecutorService;Lcom/appsflyer/internal/AFa1qSDK;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setUserPhone:Lcom/appsflyer/internal/AFb1bSDK;

    .line 19
    .line 20
    :cond_0
    return-object v0
.end method

.method public final declared-synchronized v()Lcom/appsflyer/PurchaseHandler;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->force:Lcom/appsflyer/PurchaseHandler;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/appsflyer/PurchaseHandler;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/appsflyer/PurchaseHandler;-><init>(Lcom/appsflyer/internal/AFc1bSDK;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->force:Lcom/appsflyer/PurchaseHandler;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    :goto_0
    monitor-exit p0

    .line 17
    return-object v0

    .line 18
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    throw v0
.end method

.method public final declared-synchronized valueOf()Lcom/appsflyer/internal/AFd1zSDK;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
.end method

.method public final declared-synchronized values()Lcom/appsflyer/internal/AFc1vSDK;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->onPause:Lcom/appsflyer/internal/AFc1vSDK;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/appsflyer/internal/AFc1uSDK;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFc1uSDK;-><init>(Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/internal/AFc1kSDK;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->onPause:Lcom/appsflyer/internal/AFc1vSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    :goto_0
    monitor-exit p0

    .line 25
    return-object v0

    .line 26
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    throw v0
.end method

.method public final w()Lcom/appsflyer/internal/AFf1aSDK;
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->afWarnLog:Lcom/appsflyer/internal/AFf1aSDK;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v1, Lcom/appsflyer/internal/AFg1tSDK;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->getSdkVersion()Lcom/appsflyer/internal/AFa1aSDK;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->afDebugLog()Lcom/appsflyer/internal/AFi1aSDK;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    new-instance v0, Lcom/appsflyer/internal/AFc1eSDK;

    .line 24
    .line 25
    invoke-direct {v0}, Lcom/appsflyer/internal/AFc1eSDK;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    .line 29
    .line 30
    :cond_0
    move-object v6, v0

    .line 31
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->force()Lcom/appsflyer/internal/AFg1rSDK;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AppsFlyerLib()Lcom/appsflyer/internal/AFf1fSDK;

    .line 40
    .line 41
    .line 42
    move-result-object v9

    .line 43
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->registerClient()Lcom/appsflyer/AppsFlyerProperties;

    .line 44
    .line 45
    .line 46
    move-result-object v10

    .line 47
    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1aSDK;->clearUserPii()Ljava/util/concurrent/ScheduledExecutorService;

    .line 48
    .line 49
    .line 50
    move-result-object v11

    .line 51
    move-object v2, p0

    .line 52
    invoke-direct/range {v1 .. v11}, Lcom/appsflyer/internal/AFg1tSDK;-><init>(Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/internal/AFa1aSDK;Lcom/appsflyer/internal/AFi1aSDK;Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFc1eSDK;Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/internal/AFg1rSDK;Lcom/appsflyer/internal/AFf1fSDK;Lcom/appsflyer/AppsFlyerProperties;Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 53
    .line 54
    .line 55
    iput-object v1, v2, Lcom/appsflyer/internal/AFc1aSDK;->afWarnLog:Lcom/appsflyer/internal/AFf1aSDK;

    .line 56
    .line 57
    return-object v1

    .line 58
    :cond_1
    return-object v0
.end method
