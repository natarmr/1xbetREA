.class public final La/o1i0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public i:Ljava/util/Set;

.field public j:La/dpi0;

.field public k:B

.field public final synthetic l:La/p1i0;

.field public final synthetic m:I


# direct methods
.method public constructor <init>(La/p1i0;ILa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/o1i0;->l:La/p1i0;

    .line 2
    .line 3
    iput p2, p0, La/o1i0;->m:I

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    new-instance v0, La/o1i0;

    .line 2
    .line 3
    iget-object v1, p0, La/o1i0;->l:La/p1i0;

    .line 4
    .line 5
    iget p0, p0, La/o1i0;->m:I

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p1}, La/o1i0;-><init>(La/p1i0;ILa/yje;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/yje;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/o1i0;->create(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/o1i0;

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/o1i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-byte v2, v0, La/o1i0;->k:B

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x1

    .line 10
    iget v6, v0, La/o1i0;->m:I

    .line 11
    .line 12
    iget-object v7, v0, La/o1i0;->l:La/p1i0;

    .line 13
    .line 14
    if-eqz v2, :cond_2

    .line 15
    .line 16
    if-eq v2, v5, :cond_1

    .line 17
    .line 18
    if-ne v2, v4, :cond_0

    .line 19
    .line 20
    iget-object v0, v0, La/o1i0;->i:Ljava/util/Set;

    .line 21
    .line 22
    check-cast v0, Ljava/util/Set;

    .line 23
    .line 24
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_3

    .line 28
    .line 29
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object v3

    .line 35
    :cond_1
    iget-object v2, v0, La/o1i0;->j:La/dpi0;

    .line 36
    .line 37
    iget-object v5, v0, La/o1i0;->i:Ljava/util/Set;

    .line 38
    .line 39
    check-cast v5, Ljava/util/Set;

    .line 40
    .line 41
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    move-object v8, v5

    .line 45
    move-object/from16 v5, p1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, La/tec;

    .line 56
    .line 57
    iget-object v2, v2, La/tec;->f:Ljava/util/Set;

    .line 58
    .line 59
    iget-object v8, v7, La/p1i0;->s:La/dpi0;

    .line 60
    .line 61
    new-instance v9, Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-direct {v9, v6}, Ljava/lang/Integer;-><init>(I)V

    .line 64
    .line 65
    .line 66
    invoke-interface {v2, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    if-eqz v9, :cond_3

    .line 71
    .line 72
    new-instance v5, Ljava/lang/Integer;

    .line 73
    .line 74
    invoke-direct {v5, v6}, Ljava/lang/Integer;-><init>(I)V

    .line 75
    .line 76
    .line 77
    invoke-static {v2, v5}, La/eui0;->e(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    move-object v15, v8

    .line 82
    move-object v8, v2

    .line 83
    move-object v2, v15

    .line 84
    goto :goto_1

    .line 85
    :cond_3
    iget-object v9, v7, La/p1i0;->t:La/x0u;

    .line 86
    .line 87
    move-object v10, v2

    .line 88
    check-cast v10, Ljava/util/Set;

    .line 89
    .line 90
    iput-object v10, v0, La/o1i0;->i:Ljava/util/Set;

    .line 91
    .line 92
    iput-object v8, v0, La/o1i0;->j:La/dpi0;

    .line 93
    .line 94
    iput-byte v5, v0, La/o1i0;->k:B

    .line 95
    .line 96
    invoke-virtual {v9, v0}, La/x0u;->c(La/yje;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    if-ne v5, v1, :cond_4

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_4
    move-object v15, v8

    .line 104
    move-object v8, v2

    .line 105
    move-object v2, v15

    .line 106
    :goto_0
    check-cast v5, Ljava/lang/Number;

    .line 107
    .line 108
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    if-ne v5, v6, :cond_5

    .line 113
    .line 114
    new-instance v5, Ljava/lang/Integer;

    .line 115
    .line 116
    invoke-direct {v5, v6}, Ljava/lang/Integer;-><init>(I)V

    .line 117
    .line 118
    .line 119
    invoke-static {v5}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    move-object v6, v8

    .line 124
    check-cast v6, Ljava/lang/Iterable;

    .line 125
    .line 126
    invoke-static {v5, v6}, La/eui0;->g(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    goto :goto_1

    .line 131
    :cond_5
    new-instance v5, Ljava/lang/Integer;

    .line 132
    .line 133
    invoke-direct {v5, v6}, Ljava/lang/Integer;-><init>(I)V

    .line 134
    .line 135
    .line 136
    invoke-static {v8, v5}, La/eui0;->h(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    :goto_1
    move-object v6, v8

    .line 141
    check-cast v6, Ljava/util/Set;

    .line 142
    .line 143
    iput-object v6, v0, La/o1i0;->i:Ljava/util/Set;

    .line 144
    .line 145
    iput-object v3, v0, La/o1i0;->j:La/dpi0;

    .line 146
    .line 147
    iput-byte v4, v0, La/o1i0;->k:B

    .line 148
    .line 149
    invoke-virtual {v2, v5, v0}, La/dpi0;->i(Ljava/util/Set;La/bnn0;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    if-ne v0, v1, :cond_6

    .line 154
    .line 155
    :goto_2
    return-object v1

    .line 156
    :cond_6
    move-object v0, v8

    .line 157
    :goto_3
    sget v1, La/p1i0;->A:I

    .line 158
    .line 159
    iget-object v1, v7, La/i3t0;->i:La/ocj;

    .line 160
    .line 161
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 162
    .line 163
    :cond_7
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    iget-object v3, v7, La/i3t0;->f:La/oyg0;

    .line 171
    .line 172
    move-object v8, v2

    .line 173
    check-cast v8, La/tec;

    .line 174
    .line 175
    const-string v4, "SELECTED_IDS_KEY"

    .line 176
    .line 177
    invoke-static {v3, v0, v4}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    move-object v13, v0

    .line 181
    check-cast v13, Ljava/util/Set;

    .line 182
    .line 183
    const/16 v14, 0x5f

    .line 184
    .line 185
    const/4 v9, 0x0

    .line 186
    const/4 v10, 0x0

    .line 187
    const/4 v11, 0x0

    .line 188
    const/4 v12, 0x0

    .line 189
    invoke-static/range {v8 .. v14}, La/tec;->a(La/tec;ZZLjava/lang/String;Ljava/util/List;Ljava/util/Set;I)La/tec;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    if-eqz v2, :cond_7

    .line 198
    .line 199
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 200
    .line 201
    return-object v0
.end method
