.class public final La/k1f0;
.super La/vw5;
.source "SourceFile"


# instance fields
.field public final d:La/emt0;

.field public final e:La/jru;

.field public final f:La/pru;

.field public final g:La/xte0;

.field public final h:La/mne;

.field public final i:La/kh3;

.field public final j:La/tc80;

.field public final k:La/p7m0;


# direct methods
.method public constructor <init>(La/o8f;La/emt0;La/jru;La/pru;La/xte0;La/mne;La/duj;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p6, p7}, La/vw5;-><init>(La/o8f;La/mne;La/duj;)V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, La/k1f0;->d:La/emt0;

    .line 8
    .line 9
    iput-object p3, p0, La/k1f0;->e:La/jru;

    .line 10
    .line 11
    iput-object p4, p0, La/k1f0;->f:La/pru;

    .line 12
    .line 13
    iput-object p5, p0, La/k1f0;->g:La/xte0;

    .line 14
    .line 15
    iput-object p6, p0, La/k1f0;->h:La/mne;

    .line 16
    .line 17
    sget-object p1, La/kh3;->k:La/kh3;

    .line 18
    .line 19
    iput-object p1, p0, La/k1f0;->i:La/kh3;

    .line 20
    .line 21
    sget-object p1, La/tc80;->b:La/tc80;

    .line 22
    .line 23
    iput-object p1, p0, La/k1f0;->j:La/tc80;

    .line 24
    .line 25
    sget-object p1, La/i8d;->a:La/i8d;

    .line 26
    .line 27
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, La/k1f0;->k:La/p7m0;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final a(La/sje;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/i8d;->b:La/i8d;

    .line 5
    .line 6
    iget-object v1, p0, La/k1f0;->k:La/p7m0;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {v1, v2, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, La/k1f0;->h:La/mne;

    .line 13
    .line 14
    iget-object v6, v0, La/mne;->c:La/vs10;

    .line 15
    .line 16
    new-instance v4, La/xwe0;

    .line 17
    .line 18
    const/4 v0, 0x7

    .line 19
    invoke-direct {v4, p0, p1, v0}, La/xwe0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    new-instance v7, La/z8b0;

    .line 23
    .line 24
    const/16 v0, 0x8

    .line 25
    .line 26
    invoke-direct {v7, p0, v2, v0}, La/z8b0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 27
    .line 28
    .line 29
    const/16 v8, 0xa

    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    move-object v3, p1

    .line 33
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final b()La/kh3;
    .locals 0

    .line 1
    iget-object p0, p0, La/k1f0;->i:La/kh3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()La/p7m0;
    .locals 0

    .line 1
    iget-object p0, p0, La/k1f0;->k:La/p7m0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d()Ljava/util/List;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final e()La/fnf0;
    .locals 0

    .line 1
    iget-object p0, p0, La/k1f0;->j:La/tc80;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h(La/zje;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p1, La/j1f0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/j1f0;

    .line 7
    .line 8
    iget v1, v0, La/j1f0;->m:I

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
    iput v1, v0, La/j1f0;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/j1f0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/j1f0;-><init>(La/k1f0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/j1f0;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/j1f0;->m:I

    .line 30
    .line 31
    const/16 v3, 0xa

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v4, :cond_1

    .line 37
    .line 38
    iget-object p0, v0, La/j1f0;->j:Ljava/util/List;

    .line 39
    .line 40
    iget-object v0, v0, La/j1f0;->i:La/k1f0;

    .line 41
    .line 42
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    return-object p0

    .line 53
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :try_start_1
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 57
    .line 58
    iget-object p1, p0, La/k1f0;->f:La/pru;

    .line 59
    .line 60
    invoke-virtual {p1}, La/pru;->a()La/sff0;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iget-object v2, p1, La/sff0;->N:La/co4;

    .line 65
    .line 66
    iget-object v2, v2, La/co4;->r:Ljava/util/List;

    .line 67
    .line 68
    iget-object p1, p1, La/sff0;->k:La/f3c0;

    .line 69
    .line 70
    iget-boolean p1, p1, La/f3c0;->h:Z

    .line 71
    .line 72
    iget-object v5, p0, La/k1f0;->e:La/jru;

    .line 73
    .line 74
    sget-object v6, La/q7f0;->j:La/c0o;

    .line 75
    .line 76
    new-instance v7, Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-static {v6, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 83
    .line 84
    .line 85
    new-instance v8, La/y2;

    .line 86
    .line 87
    const/4 v9, 0x0

    .line 88
    invoke-direct {v8, v6, v9}, La/y2;-><init>(Ljava/lang/Object;B)V

    .line 89
    .line 90
    .line 91
    :goto_1
    invoke-virtual {v8}, La/y2;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    if-eqz v6, :cond_3

    .line 96
    .line 97
    invoke-virtual {v8}, La/y2;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    check-cast v6, La/q7f0;

    .line 102
    .line 103
    iget-byte v6, v6, La/q7f0;->a:B

    .line 104
    .line 105
    new-instance v9, Ljava/lang/Integer;

    .line 106
    .line 107
    invoke-direct {v9, v6}, Ljava/lang/Integer;-><init>(I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_3
    iput-object p0, v0, La/j1f0;->i:La/k1f0;

    .line 115
    .line 116
    iput-object v2, v0, La/j1f0;->j:Ljava/util/List;

    .line 117
    .line 118
    iput v4, v0, La/j1f0;->m:I

    .line 119
    .line 120
    invoke-virtual {v5, v0, v7, p1}, La/jru;->d(La/zje;Ljava/util/List;Z)Ljava/io/Serializable;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    if-ne p1, v1, :cond_4

    .line 125
    .line 126
    return-object v1

    .line 127
    :cond_4
    move-object v0, p0

    .line 128
    move-object p0, v2

    .line 129
    :goto_2
    check-cast p1, Ljava/lang/Iterable;

    .line 130
    .line 131
    new-instance v1, Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-static {p1, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 138
    .line 139
    .line 140
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-eqz v2, :cond_5

    .line 149
    .line 150
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    check-cast v2, La/q7f0;

    .line 155
    .line 156
    iget-byte v2, v2, La/q7f0;->a:B

    .line 157
    .line 158
    new-instance v3, Ljava/lang/Integer;

    .line 159
    .line 160
    invoke-direct {v3, v2}, Ljava/lang/Integer;-><init>(I)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_5
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    check-cast p1, Ljava/lang/Iterable;

    .line 172
    .line 173
    invoke-static {v1, p1}, Lkotlin/collections/CollectionsKt;->Z(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    if-eqz p1, :cond_6

    .line 182
    .line 183
    iget-object p1, v0, La/k1f0;->g:La/xte0;

    .line 184
    .line 185
    invoke-virtual {p1, v1, p0}, La/xte0;->c(Ljava/util/ArrayList;Ljava/util/List;)V

    .line 186
    .line 187
    .line 188
    :cond_6
    sget-object p0, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 189
    .line 190
    goto :goto_4

    .line 191
    :catchall_0
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 192
    .line 193
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 194
    .line 195
    return-object p0
.end method
