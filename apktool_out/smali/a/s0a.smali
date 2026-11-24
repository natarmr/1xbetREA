.class public interface abstract La/s0a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/lx9;
.implements La/eot0;


# virtual methods
.method public a()La/j0a;
    .locals 0

    .line 1
    invoke-interface {p0}, La/s0a;->h()La/n0a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public abstract b()La/da60;
.end method

.method public abstract d()La/ry9;
.end method

.method public e()La/hy9;
    .locals 0

    .line 1
    sget-object p0, La/ky9;->a:La/jy9;

    .line 2
    .line 3
    return-object p0
.end method

.method public f(La/hy9;)V
    .locals 0

    .line 1
    return-void
.end method

.method public g(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract h()La/n0a;
.end method

.method public k()Z
    .locals 0

    .line 1
    invoke-interface {p0}, La/s0a;->a()La/j0a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, La/j0a;->h()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public m()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public abstract n(Ljava/util/ArrayList;)V
.end method

.method public abstract o(Ljava/util/ArrayList;)V
.end method

.method public p()V
    .locals 0

    .line 1
    return-void
.end method

.method public q()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public r(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract release()La/ig00;
.end method
