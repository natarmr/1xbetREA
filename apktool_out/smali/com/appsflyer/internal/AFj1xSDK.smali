.class public final Lcom/appsflyer/internal/AFj1xSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFj1wSDK;


# instance fields
.field private final AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1dSDK;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/appsflyer/internal/AFc1dSDK<",
            "Lcom/appsflyer/internal/AFa1qSDK;",
            ">;"
        }
    .end annotation
.end field

.field private final AFLogger:Lcom/appsflyer/internal/AFc1dSDK;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/appsflyer/internal/AFc1dSDK<",
            "Lcom/appsflyer/internal/AFc1iSDK;",
            ">;"
        }
    .end annotation
.end field

.field private volatile d:Lcom/appsflyer/share/SessionReadyListener;

.field private final i:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final registerClient:Lcom/appsflyer/internal/AFj1zSDK;

.field private final unregisterClient:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/appsflyer/internal/AFj1uSDK;",
            ">;"
        }
    .end annotation
.end field

.field private final w:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFc1dSDK;Lcom/appsflyer/internal/AFc1dSDK;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFc1dSDK<",
            "Lcom/appsflyer/internal/AFc1iSDK;",
            ">;",
            "Lcom/appsflyer/internal/AFc1dSDK<",
            "Lcom/appsflyer/internal/AFa1qSDK;",
            ">;)V"
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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/appsflyer/internal/AFj1xSDK;->AFLogger:Lcom/appsflyer/internal/AFc1dSDK;

    .line 11
    .line 12
    iput-object p2, p0, Lcom/appsflyer/internal/AFj1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1dSDK;

    .line 13
    .line 14
    new-instance p1, Lcom/appsflyer/internal/AFj1zSDK;

    .line 15
    .line 16
    invoke-direct {p1}, Lcom/appsflyer/internal/AFj1zSDK;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/appsflyer/internal/AFj1xSDK;->registerClient:Lcom/appsflyer/internal/AFj1zSDK;

    .line 20
    .line 21
    new-instance p1, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lcom/appsflyer/internal/AFj1xSDK;->unregisterClient:Ljava/util/List;

    .line 27
    .line 28
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 29
    .line 30
    const/4 p2, 0x0

    .line 31
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lcom/appsflyer/internal/AFj1xSDK;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 35
    .line 36
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 37
    .line 38
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lcom/appsflyer/internal/AFj1xSDK;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 42
    .line 43
    return-void
.end method

.method private final e()V
    .locals 10

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFj1xSDK;->d:Lcom/appsflyer/share/SessionReadyListener;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    :try_start_0
    invoke-interface {p0}, Lcom/appsflyer/share/SessionReadyListener;->onSessionReady()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception v0

    .line 10
    move-object v3, v0

    .line 11
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 12
    .line 13
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 14
    .line 15
    const/16 v8, 0x78

    .line 16
    .line 17
    const/4 v9, 0x0

    .line 18
    const-string v2, "Error in onSessionReady callback"

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v7, 0x0

    .line 24
    invoke-static/range {v0 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method private final unregisterClient()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->unregisterClient:Ljava/util/List;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_5

    .line 20
    .line 21
    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_5

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lcom/appsflyer/internal/AFj1uSDK;

    .line 36
    .line 37
    invoke-interface {v1}, Lcom/appsflyer/internal/AFj1uSDK;->unregisterClient()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    iget-object p0, p0, Lcom/appsflyer/internal/AFj1xSDK;->unregisterClient:Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    move-object v1, v0

    .line 60
    check-cast v1, Lcom/appsflyer/internal/AFj1uSDK;

    .line 61
    .line 62
    invoke-interface {v1}, Lcom/appsflyer/internal/AFj1uSDK;->unregisterClient()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_3

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    const/4 v0, 0x0

    .line 70
    :goto_0
    check-cast v0, Lcom/appsflyer/internal/AFj1uSDK;

    .line 71
    .line 72
    if-eqz v0, :cond_7

    .line 73
    .line 74
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 75
    .line 76
    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 77
    .line 78
    invoke-interface {v0}, Lcom/appsflyer/internal/AFj1uSDK;->d()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    const-string v0, "Condition not satisfied: "

    .line 83
    .line 84
    invoke-static {v0, p0}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    const/4 v5, 0x4

    .line 89
    const/4 v6, 0x0

    .line 90
    const/4 v4, 0x0

    .line 91
    invoke-static/range {v1 .. v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_5
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->d:Lcom/appsflyer/share/SessionReadyListener;

    .line 96
    .line 97
    if-nez v0, :cond_6

    .line 98
    .line 99
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 100
    .line 101
    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 102
    .line 103
    const/4 v5, 0x4

    .line 104
    const/4 v6, 0x0

    .line 105
    const-string v3, "All conditions satisfied but no listener registered yet"

    .line 106
    .line 107
    const/4 v4, 0x0

    .line 108
    invoke-static/range {v1 .. v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_6
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 113
    .line 114
    const/4 v1, 0x0

    .line 115
    const/4 v2, 0x1

    .line 116
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-eqz v0, :cond_7

    .line 121
    .line 122
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 123
    .line 124
    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 125
    .line 126
    const/4 v5, 0x4

    .line 127
    const/4 v6, 0x0

    .line 128
    const-string v3, "All session readiness conditions satisfied, triggering callback"

    .line 129
    .line 130
    const/4 v4, 0x0

    .line 131
    invoke-static/range {v1 .. v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    invoke-direct {p0}, Lcom/appsflyer/internal/AFj1xSDK;->e()V

    .line 135
    .line 136
    .line 137
    :cond_7
    :goto_1
    return-void
.end method


# virtual methods
.method public final AFKeystoreWrapper()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->unregisterClient:Ljava/util/List;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFj1xSDK;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 7
    .line 8
    .line 9
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    const/4 v2, 0x0

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    monitor-exit v0

    .line 14
    return v2

    .line 15
    :cond_0
    :try_start_1
    iget-object p0, p0, Lcom/appsflyer/internal/AFj1xSDK;->unregisterClient:Ljava/util/List;

    .line 16
    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_3

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    goto :goto_2

    .line 28
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Lcom/appsflyer/internal/AFj1uSDK;

    .line 43
    .line 44
    invoke-interface {v1}, Lcom/appsflyer/internal/AFj1uSDK;->unregisterClient()Z

    .line 45
    .line 46
    .line 47
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    if-nez v1, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_3
    const/4 v2, 0x1

    .line 52
    :goto_1
    monitor-exit v0

    .line 53
    return v2

    .line 54
    :goto_2
    monitor-exit v0

    .line 55
    throw p0
.end method

.method public final AFLogger()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFj1xSDK;->d:Lcom/appsflyer/share/SessionReadyListener;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final R_(Landroid/content/Intent;)V
    .locals 9

    .line 1
    const-string v0, "Starting session readiness evaluation for launch counter: "

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/appsflyer/internal/AFj1xSDK;->unregisterClient:Ljava/util/List;

    .line 7
    .line 8
    monitor-enter v1

    .line 9
    :try_start_0
    iget-object v2, p0, Lcom/appsflyer/internal/AFj1xSDK;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 13
    .line 14
    .line 15
    iget-object v2, p0, Lcom/appsflyer/internal/AFj1xSDK;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 19
    .line 20
    .line 21
    iget-object v2, p0, Lcom/appsflyer/internal/AFj1xSDK;->AFLogger:Lcom/appsflyer/internal/AFc1dSDK;

    .line 22
    .line 23
    iget-object v2, v2, Lcom/appsflyer/internal/AFc1dSDK;->AFKeystoreWrapper:Lkotlin/jvm/functions/Function0;

    .line 24
    .line 25
    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Lcom/appsflyer/internal/AFc1iSDK;

    .line 30
    .line 31
    iget-object v2, v2, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 32
    .line 33
    const-string v4, "appsFlyerCount"

    .line 34
    .line 35
    invoke-interface {v2, v4, v3}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 40
    .line 41
    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 42
    .line 43
    new-instance v5, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    const/4 v7, 0x4

    .line 56
    const/4 v8, 0x0

    .line 57
    const/4 v6, 0x0

    .line 58
    invoke-static/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    if-nez v2, :cond_0

    .line 62
    .line 63
    const-string v5, "Conversion event: no additional conditions required"

    .line 64
    .line 65
    const/4 v7, 0x4

    .line 66
    const/4 v8, 0x0

    .line 67
    const/4 v6, 0x0

    .line 68
    invoke-static/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :catchall_0
    move-exception v0

    .line 73
    move-object p0, v0

    .line 74
    goto :goto_1

    .line 75
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1dSDK;

    .line 76
    .line 77
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1dSDK;->AFKeystoreWrapper:Lkotlin/jvm/functions/Function0;

    .line 78
    .line 79
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    check-cast v0, Lcom/appsflyer/internal/AFa1qSDK;

    .line 84
    .line 85
    invoke-virtual {v0, p1}, Lcom/appsflyer/internal/AFa1qSDK;->e_(Landroid/content/Intent;)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-eqz p1, :cond_1

    .line 90
    .line 91
    iget-object p1, p0, Lcom/appsflyer/internal/AFj1xSDK;->unregisterClient:Ljava/util/List;

    .line 92
    .line 93
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->registerClient:Lcom/appsflyer/internal/AFj1zSDK;

    .line 94
    .line 95
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    const-string v5, "Added deeplink condition for launch event (has deeplink)"

    .line 99
    .line 100
    const/4 v7, 0x4

    .line 101
    const/4 v8, 0x0

    .line 102
    const/4 v6, 0x0

    .line 103
    invoke-static/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_1
    const-string v5, "Deeplink condition not needed for launch event (no deeplink)"

    .line 108
    .line 109
    const/4 v7, 0x4

    .line 110
    const/4 v8, 0x0

    .line 111
    const/4 v6, 0x0

    .line 112
    invoke-static/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    :goto_0
    invoke-direct {p0}, Lcom/appsflyer/internal/AFj1xSDK;->unregisterClient()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    .line 117
    .line 118
    monitor-exit v1

    .line 119
    return-void

    .line 120
    :goto_1
    monitor-exit v1

    .line 121
    throw p0
.end method

.method public final d()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->registerClient:Lcom/appsflyer/internal/AFj1zSDK;

    .line 2
    .line 3
    iget-boolean v0, v0, Lcom/appsflyer/internal/AFj1zSDK;->AFLogger:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFj1xSDK;->unregisterClient:Ljava/util/List;

    .line 9
    .line 10
    monitor-enter v1

    .line 11
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->registerClient:Lcom/appsflyer/internal/AFj1zSDK;

    .line 12
    .line 13
    iget-boolean v2, v0, Lcom/appsflyer/internal/AFj1zSDK;->AFLogger:Z

    .line 14
    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    iput-boolean v2, v0, Lcom/appsflyer/internal/AFj1zSDK;->AFLogger:Z

    .line 19
    .line 20
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 21
    .line 22
    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 23
    .line 24
    const-string v5, "Deeplink processed condition satisfied"

    .line 25
    .line 26
    const/4 v7, 0x4

    .line 27
    const/4 v8, 0x0

    .line 28
    const/4 v6, 0x0

    .line 29
    invoke-static/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    move-object p0, v0

    .line 35
    goto :goto_2

    .line 36
    :cond_1
    :goto_0
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 37
    .line 38
    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 39
    .line 40
    const-string v4, "Deeplink condition satisfied"

    .line 41
    .line 42
    const/4 v6, 0x4

    .line 43
    const/4 v7, 0x0

    .line 44
    const/4 v5, 0x0

    .line 45
    invoke-static/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->unregisterClient:Ljava/util/List;

    .line 57
    .line 58
    iget-object v2, p0, Lcom/appsflyer/internal/AFj1xSDK;->registerClient:Lcom/appsflyer/internal/AFj1zSDK;

    .line 59
    .line 60
    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    invoke-direct {p0}, Lcom/appsflyer/internal/AFj1xSDK;->unregisterClient()V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    const-string v4, "Evaluation not started yet, condition will be checked when evaluation begins"

    .line 71
    .line 72
    const/4 v6, 0x4

    .line 73
    const/4 v7, 0x0

    .line 74
    const/4 v5, 0x0

    .line 75
    invoke-static/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    .line 77
    .line 78
    :cond_3
    :goto_1
    monitor-exit v1

    .line 79
    return-void

    .line 80
    :goto_2
    monitor-exit v1

    .line 81
    throw p0
.end method

.method public final d(Lcom/appsflyer/share/SessionReadyListener;)V
    .locals 8

    .line 82
    iget-object v1, p0, Lcom/appsflyer/internal/AFj1xSDK;->unregisterClient:Ljava/util/List;

    monitor-enter v1

    .line 83
    :try_start_0
    iput-object p1, p0, Lcom/appsflyer/internal/AFj1xSDK;->d:Lcom/appsflyer/share/SessionReadyListener;

    if-nez p1, :cond_0

    .line 84
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v4, "Session ready listener unregistered"

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_1

    .line 85
    :cond_0
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v4, "Session ready listener registered"

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 86
    iget-object p1, p0, Lcom/appsflyer/internal/AFj1xSDK;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/appsflyer/internal/AFj1xSDK;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-nez p1, :cond_1

    .line 87
    invoke-direct {p0}, Lcom/appsflyer/internal/AFj1xSDK;->unregisterClient()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    :cond_1
    :goto_0
    monitor-exit v1

    return-void

    :goto_1
    monitor-exit v1

    throw p0
.end method

.method public final registerClient()V
    .locals 9

    .line 1
    iget-object v1, p0, Lcom/appsflyer/internal/AFj1xSDK;->unregisterClient:Ljava/util/List;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->registerClient:Lcom/appsflyer/internal/AFj1zSDK;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    iput-boolean v2, v0, Lcom/appsflyer/internal/AFj1zSDK;->AFLogger:Z

    .line 8
    .line 9
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->unregisterClient:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Lcom/appsflyer/internal/AFj1uSDK;

    .line 26
    .line 27
    invoke-interface {v3}, Lcom/appsflyer/internal/AFj1uSDK;->registerClient()V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    move-object p0, v0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->unregisterClient:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 42
    .line 43
    .line 44
    iget-object p0, p0, Lcom/appsflyer/internal/AFj1xSDK;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 45
    .line 46
    invoke-virtual {p0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 47
    .line 48
    .line 49
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 50
    .line 51
    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 52
    .line 53
    const-string v5, "Session readiness evaluation finished"

    .line 54
    .line 55
    const/4 v7, 0x4

    .line 56
    const/4 v8, 0x0

    .line 57
    const/4 v6, 0x0

    .line 58
    invoke-static/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    monitor-exit v1

    .line 62
    return-void

    .line 63
    :goto_1
    monitor-exit v1

    .line 64
    throw p0
.end method
