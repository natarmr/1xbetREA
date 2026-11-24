.class public final La/j9z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/g93;


# instance fields
.field public final a:La/f7u;

.field public final b:La/m8y;

.field public final c:Z

.field public final d:La/xg;


# direct methods
.method public constructor <init>(La/f7u;La/m8y;Z)V
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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/j9z;->a:La/f7u;

    .line 11
    .line 12
    iput-object p2, p0, La/j9z;->b:La/m8y;

    .line 13
    .line 14
    iput-boolean p3, p0, La/j9z;->c:Z

    .line 15
    .line 16
    iget-object p1, p1, La/f7u;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, La/v7i;

    .line 19
    .line 20
    iget-object p1, p1, La/v7i;->i:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, La/eu00;

    .line 23
    .line 24
    new-instance p2, La/w0;

    .line 25
    .line 26
    const/16 p3, 0x1c

    .line 27
    .line 28
    invoke-direct {p2, p0, p3}, La/w0;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, p2}, La/eu00;->d(Lkotlin/jvm/functions/Function1;)La/xg;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, La/j9z;->d:La/xg;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final O0(La/swq;)La/t83;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/j9z;->b:La/m8y;

    .line 5
    .line 6
    invoke-interface {v0, p1}, La/m8y;->a(La/swq;)La/cqe0;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    iget-object v2, p0, La/j9z;->d:La/xg;

    .line 13
    .line 14
    invoke-virtual {v2, v1}, La/xg;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, La/t83;

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-object v1

    .line 24
    :cond_1
    :goto_0
    sget-object v1, La/l8y;->a:La/g950;

    .line 25
    .line 26
    iget-object p0, p0, La/j9z;->a:La/f7u;

    .line 27
    .line 28
    invoke-static {p1, v0, p0}, La/l8y;->a(La/swq;La/m8y;La/f7u;)La/rnb0;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public final isEmpty()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/j9z;->b:La/m8y;

    .line 2
    .line 3
    invoke-interface {p0}, La/m8y;->getAnnotations()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result p0

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

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    .line 1
    iget-object v0, p0, La/j9z;->b:La/m8y;

    .line 2
    .line 3
    invoke-interface {v0}, La/m8y;->getAnnotations()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/Iterable;

    .line 8
    .line 9
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->I(Ljava/lang/Iterable;)La/sx3;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, La/j9z;->d:La/xg;

    .line 14
    .line 15
    invoke-static {v1, v2}, La/pgi0;->p(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/qls0;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    sget-object v2, La/l8y;->a:La/g950;

    .line 20
    .line 21
    sget-object v2, La/i4m0;->m:La/swq;

    .line 22
    .line 23
    iget-object p0, p0, La/j9z;->a:La/f7u;

    .line 24
    .line 25
    invoke-static {v2, v0, p0}, La/l8y;->a(La/swq;La/m8y;La/f7u;)La/rnb0;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-instance v0, La/sx3;

    .line 30
    .line 31
    const/4 v2, 0x5

    .line 32
    invoke-direct {v0, p0, v2}, La/sx3;-><init>(Ljava/lang/Object;B)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x2

    .line 36
    new-array p0, p0, [Lkotlin/sequences/Sequence;

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    aput-object v1, p0, v2

    .line 40
    .line 41
    const/4 v1, 0x1

    .line 42
    aput-object v0, p0, v1

    .line 43
    .line 44
    invoke-static {p0}, La/tx3;->t([Ljava/lang/Object;)Lkotlin/sequences/Sequence;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    new-instance v0, La/eoh0;

    .line 52
    .line 53
    const/16 v1, 0x16

    .line 54
    .line 55
    invoke-direct {v0, v1}, La/eoh0;-><init>(B)V

    .line 56
    .line 57
    .line 58
    invoke-static {p0, v0}, La/lgi0;->c(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/ckq;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    new-instance v0, La/eoh0;

    .line 63
    .line 64
    const/16 v1, 0x19

    .line 65
    .line 66
    invoke-direct {v0, v1}, La/eoh0;-><init>(B)V

    .line 67
    .line 68
    .line 69
    new-instance v1, La/c5q;

    .line 70
    .line 71
    invoke-direct {v1, p0, v2, v0}, La/c5q;-><init>(Lkotlin/sequences/Sequence;ZLkotlin/jvm/functions/Function1;)V

    .line 72
    .line 73
    .line 74
    new-instance p0, La/b5q;

    .line 75
    .line 76
    invoke-direct {p0, v1}, La/b5q;-><init>(La/c5q;)V

    .line 77
    .line 78
    .line 79
    return-object p0
.end method

.method public final bridge z0(La/swq;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, La/jar0;->U(La/g93;La/swq;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method
