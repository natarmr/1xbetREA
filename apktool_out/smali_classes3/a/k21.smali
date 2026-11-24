.class public final La/k21;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Ljava/io/Serializable;

.field public j:La/n21;

.field public k:La/mlr;

.field public l:J

.field public m:Z

.field public final synthetic n:La/n21;

.field public final synthetic o:J

.field public final synthetic p:Z

.field public final synthetic q:J


# direct methods
.method public constructor <init>(La/n21;JZJLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/k21;->n:La/n21;

    .line 2
    .line 3
    iput-wide p2, p0, La/k21;->o:J

    .line 4
    .line 5
    iput-boolean p4, p0, La/k21;->p:Z

    .line 6
    .line 7
    iput-wide p5, p0, La/k21;->q:J

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p7}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 8

    .line 1
    new-instance v0, La/k21;

    .line 2
    .line 3
    iget-boolean v4, p0, La/k21;->p:Z

    .line 4
    .line 5
    iget-wide v5, p0, La/k21;->q:J

    .line 6
    .line 7
    iget-object v1, p0, La/k21;->n:La/n21;

    .line 8
    .line 9
    iget-wide v2, p0, La/k21;->o:J

    .line 10
    .line 11
    move-object v7, p2

    .line 12
    invoke-direct/range {v0 .. v7}, La/k21;-><init>(La/n21;JZJLa/yje;)V

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
    invoke-virtual {p0, p1, p2}, La/k21;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/k21;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/k21;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    sget-object v6, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-boolean v0, v5, La/k21;->m:Z

    .line 6
    .line 7
    const/4 v7, 0x1

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    if-ne v0, v7, :cond_0

    .line 11
    .line 12
    iget-wide v0, v5, La/k21;->l:J

    .line 13
    .line 14
    iget-object v2, v5, La/k21;->k:La/mlr;

    .line 15
    .line 16
    iget-object v3, v5, La/k21;->j:La/n21;

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    return-object v0

    .line 29
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object v8, v5, La/k21;->n:La/n21;

    .line 33
    .line 34
    iget-object v0, v8, La/n21;->u:La/cmt;

    .line 35
    .line 36
    iget-wide v1, v5, La/k21;->o:J

    .line 37
    .line 38
    invoke-virtual {v0, v1, v2}, La/cmt;->i(J)Ljava/io/Serializable;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 43
    .line 44
    instance-of v1, v0, La/g0g0;

    .line 45
    .line 46
    if-nez v1, :cond_b

    .line 47
    .line 48
    move-object v1, v0

    .line 49
    check-cast v1, La/mlr;

    .line 50
    .line 51
    iget-object v2, v8, La/n21;->y:La/xr;

    .line 52
    .line 53
    iget-boolean v3, v5, La/k21;->p:Z

    .line 54
    .line 55
    xor-int/2addr v3, v7

    .line 56
    iget-object v4, v8, La/n21;->I:La/eyg0;

    .line 57
    .line 58
    iget-wide v9, v1, La/mlr;->a:J

    .line 59
    .line 60
    new-instance v11, Ljava/lang/Long;

    .line 61
    .line 62
    iget-wide v12, v5, La/k21;->q:J

    .line 63
    .line 64
    invoke-direct {v11, v12, v13}, Ljava/lang/Long;-><init>(J)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v8, v11, v9, v10}, La/n21;->M(Ljava/lang/Long;J)La/lu0;

    .line 68
    .line 69
    .line 70
    move-result-object v9

    .line 71
    invoke-virtual {v4, v9}, La/eyg0;->k(La/lu0;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    iput-object v0, v5, La/k21;->i:Ljava/io/Serializable;

    .line 76
    .line 77
    iput-object v8, v5, La/k21;->j:La/n21;

    .line 78
    .line 79
    iput-object v1, v5, La/k21;->k:La/mlr;

    .line 80
    .line 81
    iput-wide v12, v5, La/k21;->l:J

    .line 82
    .line 83
    iput-boolean v7, v5, La/k21;->m:Z

    .line 84
    .line 85
    move-object v0, v2

    .line 86
    move v2, v3

    .line 87
    const/4 v3, 0x0

    .line 88
    invoke-virtual/range {v0 .. v5}, La/xr;->m(La/mlr;ZILjava/lang/String;La/yje;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    if-ne v0, v6, :cond_2

    .line 93
    .line 94
    return-object v6

    .line 95
    :cond_2
    move-object v2, v1

    .line 96
    move-object v3, v8

    .line 97
    move-wide v0, v12

    .line 98
    :goto_0
    iget-object v4, v3, La/n21;->A:La/x20;

    .line 99
    .line 100
    iget-wide v5, v2, La/mlr;->a:J

    .line 101
    .line 102
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    const-wide/16 v8, 0x4b

    .line 106
    .line 107
    cmp-long v8, v0, v8

    .line 108
    .line 109
    const-string v9, "null"

    .line 110
    .line 111
    const-string v10, "live_aggregator_popular"

    .line 112
    .line 113
    const-wide/16 v11, 0x25

    .line 114
    .line 115
    const-string v13, "recommended"

    .line 116
    .line 117
    const-wide/16 v14, -0x1

    .line 118
    .line 119
    const-string v16, "slots_popular"

    .line 120
    .line 121
    const-wide/16 v17, 0x11

    .line 122
    .line 123
    const-string v19, "live_1x"

    .line 124
    .line 125
    if-nez v8, :cond_3

    .line 126
    .line 127
    move-wide/from16 p0, v11

    .line 128
    .line 129
    move-object/from16 v11, v19

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_3
    cmp-long v20, v0, v17

    .line 133
    .line 134
    if-nez v20, :cond_4

    .line 135
    .line 136
    move-wide/from16 p0, v11

    .line 137
    .line 138
    move-object/from16 v11, v16

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_4
    cmp-long v20, v0, v14

    .line 142
    .line 143
    if-nez v20, :cond_5

    .line 144
    .line 145
    move-wide/from16 p0, v11

    .line 146
    .line 147
    move-object v11, v13

    .line 148
    goto :goto_1

    .line 149
    :cond_5
    cmp-long v20, v0, v11

    .line 150
    .line 151
    if-nez v20, :cond_6

    .line 152
    .line 153
    move-wide/from16 p0, v11

    .line 154
    .line 155
    move-object v11, v10

    .line 156
    goto :goto_1

    .line 157
    :cond_6
    move-wide/from16 p0, v11

    .line 158
    .line 159
    move-object v11, v9

    .line 160
    :goto_1
    iget-object v4, v4, La/x20;->a:La/s1p;

    .line 161
    .line 162
    new-instance v12, La/i1p;

    .line 163
    .line 164
    move-wide/from16 v20, v14

    .line 165
    .line 166
    const/4 v14, 0x2

    .line 167
    invoke-direct {v12, v14, v5, v6}, La/i1p;-><init>(BJ)V

    .line 168
    .line 169
    .line 170
    new-instance v5, La/j1p;

    .line 171
    .line 172
    const-string v6, "add_favor"

    .line 173
    .line 174
    const/4 v15, 0x0

    .line 175
    invoke-direct {v5, v6, v15}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 176
    .line 177
    .line 178
    move/from16 v22, v14

    .line 179
    .line 180
    new-instance v14, La/j1p;

    .line 181
    .line 182
    invoke-direct {v14, v11, v7}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 183
    .line 184
    .line 185
    const/4 v11, 0x3

    .line 186
    new-array v11, v11, [La/k1p;

    .line 187
    .line 188
    aput-object v12, v11, v15

    .line 189
    .line 190
    aput-object v5, v11, v7

    .line 191
    .line 192
    aput-object v14, v11, v22

    .line 193
    .line 194
    invoke-static {v11}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 195
    .line 196
    .line 197
    move-result-object v5

    .line 198
    const-wide/16 v11, 0xcdf

    .line 199
    .line 200
    invoke-virtual {v4, v5, v11, v12}, La/s1p;->a(Ljava/util/Set;J)V

    .line 201
    .line 202
    .line 203
    iget-object v3, v3, La/n21;->v:La/yo4;

    .line 204
    .line 205
    iget-wide v4, v2, La/mlr;->a:J

    .line 206
    .line 207
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    iget-object v2, v3, La/yo4;->a:La/kt2;

    .line 211
    .line 212
    new-instance v3, Lkotlin/Pair;

    .line 213
    .line 214
    const-string v7, "action"

    .line 215
    .line 216
    invoke-direct {v3, v7, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    if-nez v8, :cond_7

    .line 220
    .line 221
    move-object/from16 v9, v19

    .line 222
    .line 223
    goto :goto_2

    .line 224
    :cond_7
    cmp-long v6, v0, v17

    .line 225
    .line 226
    if-nez v6, :cond_8

    .line 227
    .line 228
    move-object/from16 v9, v16

    .line 229
    .line 230
    goto :goto_2

    .line 231
    :cond_8
    cmp-long v6, v0, v20

    .line 232
    .line 233
    if-nez v6, :cond_9

    .line 234
    .line 235
    move-object v9, v13

    .line 236
    goto :goto_2

    .line 237
    :cond_9
    cmp-long v0, v0, p0

    .line 238
    .line 239
    if-nez v0, :cond_a

    .line 240
    .line 241
    move-object v9, v10

    .line 242
    :cond_a
    :goto_2
    new-instance v0, Lkotlin/Pair;

    .line 243
    .line 244
    const-string v1, "type"

    .line 245
    .line 246
    invoke-direct {v0, v1, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    new-instance v4, Lkotlin/Pair;

    .line 254
    .line 255
    const-string v5, "game_id"

    .line 256
    .line 257
    invoke-direct {v4, v5, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    filled-new-array {v3, v0, v4}, [Lkotlin/Pair;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-static {v0}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    const-string v1, "promo_games_recomended_call"

    .line 269
    .line 270
    invoke-interface {v2, v1, v0}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 271
    .line 272
    .line 273
    :cond_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 274
    .line 275
    return-object v0
.end method
