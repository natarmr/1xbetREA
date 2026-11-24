.class public final La/cpv0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static k:La/cpv0;

.field public static l:La/cpv0;

.field public static final m:Ljava/lang/Object;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:La/wsd;

.field public final c:Landroidx/work/impl/WorkDatabase;

.field public final d:La/fpv0;

.field public final e:Ljava/util/List;

.field public final f:La/ezb0;

.field public final g:La/o470;

.field public h:Z

.field public i:Landroid/content/BroadcastReceiver$PendingResult;

.field public final j:La/lds0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "WorkManagerImpl"

    .line 2
    .line 3
    invoke-static {v0}, La/wv00;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    sput-object v0, La/cpv0;->k:La/cpv0;

    .line 8
    .line 9
    sput-object v0, La/cpv0;->l:La/cpv0;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    sput-object v0, La/cpv0;->m:Ljava/lang/Object;

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;La/wsd;La/fpv0;Landroidx/work/impl/WorkDatabase;Ljava/util/List;La/ezb0;La/lds0;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, La/cpv0;->h:Z

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->isDeviceProtectedStorage()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-nez v1, :cond_2

    .line 17
    .line 18
    new-instance v1, La/wv00;

    .line 19
    .line 20
    const/4 v3, 0x4

    .line 21
    invoke-direct {v1, v3, v0}, La/wv00;-><init>(IB)V

    .line 22
    .line 23
    .line 24
    sget-object v0, La/wv00;->b:Ljava/lang/Object;

    .line 25
    .line 26
    monitor-enter v0

    .line 27
    :try_start_0
    sget-object v4, La/wv00;->c:La/wv00;

    .line 28
    .line 29
    if-nez v4, :cond_0

    .line 30
    .line 31
    sput-object v1, La/wv00;->c:La/wv00;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p0

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    iput-object p1, p0, La/cpv0;->a:Landroid/content/Context;

    .line 38
    .line 39
    iput-object p3, p0, La/cpv0;->d:La/fpv0;

    .line 40
    .line 41
    iput-object p4, p0, La/cpv0;->c:Landroidx/work/impl/WorkDatabase;

    .line 42
    .line 43
    iput-object p6, p0, La/cpv0;->f:La/ezb0;

    .line 44
    .line 45
    iput-object p7, p0, La/cpv0;->j:La/lds0;

    .line 46
    .line 47
    iput-object p2, p0, La/cpv0;->b:La/wsd;

    .line 48
    .line 49
    iput-object p5, p0, La/cpv0;->e:Ljava/util/List;

    .line 50
    .line 51
    iget-object p7, p3, La/fpv0;->c:La/sje;

    .line 52
    .line 53
    new-instance v0, La/o470;

    .line 54
    .line 55
    invoke-direct {v0, p4}, La/o470;-><init>(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, La/cpv0;->g:La/o470;

    .line 59
    .line 60
    iget-object v0, p3, La/fpv0;->a:La/xgi0;

    .line 61
    .line 62
    sget-object v1, La/m2h0;->a:Ljava/lang/String;

    .line 63
    .line 64
    new-instance v1, La/l2h0;

    .line 65
    .line 66
    invoke-direct {v1, v0, p4, p5, p2}, La/l2h0;-><init>(Ljava/util/concurrent/Executor;Landroidx/work/impl/WorkDatabase;Ljava/util/List;La/wsd;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p6, v1}, La/ezb0;->a(La/zjo;)V

    .line 70
    .line 71
    .line 72
    new-instance p5, La/ytq;

    .line 73
    .line 74
    invoke-direct {p5, p1, p0}, La/ytq;-><init>(Landroid/content/Context;La/cpv0;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p3, p5}, La/fpv0;->a(Ljava/lang/Runnable;)V

    .line 78
    .line 79
    .line 80
    sget-object p0, La/u7t0;->a:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-static {p1, p2}, La/zyb0;->a(Landroid/content/Context;La/wsd;)Z

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    if-eqz p0, :cond_1

    .line 90
    .line 91
    invoke-virtual {p4}, Landroidx/work/impl/WorkDatabase;->y()La/upv0;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    iget-object p0, p0, La/upv0;->a:La/aeg0;

    .line 96
    .line 97
    const-string p2, "workspec"

    .line 98
    .line 99
    filled-new-array {p2}, [Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    new-instance p3, La/ejv0;

    .line 104
    .line 105
    const/16 p4, 0xa

    .line 106
    .line 107
    invoke-direct {p3, p4}, La/ejv0;-><init>(B)V

    .line 108
    .line 109
    .line 110
    invoke-static {p0, p2, p3}, La/fxb;->z(La/aeg0;[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)La/zj2;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    new-instance p2, La/t7t0;

    .line 115
    .line 116
    invoke-direct {p2, v3, v2}, La/bnn0;-><init>(ILa/yje;)V

    .line 117
    .line 118
    .line 119
    new-instance p3, La/a1g;

    .line 120
    .line 121
    const/16 p4, 0x14

    .line 122
    .line 123
    invoke-direct {p3, p0, p2, p4}, La/a1g;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 124
    .line 125
    .line 126
    const/4 p0, -0x1

    .line 127
    invoke-static {p3, p0}, La/ulb;->D(La/gmq;I)La/gmq;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-static {p0}, La/i120;->W(La/gmq;)La/gmq;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    new-instance p2, La/k6s0;

    .line 136
    .line 137
    const/4 p3, 0x7

    .line 138
    invoke-direct {p2, p1, v2, p3}, La/k6s0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 139
    .line 140
    .line 141
    new-instance p1, La/fnq;

    .line 142
    .line 143
    invoke-direct {p1, p0, p2, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 144
    .line 145
    .line 146
    invoke-static {p1, p7}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 147
    .line 148
    .line 149
    :cond_1
    return-void

    .line 150
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 151
    throw p0

    .line 152
    :cond_2
    const-string p0, "Cannot initialize WorkManager in direct boot mode"

    .line 153
    .line 154
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw v2
.end method

.method public static d(Landroid/content/Context;)La/cpv0;
    .locals 3

    .line 1
    sget-object v0, La/cpv0;->m:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    :try_start_1
    sget-object v1, La/cpv0;->k:La/cpv0;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    monitor-exit v0

    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    move-exception p0

    .line 12
    goto :goto_2

    .line 13
    :cond_0
    sget-object v1, La/cpv0;->l:La/cpv0;

    .line 14
    .line 15
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    :goto_0
    if-nez v1, :cond_2

    .line 17
    .line 18
    :try_start_2
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    instance-of v1, p0, La/vsd;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    move-object v1, p0

    .line 27
    check-cast v1, La/vsd;

    .line 28
    .line 29
    check-cast v1, Lorg/platform/app/ApplicationLoader;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    new-instance v1, La/usd;

    .line 35
    .line 36
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    new-instance v2, La/wsd;

    .line 40
    .line 41
    invoke-direct {v2, v1}, La/wsd;-><init>(La/usd;)V

    .line 42
    .line 43
    .line 44
    invoke-static {p0, v2}, La/cpv0;->e(Landroid/content/Context;La/wsd;)V

    .line 45
    .line 46
    .line 47
    invoke-static {p0}, La/cpv0;->d(Landroid/content/Context;)La/cpv0;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    goto :goto_1

    .line 52
    :catchall_1
    move-exception p0

    .line 53
    goto :goto_3

    .line 54
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string v1, "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider."

    .line 57
    .line 58
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p0

    .line 62
    :cond_2
    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 63
    return-object v1

    .line 64
    :goto_2
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 65
    :try_start_4
    throw p0

    .line 66
    :goto_3
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 67
    throw p0
.end method

.method public static e(Landroid/content/Context;La/wsd;)V
    .locals 3

    .line 1
    sget-object v0, La/cpv0;->m:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, La/cpv0;->k:La/cpv0;

    .line 5
    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    sget-object v2, La/cpv0;->l:La/cpv0;

    .line 9
    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    const-string p1, "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :goto_0
    if-nez v1, :cond_3

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    sget-object v1, La/cpv0;->l:La/cpv0;

    .line 30
    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    invoke-static {p0, p1}, La/epv0;->P(Landroid/content/Context;La/wsd;)La/cpv0;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    sput-object v1, La/cpv0;->l:La/cpv0;

    .line 38
    .line 39
    :cond_2
    sput-object v1, La/cpv0;->k:La/cpv0;

    .line 40
    .line 41
    :cond_3
    monitor-exit v0

    .line 42
    return-void

    .line 43
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    throw p0
.end method


# virtual methods
.method public final a(La/lpv0;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v4

    .line 8
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    new-instance v0, La/qov0;

    .line 15
    .line 16
    sget-object v3, La/zko;->b:La/zko;

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v2, 0x0

    .line 20
    move-object v1, p0

    .line 21
    invoke-direct/range {v0 .. v5}, La/qov0;-><init>(La/cpv0;Ljava/lang/String;La/zko;Ljava/util/List;I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, La/qov0;->a()La/gqw0;

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    const-string p0, "enqueue needs at least one WorkRequest."

    .line 29
    .line 30
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final b(Ljava/lang/String;La/bg90;)La/gqw0;
    .locals 7

    .line 1
    sget-object v0, La/yko;->a:[La/yko;

    .line 2
    .line 3
    sget-object v0, La/yko;->a:[La/yko;

    .line 4
    .line 5
    sget-object v0, La/yko;->a:[La/yko;

    .line 6
    .line 7
    sget-object v4, La/zko;->a:La/zko;

    .line 8
    .line 9
    new-instance v1, La/qov0;

    .line 10
    .line 11
    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    const/4 v6, 0x0

    .line 16
    move-object v2, p0

    .line 17
    move-object v3, p1

    .line 18
    invoke-direct/range {v1 .. v6}, La/qov0;-><init>(La/cpv0;Ljava/lang/String;La/zko;Ljava/util/List;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, La/qov0;->a()La/gqw0;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public final c(Ljava/lang/String;La/zko;La/yl60;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    new-instance v0, La/qov0;

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    move-object v1, p0

    .line 15
    move-object v2, p1

    .line 16
    move-object v3, p2

    .line 17
    invoke-direct/range {v0 .. v5}, La/qov0;-><init>(La/cpv0;Ljava/lang/String;La/zko;Ljava/util/List;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, La/qov0;->a()La/gqw0;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final f()V
    .locals 2

    .line 1
    sget-object v0, La/cpv0;->m:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, La/cpv0;->h:Z

    .line 6
    .line 7
    iget-object v1, p0, La/cpv0;->i:Landroid/content/BroadcastReceiver$PendingResult;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iput-object v1, p0, La/cpv0;->i:Landroid/content/BroadcastReceiver$PendingResult;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    monitor-exit v0

    .line 21
    return-void

    .line 22
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw p0
.end method

.method public final g()V
    .locals 3

    .line 1
    iget-object v0, p0, La/cpv0;->b:La/wsd;

    .line 2
    .line 3
    iget-object v0, v0, La/wsd;->f:La/std;

    .line 4
    .line 5
    const-string v0, "ReschedulingWork"

    .line 6
    .line 7
    new-instance v1, La/jmv0;

    .line 8
    .line 9
    const/4 v2, 0x3

    .line 10
    invoke-direct {v1, p0, v2}, La/jmv0;-><init>(Ljava/lang/Object;B)V

    .line 11
    .line 12
    .line 13
    invoke-static {}, La/afn0;->w()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    :try_start_0
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    :goto_0
    invoke-virtual {v1}, La/jmv0;->invoke()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void

    .line 34
    :goto_1
    if-eqz p0, :cond_2

    .line 35
    .line 36
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 37
    .line 38
    .line 39
    :cond_2
    throw v0
.end method
