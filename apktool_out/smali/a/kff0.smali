.class public final La/kff0;
.super Lkotlin/coroutines/a;
.source "SourceFile"

# interfaces
.implements La/nne;


# instance fields
.field public final synthetic b:La/rld;

.field public final synthetic c:La/lff0;


# direct methods
.method public constructor <init>(La/rld;La/lff0;)V
    .locals 1

    .line 1
    sget-object v0, La/lwf;->h:La/lwf;

    .line 2
    .line 3
    iput-object p1, p0, La/kff0;->b:La/rld;

    .line 4
    .line 5
    iput-object p2, p0, La/kff0;->c:La/lff0;

    .line 6
    .line 7
    invoke-direct {p0, v0}, Lkotlin/coroutines/a;-><init>(Lkotlin/coroutines/f;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V
    .locals 3

    .line 1
    new-instance v0, La/yw9;

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    iget-object v2, p0, La/kff0;->b:La/rld;

    .line 6
    .line 7
    iget-object p0, p0, La/kff0;->c:La/lff0;

    .line 8
    .line 9
    invoke-direct {v0, v2, p0, v1}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 10
    .line 11
    .line 12
    invoke-static {p1, v0}, La/sac;->t0(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)Z

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, La/lff0;->b:Lkotlin/coroutines/CoroutineContext;

    .line 16
    .line 17
    sget-object v1, La/lwf;->h:La/lwf;

    .line 18
    .line 19
    invoke-interface {v0, v1}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext$Element;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, La/nne;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-interface {v0, p1, p2}, La/nne;->l(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    iget-object p0, p0, La/lff0;->a:Lkotlin/coroutines/CoroutineContext;

    .line 32
    .line 33
    invoke-interface {p0, v1}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext$Element;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, La/nne;

    .line 38
    .line 39
    if-eqz p0, :cond_1

    .line 40
    .line 41
    invoke-interface {p0, p1, p2}, La/nne;->l(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    throw p1
.end method
