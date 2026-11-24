.class public final La/dps0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/lj3;


# static fields
.field public static final r:La/f03;

.field public static final s:La/dps0;


# instance fields
.field public final a:Ljava/util/concurrent/ConcurrentHashMap;

.field public final b:Ljava/util/concurrent/ConcurrentLinkedQueue;

.field public final c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public d:La/nfq;

.field public e:La/sgq;

.field public f:La/dgq;

.field public g:La/p5d0;

.field public h:La/pkq;

.field public final i:Ljava/util/concurrent/ThreadPoolExecutor;

.field public j:Landroid/content/Context;

.field public k:La/hsd;

.field public l:La/y2e0;

.field public m:La/mj3;

.field public n:La/zr3;

.field public o:Ljava/lang/String;

.field public p:Ljava/lang/String;

.field public q:Z


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
    sput-object v0, La/dps0;->r:La/f03;

    .line 6
    .line 7
    new-instance v0, La/dps0;

    .line 8
    .line 9
    invoke-direct {v0}, La/dps0;-><init>()V

    .line 10
    .line 11
    .line 12
    sput-object v0, La/dps0;->s:La/dps0;

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/dps0;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, La/dps0;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 18
    .line 19
    iput-boolean v1, p0, La/dps0;->q:Z

    .line 20
    .line 21
    new-instance v2, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 22
    .line 23
    new-instance v8, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 24
    .line 25
    invoke-direct {v8}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 26
    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    const/4 v4, 0x1

    .line 30
    const-wide/16 v5, 0xa

    .line 31
    .line 32
    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 33
    .line 34
    invoke-direct/range {v2 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    .line 35
    .line 36
    .line 37
    iput-object v2, p0, La/dps0;->i:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 38
    .line 39
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, La/dps0;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 45
    .line 46
    const/16 p0, 0x32

    .line 47
    .line 48
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    const-string v1, "KEY_AVAILABLE_TRACES_FOR_CACHING"

    .line 53
    .line 54
    invoke-virtual {v0, v1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    const-string v1, "KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING"

    .line 58
    .line 59
    invoke-virtual {v0, v1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    const-string v1, "KEY_AVAILABLE_GAUGES_FOR_CACHING"

    .line 63
    .line 64
    invoke-virtual {v0, v1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public static a(La/od90;)Ljava/lang/String;
    .locals 8

    .line 1
    invoke-interface {p0}, La/od90;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "ms)"

    .line 6
    .line 7
    const-wide v2, 0x408f400000000000L    # 1000.0

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const-string v4, "#.####"

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, La/od90;->e()La/ibs0;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, La/ibs0;->A()J

    .line 21
    .line 22
    .line 23
    move-result-wide v5

    .line 24
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 25
    .line 26
    invoke-virtual {p0}, La/ibs0;->B()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    new-instance v0, Ljava/text/DecimalFormat;

    .line 31
    .line 32
    invoke-direct {v0, v4}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    long-to-double v4, v5

    .line 36
    div-double/2addr v4, v2

    .line 37
    invoke-virtual {v0, v4, v5}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const-string v2, "trace metric: "

    .line 42
    .line 43
    const-string v3, " (duration: "

    .line 44
    .line 45
    invoke-static {v2, p0, v3, v0, v1}, La/b1j;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :cond_0
    invoke-interface {p0}, La/od90;->b()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    invoke-interface {p0}, La/od90;->c()La/ll50;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0}, La/ll50;->K()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_1

    .line 65
    .line 66
    invoke-virtual {p0}, La/ll50;->B()J

    .line 67
    .line 68
    .line 69
    move-result-wide v5

    .line 70
    goto :goto_0

    .line 71
    :cond_1
    const-wide/16 v5, 0x0

    .line 72
    .line 73
    :goto_0
    invoke-virtual {p0}, La/ll50;->G()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    invoke-virtual {p0}, La/ll50;->w()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    goto :goto_1

    .line 88
    :cond_2
    const-string v0, "UNKNOWN"

    .line 89
    .line 90
    :goto_1
    sget-object v7, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 91
    .line 92
    invoke-virtual {p0}, La/ll50;->D()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    new-instance v7, Ljava/text/DecimalFormat;

    .line 97
    .line 98
    invoke-direct {v7, v4}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    long-to-double v4, v5

    .line 102
    div-double/2addr v4, v2

    .line 103
    invoke-virtual {v7, v4, v5}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    const-string v3, " (responseCode: "

    .line 108
    .line 109
    const-string v4, ", responseTime: "

    .line 110
    .line 111
    const-string v5, "network request trace: "

    .line 112
    .line 113
    invoke-static {v5, p0, v3, v0, v4}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-static {p0, v2, v1}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    return-object p0

    .line 122
    :cond_3
    invoke-interface {p0}, La/od90;->a()Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_4

    .line 127
    .line 128
    invoke-interface {p0}, La/od90;->f()La/set;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 133
    .line 134
    invoke-virtual {p0}, La/set;->x()Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    invoke-virtual {p0}, La/set;->u()I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    invoke-virtual {p0}, La/set;->t()I

    .line 143
    .line 144
    .line 145
    move-result p0

    .line 146
    const-string v2, ", cpuGaugeCount: "

    .line 147
    .line 148
    const-string v3, ", memoryGaugeCount: "

    .line 149
    .line 150
    const-string v4, "gauges (hasMetadata: "

    .line 151
    .line 152
    invoke-static {v1, v4, v2, v3, v0}, La/ohs0;->t(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    const-string v1, ")"

    .line 157
    .line 158
    invoke-static {p0, v1, v0}, La/rz4;->j(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    return-object p0

    .line 163
    :cond_4
    const-string p0, "log"

    .line 164
    .line 165
    return-object p0
.end method


# virtual methods
.method public final b(La/nd90;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, La/nd90;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, La/dps0;->m:La/mj3;

    .line 8
    .line 9
    const-string p1, "_fstec"

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/mj3;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p1}, La/nd90;->b()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    iget-object p0, p0, La/dps0;->m:La/mj3;

    .line 22
    .line 23
    const-string p1, "_fsntc"

    .line 24
    .line 25
    invoke-virtual {p0, p1}, La/mj3;->b(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
.end method

.method public final c(La/ibs0;La/ts3;)V
    .locals 2

    .line 1
    new-instance v0, La/b1;

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2, v1}, La/b1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/dps0;->i:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final d(La/md90;La/ts3;)V
    .locals 13

    .line 1
    iget-object v0, p0, La/dps0;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_3

    .line 9
    .line 10
    iget-object v0, p0, La/dps0;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    const-string v2, "KEY_AVAILABLE_TRACES_FOR_CACHING"

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    const-string v5, "KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING"

    .line 25
    .line 26
    invoke-virtual {v0, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    check-cast v6, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    const-string v8, "KEY_AVAILABLE_GAUGES_FOR_CACHING"

    .line 37
    .line 38
    invoke-virtual {v0, v8}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v9

    .line 42
    check-cast v9, Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result v10

    .line 48
    invoke-virtual {p1}, La/md90;->d()Z

    .line 49
    .line 50
    .line 51
    move-result v11

    .line 52
    if-eqz v11, :cond_0

    .line 53
    .line 54
    if-lez v4, :cond_0

    .line 55
    .line 56
    sub-int/2addr v4, v1

    .line 57
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    invoke-virtual {p1}, La/md90;->b()Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_1

    .line 70
    .line 71
    if-lez v7, :cond_1

    .line 72
    .line 73
    sub-int/2addr v7, v1

    .line 74
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v0, v5, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    invoke-virtual {p1}, La/md90;->a()Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_2

    .line 87
    .line 88
    if-lez v10, :cond_2

    .line 89
    .line 90
    sub-int/2addr v10, v1

    .line 91
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v0, v8, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    :goto_0
    sget-object v0, La/dps0;->r:La/f03;

    .line 99
    .line 100
    const-string v1, "Transport is not initialized yet, %s will be queued for to be dispatched later"

    .line 101
    .line 102
    invoke-static {p1}, La/dps0;->a(La/od90;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-virtual {v0, v1, v2}, La/f03;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    iget-object p0, p0, La/dps0;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 114
    .line 115
    new-instance v0, La/id90;

    .line 116
    .line 117
    invoke-direct {v0, p1, p2}, La/id90;-><init>(La/md90;La/ts3;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0, v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :cond_2
    sget-object p0, La/dps0;->r:La/f03;

    .line 125
    .line 126
    const-string p2, "%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d)."

    .line 127
    .line 128
    invoke-static {p1}, La/dps0;->a(La/od90;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    filled-new-array {p1, v3, v6, v9}, [Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-virtual {p0, p2, p1}, La/f03;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_3
    sget-object v0, La/dps0;->r:La/f03;

    .line 141
    .line 142
    iget-object v2, p0, La/dps0;->k:La/hsd;

    .line 143
    .line 144
    invoke-virtual {v2}, La/hsd;->n()Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    const/4 v3, 0x0

    .line 149
    if-eqz v2, :cond_6

    .line 150
    .line 151
    iget-object v2, p0, La/dps0;->n:La/zr3;

    .line 152
    .line 153
    iget-object v2, v2, La/zit;->b:La/kjt;

    .line 154
    .line 155
    check-cast v2, La/cs3;

    .line 156
    .line 157
    invoke-virtual {v2}, La/cs3;->u()Z

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    if-eqz v2, :cond_4

    .line 162
    .line 163
    iget-boolean v2, p0, La/dps0;->q:Z

    .line 164
    .line 165
    if-nez v2, :cond_4

    .line 166
    .line 167
    goto :goto_6

    .line 168
    :cond_4
    :try_start_0
    iget-object v2, p0, La/dps0;->f:La/dgq;

    .line 169
    .line 170
    check-cast v2, La/cgq;

    .line 171
    .line 172
    invoke-virtual {v2}, La/cgq;->c()Lcom/google/android/gms/tasks/Task;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 177
    .line 178
    const-wide/32 v5, 0xea60

    .line 179
    .line 180
    .line 181
    invoke-static {v2, v5, v6, v4}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    check-cast v2, Ljava/lang/String;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    .line 186
    .line 187
    goto :goto_5

    .line 188
    :catch_0
    move-exception v2

    .line 189
    goto :goto_1

    .line 190
    :catch_1
    move-exception v2

    .line 191
    goto :goto_2

    .line 192
    :catch_2
    move-exception v2

    .line 193
    goto :goto_3

    .line 194
    :goto_1
    const-string v4, "Task to retrieve Installation Id is timed out: %s"

    .line 195
    .line 196
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    invoke-virtual {v0, v4, v2}, La/f03;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    goto :goto_4

    .line 208
    :goto_2
    const-string v4, "Task to retrieve Installation Id is interrupted: %s"

    .line 209
    .line 210
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-virtual {v0, v4, v2}, La/f03;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    goto :goto_4

    .line 222
    :goto_3
    const-string v4, "Unable to retrieve Installation Id: %s"

    .line 223
    .line 224
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    invoke-virtual {v0, v4, v2}, La/f03;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    :goto_4
    move-object v2, v3

    .line 236
    :goto_5
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 237
    .line 238
    .line 239
    move-result v4

    .line 240
    if-nez v4, :cond_5

    .line 241
    .line 242
    iget-object v0, p0, La/dps0;->n:La/zr3;

    .line 243
    .line 244
    invoke-virtual {v0}, La/zit;->i()V

    .line 245
    .line 246
    .line 247
    iget-object v0, v0, La/zit;->b:La/kjt;

    .line 248
    .line 249
    check-cast v0, La/cs3;

    .line 250
    .line 251
    invoke-virtual {v0, v2}, La/cs3;->A(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    goto :goto_6

    .line 255
    :cond_5
    const-string v2, "Firebase Installation Id is empty, contact Firebase Support for debugging."

    .line 256
    .line 257
    invoke-virtual {v0, v2}, La/f03;->f(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    :cond_6
    :goto_6
    iget-object v0, p0, La/dps0;->n:La/zr3;

    .line 261
    .line 262
    invoke-virtual {v0}, La/zit;->i()V

    .line 263
    .line 264
    .line 265
    iget-object v2, v0, La/zit;->b:La/kjt;

    .line 266
    .line 267
    check-cast v2, La/cs3;

    .line 268
    .line 269
    invoke-virtual {v2, p2}, La/cs3;->B(La/ts3;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p1}, La/md90;->d()Z

    .line 273
    .line 274
    .line 275
    move-result p2

    .line 276
    if-nez p2, :cond_7

    .line 277
    .line 278
    invoke-virtual {p1}, La/md90;->b()Z

    .line 279
    .line 280
    .line 281
    move-result p2

    .line 282
    if-eqz p2, :cond_b

    .line 283
    .line 284
    :cond_7
    iget-object p2, v0, La/zit;->a:La/kjt;

    .line 285
    .line 286
    const/4 v2, 0x5

    .line 287
    invoke-virtual {p2, v2}, La/kjt;->j(I)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object p2

    .line 291
    check-cast p2, La/zit;

    .line 292
    .line 293
    iget-object v2, v0, La/zit;->b:La/kjt;

    .line 294
    .line 295
    invoke-virtual {v2}, La/kjt;->m()Z

    .line 296
    .line 297
    .line 298
    move-result v2

    .line 299
    iget-object v4, v0, La/zit;->b:La/kjt;

    .line 300
    .line 301
    if-nez v2, :cond_8

    .line 302
    .line 303
    goto :goto_7

    .line 304
    :cond_8
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    sget-object v2, La/b5d0;->c:La/b5d0;

    .line 308
    .line 309
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    move-result-object v5

    .line 316
    invoke-virtual {v2, v5}, La/b5d0;->a(Ljava/lang/Class;)La/p2h0;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    invoke-interface {v2, v4}, La/p2h0;->b(Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v4}, La/kjt;->n()V

    .line 324
    .line 325
    .line 326
    iget-object v4, v0, La/zit;->b:La/kjt;

    .line 327
    .line 328
    :goto_7
    iput-object v4, p2, La/zit;->b:La/kjt;

    .line 329
    .line 330
    move-object v0, p2

    .line 331
    check-cast v0, La/zr3;

    .line 332
    .line 333
    iget-object p2, p0, La/dps0;->e:La/sgq;

    .line 334
    .line 335
    if-nez p2, :cond_9

    .line 336
    .line 337
    iget-object p2, p0, La/dps0;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 338
    .line 339
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 340
    .line 341
    .line 342
    move-result p2

    .line 343
    if-eqz p2, :cond_9

    .line 344
    .line 345
    sget-object p2, La/sgq;->b:La/f03;

    .line 346
    .line 347
    invoke-static {}, La/nfq;->d()La/nfq;

    .line 348
    .line 349
    .line 350
    move-result-object p2

    .line 351
    const-class v2, La/sgq;

    .line 352
    .line 353
    invoke-virtual {p2, v2}, La/nfq;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object p2

    .line 357
    check-cast p2, La/sgq;

    .line 358
    .line 359
    iput-object p2, p0, La/dps0;->e:La/sgq;

    .line 360
    .line 361
    :cond_9
    iget-object p2, p0, La/dps0;->e:La/sgq;

    .line 362
    .line 363
    if-eqz p2, :cond_a

    .line 364
    .line 365
    new-instance v2, Ljava/util/HashMap;

    .line 366
    .line 367
    iget-object p2, p2, La/sgq;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 368
    .line 369
    invoke-direct {v2, p2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 370
    .line 371
    .line 372
    goto :goto_8

    .line 373
    :cond_a
    sget-object v2, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 374
    .line 375
    :goto_8
    invoke-virtual {v0}, La/zit;->i()V

    .line 376
    .line 377
    .line 378
    iget-object p2, v0, La/zit;->b:La/kjt;

    .line 379
    .line 380
    check-cast p2, La/cs3;

    .line 381
    .line 382
    invoke-virtual {p2}, La/cs3;->x()La/vo20;

    .line 383
    .line 384
    .line 385
    move-result-object p2

    .line 386
    invoke-virtual {p2, v2}, La/vo20;->putAll(Ljava/util/Map;)V

    .line 387
    .line 388
    .line 389
    :cond_b
    invoke-virtual {p1}, La/zit;->i()V

    .line 390
    .line 391
    .line 392
    iget-object p2, p1, La/zit;->b:La/kjt;

    .line 393
    .line 394
    check-cast p2, La/nd90;

    .line 395
    .line 396
    invoke-virtual {v0}, La/zit;->h()La/kjt;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    check-cast v0, La/cs3;

    .line 401
    .line 402
    invoke-virtual {p2, v0}, La/nd90;->u(La/cs3;)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {p1}, La/zit;->h()La/kjt;

    .line 406
    .line 407
    .line 408
    move-result-object p1

    .line 409
    check-cast p1, La/nd90;

    .line 410
    .line 411
    iget-object p2, p0, La/dps0;->k:La/hsd;

    .line 412
    .line 413
    invoke-virtual {p2}, La/hsd;->n()Z

    .line 414
    .line 415
    .line 416
    move-result p2

    .line 417
    if-nez p2, :cond_c

    .line 418
    .line 419
    sget-object p0, La/dps0;->r:La/f03;

    .line 420
    .line 421
    const-string p2, "Performance collection is not enabled, dropping %s"

    .line 422
    .line 423
    invoke-static {p1}, La/dps0;->a(La/od90;)Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object p1

    .line 427
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object p1

    .line 431
    invoke-virtual {p0, p2, p1}, La/f03;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    goto/16 :goto_1e

    .line 435
    .line 436
    :cond_c
    invoke-virtual {p1}, La/nd90;->r()La/cs3;

    .line 437
    .line 438
    .line 439
    move-result-object p2

    .line 440
    invoke-virtual {p2}, La/cs3;->u()Z

    .line 441
    .line 442
    .line 443
    move-result p2

    .line 444
    if-nez p2, :cond_d

    .line 445
    .line 446
    sget-object p0, La/dps0;->r:La/f03;

    .line 447
    .line 448
    const-string p2, "App Instance ID is null or empty, dropping %s"

    .line 449
    .line 450
    invoke-static {p1}, La/dps0;->a(La/od90;)Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object p1

    .line 454
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object p1

    .line 458
    invoke-virtual {p0, p2, p1}, La/f03;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    goto/16 :goto_1e

    .line 462
    .line 463
    :cond_d
    iget-object p2, p0, La/dps0;->j:Landroid/content/Context;

    .line 464
    .line 465
    sget-object v0, La/pd90;->a:Ljava/util/regex/Pattern;

    .line 466
    .line 467
    new-instance v0, Ljava/util/ArrayList;

    .line 468
    .line 469
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 470
    .line 471
    .line 472
    invoke-virtual {p1}, La/nd90;->d()Z

    .line 473
    .line 474
    .line 475
    move-result v2

    .line 476
    if-eqz v2, :cond_e

    .line 477
    .line 478
    new-instance v2, La/rgq;

    .line 479
    .line 480
    invoke-virtual {p1}, La/nd90;->e()La/ibs0;

    .line 481
    .line 482
    .line 483
    move-result-object v4

    .line 484
    invoke-direct {v2, v4}, La/rgq;-><init>(La/ibs0;)V

    .line 485
    .line 486
    .line 487
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 488
    .line 489
    .line 490
    :cond_e
    invoke-virtual {p1}, La/nd90;->b()Z

    .line 491
    .line 492
    .line 493
    move-result v2

    .line 494
    if-eqz v2, :cond_f

    .line 495
    .line 496
    new-instance v2, La/qgq;

    .line 497
    .line 498
    invoke-virtual {p1}, La/nd90;->c()La/ll50;

    .line 499
    .line 500
    .line 501
    move-result-object v4

    .line 502
    invoke-direct {v2, v4, p2}, La/qgq;-><init>(La/ll50;Landroid/content/Context;)V

    .line 503
    .line 504
    .line 505
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 506
    .line 507
    .line 508
    :cond_f
    invoke-virtual {p1}, La/nd90;->s()Z

    .line 509
    .line 510
    .line 511
    move-result p2

    .line 512
    if-eqz p2, :cond_10

    .line 513
    .line 514
    new-instance p2, La/ngq;

    .line 515
    .line 516
    invoke-virtual {p1}, La/nd90;->r()La/cs3;

    .line 517
    .line 518
    .line 519
    move-result-object v2

    .line 520
    invoke-direct {p2, v2}, La/ngq;-><init>(La/cs3;)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 524
    .line 525
    .line 526
    :cond_10
    invoke-virtual {p1}, La/nd90;->a()Z

    .line 527
    .line 528
    .line 529
    move-result p2

    .line 530
    if-eqz p2, :cond_11

    .line 531
    .line 532
    new-instance p2, La/pgq;

    .line 533
    .line 534
    invoke-virtual {p1}, La/nd90;->f()La/set;

    .line 535
    .line 536
    .line 537
    move-result-object v2

    .line 538
    invoke-direct {p2, v2}, La/pgq;-><init>(La/set;)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 542
    .line 543
    .line 544
    :cond_11
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 545
    .line 546
    .line 547
    move-result p2

    .line 548
    if-eqz p2, :cond_12

    .line 549
    .line 550
    invoke-static {}, La/f03;->d()La/f03;

    .line 551
    .line 552
    .line 553
    move-result-object p0

    .line 554
    const-string p2, "No validators found for PerfMetric."

    .line 555
    .line 556
    invoke-virtual {p0, p2}, La/f03;->a(Ljava/lang/String;)V

    .line 557
    .line 558
    .line 559
    goto :goto_9

    .line 560
    :cond_12
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 561
    .line 562
    .line 563
    move-result-object p2

    .line 564
    :cond_13
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 565
    .line 566
    .line 567
    move-result v0

    .line 568
    if-eqz v0, :cond_14

    .line 569
    .line 570
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    check-cast v0, La/pd90;

    .line 575
    .line 576
    invoke-virtual {v0}, La/pd90;->a()Z

    .line 577
    .line 578
    .line 579
    move-result v0

    .line 580
    if-nez v0, :cond_13

    .line 581
    .line 582
    :goto_9
    sget-object p0, La/dps0;->r:La/f03;

    .line 583
    .line 584
    const-string p2, "Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values."

    .line 585
    .line 586
    invoke-static {p1}, La/dps0;->a(La/od90;)Ljava/lang/String;

    .line 587
    .line 588
    .line 589
    move-result-object p1

    .line 590
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object p1

    .line 594
    invoke-virtual {p0, p2, p1}, La/f03;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 595
    .line 596
    .line 597
    goto/16 :goto_1e

    .line 598
    .line 599
    :cond_14
    iget-object p2, p0, La/dps0;->l:La/y2e0;

    .line 600
    .line 601
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 602
    .line 603
    .line 604
    invoke-virtual {p1}, La/nd90;->d()Z

    .line 605
    .line 606
    .line 607
    move-result v0

    .line 608
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 609
    .line 610
    const-wide v6, 0x3f50624dd2f1a9fcL    # 0.001

    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    if-eqz v0, :cond_1a

    .line 616
    .line 617
    iget-object v0, p2, La/y2e0;->a:La/hsd;

    .line 618
    .line 619
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 620
    .line 621
    .line 622
    const-class v2, La/rtd;

    .line 623
    .line 624
    monitor-enter v2

    .line 625
    :try_start_1
    sget-object v8, La/rtd;->a:La/rtd;

    .line 626
    .line 627
    if-nez v8, :cond_15

    .line 628
    .line 629
    new-instance v8, La/rtd;

    .line 630
    .line 631
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 632
    .line 633
    .line 634
    sput-object v8, La/rtd;->a:La/rtd;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 635
    .line 636
    goto :goto_a

    .line 637
    :catchall_0
    move-exception p0

    .line 638
    goto/16 :goto_c

    .line 639
    .line 640
    :cond_15
    :goto_a
    monitor-exit v2

    .line 641
    iget-object v2, v0, La/hsd;->a:Lcom/google/firebase/perf/config/RemoteConfigManager;

    .line 642
    .line 643
    const-string v9, "fpr_vc_trace_sampling_rate"

    .line 644
    .line 645
    invoke-virtual {v2, v9}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getDouble(Ljava/lang/String;)La/v680;

    .line 646
    .line 647
    .line 648
    move-result-object v2

    .line 649
    invoke-virtual {v2}, La/v680;->b()Z

    .line 650
    .line 651
    .line 652
    move-result v9

    .line 653
    if-eqz v9, :cond_16

    .line 654
    .line 655
    invoke-virtual {v2}, La/v680;->a()Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    move-result-object v9

    .line 659
    check-cast v9, Ljava/lang/Double;

    .line 660
    .line 661
    invoke-virtual {v9}, Ljava/lang/Double;->doubleValue()D

    .line 662
    .line 663
    .line 664
    move-result-wide v9

    .line 665
    invoke-static {v9, v10}, La/hsd;->o(D)Z

    .line 666
    .line 667
    .line 668
    move-result v9

    .line 669
    if-eqz v9, :cond_16

    .line 670
    .line 671
    iget-object v0, v0, La/hsd;->c:La/rgk;

    .line 672
    .line 673
    const-string v8, "com.google.firebase.perf.TraceSamplingRate"

    .line 674
    .line 675
    invoke-virtual {v2}, La/v680;->a()Ljava/lang/Object;

    .line 676
    .line 677
    .line 678
    move-result-object v9

    .line 679
    check-cast v9, Ljava/lang/Double;

    .line 680
    .line 681
    invoke-virtual {v9}, Ljava/lang/Double;->doubleValue()D

    .line 682
    .line 683
    .line 684
    move-result-wide v9

    .line 685
    invoke-virtual {v0, v8, v9, v10}, La/rgk;->e(Ljava/lang/String;D)V

    .line 686
    .line 687
    .line 688
    invoke-virtual {v2}, La/v680;->a()Ljava/lang/Object;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    check-cast v0, Ljava/lang/Double;

    .line 693
    .line 694
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 695
    .line 696
    .line 697
    move-result-wide v8

    .line 698
    goto :goto_b

    .line 699
    :cond_16
    invoke-virtual {v0, v8}, La/hsd;->b(La/obb;)La/v680;

    .line 700
    .line 701
    .line 702
    move-result-object v2

    .line 703
    invoke-virtual {v2}, La/v680;->b()Z

    .line 704
    .line 705
    .line 706
    move-result v8

    .line 707
    if-eqz v8, :cond_17

    .line 708
    .line 709
    invoke-virtual {v2}, La/v680;->a()Ljava/lang/Object;

    .line 710
    .line 711
    .line 712
    move-result-object v8

    .line 713
    check-cast v8, Ljava/lang/Double;

    .line 714
    .line 715
    invoke-virtual {v8}, Ljava/lang/Double;->doubleValue()D

    .line 716
    .line 717
    .line 718
    move-result-wide v8

    .line 719
    invoke-static {v8, v9}, La/hsd;->o(D)Z

    .line 720
    .line 721
    .line 722
    move-result v8

    .line 723
    if-eqz v8, :cond_17

    .line 724
    .line 725
    invoke-virtual {v2}, La/v680;->a()Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    move-result-object v0

    .line 729
    check-cast v0, Ljava/lang/Double;

    .line 730
    .line 731
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 732
    .line 733
    .line 734
    move-result-wide v8

    .line 735
    goto :goto_b

    .line 736
    :cond_17
    iget-object v0, v0, La/hsd;->a:Lcom/google/firebase/perf/config/RemoteConfigManager;

    .line 737
    .line 738
    invoke-virtual {v0}, Lcom/google/firebase/perf/config/RemoteConfigManager;->isLastFetchFailed()Z

    .line 739
    .line 740
    .line 741
    move-result v0

    .line 742
    if-eqz v0, :cond_18

    .line 743
    .line 744
    move-wide v8, v6

    .line 745
    goto :goto_b

    .line 746
    :cond_18
    move-wide v8, v4

    .line 747
    :goto_b
    iget-wide v10, p2, La/y2e0;->b:D

    .line 748
    .line 749
    cmpg-double v0, v10, v8

    .line 750
    .line 751
    if-gez v0, :cond_19

    .line 752
    .line 753
    goto :goto_d

    .line 754
    :cond_19
    invoke-virtual {p1}, La/nd90;->e()La/ibs0;

    .line 755
    .line 756
    .line 757
    move-result-object v0

    .line 758
    invoke-virtual {v0}, La/ibs0;->C()La/amx;

    .line 759
    .line 760
    .line 761
    move-result-object v0

    .line 762
    invoke-static {v0}, La/y2e0;->a(La/amx;)Z

    .line 763
    .line 764
    .line 765
    move-result v0

    .line 766
    if-nez v0, :cond_1a

    .line 767
    .line 768
    goto/16 :goto_14

    .line 769
    .line 770
    :goto_c
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 771
    throw p0

    .line 772
    :cond_1a
    :goto_d
    invoke-virtual {p1}, La/nd90;->d()Z

    .line 773
    .line 774
    .line 775
    move-result v0

    .line 776
    if-eqz v0, :cond_20

    .line 777
    .line 778
    invoke-virtual {p1}, La/nd90;->e()La/ibs0;

    .line 779
    .line 780
    .line 781
    move-result-object v0

    .line 782
    invoke-virtual {v0}, La/ibs0;->B()Ljava/lang/String;

    .line 783
    .line 784
    .line 785
    move-result-object v0

    .line 786
    const-string v2, "_st_"

    .line 787
    .line 788
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 789
    .line 790
    .line 791
    move-result v0

    .line 792
    if-eqz v0, :cond_20

    .line 793
    .line 794
    invoke-virtual {p1}, La/nd90;->e()La/ibs0;

    .line 795
    .line 796
    .line 797
    move-result-object v0

    .line 798
    invoke-virtual {v0}, La/ibs0;->v()Z

    .line 799
    .line 800
    .line 801
    move-result v0

    .line 802
    if-eqz v0, :cond_20

    .line 803
    .line 804
    iget-object v0, p2, La/y2e0;->a:La/hsd;

    .line 805
    .line 806
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 807
    .line 808
    .line 809
    const-class v2, La/atd;

    .line 810
    .line 811
    monitor-enter v2

    .line 812
    :try_start_3
    sget-object v8, La/atd;->a:La/atd;

    .line 813
    .line 814
    if-nez v8, :cond_1b

    .line 815
    .line 816
    new-instance v8, La/atd;

    .line 817
    .line 818
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 819
    .line 820
    .line 821
    sput-object v8, La/atd;->a:La/atd;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 822
    .line 823
    goto :goto_e

    .line 824
    :catchall_1
    move-exception p0

    .line 825
    goto/16 :goto_10

    .line 826
    .line 827
    :cond_1b
    :goto_e
    monitor-exit v2

    .line 828
    invoke-virtual {v0, v8}, La/hsd;->h(La/obb;)La/v680;

    .line 829
    .line 830
    .line 831
    move-result-object v2

    .line 832
    invoke-virtual {v2}, La/v680;->b()Z

    .line 833
    .line 834
    .line 835
    move-result v9

    .line 836
    if-eqz v9, :cond_1c

    .line 837
    .line 838
    invoke-virtual {v2}, La/v680;->a()Ljava/lang/Object;

    .line 839
    .line 840
    .line 841
    move-result-object v2

    .line 842
    check-cast v2, Ljava/lang/Double;

    .line 843
    .line 844
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 845
    .line 846
    .line 847
    move-result-wide v9

    .line 848
    const-wide/high16 v11, 0x4059000000000000L    # 100.0

    .line 849
    .line 850
    div-double/2addr v9, v11

    .line 851
    invoke-static {v9, v10}, La/hsd;->o(D)Z

    .line 852
    .line 853
    .line 854
    move-result v2

    .line 855
    if-eqz v2, :cond_1c

    .line 856
    .line 857
    goto :goto_f

    .line 858
    :cond_1c
    iget-object v2, v0, La/hsd;->a:Lcom/google/firebase/perf/config/RemoteConfigManager;

    .line 859
    .line 860
    const-string v9, "fpr_vc_fragment_sampling_rate"

    .line 861
    .line 862
    invoke-virtual {v2, v9}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getDouble(Ljava/lang/String;)La/v680;

    .line 863
    .line 864
    .line 865
    move-result-object v2

    .line 866
    invoke-virtual {v2}, La/v680;->b()Z

    .line 867
    .line 868
    .line 869
    move-result v9

    .line 870
    if-eqz v9, :cond_1d

    .line 871
    .line 872
    invoke-virtual {v2}, La/v680;->a()Ljava/lang/Object;

    .line 873
    .line 874
    .line 875
    move-result-object v9

    .line 876
    check-cast v9, Ljava/lang/Double;

    .line 877
    .line 878
    invoke-virtual {v9}, Ljava/lang/Double;->doubleValue()D

    .line 879
    .line 880
    .line 881
    move-result-wide v9

    .line 882
    invoke-static {v9, v10}, La/hsd;->o(D)Z

    .line 883
    .line 884
    .line 885
    move-result v9

    .line 886
    if-eqz v9, :cond_1d

    .line 887
    .line 888
    iget-object v0, v0, La/hsd;->c:La/rgk;

    .line 889
    .line 890
    const-string v8, "com.google.firebase.perf.FragmentSamplingRate"

    .line 891
    .line 892
    invoke-virtual {v2}, La/v680;->a()Ljava/lang/Object;

    .line 893
    .line 894
    .line 895
    move-result-object v9

    .line 896
    check-cast v9, Ljava/lang/Double;

    .line 897
    .line 898
    invoke-virtual {v9}, Ljava/lang/Double;->doubleValue()D

    .line 899
    .line 900
    .line 901
    move-result-wide v9

    .line 902
    invoke-virtual {v0, v8, v9, v10}, La/rgk;->e(Ljava/lang/String;D)V

    .line 903
    .line 904
    .line 905
    invoke-virtual {v2}, La/v680;->a()Ljava/lang/Object;

    .line 906
    .line 907
    .line 908
    move-result-object v0

    .line 909
    check-cast v0, Ljava/lang/Double;

    .line 910
    .line 911
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 912
    .line 913
    .line 914
    move-result-wide v9

    .line 915
    goto :goto_f

    .line 916
    :cond_1d
    invoke-virtual {v0, v8}, La/hsd;->b(La/obb;)La/v680;

    .line 917
    .line 918
    .line 919
    move-result-object v0

    .line 920
    invoke-virtual {v0}, La/v680;->b()Z

    .line 921
    .line 922
    .line 923
    move-result v2

    .line 924
    if-eqz v2, :cond_1e

    .line 925
    .line 926
    invoke-virtual {v0}, La/v680;->a()Ljava/lang/Object;

    .line 927
    .line 928
    .line 929
    move-result-object v2

    .line 930
    check-cast v2, Ljava/lang/Double;

    .line 931
    .line 932
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 933
    .line 934
    .line 935
    move-result-wide v8

    .line 936
    invoke-static {v8, v9}, La/hsd;->o(D)Z

    .line 937
    .line 938
    .line 939
    move-result v2

    .line 940
    if-eqz v2, :cond_1e

    .line 941
    .line 942
    invoke-virtual {v0}, La/v680;->a()Ljava/lang/Object;

    .line 943
    .line 944
    .line 945
    move-result-object v0

    .line 946
    check-cast v0, Ljava/lang/Double;

    .line 947
    .line 948
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 949
    .line 950
    .line 951
    move-result-wide v9

    .line 952
    goto :goto_f

    .line 953
    :cond_1e
    const-wide/16 v9, 0x0

    .line 954
    .line 955
    :goto_f
    iget-wide v11, p2, La/y2e0;->c:D

    .line 956
    .line 957
    cmpg-double v0, v11, v9

    .line 958
    .line 959
    if-gez v0, :cond_1f

    .line 960
    .line 961
    goto :goto_11

    .line 962
    :cond_1f
    invoke-virtual {p1}, La/nd90;->e()La/ibs0;

    .line 963
    .line 964
    .line 965
    move-result-object v0

    .line 966
    invoke-virtual {v0}, La/ibs0;->C()La/amx;

    .line 967
    .line 968
    .line 969
    move-result-object v0

    .line 970
    invoke-static {v0}, La/y2e0;->a(La/amx;)Z

    .line 971
    .line 972
    .line 973
    move-result v0

    .line 974
    if-nez v0, :cond_20

    .line 975
    .line 976
    goto/16 :goto_14

    .line 977
    .line 978
    :goto_10
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 979
    throw p0

    .line 980
    :cond_20
    :goto_11
    invoke-virtual {p1}, La/nd90;->b()Z

    .line 981
    .line 982
    .line 983
    move-result v0

    .line 984
    if-eqz v0, :cond_26

    .line 985
    .line 986
    iget-object v0, p2, La/y2e0;->a:La/hsd;

    .line 987
    .line 988
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 989
    .line 990
    .line 991
    const-class v2, La/ftd;

    .line 992
    .line 993
    monitor-enter v2

    .line 994
    :try_start_5
    sget-object v8, La/ftd;->a:La/ftd;

    .line 995
    .line 996
    if-nez v8, :cond_21

    .line 997
    .line 998
    new-instance v8, La/ftd;

    .line 999
    .line 1000
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 1001
    .line 1002
    .line 1003
    sput-object v8, La/ftd;->a:La/ftd;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 1004
    .line 1005
    goto :goto_12

    .line 1006
    :catchall_2
    move-exception p0

    .line 1007
    goto/16 :goto_15

    .line 1008
    .line 1009
    :cond_21
    :goto_12
    monitor-exit v2

    .line 1010
    iget-object v2, v0, La/hsd;->a:Lcom/google/firebase/perf/config/RemoteConfigManager;

    .line 1011
    .line 1012
    const-string v9, "fpr_vc_network_request_sampling_rate"

    .line 1013
    .line 1014
    invoke-virtual {v2, v9}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getDouble(Ljava/lang/String;)La/v680;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v2

    .line 1018
    invoke-virtual {v2}, La/v680;->b()Z

    .line 1019
    .line 1020
    .line 1021
    move-result v9

    .line 1022
    if-eqz v9, :cond_22

    .line 1023
    .line 1024
    invoke-virtual {v2}, La/v680;->a()Ljava/lang/Object;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v9

    .line 1028
    check-cast v9, Ljava/lang/Double;

    .line 1029
    .line 1030
    invoke-virtual {v9}, Ljava/lang/Double;->doubleValue()D

    .line 1031
    .line 1032
    .line 1033
    move-result-wide v9

    .line 1034
    invoke-static {v9, v10}, La/hsd;->o(D)Z

    .line 1035
    .line 1036
    .line 1037
    move-result v9

    .line 1038
    if-eqz v9, :cond_22

    .line 1039
    .line 1040
    iget-object v0, v0, La/hsd;->c:La/rgk;

    .line 1041
    .line 1042
    const-string v4, "com.google.firebase.perf.NetworkRequestSamplingRate"

    .line 1043
    .line 1044
    invoke-virtual {v2}, La/v680;->a()Ljava/lang/Object;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v5

    .line 1048
    check-cast v5, Ljava/lang/Double;

    .line 1049
    .line 1050
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    .line 1051
    .line 1052
    .line 1053
    move-result-wide v5

    .line 1054
    invoke-virtual {v0, v4, v5, v6}, La/rgk;->e(Ljava/lang/String;D)V

    .line 1055
    .line 1056
    .line 1057
    invoke-virtual {v2}, La/v680;->a()Ljava/lang/Object;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v0

    .line 1061
    check-cast v0, Ljava/lang/Double;

    .line 1062
    .line 1063
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 1064
    .line 1065
    .line 1066
    move-result-wide v4

    .line 1067
    goto :goto_13

    .line 1068
    :cond_22
    invoke-virtual {v0, v8}, La/hsd;->b(La/obb;)La/v680;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v2

    .line 1072
    invoke-virtual {v2}, La/v680;->b()Z

    .line 1073
    .line 1074
    .line 1075
    move-result v8

    .line 1076
    if-eqz v8, :cond_23

    .line 1077
    .line 1078
    invoke-virtual {v2}, La/v680;->a()Ljava/lang/Object;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v8

    .line 1082
    check-cast v8, Ljava/lang/Double;

    .line 1083
    .line 1084
    invoke-virtual {v8}, Ljava/lang/Double;->doubleValue()D

    .line 1085
    .line 1086
    .line 1087
    move-result-wide v8

    .line 1088
    invoke-static {v8, v9}, La/hsd;->o(D)Z

    .line 1089
    .line 1090
    .line 1091
    move-result v8

    .line 1092
    if-eqz v8, :cond_23

    .line 1093
    .line 1094
    invoke-virtual {v2}, La/v680;->a()Ljava/lang/Object;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v0

    .line 1098
    check-cast v0, Ljava/lang/Double;

    .line 1099
    .line 1100
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 1101
    .line 1102
    .line 1103
    move-result-wide v4

    .line 1104
    goto :goto_13

    .line 1105
    :cond_23
    iget-object v0, v0, La/hsd;->a:Lcom/google/firebase/perf/config/RemoteConfigManager;

    .line 1106
    .line 1107
    invoke-virtual {v0}, Lcom/google/firebase/perf/config/RemoteConfigManager;->isLastFetchFailed()Z

    .line 1108
    .line 1109
    .line 1110
    move-result v0

    .line 1111
    if-eqz v0, :cond_24

    .line 1112
    .line 1113
    move-wide v4, v6

    .line 1114
    :cond_24
    :goto_13
    iget-wide v6, p2, La/y2e0;->b:D

    .line 1115
    .line 1116
    cmpg-double p2, v6, v4

    .line 1117
    .line 1118
    if-gez p2, :cond_25

    .line 1119
    .line 1120
    goto :goto_16

    .line 1121
    :cond_25
    invoke-virtual {p1}, La/nd90;->c()La/ll50;

    .line 1122
    .line 1123
    .line 1124
    move-result-object p2

    .line 1125
    invoke-virtual {p2}, La/ll50;->x()La/amx;

    .line 1126
    .line 1127
    .line 1128
    move-result-object p2

    .line 1129
    invoke-static {p2}, La/y2e0;->a(La/amx;)Z

    .line 1130
    .line 1131
    .line 1132
    move-result p2

    .line 1133
    if-nez p2, :cond_26

    .line 1134
    .line 1135
    :goto_14
    invoke-virtual {p0, p1}, La/dps0;->b(La/nd90;)V

    .line 1136
    .line 1137
    .line 1138
    sget-object p0, La/dps0;->r:La/f03;

    .line 1139
    .line 1140
    const-string p2, "Event dropped due to device sampling - %s"

    .line 1141
    .line 1142
    invoke-static {p1}, La/dps0;->a(La/od90;)Ljava/lang/String;

    .line 1143
    .line 1144
    .line 1145
    move-result-object p1

    .line 1146
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 1147
    .line 1148
    .line 1149
    move-result-object p1

    .line 1150
    invoke-virtual {p0, p2, p1}, La/f03;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1151
    .line 1152
    .line 1153
    goto/16 :goto_1e

    .line 1154
    .line 1155
    :goto_15
    :try_start_6
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 1156
    throw p0

    .line 1157
    :cond_26
    :goto_16
    iget-object p2, p0, La/dps0;->l:La/y2e0;

    .line 1158
    .line 1159
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1160
    .line 1161
    .line 1162
    invoke-virtual {p1}, La/nd90;->d()Z

    .line 1163
    .line 1164
    .line 1165
    move-result v0

    .line 1166
    if-eqz v0, :cond_28

    .line 1167
    .line 1168
    invoke-virtual {p1}, La/nd90;->e()La/ibs0;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v0

    .line 1172
    invoke-virtual {v0}, La/ibs0;->B()Ljava/lang/String;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v0

    .line 1176
    const-string v2, "_fs"

    .line 1177
    .line 1178
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1179
    .line 1180
    .line 1181
    move-result v0

    .line 1182
    if-nez v0, :cond_27

    .line 1183
    .line 1184
    invoke-virtual {p1}, La/nd90;->e()La/ibs0;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v0

    .line 1188
    invoke-virtual {v0}, La/ibs0;->B()Ljava/lang/String;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v0

    .line 1192
    const-string v2, "_bs"

    .line 1193
    .line 1194
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1195
    .line 1196
    .line 1197
    move-result v0

    .line 1198
    if-eqz v0, :cond_28

    .line 1199
    .line 1200
    :cond_27
    invoke-virtual {p1}, La/nd90;->e()La/ibs0;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v0

    .line 1204
    invoke-virtual {v0}, La/ibs0;->w()I

    .line 1205
    .line 1206
    .line 1207
    move-result v0

    .line 1208
    if-lez v0, :cond_28

    .line 1209
    .line 1210
    goto :goto_17

    .line 1211
    :cond_28
    invoke-virtual {p1}, La/nd90;->a()Z

    .line 1212
    .line 1213
    .line 1214
    move-result v0

    .line 1215
    if-eqz v0, :cond_29

    .line 1216
    .line 1217
    :goto_17
    const/4 v1, 0x0

    .line 1218
    goto :goto_19

    .line 1219
    :cond_29
    invoke-virtual {p1}, La/nd90;->b()Z

    .line 1220
    .line 1221
    .line 1222
    move-result v0

    .line 1223
    if-eqz v0, :cond_2a

    .line 1224
    .line 1225
    iget-object p2, p2, La/y2e0;->e:La/x2e0;

    .line 1226
    .line 1227
    invoke-virtual {p2}, La/x2e0;->b()Z

    .line 1228
    .line 1229
    .line 1230
    move-result p2

    .line 1231
    :goto_18
    xor-int/2addr v1, p2

    .line 1232
    goto :goto_19

    .line 1233
    :cond_2a
    invoke-virtual {p1}, La/nd90;->d()Z

    .line 1234
    .line 1235
    .line 1236
    move-result v0

    .line 1237
    if-eqz v0, :cond_2b

    .line 1238
    .line 1239
    iget-object p2, p2, La/y2e0;->d:La/x2e0;

    .line 1240
    .line 1241
    invoke-virtual {p2}, La/x2e0;->b()Z

    .line 1242
    .line 1243
    .line 1244
    move-result p2

    .line 1245
    goto :goto_18

    .line 1246
    :cond_2b
    :goto_19
    if-eqz v1, :cond_2c

    .line 1247
    .line 1248
    invoke-virtual {p0, p1}, La/dps0;->b(La/nd90;)V

    .line 1249
    .line 1250
    .line 1251
    sget-object p0, La/dps0;->r:La/f03;

    .line 1252
    .line 1253
    const-string p2, "Rate limited (per device) - %s"

    .line 1254
    .line 1255
    invoke-static {p1}, La/dps0;->a(La/od90;)Ljava/lang/String;

    .line 1256
    .line 1257
    .line 1258
    move-result-object p1

    .line 1259
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 1260
    .line 1261
    .line 1262
    move-result-object p1

    .line 1263
    invoke-virtual {p0, p2, p1}, La/f03;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1264
    .line 1265
    .line 1266
    goto/16 :goto_1e

    .line 1267
    .line 1268
    :cond_2c
    sget-object p2, La/dps0;->r:La/f03;

    .line 1269
    .line 1270
    invoke-virtual {p1}, La/nd90;->d()Z

    .line 1271
    .line 1272
    .line 1273
    move-result v0

    .line 1274
    if-eqz v0, :cond_2e

    .line 1275
    .line 1276
    const-string v0, "Logging %s. In a minute, visit the Firebase console to view your data: %s"

    .line 1277
    .line 1278
    invoke-static {p1}, La/dps0;->a(La/od90;)Ljava/lang/String;

    .line 1279
    .line 1280
    .line 1281
    move-result-object v1

    .line 1282
    invoke-virtual {p1}, La/nd90;->e()La/ibs0;

    .line 1283
    .line 1284
    .line 1285
    move-result-object v2

    .line 1286
    const-string v4, "?utm_source=perf-android-sdk&utm_medium=android-ide"

    .line 1287
    .line 1288
    invoke-virtual {v2}, La/ibs0;->B()Ljava/lang/String;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v2

    .line 1292
    const-string v5, "_st_"

    .line 1293
    .line 1294
    invoke-virtual {v2, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1295
    .line 1296
    .line 1297
    move-result v5

    .line 1298
    iget-object v6, p0, La/dps0;->p:Ljava/lang/String;

    .line 1299
    .line 1300
    iget-object v7, p0, La/dps0;->o:Ljava/lang/String;

    .line 1301
    .line 1302
    if-eqz v5, :cond_2d

    .line 1303
    .line 1304
    invoke-static {v6, v7}, La/ieb;->S(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v5

    .line 1308
    const-string v6, "/troubleshooting/trace/SCREEN_TRACE/"

    .line 1309
    .line 1310
    invoke-static {v5, v6, v2, v4}, La/ua80;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v2

    .line 1314
    goto :goto_1a

    .line 1315
    :cond_2d
    invoke-static {v6, v7}, La/ieb;->S(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v5

    .line 1319
    const-string v6, "/troubleshooting/trace/DURATION_TRACE/"

    .line 1320
    .line 1321
    invoke-static {v5, v6, v2, v4}, La/ua80;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v2

    .line 1325
    :goto_1a
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v1

    .line 1329
    invoke-virtual {p2, v0, v1}, La/f03;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1330
    .line 1331
    .line 1332
    goto :goto_1b

    .line 1333
    :cond_2e
    const-string v0, "Logging %s"

    .line 1334
    .line 1335
    invoke-static {p1}, La/dps0;->a(La/od90;)Ljava/lang/String;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v1

    .line 1339
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v1

    .line 1343
    invoke-virtual {p2, v0, v1}, La/f03;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1344
    .line 1345
    .line 1346
    :goto_1b
    iget-object p0, p0, La/dps0;->h:La/pkq;

    .line 1347
    .line 1348
    sget-object p2, La/pkq;->d:La/f03;

    .line 1349
    .line 1350
    iget-object v0, p0, La/pkq;->c:La/vkr0;

    .line 1351
    .line 1352
    if-nez v0, :cond_30

    .line 1353
    .line 1354
    iget-object v0, p0, La/pkq;->b:La/p5d0;

    .line 1355
    .line 1356
    invoke-interface {v0}, La/p5d0;->get()Ljava/lang/Object;

    .line 1357
    .line 1358
    .line 1359
    move-result-object v0

    .line 1360
    check-cast v0, La/mos0;

    .line 1361
    .line 1362
    if-eqz v0, :cond_2f

    .line 1363
    .line 1364
    iget-object v1, p0, La/pkq;->a:Ljava/lang/String;

    .line 1365
    .line 1366
    const-string v2, "proto"

    .line 1367
    .line 1368
    new-instance v4, La/gwn;

    .line 1369
    .line 1370
    invoke-direct {v4, v2}, La/gwn;-><init>(Ljava/lang/String;)V

    .line 1371
    .line 1372
    .line 1373
    new-instance v2, La/ohq;

    .line 1374
    .line 1375
    const/4 v5, 0x2

    .line 1376
    invoke-direct {v2, v5}, La/ohq;-><init>(B)V

    .line 1377
    .line 1378
    .line 1379
    check-cast v0, La/nos0;

    .line 1380
    .line 1381
    invoke-virtual {v0, v1, v4, v2}, La/nos0;->a(Ljava/lang/String;La/gwn;La/ols0;)La/vkr0;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v0

    .line 1385
    iput-object v0, p0, La/pkq;->c:La/vkr0;

    .line 1386
    .line 1387
    goto :goto_1c

    .line 1388
    :cond_2f
    const-string v0, "Flg TransportFactory is not available at the moment"

    .line 1389
    .line 1390
    invoke-virtual {p2, v0}, La/f03;->f(Ljava/lang/String;)V

    .line 1391
    .line 1392
    .line 1393
    :cond_30
    :goto_1c
    iget-object p0, p0, La/pkq;->c:La/vkr0;

    .line 1394
    .line 1395
    if-eqz p0, :cond_31

    .line 1396
    .line 1397
    new-instance p2, La/p35;

    .line 1398
    .line 1399
    sget-object v0, La/mwb0;->a:La/mwb0;

    .line 1400
    .line 1401
    invoke-direct {p2, p1, v0, v3}, La/p35;-><init>(Ljava/lang/Object;La/mwb0;La/t45;)V

    .line 1402
    .line 1403
    .line 1404
    new-instance p1, La/v4i0;

    .line 1405
    .line 1406
    const/16 v0, 0x15

    .line 1407
    .line 1408
    invoke-direct {p1, v0}, La/v4i0;-><init>(B)V

    .line 1409
    .line 1410
    .line 1411
    invoke-virtual {p0, p2, p1}, La/vkr0;->z(La/p35;La/fps0;)V

    .line 1412
    .line 1413
    .line 1414
    goto :goto_1d

    .line 1415
    :cond_31
    const-string p0, "Unable to dispatch event because Flg Transport is not available"

    .line 1416
    .line 1417
    invoke-virtual {p2, p0}, La/f03;->f(Ljava/lang/String;)V

    .line 1418
    .line 1419
    .line 1420
    :goto_1d
    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    .line 1421
    .line 1422
    .line 1423
    move-result-object p0

    .line 1424
    invoke-virtual {p0}, Lcom/google/firebase/perf/session/SessionManager;->stopGaugeCollectionIfSessionRunningTooLong()V

    .line 1425
    .line 1426
    .line 1427
    :goto_1e
    return-void
.end method

.method public final onUpdateAppState(La/ts3;)V
    .locals 2

    .line 1
    sget-object v0, La/ts3;->c:La/ts3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move p1, v1

    .line 9
    :goto_0
    iput-boolean p1, p0, La/dps0;->q:Z

    .line 10
    .line 11
    iget-object p1, p0, La/dps0;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    new-instance p1, La/bps0;

    .line 20
    .line 21
    invoke-direct {p1, p0, v1}, La/bps0;-><init>(La/dps0;B)V

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, La/dps0;->i:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method
