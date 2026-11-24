.class public final La/neq0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/z8r;

.field public j:La/p7m0;

.field public k:La/ly5;

.field public l:La/oeq0;

.field public m:Ljava/lang/Object;

.field public n:Ljava/lang/String;

.field public o:La/uk10;

.field public p:La/ieq0;

.field public q:D

.field public r:Z

.field public final synthetic s:La/oeq0;

.field public final synthetic t:La/ly5;


# direct methods
.method public constructor <init>(La/oeq0;La/ly5;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/neq0;->s:La/oeq0;

    .line 2
    .line 3
    iput-object p2, p0, La/neq0;->t:La/ly5;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    new-instance p1, La/neq0;

    .line 2
    .line 3
    iget-object v0, p0, La/neq0;->s:La/oeq0;

    .line 4
    .line 5
    iget-object p0, p0, La/neq0;->t:La/ly5;

    .line 6
    .line 7
    invoke-direct {p1, v0, p0, p2}, La/neq0;-><init>(La/oeq0;La/ly5;La/yje;)V

    .line 8
    .line 9
    .line 10
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
    invoke-virtual {p0, p1, p2}, La/neq0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/neq0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/neq0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-boolean v2, v0, La/neq0;->r:Z

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-wide/16 v4, 0x0

    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    if-eqz v2, :cond_2

    .line 12
    .line 13
    if-ne v2, v6, :cond_1

    .line 14
    .line 15
    iget-wide v7, v0, La/neq0;->q:D

    .line 16
    .line 17
    iget-object v2, v0, La/neq0;->p:La/ieq0;

    .line 18
    .line 19
    iget-object v9, v0, La/neq0;->o:La/uk10;

    .line 20
    .line 21
    iget-object v10, v0, La/neq0;->n:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v11, v0, La/neq0;->m:Ljava/lang/Object;

    .line 24
    .line 25
    iget-object v12, v0, La/neq0;->l:La/oeq0;

    .line 26
    .line 27
    iget-object v13, v0, La/neq0;->k:La/ly5;

    .line 28
    .line 29
    iget-object v14, v0, La/neq0;->j:La/p7m0;

    .line 30
    .line 31
    iget-object v15, v0, La/neq0;->i:La/z8r;

    .line 32
    .line 33
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    move-object/from16 v3, p1

    .line 37
    .line 38
    :cond_0
    move-object/from16 v16, v2

    .line 39
    .line 40
    move-wide/from16 v19, v7

    .line 41
    .line 42
    move-object/from16 v17, v9

    .line 43
    .line 44
    move-object/from16 v18, v10

    .line 45
    .line 46
    goto/16 :goto_2

    .line 47
    .line 48
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    return-object v0

    .line 55
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v2, v0, La/neq0;->s:La/oeq0;

    .line 59
    .line 60
    iget-object v7, v2, La/oeq0;->h:La/itt;

    .line 61
    .line 62
    invoke-virtual {v7}, La/itt;->a()D

    .line 63
    .line 64
    .line 65
    move-result-wide v7

    .line 66
    cmpg-double v7, v7, v4

    .line 67
    .line 68
    if-nez v7, :cond_3

    .line 69
    .line 70
    iget-object v7, v2, La/oeq0;->j:La/lg60;

    .line 71
    .line 72
    iget-object v8, v2, La/oeq0;->i:La/l1u;

    .line 73
    .line 74
    invoke-virtual {v8}, La/l1u;->a()D

    .line 75
    .line 76
    .line 77
    move-result-wide v8

    .line 78
    invoke-virtual {v7, v8, v9}, La/lg60;->a(D)V

    .line 79
    .line 80
    .line 81
    :cond_3
    iget-object v7, v2, La/oeq0;->r:La/xsu;

    .line 82
    .line 83
    iget-object v7, v7, La/xsu;->a:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v7, La/kgq0;

    .line 86
    .line 87
    iget-object v7, v7, La/kgq0;->c:La/beq0;

    .line 88
    .line 89
    iget-object v7, v7, La/beq0;->a:La/xfq0;

    .line 90
    .line 91
    iget-object v7, v7, La/xfq0;->b:La/xeq0;

    .line 92
    .line 93
    iget-object v7, v7, La/xeq0;->e:Ljava/util/List;

    .line 94
    .line 95
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    if-nez v8, :cond_4

    .line 100
    .line 101
    invoke-interface {v7, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    check-cast v7, La/z8r;

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_4
    new-instance v7, La/z8r;

    .line 109
    .line 110
    const-string v8, ""

    .line 111
    .line 112
    sget-object v9, La/uk10;->b:La/uk10;

    .line 113
    .line 114
    invoke-direct {v7, v9, v8}, La/z8r;-><init>(La/uk10;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    :goto_0
    iget-object v8, v2, La/oeq0;->t:La/p7m0;

    .line 118
    .line 119
    iget-object v9, v0, La/neq0;->t:La/ly5;

    .line 120
    .line 121
    move-object v12, v2

    .line 122
    move-object v15, v7

    .line 123
    move-object v14, v8

    .line 124
    move-object v13, v9

    .line 125
    :goto_1
    invoke-virtual {v14}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v11

    .line 129
    move-object v2, v11

    .line 130
    check-cast v2, La/ieq0;

    .line 131
    .line 132
    iget-object v9, v15, La/z8r;->b:La/uk10;

    .line 133
    .line 134
    iget-object v10, v15, La/z8r;->a:Ljava/lang/String;

    .line 135
    .line 136
    iget-wide v7, v13, La/ly5;->a:D

    .line 137
    .line 138
    iget-object v3, v12, La/oeq0;->q:La/t0u;

    .line 139
    .line 140
    iput-object v15, v0, La/neq0;->i:La/z8r;

    .line 141
    .line 142
    iput-object v14, v0, La/neq0;->j:La/p7m0;

    .line 143
    .line 144
    iput-object v13, v0, La/neq0;->k:La/ly5;

    .line 145
    .line 146
    iput-object v12, v0, La/neq0;->l:La/oeq0;

    .line 147
    .line 148
    iput-object v11, v0, La/neq0;->m:Ljava/lang/Object;

    .line 149
    .line 150
    iput-object v10, v0, La/neq0;->n:Ljava/lang/String;

    .line 151
    .line 152
    iput-object v9, v0, La/neq0;->o:La/uk10;

    .line 153
    .line 154
    iput-object v2, v0, La/neq0;->p:La/ieq0;

    .line 155
    .line 156
    iput-wide v7, v0, La/neq0;->q:D

    .line 157
    .line 158
    iput-boolean v6, v0, La/neq0;->r:Z

    .line 159
    .line 160
    invoke-virtual {v3, v0}, La/t0u;->a(La/yje;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    if-ne v3, v1, :cond_0

    .line 165
    .line 166
    return-object v1

    .line 167
    :goto_2
    move-object/from16 v21, v3

    .line 168
    .line 169
    check-cast v21, Ljava/lang/String;

    .line 170
    .line 171
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    iget-object v2, v12, La/oeq0;->h:La/itt;

    .line 175
    .line 176
    iget-object v3, v13, La/ly5;->f:La/esr;

    .line 177
    .line 178
    iget-wide v7, v13, La/ly5;->a:D

    .line 179
    .line 180
    sget-object v9, La/esr;->e:La/esr;

    .line 181
    .line 182
    if-ne v3, v9, :cond_6

    .line 183
    .line 184
    cmpl-double v3, v7, v4

    .line 185
    .line 186
    if-lez v3, :cond_6

    .line 187
    .line 188
    iget-object v3, v13, La/ly5;->b:La/lnm0;

    .line 189
    .line 190
    sget-object v9, La/lnm0;->e:La/lnm0;

    .line 191
    .line 192
    if-eq v3, v9, :cond_5

    .line 193
    .line 194
    invoke-virtual {v2}, La/itt;->a()D

    .line 195
    .line 196
    .line 197
    move-result-wide v9

    .line 198
    cmpl-double v3, v9, v7

    .line 199
    .line 200
    if-lez v3, :cond_6

    .line 201
    .line 202
    :cond_5
    move/from16 v22, v6

    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_6
    const/16 v22, 0x0

    .line 206
    .line 207
    :goto_3
    invoke-virtual {v2}, La/itt;->a()D

    .line 208
    .line 209
    .line 210
    move-result-wide v23

    .line 211
    const/16 v25, 0x0

    .line 212
    .line 213
    const/16 v26, 0x40

    .line 214
    .line 215
    invoke-static/range {v16 .. v26}, La/ieq0;->a(La/ieq0;La/uk10;Ljava/lang/String;DLjava/lang/String;ZDZI)La/ieq0;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    invoke-virtual {v14, v11, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    if-eqz v2, :cond_7

    .line 224
    .line 225
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 226
    .line 227
    return-object v0

    .line 228
    :cond_7
    const/4 v3, 0x0

    .line 229
    goto :goto_1
.end method
