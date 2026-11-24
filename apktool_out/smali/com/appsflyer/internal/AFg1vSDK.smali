.class public final Lcom/appsflyer/internal/AFg1vSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final AFKeystoreWrapper:Lcom/appsflyer/AppsFlyerProperties;

.field public final registerClient:Lcom/appsflyer/internal/AFc1kSDK;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/appsflyer/internal/AFa1tSDK;->d()Lcom/appsflyer/internal/AFa1tSDK;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 9
    .line 10
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lcom/appsflyer/internal/AFg1vSDK;->registerClient:Lcom/appsflyer/internal/AFc1kSDK;

    .line 15
    .line 16
    invoke-static {}, Lcom/appsflyer/internal/AFa1tSDK;->d()Lcom/appsflyer/internal/AFa1tSDK;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v0, v0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 21
    .line 22
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->registerClient()Lcom/appsflyer/AppsFlyerProperties;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lcom/appsflyer/internal/AFg1vSDK;->AFKeystoreWrapper:Lcom/appsflyer/AppsFlyerProperties;

    .line 27
    .line 28
    return-void
.end method

.method public static registerClient(Landroid/content/Context;)Z
    .locals 5

    .line 1
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/appsflyer/AppsFlyerLib;->isStopped()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    :try_start_0
    sget-object v0, Lcom/google/firebase/messaging/FirebaseMessagingService;->ACTION_DIRECT_BOOT_REMOTE_INTENT:Ljava/lang/String;

    .line 14
    .line 15
    new-instance v0, Landroid/content/Intent;

    .line 16
    .line 17
    const-string v2, "com.google.firebase.MESSAGING_EVENT"

    .line 18
    .line 19
    const-class v3, Lcom/appsflyer/share/FirebaseMessagingServiceListener;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-direct {v0, v2, v4, p0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;Landroid/content/Context;Ljava/lang/Class;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0, v0, v1}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    if-lez p0, :cond_1

    .line 38
    .line 39
    const/4 p0, 0x1

    .line 40
    return p0

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 43
    .line 44
    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->UNINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 45
    .line 46
    const-string v3, "An error occurred while trying to verify manifest declarations: "

    .line 47
    .line 48
    invoke-virtual {v0, v2, v3, p0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    :catch_0
    :cond_1
    :goto_0
    return v1
.end method


# virtual methods
.method public final d()Lcom/appsflyer/internal/AFg1sSDK;
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1vSDK;->registerClient:Lcom/appsflyer/internal/AFc1kSDK;

    .line 2
    .line 3
    const-string v1, "afUninstallToken"

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v2, p0, Lcom/appsflyer/internal/AFg1vSDK;->registerClient:Lcom/appsflyer/internal/AFc1kSDK;

    .line 10
    .line 11
    const-string v3, "afUninstallToken_received_time"

    .line 12
    .line 13
    const-wide/16 v4, 0x0

    .line 14
    .line 15
    invoke-interface {v2, v3, v4, v5}, Lcom/appsflyer/internal/AFc1kSDK;->unregisterClient(Ljava/lang/String;J)J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    iget-object v6, p0, Lcom/appsflyer/internal/AFg1vSDK;->registerClient:Lcom/appsflyer/internal/AFc1kSDK;

    .line 20
    .line 21
    const-string v7, "afUninstallToken_queued"

    .line 22
    .line 23
    invoke-interface {v6, v7}, Lcom/appsflyer/internal/AFc1kSDK;->AFKeystoreWrapper(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    iget-object v8, p0, Lcom/appsflyer/internal/AFg1vSDK;->registerClient:Lcom/appsflyer/internal/AFc1kSDK;

    .line 28
    .line 29
    const/4 v9, 0x0

    .line 30
    invoke-interface {v8, v7, v9}, Lcom/appsflyer/internal/AFc1kSDK;->registerClient(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v7, ","

    .line 34
    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    iget-object v8, p0, Lcom/appsflyer/internal/AFg1vSDK;->AFKeystoreWrapper:Lcom/appsflyer/AppsFlyerProperties;

    .line 38
    .line 39
    invoke-interface {v8, v1}, Lcom/appsflyer/AppsFlyerProperties;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    if-eqz v8, :cond_0

    .line 44
    .line 45
    invoke-virtual {v8, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    array-length v8, v0

    .line 50
    add-int/lit8 v8, v8, -0x1

    .line 51
    .line 52
    aget-object v0, v0, v8

    .line 53
    .line 54
    :cond_0
    cmp-long v4, v2, v4

    .line 55
    .line 56
    if-nez v4, :cond_1

    .line 57
    .line 58
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1vSDK;->AFKeystoreWrapper:Lcom/appsflyer/AppsFlyerProperties;

    .line 59
    .line 60
    invoke-interface {p0, v1}, Lcom/appsflyer/AppsFlyerProperties;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    if-eqz p0, :cond_1

    .line 65
    .line 66
    invoke-virtual {p0, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    array-length v1, p0

    .line 71
    const/4 v4, 0x2

    .line 72
    if-lt v1, v4, :cond_1

    .line 73
    .line 74
    :try_start_0
    array-length v1, p0

    .line 75
    sub-int/2addr v1, v4

    .line 76
    aget-object p0, p0, v1

    .line 77
    .line 78
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 79
    .line 80
    .line 81
    move-result-wide v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    :catch_0
    :cond_1
    if-eqz v0, :cond_2

    .line 83
    .line 84
    new-instance p0, Lcom/appsflyer/internal/AFg1sSDK;

    .line 85
    .line 86
    invoke-direct {p0, v0, v2, v3, v6}, Lcom/appsflyer/internal/AFg1sSDK;-><init>(Ljava/lang/String;JZ)V

    .line 87
    .line 88
    .line 89
    return-object p0

    .line 90
    :cond_2
    const/4 p0, 0x0

    .line 91
    return-object p0
.end method
