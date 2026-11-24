.class public final La/uf7;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/vzg0;

.field public final c:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

.field public final d:La/xfu;

.field public final e:La/nou;

.field public final f:La/m0u;

.field public final g:La/f5a;

.field public final h:La/i1w0;

.field public final i:La/duj;

.field public final j:La/p7m0;

.field public final k:La/p7m0;

.field public final l:La/p7m0;

.field public final m:La/ol60;

.field public n:I


# direct methods
.method public constructor <init>(La/vzg0;Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;La/xfu;La/nou;La/m0u;La/f5a;La/i1w0;La/duj;)V
    .locals 8

    .line 1
    invoke-direct {p0}, La/w46;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/uf7;->b:La/vzg0;

    .line 5
    .line 6
    iput-object p2, p0, La/uf7;->c:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 7
    .line 8
    iput-object p3, p0, La/uf7;->d:La/xfu;

    .line 9
    .line 10
    iput-object p4, p0, La/uf7;->e:La/nou;

    .line 11
    .line 12
    iput-object p5, p0, La/uf7;->f:La/m0u;

    .line 13
    .line 14
    iput-object p6, p0, La/uf7;->g:La/f5a;

    .line 15
    .line 16
    iput-object p7, p0, La/uf7;->h:La/i1w0;

    .line 17
    .line 18
    move-object/from16 p1, p8

    .line 19
    .line 20
    iput-object p1, p0, La/uf7;->i:La/duj;

    .line 21
    .line 22
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    iput-object p2, p0, La/uf7;->j:La/p7m0;

    .line 29
    .line 30
    sget-object p2, La/iun;->a:La/iun;

    .line 31
    .line 32
    invoke-static {p2}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    iput-object p2, p0, La/uf7;->k:La/p7m0;

    .line 37
    .line 38
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, La/uf7;->l:La/p7m0;

    .line 43
    .line 44
    new-instance p1, La/ol60;

    .line 45
    .line 46
    const/4 p2, 0x1

    .line 47
    sget-object p3, La/i99;->b:La/i99;

    .line 48
    .line 49
    invoke-direct {p1, p2, p3}, La/ol60;-><init>(ILa/i99;)V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, La/uf7;->m:La/ol60;

    .line 53
    .line 54
    const/4 p1, -0x1

    .line 55
    iput p1, p0, La/uf7;->n:I

    .line 56
    .line 57
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    new-instance p3, La/ye7;

    .line 62
    .line 63
    const/4 v6, 0x0

    .line 64
    const/4 v7, 0x1

    .line 65
    const/4 v1, 0x1

    .line 66
    const-class v3, La/uf7;

    .line 67
    .line 68
    const-string v4, "handleError"

    .line 69
    .line 70
    const-string v5, "handleError(Ljava/lang/Throwable;)V"

    .line 71
    .line 72
    move-object v2, p0

    .line 73
    move-object v0, p3

    .line 74
    invoke-direct/range {v0 .. v7}, La/ye7;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 75
    .line 76
    .line 77
    new-instance p4, La/of7;

    .line 78
    .line 79
    const/4 p1, 0x0

    .line 80
    invoke-direct {p4, p0, p1}, La/of7;-><init>(La/uf7;B)V

    .line 81
    .line 82
    .line 83
    new-instance p6, La/tf7;

    .line 84
    .line 85
    const/4 p5, 0x0

    .line 86
    invoke-direct {p6, p0, p5, p1}, La/tf7;-><init>(La/uf7;La/yje;B)V

    .line 87
    .line 88
    .line 89
    const/16 p0, 0xc

    .line 90
    .line 91
    move p7, p0

    .line 92
    invoke-static/range {p2 .. p7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 93
    .line 94
    .line 95
    return-void
.end method


# virtual methods
.method public final w(ILa/zje;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v1, La/sf7;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/sf7;

    .line 11
    .line 12
    iget v3, v2, La/sf7;->m:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/sf7;->m:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/sf7;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/sf7;-><init>(La/uf7;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/sf7;->k:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/sf7;->m:I

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v7, 0x0

    .line 38
    const/4 v8, 0x1

    .line 39
    if-eqz v4, :cond_4

    .line 40
    .line 41
    if-eq v4, v8, :cond_3

    .line 42
    .line 43
    if-eq v4, v6, :cond_2

    .line 44
    .line 45
    if-ne v4, v5, :cond_1

    .line 46
    .line 47
    iget-object v0, v2, La/sf7;->j:La/m0u;

    .line 48
    .line 49
    check-cast v0, Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_6

    .line 55
    .line 56
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object v7

    .line 62
    :cond_2
    iget v4, v2, La/sf7;->i:I

    .line 63
    .line 64
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_3
    iget v4, v2, La/sf7;->i:I

    .line 69
    .line 70
    iget-object v9, v2, La/sf7;->j:La/m0u;

    .line 71
    .line 72
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    move/from16 v16, v4

    .line 76
    .line 77
    move-object v4, v1

    .line 78
    move/from16 v1, v16

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_4
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    iget-object v9, v0, La/uf7;->f:La/m0u;

    .line 85
    .line 86
    iput-object v9, v2, La/sf7;->j:La/m0u;

    .line 87
    .line 88
    move/from16 v1, p1

    .line 89
    .line 90
    iput v1, v2, La/sf7;->i:I

    .line 91
    .line 92
    iput v8, v2, La/sf7;->m:I

    .line 93
    .line 94
    iget-object v4, v0, La/uf7;->e:La/nou;

    .line 95
    .line 96
    invoke-static {v4, v2}, La/nou;->b(La/nou;La/yje;)Ljava/io/Serializable;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    if-ne v4, v3, :cond_5

    .line 101
    .line 102
    goto/16 :goto_5

    .line 103
    .line 104
    :cond_5
    :goto_1
    check-cast v4, La/ql5;

    .line 105
    .line 106
    iget-wide v10, v4, La/ql5;->e:J

    .line 107
    .line 108
    iput-object v7, v2, La/sf7;->j:La/m0u;

    .line 109
    .line 110
    iput v1, v2, La/sf7;->i:I

    .line 111
    .line 112
    iput v6, v2, La/sf7;->m:I

    .line 113
    .line 114
    iget-object v4, v9, La/m0u;->a:La/xr;

    .line 115
    .line 116
    invoke-virtual {v4, v10, v11, v2}, La/xr;->c(JLa/yje;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    if-ne v4, v3, :cond_6

    .line 121
    .line 122
    goto/16 :goto_5

    .line 123
    .line 124
    :cond_6
    move-object/from16 v16, v4

    .line 125
    .line 126
    move v4, v1

    .line 127
    move-object/from16 v1, v16

    .line 128
    .line 129
    :goto_2
    check-cast v1, La/xuf;

    .line 130
    .line 131
    iget-object v1, v1, La/xuf;->f:Ljava/lang/String;

    .line 132
    .line 133
    sget-object v6, La/mf7;->e:La/c0o;

    .line 134
    .line 135
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->N0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    sget-object v9, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->d:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 140
    .line 141
    iget-object v10, v0, La/uf7;->c:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 142
    .line 143
    if-eq v10, v9, :cond_7

    .line 144
    .line 145
    sget-object v9, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->e:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 146
    .line 147
    if-eq v10, v9, :cond_7

    .line 148
    .line 149
    sget-object v9, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->g:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 150
    .line 151
    if-eq v10, v9, :cond_7

    .line 152
    .line 153
    sget-object v9, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->h:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 154
    .line 155
    if-ne v10, v9, :cond_8

    .line 156
    .line 157
    :cond_7
    sget-object v9, La/mf7;->a:La/mf7;

    .line 158
    .line 159
    sget-object v10, La/mf7;->b:La/mf7;

    .line 160
    .line 161
    sget-object v11, La/mf7;->c:La/mf7;

    .line 162
    .line 163
    filled-new-array {v9, v10, v11}, [La/mf7;

    .line 164
    .line 165
    .line 166
    move-result-object v9

    .line 167
    invoke-static {v9}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 168
    .line 169
    .line 170
    move-result-object v9

    .line 171
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 175
    .line 176
    .line 177
    :cond_8
    new-instance v9, Ljava/util/ArrayList;

    .line 178
    .line 179
    const/16 v10, 0xa

    .line 180
    .line 181
    invoke-static {v6, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 182
    .line 183
    .line 184
    move-result v10

    .line 185
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 189
    .line 190
    .line 191
    move-result-object v6

    .line 192
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 193
    .line 194
    .line 195
    move-result v10

    .line 196
    if-eqz v10, :cond_a

    .line 197
    .line 198
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v10

    .line 202
    check-cast v10, La/mf7;

    .line 203
    .line 204
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    new-instance v11, La/gsz;

    .line 211
    .line 212
    new-instance v12, La/nf7;

    .line 213
    .line 214
    invoke-virtual {v10}, La/mf7;->a()I

    .line 215
    .line 216
    .line 217
    move-result v13

    .line 218
    sget-object v14, La/pn40;->a:La/pn40;

    .line 219
    .line 220
    invoke-virtual {v10}, La/mf7;->a()I

    .line 221
    .line 222
    .line 223
    move-result v14

    .line 224
    int-to-double v14, v14

    .line 225
    sget-object v8, La/p3u0;->j:La/p3u0;

    .line 226
    .line 227
    invoke-static {v14, v15, v1, v8}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v8

    .line 231
    invoke-direct {v12, v13, v8}, La/nf7;-><init>(ILjava/lang/String;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v10}, La/mf7;->a()I

    .line 235
    .line 236
    .line 237
    move-result v8

    .line 238
    if-ne v4, v8, :cond_9

    .line 239
    .line 240
    const/4 v8, 0x1

    .line 241
    goto :goto_4

    .line 242
    :cond_9
    const/4 v8, 0x0

    .line 243
    :goto_4
    invoke-direct {v11, v12, v8}, La/gsz;-><init>(La/csz;Z)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    const/4 v8, 0x1

    .line 250
    goto :goto_3

    .line 251
    :cond_a
    iput-object v7, v2, La/sf7;->j:La/m0u;

    .line 252
    .line 253
    iput v4, v2, La/sf7;->i:I

    .line 254
    .line 255
    iput v5, v2, La/sf7;->m:I

    .line 256
    .line 257
    iget-object v0, v0, La/uf7;->k:La/p7m0;

    .line 258
    .line 259
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0, v7, v9}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 266
    .line 267
    if-ne v0, v3, :cond_b

    .line 268
    .line 269
    :goto_5
    return-object v3

    .line 270
    :cond_b
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 271
    .line 272
    return-object v0
.end method

.method public final x(La/rf7;)V
    .locals 6

    .line 1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, La/h26;

    .line 6
    .line 7
    const/16 v2, 0x1d

    .line 8
    .line 9
    invoke-direct {v1, v2}, La/h26;-><init>(B)V

    .line 10
    .line 11
    .line 12
    new-instance v4, La/yp6;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/16 v3, 0x9

    .line 16
    .line 17
    invoke-direct {v4, p0, p1, v2, v3}, La/yp6;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 18
    .line 19
    .line 20
    const/16 v5, 0xe

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 24
    .line 25
    .line 26
    return-void
.end method
