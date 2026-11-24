.class public final La/mbp;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:La/ccp;

.field public final synthetic j:Ljava/util/List;


# direct methods
.method public constructor <init>(La/ccp;Ljava/util/List;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/mbp;->i:La/ccp;

    .line 2
    .line 3
    iput-object p2, p0, La/mbp;->j:Ljava/util/List;

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
    .locals 1

    .line 1
    new-instance p1, La/mbp;

    .line 2
    .line 3
    iget-object v0, p0, La/mbp;->i:La/ccp;

    .line 4
    .line 5
    iget-object p0, p0, La/mbp;->j:Ljava/util/List;

    .line 6
    .line 7
    invoke-direct {p1, v0, p0, p2}, La/mbp;-><init>(La/ccp;Ljava/util/List;La/yje;)V

    .line 8
    .line 9
    .line 10
    return-object p1
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
    invoke-virtual {p0, p1, p2}, La/mbp;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/mbp;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/mbp;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/wne;->a:La/wne;

    .line 4
    .line 5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object v4, v0, La/mbp;->i:La/ccp;

    .line 9
    .line 10
    iget-object v1, v4, La/ccp;->H:La/mne;

    .line 11
    .line 12
    sget v2, La/ccp;->u0:I

    .line 13
    .line 14
    iget-object v2, v4, La/i3t0;->i:La/ocj;

    .line 15
    .line 16
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 17
    .line 18
    :cond_0
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-object v5, v3

    .line 26
    check-cast v5, La/dd80;

    .line 27
    .line 28
    const/4 v14, 0x0

    .line 29
    const/16 v15, 0x1ffd

    .line 30
    .line 31
    const/4 v6, 0x1

    .line 32
    const/4 v7, 0x0

    .line 33
    const/4 v8, 0x0

    .line 34
    const/4 v9, 0x0

    .line 35
    const/4 v10, 0x0

    .line 36
    const/4 v11, 0x0

    .line 37
    const/4 v12, 0x0

    .line 38
    const/4 v13, 0x0

    .line 39
    invoke-static/range {v5 .. v15}, La/dd80;->a(La/dd80;ZZZZZZLa/hc80;La/ed80;ZI)La/dd80;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-virtual {v2, v3, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_0

    .line 48
    .line 49
    iget-object v0, v0, La/mbp;->j:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    const/4 v10, 0x0

    .line 56
    const/4 v11, 0x1

    .line 57
    if-eqz v2, :cond_2

    .line 58
    .line 59
    :cond_1
    move v12, v10

    .line 60
    goto :goto_0

    .line 61
    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_1

    .line 70
    .line 71
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    check-cast v3, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem;

    .line 76
    .line 77
    instance-of v3, v3, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Champs;

    .line 78
    .line 79
    if-eqz v3, :cond_3

    .line 80
    .line 81
    move v12, v11

    .line 82
    :goto_0
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_5

    .line 87
    .line 88
    :cond_4
    move v13, v10

    .line 89
    goto :goto_1

    .line 90
    :cond_5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-eqz v3, :cond_4

    .line 99
    .line 100
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    check-cast v3, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem;

    .line 105
    .line 106
    instance-of v3, v3, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Teams;

    .line 107
    .line 108
    if-eqz v3, :cond_6

    .line 109
    .line 110
    move v13, v11

    .line 111
    :goto_1
    const/4 v14, 0x0

    .line 112
    if-nez v12, :cond_8

    .line 113
    .line 114
    if-eqz v13, :cond_7

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_7
    move-object v12, v14

    .line 118
    goto :goto_3

    .line 119
    :cond_8
    :goto_2
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 120
    .line 121
    .line 122
    move-result-object v15

    .line 123
    new-instance v16, La/k4p;

    .line 124
    .line 125
    const/4 v8, 0x0

    .line 126
    const/16 v9, 0xb

    .line 127
    .line 128
    const/4 v3, 0x1

    .line 129
    const-class v5, La/ccp;

    .line 130
    .line 131
    const-string v6, "handleFavoriteClickError"

    .line 132
    .line 133
    const-string v7, "handleFavoriteClickError(Ljava/lang/Throwable;)V"

    .line 134
    .line 135
    move-object/from16 v2, v16

    .line 136
    .line 137
    invoke-direct/range {v2 .. v9}, La/k4p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 138
    .line 139
    .line 140
    iget-object v8, v1, La/mne;->b:La/dvj;

    .line 141
    .line 142
    new-instance v2, La/wz0;

    .line 143
    .line 144
    const/4 v7, 0x2

    .line 145
    move v5, v12

    .line 146
    move v3, v13

    .line 147
    move-object v6, v14

    .line 148
    invoke-direct/range {v2 .. v7}, La/wz0;-><init>(ZLa/diu0;ZLa/yje;B)V

    .line 149
    .line 150
    .line 151
    move-object v12, v6

    .line 152
    const/16 v20, 0xa

    .line 153
    .line 154
    const/16 v17, 0x0

    .line 155
    .line 156
    move-object/from16 v19, v2

    .line 157
    .line 158
    move-object/from16 v18, v8

    .line 159
    .line 160
    invoke-static/range {v15 .. v20}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 161
    .line 162
    .line 163
    :goto_3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    :cond_9
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    if-eqz v2, :cond_c

    .line 172
    .line 173
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    check-cast v2, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem;

    .line 178
    .line 179
    if-nez v2, :cond_a

    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_a
    instance-of v3, v2, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Aggregator;

    .line 183
    .line 184
    if-eqz v3, :cond_b

    .line 185
    .line 186
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 187
    .line 188
    .line 189
    move-result-object v13

    .line 190
    new-instance v14, La/k4p;

    .line 191
    .line 192
    const/4 v8, 0x0

    .line 193
    const/16 v9, 0x8

    .line 194
    .line 195
    const/4 v3, 0x1

    .line 196
    const-class v5, La/ccp;

    .line 197
    .line 198
    const-string v6, "handleFavoriteClickError"

    .line 199
    .line 200
    const-string v7, "handleFavoriteClickError(Ljava/lang/Throwable;)V"

    .line 201
    .line 202
    move-object v2, v14

    .line 203
    invoke-direct/range {v2 .. v9}, La/k4p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 204
    .line 205
    .line 206
    iget-object v2, v1, La/mne;->a:La/rwj;

    .line 207
    .line 208
    new-instance v15, La/ibp;

    .line 209
    .line 210
    const/4 v3, 0x2

    .line 211
    invoke-direct {v15, v4, v3}, La/ibp;-><init>(La/ccp;B)V

    .line 212
    .line 213
    .line 214
    new-instance v3, La/lbp;

    .line 215
    .line 216
    invoke-direct {v3, v4, v12, v10}, La/lbp;-><init>(La/ccp;La/yje;B)V

    .line 217
    .line 218
    .line 219
    const/16 v18, 0x8

    .line 220
    .line 221
    move-object/from16 v16, v2

    .line 222
    .line 223
    move-object/from16 v17, v3

    .line 224
    .line 225
    invoke-static/range {v13 .. v18}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 226
    .line 227
    .line 228
    goto :goto_4

    .line 229
    :cond_b
    instance-of v2, v2, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$XGames;

    .line 230
    .line 231
    if-eqz v2, :cond_9

    .line 232
    .line 233
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 234
    .line 235
    .line 236
    move-result-object v13

    .line 237
    new-instance v14, La/k4p;

    .line 238
    .line 239
    const/4 v8, 0x0

    .line 240
    const/16 v9, 0xa

    .line 241
    .line 242
    const/4 v3, 0x1

    .line 243
    const-class v5, La/ccp;

    .line 244
    .line 245
    const-string v6, "handleFavoriteClickError"

    .line 246
    .line 247
    const-string v7, "handleFavoriteClickError(Ljava/lang/Throwable;)V"

    .line 248
    .line 249
    move-object v2, v14

    .line 250
    invoke-direct/range {v2 .. v9}, La/k4p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 251
    .line 252
    .line 253
    iget-object v2, v1, La/mne;->a:La/rwj;

    .line 254
    .line 255
    new-instance v15, La/ibp;

    .line 256
    .line 257
    invoke-direct {v15, v4, v11}, La/ibp;-><init>(La/ccp;B)V

    .line 258
    .line 259
    .line 260
    new-instance v3, La/lbp;

    .line 261
    .line 262
    invoke-direct {v3, v4, v12, v11}, La/lbp;-><init>(La/ccp;La/yje;B)V

    .line 263
    .line 264
    .line 265
    const/16 v18, 0x8

    .line 266
    .line 267
    move-object/from16 v16, v2

    .line 268
    .line 269
    move-object/from16 v17, v3

    .line 270
    .line 271
    invoke-static/range {v13 .. v18}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 272
    .line 273
    .line 274
    goto :goto_4

    .line 275
    :cond_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 276
    .line 277
    return-object v0
.end method
