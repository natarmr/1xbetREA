.class public final La/b4c0;
.super La/e06;
.source "SourceFile"


# instance fields
.field public final i:La/hbj;

.field public final j:La/ex60;

.field public final k:La/cil;

.field public final l:La/x860;

.field public final m:Landroidx/media3/common/b;

.field public n:Z

.field public o:J

.field public p:Z

.field public q:Z

.field public r:Z

.field public s:La/rsj;

.field public t:Landroidx/media3/common/MediaItem;


# direct methods
.method public constructor <init>(Landroidx/media3/common/MediaItem;La/hbj;La/ex60;La/cil;La/x860;Landroidx/media3/common/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, La/e06;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/b4c0;->t:Landroidx/media3/common/MediaItem;

    .line 5
    .line 6
    iput-object p2, p0, La/b4c0;->i:La/hbj;

    .line 7
    .line 8
    iput-object p3, p0, La/b4c0;->j:La/ex60;

    .line 9
    .line 10
    iput-object p4, p0, La/b4c0;->k:La/cil;

    .line 11
    .line 12
    iput-object p5, p0, La/b4c0;->l:La/x860;

    .line 13
    .line 14
    iput-object p6, p0, La/b4c0;->m:Landroidx/media3/common/b;

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    iput-boolean p1, p0, La/b4c0;->n:Z

    .line 18
    .line 19
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    iput-wide p1, p0, La/b4c0;->o:J

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a(La/vn30;La/lhf0;J)La/mn30;
    .locals 14

    .line 1
    iget-object v1, p0, La/b4c0;->i:La/hbj;

    .line 2
    .line 3
    invoke-interface {v1}, La/hbj;->d()La/jbj;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    iget-object v1, p0, La/b4c0;->s:La/rsj;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-interface {v2, v1}, La/jbj;->c(La/rsj;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, La/b4c0;->g()Landroidx/media3/common/MediaItem;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object v1, v1, Landroidx/media3/common/MediaItem;->b:La/en30;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v3, La/y3c0;

    .line 24
    .line 25
    iget-object v4, v1, La/en30;->a:Landroid/net/Uri;

    .line 26
    .line 27
    iget-object v5, p0, La/e06;->g:La/a4a0;

    .line 28
    .line 29
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object v5, p0, La/b4c0;->j:La/ex60;

    .line 33
    .line 34
    iget-object v5, v5, La/ex60;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v5, La/iuo;

    .line 37
    .line 38
    move-object v6, v3

    .line 39
    new-instance v3, La/oif0;

    .line 40
    .line 41
    invoke-direct {v3, v5}, La/oif0;-><init>(La/iuo;)V

    .line 42
    .line 43
    .line 44
    new-instance v5, La/zhl;

    .line 45
    .line 46
    iget-object v7, p0, La/e06;->d:La/zhl;

    .line 47
    .line 48
    iget-object v7, v7, La/zhl;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 49
    .line 50
    const/4 v9, 0x0

    .line 51
    invoke-direct {v5, v7, v9, p1}, La/zhl;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILa/vn30;)V

    .line 52
    .line 53
    .line 54
    new-instance v7, La/zhl;

    .line 55
    .line 56
    iget-object v10, p0, La/e06;->c:La/zhl;

    .line 57
    .line 58
    iget-object v10, v10, La/zhl;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 59
    .line 60
    invoke-direct {v7, v10, v9, p1}, La/zhl;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILa/vn30;)V

    .line 61
    .line 62
    .line 63
    iget-wide v0, v1, La/en30;->e:J

    .line 64
    .line 65
    invoke-static {v0, v1}, La/vtt0;->M(J)J

    .line 66
    .line 67
    .line 68
    move-result-wide v11

    .line 69
    const/4 v13, 0x0

    .line 70
    move-object v1, v4

    .line 71
    iget-object v4, p0, La/b4c0;->k:La/cil;

    .line 72
    .line 73
    move-object v0, v6

    .line 74
    iget-object v6, p0, La/b4c0;->l:La/x860;

    .line 75
    .line 76
    iget-object v10, p0, La/b4c0;->m:Landroidx/media3/common/b;

    .line 77
    .line 78
    move-object v8, p0

    .line 79
    move-object/from16 v9, p2

    .line 80
    .line 81
    invoke-direct/range {v0 .. v13}, La/y3c0;-><init>(Landroid/net/Uri;La/jbj;La/oif0;La/cil;La/zhl;La/x860;La/zhl;La/b4c0;La/lhf0;Landroidx/media3/common/b;JLa/gff0;)V

    .line 82
    .line 83
    .line 84
    return-object v0
.end method

.method public final declared-synchronized g()Landroidx/media3/common/MediaItem;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, La/b4c0;->t:Landroidx/media3/common/MediaItem;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
.end method

.method public final k(La/rsj;)V
    .locals 2

    .line 1
    iput-object p1, p0, La/b4c0;->s:La/rsj;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, La/e06;->g:La/a4a0;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, La/b4c0;->k:La/cil;

    .line 16
    .line 17
    invoke-interface {v1, p1, v0}, La/cil;->a(Landroid/os/Looper;La/a4a0;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v1}, La/cil;->b()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, La/b4c0;->s()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final m(La/mn30;)V
    .locals 6

    .line 1
    check-cast p1, La/y3c0;

    .line 2
    .line 3
    iget-boolean p0, p1, La/y3c0;->x:Z

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p0, :cond_1

    .line 7
    .line 8
    iget-object p0, p1, La/y3c0;->u:[La/hxg0;

    .line 9
    .line 10
    array-length v1, p0

    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v1, :cond_1

    .line 13
    .line 14
    aget-object v3, p0, v2

    .line 15
    .line 16
    invoke-virtual {v3}, La/hxg0;->j()V

    .line 17
    .line 18
    .line 19
    iget-object v4, v3, La/hxg0;->h:La/ivn;

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    iget-object v5, v3, La/hxg0;->e:La/zhl;

    .line 24
    .line 25
    invoke-virtual {v4, v5}, La/ivn;->m(La/zhl;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, v3, La/hxg0;->h:La/ivn;

    .line 29
    .line 30
    iput-object v0, v3, La/hxg0;->g:Landroidx/media3/common/b;

    .line 31
    .line 32
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget-object p0, p1, La/y3c0;->l:La/lhf0;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, La/lhf0;->F(La/lq00;)V

    .line 38
    .line 39
    .line 40
    iget-object p0, p1, La/y3c0;->q:Landroid/os/Handler;

    .line 41
    .line 42
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p1, La/y3c0;->r:La/ln30;

    .line 46
    .line 47
    const/4 p0, 0x1

    .line 48
    iput-boolean p0, p1, La/y3c0;->t1:Z

    .line 49
    .line 50
    return-void
.end method

.method public final o()V
    .locals 0

    .line 1
    iget-object p0, p0, La/b4c0;->k:La/cil;

    .line 2
    .line 3
    invoke-interface {p0}, La/cil;->release()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final declared-synchronized r(Landroidx/media3/common/MediaItem;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-object p1, p0, La/b4c0;->t:Landroidx/media3/common/MediaItem;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method

.method public final s()V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, La/i3k0;

    .line 4
    .line 5
    iget-wide v6, v0, La/b4c0;->o:J

    .line 6
    .line 7
    iget-boolean v14, v0, La/b4c0;->p:Z

    .line 8
    .line 9
    iget-boolean v2, v0, La/b4c0;->q:Z

    .line 10
    .line 11
    invoke-virtual {v0}, La/b4c0;->g()Landroidx/media3/common/MediaItem;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-object v2, v3, Landroidx/media3/common/MediaItem;->c:La/dn30;

    .line 18
    .line 19
    :goto_0
    move-object/from16 v19, v2

    .line 20
    .line 21
    move-object/from16 v18, v3

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    const/4 v2, 0x0

    .line 25
    goto :goto_0

    .line 26
    :goto_1
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    const-wide/16 v10, 0x0

    .line 37
    .line 38
    const-wide/16 v12, 0x0

    .line 39
    .line 40
    const/4 v15, 0x0

    .line 41
    const/16 v16, 0x0

    .line 42
    .line 43
    const/16 v17, 0x0

    .line 44
    .line 45
    move-wide v8, v6

    .line 46
    invoke-direct/range {v1 .. v19}, La/i3k0;-><init>(JJJJJJZZZLa/gst;Landroidx/media3/common/MediaItem;La/dn30;)V

    .line 47
    .line 48
    .line 49
    iget-boolean v2, v0, La/b4c0;->n:Z

    .line 50
    .line 51
    if-eqz v2, :cond_1

    .line 52
    .line 53
    new-instance v2, La/z3c0;

    .line 54
    .line 55
    invoke-direct {v2, v1}, La/pwq;-><init>(La/bmq0;)V

    .line 56
    .line 57
    .line 58
    move-object v1, v2

    .line 59
    :cond_1
    invoke-virtual {v0, v1}, La/e06;->l(La/bmq0;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final t(JLa/fvh0;Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, La/b4c0;->r:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {p3}, La/fvh0;->a()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-interface {p3}, La/fvh0;->a()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    xor-int/lit8 v0, v0, 0x1

    .line 17
    .line 18
    iput-boolean v0, p0, La/b4c0;->r:Z

    .line 19
    .line 20
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    cmp-long v0, p1, v0

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    iget-wide p1, p0, La/b4c0;->o:J

    .line 30
    .line 31
    :cond_1
    invoke-interface {p3}, La/fvh0;->d()Z

    .line 32
    .line 33
    .line 34
    move-result p3

    .line 35
    iget-boolean v0, p0, La/b4c0;->n:Z

    .line 36
    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    iget-wide v0, p0, La/b4c0;->o:J

    .line 40
    .line 41
    cmp-long v0, v0, p1

    .line 42
    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    iget-boolean v0, p0, La/b4c0;->p:Z

    .line 46
    .line 47
    if-ne v0, p3, :cond_2

    .line 48
    .line 49
    iget-boolean v0, p0, La/b4c0;->q:Z

    .line 50
    .line 51
    if-ne v0, p4, :cond_2

    .line 52
    .line 53
    :goto_0
    return-void

    .line 54
    :cond_2
    iput-wide p1, p0, La/b4c0;->o:J

    .line 55
    .line 56
    iput-boolean p3, p0, La/b4c0;->p:Z

    .line 57
    .line 58
    iput-boolean p4, p0, La/b4c0;->q:Z

    .line 59
    .line 60
    const/4 p1, 0x0

    .line 61
    iput-boolean p1, p0, La/b4c0;->n:Z

    .line 62
    .line 63
    invoke-virtual {p0}, La/b4c0;->s()V

    .line 64
    .line 65
    .line 66
    return-void
.end method
