.class public final La/vel;
.super La/hel;
.source "SourceFile"


# instance fields
.field public k1:La/wel;

.field public l1:Z

.field public m1:La/xdr;

.field public n1:La/xdr;

.field public o1:Z


# virtual methods
.method public final d1(La/ic1;La/xb2;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v3, p0, La/hel;->q:La/ma80;

    .line 2
    .line 3
    if-nez v3, :cond_0

    .line 4
    .line 5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    iget-object v6, p0, La/vel;->k1:La/wel;

    .line 9
    .line 10
    sget-object v0, La/c050;->a:La/c050;

    .line 11
    .line 12
    new-instance v0, La/ic1;

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    const/16 v5, 0x19

    .line 16
    .line 17
    move-object v2, p0

    .line 18
    move-object v1, p1

    .line 19
    invoke-direct/range {v0 .. v5}, La/ic1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v6, v0, p2}, La/wel;->a(La/ic1;La/xb2;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    sget-object p1, La/wne;->a:La/wne;

    .line 27
    .line 28
    if-ne p0, p1, :cond_1

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0
.end method

.method public final i1(J)V
    .locals 8

    .line 1
    iget-boolean v0, p0, La/lm40;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, La/vel;->m1:La/xdr;

    .line 6
    .line 7
    sget-object v1, La/uel;->a:La/bk9;

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0}, La/lm40;->N0()La/vne;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget-object v1, La/yne;->d:La/yne;

    .line 21
    .line 22
    new-instance v2, La/ir;

    .line 23
    .line 24
    const/16 v7, 0x8

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    move-object v3, p0

    .line 28
    move-wide v4, p1

    .line 29
    invoke-direct/range {v2 .. v7}, La/ir;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x1

    .line 33
    invoke-static {v0, v6, v1, v2, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 34
    .line 35
    .line 36
    :cond_1
    :goto_0
    return-void
.end method

.method public final j1(La/qdl;)V
    .locals 8

    .line 1
    iget-boolean v0, p0, La/lm40;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, La/vel;->n1:La/xdr;

    .line 6
    .line 7
    sget-object v1, La/uel;->b:La/bk9;

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v4, p0, La/hel;->q:La/ma80;

    .line 17
    .line 18
    if-nez v4, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {p0}, La/lm40;->N0()La/vne;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sget-object v7, La/yne;->d:La/yne;

    .line 26
    .line 27
    new-instance v1, La/ic1;

    .line 28
    .line 29
    const/16 v6, 0x1a

    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    move-object v2, p0

    .line 33
    move-object v3, p1

    .line 34
    invoke-direct/range {v1 .. v6}, La/ic1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x1

    .line 38
    invoke-static {v0, v5, v7, v1, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 39
    .line 40
    .line 41
    :cond_2
    :goto_0
    return-void
.end method

.method public final r1()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/vel;->l1:Z

    .line 2
    .line 3
    return p0
.end method
