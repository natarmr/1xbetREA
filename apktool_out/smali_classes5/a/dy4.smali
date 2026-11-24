.class public final La/dy4;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:D

.field public j:D

.field public k:J

.field public l:La/m97;

.field public m:La/pa20;

.field public n:B

.field public final synthetic o:La/fy4;

.field public final synthetic p:Z


# direct methods
.method public constructor <init>(La/fy4;ZLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/dy4;->o:La/fy4;

    .line 2
    .line 3
    iput-boolean p2, p0, La/dy4;->p:Z

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
    new-instance p1, La/dy4;

    .line 2
    .line 3
    iget-object v0, p0, La/dy4;->o:La/fy4;

    .line 4
    .line 5
    iget-boolean p0, p0, La/dy4;->p:Z

    .line 6
    .line 7
    invoke-direct {p1, v0, p0, p2}, La/dy4;-><init>(La/fy4;ZLa/yje;)V

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
    invoke-virtual {p0, p1, p2}, La/dy4;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/dy4;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/dy4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-object v0, v5, La/dy4;->o:La/fy4;

    .line 4
    .line 5
    iget-object v1, v0, La/fy4;->c0:La/p7m0;

    .line 6
    .line 7
    iget-object v6, v0, La/fy4;->d0:La/ol60;

    .line 8
    .line 9
    iget-object v2, v0, La/fy4;->l:La/ctf0;

    .line 10
    .line 11
    sget-object v7, La/wne;->a:La/wne;

    .line 12
    .line 13
    iget-byte v3, v5, La/dy4;->n:B

    .line 14
    .line 15
    const/4 v4, 0x5

    .line 16
    const/4 v8, 0x4

    .line 17
    const/4 v9, 0x3

    .line 18
    const/4 v10, 0x2

    .line 19
    const/4 v11, 0x1

    .line 20
    const/4 v12, 0x0

    .line 21
    if-eqz v3, :cond_5

    .line 22
    .line 23
    if-eq v3, v11, :cond_4

    .line 24
    .line 25
    if-eq v3, v10, :cond_3

    .line 26
    .line 27
    if-eq v3, v9, :cond_2

    .line 28
    .line 29
    if-eq v3, v8, :cond_1

    .line 30
    .line 31
    if-ne v3, v4, :cond_0

    .line 32
    .line 33
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto/16 :goto_6

    .line 37
    .line 38
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-object v12

    .line 44
    :cond_1
    iget-object v0, v5, La/dy4;->m:La/pa20;

    .line 45
    .line 46
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_4

    .line 50
    .line 51
    :cond_2
    iget-wide v1, v5, La/dy4;->j:D

    .line 52
    .line 53
    iget-wide v9, v5, La/dy4;->k:J

    .line 54
    .line 55
    iget-wide v13, v5, La/dy4;->i:D

    .line 56
    .line 57
    iget-object v3, v5, La/dy4;->l:La/m97;

    .line 58
    .line 59
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    move-wide v8, v9

    .line 63
    move-object v10, v3

    .line 64
    move-wide v2, v1

    .line 65
    move-object/from16 v1, p1

    .line 66
    .line 67
    goto/16 :goto_2

    .line 68
    .line 69
    :cond_3
    iget-wide v2, v5, La/dy4;->j:D

    .line 70
    .line 71
    iget-wide v10, v5, La/dy4;->k:J

    .line 72
    .line 73
    iget-wide v13, v5, La/dy4;->i:D

    .line 74
    .line 75
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    move-wide v8, v10

    .line 79
    move-object/from16 v10, p1

    .line 80
    .line 81
    goto/16 :goto_1

    .line 82
    .line 83
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    move-object/from16 v3, p1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iget-object v3, v0, La/fy4;->r:La/m1e;

    .line 93
    .line 94
    invoke-interface {v3}, La/m1e;->b()La/gmq;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    iput-byte v11, v5, La/dy4;->n:B

    .line 99
    .line 100
    invoke-static {v3, v5}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    if-ne v3, v7, :cond_6

    .line 105
    .line 106
    goto/16 :goto_5

    .line 107
    .line 108
    :cond_6
    :goto_0
    check-cast v3, Ljava/lang/Boolean;

    .line 109
    .line 110
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-nez v3, :cond_7

    .line 115
    .line 116
    iget-object v0, v0, La/fy4;->a0:La/ol60;

    .line 117
    .line 118
    new-instance v1, La/fw4;

    .line 119
    .line 120
    new-instance v3, La/xdk0;

    .line 121
    .line 122
    sget-object v4, La/pek0;->a:La/pek0;

    .line 123
    .line 124
    const/4 v5, 0x0

    .line 125
    new-array v6, v5, [Ljava/lang/Object;

    .line 126
    .line 127
    const v7, 0x7f130e13

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, v7, v6}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    new-array v5, v5, [Ljava/lang/Object;

    .line 135
    .line 136
    const v7, 0x7f130e11

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2, v7, v5}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    const/4 v9, 0x0

    .line 144
    const/16 v10, 0x78

    .line 145
    .line 146
    const/4 v7, 0x0

    .line 147
    const/4 v8, 0x0

    .line 148
    move-object v5, v6

    .line 149
    move-object v6, v2

    .line 150
    invoke-direct/range {v3 .. v10}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 151
    .line 152
    .line 153
    invoke-direct {v1, v3}, La/fw4;-><init>(La/xdk0;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 160
    .line 161
    return-object v0

    .line 162
    :cond_7
    sget-object v2, La/vq00;->a:La/vq00;

    .line 163
    .line 164
    invoke-virtual {v6, v2}, La/ol60;->f(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    check-cast v2, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 172
    .line 173
    iget-wide v13, v2, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->a:D

    .line 174
    .line 175
    iget-object v2, v0, La/fy4;->Y:La/p7m0;

    .line 176
    .line 177
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    check-cast v2, Ljava/lang/Number;

    .line 182
    .line 183
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 184
    .line 185
    .line 186
    move-result-wide v2

    .line 187
    iget-object v11, v0, La/fy4;->b0:La/p7m0;

    .line 188
    .line 189
    invoke-virtual {v11}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v11

    .line 193
    check-cast v11, Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;

    .line 194
    .line 195
    iget-object v11, v11, Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;->a:Ljava/math/BigDecimal;

    .line 196
    .line 197
    invoke-virtual {v11}, Ljava/math/BigDecimal;->doubleValue()D

    .line 198
    .line 199
    .line 200
    move-result-wide v8

    .line 201
    iget-object v11, v0, La/fy4;->j:La/f3c;

    .line 202
    .line 203
    iput-wide v13, v5, La/dy4;->i:D

    .line 204
    .line 205
    iput-wide v2, v5, La/dy4;->k:J

    .line 206
    .line 207
    iput-wide v8, v5, La/dy4;->j:D

    .line 208
    .line 209
    iput-byte v10, v5, La/dy4;->n:B

    .line 210
    .line 211
    invoke-virtual {v11, v5}, La/f3c;->a(La/yje;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v10

    .line 215
    if-ne v10, v7, :cond_8

    .line 216
    .line 217
    goto/16 :goto_5

    .line 218
    .line 219
    :cond_8
    move-wide/from16 v31, v8

    .line 220
    .line 221
    move-wide v8, v2

    .line 222
    move-wide/from16 v2, v31

    .line 223
    .line 224
    :goto_1
    check-cast v10, La/m97;

    .line 225
    .line 226
    iput-object v10, v5, La/dy4;->l:La/m97;

    .line 227
    .line 228
    iput-wide v13, v5, La/dy4;->i:D

    .line 229
    .line 230
    iput-wide v8, v5, La/dy4;->k:J

    .line 231
    .line 232
    iput-wide v2, v5, La/dy4;->j:D

    .line 233
    .line 234
    const/4 v11, 0x3

    .line 235
    iput-byte v11, v5, La/dy4;->n:B

    .line 236
    .line 237
    iget-object v11, v0, La/fy4;->m:La/g320;

    .line 238
    .line 239
    iget-object v15, v0, La/fy4;->n:La/nhf0;

    .line 240
    .line 241
    new-instance v4, La/ex4;

    .line 242
    .line 243
    iget-object v12, v0, La/fy4;->k:La/zlt0;

    .line 244
    .line 245
    move-object/from16 v16, v1

    .line 246
    .line 247
    invoke-virtual {v12}, La/zlt0;->l()Z

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    invoke-virtual {v12}, La/zlt0;->m()Z

    .line 252
    .line 253
    .line 254
    move-result v12

    .line 255
    invoke-direct {v4, v2, v3, v1, v12}, La/ex4;-><init>(DZZ)V

    .line 256
    .line 257
    .line 258
    iget-object v1, v0, La/fy4;->A:La/ms2;

    .line 259
    .line 260
    invoke-static {v1}, La/phu0;->Y(La/ms2;)La/gwe;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    iget-byte v1, v1, La/gwe;->a:B

    .line 265
    .line 266
    invoke-static {v10, v1}, La/xia0;->d0(La/m97;I)La/ru6;

    .line 267
    .line 268
    .line 269
    move-result-object v25

    .line 270
    invoke-virtual/range {v16 .. v16}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    check-cast v1, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 275
    .line 276
    move-wide/from16 v29, v2

    .line 277
    .line 278
    iget-wide v1, v1, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->e:D

    .line 279
    .line 280
    iget-boolean v3, v5, La/dy4;->p:Z

    .line 281
    .line 282
    const/16 v22, 0x0

    .line 283
    .line 284
    const/16 v23, 0x0

    .line 285
    .line 286
    move-wide/from16 v26, v1

    .line 287
    .line 288
    move/from16 v21, v3

    .line 289
    .line 290
    move-object/from16 v24, v4

    .line 291
    .line 292
    move-wide/from16 v17, v8

    .line 293
    .line 294
    move-wide/from16 v19, v13

    .line 295
    .line 296
    move-object/from16 v16, v15

    .line 297
    .line 298
    invoke-virtual/range {v16 .. v27}, La/nhf0;->u(JDZZLjava/lang/String;La/ex4;La/ru6;D)La/ouj0;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    invoke-virtual {v11, v1, v5}, La/g320;->a(La/ouj0;La/zje;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    if-ne v1, v7, :cond_9

    .line 307
    .line 308
    goto/16 :goto_5

    .line 309
    .line 310
    :cond_9
    move-wide/from16 v8, v17

    .line 311
    .line 312
    move-wide/from16 v13, v19

    .line 313
    .line 314
    move-wide/from16 v2, v29

    .line 315
    .line 316
    :goto_2
    check-cast v1, La/pa20;

    .line 317
    .line 318
    if-eqz v1, :cond_e

    .line 319
    .line 320
    instance-of v4, v1, La/na20;

    .line 321
    .line 322
    if-eqz v4, :cond_c

    .line 323
    .line 324
    iget-wide v10, v10, La/m97;->i:J

    .line 325
    .line 326
    move-object v4, v1

    .line 327
    check-cast v4, La/na20;

    .line 328
    .line 329
    iget-object v4, v4, La/na20;->b:La/i2o;

    .line 330
    .line 331
    const/4 v6, 0x0

    .line 332
    iput-object v6, v5, La/dy4;->l:La/m97;

    .line 333
    .line 334
    iput-object v1, v5, La/dy4;->m:La/pa20;

    .line 335
    .line 336
    iput-wide v13, v5, La/dy4;->i:D

    .line 337
    .line 338
    iput-wide v8, v5, La/dy4;->k:J

    .line 339
    .line 340
    iput-wide v2, v5, La/dy4;->j:D

    .line 341
    .line 342
    const/4 v15, 0x4

    .line 343
    iput-byte v15, v5, La/dy4;->n:B

    .line 344
    .line 345
    iget-object v2, v0, La/fy4;->C:La/x20;

    .line 346
    .line 347
    invoke-virtual {v4}, La/i2o;->getErrorCode()I

    .line 348
    .line 349
    .line 350
    move-result v3

    .line 351
    invoke-virtual {v2, v3}, La/x20;->p(I)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v4}, La/i2o;->getErrorCode()I

    .line 355
    .line 356
    .line 357
    move-result v2

    .line 358
    invoke-virtual {v0, v2, v10, v11}, La/fy4;->C(IJ)Lkotlin/Unit;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    if-ne v0, v7, :cond_a

    .line 363
    .line 364
    goto :goto_3

    .line 365
    :cond_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 366
    .line 367
    :goto_3
    if-ne v0, v7, :cond_b

    .line 368
    .line 369
    goto :goto_5

    .line 370
    :cond_b
    move-object v0, v1

    .line 371
    :goto_4
    new-instance v1, La/zhi0;

    .line 372
    .line 373
    check-cast v0, La/na20;

    .line 374
    .line 375
    iget-object v2, v0, La/na20;->c:Ljava/lang/String;

    .line 376
    .line 377
    iget-object v0, v0, La/na20;->b:La/i2o;

    .line 378
    .line 379
    const/16 v3, 0xc

    .line 380
    .line 381
    const/4 v4, 0x0

    .line 382
    invoke-direct {v1, v2, v0, v4, v3}, La/zhi0;-><init>(Ljava/lang/String;La/kuw;Ljava/lang/Integer;I)V

    .line 383
    .line 384
    .line 385
    throw v1

    .line 386
    :cond_c
    const/4 v4, 0x0

    .line 387
    instance-of v11, v1, La/oa20;

    .line 388
    .line 389
    if-eqz v11, :cond_e

    .line 390
    .line 391
    check-cast v1, La/oa20;

    .line 392
    .line 393
    iput-object v4, v5, La/dy4;->l:La/m97;

    .line 394
    .line 395
    iput-object v4, v5, La/dy4;->m:La/pa20;

    .line 396
    .line 397
    iput-wide v13, v5, La/dy4;->i:D

    .line 398
    .line 399
    iput-wide v8, v5, La/dy4;->k:J

    .line 400
    .line 401
    iput-wide v2, v5, La/dy4;->j:D

    .line 402
    .line 403
    const/4 v2, 0x5

    .line 404
    iput-byte v2, v5, La/dy4;->n:B

    .line 405
    .line 406
    move-object v4, v1

    .line 407
    move-wide v1, v8

    .line 408
    move-object v3, v10

    .line 409
    invoke-virtual/range {v0 .. v5}, La/fy4;->A(JLa/m97;La/oa20;La/zje;)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    if-ne v0, v7, :cond_d

    .line 414
    .line 415
    :goto_5
    return-object v7

    .line 416
    :cond_d
    :goto_6
    sget-object v0, La/uq00;->a:La/uq00;

    .line 417
    .line 418
    invoke-virtual {v6, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 422
    .line 423
    return-object v0

    .line 424
    :cond_e
    invoke-static {}, La/t9f;->b()V

    .line 425
    .line 426
    .line 427
    const/16 v28, 0x0

    .line 428
    .line 429
    return-object v28
.end method
