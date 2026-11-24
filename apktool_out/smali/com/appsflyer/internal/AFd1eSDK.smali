.class public final Lcom/appsflyer/internal/AFd1eSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFe1vSDK;


# instance fields
.field private final AFKeystoreWrapper:Lcom/appsflyer/AppsFlyerProperties;

.field private final AFLogger:Lcom/appsflyer/internal/AFe1wSDK;

.field private final d:Lcom/appsflyer/internal/AFc1bSDK;

.field private final registerClient:Lcom/appsflyer/internal/AFc1kSDK;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFc1kSDK;Lcom/appsflyer/AppsFlyerProperties;Lcom/appsflyer/internal/AFe1wSDK;Lcom/appsflyer/internal/AFc1bSDK;)V
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
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/appsflyer/internal/AFd1eSDK;->registerClient:Lcom/appsflyer/internal/AFc1kSDK;

    .line 17
    .line 18
    iput-object p2, p0, Lcom/appsflyer/internal/AFd1eSDK;->AFKeystoreWrapper:Lcom/appsflyer/AppsFlyerProperties;

    .line 19
    .line 20
    iput-object p3, p0, Lcom/appsflyer/internal/AFd1eSDK;->AFLogger:Lcom/appsflyer/internal/AFe1wSDK;

    .line 21
    .line 22
    iput-object p4, p0, Lcom/appsflyer/internal/AFd1eSDK;->d:Lcom/appsflyer/internal/AFc1bSDK;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final AFKeystoreWrapper(Lcom/appsflyer/internal/AFe1ySDK;Lcom/appsflyer/internal/AFd1cSDK;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFe1ySDK<",
            "*>;",
            "Lcom/appsflyer/internal/AFd1cSDK;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    instance-of v0, p1, Lcom/appsflyer/internal/AFf1tSDK;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    check-cast p1, Lcom/appsflyer/internal/AFf1tSDK;

    .line 12
    .line 13
    sget-object v0, Lcom/appsflyer/internal/AFd1cSDK;->d:Lcom/appsflyer/internal/AFd1cSDK;

    .line 14
    .line 15
    if-ne p2, v0, :cond_2

    .line 16
    .line 17
    iget-object p2, p0, Lcom/appsflyer/internal/AFd1eSDK;->registerClient:Lcom/appsflyer/internal/AFc1kSDK;

    .line 18
    .line 19
    const-string v0, "sentSuccessfully"

    .line 20
    .line 21
    const-string v1, "true"

    .line 22
    .line 23
    invoke-interface {p2, v0, v1}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    instance-of p2, p1, Lcom/appsflyer/internal/AFf1qSDK;

    .line 27
    .line 28
    if-nez p2, :cond_0

    .line 29
    .line 30
    new-instance p2, Lcom/appsflyer/internal/AFg1vSDK;

    .line 31
    .line 32
    invoke-direct {p2}, Lcom/appsflyer/internal/AFg1vSDK;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2}, Lcom/appsflyer/internal/AFg1vSDK;->d()Lcom/appsflyer/internal/AFg1sSDK;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    if-eqz p2, :cond_0

    .line 40
    .line 41
    iget-boolean v0, p2, Lcom/appsflyer/internal/AFg1sSDK;->AFLogger:Z

    .line 42
    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    iget-object p2, p2, Lcom/appsflyer/internal/AFg1sSDK;->AFKeystoreWrapper:Ljava/lang/String;

    .line 46
    .line 47
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 48
    .line 49
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->UNINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 50
    .line 51
    const-string v2, "Resending Uninstall token to AF servers: "

    .line 52
    .line 53
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-static {}, Lcom/appsflyer/internal/AFa1tSDK;->d()Lcom/appsflyer/internal/AFa1tSDK;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iget-object v0, v0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 69
    .line 70
    new-instance v1, Lcom/appsflyer/internal/AFf1qSDK;

    .line 71
    .line 72
    invoke-direct {v1, p2, v0}, Lcom/appsflyer/internal/AFf1qSDK;-><init>(Ljava/lang/String;Lcom/appsflyer/internal/AFc1bSDK;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->afWarnLog()Lcom/appsflyer/internal/AFe1wSDK;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-virtual {p2, v1}, Lcom/appsflyer/internal/AFe1wSDK;->d(Lcom/appsflyer/internal/AFe1ySDK;)V

    .line 80
    .line 81
    .line 82
    :cond_0
    iget-object p1, p1, Lcom/appsflyer/internal/AFe1kSDK;->i:Lcom/appsflyer/internal/AFd1fSDK;

    .line 83
    .line 84
    if-eqz p1, :cond_2

    .line 85
    .line 86
    invoke-virtual {p1}, Lcom/appsflyer/internal/AFd1fSDK;->getBody()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    check-cast p1, Ljava/lang/String;

    .line 91
    .line 92
    iget-object p0, p0, Lcom/appsflyer/internal/AFd1eSDK;->AFKeystoreWrapper:Lcom/appsflyer/AppsFlyerProperties;

    .line 93
    .line 94
    invoke-static {p1, p0}, Lcom/appsflyer/internal/AFa1rSDK;->AFKeystoreWrapper(Ljava/lang/String;Lcom/appsflyer/AppsFlyerProperties;)Lorg/json/JSONObject;

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_1
    instance-of p1, p1, Lcom/appsflyer/internal/AFg1lSDK;

    .line 99
    .line 100
    if-eqz p1, :cond_2

    .line 101
    .line 102
    sget-object p1, Lcom/appsflyer/internal/AFd1cSDK;->d:Lcom/appsflyer/internal/AFd1cSDK;

    .line 103
    .line 104
    if-eq p2, p1, :cond_2

    .line 105
    .line 106
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1eSDK;->AFLogger:Lcom/appsflyer/internal/AFe1wSDK;

    .line 107
    .line 108
    new-instance p2, Lcom/appsflyer/internal/AFg1mSDK;

    .line 109
    .line 110
    iget-object p0, p0, Lcom/appsflyer/internal/AFd1eSDK;->d:Lcom/appsflyer/internal/AFc1bSDK;

    .line 111
    .line 112
    invoke-direct {p2, p0}, Lcom/appsflyer/internal/AFg1mSDK;-><init>(Lcom/appsflyer/internal/AFc1bSDK;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, p2}, Lcom/appsflyer/internal/AFe1wSDK;->d(Lcom/appsflyer/internal/AFe1ySDK;)V

    .line 116
    .line 117
    .line 118
    :cond_2
    return-void
.end method

.method public final d(Lcom/appsflyer/internal/AFe1ySDK;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFe1ySDK<",
            "*>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final registerClient(Lcom/appsflyer/internal/AFe1ySDK;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFe1ySDK<",
            "*>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final unregisterClient(Lcom/appsflyer/internal/AFe1ySDK;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFe1ySDK<",
            "*>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
