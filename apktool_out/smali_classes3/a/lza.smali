.class public final La/lza;
.super La/qv5;
.source "SourceFile"


# instance fields
.field public f:Ljava/util/List;


# virtual methods
.method public final A(Ljava/util/List;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/kza;

    .line 5
    .line 6
    iget-object v1, p0, La/lza;->f:Ljava/util/List;

    .line 7
    .line 8
    invoke-direct {v0, v1, p1}, La/kza;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-static {v0, v1}, La/cy2;->w(La/kpb;Z)La/amk;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, La/s88;

    .line 17
    .line 18
    const/4 v2, 0x4

    .line 19
    invoke-direct {v1, p0, v2}, La/s88;-><init>(Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, La/amk;->b(La/pf00;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, La/lza;->f:Ljava/util/List;

    .line 26
    .line 27
    return-void
.end method

.method public final d()I
    .locals 0

    .line 1
    iget-object p0, p0, La/lza;->f:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final f(I)I
    .locals 1

    .line 1
    iget-object v0, p0, La/zz3;->d:La/dp;

    .line 2
    .line 3
    iget-object p0, p0, La/lza;->f:Ljava/util/List;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p0}, La/dp;->d(ILjava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final n(La/xhe0;I)V
    .locals 2

    .line 1
    iget-object v0, p0, La/lza;->f:Ljava/util/List;

    .line 2
    .line 3
    sget-object v1, La/iun;->a:La/iun;

    .line 4
    .line 5
    iget-object p0, p0, La/zz3;->d:La/dp;

    .line 6
    .line 7
    invoke-virtual {p0, v0, p2, p1, v1}, La/dp;->e(Ljava/lang/Object;ILa/xhe0;Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final o(La/xhe0;ILjava/util/List;)V
    .locals 1

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/lza;->n(La/xhe0;I)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, La/zz3;->d:La/dp;

    .line 15
    .line 16
    iget-object p0, p0, La/lza;->f:Ljava/util/List;

    .line 17
    .line 18
    invoke-virtual {v0, p0, p2, p1, p3}, La/dp;->e(Ljava/lang/Object;ILa/xhe0;Ljava/util/List;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final p(Landroid/view/ViewGroup;I)La/xhe0;
    .locals 0

    .line 1
    iget-object p0, p0, La/zz3;->d:La/dp;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, La/dp;->f(Landroid/view/ViewGroup;I)La/cp;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final z()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/lza;->f:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method
