.class public abstract Lcom/appsflyer/internal/AFi1ySDK;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/internal/AFi1ySDK$AFa1uSDK;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\'\u0018\u0000 $2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H%\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u000cH\u0017\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0017\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0015\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0015\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0018H\u0005\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0005\u00a2\u0006\u0004\u0008\u001b\u0010\u0008R\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u001cR\u001e\u0010\r\u001a\u0004\u0018\u00010\u001e8\u0005@\u0004X\u0085\u000c\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001f\u001a\u0004\u0008 \u0010!R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\"8\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010#"
    }
    d2 = {
        "Lcom/appsflyer/internal/AFi1ySDK;",
        "",
        "Landroid/content/Context;",
        "p0",
        "<init>",
        "(Landroid/content/Context;)V",
        "",
        "AFLogger",
        "()Ljava/lang/String;",
        "",
        "registerClient",
        "()Z",
        "Lcom/appsflyer/internal/AFi1xSDK;",
        "unregisterClient",
        "()Lcom/appsflyer/internal/AFi1xSDK;",
        "Lcom/appsflyer/internal/AFi1rSDK;",
        "AFKeystoreWrapper",
        "()Lcom/appsflyer/internal/AFi1rSDK;",
        "Landroid/net/NetworkCapabilities;",
        "L_",
        "()Landroid/net/NetworkCapabilities;",
        "Landroid/net/Network;",
        "K_",
        "()Landroid/net/Network;",
        "Lkotlin/Pair;",
        "v",
        "()Lkotlin/Pair;",
        "e",
        "Landroid/content/Context;",
        "d",
        "Landroid/net/ConnectivityManager;",
        "Landroid/net/ConnectivityManager;",
        "E_",
        "()Landroid/net/ConnectivityManager;",
        "Landroid/telephony/TelephonyManager;",
        "Landroid/telephony/TelephonyManager;",
        "AFa1uSDK"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final AFa1uSDK:Lcom/appsflyer/internal/AFi1ySDK$AFa1uSDK;


# instance fields
.field private final AFLogger:Landroid/telephony/TelephonyManager;

.field private d:Landroid/net/ConnectivityManager;

.field private final registerClient:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/appsflyer/internal/AFi1ySDK$AFa1uSDK;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFi1ySDK$AFa1uSDK;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/appsflyer/internal/AFi1ySDK;->AFa1uSDK:Lcom/appsflyer/internal/AFi1ySDK$AFa1uSDK;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/appsflyer/internal/AFi1ySDK;->registerClient:Landroid/content/Context;

    .line 8
    .line 9
    const-string v0, "connectivity"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    instance-of v1, v0, Landroid/net/ConnectivityManager;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object v0, v2

    .line 24
    :goto_0
    iput-object v0, p0, Lcom/appsflyer/internal/AFi1ySDK;->d:Landroid/net/ConnectivityManager;

    .line 25
    .line 26
    const-string v0, "phone"

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    instance-of v0, p1, Landroid/telephony/TelephonyManager;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    move-object v2, p1

    .line 37
    check-cast v2, Landroid/telephony/TelephonyManager;

    .line 38
    .line 39
    :cond_1
    iput-object v2, p0, Lcom/appsflyer/internal/AFi1ySDK;->AFLogger:Landroid/telephony/TelephonyManager;

    .line 40
    .line 41
    return-void
.end method

.method private e()Ljava/lang/String;
    .locals 12

    .line 1
    const-string v0, "UNKNOWN("

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    iget-object p0, p0, Lcom/appsflyer/internal/AFi1ySDK;->AFLogger:Landroid/telephony/TelephonyManager;

    .line 5
    .line 6
    if-eqz p0, :cond_4

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getDataState()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eqz p0, :cond_3

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    if-eq p0, v2, :cond_2

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    if-eq p0, v2, :cond_1

    .line 19
    .line 20
    const/4 v2, 0x3

    .line 21
    if-eq p0, v2, :cond_0

    .line 22
    .line 23
    new-instance v2, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string p0, ")"

    .line 32
    .line 33
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    move-object p0, v0

    .line 43
    move-object v5, p0

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const-string p0, "SUSPENDED"

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_1
    const-string p0, "CONNECTED"

    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_2
    const-string p0, "CONNECTING"

    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_3
    const-string p0, "DISCONNECTED"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_4
    return-object v1

    .line 58
    :goto_0
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 59
    .line 60
    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->DEVICE_DATA:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 61
    .line 62
    const/16 v10, 0x78

    .line 63
    .line 64
    const/4 v11, 0x0

    .line 65
    const-string v4, "Exception while collecting data state. "

    .line 66
    .line 67
    const/4 v6, 0x0

    .line 68
    const/4 v7, 0x0

    .line 69
    const/4 v8, 0x0

    .line 70
    const/4 v9, 0x0

    .line 71
    invoke-static/range {v2 .. v11}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    return-object v1
.end method

.method private v()Lkotlin/Pair;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v1, 0x0

    .line 2
    :try_start_0
    iget-object p0, p0, Lcom/appsflyer/internal/AFi1ySDK;->d:Landroid/net/ConnectivityManager;

    .line 3
    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    new-instance p0, Lkotlin/Pair;

    .line 7
    .line 8
    invoke-direct {p0, v1, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    move-object p0, v0

    .line 14
    move-object v5, p0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    new-instance p0, Lkotlin/Pair;

    .line 23
    .line 24
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-direct {p0, v0, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_1
    invoke-virtual {p0, v0}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    if-nez p0, :cond_2

    .line 35
    .line 36
    new-instance p0, Lkotlin/Pair;

    .line 37
    .line 38
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-direct {p0, v0, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_2
    const/16 v0, 0xc

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    const/16 v2, 0x10

    .line 51
    .line 52
    invoke-virtual {p0, v2}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    new-instance v2, Lkotlin/Pair;

    .line 57
    .line 58
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-direct {v2, v0, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    .line 69
    return-object v2

    .line 70
    :goto_0
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 71
    .line 72
    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->DEVICE_DATA:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 73
    .line 74
    const/16 v10, 0x78

    .line 75
    .line 76
    const/4 v11, 0x0

    .line 77
    const-string v4, "Exception while collecting internet capabilities. "

    .line 78
    .line 79
    const/4 v6, 0x0

    .line 80
    const/4 v7, 0x0

    .line 81
    const/4 v8, 0x0

    .line 82
    const/4 v9, 0x0

    .line 83
    invoke-static/range {v2 .. v11}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    new-instance p0, Lkotlin/Pair;

    .line 87
    .line 88
    invoke-direct {p0, v1, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    return-object p0
.end method


# virtual methods
.method public final AFKeystoreWrapper()Lcom/appsflyer/internal/AFi1rSDK;
    .locals 14

    .line 1
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFi1ySDK;->unregisterClient()Lcom/appsflyer/internal/AFi1xSDK;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0}, Lcom/appsflyer/internal/AFi1ySDK;->v()Lkotlin/Pair;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, v1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 10
    .line 11
    move-object v6, v2

    .line 12
    check-cast v6, Ljava/lang/Boolean;

    .line 13
    .line 14
    iget-object v1, v1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v7, v1

    .line 17
    check-cast v7, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-direct {p0}, Lcom/appsflyer/internal/AFi1ySDK;->e()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v8

    .line 23
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFi1ySDK;->L_()Landroid/net/NetworkCapabilities;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const/16 v2, 0xf

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    const/4 v4, 0x1

    .line 31
    const/4 v5, 0x4

    .line 32
    const/4 v9, 0x0

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    invoke-virtual {v1, v5}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 36
    .line 37
    .line 38
    move-result v10

    .line 39
    if-eqz v10, :cond_2

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    .line 42
    .line 43
    .line 44
    move-result v10

    .line 45
    if-nez v10, :cond_2

    .line 46
    .line 47
    invoke-virtual {v1, v4}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 48
    .line 49
    .line 50
    move-result v10

    .line 51
    if-eqz v10, :cond_0

    .line 52
    .line 53
    const-string v1, "WIFI"

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {v1, v3}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    const-string v1, "MOBILE"

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    const-string v1, "UNKNOWN"

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    move-object v1, v9

    .line 69
    :goto_0
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFi1ySDK;->L_()Landroid/net/NetworkCapabilities;

    .line 70
    .line 71
    .line 72
    move-result-object v10

    .line 73
    if-nez v10, :cond_3

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_3
    invoke-virtual {v10, v5}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    if-eqz v11, :cond_7

    .line 81
    .line 82
    invoke-virtual {v10, v2}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    if-nez v10, :cond_7

    .line 87
    .line 88
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFi1ySDK;->K_()Landroid/net/Network;

    .line 89
    .line 90
    .line 91
    move-result-object v10

    .line 92
    if-eqz v10, :cond_7

    .line 93
    .line 94
    iget-object v11, p0, Lcom/appsflyer/internal/AFi1ySDK;->d:Landroid/net/ConnectivityManager;

    .line 95
    .line 96
    if-eqz v11, :cond_4

    .line 97
    .line 98
    invoke-virtual {v11, v10}, Landroid/net/ConnectivityManager;->getLinkProperties(Landroid/net/Network;)Landroid/net/LinkProperties;

    .line 99
    .line 100
    .line 101
    move-result-object v10

    .line 102
    goto :goto_1

    .line 103
    :cond_4
    move-object v10, v9

    .line 104
    :goto_1
    if-eqz v10, :cond_7

    .line 105
    .line 106
    invoke-virtual {v10}, Landroid/net/LinkProperties;->getLinkAddresses()Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object v10

    .line 110
    if-eqz v10, :cond_7

    .line 111
    .line 112
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object v10

    .line 116
    :cond_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v11

    .line 120
    if-eqz v11, :cond_6

    .line 121
    .line 122
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v11

    .line 126
    move-object v12, v11

    .line 127
    check-cast v12, Landroid/net/LinkAddress;

    .line 128
    .line 129
    invoke-virtual {v12}, Landroid/net/LinkAddress;->getAddress()Ljava/net/InetAddress;

    .line 130
    .line 131
    .line 132
    move-result-object v12

    .line 133
    invoke-virtual {v12}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    .line 134
    .line 135
    .line 136
    move-result v12

    .line 137
    if-nez v12, :cond_5

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_6
    move-object v11, v9

    .line 141
    :goto_2
    check-cast v11, Landroid/net/LinkAddress;

    .line 142
    .line 143
    if-eqz v11, :cond_7

    .line 144
    .line 145
    invoke-virtual {v11}, Landroid/net/LinkAddress;->getAddress()Ljava/net/InetAddress;

    .line 146
    .line 147
    .line 148
    move-result-object v10

    .line 149
    if-eqz v10, :cond_7

    .line 150
    .line 151
    invoke-virtual {v10}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v10

    .line 155
    goto :goto_4

    .line 156
    :cond_7
    :goto_3
    move-object v10, v9

    .line 157
    :goto_4
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 158
    .line 159
    const/16 v12, 0x1c

    .line 160
    .line 161
    if-ge v11, v12, :cond_8

    .line 162
    .line 163
    new-instance p0, Lkotlin/Pair;

    .line 164
    .line 165
    invoke-direct {p0, v9, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    goto/16 :goto_a

    .line 169
    .line 170
    :cond_8
    iget-object v11, p0, Lcom/appsflyer/internal/AFi1ySDK;->d:Landroid/net/ConnectivityManager;

    .line 171
    .line 172
    if-nez v11, :cond_9

    .line 173
    .line 174
    move-object v12, v9

    .line 175
    goto/16 :goto_9

    .line 176
    .line 177
    :cond_9
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFi1ySDK;->K_()Landroid/net/Network;

    .line 178
    .line 179
    .line 180
    move-result-object v12

    .line 181
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFi1ySDK;->L_()Landroid/net/NetworkCapabilities;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    if-eqz v12, :cond_a

    .line 186
    .line 187
    invoke-virtual {v11, v12}, Landroid/net/ConnectivityManager;->getLinkProperties(Landroid/net/Network;)Landroid/net/LinkProperties;

    .line 188
    .line 189
    .line 190
    move-result-object v12

    .line 191
    goto :goto_5

    .line 192
    :cond_a
    move-object v12, v9

    .line 193
    :goto_5
    if-eqz v12, :cond_b

    .line 194
    .line 195
    invoke-static {v12}, Lcom/appsflyer/internal/b0;->b(Landroid/net/LinkProperties;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v13

    .line 199
    if-eqz v13, :cond_b

    .line 200
    .line 201
    invoke-static {v13}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 202
    .line 203
    .line 204
    move-result v13

    .line 205
    xor-int/2addr v13, v4

    .line 206
    if-ne v13, v4, :cond_b

    .line 207
    .line 208
    goto :goto_6

    .line 209
    :cond_b
    move v4, v3

    .line 210
    :goto_6
    if-eqz v12, :cond_c

    .line 211
    .line 212
    if-eqz p0, :cond_11

    .line 213
    .line 214
    invoke-virtual {p0, v5}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 215
    .line 216
    .line 217
    move-result v13

    .line 218
    if-eqz v13, :cond_11

    .line 219
    .line 220
    invoke-virtual {p0, v2}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    .line 221
    .line 222
    .line 223
    move-result v13

    .line 224
    if-nez v13, :cond_11

    .line 225
    .line 226
    if-eqz v4, :cond_c

    .line 227
    .line 228
    goto :goto_9

    .line 229
    :cond_c
    if-eqz p0, :cond_11

    .line 230
    .line 231
    invoke-virtual {p0, v5}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 232
    .line 233
    .line 234
    move-result v4

    .line 235
    if-eqz v4, :cond_11

    .line 236
    .line 237
    invoke-virtual {p0, v2}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    .line 238
    .line 239
    .line 240
    move-result p0

    .line 241
    if-nez p0, :cond_11

    .line 242
    .line 243
    invoke-virtual {v11}, Landroid/net/ConnectivityManager;->getAllNetworks()[Landroid/net/Network;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    if-nez p0, :cond_d

    .line 248
    .line 249
    new-array p0, v3, [Landroid/net/Network;

    .line 250
    .line 251
    :cond_d
    array-length v2, p0

    .line 252
    :goto_7
    if-ge v3, v2, :cond_11

    .line 253
    .line 254
    aget-object v4, p0, v3

    .line 255
    .line 256
    invoke-virtual {v11, v4}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    .line 257
    .line 258
    .line 259
    move-result-object v13

    .line 260
    if-nez v13, :cond_e

    .line 261
    .line 262
    goto :goto_8

    .line 263
    :cond_e
    invoke-virtual {v13, v5}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 264
    .line 265
    .line 266
    move-result v13

    .line 267
    if-nez v13, :cond_10

    .line 268
    .line 269
    invoke-virtual {v11, v4}, Landroid/net/ConnectivityManager;->getLinkProperties(Landroid/net/Network;)Landroid/net/LinkProperties;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    if-nez v4, :cond_f

    .line 274
    .line 275
    goto :goto_8

    .line 276
    :cond_f
    move-object v12, v4

    .line 277
    goto :goto_9

    .line 278
    :cond_10
    :goto_8
    add-int/lit8 v3, v3, 0x1

    .line 279
    .line 280
    goto :goto_7

    .line 281
    :cond_11
    :goto_9
    if-nez v12, :cond_12

    .line 282
    .line 283
    new-instance p0, Lkotlin/Pair;

    .line 284
    .line 285
    invoke-direct {p0, v9, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    goto :goto_a

    .line 289
    :cond_12
    invoke-static {v12}, Lcom/appsflyer/internal/b0;->b(Landroid/net/LinkProperties;)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object p0

    .line 293
    if-eqz p0, :cond_13

    .line 294
    .line 295
    invoke-static {p0}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 296
    .line 297
    .line 298
    move-result v2

    .line 299
    if-nez v2, :cond_13

    .line 300
    .line 301
    move-object v9, p0

    .line 302
    :cond_13
    invoke-static {v12}, Lcom/appsflyer/internal/b0;->c(Landroid/net/LinkProperties;)Z

    .line 303
    .line 304
    .line 305
    move-result p0

    .line 306
    new-instance v2, Lkotlin/Pair;

    .line 307
    .line 308
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 309
    .line 310
    .line 311
    move-result-object p0

    .line 312
    invoke-direct {v2, v9, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    move-object p0, v2

    .line 316
    :goto_a
    iget-object v2, p0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 317
    .line 318
    move-object v11, v2

    .line 319
    check-cast v11, Ljava/lang/String;

    .line 320
    .line 321
    iget-object p0, p0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 322
    .line 323
    move-object v12, p0

    .line 324
    check-cast v12, Ljava/lang/Boolean;

    .line 325
    .line 326
    new-instance v3, Lcom/appsflyer/internal/AFi1rSDK;

    .line 327
    .line 328
    iget-object v4, v0, Lcom/appsflyer/internal/AFi1xSDK;->unregisterClient:Ljava/lang/String;

    .line 329
    .line 330
    iget-boolean v5, v0, Lcom/appsflyer/internal/AFi1xSDK;->d:Z

    .line 331
    .line 332
    move-object v9, v1

    .line 333
    invoke-direct/range {v3 .. v12}, Lcom/appsflyer/internal/AFi1rSDK;-><init>(Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 334
    .line 335
    .line 336
    return-object v3
.end method

.method public abstract AFLogger()Ljava/lang/String;
.end method

.method public final E_()Landroid/net/ConnectivityManager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFi1ySDK;->d:Landroid/net/ConnectivityManager;

    .line 2
    .line 3
    return-object p0
.end method

.method public K_()Landroid/net/Network;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method

.method public L_()Landroid/net/NetworkCapabilities;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method

.method public abstract registerClient()Z
.end method

.method public final unregisterClient()Lcom/appsflyer/internal/AFi1xSDK;
    .locals 12

    .line 1
    const/4 v1, 0x0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFi1ySDK;->AFLogger:Landroid/telephony/TelephonyManager;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSimOperatorName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 10
    :try_start_1
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-nez v3, :cond_2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    move-object v5, v0

    .line 25
    move-object v0, v1

    .line 26
    move-object v1, v2

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    :goto_0
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getPhoneType()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v3, 0x2

    .line 33
    if-ne v0, v3, :cond_2

    .line 34
    .line 35
    const-string v0, "CDMA"
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :catchall_1
    move-exception v0

    .line 39
    move-object v5, v0

    .line 40
    move-object v0, v1

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move-object v2, v1

    .line 43
    goto :goto_3

    .line 44
    :goto_1
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 45
    .line 46
    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->DEVICE_DATA:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 47
    .line 48
    const/16 v10, 0x78

    .line 49
    .line 50
    const/4 v11, 0x0

    .line 51
    const-string v4, "Exception while collecting network info"

    .line 52
    .line 53
    const/4 v6, 0x0

    .line 54
    const/4 v7, 0x0

    .line 55
    const/4 v8, 0x0

    .line 56
    const/4 v9, 0x0

    .line 57
    invoke-static/range {v2 .. v11}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    move-object v2, v1

    .line 61
    :goto_2
    move-object v1, v0

    .line 62
    :cond_2
    :goto_3
    new-instance v0, Lcom/appsflyer/internal/AFi1xSDK;

    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFi1ySDK;->AFLogger()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFi1ySDK;->registerClient()Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    invoke-direct {v0, v3, v1, v2, p0}, Lcom/appsflyer/internal/AFi1xSDK;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 73
    .line 74
    .line 75
    return-object v0
.end method
