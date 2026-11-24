.class public final synthetic La/s05;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:La/y9q0;

.field public final synthetic c:La/psq;

.field public final synthetic d:La/nrq;

.field public final synthetic e:J

.field public final synthetic f:La/u12;

.field public final synthetic g:F

.field public final synthetic h:La/j83;

.field public final synthetic i:Z

.field public final synthetic j:I

.field public final synthetic k:Z

.field public final synthetic l:Ljava/util/List;

.field public final synthetic m:La/jhn0;

.field public final synthetic n:B

.field public final synthetic o:Z

.field public final synthetic p:Ljava/util/Map;

.field public final synthetic q:Lkotlin/jvm/functions/Function1;

.field public final synthetic r:J

.field public final synthetic s:J

.field public final synthetic t:J


# direct methods
.method public synthetic constructor <init>(JLa/y9q0;La/psq;La/nrq;JLa/u12;FLa/j83;ZIZLjava/util/List;La/jhn0;IILjava/util/Map;Lkotlin/jvm/functions/Function1;JJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La/s05;->a:J

    iput-object p3, p0, La/s05;->b:La/y9q0;

    iput-object p4, p0, La/s05;->c:La/psq;

    iput-object p5, p0, La/s05;->d:La/nrq;

    iput-wide p6, p0, La/s05;->e:J

    iput-object p8, p0, La/s05;->f:La/u12;

    iput p9, p0, La/s05;->g:F

    iput-object p10, p0, La/s05;->h:La/j83;

    iput-boolean p11, p0, La/s05;->i:Z

    iput p12, p0, La/s05;->j:I

    iput-boolean p13, p0, La/s05;->k:Z

    iput-object p14, p0, La/s05;->l:Ljava/util/List;

    iput-object p15, p0, La/s05;->m:La/jhn0;

    move/from16 p1, p16

    iput-byte p1, p0, La/s05;->n:B

    move/from16 p1, p17

    iput-boolean p1, p0, La/s05;->o:Z

    move-object/from16 p1, p18

    iput-object p1, p0, La/s05;->p:Ljava/util/Map;

    move-object/from16 p1, p19

    iput-object p1, p0, La/s05;->q:Lkotlin/jvm/functions/Function1;

    move-wide/from16 p1, p20

    iput-wide p1, p0, La/s05;->r:J

    move-wide/from16 p1, p22

    iput-wide p1, p0, La/s05;->s:J

    move-wide/from16 p1, p24

    iput-wide p1, p0, La/s05;->t:J

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    check-cast v2, La/lr8;

    .line 6
    .line 7
    move-object/from16 v13, p2

    .line 8
    .line 9
    check-cast v13, La/fet;

    .line 10
    .line 11
    move-object/from16 v1, p3

    .line 12
    .line 13
    check-cast v1, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    and-int/lit8 v3, v1, 0x6

    .line 23
    .line 24
    const/4 v4, 0x4

    .line 25
    if-nez v3, :cond_1

    .line 26
    .line 27
    invoke-virtual {v13, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    move v3, v4

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v3, 0x2

    .line 36
    :goto_0
    or-int/2addr v1, v3

    .line 37
    :cond_1
    and-int/lit8 v3, v1, 0x13

    .line 38
    .line 39
    const/16 v5, 0x12

    .line 40
    .line 41
    if-eq v3, v5, :cond_2

    .line 42
    .line 43
    const/4 v3, 0x1

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    const/4 v3, 0x0

    .line 46
    :goto_1
    and-int/lit8 v5, v1, 0x1

    .line 47
    .line 48
    invoke-virtual {v13, v5, v3}, La/fet;->U(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_37

    .line 53
    .line 54
    sget-object v3, La/v8q0;->a:La/zfn;

    .line 55
    .line 56
    invoke-virtual {v13, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, La/y9q0;

    .line 61
    .line 62
    new-instance v5, La/y3d;

    .line 63
    .line 64
    iget-wide v6, v0, La/s05;->a:J

    .line 65
    .line 66
    invoke-direct {v5, v6, v7}, La/y3d;-><init>(J)V

    .line 67
    .line 68
    .line 69
    const-wide/16 v8, 0x10

    .line 70
    .line 71
    cmp-long v6, v6, v8

    .line 72
    .line 73
    const/16 v16, 0x0

    .line 74
    .line 75
    if-eqz v6, :cond_3

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    move-object/from16 v5, v16

    .line 79
    .line 80
    :goto_2
    iget-object v6, v0, La/s05;->b:La/y9q0;

    .line 81
    .line 82
    if-eqz v5, :cond_4

    .line 83
    .line 84
    iget-wide v7, v5, La/y3d;->a:J

    .line 85
    .line 86
    :goto_3
    move-wide/from16 v18, v7

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_4
    invoke-virtual {v6}, La/y9q0;->b()J

    .line 90
    .line 91
    .line 92
    move-result-wide v7

    .line 93
    goto :goto_3

    .line 94
    :goto_4
    iget-object v5, v6, La/y9q0;->a:La/smk0;

    .line 95
    .line 96
    iget-object v7, v5, La/smk0;->d:La/lsq;

    .line 97
    .line 98
    iget-object v8, v0, La/s05;->c:La/psq;

    .line 99
    .line 100
    if-nez v8, :cond_5

    .line 101
    .line 102
    iget-object v8, v5, La/smk0;->c:La/psq;

    .line 103
    .line 104
    :cond_5
    move-object/from16 v22, v8

    .line 105
    .line 106
    iget-object v8, v0, La/s05;->d:La/nrq;

    .line 107
    .line 108
    if-nez v8, :cond_6

    .line 109
    .line 110
    iget-object v8, v5, La/smk0;->f:La/nrq;

    .line 111
    .line 112
    :cond_6
    move-object/from16 v24, v8

    .line 113
    .line 114
    new-instance v5, La/daq0;

    .line 115
    .line 116
    iget-wide v8, v0, La/s05;->e:J

    .line 117
    .line 118
    invoke-direct {v5, v8, v9}, La/daq0;-><init>(J)V

    .line 119
    .line 120
    .line 121
    const-wide v36, 0xff00000000L

    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    and-long v8, v8, v36

    .line 127
    .line 128
    const-wide/16 v38, 0x0

    .line 129
    .line 130
    cmp-long v8, v8, v38

    .line 131
    .line 132
    if-nez v8, :cond_7

    .line 133
    .line 134
    move-object/from16 v5, v16

    .line 135
    .line 136
    :cond_7
    if-eqz v5, :cond_8

    .line 137
    .line 138
    iget-wide v8, v5, La/daq0;->a:J

    .line 139
    .line 140
    :goto_5
    move-wide/from16 v25, v8

    .line 141
    .line 142
    goto :goto_6

    .line 143
    :cond_8
    iget-object v5, v6, La/y9q0;->a:La/smk0;

    .line 144
    .line 145
    iget-wide v8, v5, La/smk0;->h:J

    .line 146
    .line 147
    goto :goto_5

    .line 148
    :goto_6
    iget-object v5, v6, La/y9q0;->a:La/smk0;

    .line 149
    .line 150
    iget-object v5, v5, La/smk0;->m:La/k5q0;

    .line 151
    .line 152
    sget-object v8, La/gqw0;->a:La/zx7;

    .line 153
    .line 154
    iget-object v9, v0, La/s05;->f:La/u12;

    .line 155
    .line 156
    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v8

    .line 160
    if-nez v8, :cond_e

    .line 161
    .line 162
    sget-object v8, La/gqw0;->d:La/zx7;

    .line 163
    .line 164
    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v8

    .line 168
    if-nez v8, :cond_e

    .line 169
    .line 170
    sget-object v8, La/gqw0;->g:La/zx7;

    .line 171
    .line 172
    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v8

    .line 176
    if-eqz v8, :cond_9

    .line 177
    .line 178
    goto :goto_a

    .line 179
    :cond_9
    sget-object v8, La/gqw0;->b:La/zx7;

    .line 180
    .line 181
    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v8

    .line 185
    if-nez v8, :cond_d

    .line 186
    .line 187
    sget-object v8, La/gqw0;->e:La/zx7;

    .line 188
    .line 189
    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v8

    .line 193
    if-nez v8, :cond_d

    .line 194
    .line 195
    sget-object v8, La/gqw0;->h:La/zx7;

    .line 196
    .line 197
    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v8

    .line 201
    if-eqz v8, :cond_a

    .line 202
    .line 203
    goto :goto_9

    .line 204
    :cond_a
    sget-object v8, La/gqw0;->c:La/zx7;

    .line 205
    .line 206
    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v8

    .line 210
    if-nez v8, :cond_c

    .line 211
    .line 212
    sget-object v8, La/gqw0;->f:La/zx7;

    .line 213
    .line 214
    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v8

    .line 218
    if-nez v8, :cond_c

    .line 219
    .line 220
    sget-object v8, La/gqw0;->i:La/zx7;

    .line 221
    .line 222
    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v8

    .line 226
    if-eqz v8, :cond_b

    .line 227
    .line 228
    goto :goto_7

    .line 229
    :cond_b
    const/16 v29, 0x0

    .line 230
    .line 231
    goto :goto_b

    .line 232
    :cond_c
    :goto_7
    const/4 v8, 0x6

    .line 233
    :goto_8
    move/from16 v29, v8

    .line 234
    .line 235
    goto :goto_b

    .line 236
    :cond_d
    :goto_9
    const/4 v8, 0x3

    .line 237
    goto :goto_8

    .line 238
    :cond_e
    :goto_a
    const/4 v8, 0x5

    .line 239
    goto :goto_8

    .line 240
    :goto_b
    const/16 v34, 0x0

    .line 241
    .line 242
    const v35, 0xff6f52

    .line 243
    .line 244
    .line 245
    const-wide/16 v20, 0x0

    .line 246
    .line 247
    const/16 v27, 0x0

    .line 248
    .line 249
    const/16 v30, 0x0

    .line 250
    .line 251
    const-wide/16 v31, 0x0

    .line 252
    .line 253
    const/16 v33, 0x0

    .line 254
    .line 255
    move-object/from16 v28, v5

    .line 256
    .line 257
    move-object/from16 v17, v6

    .line 258
    .line 259
    move-object/from16 v23, v7

    .line 260
    .line 261
    invoke-static/range {v17 .. v35}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 262
    .line 263
    .line 264
    move-result-object v5

    .line 265
    invoke-virtual {v3, v5}, La/y9q0;->d(La/y9q0;)La/y9q0;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    sget-object v5, La/bmd;->n:La/zfn;

    .line 270
    .line 271
    invoke-virtual {v13, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v5

    .line 275
    move-object v8, v5

    .line 276
    check-cast v8, La/k6z;

    .line 277
    .line 278
    sget-object v5, La/bmd;->h:La/zfn;

    .line 279
    .line 280
    invoke-virtual {v13, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v5

    .line 284
    move-object v10, v5

    .line 285
    check-cast v10, La/w6k;

    .line 286
    .line 287
    sget-object v5, La/bmd;->k:La/zfn;

    .line 288
    .line 289
    invoke-virtual {v13, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v5

    .line 293
    move-object v11, v5

    .line 294
    check-cast v11, La/mrq;

    .line 295
    .line 296
    invoke-static {v13}, La/pym0;->n(La/fet;)La/g9q0;

    .line 297
    .line 298
    .line 299
    move-result-object v12

    .line 300
    iget v5, v0, La/s05;->g:F

    .line 301
    .line 302
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 303
    .line 304
    .line 305
    move-result-object v6

    .line 306
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 307
    .line 308
    .line 309
    move-result v7

    .line 310
    const v9, 0x7f7fffff    # Float.MAX_VALUE

    .line 311
    .line 312
    .line 313
    cmpg-float v7, v7, v9

    .line 314
    .line 315
    const/high16 v9, 0x3f800000    # 1.0f

    .line 316
    .line 317
    if-gtz v7, :cond_f

    .line 318
    .line 319
    cmpl-float v5, v5, v9

    .line 320
    .line 321
    if-ltz v5, :cond_f

    .line 322
    .line 323
    goto :goto_c

    .line 324
    :cond_f
    move-object/from16 v6, v16

    .line 325
    .line 326
    :goto_c
    if-eqz v6, :cond_10

    .line 327
    .line 328
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    .line 329
    .line 330
    .line 331
    move-result v9

    .line 332
    :cond_10
    move v6, v9

    .line 333
    and-int/lit8 v1, v1, 0xe

    .line 334
    .line 335
    if-ne v1, v4, :cond_11

    .line 336
    .line 337
    const/4 v1, 0x1

    .line 338
    goto :goto_d

    .line 339
    :cond_11
    const/4 v1, 0x0

    .line 340
    :goto_d
    iget-object v4, v0, La/s05;->h:La/j83;

    .line 341
    .line 342
    invoke-virtual {v13, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result v5

    .line 346
    or-int/2addr v1, v5

    .line 347
    invoke-virtual {v13, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result v5

    .line 351
    or-int/2addr v1, v5

    .line 352
    iget-boolean v5, v0, La/s05;->i:Z

    .line 353
    .line 354
    invoke-virtual {v13, v5}, La/fet;->h(Z)Z

    .line 355
    .line 356
    .line 357
    move-result v7

    .line 358
    or-int/2addr v1, v7

    .line 359
    invoke-virtual {v13, v6}, La/fet;->d(F)Z

    .line 360
    .line 361
    .line 362
    move-result v7

    .line 363
    or-int/2addr v1, v7

    .line 364
    iget v7, v0, La/s05;->j:I

    .line 365
    .line 366
    invoke-virtual {v13, v7}, La/fet;->e(I)Z

    .line 367
    .line 368
    .line 369
    move-result v9

    .line 370
    or-int/2addr v1, v9

    .line 371
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 372
    .line 373
    .line 374
    move-result v9

    .line 375
    invoke-virtual {v13, v9}, La/fet;->e(I)Z

    .line 376
    .line 377
    .line 378
    move-result v9

    .line 379
    or-int/2addr v1, v9

    .line 380
    iget-boolean v9, v0, La/s05;->k:Z

    .line 381
    .line 382
    invoke-virtual {v13, v9}, La/fet;->h(Z)Z

    .line 383
    .line 384
    .line 385
    move-result v17

    .line 386
    or-int v1, v1, v17

    .line 387
    .line 388
    invoke-virtual {v13, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    move-result v17

    .line 392
    or-int v1, v1, v17

    .line 393
    .line 394
    invoke-virtual {v13, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 395
    .line 396
    .line 397
    move-result v17

    .line 398
    or-int v1, v1, v17

    .line 399
    .line 400
    invoke-virtual {v13, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    move-result v17

    .line 404
    or-int v1, v1, v17

    .line 405
    .line 406
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v14

    .line 410
    sget-object v15, La/ukd;->a:La/cl5;

    .line 411
    .line 412
    if-nez v1, :cond_13

    .line 413
    .line 414
    if-ne v14, v15, :cond_12

    .line 415
    .line 416
    goto :goto_e

    .line 417
    :cond_12
    move-object/from16 v40, v4

    .line 418
    .line 419
    move-object v4, v3

    .line 420
    move-object/from16 v3, v40

    .line 421
    .line 422
    goto :goto_f

    .line 423
    :cond_13
    :goto_e
    new-instance v1, La/t05;

    .line 424
    .line 425
    move-object/from16 v40, v4

    .line 426
    .line 427
    move-object v4, v3

    .line 428
    move-object/from16 v3, v40

    .line 429
    .line 430
    invoke-direct/range {v1 .. v12}, La/t05;-><init>(La/lr8;La/j83;La/y9q0;ZFILa/k6z;ZLa/w6k;La/mrq;La/g9q0;)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v13, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 434
    .line 435
    .line 436
    move-object v14, v1

    .line 437
    :goto_f
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 438
    .line 439
    iget-object v1, v0, La/s05;->l:Ljava/util/List;

    .line 440
    .line 441
    invoke-virtual {v13, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 442
    .line 443
    .line 444
    move-result v8

    .line 445
    iget-object v11, v0, La/s05;->m:La/jhn0;

    .line 446
    .line 447
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    .line 448
    .line 449
    .line 450
    move-result v12

    .line 451
    invoke-virtual {v13, v12}, La/fet;->e(I)Z

    .line 452
    .line 453
    .line 454
    move-result v12

    .line 455
    or-int/2addr v8, v12

    .line 456
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v12

    .line 460
    if-nez v8, :cond_15

    .line 461
    .line 462
    if-ne v12, v15, :cond_14

    .line 463
    .line 464
    goto :goto_10

    .line 465
    :cond_14
    move-object/from16 p3, v2

    .line 466
    .line 467
    move/from16 v19, v5

    .line 468
    .line 469
    move/from16 v18, v6

    .line 470
    .line 471
    goto/16 :goto_15

    .line 472
    .line 473
    :cond_15
    :goto_10
    sget-object v8, La/jhn0;->b:La/jhn0;

    .line 474
    .line 475
    if-ne v11, v8, :cond_16

    .line 476
    .line 477
    move-object/from16 p3, v2

    .line 478
    .line 479
    move/from16 v19, v5

    .line 480
    .line 481
    move/from16 v18, v6

    .line 482
    .line 483
    goto/16 :goto_14

    .line 484
    .line 485
    :cond_16
    sget-object v8, La/jhn0;->a:La/g9m0;

    .line 486
    .line 487
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 488
    .line 489
    .line 490
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 491
    .line 492
    .line 493
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 494
    .line 495
    .line 496
    move-result v8

    .line 497
    if-nez v8, :cond_17

    .line 498
    .line 499
    goto :goto_11

    .line 500
    :cond_17
    move-object/from16 v1, v16

    .line 501
    .line 502
    :goto_11
    if-eqz v1, :cond_1b

    .line 503
    .line 504
    new-instance v8, Ljava/util/ArrayList;

    .line 505
    .line 506
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 507
    .line 508
    .line 509
    move-result v11

    .line 510
    invoke-direct {v8, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 511
    .line 512
    .line 513
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 514
    .line 515
    .line 516
    move-result v11

    .line 517
    const/4 v12, 0x0

    .line 518
    :goto_12
    if-ge v12, v11, :cond_19

    .line 519
    .line 520
    move-object/from16 p3, v2

    .line 521
    .line 522
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v2

    .line 526
    move-object/from16 v17, v1

    .line 527
    .line 528
    move-object v1, v2

    .line 529
    check-cast v1, La/daq0;

    .line 530
    .line 531
    move/from16 v19, v5

    .line 532
    .line 533
    move/from16 v18, v6

    .line 534
    .line 535
    iget-wide v5, v1, La/daq0;->a:J

    .line 536
    .line 537
    invoke-static {v5, v6}, La/daq0;->e(J)Z

    .line 538
    .line 539
    .line 540
    move-result v1

    .line 541
    if-eqz v1, :cond_18

    .line 542
    .line 543
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 544
    .line 545
    .line 546
    :cond_18
    add-int/lit8 v12, v12, 0x1

    .line 547
    .line 548
    move-object/from16 v2, p3

    .line 549
    .line 550
    move-object/from16 v1, v17

    .line 551
    .line 552
    move/from16 v6, v18

    .line 553
    .line 554
    move/from16 v5, v19

    .line 555
    .line 556
    goto :goto_12

    .line 557
    :cond_19
    move-object/from16 p3, v2

    .line 558
    .line 559
    move/from16 v19, v5

    .line 560
    .line 561
    move/from16 v18, v6

    .line 562
    .line 563
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 564
    .line 565
    .line 566
    move-result v1

    .line 567
    if-nez v1, :cond_1a

    .line 568
    .line 569
    goto :goto_13

    .line 570
    :cond_1a
    move-object/from16 v8, v16

    .line 571
    .line 572
    :goto_13
    if-eqz v8, :cond_1c

    .line 573
    .line 574
    new-instance v1, La/mjf0;

    .line 575
    .line 576
    const/16 v2, 0x17

    .line 577
    .line 578
    invoke-direct {v1, v2}, La/mjf0;-><init>(B)V

    .line 579
    .line 580
    .line 581
    invoke-static {v8, v1}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 582
    .line 583
    .line 584
    move-result-object v1

    .line 585
    goto :goto_14

    .line 586
    :cond_1b
    move-object/from16 p3, v2

    .line 587
    .line 588
    move/from16 v19, v5

    .line 589
    .line 590
    move/from16 v18, v6

    .line 591
    .line 592
    :cond_1c
    move-object/from16 v1, v16

    .line 593
    .line 594
    :goto_14
    invoke-virtual {v13, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 595
    .line 596
    .line 597
    move-object v12, v1

    .line 598
    :goto_15
    check-cast v12, Ljava/util/List;

    .line 599
    .line 600
    if-nez v12, :cond_1d

    .line 601
    .line 602
    const v1, -0x2a5069e4

    .line 603
    .line 604
    .line 605
    invoke-virtual {v13, v1}, La/fet;->e0(I)V

    .line 606
    .line 607
    .line 608
    const/4 v1, 0x0

    .line 609
    invoke-virtual {v13, v1}, La/fet;->r(Z)V

    .line 610
    .line 611
    .line 612
    move-object/from16 v2, v16

    .line 613
    .line 614
    goto :goto_16

    .line 615
    :cond_1d
    const v1, -0x2a5069e3

    .line 616
    .line 617
    .line 618
    invoke-virtual {v13, v1}, La/fet;->e0(I)V

    .line 619
    .line 620
    .line 621
    invoke-virtual {v13, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 622
    .line 623
    .line 624
    move-result v1

    .line 625
    invoke-virtual {v13, v14}, La/fet;->g(Ljava/lang/Object;)Z

    .line 626
    .line 627
    .line 628
    move-result v2

    .line 629
    or-int/2addr v1, v2

    .line 630
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 631
    .line 632
    .line 633
    move-result-object v2

    .line 634
    if-nez v1, :cond_1e

    .line 635
    .line 636
    if-ne v2, v15, :cond_1f

    .line 637
    .line 638
    :cond_1e
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 639
    .line 640
    .line 641
    invoke-static {v12}, La/q3d;->h(Ljava/util/Collection;)Lkotlin/ranges/IntRange;

    .line 642
    .line 643
    .line 644
    move-result-object v1

    .line 645
    new-instance v2, La/gg4;

    .line 646
    .line 647
    const/4 v5, 0x1

    .line 648
    invoke-direct {v2, v12, v5}, La/gg4;-><init>(Ljava/util/List;B)V

    .line 649
    .line 650
    .line 651
    invoke-static {v1, v2, v14}, La/kc5;->N0(Lkotlin/ranges/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 652
    .line 653
    .line 654
    move-result-object v1

    .line 655
    move-object v2, v1

    .line 656
    check-cast v2, La/daq0;

    .line 657
    .line 658
    iget-wide v5, v2, La/daq0;->a:J

    .line 659
    .line 660
    invoke-virtual {v13, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 661
    .line 662
    .line 663
    :cond_1f
    check-cast v2, La/daq0;

    .line 664
    .line 665
    iget-wide v5, v2, La/daq0;->a:J

    .line 666
    .line 667
    const/4 v1, 0x0

    .line 668
    invoke-virtual {v13, v1}, La/fet;->r(Z)V

    .line 669
    .line 670
    .line 671
    :goto_16
    if-nez v2, :cond_34

    .line 672
    .line 673
    const v1, -0x2a4c6ec3

    .line 674
    .line 675
    .line 676
    invoke-virtual {v13, v1}, La/fet;->e0(I)V

    .line 677
    .line 678
    .line 679
    invoke-virtual/range {p3 .. p3}, La/lr8;->d()F

    .line 680
    .line 681
    .line 682
    move-result v1

    .line 683
    invoke-virtual/range {p3 .. p3}, La/lr8;->c()F

    .line 684
    .line 685
    .line 686
    move-result v2

    .line 687
    invoke-static {v1, v2}, La/qbc;->i(FF)J

    .line 688
    .line 689
    .line 690
    move-result-wide v1

    .line 691
    invoke-virtual {v13, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 692
    .line 693
    .line 694
    move-result v5

    .line 695
    iget-wide v11, v0, La/s05;->s:J

    .line 696
    .line 697
    invoke-virtual {v13, v11, v12}, La/fet;->f(J)Z

    .line 698
    .line 699
    .line 700
    move-result v6

    .line 701
    or-int/2addr v5, v6

    .line 702
    invoke-virtual {v13, v1, v2}, La/fet;->f(J)Z

    .line 703
    .line 704
    .line 705
    move-result v6

    .line 706
    or-int/2addr v5, v6

    .line 707
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 708
    .line 709
    .line 710
    move-result-object v6

    .line 711
    if-nez v5, :cond_21

    .line 712
    .line 713
    if-ne v6, v15, :cond_20

    .line 714
    .line 715
    goto :goto_17

    .line 716
    :cond_20
    move/from16 p3, v7

    .line 717
    .line 718
    goto :goto_1b

    .line 719
    :cond_21
    :goto_17
    const-wide v5, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    cmp-long v5, v1, v5

    .line 725
    .line 726
    const-wide v20, 0xffffffffL

    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    if-eqz v5, :cond_22

    .line 732
    .line 733
    invoke-static {v1, v2}, La/bdl;->b(J)F

    .line 734
    .line 735
    .line 736
    move-result v5

    .line 737
    invoke-interface {v10, v5}, La/w6k;->T(F)I

    .line 738
    .line 739
    .line 740
    move-result v5

    .line 741
    invoke-static {v1, v2}, La/bdl;->a(J)F

    .line 742
    .line 743
    .line 744
    move-result v1

    .line 745
    invoke-interface {v10, v1}, La/w6k;->T(F)I

    .line 746
    .line 747
    .line 748
    move-result v1

    .line 749
    move/from16 p3, v7

    .line 750
    .line 751
    const/16 v2, 0x20

    .line 752
    .line 753
    int-to-long v6, v5

    .line 754
    shl-long v5, v6, v2

    .line 755
    .line 756
    int-to-long v7, v1

    .line 757
    and-long v7, v7, v20

    .line 758
    .line 759
    or-long/2addr v5, v7

    .line 760
    goto :goto_18

    .line 761
    :cond_22
    move/from16 p3, v7

    .line 762
    .line 763
    const/16 v2, 0x20

    .line 764
    .line 765
    move-wide/from16 v5, v38

    .line 766
    .line 767
    :goto_18
    shr-long v1, v5, v2

    .line 768
    .line 769
    long-to-int v1, v1

    .line 770
    and-long v5, v5, v20

    .line 771
    .line 772
    long-to-int v2, v5

    .line 773
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 774
    .line 775
    .line 776
    move-result v1

    .line 777
    new-instance v2, La/daq0;

    .line 778
    .line 779
    invoke-direct {v2, v11, v12}, La/daq0;-><init>(J)V

    .line 780
    .line 781
    .line 782
    invoke-static {v11, v12}, La/daq0;->e(J)Z

    .line 783
    .line 784
    .line 785
    move-result v5

    .line 786
    if-eqz v5, :cond_23

    .line 787
    .line 788
    goto :goto_19

    .line 789
    :cond_23
    move-object/from16 v2, v16

    .line 790
    .line 791
    :goto_19
    if-eqz v2, :cond_25

    .line 792
    .line 793
    iget-wide v5, v2, La/daq0;->a:J

    .line 794
    .line 795
    and-long v7, v5, v36

    .line 796
    .line 797
    cmp-long v2, v7, v38

    .line 798
    .line 799
    if-nez v2, :cond_24

    .line 800
    .line 801
    const/4 v2, 0x0

    .line 802
    goto :goto_1a

    .line 803
    :cond_24
    invoke-interface {v10, v5, v6}, La/w6k;->B0(J)I

    .line 804
    .line 805
    .line 806
    move-result v2

    .line 807
    :goto_1a
    new-instance v5, Lkotlin/ranges/IntRange;

    .line 808
    .line 809
    const/4 v6, 0x1

    .line 810
    const/4 v7, 0x0

    .line 811
    invoke-direct {v5, v7, v1, v6}, Lkotlin/ranges/a;-><init>(III)V

    .line 812
    .line 813
    .line 814
    invoke-static {v2, v5}, La/l1e0;->e(ILkotlin/ranges/IntRange;)I

    .line 815
    .line 816
    .line 817
    move-result v1

    .line 818
    :cond_25
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 819
    .line 820
    .line 821
    move-result-object v6

    .line 822
    invoke-virtual {v13, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 823
    .line 824
    .line 825
    :goto_1b
    check-cast v6, Ljava/lang/Number;

    .line 826
    .line 827
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 828
    .line 829
    .line 830
    move-result v1

    .line 831
    invoke-virtual {v13, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 832
    .line 833
    .line 834
    move-result v2

    .line 835
    iget-wide v5, v0, La/s05;->r:J

    .line 836
    .line 837
    invoke-virtual {v13, v5, v6}, La/fet;->f(J)Z

    .line 838
    .line 839
    .line 840
    move-result v7

    .line 841
    or-int/2addr v2, v7

    .line 842
    invoke-virtual {v13, v1}, La/fet;->e(I)Z

    .line 843
    .line 844
    .line 845
    move-result v7

    .line 846
    or-int/2addr v2, v7

    .line 847
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 848
    .line 849
    .line 850
    move-result-object v7

    .line 851
    if-nez v2, :cond_26

    .line 852
    .line 853
    if-ne v7, v15, :cond_2a

    .line 854
    .line 855
    :cond_26
    new-instance v2, La/daq0;

    .line 856
    .line 857
    invoke-direct {v2, v5, v6}, La/daq0;-><init>(J)V

    .line 858
    .line 859
    .line 860
    invoke-static {v5, v6}, La/daq0;->e(J)Z

    .line 861
    .line 862
    .line 863
    move-result v5

    .line 864
    if-eqz v5, :cond_27

    .line 865
    .line 866
    goto :goto_1c

    .line 867
    :cond_27
    move-object/from16 v2, v16

    .line 868
    .line 869
    :goto_1c
    if-eqz v2, :cond_29

    .line 870
    .line 871
    iget-wide v5, v2, La/daq0;->a:J

    .line 872
    .line 873
    and-long v7, v5, v36

    .line 874
    .line 875
    cmp-long v2, v7, v38

    .line 876
    .line 877
    if-nez v2, :cond_28

    .line 878
    .line 879
    const/4 v2, 0x0

    .line 880
    goto :goto_1d

    .line 881
    :cond_28
    invoke-interface {v10, v5, v6}, La/w6k;->X(J)F

    .line 882
    .line 883
    .line 884
    move-result v2

    .line 885
    float-to-int v2, v2

    .line 886
    :goto_1d
    new-instance v5, Lkotlin/ranges/IntRange;

    .line 887
    .line 888
    const/4 v6, 0x1

    .line 889
    const/4 v7, 0x0

    .line 890
    invoke-direct {v5, v7, v1, v6}, Lkotlin/ranges/a;-><init>(III)V

    .line 891
    .line 892
    .line 893
    invoke-static {v2, v5}, La/l1e0;->e(ILkotlin/ranges/IntRange;)I

    .line 894
    .line 895
    .line 896
    move-result v2

    .line 897
    goto :goto_1e

    .line 898
    :cond_29
    const/4 v2, 0x0

    .line 899
    :goto_1e
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 900
    .line 901
    .line 902
    move-result-object v7

    .line 903
    invoke-virtual {v13, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 904
    .line 905
    .line 906
    :cond_2a
    check-cast v7, Ljava/lang/Number;

    .line 907
    .line 908
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 909
    .line 910
    .line 911
    move-result v2

    .line 912
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 913
    .line 914
    .line 915
    move-result-object v5

    .line 916
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 917
    .line 918
    .line 919
    move-result-object v6

    .line 920
    new-instance v7, La/daq0;

    .line 921
    .line 922
    iget-wide v11, v0, La/s05;->t:J

    .line 923
    .line 924
    invoke-direct {v7, v11, v12}, La/daq0;-><init>(J)V

    .line 925
    .line 926
    .line 927
    filled-new-array {v10, v5, v6, v7}, [Ljava/lang/Object;

    .line 928
    .line 929
    .line 930
    move-result-object v5

    .line 931
    invoke-static {v5}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 932
    .line 933
    .line 934
    move-result-object v5

    .line 935
    invoke-virtual {v13, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 936
    .line 937
    .line 938
    move-result v5

    .line 939
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 940
    .line 941
    .line 942
    move-result-object v6

    .line 943
    if-nez v5, :cond_2b

    .line 944
    .line 945
    if-ne v6, v15, :cond_2f

    .line 946
    .line 947
    :cond_2b
    new-instance v5, La/daq0;

    .line 948
    .line 949
    invoke-direct {v5, v11, v12}, La/daq0;-><init>(J)V

    .line 950
    .line 951
    .line 952
    invoke-static {v11, v12}, La/daq0;->e(J)Z

    .line 953
    .line 954
    .line 955
    move-result v6

    .line 956
    if-eqz v6, :cond_2c

    .line 957
    .line 958
    goto :goto_1f

    .line 959
    :cond_2c
    move-object/from16 v5, v16

    .line 960
    .line 961
    :goto_1f
    if-eqz v5, :cond_2e

    .line 962
    .line 963
    iget-wide v5, v5, La/daq0;->a:J

    .line 964
    .line 965
    and-long v7, v5, v36

    .line 966
    .line 967
    cmp-long v7, v7, v38

    .line 968
    .line 969
    if-nez v7, :cond_2d

    .line 970
    .line 971
    const/4 v5, 0x0

    .line 972
    goto :goto_20

    .line 973
    :cond_2d
    invoke-interface {v10, v5, v6}, La/w6k;->X(J)F

    .line 974
    .line 975
    .line 976
    move-result v5

    .line 977
    float-to-int v5, v5

    .line 978
    :goto_20
    sub-int v6, v1, v2

    .line 979
    .line 980
    const/4 v7, 0x1

    .line 981
    invoke-static {v5, v7, v6}, La/l1e0;->d(III)I

    .line 982
    .line 983
    .line 984
    move-result v5

    .line 985
    goto :goto_21

    .line 986
    :cond_2e
    const/4 v5, 0x1

    .line 987
    :goto_21
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 988
    .line 989
    .line 990
    move-result-object v6

    .line 991
    invoke-virtual {v13, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 992
    .line 993
    .line 994
    :cond_2f
    check-cast v6, Ljava/lang/Number;

    .line 995
    .line 996
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 997
    .line 998
    .line 999
    move-result v5

    .line 1000
    invoke-virtual {v13, v2}, La/fet;->e(I)Z

    .line 1001
    .line 1002
    .line 1003
    move-result v6

    .line 1004
    invoke-virtual {v13, v1}, La/fet;->e(I)Z

    .line 1005
    .line 1006
    .line 1007
    move-result v7

    .line 1008
    or-int/2addr v6, v7

    .line 1009
    invoke-virtual {v13, v5}, La/fet;->e(I)Z

    .line 1010
    .line 1011
    .line 1012
    move-result v7

    .line 1013
    or-int/2addr v6, v7

    .line 1014
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v7

    .line 1018
    if-nez v6, :cond_30

    .line 1019
    .line 1020
    if-ne v7, v15, :cond_31

    .line 1021
    .line 1022
    :cond_30
    new-instance v6, Lkotlin/ranges/IntRange;

    .line 1023
    .line 1024
    const/4 v7, 0x1

    .line 1025
    invoke-direct {v6, v2, v1, v7}, Lkotlin/ranges/a;-><init>(III)V

    .line 1026
    .line 1027
    .line 1028
    invoke-static {v5, v6}, La/l1e0;->m(ILkotlin/ranges/IntRange;)Lkotlin/ranges/a;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v7

    .line 1032
    invoke-virtual {v13, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1033
    .line 1034
    .line 1035
    :cond_31
    check-cast v7, Lkotlin/ranges/a;

    .line 1036
    .line 1037
    invoke-virtual {v13, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1038
    .line 1039
    .line 1040
    move-result v1

    .line 1041
    invoke-virtual {v13, v14}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1042
    .line 1043
    .line 1044
    move-result v2

    .line 1045
    or-int/2addr v1, v2

    .line 1046
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v2

    .line 1050
    if-nez v1, :cond_33

    .line 1051
    .line 1052
    if-ne v2, v15, :cond_32

    .line 1053
    .line 1054
    goto :goto_22

    .line 1055
    :cond_32
    const/4 v5, 0x0

    .line 1056
    goto :goto_23

    .line 1057
    :cond_33
    :goto_22
    new-instance v1, La/u05;

    .line 1058
    .line 1059
    const/4 v5, 0x0

    .line 1060
    invoke-direct {v1, v10, v5}, La/u05;-><init>(La/w6k;B)V

    .line 1061
    .line 1062
    .line 1063
    invoke-static {v7, v1, v14}, La/kc5;->N0(Lkotlin/ranges/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v1

    .line 1067
    move-object v2, v1

    .line 1068
    check-cast v2, La/daq0;

    .line 1069
    .line 1070
    iget-wide v6, v2, La/daq0;->a:J

    .line 1071
    .line 1072
    invoke-virtual {v13, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1073
    .line 1074
    .line 1075
    :goto_23
    check-cast v2, La/daq0;

    .line 1076
    .line 1077
    iget-wide v1, v2, La/daq0;->a:J

    .line 1078
    .line 1079
    invoke-virtual {v13, v5}, La/fet;->r(Z)V

    .line 1080
    .line 1081
    .line 1082
    goto :goto_24

    .line 1083
    :cond_34
    move/from16 p3, v7

    .line 1084
    .line 1085
    const/4 v5, 0x0

    .line 1086
    const v1, -0x6cb86b15

    .line 1087
    .line 1088
    .line 1089
    invoke-virtual {v13, v1}, La/fet;->e0(I)V

    .line 1090
    .line 1091
    .line 1092
    invoke-virtual {v13, v5}, La/fet;->r(Z)V

    .line 1093
    .line 1094
    .line 1095
    iget-wide v1, v2, La/daq0;->a:J

    .line 1096
    .line 1097
    :goto_24
    invoke-static {v5}, La/idm0;->t(I)J

    .line 1098
    .line 1099
    .line 1100
    move-result-wide v5

    .line 1101
    invoke-static {v1, v2, v5, v6}, La/daq0;->a(JJ)Z

    .line 1102
    .line 1103
    .line 1104
    move-result v5

    .line 1105
    if-eqz v5, :cond_35

    .line 1106
    .line 1107
    const-string v5, "AutoSizeText"

    .line 1108
    .line 1109
    const-string v6, "The text cannot be displayed. Please consider the following options:\n  1. Providing \'suggestedFontSizes\' with smaller values that can be utilized.\n  2. Decreasing the \'stepGranularityTextSize\' value.\n  3. Adjusting the \'minTextSize\' parameter to a suitable value and ensuring the overflow parameter is set to \"TextOverflow.Ellipsis\"."

    .line 1110
    .line 1111
    invoke-static {v5, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1112
    .line 1113
    .line 1114
    :cond_35
    if-eqz v19, :cond_36

    .line 1115
    .line 1116
    iget-object v5, v4, La/y9q0;->b:La/eo80;

    .line 1117
    .line 1118
    iget-wide v5, v5, La/eo80;->c:J

    .line 1119
    .line 1120
    :goto_25
    move-wide/from16 v31, v5

    .line 1121
    .line 1122
    goto :goto_26

    .line 1123
    :cond_36
    invoke-static {v1, v2}, La/idm0;->m(J)V

    .line 1124
    .line 1125
    .line 1126
    and-long v5, v1, v36

    .line 1127
    .line 1128
    invoke-static {v1, v2}, La/daq0;->c(J)F

    .line 1129
    .line 1130
    .line 1131
    move-result v7

    .line 1132
    mul-float v7, v7, v18

    .line 1133
    .line 1134
    invoke-static {v7, v5, v6}, La/idm0;->v(FJ)J

    .line 1135
    .line 1136
    .line 1137
    move-result-wide v5

    .line 1138
    goto :goto_25

    .line 1139
    :goto_26
    const/16 v34, 0x0

    .line 1140
    .line 1141
    const v35, 0xfdfffd

    .line 1142
    .line 1143
    .line 1144
    const-wide/16 v18, 0x0

    .line 1145
    .line 1146
    const/16 v22, 0x0

    .line 1147
    .line 1148
    const/16 v23, 0x0

    .line 1149
    .line 1150
    const/16 v24, 0x0

    .line 1151
    .line 1152
    const-wide/16 v25, 0x0

    .line 1153
    .line 1154
    const/16 v27, 0x0

    .line 1155
    .line 1156
    const/16 v28, 0x0

    .line 1157
    .line 1158
    const/16 v29, 0x0

    .line 1159
    .line 1160
    const/16 v30, 0x0

    .line 1161
    .line 1162
    const/16 v33, 0x0

    .line 1163
    .line 1164
    move-wide/from16 v20, v1

    .line 1165
    .line 1166
    move-object/from16 v17, v4

    .line 1167
    .line 1168
    invoke-static/range {v17 .. v35}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v22

    .line 1172
    const/16 v25, 0x0

    .line 1173
    .line 1174
    const/16 v26, 0xffe

    .line 1175
    .line 1176
    const-wide/16 v5, 0x0

    .line 1177
    .line 1178
    const/4 v7, 0x0

    .line 1179
    move/from16 v17, v9

    .line 1180
    .line 1181
    const-wide/16 v8, 0x0

    .line 1182
    .line 1183
    const/4 v10, 0x0

    .line 1184
    const-wide/16 v11, 0x0

    .line 1185
    .line 1186
    move-object/from16 v23, v13

    .line 1187
    .line 1188
    const/4 v13, 0x0

    .line 1189
    const-wide/16 v14, 0x0

    .line 1190
    .line 1191
    iget-byte v1, v0, La/s05;->n:B

    .line 1192
    .line 1193
    iget-boolean v2, v0, La/s05;->o:Z

    .line 1194
    .line 1195
    iget-object v4, v0, La/s05;->p:Ljava/util/Map;

    .line 1196
    .line 1197
    iget-object v0, v0, La/s05;->q:Lkotlin/jvm/functions/Function1;

    .line 1198
    .line 1199
    const/16 v24, 0x0

    .line 1200
    .line 1201
    move/from16 v18, p3

    .line 1202
    .line 1203
    move-object/from16 v21, v0

    .line 1204
    .line 1205
    move/from16 v16, v1

    .line 1206
    .line 1207
    move/from16 v19, v2

    .line 1208
    .line 1209
    move-object/from16 v20, v4

    .line 1210
    .line 1211
    const/4 v4, 0x0

    .line 1212
    invoke-static/range {v3 .. v26}, La/v8q0;->b(La/j83;La/mm40;JLa/n05;JLa/nrq;JLa/f2q0;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 1213
    .line 1214
    .line 1215
    goto :goto_27

    .line 1216
    :cond_37
    move-object/from16 v23, v13

    .line 1217
    .line 1218
    invoke-virtual/range {v23 .. v23}, La/fet;->X()V

    .line 1219
    .line 1220
    .line 1221
    :goto_27
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1222
    .line 1223
    return-object v0
.end method
