.class public abstract La/zje;
.super La/zw5;
.source "SourceFile"


# instance fields
.field private final _context:Lkotlin/coroutines/CoroutineContext;

.field private transient intercepted:La/yje;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/yje<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(La/yje;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p1}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    invoke-direct {p0, p1, v0}, La/zje;-><init>(La/yje;Lkotlin/coroutines/CoroutineContext;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(La/yje;Lkotlin/coroutines/CoroutineContext;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1}, La/zw5;-><init>(La/yje;)V

    .line 14
    iput-object p2, p0, La/zje;->_context:Lkotlin/coroutines/CoroutineContext;

    return-void
.end method


# virtual methods
.method public getContext()Lkotlin/coroutines/CoroutineContext;
    .locals 0

    .line 1
    iget-object p0, p0, La/zje;->_context:Lkotlin/coroutines/CoroutineContext;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final intercepted()La/yje;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La/yje<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, La/zje;->intercepted:La/yje;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, La/zje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lkotlin/coroutines/d;->d1:La/ake;

    .line 10
    .line 11
    invoke-interface {v0, v1}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext$Element;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lkotlin/coroutines/d;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    check-cast v0, La/lne;

    .line 20
    .line 21
    new-instance v1, La/nvk;

    .line 22
    .line 23
    invoke-direct {v1, v0, p0}, La/nvk;-><init>(La/lne;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v1, p0

    .line 28
    :goto_0
    iput-object v1, p0, La/zje;->intercepted:La/yje;

    .line 29
    .line 30
    return-object v1

    .line 31
    :cond_1
    return-object v0
.end method

.method public releaseIntercepted()V
    .locals 6

    .line 1
    iget-object v0, p0, La/zje;->intercepted:La/yje;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    if-eq v0, p0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, La/zje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget-object v2, Lkotlin/coroutines/d;->d1:La/ake;

    .line 12
    .line 13
    invoke-interface {v1, v2}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext$Element;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    check-cast v1, Lkotlin/coroutines/d;

    .line 21
    .line 22
    check-cast v1, La/lne;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    check-cast v0, La/nvk;

    .line 28
    .line 29
    :cond_0
    sget-object v1, La;->a:Lsun/misc/Unsafe;

    .line 30
    .line 31
    sget-wide v2, La/nvk;->h:J

    .line 32
    .line 33
    invoke-virtual {v1, v0, v2, v3}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    sget-object v5, La/ovk;->b:La/pfw;

    .line 38
    .line 39
    if-eq v4, v5, :cond_0

    .line 40
    .line 41
    invoke-virtual {v1, v0, v2, v3}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    instance-of v1, v0, La/n5a;

    .line 46
    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    check-cast v0, La/n5a;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    const/4 v0, 0x0

    .line 53
    :goto_0
    if-eqz v0, :cond_2

    .line 54
    .line 55
    invoke-virtual {v0}, La/n5a;->m()V

    .line 56
    .line 57
    .line 58
    :cond_2
    sget-object v0, La/tdd;->a:La/tdd;

    .line 59
    .line 60
    iput-object v0, p0, La/zje;->intercepted:La/yje;

    .line 61
    .line 62
    return-void
.end method
