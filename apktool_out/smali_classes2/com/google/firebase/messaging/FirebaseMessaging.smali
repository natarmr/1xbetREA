.class public Lcom/google/firebase/messaging/FirebaseMessaging;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static l:La/drm0;

.field public static m:La/p5d0;

.field public static n:Ljava/util/concurrent/ScheduledThreadPoolExecutor;


# instance fields
.field public final a:La/nfq;

.field public final b:Landroid/content/Context;

.field public final c:La/pzu;

.field public final d:La/a6u;

.field public final e:La/g090;

.field public final f:La/o24;

.field public final g:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field public final h:Ljava/util/concurrent/ThreadPoolExecutor;

.field public final i:La/fd40;

.field public final j:La/dgq;

.field public k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/ogd;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1}, La/ogd;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/google/firebase/messaging/FirebaseMessaging;->m:La/p5d0;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(La/nfq;La/p5d0;La/p5d0;La/dgq;La/p5d0;La/v6n0;)V
    .locals 23

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    move-object/from16 v4, p1

    .line 4
    .line 5
    new-instance v11, La/fd40;

    .line 6
    .line 7
    invoke-virtual {v4}, La/nfq;->a()V

    .line 8
    .line 9
    .line 10
    iget-object v0, v4, La/nfq;->a:Landroid/content/Context;

    .line 11
    .line 12
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    const/4 v12, 0x0

    .line 16
    iput-byte v12, v11, La/fd40;->d:B

    .line 17
    .line 18
    iput-object v0, v11, La/fd40;->e:Ljava/lang/Object;

    .line 19
    .line 20
    new-instance v10, La/pzu;

    .line 21
    .line 22
    move-object/from16 v9, p2

    .line 23
    .line 24
    move-object v7, v4

    .line 25
    move-object v6, v10

    .line 26
    move-object v8, v11

    .line 27
    move-object/from16 v10, p3

    .line 28
    .line 29
    move-object/from16 v11, p4

    .line 30
    .line 31
    invoke-direct/range {v6 .. v11}, La/pzu;-><init>(La/nfq;La/fd40;La/p5d0;La/p5d0;La/dgq;)V

    .line 32
    .line 33
    .line 34
    move-object v10, v6

    .line 35
    move-object v9, v11

    .line 36
    move-object v11, v8

    .line 37
    new-instance v0, La/n950;

    .line 38
    .line 39
    const-string v1, "Firebase-Messaging-Task"

    .line 40
    .line 41
    invoke-direct {v0, v1}, La/n950;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    new-instance v13, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 49
    .line 50
    new-instance v1, La/n950;

    .line 51
    .line 52
    const-string v2, "Firebase-Messaging-Init"

    .line 53
    .line 54
    invoke-direct {v1, v2}, La/n950;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const/4 v14, 0x1

    .line 58
    invoke-direct {v13, v14, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    .line 59
    .line 60
    .line 61
    const-string v1, "Firebase-Messaging-File-Io"

    .line 62
    .line 63
    new-instance v15, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 64
    .line 65
    sget-object v20, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 66
    .line 67
    new-instance v21, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 68
    .line 69
    invoke-direct/range {v21 .. v21}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 70
    .line 71
    .line 72
    new-instance v2, La/n950;

    .line 73
    .line 74
    invoke-direct {v2, v1}, La/n950;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const/16 v16, 0x0

    .line 78
    .line 79
    const/16 v17, 0x1

    .line 80
    .line 81
    const-wide/16 v18, 0x1e

    .line 82
    .line 83
    move-object/from16 v22, v2

    .line 84
    .line 85
    invoke-direct/range {v15 .. v22}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 86
    .line 87
    .line 88
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-boolean v12, v5, Lcom/google/firebase/messaging/FirebaseMessaging;->k:Z

    .line 92
    .line 93
    sput-object p5, Lcom/google/firebase/messaging/FirebaseMessaging;->m:La/p5d0;

    .line 94
    .line 95
    iput-object v4, v5, Lcom/google/firebase/messaging/FirebaseMessaging;->a:La/nfq;

    .line 96
    .line 97
    new-instance v1, La/o24;

    .line 98
    .line 99
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 100
    .line 101
    .line 102
    iput-object v5, v1, La/o24;->d:Ljava/lang/Object;

    .line 103
    .line 104
    move-object/from16 v2, p6

    .line 105
    .line 106
    iput-object v2, v1, La/o24;->b:Ljava/lang/Object;

    .line 107
    .line 108
    iput-object v1, v5, Lcom/google/firebase/messaging/FirebaseMessaging;->f:La/o24;

    .line 109
    .line 110
    invoke-virtual {v4}, La/nfq;->a()V

    .line 111
    .line 112
    .line 113
    iget-object v1, v4, La/nfq;->a:Landroid/content/Context;

    .line 114
    .line 115
    iput-object v1, v5, Lcom/google/firebase/messaging/FirebaseMessaging;->b:Landroid/content/Context;

    .line 116
    .line 117
    new-instance v2, La/cgp;

    .line 118
    .line 119
    invoke-direct {v2}, La/cgp;-><init>()V

    .line 120
    .line 121
    .line 122
    iput-object v11, v5, Lcom/google/firebase/messaging/FirebaseMessaging;->i:La/fd40;

    .line 123
    .line 124
    iput-object v10, v5, Lcom/google/firebase/messaging/FirebaseMessaging;->c:La/pzu;

    .line 125
    .line 126
    iput-object v9, v5, Lcom/google/firebase/messaging/FirebaseMessaging;->j:La/dgq;

    .line 127
    .line 128
    new-instance v6, La/a6u;

    .line 129
    .line 130
    move-object v7, v1

    .line 131
    move-object v8, v4

    .line 132
    invoke-direct/range {v6 .. v11}, La/a6u;-><init>(Landroid/content/Context;La/nfq;La/dgq;La/pzu;La/fd40;)V

    .line 133
    .line 134
    .line 135
    iput-object v6, v5, Lcom/google/firebase/messaging/FirebaseMessaging;->d:La/a6u;

    .line 136
    .line 137
    new-instance v3, La/g090;

    .line 138
    .line 139
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 140
    .line 141
    .line 142
    new-instance v7, La/gx3;

    .line 143
    .line 144
    invoke-direct {v7, v12}, La/nuj0;-><init>(I)V

    .line 145
    .line 146
    .line 147
    iput-object v7, v3, La/g090;->b:Ljava/lang/Object;

    .line 148
    .line 149
    iput-object v0, v3, La/g090;->a:Ljava/lang/Object;

    .line 150
    .line 151
    iput-object v3, v5, Lcom/google/firebase/messaging/FirebaseMessaging;->e:La/g090;

    .line 152
    .line 153
    iput-object v13, v5, Lcom/google/firebase/messaging/FirebaseMessaging;->g:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 154
    .line 155
    iput-object v15, v5, Lcom/google/firebase/messaging/FirebaseMessaging;->h:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 156
    .line 157
    invoke-virtual {v4}, La/nfq;->a()V

    .line 158
    .line 159
    .line 160
    iget-object v0, v4, La/nfq;->a:Landroid/content/Context;

    .line 161
    .line 162
    instance-of v3, v0, Landroid/app/Application;

    .line 163
    .line 164
    if-eqz v3, :cond_0

    .line 165
    .line 166
    check-cast v0, Landroid/app/Application;

    .line 167
    .line 168
    invoke-virtual {v0, v2}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 169
    .line 170
    .line 171
    goto :goto_0

    .line 172
    :cond_0
    const-string v2, "FirebaseMessaging"

    .line 173
    .line 174
    new-instance v3, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    const-string v7, "Context "

    .line 177
    .line 178
    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    const-string v0, " was not an application, can\'t register for lifecycle callbacks. Some notification events may be dropped as a result."

    .line 185
    .line 186
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 194
    .line 195
    .line 196
    :goto_0
    invoke-virtual {v6}, La/a6u;->J()Z

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    if-eqz v0, :cond_1

    .line 201
    .line 202
    new-instance v0, La/igq;

    .line 203
    .line 204
    invoke-direct {v0, v5}, La/igq;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;)V

    .line 205
    .line 206
    .line 207
    move-object/from16 v2, p4

    .line 208
    .line 209
    check-cast v2, La/cgq;

    .line 210
    .line 211
    monitor-enter v2

    .line 212
    :try_start_0
    iget-object v3, v2, La/cgq;->j:Ljava/util/HashSet;

    .line 213
    .line 214
    invoke-virtual {v3, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 215
    .line 216
    .line 217
    monitor-exit v2

    .line 218
    goto :goto_1

    .line 219
    :catchall_0
    move-exception v0

    .line 220
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 221
    throw v0

    .line 222
    :cond_1
    :goto_1
    new-instance v0, La/jgq;

    .line 223
    .line 224
    invoke-direct {v0, v5, v12}, La/jgq;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;B)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v13, v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 228
    .line 229
    .line 230
    new-instance v2, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 231
    .line 232
    new-instance v0, La/n950;

    .line 233
    .line 234
    const-string v3, "Firebase-Messaging-Topics-Io"

    .line 235
    .line 236
    invoke-direct {v0, v3}, La/n950;-><init>(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    invoke-direct {v2, v14, v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    .line 240
    .line 241
    .line 242
    new-instance v0, La/yfr0;

    .line 243
    .line 244
    move-object/from16 v6, p4

    .line 245
    .line 246
    move-object v3, v11

    .line 247
    invoke-direct/range {v0 .. v6}, La/yfr0;-><init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledThreadPoolExecutor;La/fd40;La/nfq;Lcom/google/firebase/messaging/FirebaseMessaging;La/dgq;)V

    .line 248
    .line 249
    .line 250
    invoke-static {v2, v0}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    new-instance v1, La/kgq;

    .line 255
    .line 256
    invoke-direct {v1, v5, v12}, La/kgq;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;B)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0, v13, v1}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    .line 260
    .line 261
    .line 262
    new-instance v0, La/jgq;

    .line 263
    .line 264
    invoke-direct {v0, v5, v14}, La/jgq;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;B)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v13, v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 268
    .line 269
    .line 270
    return-void
.end method

.method public static b(Ljava/lang/Runnable;J)V
    .locals 4

    .line 1
    const-class v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/google/firebase/messaging/FirebaseMessaging;->n:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 9
    .line 10
    new-instance v2, La/n950;

    .line 11
    .line 12
    const-string v3, "TAG"

    .line 13
    .line 14
    invoke-direct {v2, v3}, La/n950;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-direct {v1, v3, v2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Lcom/google/firebase/messaging/FirebaseMessaging;->n:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    :goto_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 27
    .line 28
    invoke-interface {v1, p0, p1, p2, v2}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 29
    .line 30
    .line 31
    monitor-exit v0

    .line 32
    return-void

    .line 33
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    throw p0
.end method

.method public static declared-synchronized c(Landroid/content/Context;)La/drm0;
    .locals 2

    .line 1
    const-class v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/google/firebase/messaging/FirebaseMessaging;->l:La/drm0;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, La/drm0;

    .line 9
    .line 10
    invoke-direct {v1, p0}, La/drm0;-><init>(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lcom/google/firebase/messaging/FirebaseMessaging;->l:La/drm0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    monitor-exit v0

    .line 19
    return-object v1

    .line 20
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw p0
.end method

.method public static declared-synchronized getInstance(La/nfq;)Lcom/google/firebase/messaging/FirebaseMessaging;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    const-class v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0, v0}, La/nfq;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 9
    .line 10
    const-string v1, "Firebase Messaging component is not present"

    .line 11
    .line 12
    invoke-static {p0, v1}, La/s0x;->I(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    monitor-exit v0

    .line 16
    return-object p0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    throw p0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/google/firebase/messaging/FirebaseMessaging;->d()La/crm0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->h(La/crm0;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iget-object p0, v0, La/crm0;->b:Ljava/lang/String;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    iget-object v1, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:La/nfq;

    .line 15
    .line 16
    invoke-static {v1}, La/fd40;->b(La/nfq;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v2, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->e:La/g090;

    .line 21
    .line 22
    const-string v3, "Making new request for: "

    .line 23
    .line 24
    const-string v4, "Joining ongoing request for: "

    .line 25
    .line 26
    monitor-enter v2

    .line 27
    :try_start_0
    iget-object v5, v2, La/g090;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v5, La/gx3;

    .line 30
    .line 31
    invoke-virtual {v5, v1}, La/nuj0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    check-cast v5, Lcom/google/android/gms/tasks/Task;

    .line 36
    .line 37
    const/4 v6, 0x3

    .line 38
    if-eqz v5, :cond_2

    .line 39
    .line 40
    const-string p0, "FirebaseMessaging"

    .line 41
    .line 42
    invoke-static {p0, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz p0, :cond_1

    .line 47
    .line 48
    const-string p0, "FirebaseMessaging"

    .line 49
    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {p0, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :catchall_0
    move-exception p0

    .line 67
    goto :goto_2

    .line 68
    :cond_1
    :goto_0
    monitor-exit v2

    .line 69
    goto :goto_1

    .line 70
    :cond_2
    :try_start_1
    const-string v4, "FirebaseMessaging"

    .line 71
    .line 72
    invoke-static {v4, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-eqz v4, :cond_3

    .line 77
    .line 78
    const-string v4, "FirebaseMessaging"

    .line 79
    .line 80
    new-instance v5, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-static {v4, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 93
    .line 94
    .line 95
    :cond_3
    iget-object v3, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->d:La/a6u;

    .line 96
    .line 97
    invoke-virtual {v3}, La/a6u;->L()Lcom/google/android/gms/tasks/Task;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    new-instance v5, La/n950;

    .line 102
    .line 103
    const-string v6, "Firebase-Messaging-Task"

    .line 104
    .line 105
    invoke-direct {v5, v6}, La/n950;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-static {v5}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    new-instance v6, La/viq;

    .line 113
    .line 114
    const/4 v7, 0x5

    .line 115
    invoke-direct {v6, v3, v7}, La/viq;-><init>(Ljava/lang/Object;B)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    iget-object v4, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->h:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 123
    .line 124
    new-instance v5, La/hi;

    .line 125
    .line 126
    invoke-direct {v5, p0, v1, v0}, La/hi;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;Ljava/lang/String;La/crm0;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    iget-object v0, v2, La/g090;->a:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 136
    .line 137
    new-instance v3, La/uq;

    .line 138
    .line 139
    const/16 v4, 0x1a

    .line 140
    .line 141
    invoke-direct {v3, v2, v1, v4}, La/uq;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0, v0, v3}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    iget-object p0, v2, La/g090;->b:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast p0, La/gx3;

    .line 151
    .line 152
    invoke-virtual {p0, v1, v5}, La/nuj0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 153
    .line 154
    .line 155
    monitor-exit v2

    .line 156
    :goto_1
    :try_start_2
    invoke-static {v5}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    check-cast p0, Ljava/lang/String;
    :try_end_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    .line 161
    .line 162
    return-object p0

    .line 163
    :catch_0
    move-exception p0

    .line 164
    const-string v0, "FCM Registration failed!"

    .line 165
    .line 166
    invoke-static {v0, p0}, La/csj;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 167
    .line 168
    .line 169
    const/4 p0, 0x0

    .line 170
    return-object p0

    .line 171
    :goto_2
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 172
    throw p0
.end method

.method public final d()La/crm0;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->b:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->c(Landroid/content/Context;)La/drm0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "[DEFAULT]"

    .line 8
    .line 9
    iget-object v2, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:La/nfq;

    .line 10
    .line 11
    invoke-virtual {v2}, La/nfq;->a()V

    .line 12
    .line 13
    .line 14
    iget-object v3, v2, La/nfq;->b:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    const-string v1, ""

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v2}, La/nfq;->f()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    :goto_0
    iget-object p0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:La/nfq;

    .line 30
    .line 31
    invoke-static {p0}, La/fd40;->b(La/nfq;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    monitor-enter v0

    .line 36
    :try_start_0
    iget-object v2, v0, La/drm0;->a:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, Landroid/content/SharedPreferences;

    .line 39
    .line 40
    new-instance v3, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const-string v1, "|T|"

    .line 46
    .line 47
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string p0, "|*"

    .line 54
    .line 55
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    const/4 v1, 0x0

    .line 63
    invoke-interface {v2, p0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {p0}, La/crm0;->b(Ljava/lang/String;)La/crm0;

    .line 68
    .line 69
    .line 70
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    monitor-exit v0

    .line 72
    return-object p0

    .line 73
    :catchall_0
    move-exception p0

    .line 74
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    throw p0
.end method

.method public final e()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->c:La/pzu;

    .line 2
    .line 3
    iget-object v0, v0, La/pzu;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/cig0;

    .line 6
    .line 7
    iget-object v1, v0, La/cig0;->c:La/cf60;

    .line 8
    .line 9
    invoke-virtual {v1}, La/cf60;->t()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const v2, 0xe5ee4e0

    .line 14
    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    if-lt v1, v2, :cond_0

    .line 18
    .line 19
    iget-object v0, v0, La/cig0;->b:Landroid/content/Context;

    .line 20
    .line 21
    invoke-static {v0}, La/sbx0;->m(Landroid/content/Context;)La/sbx0;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sget-object v1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 26
    .line 27
    new-instance v2, La/f8x0;

    .line 28
    .line 29
    monitor-enter v0

    .line 30
    :try_start_0
    iget v4, v0, La/sbx0;->b:I

    .line 31
    .line 32
    add-int/lit8 v5, v4, 0x1

    .line 33
    .line 34
    iput v5, v0, La/sbx0;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    monitor-exit v0

    .line 37
    const/4 v5, 0x5

    .line 38
    invoke-direct {v2, v4, v5, v1, v3}, La/f8x0;-><init>(IILandroid/os/Bundle;B)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v2}, La/sbx0;->n(La/f8x0;)Lcom/google/android/gms/tasks/Task;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sget-object v1, La/haw0;->d:La/haw0;

    .line 46
    .line 47
    sget-object v2, La/wxs0;->b:La/wxs0;

    .line 48
    .line 49
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->continueWith(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception p0

    .line 55
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    throw p0

    .line 57
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 58
    .line 59
    const-string v1, "SERVICE_NOT_AVAILABLE"

    .line 60
    .line 61
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    :goto_0
    iget-object v1, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->g:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 69
    .line 70
    new-instance v2, La/kgq;

    .line 71
    .line 72
    invoke-direct {v2, p0, v3}, La/kgq;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;B)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public final f()Z
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->b:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, La/w9x;->J(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v2, 0x1d

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x3

    .line 12
    const-string v5, "FirebaseMessaging"

    .line 13
    .line 14
    if-lt v1, v2, :cond_3

    .line 15
    .line 16
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iget v2, v2, Landroid/content/pm/ApplicationInfo;->uid:I

    .line 25
    .line 26
    if-ne v1, v2, :cond_2

    .line 27
    .line 28
    const-class v1, Landroid/app/NotificationManager;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Landroid/app/NotificationManager;

    .line 35
    .line 36
    invoke-static {v0}, La/xl50;->k(Landroid/app/NotificationManager;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v1, "com.google.android.gms"

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_4

    .line 47
    .line 48
    invoke-static {v5, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    const-string v0, "GMS core is set for proxying"

    .line 55
    .line 56
    invoke-static {v5, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    :cond_0
    iget-object p0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:La/nfq;

    .line 60
    .line 61
    const-class v0, La/vp2;

    .line 62
    .line 63
    invoke-virtual {p0, v0}, La/nfq;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    if-eqz p0, :cond_1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    invoke-static {}, La/x0x;->N()Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    if-eqz p0, :cond_4

    .line 75
    .line 76
    sget-object p0, Lcom/google/firebase/messaging/FirebaseMessaging;->m:La/p5d0;

    .line 77
    .line 78
    if-eqz p0, :cond_4

    .line 79
    .line 80
    :goto_0
    const/4 p0, 0x1

    .line 81
    return p0

    .line 82
    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    const-string v1, "error retrieving notification delegate for package "

    .line 85
    .line 86
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-static {v5, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    return v3

    .line 104
    :cond_3
    invoke-static {v5, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    if-eqz p0, :cond_4

    .line 109
    .line 110
    const-string p0, "Platform doesn\'t support proxying."

    .line 111
    .line 112
    invoke-static {v5, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    :cond_4
    return v3
.end method

.method public final declared-synchronized g(J)V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    const-wide/16 v0, 0x2

    .line 3
    .line 4
    mul-long/2addr v0, p1

    .line 5
    const-wide/16 v2, 0x1e

    .line 6
    .line 7
    :try_start_0
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    const-wide/16 v2, 0x7080

    .line 12
    .line 13
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    new-instance v2, La/uzn0;

    .line 18
    .line 19
    invoke-direct {v2, p0, v0, v1}, La/uzn0;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;J)V

    .line 20
    .line 21
    .line 22
    invoke-static {v2, p1, p2}, Lcom/google/firebase/messaging/FirebaseMessaging;->b(Ljava/lang/Runnable;J)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    iput-boolean p1, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->k:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    monitor-exit p0

    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    throw p1
.end method

.method public final h(La/crm0;)Z
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p1, :cond_3

    .line 3
    .line 4
    iget-object v1, p1, La/crm0;->b:Ljava/lang/String;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->i:La/fd40;

    .line 7
    .line 8
    invoke-virtual {v2}, La/fd40;->a()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 13
    .line 14
    .line 15
    move-result-wide v3

    .line 16
    iget-wide v5, p1, La/crm0;->a:J

    .line 17
    .line 18
    const-wide/32 v7, 0x240c8400

    .line 19
    .line 20
    .line 21
    add-long/2addr v5, v7

    .line 22
    cmp-long v3, v3, v5

    .line 23
    .line 24
    if-gtz v3, :cond_3

    .line 25
    .line 26
    iget-object p1, p1, La/crm0;->c:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    iget-object p1, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->d:La/a6u;

    .line 36
    .line 37
    invoke-virtual {p1}, La/a6u;->J()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    :try_start_0
    iget-object p0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->j:La/dgq;

    .line 44
    .line 45
    check-cast p0, La/cgq;

    .line 46
    .line 47
    invoke-virtual {p0}, La/cgq;->c()Lcom/google/android/gms/tasks/Task;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p0}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :catch_0
    const/4 p0, 0x0

    .line 59
    :goto_0
    invoke-virtual {v1, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    xor-int/2addr p0, v0

    .line 64
    return p0

    .line 65
    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    const/16 p1, 0x16

    .line 70
    .line 71
    if-gt p0, p1, :cond_2

    .line 72
    .line 73
    return v0

    .line 74
    :cond_2
    const/4 p0, 0x0

    .line 75
    return p0

    .line 76
    :cond_3
    :goto_1
    return v0
.end method
