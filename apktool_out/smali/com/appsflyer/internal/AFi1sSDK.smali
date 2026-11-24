.class public final Lcom/appsflyer/internal/AFi1sSDK;
.super Lcom/appsflyer/internal/AFi1ySDK;
.source "SourceFile"


# instance fields
.field private AFKeystoreWrapper:Landroid/net/Network;

.field private AFLogger:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFi1ySDK;-><init>(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    const-string p1, "unknown"

    .line 8
    .line 9
    iput-object p1, p0, Lcom/appsflyer/internal/AFi1sSDK;->AFLogger:Ljava/lang/String;

    .line 10
    .line 11
    new-instance p1, Lcom/appsflyer/internal/AFi1sSDK$AFa1ySDK;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Lcom/appsflyer/internal/AFi1sSDK$AFa1ySDK;-><init>(Lcom/appsflyer/internal/AFi1sSDK;)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFi1ySDK;->E_()Landroid/net/ConnectivityManager;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    new-instance v0, Landroid/net/NetworkRequest$Builder;

    .line 23
    .line 24
    invoke-direct {v0}, Landroid/net/NetworkRequest$Builder;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p0, v0, p1}, Landroid/net/ConnectivityManager;->registerNetworkCallback(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    move-object p0, v0

    .line 37
    move-object v3, p0

    .line 38
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 39
    .line 40
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->DEVICE_DATA:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 41
    .line 42
    const/16 v8, 0x60

    .line 43
    .line 44
    const/4 v9, 0x0

    .line 45
    const-string v2, "Error at attempt to register network callback with ConnectivityManager"

    .line 46
    .line 47
    const/4 v4, 0x1

    .line 48
    const/4 v5, 0x0

    .line 49
    const/4 v6, 0x0

    .line 50
    const/4 v7, 0x0

    .line 51
    invoke-static/range {v0 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public static final synthetic M_(Lcom/appsflyer/internal/AFi1sSDK;Landroid/net/Network;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/appsflyer/internal/AFi1sSDK;->AFKeystoreWrapper:Landroid/net/Network;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic d(Lcom/appsflyer/internal/AFi1sSDK;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/appsflyer/internal/AFi1sSDK;->AFLogger:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public final AFLogger()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFi1sSDK;->K_()Landroid/net/Network;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "unknown"

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFi1ySDK;->E_()Landroid/net/ConnectivityManager;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    :goto_0
    if-eqz p0, :cond_2

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    invoke-virtual {p0, v0}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    const-string p0, "WIFI"

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_1
    const/4 v0, 0x0

    .line 34
    invoke-virtual {p0, v0}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_2

    .line 39
    .line 40
    const-string p0, "MOBILE"

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_2
    return-object v1
.end method

.method public final K_()Landroid/net/Network;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFi1ySDK;->E_()Landroid/net/ConnectivityManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-object v0

    .line 15
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFi1sSDK;->AFKeystoreWrapper:Landroid/net/Network;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    iget-object p0, p0, Lcom/appsflyer/internal/AFi1sSDK;->AFLogger:Ljava/lang/String;

    .line 21
    .line 22
    const-string v2, "NetworkLost"

    .line 23
    .line 24
    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-nez p0, :cond_2

    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_2
    return-object v1
.end method

.method public final L_()Landroid/net/NetworkCapabilities;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFi1sSDK;->K_()Landroid/net/Network;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFi1ySDK;->E_()Landroid/net/ConnectivityManager;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_0
    return-object v1
.end method

.method public final registerClient()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFi1sSDK;->K_()Landroid/net/Network;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFi1ySDK;->E_()Landroid/net/ConnectivityManager;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    :goto_0
    if-eqz p0, :cond_1

    .line 21
    .line 22
    const/4 v0, 0x4

    .line 23
    invoke-virtual {p0, v0}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    const/16 v0, 0xf

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-nez p0, :cond_1

    .line 36
    .line 37
    const/4 p0, 0x1

    .line 38
    return p0

    .line 39
    :cond_1
    return v1
.end method
