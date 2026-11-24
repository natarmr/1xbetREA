.class public final La/g1f;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:Ljava/util/List;

.field public final synthetic k:Ljava/lang/Integer;

.field public final synthetic l:La/g45;

.field public final synthetic m:J

.field public final synthetic n:J

.field public final synthetic o:I

.field public final synthetic p:I

.field public final synthetic q:B

.field public final synthetic r:Z


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/Integer;La/g45;JJIIIZLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/g1f;->j:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, La/g1f;->k:Ljava/lang/Integer;

    .line 4
    .line 5
    iput-object p3, p0, La/g1f;->l:La/g45;

    .line 6
    .line 7
    iput-wide p4, p0, La/g1f;->m:J

    .line 8
    .line 9
    iput-wide p6, p0, La/g1f;->n:J

    .line 10
    .line 11
    iput p8, p0, La/g1f;->o:I

    .line 12
    .line 13
    iput p9, p0, La/g1f;->p:I

    .line 14
    .line 15
    iput-byte p10, p0, La/g1f;->q:B

    .line 16
    .line 17
    iput-boolean p11, p0, La/g1f;->r:Z

    .line 18
    .line 19
    const/4 p1, 0x2

    .line 20
    invoke-direct {p0, p1, p12}, La/bnn0;-><init>(ILa/yje;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 13

    .line 1
    new-instance v0, La/g1f;

    .line 2
    .line 3
    iget-byte v10, p0, La/g1f;->q:B

    .line 4
    .line 5
    iget-boolean v11, p0, La/g1f;->r:Z

    .line 6
    .line 7
    iget-object v1, p0, La/g1f;->j:Ljava/util/List;

    .line 8
    .line 9
    iget-object v2, p0, La/g1f;->k:Ljava/lang/Integer;

    .line 10
    .line 11
    iget-object v3, p0, La/g1f;->l:La/g45;

    .line 12
    .line 13
    iget-wide v4, p0, La/g1f;->m:J

    .line 14
    .line 15
    iget-wide v6, p0, La/g1f;->n:J

    .line 16
    .line 17
    iget v8, p0, La/g1f;->o:I

    .line 18
    .line 19
    iget v9, p0, La/g1f;->p:I

    .line 20
    .line 21
    move-object v12, p2

    .line 22
    invoke-direct/range {v0 .. v12}, La/g1f;-><init>(Ljava/util/List;Ljava/lang/Integer;La/g45;JJIIIZLa/yje;)V

    .line 23
    .line 24
    .line 25
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
    invoke-virtual {p0, p1, p2}, La/g1f;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/g1f;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/g1f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/g1f;->l:La/g45;

    .line 4
    .line 5
    iget-object v2, v1, La/g45;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, La/knf0;

    .line 8
    .line 9
    sget-object v3, La/wne;->a:La/wne;

    .line 10
    .line 11
    iget-boolean v4, v0, La/g1f;->i:Z

    .line 12
    .line 13
    const/4 v5, 0x1

    .line 14
    const/16 v6, 0xa

    .line 15
    .line 16
    if-eqz v4, :cond_1

    .line 17
    .line 18
    if-ne v4, v5, :cond_0

    .line 19
    .line 20
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    move-object/from16 v2, p1

    .line 24
    .line 25
    goto/16 :goto_4

    .line 26
    .line 27
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    return-object v0

    .line 34
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    new-instance v4, Ljava/util/ArrayList;

    .line 38
    .line 39
    iget-object v7, v0, La/g1f;->j:Ljava/util/List;

    .line 40
    .line 41
    invoke-static {v7, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 42
    .line 43
    .line 44
    move-result v8

    .line 45
    invoke-direct {v4, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    if-eqz v8, :cond_2

    .line 57
    .line 58
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    check-cast v8, La/qu6;

    .line 63
    .line 64
    invoke-static {v8}, La/wha0;->Y(La/qu6;)La/ru6;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    sget-object v7, La/iun;->a:La/iun;

    .line 73
    .line 74
    iget-object v8, v0, La/g1f;->k:Ljava/lang/Integer;

    .line 75
    .line 76
    if-eqz v8, :cond_3

    .line 77
    .line 78
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    :goto_1
    move/from16 v29, v8

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_3
    invoke-virtual {v2}, La/knf0;->b()I

    .line 86
    .line 87
    .line 88
    move-result v8

    .line 89
    goto :goto_1

    .line 90
    :goto_2
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, La/knf0;->a()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v14

    .line 97
    invoke-virtual {v2}, La/knf0;->c()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v18

    .line 101
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    new-instance v2, Ljava/util/ArrayList;

    .line 111
    .line 112
    invoke-static {v4, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    invoke-direct {v2, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    iget-wide v8, v0, La/g1f;->m:J

    .line 128
    .line 129
    iget-wide v10, v0, La/g1f;->n:J

    .line 130
    .line 131
    if-eqz v7, :cond_4

    .line 132
    .line 133
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    check-cast v7, La/ru6;

    .line 138
    .line 139
    move-wide v12, v10

    .line 140
    move-wide v10, v8

    .line 141
    new-instance v9, La/iit0;

    .line 142
    .line 143
    invoke-static {v7}, La/ro4;->i0(La/ru6;)La/edy;

    .line 144
    .line 145
    .line 146
    move-result-object v7

    .line 147
    invoke-static {v7}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 148
    .line 149
    .line 150
    move-result-object v19

    .line 151
    sget-object v25, La/iun;->a:La/iun;

    .line 152
    .line 153
    const/16 v28, 0x0

    .line 154
    .line 155
    iget v15, v0, La/g1f;->o:I

    .line 156
    .line 157
    const-wide/16 v16, 0x0

    .line 158
    .line 159
    iget v7, v0, La/g1f;->p:I

    .line 160
    .line 161
    const-string v21, "0"

    .line 162
    .line 163
    const-string v22, ""

    .line 164
    .line 165
    const/16 v23, 0x0

    .line 166
    .line 167
    const/16 v24, 0x0

    .line 168
    .line 169
    const/16 v26, 0x0

    .line 170
    .line 171
    const/16 v27, 0x0

    .line 172
    .line 173
    iget-byte v8, v0, La/g1f;->q:B

    .line 174
    .line 175
    move/from16 v20, v7

    .line 176
    .line 177
    move/from16 v30, v8

    .line 178
    .line 179
    invoke-direct/range {v9 .. v30}, La/iit0;-><init>(JJLjava/lang/String;IJLjava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZZLjava/util/List;ZZZII)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_4
    move-wide v12, v10

    .line 187
    move-wide v10, v8

    .line 188
    new-instance v7, La/fit0;

    .line 189
    .line 190
    move-wide v10, v12

    .line 191
    move-object v12, v2

    .line 192
    invoke-direct/range {v7 .. v12}, La/fit0;-><init>(JJLjava/util/ArrayList;)V

    .line 193
    .line 194
    .line 195
    iget-object v2, v1, La/g45;->d:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v2, La/ehf0;

    .line 198
    .line 199
    iput-boolean v5, v0, La/g1f;->i:Z

    .line 200
    .line 201
    iget-object v2, v2, La/ehf0;->c:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v2, La/jwd;

    .line 204
    .line 205
    invoke-virtual {v2}, La/jwd;->invoke()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    check-cast v2, La/vre;

    .line 210
    .line 211
    invoke-interface {v2, v7, v0}, La/vre;->d(La/fit0;La/yje;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    if-ne v2, v3, :cond_5

    .line 216
    .line 217
    return-object v3

    .line 218
    :cond_5
    :goto_4
    check-cast v2, La/q16;

    .line 219
    .line 220
    invoke-virtual {v2}, La/q16;->a()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    check-cast v2, Ljava/util/List;

    .line 225
    .line 226
    new-instance v3, Ljava/util/ArrayList;

    .line 227
    .line 228
    invoke-static {v2, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 233
    .line 234
    .line 235
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 240
    .line 241
    .line 242
    move-result v4

    .line 243
    if-eqz v4, :cond_6

    .line 244
    .line 245
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    check-cast v4, La/oit0;

    .line 250
    .line 251
    iget-object v5, v1, La/g45;->c:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v5, La/ave;

    .line 254
    .line 255
    iget-object v5, v5, La/ave;->a:La/q4f;

    .line 256
    .line 257
    iget-boolean v6, v0, La/g1f;->r:Z

    .line 258
    .line 259
    invoke-static {v4, v6, v5}, La/xnm0;->m(La/oit0;ZLa/q4f;)La/cit0;

    .line 260
    .line 261
    .line 262
    move-result-object v4

    .line 263
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    goto :goto_5

    .line 267
    :cond_6
    return-object v3
.end method
