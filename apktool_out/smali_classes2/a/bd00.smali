.class public final La/bd00;
.super La/dd00;
.source "SourceFile"


# virtual methods
.method public final a(Ljava/lang/Object;J)V
    .locals 0

    .line 1
    invoke-static {p1, p2, p3}, La/hft0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, La/zlx;

    .line 6
    .line 7
    check-cast p0, La/m4;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, La/m4;->a:Z

    .line 11
    .line 12
    return-void
.end method

.method public final b(Ljava/lang/Object;JLjava/lang/Object;)V
    .locals 3

    .line 1
    invoke-static {p1, p2, p3}, La/hft0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, La/zlx;

    .line 6
    .line 7
    invoke-static {p4, p2, p3}, La/hft0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p4

    .line 11
    check-cast p4, La/zlx;

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-interface {p4}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-lez v0, :cond_1

    .line 22
    .line 23
    if-lez v1, :cond_1

    .line 24
    .line 25
    move-object v2, p0

    .line 26
    check-cast v2, La/m4;

    .line 27
    .line 28
    iget-boolean v2, v2, La/m4;->a:Z

    .line 29
    .line 30
    if-nez v2, :cond_0

    .line 31
    .line 32
    add-int/2addr v1, v0

    .line 33
    invoke-interface {p0, v1}, La/zlx;->n(I)La/zlx;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    :cond_0
    invoke-interface {p0, p4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 38
    .line 39
    .line 40
    :cond_1
    if-lez v0, :cond_2

    .line 41
    .line 42
    move-object p4, p0

    .line 43
    :cond_2
    invoke-static {p1, p2, p3, p4}, La/hft0;->q(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final c(Ljava/lang/Object;J)Ljava/util/List;
    .locals 1

    .line 1
    invoke-static {p1, p2, p3}, La/hft0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, La/zlx;

    .line 6
    .line 7
    move-object v0, p0

    .line 8
    check-cast v0, La/m4;

    .line 9
    .line 10
    iget-boolean v0, v0, La/m4;->a:Z

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    const/16 v0, 0xa

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    mul-int/lit8 v0, v0, 0x2

    .line 24
    .line 25
    :goto_0
    invoke-interface {p0, v0}, La/zlx;->n(I)La/zlx;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p1, p2, p3, p0}, La/hft0;->q(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-object p0
.end method
