.class public Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;
.super Ljava/util/TimerTask;
.source "SourceFile"


# static fields
.field private static logger:Landroid/gov/nist/core/StackLogger;

.field private static timerThreadCount:I


# instance fields
.field private queue:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "+",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private started:Z

.field private timeout:I

.field private timer:Ljava/util/Timer;

.field private totalReject:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/gov/nist/core/CommonLogger;->getLogger(Ljava/lang/Class;)Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->logger:Landroid/gov/nist/core/StackLogger;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/util/Queue;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Queue<",
            "+",
            "Ljava/lang/Runnable;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->timer:Ljava/util/Timer;

    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    iput-wide v0, p0, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->totalReject:J

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->started:Z

    .line 13
    .line 14
    const/16 v0, 0x1f40

    .line 15
    .line 16
    iput v0, p0, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->timeout:I

    .line 17
    .line 18
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->queue:Ljava/util/Queue;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public getTimeout()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->timeout:I

    .line 2
    .line 3
    return p0
.end method

.method public run()V
    .locals 8

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->queue:Ljava/util/Queue;

    .line 4
    .line 5
    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    :try_start_1
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->queue:Ljava/util/Queue;

    .line 7
    .line 8
    invoke-interface {v2}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, Landroid/gov/nist/javax/sip/stack/QueuedMessageDispatchBase;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    :goto_0
    if-eqz v2, :cond_1

    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    .line 19
    .line 20
    move-result-wide v4

    .line 21
    invoke-interface {v2}, Landroid/gov/nist/javax/sip/stack/QueuedMessageDispatchBase;->getReceptionTime()J

    .line 22
    .line 23
    .line 24
    move-result-wide v6

    .line 25
    sub-long/2addr v4, v6

    .line 26
    iget v2, p0, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->timeout:I

    .line 27
    .line 28
    int-to-long v6, v2

    .line 29
    cmp-long v2, v4, v6

    .line 30
    .line 31
    if-lez v2, :cond_0

    .line 32
    .line 33
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->queue:Ljava/util/Queue;

    .line 34
    .line 35
    invoke-interface {v2}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->queue:Ljava/util/Queue;

    .line 39
    .line 40
    invoke-interface {v2}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Landroid/gov/nist/javax/sip/stack/QueuedMessageDispatchBase;

    .line 45
    .line 46
    add-int/lit8 v3, v3, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p0

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    const/4 v2, 0x0

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    if-lez v3, :cond_2

    .line 55
    .line 56
    :try_start_2
    iget-wide v1, p0, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->totalReject:J

    .line 57
    .line 58
    int-to-long v4, v3

    .line 59
    add-long/2addr v1, v4

    .line 60
    iput-wide v1, p0, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->totalReject:J

    .line 61
    .line 62
    sget-object v1, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->logger:Landroid/gov/nist/core/StackLogger;

    .line 63
    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    invoke-interface {v1, v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_2

    .line 71
    .line 72
    sget-object v1, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->logger:Landroid/gov/nist/core/StackLogger;

    .line 73
    .line 74
    new-instance v2, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    const-string v4, "Removed stuck messages="

    .line 80
    .line 81
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v3, " total rejected="

    .line 88
    .line 89
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    iget-wide v3, p0, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->totalReject:J

    .line 93
    .line 94
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string v3, " stil in queue="

    .line 98
    .line 99
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->queue:Ljava/util/Queue;

    .line 103
    .line 104
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-interface {v1, p0}, Landroid/gov/nist/core/StackLogger;->logWarning(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :catch_0
    move-exception p0

    .line 120
    goto :goto_2

    .line 121
    :goto_1
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 122
    :try_start_4
    throw p0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 123
    :goto_2
    sget-object v1, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->logger:Landroid/gov/nist/core/StackLogger;

    .line 124
    .line 125
    if-eqz v1, :cond_2

    .line 126
    .line 127
    invoke-interface {v1, v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_2

    .line 132
    .line 133
    sget-object v0, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->logger:Landroid/gov/nist/core/StackLogger;

    .line 134
    .line 135
    new-instance v1, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    const-string v2, "Problem reaping old requests. This is not a fatal error."

    .line 138
    .line 139
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-interface {v0, p0}, Landroid/gov/nist/core/StackLogger;->logWarning(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    :cond_2
    return-void
.end method

.method public setTimeout(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->timeout:I

    .line 2
    .line 3
    return-void
.end method

.method public start(I)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->started:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->stop()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->started:Z

    .line 10
    .line 11
    new-instance v1, Ljava/util/Timer;

    .line 12
    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v3, "BlockingQueueDispatchAuditor-Timer-"

    .line 16
    .line 17
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sget v3, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->timerThreadCount:I

    .line 21
    .line 22
    add-int/lit8 v4, v3, 0x1

    .line 23
    .line 24
    sput v4, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->timerThreadCount:I

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-direct {v1, v2, v0}, Ljava/util/Timer;-><init>(Ljava/lang/String;Z)V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->timer:Ljava/util/Timer;

    .line 37
    .line 38
    int-to-long v3, p1

    .line 39
    move-wide v5, v3

    .line 40
    move-object v2, p0

    .line 41
    invoke-virtual/range {v1 .. v6}, Ljava/util/Timer;->scheduleAtFixedRate(Ljava/util/TimerTask;JJ)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public stop()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->timer:Ljava/util/Timer;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/Timer;->cancel()V

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->timer:Ljava/util/Timer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->started:Z

    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v1

    .line 14
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->started:Z

    .line 15
    .line 16
    throw v1

    .line 17
    :catch_0
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->started:Z

    .line 18
    .line 19
    return-void
.end method
