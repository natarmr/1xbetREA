.class public Lcom/google/firebase/perf/session/gauges/GaugeManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC:J = 0x14L

.field private static final INVALID_GAUGE_COLLECTION_FREQUENCY:J = -0x1L

.field private static final TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS:J = 0x14L

.field private static final instance:Lcom/google/firebase/perf/session/gauges/GaugeManager;

.field private static final logger:La/f03;


# instance fields
.field private applicationProcessState:La/ts3;

.field private final configResolver:La/hsd;

.field private final cpuGaugeCollector:La/b8z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/b8z;"
        }
    .end annotation
.end field

.field private gaugeManagerDataCollectionJob:Ljava/util/concurrent/ScheduledFuture;

.field private final gaugeManagerExecutor:La/b8z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/b8z;"
        }
    .end annotation
.end field

.field private gaugeMetadataManager:La/qet;

.field private final memoryGaugeCollector:La/b8z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/b8z;"
        }
    .end annotation
.end field

.field private sessionId:Ljava/lang/String;

.field private final transportManager:La/dps0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, La/f03;->d()La/f03;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->logger:La/f03;

    .line 6
    .line 7
    new-instance v0, Lcom/google/firebase/perf/session/gauges/GaugeManager;

    .line 8
    .line 9
    invoke-direct {v0}, Lcom/google/firebase/perf/session/gauges/GaugeManager;-><init>()V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->instance:Lcom/google/firebase/perf/session/gauges/GaugeManager;

    .line 13
    .line 14
    return-void
.end method

.method private constructor <init>()V
    .locals 7

    .line 1
    new-instance v1, La/b8z;

    .line 2
    .line 3
    new-instance v0, La/ogd;

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    invoke-direct {v0, v2}, La/ogd;-><init>(B)V

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v0}, La/b8z;-><init>(La/p5d0;)V

    .line 10
    .line 11
    .line 12
    sget-object v2, La/dps0;->s:La/dps0;

    .line 13
    .line 14
    invoke-static {}, La/hsd;->e()La/hsd;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    new-instance v5, La/b8z;

    .line 19
    .line 20
    new-instance v0, La/ogd;

    .line 21
    .line 22
    const/4 v4, 0x7

    .line 23
    invoke-direct {v0, v4}, La/ogd;-><init>(B)V

    .line 24
    .line 25
    .line 26
    invoke-direct {v5, v0}, La/b8z;-><init>(La/p5d0;)V

    .line 27
    .line 28
    .line 29
    new-instance v6, La/b8z;

    .line 30
    .line 31
    new-instance v0, La/ogd;

    .line 32
    .line 33
    const/16 v4, 0x8

    .line 34
    .line 35
    invoke-direct {v0, v4}, La/ogd;-><init>(B)V

    .line 36
    .line 37
    .line 38
    invoke-direct {v6, v0}, La/b8z;-><init>(La/p5d0;)V

    .line 39
    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    move-object v0, p0

    .line 43
    invoke-direct/range {v0 .. v6}, Lcom/google/firebase/perf/session/gauges/GaugeManager;-><init>(La/b8z;La/dps0;La/hsd;La/qet;La/b8z;La/b8z;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public constructor <init>(La/b8z;La/dps0;La/hsd;La/qet;La/b8z;La/b8z;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/b8z;",
            "La/dps0;",
            "La/hsd;",
            "La/qet;",
            "La/b8z;",
            "La/b8z;",
            ")V"
        }
    .end annotation

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 48
    iput-object v0, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->gaugeManagerDataCollectionJob:Ljava/util/concurrent/ScheduledFuture;

    .line 49
    iput-object v0, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->sessionId:Ljava/lang/String;

    .line 50
    sget-object v0, La/ts3;->b:La/ts3;

    iput-object v0, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->applicationProcessState:La/ts3;

    .line 51
    iput-object p1, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->gaugeManagerExecutor:La/b8z;

    .line 52
    iput-object p2, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->transportManager:La/dps0;

    .line 53
    iput-object p3, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->configResolver:La/hsd;

    .line 54
    iput-object p4, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->gaugeMetadataManager:La/qet;

    .line 55
    iput-object p5, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->cpuGaugeCollector:La/b8z;

    .line 56
    iput-object p6, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->memoryGaugeCollector:La/b8z;

    return-void
.end method

.method public static synthetic a(Lcom/google/firebase/perf/session/gauges/GaugeManager;Ljava/lang/String;La/ts3;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/google/firebase/perf/session/gauges/GaugeManager;->lambda$startCollectingGauges$2(Ljava/lang/String;La/ts3;)V

    return-void
.end method

.method public static synthetic b()La/ps30;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/firebase/perf/session/gauges/GaugeManager;->lambda$new$1()La/ps30;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()La/u7f;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/firebase/perf/session/gauges/GaugeManager;->lambda$new$0()La/u7f;

    move-result-object v0

    return-object v0
.end method

.method private static collectGaugeMetricOnce(La/u7f;La/ps30;Lcom/google/firebase/perf/util/Timer;)V
    .locals 7

    .line 1
    const-string v0, "Unable to collect Cpu Metric: "

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    const/4 v1, 0x1

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    :try_start_0
    iget-object v4, p0, La/u7f;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 8
    .line 9
    new-instance v5, La/t7f;

    .line 10
    .line 11
    invoke-direct {v5, p0, p2, v1}, La/t7f;-><init>(La/u7f;Lcom/google/firebase/perf/util/Timer;B)V

    .line 12
    .line 13
    .line 14
    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 15
    .line 16
    invoke-interface {v4, v5, v2, v3, v6}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    goto :goto_3

    .line 22
    :catch_0
    move-exception v4

    .line 23
    :try_start_1
    sget-object v5, La/u7f;->g:La/f03;

    .line 24
    .line 25
    new-instance v6, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v5, v0}, La/f03;->f(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    .line 43
    .line 44
    :goto_0
    monitor-exit p0

    .line 45
    const-string p0, "Unable to collect Memory Metric: "

    .line 46
    .line 47
    monitor-enter p1

    .line 48
    :try_start_2
    iget-object v0, p1, La/ps30;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 49
    .line 50
    new-instance v4, La/os30;

    .line 51
    .line 52
    invoke-direct {v4, p1, p2, v1}, La/os30;-><init>(La/ps30;Lcom/google/firebase/perf/util/Timer;B)V

    .line 53
    .line 54
    .line 55
    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 56
    .line 57
    invoke-interface {v0, v4, v2, v3, p2}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    :try_end_2
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :catchall_1
    move-exception p0

    .line 62
    goto :goto_2

    .line 63
    :catch_1
    move-exception p2

    .line 64
    :try_start_3
    sget-object v0, La/ps30;->f:La/f03;

    .line 65
    .line 66
    new-instance v1, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v1, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {v0, p0}, La/f03;->f(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 83
    .line 84
    .line 85
    :goto_1
    monitor-exit p1

    .line 86
    return-void

    .line 87
    :goto_2
    :try_start_4
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 88
    throw p0

    .line 89
    :goto_3
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 90
    throw p1
.end method

.method public static synthetic d(Lcom/google/firebase/perf/session/gauges/GaugeManager;Ljava/lang/String;La/ts3;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/google/firebase/perf/session/gauges/GaugeManager;->lambda$stopCollectingGauges$3(Ljava/lang/String;La/ts3;)V

    return-void
.end method

.method private getCpuGaugeCollectionFrequencyMs(La/ts3;)J
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x1

    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    const-wide/16 v3, -0x1

    .line 9
    .line 10
    if-eq p1, v0, :cond_5

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    if-eq p1, v0, :cond_0

    .line 14
    .line 15
    move-wide p0, v3

    .line 16
    goto/16 :goto_3

    .line 17
    .line 18
    :cond_0
    iget-object p0, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->configResolver:La/hsd;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    const-class p1, La/jtd;

    .line 24
    .line 25
    monitor-enter p1

    .line 26
    :try_start_0
    sget-object v0, La/jtd;->a:La/jtd;

    .line 27
    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    new-instance v0, La/jtd;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    sput-object v0, La/jtd;->a:La/jtd;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    goto/16 :goto_1

    .line 40
    .line 41
    :cond_1
    :goto_0
    monitor-exit p1

    .line 42
    invoke-virtual {p0, v0}, La/hsd;->i(La/obb;)La/v680;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, La/v680;->b()Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_2

    .line 51
    .line 52
    invoke-virtual {p1}, La/v680;->a()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    check-cast v5, Ljava/lang/Long;

    .line 57
    .line 58
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 59
    .line 60
    .line 61
    move-result-wide v5

    .line 62
    invoke-static {v5, v6}, La/hsd;->m(J)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_2

    .line 67
    .line 68
    invoke-virtual {p1}, La/v680;->a()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    check-cast p0, Ljava/lang/Long;

    .line 73
    .line 74
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 75
    .line 76
    .line 77
    move-result-wide p0

    .line 78
    goto/16 :goto_3

    .line 79
    .line 80
    :cond_2
    iget-object p1, p0, La/hsd;->a:Lcom/google/firebase/perf/config/RemoteConfigManager;

    .line 81
    .line 82
    const-string v5, "fpr_session_gauge_cpu_capture_frequency_bg_ms"

    .line 83
    .line 84
    invoke-virtual {p1, v5}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getLong(Ljava/lang/String;)La/v680;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1}, La/v680;->b()Z

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-eqz v5, :cond_3

    .line 93
    .line 94
    invoke-virtual {p1}, La/v680;->a()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    check-cast v5, Ljava/lang/Long;

    .line 99
    .line 100
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 101
    .line 102
    .line 103
    move-result-wide v5

    .line 104
    invoke-static {v5, v6}, La/hsd;->m(J)Z

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    if-eqz v5, :cond_3

    .line 109
    .line 110
    iget-object p0, p0, La/hsd;->c:La/rgk;

    .line 111
    .line 112
    const-string v0, "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs"

    .line 113
    .line 114
    invoke-virtual {p1}, La/v680;->a()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    check-cast v5, Ljava/lang/Long;

    .line 119
    .line 120
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 121
    .line 122
    .line 123
    move-result-wide v5

    .line 124
    invoke-virtual {p0, v5, v6, v0}, La/rgk;->d(JLjava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1}, La/v680;->a()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    check-cast p0, Ljava/lang/Long;

    .line 132
    .line 133
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 134
    .line 135
    .line 136
    move-result-wide p0

    .line 137
    goto/16 :goto_3

    .line 138
    .line 139
    :cond_3
    invoke-virtual {p0, v0}, La/hsd;->c(La/obb;)La/v680;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-virtual {p0}, La/v680;->b()Z

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    if-eqz p1, :cond_4

    .line 148
    .line 149
    invoke-virtual {p0}, La/v680;->a()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    check-cast p1, Ljava/lang/Long;

    .line 154
    .line 155
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 156
    .line 157
    .line 158
    move-result-wide v5

    .line 159
    invoke-static {v5, v6}, La/hsd;->m(J)Z

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    if-eqz p1, :cond_4

    .line 164
    .line 165
    invoke-virtual {p0}, La/v680;->a()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    check-cast p0, Ljava/lang/Long;

    .line 170
    .line 171
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 172
    .line 173
    .line 174
    move-result-wide p0

    .line 175
    goto/16 :goto_3

    .line 176
    .line 177
    :cond_4
    move-wide p0, v1

    .line 178
    goto/16 :goto_3

    .line 179
    .line 180
    :goto_1
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 181
    throw p0

    .line 182
    :cond_5
    iget-object p0, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->configResolver:La/hsd;

    .line 183
    .line 184
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    const-class p1, La/ktd;

    .line 188
    .line 189
    monitor-enter p1

    .line 190
    :try_start_2
    sget-object v0, La/ktd;->a:La/ktd;

    .line 191
    .line 192
    if-nez v0, :cond_6

    .line 193
    .line 194
    new-instance v0, La/ktd;

    .line 195
    .line 196
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 197
    .line 198
    .line 199
    sput-object v0, La/ktd;->a:La/ktd;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 200
    .line 201
    goto :goto_2

    .line 202
    :catchall_1
    move-exception p0

    .line 203
    goto/16 :goto_4

    .line 204
    .line 205
    :cond_6
    :goto_2
    monitor-exit p1

    .line 206
    invoke-virtual {p0, v0}, La/hsd;->i(La/obb;)La/v680;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-virtual {p1}, La/v680;->b()Z

    .line 211
    .line 212
    .line 213
    move-result v5

    .line 214
    if-eqz v5, :cond_7

    .line 215
    .line 216
    invoke-virtual {p1}, La/v680;->a()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v5

    .line 220
    check-cast v5, Ljava/lang/Long;

    .line 221
    .line 222
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 223
    .line 224
    .line 225
    move-result-wide v5

    .line 226
    invoke-static {v5, v6}, La/hsd;->m(J)Z

    .line 227
    .line 228
    .line 229
    move-result v5

    .line 230
    if-eqz v5, :cond_7

    .line 231
    .line 232
    invoke-virtual {p1}, La/v680;->a()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    check-cast p0, Ljava/lang/Long;

    .line 237
    .line 238
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 239
    .line 240
    .line 241
    move-result-wide p0

    .line 242
    goto :goto_3

    .line 243
    :cond_7
    iget-object p1, p0, La/hsd;->a:Lcom/google/firebase/perf/config/RemoteConfigManager;

    .line 244
    .line 245
    const-string v5, "fpr_session_gauge_cpu_capture_frequency_fg_ms"

    .line 246
    .line 247
    invoke-virtual {p1, v5}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getLong(Ljava/lang/String;)La/v680;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    invoke-virtual {p1}, La/v680;->b()Z

    .line 252
    .line 253
    .line 254
    move-result v5

    .line 255
    if-eqz v5, :cond_8

    .line 256
    .line 257
    invoke-virtual {p1}, La/v680;->a()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    check-cast v5, Ljava/lang/Long;

    .line 262
    .line 263
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 264
    .line 265
    .line 266
    move-result-wide v5

    .line 267
    invoke-static {v5, v6}, La/hsd;->m(J)Z

    .line 268
    .line 269
    .line 270
    move-result v5

    .line 271
    if-eqz v5, :cond_8

    .line 272
    .line 273
    iget-object p0, p0, La/hsd;->c:La/rgk;

    .line 274
    .line 275
    const-string v0, "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs"

    .line 276
    .line 277
    invoke-virtual {p1}, La/v680;->a()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v5

    .line 281
    check-cast v5, Ljava/lang/Long;

    .line 282
    .line 283
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 284
    .line 285
    .line 286
    move-result-wide v5

    .line 287
    invoke-virtual {p0, v5, v6, v0}, La/rgk;->d(JLjava/lang/String;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {p1}, La/v680;->a()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object p0

    .line 294
    check-cast p0, Ljava/lang/Long;

    .line 295
    .line 296
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 297
    .line 298
    .line 299
    move-result-wide p0

    .line 300
    goto :goto_3

    .line 301
    :cond_8
    invoke-virtual {p0, v0}, La/hsd;->c(La/obb;)La/v680;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    invoke-virtual {p1}, La/v680;->b()Z

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    if-eqz v0, :cond_9

    .line 310
    .line 311
    invoke-virtual {p1}, La/v680;->a()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    check-cast v0, Ljava/lang/Long;

    .line 316
    .line 317
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 318
    .line 319
    .line 320
    move-result-wide v5

    .line 321
    invoke-static {v5, v6}, La/hsd;->m(J)Z

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    if-eqz v0, :cond_9

    .line 326
    .line 327
    invoke-virtual {p1}, La/v680;->a()Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object p0

    .line 331
    check-cast p0, Ljava/lang/Long;

    .line 332
    .line 333
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 334
    .line 335
    .line 336
    move-result-wide p0

    .line 337
    goto :goto_3

    .line 338
    :cond_9
    iget-object p0, p0, La/hsd;->a:Lcom/google/firebase/perf/config/RemoteConfigManager;

    .line 339
    .line 340
    invoke-virtual {p0}, Lcom/google/firebase/perf/config/RemoteConfigManager;->isLastFetchFailed()Z

    .line 341
    .line 342
    .line 343
    move-result p0

    .line 344
    if-eqz p0, :cond_a

    .line 345
    .line 346
    const-wide/16 p0, 0x12c

    .line 347
    .line 348
    goto :goto_3

    .line 349
    :cond_a
    const-wide/16 p0, 0x64

    .line 350
    .line 351
    :goto_3
    sget-object v0, La/u7f;->g:La/f03;

    .line 352
    .line 353
    cmp-long v0, p0, v1

    .line 354
    .line 355
    if-gtz v0, :cond_b

    .line 356
    .line 357
    return-wide v3

    .line 358
    :cond_b
    return-wide p0

    .line 359
    :goto_4
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 360
    throw p0
.end method

.method private getGaugeMetadata()La/pet;
    .locals 8

    .line 1
    invoke-static {}, La/pet;->t()La/oet;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->gaugeMetadataManager:La/qet;

    .line 6
    .line 7
    iget-object v1, v1, La/qet;->c:Landroid/app/ActivityManager$MemoryInfo;

    .line 8
    .line 9
    iget-wide v1, v1, Landroid/app/ActivityManager$MemoryInfo;->totalMem:J

    .line 10
    .line 11
    const/4 v3, 0x5

    .line 12
    invoke-static {v3}, La/brm0;->c(I)J

    .line 13
    .line 14
    .line 15
    move-result-wide v4

    .line 16
    mul-long/2addr v4, v1

    .line 17
    const-wide/16 v1, 0x400

    .line 18
    .line 19
    div-long/2addr v4, v1

    .line 20
    invoke-static {v4, v5}, La/gut0;->b(J)I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    invoke-virtual {v0}, La/zit;->i()V

    .line 25
    .line 26
    .line 27
    iget-object v5, v0, La/zit;->b:La/kjt;

    .line 28
    .line 29
    check-cast v5, La/pet;

    .line 30
    .line 31
    invoke-virtual {v5, v4}, La/pet;->u(I)V

    .line 32
    .line 33
    .line 34
    iget-object v4, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->gaugeMetadataManager:La/qet;

    .line 35
    .line 36
    iget-object v4, v4, La/qet;->a:Ljava/lang/Runtime;

    .line 37
    .line 38
    invoke-virtual {v4}, Ljava/lang/Runtime;->maxMemory()J

    .line 39
    .line 40
    .line 41
    move-result-wide v4

    .line 42
    invoke-static {v3}, La/brm0;->c(I)J

    .line 43
    .line 44
    .line 45
    move-result-wide v6

    .line 46
    mul-long/2addr v6, v4

    .line 47
    div-long/2addr v6, v1

    .line 48
    invoke-static {v6, v7}, La/gut0;->b(J)I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    invoke-virtual {v0}, La/zit;->i()V

    .line 53
    .line 54
    .line 55
    iget-object v4, v0, La/zit;->b:La/kjt;

    .line 56
    .line 57
    check-cast v4, La/pet;

    .line 58
    .line 59
    invoke-virtual {v4, v3}, La/pet;->v(I)V

    .line 60
    .line 61
    .line 62
    iget-object p0, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->gaugeMetadataManager:La/qet;

    .line 63
    .line 64
    iget-object p0, p0, La/qet;->b:Landroid/app/ActivityManager;

    .line 65
    .line 66
    invoke-virtual {p0}, Landroid/app/ActivityManager;->getMemoryClass()I

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    int-to-long v3, p0

    .line 71
    const/4 p0, 0x3

    .line 72
    invoke-static {p0}, La/brm0;->c(I)J

    .line 73
    .line 74
    .line 75
    move-result-wide v5

    .line 76
    mul-long/2addr v5, v3

    .line 77
    div-long/2addr v5, v1

    .line 78
    invoke-static {v5, v6}, La/gut0;->b(J)I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    invoke-virtual {v0}, La/zit;->i()V

    .line 83
    .line 84
    .line 85
    iget-object v1, v0, La/zit;->b:La/kjt;

    .line 86
    .line 87
    check-cast v1, La/pet;

    .line 88
    .line 89
    invoke-virtual {v1, p0}, La/pet;->w(I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, La/zit;->h()La/kjt;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    check-cast p0, La/pet;

    .line 97
    .line 98
    return-object p0
.end method

.method public static declared-synchronized getInstance()Lcom/google/firebase/perf/session/gauges/GaugeManager;
    .locals 2

    .line 1
    const-class v0, Lcom/google/firebase/perf/session/gauges/GaugeManager;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/google/firebase/perf/session/gauges/GaugeManager;->instance:Lcom/google/firebase/perf/session/gauges/GaugeManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-object v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 10
    throw v1
.end method

.method private getMemoryGaugeCollectionFrequencyMs(La/ts3;)J
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x1

    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    const-wide/16 v3, -0x1

    .line 9
    .line 10
    if-eq p1, v0, :cond_5

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    if-eq p1, v0, :cond_0

    .line 14
    .line 15
    move-wide p0, v3

    .line 16
    goto/16 :goto_3

    .line 17
    .line 18
    :cond_0
    iget-object p0, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->configResolver:La/hsd;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    const-class p1, La/mtd;

    .line 24
    .line 25
    monitor-enter p1

    .line 26
    :try_start_0
    sget-object v0, La/mtd;->a:La/mtd;

    .line 27
    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    new-instance v0, La/mtd;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    sput-object v0, La/mtd;->a:La/mtd;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    goto/16 :goto_1

    .line 40
    .line 41
    :cond_1
    :goto_0
    monitor-exit p1

    .line 42
    invoke-virtual {p0, v0}, La/hsd;->i(La/obb;)La/v680;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, La/v680;->b()Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_2

    .line 51
    .line 52
    invoke-virtual {p1}, La/v680;->a()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    check-cast v5, Ljava/lang/Long;

    .line 57
    .line 58
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 59
    .line 60
    .line 61
    move-result-wide v5

    .line 62
    invoke-static {v5, v6}, La/hsd;->m(J)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_2

    .line 67
    .line 68
    invoke-virtual {p1}, La/v680;->a()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    check-cast p0, Ljava/lang/Long;

    .line 73
    .line 74
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 75
    .line 76
    .line 77
    move-result-wide p0

    .line 78
    goto/16 :goto_3

    .line 79
    .line 80
    :cond_2
    iget-object p1, p0, La/hsd;->a:Lcom/google/firebase/perf/config/RemoteConfigManager;

    .line 81
    .line 82
    const-string v5, "fpr_session_gauge_memory_capture_frequency_bg_ms"

    .line 83
    .line 84
    invoke-virtual {p1, v5}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getLong(Ljava/lang/String;)La/v680;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1}, La/v680;->b()Z

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-eqz v5, :cond_3

    .line 93
    .line 94
    invoke-virtual {p1}, La/v680;->a()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    check-cast v5, Ljava/lang/Long;

    .line 99
    .line 100
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 101
    .line 102
    .line 103
    move-result-wide v5

    .line 104
    invoke-static {v5, v6}, La/hsd;->m(J)Z

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    if-eqz v5, :cond_3

    .line 109
    .line 110
    iget-object p0, p0, La/hsd;->c:La/rgk;

    .line 111
    .line 112
    const-string v0, "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs"

    .line 113
    .line 114
    invoke-virtual {p1}, La/v680;->a()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    check-cast v5, Ljava/lang/Long;

    .line 119
    .line 120
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 121
    .line 122
    .line 123
    move-result-wide v5

    .line 124
    invoke-virtual {p0, v5, v6, v0}, La/rgk;->d(JLjava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1}, La/v680;->a()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    check-cast p0, Ljava/lang/Long;

    .line 132
    .line 133
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 134
    .line 135
    .line 136
    move-result-wide p0

    .line 137
    goto/16 :goto_3

    .line 138
    .line 139
    :cond_3
    invoke-virtual {p0, v0}, La/hsd;->c(La/obb;)La/v680;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-virtual {p0}, La/v680;->b()Z

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    if-eqz p1, :cond_4

    .line 148
    .line 149
    invoke-virtual {p0}, La/v680;->a()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    check-cast p1, Ljava/lang/Long;

    .line 154
    .line 155
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 156
    .line 157
    .line 158
    move-result-wide v5

    .line 159
    invoke-static {v5, v6}, La/hsd;->m(J)Z

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    if-eqz p1, :cond_4

    .line 164
    .line 165
    invoke-virtual {p0}, La/v680;->a()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    check-cast p0, Ljava/lang/Long;

    .line 170
    .line 171
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 172
    .line 173
    .line 174
    move-result-wide p0

    .line 175
    goto/16 :goto_3

    .line 176
    .line 177
    :cond_4
    move-wide p0, v1

    .line 178
    goto/16 :goto_3

    .line 179
    .line 180
    :goto_1
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 181
    throw p0

    .line 182
    :cond_5
    iget-object p0, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->configResolver:La/hsd;

    .line 183
    .line 184
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    const-class p1, La/ntd;

    .line 188
    .line 189
    monitor-enter p1

    .line 190
    :try_start_2
    sget-object v0, La/ntd;->a:La/ntd;

    .line 191
    .line 192
    if-nez v0, :cond_6

    .line 193
    .line 194
    new-instance v0, La/ntd;

    .line 195
    .line 196
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 197
    .line 198
    .line 199
    sput-object v0, La/ntd;->a:La/ntd;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 200
    .line 201
    goto :goto_2

    .line 202
    :catchall_1
    move-exception p0

    .line 203
    goto/16 :goto_4

    .line 204
    .line 205
    :cond_6
    :goto_2
    monitor-exit p1

    .line 206
    invoke-virtual {p0, v0}, La/hsd;->i(La/obb;)La/v680;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-virtual {p1}, La/v680;->b()Z

    .line 211
    .line 212
    .line 213
    move-result v5

    .line 214
    if-eqz v5, :cond_7

    .line 215
    .line 216
    invoke-virtual {p1}, La/v680;->a()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v5

    .line 220
    check-cast v5, Ljava/lang/Long;

    .line 221
    .line 222
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 223
    .line 224
    .line 225
    move-result-wide v5

    .line 226
    invoke-static {v5, v6}, La/hsd;->m(J)Z

    .line 227
    .line 228
    .line 229
    move-result v5

    .line 230
    if-eqz v5, :cond_7

    .line 231
    .line 232
    invoke-virtual {p1}, La/v680;->a()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    check-cast p0, Ljava/lang/Long;

    .line 237
    .line 238
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 239
    .line 240
    .line 241
    move-result-wide p0

    .line 242
    goto :goto_3

    .line 243
    :cond_7
    iget-object p1, p0, La/hsd;->a:Lcom/google/firebase/perf/config/RemoteConfigManager;

    .line 244
    .line 245
    const-string v5, "fpr_session_gauge_memory_capture_frequency_fg_ms"

    .line 246
    .line 247
    invoke-virtual {p1, v5}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getLong(Ljava/lang/String;)La/v680;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    invoke-virtual {p1}, La/v680;->b()Z

    .line 252
    .line 253
    .line 254
    move-result v5

    .line 255
    if-eqz v5, :cond_8

    .line 256
    .line 257
    invoke-virtual {p1}, La/v680;->a()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    check-cast v5, Ljava/lang/Long;

    .line 262
    .line 263
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 264
    .line 265
    .line 266
    move-result-wide v5

    .line 267
    invoke-static {v5, v6}, La/hsd;->m(J)Z

    .line 268
    .line 269
    .line 270
    move-result v5

    .line 271
    if-eqz v5, :cond_8

    .line 272
    .line 273
    iget-object p0, p0, La/hsd;->c:La/rgk;

    .line 274
    .line 275
    const-string v0, "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs"

    .line 276
    .line 277
    invoke-virtual {p1}, La/v680;->a()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v5

    .line 281
    check-cast v5, Ljava/lang/Long;

    .line 282
    .line 283
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 284
    .line 285
    .line 286
    move-result-wide v5

    .line 287
    invoke-virtual {p0, v5, v6, v0}, La/rgk;->d(JLjava/lang/String;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {p1}, La/v680;->a()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object p0

    .line 294
    check-cast p0, Ljava/lang/Long;

    .line 295
    .line 296
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 297
    .line 298
    .line 299
    move-result-wide p0

    .line 300
    goto :goto_3

    .line 301
    :cond_8
    invoke-virtual {p0, v0}, La/hsd;->c(La/obb;)La/v680;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    invoke-virtual {p1}, La/v680;->b()Z

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    if-eqz v0, :cond_9

    .line 310
    .line 311
    invoke-virtual {p1}, La/v680;->a()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    check-cast v0, Ljava/lang/Long;

    .line 316
    .line 317
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 318
    .line 319
    .line 320
    move-result-wide v5

    .line 321
    invoke-static {v5, v6}, La/hsd;->m(J)Z

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    if-eqz v0, :cond_9

    .line 326
    .line 327
    invoke-virtual {p1}, La/v680;->a()Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object p0

    .line 331
    check-cast p0, Ljava/lang/Long;

    .line 332
    .line 333
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 334
    .line 335
    .line 336
    move-result-wide p0

    .line 337
    goto :goto_3

    .line 338
    :cond_9
    iget-object p0, p0, La/hsd;->a:Lcom/google/firebase/perf/config/RemoteConfigManager;

    .line 339
    .line 340
    invoke-virtual {p0}, Lcom/google/firebase/perf/config/RemoteConfigManager;->isLastFetchFailed()Z

    .line 341
    .line 342
    .line 343
    move-result p0

    .line 344
    if-eqz p0, :cond_a

    .line 345
    .line 346
    const-wide/16 p0, 0x12c

    .line 347
    .line 348
    goto :goto_3

    .line 349
    :cond_a
    const-wide/16 p0, 0x64

    .line 350
    .line 351
    :goto_3
    sget-object v0, La/ps30;->f:La/f03;

    .line 352
    .line 353
    cmp-long v0, p0, v1

    .line 354
    .line 355
    if-gtz v0, :cond_b

    .line 356
    .line 357
    return-wide v3

    .line 358
    :cond_b
    return-wide p0

    .line 359
    :goto_4
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 360
    throw p0
.end method

.method private static synthetic lambda$new$0()La/u7f;
    .locals 1

    .line 1
    new-instance v0, La/u7f;

    .line 2
    .line 3
    invoke-direct {v0}, La/u7f;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static synthetic lambda$new$1()La/ps30;
    .locals 1

    .line 1
    new-instance v0, La/ps30;

    .line 2
    .line 3
    invoke-direct {v0}, La/ps30;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private synthetic lambda$startCollectingGauges$2(Ljava/lang/String;La/ts3;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/google/firebase/perf/session/gauges/GaugeManager;->syncFlush(Ljava/lang/String;La/ts3;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private synthetic lambda$stopCollectingGauges$3(Ljava/lang/String;La/ts3;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/google/firebase/perf/session/gauges/GaugeManager;->syncFlush(Ljava/lang/String;La/ts3;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private startCollectingCpuMetrics(JLcom/google/firebase/perf/util/Timer;)Z
    .locals 8

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    if-nez v2, :cond_0

    .line 7
    .line 8
    sget-object p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->logger:La/f03;

    .line 9
    .line 10
    const-string p1, "Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics."

    .line 11
    .line 12
    invoke-virtual {p0, p1}, La/f03;->a(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return v3

    .line 16
    :cond_0
    iget-object p0, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->cpuGaugeCollector:La/b8z;

    .line 17
    .line 18
    invoke-virtual {p0}, La/b8z;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, La/u7f;

    .line 23
    .line 24
    iget-wide v4, p0, La/u7f;->d:J

    .line 25
    .line 26
    cmp-long v2, v4, v0

    .line 27
    .line 28
    if-eqz v2, :cond_5

    .line 29
    .line 30
    const-wide/16 v6, 0x0

    .line 31
    .line 32
    cmp-long v2, v4, v6

    .line 33
    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    cmp-long v2, p1, v6

    .line 38
    .line 39
    if-gtz v2, :cond_2

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    iget-object v2, p0, La/u7f;->e:Ljava/util/concurrent/ScheduledFuture;

    .line 43
    .line 44
    if-eqz v2, :cond_4

    .line 45
    .line 46
    iget-wide v4, p0, La/u7f;->f:J

    .line 47
    .line 48
    cmp-long v4, v4, p1

    .line 49
    .line 50
    if-eqz v4, :cond_5

    .line 51
    .line 52
    if-nez v2, :cond_3

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    invoke-interface {v2, v3}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 56
    .line 57
    .line 58
    const/4 v2, 0x0

    .line 59
    iput-object v2, p0, La/u7f;->e:Ljava/util/concurrent/ScheduledFuture;

    .line 60
    .line 61
    iput-wide v0, p0, La/u7f;->f:J

    .line 62
    .line 63
    :goto_0
    invoke-virtual {p0, p1, p2, p3}, La/u7f;->a(JLcom/google/firebase/perf/util/Timer;)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_4
    invoke-virtual {p0, p1, p2, p3}, La/u7f;->a(JLcom/google/firebase/perf/util/Timer;)V

    .line 68
    .line 69
    .line 70
    :cond_5
    :goto_1
    const/4 p0, 0x1

    .line 71
    return p0
.end method

.method private startCollectingGauges(La/ts3;Lcom/google/firebase/perf/util/Timer;)J
    .locals 7

    .line 89
    invoke-direct {p0, p1}, Lcom/google/firebase/perf/session/gauges/GaugeManager;->getCpuGaugeCollectionFrequencyMs(La/ts3;)J

    move-result-wide v0

    .line 90
    invoke-direct {p0, v0, v1, p2}, Lcom/google/firebase/perf/session/gauges/GaugeManager;->startCollectingCpuMetrics(JLcom/google/firebase/perf/util/Timer;)Z

    move-result v2

    const-wide/16 v3, -0x1

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move-wide v0, v3

    .line 91
    :goto_0
    invoke-direct {p0, p1}, Lcom/google/firebase/perf/session/gauges/GaugeManager;->getMemoryGaugeCollectionFrequencyMs(La/ts3;)J

    move-result-wide v5

    .line 92
    invoke-direct {p0, v5, v6, p2}, Lcom/google/firebase/perf/session/gauges/GaugeManager;->startCollectingMemoryMetrics(JLcom/google/firebase/perf/util/Timer;)Z

    move-result p0

    if-eqz p0, :cond_2

    cmp-long p0, v0, v3

    if-nez p0, :cond_1

    return-wide v5

    .line 93
    :cond_1
    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p0

    return-wide p0

    :cond_2
    return-wide v0
.end method

.method private startCollectingMemoryMetrics(JLcom/google/firebase/perf/util/Timer;)Z
    .locals 6

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    if-nez v2, :cond_0

    .line 7
    .line 8
    sget-object p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->logger:La/f03;

    .line 9
    .line 10
    const-string p1, "Invalid Memory Metrics collection frequency. Did not collect Memory Metrics."

    .line 11
    .line 12
    invoke-virtual {p0, p1}, La/f03;->a(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return v3

    .line 16
    :cond_0
    iget-object p0, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->memoryGaugeCollector:La/b8z;

    .line 17
    .line 18
    invoke-virtual {p0}, La/b8z;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, La/ps30;

    .line 23
    .line 24
    sget-object v2, La/ps30;->f:La/f03;

    .line 25
    .line 26
    const-wide/16 v4, 0x0

    .line 27
    .line 28
    cmp-long v2, p1, v4

    .line 29
    .line 30
    if-gtz v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    iget-object v2, p0, La/ps30;->d:Ljava/util/concurrent/ScheduledFuture;

    .line 37
    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    iget-wide v4, p0, La/ps30;->e:J

    .line 41
    .line 42
    cmp-long v4, v4, p1

    .line 43
    .line 44
    if-eqz v4, :cond_4

    .line 45
    .line 46
    if-nez v2, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    invoke-interface {v2, v3}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 50
    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    iput-object v2, p0, La/ps30;->d:Ljava/util/concurrent/ScheduledFuture;

    .line 54
    .line 55
    iput-wide v0, p0, La/ps30;->e:J

    .line 56
    .line 57
    :goto_0
    invoke-virtual {p0, p1, p2, p3}, La/ps30;->a(JLcom/google/firebase/perf/util/Timer;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    invoke-virtual {p0, p1, p2, p3}, La/ps30;->a(JLcom/google/firebase/perf/util/Timer;)V

    .line 62
    .line 63
    .line 64
    :cond_4
    :goto_1
    const/4 p0, 0x1

    .line 65
    return p0
.end method

.method private syncFlush(Ljava/lang/String;La/ts3;)V
    .locals 3

    .line 1
    invoke-static {}, La/set;->z()La/ret;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    iget-object v1, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->cpuGaugeCollector:La/b8z;

    .line 6
    .line 7
    invoke-virtual {v1}, La/b8z;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, La/u7f;

    .line 12
    .line 13
    iget-object v1, v1, La/u7f;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    iget-object v1, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->cpuGaugeCollector:La/b8z;

    .line 22
    .line 23
    invoke-virtual {v1}, La/b8z;->get()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, La/u7f;

    .line 28
    .line 29
    iget-object v1, v1, La/u7f;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, La/y7f;

    .line 36
    .line 37
    invoke-virtual {v0}, La/zit;->i()V

    .line 38
    .line 39
    .line 40
    iget-object v2, v0, La/zit;->b:La/kjt;

    .line 41
    .line 42
    check-cast v2, La/set;

    .line 43
    .line 44
    invoke-virtual {v2, v1}, La/set;->s(La/y7f;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    :goto_1
    iget-object v1, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->memoryGaugeCollector:La/b8z;

    .line 49
    .line 50
    invoke-virtual {v1}, La/b8z;->get()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, La/ps30;

    .line 55
    .line 56
    iget-object v1, v1, La/ps30;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-nez v1, :cond_1

    .line 63
    .line 64
    iget-object v1, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->memoryGaugeCollector:La/b8z;

    .line 65
    .line 66
    invoke-virtual {v1}, La/b8z;->get()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, La/ps30;

    .line 71
    .line 72
    iget-object v1, v1, La/ps30;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    check-cast v1, La/m03;

    .line 79
    .line 80
    invoke-virtual {v0}, La/zit;->i()V

    .line 81
    .line 82
    .line 83
    iget-object v2, v0, La/zit;->b:La/kjt;

    .line 84
    .line 85
    check-cast v2, La/set;

    .line 86
    .line 87
    invoke-virtual {v2, v1}, La/set;->r(La/m03;)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_1
    invoke-virtual {v0}, La/zit;->i()V

    .line 92
    .line 93
    .line 94
    iget-object v1, v0, La/zit;->b:La/kjt;

    .line 95
    .line 96
    check-cast v1, La/set;

    .line 97
    .line 98
    invoke-virtual {v1, p1}, La/set;->B(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    iget-object p0, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->transportManager:La/dps0;

    .line 102
    .line 103
    invoke-virtual {v0}, La/zit;->h()La/kjt;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    check-cast p1, La/set;

    .line 108
    .line 109
    iget-object v0, p0, La/dps0;->i:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 110
    .line 111
    new-instance v1, La/b1;

    .line 112
    .line 113
    const/16 v2, 0x1c

    .line 114
    .line 115
    invoke-direct {v1, p0, p1, p2, v2}, La/b1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 119
    .line 120
    .line 121
    return-void
.end method


# virtual methods
.method public collectGaugeMetricOnce(Lcom/google/firebase/perf/util/Timer;)V
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->cpuGaugeCollector:La/b8z;

    invoke-virtual {v0}, La/b8z;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/u7f;

    iget-object p0, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->memoryGaugeCollector:La/b8z;

    invoke-virtual {p0}, La/b8z;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, La/ps30;

    invoke-static {v0, p0, p1}, Lcom/google/firebase/perf/session/gauges/GaugeManager;->collectGaugeMetricOnce(La/u7f;La/ps30;Lcom/google/firebase/perf/util/Timer;)V

    return-void
.end method

.method public initializeGaugeMetadataManager(Landroid/content/Context;)V
    .locals 1

    .line 1
    new-instance v0, La/qet;

    .line 2
    .line 3
    invoke-direct {v0, p1}, La/qet;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->gaugeMetadataManager:La/qet;

    .line 7
    .line 8
    return-void
.end method

.method public logGaugeMetadata(Ljava/lang/String;La/ts3;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->gaugeMetadataManager:La/qet;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, La/set;->z()La/ret;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, La/zit;->i()V

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, La/zit;->b:La/kjt;

    .line 13
    .line 14
    check-cast v1, La/set;

    .line 15
    .line 16
    invoke-virtual {v1, p1}, La/set;->B(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Lcom/google/firebase/perf/session/gauges/GaugeManager;->getGaugeMetadata()La/pet;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {v0}, La/zit;->i()V

    .line 24
    .line 25
    .line 26
    iget-object v1, v0, La/zit;->b:La/kjt;

    .line 27
    .line 28
    check-cast v1, La/set;

    .line 29
    .line 30
    invoke-virtual {v1, p1}, La/set;->A(La/pet;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, La/zit;->h()La/kjt;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, La/set;

    .line 38
    .line 39
    iget-object p0, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->transportManager:La/dps0;

    .line 40
    .line 41
    iget-object v0, p0, La/dps0;->i:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 42
    .line 43
    new-instance v1, La/b1;

    .line 44
    .line 45
    const/16 v2, 0x1c

    .line 46
    .line 47
    invoke-direct {v1, p0, p1, p2, v2}, La/b1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 51
    .line 52
    .line 53
    const/4 p0, 0x1

    .line 54
    return p0

    .line 55
    :cond_0
    const/4 p0, 0x0

    .line 56
    return p0
.end method

.method public startCollectingGauges(Lcom/google/firebase/perf/session/PerfSession;La/ts3;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->sessionId:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/firebase/perf/session/gauges/GaugeManager;->stopCollectingGauges()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p1, Lcom/google/firebase/perf/session/PerfSession;->b:Lcom/google/firebase/perf/util/Timer;

    .line 9
    .line 10
    invoke-direct {p0, p2, v0}, Lcom/google/firebase/perf/session/gauges/GaugeManager;->startCollectingGauges(La/ts3;Lcom/google/firebase/perf/util/Timer;)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    const-wide/16 v2, -0x1

    .line 15
    .line 16
    cmp-long v2, v0, v2

    .line 17
    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    sget-object p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->logger:La/f03;

    .line 21
    .line 22
    const-string p1, "Invalid gauge collection frequency. Unable to start collecting Gauges."

    .line 23
    .line 24
    invoke-virtual {p0, p1}, La/f03;->f(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    iget-object p1, p1, Lcom/google/firebase/perf/session/PerfSession;->a:Ljava/lang/String;

    .line 29
    .line 30
    iput-object p1, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->sessionId:Ljava/lang/String;

    .line 31
    .line 32
    iput-object p2, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->applicationProcessState:La/ts3;

    .line 33
    .line 34
    :try_start_0
    iget-object v2, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->gaugeManagerExecutor:La/b8z;

    .line 35
    .line 36
    invoke-virtual {v2}, La/b8z;->get()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    move-object v3, v2

    .line 41
    check-cast v3, Ljava/util/concurrent/ScheduledExecutorService;

    .line 42
    .line 43
    new-instance v4, La/net;

    .line 44
    .line 45
    const/4 v2, 0x1

    .line 46
    invoke-direct {v4, p0, p1, p2, v2}, La/net;-><init>(Lcom/google/firebase/perf/session/gauges/GaugeManager;Ljava/lang/String;La/ts3;B)V

    .line 47
    .line 48
    .line 49
    const-wide/16 p1, 0x14

    .line 50
    .line 51
    mul-long v5, v0, p1

    .line 52
    .line 53
    sget-object v9, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 54
    .line 55
    move-wide v7, v5

    .line 56
    invoke-interface/range {v3 .. v9}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iput-object p1, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->gaugeManagerDataCollectionJob:Ljava/util/concurrent/ScheduledFuture;
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    .line 62
    return-void

    .line 63
    :catch_0
    move-exception v0

    .line 64
    move-object p0, v0

    .line 65
    sget-object p1, Lcom/google/firebase/perf/session/gauges/GaugeManager;->logger:La/f03;

    .line 66
    .line 67
    new-instance p2, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v0, "Unable to start collecting Gauges: "

    .line 70
    .line 71
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {p1, p0}, La/f03;->f(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public stopCollectingGauges()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->sessionId:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v1, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->applicationProcessState:La/ts3;

    .line 7
    .line 8
    iget-object v2, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->cpuGaugeCollector:La/b8z;

    .line 9
    .line 10
    invoke-virtual {v2}, La/b8z;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, La/u7f;

    .line 15
    .line 16
    iget-object v3, v2, La/u7f;->e:Ljava/util/concurrent/ScheduledFuture;

    .line 17
    .line 18
    const-wide/16 v4, -0x1

    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x0

    .line 22
    if-nez v3, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-interface {v3, v7}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 26
    .line 27
    .line 28
    iput-object v6, v2, La/u7f;->e:Ljava/util/concurrent/ScheduledFuture;

    .line 29
    .line 30
    iput-wide v4, v2, La/u7f;->f:J

    .line 31
    .line 32
    :goto_0
    iget-object v2, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->memoryGaugeCollector:La/b8z;

    .line 33
    .line 34
    invoke-virtual {v2}, La/b8z;->get()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, La/ps30;

    .line 39
    .line 40
    iget-object v3, v2, La/ps30;->d:Ljava/util/concurrent/ScheduledFuture;

    .line 41
    .line 42
    if-nez v3, :cond_2

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    invoke-interface {v3, v7}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 46
    .line 47
    .line 48
    iput-object v6, v2, La/ps30;->d:Ljava/util/concurrent/ScheduledFuture;

    .line 49
    .line 50
    iput-wide v4, v2, La/ps30;->e:J

    .line 51
    .line 52
    :goto_1
    iget-object v2, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->gaugeManagerDataCollectionJob:Ljava/util/concurrent/ScheduledFuture;

    .line 53
    .line 54
    if-eqz v2, :cond_3

    .line 55
    .line 56
    invoke-interface {v2, v7}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 57
    .line 58
    .line 59
    :cond_3
    iget-object v2, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->gaugeManagerExecutor:La/b8z;

    .line 60
    .line 61
    invoke-virtual {v2}, La/b8z;->get()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, Ljava/util/concurrent/ScheduledExecutorService;

    .line 66
    .line 67
    new-instance v3, La/net;

    .line 68
    .line 69
    invoke-direct {v3, p0, v0, v1, v7}, La/net;-><init>(Lcom/google/firebase/perf/session/gauges/GaugeManager;Ljava/lang/String;La/ts3;B)V

    .line 70
    .line 71
    .line 72
    const-wide/16 v0, 0x14

    .line 73
    .line 74
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 75
    .line 76
    invoke-interface {v2, v3, v0, v1, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 77
    .line 78
    .line 79
    iput-object v6, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->sessionId:Ljava/lang/String;

    .line 80
    .line 81
    sget-object v0, La/ts3;->b:La/ts3;

    .line 82
    .line 83
    iput-object v0, p0, Lcom/google/firebase/perf/session/gauges/GaugeManager;->applicationProcessState:La/ts3;

    .line 84
    .line 85
    return-void
.end method
