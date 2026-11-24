.class public final La/unu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/wdu;

.field public j:Ljava/util/Collection;

.field public k:Ljava/util/Iterator;

.field public l:Ljava/lang/String;

.field public m:Ljava/util/Collection;

.field public n:I

.field public o:Z

.field public p:J

.field public q:B

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:La/wdu;

.field public final synthetic t:Z


# direct methods
.method public constructor <init>(La/yje;La/wdu;Z)V
    .locals 0

    .line 1
    iput-object p2, p0, La/unu;->s:La/wdu;

    .line 2
    .line 3
    iput-boolean p3, p0, La/unu;->t:Z

    .line 4
    .line 5
    const/4 p2, 0x2

    .line 6
    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    new-instance v0, La/unu;

    .line 2
    .line 3
    iget-object v1, p0, La/unu;->s:La/wdu;

    .line 4
    .line 5
    iget-boolean p0, p0, La/unu;->t:Z

    .line 6
    .line 7
    invoke-direct {v0, p2, v1, p0}, La/unu;-><init>(La/yje;La/wdu;Z)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, La/unu;->r:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/unu;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/unu;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/unu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    move-object/from16 v4, p0

    .line 2
    .line 3
    iget-object v0, v4, La/unu;->r:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v6, v0

    .line 6
    check-cast v6, La/kmq;

    .line 7
    .line 8
    sget-object v7, La/wne;->a:La/wne;

    .line 9
    .line 10
    iget-byte v0, v4, La/unu;->q:B

    .line 11
    .line 12
    iget-object v1, v4, La/unu;->s:La/wdu;

    .line 13
    .line 14
    const/4 v8, 0x3

    .line 15
    const/4 v9, 0x2

    .line 16
    const/4 v2, 0x1

    .line 17
    const/4 v10, 0x0

    .line 18
    if-eqz v0, :cond_3

    .line 19
    .line 20
    if-eq v0, v2, :cond_2

    .line 21
    .line 22
    if-eq v0, v9, :cond_1

    .line 23
    .line 24
    if-ne v0, v8, :cond_0

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
    return-object v10

    .line 37
    :cond_1
    iget-wide v0, v4, La/unu;->p:J

    .line 38
    .line 39
    iget-boolean v2, v4, La/unu;->o:Z

    .line 40
    .line 41
    iget v3, v4, La/unu;->n:I

    .line 42
    .line 43
    iget-object v5, v4, La/unu;->m:Ljava/util/Collection;

    .line 44
    .line 45
    check-cast v5, Ljava/util/Collection;

    .line 46
    .line 47
    iget-object v11, v4, La/unu;->l:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v12, v4, La/unu;->k:Ljava/util/Iterator;

    .line 50
    .line 51
    iget-object v13, v4, La/unu;->j:Ljava/util/Collection;

    .line 52
    .line 53
    check-cast v13, Ljava/util/Collection;

    .line 54
    .line 55
    iget-object v14, v4, La/unu;->i:La/wdu;

    .line 56
    .line 57
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    move-wide v15, v0

    .line 61
    move v1, v3

    .line 62
    move-object/from16 v17, v11

    .line 63
    .line 64
    move-object v11, v13

    .line 65
    move-object v0, v14

    .line 66
    move-object/from16 v13, p1

    .line 67
    .line 68
    goto/16 :goto_3

    .line 69
    .line 70
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    move-object/from16 v0, p1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, v1, La/wdu;->b:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, La/hsj;

    .line 82
    .line 83
    const/4 v3, 0x0

    .line 84
    new-array v3, v3, [La/z7b;

    .line 85
    .line 86
    iput-object v6, v4, La/unu;->r:Ljava/lang/Object;

    .line 87
    .line 88
    iput-byte v2, v4, La/unu;->q:B

    .line 89
    .line 90
    invoke-virtual {v0, v3, v4}, La/hsj;->r([La/z7b;La/zje;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    if-ne v0, v7, :cond_4

    .line 95
    .line 96
    goto/16 :goto_5

    .line 97
    .line 98
    :cond_4
    :goto_0
    check-cast v0, La/a3b;

    .line 99
    .line 100
    iget-object v0, v0, La/a3b;->a:Ljava/util/ArrayList;

    .line 101
    .line 102
    new-instance v2, Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    :cond_5
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    if-eqz v3, :cond_6

    .line 116
    .line 117
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    move-object v5, v3

    .line 122
    check-cast v5, La/vh0;

    .line 123
    .line 124
    iget-wide v11, v5, La/vh0;->f:J

    .line 125
    .line 126
    const-wide/16 v13, 0x3

    .line 127
    .line 128
    cmp-long v5, v11, v13

    .line 129
    .line 130
    if-eqz v5, :cond_5

    .line 131
    .line 132
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_6
    new-instance v0, Ljava/util/ArrayList;

    .line 137
    .line 138
    const/16 v3, 0xa

    .line 139
    .line 140
    invoke-static {v2, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    const/16 v3, 0x8

    .line 152
    .line 153
    iget-boolean v5, v4, La/unu;->t:Z

    .line 154
    .line 155
    move-object v11, v0

    .line 156
    move-object v0, v1

    .line 157
    move-object v12, v2

    .line 158
    move v1, v3

    .line 159
    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    if-eqz v2, :cond_8

    .line 164
    .line 165
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    check-cast v2, La/vh0;

    .line 170
    .line 171
    iget-wide v13, v2, La/vh0;->a:J

    .line 172
    .line 173
    iget-object v15, v2, La/vh0;->b:Ljava/lang/String;

    .line 174
    .line 175
    iput-object v6, v4, La/unu;->r:Ljava/lang/Object;

    .line 176
    .line 177
    iput-object v0, v4, La/unu;->i:La/wdu;

    .line 178
    .line 179
    move-object v2, v11

    .line 180
    check-cast v2, Ljava/util/Collection;

    .line 181
    .line 182
    iput-object v2, v4, La/unu;->j:Ljava/util/Collection;

    .line 183
    .line 184
    iput-object v12, v4, La/unu;->k:Ljava/util/Iterator;

    .line 185
    .line 186
    iput-object v15, v4, La/unu;->l:Ljava/lang/String;

    .line 187
    .line 188
    iput-object v2, v4, La/unu;->m:Ljava/util/Collection;

    .line 189
    .line 190
    iput v1, v4, La/unu;->n:I

    .line 191
    .line 192
    iput-boolean v5, v4, La/unu;->o:Z

    .line 193
    .line 194
    iput-wide v13, v4, La/unu;->p:J

    .line 195
    .line 196
    iput-byte v9, v4, La/unu;->q:B

    .line 197
    .line 198
    move-wide v2, v13

    .line 199
    invoke-virtual/range {v0 .. v5}, La/wdu;->n(IJLa/zje;Z)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v13

    .line 203
    if-ne v13, v7, :cond_7

    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_7
    move-object/from16 v17, v15

    .line 207
    .line 208
    move-wide v15, v2

    .line 209
    move v2, v5

    .line 210
    move-object v5, v11

    .line 211
    :goto_3
    move-object/from16 v18, v13

    .line 212
    .line 213
    check-cast v18, Ljava/util/List;

    .line 214
    .line 215
    sget-object v20, La/iun;->a:La/iun;

    .line 216
    .line 217
    sget-object v19, La/fza0;->c:La/fza0;

    .line 218
    .line 219
    new-instance v14, La/gza0;

    .line 220
    .line 221
    const/16 v21, 0x0

    .line 222
    .line 223
    invoke-direct/range {v14 .. v21}, La/gza0;-><init>(JLjava/lang/String;Ljava/util/List;La/fza0;Ljava/util/List;Z)V

    .line 224
    .line 225
    .line 226
    invoke-interface {v5, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move v5, v2

    .line 230
    goto :goto_2

    .line 231
    :cond_8
    check-cast v11, Ljava/util/List;

    .line 232
    .line 233
    new-instance v0, Ljava/util/ArrayList;

    .line 234
    .line 235
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 236
    .line 237
    .line 238
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    :cond_9
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    if-eqz v2, :cond_a

    .line 247
    .line 248
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    move-object v3, v2

    .line 253
    check-cast v3, La/gza0;

    .line 254
    .line 255
    iget-object v3, v3, La/gza0;->c:Ljava/util/List;

    .line 256
    .line 257
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 258
    .line 259
    .line 260
    move-result v3

    .line 261
    if-nez v3, :cond_9

    .line 262
    .line 263
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    goto :goto_4

    .line 267
    :cond_a
    iput-object v10, v4, La/unu;->r:Ljava/lang/Object;

    .line 268
    .line 269
    iput-object v10, v4, La/unu;->i:La/wdu;

    .line 270
    .line 271
    iput-object v10, v4, La/unu;->j:Ljava/util/Collection;

    .line 272
    .line 273
    iput-object v10, v4, La/unu;->k:Ljava/util/Iterator;

    .line 274
    .line 275
    iput-object v10, v4, La/unu;->l:Ljava/lang/String;

    .line 276
    .line 277
    iput-object v10, v4, La/unu;->m:Ljava/util/Collection;

    .line 278
    .line 279
    iput-byte v8, v4, La/unu;->q:B

    .line 280
    .line 281
    invoke-interface {v6, v0, v4}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    if-ne v0, v7, :cond_b

    .line 286
    .line 287
    :goto_5
    return-object v7

    .line 288
    :cond_b
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 289
    .line 290
    return-object v0
.end method
