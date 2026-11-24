.class public final La/c8u;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/xco;

.field public j:B

.field public final synthetic k:La/uii;

.field public final synthetic l:Ljava/util/List;

.field public final synthetic m:Ljava/util/List;

.field public final synthetic n:Ljava/math/BigDecimal;

.field public final synthetic o:J

.field public final synthetic p:J

.field public final synthetic q:J


# direct methods
.method public constructor <init>(La/uii;Ljava/util/List;Ljava/util/List;Ljava/math/BigDecimal;JJJLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/c8u;->k:La/uii;

    .line 2
    .line 3
    iput-object p2, p0, La/c8u;->l:Ljava/util/List;

    .line 4
    .line 5
    iput-object p3, p0, La/c8u;->m:Ljava/util/List;

    .line 6
    .line 7
    iput-object p4, p0, La/c8u;->n:Ljava/math/BigDecimal;

    .line 8
    .line 9
    iput-wide p5, p0, La/c8u;->o:J

    .line 10
    .line 11
    iput-wide p7, p0, La/c8u;->p:J

    .line 12
    .line 13
    iput-wide p9, p0, La/c8u;->q:J

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p11}, La/bnn0;-><init>(ILa/yje;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 12

    .line 1
    new-instance v0, La/c8u;

    .line 2
    .line 3
    iget-wide v7, p0, La/c8u;->p:J

    .line 4
    .line 5
    iget-wide v9, p0, La/c8u;->q:J

    .line 6
    .line 7
    iget-object v1, p0, La/c8u;->k:La/uii;

    .line 8
    .line 9
    iget-object v2, p0, La/c8u;->l:Ljava/util/List;

    .line 10
    .line 11
    iget-object v3, p0, La/c8u;->m:Ljava/util/List;

    .line 12
    .line 13
    iget-object v4, p0, La/c8u;->n:Ljava/math/BigDecimal;

    .line 14
    .line 15
    iget-wide v5, p0, La/c8u;->o:J

    .line 16
    .line 17
    move-object v11, p2

    .line 18
    invoke-direct/range {v0 .. v11}, La/c8u;-><init>(La/uii;Ljava/util/List;Ljava/util/List;Ljava/math/BigDecimal;JJJLa/yje;)V

    .line 19
    .line 20
    .line 21
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
    invoke-virtual {p0, p1, p2}, La/c8u;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/c8u;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/c8u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/c8u;->k:La/uii;

    .line 4
    .line 5
    iget-object v2, v1, La/uii;->f:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, La/n0o0;

    .line 8
    .line 9
    iget-object v3, v1, La/uii;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, La/j1q0;

    .line 12
    .line 13
    sget-object v4, La/wne;->a:La/wne;

    .line 14
    .line 15
    iget-byte v5, v0, La/c8u;->j:B

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v7, 0x2

    .line 19
    const/4 v8, 0x1

    .line 20
    if-eqz v5, :cond_2

    .line 21
    .line 22
    if-eq v5, v8, :cond_1

    .line 23
    .line 24
    if-ne v5, v7, :cond_0

    .line 25
    .line 26
    iget-object v1, v0, La/c8u;->i:La/xco;

    .line 27
    .line 28
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    move-object v5, v1

    .line 32
    move-object/from16 v1, p1

    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 36
    .line 37
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-object v6

    .line 41
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    move-object/from16 v5, p1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object v5, v1, La/uii;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v5, La/edo;

    .line 53
    .line 54
    iput-byte v8, v0, La/c8u;->j:B

    .line 55
    .line 56
    invoke-virtual {v5, v0}, La/edo;->b(La/zje;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    if-ne v5, v4, :cond_3

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    :goto_0
    check-cast v5, Ljava/lang/Iterable;

    .line 64
    .line 65
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    :cond_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v9

    .line 73
    if-eqz v9, :cond_5

    .line 74
    .line 75
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    move-object v10, v9

    .line 80
    check-cast v10, La/xco;

    .line 81
    .line 82
    iget-wide v10, v10, La/xco;->a:J

    .line 83
    .line 84
    iget-wide v12, v0, La/c8u;->p:J

    .line 85
    .line 86
    cmp-long v10, v10, v12

    .line 87
    .line 88
    if-nez v10, :cond_4

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_5
    move-object v9, v6

    .line 92
    :goto_1
    move-object v5, v9

    .line 93
    check-cast v5, La/xco;

    .line 94
    .line 95
    iget-object v1, v1, La/uii;->a:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v1, La/zfo;

    .line 98
    .line 99
    iput-object v5, v0, La/c8u;->i:La/xco;

    .line 100
    .line 101
    iput-byte v7, v0, La/c8u;->j:B

    .line 102
    .line 103
    invoke-virtual {v1, v0}, La/zfo;->b(La/yje;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    if-ne v1, v4, :cond_6

    .line 108
    .line 109
    :goto_2
    return-object v4

    .line 110
    :cond_6
    :goto_3
    check-cast v1, Ljava/lang/Iterable;

    .line 111
    .line 112
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    if-eqz v4, :cond_8

    .line 121
    .line 122
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    move-object v7, v4

    .line 127
    check-cast v7, La/ueo;

    .line 128
    .line 129
    iget-wide v9, v7, La/ueo;->a:J

    .line 130
    .line 131
    iget-wide v11, v0, La/c8u;->q:J

    .line 132
    .line 133
    cmp-long v7, v9, v11

    .line 134
    .line 135
    if-nez v7, :cond_7

    .line 136
    .line 137
    move-object v6, v4

    .line 138
    :cond_8
    check-cast v6, La/ueo;

    .line 139
    .line 140
    if-eqz v5, :cond_b

    .line 141
    .line 142
    if-eqz v6, :cond_b

    .line 143
    .line 144
    iget-object v1, v5, La/xco;->b:Ljava/lang/String;

    .line 145
    .line 146
    iget-object v9, v6, La/ueo;->b:Ljava/lang/String;

    .line 147
    .line 148
    iget v4, v6, La/ueo;->c:I

    .line 149
    .line 150
    new-instance v12, Ljava/lang/Integer;

    .line 151
    .line 152
    invoke-direct {v12, v4}, Ljava/lang/Integer;-><init>(I)V

    .line 153
    .line 154
    .line 155
    iget-object v4, v3, La/j1q0;->a:La/m1q0;

    .line 156
    .line 157
    invoke-virtual {v4}, La/m1q0;->j()Z

    .line 158
    .line 159
    .line 160
    move-result v13

    .line 161
    new-instance v4, Ljava/lang/Long;

    .line 162
    .line 163
    iget-wide v10, v0, La/c8u;->o:J

    .line 164
    .line 165
    invoke-direct {v4, v10, v11}, Ljava/lang/Long;-><init>(J)V

    .line 166
    .line 167
    .line 168
    iget-wide v5, v6, La/ueo;->a:J

    .line 169
    .line 170
    sget-object v19, La/nt20;->d:La/nt20;

    .line 171
    .line 172
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    check-cast v7, La/sff0;

    .line 177
    .line 178
    iget-boolean v7, v7, La/sff0;->J1:Z

    .line 179
    .line 180
    iget-object v3, v3, La/j1q0;->a:La/m1q0;

    .line 181
    .line 182
    invoke-virtual {v3}, La/m1q0;->f()Z

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    if-nez v3, :cond_a

    .line 187
    .line 188
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    check-cast v2, La/sff0;

    .line 193
    .line 194
    iget-boolean v2, v2, La/sff0;->O1:Z

    .line 195
    .line 196
    if-eqz v2, :cond_9

    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_9
    const/4 v8, 0x0

    .line 200
    :cond_a
    :goto_4
    move/from16 v21, v8

    .line 201
    .line 202
    iget-object v10, v0, La/c8u;->l:Ljava/util/List;

    .line 203
    .line 204
    iget-object v11, v0, La/c8u;->m:Ljava/util/List;

    .line 205
    .line 206
    iget-object v14, v0, La/c8u;->n:Ljava/math/BigDecimal;

    .line 207
    .line 208
    const/4 v15, 0x0

    .line 209
    move-object/from16 v16, v4

    .line 210
    .line 211
    move-wide/from16 v17, v5

    .line 212
    .line 213
    move/from16 v20, v7

    .line 214
    .line 215
    invoke-static/range {v9 .. v21}, La/dii0;->a(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;ZLjava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;JLa/nt20;ZZ)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    const-string v2, " "

    .line 220
    .line 221
    invoke-static {v1, v2, v0}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    return-object v0

    .line 226
    :cond_b
    const-string v0, ""

    .line 227
    .line 228
    return-object v0
.end method
