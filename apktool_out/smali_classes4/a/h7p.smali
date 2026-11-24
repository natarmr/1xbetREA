.class public final La/h7p;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic r:I


# instance fields
.field public final o:La/ctf0;

.field public final p:La/a7q;

.field public final q:La/wep;


# direct methods
.method public constructor <init>(La/ctf0;La/mne;La/a7q;La/wep;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p2, p2, La/mne;->a:La/rwj;

    .line 5
    .line 6
    invoke-static {p2, p2}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    new-instance v0, La/r4p;

    .line 11
    .line 12
    const/4 v1, 0x3

    .line 13
    invoke-direct {v0, v1}, La/r4p;-><init>(B)V

    .line 14
    .line 15
    .line 16
    new-instance v2, La/bcn;

    .line 17
    .line 18
    const/16 v3, 0x8

    .line 19
    .line 20
    invoke-direct {v2, p1, v3}, La/bcn;-><init>(La/ctf0;B)V

    .line 21
    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-direct {p0, v0, p2, v2, v3}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, La/h7p;->o:La/ctf0;

    .line 28
    .line 29
    iput-object p3, p0, La/h7p;->p:La/a7q;

    .line 30
    .line 31
    iput-object p4, p0, La/h7p;->q:La/wep;

    .line 32
    .line 33
    new-instance p1, La/pn;

    .line 34
    .line 35
    const/16 p2, 0x1c

    .line 36
    .line 37
    invoke-direct {p1, p0, v3, p2}, La/pn;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 38
    .line 39
    .line 40
    invoke-static {p0, v3, v3, p1, v1}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 41
    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final M(La/o6p;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, La/n6p;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p1, La/n6p;

    .line 9
    .line 10
    iget-object p1, p1, La/n6p;->a:La/s9p;

    .line 11
    .line 12
    new-instance v0, La/f5o;

    .line 13
    .line 14
    const/16 v1, 0xf

    .line 15
    .line 16
    invoke-direct {v0, p1, v1}, La/f5o;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    sget-object v0, La/m6p;->a:La/m6p;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_c

    .line 30
    .line 31
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, La/d7p;

    .line 36
    .line 37
    iget-object p1, p1, La/d7p;->b:Ljava/util/Set;

    .line 38
    .line 39
    check-cast p1, Ljava/lang/Iterable;

    .line 40
    .line 41
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, La/d7p;

    .line 50
    .line 51
    iget-object v0, v0, La/d7p;->b:Ljava/util/Set;

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, La/d7p;

    .line 62
    .line 63
    iget-object v1, v1, La/d7p;->a:Ljava/util/List;

    .line 64
    .line 65
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    const/4 v2, 0x0

    .line 70
    if-ne v0, v1, :cond_2

    .line 71
    .line 72
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, La/d7p;

    .line 77
    .line 78
    iget-object v0, v0, La/d7p;->a:Ljava/util/List;

    .line 79
    .line 80
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    const/4 v1, 0x1

    .line 85
    if-le v0, v1, :cond_2

    .line 86
    .line 87
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    check-cast p1, La/d7p;

    .line 92
    .line 93
    iget-object p1, p1, La/d7p;->a:Ljava/util/List;

    .line 94
    .line 95
    new-array v0, v2, [Ljava/lang/Object;

    .line 96
    .line 97
    iget-object v1, p0, La/h7p;->o:La/ctf0;

    .line 98
    .line 99
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 100
    .line 101
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    const v3, 0x7f131229

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v3, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    move v1, v2

    .line 117
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-eqz v3, :cond_1

    .line 122
    .line 123
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    check-cast v3, La/s9p;

    .line 128
    .line 129
    invoke-interface {v3}, La/s9p;->b()I

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    add-int/2addr v1, v3

    .line 134
    goto :goto_0

    .line 135
    :cond_1
    new-instance p1, La/l9p;

    .line 136
    .line 137
    invoke-direct {p1, v0, v1}, La/l9p;-><init>(Ljava/lang/String;I)V

    .line 138
    .line 139
    .line 140
    invoke-static {p1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    .line 145
    .line 146
    const/16 v1, 0xa

    .line 147
    .line 148
    invoke-static {p1, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 153
    .line 154
    .line 155
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    if-eqz v1, :cond_b

    .line 164
    .line 165
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    check-cast v1, La/s9p;

    .line 170
    .line 171
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    instance-of v3, v1, La/k9p;

    .line 175
    .line 176
    const-string v4, ""

    .line 177
    .line 178
    if-eqz v3, :cond_3

    .line 179
    .line 180
    check-cast v1, La/k9p;

    .line 181
    .line 182
    iget v3, v1, La/k9p;->b:I

    .line 183
    .line 184
    iget-object v1, v1, La/k9p;->a:Ljava/lang/String;

    .line 185
    .line 186
    new-instance v5, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Aggregator;

    .line 187
    .line 188
    invoke-direct {v5, v3, v1, v4, v2}, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Aggregator;-><init>(ILjava/lang/String;Ljava/lang/String;Z)V

    .line 189
    .line 190
    .line 191
    goto/16 :goto_2

    .line 192
    .line 193
    :cond_3
    instance-of v3, v1, La/l9p;

    .line 194
    .line 195
    if-eqz v3, :cond_4

    .line 196
    .line 197
    check-cast v1, La/l9p;

    .line 198
    .line 199
    iget v3, v1, La/l9p;->b:I

    .line 200
    .line 201
    iget-object v1, v1, La/l9p;->a:Ljava/lang/String;

    .line 202
    .line 203
    new-instance v5, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$All;

    .line 204
    .line 205
    invoke-direct {v5, v1, v3, v2}, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$All;-><init>(Ljava/lang/String;IZ)V

    .line 206
    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_4
    instance-of v3, v1, La/m9p;

    .line 210
    .line 211
    if-eqz v3, :cond_5

    .line 212
    .line 213
    check-cast v1, La/m9p;

    .line 214
    .line 215
    iget v3, v1, La/m9p;->b:I

    .line 216
    .line 217
    iget-object v1, v1, La/m9p;->a:Ljava/lang/String;

    .line 218
    .line 219
    new-instance v5, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Champs;

    .line 220
    .line 221
    invoke-direct {v5, v3, v1, v4, v2}, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Champs;-><init>(ILjava/lang/String;Ljava/lang/String;Z)V

    .line 222
    .line 223
    .line 224
    goto :goto_2

    .line 225
    :cond_5
    instance-of v3, v1, La/n9p;

    .line 226
    .line 227
    if-eqz v3, :cond_6

    .line 228
    .line 229
    check-cast v1, La/n9p;

    .line 230
    .line 231
    iget v3, v1, La/n9p;->b:I

    .line 232
    .line 233
    iget-object v1, v1, La/n9p;->a:Ljava/lang/String;

    .line 234
    .line 235
    new-instance v5, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Line;

    .line 236
    .line 237
    invoke-direct {v5, v1, v3, v2}, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Line;-><init>(Ljava/lang/String;IZ)V

    .line 238
    .line 239
    .line 240
    goto :goto_2

    .line 241
    :cond_6
    instance-of v3, v1, La/o9p;

    .line 242
    .line 243
    if-eqz v3, :cond_7

    .line 244
    .line 245
    check-cast v1, La/o9p;

    .line 246
    .line 247
    iget v3, v1, La/o9p;->b:I

    .line 248
    .line 249
    iget-object v1, v1, La/o9p;->a:Ljava/lang/String;

    .line 250
    .line 251
    new-instance v5, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Live;

    .line 252
    .line 253
    invoke-direct {v5, v1, v3, v2}, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Live;-><init>(Ljava/lang/String;IZ)V

    .line 254
    .line 255
    .line 256
    goto :goto_2

    .line 257
    :cond_7
    instance-of v3, v1, La/p9p;

    .line 258
    .line 259
    if-eqz v3, :cond_8

    .line 260
    .line 261
    check-cast v1, La/p9p;

    .line 262
    .line 263
    iget v3, v1, La/p9p;->b:I

    .line 264
    .line 265
    iget-object v1, v1, La/p9p;->a:Ljava/lang/String;

    .line 266
    .line 267
    new-instance v5, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Results;

    .line 268
    .line 269
    invoke-direct {v5, v1, v3, v2}, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Results;-><init>(Ljava/lang/String;IZ)V

    .line 270
    .line 271
    .line 272
    goto :goto_2

    .line 273
    :cond_8
    instance-of v3, v1, La/q9p;

    .line 274
    .line 275
    if-eqz v3, :cond_9

    .line 276
    .line 277
    check-cast v1, La/q9p;

    .line 278
    .line 279
    iget v3, v1, La/q9p;->b:I

    .line 280
    .line 281
    iget-object v1, v1, La/q9p;->a:Ljava/lang/String;

    .line 282
    .line 283
    new-instance v5, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Teams;

    .line 284
    .line 285
    invoke-direct {v5, v1, v3, v2}, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Teams;-><init>(Ljava/lang/String;IZ)V

    .line 286
    .line 287
    .line 288
    goto :goto_2

    .line 289
    :cond_9
    instance-of v3, v1, La/r9p;

    .line 290
    .line 291
    if-eqz v3, :cond_a

    .line 292
    .line 293
    check-cast v1, La/r9p;

    .line 294
    .line 295
    iget v3, v1, La/r9p;->b:I

    .line 296
    .line 297
    iget-object v1, v1, La/r9p;->a:Ljava/lang/String;

    .line 298
    .line 299
    new-instance v5, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$XGames;

    .line 300
    .line 301
    invoke-direct {v5, v3, v1, v4, v2}, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$XGames;-><init>(ILjava/lang/String;Ljava/lang/String;Z)V

    .line 302
    .line 303
    .line 304
    :goto_2
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    goto/16 :goto_1

    .line 308
    .line 309
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 310
    .line 311
    .line 312
    return-void

    .line 313
    :cond_b
    new-instance p1, La/y6p;

    .line 314
    .line 315
    invoke-direct {p1, v0}, La/y6p;-><init>(Ljava/util/ArrayList;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    return-void

    .line 322
    :cond_c
    sget-object v0, La/l6p;->a:La/l6p;

    .line 323
    .line 324
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result p1

    .line 328
    if-eqz p1, :cond_d

    .line 329
    .line 330
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 331
    .line 332
    .line 333
    return-void

    .line 334
    :cond_d
    invoke-static {}, La/t9f;->b()V

    .line 335
    .line 336
    .line 337
    return-void
.end method

.method public final bridge synthetic x(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, La/o6p;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/h7p;->M(La/o6p;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
