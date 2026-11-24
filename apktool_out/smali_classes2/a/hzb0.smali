.class public final La/hzb0;
.super La/a2;
.source "SourceFile"

# interfaces
.implements La/htb;
.implements La/jbi0;


# instance fields
.field public final e:La/q99;


# direct methods
.method public constructor <init>(Lkotlin/coroutines/CoroutineContext;La/q99;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0}, La/a2;-><init>(Lkotlin/coroutines/CoroutineContext;Z)V

    .line 3
    .line 4
    .line 5
    iput-object p2, p0, La/hzb0;->e:La/q99;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(La/bnn0;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/hzb0;->e:La/q99;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, La/q99;->G(La/q99;La/zje;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    sget-object p1, La/wne;->a:La/wne;

    .line 11
    .line 12
    return-object p0
.end method

.method public final b0(Ljava/lang/Throwable;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, La/hzb0;->e:La/q99;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p1, v1}, La/q99;->e(Ljava/lang/Throwable;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    if-nez p2, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, La/a2;->d:Lkotlin/coroutines/CoroutineContext;

    .line 13
    .line 14
    invoke-static {p1, p0}, La/u1c;->H(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final c(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/hzb0;->e:La/q99;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/q99;->c(Lkotlin/jvm/functions/Function1;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c0(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lkotlin/Unit;

    .line 2
    .line 3
    iget-object p0, p0, La/hzb0;->e:La/q99;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, La/q99;->d(Ljava/lang/Throwable;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final cancel(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/pby;->isCancelled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    if-nez p1, :cond_1

    .line 9
    .line 10
    new-instance p1, La/cby;

    .line 11
    .line 12
    invoke-virtual {p0}, La/a2;->u()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {p1, v0, v1, p0}, La/cby;-><init>(Ljava/lang/String;Ljava/lang/Throwable;La/bby;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    invoke-virtual {p0, p1}, La/hzb0;->s(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final e0(Ljava/lang/Throwable;)Z
    .locals 1

    .line 1
    iget-object p0, p0, La/hzb0;->e:La/q99;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, p1, v0}, La/q99;->e(Ljava/lang/Throwable;Z)Z

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    return p0
.end method

.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/hzb0;->e:La/q99;

    .line 2
    .line 3
    invoke-interface {p0, p1}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final g(La/yje;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/hzb0;->e:La/q99;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/q99;->g(La/yje;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final i()La/i1i0;
    .locals 0

    .line 1
    iget-object p0, p0, La/hzb0;->e:La/q99;

    .line 2
    .line 3
    invoke-virtual {p0}, La/q99;->i()La/i1i0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final iterator()La/j99;
    .locals 1

    .line 1
    iget-object p0, p0, La/hzb0;->e:La/q99;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, La/j99;

    .line 7
    .line 8
    invoke-direct {v0, p0}, La/j99;-><init>(La/q99;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final j()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/hzb0;->e:La/q99;

    .line 2
    .line 3
    invoke-virtual {p0}, La/q99;->j()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final m(La/yje;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/hzb0;->e:La/q99;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, La/jbi0;->m(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final s(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    invoke-static {p0, p1}, La/pby;->Y(La/pby;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, La/hzb0;->e:La/q99;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-virtual {v0, p1, v1}, La/q99;->e(Ljava/lang/Throwable;Z)Z

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/pby;->r(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method
