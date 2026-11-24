.class public final La/tdg0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Z

.field public final c:La/pwi;

.field public final d:La/ke70;

.field public final e:Ljava/util/List;

.field public final f:La/s1e;


# direct methods
.method public constructor <init>(La/pwi;La/ke70;La/due0;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/tdg0;->c:La/pwi;

    .line 5
    .line 6
    iput-object p2, p0, La/tdg0;->d:La/ke70;

    .line 7
    .line 8
    iget-object p2, p1, La/pwi;->f:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p2, Ljava/util/List;

    .line 11
    .line 12
    iput-object p2, p0, La/tdg0;->e:Ljava/util/List;

    .line 13
    .line 14
    iget-object p2, p1, La/pwi;->e:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v2, p2

    .line 17
    check-cast v2, La/spg0;

    .line 18
    .line 19
    invoke-interface {v2}, La/spg0;->b()Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    const/4 v4, 0x0

    .line 24
    const-string v3, "onexdatabase.name"

    .line 25
    .line 26
    if-eqz p2, :cond_0

    .line 27
    .line 28
    new-instance p1, La/qz80;

    .line 29
    .line 30
    new-instance v0, La/xg0;

    .line 31
    .line 32
    const/4 v5, 0x3

    .line 33
    move-object v1, p0

    .line 34
    invoke-direct/range {v0 .. v5}, La/xg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p1, v0, p3}, La/qz80;-><init>(La/xg0;La/due0;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move-object v1, p0

    .line 42
    iget-object p0, p1, La/pwi;->k:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, La/u1e;

    .line 45
    .line 46
    instance-of p1, p0, La/p0k0;

    .line 47
    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    new-instance v0, La/xg0;

    .line 51
    .line 52
    const/4 v5, 0x3

    .line 53
    invoke-direct/range {v0 .. v5}, La/xg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 54
    .line 55
    .line 56
    new-instance p1, La/z1e;

    .line 57
    .line 58
    invoke-direct {p1, v0}, La/z1e;-><init>(La/xg0;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    instance-of p0, p0, La/ox40;

    .line 63
    .line 64
    if-eqz p0, :cond_2

    .line 65
    .line 66
    new-instance v0, La/xg0;

    .line 67
    .line 68
    const/4 v5, 0x3

    .line 69
    invoke-direct/range {v0 .. v5}, La/xg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 70
    .line 71
    .line 72
    new-instance p1, La/z1e;

    .line 73
    .line 74
    const/4 p0, 0x0

    .line 75
    invoke-direct {p1, v0, p0}, La/z1e;-><init>(La/xg0;I)V

    .line 76
    .line 77
    .line 78
    :goto_0
    iput-object p1, v1, La/tdg0;->f:La/s1e;

    .line 79
    .line 80
    return-void

    .line 81
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 82
    .line 83
    .line 84
    const/4 p0, 0x0

    .line 85
    throw p0
.end method

.method public static c(La/qpg0;)Lkotlin/Unit;
    .locals 5

    .line 1
    const-string v0, "PRAGMA busy_timeout"

    .line 2
    .line 3
    invoke-interface {p0, v0}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :try_start_0
    invoke-interface {v0}, La/xpg0;->W0()Z

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-interface {v0, v1}, La/xpg0;->getLong(I)J

    .line 12
    .line 13
    .line 14
    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-static {v0, v3}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    const-wide/16 v3, 0xbb8

    .line 20
    .line 21
    cmp-long v0, v1, v3

    .line 22
    .line 23
    if-gez v0, :cond_1

    .line 24
    .line 25
    const-string v0, "PRAGMA busy_timeout = 3000"

    .line 26
    .line 27
    invoke-static {p0, v0}, La/j0x;->s(La/qpg0;Ljava/lang/String;)Lkotlin/Unit;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    sget-object v0, La/wne;->a:La/wne;

    .line 32
    .line 33
    if-ne p0, v0, :cond_0

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0

    .line 39
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object p0

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 44
    :catchall_1
    move-exception v1

    .line 45
    invoke-static {v0, p0}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    throw v1
.end method

.method public static k(La/tdg0;La/qpg0;IILa/zje;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    instance-of v5, v4, La/c26;

    .line 12
    .line 13
    if-eqz v5, :cond_0

    .line 14
    .line 15
    move-object v5, v4

    .line 16
    check-cast v5, La/c26;

    .line 17
    .line 18
    iget v6, v5, La/c26;->p:I

    .line 19
    .line 20
    const/high16 v7, -0x80000000

    .line 21
    .line 22
    and-int v8, v6, v7

    .line 23
    .line 24
    if-eqz v8, :cond_0

    .line 25
    .line 26
    sub-int/2addr v6, v7

    .line 27
    iput v6, v5, La/c26;->p:I

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance v5, La/c26;

    .line 31
    .line 32
    invoke-direct {v5, v0, v4}, La/c26;-><init>(La/tdg0;La/zje;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    iget-object v4, v5, La/c26;->n:Ljava/lang/Object;

    .line 36
    .line 37
    sget-object v6, La/wne;->a:La/wne;

    .line 38
    .line 39
    iget v7, v5, La/c26;->p:I

    .line 40
    .line 41
    const/4 v9, 0x1

    .line 42
    const/4 v10, 0x0

    .line 43
    packed-switch v7, :pswitch_data_0

    .line 44
    .line 45
    .line 46
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v10

    .line 52
    :pswitch_0
    invoke-static {v4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_13

    .line 56
    .line 57
    :pswitch_1
    iget-object v0, v5, La/c26;->j:La/qpg0;

    .line 58
    .line 59
    iget-object v1, v5, La/c26;->i:La/tdg0;

    .line 60
    .line 61
    invoke-static {v4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto/16 :goto_11

    .line 65
    .line 66
    :pswitch_2
    iget-object v0, v5, La/c26;->j:La/qpg0;

    .line 67
    .line 68
    iget-object v1, v5, La/c26;->i:La/tdg0;

    .line 69
    .line 70
    invoke-static {v4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    goto/16 :goto_10

    .line 74
    .line 75
    :pswitch_3
    iget-byte v0, v5, La/c26;->m:B

    .line 76
    .line 77
    iget v1, v5, La/c26;->l:I

    .line 78
    .line 79
    iget-object v2, v5, La/c26;->j:La/qpg0;

    .line 80
    .line 81
    iget-object v3, v5, La/c26;->i:La/tdg0;

    .line 82
    .line 83
    invoke-static {v4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    goto/16 :goto_e

    .line 87
    .line 88
    :pswitch_4
    iget-byte v0, v5, La/c26;->m:B

    .line 89
    .line 90
    iget v1, v5, La/c26;->l:I

    .line 91
    .line 92
    iget-object v2, v5, La/c26;->j:La/qpg0;

    .line 93
    .line 94
    iget-object v3, v5, La/c26;->i:La/tdg0;

    .line 95
    .line 96
    invoke-static {v4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    goto/16 :goto_d

    .line 100
    .line 101
    :pswitch_5
    iget-byte v0, v5, La/c26;->m:B

    .line 102
    .line 103
    iget v1, v5, La/c26;->l:I

    .line 104
    .line 105
    iget-object v2, v5, La/c26;->j:La/qpg0;

    .line 106
    .line 107
    iget-object v3, v5, La/c26;->i:La/tdg0;

    .line 108
    .line 109
    invoke-static {v4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    goto/16 :goto_c

    .line 113
    .line 114
    :pswitch_6
    iget-byte v0, v5, La/c26;->m:B

    .line 115
    .line 116
    iget v1, v5, La/c26;->l:I

    .line 117
    .line 118
    iget-object v2, v5, La/c26;->k:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v2, Ljava/util/Iterator;

    .line 121
    .line 122
    iget-object v3, v5, La/c26;->j:La/qpg0;

    .line 123
    .line 124
    iget-object v7, v5, La/c26;->i:La/tdg0;

    .line 125
    .line 126
    invoke-static {v4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    goto/16 :goto_b

    .line 130
    .line 131
    :pswitch_7
    iget-byte v0, v5, La/c26;->m:B

    .line 132
    .line 133
    iget v1, v5, La/c26;->l:I

    .line 134
    .line 135
    iget-object v2, v5, La/c26;->k:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v2, Ljava/util/List;

    .line 138
    .line 139
    iget-object v3, v5, La/c26;->j:La/qpg0;

    .line 140
    .line 141
    iget-object v7, v5, La/c26;->i:La/tdg0;

    .line 142
    .line 143
    invoke-static {v4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    move-object v11, v2

    .line 147
    move v2, v1

    .line 148
    move-object v1, v3

    .line 149
    move v3, v0

    .line 150
    move-object v0, v7

    .line 151
    goto/16 :goto_a

    .line 152
    .line 153
    :pswitch_8
    invoke-static {v4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    iget-object v4, v0, La/tdg0;->c:La/pwi;

    .line 157
    .line 158
    iget-object v4, v4, La/pwi;->b:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v4, La/ajc;

    .line 161
    .line 162
    if-ne v2, v3, :cond_1

    .line 163
    .line 164
    sget-object v4, La/iun;->a:La/iun;

    .line 165
    .line 166
    move-object v11, v4

    .line 167
    goto/16 :goto_8

    .line 168
    .line 169
    :cond_1
    if-le v3, v2, :cond_2

    .line 170
    .line 171
    move v7, v9

    .line 172
    goto :goto_1

    .line 173
    :cond_2
    const/4 v7, 0x0

    .line 174
    :goto_1
    new-instance v11, Ljava/util/ArrayList;

    .line 175
    .line 176
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 177
    .line 178
    .line 179
    move v12, v2

    .line 180
    :cond_3
    if-eqz v7, :cond_4

    .line 181
    .line 182
    if-ge v12, v3, :cond_c

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_4
    if-le v12, v3, :cond_c

    .line 186
    .line 187
    :goto_2
    iget-object v13, v4, La/ajc;->a:Ljava/util/LinkedHashMap;

    .line 188
    .line 189
    if-eqz v7, :cond_6

    .line 190
    .line 191
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 192
    .line 193
    .line 194
    move-result-object v14

    .line 195
    invoke-virtual {v13, v14}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v13

    .line 199
    check-cast v13, Ljava/util/TreeMap;

    .line 200
    .line 201
    if-nez v13, :cond_5

    .line 202
    .line 203
    :goto_3
    move-object v15, v10

    .line 204
    goto :goto_4

    .line 205
    :cond_5
    invoke-virtual {v13}, Ljava/util/TreeMap;->descendingKeySet()Ljava/util/NavigableSet;

    .line 206
    .line 207
    .line 208
    move-result-object v14

    .line 209
    new-instance v15, Lkotlin/Pair;

    .line 210
    .line 211
    invoke-direct {v15, v13, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    goto :goto_4

    .line 215
    :cond_6
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 216
    .line 217
    .line 218
    move-result-object v14

    .line 219
    invoke-virtual {v13, v14}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v13

    .line 223
    check-cast v13, Ljava/util/TreeMap;

    .line 224
    .line 225
    if-nez v13, :cond_7

    .line 226
    .line 227
    goto :goto_3

    .line 228
    :cond_7
    invoke-virtual {v13}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    .line 229
    .line 230
    .line 231
    move-result-object v14

    .line 232
    new-instance v15, Lkotlin/Pair;

    .line 233
    .line 234
    invoke-direct {v15, v13, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    :goto_4
    if-nez v15, :cond_8

    .line 238
    .line 239
    goto :goto_7

    .line 240
    :cond_8
    iget-object v13, v15, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v13, Ljava/util/Map;

    .line 243
    .line 244
    iget-object v14, v15, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v14, Ljava/lang/Iterable;

    .line 247
    .line 248
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 249
    .line 250
    .line 251
    move-result-object v14

    .line 252
    :cond_9
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 253
    .line 254
    .line 255
    move-result v15

    .line 256
    if-eqz v15, :cond_b

    .line 257
    .line 258
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v15

    .line 262
    check-cast v15, Ljava/lang/Number;

    .line 263
    .line 264
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 265
    .line 266
    .line 267
    move-result v15

    .line 268
    if-eqz v7, :cond_a

    .line 269
    .line 270
    add-int/lit8 v8, v12, 0x1

    .line 271
    .line 272
    if-gt v8, v15, :cond_9

    .line 273
    .line 274
    if-gt v15, v3, :cond_9

    .line 275
    .line 276
    goto :goto_5

    .line 277
    :cond_a
    if-gt v3, v15, :cond_9

    .line 278
    .line 279
    if-ge v15, v12, :cond_9

    .line 280
    .line 281
    :goto_5
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 282
    .line 283
    .line 284
    move-result-object v8

    .line 285
    invoke-interface {v13, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v8

    .line 289
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move v8, v9

    .line 296
    move v12, v15

    .line 297
    goto :goto_6

    .line 298
    :cond_b
    const/4 v8, 0x0

    .line 299
    :goto_6
    if-nez v8, :cond_3

    .line 300
    .line 301
    :goto_7
    move-object v11, v10

    .line 302
    :cond_c
    :goto_8
    if-eqz v11, :cond_15

    .line 303
    .line 304
    iput-object v0, v5, La/c26;->i:La/tdg0;

    .line 305
    .line 306
    iput-object v1, v5, La/c26;->j:La/qpg0;

    .line 307
    .line 308
    iput-object v11, v5, La/c26;->k:Ljava/lang/Object;

    .line 309
    .line 310
    iput v2, v5, La/c26;->l:I

    .line 311
    .line 312
    iput-byte v3, v5, La/c26;->m:B

    .line 313
    .line 314
    iput v9, v5, La/c26;->p:I

    .line 315
    .line 316
    invoke-static {v1, v5}, La/sj3;->V(La/qpg0;La/zje;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v4

    .line 320
    if-ne v4, v6, :cond_d

    .line 321
    .line 322
    goto :goto_9

    .line 323
    :cond_d
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 324
    .line 325
    :goto_9
    if-ne v4, v6, :cond_e

    .line 326
    .line 327
    goto/16 :goto_12

    .line 328
    .line 329
    :cond_e
    :goto_a
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 330
    .line 331
    .line 332
    move-result-object v4

    .line 333
    move-object v7, v0

    .line 334
    move v0, v3

    .line 335
    move-object v3, v1

    .line 336
    move v1, v2

    .line 337
    move-object v2, v4

    .line 338
    :cond_f
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 339
    .line 340
    .line 341
    move-result v4

    .line 342
    if-eqz v4, :cond_10

    .line 343
    .line 344
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v4

    .line 348
    check-cast v4, La/dg40;

    .line 349
    .line 350
    iput-object v7, v5, La/c26;->i:La/tdg0;

    .line 351
    .line 352
    iput-object v3, v5, La/c26;->j:La/qpg0;

    .line 353
    .line 354
    iput-object v2, v5, La/c26;->k:Ljava/lang/Object;

    .line 355
    .line 356
    iput v1, v5, La/c26;->l:I

    .line 357
    .line 358
    iput-byte v0, v5, La/c26;->m:B

    .line 359
    .line 360
    const/4 v8, 0x2

    .line 361
    iput v8, v5, La/c26;->p:I

    .line 362
    .line 363
    invoke-virtual {v4, v3}, La/dg40;->a(La/qpg0;)Lkotlin/Unit;

    .line 364
    .line 365
    .line 366
    move-result-object v4

    .line 367
    if-ne v4, v6, :cond_f

    .line 368
    .line 369
    goto/16 :goto_12

    .line 370
    .line 371
    :cond_10
    iget-object v2, v7, La/tdg0;->d:La/ke70;

    .line 372
    .line 373
    iput-object v7, v5, La/c26;->i:La/tdg0;

    .line 374
    .line 375
    iput-object v3, v5, La/c26;->j:La/qpg0;

    .line 376
    .line 377
    iput-object v10, v5, La/c26;->k:Ljava/lang/Object;

    .line 378
    .line 379
    iput v1, v5, La/c26;->l:I

    .line 380
    .line 381
    iput-byte v0, v5, La/c26;->m:B

    .line 382
    .line 383
    const/4 v4, 0x3

    .line 384
    iput v4, v5, La/c26;->p:I

    .line 385
    .line 386
    invoke-virtual {v2, v3, v5}, La/ke70;->b(La/qpg0;La/zje;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v4

    .line 390
    if-ne v4, v6, :cond_11

    .line 391
    .line 392
    goto/16 :goto_12

    .line 393
    .line 394
    :cond_11
    move-object v2, v3

    .line 395
    move-object v3, v7

    .line 396
    :goto_c
    check-cast v4, La/eeg0;

    .line 397
    .line 398
    iget-boolean v7, v4, La/eeg0;->a:Z

    .line 399
    .line 400
    if-eqz v7, :cond_14

    .line 401
    .line 402
    iget-object v4, v3, La/tdg0;->d:La/ke70;

    .line 403
    .line 404
    iput-object v3, v5, La/c26;->i:La/tdg0;

    .line 405
    .line 406
    iput-object v2, v5, La/c26;->j:La/qpg0;

    .line 407
    .line 408
    iput v1, v5, La/c26;->l:I

    .line 409
    .line 410
    iput-byte v0, v5, La/c26;->m:B

    .line 411
    .line 412
    const/4 v4, 0x4

    .line 413
    iput v4, v5, La/c26;->p:I

    .line 414
    .line 415
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 416
    .line 417
    if-ne v4, v6, :cond_12

    .line 418
    .line 419
    goto/16 :goto_12

    .line 420
    .line 421
    :cond_12
    :goto_d
    iput-object v3, v5, La/c26;->i:La/tdg0;

    .line 422
    .line 423
    iput-object v2, v5, La/c26;->j:La/qpg0;

    .line 424
    .line 425
    iput v1, v5, La/c26;->l:I

    .line 426
    .line 427
    iput-byte v0, v5, La/c26;->m:B

    .line 428
    .line 429
    const/4 v4, 0x5

    .line 430
    iput v4, v5, La/c26;->p:I

    .line 431
    .line 432
    invoke-virtual {v3, v2, v5}, La/tdg0;->m(La/qpg0;La/zje;)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v4

    .line 436
    if-ne v4, v6, :cond_13

    .line 437
    .line 438
    goto :goto_12

    .line 439
    :cond_13
    :goto_e
    move-object v8, v3

    .line 440
    move v3, v0

    .line 441
    move-object v0, v8

    .line 442
    move-object v8, v2

    .line 443
    move v2, v1

    .line 444
    move-object v1, v8

    .line 445
    move v8, v9

    .line 446
    goto :goto_f

    .line 447
    :cond_14
    iget-object v0, v4, La/eeg0;->b:Ljava/lang/String;

    .line 448
    .line 449
    const-string v1, "Migration didn\'t properly handle: "

    .line 450
    .line 451
    invoke-static {v0, v1}, La/e9d0;->x(Ljava/lang/Object;Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    return-object v10

    .line 455
    :cond_15
    const/4 v8, 0x0

    .line 456
    :goto_f
    if-nez v8, :cond_1a

    .line 457
    .line 458
    iget-object v4, v0, La/tdg0;->c:La/pwi;

    .line 459
    .line 460
    iget-object v4, v4, La/pwi;->g:Ljava/lang/Object;

    .line 461
    .line 462
    check-cast v4, Ljava/util/LinkedHashSet;

    .line 463
    .line 464
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 465
    .line 466
    .line 467
    move-result-object v7

    .line 468
    invoke-interface {v4, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    move-result v4

    .line 472
    if-eqz v4, :cond_19

    .line 473
    .line 474
    iput-object v0, v5, La/c26;->i:La/tdg0;

    .line 475
    .line 476
    iput-object v1, v5, La/c26;->j:La/qpg0;

    .line 477
    .line 478
    const/4 v2, 0x6

    .line 479
    iput v2, v5, La/c26;->p:I

    .line 480
    .line 481
    invoke-virtual {v0, v1, v5}, La/tdg0;->f(La/qpg0;La/zje;)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    if-ne v2, v6, :cond_16

    .line 486
    .line 487
    goto :goto_12

    .line 488
    :cond_16
    move-object/from16 v16, v1

    .line 489
    .line 490
    move-object v1, v0

    .line 491
    move-object/from16 v0, v16

    .line 492
    .line 493
    :goto_10
    iput-object v1, v5, La/c26;->i:La/tdg0;

    .line 494
    .line 495
    iput-object v0, v5, La/c26;->j:La/qpg0;

    .line 496
    .line 497
    const/4 v2, 0x7

    .line 498
    iput v2, v5, La/c26;->p:I

    .line 499
    .line 500
    invoke-virtual {v1, v0, v5}, La/tdg0;->h(La/qpg0;La/zje;)Lkotlin/Unit;

    .line 501
    .line 502
    .line 503
    move-result-object v2

    .line 504
    if-ne v2, v6, :cond_17

    .line 505
    .line 506
    goto :goto_12

    .line 507
    :cond_17
    :goto_11
    iget-object v1, v1, La/tdg0;->d:La/ke70;

    .line 508
    .line 509
    iput-object v10, v5, La/c26;->i:La/tdg0;

    .line 510
    .line 511
    iput-object v10, v5, La/c26;->j:La/qpg0;

    .line 512
    .line 513
    const/16 v1, 0x8

    .line 514
    .line 515
    iput v1, v5, La/c26;->p:I

    .line 516
    .line 517
    invoke-static {v0}, La/ke70;->a(La/qpg0;)Lkotlin/Unit;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    if-ne v0, v6, :cond_18

    .line 522
    .line 523
    :goto_12
    return-object v6

    .line 524
    :cond_18
    :goto_13
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 525
    .line 526
    return-object v0

    .line 527
    :cond_19
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 528
    .line 529
    new-instance v1, Ljava/lang/StringBuilder;

    .line 530
    .line 531
    const-string v4, "A migration from "

    .line 532
    .line 533
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 537
    .line 538
    .line 539
    const-string v2, " to "

    .line 540
    .line 541
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 542
    .line 543
    .line 544
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 545
    .line 546
    .line 547
    const-string v2, " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions."

    .line 548
    .line 549
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 550
    .line 551
    .line 552
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    move-result-object v1

    .line 556
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 557
    .line 558
    .line 559
    move-result-object v1

    .line 560
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 561
    .line 562
    .line 563
    throw v0

    .line 564
    :cond_1a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 565
    .line 566
    return-object v0

    .line 567
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(La/qpg0;La/zje;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, La/tdg0;->d:La/ke70;

    .line 2
    .line 3
    const-string v1, "Pre-packaged database has an invalid schema: "

    .line 4
    .line 5
    instance-of v2, p2, La/u16;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, p2

    .line 10
    check-cast v2, La/u16;

    .line 11
    .line 12
    iget v3, v2, La/u16;->m:I

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
    iput v3, v2, La/u16;->m:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/u16;

    .line 25
    .line 26
    invoke-direct {v2, p0, p2}, La/u16;-><init>(La/tdg0;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p2, v2, La/u16;->k:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/u16;->m:I

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x0

    .line 37
    packed-switch v4, :pswitch_data_0

    .line 38
    .line 39
    .line 40
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-object v6

    .line 46
    :pswitch_0
    iget-object p0, v2, La/u16;->i:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, Ljava/lang/Throwable;

    .line 49
    .line 50
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_d

    .line 54
    .line 55
    :pswitch_1
    iget-object p0, v2, La/u16;->j:Ljava/lang/Object;

    .line 56
    .line 57
    iget-object p1, v2, La/u16;->i:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, La/qpg0;

    .line 60
    .line 61
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto/16 :goto_b

    .line 65
    .line 66
    :pswitch_2
    iget-object p0, v2, La/u16;->i:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p0, La/qpg0;

    .line 69
    .line 70
    :try_start_0
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    .line 73
    goto/16 :goto_8

    .line 74
    .line 75
    :catchall_0
    move-exception p1

    .line 76
    goto/16 :goto_9

    .line 77
    .line 78
    :pswitch_3
    iget-object p0, v2, La/u16;->j:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p0, La/tdg0;

    .line 81
    .line 82
    iget-object p1, v2, La/u16;->i:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast p1, La/qpg0;

    .line 85
    .line 86
    :try_start_1
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 87
    .line 88
    .line 89
    goto/16 :goto_7

    .line 90
    .line 91
    :catchall_1
    move-exception p0

    .line 92
    move-object v11, p1

    .line 93
    move-object p1, p0

    .line 94
    move-object p0, v11

    .line 95
    goto/16 :goto_9

    .line 96
    .line 97
    :pswitch_4
    iget-object p0, v2, La/u16;->j:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast p0, La/tdg0;

    .line 100
    .line 101
    iget-object p1, v2, La/u16;->i:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast p1, La/qpg0;

    .line 104
    .line 105
    :try_start_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 106
    .line 107
    .line 108
    goto/16 :goto_6

    .line 109
    .line 110
    :pswitch_5
    iget-object p1, v2, La/u16;->i:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p1, La/qpg0;

    .line 113
    .line 114
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    goto/16 :goto_5

    .line 118
    .line 119
    :pswitch_6
    iget-object p1, v2, La/u16;->i:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast p1, La/qpg0;

    .line 122
    .line 123
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :pswitch_7
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    iput-object p1, v2, La/u16;->i:Ljava/lang/Object;

    .line 131
    .line 132
    const/4 p2, 0x1

    .line 133
    iput p2, v2, La/u16;->m:I

    .line 134
    .line 135
    const-string v4, "SELECT 1 FROM sqlite_master WHERE type = \'table\' AND name = \'room_master_table\'"

    .line 136
    .line 137
    invoke-interface {p1, v4}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    :try_start_3
    invoke-interface {v4}, La/xpg0;->W0()Z

    .line 142
    .line 143
    .line 144
    move-result v7

    .line 145
    if-eqz v7, :cond_1

    .line 146
    .line 147
    invoke-interface {v4, v5}, La/xpg0;->getLong(I)J

    .line 148
    .line 149
    .line 150
    move-result-wide v7

    .line 151
    const-wide/16 v9, 0x0

    .line 152
    .line 153
    cmp-long v7, v7, v9

    .line 154
    .line 155
    if-eqz v7, :cond_1

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :catchall_2
    move-exception p0

    .line 159
    goto/16 :goto_f

    .line 160
    .line 161
    :cond_1
    move p2, v5

    .line 162
    :goto_1
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 163
    .line 164
    .line 165
    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 166
    invoke-static {v4, v6}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 167
    .line 168
    .line 169
    if-ne p2, v3, :cond_2

    .line 170
    .line 171
    goto/16 :goto_c

    .line 172
    .line 173
    :cond_2
    :goto_2
    check-cast p2, Ljava/lang/Boolean;

    .line 174
    .line 175
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 176
    .line 177
    .line 178
    move-result p2

    .line 179
    if-eqz p2, :cond_5

    .line 180
    .line 181
    const-string p0, "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"

    .line 182
    .line 183
    invoke-interface {p1, p0}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    :try_start_4
    invoke-interface {p0}, La/xpg0;->W0()Z

    .line 188
    .line 189
    .line 190
    move-result p1

    .line 191
    if-eqz p1, :cond_3

    .line 192
    .line 193
    invoke-interface {p0, v5}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 197
    goto :goto_3

    .line 198
    :catchall_3
    move-exception p1

    .line 199
    goto :goto_4

    .line 200
    :cond_3
    move-object p1, v6

    .line 201
    :goto_3
    invoke-static {p0, v6}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 202
    .line 203
    .line 204
    const-string p0, "9c0f7c853a4da42d379e451bd4efb125"

    .line 205
    .line 206
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result p0

    .line 210
    if-nez p0, :cond_d

    .line 211
    .line 212
    const-string p0, "3a804b75b4586e7ea44eeec525afff4a"

    .line 213
    .line 214
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result p0

    .line 218
    if-eqz p0, :cond_4

    .line 219
    .line 220
    goto/16 :goto_e

    .line 221
    .line 222
    :cond_4
    const-string p0, "Room cannot verify the data integrity. Looks like you\'ve changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 9c0f7c853a4da42d379e451bd4efb125, found: "

    .line 223
    .line 224
    invoke-static {p1, p0}, La/udk;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    return-object v6

    .line 228
    :goto_4
    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 229
    :catchall_4
    move-exception p2

    .line 230
    invoke-static {p0, p1}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 231
    .line 232
    .line 233
    throw p2

    .line 234
    :cond_5
    iput-object p1, v2, La/u16;->i:Ljava/lang/Object;

    .line 235
    .line 236
    const/4 p2, 0x2

    .line 237
    iput p2, v2, La/u16;->m:I

    .line 238
    .line 239
    const-string p2, "BEGIN EXCLUSIVE TRANSACTION"

    .line 240
    .line 241
    invoke-static {p1, p2}, La/j0x;->s(La/qpg0;Ljava/lang/String;)Lkotlin/Unit;

    .line 242
    .line 243
    .line 244
    move-result-object p2

    .line 245
    if-ne p2, v3, :cond_6

    .line 246
    .line 247
    goto/16 :goto_c

    .line 248
    .line 249
    :cond_6
    :goto_5
    :try_start_6
    sget-object p2, La/j0g0;->b:La/e0g0;

    .line 250
    .line 251
    iput-object p1, v2, La/u16;->i:Ljava/lang/Object;

    .line 252
    .line 253
    iput-object p0, v2, La/u16;->j:Ljava/lang/Object;

    .line 254
    .line 255
    const/4 p2, 0x3

    .line 256
    iput p2, v2, La/u16;->m:I

    .line 257
    .line 258
    invoke-virtual {v0, p1, v2}, La/ke70;->b(La/qpg0;La/zje;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object p2

    .line 262
    if-ne p2, v3, :cond_7

    .line 263
    .line 264
    goto/16 :goto_c

    .line 265
    .line 266
    :cond_7
    :goto_6
    check-cast p2, La/eeg0;

    .line 267
    .line 268
    iget-boolean v0, p2, La/eeg0;->a:Z

    .line 269
    .line 270
    if-eqz v0, :cond_a

    .line 271
    .line 272
    iget-object p2, p0, La/tdg0;->d:La/ke70;

    .line 273
    .line 274
    iput-object p1, v2, La/u16;->i:Ljava/lang/Object;

    .line 275
    .line 276
    iput-object p0, v2, La/u16;->j:Ljava/lang/Object;

    .line 277
    .line 278
    const/4 p2, 0x4

    .line 279
    iput p2, v2, La/u16;->m:I

    .line 280
    .line 281
    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 282
    .line 283
    if-ne p2, v3, :cond_8

    .line 284
    .line 285
    goto :goto_c

    .line 286
    :cond_8
    :goto_7
    iput-object p1, v2, La/u16;->i:Ljava/lang/Object;

    .line 287
    .line 288
    iput-object v6, v2, La/u16;->j:Ljava/lang/Object;

    .line 289
    .line 290
    const/4 p2, 0x5

    .line 291
    iput p2, v2, La/u16;->m:I

    .line 292
    .line 293
    invoke-virtual {p0, p1, v2}, La/tdg0;->m(La/qpg0;La/zje;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 297
    if-ne p0, v3, :cond_9

    .line 298
    .line 299
    goto :goto_c

    .line 300
    :cond_9
    move-object p0, p1

    .line 301
    :goto_8
    :try_start_7
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 302
    .line 303
    sget-object p2, La/j0g0;->b:La/e0g0;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 304
    .line 305
    move-object v11, p1

    .line 306
    move-object p1, p0

    .line 307
    move-object p0, v11

    .line 308
    goto :goto_a

    .line 309
    :cond_a
    :try_start_8
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 310
    .line 311
    iget-object p2, p2, La/eeg0;->b:Ljava/lang/String;

    .line 312
    .line 313
    new-instance v0, Ljava/lang/StringBuilder;

    .line 314
    .line 315
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object p2

    .line 325
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object p2

    .line 329
    invoke-direct {p0, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    throw p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 333
    :goto_9
    sget-object p2, La/j0g0;->b:La/e0g0;

    .line 334
    .line 335
    new-instance p2, La/g0g0;

    .line 336
    .line 337
    invoke-direct {p2, p1}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 338
    .line 339
    .line 340
    move-object p1, p0

    .line 341
    move-object p0, p2

    .line 342
    :goto_a
    nop

    .line 343
    instance-of p2, p0, La/g0g0;

    .line 344
    .line 345
    if-nez p2, :cond_b

    .line 346
    .line 347
    move-object p2, p0

    .line 348
    check-cast p2, Lkotlin/Unit;

    .line 349
    .line 350
    iput-object p1, v2, La/u16;->i:Ljava/lang/Object;

    .line 351
    .line 352
    iput-object p0, v2, La/u16;->j:Ljava/lang/Object;

    .line 353
    .line 354
    const/4 p2, 0x6

    .line 355
    iput p2, v2, La/u16;->m:I

    .line 356
    .line 357
    const-string p2, "END TRANSACTION"

    .line 358
    .line 359
    invoke-static {p1, p2}, La/j0x;->s(La/qpg0;Ljava/lang/String;)Lkotlin/Unit;

    .line 360
    .line 361
    .line 362
    move-result-object p2

    .line 363
    if-ne p2, v3, :cond_b

    .line 364
    .line 365
    goto :goto_c

    .line 366
    :cond_b
    :goto_b
    invoke-static {p0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 367
    .line 368
    .line 369
    move-result-object p0

    .line 370
    if-eqz p0, :cond_d

    .line 371
    .line 372
    iput-object p0, v2, La/u16;->i:Ljava/lang/Object;

    .line 373
    .line 374
    iput-object v6, v2, La/u16;->j:Ljava/lang/Object;

    .line 375
    .line 376
    const/4 p2, 0x7

    .line 377
    iput p2, v2, La/u16;->m:I

    .line 378
    .line 379
    const-string p2, "ROLLBACK TRANSACTION"

    .line 380
    .line 381
    invoke-static {p1, p2}, La/j0x;->s(La/qpg0;Ljava/lang/String;)Lkotlin/Unit;

    .line 382
    .line 383
    .line 384
    move-result-object p1

    .line 385
    if-ne p1, v3, :cond_c

    .line 386
    .line 387
    :goto_c
    return-object v3

    .line 388
    :cond_c
    :goto_d
    throw p0

    .line 389
    :cond_d
    :goto_e
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 390
    .line 391
    return-object p0

    .line 392
    :goto_f
    :try_start_9
    throw p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 393
    :catchall_5
    move-exception p1

    .line 394
    invoke-static {v4, p0}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 395
    .line 396
    .line 397
    throw p1

    .line 398
    nop

    .line 399
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(La/qpg0;La/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, La/v16;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/v16;

    .line 7
    .line 8
    iget v1, v0, La/v16;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/v16;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/v16;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/v16;-><init>(La/tdg0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/v16;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/v16;->l:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x3

    .line 33
    const/4 v5, 0x2

    .line 34
    const/4 v6, 0x1

    .line 35
    if-eqz v2, :cond_4

    .line 36
    .line 37
    if-eq v2, v6, :cond_3

    .line 38
    .line 39
    if-eq v2, v5, :cond_2

    .line 40
    .line 41
    if-ne v2, v4, :cond_1

    .line 42
    .line 43
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_6

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v3

    .line 53
    :cond_2
    iget-object p1, v0, La/v16;->i:La/qpg0;

    .line 54
    .line 55
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    iget-object p1, v0, La/v16;->i:La/qpg0;

    .line 60
    .line 61
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_4
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iput-object p1, v0, La/v16;->i:La/qpg0;

    .line 69
    .line 70
    iput v6, v0, La/v16;->l:I

    .line 71
    .line 72
    invoke-static {p1}, La/tdg0;->c(La/qpg0;)Lkotlin/Unit;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    if-ne p2, v1, :cond_5

    .line 77
    .line 78
    goto :goto_5

    .line 79
    :cond_5
    :goto_1
    iput-object p1, v0, La/v16;->i:La/qpg0;

    .line 80
    .line 81
    iput v5, v0, La/v16;->l:I

    .line 82
    .line 83
    invoke-virtual {p0, p1}, La/tdg0;->e(La/qpg0;)Lkotlin/Unit;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    if-ne p2, v1, :cond_6

    .line 88
    .line 89
    goto :goto_5

    .line 90
    :cond_6
    :goto_2
    iput-object v3, v0, La/v16;->i:La/qpg0;

    .line 91
    .line 92
    iput v4, v0, La/v16;->l:I

    .line 93
    .line 94
    iget-object p0, p0, La/tdg0;->d:La/ke70;

    .line 95
    .line 96
    iget-object p0, p0, La/ke70;->a:Lorg/xplatform/onexdatabase/OnexDatabase_Impl;

    .line 97
    .line 98
    sget p2, Lorg/xplatform/onexdatabase/OnexDatabase_Impl;->y:I

    .line 99
    .line 100
    invoke-virtual {p0}, La/zdg0;->d()La/lox;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-virtual {p0, p1, v0}, La/lox;->a(La/qpg0;La/zje;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    if-ne p0, v1, :cond_7

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 112
    .line 113
    :goto_3
    if-ne p0, v1, :cond_8

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    :goto_4
    if-ne p0, v1, :cond_9

    .line 119
    .line 120
    :goto_5
    return-object v1

    .line 121
    :cond_9
    :goto_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    return-object p0
.end method

.method public final d(La/qpg0;La/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, La/w16;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/w16;

    .line 7
    .line 8
    iget v1, v0, La/w16;->n:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/w16;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/w16;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/w16;-><init>(La/tdg0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/w16;->l:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/w16;->n:I

    .line 30
    .line 31
    const/16 v3, 0x2e

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    packed-switch v2, :pswitch_data_0

    .line 35
    .line 36
    .line 37
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 38
    .line 39
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object v4

    .line 43
    :pswitch_0
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto/16 :goto_f

    .line 47
    .line 48
    :pswitch_1
    iget-object p0, v0, La/w16;->i:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p0, Ljava/lang/Throwable;

    .line 51
    .line 52
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_d

    .line 56
    .line 57
    :pswitch_2
    iget-object p1, v0, La/w16;->j:Ljava/lang/Object;

    .line 58
    .line 59
    iget-object v2, v0, La/w16;->i:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v2, La/qpg0;

    .line 62
    .line 63
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto/16 :goto_c

    .line 67
    .line 68
    :pswitch_3
    iget-object p1, v0, La/w16;->i:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p1, La/qpg0;

    .line 71
    .line 72
    :try_start_0
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    .line 74
    .line 75
    goto/16 :goto_9

    .line 76
    .line 77
    :catchall_0
    move-exception p2

    .line 78
    goto/16 :goto_a

    .line 79
    .line 80
    :pswitch_4
    iget-object p1, v0, La/w16;->j:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p1, La/tdg0;

    .line 83
    .line 84
    iget-object v2, v0, La/w16;->i:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v2, La/qpg0;

    .line 87
    .line 88
    :goto_1
    :try_start_1
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 89
    .line 90
    .line 91
    goto/16 :goto_7

    .line 92
    .line 93
    :catchall_1
    move-exception p2

    .line 94
    move-object p1, v2

    .line 95
    goto/16 :goto_a

    .line 96
    .line 97
    :pswitch_5
    iget-object p1, v0, La/w16;->j:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast p1, La/tdg0;

    .line 100
    .line 101
    iget-object v2, v0, La/w16;->i:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v2, La/qpg0;

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :pswitch_6
    iget p1, v0, La/w16;->k:I

    .line 107
    .line 108
    iget-object v2, v0, La/w16;->i:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v2, La/qpg0;

    .line 111
    .line 112
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    goto/16 :goto_6

    .line 116
    .line 117
    :pswitch_7
    iget-object p1, v0, La/w16;->i:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast p1, La/qpg0;

    .line 120
    .line 121
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    goto :goto_5

    .line 125
    :pswitch_8
    iget-object p1, v0, La/w16;->i:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast p1, La/qpg0;

    .line 128
    .line 129
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    goto :goto_4

    .line 133
    :pswitch_9
    iget-object p1, v0, La/w16;->i:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast p1, La/qpg0;

    .line 136
    .line 137
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    goto :goto_2

    .line 141
    :pswitch_a
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    iput-object p1, v0, La/w16;->i:Ljava/lang/Object;

    .line 145
    .line 146
    const/4 p2, 0x1

    .line 147
    iput p2, v0, La/w16;->n:I

    .line 148
    .line 149
    invoke-static {p1}, La/tdg0;->c(La/qpg0;)Lkotlin/Unit;

    .line 150
    .line 151
    .line 152
    move-result-object p2

    .line 153
    if-ne p2, v1, :cond_1

    .line 154
    .line 155
    goto/16 :goto_e

    .line 156
    .line 157
    :cond_1
    :goto_2
    iput-object p1, v0, La/w16;->i:Ljava/lang/Object;

    .line 158
    .line 159
    const/4 p2, 0x2

    .line 160
    iput p2, v0, La/w16;->n:I

    .line 161
    .line 162
    iget-object p2, p0, La/tdg0;->c:La/pwi;

    .line 163
    .line 164
    iget-object p2, p2, La/pwi;->c:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast p2, La/xdg0;

    .line 167
    .line 168
    sget-object v2, La/xdg0;->b:La/xdg0;

    .line 169
    .line 170
    if-ne p2, v2, :cond_3

    .line 171
    .line 172
    const-string p2, "PRAGMA journal_mode = WAL"

    .line 173
    .line 174
    invoke-static {p1, p2}, La/j0x;->s(La/qpg0;Ljava/lang/String;)Lkotlin/Unit;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    if-ne p2, v1, :cond_2

    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_2
    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_3
    const-string p2, "PRAGMA journal_mode = TRUNCATE"

    .line 185
    .line 186
    invoke-static {p1, p2}, La/j0x;->s(La/qpg0;Ljava/lang/String;)Lkotlin/Unit;

    .line 187
    .line 188
    .line 189
    move-result-object p2

    .line 190
    if-ne p2, v1, :cond_4

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_4
    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 194
    .line 195
    :goto_3
    if-ne p2, v1, :cond_5

    .line 196
    .line 197
    goto/16 :goto_e

    .line 198
    .line 199
    :cond_5
    :goto_4
    iput-object p1, v0, La/w16;->i:Ljava/lang/Object;

    .line 200
    .line 201
    const/4 p2, 0x3

    .line 202
    iput p2, v0, La/w16;->n:I

    .line 203
    .line 204
    invoke-virtual {p0, p1}, La/tdg0;->e(La/qpg0;)Lkotlin/Unit;

    .line 205
    .line 206
    .line 207
    move-result-object p2

    .line 208
    if-ne p2, v1, :cond_6

    .line 209
    .line 210
    goto/16 :goto_e

    .line 211
    .line 212
    :cond_6
    :goto_5
    const-string p2, "PRAGMA user_version"

    .line 213
    .line 214
    invoke-interface {p1, p2}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 215
    .line 216
    .line 217
    move-result-object p2

    .line 218
    :try_start_2
    invoke-interface {p2}, La/xpg0;->W0()Z

    .line 219
    .line 220
    .line 221
    const/4 v2, 0x0

    .line 222
    invoke-interface {p2, v2}, La/xpg0;->getLong(I)J

    .line 223
    .line 224
    .line 225
    move-result-wide v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 226
    long-to-int v2, v5

    .line 227
    invoke-static {p2, v4}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 228
    .line 229
    .line 230
    if-eq v2, v3, :cond_e

    .line 231
    .line 232
    iput-object p1, v0, La/w16;->i:Ljava/lang/Object;

    .line 233
    .line 234
    iput v2, v0, La/w16;->k:I

    .line 235
    .line 236
    const/4 p2, 0x4

    .line 237
    iput p2, v0, La/w16;->n:I

    .line 238
    .line 239
    const-string p2, "BEGIN EXCLUSIVE TRANSACTION"

    .line 240
    .line 241
    invoke-static {p1, p2}, La/j0x;->s(La/qpg0;Ljava/lang/String;)Lkotlin/Unit;

    .line 242
    .line 243
    .line 244
    move-result-object p2

    .line 245
    if-ne p2, v1, :cond_7

    .line 246
    .line 247
    goto/16 :goto_e

    .line 248
    .line 249
    :cond_7
    move v7, v2

    .line 250
    move-object v2, p1

    .line 251
    move p1, v7

    .line 252
    :goto_6
    :try_start_3
    sget-object p2, La/j0g0;->b:La/e0g0;

    .line 253
    .line 254
    if-nez p1, :cond_9

    .line 255
    .line 256
    iput-object v2, v0, La/w16;->i:Ljava/lang/Object;

    .line 257
    .line 258
    iput-object p0, v0, La/w16;->j:Ljava/lang/Object;

    .line 259
    .line 260
    const/4 p1, 0x5

    .line 261
    iput p1, v0, La/w16;->n:I

    .line 262
    .line 263
    invoke-virtual {p0, v2, v0}, La/tdg0;->j(La/qpg0;La/zje;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    if-ne p1, v1, :cond_8

    .line 268
    .line 269
    goto/16 :goto_e

    .line 270
    .line 271
    :cond_8
    move-object p1, p0

    .line 272
    :goto_7
    move-object p2, p1

    .line 273
    move-object p1, v2

    .line 274
    goto :goto_8

    .line 275
    :cond_9
    iput-object v2, v0, La/w16;->i:Ljava/lang/Object;

    .line 276
    .line 277
    iput-object p0, v0, La/w16;->j:Ljava/lang/Object;

    .line 278
    .line 279
    const/4 p2, 0x6

    .line 280
    iput p2, v0, La/w16;->n:I

    .line 281
    .line 282
    invoke-static {p0, v2, p1, v3, v0}, La/tdg0;->k(La/tdg0;La/qpg0;IILa/zje;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 286
    if-ne p1, v1, :cond_8

    .line 287
    .line 288
    goto/16 :goto_e

    .line 289
    .line 290
    :goto_8
    :try_start_4
    iget-object p2, p2, La/tdg0;->d:La/ke70;

    .line 291
    .line 292
    const-string p2, "PRAGMA user_version = 46"

    .line 293
    .line 294
    iput-object p1, v0, La/w16;->i:Ljava/lang/Object;

    .line 295
    .line 296
    iput-object v4, v0, La/w16;->j:Ljava/lang/Object;

    .line 297
    .line 298
    const/4 v2, 0x7

    .line 299
    iput v2, v0, La/w16;->n:I

    .line 300
    .line 301
    invoke-static {p1, p2}, La/j0x;->s(La/qpg0;Ljava/lang/String;)Lkotlin/Unit;

    .line 302
    .line 303
    .line 304
    move-result-object p2

    .line 305
    if-ne p2, v1, :cond_a

    .line 306
    .line 307
    goto :goto_e

    .line 308
    :cond_a
    :goto_9
    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 309
    .line 310
    sget-object v2, La/j0g0;->b:La/e0g0;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 311
    .line 312
    move-object v2, p1

    .line 313
    move-object p1, p2

    .line 314
    goto :goto_b

    .line 315
    :goto_a
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 316
    .line 317
    new-instance v2, La/g0g0;

    .line 318
    .line 319
    invoke-direct {v2, p2}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 320
    .line 321
    .line 322
    move-object v7, v2

    .line 323
    move-object v2, p1

    .line 324
    move-object p1, v7

    .line 325
    :goto_b
    instance-of p2, p1, La/g0g0;

    .line 326
    .line 327
    if-nez p2, :cond_b

    .line 328
    .line 329
    move-object p2, p1

    .line 330
    check-cast p2, Lkotlin/Unit;

    .line 331
    .line 332
    iput-object v2, v0, La/w16;->i:Ljava/lang/Object;

    .line 333
    .line 334
    iput-object p1, v0, La/w16;->j:Ljava/lang/Object;

    .line 335
    .line 336
    const/16 p2, 0x8

    .line 337
    .line 338
    iput p2, v0, La/w16;->n:I

    .line 339
    .line 340
    const-string p2, "END TRANSACTION"

    .line 341
    .line 342
    invoke-static {v2, p2}, La/j0x;->s(La/qpg0;Ljava/lang/String;)Lkotlin/Unit;

    .line 343
    .line 344
    .line 345
    move-result-object p2

    .line 346
    if-ne p2, v1, :cond_b

    .line 347
    .line 348
    goto :goto_e

    .line 349
    :cond_b
    :goto_c
    invoke-static {p1}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 350
    .line 351
    .line 352
    move-result-object p1

    .line 353
    if-eqz p1, :cond_d

    .line 354
    .line 355
    iput-object p1, v0, La/w16;->i:Ljava/lang/Object;

    .line 356
    .line 357
    iput-object v4, v0, La/w16;->j:Ljava/lang/Object;

    .line 358
    .line 359
    const/16 p0, 0x9

    .line 360
    .line 361
    iput p0, v0, La/w16;->n:I

    .line 362
    .line 363
    const-string p0, "ROLLBACK TRANSACTION"

    .line 364
    .line 365
    invoke-static {v2, p0}, La/j0x;->s(La/qpg0;Ljava/lang/String;)Lkotlin/Unit;

    .line 366
    .line 367
    .line 368
    move-result-object p0

    .line 369
    if-ne p0, v1, :cond_c

    .line 370
    .line 371
    goto :goto_e

    .line 372
    :cond_c
    move-object p0, p1

    .line 373
    :goto_d
    throw p0

    .line 374
    :cond_d
    move-object p1, v2

    .line 375
    :cond_e
    iput-object v4, v0, La/w16;->i:Ljava/lang/Object;

    .line 376
    .line 377
    iput-object v4, v0, La/w16;->j:Ljava/lang/Object;

    .line 378
    .line 379
    const/16 p2, 0xa

    .line 380
    .line 381
    iput p2, v0, La/w16;->n:I

    .line 382
    .line 383
    invoke-virtual {p0, p1, v0}, La/tdg0;->l(La/qpg0;La/zje;)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object p0

    .line 387
    if-ne p0, v1, :cond_f

    .line 388
    .line 389
    :goto_e
    return-object v1

    .line 390
    :cond_f
    :goto_f
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 391
    .line 392
    return-object p0

    .line 393
    :catchall_2
    move-exception p0

    .line 394
    :try_start_5
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 395
    :catchall_3
    move-exception p1

    .line 396
    invoke-static {p2, p0}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 397
    .line 398
    .line 399
    throw p1

    .line 400
    nop

    .line 401
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final e(La/qpg0;)Lkotlin/Unit;
    .locals 1

    .line 1
    iget-object p0, p0, La/tdg0;->c:La/pwi;

    .line 2
    .line 3
    iget-object p0, p0, La/pwi;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/xdg0;

    .line 6
    .line 7
    sget-object v0, La/xdg0;->b:La/xdg0;

    .line 8
    .line 9
    if-ne p0, v0, :cond_1

    .line 10
    .line 11
    const-string p0, "PRAGMA synchronous = NORMAL"

    .line 12
    .line 13
    invoke-static {p1, p0}, La/j0x;->s(La/qpg0;Ljava/lang/String;)Lkotlin/Unit;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object p1, La/wne;->a:La/wne;

    .line 18
    .line 19
    if-ne p0, p1, :cond_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    const-string p0, "PRAGMA synchronous = FULL"

    .line 26
    .line 27
    invoke-static {p1, p0}, La/j0x;->s(La/qpg0;Ljava/lang/String;)Lkotlin/Unit;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    sget-object p1, La/wne;->a:La/wne;

    .line 32
    .line 33
    if-ne p0, p1, :cond_2

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0
.end method

.method public final f(La/qpg0;La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, La/x16;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/x16;

    .line 7
    .line 8
    iget v1, v0, La/x16;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/x16;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/x16;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/x16;-><init>(La/tdg0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, La/x16;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object p2, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v1, v0, La/x16;->m:I

    .line 30
    .line 31
    const/4 v2, 0x3

    .line 32
    if-eqz v1, :cond_6

    .line 33
    .line 34
    const/4 p1, 0x2

    .line 35
    const/4 v3, 0x1

    .line 36
    if-eq v1, v3, :cond_2

    .line 37
    .line 38
    if-eq v1, p1, :cond_2

    .line 39
    .line 40
    if-ne v1, v2, :cond_1

    .line 41
    .line 42
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto/16 :goto_2

    .line 46
    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    return-object p0

    .line 54
    :cond_2
    iget-object v1, v0, La/x16;->j:Ljava/util/Iterator;

    .line 55
    .line 56
    iget-object v2, v0, La/x16;->i:La/qpg0;

    .line 57
    .line 58
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-eqz p0, :cond_5

    .line 66
    .line 67
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    check-cast p0, Lkotlin/Pair;

    .line 72
    .line 73
    iget-object v4, p0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v4, Ljava/lang/String;

    .line 76
    .line 77
    iget-object p0, p0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p0, Ljava/lang/Boolean;

    .line 80
    .line 81
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    const-string v5, "`"

    .line 86
    .line 87
    if-eqz p0, :cond_4

    .line 88
    .line 89
    const-string p0, "DROP VIEW IF EXISTS `"

    .line 90
    .line 91
    invoke-static {p0, v4, v5}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    iput-object v2, v0, La/x16;->i:La/qpg0;

    .line 96
    .line 97
    iput-object v1, v0, La/x16;->j:Ljava/util/Iterator;

    .line 98
    .line 99
    iput v3, v0, La/x16;->m:I

    .line 100
    .line 101
    invoke-static {v2, p0}, La/j0x;->s(La/qpg0;Ljava/lang/String;)Lkotlin/Unit;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    if-ne p0, p2, :cond_3

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_4
    const-string p0, "DROP TABLE IF EXISTS `"

    .line 109
    .line 110
    invoke-static {p0, v4, v5}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    iput-object v2, v0, La/x16;->i:La/qpg0;

    .line 115
    .line 116
    iput-object v1, v0, La/x16;->j:Ljava/util/Iterator;

    .line 117
    .line 118
    iput p1, v0, La/x16;->m:I

    .line 119
    .line 120
    invoke-static {v2, p0}, La/j0x;->s(La/qpg0;Ljava/lang/String;)Lkotlin/Unit;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    if-ne p0, p2, :cond_3

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 128
    .line 129
    return-object p0

    .line 130
    :cond_6
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    iput v2, v0, La/x16;->m:I

    .line 134
    .line 135
    const-string p0, "DROP TABLE IF EXISTS `bet_events`"

    .line 136
    .line 137
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    const-string p0, "DROP TABLE IF EXISTS `currencies`"

    .line 141
    .line 142
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    const-string p0, "DROP TABLE IF EXISTS `sports`"

    .line 146
    .line 147
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    const-string p0, "DROP TABLE IF EXISTS `events`"

    .line 151
    .line 152
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    const-string p0, "DROP TABLE IF EXISTS `event_groups`"

    .line 156
    .line 157
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    const-string p0, "DROP TABLE IF EXISTS `favorite_champs`"

    .line 161
    .line 162
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    const-string p0, "DROP TABLE IF EXISTS `strings`"

    .line 166
    .line 167
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    const-string p0, "DROP TABLE IF EXISTS `last_action`"

    .line 171
    .line 172
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    const-string p0, "DROP TABLE IF EXISTS `country`"

    .line 176
    .line 177
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    const-string p0, "DROP TABLE IF EXISTS `market_filter`"

    .line 181
    .line 182
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    const-string p0, "DROP TABLE IF EXISTS `statistic_dictionaries`"

    .line 186
    .line 187
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    const-string p0, "DROP TABLE IF EXISTS `registration`"

    .line 191
    .line 192
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    const-string p0, "DROP TABLE IF EXISTS `quick_bet_settings_table`"

    .line 196
    .line 197
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    const-string p0, "DROP TABLE IF EXISTS `news_catalog_banners`"

    .line 201
    .line 202
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    const-string p0, "DROP TABLE IF EXISTS `news_catalog_cms_banners`"

    .line 206
    .line 207
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 211
    .line 212
    if-ne p0, p2, :cond_7

    .line 213
    .line 214
    :goto_1
    return-object p2

    .line 215
    :cond_7
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 216
    .line 217
    return-object p0
.end method

.method public final g(La/qpg0;La/zje;)Lkotlin/Unit;
    .locals 4

    .line 1
    instance-of v0, p2, La/y16;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/y16;

    .line 7
    .line 8
    iget v1, v0, La/y16;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/y16;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/y16;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/y16;-><init>(La/tdg0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/y16;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v1, v0, La/y16;->m:I

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    if-ne v1, v3, :cond_1

    .line 36
    .line 37
    iget-object p0, v0, La/y16;->j:Ljava/util/Iterator;

    .line 38
    .line 39
    iget-object p1, v0, La/y16;->i:La/qpg0;

    .line 40
    .line 41
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v2

    .line 51
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object p0, p0, La/tdg0;->e:Ljava/util/List;

    .line 55
    .line 56
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    if-nez p2, :cond_3

    .line 65
    .line 66
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object p0

    .line 69
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    if-eqz p2, :cond_4

    .line 74
    .line 75
    invoke-static {}, La/hny;->b()V

    .line 76
    .line 77
    .line 78
    return-object v2

    .line 79
    :cond_4
    iput-object p1, v0, La/y16;->i:La/qpg0;

    .line 80
    .line 81
    iput-object p0, v0, La/y16;->j:Ljava/util/Iterator;

    .line 82
    .line 83
    iput v3, v0, La/y16;->m:I

    .line 84
    .line 85
    throw v2
.end method

.method public final h(La/qpg0;La/zje;)Lkotlin/Unit;
    .locals 4

    .line 1
    instance-of v0, p2, La/z16;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/z16;

    .line 7
    .line 8
    iget v1, v0, La/z16;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/z16;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/z16;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/z16;-><init>(La/tdg0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/z16;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v1, v0, La/z16;->m:I

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    if-ne v1, v3, :cond_1

    .line 36
    .line 37
    iget-object p0, v0, La/z16;->j:Ljava/util/Iterator;

    .line 38
    .line 39
    iget-object p1, v0, La/z16;->i:La/qpg0;

    .line 40
    .line 41
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v2

    .line 51
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object p0, p0, La/tdg0;->e:Ljava/util/List;

    .line 55
    .line 56
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    if-nez p2, :cond_3

    .line 65
    .line 66
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object p0

    .line 69
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    if-eqz p2, :cond_4

    .line 74
    .line 75
    invoke-static {}, La/hny;->b()V

    .line 76
    .line 77
    .line 78
    return-object v2

    .line 79
    :cond_4
    iput-object p1, v0, La/z16;->i:La/qpg0;

    .line 80
    .line 81
    iput-object p0, v0, La/z16;->j:Ljava/util/Iterator;

    .line 82
    .line 83
    iput v3, v0, La/z16;->m:I

    .line 84
    .line 85
    throw v2
.end method

.method public final i(La/qpg0;La/zje;)Lkotlin/Unit;
    .locals 4

    .line 1
    instance-of v0, p2, La/a26;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/a26;

    .line 7
    .line 8
    iget v1, v0, La/a26;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/a26;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/a26;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/a26;-><init>(La/tdg0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/a26;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v1, v0, La/a26;->m:I

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    if-ne v1, v3, :cond_1

    .line 36
    .line 37
    iget-object p0, v0, La/a26;->j:Ljava/util/Iterator;

    .line 38
    .line 39
    iget-object p1, v0, La/a26;->i:La/qpg0;

    .line 40
    .line 41
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v2

    .line 51
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object p0, p0, La/tdg0;->e:Ljava/util/List;

    .line 55
    .line 56
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    if-nez p2, :cond_3

    .line 65
    .line 66
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object p0

    .line 69
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    if-eqz p2, :cond_4

    .line 74
    .line 75
    invoke-static {}, La/hny;->b()V

    .line 76
    .line 77
    .line 78
    return-object v2

    .line 79
    :cond_4
    iput-object p1, v0, La/a26;->i:La/qpg0;

    .line 80
    .line 81
    iput-object p0, v0, La/a26;->j:Ljava/util/Iterator;

    .line 82
    .line 83
    iput v3, v0, La/a26;->m:I

    .line 84
    .line 85
    throw v2
.end method

.method public final j(La/qpg0;La/zje;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p2, La/b26;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/b26;

    .line 7
    .line 8
    iget v1, v0, La/b26;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/b26;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/b26;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/b26;-><init>(La/tdg0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/b26;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/b26;->m:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    packed-switch v2, :pswitch_data_0

    .line 33
    .line 34
    .line 35
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 36
    .line 37
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-object v3

    .line 41
    :pswitch_0
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto/16 :goto_9

    .line 45
    .line 46
    :pswitch_1
    iget-object p1, v0, La/b26;->i:La/qpg0;

    .line 47
    .line 48
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto/16 :goto_7

    .line 52
    .line 53
    :pswitch_2
    iget-object p1, v0, La/b26;->i:La/qpg0;

    .line 54
    .line 55
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto/16 :goto_6

    .line 59
    .line 60
    :pswitch_3
    iget-object p1, v0, La/b26;->i:La/qpg0;

    .line 61
    .line 62
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto/16 :goto_4

    .line 66
    .line 67
    :pswitch_4
    iget-boolean p1, v0, La/b26;->j:Z

    .line 68
    .line 69
    iget-object v2, v0, La/b26;->i:La/qpg0;

    .line 70
    .line 71
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto :goto_3

    .line 75
    :pswitch_5
    iget-object p1, v0, La/b26;->i:La/qpg0;

    .line 76
    .line 77
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    goto :goto_2

    .line 81
    :pswitch_6
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    iput-object p1, v0, La/b26;->i:La/qpg0;

    .line 85
    .line 86
    const/4 p2, 0x1

    .line 87
    iput p2, v0, La/b26;->m:I

    .line 88
    .line 89
    const-string v2, "SELECT count(*) FROM sqlite_master WHERE name != \'android_metadata\'"

    .line 90
    .line 91
    invoke-interface {p1, v2}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    :try_start_0
    invoke-interface {v2}, La/xpg0;->W0()Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    const/4 v5, 0x0

    .line 100
    if-eqz v4, :cond_1

    .line 101
    .line 102
    invoke-interface {v2, v5}, La/xpg0;->getLong(I)J

    .line 103
    .line 104
    .line 105
    move-result-wide v6

    .line 106
    const-wide/16 v8, 0x0

    .line 107
    .line 108
    cmp-long v4, v6, v8

    .line 109
    .line 110
    if-nez v4, :cond_1

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :catchall_0
    move-exception p0

    .line 114
    goto/16 :goto_a

    .line 115
    .line 116
    :cond_1
    move p2, v5

    .line 117
    :goto_1
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 118
    .line 119
    .line 120
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    invoke-static {v2, v3}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 122
    .line 123
    .line 124
    if-ne p2, v1, :cond_2

    .line 125
    .line 126
    goto :goto_8

    .line 127
    :cond_2
    :goto_2
    check-cast p2, Ljava/lang/Boolean;

    .line 128
    .line 129
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    iput-object p1, v0, La/b26;->i:La/qpg0;

    .line 134
    .line 135
    iput-boolean p2, v0, La/b26;->j:Z

    .line 136
    .line 137
    const/4 v2, 0x2

    .line 138
    iput v2, v0, La/b26;->m:I

    .line 139
    .line 140
    invoke-static {p1}, La/ke70;->a(La/qpg0;)Lkotlin/Unit;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    if-ne v2, v1, :cond_3

    .line 145
    .line 146
    goto :goto_8

    .line 147
    :cond_3
    move-object v2, p1

    .line 148
    move p1, p2

    .line 149
    :goto_3
    if-nez p1, :cond_6

    .line 150
    .line 151
    iput-object v2, v0, La/b26;->i:La/qpg0;

    .line 152
    .line 153
    const/4 p1, 0x3

    .line 154
    iput p1, v0, La/b26;->m:I

    .line 155
    .line 156
    iget-object p1, p0, La/tdg0;->d:La/ke70;

    .line 157
    .line 158
    invoke-virtual {p1, v2, v0}, La/ke70;->b(La/qpg0;La/zje;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p2

    .line 162
    if-ne p2, v1, :cond_4

    .line 163
    .line 164
    goto :goto_8

    .line 165
    :cond_4
    move-object p1, v2

    .line 166
    :goto_4
    check-cast p2, La/eeg0;

    .line 167
    .line 168
    iget-boolean v2, p2, La/eeg0;->a:Z

    .line 169
    .line 170
    if-eqz v2, :cond_5

    .line 171
    .line 172
    move-object v2, p1

    .line 173
    goto :goto_5

    .line 174
    :cond_5
    iget-object p0, p2, La/eeg0;->b:Ljava/lang/String;

    .line 175
    .line 176
    const-string p1, "Pre-packaged database has an invalid schema: "

    .line 177
    .line 178
    invoke-static {p0, p1}, La/e9d0;->x(Ljava/lang/Object;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    return-object v3

    .line 182
    :cond_6
    :goto_5
    iput-object v2, v0, La/b26;->i:La/qpg0;

    .line 183
    .line 184
    const/4 p1, 0x4

    .line 185
    iput p1, v0, La/b26;->m:I

    .line 186
    .line 187
    invoke-virtual {p0, v2, v0}, La/tdg0;->m(La/qpg0;La/zje;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    if-ne p1, v1, :cond_7

    .line 192
    .line 193
    goto :goto_8

    .line 194
    :cond_7
    move-object p1, v2

    .line 195
    :goto_6
    iput-object p1, v0, La/b26;->i:La/qpg0;

    .line 196
    .line 197
    const/4 p2, 0x5

    .line 198
    iput p2, v0, La/b26;->m:I

    .line 199
    .line 200
    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 201
    .line 202
    if-ne p2, v1, :cond_8

    .line 203
    .line 204
    goto :goto_8

    .line 205
    :cond_8
    :goto_7
    iput-object v3, v0, La/b26;->i:La/qpg0;

    .line 206
    .line 207
    const/4 p2, 0x6

    .line 208
    iput p2, v0, La/b26;->m:I

    .line 209
    .line 210
    invoke-virtual {p0, p1, v0}, La/tdg0;->g(La/qpg0;La/zje;)Lkotlin/Unit;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    if-ne p0, v1, :cond_9

    .line 215
    .line 216
    :goto_8
    return-object v1

    .line 217
    :cond_9
    :goto_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 218
    .line 219
    return-object p0

    .line 220
    :goto_a
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 221
    :catchall_1
    move-exception p1

    .line 222
    invoke-static {v2, p0}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 223
    .line 224
    .line 225
    throw p1

    .line 226
    nop

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final l(La/qpg0;La/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, La/d26;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/d26;

    .line 7
    .line 8
    iget v1, v0, La/d26;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/d26;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/d26;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/d26;-><init>(La/tdg0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/d26;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/d26;->l:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x3

    .line 33
    const/4 v5, 0x2

    .line 34
    const/4 v6, 0x1

    .line 35
    if-eqz v2, :cond_4

    .line 36
    .line 37
    if-eq v2, v6, :cond_3

    .line 38
    .line 39
    if-eq v2, v5, :cond_2

    .line 40
    .line 41
    if-ne v2, v4, :cond_1

    .line 42
    .line 43
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_6

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v3

    .line 53
    :cond_2
    iget-object p1, v0, La/d26;->i:La/qpg0;

    .line 54
    .line 55
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_4

    .line 59
    :cond_3
    iget-object p1, v0, La/d26;->i:La/qpg0;

    .line 60
    .line 61
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_4
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iput-object p1, v0, La/d26;->i:La/qpg0;

    .line 69
    .line 70
    iput v6, v0, La/d26;->l:I

    .line 71
    .line 72
    invoke-virtual {p0, p1, v0}, La/tdg0;->a(La/qpg0;La/zje;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    if-ne p2, v1, :cond_5

    .line 77
    .line 78
    goto :goto_5

    .line 79
    :cond_5
    :goto_1
    iput-object p1, v0, La/d26;->i:La/qpg0;

    .line 80
    .line 81
    iput v5, v0, La/d26;->l:I

    .line 82
    .line 83
    iget-object p2, p0, La/tdg0;->d:La/ke70;

    .line 84
    .line 85
    iget-object p2, p2, La/ke70;->a:Lorg/xplatform/onexdatabase/OnexDatabase_Impl;

    .line 86
    .line 87
    sget v2, Lorg/xplatform/onexdatabase/OnexDatabase_Impl;->y:I

    .line 88
    .line 89
    invoke-virtual {p2}, La/zdg0;->d()La/lox;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-virtual {p2, p1, v0}, La/lox;->a(La/qpg0;La/zje;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    if-ne p2, v1, :cond_6

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_6
    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    :goto_2
    if-ne p2, v1, :cond_7

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_7
    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    :goto_3
    if-ne p2, v1, :cond_8

    .line 108
    .line 109
    goto :goto_5

    .line 110
    :cond_8
    :goto_4
    iput-object v3, v0, La/d26;->i:La/qpg0;

    .line 111
    .line 112
    iput v4, v0, La/d26;->l:I

    .line 113
    .line 114
    invoke-virtual {p0, p1, v0}, La/tdg0;->i(La/qpg0;La/zje;)Lkotlin/Unit;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    if-ne p1, v1, :cond_9

    .line 119
    .line 120
    :goto_5
    return-object v1

    .line 121
    :cond_9
    :goto_6
    iput-boolean v6, p0, La/tdg0;->a:Z

    .line 122
    .line 123
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    return-object p0
.end method

.method public final m(La/qpg0;La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, La/f26;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/f26;

    .line 7
    .line 8
    iget v1, v0, La/f26;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/f26;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/f26;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/f26;-><init>(La/tdg0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, La/f26;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object p2, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v1, v0, La/f26;->l:I

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x2

    .line 33
    const/4 v4, 0x1

    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    if-eq v1, v4, :cond_2

    .line 37
    .line 38
    if-ne v1, v3, :cond_1

    .line 39
    .line 40
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_4

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v2

    .line 50
    :cond_2
    iget-object p1, v0, La/f26;->i:La/qpg0;

    .line 51
    .line 52
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iput-object p1, v0, La/f26;->i:La/qpg0;

    .line 60
    .line 61
    iput v4, v0, La/f26;->l:I

    .line 62
    .line 63
    const-string p0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    .line 64
    .line 65
    invoke-static {p1, p0}, La/j0x;->s(La/qpg0;Ljava/lang/String;)Lkotlin/Unit;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    if-ne p0, p2, :cond_4

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    :goto_1
    if-ne p0, p2, :cond_5

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_5
    :goto_2
    iput-object v2, v0, La/f26;->i:La/qpg0;

    .line 78
    .line 79
    iput v3, v0, La/f26;->l:I

    .line 80
    .line 81
    const-string p0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'9c0f7c853a4da42d379e451bd4efb125\')"

    .line 82
    .line 83
    invoke-static {p1, p0}, La/j0x;->s(La/qpg0;Ljava/lang/String;)Lkotlin/Unit;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    if-ne p0, p2, :cond_6

    .line 88
    .line 89
    :goto_3
    return-object p2

    .line 90
    :cond_6
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    return-object p0
.end method

.method public final n(ZLkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, La/sdg0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/sdg0;

    .line 7
    .line 8
    iget v1, v0, La/sdg0;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/sdg0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/sdg0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/sdg0;-><init>(La/tdg0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/sdg0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/sdg0;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    :try_start_0
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :try_start_1
    iget-object p0, p0, La/tdg0;->f:La/s1e;

    .line 51
    .line 52
    iput v3, v0, La/sdg0;->k:I

    .line 53
    .line 54
    invoke-interface {p0, p1, p2, v0}, La/s1e;->m(ZLkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    if-ne p3, v1, :cond_3

    .line 59
    .line 60
    return-object v1

    .line 61
    :cond_3
    :goto_1
    return-object p3

    .line 62
    :catchall_0
    move-exception p0

    .line 63
    throw p0
.end method
