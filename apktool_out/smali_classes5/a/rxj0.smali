.class public final La/rxj0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/aer;


# instance fields
.field public i:D

.field public j:Z

.field public synthetic k:Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

.field public synthetic l:D

.field public synthetic m:La/cit0;

.field public synthetic n:Z

.field public final synthetic o:La/xxj0;


# direct methods
.method public constructor <init>(La/xxj0;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/rxj0;->o:La/xxj0;

    .line 2
    .line 3
    const/4 p1, 0x6

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/rxj0;->o:La/xxj0;

    .line 4
    .line 5
    iget-object v8, v1, La/xxj0;->A0:La/p7m0;

    .line 6
    .line 7
    iget-object v2, v1, La/xxj0;->o0:La/nwo0;

    .line 8
    .line 9
    iget-object v9, v0, La/rxj0;->k:Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 10
    .line 11
    iget-wide v3, v0, La/rxj0;->l:D

    .line 12
    .line 13
    iget-object v5, v0, La/rxj0;->m:La/cit0;

    .line 14
    .line 15
    iget-boolean v6, v0, La/rxj0;->n:Z

    .line 16
    .line 17
    sget-object v7, La/wne;->a:La/wne;

    .line 18
    .line 19
    iget-boolean v10, v0, La/rxj0;->j:Z

    .line 20
    .line 21
    const/4 v11, 0x0

    .line 22
    const/4 v12, 0x1

    .line 23
    if-eqz v10, :cond_1

    .line 24
    .line 25
    if-ne v10, v12, :cond_0

    .line 26
    .line 27
    iget-wide v3, v0, La/rxj0;->i:D

    .line 28
    .line 29
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    move-object/from16 v0, p1

    .line 33
    .line 34
    move-object/from16 v31, v2

    .line 35
    .line 36
    move-object/from16 v34, v8

    .line 37
    .line 38
    move v2, v12

    .line 39
    goto/16 :goto_2

    .line 40
    .line 41
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v11

    .line 47
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object v10, v1, La/xxj0;->M:La/vzg0;

    .line 51
    .line 52
    const/16 v29, 0x0

    .line 53
    .line 54
    const v30, 0x1bfff

    .line 55
    .line 56
    .line 57
    move-object v13, v10

    .line 58
    move-object v14, v11

    .line 59
    const-wide/16 v10, 0x0

    .line 60
    .line 61
    move/from16 v16, v12

    .line 62
    .line 63
    move-object v15, v13

    .line 64
    const-wide/16 v12, 0x0

    .line 65
    .line 66
    move-object/from16 v18, v14

    .line 67
    .line 68
    move-object/from16 v17, v15

    .line 69
    .line 70
    const-wide/16 v14, 0x0

    .line 71
    .line 72
    move/from16 v20, v16

    .line 73
    .line 74
    move-object/from16 v19, v17

    .line 75
    .line 76
    const-wide/16 v16, 0x0

    .line 77
    .line 78
    move-object/from16 v22, v18

    .line 79
    .line 80
    move-object/from16 v21, v19

    .line 81
    .line 82
    const-wide/16 v18, 0x0

    .line 83
    .line 84
    move/from16 v23, v20

    .line 85
    .line 86
    const/16 v20, 0x0

    .line 87
    .line 88
    move-object/from16 v24, v21

    .line 89
    .line 90
    const/16 v21, 0x0

    .line 91
    .line 92
    move-object/from16 v25, v22

    .line 93
    .line 94
    const/16 v22, 0x0

    .line 95
    .line 96
    move/from16 v26, v23

    .line 97
    .line 98
    const/16 v23, 0x0

    .line 99
    .line 100
    move-object/from16 v27, v24

    .line 101
    .line 102
    const/16 v24, 0x0

    .line 103
    .line 104
    move-object/from16 v28, v25

    .line 105
    .line 106
    const/16 v25, 0x0

    .line 107
    .line 108
    move/from16 v31, v26

    .line 109
    .line 110
    const/16 v26, 0x0

    .line 111
    .line 112
    move-object/from16 v32, v27

    .line 113
    .line 114
    const/16 v27, 0x1

    .line 115
    .line 116
    move-object/from16 v33, v28

    .line 117
    .line 118
    const/16 v28, 0x0

    .line 119
    .line 120
    move/from16 v34, v31

    .line 121
    .line 122
    move-object/from16 v31, v2

    .line 123
    .line 124
    move/from16 v2, v34

    .line 125
    .line 126
    move-object/from16 v34, v8

    .line 127
    .line 128
    move-object/from16 v8, v32

    .line 129
    .line 130
    invoke-static/range {v9 .. v30}, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->a(Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;DDDDDLjava/lang/String;ZZLorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;ZZZZZZI)Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 131
    .line 132
    .line 133
    move-result-object v10

    .line 134
    const-string v11, "SAVED_STATE_STEP_INPUT_KEY"

    .line 135
    .line 136
    invoke-virtual {v8, v11, v10}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    iget-object v8, v1, La/xxj0;->j0:La/bby;

    .line 140
    .line 141
    if-eqz v8, :cond_2

    .line 142
    .line 143
    new-instance v10, Ljava/util/concurrent/CancellationException;

    .line 144
    .line 145
    const-string v11, "New config"

    .line 146
    .line 147
    invoke-direct {v10, v11}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-interface {v8, v10}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 151
    .line 152
    .line 153
    :cond_2
    iget-boolean v8, v9, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->q:Z

    .line 154
    .line 155
    if-nez v8, :cond_3

    .line 156
    .line 157
    :goto_0
    move-wide v10, v3

    .line 158
    goto :goto_1

    .line 159
    :cond_3
    iget-object v8, v1, La/xxj0;->K:La/rpt;

    .line 160
    .line 161
    invoke-virtual {v8}, La/rpt;->g()La/cit0;

    .line 162
    .line 163
    .line 164
    move-result-object v8

    .line 165
    iget-wide v10, v8, La/cit0;->e0:D

    .line 166
    .line 167
    const-wide/16 v12, 0x0

    .line 168
    .line 169
    cmpg-double v8, v10, v12

    .line 170
    .line 171
    if-nez v8, :cond_4

    .line 172
    .line 173
    goto :goto_0

    .line 174
    :cond_4
    :goto_1
    iget-object v8, v1, La/xxj0;->t:La/m1e;

    .line 175
    .line 176
    invoke-interface {v8}, La/m1e;->b()La/gmq;

    .line 177
    .line 178
    .line 179
    move-result-object v8

    .line 180
    iput-object v9, v0, La/rxj0;->k:Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 181
    .line 182
    iput-object v5, v0, La/rxj0;->m:La/cit0;

    .line 183
    .line 184
    iput-wide v3, v0, La/rxj0;->l:D

    .line 185
    .line 186
    iput-boolean v6, v0, La/rxj0;->n:Z

    .line 187
    .line 188
    iput-wide v10, v0, La/rxj0;->i:D

    .line 189
    .line 190
    iput-boolean v2, v0, La/rxj0;->j:Z

    .line 191
    .line 192
    invoke-static {v8, v0}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    if-ne v0, v7, :cond_5

    .line 197
    .line 198
    return-object v7

    .line 199
    :cond_5
    move-wide v3, v10

    .line 200
    :goto_2
    check-cast v0, Ljava/lang/Boolean;

    .line 201
    .line 202
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    sget-object v7, La/onb0;->a:La/onb0;

    .line 207
    .line 208
    if-nez v0, :cond_6

    .line 209
    .line 210
    move-object/from16 v0, v31

    .line 211
    .line 212
    iget-boolean v8, v0, La/nwo0;->a:Z

    .line 213
    .line 214
    if-eqz v8, :cond_7

    .line 215
    .line 216
    sget-object v0, La/bwo0;->a:La/bwo0;

    .line 217
    .line 218
    invoke-virtual {v1, v0}, La/xxj0;->Q(La/gwo0;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v1, v7}, La/xxj0;->P(La/qnb0;)V

    .line 222
    .line 223
    .line 224
    goto/16 :goto_6

    .line 225
    .line 226
    :cond_6
    move-object/from16 v0, v31

    .line 227
    .line 228
    :cond_7
    invoke-static {v9}, La/xxj0;->G(Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;)Z

    .line 229
    .line 230
    .line 231
    move-result v8

    .line 232
    if-eqz v8, :cond_8

    .line 233
    .line 234
    iget-boolean v8, v0, La/nwo0;->a:Z

    .line 235
    .line 236
    if-nez v8, :cond_9

    .line 237
    .line 238
    iget-boolean v8, v0, La/nwo0;->b:Z

    .line 239
    .line 240
    if-eqz v8, :cond_8

    .line 241
    .line 242
    invoke-virtual/range {v34 .. v34}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v8

    .line 246
    check-cast v8, Ljava/lang/Boolean;

    .line 247
    .line 248
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 249
    .line 250
    .line 251
    move-result v8

    .line 252
    if-eqz v8, :cond_8

    .line 253
    .line 254
    goto :goto_3

    .line 255
    :cond_8
    move-object v2, v9

    .line 256
    goto/16 :goto_4

    .line 257
    .line 258
    :cond_9
    :goto_3
    if-eqz v6, :cond_8

    .line 259
    .line 260
    iget-object v6, v1, La/xxj0;->B0:La/p7m0;

    .line 261
    .line 262
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v6

    .line 266
    instance-of v6, v6, La/onb0;

    .line 267
    .line 268
    if-eqz v6, :cond_b

    .line 269
    .line 270
    iget-boolean v0, v0, La/nwo0;->a:Z

    .line 271
    .line 272
    iget-object v6, v1, La/xxj0;->P:La/fl70;

    .line 273
    .line 274
    iget-wide v12, v9, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->a:D

    .line 275
    .line 276
    iget-wide v14, v9, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->d:D

    .line 277
    .line 278
    invoke-virtual {v9}, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->b()D

    .line 279
    .line 280
    .line 281
    move-result-wide v16

    .line 282
    iget-boolean v8, v9, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->g:Z

    .line 283
    .line 284
    iget-boolean v10, v9, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->n:Z

    .line 285
    .line 286
    move-wide/from16 p0, v3

    .line 287
    .line 288
    iget-wide v2, v9, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->b:D

    .line 289
    .line 290
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    move-wide/from16 v20, v2

    .line 294
    .line 295
    move/from16 v18, v8

    .line 296
    .line 297
    move/from16 v19, v10

    .line 298
    .line 299
    move-wide/from16 v10, p0

    .line 300
    .line 301
    invoke-static/range {v10 .. v21}, La/fl70;->c(DDDDZZD)Z

    .line 302
    .line 303
    .line 304
    move-result v2

    .line 305
    move-wide v3, v10

    .line 306
    if-eqz v2, :cond_a

    .line 307
    .line 308
    iget-object v2, v1, La/xxj0;->Q:La/bst;

    .line 309
    .line 310
    sget-object v6, La/q4f;->c:La/q4f;

    .line 311
    .line 312
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    invoke-static {v6}, La/bst;->g(La/q4f;)Z

    .line 316
    .line 317
    .line 318
    move-result v2

    .line 319
    if-eqz v2, :cond_a

    .line 320
    .line 321
    invoke-virtual {v1, v0}, La/xxj0;->z(Z)La/pnb0;

    .line 322
    .line 323
    .line 324
    move-result-object v7

    .line 325
    :cond_a
    invoke-virtual {v1, v7}, La/xxj0;->P(La/qnb0;)V

    .line 326
    .line 327
    .line 328
    :cond_b
    iget-wide v5, v5, La/cit0;->N:D

    .line 329
    .line 330
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 331
    .line 332
    .line 333
    move-result-object v10

    .line 334
    iget-object v0, v1, La/xxj0;->d:La/mne;

    .line 335
    .line 336
    iget-object v14, v0, La/mne;->b:La/dvj;

    .line 337
    .line 338
    new-instance v15, La/iwj0;

    .line 339
    .line 340
    const/4 v2, 0x1

    .line 341
    invoke-direct {v15, v1, v2}, La/iwj0;-><init>(La/xxj0;B)V

    .line 342
    .line 343
    .line 344
    new-instance v0, La/jxj0;

    .line 345
    .line 346
    const/4 v7, 0x0

    .line 347
    move-object v2, v9

    .line 348
    invoke-direct/range {v0 .. v7}, La/jxj0;-><init>(La/xxj0;Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;DDLa/yje;)V

    .line 349
    .line 350
    .line 351
    const/16 v17, 0x20

    .line 352
    .line 353
    const-wide/16 v11, 0x1f4

    .line 354
    .line 355
    sget-object v13, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 356
    .line 357
    move-object/from16 v16, v0

    .line 358
    .line 359
    invoke-static/range {v10 .. v17}, La/sac;->f0(La/vne;JLjava/util/concurrent/TimeUnit;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    iput-object v0, v1, La/xxj0;->j0:La/bby;

    .line 364
    .line 365
    iget-object v0, v1, La/xxj0;->y:La/pyu;

    .line 366
    .line 367
    iget-object v0, v0, La/pyu;->a:Ljava/lang/Object;

    .line 368
    .line 369
    check-cast v0, La/ovo0;

    .line 370
    .line 371
    iget-boolean v0, v0, La/ovo0;->a:Z

    .line 372
    .line 373
    move-object/from16 v1, v34

    .line 374
    .line 375
    const/4 v14, 0x0

    .line 376
    invoke-static {v0, v1, v14}, La/twn;->A(ZLa/p7m0;Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    goto :goto_6

    .line 380
    :goto_4
    invoke-static {v2}, La/xxj0;->G(Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;)Z

    .line 381
    .line 382
    .line 383
    move-result v0

    .line 384
    if-eqz v0, :cond_c

    .line 385
    .line 386
    move-object v0, v1

    .line 387
    sget-object v1, La/hxu;->h:La/hxu;

    .line 388
    .line 389
    const/4 v6, 0x0

    .line 390
    iget-wide v7, v5, La/cit0;->N:D

    .line 391
    .line 392
    move-object v5, v6

    .line 393
    move-wide v6, v7

    .line 394
    invoke-virtual/range {v0 .. v7}, La/xxj0;->y(La/hxu;Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;DLa/txu;D)V

    .line 395
    .line 396
    .line 397
    goto :goto_6

    .line 398
    :cond_c
    move-object v0, v1

    .line 399
    iget-object v1, v0, La/xxj0;->o0:La/nwo0;

    .line 400
    .line 401
    iget-boolean v1, v1, La/nwo0;->a:Z

    .line 402
    .line 403
    if-eqz v1, :cond_d

    .line 404
    .line 405
    sget-object v1, La/wvo0;->a:La/wvo0;

    .line 406
    .line 407
    goto :goto_5

    .line 408
    :cond_d
    sget-object v1, La/zvo0;->a:La/zvo0;

    .line 409
    .line 410
    :goto_5
    invoke-virtual {v0, v1}, La/xxj0;->Q(La/gwo0;)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {v0, v7}, La/xxj0;->P(La/qnb0;)V

    .line 414
    .line 415
    .line 416
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 417
    .line 418
    return-object v0
.end method

.method public final n(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    check-cast p3, La/cit0;

    .line 10
    .line 11
    check-cast p4, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    check-cast p5, Lkotlin/Unit;

    .line 18
    .line 19
    check-cast p6, La/yje;

    .line 20
    .line 21
    new-instance p4, La/rxj0;

    .line 22
    .line 23
    iget-object p0, p0, La/rxj0;->o:La/xxj0;

    .line 24
    .line 25
    invoke-direct {p4, p0, p6}, La/rxj0;-><init>(La/xxj0;La/yje;)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p4, La/rxj0;->k:Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 29
    .line 30
    iput-wide v0, p4, La/rxj0;->l:D

    .line 31
    .line 32
    iput-object p3, p4, La/rxj0;->m:La/cit0;

    .line 33
    .line 34
    iput-boolean p2, p4, La/rxj0;->n:Z

    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p4, p0}, La/rxj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method
