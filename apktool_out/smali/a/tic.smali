.class public final La/tic;
.super La/zzf0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public j:La/dpa0;

.field public k:I

.field public l:J

.field public m:B

.field public synthetic n:Ljava/lang/Object;

.field public final synthetic o:Z

.field public final synthetic p:La/cgk0;

.field public final synthetic q:La/pz40;


# direct methods
.method public constructor <init>(ZLa/cgk0;La/pz40;La/yje;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La/tic;->o:Z

    .line 2
    .line 3
    iput-object p2, p0, La/tic;->p:La/cgk0;

    .line 4
    .line 5
    iput-object p3, p0, La/tic;->q:La/pz40;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, La/zzf0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 3

    .line 1
    new-instance v0, La/tic;

    .line 2
    .line 3
    iget-object v1, p0, La/tic;->p:La/cgk0;

    .line 4
    .line 5
    iget-object v2, p0, La/tic;->q:La/pz40;

    .line 6
    .line 7
    iget-boolean p0, p0, La/tic;->o:Z

    .line 8
    .line 9
    invoke-direct {v0, p0, v1, v2, p2}, La/tic;-><init>(ZLa/cgk0;La/pz40;La/yje;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, La/tic;->n:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/inn0;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/tic;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/tic;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/tic;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/tic;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/inn0;

    .line 6
    .line 7
    sget-object v2, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-byte v3, v0, La/tic;->m:B

    .line 10
    .line 11
    const/4 v4, 0x2

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x1

    .line 15
    if-eqz v3, :cond_2

    .line 16
    .line 17
    if-eq v3, v7, :cond_1

    .line 18
    .line 19
    if-ne v3, v4, :cond_0

    .line 20
    .line 21
    iget-wide v8, v0, La/tic;->l:J

    .line 22
    .line 23
    iget v3, v0, La/tic;->k:I

    .line 24
    .line 25
    iget-object v10, v0, La/tic;->j:La/dpa0;

    .line 26
    .line 27
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    move-object/from16 v11, p1

    .line 31
    .line 32
    goto :goto_3

    .line 33
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object v5

    .line 39
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object/from16 v3, p1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iput-object v1, v0, La/tic;->n:Ljava/lang/Object;

    .line 49
    .line 50
    iput-byte v7, v0, La/tic;->m:B

    .line 51
    .line 52
    invoke-static {v1, v6, v0, v4}, La/tto0;->b(La/inn0;ZLa/yje;I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    if-ne v3, v2, :cond_3

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    :goto_0
    check-cast v3, La/dpa0;

    .line 60
    .line 61
    iget-wide v8, v3, La/dpa0;->c:J

    .line 62
    .line 63
    move-object v10, v3

    .line 64
    move v3, v6

    .line 65
    :goto_1
    iput-object v1, v0, La/tic;->n:Ljava/lang/Object;

    .line 66
    .line 67
    iput-object v10, v0, La/tic;->j:La/dpa0;

    .line 68
    .line 69
    iput v3, v0, La/tic;->k:I

    .line 70
    .line 71
    iput-wide v8, v0, La/tic;->l:J

    .line 72
    .line 73
    iput-byte v4, v0, La/tic;->m:B

    .line 74
    .line 75
    sget-object v11, La/xoa0;->b:La/xoa0;

    .line 76
    .line 77
    invoke-virtual {v1, v11, v0}, La/inn0;->a(La/xoa0;La/yje;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v11

    .line 81
    if-ne v11, v2, :cond_4

    .line 82
    .line 83
    :goto_2
    return-object v2

    .line 84
    :cond_4
    :goto_3
    check-cast v11, La/woa0;

    .line 85
    .line 86
    iget-object v12, v11, La/woa0;->a:Ljava/util/List;

    .line 87
    .line 88
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v12

    .line 92
    :goto_4
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v13

    .line 96
    if-eqz v13, :cond_6

    .line 97
    .line 98
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v13

    .line 102
    move-object v14, v13

    .line 103
    check-cast v14, La/dpa0;

    .line 104
    .line 105
    iget-wide v14, v14, La/dpa0;->a:J

    .line 106
    .line 107
    iget-wide v4, v10, La/dpa0;->a:J

    .line 108
    .line 109
    invoke-static {v14, v15, v4, v5}, La/b5x;->I(JJ)Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-eqz v4, :cond_5

    .line 114
    .line 115
    goto :goto_5

    .line 116
    :cond_5
    const/4 v4, 0x2

    .line 117
    const/4 v5, 0x0

    .line 118
    goto :goto_4

    .line 119
    :cond_6
    const/4 v13, 0x0

    .line 120
    :goto_5
    check-cast v13, La/dpa0;

    .line 121
    .line 122
    iget-object v5, v0, La/tic;->q:La/pz40;

    .line 123
    .line 124
    iget-object v12, v0, La/tic;->p:La/cgk0;

    .line 125
    .line 126
    if-eqz v13, :cond_a

    .line 127
    .line 128
    const-wide v16, 0xffffffffL

    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    iget-wide v14, v13, La/dpa0;->c:J

    .line 134
    .line 135
    iget-boolean v7, v13, La/dpa0;->d:Z

    .line 136
    .line 137
    if-eqz v7, :cond_9

    .line 138
    .line 139
    invoke-static {v14, v15, v8, v9}, La/ne60;->e(JJ)J

    .line 140
    .line 141
    .line 142
    move-result-wide v18

    .line 143
    invoke-static/range {v18 .. v19}, La/ne60;->d(J)F

    .line 144
    .line 145
    .line 146
    move-result v7

    .line 147
    invoke-virtual {v1}, La/inn0;->e()La/wgu0;

    .line 148
    .line 149
    .line 150
    move-result-object v18

    .line 151
    invoke-interface/range {v18 .. v18}, La/wgu0;->h()F

    .line 152
    .line 153
    .line 154
    move-result v18

    .line 155
    cmpl-float v7, v7, v18

    .line 156
    .line 157
    if-lez v7, :cond_9

    .line 158
    .line 159
    if-nez v3, :cond_7

    .line 160
    .line 161
    const/4 v3, 0x1

    .line 162
    :cond_7
    iget-object v7, v1, La/inn0;->f:La/jnn0;

    .line 163
    .line 164
    move-object/from16 v18, v5

    .line 165
    .line 166
    iget-wide v4, v7, La/jnn0;->x:J

    .line 167
    .line 168
    and-long v4, v4, v16

    .line 169
    .line 170
    long-to-int v4, v4

    .line 171
    div-int/lit8 v4, v4, 0xc

    .line 172
    .line 173
    and-long v14, v14, v16

    .line 174
    .line 175
    long-to-int v5, v14

    .line 176
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    int-to-float v4, v4

    .line 181
    div-float/2addr v5, v4

    .line 182
    float-to-int v4, v5

    .line 183
    const/16 v5, 0xb

    .line 184
    .line 185
    invoke-static {v4, v6, v5}, La/l1e0;->d(III)I

    .line 186
    .line 187
    .line 188
    move-result v4

    .line 189
    invoke-virtual {v12}, La/cgk0;->l()I

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    if-eq v5, v4, :cond_8

    .line 194
    .line 195
    invoke-virtual {v12, v4}, La/cgk0;->m(I)V

    .line 196
    .line 197
    .line 198
    invoke-interface/range {v18 .. v18}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 203
    .line 204
    new-instance v7, La/x8q;

    .line 205
    .line 206
    invoke-direct {v7, v4}, La/x8q;-><init>(I)V

    .line 207
    .line 208
    .line 209
    invoke-interface {v5, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    :cond_8
    invoke-virtual {v13}, La/dpa0;->a()V

    .line 213
    .line 214
    .line 215
    goto :goto_6

    .line 216
    :cond_9
    move-object/from16 v18, v5

    .line 217
    .line 218
    goto :goto_6

    .line 219
    :cond_a
    move-object/from16 v18, v5

    .line 220
    .line 221
    const-wide v16, 0xffffffffL

    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    :goto_6
    iget-object v4, v11, La/woa0;->a:Ljava/util/List;

    .line 227
    .line 228
    if-eqz v4, :cond_b

    .line 229
    .line 230
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 231
    .line 232
    .line 233
    move-result v5

    .line 234
    if-eqz v5, :cond_b

    .line 235
    .line 236
    goto :goto_7

    .line 237
    :cond_b
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    :cond_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 242
    .line 243
    .line 244
    move-result v5

    .line 245
    if-eqz v5, :cond_d

    .line 246
    .line 247
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v5

    .line 251
    check-cast v5, La/dpa0;

    .line 252
    .line 253
    iget-boolean v5, v5, La/dpa0;->d:Z

    .line 254
    .line 255
    if-eqz v5, :cond_c

    .line 256
    .line 257
    const/4 v4, 0x2

    .line 258
    const/4 v5, 0x0

    .line 259
    const/4 v7, 0x1

    .line 260
    goto/16 :goto_1

    .line 261
    .line 262
    :cond_d
    :goto_7
    if-eqz v3, :cond_e

    .line 263
    .line 264
    invoke-interface/range {v18 .. v18}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 269
    .line 270
    new-instance v1, La/x8q;

    .line 271
    .line 272
    invoke-virtual {v12}, La/cgk0;->l()I

    .line 273
    .line 274
    .line 275
    move-result v2

    .line 276
    invoke-direct {v1, v2}, La/x8q;-><init>(I)V

    .line 277
    .line 278
    .line 279
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    goto/16 :goto_c

    .line 283
    .line 284
    :cond_e
    const/high16 v2, 0x40000000    # 2.0f

    .line 285
    .line 286
    iget-boolean v0, v0, La/tic;->o:Z

    .line 287
    .line 288
    const/high16 v3, 0x42f80000    # 124.0f

    .line 289
    .line 290
    const/16 v4, 0x20

    .line 291
    .line 292
    if-nez v0, :cond_10

    .line 293
    .line 294
    shr-long v10, v8, v4

    .line 295
    .line 296
    long-to-int v5, v10

    .line 297
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 298
    .line 299
    .line 300
    move-result v5

    .line 301
    iget-object v7, v1, La/inn0;->f:La/jnn0;

    .line 302
    .line 303
    iget-wide v10, v7, La/jnn0;->x:J

    .line 304
    .line 305
    shr-long/2addr v10, v4

    .line 306
    long-to-int v7, v10

    .line 307
    int-to-float v7, v7

    .line 308
    invoke-virtual {v1, v3}, La/inn0;->w0(F)F

    .line 309
    .line 310
    .line 311
    move-result v10

    .line 312
    sub-float/2addr v7, v10

    .line 313
    cmpl-float v5, v5, v7

    .line 314
    .line 315
    if-lez v5, :cond_f

    .line 316
    .line 317
    const/4 v7, 0x1

    .line 318
    goto :goto_8

    .line 319
    :cond_f
    move v7, v6

    .line 320
    :goto_8
    iget-object v5, v1, La/inn0;->f:La/jnn0;

    .line 321
    .line 322
    iget-wide v10, v5, La/jnn0;->x:J

    .line 323
    .line 324
    shr-long/2addr v10, v4

    .line 325
    long-to-int v5, v10

    .line 326
    int-to-float v5, v5

    .line 327
    invoke-virtual {v1, v3}, La/inn0;->w0(F)F

    .line 328
    .line 329
    .line 330
    move-result v3

    .line 331
    div-float/2addr v3, v2

    .line 332
    sub-float/2addr v5, v3

    .line 333
    goto :goto_a

    .line 334
    :cond_10
    shr-long v10, v8, v4

    .line 335
    .line 336
    long-to-int v5, v10

    .line 337
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 338
    .line 339
    .line 340
    move-result v5

    .line 341
    invoke-virtual {v1, v3}, La/inn0;->w0(F)F

    .line 342
    .line 343
    .line 344
    move-result v7

    .line 345
    cmpg-float v5, v5, v7

    .line 346
    .line 347
    if-gez v5, :cond_11

    .line 348
    .line 349
    const/4 v7, 0x1

    .line 350
    goto :goto_9

    .line 351
    :cond_11
    move v7, v6

    .line 352
    :goto_9
    invoke-virtual {v1, v3}, La/inn0;->w0(F)F

    .line 353
    .line 354
    .line 355
    move-result v3

    .line 356
    div-float v5, v3, v2

    .line 357
    .line 358
    :goto_a
    iget-object v1, v1, La/inn0;->f:La/jnn0;

    .line 359
    .line 360
    iget-wide v1, v1, La/jnn0;->x:J

    .line 361
    .line 362
    and-long v1, v1, v16

    .line 363
    .line 364
    long-to-int v1, v1

    .line 365
    if-lez v1, :cond_15

    .line 366
    .line 367
    if-eqz v7, :cond_15

    .line 368
    .line 369
    div-int/lit8 v1, v1, 0xc

    .line 370
    .line 371
    and-long v2, v8, v16

    .line 372
    .line 373
    long-to-int v2, v2

    .line 374
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 375
    .line 376
    .line 377
    move-result v2

    .line 378
    int-to-float v1, v1

    .line 379
    div-float/2addr v2, v1

    .line 380
    float-to-int v1, v2

    .line 381
    const/16 v2, 0xb

    .line 382
    .line 383
    invoke-static {v1, v6, v2}, La/l1e0;->d(III)I

    .line 384
    .line 385
    .line 386
    move-result v1

    .line 387
    invoke-virtual {v12, v1}, La/cgk0;->m(I)V

    .line 388
    .line 389
    .line 390
    shr-long v1, v8, v4

    .line 391
    .line 392
    long-to-int v1, v1

    .line 393
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 394
    .line 395
    .line 396
    move-result v1

    .line 397
    if-nez v0, :cond_13

    .line 398
    .line 399
    cmpg-float v0, v1, v5

    .line 400
    .line 401
    if-gez v0, :cond_12

    .line 402
    .line 403
    sget-object v0, La/wbq;->a:La/wbq;

    .line 404
    .line 405
    goto :goto_b

    .line 406
    :cond_12
    sget-object v0, La/wbq;->b:La/wbq;

    .line 407
    .line 408
    goto :goto_b

    .line 409
    :cond_13
    cmpl-float v0, v1, v5

    .line 410
    .line 411
    if-lez v0, :cond_14

    .line 412
    .line 413
    sget-object v0, La/wbq;->a:La/wbq;

    .line 414
    .line 415
    goto :goto_b

    .line 416
    :cond_14
    sget-object v0, La/wbq;->b:La/wbq;

    .line 417
    .line 418
    :goto_b
    invoke-interface/range {v18 .. v18}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 423
    .line 424
    new-instance v2, La/b9q;

    .line 425
    .line 426
    invoke-virtual {v12}, La/cgk0;->l()I

    .line 427
    .line 428
    .line 429
    move-result v3

    .line 430
    invoke-direct {v2, v3, v0}, La/b9q;-><init>(ILa/wbq;)V

    .line 431
    .line 432
    .line 433
    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    goto :goto_c

    .line 437
    :cond_15
    div-int/lit8 v1, v1, 0xc

    .line 438
    .line 439
    and-long v2, v8, v16

    .line 440
    .line 441
    long-to-int v0, v2

    .line 442
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 443
    .line 444
    .line 445
    move-result v0

    .line 446
    int-to-float v1, v1

    .line 447
    div-float/2addr v0, v1

    .line 448
    float-to-int v0, v0

    .line 449
    const/16 v2, 0xb

    .line 450
    .line 451
    invoke-static {v0, v6, v2}, La/l1e0;->d(III)I

    .line 452
    .line 453
    .line 454
    move-result v0

    .line 455
    invoke-virtual {v12}, La/cgk0;->l()I

    .line 456
    .line 457
    .line 458
    move-result v1

    .line 459
    if-eq v1, v0, :cond_16

    .line 460
    .line 461
    invoke-virtual {v12, v0}, La/cgk0;->m(I)V

    .line 462
    .line 463
    .line 464
    invoke-interface/range {v18 .. v18}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v1

    .line 468
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 469
    .line 470
    new-instance v2, La/x8q;

    .line 471
    .line 472
    invoke-direct {v2, v0}, La/x8q;-><init>(I)V

    .line 473
    .line 474
    .line 475
    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    :cond_16
    :goto_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 479
    .line 480
    return-object v0
.end method
