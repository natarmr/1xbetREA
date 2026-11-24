.class public final La/lyb0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/e2a;


# static fields
.field public static final b:La/lyb0;


# instance fields
.field public final a:La/rrd;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/lyb0;

    .line 2
    .line 3
    new-instance v1, La/rrd;

    .line 4
    .line 5
    const/16 v2, 0x17

    .line 6
    .line 7
    invoke-direct {v1, v2}, La/rrd;-><init>(B)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, La/lyb0;-><init>(La/rrd;)V

    .line 11
    .line 12
    .line 13
    sput-object v0, La/lyb0;->b:La/lyb0;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(La/rrd;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/lyb0;->a:La/rrd;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/clz;La/n2a;La/mpt0;)La/lx9;
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/lyb0;->a:La/rrd;

    .line 5
    .line 6
    const-string v0, "CX:bindToLifecycle-UseCaseGroup"

    .line 7
    .line 8
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    :try_start_0
    iget-object v0, p0, La/rrd;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, La/j4a;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    move v3, v1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v3, v2

    .line 22
    :goto_0
    if-eqz v3, :cond_2

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object v0, v0, La/j4a;->g:La/ru;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget-object v0, v0, La/ru;->e:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, La/wy9;

    .line 34
    .line 35
    iget-object v2, v0, La/wy9;->b:Ljava/lang/Object;

    .line 36
    .line 37
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 38
    :try_start_1
    iget-boolean v0, v0, La/wy9;->f:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    .line 40
    :try_start_2
    monitor-exit v2

    .line 41
    move v2, v0

    .line 42
    goto :goto_1

    .line 43
    :catchall_0
    move-exception p0

    .line 44
    monitor-exit v2

    .line 45
    throw p0

    .line 46
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p1, "CameraX not initialized yet."

    .line 49
    .line 50
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :cond_2
    :goto_1
    const/4 v0, 0x2

    .line 55
    if-eq v2, v0, :cond_3

    .line 56
    .line 57
    invoke-virtual {p0, v1}, La/rrd;->A(I)V

    .line 58
    .line 59
    .line 60
    new-instance v0, La/rrd;

    .line 61
    .line 62
    iget-object v1, p3, La/mpt0;->c:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, Ljava/util/ArrayList;

    .line 65
    .line 66
    iget-object v2, p3, La/mpt0;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, La/wju0;

    .line 69
    .line 70
    iget-object p3, p3, La/mpt0;->d:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p3, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-direct {v0, v1, v2, p3}, La/rrd;-><init>(Ljava/util/ArrayList;La/wju0;Ljava/util/List;)V

    .line 75
    .line 76
    .line 77
    invoke-static {p0, p1, p2, v0}, La/rrd;->a(La/rrd;La/clz;La/n2a;La/rrd;)La/okz;

    .line 78
    .line 79
    .line 80
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 81
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 82
    .line 83
    .line 84
    return-object p0

    .line 85
    :cond_3
    :try_start_3
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 86
    .line 87
    const-string p1, "bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first."

    .line 88
    .line 89
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 93
    :catchall_1
    move-exception p0

    .line 94
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 95
    .line 96
    .line 97
    throw p0
.end method

.method public final b()Ljava/util/List;
    .locals 2

    .line 1
    iget-object p0, p0, La/lyb0;->a:La/rrd;

    .line 2
    .line 3
    const-string v0, "CX:getAvailableCameraInfos"

    .line 4
    .line 5
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, La/rrd;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, La/j4a;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, La/j4a;->a:La/j2a;

    .line 21
    .line 22
    invoke-virtual {p0}, La/j2a;->c()Ljava/util/LinkedHashSet;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, La/s0a;

    .line 41
    .line 42
    invoke-interface {v1}, La/s0a;->a()La/j0a;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 54
    .line 55
    .line 56
    return-object v0

    .line 57
    :catchall_0
    move-exception p0

    .line 58
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 59
    .line 60
    .line 61
    throw p0
.end method
