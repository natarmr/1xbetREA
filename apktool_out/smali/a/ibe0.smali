.class public final La/ibe0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/e1x;


# instance fields
.field public a:I

.field public b:Z

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/e1x;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/ibe0;->c:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, La/ibe0;->a:I

    .line 13
    .line 14
    iput-boolean v0, p0, La/ibe0;->b:Z

    .line 15
    .line 16
    new-instance v0, La/nyw;

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    invoke-direct {v0, p0, v1}, La/nyw;-><init>(Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, La/ibe0;->g:Ljava/lang/Object;

    .line 23
    .line 24
    iput-object p1, p0, La/ibe0;->d:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-interface {p1}, La/e1x;->getSurface()Landroid/view/Surface;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, La/ibe0;->e:Ljava/lang/Object;

    .line 31
    .line 32
    return-void
.end method

.method public constructor <init>(La/o1x;Ljava/util/List;ILa/o1x;La/f7k0;La/gqw0;Z)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, La/ibe0;->c:Ljava/lang/Object;

    .line 35
    iput-object p2, p0, La/ibe0;->e:Ljava/lang/Object;

    .line 36
    iput p3, p0, La/ibe0;->a:I

    .line 37
    iput-object p4, p0, La/ibe0;->d:Ljava/lang/Object;

    .line 38
    iput-object p5, p0, La/ibe0;->f:Ljava/lang/Object;

    .line 39
    iput-object p6, p0, La/ibe0;->g:Ljava/lang/Object;

    .line 40
    iput-boolean p7, p0, La/ibe0;->b:Z

    return-void
.end method

.method public static c(La/ibe0;ILa/o1x;I)La/ibe0;
    .locals 8

    .line 1
    and-int/lit8 v0, p3, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget p1, p0, La/ibe0;->a:I

    .line 6
    .line 7
    :cond_0
    move v3, p1

    .line 8
    and-int/lit8 p1, p3, 0x2

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iget-object p1, p0, La/ibe0;->d:Ljava/lang/Object;

    .line 13
    .line 14
    move-object p2, p1

    .line 15
    check-cast p2, La/o1x;

    .line 16
    .line 17
    :cond_1
    move-object v4, p2

    .line 18
    iget-object p1, p0, La/ibe0;->f:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v5, p1

    .line 21
    check-cast v5, La/f7k0;

    .line 22
    .line 23
    new-instance v0, La/ibe0;

    .line 24
    .line 25
    iget-object p1, p0, La/ibe0;->c:Ljava/lang/Object;

    .line 26
    .line 27
    move-object v1, p1

    .line 28
    check-cast v1, La/o1x;

    .line 29
    .line 30
    iget-object p1, p0, La/ibe0;->e:Ljava/lang/Object;

    .line 31
    .line 32
    move-object v2, p1

    .line 33
    check-cast v2, Ljava/util/List;

    .line 34
    .line 35
    iget-object p1, p0, La/ibe0;->g:Ljava/lang/Object;

    .line 36
    .line 37
    move-object v6, p1

    .line 38
    check-cast v6, La/gqw0;

    .line 39
    .line 40
    iget-boolean v7, p0, La/ibe0;->b:Z

    .line 41
    .line 42
    invoke-direct/range {v0 .. v7}, La/ibe0;-><init>(La/o1x;Ljava/util/List;ILa/o1x;La/f7k0;La/gqw0;Z)V

    .line 43
    .line 44
    .line 45
    return-object v0
.end method


# virtual methods
.method public G()I
    .locals 1

    .line 1
    iget-object v0, p0, La/ibe0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, La/ibe0;->d:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, La/e1x;

    .line 7
    .line 8
    invoke-interface {p0}, La/e1x;->G()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    monitor-exit v0

    .line 13
    return p0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p0
.end method

.method public a(La/o1x;La/tlx;)V
    .locals 3

    .line 1
    iget-object v0, p1, La/o1x;->a:Landroid/content/Context;

    .line 2
    .line 3
    iget-object p0, p0, La/ibe0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/o1x;

    .line 6
    .line 7
    iget-object v1, p0, La/o1x;->a:Landroid/content/Context;

    .line 8
    .line 9
    const-string v2, "Interceptor \'"

    .line 10
    .line 11
    if-ne v0, v1, :cond_3

    .line 12
    .line 13
    iget-object v0, p1, La/o1x;->b:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object v1, La/i860;->a:La/i860;

    .line 16
    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    iget-object v0, p1, La/o1x;->c:La/uto0;

    .line 20
    .line 21
    iget-object v1, p0, La/o1x;->c:La/uto0;

    .line 22
    .line 23
    if-ne v0, v1, :cond_1

    .line 24
    .line 25
    iget-object p1, p1, La/o1x;->r:La/s7k0;

    .line 26
    .line 27
    iget-object p0, p0, La/o1x;->r:La/s7k0;

    .line 28
    .line 29
    if-ne p1, p0, :cond_0

    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    const-string p0, "\' cannot modify the request\'s size resolver. Use `Interceptor.Chain.withSize` instead."

    .line 33
    .line 34
    invoke-static {p2, p0, v2}, La/c99;->t(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    const-string p0, "\' cannot modify the request\'s target."

    .line 39
    .line 40
    invoke-static {p2, p0, v2}, La/c99;->t(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    const-string p0, "\' cannot set the request\'s data to null."

    .line 45
    .line 46
    invoke-static {p2, p0, v2}, La/c99;->t(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_3
    const-string p0, "\' cannot modify the request\'s context."

    .line 51
    .line 52
    invoke-static {p2, p0, v2}, La/c99;->t(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public b()La/b1x;
    .locals 3

    .line 1
    iget-object v0, p0, La/ibe0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, La/ibe0;->d:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, La/e1x;

    .line 7
    .line 8
    invoke-interface {v1}, La/e1x;->b()La/b1x;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget v2, p0, La/ibe0;->a:I

    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    iput v2, p0, La/ibe0;->a:I

    .line 19
    .line 20
    new-instance v2, La/oyw;

    .line 21
    .line 22
    invoke-direct {v2, v1}, La/oyw;-><init>(La/b1x;)V

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, La/ibe0;->g:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, La/nyw;

    .line 28
    .line 29
    invoke-virtual {v2, p0}, La/jwq;->a(La/iwq;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v2, 0x0

    .line 34
    :goto_0
    monitor-exit v0

    .line 35
    return-object v2

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    throw p0
.end method

.method public b0()La/b1x;
    .locals 3

    .line 1
    iget-object v0, p0, La/ibe0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, La/ibe0;->d:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, La/e1x;

    .line 7
    .line 8
    invoke-interface {v1}, La/e1x;->b0()La/b1x;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget v2, p0, La/ibe0;->a:I

    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    iput v2, p0, La/ibe0;->a:I

    .line 19
    .line 20
    new-instance v2, La/oyw;

    .line 21
    .line 22
    invoke-direct {v2, v1}, La/oyw;-><init>(La/b1x;)V

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, La/ibe0;->g:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, La/nyw;

    .line 28
    .line 29
    invoke-virtual {v2, p0}, La/jwq;->a(La/iwq;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v2, 0x0

    .line 34
    :goto_0
    monitor-exit v0

    .line 35
    return-object v2

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    throw p0
.end method

.method public close()V
    .locals 2

    .line 1
    iget-object v0, p0, La/ibe0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, La/ibe0;->e:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Landroid/view/Surface;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/view/Surface;->release()V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    :goto_0
    iget-object p0, p0, La/ibe0;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, La/e1x;

    .line 19
    .line 20
    invoke-interface {p0}, La/e1x;->close()V

    .line 21
    .line 22
    .line 23
    monitor-exit v0

    .line 24
    return-void

    .line 25
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    throw p0
.end method

.method public d(La/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, La/ibe0;->a:I

    .line 2
    .line 3
    instance-of v1, p1, La/hbe0;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p1

    .line 8
    check-cast v1, La/hbe0;

    .line 9
    .line 10
    iget v2, v1, La/hbe0;->l:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, La/hbe0;->l:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, La/hbe0;

    .line 23
    .line 24
    invoke-direct {v1, p0, p1}, La/hbe0;-><init>(La/ibe0;La/zje;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p1, v1, La/hbe0;->j:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v3, v1, La/hbe0;->l:I

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x1

    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    if-ne v3, v5, :cond_1

    .line 38
    .line 39
    iget-object v0, v1, La/hbe0;->i:La/tlx;

    .line 40
    .line 41
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v4

    .line 51
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, La/ibe0;->e:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, Ljava/util/List;

    .line 57
    .line 58
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    check-cast p1, La/tlx;

    .line 63
    .line 64
    add-int/2addr v0, v5

    .line 65
    const/4 v3, 0x6

    .line 66
    invoke-static {p0, v0, v4, v3}, La/ibe0;->c(La/ibe0;ILa/o1x;I)La/ibe0;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iput-object p1, v1, La/hbe0;->i:La/tlx;

    .line 71
    .line 72
    iput v5, v1, La/hbe0;->l:I

    .line 73
    .line 74
    invoke-interface {p1, v0, v1}, La/tlx;->a(La/ibe0;La/zje;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-ne v0, v2, :cond_3

    .line 79
    .line 80
    return-object v2

    .line 81
    :cond_3
    move-object v6, v0

    .line 82
    move-object v0, p1

    .line 83
    move-object p1, v6

    .line 84
    :goto_1
    check-cast p1, La/u1x;

    .line 85
    .line 86
    invoke-interface {p1}, La/u1x;->getRequest()La/o1x;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {p0, v1, v0}, La/ibe0;->a(La/o1x;La/tlx;)V

    .line 91
    .line 92
    .line 93
    return-object p1
.end method

.method public e()V
    .locals 2

    .line 1
    iget-object v0, p0, La/ibe0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, La/ibe0;->b:Z

    .line 6
    .line 7
    iget-object v1, p0, La/ibe0;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/e1x;

    .line 10
    .line 11
    invoke-interface {v1}, La/e1x;->k()V

    .line 12
    .line 13
    .line 14
    iget v1, p0, La/ibe0;->a:I

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, La/ibe0;->close()V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    :goto_0
    monitor-exit v0

    .line 25
    return-void

    .line 26
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    throw p0
.end method

.method public f()I
    .locals 1

    .line 1
    iget-object v0, p0, La/ibe0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, La/ibe0;->d:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, La/e1x;

    .line 7
    .line 8
    invoke-interface {p0}, La/e1x;->f()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    monitor-exit v0

    .line 13
    return p0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p0
.end method

.method public g(La/o1x;)La/ibe0;
    .locals 2

    .line 1
    iget v0, p0, La/ibe0;->a:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, La/ibe0;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/List;

    .line 8
    .line 9
    add-int/lit8 v0, v0, -0x1

    .line 10
    .line 11
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, La/tlx;

    .line 16
    .line 17
    invoke-virtual {p0, p1, v0}, La/ibe0;->a(La/o1x;La/tlx;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    const/4 v1, 0x5

    .line 22
    invoke-static {p0, v0, p1, v1}, La/ibe0;->c(La/ibe0;ILa/o1x;I)La/ibe0;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public getSurface()Landroid/view/Surface;
    .locals 1

    .line 1
    iget-object v0, p0, La/ibe0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, La/ibe0;->d:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, La/e1x;

    .line 7
    .line 8
    invoke-interface {p0}, La/e1x;->getSurface()Landroid/view/Surface;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    monitor-exit v0

    .line 13
    return-object p0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p0
.end method

.method public h()I
    .locals 1

    .line 1
    iget-object v0, p0, La/ibe0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, La/ibe0;->d:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, La/e1x;

    .line 7
    .line 8
    invoke-interface {p0}, La/e1x;->h()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    monitor-exit v0

    .line 13
    return p0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p0
.end method

.method public j()I
    .locals 1

    .line 1
    iget-object v0, p0, La/ibe0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, La/ibe0;->d:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, La/e1x;

    .line 7
    .line 8
    invoke-interface {p0}, La/e1x;->j()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    monitor-exit v0

    .line 13
    return p0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p0
.end method

.method public k()V
    .locals 1

    .line 1
    iget-object v0, p0, La/ibe0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, La/ibe0;->d:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, La/e1x;

    .line 7
    .line 8
    invoke-interface {p0}, La/e1x;->k()V

    .line 9
    .line 10
    .line 11
    monitor-exit v0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    throw p0
.end method

.method public o(La/d1x;Ljava/util/concurrent/Executor;)V
    .locals 4

    .line 1
    iget-object v0, p0, La/ibe0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, La/ibe0;->d:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, La/e1x;

    .line 7
    .line 8
    new-instance v2, La/uq;

    .line 9
    .line 10
    const/16 v3, 0x1d

    .line 11
    .line 12
    invoke-direct {v2, p0, p1, v3}, La/uq;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    invoke-interface {v1, v2, p2}, La/e1x;->o(La/d1x;Ljava/util/concurrent/Executor;)V

    .line 16
    .line 17
    .line 18
    monitor-exit v0

    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    throw p0
.end method
