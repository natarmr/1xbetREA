.class public final La/uwj0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kmq;

.field public final synthetic c:La/xxj0;


# direct methods
.method public synthetic constructor <init>(La/kmq;La/xxj0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/uwj0;->a:B

    iput-object p1, p0, La/uwj0;->b:La/kmq;

    iput-object p2, p0, La/uwj0;->c:La/xxj0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-byte v2, v0, La/uwj0;->a:B

    .line 6
    .line 7
    iget-object v3, v0, La/uwj0;->c:La/xxj0;

    .line 8
    .line 9
    iget-object v4, v0, La/uwj0;->b:La/kmq;

    .line 10
    .line 11
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    const/high16 v7, -0x80000000

    .line 15
    .line 16
    packed-switch v2, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    instance-of v2, v1, La/axj0;

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    move-object v2, v1

    .line 24
    check-cast v2, La/axj0;

    .line 25
    .line 26
    iget v9, v2, La/axj0;->j:I

    .line 27
    .line 28
    and-int v10, v9, v7

    .line 29
    .line 30
    if-eqz v10, :cond_0

    .line 31
    .line 32
    sub-int/2addr v9, v7

    .line 33
    iput v9, v2, La/axj0;->j:I

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance v2, La/axj0;

    .line 37
    .line 38
    invoke-direct {v2, v0, v1}, La/axj0;-><init>(La/uwj0;La/yje;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    iget-object v0, v2, La/axj0;->i:Ljava/lang/Object;

    .line 42
    .line 43
    sget-object v1, La/wne;->a:La/wne;

    .line 44
    .line 45
    iget v7, v2, La/axj0;->j:I

    .line 46
    .line 47
    if-eqz v7, :cond_2

    .line 48
    .line 49
    if-ne v7, v6, :cond_1

    .line 50
    .line 51
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_13

    .line 55
    .line 56
    :cond_1
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/4 v8, 0x0

    .line 60
    goto/16 :goto_14

    .line 61
    .line 62
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    move-object/from16 v0, p1

    .line 66
    .line 67
    check-cast v0, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 68
    .line 69
    iget-object v3, v3, La/xxj0;->m:La/ctf0;

    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget-boolean v5, v0, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->q:Z

    .line 75
    .line 76
    iget-wide v9, v0, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->d:D

    .line 77
    .line 78
    iget-boolean v7, v0, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->n:Z

    .line 79
    .line 80
    iget-wide v11, v0, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->a:D

    .line 81
    .line 82
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    iget-boolean v13, v0, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->j:Z

    .line 86
    .line 87
    const-wide/high16 v14, -0x4010000000000000L    # -1.0

    .line 88
    .line 89
    cmpg-double v16, v11, v14

    .line 90
    .line 91
    if-nez v16, :cond_3

    .line 92
    .line 93
    move-wide/from16 p0, v9

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_3
    move-wide/from16 p0, v9

    .line 97
    .line 98
    iget-wide v8, v0, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->b:D

    .line 99
    .line 100
    const-wide/16 v17, 0x0

    .line 101
    .line 102
    cmpg-double v8, v8, v17

    .line 103
    .line 104
    if-nez v8, :cond_4

    .line 105
    .line 106
    :goto_1
    const-string v8, ""

    .line 107
    .line 108
    :goto_2
    move-object/from16 v18, v8

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_4
    sget-object v8, La/pn40;->a:La/pn40;

    .line 112
    .line 113
    sget-object v8, La/p3u0;->g:La/p3u0;

    .line 114
    .line 115
    invoke-static {v11, v12, v8}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v8

    .line 119
    goto :goto_2

    .line 120
    :goto_3
    iget-wide v8, v0, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->d:D

    .line 121
    .line 122
    move-wide/from16 v25, v14

    .line 123
    .line 124
    iget-wide v14, v0, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->e:D

    .line 125
    .line 126
    invoke-virtual {v0}, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->b()D

    .line 127
    .line 128
    .line 129
    move-result-wide v19

    .line 130
    iget-object v10, v0, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->f:Ljava/lang/String;

    .line 131
    .line 132
    move/from16 v31, v6

    .line 133
    .line 134
    iget-boolean v6, v0, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->g:Z

    .line 135
    .line 136
    cmpg-double v17, v8, v11

    .line 137
    .line 138
    if-gtz v17, :cond_5

    .line 139
    .line 140
    cmpg-double v17, v11, v19

    .line 141
    .line 142
    if-gtz v17, :cond_5

    .line 143
    .line 144
    :goto_4
    move/from16 v19, v6

    .line 145
    .line 146
    move-wide/from16 v20, v8

    .line 147
    .line 148
    move-object/from16 v22, v10

    .line 149
    .line 150
    move-wide/from16 v23, v14

    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_5
    cmpg-double v17, v11, v25

    .line 154
    .line 155
    if-nez v17, :cond_6

    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_6
    cmpl-double v17, v11, v19

    .line 159
    .line 160
    if-lez v17, :cond_7

    .line 161
    .line 162
    if-eqz v7, :cond_7

    .line 163
    .line 164
    goto :goto_4

    .line 165
    :goto_5
    invoke-static/range {v19 .. v24}, La/h8x;->r(ZDLjava/lang/String;D)La/ank0;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    :goto_6
    move-object/from16 v20, v6

    .line 170
    .line 171
    goto :goto_7

    .line 172
    :cond_7
    move-object v6, v10

    .line 173
    cmpg-double v10, v11, v8

    .line 174
    .line 175
    if-gez v10, :cond_8

    .line 176
    .line 177
    invoke-static {v3, v8, v9, v6}, La/h8x;->u(La/ctf0;DLjava/lang/String;)La/ank0;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    goto :goto_6

    .line 182
    :cond_8
    cmpl-double v8, v11, v19

    .line 183
    .line 184
    if-lez v8, :cond_9

    .line 185
    .line 186
    if-nez v7, :cond_9

    .line 187
    .line 188
    invoke-static {v3, v14, v15, v6}, La/h8x;->s(La/ctf0;DLjava/lang/String;)La/ank0;

    .line 189
    .line 190
    .line 191
    move-result-object v6

    .line 192
    goto :goto_6

    .line 193
    :cond_9
    new-instance v6, La/ank0;

    .line 194
    .line 195
    sget-object v8, La/iun;->a:La/iun;

    .line 196
    .line 197
    invoke-direct {v6, v8}, La/ank0;-><init>(Ljava/util/List;)V

    .line 198
    .line 199
    .line 200
    goto :goto_6

    .line 201
    :goto_7
    iget-boolean v6, v0, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->m:Z

    .line 202
    .line 203
    invoke-virtual {v0}, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->b()D

    .line 204
    .line 205
    .line 206
    move-result-wide v8

    .line 207
    cmpg-double v8, v11, v8

    .line 208
    .line 209
    if-gez v8, :cond_a

    .line 210
    .line 211
    if-eqz v13, :cond_a

    .line 212
    .line 213
    move/from16 v22, v31

    .line 214
    .line 215
    goto :goto_8

    .line 216
    :cond_a
    const/16 v22, 0x0

    .line 217
    .line 218
    :goto_8
    cmpl-double v8, v11, p0

    .line 219
    .line 220
    if-lez v8, :cond_b

    .line 221
    .line 222
    if-eqz v13, :cond_b

    .line 223
    .line 224
    move/from16 v23, v31

    .line 225
    .line 226
    goto :goto_9

    .line 227
    :cond_b
    const/16 v23, 0x0

    .line 228
    .line 229
    :goto_9
    if-eqz v13, :cond_f

    .line 230
    .line 231
    if-nez v16, :cond_c

    .line 232
    .line 233
    goto :goto_b

    .line 234
    :cond_c
    invoke-virtual {v0}, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->b()D

    .line 235
    .line 236
    .line 237
    move-result-wide v13

    .line 238
    cmpg-double v8, p0, v11

    .line 239
    .line 240
    if-gtz v8, :cond_d

    .line 241
    .line 242
    cmpg-double v8, v11, v13

    .line 243
    .line 244
    if-gtz v8, :cond_d

    .line 245
    .line 246
    goto :goto_a

    .line 247
    :cond_d
    if-eqz v7, :cond_e

    .line 248
    .line 249
    invoke-virtual {v0}, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->b()D

    .line 250
    .line 251
    .line 252
    move-result-wide v7

    .line 253
    cmpl-double v7, v11, v7

    .line 254
    .line 255
    if-lez v7, :cond_e

    .line 256
    .line 257
    :goto_a
    move/from16 v24, v31

    .line 258
    .line 259
    goto :goto_c

    .line 260
    :cond_e
    :goto_b
    const/16 v24, 0x0

    .line 261
    .line 262
    goto :goto_c

    .line 263
    :cond_f
    iget-boolean v7, v0, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->k:Z

    .line 264
    .line 265
    move/from16 v24, v7

    .line 266
    .line 267
    :goto_c
    iget-boolean v7, v0, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->j:Z

    .line 268
    .line 269
    iget-boolean v8, v0, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->n:Z

    .line 270
    .line 271
    iget-boolean v10, v0, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->l:Z

    .line 272
    .line 273
    iget-object v13, v0, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->i:Lorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;

    .line 274
    .line 275
    iget-boolean v14, v13, Lorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;->a:Z

    .line 276
    .line 277
    if-eqz v14, :cond_10

    .line 278
    .line 279
    iget-boolean v14, v0, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->g:Z

    .line 280
    .line 281
    if-nez v14, :cond_10

    .line 282
    .line 283
    move/from16 v14, v31

    .line 284
    .line 285
    :goto_d
    move/from16 v19, v10

    .line 286
    .line 287
    goto :goto_e

    .line 288
    :cond_10
    const/4 v14, 0x0

    .line 289
    goto :goto_d

    .line 290
    :goto_e
    iget-wide v9, v13, Lorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;->b:D

    .line 291
    .line 292
    if-eqz v5, :cond_11

    .line 293
    .line 294
    const-wide/high16 v15, 0x4000000000000000L    # 2.0

    .line 295
    .line 296
    goto :goto_f

    .line 297
    :cond_11
    const-wide/high16 v15, 0x3ff0000000000000L    # 1.0

    .line 298
    .line 299
    :goto_f
    div-double/2addr v9, v15

    .line 300
    new-instance v13, Lorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;

    .line 301
    .line 302
    invoke-direct {v13, v9, v10, v14}, Lorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;-><init>(DZ)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v0}, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->b()D

    .line 306
    .line 307
    .line 308
    move-result-wide v9

    .line 309
    cmpg-double v14, p0, v11

    .line 310
    .line 311
    if-gtz v14, :cond_12

    .line 312
    .line 313
    cmpg-double v14, v11, v9

    .line 314
    .line 315
    if-gtz v14, :cond_12

    .line 316
    .line 317
    goto :goto_10

    .line 318
    :cond_12
    cmpg-double v14, v11, v25

    .line 319
    .line 320
    if-nez v14, :cond_13

    .line 321
    .line 322
    goto :goto_10

    .line 323
    :cond_13
    cmpl-double v9, v11, v9

    .line 324
    .line 325
    if-lez v9, :cond_14

    .line 326
    .line 327
    if-eqz v8, :cond_14

    .line 328
    .line 329
    :goto_10
    move/from16 v9, v31

    .line 330
    .line 331
    goto :goto_11

    .line 332
    :cond_14
    const/4 v9, 0x0

    .line 333
    :goto_11
    xor-int/lit8 v28, v9, 0x1

    .line 334
    .line 335
    iget-boolean v0, v0, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->p:Z

    .line 336
    .line 337
    if-eqz v5, :cond_15

    .line 338
    .line 339
    const/4 v5, 0x0

    .line 340
    new-array v9, v5, [Ljava/lang/Object;

    .line 341
    .line 342
    iget-object v3, v3, La/ctf0;->b:La/lsm0;

    .line 343
    .line 344
    invoke-static {v9, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v5

    .line 348
    const v9, 0x7f13084e

    .line 349
    .line 350
    .line 351
    invoke-virtual {v3, v9, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v3

    .line 355
    move-object/from16 v30, v3

    .line 356
    .line 357
    goto :goto_12

    .line 358
    :cond_15
    const/16 v30, 0x0

    .line 359
    .line 360
    :goto_12
    new-instance v17, La/bzj0;

    .line 361
    .line 362
    move/from16 v29, v0

    .line 363
    .line 364
    move/from16 v21, v6

    .line 365
    .line 366
    move/from16 v25, v7

    .line 367
    .line 368
    move/from16 v26, v8

    .line 369
    .line 370
    move-object/from16 v27, v13

    .line 371
    .line 372
    invoke-direct/range {v17 .. v30}, La/bzj0;-><init>(Ljava/lang/String;ZLa/ank0;ZZZZZZLorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;ZZLjava/lang/String;)V

    .line 373
    .line 374
    .line 375
    move-object/from16 v0, v17

    .line 376
    .line 377
    move/from16 v3, v31

    .line 378
    .line 379
    iput v3, v2, La/axj0;->j:I

    .line 380
    .line 381
    invoke-interface {v4, v0, v2}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    if-ne v0, v1, :cond_16

    .line 386
    .line 387
    move-object v8, v1

    .line 388
    goto :goto_14

    .line 389
    :cond_16
    :goto_13
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 390
    .line 391
    :goto_14
    return-object v8

    .line 392
    :pswitch_0
    instance-of v2, v1, La/twj0;

    .line 393
    .line 394
    if-eqz v2, :cond_17

    .line 395
    .line 396
    move-object v2, v1

    .line 397
    check-cast v2, La/twj0;

    .line 398
    .line 399
    iget v6, v2, La/twj0;->j:I

    .line 400
    .line 401
    and-int v8, v6, v7

    .line 402
    .line 403
    if-eqz v8, :cond_17

    .line 404
    .line 405
    sub-int/2addr v6, v7

    .line 406
    iput v6, v2, La/twj0;->j:I

    .line 407
    .line 408
    goto :goto_15

    .line 409
    :cond_17
    new-instance v2, La/twj0;

    .line 410
    .line 411
    invoke-direct {v2, v0, v1}, La/twj0;-><init>(La/uwj0;La/yje;)V

    .line 412
    .line 413
    .line 414
    :goto_15
    iget-object v0, v2, La/twj0;->i:Ljava/lang/Object;

    .line 415
    .line 416
    sget-object v1, La/wne;->a:La/wne;

    .line 417
    .line 418
    iget v6, v2, La/twj0;->j:I

    .line 419
    .line 420
    if-eqz v6, :cond_19

    .line 421
    .line 422
    const/4 v7, 0x1

    .line 423
    if-ne v6, v7, :cond_18

    .line 424
    .line 425
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 426
    .line 427
    .line 428
    goto :goto_16

    .line 429
    :cond_18
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    const/4 v8, 0x0

    .line 433
    goto :goto_17

    .line 434
    :cond_19
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    move-object/from16 v0, p1

    .line 438
    .line 439
    check-cast v0, La/a40;

    .line 440
    .line 441
    iget-object v3, v3, La/xxj0;->m:La/ctf0;

    .line 442
    .line 443
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 447
    .line 448
    .line 449
    new-instance v5, Ljava/util/ArrayList;

    .line 450
    .line 451
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 452
    .line 453
    .line 454
    new-instance v6, La/k1;

    .line 455
    .line 456
    const/16 v7, 0x14

    .line 457
    .line 458
    invoke-direct {v6, v3, v0, v7}, La/k1;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 459
    .line 460
    .line 461
    new-instance v0, La/bnk0;

    .line 462
    .line 463
    invoke-direct {v0}, La/bnk0;-><init>()V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v6, v0}, La/k1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    iget-object v0, v0, La/bnk0;->a:Ljava/util/ArrayList;

    .line 470
    .line 471
    invoke-static {v5, v0, v5}, La/w6x;->l(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)La/ank0;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    new-instance v3, La/i40;

    .line 476
    .line 477
    invoke-direct {v3, v0}, La/i40;-><init>(La/ank0;)V

    .line 478
    .line 479
    .line 480
    const/4 v7, 0x1

    .line 481
    iput v7, v2, La/twj0;->j:I

    .line 482
    .line 483
    invoke-interface {v4, v3, v2}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    if-ne v0, v1, :cond_1a

    .line 488
    .line 489
    move-object v8, v1

    .line 490
    goto :goto_17

    .line 491
    :cond_1a
    :goto_16
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 492
    .line 493
    :goto_17
    return-object v8

    .line 494
    nop

    .line 495
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
