.class public final La/qff0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/bhq;


# static fields
.field public static final j:Ljava/util/Random;

.field public static final k:Ljava/util/HashMap;


# instance fields
.field public final a:Ljava/util/HashMap;

.field public final b:Landroid/content/Context;

.field public final c:Ljava/util/concurrent/ScheduledExecutorService;

.field public final d:La/nfq;

.field public final e:La/dgq;

.field public final f:La/gfq;

.field public final g:La/p5d0;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/Random;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/qff0;->j:Ljava/util/Random;

    .line 7
    .line 8
    new-instance v0, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, La/qff0;->k:Ljava/util/HashMap;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;La/nfq;La/dgq;La/gfq;La/p5d0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/qff0;->a:Ljava/util/HashMap;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, La/qff0;->i:Ljava/util/HashMap;

    .line 17
    .line 18
    iput-object p1, p0, La/qff0;->b:Landroid/content/Context;

    .line 19
    .line 20
    iput-object p2, p0, La/qff0;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 21
    .line 22
    iput-object p3, p0, La/qff0;->d:La/nfq;

    .line 23
    .line 24
    iput-object p4, p0, La/qff0;->e:La/dgq;

    .line 25
    .line 26
    iput-object p5, p0, La/qff0;->f:La/gfq;

    .line 27
    .line 28
    iput-object p6, p0, La/qff0;->g:La/p5d0;

    .line 29
    .line 30
    invoke-virtual {p3}, La/nfq;->a()V

    .line 31
    .line 32
    .line 33
    iget-object p3, p3, La/nfq;->c:La/mgq;

    .line 34
    .line 35
    iget-object p3, p3, La/mgq;->b:Ljava/lang/String;

    .line 36
    .line 37
    iput-object p3, p0, La/qff0;->h:Ljava/lang/String;

    .line 38
    .line 39
    sget-object p3, La/pff0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Landroid/app/Application;

    .line 46
    .line 47
    sget-object p3, La/pff0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 48
    .line 49
    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p4

    .line 53
    if-nez p4, :cond_2

    .line 54
    .line 55
    new-instance p4, La/pff0;

    .line 56
    .line 57
    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    .line 58
    .line 59
    .line 60
    :cond_0
    const/4 p5, 0x0

    .line 61
    invoke-virtual {p3, p5, p4}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p5

    .line 65
    if-eqz p5, :cond_1

    .line 66
    .line 67
    invoke-static {p1}, La/fc5;->b(Landroid/app/Application;)V

    .line 68
    .line 69
    .line 70
    sget-object p1, La/fc5;->e:La/fc5;

    .line 71
    .line 72
    invoke-virtual {p1, p4}, La/fc5;->a(La/ec5;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p5

    .line 80
    if-eqz p5, :cond_0

    .line 81
    .line 82
    :cond_2
    :goto_0
    new-instance p1, La/hrd;

    .line 83
    .line 84
    const/4 p3, 0x5

    .line 85
    invoke-direct {p1, p0, p3}, La/hrd;-><init>(Ljava/lang/Object;B)V

    .line 86
    .line 87
    .line 88
    invoke-static {p2, p1}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    .line 89
    .line 90
    .line 91
    return-void
.end method


# virtual methods
.method public final declared-synchronized a(La/nfq;Ljava/lang/String;La/dgq;La/gfq;Ljava/util/concurrent/Executor;La/krd;La/krd;La/krd;La/rrd;La/srd;La/msd;La/n660;)La/xgq;
    .locals 13

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, La/qff0;->a:Ljava/util/HashMap;

    .line 3
    .line 4
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    new-instance v10, La/xgq;

    .line 11
    .line 12
    const-string v0, "firebase"

    .line 13
    .line 14
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, La/nfq;->a()V

    .line 21
    .line 22
    .line 23
    iget-object v0, p1, La/nfq;->b:Ljava/lang/String;

    .line 24
    .line 25
    const-string v1, "[DEFAULT]"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    move-object/from16 v11, p4

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v0, 0x0

    .line 37
    move-object v11, v0

    .line 38
    :goto_0
    iget-object v5, p0, La/qff0;->b:Landroid/content/Context;

    .line 39
    .line 40
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    move-object v12, v10

    .line 42
    :try_start_1
    new-instance v10, La/phf0;

    .line 43
    .line 44
    iget-object v9, p0, La/qff0;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 45
    .line 46
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    new-instance v7, Ljava/util/LinkedHashSet;

    .line 50
    .line 51
    invoke-direct {v7}, Ljava/util/LinkedHashSet;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object v7, v10, La/phf0;->a:Ljava/lang/Object;

    .line 55
    .line 56
    new-instance v0, La/esd;

    .line 57
    .line 58
    move-object v1, p1

    .line 59
    move-object v6, p2

    .line 60
    move-object/from16 v2, p3

    .line 61
    .line 62
    move-object/from16 v4, p7

    .line 63
    .line 64
    move-object/from16 v3, p9

    .line 65
    .line 66
    move-object/from16 v8, p11

    .line 67
    .line 68
    invoke-direct/range {v0 .. v9}, La/esd;-><init>(La/nfq;La/dgq;La/rrd;La/krd;Landroid/content/Context;Ljava/lang/String;Ljava/util/LinkedHashSet;La/msd;Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 69
    .line 70
    .line 71
    iput-object v0, v10, La/phf0;->b:Ljava/lang/Object;

    .line 72
    .line 73
    iput-object v9, v10, La/phf0;->c:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 74
    .line 75
    :try_start_2
    monitor-exit p0

    .line 76
    move-object/from16 v3, p5

    .line 77
    .line 78
    move-object/from16 v4, p6

    .line 79
    .line 80
    move-object/from16 v5, p7

    .line 81
    .line 82
    move-object/from16 v6, p8

    .line 83
    .line 84
    move-object/from16 v7, p9

    .line 85
    .line 86
    move-object/from16 v8, p10

    .line 87
    .line 88
    move-object/from16 v9, p11

    .line 89
    .line 90
    move-object v2, v11

    .line 91
    move-object v1, v12

    .line 92
    move-object/from16 v11, p12

    .line 93
    .line 94
    invoke-direct/range {v1 .. v11}, La/xgq;-><init>(La/gfq;Ljava/util/concurrent/Executor;La/krd;La/krd;La/krd;La/rrd;La/srd;La/msd;La/phf0;La/n660;)V

    .line 95
    .line 96
    .line 97
    move-object v12, v1

    .line 98
    invoke-virtual/range {p7 .. p7}, La/krd;->b()Lcom/google/android/gms/tasks/Task;

    .line 99
    .line 100
    .line 101
    invoke-virtual/range {p8 .. p8}, La/krd;->b()Lcom/google/android/gms/tasks/Task;

    .line 102
    .line 103
    .line 104
    invoke-virtual/range {p6 .. p6}, La/krd;->b()Lcom/google/android/gms/tasks/Task;

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, La/qff0;->a:Ljava/util/HashMap;

    .line 108
    .line 109
    invoke-virtual {v0, p2, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    sget-object v0, La/qff0;->k:Ljava/util/HashMap;

    .line 113
    .line 114
    invoke-virtual {v0, p2, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :catchall_0
    move-exception v0

    .line 119
    move-object p1, v0

    .line 120
    goto :goto_2

    .line 121
    :catchall_1
    move-exception v0

    .line 122
    move-object p1, v0

    .line 123
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 124
    :try_start_4
    throw p1

    .line 125
    :cond_1
    :goto_1
    iget-object v0, p0, La/qff0;->a:Ljava/util/HashMap;

    .line 126
    .line 127
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    check-cast p1, La/xgq;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 132
    .line 133
    monitor-exit p0

    .line 134
    return-object p1

    .line 135
    :goto_2
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 136
    throw p1
.end method

.method public final declared-synchronized b(Ljava/lang/String;)La/xgq;
    .locals 14

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "fetch"

    .line 3
    .line 4
    invoke-virtual {p0, p1, v0}, La/qff0;->c(Ljava/lang/String;Ljava/lang/String;)La/krd;

    .line 5
    .line 6
    .line 7
    move-result-object v7

    .line 8
    const-string v0, "activate"

    .line 9
    .line 10
    invoke-virtual {p0, p1, v0}, La/qff0;->c(Ljava/lang/String;Ljava/lang/String;)La/krd;

    .line 11
    .line 12
    .line 13
    move-result-object v8

    .line 14
    const-string v0, "defaults"

    .line 15
    .line 16
    invoke-virtual {p0, p1, v0}, La/qff0;->c(Ljava/lang/String;Ljava/lang/String;)La/krd;

    .line 17
    .line 18
    .line 19
    move-result-object v9

    .line 20
    iget-object v0, p0, La/qff0;->b:Landroid/content/Context;

    .line 21
    .line 22
    iget-object v1, p0, La/qff0;->h:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 23
    .line 24
    :try_start_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v3, "frc_"

    .line 27
    .line 28
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v1, "_"

    .line 35
    .line 36
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, "_settings"

    .line 43
    .line 44
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const/4 v2, 0x0

    .line 52
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    new-instance v12, La/msd;

    .line 57
    .line 58
    invoke-direct {v12, v0}, La/msd;-><init>(Landroid/content/SharedPreferences;)V

    .line 59
    .line 60
    .line 61
    new-instance v11, La/srd;

    .line 62
    .line 63
    iget-object v0, p0, La/qff0;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 64
    .line 65
    invoke-direct {v11, v0, v8, v9}, La/srd;-><init>(Ljava/util/concurrent/Executor;La/krd;La/krd;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 66
    .line 67
    .line 68
    :try_start_2
    iget-object v0, p0, La/qff0;->d:La/nfq;

    .line 69
    .line 70
    iget-object v1, p0, La/qff0;->g:La/p5d0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 71
    .line 72
    :try_start_3
    invoke-virtual {v0}, La/nfq;->a()V

    .line 73
    .line 74
    .line 75
    iget-object v0, v0, La/nfq;->b:Ljava/lang/String;

    .line 76
    .line 77
    const-string v2, "[DEFAULT]"

    .line 78
    .line 79
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 83
    if-eqz v0, :cond_0

    .line 84
    .line 85
    :try_start_4
    const-string v0, "firebase"

    .line 86
    .line 87
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_0

    .line 92
    .line 93
    new-instance v0, La/zn00;

    .line 94
    .line 95
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 96
    .line 97
    .line 98
    new-instance v2, Ljava/util/HashMap;

    .line 99
    .line 100
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-static {v2}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    iput-object v2, v0, La/zn00;->b:Ljava/lang/Object;

    .line 108
    .line 109
    iput-object v1, v0, La/zn00;->a:Ljava/lang/Object;

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_0
    const/4 v0, 0x0

    .line 113
    :goto_0
    if-eqz v0, :cond_1

    .line 114
    .line 115
    new-instance v1, La/off0;

    .line 116
    .line 117
    invoke-direct {v1, v0}, La/off0;-><init>(La/zn00;)V

    .line 118
    .line 119
    .line 120
    iget-object v2, v11, La/srd;->a:Ljava/util/HashSet;

    .line 121
    .line 122
    monitor-enter v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 123
    :try_start_5
    iget-object v0, v11, La/srd;->a:Ljava/util/HashSet;

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    monitor-exit v2

    .line 129
    goto :goto_2

    .line 130
    :catchall_0
    move-exception v0

    .line 131
    move-object p1, v0

    .line 132
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 133
    :try_start_6
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 134
    :goto_1
    move-object v1, p0

    .line 135
    goto :goto_5

    .line 136
    :catchall_1
    move-exception v0

    .line 137
    move-object p1, v0

    .line 138
    goto :goto_1

    .line 139
    :cond_1
    :goto_2
    :try_start_7
    new-instance v0, La/j910;

    .line 140
    .line 141
    const/16 v1, 0x17

    .line 142
    .line 143
    invoke-direct {v0, v1}, La/j910;-><init>(B)V

    .line 144
    .line 145
    .line 146
    iput-object v8, v0, La/j910;->b:Ljava/lang/Object;

    .line 147
    .line 148
    iput-object v9, v0, La/j910;->c:Ljava/lang/Object;

    .line 149
    .line 150
    new-instance v13, La/n660;

    .line 151
    .line 152
    iget-object v1, p0, La/qff0;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 153
    .line 154
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 155
    .line 156
    .line 157
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 158
    .line 159
    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 160
    .line 161
    .line 162
    invoke-static {v2}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    iput-object v2, v13, La/n660;->d:Ljava/lang/Object;

    .line 167
    .line 168
    iput-object v8, v13, La/n660;->a:Ljava/lang/Object;

    .line 169
    .line 170
    iput-object v0, v13, La/n660;->b:Ljava/lang/Object;

    .line 171
    .line 172
    iput-object v1, v13, La/n660;->c:Ljava/lang/Object;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 173
    .line 174
    :try_start_8
    iget-object v2, p0, La/qff0;->d:La/nfq;

    .line 175
    .line 176
    iget-object v4, p0, La/qff0;->e:La/dgq;

    .line 177
    .line 178
    iget-object v5, p0, La/qff0;->f:La/gfq;

    .line 179
    .line 180
    iget-object v6, p0, La/qff0;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 181
    .line 182
    invoke-virtual {p0, p1, v7, v12}, La/qff0;->d(Ljava/lang/String;La/krd;La/msd;)La/rrd;

    .line 183
    .line 184
    .line 185
    move-result-object v10
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 186
    move-object v1, p0

    .line 187
    move-object v3, p1

    .line 188
    :try_start_9
    invoke-virtual/range {v1 .. v13}, La/qff0;->a(La/nfq;Ljava/lang/String;La/dgq;La/gfq;Ljava/util/concurrent/Executor;La/krd;La/krd;La/krd;La/rrd;La/srd;La/msd;La/n660;)La/xgq;

    .line 189
    .line 190
    .line 191
    move-result-object p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 192
    monitor-exit v1

    .line 193
    return-object p0

    .line 194
    :catchall_2
    move-exception v0

    .line 195
    :goto_3
    move-object p1, v0

    .line 196
    goto :goto_5

    .line 197
    :catchall_3
    move-exception v0

    .line 198
    move-object v1, p0

    .line 199
    goto :goto_3

    .line 200
    :goto_4
    move-object p1, p0

    .line 201
    goto :goto_5

    .line 202
    :catchall_4
    move-exception v0

    .line 203
    move-object v1, p0

    .line 204
    move-object p0, v0

    .line 205
    goto :goto_4

    .line 206
    :goto_5
    :try_start_a
    monitor-exit v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 207
    throw p1
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;)La/krd;
    .locals 4

    .line 1
    iget-object v0, p0, La/qff0;->h:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "frc_"

    .line 4
    .line 5
    const-string v2, "_"

    .line 6
    .line 7
    const-string v3, "_"

    .line 8
    .line 9
    invoke-static {v1, v0, v2, p1, v3}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string v0, ".json"

    .line 14
    .line 15
    invoke-static {p1, p2, v0}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object p2, p0, La/qff0;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 20
    .line 21
    iget-object p0, p0, La/qff0;->b:Landroid/content/Context;

    .line 22
    .line 23
    sget-object v0, La/nsd;->c:Ljava/util/HashMap;

    .line 24
    .line 25
    const-class v0, La/nsd;

    .line 26
    .line 27
    monitor-enter v0

    .line 28
    :try_start_0
    sget-object v1, La/nsd;->c:Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_0

    .line 35
    .line 36
    new-instance v2, La/nsd;

    .line 37
    .line 38
    invoke-direct {v2, p0, p1}, La/nsd;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception p0

    .line 46
    goto :goto_3

    .line 47
    :cond_0
    :goto_0
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/nsd;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    monitor-exit v0

    .line 54
    sget-object p1, La/krd;->d:Ljava/util/HashMap;

    .line 55
    .line 56
    const-class p1, La/krd;

    .line 57
    .line 58
    monitor-enter p1

    .line 59
    :try_start_1
    iget-object v0, p0, La/nsd;->b:Ljava/lang/String;

    .line 60
    .line 61
    sget-object v1, La/krd;->d:Ljava/util/HashMap;

    .line 62
    .line 63
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-nez v2, :cond_1

    .line 68
    .line 69
    new-instance v2, La/krd;

    .line 70
    .line 71
    invoke-direct {v2, p2, p0}, La/krd;-><init>(Ljava/util/concurrent/Executor;La/nsd;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :catchall_1
    move-exception p0

    .line 79
    goto :goto_2

    .line 80
    :cond_1
    :goto_1
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    check-cast p0, La/krd;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 85
    .line 86
    monitor-exit p1

    .line 87
    return-object p0

    .line 88
    :goto_2
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 89
    throw p0

    .line 90
    :goto_3
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 91
    throw p0
.end method

.method public final declared-synchronized d(Ljava/lang/String;La/krd;La/msd;)La/rrd;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v9, p3

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    new-instance v2, La/rrd;

    .line 7
    .line 8
    iget-object v3, v1, La/qff0;->e:La/dgq;

    .line 9
    .line 10
    iget-object v0, v1, La/qff0;->d:La/nfq;

    .line 11
    .line 12
    invoke-virtual {v0}, La/nfq;->a()V

    .line 13
    .line 14
    .line 15
    iget-object v0, v0, La/nfq;->b:Ljava/lang/String;

    .line 16
    .line 17
    const-string v4, "[DEFAULT]"

    .line 18
    .line 19
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, v1, La/qff0;->g:La/p5d0;

    .line 26
    .line 27
    :goto_0
    move-object v4, v0

    .line 28
    goto :goto_1

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    goto :goto_2

    .line 31
    :cond_0
    new-instance v0, La/ogd;

    .line 32
    .line 33
    const/16 v4, 0xa

    .line 34
    .line 35
    invoke-direct {v0, v4}, La/ogd;-><init>(B)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :goto_1
    iget-object v5, v1, La/qff0;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 40
    .line 41
    sget-object v6, La/qff0;->j:Ljava/util/Random;

    .line 42
    .line 43
    iget-object v0, v1, La/qff0;->d:La/nfq;

    .line 44
    .line 45
    invoke-virtual {v0}, La/nfq;->a()V

    .line 46
    .line 47
    .line 48
    iget-object v0, v0, La/nfq;->c:La/mgq;

    .line 49
    .line 50
    iget-object v13, v0, La/mgq;->a:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v0, v1, La/qff0;->d:La/nfq;

    .line 53
    .line 54
    invoke-virtual {v0}, La/nfq;->a()V

    .line 55
    .line 56
    .line 57
    iget-object v0, v0, La/nfq;->c:La/mgq;

    .line 58
    .line 59
    iget-object v12, v0, La/mgq;->b:Ljava/lang/String;

    .line 60
    .line 61
    new-instance v8, Lcom/google/firebase/remoteconfig/internal/ConfigFetchHttpClient;

    .line 62
    .line 63
    iget-object v11, v1, La/qff0;->b:Landroid/content/Context;

    .line 64
    .line 65
    iget-object v0, v9, La/msd;->a:Landroid/content/SharedPreferences;

    .line 66
    .line 67
    const-string v7, "fetch_timeout_in_seconds"

    .line 68
    .line 69
    const-wide/16 v14, 0x3c

    .line 70
    .line 71
    invoke-interface {v0, v7, v14, v15}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 72
    .line 73
    .line 74
    move-result-wide v16

    .line 75
    iget-object v0, v9, La/msd;->a:Landroid/content/SharedPreferences;

    .line 76
    .line 77
    const-string v7, "fetch_timeout_in_seconds"

    .line 78
    .line 79
    invoke-interface {v0, v7, v14, v15}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 80
    .line 81
    .line 82
    move-result-wide v14

    .line 83
    move-wide/from16 v19, v16

    .line 84
    .line 85
    move-wide/from16 v17, v14

    .line 86
    .line 87
    move-wide/from16 v15, v19

    .line 88
    .line 89
    move-object/from16 v14, p1

    .line 90
    .line 91
    move-object v10, v8

    .line 92
    invoke-direct/range {v10 .. v18}, Lcom/google/firebase/remoteconfig/internal/ConfigFetchHttpClient;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V

    .line 93
    .line 94
    .line 95
    move-object v8, v10

    .line 96
    iget-object v10, v1, La/qff0;->i:Ljava/util/HashMap;

    .line 97
    .line 98
    const/4 v11, 0x0

    .line 99
    move-object/from16 v7, p2

    .line 100
    .line 101
    invoke-direct/range {v2 .. v11}, La/rrd;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    .line 103
    .line 104
    monitor-exit p0

    .line 105
    return-object v2

    .line 106
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    throw v0
.end method
