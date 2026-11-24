.class public abstract La/m06;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/o24;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/o24;

    .line 5
    .line 6
    new-instance v1, La/r580;

    .line 7
    .line 8
    const/16 v2, 0x13

    .line 9
    .line 10
    invoke-direct {v1, v2}, La/r580;-><init>(B)V

    .line 11
    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, v0, La/o24;->b:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance v1, La/s9m0;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v1, v0, La/o24;->c:Ljava/lang/Object;

    .line 24
    .line 25
    new-instance v1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v1, v0, La/o24;->d:Ljava/lang/Object;

    .line 31
    .line 32
    iput-object v0, p0, La/m06;->a:La/o24;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public abstract a(La/om80;)Ljava/lang/Object;
.end method

.method public b(Ljava/lang/Throwable;)La/lm80;
    .locals 0

    .line 1
    new-instance p0, La/lm80;

    .line 2
    .line 3
    invoke-direct {p0, p1}, La/lm80;-><init>(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final c()V
    .locals 6

    .line 1
    const-string v0, "Paging"

    .line 2
    .line 3
    iget-object v1, p0, La/m06;->a:La/o24;

    .line 4
    .line 5
    iget-boolean v2, v1, La/o24;->a:Z

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    iget-object v2, v1, La/o24;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, La/s9m0;

    .line 14
    .line 15
    monitor-enter v2

    .line 16
    :try_start_0
    iget-boolean v4, v1, La/o24;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    if-eqz v4, :cond_1

    .line 19
    .line 20
    monitor-exit v2

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    const/4 v3, 0x1

    .line 23
    :try_start_1
    iput-boolean v3, v1, La/o24;->a:Z

    .line 24
    .line 25
    iget-object v4, v1, La/o24;->d:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v4, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    iget-object v5, v1, La/o24;->d:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v5, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    .line 39
    .line 40
    monitor-exit v2

    .line 41
    iget-object v1, v1, La/o24;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, La/r580;

    .line 44
    .line 45
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-eqz v4, :cond_2

    .line 54
    .line 55
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {v1, v4}, La/r580;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    :goto_1
    if-eqz v3, :cond_3

    .line 64
    .line 65
    sget-object v1, Landroid/os/Build;->ID:Ljava/lang/String;

    .line 66
    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    const/4 v1, 0x3

    .line 70
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_3

    .line 75
    .line 76
    new-instance v1, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    const-string v2, "Invalidated PagingSource "

    .line 79
    .line 80
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    const/4 v1, 0x0

    .line 91
    invoke-static {v0, p0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 92
    .line 93
    .line 94
    :cond_3
    return-void

    .line 95
    :catchall_0
    move-exception p0

    .line 96
    monitor-exit v2

    .line 97
    throw p0
.end method

.method public d(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, La/lic0;

    .line 2
    .line 3
    check-cast p2, La/lic0;

    .line 4
    .line 5
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final e(La/km80;La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, La/l06;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/l06;

    .line 7
    .line 8
    iget v1, v0, La/l06;->m:I

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
    iput v1, v0, La/l06;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/l06;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/l06;-><init>(La/m06;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/l06;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/l06;->m:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    iget-object p1, v0, La/l06;->j:La/m06;

    .line 38
    .line 39
    iget-object v0, v0, La/l06;->i:La/km80;

    .line 40
    .line 41
    :try_start_0
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    move-object v5, p2

    .line 45
    move-object p2, p1

    .line 46
    move-object p1, v0

    .line 47
    move-object v0, v5

    .line 48
    goto :goto_1

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    goto :goto_3

    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v3

    .line 57
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :try_start_1
    sget-object p2, La/j0g0;->b:La/e0g0;

    .line 61
    .line 62
    iput-object p1, v0, La/l06;->i:La/km80;

    .line 63
    .line 64
    iput-object p0, v0, La/l06;->j:La/m06;

    .line 65
    .line 66
    iput v4, v0, La/l06;->m:I

    .line 67
    .line 68
    invoke-virtual {p0, p1, v0}, La/m06;->f(La/km80;La/yje;)Ljava/io/Serializable;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    if-ne p2, v1, :cond_3

    .line 73
    .line 74
    return-object v1

    .line 75
    :cond_3
    move-object v0, p2

    .line 76
    move-object p2, p0

    .line 77
    :goto_1
    check-cast v0, Lkotlin/Pair;

    .line 78
    .line 79
    iget-object v1, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 80
    .line 81
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, La/nm80;

    .line 84
    .line 85
    instance-of v2, p1, La/jm80;

    .line 86
    .line 87
    if-nez v2, :cond_5

    .line 88
    .line 89
    invoke-virtual {p1}, La/km80;->a()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p2, p1, v1}, La/m06;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-nez p1, :cond_4

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_4
    new-instance p1, La/ff5;

    .line 101
    .line 102
    invoke-direct {p1, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw p1

    .line 106
    :cond_5
    :goto_2
    sget-object p1, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    .line 108
    goto :goto_4

    .line 109
    :goto_3
    sget-object p2, La/j0g0;->b:La/e0g0;

    .line 110
    .line 111
    new-instance v0, La/g0g0;

    .line 112
    .line 113
    invoke-direct {v0, p1}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 114
    .line 115
    .line 116
    :goto_4
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    if-nez p1, :cond_6

    .line 121
    .line 122
    goto :goto_5

    .line 123
    :cond_6
    invoke-virtual {p0, p1}, La/m06;->b(Ljava/lang/Throwable;)La/lm80;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    :goto_5
    return-object v0
.end method

.method public abstract f(La/km80;La/yje;)Ljava/io/Serializable;
.end method
