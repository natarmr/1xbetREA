.class public final Lf;
.super La/lm40;
.source "SourceFile"

# interfaces
.implements La/ehl;


# instance fields
.field public o:Z

.field public p:F

.field public q:S

.field public r:La/t33;

.field public s:La/bby;


# virtual methods
.method public final R0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lf;->r:La/t33;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/high16 v0, 0x3f800000    # 1.0f

    .line 6
    .line 7
    invoke-static {v0}, La/xf0;->c(F)La/t33;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lf;->r:La/t33;

    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, Lf;->Z0()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final S0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lf;->s:La/bby;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0, v1}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iput-object v1, p0, Lf;->s:La/bby;

    .line 10
    .line 11
    return-void
.end method

.method public final T0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lf;->Z0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final Z0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lf;->r:La/t33;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lf;->s:La/bby;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {v0, v1}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 12
    .line 13
    .line 14
    :cond_1
    invoke-virtual {p0}, La/lm40;->N0()La/vne;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v2, Le;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-direct {v2, p0, v1, v3}, Le;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 22
    .line 23
    .line 24
    const/4 v3, 0x3

    .line 25
    invoke-static {v0, v1, v1, v2, v3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Lf;->s:La/bby;

    .line 30
    .line 31
    return-void
.end method

.method public final u0(La/g7z;)V
    .locals 6

    .line 1
    iget-object v0, p1, La/g7z;->a:La/a6a;

    .line 2
    .line 3
    iget-object p0, p0, Lf;->r:La/t33;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, La/t33;->d()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/lang/Number;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/high16 p0, 0x3f800000    # 1.0f

    .line 19
    .line 20
    :goto_0
    invoke-interface {v0}, La/fhl;->E0()J

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    iget-object v0, v0, La/a6a;->b:La/nr;

    .line 25
    .line 26
    invoke-virtual {v0}, La/nr;->p()J

    .line 27
    .line 28
    .line 29
    move-result-wide v3

    .line 30
    invoke-virtual {v0}, La/nr;->i()La/x5a;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    invoke-interface {v5}, La/x5a;->l()V

    .line 35
    .line 36
    .line 37
    :try_start_0
    iget-object v5, v0, La/nr;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v5, La/fvt0;

    .line 40
    .line 41
    invoke-virtual {v5, p0, p0, v1, v2}, La/fvt0;->z(FFJ)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, La/g7z;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    invoke-static {v0, v3, v4}, Lc;->g(La/nr;J)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :catchall_0
    move-exception p0

    .line 52
    invoke-static {v0, v3, v4}, Lc;->g(La/nr;J)V

    .line 53
    .line 54
    .line 55
    throw p0
.end method
