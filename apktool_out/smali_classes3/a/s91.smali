.class public final La/s91;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/rl1;

.field public final b:La/ehf0;

.field public final c:La/gx3;

.field public final d:La/qoj0;

.field public final e:La/p7m0;

.field public final f:Z


# direct methods
.method public constructor <init>(La/rl1;La/ehf0;La/pru;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/s91;->a:La/rl1;

    .line 8
    .line 9
    iput-object p2, p0, La/s91;->b:La/ehf0;

    .line 10
    .line 11
    new-instance p1, La/gx3;

    .line 12
    .line 13
    const/4 p2, 0x5

    .line 14
    invoke-direct {p1, p2}, La/nuj0;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, La/s91;->c:La/gx3;

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    sget-object p2, La/i99;->b:La/i99;

    .line 21
    .line 22
    invoke-static {p1, p1, p2}, La/roj0;->a(IILa/i99;)La/qoj0;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, La/s91;->d:La/qoj0;

    .line 27
    .line 28
    sget-object p1, La/ir1;->c:La/ir1;

    .line 29
    .line 30
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, La/s91;->e:La/p7m0;

    .line 35
    .line 36
    invoke-virtual {p3}, La/pru;->a()La/sff0;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-object p1, p1, La/sff0;->b:La/hl1;

    .line 41
    .line 42
    iget-boolean p1, p1, La/hl1;->C:Z

    .line 43
    .line 44
    iput-boolean p1, p0, La/s91;->f:Z

    .line 45
    .line 46
    return-void
.end method

.method public static d(La/s91;La/lr1;ZZI)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    and-int/lit8 v2, p4, 0x2

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    if-eqz v2, :cond_1

    .line 10
    .line 11
    iget-object v2, v0, La/s91;->e:La/p7m0;

    .line 12
    .line 13
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, La/lr1;

    .line 18
    .line 19
    iget-object v2, v2, La/lr1;->a:La/mr1;

    .line 20
    .line 21
    iget-object v5, v1, La/lr1;->a:La/mr1;

    .line 22
    .line 23
    if-ne v2, v5, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v2, v4

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    move v2, v3

    .line 29
    :goto_1
    and-int/lit8 v5, p4, 0x4

    .line 30
    .line 31
    if-eqz v5, :cond_2

    .line 32
    .line 33
    move v5, v4

    .line 34
    goto :goto_2

    .line 35
    :cond_2
    move/from16 v5, p2

    .line 36
    .line 37
    :goto_2
    and-int/lit8 v6, p4, 0x8

    .line 38
    .line 39
    if-eqz v6, :cond_3

    .line 40
    .line 41
    move v6, v5

    .line 42
    goto :goto_3

    .line 43
    :cond_3
    move/from16 v6, p3

    .line 44
    .line 45
    :goto_3
    iget-object v7, v0, La/s91;->c:La/gx3;

    .line 46
    .line 47
    iget-object v8, v0, La/s91;->a:La/rl1;

    .line 48
    .line 49
    iget-object v9, v0, La/s91;->e:La/p7m0;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    sget-object v10, La/ir1;->c:La/ir1;

    .line 55
    .line 56
    invoke-virtual {v1, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v11

    .line 60
    if-eqz v11, :cond_4

    .line 61
    .line 62
    goto/16 :goto_8

    .line 63
    .line 64
    :cond_4
    invoke-virtual {v9}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v11

    .line 68
    check-cast v11, La/lr1;

    .line 69
    .line 70
    iget-object v11, v11, La/lr1;->a:La/mr1;

    .line 71
    .line 72
    iget-object v12, v1, La/lr1;->a:La/mr1;

    .line 73
    .line 74
    iget-object v13, v1, La/lr1;->b:La/tm1;

    .line 75
    .line 76
    if-ne v11, v12, :cond_5

    .line 77
    .line 78
    move v11, v3

    .line 79
    goto :goto_4

    .line 80
    :cond_5
    move v11, v4

    .line 81
    :goto_4
    if-eqz v11, :cond_7

    .line 82
    .line 83
    if-eqz v5, :cond_7

    .line 84
    .line 85
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    iget-object v2, v8, La/rl1;->h:La/ehf0;

    .line 89
    .line 90
    new-instance v14, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 91
    .line 92
    const/16 v26, 0x0

    .line 93
    .line 94
    const/16 v27, 0x1ff

    .line 95
    .line 96
    const/4 v15, 0x0

    .line 97
    const/16 v16, 0x0

    .line 98
    .line 99
    const-wide/16 v17, 0x0

    .line 100
    .line 101
    const/16 v19, 0x0

    .line 102
    .line 103
    const/16 v20, 0x0

    .line 104
    .line 105
    const-wide/16 v21, 0x0

    .line 106
    .line 107
    const-wide/16 v23, 0x0

    .line 108
    .line 109
    const/16 v25, 0x0

    .line 110
    .line 111
    invoke-direct/range {v14 .. v27}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v13, v14, v6}, La/ehf0;->w(La/tm1;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;Z)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    new-instance v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 119
    .line 120
    invoke-direct {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 121
    .line 122
    .line 123
    new-instance v5, La/y0w0;

    .line 124
    .line 125
    invoke-direct {v5, v2}, La/y0w0;-><init>(La/m7h0;)V

    .line 126
    .line 127
    .line 128
    new-instance v2, La/c8d;

    .line 129
    .line 130
    sget-object v6, La/y7d;->a:La/v7d;

    .line 131
    .line 132
    invoke-direct {v2, v6, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v3, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    invoke-virtual {v8}, La/i1w0;->c()La/mf50;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-virtual {v2, v3}, La/mf50;->d(Ljava/util/List;)La/lc00;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-virtual {v2, v4}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    :goto_5
    move-object v3, v2

    .line 151
    check-cast v3, La/paw;

    .line 152
    .line 153
    invoke-virtual {v3}, La/paw;->hasNext()Z

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    if-eqz v4, :cond_6

    .line 158
    .line 159
    invoke-virtual {v3}, La/paw;->next()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    check-cast v3, La/oe50;

    .line 164
    .line 165
    invoke-virtual {v8, v3}, La/i1w0;->a(La/oe50;)V

    .line 166
    .line 167
    .line 168
    goto :goto_5

    .line 169
    :cond_6
    invoke-virtual {v12}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 174
    .line 175
    invoke-virtual {v7, v2, v3}, La/nuj0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {p0 .. p1}, La/s91;->e(La/lr1;)V

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :cond_7
    if-nez v11, :cond_d

    .line 183
    .line 184
    if-eqz v2, :cond_9

    .line 185
    .line 186
    :cond_8
    move v5, v4

    .line 187
    goto :goto_6

    .line 188
    :cond_9
    invoke-virtual {v12}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    invoke-virtual {v7, v5}, La/nuj0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    check-cast v5, Ljava/lang/Boolean;

    .line 197
    .line 198
    if-eqz v5, :cond_8

    .line 199
    .line 200
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 201
    .line 202
    .line 203
    move-result v5

    .line 204
    :goto_6
    invoke-virtual {v9}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v11

    .line 208
    invoke-static {v11, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v10

    .line 212
    if-nez v10, :cond_a

    .line 213
    .line 214
    invoke-virtual {v9}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v9

    .line 218
    check-cast v9, La/lr1;

    .line 219
    .line 220
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    iget-object v10, v8, La/rl1;->h:La/ehf0;

    .line 227
    .line 228
    iget-object v9, v9, La/lr1;->b:La/tm1;

    .line 229
    .line 230
    new-instance v14, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 231
    .line 232
    const/16 v26, 0x0

    .line 233
    .line 234
    const/16 v27, 0x1ff

    .line 235
    .line 236
    const/4 v15, 0x0

    .line 237
    const/16 v16, 0x0

    .line 238
    .line 239
    const-wide/16 v17, 0x0

    .line 240
    .line 241
    const/16 v19, 0x0

    .line 242
    .line 243
    const/16 v20, 0x0

    .line 244
    .line 245
    const-wide/16 v21, 0x0

    .line 246
    .line 247
    const-wide/16 v23, 0x0

    .line 248
    .line 249
    const/16 v25, 0x0

    .line 250
    .line 251
    invoke-direct/range {v14 .. v27}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v10, v9, v14, v4}, La/ehf0;->w(La/tm1;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;Z)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 255
    .line 256
    .line 257
    move-result-object v9

    .line 258
    new-instance v10, La/ryg0;

    .line 259
    .line 260
    invoke-interface {v9}, La/m7h0;->b()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v11

    .line 264
    invoke-direct {v10, v9, v11}, La/ryg0;-><init>(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    new-array v9, v3, [La/t7d;

    .line 268
    .line 269
    aput-object v10, v9, v4

    .line 270
    .line 271
    invoke-virtual {v8, v9}, La/i1w0;->b([La/t7d;)V

    .line 272
    .line 273
    .line 274
    :cond_a
    if-eqz v2, :cond_b

    .line 275
    .line 276
    invoke-virtual {v8, v1}, La/rl1;->g(La/lr1;)V

    .line 277
    .line 278
    .line 279
    :cond_b
    if-eqz v5, :cond_c

    .line 280
    .line 281
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    iget-object v2, v8, La/rl1;->h:La/ehf0;

    .line 285
    .line 286
    new-instance v14, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 287
    .line 288
    const/16 v26, 0x0

    .line 289
    .line 290
    const/16 v27, 0x1ff

    .line 291
    .line 292
    const/4 v15, 0x0

    .line 293
    const/16 v16, 0x0

    .line 294
    .line 295
    const-wide/16 v17, 0x0

    .line 296
    .line 297
    const/16 v19, 0x0

    .line 298
    .line 299
    const/16 v20, 0x0

    .line 300
    .line 301
    const-wide/16 v21, 0x0

    .line 302
    .line 303
    const-wide/16 v23, 0x0

    .line 304
    .line 305
    const/16 v25, 0x0

    .line 306
    .line 307
    invoke-direct/range {v14 .. v27}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v2, v13, v14, v4}, La/ehf0;->w(La/tm1;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;Z)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    new-instance v5, La/szf0;

    .line 315
    .line 316
    invoke-interface {v2}, La/m7h0;->b()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v6

    .line 320
    invoke-direct {v5, v2, v6}, La/szf0;-><init>(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    new-array v2, v3, [La/t7d;

    .line 324
    .line 325
    aput-object v5, v2, v4

    .line 326
    .line 327
    invoke-virtual {v8, v2}, La/i1w0;->b([La/t7d;)V

    .line 328
    .line 329
    .line 330
    goto :goto_7

    .line 331
    :cond_c
    new-instance v2, La/r91;

    .line 332
    .line 333
    invoke-direct {v2, v0, v1, v6, v4}, La/r91;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZB)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v8, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v12}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 344
    .line 345
    invoke-virtual {v7, v2, v3}, La/nuj0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    :goto_7
    invoke-virtual/range {p0 .. p1}, La/s91;->e(La/lr1;)V

    .line 349
    .line 350
    .line 351
    :cond_d
    :goto_8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object p0, p0, La/s91;->a:La/rl1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, La/c8d;

    .line 12
    .line 13
    sget-object v2, La/y7d;->a:La/v7d;

    .line 14
    .line 15
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 16
    .line 17
    invoke-direct {v1, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, La/i1w0;->c()La/mf50;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1, v0}, La/mf50;->d(Ljava/util/List;)La/lc00;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-virtual {v0, v1}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :goto_0
    move-object v1, v0

    .line 37
    check-cast v1, La/paw;

    .line 38
    .line 39
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, La/oe50;

    .line 50
    .line 51
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    return-void
.end method

.method public final b(Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V
    .locals 5

    .line 1
    iget-object v0, p1, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->d:La/tm1;

    .line 2
    .line 3
    iget-object v1, p2, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->d:La/tm1;

    .line 4
    .line 5
    sget-object v2, La/gm1;->a:La/gm1;

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-nez v3, :cond_1

    .line 12
    .line 13
    iget-object v3, p0, La/s91;->b:La/ehf0;

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    invoke-virtual {v3, v1, p2, v4}, La/ehf0;->w(La/tm1;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;Z)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {v3, v0, p1, v4}, La/ehf0;->w(La/tm1;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;Z)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 p1, 0x0

    .line 32
    :goto_0
    iget-object p0, p0, La/s91;->a:La/rl1;

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    new-instance v0, La/k0w0;

    .line 38
    .line 39
    invoke-direct {v0, p0}, La/k0w0;-><init>(La/i1w0;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p1}, La/k0w0;->c(La/m7h0;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 46
    .line 47
    .line 48
    iget-object p1, v0, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 49
    .line 50
    invoke-virtual {p0}, La/i1w0;->c()La/mf50;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-virtual {p2, p1}, La/mf50;->d(Ljava/util/List;)La/lc00;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p1, v4}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    :goto_1
    move-object p2, p1

    .line 63
    check-cast p2, La/paw;

    .line 64
    .line 65
    invoke-virtual {p2}, La/paw;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_1

    .line 70
    .line 71
    invoke-virtual {p2}, La/paw;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    check-cast p2, La/oe50;

    .line 76
    .line 77
    invoke-virtual {p0, p2}, La/i1w0;->a(La/oe50;)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    return-void
.end method

.method public final c(Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V
    .locals 4

    .line 1
    iget-object v0, p1, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->d:La/tm1;

    .line 2
    .line 3
    sget-object v1, La/gm1;->a:La/gm1;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    iget-object v1, p0, La/s91;->b:La/ehf0;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {v1, v0, p1, v2}, La/ehf0;->w(La/tm1;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;Z)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object p0, p0, La/s91;->a:La/rl1;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    instance-of v1, p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    new-instance v1, La/e1w0;

    .line 33
    .line 34
    check-cast p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 35
    .line 36
    invoke-direct {v1, p1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 37
    .line 38
    .line 39
    new-instance p1, La/c8d;

    .line 40
    .line 41
    sget-object v3, La/y7d;->a:La/v7d;

    .line 42
    .line 43
    invoke-direct {p1, v3, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    new-instance v1, La/w0w0;

    .line 51
    .line 52
    invoke-direct {v1, p1}, La/w0w0;-><init>(La/m7h0;)V

    .line 53
    .line 54
    .line 55
    new-instance p1, La/c8d;

    .line 56
    .line 57
    sget-object v3, La/y7d;->a:La/v7d;

    .line 58
    .line 59
    invoke-direct {p1, v3, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    :goto_0
    invoke-virtual {p0}, La/i1w0;->c()La/mf50;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1, v0}, La/mf50;->d(Ljava/util/List;)La/lc00;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p1, v2}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    :goto_1
    move-object v0, p1

    .line 78
    check-cast v0, La/paw;

    .line 79
    .line 80
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_1

    .line 85
    .line 86
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, La/oe50;

    .line 91
    .line 92
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_1
    return-void
.end method

.method public final e(La/lr1;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/s91;->e:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, La/p91;

    .line 7
    .line 8
    iget-boolean v1, p0, La/s91;->f:Z

    .line 9
    .line 10
    invoke-direct {v0, p1, v1}, La/p91;-><init>(La/lr1;Z)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, La/s91;->d:La/qoj0;

    .line 14
    .line 15
    invoke-virtual {p0, v0}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    sput-object p1, La/uo0;->b:La/lr1;

    .line 19
    .line 20
    return-void
.end method
