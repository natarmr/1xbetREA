.class public abstract La/wm40;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/vlc;
.implements La/goc;


# virtual methods
.method public abstract I()La/kzj0;
.end method

.method public abstract J(La/vzs0;)La/cr30;
.end method

.method public K(La/vzs0;La/cty;)La/cr30;
    .locals 1

    .line 1
    invoke-virtual {p1}, La/vzs0;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, p2}, La/wm40;->l0(La/cty;)La/cr30;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const/16 p0, 0xc

    .line 15
    .line 16
    invoke-static {p0}, La/h1;->s0(I)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    throw p0

    .line 21
    :cond_1
    new-instance v0, La/xzs0;

    .line 22
    .line 23
    invoke-direct {v0, p1}, La/xzs0;-><init>(La/vzs0;)V

    .line 24
    .line 25
    .line 26
    new-instance p1, La/bfn0;

    .line 27
    .line 28
    invoke-virtual {p0, p2}, La/wm40;->l0(La/cty;)La/cr30;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-direct {p1, p0, v0}, La/bfn0;-><init>(La/cr30;La/xzs0;)V

    .line 33
    .line 34
    .line 35
    return-object p1
.end method

.method public M()Ljava/util/List;
    .locals 0

    .line 1
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/16 p0, 0x12

    .line 7
    .line 8
    invoke-static {p0}, La/llc;->s0(I)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public S()La/wm40;
    .locals 0

    .line 1
    return-object p0
.end method

.method public U()La/cr30;
    .locals 0

    .line 1
    sget-object p0, La/br30;->b:La/br30;

    .line 2
    .line 3
    return-object p0
.end method

.method public f0()La/c8z;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method

.method public g()Ljava/util/Collection;
    .locals 0

    .line 1
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/16 p0, 0x10

    .line 7
    .line 8
    invoke-static {p0}, La/f0o;->s0(I)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public getVisibility()La/tek;
    .locals 0

    .line 1
    sget-object p0, La/uek;->e:La/tek;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/16 p0, 0x11

    .line 7
    .line 8
    invoke-static {p0}, La/llc;->s0(I)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public isInline()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public abstract j0()La/cr30;
.end method

.method public k0()La/cr30;
    .locals 1

    .line 1
    invoke-static {p0}, La/oek;->c(La/vjj;)La/ym40;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La/rek;->h(La/ym40;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, La/cty;->b0:La/cty;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, La/wm40;->l0(La/cty;)La/cr30;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    const/16 p0, 0x11

    .line 18
    .line 19
    invoke-static {p0}, La/h1;->s0(I)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    throw p0
.end method

.method public l0(La/cty;)La/cr30;
    .locals 0

    .line 1
    sget-object p0, La/br30;->b:La/br30;

    .line 2
    .line 3
    return-object p0
.end method

.method public m()La/gm40;
    .locals 0

    .line 1
    sget-object p0, La/gm40;->b:La/gm40;

    .line 2
    .line 3
    return-object p0
.end method

.method public m0()La/flc;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public n0()La/k2u0;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public o0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public p()Ljava/util/List;
    .locals 0

    .line 1
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/4 p0, 0x6

    .line 7
    invoke-static {p0}, La/h1;->s0(I)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    throw p0
.end method

.method public p0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public q0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public r()La/slc;
    .locals 0

    .line 1
    sget-object p0, La/slc;->d:La/slc;

    .line 2
    .line 3
    return-object p0
.end method

.method public r0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
