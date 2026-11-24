.class public Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;
.super Lcom/appsflyer/sdk_base/referrer/Referrer;
.source "SourceFile"


# instance fields
.field public final logger:Lcom/appsflyer/sdk_base/logger/AFLoggerBase;


# direct methods
.method public constructor <init>(Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V
    .locals 2

    .line 1
    const-string v0, "store"

    .line 2
    .line 3
    const-string v1, "xiaomi"

    .line 4
    .line 5
    invoke-direct {p0, v0, v1, p1}, Lcom/appsflyer/sdk_base/referrer/Referrer;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/appsflyer/sdk_base/referrer/ReferrerProp;->getLogger()Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;->logger:Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    .line 13
    .line 14
    return-void
.end method

.method public static bridge synthetic a(Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;Lcom/miui/referrer/api/GetAppsReferrerClient;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;->handleConnectionOK(Lcom/miui/referrer/api/GetAppsReferrerClient;)V

    return-void
.end method

.method private allow()Z
    .locals 4

    .line 1
    const-string v0, "com.miui.referrer.api.GetAppsReferrerClient"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;->logger:Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    .line 8
    .line 9
    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 10
    .line 11
    const-string v1, "Xiaomi Install Referrer is allowed"

    .line 12
    .line 13
    invoke-virtual {p0, v0, v1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    return p0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    iget-object p0, p0, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;->logger:Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    .line 20
    .line 21
    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 22
    .line 23
    const-string v3, "An error occurred while trying to access GetAppsReferrerClient"

    .line 24
    .line 25
    invoke-virtual {p0, v2, v3, v0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    return v1

    .line 29
    :catch_0
    iget-object p0, p0, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;->logger:Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    .line 30
    .line 31
    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 32
    .line 33
    const-string v2, "Class com.miui.referrer.api.GetAppsReferrerClient not found"

    .line 34
    .line 35
    invoke-virtual {p0, v0, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->v(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return v1
.end method

.method private handleConnectionOK(Lcom/miui/referrer/api/GetAppsReferrerClient;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 2
    .line 3
    const-string v1, "response"

    .line 4
    .line 5
    const-string v2, "OK"

    .line 6
    .line 7
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;->logger:Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    .line 11
    .line 12
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 13
    .line 14
    const-string v2, "XiaomiInstallReferrer connected"

    .line 15
    .line 16
    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/miui/referrer/api/GetAppsReferrerClient;->isReady()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/miui/referrer/api/GetAppsReferrerClient;->getInstallReferrer()Lcom/miui/referrer/api/GetAppsReferrerDetails;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Lcom/miui/referrer/api/GetAppsReferrerDetails;->getInstallReferrer()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    iget-object v1, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 36
    .line 37
    const-string v2, "referrer"

    .line 38
    .line 39
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/miui/referrer/api/GetAppsReferrerDetails;->getReferrerClickTimestampSeconds()J

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    iget-object v2, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 50
    .line 51
    const-string v3, "click_ts"

    .line 52
    .line 53
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/miui/referrer/api/GetAppsReferrerDetails;->getInstallBeginTimestampSeconds()J

    .line 61
    .line 62
    .line 63
    move-result-wide v0

    .line 64
    iget-object v2, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 65
    .line 66
    const-string v3, "install_begin_ts"

    .line 67
    .line 68
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    new-instance v0, Ljava/util/HashMap;

    .line 76
    .line 77
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 78
    .line 79
    .line 80
    const-string v1, "click_server_ts"

    .line 81
    .line 82
    invoke-virtual {p1}, Lcom/miui/referrer/api/GetAppsReferrerDetails;->getReferrerClickTimestampServerSeconds()J

    .line 83
    .line 84
    .line 85
    move-result-wide v2

    .line 86
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    const-string v1, "install_begin_server_ts"

    .line 94
    .line 95
    invoke-virtual {p1}, Lcom/miui/referrer/api/GetAppsReferrerDetails;->getInstallBeginTimestampServerSeconds()J

    .line 96
    .line 97
    .line 98
    move-result-wide v2

    .line 99
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    const-string v1, "install_version"

    .line 107
    .line 108
    invoke-virtual {p1}, Lcom/miui/referrer/api/GetAppsReferrerDetails;->getInstallVersion()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    iget-object p1, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 116
    .line 117
    const-string v1, "xiaomi_custom"

    .line 118
    .line 119
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :cond_1
    iget-object p1, p0, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;->logger:Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    .line 124
    .line 125
    const-string v0, "XiaomiReferrerClient: XiaomiInstallReferrer is not ready"

    .line 126
    .line 127
    invoke-virtual {p1, v1, v0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :goto_1
    invoke-virtual {p0, p1}, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;->onError(Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    return-void
.end method


# virtual methods
.method public onError(Ljava/lang/Throwable;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;->logger:Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    .line 2
    .line 3
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :goto_0
    move-object v2, p0

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    const-string p0, ""

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :goto_1
    const/4 v4, 0x0

    .line 21
    const/4 v5, 0x0

    .line 22
    move-object v3, p1

    .line 23
    invoke-virtual/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public start(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;->allow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/appsflyer/sdk_base/referrer/Referrer;->start()V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lcom/miui/referrer/api/GetAppsReferrerClient;->Companion:Lcom/miui/referrer/api/GetAppsReferrerClient$Companion;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcom/miui/referrer/api/GetAppsReferrerClient$Companion;->newBuilder(Landroid/content/Context;)Lcom/miui/referrer/api/GetAppsReferrerClient$Builder;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lcom/miui/referrer/api/GetAppsReferrerClient$Builder;->build()Lcom/miui/referrer/api/GetAppsReferrerClient;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer$1;

    .line 22
    .line 23
    invoke-direct {v1, p0, p1, v0}, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer$1;-><init>(Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;Landroid/content/Context;Lcom/miui/referrer/api/GetAppsReferrerClient;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/miui/referrer/api/GetAppsReferrerClient;->startConnection(Lcom/miui/referrer/api/GetAppsReferrerStateListener;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
