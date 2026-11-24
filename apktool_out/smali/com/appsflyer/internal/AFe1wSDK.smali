.class public final Lcom/appsflyer/internal/AFe1wSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;,
        Lcom/appsflyer/internal/AFe1wSDK$AFa1uSDK;
    }
.end annotation


# instance fields
.field private final AFKeystoreWrapper:Ljava/util/concurrent/ExecutorService;

.field private final AFLogger:Ljava/util/Timer;

.field private final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/appsflyer/internal/AFe1zSDK;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/NavigableSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/NavigableSet<",
            "Lcom/appsflyer/internal/AFe1ySDK<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final force:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/appsflyer/internal/AFe1zSDK;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Ljava/util/NavigableSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/NavigableSet<",
            "Lcom/appsflyer/internal/AFe1ySDK<",
            "*>;>;"
        }
    .end annotation
.end field

.field private registerClient:Ljava/util/concurrent/Executor;

.field public final unregisterClient:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/appsflyer/internal/AFe1vSDK;",
            ">;"
        }
    .end annotation
.end field

.field private final v:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/appsflyer/internal/AFe1ySDK<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final w:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/appsflyer/internal/AFe1ySDK<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ExecutorService;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/appsflyer/internal/AFe1wSDK;->AFKeystoreWrapper:Ljava/util/concurrent/ExecutorService;

    .line 8
    .line 9
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/appsflyer/internal/AFe1wSDK;->registerClient:Ljava/util/concurrent/Executor;

    .line 17
    .line 18
    new-instance p1, Ljava/util/Timer;

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    invoke-direct {p1, v0}, Ljava/util/Timer;-><init>(Z)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/appsflyer/internal/AFe1wSDK;->AFLogger:Ljava/util/Timer;

    .line 25
    .line 26
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lcom/appsflyer/internal/AFe1wSDK;->unregisterClient:Ljava/util/List;

    .line 32
    .line 33
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lcom/appsflyer/internal/AFe1wSDK;->d:Ljava/util/Set;

    .line 39
    .line 40
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 41
    .line 42
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-static {p1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Lcom/appsflyer/internal/AFe1wSDK;->force:Ljava/util/Set;

    .line 53
    .line 54
    new-instance p1, Ljava/util/concurrent/ConcurrentSkipListSet;

    .line 55
    .line 56
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentSkipListSet;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, Lcom/appsflyer/internal/AFe1wSDK;->i:Ljava/util/NavigableSet;

    .line 60
    .line 61
    new-instance p1, Ljava/util/concurrent/ConcurrentSkipListSet;

    .line 62
    .line 63
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentSkipListSet;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object p1, p0, Lcom/appsflyer/internal/AFe1wSDK;->e:Ljava/util/NavigableSet;

    .line 67
    .line 68
    new-instance p1, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, Lcom/appsflyer/internal/AFe1wSDK;->v:Ljava/util/List;

    .line 74
    .line 75
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 76
    .line 77
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-static {p1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    iput-object p1, p0, Lcom/appsflyer/internal/AFe1wSDK;->w:Ljava/util/Set;

    .line 88
    .line 89
    return-void
.end method

.method private static final AFKeystoreWrapper(Lcom/appsflyer/internal/AFe1wSDK;Lcom/appsflyer/internal/AFe1ySDK;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFe1wSDK;->unregisterClient:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lcom/appsflyer/internal/AFe1vSDK;

    .line 18
    .line 19
    invoke-interface {v0, p1}, Lcom/appsflyer/internal/AFe1vSDK;->registerClient(Lcom/appsflyer/internal/AFe1ySDK;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method

.method private static final AFLogger(Lcom/appsflyer/internal/AFe1wSDK;)V
    .locals 11

    .line 1
    const-string v0, "starting task execution: "

    .line 2
    .line 3
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1wSDK;->i:Ljava/util/NavigableSet;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget-object v2, p0, Lcom/appsflyer/internal/AFe1wSDK;->i:Ljava/util/NavigableSet;

    .line 7
    .line 8
    invoke-interface {v2}, Ljava/util/NavigableSet;->pollFirst()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, Lcom/appsflyer/internal/AFe1ySDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    monitor-exit v1

    .line 17
    return-void

    .line 18
    :cond_0
    :try_start_1
    iget-object v3, p0, Lcom/appsflyer/internal/AFe1wSDK;->w:Ljava/util/Set;

    .line 19
    .line 20
    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 21
    .line 22
    .line 23
    monitor-exit v1

    .line 24
    invoke-virtual {v2}, Lcom/appsflyer/internal/AFe1ySDK;->d()J

    .line 25
    .line 26
    .line 27
    move-result-wide v3

    .line 28
    new-instance v1, Lcom/appsflyer/internal/AFe1sSDK;

    .line 29
    .line 30
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-direct {v1, v5}, Lcom/appsflyer/internal/AFe1sSDK;-><init>(Ljava/lang/Thread;)V

    .line 38
    .line 39
    .line 40
    const-wide/16 v5, 0x0

    .line 41
    .line 42
    cmp-long v5, v3, v5

    .line 43
    .line 44
    if-lez v5, :cond_1

    .line 45
    .line 46
    iget-object v5, p0, Lcom/appsflyer/internal/AFe1wSDK;->AFLogger:Ljava/util/Timer;

    .line 47
    .line 48
    invoke-virtual {v5, v1, v3, v4}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 49
    .line 50
    .line 51
    :cond_1
    iget-object v3, p0, Lcom/appsflyer/internal/AFe1wSDK;->registerClient:Ljava/util/concurrent/Executor;

    .line 52
    .line 53
    new-instance v4, Lcom/appsflyer/internal/q;

    .line 54
    .line 55
    const/4 v5, 0x1

    .line 56
    invoke-direct {v4, p0, v2, v5}, Lcom/appsflyer/internal/q;-><init>(Lcom/appsflyer/internal/AFe1wSDK;Lcom/appsflyer/internal/AFe1ySDK;B)V

    .line 57
    .line 58
    .line 59
    invoke-interface {v3, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 60
    .line 61
    .line 62
    iget-object v3, p0, Lcom/appsflyer/internal/AFe1wSDK;->i:Ljava/util/NavigableSet;

    .line 63
    .line 64
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-nez v3, :cond_2

    .line 69
    .line 70
    iget-object v3, p0, Lcom/appsflyer/internal/AFe1wSDK;->AFKeystoreWrapper:Ljava/util/concurrent/ExecutorService;

    .line 71
    .line 72
    new-instance v4, Lcom/appsflyer/internal/g;

    .line 73
    .line 74
    const/4 v5, 0x3

    .line 75
    invoke-direct {v4, p0, v5}, Lcom/appsflyer/internal/g;-><init>(Ljava/lang/Object;B)V

    .line 76
    .line 77
    .line 78
    invoke-interface {v3, v4}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 79
    .line 80
    .line 81
    :cond_2
    const/4 v3, 0x0

    .line 82
    :try_start_2
    sget-object v4, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 83
    .line 84
    sget-object v5, Lcom/appsflyer/sdk_base/logger/LogTag;->QUEUE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 85
    .line 86
    new-instance v6, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    const/4 v8, 0x4

    .line 99
    const/4 v9, 0x0

    .line 100
    const/4 v7, 0x0

    .line 101
    invoke-static/range {v4 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2}, Lcom/appsflyer/internal/AFe1ySDK;->v()Lcom/appsflyer/internal/AFd1cSDK;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v1}, Ljava/util/TimerTask;->cancel()Z

    .line 109
    .line 110
    .line 111
    iget-object v4, p0, Lcom/appsflyer/internal/AFe1wSDK;->registerClient:Ljava/util/concurrent/Executor;

    .line 112
    .line 113
    new-instance v5, Lcom/appsflyer/internal/r;

    .line 114
    .line 115
    invoke-direct {v5, v2, v0, p0, v3}, Lcom/appsflyer/internal/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 116
    .line 117
    .line 118
    invoke-interface {v4, v5}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/InterruptedIOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :catchall_0
    invoke-virtual {v1}, Ljava/util/TimerTask;->cancel()Z

    .line 123
    .line 124
    .line 125
    sget-object v0, Lcom/appsflyer/internal/AFd1cSDK;->registerClient:Lcom/appsflyer/internal/AFd1cSDK;

    .line 126
    .line 127
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1wSDK;->registerClient:Ljava/util/concurrent/Executor;

    .line 128
    .line 129
    new-instance v4, Lcom/appsflyer/internal/r;

    .line 130
    .line 131
    invoke-direct {v4, v2, v0, p0, v3}, Lcom/appsflyer/internal/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 132
    .line 133
    .line 134
    invoke-interface {v1, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :catch_0
    sget-object v5, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 139
    .line 140
    sget-object v6, Lcom/appsflyer/sdk_base/logger/LogTag;->QUEUE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 141
    .line 142
    new-instance v0, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    const-string v1, "task was interrupted: "

    .line 145
    .line 146
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v7

    .line 156
    const/4 v9, 0x4

    .line 157
    const/4 v10, 0x0

    .line 158
    const/4 v8, 0x0

    .line 159
    invoke-static/range {v5 .. v10}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    sget-object v0, Lcom/appsflyer/internal/AFd1cSDK;->unregisterClient:Lcom/appsflyer/internal/AFd1cSDK;

    .line 163
    .line 164
    iput-object v0, v2, Lcom/appsflyer/internal/AFe1ySDK;->w:Lcom/appsflyer/internal/AFd1cSDK;

    .line 165
    .line 166
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1wSDK;->registerClient:Ljava/util/concurrent/Executor;

    .line 167
    .line 168
    new-instance v4, Lcom/appsflyer/internal/r;

    .line 169
    .line 170
    invoke-direct {v4, v2, v0, p0, v3}, Lcom/appsflyer/internal/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 171
    .line 172
    .line 173
    invoke-interface {v1, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :catch_1
    sget-object v5, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 178
    .line 179
    sget-object v6, Lcom/appsflyer/sdk_base/logger/LogTag;->QUEUE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 180
    .line 181
    new-instance v0, Ljava/lang/StringBuilder;

    .line 182
    .line 183
    const-string v1, "task was interrupted: "

    .line 184
    .line 185
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v7

    .line 195
    const/4 v9, 0x4

    .line 196
    const/4 v10, 0x0

    .line 197
    const/4 v8, 0x0

    .line 198
    invoke-static/range {v5 .. v10}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    sget-object v0, Lcom/appsflyer/internal/AFd1cSDK;->unregisterClient:Lcom/appsflyer/internal/AFd1cSDK;

    .line 202
    .line 203
    iput-object v0, v2, Lcom/appsflyer/internal/AFe1ySDK;->w:Lcom/appsflyer/internal/AFd1cSDK;

    .line 204
    .line 205
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1wSDK;->registerClient:Ljava/util/concurrent/Executor;

    .line 206
    .line 207
    new-instance v4, Lcom/appsflyer/internal/r;

    .line 208
    .line 209
    invoke-direct {v4, v2, v0, p0, v3}, Lcom/appsflyer/internal/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 210
    .line 211
    .line 212
    invoke-interface {v1, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 213
    .line 214
    .line 215
    return-void

    .line 216
    :catchall_1
    move-exception v0

    .line 217
    move-object p0, v0

    .line 218
    monitor-exit v1

    .line 219
    throw p0
.end method

.method public static synthetic a(Lcom/appsflyer/internal/AFe1wSDK;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/appsflyer/internal/AFe1wSDK;->AFLogger(Lcom/appsflyer/internal/AFe1wSDK;)V

    return-void
.end method

.method public static synthetic b(Lcom/appsflyer/internal/AFe1ySDK;Lcom/appsflyer/internal/AFd1cSDK;Lcom/appsflyer/internal/AFe1wSDK;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/appsflyer/internal/AFe1wSDK;->unregisterClient(Lcom/appsflyer/internal/AFe1ySDK;Lcom/appsflyer/internal/AFd1cSDK;Lcom/appsflyer/internal/AFe1wSDK;)V

    return-void
.end method

.method public static synthetic c(Lcom/appsflyer/internal/AFe1wSDK;Lcom/appsflyer/internal/AFe1ySDK;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/appsflyer/internal/AFe1wSDK;->unregisterClient(Lcom/appsflyer/internal/AFe1wSDK;Lcom/appsflyer/internal/AFe1ySDK;)V

    return-void
.end method

.method public static synthetic d(Lcom/appsflyer/internal/AFe1wSDK;Lcom/appsflyer/internal/AFe1ySDK;)V
    .locals 0

    .line 41
    invoke-static {p0, p1}, Lcom/appsflyer/internal/AFe1wSDK;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFe1wSDK;Lcom/appsflyer/internal/AFe1ySDK;)V

    return-void
.end method

.method private final d(Ljava/util/NavigableSet;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/NavigableSet<",
            "Lcom/appsflyer/internal/AFe1ySDK<",
            "*>;>;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/NavigableSet;->pollFirst()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/appsflyer/internal/AFe1ySDK;

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1wSDK;->d:Ljava/util/Set;

    .line 11
    .line 12
    iget-object v1, p1, Lcom/appsflyer/internal/AFe1ySDK;->unregisterClient:Lcom/appsflyer/internal/AFe1zSDK;

    .line 13
    .line 14
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lcom/appsflyer/internal/AFe1wSDK;->unregisterClient:Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Lcom/appsflyer/internal/AFe1vSDK;

    .line 34
    .line 35
    invoke-interface {v0, p1}, Lcom/appsflyer/internal/AFe1vSDK;->unregisterClient(Lcom/appsflyer/internal/AFe1ySDK;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    :goto_1
    return-void
.end method

.method private final registerClient(Lcom/appsflyer/internal/AFe1ySDK;)Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFe1ySDK<",
            "*>;)",
            "Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;"
        }
    .end annotation

    .line 1
    const-string v0, "tried to add already scheduled task: "

    .line 2
    .line 3
    const-string v1, "tried to add already running task: "

    .line 4
    .line 5
    iget-object v2, p0, Lcom/appsflyer/internal/AFe1wSDK;->i:Ljava/util/NavigableSet;

    .line 6
    .line 7
    monitor-enter v2

    .line 8
    :try_start_0
    iget-object v3, p0, Lcom/appsflyer/internal/AFe1wSDK;->w:Ljava/util/Set;

    .line 9
    .line 10
    invoke-interface {v3, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sget-object v4, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 17
    .line 18
    sget-object v5, Lcom/appsflyer/sdk_base/logger/LogTag;->QUEUE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 19
    .line 20
    new-instance p0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    const/4 v8, 0x4

    .line 33
    const/4 v9, 0x0

    .line 34
    const/4 v7, 0x0

    .line 35
    invoke-static/range {v4 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    sget-object p0, Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;->registerClient:Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    monitor-exit v2

    .line 41
    return-object p0

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    move-object p0, v0

    .line 44
    goto/16 :goto_4

    .line 45
    .line 46
    :cond_0
    :try_start_1
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1wSDK;->i:Ljava/util/NavigableSet;

    .line 47
    .line 48
    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_7

    .line 53
    .line 54
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1wSDK;->e:Ljava/util/NavigableSet;

    .line 55
    .line 56
    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    goto/16 :goto_3

    .line 63
    .line 64
    :cond_1
    iget-object v0, p1, Lcom/appsflyer/internal/AFe1ySDK;->d:Ljava/util/Set;

    .line 65
    .line 66
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_3

    .line 75
    .line 76
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, Lcom/appsflyer/internal/AFe1zSDK;

    .line 81
    .line 82
    iget-object v3, p0, Lcom/appsflyer/internal/AFe1wSDK;->force:Ljava/util/Set;

    .line 83
    .line 84
    invoke-interface {v3, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-eqz v3, :cond_2

    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    iget-object v3, p1, Lcom/appsflyer/internal/AFe1ySDK;->AFLogger:Ljava/util/Set;

    .line 94
    .line 95
    invoke-interface {v3, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_3
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1wSDK;->d:Ljava/util/Set;

    .line 100
    .line 101
    iget-object v1, p1, Lcom/appsflyer/internal/AFe1ySDK;->AFLogger:Ljava/util/Set;

    .line 102
    .line 103
    check-cast v1, Ljava/util/Collection;

    .line 104
    .line 105
    invoke-interface {v0, v1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_4

    .line 110
    .line 111
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1wSDK;->i:Ljava/util/NavigableSet;

    .line 112
    .line 113
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    goto :goto_1

    .line 118
    :cond_4
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1wSDK;->e:Ljava/util/NavigableSet;

    .line 119
    .line 120
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_5

    .line 125
    .line 126
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 127
    .line 128
    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->QUEUE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 129
    .line 130
    new-instance v1, Ljava/lang/StringBuilder;

    .line 131
    .line 132
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 133
    .line 134
    .line 135
    const-string v5, "new task was blocked: "

    .line 136
    .line 137
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    const/4 v7, 0x4

    .line 148
    const/4 v8, 0x0

    .line 149
    const/4 v6, 0x0

    .line 150
    invoke-static/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1}, Lcom/appsflyer/internal/AFe1ySDK;->w()V

    .line 154
    .line 155
    .line 156
    :cond_5
    :goto_1
    if-eqz v0, :cond_6

    .line 157
    .line 158
    iget-object p1, p0, Lcom/appsflyer/internal/AFe1wSDK;->i:Ljava/util/NavigableSet;

    .line 159
    .line 160
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1wSDK;->v:Ljava/util/List;

    .line 161
    .line 162
    invoke-interface {p1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 163
    .line 164
    .line 165
    iget-object p0, p0, Lcom/appsflyer/internal/AFe1wSDK;->v:Ljava/util/List;

    .line 166
    .line 167
    invoke-interface {p0}, Ljava/util/List;->clear()V

    .line 168
    .line 169
    .line 170
    sget-object p0, Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;

    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_6
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 174
    .line 175
    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->QUEUE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 176
    .line 177
    new-instance p0, Ljava/lang/StringBuilder;

    .line 178
    .line 179
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 180
    .line 181
    .line 182
    const-string v0, "task not added, it\'s already in the queue: "

    .line 183
    .line 184
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v5

    .line 194
    const/4 v7, 0x4

    .line 195
    const/4 v8, 0x0

    .line 196
    const/4 v6, 0x0

    .line 197
    invoke-static/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    sget-object p0, Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;->d:Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 201
    .line 202
    :goto_2
    monitor-exit v2

    .line 203
    return-object p0

    .line 204
    :cond_7
    :goto_3
    :try_start_2
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 205
    .line 206
    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->QUEUE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 207
    .line 208
    new-instance p0, Ljava/lang/StringBuilder;

    .line 209
    .line 210
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v5

    .line 220
    const/4 v7, 0x4

    .line 221
    const/4 v8, 0x0

    .line 222
    const/4 v6, 0x0

    .line 223
    invoke-static/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    sget-object p0, Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;->registerClient:Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 227
    .line 228
    monitor-exit v2

    .line 229
    return-object p0

    .line 230
    :goto_4
    monitor-exit v2

    .line 231
    throw p0
.end method

.method private final unregisterClient()V
    .locals 6

    .line 234
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1wSDK;->i:Ljava/util/NavigableSet;

    monitor-enter v0

    .line 235
    :try_start_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1wSDK;->e:Ljava/util/NavigableSet;

    invoke-interface {v1}, Ljava/util/NavigableSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    .line 236
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 237
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/appsflyer/internal/AFe1ySDK;

    .line 238
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    iget-object v4, p0, Lcom/appsflyer/internal/AFe1wSDK;->d:Ljava/util/Set;

    .line 240
    iget-object v5, v3, Lcom/appsflyer/internal/AFe1ySDK;->AFLogger:Ljava/util/Set;

    .line 241
    check-cast v5, Ljava/util/Collection;

    invoke-interface {v4, v5}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 242
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 243
    iget-object v2, p0, Lcom/appsflyer/internal/AFe1wSDK;->i:Ljava/util/NavigableSet;

    invoke-interface {v2, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x1

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_1
    if-eqz v2, :cond_2

    .line 244
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1wSDK;->AFKeystoreWrapper:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lcom/appsflyer/internal/g;

    const/4 v3, 0x3

    invoke-direct {v2, p0, v3}, Lcom/appsflyer/internal/g;-><init>(Ljava/lang/Object;B)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 245
    :cond_2
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p0
.end method

.method private static final unregisterClient(Lcom/appsflyer/internal/AFe1wSDK;Lcom/appsflyer/internal/AFe1ySDK;)V
    .locals 9

    .line 1
    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFe1wSDK;->registerClient(Lcom/appsflyer/internal/AFe1ySDK;)Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/appsflyer/internal/AFe1wSDK$AFa1uSDK;->AFKeystoreWrapper:[I

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    aget v0, v1, v0

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-eq v0, v1, :cond_8

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    if-eq v0, v1, :cond_7

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    if-ne v0, v1, :cond_6

    .line 21
    .line 22
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1wSDK;->force:Ljava/util/Set;

    .line 23
    .line 24
    iget-object v2, p1, Lcom/appsflyer/internal/AFe1ySDK;->unregisterClient:Lcom/appsflyer/internal/AFe1zSDK;

    .line 25
    .line 26
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 30
    .line 31
    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->QUEUE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 32
    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v2, "new task added: "

    .line 36
    .line 37
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    const/4 v7, 0x4

    .line 48
    const/4 v8, 0x0

    .line 49
    const/4 v6, 0x0

    .line 50
    invoke-static/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1wSDK;->unregisterClient:Ljava/util/List;

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_0

    .line 64
    .line 65
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, Lcom/appsflyer/internal/AFe1vSDK;

    .line 70
    .line 71
    invoke-interface {v2, p1}, Lcom/appsflyer/internal/AFe1vSDK;->d(Lcom/appsflyer/internal/AFe1ySDK;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    iget-object p1, p0, Lcom/appsflyer/internal/AFe1wSDK;->AFKeystoreWrapper:Ljava/util/concurrent/ExecutorService;

    .line 76
    .line 77
    new-instance v0, Lcom/appsflyer/internal/g;

    .line 78
    .line 79
    invoke-direct {v0, p0, v1}, Lcom/appsflyer/internal/g;-><init>(Ljava/lang/Object;B)V

    .line 80
    .line 81
    .line 82
    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 83
    .line 84
    .line 85
    iget-object p1, p0, Lcom/appsflyer/internal/AFe1wSDK;->i:Ljava/util/NavigableSet;

    .line 86
    .line 87
    monitor-enter p1

    .line 88
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1wSDK;->i:Ljava/util/NavigableSet;

    .line 89
    .line 90
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1wSDK;->e:Ljava/util/NavigableSet;

    .line 95
    .line 96
    invoke-interface {v1}, Ljava/util/Set;->size()I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    add-int/2addr v0, v1

    .line 101
    add-int/lit8 v0, v0, -0x28

    .line 102
    .line 103
    :goto_1
    if-lez v0, :cond_5

    .line 104
    .line 105
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1wSDK;->e:Ljava/util/NavigableSet;

    .line 106
    .line 107
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    iget-object v2, p0, Lcom/appsflyer/internal/AFe1wSDK;->i:Ljava/util/NavigableSet;

    .line 112
    .line 113
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-nez v2, :cond_2

    .line 118
    .line 119
    if-nez v1, :cond_2

    .line 120
    .line 121
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1wSDK;->i:Ljava/util/NavigableSet;

    .line 122
    .line 123
    invoke-interface {v1}, Ljava/util/SortedSet;->first()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    check-cast v1, Lcom/appsflyer/internal/AFe1ySDK;

    .line 128
    .line 129
    iget-object v2, p0, Lcom/appsflyer/internal/AFe1wSDK;->e:Ljava/util/NavigableSet;

    .line 130
    .line 131
    invoke-interface {v2}, Ljava/util/SortedSet;->first()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    check-cast v2, Lcom/appsflyer/internal/AFe1ySDK;

    .line 136
    .line 137
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1, v2}, Lcom/appsflyer/internal/AFe1ySDK;->unregisterClient(Lcom/appsflyer/internal/AFe1ySDK;)I

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-lez v1, :cond_1

    .line 145
    .line 146
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1wSDK;->i:Ljava/util/NavigableSet;

    .line 147
    .line 148
    invoke-direct {p0, v1}, Lcom/appsflyer/internal/AFe1wSDK;->d(Ljava/util/NavigableSet;)V

    .line 149
    .line 150
    .line 151
    goto :goto_2

    .line 152
    :catchall_0
    move-exception v0

    .line 153
    move-object p0, v0

    .line 154
    goto :goto_3

    .line 155
    :cond_1
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1wSDK;->e:Ljava/util/NavigableSet;

    .line 156
    .line 157
    invoke-direct {p0, v1}, Lcom/appsflyer/internal/AFe1wSDK;->d(Ljava/util/NavigableSet;)V

    .line 158
    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_2
    if-nez v2, :cond_3

    .line 162
    .line 163
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1wSDK;->i:Ljava/util/NavigableSet;

    .line 164
    .line 165
    invoke-direct {p0, v1}, Lcom/appsflyer/internal/AFe1wSDK;->d(Ljava/util/NavigableSet;)V

    .line 166
    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_3
    if-nez v1, :cond_4

    .line 170
    .line 171
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1wSDK;->e:Ljava/util/NavigableSet;

    .line 172
    .line 173
    invoke-direct {p0, v1}, Lcom/appsflyer/internal/AFe1wSDK;->d(Ljava/util/NavigableSet;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 174
    .line 175
    .line 176
    :cond_4
    :goto_2
    add-int/lit8 v0, v0, -0x1

    .line 177
    .line 178
    goto :goto_1

    .line 179
    :cond_5
    monitor-exit p1

    .line 180
    return-void

    .line 181
    :goto_3
    monitor-exit p1

    .line 182
    throw p0

    .line 183
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 184
    .line 185
    .line 186
    return-void

    .line 187
    :cond_7
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 188
    .line 189
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->QUEUE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 190
    .line 191
    new-instance p0, Ljava/lang/StringBuilder;

    .line 192
    .line 193
    const-string v2, "QUEUE: tried to add already pending task: "

    .line 194
    .line 195
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    const/4 v4, 0x4

    .line 206
    const/4 v5, 0x0

    .line 207
    const/4 v3, 0x0

    .line 208
    invoke-static/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    :cond_8
    return-void
.end method

.method private static final unregisterClient(Lcom/appsflyer/internal/AFe1ySDK;Lcom/appsflyer/internal/AFd1cSDK;Lcom/appsflyer/internal/AFe1wSDK;)V
    .locals 6

    .line 212
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->QUEUE:Lcom/appsflyer/sdk_base/logger/LogTag;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "execution finished for "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", result: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 213
    iget-object v0, p2, Lcom/appsflyer/internal/AFe1wSDK;->w:Ljava/util/Set;

    invoke-interface {v0, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 214
    iget-object v0, p2, Lcom/appsflyer/internal/AFe1wSDK;->unregisterClient:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/appsflyer/internal/AFe1vSDK;

    .line 215
    invoke-interface {v1, p0, p1}, Lcom/appsflyer/internal/AFe1vSDK;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFe1ySDK;Lcom/appsflyer/internal/AFd1cSDK;)V

    goto :goto_0

    .line 216
    :cond_0
    sget-object v0, Lcom/appsflyer/internal/AFd1cSDK;->d:Lcom/appsflyer/internal/AFd1cSDK;

    if-ne p1, v0, :cond_1

    .line 217
    iget-object p1, p2, Lcom/appsflyer/internal/AFe1wSDK;->d:Ljava/util/Set;

    .line 218
    iget-object p0, p0, Lcom/appsflyer/internal/AFe1ySDK;->unregisterClient:Lcom/appsflyer/internal/AFe1zSDK;

    .line 219
    invoke-interface {p1, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 220
    invoke-direct {p2}, Lcom/appsflyer/internal/AFe1wSDK;->unregisterClient()V

    return-void

    .line 221
    :cond_1
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFe1ySDK;->AFLogger()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 222
    instance-of p1, p0, Lcom/appsflyer/internal/AFf1sSDK;

    if-eqz p1, :cond_3

    move-object p1, p0

    check-cast p1, Lcom/appsflyer/internal/AFf1sSDK;

    .line 223
    iget-object p1, p1, Lcom/appsflyer/internal/AFe1ySDK;->unregisterClient:Lcom/appsflyer/internal/AFe1zSDK;

    .line 224
    sget-object v0, Lcom/appsflyer/internal/AFd1bSDK;->getLevel:Lcom/appsflyer/internal/AFd1bSDK;

    if-eq p1, v0, :cond_2

    goto :goto_1

    :cond_2
    return-void

    .line 225
    :cond_3
    :goto_1
    iget-object p1, p2, Lcom/appsflyer/internal/AFe1wSDK;->i:Ljava/util/NavigableSet;

    monitor-enter p1

    .line 226
    :try_start_0
    iget-object v0, p2, Lcom/appsflyer/internal/AFe1wSDK;->v:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 227
    iget-object p2, p2, Lcom/appsflyer/internal/AFe1wSDK;->unregisterClient:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/appsflyer/internal/AFe1vSDK;

    .line 228
    invoke-interface {v0, p0}, Lcom/appsflyer/internal/AFe1vSDK;->d(Lcom/appsflyer/internal/AFe1ySDK;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_3

    .line 229
    :cond_4
    monitor-exit p1

    return-void

    :goto_3
    monitor-exit p1

    throw p0

    .line 230
    :cond_5
    iget-object p1, p2, Lcom/appsflyer/internal/AFe1wSDK;->d:Ljava/util/Set;

    .line 231
    iget-object p0, p0, Lcom/appsflyer/internal/AFe1ySDK;->unregisterClient:Lcom/appsflyer/internal/AFe1zSDK;

    .line 232
    invoke-interface {p1, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 233
    invoke-direct {p2}, Lcom/appsflyer/internal/AFe1wSDK;->unregisterClient()V

    return-void
.end method


# virtual methods
.method public final d(Lcom/appsflyer/internal/AFe1ySDK;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFe1ySDK<",
            "*>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1wSDK;->registerClient:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/appsflyer/internal/q;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/appsflyer/internal/q;-><init>(Lcom/appsflyer/internal/AFe1wSDK;Lcom/appsflyer/internal/AFe1ySDK;B)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
