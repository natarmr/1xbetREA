.class public final La/wa60;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/rtu;

.field public j:I

.field public k:Z

.field public l:Z

.field public m:J

.field public n:J

.field public o:J

.field public p:B

.field public synthetic q:Ljava/lang/Object;

.field public final synthetic r:La/nc0;

.field public final synthetic s:Ljava/util/List;


# direct methods
.method public constructor <init>(La/nc0;Ljava/util/List;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/wa60;->r:La/nc0;

    .line 2
    .line 3
    iput-object p2, p0, La/wa60;->s:Ljava/util/List;

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
    new-instance v0, La/wa60;

    .line 2
    .line 3
    iget-object v1, p0, La/wa60;->r:La/nc0;

    .line 4
    .line 5
    iget-object p0, p0, La/wa60;->s:Ljava/util/List;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p2}, La/wa60;-><init>(La/nc0;Ljava/util/List;La/yje;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, La/wa60;->q:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/wa60;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/wa60;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/wa60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-object v1, v0, La/wa60;->q:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/kmq;

    .line 6
    .line 7
    sget-object v2, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-byte v3, v0, La/wa60;->p:B

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
    iget-object v9, v0, La/wa60;->r:La/nc0;

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
    iget-object v0, v0, La/wa60;->i:La/rtu;

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
    iget-boolean v3, v0, La/wa60;->l:Z

    .line 44
    .line 45
    iget-wide v5, v0, La/wa60;->o:J

    .line 46
    .line 47
    iget-wide v10, v0, La/wa60;->n:J

    .line 48
    .line 49
    iget-wide v12, v0, La/wa60;->m:J

    .line 50
    .line 51
    iget-boolean v8, v0, La/wa60;->k:Z

    .line 52
    .line 53
    iget v14, v0, La/wa60;->j:I

    .line 54
    .line 55
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    move-wide/from16 v19, v5

    .line 59
    .line 60
    move-object/from16 v6, p1

    .line 61
    .line 62
    :goto_0
    move/from16 v16, v8

    .line 63
    .line 64
    move-wide/from16 v17, v12

    .line 65
    .line 66
    move v15, v14

    .line 67
    move v13, v3

    .line 68
    move-wide v3, v10

    .line 69
    goto/16 :goto_3

    .line 70
    .line 71
    :cond_2
    iget v3, v0, La/wa60;->j:I

    .line 72
    .line 73
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    move-object/from16 v6, p1

    .line 77
    .line 78
    :cond_3
    move v14, v3

    .line 79
    goto :goto_2

    .line 80
    :cond_4
    iget v3, v0, La/wa60;->j:I

    .line 81
    .line 82
    iget-object v8, v0, La/wa60;->i:La/rtu;

    .line 83
    .line 84
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    move-object v10, v8

    .line 88
    move-object/from16 v8, p1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    iget-object v3, v9, La/nc0;->f:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v3, La/k7u;

    .line 97
    .line 98
    iget-object v3, v3, La/k7u;->a:La/uzc;

    .line 99
    .line 100
    invoke-virtual {v3}, La/uzc;->b()La/jvn;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-virtual {v3}, La/jvn;->getId()I

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    iget-object v10, v9, La/nc0;->d:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v10, La/rtu;

    .line 111
    .line 112
    iget-object v11, v9, La/nc0;->e:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v11, La/ieu;

    .line 115
    .line 116
    iput-object v1, v0, La/wa60;->q:Ljava/lang/Object;

    .line 117
    .line 118
    iput-object v10, v0, La/wa60;->i:La/rtu;

    .line 119
    .line 120
    iput v3, v0, La/wa60;->j:I

    .line 121
    .line 122
    iput-byte v8, v0, La/wa60;->p:B

    .line 123
    .line 124
    invoke-virtual {v11, v0}, La/ieu;->i(La/yje;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    if-ne v8, v2, :cond_6

    .line 129
    .line 130
    goto/16 :goto_4

    .line 131
    .line 132
    :cond_6
    :goto_1
    check-cast v8, La/elt;

    .line 133
    .line 134
    iget v8, v8, La/elt;->e:I

    .line 135
    .line 136
    iput-object v1, v0, La/wa60;->q:Ljava/lang/Object;

    .line 137
    .line 138
    iput-object v7, v0, La/wa60;->i:La/rtu;

    .line 139
    .line 140
    iput v3, v0, La/wa60;->j:I

    .line 141
    .line 142
    iput-byte v6, v0, La/wa60;->p:B

    .line 143
    .line 144
    const/4 v6, 0x0

    .line 145
    invoke-virtual {v10, v6, v8, v0}, La/rtu;->a(ZILa/yje;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    if-ne v6, v2, :cond_3

    .line 150
    .line 151
    goto/16 :goto_4

    .line 152
    .line 153
    :goto_2
    check-cast v6, La/c3c0;

    .line 154
    .line 155
    iget-boolean v8, v6, La/c3c0;->b:Z

    .line 156
    .line 157
    iget-wide v12, v6, La/c3c0;->c:J

    .line 158
    .line 159
    iget-object v3, v9, La/nc0;->c:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v3, La/viu;

    .line 162
    .line 163
    invoke-virtual {v3}, La/viu;->a()J

    .line 164
    .line 165
    .line 166
    move-result-wide v10

    .line 167
    invoke-static {v10, v11}, La/ynq0;->f(J)J

    .line 168
    .line 169
    .line 170
    move-result-wide v4

    .line 171
    iget-object v15, v9, La/nc0;->l:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v15, La/r9u;

    .line 174
    .line 175
    sget-object v3, La/ygp;->h:La/ygp;

    .line 176
    .line 177
    iget-object v15, v15, La/r9u;->a:La/j1q0;

    .line 178
    .line 179
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    iget-object v15, v15, La/j1q0;->a:La/m1q0;

    .line 183
    .line 184
    invoke-virtual {v15, v3}, La/m1q0;->d(La/ygp;)Z

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    iget-object v15, v9, La/nc0;->m:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v15, La/j9u;

    .line 191
    .line 192
    iget-object v15, v15, La/j9u;->a:La/m0o0;

    .line 193
    .line 194
    iget-object v15, v15, La/m0o0;->b:La/abp;

    .line 195
    .line 196
    iget-object v15, v15, La/abp;->e:La/p7m0;

    .line 197
    .line 198
    iput-object v1, v0, La/wa60;->q:Ljava/lang/Object;

    .line 199
    .line 200
    iput v14, v0, La/wa60;->j:I

    .line 201
    .line 202
    iput-boolean v8, v0, La/wa60;->k:Z

    .line 203
    .line 204
    iput-wide v12, v0, La/wa60;->m:J

    .line 205
    .line 206
    iput-wide v10, v0, La/wa60;->n:J

    .line 207
    .line 208
    iput-wide v4, v0, La/wa60;->o:J

    .line 209
    .line 210
    iput-boolean v3, v0, La/wa60;->l:Z

    .line 211
    .line 212
    const/4 v6, 0x3

    .line 213
    iput-byte v6, v0, La/wa60;->p:B

    .line 214
    .line 215
    invoke-static {v15, v0}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v6

    .line 219
    if-ne v6, v2, :cond_7

    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_7
    move-wide/from16 v19, v4

    .line 223
    .line 224
    goto/16 :goto_0

    .line 225
    .line 226
    :goto_3
    move-object v14, v6

    .line 227
    check-cast v14, Ljava/lang/String;

    .line 228
    .line 229
    iget-object v5, v9, La/nc0;->a:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v5, La/n4u;

    .line 232
    .line 233
    iget-object v11, v0, La/wa60;->s:Ljava/util/List;

    .line 234
    .line 235
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    iget-object v5, v5, La/n4u;->b:Ljava/lang/Object;

    .line 242
    .line 243
    move-object v12, v5

    .line 244
    check-cast v12, La/wdu;

    .line 245
    .line 246
    new-instance v10, La/x600;

    .line 247
    .line 248
    const/16 v21, 0x0

    .line 249
    .line 250
    invoke-direct/range {v10 .. v21}, La/x600;-><init>(Ljava/util/List;La/wdu;ZLjava/lang/String;IZJJLa/yje;)V

    .line 251
    .line 252
    .line 253
    move v9, v13

    .line 254
    move/from16 v8, v16

    .line 255
    .line 256
    move-wide/from16 v12, v17

    .line 257
    .line 258
    move-wide/from16 v5, v19

    .line 259
    .line 260
    new-instance v11, La/vsg0;

    .line 261
    .line 262
    invoke-direct {v11, v10}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 263
    .line 264
    .line 265
    iput-object v7, v0, La/wa60;->q:Ljava/lang/Object;

    .line 266
    .line 267
    iput-object v7, v0, La/wa60;->i:La/rtu;

    .line 268
    .line 269
    iput v15, v0, La/wa60;->j:I

    .line 270
    .line 271
    iput-boolean v8, v0, La/wa60;->k:Z

    .line 272
    .line 273
    iput-wide v12, v0, La/wa60;->m:J

    .line 274
    .line 275
    iput-wide v3, v0, La/wa60;->n:J

    .line 276
    .line 277
    iput-wide v5, v0, La/wa60;->o:J

    .line 278
    .line 279
    iput-boolean v9, v0, La/wa60;->l:Z

    .line 280
    .line 281
    const/4 v3, 0x4

    .line 282
    iput-byte v3, v0, La/wa60;->p:B

    .line 283
    .line 284
    invoke-static {v1, v11, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    if-ne v0, v2, :cond_8

    .line 289
    .line 290
    :goto_4
    return-object v2

    .line 291
    :cond_8
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 292
    .line 293
    return-object v0
.end method
