.class public final La/sxj0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:Ljava/lang/Object;

.field public j:I

.field public k:I

.field public l:D

.field public m:B

.field public synthetic n:La/cit0;

.field public synthetic o:Z

.field public final synthetic p:La/xxj0;


# direct methods
.method public constructor <init>(La/xxj0;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/sxj0;->p:La/xxj0;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, La/cit0;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    check-cast p3, La/yje;

    .line 10
    .line 11
    new-instance v0, La/sxj0;

    .line 12
    .line 13
    iget-object p0, p0, La/sxj0;->p:La/xxj0;

    .line 14
    .line 15
    invoke-direct {v0, p0, p3}, La/sxj0;-><init>(La/xxj0;La/yje;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, v0, La/sxj0;->n:La/cit0;

    .line 19
    .line 20
    iput-boolean p2, v0, La/sxj0;->o:Z

    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    invoke-virtual {v0, p0}, La/sxj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 40

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/sxj0;->p:La/xxj0;

    .line 4
    .line 5
    iget-object v2, v1, La/xxj0;->C0:La/p7m0;

    .line 6
    .line 7
    iget-object v3, v1, La/xxj0;->f:La/khf0;

    .line 8
    .line 9
    iget-object v4, v0, La/sxj0;->n:La/cit0;

    .line 10
    .line 11
    iget-boolean v5, v0, La/sxj0;->o:Z

    .line 12
    .line 13
    sget-object v6, La/wne;->a:La/wne;

    .line 14
    .line 15
    iget-byte v7, v0, La/sxj0;->m:B

    .line 16
    .line 17
    const/4 v10, 0x0

    .line 18
    const/4 v12, 0x1

    .line 19
    packed-switch v7, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object v10

    .line 28
    :pswitch_0
    iget v3, v0, La/sxj0;->k:I

    .line 29
    .line 30
    iget-wide v6, v0, La/sxj0;->l:D

    .line 31
    .line 32
    iget v0, v0, La/sxj0;->j:I

    .line 33
    .line 34
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    move v8, v0

    .line 38
    move-wide/from16 v20, v6

    .line 39
    .line 40
    move v9, v12

    .line 41
    const-wide/16 v15, 0x0

    .line 42
    .line 43
    move-object/from16 v0, p1

    .line 44
    .line 45
    goto/16 :goto_9

    .line 46
    .line 47
    :pswitch_1
    iget v3, v0, La/sxj0;->k:I

    .line 48
    .line 49
    iget-wide v13, v0, La/sxj0;->l:D

    .line 50
    .line 51
    iget v7, v0, La/sxj0;->j:I

    .line 52
    .line 53
    iget-object v15, v0, La/sxj0;->i:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v15, La/xxj0;

    .line 56
    .line 57
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    move-object/from16 v11, p1

    .line 61
    .line 62
    move v8, v7

    .line 63
    move v9, v12

    .line 64
    move-object v12, v15

    .line 65
    const-wide/16 v15, 0x0

    .line 66
    .line 67
    goto/16 :goto_7

    .line 68
    .line 69
    :pswitch_2
    iget v3, v0, La/sxj0;->j:I

    .line 70
    .line 71
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    move v8, v3

    .line 75
    const-wide/16 v15, 0x0

    .line 76
    .line 77
    move-object/from16 v3, p1

    .line 78
    .line 79
    goto/16 :goto_4

    .line 80
    .line 81
    :pswitch_3
    iget v3, v0, La/sxj0;->j:I

    .line 82
    .line 83
    iget-object v7, v0, La/sxj0;->i:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v7, La/m0u;

    .line 86
    .line 87
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    move v8, v3

    .line 91
    const-wide/16 v15, 0x0

    .line 92
    .line 93
    move-object/from16 v3, p1

    .line 94
    .line 95
    goto/16 :goto_3

    .line 96
    .line 97
    :pswitch_4
    iget v3, v0, La/sxj0;->j:I

    .line 98
    .line 99
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    move v8, v3

    .line 103
    const-wide/16 v15, 0x0

    .line 104
    .line 105
    move-object/from16 v3, p1

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :pswitch_5
    iget v3, v0, La/sxj0;->j:I

    .line 109
    .line 110
    iget-object v7, v0, La/sxj0;->i:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v7, La/q4u;

    .line 113
    .line 114
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    move v8, v3

    .line 118
    const-wide/16 v15, 0x0

    .line 119
    .line 120
    move-object/from16 v3, p1

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :pswitch_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    if-eqz v5, :cond_10

    .line 127
    .line 128
    iget v7, v4, La/cit0;->q:I

    .line 129
    .line 130
    iget-wide v13, v4, La/cit0;->B:D

    .line 131
    .line 132
    const-wide/16 v15, 0x0

    .line 133
    .line 134
    int-to-long v8, v7

    .line 135
    iget-object v7, v1, La/xxj0;->s0:La/p7m0;

    .line 136
    .line 137
    invoke-virtual {v7}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    check-cast v7, Ljava/lang/Number;

    .line 142
    .line 143
    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    .line 144
    .line 145
    .line 146
    move-result-wide v17

    .line 147
    cmp-long v7, v8, v17

    .line 148
    .line 149
    if-nez v7, :cond_10

    .line 150
    .line 151
    cmpg-double v7, v13, v15

    .line 152
    .line 153
    if-nez v7, :cond_0

    .line 154
    .line 155
    move v7, v12

    .line 156
    goto :goto_0

    .line 157
    :cond_0
    const/4 v7, 0x0

    .line 158
    :goto_0
    xor-int/lit8 v8, v7, 0x1

    .line 159
    .line 160
    iget-object v9, v1, La/xxj0;->j:La/pyu;

    .line 161
    .line 162
    invoke-virtual {v9}, La/pyu;->k()Z

    .line 163
    .line 164
    .line 165
    move-result v9

    .line 166
    if-eqz v9, :cond_3

    .line 167
    .line 168
    iget-object v7, v1, La/xxj0;->k:La/q4u;

    .line 169
    .line 170
    sget-object v9, La/bm5;->b:La/bm5;

    .line 171
    .line 172
    iput-object v4, v0, La/sxj0;->n:La/cit0;

    .line 173
    .line 174
    iput-object v7, v0, La/sxj0;->i:Ljava/lang/Object;

    .line 175
    .line 176
    iput-boolean v5, v0, La/sxj0;->o:Z

    .line 177
    .line 178
    iput v8, v0, La/sxj0;->j:I

    .line 179
    .line 180
    iput-byte v12, v0, La/sxj0;->m:B

    .line 181
    .line 182
    invoke-static {v3, v9, v0}, La/khf0;->G(La/khf0;La/bm5;La/yje;)Ljava/io/Serializable;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    if-ne v3, v6, :cond_1

    .line 187
    .line 188
    goto/16 :goto_8

    .line 189
    .line 190
    :cond_1
    :goto_1
    check-cast v3, La/ql5;

    .line 191
    .line 192
    iput-object v4, v0, La/sxj0;->n:La/cit0;

    .line 193
    .line 194
    iput-object v10, v0, La/sxj0;->i:Ljava/lang/Object;

    .line 195
    .line 196
    iput-boolean v5, v0, La/sxj0;->o:Z

    .line 197
    .line 198
    iput v8, v0, La/sxj0;->j:I

    .line 199
    .line 200
    const/4 v9, 0x2

    .line 201
    iput-byte v9, v0, La/sxj0;->m:B

    .line 202
    .line 203
    iget-object v7, v7, La/q4u;->a:La/etj;

    .line 204
    .line 205
    invoke-virtual {v7, v3, v0}, La/etj;->a(La/ql5;La/yje;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    if-ne v3, v6, :cond_2

    .line 210
    .line 211
    goto/16 :goto_8

    .line 212
    .line 213
    :cond_2
    :goto_2
    check-cast v3, La/c3j0;

    .line 214
    .line 215
    iget-wide v13, v3, La/c3j0;->b:D

    .line 216
    .line 217
    goto :goto_5

    .line 218
    :cond_3
    if-nez v7, :cond_4

    .line 219
    .line 220
    goto :goto_5

    .line 221
    :cond_4
    iget-object v7, v1, La/xxj0;->a0:La/m0u;

    .line 222
    .line 223
    sget-object v9, La/bm5;->b:La/bm5;

    .line 224
    .line 225
    iput-object v4, v0, La/sxj0;->n:La/cit0;

    .line 226
    .line 227
    iput-object v7, v0, La/sxj0;->i:Ljava/lang/Object;

    .line 228
    .line 229
    iput-boolean v5, v0, La/sxj0;->o:Z

    .line 230
    .line 231
    iput v8, v0, La/sxj0;->j:I

    .line 232
    .line 233
    const/4 v13, 0x3

    .line 234
    iput-byte v13, v0, La/sxj0;->m:B

    .line 235
    .line 236
    invoke-static {v3, v9, v0}, La/khf0;->G(La/khf0;La/bm5;La/yje;)Ljava/io/Serializable;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    if-ne v3, v6, :cond_5

    .line 241
    .line 242
    goto :goto_8

    .line 243
    :cond_5
    :goto_3
    check-cast v3, La/ql5;

    .line 244
    .line 245
    iget-wide v13, v3, La/ql5;->e:J

    .line 246
    .line 247
    iput-object v4, v0, La/sxj0;->n:La/cit0;

    .line 248
    .line 249
    iput-object v10, v0, La/sxj0;->i:Ljava/lang/Object;

    .line 250
    .line 251
    iput-boolean v5, v0, La/sxj0;->o:Z

    .line 252
    .line 253
    iput v8, v0, La/sxj0;->j:I

    .line 254
    .line 255
    const/4 v3, 0x4

    .line 256
    iput-byte v3, v0, La/sxj0;->m:B

    .line 257
    .line 258
    iget-object v3, v7, La/m0u;->a:La/xr;

    .line 259
    .line 260
    invoke-virtual {v3, v13, v14, v0}, La/xr;->c(JLa/yje;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    if-ne v3, v6, :cond_6

    .line 265
    .line 266
    goto :goto_8

    .line 267
    :cond_6
    :goto_4
    check-cast v3, La/xuf;

    .line 268
    .line 269
    iget-wide v13, v3, La/xuf;->i:D

    .line 270
    .line 271
    :goto_5
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v3

    .line 275
    check-cast v3, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 276
    .line 277
    move v9, v12

    .line 278
    iget-wide v11, v3, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->b:D

    .line 279
    .line 280
    cmpg-double v3, v11, v13

    .line 281
    .line 282
    if-nez v3, :cond_7

    .line 283
    .line 284
    move v3, v9

    .line 285
    goto :goto_6

    .line 286
    :cond_7
    const/4 v3, 0x0

    .line 287
    :goto_6
    xor-int/2addr v3, v9

    .line 288
    iget-object v11, v1, La/xxj0;->C:La/f3c;

    .line 289
    .line 290
    iput-object v4, v0, La/sxj0;->n:La/cit0;

    .line 291
    .line 292
    iput-object v1, v0, La/sxj0;->i:Ljava/lang/Object;

    .line 293
    .line 294
    iput-boolean v5, v0, La/sxj0;->o:Z

    .line 295
    .line 296
    iput v8, v0, La/sxj0;->j:I

    .line 297
    .line 298
    iput-wide v13, v0, La/sxj0;->l:D

    .line 299
    .line 300
    iput v3, v0, La/sxj0;->k:I

    .line 301
    .line 302
    const/4 v12, 0x5

    .line 303
    iput-byte v12, v0, La/sxj0;->m:B

    .line 304
    .line 305
    invoke-virtual {v11, v0}, La/f3c;->a(La/yje;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v11

    .line 309
    if-ne v11, v6, :cond_8

    .line 310
    .line 311
    goto :goto_8

    .line 312
    :cond_8
    move-object v12, v1

    .line 313
    :goto_7
    check-cast v11, La/m97;

    .line 314
    .line 315
    iput-object v4, v0, La/sxj0;->n:La/cit0;

    .line 316
    .line 317
    iput-object v10, v0, La/sxj0;->i:Ljava/lang/Object;

    .line 318
    .line 319
    iput-boolean v5, v0, La/sxj0;->o:Z

    .line 320
    .line 321
    iput v8, v0, La/sxj0;->j:I

    .line 322
    .line 323
    iput-wide v13, v0, La/sxj0;->l:D

    .line 324
    .line 325
    iput v3, v0, La/sxj0;->k:I

    .line 326
    .line 327
    const/4 v7, 0x6

    .line 328
    iput-byte v7, v0, La/sxj0;->m:B

    .line 329
    .line 330
    invoke-virtual {v12, v11, v0}, La/xxj0;->H(La/m97;La/zje;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    if-ne v0, v6, :cond_9

    .line 335
    .line 336
    :goto_8
    return-object v6

    .line 337
    :cond_9
    move-wide/from16 v20, v13

    .line 338
    .line 339
    :goto_9
    check-cast v0, Ljava/lang/Boolean;

    .line 340
    .line 341
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 342
    .line 343
    .line 344
    move-result v37

    .line 345
    :goto_a
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    move-object v6, v0

    .line 350
    check-cast v6, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 351
    .line 352
    if-eqz v3, :cond_a

    .line 353
    .line 354
    move-wide/from16 v18, v20

    .line 355
    .line 356
    goto :goto_b

    .line 357
    :cond_a
    iget-wide v11, v6, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->a:D

    .line 358
    .line 359
    move-wide/from16 v18, v11

    .line 360
    .line 361
    :goto_b
    iget-wide v11, v4, La/cit0;->C:D

    .line 362
    .line 363
    iget-wide v13, v4, La/cit0;->F:D

    .line 364
    .line 365
    move v7, v9

    .line 366
    iget-wide v9, v4, La/cit0;->E:D

    .line 367
    .line 368
    move/from16 p0, v7

    .line 369
    .line 370
    iget-boolean v7, v4, La/cit0;->M:Z

    .line 371
    .line 372
    if-eqz v7, :cond_b

    .line 373
    .line 374
    const-wide v22, 0x42a2309ce53ffffbL    # 9.99999999999999E12

    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    move-wide/from16 v26, v22

    .line 380
    .line 381
    goto :goto_c

    .line 382
    :cond_b
    move-wide/from16 v26, v13

    .line 383
    .line 384
    :goto_c
    cmpg-double v17, v11, v15

    .line 385
    .line 386
    if-nez v17, :cond_c

    .line 387
    .line 388
    move/from16 v17, p0

    .line 389
    .line 390
    goto :goto_d

    .line 391
    :cond_c
    const/16 v17, 0x0

    .line 392
    .line 393
    :goto_d
    xor-int/lit8 v33, v17, 0x1

    .line 394
    .line 395
    iget-object v15, v6, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->i:Lorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;

    .line 396
    .line 397
    move/from16 v16, v3

    .line 398
    .line 399
    move-object/from16 v39, v4

    .line 400
    .line 401
    const/4 v3, 0x0

    .line 402
    move/from16 v4, p0

    .line 403
    .line 404
    invoke-static {v15, v3, v13, v14, v4}, Lorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;->a(Lorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;ZDI)Lorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;

    .line 405
    .line 406
    .line 407
    move-result-object v31

    .line 408
    if-eqz v16, :cond_d

    .line 409
    .line 410
    const/16 v32, 0x0

    .line 411
    .line 412
    goto :goto_e

    .line 413
    :cond_d
    iget-boolean v13, v6, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->l:Z

    .line 414
    .line 415
    move/from16 v32, v13

    .line 416
    .line 417
    :goto_e
    if-eqz v8, :cond_e

    .line 418
    .line 419
    const/16 v30, 0x1

    .line 420
    .line 421
    goto :goto_f

    .line 422
    :cond_e
    const/16 v30, 0x0

    .line 423
    .line 424
    :goto_f
    const/16 v36, 0x0

    .line 425
    .line 426
    const/16 v38, 0x6620

    .line 427
    .line 428
    const/16 v28, 0x0

    .line 429
    .line 430
    const/16 v34, 0x0

    .line 431
    .line 432
    const/16 v35, 0x0

    .line 433
    .line 434
    move-object/from16 v17, v6

    .line 435
    .line 436
    move/from16 v29, v7

    .line 437
    .line 438
    move-wide/from16 v24, v9

    .line 439
    .line 440
    move-wide/from16 v22, v11

    .line 441
    .line 442
    invoke-static/range {v17 .. v38}, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->a(Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;DDDDDLjava/lang/String;ZZLorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;ZZZZZZI)Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 443
    .line 444
    .line 445
    move-result-object v6

    .line 446
    invoke-virtual {v2, v0, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 447
    .line 448
    .line 449
    move-result v0

    .line 450
    if-eqz v0, :cond_f

    .line 451
    .line 452
    goto :goto_10

    .line 453
    :cond_f
    move/from16 v3, v16

    .line 454
    .line 455
    move-object/from16 v4, v39

    .line 456
    .line 457
    const/4 v9, 0x1

    .line 458
    const/4 v10, 0x0

    .line 459
    const-wide/16 v15, 0x0

    .line 460
    .line 461
    goto :goto_a

    .line 462
    :cond_10
    :goto_10
    sget-object v2, La/o40;->a:La/o40;

    .line 463
    .line 464
    iget-object v6, v1, La/xxj0;->x0:La/p7m0;

    .line 465
    .line 466
    iget-object v0, v1, La/xxj0;->m0:La/bby;

    .line 467
    .line 468
    if-eqz v0, :cond_11

    .line 469
    .line 470
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 471
    .line 472
    .line 473
    move-result v0

    .line 474
    const/4 v4, 0x1

    .line 475
    if-ne v0, v4, :cond_11

    .line 476
    .line 477
    goto :goto_14

    .line 478
    :cond_11
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 479
    .line 480
    iget-object v0, v1, La/xxj0;->o:La/pru;

    .line 481
    .line 482
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    iget-object v0, v0, La/sff0;->a:La/gx7;

    .line 487
    .line 488
    iget-object v0, v0, La/gx7;->a:La/gm7;

    .line 489
    .line 490
    iget-boolean v0, v0, La/gm7;->b:Z

    .line 491
    .line 492
    if-eqz v0, :cond_12

    .line 493
    .line 494
    if-eqz v5, :cond_12

    .line 495
    .line 496
    sget-object v0, La/m40;->a:La/m40;

    .line 497
    .line 498
    goto :goto_11

    .line 499
    :catchall_0
    move-exception v0

    .line 500
    goto :goto_12

    .line 501
    :cond_12
    if-eqz v0, :cond_13

    .line 502
    .line 503
    if-nez v5, :cond_13

    .line 504
    .line 505
    sget-object v0, La/k40;->a:La/k40;

    .line 506
    .line 507
    goto :goto_11

    .line 508
    :cond_13
    move-object v0, v2

    .line 509
    :goto_11
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 510
    .line 511
    .line 512
    const/4 v4, 0x0

    .line 513
    invoke-virtual {v6, v4, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 514
    .line 515
    .line 516
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 517
    .line 518
    goto :goto_13

    .line 519
    :goto_12
    sget-object v4, La/j0g0;->b:La/e0g0;

    .line 520
    .line 521
    new-instance v4, La/g0g0;

    .line 522
    .line 523
    invoke-direct {v4, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 524
    .line 525
    .line 526
    move-object v0, v4

    .line 527
    :goto_13
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    if-eqz v0, :cond_14

    .line 532
    .line 533
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 537
    .line 538
    .line 539
    const/4 v4, 0x0

    .line 540
    invoke-virtual {v6, v4, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 541
    .line 542
    .line 543
    :cond_14
    :goto_14
    iget-object v0, v1, La/xxj0;->D0:La/p7m0;

    .line 544
    .line 545
    :cond_15
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object v1

    .line 549
    move-object v2, v1

    .line 550
    check-cast v2, La/exo;

    .line 551
    .line 552
    const/16 v4, 0xbf

    .line 553
    .line 554
    const/4 v3, 0x0

    .line 555
    invoke-static {v2, v3, v3, v3, v4}, La/exo;->a(La/exo;ZZZI)La/exo;

    .line 556
    .line 557
    .line 558
    move-result-object v2

    .line 559
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 560
    .line 561
    .line 562
    move-result v1

    .line 563
    if-eqz v1, :cond_15

    .line 564
    .line 565
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 566
    .line 567
    return-object v0

    .line 568
    nop

    .line 569
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
