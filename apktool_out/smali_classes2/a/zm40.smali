.class public final La/zm40;
.super La/wjj;
.source "SourceFile"

# interfaces
.implements La/ym40;


# instance fields
.field public final d:La/eu00;

.field public final e:La/ary;

.field public final f:Ljava/util/Map;

.field public final g:La/zg80;

.field public h:La/yuu;

.field public i:La/pg80;

.field public final j:Z

.field public final k:La/zt00;

.field public final l:La/n0o0;


# direct methods
.method public constructor <init>(La/g950;La/eu00;La/ary;I)V
    .locals 1

    .line 1
    sget-object p4, La/lun;->a:La/lun;

    .line 2
    .line 3
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, La/ujn;->c:La/f93;

    .line 7
    .line 8
    invoke-direct {p0, v0, p1}, La/wjj;-><init>(La/g93;La/g950;)V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, La/zm40;->d:La/eu00;

    .line 12
    .line 13
    iput-object p3, p0, La/zm40;->e:La/ary;

    .line 14
    .line 15
    iget-boolean p3, p1, La/g950;->b:Z

    .line 16
    .line 17
    if-eqz p3, :cond_1

    .line 18
    .line 19
    iput-object p4, p0, La/zm40;->f:Ljava/util/Map;

    .line 20
    .line 21
    sget-object p1, La/zg80;->a:La/xg80;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    sget-object p1, La/xg80;->b:La/pfw;

    .line 27
    .line 28
    invoke-virtual {p0, p1}, La/zm40;->h0(La/pfw;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, La/zg80;

    .line 33
    .line 34
    if-nez p1, :cond_0

    .line 35
    .line 36
    sget-object p1, La/yg80;->b:La/yg80;

    .line 37
    .line 38
    :cond_0
    iput-object p1, p0, La/zm40;->g:La/zg80;

    .line 39
    .line 40
    const/4 p1, 0x1

    .line 41
    iput-boolean p1, p0, La/zm40;->j:Z

    .line 42
    .line 43
    new-instance p3, La/caz;

    .line 44
    .line 45
    const/4 p4, 0x5

    .line 46
    invoke-direct {p3, p0, p4}, La/caz;-><init>(Ljava/lang/Object;B)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2, p3}, La/eu00;->c(Lkotlin/jvm/functions/Function1;)La/zt00;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    iput-object p2, p0, La/zm40;->k:La/zt00;

    .line 54
    .line 55
    new-instance p2, La/gey;

    .line 56
    .line 57
    invoke-direct {p2, p0, p1}, La/gey;-><init>(La/zm40;B)V

    .line 58
    .line 59
    .line 60
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iput-object p1, p0, La/zm40;->l:La/n0o0;

    .line 65
    .line 66
    return-void

    .line 67
    :cond_1
    const-string p0, "Module name must be special: "

    .line 68
    .line 69
    invoke-static {p1, p0}, La/e9d0;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const/4 p0, 0x0

    .line 73
    throw p0
.end method


# virtual methods
.method public final Y()Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, La/zm40;->h:La/yuu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, v0, La/yuu;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/util/List;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-virtual {p0}, La/wjj;->getName()La/g950;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    iget-object p0, p0, La/g950;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const-string v0, " were not set"

    .line 20
    .line 21
    const-string v1, "Dependencies of module "

    .line 22
    .line 23
    invoke-static {p0, v0, v1}, La/hny;->m(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method public final Z(La/ym40;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eq p0, p1, :cond_3

    .line 5
    .line 6
    iget-object v0, p0, La/zm40;->h:La/yuu;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, La/yuu;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, La/xun;

    .line 14
    .line 15
    invoke-static {v0, p1}, Lkotlin/collections/CollectionsKt;->L(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0}, La/zm40;->Y()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-interface {p1}, La/ym40;->Y()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-interface {p1, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const/4 p0, 0x0

    .line 45
    return p0

    .line 46
    :cond_3
    :goto_0
    const/4 p0, 0x1

    .line 47
    return p0
.end method

.method public final c()La/ary;
    .locals 0

    .line 1
    iget-object p0, p0, La/zm40;->e:La/ary;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c0(La/swq;)La/gdz;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/zm40;->o1()V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, La/zm40;->k:La/zt00;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, La/zt00;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, La/gdz;

    .line 14
    .line 15
    return-object p0
.end method

.method public final h0(La/pfw;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/zm40;->f:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    :cond_0
    return-object p0
.end method

.method public final i0(La/zjj;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1, p0, p2}, La/zjj;->o(La/zm40;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final j()La/vjj;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final n(La/swq;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/zm40;->o1()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/zm40;->o1()V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/zm40;->l:La/n0o0;

    .line 11
    .line 12
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, La/hld;

    .line 17
    .line 18
    invoke-virtual {p0, p1, p2}, La/hld;->n(La/swq;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final o1()V
    .locals 3

    .line 1
    iget-boolean v0, p0, La/zm40;->j:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    sget-object v0, La/unx;->a:La/pfw;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, La/zm40;->h0(La/pfw;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-static {}, La/hny;->b()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    new-instance v0, La/byw;

    .line 19
    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v2, "Accessing invalid module descriptor "

    .line 23
    .line 24
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-static {p0}, La/wjj;->n1(La/vjj;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-boolean v1, p0, La/zm40;->j:Z

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    const-string v1, " !isValid"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    :cond_0
    const-string v1, " packageFragmentProvider: "

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, La/zm40;->i:La/pg80;

    .line 25
    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 p0, 0x0

    .line 38
    :goto_0
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method
