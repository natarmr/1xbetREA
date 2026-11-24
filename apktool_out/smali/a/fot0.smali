.class public abstract La/fot0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public final b:Ljava/util/HashSet;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public e:I

.field public f:La/fpt0;

.field public g:La/fpt0;

.field public h:Ljava/util/HashSet;

.field public i:La/fpt0;

.field public j:La/h55;

.field public k:La/fpt0;

.field public l:Landroid/graphics/Rect;

.field public m:Landroid/graphics/Matrix;

.field public n:La/s0a;

.field public o:La/s0a;

.field public p:La/xii0;

.field public q:La/xii0;


# direct methods
.method public constructor <init>(La/fpt0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, La/fot0;->a:Z

    .line 6
    .line 7
    new-instance v0, Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, La/fot0;->b:Ljava/util/HashSet;

    .line 13
    .line 14
    new-instance v0, Ljava/lang/Object;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, La/fot0;->c:Ljava/lang/Object;

    .line 20
    .line 21
    new-instance v0, Ljava/lang/Object;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, La/fot0;->d:Ljava/lang/Object;

    .line 27
    .line 28
    const/4 v0, 0x2

    .line 29
    iput v0, p0, La/fot0;->e:I

    .line 30
    .line 31
    new-instance v0, Landroid/graphics/Matrix;

    .line 32
    .line 33
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, La/fot0;->m:Landroid/graphics/Matrix;

    .line 37
    .line 38
    new-instance v0, La/v4i0;

    .line 39
    .line 40
    const/16 v1, 0x1d

    .line 41
    .line 42
    invoke-direct {v0, p0, v1}, La/v4i0;-><init>(Ljava/lang/Object;B)V

    .line 43
    .line 44
    .line 45
    invoke-static {}, La/xii0;->a()La/xii0;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-object v0, p0, La/fot0;->p:La/xii0;

    .line 50
    .line 51
    invoke-static {}, La/xii0;->a()La/xii0;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v0, p0, La/fot0;->q:La/xii0;

    .line 56
    .line 57
    iput-object p1, p0, La/fot0;->g:La/fpt0;

    .line 58
    .line 59
    iput-object p1, p0, La/fot0;->i:La/fpt0;

    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public abstract A()V
.end method

.method public B(Landroid/graphics/Matrix;)V
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, La/fot0;->m:Landroid/graphics/Matrix;

    .line 7
    .line 8
    return-void
.end method

.method public C(Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/fot0;->l:Landroid/graphics/Rect;

    .line 2
    .line 3
    return-void
.end method

.method public final D(La/s0a;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, La/fot0;->A()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/fot0;->c:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, La/fot0;->n:La/s0a;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-ne p1, v1, :cond_0

    .line 11
    .line 12
    iget-object v3, p0, La/fot0;->b:Ljava/util/HashSet;

    .line 13
    .line 14
    invoke-virtual {v3, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    iput-object v2, p0, La/fot0;->n:La/s0a;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    iget-object v1, p0, La/fot0;->o:La/s0a;

    .line 23
    .line 24
    if-ne p1, v1, :cond_1

    .line 25
    .line 26
    iget-object p1, p0, La/fot0;->b:Ljava/util/HashSet;

    .line 27
    .line 28
    invoke-virtual {p1, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    iput-object v2, p0, La/fot0;->o:La/s0a;

    .line 32
    .line 33
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    iget-object p1, p0, La/fot0;->d:Ljava/lang/Object;

    .line 35
    .line 36
    monitor-enter p1

    .line 37
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 38
    iput-object v2, p0, La/fot0;->j:La/h55;

    .line 39
    .line 40
    iput-object v2, p0, La/fot0;->l:Landroid/graphics/Rect;

    .line 41
    .line 42
    iget-object p1, p0, La/fot0;->g:La/fpt0;

    .line 43
    .line 44
    iput-object p1, p0, La/fot0;->i:La/fpt0;

    .line 45
    .line 46
    iput-object v2, p0, La/fot0;->f:La/fpt0;

    .line 47
    .line 48
    iput-object v2, p0, La/fot0;->k:La/fpt0;

    .line 49
    .line 50
    return-void

    .line 51
    :catchall_1
    move-exception p0

    .line 52
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 53
    throw p0

    .line 54
    :goto_1
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 55
    throw p0
.end method

.method public final E(Ljava/util/List;)V
    .locals 3

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, La/xii0;

    .line 14
    .line 15
    iput-object v0, p0, La/fot0;->p:La/xii0;

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x1

    .line 22
    if-le v0, v1, :cond_1

    .line 23
    .line 24
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, La/xii0;

    .line 29
    .line 30
    iput-object v0, p0, La/fot0;->q:La/xii0;

    .line 31
    .line 32
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_4

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, La/xii0;

    .line 47
    .line 48
    invoke-virtual {v0}, La/xii0;->b()Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    :cond_3
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, La/hzj;

    .line 67
    .line 68
    iget-object v2, v1, La/hzj;->j:Ljava/lang/Class;

    .line 69
    .line 70
    if-nez v2, :cond_3

    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    iput-object v2, v1, La/hzj;->j:Ljava/lang/Class;

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_4
    :goto_1
    return-void
.end method

.method public final F(La/h55;La/h55;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, La/fot0;->z(La/h55;La/h55;)La/h55;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, La/fot0;->j:La/h55;

    .line 6
    .line 7
    return-void
.end method

.method public final a(La/tii0;La/h55;)V
    .locals 4

    .line 1
    sget-object v0, La/h55;->h:Landroid/util/Range;

    .line 2
    .line 3
    iget-object v1, p2, La/h55;->e:Landroid/util/Range;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/util/Range;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iget-object p0, p2, La/h55;->e:Landroid/util/Range;

    .line 12
    .line 13
    iget-object p1, p1, La/sii0;->b:La/ucs0;

    .line 14
    .line 15
    sget-object p2, La/t7a;->h:La/u15;

    .line 16
    .line 17
    iget-object p1, p1, La/ucs0;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p1, La/wy40;

    .line 20
    .line 21
    invoke-virtual {p1, p2, p0}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    iget-object p2, p0, La/fot0;->c:Ljava/lang/Object;

    .line 26
    .line 27
    monitor-enter p2

    .line 28
    :try_start_0
    iget-object p0, p0, La/fot0;->n:La/s0a;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-interface {p0}, La/s0a;->h()La/n0a;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-interface {p0}, La/n0a;->o()La/kpd0;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const-class v1, Landroidx/camera/core/internal/compat/quirk/AeFpsRangeQuirk;

    .line 42
    .line 43
    invoke-virtual {p0, v1}, La/kpd0;->c(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    const/4 v2, 0x0

    .line 52
    const/4 v3, 0x1

    .line 53
    if-gt v1, v3, :cond_1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    move v3, v2

    .line 57
    :goto_0
    const-string v1, "There should not have more than one AeFpsRangeQuirk."

    .line 58
    .line 59
    invoke-static {v1, v3}, La/z1x;->t(Ljava/lang/String;Z)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_3

    .line 67
    .line 68
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    check-cast p0, Landroidx/camera/core/internal/compat/quirk/AeFpsRangeQuirk;

    .line 73
    .line 74
    check-cast p0, Landroidx/camera/camera2/compat/quirk/AeFpsRangeLegacyQuirk;

    .line 75
    .line 76
    iget-object p0, p0, Landroidx/camera/camera2/compat/quirk/AeFpsRangeLegacyQuirk;->a:La/n0o0;

    .line 77
    .line 78
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, Landroid/util/Range;

    .line 83
    .line 84
    if-nez p0, :cond_2

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    move-object v0, p0

    .line 88
    :goto_1
    iget-object p0, p1, La/sii0;->b:La/ucs0;

    .line 89
    .line 90
    sget-object p1, La/t7a;->h:La/u15;

    .line 91
    .line 92
    iget-object p0, p0, La/ucs0;->d:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast p0, La/wy40;

    .line 95
    .line 96
    invoke-virtual {p0, p1, v0}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :catchall_0
    move-exception p0

    .line 101
    goto :goto_3

    .line 102
    :cond_3
    :goto_2
    monitor-exit p2

    .line 103
    return-void

    .line 104
    :goto_3
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    throw p0
.end method

.method public final b(La/s0a;La/s0a;La/fpt0;La/fpt0;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/fot0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iput-object p1, p0, La/fot0;->n:La/s0a;

    .line 5
    .line 6
    iput-object p2, p0, La/fot0;->o:La/s0a;

    .line 7
    .line 8
    iget-object v1, p0, La/fot0;->b:Ljava/util/HashSet;

    .line 9
    .line 10
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, La/fot0;->b:Ljava/util/HashSet;

    .line 16
    .line 17
    invoke-virtual {v1, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 21
    iput-object p3, p0, La/fot0;->f:La/fpt0;

    .line 22
    .line 23
    iput-object p4, p0, La/fot0;->k:La/fpt0;

    .line 24
    .line 25
    invoke-interface {p1}, La/s0a;->h()La/n0a;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget-object p2, p0, La/fot0;->f:La/fpt0;

    .line 30
    .line 31
    iget-object p3, p0, La/fot0;->k:La/fpt0;

    .line 32
    .line 33
    invoke-virtual {p0, p1, p2, p3}, La/fot0;->q(La/n0a;La/fpt0;La/fpt0;)La/fpt0;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, La/fot0;->i:La/fpt0;

    .line 38
    .line 39
    iget-object p1, p0, La/fot0;->d:Ljava/lang/Object;

    .line 40
    .line 41
    monitor-enter p1

    .line 42
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    invoke-virtual {p0}, La/fot0;->t()V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 49
    throw p0

    .line 50
    :catchall_1
    move-exception p0

    .line 51
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 52
    throw p0
.end method

.method public final c()Landroid/util/Size;
    .locals 0

    .line 1
    iget-object p0, p0, La/fot0;->j:La/h55;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, La/h55;->a:Landroid/util/Size;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return-object p0
.end method

.method public final d()La/s0a;
    .locals 1

    .line 1
    iget-object v0, p0, La/fot0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, La/fot0;->n:La/s0a;

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-object p0

    .line 8
    :catchall_0
    move-exception p0

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw p0
.end method

.method public final e()La/ry9;
    .locals 1

    .line 1
    iget-object v0, p0, La/fot0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, La/fot0;->n:La/s0a;

    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    sget-object p0, La/ry9;->a:La/qy9;

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    return-object p0

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-interface {p0}, La/s0a;->d()La/ry9;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    monitor-exit v0

    .line 19
    return-object p0

    .line 20
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    throw p0
.end method

.method public final f()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, La/fot0;->d()La/s0a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v2, "No camera attached to use case: "

    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {v0, p0}, La/z1x;->x(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, La/s0a;->h()La/n0a;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-interface {p0}, La/n0a;->e()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method public abstract g(ZLa/ipt0;)La/fpt0;
.end method

.method public final h()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, La/fot0;->i:La/fpt0;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "<UnknownUseCase-"

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string p0, ">"

    .line 18
    .line 19
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    sget-object v1, La/xto0;->z0:La/u15;

    .line 27
    .line 28
    invoke-interface {v0, v1, p0}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    return-object p0
.end method

.method public final i(La/s0a;Z)I
    .locals 1

    .line 1
    invoke-interface {p1}, La/s0a;->h()La/n0a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, La/fot0;->m()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-interface {v0, p0}, La/j0a;->B(I)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-interface {p1}, La/s0a;->q()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    neg-int p0, p0

    .line 22
    invoke-static {p0}, La/jls0;->i(I)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    :cond_0
    return p0
.end method

.method public final j()La/s0a;
    .locals 1

    .line 1
    iget-object v0, p0, La/fot0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, La/fot0;->o:La/s0a;

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-object p0

    .line 8
    :catchall_0
    move-exception p0

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw p0
.end method

.method public k(La/n0a;)Ljava/util/Set;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public l()Ljava/util/Set;
    .locals 0

    .line 1
    sget-object p0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 2
    .line 3
    return-object p0
.end method

.method public final m()I
    .locals 1

    .line 1
    iget-object p0, p0, La/fot0;->i:La/fpt0;

    .line 2
    .line 3
    check-cast p0, La/w0x;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-interface {p0, v0}, La/w0x;->s(I)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public n(La/drd;)La/ept0;
    .locals 1

    .line 1
    new-instance p0, La/gyw;

    .line 2
    .line 3
    invoke-static {p1}, La/wy40;->p(La/drd;)La/wy40;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-direct {p0, p1, v0}, La/gyw;-><init>(La/wy40;B)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public o()Z
    .locals 0

    .line 1
    instance-of p0, p0, La/jyw;

    .line 2
    .line 3
    return p0
.end method

.method public final p(La/s0a;)Z
    .locals 3

    .line 1
    iget-object p0, p0, La/fot0;->i:La/fpt0;

    .line 2
    .line 3
    check-cast p0, La/w0x;

    .line 4
    .line 5
    sget-object v0, La/w0x;->n0:La/u15;

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-interface {p0, v0, v2}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    const/4 v0, 0x0

    .line 23
    if-eq p0, v1, :cond_2

    .line 24
    .line 25
    if-eqz p0, :cond_2

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    if-eq p0, v1, :cond_1

    .line 29
    .line 30
    const/4 v1, 0x2

    .line 31
    if-ne p0, v1, :cond_0

    .line 32
    .line 33
    invoke-interface {p1}, La/s0a;->k()Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    return p0

    .line 38
    :cond_0
    const-string p1, "Unknown mirrorMode: "

    .line 39
    .line 40
    invoke-static {p0, p1}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {p0}, La/c99;->l(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return v0

    .line 48
    :cond_1
    return v1

    .line 49
    :cond_2
    return v0
.end method

.method public final q(La/n0a;La/fpt0;La/fpt0;)La/fpt0;
    .locals 10

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-static {p3}, La/wy40;->p(La/drd;)La/wy40;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    sget-object v0, La/xto0;->z0:La/u15;

    .line 8
    .line 9
    invoke-virtual {p3, v0}, La/wy40;->z(La/u15;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {}, La/wy40;->l()La/wy40;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    :goto_0
    iget-object v0, p3, La/b780;->a:Ljava/util/TreeMap;

    .line 18
    .line 19
    iget-object v1, p0, La/fot0;->g:La/fpt0;

    .line 20
    .line 21
    sget-object v2, La/w0x;->k0:La/u15;

    .line 22
    .line 23
    invoke-interface {v1, v2}, La/qae0;->f(La/u15;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    iget-object v1, p0, La/fot0;->g:La/fpt0;

    .line 30
    .line 31
    sget-object v2, La/w0x;->o0:La/u15;

    .line 32
    .line 33
    invoke-interface {v1, v2}, La/qae0;->f(La/u15;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    :cond_1
    sget-object v1, La/w0x;->s0:La/u15;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    invoke-virtual {p3, v1}, La/wy40;->z(La/u15;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    iget-object v1, p0, La/fot0;->g:La/fpt0;

    .line 51
    .line 52
    sget-object v2, La/w0x;->s0:La/u15;

    .line 53
    .line 54
    invoke-interface {v1, v2}, La/qae0;->f(La/u15;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    sget-object v1, La/w0x;->q0:La/u15;

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_3

    .line 67
    .line 68
    iget-object v3, p0, La/fot0;->g:La/fpt0;

    .line 69
    .line 70
    invoke-interface {v3, v2}, La/qae0;->d(La/u15;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    check-cast v2, La/isf0;

    .line 75
    .line 76
    iget-object v2, v2, La/isf0;->b:La/jsf0;

    .line 77
    .line 78
    if-eqz v2, :cond_3

    .line 79
    .line 80
    invoke-virtual {p3, v1}, La/wy40;->z(La/u15;)V

    .line 81
    .line 82
    .line 83
    :cond_3
    iget-object v1, p0, La/fot0;->g:La/fpt0;

    .line 84
    .line 85
    invoke-interface {v1}, La/qae0;->c()Ljava/util/Set;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-eqz v2, :cond_4

    .line 98
    .line 99
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    check-cast v2, La/u15;

    .line 104
    .line 105
    iget-object v3, p0, La/fot0;->g:La/fpt0;

    .line 106
    .line 107
    invoke-static {p3, p3, v3, v2}, La/drd;->m(La/wy40;La/drd;La/drd;La/u15;)V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_4
    if-eqz p2, :cond_6

    .line 112
    .line 113
    invoke-interface {p2}, La/qae0;->c()Ljava/util/Set;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-eqz v2, :cond_6

    .line 126
    .line 127
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    check-cast v2, La/u15;

    .line 132
    .line 133
    iget-object v3, v2, La/u15;->a:Ljava/lang/String;

    .line 134
    .line 135
    sget-object v4, La/xto0;->z0:La/u15;

    .line 136
    .line 137
    iget-object v4, v4, La/u15;->a:Ljava/lang/String;

    .line 138
    .line 139
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    if-eqz v3, :cond_5

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_5
    invoke-static {p3, p3, p2, v2}, La/drd;->m(La/wy40;La/drd;La/drd;La/u15;)V

    .line 147
    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_6
    sget-object p2, La/w0x;->o0:La/u15;

    .line 151
    .line 152
    invoke-virtual {v0, p2}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result p2

    .line 156
    if-eqz p2, :cond_7

    .line 157
    .line 158
    sget-object p2, La/w0x;->k0:La/u15;

    .line 159
    .line 160
    invoke-virtual {v0, p2}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-eqz v1, :cond_7

    .line 165
    .line 166
    invoke-virtual {p3, p2}, La/wy40;->z(La/u15;)V

    .line 167
    .line 168
    .line 169
    :cond_7
    sget-object p2, La/w0x;->s0:La/u15;

    .line 170
    .line 171
    invoke-virtual {v0, p2}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    if-eqz v0, :cond_8

    .line 176
    .line 177
    invoke-virtual {p3, p2}, La/b780;->d(La/u15;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p2

    .line 181
    check-cast p2, La/isf0;

    .line 182
    .line 183
    iget p2, p2, La/isf0;->c:I

    .line 184
    .line 185
    if-eqz p2, :cond_8

    .line 186
    .line 187
    sget-object p2, La/fpt0;->L0:La/u15;

    .line 188
    .line 189
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 190
    .line 191
    invoke-virtual {p3, p2, v0}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    :cond_8
    const/4 p2, 0x2

    .line 195
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    const/4 v1, 0x1

    .line 200
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    const/4 v3, 0x0

    .line 205
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    new-instance v4, Ljava/lang/StringBuilder;

    .line 210
    .line 211
    const-string v5, "applyFeaturesToConfig: mFeatureGroup = "

    .line 212
    .line 213
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    iget-object v5, p0, La/fot0;->h:Ljava/util/HashSet;

    .line 217
    .line 218
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    const-string v5, ", this = "

    .line 222
    .line 223
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    const-string v5, "UseCase"

    .line 234
    .line 235
    invoke-static {v5, v4}, La/l8x;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    iget-object v4, p0, La/fot0;->h:Ljava/util/HashSet;

    .line 239
    .line 240
    if-nez v4, :cond_9

    .line 241
    .line 242
    goto/16 :goto_4

    .line 243
    .line 244
    :cond_9
    sget v5, La/cgn;->c:I

    .line 245
    .line 246
    sget-object v5, La/h55;->h:Landroid/util/Range;

    .line 247
    .line 248
    sget-object v6, La/sfu0;->c:La/rfu0;

    .line 249
    .line 250
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    sget-object v7, La/agn;->d:La/agn;

    .line 255
    .line 256
    :cond_a
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 257
    .line 258
    .line 259
    move-result v8

    .line 260
    if-eqz v8, :cond_d

    .line 261
    .line 262
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v8

    .line 266
    check-cast v8, La/giv;

    .line 267
    .line 268
    instance-of v9, v8, La/cgn;

    .line 269
    .line 270
    if-eqz v9, :cond_b

    .line 271
    .line 272
    check-cast v8, La/cgn;

    .line 273
    .line 274
    iget-object v7, v8, La/cgn;->a:La/agn;

    .line 275
    .line 276
    goto :goto_3

    .line 277
    :cond_b
    instance-of v9, v8, La/rwq;

    .line 278
    .line 279
    if-eqz v9, :cond_c

    .line 280
    .line 281
    check-cast v8, La/rwq;

    .line 282
    .line 283
    new-instance v5, Landroid/util/Range;

    .line 284
    .line 285
    iget-byte v9, v8, La/rwq;->a:B

    .line 286
    .line 287
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 288
    .line 289
    .line 290
    move-result-object v9

    .line 291
    iget-byte v8, v8, La/rwq;->b:B

    .line 292
    .line 293
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 294
    .line 295
    .line 296
    move-result-object v8

    .line 297
    invoke-direct {v5, v9, v8}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    .line 298
    .line 299
    .line 300
    goto :goto_3

    .line 301
    :cond_c
    instance-of v9, v8, La/sfu0;

    .line 302
    .line 303
    if-eqz v9, :cond_a

    .line 304
    .line 305
    check-cast v8, La/sfu0;

    .line 306
    .line 307
    iget-object v6, v8, La/sfu0;->a:La/rfu0;

    .line 308
    .line 309
    goto :goto_3

    .line 310
    :cond_d
    instance-of v4, p0, La/oub0;

    .line 311
    .line 312
    if-nez v4, :cond_e

    .line 313
    .line 314
    invoke-static {p0}, La/qsm0;->v(La/fot0;)Z

    .line 315
    .line 316
    .line 317
    move-result v4

    .line 318
    if-eqz v4, :cond_f

    .line 319
    .line 320
    :cond_e
    sget-object v4, La/h0x;->j0:La/u15;

    .line 321
    .line 322
    invoke-virtual {p3, v4, v7}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    :cond_f
    sget-object v4, La/fpt0;->I0:La/u15;

    .line 326
    .line 327
    invoke-virtual {p3, v4, v5}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 331
    .line 332
    .line 333
    move-result v4

    .line 334
    if-eqz v4, :cond_13

    .line 335
    .line 336
    if-eq v4, v1, :cond_12

    .line 337
    .line 338
    if-eq v4, p2, :cond_11

    .line 339
    .line 340
    const/4 p2, 0x3

    .line 341
    if-eq v4, p2, :cond_10

    .line 342
    .line 343
    goto :goto_4

    .line 344
    :cond_10
    sget-object p2, La/fpt0;->O0:La/u15;

    .line 345
    .line 346
    invoke-virtual {p3, p2, v0}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    sget-object p2, La/fpt0;->P0:La/u15;

    .line 350
    .line 351
    invoke-virtual {p3, p2, v3}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    goto :goto_4

    .line 355
    :cond_11
    sget-object p2, La/fpt0;->O0:La/u15;

    .line 356
    .line 357
    invoke-virtual {p3, p2, v3}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    sget-object p2, La/fpt0;->P0:La/u15;

    .line 361
    .line 362
    invoke-virtual {p3, p2, v0}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    goto :goto_4

    .line 366
    :cond_12
    sget-object p2, La/fpt0;->O0:La/u15;

    .line 367
    .line 368
    invoke-virtual {p3, p2, v2}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    sget-object p2, La/fpt0;->P0:La/u15;

    .line 372
    .line 373
    invoke-virtual {p3, p2, v2}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    goto :goto_4

    .line 377
    :cond_13
    sget-object p2, La/fpt0;->O0:La/u15;

    .line 378
    .line 379
    invoke-virtual {p3, p2, v3}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 380
    .line 381
    .line 382
    sget-object p2, La/fpt0;->P0:La/u15;

    .line 383
    .line 384
    invoke-virtual {p3, p2, v3}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    :goto_4
    invoke-virtual {p0, p3}, La/fot0;->n(La/drd;)La/ept0;

    .line 388
    .line 389
    .line 390
    move-result-object p2

    .line 391
    invoke-virtual {p0, p1, p2}, La/fot0;->v(La/n0a;La/ept0;)La/fpt0;

    .line 392
    .line 393
    .line 394
    move-result-object p0

    .line 395
    return-object p0
.end method

.method public final r()V
    .locals 2

    .line 1
    iget-object v0, p0, La/fot0;->b:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, La/eot0;

    .line 18
    .line 19
    invoke-interface {v1, p0}, La/eot0;->l(La/fot0;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method

.method public final s()V
    .locals 3

    .line 1
    iget v0, p0, La/fot0;->e:I

    .line 2
    .line 3
    invoke-static {v0}, La/hne;->E(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, La/fot0;->b:Ljava/util/HashSet;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-eq v0, v2, :cond_0

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_0
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, La/eot0;

    .line 30
    .line 31
    invoke-interface {v1, p0}, La/eot0;->c(La/fot0;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, La/eot0;

    .line 50
    .line 51
    invoke-interface {v1, p0}, La/eot0;->j(La/fot0;)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    :goto_2
    return-void
.end method

.method public t()V
    .locals 0

    .line 1
    return-void
.end method

.method public u()V
    .locals 0

    .line 1
    return-void
.end method

.method public v(La/n0a;La/ept0;)La/fpt0;
    .locals 0

    .line 1
    invoke-interface {p2}, La/ept0;->e()La/fpt0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public w()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, La/fot0;->a:Z

    .line 3
    .line 4
    return-void
.end method

.method public x()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, La/fot0;->a:Z

    .line 3
    .line 4
    return-void
.end method

.method public y(La/drd;)La/h55;
    .locals 0

    .line 1
    iget-object p0, p0, La/fot0;->j:La/h55;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, La/h55;->b()La/qgd;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iput-object p1, p0, La/qgd;->g:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {p0}, La/qgd;->i()La/h55;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    const-string p0, "Attempt to update the implementation options for a use case without attached stream specifications."

    .line 17
    .line 18
    invoke-static {p0}, La/v4i0;->p(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method

.method public abstract z(La/h55;La/h55;)La/h55;
.end method
