.class public Lcom/google/firebase/perf/FirebasePerfRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# static fields
.field private static final EARLY_LIBRARY_NAME:Ljava/lang/String; = "fire-perf-early"

.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-perf"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(La/pzu;)La/sgq;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/perf/FirebasePerfRegistrar;->providesFirebasePerformance(La/dgd;)La/sgq;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(La/jkd0;La/pzu;)La/ogq;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/google/firebase/perf/FirebasePerfRegistrar;->lambda$getComponents$0(La/jkd0;La/dgd;)La/ogq;

    move-result-object p0

    return-object p0
.end method

.method private static lambda$getComponents$0(La/jkd0;La/dgd;)La/ogq;
    .locals 14

    .line 1
    new-instance v0, La/ogq;

    .line 2
    .line 3
    const-class v1, La/nfq;

    .line 4
    .line 5
    invoke-interface {p1, v1}, La/dgd;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, La/nfq;

    .line 10
    .line 11
    const-class v2, La/b55;

    .line 12
    .line 13
    invoke-interface {p1, v2}, La/dgd;->j(Ljava/lang/Class;)La/p5d0;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v2}, La/p5d0;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, La/b55;

    .line 22
    .line 23
    invoke-interface {p1, p0}, La/dgd;->e(La/jkd0;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Ljava/util/concurrent/Executor;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, La/nfq;->a()V

    .line 33
    .line 34
    .line 35
    iget-object p1, v1, La/nfq;->a:Landroid/content/Context;

    .line 36
    .line 37
    invoke-static {}, La/hsd;->e()La/hsd;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    sget-object v3, La/hsd;->d:La/f03;

    .line 45
    .line 46
    invoke-static {p1}, La/gut0;->a(Landroid/content/Context;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    iput-boolean v4, v3, La/f03;->a:Z

    .line 51
    .line 52
    iget-object v1, v1, La/hsd;->c:La/rgk;

    .line 53
    .line 54
    invoke-virtual {v1, p1}, La/rgk;->c(Landroid/content/Context;)V

    .line 55
    .line 56
    .line 57
    invoke-static {}, La/mj3;->a()La/mj3;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    monitor-enter v1

    .line 62
    :try_start_0
    iget-boolean v3, v1, La/mj3;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    const/4 v4, 0x1

    .line 65
    if-eqz v3, :cond_0

    .line 66
    .line 67
    monitor-exit v1

    .line 68
    goto :goto_1

    .line 69
    :cond_0
    :try_start_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    instance-of v5, v3, Landroid/app/Application;

    .line 74
    .line 75
    if-eqz v5, :cond_1

    .line 76
    .line 77
    check-cast v3, Landroid/app/Application;

    .line 78
    .line 79
    invoke-virtual {v3, v1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 80
    .line 81
    .line 82
    iput-boolean v4, v1, La/mj3;->o:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :catchall_0
    move-exception v0

    .line 86
    move-object p0, v0

    .line 87
    goto/16 :goto_e

    .line 88
    .line 89
    :cond_1
    :goto_0
    monitor-exit v1

    .line 90
    :goto_1
    new-instance v3, La/tgq;

    .line 91
    .line 92
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 93
    .line 94
    .line 95
    iget-object v5, v1, La/mj3;->g:Ljava/util/HashSet;

    .line 96
    .line 97
    monitor-enter v5

    .line 98
    :try_start_2
    iget-object v1, v1, La/mj3;->g:Ljava/util/HashSet;

    .line 99
    .line 100
    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    monitor-exit v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 104
    if-eqz v2, :cond_c

    .line 105
    .line 106
    sget-object v1, Lcom/google/firebase/perf/metrics/AppStartTrace;->z:Lcom/google/firebase/perf/metrics/AppStartTrace;

    .line 107
    .line 108
    if-eqz v1, :cond_2

    .line 109
    .line 110
    sget-object v1, Lcom/google/firebase/perf/metrics/AppStartTrace;->z:Lcom/google/firebase/perf/metrics/AppStartTrace;

    .line 111
    .line 112
    goto :goto_5

    .line 113
    :cond_2
    sget-object v1, La/dps0;->s:La/dps0;

    .line 114
    .line 115
    new-instance v2, La/yk5;

    .line 116
    .line 117
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 118
    .line 119
    .line 120
    sget-object v3, Lcom/google/firebase/perf/metrics/AppStartTrace;->z:Lcom/google/firebase/perf/metrics/AppStartTrace;

    .line 121
    .line 122
    if-nez v3, :cond_4

    .line 123
    .line 124
    const-class v3, Lcom/google/firebase/perf/metrics/AppStartTrace;

    .line 125
    .line 126
    monitor-enter v3

    .line 127
    :try_start_3
    sget-object v5, Lcom/google/firebase/perf/metrics/AppStartTrace;->z:Lcom/google/firebase/perf/metrics/AppStartTrace;

    .line 128
    .line 129
    if-nez v5, :cond_3

    .line 130
    .line 131
    new-instance v5, Lcom/google/firebase/perf/metrics/AppStartTrace;

    .line 132
    .line 133
    invoke-static {}, La/hsd;->e()La/hsd;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    new-instance v7, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 138
    .line 139
    sget v8, Lcom/google/firebase/perf/metrics/AppStartTrace;->y:I

    .line 140
    .line 141
    int-to-long v8, v8

    .line 142
    const-wide/16 v10, 0xa

    .line 143
    .line 144
    add-long/2addr v10, v8

    .line 145
    sget-object v12, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 146
    .line 147
    new-instance v13, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 148
    .line 149
    invoke-direct {v13}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 150
    .line 151
    .line 152
    const/4 v8, 0x0

    .line 153
    const/4 v9, 0x1

    .line 154
    invoke-direct/range {v7 .. v13}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    .line 155
    .line 156
    .line 157
    invoke-direct {v5, v1, v2, v6, v7}, Lcom/google/firebase/perf/metrics/AppStartTrace;-><init>(La/dps0;La/yk5;La/hsd;Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 158
    .line 159
    .line 160
    sput-object v5, Lcom/google/firebase/perf/metrics/AppStartTrace;->z:Lcom/google/firebase/perf/metrics/AppStartTrace;

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :catchall_1
    move-exception v0

    .line 164
    move-object p0, v0

    .line 165
    goto :goto_3

    .line 166
    :cond_3
    :goto_2
    monitor-exit v3

    .line 167
    goto :goto_4

    .line 168
    :goto_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 169
    throw p0

    .line 170
    :cond_4
    :goto_4
    sget-object v1, Lcom/google/firebase/perf/metrics/AppStartTrace;->z:Lcom/google/firebase/perf/metrics/AppStartTrace;

    .line 171
    .line 172
    :goto_5
    monitor-enter v1

    .line 173
    :try_start_4
    iget-boolean v2, v1, Lcom/google/firebase/perf/metrics/AppStartTrace;->a:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 174
    .line 175
    const/16 v3, 0x22

    .line 176
    .line 177
    if-eqz v2, :cond_5

    .line 178
    .line 179
    monitor-exit v1

    .line 180
    goto/16 :goto_b

    .line 181
    .line 182
    :cond_5
    :try_start_5
    sget-object v2, La/tyb0;->i:La/tyb0;

    .line 183
    .line 184
    iget-object v2, v2, La/tyb0;->f:La/glz;

    .line 185
    .line 186
    invoke-virtual {v2, v1}, La/glz;->a(La/blz;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    instance-of v2, p1, Landroid/app/Application;

    .line 194
    .line 195
    if-eqz v2, :cond_b

    .line 196
    .line 197
    move-object v2, p1

    .line 198
    check-cast v2, Landroid/app/Application;

    .line 199
    .line 200
    invoke-virtual {v2, v1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 201
    .line 202
    .line 203
    iget-boolean v2, v1, Lcom/google/firebase/perf/metrics/AppStartTrace;->v:Z

    .line 204
    .line 205
    const/4 v5, 0x0

    .line 206
    if-nez v2, :cond_7

    .line 207
    .line 208
    move-object v2, p1

    .line 209
    check-cast v2, Landroid/app/Application;

    .line 210
    .line 211
    invoke-static {v2}, Lcom/google/firebase/perf/metrics/AppStartTrace;->c(Landroid/app/Application;)Z

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    if-eqz v2, :cond_6

    .line 216
    .line 217
    goto :goto_6

    .line 218
    :cond_6
    move v2, v5

    .line 219
    goto :goto_7

    .line 220
    :cond_7
    :goto_6
    move v2, v4

    .line 221
    :goto_7
    iput-boolean v2, v1, Lcom/google/firebase/perf/metrics/AppStartTrace;->v:Z

    .line 222
    .line 223
    move-object v2, p1

    .line 224
    check-cast v2, Landroid/app/Application;

    .line 225
    .line 226
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 227
    .line 228
    const-string v7, "activity"

    .line 229
    .line 230
    invoke-virtual {v2, v7}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    check-cast v2, Landroid/app/ActivityManager;

    .line 235
    .line 236
    const/4 v7, 0x2

    .line 237
    if-nez v2, :cond_8

    .line 238
    .line 239
    new-instance v2, La/x860;

    .line 240
    .line 241
    invoke-direct {v2, v7, v5}, La/x860;-><init>(IZ)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 242
    .line 243
    .line 244
    goto :goto_9

    .line 245
    :cond_8
    :try_start_6
    new-instance v2, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 246
    .line 247
    invoke-direct {v2}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    .line 248
    .line 249
    .line 250
    invoke-static {v2}, Landroid/app/ActivityManager;->getMyMemoryState(Landroid/app/ActivityManager$RunningAppProcessInfo;)V

    .line 251
    .line 252
    .line 253
    iget v2, v2, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 254
    .line 255
    goto :goto_8

    .line 256
    :catchall_2
    const/4 v2, -0x1

    .line 257
    :goto_8
    if-lt v6, v3, :cond_a

    .line 258
    .line 259
    const/16 v6, 0x64

    .line 260
    .line 261
    if-ne v2, v6, :cond_9

    .line 262
    .line 263
    move v7, v4

    .line 264
    :cond_9
    :try_start_7
    new-instance v2, La/x860;

    .line 265
    .line 266
    invoke-direct {v2, v7, v5}, La/x860;-><init>(IZ)V

    .line 267
    .line 268
    .line 269
    goto :goto_9

    .line 270
    :cond_a
    new-instance v2, La/x860;

    .line 271
    .line 272
    invoke-direct {v2, v7, v5}, La/x860;-><init>(IZ)V

    .line 273
    .line 274
    .line 275
    :goto_9
    iput-object v2, v1, Lcom/google/firebase/perf/metrics/AppStartTrace;->w:La/x860;

    .line 276
    .line 277
    iput-boolean v4, v1, Lcom/google/firebase/perf/metrics/AppStartTrace;->a:Z

    .line 278
    .line 279
    check-cast p1, Landroid/app/Application;

    .line 280
    .line 281
    iput-object p1, v1, Lcom/google/firebase/perf/metrics/AppStartTrace;->e:Landroid/app/Application;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 282
    .line 283
    goto :goto_a

    .line 284
    :catchall_3
    move-exception v0

    .line 285
    move-object p0, v0

    .line 286
    goto :goto_c

    .line 287
    :cond_b
    :goto_a
    monitor-exit v1

    .line 288
    :goto_b
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 289
    .line 290
    if-ge p1, v3, :cond_c

    .line 291
    .line 292
    new-instance p1, La/mx2;

    .line 293
    .line 294
    invoke-direct {p1, v1, v4}, La/mx2;-><init>(Ljava/lang/Object;B)V

    .line 295
    .line 296
    .line 297
    invoke-interface {p0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 298
    .line 299
    .line 300
    goto :goto_d

    .line 301
    :goto_c
    :try_start_8
    monitor-exit v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 302
    throw p0

    .line 303
    :cond_c
    :goto_d
    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    .line 304
    .line 305
    .line 306
    move-result-object p0

    .line 307
    invoke-virtual {p0}, Lcom/google/firebase/perf/session/SessionManager;->initializeGaugeCollection()V

    .line 308
    .line 309
    .line 310
    return-object v0

    .line 311
    :catchall_4
    move-exception v0

    .line 312
    move-object p0, v0

    .line 313
    :try_start_9
    monitor-exit v5
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 314
    throw p0

    .line 315
    :goto_e
    :try_start_a
    monitor-exit v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 316
    throw p0
.end method

.method private static providesFirebasePerformance(La/dgd;)La/sgq;
    .locals 10

    .line 1
    const-class v0, La/ogq;

    .line 2
    .line 3
    invoke-interface {p0, v0}, La/dgd;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    new-instance v1, La/pmi;

    .line 7
    .line 8
    const-class v0, La/nfq;

    .line 9
    .line 10
    invoke-interface {p0, v0}, La/dgd;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    move-object v2, v0

    .line 15
    check-cast v2, La/nfq;

    .line 16
    .line 17
    const-class v0, La/dgq;

    .line 18
    .line 19
    invoke-interface {p0, v0}, La/dgd;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    move-object v3, v0

    .line 24
    check-cast v3, La/dgq;

    .line 25
    .line 26
    const-class v0, La/qff0;

    .line 27
    .line 28
    invoke-interface {p0, v0}, La/dgd;->j(Ljava/lang/Class;)La/p5d0;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    const-class v0, La/mos0;

    .line 33
    .line 34
    invoke-interface {p0, v0}, La/dgd;->j(Ljava/lang/Class;)La/p5d0;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    const/16 v6, 0x12

    .line 39
    .line 40
    invoke-direct/range {v1 .. v6}, La/pmi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 41
    .line 42
    .line 43
    new-instance v3, La/ugq;

    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    invoke-direct {v3, v1, p0}, La/ugq;-><init>(La/pmi;B)V

    .line 47
    .line 48
    .line 49
    new-instance v4, La/ugq;

    .line 50
    .line 51
    const/4 p0, 0x2

    .line 52
    invoke-direct {v4, v1, p0}, La/ugq;-><init>(La/pmi;B)V

    .line 53
    .line 54
    .line 55
    new-instance v5, La/ugq;

    .line 56
    .line 57
    const/4 p0, 0x1

    .line 58
    invoke-direct {v5, v1, p0}, La/ugq;-><init>(La/pmi;B)V

    .line 59
    .line 60
    .line 61
    new-instance v6, La/ugq;

    .line 62
    .line 63
    const/4 p0, 0x3

    .line 64
    invoke-direct {v6, v1, p0}, La/ugq;-><init>(La/pmi;B)V

    .line 65
    .line 66
    .line 67
    new-instance v7, La/p8i;

    .line 68
    .line 69
    const/16 p0, 0xb

    .line 70
    .line 71
    invoke-direct {v7, v1, p0}, La/p8i;-><init>(Ljava/lang/Object;B)V

    .line 72
    .line 73
    .line 74
    new-instance v8, La/p8i;

    .line 75
    .line 76
    const/16 p0, 0xa

    .line 77
    .line 78
    invoke-direct {v8, v1, p0}, La/p8i;-><init>(Ljava/lang/Object;B)V

    .line 79
    .line 80
    .line 81
    new-instance v9, La/p8i;

    .line 82
    .line 83
    const/16 p0, 0xc

    .line 84
    .line 85
    invoke-direct {v9, v1, p0}, La/p8i;-><init>(Ljava/lang/Object;B)V

    .line 86
    .line 87
    .line 88
    new-instance v2, La/vgq;

    .line 89
    .line 90
    invoke-direct/range {v2 .. v9}, La/vgq;-><init>(La/ugq;La/ugq;La/ugq;La/ugq;La/p8i;La/p8i;La/p8i;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v2}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    check-cast p0, La/sgq;

    .line 102
    .line 103
    return-object p0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "La/pfd;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p0, La/jkd0;

    .line 2
    .line 3
    const-class v0, La/a7t0;

    .line 4
    .line 5
    const-class v1, Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    invoke-direct {p0, v0, v1}, La/jkd0;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    const-class v0, La/sgq;

    .line 11
    .line 12
    invoke-static {v0}, La/pfd;->b(Ljava/lang/Class;)La/ofd;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "fire-perf"

    .line 17
    .line 18
    iput-object v1, v0, La/ofd;->a:Ljava/lang/String;

    .line 19
    .line 20
    const-class v2, La/nfq;

    .line 21
    .line 22
    invoke-static {v2}, La/c7k;->c(Ljava/lang/Class;)La/c7k;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v0, v3}, La/ofd;->a(La/c7k;)V

    .line 27
    .line 28
    .line 29
    new-instance v3, La/c7k;

    .line 30
    .line 31
    const/4 v4, 0x1

    .line 32
    const-class v5, La/qff0;

    .line 33
    .line 34
    invoke-direct {v3, v4, v4, v5}, La/c7k;-><init>(IILjava/lang/Class;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v3}, La/ofd;->a(La/c7k;)V

    .line 38
    .line 39
    .line 40
    const-class v3, La/dgq;

    .line 41
    .line 42
    invoke-static {v3}, La/c7k;->c(Ljava/lang/Class;)La/c7k;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v0, v3}, La/ofd;->a(La/c7k;)V

    .line 47
    .line 48
    .line 49
    new-instance v3, La/c7k;

    .line 50
    .line 51
    const-class v5, La/mos0;

    .line 52
    .line 53
    invoke-direct {v3, v4, v4, v5}, La/c7k;-><init>(IILjava/lang/Class;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v3}, La/ofd;->a(La/c7k;)V

    .line 57
    .line 58
    .line 59
    const-class v3, La/ogq;

    .line 60
    .line 61
    invoke-static {v3}, La/c7k;->c(Ljava/lang/Class;)La/c7k;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    invoke-virtual {v0, v5}, La/ofd;->a(La/c7k;)V

    .line 66
    .line 67
    .line 68
    new-instance v5, La/udk;

    .line 69
    .line 70
    const/16 v6, 0x1a

    .line 71
    .line 72
    invoke-direct {v5, v6}, La/udk;-><init>(B)V

    .line 73
    .line 74
    .line 75
    iput-object v5, v0, La/ofd;->f:La/jgd;

    .line 76
    .line 77
    invoke-virtual {v0}, La/ofd;->b()La/pfd;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-static {v3}, La/pfd;->b(Ljava/lang/Class;)La/ofd;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    const-string v5, "fire-perf-early"

    .line 86
    .line 87
    iput-object v5, v3, La/ofd;->a:Ljava/lang/String;

    .line 88
    .line 89
    invoke-static {v2}, La/c7k;->c(Ljava/lang/Class;)La/c7k;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {v3, v2}, La/ofd;->a(La/c7k;)V

    .line 94
    .line 95
    .line 96
    const-class v2, La/b55;

    .line 97
    .line 98
    invoke-static {v2}, La/c7k;->a(Ljava/lang/Class;)La/c7k;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {v3, v2}, La/ofd;->a(La/c7k;)V

    .line 103
    .line 104
    .line 105
    new-instance v2, La/c7k;

    .line 106
    .line 107
    const/4 v5, 0x0

    .line 108
    invoke-direct {v2, p0, v4, v5}, La/c7k;-><init>(La/jkd0;II)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3, v2}, La/ofd;->a(La/c7k;)V

    .line 112
    .line 113
    .line 114
    const/4 v2, 0x2

    .line 115
    invoke-virtual {v3, v2}, La/ofd;->c(I)V

    .line 116
    .line 117
    .line 118
    new-instance v4, La/ouj;

    .line 119
    .line 120
    invoke-direct {v4, p0, v2}, La/ouj;-><init>(La/jkd0;B)V

    .line 121
    .line 122
    .line 123
    iput-object v4, v3, La/ofd;->f:La/jgd;

    .line 124
    .line 125
    invoke-virtual {v3}, La/ofd;->b()La/pfd;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    const-string v2, "22.0.6"

    .line 130
    .line 131
    invoke-static {v1, v2}, La/q0x;->I(Ljava/lang/String;Ljava/lang/String;)La/pfd;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    filled-new-array {v0, p0, v1}, [La/pfd;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    return-object p0
.end method
