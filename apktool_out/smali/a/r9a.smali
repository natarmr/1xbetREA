.class public final La/r9a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ey9;


# instance fields
.field public final a:La/iev;

.field public final b:La/m9a;

.field public final c:La/w5z;

.field public final d:La/j3a;

.field public final e:La/cao0;

.field public final f:La/vz9;

.field public final g:La/lrm0;

.field public final h:La/qcq0;

.field public final i:La/vne;

.field public final j:I

.field public final k:Ljava/lang/Object;

.field public final l:La/c14;

.field public final m:Ljava/util/Map;

.field public final n:Ljava/util/Map;

.field public o:La/doq0;

.field public final p:La/o470;

.field public q:La/yy9;

.field public r:La/n9a;

.field public s:Ljava/util/Map;

.field public t:Ljava/util/LinkedHashMap;

.field public u:La/o9a;

.field public final v:Ljava/util/concurrent/CountDownLatch;

.field public w:Z

.field public final x:Ljava/util/concurrent/CountDownLatch;

.field public y:Ljava/util/Map;

.field public final z:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(La/iev;La/m9a;La/w5z;La/j3a;La/cao0;La/vz9;La/plc;La/lrm0;La/bsm0;La/qcq0;La/vne;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/r9a;->a:La/iev;

    .line 23
    .line 24
    iput-object p2, p0, La/r9a;->b:La/m9a;

    .line 25
    .line 26
    iput-object p3, p0, La/r9a;->c:La/w5z;

    .line 27
    .line 28
    iput-object p4, p0, La/r9a;->d:La/j3a;

    .line 29
    .line 30
    iput-object p5, p0, La/r9a;->e:La/cao0;

    .line 31
    .line 32
    iput-object p6, p0, La/r9a;->f:La/vz9;

    .line 33
    .line 34
    iput-object p8, p0, La/r9a;->g:La/lrm0;

    .line 35
    .line 36
    iput-object p10, p0, La/r9a;->h:La/qcq0;

    .line 37
    .line 38
    iput-object p11, p0, La/r9a;->i:La/vne;

    .line 39
    .line 40
    sget-object p1, La/s9a;->a:La/z04;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    sget-object p2, La/z04;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 46
    .line 47
    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    iput p1, p0, La/r9a;->j:I

    .line 52
    .line 53
    new-instance p1, Ljava/lang/Object;

    .line 54
    .line 55
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, La/r9a;->k:Ljava/lang/Object;

    .line 59
    .line 60
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-static {p1}, La/o2e;->Z(Ljava/lang/Object;)La/c14;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iput-object p1, p0, La/r9a;->l:La/c14;

    .line 67
    .line 68
    new-instance p1, Ljava/util/HashMap;

    .line 69
    .line 70
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iput-object p1, p0, La/r9a;->m:Ljava/util/Map;

    .line 78
    .line 79
    new-instance p1, Ljava/util/HashMap;

    .line 80
    .line 81
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    iput-object p1, p0, La/r9a;->n:Ljava/util/Map;

    .line 89
    .line 90
    const/4 p1, 0x0

    .line 91
    iput-object p1, p0, La/r9a;->p:La/o470;

    .line 92
    .line 93
    sget-object p1, La/o9a;->a:La/o9a;

    .line 94
    .line 95
    iput-object p1, p0, La/r9a;->u:La/o9a;

    .line 96
    .line 97
    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    .line 98
    .line 99
    const/4 p2, 0x1

    .line 100
    invoke-direct {p1, p2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 101
    .line 102
    .line 103
    iput-object p1, p0, La/r9a;->v:Ljava/util/concurrent/CountDownLatch;

    .line 104
    .line 105
    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    .line 106
    .line 107
    invoke-direct {p1, p2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 108
    .line 109
    .line 110
    iput-object p1, p0, La/r9a;->x:Ljava/util/concurrent/CountDownLatch;

    .line 111
    .line 112
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 113
    .line 114
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 115
    .line 116
    .line 117
    iput-object p1, p0, La/r9a;->z:Ljava/util/LinkedHashMap;

    .line 118
    .line 119
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 4
    .line 5
    iget-object v2, p0, La/r9a;->l:La/c14;

    .line 6
    .line 7
    invoke-virtual {v2, v0, v1}, La/c14;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v1, " session finalizing"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v1, "CXCP"

    .line 31
    .line 32
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, "#onSessionFinalized"

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, La/r9a;->n()V

    .line 56
    .line 57
    .line 58
    const-wide/16 v0, 0x0

    .line 59
    .line 60
    invoke-virtual {p0, v0, v1}, La/r9a;->m(J)V

    .line 61
    .line 62
    .line 63
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 64
    .line 65
    .line 66
    :cond_0
    return-void
.end method

.method public final b(La/fy9;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    const-string v0, " Closed"

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v0, "CXCP"

    .line 22
    .line 23
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    new-instance p1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v0, "#onClosed"

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {p1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, La/r9a;->n()V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, La/r9a;->x:Ljava/util/concurrent/CountDownLatch;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 52
    .line 53
    .line 54
    iget-object p0, p0, La/r9a;->p:La/o470;

    .line 55
    .line 56
    if-eqz p0, :cond_0

    .line 57
    .line 58
    invoke-virtual {p0}, La/o470;->j()V

    .line 59
    .line 60
    .line 61
    :cond_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final c(La/fy9;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    const-string p0, " Active"

    .line 13
    .line 14
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string p1, "CXCP"

    .line 22
    .line 23
    invoke-static {p1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final d()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string v1, " session disconnecting"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "CXCP"

    .line 19
    .line 20
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    new-instance v0, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, "#onSessionDisconnected"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, La/r9a;->k()V

    .line 44
    .line 45
    .line 46
    new-instance v0, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v1, "#onSessionDisconnected Await"

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    :try_start_0
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget-object p0, p0, La/r9a;->v:Ljava/util/concurrent/CountDownLatch;

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    .line 71
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 72
    .line 73
    .line 74
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :catchall_0
    move-exception p0

    .line 79
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 80
    .line 81
    .line 82
    throw p0
.end method

.method public final e(La/fy9;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    const-string v0, " Configuration Failed"

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v0, "CXCP"

    .line 22
    .line 23
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    new-instance p1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v0, "#onConfigureFailed"

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {p1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    new-instance p1, La/mev;

    .line 47
    .line 48
    const/16 v0, 0x9

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    invoke-direct {p1, v0, v1}, La/mev;-><init>(IZ)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, La/r9a;->a:La/iev;

    .line 55
    .line 56
    invoke-virtual {v0, p1}, La/iev;->a(La/mev;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, La/r9a;->n()V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, La/r9a;->x:Ljava/util/concurrent/CountDownLatch;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 65
    .line 66
    .line 67
    iget-object p0, p0, La/r9a;->p:La/o470;

    .line 68
    .line 69
    if-eqz p0, :cond_0

    .line 70
    .line 71
    invoke-virtual {p0}, La/o470;->j()V

    .line 72
    .line 73
    .line 74
    :cond_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public final f(La/fy9;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    const-string v1, " Configured"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "CXCP"

    .line 22
    .line 23
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v1, "#configure"

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p1}, La/r9a;->i(La/fy9;)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, La/r9a;->x:Ljava/util/concurrent/CountDownLatch;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 52
    .line 53
    .line 54
    iget-object p0, p0, La/r9a;->p:La/o470;

    .line 55
    .line 56
    if-eqz p0, :cond_0

    .line 57
    .line 58
    invoke-virtual {p0}, La/o470;->j()V

    .line 59
    .line 60
    .line 61
    :cond_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final g(La/fy9;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    const-string p0, " Ready"

    .line 13
    .line 14
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string p1, "CXCP"

    .line 22
    .line 23
    invoke-static {p1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final h(La/fy9;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    const-string p0, " CaptureQueueEmpty"

    .line 13
    .line 14
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string p1, "CXCP"

    .line 22
    .line 23
    invoke-static {p1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final i(La/fy9;)V
    .locals 9

    .line 1
    const-string v0, "Configured "

    .line 2
    .line 3
    iget-object v1, p0, La/r9a;->k:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget-object v2, p0, La/r9a;->r:La/n9a;

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object v2, p0, La/r9a;->c:La/w5z;

    .line 13
    .line 14
    iget-object v3, p0, La/r9a;->m:Ljava/util/Map;

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v4, p0, La/r9a;->n:Ljava/util/Map;

    .line 20
    .line 21
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, p1, v3, v4}, La/w5z;->j(La/fy9;Ljava/util/Map;Ljava/util/Map;)La/uw9;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    new-instance v3, La/n9a;

    .line 29
    .line 30
    new-instance v4, La/ucs0;

    .line 31
    .line 32
    invoke-direct {v4, v2}, La/ucs0;-><init>(La/uw9;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, p1, v4, v2}, La/n9a;-><init>(La/fy9;La/ucs0;La/uw9;)V

    .line 36
    .line 37
    .line 38
    iput-object v3, p0, La/r9a;->r:La/n9a;

    .line 39
    .line 40
    move-object v2, v3

    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    goto/16 :goto_3

    .line 44
    .line 45
    :cond_0
    :goto_0
    iget-object p1, p0, La/r9a;->u:La/o9a;

    .line 46
    .line 47
    sget-object v3, La/o9a;->c:La/o9a;

    .line 48
    .line 49
    if-ne p1, v3, :cond_4

    .line 50
    .line 51
    if-nez v2, :cond_1

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_1
    iget-object p1, p0, La/r9a;->s:Ljava/util/Map;

    .line 55
    .line 56
    const/4 v3, 0x1

    .line 57
    const/4 v4, 0x0

    .line 58
    if-eqz p1, :cond_2

    .line 59
    .line 60
    iget-object p1, p0, La/r9a;->t:Ljava/util/LinkedHashMap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    .line 62
    if-eqz p1, :cond_2

    .line 63
    .line 64
    move p1, v3

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    move p1, v4

    .line 67
    :goto_1
    monitor-exit v1

    .line 68
    if-eqz p1, :cond_3

    .line 69
    .line 70
    invoke-virtual {p0, v4}, La/r9a;->l(Z)V

    .line 71
    .line 72
    .line 73
    :cond_3
    iget-object p1, p0, La/r9a;->k:Ljava/lang/Object;

    .line 74
    .line 75
    monitor-enter p1

    .line 76
    :try_start_1
    const-string v1, "CXCP"

    .line 77
    .line 78
    iget-object v4, p0, La/r9a;->e:La/cao0;

    .line 79
    .line 80
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 84
    .line 85
    .line 86
    move-result-wide v4

    .line 87
    iget-object v6, p0, La/r9a;->o:La/doq0;

    .line 88
    .line 89
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    iget-wide v6, v6, La/doq0;->a:J

    .line 93
    .line 94
    sub-long/2addr v4, v6

    .line 95
    new-instance v6, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v0, " in "

    .line 104
    .line 105
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v0, "%.3f ms"

    .line 109
    .line 110
    long-to-double v4, v4

    .line 111
    const-wide v7, 0x412e848000000000L    # 1000000.0

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    div-double/2addr v4, v7

    .line 117
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    const/4 v4, 0x0

    .line 130
    invoke-static {v4, v0, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 142
    .line 143
    .line 144
    iget-object p0, p0, La/r9a;->a:La/iev;

    .line 145
    .line 146
    iget-object v0, v2, La/n9a;->b:La/ucs0;

    .line 147
    .line 148
    invoke-virtual {p0, v0}, La/iev;->b(La/ucs0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 149
    .line 150
    .line 151
    monitor-exit p1

    .line 152
    return-void

    .line 153
    :catchall_1
    move-exception p0

    .line 154
    monitor-exit p1

    .line 155
    throw p0

    .line 156
    :cond_4
    :goto_2
    monitor-exit v1

    .line 157
    return-void

    .line 158
    :goto_3
    monitor-exit v1

    .line 159
    throw p0
.end method

.method public final j(Ljava/util/Map;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/r9a;->k:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, La/r9a;->u:La/o9a;

    .line 8
    .line 9
    sget-object v2, La/o9a;->d:La/o9a;

    .line 10
    .line 11
    if-eq v1, v2, :cond_5

    .line 12
    .line 13
    sget-object v2, La/o9a;->e:La/o9a;

    .line 14
    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    iget-object v1, p0, La/r9a;->y:Ljava/util/Map;

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    sget-object v1, La/lun;->a:La/lun;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-virtual {p0, v1, p1}, La/r9a;->p(Ljava/util/Map;Ljava/util/Map;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, La/r9a;->y:Ljava/util/Map;

    .line 31
    .line 32
    iget-object v1, p0, La/r9a;->s:Ljava/util/Map;

    .line 33
    .line 34
    const/4 v2, 0x3

    .line 35
    const/4 v3, 0x0

    .line 36
    if-eqz v1, :cond_4

    .line 37
    .line 38
    iget-object v4, p0, La/r9a;->t:Ljava/util/LinkedHashMap;

    .line 39
    .line 40
    if-nez v4, :cond_4

    .line 41
    .line 42
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 43
    .line 44
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    if-eqz v5, :cond_3

    .line 60
    .line 61
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    check-cast v5, Ljava/util/Map$Entry;

    .line 66
    .line 67
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-interface {v1, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    if-eqz v6, :cond_2

    .line 76
    .line 77
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :catchall_0
    move-exception p0

    .line 90
    goto :goto_2

    .line 91
    :cond_3
    invoke-interface {v4}, Ljava/util/Map;->size()I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-ne p1, v1, :cond_4

    .line 100
    .line 101
    iput-object v4, p0, La/r9a;->t:Ljava/util/LinkedHashMap;

    .line 102
    .line 103
    iget-object p1, p0, La/r9a;->i:La/vne;

    .line 104
    .line 105
    new-instance v1, La/wa;

    .line 106
    .line 107
    const/16 v4, 0x1c

    .line 108
    .line 109
    invoke-direct {v1, p0, v3, v4}, La/wa;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 110
    .line 111
    .line 112
    invoke-static {p1, v3, v3, v1, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 113
    .line 114
    .line 115
    :cond_4
    iget-object p1, p0, La/r9a;->i:La/vne;

    .line 116
    .line 117
    new-instance v1, La/p9a;

    .line 118
    .line 119
    const/4 v4, 0x1

    .line 120
    invoke-direct {v1, p0, v3, v4}, La/p9a;-><init>(La/r9a;La/yje;B)V

    .line 121
    .line 122
    .line 123
    invoke-static {p1, v3, v3, v1, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    .line 125
    .line 126
    :cond_5
    :goto_1
    monitor-exit v0

    .line 127
    return-void

    .line 128
    :goto_2
    monitor-exit v0

    .line 129
    throw p0
.end method

.method public final k()V
    .locals 9

    .line 1
    iget-object v0, p0, La/r9a;->k:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, La/r9a;->u:La/o9a;

    .line 5
    .line 6
    sget-object v2, La/o9a;->d:La/o9a;

    .line 7
    .line 8
    if-eq v1, v2, :cond_a

    .line 9
    .line 10
    sget-object v3, La/o9a;->e:La/o9a;

    .line 11
    .line 12
    if-ne v1, v3, :cond_0

    .line 13
    .line 14
    goto/16 :goto_4

    .line 15
    .line 16
    :cond_0
    iput-object v2, p0, La/r9a;->u:La/o9a;

    .line 17
    .line 18
    iget-object v1, p0, La/r9a;->r:La/n9a;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    const/4 v3, 0x0

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    iput-object v2, p0, La/r9a;->r:La/n9a;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    goto/16 :goto_5

    .line 29
    .line 30
    :cond_1
    iget-object v1, p0, La/r9a;->f:La/vz9;

    .line 31
    .line 32
    iget-boolean v1, v1, La/vz9;->d:Z

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    iget-boolean v1, p0, La/r9a;->w:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    const/4 v3, 0x1

    .line 41
    :cond_2
    move-object v1, v2

    .line 42
    :goto_0
    monitor-exit v0

    .line 43
    iget-object v0, p0, La/r9a;->p:La/o470;

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    invoke-virtual {v0}, La/o470;->j()V

    .line 48
    .line 49
    .line 50
    :cond_3
    const-wide/16 v4, 0xbb8

    .line 51
    .line 52
    if-eqz v3, :cond_5

    .line 53
    .line 54
    const-string v0, "CXCP"

    .line 55
    .line 56
    const-string v1, "Waiting for CameraCaptureSession configuration"

    .line 57
    .line 58
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, La/r9a;->h:La/qcq0;

    .line 62
    .line 63
    new-instance v1, La/m91;

    .line 64
    .line 65
    const/4 v3, 0x7

    .line 66
    invoke-direct {v1, p0, v2, v3}, La/m91;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v4, v5, v1}, La/qcq0;->b(JLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, Lkotlin/Unit;

    .line 74
    .line 75
    if-nez v0, :cond_4

    .line 76
    .line 77
    const-string v0, "CXCP"

    .line 78
    .line 79
    const-string v1, "Waiting for CameraCaptureSession configuration timed out"

    .line 80
    .line 81
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    :cond_4
    iget-object v0, p0, La/r9a;->k:Ljava/lang/Object;

    .line 85
    .line 86
    monitor-enter v0

    .line 87
    :try_start_1
    iget-object v1, p0, La/r9a;->r:La/n9a;

    .line 88
    .line 89
    iput-object v2, p0, La/r9a;->r:La/n9a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 90
    .line 91
    monitor-exit v0

    .line 92
    goto :goto_1

    .line 93
    :catchall_1
    move-exception p0

    .line 94
    monitor-exit v0

    .line 95
    throw p0

    .line 96
    :cond_5
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 99
    .line 100
    .line 101
    iget-object v3, p0, La/r9a;->a:La/iev;

    .line 102
    .line 103
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v3, "#onGraphStopping"

    .line 107
    .line 108
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    iget-object v0, p0, La/r9a;->a:La/iev;

    .line 119
    .line 120
    const-string v3, "CXCP"

    .line 121
    .line 122
    new-instance v6, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string v7, " onGraphStopping"

    .line 131
    .line 132
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    invoke-static {v3, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 140
    .line 141
    .line 142
    iget-object v3, v0, La/iev;->e:La/p7m0;

    .line 143
    .line 144
    sget-object v6, La/pev;->b:La/pev;

    .line 145
    .line 146
    invoke-virtual {v3, v6}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    iget-object v3, v0, La/iev;->c:La/bev;

    .line 150
    .line 151
    invoke-virtual {v3, v2}, La/bev;->w(La/ucs0;)V

    .line 152
    .line 153
    .line 154
    iget-object v0, v0, La/iev;->d:Ljava/util/List;

    .line 155
    .line 156
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    if-eqz v3, :cond_6

    .line 165
    .line 166
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    check-cast v3, La/sev;

    .line 171
    .line 172
    iget-object v6, v3, La/sev;->a:La/r2a;

    .line 173
    .line 174
    invoke-virtual {v3}, La/sev;->a()La/b0a;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    sget-object v7, La/pev;->b:La/pev;

    .line 179
    .line 180
    invoke-virtual {v6, v3, v7}, La/r2a;->b(La/b0a;La/rev;)V

    .line 181
    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_6
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 185
    .line 186
    .line 187
    if-eqz v1, :cond_9

    .line 188
    .line 189
    iget-object v0, v1, La/n9a;->b:La/ucs0;

    .line 190
    .line 191
    const-string v3, "CXCP"

    .line 192
    .line 193
    new-instance v6, Ljava/lang/StringBuilder;

    .line 194
    .line 195
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    const-string v7, " Shutdown"

    .line 202
    .line 203
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v6

    .line 210
    invoke-static {v3, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 211
    .line 212
    .line 213
    new-instance v3, Ljava/lang/StringBuilder;

    .line 214
    .line 215
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    const-string v6, "#shutdown"

    .line 222
    .line 223
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v3

    .line 230
    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    iget-object v3, p0, La/r9a;->f:La/vz9;

    .line 234
    .line 235
    iget-boolean v3, v3, La/vz9;->a:Z

    .line 236
    .line 237
    if-eqz v3, :cond_7

    .line 238
    .line 239
    iget-object v3, p0, La/r9a;->h:La/qcq0;

    .line 240
    .line 241
    new-instance v6, La/r72;

    .line 242
    .line 243
    const/4 v7, 0x6

    .line 244
    invoke-direct {v6, p0, v0, v2, v7}, La/r72;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 245
    .line 246
    .line 247
    const-wide/16 v7, 0x7d0

    .line 248
    .line 249
    invoke-virtual {v3, v7, v8, v6}, La/qcq0;->b(JLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    check-cast v0, Lkotlin/Unit;

    .line 254
    .line 255
    if-nez v0, :cond_7

    .line 256
    .line 257
    const-string v0, "CXCP"

    .line 258
    .line 259
    const-string v3, "Failed to abort captures in 2000ms"

    .line 260
    .line 261
    invoke-static {v0, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 262
    .line 263
    .line 264
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 265
    .line 266
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    const-string v3, "#disconnect"

    .line 273
    .line 274
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    iget-object v0, v1, La/n9a;->c:La/uw9;

    .line 285
    .line 286
    invoke-virtual {v0}, La/uw9;->c()V

    .line 287
    .line 288
    .line 289
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 290
    .line 291
    .line 292
    iget-object v0, p0, La/r9a;->f:La/vz9;

    .line 293
    .line 294
    iget-boolean v0, v0, La/vz9;->d:Z

    .line 295
    .line 296
    if-eqz v0, :cond_8

    .line 297
    .line 298
    iget-object v0, p0, La/r9a;->h:La/qcq0;

    .line 299
    .line 300
    new-instance v3, La/r72;

    .line 301
    .line 302
    const/4 v6, 0x5

    .line 303
    invoke-direct {v3, p0, v1, v2, v6}, La/r72;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v0, v4, v5, v3}, La/qcq0;->b(JLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    check-cast v0, Lkotlin/Unit;

    .line 311
    .line 312
    if-nez v0, :cond_8

    .line 313
    .line 314
    const-string v0, "CXCP"

    .line 315
    .line 316
    const-string v1, "Failed to close the capture session in 3000ms"

    .line 317
    .line 318
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 319
    .line 320
    .line 321
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 322
    .line 323
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 324
    .line 325
    .line 326
    iget-object v1, p0, La/r9a;->a:La/iev;

    .line 327
    .line 328
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    const-string v1, "#onGraphStopped"

    .line 332
    .line 333
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    iget-object v0, p0, La/r9a;->a:La/iev;

    .line 344
    .line 345
    invoke-virtual {v0}, La/iev;->c()V

    .line 346
    .line 347
    .line 348
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 349
    .line 350
    .line 351
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 352
    .line 353
    .line 354
    goto :goto_3

    .line 355
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 356
    .line 357
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 358
    .line 359
    .line 360
    iget-object v1, p0, La/r9a;->a:La/iev;

    .line 361
    .line 362
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    const-string v1, "#onGraphStopped"

    .line 366
    .line 367
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    iget-object v0, p0, La/r9a;->a:La/iev;

    .line 378
    .line 379
    invoke-virtual {v0}, La/iev;->c()V

    .line 380
    .line 381
    .line 382
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 383
    .line 384
    .line 385
    :goto_3
    iget-object p0, p0, La/r9a;->v:Ljava/util/concurrent/CountDownLatch;

    .line 386
    .line 387
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 388
    .line 389
    .line 390
    return-void

    .line 391
    :cond_a
    :goto_4
    monitor-exit v0

    .line 392
    return-void

    .line 393
    :goto_5
    monitor-exit v0

    .line 394
    throw p0
.end method

.method public final l(Z)V
    .locals 10

    .line 1
    iget-object v0, p0, La/r9a;->k:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, La/r9a;->r:La/n9a;

    .line 5
    .line 6
    iget-object v2, p0, La/r9a;->s:Ljava/util/Map;

    .line 7
    .line 8
    iget-object v3, p0, La/r9a;->t:Ljava/util/LinkedHashMap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    if-eqz v1, :cond_9

    .line 12
    .line 13
    if-eqz v2, :cond_9

    .line 14
    .line 15
    if-eqz v3, :cond_9

    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v4, "#finalizeOutputConfigurations"

    .line 26
    .line 27
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, La/r9a;->e:La/cao0;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 43
    .line 44
    .line 45
    move-result-wide v4

    .line 46
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-eqz v6, :cond_1

    .line 59
    .line 60
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    check-cast v6, Ljava/util/Map$Entry;

    .line 65
    .line 66
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    check-cast v7, La/mrm0;

    .line 71
    .line 72
    iget v8, v7, La/mrm0;->a:I

    .line 73
    .line 74
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    check-cast v6, La/o03;

    .line 79
    .line 80
    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    if-eqz v7, :cond_0

    .line 85
    .line 86
    check-cast v7, Landroid/view/Surface;

    .line 87
    .line 88
    invoke-virtual {v6, v7}, La/o03;->a(Landroid/view/Surface;)V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_0
    const-string p0, "Required value was null."

    .line 93
    .line 94
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 99
    .line 100
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    if-eqz v7, :cond_2

    .line 116
    .line 117
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    check-cast v7, Ljava/util/Map$Entry;

    .line 122
    .line 123
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    check-cast v7, La/o03;

    .line 128
    .line 129
    invoke-interface {v0, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_2
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    iget-object v1, v1, La/n9a;->a:La/fy9;

    .line 138
    .line 139
    invoke-interface {v1, v0}, La/fy9;->K(Ljava/util/List;)Z

    .line 140
    .line 141
    .line 142
    iget-object v0, p0, La/r9a;->k:Ljava/lang/Object;

    .line 143
    .line 144
    monitor-enter v0

    .line 145
    :try_start_1
    iget-object v1, p0, La/r9a;->u:La/o9a;

    .line 146
    .line 147
    sget-object v6, La/o9a;->c:La/o9a;

    .line 148
    .line 149
    if-ne v1, v6, :cond_7

    .line 150
    .line 151
    iget-object v1, p0, La/r9a;->m:Ljava/util/Map;

    .line 152
    .line 153
    invoke-interface {v1, v3}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 154
    .line 155
    .line 156
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    const/4 v6, 0x1

    .line 169
    if-eqz v3, :cond_5

    .line 170
    .line 171
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    check-cast v3, Ljava/util/Map$Entry;

    .line 176
    .line 177
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v7

    .line 181
    check-cast v7, La/mrm0;

    .line 182
    .line 183
    iget v7, v7, La/mrm0;->a:I

    .line 184
    .line 185
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    check-cast v3, Landroid/view/Surface;

    .line 190
    .line 191
    iget-object v8, p0, La/r9a;->g:La/lrm0;

    .line 192
    .line 193
    invoke-virtual {v8, v7}, La/lrm0;->a(I)La/f3a;

    .line 194
    .line 195
    .line 196
    move-result-object v7

    .line 197
    if-eqz v7, :cond_4

    .line 198
    .line 199
    iget-object v8, v7, La/f3a;->b:Ljava/util/ArrayList;

    .line 200
    .line 201
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 202
    .line 203
    .line 204
    move-result v8

    .line 205
    if-ne v8, v6, :cond_3

    .line 206
    .line 207
    iget-object v6, p0, La/r9a;->n:Ljava/util/Map;

    .line 208
    .line 209
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    iget-object v7, v7, La/f3a;->b:Ljava/util/ArrayList;

    .line 213
    .line 214
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->v0(Ljava/util/List;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v7

    .line 218
    check-cast v7, La/krm0;

    .line 219
    .line 220
    iget v7, v7, La/krm0;->a:I

    .line 221
    .line 222
    new-instance v8, La/xe80;

    .line 223
    .line 224
    invoke-direct {v8, v7}, La/xe80;-><init>(I)V

    .line 225
    .line 226
    .line 227
    invoke-interface {v6, v8, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    goto :goto_2

    .line 231
    :catchall_0
    move-exception p0

    .line 232
    goto/16 :goto_5

    .line 233
    .line 234
    :cond_3
    const-string p0, "Cannot finalize a multi-output stream!"

    .line 235
    .line 236
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 237
    .line 238
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    throw p1

    .line 242
    :cond_4
    const-string p0, "Required value was null."

    .line 243
    .line 244
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 245
    .line 246
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    throw p1

    .line 250
    :cond_5
    const-string v1, "CXCP"

    .line 251
    .line 252
    iget-object v3, p0, La/r9a;->e:La/cao0;

    .line 253
    .line 254
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 258
    .line 259
    .line 260
    move-result-wide v7

    .line 261
    sub-long/2addr v7, v4

    .line 262
    new-instance v3, Ljava/lang/StringBuilder;

    .line 263
    .line 264
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 265
    .line 266
    .line 267
    const-string v4, "Finalized "

    .line 268
    .line 269
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    new-instance v4, Ljava/util/ArrayList;

    .line 273
    .line 274
    invoke-interface {v2}, Ljava/util/Map;->size()I

    .line 275
    .line 276
    .line 277
    move-result v5

    .line 278
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 279
    .line 280
    .line 281
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 290
    .line 291
    .line 292
    move-result v5

    .line 293
    if-eqz v5, :cond_6

    .line 294
    .line 295
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v5

    .line 299
    check-cast v5, Ljava/util/Map$Entry;

    .line 300
    .line 301
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v5

    .line 305
    check-cast v5, La/mrm0;

    .line 306
    .line 307
    iget v9, v5, La/mrm0;->a:I

    .line 308
    .line 309
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    goto :goto_3

    .line 313
    :cond_6
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    const-string v2, " for "

    .line 317
    .line 318
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    const-string v2, " in "

    .line 325
    .line 326
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    new-instance v2, Ljava/lang/StringBuilder;

    .line 330
    .line 331
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 332
    .line 333
    .line 334
    const-string v4, "%."

    .line 335
    .line 336
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    const/4 v4, 0x3

    .line 340
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    const-string v4, "f ms"

    .line 344
    .line 345
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    long-to-double v4, v7

    .line 353
    const-wide v7, 0x412e848000000000L    # 1000000.0

    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    div-double/2addr v4, v7

    .line 359
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 360
    .line 361
    .line 362
    move-result-object v4

    .line 363
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v4

    .line 367
    invoke-static {v4, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v4

    .line 371
    const/4 v5, 0x0

    .line 372
    invoke-static {v5, v2, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 384
    .line 385
    .line 386
    goto :goto_4

    .line 387
    :cond_7
    const/4 v6, 0x0

    .line 388
    :goto_4
    monitor-exit v0

    .line 389
    if-eqz v6, :cond_8

    .line 390
    .line 391
    if-eqz p1, :cond_8

    .line 392
    .line 393
    iget-object p0, p0, La/r9a;->a:La/iev;

    .line 394
    .line 395
    const-string p1, "CXCP"

    .line 396
    .line 397
    new-instance v0, Ljava/lang/StringBuilder;

    .line 398
    .line 399
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 403
    .line 404
    .line 405
    const-string v1, " onGraphModified"

    .line 406
    .line 407
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 415
    .line 416
    .line 417
    iget-object p0, p0, La/iev;->c:La/bev;

    .line 418
    .line 419
    iget-object p0, p0, La/bev;->g:La/w5z;

    .line 420
    .line 421
    sget-object p1, La/pdv;->b:La/pdv;

    .line 422
    .line 423
    invoke-virtual {p0, p1}, La/w5z;->k0(Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    :cond_8
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 427
    .line 428
    .line 429
    return-void

    .line 430
    :goto_5
    monitor-exit v0

    .line 431
    throw p0

    .line 432
    :cond_9
    return-void

    .line 433
    :catchall_1
    move-exception p0

    .line 434
    monitor-exit v0

    .line 435
    throw p0
.end method

.method public final m(J)V
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, La/r9a;->i:La/vne;

    .line 8
    .line 9
    new-instance v1, La/ir;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v1, p1, p2, p0, v2}, La/ir;-><init>(JLa/r9a;La/yje;)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x3

    .line 16
    invoke-static {v0, v2, v2, v1, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const-string p1, "CXCP"

    .line 21
    .line 22
    new-instance p2, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v0, "Finalizing "

    .line 25
    .line 26
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, La/r9a;->k:Ljava/lang/Object;

    .line 40
    .line 41
    monitor-enter p1

    .line 42
    :try_start_0
    iget-object p2, p0, La/r9a;->z:Ljava/util/LinkedHashMap;

    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    check-cast p2, Ljava/lang/Iterable;

    .line 49
    .line 50
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    iget-object p0, p0, La/r9a;->z:Ljava/util/LinkedHashMap;

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    monitor-exit p1

    .line 60
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_a

    .line 69
    .line 70
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, Ljava/lang/AutoCloseable;

    .line 75
    .line 76
    instance-of p2, p1, Ljava/lang/AutoCloseable;

    .line 77
    .line 78
    if-eqz p2, :cond_2

    .line 79
    .line 80
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    instance-of p2, p1, Ljava/util/concurrent/ExecutorService;

    .line 85
    .line 86
    if-eqz p2, :cond_6

    .line 87
    .line 88
    check-cast p1, Ljava/util/concurrent/ExecutorService;

    .line 89
    .line 90
    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    if-ne p1, p2, :cond_3

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_3
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    if-nez p2, :cond_1

    .line 102
    .line 103
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 104
    .line 105
    .line 106
    const/4 v0, 0x0

    .line 107
    :cond_4
    :goto_1
    if-nez p2, :cond_5

    .line 108
    .line 109
    :try_start_1
    sget-object v1, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 110
    .line 111
    const-wide/16 v2, 0x1

    .line 112
    .line 113
    invoke-interface {p1, v2, v3, v1}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 114
    .line 115
    .line 116
    move-result p2
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 117
    goto :goto_1

    .line 118
    :catch_0
    if-nez v0, :cond_4

    .line 119
    .line 120
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 121
    .line 122
    .line 123
    const/4 v0, 0x1

    .line 124
    goto :goto_1

    .line 125
    :cond_5
    if-eqz v0, :cond_1

    .line 126
    .line 127
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 132
    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_6
    instance-of p2, p1, Landroid/content/res/TypedArray;

    .line 136
    .line 137
    if-eqz p2, :cond_7

    .line 138
    .line 139
    check-cast p1, Landroid/content/res/TypedArray;

    .line 140
    .line 141
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 142
    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_7
    instance-of p2, p1, Landroid/media/MediaMetadataRetriever;

    .line 146
    .line 147
    if-eqz p2, :cond_8

    .line 148
    .line 149
    check-cast p1, Landroid/media/MediaMetadataRetriever;

    .line 150
    .line 151
    invoke-virtual {p1}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 152
    .line 153
    .line 154
    goto :goto_0

    .line 155
    :cond_8
    instance-of p2, p1, Landroid/media/MediaDrm;

    .line 156
    .line 157
    if-eqz p2, :cond_9

    .line 158
    .line 159
    check-cast p1, Landroid/media/MediaDrm;

    .line 160
    .line 161
    invoke-virtual {p1}, Landroid/media/MediaDrm;->release()V

    .line 162
    .line 163
    .line 164
    goto :goto_0

    .line 165
    :cond_9
    invoke-static {}, La/e9d0;->o()V

    .line 166
    .line 167
    .line 168
    :cond_a
    return-void

    .line 169
    :catchall_0
    move-exception p0

    .line 170
    monitor-exit p1

    .line 171
    throw p0
.end method

.method public final n()V
    .locals 7

    .line 1
    invoke-virtual {p0}, La/r9a;->k()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/r9a;->k:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, La/r9a;->u:La/o9a;

    .line 8
    .line 9
    sget-object v2, La/o9a;->e:La/o9a;

    .line 10
    .line 11
    const-wide/16 v3, 0x0

    .line 12
    .line 13
    if-eq v1, v2, :cond_2

    .line 14
    .line 15
    iget-object v1, p0, La/r9a;->q:La/yy9;

    .line 16
    .line 17
    const/4 v5, 0x1

    .line 18
    if-eqz v1, :cond_3

    .line 19
    .line 20
    iget-boolean v1, p0, La/r9a;->w:Z

    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v1, p0, La/r9a;->f:La/vz9;

    .line 26
    .line 27
    iget v1, v1, La/vz9;->c:I

    .line 28
    .line 29
    if-ne v1, v5, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v6, 0x2

    .line 33
    if-ne v1, v6, :cond_2

    .line 34
    .line 35
    const-wide/16 v3, 0x7d0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    const/4 v5, 0x0

    .line 41
    :cond_3
    :goto_0
    const/4 v1, 0x0

    .line 42
    iput-object v1, p0, La/r9a;->q:La/yy9;

    .line 43
    .line 44
    iput-object v2, p0, La/r9a;->u:La/o9a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    monitor-exit v0

    .line 47
    if-eqz v5, :cond_4

    .line 48
    .line 49
    invoke-virtual {p0, v3, v4}, La/r9a;->m(J)V

    .line 50
    .line 51
    .line 52
    :cond_4
    return-void

    .line 53
    :goto_1
    monitor-exit v0

    .line 54
    throw p0
.end method

.method public final o(La/zje;)Ljava/lang/Object;
    .locals 12

    .line 1
    const-string v0, "Warning: "

    .line 2
    .line 3
    const-string v1, "Created "

    .line 4
    .line 5
    const-string v2, "Unexpected state: "

    .line 6
    .line 7
    instance-of v3, p1, La/q9a;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, p1

    .line 12
    check-cast v3, La/q9a;

    .line 13
    .line 14
    iget v4, v3, La/q9a;->m:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, La/q9a;->m:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, La/q9a;

    .line 27
    .line 28
    invoke-direct {v3, p0, p1}, La/q9a;-><init>(La/r9a;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object p1, v3, La/q9a;->k:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v5, v3, La/q9a;->m:I

    .line 36
    .line 37
    const/4 v6, 0x1

    .line 38
    const/4 v7, 0x0

    .line 39
    if-eqz v5, :cond_2

    .line 40
    .line 41
    if-ne v5, v6, :cond_1

    .line 42
    .line 43
    iget-object v4, v3, La/q9a;->j:La/mie0;

    .line 44
    .line 45
    iget-object v3, v3, La/q9a;->i:La/mie0;

    .line 46
    .line 47
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v7

    .line 57
    :cond_2
    invoke-static {p1}, La/ohs0;->j(Ljava/lang/Object;)La/mie0;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    new-instance v5, La/mie0;

    .line 62
    .line 63
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 64
    .line 65
    .line 66
    iget-object v8, p0, La/r9a;->k:Ljava/lang/Object;

    .line 67
    .line 68
    monitor-enter v8

    .line 69
    :try_start_0
    iget-object v9, p0, La/r9a;->u:La/o9a;

    .line 70
    .line 71
    sget-object v10, La/o9a;->a:La/o9a;

    .line 72
    .line 73
    if-eq v9, v10, :cond_3

    .line 74
    .line 75
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    .line 77
    monitor-exit v8

    .line 78
    return-object p0

    .line 79
    :catchall_0
    move-exception p0

    .line 80
    goto/16 :goto_9

    .line 81
    .line 82
    :cond_3
    :try_start_1
    iget-object v9, p0, La/r9a;->y:Ljava/util/Map;

    .line 83
    .line 84
    iput-object v9, p1, La/mie0;->a:Ljava/lang/Object;

    .line 85
    .line 86
    iget-object v9, p0, La/r9a;->q:La/yy9;

    .line 87
    .line 88
    iput-object v9, v5, La/mie0;->a:Ljava/lang/Object;

    .line 89
    .line 90
    iget-object v10, p1, La/mie0;->a:Ljava/lang/Object;

    .line 91
    .line 92
    if-eqz v10, :cond_12

    .line 93
    .line 94
    if-nez v9, :cond_4

    .line 95
    .line 96
    goto/16 :goto_8

    .line 97
    .line 98
    :cond_4
    sget-object v9, La/o9a;->b:La/o9a;

    .line 99
    .line 100
    iput-object v9, p0, La/r9a;->u:La/o9a;

    .line 101
    .line 102
    iput-boolean v6, p0, La/r9a;->w:Z

    .line 103
    .line 104
    iget-object v9, p0, La/r9a;->e:La/cao0;

    .line 105
    .line 106
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 110
    .line 111
    .line 112
    move-result-wide v9

    .line 113
    new-instance v11, La/doq0;

    .line 114
    .line 115
    invoke-direct {v11, v9, v10}, La/doq0;-><init>(J)V

    .line 116
    .line 117
    .line 118
    iput-object v11, p0, La/r9a;->o:La/doq0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 119
    .line 120
    monitor-exit v8

    .line 121
    iget-object v8, p0, La/r9a;->p:La/o470;

    .line 122
    .line 123
    if-eqz v8, :cond_6

    .line 124
    .line 125
    const-string v9, "CXCP"

    .line 126
    .line 127
    const-string v10, "Awaiting session lock"

    .line 128
    .line 129
    invoke-static {v9, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 130
    .line 131
    .line 132
    iput-object p1, v3, La/q9a;->i:La/mie0;

    .line 133
    .line 134
    iput-object v5, v3, La/q9a;->j:La/mie0;

    .line 135
    .line 136
    iput v6, v3, La/q9a;->m:I

    .line 137
    .line 138
    invoke-virtual {v8, v3}, La/o470;->c(La/zje;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    if-ne v3, v4, :cond_5

    .line 143
    .line 144
    return-object v4

    .line 145
    :cond_5
    move-object v3, p1

    .line 146
    move-object v4, v5

    .line 147
    :goto_1
    move-object p1, v3

    .line 148
    move-object v5, v4

    .line 149
    :cond_6
    const-string v3, "CXCP"

    .line 150
    .line 151
    new-instance v4, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    const-string v6, "Creating CameraCaptureSession from "

    .line 154
    .line 155
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    iget-object v6, v5, La/mie0;->a:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v6, La/yy9;

    .line 161
    .line 162
    if-eqz v6, :cond_7

    .line 163
    .line 164
    invoke-interface {v6}, La/yy9;->F()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    goto :goto_2

    .line 169
    :cond_7
    move-object v6, v7

    .line 170
    :goto_2
    if-nez v6, :cond_8

    .line 171
    .line 172
    const-string v6, "null"

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_8
    invoke-static {v6}, La/g0a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    :goto_3
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    const-string v6, " using "

    .line 183
    .line 184
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    const-string v6, " with "

    .line 191
    .line 192
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    iget-object v6, p1, La/mie0;->a:Ljava/lang/Object;

    .line 196
    .line 197
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 205
    .line 206
    .line 207
    new-instance v3, Ljava/lang/StringBuilder;

    .line 208
    .line 209
    const-string v4, "CameraDevice-"

    .line 210
    .line 211
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    iget-object v4, v5, La/mie0;->a:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v4, La/yy9;

    .line 217
    .line 218
    if-eqz v4, :cond_9

    .line 219
    .line 220
    invoke-interface {v4}, La/yy9;->F()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    goto :goto_4

    .line 225
    :cond_9
    move-object v4, v7

    .line 226
    :goto_4
    const-string v6, "#createCaptureSession"

    .line 227
    .line 228
    invoke-static {v3, v4, v6}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    :try_start_2
    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    iget-object v3, p0, La/r9a;->b:La/m9a;

    .line 236
    .line 237
    iget-object v4, v5, La/mie0;->a:Ljava/lang/Object;

    .line 238
    .line 239
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    check-cast v4, La/yy9;

    .line 243
    .line 244
    iget-object v5, p1, La/mie0;->a:Ljava/lang/Object;

    .line 245
    .line 246
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    check-cast v5, Ljava/util/Map;

    .line 250
    .line 251
    invoke-interface {v3, v4, v5, p0}, La/m9a;->a(La/yy9;Ljava/util/Map;La/r9a;)La/l9a;

    .line 252
    .line 253
    .line 254
    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 255
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 256
    .line 257
    .line 258
    instance-of v4, v3, La/k9a;

    .line 259
    .line 260
    if-nez v4, :cond_a

    .line 261
    .line 262
    const-string p1, "CXCP"

    .line 263
    .line 264
    new-instance v0, Ljava/lang/StringBuilder;

    .line 265
    .line 266
    const-string v1, "Failed to create capture session for "

    .line 267
    .line 268
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    const/16 p0, 0x21

    .line 275
    .line 276
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object p0

    .line 283
    invoke-static {p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 284
    .line 285
    .line 286
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 287
    .line 288
    return-object p0

    .line 289
    :cond_a
    iget-object v4, p0, La/r9a;->k:Ljava/lang/Object;

    .line 290
    .line 291
    monitor-enter v4

    .line 292
    :try_start_3
    iget-object v5, p0, La/r9a;->u:La/o9a;

    .line 293
    .line 294
    sget-object v6, La/o9a;->d:La/o9a;

    .line 295
    .line 296
    if-eq v5, v6, :cond_11

    .line 297
    .line 298
    sget-object v6, La/o9a;->e:La/o9a;

    .line 299
    .line 300
    if-ne v5, v6, :cond_b

    .line 301
    .line 302
    goto/16 :goto_6

    .line 303
    .line 304
    :cond_b
    sget-object v0, La/o9a;->b:La/o9a;

    .line 305
    .line 306
    if-ne v5, v0, :cond_10

    .line 307
    .line 308
    sget-object v0, La/o9a;->c:La/o9a;

    .line 309
    .line 310
    iput-object v0, p0, La/r9a;->u:La/o9a;

    .line 311
    .line 312
    iget-object v0, p0, La/r9a;->m:Ljava/util/Map;

    .line 313
    .line 314
    iget-object v2, p1, La/mie0;->a:Ljava/lang/Object;

    .line 315
    .line 316
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    check-cast v2, Ljava/util/Map;

    .line 320
    .line 321
    invoke-interface {v0, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 322
    .line 323
    .line 324
    iget-object v0, p0, La/r9a;->n:Ljava/util/Map;

    .line 325
    .line 326
    move-object v2, v3

    .line 327
    check-cast v2, La/k9a;

    .line 328
    .line 329
    iget-object v2, v2, La/k9a;->b:Ljava/util/Map;

    .line 330
    .line 331
    invoke-interface {v0, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 332
    .line 333
    .line 334
    check-cast v3, La/k9a;

    .line 335
    .line 336
    iget-object v0, v3, La/k9a;->a:Ljava/util/Map;

    .line 337
    .line 338
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 339
    .line 340
    .line 341
    move-result v2

    .line 342
    if-nez v2, :cond_f

    .line 343
    .line 344
    const-string v2, "CXCP"

    .line 345
    .line 346
    new-instance v3, Ljava/lang/StringBuilder;

    .line 347
    .line 348
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    const-string v1, " with "

    .line 355
    .line 356
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 357
    .line 358
    .line 359
    iget-object p1, p1, La/mie0;->a:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast p1, Ljava/util/Map;

    .line 362
    .line 363
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 364
    .line 365
    .line 366
    move-result-object p1

    .line 367
    check-cast p1, Ljava/lang/Iterable;

    .line 368
    .line 369
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 370
    .line 371
    .line 372
    move-result-object p1

    .line 373
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    const-string p1, ". Waiting to finalize "

    .line 377
    .line 378
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 382
    .line 383
    .line 384
    move-result-object p1

    .line 385
    check-cast p1, Ljava/lang/Iterable;

    .line 386
    .line 387
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 388
    .line 389
    .line 390
    move-result-object p1

    .line 391
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object p1

    .line 398
    invoke-static {v2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 399
    .line 400
    .line 401
    iput-object v0, p0, La/r9a;->s:Ljava/util/Map;

    .line 402
    .line 403
    iget-object p1, p0, La/r9a;->y:Ljava/util/Map;

    .line 404
    .line 405
    if-eqz p1, :cond_d

    .line 406
    .line 407
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 408
    .line 409
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 410
    .line 411
    .line 412
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 413
    .line 414
    .line 415
    move-result-object p1

    .line 416
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 417
    .line 418
    .line 419
    move-result-object p1

    .line 420
    :cond_c
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 421
    .line 422
    .line 423
    move-result v2

    .line 424
    if-eqz v2, :cond_e

    .line 425
    .line 426
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v2

    .line 430
    check-cast v2, Ljava/util/Map$Entry;

    .line 431
    .line 432
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v3

    .line 436
    invoke-interface {v0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    move-result v3

    .line 440
    if-eqz v3, :cond_c

    .line 441
    .line 442
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v3

    .line 446
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v2

    .line 450
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    goto :goto_5

    .line 454
    :catchall_1
    move-exception p0

    .line 455
    goto :goto_7

    .line 456
    :cond_d
    move-object v1, v7

    .line 457
    :cond_e
    if-eqz v1, :cond_f

    .line 458
    .line 459
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 460
    .line 461
    .line 462
    move-result p1

    .line 463
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 464
    .line 465
    .line 466
    move-result v0

    .line 467
    if-ne p1, v0, :cond_f

    .line 468
    .line 469
    iput-object v1, p0, La/r9a;->t:Ljava/util/LinkedHashMap;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 470
    .line 471
    :cond_f
    monitor-exit v4

    .line 472
    invoke-virtual {p0, v7}, La/r9a;->i(La/fy9;)V

    .line 473
    .line 474
    .line 475
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 476
    .line 477
    return-object p0

    .line 478
    :cond_10
    :try_start_4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 479
    .line 480
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 481
    .line 482
    .line 483
    iget-object p0, p0, La/r9a;->u:La/o9a;

    .line 484
    .line 485
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 486
    .line 487
    .line 488
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object p0

    .line 492
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 493
    .line 494
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object p0

    .line 498
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 499
    .line 500
    .line 501
    throw p1

    .line 502
    :cond_11
    :goto_6
    const-string p1, "CXCP"

    .line 503
    .line 504
    new-instance v1, Ljava/lang/StringBuilder;

    .line 505
    .line 506
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 510
    .line 511
    .line 512
    const-string v0, " was "

    .line 513
    .line 514
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 515
    .line 516
    .line 517
    iget-object p0, p0, La/r9a;->u:La/o9a;

    .line 518
    .line 519
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 520
    .line 521
    .line 522
    const-string p0, " while configuration was in progress."

    .line 523
    .line 524
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object p0

    .line 531
    invoke-static {p1, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 532
    .line 533
    .line 534
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 535
    .line 536
    monitor-exit v4

    .line 537
    return-object p0

    .line 538
    :goto_7
    monitor-exit v4

    .line 539
    throw p0

    .line 540
    :catchall_2
    move-exception p0

    .line 541
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 542
    .line 543
    .line 544
    throw p0

    .line 545
    :cond_12
    :goto_8
    :try_start_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 546
    .line 547
    monitor-exit v8

    .line 548
    return-object p0

    .line 549
    :goto_9
    monitor-exit v8

    .line 550
    throw p0
.end method

.method public final p(Ljava/util/Map;Ljava/util/Map;)V
    .locals 9

    .line 1
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/Iterable;

    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p2}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, Ljava/lang/Iterable;

    .line 16
    .line 17
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    move-object v0, p2

    .line 22
    check-cast v0, Ljava/lang/Iterable;

    .line 23
    .line 24
    invoke-static {p1, v0}, La/eui0;->f(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    iget-object v2, p0, La/r9a;->z:Ljava/util/LinkedHashMap;

    .line 37
    .line 38
    if-eqz v1, :cond_b

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Landroid/view/Surface;

    .line 45
    .line 46
    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Ljava/lang/AutoCloseable;

    .line 51
    .line 52
    if-eqz v2, :cond_8

    .line 53
    .line 54
    instance-of v3, v2, Ljava/lang/AutoCloseable;

    .line 55
    .line 56
    if-eqz v3, :cond_0

    .line 57
    .line 58
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_0
    instance-of v3, v2, Ljava/util/concurrent/ExecutorService;

    .line 63
    .line 64
    if-eqz v3, :cond_4

    .line 65
    .line 66
    move-object v3, v2

    .line 67
    check-cast v3, Ljava/util/concurrent/ExecutorService;

    .line 68
    .line 69
    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    if-ne v3, v4, :cond_1

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_1
    invoke-interface {v3}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-nez v4, :cond_9

    .line 81
    .line 82
    invoke-interface {v3}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 83
    .line 84
    .line 85
    const/4 v5, 0x0

    .line 86
    :cond_2
    :goto_1
    if-nez v4, :cond_3

    .line 87
    .line 88
    :try_start_0
    sget-object v6, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 89
    .line 90
    const-wide/16 v7, 0x1

    .line 91
    .line 92
    invoke-interface {v3, v7, v8, v6}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 93
    .line 94
    .line 95
    move-result v4
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 96
    goto :goto_1

    .line 97
    :catch_0
    if-nez v5, :cond_2

    .line 98
    .line 99
    invoke-interface {v3}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 100
    .line 101
    .line 102
    const/4 v5, 0x1

    .line 103
    goto :goto_1

    .line 104
    :cond_3
    if-eqz v5, :cond_9

    .line 105
    .line 106
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-virtual {v3}, Ljava/lang/Thread;->interrupt()V

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_4
    instance-of v3, v2, Landroid/content/res/TypedArray;

    .line 115
    .line 116
    if-eqz v3, :cond_5

    .line 117
    .line 118
    move-object v3, v2

    .line 119
    check-cast v3, Landroid/content/res/TypedArray;

    .line 120
    .line 121
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 122
    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_5
    instance-of v3, v2, Landroid/media/MediaMetadataRetriever;

    .line 126
    .line 127
    if-eqz v3, :cond_6

    .line 128
    .line 129
    move-object v3, v2

    .line 130
    check-cast v3, Landroid/media/MediaMetadataRetriever;

    .line 131
    .line 132
    invoke-virtual {v3}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 133
    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_6
    instance-of v3, v2, Landroid/media/MediaDrm;

    .line 137
    .line 138
    if-eqz v3, :cond_7

    .line 139
    .line 140
    move-object v3, v2

    .line 141
    check-cast v3, Landroid/media/MediaDrm;

    .line 142
    .line 143
    invoke-virtual {v3}, Landroid/media/MediaDrm;->release()V

    .line 144
    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_7
    invoke-static {}, La/e9d0;->o()V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :cond_8
    const/4 v2, 0x0

    .line 152
    :cond_9
    :goto_2
    if-eqz v2, :cond_a

    .line 153
    .line 154
    goto :goto_0

    .line 155
    :cond_a
    const-string p0, "Surface "

    .line 156
    .line 157
    const-string p1, " doesn\'t have a matching surface token!"

    .line 158
    .line 159
    invoke-static {v1, p1, p0}, La/c99;->t(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :cond_b
    check-cast p1, Ljava/lang/Iterable;

    .line 164
    .line 165
    invoke-static {p2, p1}, La/eui0;->f(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 174
    .line 175
    .line 176
    move-result p2

    .line 177
    if-eqz p2, :cond_c

    .line 178
    .line 179
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p2

    .line 183
    check-cast p2, Landroid/view/Surface;

    .line 184
    .line 185
    iget-object v0, p0, La/r9a;->d:La/j3a;

    .line 186
    .line 187
    invoke-virtual {v0, p2}, La/j3a;->a(Landroid/view/Surface;)La/i3a;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-interface {v2, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_c
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "CaptureSessionState-"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget p0, p0, La/r9a;->j:I

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
