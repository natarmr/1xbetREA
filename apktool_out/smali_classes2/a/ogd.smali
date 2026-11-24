.class public final synthetic La/ogd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p5d0;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/ogd;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte p0, p0, La/ogd;->a:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :pswitch_0
    return-object v1

    .line 9
    :pswitch_1
    invoke-static {}, Lcom/google/firebase/perf/session/gauges/GaugeManager;->b()La/ps30;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :pswitch_2
    invoke-static {}, Lcom/google/firebase/perf/session/gauges/GaugeManager;->c()La/u7f;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :pswitch_3
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :pswitch_4
    return-object v1

    .line 25
    :pswitch_5
    sget-object p0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->a:La/b8z;

    .line 26
    .line 27
    new-instance p0, La/eyf;

    .line 28
    .line 29
    const-string v2, "Firebase Scheduler"

    .line 30
    .line 31
    invoke-direct {p0, v2, v0, v1}, La/eyf;-><init>(Ljava/lang/String;ILandroid/os/StrictMode$ThreadPolicy;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :pswitch_6
    sget-object p0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->a:La/b8z;

    .line 40
    .line 41
    new-instance p0, La/eyf;

    .line 42
    .line 43
    const-string v0, "Firebase Blocking"

    .line 44
    .line 45
    const/16 v2, 0xb

    .line 46
    .line 47
    invoke-direct {p0, v0, v2, v1}, La/eyf;-><init>(Ljava/lang/String;ILandroid/os/StrictMode$ThreadPolicy;)V

    .line 48
    .line 49
    .line 50
    invoke-static {p0}, Ljava/util/concurrent/Executors;->newCachedThreadPool(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    new-instance v0, La/m3k;

    .line 55
    .line 56
    sget-object v1, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->d:La/b8z;

    .line 57
    .line 58
    invoke-virtual {v1}, La/b8z;->get()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, Ljava/util/concurrent/ScheduledExecutorService;

    .line 63
    .line 64
    invoke-direct {v0, p0, v1}, La/m3k;-><init>(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 65
    .line 66
    .line 67
    return-object v0

    .line 68
    :pswitch_7
    sget-object p0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->a:La/b8z;

    .line 69
    .line 70
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p0}, Ljava/lang/Runtime;->availableProcessors()I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    const/4 v1, 0x2

    .line 79
    invoke-static {v1, p0}, Ljava/lang/Math;->max(II)I

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    new-instance v1, Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 84
    .line 85
    invoke-direct {v1}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1}, Landroid/os/StrictMode$ThreadPolicy$Builder;->detectAll()Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v1}, Landroid/os/StrictMode$ThreadPolicy$Builder;->penaltyLog()Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v1}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    new-instance v2, La/eyf;

    .line 101
    .line 102
    const-string v3, "Firebase Lite"

    .line 103
    .line 104
    invoke-direct {v2, v3, v0, v1}, La/eyf;-><init>(Ljava/lang/String;ILandroid/os/StrictMode$ThreadPolicy;)V

    .line 105
    .line 106
    .line 107
    invoke-static {p0, v2}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    new-instance v0, La/m3k;

    .line 112
    .line 113
    sget-object v1, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->d:La/b8z;

    .line 114
    .line 115
    invoke-virtual {v1}, La/b8z;->get()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    check-cast v1, Ljava/util/concurrent/ScheduledExecutorService;

    .line 120
    .line 121
    invoke-direct {v0, p0, v1}, La/m3k;-><init>(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 122
    .line 123
    .line 124
    return-object v0

    .line 125
    :pswitch_8
    sget-object p0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->a:La/b8z;

    .line 126
    .line 127
    new-instance p0, Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 128
    .line 129
    invoke-direct {p0}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->detectNetwork()Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-virtual {p0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->detectResourceMismatches()Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 137
    .line 138
    .line 139
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 140
    .line 141
    const/16 v1, 0x1a

    .line 142
    .line 143
    if-lt v0, v1, :cond_0

    .line 144
    .line 145
    invoke-static {p0}, La/c0g;->w(Landroid/os/StrictMode$ThreadPolicy$Builder;)V

    .line 146
    .line 147
    .line 148
    :cond_0
    invoke-virtual {p0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->penaltyLog()Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    invoke-virtual {p0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    new-instance v0, La/eyf;

    .line 157
    .line 158
    const-string v1, "Firebase Background"

    .line 159
    .line 160
    const/16 v2, 0xa

    .line 161
    .line 162
    invoke-direct {v0, v1, v2, p0}, La/eyf;-><init>(Ljava/lang/String;ILandroid/os/StrictMode$ThreadPolicy;)V

    .line 163
    .line 164
    .line 165
    const/4 p0, 0x4

    .line 166
    invoke-static {p0, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    new-instance v0, La/m3k;

    .line 171
    .line 172
    sget-object v1, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->d:La/b8z;

    .line 173
    .line 174
    invoke-virtual {v1}, La/b8z;->get()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    check-cast v1, Ljava/util/concurrent/ScheduledExecutorService;

    .line 179
    .line 180
    invoke-direct {v0, p0, v1}, La/m3k;-><init>(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 181
    .line 182
    .line 183
    return-object v0

    .line 184
    :pswitch_9
    sget-object p0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 185
    .line 186
    return-object p0

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
