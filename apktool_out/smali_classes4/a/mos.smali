.class public final La/mos;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public i:Ljava/util/Map;

.field public j:La/f5h;

.field public k:Ljava/util/Map;

.field public l:Ljava/util/List;

.field public m:I

.field public n:B

.field public final synthetic o:La/ros;

.field public final synthetic p:La/sgs;

.field public final synthetic q:La/zos;

.field public final synthetic r:La/jo20;

.field public final synthetic s:Z

.field public final synthetic t:Z

.field public final synthetic u:Z

.field public final synthetic v:J


# direct methods
.method public constructor <init>(La/ros;La/sgs;La/zos;La/jo20;ZZZJLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/mos;->o:La/ros;

    .line 2
    .line 3
    iput-object p2, p0, La/mos;->p:La/sgs;

    .line 4
    .line 5
    iput-object p3, p0, La/mos;->q:La/zos;

    .line 6
    .line 7
    iput-object p4, p0, La/mos;->r:La/jo20;

    .line 8
    .line 9
    iput-boolean p5, p0, La/mos;->s:Z

    .line 10
    .line 11
    iput-boolean p6, p0, La/mos;->t:Z

    .line 12
    .line 13
    iput-boolean p7, p0, La/mos;->u:Z

    .line 14
    .line 15
    iput-wide p8, p0, La/mos;->v:J

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    invoke-direct {p0, p1, p10}, La/bnn0;-><init>(ILa/yje;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 11

    .line 1
    new-instance v0, La/mos;

    .line 2
    .line 3
    iget-boolean v7, p0, La/mos;->u:Z

    .line 4
    .line 5
    iget-wide v8, p0, La/mos;->v:J

    .line 6
    .line 7
    iget-object v1, p0, La/mos;->o:La/ros;

    .line 8
    .line 9
    iget-object v2, p0, La/mos;->p:La/sgs;

    .line 10
    .line 11
    iget-object v3, p0, La/mos;->q:La/zos;

    .line 12
    .line 13
    iget-object v4, p0, La/mos;->r:La/jo20;

    .line 14
    .line 15
    iget-boolean v5, p0, La/mos;->s:Z

    .line 16
    .line 17
    iget-boolean v6, p0, La/mos;->t:Z

    .line 18
    .line 19
    move-object v10, p1

    .line 20
    invoke-direct/range {v0 .. v10}, La/mos;-><init>(La/ros;La/sgs;La/zos;La/jo20;ZZZJLa/yje;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/yje;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/mos;->create(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/mos;

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/mos;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v3, p0

    .line 2
    .line 3
    sget-object v6, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-byte v0, v3, La/mos;->n:B

    .line 6
    .line 7
    const/4 v7, 0x0

    .line 8
    iget-object v8, v3, La/mos;->q:La/zos;

    .line 9
    .line 10
    iget-object v9, v3, La/mos;->p:La/sgs;

    .line 11
    .line 12
    const/4 v10, 0x3

    .line 13
    const/4 v11, 0x2

    .line 14
    const/4 v12, 0x0

    .line 15
    const/4 v13, 0x1

    .line 16
    iget-object v14, v3, La/mos;->o:La/ros;

    .line 17
    .line 18
    if-eqz v0, :cond_3

    .line 19
    .line 20
    if-eq v0, v13, :cond_2

    .line 21
    .line 22
    if-eq v0, v11, :cond_1

    .line 23
    .line 24
    if-ne v0, v10, :cond_0

    .line 25
    .line 26
    iget v0, v3, La/mos;->m:I

    .line 27
    .line 28
    iget-object v1, v3, La/mos;->l:Ljava/util/List;

    .line 29
    .line 30
    iget-object v2, v3, La/mos;->k:Ljava/util/Map;

    .line 31
    .line 32
    check-cast v2, Ljava/util/Map;

    .line 33
    .line 34
    iget-object v4, v3, La/mos;->j:La/f5h;

    .line 35
    .line 36
    iget-object v5, v3, La/mos;->i:Ljava/util/Map;

    .line 37
    .line 38
    check-cast v5, Ljava/util/Map;

    .line 39
    .line 40
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    move-object/from16 v16, v2

    .line 44
    .line 45
    move-object/from16 v2, p1

    .line 46
    .line 47
    :goto_0
    move-object/from16 v18, v1

    .line 48
    .line 49
    move-object v15, v4

    .line 50
    goto/16 :goto_5

    .line 51
    .line 52
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-object v12

    .line 58
    :cond_1
    iget v0, v3, La/mos;->m:I

    .line 59
    .line 60
    iget-object v1, v3, La/mos;->k:Ljava/util/Map;

    .line 61
    .line 62
    check-cast v1, Ljava/util/Map;

    .line 63
    .line 64
    iget-object v2, v3, La/mos;->j:La/f5h;

    .line 65
    .line 66
    iget-object v4, v3, La/mos;->i:Ljava/util/Map;

    .line 67
    .line 68
    check-cast v4, Ljava/util/Map;

    .line 69
    .line 70
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    move-object v15, v1

    .line 74
    move-object v4, v2

    .line 75
    move-object/from16 v2, p1

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_2
    iget-object v0, v3, La/mos;->i:Ljava/util/Map;

    .line 79
    .line 80
    check-cast v0, Ljava/util/Map;

    .line 81
    .line 82
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    move-object v15, v0

    .line 86
    move-object/from16 v0, p1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, v14, La/ros;->d:La/n530;

    .line 93
    .line 94
    iget-wide v1, v9, La/sgs;->f:J

    .line 95
    .line 96
    const-wide/16 v4, -0x1a

    .line 97
    .line 98
    invoke-virtual {v0, v1, v2, v4, v5}, La/n530;->c(JJ)Ljava/util/Map;

    .line 99
    .line 100
    .line 101
    move-result-object v15

    .line 102
    iget-object v0, v14, La/ros;->a:La/nmo;

    .line 103
    .line 104
    iget-object v4, v8, La/zos;->b:La/sip;

    .line 105
    .line 106
    iget-wide v1, v8, La/zos;->c:J

    .line 107
    .line 108
    move-object v5, v15

    .line 109
    check-cast v5, Ljava/util/Map;

    .line 110
    .line 111
    iput-object v5, v3, La/mos;->i:Ljava/util/Map;

    .line 112
    .line 113
    iput-byte v13, v3, La/mos;->n:B

    .line 114
    .line 115
    iget-object v5, v3, La/mos;->r:La/jo20;

    .line 116
    .line 117
    invoke-virtual/range {v0 .. v5}, La/nmo;->c(JLa/zje;La/sip;La/jo20;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    if-ne v0, v6, :cond_4

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_4
    :goto_1
    check-cast v0, La/f5h;

    .line 125
    .line 126
    iget-object v1, v8, La/zos;->b:La/sip;

    .line 127
    .line 128
    sget-object v2, La/sip;->c:La/sip;

    .line 129
    .line 130
    if-ne v1, v2, :cond_5

    .line 131
    .line 132
    move v1, v13

    .line 133
    goto :goto_2

    .line 134
    :cond_5
    move v1, v7

    .line 135
    :goto_2
    iget-object v2, v14, La/ros;->f:La/eio;

    .line 136
    .line 137
    iput-object v12, v3, La/mos;->i:Ljava/util/Map;

    .line 138
    .line 139
    iput-object v0, v3, La/mos;->j:La/f5h;

    .line 140
    .line 141
    move-object v4, v15

    .line 142
    check-cast v4, Ljava/util/Map;

    .line 143
    .line 144
    iput-object v4, v3, La/mos;->k:Ljava/util/Map;

    .line 145
    .line 146
    iput v1, v3, La/mos;->m:I

    .line 147
    .line 148
    iput-byte v11, v3, La/mos;->n:B

    .line 149
    .line 150
    invoke-virtual {v2, v3}, La/eio;->b(La/bnn0;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    if-ne v2, v6, :cond_6

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_6
    move-object v4, v0

    .line 158
    move v0, v1

    .line 159
    :goto_3
    move-object v1, v2

    .line 160
    check-cast v1, Ljava/util/List;

    .line 161
    .line 162
    iget-object v2, v14, La/ros;->g:La/he1;

    .line 163
    .line 164
    iput-object v12, v3, La/mos;->i:Ljava/util/Map;

    .line 165
    .line 166
    iput-object v4, v3, La/mos;->j:La/f5h;

    .line 167
    .line 168
    move-object v5, v15

    .line 169
    check-cast v5, Ljava/util/Map;

    .line 170
    .line 171
    iput-object v5, v3, La/mos;->k:Ljava/util/Map;

    .line 172
    .line 173
    iput-object v1, v3, La/mos;->l:Ljava/util/List;

    .line 174
    .line 175
    iput v0, v3, La/mos;->m:I

    .line 176
    .line 177
    iput-byte v10, v3, La/mos;->n:B

    .line 178
    .line 179
    invoke-virtual {v2, v3}, La/he1;->b(La/bnn0;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    if-ne v2, v6, :cond_7

    .line 184
    .line 185
    :goto_4
    return-object v6

    .line 186
    :cond_7
    move-object/from16 v16, v15

    .line 187
    .line 188
    goto/16 :goto_0

    .line 189
    .line 190
    :goto_5
    if-eqz v0, :cond_8

    .line 191
    .line 192
    move/from16 v17, v13

    .line 193
    .line 194
    goto :goto_6

    .line 195
    :cond_8
    move/from16 v17, v7

    .line 196
    .line 197
    :goto_6
    move-object/from16 v19, v2

    .line 198
    .line 199
    check-cast v19, Ljava/util/List;

    .line 200
    .line 201
    iget-boolean v0, v9, La/sgs;->d:Z

    .line 202
    .line 203
    iget-object v1, v14, La/ros;->e:La/us3;

    .line 204
    .line 205
    invoke-virtual {v1}, La/us3;->a()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v22

    .line 209
    iget-boolean v1, v3, La/mos;->t:Z

    .line 210
    .line 211
    iget-boolean v2, v3, La/mos;->u:Z

    .line 212
    .line 213
    iget-boolean v4, v3, La/mos;->s:Z

    .line 214
    .line 215
    move/from16 v21, v0

    .line 216
    .line 217
    move/from16 v23, v1

    .line 218
    .line 219
    move/from16 v24, v2

    .line 220
    .line 221
    move/from16 v20, v4

    .line 222
    .line 223
    invoke-static/range {v15 .. v24}, La/acb;->c0(La/f5h;Ljava/util/Map;ZLjava/util/List;Ljava/util/List;ZZLjava/lang/String;ZZ)Ljava/util/ArrayList;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 232
    .line 233
    .line 234
    move-result v1

    .line 235
    if-eqz v1, :cond_a

    .line 236
    .line 237
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    move-object v2, v1

    .line 242
    check-cast v2, La/xum0;

    .line 243
    .line 244
    iget-wide v4, v2, La/xum0;->b:J

    .line 245
    .line 246
    iget-wide v6, v3, La/mos;->v:J

    .line 247
    .line 248
    cmp-long v2, v4, v6

    .line 249
    .line 250
    if-nez v2, :cond_9

    .line 251
    .line 252
    goto :goto_7

    .line 253
    :cond_a
    move-object v1, v12

    .line 254
    :goto_7
    check-cast v1, La/xum0;

    .line 255
    .line 256
    if-eqz v1, :cond_b

    .line 257
    .line 258
    iget-object v12, v1, La/xum0;->f:Ljava/util/List;

    .line 259
    .line 260
    :cond_b
    if-nez v12, :cond_c

    .line 261
    .line 262
    sget-object v0, La/iun;->a:La/iun;

    .line 263
    .line 264
    return-object v0

    .line 265
    :cond_c
    return-object v12
.end method
