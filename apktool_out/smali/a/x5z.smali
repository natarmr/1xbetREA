.class public final La/x5z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jff0;
.implements La/nne;


# instance fields
.field public final a:Lkotlin/coroutines/CoroutineContext;

.field public final b:Lkotlin/jvm/functions/Function2;

.field public final c:La/sje;

.field public d:La/bby;


# direct methods
.method public constructor <init>(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/x5z;->a:Lkotlin/coroutines/CoroutineContext;

    .line 5
    .line 6
    iput-object p2, p0, La/x5z;->b:Lkotlin/jvm/functions/Function2;

    .line 7
    .line 8
    invoke-interface {p1, p0}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, La/x5z;->c:La/sje;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 4

    .line 1
    iget-object v0, p0, La/x5z;->d:La/bby;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v1, "Old job was still running!"

    .line 6
    .line 7
    invoke-static {v0, v1}, La/zvw;->G(La/bby;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, La/x5z;->b:Lkotlin/jvm/functions/Function2;

    .line 11
    .line 12
    const/4 v1, 0x3

    .line 13
    iget-object v2, p0, La/x5z;->c:La/sje;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-static {v2, v3, v3, v0, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, La/x5z;->d:La/bby;

    .line 21
    .line 22
    return-void
.end method

.method public final f()V
    .locals 3

    .line 1
    iget-object v0, p0, La/x5z;->d:La/bby;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, La/pvq;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v1, v2}, La/pvq;-><init>(B)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, La/x5z;->d:La/bby;

    .line 16
    .line 17
    return-void
.end method

.method public final fold(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p2, p1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final g()V
    .locals 3

    .line 1
    iget-object v0, p0, La/x5z;->d:La/bby;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, La/pvq;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v1, v2}, La/pvq;-><init>(B)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, La/x5z;->d:La/bby;

    .line 16
    .line 17
    return-void
.end method

.method public final get(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext$Element;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lkotlin/coroutines/e;->a(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext$Element;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getKey()Lkotlin/coroutines/f;
    .locals 0

    .line 1
    sget-object p0, La/lwf;->h:La/lwf;

    .line 2
    .line 3
    return-object p0
.end method

.method public final l(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V
    .locals 3

    .line 1
    sget-object v0, La/rld;->b:La/gl5;

    .line 2
    .line 3
    invoke-interface {p2, v0}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext$Element;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/rld;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v1, La/yw9;

    .line 12
    .line 13
    const/16 v2, 0x12

    .line 14
    .line 15
    invoke-direct {v1, v0, p0, v2}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v1}, La/sac;->t0(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)Z

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object p0, p0, La/x5z;->a:Lkotlin/coroutines/CoroutineContext;

    .line 22
    .line 23
    sget-object v0, La/lwf;->h:La/lwf;

    .line 24
    .line 25
    invoke-interface {p0, v0}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext$Element;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, La/nne;

    .line 30
    .line 31
    if-eqz p0, :cond_1

    .line 32
    .line 33
    invoke-interface {p0, p1, p2}, La/nne;->l(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    throw p1
.end method

.method public final minusKey(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lkotlin/coroutines/e;->b(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
