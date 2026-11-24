.class public final La/eyj0;
.super La/lm40;
.source "SourceFile"

# interfaces
.implements La/ehl;
.implements La/fe60;


# instance fields
.field public o:La/ugg0;

.field public p:La/kjj0;

.field public q:La/oil;


# virtual methods
.method public final R()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, La/eyj0;->q:La/oil;

    .line 3
    .line 4
    invoke-static {p0}, La/vfc;->J(La/ehl;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    if-eqz p1, :cond_4

    .line 5
    .line 6
    instance-of v0, p1, La/eyj0;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_1
    iget-object v0, p0, La/eyj0;->o:La/ugg0;

    .line 12
    .line 13
    check-cast p1, La/eyj0;

    .line 14
    .line 15
    iget-object v1, p1, La/eyj0;->o:La/ugg0;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_2
    iget-object p0, p0, La/eyj0;->p:La/kjj0;

    .line 25
    .line 26
    iget-object p1, p1, La/eyj0;->p:La/kjj0;

    .line 27
    .line 28
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-nez p0, :cond_3

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_3
    :goto_0
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 38
    return p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, La/eyj0;->o:La/ugg0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/ugg0;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object p0, p0, La/eyj0;->p:La/kjj0;

    .line 10
    .line 11
    invoke-virtual {p0}, La/kjj0;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, v0

    .line 16
    return p0
.end method

.method public final u0(La/g7z;)V
    .locals 10

    .line 1
    iget-object v0, p0, La/eyj0;->q:La/oil;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, La/vcc;->a0(La/yzj;)La/cg80;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, La/cg80;->getGraphicsContext()La/afv;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, La/afv;->a()La/ehf0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, La/eyj0;->o:La/ugg0;

    .line 18
    .line 19
    iget-object v2, p0, La/eyj0;->p:La/kjj0;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    new-instance v3, La/oil;

    .line 25
    .line 26
    invoke-direct {v3, v1, v2, v0}, La/oil;-><init>(La/ugg0;La/kjj0;La/ehf0;)V

    .line 27
    .line 28
    .line 29
    iput-object v3, p0, La/eyj0;->q:La/oil;

    .line 30
    .line 31
    move-object v4, v3

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v4, v0

    .line 34
    :goto_0
    iget-object p0, p1, La/g7z;->a:La/a6a;

    .line 35
    .line 36
    invoke-interface {p0}, La/fhl;->d()J

    .line 37
    .line 38
    .line 39
    move-result-wide v6

    .line 40
    const/4 v9, 0x0

    .line 41
    const/high16 v8, 0x3f800000    # 1.0f

    .line 42
    .line 43
    move-object v5, p1

    .line 44
    invoke-virtual/range {v4 .. v9}, La/pm80;->e(La/fhl;JFLa/a4d;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v5}, La/g7z;->a()V

    .line 48
    .line 49
    .line 50
    return-void
.end method
