.class public final La/wbk;
.super La/sfx;
.source "SourceFile"

# interfaces
.implements La/v6z;


# instance fields
.field public q:La/vhv0;

.field public r:La/itt0;

.field public s:La/vhv0;


# virtual methods
.method public final a1()V
    .locals 3

    .line 1
    iget-object v0, p0, La/wbk;->q:La/vhv0;

    .line 2
    .line 3
    iget-object v1, p0, La/sfx;->o:La/vhv0;

    .line 4
    .line 5
    new-instance v2, La/ujo;

    .line 6
    .line 7
    invoke-direct {v2, v0, v1}, La/ujo;-><init>(La/vhv0;La/vhv0;)V

    .line 8
    .line 9
    .line 10
    iput-object v2, p0, La/wbk;->s:La/vhv0;

    .line 11
    .line 12
    invoke-super {p0}, La/sfx;->a1()V

    .line 13
    .line 14
    .line 15
    invoke-static {p0}, La/n7x;->I(La/v6z;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final c(La/vj30;La/pj30;J)La/uj30;
    .locals 8

    .line 1
    iget-object v0, p0, La/wbk;->r:La/itt0;

    .line 2
    .line 3
    iget-object p0, p0, La/wbk;->s:La/vhv0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {p0, p1}, La/vhv0;->d(La/w6k;)I

    .line 9
    .line 10
    .line 11
    move-result v5

    .line 12
    if-nez v5, :cond_0

    .line 13
    .line 14
    new-instance p0, La/vbk;

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    invoke-direct {p0, p2}, La/vbk;-><init>(B)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1, p2, p2, p0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_0
    const/4 v4, 0x0

    .line 26
    const/4 v7, 0x3

    .line 27
    const/4 v3, 0x0

    .line 28
    move v6, v5

    .line 29
    move-wide v1, p3

    .line 30
    invoke-static/range {v1 .. v7}, La/p4e;->b(JIIIII)J

    .line 31
    .line 32
    .line 33
    move-result-wide p3

    .line 34
    invoke-interface {p2, p3, p4}, La/pj30;->S(J)La/pu90;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    iget p2, p0, La/pu90;->a:I

    .line 39
    .line 40
    new-instance p3, La/y1;

    .line 41
    .line 42
    const/16 p4, 0x15

    .line 43
    .line 44
    invoke-direct {p3, p0, p4}, La/y1;-><init>(La/pu90;B)V

    .line 45
    .line 46
    .line 47
    invoke-static {p1, p2, v5, p3}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0
.end method
