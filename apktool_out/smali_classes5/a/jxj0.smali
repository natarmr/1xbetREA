.class public final La/jxj0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/duw;

.field public j:La/hru;

.field public k:La/qvo0;

.field public l:D

.field public m:D

.field public n:D

.field public o:J

.field public p:I

.field public q:B

.field public final synthetic r:La/xxj0;

.field public final synthetic s:Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

.field public final synthetic t:D

.field public final synthetic u:D


# direct methods
.method public constructor <init>(La/xxj0;Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;DDLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/jxj0;->r:La/xxj0;

    .line 2
    .line 3
    iput-object p2, p0, La/jxj0;->s:Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 4
    .line 5
    iput-wide p3, p0, La/jxj0;->t:D

    .line 6
    .line 7
    iput-wide p5, p0, La/jxj0;->u:D

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p7}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 8

    .line 1
    new-instance v0, La/jxj0;

    .line 2
    .line 3
    iget-wide v3, p0, La/jxj0;->t:D

    .line 4
    .line 5
    iget-wide v5, p0, La/jxj0;->u:D

    .line 6
    .line 7
    iget-object v1, p0, La/jxj0;->r:La/xxj0;

    .line 8
    .line 9
    iget-object v2, p0, La/jxj0;->s:Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 10
    .line 11
    move-object v7, p2

    .line 12
    invoke-direct/range {v0 .. v7}, La/jxj0;-><init>(La/xxj0;Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;DDLa/yje;)V

    .line 13
    .line 14
    .line 15
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
    invoke-virtual {p0, p1, p2}, La/jxj0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/jxj0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/jxj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v9, p0

    .line 2
    .line 3
    sget-object v11, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-byte v0, v9, La/jxj0;->q:B

    .line 6
    .line 7
    const/4 v1, 0x4

    .line 8
    const/4 v2, 0x3

    .line 9
    const/4 v3, 0x2

    .line 10
    iget-object v12, v9, La/jxj0;->s:Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x1

    .line 14
    iget-object v13, v9, La/jxj0;->r:La/xxj0;

    .line 15
    .line 16
    if-eqz v0, :cond_4

    .line 17
    .line 18
    if-eq v0, v5, :cond_3

    .line 19
    .line 20
    if-eq v0, v3, :cond_2

    .line 21
    .line 22
    if-eq v0, v2, :cond_1

    .line 23
    .line 24
    if-ne v0, v1, :cond_0

    .line 25
    .line 26
    iget-wide v0, v9, La/jxj0;->l:D

    .line 27
    .line 28
    iget-object v2, v9, La/jxj0;->i:La/duw;

    .line 29
    .line 30
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    move-wide v14, v0

    .line 34
    move-object/from16 v16, v12

    .line 35
    .line 36
    move-object/from16 v0, p1

    .line 37
    .line 38
    goto/16 :goto_6

    .line 39
    .line 40
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-object v4

    .line 46
    :cond_1
    iget v0, v9, La/jxj0;->p:I

    .line 47
    .line 48
    iget-wide v2, v9, La/jxj0;->o:J

    .line 49
    .line 50
    iget-wide v5, v9, La/jxj0;->n:D

    .line 51
    .line 52
    iget-wide v7, v9, La/jxj0;->m:D

    .line 53
    .line 54
    iget-wide v14, v9, La/jxj0;->l:D

    .line 55
    .line 56
    iget-object v10, v9, La/jxj0;->k:La/qvo0;

    .line 57
    .line 58
    iget-object v1, v9, La/jxj0;->j:La/hru;

    .line 59
    .line 60
    iget-object v4, v9, La/jxj0;->i:La/duw;

    .line 61
    .line 62
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    move-wide/from16 v17, v7

    .line 66
    .line 67
    move-object/from16 v16, v12

    .line 68
    .line 69
    move-wide v7, v2

    .line 70
    move-object v12, v4

    .line 71
    move-wide v3, v5

    .line 72
    move-object v2, v10

    .line 73
    move v5, v0

    .line 74
    move-object v10, v9

    .line 75
    move-object/from16 v0, p1

    .line 76
    .line 77
    goto/16 :goto_4

    .line 78
    .line 79
    :cond_2
    iget-wide v0, v9, La/jxj0;->o:J

    .line 80
    .line 81
    iget-wide v3, v9, La/jxj0;->n:D

    .line 82
    .line 83
    iget-wide v5, v9, La/jxj0;->m:D

    .line 84
    .line 85
    iget-wide v7, v9, La/jxj0;->l:D

    .line 86
    .line 87
    iget-object v10, v9, La/jxj0;->k:La/qvo0;

    .line 88
    .line 89
    iget-object v14, v9, La/jxj0;->j:La/hru;

    .line 90
    .line 91
    iget-object v15, v9, La/jxj0;->i:La/duw;

    .line 92
    .line 93
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    move-wide/from16 v29, v0

    .line 97
    .line 98
    move-object/from16 v0, p1

    .line 99
    .line 100
    move-object v1, v14

    .line 101
    move-object/from16 v31, v10

    .line 102
    .line 103
    move-object v10, v9

    .line 104
    move-object v9, v15

    .line 105
    move-wide v14, v7

    .line 106
    move-wide v7, v5

    .line 107
    move-wide v5, v3

    .line 108
    move-object/from16 v4, v31

    .line 109
    .line 110
    :goto_0
    move-wide/from16 v2, v29

    .line 111
    .line 112
    goto/16 :goto_3

    .line 113
    .line 114
    :cond_3
    iget-wide v0, v9, La/jxj0;->n:D

    .line 115
    .line 116
    iget-wide v4, v9, La/jxj0;->m:D

    .line 117
    .line 118
    iget-wide v6, v9, La/jxj0;->l:D

    .line 119
    .line 120
    iget-object v8, v9, La/jxj0;->j:La/hru;

    .line 121
    .line 122
    iget-object v10, v9, La/jxj0;->i:La/duw;

    .line 123
    .line 124
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    move-wide v2, v6

    .line 128
    move-object v15, v10

    .line 129
    move-wide v6, v4

    .line 130
    move-object v5, v8

    .line 131
    move-object/from16 v4, p1

    .line 132
    .line 133
    goto/16 :goto_2

    .line 134
    .line 135
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    iget-object v0, v13, La/xxj0;->k0:La/bby;

    .line 139
    .line 140
    if-eqz v0, :cond_5

    .line 141
    .line 142
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 143
    .line 144
    .line 145
    :cond_5
    invoke-static {v13}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 146
    .line 147
    .line 148
    move-result-object v21

    .line 149
    iget-object v0, v13, La/xxj0;->d:La/mne;

    .line 150
    .line 151
    iget-object v0, v0, La/mne;->a:La/rwj;

    .line 152
    .line 153
    sget-object v26, La/wxj0;->a:La/wxj0;

    .line 154
    .line 155
    new-instance v1, La/qwj0;

    .line 156
    .line 157
    const/4 v4, 0x0

    .line 158
    invoke-direct {v1, v13, v4, v5}, La/qwj0;-><init>(La/xxj0;La/yje;B)V

    .line 159
    .line 160
    .line 161
    const/16 v28, 0x20

    .line 162
    .line 163
    const-wide/16 v22, 0x1f4

    .line 164
    .line 165
    sget-object v24, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 166
    .line 167
    move-object/from16 v25, v0

    .line 168
    .line 169
    move-object/from16 v27, v1

    .line 170
    .line 171
    invoke-static/range {v21 .. v28}, La/sac;->f0(La/vne;JLjava/util/concurrent/TimeUnit;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    iput-object v0, v13, La/xxj0;->k0:La/bby;

    .line 176
    .line 177
    iget-object v0, v13, La/xxj0;->u:La/b8u;

    .line 178
    .line 179
    invoke-virtual {v0}, La/b8u;->b()La/duw;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    iget-object v1, v13, La/xxj0;->v:La/yk5;

    .line 184
    .line 185
    iget-wide v14, v12, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->a:D

    .line 186
    .line 187
    iget-wide v6, v9, La/jxj0;->t:D

    .line 188
    .line 189
    iget-wide v2, v9, La/jxj0;->u:D

    .line 190
    .line 191
    move-wide/from16 v18, v2

    .line 192
    .line 193
    move-wide/from16 v16, v6

    .line 194
    .line 195
    invoke-virtual/range {v13 .. v19}, La/xxj0;->w(DDD)D

    .line 196
    .line 197
    .line 198
    move-result-wide v21

    .line 199
    iget v2, v0, La/duw;->a:I

    .line 200
    .line 201
    iget-wide v6, v0, La/duw;->b:D

    .line 202
    .line 203
    iget-wide v14, v0, La/duw;->c:D

    .line 204
    .line 205
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    move/from16 v23, v2

    .line 209
    .line 210
    move-wide/from16 v24, v6

    .line 211
    .line 212
    move-wide/from16 v26, v14

    .line 213
    .line 214
    invoke-static/range {v21 .. v27}, La/yk5;->i(DIDD)D

    .line 215
    .line 216
    .line 217
    move-result-wide v1

    .line 218
    iget-object v3, v13, La/xxj0;->x:La/hru;

    .line 219
    .line 220
    iget-wide v6, v12, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->a:D

    .line 221
    .line 222
    iget-boolean v10, v12, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->q:Z

    .line 223
    .line 224
    if-eqz v10, :cond_6

    .line 225
    .line 226
    const-wide/high16 v16, 0x4000000000000000L    # 2.0

    .line 227
    .line 228
    goto :goto_1

    .line 229
    :cond_6
    const-wide/high16 v16, 0x3ff0000000000000L    # 1.0

    .line 230
    .line 231
    :goto_1
    mul-double v6, v6, v16

    .line 232
    .line 233
    iget-object v10, v13, La/xxj0;->C0:La/p7m0;

    .line 234
    .line 235
    invoke-virtual {v10}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v10

    .line 239
    check-cast v10, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 240
    .line 241
    iget-boolean v10, v10, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->q:Z

    .line 242
    .line 243
    const-wide/high16 v16, 0x4000000000000000L    # 2.0

    .line 244
    .line 245
    iget-wide v14, v9, La/jxj0;->t:D

    .line 246
    .line 247
    if-eqz v10, :cond_7

    .line 248
    .line 249
    div-double v14, v14, v16

    .line 250
    .line 251
    :cond_7
    iget-object v10, v13, La/xxj0;->f:La/khf0;

    .line 252
    .line 253
    sget-object v4, La/bm5;->b:La/bm5;

    .line 254
    .line 255
    iput-object v0, v9, La/jxj0;->i:La/duw;

    .line 256
    .line 257
    iput-object v3, v9, La/jxj0;->j:La/hru;

    .line 258
    .line 259
    iput-wide v1, v9, La/jxj0;->l:D

    .line 260
    .line 261
    iput-wide v6, v9, La/jxj0;->m:D

    .line 262
    .line 263
    iput-wide v14, v9, La/jxj0;->n:D

    .line 264
    .line 265
    iput-byte v5, v9, La/jxj0;->q:B

    .line 266
    .line 267
    invoke-static {v10, v4, v9}, La/khf0;->G(La/khf0;La/bm5;La/yje;)Ljava/io/Serializable;

    .line 268
    .line 269
    .line 270
    move-result-object v4

    .line 271
    if-ne v4, v11, :cond_8

    .line 272
    .line 273
    goto/16 :goto_5

    .line 274
    .line 275
    :cond_8
    move-object v5, v3

    .line 276
    move-wide v2, v1

    .line 277
    move-wide/from16 v29, v14

    .line 278
    .line 279
    move-object v15, v0

    .line 280
    move-wide/from16 v0, v29

    .line 281
    .line 282
    :goto_2
    check-cast v4, La/ql5;

    .line 283
    .line 284
    iget-wide v8, v4, La/ql5;->e:J

    .line 285
    .line 286
    sget-object v4, La/qvo0;->b:La/qvo0;

    .line 287
    .line 288
    iget-object v14, v13, La/xxj0;->R:La/pmi;

    .line 289
    .line 290
    move-object/from16 v10, p0

    .line 291
    .line 292
    iput-object v15, v10, La/jxj0;->i:La/duw;

    .line 293
    .line 294
    iput-object v5, v10, La/jxj0;->j:La/hru;

    .line 295
    .line 296
    iput-object v4, v10, La/jxj0;->k:La/qvo0;

    .line 297
    .line 298
    iput-wide v2, v10, La/jxj0;->l:D

    .line 299
    .line 300
    iput-wide v6, v10, La/jxj0;->m:D

    .line 301
    .line 302
    iput-wide v0, v10, La/jxj0;->n:D

    .line 303
    .line 304
    iput-wide v8, v10, La/jxj0;->o:J

    .line 305
    .line 306
    move-wide/from16 v17, v0

    .line 307
    .line 308
    const/4 v0, 0x2

    .line 309
    iput-byte v0, v10, La/jxj0;->q:B

    .line 310
    .line 311
    invoke-virtual {v14, v10}, La/pmi;->x(La/yje;)Ljava/io/Serializable;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    if-ne v0, v11, :cond_9

    .line 316
    .line 317
    goto :goto_5

    .line 318
    :cond_9
    move-wide/from16 v29, v8

    .line 319
    .line 320
    move-object v9, v15

    .line 321
    move-wide v14, v2

    .line 322
    move-object v1, v5

    .line 323
    move-wide v7, v6

    .line 324
    move-wide/from16 v5, v17

    .line 325
    .line 326
    goto/16 :goto_0

    .line 327
    .line 328
    :goto_3
    check-cast v0, Ljava/lang/Number;

    .line 329
    .line 330
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    move-object/from16 v16, v12

    .line 335
    .line 336
    iget-object v12, v13, La/xxj0;->b0:La/rou;

    .line 337
    .line 338
    iput-object v9, v10, La/jxj0;->i:La/duw;

    .line 339
    .line 340
    iput-object v1, v10, La/jxj0;->j:La/hru;

    .line 341
    .line 342
    iput-object v4, v10, La/jxj0;->k:La/qvo0;

    .line 343
    .line 344
    iput-wide v14, v10, La/jxj0;->l:D

    .line 345
    .line 346
    iput-wide v7, v10, La/jxj0;->m:D

    .line 347
    .line 348
    iput-wide v5, v10, La/jxj0;->n:D

    .line 349
    .line 350
    iput-wide v2, v10, La/jxj0;->o:J

    .line 351
    .line 352
    iput v0, v10, La/jxj0;->p:I

    .line 353
    .line 354
    move/from16 v17, v0

    .line 355
    .line 356
    const/4 v0, 0x3

    .line 357
    iput-byte v0, v10, La/jxj0;->q:B

    .line 358
    .line 359
    const/4 v0, 0x0

    .line 360
    invoke-virtual {v12, v0, v10}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    if-ne v0, v11, :cond_a

    .line 365
    .line 366
    goto :goto_5

    .line 367
    :cond_a
    move-wide/from16 v29, v2

    .line 368
    .line 369
    move-object v2, v4

    .line 370
    move-wide v3, v5

    .line 371
    move/from16 v5, v17

    .line 372
    .line 373
    move-wide/from16 v17, v7

    .line 374
    .line 375
    move-wide/from16 v7, v29

    .line 376
    .line 377
    move-object v12, v9

    .line 378
    :goto_4
    check-cast v0, La/m2c0;

    .line 379
    .line 380
    iget v6, v0, La/m2c0;->F:I

    .line 381
    .line 382
    iput-object v12, v10, La/jxj0;->i:La/duw;

    .line 383
    .line 384
    const/4 v0, 0x0

    .line 385
    iput-object v0, v10, La/jxj0;->j:La/hru;

    .line 386
    .line 387
    iput-object v0, v10, La/jxj0;->k:La/qvo0;

    .line 388
    .line 389
    iput-wide v14, v10, La/jxj0;->l:D

    .line 390
    .line 391
    const/4 v0, 0x4

    .line 392
    iput-byte v0, v10, La/jxj0;->q:B

    .line 393
    .line 394
    move-object v0, v1

    .line 395
    move-object v9, v10

    .line 396
    move-object v10, v2

    .line 397
    move-wide/from16 v1, v17

    .line 398
    .line 399
    invoke-virtual/range {v0 .. v10}, La/hru;->c(DDIIJLa/zje;La/qvo0;)Ljava/io/Serializable;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    if-ne v0, v11, :cond_b

    .line 404
    .line 405
    :goto_5
    return-object v11

    .line 406
    :cond_b
    move-object v2, v12

    .line 407
    :goto_6
    check-cast v0, La/hxu;

    .line 408
    .line 409
    iget v1, v2, La/duw;->a:I

    .line 410
    .line 411
    invoke-static {v0, v14, v15, v1}, La/ozb;->h0(La/hxu;DI)La/txu;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    iget-object v2, v1, La/txu;->g:La/ivo0;

    .line 416
    .line 417
    iget-wide v2, v2, La/ivo0;->b:D

    .line 418
    .line 419
    const-wide/16 v4, 0x0

    .line 420
    .line 421
    cmpl-double v2, v2, v4

    .line 422
    .line 423
    if-lez v2, :cond_c

    .line 424
    .line 425
    new-instance v2, La/dwo0;

    .line 426
    .line 427
    move-object/from16 v3, v16

    .line 428
    .line 429
    invoke-static {v1, v3}, La/xxj0;->A(La/txu;Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;)La/ank0;

    .line 430
    .line 431
    .line 432
    move-result-object v4

    .line 433
    iget-object v3, v3, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->f:Ljava/lang/String;

    .line 434
    .line 435
    iget-object v5, v13, La/xxj0;->m:La/ctf0;

    .line 436
    .line 437
    invoke-static {v1, v3, v5}, La/rsm0;->r(La/txu;Ljava/lang/String;La/ctf0;)Ljava/util/ArrayList;

    .line 438
    .line 439
    .line 440
    move-result-object v3

    .line 441
    invoke-direct {v2, v4, v3}, La/dwo0;-><init>(La/ank0;Ljava/util/ArrayList;)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v13, v2}, La/xxj0;->Q(La/gwo0;)V

    .line 445
    .line 446
    .line 447
    goto :goto_9

    .line 448
    :cond_c
    move-object/from16 v3, v16

    .line 449
    .line 450
    iget-object v2, v1, La/txu;->d:La/ivo0;

    .line 451
    .line 452
    iget-wide v6, v2, La/ivo0;->b:D

    .line 453
    .line 454
    cmpl-double v2, v6, v4

    .line 455
    .line 456
    if-gtz v2, :cond_f

    .line 457
    .line 458
    iget-object v2, v1, La/txu;->a:La/ivo0;

    .line 459
    .line 460
    iget-wide v6, v2, La/ivo0;->b:D

    .line 461
    .line 462
    cmpl-double v2, v6, v4

    .line 463
    .line 464
    if-lez v2, :cond_d

    .line 465
    .line 466
    goto :goto_8

    .line 467
    :cond_d
    iget-object v2, v13, La/xxj0;->o0:La/nwo0;

    .line 468
    .line 469
    iget-boolean v2, v2, La/nwo0;->a:Z

    .line 470
    .line 471
    if-eqz v2, :cond_e

    .line 472
    .line 473
    sget-object v2, La/wvo0;->a:La/wvo0;

    .line 474
    .line 475
    goto :goto_7

    .line 476
    :cond_e
    sget-object v2, La/zvo0;->a:La/zvo0;

    .line 477
    .line 478
    :goto_7
    invoke-virtual {v13, v2}, La/xxj0;->Q(La/gwo0;)V

    .line 479
    .line 480
    .line 481
    goto :goto_9

    .line 482
    :cond_f
    :goto_8
    new-instance v2, La/dwo0;

    .line 483
    .line 484
    invoke-static {v1, v3}, La/xxj0;->A(La/txu;Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;)La/ank0;

    .line 485
    .line 486
    .line 487
    move-result-object v4

    .line 488
    iget-object v3, v3, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->f:Ljava/lang/String;

    .line 489
    .line 490
    invoke-static {v0, v3}, La/rsm0;->q(La/hxu;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 491
    .line 492
    .line 493
    move-result-object v3

    .line 494
    invoke-direct {v2, v4, v3}, La/dwo0;-><init>(La/ank0;Ljava/util/ArrayList;)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v13, v2}, La/xxj0;->Q(La/gwo0;)V

    .line 498
    .line 499
    .line 500
    :goto_9
    iget-wide v2, v9, La/jxj0;->t:D

    .line 501
    .line 502
    iget-wide v4, v9, La/jxj0;->u:D

    .line 503
    .line 504
    iget-object v15, v9, La/jxj0;->s:Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 505
    .line 506
    move-object v14, v0

    .line 507
    move-object/from16 v18, v1

    .line 508
    .line 509
    move-wide/from16 v16, v2

    .line 510
    .line 511
    move-wide/from16 v19, v4

    .line 512
    .line 513
    invoke-virtual/range {v13 .. v20}, La/xxj0;->y(La/hxu;Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;DLa/txu;D)V

    .line 514
    .line 515
    .line 516
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 517
    .line 518
    return-object v0
.end method
