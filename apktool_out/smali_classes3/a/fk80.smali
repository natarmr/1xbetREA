.class public final La/fk80;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/k06;

.field public final b:La/bvc;

.field public final c:La/lne;

.field public d:La/bby;

.field public final e:La/c4m0;

.field public final f:La/p7m0;

.field public final g:La/p7m0;


# direct methods
.method public constructor <init>(La/k06;La/bvc;La/lne;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/fk80;->a:La/k06;

    .line 11
    .line 12
    iput-object p2, p0, La/fk80;->b:La/bvc;

    .line 13
    .line 14
    iput-object p3, p0, La/fk80;->c:La/lne;

    .line 15
    .line 16
    sget-object p3, La/jtv;->s:La/uj80;

    .line 17
    .line 18
    invoke-static {p3}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    iput-object p3, p0, La/fk80;->f:La/p7m0;

    .line 23
    .line 24
    invoke-virtual {p3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, La/wj80;

    .line 29
    .line 30
    sget-object v1, La/iun;->a:La/iun;

    .line 31
    .line 32
    invoke-static {v0, v1}, La/fk80;->e(La/wj80;Ljava/util/List;)La/cm80;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, La/fk80;->g:La/p7m0;

    .line 41
    .line 42
    iget-object v0, p0, La/fk80;->e:La/c4m0;

    .line 43
    .line 44
    const/4 v1, 0x1

    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    invoke-virtual {v0}, La/pby;->isActive()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-ne v0, v1, :cond_0

    .line 52
    .line 53
    return-void

    .line 54
    :cond_0
    iget-object p1, p1, La/k06;->a:La/ouu;

    .line 55
    .line 56
    iget-object p1, p1, La/ouu;->d:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p1, La/p7m0;

    .line 59
    .line 60
    new-instance v0, La/wx4;

    .line 61
    .line 62
    const/16 v2, 0x1b

    .line 63
    .line 64
    const/4 v3, 0x0

    .line 65
    invoke-direct {v0, p0, v3, v2}, La/wx4;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 66
    .line 67
    .line 68
    new-instance v2, La/p6d;

    .line 69
    .line 70
    invoke-direct {v2, p3, p1, v0, v1}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 71
    .line 72
    .line 73
    new-instance p1, La/s980;

    .line 74
    .line 75
    const/4 p3, 0x2

    .line 76
    invoke-direct {p1, p0, v3, p3}, La/s980;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 77
    .line 78
    .line 79
    new-instance p3, La/fnq;

    .line 80
    .line 81
    const/4 v0, 0x4

    .line 82
    invoke-direct {p3, v2, p1, v0}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 83
    .line 84
    .line 85
    new-instance v3, La/hi70;

    .line 86
    .line 87
    const/4 v9, 0x4

    .line 88
    const/16 v10, 0xd

    .line 89
    .line 90
    const/4 v4, 0x2

    .line 91
    const-class v6, La/fk80;

    .line 92
    .line 93
    const-string v7, "setErrorState"

    .line 94
    .line 95
    const-string v8, "setErrorState(Ljava/lang/Throwable;)V"

    .line 96
    .line 97
    move-object v5, p0

    .line 98
    invoke-direct/range {v3 .. v10}, La/hi70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 99
    .line 100
    .line 101
    invoke-static {p3, p2, v3}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    iput-object p0, v5, La/fk80;->e:La/c4m0;

    .line 106
    .line 107
    invoke-virtual {v5, v1}, La/fk80;->a(Z)V

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method public static e(La/wj80;Ljava/util/List;)La/cm80;
    .locals 1

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    instance-of v0, p0, La/tj80;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, La/tl80;

    .line 8
    .line 9
    check-cast p0, La/tj80;

    .line 10
    .line 11
    iget-object p0, p0, La/tj80;->a:Ljava/lang/Throwable;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1}, La/tl80;-><init>(Ljava/lang/Throwable;Ljava/util/List;)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    instance-of v0, p0, La/uj80;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    new-instance v0, La/wl80;

    .line 22
    .line 23
    check-cast p0, La/uj80;

    .line 24
    .line 25
    iget-boolean p0, p0, La/uj80;->a:Z

    .line 26
    .line 27
    invoke-direct {v0, p1, p0}, La/wl80;-><init>(Ljava/util/List;Z)V

    .line 28
    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_1
    instance-of v0, p0, La/vj80;

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    new-instance v0, La/zl80;

    .line 36
    .line 37
    check-cast p0, La/vj80;

    .line 38
    .line 39
    iget-boolean p0, p0, La/vj80;->a:Z

    .line 40
    .line 41
    invoke-direct {v0, p1, p0}, La/zl80;-><init>(Ljava/util/List;Z)V

    .line 42
    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    return-object p0
.end method


# virtual methods
.method public final a(Z)V
    .locals 11

    .line 1
    iget-object v0, p0, La/fk80;->f:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, La/uj80;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    check-cast v0, La/uj80;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v2

    .line 16
    :goto_0
    if-eqz v0, :cond_2

    .line 17
    .line 18
    iget-boolean v0, v0, La/uj80;->a:Z

    .line 19
    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    iget-object v0, p0, La/fk80;->d:La/bby;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v1, 0x1

    .line 31
    if-ne v0, v1, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    new-instance v3, La/xj80;

    .line 35
    .line 36
    const/4 v9, 0x0

    .line 37
    const/4 v10, 0x1

    .line 38
    const/4 v4, 0x1

    .line 39
    const-class v6, La/fk80;

    .line 40
    .line 41
    const-string v7, "setErrorState"

    .line 42
    .line 43
    const-string v8, "setErrorState(Ljava/lang/Throwable;)V"

    .line 44
    .line 45
    move-object v5, p0

    .line 46
    invoke-direct/range {v3 .. v10}, La/xj80;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 47
    .line 48
    .line 49
    new-instance v7, La/a220;

    .line 50
    .line 51
    const/4 v0, 0x6

    .line 52
    invoke-direct {v7, p0, p1, v2, v0}, La/a220;-><init>(Ljava/lang/Object;ZLa/yje;B)V

    .line 53
    .line 54
    .line 55
    const/16 v8, 0xa

    .line 56
    .line 57
    move-object v4, v3

    .line 58
    iget-object v3, p0, La/fk80;->b:La/bvc;

    .line 59
    .line 60
    const/4 v5, 0x0

    .line 61
    iget-object v6, p0, La/fk80;->c:La/lne;

    .line 62
    .line 63
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iput-object p1, p0, La/fk80;->d:La/bby;

    .line 68
    .line 69
    :cond_2
    :goto_1
    return-void
.end method

.method public final b(ZLa/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, La/dk80;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/dk80;

    .line 7
    .line 8
    iget v1, v0, La/dk80;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/dk80;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/dk80;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/dk80;-><init>(La/fk80;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/dk80;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/dk80;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    iget-object v4, p0, La/fk80;->f:La/p7m0;

    .line 33
    .line 34
    const/4 v5, 0x1

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v5, :cond_1

    .line 38
    .line 39
    :try_start_0
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_2

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v3

    .line 51
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :try_start_1
    new-instance p2, La/vj80;

    .line 55
    .line 56
    invoke-direct {p2, p1}, La/vj80;-><init>(Z)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4, v3, p2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    iget-object p2, p0, La/fk80;->a:La/k06;

    .line 66
    .line 67
    iput v5, v0, La/dk80;->k:I

    .line 68
    .line 69
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-static {p2, p1, v0}, La/k06;->a(La/k06;ZLa/zje;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    if-ne p2, v1, :cond_3

    .line 77
    .line 78
    return-object v1

    .line 79
    :cond_3
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    .line 80
    .line 81
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    new-instance p2, La/uj80;

    .line 86
    .line 87
    invoke-direct {p2, p1}, La/uj80;-><init>(Z)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4, v3, p2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 94
    .line 95
    .line 96
    goto :goto_3

    .line 97
    :goto_2
    invoke-virtual {p0, p1}, La/fk80;->c(Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    return-object p0
.end method

.method public final c(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, La/tj80;

    .line 6
    .line 7
    invoke-direct {v0, p1}, La/tj80;-><init>(Ljava/lang/Throwable;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/fk80;->f:La/p7m0;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    invoke-virtual {p0, p1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final d()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, La/fk80;->e:La/c4m0;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {v1, v0}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget-object p0, p0, La/fk80;->d:La/bby;

    .line 10
    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-interface {p0, v0}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method
