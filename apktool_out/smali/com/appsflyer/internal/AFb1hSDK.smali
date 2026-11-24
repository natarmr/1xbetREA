.class public final Lcom/appsflyer/internal/AFb1hSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFb1bSDK$AFa1zSDK;


# instance fields
.field private final AFKeystoreWrapper:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

.field private final d:Lcom/appsflyer/internal/AFf1mSDK;

.field private final registerClient:Lcom/appsflyer/internal/AFh1sSDK;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFc1bSDK;Lkotlin/jvm/functions/Function0;Lcom/appsflyer/internal/AFf1mSDK;Lcom/appsflyer/internal/AFh1sSDK;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFc1bSDK;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/appsflyer/internal/AFf1mSDK;",
            "Lcom/appsflyer/internal/AFh1sSDK;",
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
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    .line 14
    .line 15
    iput-object p2, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFKeystoreWrapper:Lkotlin/jvm/functions/Function0;

    .line 16
    .line 17
    iput-object p3, p0, Lcom/appsflyer/internal/AFb1hSDK;->d:Lcom/appsflyer/internal/AFf1mSDK;

    .line 18
    .line 19
    iput-object p4, p0, Lcom/appsflyer/internal/AFb1hSDK;->registerClient:Lcom/appsflyer/internal/AFh1sSDK;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final m_(Landroid/content/Intent;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 5
    .line 6
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 7
    .line 8
    const/4 v4, 0x4

    .line 9
    const/4 v5, 0x0

    .line 10
    const-string v2, "onActivityCreated with deeplink"

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-static/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    .line 17
    .line 18
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->enableTCFDataCollection()Lcom/appsflyer/internal/AFa1qSDK;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget-object v1, Lcom/appsflyer/internal/AFa1kSDK;->AFa1zSDK:Lcom/appsflyer/internal/AFa1kSDK$AFa1zSDK;

    .line 23
    .line 24
    iget-object v1, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    .line 25
    .line 26
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->setUserPhone()Lcom/appsflyer/internal/AFa1lSDK;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-static {v1}, Lcom/appsflyer/internal/AFa1kSDK$AFa1zSDK;->d(Lcom/appsflyer/internal/AFa1lSDK;)Lcom/appsflyer/internal/AFa1kSDK;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object p0, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    .line 38
    .line 39
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    iget-object p0, p0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 44
    .line 45
    invoke-virtual {v0, v1, p1, p0}, Lcom/appsflyer/internal/AFa1qSDK;->b_(Lcom/appsflyer/internal/AFa1kSDK;Landroid/content/Intent;Landroid/content/Context;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final n_(Landroid/content/Intent;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 5
    .line 6
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 7
    .line 8
    const/4 v4, 0x4

    .line 9
    const/4 v5, 0x0

    .line 10
    const-string v2, "onBecameForeground"

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-static/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    .line 17
    .line 18
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->e()Lcom/appsflyer/internal/AFh1xSDK;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFh1xSDK;->AFLogger()V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    .line 26
    .line 27
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAppInviteOneLink()Lcom/appsflyer/internal/AFj1wSDK;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {v0, p1}, Lcom/appsflyer/internal/AFj1wSDK;->R_(Landroid/content/Intent;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    .line 35
    .line 36
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->enableTCFDataCollection()Lcom/appsflyer/internal/AFa1qSDK;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sget-object v1, Lcom/appsflyer/internal/AFa1kSDK;->AFa1zSDK:Lcom/appsflyer/internal/AFa1kSDK$AFa1zSDK;

    .line 41
    .line 42
    iget-object v1, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    .line 43
    .line 44
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->setUserPhone()Lcom/appsflyer/internal/AFa1lSDK;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {v1}, Lcom/appsflyer/internal/AFa1kSDK$AFa1zSDK;->d(Lcom/appsflyer/internal/AFa1lSDK;)Lcom/appsflyer/internal/AFa1kSDK;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    iget-object v2, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    .line 56
    .line 57
    invoke-interface {v2}, Lcom/appsflyer/internal/AFc1bSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    iget-object v2, v2, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 62
    .line 63
    invoke-virtual {v0, v1, p1, v2}, Lcom/appsflyer/internal/AFa1qSDK;->b_(Lcom/appsflyer/internal/AFa1kSDK;Landroid/content/Intent;Landroid/content/Context;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    .line 67
    .line 68
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->i()Lcom/appsflyer/internal/AFf1hSDK;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iget-object v1, p0, Lcom/appsflyer/internal/AFb1hSDK;->d:Lcom/appsflyer/internal/AFf1mSDK;

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Lcom/appsflyer/internal/AFf1hSDK;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFf1mSDK;)V

    .line 75
    .line 76
    .line 77
    sget-boolean v0, Lcom/appsflyer/internal/AFe1jSDK;->force:Z

    .line 78
    .line 79
    if-nez v0, :cond_0

    .line 80
    .line 81
    iget-object v0, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    .line 82
    .line 83
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->afWarnLog()Lcom/appsflyer/internal/AFe1wSDK;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    new-instance v1, Lcom/appsflyer/internal/AFe1jSDK;

    .line 88
    .line 89
    iget-object v2, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    .line 90
    .line 91
    invoke-direct {v1, v2}, Lcom/appsflyer/internal/AFe1jSDK;-><init>(Lcom/appsflyer/internal/AFc1bSDK;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v1}, Lcom/appsflyer/internal/AFe1wSDK;->d(Lcom/appsflyer/internal/AFe1ySDK;)V

    .line 95
    .line 96
    .line 97
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    .line 98
    .line 99
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 104
    .line 105
    const-string v1, "appsFlyerCount"

    .line 106
    .line 107
    const/4 v2, 0x0

    .line 108
    invoke-interface {v0, v1, v2}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    const/4 v1, 0x2

    .line 113
    if-ge v0, v1, :cond_1

    .line 114
    .line 115
    iget-object v0, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    .line 116
    .line 117
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->afInfoLog()Lcom/appsflyer/internal/AFj1ySDK;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-interface {v0}, Lcom/appsflyer/internal/AFj1ySDK;->registerClient()V

    .line 122
    .line 123
    .line 124
    :cond_1
    iget-object v0, p0, Lcom/appsflyer/internal/AFb1hSDK;->registerClient:Lcom/appsflyer/internal/AFh1sSDK;

    .line 125
    .line 126
    if-eqz v0, :cond_2

    .line 127
    .line 128
    iget-object p0, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    .line 129
    .line 130
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->enableTCFDataCollection()Lcom/appsflyer/internal/AFa1qSDK;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    invoke-interface {v0, p1, p0}, Lcom/appsflyer/internal/AFh1sSDK;->D_(Landroid/content/Intent;Lcom/appsflyer/internal/AFa1qSDK;)V

    .line 138
    .line 139
    .line 140
    :cond_2
    return-void
.end method

.method public final registerClient()V
    .locals 10

    .line 1
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 2
    .line 3
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 4
    .line 5
    const/4 v4, 0x4

    .line 6
    const/4 v5, 0x0

    .line 7
    const-string v2, "onBecameBackground"

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-static/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    .line 14
    .line 15
    invoke-interface {v2}, Lcom/appsflyer/internal/AFc1bSDK;->e()Lcom/appsflyer/internal/AFh1xSDK;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    iget-wide v5, v2, Lcom/appsflyer/internal/AFh1xSDK;->e:J

    .line 24
    .line 25
    const-wide/16 v7, 0x0

    .line 26
    .line 27
    cmp-long v9, v5, v7

    .line 28
    .line 29
    if-eqz v9, :cond_1

    .line 30
    .line 31
    sub-long/2addr v3, v5

    .line 32
    cmp-long v0, v3, v7

    .line 33
    .line 34
    const-wide/16 v5, 0x3e8

    .line 35
    .line 36
    if-lez v0, :cond_0

    .line 37
    .line 38
    cmp-long v0, v3, v5

    .line 39
    .line 40
    if-gez v0, :cond_0

    .line 41
    .line 42
    move-wide v3, v5

    .line 43
    :cond_0
    div-long/2addr v3, v5

    .line 44
    iput-wide v3, v2, Lcom/appsflyer/internal/AFh1xSDK;->afInfoLog:J

    .line 45
    .line 46
    iget-object v0, v2, Lcom/appsflyer/internal/AFh1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 47
    .line 48
    const-string v1, "prev_session_dur"

    .line 49
    .line 50
    invoke-interface {v0, v1, v3, v4}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;J)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    const-string v2, "Metrics: fg ts is missing"

    .line 55
    .line 56
    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    .line 60
    .line 61
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAppInviteOneLink()Lcom/appsflyer/internal/AFj1wSDK;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-interface {v0}, Lcom/appsflyer/internal/AFj1wSDK;->registerClient()V

    .line 66
    .line 67
    .line 68
    iget-object p0, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFKeystoreWrapper:Lkotlin/jvm/functions/Function0;

    .line 69
    .line 70
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    return-void
.end method
