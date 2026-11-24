.class public final La/l7k0;
.super La/fnx;
.source "SourceFile"


# instance fields
.field public p:La/nul0;

.field public q:La/zx7;

.field public r:J

.field public s:J

.field public t:Z

.field public final u:La/pz40;


# direct methods
.method public constructor <init>(La/nul0;La/zx7;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, La/fnx;-><init>(B)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, La/l7k0;->p:La/nul0;

    .line 6
    .line 7
    iput-object p2, p0, La/l7k0;->q:La/zx7;

    .line 8
    .line 9
    const-wide p1, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    iput-wide p1, p0, La/l7k0;->r:J

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    const/16 p2, 0xf

    .line 18
    .line 19
    invoke-static {p1, p1, p1, p1, p2}, La/r4e;->b(IIIII)J

    .line 20
    .line 21
    .line 22
    move-result-wide p1

    .line 23
    iput-wide p1, p0, La/l7k0;->s:J

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, La/l7k0;->u:La/pz40;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final R0()V
    .locals 2

    .line 1
    const-wide v0, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide v0, p0, La/l7k0;->r:J

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, La/l7k0;->t:Z

    .line 10
    .line 11
    return-void
.end method

.method public final T0()V
    .locals 1

    .line 1
    iget-object p0, p0, La/l7k0;->u:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final c(La/vj30;La/pj30;J)La/uj30;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-wide/from16 v7, p3

    .line 4
    .line 5
    invoke-interface/range {p1 .. p1}, La/cnx;->M()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iput-wide v7, v1, La/l7k0;->s:J

    .line 13
    .line 14
    iput-boolean v2, v1, La/l7k0;->t:Z

    .line 15
    .line 16
    invoke-interface/range {p2 .. p4}, La/pj30;->S(J)La/pu90;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :goto_0
    move-object v9, v0

    .line 21
    goto :goto_3

    .line 22
    :cond_0
    iget-boolean v0, v1, La/l7k0;->t:Z

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-wide v3, v1, La/l7k0;->s:J

    .line 27
    .line 28
    :goto_1
    move-object/from16 v0, p2

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_1
    move-wide v3, v7

    .line 32
    goto :goto_1

    .line 33
    :goto_2
    invoke-interface {v0, v3, v4}, La/pj30;->S(J)La/pu90;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    goto :goto_0

    .line 38
    :goto_3
    iget v0, v9, La/pu90;->a:I

    .line 39
    .line 40
    iget v3, v9, La/pu90;->b:I

    .line 41
    .line 42
    int-to-long v4, v0

    .line 43
    const/16 v10, 0x20

    .line 44
    .line 45
    shl-long/2addr v4, v10

    .line 46
    int-to-long v11, v3

    .line 47
    const-wide v13, 0xffffffffL

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    and-long/2addr v11, v13

    .line 53
    or-long/2addr v11, v4

    .line 54
    invoke-interface/range {p1 .. p1}, La/cnx;->M()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    iput-wide v11, v1, La/l7k0;->r:J

    .line 61
    .line 62
    move/from16 p2, v10

    .line 63
    .line 64
    move-wide v0, v11

    .line 65
    move-wide/from16 v16, v0

    .line 66
    .line 67
    goto/16 :goto_9

    .line 68
    .line 69
    :cond_2
    iget-wide v3, v1, La/l7k0;->r:J

    .line 70
    .line 71
    const-wide v5, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    invoke-static {v3, v4, v5, v6}, La/qkx;->a(JJ)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-nez v0, :cond_3

    .line 81
    .line 82
    iget-wide v3, v1, La/l7k0;->r:J

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_3
    move-wide v3, v11

    .line 86
    :goto_4
    iget-object v15, v1, La/l7k0;->u:La/pz40;

    .line 87
    .line 88
    move-object v0, v15

    .line 89
    check-cast v0, La/hgk0;

    .line 90
    .line 91
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, La/j7k0;

    .line 96
    .line 97
    if-eqz v0, :cond_7

    .line 98
    .line 99
    iget-object v5, v0, La/j7k0;->a:La/t33;

    .line 100
    .line 101
    invoke-virtual {v5}, La/t33;->d()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    check-cast v6, La/qkx;

    .line 106
    .line 107
    move/from16 p2, v10

    .line 108
    .line 109
    move-wide/from16 v16, v11

    .line 110
    .line 111
    iget-wide v10, v6, La/qkx;->a:J

    .line 112
    .line 113
    invoke-static {v3, v4, v10, v11}, La/qkx;->a(JJ)Z

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    if-nez v6, :cond_4

    .line 118
    .line 119
    invoke-virtual {v5}, La/t33;->e()Z

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    if-nez v6, :cond_4

    .line 124
    .line 125
    goto :goto_5

    .line 126
    :cond_4
    const/4 v2, 0x0

    .line 127
    :goto_5
    iget-object v6, v5, La/t33;->e:La/pz40;

    .line 128
    .line 129
    check-cast v6, La/hgk0;

    .line 130
    .line 131
    invoke-virtual {v6}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    check-cast v6, La/qkx;

    .line 136
    .line 137
    iget-wide v10, v6, La/qkx;->a:J

    .line 138
    .line 139
    invoke-static {v3, v4, v10, v11}, La/qkx;->a(JJ)Z

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    if-eqz v6, :cond_6

    .line 144
    .line 145
    if-eqz v2, :cond_5

    .line 146
    .line 147
    goto :goto_6

    .line 148
    :cond_5
    move-object v1, v0

    .line 149
    goto :goto_7

    .line 150
    :cond_6
    :goto_6
    invoke-virtual {v5}, La/t33;->d()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    check-cast v2, La/qkx;

    .line 155
    .line 156
    iget-wide v5, v2, La/qkx;->a:J

    .line 157
    .line 158
    iput-wide v5, v0, La/j7k0;->b:J

    .line 159
    .line 160
    invoke-virtual {v1}, La/lm40;->N0()La/vne;

    .line 161
    .line 162
    .line 163
    move-result-object v10

    .line 164
    move-object v1, v0

    .line 165
    new-instance v0, La/ir;

    .line 166
    .line 167
    const/4 v5, 0x0

    .line 168
    const/16 v6, 0x1c

    .line 169
    .line 170
    move-wide v2, v3

    .line 171
    move-object/from16 v4, p0

    .line 172
    .line 173
    invoke-direct/range {v0 .. v6}, La/ir;-><init>(Ljava/lang/Object;JLjava/lang/Object;La/yje;B)V

    .line 174
    .line 175
    .line 176
    const/4 v2, 0x3

    .line 177
    const/4 v3, 0x0

    .line 178
    invoke-static {v10, v3, v3, v0, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 179
    .line 180
    .line 181
    :goto_7
    move-object v0, v1

    .line 182
    goto :goto_8

    .line 183
    :cond_7
    move-wide v2, v3

    .line 184
    move/from16 p2, v10

    .line 185
    .line 186
    move-wide/from16 v16, v11

    .line 187
    .line 188
    new-instance v0, La/j7k0;

    .line 189
    .line 190
    new-instance v1, La/t33;

    .line 191
    .line 192
    new-instance v4, La/qkx;

    .line 193
    .line 194
    invoke-direct {v4, v2, v3}, La/qkx;-><init>(J)V

    .line 195
    .line 196
    .line 197
    sget-object v5, La/hp4;->q:La/lxs0;

    .line 198
    .line 199
    new-instance v6, La/qkx;

    .line 200
    .line 201
    const-wide v10, 0x100000001L

    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    invoke-direct {v6, v10, v11}, La/qkx;-><init>(J)V

    .line 207
    .line 208
    .line 209
    const/16 v10, 0x8

    .line 210
    .line 211
    invoke-direct {v1, v4, v5, v6, v10}, La/t33;-><init>(Ljava/lang/Object;La/lxs0;Ljava/lang/Object;I)V

    .line 212
    .line 213
    .line 214
    invoke-direct {v0, v1, v2, v3}, La/j7k0;-><init>(La/t33;J)V

    .line 215
    .line 216
    .line 217
    :goto_8
    check-cast v15, La/hgk0;

    .line 218
    .line 219
    invoke-virtual {v15, v0}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    iget-object v0, v0, La/j7k0;->a:La/t33;

    .line 223
    .line 224
    invoke-virtual {v0}, La/t33;->d()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    check-cast v0, La/qkx;

    .line 229
    .line 230
    iget-wide v0, v0, La/qkx;->a:J

    .line 231
    .line 232
    invoke-static {v7, v8, v0, v1}, La/r4e;->d(JJ)J

    .line 233
    .line 234
    .line 235
    move-result-wide v0

    .line 236
    :goto_9
    shr-long v2, v0, p2

    .line 237
    .line 238
    long-to-int v4, v2

    .line 239
    and-long/2addr v0, v13

    .line 240
    long-to-int v5, v0

    .line 241
    new-instance v0, La/k7k0;

    .line 242
    .line 243
    move-object/from16 v1, p0

    .line 244
    .line 245
    move-object/from16 v6, p1

    .line 246
    .line 247
    move-object v7, v9

    .line 248
    move-wide/from16 v2, v16

    .line 249
    .line 250
    invoke-direct/range {v0 .. v7}, La/k7k0;-><init>(La/l7k0;JIILa/vj30;La/pu90;)V

    .line 251
    .line 252
    .line 253
    invoke-static {v6, v4, v5, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    return-object v0
.end method
