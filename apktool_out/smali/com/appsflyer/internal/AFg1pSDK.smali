.class public final Lcom/appsflyer/internal/AFg1pSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFg1wSDK;


# static fields
.field private static unregisterClient:Landroid/content/IntentFilter;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/content/IntentFilter;

    .line 2
    .line 3
    const-string v1, "android.intent.action.BATTERY_CHANGED"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/appsflyer/internal/AFg1pSDK;->unregisterClient:Landroid/content/IntentFilter;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final registerClient(Landroid/content/Context;)Lcom/appsflyer/internal/AFg1wSDK$AFa1vSDK;
    .locals 8

    .line 1
    const/4 p0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    sget-object v0, Lcom/appsflyer/internal/AFg1pSDK;->unregisterClient:Landroid/content/IntentFilter;

    .line 4
    .line 5
    invoke-virtual {p1, p0, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_4

    .line 10
    .line 11
    const-string v0, "status"

    .line 12
    .line 13
    const/4 v2, -0x1

    .line 14
    invoke-virtual {p1, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v3, 0x2

    .line 19
    if-ne v3, v0, :cond_3

    .line 20
    .line 21
    const-string v0, "plugged"

    .line 22
    .line 23
    invoke-virtual {p1, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v4, 0x1

    .line 28
    if-eq v0, v4, :cond_2

    .line 29
    .line 30
    if-eq v0, v3, :cond_1

    .line 31
    .line 32
    const/4 v3, 0x4

    .line 33
    if-eq v0, v3, :cond_0

    .line 34
    .line 35
    const-string p0, "other"

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    move-object p1, v0

    .line 40
    move-object v5, p1

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    const-string p0, "wireless"

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const-string p0, "usb"

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const-string p0, "ac"

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    const-string p0, "no"

    .line 52
    .line 53
    :goto_0
    const-string v0, "level"

    .line 54
    .line 55
    invoke-virtual {p1, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    const-string v3, "scale"

    .line 60
    .line 61
    invoke-virtual {p1, v3, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 62
    .line 63
    .line 64
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    if-eq v2, v0, :cond_4

    .line 66
    .line 67
    if-eq v2, p1, :cond_4

    .line 68
    .line 69
    const/high16 v1, 0x42c80000    # 100.0f

    .line 70
    .line 71
    int-to-float v0, v0

    .line 72
    mul-float/2addr v0, v1

    .line 73
    int-to-float p1, p1

    .line 74
    div-float v1, v0, p1

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :goto_1
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 78
    .line 79
    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->DEVICE_DATA:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 80
    .line 81
    const/4 v6, 0x0

    .line 82
    const/4 v7, 0x0

    .line 83
    const-string v4, "Failed to register receiver for battery status"

    .line 84
    .line 85
    invoke-virtual/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 86
    .line 87
    .line 88
    :cond_4
    :goto_2
    new-instance p1, Lcom/appsflyer/internal/AFg1wSDK$AFa1vSDK;

    .line 89
    .line 90
    invoke-direct {p1, v1, p0}, Lcom/appsflyer/internal/AFg1wSDK$AFa1vSDK;-><init>(FLjava/lang/String;)V

    .line 91
    .line 92
    .line 93
    return-object p1
.end method
