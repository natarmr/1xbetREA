.class public final La/txj0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:D

.field public j:La/m97;

.field public k:J

.field public l:Z

.field public m:B

.field public final synthetic n:La/xxj0;

.field public final synthetic o:Z

.field public final synthetic p:Z

.field public final synthetic q:Z

.field public final synthetic r:Ljava/lang/String;


# direct methods
.method public constructor <init>(La/xxj0;ZZZLjava/lang/String;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/txj0;->n:La/xxj0;

    .line 2
    .line 3
    iput-boolean p2, p0, La/txj0;->o:Z

    .line 4
    .line 5
    iput-boolean p3, p0, La/txj0;->p:Z

    .line 6
    .line 7
    iput-boolean p4, p0, La/txj0;->q:Z

    .line 8
    .line 9
    iput-object p5, p0, La/txj0;->r:Ljava/lang/String;

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
    new-instance v0, La/txj0;

    .line 2
    .line 3
    iget-boolean v4, p0, La/txj0;->q:Z

    .line 4
    .line 5
    iget-object v5, p0, La/txj0;->r:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v1, p0, La/txj0;->n:La/xxj0;

    .line 8
    .line 9
    iget-boolean v2, p0, La/txj0;->o:Z

    .line 10
    .line 11
    iget-boolean v3, p0, La/txj0;->p:Z

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, La/txj0;-><init>(La/xxj0;ZZZLjava/lang/String;La/yje;)V

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
    invoke-virtual {p0, p1, p2}, La/txj0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/txj0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/txj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-object v6, v5, La/txj0;->n:La/xxj0;

    .line 4
    .line 5
    iget-object v0, v6, La/xxj0;->o:La/pru;

    .line 6
    .line 7
    iget-object v1, v6, La/xxj0;->C0:La/p7m0;

    .line 8
    .line 9
    iget-object v8, v6, La/xxj0;->u0:La/ol60;

    .line 10
    .line 11
    sget-object v9, La/wne;->a:La/wne;

    .line 12
    .line 13
    iget-byte v2, v5, La/txj0;->m:B

    .line 14
    .line 15
    sget-object v10, La/uq00;->a:La/uq00;

    .line 16
    .line 17
    const/4 v7, 0x5

    .line 18
    const/4 v3, 0x4

    .line 19
    const/4 v4, 0x3

    .line 20
    const/4 v11, 0x2

    .line 21
    const/4 v12, 0x1

    .line 22
    const/4 v13, 0x0

    .line 23
    if-eqz v2, :cond_6

    .line 24
    .line 25
    if-eq v2, v12, :cond_5

    .line 26
    .line 27
    if-eq v2, v11, :cond_4

    .line 28
    .line 29
    if-eq v2, v4, :cond_2

    .line 30
    .line 31
    if-eq v2, v3, :cond_1

    .line 32
    .line 33
    if-ne v2, v7, :cond_0

    .line 34
    .line 35
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    move-object v0, v6

    .line 39
    goto/16 :goto_7

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
    return-object v13

    .line 47
    :cond_1
    iget-boolean v0, v5, La/txj0;->l:Z

    .line 48
    .line 49
    iget-wide v1, v5, La/txj0;->k:J

    .line 50
    .line 51
    iget-wide v3, v5, La/txj0;->i:D

    .line 52
    .line 53
    iget-object v11, v5, La/txj0;->j:La/m97;

    .line 54
    .line 55
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    move-object v7, v11

    .line 59
    move v11, v0

    .line 60
    move-object/from16 v0, p1

    .line 61
    .line 62
    goto/16 :goto_5

    .line 63
    .line 64
    :cond_2
    iget-boolean v2, v5, La/txj0;->l:Z

    .line 65
    .line 66
    iget-wide v11, v5, La/txj0;->k:J

    .line 67
    .line 68
    iget-wide v14, v5, La/txj0;->i:D

    .line 69
    .line 70
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    move-object/from16 v3, p1

    .line 74
    .line 75
    :cond_3
    move-wide v12, v11

    .line 76
    move v11, v2

    .line 77
    goto/16 :goto_4

    .line 78
    .line 79
    :cond_4
    iget-wide v14, v5, La/txj0;->i:D

    .line 80
    .line 81
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    move-object/from16 v2, p1

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    move-object/from16 v2, p1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    iget-object v2, v6, La/xxj0;->t:La/m1e;

    .line 97
    .line 98
    invoke-interface {v2}, La/m1e;->b()La/gmq;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    iput-byte v12, v5, La/txj0;->m:B

    .line 103
    .line 104
    invoke-static {v2, v5}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    if-ne v2, v9, :cond_7

    .line 109
    .line 110
    goto/16 :goto_6

    .line 111
    .line 112
    :cond_7
    :goto_0
    check-cast v2, Ljava/lang/Boolean;

    .line 113
    .line 114
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-nez v2, :cond_8

    .line 119
    .line 120
    invoke-virtual {v6}, La/xxj0;->R()V

    .line 121
    .line 122
    .line 123
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    return-object v0

    .line 126
    :cond_8
    sget-object v2, La/vq00;->a:La/vq00;

    .line 127
    .line 128
    invoke-virtual {v8, v2}, La/ol60;->f(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    check-cast v2, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 136
    .line 137
    iget-wide v14, v2, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->a:D

    .line 138
    .line 139
    iget-boolean v2, v2, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->q:Z

    .line 140
    .line 141
    if-eqz v2, :cond_9

    .line 142
    .line 143
    const-wide/high16 v16, 0x4000000000000000L    # 2.0

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_9
    const-wide/high16 v16, 0x3ff0000000000000L    # 1.0

    .line 147
    .line 148
    :goto_1
    mul-double v14, v14, v16

    .line 149
    .line 150
    iget-object v2, v6, La/xxj0;->f:La/khf0;

    .line 151
    .line 152
    sget-object v12, La/bm5;->b:La/bm5;

    .line 153
    .line 154
    iput-wide v14, v5, La/txj0;->i:D

    .line 155
    .line 156
    iput-byte v11, v5, La/txj0;->m:B

    .line 157
    .line 158
    invoke-static {v2, v12, v5}, La/khf0;->G(La/khf0;La/bm5;La/yje;)Ljava/io/Serializable;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    if-ne v2, v9, :cond_a

    .line 163
    .line 164
    goto/16 :goto_6

    .line 165
    .line 166
    :cond_a
    :goto_2
    check-cast v2, La/ql5;

    .line 167
    .line 168
    iget-wide v11, v2, La/ql5;->a:J

    .line 169
    .line 170
    iget-wide v3, v2, La/ql5;->b:D

    .line 171
    .line 172
    iget-object v2, v6, La/xxj0;->v0:La/p7m0;

    .line 173
    .line 174
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    check-cast v2, La/a40;

    .line 179
    .line 180
    move-wide/from16 v18, v14

    .line 181
    .line 182
    iget-wide v13, v2, La/a40;->a:D

    .line 183
    .line 184
    cmpl-double v2, v18, v3

    .line 185
    .line 186
    if-lez v2, :cond_b

    .line 187
    .line 188
    const-wide/16 v20, 0x0

    .line 189
    .line 190
    cmpl-double v2, v13, v20

    .line 191
    .line 192
    if-lez v2, :cond_b

    .line 193
    .line 194
    add-double/2addr v13, v3

    .line 195
    cmpl-double v2, v13, v18

    .line 196
    .line 197
    if-ltz v2, :cond_b

    .line 198
    .line 199
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    iget-object v2, v2, La/sff0;->a:La/gx7;

    .line 204
    .line 205
    iget-object v2, v2, La/gx7;->a:La/gm7;

    .line 206
    .line 207
    iget-boolean v2, v2, La/gm7;->b:Z

    .line 208
    .line 209
    if-eqz v2, :cond_b

    .line 210
    .line 211
    const/4 v2, 0x1

    .line 212
    goto :goto_3

    .line 213
    :cond_b
    const/4 v2, 0x0

    .line 214
    :goto_3
    if-eqz v2, :cond_c

    .line 215
    .line 216
    iget-boolean v3, v5, La/txj0;->o:Z

    .line 217
    .line 218
    if-nez v3, :cond_c

    .line 219
    .line 220
    invoke-virtual {v8, v10}, La/ol60;->f(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    iget-object v0, v6, La/xxj0;->p0:La/ol60;

    .line 224
    .line 225
    sget-object v1, La/nvj0;->a:La/nvj0;

    .line 226
    .line 227
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 231
    .line 232
    return-object v0

    .line 233
    :cond_c
    iget-object v3, v6, La/xxj0;->C:La/f3c;

    .line 234
    .line 235
    move-wide/from16 v14, v18

    .line 236
    .line 237
    iput-wide v14, v5, La/txj0;->i:D

    .line 238
    .line 239
    iput-wide v11, v5, La/txj0;->k:J

    .line 240
    .line 241
    iput-boolean v2, v5, La/txj0;->l:Z

    .line 242
    .line 243
    const/4 v4, 0x3

    .line 244
    iput-byte v4, v5, La/txj0;->m:B

    .line 245
    .line 246
    invoke-virtual {v3, v5}, La/f3c;->a(La/yje;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    if-ne v3, v9, :cond_3

    .line 251
    .line 252
    goto/16 :goto_6

    .line 253
    .line 254
    :goto_4
    move-object v2, v3

    .line 255
    check-cast v2, La/m97;

    .line 256
    .line 257
    iput-object v2, v5, La/txj0;->j:La/m97;

    .line 258
    .line 259
    iput-wide v14, v5, La/txj0;->i:D

    .line 260
    .line 261
    iput-wide v12, v5, La/txj0;->k:J

    .line 262
    .line 263
    iput-boolean v11, v5, La/txj0;->l:Z

    .line 264
    .line 265
    const/4 v3, 0x4

    .line 266
    iput-byte v3, v5, La/txj0;->m:B

    .line 267
    .line 268
    move-object v3, v0

    .line 269
    iget-object v0, v6, La/xxj0;->n:La/g320;

    .line 270
    .line 271
    iget-object v4, v6, La/xxj0;->q:La/nhf0;

    .line 272
    .line 273
    iget-object v7, v6, La/xxj0;->O:La/ms2;

    .line 274
    .line 275
    invoke-static {v7}, La/phu0;->Y(La/ms2;)La/gwe;

    .line 276
    .line 277
    .line 278
    move-result-object v7

    .line 279
    iget-byte v7, v7, La/gwe;->a:B

    .line 280
    .line 281
    invoke-static {v2, v7}, La/xia0;->d0(La/m97;I)La/ru6;

    .line 282
    .line 283
    .line 284
    move-result-object v27

    .line 285
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    check-cast v1, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 290
    .line 291
    move-object v7, v0

    .line 292
    iget-wide v0, v1, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->e:D

    .line 293
    .line 294
    move-wide/from16 v28, v0

    .line 295
    .line 296
    iget-boolean v0, v5, La/txj0;->p:Z

    .line 297
    .line 298
    iget-boolean v1, v5, La/txj0;->o:Z

    .line 299
    .line 300
    const/16 v25, 0x0

    .line 301
    .line 302
    const/16 v26, 0x0

    .line 303
    .line 304
    move/from16 v23, v0

    .line 305
    .line 306
    move/from16 v24, v1

    .line 307
    .line 308
    move-object/from16 v18, v4

    .line 309
    .line 310
    move-wide/from16 v19, v12

    .line 311
    .line 312
    move-wide/from16 v21, v14

    .line 313
    .line 314
    invoke-virtual/range {v18 .. v29}, La/nhf0;->u(JDZZLjava/lang/String;La/ex4;La/ru6;D)La/ouj0;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    invoke-virtual {v3}, La/pru;->a()La/sff0;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    iget-object v0, v0, La/sff0;->I1:La/oxk0;

    .line 323
    .line 324
    iget-byte v4, v0, La/oxk0;->a:B

    .line 325
    .line 326
    move-object v0, v2

    .line 327
    const-wide/16 v2, 0x0

    .line 328
    .line 329
    move-object/from16 v30, v7

    .line 330
    .line 331
    move-object v7, v0

    .line 332
    move-object/from16 v0, v30

    .line 333
    .line 334
    invoke-virtual/range {v0 .. v5}, La/g320;->b(La/ouj0;JILa/yje;)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    if-ne v0, v9, :cond_d

    .line 339
    .line 340
    goto :goto_6

    .line 341
    :cond_d
    move-wide/from16 v1, v19

    .line 342
    .line 343
    move-wide/from16 v3, v21

    .line 344
    .line 345
    :goto_5
    check-cast v0, La/pa20;

    .line 346
    .line 347
    const/4 v12, 0x0

    .line 348
    iput-object v12, v5, La/txj0;->j:La/m97;

    .line 349
    .line 350
    iput-wide v3, v5, La/txj0;->i:D

    .line 351
    .line 352
    iput-wide v1, v5, La/txj0;->k:J

    .line 353
    .line 354
    iput-boolean v11, v5, La/txj0;->l:Z

    .line 355
    .line 356
    const/4 v3, 0x5

    .line 357
    iput-byte v3, v5, La/txj0;->m:B

    .line 358
    .line 359
    move-wide/from16 v19, v1

    .line 360
    .line 361
    iget-boolean v2, v5, La/txj0;->q:Z

    .line 362
    .line 363
    iget-object v4, v5, La/txj0;->r:Ljava/lang/String;

    .line 364
    .line 365
    move-object v1, v0

    .line 366
    move-object v0, v6

    .line 367
    move-object v3, v7

    .line 368
    move-object v7, v5

    .line 369
    move-wide/from16 v5, v19

    .line 370
    .line 371
    invoke-virtual/range {v0 .. v7}, La/xxj0;->D(La/pa20;ZLa/m97;Ljava/lang/String;JLa/zje;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    if-ne v1, v9, :cond_e

    .line 376
    .line 377
    :goto_6
    return-object v9

    .line 378
    :cond_e
    :goto_7
    iget-object v0, v0, La/xxj0;->w0:La/p7m0;

    .line 379
    .line 380
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 381
    .line 382
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    .line 384
    .line 385
    const/4 v12, 0x0

    .line 386
    invoke-virtual {v0, v12, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    invoke-virtual {v8, v10}, La/ol60;->f(Ljava/lang/Object;)V

    .line 390
    .line 391
    .line 392
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 393
    .line 394
    return-object v0
.end method
