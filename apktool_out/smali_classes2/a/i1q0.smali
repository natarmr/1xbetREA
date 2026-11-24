.class public final La/i1q0;
.super La/vs10;
.source "SourceFile"

# interfaces
.implements La/vzj;


# instance fields
.field public final c:La/n0o0;

.field public final d:La/h1q0;


# direct methods
.method public constructor <init>(La/yip0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, La/lne;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, La/i1q0;->c:La/n0o0;

    .line 9
    .line 10
    new-instance p1, La/h1q0;

    .line 11
    .line 12
    invoke-direct {p1}, La/h1q0;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, La/i1q0;->d:La/h1q0;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a(JLa/n5a;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/i1q0;->y()La/lne;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of v0, p0, La/vzj;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p0, La/vzj;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    if-nez p0, :cond_1

    .line 14
    .line 15
    sget-object p0, La/fuj;->a:La/vzj;

    .line 16
    .line 17
    :cond_1
    invoke-interface {p0, p1, p2, p3}, La/vzj;->a(JLa/n5a;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final c(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)La/nwk;
    .locals 1

    .line 1
    invoke-virtual {p0}, La/i1q0;->y()La/lne;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of v0, p0, La/vzj;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p0, La/vzj;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    if-nez p0, :cond_1

    .line 14
    .line 15
    sget-object p0, La/fuj;->a:La/vzj;

    .line 16
    .line 17
    :cond_1
    invoke-interface {p0, p1, p2, p3, p4}, La/vzj;->c(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)La/nwk;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public final q(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/i1q0;->y()La/lne;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1, p2}, La/lne;->q(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final r(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/i1q0;->y()La/lne;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1, p2}, La/lne;->r(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final v(Lkotlin/coroutines/CoroutineContext;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, La/i1q0;->y()La/lne;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, La/lne;->v(Lkotlin/coroutines/CoroutineContext;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final x()La/vs10;
    .locals 2

    .line 1
    invoke-virtual {p0}, La/i1q0;->y()La/lne;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, La/vs10;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, La/vs10;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {v0}, La/vs10;->x()La/vs10;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    return-object v0

    .line 23
    :cond_2
    :goto_1
    return-object p0
.end method

.method public final y()La/lne;
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/Throwable;

    .line 2
    .line 3
    const-string v1, "reader location"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, La;->a:Lsun/misc/Unsafe;

    .line 9
    .line 10
    sget-wide v2, La/h1q0;->d:J

    .line 11
    .line 12
    iget-object v4, p0, La/i1q0;->d:La/h1q0;

    .line 13
    .line 14
    invoke-virtual {v1, v4, v2, v3, v0}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    sget-object v0, La/h1q0;->a:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 18
    .line 19
    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    sget-wide v2, La/h1q0;->e:J

    .line 23
    .line 24
    invoke-virtual {v1, v4, v2, v3}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Ljava/lang/Throwable;

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    const-string v5, "Dispatchers.Main is used concurrently with setting it"

    .line 35
    .line 36
    invoke-direct {v3, v5, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    sget-wide v5, La/h1q0;->c:J

    .line 40
    .line 41
    invoke-virtual {v1, v4, v5, v6, v3}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    sget-wide v2, La/h1q0;->b:J

    .line 45
    .line 46
    invoke-virtual {v1, v4, v2, v3}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    .line 51
    .line 52
    .line 53
    check-cast v1, La/lne;

    .line 54
    .line 55
    if-nez v1, :cond_1

    .line 56
    .line 57
    iget-object p0, p0, La/i1q0;->c:La/n0o0;

    .line 58
    .line 59
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    check-cast p0, La/lne;

    .line 64
    .line 65
    return-object p0

    .line 66
    :cond_1
    return-object v1
.end method
