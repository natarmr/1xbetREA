.class public final La/imi0;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/i1w0;

.field public final c:La/art;

.field public final d:La/yfu;

.field public final e:La/f5a;

.field public final f:La/ctf0;

.field public g:La/nki0;

.field public h:La/nki0;

.field public final i:Ljava/util/ArrayList;

.field public final j:La/ra10;

.field public final k:La/ra10;

.field public final l:La/p7m0;

.field public final m:La/p7m0;

.field public final n:La/ol60;


# direct methods
.method public constructor <init>(La/i1w0;La/art;La/yfu;La/f5a;La/ctf0;La/sa10;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, La/w46;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/imi0;->b:La/i1w0;

    .line 11
    .line 12
    iput-object p2, p0, La/imi0;->c:La/art;

    .line 13
    .line 14
    iput-object p3, p0, La/imi0;->d:La/yfu;

    .line 15
    .line 16
    iput-object p4, p0, La/imi0;->e:La/f5a;

    .line 17
    .line 18
    iput-object p5, p0, La/imi0;->f:La/ctf0;

    .line 19
    .line 20
    sget-object v0, La/nki0;->A:La/nki0;

    .line 21
    .line 22
    iput-object v0, p0, La/imi0;->g:La/nki0;

    .line 23
    .line 24
    iput-object v0, p0, La/imi0;->h:La/nki0;

    .line 25
    .line 26
    new-instance v8, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v8, p0, La/imi0;->i:Ljava/util/ArrayList;

    .line 32
    .line 33
    sget-object v9, La/pb10;->g:La/pb10;

    .line 34
    .line 35
    new-instance v0, La/lph0;

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    const/4 v7, 0x4

    .line 39
    const/4 v1, 0x0

    .line 40
    const-class v3, La/imi0;

    .line 41
    .line 42
    const-string v4, "initCurrentLimit"

    .line 43
    .line 44
    const-string v5, "initCurrentLimit()V"

    .line 45
    .line 46
    move-object v2, p0

    .line 47
    invoke-direct/range {v0 .. v7}, La/lph0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 48
    .line 49
    .line 50
    move-object v7, v3

    .line 51
    const/16 v5, 0x10

    .line 52
    .line 53
    const v2, 0x7f130674

    .line 54
    .line 55
    .line 56
    const v3, 0x7f131111

    .line 57
    .line 58
    .line 59
    move-object v4, v0

    .line 60
    move-object v1, v9

    .line 61
    move-object/from16 v0, p6

    .line 62
    .line 63
    invoke-static/range {v0 .. v5}, La/sa10;->b(La/sa10;La/pb10;IILkotlin/jvm/functions/Function0;I)La/ra10;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    iput-object v2, p0, La/imi0;->j:La/ra10;

    .line 68
    .line 69
    new-instance v0, La/lph0;

    .line 70
    .line 71
    move-object v3, v7

    .line 72
    const/4 v7, 0x5

    .line 73
    const/4 v1, 0x0

    .line 74
    const-string v4, "initCurrentLimit"

    .line 75
    .line 76
    const-string v5, "initCurrentLimit()V"

    .line 77
    .line 78
    move-object v2, p0

    .line 79
    invoke-direct/range {v0 .. v7}, La/lph0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 80
    .line 81
    .line 82
    const/16 v5, 0x10

    .line 83
    .line 84
    const v2, 0x7f130677

    .line 85
    .line 86
    .line 87
    const v3, 0x7f131111

    .line 88
    .line 89
    .line 90
    move-object v4, v0

    .line 91
    move-object v1, v9

    .line 92
    move-object/from16 v0, p6

    .line 93
    .line 94
    invoke-static/range {v0 .. v5}, La/sa10;->b(La/sa10;La/pb10;IILkotlin/jvm/functions/Function0;I)La/ra10;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    iput-object v0, p0, La/imi0;->k:La/ra10;

    .line 99
    .line 100
    sget-object v0, La/gmi0;->a:La/gmi0;

    .line 101
    .line 102
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iput-object v0, p0, La/imi0;->l:La/p7m0;

    .line 107
    .line 108
    new-instance v0, La/zli0;

    .line 109
    .line 110
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    const/4 v2, 0x0

    .line 115
    invoke-direct {v0, v1, v2}, La/zli0;-><init>(Ljava/util/List;Z)V

    .line 116
    .line 117
    .line 118
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    iput-object v0, p0, La/imi0;->m:La/p7m0;

    .line 123
    .line 124
    new-instance v0, La/ol60;

    .line 125
    .line 126
    const/4 v1, 0x1

    .line 127
    sget-object v2, La/i99;->b:La/i99;

    .line 128
    .line 129
    invoke-direct {v0, v1, v2}, La/ol60;-><init>(ILa/i99;)V

    .line 130
    .line 131
    .line 132
    iput-object v0, p0, La/imi0;->n:La/ol60;

    .line 133
    .line 134
    invoke-virtual {p0}, La/imi0;->x()V

    .line 135
    .line 136
    .line 137
    return-void
.end method


# virtual methods
.method public final w()V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/imi0;->i:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v1, v1}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, La/imi0;->c:La/art;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget-object v3, La/nki0;->c:La/nki0;

    .line 14
    .line 15
    sget-object v4, La/nki0;->d:La/nki0;

    .line 16
    .line 17
    sget-object v5, La/nki0;->e:La/nki0;

    .line 18
    .line 19
    sget-object v6, La/nki0;->f:La/nki0;

    .line 20
    .line 21
    sget-object v7, La/nki0;->g:La/nki0;

    .line 22
    .line 23
    sget-object v8, La/nki0;->h:La/nki0;

    .line 24
    .line 25
    sget-object v9, La/nki0;->i:La/nki0;

    .line 26
    .line 27
    sget-object v10, La/nki0;->j:La/nki0;

    .line 28
    .line 29
    sget-object v11, La/nki0;->k:La/nki0;

    .line 30
    .line 31
    sget-object v12, La/nki0;->l:La/nki0;

    .line 32
    .line 33
    sget-object v13, La/nki0;->m:La/nki0;

    .line 34
    .line 35
    sget-object v14, La/nki0;->n:La/nki0;

    .line 36
    .line 37
    sget-object v15, La/nki0;->o:La/nki0;

    .line 38
    .line 39
    sget-object v16, La/nki0;->p:La/nki0;

    .line 40
    .line 41
    sget-object v17, La/nki0;->q:La/nki0;

    .line 42
    .line 43
    sget-object v18, La/nki0;->r:La/nki0;

    .line 44
    .line 45
    sget-object v19, La/nki0;->s:La/nki0;

    .line 46
    .line 47
    sget-object v20, La/nki0;->t:La/nki0;

    .line 48
    .line 49
    sget-object v21, La/nki0;->u:La/nki0;

    .line 50
    .line 51
    sget-object v22, La/nki0;->v:La/nki0;

    .line 52
    .line 53
    sget-object v23, La/nki0;->w:La/nki0;

    .line 54
    .line 55
    sget-object v24, La/nki0;->x:La/nki0;

    .line 56
    .line 57
    sget-object v25, La/nki0;->y:La/nki0;

    .line 58
    .line 59
    sget-object v26, La/nki0;->z:La/nki0;

    .line 60
    .line 61
    filled-new-array/range {v3 .. v26}, [La/nki0;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    new-instance v3, Ljava/util/ArrayList;

    .line 70
    .line 71
    const/16 v4, 0xa

    .line 72
    .line 73
    invoke-static {v2, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 78
    .line 79
    .line 80
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    if-eqz v4, :cond_6

    .line 89
    .line 90
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    check-cast v4, La/nki0;

    .line 95
    .line 96
    iget-object v5, v0, La/imi0;->g:La/nki0;

    .line 97
    .line 98
    const/4 v6, 0x0

    .line 99
    const/4 v7, 0x1

    .line 100
    if-ne v5, v4, :cond_0

    .line 101
    .line 102
    move v5, v7

    .line 103
    goto :goto_1

    .line 104
    :cond_0
    move v5, v6

    .line 105
    :goto_1
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    iget-object v8, v0, La/imi0;->f:La/ctf0;

    .line 109
    .line 110
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    new-instance v9, La/qki0;

    .line 114
    .line 115
    sget-object v10, La/rki0;->a:[I

    .line 116
    .line 117
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 118
    .line 119
    .line 120
    move-result v11

    .line 121
    iget v12, v4, La/nki0;->a:I

    .line 122
    .line 123
    aget v10, v10, v11

    .line 124
    .line 125
    if-eq v10, v7, :cond_5

    .line 126
    .line 127
    const/4 v7, 0x2

    .line 128
    if-ne v10, v7, :cond_1

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_1
    const/4 v7, 0x3

    .line 132
    if-eq v10, v7, :cond_4

    .line 133
    .line 134
    const/4 v7, 0x4

    .line 135
    if-eq v10, v7, :cond_4

    .line 136
    .line 137
    const/4 v7, 0x5

    .line 138
    if-eq v10, v7, :cond_4

    .line 139
    .line 140
    const/4 v7, 0x6

    .line 141
    if-eq v10, v7, :cond_4

    .line 142
    .line 143
    const/4 v7, 0x7

    .line 144
    if-ne v10, v7, :cond_2

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_2
    sget-object v7, La/nki0;->g:La/nki0;

    .line 148
    .line 149
    sget-object v10, La/nki0;->v:La/nki0;

    .line 150
    .line 151
    invoke-virtual {v4, v10}, Ljava/lang/Enum;->compareTo(Ljava/lang/Object;)I

    .line 152
    .line 153
    .line 154
    move-result v10

    .line 155
    if-gtz v10, :cond_3

    .line 156
    .line 157
    invoke-virtual {v4, v7}, Ljava/lang/Enum;->compareTo(Ljava/lang/Object;)I

    .line 158
    .line 159
    .line 160
    move-result v7

    .line 161
    if-ltz v7, :cond_3

    .line 162
    .line 163
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    const v7, 0x7f130b06

    .line 172
    .line 173
    .line 174
    invoke-virtual {v8, v7, v6}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    goto :goto_4

    .line 179
    :cond_3
    new-array v6, v6, [Ljava/lang/Object;

    .line 180
    .line 181
    const v7, 0x7f1308b1

    .line 182
    .line 183
    .line 184
    invoke-virtual {v8, v7, v6}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v6

    .line 188
    goto :goto_4

    .line 189
    :cond_4
    :goto_2
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 190
    .line 191
    .line 192
    move-result-object v6

    .line 193
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v6

    .line 197
    const v7, 0x7f130afd

    .line 198
    .line 199
    .line 200
    invoke-virtual {v8, v7, v6}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v6

    .line 204
    goto :goto_4

    .line 205
    :cond_5
    :goto_3
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 206
    .line 207
    .line 208
    move-result-object v6

    .line 209
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v6

    .line 213
    const v7, 0x7f130aea

    .line 214
    .line 215
    .line 216
    invoke-virtual {v8, v7, v6}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    :goto_4
    invoke-direct {v9, v4, v6, v5}, La/qki0;-><init>(La/nki0;Ljava/lang/String;Z)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    goto/16 :goto_0

    .line 227
    .line 228
    :cond_6
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 229
    .line 230
    .line 231
    :cond_7
    iget-object v2, v0, La/imi0;->l:La/p7m0;

    .line 232
    .line 233
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    move-object v4, v3

    .line 238
    check-cast v4, La/hmi0;

    .line 239
    .line 240
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 241
    .line 242
    .line 243
    move-result v4

    .line 244
    if-nez v4, :cond_8

    .line 245
    .line 246
    sget-object v4, La/emi0;->a:La/emi0;

    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_8
    new-instance v4, La/fmi0;

    .line 250
    .line 251
    iget-object v5, v0, La/imi0;->j:La/ra10;

    .line 252
    .line 253
    invoke-direct {v4, v5}, La/fmi0;-><init>(La/ra10;)V

    .line 254
    .line 255
    .line 256
    :goto_5
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v2

    .line 260
    if-eqz v2, :cond_7

    .line 261
    .line 262
    :cond_9
    iget-object v2, v0, La/imi0;->m:La/p7m0;

    .line 263
    .line 264
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    move-object v4, v3

    .line 269
    check-cast v4, La/zli0;

    .line 270
    .line 271
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 272
    .line 273
    .line 274
    move-result-object v5

    .line 275
    iget-boolean v4, v4, La/zli0;->b:Z

    .line 276
    .line 277
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    new-instance v6, La/zli0;

    .line 281
    .line 282
    invoke-direct {v6, v5, v4}, La/zli0;-><init>(Ljava/util/List;Z)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v2, v3, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    if-eqz v2, :cond_9

    .line 290
    .line 291
    return-void
.end method

.method public final x()V
    .locals 7

    .line 1
    :cond_0
    iget-object v0, p0, La/imi0;->l:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, La/hmi0;

    .line 9
    .line 10
    sget-object v2, La/gmi0;->a:La/gmi0;

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    new-instance v2, La/yli0;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {v2, p0, v0}, La/yli0;-><init>(La/imi0;B)V

    .line 26
    .line 27
    .line 28
    new-instance v5, La/r7i0;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    invoke-direct {v5, p0, v0}, La/r7i0;-><init>(La/imi0;La/yje;)V

    .line 32
    .line 33
    .line 34
    const/16 v6, 0xe

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    const/4 v4, 0x0

    .line 38
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final y(La/dmi0;)V
    .locals 6

    .line 1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, La/eoh0;

    .line 6
    .line 7
    const/16 v2, 0x1c

    .line 8
    .line 9
    invoke-direct {v1, v2}, La/eoh0;-><init>(B)V

    .line 10
    .line 11
    .line 12
    new-instance v4, La/bai0;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x6

    .line 16
    invoke-direct {v4, p0, p1, v2, v3}, La/bai0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 17
    .line 18
    .line 19
    const/16 v5, 0xe

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 23
    .line 24
    .line 25
    return-void
.end method
