.class public final La/bsy;
.super La/sry;
.source "SourceFile"


# instance fields
.field public final j:La/bqy;

.field public final k:La/a8z;

.field public final l:La/a8z;

.field public final m:La/a8z;


# direct methods
.method public constructor <init>(La/ihy;Ljava/lang/String;Ljava/lang/Object;La/bqy;La/rgy;)V
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
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1, p2, p3, p5}, La/sry;-><init>(La/ihy;Ljava/lang/String;Ljava/lang/Object;La/rgy;)V

    .line 14
    .line 15
    .line 16
    iput-object p4, p0, La/bsy;->j:La/bqy;

    .line 17
    .line 18
    sget-object p2, La/wez;->a:La/wez;

    .line 19
    .line 20
    new-instance p3, La/zry;

    .line 21
    .line 22
    const/4 p4, 0x0

    .line 23
    invoke-direct {p3, p0, p4}, La/zry;-><init>(La/bsy;B)V

    .line 24
    .line 25
    .line 26
    invoke-static {p2, p3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    iput-object p3, p0, La/bsy;->k:La/a8z;

    .line 31
    .line 32
    new-instance p3, La/asy;

    .line 33
    .line 34
    invoke-direct {p3, p1, p0}, La/asy;-><init>(La/ihy;La/bsy;)V

    .line 35
    .line 36
    .line 37
    invoke-static {p2, p3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    iput-object p3, p0, La/bsy;->l:La/a8z;

    .line 42
    .line 43
    new-instance p3, La/asy;

    .line 44
    .line 45
    invoke-direct {p3, p0, p1}, La/asy;-><init>(La/bsy;La/ihy;)V

    .line 46
    .line 47
    .line 48
    invoke-static {p2, p3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, La/bsy;->m:La/a8z;

    .line 53
    .line 54
    return-void
.end method


# virtual methods
.method public final A()La/fqy;
    .locals 0

    .line 1
    iget-object p0, p0, La/bsy;->k:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/fqy;

    .line 8
    .line 9
    return-object p0
.end method

.method public final B()La/hfy;
    .locals 1

    .line 1
    iget-object v0, p0, La/bsy;->j:La/bqy;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, La/j0x;->u(La/bqy;)La/wey;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v0, v0, La/wey;->a:La/hfy;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    const-string v0, "No signature for function: "

    .line 16
    .line 17
    invoke-static {p0, v0}, La/ohq;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return-object p0
.end method

.method public final C()La/nzs0;
    .locals 0

    .line 1
    iget-object p0, p0, La/bsy;->l:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/nzs0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final D()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/bsy;->j:La/bqy;

    .line 2
    .line 3
    iget-object p0, p0, La/bqy;->f:Ljava/util/ArrayList;

    .line 4
    .line 5
    return-object p0
.end method

.method public final H(La/ihy;La/rgy;)La/dre0;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, La/bsy;

    .line 8
    .line 9
    sget-object v3, La/op9;->NO_RECEIVER:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v4, p0, La/bsy;->j:La/bqy;

    .line 12
    .line 13
    iget-object v2, p0, La/sry;->d:Ljava/lang/String;

    .line 14
    .line 15
    move-object v1, p1

    .line 16
    move-object v5, p2

    .line 17
    invoke-direct/range {v0 .. v5}, La/bsy;-><init>(La/ihy;Ljava/lang/String;Ljava/lang/Object;La/bqy;La/rgy;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/bsy;->j:La/bqy;

    .line 2
    .line 3
    iget-object p0, p0, La/bqy;->b:Ljava/lang/String;

    .line 4
    .line 5
    return-object p0
.end method

.method public final getReturnType()La/kiy;
    .locals 0

    .line 1
    iget-object p0, p0, La/bsy;->m:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/kiy;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getVisibility()La/viy;
    .locals 3

    .line 1
    sget-object v0, La/j24;->a:[La/iiy;

    .line 2
    .line 3
    iget-object p0, p0, La/bsy;->j:La/bqy;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v0, La/j24;->h:La/pmi;

    .line 9
    .line 10
    sget-object v1, La/j24;->a:[La/iiy;

    .line 11
    .line 12
    const/16 v2, 0x16

    .line 13
    .line 14
    aget-object v1, v1, v2

    .line 15
    .line 16
    invoke-virtual {v0, v1, p0}, La/pmi;->v(La/iiy;Ljava/lang/Object;)Ljava/lang/Enum;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, La/nuu0;

    .line 21
    .line 22
    invoke-static {p0}, La/jwb;->b0(La/nuu0;)La/viy;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public final isExternal()Z
    .locals 3

    .line 1
    sget-object v0, La/j24;->a:[La/iiy;

    .line 2
    .line 3
    iget-object p0, p0, La/bsy;->j:La/bqy;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v0, La/j24;->m:La/c5k;

    .line 9
    .line 10
    sget-object v1, La/j24;->a:[La/iiy;

    .line 11
    .line 12
    const/16 v2, 0x1c

    .line 13
    .line 14
    aget-object v1, v1, v2

    .line 15
    .line 16
    invoke-virtual {v0, v1, p0}, La/c5k;->m(La/iiy;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
.end method

.method public final isInfix()Z
    .locals 3

    .line 1
    sget-object v0, La/j24;->a:[La/iiy;

    .line 2
    .line 3
    iget-object p0, p0, La/bsy;->j:La/bqy;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v0, La/j24;->k:La/c5k;

    .line 9
    .line 10
    sget-object v1, La/j24;->a:[La/iiy;

    .line 11
    .line 12
    const/16 v2, 0x19

    .line 13
    .line 14
    aget-object v1, v1, v2

    .line 15
    .line 16
    invoke-virtual {v0, v1, p0}, La/c5k;->m(La/iiy;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
.end method

.method public final isInline()Z
    .locals 3

    .line 1
    sget-object v0, La/j24;->a:[La/iiy;

    .line 2
    .line 3
    iget-object p0, p0, La/bsy;->j:La/bqy;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v0, La/j24;->l:La/c5k;

    .line 9
    .line 10
    sget-object v1, La/j24;->a:[La/iiy;

    .line 11
    .line 12
    const/16 v2, 0x1a

    .line 13
    .line 14
    aget-object v1, v1, v2

    .line 15
    .line 16
    invoke-virtual {v0, v1, p0}, La/c5k;->m(La/iiy;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
.end method

.method public final isOperator()Z
    .locals 3

    .line 1
    sget-object v0, La/j24;->a:[La/iiy;

    .line 2
    .line 3
    iget-object p0, p0, La/bsy;->j:La/bqy;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v0, La/j24;->j:La/c5k;

    .line 9
    .line 10
    sget-object v1, La/j24;->a:[La/iiy;

    .line 11
    .line 12
    const/16 v2, 0x18

    .line 13
    .line 14
    aget-object v1, v1, v2

    .line 15
    .line 16
    invoke-virtual {v0, v1, p0}, La/c5k;->m(La/iiy;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
.end method

.method public final isSuspend()Z
    .locals 3

    .line 1
    sget-object v0, La/j24;->a:[La/iiy;

    .line 2
    .line 3
    iget-object p0, p0, La/bsy;->j:La/bqy;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v0, La/j24;->n:La/c5k;

    .line 9
    .line 10
    sget-object v1, La/j24;->a:[La/iiy;

    .line 11
    .line 12
    const/16 v2, 0x1d

    .line 13
    .line 14
    aget-object v1, v1, v2

    .line 15
    .line 16
    invoke-virtual {v0, v1, p0}, La/c5k;->m(La/iiy;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
.end method

.method public final m()La/fm40;
    .locals 3

    .line 1
    sget-object v0, La/j24;->a:[La/iiy;

    .line 2
    .line 3
    iget-object p0, p0, La/bsy;->j:La/bqy;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v0, La/j24;->i:La/pmi;

    .line 9
    .line 10
    sget-object v1, La/j24;->a:[La/iiy;

    .line 11
    .line 12
    const/16 v2, 0x17

    .line 13
    .line 14
    aget-object v1, v1, v2

    .line 15
    .line 16
    invoke-virtual {v0, v1, p0}, La/pmi;->v(La/iiy;Ljava/lang/Object;)Ljava/lang/Enum;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, La/fm40;

    .line 21
    .line 22
    return-object p0
.end method

.method public final z()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/bsy;->j:La/bqy;

    .line 2
    .line 3
    iget-object p0, p0, La/bqy;->g:Ljava/util/ArrayList;

    .line 4
    .line 5
    return-object p0
.end method
