.class public final La/u7e0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:B

.field public final synthetic j:La/z220;

.field public final synthetic k:I

.field public final synthetic l:B

.field public final synthetic m:La/j6i0;

.field public final synthetic n:Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams;


# direct methods
.method public constructor <init>(La/z220;IILa/j6i0;Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/u7e0;->j:La/z220;

    .line 2
    .line 3
    iput p2, p0, La/u7e0;->k:I

    .line 4
    .line 5
    iput-byte p3, p0, La/u7e0;->l:B

    .line 6
    .line 7
    iput-object p4, p0, La/u7e0;->m:La/j6i0;

    .line 8
    .line 9
    iput-object p5, p0, La/u7e0;->n:Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    new-instance v0, La/u7e0;

    .line 2
    .line 3
    iget-object v4, p0, La/u7e0;->m:La/j6i0;

    .line 4
    .line 5
    iget-object v5, p0, La/u7e0;->n:Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams;

    .line 6
    .line 7
    iget-object v1, p0, La/u7e0;->j:La/z220;

    .line 8
    .line 9
    iget v2, p0, La/u7e0;->k:I

    .line 10
    .line 11
    iget-byte v3, p0, La/u7e0;->l:B

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, La/u7e0;-><init>(La/z220;IILa/j6i0;Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams;La/yje;)V

    .line 15
    .line 16
    .line 17
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
    invoke-virtual {p0, p1, p2}, La/u7e0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/u7e0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/u7e0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v14, p0

    .line 2
    .line 3
    iget-object v0, v14, La/u7e0;->j:La/z220;

    .line 4
    .line 5
    iget-object v1, v0, La/z220;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La/zn00;

    .line 8
    .line 9
    iget-object v0, v0, La/z220;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, La/knf0;

    .line 12
    .line 13
    sget-object v2, La/wne;->a:La/wne;

    .line 14
    .line 15
    iget-byte v3, v14, La/u7e0;->i:B

    .line 16
    .line 17
    const/4 v4, 0x2

    .line 18
    const/4 v5, 0x1

    .line 19
    const/4 v6, 0x0

    .line 20
    if-eqz v3, :cond_2

    .line 21
    .line 22
    if-eq v3, v5, :cond_1

    .line 23
    .line 24
    if-ne v3, v4, :cond_0

    .line 25
    .line 26
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    move-object/from16 v0, p1

    .line 30
    .line 31
    goto/16 :goto_13

    .line 32
    .line 33
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object v6

    .line 39
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object/from16 v1, p1

    .line 43
    .line 44
    goto/16 :goto_11

    .line 45
    .line 46
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, La/knf0;->c()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v0}, La/knf0;->b()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    iget v7, v14, La/u7e0;->k:I

    .line 58
    .line 59
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v15

    .line 63
    iget-byte v7, v14, La/u7e0;->l:B

    .line 64
    .line 65
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v12

    .line 69
    const-string v7, ""

    .line 70
    .line 71
    iget-object v8, v14, La/u7e0;->m:La/j6i0;

    .line 72
    .line 73
    if-eqz v8, :cond_5

    .line 74
    .line 75
    iget-object v9, v8, La/j6i0;->b:Ljava/util/Map;

    .line 76
    .line 77
    if-eqz v9, :cond_5

    .line 78
    .line 79
    sget-object v10, La/g6i0;->b:La/g6i0;

    .line 80
    .line 81
    invoke-interface {v9, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    check-cast v9, Ljava/util/List;

    .line 86
    .line 87
    if-eqz v9, :cond_5

    .line 88
    .line 89
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object v9

    .line 93
    :cond_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v10

    .line 97
    if-eqz v10, :cond_4

    .line 98
    .line 99
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v10

    .line 103
    move-object v11, v10

    .line 104
    check-cast v11, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;

    .line 105
    .line 106
    iget-boolean v11, v11, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;->d:Z

    .line 107
    .line 108
    if-eqz v11, :cond_3

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_4
    move-object v10, v6

    .line 112
    :goto_0
    check-cast v10, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;

    .line 113
    .line 114
    if-eqz v10, :cond_5

    .line 115
    .line 116
    iget-object v9, v10, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;->b:Ljava/lang/String;

    .line 117
    .line 118
    if-eqz v9, :cond_5

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_5
    move-object v9, v7

    .line 122
    :goto_1
    if-eqz v8, :cond_8

    .line 123
    .line 124
    iget-object v10, v8, La/j6i0;->b:Ljava/util/Map;

    .line 125
    .line 126
    if-eqz v10, :cond_8

    .line 127
    .line 128
    sget-object v11, La/g6i0;->c:La/g6i0;

    .line 129
    .line 130
    invoke-interface {v10, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v10

    .line 134
    check-cast v10, Ljava/util/List;

    .line 135
    .line 136
    if-eqz v10, :cond_8

    .line 137
    .line 138
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 139
    .line 140
    .line 141
    move-result-object v10

    .line 142
    :cond_6
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v11

    .line 146
    if-eqz v11, :cond_7

    .line 147
    .line 148
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v11

    .line 152
    move-object v13, v11

    .line 153
    check-cast v13, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;

    .line 154
    .line 155
    iget-boolean v13, v13, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;->d:Z

    .line 156
    .line 157
    if-eqz v13, :cond_6

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_7
    move-object v11, v6

    .line 161
    :goto_2
    check-cast v11, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;

    .line 162
    .line 163
    if-eqz v11, :cond_8

    .line 164
    .line 165
    iget-object v10, v11, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;->b:Ljava/lang/String;

    .line 166
    .line 167
    if-eqz v10, :cond_8

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_8
    move-object v10, v7

    .line 171
    :goto_3
    if-eqz v8, :cond_b

    .line 172
    .line 173
    iget-object v11, v8, La/j6i0;->b:Ljava/util/Map;

    .line 174
    .line 175
    if-eqz v11, :cond_b

    .line 176
    .line 177
    sget-object v13, La/g6i0;->d:La/g6i0;

    .line 178
    .line 179
    invoke-interface {v11, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v11

    .line 183
    check-cast v11, Ljava/util/List;

    .line 184
    .line 185
    if-eqz v11, :cond_b

    .line 186
    .line 187
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 188
    .line 189
    .line 190
    move-result-object v11

    .line 191
    :goto_4
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result v13

    .line 195
    if-eqz v13, :cond_a

    .line 196
    .line 197
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v13

    .line 201
    move-object/from16 v16, v6

    .line 202
    .line 203
    move-object v6, v13

    .line 204
    check-cast v6, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;

    .line 205
    .line 206
    iget-boolean v6, v6, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;->d:Z

    .line 207
    .line 208
    if-eqz v6, :cond_9

    .line 209
    .line 210
    goto :goto_5

    .line 211
    :cond_9
    move-object/from16 v6, v16

    .line 212
    .line 213
    goto :goto_4

    .line 214
    :cond_a
    move-object/from16 v16, v6

    .line 215
    .line 216
    move-object/from16 v13, v16

    .line 217
    .line 218
    :goto_5
    check-cast v13, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;

    .line 219
    .line 220
    if-eqz v13, :cond_c

    .line 221
    .line 222
    iget-object v6, v13, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;->b:Ljava/lang/String;

    .line 223
    .line 224
    if-eqz v6, :cond_c

    .line 225
    .line 226
    goto :goto_6

    .line 227
    :cond_b
    move-object/from16 v16, v6

    .line 228
    .line 229
    :cond_c
    move-object v6, v7

    .line 230
    :goto_6
    if-eqz v8, :cond_f

    .line 231
    .line 232
    iget-object v11, v8, La/j6i0;->b:Ljava/util/Map;

    .line 233
    .line 234
    if-eqz v11, :cond_f

    .line 235
    .line 236
    sget-object v13, La/g6i0;->e:La/g6i0;

    .line 237
    .line 238
    invoke-interface {v11, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v11

    .line 242
    check-cast v11, Ljava/util/List;

    .line 243
    .line 244
    if-eqz v11, :cond_f

    .line 245
    .line 246
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 247
    .line 248
    .line 249
    move-result-object v11

    .line 250
    :goto_7
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 251
    .line 252
    .line 253
    move-result v13

    .line 254
    if-eqz v13, :cond_e

    .line 255
    .line 256
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v13

    .line 260
    move-object v4, v13

    .line 261
    check-cast v4, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;

    .line 262
    .line 263
    iget-boolean v4, v4, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;->d:Z

    .line 264
    .line 265
    if-eqz v4, :cond_d

    .line 266
    .line 267
    goto :goto_8

    .line 268
    :cond_d
    const/4 v4, 0x2

    .line 269
    goto :goto_7

    .line 270
    :cond_e
    move-object/from16 v13, v16

    .line 271
    .line 272
    :goto_8
    check-cast v13, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;

    .line 273
    .line 274
    if-eqz v13, :cond_f

    .line 275
    .line 276
    iget-object v4, v13, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;->b:Ljava/lang/String;

    .line 277
    .line 278
    if-eqz v4, :cond_f

    .line 279
    .line 280
    goto :goto_9

    .line 281
    :cond_f
    move-object v4, v7

    .line 282
    :goto_9
    if-eqz v8, :cond_12

    .line 283
    .line 284
    iget-object v11, v8, La/j6i0;->b:Ljava/util/Map;

    .line 285
    .line 286
    if-eqz v11, :cond_12

    .line 287
    .line 288
    sget-object v13, La/g6i0;->h:La/g6i0;

    .line 289
    .line 290
    invoke-interface {v11, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v11

    .line 294
    check-cast v11, Ljava/util/List;

    .line 295
    .line 296
    if-eqz v11, :cond_12

    .line 297
    .line 298
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 299
    .line 300
    .line 301
    move-result-object v11

    .line 302
    :goto_a
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 303
    .line 304
    .line 305
    move-result v13

    .line 306
    if-eqz v13, :cond_11

    .line 307
    .line 308
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v13

    .line 312
    move-object v5, v13

    .line 313
    check-cast v5, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;

    .line 314
    .line 315
    iget-boolean v5, v5, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;->d:Z

    .line 316
    .line 317
    if-eqz v5, :cond_10

    .line 318
    .line 319
    goto :goto_b

    .line 320
    :cond_10
    const/4 v5, 0x1

    .line 321
    goto :goto_a

    .line 322
    :cond_11
    move-object/from16 v13, v16

    .line 323
    .line 324
    :goto_b
    check-cast v13, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;

    .line 325
    .line 326
    if-eqz v13, :cond_12

    .line 327
    .line 328
    iget-object v5, v13, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;->b:Ljava/lang/String;

    .line 329
    .line 330
    if-eqz v5, :cond_12

    .line 331
    .line 332
    goto :goto_c

    .line 333
    :cond_12
    move-object v5, v7

    .line 334
    :goto_c
    if-eqz v8, :cond_15

    .line 335
    .line 336
    iget-object v11, v8, La/j6i0;->b:Ljava/util/Map;

    .line 337
    .line 338
    if-eqz v11, :cond_15

    .line 339
    .line 340
    sget-object v13, La/g6i0;->f:La/g6i0;

    .line 341
    .line 342
    invoke-interface {v11, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v11

    .line 346
    check-cast v11, Ljava/util/List;

    .line 347
    .line 348
    if-eqz v11, :cond_15

    .line 349
    .line 350
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 351
    .line 352
    .line 353
    move-result-object v11

    .line 354
    :goto_d
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 355
    .line 356
    .line 357
    move-result v13

    .line 358
    if-eqz v13, :cond_14

    .line 359
    .line 360
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v13

    .line 364
    move/from16 p1, v0

    .line 365
    .line 366
    move-object v0, v13

    .line 367
    check-cast v0, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;

    .line 368
    .line 369
    iget-boolean v0, v0, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;->d:Z

    .line 370
    .line 371
    if-eqz v0, :cond_13

    .line 372
    .line 373
    goto :goto_e

    .line 374
    :cond_13
    move/from16 v0, p1

    .line 375
    .line 376
    goto :goto_d

    .line 377
    :cond_14
    move/from16 p1, v0

    .line 378
    .line 379
    move-object/from16 v13, v16

    .line 380
    .line 381
    :goto_e
    check-cast v13, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;

    .line 382
    .line 383
    if-eqz v13, :cond_16

    .line 384
    .line 385
    iget-object v0, v13, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;->b:Ljava/lang/String;

    .line 386
    .line 387
    if-eqz v0, :cond_16

    .line 388
    .line 389
    goto :goto_f

    .line 390
    :cond_15
    move/from16 p1, v0

    .line 391
    .line 392
    :cond_16
    move-object v0, v7

    .line 393
    :goto_f
    iget-object v11, v14, La/u7e0;->n:Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams;

    .line 394
    .line 395
    if-eqz v11, :cond_1d

    .line 396
    .line 397
    instance-of v13, v11, Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams$GameParamsStatistic;

    .line 398
    .line 399
    move-object/from16 v17, v6

    .line 400
    .line 401
    if-eqz v13, :cond_1b

    .line 402
    .line 403
    check-cast v11, Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams$GameParamsStatistic;

    .line 404
    .line 405
    iget-object v11, v11, Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams$GameParamsStatistic;->a:Ljava/lang/String;

    .line 406
    .line 407
    if-eqz v8, :cond_19

    .line 408
    .line 409
    iget-object v8, v8, La/j6i0;->b:Ljava/util/Map;

    .line 410
    .line 411
    if-eqz v8, :cond_19

    .line 412
    .line 413
    sget-object v13, La/g6i0;->g:La/g6i0;

    .line 414
    .line 415
    invoke-interface {v8, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v8

    .line 419
    check-cast v8, Ljava/util/List;

    .line 420
    .line 421
    if-eqz v8, :cond_19

    .line 422
    .line 423
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 424
    .line 425
    .line 426
    move-result-object v8

    .line 427
    :cond_17
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 428
    .line 429
    .line 430
    move-result v13

    .line 431
    if-eqz v13, :cond_18

    .line 432
    .line 433
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v13

    .line 437
    move-object v6, v13

    .line 438
    check-cast v6, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;

    .line 439
    .line 440
    iget-boolean v6, v6, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;->d:Z

    .line 441
    .line 442
    if-eqz v6, :cond_17

    .line 443
    .line 444
    move-object v6, v13

    .line 445
    goto :goto_10

    .line 446
    :cond_18
    move-object/from16 v6, v16

    .line 447
    .line 448
    :goto_10
    check-cast v6, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;

    .line 449
    .line 450
    if-eqz v6, :cond_19

    .line 451
    .line 452
    iget-object v6, v6, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;->b:Ljava/lang/String;

    .line 453
    .line 454
    if-eqz v6, :cond_19

    .line 455
    .line 456
    move-object v7, v6

    .line 457
    :cond_19
    const/4 v6, 0x1

    .line 458
    iput-byte v6, v14, La/u7e0;->i:B

    .line 459
    .line 460
    iget-object v1, v1, La/zn00;->b:Ljava/lang/Object;

    .line 461
    .line 462
    check-cast v1, La/p7d0;

    .line 463
    .line 464
    invoke-virtual {v1}, La/p7d0;->invoke()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v1

    .line 468
    check-cast v1, La/p7e0;

    .line 469
    .line 470
    invoke-static {v7}, La/sj3;->i0(Ljava/lang/String;)Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v7

    .line 474
    invoke-static {v5}, La/sj3;->i0(Ljava/lang/String;)Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v8

    .line 478
    invoke-static {v9}, La/sj3;->i0(Ljava/lang/String;)Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v9

    .line 482
    invoke-static {v10}, La/sj3;->i0(Ljava/lang/String;)Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v10

    .line 486
    move-object v6, v4

    .line 487
    move-object v4, v11

    .line 488
    invoke-static {v6}, La/sj3;->i0(Ljava/lang/String;)Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object v11

    .line 492
    move-object v14, v12

    .line 493
    invoke-static/range {v17 .. v17}, La/sj3;->i0(Ljava/lang/String;)Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v12

    .line 497
    invoke-static {v0}, La/sj3;->i0(Ljava/lang/String;)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v13

    .line 501
    move-object v0, v2

    .line 502
    const-string v2, "application/vnd.xenvelop+json"

    .line 503
    .line 504
    const/4 v6, 0x1

    .line 505
    move-object/from16 v16, p0

    .line 506
    .line 507
    move/from16 v5, p1

    .line 508
    .line 509
    invoke-interface/range {v1 .. v16}, La/p7e0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    if-ne v1, v0, :cond_1a

    .line 514
    .line 515
    move-object v15, v0

    .line 516
    goto :goto_12

    .line 517
    :cond_1a
    :goto_11
    check-cast v1, La/dx5;

    .line 518
    .line 519
    goto :goto_14

    .line 520
    :cond_1b
    move-object v6, v4

    .line 521
    move-object v13, v15

    .line 522
    move/from16 v4, p1

    .line 523
    .line 524
    move-object v15, v2

    .line 525
    move-object v2, v3

    .line 526
    const/4 v3, 0x1

    .line 527
    instance-of v7, v11, Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams$EventParamsStatistic;

    .line 528
    .line 529
    if-eqz v7, :cond_1d

    .line 530
    .line 531
    check-cast v11, Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams$EventParamsStatistic;

    .line 532
    .line 533
    iget-object v7, v11, Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams$EventParamsStatistic;->a:Ljava/lang/String;

    .line 534
    .line 535
    const/4 v8, 0x2

    .line 536
    iput-byte v8, v14, La/u7e0;->i:B

    .line 537
    .line 538
    iget-object v1, v1, La/zn00;->b:Ljava/lang/Object;

    .line 539
    .line 540
    check-cast v1, La/p7d0;

    .line 541
    .line 542
    invoke-virtual {v1}, La/p7d0;->invoke()Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v1

    .line 546
    check-cast v1, La/p7e0;

    .line 547
    .line 548
    invoke-static {v5}, La/sj3;->i0(Ljava/lang/String;)Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v5

    .line 552
    invoke-static {v9}, La/sj3;->i0(Ljava/lang/String;)Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    move-result-object v8

    .line 556
    invoke-static {v10}, La/sj3;->i0(Ljava/lang/String;)Ljava/lang/String;

    .line 557
    .line 558
    .line 559
    move-result-object v9

    .line 560
    invoke-static {v6}, La/sj3;->i0(Ljava/lang/String;)Ljava/lang/String;

    .line 561
    .line 562
    .line 563
    move-result-object v6

    .line 564
    invoke-static/range {v17 .. v17}, La/sj3;->i0(Ljava/lang/String;)Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object v10

    .line 568
    invoke-static {v0}, La/sj3;->i0(Ljava/lang/String;)Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object v11

    .line 572
    move-object v0, v1

    .line 573
    move-object v1, v7

    .line 574
    move-object v7, v8

    .line 575
    move-object v8, v9

    .line 576
    move-object v9, v6

    .line 577
    move-object v6, v5

    .line 578
    const/16 v5, 0x54d

    .line 579
    .line 580
    invoke-interface/range {v0 .. v14}, La/p7e0;->b(Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v0

    .line 584
    if-ne v0, v15, :cond_1c

    .line 585
    .line 586
    :goto_12
    return-object v15

    .line 587
    :cond_1c
    :goto_13
    move-object v1, v0

    .line 588
    check-cast v1, La/dx5;

    .line 589
    .line 590
    :goto_14
    invoke-virtual {v1}, La/dx5;->a()Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    return-object v0

    .line 595
    :cond_1d
    invoke-static {}, La/t9f;->b()V

    .line 596
    .line 597
    .line 598
    return-object v16
.end method
