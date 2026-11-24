.class public final Lokhttp3/internal/ws/RealWebSocket;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/WebSocket;
.implements Lokhttp3/internal/ws/WebSocketReader$FrameCallback;
.implements Lokhttp3/internal/concurrent/Lockable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/ws/RealWebSocket$Close;,
        Lokhttp3/internal/ws/RealWebSocket$Companion;,
        Lokhttp3/internal/ws/RealWebSocket$Message;,
        Lokhttp3/internal/ws/RealWebSocket$WriterTask;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0004\u0005\u0006\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lokhttp3/internal/ws/RealWebSocket;",
        "Lokhttp3/WebSocket;",
        "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;",
        "Lokhttp3/internal/concurrent/Lockable;",
        "Message",
        "Close",
        "WriterTask",
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


# static fields
.field public static final x:Ljava/util/List;


# instance fields
.field public final a:Lokhttp3/WebSocketListener;

.field public final b:Ljava/util/Random;

.field public final c:J

.field public d:Lokhttp3/internal/ws/WebSocketExtensions;

.field public final e:S

.field public final f:J

.field public final g:Ljava/lang/String;

.field public h:Lokhttp3/internal/connection/RealCall;

.field public i:Lokhttp3/internal/concurrent/Task;

.field public j:Lokhttp3/internal/ws/WebSocketReader;

.field public k:Lokhttp3/internal/ws/WebSocketWriter;

.field public final l:Lokhttp3/internal/concurrent/TaskQueue;

.field public m:Ljava/lang/String;

.field public n:Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;

.field public final o:Ljava/util/ArrayDeque;

.field public final p:Ljava/util/ArrayDeque;

.field public q:J

.field public r:Z

.field public s:I

.field public t:Ljava/lang/String;

.field public u:Z

.field public v:I

.field public w:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lokhttp3/Protocol;->d:Lokhttp3/Protocol;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lokhttp3/internal/ws/RealWebSocket;->x:Ljava/util/List;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/Request;Lokhttp3/WebSocketListener;Ljava/util/Random;JJJ)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p3, p0, Lokhttp3/internal/ws/RealWebSocket;->a:Lokhttp3/WebSocketListener;

    .line 8
    .line 9
    iput-object p4, p0, Lokhttp3/internal/ws/RealWebSocket;->b:Ljava/util/Random;

    .line 10
    .line 11
    iput-wide p5, p0, Lokhttp3/internal/ws/RealWebSocket;->c:J

    .line 12
    .line 13
    const/4 p3, 0x0

    .line 14
    iput-object p3, p0, Lokhttp3/internal/ws/RealWebSocket;->d:Lokhttp3/internal/ws/WebSocketExtensions;

    .line 15
    .line 16
    long-to-int p5, p7

    .line 17
    iput-short p5, p0, Lokhttp3/internal/ws/RealWebSocket;->e:S

    .line 18
    .line 19
    iput-wide p9, p0, Lokhttp3/internal/ws/RealWebSocket;->f:J

    .line 20
    .line 21
    invoke-virtual {p1}, Lokhttp3/internal/concurrent/TaskRunner;->newQueue()Lokhttp3/internal/concurrent/TaskQueue;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lokhttp3/internal/ws/RealWebSocket;->l:Lokhttp3/internal/concurrent/TaskQueue;

    .line 26
    .line 27
    new-instance p1, Ljava/util/ArrayDeque;

    .line 28
    .line 29
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lokhttp3/internal/ws/RealWebSocket;->o:Ljava/util/ArrayDeque;

    .line 33
    .line 34
    new-instance p1, Ljava/util/ArrayDeque;

    .line 35
    .line 36
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lokhttp3/internal/ws/RealWebSocket;->p:Ljava/util/ArrayDeque;

    .line 40
    .line 41
    const/4 p1, -0x1

    .line 42
    iput p1, p0, Lokhttp3/internal/ws/RealWebSocket;->s:I

    .line 43
    .line 44
    iget-object p1, p2, Lokhttp3/Request;->b:Ljava/lang/String;

    .line 45
    .line 46
    const-string p2, "GET"

    .line 47
    .line 48
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    if-eqz p2, :cond_0

    .line 53
    .line 54
    sget-object p1, La/qg9;->d:La/qg9;

    .line 55
    .line 56
    const/16 p1, 0x10

    .line 57
    .line 58
    new-array p1, p1, [B

    .line 59
    .line 60
    invoke-virtual {p4, p1}, Ljava/util/Random;->nextBytes([B)V

    .line 61
    .line 62
    .line 63
    invoke-static {p1}, La/gl5;->m([B)La/qg9;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1}, La/qg9;->a()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iput-object p1, p0, Lokhttp3/internal/ws/RealWebSocket;->g:Ljava/lang/String;

    .line 72
    .line 73
    return-void

    .line 74
    :cond_0
    const-string p0, "Request must be GET: "

    .line 75
    .line 76
    invoke-static {p1, p0}, La/hny;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw p3
.end method

.method public static j(Lokhttp3/internal/ws/RealWebSocket;Ljava/lang/Exception;Lokhttp3/Response;I)V
    .locals 11

    .line 1
    and-int/lit8 v0, p3, 0x2

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move-object p2, v1

    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x4

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    const/4 v2, 0x1

    .line 11
    if-eqz p3, :cond_1

    .line 12
    .line 13
    move p3, v0

    .line 14
    goto :goto_0

    .line 15
    :cond_1
    move p3, v2

    .line 16
    :goto_0
    new-instance v3, La/mie0;

    .line 17
    .line 18
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    monitor-enter p0

    .line 22
    :try_start_0
    iget-boolean v4, p0, Lokhttp3/internal/ws/RealWebSocket;->u:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    if-eqz v4, :cond_2

    .line 25
    .line 26
    monitor-exit p0

    .line 27
    return-void

    .line 28
    :cond_2
    :try_start_1
    iput-boolean v2, p0, Lokhttp3/internal/ws/RealWebSocket;->u:Z

    .line 29
    .line 30
    iget-object v2, p0, Lokhttp3/internal/ws/RealWebSocket;->n:Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;

    .line 31
    .line 32
    iget-object v4, p0, Lokhttp3/internal/ws/RealWebSocket;->k:Lokhttp3/internal/ws/WebSocketWriter;

    .line 33
    .line 34
    iput-object v4, v3, La/mie0;->a:Ljava/lang/Object;

    .line 35
    .line 36
    iput-object v1, p0, Lokhttp3/internal/ws/RealWebSocket;->k:Lokhttp3/internal/ws/WebSocketWriter;

    .line 37
    .line 38
    if-nez p3, :cond_3

    .line 39
    .line 40
    if-eqz v4, :cond_3

    .line 41
    .line 42
    iget-object v5, p0, Lokhttp3/internal/ws/RealWebSocket;->l:Lokhttp3/internal/concurrent/TaskQueue;

    .line 43
    .line 44
    new-instance v1, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    iget-object v4, p0, Lokhttp3/internal/ws/RealWebSocket;->m:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v4, " writer close"

    .line 55
    .line 56
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    new-instance v9, La/sbe0;

    .line 64
    .line 65
    invoke-direct {v9, v3, v0}, La/sbe0;-><init>(La/mie0;B)V

    .line 66
    .line 67
    .line 68
    const/4 v10, 0x2

    .line 69
    const-wide/16 v7, 0x0

    .line 70
    .line 71
    invoke-static/range {v5 .. v10}, Lokhttp3/internal/concurrent/TaskQueue;->c(Lokhttp3/internal/concurrent/TaskQueue;Ljava/lang/String;JLkotlin/jvm/functions/Function0;I)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :catchall_0
    move-exception v0

    .line 76
    move-object p1, v0

    .line 77
    goto :goto_2

    .line 78
    :cond_3
    :goto_1
    iget-object v0, p0, Lokhttp3/internal/ws/RealWebSocket;->l:Lokhttp3/internal/concurrent/TaskQueue;

    .line 79
    .line 80
    invoke-virtual {v0}, Lokhttp3/internal/concurrent/TaskQueue;->g()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    .line 82
    .line 83
    monitor-exit p0

    .line 84
    :try_start_2
    iget-object v0, p0, Lokhttp3/internal/ws/RealWebSocket;->a:Lokhttp3/WebSocketListener;

    .line 85
    .line 86
    invoke-virtual {v0, p0, p1, p2}, Lokhttp3/WebSocketListener;->c(Lokhttp3/WebSocket;Ljava/lang/Throwable;Lokhttp3/Response;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 87
    .line 88
    .line 89
    if-eqz v2, :cond_4

    .line 90
    .line 91
    invoke-virtual {v2}, Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;->cancel()V

    .line 92
    .line 93
    .line 94
    :cond_4
    if-eqz p3, :cond_5

    .line 95
    .line 96
    iget-object p0, v3, La/mie0;->a:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p0, Lokhttp3/internal/ws/WebSocketWriter;

    .line 99
    .line 100
    if-eqz p0, :cond_5

    .line 101
    .line 102
    invoke-static {p0}, Lokhttp3/internal/_UtilCommonKt;->b(Ljava/io/Closeable;)V

    .line 103
    .line 104
    .line 105
    :cond_5
    return-void

    .line 106
    :catchall_1
    move-exception v0

    .line 107
    move-object p0, v0

    .line 108
    if-eqz v2, :cond_6

    .line 109
    .line 110
    invoke-virtual {v2}, Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;->cancel()V

    .line 111
    .line 112
    .line 113
    :cond_6
    if-eqz p3, :cond_7

    .line 114
    .line 115
    iget-object p1, v3, La/mie0;->a:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast p1, Lokhttp3/internal/ws/WebSocketWriter;

    .line 118
    .line 119
    if-eqz p1, :cond_7

    .line 120
    .line 121
    invoke-static {p1}, Lokhttp3/internal/_UtilCommonKt;->b(Ljava/io/Closeable;)V

    .line 122
    .line 123
    .line 124
    :cond_7
    throw p0

    .line 125
    :goto_2
    monitor-exit p0

    .line 126
    throw p1
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Z
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/qg9;->d:La/qg9;

    .line 5
    .line 6
    invoke-static {p1}, La/gl5;->i(Ljava/lang/String;)La/qg9;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    monitor-enter p0

    .line 11
    :try_start_0
    iget-boolean v0, p0, Lokhttp3/internal/ws/RealWebSocket;->u:Z

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-nez v0, :cond_2

    .line 15
    .line 16
    iget-boolean v0, p0, Lokhttp3/internal/ws/RealWebSocket;->r:Z

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-wide v2, p0, Lokhttp3/internal/ws/RealWebSocket;->q:J

    .line 22
    .line 23
    iget-object v0, p1, La/qg9;->a:[B

    .line 24
    .line 25
    array-length v4, v0

    .line 26
    int-to-long v4, v4

    .line 27
    add-long/2addr v4, v2

    .line 28
    const-wide/32 v6, 0x1000000

    .line 29
    .line 30
    .line 31
    cmp-long v4, v4, v6

    .line 32
    .line 33
    if-lez v4, :cond_1

    .line 34
    .line 35
    const/16 p1, 0x3e9

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    invoke-virtual {p0, p1, v0}, Lokhttp3/internal/ws/RealWebSocket;->f(ILjava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    monitor-exit p0

    .line 42
    return v1

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    :try_start_1
    array-length v0, v0

    .line 46
    int-to-long v0, v0

    .line 47
    add-long/2addr v2, v0

    .line 48
    iput-wide v2, p0, Lokhttp3/internal/ws/RealWebSocket;->q:J

    .line 49
    .line 50
    iget-object v0, p0, Lokhttp3/internal/ws/RealWebSocket;->p:Ljava/util/ArrayDeque;

    .line 51
    .line 52
    new-instance v1, Lokhttp3/internal/ws/RealWebSocket$Message;

    .line 53
    .line 54
    invoke-direct {v1, p1}, Lokhttp3/internal/ws/RealWebSocket$Message;-><init>(La/qg9;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lokhttp3/internal/ws/RealWebSocket;->l()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    .line 62
    .line 63
    monitor-exit p0

    .line 64
    const/4 p0, 0x1

    .line 65
    return p0

    .line 66
    :cond_2
    :goto_0
    monitor-exit p0

    .line 67
    return v1

    .line 68
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 69
    throw p1
.end method

.method public final b(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/ws/RealWebSocket;->a:Lokhttp3/WebSocketListener;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Lokhttp3/WebSocketListener;->d(Lokhttp3/internal/ws/RealWebSocket;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final declared-synchronized c(La/qg9;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    iget-boolean v0, p0, Lokhttp3/internal/ws/RealWebSocket;->u:Z

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-boolean v0, p0, Lokhttp3/internal/ws/RealWebSocket;->r:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lokhttp3/internal/ws/RealWebSocket;->p:Ljava/util/ArrayDeque;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/ws/RealWebSocket;->o:Ljava/util/ArrayDeque;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lokhttp3/internal/ws/RealWebSocket;->l()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    monitor-exit p0

    .line 33
    return-void

    .line 34
    :cond_1
    :goto_0
    monitor-exit p0

    .line 35
    return-void

    .line 36
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    throw p1
.end method

.method public final declared-synchronized d(La/qg9;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput-boolean p1, p0, Lokhttp3/internal/ws/RealWebSocket;->w:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    throw p1
.end method

.method public final e(La/qg9;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final f(ILjava/lang/String;)Z
    .locals 8

    .line 1
    iget-wide v0, p0, Lokhttp3/internal/ws/RealWebSocket;->f:J

    .line 2
    .line 3
    const-string v2, "reason.size() > 123: "

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    invoke-static {p1}, Lokhttp3/internal/ws/WebSocketProtocol;->a(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    if-nez v3, :cond_4

    .line 11
    .line 12
    if-eqz p2, :cond_1

    .line 13
    .line 14
    sget-object v3, La/qg9;->d:La/qg9;

    .line 15
    .line 16
    invoke-static {p2}, La/gl5;->i(Ljava/lang/String;)La/qg9;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    iget-object v4, v3, La/qg9;->a:[B

    .line 21
    .line 22
    array-length v4, v4

    .line 23
    int-to-long v4, v4

    .line 24
    const-wide/16 v6, 0x7b

    .line 25
    .line 26
    cmp-long v4, v4, v6

    .line 27
    .line 28
    if-gtz v4, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {v2, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p2

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    goto :goto_2

    .line 47
    :cond_1
    const/4 v3, 0x0

    .line 48
    :goto_0
    iget-boolean p2, p0, Lokhttp3/internal/ws/RealWebSocket;->u:Z

    .line 49
    .line 50
    if-nez p2, :cond_3

    .line 51
    .line 52
    iget-boolean p2, p0, Lokhttp3/internal/ws/RealWebSocket;->r:Z

    .line 53
    .line 54
    if-eqz p2, :cond_2

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    const/4 p2, 0x1

    .line 58
    iput-boolean p2, p0, Lokhttp3/internal/ws/RealWebSocket;->r:Z

    .line 59
    .line 60
    iget-object v2, p0, Lokhttp3/internal/ws/RealWebSocket;->p:Ljava/util/ArrayDeque;

    .line 61
    .line 62
    new-instance v4, Lokhttp3/internal/ws/RealWebSocket$Close;

    .line 63
    .line 64
    invoke-direct {v4, p1, v0, v1, v3}, Lokhttp3/internal/ws/RealWebSocket$Close;-><init>(IJLa/qg9;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, v4}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lokhttp3/internal/ws/RealWebSocket;->l()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    .line 73
    monitor-exit p0

    .line 74
    return p2

    .line 75
    :cond_3
    :goto_1
    monitor-exit p0

    .line 76
    const/4 p0, 0x0

    .line 77
    return p0

    .line 78
    :cond_4
    :try_start_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 79
    .line 80
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw p1

    .line 88
    :goto_2
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 89
    throw p1
.end method

.method public final g(ILjava/lang/String;)V
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    if-eq p1, v0, :cond_1

    .line 3
    .line 4
    monitor-enter p0

    .line 5
    :try_start_0
    iget v1, p0, Lokhttp3/internal/ws/RealWebSocket;->s:I

    .line 6
    .line 7
    if-ne v1, v0, :cond_0

    .line 8
    .line 9
    iput p1, p0, Lokhttp3/internal/ws/RealWebSocket;->s:I

    .line 10
    .line 11
    iput-object p2, p0, Lokhttp3/internal/ws/RealWebSocket;->t:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    monitor-exit p0

    .line 14
    iget-object v0, p0, Lokhttp3/internal/ws/RealWebSocket;->a:Lokhttp3/WebSocketListener;

    .line 15
    .line 16
    invoke-virtual {v0, p0, p1, p2}, Lokhttp3/WebSocketListener;->b(Lokhttp3/internal/ws/RealWebSocket;ILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    :try_start_1
    const-string p1, "already closed"

    .line 23
    .line 24
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    :goto_0
    monitor-exit p0

    .line 31
    throw p1

    .line 32
    :cond_1
    const-string p0, "Failed requirement."

    .line 33
    .line 34
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final h()V
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/ws/RealWebSocket;->h:Lokhttp3/internal/connection/RealCall;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lokhttp3/internal/connection/RealCall;->cancel()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final i(Lokhttp3/Response;)La/njk0;
    .locals 6

    .line 1
    iget-object v0, p1, Lokhttp3/Response;->f:Lokhttp3/Headers;

    .line 2
    .line 3
    iget v1, p1, Lokhttp3/Response;->d:I

    .line 4
    .line 5
    const/16 v2, 0x65

    .line 6
    .line 7
    const/16 v3, 0x27

    .line 8
    .line 9
    if-ne v1, v2, :cond_7

    .line 10
    .line 11
    const-string v1, "Connection"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lokhttp3/Headers;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x0

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    move-object v1, v2

    .line 21
    :cond_0
    const-string v4, "Upgrade"

    .line 22
    .line 23
    invoke-virtual {v4, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-eqz v5, :cond_6

    .line 28
    .line 29
    invoke-virtual {v0, v4}, Lokhttp3/Headers;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    move-object v1, v2

    .line 36
    :cond_1
    const-string v4, "websocket"

    .line 37
    .line 38
    invoke-virtual {v4, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_5

    .line 43
    .line 44
    const-string v1, "Sec-WebSocket-Accept"

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lokhttp3/Headers;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    move-object v0, v2

    .line 53
    :cond_2
    sget-object v1, La/qg9;->d:La/qg9;

    .line 54
    .line 55
    new-instance v1, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    iget-object p0, p0, Lokhttp3/internal/ws/RealWebSocket;->g:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string p0, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11"

    .line 66
    .line 67
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-static {p0}, La/gl5;->i(Ljava/lang/String;)La/qg9;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    const-string v1, "SHA-1"

    .line 79
    .line 80
    invoke-virtual {p0, v1}, La/qg9;->d(Ljava/lang/String;)La/qg9;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-virtual {p0}, La/qg9;->a()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_4

    .line 93
    .line 94
    iget-object p0, p1, Lokhttp3/Response;->h:La/njk0;

    .line 95
    .line 96
    if-eqz p0, :cond_3

    .line 97
    .line 98
    return-object p0

    .line 99
    :cond_3
    const-string p0, "Web Socket socket missing: bad interceptor?"

    .line 100
    .line 101
    invoke-static {p0}, La/e9d0;->j(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    return-object v2

    .line 105
    :cond_4
    new-instance p1, Ljava/net/ProtocolException;

    .line 106
    .line 107
    new-instance v1, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    const-string v2, "Expected \'Sec-WebSocket-Accept\' header value \'"

    .line 110
    .line 111
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string p0, "\' but was \'"

    .line 118
    .line 119
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-direct {p1, p0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw p1

    .line 136
    :cond_5
    new-instance p0, Ljava/net/ProtocolException;

    .line 137
    .line 138
    const-string p1, "Expected \'Upgrade\' header value \'websocket\' but was \'"

    .line 139
    .line 140
    invoke-static {v3, p1, v1}, La/hne;->l(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-direct {p0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw p0

    .line 148
    :cond_6
    new-instance p0, Ljava/net/ProtocolException;

    .line 149
    .line 150
    const-string p1, "Expected \'Connection\' header value \'Upgrade\' but was \'"

    .line 151
    .line 152
    invoke-static {v3, p1, v1}, La/hne;->l(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-direct {p0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw p0

    .line 160
    :cond_7
    new-instance p0, Ljava/net/ProtocolException;

    .line 161
    .line 162
    new-instance v0, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    const-string v2, "Expected HTTP 101 response but was \'"

    .line 165
    .line 166
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    const/16 v1, 0x20

    .line 173
    .line 174
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    iget-object p1, p1, Lokhttp3/Response;->c:Ljava/lang/String;

    .line 178
    .line 179
    invoke-static {v0, p1, v3}, La/axq;->m(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-direct {p0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    throw p0
.end method

.method public final k()V
    .locals 11

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lokhttp3/internal/ws/RealWebSocket;->s:I

    .line 3
    .line 4
    iget-object v1, p0, Lokhttp3/internal/ws/RealWebSocket;->t:Ljava/lang/String;

    .line 5
    .line 6
    iget-object v2, p0, Lokhttp3/internal/ws/RealWebSocket;->j:Lokhttp3/internal/ws/WebSocketReader;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    iput-object v3, p0, Lokhttp3/internal/ws/RealWebSocket;->j:Lokhttp3/internal/ws/WebSocketReader;

    .line 10
    .line 11
    iget-boolean v4, p0, Lokhttp3/internal/ws/RealWebSocket;->r:Z

    .line 12
    .line 13
    if-eqz v4, :cond_1

    .line 14
    .line 15
    iget-object v4, p0, Lokhttp3/internal/ws/RealWebSocket;->p:Ljava/util/ArrayDeque;

    .line 16
    .line 17
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    iget-object v4, p0, Lokhttp3/internal/ws/RealWebSocket;->k:Lokhttp3/internal/ws/WebSocketWriter;

    .line 24
    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    iput-object v3, p0, Lokhttp3/internal/ws/RealWebSocket;->k:Lokhttp3/internal/ws/WebSocketWriter;

    .line 28
    .line 29
    iget-object v5, p0, Lokhttp3/internal/ws/RealWebSocket;->l:Lokhttp3/internal/concurrent/TaskQueue;

    .line 30
    .line 31
    new-instance v3, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    iget-object v6, p0, Lokhttp3/internal/ws/RealWebSocket;->m:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v6, " writer close"

    .line 42
    .line 43
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    new-instance v9, La/p7d0;

    .line 51
    .line 52
    const/16 v3, 0x18

    .line 53
    .line 54
    invoke-direct {v9, v4, v3}, La/p7d0;-><init>(Ljava/lang/Object;B)V

    .line 55
    .line 56
    .line 57
    const/4 v10, 0x2

    .line 58
    const-wide/16 v7, 0x0

    .line 59
    .line 60
    invoke-static/range {v5 .. v10}, Lokhttp3/internal/concurrent/TaskQueue;->c(Lokhttp3/internal/concurrent/TaskQueue;Ljava/lang/String;JLkotlin/jvm/functions/Function0;I)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catchall_0
    move-exception v0

    .line 65
    goto :goto_2

    .line 66
    :cond_0
    :goto_0
    iget-object v3, p0, Lokhttp3/internal/ws/RealWebSocket;->l:Lokhttp3/internal/concurrent/TaskQueue;

    .line 67
    .line 68
    invoke-virtual {v3}, Lokhttp3/internal/concurrent/TaskQueue;->g()V

    .line 69
    .line 70
    .line 71
    :cond_1
    iget-boolean v3, p0, Lokhttp3/internal/ws/RealWebSocket;->u:Z

    .line 72
    .line 73
    if-nez v3, :cond_2

    .line 74
    .line 75
    iget-object v3, p0, Lokhttp3/internal/ws/RealWebSocket;->k:Lokhttp3/internal/ws/WebSocketWriter;

    .line 76
    .line 77
    if-nez v3, :cond_2

    .line 78
    .line 79
    iget v3, p0, Lokhttp3/internal/ws/RealWebSocket;->s:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    .line 81
    const/4 v4, -0x1

    .line 82
    if-eq v3, v4, :cond_2

    .line 83
    .line 84
    const/4 v3, 0x1

    .line 85
    goto :goto_1

    .line 86
    :cond_2
    const/4 v3, 0x0

    .line 87
    :goto_1
    monitor-exit p0

    .line 88
    if-eqz v3, :cond_3

    .line 89
    .line 90
    iget-object v3, p0, Lokhttp3/internal/ws/RealWebSocket;->a:Lokhttp3/WebSocketListener;

    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3, p0, v0, v1}, Lokhttp3/WebSocketListener;->a(Lokhttp3/WebSocket;ILjava/lang/String;)V

    .line 96
    .line 97
    .line 98
    :cond_3
    if-eqz v2, :cond_4

    .line 99
    .line 100
    invoke-static {v2}, Lokhttp3/internal/_UtilCommonKt;->b(Ljava/io/Closeable;)V

    .line 101
    .line 102
    .line 103
    :cond_4
    return-void

    .line 104
    :goto_2
    monitor-exit p0

    .line 105
    throw v0
.end method

.method public final l()V
    .locals 3

    .line 1
    sget-object v0, Lokhttp3/internal/_UtilJvmKt;->a:Ljava/util/TimeZone;

    .line 2
    .line 3
    iget-object v0, p0, Lokhttp3/internal/ws/RealWebSocket;->i:Lokhttp3/internal/concurrent/Task;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lokhttp3/internal/ws/RealWebSocket;->l:Lokhttp3/internal/concurrent/TaskQueue;

    .line 8
    .line 9
    const-wide/16 v1, 0x0

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1, v2}, Lokhttp3/internal/concurrent/TaskQueue;->d(Lokhttp3/internal/concurrent/Task;J)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final m()Z
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-boolean v0, v1, Lokhttp3/internal/ws/RealWebSocket;->u:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    monitor-exit p0

    .line 10
    return v2

    .line 11
    :cond_0
    :try_start_1
    iget-object v3, v1, Lokhttp3/internal/ws/RealWebSocket;->k:Lokhttp3/internal/ws/WebSocketWriter;

    .line 12
    .line 13
    iget-object v0, v1, Lokhttp3/internal/ws/RealWebSocket;->o:Ljava/util/ArrayDeque;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v4, 0x1

    .line 20
    const/4 v5, 0x0

    .line 21
    const/4 v6, -0x1

    .line 22
    if-nez v0, :cond_5

    .line 23
    .line 24
    iget-object v7, v1, Lokhttp3/internal/ws/RealWebSocket;->p:Ljava/util/ArrayDeque;

    .line 25
    .line 26
    invoke-virtual {v7}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    instance-of v8, v7, Lokhttp3/internal/ws/RealWebSocket$Close;

    .line 31
    .line 32
    if-eqz v8, :cond_3

    .line 33
    .line 34
    iget v8, v1, Lokhttp3/internal/ws/RealWebSocket;->s:I

    .line 35
    .line 36
    iget-object v9, v1, Lokhttp3/internal/ws/RealWebSocket;->t:Ljava/lang/String;

    .line 37
    .line 38
    if-eq v8, v6, :cond_2

    .line 39
    .line 40
    iget-object v6, v1, Lokhttp3/internal/ws/RealWebSocket;->k:Lokhttp3/internal/ws/WebSocketWriter;

    .line 41
    .line 42
    iput-object v5, v1, Lokhttp3/internal/ws/RealWebSocket;->k:Lokhttp3/internal/ws/WebSocketWriter;

    .line 43
    .line 44
    if-eqz v6, :cond_1

    .line 45
    .line 46
    iget-object v5, v1, Lokhttp3/internal/ws/RealWebSocket;->j:Lokhttp3/internal/ws/WebSocketReader;

    .line 47
    .line 48
    if-nez v5, :cond_1

    .line 49
    .line 50
    move v2, v4

    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    goto/16 :goto_5

    .line 54
    .line 55
    :cond_1
    :goto_0
    iget-object v5, v1, Lokhttp3/internal/ws/RealWebSocket;->l:Lokhttp3/internal/concurrent/TaskQueue;

    .line 56
    .line 57
    invoke-virtual {v5}, Lokhttp3/internal/concurrent/TaskQueue;->g()V

    .line 58
    .line 59
    .line 60
    :goto_1
    move-object v5, v7

    .line 61
    goto :goto_2

    .line 62
    :cond_2
    move-object v6, v7

    .line 63
    check-cast v6, Lokhttp3/internal/ws/RealWebSocket$Close;

    .line 64
    .line 65
    iget-wide v10, v6, Lokhttp3/internal/ws/RealWebSocket$Close;->c:J

    .line 66
    .line 67
    iget-object v12, v1, Lokhttp3/internal/ws/RealWebSocket;->l:Lokhttp3/internal/concurrent/TaskQueue;

    .line 68
    .line 69
    new-instance v6, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    iget-object v13, v1, Lokhttp3/internal/ws/RealWebSocket;->m:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v13, " cancel"

    .line 80
    .line 81
    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v13

    .line 88
    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 89
    .line 90
    invoke-virtual {v6, v10, v11}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 91
    .line 92
    .line 93
    move-result-wide v14

    .line 94
    new-instance v6, La/p7d0;

    .line 95
    .line 96
    const/16 v10, 0x17

    .line 97
    .line 98
    invoke-direct {v6, v1, v10}, La/p7d0;-><init>(Ljava/lang/Object;B)V

    .line 99
    .line 100
    .line 101
    const/16 v17, 0x4

    .line 102
    .line 103
    move-object/from16 v16, v6

    .line 104
    .line 105
    invoke-static/range {v12 .. v17}, Lokhttp3/internal/concurrent/TaskQueue;->c(Lokhttp3/internal/concurrent/TaskQueue;Ljava/lang/String;JLkotlin/jvm/functions/Function0;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 106
    .line 107
    .line 108
    move-object v6, v5

    .line 109
    goto :goto_1

    .line 110
    :cond_3
    if-nez v7, :cond_4

    .line 111
    .line 112
    monitor-exit p0

    .line 113
    return v2

    .line 114
    :cond_4
    move-object v9, v5

    .line 115
    move v8, v6

    .line 116
    move-object v6, v9

    .line 117
    goto :goto_1

    .line 118
    :cond_5
    move-object v9, v5

    .line 119
    move v8, v6

    .line 120
    move-object v6, v9

    .line 121
    :goto_2
    monitor-exit p0

    .line 122
    if-eqz v0, :cond_6

    .line 123
    .line 124
    :try_start_2
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    check-cast v0, La/qg9;

    .line 128
    .line 129
    const/16 v1, 0xa

    .line 130
    .line 131
    invoke-virtual {v3, v1, v0}, Lokhttp3/internal/ws/WebSocketWriter;->a(ILa/qg9;)V

    .line 132
    .line 133
    .line 134
    goto :goto_3

    .line 135
    :catchall_1
    move-exception v0

    .line 136
    goto/16 :goto_4

    .line 137
    .line 138
    :cond_6
    instance-of v0, v5, Lokhttp3/internal/ws/RealWebSocket$Message;

    .line 139
    .line 140
    if-eqz v0, :cond_7

    .line 141
    .line 142
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    move-object v0, v5

    .line 146
    check-cast v0, Lokhttp3/internal/ws/RealWebSocket$Message;

    .line 147
    .line 148
    iget-object v0, v0, Lokhttp3/internal/ws/RealWebSocket$Message;->a:La/qg9;

    .line 149
    .line 150
    invoke-virtual {v3, v0}, Lokhttp3/internal/ws/WebSocketWriter;->c(La/qg9;)V

    .line 151
    .line 152
    .line 153
    monitor-enter p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 154
    :try_start_3
    iget-wide v2, v1, Lokhttp3/internal/ws/RealWebSocket;->q:J

    .line 155
    .line 156
    check-cast v5, Lokhttp3/internal/ws/RealWebSocket$Message;

    .line 157
    .line 158
    iget-object v0, v5, Lokhttp3/internal/ws/RealWebSocket$Message;->a:La/qg9;

    .line 159
    .line 160
    iget-object v0, v0, La/qg9;->a:[B

    .line 161
    .line 162
    array-length v0, v0

    .line 163
    int-to-long v7, v0

    .line 164
    sub-long/2addr v2, v7

    .line 165
    iput-wide v2, v1, Lokhttp3/internal/ws/RealWebSocket;->q:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 166
    .line 167
    :try_start_4
    monitor-exit p0

    .line 168
    goto :goto_3

    .line 169
    :catchall_2
    move-exception v0

    .line 170
    monitor-exit p0

    .line 171
    throw v0

    .line 172
    :cond_7
    instance-of v0, v5, Lokhttp3/internal/ws/RealWebSocket$Close;

    .line 173
    .line 174
    if-eqz v0, :cond_c

    .line 175
    .line 176
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    move-object v0, v5

    .line 180
    check-cast v0, Lokhttp3/internal/ws/RealWebSocket$Close;

    .line 181
    .line 182
    iget-short v0, v0, Lokhttp3/internal/ws/RealWebSocket$Close;->a:S

    .line 183
    .line 184
    check-cast v5, Lokhttp3/internal/ws/RealWebSocket$Close;

    .line 185
    .line 186
    iget-object v5, v5, Lokhttp3/internal/ws/RealWebSocket$Close;->b:La/qg9;

    .line 187
    .line 188
    sget-object v7, La/qg9;->d:La/qg9;

    .line 189
    .line 190
    invoke-static {v0}, Lokhttp3/internal/ws/WebSocketProtocol;->a(I)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v7

    .line 194
    if-nez v7, :cond_b

    .line 195
    .line 196
    new-instance v7, La/f99;

    .line 197
    .line 198
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v7, v0}, La/f99;->a0(I)V

    .line 202
    .line 203
    .line 204
    if-eqz v5, :cond_8

    .line 205
    .line 206
    invoke-virtual {v7, v5}, La/f99;->T(La/qg9;)V

    .line 207
    .line 208
    .line 209
    :cond_8
    iget-wide v10, v7, La/f99;->b:J

    .line 210
    .line 211
    invoke-virtual {v7, v10, v11}, La/f99;->q0(J)La/qg9;

    .line 212
    .line 213
    .line 214
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 215
    const/16 v5, 0x8

    .line 216
    .line 217
    :try_start_5
    invoke-virtual {v3, v5, v0}, Lokhttp3/internal/ws/WebSocketWriter;->a(ILa/qg9;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 218
    .line 219
    .line 220
    :try_start_6
    iput-boolean v4, v3, Lokhttp3/internal/ws/WebSocketWriter;->h:Z

    .line 221
    .line 222
    if-eqz v2, :cond_9

    .line 223
    .line 224
    iget-object v0, v1, Lokhttp3/internal/ws/RealWebSocket;->a:Lokhttp3/WebSocketListener;

    .line 225
    .line 226
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0, v1, v8, v9}, Lokhttp3/WebSocketListener;->a(Lokhttp3/WebSocket;ILjava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 230
    .line 231
    .line 232
    :cond_9
    :goto_3
    if-eqz v6, :cond_a

    .line 233
    .line 234
    invoke-static {v6}, Lokhttp3/internal/_UtilCommonKt;->b(Ljava/io/Closeable;)V

    .line 235
    .line 236
    .line 237
    :cond_a
    return v4

    .line 238
    :catchall_3
    move-exception v0

    .line 239
    :try_start_7
    iput-boolean v4, v3, Lokhttp3/internal/ws/WebSocketWriter;->h:Z

    .line 240
    .line 241
    throw v0

    .line 242
    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 243
    .line 244
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    throw v0

    .line 252
    :cond_c
    new-instance v0, Ljava/lang/AssertionError;

    .line 253
    .line 254
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 255
    .line 256
    .line 257
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 258
    :goto_4
    if-eqz v6, :cond_d

    .line 259
    .line 260
    invoke-static {v6}, Lokhttp3/internal/_UtilCommonKt;->b(Ljava/io/Closeable;)V

    .line 261
    .line 262
    .line 263
    :cond_d
    throw v0

    .line 264
    :goto_5
    monitor-exit p0

    .line 265
    throw v0
.end method
