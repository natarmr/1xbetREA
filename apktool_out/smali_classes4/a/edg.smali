.class public final La/edg;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:La/gdg;


# direct methods
.method public constructor <init>(La/gdg;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/edg;->j:La/gdg;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 0

    .line 1
    new-instance p1, La/edg;

    .line 2
    .line 3
    iget-object p0, p0, La/edg;->j:La/gdg;

    .line 4
    .line 5
    invoke-direct {p1, p0, p2}, La/edg;-><init>(La/gdg;La/yje;)V

    .line 6
    .line 7
    .line 8
    return-object p1
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
    invoke-virtual {p0, p1, p2}, La/edg;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/edg;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/edg;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/edg;->i:Z

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, La/edg;->j:La/gdg;

    .line 7
    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0

    .line 23
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, v3, La/gdg;->i:La/qc3;

    .line 27
    .line 28
    iget-object v1, v3, La/gdg;->d:Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;

    .line 29
    .line 30
    iget-object v4, v3, La/gdg;->u:La/p7m0;

    .line 31
    .line 32
    iget-object p1, p1, La/qc3;->f:La/p7m0;

    .line 33
    .line 34
    :cond_2
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    move-object v6, v5

    .line 39
    check-cast v6, La/mc3;

    .line 40
    .line 41
    iget-boolean v6, v6, La/mc3;->a:Z

    .line 42
    .line 43
    new-instance v7, La/mc3;

    .line 44
    .line 45
    const/4 v8, 0x0

    .line 46
    invoke-direct {v7, v6, v8}, La/mc3;-><init>(ZZ)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v5, v7}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-eqz v5, :cond_2

    .line 54
    .line 55
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, La/cfb;

    .line 60
    .line 61
    iget-object p1, p1, La/cfb;->a:Ljava/util/List;

    .line 62
    .line 63
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_4

    .line 68
    .line 69
    :cond_3
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    move-object v5, p1

    .line 74
    check-cast v5, La/cfb;

    .line 75
    .line 76
    invoke-virtual {v3}, La/gdg;->x()Ljava/util/ArrayList;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    const/4 v7, 0x6

    .line 81
    invoke-static {v5, v6, v8, v7}, La/cfb;->a(La/cfb;Ljava/util/ArrayList;II)La/cfb;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-virtual {v4, p1, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-eqz p1, :cond_3

    .line 90
    .line 91
    :cond_4
    iget p1, v1, Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;->d:I

    .line 92
    .line 93
    invoke-static {p1}, Lorg/xplatform/cyber/section/api/domain/entity/d;->d(I)Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    iget-wide v4, v1, Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;->c:J

    .line 98
    .line 99
    invoke-static {v4, v5, p1}, Lorg/xplatform/cyber/section/api/domain/entity/d;->c(JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)Lkotlin/Pair;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    iget-object v4, v3, La/gdg;->f:La/j3c;

    .line 104
    .line 105
    iget-object v1, p1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v1, Ljava/lang/Number;

    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 110
    .line 111
    .line 112
    move-result-wide v5

    .line 113
    iget-object p1, p1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast p1, Ljava/lang/Number;

    .line 116
    .line 117
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 118
    .line 119
    .line 120
    move-result-wide v7

    .line 121
    iput-boolean v2, p0, La/edg;->i:Z

    .line 122
    .line 123
    move-object v9, p0

    .line 124
    invoke-virtual/range {v4 .. v9}, La/j3c;->a(JJLa/yje;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    if-ne p1, v0, :cond_5

    .line 129
    .line 130
    return-object v0

    .line 131
    :cond_5
    :goto_0
    check-cast p1, La/ypl0;

    .line 132
    .line 133
    iget-boolean p0, v3, La/gdg;->r:Z

    .line 134
    .line 135
    if-eqz p0, :cond_6

    .line 136
    .line 137
    iget-object p0, p1, La/ypl0;->c:La/lel0;

    .line 138
    .line 139
    iget-object p0, p0, La/lel0;->h:Ljava/lang/String;

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_6
    iget-object p0, p1, La/ypl0;->c:La/lel0;

    .line 143
    .line 144
    iget-object p0, p0, La/lel0;->g:Ljava/lang/String;

    .line 145
    .line 146
    :goto_1
    iget-object p1, v3, La/gdg;->i:La/qc3;

    .line 147
    .line 148
    iget-object v0, v3, La/gdg;->d:Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;

    .line 149
    .line 150
    iget v0, v0, Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;->d:I

    .line 151
    .line 152
    sget-object v1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 153
    .line 154
    iget-byte v1, v1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 155
    .line 156
    iget-object v2, v3, La/gdg;->s:Ljava/lang/String;

    .line 157
    .line 158
    if-ne v0, v1, :cond_7

    .line 159
    .line 160
    const-string v0, ". "

    .line 161
    .line 162
    invoke-static {v2, v0, v2}, Lkotlin/text/StringsKt;->m0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    :cond_7
    move-object v5, v2

    .line 167
    new-instance v6, La/jc3;

    .line 168
    .line 169
    invoke-direct {v6, p0}, La/jc3;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    iget-boolean p0, v3, La/gdg;->r:Z

    .line 173
    .line 174
    if-eqz p0, :cond_8

    .line 175
    .line 176
    const p0, 0x7f08045e

    .line 177
    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_8
    const p0, 0x7f080459

    .line 181
    .line 182
    .line 183
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    iget-object v7, p1, La/qc3;->g:La/p7m0;

    .line 190
    .line 191
    :cond_9
    invoke-virtual {v7}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    move-object v0, p1

    .line 196
    check-cast v0, La/kc3;

    .line 197
    .line 198
    new-instance v0, La/kc3;

    .line 199
    .line 200
    invoke-direct {v0, v5, p0, v6}, La/kc3;-><init>(Ljava/lang/String;ILa/jc3;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v7, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    if-eqz p1, :cond_9

    .line 208
    .line 209
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 210
    .line 211
    return-object p0
.end method
