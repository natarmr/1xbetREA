.class public final La/inp;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public i:La/ygs;

.field public j:Z

.field public final synthetic k:La/nnp;

.field public final synthetic l:J

.field public final synthetic m:Z

.field public final synthetic n:Ljava/util/List;

.field public final synthetic o:J

.field public final synthetic p:J

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:J


# direct methods
.method public constructor <init>(La/nnp;JZLjava/util/List;JJLjava/lang/String;JLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/inp;->k:La/nnp;

    .line 2
    .line 3
    iput-wide p2, p0, La/inp;->l:J

    .line 4
    .line 5
    iput-boolean p4, p0, La/inp;->m:Z

    .line 6
    .line 7
    iput-object p5, p0, La/inp;->n:Ljava/util/List;

    .line 8
    .line 9
    iput-wide p6, p0, La/inp;->o:J

    .line 10
    .line 11
    iput-wide p8, p0, La/inp;->p:J

    .line 12
    .line 13
    iput-object p10, p0, La/inp;->q:Ljava/lang/String;

    .line 14
    .line 15
    iput-wide p11, p0, La/inp;->r:J

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    invoke-direct {p0, p1, p13}, La/bnn0;-><init>(ILa/yje;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 14

    .line 1
    new-instance v0, La/inp;

    .line 2
    .line 3
    iget-object v10, p0, La/inp;->q:Ljava/lang/String;

    .line 4
    .line 5
    iget-wide v11, p0, La/inp;->r:J

    .line 6
    .line 7
    iget-object v1, p0, La/inp;->k:La/nnp;

    .line 8
    .line 9
    iget-wide v2, p0, La/inp;->l:J

    .line 10
    .line 11
    iget-boolean v4, p0, La/inp;->m:Z

    .line 12
    .line 13
    iget-object v5, p0, La/inp;->n:Ljava/util/List;

    .line 14
    .line 15
    iget-wide v6, p0, La/inp;->o:J

    .line 16
    .line 17
    iget-wide v8, p0, La/inp;->p:J

    .line 18
    .line 19
    move-object v13, p1

    .line 20
    invoke-direct/range {v0 .. v13}, La/inp;-><init>(La/nnp;JZLjava/util/List;JJLjava/lang/String;JLa/yje;)V

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
    invoke-virtual {p0, p1}, La/inp;->create(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/inp;

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/inp;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, La/inp;->k:La/nnp;

    .line 2
    .line 3
    iget-object v8, v0, La/nnp;->C:La/i1w0;

    .line 4
    .line 5
    sget-object v9, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-boolean v1, p0, La/inp;->j:Z

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v10, 0x1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    if-ne v1, v10, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, La/inp;->i:La/ygs;

    .line 16
    .line 17
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    move-object v2, v1

    .line 21
    goto/16 :goto_3

    .line 22
    .line 23
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-object v2

    .line 29
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, v0, La/nnp;->M:La/luu;

    .line 33
    .line 34
    iget-object p1, p1, La/luu;->a:La/nok0;

    .line 35
    .line 36
    invoke-virtual {p1}, La/nok0;->a()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    new-instance v1, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_5

    .line 54
    .line 55
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    move-object v4, v3

    .line 60
    check-cast v4, La/lok0;

    .line 61
    .line 62
    iget-object v4, v4, La/lok0;->t:Ljava/util/List;

    .line 63
    .line 64
    if-eqz v4, :cond_3

    .line 65
    .line 66
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-eqz v5, :cond_3

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    if-eqz v5, :cond_2

    .line 82
    .line 83
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    check-cast v5, Ljava/lang/Number;

    .line 88
    .line 89
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-ne v5, v10, :cond_4

    .line 94
    .line 95
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-eqz v1, :cond_7

    .line 108
    .line 109
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    move-object v3, v1

    .line 114
    check-cast v3, La/lok0;

    .line 115
    .line 116
    iget v3, v3, La/lok0;->a:I

    .line 117
    .line 118
    iget-wide v4, p0, La/inp;->r:J

    .line 119
    .line 120
    long-to-int v4, v4

    .line 121
    if-ne v3, v4, :cond_6

    .line 122
    .line 123
    move-object v2, v1

    .line 124
    :cond_7
    check-cast v2, La/lok0;

    .line 125
    .line 126
    if-eqz v2, :cond_a

    .line 127
    .line 128
    iget-object p1, v0, La/nnp;->N:La/y3v;

    .line 129
    .line 130
    iget v1, v2, La/lok0;->a:I

    .line 131
    .line 132
    iget-object v3, v2, La/lok0;->b:Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {p1, v1, v3}, La/y3v;->h(ILjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    iget-wide v3, v2, La/lok0;->f:J

    .line 139
    .line 140
    iget-wide v5, v2, La/lok0;->g:J

    .line 141
    .line 142
    iget-boolean v7, p0, La/inp;->m:Z

    .line 143
    .line 144
    iget-wide v1, p0, La/inp;->l:J

    .line 145
    .line 146
    invoke-virtual/range {v0 .. v7}, La/nnp;->R(JJJZ)V

    .line 147
    .line 148
    .line 149
    invoke-static {v8}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    instance-of v0, p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 154
    .line 155
    if-eqz v0, :cond_8

    .line 156
    .line 157
    new-instance v0, La/e1w0;

    .line 158
    .line 159
    check-cast p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 160
    .line 161
    invoke-direct {v0, p1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 162
    .line 163
    .line 164
    new-instance p1, La/c8d;

    .line 165
    .line 166
    sget-object v1, La/y7d;->a:La/v7d;

    .line 167
    .line 168
    invoke-direct {p1, v1, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    goto :goto_1

    .line 175
    :cond_8
    new-instance v0, La/w0w0;

    .line 176
    .line 177
    invoke-direct {v0, p1}, La/w0w0;-><init>(La/m7h0;)V

    .line 178
    .line 179
    .line 180
    new-instance p1, La/c8d;

    .line 181
    .line 182
    sget-object v1, La/y7d;->a:La/v7d;

    .line 183
    .line 184
    invoke-direct {p1, v1, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    :goto_1
    const/4 p1, 0x0

    .line 191
    invoke-static {v8, p0, p1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    :goto_2
    move-object p1, p0

    .line 196
    check-cast p1, La/paw;

    .line 197
    .line 198
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-eqz v0, :cond_9

    .line 203
    .line 204
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    check-cast p1, La/oe50;

    .line 209
    .line 210
    invoke-virtual {v8, p1}, La/i1w0;->a(La/oe50;)V

    .line 211
    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 215
    .line 216
    return-object p0

    .line 217
    :cond_a
    iget-object p1, p0, La/inp;->n:Ljava/util/List;

    .line 218
    .line 219
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    if-ne v1, v10, :cond_c

    .line 224
    .line 225
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    check-cast p1, La/ygs;

    .line 230
    .line 231
    iget-wide v3, p1, La/ygs;->d:J

    .line 232
    .line 233
    iget-wide v5, p1, La/ygs;->B:J

    .line 234
    .line 235
    iget-boolean v7, p1, La/ygs;->c:Z

    .line 236
    .line 237
    iget-wide v1, p0, La/inp;->l:J

    .line 238
    .line 239
    invoke-virtual/range {v0 .. v7}, La/nnp;->R(JJJZ)V

    .line 240
    .line 241
    .line 242
    iget-object v1, v0, La/nnp;->R:La/h3c;

    .line 243
    .line 244
    iget-wide v2, p1, La/ygs;->d:J

    .line 245
    .line 246
    iput-object p1, p0, La/inp;->i:La/ygs;

    .line 247
    .line 248
    iput-boolean v10, p0, La/inp;->j:Z

    .line 249
    .line 250
    invoke-virtual {v1, v2, v3, p0}, La/h3c;->b(JLa/yje;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    if-ne v1, v9, :cond_b

    .line 255
    .line 256
    return-object v9

    .line 257
    :cond_b
    move-object v2, p1

    .line 258
    move-object p1, v1

    .line 259
    :goto_3
    check-cast p1, Ljava/lang/Boolean;

    .line 260
    .line 261
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 262
    .line 263
    .line 264
    move-result v5

    .line 265
    iget-object p1, v0, La/nnp;->C:La/i1w0;

    .line 266
    .line 267
    move-object v1, v0

    .line 268
    new-instance v0, La/q71;

    .line 269
    .line 270
    iget-wide v3, p0, La/inp;->r:J

    .line 271
    .line 272
    invoke-direct/range {v0 .. v5}, La/q71;-><init>(La/nnp;La/ygs;JZ)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {p1, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 276
    .line 277
    .line 278
    goto :goto_4

    .line 279
    :cond_c
    iget-wide v5, p0, La/inp;->p:J

    .line 280
    .line 281
    iget-boolean v7, p0, La/inp;->m:Z

    .line 282
    .line 283
    iget-wide v1, p0, La/inp;->l:J

    .line 284
    .line 285
    iget-wide v3, p0, La/inp;->o:J

    .line 286
    .line 287
    invoke-virtual/range {v0 .. v7}, La/nnp;->R(JJJZ)V

    .line 288
    .line 289
    .line 290
    new-instance p1, Ljava/lang/Long;

    .line 291
    .line 292
    iget-wide v1, p0, La/inp;->l:J

    .line 293
    .line 294
    invoke-direct {p1, v1, v2}, Ljava/lang/Long;-><init>(J)V

    .line 295
    .line 296
    .line 297
    invoke-static {p1}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    move-object v1, v0

    .line 302
    new-instance v0, La/as0;

    .line 303
    .line 304
    const/4 v6, 0x5

    .line 305
    iget-object v2, p0, La/inp;->q:Ljava/lang/String;

    .line 306
    .line 307
    iget-wide v4, p0, La/inp;->o:J

    .line 308
    .line 309
    invoke-direct/range {v0 .. v6}, La/as0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JB)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v8, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 313
    .line 314
    .line 315
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 316
    .line 317
    return-object p0
.end method
