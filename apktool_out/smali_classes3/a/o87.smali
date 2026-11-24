.class public final La/o87;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/mfu;

.field public j:La/f97;

.field public k:B

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:La/f97;


# direct methods
.method public constructor <init>(La/f97;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/o87;->m:La/f97;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    new-instance v0, La/o87;

    .line 2
    .line 3
    iget-object p0, p0, La/o87;->m:La/f97;

    .line 4
    .line 5
    invoke-direct {v0, p0, p2}, La/o87;-><init>(La/f97;La/yje;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, La/o87;->l:Ljava/lang/Object;

    .line 9
    .line 10
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
    invoke-virtual {p0, p1, p2}, La/o87;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/o87;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/o87;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    iget-object v3, v0, La/o87;->m:La/f97;

    .line 9
    .line 10
    iget-object v4, v3, La/f97;->q:La/mne;

    .line 11
    .line 12
    iget-object v5, v3, La/f97;->p:Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;

    .line 13
    .line 14
    iget-object v6, v0, La/o87;->l:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v6, La/vne;

    .line 17
    .line 18
    sget-object v7, La/wne;->a:La/wne;

    .line 19
    .line 20
    iget-byte v8, v0, La/o87;->k:B

    .line 21
    .line 22
    const/4 v9, 0x2

    .line 23
    const/4 v10, 0x0

    .line 24
    const/4 v11, 0x1

    .line 25
    if-eqz v8, :cond_2

    .line 26
    .line 27
    if-eq v8, v11, :cond_1

    .line 28
    .line 29
    if-ne v8, v9, :cond_0

    .line 30
    .line 31
    iget-object v7, v0, La/o87;->j:La/f97;

    .line 32
    .line 33
    iget-object v0, v0, La/o87;->i:La/mfu;

    .line 34
    .line 35
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    move-object v8, v0

    .line 39
    move-object/from16 v0, p1

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-object v10

    .line 48
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iput-object v6, v0, La/o87;->l:Ljava/lang/Object;

    .line 56
    .line 57
    iput-byte v11, v0, La/o87;->k:B

    .line 58
    .line 59
    sget v8, La/f97;->R0:I

    .line 60
    .line 61
    invoke-virtual {v3, v0}, La/f97;->V(La/zje;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    if-ne v8, v7, :cond_3

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    :goto_0
    iget-object v8, v3, La/f97;->N:La/mfu;

    .line 69
    .line 70
    iput-object v6, v0, La/o87;->l:Ljava/lang/Object;

    .line 71
    .line 72
    iput-object v8, v0, La/o87;->i:La/mfu;

    .line 73
    .line 74
    iput-object v3, v0, La/o87;->j:La/f97;

    .line 75
    .line 76
    iput-byte v9, v0, La/o87;->k:B

    .line 77
    .line 78
    invoke-virtual {v3, v0}, La/f97;->S(La/yje;)Ljava/io/Serializable;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    if-ne v0, v7, :cond_4

    .line 83
    .line 84
    :goto_1
    return-object v7

    .line 85
    :cond_4
    move-object v7, v3

    .line 86
    :goto_2
    check-cast v0, La/ql5;

    .line 87
    .line 88
    iget-wide v14, v0, La/ql5;->a:J

    .line 89
    .line 90
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, La/i77;

    .line 95
    .line 96
    iget-object v0, v0, La/i77;->i:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 97
    .line 98
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v12

    .line 102
    check-cast v12, La/i77;

    .line 103
    .line 104
    iget-object v12, v12, La/i77;->l:La/wdj;

    .line 105
    .line 106
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v13

    .line 110
    check-cast v13, La/i77;

    .line 111
    .line 112
    iget-object v13, v13, La/i77;->m:Ljava/util/List;

    .line 113
    .line 114
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v16

    .line 118
    move-object/from16 v10, v16

    .line 119
    .line 120
    check-cast v10, La/i77;

    .line 121
    .line 122
    iget-object v10, v10, La/i77;->F:Ljava/util/List;

    .line 123
    .line 124
    instance-of v1, v5, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetChampHistory;

    .line 125
    .line 126
    if-eqz v1, :cond_5

    .line 127
    .line 128
    move-object v1, v5

    .line 129
    check-cast v1, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetChampHistory;

    .line 130
    .line 131
    iget-object v1, v1, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetChampHistory;->f:Ljava/lang/String;

    .line 132
    .line 133
    move-object/from16 v17, v1

    .line 134
    .line 135
    :goto_3
    move-object v1, v13

    .line 136
    goto :goto_4

    .line 137
    :cond_5
    const/16 v17, 0x0

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :goto_4
    iget-object v13, v8, La/mfu;->d:La/ywu;

    .line 141
    .line 142
    sget-object v9, La/rv00;->k:La/rv00;

    .line 143
    .line 144
    move/from16 v19, v11

    .line 145
    .line 146
    iget-object v11, v8, La/mfu;->c:La/pru;

    .line 147
    .line 148
    move-object/from16 v20, v2

    .line 149
    .line 150
    iget-object v2, v8, La/mfu;->b:La/k7u;

    .line 151
    .line 152
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    move-object/from16 v21, v10

    .line 162
    .line 163
    sget-object v10, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;->e:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 164
    .line 165
    const-wide/16 v22, 0x0

    .line 166
    .line 167
    const-wide/16 v25, 0x3e8

    .line 168
    .line 169
    if-ne v0, v10, :cond_6

    .line 170
    .line 171
    const-wide/32 v27, 0x143940

    .line 172
    .line 173
    .line 174
    move-wide/from16 v30, v27

    .line 175
    .line 176
    move-object/from16 v27, v11

    .line 177
    .line 178
    :goto_5
    move-object/from16 v28, v13

    .line 179
    .line 180
    goto :goto_7

    .line 181
    :cond_6
    instance-of v10, v12, La/tdj;

    .line 182
    .line 183
    if-eqz v10, :cond_7

    .line 184
    .line 185
    move-object v10, v12

    .line 186
    check-cast v10, La/tdj;

    .line 187
    .line 188
    move-object/from16 v27, v11

    .line 189
    .line 190
    iget-wide v10, v10, La/tdj;->a:J

    .line 191
    .line 192
    move-wide/from16 v30, v10

    .line 193
    .line 194
    goto :goto_5

    .line 195
    :cond_7
    move-object/from16 v27, v11

    .line 196
    .line 197
    instance-of v10, v12, La/udj;

    .line 198
    .line 199
    if-eqz v10, :cond_8

    .line 200
    .line 201
    invoke-virtual/range {v27 .. v27}, La/pru;->a()La/sff0;

    .line 202
    .line 203
    .line 204
    move-result-object v10

    .line 205
    iget-object v10, v10, La/sff0;->a:La/gx7;

    .line 206
    .line 207
    iget-object v10, v10, La/gx7;->b:La/q57;

    .line 208
    .line 209
    iget v10, v10, La/q57;->d:I

    .line 210
    .line 211
    add-int/lit8 v10, v10, -0x1

    .line 212
    .line 213
    int-to-long v10, v10

    .line 214
    const-wide/32 v28, 0x5265c00

    .line 215
    .line 216
    .line 217
    mul-long v10, v10, v28

    .line 218
    .line 219
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 220
    .line 221
    .line 222
    move-result-object v28

    .line 223
    invoke-virtual/range {v28 .. v28}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 224
    .line 225
    .line 226
    move-result-wide v28

    .line 227
    sub-long v10, v28, v10

    .line 228
    .line 229
    move-object/from16 v28, v13

    .line 230
    .line 231
    const/16 v13, 0xe

    .line 232
    .line 233
    invoke-static {v9, v10, v11, v13}, La/rv00;->n(La/rv00;JI)J

    .line 234
    .line 235
    .line 236
    move-result-wide v10

    .line 237
    div-long v10, v10, v25

    .line 238
    .line 239
    :goto_6
    move-wide/from16 v30, v10

    .line 240
    .line 241
    goto :goto_7

    .line 242
    :cond_8
    move-object/from16 v28, v13

    .line 243
    .line 244
    instance-of v10, v12, La/vdj;

    .line 245
    .line 246
    if-eqz v10, :cond_9

    .line 247
    .line 248
    move-object v10, v12

    .line 249
    check-cast v10, La/vdj;

    .line 250
    .line 251
    iget-wide v10, v10, La/vdj;->a:J

    .line 252
    .line 253
    goto :goto_6

    .line 254
    :cond_9
    move-wide/from16 v30, v22

    .line 255
    .line 256
    :goto_7
    instance-of v10, v12, La/vdj;

    .line 257
    .line 258
    if-eqz v10, :cond_b

    .line 259
    .line 260
    sget-object v13, La/rdj;->a:La/rdj;

    .line 261
    .line 262
    move-object v13, v12

    .line 263
    check-cast v13, La/vdj;

    .line 264
    .line 265
    move-object/from16 v29, v12

    .line 266
    .line 267
    iget-wide v11, v13, La/vdj;->b:J

    .line 268
    .line 269
    invoke-static {v11, v12}, La/rdj;->k(J)Ljava/util/Date;

    .line 270
    .line 271
    .line 272
    move-result-object v13

    .line 273
    move/from16 v32, v10

    .line 274
    .line 275
    new-instance v10, Ljava/util/Date;

    .line 276
    .line 277
    move-wide/from16 v33, v11

    .line 278
    .line 279
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 280
    .line 281
    .line 282
    move-result-wide v11

    .line 283
    invoke-direct {v10, v11, v12}, Ljava/util/Date;-><init>(J)V

    .line 284
    .line 285
    .line 286
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 287
    .line 288
    .line 289
    move-result-object v11

    .line 290
    invoke-virtual {v11, v13}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 291
    .line 292
    .line 293
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 294
    .line 295
    .line 296
    move-result-object v12

    .line 297
    invoke-virtual {v12, v10}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 298
    .line 299
    .line 300
    move/from16 v10, v19

    .line 301
    .line 302
    invoke-virtual {v11, v10}, Ljava/util/Calendar;->get(I)I

    .line 303
    .line 304
    .line 305
    move-result v13

    .line 306
    move-wide/from16 v35, v14

    .line 307
    .line 308
    invoke-virtual {v12, v10}, Ljava/util/Calendar;->get(I)I

    .line 309
    .line 310
    .line 311
    move-result v14

    .line 312
    if-ne v13, v14, :cond_a

    .line 313
    .line 314
    const/4 v10, 0x2

    .line 315
    invoke-virtual {v11, v10}, Ljava/util/Calendar;->get(I)I

    .line 316
    .line 317
    .line 318
    move-result v13

    .line 319
    invoke-virtual {v12, v10}, Ljava/util/Calendar;->get(I)I

    .line 320
    .line 321
    .line 322
    move-result v14

    .line 323
    if-ne v13, v14, :cond_a

    .line 324
    .line 325
    const/4 v10, 0x5

    .line 326
    invoke-virtual {v11, v10}, Ljava/util/Calendar;->get(I)I

    .line 327
    .line 328
    .line 329
    move-result v11

    .line 330
    invoke-virtual {v12, v10}, Ljava/util/Calendar;->get(I)I

    .line 331
    .line 332
    .line 333
    move-result v10

    .line 334
    if-ne v11, v10, :cond_a

    .line 335
    .line 336
    move-wide/from16 v15, v22

    .line 337
    .line 338
    move-object/from16 v10, v29

    .line 339
    .line 340
    goto :goto_8

    .line 341
    :cond_a
    move-object/from16 v10, v29

    .line 342
    .line 343
    move-wide/from16 v15, v33

    .line 344
    .line 345
    goto :goto_8

    .line 346
    :cond_b
    move/from16 v32, v10

    .line 347
    .line 348
    move-object v10, v12

    .line 349
    move-wide/from16 v35, v14

    .line 350
    .line 351
    instance-of v11, v10, La/tdj;

    .line 352
    .line 353
    if-eqz v11, :cond_c

    .line 354
    .line 355
    move-object v12, v10

    .line 356
    check-cast v12, La/tdj;

    .line 357
    .line 358
    iget-wide v11, v12, La/tdj;->a:J

    .line 359
    .line 360
    mul-long v11, v11, v25

    .line 361
    .line 362
    const/16 v13, 0xc

    .line 363
    .line 364
    invoke-static {v9, v11, v12, v13}, La/rv00;->n(La/rv00;JI)J

    .line 365
    .line 366
    .line 367
    move-result-wide v11

    .line 368
    div-long v22, v11, v25

    .line 369
    .line 370
    :cond_c
    move-wide/from16 v15, v22

    .line 371
    .line 372
    :goto_8
    new-instance v11, Ljava/util/ArrayList;

    .line 373
    .line 374
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 375
    .line 376
    .line 377
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 378
    .line 379
    .line 380
    move-result-object v12

    .line 381
    :cond_d
    :goto_9
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 382
    .line 383
    .line 384
    move-result v13

    .line 385
    if-eqz v13, :cond_e

    .line 386
    .line 387
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v13

    .line 391
    move-object v14, v13

    .line 392
    check-cast v14, La/h0w;

    .line 393
    .line 394
    iget-boolean v14, v14, La/h0w;->b:Z

    .line 395
    .line 396
    if-eqz v14, :cond_d

    .line 397
    .line 398
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    goto :goto_9

    .line 402
    :cond_e
    new-instance v12, Ljava/util/ArrayList;

    .line 403
    .line 404
    const/16 v13, 0xa

    .line 405
    .line 406
    invoke-static {v11, v13}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 407
    .line 408
    .line 409
    move-result v13

    .line 410
    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 414
    .line 415
    .line 416
    move-result-object v11

    .line 417
    :goto_a
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 418
    .line 419
    .line 420
    move-result v13

    .line 421
    if-eqz v13, :cond_f

    .line 422
    .line 423
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v13

    .line 427
    check-cast v13, La/h0w;

    .line 428
    .line 429
    invoke-static {v13}, La/xnm0;->k(La/h0w;)I

    .line 430
    .line 431
    .line 432
    move-result v13

    .line 433
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 434
    .line 435
    .line 436
    move-result-object v13

    .line 437
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    goto :goto_a

    .line 441
    :cond_f
    invoke-interface {v5}, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;->p0()La/k77;

    .line 442
    .line 443
    .line 444
    move-result-object v11

    .line 445
    sget-object v13, La/k77;->c:La/k77;

    .line 446
    .line 447
    if-eq v11, v13, :cond_11

    .line 448
    .line 449
    invoke-interface {v5}, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;->p0()La/k77;

    .line 450
    .line 451
    .line 452
    move-result-object v11

    .line 453
    sget-object v13, La/k77;->e:La/k77;

    .line 454
    .line 455
    if-eq v11, v13, :cond_11

    .line 456
    .line 457
    invoke-interface {v5}, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;->p0()La/k77;

    .line 458
    .line 459
    .line 460
    move-result-object v11

    .line 461
    sget-object v13, La/k77;->f:La/k77;

    .line 462
    .line 463
    if-ne v11, v13, :cond_10

    .line 464
    .line 465
    goto :goto_b

    .line 466
    :cond_10
    const/16 v22, 0x0

    .line 467
    .line 468
    goto :goto_e

    .line 469
    :cond_11
    :goto_b
    new-instance v11, Ljava/util/ArrayList;

    .line 470
    .line 471
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 472
    .line 473
    .line 474
    invoke-interface/range {v21 .. v21}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 475
    .line 476
    .line 477
    move-result-object v13

    .line 478
    :goto_c
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 479
    .line 480
    .line 481
    move-result v14

    .line 482
    if-eqz v14, :cond_13

    .line 483
    .line 484
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v14

    .line 488
    move-object/from16 p1, v13

    .line 489
    .line 490
    move-object v13, v14

    .line 491
    check-cast v13, La/un7;

    .line 492
    .line 493
    iget-boolean v13, v13, La/un7;->b:Z

    .line 494
    .line 495
    if-eqz v13, :cond_12

    .line 496
    .line 497
    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 498
    .line 499
    .line 500
    :cond_12
    move-object/from16 v13, p1

    .line 501
    .line 502
    goto :goto_c

    .line 503
    :cond_13
    new-instance v13, Ljava/util/ArrayList;

    .line 504
    .line 505
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 509
    .line 510
    .line 511
    move-result-object v11

    .line 512
    :cond_14
    :goto_d
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 513
    .line 514
    .line 515
    move-result v14

    .line 516
    if-eqz v14, :cond_15

    .line 517
    .line 518
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v14

    .line 522
    check-cast v14, La/un7;

    .line 523
    .line 524
    iget-object v14, v14, La/un7;->a:La/q4f;

    .line 525
    .line 526
    invoke-static {v14}, La/zjb;->O(La/q4f;)Ljava/lang/Integer;

    .line 527
    .line 528
    .line 529
    move-result-object v14

    .line 530
    if-eqz v14, :cond_14

    .line 531
    .line 532
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 533
    .line 534
    .line 535
    goto :goto_d

    .line 536
    :cond_15
    move-object/from16 v22, v13

    .line 537
    .line 538
    :goto_e
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 539
    .line 540
    .line 541
    move-result v11

    .line 542
    if-eqz v11, :cond_16

    .line 543
    .line 544
    goto :goto_f

    .line 545
    :cond_16
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 546
    .line 547
    .line 548
    move-result-object v11

    .line 549
    :cond_17
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 550
    .line 551
    .line 552
    move-result v13

    .line 553
    if-eqz v13, :cond_18

    .line 554
    .line 555
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v13

    .line 559
    check-cast v13, La/h0w;

    .line 560
    .line 561
    iget-boolean v13, v13, La/h0w;->b:Z

    .line 562
    .line 563
    if-nez v13, :cond_17

    .line 564
    .line 565
    move-object v14, v12

    .line 566
    goto :goto_10

    .line 567
    :cond_18
    :goto_f
    const/4 v14, 0x0

    .line 568
    :goto_10
    sget-object v11, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;->f:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 569
    .line 570
    if-ne v0, v11, :cond_19

    .line 571
    .line 572
    iget-object v12, v8, La/mfu;->i:La/htt;

    .line 573
    .line 574
    move-wide/from16 v15, v30

    .line 575
    .line 576
    move-wide/from16 v13, v35

    .line 577
    .line 578
    invoke-virtual/range {v12 .. v17}, La/htt;->a(JJLjava/lang/String;)La/lhf0;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    goto/16 :goto_14

    .line 583
    .line 584
    :cond_19
    instance-of v11, v5, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetChampHistory;

    .line 585
    .line 586
    if-eqz v11, :cond_1a

    .line 587
    .line 588
    new-instance v0, La/eb7;

    .line 589
    .line 590
    check-cast v5, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetChampHistory;

    .line 591
    .line 592
    iget-object v13, v5, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetChampHistory;->f:Ljava/lang/String;

    .line 593
    .line 594
    iget-object v1, v2, La/k7u;->a:La/uzc;

    .line 595
    .line 596
    invoke-virtual {v1}, La/uzc;->b()La/jvn;

    .line 597
    .line 598
    .line 599
    move-result-object v1

    .line 600
    invoke-virtual {v1}, La/jvn;->getId()I

    .line 601
    .line 602
    .line 603
    move-result v14

    .line 604
    invoke-static/range {v20 .. v20}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 605
    .line 606
    .line 607
    move-result-object v1

    .line 608
    invoke-virtual {v12, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 609
    .line 610
    .line 611
    move-result v1

    .line 612
    const/16 v19, 0x1

    .line 613
    .line 614
    xor-int/lit8 v1, v1, 0x1

    .line 615
    .line 616
    move-object/from16 v21, v12

    .line 617
    .line 618
    move-wide/from16 v19, v15

    .line 619
    .line 620
    move-object/from16 v23, v22

    .line 621
    .line 622
    move-wide/from16 v17, v30

    .line 623
    .line 624
    move-wide/from16 v15, v35

    .line 625
    .line 626
    move-object v12, v0

    .line 627
    move/from16 v22, v1

    .line 628
    .line 629
    invoke-direct/range {v12 .. v23}, La/eb7;-><init>(Ljava/lang/String;IJJJLjava/util/ArrayList;ZLjava/util/ArrayList;)V

    .line 630
    .line 631
    .line 632
    iget-object v0, v8, La/mfu;->a:La/mii0;

    .line 633
    .line 634
    new-instance v1, La/lhf0;

    .line 635
    .line 636
    new-instance v2, La/gst;

    .line 637
    .line 638
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 639
    .line 640
    .line 641
    new-instance v5, La/td6;

    .line 642
    .line 643
    const/16 v8, 0x1d

    .line 644
    .line 645
    const/4 v9, 0x0

    .line 646
    invoke-direct {v5, v0, v12, v9, v8}, La/td6;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 647
    .line 648
    .line 649
    invoke-direct {v1, v2, v5}, La/lhf0;-><init>(La/gm80;Lkotlin/jvm/functions/Function2;)V

    .line 650
    .line 651
    .line 652
    :goto_11
    move-object v0, v1

    .line 653
    goto/16 :goto_14

    .line 654
    .line 655
    :cond_1a
    move-object v5, v12

    .line 656
    move-object/from16 v13, v22

    .line 657
    .line 658
    move-wide/from16 v22, v15

    .line 659
    .line 660
    move-wide/from16 v16, v30

    .line 661
    .line 662
    sget-object v11, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;->b:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 663
    .line 664
    if-ne v0, v11, :cond_1b

    .line 665
    .line 666
    new-instance v12, La/xa7;

    .line 667
    .line 668
    iget-object v0, v2, La/k7u;->a:La/uzc;

    .line 669
    .line 670
    invoke-virtual {v0}, La/uzc;->b()La/jvn;

    .line 671
    .line 672
    .line 673
    move-result-object v0

    .line 674
    invoke-virtual {v0}, La/jvn;->getId()I

    .line 675
    .line 676
    .line 677
    move-result v0

    .line 678
    invoke-static/range {v20 .. v20}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 679
    .line 680
    .line 681
    move-result-object v1

    .line 682
    invoke-virtual {v5, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 683
    .line 684
    .line 685
    move-result v1

    .line 686
    const/16 v19, 0x1

    .line 687
    .line 688
    xor-int/lit8 v21, v1, 0x1

    .line 689
    .line 690
    move-object/from16 v20, v5

    .line 691
    .line 692
    move-wide/from16 v18, v22

    .line 693
    .line 694
    move-wide/from16 v14, v35

    .line 695
    .line 696
    move-object/from16 v22, v13

    .line 697
    .line 698
    move v13, v0

    .line 699
    invoke-direct/range {v12 .. v22}, La/xa7;-><init>(IJJJLjava/util/List;ZLjava/util/ArrayList;)V

    .line 700
    .line 701
    .line 702
    invoke-virtual {v8, v12}, La/mfu;->b(La/xa7;)La/lhf0;

    .line 703
    .line 704
    .line 705
    move-result-object v0

    .line 706
    goto/16 :goto_14

    .line 707
    .line 708
    :cond_1b
    move-object/from16 v20, v5

    .line 709
    .line 710
    sget-object v5, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;->c:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 711
    .line 712
    if-ne v0, v5, :cond_1c

    .line 713
    .line 714
    iget-object v0, v2, La/k7u;->a:La/uzc;

    .line 715
    .line 716
    invoke-virtual {v0}, La/uzc;->b()La/jvn;

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    invoke-virtual {v0}, La/jvn;->getId()I

    .line 721
    .line 722
    .line 723
    move-result v0

    .line 724
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 725
    .line 726
    .line 727
    move-result-object v0

    .line 728
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 729
    .line 730
    .line 731
    new-instance v1, La/lhf0;

    .line 732
    .line 733
    new-instance v2, La/xuz;

    .line 734
    .line 735
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 736
    .line 737
    .line 738
    new-instance v12, La/id10;

    .line 739
    .line 740
    move-wide/from16 v18, v22

    .line 741
    .line 742
    const/16 v22, 0x0

    .line 743
    .line 744
    move-object/from16 v21, v20

    .line 745
    .line 746
    move-object/from16 v13, v28

    .line 747
    .line 748
    move-wide/from16 v14, v35

    .line 749
    .line 750
    move-object/from16 v20, v0

    .line 751
    .line 752
    invoke-direct/range {v12 .. v22}, La/id10;-><init>(La/ywu;JJJLjava/lang/String;Ljava/util/ArrayList;La/yje;)V

    .line 753
    .line 754
    .line 755
    invoke-direct {v1, v2, v12}, La/lhf0;-><init>(La/gm80;Lkotlin/jvm/functions/Function2;)V

    .line 756
    .line 757
    .line 758
    goto :goto_11

    .line 759
    :cond_1c
    sget-object v5, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;->d:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 760
    .line 761
    if-ne v0, v5, :cond_1d

    .line 762
    .line 763
    new-instance v12, La/ww4;

    .line 764
    .line 765
    iget-object v0, v2, La/k7u;->a:La/uzc;

    .line 766
    .line 767
    invoke-virtual {v0}, La/uzc;->b()La/jvn;

    .line 768
    .line 769
    .line 770
    move-result-object v0

    .line 771
    invoke-virtual {v0}, La/jvn;->getId()I

    .line 772
    .line 773
    .line 774
    move-result v0

    .line 775
    move-wide/from16 v13, v16

    .line 776
    .line 777
    move-object/from16 v19, v20

    .line 778
    .line 779
    move-wide/from16 v15, v22

    .line 780
    .line 781
    move-wide/from16 v17, v35

    .line 782
    .line 783
    move/from16 v20, v0

    .line 784
    .line 785
    invoke-direct/range {v12 .. v20}, La/ww4;-><init>(JJJLjava/util/ArrayList;I)V

    .line 786
    .line 787
    .line 788
    iget-object v0, v8, La/mfu;->e:La/es;

    .line 789
    .line 790
    new-instance v1, La/lhf0;

    .line 791
    .line 792
    new-instance v2, La/xuz;

    .line 793
    .line 794
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 795
    .line 796
    .line 797
    new-instance v5, La/y32;

    .line 798
    .line 799
    const/16 v8, 0x1a

    .line 800
    .line 801
    const/4 v9, 0x0

    .line 802
    invoke-direct {v5, v0, v12, v9, v8}, La/y32;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 803
    .line 804
    .line 805
    invoke-direct {v1, v2, v5}, La/lhf0;-><init>(La/gm80;Lkotlin/jvm/functions/Function2;)V

    .line 806
    .line 807
    .line 808
    goto/16 :goto_11

    .line 809
    .line 810
    :cond_1d
    sget-object v5, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;->e:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 811
    .line 812
    if-ne v0, v5, :cond_1e

    .line 813
    .line 814
    new-instance v12, La/xa7;

    .line 815
    .line 816
    iget-object v0, v2, La/k7u;->a:La/uzc;

    .line 817
    .line 818
    invoke-virtual {v0}, La/uzc;->b()La/jvn;

    .line 819
    .line 820
    .line 821
    move-result-object v0

    .line 822
    invoke-virtual {v0}, La/jvn;->getId()I

    .line 823
    .line 824
    .line 825
    move-result v0

    .line 826
    const/16 v19, 0x1

    .line 827
    .line 828
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 829
    .line 830
    .line 831
    move-result-object v1

    .line 832
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 833
    .line 834
    .line 835
    move-result-object v20

    .line 836
    const/16 v21, 0x0

    .line 837
    .line 838
    move-wide/from16 v18, v22

    .line 839
    .line 840
    move-wide/from16 v14, v35

    .line 841
    .line 842
    move-object/from16 v22, v13

    .line 843
    .line 844
    move v13, v0

    .line 845
    invoke-direct/range {v12 .. v22}, La/xa7;-><init>(IJJJLjava/util/List;ZLjava/util/ArrayList;)V

    .line 846
    .line 847
    .line 848
    invoke-virtual {v8, v12}, La/mfu;->b(La/xa7;)La/lhf0;

    .line 849
    .line 850
    .line 851
    move-result-object v0

    .line 852
    goto/16 :goto_14

    .line 853
    .line 854
    :cond_1e
    sget-object v5, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;->h:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 855
    .line 856
    if-ne v0, v5, :cond_1f

    .line 857
    .line 858
    iget-object v0, v2, La/k7u;->a:La/uzc;

    .line 859
    .line 860
    invoke-virtual {v0}, La/uzc;->b()La/jvn;

    .line 861
    .line 862
    .line 863
    move-result-object v0

    .line 864
    invoke-virtual {v0}, La/jvn;->getId()I

    .line 865
    .line 866
    .line 867
    move-result v0

    .line 868
    invoke-virtual/range {v27 .. v27}, La/pru;->a()La/sff0;

    .line 869
    .line 870
    .line 871
    move-result-object v1

    .line 872
    iget v1, v1, La/sff0;->Y:I

    .line 873
    .line 874
    new-instance v2, La/lhf0;

    .line 875
    .line 876
    new-instance v5, La/xuz;

    .line 877
    .line 878
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 879
    .line 880
    .line 881
    new-instance v12, La/mor0;

    .line 882
    .line 883
    move-wide/from16 v18, v22

    .line 884
    .line 885
    const/16 v23, 0x0

    .line 886
    .line 887
    move/from16 v21, v1

    .line 888
    .line 889
    move-object/from16 v22, v20

    .line 890
    .line 891
    move-object/from16 v13, v28

    .line 892
    .line 893
    move-wide/from16 v14, v35

    .line 894
    .line 895
    move/from16 v20, v0

    .line 896
    .line 897
    invoke-direct/range {v12 .. v23}, La/mor0;-><init>(La/ywu;JJJIILjava/util/ArrayList;La/yje;)V

    .line 898
    .line 899
    .line 900
    invoke-direct {v2, v5, v12}, La/lhf0;-><init>(La/gm80;Lkotlin/jvm/functions/Function2;)V

    .line 901
    .line 902
    .line 903
    :goto_12
    move-object v0, v2

    .line 904
    goto/16 :goto_14

    .line 905
    .line 906
    :cond_1f
    sget-object v5, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;->i:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 907
    .line 908
    if-ne v0, v5, :cond_23

    .line 909
    .line 910
    instance-of v0, v10, La/tdj;

    .line 911
    .line 912
    if-eqz v0, :cond_20

    .line 913
    .line 914
    move-object v12, v10

    .line 915
    check-cast v12, La/tdj;

    .line 916
    .line 917
    iget-wide v0, v12, La/tdj;->a:J

    .line 918
    .line 919
    mul-long v0, v0, v25

    .line 920
    .line 921
    const/16 v13, 0xc

    .line 922
    .line 923
    invoke-static {v9, v0, v1, v13}, La/rv00;->n(La/rv00;JI)J

    .line 924
    .line 925
    .line 926
    move-result-wide v0

    .line 927
    div-long v0, v0, v25

    .line 928
    .line 929
    goto :goto_13

    .line 930
    :cond_20
    sget-object v0, La/udj;->a:La/udj;

    .line 931
    .line 932
    invoke-virtual {v10, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 933
    .line 934
    .line 935
    move-result v0

    .line 936
    if-eqz v0, :cond_21

    .line 937
    .line 938
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 939
    .line 940
    .line 941
    move-result-object v0

    .line 942
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 943
    .line 944
    .line 945
    move-result-wide v0

    .line 946
    div-long v0, v0, v25

    .line 947
    .line 948
    goto :goto_13

    .line 949
    :cond_21
    if-eqz v32, :cond_22

    .line 950
    .line 951
    move-object v12, v10

    .line 952
    check-cast v12, La/vdj;

    .line 953
    .line 954
    iget-wide v0, v12, La/vdj;->b:J

    .line 955
    .line 956
    :goto_13
    iget-object v13, v8, La/mfu;->g:La/abu;

    .line 957
    .line 958
    iget-object v2, v8, La/mfu;->h:La/wgu;

    .line 959
    .line 960
    invoke-virtual {v2}, La/wgu;->a()Ljava/lang/String;

    .line 961
    .line 962
    .line 963
    move-result-object v19

    .line 964
    new-instance v2, La/lhf0;

    .line 965
    .line 966
    new-instance v5, La/gst;

    .line 967
    .line 968
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 969
    .line 970
    .line 971
    new-instance v12, La/id10;

    .line 972
    .line 973
    const/16 v22, 0x0

    .line 974
    .line 975
    move-wide/from16 v15, v16

    .line 976
    .line 977
    move-wide/from16 v20, v35

    .line 978
    .line 979
    move-wide/from16 v17, v0

    .line 980
    .line 981
    invoke-direct/range {v12 .. v22}, La/id10;-><init>(La/abu;Ljava/util/List;JJLjava/lang/String;JLa/yje;)V

    .line 982
    .line 983
    .line 984
    invoke-direct {v2, v5, v12}, La/lhf0;-><init>(La/gm80;Lkotlin/jvm/functions/Function2;)V

    .line 985
    .line 986
    .line 987
    goto :goto_12

    .line 988
    :cond_22
    invoke-static {}, La/t9f;->b()V

    .line 989
    .line 990
    .line 991
    const/16 v24, 0x0

    .line 992
    .line 993
    return-object v24

    .line 994
    :cond_23
    sget-object v5, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;->g:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 995
    .line 996
    if-ne v0, v5, :cond_24

    .line 997
    .line 998
    new-instance v29, La/oc0;

    .line 999
    .line 1000
    const/4 v10, 0x2

    .line 1001
    invoke-static {v1, v10}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v0

    .line 1005
    invoke-static {v0}, La/mfu;->a(Ljava/util/List;)I

    .line 1006
    .line 1007
    .line 1008
    move-result v34

    .line 1009
    invoke-virtual/range {v27 .. v27}, La/pru;->a()La/sff0;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v0

    .line 1013
    iget-object v0, v0, La/sff0;->a:La/gx7;

    .line 1014
    .line 1015
    iget-object v0, v0, La/gx7;->b:La/q57;

    .line 1016
    .line 1017
    iget-boolean v0, v0, La/q57;->h:Z

    .line 1018
    .line 1019
    invoke-static {v10, v1}, Lkotlin/collections/CollectionsKt;->E0(ILjava/util/List;)Ljava/util/List;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v1

    .line 1023
    invoke-static {v1}, La/mfu;->a(Ljava/util/List;)I

    .line 1024
    .line 1025
    .line 1026
    move-result v36

    .line 1027
    move/from16 v35, v0

    .line 1028
    .line 1029
    move-wide/from16 v30, v16

    .line 1030
    .line 1031
    move-wide/from16 v32, v22

    .line 1032
    .line 1033
    invoke-direct/range {v29 .. v36}, La/oc0;-><init>(JJIZI)V

    .line 1034
    .line 1035
    .line 1036
    move-object/from16 v0, v29

    .line 1037
    .line 1038
    iget-object v1, v8, La/mfu;->f:La/nr;

    .line 1039
    .line 1040
    new-instance v2, La/lhf0;

    .line 1041
    .line 1042
    new-instance v5, La/gst;

    .line 1043
    .line 1044
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 1045
    .line 1046
    .line 1047
    new-instance v8, La/kz;

    .line 1048
    .line 1049
    const/4 v9, 0x0

    .line 1050
    invoke-direct {v8, v1, v0, v9}, La/kz;-><init>(La/nr;La/oc0;La/yje;)V

    .line 1051
    .line 1052
    .line 1053
    invoke-direct {v2, v5, v8}, La/lhf0;-><init>(La/gm80;Lkotlin/jvm/functions/Function2;)V

    .line 1054
    .line 1055
    .line 1056
    goto/16 :goto_12

    .line 1057
    .line 1058
    :cond_24
    move-wide/from16 v18, v22

    .line 1059
    .line 1060
    new-instance v12, La/xa7;

    .line 1061
    .line 1062
    iget-object v0, v2, La/k7u;->a:La/uzc;

    .line 1063
    .line 1064
    invoke-virtual {v0}, La/uzc;->b()La/jvn;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v0

    .line 1068
    invoke-virtual {v0}, La/jvn;->getId()I

    .line 1069
    .line 1070
    .line 1071
    move-result v0

    .line 1072
    const/16 v21, 0x0

    .line 1073
    .line 1074
    move-object/from16 v22, v13

    .line 1075
    .line 1076
    move-wide/from16 v14, v35

    .line 1077
    .line 1078
    move v13, v0

    .line 1079
    invoke-direct/range {v12 .. v22}, La/xa7;-><init>(IJJJLjava/util/List;ZLjava/util/ArrayList;)V

    .line 1080
    .line 1081
    .line 1082
    invoke-virtual {v8, v12}, La/mfu;->b(La/xa7;)La/lhf0;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v0

    .line 1086
    :goto_14
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v1

    .line 1090
    iget-object v2, v4, La/mne;->b:La/dvj;

    .line 1091
    .line 1092
    new-instance v5, La/ek80;

    .line 1093
    .line 1094
    invoke-direct {v5, v0, v1, v2}, La/ek80;-><init>(La/lhf0;La/bvc;La/lne;)V

    .line 1095
    .line 1096
    .line 1097
    iput-object v5, v7, La/f97;->K0:La/ek80;

    .line 1098
    .line 1099
    iget-object v0, v3, La/f97;->K0:La/ek80;

    .line 1100
    .line 1101
    if-eqz v0, :cond_25

    .line 1102
    .line 1103
    iget-object v0, v0, La/ek80;->e:La/p7m0;

    .line 1104
    .line 1105
    if-eqz v0, :cond_25

    .line 1106
    .line 1107
    new-instance v1, La/kv;

    .line 1108
    .line 1109
    const/4 v2, 0x3

    .line 1110
    const/4 v9, 0x0

    .line 1111
    invoke-direct {v1, v3, v9, v2}, La/kv;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 1112
    .line 1113
    .line 1114
    new-instance v2, La/fnq;

    .line 1115
    .line 1116
    const/4 v3, 0x4

    .line 1117
    invoke-direct {v2, v0, v1, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 1118
    .line 1119
    .line 1120
    iget-object v0, v4, La/mne;->a:La/rwj;

    .line 1121
    .line 1122
    invoke-static {v6, v0}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v0

    .line 1126
    invoke-static {v2, v0}, La/sac;->U(La/gmq;La/vne;)La/c4m0;

    .line 1127
    .line 1128
    .line 1129
    :cond_25
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1130
    .line 1131
    return-object v0
.end method
