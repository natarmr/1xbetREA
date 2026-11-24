.class public final La/v5f;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Ljava/util/List;

.field public j:La/cit0;

.field public k:B

.field public final synthetic l:La/r7f;

.field public final synthetic m:Ljava/util/List;

.field public final synthetic n:La/q4f;

.field public final synthetic o:Ljava/util/List;

.field public final synthetic p:Ljava/util/List;

.field public final synthetic q:Ljava/util/List;

.field public final synthetic r:Ljava/util/List;

.field public final synthetic s:Z

.field public final synthetic t:Z

.field public final synthetic u:Z


# direct methods
.method public constructor <init>(La/r7f;Ljava/util/List;La/q4f;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/v5f;->l:La/r7f;

    .line 2
    .line 3
    iput-object p2, p0, La/v5f;->m:Ljava/util/List;

    .line 4
    .line 5
    iput-object p3, p0, La/v5f;->n:La/q4f;

    .line 6
    .line 7
    iput-object p4, p0, La/v5f;->o:Ljava/util/List;

    .line 8
    .line 9
    iput-object p5, p0, La/v5f;->p:Ljava/util/List;

    .line 10
    .line 11
    iput-object p6, p0, La/v5f;->q:Ljava/util/List;

    .line 12
    .line 13
    iput-object p7, p0, La/v5f;->r:Ljava/util/List;

    .line 14
    .line 15
    iput-boolean p8, p0, La/v5f;->s:Z

    .line 16
    .line 17
    iput-boolean p9, p0, La/v5f;->t:Z

    .line 18
    .line 19
    iput-boolean p10, p0, La/v5f;->u:Z

    .line 20
    .line 21
    const/4 p1, 0x2

    .line 22
    invoke-direct {p0, p1, p11}, La/bnn0;-><init>(ILa/yje;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 12

    .line 1
    new-instance v0, La/v5f;

    .line 2
    .line 3
    iget-boolean v9, p0, La/v5f;->t:Z

    .line 4
    .line 5
    iget-boolean v10, p0, La/v5f;->u:Z

    .line 6
    .line 7
    iget-object v1, p0, La/v5f;->l:La/r7f;

    .line 8
    .line 9
    iget-object v2, p0, La/v5f;->m:Ljava/util/List;

    .line 10
    .line 11
    iget-object v3, p0, La/v5f;->n:La/q4f;

    .line 12
    .line 13
    iget-object v4, p0, La/v5f;->o:Ljava/util/List;

    .line 14
    .line 15
    iget-object v5, p0, La/v5f;->p:Ljava/util/List;

    .line 16
    .line 17
    iget-object v6, p0, La/v5f;->q:Ljava/util/List;

    .line 18
    .line 19
    iget-object v7, p0, La/v5f;->r:Ljava/util/List;

    .line 20
    .line 21
    iget-boolean v8, p0, La/v5f;->s:Z

    .line 22
    .line 23
    move-object v11, p2

    .line 24
    invoke-direct/range {v0 .. v11}, La/v5f;-><init>(La/r7f;Ljava/util/List;La/q4f;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZLa/yje;)V

    .line 25
    .line 26
    .line 27
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
    invoke-virtual {p0, p1, p2}, La/v5f;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/v5f;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/v5f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 15

    .line 1
    sget-object v9, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-byte v0, p0, La/v5f;->k:B

    .line 4
    .line 5
    iget-object v1, p0, La/v5f;->n:La/q4f;

    .line 6
    .line 7
    const/4 v10, 0x0

    .line 8
    iget-object v11, p0, La/v5f;->m:Ljava/util/List;

    .line 9
    .line 10
    const/4 v2, 0x3

    .line 11
    const/4 v3, 0x2

    .line 12
    const/4 v12, 0x1

    .line 13
    iget-object v13, p0, La/v5f;->l:La/r7f;

    .line 14
    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    if-eq v0, v12, :cond_2

    .line 18
    .line 19
    if-eq v0, v3, :cond_1

    .line 20
    .line 21
    if-ne v0, v2, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, La/v5f;->j:La/cit0;

    .line 24
    .line 25
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    move-object v14, v0

    .line 29
    move-object/from16 v0, p1

    .line 30
    .line 31
    goto/16 :goto_4

    .line 32
    .line 33
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object v10

    .line 39
    :cond_1
    iget-object v0, p0, La/v5f;->j:La/cit0;

    .line 40
    .line 41
    iget-object v3, p0, La/v5f;->i:Ljava/util/List;

    .line 42
    .line 43
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    move-object v14, v0

    .line 47
    move-object v0, v3

    .line 48
    move-object/from16 v3, p1

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    move-object/from16 v0, p1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object v0, v13, La/r7f;->y0:La/k52;

    .line 61
    .line 62
    new-instance v4, Ljava/util/ArrayList;

    .line 63
    .line 64
    const/16 v5, 0xa

    .line 65
    .line 66
    invoke-static {v11, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 71
    .line 72
    .line 73
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-eqz v6, :cond_4

    .line 82
    .line 83
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    check-cast v6, La/qu6;

    .line 88
    .line 89
    iget-wide v6, v6, La/qu6;->a:J

    .line 90
    .line 91
    invoke-static {v6, v7, v4}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_4
    iput-byte v12, p0, La/v5f;->k:B

    .line 96
    .line 97
    iget-object v0, v0, La/k52;->a:La/chf0;

    .line 98
    .line 99
    invoke-virtual {v0, v4, p0}, La/chf0;->C(Ljava/util/List;La/zje;)Ljava/io/Serializable;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    if-ne v0, v9, :cond_5

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_5
    :goto_1
    check-cast v0, Ljava/util/List;

    .line 107
    .line 108
    iget-object v4, v13, La/r7f;->d:La/j9c;

    .line 109
    .line 110
    invoke-virtual {v4}, La/j9c;->c()La/cit0;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    iget-object v5, v13, La/r7f;->e:La/znt;

    .line 115
    .line 116
    iput-object v0, p0, La/v5f;->i:Ljava/util/List;

    .line 117
    .line 118
    iput-object v4, p0, La/v5f;->j:La/cit0;

    .line 119
    .line 120
    iput-byte v3, p0, La/v5f;->k:B

    .line 121
    .line 122
    iget-object v3, v5, La/znt;->a:La/chf0;

    .line 123
    .line 124
    invoke-virtual {v3, p0}, La/chf0;->p(La/yje;)Ljava/io/Serializable;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    if-ne v3, v9, :cond_6

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_6
    move-object v14, v4

    .line 132
    :goto_2
    check-cast v3, Ljava/util/Collection;

    .line 133
    .line 134
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    if-nez v3, :cond_b

    .line 139
    .line 140
    iput-object v10, p0, La/v5f;->i:Ljava/util/List;

    .line 141
    .line 142
    iput-object v14, p0, La/v5f;->j:La/cit0;

    .line 143
    .line 144
    iput-byte v2, p0, La/v5f;->k:B

    .line 145
    .line 146
    move-object v3, v0

    .line 147
    iget-object v0, p0, La/v5f;->l:La/r7f;

    .line 148
    .line 149
    iget-object v2, p0, La/v5f;->o:Ljava/util/List;

    .line 150
    .line 151
    iget-object v4, p0, La/v5f;->p:Ljava/util/List;

    .line 152
    .line 153
    iget-object v5, p0, La/v5f;->q:Ljava/util/List;

    .line 154
    .line 155
    iget-object v6, p0, La/v5f;->r:Ljava/util/List;

    .line 156
    .line 157
    iget-boolean v7, p0, La/v5f;->s:Z

    .line 158
    .line 159
    move-object v8, p0

    .line 160
    invoke-virtual/range {v0 .. v8}, La/r7f;->J(La/q4f;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLa/zje;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    if-ne v0, v9, :cond_7

    .line 165
    .line 166
    :goto_3
    return-object v9

    .line 167
    :cond_7
    :goto_4
    check-cast v0, Ljava/util/List;

    .line 168
    .line 169
    iget-object v2, v13, La/r7f;->Z1:La/p7m0;

    .line 170
    .line 171
    new-instance v3, La/eje;

    .line 172
    .line 173
    sget-object v4, La/q4f;->f:La/q4f;

    .line 174
    .line 175
    if-ne v1, v4, :cond_8

    .line 176
    .line 177
    goto :goto_5

    .line 178
    :cond_8
    const/4 v12, 0x0

    .line 179
    :goto_5
    iget-boolean v1, p0, La/v5f;->t:Z

    .line 180
    .line 181
    iget-boolean v4, p0, La/v5f;->u:Z

    .line 182
    .line 183
    invoke-direct {v3, v0, v12, v1, v4}, La/eje;-><init>(Ljava/util/List;ZZZ)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2, v10, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    if-eqz v1, :cond_9

    .line 201
    .line 202
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    check-cast v1, La/qu6;

    .line 207
    .line 208
    iget-object v2, v13, La/r7f;->b1:La/qru;

    .line 209
    .line 210
    iget-wide v3, v1, La/qu6;->a:J

    .line 211
    .line 212
    iget-object v1, v1, La/qu6;->s:Ljava/lang/String;

    .line 213
    .line 214
    invoke-virtual {v2, v3, v4, v1}, La/qru;->a(JLjava/lang/String;)V

    .line 215
    .line 216
    .line 217
    goto :goto_6

    .line 218
    :cond_9
    iget-object v0, v13, La/r7f;->a1:La/u0u;

    .line 219
    .line 220
    iget-wide v1, v14, La/cit0;->J:D

    .line 221
    .line 222
    iget-object v3, v14, La/cit0;->K:Ljava/lang/String;

    .line 223
    .line 224
    if-nez v3, :cond_a

    .line 225
    .line 226
    const-string v3, ""

    .line 227
    .line 228
    :cond_a
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    iget-object v0, v0, La/u0u;->a:La/khf0;

    .line 232
    .line 233
    new-instance v4, La/p0g0;

    .line 234
    .line 235
    invoke-direct {v4, v3, v1, v2}, La/p0g0;-><init>(Ljava/lang/String;D)V

    .line 236
    .line 237
    .line 238
    iget-object v0, v0, La/khf0;->c:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v0, La/ave;

    .line 241
    .line 242
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    iput-object v4, v0, La/ave;->i:La/p0g0;

    .line 246
    .line 247
    :cond_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 248
    .line 249
    return-object v0
.end method
