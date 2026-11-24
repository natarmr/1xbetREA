.class public final La/rzj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pot0;


# instance fields
.field public final a:La/o5d0;

.field public final b:La/tpt0;

.field public volatile c:La/xot0;

.field public final d:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(La/o5d0;La/tpt0;)V
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
    iput-object p1, p0, La/rzj;->a:La/o5d0;

    .line 11
    .line 12
    iput-object p2, p0, La/rzj;->b:La/tpt0;

    .line 13
    .line 14
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, La/rzj;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a(IIILjava/util/ArrayList;)Ljava/util/List;
    .locals 9

    .line 1
    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, La/rzj;->c:La/xot0;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1, p1, p2, p3, p4}, La/xot0;->a(IIILjava/util/ArrayList;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    iget-object v1, p0, La/rzj;->b:La/tpt0;

    .line 15
    .line 16
    iget-object v1, v1, La/tpt0;->f:La/sje;

    .line 17
    .line 18
    new-instance v2, La/pzj;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    move-object v3, p0

    .line 22
    move v6, p1

    .line 23
    move v7, p2

    .line 24
    move v8, p3

    .line 25
    move-object v5, p4

    .line 26
    invoke-direct/range {v2 .. v8}, La/pzj;-><init>(La/rzj;La/yje;Ljava/util/ArrayList;III)V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    const/4 p1, 0x3

    .line 31
    invoke-static {v1, p0, v2, p1}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    new-instance p3, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {p3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    const/4 p4, 0x0

    .line 41
    :goto_0
    if-ge p4, v0, :cond_1

    .line 42
    .line 43
    iget-object v1, v3, La/rzj;->b:La/tpt0;

    .line 44
    .line 45
    iget-object v1, v1, La/tpt0;->f:La/sje;

    .line 46
    .line 47
    new-instance v2, Le;

    .line 48
    .line 49
    const/4 v4, 0x2

    .line 50
    invoke-direct {v2, p2, p4, p0, v4}, Le;-><init>(Ljava/lang/Object;ILa/yje;B)V

    .line 51
    .line 52
    .line 53
    invoke-static {v1, p0, v2, p1}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    add-int/lit8 p4, p4, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    return-object p3
.end method

.method public final b(Ljava/util/LinkedHashSet;Z)La/jzj;
    .locals 3

    .line 1
    iget-object v0, p0, La/rzj;->c:La/xot0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, La/xot0;->b(Ljava/util/LinkedHashSet;Z)La/jzj;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-object v0, p0, La/rzj;->b:La/tpt0;

    .line 11
    .line 12
    iget-object v0, v0, La/tpt0;->f:La/sje;

    .line 13
    .line 14
    new-instance v1, La/ys8;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v1, p0, v2, p2, p1}, La/ys8;-><init>(La/rzj;La/yje;ZLjava/util/LinkedHashSet;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x3

    .line 21
    invoke-static {v0, v2, v1, p0}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public final close()V
    .locals 3

    .line 1
    iget-object v0, p0, La/rzj;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object v0, p0, La/rzj;->b:La/tpt0;

    .line 12
    .line 13
    iget-object v0, v0, La/tpt0;->f:La/sje;

    .line 14
    .line 15
    new-instance v1, La/wib;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v1, v2, p0}, La/wib;-><init>(La/yje;La/rzj;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x3

    .line 22
    invoke-static {v0, v2, v2, v1, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final d()La/jzj;
    .locals 4

    .line 1
    iget-object v0, p0, La/rzj;->c:La/xot0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, La/xot0;->d()La/jzj;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-object v0, p0, La/rzj;->b:La/tpt0;

    .line 11
    .line 12
    iget-object v0, v0, La/tpt0;->f:La/sje;

    .line 13
    .line 14
    new-instance v1, La/ozj;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v1, p0, v3, v2}, La/ozj;-><init>(La/rzj;La/yje;B)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x3

    .line 22
    invoke-static {v0, v3, v1, p0}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public final e()La/jzj;
    .locals 4

    .line 1
    iget-object v0, p0, La/rzj;->c:La/xot0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, La/xot0;->e()La/jzj;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-object v0, p0, La/rzj;->b:La/tpt0;

    .line 11
    .line 12
    iget-object v0, v0, La/tpt0;->f:La/sje;

    .line 13
    .line 14
    new-instance v1, La/ozj;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v1, p0, v3, v2}, La/ozj;-><init>(La/rzj;La/yje;B)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x3

    .line 22
    invoke-static {v0, v3, v1, p0}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public final f(Ljava/util/List;Ljava/util/List;Ljava/util/List;)La/jzj;
    .locals 8

    .line 1
    iget-object v0, p0, La/rzj;->c:La/xot0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, La/xot0;->f(Ljava/util/List;Ljava/util/List;Ljava/util/List;)La/jzj;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-object v0, p0, La/rzj;->b:La/tpt0;

    .line 11
    .line 12
    iget-object v0, v0, La/tpt0;->f:La/sje;

    .line 13
    .line 14
    new-instance v1, La/ic1;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    const/16 v7, 0x17

    .line 18
    .line 19
    move-object v2, p0

    .line 20
    move-object v4, p1

    .line 21
    move-object v5, p2

    .line 22
    move-object v6, p3

    .line 23
    invoke-direct/range {v1 .. v7}, La/ic1;-><init>(La/rzj;La/yje;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x3

    .line 27
    const/4 p1, 0x0

    .line 28
    invoke-static {v0, p1, v1, p0}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public final g(La/hx9;Ljava/util/Map;)La/jzj;
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/rzj;->c:La/xot0;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2}, La/xot0;->g(La/hx9;Ljava/util/Map;)La/jzj;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_0
    iget-object v0, p0, La/rzj;->b:La/tpt0;

    .line 14
    .line 15
    iget-object v0, v0, La/tpt0;->f:La/sje;

    .line 16
    .line 17
    new-instance v1, La/xsj;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-direct {v1, p0, v2, p1, p2}, La/xsj;-><init>(La/rzj;La/yje;La/hx9;Ljava/util/Map;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x3

    .line 24
    invoke-static {v0, v2, v1, p0}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public final h(Ljava/util/Map;La/oot0;La/crd;)La/jzj;
    .locals 8

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/rzj;->c:La/xot0;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2, p3}, La/xot0;->h(Ljava/util/Map;La/oot0;La/crd;)La/jzj;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    iget-object v0, p0, La/rzj;->b:La/tpt0;

    .line 17
    .line 18
    iget-object v0, v0, La/tpt0;->f:La/sje;

    .line 19
    .line 20
    new-instance v1, La/ic1;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    const/16 v7, 0x16

    .line 24
    .line 25
    move-object v2, p0

    .line 26
    move-object v4, p1

    .line 27
    move-object v5, p2

    .line 28
    move-object v6, p3

    .line 29
    invoke-direct/range {v1 .. v7}, La/ic1;-><init>(La/rzj;La/yje;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x3

    .line 33
    const/4 p1, 0x0

    .line 34
    invoke-static {v0, p1, v1, p0}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method

.method public final i(I)La/jzj;
    .locals 3

    .line 1
    iget-object v0, p0, La/rzj;->c:La/xot0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, La/xot0;->i(I)La/jzj;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-object v0, p0, La/rzj;->b:La/tpt0;

    .line 11
    .line 12
    iget-object v0, v0, La/tpt0;->f:La/sje;

    .line 13
    .line 14
    new-instance v1, La/u52;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v1, p0, v2, p1}, La/u52;-><init>(La/rzj;La/yje;I)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x3

    .line 21
    invoke-static {v0, v2, v1, p0}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public final j(Ljava/util/List;)La/jzj;
    .locals 3

    .line 1
    sget-object v0, La/oot0;->a:La/oot0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/rzj;->c:La/xot0;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p1}, La/xot0;->j(Ljava/util/List;)La/jzj;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_0
    iget-object v0, p0, La/rzj;->b:La/tpt0;

    .line 16
    .line 17
    iget-object v0, v0, La/tpt0;->f:La/sje;

    .line 18
    .line 19
    new-instance v1, La/b1f;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-direct {v1, p0, v2, p1}, La/b1f;-><init>(La/rzj;La/yje;Ljava/util/List;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x3

    .line 26
    invoke-static {v0, v2, v1, p0}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method public final k(La/bnn0;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, La/rzj;->c:La/xot0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, La/xot0;->k(La/bnn0;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-object v0, p0, La/rzj;->b:La/tpt0;

    .line 11
    .line 12
    iget-object v0, v0, La/tpt0;->e:La/ex2;

    .line 13
    .line 14
    invoke-static {v0}, La/obb;->Y(Ljava/util/concurrent/Executor;)La/lne;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, La/ozj;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-direct {v1, p0, v2, v3}, La/ozj;-><init>(La/rzj;La/yje;B)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1, p1}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public final l(Ljava/util/List;Ljava/util/List;Ljava/util/List;La/vt00;La/z40;J)La/jzj;
    .locals 11

    .line 1
    iget-object v0, p0, La/rzj;->c:La/xot0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v1, p1

    .line 6
    move-object v2, p2

    .line 7
    move-object v3, p3

    .line 8
    move-object v4, p4

    .line 9
    move-object/from16 v5, p5

    .line 10
    .line 11
    move-wide/from16 v6, p6

    .line 12
    .line 13
    invoke-virtual/range {v0 .. v7}, La/xot0;->l(Ljava/util/List;Ljava/util/List;Ljava/util/List;La/vt00;La/z40;J)La/jzj;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    iget-object v0, p0, La/rzj;->b:La/tpt0;

    .line 19
    .line 20
    iget-object v10, v0, La/tpt0;->f:La/sje;

    .line 21
    .line 22
    new-instance v0, La/qzj;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    move-object v1, p0

    .line 26
    move-object v3, p1

    .line 27
    move-object v4, p2

    .line 28
    move-object v5, p3

    .line 29
    move-object v6, p4

    .line 30
    move-object/from16 v7, p5

    .line 31
    .line 32
    move-wide/from16 v8, p6

    .line 33
    .line 34
    invoke-direct/range {v0 .. v9}, La/qzj;-><init>(La/rzj;La/yje;Ljava/util/List;Ljava/util/List;Ljava/util/List;La/vt00;La/z40;J)V

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x3

    .line 38
    const/4 p1, 0x0

    .line 39
    invoke-static {v10, p1, v0, p0}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method public final m(Ljava/util/Map;La/crd;)La/jzj;
    .locals 3

    .line 1
    sget-object v0, La/oot0;->a:La/oot0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, La/rzj;->c:La/xot0;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, La/xot0;->m(Ljava/util/Map;La/crd;)La/jzj;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    iget-object v0, p0, La/rzj;->b:La/tpt0;

    .line 19
    .line 20
    iget-object v0, v0, La/tpt0;->f:La/sje;

    .line 21
    .line 22
    new-instance v1, La/xsj;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-direct {v1, p0, v2, p1, p2}, La/xsj;-><init>(La/rzj;La/yje;Ljava/util/Map;La/crd;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x3

    .line 29
    invoke-static {v0, v2, v1, p0}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public final n()La/xot0;
    .locals 2

    .line 1
    iget-object v0, p0, La/rzj;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, La/rzj;->c:La/xot0;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    iget-object v0, p0, La/rzj;->a:La/o5d0;

    .line 15
    .line 16
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, La/xot0;

    .line 21
    .line 22
    iget-object v1, p0, La/rzj;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    iput-object v0, p0, La/rzj;->c:La/xot0;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :cond_1
    invoke-virtual {v0}, La/xot0;->close()V

    .line 37
    .line 38
    .line 39
    new-instance p0, Ljava/util/concurrent/CancellationException;

    .line 40
    .line 41
    const-string v0, "UseCaseCameraRequestControl closed during initialization"

    .line 42
    .line 43
    invoke-direct {p0, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p0

    .line 47
    :cond_2
    new-instance p0, Ljava/util/concurrent/CancellationException;

    .line 48
    .line 49
    const-string v0, "UseCaseCameraRequestControl is closed"

    .line 50
    .line 51
    invoke-direct {p0, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p0
.end method
