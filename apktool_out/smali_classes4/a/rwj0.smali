.class public final La/rwj0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:D

.field public j:D

.field public k:D

.field public l:La/ql5;

.field public m:La/yh7;

.field public n:B

.field public final synthetic o:La/yxj0;

.field public final synthetic p:Z


# direct methods
.method public constructor <init>(La/yxj0;ZLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/rwj0;->o:La/yxj0;

    .line 2
    .line 3
    iput-boolean p2, p0, La/rwj0;->p:Z

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
    new-instance p1, La/rwj0;

    .line 2
    .line 3
    iget-object v0, p0, La/rwj0;->o:La/yxj0;

    .line 4
    .line 5
    iget-boolean p0, p0, La/rwj0;->p:Z

    .line 6
    .line 7
    invoke-direct {p1, v0, p0, p2}, La/rwj0;-><init>(La/yxj0;ZLa/yje;)V

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
    invoke-virtual {p0, p1, p2}, La/rwj0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/rwj0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/rwj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 45

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/rwj0;->o:La/yxj0;

    .line 4
    .line 5
    iget-object v2, v1, La/yxj0;->a0:La/p7m0;

    .line 6
    .line 7
    iget-object v3, v1, La/yxj0;->D:La/ctf0;

    .line 8
    .line 9
    iget-object v4, v1, La/d06;->b:Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;

    .line 10
    .line 11
    sget-object v5, La/wne;->a:La/wne;

    .line 12
    .line 13
    iget-byte v6, v0, La/rwj0;->n:B

    .line 14
    .line 15
    const/4 v7, 0x3

    .line 16
    const/4 v8, 0x2

    .line 17
    const/4 v9, 0x0

    .line 18
    const/4 v10, 0x1

    .line 19
    const/4 v11, 0x0

    .line 20
    if-eqz v6, :cond_3

    .line 21
    .line 22
    if-eq v6, v10, :cond_2

    .line 23
    .line 24
    if-eq v6, v8, :cond_1

    .line 25
    .line 26
    if-ne v6, v7, :cond_0

    .line 27
    .line 28
    iget-object v0, v0, La/rwj0;->m:La/yh7;

    .line 29
    .line 30
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    move-object v13, v0

    .line 34
    move-object v0, v1

    .line 35
    move-object/from16 v36, v4

    .line 36
    .line 37
    goto/16 :goto_b

    .line 38
    .line 39
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v9

    .line 45
    :cond_1
    iget-wide v12, v0, La/rwj0;->k:D

    .line 46
    .line 47
    iget-wide v14, v0, La/rwj0;->j:D

    .line 48
    .line 49
    iget-wide v7, v0, La/rwj0;->i:D

    .line 50
    .line 51
    iget-object v2, v0, La/rwj0;->l:La/ql5;

    .line 52
    .line 53
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    move-object/from16 v37, v1

    .line 57
    .line 58
    move-object/from16 v25, v3

    .line 59
    .line 60
    move-object/from16 v36, v4

    .line 61
    .line 62
    move-wide/from16 v27, v12

    .line 63
    .line 64
    move-wide/from16 v34, v14

    .line 65
    .line 66
    move-object/from16 v1, p1

    .line 67
    .line 68
    move-object v12, v0

    .line 69
    move-object v13, v2

    .line 70
    move-object v0, v5

    .line 71
    move-wide v14, v7

    .line 72
    goto/16 :goto_9

    .line 73
    .line 74
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    move-object/from16 v7, p1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iget-object v7, v1, La/yxj0;->N:La/m1e;

    .line 84
    .line 85
    invoke-interface {v7}, La/m1e;->b()La/gmq;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    iput-byte v10, v0, La/rwj0;->n:B

    .line 90
    .line 91
    invoke-static {v7, v0}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    if-ne v7, v5, :cond_4

    .line 96
    .line 97
    move-object v2, v5

    .line 98
    goto/16 :goto_a

    .line 99
    .line 100
    :cond_4
    :goto_0
    check-cast v7, Ljava/lang/Boolean;

    .line 101
    .line 102
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    if-nez v7, :cond_5

    .line 107
    .line 108
    iget-object v0, v1, La/d06;->p:La/ol60;

    .line 109
    .line 110
    new-instance v1, La/p0o;

    .line 111
    .line 112
    new-instance v12, La/xdk0;

    .line 113
    .line 114
    sget-object v13, La/pek0;->a:La/pek0;

    .line 115
    .line 116
    new-array v2, v11, [Ljava/lang/Object;

    .line 117
    .line 118
    const v4, 0x7f130e13

    .line 119
    .line 120
    .line 121
    invoke-virtual {v3, v4, v2}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v14

    .line 125
    const v2, 0x7f130e11

    .line 126
    .line 127
    .line 128
    new-array v4, v11, [Ljava/lang/Object;

    .line 129
    .line 130
    invoke-virtual {v3, v2, v4}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v15

    .line 134
    const/16 v18, 0x0

    .line 135
    .line 136
    const/16 v19, 0x78

    .line 137
    .line 138
    const/16 v16, 0x0

    .line 139
    .line 140
    const/16 v17, 0x0

    .line 141
    .line 142
    invoke-direct/range {v12 .. v19}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 143
    .line 144
    .line 145
    invoke-direct {v1, v12}, La/p0o;-><init>(La/xdk0;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 152
    .line 153
    return-object v0

    .line 154
    :cond_5
    iget-object v7, v1, La/d06;->o:La/ol60;

    .line 155
    .line 156
    sget-object v10, La/i520;->a:La/i520;

    .line 157
    .line 158
    invoke-virtual {v7, v10}, La/ol60;->f(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    iget-object v7, v1, La/yxj0;->X:La/p7m0;

    .line 162
    .line 163
    invoke-virtual {v7}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    check-cast v7, Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;

    .line 168
    .line 169
    iget-wide v14, v7, Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;->a:D

    .line 170
    .line 171
    invoke-virtual {v1}, La/yxj0;->D()La/ql5;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    if-nez v7, :cond_6

    .line 176
    .line 177
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 178
    .line 179
    return-object v0

    .line 180
    :cond_6
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v10

    .line 184
    check-cast v10, La/n0d;

    .line 185
    .line 186
    iget-wide v12, v10, La/n0d;->a:D

    .line 187
    .line 188
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    check-cast v2, La/n0d;

    .line 193
    .line 194
    iget-wide v8, v2, La/n0d;->b:D

    .line 195
    .line 196
    iget-object v2, v1, La/yxj0;->B:La/w5z;

    .line 197
    .line 198
    iget-wide v10, v7, La/ql5;->a:J

    .line 199
    .line 200
    move-wide/from16 v17, v10

    .line 201
    .line 202
    const/4 v11, 0x0

    .line 203
    iget-boolean v10, v4, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->k:Z

    .line 204
    .line 205
    iget-object v6, v1, La/yxj0;->R:La/r9u;

    .line 206
    .line 207
    sget-object v11, La/ygp;->Z:La/ygp;

    .line 208
    .line 209
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    iget-object v6, v6, La/r9u;->a:La/j1q0;

    .line 213
    .line 214
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    iget-object v6, v6, La/j1q0;->a:La/m1q0;

    .line 218
    .line 219
    invoke-virtual {v6, v11}, La/m1q0;->d(La/ygp;)Z

    .line 220
    .line 221
    .line 222
    move-result v6

    .line 223
    if-eqz v6, :cond_7

    .line 224
    .line 225
    move-object v11, v2

    .line 226
    move-object v6, v3

    .line 227
    iget-wide v2, v4, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->m:J

    .line 228
    .line 229
    :goto_1
    move-wide/from16 v21, v2

    .line 230
    .line 231
    goto :goto_2

    .line 232
    :cond_7
    move-object v11, v2

    .line 233
    move-object v6, v3

    .line 234
    iget-object v2, v1, La/yxj0;->C:La/dyt;

    .line 235
    .line 236
    invoke-virtual {v2}, La/dyt;->a()J

    .line 237
    .line 238
    .line 239
    move-result-wide v2

    .line 240
    goto :goto_1

    .line 241
    :goto_2
    iget-wide v2, v4, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->h:J

    .line 242
    .line 243
    move-object/from16 v23, v11

    .line 244
    .line 245
    iget v11, v4, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->a:I

    .line 246
    .line 247
    move-wide/from16 v24, v2

    .line 248
    .line 249
    new-instance v2, Ljava/lang/Double;

    .line 250
    .line 251
    invoke-direct {v2, v12, v13}, Ljava/lang/Double;-><init>(D)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    .line 255
    .line 256
    .line 257
    move-result-wide v26

    .line 258
    const-wide/16 v28, 0x0

    .line 259
    .line 260
    cmpg-double v3, v26, v28

    .line 261
    .line 262
    if-nez v3, :cond_8

    .line 263
    .line 264
    const/4 v2, 0x0

    .line 265
    :cond_8
    if-eqz v2, :cond_9

    .line 266
    .line 267
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 268
    .line 269
    .line 270
    move-result-wide v2

    .line 271
    :goto_3
    move-wide/from16 v26, v2

    .line 272
    .line 273
    goto :goto_4

    .line 274
    :cond_9
    iget-wide v2, v4, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->i:D

    .line 275
    .line 276
    goto :goto_3

    .line 277
    :goto_4
    new-instance v2, Ljava/lang/Double;

    .line 278
    .line 279
    invoke-direct {v2, v12, v13}, Ljava/lang/Double;-><init>(D)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    .line 283
    .line 284
    .line 285
    move-result-wide v30

    .line 286
    cmpg-double v3, v30, v28

    .line 287
    .line 288
    if-nez v3, :cond_a

    .line 289
    .line 290
    const/4 v2, 0x0

    .line 291
    :cond_a
    if-eqz v2, :cond_b

    .line 292
    .line 293
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 294
    .line 295
    .line 296
    move-result-wide v2

    .line 297
    :goto_5
    move-wide/from16 v30, v2

    .line 298
    .line 299
    goto :goto_6

    .line 300
    :cond_b
    iget-wide v2, v4, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->j:D

    .line 301
    .line 302
    goto :goto_5

    .line 303
    :goto_6
    new-instance v2, Ljava/lang/Double;

    .line 304
    .line 305
    invoke-direct {v2, v8, v9}, Ljava/lang/Double;-><init>(D)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    .line 309
    .line 310
    .line 311
    move-result-wide v32

    .line 312
    cmpg-double v3, v32, v28

    .line 313
    .line 314
    if-nez v3, :cond_c

    .line 315
    .line 316
    const/4 v2, 0x0

    .line 317
    :cond_c
    if-eqz v2, :cond_d

    .line 318
    .line 319
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 320
    .line 321
    .line 322
    move-result-wide v2

    .line 323
    :goto_7
    move-wide/from16 v28, v2

    .line 324
    .line 325
    goto :goto_8

    .line 326
    :cond_d
    iget-wide v2, v4, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->f:D

    .line 327
    .line 328
    goto :goto_7

    .line 329
    :goto_8
    iget-object v2, v1, La/yxj0;->I:La/vyt;

    .line 330
    .line 331
    invoke-virtual {v2}, La/vyt;->a()La/ezc;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    iget-object v3, v1, La/yxj0;->O:La/pru;

    .line 336
    .line 337
    invoke-virtual {v3}, La/pru;->a()La/sff0;

    .line 338
    .line 339
    .line 340
    move-result-object v3

    .line 341
    iget-object v3, v3, La/sff0;->I1:La/oxk0;

    .line 342
    .line 343
    iget-byte v3, v3, La/oxk0;->a:B

    .line 344
    .line 345
    iput-object v7, v0, La/rwj0;->l:La/ql5;

    .line 346
    .line 347
    iput-wide v14, v0, La/rwj0;->i:D

    .line 348
    .line 349
    iput-wide v12, v0, La/rwj0;->j:D

    .line 350
    .line 351
    iput-wide v8, v0, La/rwj0;->k:D

    .line 352
    .line 353
    move-object/from16 v32, v1

    .line 354
    .line 355
    const/4 v1, 0x2

    .line 356
    iput-byte v1, v0, La/rwj0;->n:B

    .line 357
    .line 358
    const-string v16, ""

    .line 359
    .line 360
    iget-boolean v1, v0, La/rwj0;->p:Z

    .line 361
    .line 362
    const/16 v33, 0x0

    .line 363
    .line 364
    const/16 v20, 0x0

    .line 365
    .line 366
    move-wide/from16 v34, v12

    .line 367
    .line 368
    move-wide/from16 v12, v21

    .line 369
    .line 370
    const/16 v22, 0x0

    .line 371
    .line 372
    move/from16 v19, v1

    .line 373
    .line 374
    move-object/from16 v21, v2

    .line 375
    .line 376
    move-object/from16 v36, v4

    .line 377
    .line 378
    move-object/from16 v1, v23

    .line 379
    .line 380
    move-object/from16 v37, v32

    .line 381
    .line 382
    move/from16 v23, v3

    .line 383
    .line 384
    move-wide/from16 v2, v24

    .line 385
    .line 386
    move-object/from16 v24, v0

    .line 387
    .line 388
    move-object v0, v5

    .line 389
    move-object/from16 v25, v6

    .line 390
    .line 391
    move-wide/from16 v4, v28

    .line 392
    .line 393
    move-wide/from16 v43, v26

    .line 394
    .line 395
    move-object/from16 v26, v7

    .line 396
    .line 397
    move-wide/from16 v27, v8

    .line 398
    .line 399
    move-wide/from16 v6, v43

    .line 400
    .line 401
    move-wide/from16 v8, v30

    .line 402
    .line 403
    invoke-virtual/range {v1 .. v24}, La/w5z;->R(JDDDZIJDLjava/lang/String;JZZLa/ezc;ZILa/zje;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    move-object/from16 v12, v24

    .line 408
    .line 409
    if-ne v1, v0, :cond_e

    .line 410
    .line 411
    move-object v2, v0

    .line 412
    goto/16 :goto_a

    .line 413
    .line 414
    :cond_e
    move-object/from16 v13, v26

    .line 415
    .line 416
    :goto_9
    check-cast v1, La/yh7;

    .line 417
    .line 418
    iget-wide v3, v13, La/ql5;->a:J

    .line 419
    .line 420
    iget-object v5, v13, La/ql5;->f:Ljava/lang/String;

    .line 421
    .line 422
    iget-wide v6, v1, La/yh7;->e:D

    .line 423
    .line 424
    iget-object v8, v1, La/yh7;->d:Ljava/lang/String;

    .line 425
    .line 426
    iget-wide v9, v1, La/yh7;->b:J

    .line 427
    .line 428
    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    sget-object v9, La/pn40;->a:La/pn40;

    .line 433
    .line 434
    iget-wide v9, v1, La/yh7;->e:D

    .line 435
    .line 436
    move-object/from16 p1, v2

    .line 437
    .line 438
    move-wide/from16 v16, v3

    .line 439
    .line 440
    iget-wide v2, v1, La/yh7;->c:D

    .line 441
    .line 442
    mul-double/2addr v9, v2

    .line 443
    iget-object v2, v13, La/ql5;->f:Ljava/lang/String;

    .line 444
    .line 445
    invoke-static {v2, v9, v10}, La/pn40;->p(Ljava/lang/String;D)Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v9

    .line 449
    const/4 v2, 0x0

    .line 450
    new-array v3, v2, [Ljava/lang/Object;

    .line 451
    .line 452
    const v4, 0x7f1309eb

    .line 453
    .line 454
    .line 455
    move-object/from16 v10, v25

    .line 456
    .line 457
    invoke-virtual {v10, v4, v3}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v10

    .line 461
    move-object/from16 v3, v37

    .line 462
    .line 463
    iget-object v4, v3, La/yxj0;->J:La/reu;

    .line 464
    .line 465
    invoke-virtual {v4}, La/reu;->c()La/nwo0;

    .line 466
    .line 467
    .line 468
    move-result-object v4

    .line 469
    iget-boolean v11, v4, La/nwo0;->a:Z

    .line 470
    .line 471
    move-object v4, v1

    .line 472
    const/4 v1, 0x0

    .line 473
    move-object/from16 v2, p1

    .line 474
    .line 475
    move-object/from16 v38, v0

    .line 476
    .line 477
    move-object v0, v3

    .line 478
    move-wide/from16 v41, v27

    .line 479
    .line 480
    move-wide/from16 v39, v34

    .line 481
    .line 482
    move-object/from16 v43, v13

    .line 483
    .line 484
    move-object v13, v4

    .line 485
    move-wide/from16 v3, v16

    .line 486
    .line 487
    move-object/from16 v16, v43

    .line 488
    .line 489
    invoke-virtual/range {v0 .. v11}, La/d06;->A(ZLjava/lang/String;JLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 490
    .line 491
    .line 492
    const/4 v10, 0x0

    .line 493
    iput-object v10, v12, La/rwj0;->l:La/ql5;

    .line 494
    .line 495
    iput-object v13, v12, La/rwj0;->m:La/yh7;

    .line 496
    .line 497
    iput-wide v14, v12, La/rwj0;->i:D

    .line 498
    .line 499
    move-wide/from16 v14, v39

    .line 500
    .line 501
    iput-wide v14, v12, La/rwj0;->j:D

    .line 502
    .line 503
    move-wide/from16 v1, v41

    .line 504
    .line 505
    iput-wide v1, v12, La/rwj0;->k:D

    .line 506
    .line 507
    const/4 v6, 0x3

    .line 508
    iput-byte v6, v12, La/rwj0;->n:B

    .line 509
    .line 510
    move-object/from16 v2, v16

    .line 511
    .line 512
    invoke-virtual {v0, v13, v2, v12}, La/d06;->z(La/yh7;La/ql5;La/zje;)Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v1

    .line 516
    move-object/from16 v2, v38

    .line 517
    .line 518
    if-ne v1, v2, :cond_f

    .line 519
    .line 520
    :goto_a
    return-object v2

    .line 521
    :cond_f
    :goto_b
    iget-wide v1, v13, La/yh7;->b:J

    .line 522
    .line 523
    move-object/from16 v3, v36

    .line 524
    .line 525
    iget-object v3, v3, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->e:La/fcq;

    .line 526
    .line 527
    invoke-virtual {v3}, La/fcq;->C()Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v3

    .line 531
    iget-object v4, v0, La/yxj0;->t:La/mii0;

    .line 532
    .line 533
    const-string v5, ""

    .line 534
    .line 535
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v6

    .line 539
    const/4 v11, 0x0

    .line 540
    invoke-virtual {v4, v3, v5, v6, v11}, La/mii0;->Q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 541
    .line 542
    .line 543
    iget-object v0, v0, La/yxj0;->L:La/zr1;

    .line 544
    .line 545
    invoke-virtual {v0, v3, v1, v2, v11}, La/zr1;->y(Ljava/lang/String;JZ)V

    .line 546
    .line 547
    .line 548
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 549
    .line 550
    return-object v0
.end method
