.class public final La/wx4;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public synthetic l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/bs60;Ljava/lang/String;La/yje;)V
    .locals 1

    const/16 v0, 0x19

    iput-byte v0, p0, La/wx4;->i:B

    .line 16
    iput-object p1, p0, La/wx4;->j:Ljava/lang/Object;

    iput-object p2, p0, La/wx4;->k:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;La/yje;B)V
    .locals 0

    .line 15
    iput-byte p3, p0, La/wx4;->i:B

    iput-object p1, p0, La/wx4;->k:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(Lorg/xplatform/uikit/components/buttons/DsButton;Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;Lkotlin/jvm/functions/Function0;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    iput-byte v0, p0, La/wx4;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/wx4;->l:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/wx4;->j:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, La/wx4;->k:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 p1, 0x3

    .line 11
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private final G(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/wx4;->l:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;

    .line 6
    .line 7
    iget-object v2, v0, La/wx4;->j:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 10
    .line 11
    sget-object v3, La/wne;->a:La/wne;

    .line 12
    .line 13
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-wide v3, v2, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->e:D

    .line 23
    .line 24
    iget-wide v5, v2, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->d:D

    .line 25
    .line 26
    iget-wide v7, v2, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->a:D

    .line 27
    .line 28
    iget-boolean v9, v2, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->g:Z

    .line 29
    .line 30
    iget-object v0, v0, La/wx4;->k:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, La/h620;

    .line 33
    .line 34
    iget-object v10, v0, La/h620;->i:La/ctf0;

    .line 35
    .line 36
    iget-boolean v0, v0, La/h620;->b:Z

    .line 37
    .line 38
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iget-object v11, v1, Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;->a:Ljava/math/BigDecimal;

    .line 42
    .line 43
    invoke-virtual {v11}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v13

    .line 47
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iget-object v12, v1, Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;->d:Ljava/math/BigDecimal;

    .line 51
    .line 52
    iget-object v14, v1, Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;->e:Ljava/math/BigDecimal;

    .line 53
    .line 54
    new-instance v15, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    new-instance v16, La/bnk0;

    .line 60
    .line 61
    invoke-direct/range {v16 .. v16}, La/bnk0;-><init>()V

    .line 62
    .line 63
    .line 64
    move/from16 v23, v0

    .line 65
    .line 66
    iget-boolean v0, v1, Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;->h:Z

    .line 67
    .line 68
    if-eqz v0, :cond_1

    .line 69
    .line 70
    filled-new-array {v12}, [Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    move-wide/from16 v24, v3

    .line 75
    .line 76
    const v3, 0x7f130d20

    .line 77
    .line 78
    .line 79
    invoke-virtual {v10, v3, v0}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v17

    .line 83
    const/16 v21, 0x0

    .line 84
    .line 85
    const/16 v22, 0x36

    .line 86
    .line 87
    const/16 v18, 0x0

    .line 88
    .line 89
    const v19, 0x7f0606d0

    .line 90
    .line 91
    .line 92
    const/16 v20, 0x0

    .line 93
    .line 94
    invoke-static/range {v16 .. v22}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 95
    .line 96
    .line 97
    :cond_0
    :goto_0
    move-object/from16 v0, v16

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    move-wide/from16 v24, v3

    .line 101
    .line 102
    iget-boolean v0, v1, Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;->g:Z

    .line 103
    .line 104
    if-eqz v0, :cond_0

    .line 105
    .line 106
    sget-object v0, La/pn40;->a:La/pn40;

    .line 107
    .line 108
    invoke-static {v14}, La/pn40;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    const v3, 0x7f130cd4

    .line 117
    .line 118
    .line 119
    invoke-virtual {v10, v3, v0}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v17

    .line 123
    const/16 v21, 0x0

    .line 124
    .line 125
    const/16 v22, 0x36

    .line 126
    .line 127
    const/16 v18, 0x0

    .line 128
    .line 129
    const v19, 0x7f0606d0

    .line 130
    .line 131
    .line 132
    const/16 v20, 0x0

    .line 133
    .line 134
    invoke-static/range {v16 .. v22}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 135
    .line 136
    .line 137
    goto :goto_0

    .line 138
    :goto_1
    iget-object v0, v0, La/bnk0;->a:Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-static {v15, v0, v15}, La/w6x;->l(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)La/ank0;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v11, v14}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    const/4 v15, 0x1

    .line 149
    if-gez v3, :cond_2

    .line 150
    .line 151
    move v3, v15

    .line 152
    goto :goto_2

    .line 153
    :cond_2
    move v3, v15

    .line 154
    const/4 v15, 0x0

    .line 155
    :goto_2
    invoke-virtual {v11, v12}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 156
    .line 157
    .line 158
    move-result v16

    .line 159
    if-lez v16, :cond_3

    .line 160
    .line 161
    move/from16 v16, v3

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_3
    const/16 v16, 0x0

    .line 165
    .line 166
    :goto_3
    if-eqz v9, :cond_4

    .line 167
    .line 168
    cmpl-double v17, v7, v5

    .line 169
    .line 170
    if-ltz v17, :cond_4

    .line 171
    .line 172
    move/from16 v17, v3

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_4
    const/16 v17, 0x0

    .line 176
    .line 177
    :goto_4
    invoke-interface {v11, v12}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 178
    .line 179
    .line 180
    move-result v18

    .line 181
    if-ltz v18, :cond_5

    .line 182
    .line 183
    invoke-interface {v11, v14}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 184
    .line 185
    .line 186
    move-result v18

    .line 187
    if-gtz v18, :cond_5

    .line 188
    .line 189
    move/from16 v18, v3

    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_5
    const/16 v18, 0x0

    .line 193
    .line 194
    :goto_5
    cmpg-double v19, v5, v7

    .line 195
    .line 196
    const-wide/high16 v20, -0x4010000000000000L    # -1.0

    .line 197
    .line 198
    if-gtz v19, :cond_6

    .line 199
    .line 200
    cmpg-double v19, v7, v24

    .line 201
    .line 202
    if-gtz v19, :cond_6

    .line 203
    .line 204
    goto :goto_6

    .line 205
    :cond_6
    if-eqz v17, :cond_8

    .line 206
    .line 207
    :goto_6
    cmpg-double v17, v7, v20

    .line 208
    .line 209
    if-nez v17, :cond_7

    .line 210
    .line 211
    goto :goto_7

    .line 212
    :cond_7
    move/from16 v17, v3

    .line 213
    .line 214
    goto :goto_8

    .line 215
    :cond_8
    :goto_7
    const/16 v17, 0x0

    .line 216
    .line 217
    :goto_8
    if-eqz v18, :cond_9

    .line 218
    .line 219
    if-eqz v17, :cond_9

    .line 220
    .line 221
    move/from16 v17, v3

    .line 222
    .line 223
    goto :goto_9

    .line 224
    :cond_9
    const/16 v17, 0x0

    .line 225
    .line 226
    :goto_9
    cmpg-double v18, v7, v20

    .line 227
    .line 228
    if-nez v18, :cond_a

    .line 229
    .line 230
    const-string v18, ""

    .line 231
    .line 232
    move/from16 p0, v3

    .line 233
    .line 234
    :goto_a
    move-wide/from16 v32, v5

    .line 235
    .line 236
    goto :goto_b

    .line 237
    :cond_a
    sget-object v18, La/pn40;->a:La/pn40;

    .line 238
    .line 239
    move/from16 p0, v3

    .line 240
    .line 241
    sget-object v3, La/p3u0;->g:La/p3u0;

    .line 242
    .line 243
    invoke-static {v7, v8, v3}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v18

    .line 247
    goto :goto_a

    .line 248
    :goto_b
    iget-wide v4, v2, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->d:D

    .line 249
    .line 250
    move-wide/from16 v27, v4

    .line 251
    .line 252
    iget-wide v3, v2, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->e:D

    .line 253
    .line 254
    iget-object v5, v2, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->f:Ljava/lang/String;

    .line 255
    .line 256
    cmpg-double v6, v27, v7

    .line 257
    .line 258
    if-gtz v6, :cond_b

    .line 259
    .line 260
    cmpg-double v6, v7, v3

    .line 261
    .line 262
    if-gtz v6, :cond_b

    .line 263
    .line 264
    goto :goto_c

    .line 265
    :cond_b
    cmpg-double v6, v7, v20

    .line 266
    .line 267
    if-nez v6, :cond_e

    .line 268
    .line 269
    :goto_c
    if-eqz v23, :cond_c

    .line 270
    .line 271
    iget-boolean v6, v2, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->g:Z

    .line 272
    .line 273
    move-wide/from16 v30, v3

    .line 274
    .line 275
    move-object/from16 v29, v5

    .line 276
    .line 277
    move/from16 v26, v6

    .line 278
    .line 279
    invoke-static/range {v26 .. v31}, La/h8x;->r(ZDLjava/lang/String;D)La/ank0;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    move-object/from16 v19, v0

    .line 284
    .line 285
    move-wide/from16 v22, v7

    .line 286
    .line 287
    move/from16 v26, v9

    .line 288
    .line 289
    goto/16 :goto_f

    .line 290
    .line 291
    :cond_c
    move-object/from16 v19, v0

    .line 292
    .line 293
    move-object v0, v5

    .line 294
    move-wide/from16 v22, v7

    .line 295
    .line 296
    move-wide v5, v3

    .line 297
    move-wide/from16 v3, v27

    .line 298
    .line 299
    new-instance v7, Ljava/util/ArrayList;

    .line 300
    .line 301
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 302
    .line 303
    .line 304
    new-instance v8, Ljava/util/ArrayList;

    .line 305
    .line 306
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 307
    .line 308
    .line 309
    if-eqz v9, :cond_d

    .line 310
    .line 311
    sget-object v5, La/pn40;->a:La/pn40;

    .line 312
    .line 313
    sget-object v5, La/p3u0;->c:La/p3u0;

    .line 314
    .line 315
    invoke-static {v3, v4, v0, v5}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    const v3, 0x7f1316fe

    .line 324
    .line 325
    .line 326
    invoke-virtual {v10, v3, v0}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    move/from16 v26, v9

    .line 331
    .line 332
    :goto_d
    move-object/from16 v35, v0

    .line 333
    .line 334
    goto :goto_e

    .line 335
    :cond_d
    sget-object v26, La/pn40;->a:La/pn40;

    .line 336
    .line 337
    move/from16 v26, v9

    .line 338
    .line 339
    sget-object v9, La/p3u0;->c:La/p3u0;

    .line 340
    .line 341
    invoke-static {v3, v4, v0, v9}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v3

    .line 345
    invoke-static {v5, v6, v0, v9}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    filled-new-array {v3, v0}, [Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    const v3, 0x7f130d24

    .line 354
    .line 355
    .line 356
    invoke-virtual {v10, v3, v0}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    goto :goto_d

    .line 361
    :goto_e
    new-instance v34, La/zmk0;

    .line 362
    .line 363
    const/16 v36, -0x1

    .line 364
    .line 365
    const/high16 v37, -0x40800000    # -1.0f

    .line 366
    .line 367
    const/16 v38, -0x1

    .line 368
    .line 369
    const/16 v39, -0x1

    .line 370
    .line 371
    const v40, 0x7f040b0b

    .line 372
    .line 373
    .line 374
    invoke-direct/range {v34 .. v40}, La/zmk0;-><init>(Ljava/lang/String;IFIII)V

    .line 375
    .line 376
    .line 377
    move-object/from16 v0, v34

    .line 378
    .line 379
    invoke-static {v8, v0, v7, v8, v7}, La/axq;->d(Ljava/util/ArrayList;La/zmk0;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)La/ank0;

    .line 380
    .line 381
    .line 382
    move-result-object v3

    .line 383
    goto :goto_f

    .line 384
    :cond_e
    move-object/from16 v19, v0

    .line 385
    .line 386
    move-object v0, v5

    .line 387
    move-wide/from16 v22, v7

    .line 388
    .line 389
    move/from16 v26, v9

    .line 390
    .line 391
    move-wide v5, v3

    .line 392
    move-wide/from16 v3, v27

    .line 393
    .line 394
    cmpg-double v7, v22, v3

    .line 395
    .line 396
    if-gez v7, :cond_f

    .line 397
    .line 398
    invoke-static {v10, v3, v4, v0}, La/h8x;->u(La/ctf0;DLjava/lang/String;)La/ank0;

    .line 399
    .line 400
    .line 401
    move-result-object v3

    .line 402
    goto :goto_f

    .line 403
    :cond_f
    cmpl-double v3, v22, v5

    .line 404
    .line 405
    if-lez v3, :cond_10

    .line 406
    .line 407
    invoke-static {v10, v5, v6, v0}, La/h8x;->s(La/ctf0;DLjava/lang/String;)La/ank0;

    .line 408
    .line 409
    .line 410
    move-result-object v3

    .line 411
    goto :goto_f

    .line 412
    :cond_10
    new-instance v3, La/ank0;

    .line 413
    .line 414
    sget-object v0, La/iun;->a:La/iun;

    .line 415
    .line 416
    invoke-direct {v3, v0}, La/ank0;-><init>(Ljava/util/List;)V

    .line 417
    .line 418
    .line 419
    :goto_f
    iget-boolean v0, v2, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->m:Z

    .line 420
    .line 421
    iget-boolean v4, v1, Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;->f:Z

    .line 422
    .line 423
    sget-object v5, La/pn40;->a:La/pn40;

    .line 424
    .line 425
    invoke-virtual {v12}, Ljava/math/BigDecimal;->doubleValue()D

    .line 426
    .line 427
    .line 428
    move-result-wide v5

    .line 429
    sget-object v7, La/p3u0;->c:La/p3u0;

    .line 430
    .line 431
    invoke-static {v5, v6, v7}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v5

    .line 435
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v5

    .line 439
    const v6, 0x7f13023d

    .line 440
    .line 441
    .line 442
    invoke-virtual {v10, v6, v5}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v5

    .line 446
    iget-object v6, v2, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->i:Lorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;

    .line 447
    .line 448
    iget-boolean v7, v6, Lorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;->a:Z

    .line 449
    .line 450
    if-eqz v7, :cond_11

    .line 451
    .line 452
    if-nez v26, :cond_11

    .line 453
    .line 454
    move/from16 v7, p0

    .line 455
    .line 456
    goto :goto_10

    .line 457
    :cond_11
    const/4 v7, 0x0

    .line 458
    :goto_10
    iget-wide v8, v6, Lorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;->b:D

    .line 459
    .line 460
    new-instance v6, Lorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;

    .line 461
    .line 462
    invoke-direct {v6, v8, v9, v7}, Lorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;-><init>(DZ)V

    .line 463
    .line 464
    .line 465
    invoke-interface {v11, v12}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 466
    .line 467
    .line 468
    move-result v7

    .line 469
    if-ltz v7, :cond_12

    .line 470
    .line 471
    invoke-interface {v11, v14}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 472
    .line 473
    .line 474
    move-result v7

    .line 475
    if-gtz v7, :cond_12

    .line 476
    .line 477
    goto :goto_11

    .line 478
    :cond_12
    invoke-virtual {v11}, Ljava/math/BigDecimal;->doubleValue()D

    .line 479
    .line 480
    .line 481
    move-result-wide v7

    .line 482
    cmpg-double v7, v7, v20

    .line 483
    .line 484
    if-nez v7, :cond_13

    .line 485
    .line 486
    :goto_11
    move-wide/from16 v7, v24

    .line 487
    .line 488
    const/16 v24, 0x0

    .line 489
    .line 490
    goto :goto_12

    .line 491
    :cond_13
    move-wide/from16 v7, v24

    .line 492
    .line 493
    move/from16 v24, p0

    .line 494
    .line 495
    :goto_12
    cmpg-double v9, v32, v22

    .line 496
    .line 497
    if-gtz v9, :cond_14

    .line 498
    .line 499
    cmpg-double v7, v22, v7

    .line 500
    .line 501
    if-gtz v7, :cond_14

    .line 502
    .line 503
    goto :goto_13

    .line 504
    :cond_14
    cmpg-double v7, v22, v20

    .line 505
    .line 506
    if-nez v7, :cond_15

    .line 507
    .line 508
    :goto_13
    move/from16 v7, p0

    .line 509
    .line 510
    goto :goto_14

    .line 511
    :cond_15
    const/4 v7, 0x0

    .line 512
    :goto_14
    xor-int/lit8 v25, v7, 0x1

    .line 513
    .line 514
    invoke-virtual {v12}, Ljava/math/BigDecimal;->toString()Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v7

    .line 518
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v7

    .line 522
    const v8, 0x7f130a6d

    .line 523
    .line 524
    .line 525
    invoke-virtual {v10, v8, v7}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object v26

    .line 529
    iget-boolean v1, v1, Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;->g:Z

    .line 530
    .line 531
    iget-boolean v2, v2, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->q:Z

    .line 532
    .line 533
    new-instance v12, La/y05;

    .line 534
    .line 535
    move/from16 v21, v0

    .line 536
    .line 537
    move/from16 v27, v1

    .line 538
    .line 539
    move/from16 v28, v2

    .line 540
    .line 541
    move/from16 v20, v4

    .line 542
    .line 543
    move-object/from16 v22, v5

    .line 544
    .line 545
    move-object/from16 v23, v6

    .line 546
    .line 547
    move-object/from16 v14, v19

    .line 548
    .line 549
    move-object/from16 v19, v3

    .line 550
    .line 551
    invoke-direct/range {v12 .. v28}, La/y05;-><init>(Ljava/lang/String;La/ank0;ZZZLjava/lang/String;La/ank0;ZZLjava/lang/String;Lorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;ZZLjava/lang/String;ZZ)V

    .line 552
    .line 553
    .line 554
    return-object v12
.end method

.method private final H(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, La/wx4;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 4
    .line 5
    iget-object v1, p0, La/wx4;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La/ql5;

    .line 8
    .line 9
    sget-object v2, La/wne;->a:La/wne;

    .line 10
    .line 11
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/wx4;->k:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, La/h620;

    .line 17
    .line 18
    iget-object p0, p0, La/h620;->q0:La/p7m0;

    .line 19
    .line 20
    iget-wide v2, v0, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->a:D

    .line 21
    .line 22
    iget-wide v0, v1, La/ql5;->b:D

    .line 23
    .line 24
    cmpl-double p1, v2, v0

    .line 25
    .line 26
    if-gtz p1, :cond_1

    .line 27
    .line 28
    const-wide/16 v2, 0x0

    .line 29
    .line 30
    cmpg-double p1, v0, v2

    .line 31
    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    sget-object p1, La/bh5;->a:La/bh5;

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    :goto_0
    sget-object p1, La/xg5;->a:La/xg5;

    .line 39
    .line 40
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    invoke-virtual {p0, v0, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object p0
.end method

.method private final I(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, La/wx4;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lorg/xplatform/bet_constructor/impl/makebet/domain/model/StepInputConfigModel;

    .line 4
    .line 5
    iget-object v1, p0, La/wx4;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La/ql5;

    .line 8
    .line 9
    sget-object v2, La/wne;->a:La/wne;

    .line 10
    .line 11
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/wx4;->k:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, La/rg20;

    .line 17
    .line 18
    iget-object p0, p0, La/rg20;->H:La/p7m0;

    .line 19
    .line 20
    iget-wide v2, v0, Lorg/xplatform/bet_constructor/impl/makebet/domain/model/StepInputConfigModel;->a:D

    .line 21
    .line 22
    iget-wide v0, v1, La/ql5;->b:D

    .line 23
    .line 24
    cmpl-double p1, v2, v0

    .line 25
    .line 26
    if-gtz p1, :cond_1

    .line 27
    .line 28
    const-wide/16 v2, 0x0

    .line 29
    .line 30
    cmpg-double p1, v0, v2

    .line 31
    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    sget-object p1, La/jd20;->a:La/jd20;

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    :goto_0
    sget-object p1, La/id20;->a:La/id20;

    .line 39
    .line 40
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    invoke-virtual {p0, v0, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object p0
.end method

.method private final J(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, La/wx4;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 4
    .line 5
    iget-object v1, p0, La/wx4;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La/ql5;

    .line 8
    .line 9
    sget-object v2, La/wne;->a:La/wne;

    .line 10
    .line 11
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/wx4;->k:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, La/qg20;

    .line 17
    .line 18
    iget-object p0, p0, La/qg20;->s1:La/p7m0;

    .line 19
    .line 20
    iget-wide v2, v0, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->a:D

    .line 21
    .line 22
    iget-boolean p1, v0, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->r:Z

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 30
    .line 31
    :goto_0
    mul-double/2addr v4, v2

    .line 32
    iget-wide v0, v1, La/ql5;->b:D

    .line 33
    .line 34
    cmpl-double p1, v4, v0

    .line 35
    .line 36
    if-gtz p1, :cond_2

    .line 37
    .line 38
    const-wide/16 v2, 0x0

    .line 39
    .line 40
    cmpg-double p1, v0, v2

    .line 41
    .line 42
    if-nez p1, :cond_1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    sget-object p1, La/bh5;->a:La/bh5;

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    :goto_1
    sget-object p1, La/xg5;->a:La/xg5;

    .line 49
    .line 50
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    invoke-virtual {p0, v0, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object p0
.end method

.method private final K(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, La/wx4;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    iget-object v1, p0, La/wx4;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/List;

    .line 8
    .line 9
    sget-object v2, La/wne;->a:La/wne;

    .line 10
    .line 11
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    sget-object v0, La/iun;->a:La/iun;

    .line 17
    .line 18
    :cond_0
    invoke-static {v1, v0}, Lkotlin/collections/CollectionsKt;->n0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object p0, p0, La/wx4;->k:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, La/d650;

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_10

    .line 35
    .line 36
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, La/ef40;

    .line 41
    .line 42
    sget v2, La/d650;->k1:I

    .line 43
    .line 44
    invoke-interface {v0}, La/ef40;->getState()La/vbj;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    instance-of v2, v2, La/ubj;

    .line 49
    .line 50
    if-nez v2, :cond_1

    .line 51
    .line 52
    invoke-interface {v0}, La/ef40;->getState()La/vbj;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    instance-of v2, v2, La/pbj;

    .line 57
    .line 58
    if-nez v2, :cond_1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    instance-of v2, v0, La/me40;

    .line 62
    .line 63
    if-eqz v2, :cond_2

    .line 64
    .line 65
    check-cast v0, La/me40;

    .line 66
    .line 67
    invoke-virtual {v0}, La/me40;->getKey()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {p0, v0}, La/d650;->V(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    instance-of v2, v0, La/oe40;

    .line 76
    .line 77
    if-eqz v2, :cond_3

    .line 78
    .line 79
    invoke-interface {v0}, La/ef40;->getKey()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {p0, v0}, La/d650;->W(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    instance-of v2, v0, La/ye40;

    .line 88
    .line 89
    if-eqz v2, :cond_4

    .line 90
    .line 91
    invoke-interface {v0}, La/ef40;->getKey()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {p0, v0}, La/d650;->O(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_4
    instance-of v2, v0, La/xe40;

    .line 100
    .line 101
    if-eqz v2, :cond_5

    .line 102
    .line 103
    invoke-interface {v0}, La/ef40;->getKey()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {p0, v0}, La/d650;->N(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_5
    instance-of v2, v0, La/ze40;

    .line 112
    .line 113
    if-eqz v2, :cond_6

    .line 114
    .line 115
    invoke-virtual {p0}, La/d650;->Q()V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_6
    instance-of v2, v0, La/re40;

    .line 120
    .line 121
    if-eqz v2, :cond_8

    .line 122
    .line 123
    iget-object v0, p0, La/d650;->r0:La/iqt;

    .line 124
    .line 125
    iget-object v0, v0, La/iqt;->a:La/gst0;

    .line 126
    .line 127
    invoke-virtual {v0}, La/gst0;->a()Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_7

    .line 132
    .line 133
    invoke-virtual {p0}, La/d650;->P()V

    .line 134
    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_7
    invoke-virtual {p0}, La/d650;->Q()V

    .line 138
    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_8
    instance-of v2, v0, La/af40;

    .line 142
    .line 143
    if-eqz v2, :cond_9

    .line 144
    .line 145
    invoke-interface {v0}, La/ef40;->getKey()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-virtual {p0, v0}, La/d650;->R(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_9
    instance-of v2, v0, La/qe40;

    .line 154
    .line 155
    if-eqz v2, :cond_a

    .line 156
    .line 157
    check-cast v0, La/qe40;

    .line 158
    .line 159
    invoke-virtual {v0}, La/qe40;->getKey()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    iget-object v0, v0, La/qe40;->a:La/x4t;

    .line 164
    .line 165
    const/4 v3, 0x1

    .line 166
    invoke-virtual {p0, v2, v0, v3}, La/d650;->J(Ljava/lang/String;La/x4t;Z)V

    .line 167
    .line 168
    .line 169
    goto/16 :goto_0

    .line 170
    .line 171
    :cond_a
    instance-of v2, v0, La/te40;

    .line 172
    .line 173
    if-eqz v2, :cond_b

    .line 174
    .line 175
    invoke-interface {v0}, La/ef40;->getKey()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-virtual {p0, v0}, La/d650;->L(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :cond_b
    instance-of v2, v0, La/we40;

    .line 185
    .line 186
    if-eqz v2, :cond_c

    .line 187
    .line 188
    invoke-interface {v0}, La/ef40;->getKey()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-virtual {p0, v0}, La/d650;->M(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    goto/16 :goto_0

    .line 196
    .line 197
    :cond_c
    instance-of v2, v0, La/cf40;

    .line 198
    .line 199
    if-eqz v2, :cond_d

    .line 200
    .line 201
    invoke-interface {v0}, La/ef40;->getKey()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-virtual {p0, v0}, La/d650;->T(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    goto/16 :goto_0

    .line 209
    .line 210
    :cond_d
    instance-of v2, v0, La/se40;

    .line 211
    .line 212
    if-eqz v2, :cond_e

    .line 213
    .line 214
    invoke-interface {v0}, La/ef40;->getKey()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-virtual {p0, v0}, La/d650;->K(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    goto/16 :goto_0

    .line 222
    .line 223
    :cond_e
    instance-of v2, v0, La/bf40;

    .line 224
    .line 225
    if-eqz v2, :cond_f

    .line 226
    .line 227
    invoke-interface {v0}, La/ef40;->getKey()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-virtual {p0, v0}, La/d650;->S(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    goto/16 :goto_0

    .line 235
    .line 236
    :cond_f
    invoke-static {}, La/t9f;->b()V

    .line 237
    .line 238
    .line 239
    const/4 p0, 0x0

    .line 240
    return-object p0

    .line 241
    :cond_10
    return-object v1
.end method

.method private final L(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/wx4;->l:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/lang/Throwable;

    .line 6
    .line 7
    sget-object v2, La/wne;->a:La/wne;

    .line 8
    .line 9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v2, v0, La/wx4;->j:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, La/bs60;

    .line 15
    .line 16
    sget v3, La/bs60;->h0:I

    .line 17
    .line 18
    iget-object v3, v2, La/i3t0;->i:La/ocj;

    .line 19
    .line 20
    iget-object v3, v3, La/ocj;->a:La/p7m0;

    .line 21
    .line 22
    :cond_0
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-object v5, v4

    .line 30
    check-cast v5, La/w370;

    .line 31
    .line 32
    const/16 v16, 0x0

    .line 33
    .line 34
    const/16 v17, 0x3ffe

    .line 35
    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v7, 0x0

    .line 38
    const/4 v8, 0x0

    .line 39
    const/4 v9, 0x0

    .line 40
    const/4 v10, 0x0

    .line 41
    const/4 v11, 0x0

    .line 42
    const/4 v12, 0x0

    .line 43
    const/4 v13, 0x0

    .line 44
    const/4 v14, 0x0

    .line 45
    const/4 v15, 0x0

    .line 46
    invoke-static/range {v5 .. v17}, La/w370;->a(La/w370;ZZLa/mdm;La/rc50;La/zm5;La/tdt;La/f3b;ZZZZI)La/w370;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-virtual {v3, v4, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_0

    .line 55
    .line 56
    iget-object v0, v0, La/wx4;->k:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v2, v0}, La/bs60;->X(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_2

    .line 65
    .line 66
    iget-object v1, v2, La/bs60;->e0:La/u270;

    .line 67
    .line 68
    invoke-virtual {v2, v0}, La/bs60;->M(Ljava/lang/String;)La/u270;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_1

    .line 77
    .line 78
    const/4 v0, 0x0

    .line 79
    iput-object v0, v2, La/bs60;->e0:La/u270;

    .line 80
    .line 81
    :cond_1
    invoke-virtual {v2}, La/bs60;->Y()V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_2
    invoke-virtual {v2, v1}, La/bs60;->P(Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    return-object v0
.end method

.method private final M(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, La/wx4;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, La/rjt;

    .line 9
    .line 10
    iget-object v0, p0, La/wx4;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, La/rjt;

    .line 13
    .line 14
    iget-object p0, p0, La/wx4;->k:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, La/gp00;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget v1, v0, La/rjt;->a:I

    .line 25
    .line 26
    iget v2, p1, La/rjt;->a:I

    .line 27
    .line 28
    if-le v1, v2, :cond_0

    .line 29
    .line 30
    const/4 p0, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    if-ge v1, v2, :cond_1

    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    iget-object v1, v0, La/rjt;->b:La/vmu0;

    .line 37
    .line 38
    iget-object v2, p1, La/rjt;->b:La/vmu0;

    .line 39
    .line 40
    invoke-static {v1, v2, p0}, La/qcc;->e0(La/vmu0;La/vmu0;La/gp00;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    :goto_0
    if-eqz p0, :cond_2

    .line 45
    .line 46
    return-object v0

    .line 47
    :cond_2
    return-object p1
.end method

.method private final Q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, La/wx4;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/wj80;

    .line 4
    .line 5
    iget-object p0, p0, La/wx4;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/util/List;

    .line 8
    .line 9
    sget-object v1, La/wne;->a:La/wne;

    .line 10
    .line 11
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0, p0}, La/fk80;->e(La/wj80;Ljava/util/List;)La/cm80;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method private final R(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, La/wx4;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    iget-object p0, p0, La/wx4;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    sget-object v1, La/wne;->a:La/wne;

    .line 10
    .line 11
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-lez p1, :cond_9

    .line 19
    .line 20
    new-instance p1, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_8

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    move-object v2, v1

    .line 40
    check-cast v2, La/nq90;

    .line 41
    .line 42
    invoke-interface {v2}, La/nq90;->getTitle()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    const/4 v4, 0x1

    .line 47
    invoke-static {v3, p0, v4}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-nez v3, :cond_7

    .line 52
    .line 53
    instance-of v3, v2, La/gq90;

    .line 54
    .line 55
    const/4 v5, 0x0

    .line 56
    if-eqz v3, :cond_1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    instance-of v6, v2, La/kq90;

    .line 60
    .line 61
    if-eqz v6, :cond_5

    .line 62
    .line 63
    :goto_1
    if-eqz v3, :cond_2

    .line 64
    .line 65
    move-object v3, v2

    .line 66
    check-cast v3, La/gq90;

    .line 67
    .line 68
    iget-object v3, v3, La/gq90;->f:Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {v3, p0, v4}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-nez v3, :cond_4

    .line 75
    .line 76
    :cond_2
    instance-of v3, v2, La/kq90;

    .line 77
    .line 78
    if-eqz v3, :cond_3

    .line 79
    .line 80
    check-cast v2, La/kq90;

    .line 81
    .line 82
    iget-object v2, v2, La/kq90;->g:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {v2, p0, v4}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_3

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_3
    move v4, v5

    .line 92
    :cond_4
    :goto_2
    move v5, v4

    .line 93
    goto :goto_3

    .line 94
    :cond_5
    instance-of v3, v2, La/hq90;

    .line 95
    .line 96
    if-eqz v3, :cond_6

    .line 97
    .line 98
    check-cast v2, La/hq90;

    .line 99
    .line 100
    iget-object v2, v2, La/hq90;->d:Ljava/lang/String;

    .line 101
    .line 102
    invoke-static {v2, p0, v4}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    :cond_6
    :goto_3
    if-eqz v5, :cond_0

    .line 107
    .line 108
    :cond_7
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_8
    return-object p1

    .line 113
    :cond_9
    return-object v0
.end method

.method private final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-object v0, p0, La/wx4;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/xvm0;

    .line 4
    .line 5
    iget-object v1, p0, La/wx4;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La/js20;

    .line 8
    .line 9
    sget-object v2, La/wne;->a:La/wne;

    .line 10
    .line 11
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/wx4;->k:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v2, p0

    .line 17
    check-cast v2, La/k4s;

    .line 18
    .line 19
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, La/z2s;

    .line 24
    .line 25
    iget-wide v4, p0, La/z2s;->a:J

    .line 26
    .line 27
    iget-wide v7, p0, La/z2s;->e:J

    .line 28
    .line 29
    iget-object v6, p0, La/z2s;->i:La/t3z;

    .line 30
    .line 31
    new-instance v3, La/u3z;

    .line 32
    .line 33
    invoke-direct/range {v3 .. v8}, La/u3z;-><init>(JLa/t3z;J)V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    if-eqz v1, :cond_f

    .line 38
    .line 39
    instance-of p1, v1, La/gs20;

    .line 40
    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    instance-of v4, v1, La/hs20;

    .line 45
    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    :goto_0
    move-object v9, p0

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    instance-of v4, v1, La/is20;

    .line 51
    .line 52
    if-eqz v4, :cond_f

    .line 53
    .line 54
    move-object v4, v1

    .line 55
    check-cast v4, La/is20;

    .line 56
    .line 57
    iget-wide v4, v4, La/is20;->a:J

    .line 58
    .line 59
    new-instance v9, Ljava/lang/Long;

    .line 60
    .line 61
    invoke-direct {v9, v4, v5}, Ljava/lang/Long;-><init>(J)V

    .line 62
    .line 63
    .line 64
    :goto_1
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    check-cast v4, La/z2s;

    .line 69
    .line 70
    iget-object v4, v4, La/z2s;->J:La/xvm0;

    .line 71
    .line 72
    if-eqz v4, :cond_d

    .line 73
    .line 74
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    check-cast v4, La/z2s;

    .line 79
    .line 80
    iget-object v4, v4, La/z2s;->K:La/js20;

    .line 81
    .line 82
    if-nez v4, :cond_2

    .line 83
    .line 84
    goto/16 :goto_4

    .line 85
    .line 86
    :cond_2
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    check-cast v4, La/z2s;

    .line 91
    .line 92
    iget-object v4, v4, La/z2s;->g:Ljava/lang/Long;

    .line 93
    .line 94
    invoke-static {v9, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    const/4 v5, 0x1

    .line 99
    if-nez v4, :cond_6

    .line 100
    .line 101
    new-instance v0, La/j7b;

    .line 102
    .line 103
    invoke-direct {v0, v1, v5}, La/j7b;-><init>(La/js20;B)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, La/z2s;

    .line 114
    .line 115
    iget-wide v4, v0, La/z2s;->a:J

    .line 116
    .line 117
    iget-wide v7, v0, La/z2s;->e:J

    .line 118
    .line 119
    iget-object v6, v0, La/z2s;->i:La/t3z;

    .line 120
    .line 121
    new-instance v3, La/u3z;

    .line 122
    .line 123
    invoke-direct/range {v3 .. v8}, La/u3z;-><init>(JLa/t3z;J)V

    .line 124
    .line 125
    .line 126
    if-eqz p1, :cond_3

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_3
    instance-of p1, v1, La/hs20;

    .line 130
    .line 131
    if-eqz p1, :cond_4

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_4
    instance-of p1, v1, La/is20;

    .line 135
    .line 136
    if-eqz p1, :cond_5

    .line 137
    .line 138
    check-cast v1, La/is20;

    .line 139
    .line 140
    iget-wide p0, v1, La/is20;->a:J

    .line 141
    .line 142
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    :goto_2
    invoke-virtual {v2, v3, p0}, La/k4s;->N(La/u3z;Ljava/lang/Long;)V

    .line 147
    .line 148
    .line 149
    goto/16 :goto_5

    .line 150
    .line 151
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 152
    .line 153
    .line 154
    return-object p0

    .line 155
    :cond_6
    invoke-interface {v0}, La/xvm0;->getId()J

    .line 156
    .line 157
    .line 158
    move-result-wide v10

    .line 159
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    check-cast p1, La/z2s;

    .line 164
    .line 165
    iget-wide v12, p1, La/z2s;->f:J

    .line 166
    .line 167
    cmp-long p1, v10, v12

    .line 168
    .line 169
    if-eqz p1, :cond_e

    .line 170
    .line 171
    if-nez v9, :cond_c

    .line 172
    .line 173
    new-instance p1, La/s7b;

    .line 174
    .line 175
    invoke-direct {p1, v0, v5}, La/s7b;-><init>(La/xvm0;B)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 179
    .line 180
    .line 181
    instance-of p1, v0, La/tvm0;

    .line 182
    .line 183
    if-eqz p1, :cond_8

    .line 184
    .line 185
    iget-object p1, v2, La/k4s;->X:La/c4m0;

    .line 186
    .line 187
    if-eqz p1, :cond_7

    .line 188
    .line 189
    invoke-virtual {p1, p0}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 190
    .line 191
    .line 192
    :cond_7
    check-cast v0, La/tvm0;

    .line 193
    .line 194
    iget-wide v0, v0, La/tvm0;->a:J

    .line 195
    .line 196
    invoke-static {v3, v0, v1}, La/u3z;->a(La/u3z;J)La/u3z;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    invoke-virtual {v2, p1, p0}, La/k4s;->N(La/u3z;Ljava/lang/Long;)V

    .line 201
    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_8
    instance-of p1, v0, La/svm0;

    .line 205
    .line 206
    if-eqz p1, :cond_9

    .line 207
    .line 208
    check-cast v0, La/svm0;

    .line 209
    .line 210
    iget-wide v0, v0, La/svm0;->b:J

    .line 211
    .line 212
    invoke-virtual {v2, v7, v8, v0, v1}, La/k4s;->O(JJ)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v2, v3, p0}, La/k4s;->N(La/u3z;Ljava/lang/Long;)V

    .line 216
    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_9
    iget-object p1, v2, La/k4s;->X:La/c4m0;

    .line 220
    .line 221
    if-eqz p1, :cond_a

    .line 222
    .line 223
    invoke-virtual {p1, p0}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 224
    .line 225
    .line 226
    :cond_a
    invoke-interface {v0}, La/xvm0;->getId()J

    .line 227
    .line 228
    .line 229
    move-result-wide v3

    .line 230
    move p1, v5

    .line 231
    move-object p0, v6

    .line 232
    invoke-interface {v0}, La/xvm0;->a()J

    .line 233
    .line 234
    .line 235
    move-result-wide v5

    .line 236
    sget-object v0, La/t3z;->c:La/t3z;

    .line 237
    .line 238
    if-ne p0, v0, :cond_b

    .line 239
    .line 240
    move v9, p1

    .line 241
    goto :goto_3

    .line 242
    :cond_b
    const/4 p0, 0x0

    .line 243
    move v9, p0

    .line 244
    :goto_3
    iget-object p0, v2, La/k4s;->V:La/sff0;

    .line 245
    .line 246
    iget-boolean v10, p0, La/sff0;->D0:Z

    .line 247
    .line 248
    invoke-virtual/range {v2 .. v10}, La/k4s;->P(JJJZZ)V

    .line 249
    .line 250
    .line 251
    goto :goto_5

    .line 252
    :cond_c
    new-instance p0, La/s7b;

    .line 253
    .line 254
    const/4 p1, 0x2

    .line 255
    invoke-direct {p0, v0, p1}, La/s7b;-><init>(La/xvm0;B)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2, p0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 259
    .line 260
    .line 261
    goto :goto_5

    .line 262
    :cond_d
    :goto_4
    new-instance p0, La/gup;

    .line 263
    .line 264
    const/16 p1, 0x19

    .line 265
    .line 266
    invoke-direct {p0, v0, v1, p1}, La/gup;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v2, p0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 270
    .line 271
    .line 272
    :cond_e
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 273
    .line 274
    return-object p0

    .line 275
    :cond_f
    invoke-static {}, La/t9f;->b()V

    .line 276
    .line 277
    .line 278
    return-object p0
.end method

.method private final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-object v0, p0, La/wx4;->l:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v2, v0

    .line 4
    check-cast v2, La/xvm0;

    .line 5
    .line 6
    iget-object v0, p0, La/wx4;->j:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v3, v0

    .line 9
    check-cast v3, La/js20;

    .line 10
    .line 11
    sget-object v0, La/wne;->a:La/wne;

    .line 12
    .line 13
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, La/wx4;->k:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v4, p0

    .line 19
    check-cast v4, La/g9s;

    .line 20
    .line 21
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/r7s;

    .line 26
    .line 27
    iget-wide v6, p0, La/r7s;->a:J

    .line 28
    .line 29
    iget-wide v9, p0, La/r7s;->e:J

    .line 30
    .line 31
    iget-object v8, p0, La/r7s;->h:La/t3z;

    .line 32
    .line 33
    new-instance v5, La/u3z;

    .line 34
    .line 35
    invoke-direct/range {v5 .. v10}, La/u3z;-><init>(JLa/t3z;J)V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    if-eqz v3, :cond_f

    .line 40
    .line 41
    instance-of p1, v3, La/gs20;

    .line 42
    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    instance-of v0, v3, La/hs20;

    .line 47
    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    :goto_0
    move-object v6, p0

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    instance-of v0, v3, La/is20;

    .line 53
    .line 54
    if-eqz v0, :cond_f

    .line 55
    .line 56
    move-object v0, v3

    .line 57
    check-cast v0, La/is20;

    .line 58
    .line 59
    iget-wide v0, v0, La/is20;->a:J

    .line 60
    .line 61
    new-instance v6, Ljava/lang/Long;

    .line 62
    .line 63
    invoke-direct {v6, v0, v1}, Ljava/lang/Long;-><init>(J)V

    .line 64
    .line 65
    .line 66
    :goto_1
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, La/r7s;

    .line 71
    .line 72
    iget-object v0, v0, La/r7s;->P:La/xvm0;

    .line 73
    .line 74
    if-eqz v0, :cond_d

    .line 75
    .line 76
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, La/r7s;

    .line 81
    .line 82
    iget-object v0, v0, La/r7s;->Q:La/js20;

    .line 83
    .line 84
    if-nez v0, :cond_2

    .line 85
    .line 86
    goto/16 :goto_4

    .line 87
    .line 88
    :cond_2
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, La/r7s;

    .line 93
    .line 94
    iget-object v0, v0, La/r7s;->R:Ljava/lang/Long;

    .line 95
    .line 96
    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-nez v0, :cond_6

    .line 101
    .line 102
    new-instance v0, La/gup;

    .line 103
    .line 104
    const/16 v1, 0x1c

    .line 105
    .line 106
    invoke-direct {v0, v3, v4, v1}, La/gup;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v4, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    check-cast v0, La/r7s;

    .line 117
    .line 118
    iget-wide v6, v0, La/r7s;->a:J

    .line 119
    .line 120
    iget-wide v9, v0, La/r7s;->e:J

    .line 121
    .line 122
    iget-object v8, v0, La/r7s;->h:La/t3z;

    .line 123
    .line 124
    new-instance v5, La/u3z;

    .line 125
    .line 126
    invoke-direct/range {v5 .. v10}, La/u3z;-><init>(JLa/t3z;J)V

    .line 127
    .line 128
    .line 129
    if-eqz p1, :cond_3

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_3
    instance-of p1, v3, La/hs20;

    .line 133
    .line 134
    if-eqz p1, :cond_4

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_4
    instance-of p1, v3, La/is20;

    .line 138
    .line 139
    if-eqz p1, :cond_5

    .line 140
    .line 141
    check-cast v3, La/is20;

    .line 142
    .line 143
    iget-wide p0, v3, La/is20;->a:J

    .line 144
    .line 145
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    :goto_2
    invoke-virtual {v4, v5, p0}, La/g9s;->O(La/u3z;Ljava/lang/Long;)V

    .line 150
    .line 151
    .line 152
    goto/16 :goto_5

    .line 153
    .line 154
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 155
    .line 156
    .line 157
    return-object p0

    .line 158
    :cond_6
    invoke-interface {v2}, La/xvm0;->getId()J

    .line 159
    .line 160
    .line 161
    move-result-wide v0

    .line 162
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    check-cast p1, La/r7s;

    .line 167
    .line 168
    iget-wide v11, p1, La/r7s;->f:J

    .line 169
    .line 170
    cmp-long p1, v0, v11

    .line 171
    .line 172
    if-eqz p1, :cond_e

    .line 173
    .line 174
    const/4 p1, 0x1

    .line 175
    if-nez v6, :cond_c

    .line 176
    .line 177
    new-instance v0, La/d8s;

    .line 178
    .line 179
    const/4 v1, 0x0

    .line 180
    invoke-direct {v0, v2, v4, v1}, La/d8s;-><init>(La/xvm0;La/g9s;B)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v4, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 184
    .line 185
    .line 186
    instance-of v0, v2, La/tvm0;

    .line 187
    .line 188
    if-eqz v0, :cond_8

    .line 189
    .line 190
    iget-object p1, v4, La/g9s;->m0:La/bby;

    .line 191
    .line 192
    if-eqz p1, :cond_7

    .line 193
    .line 194
    invoke-interface {p1, p0}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 195
    .line 196
    .line 197
    :cond_7
    invoke-virtual {v4, v5, p0}, La/g9s;->O(La/u3z;Ljava/lang/Long;)V

    .line 198
    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_8
    instance-of v0, v2, La/svm0;

    .line 202
    .line 203
    if-eqz v0, :cond_9

    .line 204
    .line 205
    check-cast v2, La/svm0;

    .line 206
    .line 207
    iget-wide v0, v2, La/svm0;->b:J

    .line 208
    .line 209
    invoke-virtual {v4, v9, v10, v0, v1}, La/g9s;->P(JJ)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v4, v5, p0}, La/g9s;->O(La/u3z;Ljava/lang/Long;)V

    .line 213
    .line 214
    .line 215
    goto :goto_5

    .line 216
    :cond_9
    iget-object v0, v4, La/g9s;->m0:La/bby;

    .line 217
    .line 218
    if-eqz v0, :cond_a

    .line 219
    .line 220
    invoke-interface {v0, p0}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 221
    .line 222
    .line 223
    :cond_a
    invoke-interface {v2}, La/xvm0;->getId()J

    .line 224
    .line 225
    .line 226
    move-result-wide v5

    .line 227
    move-object p0, v8

    .line 228
    invoke-interface {v2}, La/xvm0;->a()J

    .line 229
    .line 230
    .line 231
    move-result-wide v7

    .line 232
    sget-object v0, La/t3z;->c:La/t3z;

    .line 233
    .line 234
    if-ne p0, v0, :cond_b

    .line 235
    .line 236
    move v11, p1

    .line 237
    goto :goto_3

    .line 238
    :cond_b
    move v11, v1

    .line 239
    :goto_3
    invoke-virtual {v4}, La/g9s;->M()La/sff0;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    iget-boolean v12, p0, La/sff0;->D0:Z

    .line 244
    .line 245
    invoke-virtual/range {v4 .. v12}, La/g9s;->Q(JJJZZ)V

    .line 246
    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_c
    new-instance p0, La/d8s;

    .line 250
    .line 251
    invoke-direct {p0, v2, v4, p1}, La/d8s;-><init>(La/xvm0;La/g9s;B)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v4, p0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 255
    .line 256
    .line 257
    goto :goto_5

    .line 258
    :cond_d
    :goto_4
    new-instance v1, La/cbr;

    .line 259
    .line 260
    move-object v5, v4

    .line 261
    move-object v4, v6

    .line 262
    const/4 v6, 0x2

    .line 263
    invoke-direct/range {v1 .. v6}, La/cbr;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 264
    .line 265
    .line 266
    move-object v4, v5

    .line 267
    invoke-virtual {v4, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 268
    .line 269
    .line 270
    :cond_e
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 271
    .line 272
    return-object p0

    .line 273
    :cond_f
    invoke-static {}, La/t9f;->b()V

    .line 274
    .line 275
    .line 276
    return-object p0
.end method

.method private final o(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/wx4;->l:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v3, v1

    .line 6
    check-cast v3, La/xvm0;

    .line 7
    .line 8
    iget-object v1, v0, La/wx4;->j:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v4, v1

    .line 11
    check-cast v4, La/js20;

    .line 12
    .line 13
    sget-object v1, La/wne;->a:La/wne;

    .line 14
    .line 15
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, v0, La/wx4;->k:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v5, v0

    .line 21
    check-cast v5, La/yks;

    .line 22
    .line 23
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, La/njs;

    .line 28
    .line 29
    iget-wide v7, v0, La/njs;->a:J

    .line 30
    .line 31
    iget-wide v10, v0, La/njs;->e:J

    .line 32
    .line 33
    iget-object v9, v0, La/njs;->h:La/t3z;

    .line 34
    .line 35
    new-instance v6, La/u3z;

    .line 36
    .line 37
    invoke-direct/range {v6 .. v11}, La/u3z;-><init>(JLa/t3z;J)V

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    if-eqz v4, :cond_f

    .line 42
    .line 43
    instance-of v1, v4, La/gs20;

    .line 44
    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    instance-of v2, v4, La/hs20;

    .line 49
    .line 50
    if-eqz v2, :cond_1

    .line 51
    .line 52
    :goto_0
    move-object v2, v0

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    instance-of v2, v4, La/is20;

    .line 55
    .line 56
    if-eqz v2, :cond_f

    .line 57
    .line 58
    move-object v2, v4

    .line 59
    check-cast v2, La/is20;

    .line 60
    .line 61
    iget-wide v7, v2, La/is20;->a:J

    .line 62
    .line 63
    new-instance v2, Ljava/lang/Long;

    .line 64
    .line 65
    invoke-direct {v2, v7, v8}, Ljava/lang/Long;-><init>(J)V

    .line 66
    .line 67
    .line 68
    :goto_1
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    check-cast v7, La/njs;

    .line 73
    .line 74
    iget-object v7, v7, La/njs;->M:La/xvm0;

    .line 75
    .line 76
    if-eqz v7, :cond_2

    .line 77
    .line 78
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    check-cast v7, La/njs;

    .line 83
    .line 84
    iget-object v7, v7, La/njs;->N:La/js20;

    .line 85
    .line 86
    if-nez v7, :cond_3

    .line 87
    .line 88
    :cond_2
    move-object v6, v5

    .line 89
    move-object v5, v2

    .line 90
    goto/16 :goto_4

    .line 91
    .line 92
    :cond_3
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    check-cast v7, La/njs;

    .line 97
    .line 98
    iget-object v7, v7, La/njs;->O:Ljava/lang/Long;

    .line 99
    .line 100
    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    const/4 v8, 0x1

    .line 105
    if-nez v7, :cond_7

    .line 106
    .line 107
    new-instance v2, La/sjs;

    .line 108
    .line 109
    invoke-direct {v2, v4, v5, v8}, La/sjs;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v5, v2}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    check-cast v2, La/njs;

    .line 120
    .line 121
    iget-wide v7, v2, La/njs;->a:J

    .line 122
    .line 123
    iget-wide v10, v2, La/njs;->e:J

    .line 124
    .line 125
    iget-object v9, v2, La/njs;->h:La/t3z;

    .line 126
    .line 127
    new-instance v6, La/u3z;

    .line 128
    .line 129
    invoke-direct/range {v6 .. v11}, La/u3z;-><init>(JLa/t3z;J)V

    .line 130
    .line 131
    .line 132
    if-eqz v1, :cond_4

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_4
    instance-of v1, v4, La/hs20;

    .line 136
    .line 137
    if-eqz v1, :cond_5

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_5
    instance-of v1, v4, La/is20;

    .line 141
    .line 142
    if-eqz v1, :cond_6

    .line 143
    .line 144
    check-cast v4, La/is20;

    .line 145
    .line 146
    iget-wide v0, v4, La/is20;->a:J

    .line 147
    .line 148
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    :goto_2
    invoke-virtual {v5, v6, v0}, La/yks;->N(La/u3z;Ljava/lang/Long;)V

    .line 153
    .line 154
    .line 155
    goto/16 :goto_5

    .line 156
    .line 157
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 158
    .line 159
    .line 160
    return-object v0

    .line 161
    :cond_7
    invoke-interface {v3}, La/xvm0;->getId()J

    .line 162
    .line 163
    .line 164
    move-result-wide v12

    .line 165
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    check-cast v1, La/njs;

    .line 170
    .line 171
    iget-wide v14, v1, La/njs;->f:J

    .line 172
    .line 173
    cmp-long v1, v12, v14

    .line 174
    .line 175
    if-eqz v1, :cond_e

    .line 176
    .line 177
    if-nez v2, :cond_d

    .line 178
    .line 179
    new-instance v1, La/ujs;

    .line 180
    .line 181
    const/4 v2, 0x0

    .line 182
    invoke-direct {v1, v3, v5, v2}, La/ujs;-><init>(La/xvm0;La/yks;B)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v5, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 186
    .line 187
    .line 188
    instance-of v1, v3, La/tvm0;

    .line 189
    .line 190
    if-eqz v1, :cond_9

    .line 191
    .line 192
    iget-object v1, v5, La/yks;->l0:La/bby;

    .line 193
    .line 194
    if-eqz v1, :cond_8

    .line 195
    .line 196
    invoke-interface {v1, v0}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 197
    .line 198
    .line 199
    :cond_8
    invoke-virtual {v5, v6, v0}, La/yks;->N(La/u3z;Ljava/lang/Long;)V

    .line 200
    .line 201
    .line 202
    goto :goto_5

    .line 203
    :cond_9
    instance-of v1, v3, La/svm0;

    .line 204
    .line 205
    if-eqz v1, :cond_a

    .line 206
    .line 207
    check-cast v3, La/svm0;

    .line 208
    .line 209
    iget-wide v1, v3, La/svm0;->b:J

    .line 210
    .line 211
    invoke-virtual {v5, v10, v11, v1, v2}, La/yks;->O(JJ)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v5, v6, v0}, La/yks;->N(La/u3z;Ljava/lang/Long;)V

    .line 215
    .line 216
    .line 217
    goto :goto_5

    .line 218
    :cond_a
    iget-object v1, v5, La/yks;->l0:La/bby;

    .line 219
    .line 220
    if-eqz v1, :cond_b

    .line 221
    .line 222
    invoke-interface {v1, v0}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 223
    .line 224
    .line 225
    :cond_b
    invoke-interface {v3}, La/xvm0;->getId()J

    .line 226
    .line 227
    .line 228
    move-result-wide v6

    .line 229
    invoke-interface {v3}, La/xvm0;->a()J

    .line 230
    .line 231
    .line 232
    move-result-wide v0

    .line 233
    sget-object v3, La/t3z;->c:La/t3z;

    .line 234
    .line 235
    if-ne v9, v3, :cond_c

    .line 236
    .line 237
    move v12, v8

    .line 238
    goto :goto_3

    .line 239
    :cond_c
    move v12, v2

    .line 240
    :goto_3
    invoke-virtual {v5}, La/yks;->M()La/sff0;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    iget-boolean v13, v2, La/sff0;->D0:Z

    .line 245
    .line 246
    move-wide v8, v0

    .line 247
    invoke-virtual/range {v5 .. v13}, La/yks;->P(JJJZZ)V

    .line 248
    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_d
    new-instance v0, La/ujs;

    .line 252
    .line 253
    invoke-direct {v0, v3, v5, v8}, La/ujs;-><init>(La/xvm0;La/yks;B)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v5, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 257
    .line 258
    .line 259
    goto :goto_5

    .line 260
    :goto_4
    new-instance v2, La/cbr;

    .line 261
    .line 262
    const/4 v7, 0x3

    .line 263
    invoke-direct/range {v2 .. v7}, La/cbr;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 264
    .line 265
    .line 266
    move-object v5, v6

    .line 267
    invoke-virtual {v5, v2}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 268
    .line 269
    .line 270
    :cond_e
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 271
    .line 272
    return-object v0

    .line 273
    :cond_f
    invoke-static {}, La/t9f;->b()V

    .line 274
    .line 275
    .line 276
    return-object v0
.end method

.method private final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/wx4;->l:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/k9s;

    .line 6
    .line 7
    iget-object v2, v0, La/wx4;->j:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ljava/util/List;

    .line 10
    .line 11
    sget-object v3, La/wne;->a:La/wne;

    .line 12
    .line 13
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, La/wx4;->k:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, La/f3j;

    .line 19
    .line 20
    iget-object v0, v0, La/f3j;->q:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, La/p7m0;

    .line 23
    .line 24
    :goto_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    move-object v4, v3

    .line 29
    check-cast v4, La/yus;

    .line 30
    .line 31
    iget-object v14, v1, La/k9s;->j:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v15, v1, La/k9s;->F:Ljava/lang/String;

    .line 34
    .line 35
    iget-wide v5, v1, La/k9s;->a:J

    .line 36
    .line 37
    iget-object v7, v1, La/k9s;->g:Ljava/lang/String;

    .line 38
    .line 39
    iget-wide v8, v1, La/k9s;->b:J

    .line 40
    .line 41
    iget-boolean v10, v1, La/k9s;->z:Z

    .line 42
    .line 43
    iget-boolean v11, v1, La/k9s;->W:Z

    .line 44
    .line 45
    invoke-interface {v1}, La/l9s;->s()Z

    .line 46
    .line 47
    .line 48
    move-result v19

    .line 49
    new-instance v12, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v13

    .line 58
    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v16

    .line 62
    if-eqz v16, :cond_1

    .line 63
    .line 64
    move-object/from16 v28, v2

    .line 65
    .line 66
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    move-object/from16 p0, v4

    .line 71
    .line 72
    instance-of v4, v2, La/rvm0;

    .line 73
    .line 74
    if-eqz v4, :cond_0

    .line 75
    .line 76
    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    :cond_0
    move-object/from16 v4, p0

    .line 80
    .line 81
    move-object/from16 v2, v28

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    move-object/from16 v28, v2

    .line 85
    .line 86
    move-object/from16 p0, v4

    .line 87
    .line 88
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    xor-int/lit8 v21, v2, 0x1

    .line 93
    .line 94
    iget-boolean v2, v1, La/k9s;->v:Z

    .line 95
    .line 96
    move/from16 v18, v11

    .line 97
    .line 98
    iget-wide v11, v1, La/k9s;->s:J

    .line 99
    .line 100
    iget-object v13, v1, La/k9s;->A:Ljava/lang/String;

    .line 101
    .line 102
    new-instance v4, Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-interface/range {v28 .. v28}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v16

    .line 111
    :goto_2
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v17

    .line 115
    if-eqz v17, :cond_3

    .line 116
    .line 117
    move-object/from16 v29, v1

    .line 118
    .line 119
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    move/from16 v22, v2

    .line 124
    .line 125
    instance-of v2, v1, La/uvm0;

    .line 126
    .line 127
    if-eqz v2, :cond_2

    .line 128
    .line 129
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    :cond_2
    move/from16 v2, v22

    .line 133
    .line 134
    move-object/from16 v1, v29

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_3
    move-object/from16 v29, v1

    .line 138
    .line 139
    move/from16 v22, v2

    .line 140
    .line 141
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    xor-int/lit8 v26, v1, 0x1

    .line 146
    .line 147
    const/16 v25, 0x0

    .line 148
    .line 149
    const v27, 0x32700

    .line 150
    .line 151
    .line 152
    const/16 v16, 0x0

    .line 153
    .line 154
    const/16 v17, 0x0

    .line 155
    .line 156
    const/16 v20, 0x0

    .line 157
    .line 158
    const-wide/16 v23, 0x0

    .line 159
    .line 160
    move-object/from16 v4, p0

    .line 161
    .line 162
    invoke-static/range {v4 .. v27}, La/yus;->a(La/yus;JLjava/lang/String;JZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZJLa/px7;ZI)La/yus;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-virtual {v0, v3, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-eqz v1, :cond_4

    .line 171
    .line 172
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 173
    .line 174
    return-object v0

    .line 175
    :cond_4
    move-object/from16 v2, v28

    .line 176
    .line 177
    move-object/from16 v1, v29

    .line 178
    .line 179
    goto/16 :goto_0
.end method

.method private final s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/wx4;->l:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/List;

    .line 6
    .line 7
    iget-object v2, v0, La/wx4;->j:Ljava/lang/Object;

    .line 8
    .line 9
    move-object v7, v2

    .line 10
    check-cast v7, Ljava/util/List;

    .line 11
    .line 12
    sget-object v2, La/wne;->a:La/wne;

    .line 13
    .line 14
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, La/d0t;

    .line 22
    .line 23
    iget-object v0, v0, La/wx4;->k:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, La/g45;

    .line 26
    .line 27
    iget-object v2, v0, La/g45;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v2, La/yyt;

    .line 30
    .line 31
    iget-object v2, v2, La/yyt;->a:La/uzc;

    .line 32
    .line 33
    invoke-virtual {v2}, La/uzc;->a()Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    iget-object v2, v0, La/g45;->f:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, La/pq;

    .line 40
    .line 41
    iget-object v2, v2, La/pq;->a:La/es;

    .line 42
    .line 43
    iget-object v2, v2, La/es;->a:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v2, La/sln;

    .line 46
    .line 47
    iget-object v5, v2, La/sln;->c:Ljava/util/Map;

    .line 48
    .line 49
    iget-object v2, v0, La/g45;->g:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v2, La/a8u;

    .line 52
    .line 53
    iget-object v2, v2, La/a8u;->a:La/es;

    .line 54
    .line 55
    iget-object v2, v2, La/es;->a:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v2, La/sln;

    .line 58
    .line 59
    iget-object v6, v2, La/sln;->d:Ljava/util/Map;

    .line 60
    .line 61
    iget-object v0, v0, La/g45;->h:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, La/pq;

    .line 64
    .line 65
    iget-object v0, v0, La/pq;->a:La/es;

    .line 66
    .line 67
    invoke-virtual {v0}, La/es;->i()Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    new-instance v9, La/ion;

    .line 84
    .line 85
    iget-wide v10, v1, La/d0t;->a:J

    .line 86
    .line 87
    iget-object v0, v1, La/d0t;->K:Ljava/util/List;

    .line 88
    .line 89
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->N0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    new-instance v12, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 96
    .line 97
    .line 98
    new-instance v3, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v13

    .line 107
    :cond_0
    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v14

    .line 111
    if-eqz v14, :cond_1

    .line 112
    .line 113
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v14

    .line 117
    move-object v15, v14

    .line 118
    check-cast v15, La/vt20;

    .line 119
    .line 120
    iget v15, v15, La/vt20;->c:I

    .line 121
    .line 122
    if-eqz v15, :cond_0

    .line 123
    .line 124
    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 129
    .line 130
    .line 131
    move-result-object v13

    .line 132
    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    if-eqz v3, :cond_5

    .line 137
    .line 138
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    check-cast v3, La/vt20;

    .line 143
    .line 144
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v14

    .line 148
    :goto_2
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v15

    .line 152
    if-eqz v15, :cond_3

    .line 153
    .line 154
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v15

    .line 158
    move-object/from16 v16, v0

    .line 159
    .line 160
    move-object v0, v15

    .line 161
    check-cast v0, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;

    .line 162
    .line 163
    move/from16 p0, v4

    .line 164
    .line 165
    move-object/from16 v17, v5

    .line 166
    .line 167
    iget-wide v4, v0, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;->b:J

    .line 168
    .line 169
    move-wide/from16 v18, v4

    .line 170
    .line 171
    iget-wide v4, v3, La/vt20;->a:J

    .line 172
    .line 173
    cmp-long v0, v18, v4

    .line 174
    .line 175
    if-nez v0, :cond_2

    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_2
    move/from16 v4, p0

    .line 179
    .line 180
    move-object/from16 v0, v16

    .line 181
    .line 182
    move-object/from16 v5, v17

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_3
    move-object/from16 v16, v0

    .line 186
    .line 187
    move/from16 p0, v4

    .line 188
    .line 189
    move-object/from16 v17, v5

    .line 190
    .line 191
    const/4 v15, 0x0

    .line 192
    :goto_3
    move-object v3, v15

    .line 193
    check-cast v3, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;

    .line 194
    .line 195
    if-eqz v3, :cond_4

    .line 196
    .line 197
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move/from16 v4, p0

    .line 201
    .line 202
    move-object/from16 v5, v17

    .line 203
    .line 204
    invoke-static/range {v3 .. v8}, La/u1c;->T(Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;ZLjava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/List;)La/oeo;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    goto :goto_4

    .line 212
    :cond_4
    move/from16 v4, p0

    .line 213
    .line 214
    move-object/from16 v5, v17

    .line 215
    .line 216
    :goto_4
    move-object/from16 v0, v16

    .line 217
    .line 218
    goto :goto_1

    .line 219
    :cond_5
    new-instance v0, Ljava/util/ArrayList;

    .line 220
    .line 221
    const/16 v3, 0xa

    .line 222
    .line 223
    invoke-static {v2, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 235
    .line 236
    .line 237
    move-result v3

    .line 238
    if-eqz v3, :cond_6

    .line 239
    .line 240
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    check-cast v3, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;

    .line 245
    .line 246
    invoke-static/range {v3 .. v8}, La/u1c;->T(Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;ZLjava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/List;)La/oeo;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    goto :goto_5

    .line 254
    :cond_6
    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 255
    .line 256
    .line 257
    iget-wide v13, v1, La/d0t;->v:J

    .line 258
    .line 259
    iget-object v15, v1, La/d0t;->o:Ljava/lang/String;

    .line 260
    .line 261
    iget-wide v2, v1, La/d0t;->s:J

    .line 262
    .line 263
    invoke-static {v1}, La/qzb;->c0(La/d0t;)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v18

    .line 267
    invoke-static {v1}, La/qzb;->r0(La/d0t;)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v19

    .line 271
    iget-object v0, v1, La/d0t;->i:Ljava/lang/String;

    .line 272
    .line 273
    invoke-static {v1}, La/qzb;->D0(La/d0t;)Z

    .line 274
    .line 275
    .line 276
    move-result v21

    .line 277
    move-object/from16 v20, v0

    .line 278
    .line 279
    move-wide/from16 v16, v2

    .line 280
    .line 281
    invoke-direct/range {v9 .. v21}, La/ion;-><init>(JLjava/util/ArrayList;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 282
    .line 283
    .line 284
    return-object v9
.end method

.method private final t(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, La/wx4;->l:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, La/wx4;->j:Ljava/lang/Object;

    .line 4
    .line 5
    sget-object v2, La/wne;->a:La/wne;

    .line 6
    .line 7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    new-instance p1, La/viw;

    .line 11
    .line 12
    iget-object p0, p0, La/wx4;->k:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, La/ypl0;

    .line 15
    .line 16
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 17
    .line 18
    instance-of v2, v0, La/g0g0;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    move-object v2, v3

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v2, v0

    .line 26
    :goto_0
    check-cast v2, Ljava/util/List;

    .line 27
    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    sget-object v2, La/iun;->a:La/iun;

    .line 31
    .line 32
    :cond_1
    instance-of v4, v1, La/g0g0;

    .line 33
    .line 34
    if-eqz v4, :cond_2

    .line 35
    .line 36
    move-object v4, v3

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move-object v4, v1

    .line 39
    :goto_1
    check-cast v4, Ljava/util/List;

    .line 40
    .line 41
    if-nez v4, :cond_3

    .line 42
    .line 43
    sget-object v4, La/iun;->a:La/iun;

    .line 44
    .line 45
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {v2}, La/sac;->j0(Ljava/util/List;)Ljava/util/ArrayList;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-static {v5}, La/sac;->K(Ljava/util/ArrayList;)La/vbb;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    if-nez v5, :cond_4

    .line 60
    .line 61
    invoke-static {v4}, La/sac;->j0(Ljava/util/List;)Ljava/util/ArrayList;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    invoke-static {v5}, La/sac;->K(Ljava/util/ArrayList;)La/vbb;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    :cond_4
    if-eqz v5, :cond_5

    .line 70
    .line 71
    sget-object v2, La/ikw;->a:La/ikw;

    .line 72
    .line 73
    invoke-static {v5, v2}, La/sac;->p0(La/vbb;La/ikw;)La/hkw;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    goto :goto_2

    .line 78
    :cond_5
    invoke-static {v2}, La/sac;->J(Ljava/util/List;)Ljava/util/ArrayList;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-static {v2}, La/sac;->K(Ljava/util/ArrayList;)La/vbb;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    if-nez v2, :cond_6

    .line 87
    .line 88
    invoke-static {v4}, La/sac;->J(Ljava/util/List;)Ljava/util/ArrayList;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-static {v2}, La/sac;->K(Ljava/util/ArrayList;)La/vbb;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    :cond_6
    if-eqz v2, :cond_7

    .line 97
    .line 98
    sget-object v3, La/ikw;->b:La/ikw;

    .line 99
    .line 100
    invoke-static {v2, v3}, La/sac;->p0(La/vbb;La/ikw;)La/hkw;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    goto :goto_2

    .line 105
    :cond_7
    new-instance v2, La/ff5;

    .line 106
    .line 107
    invoke-direct {v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    new-instance v3, La/g0g0;

    .line 111
    .line 112
    invoke-direct {v3, v2}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 113
    .line 114
    .line 115
    move-object v2, v3

    .line 116
    :goto_2
    new-instance v3, La/j0g0;

    .line 117
    .line 118
    invoke-direct {v3, v2}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    invoke-direct {p1, v0, v1, p0, v3}, La/viw;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/ypl0;La/j0g0;)V

    .line 122
    .line 123
    .line 124
    return-object p1
.end method

.method private final x(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-object v0, p0, La/wx4;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    iget-object p0, p0, La/wx4;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/util/List;

    .line 8
    .line 9
    sget-object v1, La/wne;->a:La/wne;

    .line 10
    .line 11
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 22
    .line 23
    const/16 v1, 0xa

    .line 24
    .line 25
    invoke-static {p0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, La/zlb;

    .line 47
    .line 48
    iget-object v3, v2, La/zlb;->c:Ljava/util/List;

    .line 49
    .line 50
    new-instance v4, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-static {v3, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 57
    .line 58
    .line 59
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_2

    .line 68
    .line 69
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    check-cast v5, La/rbb;

    .line 74
    .line 75
    iget-wide v6, v5, La/rbb;->a:J

    .line 76
    .line 77
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-interface {v0, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    iget-object v7, v5, La/rbb;->d:Ljava/util/List;

    .line 86
    .line 87
    new-instance v8, Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-static {v7, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 90
    .line 91
    .line 92
    move-result v9

    .line 93
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 94
    .line 95
    .line 96
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v9

    .line 104
    const/4 v10, 0x0

    .line 105
    if-eqz v9, :cond_1

    .line 106
    .line 107
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v9

    .line 111
    check-cast v9, La/sum0;

    .line 112
    .line 113
    iget-wide v11, v9, La/sum0;->a:J

    .line 114
    .line 115
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 116
    .line 117
    .line 118
    move-result-object v11

    .line 119
    invoke-interface {v0, v11}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v11

    .line 123
    const/16 v12, 0x7bff

    .line 124
    .line 125
    invoke-static {v9, v11, v10, v12}, La/sum0;->a(La/sum0;ZLjava/util/ArrayList;I)La/sum0;

    .line 126
    .line 127
    .line 128
    move-result-object v9

    .line 129
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_1
    const v7, 0x1f7f7

    .line 134
    .line 135
    .line 136
    invoke-static {v5, v8, v6, v10, v7}, La/rbb;->a(La/rbb;Ljava/util/ArrayList;ZLjava/util/ArrayList;I)La/rbb;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_2
    invoke-static {v2, v4}, La/zlb;->a(La/zlb;Ljava/util/ArrayList;)La/zlb;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_3
    return-object p1
.end method

.method private final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, La/wx4;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    iget-object p0, p0, La/wx4;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/knb;

    .line 8
    .line 9
    sget-object v1, La/wne;->a:La/wne;

    .line 10
    .line 11
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, La/knb;->a:Ljava/util/List;

    .line 15
    .line 16
    new-instance v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    const/16 v2, 0xa

    .line 19
    .line 20
    invoke-static {p1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, La/rbb;

    .line 42
    .line 43
    iget-wide v4, v3, La/rbb;->a:J

    .line 44
    .line 45
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-interface {v0, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    iget-object v5, v3, La/rbb;->d:Ljava/util/List;

    .line 54
    .line 55
    new-instance v6, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-static {v5, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 62
    .line 63
    .line 64
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    const/4 v8, 0x0

    .line 73
    if-eqz v7, :cond_0

    .line 74
    .line 75
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    check-cast v7, La/sum0;

    .line 80
    .line 81
    iget-wide v9, v7, La/sum0;->a:J

    .line 82
    .line 83
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    invoke-interface {v0, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v9

    .line 91
    const/16 v10, 0x7bff

    .line 92
    .line 93
    invoke-static {v7, v9, v8, v10}, La/sum0;->a(La/sum0;ZLjava/util/ArrayList;I)La/sum0;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_0
    const v5, 0x1f7f7

    .line 102
    .line 103
    .line 104
    invoke-static {v3, v6, v4, v8, v5}, La/rbb;->a(La/rbb;Ljava/util/ArrayList;ZLjava/util/ArrayList;I)La/rbb;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_1
    invoke-static {p0, v1}, La/knb;->a(La/knb;Ljava/util/List;)La/knb;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    return-object p0
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/wx4;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/wx4;->k:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/util/List;

    .line 9
    .line 10
    check-cast p2, Ljava/util/List;

    .line 11
    .line 12
    check-cast p3, La/yje;

    .line 13
    .line 14
    new-instance p0, La/wx4;

    .line 15
    .line 16
    check-cast v1, La/b3a0;

    .line 17
    .line 18
    const/16 v0, 0x1d

    .line 19
    .line 20
    invoke-direct {p0, v1, p3, v0}, La/wx4;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, La/wx4;->l:Ljava/lang/Object;

    .line 24
    .line 25
    iput-object p2, p0, La/wx4;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/wx4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 35
    .line 36
    check-cast p2, Ljava/lang/String;

    .line 37
    .line 38
    check-cast p3, La/yje;

    .line 39
    .line 40
    new-instance p0, La/wx4;

    .line 41
    .line 42
    check-cast v1, La/dq00;

    .line 43
    .line 44
    const/16 v0, 0x1c

    .line 45
    .line 46
    invoke-direct {p0, v1, p3, v0}, La/wx4;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, La/wx4;->l:Ljava/lang/Object;

    .line 50
    .line 51
    iput-object p2, p0, La/wx4;->j:Ljava/lang/Object;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/wx4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_1
    check-cast p1, La/wj80;

    .line 61
    .line 62
    check-cast p2, Ljava/util/List;

    .line 63
    .line 64
    check-cast p3, La/yje;

    .line 65
    .line 66
    new-instance p0, La/wx4;

    .line 67
    .line 68
    check-cast v1, La/fk80;

    .line 69
    .line 70
    const/16 v0, 0x1b

    .line 71
    .line 72
    invoke-direct {p0, v1, p3, v0}, La/wx4;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 73
    .line 74
    .line 75
    iput-object p1, p0, La/wx4;->l:Ljava/lang/Object;

    .line 76
    .line 77
    iput-object p2, p0, La/wx4;->j:Ljava/lang/Object;

    .line 78
    .line 79
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    invoke-virtual {p0, p1}, La/wx4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :pswitch_2
    check-cast p1, La/rjt;

    .line 87
    .line 88
    check-cast p2, La/rjt;

    .line 89
    .line 90
    check-cast p3, La/yje;

    .line 91
    .line 92
    new-instance p0, La/wx4;

    .line 93
    .line 94
    check-cast v1, La/gp00;

    .line 95
    .line 96
    const/16 v0, 0x1a

    .line 97
    .line 98
    invoke-direct {p0, v1, p3, v0}, La/wx4;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 99
    .line 100
    .line 101
    iput-object p1, p0, La/wx4;->l:Ljava/lang/Object;

    .line 102
    .line 103
    iput-object p2, p0, La/wx4;->j:Ljava/lang/Object;

    .line 104
    .line 105
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    invoke-virtual {p0, p1}, La/wx4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0

    .line 112
    :pswitch_3
    check-cast p1, La/kmq;

    .line 113
    .line 114
    check-cast p2, Ljava/lang/Throwable;

    .line 115
    .line 116
    check-cast p3, La/yje;

    .line 117
    .line 118
    new-instance p1, La/wx4;

    .line 119
    .line 120
    iget-object p0, p0, La/wx4;->j:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast p0, La/bs60;

    .line 123
    .line 124
    check-cast v1, Ljava/lang/String;

    .line 125
    .line 126
    invoke-direct {p1, p0, v1, p3}, La/wx4;-><init>(La/bs60;Ljava/lang/String;La/yje;)V

    .line 127
    .line 128
    .line 129
    iput-object p2, p1, La/wx4;->l:Ljava/lang/Object;

    .line 130
    .line 131
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    invoke-virtual {p1, p0}, La/wx4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    return-object p0

    .line 138
    :pswitch_4
    check-cast p1, Ljava/util/List;

    .line 139
    .line 140
    check-cast p2, Ljava/util/List;

    .line 141
    .line 142
    check-cast p3, La/yje;

    .line 143
    .line 144
    new-instance p0, La/wx4;

    .line 145
    .line 146
    check-cast v1, La/d650;

    .line 147
    .line 148
    const/16 v0, 0x18

    .line 149
    .line 150
    invoke-direct {p0, v1, p3, v0}, La/wx4;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 151
    .line 152
    .line 153
    iput-object p1, p0, La/wx4;->l:Ljava/lang/Object;

    .line 154
    .line 155
    iput-object p2, p0, La/wx4;->j:Ljava/lang/Object;

    .line 156
    .line 157
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 158
    .line 159
    invoke-virtual {p0, p1}, La/wx4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    return-object p0

    .line 164
    :pswitch_5
    check-cast p1, Lorg/xplatform/bet_constructor/impl/makebet/domain/model/StepInputConfigModel;

    .line 165
    .line 166
    check-cast p2, La/ql5;

    .line 167
    .line 168
    check-cast p3, La/yje;

    .line 169
    .line 170
    new-instance p0, La/wx4;

    .line 171
    .line 172
    check-cast v1, La/rg20;

    .line 173
    .line 174
    const/16 v0, 0x17

    .line 175
    .line 176
    invoke-direct {p0, v1, p3, v0}, La/wx4;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 177
    .line 178
    .line 179
    iput-object p1, p0, La/wx4;->l:Ljava/lang/Object;

    .line 180
    .line 181
    iput-object p2, p0, La/wx4;->j:Ljava/lang/Object;

    .line 182
    .line 183
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 184
    .line 185
    invoke-virtual {p0, p1}, La/wx4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    return-object p0

    .line 190
    :pswitch_6
    check-cast p1, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 191
    .line 192
    check-cast p2, La/ql5;

    .line 193
    .line 194
    check-cast p3, La/yje;

    .line 195
    .line 196
    new-instance p0, La/wx4;

    .line 197
    .line 198
    check-cast v1, La/qg20;

    .line 199
    .line 200
    const/16 v0, 0x16

    .line 201
    .line 202
    invoke-direct {p0, v1, p3, v0}, La/wx4;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 203
    .line 204
    .line 205
    iput-object p1, p0, La/wx4;->l:Ljava/lang/Object;

    .line 206
    .line 207
    iput-object p2, p0, La/wx4;->j:Ljava/lang/Object;

    .line 208
    .line 209
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 210
    .line 211
    invoke-virtual {p0, p1}, La/wx4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    return-object p0

    .line 216
    :pswitch_7
    check-cast p1, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 217
    .line 218
    check-cast p2, La/ql5;

    .line 219
    .line 220
    check-cast p3, La/yje;

    .line 221
    .line 222
    new-instance p0, La/wx4;

    .line 223
    .line 224
    check-cast v1, La/h620;

    .line 225
    .line 226
    const/16 v0, 0x15

    .line 227
    .line 228
    invoke-direct {p0, v1, p3, v0}, La/wx4;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 229
    .line 230
    .line 231
    iput-object p1, p0, La/wx4;->l:Ljava/lang/Object;

    .line 232
    .line 233
    iput-object p2, p0, La/wx4;->j:Ljava/lang/Object;

    .line 234
    .line 235
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 236
    .line 237
    invoke-virtual {p0, p1}, La/wx4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    return-object p0

    .line 242
    :pswitch_8
    check-cast p1, Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;

    .line 243
    .line 244
    check-cast p2, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 245
    .line 246
    check-cast p3, La/yje;

    .line 247
    .line 248
    new-instance p0, La/wx4;

    .line 249
    .line 250
    check-cast v1, La/h620;

    .line 251
    .line 252
    const/16 v0, 0x14

    .line 253
    .line 254
    invoke-direct {p0, v1, p3, v0}, La/wx4;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 255
    .line 256
    .line 257
    iput-object p1, p0, La/wx4;->l:Ljava/lang/Object;

    .line 258
    .line 259
    iput-object p2, p0, La/wx4;->j:Ljava/lang/Object;

    .line 260
    .line 261
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 262
    .line 263
    invoke-virtual {p0, p1}, La/wx4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    return-object p0

    .line 268
    :pswitch_9
    check-cast p1, Ljava/util/List;

    .line 269
    .line 270
    check-cast p2, La/knb;

    .line 271
    .line 272
    check-cast p3, La/yje;

    .line 273
    .line 274
    new-instance p0, La/wx4;

    .line 275
    .line 276
    check-cast v1, La/tzi;

    .line 277
    .line 278
    const/16 v0, 0x13

    .line 279
    .line 280
    invoke-direct {p0, v1, p3, v0}, La/wx4;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 281
    .line 282
    .line 283
    iput-object p1, p0, La/wx4;->l:Ljava/lang/Object;

    .line 284
    .line 285
    iput-object p2, p0, La/wx4;->j:Ljava/lang/Object;

    .line 286
    .line 287
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 288
    .line 289
    invoke-virtual {p0, p1}, La/wx4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object p0

    .line 293
    return-object p0

    .line 294
    :pswitch_a
    check-cast p1, Ljava/util/List;

    .line 295
    .line 296
    check-cast p2, Ljava/util/List;

    .line 297
    .line 298
    check-cast p3, La/yje;

    .line 299
    .line 300
    new-instance p0, La/wx4;

    .line 301
    .line 302
    check-cast v1, La/gu1;

    .line 303
    .line 304
    const/16 v0, 0x12

    .line 305
    .line 306
    invoke-direct {p0, v1, p3, v0}, La/wx4;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 307
    .line 308
    .line 309
    iput-object p1, p0, La/wx4;->l:Ljava/lang/Object;

    .line 310
    .line 311
    iput-object p2, p0, La/wx4;->j:Ljava/lang/Object;

    .line 312
    .line 313
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 314
    .line 315
    invoke-virtual {p0, p1}, La/wx4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object p0

    .line 319
    return-object p0

    .line 320
    :pswitch_b
    check-cast p1, Ljava/util/List;

    .line 321
    .line 322
    check-cast p2, Ljava/util/List;

    .line 323
    .line 324
    check-cast p3, La/yje;

    .line 325
    .line 326
    new-instance p0, La/wx4;

    .line 327
    .line 328
    check-cast v1, La/a6u;

    .line 329
    .line 330
    const/16 v0, 0x11

    .line 331
    .line 332
    invoke-direct {p0, v1, p3, v0}, La/wx4;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 333
    .line 334
    .line 335
    iput-object p1, p0, La/wx4;->l:Ljava/lang/Object;

    .line 336
    .line 337
    iput-object p2, p0, La/wx4;->j:Ljava/lang/Object;

    .line 338
    .line 339
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 340
    .line 341
    invoke-virtual {p0, p1}, La/wx4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object p0

    .line 345
    return-object p0

    .line 346
    :pswitch_c
    check-cast p1, La/j0g0;

    .line 347
    .line 348
    iget-object p0, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 349
    .line 350
    check-cast p2, La/j0g0;

    .line 351
    .line 352
    iget-object p1, p2, La/j0g0;->a:Ljava/lang/Object;

    .line 353
    .line 354
    check-cast p3, La/yje;

    .line 355
    .line 356
    new-instance p2, La/wx4;

    .line 357
    .line 358
    check-cast v1, La/ypl0;

    .line 359
    .line 360
    const/16 v0, 0x10

    .line 361
    .line 362
    invoke-direct {p2, v1, p3, v0}, La/wx4;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 363
    .line 364
    .line 365
    iput-object p0, p2, La/wx4;->l:Ljava/lang/Object;

    .line 366
    .line 367
    iput-object p1, p2, La/wx4;->j:Ljava/lang/Object;

    .line 368
    .line 369
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 370
    .line 371
    invoke-virtual {p2, p0}, La/wx4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object p0

    .line 375
    return-object p0

    .line 376
    :pswitch_d
    check-cast p1, Ljava/util/List;

    .line 377
    .line 378
    check-cast p2, Ljava/util/List;

    .line 379
    .line 380
    check-cast p3, La/yje;

    .line 381
    .line 382
    new-instance p0, La/wx4;

    .line 383
    .line 384
    check-cast v1, La/g45;

    .line 385
    .line 386
    const/16 v0, 0xf

    .line 387
    .line 388
    invoke-direct {p0, v1, p3, v0}, La/wx4;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 389
    .line 390
    .line 391
    iput-object p1, p0, La/wx4;->l:Ljava/lang/Object;

    .line 392
    .line 393
    iput-object p2, p0, La/wx4;->j:Ljava/lang/Object;

    .line 394
    .line 395
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 396
    .line 397
    invoke-virtual {p0, p1}, La/wx4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object p0

    .line 401
    return-object p0

    .line 402
    :pswitch_e
    check-cast p1, La/eh6;

    .line 403
    .line 404
    check-cast p2, La/u5s;

    .line 405
    .line 406
    check-cast p3, La/yje;

    .line 407
    .line 408
    new-instance p0, La/wx4;

    .line 409
    .line 410
    check-cast v1, La/uii;

    .line 411
    .line 412
    const/16 v0, 0xe

    .line 413
    .line 414
    invoke-direct {p0, v1, p3, v0}, La/wx4;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 415
    .line 416
    .line 417
    iput-object p1, p0, La/wx4;->l:Ljava/lang/Object;

    .line 418
    .line 419
    iput-object p2, p0, La/wx4;->j:Ljava/lang/Object;

    .line 420
    .line 421
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 422
    .line 423
    invoke-virtual {p0, p1}, La/wx4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object p0

    .line 427
    return-object p0

    .line 428
    :pswitch_f
    check-cast p1, La/k9s;

    .line 429
    .line 430
    check-cast p2, Ljava/util/List;

    .line 431
    .line 432
    check-cast p3, La/yje;

    .line 433
    .line 434
    new-instance p0, La/wx4;

    .line 435
    .line 436
    check-cast v1, La/f3j;

    .line 437
    .line 438
    const/16 v0, 0xd

    .line 439
    .line 440
    invoke-direct {p0, v1, p3, v0}, La/wx4;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 441
    .line 442
    .line 443
    iput-object p1, p0, La/wx4;->l:Ljava/lang/Object;

    .line 444
    .line 445
    iput-object p2, p0, La/wx4;->j:Ljava/lang/Object;

    .line 446
    .line 447
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 448
    .line 449
    invoke-virtual {p0, p1}, La/wx4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object p0

    .line 453
    return-object p0

    .line 454
    :pswitch_10
    check-cast p1, La/xvm0;

    .line 455
    .line 456
    check-cast p2, La/js20;

    .line 457
    .line 458
    check-cast p3, La/yje;

    .line 459
    .line 460
    new-instance p0, La/wx4;

    .line 461
    .line 462
    check-cast v1, La/yks;

    .line 463
    .line 464
    const/16 v0, 0xc

    .line 465
    .line 466
    invoke-direct {p0, v1, p3, v0}, La/wx4;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 467
    .line 468
    .line 469
    iput-object p1, p0, La/wx4;->l:Ljava/lang/Object;

    .line 470
    .line 471
    iput-object p2, p0, La/wx4;->j:Ljava/lang/Object;

    .line 472
    .line 473
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 474
    .line 475
    invoke-virtual {p0, p1}, La/wx4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object p0

    .line 479
    return-object p0

    .line 480
    :pswitch_11
    check-cast p1, Ljava/util/List;

    .line 481
    .line 482
    check-cast p2, Ljava/lang/String;

    .line 483
    .line 484
    check-cast p3, La/yje;

    .line 485
    .line 486
    new-instance p0, La/wx4;

    .line 487
    .line 488
    check-cast v1, La/uhs;

    .line 489
    .line 490
    const/16 v0, 0xb

    .line 491
    .line 492
    invoke-direct {p0, v1, p3, v0}, La/wx4;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 493
    .line 494
    .line 495
    iput-object p1, p0, La/wx4;->l:Ljava/lang/Object;

    .line 496
    .line 497
    iput-object p2, p0, La/wx4;->j:Ljava/lang/Object;

    .line 498
    .line 499
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 500
    .line 501
    invoke-virtual {p0, p1}, La/wx4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object p0

    .line 505
    return-object p0

    .line 506
    :pswitch_12
    check-cast p1, La/xvm0;

    .line 507
    .line 508
    check-cast p2, La/js20;

    .line 509
    .line 510
    check-cast p3, La/yje;

    .line 511
    .line 512
    new-instance p0, La/wx4;

    .line 513
    .line 514
    check-cast v1, La/g9s;

    .line 515
    .line 516
    const/16 v0, 0xa

    .line 517
    .line 518
    invoke-direct {p0, v1, p3, v0}, La/wx4;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 519
    .line 520
    .line 521
    iput-object p1, p0, La/wx4;->l:Ljava/lang/Object;

    .line 522
    .line 523
    iput-object p2, p0, La/wx4;->j:Ljava/lang/Object;

    .line 524
    .line 525
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 526
    .line 527
    invoke-virtual {p0, p1}, La/wx4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object p0

    .line 531
    return-object p0

    .line 532
    :pswitch_13
    check-cast p1, La/xvm0;

    .line 533
    .line 534
    check-cast p2, La/js20;

    .line 535
    .line 536
    check-cast p3, La/yje;

    .line 537
    .line 538
    new-instance p0, La/wx4;

    .line 539
    .line 540
    check-cast v1, La/k4s;

    .line 541
    .line 542
    const/16 v0, 0x9

    .line 543
    .line 544
    invoke-direct {p0, v1, p3, v0}, La/wx4;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 545
    .line 546
    .line 547
    iput-object p1, p0, La/wx4;->l:Ljava/lang/Object;

    .line 548
    .line 549
    iput-object p2, p0, La/wx4;->j:Ljava/lang/Object;

    .line 550
    .line 551
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 552
    .line 553
    invoke-virtual {p0, p1}, La/wx4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object p0

    .line 557
    return-object p0

    .line 558
    :pswitch_14
    check-cast p1, La/ljg;

    .line 559
    .line 560
    check-cast p2, La/qrh;

    .line 561
    .line 562
    check-cast p3, La/yje;

    .line 563
    .line 564
    new-instance p0, La/wx4;

    .line 565
    .line 566
    check-cast v1, La/m9s;

    .line 567
    .line 568
    const/16 v0, 0x8

    .line 569
    .line 570
    invoke-direct {p0, v1, p3, v0}, La/wx4;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 571
    .line 572
    .line 573
    iput-object p1, p0, La/wx4;->l:Ljava/lang/Object;

    .line 574
    .line 575
    iput-object p2, p0, La/wx4;->j:Ljava/lang/Object;

    .line 576
    .line 577
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 578
    .line 579
    invoke-virtual {p0, p1}, La/wx4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object p0

    .line 583
    return-object p0

    .line 584
    :pswitch_15
    check-cast p1, La/y3h;

    .line 585
    .line 586
    check-cast p2, La/ljg;

    .line 587
    .line 588
    check-cast p3, La/yje;

    .line 589
    .line 590
    new-instance p0, La/wx4;

    .line 591
    .line 592
    check-cast v1, La/m9s;

    .line 593
    .line 594
    const/4 v0, 0x7

    .line 595
    invoke-direct {p0, v1, p3, v0}, La/wx4;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 596
    .line 597
    .line 598
    iput-object p1, p0, La/wx4;->l:Ljava/lang/Object;

    .line 599
    .line 600
    iput-object p2, p0, La/wx4;->j:Ljava/lang/Object;

    .line 601
    .line 602
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 603
    .line 604
    invoke-virtual {p0, p1}, La/wx4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    move-result-object p0

    .line 608
    return-object p0

    .line 609
    :pswitch_16
    check-cast p1, Ljava/util/List;

    .line 610
    .line 611
    check-cast p2, Ljava/lang/String;

    .line 612
    .line 613
    check-cast p3, La/yje;

    .line 614
    .line 615
    new-instance p0, La/wx4;

    .line 616
    .line 617
    check-cast v1, Lorg/xplatform/favorites/impl/presentation/category/a;

    .line 618
    .line 619
    const/4 v0, 0x6

    .line 620
    invoke-direct {p0, v1, p3, v0}, La/wx4;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 621
    .line 622
    .line 623
    iput-object p1, p0, La/wx4;->l:Ljava/lang/Object;

    .line 624
    .line 625
    iput-object p2, p0, La/wx4;->j:Ljava/lang/Object;

    .line 626
    .line 627
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 628
    .line 629
    invoke-virtual {p0, p1}, La/wx4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object p0

    .line 633
    return-object p0

    .line 634
    :pswitch_17
    check-cast p1, La/kmq;

    .line 635
    .line 636
    check-cast p2, Ljava/lang/Throwable;

    .line 637
    .line 638
    check-cast p3, La/yje;

    .line 639
    .line 640
    new-instance p1, La/wx4;

    .line 641
    .line 642
    iget-object p2, p0, La/wx4;->l:Ljava/lang/Object;

    .line 643
    .line 644
    check-cast p2, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 645
    .line 646
    iget-object p0, p0, La/wx4;->j:Ljava/lang/Object;

    .line 647
    .line 648
    check-cast p0, Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;

    .line 649
    .line 650
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 651
    .line 652
    invoke-direct {p1, p2, p0, v1, p3}, La/wx4;-><init>(Lorg/xplatform/uikit/components/buttons/DsButton;Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;Lkotlin/jvm/functions/Function0;La/yje;)V

    .line 653
    .line 654
    .line 655
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 656
    .line 657
    invoke-virtual {p1, p0}, La/wx4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 658
    .line 659
    .line 660
    move-result-object p0

    .line 661
    return-object p0

    .line 662
    :pswitch_18
    check-cast p1, La/l0j;

    .line 663
    .line 664
    check-cast p2, La/sw00;

    .line 665
    .line 666
    check-cast p3, La/yje;

    .line 667
    .line 668
    new-instance p0, La/wx4;

    .line 669
    .line 670
    check-cast v1, La/f3j;

    .line 671
    .line 672
    const/4 v0, 0x4

    .line 673
    invoke-direct {p0, v1, p3, v0}, La/wx4;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 674
    .line 675
    .line 676
    iput-object p1, p0, La/wx4;->l:Ljava/lang/Object;

    .line 677
    .line 678
    iput-object p2, p0, La/wx4;->j:Ljava/lang/Object;

    .line 679
    .line 680
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 681
    .line 682
    invoke-virtual {p0, p1}, La/wx4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 683
    .line 684
    .line 685
    move-result-object p0

    .line 686
    return-object p0

    .line 687
    :pswitch_19
    check-cast p1, La/o4g;

    .line 688
    .line 689
    check-cast p2, La/c5g;

    .line 690
    .line 691
    check-cast p3, La/yje;

    .line 692
    .line 693
    new-instance p0, La/wx4;

    .line 694
    .line 695
    check-cast v1, La/k8g;

    .line 696
    .line 697
    const/4 v0, 0x3

    .line 698
    invoke-direct {p0, v1, p3, v0}, La/wx4;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 699
    .line 700
    .line 701
    iput-object p1, p0, La/wx4;->l:Ljava/lang/Object;

    .line 702
    .line 703
    iput-object p2, p0, La/wx4;->j:Ljava/lang/Object;

    .line 704
    .line 705
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 706
    .line 707
    invoke-virtual {p0, p1}, La/wx4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 708
    .line 709
    .line 710
    move-result-object p0

    .line 711
    return-object p0

    .line 712
    :pswitch_1a
    check-cast p1, Ljava/util/List;

    .line 713
    .line 714
    check-cast p2, Ljava/util/Set;

    .line 715
    .line 716
    check-cast p3, La/yje;

    .line 717
    .line 718
    new-instance p0, La/wx4;

    .line 719
    .line 720
    check-cast v1, La/yxb;

    .line 721
    .line 722
    const/4 v0, 0x2

    .line 723
    invoke-direct {p0, v1, p3, v0}, La/wx4;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 724
    .line 725
    .line 726
    iput-object p1, p0, La/wx4;->l:Ljava/lang/Object;

    .line 727
    .line 728
    check-cast p2, Ljava/util/Set;

    .line 729
    .line 730
    iput-object p2, p0, La/wx4;->j:Ljava/lang/Object;

    .line 731
    .line 732
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 733
    .line 734
    invoke-virtual {p0, p1}, La/wx4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    move-result-object p0

    .line 738
    return-object p0

    .line 739
    :pswitch_1b
    check-cast p1, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 740
    .line 741
    check-cast p2, La/qm5;

    .line 742
    .line 743
    check-cast p3, La/yje;

    .line 744
    .line 745
    new-instance p0, La/wx4;

    .line 746
    .line 747
    check-cast v1, La/fy4;

    .line 748
    .line 749
    const/4 v0, 0x1

    .line 750
    invoke-direct {p0, v1, p3, v0}, La/wx4;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 751
    .line 752
    .line 753
    iput-object p1, p0, La/wx4;->j:Ljava/lang/Object;

    .line 754
    .line 755
    iput-object p2, p0, La/wx4;->l:Ljava/lang/Object;

    .line 756
    .line 757
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 758
    .line 759
    invoke-virtual {p0, p1}, La/wx4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 760
    .line 761
    .line 762
    move-result-object p0

    .line 763
    return-object p0

    .line 764
    :pswitch_1c
    check-cast p1, Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;

    .line 765
    .line 766
    check-cast p2, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 767
    .line 768
    check-cast p3, La/yje;

    .line 769
    .line 770
    new-instance p0, La/wx4;

    .line 771
    .line 772
    check-cast v1, La/fy4;

    .line 773
    .line 774
    const/4 v0, 0x0

    .line 775
    invoke-direct {p0, v1, p3, v0}, La/wx4;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 776
    .line 777
    .line 778
    iput-object p1, p0, La/wx4;->l:Ljava/lang/Object;

    .line 779
    .line 780
    iput-object p2, p0, La/wx4;->j:Ljava/lang/Object;

    .line 781
    .line 782
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 783
    .line 784
    invoke-virtual {p0, p1}, La/wx4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    move-result-object p0

    .line 788
    return-object p0

    .line 789
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 46

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/wx4;->i:B

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    const-string v6, ""

    .line 8
    .line 9
    const/4 v7, 0x0

    .line 10
    const/4 v8, 0x1

    .line 11
    const/4 v9, 0x0

    .line 12
    iget-object v10, v0, La/wx4;->k:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, La/wx4;->l:Ljava/lang/Object;

    .line 18
    .line 19
    move-object v4, v1

    .line 20
    check-cast v4, Ljava/util/List;

    .line 21
    .line 22
    iget-object v0, v0, La/wx4;->j:Ljava/lang/Object;

    .line 23
    .line 24
    move-object v5, v0

    .line 25
    check-cast v5, Ljava/util/List;

    .line 26
    .line 27
    sget-object v0, La/wne;->a:La/wne;

    .line 28
    .line 29
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    check-cast v10, La/b3a0;

    .line 33
    .line 34
    sget v0, La/b3a0;->x:I

    .line 35
    .line 36
    iget-object v0, v10, La/i3t0;->i:La/ocj;

    .line 37
    .line 38
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 39
    .line 40
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-object v2, v0

    .line 48
    check-cast v2, La/p2a0;

    .line 49
    .line 50
    const/4 v6, 0x0

    .line 51
    const/4 v7, 0x7

    .line 52
    const/4 v3, 0x0

    .line 53
    invoke-static/range {v2 .. v7}, La/p2a0;->a(La/p2a0;ZLjava/util/List;Ljava/util/List;ZI)La/p2a0;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_0

    .line 62
    .line 63
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object v0

    .line 66
    :pswitch_0
    invoke-direct/range {p0 .. p1}, La/wx4;->R(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    return-object v0

    .line 71
    :pswitch_1
    invoke-direct/range {p0 .. p1}, La/wx4;->Q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    return-object v0

    .line 76
    :pswitch_2
    invoke-direct/range {p0 .. p1}, La/wx4;->M(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    return-object v0

    .line 81
    :pswitch_3
    invoke-direct/range {p0 .. p1}, La/wx4;->L(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    return-object v0

    .line 86
    :pswitch_4
    invoke-direct/range {p0 .. p1}, La/wx4;->K(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    return-object v0

    .line 91
    :pswitch_5
    invoke-direct/range {p0 .. p1}, La/wx4;->I(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    return-object v0

    .line 96
    :pswitch_6
    invoke-direct/range {p0 .. p1}, La/wx4;->J(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    return-object v0

    .line 101
    :pswitch_7
    invoke-direct/range {p0 .. p1}, La/wx4;->H(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    return-object v0

    .line 106
    :pswitch_8
    invoke-direct/range {p0 .. p1}, La/wx4;->G(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    return-object v0

    .line 111
    :pswitch_9
    invoke-direct/range {p0 .. p1}, La/wx4;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    return-object v0

    .line 116
    :pswitch_a
    iget-object v1, v0, La/wx4;->l:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v1, Ljava/util/List;

    .line 119
    .line 120
    iget-object v0, v0, La/wx4;->j:Ljava/lang/Object;

    .line 121
    .line 122
    move-object v8, v0

    .line 123
    check-cast v8, Ljava/util/List;

    .line 124
    .line 125
    sget-object v0, La/wne;->a:La/wne;

    .line 126
    .line 127
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    move-object v2, v10

    .line 131
    check-cast v2, La/gu1;

    .line 132
    .line 133
    new-instance v4, La/k98;

    .line 134
    .line 135
    invoke-direct {v4, v1}, La/k98;-><init>(Ljava/util/List;)V

    .line 136
    .line 137
    .line 138
    const-wide/16 v6, 0x0

    .line 139
    .line 140
    const v9, 0x1ff7f

    .line 141
    .line 142
    .line 143
    const/4 v3, 0x0

    .line 144
    const/4 v5, 0x0

    .line 145
    invoke-static/range {v2 .. v9}, La/gu1;->a(La/gu1;ZLa/k98;La/gqt0;JLjava/util/List;I)La/gu1;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    return-object v0

    .line 150
    :pswitch_b
    invoke-direct/range {p0 .. p1}, La/wx4;->x(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    return-object v0

    .line 155
    :pswitch_c
    invoke-direct/range {p0 .. p1}, La/wx4;->t(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    return-object v0

    .line 160
    :pswitch_d
    invoke-direct/range {p0 .. p1}, La/wx4;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    return-object v0

    .line 165
    :pswitch_e
    iget-object v1, v0, La/wx4;->l:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v1, La/eh6;

    .line 168
    .line 169
    iget-object v0, v0, La/wx4;->j:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v0, La/u5s;

    .line 172
    .line 173
    sget-object v2, La/wne;->a:La/wne;

    .line 174
    .line 175
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    new-instance v2, La/ml6;

    .line 179
    .line 180
    check-cast v10, La/uii;

    .line 181
    .line 182
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    sget-object v3, La/ch6;->a:La/ch6;

    .line 186
    .line 187
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    if-eqz v3, :cond_1

    .line 192
    .line 193
    instance-of v7, v0, La/j5s;

    .line 194
    .line 195
    goto :goto_1

    .line 196
    :cond_1
    sget-object v0, La/bh6;->a:La/bh6;

    .line 197
    .line 198
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-eqz v0, :cond_3

    .line 203
    .line 204
    :cond_2
    :goto_0
    move v7, v8

    .line 205
    goto :goto_1

    .line 206
    :cond_3
    instance-of v0, v1, La/dh6;

    .line 207
    .line 208
    if-eqz v0, :cond_6

    .line 209
    .line 210
    check-cast v1, La/dh6;

    .line 211
    .line 212
    iget-object v0, v1, La/dh6;->a:Ljava/util/ArrayList;

    .line 213
    .line 214
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    if-eqz v1, :cond_4

    .line 219
    .line 220
    goto :goto_0

    .line 221
    :cond_4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    if-eqz v1, :cond_2

    .line 230
    .line 231
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    check-cast v1, La/xf6;

    .line 236
    .line 237
    iget-object v1, v1, La/xf6;->b:Ljava/util/List;

    .line 238
    .line 239
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    if-nez v1, :cond_5

    .line 244
    .line 245
    :goto_1
    invoke-direct {v2, v7}, La/ml6;-><init>(Z)V

    .line 246
    .line 247
    .line 248
    move-object v9, v2

    .line 249
    goto :goto_2

    .line 250
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 251
    .line 252
    .line 253
    :goto_2
    return-object v9

    .line 254
    :pswitch_f
    invoke-direct/range {p0 .. p1}, La/wx4;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    return-object v0

    .line 259
    :pswitch_10
    invoke-direct/range {p0 .. p1}, La/wx4;->o(Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    return-object v0

    .line 264
    :pswitch_11
    iget-object v1, v0, La/wx4;->l:Ljava/lang/Object;

    .line 265
    .line 266
    check-cast v1, Ljava/util/List;

    .line 267
    .line 268
    iget-object v0, v0, La/wx4;->j:Ljava/lang/Object;

    .line 269
    .line 270
    check-cast v0, Ljava/lang/String;

    .line 271
    .line 272
    sget-object v2, La/wne;->a:La/wne;

    .line 273
    .line 274
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    sget v2, La/uhs;->J:I

    .line 278
    .line 279
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 280
    .line 281
    .line 282
    move-result v2

    .line 283
    if-lez v2, :cond_9

    .line 284
    .line 285
    new-instance v2, Ljava/util/ArrayList;

    .line 286
    .line 287
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 288
    .line 289
    .line 290
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    :cond_7
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 295
    .line 296
    .line 297
    move-result v3

    .line 298
    if-eqz v3, :cond_8

    .line 299
    .line 300
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v3

    .line 304
    move-object v4, v3

    .line 305
    check-cast v4, La/klr;

    .line 306
    .line 307
    invoke-virtual {v4, v0}, La/klr;->a(Ljava/lang/String;)Z

    .line 308
    .line 309
    .line 310
    move-result v4

    .line 311
    if-eqz v4, :cond_7

    .line 312
    .line 313
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    goto :goto_3

    .line 317
    :cond_8
    move-object v1, v2

    .line 318
    :cond_9
    return-object v1

    .line 319
    :pswitch_12
    invoke-direct/range {p0 .. p1}, La/wx4;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    return-object v0

    .line 324
    :pswitch_13
    invoke-direct/range {p0 .. p1}, La/wx4;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    return-object v0

    .line 329
    :pswitch_14
    iget-object v1, v0, La/wx4;->l:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v1, La/ljg;

    .line 332
    .line 333
    iget-object v0, v0, La/wx4;->j:Ljava/lang/Object;

    .line 334
    .line 335
    check-cast v0, La/qrh;

    .line 336
    .line 337
    sget-object v2, La/wne;->a:La/wne;

    .line 338
    .line 339
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    check-cast v10, La/m9s;

    .line 343
    .line 344
    iget-object v2, v10, La/m9s;->I:La/cqg;

    .line 345
    .line 346
    instance-of v3, v2, La/d0u0;

    .line 347
    .line 348
    if-eqz v3, :cond_a

    .line 349
    .line 350
    move-object v9, v2

    .line 351
    check-cast v9, La/d0u0;

    .line 352
    .line 353
    :cond_a
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 357
    .line 358
    .line 359
    if-nez v9, :cond_b

    .line 360
    .line 361
    new-instance v11, La/d0u0;

    .line 362
    .line 363
    new-instance v12, La/i1u0;

    .line 364
    .line 365
    sget-object v2, La/iun;->a:La/iun;

    .line 366
    .line 367
    invoke-direct {v12, v6, v2, v7}, La/i1u0;-><init>(Ljava/lang/String;Ljava/util/List;I)V

    .line 368
    .line 369
    .line 370
    new-instance v13, La/g2u0;

    .line 371
    .line 372
    sget-object v3, La/lun;->a:La/lun;

    .line 373
    .line 374
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    sget-object v4, La/u1u0;->c:La/u1u0;

    .line 378
    .line 379
    invoke-direct {v13, v7, v3, v4, v2}, La/g2u0;-><init>(ILjava/util/Map;La/u1u0;Ljava/util/List;)V

    .line 380
    .line 381
    .line 382
    new-instance v14, La/g2u0;

    .line 383
    .line 384
    invoke-direct {v14, v7, v3, v4, v2}, La/g2u0;-><init>(ILjava/util/Map;La/u1u0;Ljava/util/List;)V

    .line 385
    .line 386
    .line 387
    const/4 v15, 0x0

    .line 388
    const-string v16, ""

    .line 389
    .line 390
    invoke-direct/range {v11 .. v16}, La/d0u0;-><init>(La/i1u0;La/g2u0;La/g2u0;ZLjava/lang/String;)V

    .line 391
    .line 392
    .line 393
    goto :goto_4

    .line 394
    :cond_b
    move-object v11, v9

    .line 395
    :goto_4
    invoke-static {v0}, La/ofm0;->q(La/qrh;)Z

    .line 396
    .line 397
    .line 398
    move-result v2

    .line 399
    if-eqz v2, :cond_d

    .line 400
    .line 401
    invoke-static {v11, v10}, La/ofm0;->r(La/d0u0;La/m9s;)Z

    .line 402
    .line 403
    .line 404
    move-result v2

    .line 405
    if-eqz v2, :cond_d

    .line 406
    .line 407
    invoke-static {v1, v10}, La/x2x;->b0(La/ljg;La/m9s;)Z

    .line 408
    .line 409
    .line 410
    move-result v2

    .line 411
    if-eqz v2, :cond_d

    .line 412
    .line 413
    invoke-static {v11}, La/ofm0;->u(La/d0u0;)Z

    .line 414
    .line 415
    .line 416
    move-result v2

    .line 417
    if-eqz v2, :cond_d

    .line 418
    .line 419
    invoke-static {v11}, La/ofm0;->t(La/d0u0;)Z

    .line 420
    .line 421
    .line 422
    move-result v2

    .line 423
    if-eqz v2, :cond_d

    .line 424
    .line 425
    invoke-static {v0}, La/ofm0;->s(La/qrh;)Z

    .line 426
    .line 427
    .line 428
    move-result v2

    .line 429
    if-nez v2, :cond_c

    .line 430
    .line 431
    goto :goto_5

    .line 432
    :cond_c
    move v8, v7

    .line 433
    :cond_d
    :goto_5
    if-nez v9, :cond_e

    .line 434
    .line 435
    new-instance v10, La/d0u0;

    .line 436
    .line 437
    new-instance v11, La/i1u0;

    .line 438
    .line 439
    sget-object v2, La/iun;->a:La/iun;

    .line 440
    .line 441
    invoke-direct {v11, v6, v2, v7}, La/i1u0;-><init>(Ljava/lang/String;Ljava/util/List;I)V

    .line 442
    .line 443
    .line 444
    new-instance v12, La/g2u0;

    .line 445
    .line 446
    sget-object v3, La/lun;->a:La/lun;

    .line 447
    .line 448
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    sget-object v4, La/u1u0;->c:La/u1u0;

    .line 452
    .line 453
    invoke-direct {v12, v7, v3, v4, v2}, La/g2u0;-><init>(ILjava/util/Map;La/u1u0;Ljava/util/List;)V

    .line 454
    .line 455
    .line 456
    new-instance v13, La/g2u0;

    .line 457
    .line 458
    invoke-direct {v13, v7, v3, v4, v2}, La/g2u0;-><init>(ILjava/util/Map;La/u1u0;Ljava/util/List;)V

    .line 459
    .line 460
    .line 461
    const/4 v14, 0x0

    .line 462
    const-string v15, ""

    .line 463
    .line 464
    invoke-direct/range {v10 .. v15}, La/d0u0;-><init>(La/i1u0;La/g2u0;La/g2u0;ZLjava/lang/String;)V

    .line 465
    .line 466
    .line 467
    move-object v9, v10

    .line 468
    :cond_e
    new-instance v2, La/vxt0;

    .line 469
    .line 470
    invoke-direct {v2, v9, v8, v0, v1}, La/vxt0;-><init>(La/d0u0;ZLa/qrh;La/ljg;)V

    .line 471
    .line 472
    .line 473
    return-object v2

    .line 474
    :pswitch_15
    iget-object v1, v0, La/wx4;->l:Ljava/lang/Object;

    .line 475
    .line 476
    move-object v14, v1

    .line 477
    check-cast v14, La/y3h;

    .line 478
    .line 479
    iget-object v0, v0, La/wx4;->j:Ljava/lang/Object;

    .line 480
    .line 481
    check-cast v0, La/ljg;

    .line 482
    .line 483
    sget-object v1, La/wne;->a:La/wne;

    .line 484
    .line 485
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 486
    .line 487
    .line 488
    check-cast v10, La/m9s;

    .line 489
    .line 490
    iget-object v1, v10, La/m9s;->I:La/cqg;

    .line 491
    .line 492
    instance-of v2, v1, La/p310;

    .line 493
    .line 494
    if-eqz v2, :cond_f

    .line 495
    .line 496
    move-object v9, v1

    .line 497
    check-cast v9, La/p310;

    .line 498
    .line 499
    :cond_f
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 500
    .line 501
    .line 502
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 503
    .line 504
    .line 505
    new-instance v15, La/ic6;

    .line 506
    .line 507
    iget-object v1, v14, La/y3h;->a:Ljava/lang/String;

    .line 508
    .line 509
    iget-object v2, v14, La/y3h;->c:Ljava/util/List;

    .line 510
    .line 511
    invoke-static {v1, v2}, La/uc9;->T(Ljava/lang/String;Ljava/util/List;)La/fc6;

    .line 512
    .line 513
    .line 514
    move-result-object v1

    .line 515
    iget-object v2, v14, La/y3h;->e:Ljava/lang/String;

    .line 516
    .line 517
    iget-object v3, v14, La/y3h;->g:Ljava/util/List;

    .line 518
    .line 519
    invoke-static {v2, v3}, La/uc9;->T(Ljava/lang/String;Ljava/util/List;)La/fc6;

    .line 520
    .line 521
    .line 522
    move-result-object v2

    .line 523
    invoke-direct {v15, v1, v2}, La/ic6;-><init>(La/fc6;La/fc6;)V

    .line 524
    .line 525
    .line 526
    if-nez v9, :cond_10

    .line 527
    .line 528
    new-instance v1, La/p310;

    .line 529
    .line 530
    new-instance v16, La/o310;

    .line 531
    .line 532
    new-instance v17, La/a610;

    .line 533
    .line 534
    sget-object v23, La/iun;->a:La/iun;

    .line 535
    .line 536
    sget-object v24, La/d310;->d:La/d310;

    .line 537
    .line 538
    const/high16 v25, -0x40800000    # -1.0f

    .line 539
    .line 540
    const/16 v18, 0x0

    .line 541
    .line 542
    const/16 v19, -0x1

    .line 543
    .line 544
    const/16 v20, -0x1

    .line 545
    .line 546
    const/16 v21, -0x1

    .line 547
    .line 548
    const/16 v22, -0x1

    .line 549
    .line 550
    move-object/from16 v26, v23

    .line 551
    .line 552
    invoke-direct/range {v17 .. v26}, La/a610;-><init>(IIIIILjava/util/List;La/d310;FLjava/util/List;)V

    .line 553
    .line 554
    .line 555
    new-instance v18, La/a610;

    .line 556
    .line 557
    const/16 v23, -0x1

    .line 558
    .line 559
    move-object/from16 v25, v24

    .line 560
    .line 561
    move-object/from16 v24, v26

    .line 562
    .line 563
    const/high16 v26, -0x40800000    # -1.0f

    .line 564
    .line 565
    const/16 v19, 0x0

    .line 566
    .line 567
    move-object/from16 v27, v24

    .line 568
    .line 569
    invoke-direct/range {v18 .. v27}, La/a610;-><init>(IIIIILjava/util/List;La/d310;FLjava/util/List;)V

    .line 570
    .line 571
    .line 572
    move-object/from16 v23, v24

    .line 573
    .line 574
    sget-object v30, La/zz00;->a:La/zz00;

    .line 575
    .line 576
    const-wide/16 v31, 0x0

    .line 577
    .line 578
    const-wide/16 v33, 0x0

    .line 579
    .line 580
    move-object/from16 v24, v17

    .line 581
    .line 582
    move-object/from16 v25, v18

    .line 583
    .line 584
    const-wide/16 v17, 0x0

    .line 585
    .line 586
    const-wide/16 v19, 0x0

    .line 587
    .line 588
    const/16 v21, 0x0

    .line 589
    .line 590
    const/16 v22, 0x0

    .line 591
    .line 592
    move-object/from16 v26, v23

    .line 593
    .line 594
    const/16 v23, 0x0

    .line 595
    .line 596
    move-object/from16 v27, v26

    .line 597
    .line 598
    move-object/from16 v28, v26

    .line 599
    .line 600
    move-object/from16 v29, v26

    .line 601
    .line 602
    move-object/from16 v35, v26

    .line 603
    .line 604
    move-object/from16 v36, v26

    .line 605
    .line 606
    move-object/from16 v37, v26

    .line 607
    .line 608
    invoke-direct/range {v16 .. v37}, La/o310;-><init>(JJIIILa/a610;La/a610;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;La/zz00;JJLjava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 609
    .line 610
    .line 611
    move-object/from16 v2, v16

    .line 612
    .line 613
    move-object/from16 v3, v26

    .line 614
    .line 615
    invoke-direct {v1, v2, v3}, La/p310;-><init>(La/o310;Ljava/util/List;)V

    .line 616
    .line 617
    .line 618
    goto :goto_6

    .line 619
    :cond_10
    move-object v1, v9

    .line 620
    :goto_6
    iget-object v2, v1, La/p310;->a:La/o310;

    .line 621
    .line 622
    invoke-static {v2}, La/idx;->I(La/o310;)Z

    .line 623
    .line 624
    .line 625
    move-result v3

    .line 626
    if-eqz v3, :cond_12

    .line 627
    .line 628
    invoke-static {v2}, La/idx;->J(La/o310;)Z

    .line 629
    .line 630
    .line 631
    move-result v3

    .line 632
    if-eqz v3, :cond_12

    .line 633
    .line 634
    invoke-static {v2}, La/idx;->G(La/o310;)Z

    .line 635
    .line 636
    .line 637
    move-result v3

    .line 638
    if-eqz v3, :cond_12

    .line 639
    .line 640
    iget-object v1, v1, La/p310;->b:Ljava/util/List;

    .line 641
    .line 642
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 643
    .line 644
    .line 645
    move-result v1

    .line 646
    if-eqz v1, :cond_12

    .line 647
    .line 648
    invoke-static {v14}, La/idx;->E(La/y3h;)Z

    .line 649
    .line 650
    .line 651
    move-result v1

    .line 652
    if-eqz v1, :cond_12

    .line 653
    .line 654
    invoke-static {v15}, La/rq8;->R(La/ic6;)Z

    .line 655
    .line 656
    .line 657
    move-result v1

    .line 658
    if-eqz v1, :cond_12

    .line 659
    .line 660
    invoke-static {v2}, La/idx;->F(La/o310;)Z

    .line 661
    .line 662
    .line 663
    move-result v1

    .line 664
    if-eqz v1, :cond_12

    .line 665
    .line 666
    invoke-static {v2}, La/idx;->H(La/o310;)Z

    .line 667
    .line 668
    .line 669
    move-result v1

    .line 670
    if-eqz v1, :cond_12

    .line 671
    .line 672
    invoke-static {v0, v10}, La/x2x;->b0(La/ljg;La/m9s;)Z

    .line 673
    .line 674
    .line 675
    move-result v1

    .line 676
    if-eqz v1, :cond_12

    .line 677
    .line 678
    iget-object v1, v14, La/y3h;->d:La/c110;

    .line 679
    .line 680
    iget-object v2, v14, La/y3h;->h:La/c110;

    .line 681
    .line 682
    invoke-static {v1, v2}, La/x2x;->Y(La/c110;La/c110;)Z

    .line 683
    .line 684
    .line 685
    move-result v1

    .line 686
    if-nez v1, :cond_11

    .line 687
    .line 688
    goto :goto_7

    .line 689
    :cond_11
    move v13, v7

    .line 690
    goto :goto_8

    .line 691
    :cond_12
    :goto_7
    move v13, v8

    .line 692
    :goto_8
    new-instance v11, La/k4h;

    .line 693
    .line 694
    if-nez v9, :cond_13

    .line 695
    .line 696
    new-instance v9, La/p310;

    .line 697
    .line 698
    new-instance v16, La/o310;

    .line 699
    .line 700
    new-instance v17, La/a610;

    .line 701
    .line 702
    sget-object v23, La/iun;->a:La/iun;

    .line 703
    .line 704
    sget-object v24, La/d310;->d:La/d310;

    .line 705
    .line 706
    const/high16 v25, -0x40800000    # -1.0f

    .line 707
    .line 708
    const/16 v18, 0x0

    .line 709
    .line 710
    const/16 v19, -0x1

    .line 711
    .line 712
    const/16 v20, -0x1

    .line 713
    .line 714
    const/16 v21, -0x1

    .line 715
    .line 716
    const/16 v22, -0x1

    .line 717
    .line 718
    move-object/from16 v26, v23

    .line 719
    .line 720
    invoke-direct/range {v17 .. v26}, La/a610;-><init>(IIIIILjava/util/List;La/d310;FLjava/util/List;)V

    .line 721
    .line 722
    .line 723
    new-instance v18, La/a610;

    .line 724
    .line 725
    const/16 v23, -0x1

    .line 726
    .line 727
    move-object/from16 v25, v24

    .line 728
    .line 729
    move-object/from16 v24, v26

    .line 730
    .line 731
    const/high16 v26, -0x40800000    # -1.0f

    .line 732
    .line 733
    const/16 v19, 0x0

    .line 734
    .line 735
    move-object/from16 v27, v24

    .line 736
    .line 737
    invoke-direct/range {v18 .. v27}, La/a610;-><init>(IIIIILjava/util/List;La/d310;FLjava/util/List;)V

    .line 738
    .line 739
    .line 740
    move-object/from16 v23, v24

    .line 741
    .line 742
    sget-object v30, La/zz00;->a:La/zz00;

    .line 743
    .line 744
    const-wide/16 v31, 0x0

    .line 745
    .line 746
    const-wide/16 v33, 0x0

    .line 747
    .line 748
    move-object/from16 v24, v17

    .line 749
    .line 750
    move-object/from16 v25, v18

    .line 751
    .line 752
    const-wide/16 v17, 0x0

    .line 753
    .line 754
    const-wide/16 v19, 0x0

    .line 755
    .line 756
    const/16 v21, 0x0

    .line 757
    .line 758
    const/16 v22, 0x0

    .line 759
    .line 760
    move-object/from16 v26, v23

    .line 761
    .line 762
    const/16 v23, 0x0

    .line 763
    .line 764
    move-object/from16 v27, v26

    .line 765
    .line 766
    move-object/from16 v28, v26

    .line 767
    .line 768
    move-object/from16 v29, v26

    .line 769
    .line 770
    move-object/from16 v35, v26

    .line 771
    .line 772
    move-object/from16 v36, v26

    .line 773
    .line 774
    move-object/from16 v37, v26

    .line 775
    .line 776
    invoke-direct/range {v16 .. v37}, La/o310;-><init>(JJIIILa/a610;La/a610;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;La/zz00;JJLjava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 777
    .line 778
    .line 779
    move-object/from16 v1, v16

    .line 780
    .line 781
    move-object/from16 v2, v26

    .line 782
    .line 783
    invoke-direct {v9, v1, v2}, La/p310;-><init>(La/o310;Ljava/util/List;)V

    .line 784
    .line 785
    .line 786
    :cond_13
    move-object/from16 v16, v0

    .line 787
    .line 788
    move-object v12, v9

    .line 789
    invoke-direct/range {v11 .. v16}, La/k4h;-><init>(La/p310;ZLa/y3h;La/ic6;La/ljg;)V

    .line 790
    .line 791
    .line 792
    return-object v11

    .line 793
    :pswitch_16
    iget-object v1, v0, La/wx4;->l:Ljava/lang/Object;

    .line 794
    .line 795
    check-cast v1, Ljava/util/List;

    .line 796
    .line 797
    iget-object v0, v0, La/wx4;->j:Ljava/lang/Object;

    .line 798
    .line 799
    check-cast v0, Ljava/lang/String;

    .line 800
    .line 801
    sget-object v2, La/wne;->a:La/wne;

    .line 802
    .line 803
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 804
    .line 805
    .line 806
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 807
    .line 808
    .line 809
    move-result v2

    .line 810
    if-lez v2, :cond_1a

    .line 811
    .line 812
    new-instance v2, Ljava/util/ArrayList;

    .line 813
    .line 814
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 815
    .line 816
    .line 817
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 818
    .line 819
    .line 820
    move-result-object v1

    .line 821
    :cond_14
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 822
    .line 823
    .line 824
    move-result v3

    .line 825
    if-eqz v3, :cond_19

    .line 826
    .line 827
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 828
    .line 829
    .line 830
    move-result-object v3

    .line 831
    move-object v4, v3

    .line 832
    check-cast v4, La/d0t;

    .line 833
    .line 834
    sget v5, Lorg/xplatform/favorites/impl/presentation/category/a;->L:I

    .line 835
    .line 836
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 837
    .line 838
    .line 839
    move-result v5

    .line 840
    if-nez v5, :cond_15

    .line 841
    .line 842
    goto :goto_a

    .line 843
    :cond_15
    iget-object v5, v4, La/d0t;->o:Ljava/lang/String;

    .line 844
    .line 845
    invoke-static {v5, v0, v8}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 846
    .line 847
    .line 848
    move-result v5

    .line 849
    if-ne v5, v8, :cond_16

    .line 850
    .line 851
    goto :goto_a

    .line 852
    :cond_16
    iget-object v5, v4, La/d0t;->b:Ljava/lang/String;

    .line 853
    .line 854
    invoke-static {v5, v0, v8}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 855
    .line 856
    .line 857
    move-result v5

    .line 858
    if-ne v5, v8, :cond_17

    .line 859
    .line 860
    goto :goto_a

    .line 861
    :cond_17
    invoke-static {v4}, La/qzb;->c0(La/d0t;)Ljava/lang/String;

    .line 862
    .line 863
    .line 864
    move-result-object v5

    .line 865
    invoke-static {v5, v0, v8}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 866
    .line 867
    .line 868
    move-result v5

    .line 869
    if-nez v5, :cond_18

    .line 870
    .line 871
    invoke-static {v4}, La/qzb;->r0(La/d0t;)Ljava/lang/String;

    .line 872
    .line 873
    .line 874
    move-result-object v4

    .line 875
    invoke-static {v4, v0, v8}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 876
    .line 877
    .line 878
    move-result v4

    .line 879
    if-eqz v4, :cond_14

    .line 880
    .line 881
    :cond_18
    :goto_a
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 882
    .line 883
    .line 884
    goto :goto_9

    .line 885
    :cond_19
    move-object v1, v2

    .line 886
    :cond_1a
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 887
    .line 888
    .line 889
    move-result v0

    .line 890
    if-nez v0, :cond_1b

    .line 891
    .line 892
    move-object v2, v10

    .line 893
    check-cast v2, Lorg/xplatform/favorites/impl/presentation/category/a;

    .line 894
    .line 895
    iget-object v3, v2, Lorg/xplatform/favorites/impl/presentation/category/a;->q:La/hjd;

    .line 896
    .line 897
    new-instance v4, La/did;

    .line 898
    .line 899
    invoke-direct {v4, v1}, La/did;-><init>(Ljava/util/List;)V

    .line 900
    .line 901
    .line 902
    const/4 v6, 0x0

    .line 903
    const/4 v7, 0x6

    .line 904
    const/4 v5, 0x0

    .line 905
    invoke-static/range {v2 .. v7}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 906
    .line 907
    .line 908
    :cond_1b
    return-object v1

    .line 909
    :pswitch_17
    sget-object v1, La/wne;->a:La/wne;

    .line 910
    .line 911
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 912
    .line 913
    .line 914
    iget-object v1, v0, La/wx4;->l:Ljava/lang/Object;

    .line 915
    .line 916
    check-cast v1, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 917
    .line 918
    invoke-virtual {v1, v8}, Lorg/xplatform/uikit/components/buttons/DsButton;->setEnabled(Z)V

    .line 919
    .line 920
    .line 921
    iget-object v0, v0, La/wx4;->j:Ljava/lang/Object;

    .line 922
    .line 923
    check-cast v0, Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;

    .line 924
    .line 925
    invoke-static {v0}, Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;->a(Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;)Landroidx/appcompat/widget/AppCompatTextView;

    .line 926
    .line 927
    .line 928
    move-result-object v1

    .line 929
    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 930
    .line 931
    .line 932
    move-result-object v1

    .line 933
    const/4 v2, 0x0

    .line 934
    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 935
    .line 936
    .line 937
    invoke-static {v0}, Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;->a(Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;)Landroidx/appcompat/widget/AppCompatTextView;

    .line 938
    .line 939
    .line 940
    move-result-object v1

    .line 941
    const/16 v2, 0x8

    .line 942
    .line 943
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 944
    .line 945
    .line 946
    invoke-static {v0}, Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;->b(Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;)La/bby;

    .line 947
    .line 948
    .line 949
    move-result-object v0

    .line 950
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 951
    .line 952
    .line 953
    check-cast v10, Lkotlin/jvm/functions/Function0;

    .line 954
    .line 955
    invoke-interface {v10}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 956
    .line 957
    .line 958
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 959
    .line 960
    return-object v0

    .line 961
    :pswitch_18
    iget-object v1, v0, La/wx4;->l:Ljava/lang/Object;

    .line 962
    .line 963
    check-cast v1, La/l0j;

    .line 964
    .line 965
    iget-object v0, v0, La/wx4;->j:Ljava/lang/Object;

    .line 966
    .line 967
    check-cast v0, La/sw00;

    .line 968
    .line 969
    sget-object v2, La/wne;->a:La/wne;

    .line 970
    .line 971
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 972
    .line 973
    .line 974
    check-cast v10, La/f3j;

    .line 975
    .line 976
    iget-object v2, v10, La/f3j;->o:Ljava/lang/Object;

    .line 977
    .line 978
    check-cast v2, La/sff0;

    .line 979
    .line 980
    iget-object v2, v2, La/sff0;->b:La/hl1;

    .line 981
    .line 982
    iget-boolean v3, v2, La/hl1;->z:Z

    .line 983
    .line 984
    iget-boolean v4, v2, La/hl1;->A:Z

    .line 985
    .line 986
    iget-boolean v5, v0, La/sw00;->a:Z

    .line 987
    .line 988
    iget-object v6, v1, La/l0j;->c:La/n85;

    .line 989
    .line 990
    iget-object v7, v1, La/l0j;->a:La/n85;

    .line 991
    .line 992
    iget-object v8, v1, La/l0j;->b:La/z6w;

    .line 993
    .line 994
    invoke-static/range {v3 .. v8}, La/ieb;->U(ZZZLa/n85;La/n85;La/z6w;)La/d3j;

    .line 995
    .line 996
    .line 997
    move-result-object v0

    .line 998
    instance-of v1, v0, La/b3j;

    .line 999
    .line 1000
    if-eqz v1, :cond_1c

    .line 1001
    .line 1002
    sget-object v0, La/j3j;->a:La/j3j;

    .line 1003
    .line 1004
    goto :goto_b

    .line 1005
    :cond_1c
    new-instance v1, La/i3j;

    .line 1006
    .line 1007
    invoke-direct {v1, v0}, La/i3j;-><init>(La/d3j;)V

    .line 1008
    .line 1009
    .line 1010
    move-object v0, v1

    .line 1011
    :goto_b
    return-object v0

    .line 1012
    :pswitch_19
    iget-object v1, v0, La/wx4;->l:Ljava/lang/Object;

    .line 1013
    .line 1014
    check-cast v1, La/o4g;

    .line 1015
    .line 1016
    iget-object v0, v0, La/wx4;->j:Ljava/lang/Object;

    .line 1017
    .line 1018
    check-cast v0, La/c5g;

    .line 1019
    .line 1020
    sget-object v2, La/wne;->a:La/wne;

    .line 1021
    .line 1022
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1023
    .line 1024
    .line 1025
    :try_start_0
    check-cast v10, La/k8g;

    .line 1026
    .line 1027
    iget-object v2, v10, La/k8g;->i:La/p7m0;

    .line 1028
    .line 1029
    new-instance v3, La/ll9;

    .line 1030
    .line 1031
    iget-object v4, v10, La/k8g;->b:La/vzg0;

    .line 1032
    .line 1033
    const-string v6, "selected_month_key"

    .line 1034
    .line 1035
    invoke-virtual {v4, v6}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v4

    .line 1039
    check-cast v4, Ljava/lang/Integer;

    .line 1040
    .line 1041
    if-eqz v4, :cond_1d

    .line 1042
    .line 1043
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1044
    .line 1045
    .line 1046
    move-result v5

    .line 1047
    goto :goto_c

    .line 1048
    :cond_1d
    const/4 v5, -0x1

    .line 1049
    :goto_c
    invoke-static {v0, v1, v5}, La/v3c;->e0(La/c5g;La/o4g;I)La/jl9;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v0

    .line 1053
    invoke-direct {v3, v0}, La/ll9;-><init>(La/jl9;)V

    .line 1054
    .line 1055
    .line 1056
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1057
    .line 1058
    .line 1059
    invoke-virtual {v2, v9, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1060
    .line 1061
    .line 1062
    goto :goto_d

    .line 1063
    :catch_0
    move-exception v0

    .line 1064
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1065
    .line 1066
    .line 1067
    :goto_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1068
    .line 1069
    return-object v0

    .line 1070
    :pswitch_1a
    iget-object v1, v0, La/wx4;->l:Ljava/lang/Object;

    .line 1071
    .line 1072
    check-cast v1, Ljava/util/List;

    .line 1073
    .line 1074
    iget-object v0, v0, La/wx4;->j:Ljava/lang/Object;

    .line 1075
    .line 1076
    check-cast v0, Ljava/util/Set;

    .line 1077
    .line 1078
    check-cast v0, Ljava/util/Set;

    .line 1079
    .line 1080
    sget-object v2, La/wne;->a:La/wne;

    .line 1081
    .line 1082
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1083
    .line 1084
    .line 1085
    check-cast v10, La/yxb;

    .line 1086
    .line 1087
    iget-object v2, v10, La/yxb;->q:Ljava/util/HashMap;

    .line 1088
    .line 1089
    new-instance v3, Ljava/util/ArrayList;

    .line 1090
    .line 1091
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1092
    .line 1093
    .line 1094
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v11

    .line 1098
    move v12, v7

    .line 1099
    :goto_e
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 1100
    .line 1101
    .line 1102
    move-result v13

    .line 1103
    if-eqz v13, :cond_68

    .line 1104
    .line 1105
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v13

    .line 1109
    check-cast v13, La/a640;

    .line 1110
    .line 1111
    iget-object v14, v10, La/yxb;->p:La/pm50;

    .line 1112
    .line 1113
    sget-object v15, La/pm50;->c:La/pm50;

    .line 1114
    .line 1115
    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1116
    .line 1117
    .line 1118
    move-result v14

    .line 1119
    if-nez v14, :cond_1e

    .line 1120
    .line 1121
    if-nez v12, :cond_1e

    .line 1122
    .line 1123
    iget-object v14, v10, La/yxb;->p:La/pm50;

    .line 1124
    .line 1125
    iget v14, v14, La/pm50;->b:I

    .line 1126
    .line 1127
    invoke-virtual {v13}, La/a640;->b()I

    .line 1128
    .line 1129
    .line 1130
    move-result v15

    .line 1131
    if-ge v14, v15, :cond_1e

    .line 1132
    .line 1133
    iget-object v12, v10, La/yxb;->p:La/pm50;

    .line 1134
    .line 1135
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1136
    .line 1137
    .line 1138
    move v12, v8

    .line 1139
    :cond_1e
    invoke-virtual {v2, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v14

    .line 1143
    check-cast v14, La/p6t0;

    .line 1144
    .line 1145
    invoke-static {v14, v13}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1146
    .line 1147
    .line 1148
    move-result v15

    .line 1149
    if-nez v15, :cond_67

    .line 1150
    .line 1151
    iget-object v14, v10, La/yxb;->j:La/nhf0;

    .line 1152
    .line 1153
    iget-object v15, v10, La/yxb;->l:La/ctf0;

    .line 1154
    .line 1155
    iget-object v5, v10, La/yxb;->m:La/ywu;

    .line 1156
    .line 1157
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1158
    .line 1159
    .line 1160
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1161
    .line 1162
    .line 1163
    move-object/from16 v17, v9

    .line 1164
    .line 1165
    instance-of v9, v13, La/x540;

    .line 1166
    .line 1167
    if-eqz v9, :cond_2c

    .line 1168
    .line 1169
    move-object v9, v13

    .line 1170
    check-cast v9, La/x540;

    .line 1171
    .line 1172
    iget-object v4, v9, La/x540;->k:La/x640;

    .line 1173
    .line 1174
    move/from16 v27, v8

    .line 1175
    .line 1176
    iget-object v8, v9, La/x540;->f:La/xrt0;

    .line 1177
    .line 1178
    iget-object v7, v9, La/x540;->h:Ljava/util/List;

    .line 1179
    .line 1180
    move-object/from16 v22, v4

    .line 1181
    .line 1182
    iget-object v4, v9, La/x540;->g:Ljava/lang/String;

    .line 1183
    .line 1184
    move-object/from16 v29, v6

    .line 1185
    .line 1186
    instance-of v6, v8, La/srt0;

    .line 1187
    .line 1188
    move/from16 v18, v6

    .line 1189
    .line 1190
    iget v6, v9, La/x540;->c:I

    .line 1191
    .line 1192
    if-eqz v18, :cond_1f

    .line 1193
    .line 1194
    iget-object v8, v9, La/x540;->d:Ljava/lang/String;

    .line 1195
    .line 1196
    invoke-static {v4, v15, v7, v5}, La/j0x;->r(Ljava/lang/String;La/ctf0;Ljava/util/List;La/ywu;)Landroid/text/SpannableString;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v21

    .line 1200
    iget-object v4, v9, La/x540;->l:Ljava/util/Date;

    .line 1201
    .line 1202
    invoke-static/range {v22 .. v22}, La/j0x;->K(La/x640;)I

    .line 1203
    .line 1204
    .line 1205
    move-result v24

    .line 1206
    invoke-static/range {v22 .. v22}, La/j0x;->z(La/x640;)Z

    .line 1207
    .line 1208
    .line 1209
    move-result v25

    .line 1210
    new-instance v18, La/lfi0;

    .line 1211
    .line 1212
    move-object/from16 v23, v4

    .line 1213
    .line 1214
    move/from16 v19, v6

    .line 1215
    .line 1216
    move-object/from16 v20, v8

    .line 1217
    .line 1218
    invoke-direct/range {v18 .. v25}, La/lfi0;-><init>(ILjava/lang/String;Landroid/text/SpannableString;La/x640;Ljava/util/Date;IZ)V

    .line 1219
    .line 1220
    .line 1221
    move-object/from16 v19, v1

    .line 1222
    .line 1223
    move-object/from16 v22, v10

    .line 1224
    .line 1225
    move-object/from16 p0, v11

    .line 1226
    .line 1227
    move/from16 p1, v12

    .line 1228
    .line 1229
    move-object/from16 v14, v18

    .line 1230
    .line 1231
    const/4 v11, 0x0

    .line 1232
    move-object/from16 v18, v0

    .line 1233
    .line 1234
    goto/16 :goto_3a

    .line 1235
    .line 1236
    :cond_1f
    move/from16 v31, v6

    .line 1237
    .line 1238
    iget-object v6, v9, La/x540;->e:La/ilf0;

    .line 1239
    .line 1240
    move-object/from16 p0, v11

    .line 1241
    .line 1242
    if-eqz v6, :cond_20

    .line 1243
    .line 1244
    iget-object v11, v6, La/ilf0;->e:La/mlf0;

    .line 1245
    .line 1246
    goto :goto_f

    .line 1247
    :cond_20
    move-object/from16 v11, v17

    .line 1248
    .line 1249
    :goto_f
    if-nez v11, :cond_21

    .line 1250
    .line 1251
    move-object/from16 v18, v0

    .line 1252
    .line 1253
    move-object/from16 v19, v1

    .line 1254
    .line 1255
    move/from16 p1, v12

    .line 1256
    .line 1257
    goto/16 :goto_15

    .line 1258
    .line 1259
    :cond_21
    move/from16 p1, v12

    .line 1260
    .line 1261
    instance-of v12, v11, La/jlf0;

    .line 1262
    .line 1263
    if-eqz v12, :cond_24

    .line 1264
    .line 1265
    iget v12, v6, La/ilf0;->a:I

    .line 1266
    .line 1267
    move-object/from16 v18, v0

    .line 1268
    .line 1269
    iget-object v0, v6, La/ilf0;->c:La/xrt0;

    .line 1270
    .line 1271
    invoke-static {v0, v15}, La/j0x;->B(La/xrt0;La/ctf0;)Ljava/lang/String;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v0

    .line 1275
    check-cast v11, La/jlf0;

    .line 1276
    .line 1277
    move-object/from16 v19, v1

    .line 1278
    .line 1279
    iget-object v1, v11, La/jlf0;->a:Ljava/lang/String;

    .line 1280
    .line 1281
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1282
    .line 1283
    .line 1284
    move-result v20

    .line 1285
    if-nez v20, :cond_23

    .line 1286
    .line 1287
    iget-object v1, v11, La/jlf0;->b:Ljava/util/ArrayList;

    .line 1288
    .line 1289
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v1

    .line 1293
    check-cast v1, La/o540;

    .line 1294
    .line 1295
    if-eqz v1, :cond_22

    .line 1296
    .line 1297
    iget-object v1, v1, La/o540;->a:Ljava/lang/String;

    .line 1298
    .line 1299
    goto :goto_10

    .line 1300
    :cond_22
    move-object/from16 v1, v17

    .line 1301
    .line 1302
    :goto_10
    if-nez v1, :cond_23

    .line 1303
    .line 1304
    move-object/from16 v1, v29

    .line 1305
    .line 1306
    :cond_23
    iget-boolean v6, v6, La/ilf0;->d:Z

    .line 1307
    .line 1308
    new-instance v11, La/nlf0;

    .line 1309
    .line 1310
    invoke-direct {v11, v12, v0, v1, v6}, La/nlf0;-><init>(ILjava/lang/String;Ljava/lang/String;Z)V

    .line 1311
    .line 1312
    .line 1313
    :goto_11
    move-object/from16 v32, v11

    .line 1314
    .line 1315
    goto/16 :goto_16

    .line 1316
    .line 1317
    :cond_24
    move-object/from16 v18, v0

    .line 1318
    .line 1319
    move-object/from16 v19, v1

    .line 1320
    .line 1321
    instance-of v0, v11, La/klf0;

    .line 1322
    .line 1323
    if-eqz v0, :cond_29

    .line 1324
    .line 1325
    iget v0, v6, La/ilf0;->a:I

    .line 1326
    .line 1327
    check-cast v11, La/klf0;

    .line 1328
    .line 1329
    iget-object v1, v11, La/klf0;->b:Ljava/util/ArrayList;

    .line 1330
    .line 1331
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v12

    .line 1335
    check-cast v12, La/q540;

    .line 1336
    .line 1337
    if-eqz v12, :cond_26

    .line 1338
    .line 1339
    iget-object v12, v12, La/q540;->a:Ljava/lang/String;

    .line 1340
    .line 1341
    if-nez v12, :cond_25

    .line 1342
    .line 1343
    goto :goto_12

    .line 1344
    :cond_25
    move-object/from16 v34, v12

    .line 1345
    .line 1346
    goto :goto_13

    .line 1347
    :cond_26
    :goto_12
    move-object/from16 v34, v29

    .line 1348
    .line 1349
    :goto_13
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v1

    .line 1353
    check-cast v1, La/q540;

    .line 1354
    .line 1355
    if-eqz v1, :cond_27

    .line 1356
    .line 1357
    iget-object v1, v1, La/q540;->b:La/yos0;

    .line 1358
    .line 1359
    invoke-static {v1}, La/ibc;->j0(La/yos0;)Ljava/lang/String;

    .line 1360
    .line 1361
    .line 1362
    move-result-object v1

    .line 1363
    move-object/from16 v35, v1

    .line 1364
    .line 1365
    goto :goto_14

    .line 1366
    :cond_27
    move-object/from16 v35, v29

    .line 1367
    .line 1368
    :goto_14
    iget-object v1, v6, La/ilf0;->c:La/xrt0;

    .line 1369
    .line 1370
    invoke-static {v1, v15}, La/j0x;->B(La/xrt0;La/ctf0;)Ljava/lang/String;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v36

    .line 1374
    iget-object v1, v11, La/klf0;->a:Ljava/lang/String;

    .line 1375
    .line 1376
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1377
    .line 1378
    .line 1379
    move-result v11

    .line 1380
    if-nez v11, :cond_28

    .line 1381
    .line 1382
    const/4 v11, 0x0

    .line 1383
    new-array v1, v11, [Ljava/lang/Object;

    .line 1384
    .line 1385
    iget-object v12, v15, La/ctf0;->b:La/lsm0;

    .line 1386
    .line 1387
    invoke-static {v1, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1388
    .line 1389
    .line 1390
    move-result-object v1

    .line 1391
    const v11, 0x7f131480

    .line 1392
    .line 1393
    .line 1394
    invoke-virtual {v12, v11, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v1

    .line 1398
    :cond_28
    move-object/from16 v37, v1

    .line 1399
    .line 1400
    iget-boolean v1, v6, La/ilf0;->d:Z

    .line 1401
    .line 1402
    new-instance v32, La/olf0;

    .line 1403
    .line 1404
    move/from16 v33, v0

    .line 1405
    .line 1406
    move/from16 v38, v1

    .line 1407
    .line 1408
    invoke-direct/range {v32 .. v38}, La/olf0;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1409
    .line 1410
    .line 1411
    goto :goto_16

    .line 1412
    :cond_29
    instance-of v0, v11, La/llf0;

    .line 1413
    .line 1414
    if-eqz v0, :cond_2a

    .line 1415
    .line 1416
    new-instance v0, La/qlf0;

    .line 1417
    .line 1418
    iget v1, v6, La/ilf0;->a:I

    .line 1419
    .line 1420
    iget-object v12, v6, La/ilf0;->c:La/xrt0;

    .line 1421
    .line 1422
    invoke-static {v12, v15}, La/j0x;->B(La/xrt0;La/ctf0;)Ljava/lang/String;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v12

    .line 1426
    check-cast v11, La/llf0;

    .line 1427
    .line 1428
    iget-object v11, v11, La/llf0;->a:Ljava/lang/String;

    .line 1429
    .line 1430
    iget-boolean v6, v6, La/ilf0;->d:Z

    .line 1431
    .line 1432
    invoke-direct {v0, v1, v12, v11, v6}, La/qlf0;-><init>(ILjava/lang/String;Ljava/lang/String;Z)V

    .line 1433
    .line 1434
    .line 1435
    move-object/from16 v32, v0

    .line 1436
    .line 1437
    goto :goto_16

    .line 1438
    :cond_2a
    :goto_15
    sget-object v11, La/plf0;->a:La/plf0;

    .line 1439
    .line 1440
    goto :goto_11

    .line 1441
    :goto_16
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 1442
    .line 1443
    .line 1444
    move-result v0

    .line 1445
    if-lez v0, :cond_2b

    .line 1446
    .line 1447
    move/from16 v33, v27

    .line 1448
    .line 1449
    goto :goto_17

    .line 1450
    :cond_2b
    const/16 v33, 0x0

    .line 1451
    .line 1452
    :goto_17
    invoke-static {v4, v15, v7, v5}, La/j0x;->r(Ljava/lang/String;La/ctf0;Ljava/util/List;La/ywu;)Landroid/text/SpannableString;

    .line 1453
    .line 1454
    .line 1455
    move-result-object v34

    .line 1456
    iget-object v0, v9, La/x540;->l:Ljava/util/Date;

    .line 1457
    .line 1458
    iget-object v1, v9, La/x540;->k:La/x640;

    .line 1459
    .line 1460
    instance-of v4, v8, La/vrt0;

    .line 1461
    .line 1462
    iget-object v5, v9, La/x540;->i:Ljava/util/List;

    .line 1463
    .line 1464
    iget-object v6, v9, La/x540;->j:Ljava/util/List;

    .line 1465
    .line 1466
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 1467
    .line 1468
    .line 1469
    move-result v7

    .line 1470
    xor-int/lit8 v38, v7, 0x1

    .line 1471
    .line 1472
    invoke-static {v8, v14, v15}, La/btm0;->w(La/xrt0;La/nhf0;La/ctf0;)La/dtt0;

    .line 1473
    .line 1474
    .line 1475
    move-result-object v41

    .line 1476
    new-instance v30, La/ude0;

    .line 1477
    .line 1478
    move-object/from16 v36, v0

    .line 1479
    .line 1480
    move-object/from16 v35, v1

    .line 1481
    .line 1482
    move/from16 v37, v4

    .line 1483
    .line 1484
    move-object/from16 v39, v5

    .line 1485
    .line 1486
    move-object/from16 v40, v6

    .line 1487
    .line 1488
    invoke-direct/range {v30 .. v41}, La/ude0;-><init>(ILa/rlf0;ZLandroid/text/SpannableString;La/x640;Ljava/util/Date;ZZLjava/util/List;Ljava/util/List;La/dtt0;)V

    .line 1489
    .line 1490
    .line 1491
    move-object/from16 v22, v10

    .line 1492
    .line 1493
    :goto_18
    move-object/from16 v14, v30

    .line 1494
    .line 1495
    :goto_19
    const/4 v11, 0x0

    .line 1496
    goto/16 :goto_3a

    .line 1497
    .line 1498
    :cond_2c
    move-object/from16 v18, v0

    .line 1499
    .line 1500
    move-object/from16 v19, v1

    .line 1501
    .line 1502
    move-object/from16 v29, v6

    .line 1503
    .line 1504
    move/from16 v27, v8

    .line 1505
    .line 1506
    move-object/from16 p0, v11

    .line 1507
    .line 1508
    move/from16 p1, v12

    .line 1509
    .line 1510
    instance-of v0, v13, La/w540;

    .line 1511
    .line 1512
    if-eqz v0, :cond_35

    .line 1513
    .line 1514
    move-object v0, v13

    .line 1515
    check-cast v0, La/w540;

    .line 1516
    .line 1517
    iget v1, v0, La/w540;->c:I

    .line 1518
    .line 1519
    iget-object v4, v0, La/w540;->d:La/s540;

    .line 1520
    .line 1521
    iget-object v5, v4, La/s540;->b:La/v540;

    .line 1522
    .line 1523
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 1524
    .line 1525
    .line 1526
    move-result v5

    .line 1527
    if-eqz v5, :cond_34

    .line 1528
    .line 1529
    move/from16 v6, v27

    .line 1530
    .line 1531
    if-eq v5, v6, :cond_31

    .line 1532
    .line 1533
    const/4 v7, 0x2

    .line 1534
    if-ne v5, v7, :cond_30

    .line 1535
    .line 1536
    iget-object v4, v4, La/s540;->c:La/u540;

    .line 1537
    .line 1538
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 1539
    .line 1540
    .line 1541
    move-result v4

    .line 1542
    if-eqz v4, :cond_2f

    .line 1543
    .line 1544
    if-eq v4, v6, :cond_2e

    .line 1545
    .line 1546
    if-ne v4, v7, :cond_2d

    .line 1547
    .line 1548
    const/4 v11, 0x0

    .line 1549
    new-array v4, v11, [Ljava/lang/Object;

    .line 1550
    .line 1551
    iget-object v5, v15, La/ctf0;->b:La/lsm0;

    .line 1552
    .line 1553
    invoke-static {v4, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1554
    .line 1555
    .line 1556
    move-result-object v4

    .line 1557
    const v6, 0x7f131438

    .line 1558
    .line 1559
    .line 1560
    invoke-virtual {v5, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v4

    .line 1564
    goto/16 :goto_1b

    .line 1565
    .line 1566
    :cond_2d
    invoke-static {}, La/t9f;->b()V

    .line 1567
    .line 1568
    .line 1569
    :goto_1a
    move-object/from16 v9, v17

    .line 1570
    .line 1571
    goto/16 :goto_3e

    .line 1572
    .line 1573
    :cond_2e
    const/4 v11, 0x0

    .line 1574
    new-array v4, v11, [Ljava/lang/Object;

    .line 1575
    .line 1576
    iget-object v5, v15, La/ctf0;->b:La/lsm0;

    .line 1577
    .line 1578
    invoke-static {v4, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1579
    .line 1580
    .line 1581
    move-result-object v4

    .line 1582
    const v6, 0x7f131437

    .line 1583
    .line 1584
    .line 1585
    invoke-virtual {v5, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1586
    .line 1587
    .line 1588
    move-result-object v4

    .line 1589
    goto :goto_1b

    .line 1590
    :cond_2f
    const/4 v11, 0x0

    .line 1591
    new-array v4, v11, [Ljava/lang/Object;

    .line 1592
    .line 1593
    iget-object v5, v15, La/ctf0;->b:La/lsm0;

    .line 1594
    .line 1595
    invoke-static {v4, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1596
    .line 1597
    .line 1598
    move-result-object v4

    .line 1599
    const v6, 0x7f131436

    .line 1600
    .line 1601
    .line 1602
    invoke-virtual {v5, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1603
    .line 1604
    .line 1605
    move-result-object v4

    .line 1606
    goto :goto_1b

    .line 1607
    :cond_30
    invoke-static {}, La/t9f;->b()V

    .line 1608
    .line 1609
    .line 1610
    goto :goto_1a

    .line 1611
    :cond_31
    iget-object v4, v4, La/s540;->a:La/t540;

    .line 1612
    .line 1613
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 1614
    .line 1615
    .line 1616
    move-result v4

    .line 1617
    const/4 v5, 0x3

    .line 1618
    if-eq v4, v5, :cond_33

    .line 1619
    .line 1620
    const/4 v5, 0x4

    .line 1621
    const v6, 0x7f131434

    .line 1622
    .line 1623
    .line 1624
    if-eq v4, v5, :cond_32

    .line 1625
    .line 1626
    const/4 v11, 0x0

    .line 1627
    new-array v4, v11, [Ljava/lang/Object;

    .line 1628
    .line 1629
    iget-object v5, v15, La/ctf0;->b:La/lsm0;

    .line 1630
    .line 1631
    invoke-static {v4, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1632
    .line 1633
    .line 1634
    move-result-object v4

    .line 1635
    invoke-virtual {v5, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1636
    .line 1637
    .line 1638
    move-result-object v4

    .line 1639
    goto :goto_1b

    .line 1640
    :cond_32
    const/4 v11, 0x0

    .line 1641
    new-array v4, v11, [Ljava/lang/Object;

    .line 1642
    .line 1643
    iget-object v5, v15, La/ctf0;->b:La/lsm0;

    .line 1644
    .line 1645
    invoke-static {v4, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1646
    .line 1647
    .line 1648
    move-result-object v4

    .line 1649
    invoke-virtual {v5, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1650
    .line 1651
    .line 1652
    move-result-object v4

    .line 1653
    goto :goto_1b

    .line 1654
    :cond_33
    const/4 v11, 0x0

    .line 1655
    new-array v4, v11, [Ljava/lang/Object;

    .line 1656
    .line 1657
    iget-object v5, v15, La/ctf0;->b:La/lsm0;

    .line 1658
    .line 1659
    invoke-static {v4, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1660
    .line 1661
    .line 1662
    move-result-object v4

    .line 1663
    const v6, 0x7f131435

    .line 1664
    .line 1665
    .line 1666
    invoke-virtual {v5, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v4

    .line 1670
    goto :goto_1b

    .line 1671
    :cond_34
    const/4 v11, 0x0

    .line 1672
    new-array v4, v11, [Ljava/lang/Object;

    .line 1673
    .line 1674
    iget-object v5, v15, La/ctf0;->b:La/lsm0;

    .line 1675
    .line 1676
    invoke-static {v4, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1677
    .line 1678
    .line 1679
    move-result-object v4

    .line 1680
    const v6, 0x7f131433

    .line 1681
    .line 1682
    .line 1683
    invoke-virtual {v5, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1684
    .line 1685
    .line 1686
    move-result-object v4

    .line 1687
    :goto_1b
    iget-object v5, v0, La/w540;->g:Ljava/util/Date;

    .line 1688
    .line 1689
    iget-object v0, v0, La/w540;->f:La/x640;

    .line 1690
    .line 1691
    new-instance v6, La/z9o0;

    .line 1692
    .line 1693
    invoke-direct {v6, v1, v4, v0, v5}, La/z9o0;-><init>(ILjava/lang/String;La/x640;Ljava/util/Date;)V

    .line 1694
    .line 1695
    .line 1696
    move-object v14, v6

    .line 1697
    move-object/from16 v22, v10

    .line 1698
    .line 1699
    goto/16 :goto_19

    .line 1700
    .line 1701
    :cond_35
    instance-of v0, v13, La/p540;

    .line 1702
    .line 1703
    const/16 v1, 0xa

    .line 1704
    .line 1705
    if-eqz v0, :cond_42

    .line 1706
    .line 1707
    move-object v0, v13

    .line 1708
    check-cast v0, La/p540;

    .line 1709
    .line 1710
    iget-object v4, v0, La/p540;->f:La/xrt0;

    .line 1711
    .line 1712
    iget-object v6, v0, La/p540;->g:La/x640;

    .line 1713
    .line 1714
    iget-object v7, v0, La/p540;->j:Ljava/util/List;

    .line 1715
    .line 1716
    iget-object v8, v0, La/p540;->i:Ljava/lang/String;

    .line 1717
    .line 1718
    iget-object v9, v0, La/p540;->k:Ljava/util/List;

    .line 1719
    .line 1720
    new-instance v11, Ljava/util/ArrayList;

    .line 1721
    .line 1722
    invoke-static {v9, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1723
    .line 1724
    .line 1725
    move-result v1

    .line 1726
    invoke-direct {v11, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 1727
    .line 1728
    .line 1729
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1730
    .line 1731
    .line 1732
    move-result-object v1

    .line 1733
    :goto_1c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1734
    .line 1735
    .line 1736
    move-result v12

    .line 1737
    if-eqz v12, :cond_38

    .line 1738
    .line 1739
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1740
    .line 1741
    .line 1742
    move-result-object v12

    .line 1743
    check-cast v12, La/o540;

    .line 1744
    .line 1745
    move-object/from16 v20, v1

    .line 1746
    .line 1747
    iget-object v1, v12, La/o540;->a:Ljava/lang/String;

    .line 1748
    .line 1749
    move-object/from16 v21, v1

    .line 1750
    .line 1751
    iget-object v1, v12, La/o540;->d:La/yos0;

    .line 1752
    .line 1753
    move-object/from16 v36, v1

    .line 1754
    .line 1755
    invoke-static/range {v21 .. v21}, La/mbc;->Y(Ljava/lang/String;)Ljava/lang/String;

    .line 1756
    .line 1757
    .line 1758
    move-result-object v1

    .line 1759
    move-object/from16 v21, v6

    .line 1760
    .line 1761
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 1762
    .line 1763
    invoke-virtual {v1, v6}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1764
    .line 1765
    .line 1766
    move-result-object v1

    .line 1767
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1768
    .line 1769
    .line 1770
    new-instance v30, La/jzp;

    .line 1771
    .line 1772
    invoke-virtual/range {v36 .. v36}, La/yos0;->a()La/qos0;

    .line 1773
    .line 1774
    .line 1775
    move-result-object v31

    .line 1776
    iget-object v6, v12, La/o540;->a:Ljava/lang/String;

    .line 1777
    .line 1778
    move-object/from16 v23, v9

    .line 1779
    .line 1780
    move-object/from16 v22, v10

    .line 1781
    .line 1782
    iget-wide v9, v12, La/o540;->b:J

    .line 1783
    .line 1784
    iget-object v12, v12, La/o540;->c:Ljava/lang/String;

    .line 1785
    .line 1786
    move-object/from16 v32, v6

    .line 1787
    .line 1788
    long-to-float v6, v9

    .line 1789
    const/high16 v24, 0x49800000    # 1048576.0f

    .line 1790
    .line 1791
    cmpl-float v25, v6, v24

    .line 1792
    .line 1793
    move/from16 v33, v6

    .line 1794
    .line 1795
    const-string v6, "#.#"

    .line 1796
    .line 1797
    if-ltz v25, :cond_36

    .line 1798
    .line 1799
    move-wide/from16 v34, v9

    .line 1800
    .line 1801
    const/4 v9, 0x0

    .line 1802
    new-array v10, v9, [Ljava/lang/Object;

    .line 1803
    .line 1804
    const v9, 0x7f131432

    .line 1805
    .line 1806
    .line 1807
    invoke-virtual {v15, v9, v10}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1808
    .line 1809
    .line 1810
    move-result-object v9

    .line 1811
    div-float v10, v33, v24

    .line 1812
    .line 1813
    move/from16 v24, v10

    .line 1814
    .line 1815
    new-instance v10, Ljava/text/DecimalFormat;

    .line 1816
    .line 1817
    invoke-direct {v10, v6}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 1818
    .line 1819
    .line 1820
    sget-object v6, Ljava/math/RoundingMode;->HALF_EVEN:Ljava/math/RoundingMode;

    .line 1821
    .line 1822
    invoke-virtual {v10, v6}, Ljava/text/DecimalFormat;->setRoundingMode(Ljava/math/RoundingMode;)V

    .line 1823
    .line 1824
    .line 1825
    invoke-static/range {v24 .. v24}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1826
    .line 1827
    .line 1828
    move-result-object v6

    .line 1829
    invoke-virtual {v10, v6}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 1830
    .line 1831
    .line 1832
    move-result-object v6

    .line 1833
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1834
    .line 1835
    .line 1836
    filled-new-array {v6, v1}, [Ljava/lang/Object;

    .line 1837
    .line 1838
    .line 1839
    move-result-object v1

    .line 1840
    const/4 v6, 0x2

    .line 1841
    invoke-static {v1, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1842
    .line 1843
    .line 1844
    move-result-object v1

    .line 1845
    invoke-static {v9, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1846
    .line 1847
    .line 1848
    move-result-object v1

    .line 1849
    :goto_1d
    move-object/from16 v37, v1

    .line 1850
    .line 1851
    move-wide/from16 v33, v34

    .line 1852
    .line 1853
    move-object/from16 v35, v12

    .line 1854
    .line 1855
    goto :goto_1e

    .line 1856
    :cond_36
    move-wide/from16 v34, v9

    .line 1857
    .line 1858
    const/high16 v9, 0x44800000    # 1024.0f

    .line 1859
    .line 1860
    cmpl-float v10, v33, v9

    .line 1861
    .line 1862
    if-ltz v10, :cond_37

    .line 1863
    .line 1864
    move/from16 v24, v9

    .line 1865
    .line 1866
    const/4 v10, 0x0

    .line 1867
    new-array v9, v10, [Ljava/lang/Object;

    .line 1868
    .line 1869
    const v10, 0x7f131431

    .line 1870
    .line 1871
    .line 1872
    invoke-virtual {v15, v10, v9}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1873
    .line 1874
    .line 1875
    move-result-object v9

    .line 1876
    div-float v10, v33, v24

    .line 1877
    .line 1878
    move/from16 v24, v10

    .line 1879
    .line 1880
    new-instance v10, Ljava/text/DecimalFormat;

    .line 1881
    .line 1882
    invoke-direct {v10, v6}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 1883
    .line 1884
    .line 1885
    sget-object v6, Ljava/math/RoundingMode;->HALF_EVEN:Ljava/math/RoundingMode;

    .line 1886
    .line 1887
    invoke-virtual {v10, v6}, Ljava/text/DecimalFormat;->setRoundingMode(Ljava/math/RoundingMode;)V

    .line 1888
    .line 1889
    .line 1890
    invoke-static/range {v24 .. v24}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1891
    .line 1892
    .line 1893
    move-result-object v6

    .line 1894
    invoke-virtual {v10, v6}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 1895
    .line 1896
    .line 1897
    move-result-object v6

    .line 1898
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1899
    .line 1900
    .line 1901
    filled-new-array {v6, v1}, [Ljava/lang/Object;

    .line 1902
    .line 1903
    .line 1904
    move-result-object v1

    .line 1905
    const/4 v6, 0x2

    .line 1906
    invoke-static {v1, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1907
    .line 1908
    .line 1909
    move-result-object v1

    .line 1910
    invoke-static {v9, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1911
    .line 1912
    .line 1913
    move-result-object v1

    .line 1914
    goto :goto_1d

    .line 1915
    :cond_37
    const/4 v6, 0x2

    .line 1916
    const/4 v9, 0x0

    .line 1917
    new-array v10, v9, [Ljava/lang/Object;

    .line 1918
    .line 1919
    const v9, 0x7f131430

    .line 1920
    .line 1921
    .line 1922
    invoke-virtual {v15, v9, v10}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1923
    .line 1924
    .line 1925
    move-result-object v9

    .line 1926
    invoke-static/range {v34 .. v35}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1927
    .line 1928
    .line 1929
    move-result-object v10

    .line 1930
    filled-new-array {v10, v1}, [Ljava/lang/Object;

    .line 1931
    .line 1932
    .line 1933
    move-result-object v1

    .line 1934
    invoke-static {v1, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1935
    .line 1936
    .line 1937
    move-result-object v1

    .line 1938
    invoke-static {v9, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1939
    .line 1940
    .line 1941
    move-result-object v1

    .line 1942
    goto :goto_1d

    .line 1943
    :goto_1e
    invoke-direct/range {v30 .. v37}, La/jzp;-><init>(La/qos0;Ljava/lang/String;JLjava/lang/String;La/yos0;Ljava/lang/String;)V

    .line 1944
    .line 1945
    .line 1946
    move-object/from16 v1, v30

    .line 1947
    .line 1948
    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1949
    .line 1950
    .line 1951
    move-object/from16 v1, v20

    .line 1952
    .line 1953
    move-object/from16 v6, v21

    .line 1954
    .line 1955
    move-object/from16 v10, v22

    .line 1956
    .line 1957
    move-object/from16 v9, v23

    .line 1958
    .line 1959
    goto/16 :goto_1c

    .line 1960
    .line 1961
    :cond_38
    move-object/from16 v21, v6

    .line 1962
    .line 1963
    move-object/from16 v23, v9

    .line 1964
    .line 1965
    move-object/from16 v22, v10

    .line 1966
    .line 1967
    instance-of v1, v4, La/srt0;

    .line 1968
    .line 1969
    iget v6, v0, La/p540;->c:I

    .line 1970
    .line 1971
    if-eqz v1, :cond_3d

    .line 1972
    .line 1973
    iget-object v1, v0, La/p540;->e:Ljava/lang/String;

    .line 1974
    .line 1975
    invoke-static {v8, v15, v7, v5}, La/j0x;->r(Ljava/lang/String;La/ctf0;Ljava/util/List;La/ywu;)Landroid/text/SpannableString;

    .line 1976
    .line 1977
    .line 1978
    move-result-object v33

    .line 1979
    invoke-static/range {v21 .. v21}, La/j0x;->K(La/x640;)I

    .line 1980
    .line 1981
    .line 1982
    move-result v35

    .line 1983
    iget-object v0, v0, La/p540;->h:Ljava/util/Date;

    .line 1984
    .line 1985
    invoke-static/range {v21 .. v21}, La/j0x;->z(La/x640;)Z

    .line 1986
    .line 1987
    .line 1988
    move-result v5

    .line 1989
    if-nez v5, :cond_3c

    .line 1990
    .line 1991
    invoke-interface/range {v23 .. v23}, Ljava/util/Collection;->isEmpty()Z

    .line 1992
    .line 1993
    .line 1994
    move-result v5

    .line 1995
    if-eqz v5, :cond_39

    .line 1996
    .line 1997
    goto :goto_1f

    .line 1998
    :cond_39
    invoke-interface/range {v23 .. v23}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1999
    .line 2000
    .line 2001
    move-result-object v5

    .line 2002
    :cond_3a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 2003
    .line 2004
    .line 2005
    move-result v7

    .line 2006
    if-eqz v7, :cond_3b

    .line 2007
    .line 2008
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2009
    .line 2010
    .line 2011
    move-result-object v7

    .line 2012
    check-cast v7, La/o540;

    .line 2013
    .line 2014
    iget-object v7, v7, La/o540;->d:La/yos0;

    .line 2015
    .line 2016
    invoke-static {v7}, La/btm0;->p(La/yos0;)Z

    .line 2017
    .line 2018
    .line 2019
    move-result v7

    .line 2020
    if-eqz v7, :cond_3a

    .line 2021
    .line 2022
    goto :goto_20

    .line 2023
    :cond_3b
    :goto_1f
    const/16 v39, 0x0

    .line 2024
    .line 2025
    goto :goto_21

    .line 2026
    :cond_3c
    :goto_20
    const/16 v39, 0x1

    .line 2027
    .line 2028
    :goto_21
    new-instance v30, La/rdi0;

    .line 2029
    .line 2030
    move-object/from16 v36, v0

    .line 2031
    .line 2032
    move-object/from16 v32, v1

    .line 2033
    .line 2034
    move-object/from16 v37, v4

    .line 2035
    .line 2036
    move/from16 v31, v6

    .line 2037
    .line 2038
    move-object/from16 v38, v11

    .line 2039
    .line 2040
    move-object/from16 v34, v21

    .line 2041
    .line 2042
    invoke-direct/range {v30 .. v39}, La/rdi0;-><init>(ILjava/lang/String;Landroid/text/SpannableString;La/x640;ILjava/util/Date;La/xrt0;Ljava/util/ArrayList;Z)V

    .line 2043
    .line 2044
    .line 2045
    goto/16 :goto_18

    .line 2046
    .line 2047
    :cond_3d
    move-object v1, v4

    .line 2048
    move/from16 v31, v6

    .line 2049
    .line 2050
    move-object/from16 v35, v11

    .line 2051
    .line 2052
    move-object/from16 v34, v21

    .line 2053
    .line 2054
    invoke-static {v8, v15, v7, v5}, La/j0x;->r(Ljava/lang/String;La/ctf0;Ljava/util/List;La/ywu;)Landroid/text/SpannableString;

    .line 2055
    .line 2056
    .line 2057
    move-result-object v4

    .line 2058
    iget-object v5, v0, La/p540;->g:La/x640;

    .line 2059
    .line 2060
    iget-object v0, v0, La/p540;->h:Ljava/util/Date;

    .line 2061
    .line 2062
    instance-of v6, v1, La/vrt0;

    .line 2063
    .line 2064
    invoke-static {v1, v14, v15}, La/btm0;->w(La/xrt0;La/nhf0;La/ctf0;)La/dtt0;

    .line 2065
    .line 2066
    .line 2067
    move-result-object v33

    .line 2068
    invoke-static/range {v34 .. v34}, La/j0x;->z(La/x640;)Z

    .line 2069
    .line 2070
    .line 2071
    move-result v1

    .line 2072
    if-nez v1, :cond_41

    .line 2073
    .line 2074
    invoke-interface/range {v23 .. v23}, Ljava/util/Collection;->isEmpty()Z

    .line 2075
    .line 2076
    .line 2077
    move-result v1

    .line 2078
    if-eqz v1, :cond_3e

    .line 2079
    .line 2080
    goto :goto_22

    .line 2081
    :cond_3e
    invoke-interface/range {v23 .. v23}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2082
    .line 2083
    .line 2084
    move-result-object v1

    .line 2085
    :cond_3f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2086
    .line 2087
    .line 2088
    move-result v7

    .line 2089
    if-eqz v7, :cond_40

    .line 2090
    .line 2091
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2092
    .line 2093
    .line 2094
    move-result-object v7

    .line 2095
    check-cast v7, La/o540;

    .line 2096
    .line 2097
    iget-object v7, v7, La/o540;->d:La/yos0;

    .line 2098
    .line 2099
    invoke-static {v7}, La/btm0;->p(La/yos0;)Z

    .line 2100
    .line 2101
    .line 2102
    move-result v7

    .line 2103
    if-eqz v7, :cond_3f

    .line 2104
    .line 2105
    goto :goto_23

    .line 2106
    :cond_40
    :goto_22
    const/16 v38, 0x0

    .line 2107
    .line 2108
    goto :goto_24

    .line 2109
    :cond_41
    :goto_23
    const/16 v38, 0x1

    .line 2110
    .line 2111
    :goto_24
    new-instance v30, La/pde0;

    .line 2112
    .line 2113
    move-object/from16 v36, v0

    .line 2114
    .line 2115
    move-object/from16 v34, v4

    .line 2116
    .line 2117
    move-object/from16 v32, v5

    .line 2118
    .line 2119
    move/from16 v37, v6

    .line 2120
    .line 2121
    invoke-direct/range {v30 .. v38}, La/pde0;-><init>(ILa/x640;La/dtt0;Landroid/text/SpannableString;Ljava/util/ArrayList;Ljava/util/Date;ZZ)V

    .line 2122
    .line 2123
    .line 2124
    goto/16 :goto_18

    .line 2125
    .line 2126
    :cond_42
    move-object/from16 v22, v10

    .line 2127
    .line 2128
    instance-of v0, v13, La/r540;

    .line 2129
    .line 2130
    if-eqz v0, :cond_5a

    .line 2131
    .line 2132
    move-object v0, v13

    .line 2133
    check-cast v0, La/r540;

    .line 2134
    .line 2135
    iget-object v4, v0, La/r540;->f:La/xrt0;

    .line 2136
    .line 2137
    iget-object v6, v0, La/r540;->i:Ljava/lang/String;

    .line 2138
    .line 2139
    iget-object v7, v0, La/r540;->j:Ljava/util/List;

    .line 2140
    .line 2141
    iget-object v8, v0, La/r540;->k:Ljava/util/List;

    .line 2142
    .line 2143
    iget-object v9, v0, La/r540;->g:La/x640;

    .line 2144
    .line 2145
    instance-of v10, v4, La/srt0;

    .line 2146
    .line 2147
    if-eqz v10, :cond_4f

    .line 2148
    .line 2149
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 2150
    .line 2151
    .line 2152
    move-result v4

    .line 2153
    const/4 v10, 0x1

    .line 2154
    if-ne v4, v10, :cond_47

    .line 2155
    .line 2156
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 2157
    .line 2158
    .line 2159
    move-result-object v1

    .line 2160
    check-cast v1, La/q540;

    .line 2161
    .line 2162
    iget v4, v0, La/r540;->c:I

    .line 2163
    .line 2164
    iget-object v10, v0, La/r540;->e:Ljava/lang/String;

    .line 2165
    .line 2166
    invoke-static {v6, v15, v7, v5}, La/j0x;->r(Ljava/lang/String;La/ctf0;Ljava/util/List;La/ywu;)Landroid/text/SpannableString;

    .line 2167
    .line 2168
    .line 2169
    move-result-object v33

    .line 2170
    invoke-static {v9}, La/j0x;->K(La/x640;)I

    .line 2171
    .line 2172
    .line 2173
    move-result v35

    .line 2174
    iget-object v0, v0, La/r540;->h:Ljava/util/Date;

    .line 2175
    .line 2176
    new-instance v36, La/g0x;

    .line 2177
    .line 2178
    iget-object v5, v1, La/q540;->b:La/yos0;

    .line 2179
    .line 2180
    invoke-virtual {v5}, La/yos0;->a()La/qos0;

    .line 2181
    .line 2182
    .line 2183
    move-result-object v37

    .line 2184
    iget-object v5, v1, La/q540;->d:Ljava/lang/String;

    .line 2185
    .line 2186
    iget-wide v6, v1, La/q540;->c:J

    .line 2187
    .line 2188
    iget-object v11, v1, La/q540;->a:Ljava/lang/String;

    .line 2189
    .line 2190
    iget-object v1, v1, La/q540;->b:La/yos0;

    .line 2191
    .line 2192
    move-object/from16 v42, v1

    .line 2193
    .line 2194
    move-object/from16 v38, v5

    .line 2195
    .line 2196
    move-wide/from16 v39, v6

    .line 2197
    .line 2198
    move-object/from16 v41, v11

    .line 2199
    .line 2200
    invoke-direct/range {v36 .. v42}, La/g0x;-><init>(La/qos0;Ljava/lang/String;JLjava/lang/String;La/yos0;)V

    .line 2201
    .line 2202
    .line 2203
    invoke-static {v9}, La/j0x;->z(La/x640;)Z

    .line 2204
    .line 2205
    .line 2206
    move-result v1

    .line 2207
    if-nez v1, :cond_46

    .line 2208
    .line 2209
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 2210
    .line 2211
    .line 2212
    move-result v1

    .line 2213
    if-eqz v1, :cond_43

    .line 2214
    .line 2215
    goto :goto_25

    .line 2216
    :cond_43
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2217
    .line 2218
    .line 2219
    move-result-object v1

    .line 2220
    :cond_44
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2221
    .line 2222
    .line 2223
    move-result v5

    .line 2224
    if-eqz v5, :cond_45

    .line 2225
    .line 2226
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2227
    .line 2228
    .line 2229
    move-result-object v5

    .line 2230
    check-cast v5, La/q540;

    .line 2231
    .line 2232
    iget-object v5, v5, La/q540;->b:La/yos0;

    .line 2233
    .line 2234
    invoke-static {v5}, La/btm0;->p(La/yos0;)Z

    .line 2235
    .line 2236
    .line 2237
    move-result v5

    .line 2238
    if-eqz v5, :cond_44

    .line 2239
    .line 2240
    goto :goto_26

    .line 2241
    :cond_45
    :goto_25
    const/16 v38, 0x0

    .line 2242
    .line 2243
    goto :goto_27

    .line 2244
    :cond_46
    :goto_26
    const/16 v38, 0x1

    .line 2245
    .line 2246
    :goto_27
    new-instance v30, La/xdi0;

    .line 2247
    .line 2248
    move/from16 v31, v4

    .line 2249
    .line 2250
    move-object/from16 v34, v9

    .line 2251
    .line 2252
    move-object/from16 v32, v10

    .line 2253
    .line 2254
    move-object/from16 v37, v36

    .line 2255
    .line 2256
    move-object/from16 v36, v0

    .line 2257
    .line 2258
    invoke-direct/range {v30 .. v38}, La/xdi0;-><init>(ILjava/lang/String;Landroid/text/SpannableString;La/x640;ILjava/util/Date;La/g0x;Z)V

    .line 2259
    .line 2260
    .line 2261
    goto/16 :goto_18

    .line 2262
    .line 2263
    :cond_47
    move-object v4, v9

    .line 2264
    iget v9, v0, La/r540;->c:I

    .line 2265
    .line 2266
    iget-object v10, v0, La/r540;->e:Ljava/lang/String;

    .line 2267
    .line 2268
    invoke-static {v6, v15, v7, v5}, La/j0x;->r(Ljava/lang/String;La/ctf0;Ljava/util/List;La/ywu;)Landroid/text/SpannableString;

    .line 2269
    .line 2270
    .line 2271
    move-result-object v33

    .line 2272
    invoke-static {v4}, La/j0x;->K(La/x640;)I

    .line 2273
    .line 2274
    .line 2275
    move-result v35

    .line 2276
    iget-object v0, v0, La/r540;->h:Ljava/util/Date;

    .line 2277
    .line 2278
    new-instance v5, Ljava/util/ArrayList;

    .line 2279
    .line 2280
    invoke-static {v8, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2281
    .line 2282
    .line 2283
    move-result v1

    .line 2284
    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 2285
    .line 2286
    .line 2287
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2288
    .line 2289
    .line 2290
    move-result-object v1

    .line 2291
    const/4 v6, 0x0

    .line 2292
    :goto_28
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2293
    .line 2294
    .line 2295
    move-result v7

    .line 2296
    if-eqz v7, :cond_4a

    .line 2297
    .line 2298
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2299
    .line 2300
    .line 2301
    move-result-object v7

    .line 2302
    add-int/lit8 v11, v6, 0x1

    .line 2303
    .line 2304
    if-ltz v6, :cond_49

    .line 2305
    .line 2306
    check-cast v7, La/q540;

    .line 2307
    .line 2308
    new-instance v12, La/k1d;

    .line 2309
    .line 2310
    new-instance v36, La/g0x;

    .line 2311
    .line 2312
    iget-object v14, v7, La/q540;->b:La/yos0;

    .line 2313
    .line 2314
    invoke-virtual {v14}, La/yos0;->a()La/qos0;

    .line 2315
    .line 2316
    .line 2317
    move-result-object v37

    .line 2318
    iget-object v14, v7, La/q540;->d:Ljava/lang/String;

    .line 2319
    .line 2320
    move-object v15, v0

    .line 2321
    move-object/from16 v20, v1

    .line 2322
    .line 2323
    iget-wide v0, v7, La/q540;->c:J

    .line 2324
    .line 2325
    move-wide/from16 v39, v0

    .line 2326
    .line 2327
    iget-object v0, v7, La/q540;->a:Ljava/lang/String;

    .line 2328
    .line 2329
    iget-object v1, v7, La/q540;->b:La/yos0;

    .line 2330
    .line 2331
    move-object/from16 v41, v0

    .line 2332
    .line 2333
    move-object/from16 v42, v1

    .line 2334
    .line 2335
    move-object/from16 v38, v14

    .line 2336
    .line 2337
    invoke-direct/range {v36 .. v42}, La/g0x;-><init>(La/qos0;Ljava/lang/String;JLjava/lang/String;La/yos0;)V

    .line 2338
    .line 2339
    .line 2340
    move-object/from16 v0, v36

    .line 2341
    .line 2342
    if-nez v6, :cond_48

    .line 2343
    .line 2344
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 2345
    .line 2346
    .line 2347
    move-result v1

    .line 2348
    const/16 v26, 0x2

    .line 2349
    .line 2350
    rem-int/lit8 v1, v1, 0x2

    .line 2351
    .line 2352
    const/4 v6, 0x1

    .line 2353
    if-ne v1, v6, :cond_48

    .line 2354
    .line 2355
    sget-object v1, La/j1d;->c:La/j1d;

    .line 2356
    .line 2357
    goto :goto_29

    .line 2358
    :cond_48
    sget-object v1, La/j1d;->b:La/j1d;

    .line 2359
    .line 2360
    :goto_29
    invoke-direct {v12, v0, v4, v1}, La/k1d;-><init>(La/g0x;La/x640;La/j1d;)V

    .line 2361
    .line 2362
    .line 2363
    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2364
    .line 2365
    .line 2366
    move v6, v11

    .line 2367
    move-object v0, v15

    .line 2368
    move-object/from16 v1, v20

    .line 2369
    .line 2370
    goto :goto_28

    .line 2371
    :cond_49
    invoke-static {}, La/q3d;->p()V

    .line 2372
    .line 2373
    .line 2374
    throw v17

    .line 2375
    :cond_4a
    move-object v15, v0

    .line 2376
    invoke-static {v4}, La/j0x;->z(La/x640;)Z

    .line 2377
    .line 2378
    .line 2379
    move-result v0

    .line 2380
    if-nez v0, :cond_4e

    .line 2381
    .line 2382
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 2383
    .line 2384
    .line 2385
    move-result v0

    .line 2386
    if-eqz v0, :cond_4b

    .line 2387
    .line 2388
    goto :goto_2a

    .line 2389
    :cond_4b
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2390
    .line 2391
    .line 2392
    move-result-object v0

    .line 2393
    :cond_4c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2394
    .line 2395
    .line 2396
    move-result v1

    .line 2397
    if-eqz v1, :cond_4d

    .line 2398
    .line 2399
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2400
    .line 2401
    .line 2402
    move-result-object v1

    .line 2403
    check-cast v1, La/q540;

    .line 2404
    .line 2405
    iget-object v1, v1, La/q540;->b:La/yos0;

    .line 2406
    .line 2407
    invoke-static {v1}, La/btm0;->p(La/yos0;)Z

    .line 2408
    .line 2409
    .line 2410
    move-result v1

    .line 2411
    if-eqz v1, :cond_4c

    .line 2412
    .line 2413
    goto :goto_2b

    .line 2414
    :cond_4d
    :goto_2a
    const/16 v38, 0x0

    .line 2415
    .line 2416
    goto :goto_2c

    .line 2417
    :cond_4e
    :goto_2b
    const/16 v38, 0x1

    .line 2418
    .line 2419
    :goto_2c
    new-instance v30, La/ydi0;

    .line 2420
    .line 2421
    move-object/from16 v34, v4

    .line 2422
    .line 2423
    move-object/from16 v37, v5

    .line 2424
    .line 2425
    move/from16 v31, v9

    .line 2426
    .line 2427
    move-object/from16 v32, v10

    .line 2428
    .line 2429
    move-object/from16 v36, v15

    .line 2430
    .line 2431
    invoke-direct/range {v30 .. v38}, La/ydi0;-><init>(ILjava/lang/String;Landroid/text/SpannableString;La/x640;ILjava/util/Date;Ljava/util/ArrayList;Z)V

    .line 2432
    .line 2433
    .line 2434
    goto/16 :goto_18

    .line 2435
    .line 2436
    :cond_4f
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 2437
    .line 2438
    .line 2439
    move-result v10

    .line 2440
    const/4 v11, 0x1

    .line 2441
    if-ne v10, v11, :cond_52

    .line 2442
    .line 2443
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 2444
    .line 2445
    .line 2446
    move-result-object v1

    .line 2447
    check-cast v1, La/q540;

    .line 2448
    .line 2449
    new-instance v30, La/rde0;

    .line 2450
    .line 2451
    iget v8, v0, La/r540;->c:I

    .line 2452
    .line 2453
    invoke-static {v6, v15, v7, v5}, La/j0x;->r(Ljava/lang/String;La/ctf0;Ljava/util/List;La/ywu;)Landroid/text/SpannableString;

    .line 2454
    .line 2455
    .line 2456
    move-result-object v32

    .line 2457
    iget-object v5, v0, La/r540;->g:La/x640;

    .line 2458
    .line 2459
    iget-object v0, v0, La/r540;->h:Ljava/util/Date;

    .line 2460
    .line 2461
    new-instance v33, La/g0x;

    .line 2462
    .line 2463
    iget-object v6, v1, La/q540;->b:La/yos0;

    .line 2464
    .line 2465
    iget-object v7, v1, La/q540;->b:La/yos0;

    .line 2466
    .line 2467
    invoke-virtual {v6}, La/yos0;->a()La/qos0;

    .line 2468
    .line 2469
    .line 2470
    move-result-object v34

    .line 2471
    iget-object v6, v1, La/q540;->d:Ljava/lang/String;

    .line 2472
    .line 2473
    iget-wide v10, v1, La/q540;->c:J

    .line 2474
    .line 2475
    iget-object v1, v1, La/q540;->a:Ljava/lang/String;

    .line 2476
    .line 2477
    move-object/from16 v38, v1

    .line 2478
    .line 2479
    move-object/from16 v35, v6

    .line 2480
    .line 2481
    move-object/from16 v39, v7

    .line 2482
    .line 2483
    move-wide/from16 v36, v10

    .line 2484
    .line 2485
    invoke-direct/range {v33 .. v39}, La/g0x;-><init>(La/qos0;Ljava/lang/String;JLjava/lang/String;La/yos0;)V

    .line 2486
    .line 2487
    .line 2488
    instance-of v1, v4, La/vrt0;

    .line 2489
    .line 2490
    invoke-static {v4, v14, v15}, La/btm0;->w(La/xrt0;La/nhf0;La/ctf0;)La/dtt0;

    .line 2491
    .line 2492
    .line 2493
    move-result-object v37

    .line 2494
    invoke-static {v9}, La/j0x;->z(La/x640;)Z

    .line 2495
    .line 2496
    .line 2497
    move-result v4

    .line 2498
    if-nez v4, :cond_51

    .line 2499
    .line 2500
    invoke-static/range {v39 .. v39}, La/btm0;->p(La/yos0;)Z

    .line 2501
    .line 2502
    .line 2503
    move-result v4

    .line 2504
    if-eqz v4, :cond_50

    .line 2505
    .line 2506
    goto :goto_2e

    .line 2507
    :cond_50
    const/16 v38, 0x0

    .line 2508
    .line 2509
    :goto_2d
    move-object/from16 v34, v0

    .line 2510
    .line 2511
    move/from16 v36, v1

    .line 2512
    .line 2513
    move/from16 v31, v8

    .line 2514
    .line 2515
    move-object/from16 v35, v33

    .line 2516
    .line 2517
    move-object/from16 v33, v5

    .line 2518
    .line 2519
    goto :goto_2f

    .line 2520
    :cond_51
    :goto_2e
    const/16 v38, 0x1

    .line 2521
    .line 2522
    goto :goto_2d

    .line 2523
    :goto_2f
    invoke-direct/range {v30 .. v38}, La/rde0;-><init>(ILandroid/text/SpannableString;La/x640;Ljava/util/Date;La/g0x;ZLa/dtt0;Z)V

    .line 2524
    .line 2525
    .line 2526
    goto/16 :goto_18

    .line 2527
    .line 2528
    :cond_52
    iget v10, v0, La/r540;->c:I

    .line 2529
    .line 2530
    invoke-static {v6, v15, v7, v5}, La/j0x;->r(Ljava/lang/String;La/ctf0;Ljava/util/List;La/ywu;)Landroid/text/SpannableString;

    .line 2531
    .line 2532
    .line 2533
    move-result-object v5

    .line 2534
    iget-object v6, v0, La/r540;->g:La/x640;

    .line 2535
    .line 2536
    iget-object v0, v0, La/r540;->h:Ljava/util/Date;

    .line 2537
    .line 2538
    new-instance v7, Ljava/util/ArrayList;

    .line 2539
    .line 2540
    invoke-static {v8, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2541
    .line 2542
    .line 2543
    move-result v1

    .line 2544
    invoke-direct {v7, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 2545
    .line 2546
    .line 2547
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2548
    .line 2549
    .line 2550
    move-result-object v1

    .line 2551
    const/4 v11, 0x0

    .line 2552
    :goto_30
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2553
    .line 2554
    .line 2555
    move-result v12

    .line 2556
    if-eqz v12, :cond_55

    .line 2557
    .line 2558
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2559
    .line 2560
    .line 2561
    move-result-object v12

    .line 2562
    add-int/lit8 v20, v11, 0x1

    .line 2563
    .line 2564
    if-ltz v11, :cond_54

    .line 2565
    .line 2566
    check-cast v12, La/q540;

    .line 2567
    .line 2568
    move-object/from16 v21, v0

    .line 2569
    .line 2570
    new-instance v0, La/k1d;

    .line 2571
    .line 2572
    new-instance v30, La/g0x;

    .line 2573
    .line 2574
    move-object/from16 v23, v1

    .line 2575
    .line 2576
    iget-object v1, v12, La/q540;->b:La/yos0;

    .line 2577
    .line 2578
    invoke-virtual {v1}, La/yos0;->a()La/qos0;

    .line 2579
    .line 2580
    .line 2581
    move-result-object v31

    .line 2582
    iget-object v1, v12, La/q540;->d:Ljava/lang/String;

    .line 2583
    .line 2584
    move-object/from16 v24, v5

    .line 2585
    .line 2586
    move-object/from16 v25, v6

    .line 2587
    .line 2588
    iget-wide v5, v12, La/q540;->c:J

    .line 2589
    .line 2590
    move-object/from16 v32, v1

    .line 2591
    .line 2592
    iget-object v1, v12, La/q540;->a:Ljava/lang/String;

    .line 2593
    .line 2594
    iget-object v12, v12, La/q540;->b:La/yos0;

    .line 2595
    .line 2596
    move-object/from16 v35, v1

    .line 2597
    .line 2598
    move-wide/from16 v33, v5

    .line 2599
    .line 2600
    move-object/from16 v36, v12

    .line 2601
    .line 2602
    invoke-direct/range {v30 .. v36}, La/g0x;-><init>(La/qos0;Ljava/lang/String;JLjava/lang/String;La/yos0;)V

    .line 2603
    .line 2604
    .line 2605
    move-object/from16 v1, v30

    .line 2606
    .line 2607
    if-nez v11, :cond_53

    .line 2608
    .line 2609
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 2610
    .line 2611
    .line 2612
    move-result v5

    .line 2613
    const/16 v26, 0x2

    .line 2614
    .line 2615
    rem-int/lit8 v5, v5, 0x2

    .line 2616
    .line 2617
    const/4 v6, 0x1

    .line 2618
    if-ne v5, v6, :cond_53

    .line 2619
    .line 2620
    sget-object v5, La/j1d;->c:La/j1d;

    .line 2621
    .line 2622
    goto :goto_31

    .line 2623
    :cond_53
    sget-object v5, La/j1d;->b:La/j1d;

    .line 2624
    .line 2625
    :goto_31
    invoke-direct {v0, v1, v9, v5}, La/k1d;-><init>(La/g0x;La/x640;La/j1d;)V

    .line 2626
    .line 2627
    .line 2628
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2629
    .line 2630
    .line 2631
    move/from16 v11, v20

    .line 2632
    .line 2633
    move-object/from16 v0, v21

    .line 2634
    .line 2635
    move-object/from16 v1, v23

    .line 2636
    .line 2637
    move-object/from16 v5, v24

    .line 2638
    .line 2639
    move-object/from16 v6, v25

    .line 2640
    .line 2641
    goto :goto_30

    .line 2642
    :cond_54
    invoke-static {}, La/q3d;->p()V

    .line 2643
    .line 2644
    .line 2645
    throw v17

    .line 2646
    :cond_55
    move-object/from16 v21, v0

    .line 2647
    .line 2648
    move-object/from16 v24, v5

    .line 2649
    .line 2650
    move-object/from16 v25, v6

    .line 2651
    .line 2652
    instance-of v11, v4, La/vrt0;

    .line 2653
    .line 2654
    invoke-static {v4, v14, v15}, La/btm0;->w(La/xrt0;La/nhf0;La/ctf0;)La/dtt0;

    .line 2655
    .line 2656
    .line 2657
    move-result-object v0

    .line 2658
    invoke-static {v9}, La/j0x;->z(La/x640;)Z

    .line 2659
    .line 2660
    .line 2661
    move-result v1

    .line 2662
    if-nez v1, :cond_59

    .line 2663
    .line 2664
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 2665
    .line 2666
    .line 2667
    move-result v1

    .line 2668
    if-eqz v1, :cond_56

    .line 2669
    .line 2670
    goto :goto_32

    .line 2671
    :cond_56
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2672
    .line 2673
    .line 2674
    move-result-object v1

    .line 2675
    :cond_57
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2676
    .line 2677
    .line 2678
    move-result v4

    .line 2679
    if-eqz v4, :cond_58

    .line 2680
    .line 2681
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2682
    .line 2683
    .line 2684
    move-result-object v4

    .line 2685
    check-cast v4, La/q540;

    .line 2686
    .line 2687
    iget-object v4, v4, La/q540;->b:La/yos0;

    .line 2688
    .line 2689
    invoke-static {v4}, La/btm0;->p(La/yos0;)Z

    .line 2690
    .line 2691
    .line 2692
    move-result v4

    .line 2693
    if-eqz v4, :cond_57

    .line 2694
    .line 2695
    goto :goto_33

    .line 2696
    :cond_58
    :goto_32
    const/4 v12, 0x0

    .line 2697
    goto :goto_34

    .line 2698
    :cond_59
    :goto_33
    const/4 v12, 0x1

    .line 2699
    :goto_34
    new-instance v4, La/sde0;

    .line 2700
    .line 2701
    move-object v9, v7

    .line 2702
    move v5, v10

    .line 2703
    move-object/from16 v10, v21

    .line 2704
    .line 2705
    move-object/from16 v8, v24

    .line 2706
    .line 2707
    move-object/from16 v6, v25

    .line 2708
    .line 2709
    move-object v7, v0

    .line 2710
    invoke-direct/range {v4 .. v12}, La/sde0;-><init>(ILa/x640;La/dtt0;Landroid/text/SpannableString;Ljava/util/ArrayList;Ljava/util/Date;ZZ)V

    .line 2711
    .line 2712
    .line 2713
    move-object v14, v4

    .line 2714
    goto/16 :goto_19

    .line 2715
    .line 2716
    :cond_5a
    instance-of v0, v13, La/n540;

    .line 2717
    .line 2718
    if-eqz v0, :cond_65

    .line 2719
    .line 2720
    move-object v0, v13

    .line 2721
    check-cast v0, La/n540;

    .line 2722
    .line 2723
    iget v1, v0, La/n540;->c:I

    .line 2724
    .line 2725
    iget-object v4, v0, La/n540;->d:La/m540;

    .line 2726
    .line 2727
    instance-of v5, v4, La/k540;

    .line 2728
    .line 2729
    if-eqz v5, :cond_5f

    .line 2730
    .line 2731
    check-cast v4, La/k540;

    .line 2732
    .line 2733
    iget-object v4, v4, La/k540;->a:Ljava/util/ArrayList;

    .line 2734
    .line 2735
    new-instance v5, Ljava/util/ArrayList;

    .line 2736
    .line 2737
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 2738
    .line 2739
    .line 2740
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2741
    .line 2742
    .line 2743
    move-result-object v4

    .line 2744
    :cond_5b
    :goto_35
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 2745
    .line 2746
    .line 2747
    move-result v6

    .line 2748
    if-eqz v6, :cond_5c

    .line 2749
    .line 2750
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2751
    .line 2752
    .line 2753
    move-result-object v6

    .line 2754
    instance-of v7, v6, La/urt0;

    .line 2755
    .line 2756
    if-eqz v7, :cond_5b

    .line 2757
    .line 2758
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2759
    .line 2760
    .line 2761
    goto :goto_35

    .line 2762
    :cond_5c
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 2763
    .line 2764
    .line 2765
    move-result-object v4

    .line 2766
    check-cast v4, La/urt0;

    .line 2767
    .line 2768
    if-eqz v4, :cond_5d

    .line 2769
    .line 2770
    iget-object v4, v4, La/urt0;->c:Ljava/lang/String;

    .line 2771
    .line 2772
    goto :goto_36

    .line 2773
    :cond_5d
    move-object/from16 v4, v17

    .line 2774
    .line 2775
    :goto_36
    if-nez v4, :cond_5e

    .line 2776
    .line 2777
    move-object/from16 v4, v29

    .line 2778
    .line 2779
    :cond_5e
    const/4 v11, 0x0

    .line 2780
    new-array v5, v11, [Ljava/lang/Object;

    .line 2781
    .line 2782
    iget-object v6, v15, La/ctf0;->b:La/lsm0;

    .line 2783
    .line 2784
    invoke-static {v5, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2785
    .line 2786
    .line 2787
    move-result-object v5

    .line 2788
    const v7, 0x7f13142f

    .line 2789
    .line 2790
    .line 2791
    invoke-virtual {v6, v7, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2792
    .line 2793
    .line 2794
    move-result-object v5

    .line 2795
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 2796
    .line 2797
    .line 2798
    move-result-object v4

    .line 2799
    const/4 v6, 0x1

    .line 2800
    invoke-static {v4, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2801
    .line 2802
    .line 2803
    move-result-object v4

    .line 2804
    invoke-static {v5, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 2805
    .line 2806
    .line 2807
    move-result-object v4

    .line 2808
    const/4 v11, 0x0

    .line 2809
    goto :goto_39

    .line 2810
    :cond_5f
    instance-of v5, v4, La/l540;

    .line 2811
    .line 2812
    if-eqz v5, :cond_64

    .line 2813
    .line 2814
    check-cast v4, La/l540;

    .line 2815
    .line 2816
    iget-object v4, v4, La/l540;->a:Ljava/util/ArrayList;

    .line 2817
    .line 2818
    new-instance v5, Ljava/util/ArrayList;

    .line 2819
    .line 2820
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 2821
    .line 2822
    .line 2823
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2824
    .line 2825
    .line 2826
    move-result-object v4

    .line 2827
    :cond_60
    :goto_37
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 2828
    .line 2829
    .line 2830
    move-result v6

    .line 2831
    if-eqz v6, :cond_61

    .line 2832
    .line 2833
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2834
    .line 2835
    .line 2836
    move-result-object v6

    .line 2837
    instance-of v7, v6, La/urt0;

    .line 2838
    .line 2839
    if-eqz v7, :cond_60

    .line 2840
    .line 2841
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2842
    .line 2843
    .line 2844
    goto :goto_37

    .line 2845
    :cond_61
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 2846
    .line 2847
    .line 2848
    move-result-object v4

    .line 2849
    check-cast v4, La/urt0;

    .line 2850
    .line 2851
    if-eqz v4, :cond_62

    .line 2852
    .line 2853
    iget-object v4, v4, La/urt0;->c:Ljava/lang/String;

    .line 2854
    .line 2855
    goto :goto_38

    .line 2856
    :cond_62
    move-object/from16 v4, v17

    .line 2857
    .line 2858
    :goto_38
    if-nez v4, :cond_63

    .line 2859
    .line 2860
    move-object/from16 v4, v29

    .line 2861
    .line 2862
    :cond_63
    const/4 v11, 0x0

    .line 2863
    new-array v5, v11, [Ljava/lang/Object;

    .line 2864
    .line 2865
    iget-object v6, v15, La/ctf0;->b:La/lsm0;

    .line 2866
    .line 2867
    invoke-static {v5, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2868
    .line 2869
    .line 2870
    move-result-object v5

    .line 2871
    const v7, 0x7f13142e

    .line 2872
    .line 2873
    .line 2874
    invoke-virtual {v6, v7, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2875
    .line 2876
    .line 2877
    move-result-object v5

    .line 2878
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 2879
    .line 2880
    .line 2881
    move-result-object v4

    .line 2882
    const/4 v6, 0x1

    .line 2883
    invoke-static {v4, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2884
    .line 2885
    .line 2886
    move-result-object v4

    .line 2887
    invoke-static {v5, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 2888
    .line 2889
    .line 2890
    move-result-object v4

    .line 2891
    :goto_39
    iget-object v5, v0, La/n540;->g:Ljava/util/Date;

    .line 2892
    .line 2893
    iget-object v0, v0, La/n540;->f:La/x640;

    .line 2894
    .line 2895
    new-instance v6, La/z9o0;

    .line 2896
    .line 2897
    invoke-direct {v6, v1, v4, v0, v5}, La/z9o0;-><init>(ILjava/lang/String;La/x640;Ljava/util/Date;)V

    .line 2898
    .line 2899
    .line 2900
    move-object v14, v6

    .line 2901
    goto :goto_3a

    .line 2902
    :cond_64
    invoke-static {}, La/t9f;->b()V

    .line 2903
    .line 2904
    .line 2905
    goto/16 :goto_1a

    .line 2906
    .line 2907
    :cond_65
    const/4 v11, 0x0

    .line 2908
    instance-of v0, v13, La/y540;

    .line 2909
    .line 2910
    if-eqz v0, :cond_66

    .line 2911
    .line 2912
    move-object v0, v13

    .line 2913
    check-cast v0, La/y540;

    .line 2914
    .line 2915
    iget v1, v0, La/y540;->c:I

    .line 2916
    .line 2917
    iget-object v4, v0, La/y540;->f:Ljava/util/Date;

    .line 2918
    .line 2919
    iget-object v0, v0, La/y540;->e:La/x640;

    .line 2920
    .line 2921
    new-instance v5, La/sft0;

    .line 2922
    .line 2923
    invoke-direct {v5, v1, v0, v4}, La/sft0;-><init>(ILa/x640;Ljava/util/Date;)V

    .line 2924
    .line 2925
    .line 2926
    move-object v14, v5

    .line 2927
    :goto_3a
    invoke-virtual {v2, v13, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2928
    .line 2929
    .line 2930
    goto :goto_3b

    .line 2931
    :cond_66
    invoke-static {}, La/t9f;->b()V

    .line 2932
    .line 2933
    .line 2934
    goto/16 :goto_1a

    .line 2935
    .line 2936
    :cond_67
    move-object/from16 v18, v0

    .line 2937
    .line 2938
    move-object/from16 v19, v1

    .line 2939
    .line 2940
    move-object/from16 v29, v6

    .line 2941
    .line 2942
    move-object/from16 v17, v9

    .line 2943
    .line 2944
    move-object/from16 v22, v10

    .line 2945
    .line 2946
    move-object/from16 p0, v11

    .line 2947
    .line 2948
    move/from16 p1, v12

    .line 2949
    .line 2950
    move v11, v7

    .line 2951
    :goto_3b
    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2952
    .line 2953
    .line 2954
    move/from16 v12, p1

    .line 2955
    .line 2956
    move v7, v11

    .line 2957
    move-object/from16 v9, v17

    .line 2958
    .line 2959
    move-object/from16 v0, v18

    .line 2960
    .line 2961
    move-object/from16 v1, v19

    .line 2962
    .line 2963
    move-object/from16 v10, v22

    .line 2964
    .line 2965
    move-object/from16 v6, v29

    .line 2966
    .line 2967
    const/4 v8, 0x1

    .line 2968
    move-object/from16 v11, p0

    .line 2969
    .line 2970
    goto/16 :goto_e

    .line 2971
    .line 2972
    :cond_68
    move-object/from16 v18, v0

    .line 2973
    .line 2974
    move-object/from16 v19, v1

    .line 2975
    .line 2976
    move-object/from16 v17, v9

    .line 2977
    .line 2978
    iget-object v0, v10, La/yxb;->p:La/pm50;

    .line 2979
    .line 2980
    sget-object v1, La/pm50;->c:La/pm50;

    .line 2981
    .line 2982
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2983
    .line 2984
    .line 2985
    move-result v0

    .line 2986
    if-eqz v0, :cond_6c

    .line 2987
    .line 2988
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    .line 2989
    .line 2990
    .line 2991
    move-result v0

    .line 2992
    move-object/from16 v1, v19

    .line 2993
    .line 2994
    invoke-interface {v1, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 2995
    .line 2996
    .line 2997
    move-result-object v0

    .line 2998
    :cond_69
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 2999
    .line 3000
    .line 3001
    move-result v2

    .line 3002
    if-eqz v2, :cond_6b

    .line 3003
    .line 3004
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 3005
    .line 3006
    .line 3007
    move-result-object v2

    .line 3008
    move-object v4, v2

    .line 3009
    check-cast v4, La/a640;

    .line 3010
    .line 3011
    invoke-virtual {v4}, La/a640;->e()La/xrt0;

    .line 3012
    .line 3013
    .line 3014
    move-result-object v5

    .line 3015
    instance-of v5, v5, La/srt0;

    .line 3016
    .line 3017
    if-nez v5, :cond_6a

    .line 3018
    .line 3019
    invoke-virtual {v4}, La/a640;->d()La/x640;

    .line 3020
    .line 3021
    .line 3022
    move-result-object v4

    .line 3023
    sget-object v5, La/u640;->a:La/u640;

    .line 3024
    .line 3025
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3026
    .line 3027
    .line 3028
    move-result v4

    .line 3029
    if-eqz v4, :cond_69

    .line 3030
    .line 3031
    :cond_6a
    move-object v9, v2

    .line 3032
    goto :goto_3c

    .line 3033
    :cond_6b
    move-object/from16 v9, v17

    .line 3034
    .line 3035
    :goto_3c
    check-cast v9, La/a640;

    .line 3036
    .line 3037
    if-eqz v9, :cond_6d

    .line 3038
    .line 3039
    invoke-interface {v1, v9}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 3040
    .line 3041
    .line 3042
    move-result v0

    .line 3043
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 3044
    .line 3045
    .line 3046
    move-result v2

    .line 3047
    const/16 v27, 0x1

    .line 3048
    .line 3049
    add-int/lit8 v2, v2, -0x1

    .line 3050
    .line 3051
    if-eq v0, v2, :cond_6d

    .line 3052
    .line 3053
    invoke-interface {v1, v9}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 3054
    .line 3055
    .line 3056
    move-result v0

    .line 3057
    add-int/lit8 v5, v0, 0x1

    .line 3058
    .line 3059
    new-instance v0, La/pm50;

    .line 3060
    .line 3061
    new-instance v2, Ljava/util/Date;

    .line 3062
    .line 3063
    invoke-virtual {v9}, La/a640;->a()Ljava/util/Date;

    .line 3064
    .line 3065
    .line 3066
    move-result-object v4

    .line 3067
    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    .line 3068
    .line 3069
    .line 3070
    move-result-wide v6

    .line 3071
    const-wide/16 v11, 0x1

    .line 3072
    .line 3073
    add-long/2addr v6, v11

    .line 3074
    invoke-direct {v2, v6, v7}, Ljava/util/Date;-><init>(J)V

    .line 3075
    .line 3076
    .line 3077
    invoke-virtual {v9}, La/a640;->b()I

    .line 3078
    .line 3079
    .line 3080
    move-result v4

    .line 3081
    invoke-direct {v0, v4, v2}, La/pm50;-><init>(ILjava/util/Date;)V

    .line 3082
    .line 3083
    .line 3084
    iput-object v0, v10, La/yxb;->p:La/pm50;

    .line 3085
    .line 3086
    invoke-virtual {v3, v5, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 3087
    .line 3088
    .line 3089
    goto :goto_3d

    .line 3090
    :cond_6c
    move-object/from16 v1, v19

    .line 3091
    .line 3092
    :cond_6d
    const/4 v5, -0x1

    .line 3093
    :goto_3d
    iget-object v0, v10, La/yxb;->p:La/pm50;

    .line 3094
    .line 3095
    sget-object v2, La/pm50;->c:La/pm50;

    .line 3096
    .line 3097
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3098
    .line 3099
    .line 3100
    move-result v0

    .line 3101
    if-eqz v0, :cond_6e

    .line 3102
    .line 3103
    new-instance v0, La/pm50;

    .line 3104
    .line 3105
    new-instance v2, Ljava/util/Date;

    .line 3106
    .line 3107
    const-wide v6, 0x7fffffffffffffffL

    .line 3108
    .line 3109
    .line 3110
    .line 3111
    .line 3112
    invoke-direct {v2, v6, v7}, Ljava/util/Date;-><init>(J)V

    .line 3113
    .line 3114
    .line 3115
    const v4, 0x7fffffff

    .line 3116
    .line 3117
    .line 3118
    invoke-direct {v0, v4, v2}, La/pm50;-><init>(ILjava/util/Date;)V

    .line 3119
    .line 3120
    .line 3121
    iput-object v0, v10, La/yxb;->p:La/pm50;

    .line 3122
    .line 3123
    :cond_6e
    sget-object v0, La/ixb;->a:La/ixb;

    .line 3124
    .line 3125
    move-object/from16 v2, v18

    .line 3126
    .line 3127
    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 3128
    .line 3129
    .line 3130
    move-result v0

    .line 3131
    sget-object v4, La/sq00;->a:La/sq00;

    .line 3132
    .line 3133
    if-eqz v0, :cond_6f

    .line 3134
    .line 3135
    invoke-static {v4}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 3136
    .line 3137
    .line 3138
    move-result-object v0

    .line 3139
    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 3140
    .line 3141
    .line 3142
    move-result-object v3

    .line 3143
    :cond_6f
    sget-object v0, La/ixb;->b:La/ixb;

    .line 3144
    .line 3145
    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 3146
    .line 3147
    .line 3148
    move-result v0

    .line 3149
    if-eqz v0, :cond_70

    .line 3150
    .line 3151
    invoke-static {v4}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 3152
    .line 3153
    .line 3154
    move-result-object v0

    .line 3155
    invoke-static {v3, v0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 3156
    .line 3157
    .line 3158
    move-result-object v3

    .line 3159
    :cond_70
    new-instance v9, La/kxb;

    .line 3160
    .line 3161
    invoke-direct {v9, v5, v3, v1}, La/kxb;-><init>(ILjava/util/ArrayList;Ljava/util/List;)V

    .line 3162
    .line 3163
    .line 3164
    :goto_3e
    return-object v9

    .line 3165
    :pswitch_1b
    move-object/from16 v17, v9

    .line 3166
    .line 3167
    iget-object v1, v0, La/wx4;->j:Ljava/lang/Object;

    .line 3168
    .line 3169
    check-cast v1, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 3170
    .line 3171
    iget-object v0, v0, La/wx4;->l:Ljava/lang/Object;

    .line 3172
    .line 3173
    check-cast v0, La/qm5;

    .line 3174
    .line 3175
    sget-object v4, La/wne;->a:La/wne;

    .line 3176
    .line 3177
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 3178
    .line 3179
    .line 3180
    instance-of v4, v0, La/mm5;

    .line 3181
    .line 3182
    if-eqz v4, :cond_73

    .line 3183
    .line 3184
    check-cast v10, La/fy4;

    .line 3185
    .line 3186
    iget-object v4, v10, La/fy4;->i0:La/p7m0;

    .line 3187
    .line 3188
    iget-wide v5, v1, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->a:D

    .line 3189
    .line 3190
    check-cast v0, La/mm5;

    .line 3191
    .line 3192
    iget-object v0, v0, La/mm5;->c:La/ql5;

    .line 3193
    .line 3194
    iget-wide v0, v0, La/ql5;->b:D

    .line 3195
    .line 3196
    cmpl-double v5, v5, v0

    .line 3197
    .line 3198
    if-gtz v5, :cond_72

    .line 3199
    .line 3200
    cmpg-double v0, v0, v2

    .line 3201
    .line 3202
    if-nez v0, :cond_71

    .line 3203
    .line 3204
    goto :goto_3f

    .line 3205
    :cond_71
    sget-object v0, La/zg5;->a:La/zg5;

    .line 3206
    .line 3207
    goto :goto_40

    .line 3208
    :cond_72
    :goto_3f
    sget-object v0, La/vg5;->a:La/vg5;

    .line 3209
    .line 3210
    :goto_40
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3211
    .line 3212
    .line 3213
    move-object/from16 v1, v17

    .line 3214
    .line 3215
    invoke-virtual {v4, v1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3216
    .line 3217
    .line 3218
    :cond_73
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3219
    .line 3220
    return-object v0

    .line 3221
    :pswitch_1c
    move-object/from16 v29, v6

    .line 3222
    .line 3223
    move v11, v7

    .line 3224
    iget-object v1, v0, La/wx4;->l:Ljava/lang/Object;

    .line 3225
    .line 3226
    check-cast v1, Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;

    .line 3227
    .line 3228
    iget-object v0, v0, La/wx4;->j:Ljava/lang/Object;

    .line 3229
    .line 3230
    check-cast v0, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 3231
    .line 3232
    sget-object v4, La/wne;->a:La/wne;

    .line 3233
    .line 3234
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 3235
    .line 3236
    .line 3237
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3238
    .line 3239
    .line 3240
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3241
    .line 3242
    .line 3243
    iget-wide v4, v0, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->e:D

    .line 3244
    .line 3245
    iget-wide v6, v0, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->d:D

    .line 3246
    .line 3247
    iget-wide v8, v0, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->a:D

    .line 3248
    .line 3249
    iget-boolean v12, v0, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->g:Z

    .line 3250
    .line 3251
    iget-boolean v13, v0, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->p:Z

    .line 3252
    .line 3253
    check-cast v10, La/fy4;

    .line 3254
    .line 3255
    iget-object v10, v10, La/fy4;->l:La/ctf0;

    .line 3256
    .line 3257
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3258
    .line 3259
    .line 3260
    iget-object v14, v1, Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;->a:Ljava/math/BigDecimal;

    .line 3261
    .line 3262
    invoke-virtual {v14}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 3263
    .line 3264
    .line 3265
    move-result-object v31

    .line 3266
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3267
    .line 3268
    .line 3269
    iget-object v15, v1, Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;->d:Ljava/math/BigDecimal;

    .line 3270
    .line 3271
    iget-object v11, v1, Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;->e:Ljava/math/BigDecimal;

    .line 3272
    .line 3273
    new-instance v2, Ljava/util/ArrayList;

    .line 3274
    .line 3275
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 3276
    .line 3277
    .line 3278
    new-instance v18, La/bnk0;

    .line 3279
    .line 3280
    invoke-direct/range {v18 .. v18}, La/bnk0;-><init>()V

    .line 3281
    .line 3282
    .line 3283
    iget-boolean v3, v1, Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;->h:Z

    .line 3284
    .line 3285
    if-eqz v3, :cond_75

    .line 3286
    .line 3287
    filled-new-array {v15}, [Ljava/lang/Object;

    .line 3288
    .line 3289
    .line 3290
    move-result-object v3

    .line 3291
    move-wide/from16 v32, v4

    .line 3292
    .line 3293
    const v4, 0x7f130d20

    .line 3294
    .line 3295
    .line 3296
    invoke-virtual {v10, v4, v3}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 3297
    .line 3298
    .line 3299
    move-result-object v19

    .line 3300
    const/16 v23, 0x0

    .line 3301
    .line 3302
    const/16 v24, 0x36

    .line 3303
    .line 3304
    const/16 v20, 0x0

    .line 3305
    .line 3306
    const v21, 0x7f0606d0

    .line 3307
    .line 3308
    .line 3309
    const/16 v22, 0x0

    .line 3310
    .line 3311
    invoke-static/range {v18 .. v24}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 3312
    .line 3313
    .line 3314
    :cond_74
    :goto_41
    move-object/from16 v3, v18

    .line 3315
    .line 3316
    goto :goto_42

    .line 3317
    :cond_75
    move-wide/from16 v32, v4

    .line 3318
    .line 3319
    iget-boolean v3, v1, Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;->g:Z

    .line 3320
    .line 3321
    if-eqz v3, :cond_74

    .line 3322
    .line 3323
    sget-object v3, La/pn40;->a:La/pn40;

    .line 3324
    .line 3325
    invoke-static {v11}, La/pn40;->g(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 3326
    .line 3327
    .line 3328
    move-result-object v3

    .line 3329
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 3330
    .line 3331
    .line 3332
    move-result-object v3

    .line 3333
    const v4, 0x7f130cd4

    .line 3334
    .line 3335
    .line 3336
    invoke-virtual {v10, v4, v3}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 3337
    .line 3338
    .line 3339
    move-result-object v19

    .line 3340
    const/16 v23, 0x0

    .line 3341
    .line 3342
    const/16 v24, 0x36

    .line 3343
    .line 3344
    const/16 v20, 0x0

    .line 3345
    .line 3346
    const v21, 0x7f0606d0

    .line 3347
    .line 3348
    .line 3349
    const/16 v22, 0x0

    .line 3350
    .line 3351
    invoke-static/range {v18 .. v24}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 3352
    .line 3353
    .line 3354
    goto :goto_41

    .line 3355
    :goto_42
    iget-object v3, v3, La/bnk0;->a:Ljava/util/ArrayList;

    .line 3356
    .line 3357
    invoke-static {v2, v3, v2}, La/w6x;->l(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)La/ank0;

    .line 3358
    .line 3359
    .line 3360
    move-result-object v2

    .line 3361
    invoke-virtual {v14, v11}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 3362
    .line 3363
    .line 3364
    move-result v3

    .line 3365
    if-gez v3, :cond_76

    .line 3366
    .line 3367
    if-nez v13, :cond_76

    .line 3368
    .line 3369
    move-wide/from16 v3, v32

    .line 3370
    .line 3371
    const/16 v33, 0x1

    .line 3372
    .line 3373
    goto :goto_43

    .line 3374
    :cond_76
    move-wide/from16 v3, v32

    .line 3375
    .line 3376
    const/16 v33, 0x0

    .line 3377
    .line 3378
    :goto_43
    invoke-virtual {v14, v15}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 3379
    .line 3380
    .line 3381
    move-result v5

    .line 3382
    if-lez v5, :cond_77

    .line 3383
    .line 3384
    if-nez v13, :cond_77

    .line 3385
    .line 3386
    const/16 v34, 0x1

    .line 3387
    .line 3388
    goto :goto_44

    .line 3389
    :cond_77
    const/16 v34, 0x0

    .line 3390
    .line 3391
    :goto_44
    if-eqz v12, :cond_78

    .line 3392
    .line 3393
    cmpl-double v5, v8, v6

    .line 3394
    .line 3395
    if-ltz v5, :cond_78

    .line 3396
    .line 3397
    const/4 v5, 0x1

    .line 3398
    goto :goto_45

    .line 3399
    :cond_78
    const/4 v5, 0x0

    .line 3400
    :goto_45
    invoke-interface {v14, v15}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 3401
    .line 3402
    .line 3403
    move-result v13

    .line 3404
    if-ltz v13, :cond_79

    .line 3405
    .line 3406
    invoke-interface {v14, v11}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 3407
    .line 3408
    .line 3409
    move-result v13

    .line 3410
    if-gtz v13, :cond_79

    .line 3411
    .line 3412
    const/4 v13, 0x1

    .line 3413
    goto :goto_46

    .line 3414
    :cond_79
    const/4 v13, 0x0

    .line 3415
    :goto_46
    cmpg-double v18, v6, v8

    .line 3416
    .line 3417
    const-wide/high16 v19, -0x4010000000000000L    # -1.0

    .line 3418
    .line 3419
    if-gtz v18, :cond_7a

    .line 3420
    .line 3421
    cmpg-double v18, v8, v3

    .line 3422
    .line 3423
    if-gtz v18, :cond_7a

    .line 3424
    .line 3425
    goto :goto_47

    .line 3426
    :cond_7a
    if-eqz v5, :cond_7c

    .line 3427
    .line 3428
    :goto_47
    cmpg-double v5, v8, v19

    .line 3429
    .line 3430
    if-nez v5, :cond_7b

    .line 3431
    .line 3432
    goto :goto_48

    .line 3433
    :cond_7b
    const/4 v5, 0x1

    .line 3434
    goto :goto_49

    .line 3435
    :cond_7c
    :goto_48
    const/4 v5, 0x0

    .line 3436
    :goto_49
    if-eqz v13, :cond_7d

    .line 3437
    .line 3438
    if-eqz v5, :cond_7d

    .line 3439
    .line 3440
    const/16 v35, 0x1

    .line 3441
    .line 3442
    goto :goto_4a

    .line 3443
    :cond_7d
    const/16 v35, 0x0

    .line 3444
    .line 3445
    :goto_4a
    cmpg-double v5, v8, v19

    .line 3446
    .line 3447
    if-nez v5, :cond_7e

    .line 3448
    .line 3449
    move-object/from16 v36, v29

    .line 3450
    .line 3451
    :goto_4b
    move-object/from16 v32, v2

    .line 3452
    .line 3453
    move-wide/from16 p0, v3

    .line 3454
    .line 3455
    goto :goto_4c

    .line 3456
    :cond_7e
    sget-object v5, La/pn40;->a:La/pn40;

    .line 3457
    .line 3458
    sget-object v5, La/p3u0;->g:La/p3u0;

    .line 3459
    .line 3460
    invoke-static {v8, v9, v5}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 3461
    .line 3462
    .line 3463
    move-result-object v5

    .line 3464
    move-object/from16 v36, v5

    .line 3465
    .line 3466
    goto :goto_4b

    .line 3467
    :goto_4c
    iget-wide v2, v0, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->d:D

    .line 3468
    .line 3469
    iget-wide v4, v0, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->e:D

    .line 3470
    .line 3471
    iget-object v13, v0, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->f:Ljava/lang/String;

    .line 3472
    .line 3473
    move-wide/from16 v38, v2

    .line 3474
    .line 3475
    iget-boolean v2, v0, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->g:Z

    .line 3476
    .line 3477
    cmpg-double v3, v38, v8

    .line 3478
    .line 3479
    if-gtz v3, :cond_7f

    .line 3480
    .line 3481
    cmpg-double v3, v8, v4

    .line 3482
    .line 3483
    if-gtz v3, :cond_7f

    .line 3484
    .line 3485
    :goto_4d
    move/from16 v37, v2

    .line 3486
    .line 3487
    move-wide/from16 v41, v4

    .line 3488
    .line 3489
    move-object/from16 v40, v13

    .line 3490
    .line 3491
    goto :goto_4e

    .line 3492
    :cond_7f
    cmpg-double v3, v8, v19

    .line 3493
    .line 3494
    if-nez v3, :cond_80

    .line 3495
    .line 3496
    goto :goto_4d

    .line 3497
    :goto_4e
    invoke-static/range {v37 .. v42}, La/h8x;->r(ZDLjava/lang/String;D)La/ank0;

    .line 3498
    .line 3499
    .line 3500
    move-result-object v2

    .line 3501
    :goto_4f
    move-object/from16 v37, v2

    .line 3502
    .line 3503
    goto :goto_50

    .line 3504
    :cond_80
    move-wide/from16 v2, v38

    .line 3505
    .line 3506
    cmpg-double v18, v8, v2

    .line 3507
    .line 3508
    if-gez v18, :cond_81

    .line 3509
    .line 3510
    invoke-static {v10, v2, v3, v13}, La/h8x;->u(La/ctf0;DLjava/lang/String;)La/ank0;

    .line 3511
    .line 3512
    .line 3513
    move-result-object v2

    .line 3514
    goto :goto_4f

    .line 3515
    :cond_81
    cmpl-double v2, v8, v4

    .line 3516
    .line 3517
    if-lez v2, :cond_82

    .line 3518
    .line 3519
    invoke-static {v10, v4, v5, v13}, La/h8x;->s(La/ctf0;DLjava/lang/String;)La/ank0;

    .line 3520
    .line 3521
    .line 3522
    move-result-object v2

    .line 3523
    goto :goto_4f

    .line 3524
    :cond_82
    new-instance v2, La/ank0;

    .line 3525
    .line 3526
    sget-object v3, La/iun;->a:La/iun;

    .line 3527
    .line 3528
    invoke-direct {v2, v3}, La/ank0;-><init>(Ljava/util/List;)V

    .line 3529
    .line 3530
    .line 3531
    goto :goto_4f

    .line 3532
    :goto_50
    iget-boolean v2, v0, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->l:Z

    .line 3533
    .line 3534
    iget-boolean v3, v1, Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;->f:Z

    .line 3535
    .line 3536
    sget-object v4, La/pn40;->a:La/pn40;

    .line 3537
    .line 3538
    invoke-virtual {v15}, Ljava/math/BigDecimal;->doubleValue()D

    .line 3539
    .line 3540
    .line 3541
    move-result-wide v4

    .line 3542
    sget-object v13, La/p3u0;->c:La/p3u0;

    .line 3543
    .line 3544
    invoke-static {v4, v5, v13}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 3545
    .line 3546
    .line 3547
    move-result-object v4

    .line 3548
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 3549
    .line 3550
    .line 3551
    move-result-object v4

    .line 3552
    const v5, 0x7f13023d

    .line 3553
    .line 3554
    .line 3555
    invoke-virtual {v10, v5, v4}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 3556
    .line 3557
    .line 3558
    move-result-object v40

    .line 3559
    iget-object v4, v0, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->i:Lorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;

    .line 3560
    .line 3561
    iget-boolean v5, v4, Lorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;->a:Z

    .line 3562
    .line 3563
    if-eqz v5, :cond_83

    .line 3564
    .line 3565
    if-nez v12, :cond_83

    .line 3566
    .line 3567
    const/4 v5, 0x1

    .line 3568
    :goto_51
    const/4 v10, 0x2

    .line 3569
    const-wide/16 v12, 0x0

    .line 3570
    .line 3571
    goto :goto_52

    .line 3572
    :cond_83
    const/4 v5, 0x0

    .line 3573
    goto :goto_51

    .line 3574
    :goto_52
    invoke-static {v4, v5, v12, v13, v10}, Lorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;->a(Lorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;ZDI)Lorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;

    .line 3575
    .line 3576
    .line 3577
    move-result-object v41

    .line 3578
    invoke-interface {v14, v15}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 3579
    .line 3580
    .line 3581
    move-result v4

    .line 3582
    if-ltz v4, :cond_84

    .line 3583
    .line 3584
    invoke-interface {v14, v11}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 3585
    .line 3586
    .line 3587
    move-result v4

    .line 3588
    if-gtz v4, :cond_84

    .line 3589
    .line 3590
    const/4 v11, 0x1

    .line 3591
    goto :goto_53

    .line 3592
    :cond_84
    const/4 v11, 0x0

    .line 3593
    :goto_53
    new-instance v4, Ljava/math/BigDecimal;

    .line 3594
    .line 3595
    invoke-static/range {v19 .. v20}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 3596
    .line 3597
    .line 3598
    move-result-object v5

    .line 3599
    invoke-direct {v4, v5}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 3600
    .line 3601
    .line 3602
    invoke-virtual {v14, v4}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 3603
    .line 3604
    .line 3605
    move-result v4

    .line 3606
    if-nez v4, :cond_85

    .line 3607
    .line 3608
    const/4 v4, 0x1

    .line 3609
    goto :goto_54

    .line 3610
    :cond_85
    const/4 v4, 0x0

    .line 3611
    :goto_54
    if-nez v11, :cond_86

    .line 3612
    .line 3613
    if-nez v4, :cond_86

    .line 3614
    .line 3615
    const/16 v42, 0x1

    .line 3616
    .line 3617
    goto :goto_55

    .line 3618
    :cond_86
    const/16 v42, 0x0

    .line 3619
    .line 3620
    :goto_55
    cmpg-double v4, v6, v8

    .line 3621
    .line 3622
    if-gtz v4, :cond_87

    .line 3623
    .line 3624
    cmpg-double v4, v8, p0

    .line 3625
    .line 3626
    if-gtz v4, :cond_87

    .line 3627
    .line 3628
    goto :goto_56

    .line 3629
    :cond_87
    cmpg-double v4, v8, v19

    .line 3630
    .line 3631
    if-nez v4, :cond_88

    .line 3632
    .line 3633
    :goto_56
    const/4 v7, 0x1

    .line 3634
    :goto_57
    const/16 v27, 0x1

    .line 3635
    .line 3636
    goto :goto_58

    .line 3637
    :cond_88
    const/4 v7, 0x0

    .line 3638
    goto :goto_57

    .line 3639
    :goto_58
    xor-int/lit8 v43, v7, 0x1

    .line 3640
    .line 3641
    iget-boolean v1, v1, Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;->g:Z

    .line 3642
    .line 3643
    iget-boolean v0, v0, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->p:Z

    .line 3644
    .line 3645
    new-instance v30, La/x05;

    .line 3646
    .line 3647
    move/from16 v45, v0

    .line 3648
    .line 3649
    move/from16 v44, v1

    .line 3650
    .line 3651
    move/from16 v39, v2

    .line 3652
    .line 3653
    move/from16 v38, v3

    .line 3654
    .line 3655
    invoke-direct/range {v30 .. v45}, La/x05;-><init>(Ljava/lang/String;La/ank0;ZZZLjava/lang/String;La/ank0;ZZLjava/lang/String;Lorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;ZZZZ)V

    .line 3656
    .line 3657
    .line 3658
    return-object v30

    .line 3659
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
