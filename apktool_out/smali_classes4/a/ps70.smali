.class public final La/ps70;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/nv20;


# direct methods
.method public constructor <init>(La/nv20;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ps70;->a:La/nv20;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p4, La/ns70;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, La/ns70;

    .line 7
    .line 8
    iget v1, v0, La/ns70;->k:I

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
    iput v1, v0, La/ns70;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/ns70;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, La/ns70;-><init>(La/ps70;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, La/ns70;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/ns70;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput v3, v0, La/ns70;->k:I

    .line 51
    .line 52
    iget-object p0, p0, La/ps70;->a:La/nv20;

    .line 53
    .line 54
    invoke-virtual {p0, p1, p2, p3, v0}, La/nv20;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p4

    .line 58
    if-ne p4, v1, :cond_3

    .line 59
    .line 60
    return-object v1

    .line 61
    :cond_3
    :goto_1
    check-cast p4, La/jpx;

    .line 62
    .line 63
    iget-object p0, p4, La/jpx;->b:Ljava/lang/Integer;

    .line 64
    .line 65
    if-eqz p0, :cond_4

    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    if-nez p0, :cond_5

    .line 72
    .line 73
    :cond_4
    iget-object p0, p4, La/jpx;->a:Ljava/lang/Boolean;

    .line 74
    .line 75
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 76
    .line 77
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-eqz p0, :cond_5

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_5
    const/4 v3, 0x0

    .line 85
    :goto_2
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0
.end method

.method public final b(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p6, La/os70;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p6

    .line 6
    check-cast v0, La/os70;

    .line 7
    .line 8
    iget v1, v0, La/os70;->k:I

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
    iput v1, v0, La/os70;->k:I

    .line 18
    .line 19
    :goto_0
    move-object p6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/os70;

    .line 22
    .line 23
    invoke-direct {v0, p0, p6}, La/os70;-><init>(La/ps70;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object v0, p6, La/os70;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v1, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v2, p6, La/os70;->k:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :try_start_1
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 53
    .line 54
    iget-object p0, p0, La/ps70;->a:La/nv20;

    .line 55
    .line 56
    iput v3, p6, La/os70;->k:I

    .line 57
    .line 58
    invoke-virtual/range {p0 .. p6}, La/nv20;->h(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-ne v0, v1, :cond_3

    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_3
    :goto_2
    check-cast v0, La/mte0;

    .line 66
    .line 67
    iget-object p0, v0, La/mte0;->a:Ljava/lang/Integer;

    .line 68
    .line 69
    if-eqz p0, :cond_6

    .line 70
    .line 71
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-nez p0, :cond_4

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_4
    iget-object p0, v0, La/mte0;->c:Ljava/lang/String;

    .line 79
    .line 80
    if-nez p0, :cond_5

    .line 81
    .line 82
    iget-object p0, v0, La/mte0;->b:Ljava/lang/String;

    .line 83
    .line 84
    :cond_5
    new-instance p1, La/ff5;

    .line 85
    .line 86
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw p1

    .line 90
    :cond_6
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    sget-object p1, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :catchall_0
    move-exception v0

    .line 96
    move-object p0, v0

    .line 97
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 98
    .line 99
    new-instance p1, La/g0g0;

    .line 100
    .line 101
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    move-object p0, p1

    .line 105
    :goto_4
    invoke-static {p0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    if-eqz p1, :cond_8

    .line 110
    .line 111
    instance-of p2, p1, Ljava/util/concurrent/CancellationException;

    .line 112
    .line 113
    if-nez p2, :cond_7

    .line 114
    .line 115
    goto :goto_5

    .line 116
    :cond_7
    throw p1

    .line 117
    :cond_8
    :goto_5
    return-object p0
.end method
