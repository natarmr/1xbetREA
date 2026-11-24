.class public final La/dmp0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:J

.field public j:J

.field public k:I

.field public l:I

.field public m:I

.field public n:Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam;

.field public o:La/fmp0;

.field public p:Ljava/lang/Throwable;

.field public q:B

.field public final synthetic r:Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam;

.field public final synthetic s:La/fmp0;


# direct methods
.method public constructor <init>(Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam;La/fmp0;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/dmp0;->r:Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam;

    .line 2
    .line 3
    iput-object p2, p0, La/dmp0;->s:La/fmp0;

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
    new-instance p1, La/dmp0;

    .line 2
    .line 3
    iget-object v0, p0, La/dmp0;->r:Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam;

    .line 4
    .line 5
    iget-object p0, p0, La/dmp0;->s:La/fmp0;

    .line 6
    .line 7
    invoke-direct {p1, v0, p0, p2}, La/dmp0;-><init>(Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam;La/fmp0;La/yje;)V

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
    invoke-virtual {p0, p1, p2}, La/dmp0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/dmp0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/dmp0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v2, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-byte v0, v1, La/dmp0;->q:B

    .line 6
    .line 7
    const/4 v3, 0x4

    .line 8
    const/4 v4, 0x3

    .line 9
    const/4 v5, 0x2

    .line 10
    const/4 v8, 0x1

    .line 11
    if-eqz v0, :cond_4

    .line 12
    .line 13
    if-eq v0, v8, :cond_3

    .line 14
    .line 15
    if-eq v0, v5, :cond_2

    .line 16
    .line 17
    if-eq v0, v4, :cond_1

    .line 18
    .line 19
    if-ne v0, v3, :cond_0

    .line 20
    .line 21
    iget v0, v1, La/dmp0;->m:I

    .line 22
    .line 23
    iget v9, v1, La/dmp0;->l:I

    .line 24
    .line 25
    iget v10, v1, La/dmp0;->k:I

    .line 26
    .line 27
    iget-wide v11, v1, La/dmp0;->j:J

    .line 28
    .line 29
    iget-wide v13, v1, La/dmp0;->i:J

    .line 30
    .line 31
    iget-object v15, v1, La/dmp0;->p:Ljava/lang/Throwable;

    .line 32
    .line 33
    const/16 v16, 0x0

    .line 34
    .line 35
    iget-object v6, v1, La/dmp0;->o:La/fmp0;

    .line 36
    .line 37
    iget-object v7, v1, La/dmp0;->n:Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam;

    .line 38
    .line 39
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move v4, v3

    .line 43
    move-wide/from16 v19, v13

    .line 44
    .line 45
    move-object v14, v6

    .line 46
    move v6, v9

    .line 47
    move-object v13, v15

    .line 48
    move-object v15, v7

    .line 49
    move v7, v10

    .line 50
    move-wide v9, v11

    .line 51
    move-wide/from16 v11, v19

    .line 52
    .line 53
    goto/16 :goto_10

    .line 54
    .line 55
    :cond_0
    const/16 v16, 0x0

    .line 56
    .line 57
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object v16

    .line 63
    :cond_1
    const/16 v16, 0x0

    .line 64
    .line 65
    iget v0, v1, La/dmp0;->m:I

    .line 66
    .line 67
    iget v6, v1, La/dmp0;->l:I

    .line 68
    .line 69
    iget v7, v1, La/dmp0;->k:I

    .line 70
    .line 71
    iget-wide v9, v1, La/dmp0;->j:J

    .line 72
    .line 73
    iget-wide v11, v1, La/dmp0;->i:J

    .line 74
    .line 75
    iget-object v13, v1, La/dmp0;->p:Ljava/lang/Throwable;

    .line 76
    .line 77
    iget-object v14, v1, La/dmp0;->o:La/fmp0;

    .line 78
    .line 79
    iget-object v15, v1, La/dmp0;->n:Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam;

    .line 80
    .line 81
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    move v5, v8

    .line 85
    goto/16 :goto_d

    .line 86
    .line 87
    :cond_2
    const/16 v16, 0x0

    .line 88
    .line 89
    iget v6, v1, La/dmp0;->l:I

    .line 90
    .line 91
    iget v7, v1, La/dmp0;->k:I

    .line 92
    .line 93
    iget-wide v9, v1, La/dmp0;->j:J

    .line 94
    .line 95
    iget-wide v11, v1, La/dmp0;->i:J

    .line 96
    .line 97
    iget-object v13, v1, La/dmp0;->p:Ljava/lang/Throwable;

    .line 98
    .line 99
    iget-object v14, v1, La/dmp0;->o:La/fmp0;

    .line 100
    .line 101
    iget-object v15, v1, La/dmp0;->n:Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam;

    .line 102
    .line 103
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    .line 105
    .line 106
    move-object/from16 v0, p1

    .line 107
    .line 108
    goto/16 :goto_2

    .line 109
    .line 110
    :catchall_0
    move-exception v0

    .line 111
    move-object v5, v13

    .line 112
    move-object v13, v0

    .line 113
    move-object v0, v5

    .line 114
    move v5, v8

    .line 115
    goto/16 :goto_a

    .line 116
    .line 117
    :cond_3
    const/16 v16, 0x0

    .line 118
    .line 119
    iget v6, v1, La/dmp0;->l:I

    .line 120
    .line 121
    iget v7, v1, La/dmp0;->k:I

    .line 122
    .line 123
    iget-wide v9, v1, La/dmp0;->j:J

    .line 124
    .line 125
    iget-wide v11, v1, La/dmp0;->i:J

    .line 126
    .line 127
    iget-object v13, v1, La/dmp0;->p:Ljava/lang/Throwable;

    .line 128
    .line 129
    iget-object v14, v1, La/dmp0;->o:La/fmp0;

    .line 130
    .line 131
    iget-object v15, v1, La/dmp0;->n:Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam;

    .line 132
    .line 133
    :try_start_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 134
    .line 135
    .line 136
    move-object/from16 v0, p1

    .line 137
    .line 138
    move v5, v8

    .line 139
    goto/16 :goto_6

    .line 140
    .line 141
    :cond_4
    const/16 v16, 0x0

    .line 142
    .line 143
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    sget-wide v6, La/cag0;->a:J

    .line 147
    .line 148
    iget-object v0, v1, La/dmp0;->r:Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam;

    .line 149
    .line 150
    iget-object v9, v1, La/dmp0;->s:La/fmp0;

    .line 151
    .line 152
    const-wide/16 v10, 0x3

    .line 153
    .line 154
    move-object v15, v0

    .line 155
    move v0, v8

    .line 156
    move-object v14, v9

    .line 157
    move-wide v11, v10

    .line 158
    move-object/from16 v13, v16

    .line 159
    .line 160
    move-wide v9, v6

    .line 161
    const/4 v6, 0x0

    .line 162
    const/4 v7, 0x0

    .line 163
    :goto_0
    if-eqz v0, :cond_16

    .line 164
    .line 165
    if-nez v15, :cond_5

    .line 166
    .line 167
    const/16 v17, -0x1

    .line 168
    .line 169
    move/from16 v3, v17

    .line 170
    .line 171
    goto :goto_1

    .line 172
    :cond_5
    :try_start_2
    instance-of v3, v15, Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam$Game;

    .line 173
    .line 174
    if-eqz v3, :cond_6

    .line 175
    .line 176
    const/4 v3, 0x0

    .line 177
    goto :goto_1

    .line 178
    :cond_6
    instance-of v3, v15, Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam$Team;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_c

    .line 179
    .line 180
    if-eqz v3, :cond_7

    .line 181
    .line 182
    move v3, v8

    .line 183
    goto :goto_1

    .line 184
    :cond_7
    const/4 v3, -0x2

    .line 185
    :goto_1
    const-string v4, "application/vnd.xenvelop+json"

    .line 186
    .line 187
    if-eqz v3, :cond_b

    .line 188
    .line 189
    if-ne v3, v8, :cond_a

    .line 190
    .line 191
    :try_start_3
    iget-object v3, v14, La/fmp0;->a:La/g090;

    .line 192
    .line 193
    move-object v8, v15

    .line 194
    check-cast v8, Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam$Team;

    .line 195
    .line 196
    iget-object v8, v8, Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam$Team;->a:Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 197
    .line 198
    :try_start_4
    iget-object v5, v14, La/fmp0;->c:La/knf0;

    .line 199
    .line 200
    move-object/from16 p1, v5

    .line 201
    .line 202
    invoke-virtual/range {p1 .. p1}, La/knf0;->b()I

    .line 203
    .line 204
    .line 205
    move-result v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 206
    move-object/from16 v18, v2

    .line 207
    .line 208
    :try_start_5
    invoke-virtual/range {p1 .. p1}, La/knf0;->c()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    invoke-static {v5, v8, v2}, La/ofm0;->o(ILjava/lang/String;Ljava/lang/String;)Ljava/util/LinkedHashMap;

    .line 213
    .line 214
    .line 215
    move-result-object v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 216
    :try_start_6
    iput-object v15, v1, La/dmp0;->n:Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam;

    .line 217
    .line 218
    iput-object v14, v1, La/dmp0;->o:La/fmp0;

    .line 219
    .line 220
    iput-object v13, v1, La/dmp0;->p:Ljava/lang/Throwable;

    .line 221
    .line 222
    iput-wide v11, v1, La/dmp0;->i:J

    .line 223
    .line 224
    iput-wide v9, v1, La/dmp0;->j:J

    .line 225
    .line 226
    iput v7, v1, La/dmp0;->k:I

    .line 227
    .line 228
    iput v6, v1, La/dmp0;->l:I

    .line 229
    .line 230
    iput v0, v1, La/dmp0;->m:I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 231
    .line 232
    const/4 v5, 0x2

    .line 233
    :try_start_7
    iput-byte v5, v1, La/dmp0;->q:B

    .line 234
    .line 235
    iget-object v0, v3, La/g090;->b:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v0, La/nxo0;

    .line 238
    .line 239
    invoke-virtual {v0}, La/nxo0;->invoke()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    check-cast v0, La/slp0;

    .line 244
    .line 245
    invoke-interface {v0, v2, v4, v1}, La/slp0;->b(Ljava/util/Map;Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 249
    move-object/from16 v2, v18

    .line 250
    .line 251
    if-ne v0, v2, :cond_8

    .line 252
    .line 253
    goto/16 :goto_f

    .line 254
    .line 255
    :cond_8
    :goto_2
    :try_start_8
    check-cast v0, La/dx5;

    .line 256
    .line 257
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    check-cast v0, La/wl60;

    .line 262
    .line 263
    iget-object v3, v0, La/wl60;->a:Ljava/util/List;

    .line 264
    .line 265
    iget-object v4, v0, La/wl60;->b:Ljava/lang/Integer;

    .line 266
    .line 267
    iget-object v0, v0, La/wl60;->c:La/olp0;

    .line 268
    .line 269
    if-eqz v0, :cond_9

    .line 270
    .line 271
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    goto :goto_3

    .line 276
    :cond_9
    move-object/from16 v0, v16

    .line 277
    .line 278
    :goto_3
    new-instance v8, La/rlp0;

    .line 279
    .line 280
    invoke-direct {v8, v3, v4, v0}, La/rlp0;-><init>(Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;)V

    .line 281
    .line 282
    .line 283
    const/4 v5, 0x1

    .line 284
    goto/16 :goto_7

    .line 285
    .line 286
    :goto_4
    move-object v5, v13

    .line 287
    move-object v13, v0

    .line 288
    move-object v0, v5

    .line 289
    const/4 v5, 0x1

    .line 290
    goto/16 :goto_a

    .line 291
    .line 292
    :catchall_1
    move-exception v0

    .line 293
    goto :goto_4

    .line 294
    :catchall_2
    move-exception v0

    .line 295
    move-object/from16 v2, v18

    .line 296
    .line 297
    goto :goto_4

    .line 298
    :catchall_3
    move-exception v0

    .line 299
    move-object/from16 v2, v18

    .line 300
    .line 301
    :goto_5
    const/4 v5, 0x2

    .line 302
    goto :goto_4

    .line 303
    :catchall_4
    move-exception v0

    .line 304
    move-object/from16 v2, v18

    .line 305
    .line 306
    goto :goto_5

    .line 307
    :catchall_5
    move-exception v0

    .line 308
    goto :goto_5

    .line 309
    :cond_a
    new-instance v0, La/m460;

    .line 310
    .line 311
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 312
    .line 313
    .line 314
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 315
    :cond_b
    :try_start_9
    iget-object v3, v14, La/fmp0;->a:La/g090;

    .line 316
    .line 317
    move-object v8, v15

    .line 318
    check-cast v8, Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam$Game;

    .line 319
    .line 320
    iget-object v8, v8, Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam$Game;->a:Ljava/lang/String;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_b

    .line 321
    .line 322
    :try_start_a
    iget-object v5, v14, La/fmp0;->c:La/knf0;

    .line 323
    .line 324
    move-object/from16 v18, v5

    .line 325
    .line 326
    invoke-virtual/range {v18 .. v18}, La/knf0;->b()I

    .line 327
    .line 328
    .line 329
    move-result v5
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 330
    move-object/from16 p1, v2

    .line 331
    .line 332
    :try_start_b
    invoke-virtual/range {v18 .. v18}, La/knf0;->c()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v2

    .line 336
    invoke-static {v5, v8, v2}, La/ofm0;->o(ILjava/lang/String;Ljava/lang/String;)Ljava/util/LinkedHashMap;

    .line 337
    .line 338
    .line 339
    move-result-object v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    .line 340
    :try_start_c
    iput-object v15, v1, La/dmp0;->n:Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam;

    .line 341
    .line 342
    iput-object v14, v1, La/dmp0;->o:La/fmp0;

    .line 343
    .line 344
    iput-object v13, v1, La/dmp0;->p:Ljava/lang/Throwable;

    .line 345
    .line 346
    iput-wide v11, v1, La/dmp0;->i:J

    .line 347
    .line 348
    iput-wide v9, v1, La/dmp0;->j:J

    .line 349
    .line 350
    iput v7, v1, La/dmp0;->k:I

    .line 351
    .line 352
    iput v6, v1, La/dmp0;->l:I

    .line 353
    .line 354
    iput v0, v1, La/dmp0;->m:I
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    .line 355
    .line 356
    const/4 v5, 0x1

    .line 357
    :try_start_d
    iput-byte v5, v1, La/dmp0;->q:B

    .line 358
    .line 359
    iget-object v0, v3, La/g090;->b:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast v0, La/nxo0;

    .line 362
    .line 363
    invoke-virtual {v0}, La/nxo0;->invoke()Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    check-cast v0, La/slp0;

    .line 368
    .line 369
    invoke-interface {v0, v2, v4, v1}, La/slp0;->a(Ljava/util/Map;Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 373
    move-object/from16 v2, p1

    .line 374
    .line 375
    if-ne v0, v2, :cond_c

    .line 376
    .line 377
    goto/16 :goto_f

    .line 378
    .line 379
    :cond_c
    :goto_6
    :try_start_e
    check-cast v0, La/dx5;

    .line 380
    .line 381
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    move-object v8, v0

    .line 386
    check-cast v8, La/rlp0;

    .line 387
    .line 388
    :goto_7
    invoke-static {v8}, La/xnm0;->l(La/rlp0;)Ljava/util/List;

    .line 389
    .line 390
    .line 391
    move-result-object v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 392
    return-object v0

    .line 393
    :catchall_6
    move-exception v0

    .line 394
    :goto_8
    move-object/from16 v19, v13

    .line 395
    .line 396
    move-object v13, v0

    .line 397
    move-object/from16 v0, v19

    .line 398
    .line 399
    goto :goto_a

    .line 400
    :catchall_7
    move-exception v0

    .line 401
    move-object/from16 v2, p1

    .line 402
    .line 403
    goto :goto_8

    .line 404
    :catchall_8
    move-exception v0

    .line 405
    move-object/from16 v2, p1

    .line 406
    .line 407
    :goto_9
    const/4 v5, 0x1

    .line 408
    goto :goto_8

    .line 409
    :catchall_9
    move-exception v0

    .line 410
    move-object/from16 v2, p1

    .line 411
    .line 412
    goto :goto_9

    .line 413
    :catchall_a
    move-exception v0

    .line 414
    goto :goto_9

    .line 415
    :catchall_b
    move-exception v0

    .line 416
    goto :goto_9

    .line 417
    :catchall_c
    move-exception v0

    .line 418
    move v5, v8

    .line 419
    goto :goto_8

    .line 420
    :goto_a
    invoke-static {v13}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 421
    .line 422
    .line 423
    move-result v3

    .line 424
    if-eqz v3, :cond_11

    .line 425
    .line 426
    if-nez v7, :cond_d

    .line 427
    .line 428
    new-instance v0, La/el50;

    .line 429
    .line 430
    invoke-direct {v0, v13}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 431
    .line 432
    .line 433
    move-object v13, v0

    .line 434
    move v8, v5

    .line 435
    const/4 v0, 0x0

    .line 436
    const/4 v3, 0x4

    .line 437
    const/4 v4, 0x3

    .line 438
    :goto_b
    const/4 v5, 0x2

    .line 439
    goto/16 :goto_0

    .line 440
    .line 441
    :cond_d
    int-to-long v3, v6

    .line 442
    cmp-long v3, v3, v11

    .line 443
    .line 444
    if-gez v3, :cond_e

    .line 445
    .line 446
    move v3, v5

    .line 447
    goto :goto_c

    .line 448
    :cond_e
    const/4 v3, 0x0

    .line 449
    :goto_c
    add-int/lit8 v6, v6, 0x1

    .line 450
    .line 451
    if-eqz v3, :cond_f

    .line 452
    .line 453
    iput-object v15, v1, La/dmp0;->n:Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam;

    .line 454
    .line 455
    iput-object v14, v1, La/dmp0;->o:La/fmp0;

    .line 456
    .line 457
    iput-object v0, v1, La/dmp0;->p:Ljava/lang/Throwable;

    .line 458
    .line 459
    iput-wide v11, v1, La/dmp0;->i:J

    .line 460
    .line 461
    iput-wide v9, v1, La/dmp0;->j:J

    .line 462
    .line 463
    iput v7, v1, La/dmp0;->k:I

    .line 464
    .line 465
    iput v6, v1, La/dmp0;->l:I

    .line 466
    .line 467
    iput v3, v1, La/dmp0;->m:I

    .line 468
    .line 469
    const/4 v4, 0x3

    .line 470
    iput-byte v4, v1, La/dmp0;->q:B

    .line 471
    .line 472
    invoke-static {v9, v10, v1}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v8

    .line 476
    if-ne v8, v2, :cond_10

    .line 477
    .line 478
    goto :goto_f

    .line 479
    :goto_d
    move v8, v5

    .line 480
    const/4 v3, 0x4

    .line 481
    goto :goto_b

    .line 482
    :cond_f
    const/4 v4, 0x3

    .line 483
    new-instance v0, La/el50;

    .line 484
    .line 485
    invoke-direct {v0, v13}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 486
    .line 487
    .line 488
    :cond_10
    move-object v13, v0

    .line 489
    move v0, v3

    .line 490
    goto :goto_d

    .line 491
    :cond_11
    const/4 v4, 0x3

    .line 492
    invoke-static {v13}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 493
    .line 494
    .line 495
    move-result v3

    .line 496
    if-eqz v3, :cond_15

    .line 497
    .line 498
    int-to-long v4, v6

    .line 499
    cmp-long v3, v4, v11

    .line 500
    .line 501
    if-gez v3, :cond_12

    .line 502
    .line 503
    const/4 v3, 0x1

    .line 504
    goto :goto_e

    .line 505
    :cond_12
    const/4 v3, 0x0

    .line 506
    :goto_e
    add-int/lit8 v6, v6, 0x1

    .line 507
    .line 508
    if-eqz v3, :cond_13

    .line 509
    .line 510
    iput-object v15, v1, La/dmp0;->n:Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam;

    .line 511
    .line 512
    iput-object v14, v1, La/dmp0;->o:La/fmp0;

    .line 513
    .line 514
    iput-object v0, v1, La/dmp0;->p:Ljava/lang/Throwable;

    .line 515
    .line 516
    iput-wide v11, v1, La/dmp0;->i:J

    .line 517
    .line 518
    iput-wide v9, v1, La/dmp0;->j:J

    .line 519
    .line 520
    iput v7, v1, La/dmp0;->k:I

    .line 521
    .line 522
    iput v6, v1, La/dmp0;->l:I

    .line 523
    .line 524
    iput v3, v1, La/dmp0;->m:I

    .line 525
    .line 526
    const/4 v4, 0x4

    .line 527
    iput-byte v4, v1, La/dmp0;->q:B

    .line 528
    .line 529
    invoke-static {v9, v10, v1}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v5

    .line 533
    if-ne v5, v2, :cond_14

    .line 534
    .line 535
    :goto_f
    return-object v2

    .line 536
    :goto_10
    move v3, v4

    .line 537
    :goto_11
    const/4 v4, 0x3

    .line 538
    const/4 v5, 0x2

    .line 539
    const/4 v8, 0x1

    .line 540
    goto/16 :goto_0

    .line 541
    .line 542
    :cond_13
    const/4 v4, 0x4

    .line 543
    new-instance v0, La/dag0;

    .line 544
    .line 545
    invoke-direct {v0, v13}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 546
    .line 547
    .line 548
    :cond_14
    move-object v13, v0

    .line 549
    move v0, v3

    .line 550
    goto :goto_10

    .line 551
    :cond_15
    const/4 v4, 0x4

    .line 552
    invoke-static {v13}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 553
    .line 554
    .line 555
    move v3, v4

    .line 556
    const/4 v0, 0x0

    .line 557
    goto :goto_11

    .line 558
    :cond_16
    if-nez v13, :cond_17

    .line 559
    .line 560
    const-string v0, "Unexpected error"

    .line 561
    .line 562
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 563
    .line 564
    .line 565
    return-object v16

    .line 566
    :cond_17
    throw v13
.end method
