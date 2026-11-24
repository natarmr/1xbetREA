.class public final La/vxs0;
.super La/oer;
.source "SourceFile"

# interfaces
.implements La/x4e;


# static fields
.field public static final i1:La/uxs0;


# instance fields
.field public final f1:La/eu00;

.field public final g1:La/tfk;

.field public h1:La/flc;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    new-instance v0, La/uxs0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v0, v1}, La/uxs0;-><init>(B)V

    .line 7
    .line 8
    .line 9
    sput-object v0, La/vxs0;->i1:La/uxs0;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(La/eu00;La/tfk;La/flc;La/vxs0;La/g93;ILa/gmk0;)V
    .locals 7

    .line 1
    sget-object v5, La/lxk0;->e:La/g950;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v3, p2

    .line 5
    move-object v4, p4

    .line 6
    move-object v2, p5

    .line 7
    move v1, p6

    .line 8
    move-object v6, p7

    .line 9
    invoke-direct/range {v0 .. v6}, La/oer;-><init>(ILa/g93;La/vjj;La/mer;La/g950;La/gmk0;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, La/vxs0;->f1:La/eu00;

    .line 13
    .line 14
    iput-object v3, v0, La/vxs0;->g1:La/tfk;

    .line 15
    .line 16
    new-instance p0, La/ywm0;

    .line 17
    .line 18
    const/16 p2, 0x16

    .line 19
    .line 20
    invoke-direct {p0, v0, p3, p2}, La/ywm0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    new-instance p2, La/bu00;

    .line 27
    .line 28
    invoke-direct {p2, p1, p0}, La/bu00;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 29
    .line 30
    .line 31
    iput-object p3, v0, La/vxs0;->h1:La/flc;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final a()La/kp9;
    .locals 0

    .line 1
    invoke-super {p0}, La/oer;->a()La/mer;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    check-cast p0, La/vxs0;

    .line 9
    .line 10
    return-object p0
.end method

.method public final a()La/mer;
    .locals 0

    .line 13
    invoke-super {p0}, La/oer;->a()La/mer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p0, La/vxs0;

    return-object p0
.end method

.method public final a()La/mp9;
    .locals 0

    .line 11
    invoke-super {p0}, La/oer;->a()La/mer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p0, La/vxs0;

    return-object p0
.end method

.method public final a()La/vjj;
    .locals 0

    .line 12
    invoke-super {p0}, La/oer;->a()La/mer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p0, La/vxs0;

    return-object p0
.end method

.method public final bridge synthetic f(La/xzs0;)La/mer;
    .locals 0

    .line 6
    invoke-virtual {p0, p1}, La/vxs0;->y1(La/xzs0;)La/vxs0;

    move-result-object p0

    return-object p0
.end method

.method public final bridge synthetic f(La/xzs0;)La/xjj;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/vxs0;->y1(La/xzs0;)La/vxs0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getReturnType()La/wsy;
    .locals 0

    .line 1
    iget-object p0, p0, La/oer;->h:La/wsy;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final j()La/goc;
    .locals 0

    .line 1
    iget-object p0, p0, La/vxs0;->g1:La/tfk;

    .line 2
    .line 3
    return-object p0
.end method

.method public final j()La/vjj;
    .locals 0

    .line 4
    iget-object p0, p0, La/vxs0;->g1:La/tfk;

    return-object p0
.end method

.method public final o1()La/xjj;
    .locals 0

    .line 1
    invoke-super {p0}, La/oer;->a()La/mer;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    check-cast p0, La/vxs0;

    .line 9
    .line 10
    return-object p0
.end method

.method public final q1(ILa/g93;La/vjj;La/mer;La/g950;La/gmk0;)La/oer;
    .locals 8

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 v6, 0x1

    .line 10
    if-eq p1, v6, :cond_0

    .line 11
    .line 12
    const/4 p3, 0x4

    .line 13
    :cond_0
    new-instance v0, La/vxs0;

    .line 14
    .line 15
    iget-object v2, p0, La/vxs0;->g1:La/tfk;

    .line 16
    .line 17
    iget-object v3, p0, La/vxs0;->h1:La/flc;

    .line 18
    .line 19
    iget-object v1, p0, La/vxs0;->f1:La/eu00;

    .line 20
    .line 21
    move-object v4, p0

    .line 22
    move-object v5, p2

    .line 23
    move-object v7, p6

    .line 24
    invoke-direct/range {v0 .. v7}, La/vxs0;-><init>(La/eu00;La/tfk;La/flc;La/vxs0;La/g93;ILa/gmk0;)V

    .line 25
    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_1
    const/4 p0, 0x0

    .line 29
    throw p0
.end method

.method public final s(La/vjj;La/gm40;La/tek;)La/mp9;
    .locals 1

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/xzs0;->b:La/xzs0;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, La/oer;->u1(La/xzs0;)La/ner;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    iput-object p1, p0, La/ner;->b:La/vjj;

    .line 11
    .line 12
    iput-object p2, p0, La/ner;->c:La/gm40;

    .line 13
    .line 14
    iput-object p3, p0, La/ner;->d:La/tek;

    .line 15
    .line 16
    const/4 p1, 0x2

    .line 17
    invoke-virtual {p0, p1}, La/ner;->d(I)La/ler;

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    iput-boolean p1, p0, La/ner;->m:Z

    .line 22
    .line 23
    iget-object p1, p0, La/ner;->x:La/oer;

    .line 24
    .line 25
    invoke-virtual {p1, p0}, La/oer;->r1(La/ner;)La/oer;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    check-cast p0, La/vxs0;

    .line 33
    .line 34
    return-object p0
.end method

.method public final y1(La/xzs0;)La/vxs0;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, La/oer;->f(La/xzs0;)La/mer;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    check-cast p1, La/vxs0;

    .line 12
    .line 13
    iget-object v0, p1, La/oer;->h:La/wsy;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, La/xzs0;->d(La/wsy;)La/xzs0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object p0, p0, La/vxs0;->h1:La/flc;

    .line 23
    .line 24
    invoke-virtual {p0}, La/flc;->B1()La/flc;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0, v0}, La/flc;->E1(La/xzs0;)La/flc;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    if-nez p0, :cond_0

    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    return-object p0

    .line 36
    :cond_0
    iput-object p0, p1, La/vxs0;->h1:La/flc;

    .line 37
    .line 38
    return-object p1
.end method
