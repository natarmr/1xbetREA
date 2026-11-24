.class public final synthetic La/vta;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/mch0;La/w03;La/w03;La/w03;Ljava/util/ArrayList;F)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/vta;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/vta;->c:Ljava/lang/Object;

    iput-object p2, p0, La/vta;->d:Ljava/lang/Object;

    iput-object p3, p0, La/vta;->e:Ljava/lang/Object;

    iput-object p4, p0, La/vta;->f:Ljava/lang/Object;

    iput-object p5, p0, La/vta;->g:Ljava/lang/Object;

    iput p6, p0, La/vta;->b:F

    return-void
.end method

.method public synthetic constructor <init>(La/pz40;La/omv;FLa/pz40;La/pz40;La/pz40;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/vta;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/vta;->c:Ljava/lang/Object;

    iput-object p2, p0, La/vta;->g:Ljava/lang/Object;

    iput p3, p0, La/vta;->b:F

    iput-object p4, p0, La/vta;->d:Ljava/lang/Object;

    iput-object p5, p0, La/vta;->e:Ljava/lang/Object;

    iput-object p6, p0, La/vta;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/vta;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/vta;->g:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, v0, La/vta;->f:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, La/vta;->e:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, La/vta;->d:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v6, v0, La/vta;->c:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v6, La/mch0;

    .line 19
    .line 20
    move-object v8, v5

    .line 21
    check-cast v8, La/w03;

    .line 22
    .line 23
    check-cast v4, La/w03;

    .line 24
    .line 25
    check-cast v3, La/w03;

    .line 26
    .line 27
    check-cast v2, Ljava/util/ArrayList;

    .line 28
    .line 29
    move-object/from16 v9, p1

    .line 30
    .line 31
    check-cast v9, La/fhl;

    .line 32
    .line 33
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    sget-object v1, La/qmk;->a:La/zcl;

    .line 37
    .line 38
    const/high16 v1, 0x40800000    # 4.0f

    .line 39
    .line 40
    invoke-interface {v9, v1}, La/w6k;->w0(F)F

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    const/high16 v5, 0x3f800000    # 1.0f

    .line 45
    .line 46
    invoke-interface {v9, v5}, La/w6k;->w0(F)F

    .line 47
    .line 48
    .line 49
    move-result v16

    .line 50
    const/high16 v7, 0x41e00000    # 28.0f

    .line 51
    .line 52
    invoke-interface {v9, v7}, La/w6k;->w0(F)F

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    sub-float v7, v7, v16

    .line 57
    .line 58
    const/16 v20, 0x0

    .line 59
    .line 60
    move/from16 v10, v20

    .line 61
    .line 62
    :goto_0
    const-wide v17, 0xffffffffL

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    const/16 v19, 0x20

    .line 68
    .line 69
    const/16 v11, 0x9

    .line 70
    .line 71
    if-ge v10, v11, :cond_1

    .line 72
    .line 73
    const/4 v11, 0x4

    .line 74
    if-eq v10, v11, :cond_0

    .line 75
    .line 76
    int-to-float v11, v10

    .line 77
    mul-float/2addr v11, v7

    .line 78
    add-float/2addr v11, v1

    .line 79
    sget-object v12, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 80
    .line 81
    invoke-virtual {v12}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite10-0d7_KjU()J

    .line 82
    .line 83
    .line 84
    move-result-wide v12

    .line 85
    const/4 v15, 0x0

    .line 86
    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    int-to-long v14, v5

    .line 91
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    move/from16 v24, v1

    .line 96
    .line 97
    move-object/from16 v23, v2

    .line 98
    .line 99
    int-to-long v1, v5

    .line 100
    shl-long v14, v14, v19

    .line 101
    .line 102
    and-long v1, v1, v17

    .line 103
    .line 104
    or-long/2addr v1, v14

    .line 105
    invoke-interface {v9}, La/fhl;->d()J

    .line 106
    .line 107
    .line 108
    move-result-wide v14

    .line 109
    shr-long v14, v14, v19

    .line 110
    .line 111
    long-to-int v5, v14

    .line 112
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    int-to-long v14, v5

    .line 121
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    move-wide/from16 v25, v1

    .line 126
    .line 127
    int-to-long v1, v5

    .line 128
    shl-long v14, v14, v19

    .line 129
    .line 130
    and-long v1, v1, v17

    .line 131
    .line 132
    or-long/2addr v14, v1

    .line 133
    const/4 v1, 0x2

    .line 134
    new-array v1, v1, [F

    .line 135
    .line 136
    fill-array-data v1, :array_0

    .line 137
    .line 138
    .line 139
    const/4 v2, 0x0

    .line 140
    invoke-static {v2, v1}, La/qjj;->K(F[F)La/x03;

    .line 141
    .line 142
    .line 143
    move-result-object v18

    .line 144
    const/16 v19, 0x1d0

    .line 145
    .line 146
    const/16 v17, 0x0

    .line 147
    .line 148
    move v1, v10

    .line 149
    move-wide v10, v12

    .line 150
    move-wide/from16 v12, v25

    .line 151
    .line 152
    invoke-static/range {v9 .. v19}, La/fhl;->Q(La/fhl;JJJFILa/x03;I)V

    .line 153
    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_0
    move/from16 v24, v1

    .line 157
    .line 158
    move-object/from16 v23, v2

    .line 159
    .line 160
    move v1, v10

    .line 161
    :goto_1
    add-int/lit8 v10, v1, 0x1

    .line 162
    .line 163
    move-object/from16 v2, v23

    .line 164
    .line 165
    move/from16 v1, v24

    .line 166
    .line 167
    const/high16 v5, 0x3f800000    # 1.0f

    .line 168
    .line 169
    goto :goto_0

    .line 170
    :cond_1
    move-object/from16 v23, v2

    .line 171
    .line 172
    const/4 v1, 0x2

    .line 173
    iget-object v2, v6, La/mch0;->c:La/lch0;

    .line 174
    .line 175
    iget-wide v10, v2, La/lch0;->c:J

    .line 176
    .line 177
    iget-object v2, v6, La/mch0;->d:La/lch0;

    .line 178
    .line 179
    iget-wide v5, v2, La/lch0;->c:J

    .line 180
    .line 181
    invoke-interface {v9}, La/fhl;->d()J

    .line 182
    .line 183
    .line 184
    move-result-wide v12

    .line 185
    shr-long v12, v12, v19

    .line 186
    .line 187
    long-to-int v2, v12

    .line 188
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 189
    .line 190
    .line 191
    move-result v27

    .line 192
    invoke-interface {v9}, La/fhl;->d()J

    .line 193
    .line 194
    .line 195
    move-result-wide v12

    .line 196
    and-long v12, v12, v17

    .line 197
    .line 198
    long-to-int v2, v12

    .line 199
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 200
    .line 201
    .line 202
    move-result v2

    .line 203
    const/high16 v16, 0x40000000    # 2.0f

    .line 204
    .line 205
    div-float v28, v2, v16

    .line 206
    .line 207
    invoke-interface {v9}, La/fhl;->A0()La/nr;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    invoke-virtual {v2}, La/nr;->p()J

    .line 212
    .line 213
    .line 214
    move-result-wide v14

    .line 215
    invoke-virtual {v2}, La/nr;->i()La/x5a;

    .line 216
    .line 217
    .line 218
    move-result-object v7

    .line 219
    invoke-interface {v7}, La/x5a;->l()V

    .line 220
    .line 221
    .line 222
    :try_start_0
    iget-object v7, v2, La/nr;->b:Ljava/lang/Object;

    .line 223
    .line 224
    move-object/from16 v24, v7

    .line 225
    .line 226
    check-cast v24, La/fvt0;

    .line 227
    .line 228
    const/16 v25, 0x0

    .line 229
    .line 230
    const/16 v26, 0x0

    .line 231
    .line 232
    const/16 v29, 0x1

    .line 233
    .line 234
    invoke-virtual/range {v24 .. v29}, La/fvt0;->k(FFFFI)V

    .line 235
    .line 236
    .line 237
    new-instance v30, La/vtm0;

    .line 238
    .line 239
    sget-object v7, La/qmk;->a:La/zcl;

    .line 240
    .line 241
    const/high16 v7, 0x3f800000    # 1.0f

    .line 242
    .line 243
    invoke-interface {v9, v7}, La/w6k;->w0(F)F

    .line 244
    .line 245
    .line 246
    move-result v31

    .line 247
    const/16 v35, 0x0

    .line 248
    .line 249
    const/16 v36, 0x1e

    .line 250
    .line 251
    const/16 v32, 0x0

    .line 252
    .line 253
    const/16 v33, 0x0

    .line 254
    .line 255
    const/16 v34, 0x0

    .line 256
    .line 257
    invoke-direct/range {v30 .. v36}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 258
    .line 259
    .line 260
    const/16 v13, 0x34

    .line 261
    .line 262
    move-object v7, v9

    .line 263
    move-wide v9, v10

    .line 264
    const/4 v11, 0x0

    .line 265
    move-object/from16 v12, v30

    .line 266
    .line 267
    invoke-static/range {v7 .. v13}, La/fhl;->C0(La/fhl;La/w03;JFLa/agc;I)V

    .line 268
    .line 269
    .line 270
    move-wide v10, v9

    .line 271
    move-object v9, v7

    .line 272
    const/high16 v7, 0x3f000000    # 0.5f

    .line 273
    .line 274
    invoke-static {v7, v10, v11}, La/y3d;->c(FJ)J

    .line 275
    .line 276
    .line 277
    move-result-wide v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 278
    move-wide/from16 v21, v14

    .line 279
    .line 280
    const/4 v14, 0x0

    .line 281
    const/16 v15, 0x3c

    .line 282
    .line 283
    const/4 v13, 0x0

    .line 284
    move-object v10, v4

    .line 285
    move-object/from16 v24, v8

    .line 286
    .line 287
    move-wide/from16 v7, v21

    .line 288
    .line 289
    :try_start_1
    invoke-static/range {v9 .. v15}, La/fhl;->C0(La/fhl;La/w03;JFLa/agc;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 290
    .line 291
    .line 292
    invoke-virtual {v2}, La/nr;->i()La/x5a;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    invoke-interface {v4}, La/x5a;->i()V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v2, v7, v8}, La/nr;->H(J)V

    .line 300
    .line 301
    .line 302
    invoke-interface {v9}, La/fhl;->d()J

    .line 303
    .line 304
    .line 305
    move-result-wide v7

    .line 306
    and-long v7, v7, v17

    .line 307
    .line 308
    long-to-int v2, v7

    .line 309
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 310
    .line 311
    .line 312
    move-result v2

    .line 313
    div-float v12, v2, v16

    .line 314
    .line 315
    invoke-interface {v9}, La/fhl;->d()J

    .line 316
    .line 317
    .line 318
    move-result-wide v7

    .line 319
    shr-long v7, v7, v19

    .line 320
    .line 321
    long-to-int v2, v7

    .line 322
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 323
    .line 324
    .line 325
    move-result v13

    .line 326
    invoke-interface {v9}, La/fhl;->d()J

    .line 327
    .line 328
    .line 329
    move-result-wide v7

    .line 330
    and-long v7, v7, v17

    .line 331
    .line 332
    long-to-int v2, v7

    .line 333
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 334
    .line 335
    .line 336
    move-result v14

    .line 337
    invoke-interface {v9}, La/fhl;->A0()La/nr;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    invoke-virtual {v2}, La/nr;->p()J

    .line 342
    .line 343
    .line 344
    move-result-wide v7

    .line 345
    invoke-virtual {v2}, La/nr;->i()La/x5a;

    .line 346
    .line 347
    .line 348
    move-result-object v4

    .line 349
    invoke-interface {v4}, La/x5a;->l()V

    .line 350
    .line 351
    .line 352
    :try_start_2
    iget-object v4, v2, La/nr;->b:Ljava/lang/Object;

    .line 353
    .line 354
    move-object v10, v4

    .line 355
    check-cast v10, La/fvt0;

    .line 356
    .line 357
    const/4 v11, 0x0

    .line 358
    const/4 v15, 0x1

    .line 359
    invoke-virtual/range {v10 .. v15}, La/fvt0;->k(FFFFI)V

    .line 360
    .line 361
    .line 362
    new-instance v26, La/vtm0;

    .line 363
    .line 364
    const/high16 v4, 0x3f800000    # 1.0f

    .line 365
    .line 366
    invoke-interface {v9, v4}, La/w6k;->w0(F)F

    .line 367
    .line 368
    .line 369
    move-result v27

    .line 370
    const/16 v31, 0x0

    .line 371
    .line 372
    const/16 v32, 0x1e

    .line 373
    .line 374
    const/16 v28, 0x0

    .line 375
    .line 376
    const/16 v29, 0x0

    .line 377
    .line 378
    const/16 v30, 0x0

    .line 379
    .line 380
    invoke-direct/range {v26 .. v32}, La/vtm0;-><init>(FFIILa/x03;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 381
    .line 382
    .line 383
    const/16 v13, 0x34

    .line 384
    .line 385
    const/4 v11, 0x0

    .line 386
    move-wide/from16 v37, v7

    .line 387
    .line 388
    move-object v7, v9

    .line 389
    move-wide v9, v5

    .line 390
    move-wide/from16 v4, v37

    .line 391
    .line 392
    move-object/from16 v8, v24

    .line 393
    .line 394
    move-object/from16 v12, v26

    .line 395
    .line 396
    const/high16 v6, 0x3f000000    # 0.5f

    .line 397
    .line 398
    :try_start_3
    invoke-static/range {v7 .. v13}, La/fhl;->C0(La/fhl;La/w03;JFLa/agc;I)V

    .line 399
    .line 400
    .line 401
    move-wide/from16 v37, v9

    .line 402
    .line 403
    move-object v9, v7

    .line 404
    move-wide/from16 v7, v37

    .line 405
    .line 406
    invoke-static {v6, v7, v8}, La/y3d;->c(FJ)J

    .line 407
    .line 408
    .line 409
    move-result-wide v11

    .line 410
    const/4 v14, 0x0

    .line 411
    const/16 v15, 0x3c

    .line 412
    .line 413
    const/4 v13, 0x0

    .line 414
    move-object v10, v3

    .line 415
    invoke-static/range {v9 .. v15}, La/fhl;->C0(La/fhl;La/w03;JFLa/agc;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 416
    .line 417
    .line 418
    invoke-virtual {v2}, La/nr;->i()La/x5a;

    .line 419
    .line 420
    .line 421
    move-result-object v3

    .line 422
    invoke-interface {v3}, La/x5a;->i()V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v2, v4, v5}, La/nr;->H(J)V

    .line 426
    .line 427
    .line 428
    const/high16 v2, 0x40c00000    # 6.0f

    .line 429
    .line 430
    invoke-interface {v9, v2}, La/w6k;->w0(F)F

    .line 431
    .line 432
    .line 433
    move-result v2

    .line 434
    invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 435
    .line 436
    .line 437
    move-result-object v3

    .line 438
    :goto_2
    move/from16 v4, v20

    .line 439
    .line 440
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 441
    .line 442
    .line 443
    move-result v5

    .line 444
    if-eqz v5, :cond_3

    .line 445
    .line 446
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v5

    .line 450
    add-int/lit8 v20, v4, 0x1

    .line 451
    .line 452
    if-ltz v4, :cond_2

    .line 453
    .line 454
    move-object v10, v5

    .line 455
    check-cast v10, La/a9q0;

    .line 456
    .line 457
    int-to-float v4, v4

    .line 458
    iget v5, v0, La/vta;->b:F

    .line 459
    .line 460
    invoke-interface {v9, v5}, La/w6k;->w0(F)F

    .line 461
    .line 462
    .line 463
    move-result v5

    .line 464
    mul-float/2addr v5, v4

    .line 465
    iget-wide v6, v10, La/a9q0;->c:J

    .line 466
    .line 467
    shr-long v6, v6, v19

    .line 468
    .line 469
    long-to-int v4, v6

    .line 470
    div-int/2addr v4, v1

    .line 471
    int-to-float v4, v4

    .line 472
    sub-float/2addr v5, v4

    .line 473
    sget-object v4, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 474
    .line 475
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite60-0d7_KjU()J

    .line 476
    .line 477
    .line 478
    move-result-wide v11

    .line 479
    invoke-interface {v9}, La/fhl;->d()J

    .line 480
    .line 481
    .line 482
    move-result-wide v6

    .line 483
    and-long v6, v6, v17

    .line 484
    .line 485
    long-to-int v4, v6

    .line 486
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 487
    .line 488
    .line 489
    move-result v4

    .line 490
    add-float/2addr v4, v2

    .line 491
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 492
    .line 493
    .line 494
    move-result v5

    .line 495
    int-to-long v5, v5

    .line 496
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 497
    .line 498
    .line 499
    move-result v4

    .line 500
    int-to-long v7, v4

    .line 501
    shl-long v4, v5, v19

    .line 502
    .line 503
    and-long v6, v7, v17

    .line 504
    .line 505
    or-long v13, v4, v6

    .line 506
    .line 507
    const/16 v15, 0xf8

    .line 508
    .line 509
    invoke-static/range {v9 .. v15}, La/v2n0;->o(La/fhl;La/a9q0;JJI)V

    .line 510
    .line 511
    .line 512
    goto :goto_2

    .line 513
    :cond_2
    invoke-static {}, La/q3d;->p()V

    .line 514
    .line 515
    .line 516
    const/4 v0, 0x0

    .line 517
    throw v0

    .line 518
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 519
    .line 520
    return-object v0

    .line 521
    :catchall_0
    move-exception v0

    .line 522
    goto :goto_3

    .line 523
    :catchall_1
    move-exception v0

    .line 524
    move-wide v4, v7

    .line 525
    :goto_3
    invoke-static {v2, v4, v5}, Lc;->g(La/nr;J)V

    .line 526
    .line 527
    .line 528
    throw v0

    .line 529
    :catchall_2
    move-exception v0

    .line 530
    goto :goto_4

    .line 531
    :catchall_3
    move-exception v0

    .line 532
    move-wide v7, v14

    .line 533
    :goto_4
    invoke-static {v2, v7, v8}, Lc;->g(La/nr;J)V

    .line 534
    .line 535
    .line 536
    throw v0

    .line 537
    :pswitch_0
    move-object/from16 v16, v6

    .line 538
    .line 539
    check-cast v16, La/pz40;

    .line 540
    .line 541
    move-object v11, v2

    .line 542
    check-cast v11, La/omv;

    .line 543
    .line 544
    move-object v13, v5

    .line 545
    check-cast v13, La/pz40;

    .line 546
    .line 547
    move-object v14, v4

    .line 548
    check-cast v14, La/pz40;

    .line 549
    .line 550
    move-object v15, v3

    .line 551
    check-cast v15, La/pz40;

    .line 552
    .line 553
    move-object/from16 v1, p1

    .line 554
    .line 555
    check-cast v1, La/hcz;

    .line 556
    .line 557
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 558
    .line 559
    .line 560
    invoke-interface/range {v16 .. v16}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v2

    .line 564
    move-object v10, v2

    .line 565
    check-cast v10, La/a4x;

    .line 566
    .line 567
    new-instance v2, La/im8;

    .line 568
    .line 569
    const/16 v3, 0x1d

    .line 570
    .line 571
    invoke-direct {v2, v3}, La/im8;-><init>(B)V

    .line 572
    .line 573
    .line 574
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 575
    .line 576
    .line 577
    move-result v3

    .line 578
    new-instance v4, La/at7;

    .line 579
    .line 580
    const/16 v5, 0xc

    .line 581
    .line 582
    invoke-direct {v4, v2, v10, v5}, La/at7;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 583
    .line 584
    .line 585
    new-instance v2, La/wl0;

    .line 586
    .line 587
    const/16 v5, 0xb

    .line 588
    .line 589
    invoke-direct {v2, v10, v5}, La/wl0;-><init>(La/a4x;B)V

    .line 590
    .line 591
    .line 592
    new-instance v9, La/yta;

    .line 593
    .line 594
    iget v12, v0, La/vta;->b:F

    .line 595
    .line 596
    invoke-direct/range {v9 .. v16}, La/yta;-><init>(La/a4x;La/omv;FLa/pz40;La/pz40;La/pz40;La/pz40;)V

    .line 597
    .line 598
    .line 599
    new-instance v0, La/ugd;

    .line 600
    .line 601
    const v5, 0x799532c4

    .line 602
    .line 603
    .line 604
    const/4 v6, 0x1

    .line 605
    invoke-direct {v0, v5, v6, v9}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 606
    .line 607
    .line 608
    invoke-virtual {v1, v3, v4, v2, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 609
    .line 610
    .line 611
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 612
    .line 613
    return-object v0

    .line 614
    nop

    .line 615
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    :array_0
    .array-data 4
        0x41600000    # 14.0f
        0x41000000    # 8.0f
    .end array-data
.end method
