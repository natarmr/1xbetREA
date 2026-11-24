.class public final La/rl;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/tw2;

.field public final b:Ljava/util/Set;

.field public c:La/jnu0;

.field public final d:La/hng;


# direct methods
.method public constructor <init>(La/tw2;Ljava/util/Set;La/vne;La/v6d0;)V
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
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/rl;->a:La/tw2;

    .line 14
    .line 15
    iput-object p2, p0, La/rl;->b:Ljava/util/Set;

    .line 16
    .line 17
    new-instance p1, La/hng;

    .line 18
    .line 19
    new-instance p2, La/mc;

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    invoke-direct {p2, p4, p0, v0}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p3, p1, La/hng;->c:Ljava/lang/Object;

    .line 32
    .line 33
    iput-object p2, p1, La/hng;->d:Ljava/lang/Object;

    .line 34
    .line 35
    new-instance p2, Ljava/lang/Object;

    .line 36
    .line 37
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object p2, p1, La/hng;->e:Ljava/lang/Object;

    .line 41
    .line 42
    monitor-enter p2

    .line 43
    :try_start_0
    new-instance p4, La/k6s0;

    .line 44
    .line 45
    const/16 v0, 0x15

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-direct {p4, p1, v1, v0}, La/k6s0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 49
    .line 50
    .line 51
    const/4 v0, 0x3

    .line 52
    invoke-static {p3, v1, v1, p4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 53
    .line 54
    .line 55
    move-result-object p4

    .line 56
    iput-object p4, p1, La/hng;->f:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    monitor-exit p2

    .line 59
    iput-object p1, p0, La/rl;->d:La/hng;

    .line 60
    .line 61
    new-instance p1, La/pa;

    .line 62
    .line 63
    invoke-direct {p1, p0, v1, v0}, La/pa;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 64
    .line 65
    .line 66
    invoke-static {p3, v1, v1, p1, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :catchall_0
    move-exception p0

    .line 71
    monitor-exit p2

    .line 72
    throw p0
.end method


# virtual methods
.method public final a()La/m050;
    .locals 4

    .line 1
    iget-object p0, p0, La/rl;->d:La/hng;

    .line 2
    .line 3
    iget-object v0, p0, La/hng;->e:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-boolean v1, p0, La/hng;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    monitor-exit v0

    .line 12
    return-object v2

    .line 13
    :cond_0
    :try_start_1
    iget v1, p0, La/hng;->a:I

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    add-int/2addr v1, v3

    .line 17
    iput v1, p0, La/hng;->a:I

    .line 18
    .line 19
    if-ne v1, v3, :cond_2

    .line 20
    .line 21
    iget-object v1, p0, La/hng;->f:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, La/c4m0;

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-virtual {v1, v2}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    :goto_0
    iput-object v2, p0, La/hng;->f:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    .line 35
    :cond_2
    monitor-exit v0

    .line 36
    new-instance v0, La/m050;

    .line 37
    .line 38
    invoke-direct {v0, p0}, La/m050;-><init>(La/hng;)V

    .line 39
    .line 40
    .line 41
    return-object v0

    .line 42
    :goto_1
    monitor-exit v0

    .line 43
    throw p0
.end method

.method public final b(La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object p0, p0, La/rl;->a:La/tw2;

    .line 2
    .line 3
    iget-object p0, p0, La/tw2;->u:La/p7m0;

    .line 4
    .line 5
    new-instance v0, La/pd;

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    const/16 v2, 0xc

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-direct {v0, v1, v3, v2}, La/pd;-><init>(ILa/yje;B)V

    .line 12
    .line 13
    .line 14
    invoke-static {p0, v0, p1}, La/ntb;->L(La/gmq;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    sget-object p1, La/wne;->a:La/wne;

    .line 19
    .line 20
    if-ne p0, p1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    :goto_0
    if-ne p0, p1, :cond_1

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0
.end method

.method public final c()V
    .locals 1

    .line 1
    iget-object v0, p0, La/rl;->d:La/hng;

    .line 2
    .line 3
    invoke-virtual {v0}, La/hng;->d()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/rl;->a:La/tw2;

    .line 7
    .line 8
    invoke-virtual {p0}, La/tw2;->a()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final d(La/jnu0;La/m050;)Lkotlin/Unit;
    .locals 5

    .line 1
    iget-object v0, p0, La/rl;->c:La/jnu0;

    .line 2
    .line 3
    iput-object p1, p0, La/rl;->c:La/jnu0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, v1}, La/jnu0;->a(La/az9;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object p0, p0, La/rl;->a:La/tw2;

    .line 12
    .line 13
    iget-object p0, p0, La/tw2;->u:La/p7m0;

    .line 14
    .line 15
    iget-object v0, p1, La/jnu0;->e:Ljava/lang/Object;

    .line 16
    .line 17
    monitor-enter v0

    .line 18
    :try_start_0
    iget-boolean v2, p1, La/jnu0;->f:Z

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {p2}, La/m050;->b()Z

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    monitor-exit v0

    .line 28
    :goto_0
    move-object p1, p0

    .line 29
    goto :goto_1

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    goto :goto_2

    .line 32
    :cond_1
    :try_start_1
    iget-object v2, p1, La/jnu0;->c:La/vne;

    .line 33
    .line 34
    new-instance v3, La/n7t0;

    .line 35
    .line 36
    const/4 v4, 0x7

    .line 37
    invoke-direct {v3, p0, p1, v1, v4}, La/n7t0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x3

    .line 41
    invoke-static {v2, v1, v1, v3, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    iput-object p0, p1, La/jnu0;->k:La/c4m0;

    .line 46
    .line 47
    iput-object p2, p1, La/jnu0;->l:La/m050;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    .line 49
    monitor-exit v0

    .line 50
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :goto_1
    sget-object p2, La/wne;->a:La/wne;

    .line 54
    .line 55
    if-ne p0, p2, :cond_2

    .line 56
    .line 57
    return-object p0

    .line 58
    :cond_2
    return-object p1

    .line 59
    :goto_2
    monitor-exit v0

    .line 60
    throw p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ActiveCamera(cameraId="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/rl;->a:La/tw2;

    .line 9
    .line 10
    iget-object v1, v1, La/tw2;->a:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v1}, La/g0a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, ")@"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    const/16 v1, 0x10

    .line 29
    .line 30
    invoke-static {v1}, Lkotlin/text/CharsKt;->checkRadix(I)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-static {p0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method
