.class public final La/sa60;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Ljava/lang/Object;

.field public j:I

.field public k:Z

.field public l:J

.field public m:J

.field public n:J

.field public o:B

.field public synthetic p:Ljava/lang/Object;

.field public final synthetic q:La/pwi;

.field public final synthetic r:Ljava/util/List;

.field public final synthetic s:Z

.field public final synthetic t:Ljava/lang/String;


# direct methods
.method public constructor <init>(La/pwi;Ljava/util/List;ZLjava/lang/String;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/sa60;->q:La/pwi;

    .line 2
    .line 3
    iput-object p2, p0, La/sa60;->r:Ljava/util/List;

    .line 4
    .line 5
    iput-boolean p3, p0, La/sa60;->s:Z

    .line 6
    .line 7
    iput-object p4, p0, La/sa60;->t:Ljava/lang/String;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 6

    .line 1
    new-instance v0, La/sa60;

    .line 2
    .line 3
    iget-boolean v3, p0, La/sa60;->s:Z

    .line 4
    .line 5
    iget-object v4, p0, La/sa60;->t:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v1, p0, La/sa60;->q:La/pwi;

    .line 8
    .line 9
    iget-object v2, p0, La/sa60;->r:Ljava/util/List;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, La/sa60;-><init>(La/pwi;Ljava/util/List;ZLjava/lang/String;La/yje;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, La/sa60;->p:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/sa60;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/sa60;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/sa60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v11, p0

    .line 2
    .line 3
    iget-object v0, v11, La/sa60;->p:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v12, v0

    .line 6
    check-cast v12, La/kmq;

    .line 7
    .line 8
    sget-object v13, La/wne;->a:La/wne;

    .line 9
    .line 10
    iget-byte v0, v11, La/sa60;->o:B

    .line 11
    .line 12
    const/4 v14, 0x4

    .line 13
    const/4 v1, 0x3

    .line 14
    const/4 v2, 0x2

    .line 15
    const/4 v3, 0x1

    .line 16
    const/4 v15, 0x0

    .line 17
    iget-object v4, v11, La/sa60;->q:La/pwi;

    .line 18
    .line 19
    if-eqz v0, :cond_5

    .line 20
    .line 21
    if-eq v0, v3, :cond_4

    .line 22
    .line 23
    if-eq v0, v2, :cond_2

    .line 24
    .line 25
    if-eq v0, v1, :cond_1

    .line 26
    .line 27
    if-ne v0, v14, :cond_0

    .line 28
    .line 29
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto/16 :goto_4

    .line 33
    .line 34
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-object v15

    .line 40
    :cond_1
    iget-wide v0, v11, La/sa60;->n:J

    .line 41
    .line 42
    iget-wide v2, v11, La/sa60;->m:J

    .line 43
    .line 44
    iget-wide v4, v11, La/sa60;->l:J

    .line 45
    .line 46
    iget-boolean v6, v11, La/sa60;->k:Z

    .line 47
    .line 48
    iget v7, v11, La/sa60;->j:I

    .line 49
    .line 50
    iget-object v8, v11, La/sa60;->i:Ljava/lang/Object;

    .line 51
    .line 52
    move-object v12, v8

    .line 53
    check-cast v12, La/kmq;

    .line 54
    .line 55
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    move v8, v7

    .line 59
    move-wide/from16 v18, v0

    .line 60
    .line 61
    move-object/from16 v0, p1

    .line 62
    .line 63
    move v1, v6

    .line 64
    move-wide/from16 v6, v18

    .line 65
    .line 66
    goto/16 :goto_2

    .line 67
    .line 68
    :cond_2
    iget v0, v11, La/sa60;->j:I

    .line 69
    .line 70
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    move-object/from16 v2, p1

    .line 74
    .line 75
    :cond_3
    move v3, v0

    .line 76
    goto :goto_1

    .line 77
    :cond_4
    iget v0, v11, La/sa60;->j:I

    .line 78
    .line 79
    iget-object v3, v11, La/sa60;->i:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v3, La/rtu;

    .line 82
    .line 83
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    move-object v5, v3

    .line 87
    move-object/from16 v3, p1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    iget-object v0, v4, La/pwi;->f:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, La/uzc;

    .line 96
    .line 97
    invoke-virtual {v0}, La/uzc;->b()La/jvn;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v0}, La/jvn;->getId()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    iget-object v5, v4, La/pwi;->h:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v5, La/rtu;

    .line 108
    .line 109
    iget-object v6, v4, La/pwi;->b:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v6, La/ieu;

    .line 112
    .line 113
    iput-object v12, v11, La/sa60;->p:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object v5, v11, La/sa60;->i:Ljava/lang/Object;

    .line 116
    .line 117
    iput v0, v11, La/sa60;->j:I

    .line 118
    .line 119
    iput-byte v3, v11, La/sa60;->o:B

    .line 120
    .line 121
    invoke-virtual {v6, v11}, La/ieu;->i(La/yje;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    if-ne v3, v13, :cond_6

    .line 126
    .line 127
    goto/16 :goto_3

    .line 128
    .line 129
    :cond_6
    :goto_0
    check-cast v3, La/elt;

    .line 130
    .line 131
    iget v3, v3, La/elt;->e:I

    .line 132
    .line 133
    iput-object v12, v11, La/sa60;->p:Ljava/lang/Object;

    .line 134
    .line 135
    iput-object v15, v11, La/sa60;->i:Ljava/lang/Object;

    .line 136
    .line 137
    iput v0, v11, La/sa60;->j:I

    .line 138
    .line 139
    iput-byte v2, v11, La/sa60;->o:B

    .line 140
    .line 141
    const/4 v2, 0x0

    .line 142
    invoke-virtual {v5, v2, v3, v11}, La/rtu;->a(ZILa/yje;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    if-ne v2, v13, :cond_3

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :goto_1
    check-cast v2, La/c3c0;

    .line 150
    .line 151
    iget-boolean v0, v2, La/c3c0;->b:Z

    .line 152
    .line 153
    iget-wide v5, v2, La/c3c0;->c:J

    .line 154
    .line 155
    iget-object v2, v4, La/pwi;->a:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v2, La/viu;

    .line 158
    .line 159
    invoke-virtual {v2}, La/viu;->a()J

    .line 160
    .line 161
    .line 162
    move-result-wide v7

    .line 163
    invoke-static {v7, v8}, La/ynq0;->f(J)J

    .line 164
    .line 165
    .line 166
    move-result-wide v9

    .line 167
    iget-object v2, v4, La/pwi;->g:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v2, La/e1u;

    .line 170
    .line 171
    iput-object v15, v11, La/sa60;->p:Ljava/lang/Object;

    .line 172
    .line 173
    iput-object v12, v11, La/sa60;->i:Ljava/lang/Object;

    .line 174
    .line 175
    iput v3, v11, La/sa60;->j:I

    .line 176
    .line 177
    iput-boolean v0, v11, La/sa60;->k:Z

    .line 178
    .line 179
    iput-wide v5, v11, La/sa60;->l:J

    .line 180
    .line 181
    iput-wide v7, v11, La/sa60;->m:J

    .line 182
    .line 183
    iput-wide v9, v11, La/sa60;->n:J

    .line 184
    .line 185
    iput-byte v1, v11, La/sa60;->o:B

    .line 186
    .line 187
    iget-object v1, v2, La/e1u;->b:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v1, La/wdu;

    .line 190
    .line 191
    move-wide/from16 v16, v7

    .line 192
    .line 193
    sget-object v8, La/j8p;->a:La/j8p;

    .line 194
    .line 195
    move v2, v0

    .line 196
    move-object v0, v1

    .line 197
    iget-object v1, v11, La/sa60;->r:Ljava/util/List;

    .line 198
    .line 199
    move-wide v4, v5

    .line 200
    move-wide v6, v9

    .line 201
    iget-boolean v9, v11, La/sa60;->s:Z

    .line 202
    .line 203
    iget-object v10, v11, La/sa60;->t:Ljava/lang/String;

    .line 204
    .line 205
    invoke-virtual/range {v0 .. v11}, La/wdu;->h(Ljava/util/List;ZIJJLa/j8p;ZLjava/lang/String;La/zje;)Ljava/io/Serializable;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    if-ne v0, v13, :cond_7

    .line 210
    .line 211
    goto :goto_3

    .line 212
    :cond_7
    move v1, v2

    .line 213
    move v8, v3

    .line 214
    move-wide/from16 v2, v16

    .line 215
    .line 216
    :goto_2
    iput-object v15, v11, La/sa60;->p:Ljava/lang/Object;

    .line 217
    .line 218
    iput-object v15, v11, La/sa60;->i:Ljava/lang/Object;

    .line 219
    .line 220
    iput v8, v11, La/sa60;->j:I

    .line 221
    .line 222
    iput-boolean v1, v11, La/sa60;->k:Z

    .line 223
    .line 224
    iput-wide v4, v11, La/sa60;->l:J

    .line 225
    .line 226
    iput-wide v2, v11, La/sa60;->m:J

    .line 227
    .line 228
    iput-wide v6, v11, La/sa60;->n:J

    .line 229
    .line 230
    iput-byte v14, v11, La/sa60;->o:B

    .line 231
    .line 232
    invoke-interface {v12, v0, v11}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    if-ne v0, v13, :cond_8

    .line 237
    .line 238
    :goto_3
    return-object v13

    .line 239
    :cond_8
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 240
    .line 241
    return-object v0
.end method
