.class public final La/huj0;
.super La/q8a;
.source "SourceFile"


# instance fields
.field public final l:La/e83;

.field public final m:Z

.field public final n:La/f7u;

.field public final o:La/x83;

.field public final p:Z


# direct methods
.method public constructor <init>(La/e83;ZLa/f7u;La/x83;Z)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/huj0;->l:La/e83;

    .line 8
    .line 9
    iput-boolean p2, p0, La/huj0;->m:Z

    .line 10
    .line 11
    iput-object p3, p0, La/huj0;->n:La/f7u;

    .line 12
    .line 13
    iput-object p4, p0, La/huj0;->o:La/x83;

    .line 14
    .line 15
    iput-boolean p5, p0, La/huj0;->p:Z

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final P(Ljava/lang/Object;La/aty;)Z
    .locals 2

    .line 1
    check-cast p1, La/t83;

    .line 2
    .line 3
    instance-of v0, p1, La/i9z;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, La/huj0;->b0()Z

    .line 8
    .line 9
    .line 10
    move-object v0, p1

    .line 11
    check-cast v0, La/i9z;

    .line 12
    .line 13
    iget-boolean v0, v0, La/i9z;->g:Z

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, La/huj0;->o:La/x83;

    .line 18
    .line 19
    sget-object v1, La/x83;->f:La/x83;

    .line 20
    .line 21
    if-eq v0, v1, :cond_1

    .line 22
    .line 23
    :cond_0
    if-eqz p2, :cond_2

    .line 24
    .line 25
    check-cast p2, La/wsy;

    .line 26
    .line 27
    invoke-static {p2}, La/ary;->G(La/wsy;)Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    iget-object p0, p0, La/huj0;->n:La/f7u;

    .line 34
    .line 35
    iget-object p2, p0, La/f7u;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p2, La/v7i;

    .line 38
    .line 39
    iget-object p2, p2, La/v7i;->l:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p2, La/a93;

    .line 42
    .line 43
    invoke-virtual {p2, p1}, La/u0;->i(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    iget-object p0, p0, La/f7u;->b:Ljava/lang/Object;

    .line 50
    .line 51
    :cond_1
    const/4 p0, 0x1

    .line 52
    return p0

    .line 53
    :cond_2
    const/4 p0, 0x0

    .line 54
    return p0
.end method

.method public final T()La/u0;
    .locals 0

    .line 1
    iget-object p0, p0, La/huj0;->n:La/f7u;

    .line 2
    .line 3
    iget-object p0, p0, La/f7u;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/v7i;

    .line 6
    .line 7
    iget-object p0, p0, La/v7i;->l:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, La/a93;

    .line 10
    .line 11
    return-object p0
.end method

.method public final U(La/aty;)Ljava/lang/Iterable;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, La/wsy;

    .line 5
    .line 6
    invoke-virtual {p1}, La/wsy;->getAnnotations()La/g93;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final W()Ljava/lang/Iterable;
    .locals 0

    .line 1
    iget-object p0, p0, La/huj0;->l:La/e83;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0}, La/e83;->getAnnotations()La/g93;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, La/iun;->a:La/iun;

    .line 13
    .line 14
    return-object p0
.end method

.method public final X()La/x83;
    .locals 0

    .line 1
    iget-object p0, p0, La/huj0;->o:La/x83;

    .line 2
    .line 3
    return-object p0
.end method

.method public final Y()La/jay;
    .locals 0

    .line 1
    iget-object p0, p0, La/huj0;->n:La/f7u;

    .line 2
    .line 3
    iget-object p0, p0, La/f7u;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/a8z;

    .line 6
    .line 7
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, La/jay;

    .line 12
    .line 13
    return-object p0
.end method

.method public final Z()Z
    .locals 1

    .line 1
    iget-object p0, p0, La/huj0;->l:La/e83;

    .line 2
    .line 3
    instance-of v0, p0, La/k3u0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, La/k3u0;

    .line 8
    .line 9
    iget-object p0, p0, La/k3u0;->k:La/wsy;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public final a0(La/lov0;La/t8y;)La/lov0;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object p0, La/p860;->c:La/p860;

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    const/4 v0, 0x2

    .line 7
    invoke-static {p1, p0, p2, v0}, La/lov0;->a(La/lov0;Ljava/lang/Object;ZI)La/lov0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    if-eqz p2, :cond_1

    .line 13
    .line 14
    iget-object p0, p2, La/t8y;->a:La/lov0;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_1
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public final b0()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/huj0;->n:La/f7u;

    .line 2
    .line 3
    iget-object p0, p0, La/f7u;->b:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0
.end method

.method public final c0(La/aty;)La/aty;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, La/wsy;

    .line 5
    .line 6
    invoke-static {p1}, La/xsm0;->m(La/wsy;)La/wsy;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final d0(La/dcg0;)La/twq;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, La/wsy;

    .line 5
    .line 6
    sget-object p0, La/e0t0;->a:La/a2o;

    .line 7
    .line 8
    invoke-virtual {p1}, La/wsy;->S()La/iys0;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-interface {p0}, La/iys0;->n()La/foc;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    instance-of p1, p0, La/wm40;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    check-cast p0, La/wm40;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object p0, v0

    .line 25
    :goto_0
    if-eqz p0, :cond_1

    .line 26
    .line 27
    invoke-static {p0}, La/oek;->f(La/vjj;)La/twq;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_1
    return-object v0
.end method

.method public final i0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/huj0;->p:Z

    .line 2
    .line 3
    return p0
.end method

.method public final bridge synthetic j0()La/yzs0;
    .locals 0

    .line 1
    sget-object p0, La/gqw0;->C1:La/gqw0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final m0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/huj0;->m:Z

    .line 2
    .line 3
    return p0
.end method

.method public final n0(La/aty;La/aty;)Z
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
    iget-object p0, p0, La/huj0;->n:La/f7u;

    .line 8
    .line 9
    iget-object p0, p0, La/f7u;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, La/v7i;

    .line 12
    .line 13
    iget-object p0, p0, La/v7i;->m:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, La/km50;

    .line 16
    .line 17
    check-cast p1, La/wsy;

    .line 18
    .line 19
    check-cast p2, La/wsy;

    .line 20
    .line 21
    check-cast p0, La/lm50;

    .line 22
    .line 23
    invoke-virtual {p0, p1, p2}, La/lm50;->a(La/wsy;La/wsy;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0
.end method

.method public final p0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final q0(La/aty;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, La/wsy;

    .line 5
    .line 6
    invoke-virtual {p1}, La/wsy;->j0()La/tft0;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    instance-of p0, p0, La/t660;

    .line 11
    .line 12
    return p0
.end method
