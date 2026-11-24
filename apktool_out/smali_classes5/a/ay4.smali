.class public final La/ay4;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:D

.field public j:D

.field public k:D

.field public l:La/hru;

.field public m:La/qvo0;

.field public n:J

.field public o:I

.field public p:B

.field public final synthetic q:La/fy4;

.field public final synthetic r:Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;

.field public final synthetic s:Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

.field public final synthetic t:D


# direct methods
.method public constructor <init>(La/fy4;Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;DLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ay4;->q:La/fy4;

    .line 2
    .line 3
    iput-object p2, p0, La/ay4;->r:Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;

    .line 4
    .line 5
    iput-object p3, p0, La/ay4;->s:Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 6
    .line 7
    iput-wide p4, p0, La/ay4;->t:D

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    new-instance v0, La/ay4;

    .line 2
    .line 3
    iget-object v3, p0, La/ay4;->s:Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 4
    .line 5
    iget-wide v4, p0, La/ay4;->t:D

    .line 6
    .line 7
    iget-object v1, p0, La/ay4;->q:La/fy4;

    .line 8
    .line 9
    iget-object v2, p0, La/ay4;->r:Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;

    .line 10
    .line 11
    move-object v6, p2

    .line 12
    invoke-direct/range {v0 .. v6}, La/ay4;-><init>(La/fy4;Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;DLa/yje;)V

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
    invoke-virtual {p0, p1, p2}, La/ay4;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/ay4;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/ay4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v9, p0

    .line 2
    .line 3
    sget-object v11, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-byte v0, v9, La/ay4;->p:B

    .line 6
    .line 7
    iget-object v12, v9, La/ay4;->s:Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 8
    .line 9
    const/4 v1, 0x4

    .line 10
    const/4 v2, 0x3

    .line 11
    const/4 v3, 0x2

    .line 12
    const/4 v13, 0x1

    .line 13
    const/4 v4, 0x0

    .line 14
    iget-object v15, v9, La/ay4;->q:La/fy4;

    .line 15
    .line 16
    if-eqz v0, :cond_4

    .line 17
    .line 18
    if-eq v0, v13, :cond_3

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
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    move-object/from16 v0, p1

    .line 30
    .line 31
    goto/16 :goto_4

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
    return-object v4

    .line 39
    :cond_1
    iget v0, v9, La/ay4;->o:I

    .line 40
    .line 41
    iget-wide v2, v9, La/ay4;->n:J

    .line 42
    .line 43
    iget-wide v5, v9, La/ay4;->k:D

    .line 44
    .line 45
    iget-wide v7, v9, La/ay4;->j:D

    .line 46
    .line 47
    move-wide/from16 v16, v2

    .line 48
    .line 49
    iget-wide v1, v9, La/ay4;->i:D

    .line 50
    .line 51
    iget-object v3, v9, La/ay4;->m:La/qvo0;

    .line 52
    .line 53
    iget-object v14, v9, La/ay4;->l:La/hru;

    .line 54
    .line 55
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    move-object v10, v3

    .line 59
    move-wide v3, v5

    .line 60
    move-object/from16 v20, v14

    .line 61
    .line 62
    move v5, v0

    .line 63
    move-wide v13, v7

    .line 64
    move-wide/from16 v7, v16

    .line 65
    .line 66
    move-object/from16 v0, p1

    .line 67
    .line 68
    goto/16 :goto_2

    .line 69
    .line 70
    :cond_2
    iget-wide v0, v9, La/ay4;->n:J

    .line 71
    .line 72
    iget-wide v5, v9, La/ay4;->k:D

    .line 73
    .line 74
    iget-wide v7, v9, La/ay4;->j:D

    .line 75
    .line 76
    iget-wide v2, v9, La/ay4;->i:D

    .line 77
    .line 78
    iget-object v10, v9, La/ay4;->m:La/qvo0;

    .line 79
    .line 80
    iget-object v14, v9, La/ay4;->l:La/hru;

    .line 81
    .line 82
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    move-wide/from16 v26, v0

    .line 86
    .line 87
    move-object v0, v14

    .line 88
    move-wide v13, v7

    .line 89
    move-wide/from16 v7, v26

    .line 90
    .line 91
    move-wide v1, v2

    .line 92
    move-object/from16 v3, p1

    .line 93
    .line 94
    goto/16 :goto_1

    .line 95
    .line 96
    :cond_3
    iget-wide v0, v9, La/ay4;->k:D

    .line 97
    .line 98
    iget-wide v5, v9, La/ay4;->j:D

    .line 99
    .line 100
    iget-wide v7, v9, La/ay4;->i:D

    .line 101
    .line 102
    iget-object v2, v9, La/ay4;->l:La/hru;

    .line 103
    .line 104
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    move-wide v13, v7

    .line 108
    move-object/from16 v7, p1

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    iget-object v0, v15, La/fy4;->T:La/bby;

    .line 115
    .line 116
    if-eqz v0, :cond_5

    .line 117
    .line 118
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 119
    .line 120
    .line 121
    :cond_5
    invoke-static {v15}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 122
    .line 123
    .line 124
    move-result-object v18

    .line 125
    iget-object v0, v15, La/fy4;->g:La/mne;

    .line 126
    .line 127
    iget-object v0, v0, La/mne;->a:La/rwj;

    .line 128
    .line 129
    sget-object v23, La/ey4;->a:La/ey4;

    .line 130
    .line 131
    new-instance v1, La/wa;

    .line 132
    .line 133
    const/16 v2, 0xe

    .line 134
    .line 135
    invoke-direct {v1, v15, v4, v2}, La/wa;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 136
    .line 137
    .line 138
    const/16 v25, 0x20

    .line 139
    .line 140
    const-wide/16 v19, 0x1f4

    .line 141
    .line 142
    sget-object v21, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 143
    .line 144
    move-object/from16 v22, v0

    .line 145
    .line 146
    move-object/from16 v24, v1

    .line 147
    .line 148
    invoke-static/range {v18 .. v25}, La/sac;->f0(La/vne;JLjava/util/concurrent/TimeUnit;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    iput-object v0, v15, La/fy4;->T:La/bby;

    .line 153
    .line 154
    iget-object v0, v9, La/ay4;->r:Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;

    .line 155
    .line 156
    iget-object v0, v0, Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;->a:Ljava/math/BigDecimal;

    .line 157
    .line 158
    invoke-virtual {v0}, Ljava/math/BigDecimal;->doubleValue()D

    .line 159
    .line 160
    .line 161
    move-result-wide v0

    .line 162
    iget-object v2, v15, La/fy4;->s:La/hru;

    .line 163
    .line 164
    iget-wide v5, v12, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->a:D

    .line 165
    .line 166
    iget-object v7, v15, La/fy4;->e:La/khf0;

    .line 167
    .line 168
    sget-object v8, La/bm5;->b:La/bm5;

    .line 169
    .line 170
    iput-object v2, v9, La/ay4;->l:La/hru;

    .line 171
    .line 172
    iput-wide v0, v9, La/ay4;->i:D

    .line 173
    .line 174
    iput-wide v5, v9, La/ay4;->j:D

    .line 175
    .line 176
    iput-wide v0, v9, La/ay4;->k:D

    .line 177
    .line 178
    iput-byte v13, v9, La/ay4;->p:B

    .line 179
    .line 180
    invoke-static {v7, v8, v9}, La/khf0;->G(La/khf0;La/bm5;La/yje;)Ljava/io/Serializable;

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    if-ne v7, v11, :cond_6

    .line 185
    .line 186
    goto/16 :goto_3

    .line 187
    .line 188
    :cond_6
    move-wide v13, v0

    .line 189
    :goto_0
    check-cast v7, La/ql5;

    .line 190
    .line 191
    iget-wide v7, v7, La/ql5;->e:J

    .line 192
    .line 193
    sget-object v10, La/qvo0;->b:La/qvo0;

    .line 194
    .line 195
    iget-object v4, v15, La/fy4;->B:La/pmi;

    .line 196
    .line 197
    iput-object v2, v9, La/ay4;->l:La/hru;

    .line 198
    .line 199
    iput-object v10, v9, La/ay4;->m:La/qvo0;

    .line 200
    .line 201
    iput-wide v13, v9, La/ay4;->i:D

    .line 202
    .line 203
    iput-wide v5, v9, La/ay4;->j:D

    .line 204
    .line 205
    iput-wide v0, v9, La/ay4;->k:D

    .line 206
    .line 207
    iput-wide v7, v9, La/ay4;->n:J

    .line 208
    .line 209
    iput-byte v3, v9, La/ay4;->p:B

    .line 210
    .line 211
    invoke-virtual {v4, v9}, La/pmi;->x(La/yje;)Ljava/io/Serializable;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    if-ne v3, v11, :cond_7

    .line 216
    .line 217
    goto :goto_3

    .line 218
    :cond_7
    move-wide/from16 v26, v0

    .line 219
    .line 220
    move-object v0, v2

    .line 221
    move-wide v1, v13

    .line 222
    move-wide v13, v5

    .line 223
    move-wide/from16 v5, v26

    .line 224
    .line 225
    :goto_1
    check-cast v3, Ljava/lang/Number;

    .line 226
    .line 227
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    iget-object v4, v15, La/fy4;->N:La/rou;

    .line 232
    .line 233
    iput-object v0, v9, La/ay4;->l:La/hru;

    .line 234
    .line 235
    iput-object v10, v9, La/ay4;->m:La/qvo0;

    .line 236
    .line 237
    iput-wide v1, v9, La/ay4;->i:D

    .line 238
    .line 239
    iput-wide v13, v9, La/ay4;->j:D

    .line 240
    .line 241
    iput-wide v5, v9, La/ay4;->k:D

    .line 242
    .line 243
    iput-wide v7, v9, La/ay4;->n:J

    .line 244
    .line 245
    iput v3, v9, La/ay4;->o:I

    .line 246
    .line 247
    move-object/from16 v20, v0

    .line 248
    .line 249
    const/4 v0, 0x3

    .line 250
    iput-byte v0, v9, La/ay4;->p:B

    .line 251
    .line 252
    const/4 v0, 0x0

    .line 253
    invoke-virtual {v4, v0, v9}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    if-ne v0, v11, :cond_8

    .line 258
    .line 259
    goto :goto_3

    .line 260
    :cond_8
    move-wide/from16 v26, v5

    .line 261
    .line 262
    move v5, v3

    .line 263
    move-wide/from16 v3, v26

    .line 264
    .line 265
    :goto_2
    check-cast v0, La/m2c0;

    .line 266
    .line 267
    iget v6, v0, La/m2c0;->F:I

    .line 268
    .line 269
    const/4 v0, 0x0

    .line 270
    iput-object v0, v9, La/ay4;->l:La/hru;

    .line 271
    .line 272
    iput-object v0, v9, La/ay4;->m:La/qvo0;

    .line 273
    .line 274
    iput-wide v1, v9, La/ay4;->i:D

    .line 275
    .line 276
    const/4 v0, 0x4

    .line 277
    iput-byte v0, v9, La/ay4;->p:B

    .line 278
    .line 279
    move-wide v1, v13

    .line 280
    move-object/from16 v0, v20

    .line 281
    .line 282
    invoke-virtual/range {v0 .. v10}, La/hru;->c(DDIIJLa/zje;La/qvo0;)Ljava/io/Serializable;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    if-ne v0, v11, :cond_9

    .line 287
    .line 288
    :goto_3
    return-object v11

    .line 289
    :cond_9
    :goto_4
    check-cast v0, La/hxu;

    .line 290
    .line 291
    iget-object v1, v0, La/hxu;->d:La/ivo0;

    .line 292
    .line 293
    iget-wide v1, v1, La/ivo0;->b:D

    .line 294
    .line 295
    const-wide/16 v3, 0x0

    .line 296
    .line 297
    cmpl-double v1, v1, v3

    .line 298
    .line 299
    if-gtz v1, :cond_c

    .line 300
    .line 301
    iget-object v1, v0, La/hxu;->a:La/ivo0;

    .line 302
    .line 303
    iget-wide v1, v1, La/ivo0;->b:D

    .line 304
    .line 305
    cmpl-double v1, v1, v3

    .line 306
    .line 307
    if-lez v1, :cond_a

    .line 308
    .line 309
    goto :goto_6

    .line 310
    :cond_a
    iget-object v1, v15, La/fy4;->W:La/nwo0;

    .line 311
    .line 312
    iget-boolean v1, v1, La/nwo0;->a:Z

    .line 313
    .line 314
    if-eqz v1, :cond_b

    .line 315
    .line 316
    sget-object v1, La/wvo0;->a:La/wvo0;

    .line 317
    .line 318
    goto :goto_5

    .line 319
    :cond_b
    sget-object v1, La/zvo0;->a:La/zvo0;

    .line 320
    .line 321
    :goto_5
    invoke-virtual {v15, v1}, La/fy4;->H(La/gwo0;)V

    .line 322
    .line 323
    .line 324
    goto :goto_9

    .line 325
    :cond_c
    :goto_6
    new-instance v1, La/dwo0;

    .line 326
    .line 327
    new-instance v2, Ljava/util/ArrayList;

    .line 328
    .line 329
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 330
    .line 331
    .line 332
    new-instance v19, La/bnk0;

    .line 333
    .line 334
    invoke-direct/range {v19 .. v19}, La/bnk0;-><init>()V

    .line 335
    .line 336
    .line 337
    iget-wide v5, v0, La/hxu;->g:D

    .line 338
    .line 339
    cmpl-double v7, v5, v3

    .line 340
    .line 341
    if-lez v7, :cond_e

    .line 342
    .line 343
    sget v3, La/cy7;->a:I

    .line 344
    .line 345
    sget-object v3, La/pn40;->a:La/pn40;

    .line 346
    .line 347
    iget-object v3, v12, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->f:Ljava/lang/String;

    .line 348
    .line 349
    invoke-static {v3, v5, v6}, La/pn40;->p(Ljava/lang/String;D)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v3

    .line 353
    invoke-static {v3}, La/cy7;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v20

    .line 357
    const/16 v24, 0x0

    .line 358
    .line 359
    const/16 v25, 0x36

    .line 360
    .line 361
    const/16 v21, 0x0

    .line 362
    .line 363
    const v22, 0x7f0606c1

    .line 364
    .line 365
    .line 366
    const/16 v23, 0x0

    .line 367
    .line 368
    invoke-static/range {v19 .. v25}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 369
    .line 370
    .line 371
    :cond_d
    :goto_7
    move-object/from16 v3, v19

    .line 372
    .line 373
    goto :goto_8

    .line 374
    :cond_e
    cmpg-double v3, v5, v3

    .line 375
    .line 376
    if-gez v3, :cond_d

    .line 377
    .line 378
    sget v3, La/cy7;->a:I

    .line 379
    .line 380
    sget-object v3, La/pn40;->a:La/pn40;

    .line 381
    .line 382
    iget-object v3, v12, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->f:Ljava/lang/String;

    .line 383
    .line 384
    invoke-static {v3, v5, v6}, La/pn40;->p(Ljava/lang/String;D)Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v3

    .line 388
    invoke-static {v3}, La/cy7;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v20

    .line 392
    const/16 v24, 0x0

    .line 393
    .line 394
    const/16 v25, 0x3e

    .line 395
    .line 396
    const/16 v21, 0x0

    .line 397
    .line 398
    const/16 v22, 0x0

    .line 399
    .line 400
    const/16 v23, 0x0

    .line 401
    .line 402
    invoke-static/range {v19 .. v25}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 403
    .line 404
    .line 405
    goto :goto_7

    .line 406
    :goto_8
    iget-object v3, v3, La/bnk0;->a:Ljava/util/ArrayList;

    .line 407
    .line 408
    invoke-static {v2, v3, v2}, La/w6x;->l(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)La/ank0;

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    iget-object v3, v12, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->f:Ljava/lang/String;

    .line 413
    .line 414
    invoke-static {v0, v3}, La/rsm0;->q(La/hxu;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 415
    .line 416
    .line 417
    move-result-object v3

    .line 418
    invoke-direct {v1, v2, v3}, La/dwo0;-><init>(La/ank0;Ljava/util/ArrayList;)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v15, v1}, La/fy4;->H(La/gwo0;)V

    .line 422
    .line 423
    .line 424
    :goto_9
    invoke-static {v15}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 425
    .line 426
    .line 427
    move-result-object v4

    .line 428
    new-instance v5, La/sx4;

    .line 429
    .line 430
    const/4 v1, 0x1

    .line 431
    invoke-direct {v5, v15, v1}, La/sx4;-><init>(La/fy4;B)V

    .line 432
    .line 433
    .line 434
    iget-object v1, v15, La/fy4;->g:La/mne;

    .line 435
    .line 436
    iget-object v7, v1, La/mne;->b:La/dvj;

    .line 437
    .line 438
    new-instance v14, La/vx4;

    .line 439
    .line 440
    const/16 v21, 0x0

    .line 441
    .line 442
    iget-object v1, v9, La/ay4;->s:Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 443
    .line 444
    iget-object v2, v9, La/ay4;->r:Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;

    .line 445
    .line 446
    iget-wide v8, v9, La/ay4;->t:D

    .line 447
    .line 448
    move-object/from16 v16, v0

    .line 449
    .line 450
    move-object/from16 v17, v1

    .line 451
    .line 452
    move-object/from16 v18, v2

    .line 453
    .line 454
    move-wide/from16 v19, v8

    .line 455
    .line 456
    invoke-direct/range {v14 .. v21}, La/vx4;-><init>(La/fy4;La/hxu;Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;DLa/yje;)V

    .line 457
    .line 458
    .line 459
    const/16 v9, 0xa

    .line 460
    .line 461
    const/4 v6, 0x0

    .line 462
    move-object v8, v14

    .line 463
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 464
    .line 465
    .line 466
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 467
    .line 468
    return-object v0
.end method
