.class public final La/g6w;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:La/rrd;

.field public final synthetic k:J

.field public final synthetic l:J

.field public final synthetic m:J

.field public final synthetic n:I

.field public final synthetic o:I


# direct methods
.method public constructor <init>(La/rrd;JJJIILa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/g6w;->j:La/rrd;

    .line 2
    .line 3
    iput-wide p2, p0, La/g6w;->k:J

    .line 4
    .line 5
    iput-wide p4, p0, La/g6w;->l:J

    .line 6
    .line 7
    iput-wide p6, p0, La/g6w;->m:J

    .line 8
    .line 9
    iput p8, p0, La/g6w;->n:I

    .line 10
    .line 11
    iput p9, p0, La/g6w;->o:I

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p10}, La/bnn0;-><init>(ILa/yje;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 11

    .line 1
    new-instance v0, La/g6w;

    .line 2
    .line 3
    iget v8, p0, La/g6w;->n:I

    .line 4
    .line 5
    iget v9, p0, La/g6w;->o:I

    .line 6
    .line 7
    iget-object v1, p0, La/g6w;->j:La/rrd;

    .line 8
    .line 9
    iget-wide v2, p0, La/g6w;->k:J

    .line 10
    .line 11
    iget-wide v4, p0, La/g6w;->l:J

    .line 12
    .line 13
    iget-wide v6, p0, La/g6w;->m:J

    .line 14
    .line 15
    move-object v10, p2

    .line 16
    invoke-direct/range {v0 .. v10}, La/g6w;-><init>(La/rrd;JJJIILa/yje;)V

    .line 17
    .line 18
    .line 19
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
    invoke-virtual {p0, p1, p2}, La/g6w;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/g6w;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/g6w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 37

    .line 1
    move-object/from16 v12, p0

    .line 2
    .line 3
    sget-object v13, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-boolean v0, v12, La/g6w;->i:Z

    .line 6
    .line 7
    const/4 v14, 0x0

    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    move-object/from16 v0, p1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object v14

    .line 25
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, v12, La/g6w;->j:La/rrd;

    .line 29
    .line 30
    iget-object v2, v0, La/rrd;->e:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, La/dpi0;

    .line 33
    .line 34
    iget-object v3, v0, La/rrd;->i:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v3, La/btt0;

    .line 37
    .line 38
    invoke-virtual {v3}, La/btt0;->a()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    iget-object v0, v0, La/rrd;->h:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, La/knf0;

    .line 45
    .line 46
    invoke-virtual {v0}, La/knf0;->c()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v11

    .line 50
    iput-boolean v1, v12, La/g6w;->i:Z

    .line 51
    .line 52
    iget-object v0, v2, La/dpi0;->a:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, La/lkr0;

    .line 55
    .line 56
    invoke-virtual {v0}, La/lkr0;->invoke()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, La/tor0;

    .line 61
    .line 62
    const/4 v9, 0x0

    .line 63
    move-object v1, v3

    .line 64
    iget-wide v2, v12, La/g6w;->k:J

    .line 65
    .line 66
    iget-wide v4, v12, La/g6w;->l:J

    .line 67
    .line 68
    iget-wide v6, v12, La/g6w;->m:J

    .line 69
    .line 70
    iget v8, v12, La/g6w;->n:I

    .line 71
    .line 72
    iget v10, v12, La/g6w;->o:I

    .line 73
    .line 74
    invoke-interface/range {v0 .. v12}, La/tor0;->a(Ljava/lang/String;JJJIIILjava/lang/String;La/yje;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-ne v0, v13, :cond_2

    .line 79
    .line 80
    return-object v13

    .line 81
    :cond_2
    :goto_0
    check-cast v0, La/dx5;

    .line 82
    .line 83
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, La/r2y;

    .line 88
    .line 89
    iget-object v0, v0, La/r2y;->a:Ljava/util/List;

    .line 90
    .line 91
    if-eqz v0, :cond_e

    .line 92
    .line 93
    new-instance v1, Ljava/util/ArrayList;

    .line 94
    .line 95
    const/16 v2, 0xa

    .line 96
    .line 97
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 102
    .line 103
    .line 104
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-eqz v2, :cond_d

    .line 113
    .line 114
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    check-cast v2, La/l2y;

    .line 119
    .line 120
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    sget-object v15, La/n3w;->Q1:La/n3w;

    .line 124
    .line 125
    iget-object v3, v2, La/l2y;->c:Ljava/lang/String;

    .line 126
    .line 127
    if-eqz v3, :cond_c

    .line 128
    .line 129
    sget-object v4, La/s77;->b:La/bj5;

    .line 130
    .line 131
    iget-object v4, v2, La/l2y;->h:Ljava/lang/String;

    .line 132
    .line 133
    const-string v5, ""

    .line 134
    .line 135
    if-nez v4, :cond_3

    .line 136
    .line 137
    move-object/from16 v20, v5

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_3
    move-object/from16 v20, v4

    .line 141
    .line 142
    :goto_2
    iget-object v4, v2, La/l2y;->b:Ljava/lang/Long;

    .line 143
    .line 144
    if-eqz v4, :cond_4

    .line 145
    .line 146
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 147
    .line 148
    .line 149
    move-result-wide v6

    .line 150
    :goto_3
    move-wide/from16 v21, v6

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_4
    const-wide/16 v6, 0x0

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :goto_4
    sget-object v4, La/e4f;->a:La/qud;

    .line 157
    .line 158
    iget-object v6, v2, La/l2y;->i:Ljava/lang/Integer;

    .line 159
    .line 160
    const/4 v7, 0x0

    .line 161
    if-eqz v6, :cond_5

    .line 162
    .line 163
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    goto :goto_5

    .line 168
    :cond_5
    move v6, v7

    .line 169
    :goto_5
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-static {v6}, La/qud;->e(I)La/e4f;

    .line 173
    .line 174
    .line 175
    move-result-object v23

    .line 176
    iget-object v4, v2, La/l2y;->f:Ljava/lang/Double;

    .line 177
    .line 178
    const-wide/16 v8, 0x0

    .line 179
    .line 180
    if-eqz v4, :cond_6

    .line 181
    .line 182
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 183
    .line 184
    .line 185
    move-result-wide v10

    .line 186
    move-wide/from16 v24, v10

    .line 187
    .line 188
    goto :goto_6

    .line 189
    :cond_6
    move-wide/from16 v24, v8

    .line 190
    .line 191
    :goto_6
    iget-object v4, v2, La/l2y;->g:Ljava/lang/Double;

    .line 192
    .line 193
    if-eqz v4, :cond_7

    .line 194
    .line 195
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 196
    .line 197
    .line 198
    move-result-wide v8

    .line 199
    :cond_7
    move-wide/from16 v26, v8

    .line 200
    .line 201
    iget-object v4, v2, La/l2y;->e:Ljava/lang/Integer;

    .line 202
    .line 203
    if-eqz v4, :cond_8

    .line 204
    .line 205
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 206
    .line 207
    .line 208
    move-result v7

    .line 209
    :cond_8
    const/16 v4, 0x8

    .line 210
    .line 211
    if-ne v7, v4, :cond_9

    .line 212
    .line 213
    sget-object v4, La/q4f;->y:La/q4f;

    .line 214
    .line 215
    :goto_7
    move-object/from16 v30, v4

    .line 216
    .line 217
    goto :goto_8

    .line 218
    :cond_9
    sget-object v4, La/q4f;->b:La/q4f;

    .line 219
    .line 220
    goto :goto_7

    .line 221
    :goto_8
    iget-object v4, v2, La/l2y;->l:Ljava/lang/String;

    .line 222
    .line 223
    if-nez v4, :cond_a

    .line 224
    .line 225
    move-object/from16 v28, v5

    .line 226
    .line 227
    goto :goto_9

    .line 228
    :cond_a
    move-object/from16 v28, v4

    .line 229
    .line 230
    :goto_9
    iget-object v2, v2, La/l2y;->m:La/pxu;

    .line 231
    .line 232
    if-eqz v2, :cond_b

    .line 233
    .line 234
    invoke-static {v2}, La/dyb;->n0(La/pxu;)La/hxu;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    :goto_a
    move-object/from16 v33, v2

    .line 239
    .line 240
    goto :goto_b

    .line 241
    :cond_b
    sget-object v2, La/hxu;->h:La/hxu;

    .line 242
    .line 243
    goto :goto_a

    .line 244
    :goto_b
    const v35, -0x310ca46

    .line 245
    .line 246
    .line 247
    const v36, -0x100003

    .line 248
    .line 249
    .line 250
    const-wide/16 v17, 0x0

    .line 251
    .line 252
    const/16 v19, 0x0

    .line 253
    .line 254
    const/16 v29, 0x0

    .line 255
    .line 256
    const/16 v31, 0x0

    .line 257
    .line 258
    const/16 v32, 0x0

    .line 259
    .line 260
    const/16 v34, 0x0

    .line 261
    .line 262
    move-object/from16 v16, v3

    .line 263
    .line 264
    invoke-static/range {v15 .. v36}, La/n3w;->d(La/n3w;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;JLa/e4f;DDLjava/lang/String;Ljava/lang/String;La/q4f;ZLjava/lang/String;La/hxu;Ljava/util/List;II)La/n3w;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    goto/16 :goto_1

    .line 272
    .line 273
    :cond_c
    invoke-static {v14}, La/jf4;->k(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    return-object v14

    .line 277
    :cond_d
    return-object v1

    .line 278
    :cond_e
    invoke-static {v14}, La/jf4;->k(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    return-object v14
.end method
