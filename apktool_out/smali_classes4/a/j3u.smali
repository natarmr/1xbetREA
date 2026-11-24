.class public final La/j3u;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Ljava/lang/Object;

.field public j:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

.field public k:Ljava/lang/Object;

.field public l:I

.field public m:Z

.field public n:B

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:La/d4u;

.field public final synthetic q:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

.field public final synthetic r:Z


# direct methods
.method public constructor <init>(La/yje;La/d4u;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Z)V
    .locals 0

    .line 1
    iput-object p2, p0, La/j3u;->p:La/d4u;

    .line 2
    .line 3
    iput-object p3, p0, La/j3u;->q:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 4
    .line 5
    iput-boolean p4, p0, La/j3u;->r:Z

    .line 6
    .line 7
    const/4 p2, 0x2

    .line 8
    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 3

    .line 1
    new-instance v0, La/j3u;

    .line 2
    .line 3
    iget-object v1, p0, La/j3u;->q:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 4
    .line 5
    iget-boolean v2, p0, La/j3u;->r:Z

    .line 6
    .line 7
    iget-object p0, p0, La/j3u;->p:La/d4u;

    .line 8
    .line 9
    invoke-direct {v0, p2, p0, v1, v2}, La/j3u;-><init>(La/yje;La/d4u;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Z)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, La/j3u;->o:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/j3u;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/j3u;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/j3u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-object v0, v5, La/j3u;->o:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v6, v0

    .line 6
    check-cast v6, La/kmq;

    .line 7
    .line 8
    sget-object v7, La/wne;->a:La/wne;

    .line 9
    .line 10
    iget-byte v0, v5, La/j3u;->n:B

    .line 11
    .line 12
    const/16 v8, 0x56

    .line 13
    .line 14
    const/4 v9, 0x3

    .line 15
    const/4 v10, 0x2

    .line 16
    const/16 v11, 0x2d

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    const/16 v12, 0x2e

    .line 20
    .line 21
    const/4 v13, 0x0

    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    if-eq v0, v1, :cond_2

    .line 25
    .line 26
    if-eq v0, v10, :cond_1

    .line 27
    .line 28
    if-ne v0, v9, :cond_0

    .line 29
    .line 30
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto/16 :goto_c

    .line 34
    .line 35
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 36
    .line 37
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-object v13

    .line 41
    :cond_1
    iget v1, v5, La/j3u;->l:I

    .line 42
    .line 43
    iget-object v0, v5, La/j3u;->k:Ljava/lang/Object;

    .line 44
    .line 45
    iget-object v2, v5, La/j3u;->j:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 46
    .line 47
    check-cast v2, La/kmq;

    .line 48
    .line 49
    iget-object v2, v5, La/j3u;->i:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 52
    .line 53
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    goto/16 :goto_6

    .line 57
    .line 58
    :catchall_0
    move-exception v0

    .line 59
    goto/16 :goto_9

    .line 60
    .line 61
    :cond_2
    iget-boolean v0, v5, La/j3u;->m:Z

    .line 62
    .line 63
    iget v1, v5, La/j3u;->l:I

    .line 64
    .line 65
    iget-object v2, v5, La/j3u;->k:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v2, La/kmq;

    .line 68
    .line 69
    iget-object v2, v5, La/j3u;->j:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 70
    .line 71
    iget-object v3, v5, La/j3u;->i:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v3, La/d4u;

    .line 74
    .line 75
    :try_start_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    .line 77
    .line 78
    move/from16 v16, v0

    .line 79
    .line 80
    move-object/from16 v0, p1

    .line 81
    .line 82
    goto/16 :goto_1

    .line 83
    .line 84
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iget-object v14, v5, La/j3u;->p:La/d4u;

    .line 88
    .line 89
    iget-object v0, v14, La/d4u;->a:La/lbu;

    .line 90
    .line 91
    invoke-virtual {v0}, La/lbu;->j()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    xor-int/lit8 v2, v0, 0x1

    .line 96
    .line 97
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 98
    .line 99
    iget-object v15, v5, La/j3u;->q:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 100
    .line 101
    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_4

    .line 106
    .line 107
    new-instance v0, Ljava/lang/Integer;

    .line 108
    .line 109
    invoke-direct {v0, v11}, Ljava/lang/Integer;-><init>(I)V

    .line 110
    .line 111
    .line 112
    new-instance v3, Ljava/lang/Integer;

    .line 113
    .line 114
    invoke-direct {v3, v12}, Ljava/lang/Integer;-><init>(I)V

    .line 115
    .line 116
    .line 117
    filled-new-array {v0, v3}, [Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    goto :goto_0

    .line 126
    :cond_4
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 127
    .line 128
    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_5

    .line 133
    .line 134
    new-instance v0, Ljava/lang/Integer;

    .line 135
    .line 136
    invoke-direct {v0, v8}, Ljava/lang/Integer;-><init>(I)V

    .line 137
    .line 138
    .line 139
    new-instance v3, Ljava/lang/Integer;

    .line 140
    .line 141
    invoke-direct {v3, v12}, Ljava/lang/Integer;-><init>(I)V

    .line 142
    .line 143
    .line 144
    filled-new-array {v0, v3}, [Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    goto :goto_0

    .line 153
    :cond_5
    new-instance v0, Ljava/lang/Integer;

    .line 154
    .line 155
    invoke-direct {v0, v12}, Ljava/lang/Integer;-><init>(I)V

    .line 156
    .line 157
    .line 158
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    :goto_0
    iget-boolean v3, v5, La/j3u;->r:Z

    .line 163
    .line 164
    :try_start_2
    sget-object v4, La/j0g0;->b:La/e0g0;

    .line 165
    .line 166
    move-object v4, v0

    .line 167
    iget-object v0, v14, La/d4u;->i:La/q8u;

    .line 168
    .line 169
    iput-object v6, v5, La/j3u;->o:Ljava/lang/Object;

    .line 170
    .line 171
    iput-object v14, v5, La/j3u;->i:Ljava/lang/Object;

    .line 172
    .line 173
    iput-object v15, v5, La/j3u;->j:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 174
    .line 175
    iput-object v13, v5, La/j3u;->k:Ljava/lang/Object;

    .line 176
    .line 177
    iput v2, v5, La/j3u;->l:I

    .line 178
    .line 179
    iput-boolean v3, v5, La/j3u;->m:Z

    .line 180
    .line 181
    iput-byte v1, v5, La/j3u;->n:B

    .line 182
    .line 183
    move/from16 v16, v3

    .line 184
    .line 185
    move-object v1, v4

    .line 186
    const-wide v3, 0x7fffffffffffffffL

    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v0 .. v5}, La/q8u;->a(Ljava/util/List;ZJLa/zje;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 195
    if-ne v0, v7, :cond_6

    .line 196
    .line 197
    goto/16 :goto_b

    .line 198
    .line 199
    :cond_6
    move v1, v2

    .line 200
    move-object v3, v14

    .line 201
    move-object v2, v15

    .line 202
    :goto_1
    :try_start_3
    move-object v4, v0

    .line 203
    check-cast v4, Ljava/util/List;

    .line 204
    .line 205
    if-eqz v16, :cond_7

    .line 206
    .line 207
    sget-object v14, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 208
    .line 209
    invoke-static {v2, v14}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v14

    .line 213
    if-eqz v14, :cond_7

    .line 214
    .line 215
    new-instance v14, Ljava/lang/Integer;

    .line 216
    .line 217
    invoke-direct {v14, v11}, Ljava/lang/Integer;-><init>(I)V

    .line 218
    .line 219
    .line 220
    new-instance v15, Ljava/lang/Integer;

    .line 221
    .line 222
    invoke-direct {v15, v12}, Ljava/lang/Integer;-><init>(I)V

    .line 223
    .line 224
    .line 225
    filled-new-array {v14, v15}, [Ljava/lang/Integer;

    .line 226
    .line 227
    .line 228
    move-result-object v12

    .line 229
    invoke-static {v12}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 230
    .line 231
    .line 232
    move-result-object v12

    .line 233
    goto :goto_2

    .line 234
    :cond_7
    new-instance v14, Ljava/lang/Integer;

    .line 235
    .line 236
    invoke-direct {v14, v12}, Ljava/lang/Integer;-><init>(I)V

    .line 237
    .line 238
    .line 239
    invoke-static {v14}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 240
    .line 241
    .line 242
    move-result-object v12

    .line 243
    :goto_2
    iget-object v3, v3, La/d4u;->k:La/cyg0;

    .line 244
    .line 245
    new-instance v14, Ljava/util/ArrayList;

    .line 246
    .line 247
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 248
    .line 249
    .line 250
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 255
    .line 256
    .line 257
    move-result v15

    .line 258
    if-eqz v15, :cond_b

    .line 259
    .line 260
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v15

    .line 264
    move-object v9, v15

    .line 265
    check-cast v9, La/uog;

    .line 266
    .line 267
    iget-object v9, v9, La/uog;->p:Ljava/util/List;

    .line 268
    .line 269
    if-eqz v9, :cond_8

    .line 270
    .line 271
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 272
    .line 273
    .line 274
    move-result v17

    .line 275
    if-eqz v17, :cond_8

    .line 276
    .line 277
    goto :goto_5

    .line 278
    :cond_8
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 279
    .line 280
    .line 281
    move-result-object v9

    .line 282
    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 283
    .line 284
    .line 285
    move-result v17

    .line 286
    if-eqz v17, :cond_9

    .line 287
    .line 288
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v17

    .line 292
    check-cast v17, Ljava/lang/Number;

    .line 293
    .line 294
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Number;->intValue()I

    .line 295
    .line 296
    .line 297
    move-result v8

    .line 298
    new-instance v11, Ljava/lang/Integer;

    .line 299
    .line 300
    invoke-direct {v11, v8}, Ljava/lang/Integer;-><init>(I)V

    .line 301
    .line 302
    .line 303
    invoke-interface {v12, v11}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v8

    .line 307
    if-eqz v8, :cond_a

    .line 308
    .line 309
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    :cond_9
    :goto_5
    const/16 v8, 0x56

    .line 313
    .line 314
    const/4 v9, 0x3

    .line 315
    const/16 v11, 0x2d

    .line 316
    .line 317
    goto :goto_3

    .line 318
    :cond_a
    const/16 v8, 0x56

    .line 319
    .line 320
    const/16 v11, 0x2d

    .line 321
    .line 322
    goto :goto_4

    .line 323
    :cond_b
    iput-object v6, v5, La/j3u;->o:Ljava/lang/Object;

    .line 324
    .line 325
    iput-object v2, v5, La/j3u;->i:Ljava/lang/Object;

    .line 326
    .line 327
    iput-object v13, v5, La/j3u;->j:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 328
    .line 329
    iput-object v0, v5, La/j3u;->k:Ljava/lang/Object;

    .line 330
    .line 331
    iput v1, v5, La/j3u;->l:I

    .line 332
    .line 333
    iput-byte v10, v5, La/j3u;->n:B

    .line 334
    .line 335
    iget-object v3, v3, La/cyg0;->a:La/b2g;

    .line 336
    .line 337
    iget-object v3, v3, La/b2g;->a:La/ehf0;

    .line 338
    .line 339
    iget-object v3, v3, La/ehf0;->c:Ljava/lang/Object;

    .line 340
    .line 341
    check-cast v3, La/or30;

    .line 342
    .line 343
    invoke-virtual {v3, v14}, La/or30;->d(Ljava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 347
    .line 348
    sget-object v4, La/wne;->a:La/wne;

    .line 349
    .line 350
    if-ne v3, v7, :cond_c

    .line 351
    .line 352
    goto/16 :goto_b

    .line 353
    .line 354
    :cond_c
    :goto_6
    check-cast v0, Ljava/lang/Iterable;

    .line 355
    .line 356
    new-instance v3, Ljava/util/ArrayList;

    .line 357
    .line 358
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 359
    .line 360
    .line 361
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    :cond_d
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 366
    .line 367
    .line 368
    move-result v4

    .line 369
    if-eqz v4, :cond_10

    .line 370
    .line 371
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v4

    .line 375
    move-object v8, v4

    .line 376
    check-cast v8, La/uog;

    .line 377
    .line 378
    sget-object v9, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 379
    .line 380
    invoke-static {v2, v9}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    move-result v9

    .line 384
    if-eqz v9, :cond_e

    .line 385
    .line 386
    iget-object v8, v8, La/uog;->p:Ljava/util/List;

    .line 387
    .line 388
    new-instance v9, Ljava/lang/Integer;

    .line 389
    .line 390
    const/16 v10, 0x2d

    .line 391
    .line 392
    invoke-direct {v9, v10}, Ljava/lang/Integer;-><init>(I)V

    .line 393
    .line 394
    .line 395
    invoke-interface {v8, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result v8

    .line 399
    const/16 v11, 0x56

    .line 400
    .line 401
    goto :goto_8

    .line 402
    :cond_e
    const/16 v10, 0x2d

    .line 403
    .line 404
    sget-object v9, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 405
    .line 406
    invoke-static {v2, v9}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    move-result v9

    .line 410
    if-eqz v9, :cond_f

    .line 411
    .line 412
    iget-object v8, v8, La/uog;->p:Ljava/util/List;

    .line 413
    .line 414
    new-instance v9, Ljava/lang/Integer;

    .line 415
    .line 416
    const/16 v11, 0x56

    .line 417
    .line 418
    invoke-direct {v9, v11}, Ljava/lang/Integer;-><init>(I)V

    .line 419
    .line 420
    .line 421
    invoke-interface {v8, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result v8

    .line 425
    goto :goto_8

    .line 426
    :cond_f
    const/16 v11, 0x56

    .line 427
    .line 428
    const/4 v8, 0x0

    .line 429
    :goto_8
    if-eqz v8, :cond_d

    .line 430
    .line 431
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    goto :goto_7

    .line 435
    :cond_10
    sget-object v0, La/j0g0;->b:La/e0g0;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 436
    .line 437
    goto :goto_a

    .line 438
    :catchall_1
    move-exception v0

    .line 439
    move v1, v2

    .line 440
    :goto_9
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 441
    .line 442
    new-instance v3, La/g0g0;

    .line 443
    .line 444
    invoke-direct {v3, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 445
    .line 446
    .line 447
    :goto_a
    new-instance v0, La/j0g0;

    .line 448
    .line 449
    invoke-direct {v0, v3}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 450
    .line 451
    .line 452
    iput-object v13, v5, La/j3u;->o:Ljava/lang/Object;

    .line 453
    .line 454
    iput-object v13, v5, La/j3u;->i:Ljava/lang/Object;

    .line 455
    .line 456
    iput-object v13, v5, La/j3u;->j:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 457
    .line 458
    iput-object v13, v5, La/j3u;->k:Ljava/lang/Object;

    .line 459
    .line 460
    iput v1, v5, La/j3u;->l:I

    .line 461
    .line 462
    const/4 v1, 0x3

    .line 463
    iput-byte v1, v5, La/j3u;->n:B

    .line 464
    .line 465
    invoke-interface {v6, v0, v5}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    if-ne v0, v7, :cond_11

    .line 470
    .line 471
    :goto_b
    return-object v7

    .line 472
    :cond_11
    :goto_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 473
    .line 474
    return-object v0
.end method
