.class public final La/xk0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Z

.field public c:Z

.field public final d:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final e:La/p7m0;

.field public final f:La/qoj0;

.field public g:Z

.field public h:Z

.field public final i:La/k050;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/xk0;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 10
    .line 11
    sget-object v0, La/iun;->a:La/iun;

    .line 12
    .line 13
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, La/xk0;->e:La/p7m0;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    sget-object v1, La/i99;->b:La/i99;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-static {v2, v0, v1}, La/roj0;->a(IILa/i99;)La/qoj0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, La/xk0;->f:La/qoj0;

    .line 28
    .line 29
    new-instance v0, La/k050;

    .line 30
    .line 31
    invoke-direct {v0}, La/k050;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, La/xk0;->i:La/k050;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final a(La/jm0;La/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, La/vk0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/vk0;

    .line 7
    .line 8
    iget v1, v0, La/vk0;->m:I

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
    iput v1, v0, La/vk0;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/vk0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/vk0;-><init>(La/xk0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/vk0;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/vk0;->m:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    const/4 v5, 0x0

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v4, :cond_2

    .line 37
    .line 38
    if-ne v2, v3, :cond_1

    .line 39
    .line 40
    iget-object p0, v0, La/vk0;->j:La/i050;

    .line 41
    .line 42
    :try_start_0
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_4

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto :goto_5

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v5

    .line 54
    :cond_2
    iget-object p1, v0, La/vk0;->j:La/i050;

    .line 55
    .line 56
    iget-object v2, v0, La/vk0;->i:La/jm0;

    .line 57
    .line 58
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iput-object p1, v0, La/vk0;->i:La/jm0;

    .line 66
    .line 67
    iget-object p2, p0, La/xk0;->i:La/k050;

    .line 68
    .line 69
    iput-object p2, v0, La/vk0;->j:La/i050;

    .line 70
    .line 71
    iput v4, v0, La/vk0;->m:I

    .line 72
    .line 73
    invoke-virtual {p2, v0}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    if-ne v2, v1, :cond_4

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_4
    move-object v2, p1

    .line 81
    move-object p1, p2

    .line 82
    :goto_1
    :try_start_1
    iget-boolean p2, p0, La/xk0;->a:Z

    .line 83
    .line 84
    if-eqz p2, :cond_5

    .line 85
    .line 86
    iget-boolean p2, p0, La/xk0;->b:Z

    .line 87
    .line 88
    if-nez p2, :cond_7

    .line 89
    .line 90
    iget-boolean p2, p0, La/xk0;->c:Z

    .line 91
    .line 92
    if-eqz p2, :cond_7

    .line 93
    .line 94
    iget-object p0, p0, La/xk0;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 95
    .line 96
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    if-eqz p0, :cond_7

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :catchall_1
    move-exception p0

    .line 104
    move-object v6, p1

    .line 105
    move-object p1, p0

    .line 106
    move-object p0, v6

    .line 107
    goto :goto_5

    .line 108
    :cond_5
    :goto_2
    iput-object v5, v0, La/vk0;->i:La/jm0;

    .line 109
    .line 110
    iput-object p1, v0, La/vk0;->j:La/i050;

    .line 111
    .line 112
    iput v3, v0, La/vk0;->m:I

    .line 113
    .line 114
    invoke-interface {v2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 118
    if-ne p0, v1, :cond_6

    .line 119
    .line 120
    :goto_3
    return-object v1

    .line 121
    :cond_6
    move-object p0, p1

    .line 122
    :goto_4
    move-object p1, p0

    .line 123
    :cond_7
    invoke-interface {p1, v5}, La/i050;->c(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    return-object p0

    .line 129
    :goto_5
    invoke-interface {p0, v5}, La/i050;->c(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    throw p1
.end method

.method public final b(La/km0;La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, La/wk0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/wk0;

    .line 7
    .line 8
    iget v1, v0, La/wk0;->m:I

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
    iput v1, v0, La/wk0;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/wk0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/wk0;-><init>(La/xk0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/wk0;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/wk0;->m:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    const/4 v5, 0x0

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v4, :cond_2

    .line 37
    .line 38
    if-ne v2, v3, :cond_1

    .line 39
    .line 40
    iget-object p0, v0, La/wk0;->j:La/i050;

    .line 41
    .line 42
    :try_start_0
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_3

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto :goto_4

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v5

    .line 54
    :cond_2
    iget-object p0, v0, La/wk0;->j:La/i050;

    .line 55
    .line 56
    iget-object p1, v0, La/wk0;->i:La/km0;

    .line 57
    .line 58
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iput-object p1, v0, La/wk0;->i:La/km0;

    .line 66
    .line 67
    iget-object p0, p0, La/xk0;->i:La/k050;

    .line 68
    .line 69
    iput-object p0, v0, La/wk0;->j:La/i050;

    .line 70
    .line 71
    iput v4, v0, La/wk0;->m:I

    .line 72
    .line 73
    invoke-virtual {p0, v0}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    if-ne p2, v1, :cond_4

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_4
    :goto_1
    :try_start_1
    iput-object v5, v0, La/wk0;->i:La/km0;

    .line 81
    .line 82
    iput-object p0, v0, La/wk0;->j:La/i050;

    .line 83
    .line 84
    iput v3, v0, La/wk0;->m:I

    .line 85
    .line 86
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 90
    if-ne p1, v1, :cond_5

    .line 91
    .line 92
    :goto_2
    return-object v1

    .line 93
    :cond_5
    :goto_3
    invoke-interface {p0, v5}, La/i050;->c(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    return-object p0

    .line 99
    :goto_4
    invoke-interface {p0, v5}, La/i050;->c(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    throw p1
.end method

.method public final c()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, La/xk0;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iget-object v2, p0, La/xk0;->e:La/p7m0;

    .line 10
    .line 11
    invoke-virtual {v2, v1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/xk0;->f:La/qoj0;

    .line 15
    .line 16
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method
