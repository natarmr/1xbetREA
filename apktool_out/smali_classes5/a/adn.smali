.class public final La/adn;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/f430;

.field public final b:La/onv;

.field public final c:La/knf0;

.field public final d:La/us3;


# direct methods
.method public constructor <init>(La/f430;La/onv;La/knf0;La/us3;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/adn;->a:La/f430;

    .line 14
    .line 15
    iput-object p2, p0, La/adn;->b:La/onv;

    .line 16
    .line 17
    iput-object p3, p0, La/adn;->c:La/knf0;

    .line 18
    .line 19
    iput-object p4, p0, La/adn;->d:La/us3;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a(La/r530;La/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, La/ycn;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/ycn;

    .line 7
    .line 8
    iget v1, v0, La/ycn;->l:I

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
    iput v1, v0, La/ycn;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/ycn;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/ycn;-><init>(La/adn;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/ycn;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/ycn;->l:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    const/4 v5, 0x0

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v4, :cond_2

    .line 37
    .line 38
    if-ne v2, v3, :cond_1

    .line 39
    .line 40
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

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
    return-object v5

    .line 50
    :cond_2
    iget-object p0, v0, La/ycn;->i:La/f430;

    .line 51
    .line 52
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object p2, p0, La/adn;->a:La/f430;

    .line 60
    .line 61
    iput-object p2, v0, La/ycn;->i:La/f430;

    .line 62
    .line 63
    iput v4, v0, La/ycn;->l:I

    .line 64
    .line 65
    invoke-virtual {p0, p1, v0}, La/adn;->b(La/r530;La/zje;)Ljava/io/Serializable;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    if-ne p0, v1, :cond_4

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_4
    move-object v6, p2

    .line 73
    move-object p2, p0

    .line 74
    move-object p0, v6

    .line 75
    :goto_1
    check-cast p2, Ljava/util/List;

    .line 76
    .line 77
    iput-object v5, v0, La/ycn;->i:La/f430;

    .line 78
    .line 79
    iput v3, v0, La/ycn;->l:I

    .line 80
    .line 81
    iget-object p0, p0, La/f430;->a:La/qoj0;

    .line 82
    .line 83
    invoke-virtual {p0, p2, v0}, La/qoj0;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    if-ne p0, v1, :cond_5

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    :goto_2
    if-ne p0, v1, :cond_6

    .line 93
    .line 94
    :goto_3
    return-object v1

    .line 95
    :cond_6
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 96
    .line 97
    return-object p0
.end method

.method public final b(La/r530;La/zje;)Ljava/io/Serializable;
    .locals 50

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    instance-of v3, v2, La/zcn;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, La/zcn;

    .line 13
    .line 14
    iget v4, v3, La/zcn;->l:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, La/zcn;->l:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, La/zcn;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, La/zcn;-><init>(La/adn;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, La/zcn;->j:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v5, v3, La/zcn;->l:I

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    const/4 v9, 0x1

    .line 39
    if-eqz v5, :cond_2

    .line 40
    .line 41
    if-ne v5, v9, :cond_1

    .line 42
    .line 43
    iget-object v1, v3, La/zcn;->i:La/r530;

    .line 44
    .line 45
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    move-object/from16 p2, v6

    .line 49
    .line 50
    move v6, v9

    .line 51
    const-wide/16 v16, 0x0

    .line 52
    .line 53
    goto/16 :goto_2

    .line 54
    .line 55
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v6

    .line 61
    :cond_2
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-boolean v2, v1, La/r530;->e:Z

    .line 65
    .line 66
    if-eqz v2, :cond_3

    .line 67
    .line 68
    const-string v2, "FeedLive"

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    const-string v2, "FeedLine"

    .line 72
    .line 73
    :goto_1
    iget-wide v10, v1, La/r530;->b:J

    .line 74
    .line 75
    iget v5, v1, La/r530;->f:I

    .line 76
    .line 77
    iget-object v12, v0, La/adn;->c:La/knf0;

    .line 78
    .line 79
    invoke-virtual {v12}, La/knf0;->b()I

    .line 80
    .line 81
    .line 82
    move-result v13

    .line 83
    iget-wide v14, v1, La/r530;->c:J

    .line 84
    .line 85
    move-object/from16 p2, v6

    .line 86
    .line 87
    iget-boolean v6, v1, La/r530;->d:Z

    .line 88
    .line 89
    invoke-virtual {v12}, La/knf0;->c()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v12

    .line 93
    const-wide/16 v16, 0x0

    .line 94
    .line 95
    iget v7, v1, La/r530;->h:I

    .line 96
    .line 97
    iget-object v8, v1, La/r530;->i:Ljava/util/List;

    .line 98
    .line 99
    move/from16 v18, v9

    .line 100
    .line 101
    iget-object v9, v1, La/r530;->j:Ljava/util/List;

    .line 102
    .line 103
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    move/from16 v19, v5

    .line 110
    .line 111
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 112
    .line 113
    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 114
    .line 115
    .line 116
    move/from16 v20, v6

    .line 117
    .line 118
    const-string v6, "cfView"

    .line 119
    .line 120
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    invoke-interface {v5, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    const-string v6, "country"

    .line 128
    .line 129
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    invoke-interface {v5, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    const-string v6, "fcountry"

    .line 137
    .line 138
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    invoke-interface {v5, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    const-string v6, "gameId"

    .line 146
    .line 147
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    invoke-interface {v5, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    const-string v6, "lng"

    .line 155
    .line 156
    invoke-interface {v5, v6, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    const-string v6, "ref"

    .line 160
    .line 161
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    invoke-interface {v5, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->z0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 169
    .line 170
    .line 171
    move-result-object v21

    .line 172
    const/16 v25, 0x0

    .line 173
    .line 174
    const/16 v26, 0x3e

    .line 175
    .line 176
    const-string v22, ","

    .line 177
    .line 178
    const/16 v23, 0x0

    .line 179
    .line 180
    const/16 v24, 0x0

    .line 181
    .line 182
    invoke-static/range {v21 .. v26}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    const-string v7, "team1Ids"

    .line 187
    .line 188
    invoke-interface {v5, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->z0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 192
    .line 193
    .line 194
    move-result-object v21

    .line 195
    const-string v22, ","

    .line 196
    .line 197
    invoke-static/range {v21 .. v26}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v6

    .line 201
    const-string v7, "team2Ids"

    .line 202
    .line 203
    invoke-interface {v5, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    if-eqz v20, :cond_4

    .line 207
    .line 208
    cmp-long v6, v14, v16

    .line 209
    .line 210
    if-lez v6, :cond_4

    .line 211
    .line 212
    const-string v6, "userId"

    .line 213
    .line 214
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 215
    .line 216
    .line 217
    move-result-object v7

    .line 218
    invoke-interface {v5, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    :cond_4
    const-string v6, "whence"

    .line 222
    .line 223
    const/16 v7, 0x16

    .line 224
    .line 225
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 226
    .line 227
    .line 228
    move-result-object v7

    .line 229
    invoke-interface {v5, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    iput-object v1, v3, La/zcn;->i:La/r530;

    .line 233
    .line 234
    move/from16 v6, v18

    .line 235
    .line 236
    iput v6, v3, La/zcn;->l:I

    .line 237
    .line 238
    iget-object v7, v0, La/adn;->b:La/onv;

    .line 239
    .line 240
    iget-object v7, v7, La/onv;->a:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v7, La/tpv;

    .line 243
    .line 244
    invoke-virtual {v7}, La/tpv;->invoke()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v7

    .line 248
    check-cast v7, La/gga0;

    .line 249
    .line 250
    invoke-interface {v7, v2, v5, v3}, La/gga0;->a(Ljava/lang/String;Ljava/util/Map;La/yje;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    if-ne v2, v4, :cond_5

    .line 255
    .line 256
    return-object v4

    .line 257
    :cond_5
    :goto_2
    check-cast v2, La/dx5;

    .line 258
    .line 259
    invoke-virtual {v2}, La/dx5;->a()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    check-cast v2, Ljava/lang/Iterable;

    .line 264
    .line 265
    new-instance v3, Ljava/util/ArrayList;

    .line 266
    .line 267
    const/16 v4, 0xa

    .line 268
    .line 269
    invoke-static {v2, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 270
    .line 271
    .line 272
    move-result v5

    .line 273
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 274
    .line 275
    .line 276
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 281
    .line 282
    .line 283
    move-result v5

    .line 284
    if-eqz v5, :cond_21

    .line 285
    .line 286
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v5

    .line 290
    check-cast v5, La/pcn;

    .line 291
    .line 292
    iget-wide v7, v1, La/r530;->b:J

    .line 293
    .line 294
    iget-wide v9, v1, La/r530;->a:J

    .line 295
    .line 296
    iget-boolean v11, v1, La/r530;->e:Z

    .line 297
    .line 298
    iget-object v12, v0, La/adn;->d:La/us3;

    .line 299
    .line 300
    invoke-virtual {v12}, La/us3;->a()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v12

    .line 304
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    iget-object v13, v5, La/pcn;->b:Ljava/util/List;

    .line 308
    .line 309
    iget-object v14, v5, La/pcn;->a:Ljava/lang/Long;

    .line 310
    .line 311
    if-eqz v13, :cond_1f

    .line 312
    .line 313
    new-instance v15, Ljava/util/ArrayList;

    .line 314
    .line 315
    invoke-static {v13, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 316
    .line 317
    .line 318
    move-result v6

    .line 319
    invoke-direct {v15, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 320
    .line 321
    .line 322
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 323
    .line 324
    .line 325
    move-result-object v6

    .line 326
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 327
    .line 328
    .line 329
    move-result v13

    .line 330
    if-eqz v13, :cond_1e

    .line 331
    .line 332
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v13

    .line 336
    check-cast v13, Ljava/util/List;

    .line 337
    .line 338
    new-instance v0, Ljava/util/ArrayList;

    .line 339
    .line 340
    move-object/from16 p1, v1

    .line 341
    .line 342
    invoke-static {v13, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 343
    .line 344
    .line 345
    move-result v1

    .line 346
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 347
    .line 348
    .line 349
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    const/16 v19, 0x0

    .line 354
    .line 355
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 356
    .line 357
    .line 358
    move-result v18

    .line 359
    if-eqz v18, :cond_1d

    .line 360
    .line 361
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v18

    .line 365
    add-int/lit8 v42, v19, 0x1

    .line 366
    .line 367
    if-ltz v19, :cond_1c

    .line 368
    .line 369
    move-object/from16 v4, v18

    .line 370
    .line 371
    check-cast v4, La/ocn;

    .line 372
    .line 373
    if-eqz v14, :cond_6

    .line 374
    .line 375
    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    .line 376
    .line 377
    .line 378
    move-result-wide v20

    .line 379
    move-wide/from16 v26, v20

    .line 380
    .line 381
    goto :goto_6

    .line 382
    :cond_6
    move-wide/from16 v26, v16

    .line 383
    .line 384
    :goto_6
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 385
    .line 386
    .line 387
    new-instance v18, La/ig7;

    .line 388
    .line 389
    iget-object v13, v4, La/ocn;->a:Ljava/lang/Long;

    .line 390
    .line 391
    move-object/from16 v43, v1

    .line 392
    .line 393
    iget-object v1, v4, La/ocn;->f:La/ncn;

    .line 394
    .line 395
    move-object/from16 v44, v2

    .line 396
    .line 397
    iget-object v2, v4, La/ocn;->e:Ljava/lang/String;

    .line 398
    .line 399
    move-object/from16 v45, v6

    .line 400
    .line 401
    iget-object v6, v4, La/ocn;->c:Ljava/lang/Double;

    .line 402
    .line 403
    move-object/from16 v20, v6

    .line 404
    .line 405
    iget-object v6, v4, La/ocn;->b:Ljava/lang/Double;

    .line 406
    .line 407
    if-eqz v13, :cond_7

    .line 408
    .line 409
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 410
    .line 411
    .line 412
    move-result-wide v21

    .line 413
    goto :goto_7

    .line 414
    :cond_7
    move-wide/from16 v21, v16

    .line 415
    .line 416
    :goto_7
    const-wide/16 v23, 0x0

    .line 417
    .line 418
    if-eqz v6, :cond_8

    .line 419
    .line 420
    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    .line 421
    .line 422
    .line 423
    move-result-wide v28

    .line 424
    goto :goto_8

    .line 425
    :cond_8
    move-wide/from16 v28, v23

    .line 426
    .line 427
    :goto_8
    if-eqz v20, :cond_9

    .line 428
    .line 429
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Double;->doubleValue()D

    .line 430
    .line 431
    .line 432
    move-result-wide v23

    .line 433
    :cond_9
    if-eqz v20, :cond_a

    .line 434
    .line 435
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Double;->doubleValue()D

    .line 436
    .line 437
    .line 438
    move-result-wide v30

    .line 439
    invoke-static/range {v30 .. v31}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v13

    .line 443
    goto :goto_9

    .line 444
    :cond_a
    move-object/from16 v13, p2

    .line 445
    .line 446
    :goto_9
    const-string v20, ""

    .line 447
    .line 448
    if-nez v13, :cond_b

    .line 449
    .line 450
    move-object/from16 v30, v20

    .line 451
    .line 452
    goto :goto_a

    .line 453
    :cond_b
    move-object/from16 v30, v13

    .line 454
    .line 455
    :goto_a
    iget-object v13, v4, La/ocn;->d:Ljava/lang/Boolean;

    .line 456
    .line 457
    if-eqz v13, :cond_c

    .line 458
    .line 459
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 460
    .line 461
    .line 462
    move-result v13

    .line 463
    move/from16 v31, v13

    .line 464
    .line 465
    goto :goto_b

    .line 466
    :cond_c
    const/16 v31, 0x0

    .line 467
    .line 468
    :goto_b
    if-nez v2, :cond_d

    .line 469
    .line 470
    move-object/from16 v32, v20

    .line 471
    .line 472
    goto :goto_c

    .line 473
    :cond_d
    move-object/from16 v32, v2

    .line 474
    .line 475
    :goto_c
    const-string v13, "SP"

    .line 476
    .line 477
    if-eqz v6, :cond_e

    .line 478
    .line 479
    invoke-static {v2, v13}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 480
    .line 481
    .line 482
    move-result v25

    .line 483
    if-eqz v25, :cond_f

    .line 484
    .line 485
    :cond_e
    move-object/from16 v25, v6

    .line 486
    .line 487
    move-wide/from16 v33, v7

    .line 488
    .line 489
    goto :goto_d

    .line 490
    :cond_f
    if-eqz v2, :cond_10

    .line 491
    .line 492
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 493
    .line 494
    .line 495
    move-result v25

    .line 496
    if-lez v25, :cond_10

    .line 497
    .line 498
    move-object/from16 v25, v6

    .line 499
    .line 500
    move-wide/from16 v33, v7

    .line 501
    .line 502
    move-object v6, v2

    .line 503
    goto :goto_e

    .line 504
    :cond_10
    sget-object v25, La/pn40;->a:La/pn40;

    .line 505
    .line 506
    move-wide/from16 v33, v7

    .line 507
    .line 508
    move-object v8, v6

    .line 509
    invoke-virtual {v8}, Ljava/lang/Double;->doubleValue()D

    .line 510
    .line 511
    .line 512
    move-result-wide v6

    .line 513
    move-object/from16 v25, v8

    .line 514
    .line 515
    sget-object v8, La/p3u0;->e:La/p3u0;

    .line 516
    .line 517
    invoke-static {v6, v7, v8}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object v6

    .line 521
    goto :goto_e

    .line 522
    :goto_d
    move-object v6, v13

    .line 523
    :goto_e
    new-instance v7, La/rh7;

    .line 524
    .line 525
    if-eqz v1, :cond_11

    .line 526
    .line 527
    iget-object v8, v1, La/ncn;->a:Ljava/lang/Long;

    .line 528
    .line 529
    if-eqz v8, :cond_11

    .line 530
    .line 531
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 532
    .line 533
    .line 534
    move-result-wide v35

    .line 535
    move-wide/from16 v46, v9

    .line 536
    .line 537
    move-wide/from16 v8, v35

    .line 538
    .line 539
    goto :goto_f

    .line 540
    :cond_11
    move-wide/from16 v46, v9

    .line 541
    .line 542
    move-wide/from16 v8, v16

    .line 543
    .line 544
    :goto_f
    if-eqz v1, :cond_12

    .line 545
    .line 546
    iget-object v1, v1, La/ncn;->b:Ljava/lang/String;

    .line 547
    .line 548
    goto :goto_10

    .line 549
    :cond_12
    move-object/from16 v1, p2

    .line 550
    .line 551
    :goto_10
    if-nez v1, :cond_13

    .line 552
    .line 553
    move-object/from16 v1, v20

    .line 554
    .line 555
    :cond_13
    invoke-direct {v7, v8, v9, v1}, La/rh7;-><init>(JLjava/lang/String;)V

    .line 556
    .line 557
    .line 558
    if-eqz v11, :cond_14

    .line 559
    .line 560
    sget-object v1, La/uoy;->d:La/uoy;

    .line 561
    .line 562
    :goto_11
    move-object/from16 v35, v1

    .line 563
    .line 564
    goto :goto_12

    .line 565
    :cond_14
    sget-object v1, La/uoy;->e:La/uoy;

    .line 566
    .line 567
    goto :goto_11

    .line 568
    :goto_12
    if-eqz v25, :cond_16

    .line 569
    .line 570
    invoke-static {v2, v13}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 571
    .line 572
    .line 573
    move-result v1

    .line 574
    if-eqz v1, :cond_15

    .line 575
    .line 576
    goto :goto_13

    .line 577
    :cond_15
    const/16 v36, 0x0

    .line 578
    .line 579
    goto :goto_14

    .line 580
    :cond_16
    :goto_13
    const/16 v36, 0x1

    .line 581
    .line 582
    :goto_14
    sget-object v37, La/yfa0;->INSTANCE:La/yfa0;

    .line 583
    .line 584
    iget-object v1, v4, La/ocn;->g:Ljava/lang/Boolean;

    .line 585
    .line 586
    if-eqz v1, :cond_17

    .line 587
    .line 588
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 589
    .line 590
    .line 591
    move-result v1

    .line 592
    move/from16 v38, v1

    .line 593
    .line 594
    goto :goto_15

    .line 595
    :cond_17
    const/16 v38, 0x0

    .line 596
    .line 597
    :goto_15
    iget-object v1, v4, La/ocn;->h:La/kcn;

    .line 598
    .line 599
    new-instance v2, La/afo;

    .line 600
    .line 601
    if-eqz v1, :cond_18

    .line 602
    .line 603
    iget-object v4, v1, La/kcn;->a:Ljava/util/List;

    .line 604
    .line 605
    goto :goto_16

    .line 606
    :cond_18
    move-object/from16 v4, p2

    .line 607
    .line 608
    :goto_16
    if-nez v4, :cond_19

    .line 609
    .line 610
    sget-object v4, La/iun;->a:La/iun;

    .line 611
    .line 612
    :cond_19
    if-eqz v1, :cond_1a

    .line 613
    .line 614
    iget-object v1, v1, La/kcn;->b:Ljava/util/List;

    .line 615
    .line 616
    goto :goto_17

    .line 617
    :cond_1a
    move-object/from16 v1, p2

    .line 618
    .line 619
    :goto_17
    if-nez v1, :cond_1b

    .line 620
    .line 621
    sget-object v1, La/iun;->a:La/iun;

    .line 622
    .line 623
    :cond_1b
    invoke-direct {v2, v4, v1}, La/afo;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 624
    .line 625
    .line 626
    const-wide/16 v39, 0x0

    .line 627
    .line 628
    move-wide/from16 v48, v28

    .line 629
    .line 630
    move-wide/from16 v28, v23

    .line 631
    .line 632
    move-wide/from16 v24, v48

    .line 633
    .line 634
    move-object/from16 v41, v2

    .line 635
    .line 636
    move-wide/from16 v20, v21

    .line 637
    .line 638
    move-wide/from16 v22, v33

    .line 639
    .line 640
    move-object/from16 v33, v6

    .line 641
    .line 642
    move-object/from16 v34, v7

    .line 643
    .line 644
    invoke-direct/range {v18 .. v41}, La/ig7;-><init>(IJJDJDLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;La/rh7;La/uoy;ZLa/yfa0;ZJLa/afo;)V

    .line 645
    .line 646
    .line 647
    move-object/from16 v1, v18

    .line 648
    .line 649
    move-wide/from16 v33, v22

    .line 650
    .line 651
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 652
    .line 653
    .line 654
    move-wide/from16 v7, v33

    .line 655
    .line 656
    move/from16 v19, v42

    .line 657
    .line 658
    move-object/from16 v1, v43

    .line 659
    .line 660
    move-object/from16 v2, v44

    .line 661
    .line 662
    move-object/from16 v6, v45

    .line 663
    .line 664
    move-wide/from16 v9, v46

    .line 665
    .line 666
    const/16 v4, 0xa

    .line 667
    .line 668
    goto/16 :goto_5

    .line 669
    .line 670
    :cond_1c
    invoke-static {}, La/q3d;->p()V

    .line 671
    .line 672
    .line 673
    throw p2

    .line 674
    :cond_1d
    move-object/from16 v44, v2

    .line 675
    .line 676
    move-object/from16 v45, v6

    .line 677
    .line 678
    move-wide/from16 v33, v7

    .line 679
    .line 680
    move-wide/from16 v46, v9

    .line 681
    .line 682
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 683
    .line 684
    .line 685
    move-object/from16 v0, p0

    .line 686
    .line 687
    move-object/from16 v1, p1

    .line 688
    .line 689
    const/16 v4, 0xa

    .line 690
    .line 691
    goto/16 :goto_4

    .line 692
    .line 693
    :cond_1e
    move-object/from16 p1, v1

    .line 694
    .line 695
    move-object/from16 v44, v2

    .line 696
    .line 697
    move-wide/from16 v33, v7

    .line 698
    .line 699
    move-wide/from16 v46, v9

    .line 700
    .line 701
    :goto_18
    move-object/from16 v19, v15

    .line 702
    .line 703
    goto :goto_19

    .line 704
    :cond_1f
    move-object/from16 p1, v1

    .line 705
    .line 706
    move-object/from16 v44, v2

    .line 707
    .line 708
    move-wide/from16 v33, v7

    .line 709
    .line 710
    move-wide/from16 v46, v9

    .line 711
    .line 712
    sget-object v15, La/iun;->a:La/iun;

    .line 713
    .line 714
    goto :goto_18

    .line 715
    :goto_19
    if-eqz v14, :cond_20

    .line 716
    .line 717
    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    .line 718
    .line 719
    .line 720
    move-result-wide v0

    .line 721
    move-wide/from16 v20, v0

    .line 722
    .line 723
    goto :goto_1a

    .line 724
    :cond_20
    move-wide/from16 v20, v16

    .line 725
    .line 726
    :goto_1a
    iget-object v0, v5, La/pcn;->c:Ljava/lang/Boolean;

    .line 727
    .line 728
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 729
    .line 730
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 731
    .line 732
    .line 733
    move-result v22

    .line 734
    new-instance v18, La/h07;

    .line 735
    .line 736
    move/from16 v24, v11

    .line 737
    .line 738
    move-object/from16 v23, v12

    .line 739
    .line 740
    move-wide/from16 v25, v33

    .line 741
    .line 742
    move-wide/from16 v27, v46

    .line 743
    .line 744
    invoke-direct/range {v18 .. v28}, La/h07;-><init>(Ljava/util/List;JZLjava/lang/String;ZJJ)V

    .line 745
    .line 746
    .line 747
    move-object/from16 v0, v18

    .line 748
    .line 749
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 750
    .line 751
    .line 752
    move-object/from16 v0, p0

    .line 753
    .line 754
    move-object/from16 v1, p1

    .line 755
    .line 756
    move-object/from16 v2, v44

    .line 757
    .line 758
    const/16 v4, 0xa

    .line 759
    .line 760
    const/4 v6, 0x1

    .line 761
    goto/16 :goto_3

    .line 762
    .line 763
    :cond_21
    return-object v3
.end method
