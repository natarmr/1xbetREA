.class public final La/hdz;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/gmq;

.field public final b:Lkotlin/coroutines/CoroutineContext;

.field public final c:La/d04;

.field public final d:La/pz40;

.field public final e:La/pz40;


# direct methods
.method public constructor <init>(La/gmq;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/hdz;->a:La/gmq;

    .line 5
    .line 6
    sget-object v0, La/n6t0;->a:Lkotlin/coroutines/CoroutineContext;

    .line 7
    .line 8
    iput-object v0, p0, La/hdz;->b:Lkotlin/coroutines/CoroutineContext;

    .line 9
    .line 10
    instance-of v1, p1, La/noj0;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    check-cast p1, La/noj0;

    .line 15
    .line 16
    invoke-interface {p1}, La/noj0;->d()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, La/fl80;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p1, 0x0

    .line 28
    :goto_0
    new-instance v1, La/d04;

    .line 29
    .line 30
    invoke-direct {v1, p0, v0, p1}, La/d04;-><init>(La/hdz;Lkotlin/coroutines/CoroutineContext;La/fl80;)V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, La/hdz;->c:La/d04;

    .line 34
    .line 35
    invoke-virtual {v1}, La/d04;->d()La/txx;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, La/hdz;->d:La/pz40;

    .line 44
    .line 45
    iget-object p1, v1, La/d04;->k:La/xae0;

    .line 46
    .line 47
    iget-object p1, p1, La/xae0;->a:La/n7m0;

    .line 48
    .line 49
    invoke-interface {p1}, La/n7m0;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, La/h7d;

    .line 54
    .line 55
    if-nez p1, :cond_1

    .line 56
    .line 57
    new-instance v0, La/h7d;

    .line 58
    .line 59
    sget-object v4, La/kdz;->a:La/dp00;

    .line 60
    .line 61
    iget-object v1, v4, La/dp00;->a:La/mva;

    .line 62
    .line 63
    iget-object v2, v4, La/dp00;->b:La/mva;

    .line 64
    .line 65
    iget-object v3, v4, La/dp00;->c:La/mva;

    .line 66
    .line 67
    const/4 v5, 0x0

    .line 68
    invoke-direct/range {v0 .. v5}, La/h7d;-><init>(La/mva;La/mva;La/mva;La/dp00;La/dp00;)V

    .line 69
    .line 70
    .line 71
    move-object p1, v0

    .line 72
    :cond_1
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iput-object p1, p0, La/hdz;->e:La/pz40;

    .line 77
    .line 78
    return-void
.end method


# virtual methods
.method public final a(La/bnn0;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, La/hdz;->c:La/d04;

    .line 2
    .line 3
    iget-object v0, v0, La/d04;->k:La/xae0;

    .line 4
    .line 5
    new-instance v1, La/v6w;

    .line 6
    .line 7
    const/16 v2, 0x1c

    .line 8
    .line 9
    invoke-direct {v1, p0, v2}, La/v6w;-><init>(Ljava/lang/Object;B)V

    .line 10
    .line 11
    .line 12
    new-instance p0, La/uap;

    .line 13
    .line 14
    const/16 v2, 0xc

    .line 15
    .line 16
    invoke-direct {p0, v1, v2}, La/uap;-><init>(La/kmq;B)V

    .line 17
    .line 18
    .line 19
    iget-object v0, v0, La/xae0;->a:La/n7m0;

    .line 20
    .line 21
    invoke-interface {v0, p0, p1}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    sget-object p1, La/wne;->a:La/wne;

    .line 26
    .line 27
    if-ne p0, p1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    :goto_0
    if-ne p0, p1, :cond_1

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object p0
.end method

.method public final b(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, La/hdz;->c:La/d04;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La/d04;->a(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, La/hdz;->d()La/txx;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0, p1}, La/txx;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final c()I
    .locals 0

    .line 1
    invoke-virtual {p0}, La/hdz;->d()La/txx;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, La/txx;->b()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final d()La/txx;
    .locals 0

    .line 1
    iget-object p0, p0, La/hdz;->d:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/txx;

    .line 10
    .line 11
    return-object p0
.end method

.method public final e()La/h7d;
    .locals 0

    .line 1
    iget-object p0, p0, La/hdz;->e:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/h7d;

    .line 10
    .line 11
    return-object p0
.end method
