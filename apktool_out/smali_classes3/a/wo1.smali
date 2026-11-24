.class public final La/wo1;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:La/dp1;

.field public final synthetic k:Z

.field public final synthetic l:Z

.field public final synthetic m:Z


# direct methods
.method public constructor <init>(La/dp1;ZZZLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/wo1;->j:La/dp1;

    .line 2
    .line 3
    iput-boolean p2, p0, La/wo1;->k:Z

    .line 4
    .line 5
    iput-boolean p3, p0, La/wo1;->l:Z

    .line 6
    .line 7
    iput-boolean p4, p0, La/wo1;->m:Z

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 6

    .line 1
    new-instance v0, La/wo1;

    .line 2
    .line 3
    iget-boolean v3, p0, La/wo1;->l:Z

    .line 4
    .line 5
    iget-boolean v4, p0, La/wo1;->m:Z

    .line 6
    .line 7
    iget-object v1, p0, La/wo1;->j:La/dp1;

    .line 8
    .line 9
    iget-boolean v2, p0, La/wo1;->k:Z

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, La/wo1;-><init>(La/dp1;ZZZLa/yje;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/wo1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/wo1;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/wo1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/wo1;->i:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, La/wo1;->j:La/dp1;

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v4, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 18
    .line 19
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-object v2

    .line 23
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iput-boolean v4, p0, La/wo1;->i:Z

    .line 27
    .line 28
    sget p1, La/dp1;->G:I

    .line 29
    .line 30
    iget-boolean p1, p0, La/wo1;->k:Z

    .line 31
    .line 32
    iget-boolean v1, p0, La/wo1;->l:Z

    .line 33
    .line 34
    iget-boolean v4, p0, La/wo1;->m:Z

    .line 35
    .line 36
    invoke-virtual {v3, p1, v1, v4, p0}, La/dp1;->O(ZZZLa/zje;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    if-ne p0, v0, :cond_2

    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_2
    :goto_0
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, La/bo1;

    .line 48
    .line 49
    iget-object p0, p0, La/bo1;->a:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, La/bo1;

    .line 56
    .line 57
    iget-object p1, p1, La/bo1;->m:Ljava/lang/String;

    .line 58
    .line 59
    sget-object v0, La/wgh0;->b:La/wgh0;

    .line 60
    .line 61
    const-string v0, "null"

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_3

    .line 68
    .line 69
    goto :goto_5

    .line 70
    :cond_3
    iget-object p1, v3, La/dp1;->v:La/s31;

    .line 71
    .line 72
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, La/bo1;

    .line 77
    .line 78
    iget-object v0, v0, La/bo1;->m:Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {}, La/wgh0;->values()[La/wgh0;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    array-length v4, v1

    .line 85
    const/4 v5, 0x0

    .line 86
    move v6, v5

    .line 87
    :goto_1
    if-ge v6, v4, :cond_5

    .line 88
    .line 89
    aget-object v7, v1, v6

    .line 90
    .line 91
    iget-object v8, v7, La/wgh0;->a:Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {v8, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    if-eqz v8, :cond_4

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_5
    move-object v7, v2

    .line 104
    :goto_2
    if-nez v7, :cond_6

    .line 105
    .line 106
    sget-object v7, La/wgh0;->Y:La/wgh0;

    .line 107
    .line 108
    :cond_6
    invoke-virtual {p1, v7, p0, v2}, La/s31;->h(La/wgh0;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 109
    .line 110
    .line 111
    iget-object p1, v3, La/dp1;->w:La/cyu;

    .line 112
    .line 113
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    check-cast v0, La/bo1;

    .line 118
    .line 119
    iget-object v0, v0, La/bo1;->m:Ljava/lang/String;

    .line 120
    .line 121
    invoke-static {}, La/xgh0;->values()[La/xgh0;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    array-length v3, v1

    .line 126
    :goto_3
    if-ge v5, v3, :cond_8

    .line 127
    .line 128
    aget-object v4, v1, v5

    .line 129
    .line 130
    iget-object v6, v4, La/xgh0;->a:Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {v6, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v6

    .line 136
    if-eqz v6, :cond_7

    .line 137
    .line 138
    move-object v2, v4

    .line 139
    goto :goto_4

    .line 140
    :cond_7
    add-int/lit8 v5, v5, 0x1

    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_8
    :goto_4
    if-nez v2, :cond_9

    .line 144
    .line 145
    sget-object v2, La/xgh0;->b:La/xgh0;

    .line 146
    .line 147
    :cond_9
    iget-object v0, v2, La/xgh0;->a:Ljava/lang/String;

    .line 148
    .line 149
    invoke-static {p1, v0, p0}, La/cyu;->E(La/cyu;Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    return-object p0
.end method
