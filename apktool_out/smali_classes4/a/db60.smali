.class public final La/db60;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/rtu;

.field public j:I

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:J

.field public o:B

.field public synthetic p:Ljava/lang/Object;

.field public final synthetic q:La/qv2;

.field public final synthetic r:Ljava/util/List;


# direct methods
.method public constructor <init>(La/qv2;Ljava/util/List;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/db60;->q:La/qv2;

    .line 2
    .line 3
    iput-object p2, p0, La/db60;->r:Ljava/util/List;

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
    .locals 2

    .line 1
    new-instance v0, La/db60;

    .line 2
    .line 3
    iget-object v1, p0, La/db60;->q:La/qv2;

    .line 4
    .line 5
    iget-object p0, p0, La/db60;->r:Ljava/util/List;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p2}, La/db60;-><init>(La/qv2;Ljava/util/List;La/yje;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, La/db60;->p:Ljava/lang/Object;

    .line 11
    .line 12
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
    invoke-virtual {p0, p1, p2}, La/db60;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/db60;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/db60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/db60;->p:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/kmq;

    .line 6
    .line 7
    sget-object v2, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-byte v3, v0, La/db60;->o:B

    .line 10
    .line 11
    const/4 v4, 0x4

    .line 12
    const/4 v5, 0x3

    .line 13
    const/4 v6, 0x2

    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v8, 0x1

    .line 16
    iget-object v9, v0, La/db60;->q:La/qv2;

    .line 17
    .line 18
    if-eqz v3, :cond_5

    .line 19
    .line 20
    if-eq v3, v8, :cond_4

    .line 21
    .line 22
    if-eq v3, v6, :cond_2

    .line 23
    .line 24
    if-eq v3, v5, :cond_1

    .line 25
    .line 26
    if-ne v3, v4, :cond_0

    .line 27
    .line 28
    iget-object v0, v0, La/db60;->i:La/rtu;

    .line 29
    .line 30
    check-cast v0, Ljava/lang/String;

    .line 31
    .line 32
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto/16 :goto_5

    .line 36
    .line 37
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 38
    .line 39
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object v7

    .line 43
    :cond_1
    iget-boolean v3, v0, La/db60;->m:Z

    .line 44
    .line 45
    iget-wide v5, v0, La/db60;->n:J

    .line 46
    .line 47
    iget-boolean v8, v0, La/db60;->l:Z

    .line 48
    .line 49
    iget v10, v0, La/db60;->j:I

    .line 50
    .line 51
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    move-wide/from16 v17, v5

    .line 55
    .line 56
    move-object/from16 v5, p1

    .line 57
    .line 58
    :goto_0
    move v13, v3

    .line 59
    move/from16 v16, v8

    .line 60
    .line 61
    move v15, v10

    .line 62
    goto/16 :goto_3

    .line 63
    .line 64
    :cond_2
    iget v3, v0, La/db60;->j:I

    .line 65
    .line 66
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move-object/from16 v6, p1

    .line 70
    .line 71
    :cond_3
    move v10, v3

    .line 72
    goto :goto_2

    .line 73
    :cond_4
    iget-boolean v8, v0, La/db60;->k:Z

    .line 74
    .line 75
    iget v3, v0, La/db60;->j:I

    .line 76
    .line 77
    iget-object v10, v0, La/db60;->i:La/rtu;

    .line 78
    .line 79
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    move-object/from16 v11, p1

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    iget-object v3, v9, La/qv2;->d:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v3, La/k7u;

    .line 91
    .line 92
    iget-object v3, v3, La/k7u;->a:La/uzc;

    .line 93
    .line 94
    invoke-virtual {v3}, La/uzc;->b()La/jvn;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-virtual {v3}, La/jvn;->getId()I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    iget-object v10, v9, La/qv2;->b:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v10, La/rtu;

    .line 105
    .line 106
    iget-object v11, v9, La/qv2;->c:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v11, La/ieu;

    .line 109
    .line 110
    iput-object v1, v0, La/db60;->p:Ljava/lang/Object;

    .line 111
    .line 112
    iput-object v10, v0, La/db60;->i:La/rtu;

    .line 113
    .line 114
    iput v3, v0, La/db60;->j:I

    .line 115
    .line 116
    iput-boolean v8, v0, La/db60;->k:Z

    .line 117
    .line 118
    iput-byte v8, v0, La/db60;->o:B

    .line 119
    .line 120
    invoke-virtual {v11, v0}, La/ieu;->i(La/yje;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v11

    .line 124
    if-ne v11, v2, :cond_6

    .line 125
    .line 126
    goto/16 :goto_4

    .line 127
    .line 128
    :cond_6
    :goto_1
    check-cast v11, La/elt;

    .line 129
    .line 130
    iget v11, v11, La/elt;->e:I

    .line 131
    .line 132
    iput-object v1, v0, La/db60;->p:Ljava/lang/Object;

    .line 133
    .line 134
    iput-object v7, v0, La/db60;->i:La/rtu;

    .line 135
    .line 136
    iput v3, v0, La/db60;->j:I

    .line 137
    .line 138
    iput-byte v6, v0, La/db60;->o:B

    .line 139
    .line 140
    invoke-virtual {v10, v8, v11, v0}, La/rtu;->a(ZILa/yje;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    if-ne v6, v2, :cond_3

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :goto_2
    check-cast v6, La/c3c0;

    .line 148
    .line 149
    iget-boolean v8, v6, La/c3c0;->b:Z

    .line 150
    .line 151
    iget-wide v11, v6, La/c3c0;->c:J

    .line 152
    .line 153
    iget-object v3, v9, La/qv2;->l:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v3, La/r9u;

    .line 156
    .line 157
    sget-object v6, La/ygp;->h:La/ygp;

    .line 158
    .line 159
    iget-object v3, v3, La/r9u;->a:La/j1q0;

    .line 160
    .line 161
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    iget-object v3, v3, La/j1q0;->a:La/m1q0;

    .line 165
    .line 166
    invoke-virtual {v3, v6}, La/m1q0;->d(La/ygp;)Z

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    iget-object v6, v9, La/qv2;->m:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v6, La/j9u;

    .line 173
    .line 174
    iget-object v6, v6, La/j9u;->a:La/m0o0;

    .line 175
    .line 176
    iget-object v6, v6, La/m0o0;->b:La/abp;

    .line 177
    .line 178
    iget-object v6, v6, La/abp;->e:La/p7m0;

    .line 179
    .line 180
    iput-object v1, v0, La/db60;->p:Ljava/lang/Object;

    .line 181
    .line 182
    iput v10, v0, La/db60;->j:I

    .line 183
    .line 184
    iput-boolean v8, v0, La/db60;->l:Z

    .line 185
    .line 186
    iput-wide v11, v0, La/db60;->n:J

    .line 187
    .line 188
    iput-boolean v3, v0, La/db60;->m:Z

    .line 189
    .line 190
    iput-byte v5, v0, La/db60;->o:B

    .line 191
    .line 192
    invoke-static {v6, v0}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    if-ne v5, v2, :cond_7

    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_7
    move-wide/from16 v17, v11

    .line 200
    .line 201
    goto/16 :goto_0

    .line 202
    .line 203
    :goto_3
    move-object v14, v5

    .line 204
    check-cast v14, Ljava/lang/String;

    .line 205
    .line 206
    iget-object v3, v9, La/qv2;->f:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v3, La/x4u;

    .line 209
    .line 210
    iget-object v11, v0, La/db60;->r:Ljava/util/List;

    .line 211
    .line 212
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    iget-object v3, v3, La/x4u;->a:Ljava/lang/Object;

    .line 219
    .line 220
    move-object v12, v3

    .line 221
    check-cast v12, La/wdu;

    .line 222
    .line 223
    new-instance v10, La/z600;

    .line 224
    .line 225
    const/16 v19, 0x0

    .line 226
    .line 227
    invoke-direct/range {v10 .. v19}, La/z600;-><init>(Ljava/util/List;La/wdu;ZLjava/lang/String;IZJLa/yje;)V

    .line 228
    .line 229
    .line 230
    move/from16 v8, v16

    .line 231
    .line 232
    move-wide/from16 v5, v17

    .line 233
    .line 234
    new-instance v3, La/vsg0;

    .line 235
    .line 236
    invoke-direct {v3, v10}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 237
    .line 238
    .line 239
    iput-object v7, v0, La/db60;->p:Ljava/lang/Object;

    .line 240
    .line 241
    iput-object v7, v0, La/db60;->i:La/rtu;

    .line 242
    .line 243
    iput v15, v0, La/db60;->j:I

    .line 244
    .line 245
    iput-boolean v8, v0, La/db60;->l:Z

    .line 246
    .line 247
    iput-wide v5, v0, La/db60;->n:J

    .line 248
    .line 249
    iput-boolean v13, v0, La/db60;->m:Z

    .line 250
    .line 251
    iput-byte v4, v0, La/db60;->o:B

    .line 252
    .line 253
    invoke-static {v1, v3, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    if-ne v0, v2, :cond_8

    .line 258
    .line 259
    :goto_4
    return-object v2

    .line 260
    :cond_8
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 261
    .line 262
    return-object v0
.end method
