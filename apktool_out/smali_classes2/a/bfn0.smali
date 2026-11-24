.class public final La/bfn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/cr30;


# instance fields
.field public final b:La/cr30;

.field public final c:La/xzs0;

.field public d:Ljava/util/HashMap;

.field public final e:La/n0o0;


# direct methods
.method public constructor <init>(La/cr30;La/xzs0;)V
    .locals 1

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
    iput-object p1, p0, La/bfn0;->b:La/cr30;

    .line 11
    .line 12
    new-instance p1, La/fyk0;

    .line 13
    .line 14
    const/16 v0, 0x10

    .line 15
    .line 16
    invoke-direct {p1, p2, v0}, La/fyk0;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 20
    .line 21
    .line 22
    iget-object p1, p2, La/xzs0;->a:La/vzs0;

    .line 23
    .line 24
    invoke-static {p1}, La/tke;->m0(La/vzs0;)La/vzs0;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    new-instance p2, La/xzs0;

    .line 29
    .line 30
    invoke-direct {p2, p1}, La/xzs0;-><init>(La/vzs0;)V

    .line 31
    .line 32
    .line 33
    iput-object p2, p0, La/bfn0;->c:La/xzs0;

    .line 34
    .line 35
    new-instance p1, La/fyk0;

    .line 36
    .line 37
    const/16 p2, 0x11

    .line 38
    .line 39
    invoke-direct {p1, p0, p2}, La/fyk0;-><init>(Ljava/lang/Object;B)V

    .line 40
    .line 41
    .line 42
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, La/bfn0;->e:La/n0o0;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final a(La/g950;La/ux50;)Ljava/util/Collection;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/bfn0;->b:La/cr30;

    .line 5
    .line 6
    invoke-interface {v0, p1, p2}, La/cr30;->a(La/g950;La/ux50;)Ljava/util/Collection;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0, p1}, La/bfn0;->i(Ljava/util/Collection;)Ljava/util/Collection;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final b(La/cek;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/bfn0;->e:La/n0o0;

    .line 5
    .line 6
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Ljava/util/Collection;

    .line 11
    .line 12
    return-object p0
.end method

.method public final c()Ljava/util/Set;
    .locals 0

    .line 1
    iget-object p0, p0, La/bfn0;->b:La/cr30;

    .line 2
    .line 3
    invoke-interface {p0}, La/cr30;->c()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final d(La/g950;La/ux50;)La/foc;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/bfn0;->b:La/cr30;

    .line 8
    .line 9
    invoke-interface {v0, p1, p2}, La/cr30;->d(La/g950;La/ux50;)La/foc;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p1}, La/bfn0;->h(La/vjj;)La/vjj;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, La/foc;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public final e()Ljava/util/Set;
    .locals 0

    .line 1
    iget-object p0, p0, La/bfn0;->b:La/cr30;

    .line 2
    .line 3
    invoke-interface {p0}, La/cr30;->e()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final f(La/g950;La/ux50;)Ljava/util/Collection;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/bfn0;->b:La/cr30;

    .line 5
    .line 6
    invoke-interface {v0, p1, p2}, La/cr30;->f(La/g950;La/ux50;)Ljava/util/Collection;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0, p1}, La/bfn0;->i(Ljava/util/Collection;)Ljava/util/Collection;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final g()Ljava/util/Set;
    .locals 0

    .line 1
    iget-object p0, p0, La/bfn0;->b:La/cr30;

    .line 2
    .line 3
    invoke-interface {p0}, La/cr30;->g()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final h(La/vjj;)La/vjj;
    .locals 3

    .line 1
    iget-object v0, p0, La/bfn0;->c:La/xzs0;

    .line 2
    .line 3
    iget-object v1, v0, La/xzs0;->a:La/vzs0;

    .line 4
    .line 5
    invoke-virtual {v1}, La/vzs0;->e()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    iget-object v1, p0, La/bfn0;->d:Ljava/util/HashMap;

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    new-instance v1, Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, La/bfn0;->d:Ljava/util/HashMap;

    .line 22
    .line 23
    :cond_1
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    if-nez p0, :cond_4

    .line 28
    .line 29
    instance-of p0, p1, La/wen0;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    if-eqz p0, :cond_3

    .line 33
    .line 34
    move-object p0, p1

    .line 35
    check-cast p0, La/wen0;

    .line 36
    .line 37
    invoke-interface {p0, v0}, La/wen0;->f(La/xzs0;)La/xjj;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    if-eqz p0, :cond_2

    .line 42
    .line 43
    invoke-interface {v1, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    const-string p0, "We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but "

    .line 48
    .line 49
    const-string v0, " substitution fails"

    .line 50
    .line 51
    invoke-static {p1, v0, p0}, La/hny;->m(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v2

    .line 55
    :cond_3
    const-string p0, "Unknown descriptor in scope: "

    .line 56
    .line 57
    invoke-static {p1, p0}, La/udk;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v2

    .line 61
    :cond_4
    :goto_0
    check-cast p0, La/vjj;

    .line 62
    .line 63
    return-object p0
.end method

.method public final i(Ljava/util/Collection;)Ljava/util/Collection;
    .locals 3

    .line 1
    iget-object v0, p0, La/bfn0;->c:La/xzs0;

    .line 2
    .line 3
    iget-object v0, v0, La/xzs0;->a:La/vzs0;

    .line 4
    .line 5
    invoke-virtual {v0}, La/vzs0;->e()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_1
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 24
    .line 25
    const/4 v2, 0x3

    .line 26
    if-ge v0, v2, :cond_2

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    div-int/lit8 v2, v0, 0x3

    .line 30
    .line 31
    add-int/2addr v2, v0

    .line 32
    add-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    :goto_0
    invoke-direct {v1, v2}, Ljava/util/LinkedHashSet;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, La/vjj;

    .line 52
    .line 53
    invoke-virtual {p0, v0}, La/bfn0;->h(La/vjj;)La/vjj;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    return-object v1
.end method
