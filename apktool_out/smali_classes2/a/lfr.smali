.class public final La/lfr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/a4x0;La/r1x0;)V
    .locals 1

    const/16 v0, 0x1d

    iput-byte v0, p0, La/lfr;->a:B

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/lfr;->b:Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, La/lfr;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/b1x0;La/gpw0;)V
    .locals 1

    .line 1
    const/16 v0, 0x1b

    .line 2
    .line 3
    iput-byte v0, p0, La/lfr;->a:B

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, La/lfr;->b:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/lfr;->c:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(La/ig00;La/n5a;)V
    .locals 1

    const/16 v0, 0x11

    iput-byte v0, p0, La/lfr;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, La/lfr;->b:Ljava/lang/Object;

    .line 23
    iput-object p2, p0, La/lfr;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/qgi0;)V
    .locals 1

    const/16 v0, 0xf

    iput-byte v0, p0, La/lfr;->a:B

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/lfr;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 18
    iput-byte p3, p0, La/lfr;->a:B

    iput-object p1, p0, La/lfr;->b:Ljava/lang/Object;

    iput-object p2, p0, La/lfr;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ZB)V
    .locals 0

    .line 16
    iput-byte p4, p0, La/lfr;->a:B

    iput-object p1, p0, La/lfr;->c:Ljava/lang/Object;

    iput-object p2, p0, La/lfr;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;Ljava/util/List;Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;)V
    .locals 0

    const/4 p1, 0x5

    iput-byte p1, p0, La/lfr;->a:B

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/lfr;->b:Ljava/lang/Object;

    iput-object p3, p0, La/lfr;->c:Ljava/lang/Object;

    return-void
.end method

.method private final a()V
    .locals 2

    .line 1
    iget-object v0, p0, La/lfr;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/e6w0;

    .line 4
    .line 5
    iget-object v0, v0, La/e6w0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, La/lfr;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, La/e6w0;

    .line 11
    .line 12
    iget-object v1, v1, La/e6w0;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, La/yg60;

    .line 15
    .line 16
    iget-object p0, p0, La/lfr;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, La/u6w0;

    .line 19
    .line 20
    invoke-interface {v1, p0}, La/yg60;->onComplete(La/duo0;)V

    .line 21
    .line 22
    .line 23
    monitor-exit v0

    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    throw p0
.end method

.method private final b()V
    .locals 2

    .line 1
    iget-object v0, p0, La/lfr;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/e6w0;

    .line 4
    .line 5
    iget-object v0, v0, La/e6w0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, La/lfr;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, La/e6w0;

    .line 11
    .line 12
    iget-object v1, v1, La/e6w0;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, La/nh60;

    .line 15
    .line 16
    iget-object p0, p0, La/lfr;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, La/u6w0;

    .line 19
    .line 20
    invoke-virtual {p0}, La/u6w0;->c()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-interface {v1, p0}, La/nh60;->onSuccess(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    monitor-exit v0

    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    throw p0
.end method

.method private final c()V
    .locals 2

    .line 1
    iget-object v0, p0, La/lfr;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/os/IBinder;

    .line 4
    .line 5
    iget-object p0, p0, La/lfr;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/d6x0;

    .line 8
    .line 9
    monitor-enter p0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    :try_start_0
    const-string v0, "Null service connection"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, La/d6x0;->b(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    :try_start_1
    new-instance v1, La/fuj0;

    .line 22
    .line 23
    invoke-direct {v1, v0}, La/fuj0;-><init>(Landroid/os/IBinder;)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, La/d6x0;->c:La/fuj0;
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    .line 28
    const/4 v0, 0x2

    .line 29
    :try_start_2
    iput-byte v0, p0, La/d6x0;->a:B

    .line 30
    .line 31
    new-instance v0, La/myw0;

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    invoke-direct {v0, p0, v1}, La/myw0;-><init>(La/d6x0;B)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, La/d6x0;->f:La/sbx0;

    .line 38
    .line 39
    iget-object v1, v1, La/sbx0;->d:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Ljava/util/concurrent/ScheduledExecutorService;

    .line 42
    .line 43
    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 44
    .line 45
    .line 46
    monitor-exit p0

    .line 47
    return-void

    .line 48
    :catch_0
    move-exception v0

    .line 49
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p0, v0}, La/d6x0;->b(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    monitor-exit p0

    .line 57
    return-void

    .line 58
    :goto_0
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 59
    throw v0
.end method


# virtual methods
.method public d()V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    :try_start_0
    iget-object v2, p0, La/lfr;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v2, La/qgi0;

    .line 6
    .line 7
    iget-object v2, v2, La/qgi0;->b:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 10
    const/4 v3, 0x1

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    :try_start_1
    iget-object v0, p0, La/lfr;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, La/qgi0;

    .line 16
    .line 17
    iget v4, v0, La/qgi0;->c:I

    .line 18
    .line 19
    const/4 v5, 0x4

    .line 20
    if-ne v4, v5, :cond_0

    .line 21
    .line 22
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    :goto_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 30
    .line 31
    .line 32
    goto :goto_2

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    goto :goto_5

    .line 35
    :cond_0
    :try_start_2
    iget-wide v6, v0, La/qgi0;->d:J

    .line 36
    .line 37
    const-wide/16 v8, 0x1

    .line 38
    .line 39
    add-long/2addr v6, v8

    .line 40
    iput-wide v6, v0, La/qgi0;->d:J

    .line 41
    .line 42
    iput v5, v0, La/qgi0;->c:I

    .line 43
    .line 44
    move v0, v3

    .line 45
    :cond_1
    iget-object v4, p0, La/lfr;->c:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v4, La/qgi0;

    .line 48
    .line 49
    iget-object v4, v4, La/qgi0;->b:Ljava/util/ArrayDeque;

    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    check-cast v4, Ljava/lang/Runnable;

    .line 56
    .line 57
    iput-object v4, p0, La/lfr;->b:Ljava/lang/Object;

    .line 58
    .line 59
    if-nez v4, :cond_3

    .line 60
    .line 61
    iget-object p0, p0, La/lfr;->c:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p0, La/qgi0;

    .line 64
    .line 65
    iput v3, p0, La/qgi0;->c:I

    .line 66
    .line 67
    monitor-exit v2

    .line 68
    if-eqz v1, :cond_2

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    :goto_2
    return-void

    .line 72
    :cond_3
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 73
    :try_start_3
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 74
    .line 75
    .line 76
    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 77
    or-int/2addr v1, v2

    .line 78
    const/4 v2, 0x0

    .line 79
    :try_start_4
    iget-object v3, p0, La/lfr;->b:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v3, Ljava/lang/Runnable;

    .line 82
    .line 83
    invoke-interface {v3}, Ljava/lang/Runnable;->run()V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 84
    .line 85
    .line 86
    :goto_3
    :try_start_5
    iput-object v2, p0, La/lfr;->b:Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :catchall_1
    move-exception p0

    .line 90
    goto :goto_6

    .line 91
    :catchall_2
    move-exception v0

    .line 92
    goto :goto_4

    .line 93
    :catch_0
    move-exception v3

    .line 94
    :try_start_6
    sget-object v4, La/qgi0;->f:Ljava/util/logging/Logger;

    .line 95
    .line 96
    sget-object v5, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    .line 97
    .line 98
    new-instance v6, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    const-string v7, "Exception while executing runnable "

    .line 104
    .line 105
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget-object v7, p0, La/lfr;->b:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v7, Ljava/lang/Runnable;

    .line 111
    .line 112
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    invoke-virtual {v4, v5, v6, v3}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 120
    .line 121
    .line 122
    goto :goto_3

    .line 123
    :goto_4
    :try_start_7
    iput-object v2, p0, La/lfr;->b:Ljava/lang/Object;

    .line 124
    .line 125
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 126
    :goto_5
    :try_start_8
    monitor-exit v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 127
    :try_start_9
    throw p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 128
    :goto_6
    if-eqz v1, :cond_4

    .line 129
    .line 130
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 135
    .line 136
    .line 137
    :cond_4
    throw p0
.end method

.method public final run()V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-byte v0, v1, La/lfr;->a:B

    .line 4
    .line 5
    const/16 v2, 0x5c

    .line 6
    .line 7
    const/4 v3, 0x4

    .line 8
    const/4 v4, 0x3

    .line 9
    const-wide/16 v5, 0x0

    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v8, 0x0

    .line 13
    const/4 v9, 0x1

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget-object v0, v1, La/lfr;->c:Ljava/lang/Object;

    .line 18
    .line 19
    move-object v2, v0

    .line 20
    check-cast v2, La/a4x0;

    .line 21
    .line 22
    iget-object v3, v2, La/a4x0;->e:La/gtw0;

    .line 23
    .line 24
    iget-object v0, v2, La/p4;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, La/kxw0;

    .line 27
    .line 28
    if-nez v3, :cond_0

    .line 29
    .line 30
    iget-object v0, v0, La/kxw0;->f:La/uuw0;

    .line 31
    .line 32
    invoke-static {v0}, La/kxw0;->g(La/ryw0;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, v0, La/uuw0;->g:La/quw0;

    .line 36
    .line 37
    const-string v1, "Failed to send current screen to service"

    .line 38
    .line 39
    invoke-virtual {v0, v1}, La/quw0;->a(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_0
    :try_start_0
    iget-object v1, v1, La/lfr;->b:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, La/r1x0;

    .line 46
    .line 47
    if-nez v1, :cond_1

    .line 48
    .line 49
    iget-object v0, v0, La/kxw0;->a:Landroid/content/Context;

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v8

    .line 55
    const-wide/16 v4, 0x0

    .line 56
    .line 57
    const/4 v6, 0x0

    .line 58
    const/4 v7, 0x0

    .line 59
    invoke-interface/range {v3 .. v8}, La/gtw0;->p(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :catch_0
    move-exception v0

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    iget-wide v4, v1, La/r1x0;->c:J

    .line 66
    .line 67
    iget-object v6, v1, La/r1x0;->a:Ljava/lang/String;

    .line 68
    .line 69
    iget-object v7, v1, La/r1x0;->b:Ljava/lang/String;

    .line 70
    .line 71
    iget-object v0, v0, La/kxw0;->a:Landroid/content/Context;

    .line 72
    .line 73
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    invoke-interface/range {v3 .. v8}, La/gtw0;->p(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    :goto_0
    invoke-virtual {v2}, La/a4x0;->y1()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :goto_1
    iget-object v1, v2, La/p4;->b:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v1, La/kxw0;

    .line 87
    .line 88
    iget-object v1, v1, La/kxw0;->f:La/uuw0;

    .line 89
    .line 90
    invoke-static {v1}, La/kxw0;->g(La/ryw0;)V

    .line 91
    .line 92
    .line 93
    iget-object v1, v1, La/uuw0;->g:La/quw0;

    .line 94
    .line 95
    const-string v2, "Failed to send current screen to the service"

    .line 96
    .line 97
    invoke-virtual {v1, v0, v2}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    :goto_2
    return-void

    .line 101
    :pswitch_0
    iget-object v0, v1, La/lfr;->c:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, La/b1x0;

    .line 104
    .line 105
    iget-object v0, v0, La/p4;->b:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v0, La/kxw0;

    .line 108
    .line 109
    iget-object v2, v0, La/kxw0;->e:La/wvw0;

    .line 110
    .line 111
    iget-object v3, v0, La/kxw0;->f:La/uuw0;

    .line 112
    .line 113
    invoke-static {v2}, La/kxw0;->e(La/p4;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2}, La/p4;->m1()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2}, La/p4;->m1()V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, La/wvw0;->q1()Landroid/content/SharedPreferences;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    const-string v5, "dma_consent_settings"

    .line 127
    .line 128
    invoke-interface {v4, v5, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    invoke-static {v4}, La/jmw0;->b(Ljava/lang/String;)La/jmw0;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    iget-object v1, v1, La/lfr;->b:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v1, La/jmw0;

    .line 139
    .line 140
    iget v6, v1, La/jmw0;->a:I

    .line 141
    .line 142
    iget v4, v4, La/jmw0;->a:I

    .line 143
    .line 144
    invoke-static {v6, v4}, La/xyw0;->l(II)Z

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    if-eqz v4, :cond_3

    .line 149
    .line 150
    invoke-virtual {v2}, La/wvw0;->q1()Landroid/content/SharedPreferences;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    iget-object v4, v1, La/jmw0;->b:Ljava/lang/String;

    .line 159
    .line 160
    invoke-interface {v2, v5, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 161
    .line 162
    .line 163
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 164
    .line 165
    .line 166
    invoke-static {v3}, La/kxw0;->g(La/ryw0;)V

    .line 167
    .line 168
    .line 169
    iget-object v2, v3, La/uuw0;->o:La/quw0;

    .line 170
    .line 171
    const-string v3, "Setting DMA consent(FE)"

    .line 172
    .line 173
    invoke-virtual {v2, v1, v3}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0}, La/kxw0;->i()La/a4x0;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    invoke-virtual {v1}, La/a4x0;->v1()Z

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    if-eqz v1, :cond_2

    .line 185
    .line 186
    invoke-virtual {v0}, La/kxw0;->i()La/a4x0;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-virtual {v0}, La/zrw0;->m1()V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0}, La/etw0;->n1()V

    .line 194
    .line 195
    .line 196
    new-instance v1, La/r3x0;

    .line 197
    .line 198
    invoke-direct {v1, v0, v9}, La/r3x0;-><init>(La/a4x0;B)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0, v1}, La/a4x0;->z1(Ljava/lang/Runnable;)V

    .line 202
    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_2
    invoke-virtual {v0}, La/kxw0;->i()La/a4x0;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {v0}, La/zrw0;->m1()V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0}, La/etw0;->n1()V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0}, La/a4x0;->u1()Z

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    if-eqz v1, :cond_4

    .line 220
    .line 221
    invoke-virtual {v0, v8}, La/a4x0;->B1(Z)Lcom/google/android/gms/measurement/internal/zzr;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    new-instance v2, La/t2x0;

    .line 226
    .line 227
    invoke-direct {v2, v0, v1, v9}, La/t2x0;-><init>(La/a4x0;Lcom/google/android/gms/measurement/internal/zzr;B)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0, v2}, La/a4x0;->z1(Ljava/lang/Runnable;)V

    .line 231
    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_3
    invoke-static {v3}, La/kxw0;->g(La/ryw0;)V

    .line 235
    .line 236
    .line 237
    iget-object v0, v3, La/uuw0;->m:La/quw0;

    .line 238
    .line 239
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    const-string v2, "Lower precedence consent source ignored, proposed source"

    .line 244
    .line 245
    invoke-virtual {v0, v1, v2}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    :cond_4
    :goto_3
    return-void

    .line 249
    :pswitch_1
    iget-object v0, v1, La/lfr;->b:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v0, La/gpw0;

    .line 252
    .line 253
    iget-object v1, v1, La/lfr;->c:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v1, La/b1x0;

    .line 256
    .line 257
    iget-object v2, v1, La/p4;->b:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v2, La/kxw0;

    .line 260
    .line 261
    iget-object v2, v2, La/kxw0;->h:La/w4x0;

    .line 262
    .line 263
    invoke-static {v2}, La/kxw0;->f(La/etw0;)V

    .line 264
    .line 265
    .line 266
    iget-object v2, v2, La/p4;->b:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v2, La/kxw0;

    .line 269
    .line 270
    iget-object v3, v2, La/kxw0;->e:La/wvw0;

    .line 271
    .line 272
    iget-object v4, v2, La/kxw0;->e:La/wvw0;

    .line 273
    .line 274
    invoke-static {v3}, La/kxw0;->e(La/p4;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v3}, La/wvw0;->t1()La/xyw0;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    sget-object v8, La/wyw0;->c:La/wyw0;

    .line 282
    .line 283
    invoke-virtual {v3, v8}, La/xyw0;->i(La/wyw0;)Z

    .line 284
    .line 285
    .line 286
    move-result v3

    .line 287
    if-nez v3, :cond_6

    .line 288
    .line 289
    iget-object v2, v2, La/kxw0;->f:La/uuw0;

    .line 290
    .line 291
    invoke-static {v2}, La/kxw0;->g(La/ryw0;)V

    .line 292
    .line 293
    .line 294
    iget-object v2, v2, La/uuw0;->l:La/quw0;

    .line 295
    .line 296
    const-string v3, "Analytics storage consent denied; will not get session id"

    .line 297
    .line 298
    invoke-virtual {v2, v3}, La/quw0;->a(Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    :cond_5
    :goto_4
    move-object v2, v7

    .line 302
    goto :goto_5

    .line 303
    :cond_6
    invoke-static {v4}, La/kxw0;->e(La/p4;)V

    .line 304
    .line 305
    .line 306
    iget-object v2, v2, La/kxw0;->k:La/lwf;

    .line 307
    .line 308
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 312
    .line 313
    .line 314
    move-result-wide v2

    .line 315
    invoke-virtual {v4, v2, v3}, La/wvw0;->v1(J)Z

    .line 316
    .line 317
    .line 318
    move-result v2

    .line 319
    if-nez v2, :cond_5

    .line 320
    .line 321
    invoke-static {v4}, La/kxw0;->e(La/p4;)V

    .line 322
    .line 323
    .line 324
    iget-object v2, v4, La/wvw0;->r:La/rvw0;

    .line 325
    .line 326
    invoke-virtual {v2}, La/rvw0;->a()J

    .line 327
    .line 328
    .line 329
    move-result-wide v2

    .line 330
    cmp-long v2, v2, v5

    .line 331
    .line 332
    if-nez v2, :cond_7

    .line 333
    .line 334
    goto :goto_4

    .line 335
    :cond_7
    invoke-static {v4}, La/kxw0;->e(La/p4;)V

    .line 336
    .line 337
    .line 338
    iget-object v2, v4, La/wvw0;->r:La/rvw0;

    .line 339
    .line 340
    invoke-virtual {v2}, La/rvw0;->a()J

    .line 341
    .line 342
    .line 343
    move-result-wide v2

    .line 344
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    :goto_5
    if-eqz v2, :cond_8

    .line 349
    .line 350
    iget-object v1, v1, La/p4;->b:Ljava/lang/Object;

    .line 351
    .line 352
    check-cast v1, La/kxw0;

    .line 353
    .line 354
    iget-object v1, v1, La/kxw0;->i:La/x6x0;

    .line 355
    .line 356
    invoke-static {v1}, La/kxw0;->e(La/p4;)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 360
    .line 361
    .line 362
    move-result-wide v2

    .line 363
    invoke-virtual {v1, v0, v2, v3}, La/x6x0;->a2(La/gpw0;J)V

    .line 364
    .line 365
    .line 366
    goto :goto_6

    .line 367
    :cond_8
    :try_start_1
    invoke-interface {v0, v7}, La/gpw0;->u(Landroid/os/Bundle;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 368
    .line 369
    .line 370
    goto :goto_6

    .line 371
    :catch_1
    move-exception v0

    .line 372
    iget-object v1, v1, La/p4;->b:Ljava/lang/Object;

    .line 373
    .line 374
    check-cast v1, La/kxw0;

    .line 375
    .line 376
    iget-object v1, v1, La/kxw0;->f:La/uuw0;

    .line 377
    .line 378
    invoke-static {v1}, La/kxw0;->g(La/ryw0;)V

    .line 379
    .line 380
    .line 381
    iget-object v1, v1, La/uuw0;->g:La/quw0;

    .line 382
    .line 383
    const-string v2, "getSessionId failed with exception"

    .line 384
    .line 385
    invoke-virtual {v1, v0, v2}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    :goto_6
    return-void

    .line 389
    :pswitch_2
    invoke-direct {v1}, La/lfr;->c()V

    .line 390
    .line 391
    .line 392
    return-void

    .line 393
    :pswitch_3
    iget-object v0, v1, La/lfr;->c:Ljava/lang/Object;

    .line 394
    .line 395
    check-cast v0, La/oyw0;

    .line 396
    .line 397
    iget-object v0, v0, La/oyw0;->a:La/m6x0;

    .line 398
    .line 399
    invoke-virtual {v0}, La/m6x0;->V()V

    .line 400
    .line 401
    .line 402
    iget-object v1, v1, La/lfr;->b:Ljava/lang/Object;

    .line 403
    .line 404
    check-cast v1, Lcom/google/android/gms/measurement/internal/zzah;

    .line 405
    .line 406
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/zzah;->c:Lcom/google/android/gms/measurement/internal/zzpl;

    .line 407
    .line 408
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzpl;->m()Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    if-nez v2, :cond_9

    .line 413
    .line 414
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/zzah;->a:Ljava/lang/String;

    .line 418
    .line 419
    invoke-static {v2}, La/s0x;->H(Ljava/lang/Object;)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {v0, v2}, La/m6x0;->P(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzr;

    .line 423
    .line 424
    .line 425
    move-result-object v2

    .line 426
    if-eqz v2, :cond_a

    .line 427
    .line 428
    invoke-virtual {v0, v1, v2}, La/m6x0;->a0(Lcom/google/android/gms/measurement/internal/zzah;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 429
    .line 430
    .line 431
    goto :goto_7

    .line 432
    :cond_9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 433
    .line 434
    .line 435
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/zzah;->a:Ljava/lang/String;

    .line 436
    .line 437
    invoke-static {v2}, La/s0x;->H(Ljava/lang/Object;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v0, v2}, La/m6x0;->P(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzr;

    .line 441
    .line 442
    .line 443
    move-result-object v2

    .line 444
    if-eqz v2, :cond_a

    .line 445
    .line 446
    invoke-virtual {v0, v1, v2}, La/m6x0;->Z(Lcom/google/android/gms/measurement/internal/zzah;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 447
    .line 448
    .line 449
    :cond_a
    :goto_7
    return-void

    .line 450
    :pswitch_4
    iget-object v0, v1, La/lfr;->c:Ljava/lang/Object;

    .line 451
    .line 452
    check-cast v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    .line 453
    .line 454
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:La/kxw0;

    .line 455
    .line 456
    invoke-virtual {v0}, La/kxw0;->i()La/a4x0;

    .line 457
    .line 458
    .line 459
    move-result-object v2

    .line 460
    iget-object v0, v1, La/lfr;->b:Ljava/lang/Object;

    .line 461
    .line 462
    move-object v4, v0

    .line 463
    check-cast v4, La/gpw0;

    .line 464
    .line 465
    invoke-virtual {v2}, La/zrw0;->m1()V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v2}, La/etw0;->n1()V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v2, v8}, La/a4x0;->B1(Z)Lcom/google/android/gms/measurement/internal/zzr;

    .line 472
    .line 473
    .line 474
    move-result-object v3

    .line 475
    new-instance v1, La/hf5;

    .line 476
    .line 477
    const/16 v6, 0x14

    .line 478
    .line 479
    const/4 v5, 0x0

    .line 480
    invoke-direct/range {v1 .. v6}, La/hf5;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZB)V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v2, v1}, La/a4x0;->z1(Ljava/lang/Runnable;)V

    .line 484
    .line 485
    .line 486
    return-void

    .line 487
    :pswitch_5
    iget-object v0, v1, La/lfr;->b:Ljava/lang/Object;

    .line 488
    .line 489
    check-cast v0, La/syw0;

    .line 490
    .line 491
    invoke-interface {v0}, La/syw0;->p()La/svs0;

    .line 492
    .line 493
    .line 494
    invoke-static {}, La/svs0;->e()Z

    .line 495
    .line 496
    .line 497
    move-result v2

    .line 498
    if-eqz v2, :cond_b

    .line 499
    .line 500
    invoke-interface {v0}, La/syw0;->J()La/fxw0;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    invoke-virtual {v0, v1}, La/fxw0;->v1(Ljava/lang/Runnable;)V

    .line 505
    .line 506
    .line 507
    goto :goto_8

    .line 508
    :cond_b
    iget-object v0, v1, La/lfr;->c:Ljava/lang/Object;

    .line 509
    .line 510
    check-cast v0, La/bmw0;

    .line 511
    .line 512
    iget-wide v1, v0, La/bmw0;->c:J

    .line 513
    .line 514
    cmp-long v1, v1, v5

    .line 515
    .line 516
    if-eqz v1, :cond_c

    .line 517
    .line 518
    move v8, v9

    .line 519
    :cond_c
    iput-wide v5, v0, La/bmw0;->c:J

    .line 520
    .line 521
    if-eqz v8, :cond_d

    .line 522
    .line 523
    invoke-virtual {v0}, La/bmw0;->a()V

    .line 524
    .line 525
    .line 526
    :cond_d
    :goto_8
    return-void

    .line 527
    :pswitch_6
    iget-object v0, v1, La/lfr;->c:Ljava/lang/Object;

    .line 528
    .line 529
    check-cast v0, La/r9w0;

    .line 530
    .line 531
    iget-object v1, v1, La/lfr;->b:Ljava/lang/Object;

    .line 532
    .line 533
    check-cast v1, Lcom/google/android/gms/signin/internal/zak;

    .line 534
    .line 535
    iget-object v2, v1, Lcom/google/android/gms/signin/internal/zak;->b:Lcom/google/android/gms/common/ConnectionResult;

    .line 536
    .line 537
    iget v5, v2, Lcom/google/android/gms/common/ConnectionResult;->b:I

    .line 538
    .line 539
    if-nez v5, :cond_13

    .line 540
    .line 541
    iget-object v1, v1, Lcom/google/android/gms/signin/internal/zak;->c:Lcom/google/android/gms/common/internal/zaaa;

    .line 542
    .line 543
    invoke-static {v1}, La/s0x;->H(Ljava/lang/Object;)V

    .line 544
    .line 545
    .line 546
    iget-object v2, v1, Lcom/google/android/gms/common/internal/zaaa;->c:Lcom/google/android/gms/common/ConnectionResult;

    .line 547
    .line 548
    iget v5, v2, Lcom/google/android/gms/common/ConnectionResult;->b:I

    .line 549
    .line 550
    if-nez v5, :cond_12

    .line 551
    .line 552
    iget-object v2, v0, La/r9w0;->m:La/qaj;

    .line 553
    .line 554
    iget-object v1, v1, Lcom/google/android/gms/common/internal/zaaa;->b:Landroid/os/IBinder;

    .line 555
    .line 556
    if-nez v1, :cond_e

    .line 557
    .line 558
    move-object v6, v7

    .line 559
    goto :goto_9

    .line 560
    :cond_e
    sget v5, La/fc;->b:I

    .line 561
    .line 562
    const-string v5, "com.google.android.gms.common.internal.IAccountAccessor"

    .line 563
    .line 564
    invoke-interface {v1, v5}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 565
    .line 566
    .line 567
    move-result-object v6

    .line 568
    instance-of v8, v6, La/guw;

    .line 569
    .line 570
    if-eqz v8, :cond_f

    .line 571
    .line 572
    check-cast v6, La/guw;

    .line 573
    .line 574
    goto :goto_9

    .line 575
    :cond_f
    new-instance v6, La/s9x0;

    .line 576
    .line 577
    invoke-direct {v6, v1, v5, v4}, La/y4w0;-><init>(Landroid/os/IBinder;Ljava/lang/String;B)V

    .line 578
    .line 579
    .line 580
    :goto_9
    iget-object v1, v0, La/r9w0;->e:Ljava/util/Set;

    .line 581
    .line 582
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 583
    .line 584
    .line 585
    if-eqz v6, :cond_11

    .line 586
    .line 587
    if-nez v1, :cond_10

    .line 588
    .line 589
    goto :goto_a

    .line 590
    :cond_10
    iput-object v6, v2, La/qaj;->d:Ljava/lang/Object;

    .line 591
    .line 592
    iput-object v1, v2, La/qaj;->e:Ljava/lang/Object;

    .line 593
    .line 594
    iget-boolean v3, v2, La/qaj;->a:Z

    .line 595
    .line 596
    if-eqz v3, :cond_14

    .line 597
    .line 598
    iget-object v2, v2, La/qaj;->c:Ljava/lang/Object;

    .line 599
    .line 600
    check-cast v2, La/b9v;

    .line 601
    .line 602
    check-cast v2, La/hz5;

    .line 603
    .line 604
    invoke-virtual {v2, v6, v1}, La/hz5;->j(La/guw;Ljava/util/Set;)V

    .line 605
    .line 606
    .line 607
    goto :goto_b

    .line 608
    :cond_11
    :goto_a
    new-instance v1, Ljava/lang/Exception;

    .line 609
    .line 610
    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    .line 611
    .line 612
    .line 613
    const-string v4, "GoogleApiManager"

    .line 614
    .line 615
    const-string v5, "Received null response from onSignInSuccess"

    .line 616
    .line 617
    invoke-static {v4, v5, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 618
    .line 619
    .line 620
    new-instance v1, Lcom/google/android/gms/common/ConnectionResult;

    .line 621
    .line 622
    invoke-direct {v1, v3, v7, v7}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 623
    .line 624
    .line 625
    invoke-virtual {v2, v1}, La/qaj;->l(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 626
    .line 627
    .line 628
    goto :goto_b

    .line 629
    :cond_12
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v1

    .line 633
    new-instance v3, Ljava/lang/Exception;

    .line 634
    .line 635
    invoke-direct {v3}, Ljava/lang/Exception;-><init>()V

    .line 636
    .line 637
    .line 638
    const-string v4, "Sign-in succeeded with resolve account failure: "

    .line 639
    .line 640
    const-string v5, "SignInCoordinator"

    .line 641
    .line 642
    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    move-result-object v1

    .line 646
    invoke-static {v5, v1, v3}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 647
    .line 648
    .line 649
    iget-object v1, v0, La/r9w0;->m:La/qaj;

    .line 650
    .line 651
    invoke-virtual {v1, v2}, La/qaj;->l(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 652
    .line 653
    .line 654
    iget-object v0, v0, La/r9w0;->l:La/buj0;

    .line 655
    .line 656
    invoke-virtual {v0}, La/hz5;->c()V

    .line 657
    .line 658
    .line 659
    goto :goto_c

    .line 660
    :cond_13
    iget-object v1, v0, La/r9w0;->m:La/qaj;

    .line 661
    .line 662
    invoke-virtual {v1, v2}, La/qaj;->l(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 663
    .line 664
    .line 665
    :cond_14
    :goto_b
    iget-object v0, v0, La/r9w0;->l:La/buj0;

    .line 666
    .line 667
    invoke-virtual {v0}, La/hz5;->c()V

    .line 668
    .line 669
    .line 670
    :goto_c
    return-void

    .line 671
    :pswitch_7
    iget-object v0, v1, La/lfr;->b:Ljava/lang/Object;

    .line 672
    .line 673
    check-cast v0, Lcom/google/android/gms/common/ConnectionResult;

    .line 674
    .line 675
    iget-object v1, v1, La/lfr;->c:Ljava/lang/Object;

    .line 676
    .line 677
    check-cast v1, La/qaj;

    .line 678
    .line 679
    iget-object v2, v1, La/qaj;->f:Ljava/lang/Object;

    .line 680
    .line 681
    check-cast v2, La/sav;

    .line 682
    .line 683
    iget-object v3, v1, La/qaj;->c:Ljava/lang/Object;

    .line 684
    .line 685
    check-cast v3, La/b9v;

    .line 686
    .line 687
    iget-object v2, v2, La/sav;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 688
    .line 689
    iget-object v4, v1, La/qaj;->b:Ljava/lang/Object;

    .line 690
    .line 691
    check-cast v4, La/ua3;

    .line 692
    .line 693
    invoke-virtual {v2, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 694
    .line 695
    .line 696
    move-result-object v2

    .line 697
    check-cast v2, La/h9w0;

    .line 698
    .line 699
    if-nez v2, :cond_15

    .line 700
    .line 701
    goto :goto_e

    .line 702
    :cond_15
    iget v4, v0, Lcom/google/android/gms/common/ConnectionResult;->b:I

    .line 703
    .line 704
    if-nez v4, :cond_18

    .line 705
    .line 706
    iput-boolean v9, v1, La/qaj;->a:Z

    .line 707
    .line 708
    invoke-virtual {v3}, La/hz5;->r()Z

    .line 709
    .line 710
    .line 711
    move-result v0

    .line 712
    if-nez v0, :cond_17

    .line 713
    .line 714
    :try_start_2
    invoke-virtual {v3}, La/hz5;->r()Z

    .line 715
    .line 716
    .line 717
    move-result v0

    .line 718
    if-eqz v0, :cond_16

    .line 719
    .line 720
    iget-object v0, v3, La/b9v;->z:Ljava/util/Set;

    .line 721
    .line 722
    goto :goto_d

    .line 723
    :cond_16
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 724
    .line 725
    :goto_d
    move-object v1, v3

    .line 726
    check-cast v1, La/hz5;

    .line 727
    .line 728
    invoke-virtual {v1, v7, v0}, La/hz5;->j(La/guw;Ljava/util/Set;)V
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_2

    .line 729
    .line 730
    .line 731
    goto :goto_e

    .line 732
    :catch_2
    move-exception v0

    .line 733
    const-string v1, "GoogleApiManager"

    .line 734
    .line 735
    const-string v4, "Failed to get service from broker. "

    .line 736
    .line 737
    invoke-static {v1, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 738
    .line 739
    .line 740
    const-string v0, "Failed to get service from broker."

    .line 741
    .line 742
    check-cast v3, La/hz5;

    .line 743
    .line 744
    invoke-virtual {v3, v0}, La/hz5;->d(Ljava/lang/String;)V

    .line 745
    .line 746
    .line 747
    new-instance v0, Lcom/google/android/gms/common/ConnectionResult;

    .line 748
    .line 749
    const/16 v1, 0xa

    .line 750
    .line 751
    invoke-direct {v0, v1, v7, v7}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 752
    .line 753
    .line 754
    invoke-virtual {v2, v0, v7}, La/h9w0;->m(Lcom/google/android/gms/common/ConnectionResult;Ljava/lang/RuntimeException;)V

    .line 755
    .line 756
    .line 757
    goto :goto_e

    .line 758
    :cond_17
    iget-boolean v0, v1, La/qaj;->a:Z

    .line 759
    .line 760
    if-eqz v0, :cond_19

    .line 761
    .line 762
    iget-object v0, v1, La/qaj;->d:Ljava/lang/Object;

    .line 763
    .line 764
    check-cast v0, La/guw;

    .line 765
    .line 766
    if-eqz v0, :cond_19

    .line 767
    .line 768
    iget-object v1, v1, La/qaj;->e:Ljava/lang/Object;

    .line 769
    .line 770
    check-cast v1, Ljava/util/Set;

    .line 771
    .line 772
    check-cast v3, La/hz5;

    .line 773
    .line 774
    invoke-virtual {v3, v0, v1}, La/hz5;->j(La/guw;Ljava/util/Set;)V

    .line 775
    .line 776
    .line 777
    goto :goto_e

    .line 778
    :cond_18
    invoke-virtual {v2, v0, v7}, La/h9w0;->m(Lcom/google/android/gms/common/ConnectionResult;Ljava/lang/RuntimeException;)V

    .line 779
    .line 780
    .line 781
    :cond_19
    :goto_e
    return-void

    .line 782
    :pswitch_8
    invoke-direct {v1}, La/lfr;->b()V

    .line 783
    .line 784
    .line 785
    return-void

    .line 786
    :pswitch_9
    invoke-direct {v1}, La/lfr;->a()V

    .line 787
    .line 788
    .line 789
    return-void

    .line 790
    :pswitch_a
    iget-object v0, v1, La/lfr;->b:Ljava/lang/Object;

    .line 791
    .line 792
    check-cast v0, La/glz;

    .line 793
    .line 794
    iget-object v1, v1, La/lfr;->c:Ljava/lang/Object;

    .line 795
    .line 796
    check-cast v1, La/kov0;

    .line 797
    .line 798
    invoke-virtual {v0, v1}, La/glz;->a(La/blz;)V

    .line 799
    .line 800
    .line 801
    return-void

    .line 802
    :pswitch_b
    iget-object v0, v1, La/lfr;->b:Ljava/lang/Object;

    .line 803
    .line 804
    check-cast v0, La/ig00;

    .line 805
    .line 806
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isCancelled()Z

    .line 807
    .line 808
    .line 809
    move-result v2

    .line 810
    iget-object v1, v1, La/lfr;->c:Ljava/lang/Object;

    .line 811
    .line 812
    check-cast v1, La/n5a;

    .line 813
    .line 814
    if-eqz v2, :cond_1a

    .line 815
    .line 816
    invoke-virtual {v1, v7}, La/n5a;->h(Ljava/lang/Throwable;)Z

    .line 817
    .line 818
    .line 819
    goto :goto_11

    .line 820
    :cond_1a
    :try_start_3
    sget-object v2, La/j0g0;->b:La/e0g0;
    :try_end_3
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_3 .. :try_end_3} :catch_3

    .line 821
    .line 822
    :goto_f
    :try_start_4
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 823
    .line 824
    .line 825
    move-result-object v0
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 826
    if-eqz v8, :cond_1b

    .line 827
    .line 828
    :try_start_5
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 829
    .line 830
    .line 831
    move-result-object v2

    .line 832
    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    .line 833
    .line 834
    .line 835
    :cond_1b
    invoke-virtual {v1, v0}, La/n5a;->resumeWith(Ljava/lang/Object;)V

    .line 836
    .line 837
    .line 838
    goto :goto_11

    .line 839
    :catch_3
    move-exception v0

    .line 840
    goto :goto_10

    .line 841
    :catchall_0
    move-exception v0

    .line 842
    if-eqz v8, :cond_1c

    .line 843
    .line 844
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 845
    .line 846
    .line 847
    move-result-object v2

    .line 848
    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    .line 849
    .line 850
    .line 851
    :cond_1c
    throw v0
    :try_end_5
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_5 .. :try_end_5} :catch_3

    .line 852
    :catch_4
    move v8, v9

    .line 853
    goto :goto_f

    .line 854
    :goto_10
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 855
    .line 856
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 857
    .line 858
    .line 859
    move-result-object v0

    .line 860
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 861
    .line 862
    .line 863
    new-instance v2, La/g0g0;

    .line 864
    .line 865
    invoke-direct {v2, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 866
    .line 867
    .line 868
    invoke-virtual {v1, v2}, La/n5a;->resumeWith(Ljava/lang/Object;)V

    .line 869
    .line 870
    .line 871
    :goto_11
    return-void

    .line 872
    :pswitch_c
    iget-object v0, v1, La/lfr;->c:Ljava/lang/Object;

    .line 873
    .line 874
    check-cast v0, La/o9o0;

    .line 875
    .line 876
    iget-object v0, v0, La/o9o0;->a:La/cpv0;

    .line 877
    .line 878
    iget-object v0, v0, La/cpv0;->f:La/ezb0;

    .line 879
    .line 880
    iget-object v2, v1, La/lfr;->b:Ljava/lang/Object;

    .line 881
    .line 882
    check-cast v2, Ljava/lang/String;

    .line 883
    .line 884
    iget-object v3, v0, La/ezb0;->k:Ljava/lang/Object;

    .line 885
    .line 886
    monitor-enter v3

    .line 887
    :try_start_6
    invoke-virtual {v0, v2}, La/ezb0;->c(Ljava/lang/String;)La/nqv0;

    .line 888
    .line 889
    .line 890
    move-result-object v0

    .line 891
    if-eqz v0, :cond_1d

    .line 892
    .line 893
    iget-object v7, v0, La/nqv0;->a:La/ppv0;

    .line 894
    .line 895
    monitor-exit v3

    .line 896
    goto :goto_12

    .line 897
    :catchall_1
    move-exception v0

    .line 898
    goto :goto_14

    .line 899
    :cond_1d
    monitor-exit v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 900
    :goto_12
    if-eqz v7, :cond_1e

    .line 901
    .line 902
    sget-object v0, La/o4e;->j:La/o4e;

    .line 903
    .line 904
    iget-object v2, v7, La/ppv0;->j:La/o4e;

    .line 905
    .line 906
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 907
    .line 908
    .line 909
    move-result v0

    .line 910
    if-nez v0, :cond_1e

    .line 911
    .line 912
    iget-object v0, v1, La/lfr;->c:Ljava/lang/Object;

    .line 913
    .line 914
    check-cast v0, La/o9o0;

    .line 915
    .line 916
    iget-object v2, v0, La/o9o0;->c:Ljava/lang/Object;

    .line 917
    .line 918
    monitor-enter v2

    .line 919
    :try_start_7
    iget-object v0, v1, La/lfr;->c:Ljava/lang/Object;

    .line 920
    .line 921
    check-cast v0, La/o9o0;

    .line 922
    .line 923
    iget-object v0, v0, La/o9o0;->f:Ljava/util/HashMap;

    .line 924
    .line 925
    invoke-static {v7}, La/jpm0;->k(La/ppv0;)La/xov0;

    .line 926
    .line 927
    .line 928
    move-result-object v3

    .line 929
    invoke-virtual {v0, v3, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 930
    .line 931
    .line 932
    iget-object v0, v1, La/lfr;->c:Ljava/lang/Object;

    .line 933
    .line 934
    check-cast v0, La/o9o0;

    .line 935
    .line 936
    iget-object v3, v0, La/o9o0;->h:La/zas0;

    .line 937
    .line 938
    iget-object v4, v0, La/o9o0;->b:La/fpv0;

    .line 939
    .line 940
    iget-object v4, v4, La/fpv0;->b:La/lne;

    .line 941
    .line 942
    invoke-static {v3, v7, v4, v0}, La/pov0;->a(La/zas0;La/ppv0;La/lne;La/ah60;)La/c4m0;

    .line 943
    .line 944
    .line 945
    move-result-object v0

    .line 946
    iget-object v1, v1, La/lfr;->c:Ljava/lang/Object;

    .line 947
    .line 948
    check-cast v1, La/o9o0;

    .line 949
    .line 950
    iget-object v1, v1, La/o9o0;->g:Ljava/util/HashMap;

    .line 951
    .line 952
    invoke-static {v7}, La/jpm0;->k(La/ppv0;)La/xov0;

    .line 953
    .line 954
    .line 955
    move-result-object v3

    .line 956
    invoke-virtual {v1, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 957
    .line 958
    .line 959
    monitor-exit v2

    .line 960
    goto :goto_13

    .line 961
    :catchall_2
    move-exception v0

    .line 962
    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 963
    throw v0

    .line 964
    :cond_1e
    :goto_13
    return-void

    .line 965
    :goto_14
    :try_start_8
    monitor-exit v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 966
    throw v0

    .line 967
    :pswitch_d
    :try_start_9
    invoke-virtual {v1}, La/lfr;->d()V
    :try_end_9
    .catch Ljava/lang/Error; {:try_start_9 .. :try_end_9} :catch_5

    .line 968
    .line 969
    .line 970
    return-void

    .line 971
    :catch_5
    move-exception v0

    .line 972
    iget-object v2, v1, La/lfr;->c:Ljava/lang/Object;

    .line 973
    .line 974
    check-cast v2, La/qgi0;

    .line 975
    .line 976
    iget-object v2, v2, La/qgi0;->b:Ljava/util/ArrayDeque;

    .line 977
    .line 978
    monitor-enter v2

    .line 979
    :try_start_a
    iget-object v1, v1, La/lfr;->c:Ljava/lang/Object;

    .line 980
    .line 981
    check-cast v1, La/qgi0;

    .line 982
    .line 983
    iput v9, v1, La/qgi0;->c:I

    .line 984
    .line 985
    monitor-exit v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 986
    throw v0

    .line 987
    :catchall_3
    move-exception v0

    .line 988
    :try_start_b
    monitor-exit v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 989
    throw v0

    .line 990
    :pswitch_e
    iget-object v0, v1, La/lfr;->b:Ljava/lang/Object;

    .line 991
    .line 992
    check-cast v0, La/gjn;

    .line 993
    .line 994
    iget-object v1, v1, La/lfr;->c:Ljava/lang/Object;

    .line 995
    .line 996
    invoke-virtual {v0, v1}, La/gjn;->accept(Ljava/lang/Object;)V

    .line 997
    .line 998
    .line 999
    return-void

    .line 1000
    :pswitch_f
    iget-object v0, v1, La/lfr;->c:Ljava/lang/Object;

    .line 1001
    .line 1002
    check-cast v0, La/zh00;

    .line 1003
    .line 1004
    iget-object v2, v0, La/zh00;->c:Ljava/lang/Object;

    .line 1005
    .line 1006
    monitor-enter v2

    .line 1007
    :try_start_c
    iget-object v0, v1, La/lfr;->c:Ljava/lang/Object;

    .line 1008
    .line 1009
    check-cast v0, La/zh00;

    .line 1010
    .line 1011
    iget-object v0, v0, La/zh00;->d:La/svs0;

    .line 1012
    .line 1013
    iget-object v3, v1, La/lfr;->b:Ljava/lang/Object;

    .line 1014
    .line 1015
    invoke-virtual {v0, v3}, La/svs0;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v0

    .line 1019
    iget-object v3, v1, La/lfr;->c:Ljava/lang/Object;

    .line 1020
    .line 1021
    check-cast v3, La/zh00;

    .line 1022
    .line 1023
    iget-object v4, v3, La/zh00;->a:Ljava/lang/Object;

    .line 1024
    .line 1025
    if-nez v4, :cond_1f

    .line 1026
    .line 1027
    if-eqz v0, :cond_1f

    .line 1028
    .line 1029
    iput-object v0, v3, La/zh00;->a:Ljava/lang/Object;

    .line 1030
    .line 1031
    iget-object v1, v3, La/zh00;->e:La/ro30;

    .line 1032
    .line 1033
    invoke-virtual {v1, v0}, La/wh00;->i(Ljava/lang/Object;)V

    .line 1034
    .line 1035
    .line 1036
    goto :goto_15

    .line 1037
    :catchall_4
    move-exception v0

    .line 1038
    goto :goto_16

    .line 1039
    :cond_1f
    if-eqz v4, :cond_20

    .line 1040
    .line 1041
    invoke-virtual {v4, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1042
    .line 1043
    .line 1044
    move-result v3

    .line 1045
    if-nez v3, :cond_20

    .line 1046
    .line 1047
    iget-object v1, v1, La/lfr;->c:Ljava/lang/Object;

    .line 1048
    .line 1049
    check-cast v1, La/zh00;

    .line 1050
    .line 1051
    iput-object v0, v1, La/zh00;->a:Ljava/lang/Object;

    .line 1052
    .line 1053
    iget-object v1, v1, La/zh00;->e:La/ro30;

    .line 1054
    .line 1055
    invoke-virtual {v1, v0}, La/wh00;->i(Ljava/lang/Object;)V

    .line 1056
    .line 1057
    .line 1058
    :cond_20
    :goto_15
    monitor-exit v2

    .line 1059
    return-void

    .line 1060
    :goto_16
    monitor-exit v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 1061
    throw v0

    .line 1062
    :pswitch_10
    iget-object v0, v1, La/lfr;->b:Ljava/lang/Object;

    .line 1063
    .line 1064
    check-cast v0, La/jry;

    .line 1065
    .line 1066
    invoke-static {v0}, La/pnx;->b(La/yje;)La/yje;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v0

    .line 1070
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 1071
    .line 1072
    iget-object v1, v1, La/lfr;->c:Ljava/lang/Object;

    .line 1073
    .line 1074
    check-cast v1, Ljava/lang/Throwable;

    .line 1075
    .line 1076
    invoke-static {v1}, La/z1x;->C(Ljava/lang/Throwable;)La/g0g0;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v1

    .line 1080
    invoke-interface {v0, v1}, La/yje;->resumeWith(Ljava/lang/Object;)V

    .line 1081
    .line 1082
    .line 1083
    return-void

    .line 1084
    :pswitch_11
    iget-object v0, v1, La/lfr;->c:Ljava/lang/Object;

    .line 1085
    .line 1086
    check-cast v0, La/e2k;

    .line 1087
    .line 1088
    iget-object v1, v0, La/e2k;->a:Landroid/widget/LinearLayout;

    .line 1089
    .line 1090
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 1091
    .line 1092
    .line 1093
    move-result v1

    .line 1094
    invoke-static {v2}, La/sj3;->X(I)I

    .line 1095
    .line 1096
    .line 1097
    move-result v2

    .line 1098
    sub-int/2addr v1, v2

    .line 1099
    iget-object v0, v0, La/e2k;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 1100
    .line 1101
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v2

    .line 1105
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v0

    .line 1109
    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 1110
    .line 1111
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    .line 1112
    .line 1113
    .line 1114
    move-result v0

    .line 1115
    iput v0, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 1116
    .line 1117
    return-void

    .line 1118
    :pswitch_12
    iget-object v0, v1, La/lfr;->c:Ljava/lang/Object;

    .line 1119
    .line 1120
    check-cast v0, La/c2k;

    .line 1121
    .line 1122
    iget-object v1, v0, La/c2k;->a:Landroid/widget/LinearLayout;

    .line 1123
    .line 1124
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 1125
    .line 1126
    .line 1127
    move-result v1

    .line 1128
    invoke-static {v2}, La/sj3;->X(I)I

    .line 1129
    .line 1130
    .line 1131
    move-result v2

    .line 1132
    sub-int/2addr v1, v2

    .line 1133
    iget-object v0, v0, La/c2k;->c:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 1134
    .line 1135
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v2

    .line 1139
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v3

    .line 1143
    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 1144
    .line 1145
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 1146
    .line 1147
    .line 1148
    move-result v3

    .line 1149
    iput v3, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 1150
    .line 1151
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v2

    .line 1155
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v0

    .line 1159
    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1160
    .line 1161
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    .line 1162
    .line 1163
    .line 1164
    move-result v0

    .line 1165
    iput v0, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1166
    .line 1167
    return-void

    .line 1168
    :pswitch_13
    iget-object v0, v1, La/lfr;->c:Ljava/lang/Object;

    .line 1169
    .line 1170
    check-cast v0, Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 1171
    .line 1172
    const/16 v1, 0x8

    .line 1173
    .line 1174
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 1175
    .line 1176
    .line 1177
    return-void

    .line 1178
    :pswitch_14
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v0

    .line 1182
    sget-object v2, La/xzj;->d:Ljava/lang/String;

    .line 1183
    .line 1184
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1185
    .line 1186
    const-string v4, "Scheduling work "

    .line 1187
    .line 1188
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1189
    .line 1190
    .line 1191
    iget-object v4, v1, La/lfr;->b:Ljava/lang/Object;

    .line 1192
    .line 1193
    check-cast v4, La/ppv0;

    .line 1194
    .line 1195
    iget-object v5, v4, La/ppv0;->a:Ljava/lang/String;

    .line 1196
    .line 1197
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1198
    .line 1199
    .line 1200
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v3

    .line 1204
    invoke-virtual {v0, v2, v3}, La/wv00;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1205
    .line 1206
    .line 1207
    iget-object v0, v1, La/lfr;->c:Ljava/lang/Object;

    .line 1208
    .line 1209
    check-cast v0, La/xzj;

    .line 1210
    .line 1211
    iget-object v0, v0, La/xzj;->a:La/ufv;

    .line 1212
    .line 1213
    filled-new-array {v4}, [La/ppv0;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v1

    .line 1217
    invoke-virtual {v0, v1}, La/ufv;->d([La/ppv0;)V

    .line 1218
    .line 1219
    .line 1220
    return-void

    .line 1221
    :pswitch_15
    iget-object v0, v1, La/lfr;->c:Ljava/lang/Object;

    .line 1222
    .line 1223
    move-object v2, v0

    .line 1224
    check-cast v2, La/kvj;

    .line 1225
    .line 1226
    iget-object v0, v1, La/lfr;->b:Ljava/lang/Object;

    .line 1227
    .line 1228
    check-cast v0, Ljava/util/ArrayList;

    .line 1229
    .line 1230
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v8

    .line 1234
    :cond_21
    :goto_17
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1235
    .line 1236
    .line 1237
    move-result v1

    .line 1238
    if-eqz v1, :cond_25

    .line 1239
    .line 1240
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v1

    .line 1244
    move-object v3, v1

    .line 1245
    check-cast v3, La/ivj;

    .line 1246
    .line 1247
    iget-object v9, v2, La/kvj;->r:Ljava/util/ArrayList;

    .line 1248
    .line 1249
    iget-short v1, v2, La/ehe0;->f:S

    .line 1250
    .line 1251
    int-to-long v10, v1

    .line 1252
    iget-object v1, v3, La/ivj;->a:La/xhe0;

    .line 1253
    .line 1254
    if-nez v1, :cond_22

    .line 1255
    .line 1256
    move-object v5, v7

    .line 1257
    goto :goto_18

    .line 1258
    :cond_22
    iget-object v1, v1, La/xhe0;->a:Landroid/view/View;

    .line 1259
    .line 1260
    move-object v5, v1

    .line 1261
    :goto_18
    iget-object v1, v3, La/ivj;->b:La/xhe0;

    .line 1262
    .line 1263
    if-eqz v1, :cond_23

    .line 1264
    .line 1265
    iget-object v1, v1, La/xhe0;->a:Landroid/view/View;

    .line 1266
    .line 1267
    move-object v12, v1

    .line 1268
    goto :goto_19

    .line 1269
    :cond_23
    move-object v12, v7

    .line 1270
    :goto_19
    const/4 v13, 0x0

    .line 1271
    if-eqz v5, :cond_24

    .line 1272
    .line 1273
    invoke-virtual {v5}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v1

    .line 1277
    invoke-virtual {v1, v10, v11}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 1278
    .line 1279
    .line 1280
    move-result-object v4

    .line 1281
    iget-object v1, v3, La/ivj;->a:La/xhe0;

    .line 1282
    .line 1283
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1284
    .line 1285
    .line 1286
    iget v1, v3, La/ivj;->e:I

    .line 1287
    .line 1288
    iget v6, v3, La/ivj;->c:I

    .line 1289
    .line 1290
    sub-int/2addr v1, v6

    .line 1291
    int-to-float v1, v1

    .line 1292
    invoke-virtual {v4, v1}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    .line 1293
    .line 1294
    .line 1295
    iget v1, v3, La/ivj;->f:I

    .line 1296
    .line 1297
    iget v6, v3, La/ivj;->d:I

    .line 1298
    .line 1299
    sub-int/2addr v1, v6

    .line 1300
    int-to-float v1, v1

    .line 1301
    invoke-virtual {v4, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 1302
    .line 1303
    .line 1304
    invoke-virtual {v4, v13}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v14

    .line 1308
    new-instance v1, La/hvj;

    .line 1309
    .line 1310
    const/4 v6, 0x0

    .line 1311
    invoke-direct/range {v1 .. v6}, La/hvj;-><init>(La/kvj;La/ivj;Landroid/view/ViewPropertyAnimator;Landroid/view/View;B)V

    .line 1312
    .line 1313
    .line 1314
    invoke-virtual {v14, v1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v1

    .line 1318
    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 1319
    .line 1320
    .line 1321
    :cond_24
    if-eqz v12, :cond_21

    .line 1322
    .line 1323
    invoke-virtual {v12}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v4

    .line 1327
    iget-object v1, v3, La/ivj;->b:La/xhe0;

    .line 1328
    .line 1329
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1330
    .line 1331
    .line 1332
    invoke-virtual {v4, v13}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v1

    .line 1336
    invoke-virtual {v1, v13}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v1

    .line 1340
    invoke-virtual {v1, v10, v11}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v1

    .line 1344
    const/high16 v5, 0x3f800000    # 1.0f

    .line 1345
    .line 1346
    invoke-virtual {v1, v5}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 1347
    .line 1348
    .line 1349
    move-result-object v9

    .line 1350
    new-instance v1, La/hvj;

    .line 1351
    .line 1352
    const/4 v6, 0x1

    .line 1353
    move-object v5, v12

    .line 1354
    invoke-direct/range {v1 .. v6}, La/hvj;-><init>(La/kvj;La/ivj;Landroid/view/ViewPropertyAnimator;Landroid/view/View;B)V

    .line 1355
    .line 1356
    .line 1357
    invoke-virtual {v9, v1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v1

    .line 1361
    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 1362
    .line 1363
    .line 1364
    goto/16 :goto_17

    .line 1365
    .line 1366
    :cond_25
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1367
    .line 1368
    .line 1369
    iget-object v1, v2, La/kvj;->n:Ljava/util/ArrayList;

    .line 1370
    .line 1371
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 1372
    .line 1373
    .line 1374
    return-void

    .line 1375
    :pswitch_16
    iget-object v0, v1, La/lfr;->b:Ljava/lang/Object;

    .line 1376
    .line 1377
    check-cast v0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakGameView;

    .line 1378
    .line 1379
    invoke-static {v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakGameView;->u(Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakGameView;)La/m1o0;

    .line 1380
    .line 1381
    .line 1382
    move-result-object v0

    .line 1383
    iget-object v0, v0, La/m1o0;->h:Landroid/widget/TextView;

    .line 1384
    .line 1385
    iget-object v1, v1, La/lfr;->c:Ljava/lang/Object;

    .line 1386
    .line 1387
    check-cast v1, La/qng;

    .line 1388
    .line 1389
    iget-object v1, v1, La/qng;->a:Ljava/lang/String;

    .line 1390
    .line 1391
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1392
    .line 1393
    .line 1394
    return-void

    .line 1395
    :pswitch_17
    iget-object v0, v1, La/lfr;->c:Ljava/lang/Object;

    .line 1396
    .line 1397
    check-cast v0, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;

    .line 1398
    .line 1399
    iget-object v2, v0, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;->v:Ljava/util/List;

    .line 1400
    .line 1401
    iget-object v5, v0, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;->q:La/vd7;

    .line 1402
    .line 1403
    iget-object v1, v1, La/lfr;->b:Ljava/lang/Object;

    .line 1404
    .line 1405
    check-cast v1, Ljava/util/List;

    .line 1406
    .line 1407
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1408
    .line 1409
    .line 1410
    move-result-object v1

    .line 1411
    move v6, v8

    .line 1412
    :goto_1a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1413
    .line 1414
    .line 1415
    move-result v10

    .line 1416
    if-eqz v10, :cond_28

    .line 1417
    .line 1418
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v10

    .line 1422
    add-int/lit8 v11, v6, 0x1

    .line 1423
    .line 1424
    if-ltz v6, :cond_27

    .line 1425
    .line 1426
    check-cast v10, La/cha;

    .line 1427
    .line 1428
    new-instance v12, Landroid/animation/AnimatorSet;

    .line 1429
    .line 1430
    invoke-direct {v12}, Landroid/animation/AnimatorSet;-><init>()V

    .line 1431
    .line 1432
    .line 1433
    iget-boolean v13, v10, La/cha;->b:Z

    .line 1434
    .line 1435
    iget v10, v10, La/cha;->a:I

    .line 1436
    .line 1437
    iget-object v14, v0, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;->s:Ljava/util/List;

    .line 1438
    .line 1439
    const/4 v15, 0x2

    .line 1440
    if-eqz v13, :cond_26

    .line 1441
    .line 1442
    invoke-interface {v14, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1443
    .line 1444
    .line 1445
    move-result-object v13

    .line 1446
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1447
    .line 1448
    .line 1449
    check-cast v13, Landroid/widget/ImageView;

    .line 1450
    .line 1451
    sget-object v14, Landroid/view/ViewGroup;->ALPHA:Landroid/util/Property;

    .line 1452
    .line 1453
    move/from16 v16, v4

    .line 1454
    .line 1455
    new-array v4, v15, [F

    .line 1456
    .line 1457
    fill-array-data v4, :array_0

    .line 1458
    .line 1459
    .line 1460
    invoke-static {v13, v14, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v4

    .line 1464
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1465
    .line 1466
    .line 1467
    new-instance v14, La/jha;

    .line 1468
    .line 1469
    invoke-direct {v14, v13, v0, v10}, La/jha;-><init>(Landroid/widget/ImageView;Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;I)V

    .line 1470
    .line 1471
    .line 1472
    invoke-virtual {v4, v14}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 1473
    .line 1474
    .line 1475
    iget-object v10, v5, La/vd7;->c:Landroid/view/View;

    .line 1476
    .line 1477
    check-cast v10, Landroid/widget/ImageView;

    .line 1478
    .line 1479
    sget-object v13, Landroid/view/ViewGroup;->TRANSLATION_Y:Landroid/util/Property;

    .line 1480
    .line 1481
    iget-object v14, v5, La/vd7;->b:Landroid/view/ViewGroup;

    .line 1482
    .line 1483
    check-cast v14, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;

    .line 1484
    .line 1485
    invoke-virtual {v14}, Landroid/view/View;->getHeight()I

    .line 1486
    .line 1487
    .line 1488
    move-result v14

    .line 1489
    int-to-float v14, v14

    .line 1490
    move-object/from16 v17, v7

    .line 1491
    .line 1492
    iget-object v7, v0, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;->u:Ljava/util/List;

    .line 1493
    .line 1494
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1495
    .line 1496
    .line 1497
    move-result-object v7

    .line 1498
    check-cast v7, Ljava/lang/Number;

    .line 1499
    .line 1500
    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    .line 1501
    .line 1502
    .line 1503
    move-result v7

    .line 1504
    mul-float/2addr v7, v14

    .line 1505
    new-array v14, v9, [F

    .line 1506
    .line 1507
    aput v7, v14, v8

    .line 1508
    .line 1509
    invoke-static {v10, v13, v14}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 1510
    .line 1511
    .line 1512
    move-result-object v7

    .line 1513
    iget-object v10, v5, La/vd7;->c:Landroid/view/View;

    .line 1514
    .line 1515
    check-cast v10, Landroid/widget/ImageView;

    .line 1516
    .line 1517
    sget-object v13, Landroid/view/ViewGroup;->SCALE_X:Landroid/util/Property;

    .line 1518
    .line 1519
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1520
    .line 1521
    .line 1522
    move-result-object v14

    .line 1523
    check-cast v14, Ljava/lang/Number;

    .line 1524
    .line 1525
    invoke-virtual {v14}, Ljava/lang/Number;->floatValue()F

    .line 1526
    .line 1527
    .line 1528
    move-result v14

    .line 1529
    move/from16 v18, v8

    .line 1530
    .line 1531
    new-array v8, v9, [F

    .line 1532
    .line 1533
    aput v14, v8, v18

    .line 1534
    .line 1535
    invoke-static {v10, v13, v8}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 1536
    .line 1537
    .line 1538
    move-result-object v8

    .line 1539
    iget-object v10, v5, La/vd7;->c:Landroid/view/View;

    .line 1540
    .line 1541
    check-cast v10, Landroid/widget/ImageView;

    .line 1542
    .line 1543
    sget-object v13, Landroid/view/ViewGroup;->SCALE_Y:Landroid/util/Property;

    .line 1544
    .line 1545
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1546
    .line 1547
    .line 1548
    move-result-object v14

    .line 1549
    check-cast v14, Ljava/lang/Number;

    .line 1550
    .line 1551
    invoke-virtual {v14}, Ljava/lang/Number;->floatValue()F

    .line 1552
    .line 1553
    .line 1554
    move-result v14

    .line 1555
    move/from16 p0, v15

    .line 1556
    .line 1557
    new-array v15, v9, [F

    .line 1558
    .line 1559
    aput v14, v15, v18

    .line 1560
    .line 1561
    invoke-static {v10, v13, v15}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 1562
    .line 1563
    .line 1564
    move-result-object v10

    .line 1565
    new-array v13, v3, [Landroid/animation/Animator;

    .line 1566
    .line 1567
    aput-object v4, v13, v18

    .line 1568
    .line 1569
    aput-object v7, v13, v9

    .line 1570
    .line 1571
    aput-object v8, v13, p0

    .line 1572
    .line 1573
    aput-object v10, v13, v16

    .line 1574
    .line 1575
    invoke-virtual {v12, v13}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 1576
    .line 1577
    .line 1578
    goto :goto_1b

    .line 1579
    :cond_26
    move/from16 v16, v4

    .line 1580
    .line 1581
    move-object/from16 v17, v7

    .line 1582
    .line 1583
    move/from16 v18, v8

    .line 1584
    .line 1585
    move/from16 p0, v15

    .line 1586
    .line 1587
    invoke-interface {v14, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1588
    .line 1589
    .line 1590
    move-result-object v4

    .line 1591
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1592
    .line 1593
    .line 1594
    check-cast v4, Landroid/widget/ImageView;

    .line 1595
    .line 1596
    sget-object v7, Landroid/view/ViewGroup;->ALPHA:Landroid/util/Property;

    .line 1597
    .line 1598
    move/from16 v8, p0

    .line 1599
    .line 1600
    new-array v13, v8, [F

    .line 1601
    .line 1602
    fill-array-data v13, :array_1

    .line 1603
    .line 1604
    .line 1605
    invoke-static {v4, v7, v13}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 1606
    .line 1607
    .line 1608
    move-result-object v7

    .line 1609
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1610
    .line 1611
    .line 1612
    new-instance v8, La/jha;

    .line 1613
    .line 1614
    invoke-direct {v8, v4, v0, v10}, La/jha;-><init>(Landroid/widget/ImageView;Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;I)V

    .line 1615
    .line 1616
    .line 1617
    invoke-virtual {v7, v8}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 1618
    .line 1619
    .line 1620
    iget-object v4, v5, La/vd7;->c:Landroid/view/View;

    .line 1621
    .line 1622
    check-cast v4, Landroid/widget/ImageView;

    .line 1623
    .line 1624
    sget-object v8, Landroid/view/ViewGroup;->TRANSLATION_X:Landroid/util/Property;

    .line 1625
    .line 1626
    iget-object v10, v5, La/vd7;->b:Landroid/view/ViewGroup;

    .line 1627
    .line 1628
    check-cast v10, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;

    .line 1629
    .line 1630
    invoke-virtual {v10}, Landroid/view/View;->getWidth()I

    .line 1631
    .line 1632
    .line 1633
    move-result v10

    .line 1634
    int-to-float v10, v10

    .line 1635
    iget-object v13, v0, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;->t:Ljava/util/List;

    .line 1636
    .line 1637
    invoke-interface {v13, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1638
    .line 1639
    .line 1640
    move-result-object v13

    .line 1641
    check-cast v13, Ljava/lang/Number;

    .line 1642
    .line 1643
    invoke-virtual {v13}, Ljava/lang/Number;->floatValue()F

    .line 1644
    .line 1645
    .line 1646
    move-result v13

    .line 1647
    mul-float/2addr v13, v10

    .line 1648
    new-array v10, v9, [F

    .line 1649
    .line 1650
    aput v13, v10, v18

    .line 1651
    .line 1652
    invoke-static {v4, v8, v10}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 1653
    .line 1654
    .line 1655
    move-result-object v4

    .line 1656
    const/4 v8, 0x2

    .line 1657
    new-array v8, v8, [Landroid/animation/Animator;

    .line 1658
    .line 1659
    aput-object v7, v8, v18

    .line 1660
    .line 1661
    aput-object v4, v8, v9

    .line 1662
    .line 1663
    invoke-virtual {v12, v8}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 1664
    .line 1665
    .line 1666
    :goto_1b
    int-to-long v6, v6

    .line 1667
    const-wide/16 v13, 0x3e8

    .line 1668
    .line 1669
    mul-long/2addr v6, v13

    .line 1670
    invoke-virtual {v12, v6, v7}, Landroid/animation/AnimatorSet;->setStartDelay(J)V

    .line 1671
    .line 1672
    .line 1673
    invoke-virtual {v12, v13, v14}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 1674
    .line 1675
    .line 1676
    invoke-virtual {v12}, Landroid/animation/AnimatorSet;->start()V

    .line 1677
    .line 1678
    .line 1679
    move v6, v11

    .line 1680
    move/from16 v4, v16

    .line 1681
    .line 1682
    move-object/from16 v7, v17

    .line 1683
    .line 1684
    move/from16 v8, v18

    .line 1685
    .line 1686
    goto/16 :goto_1a

    .line 1687
    .line 1688
    :cond_27
    move-object/from16 v17, v7

    .line 1689
    .line 1690
    invoke-static {}, La/q3d;->p()V

    .line 1691
    .line 1692
    .line 1693
    throw v17

    .line 1694
    :cond_28
    return-void

    .line 1695
    :pswitch_18
    iget-object v0, v1, La/lfr;->b:Ljava/lang/Object;

    .line 1696
    .line 1697
    check-cast v0, La/owp0;

    .line 1698
    .line 1699
    iget-object v1, v1, La/lfr;->c:Ljava/lang/Object;

    .line 1700
    .line 1701
    check-cast v1, Landroid/graphics/Typeface;

    .line 1702
    .line 1703
    iget-object v0, v0, La/owp0;->b:Ljava/lang/Object;

    .line 1704
    .line 1705
    check-cast v0, La/xvw;

    .line 1706
    .line 1707
    if-eqz v0, :cond_29

    .line 1708
    .line 1709
    invoke-virtual {v0, v1}, La/xvw;->U(Landroid/graphics/Typeface;)V

    .line 1710
    .line 1711
    .line 1712
    :cond_29
    return-void

    .line 1713
    :pswitch_19
    iget-object v0, v1, La/lfr;->c:Ljava/lang/Object;

    .line 1714
    .line 1715
    check-cast v0, La/wz3;

    .line 1716
    .line 1717
    iget-object v2, v0, La/wz3;->f:Ljava/lang/Object;

    .line 1718
    .line 1719
    check-cast v2, La/yz3;

    .line 1720
    .line 1721
    iget v3, v2, La/yz3;->g:I

    .line 1722
    .line 1723
    iget v4, v0, La/wz3;->b:I

    .line 1724
    .line 1725
    if-ne v3, v4, :cond_2a

    .line 1726
    .line 1727
    iget-object v3, v0, La/wz3;->d:Ljava/lang/Object;

    .line 1728
    .line 1729
    check-cast v3, Ljava/util/List;

    .line 1730
    .line 1731
    iget-object v1, v1, La/lfr;->b:Ljava/lang/Object;

    .line 1732
    .line 1733
    check-cast v1, La/amk;

    .line 1734
    .line 1735
    iget-object v0, v0, La/wz3;->e:Ljava/lang/Object;

    .line 1736
    .line 1737
    check-cast v0, Ljava/lang/Runnable;

    .line 1738
    .line 1739
    iget-object v4, v2, La/yz3;->f:Ljava/util/List;

    .line 1740
    .line 1741
    iput-object v3, v2, La/yz3;->e:Ljava/util/List;

    .line 1742
    .line 1743
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 1744
    .line 1745
    .line 1746
    move-result-object v3

    .line 1747
    iput-object v3, v2, La/yz3;->f:Ljava/util/List;

    .line 1748
    .line 1749
    iget-object v3, v2, La/yz3;->a:La/fvt0;

    .line 1750
    .line 1751
    invoke-virtual {v1, v3}, La/amk;->b(La/pf00;)V

    .line 1752
    .line 1753
    .line 1754
    invoke-virtual {v2, v4, v0}, La/yz3;->a(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 1755
    .line 1756
    .line 1757
    :cond_2a
    return-void

    .line 1758
    :pswitch_1a
    iget-object v0, v1, La/lfr;->b:Ljava/lang/Object;

    .line 1759
    .line 1760
    check-cast v0, Landroid/app/Application;

    .line 1761
    .line 1762
    iget-object v1, v1, La/lfr;->c:Ljava/lang/Object;

    .line 1763
    .line 1764
    check-cast v1, La/un;

    .line 1765
    .line 1766
    invoke-virtual {v0, v1}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 1767
    .line 1768
    .line 1769
    return-void

    .line 1770
    :pswitch_1b
    move-object/from16 v17, v7

    .line 1771
    .line 1772
    move/from16 v18, v8

    .line 1773
    .line 1774
    iget-object v0, v1, La/lfr;->b:Ljava/lang/Object;

    .line 1775
    .line 1776
    check-cast v0, La/ui;

    .line 1777
    .line 1778
    iget-object v1, v1, La/lfr;->c:Ljava/lang/Object;

    .line 1779
    .line 1780
    check-cast v1, La/xi;

    .line 1781
    .line 1782
    iget-object v2, v1, La/xi;->c:La/ox30;

    .line 1783
    .line 1784
    if-eqz v2, :cond_2b

    .line 1785
    .line 1786
    iget-object v3, v2, La/ox30;->e:La/mx30;

    .line 1787
    .line 1788
    if-eqz v3, :cond_2b

    .line 1789
    .line 1790
    invoke-interface {v3, v2}, La/mx30;->a(La/ox30;)V

    .line 1791
    .line 1792
    .line 1793
    :cond_2b
    iget-object v2, v1, La/xi;->h:La/n240;

    .line 1794
    .line 1795
    check-cast v2, Landroid/view/View;

    .line 1796
    .line 1797
    if-eqz v2, :cond_2d

    .line 1798
    .line 1799
    invoke-virtual {v2}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 1800
    .line 1801
    .line 1802
    move-result-object v2

    .line 1803
    if-eqz v2, :cond_2d

    .line 1804
    .line 1805
    invoke-virtual {v0}, La/yz30;->b()Z

    .line 1806
    .line 1807
    .line 1808
    move-result v2

    .line 1809
    if-eqz v2, :cond_2c

    .line 1810
    .line 1811
    goto :goto_1d

    .line 1812
    :cond_2c
    iget-object v2, v0, La/yz30;->f:Landroid/view/View;

    .line 1813
    .line 1814
    if-nez v2, :cond_2e

    .line 1815
    .line 1816
    :cond_2d
    :goto_1c
    move-object/from16 v2, v17

    .line 1817
    .line 1818
    goto :goto_1e

    .line 1819
    :cond_2e
    move/from16 v2, v18

    .line 1820
    .line 1821
    invoke-virtual {v0, v2, v2, v2, v2}, La/yz30;->d(IIZZ)V

    .line 1822
    .line 1823
    .line 1824
    :goto_1d
    iput-object v0, v1, La/xi;->s:La/ui;

    .line 1825
    .line 1826
    goto :goto_1c

    .line 1827
    :goto_1e
    iput-object v2, v1, La/xi;->u:La/lfr;

    .line 1828
    .line 1829
    return-void

    .line 1830
    :pswitch_1c
    iget-object v0, v1, La/lfr;->c:Ljava/lang/Object;

    .line 1831
    .line 1832
    move-object v2, v0

    .line 1833
    check-cast v2, La/bfr;

    .line 1834
    .line 1835
    iget-object v0, v1, La/lfr;->b:Ljava/lang/Object;

    .line 1836
    .line 1837
    check-cast v0, La/ig00;

    .line 1838
    .line 1839
    instance-of v1, v0, La/r2;

    .line 1840
    .line 1841
    if-eqz v1, :cond_2f

    .line 1842
    .line 1843
    move-object v1, v0

    .line 1844
    check-cast v1, La/r2;

    .line 1845
    .line 1846
    invoke-virtual {v1}, La/r2;->c()Ljava/lang/Throwable;

    .line 1847
    .line 1848
    .line 1849
    move-result-object v1

    .line 1850
    if-eqz v1, :cond_2f

    .line 1851
    .line 1852
    invoke-interface {v2, v1}, La/bfr;->onFailure(Ljava/lang/Throwable;)V

    .line 1853
    .line 1854
    .line 1855
    goto :goto_1f

    .line 1856
    :cond_2f
    :try_start_d
    invoke-static {v0}, La/hkb;->E(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 1857
    .line 1858
    .line 1859
    move-result-object v0
    :try_end_d
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_d .. :try_end_d} :catch_6
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 1860
    invoke-interface {v2, v0}, La/bfr;->onSuccess(Ljava/lang/Object;)V

    .line 1861
    .line 1862
    .line 1863
    goto :goto_1f

    .line 1864
    :catchall_5
    move-exception v0

    .line 1865
    invoke-interface {v2, v0}, La/bfr;->onFailure(Ljava/lang/Throwable;)V

    .line 1866
    .line 1867
    .line 1868
    goto :goto_1f

    .line 1869
    :catch_6
    move-exception v0

    .line 1870
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1871
    .line 1872
    .line 1873
    move-result-object v0

    .line 1874
    invoke-interface {v2, v0}, La/bfr;->onFailure(Ljava/lang/Throwable;)V

    .line 1875
    .line 1876
    .line 1877
    :goto_1f
    return-void

    .line 1878
    nop

    .line 1879
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
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

    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    :array_1
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-byte v0, p0, La/lfr;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/lfr;->c:Ljava/lang/Object;

    .line 4
    .line 5
    sparse-switch v0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :sswitch_0
    iget-object p0, p0, La/lfr;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Ljava/lang/Runnable;

    .line 16
    .line 17
    const-string v0, "}"

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v2, "SequentialExecutorWorker{running="

    .line 24
    .line 25
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v2, "SequentialExecutorWorker{state="

    .line 42
    .line 43
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    check-cast v1, La/qgi0;

    .line 47
    .line 48
    iget v1, v1, La/qgi0;->c:I

    .line 49
    .line 50
    const/4 v2, 0x1

    .line 51
    if-eq v1, v2, :cond_4

    .line 52
    .line 53
    const/4 v2, 0x2

    .line 54
    if-eq v1, v2, :cond_3

    .line 55
    .line 56
    const/4 v2, 0x3

    .line 57
    if-eq v1, v2, :cond_2

    .line 58
    .line 59
    const/4 v2, 0x4

    .line 60
    if-eq v1, v2, :cond_1

    .line 61
    .line 62
    const-string v1, "null"

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    const-string v1, "RUNNING"

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    const-string v1, "QUEUED"

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    const-string v1, "QUEUING"

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_4
    const-string v1, "IDLE"

    .line 75
    .line 76
    :goto_0
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    :goto_1
    return-object p0

    .line 87
    :sswitch_1
    new-instance p0, La/y3v;

    .line 88
    .line 89
    const-class v0, La/lfr;

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-direct {p0, v0}, La/y3v;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    check-cast v1, La/bfr;

    .line 99
    .line 100
    new-instance v0, La/zn00;

    .line 101
    .line 102
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 103
    .line 104
    .line 105
    iget-object v2, p0, La/y3v;->d:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v2, La/zn00;

    .line 108
    .line 109
    iput-object v0, v2, La/zn00;->b:Ljava/lang/Object;

    .line 110
    .line 111
    iput-object v0, p0, La/y3v;->d:Ljava/lang/Object;

    .line 112
    .line 113
    iput-object v1, v0, La/zn00;->a:Ljava/lang/Object;

    .line 114
    .line 115
    invoke-virtual {p0}, La/y3v;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    return-object p0

    .line 120
    nop

    .line 121
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0xf -> :sswitch_0
    .end sparse-switch
.end method
