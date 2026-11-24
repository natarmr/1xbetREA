.class public final La/pp70;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public i:B

.field public synthetic j:Z

.field public synthetic k:Z

.field public synthetic l:Z

.field public final synthetic m:La/sp70;


# direct methods
.method public constructor <init>(La/sp70;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/pp70;->m:La/sp70;

    .line 2
    .line 3
    const/4 p1, 0x4

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, La/pp70;->m:La/sp70;

    .line 2
    .line 3
    iget-object v1, v0, La/sp70;->d:La/gmt;

    .line 4
    .line 5
    iget-boolean v2, p0, La/pp70;->j:Z

    .line 6
    .line 7
    iget-boolean v3, p0, La/pp70;->k:Z

    .line 8
    .line 9
    iget-boolean v4, p0, La/pp70;->l:Z

    .line 10
    .line 11
    sget-object v5, La/wne;->a:La/wne;

    .line 12
    .line 13
    iget-byte v6, p0, La/pp70;->i:B

    .line 14
    .line 15
    const/4 v7, 0x2

    .line 16
    const/4 v8, 0x1

    .line 17
    if-eqz v6, :cond_2

    .line 18
    .line 19
    if-eq v6, v8, :cond_1

    .line 20
    .line 21
    if-ne v6, v7, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    return-object p0

    .line 31
    :cond_1
    :goto_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    if-eqz v2, :cond_5

    .line 39
    .line 40
    if-eqz v4, :cond_5

    .line 41
    .line 42
    invoke-virtual {v1}, La/gmt;->a()La/ql5;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-eqz p1, :cond_5

    .line 47
    .line 48
    iget-object v6, p1, La/ql5;->i:La/txs0;

    .line 49
    .line 50
    iget-object v9, v0, La/sp70;->f:La/g9c;

    .line 51
    .line 52
    iget-object v0, v0, La/sp70;->e:La/fq;

    .line 53
    .line 54
    invoke-virtual {v9, p1}, La/g9c;->a(La/ql5;)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    invoke-virtual {v6}, La/txs0;->f()Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-nez p1, :cond_3

    .line 65
    .line 66
    iput-boolean v2, p0, La/pp70;->j:Z

    .line 67
    .line 68
    iput-boolean v3, p0, La/pp70;->k:Z

    .line 69
    .line 70
    iput-boolean v4, p0, La/pp70;->l:Z

    .line 71
    .line 72
    iput-byte v8, p0, La/pp70;->i:B

    .line 73
    .line 74
    sget-object p1, La/tle;->a:La/tle;

    .line 75
    .line 76
    invoke-virtual {v0, p1, p0}, La/fq;->f(La/zy5;La/yje;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    if-ne p0, v5, :cond_5

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_3
    if-eqz v3, :cond_5

    .line 84
    .line 85
    invoke-virtual {v6}, La/txs0;->d()Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-nez p1, :cond_5

    .line 90
    .line 91
    new-instance p1, La/ule;

    .line 92
    .line 93
    invoke-virtual {v1}, La/gmt;->a()La/ql5;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    if-eqz v1, :cond_4

    .line 98
    .line 99
    iget-object v1, v1, La/ql5;->i:La/txs0;

    .line 100
    .line 101
    invoke-virtual {v1}, La/txs0;->b()Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    goto :goto_1

    .line 106
    :cond_4
    const/4 v1, 0x0

    .line 107
    :goto_1
    invoke-direct {p1, v1}, La/ule;-><init>(Z)V

    .line 108
    .line 109
    .line 110
    iput-boolean v2, p0, La/pp70;->j:Z

    .line 111
    .line 112
    iput-boolean v3, p0, La/pp70;->k:Z

    .line 113
    .line 114
    iput-boolean v4, p0, La/pp70;->l:Z

    .line 115
    .line 116
    iput-byte v7, p0, La/pp70;->i:B

    .line 117
    .line 118
    invoke-virtual {v0, p1, p0}, La/fq;->f(La/zy5;La/yje;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    if-ne p0, v5, :cond_5

    .line 123
    .line 124
    :goto_2
    return-object v5

    .line 125
    :cond_5
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    return-object p0
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    check-cast p2, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    check-cast p3, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    check-cast p4, La/yje;

    .line 20
    .line 21
    new-instance v0, La/pp70;

    .line 22
    .line 23
    iget-object p0, p0, La/pp70;->m:La/sp70;

    .line 24
    .line 25
    invoke-direct {v0, p0, p4}, La/pp70;-><init>(La/sp70;La/yje;)V

    .line 26
    .line 27
    .line 28
    iput-boolean p1, v0, La/pp70;->j:Z

    .line 29
    .line 30
    iput-boolean p2, v0, La/pp70;->k:Z

    .line 31
    .line 32
    iput-boolean p3, v0, La/pp70;->l:Z

    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    invoke-virtual {v0, p0}, La/pp70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method
