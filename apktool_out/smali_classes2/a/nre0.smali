.class public final La/nre0;
.super La/q8a;
.source "SourceFile"


# instance fields
.field public final l:La/x83;

.field public final m:Z


# direct methods
.method public constructor <init>(La/x83;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/nre0;->l:La/x83;

    .line 5
    .line 6
    iput-boolean p2, p0, La/nre0;->m:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final X()La/x83;
    .locals 0

    .line 1
    iget-object p0, p0, La/nre0;->l:La/x83;

    .line 2
    .line 3
    return-object p0
.end method

.method public final Z()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/nre0;->m:Z

    .line 2
    .line 3
    return p0
.end method

.method public final d0(La/dcg0;)La/twq;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, La/v2;

    .line 5
    .line 6
    invoke-virtual {p1}, La/v2;->j()La/sgy;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, La/sgy;->v()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    new-instance p1, La/twq;

    .line 19
    .line 20
    invoke-direct {p1, p0}, La/twq;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_0
    invoke-interface {p1}, La/kiy;->o()La/fhy;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    instance-of p1, p0, La/xgy;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    check-cast p0, La/xgy;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move-object p0, v0

    .line 37
    :goto_0
    if-eqz p0, :cond_2

    .line 38
    .line 39
    invoke-virtual {p0}, La/xgy;->U()La/qlc;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-eqz p0, :cond_2

    .line 44
    .line 45
    invoke-virtual {p0}, La/qlc;->a()La/swq;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    if-eqz p0, :cond_2

    .line 50
    .line 51
    iget-object p0, p0, La/swq;->a:La/twq;

    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_2
    return-object v0
.end method

.method public final l0(La/aty;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of p0, p1, La/v2;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    check-cast p1, La/v2;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object p1, v0

    .line 13
    :goto_0
    if-eqz p1, :cond_1

    .line 14
    .line 15
    invoke-interface {p1}, La/kiy;->o()La/fhy;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move-object p0, v0

    .line 21
    :goto_1
    instance-of p1, p0, La/sgy;

    .line 22
    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    move-object v0, p0

    .line 26
    check-cast v0, La/sgy;

    .line 27
    .line 28
    :cond_2
    if-nez v0, :cond_3

    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    return p0

    .line 32
    :cond_3
    invoke-static {v0}, La/azw;->G(La/sgy;)Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    return p0
.end method

.method public final m0()Z
    .locals 1

    .line 1
    iget-object p0, p0, La/nre0;->l:La/x83;

    .line 2
    .line 3
    sget-object v0, La/x83;->b:La/x83;

    .line 4
    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final o0(La/jzs0;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of p0, p1, La/niy;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    check-cast p1, La/niy;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object p1, v0

    .line 13
    :goto_0
    if-eqz p1, :cond_3

    .line 14
    .line 15
    iget-object p0, p1, La/niy;->c:La/oiy;

    .line 16
    .line 17
    instance-of p1, p0, La/xgy;

    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    move-object v0, p0

    .line 22
    check-cast v0, La/xgy;

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    instance-of p1, p0, La/dre0;

    .line 26
    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    check-cast p0, La/dre0;

    .line 30
    .line 31
    invoke-interface {p0}, La/dre0;->K()La/ihy;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    instance-of p1, p0, La/xgy;

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    move-object v0, p0

    .line 40
    check-cast v0, La/xgy;

    .line 41
    .line 42
    :cond_2
    :goto_1
    if-eqz v0, :cond_3

    .line 43
    .line 44
    invoke-virtual {v0}, La/xgy;->X()La/qpy;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    if-nez p0, :cond_3

    .line 49
    .line 50
    const/4 p0, 0x1

    .line 51
    return p0

    .line 52
    :cond_3
    const/4 p0, 0x0

    .line 53
    return p0
.end method
