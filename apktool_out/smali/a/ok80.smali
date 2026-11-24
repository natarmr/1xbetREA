.class public final La/ok80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ibz;


# instance fields
.field public final synthetic a:La/xk80;

.field public final synthetic b:La/hh80;

.field public final synthetic c:F

.field public final synthetic d:La/yi80;

.field public final synthetic e:Lkotlin/jvm/functions/Function0;

.field public final synthetic f:Lkotlin/jvm/functions/Function0;

.field public final synthetic g:La/yx7;

.field public final synthetic h:I

.field public final synthetic i:La/ifk0;

.field public final synthetic j:La/vne;


# direct methods
.method public constructor <init>(La/xk80;La/hh80;FLa/yi80;La/eiy;Lkotlin/jvm/functions/Function0;La/yx7;ILa/ifk0;La/vne;)V
    .locals 1

    .line 1
    sget-object v0, La/ma80;->a:La/ma80;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, La/ok80;->a:La/xk80;

    .line 7
    .line 8
    iput-object p2, p0, La/ok80;->b:La/hh80;

    .line 9
    .line 10
    iput p3, p0, La/ok80;->c:F

    .line 11
    .line 12
    iput-object p4, p0, La/ok80;->d:La/yi80;

    .line 13
    .line 14
    iput-object p5, p0, La/ok80;->e:Lkotlin/jvm/functions/Function0;

    .line 15
    .line 16
    iput-object p6, p0, La/ok80;->f:Lkotlin/jvm/functions/Function0;

    .line 17
    .line 18
    iput-object p7, p0, La/ok80;->g:La/yx7;

    .line 19
    .line 20
    iput p8, p0, La/ok80;->h:I

    .line 21
    .line 22
    iput-object p9, p0, La/ok80;->i:La/ifk0;

    .line 23
    .line 24
    iput-object p10, p0, La/ok80;->j:La/vne;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a(La/jbz;J)La/uj30;
    .locals 53

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v12, p2

    .line 6
    .line 7
    iget-object v14, v0, La/ok80;->a:La/xk80;

    .line 8
    .line 9
    iget-object v2, v14, La/xk80;->C:La/pz40;

    .line 10
    .line 11
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    sget-object v15, La/ma80;->b:La/ma80;

    .line 15
    .line 16
    sget-object v2, La/ma80;->a:La/ma80;

    .line 17
    .line 18
    invoke-static {v12, v13, v15}, La/d5c;->H(JLa/ma80;)V

    .line 19
    .line 20
    .line 21
    iget-object v2, v1, La/jbz;->b:La/c5n0;

    .line 22
    .line 23
    invoke-interface {v2}, La/cnx;->getLayoutDirection()La/k6z;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iget-object v4, v0, La/ok80;->b:La/hh80;

    .line 28
    .line 29
    invoke-static {v4, v3}, La/s5x0;->B(La/hh80;La/k6z;)F

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    invoke-interface {v2, v3}, La/w6k;->T(F)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-interface {v2}, La/cnx;->getLayoutDirection()La/k6z;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    invoke-static {v4, v5}, La/s5x0;->A(La/hh80;La/k6z;)F

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    invoke-interface {v2, v5}, La/w6k;->T(F)I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    invoke-interface {v4}, La/hh80;->d()F

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    invoke-interface {v2, v6}, La/w6k;->T(F)I

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    invoke-interface {v4}, La/hh80;->a()F

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    invoke-interface {v2, v4}, La/w6k;->T(F)I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    add-int/2addr v4, v6

    .line 66
    add-int/2addr v5, v3

    .line 67
    sub-int v7, v5, v3

    .line 68
    .line 69
    neg-int v8, v5

    .line 70
    neg-int v9, v4

    .line 71
    invoke-static {v8, v9, v12, v13}, La/r4e;->i(IIJ)J

    .line 72
    .line 73
    .line 74
    move-result-wide v8

    .line 75
    iput-object v1, v14, La/xk80;->n:La/w6k;

    .line 76
    .line 77
    iget v10, v0, La/ok80;->c:F

    .line 78
    .line 79
    invoke-interface {v2, v10}, La/w6k;->T(F)I

    .line 80
    .line 81
    .line 82
    move-result v10

    .line 83
    invoke-static {v12, v13}, La/p4e;->i(J)I

    .line 84
    .line 85
    .line 86
    move-result v11

    .line 87
    sub-int/2addr v11, v5

    .line 88
    move/from16 v16, v4

    .line 89
    .line 90
    move/from16 v17, v5

    .line 91
    .line 92
    int-to-long v4, v3

    .line 93
    const/16 v18, 0x20

    .line 94
    .line 95
    shl-long v4, v4, v18

    .line 96
    .line 97
    move-wide/from16 v18, v4

    .line 98
    .line 99
    int-to-long v4, v6

    .line 100
    const-wide v20, 0xffffffffL

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    and-long v4, v4, v20

    .line 106
    .line 107
    or-long v5, v18, v4

    .line 108
    .line 109
    iget-object v4, v0, La/ok80;->d:La/yi80;

    .line 110
    .line 111
    invoke-interface {v4, v1, v11}, La/yi80;->a(La/w6k;I)I

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    move-object/from16 v18, v15

    .line 116
    .line 117
    const/4 v15, 0x0

    .line 118
    if-gez v4, :cond_0

    .line 119
    .line 120
    move v4, v15

    .line 121
    :cond_0
    invoke-static {v8, v9}, La/p4e;->h(J)I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    move-wide/from16 v19, v5

    .line 126
    .line 127
    const/4 v5, 0x5

    .line 128
    invoke-static {v15, v4, v15, v1, v5}, La/r4e;->b(IIIII)J

    .line 129
    .line 130
    .line 131
    iget-object v1, v0, La/ok80;->e:Lkotlin/jvm/functions/Function0;

    .line 132
    .line 133
    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    check-cast v1, La/kk80;

    .line 138
    .line 139
    add-int v6, v11, v3

    .line 140
    .line 141
    add-int/2addr v6, v7

    .line 142
    iget-object v5, v0, La/ok80;->i:La/ifk0;

    .line 143
    .line 144
    invoke-static {}, La/vdx;->J()La/rfk0;

    .line 145
    .line 146
    .line 147
    move-result-object v15

    .line 148
    move-wide/from16 v23, v8

    .line 149
    .line 150
    if-eqz v15, :cond_1

    .line 151
    .line 152
    invoke-virtual {v15}, La/rfk0;->e()Lkotlin/jvm/functions/Function1;

    .line 153
    .line 154
    .line 155
    move-result-object v9

    .line 156
    goto :goto_0

    .line 157
    :cond_1
    const/4 v9, 0x0

    .line 158
    :goto_0
    invoke-static {v15}, La/vdx;->W(La/rfk0;)La/rfk0;

    .line 159
    .line 160
    .line 161
    move-result-object v8

    .line 162
    move/from16 v26, v10

    .line 163
    .line 164
    :try_start_0
    invoke-virtual {v14}, La/xk80;->k()I

    .line 165
    .line 166
    .line 167
    move-result v10

    .line 168
    move/from16 v27, v11

    .line 169
    .line 170
    iget-object v11, v14, La/xk80;->d:La/qaj;

    .line 171
    .line 172
    move-object/from16 v28, v2

    .line 173
    .line 174
    iget-object v2, v11, La/qaj;->b:Ljava/lang/Object;

    .line 175
    .line 176
    invoke-static {v10, v1, v2}, La/k9x;->J(ILa/hbz;Ljava/lang/Object;)I

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    if-eq v10, v2, :cond_2

    .line 181
    .line 182
    iget-object v12, v11, La/qaj;->d:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v12, La/cgk0;

    .line 185
    .line 186
    invoke-virtual {v12, v2}, La/cgk0;->m(I)V

    .line 187
    .line 188
    .line 189
    iget-object v11, v11, La/qaj;->f:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v11, La/lbz;

    .line 192
    .line 193
    invoke-virtual {v11, v10}, La/lbz;->b(I)V

    .line 194
    .line 195
    .line 196
    :cond_2
    invoke-virtual {v14}, La/xk80;->k()I

    .line 197
    .line 198
    .line 199
    invoke-virtual {v14}, La/xk80;->l()F

    .line 200
    .line 201
    .line 202
    move-result v10

    .line 203
    invoke-virtual {v14}, La/xk80;->n()I

    .line 204
    .line 205
    .line 206
    invoke-interface {v5, v6, v4, v3, v7}, La/ifk0;->a(IIII)I

    .line 207
    .line 208
    .line 209
    move-result v5

    .line 210
    int-to-float v5, v5

    .line 211
    add-int v12, v4, v26

    .line 212
    .line 213
    int-to-float v11, v12

    .line 214
    mul-float/2addr v10, v11

    .line 215
    sub-float/2addr v5, v10

    .line 216
    invoke-static {v5}, La/si30;->b(F)I

    .line 217
    .line 218
    .line 219
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 220
    invoke-static {v15, v8, v9}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 221
    .line 222
    .line 223
    iget-object v8, v14, La/xk80;->A:La/qbz;

    .line 224
    .line 225
    iget-object v9, v14, La/xk80;->w:La/hru;

    .line 226
    .line 227
    invoke-static {v1, v8, v9}, La/c9x;->t(La/hbz;La/qbz;La/hru;)Landroidx/collection/MutableIntList;

    .line 228
    .line 229
    .line 230
    move-result-object v13

    .line 231
    sget-object v8, La/hkx;->a:La/ey40;

    .line 232
    .line 233
    new-instance v10, La/ey40;

    .line 234
    .line 235
    invoke-direct {v10}, La/ey40;-><init>()V

    .line 236
    .line 237
    .line 238
    iget-object v8, v0, La/ok80;->f:Lkotlin/jvm/functions/Function0;

    .line 239
    .line 240
    invoke-interface {v8}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v8

    .line 244
    check-cast v8, Ljava/lang/Number;

    .line 245
    .line 246
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 247
    .line 248
    .line 249
    move-result v15

    .line 250
    iget-object v8, v14, La/xk80;->B:La/pz40;

    .line 251
    .line 252
    if-ltz v3, :cond_3

    .line 253
    .line 254
    goto :goto_1

    .line 255
    :cond_3
    const-string v9, "negative beforeContentPadding"

    .line 256
    .line 257
    invoke-static {v9}, La/adx;->a(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    :goto_1
    if-ltz v7, :cond_4

    .line 261
    .line 262
    goto :goto_2

    .line 263
    :cond_4
    const-string v9, "negative afterContentPadding"

    .line 264
    .line 265
    invoke-static {v9}, La/adx;->a(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    :goto_2
    if-gez v12, :cond_5

    .line 269
    .line 270
    const/4 v9, 0x0

    .line 271
    goto :goto_3

    .line 272
    :cond_5
    move v9, v12

    .line 273
    :goto_3
    iget v11, v0, La/ok80;->h:I

    .line 274
    .line 275
    if-le v11, v15, :cond_6

    .line 276
    .line 277
    move v11, v15

    .line 278
    :cond_6
    move-object/from16 v29, v1

    .line 279
    .line 280
    invoke-static/range {v23 .. v24}, La/p4e;->h(J)I

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    move/from16 v30, v2

    .line 285
    .line 286
    move/from16 v21, v5

    .line 287
    .line 288
    const/4 v2, 0x5

    .line 289
    const/4 v5, 0x0

    .line 290
    invoke-static {v5, v4, v5, v1, v2}, La/r4e;->b(IIIII)J

    .line 291
    .line 292
    .line 293
    move-result-wide v31

    .line 294
    const/4 v5, 0x1

    .line 295
    move-object v1, v8

    .line 296
    iget-object v8, v0, La/ok80;->i:La/ifk0;

    .line 297
    .line 298
    move/from16 v33, v2

    .line 299
    .line 300
    move v2, v4

    .line 301
    move v4, v7

    .line 302
    move v7, v11

    .line 303
    move-object v11, v10

    .line 304
    iget-object v10, v0, La/ok80;->j:La/vne;

    .line 305
    .line 306
    if-gtz v15, :cond_7

    .line 307
    .line 308
    sget-object v1, La/iun;->a:La/iun;

    .line 309
    .line 310
    move v0, v5

    .line 311
    neg-int v5, v3

    .line 312
    add-int v6, v27, v4

    .line 313
    .line 314
    invoke-static/range {v23 .. v24}, La/p4e;->k(J)I

    .line 315
    .line 316
    .line 317
    move-result v3

    .line 318
    invoke-static/range {v23 .. v24}, La/p4e;->j(J)I

    .line 319
    .line 320
    .line 321
    move-result v9

    .line 322
    new-instance v11, La/r580;

    .line 323
    .line 324
    const/16 v12, 0x11

    .line 325
    .line 326
    invoke-direct {v11, v12}, La/r580;-><init>(B)V

    .line 327
    .line 328
    .line 329
    add-int v3, v3, v17

    .line 330
    .line 331
    move-wide/from16 v12, p2

    .line 332
    .line 333
    invoke-static {v3, v12, v13}, La/r4e;->g(IJ)I

    .line 334
    .line 335
    .line 336
    move-result v3

    .line 337
    add-int v9, v9, v16

    .line 338
    .line 339
    invoke-static {v9, v12, v13}, La/r4e;->f(IJ)I

    .line 340
    .line 341
    .line 342
    move-result v9

    .line 343
    sget-object v12, La/lun;->a:La/lun;

    .line 344
    .line 345
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    move-object/from16 v13, v28

    .line 349
    .line 350
    invoke-interface {v13, v3, v9, v12, v11}, La/vj30;->i0(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)La/uj30;

    .line 351
    .line 352
    .line 353
    move-result-object v9

    .line 354
    move v3, v0

    .line 355
    new-instance v0, La/pk80;

    .line 356
    .line 357
    move-object/from16 v11, p1

    .line 358
    .line 359
    move v15, v3

    .line 360
    move/from16 v3, v26

    .line 361
    .line 362
    move-wide/from16 v12, v31

    .line 363
    .line 364
    invoke-direct/range {v0 .. v13}, La/pk80;-><init>(La/iun;IIIIIILa/ifk0;La/uj30;La/vne;La/w6k;J)V

    .line 365
    .line 366
    .line 367
    move-object/from16 v1, p1

    .line 368
    .line 369
    move-object/from16 v50, v14

    .line 370
    .line 371
    move/from16 v38, v15

    .line 372
    .line 373
    goto/16 :goto_3b

    .line 374
    .line 375
    :cond_7
    move-object/from16 v34, v14

    .line 376
    .line 377
    move-wide/from16 v35, v19

    .line 378
    .line 379
    move-object v14, v8

    .line 380
    move-object/from16 v19, v10

    .line 381
    .line 382
    move/from16 v8, v30

    .line 383
    .line 384
    :goto_4
    if-lez v8, :cond_8

    .line 385
    .line 386
    if-lez v21, :cond_8

    .line 387
    .line 388
    add-int/lit8 v8, v8, -0x1

    .line 389
    .line 390
    sub-int v21, v21, v9

    .line 391
    .line 392
    goto :goto_4

    .line 393
    :cond_8
    mul-int/lit8 v10, v21, -0x1

    .line 394
    .line 395
    if-lt v8, v15, :cond_9

    .line 396
    .line 397
    add-int/lit8 v8, v15, -0x1

    .line 398
    .line 399
    const/4 v10, 0x0

    .line 400
    :cond_9
    move/from16 v20, v12

    .line 401
    .line 402
    new-instance v12, La/xw3;

    .line 403
    .line 404
    invoke-direct {v12}, La/xw3;-><init>()V

    .line 405
    .line 406
    .line 407
    move-object/from16 v21, v14

    .line 408
    .line 409
    neg-int v14, v3

    .line 410
    if-gez v26, :cond_a

    .line 411
    .line 412
    move/from16 v30, v26

    .line 413
    .line 414
    :goto_5
    move/from16 v37, v14

    .line 415
    .line 416
    goto :goto_6

    .line 417
    :cond_a
    const/16 v30, 0x0

    .line 418
    .line 419
    goto :goto_5

    .line 420
    :goto_6
    add-int v14, v37, v30

    .line 421
    .line 422
    add-int/2addr v10, v14

    .line 423
    move-object/from16 v30, v13

    .line 424
    .line 425
    const/4 v13, 0x0

    .line 426
    :goto_7
    iget-object v5, v0, La/ok80;->g:La/yx7;

    .line 427
    .line 428
    if-gez v10, :cond_b

    .line 429
    .line 430
    if-lez v8, :cond_b

    .line 431
    .line 432
    add-int/lit8 v8, v8, -0x1

    .line 433
    .line 434
    move/from16 v39, v9

    .line 435
    .line 436
    invoke-interface/range {v28 .. v28}, La/cnx;->getLayoutDirection()La/k6z;

    .line 437
    .line 438
    .line 439
    move-result-object v9

    .line 440
    move-object/from16 v44, v1

    .line 441
    .line 442
    move/from16 v40, v3

    .line 443
    .line 444
    move/from16 v43, v6

    .line 445
    .line 446
    move/from16 v45, v7

    .line 447
    .line 448
    move v0, v10

    .line 449
    move-wide/from16 v41, v23

    .line 450
    .line 451
    move-wide/from16 v6, v35

    .line 452
    .line 453
    move-object/from16 v1, p1

    .line 454
    .line 455
    move v10, v2

    .line 456
    move/from16 v24, v4

    .line 457
    .line 458
    move v2, v8

    .line 459
    move/from16 v23, v15

    .line 460
    .line 461
    move-wide/from16 v3, v31

    .line 462
    .line 463
    move/from16 v15, v39

    .line 464
    .line 465
    move-object v8, v5

    .line 466
    move-object/from16 v5, v29

    .line 467
    .line 468
    invoke-static/range {v1 .. v11}, La/d7x;->x(La/jbz;IJLa/kk80;JLa/yx7;La/k6z;ILa/ey40;)La/wj30;

    .line 469
    .line 470
    .line 471
    move-result-object v8

    .line 472
    move-object v4, v5

    .line 473
    move-wide v5, v6

    .line 474
    move v9, v10

    .line 475
    move-object v10, v11

    .line 476
    const/4 v1, 0x0

    .line 477
    invoke-virtual {v12, v1, v8}, La/xw3;->add(ILjava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    iget v1, v8, La/wj30;->h:I

    .line 481
    .line 482
    invoke-static {v13, v1}, Ljava/lang/Math;->max(II)I

    .line 483
    .line 484
    .line 485
    move-result v13

    .line 486
    add-int/2addr v0, v15

    .line 487
    move v8, v2

    .line 488
    move-object/from16 v29, v4

    .line 489
    .line 490
    move-wide/from16 v35, v5

    .line 491
    .line 492
    move v2, v9

    .line 493
    move v9, v15

    .line 494
    move/from16 v15, v23

    .line 495
    .line 496
    move/from16 v4, v24

    .line 497
    .line 498
    move/from16 v3, v40

    .line 499
    .line 500
    move-wide/from16 v23, v41

    .line 501
    .line 502
    move/from16 v6, v43

    .line 503
    .line 504
    move-object/from16 v1, v44

    .line 505
    .line 506
    move/from16 v7, v45

    .line 507
    .line 508
    const/16 v33, 0x5

    .line 509
    .line 510
    move v10, v0

    .line 511
    move-object/from16 v0, p0

    .line 512
    .line 513
    goto :goto_7

    .line 514
    :cond_b
    move-object/from16 v44, v1

    .line 515
    .line 516
    move/from16 v40, v3

    .line 517
    .line 518
    move/from16 v43, v6

    .line 519
    .line 520
    move/from16 v45, v7

    .line 521
    .line 522
    move v0, v10

    .line 523
    move-object v10, v11

    .line 524
    move-wide/from16 v41, v23

    .line 525
    .line 526
    move/from16 v24, v4

    .line 527
    .line 528
    move-object v7, v5

    .line 529
    move/from16 v23, v15

    .line 530
    .line 531
    move-object/from16 v4, v29

    .line 532
    .line 533
    move-wide/from16 v5, v35

    .line 534
    .line 535
    move v15, v9

    .line 536
    move v9, v2

    .line 537
    if-ge v0, v14, :cond_c

    .line 538
    .line 539
    move v0, v14

    .line 540
    :cond_c
    sub-int/2addr v0, v14

    .line 541
    add-int v11, v27, v24

    .line 542
    .line 543
    if-gez v11, :cond_d

    .line 544
    .line 545
    const/4 v1, 0x0

    .line 546
    goto :goto_8

    .line 547
    :cond_d
    move v1, v11

    .line 548
    :goto_8
    neg-int v2, v0

    .line 549
    move/from16 p0, v0

    .line 550
    .line 551
    move/from16 v29, v8

    .line 552
    .line 553
    const/4 v3, 0x0

    .line 554
    const/16 v25, 0x0

    .line 555
    .line 556
    :goto_9
    iget v0, v12, La/xw3;->c:I

    .line 557
    .line 558
    if-ge v3, v0, :cond_f

    .line 559
    .line 560
    if-lt v2, v1, :cond_e

    .line 561
    .line 562
    invoke-virtual {v12, v3}, La/xw3;->e(I)Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    const/16 v25, 0x1

    .line 566
    .line 567
    goto :goto_9

    .line 568
    :cond_e
    add-int/lit8 v29, v29, 0x1

    .line 569
    .line 570
    add-int/2addr v2, v15

    .line 571
    add-int/lit8 v3, v3, 0x1

    .line 572
    .line 573
    goto :goto_9

    .line 574
    :cond_f
    move v0, v13

    .line 575
    move/from16 v3, v23

    .line 576
    .line 577
    move v13, v2

    .line 578
    move/from16 v23, v8

    .line 579
    .line 580
    move/from16 v2, v29

    .line 581
    .line 582
    move/from16 v29, v16

    .line 583
    .line 584
    move/from16 v16, v25

    .line 585
    .line 586
    move/from16 v25, p0

    .line 587
    .line 588
    :goto_a
    if-ge v2, v3, :cond_14

    .line 589
    .line 590
    if-lt v13, v1, :cond_11

    .line 591
    .line 592
    if-lez v13, :cond_11

    .line 593
    .line 594
    invoke-virtual {v12}, La/xw3;->isEmpty()Z

    .line 595
    .line 596
    .line 597
    move-result v8

    .line 598
    if-eqz v8, :cond_10

    .line 599
    .line 600
    goto :goto_b

    .line 601
    :cond_10
    move/from16 p0, v11

    .line 602
    .line 603
    move/from16 v39, v15

    .line 604
    .line 605
    move/from16 v14, v27

    .line 606
    .line 607
    move v11, v0

    .line 608
    move v0, v2

    .line 609
    move v15, v3

    .line 610
    move-wide/from16 v2, v31

    .line 611
    .line 612
    goto/16 :goto_e

    .line 613
    .line 614
    :cond_11
    :goto_b
    invoke-interface/range {v28 .. v28}, La/cnx;->getLayoutDirection()La/k6z;

    .line 615
    .line 616
    .line 617
    move-result-object v8

    .line 618
    move/from16 p0, v11

    .line 619
    .line 620
    move/from16 v39, v15

    .line 621
    .line 622
    move v11, v0

    .line 623
    move v15, v3

    .line 624
    move-object/from16 v0, p1

    .line 625
    .line 626
    move-wide/from16 v51, v31

    .line 627
    .line 628
    move/from16 v31, v1

    .line 629
    .line 630
    move v1, v2

    .line 631
    move-wide/from16 v2, v51

    .line 632
    .line 633
    invoke-static/range {v0 .. v10}, La/d7x;->x(La/jbz;IJLa/kk80;JLa/yx7;La/k6z;ILa/ey40;)La/wj30;

    .line 634
    .line 635
    .line 636
    move-result-object v8

    .line 637
    move v0, v1

    .line 638
    add-int/lit8 v1, v15, -0x1

    .line 639
    .line 640
    if-ne v0, v1, :cond_12

    .line 641
    .line 642
    move/from16 v32, v9

    .line 643
    .line 644
    goto :goto_c

    .line 645
    :cond_12
    move/from16 v32, v39

    .line 646
    .line 647
    :goto_c
    add-int v13, v13, v32

    .line 648
    .line 649
    if-gt v13, v14, :cond_13

    .line 650
    .line 651
    if-eq v0, v1, :cond_13

    .line 652
    .line 653
    add-int/lit8 v1, v0, 0x1

    .line 654
    .line 655
    sub-int v25, v25, v39

    .line 656
    .line 657
    move/from16 v23, v1

    .line 658
    .line 659
    move v1, v11

    .line 660
    const/16 v16, 0x1

    .line 661
    .line 662
    goto :goto_d

    .line 663
    :cond_13
    iget v1, v8, La/wj30;->h:I

    .line 664
    .line 665
    invoke-static {v11, v1}, Ljava/lang/Math;->max(II)I

    .line 666
    .line 667
    .line 668
    move-result v1

    .line 669
    invoke-virtual {v12, v8}, La/xw3;->addLast(Ljava/lang/Object;)V

    .line 670
    .line 671
    .line 672
    :goto_d
    add-int/lit8 v0, v0, 0x1

    .line 673
    .line 674
    move-wide/from16 v51, v2

    .line 675
    .line 676
    move v2, v0

    .line 677
    move v0, v1

    .line 678
    move/from16 v1, v31

    .line 679
    .line 680
    move-wide/from16 v31, v51

    .line 681
    .line 682
    move/from16 v11, p0

    .line 683
    .line 684
    move v3, v15

    .line 685
    move/from16 v15, v39

    .line 686
    .line 687
    goto :goto_a

    .line 688
    :cond_14
    move/from16 p0, v11

    .line 689
    .line 690
    move/from16 v39, v15

    .line 691
    .line 692
    move v11, v0

    .line 693
    move v0, v2

    .line 694
    move v15, v3

    .line 695
    move-wide/from16 v2, v31

    .line 696
    .line 697
    move/from16 v14, v27

    .line 698
    .line 699
    :goto_e
    if-ge v13, v14, :cond_17

    .line 700
    .line 701
    sub-int v1, v14, v13

    .line 702
    .line 703
    sub-int v25, v25, v1

    .line 704
    .line 705
    add-int/2addr v13, v1

    .line 706
    move/from16 v1, v25

    .line 707
    .line 708
    move/from16 v8, v40

    .line 709
    .line 710
    :goto_f
    if-ge v1, v8, :cond_15

    .line 711
    .line 712
    if-lez v23, :cond_15

    .line 713
    .line 714
    add-int/lit8 v23, v23, -0x1

    .line 715
    .line 716
    move/from16 v40, v8

    .line 717
    .line 718
    invoke-interface/range {v28 .. v28}, La/cnx;->getLayoutDirection()La/k6z;

    .line 719
    .line 720
    .line 721
    move-result-object v8

    .line 722
    move/from16 v46, v0

    .line 723
    .line 724
    move/from16 v27, v1

    .line 725
    .line 726
    move/from16 v25, v13

    .line 727
    .line 728
    move/from16 v1, v23

    .line 729
    .line 730
    move/from16 v13, v40

    .line 731
    .line 732
    move-object/from16 v0, p1

    .line 733
    .line 734
    invoke-static/range {v0 .. v10}, La/d7x;->x(La/jbz;IJLa/kk80;JLa/yx7;La/k6z;ILa/ey40;)La/wj30;

    .line 735
    .line 736
    .line 737
    move-result-object v8

    .line 738
    const/4 v0, 0x0

    .line 739
    invoke-virtual {v12, v0, v8}, La/xw3;->add(ILjava/lang/Object;)V

    .line 740
    .line 741
    .line 742
    iget v0, v8, La/wj30;->h:I

    .line 743
    .line 744
    invoke-static {v11, v0}, Ljava/lang/Math;->max(II)I

    .line 745
    .line 746
    .line 747
    move-result v11

    .line 748
    add-int v0, v27, v39

    .line 749
    .line 750
    move v8, v13

    .line 751
    move/from16 v13, v25

    .line 752
    .line 753
    move v1, v0

    .line 754
    move/from16 v0, v46

    .line 755
    .line 756
    goto :goto_f

    .line 757
    :cond_15
    move/from16 v46, v0

    .line 758
    .line 759
    move/from16 v27, v1

    .line 760
    .line 761
    move/from16 v25, v13

    .line 762
    .line 763
    move v13, v8

    .line 764
    if-gez v27, :cond_16

    .line 765
    .line 766
    add-int v0, v25, v27

    .line 767
    .line 768
    const/4 v1, 0x0

    .line 769
    goto :goto_10

    .line 770
    :cond_16
    move/from16 v0, v25

    .line 771
    .line 772
    move/from16 v1, v27

    .line 773
    .line 774
    goto :goto_10

    .line 775
    :cond_17
    move/from16 v46, v0

    .line 776
    .line 777
    move v0, v13

    .line 778
    move/from16 v13, v40

    .line 779
    .line 780
    move/from16 v1, v25

    .line 781
    .line 782
    :goto_10
    if-ltz v1, :cond_18

    .line 783
    .line 784
    goto :goto_11

    .line 785
    :cond_18
    const-string v8, "invalid currentFirstPageScrollOffset"

    .line 786
    .line 787
    invoke-static {v8}, La/adx;->a(Ljava/lang/String;)V

    .line 788
    .line 789
    .line 790
    :goto_11
    neg-int v8, v1

    .line 791
    invoke-virtual {v12}, La/xw3;->first()Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    move-result-object v25

    .line 795
    check-cast v25, La/wj30;

    .line 796
    .line 797
    if-gtz v13, :cond_19

    .line 798
    .line 799
    if-gez v26, :cond_1a

    .line 800
    .line 801
    :cond_19
    move/from16 v27, v0

    .line 802
    .line 803
    goto :goto_13

    .line 804
    :cond_1a
    move/from16 v27, v0

    .line 805
    .line 806
    move-wide/from16 v31, v2

    .line 807
    .line 808
    move/from16 v35, v11

    .line 809
    .line 810
    move/from16 v3, v39

    .line 811
    .line 812
    :goto_12
    const/16 v38, 0x1

    .line 813
    .line 814
    :cond_1b
    move v11, v1

    .line 815
    goto :goto_15

    .line 816
    :goto_13
    invoke-virtual {v12}, La/xw3;->b()I

    .line 817
    .line 818
    .line 819
    move-result v0

    .line 820
    move-wide/from16 v31, v2

    .line 821
    .line 822
    const/4 v2, 0x0

    .line 823
    :goto_14
    if-ge v2, v0, :cond_1d

    .line 824
    .line 825
    if-eqz v1, :cond_1d

    .line 826
    .line 827
    move/from16 v3, v39

    .line 828
    .line 829
    if-gt v3, v1, :cond_1c

    .line 830
    .line 831
    invoke-virtual {v12}, La/xw3;->b()I

    .line 832
    .line 833
    .line 834
    move-result v33

    .line 835
    move/from16 v35, v11

    .line 836
    .line 837
    const/16 v38, 0x1

    .line 838
    .line 839
    add-int/lit8 v11, v33, -0x1

    .line 840
    .line 841
    if-eq v2, v11, :cond_1b

    .line 842
    .line 843
    sub-int/2addr v1, v3

    .line 844
    add-int/lit8 v2, v2, 0x1

    .line 845
    .line 846
    invoke-virtual {v12, v2}, La/xw3;->get(I)Ljava/lang/Object;

    .line 847
    .line 848
    .line 849
    move-result-object v11

    .line 850
    move-object/from16 v25, v11

    .line 851
    .line 852
    check-cast v25, La/wj30;

    .line 853
    .line 854
    move/from16 v39, v3

    .line 855
    .line 856
    move/from16 v11, v35

    .line 857
    .line 858
    goto :goto_14

    .line 859
    :cond_1c
    move/from16 v35, v11

    .line 860
    .line 861
    goto :goto_12

    .line 862
    :cond_1d
    move/from16 v35, v11

    .line 863
    .line 864
    move/from16 v3, v39

    .line 865
    .line 866
    goto :goto_12

    .line 867
    :goto_15
    sget-object v0, La/ma80;->a:La/ma80;

    .line 868
    .line 869
    sub-int v0, v23, v45

    .line 870
    .line 871
    const/4 v1, 0x0

    .line 872
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 873
    .line 874
    .line 875
    move-result v0

    .line 876
    add-int/lit8 v1, v23, -0x1

    .line 877
    .line 878
    if-gt v0, v1, :cond_20

    .line 879
    .line 880
    const/4 v2, 0x0

    .line 881
    :goto_16
    if-nez v2, :cond_1e

    .line 882
    .line 883
    new-instance v2, Ljava/util/ArrayList;

    .line 884
    .line 885
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 886
    .line 887
    .line 888
    :cond_1e
    sget-object v23, La/ma80;->a:La/ma80;

    .line 889
    .line 890
    move/from16 v23, v8

    .line 891
    .line 892
    invoke-interface/range {v28 .. v28}, La/cnx;->getLayoutDirection()La/k6z;

    .line 893
    .line 894
    .line 895
    move-result-object v8

    .line 896
    move/from16 v47, v3

    .line 897
    .line 898
    move/from16 v33, v11

    .line 899
    .line 900
    move/from16 v40, v13

    .line 901
    .line 902
    move-object/from16 v11, v25

    .line 903
    .line 904
    move/from16 v13, v45

    .line 905
    .line 906
    move/from16 v25, v23

    .line 907
    .line 908
    move-object/from16 v23, v12

    .line 909
    .line 910
    move-object v12, v2

    .line 911
    move-wide/from16 v2, v31

    .line 912
    .line 913
    move/from16 v31, v27

    .line 914
    .line 915
    move/from16 v27, v14

    .line 916
    .line 917
    move v14, v0

    .line 918
    move-object/from16 v0, p1

    .line 919
    .line 920
    invoke-static/range {v0 .. v10}, La/d7x;->x(La/jbz;IJLa/kk80;JLa/yx7;La/k6z;ILa/ey40;)La/wj30;

    .line 921
    .line 922
    .line 923
    move-result-object v8

    .line 924
    invoke-interface {v12, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 925
    .line 926
    .line 927
    if-eq v1, v14, :cond_1f

    .line 928
    .line 929
    add-int/lit8 v1, v1, -0x1

    .line 930
    .line 931
    move/from16 v45, v13

    .line 932
    .line 933
    move v0, v14

    .line 934
    move/from16 v8, v25

    .line 935
    .line 936
    move/from16 v14, v27

    .line 937
    .line 938
    move/from16 v27, v31

    .line 939
    .line 940
    move/from16 v13, v40

    .line 941
    .line 942
    move-wide/from16 v31, v2

    .line 943
    .line 944
    move-object/from16 v25, v11

    .line 945
    .line 946
    move-object v2, v12

    .line 947
    move-object/from16 v12, v23

    .line 948
    .line 949
    move/from16 v11, v33

    .line 950
    .line 951
    move/from16 v3, v47

    .line 952
    .line 953
    goto :goto_16

    .line 954
    :cond_1f
    move-object v8, v12

    .line 955
    :goto_17
    move-object/from16 v12, v30

    .line 956
    .line 957
    goto :goto_18

    .line 958
    :cond_20
    move/from16 v47, v3

    .line 959
    .line 960
    move/from16 v33, v11

    .line 961
    .line 962
    move-object/from16 v23, v12

    .line 963
    .line 964
    move/from16 v40, v13

    .line 965
    .line 966
    move-object/from16 v11, v25

    .line 967
    .line 968
    move-wide/from16 v2, v31

    .line 969
    .line 970
    move/from16 v13, v45

    .line 971
    .line 972
    move/from16 v25, v8

    .line 973
    .line 974
    move/from16 v31, v27

    .line 975
    .line 976
    move/from16 v27, v14

    .line 977
    .line 978
    move v14, v0

    .line 979
    const/4 v8, 0x0

    .line 980
    goto :goto_17

    .line 981
    :goto_18
    iget-object v0, v12, Landroidx/collection/MutableIntList;->a:[I

    .line 982
    .line 983
    iget v1, v12, Landroidx/collection/MutableIntList;->b:I

    .line 984
    .line 985
    move-object/from16 v30, v11

    .line 986
    .line 987
    const/4 v11, 0x0

    .line 988
    :goto_19
    if-ge v11, v1, :cond_23

    .line 989
    .line 990
    move/from16 v32, v1

    .line 991
    .line 992
    aget v1, v0, v11

    .line 993
    .line 994
    if-ge v1, v14, :cond_22

    .line 995
    .line 996
    if-nez v8, :cond_21

    .line 997
    .line 998
    new-instance v8, Ljava/util/ArrayList;

    .line 999
    .line 1000
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1001
    .line 1002
    .line 1003
    :cond_21
    sget-object v36, La/ma80;->a:La/ma80;

    .line 1004
    .line 1005
    move-object/from16 v36, v8

    .line 1006
    .line 1007
    invoke-interface/range {v28 .. v28}, La/cnx;->getLayoutDirection()La/k6z;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v8

    .line 1011
    move/from16 v39, v11

    .line 1012
    .line 1013
    move-object/from16 v11, v36

    .line 1014
    .line 1015
    move/from16 v36, v32

    .line 1016
    .line 1017
    move-object/from16 v32, v0

    .line 1018
    .line 1019
    move-object/from16 v0, p1

    .line 1020
    .line 1021
    invoke-static/range {v0 .. v10}, La/d7x;->x(La/jbz;IJLa/kk80;JLa/yx7;La/k6z;ILa/ey40;)La/wj30;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v1

    .line 1025
    invoke-interface {v11, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1026
    .line 1027
    .line 1028
    move-object v8, v11

    .line 1029
    goto :goto_1a

    .line 1030
    :cond_22
    move/from16 v39, v11

    .line 1031
    .line 1032
    move/from16 v36, v32

    .line 1033
    .line 1034
    move-object/from16 v32, v0

    .line 1035
    .line 1036
    :goto_1a
    add-int/lit8 v11, v39, 0x1

    .line 1037
    .line 1038
    move-object/from16 v0, v32

    .line 1039
    .line 1040
    move/from16 v1, v36

    .line 1041
    .line 1042
    goto :goto_19

    .line 1043
    :cond_23
    if-nez v8, :cond_24

    .line 1044
    .line 1045
    sget-object v8, La/iun;->a:La/iun;

    .line 1046
    .line 1047
    :cond_24
    move-object v11, v8

    .line 1048
    invoke-interface {v11}, Ljava/util/Collection;->size()I

    .line 1049
    .line 1050
    .line 1051
    move-result v0

    .line 1052
    move/from16 v14, v35

    .line 1053
    .line 1054
    const/4 v1, 0x0

    .line 1055
    :goto_1b
    if-ge v1, v0, :cond_25

    .line 1056
    .line 1057
    invoke-interface {v11, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v8

    .line 1061
    check-cast v8, La/wj30;

    .line 1062
    .line 1063
    iget v8, v8, La/wj30;->h:I

    .line 1064
    .line 1065
    invoke-static {v14, v8}, Ljava/lang/Math;->max(II)I

    .line 1066
    .line 1067
    .line 1068
    move-result v14

    .line 1069
    add-int/lit8 v1, v1, 0x1

    .line 1070
    .line 1071
    goto :goto_1b

    .line 1072
    :cond_25
    invoke-virtual/range {v23 .. v23}, La/xw3;->last()Ljava/lang/Object;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v0

    .line 1076
    check-cast v0, La/wj30;

    .line 1077
    .line 1078
    iget v0, v0, La/wj30;->a:I

    .line 1079
    .line 1080
    sget-object v1, La/ma80;->a:La/ma80;

    .line 1081
    .line 1082
    sub-int v1, v15, v0

    .line 1083
    .line 1084
    add-int/lit8 v1, v1, -0x1

    .line 1085
    .line 1086
    invoke-static {v13, v1}, Ljava/lang/Math;->min(II)I

    .line 1087
    .line 1088
    .line 1089
    move-result v1

    .line 1090
    add-int/2addr v1, v0

    .line 1091
    add-int/lit8 v0, v0, 0x1

    .line 1092
    .line 1093
    if-gt v0, v1, :cond_28

    .line 1094
    .line 1095
    const/4 v8, 0x0

    .line 1096
    :goto_1c
    if-nez v8, :cond_26

    .line 1097
    .line 1098
    new-instance v8, Ljava/util/ArrayList;

    .line 1099
    .line 1100
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1101
    .line 1102
    .line 1103
    :cond_26
    sget-object v32, La/ma80;->a:La/ma80;

    .line 1104
    .line 1105
    move-object/from16 v32, v8

    .line 1106
    .line 1107
    invoke-interface/range {v28 .. v28}, La/cnx;->getLayoutDirection()La/k6z;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v8

    .line 1111
    move-object/from16 v45, v32

    .line 1112
    .line 1113
    move/from16 v32, v14

    .line 1114
    .line 1115
    move-object/from16 v14, v45

    .line 1116
    .line 1117
    move/from16 v45, v13

    .line 1118
    .line 1119
    move v13, v1

    .line 1120
    move v1, v0

    .line 1121
    move-object/from16 v0, p1

    .line 1122
    .line 1123
    invoke-static/range {v0 .. v10}, La/d7x;->x(La/jbz;IJLa/kk80;JLa/yx7;La/k6z;ILa/ey40;)La/wj30;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v8

    .line 1127
    invoke-interface {v14, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1128
    .line 1129
    .line 1130
    if-eq v1, v13, :cond_27

    .line 1131
    .line 1132
    add-int/lit8 v0, v1, 0x1

    .line 1133
    .line 1134
    move v1, v13

    .line 1135
    move-object v8, v14

    .line 1136
    move/from16 v14, v32

    .line 1137
    .line 1138
    move/from16 v13, v45

    .line 1139
    .line 1140
    goto :goto_1c

    .line 1141
    :cond_27
    move-object v8, v14

    .line 1142
    goto :goto_1d

    .line 1143
    :cond_28
    move/from16 v45, v13

    .line 1144
    .line 1145
    move/from16 v32, v14

    .line 1146
    .line 1147
    move v13, v1

    .line 1148
    const/4 v8, 0x0

    .line 1149
    :goto_1d
    iget-object v14, v12, Landroidx/collection/MutableIntList;->a:[I

    .line 1150
    .line 1151
    iget v12, v12, Landroidx/collection/MutableIntList;->b:I

    .line 1152
    .line 1153
    const/4 v0, 0x0

    .line 1154
    :goto_1e
    if-ge v0, v12, :cond_2b

    .line 1155
    .line 1156
    aget v1, v14, v0

    .line 1157
    .line 1158
    move/from16 v35, v0

    .line 1159
    .line 1160
    add-int/lit8 v0, v13, 0x1

    .line 1161
    .line 1162
    if-gt v0, v1, :cond_2a

    .line 1163
    .line 1164
    if-ge v1, v15, :cond_2a

    .line 1165
    .line 1166
    if-nez v8, :cond_29

    .line 1167
    .line 1168
    new-instance v8, Ljava/util/ArrayList;

    .line 1169
    .line 1170
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1171
    .line 1172
    .line 1173
    :cond_29
    sget-object v0, La/ma80;->a:La/ma80;

    .line 1174
    .line 1175
    move-object v0, v8

    .line 1176
    invoke-interface/range {v28 .. v28}, La/cnx;->getLayoutDirection()La/k6z;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v8

    .line 1180
    move/from16 v36, v12

    .line 1181
    .line 1182
    move-object v12, v0

    .line 1183
    move-object/from16 v0, p1

    .line 1184
    .line 1185
    invoke-static/range {v0 .. v10}, La/d7x;->x(La/jbz;IJLa/kk80;JLa/yx7;La/k6z;ILa/ey40;)La/wj30;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v1

    .line 1189
    move-wide/from16 v48, v2

    .line 1190
    .line 1191
    invoke-interface {v12, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1192
    .line 1193
    .line 1194
    move-object v8, v12

    .line 1195
    goto :goto_1f

    .line 1196
    :cond_2a
    move-wide/from16 v48, v2

    .line 1197
    .line 1198
    move/from16 v36, v12

    .line 1199
    .line 1200
    :goto_1f
    add-int/lit8 v0, v35, 0x1

    .line 1201
    .line 1202
    move/from16 v12, v36

    .line 1203
    .line 1204
    move-wide/from16 v2, v48

    .line 1205
    .line 1206
    goto :goto_1e

    .line 1207
    :cond_2b
    move-wide/from16 v48, v2

    .line 1208
    .line 1209
    if-nez v8, :cond_2c

    .line 1210
    .line 1211
    sget-object v8, La/iun;->a:La/iun;

    .line 1212
    .line 1213
    :cond_2c
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    .line 1214
    .line 1215
    .line 1216
    move-result v0

    .line 1217
    move/from16 v14, v32

    .line 1218
    .line 1219
    const/4 v1, 0x0

    .line 1220
    :goto_20
    if-ge v1, v0, :cond_2d

    .line 1221
    .line 1222
    invoke-interface {v8, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v2

    .line 1226
    check-cast v2, La/wj30;

    .line 1227
    .line 1228
    iget v2, v2, La/wj30;->h:I

    .line 1229
    .line 1230
    invoke-static {v14, v2}, Ljava/lang/Math;->max(II)I

    .line 1231
    .line 1232
    .line 1233
    move-result v14

    .line 1234
    add-int/lit8 v1, v1, 0x1

    .line 1235
    .line 1236
    goto :goto_20

    .line 1237
    :cond_2d
    invoke-virtual/range {v23 .. v23}, La/xw3;->first()Ljava/lang/Object;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v0

    .line 1241
    move-object/from16 v6, v30

    .line 1242
    .line 1243
    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1244
    .line 1245
    .line 1246
    move-result v0

    .line 1247
    if-eqz v0, :cond_2e

    .line 1248
    .line 1249
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 1250
    .line 1251
    .line 1252
    move-result v0

    .line 1253
    if-eqz v0, :cond_2e

    .line 1254
    .line 1255
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 1256
    .line 1257
    .line 1258
    move-result v0

    .line 1259
    if-eqz v0, :cond_2e

    .line 1260
    .line 1261
    move/from16 v7, v38

    .line 1262
    .line 1263
    goto :goto_21

    .line 1264
    :cond_2e
    const/4 v7, 0x0

    .line 1265
    :goto_21
    sget-object v0, La/ma80;->a:La/ma80;

    .line 1266
    .line 1267
    move/from16 v10, v31

    .line 1268
    .line 1269
    move-wide/from16 v0, v41

    .line 1270
    .line 1271
    invoke-static {v10, v0, v1}, La/r4e;->g(IJ)I

    .line 1272
    .line 1273
    .line 1274
    move-result v2

    .line 1275
    invoke-static {v14, v0, v1}, La/r4e;->f(IJ)I

    .line 1276
    .line 1277
    .line 1278
    move-result v12

    .line 1279
    move/from16 v14, v27

    .line 1280
    .line 1281
    invoke-static {v2, v14}, Ljava/lang/Math;->min(II)I

    .line 1282
    .line 1283
    .line 1284
    move-result v0

    .line 1285
    if-ge v10, v0, :cond_2f

    .line 1286
    .line 1287
    move/from16 v0, v38

    .line 1288
    .line 1289
    goto :goto_22

    .line 1290
    :cond_2f
    const/4 v0, 0x0

    .line 1291
    :goto_22
    if-eqz v0, :cond_31

    .line 1292
    .line 1293
    if-nez v25, :cond_30

    .line 1294
    .line 1295
    goto :goto_23

    .line 1296
    :cond_30
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1297
    .line 1298
    const-string v3, "non-zero pagesScrollOffset="

    .line 1299
    .line 1300
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1301
    .line 1302
    .line 1303
    move/from16 v3, v25

    .line 1304
    .line 1305
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1306
    .line 1307
    .line 1308
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v1

    .line 1312
    invoke-static {v1}, La/adx;->c(Ljava/lang/String;)V

    .line 1313
    .line 1314
    .line 1315
    goto :goto_24

    .line 1316
    :cond_31
    :goto_23
    move/from16 v3, v25

    .line 1317
    .line 1318
    :goto_24
    new-instance v13, Ljava/util/ArrayList;

    .line 1319
    .line 1320
    invoke-virtual/range {v23 .. v23}, La/xw3;->b()I

    .line 1321
    .line 1322
    .line 1323
    move-result v1

    .line 1324
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 1325
    .line 1326
    .line 1327
    move-result v4

    .line 1328
    add-int/2addr v4, v1

    .line 1329
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 1330
    .line 1331
    .line 1332
    move-result v1

    .line 1333
    add-int/2addr v1, v4

    .line 1334
    invoke-direct {v13, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 1335
    .line 1336
    .line 1337
    if-eqz v0, :cond_37

    .line 1338
    .line 1339
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 1340
    .line 1341
    .line 1342
    move-result v0

    .line 1343
    if-eqz v0, :cond_32

    .line 1344
    .line 1345
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 1346
    .line 1347
    .line 1348
    move-result v0

    .line 1349
    if-eqz v0, :cond_32

    .line 1350
    .line 1351
    goto :goto_25

    .line 1352
    :cond_32
    const-string v0, "No extra pages"

    .line 1353
    .line 1354
    invoke-static {v0}, La/adx;->a(Ljava/lang/String;)V

    .line 1355
    .line 1356
    .line 1357
    :goto_25
    invoke-virtual/range {v23 .. v23}, La/xw3;->b()I

    .line 1358
    .line 1359
    .line 1360
    move-result v0

    .line 1361
    new-array v3, v0, [I

    .line 1362
    .line 1363
    const/4 v1, 0x0

    .line 1364
    :goto_26
    if-ge v1, v0, :cond_33

    .line 1365
    .line 1366
    aput v9, v3, v1

    .line 1367
    .line 1368
    add-int/lit8 v1, v1, 0x1

    .line 1369
    .line 1370
    goto :goto_26

    .line 1371
    :cond_33
    new-array v5, v0, [I

    .line 1372
    .line 1373
    move/from16 v1, v26

    .line 1374
    .line 1375
    move-object/from16 v0, v28

    .line 1376
    .line 1377
    invoke-interface {v0, v1}, La/w6k;->r0(I)F

    .line 1378
    .line 1379
    .line 1380
    move-result v4

    .line 1381
    new-instance v0, La/qw3;

    .line 1382
    .line 1383
    move-object/from16 v30, v6

    .line 1384
    .line 1385
    const/4 v1, 0x0

    .line 1386
    const/4 v6, 0x0

    .line 1387
    invoke-direct {v0, v4, v1, v6}, La/qw3;-><init>(FZLa/rw3;)V

    .line 1388
    .line 1389
    .line 1390
    sget-object v1, La/ma80;->a:La/ma80;

    .line 1391
    .line 1392
    sget-object v4, La/k6z;->a:La/k6z;

    .line 1393
    .line 1394
    move-object/from16 v1, p1

    .line 1395
    .line 1396
    move-object/from16 v6, v28

    .line 1397
    .line 1398
    invoke-virtual/range {v0 .. v5}, La/qw3;->b(La/w6k;I[ILa/k6z;[I)V

    .line 1399
    .line 1400
    .line 1401
    invoke-static {v5}, La/tx3;->C([I)Lkotlin/ranges/IntRange;

    .line 1402
    .line 1403
    .line 1404
    move-result-object v0

    .line 1405
    iget v1, v0, Lkotlin/ranges/a;->b:I

    .line 1406
    .line 1407
    iget v0, v0, Lkotlin/ranges/a;->c:I

    .line 1408
    .line 1409
    if-lez v0, :cond_34

    .line 1410
    .line 1411
    if-gez v1, :cond_35

    .line 1412
    .line 1413
    :cond_34
    if-gez v0, :cond_36

    .line 1414
    .line 1415
    if-gtz v1, :cond_36

    .line 1416
    .line 1417
    :cond_35
    const/4 v3, 0x0

    .line 1418
    :goto_27
    aget v4, v5, v3

    .line 1419
    .line 1420
    move/from16 v20, v0

    .line 1421
    .line 1422
    move-object/from16 v0, v23

    .line 1423
    .line 1424
    invoke-virtual {v0, v3}, La/xw3;->get(I)Ljava/lang/Object;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v23

    .line 1428
    move-object/from16 v27, v5

    .line 1429
    .line 1430
    move-object/from16 v5, v23

    .line 1431
    .line 1432
    check-cast v5, La/wj30;

    .line 1433
    .line 1434
    invoke-virtual {v5, v4, v2, v12}, La/wj30;->b(III)V

    .line 1435
    .line 1436
    .line 1437
    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1438
    .line 1439
    .line 1440
    if-eq v3, v1, :cond_3a

    .line 1441
    .line 1442
    add-int v3, v3, v20

    .line 1443
    .line 1444
    move-object/from16 v23, v0

    .line 1445
    .line 1446
    move/from16 v0, v20

    .line 1447
    .line 1448
    move-object/from16 v5, v27

    .line 1449
    .line 1450
    goto :goto_27

    .line 1451
    :cond_36
    move-object/from16 v0, v23

    .line 1452
    .line 1453
    goto :goto_2b

    .line 1454
    :cond_37
    move-object/from16 v30, v6

    .line 1455
    .line 1456
    move-object/from16 v0, v23

    .line 1457
    .line 1458
    move-object/from16 v6, v28

    .line 1459
    .line 1460
    invoke-interface {v11}, Ljava/util/Collection;->size()I

    .line 1461
    .line 1462
    .line 1463
    move-result v1

    .line 1464
    move v4, v3

    .line 1465
    const/4 v5, 0x0

    .line 1466
    :goto_28
    if-ge v5, v1, :cond_38

    .line 1467
    .line 1468
    invoke-interface {v11, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1469
    .line 1470
    .line 1471
    move-result-object v23

    .line 1472
    move/from16 v27, v1

    .line 1473
    .line 1474
    move-object/from16 v1, v23

    .line 1475
    .line 1476
    check-cast v1, La/wj30;

    .line 1477
    .line 1478
    sub-int v4, v4, v20

    .line 1479
    .line 1480
    invoke-virtual {v1, v4, v2, v12}, La/wj30;->b(III)V

    .line 1481
    .line 1482
    .line 1483
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1484
    .line 1485
    .line 1486
    add-int/lit8 v5, v5, 0x1

    .line 1487
    .line 1488
    move/from16 v1, v27

    .line 1489
    .line 1490
    goto :goto_28

    .line 1491
    :cond_38
    invoke-virtual {v0}, La/xw3;->b()I

    .line 1492
    .line 1493
    .line 1494
    move-result v1

    .line 1495
    const/4 v5, 0x0

    .line 1496
    :goto_29
    if-ge v5, v1, :cond_39

    .line 1497
    .line 1498
    invoke-virtual {v0, v5}, La/xw3;->get(I)Ljava/lang/Object;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v4

    .line 1502
    check-cast v4, La/wj30;

    .line 1503
    .line 1504
    invoke-virtual {v4, v3, v2, v12}, La/wj30;->b(III)V

    .line 1505
    .line 1506
    .line 1507
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1508
    .line 1509
    .line 1510
    add-int v3, v3, v20

    .line 1511
    .line 1512
    add-int/lit8 v5, v5, 0x1

    .line 1513
    .line 1514
    goto :goto_29

    .line 1515
    :cond_39
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    .line 1516
    .line 1517
    .line 1518
    move-result v1

    .line 1519
    const/4 v5, 0x0

    .line 1520
    :goto_2a
    if-ge v5, v1, :cond_3a

    .line 1521
    .line 1522
    invoke-interface {v8, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1523
    .line 1524
    .line 1525
    move-result-object v4

    .line 1526
    check-cast v4, La/wj30;

    .line 1527
    .line 1528
    invoke-virtual {v4, v3, v2, v12}, La/wj30;->b(III)V

    .line 1529
    .line 1530
    .line 1531
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1532
    .line 1533
    .line 1534
    add-int v3, v3, v20

    .line 1535
    .line 1536
    add-int/lit8 v5, v5, 0x1

    .line 1537
    .line 1538
    goto :goto_2a

    .line 1539
    :cond_3a
    :goto_2b
    if-eqz v7, :cond_3c

    .line 1540
    .line 1541
    move-object v1, v13

    .line 1542
    :cond_3b
    move-object/from16 v23, v0

    .line 1543
    .line 1544
    move/from16 v27, v2

    .line 1545
    .line 1546
    goto :goto_2d

    .line 1547
    :cond_3c
    new-instance v1, Ljava/util/ArrayList;

    .line 1548
    .line 1549
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 1550
    .line 1551
    .line 1552
    move-result v3

    .line 1553
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1554
    .line 1555
    .line 1556
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 1557
    .line 1558
    .line 1559
    move-result v3

    .line 1560
    const/4 v5, 0x0

    .line 1561
    :goto_2c
    if-ge v5, v3, :cond_3b

    .line 1562
    .line 1563
    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v4

    .line 1567
    move-object v7, v4

    .line 1568
    check-cast v7, La/wj30;

    .line 1569
    .line 1570
    move-object/from16 v23, v0

    .line 1571
    .line 1572
    iget v0, v7, La/wj30;->a:I

    .line 1573
    .line 1574
    invoke-virtual/range {v23 .. v23}, La/xw3;->first()Ljava/lang/Object;

    .line 1575
    .line 1576
    .line 1577
    move-result-object v20

    .line 1578
    move/from16 v27, v2

    .line 1579
    .line 1580
    move-object/from16 v2, v20

    .line 1581
    .line 1582
    check-cast v2, La/wj30;

    .line 1583
    .line 1584
    iget v2, v2, La/wj30;->a:I

    .line 1585
    .line 1586
    if-lt v0, v2, :cond_3d

    .line 1587
    .line 1588
    iget v0, v7, La/wj30;->a:I

    .line 1589
    .line 1590
    invoke-virtual/range {v23 .. v23}, La/xw3;->last()Ljava/lang/Object;

    .line 1591
    .line 1592
    .line 1593
    move-result-object v2

    .line 1594
    check-cast v2, La/wj30;

    .line 1595
    .line 1596
    iget v2, v2, La/wj30;->a:I

    .line 1597
    .line 1598
    if-gt v0, v2, :cond_3d

    .line 1599
    .line 1600
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1601
    .line 1602
    .line 1603
    :cond_3d
    add-int/lit8 v5, v5, 0x1

    .line 1604
    .line 1605
    move-object/from16 v0, v23

    .line 1606
    .line 1607
    move/from16 v2, v27

    .line 1608
    .line 1609
    goto :goto_2c

    .line 1610
    :goto_2d
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 1611
    .line 1612
    .line 1613
    move-result v0

    .line 1614
    if-eqz v0, :cond_3e

    .line 1615
    .line 1616
    sget-object v0, La/iun;->a:La/iun;

    .line 1617
    .line 1618
    goto :goto_2f

    .line 1619
    :cond_3e
    new-instance v0, Ljava/util/ArrayList;

    .line 1620
    .line 1621
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 1622
    .line 1623
    .line 1624
    move-result v2

    .line 1625
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1626
    .line 1627
    .line 1628
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 1629
    .line 1630
    .line 1631
    move-result v2

    .line 1632
    const/4 v5, 0x0

    .line 1633
    :goto_2e
    if-ge v5, v2, :cond_40

    .line 1634
    .line 1635
    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1636
    .line 1637
    .line 1638
    move-result-object v3

    .line 1639
    move-object v4, v3

    .line 1640
    check-cast v4, La/wj30;

    .line 1641
    .line 1642
    iget v4, v4, La/wj30;->a:I

    .line 1643
    .line 1644
    invoke-virtual/range {v23 .. v23}, La/xw3;->first()Ljava/lang/Object;

    .line 1645
    .line 1646
    .line 1647
    move-result-object v7

    .line 1648
    check-cast v7, La/wj30;

    .line 1649
    .line 1650
    iget v7, v7, La/wj30;->a:I

    .line 1651
    .line 1652
    if-ge v4, v7, :cond_3f

    .line 1653
    .line 1654
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1655
    .line 1656
    .line 1657
    :cond_3f
    add-int/lit8 v5, v5, 0x1

    .line 1658
    .line 1659
    goto :goto_2e

    .line 1660
    :cond_40
    :goto_2f
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 1661
    .line 1662
    .line 1663
    move-result v2

    .line 1664
    if-eqz v2, :cond_41

    .line 1665
    .line 1666
    sget-object v2, La/iun;->a:La/iun;

    .line 1667
    .line 1668
    goto :goto_31

    .line 1669
    :cond_41
    new-instance v2, Ljava/util/ArrayList;

    .line 1670
    .line 1671
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 1672
    .line 1673
    .line 1674
    move-result v3

    .line 1675
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1676
    .line 1677
    .line 1678
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 1679
    .line 1680
    .line 1681
    move-result v3

    .line 1682
    const/4 v5, 0x0

    .line 1683
    :goto_30
    if-ge v5, v3, :cond_43

    .line 1684
    .line 1685
    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1686
    .line 1687
    .line 1688
    move-result-object v4

    .line 1689
    move-object v7, v4

    .line 1690
    check-cast v7, La/wj30;

    .line 1691
    .line 1692
    iget v7, v7, La/wj30;->a:I

    .line 1693
    .line 1694
    invoke-virtual/range {v23 .. v23}, La/xw3;->last()Ljava/lang/Object;

    .line 1695
    .line 1696
    .line 1697
    move-result-object v8

    .line 1698
    check-cast v8, La/wj30;

    .line 1699
    .line 1700
    iget v8, v8, La/wj30;->a:I

    .line 1701
    .line 1702
    if-le v7, v8, :cond_42

    .line 1703
    .line 1704
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1705
    .line 1706
    .line 1707
    :cond_42
    add-int/lit8 v5, v5, 0x1

    .line 1708
    .line 1709
    goto :goto_30

    .line 1710
    :cond_43
    :goto_31
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 1711
    .line 1712
    .line 1713
    move-result v3

    .line 1714
    if-eqz v3, :cond_44

    .line 1715
    .line 1716
    move-object/from16 v20, v0

    .line 1717
    .line 1718
    move-object/from16 v25, v2

    .line 1719
    .line 1720
    move-object/from16 v5, v21

    .line 1721
    .line 1722
    move/from16 v7, v24

    .line 1723
    .line 1724
    move/from16 v8, v40

    .line 1725
    .line 1726
    move/from16 v11, v43

    .line 1727
    .line 1728
    const/4 v3, 0x0

    .line 1729
    move-object/from16 v24, v1

    .line 1730
    .line 1731
    goto/16 :goto_33

    .line 1732
    .line 1733
    :cond_44
    const/4 v5, 0x0

    .line 1734
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1735
    .line 1736
    .line 1737
    move-result-object v3

    .line 1738
    move-object v4, v3

    .line 1739
    check-cast v4, La/wj30;

    .line 1740
    .line 1741
    iget v4, v4, La/wj30;->j:I

    .line 1742
    .line 1743
    move-object/from16 v20, v0

    .line 1744
    .line 1745
    move-object/from16 v5, v21

    .line 1746
    .line 1747
    move/from16 v7, v24

    .line 1748
    .line 1749
    move/from16 v8, v40

    .line 1750
    .line 1751
    move/from16 v11, v43

    .line 1752
    .line 1753
    invoke-interface {v5, v11, v9, v8, v7}, La/ifk0;->a(IIII)I

    .line 1754
    .line 1755
    .line 1756
    move-result v0

    .line 1757
    int-to-float v0, v0

    .line 1758
    int-to-float v4, v4

    .line 1759
    sub-float/2addr v4, v0

    .line 1760
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 1761
    .line 1762
    .line 1763
    move-result v0

    .line 1764
    neg-float v0, v0

    .line 1765
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1766
    .line 1767
    .line 1768
    move-result v4

    .line 1769
    add-int/lit8 v4, v4, -0x1

    .line 1770
    .line 1771
    move/from16 v21, v0

    .line 1772
    .line 1773
    move/from16 v0, v38

    .line 1774
    .line 1775
    if-gt v0, v4, :cond_47

    .line 1776
    .line 1777
    move/from16 v51, v21

    .line 1778
    .line 1779
    move-object/from16 v21, v3

    .line 1780
    .line 1781
    move/from16 v3, v51

    .line 1782
    .line 1783
    :goto_32
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1784
    .line 1785
    .line 1786
    move-result-object v23

    .line 1787
    move-object/from16 v24, v1

    .line 1788
    .line 1789
    move-object/from16 v1, v23

    .line 1790
    .line 1791
    check-cast v1, La/wj30;

    .line 1792
    .line 1793
    iget v1, v1, La/wj30;->j:I

    .line 1794
    .line 1795
    move-object/from16 v25, v2

    .line 1796
    .line 1797
    invoke-interface {v5, v11, v9, v8, v7}, La/ifk0;->a(IIII)I

    .line 1798
    .line 1799
    .line 1800
    move-result v2

    .line 1801
    int-to-float v2, v2

    .line 1802
    int-to-float v1, v1

    .line 1803
    sub-float/2addr v1, v2

    .line 1804
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 1805
    .line 1806
    .line 1807
    move-result v1

    .line 1808
    neg-float v1, v1

    .line 1809
    invoke-static {v3, v1}, Ljava/lang/Float;->compare(FF)I

    .line 1810
    .line 1811
    .line 1812
    move-result v2

    .line 1813
    if-gez v2, :cond_45

    .line 1814
    .line 1815
    move v3, v1

    .line 1816
    move-object/from16 v21, v23

    .line 1817
    .line 1818
    :cond_45
    if-eq v0, v4, :cond_46

    .line 1819
    .line 1820
    add-int/lit8 v0, v0, 0x1

    .line 1821
    .line 1822
    move-object/from16 v1, v24

    .line 1823
    .line 1824
    move-object/from16 v2, v25

    .line 1825
    .line 1826
    goto :goto_32

    .line 1827
    :cond_46
    move-object/from16 v3, v21

    .line 1828
    .line 1829
    goto :goto_33

    .line 1830
    :cond_47
    move-object/from16 v24, v1

    .line 1831
    .line 1832
    move-object/from16 v25, v2

    .line 1833
    .line 1834
    :goto_33
    check-cast v3, La/wj30;

    .line 1835
    .line 1836
    invoke-interface {v5, v11, v9, v8, v7}, La/ifk0;->a(IIII)I

    .line 1837
    .line 1838
    .line 1839
    move-result v0

    .line 1840
    if-eqz v3, :cond_48

    .line 1841
    .line 1842
    iget v1, v3, La/wj30;->j:I

    .line 1843
    .line 1844
    :goto_34
    move/from16 v2, v47

    .line 1845
    .line 1846
    goto :goto_35

    .line 1847
    :cond_48
    const/4 v1, 0x0

    .line 1848
    goto :goto_34

    .line 1849
    :goto_35
    if-nez v2, :cond_49

    .line 1850
    .line 1851
    const/4 v0, 0x0

    .line 1852
    :goto_36
    move v11, v0

    .line 1853
    goto :goto_37

    .line 1854
    :cond_49
    sub-int/2addr v0, v1

    .line 1855
    int-to-float v0, v0

    .line 1856
    int-to-float v1, v2

    .line 1857
    div-float/2addr v0, v1

    .line 1858
    const/high16 v1, -0x41000000    # -0.5f

    .line 1859
    .line 1860
    const/high16 v2, 0x3f000000    # 0.5f

    .line 1861
    .line 1862
    invoke-static {v0, v1, v2}, La/l1e0;->c(FFF)F

    .line 1863
    .line 1864
    .line 1865
    move-result v0

    .line 1866
    goto :goto_36

    .line 1867
    :goto_37
    new-instance v0, La/ka70;

    .line 1868
    .line 1869
    move-object/from16 v1, v44

    .line 1870
    .line 1871
    const/4 v2, 0x5

    .line 1872
    invoke-direct {v0, v1, v13, v2}, La/ka70;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1873
    .line 1874
    .line 1875
    add-int v2, v27, v17

    .line 1876
    .line 1877
    move-object v1, v3

    .line 1878
    move-wide/from16 v3, p2

    .line 1879
    .line 1880
    invoke-static {v2, v3, v4}, La/r4e;->g(IJ)I

    .line 1881
    .line 1882
    .line 1883
    move-result v2

    .line 1884
    add-int v12, v12, v29

    .line 1885
    .line 1886
    invoke-static {v12, v3, v4}, La/r4e;->f(IJ)I

    .line 1887
    .line 1888
    .line 1889
    move-result v3

    .line 1890
    sget-object v4, La/lun;->a:La/lun;

    .line 1891
    .line 1892
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1893
    .line 1894
    .line 1895
    invoke-interface {v6, v2, v3, v4, v0}, La/vj30;->i0(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)La/uj30;

    .line 1896
    .line 1897
    .line 1898
    move-result-object v0

    .line 1899
    move/from16 v2, v46

    .line 1900
    .line 1901
    if-lt v2, v15, :cond_4b

    .line 1902
    .line 1903
    if-le v10, v14, :cond_4a

    .line 1904
    .line 1905
    goto :goto_39

    .line 1906
    :cond_4a
    const/4 v13, 0x0

    .line 1907
    :goto_38
    move-object v15, v0

    .line 1908
    goto :goto_3a

    .line 1909
    :cond_4b
    :goto_39
    const/4 v13, 0x1

    .line 1910
    goto :goto_38

    .line 1911
    :goto_3a
    new-instance v0, La/pk80;

    .line 1912
    .line 1913
    move-object v10, v1

    .line 1914
    move-object v14, v5

    .line 1915
    move-object/from16 v28, v6

    .line 1916
    .line 1917
    move v4, v7

    .line 1918
    move v2, v9

    .line 1919
    move-object/from16 v5, v18

    .line 1920
    .line 1921
    move-object/from16 v17, v20

    .line 1922
    .line 1923
    move-object/from16 v1, v24

    .line 1924
    .line 1925
    move-object/from16 v18, v25

    .line 1926
    .line 1927
    move/from16 v3, v26

    .line 1928
    .line 1929
    move-object/from16 v9, v30

    .line 1930
    .line 1931
    move/from16 v12, v33

    .line 1932
    .line 1933
    move-object/from16 v50, v34

    .line 1934
    .line 1935
    move/from16 v6, v37

    .line 1936
    .line 1937
    move/from16 v8, v45

    .line 1938
    .line 1939
    move-wide/from16 v21, v48

    .line 1940
    .line 1941
    const/16 v38, 0x1

    .line 1942
    .line 1943
    move/from16 v7, p0

    .line 1944
    .line 1945
    move-object/from16 v20, p1

    .line 1946
    .line 1947
    invoke-direct/range {v0 .. v22}, La/pk80;-><init>(Ljava/util/List;IIILa/ma80;IIILa/wj30;La/wj30;FIZLa/ifk0;La/uj30;ZLjava/util/List;Ljava/util/List;La/vne;La/w6k;J)V

    .line 1948
    .line 1949
    .line 1950
    move-object/from16 v1, v20

    .line 1951
    .line 1952
    :goto_3b
    invoke-interface/range {v28 .. v28}, La/cnx;->M()Z

    .line 1953
    .line 1954
    .line 1955
    move-result v2

    .line 1956
    move-object/from16 v3, v50

    .line 1957
    .line 1958
    const/4 v5, 0x0

    .line 1959
    invoke-virtual {v3, v0, v2, v5}, La/xk80;->h(La/pk80;ZZ)V

    .line 1960
    .line 1961
    .line 1962
    iget-object v2, v3, La/xk80;->v:La/sj80;

    .line 1963
    .line 1964
    iget-object v3, v0, La/pk80;->a:Ljava/util/List;

    .line 1965
    .line 1966
    const-string v4, "compose:pager:cache_window:keepAroundItems"

    .line 1967
    .line 1968
    invoke-static {v4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1969
    .line 1970
    .line 1971
    :try_start_1
    invoke-virtual {v2}, La/sj9;->e()Z

    .line 1972
    .line 1973
    .line 1974
    move-result v4

    .line 1975
    if-eqz v4, :cond_4d

    .line 1976
    .line 1977
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 1978
    .line 1979
    .line 1980
    move-result v4

    .line 1981
    if-nez v4, :cond_4d

    .line 1982
    .line 1983
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 1984
    .line 1985
    .line 1986
    move-result-object v4

    .line 1987
    check-cast v4, La/wj30;

    .line 1988
    .line 1989
    iget v4, v4, La/wj30;->a:I

    .line 1990
    .line 1991
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 1992
    .line 1993
    .line 1994
    move-result-object v3

    .line 1995
    check-cast v3, La/wj30;

    .line 1996
    .line 1997
    iget v3, v3, La/wj30;->a:I

    .line 1998
    .line 1999
    iget v5, v2, La/sj9;->j:I

    .line 2000
    .line 2001
    :goto_3c
    if-ge v5, v4, :cond_4c

    .line 2002
    .line 2003
    invoke-virtual {v1, v5}, La/jbz;->a(I)Ljava/util/List;

    .line 2004
    .line 2005
    .line 2006
    add-int/lit8 v5, v5, 0x1

    .line 2007
    .line 2008
    goto :goto_3c

    .line 2009
    :cond_4c
    add-int/lit8 v3, v3, 0x1

    .line 2010
    .line 2011
    iget v2, v2, La/sj9;->k:I

    .line 2012
    .line 2013
    if-gt v3, v2, :cond_4d

    .line 2014
    .line 2015
    :goto_3d
    invoke-virtual {v1, v3}, La/jbz;->a(I)Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2016
    .line 2017
    .line 2018
    if-eq v3, v2, :cond_4d

    .line 2019
    .line 2020
    add-int/lit8 v3, v3, 0x1

    .line 2021
    .line 2022
    goto :goto_3d

    .line 2023
    :cond_4d
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 2024
    .line 2025
    .line 2026
    return-object v0

    .line 2027
    :catchall_0
    move-exception v0

    .line 2028
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 2029
    .line 2030
    .line 2031
    throw v0

    .line 2032
    :catchall_1
    move-exception v0

    .line 2033
    invoke-static {v15, v8, v9}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 2034
    .line 2035
    .line 2036
    throw v0
.end method
