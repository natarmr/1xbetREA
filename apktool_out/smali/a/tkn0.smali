.class public final La/tkn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ghs0;
.implements La/w9e0;


# instance fields
.field public final a:La/okn0;


# direct methods
.method public constructor <init>(La/okn0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/tkn0;->a:La/okn0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/ehs0;Lkotlin/jvm/functions/Function2;La/bnn0;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, La/tkn0;->e(La/ehs0;Lkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final b(Ljava/lang/String;Lkotlin/jvm/functions/Function1;La/zje;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/tkn0;->a:La/okn0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/okn0;->a(Ljava/lang/String;)La/bln0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :try_start_0
    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    const/4 p2, 0x0

    .line 12
    invoke-static {p0, p2}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 18
    :catchall_1
    move-exception p2

    .line 19
    invoke-static {p0, p1}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    throw p2
.end method

.method public final c(La/bnn0;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/tkn0;->a:La/okn0;

    .line 2
    .line 3
    iget-object p0, p0, La/okn0;->a:La/w7r;

    .line 4
    .line 5
    invoke-virtual {p0}, La/w7r;->P0()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final d()La/qpg0;
    .locals 0

    .line 1
    iget-object p0, p0, La/tkn0;->a:La/okn0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e(La/ehs0;Lkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, La/skn0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/skn0;

    .line 7
    .line 8
    iget v1, v0, La/skn0;->m:I

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
    iput v1, v0, La/skn0;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/skn0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/skn0;-><init>(La/tkn0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/skn0;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/skn0;->m:I

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
    iget-object p0, v0, La/skn0;->j:La/w7r;

    .line 38
    .line 39
    iget-object p1, v0, La/skn0;->i:La/tkn0;

    .line 40
    .line 41
    :try_start_0
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    goto :goto_2

    .line 45
    :catchall_0
    move-exception p2

    .line 46
    goto :goto_3

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v3

    .line 53
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p3, p0, La/tkn0;->a:La/okn0;

    .line 57
    .line 58
    iget-object p3, p3, La/okn0;->a:La/w7r;

    .line 59
    .line 60
    invoke-virtual {p3}, La/w7r;->P0()Z

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_5

    .line 68
    .line 69
    if-eq p1, v4, :cond_4

    .line 70
    .line 71
    const/4 v2, 0x2

    .line 72
    if-ne p1, v2, :cond_3

    .line 73
    .line 74
    invoke-virtual {p3}, La/w7r;->a()V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 79
    .line 80
    .line 81
    return-object v3

    .line 82
    :cond_4
    invoke-virtual {p3}, La/w7r;->c()V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_5
    invoke-virtual {p3}, La/w7r;->d()V

    .line 87
    .line 88
    .line 89
    :goto_1
    :try_start_1
    new-instance p1, La/lva0;

    .line 90
    .line 91
    invoke-direct {p1, p0, v4}, La/lva0;-><init>(Ljava/lang/Object;B)V

    .line 92
    .line 93
    .line 94
    iput-object p0, v0, La/skn0;->i:La/tkn0;

    .line 95
    .line 96
    iput-object p3, v0, La/skn0;->j:La/w7r;

    .line 97
    .line 98
    iput v4, v0, La/skn0;->m:I

    .line 99
    .line 100
    invoke-interface {p2, p1, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 104
    if-ne p1, v1, :cond_6

    .line 105
    .line 106
    return-object v1

    .line 107
    :cond_6
    move-object v5, p1

    .line 108
    move-object p1, p0

    .line 109
    move-object p0, p3

    .line 110
    move-object p3, v5

    .line 111
    :goto_2
    :try_start_2
    invoke-virtual {p0}, La/w7r;->r()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, La/w7r;->k()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, La/w7r;->P0()Z

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    if-nez p0, :cond_7

    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    :cond_7
    return-object p3

    .line 127
    :catchall_1
    move-exception p2

    .line 128
    move-object p1, p0

    .line 129
    move-object p0, p3

    .line 130
    :goto_3
    invoke-virtual {p0}, La/w7r;->k()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0}, La/w7r;->P0()Z

    .line 134
    .line 135
    .line 136
    move-result p0

    .line 137
    if-nez p0, :cond_8

    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    :cond_8
    throw p2
.end method
