.class public final La/n220;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public j:I

.field public k:I

.field public l:Ljava/lang/String;

.field public m:La/o470;

.field public n:J

.field public o:B

.field public final synthetic p:La/w220;

.field public final synthetic q:Z


# direct methods
.method public constructor <init>(La/w220;ZLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/n220;->p:La/w220;

    .line 2
    .line 3
    iput-boolean p2, p0, La/n220;->q:Z

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
    new-instance p1, La/n220;

    .line 2
    .line 3
    iget-object v0, p0, La/n220;->p:La/w220;

    .line 4
    .line 5
    iget-boolean p0, p0, La/n220;->q:Z

    .line 6
    .line 7
    invoke-direct {p1, v0, p0, p2}, La/n220;-><init>(La/w220;ZLa/yje;)V

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
    invoke-virtual {p0, p1, p2}, La/n220;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/n220;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/n220;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/n220;->p:La/w220;

    .line 4
    .line 5
    iget-object v2, v1, La/w220;->c1:La/sff0;

    .line 6
    .line 7
    iget-object v3, v1, La/w220;->c:La/ort;

    .line 8
    .line 9
    sget-object v4, La/wne;->a:La/wne;

    .line 10
    .line 11
    iget-byte v5, v0, La/n220;->o:B

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x3

    .line 15
    const/4 v8, 0x2

    .line 16
    const/4 v9, 0x0

    .line 17
    const/4 v10, 0x1

    .line 18
    if-eqz v5, :cond_3

    .line 19
    .line 20
    if-eq v5, v10, :cond_2

    .line 21
    .line 22
    if-eq v5, v8, :cond_1

    .line 23
    .line 24
    if-ne v5, v7, :cond_0

    .line 25
    .line 26
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto/16 :goto_6

    .line 30
    .line 31
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object v6

    .line 37
    :cond_1
    iget-wide v8, v0, La/n220;->n:J

    .line 38
    .line 39
    iget v1, v0, La/n220;->k:I

    .line 40
    .line 41
    iget v3, v0, La/n220;->j:I

    .line 42
    .line 43
    iget-boolean v5, v0, La/n220;->i:Z

    .line 44
    .line 45
    iget-object v10, v0, La/n220;->m:La/o470;

    .line 46
    .line 47
    iget-object v11, v0, La/n220;->l:Ljava/lang/String;

    .line 48
    .line 49
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    move v15, v5

    .line 53
    move-wide v12, v8

    .line 54
    move-object v5, v10

    .line 55
    move-object v8, v11

    .line 56
    move v10, v1

    .line 57
    move-object/from16 v1, p1

    .line 58
    .line 59
    goto/16 :goto_4

    .line 60
    .line 61
    :cond_2
    iget v5, v0, La/n220;->j:I

    .line 62
    .line 63
    iget-boolean v11, v0, La/n220;->i:Z

    .line 64
    .line 65
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    move-object/from16 v12, p1

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object v5, v3, La/ort;->a:La/gst0;

    .line 75
    .line 76
    invoke-virtual {v5}, La/gst0;->a()Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-eqz v5, :cond_b

    .line 81
    .line 82
    iget-object v5, v1, La/w220;->d1:La/v8d;

    .line 83
    .line 84
    iget-boolean v5, v5, La/v8d;->j:Z

    .line 85
    .line 86
    if-nez v5, :cond_4

    .line 87
    .line 88
    goto/16 :goto_7

    .line 89
    .line 90
    :cond_4
    iget-object v5, v1, La/w220;->K:La/h760;

    .line 91
    .line 92
    invoke-interface {v5}, La/h760;->a()La/t760;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    check-cast v5, La/u760;

    .line 97
    .line 98
    invoke-virtual {v5}, La/u760;->f()Z

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    iget-boolean v11, v2, La/sff0;->W:Z

    .line 103
    .line 104
    if-eqz v11, :cond_6

    .line 105
    .line 106
    if-eqz v5, :cond_5

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_5
    move v11, v9

    .line 110
    goto :goto_1

    .line 111
    :cond_6
    :goto_0
    move v11, v10

    .line 112
    :goto_1
    iget-object v12, v1, La/w220;->v0:La/edu;

    .line 113
    .line 114
    iget-object v13, v1, La/w220;->u0:La/xfu;

    .line 115
    .line 116
    iget-object v13, v13, La/xfu;->a:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v13, La/nvu;

    .line 119
    .line 120
    iget-object v13, v13, La/nvu;->d:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v13, La/iw20;

    .line 123
    .line 124
    iget-object v13, v13, La/iw20;->a:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v13, La/vwb0;

    .line 127
    .line 128
    const-string v14, "push_token"

    .line 129
    .line 130
    invoke-static {v13, v14}, La/vwb0;->d(La/vwb0;Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v13

    .line 134
    iput-boolean v5, v0, La/n220;->i:Z

    .line 135
    .line 136
    iput v11, v0, La/n220;->j:I

    .line 137
    .line 138
    iput-byte v10, v0, La/n220;->o:B

    .line 139
    .line 140
    invoke-virtual {v12, v13, v0}, La/edu;->i(Ljava/lang/String;La/zje;)Ljava/io/Serializable;

    .line 141
    .line 142
    .line 143
    move-result-object v12

    .line 144
    if-ne v12, v4, :cond_7

    .line 145
    .line 146
    goto :goto_5

    .line 147
    :cond_7
    move/from16 v17, v11

    .line 148
    .line 149
    move v11, v5

    .line 150
    move/from16 v5, v17

    .line 151
    .line 152
    :goto_2
    check-cast v12, Ljava/lang/String;

    .line 153
    .line 154
    iget-object v13, v1, La/w220;->w0:La/rpt;

    .line 155
    .line 156
    iget-object v13, v13, La/rpt;->a:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v13, La/xr;

    .line 159
    .line 160
    invoke-virtual {v13}, La/xr;->i()La/rl40;

    .line 161
    .line 162
    .line 163
    move-result-object v13

    .line 164
    sget-object v14, La/rl40;->b:La/rl40;

    .line 165
    .line 166
    if-ne v13, v14, :cond_8

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_8
    move v10, v9

    .line 170
    :goto_3
    if-eqz v5, :cond_a

    .line 171
    .line 172
    if-eqz v10, :cond_a

    .line 173
    .line 174
    iget-object v13, v1, La/w220;->o:La/o470;

    .line 175
    .line 176
    invoke-virtual {v3}, La/ort;->b()J

    .line 177
    .line 178
    .line 179
    move-result-wide v14

    .line 180
    iget-object v1, v1, La/w220;->h:La/rou;

    .line 181
    .line 182
    iput-object v12, v0, La/n220;->l:Ljava/lang/String;

    .line 183
    .line 184
    iput-object v13, v0, La/n220;->m:La/o470;

    .line 185
    .line 186
    iput-boolean v11, v0, La/n220;->i:Z

    .line 187
    .line 188
    iput v5, v0, La/n220;->j:I

    .line 189
    .line 190
    iput v10, v0, La/n220;->k:I

    .line 191
    .line 192
    iput-wide v14, v0, La/n220;->n:J

    .line 193
    .line 194
    iput-byte v8, v0, La/n220;->o:B

    .line 195
    .line 196
    invoke-virtual {v1, v9, v0}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    if-ne v1, v4, :cond_9

    .line 201
    .line 202
    goto :goto_5

    .line 203
    :cond_9
    move v3, v5

    .line 204
    move-object v8, v12

    .line 205
    move-object v5, v13

    .line 206
    move-wide v12, v14

    .line 207
    move v15, v11

    .line 208
    :goto_4
    check-cast v1, La/m2c0;

    .line 209
    .line 210
    iget-object v14, v1, La/m2c0;->T:Ljava/lang/String;

    .line 211
    .line 212
    iget-boolean v1, v2, La/sff0;->X:Z

    .line 213
    .line 214
    new-instance v11, La/pzf;

    .line 215
    .line 216
    move/from16 v16, v1

    .line 217
    .line 218
    invoke-direct/range {v11 .. v16}, La/pzf;-><init>(JLjava/lang/String;ZZ)V

    .line 219
    .line 220
    .line 221
    iput-object v6, v0, La/n220;->l:Ljava/lang/String;

    .line 222
    .line 223
    iput-object v6, v0, La/n220;->m:La/o470;

    .line 224
    .line 225
    iput-boolean v15, v0, La/n220;->i:Z

    .line 226
    .line 227
    iput v3, v0, La/n220;->j:I

    .line 228
    .line 229
    iput v10, v0, La/n220;->k:I

    .line 230
    .line 231
    iput-byte v7, v0, La/n220;->o:B

    .line 232
    .line 233
    iget-boolean v1, v0, La/n220;->q:Z

    .line 234
    .line 235
    invoke-virtual {v5, v11, v1, v8, v0}, La/o470;->e(La/pzf;ZLjava/lang/String;La/zje;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    if-ne v0, v4, :cond_a

    .line 240
    .line 241
    :goto_5
    return-object v4

    .line 242
    :cond_a
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 243
    .line 244
    return-object v0

    .line 245
    :cond_b
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 246
    .line 247
    return-object v0
.end method
