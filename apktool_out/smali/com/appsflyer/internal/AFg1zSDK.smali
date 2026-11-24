.class public final Lcom/appsflyer/internal/AFg1zSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFg1xSDK;


# instance fields
.field private final AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1eSDK;

.field private final unregisterClient:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/appsflyer/internal/AFc1eSDK;)V
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
    iput-object p1, p0, Lcom/appsflyer/internal/AFg1zSDK;->unregisterClient:Landroid/content/Context;

    .line 11
    .line 12
    iput-object p2, p0, Lcom/appsflyer/internal/AFg1zSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1eSDK;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final registerClient()Lcom/appsflyer/internal/AFg1ySDK;
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1zSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1eSDK;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->afDebugLog:Ljava/lang/Boolean;

    .line 4
    .line 5
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return-object v1

    .line 15
    :cond_0
    :try_start_0
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1zSDK;->unregisterClient:Landroid/content/Context;

    .line 16
    .line 17
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string v0, "IABTCF_gdprApplies"

    .line 22
    .line 23
    const/4 v2, -0x1

    .line 24
    invoke-interface {p0, v0, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    const-string v0, "IABTCF_CmpSdkID"

    .line 29
    .line 30
    invoke-interface {p0, v0, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    const-string v0, "IABTCF_PolicyVersion"

    .line 35
    .line 36
    invoke-interface {p0, v0, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    const-string v0, "IABTCF_CmpSdkVersion"

    .line 41
    .line 42
    invoke-interface {p0, v0, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 43
    .line 44
    .line 45
    move-result v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    const/4 v0, 0x1

    .line 47
    const-string v2, ""

    .line 48
    .line 49
    if-ne v5, v0, :cond_2

    .line 50
    .line 51
    :try_start_1
    const-string v0, "IABTCF_TCString"

    .line 52
    .line 53
    invoke-interface {p0, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    if-nez p0, :cond_1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    move-object v2, p0

    .line 61
    :cond_2
    :goto_0
    move-object v8, v2

    .line 62
    goto :goto_1

    .line 63
    :catch_0
    move-exception v0

    .line 64
    move-object p0, v0

    .line 65
    move-object v5, p0

    .line 66
    goto :goto_2

    .line 67
    :goto_1
    new-instance v3, Lcom/appsflyer/internal/AFg1ySDK;

    .line 68
    .line 69
    invoke-direct/range {v3 .. v8}, Lcom/appsflyer/internal/AFg1ySDK;-><init>(IIIILjava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 70
    .line 71
    .line 72
    return-object v3

    .line 73
    :goto_2
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 74
    .line 75
    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->DMA:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 76
    .line 77
    const/16 v10, 0x78

    .line 78
    .line 79
    const/4 v11, 0x0

    .line 80
    const-string v4, "TCF data collection exception"

    .line 81
    .line 82
    const/4 v6, 0x0

    .line 83
    const/4 v7, 0x0

    .line 84
    const/4 v8, 0x0

    .line 85
    const/4 v9, 0x0

    .line 86
    invoke-static/range {v2 .. v11}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    return-object v1
.end method
