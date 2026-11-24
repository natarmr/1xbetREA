.class public final La/u0a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/s0a;


# instance fields
.field public final a:La/ppt0;

.field public final b:La/n0a;

.field public final c:La/ry9;

.field public final d:La/tpt0;

.field public final e:La/r2a;

.field public final f:Ljava/lang/String;

.field public g:La/hy9;

.field public final h:I

.field public final i:La/x04;


# direct methods
.method public constructor <init>(La/fhn;La/ppt0;La/n0a;La/ry9;La/tpt0;La/r2a;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p2, p0, La/u0a;->a:La/ppt0;

    .line 23
    .line 24
    iput-object p3, p0, La/u0a;->b:La/n0a;

    .line 25
    .line 26
    iput-object p4, p0, La/u0a;->c:La/ry9;

    .line 27
    .line 28
    iput-object p5, p0, La/u0a;->d:La/tpt0;

    .line 29
    .line 30
    iput-object p6, p0, La/u0a;->e:La/r2a;

    .line 31
    .line 32
    iget-object p1, p1, La/fhn;->b:Ljava/lang/String;

    .line 33
    .line 34
    iput-object p1, p0, La/u0a;->f:Ljava/lang/String;

    .line 35
    .line 36
    sget-object p2, La/ky9;->a:La/jy9;

    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iput-object p2, p0, La/u0a;->g:La/hy9;

    .line 42
    .line 43
    sget-object p2, La/v0a;->a:La/z04;

    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    sget-object p3, La/z04;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 49
    .line 50
    invoke-virtual {p3, p2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    iput p2, p0, La/u0a;->h:I

    .line 55
    .line 56
    const/4 p2, 0x0

    .line 57
    invoke-static {p2}, La/o2e;->X(Z)La/x04;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    iput-object p2, p0, La/u0a;->i:La/x04;

    .line 62
    .line 63
    const-string p2, "CXCP"

    .line 64
    .line 65
    invoke-static {p2}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result p3

    .line 69
    if-eqz p3, :cond_0

    .line 70
    .line 71
    new-instance p3, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    const-string p4, "Created "

    .line 74
    .line 75
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string p0, " for "

    .line 82
    .line 83
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-static {p1}, La/g0a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-static {p2, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    :cond_0
    return-void
.end method


# virtual methods
.method public final b()La/da60;
    .locals 0

    .line 1
    iget-object p0, p0, La/u0a;->e:La/r2a;

    .line 2
    .line 3
    iget-object p0, p0, La/r2a;->b:La/cyu;

    .line 4
    .line 5
    return-object p0
.end method

.method public final c(La/fot0;)V
    .locals 2

    .line 1
    iget-object p0, p0, La/u0a;->a:La/ppt0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/ppt0;->k:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, La/ppt0;->m:Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, La/ppt0;->k()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    monitor-exit v0

    .line 24
    return-void

    .line 25
    :goto_1
    monitor-exit v0

    .line 26
    throw p0
.end method

.method public final d()La/ry9;
    .locals 0

    .line 1
    iget-object p0, p0, La/u0a;->c:La/ry9;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e()La/hy9;
    .locals 0

    .line 1
    iget-object p0, p0, La/u0a;->g:La/hy9;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f(La/hy9;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object v0, La/ky9;->a:La/jy9;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v0, p1

    .line 10
    :goto_0
    iput-object v0, p0, La/u0a;->g:La/hy9;

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    invoke-interface {p1}, La/hy9;->o()V

    .line 15
    .line 16
    .line 17
    :cond_1
    iget-object p0, p0, La/u0a;->a:La/ppt0;

    .line 18
    .line 19
    iget-object p0, p0, La/ppt0;->k:Ljava/lang/Object;

    .line 20
    .line 21
    monitor-enter p0

    .line 22
    monitor-exit p0

    .line 23
    return-void
.end method

.method public final g(Z)V
    .locals 4

    .line 1
    iget-object p0, p0, La/u0a;->a:La/ppt0;

    .line 2
    .line 3
    iget-object v0, p0, La/ppt0;->k:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iput-boolean p1, p0, La/ppt0;->n:Z

    .line 7
    .line 8
    invoke-virtual {p0}, La/ppt0;->g()La/mot0;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, La/mot0;->b:La/tpt0;

    .line 15
    .line 16
    iget-object v1, v1, La/tpt0;->f:La/sje;

    .line 17
    .line 18
    new-instance v2, La/lot0;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-direct {v2, v3, p0, p1}, La/lot0;-><init>(La/yje;La/mot0;Z)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x3

    .line 25
    invoke-static {v1, v3, v3, v2, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    :cond_0
    monitor-exit v0

    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    monitor-exit v0

    .line 32
    throw p0
.end method

.method public final h()La/n0a;
    .locals 0

    .line 1
    iget-object p0, p0, La/u0a;->b:La/n0a;

    .line 2
    .line 3
    return-object p0
.end method

.method public final i(La/fot0;)V
    .locals 2

    .line 1
    iget-object p0, p0, La/u0a;->a:La/ppt0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/ppt0;->k:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, La/ppt0;->l:Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, La/ppt0;->k()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    monitor-exit v0

    .line 24
    return-void

    .line 25
    :goto_1
    monitor-exit v0

    .line 26
    throw p0
.end method

.method public final j(La/fot0;)V
    .locals 2

    .line 1
    iget-object p0, p0, La/u0a;->a:La/ppt0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/ppt0;->k:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, La/ppt0;->m:Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, La/ppt0;->k()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    monitor-exit v0

    .line 24
    return-void

    .line 25
    :goto_1
    monitor-exit v0

    .line 26
    throw p0
.end method

.method public final l(La/fot0;)V
    .locals 2

    .line 1
    iget-object p0, p0, La/u0a;->a:La/ppt0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/ppt0;->k:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, La/ppt0;->l:Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, La/ppt0;->l:Ljava/util/LinkedHashSet;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, La/ppt0;->j(Ljava/util/LinkedHashSet;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    :goto_0
    monitor-exit v0

    .line 26
    return-void

    .line 27
    :goto_1
    monitor-exit v0

    .line 28
    throw p0
.end method

.method public final m()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/u0a;->i:La/x04;

    .line 2
    .line 3
    invoke-virtual {p0}, La/x04;->b()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final n(Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/u0a;->a:La/ppt0;

    .line 2
    .line 3
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, La/ppt0;->f(Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final o(Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/u0a;->a:La/ppt0;

    .line 2
    .line 3
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, La/ppt0;->c(Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final p()V
    .locals 4

    .line 1
    const-string v0, "CXCP"

    .line 2
    .line 3
    invoke-static {v0}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v2, " received removed signal. Cleaning up."

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, p0, La/u0a;->i:La/x04;

    .line 30
    .line 31
    invoke-virtual {v0}, La/x04;->a()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    iget-object v0, p0, La/u0a;->d:La/tpt0;

    .line 38
    .line 39
    iget-object v0, v0, La/tpt0;->a:La/sje;

    .line 40
    .line 41
    new-instance v1, La/t0a;

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    const/4 v3, 0x0

    .line 45
    invoke-direct {v1, p0, v3, v2}, La/t0a;-><init>(La/u0a;La/yje;B)V

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x3

    .line 49
    invoke-static {v0, v3, v3, v1, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 50
    .line 51
    .line 52
    :cond_1
    return-void
.end method

.method public final r(Z)V
    .locals 1

    .line 1
    iget-object p0, p0, La/u0a;->a:La/ppt0;

    .line 2
    .line 3
    iget-object v0, p0, La/ppt0;->k:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iput-boolean p1, p0, La/ppt0;->p:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception p0

    .line 11
    monitor-exit v0

    .line 12
    throw p0
.end method

.method public final release()La/ig00;
    .locals 4

    .line 1
    iget-object v0, p0, La/u0a;->d:La/tpt0;

    .line 2
    .line 3
    iget-object v0, v0, La/tpt0;->a:La/sje;

    .line 4
    .line 5
    new-instance v1, La/t0a;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-direct {v1, p0, v3, v2}, La/t0a;-><init>(La/u0a;La/yje;B)V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x3

    .line 13
    invoke-static {v0, v3, v3, v1, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    new-instance v0, La/gne;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, v1}, La/gne;-><init>(Ljava/lang/Object;B)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, La/y0x0;->I(La/uu9;)La/wu9;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "CameraInternalAdapter<"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/u0a;->f:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {v1}, La/g0a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const/16 v1, 0x28

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget p0, p0, La/u0a;->h:I

    .line 23
    .line 24
    const-string v1, ")>"

    .line 25
    .line 26
    invoke-static {p0, v1, v0}, La/rz4;->j(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method
