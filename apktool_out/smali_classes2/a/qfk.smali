.class public final La/qfk;
.super La/pfk;
.source "SourceFile"


# instance fields
.field public final g:La/mg80;

.field public final h:La/m3d0;

.field public final i:Ljava/lang/String;

.field public final j:La/swq;


# direct methods
.method public constructor <init>(La/mg80;La/m3d0;La/h950;La/e28;La/kfy;La/f6i;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
    .locals 10

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v4, La/roi0;

    .line 14
    .line 15
    iget-object v0, p2, La/m3d0;->g:La/g4d0;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-direct {v4, v0}, La/roi0;-><init>(La/g4d0;)V

    .line 21
    .line 22
    .line 23
    sget-object v0, La/xbu0;->b:La/xbu0;

    .line 24
    .line 25
    iget-object v0, p2, La/m3d0;->h:La/n4d0;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, La/tnq0;->j(La/n4d0;)La/xbu0;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    new-instance v0, La/g45;

    .line 35
    .line 36
    const/4 v8, 0x0

    .line 37
    sget-object v9, La/iun;->a:La/iun;

    .line 38
    .line 39
    move-object v3, p1

    .line 40
    move-object v2, p3

    .line 41
    move-object v6, p4

    .line 42
    move-object v7, p5

    .line 43
    move-object/from16 v1, p6

    .line 44
    .line 45
    invoke-direct/range {v0 .. v9}, La/g45;-><init>(La/f6i;La/h950;La/vjj;La/roi0;La/xbu0;La/e28;La/hfk;La/qgd;Ljava/util/List;)V

    .line 46
    .line 47
    .line 48
    iget-object v2, p2, La/m3d0;->d:Ljava/util/List;

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    iget-object v3, p2, La/m3d0;->e:Ljava/util/List;

    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iget-object v4, p2, La/m3d0;->f:Ljava/util/List;

    .line 59
    .line 60
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-object/from16 v5, p8

    .line 64
    .line 65
    move-object v1, v0

    .line 66
    move-object v0, p0

    .line 67
    invoke-direct/range {v0 .. v5}, La/pfk;-><init>(La/g45;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V

    .line 68
    .line 69
    .line 70
    iput-object p1, p0, La/qfk;->g:La/mg80;

    .line 71
    .line 72
    iput-object p2, p0, La/qfk;->h:La/m3d0;

    .line 73
    .line 74
    move-object/from16 v1, p7

    .line 75
    .line 76
    iput-object v1, p0, La/qfk;->i:Ljava/lang/String;

    .line 77
    .line 78
    move-object v1, p1

    .line 79
    check-cast v1, La/ng80;

    .line 80
    .line 81
    iget-object v1, v1, La/ng80;->f:La/swq;

    .line 82
    .line 83
    iput-object v1, p0, La/qfk;->j:La/swq;

    .line 84
    .line 85
    return-void
.end method


# virtual methods
.method public final b(La/cek;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/ux50;->a:La/ux50;

    .line 5
    .line 6
    invoke-virtual {p0, p1, p2}, La/pfk;->i(La/cek;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object p2, p0, La/pfk;->b:La/g45;

    .line 11
    .line 12
    iget-object p2, p2, La/g45;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p2, La/f6i;

    .line 15
    .line 16
    iget-object p2, p2, La/f6i;->m:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p2, Ljava/lang/Iterable;

    .line 19
    .line 20
    new-instance v0, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, La/klc;

    .line 40
    .line 41
    iget-object v2, p0, La/qfk;->j:La/swq;

    .line 42
    .line 43
    invoke-interface {v1, v2}, La/klc;->c(La/swq;)Ljava/util/Collection;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Ljava/lang/Iterable;

    .line 48
    .line 49
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0
.end method

.method public final d(La/g950;La/ux50;)La/foc;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/pfk;->b:La/g45;

    .line 8
    .line 9
    iget-object v0, v0, La/g45;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, La/f6i;

    .line 12
    .line 13
    iget-object v0, v0, La/f6i;->k:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, La/gqw0;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, La/qfk;->g:La/mg80;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    check-cast v0, La/ng80;

    .line 32
    .line 33
    iget-object v0, v0, La/ng80;->f:La/swq;

    .line 34
    .line 35
    iget-object v0, v0, La/swq;->a:La/twq;

    .line 36
    .line 37
    iget-object v0, v0, La/twq;->a:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {p1}, La/g950;->b()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-super {p0, p1, p2}, La/pfk;->d(La/g950;La/ux50;)La/foc;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method

.method public final h(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final l(La/g950;)La/qlc;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/qlc;

    .line 5
    .line 6
    iget-object p0, p0, La/qfk;->j:La/swq;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, La/qlc;-><init>(La/swq;La/g950;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final n()Ljava/util/Set;
    .locals 0

    .line 1
    sget-object p0, La/xun;->a:La/xun;

    .line 2
    .line 3
    return-object p0
.end method

.method public final o()Ljava/util/Set;
    .locals 0

    .line 1
    sget-object p0, La/xun;->a:La/xun;

    .line 2
    .line 3
    return-object p0
.end method

.method public final p()Ljava/util/Set;
    .locals 0

    .line 1
    sget-object p0, La/xun;->a:La/xun;

    .line 2
    .line 3
    return-object p0
.end method

.method public final q(La/g950;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/pfk;->m()Ljava/util/Set;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_3

    .line 13
    .line 14
    iget-object v0, p0, La/pfk;->b:La/g45;

    .line 15
    .line 16
    iget-object v0, v0, La/g45;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, La/f6i;

    .line 19
    .line 20
    iget-object v0, v0, La/f6i;->m:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ljava/lang/Iterable;

    .line 23
    .line 24
    instance-of v1, v0, Ljava/util/Collection;

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    move-object v1, v0

    .line 29
    check-cast v1, Ljava/util/Collection;

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, La/klc;

    .line 53
    .line 54
    iget-object v2, p0, La/qfk;->j:La/swq;

    .line 55
    .line 56
    invoke-interface {v1, v2, p1}, La/klc;->a(La/swq;La/g950;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 64
    return p0

    .line 65
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 66
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/qfk;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
