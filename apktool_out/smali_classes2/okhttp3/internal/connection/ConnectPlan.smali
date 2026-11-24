.class public final Lokhttp3/internal/connection/ConnectPlan;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/internal/connection/RoutePlanner$Plan;
.implements Lokhttp3/internal/http/ExchangeCodec$Carrier;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/connection/ConnectPlan$Companion;,
        Lokhttp3/internal/connection/ConnectPlan$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lokhttp3/internal/connection/ConnectPlan;",
        "Lokhttp3/internal/connection/RoutePlanner$Plan;",
        "Lokhttp3/internal/http/ExchangeCodec$Carrier;",
        "Companion",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lokhttp3/internal/concurrent/TaskRunner;

.field public final b:Lokhttp3/internal/connection/RealConnectionPool;

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:Z

.field public final i:Lokhttp3/internal/connection/RealCall;

.field public final j:Lokhttp3/internal/connection/RealRoutePlanner;

.field public final k:Lokhttp3/Route;

.field public final l:Ljava/util/List;

.field public final m:I

.field public final n:Lokhttp3/Request;

.field public final o:I

.field public final p:Z

.field public final q:Lokhttp3/internal/ech/EchRetryPlan;

.field public volatile r:Z

.field public s:Ljava/net/Socket;

.field public t:Ljava/net/Socket;

.field public u:Lokhttp3/Handshake;

.field public v:Lokhttp3/Protocol;

.field public w:Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;

.field public x:Lokhttp3/internal/connection/RealConnection;


# direct methods
.method public constructor <init>(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/internal/connection/RealConnectionPool;IIIIIZLokhttp3/internal/connection/RealCall;Lokhttp3/internal/connection/RealRoutePlanner;Lokhttp3/Route;Ljava/util/List;ILokhttp3/Request;IZLokhttp3/internal/ech/EchRetryPlan;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lokhttp3/internal/connection/ConnectPlan;->a:Lokhttp3/internal/concurrent/TaskRunner;

    .line 11
    .line 12
    iput-object p2, p0, Lokhttp3/internal/connection/ConnectPlan;->b:Lokhttp3/internal/connection/RealConnectionPool;

    .line 13
    .line 14
    iput p3, p0, Lokhttp3/internal/connection/ConnectPlan;->c:I

    .line 15
    .line 16
    iput p4, p0, Lokhttp3/internal/connection/ConnectPlan;->d:I

    .line 17
    .line 18
    iput p5, p0, Lokhttp3/internal/connection/ConnectPlan;->e:I

    .line 19
    .line 20
    iput p6, p0, Lokhttp3/internal/connection/ConnectPlan;->f:I

    .line 21
    .line 22
    iput p7, p0, Lokhttp3/internal/connection/ConnectPlan;->g:I

    .line 23
    .line 24
    iput-boolean p8, p0, Lokhttp3/internal/connection/ConnectPlan;->h:Z

    .line 25
    .line 26
    iput-object p9, p0, Lokhttp3/internal/connection/ConnectPlan;->i:Lokhttp3/internal/connection/RealCall;

    .line 27
    .line 28
    iput-object p10, p0, Lokhttp3/internal/connection/ConnectPlan;->j:Lokhttp3/internal/connection/RealRoutePlanner;

    .line 29
    .line 30
    iput-object p11, p0, Lokhttp3/internal/connection/ConnectPlan;->k:Lokhttp3/Route;

    .line 31
    .line 32
    iput-object p12, p0, Lokhttp3/internal/connection/ConnectPlan;->l:Ljava/util/List;

    .line 33
    .line 34
    iput p13, p0, Lokhttp3/internal/connection/ConnectPlan;->m:I

    .line 35
    .line 36
    iput-object p14, p0, Lokhttp3/internal/connection/ConnectPlan;->n:Lokhttp3/Request;

    .line 37
    .line 38
    iput p15, p0, Lokhttp3/internal/connection/ConnectPlan;->o:I

    .line 39
    .line 40
    move/from16 p1, p16

    .line 41
    .line 42
    iput-boolean p1, p0, Lokhttp3/internal/connection/ConnectPlan;->p:Z

    .line 43
    .line 44
    move-object/from16 p1, p17

    .line 45
    .line 46
    iput-object p1, p0, Lokhttp3/internal/connection/ConnectPlan;->q:Lokhttp3/internal/ech/EchRetryPlan;

    .line 47
    .line 48
    return-void
.end method

.method public static k(Lokhttp3/internal/connection/ConnectPlan;Lokhttp3/Route;ILokhttp3/Request;IZLokhttp3/internal/ech/EchRetryPlan;I)Lokhttp3/internal/connection/ConnectPlan;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    and-int/lit8 v1, p7, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, v0, Lokhttp3/internal/connection/ConnectPlan;->k:Lokhttp3/Route;

    .line 8
    .line 9
    move-object v13, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object/from16 v13, p1

    .line 12
    .line 13
    :goto_0
    and-int/lit8 v1, p7, 0x2

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    iget v1, v0, Lokhttp3/internal/connection/ConnectPlan;->m:I

    .line 18
    .line 19
    move v15, v1

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move/from16 v15, p2

    .line 22
    .line 23
    :goto_1
    and-int/lit8 v1, p7, 0x4

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    iget-object v1, v0, Lokhttp3/internal/connection/ConnectPlan;->n:Lokhttp3/Request;

    .line 28
    .line 29
    move-object/from16 v16, v1

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_2
    move-object/from16 v16, p3

    .line 33
    .line 34
    :goto_2
    and-int/lit8 v1, p7, 0x8

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    iget v1, v0, Lokhttp3/internal/connection/ConnectPlan;->o:I

    .line 39
    .line 40
    move/from16 v17, v1

    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_3
    move/from16 v17, p4

    .line 44
    .line 45
    :goto_3
    and-int/lit8 v1, p7, 0x10

    .line 46
    .line 47
    if-eqz v1, :cond_4

    .line 48
    .line 49
    iget-boolean v1, v0, Lokhttp3/internal/connection/ConnectPlan;->p:Z

    .line 50
    .line 51
    move/from16 v18, v1

    .line 52
    .line 53
    goto :goto_4

    .line 54
    :cond_4
    move/from16 v18, p5

    .line 55
    .line 56
    :goto_4
    and-int/lit8 v1, p7, 0x20

    .line 57
    .line 58
    if-eqz v1, :cond_5

    .line 59
    .line 60
    iget-object v1, v0, Lokhttp3/internal/connection/ConnectPlan;->q:Lokhttp3/internal/ech/EchRetryPlan;

    .line 61
    .line 62
    move-object/from16 v19, v1

    .line 63
    .line 64
    goto :goto_5

    .line 65
    :cond_5
    move-object/from16 v19, p6

    .line 66
    .line 67
    :goto_5
    new-instance v2, Lokhttp3/internal/connection/ConnectPlan;

    .line 68
    .line 69
    iget-object v3, v0, Lokhttp3/internal/connection/ConnectPlan;->a:Lokhttp3/internal/concurrent/TaskRunner;

    .line 70
    .line 71
    iget-object v4, v0, Lokhttp3/internal/connection/ConnectPlan;->b:Lokhttp3/internal/connection/RealConnectionPool;

    .line 72
    .line 73
    iget v5, v0, Lokhttp3/internal/connection/ConnectPlan;->c:I

    .line 74
    .line 75
    iget v6, v0, Lokhttp3/internal/connection/ConnectPlan;->d:I

    .line 76
    .line 77
    iget v7, v0, Lokhttp3/internal/connection/ConnectPlan;->e:I

    .line 78
    .line 79
    iget v8, v0, Lokhttp3/internal/connection/ConnectPlan;->f:I

    .line 80
    .line 81
    iget v9, v0, Lokhttp3/internal/connection/ConnectPlan;->g:I

    .line 82
    .line 83
    iget-boolean v10, v0, Lokhttp3/internal/connection/ConnectPlan;->h:Z

    .line 84
    .line 85
    iget-object v11, v0, Lokhttp3/internal/connection/ConnectPlan;->i:Lokhttp3/internal/connection/RealCall;

    .line 86
    .line 87
    iget-object v12, v0, Lokhttp3/internal/connection/ConnectPlan;->j:Lokhttp3/internal/connection/RealRoutePlanner;

    .line 88
    .line 89
    iget-object v14, v0, Lokhttp3/internal/connection/ConnectPlan;->l:Ljava/util/List;

    .line 90
    .line 91
    invoke-direct/range {v2 .. v19}, Lokhttp3/internal/connection/ConnectPlan;-><init>(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/internal/connection/RealConnectionPool;IIIIIZLokhttp3/internal/connection/RealCall;Lokhttp3/internal/connection/RealRoutePlanner;Lokhttp3/Route;Ljava/util/List;ILokhttp3/Request;IZLokhttp3/internal/ech/EchRetryPlan;)V

    .line 92
    .line 93
    .line 94
    return-object v2
.end method


# virtual methods
.method public final a()Lokhttp3/internal/connection/RoutePlanner$Plan;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lokhttp3/internal/connection/ConnectPlan;

    .line 4
    .line 5
    iget-boolean v2, v0, Lokhttp3/internal/connection/ConnectPlan;->p:Z

    .line 6
    .line 7
    iget-object v3, v0, Lokhttp3/internal/connection/ConnectPlan;->q:Lokhttp3/internal/ech/EchRetryPlan;

    .line 8
    .line 9
    move-object v4, v1

    .line 10
    iget-object v1, v0, Lokhttp3/internal/connection/ConnectPlan;->a:Lokhttp3/internal/concurrent/TaskRunner;

    .line 11
    .line 12
    move/from16 v16, v2

    .line 13
    .line 14
    iget-object v2, v0, Lokhttp3/internal/connection/ConnectPlan;->b:Lokhttp3/internal/connection/RealConnectionPool;

    .line 15
    .line 16
    move-object/from16 v17, v3

    .line 17
    .line 18
    iget v3, v0, Lokhttp3/internal/connection/ConnectPlan;->c:I

    .line 19
    .line 20
    move-object v5, v4

    .line 21
    iget v4, v0, Lokhttp3/internal/connection/ConnectPlan;->d:I

    .line 22
    .line 23
    move-object v6, v5

    .line 24
    iget v5, v0, Lokhttp3/internal/connection/ConnectPlan;->e:I

    .line 25
    .line 26
    move-object v7, v6

    .line 27
    iget v6, v0, Lokhttp3/internal/connection/ConnectPlan;->f:I

    .line 28
    .line 29
    move-object v8, v7

    .line 30
    iget v7, v0, Lokhttp3/internal/connection/ConnectPlan;->g:I

    .line 31
    .line 32
    move-object v9, v8

    .line 33
    iget-boolean v8, v0, Lokhttp3/internal/connection/ConnectPlan;->h:Z

    .line 34
    .line 35
    move-object v10, v9

    .line 36
    iget-object v9, v0, Lokhttp3/internal/connection/ConnectPlan;->i:Lokhttp3/internal/connection/RealCall;

    .line 37
    .line 38
    move-object v11, v10

    .line 39
    iget-object v10, v0, Lokhttp3/internal/connection/ConnectPlan;->j:Lokhttp3/internal/connection/RealRoutePlanner;

    .line 40
    .line 41
    move-object v12, v11

    .line 42
    iget-object v11, v0, Lokhttp3/internal/connection/ConnectPlan;->k:Lokhttp3/Route;

    .line 43
    .line 44
    move-object v13, v12

    .line 45
    iget-object v12, v0, Lokhttp3/internal/connection/ConnectPlan;->l:Ljava/util/List;

    .line 46
    .line 47
    move-object v14, v13

    .line 48
    iget v13, v0, Lokhttp3/internal/connection/ConnectPlan;->m:I

    .line 49
    .line 50
    move-object v15, v14

    .line 51
    iget-object v14, v0, Lokhttp3/internal/connection/ConnectPlan;->n:Lokhttp3/Request;

    .line 52
    .line 53
    iget v0, v0, Lokhttp3/internal/connection/ConnectPlan;->o:I

    .line 54
    .line 55
    move-object/from16 v18, v15

    .line 56
    .line 57
    move v15, v0

    .line 58
    move-object/from16 v0, v18

    .line 59
    .line 60
    invoke-direct/range {v0 .. v17}, Lokhttp3/internal/connection/ConnectPlan;-><init>(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/internal/connection/RealConnectionPool;IIIIIZLokhttp3/internal/connection/RealCall;Lokhttp3/internal/connection/RealRoutePlanner;Lokhttp3/Route;Ljava/util/List;ILokhttp3/Request;IZLokhttp3/internal/ech/EchRetryPlan;)V

    .line 61
    .line 62
    .line 63
    return-object v0
.end method

.method public final b()Lokhttp3/internal/connection/RealConnection;
    .locals 3

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/ConnectPlan;->i:Lokhttp3/internal/connection/RealCall;

    .line 2
    .line 3
    iget-object v0, v0, Lokhttp3/internal/connection/RealCall;->a:Lokhttp3/OkHttpClient;

    .line 4
    .line 5
    iget-object v0, v0, Lokhttp3/OkHttpClient;->C:Lokhttp3/internal/connection/RouteDatabase;

    .line 6
    .line 7
    iget-object v1, p0, Lokhttp3/internal/connection/ConnectPlan;->k:Lokhttp3/Route;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v2, v0, Lokhttp3/internal/connection/RouteDatabase;->a:Ljava/util/LinkedHashSet;

    .line 14
    .line 15
    invoke-interface {v2, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 16
    .line 17
    .line 18
    monitor-exit v0

    .line 19
    iget-object v0, p0, Lokhttp3/internal/connection/ConnectPlan;->x:Lokhttp3/internal/connection/RealConnection;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lokhttp3/internal/connection/ConnectPlan;->k:Lokhttp3/Route;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lokhttp3/internal/connection/ConnectPlan;->j:Lokhttp3/internal/connection/RealRoutePlanner;

    .line 30
    .line 31
    iget-object v2, p0, Lokhttp3/internal/connection/ConnectPlan;->l:Ljava/util/List;

    .line 32
    .line 33
    invoke-virtual {v1, p0, v2}, Lokhttp3/internal/connection/RealRoutePlanner;->e(Lokhttp3/internal/connection/ConnectPlan;Ljava/util/List;)Lokhttp3/internal/connection/ReusePlan;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    iget-object p0, v1, Lokhttp3/internal/connection/ReusePlan;->a:Lokhttp3/internal/connection/RealConnection;

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_0
    monitor-enter v0

    .line 43
    :try_start_1
    iget-object v1, p0, Lokhttp3/internal/connection/ConnectPlan;->b:Lokhttp3/internal/connection/RealConnectionPool;

    .line 44
    .line 45
    sget-object v2, Lokhttp3/internal/_UtilJvmKt;->a:Ljava/util/TimeZone;

    .line 46
    .line 47
    iget-object v2, v1, Lokhttp3/internal/connection/RealConnectionPool;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 48
    .line 49
    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    iget-object v2, v1, Lokhttp3/internal/connection/RealConnectionPool;->b:Lokhttp3/internal/concurrent/TaskQueue;

    .line 53
    .line 54
    iget-object v1, v1, Lokhttp3/internal/connection/RealConnectionPool;->c:Lokhttp3/internal/connection/RealConnectionPool$cleanupTask$1;

    .line 55
    .line 56
    invoke-static {v2, v1}, Lokhttp3/internal/concurrent/TaskQueue;->e(Lokhttp3/internal/concurrent/TaskQueue;Lokhttp3/internal/concurrent/Task;)V

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Lokhttp3/internal/connection/ConnectPlan;->i:Lokhttp3/internal/connection/RealCall;

    .line 60
    .line 61
    invoke-virtual {v1, v0}, Lokhttp3/internal/connection/RealCall;->a(Lokhttp3/internal/connection/RealConnection;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    .line 63
    .line 64
    monitor-exit v0

    .line 65
    iget-object v1, p0, Lokhttp3/internal/connection/ConnectPlan;->i:Lokhttp3/internal/connection/RealCall;

    .line 66
    .line 67
    iget-object v1, v1, Lokhttp3/internal/connection/RealCall;->e:Lokhttp3/EventListener;

    .line 68
    .line 69
    iget-object p0, p0, Lokhttp3/internal/connection/ConnectPlan;->i:Lokhttp3/internal/connection/RealCall;

    .line 70
    .line 71
    invoke-virtual {v1, p0, v0}, Lokhttp3/EventListener;->j(Lokhttp3/Call;Lokhttp3/Connection;)V

    .line 72
    .line 73
    .line 74
    return-object v0

    .line 75
    :catchall_0
    move-exception p0

    .line 76
    monitor-exit v0

    .line 77
    throw p0

    .line 78
    :catchall_1
    move-exception p0

    .line 79
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 80
    throw p0
.end method

.method public final c()V
    .locals 0

    .line 1
    return-void
.end method

.method public final cancel()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lokhttp3/internal/connection/ConnectPlan;->r:Z

    .line 3
    .line 4
    iget-object p0, p0, Lokhttp3/internal/connection/ConnectPlan;->s:Ljava/net/Socket;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-static {p0}, Lokhttp3/internal/_UtilJvmKt;->c(Ljava/net/Socket;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final d()Lokhttp3/internal/connection/RoutePlanner$ConnectResult;
    .locals 13

    .line 1
    iget-object v4, p0, Lokhttp3/internal/connection/ConnectPlan;->s:Ljava/net/Socket;

    .line 2
    .line 3
    const/4 v10, 0x0

    .line 4
    if-eqz v4, :cond_e

    .line 5
    .line 6
    invoke-virtual {p0}, Lokhttp3/internal/connection/ConnectPlan;->isReady()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_d

    .line 11
    .line 12
    iget-object v0, p0, Lokhttp3/internal/connection/ConnectPlan;->k:Lokhttp3/Route;

    .line 13
    .line 14
    iget-object v0, v0, Lokhttp3/Route;->a:Lokhttp3/Address;

    .line 15
    .line 16
    iget-object v1, v0, Lokhttp3/Address;->k:Ljava/util/List;

    .line 17
    .line 18
    iget-object v0, p0, Lokhttp3/internal/connection/ConnectPlan;->i:Lokhttp3/internal/connection/RealCall;

    .line 19
    .line 20
    iget-object v0, v0, Lokhttp3/internal/connection/RealCall;->t:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    const/4 v11, 0x0

    .line 26
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/connection/ConnectPlan;->n:Lokhttp3/Request;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    invoke-virtual {p0}, Lokhttp3/internal/connection/ConnectPlan;->j()Lokhttp3/internal/connection/RoutePlanner$ConnectResult;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v2, v0, Lokhttp3/internal/connection/RoutePlanner$ConnectResult;->b:Lokhttp3/internal/connection/RoutePlanner$Plan;

    .line 35
    .line 36
    if-nez v2, :cond_0

    .line 37
    .line 38
    iget-object v2, v0, Lokhttp3/internal/connection/RoutePlanner$ConnectResult;->c:Ljava/lang/Throwable;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    goto/16 :goto_4

    .line 45
    .line 46
    :catch_0
    move-exception v0

    .line 47
    goto/16 :goto_3

    .line 48
    .line 49
    :cond_0
    :goto_0
    iget-object v1, p0, Lokhttp3/internal/connection/ConnectPlan;->i:Lokhttp3/internal/connection/RealCall;

    .line 50
    .line 51
    iget-object v1, v1, Lokhttp3/internal/connection/RealCall;->t:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 52
    .line 53
    invoke-virtual {v1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    iget-object p0, p0, Lokhttp3/internal/connection/ConnectPlan;->t:Ljava/net/Socket;

    .line 57
    .line 58
    if-eqz p0, :cond_1

    .line 59
    .line 60
    invoke-static {p0}, Lokhttp3/internal/_UtilJvmKt;->c(Ljava/net/Socket;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    invoke-static {v4}, Lokhttp3/internal/_UtilJvmKt;->c(Ljava/net/Socket;)V

    .line 64
    .line 65
    .line 66
    return-object v0

    .line 67
    :cond_2
    :try_start_1
    iget-object v0, p0, Lokhttp3/internal/connection/ConnectPlan;->k:Lokhttp3/Route;

    .line 68
    .line 69
    iget-object v0, v0, Lokhttp3/Route;->a:Lokhttp3/Address;

    .line 70
    .line 71
    iget-object v2, v0, Lokhttp3/Address;->c:Ljavax/net/ssl/SSLSocketFactory;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    .line 73
    const/4 v12, 0x1

    .line 74
    const-string v3, "socket"

    .line 75
    .line 76
    if-eqz v2, :cond_6

    .line 77
    .line 78
    :try_start_2
    iget-object v0, p0, Lokhttp3/internal/connection/ConnectPlan;->w:Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;

    .line 79
    .line 80
    if-eqz v0, :cond_5

    .line 81
    .line 82
    iget-object v0, v0, Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;->b:La/zae0;

    .line 83
    .line 84
    iget-object v0, v0, La/zae0;->b:La/f99;

    .line 85
    .line 86
    invoke-virtual {v0}, La/f99;->v0()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_4

    .line 91
    .line 92
    iget-object v0, p0, Lokhttp3/internal/connection/ConnectPlan;->w:Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;

    .line 93
    .line 94
    if-eqz v0, :cond_3

    .line 95
    .line 96
    iget-object v0, v0, Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;->c:La/yae0;

    .line 97
    .line 98
    iget-object v0, v0, La/yae0;->b:La/f99;

    .line 99
    .line 100
    invoke-virtual {v0}, La/f99;->v0()Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_4

    .line 105
    .line 106
    iget-object v0, p0, Lokhttp3/internal/connection/ConnectPlan;->i:Lokhttp3/internal/connection/RealCall;

    .line 107
    .line 108
    iget-object v0, v0, Lokhttp3/internal/connection/RealCall;->e:Lokhttp3/EventListener;

    .line 109
    .line 110
    iget-object v2, p0, Lokhttp3/internal/connection/ConnectPlan;->i:Lokhttp3/internal/connection/RealCall;

    .line 111
    .line 112
    invoke-virtual {v0, v2}, Lokhttp3/EventListener;->F(Lokhttp3/Call;)V

    .line 113
    .line 114
    .line 115
    iget-object v0, p0, Lokhttp3/internal/connection/ConnectPlan;->k:Lokhttp3/Route;

    .line 116
    .line 117
    iget-object v0, v0, Lokhttp3/Route;->a:Lokhttp3/Address;

    .line 118
    .line 119
    iget-object v2, v0, Lokhttp3/Address;->c:Ljavax/net/ssl/SSLSocketFactory;

    .line 120
    .line 121
    iget-object v0, v0, Lokhttp3/Address;->i:Lokhttp3/HttpUrl;

    .line 122
    .line 123
    iget-object v5, v0, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 124
    .line 125
    iget v0, v0, Lokhttp3/HttpUrl;->e:I

    .line 126
    .line 127
    invoke-virtual {v2, v4, v5, v0, v12}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    move-object v2, v0

    .line 135
    check-cast v2, Ljavax/net/ssl/SSLSocket;

    .line 136
    .line 137
    invoke-virtual {p0, v1, v2}, Lokhttp3/internal/connection/ConnectPlan;->n(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Lokhttp3/internal/connection/ConnectPlan;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    iget v0, v5, Lokhttp3/internal/connection/ConnectPlan;->o:I

    .line 142
    .line 143
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    check-cast v0, Lokhttp3/ConnectionSpec;

    .line 148
    .line 149
    iget-boolean v6, v5, Lokhttp3/internal/connection/ConnectPlan;->p:Z

    .line 150
    .line 151
    invoke-virtual {v0, v2, v6}, Lokhttp3/ConnectionSpec;->a(Ljavax/net/ssl/SSLSocket;Z)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 152
    .line 153
    .line 154
    :try_start_3
    invoke-virtual {p0, v2, v0}, Lokhttp3/internal/connection/ConnectPlan;->i(Ljavax/net/ssl/SSLSocket;Lokhttp3/ConnectionSpec;)V
    :try_end_3
    .catch Ljavax/net/ssl/SSLException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 155
    .line 156
    .line 157
    :try_start_4
    iget-object v0, p0, Lokhttp3/internal/connection/ConnectPlan;->i:Lokhttp3/internal/connection/RealCall;

    .line 158
    .line 159
    iget-object v0, v0, Lokhttp3/internal/connection/RealCall;->e:Lokhttp3/EventListener;

    .line 160
    .line 161
    iget-object v1, p0, Lokhttp3/internal/connection/ConnectPlan;->i:Lokhttp3/internal/connection/RealCall;

    .line 162
    .line 163
    iget-object v2, p0, Lokhttp3/internal/connection/ConnectPlan;->u:Lokhttp3/Handshake;

    .line 164
    .line 165
    invoke-virtual {v0, v1, v2}, Lokhttp3/EventListener;->E(Lokhttp3/Call;Lokhttp3/Handshake;)V

    .line 166
    .line 167
    .line 168
    goto :goto_2

    .line 169
    :catch_1
    move-exception v0

    .line 170
    invoke-virtual {v5, v1, v2, v0}, Lokhttp3/internal/connection/ConnectPlan;->m(Ljava/util/List;Ljavax/net/ssl/SSLSocket;Ljavax/net/ssl/SSLException;)Lokhttp3/internal/connection/ConnectPlan;

    .line 171
    .line 172
    .line 173
    move-result-object v10

    .line 174
    throw v0

    .line 175
    :cond_3
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw v10

    .line 179
    :cond_4
    new-instance v0, Ljava/io/IOException;

    .line 180
    .line 181
    const-string v1, "TLS tunnel buffered too many bytes!"

    .line 182
    .line 183
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    throw v0

    .line 187
    :cond_5
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    throw v10

    .line 191
    :cond_6
    iput-object v4, p0, Lokhttp3/internal/connection/ConnectPlan;->t:Ljava/net/Socket;

    .line 192
    .line 193
    iget-object v0, v0, Lokhttp3/Address;->j:Ljava/util/List;

    .line 194
    .line 195
    sget-object v1, Lokhttp3/Protocol;->g:Lokhttp3/Protocol;

    .line 196
    .line 197
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-eqz v0, :cond_7

    .line 202
    .line 203
    goto :goto_1

    .line 204
    :cond_7
    sget-object v1, Lokhttp3/Protocol;->d:Lokhttp3/Protocol;

    .line 205
    .line 206
    :goto_1
    iput-object v1, p0, Lokhttp3/internal/connection/ConnectPlan;->v:Lokhttp3/Protocol;

    .line 207
    .line 208
    :goto_2
    new-instance v0, Lokhttp3/internal/connection/RealConnection;

    .line 209
    .line 210
    iget-object v1, p0, Lokhttp3/internal/connection/ConnectPlan;->a:Lokhttp3/internal/concurrent/TaskRunner;

    .line 211
    .line 212
    iget-object v2, p0, Lokhttp3/internal/connection/ConnectPlan;->b:Lokhttp3/internal/connection/RealConnectionPool;

    .line 213
    .line 214
    move-object v5, v3

    .line 215
    iget-object v3, p0, Lokhttp3/internal/connection/ConnectPlan;->k:Lokhttp3/Route;

    .line 216
    .line 217
    move-object v6, v5

    .line 218
    iget-object v5, p0, Lokhttp3/internal/connection/ConnectPlan;->t:Ljava/net/Socket;

    .line 219
    .line 220
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    move-object v7, v6

    .line 224
    iget-object v6, p0, Lokhttp3/internal/connection/ConnectPlan;->u:Lokhttp3/Handshake;

    .line 225
    .line 226
    move-object v8, v7

    .line 227
    iget-object v7, p0, Lokhttp3/internal/connection/ConnectPlan;->v:Lokhttp3/Protocol;

    .line 228
    .line 229
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    move-object v9, v8

    .line 233
    iget-object v8, p0, Lokhttp3/internal/connection/ConnectPlan;->w:Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;

    .line 234
    .line 235
    if-eqz v8, :cond_8

    .line 236
    .line 237
    iget v9, p0, Lokhttp3/internal/connection/ConnectPlan;->g:I

    .line 238
    .line 239
    invoke-direct/range {v0 .. v9}, Lokhttp3/internal/connection/RealConnection;-><init>(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/internal/connection/RealConnectionPool;Lokhttp3/Route;Ljava/net/Socket;Ljava/net/Socket;Lokhttp3/Handshake;Lokhttp3/Protocol;Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;I)V

    .line 240
    .line 241
    .line 242
    iput-object v0, p0, Lokhttp3/internal/connection/ConnectPlan;->x:Lokhttp3/internal/connection/RealConnection;

    .line 243
    .line 244
    invoke-virtual {v0}, Lokhttp3/internal/connection/RealConnection;->i()V

    .line 245
    .line 246
    .line 247
    iget-object v0, p0, Lokhttp3/internal/connection/ConnectPlan;->i:Lokhttp3/internal/connection/RealCall;

    .line 248
    .line 249
    iget-object v0, v0, Lokhttp3/internal/connection/RealCall;->e:Lokhttp3/EventListener;

    .line 250
    .line 251
    iget-object v1, p0, Lokhttp3/internal/connection/ConnectPlan;->i:Lokhttp3/internal/connection/RealCall;

    .line 252
    .line 253
    iget-object v2, p0, Lokhttp3/internal/connection/ConnectPlan;->k:Lokhttp3/Route;

    .line 254
    .line 255
    iget-object v3, v2, Lokhttp3/Route;->c:Ljava/net/InetSocketAddress;

    .line 256
    .line 257
    iget-object v2, v2, Lokhttp3/Route;->b:Ljava/net/Proxy;

    .line 258
    .line 259
    iget-object v5, p0, Lokhttp3/internal/connection/ConnectPlan;->v:Lokhttp3/Protocol;

    .line 260
    .line 261
    invoke-virtual {v0, v1, v3, v2, v5}, Lokhttp3/EventListener;->g(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 262
    .line 263
    .line 264
    :try_start_5
    new-instance v0, Lokhttp3/internal/connection/RoutePlanner$ConnectResult;

    .line 265
    .line 266
    const/4 v1, 0x6

    .line 267
    invoke-direct {v0, p0, v10, v10, v1}, Lokhttp3/internal/connection/RoutePlanner$ConnectResult;-><init>(Lokhttp3/internal/connection/RoutePlanner$Plan;Lokhttp3/internal/connection/ConnectPlan;Ljava/lang/Throwable;I)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 268
    .line 269
    .line 270
    iget-object v1, p0, Lokhttp3/internal/connection/ConnectPlan;->i:Lokhttp3/internal/connection/RealCall;

    .line 271
    .line 272
    iget-object v1, v1, Lokhttp3/internal/connection/RealCall;->t:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 273
    .line 274
    invoke-virtual {v1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    return-object v0

    .line 278
    :catchall_1
    move-exception v0

    .line 279
    move v11, v12

    .line 280
    goto :goto_4

    .line 281
    :catch_2
    move-exception v0

    .line 282
    move v11, v12

    .line 283
    goto :goto_3

    .line 284
    :cond_8
    :try_start_6
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    throw v10
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 288
    :goto_3
    :try_start_7
    iget-object v1, p0, Lokhttp3/internal/connection/ConnectPlan;->i:Lokhttp3/internal/connection/RealCall;

    .line 289
    .line 290
    iget-object v1, v1, Lokhttp3/internal/connection/RealCall;->e:Lokhttp3/EventListener;

    .line 291
    .line 292
    iget-object v2, p0, Lokhttp3/internal/connection/ConnectPlan;->i:Lokhttp3/internal/connection/RealCall;

    .line 293
    .line 294
    iget-object v3, p0, Lokhttp3/internal/connection/ConnectPlan;->k:Lokhttp3/Route;

    .line 295
    .line 296
    iget-object v5, v3, Lokhttp3/Route;->c:Ljava/net/InetSocketAddress;

    .line 297
    .line 298
    iget-object v3, v3, Lokhttp3/Route;->b:Ljava/net/Proxy;

    .line 299
    .line 300
    invoke-virtual {v1, v2, v5, v3, v0}, Lokhttp3/EventListener;->h(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Ljava/io/IOException;)V

    .line 301
    .line 302
    .line 303
    iget-object v1, p0, Lokhttp3/internal/connection/ConnectPlan;->k:Lokhttp3/Route;

    .line 304
    .line 305
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    new-instance v1, Lokhttp3/internal/connection/RoutePlanner$ConnectResult;

    .line 309
    .line 310
    invoke-direct {v1, p0, v10, v0}, Lokhttp3/internal/connection/RoutePlanner$ConnectResult;-><init>(Lokhttp3/internal/connection/RoutePlanner$Plan;Lokhttp3/internal/connection/RoutePlanner$Plan;Ljava/lang/Throwable;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 311
    .line 312
    .line 313
    iget-object v0, p0, Lokhttp3/internal/connection/ConnectPlan;->i:Lokhttp3/internal/connection/RealCall;

    .line 314
    .line 315
    iget-object v0, v0, Lokhttp3/internal/connection/RealCall;->t:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 316
    .line 317
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    if-nez v11, :cond_a

    .line 321
    .line 322
    iget-object p0, p0, Lokhttp3/internal/connection/ConnectPlan;->t:Ljava/net/Socket;

    .line 323
    .line 324
    if-eqz p0, :cond_9

    .line 325
    .line 326
    invoke-static {p0}, Lokhttp3/internal/_UtilJvmKt;->c(Ljava/net/Socket;)V

    .line 327
    .line 328
    .line 329
    :cond_9
    invoke-static {v4}, Lokhttp3/internal/_UtilJvmKt;->c(Ljava/net/Socket;)V

    .line 330
    .line 331
    .line 332
    :cond_a
    return-object v1

    .line 333
    :goto_4
    iget-object v1, p0, Lokhttp3/internal/connection/ConnectPlan;->i:Lokhttp3/internal/connection/RealCall;

    .line 334
    .line 335
    iget-object v1, v1, Lokhttp3/internal/connection/RealCall;->t:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 336
    .line 337
    invoke-virtual {v1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    if-nez v11, :cond_c

    .line 341
    .line 342
    iget-object p0, p0, Lokhttp3/internal/connection/ConnectPlan;->t:Ljava/net/Socket;

    .line 343
    .line 344
    if-eqz p0, :cond_b

    .line 345
    .line 346
    invoke-static {p0}, Lokhttp3/internal/_UtilJvmKt;->c(Ljava/net/Socket;)V

    .line 347
    .line 348
    .line 349
    :cond_b
    invoke-static {v4}, Lokhttp3/internal/_UtilJvmKt;->c(Ljava/net/Socket;)V

    .line 350
    .line 351
    .line 352
    :cond_c
    throw v0

    .line 353
    :cond_d
    const-string p0, "already connected"

    .line 354
    .line 355
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    return-object v10

    .line 359
    :cond_e
    const-string p0, "TCP not connected"

    .line 360
    .line 361
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    return-object v10
.end method

.method public final e()Lokhttp3/Route;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/connection/ConnectPlan;->k:Lokhttp3/Route;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f(Lokhttp3/internal/connection/RealCall;Ljava/io/IOException;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final g()Lokhttp3/internal/connection/RoutePlanner$ConnectResult;
    .locals 7

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/ConnectPlan;->s:Ljava/net/Socket;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_3

    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/internal/connection/ConnectPlan;->i:Lokhttp3/internal/connection/RealCall;

    .line 7
    .line 8
    iget-object v0, v0, Lokhttp3/internal/connection/RealCall;->t:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    :try_start_0
    iget-object v2, p0, Lokhttp3/internal/connection/ConnectPlan;->i:Lokhttp3/internal/connection/RealCall;

    .line 15
    .line 16
    iget-object v2, v2, Lokhttp3/internal/connection/RealCall;->e:Lokhttp3/EventListener;

    .line 17
    .line 18
    iget-object v3, p0, Lokhttp3/internal/connection/ConnectPlan;->i:Lokhttp3/internal/connection/RealCall;

    .line 19
    .line 20
    iget-object v4, p0, Lokhttp3/internal/connection/ConnectPlan;->k:Lokhttp3/Route;

    .line 21
    .line 22
    iget-object v5, v4, Lokhttp3/Route;->c:Ljava/net/InetSocketAddress;

    .line 23
    .line 24
    iget-object v4, v4, Lokhttp3/Route;->b:Ljava/net/Proxy;

    .line 25
    .line 26
    invoke-virtual {v2, v3, v5, v4}, Lokhttp3/EventListener;->i(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V

    .line 27
    .line 28
    .line 29
    iget-object v2, p0, Lokhttp3/internal/connection/ConnectPlan;->k:Lokhttp3/Route;

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lokhttp3/internal/connection/ConnectPlan;->h()V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    new-instance v2, Lokhttp3/internal/connection/RoutePlanner$ConnectResult;

    .line 39
    .line 40
    const/4 v3, 0x6

    .line 41
    invoke-direct {v2, p0, v1, v1, v3}, Lokhttp3/internal/connection/RoutePlanner$ConnectResult;-><init>(Lokhttp3/internal/connection/RoutePlanner$Plan;Lokhttp3/internal/connection/ConnectPlan;Ljava/lang/Throwable;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lokhttp3/internal/connection/ConnectPlan;->i:Lokhttp3/internal/connection/RealCall;

    .line 45
    .line 46
    iget-object v0, v0, Lokhttp3/internal/connection/RealCall;->t:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 47
    .line 48
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    return-object v2

    .line 52
    :catchall_0
    move-exception v1

    .line 53
    goto :goto_0

    .line 54
    :catch_0
    move-exception v2

    .line 55
    :try_start_1
    iget-object v3, p0, Lokhttp3/internal/connection/ConnectPlan;->k:Lokhttp3/Route;

    .line 56
    .line 57
    iget-object v4, v3, Lokhttp3/Route;->a:Lokhttp3/Address;

    .line 58
    .line 59
    iget-object v4, v4, Lokhttp3/Address;->g:Ljava/net/Proxy;

    .line 60
    .line 61
    if-nez v4, :cond_0

    .line 62
    .line 63
    iget-object v3, v3, Lokhttp3/Route;->b:Ljava/net/Proxy;

    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    sget-object v4, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    .line 70
    .line 71
    if-eq v3, v4, :cond_0

    .line 72
    .line 73
    iget-object v3, p0, Lokhttp3/internal/connection/ConnectPlan;->k:Lokhttp3/Route;

    .line 74
    .line 75
    iget-object v3, v3, Lokhttp3/Route;->a:Lokhttp3/Address;

    .line 76
    .line 77
    iget-object v4, v3, Lokhttp3/Address;->h:Ljava/net/ProxySelector;

    .line 78
    .line 79
    iget-object v3, v3, Lokhttp3/Address;->i:Lokhttp3/HttpUrl;

    .line 80
    .line 81
    invoke-virtual {v3}, Lokhttp3/HttpUrl;->i()Ljava/net/URI;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    iget-object v5, p0, Lokhttp3/internal/connection/ConnectPlan;->k:Lokhttp3/Route;

    .line 86
    .line 87
    iget-object v5, v5, Lokhttp3/Route;->b:Ljava/net/Proxy;

    .line 88
    .line 89
    invoke-virtual {v5}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    invoke-virtual {v4, v3, v5, v2}, Ljava/net/ProxySelector;->connectFailed(Ljava/net/URI;Ljava/net/SocketAddress;Ljava/io/IOException;)V

    .line 94
    .line 95
    .line 96
    :cond_0
    iget-object v3, p0, Lokhttp3/internal/connection/ConnectPlan;->i:Lokhttp3/internal/connection/RealCall;

    .line 97
    .line 98
    iget-object v3, v3, Lokhttp3/internal/connection/RealCall;->e:Lokhttp3/EventListener;

    .line 99
    .line 100
    iget-object v4, p0, Lokhttp3/internal/connection/ConnectPlan;->i:Lokhttp3/internal/connection/RealCall;

    .line 101
    .line 102
    iget-object v5, p0, Lokhttp3/internal/connection/ConnectPlan;->k:Lokhttp3/Route;

    .line 103
    .line 104
    iget-object v6, v5, Lokhttp3/Route;->c:Ljava/net/InetSocketAddress;

    .line 105
    .line 106
    iget-object v5, v5, Lokhttp3/Route;->b:Ljava/net/Proxy;

    .line 107
    .line 108
    invoke-virtual {v3, v4, v6, v5, v2}, Lokhttp3/EventListener;->h(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Ljava/io/IOException;)V

    .line 109
    .line 110
    .line 111
    iget-object v3, p0, Lokhttp3/internal/connection/ConnectPlan;->k:Lokhttp3/Route;

    .line 112
    .line 113
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    new-instance v3, Lokhttp3/internal/connection/RoutePlanner$ConnectResult;

    .line 117
    .line 118
    const/4 v4, 0x2

    .line 119
    invoke-direct {v3, p0, v1, v2, v4}, Lokhttp3/internal/connection/RoutePlanner$ConnectResult;-><init>(Lokhttp3/internal/connection/RoutePlanner$Plan;Lokhttp3/internal/connection/ConnectPlan;Ljava/lang/Throwable;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 120
    .line 121
    .line 122
    iget-object v1, p0, Lokhttp3/internal/connection/ConnectPlan;->i:Lokhttp3/internal/connection/RealCall;

    .line 123
    .line 124
    iget-object v1, v1, Lokhttp3/internal/connection/RealCall;->t:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 125
    .line 126
    invoke-virtual {v1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    if-nez v0, :cond_1

    .line 130
    .line 131
    iget-object p0, p0, Lokhttp3/internal/connection/ConnectPlan;->s:Ljava/net/Socket;

    .line 132
    .line 133
    if-eqz p0, :cond_1

    .line 134
    .line 135
    invoke-static {p0}, Lokhttp3/internal/_UtilJvmKt;->c(Ljava/net/Socket;)V

    .line 136
    .line 137
    .line 138
    :cond_1
    return-object v3

    .line 139
    :goto_0
    iget-object v2, p0, Lokhttp3/internal/connection/ConnectPlan;->i:Lokhttp3/internal/connection/RealCall;

    .line 140
    .line 141
    iget-object v2, v2, Lokhttp3/internal/connection/RealCall;->t:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 142
    .line 143
    invoke-virtual {v2, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    if-nez v0, :cond_2

    .line 147
    .line 148
    iget-object p0, p0, Lokhttp3/internal/connection/ConnectPlan;->s:Ljava/net/Socket;

    .line 149
    .line 150
    if-eqz p0, :cond_2

    .line 151
    .line 152
    invoke-static {p0}, Lokhttp3/internal/_UtilJvmKt;->c(Ljava/net/Socket;)V

    .line 153
    .line 154
    .line 155
    :cond_2
    throw v1

    .line 156
    :cond_3
    const-string p0, "TCP already connected"

    .line 157
    .line 158
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    return-object v1
.end method

.method public final h()V
    .locals 4

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/ConnectPlan;->k:Lokhttp3/Route;

    .line 2
    .line 3
    iget-object v0, v0, Lokhttp3/Route;->b:Ljava/net/Proxy;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget-object v1, Lokhttp3/internal/connection/ConnectPlan$WhenMappings;->a:[I

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    aget v0, v1, v0

    .line 20
    .line 21
    :goto_0
    const/4 v1, 0x1

    .line 22
    if-eq v0, v1, :cond_1

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    if-eq v0, v1, :cond_1

    .line 26
    .line 27
    new-instance v0, Ljava/net/Socket;

    .line 28
    .line 29
    iget-object v1, p0, Lokhttp3/internal/connection/ConnectPlan;->k:Lokhttp3/Route;

    .line 30
    .line 31
    iget-object v1, v1, Lokhttp3/Route;->b:Ljava/net/Proxy;

    .line 32
    .line 33
    invoke-direct {v0, v1}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    iget-object v0, p0, Lokhttp3/internal/connection/ConnectPlan;->k:Lokhttp3/Route;

    .line 38
    .line 39
    iget-object v0, v0, Lokhttp3/Route;->a:Lokhttp3/Address;

    .line 40
    .line 41
    iget-object v0, v0, Lokhttp3/Address;->b:Ljavax/net/SocketFactory;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    :goto_1
    iput-object v0, p0, Lokhttp3/internal/connection/ConnectPlan;->s:Ljava/net/Socket;

    .line 51
    .line 52
    iget-boolean v1, p0, Lokhttp3/internal/connection/ConnectPlan;->r:Z

    .line 53
    .line 54
    if-nez v1, :cond_3

    .line 55
    .line 56
    iget v1, p0, Lokhttp3/internal/connection/ConnectPlan;->f:I

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 59
    .line 60
    .line 61
    :try_start_0
    sget-object v1, Lokhttp3/internal/platform/Platform;->a:Lokhttp3/internal/platform/Platform;

    .line 62
    .line 63
    sget-object v1, Lokhttp3/internal/platform/Platform;->a:Lokhttp3/internal/platform/Platform;

    .line 64
    .line 65
    iget-object v2, p0, Lokhttp3/internal/connection/ConnectPlan;->k:Lokhttp3/Route;

    .line 66
    .line 67
    iget-object v2, v2, Lokhttp3/Route;->c:Ljava/net/InetSocketAddress;

    .line 68
    .line 69
    iget v3, p0, Lokhttp3/internal/connection/ConnectPlan;->e:I

    .line 70
    .line 71
    invoke-virtual {v1, v0, v2, v3}, Lokhttp3/internal/platform/Platform;->f(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_1

    .line 72
    .line 73
    .line 74
    :try_start_1
    new-instance v1, La/pmi;

    .line 75
    .line 76
    invoke-direct {v1, v0}, La/pmi;-><init>(Ljava/net/Socket;)V

    .line 77
    .line 78
    .line 79
    new-instance v0, Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;

    .line 80
    .line 81
    invoke-direct {v0, v1}, Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;-><init>(La/njk0;)V

    .line 82
    .line 83
    .line 84
    iput-object v0, p0, Lokhttp3/internal/connection/ConnectPlan;->w:Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 85
    .line 86
    return-void

    .line 87
    :catch_0
    move-exception p0

    .line 88
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    const-string v1, "throw with null exception"

    .line 93
    .line 94
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_2

    .line 99
    .line 100
    return-void

    .line 101
    :cond_2
    new-instance v0, Ljava/io/IOException;

    .line 102
    .line 103
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 104
    .line 105
    .line 106
    throw v0

    .line 107
    :catch_1
    move-exception v0

    .line 108
    new-instance v1, Ljava/net/ConnectException;

    .line 109
    .line 110
    new-instance v2, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string v3, "Failed to connect to "

    .line 113
    .line 114
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    iget-object p0, p0, Lokhttp3/internal/connection/ConnectPlan;->k:Lokhttp3/Route;

    .line 118
    .line 119
    iget-object p0, p0, Lokhttp3/Route;->c:Ljava/net/InetSocketAddress;

    .line 120
    .line 121
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-direct {v1, p0}, Ljava/net/ConnectException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 132
    .line 133
    .line 134
    throw v1

    .line 135
    :cond_3
    const-string p0, "canceled"

    .line 136
    .line 137
    invoke-static {p0}, La/ohq;->l(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    return-void
.end method

.method public final i(Ljavax/net/ssl/SSLSocket;Lokhttp3/ConnectionSpec;)V
    .locals 10

    .line 1
    const-string v0, "\n            |Hostname "

    .line 2
    .line 3
    iget-object v1, p0, Lokhttp3/internal/connection/ConnectPlan;->k:Lokhttp3/Route;

    .line 4
    .line 5
    iget-object v1, v1, Lokhttp3/Route;->a:Lokhttp3/Address;

    .line 6
    .line 7
    :try_start_0
    iget-boolean v2, p2, Lokhttp3/ConnectionSpec;->b:Z

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    sget-object v2, Lokhttp3/internal/platform/Platform;->a:Lokhttp3/internal/platform/Platform;

    .line 12
    .line 13
    sget-object v2, Lokhttp3/internal/platform/Platform;->a:Lokhttp3/internal/platform/Platform;

    .line 14
    .line 15
    iget-object v3, v1, Lokhttp3/Address;->i:Lokhttp3/HttpUrl;

    .line 16
    .line 17
    iget-object v3, v3, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v4, v1, Lokhttp3/Address;->j:Ljava/util/List;

    .line 20
    .line 21
    iget-object v5, p0, Lokhttp3/internal/connection/ConnectPlan;->k:Lokhttp3/Route;

    .line 22
    .line 23
    iget-object v5, v5, Lokhttp3/Route;->d:La/qg9;

    .line 24
    .line 25
    invoke-virtual {v2, p1, v3, v4, v5}, Lokhttp3/internal/platform/Platform;->e(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;La/qg9;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    goto/16 :goto_4

    .line 31
    .line 32
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-static {v2}, Lokhttp3/Handshake$Companion;->a(Ljavax/net/ssl/SSLSession;)Lokhttp3/Handshake;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    iget-object v4, v1, Lokhttp3/Address;->d:Ljavax/net/ssl/HostnameVerifier;

    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    iget-object v5, v1, Lokhttp3/Address;->i:Lokhttp3/HttpUrl;

    .line 52
    .line 53
    iget-object v5, v5, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 54
    .line 55
    invoke-interface {v4, v5, v2}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    .line 56
    .line 57
    .line 58
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    const-string v4, "SHA-256"

    .line 60
    .line 61
    const/4 v5, 0x0

    .line 62
    const-string v6, "Hostname "

    .line 63
    .line 64
    if-nez v2, :cond_2

    .line 65
    .line 66
    :try_start_1
    invoke-virtual {v3}, Lokhttp3/Handshake;->a()Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    if-nez p2, :cond_1

    .line 75
    .line 76
    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    check-cast p0, Ljava/security/cert/X509Certificate;

    .line 84
    .line 85
    new-instance p2, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 86
    .line 87
    new-instance v2, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, v1, Lokhttp3/Address;->i:Lokhttp3/HttpUrl;

    .line 93
    .line 94
    iget-object v0, v0, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v0, " not verified:\n            |    certificate: "

    .line 100
    .line 101
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    sget-object v0, Lokhttp3/CertificatePinner;->c:Lokhttp3/CertificatePinner;

    .line 105
    .line 106
    sget-object v0, La/qg9;->d:La/qg9;

    .line 107
    .line 108
    invoke-virtual {p0}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-interface {v0}, Ljava/security/Key;->getEncoded()[B

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-static {v0}, La/gl5;->m([B)La/qg9;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-virtual {v0, v4}, La/qg9;->d(Ljava/lang/String;)La/qg9;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {v0}, La/qg9;->a()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    const-string v1, "sha256/"

    .line 132
    .line 133
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string v0, "\n            |    DN: "

    .line 141
    .line 142
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-interface {v0}, Ljava/security/Principal;->getName()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    const-string v0, "\n            |    subjectAltNames: "

    .line 157
    .line 158
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    const/4 v0, 0x7

    .line 162
    invoke-static {p0, v0}, Lokhttp3/internal/tls/OkHostnameVerifier;->a(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    const/4 v1, 0x2

    .line 167
    invoke-static {p0, v1}, Lokhttp3/internal/tls/OkHostnameVerifier;->a(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-static {v0, p0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    const-string p0, "\n            "

    .line 179
    .line 180
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-static {p0}, La/ntm0;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    invoke-direct {p2, p0}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    throw p2

    .line 195
    :cond_1
    new-instance p0, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 196
    .line 197
    new-instance p2, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    invoke-direct {p2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    iget-object v0, v1, Lokhttp3/Address;->i:Lokhttp3/HttpUrl;

    .line 203
    .line 204
    iget-object v0, v0, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 205
    .line 206
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    const-string v0, " not verified (no certificates)"

    .line 210
    .line 211
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object p2

    .line 218
    invoke-direct {p0, p2}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    throw p0

    .line 222
    :cond_2
    sget-object v0, Lokhttp3/internal/tls/CertificateBlocklist;->a:Ljava/util/Set;

    .line 223
    .line 224
    invoke-virtual {v3}, Lokhttp3/Handshake;->a()Ljava/util/List;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    if-eqz v0, :cond_3

    .line 229
    .line 230
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 231
    .line 232
    .line 233
    move-result v2

    .line 234
    if-eqz v2, :cond_3

    .line 235
    .line 236
    goto :goto_2

    .line 237
    :cond_3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 242
    .line 243
    .line 244
    move-result v2

    .line 245
    if-eqz v2, :cond_5

    .line 246
    .line 247
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    check-cast v2, Ljava/security/cert/Certificate;

    .line 252
    .line 253
    sget-object v7, Lokhttp3/CertificatePinner;->c:Lokhttp3/CertificatePinner;

    .line 254
    .line 255
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    check-cast v2, Ljava/security/cert/X509Certificate;

    .line 259
    .line 260
    sget-object v7, La/qg9;->d:La/qg9;

    .line 261
    .line 262
    invoke-virtual {v2}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    invoke-interface {v2}, Ljava/security/Key;->getEncoded()[B

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    invoke-static {v2}, La/gl5;->m([B)La/qg9;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    invoke-virtual {v2, v4}, La/qg9;->d(Ljava/lang/String;)La/qg9;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    sget-object v7, Lokhttp3/internal/tls/CertificateBlocklist;->a:Ljava/util/Set;

    .line 282
    .line 283
    invoke-interface {v7, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    move-result v2

    .line 287
    if-nez v2, :cond_4

    .line 288
    .line 289
    goto :goto_1

    .line 290
    :cond_4
    new-instance p0, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 291
    .line 292
    new-instance p2, Ljava/lang/StringBuilder;

    .line 293
    .line 294
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 295
    .line 296
    .line 297
    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    iget-object v0, v1, Lokhttp3/Address;->i:Lokhttp3/HttpUrl;

    .line 301
    .line 302
    iget-object v0, v0, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 303
    .line 304
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    const-string v0, " not verified (blocklisted by OkHttp)"

    .line 308
    .line 309
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object p2

    .line 316
    invoke-direct {p0, p2}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    throw p0

    .line 320
    :cond_5
    :goto_2
    iget-object v0, v1, Lokhttp3/Address;->e:Lokhttp3/CertificatePinner;

    .line 321
    .line 322
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    new-instance v2, Lokhttp3/Handshake;

    .line 326
    .line 327
    iget-object v4, v3, Lokhttp3/Handshake;->a:Lokhttp3/TlsVersion;

    .line 328
    .line 329
    iget-object v6, v3, Lokhttp3/Handshake;->b:Lokhttp3/CipherSuite;

    .line 330
    .line 331
    iget-object v7, v3, Lokhttp3/Handshake;->c:Ljava/util/List;

    .line 332
    .line 333
    new-instance v8, La/kk0;

    .line 334
    .line 335
    const/16 v9, 0x13

    .line 336
    .line 337
    invoke-direct {v8, v0, v3, v1, v9}, La/kk0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 338
    .line 339
    .line 340
    invoke-direct {v2, v4, v6, v7, v8}, Lokhttp3/Handshake;-><init>(Lokhttp3/TlsVersion;Lokhttp3/CipherSuite;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V

    .line 341
    .line 342
    .line 343
    iput-object v2, p0, Lokhttp3/internal/connection/ConnectPlan;->u:Lokhttp3/Handshake;

    .line 344
    .line 345
    iget-object v1, v1, Lokhttp3/Address;->i:Lokhttp3/HttpUrl;

    .line 346
    .line 347
    iget-object v1, v1, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 348
    .line 349
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    iget-object v0, v0, Lokhttp3/CertificatePinner;->a:Ljava/util/Set;

    .line 353
    .line 354
    check-cast v0, Ljava/lang/Iterable;

    .line 355
    .line 356
    sget-object v1, La/iun;->a:La/iun;

    .line 357
    .line 358
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 363
    .line 364
    .line 365
    move-result v2

    .line 366
    const/4 v3, 0x0

    .line 367
    if-nez v2, :cond_8

    .line 368
    .line 369
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    iget-boolean p2, p2, Lokhttp3/ConnectionSpec;->b:Z

    .line 373
    .line 374
    if-eqz p2, :cond_6

    .line 375
    .line 376
    sget-object p2, Lokhttp3/internal/platform/Platform;->a:Lokhttp3/internal/platform/Platform;

    .line 377
    .line 378
    sget-object p2, Lokhttp3/internal/platform/Platform;->a:Lokhttp3/internal/platform/Platform;

    .line 379
    .line 380
    invoke-virtual {p2, p1}, Lokhttp3/internal/platform/Platform;->h(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v3

    .line 384
    :cond_6
    iput-object p1, p0, Lokhttp3/internal/connection/ConnectPlan;->t:Ljava/net/Socket;

    .line 385
    .line 386
    new-instance p2, La/pmi;

    .line 387
    .line 388
    invoke-direct {p2, p1}, La/pmi;-><init>(Ljava/net/Socket;)V

    .line 389
    .line 390
    .line 391
    new-instance v0, Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;

    .line 392
    .line 393
    invoke-direct {v0, p2}, Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;-><init>(La/njk0;)V

    .line 394
    .line 395
    .line 396
    iput-object v0, p0, Lokhttp3/internal/connection/ConnectPlan;->w:Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;

    .line 397
    .line 398
    if-eqz v3, :cond_7

    .line 399
    .line 400
    sget-object p2, Lokhttp3/Protocol;->b:Lokhttp3/Protocol$Companion;

    .line 401
    .line 402
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    invoke-static {v3}, Lokhttp3/Protocol$Companion;->a(Ljava/lang/String;)Lokhttp3/Protocol;

    .line 406
    .line 407
    .line 408
    move-result-object p2

    .line 409
    goto :goto_3

    .line 410
    :cond_7
    sget-object p2, Lokhttp3/Protocol;->d:Lokhttp3/Protocol;

    .line 411
    .line 412
    :goto_3
    iput-object p2, p0, Lokhttp3/internal/connection/ConnectPlan;->v:Lokhttp3/Protocol;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 413
    .line 414
    sget-object p0, Lokhttp3/internal/platform/Platform;->a:Lokhttp3/internal/platform/Platform;

    .line 415
    .line 416
    sget-object p0, Lokhttp3/internal/platform/Platform;->a:Lokhttp3/internal/platform/Platform;

    .line 417
    .line 418
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 419
    .line 420
    .line 421
    return-void

    .line 422
    :cond_8
    :try_start_2
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object p0

    .line 426
    check-cast p0, Lokhttp3/CertificatePinner$Pin;

    .line 427
    .line 428
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    const-string p0, "**."

    .line 432
    .line 433
    invoke-static {v3, p0, v5}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 434
    .line 435
    .line 436
    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 437
    :goto_4
    sget-object p2, Lokhttp3/internal/platform/Platform;->a:Lokhttp3/internal/platform/Platform;

    .line 438
    .line 439
    sget-object p2, Lokhttp3/internal/platform/Platform;->a:Lokhttp3/internal/platform/Platform;

    .line 440
    .line 441
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    invoke-static {p1}, Lokhttp3/internal/_UtilJvmKt;->c(Ljava/net/Socket;)V

    .line 445
    .line 446
    .line 447
    throw p0
.end method

.method public final isReady()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/connection/ConnectPlan;->v:Lokhttp3/Protocol;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final j()Lokhttp3/internal/connection/RoutePlanner$ConnectResult;
    .locals 12

    .line 1
    iget-object v1, p0, Lokhttp3/internal/connection/ConnectPlan;->n:Lokhttp3/Request;

    .line 2
    .line 3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v2, p0, Lokhttp3/internal/connection/ConnectPlan;->k:Lokhttp3/Route;

    .line 7
    .line 8
    iget-object v3, v2, Lokhttp3/Route;->a:Lokhttp3/Address;

    .line 9
    .line 10
    iget-object v3, v3, Lokhttp3/Address;->i:Lokhttp3/HttpUrl;

    .line 11
    .line 12
    new-instance v4, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v5, "CONNECT "

    .line 15
    .line 16
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 v5, 0x1

    .line 20
    invoke-static {v3, v5}, Lokhttp3/internal/_UtilJvmKt;->i(Lokhttp3/HttpUrl;Z)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v3, " HTTP/1.1"

    .line 28
    .line 29
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    :goto_0
    new-instance v4, Lokhttp3/internal/http1/Http1ExchangeCodec;

    .line 37
    .line 38
    iget-object v6, p0, Lokhttp3/internal/connection/ConnectPlan;->w:Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;

    .line 39
    .line 40
    const-string v7, "socket"

    .line 41
    .line 42
    const/4 v8, 0x0

    .line 43
    if-eqz v6, :cond_a

    .line 44
    .line 45
    invoke-direct {v4, v8, p0, v6}, Lokhttp3/internal/http1/Http1ExchangeCodec;-><init>(Lokhttp3/OkHttpClient;Lokhttp3/internal/http/ExchangeCodec$Carrier;Lokhttp3/internal/connection/BufferedSocket;)V

    .line 46
    .line 47
    .line 48
    iget-object v6, p0, Lokhttp3/internal/connection/ConnectPlan;->w:Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;

    .line 49
    .line 50
    if-eqz v6, :cond_9

    .line 51
    .line 52
    iget-object v6, v6, Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;->b:La/zae0;

    .line 53
    .line 54
    iget-object v6, v6, La/zae0;->a:La/emk0;

    .line 55
    .line 56
    invoke-interface {v6}, La/emk0;->h()La/fmq0;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    iget v9, p0, Lokhttp3/internal/connection/ConnectPlan;->c:I

    .line 61
    .line 62
    int-to-long v9, v9

    .line 63
    sget-object v11, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 64
    .line 65
    invoke-virtual {v6, v9, v10, v11}, La/fmq0;->g(JLjava/util/concurrent/TimeUnit;)La/fmq0;

    .line 66
    .line 67
    .line 68
    iget-object v6, p0, Lokhttp3/internal/connection/ConnectPlan;->w:Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;

    .line 69
    .line 70
    if-eqz v6, :cond_8

    .line 71
    .line 72
    iget-object v6, v6, Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;->c:La/yae0;

    .line 73
    .line 74
    iget-object v6, v6, La/yae0;->a:La/s5k0;

    .line 75
    .line 76
    invoke-interface {v6}, La/s5k0;->h()La/fmq0;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    iget v7, p0, Lokhttp3/internal/connection/ConnectPlan;->d:I

    .line 81
    .line 82
    int-to-long v9, v7

    .line 83
    invoke-virtual {v6, v9, v10, v11}, La/fmq0;->g(JLjava/util/concurrent/TimeUnit;)La/fmq0;

    .line 84
    .line 85
    .line 86
    iget-object v6, v1, Lokhttp3/Request;->c:Lokhttp3/Headers;

    .line 87
    .line 88
    invoke-virtual {v4, v6, v3}, Lokhttp3/internal/http1/Http1ExchangeCodec;->m(Lokhttp3/Headers;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4}, Lokhttp3/internal/http1/Http1ExchangeCodec;->a()V

    .line 92
    .line 93
    .line 94
    const/4 v6, 0x0

    .line 95
    invoke-virtual {v4, v6}, Lokhttp3/internal/http1/Http1ExchangeCodec;->g(Z)Lokhttp3/Response$Builder;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    iput-object v1, v6, Lokhttp3/Response$Builder;->a:Lokhttp3/Request;

    .line 103
    .line 104
    invoke-virtual {v6}, Lokhttp3/Response$Builder;->a()Lokhttp3/Response;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    iget v6, v1, Lokhttp3/Response;->d:I

    .line 109
    .line 110
    invoke-virtual {v4, v1}, Lokhttp3/internal/http1/Http1ExchangeCodec;->l(Lokhttp3/Response;)V

    .line 111
    .line 112
    .line 113
    const/16 v4, 0xc8

    .line 114
    .line 115
    if-eq v6, v4, :cond_4

    .line 116
    .line 117
    const/16 v4, 0x197

    .line 118
    .line 119
    if-ne v6, v4, :cond_3

    .line 120
    .line 121
    iget-object v4, v2, Lokhttp3/Route;->a:Lokhttp3/Address;

    .line 122
    .line 123
    iget-object v4, v4, Lokhttp3/Address;->f:Lokhttp3/Authenticator;

    .line 124
    .line 125
    invoke-interface {v4, v2, v1}, Lokhttp3/Authenticator;->d(Lokhttp3/Route;Lokhttp3/Response;)Lokhttp3/Request;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    if-eqz v4, :cond_2

    .line 130
    .line 131
    const-string v6, "Connection"

    .line 132
    .line 133
    iget-object v1, v1, Lokhttp3/Response;->f:Lokhttp3/Headers;

    .line 134
    .line 135
    invoke-virtual {v1, v6}, Lokhttp3/Headers;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    if-nez v1, :cond_0

    .line 140
    .line 141
    move-object v1, v8

    .line 142
    :cond_0
    const-string v6, "close"

    .line 143
    .line 144
    invoke-virtual {v6, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-eqz v1, :cond_1

    .line 149
    .line 150
    move-object v3, v4

    .line 151
    goto :goto_1

    .line 152
    :cond_1
    move-object v1, v4

    .line 153
    goto :goto_0

    .line 154
    :cond_2
    const-string v0, "Failed to authenticate with proxy"

    .line 155
    .line 156
    invoke-static {v0}, La/ohq;->l(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    return-object v8

    .line 160
    :cond_3
    const-string v0, "Unexpected response code for CONNECT: "

    .line 161
    .line 162
    invoke-static {v6, v0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-static {v0}, La/ohq;->l(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    return-object v8

    .line 170
    :cond_4
    move-object v3, v8

    .line 171
    :goto_1
    if-nez v3, :cond_5

    .line 172
    .line 173
    new-instance v1, Lokhttp3/internal/connection/RoutePlanner$ConnectResult;

    .line 174
    .line 175
    const/4 v2, 0x6

    .line 176
    invoke-direct {v1, p0, v8, v8, v2}, Lokhttp3/internal/connection/RoutePlanner$ConnectResult;-><init>(Lokhttp3/internal/connection/RoutePlanner$Plan;Lokhttp3/internal/connection/ConnectPlan;Ljava/lang/Throwable;I)V

    .line 177
    .line 178
    .line 179
    return-object v1

    .line 180
    :cond_5
    iget-object v1, p0, Lokhttp3/internal/connection/ConnectPlan;->s:Ljava/net/Socket;

    .line 181
    .line 182
    if-eqz v1, :cond_6

    .line 183
    .line 184
    invoke-static {v1}, Lokhttp3/internal/_UtilJvmKt;->c(Ljava/net/Socket;)V

    .line 185
    .line 186
    .line 187
    :cond_6
    iget v1, p0, Lokhttp3/internal/connection/ConnectPlan;->m:I

    .line 188
    .line 189
    add-int/lit8 v2, v1, 0x1

    .line 190
    .line 191
    const/16 v1, 0x15

    .line 192
    .line 193
    if-ge v2, v1, :cond_7

    .line 194
    .line 195
    iget-object v1, p0, Lokhttp3/internal/connection/ConnectPlan;->i:Lokhttp3/internal/connection/RealCall;

    .line 196
    .line 197
    iget-object v1, v1, Lokhttp3/internal/connection/RealCall;->e:Lokhttp3/EventListener;

    .line 198
    .line 199
    iget-object v4, p0, Lokhttp3/internal/connection/ConnectPlan;->i:Lokhttp3/internal/connection/RealCall;

    .line 200
    .line 201
    iget-object v5, p0, Lokhttp3/internal/connection/ConnectPlan;->k:Lokhttp3/Route;

    .line 202
    .line 203
    iget-object v6, v5, Lokhttp3/Route;->c:Ljava/net/InetSocketAddress;

    .line 204
    .line 205
    iget-object v5, v5, Lokhttp3/Route;->b:Ljava/net/Proxy;

    .line 206
    .line 207
    invoke-virtual {v1, v4, v6, v5, v8}, Lokhttp3/EventListener;->g(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;)V

    .line 208
    .line 209
    .line 210
    new-instance v9, Lokhttp3/internal/connection/RoutePlanner$ConnectResult;

    .line 211
    .line 212
    const/4 v6, 0x0

    .line 213
    const/16 v7, 0x39

    .line 214
    .line 215
    const/4 v1, 0x0

    .line 216
    const/4 v4, 0x0

    .line 217
    const/4 v5, 0x0

    .line 218
    move-object v0, p0

    .line 219
    invoke-static/range {v0 .. v7}, Lokhttp3/internal/connection/ConnectPlan;->k(Lokhttp3/internal/connection/ConnectPlan;Lokhttp3/Route;ILokhttp3/Request;IZLokhttp3/internal/ech/EchRetryPlan;I)Lokhttp3/internal/connection/ConnectPlan;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    const/4 v2, 0x4

    .line 224
    invoke-direct {v9, p0, v1, v8, v2}, Lokhttp3/internal/connection/RoutePlanner$ConnectResult;-><init>(Lokhttp3/internal/connection/RoutePlanner$Plan;Lokhttp3/internal/connection/ConnectPlan;Ljava/lang/Throwable;I)V

    .line 225
    .line 226
    .line 227
    return-object v9

    .line 228
    :cond_7
    new-instance v1, Ljava/net/ProtocolException;

    .line 229
    .line 230
    const-string v2, "Too many tunnel connections attempted: 21"

    .line 231
    .line 232
    invoke-direct {v1, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    iget-object v2, p0, Lokhttp3/internal/connection/ConnectPlan;->i:Lokhttp3/internal/connection/RealCall;

    .line 236
    .line 237
    iget-object v2, v2, Lokhttp3/internal/connection/RealCall;->e:Lokhttp3/EventListener;

    .line 238
    .line 239
    iget-object v3, p0, Lokhttp3/internal/connection/ConnectPlan;->i:Lokhttp3/internal/connection/RealCall;

    .line 240
    .line 241
    iget-object v4, p0, Lokhttp3/internal/connection/ConnectPlan;->k:Lokhttp3/Route;

    .line 242
    .line 243
    iget-object v5, v4, Lokhttp3/Route;->c:Ljava/net/InetSocketAddress;

    .line 244
    .line 245
    iget-object v4, v4, Lokhttp3/Route;->b:Ljava/net/Proxy;

    .line 246
    .line 247
    invoke-virtual {v2, v3, v5, v4, v1}, Lokhttp3/EventListener;->h(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Ljava/io/IOException;)V

    .line 248
    .line 249
    .line 250
    iget-object v2, p0, Lokhttp3/internal/connection/ConnectPlan;->k:Lokhttp3/Route;

    .line 251
    .line 252
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    new-instance v2, Lokhttp3/internal/connection/RoutePlanner$ConnectResult;

    .line 256
    .line 257
    const/4 v3, 0x2

    .line 258
    invoke-direct {v2, p0, v8, v1, v3}, Lokhttp3/internal/connection/RoutePlanner$ConnectResult;-><init>(Lokhttp3/internal/connection/RoutePlanner$Plan;Lokhttp3/internal/connection/ConnectPlan;Ljava/lang/Throwable;I)V

    .line 259
    .line 260
    .line 261
    return-object v2

    .line 262
    :cond_8
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    throw v8

    .line 266
    :cond_9
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    throw v8

    .line 270
    :cond_a
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    throw v8
.end method

.method public final l(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Lokhttp3/internal/connection/ConnectPlan;
    .locals 11

    .line 1
    iget v0, p0, Lokhttp3/internal/connection/ConnectPlan;->o:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    move v7, v1

    .line 10
    :goto_0
    if-ge v7, v2, :cond_4

    .line 11
    .line 12
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lokhttp3/ConnectionSpec;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-boolean v3, v1, Lokhttp3/ConnectionSpec;->a:Z

    .line 22
    .line 23
    if-nez v3, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    iget-object v3, v1, Lokhttp3/ConnectionSpec;->d:[Ljava/lang/String;

    .line 27
    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    invoke-virtual {p2}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    sget-object v5, La/r950;->a:La/r950;

    .line 35
    .line 36
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-static {v3, v4, v5}, Lokhttp3/internal/_UtilCommonKt;->h([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-nez v3, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    iget-object v1, v1, Lokhttp3/ConnectionSpec;->c:[Ljava/lang/String;

    .line 47
    .line 48
    if-eqz v1, :cond_2

    .line 49
    .line 50
    invoke-virtual {p2}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    sget-object v4, Lokhttp3/CipherSuite;->c:Lokhttp3/CipherSuite$Companion$ORDER_BY_NAME$1;

    .line 55
    .line 56
    invoke-static {v1, v3, v4}, Lokhttp3/internal/_UtilCommonKt;->h([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-nez v1, :cond_2

    .line 61
    .line 62
    :goto_1
    add-int/lit8 v7, v7, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    const/4 p1, -0x1

    .line 66
    if-eq v0, p1, :cond_3

    .line 67
    .line 68
    const/4 p1, 0x1

    .line 69
    :goto_2
    move v8, p1

    .line 70
    goto :goto_3

    .line 71
    :cond_3
    const/4 p1, 0x0

    .line 72
    goto :goto_2

    .line 73
    :goto_3
    const/4 v9, 0x0

    .line 74
    const/16 v10, 0x27

    .line 75
    .line 76
    const/4 v4, 0x0

    .line 77
    const/4 v5, 0x0

    .line 78
    const/4 v6, 0x0

    .line 79
    move-object v3, p0

    .line 80
    invoke-static/range {v3 .. v10}, Lokhttp3/internal/connection/ConnectPlan;->k(Lokhttp3/internal/connection/ConnectPlan;Lokhttp3/Route;ILokhttp3/Request;IZLokhttp3/internal/ech/EchRetryPlan;I)Lokhttp3/internal/connection/ConnectPlan;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0

    .line 85
    :cond_4
    const/4 p0, 0x0

    .line 86
    return-object p0
.end method

.method public final m(Ljava/util/List;Ljavax/net/ssl/SSLSocket;Ljavax/net/ssl/SSLException;)Lokhttp3/internal/connection/ConnectPlan;
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lokhttp3/internal/connection/ConnectPlan;->q:Lokhttp3/internal/ech/EchRetryPlan;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object v0, Lokhttp3/internal/platform/Platform;->a:Lokhttp3/internal/platform/Platform;

    .line 10
    .line 11
    sget-object v0, Lokhttp3/internal/platform/Platform;->a:Lokhttp3/internal/platform/Platform;

    .line 12
    .line 13
    invoke-virtual {v0, p3}, Lokhttp3/internal/platform/Platform;->g(Ljavax/net/ssl/SSLException;)Lokhttp3/internal/ech/EchRetryPlan;

    .line 14
    .line 15
    .line 16
    move-result-object v7

    .line 17
    if-eqz v7, :cond_2

    .line 18
    .line 19
    iget-object p1, p0, Lokhttp3/internal/connection/ConnectPlan;->k:Lokhttp3/Route;

    .line 20
    .line 21
    iget-object p1, p1, Lokhttp3/Route;->a:Lokhttp3/Address;

    .line 22
    .line 23
    iget-object p1, p1, Lokhttp3/Address;->d:Ljavax/net/ssl/HostnameVerifier;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v0, v7, Lokhttp3/internal/ech/EchRetryPlan;->a:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p2}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-interface {p1, v0, p2}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    new-instance v2, Lokhttp3/Route;

    .line 41
    .line 42
    iget-object p1, p0, Lokhttp3/internal/connection/ConnectPlan;->k:Lokhttp3/Route;

    .line 43
    .line 44
    iget-object p2, p1, Lokhttp3/Route;->a:Lokhttp3/Address;

    .line 45
    .line 46
    iget-object p3, p1, Lokhttp3/Route;->b:Ljava/net/Proxy;

    .line 47
    .line 48
    iget-object p1, p1, Lokhttp3/Route;->c:Ljava/net/InetSocketAddress;

    .line 49
    .line 50
    iget-object v0, v7, Lokhttp3/internal/ech/EchRetryPlan;->b:La/qg9;

    .line 51
    .line 52
    invoke-direct {v2, p2, p3, p1, v0}, Lokhttp3/Route;-><init>(Lokhttp3/Address;Ljava/net/Proxy;Ljava/net/InetSocketAddress;La/qg9;)V

    .line 53
    .line 54
    .line 55
    const/4 v6, 0x0

    .line 56
    const/16 v8, 0x1e

    .line 57
    .line 58
    const/4 v3, 0x0

    .line 59
    const/4 v4, 0x0

    .line 60
    const/4 v5, 0x0

    .line 61
    move-object v1, p0

    .line 62
    invoke-static/range {v1 .. v8}, Lokhttp3/internal/connection/ConnectPlan;->k(Lokhttp3/internal/connection/ConnectPlan;Lokhttp3/Route;ILokhttp3/Request;IZLokhttp3/internal/ech/EchRetryPlan;I)Lokhttp3/internal/connection/ConnectPlan;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    :cond_1
    new-instance p0, Lokhttp3/internal/ech/EchUntrustedException;

    .line 68
    .line 69
    new-instance p1, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    const-string p2, "public_name \'"

    .line 72
    .line 73
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    iget-object p2, v7, Lokhttp3/internal/ech/EchRetryPlan;->a:Ljava/lang/String;

    .line 77
    .line 78
    const-string v0, "\' not verified"

    .line 79
    .line 80
    invoke-static {p1, p2, v0}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-direct {p0, p1, p3}, Ljavax/net/ssl/SSLException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    throw p0

    .line 88
    :cond_2
    move-object v1, p0

    .line 89
    iget-boolean p0, v1, Lokhttp3/internal/connection/ConnectPlan;->h:Z

    .line 90
    .line 91
    if-nez p0, :cond_3

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_3
    instance-of p0, p3, Ljavax/net/ssl/SSLHandshakeException;

    .line 95
    .line 96
    if-eqz p0, :cond_4

    .line 97
    .line 98
    invoke-virtual {p3}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    instance-of p0, p0, Ljava/security/cert/CertificateException;

    .line 103
    .line 104
    if-eqz p0, :cond_4

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_4
    instance-of p0, p3, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 108
    .line 109
    if-eqz p0, :cond_5

    .line 110
    .line 111
    :goto_0
    const/4 p0, 0x0

    .line 112
    return-object p0

    .line 113
    :cond_5
    invoke-virtual {v1, p1, p2}, Lokhttp3/internal/connection/ConnectPlan;->l(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Lokhttp3/internal/connection/ConnectPlan;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0
.end method

.method public final n(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Lokhttp3/internal/connection/ConnectPlan;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lokhttp3/internal/connection/ConnectPlan;->o:I

    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-virtual {p0, p1, p2}, Lokhttp3/internal/connection/ConnectPlan;->l(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Lokhttp3/internal/connection/ConnectPlan;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_1
    new-instance v0, Ljava/net/UnknownServiceException;

    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v2, "Unable to find acceptable protocols. isFallback="

    .line 22
    .line 23
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v2, ", modes="

    .line 27
    .line 28
    const-string v3, ", supported protocols="

    .line 29
    .line 30
    iget-boolean p0, p0, Lokhttp3/internal/connection/ConnectPlan;->p:Z

    .line 31
    .line 32
    invoke-static {v1, v2, p1, v3, p0}, La/vqd;->y(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-static {p0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-direct {v0, p0}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v0
.end method
