.class public final La/ct40;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:La/ot40;

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:Z


# direct methods
.method public constructor <init>(La/ot40;ZZZ)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ct40;->a:La/ot40;

    .line 2
    .line 3
    iput-boolean p2, p0, La/ct40;->b:Z

    .line 4
    .line 5
    iput-boolean p3, p0, La/ct40;->c:Z

    .line 6
    .line 7
    iput-boolean p4, p0, La/ct40;->d:Z

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/fhl;

    .line 6
    .line 7
    iget-object v2, v0, La/ct40;->a:La/ot40;

    .line 8
    .line 9
    iget-object v3, v2, La/ot40;->i:La/fms0;

    .line 10
    .line 11
    const/4 v4, 0x2

    .line 12
    new-array v5, v4, [F

    .line 13
    .line 14
    fill-array-data v5, :array_0

    .line 15
    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    invoke-static {v6, v5}, La/qjj;->K(F[F)La/x03;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    iget-object v2, v2, La/bk30;->a:La/l4e;

    .line 23
    .line 24
    iget-object v2, v2, La/l4e;->u0:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    const/4 v8, 0x0

    .line 31
    move v9, v8

    .line 32
    :goto_0
    if-ge v9, v7, :cond_1c

    .line 33
    .line 34
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v10

    .line 38
    check-cast v10, La/k4e;

    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget-object v11, v10, La/k4e;->k:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v3, v8, v11}, La/fms0;->a(ILjava/lang/String;)La/ems0;

    .line 46
    .line 47
    .line 48
    move-result-object v11

    .line 49
    iget-object v11, v11, La/ems0;->a:La/vdv0;

    .line 50
    .line 51
    iget-object v10, v10, La/k4e;->k:Ljava/lang/String;

    .line 52
    .line 53
    const/4 v12, 0x1

    .line 54
    invoke-virtual {v3, v12, v10}, La/fms0;->a(ILjava/lang/String;)La/ems0;

    .line 55
    .line 56
    .line 57
    move-result-object v10

    .line 58
    iget-object v10, v10, La/ems0;->b:La/vdv0;

    .line 59
    .line 60
    iget-boolean v13, v0, La/ct40;->b:Z

    .line 61
    .line 62
    const/high16 v14, 0x40000000    # 2.0f

    .line 63
    .line 64
    if-eqz v13, :cond_0

    .line 65
    .line 66
    move v13, v9

    .line 67
    sget-wide v8, La/y3d;->e:J

    .line 68
    .line 69
    invoke-static {v1, v11, v5, v8, v9}, La/ot40;->g(La/fhl;La/vdv0;La/x03;J)V

    .line 70
    .line 71
    .line 72
    invoke-static {v1, v10, v5, v8, v9}, La/ot40;->g(La/fhl;La/vdv0;La/x03;J)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v1}, La/fhl;->A0()La/nr;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    iget-object v8, v8, La/nr;->b:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v8, La/fvt0;

    .line 82
    .line 83
    invoke-virtual {v8, v14, v14}, La/fvt0;->A(FF)V

    .line 84
    .line 85
    .line 86
    const/high16 v8, -0x40000000    # -2.0f

    .line 87
    .line 88
    move v15, v7

    .line 89
    :try_start_0
    sget-wide v6, La/y3d;->c:J

    .line 90
    .line 91
    invoke-static {v1, v11, v5, v6, v7}, La/ot40;->g(La/fhl;La/vdv0;La/x03;J)V

    .line 92
    .line 93
    .line 94
    invoke-static {v1, v10, v5, v6, v7}, La/ot40;->g(La/fhl;La/vdv0;La/x03;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    .line 96
    .line 97
    invoke-interface {v1}, La/fhl;->A0()La/nr;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    iget-object v6, v6, La/nr;->b:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v6, La/fvt0;

    .line 104
    .line 105
    invoke-virtual {v6, v8, v8}, La/fvt0;->A(FF)V

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :catchall_0
    move-exception v0

    .line 110
    invoke-interface {v1}, La/fhl;->A0()La/nr;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    iget-object v1, v1, La/nr;->b:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v1, La/fvt0;

    .line 117
    .line 118
    invoke-virtual {v1, v8, v8}, La/fvt0;->A(FF)V

    .line 119
    .line 120
    .line 121
    throw v0

    .line 122
    :cond_0
    move v15, v7

    .line 123
    move v13, v9

    .line 124
    :goto_1
    invoke-interface {v1}, La/fhl;->d()J

    .line 125
    .line 126
    .line 127
    move-result-wide v6

    .line 128
    invoke-static {v6, v7}, La/h7k0;->e(J)F

    .line 129
    .line 130
    .line 131
    move-result v6

    .line 132
    invoke-interface {v1}, La/fhl;->d()J

    .line 133
    .line 134
    .line 135
    move-result-wide v7

    .line 136
    invoke-static {v7, v8}, La/h7k0;->c(J)F

    .line 137
    .line 138
    .line 139
    move-result v7

    .line 140
    new-instance v8, La/cry;

    .line 141
    .line 142
    invoke-direct {v8}, La/cry;-><init>()V

    .line 143
    .line 144
    .line 145
    new-instance v10, Landroid/graphics/Rect;

    .line 146
    .line 147
    invoke-direct {v10}, Landroid/graphics/Rect;-><init>()V

    .line 148
    .line 149
    .line 150
    new-instance v10, Landroid/graphics/Paint;

    .line 151
    .line 152
    invoke-direct {v10}, Landroid/graphics/Paint;-><init>()V

    .line 153
    .line 154
    .line 155
    iput-object v10, v8, La/cry;->f:Ljava/lang/Object;

    .line 156
    .line 157
    invoke-virtual {v10, v12}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 158
    .line 159
    .line 160
    const/16 v9, -0x55cd

    .line 161
    .line 162
    invoke-virtual {v10, v9}, Landroid/graphics/Paint;->setColor(I)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v10, v14}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 166
    .line 167
    .line 168
    sget-object v9, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 169
    .line 170
    invoke-virtual {v10, v9}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 171
    .line 172
    .line 173
    new-instance v4, Landroid/graphics/Paint;

    .line 174
    .line 175
    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    .line 176
    .line 177
    .line 178
    iput-object v4, v8, La/cry;->g:Ljava/lang/Object;

    .line 179
    .line 180
    invoke-virtual {v4, v12}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 181
    .line 182
    .line 183
    const v12, -0x1f8a66

    .line 184
    .line 185
    .line 186
    invoke-virtual {v4, v12}, Landroid/graphics/Paint;->setColor(I)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v4, v14}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v4, v9}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 193
    .line 194
    .line 195
    new-instance v12, Landroid/graphics/Paint;

    .line 196
    .line 197
    invoke-direct {v12}, Landroid/graphics/Paint;-><init>()V

    .line 198
    .line 199
    .line 200
    const/4 v14, 0x1

    .line 201
    invoke-virtual {v12, v14}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 202
    .line 203
    .line 204
    const v14, -0xcc5600

    .line 205
    .line 206
    .line 207
    invoke-virtual {v12, v14}, Landroid/graphics/Paint;->setColor(I)V

    .line 208
    .line 209
    .line 210
    const/high16 v14, 0x40000000    # 2.0f

    .line 211
    .line 212
    invoke-virtual {v12, v14}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v12, v9}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 216
    .line 217
    .line 218
    new-instance v9, Landroid/graphics/Paint;

    .line 219
    .line 220
    invoke-direct {v9}, Landroid/graphics/Paint;-><init>()V

    .line 221
    .line 222
    .line 223
    const/4 v14, 0x1

    .line 224
    invoke-virtual {v9, v14}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 225
    .line 226
    .line 227
    const v14, -0xcc5600

    .line 228
    .line 229
    .line 230
    invoke-virtual {v9, v14}, Landroid/graphics/Paint;->setColor(I)V

    .line 231
    .line 232
    .line 233
    const/high16 v14, 0x41b80000    # 23.0f

    .line 234
    .line 235
    invoke-virtual {v9, v14}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 236
    .line 237
    .line 238
    new-instance v9, Landroid/graphics/Paint;

    .line 239
    .line 240
    invoke-direct {v9}, Landroid/graphics/Paint;-><init>()V

    .line 241
    .line 242
    .line 243
    iput-object v9, v8, La/cry;->h:Ljava/lang/Object;

    .line 244
    .line 245
    const/4 v14, 0x1

    .line 246
    invoke-virtual {v9, v14}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 247
    .line 248
    .line 249
    new-instance v14, Landroid/graphics/DashPathEffect;

    .line 250
    .line 251
    move-object/from16 v23, v1

    .line 252
    .line 253
    move-object/from16 v22, v2

    .line 254
    .line 255
    const/4 v1, 0x2

    .line 256
    new-array v2, v1, [F

    .line 257
    .line 258
    fill-array-data v2, :array_1

    .line 259
    .line 260
    .line 261
    const/4 v1, 0x0

    .line 262
    invoke-direct {v14, v2, v1}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v12, v14}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 266
    .line 267
    .line 268
    const/16 v2, 0x64

    .line 269
    .line 270
    new-array v2, v2, [F

    .line 271
    .line 272
    iput-object v2, v8, La/cry;->d:Ljava/lang/Object;

    .line 273
    .line 274
    const/16 v14, 0x32

    .line 275
    .line 276
    new-array v14, v14, [I

    .line 277
    .line 278
    invoke-interface/range {v23 .. v23}, La/fhl;->A0()La/nr;

    .line 279
    .line 280
    .line 281
    move-result-object v16

    .line 282
    invoke-virtual/range {v16 .. v16}, La/nr;->i()La/x5a;

    .line 283
    .line 284
    .line 285
    move-result-object v16

    .line 286
    invoke-static/range {v16 .. v16}, La/vw2;->b(La/x5a;)Landroid/graphics/Canvas;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    iget-object v11, v11, La/vdv0;->a:La/k4e;

    .line 291
    .line 292
    iget-object v11, v11, La/k4e;->k:Ljava/lang/String;

    .line 293
    .line 294
    move-object/from16 v29, v2

    .line 295
    .line 296
    const/4 v2, 0x0

    .line 297
    invoke-virtual {v3, v2, v11}, La/fms0;->a(ILjava/lang/String;)La/ems0;

    .line 298
    .line 299
    .line 300
    move-result-object v11

    .line 301
    iget-object v11, v11, La/ems0;->d:La/zr40;

    .line 302
    .line 303
    float-to-int v6, v6

    .line 304
    float-to-int v7, v7

    .line 305
    move/from16 p1, v2

    .line 306
    .line 307
    iget-object v2, v11, La/zr40;->r:Ljava/util/ArrayList;

    .line 308
    .line 309
    move-object/from16 v16, v2

    .line 310
    .line 311
    iget-object v2, v11, La/zr40;->g:[La/kpb;

    .line 312
    .line 313
    aget-object v2, v2, p1

    .line 314
    .line 315
    invoke-virtual {v2}, La/kpb;->Y()[D

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 320
    .line 321
    .line 322
    move-result-object v16

    .line 323
    const/16 v17, 0x0

    .line 324
    .line 325
    :goto_2
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 326
    .line 327
    .line 328
    move-result v18

    .line 329
    if-eqz v18, :cond_1

    .line 330
    .line 331
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v18

    .line 335
    move-object/from16 v31, v3

    .line 336
    .line 337
    move-object/from16 v3, v18

    .line 338
    .line 339
    check-cast v3, La/qt40;

    .line 340
    .line 341
    add-int/lit8 v18, v17, 0x1

    .line 342
    .line 343
    iget v3, v3, La/qt40;->n:I

    .line 344
    .line 345
    aput v3, v14, v17

    .line 346
    .line 347
    move/from16 v17, v18

    .line 348
    .line 349
    move-object/from16 v3, v31

    .line 350
    .line 351
    goto :goto_2

    .line 352
    :cond_1
    move-object/from16 v31, v3

    .line 353
    .line 354
    const/4 v3, 0x0

    .line 355
    const/16 v30, 0x0

    .line 356
    .line 357
    :goto_3
    array-length v14, v2

    .line 358
    if-ge v3, v14, :cond_2

    .line 359
    .line 360
    iget-object v14, v11, La/zr40;->g:[La/kpb;

    .line 361
    .line 362
    const/16 v16, 0x0

    .line 363
    .line 364
    aget-object v14, v14, v16

    .line 365
    .line 366
    move-object/from16 v32, v5

    .line 367
    .line 368
    move/from16 v20, v6

    .line 369
    .line 370
    aget-wide v5, v2, v3

    .line 371
    .line 372
    move-object/from16 v16, v2

    .line 373
    .line 374
    iget-object v2, v11, La/zr40;->m:[D

    .line 375
    .line 376
    invoke-virtual {v14, v5, v6, v2}, La/kpb;->P(D[D)V

    .line 377
    .line 378
    .line 379
    iget-object v2, v11, La/zr40;->c:La/qt40;

    .line 380
    .line 381
    aget-wide v25, v16, v3

    .line 382
    .line 383
    iget-object v5, v11, La/zr40;->l:[I

    .line 384
    .line 385
    iget-object v6, v11, La/zr40;->m:[D

    .line 386
    .line 387
    move-object/from16 v24, v2

    .line 388
    .line 389
    move-object/from16 v27, v5

    .line 390
    .line 391
    move-object/from16 v28, v6

    .line 392
    .line 393
    invoke-virtual/range {v24 .. v30}, La/qt40;->c(D[I[D[FI)V

    .line 394
    .line 395
    .line 396
    add-int/lit8 v30, v30, 0x2

    .line 397
    .line 398
    add-int/lit8 v3, v3, 0x1

    .line 399
    .line 400
    move-object/from16 v2, v16

    .line 401
    .line 402
    move/from16 v6, v20

    .line 403
    .line 404
    move-object/from16 v5, v32

    .line 405
    .line 406
    goto :goto_3

    .line 407
    :cond_2
    move-object/from16 v32, v5

    .line 408
    .line 409
    move/from16 v20, v6

    .line 410
    .line 411
    div-int/lit8 v2, v30, 0x2

    .line 412
    .line 413
    iput v2, v8, La/cry;->b:I

    .line 414
    .line 415
    iget-object v2, v8, La/cry;->c:Ljava/io/Serializable;

    .line 416
    .line 417
    check-cast v2, [F

    .line 418
    .line 419
    const/16 v3, 0x7c

    .line 420
    .line 421
    if-eqz v2, :cond_3

    .line 422
    .line 423
    array-length v2, v2

    .line 424
    if-eq v2, v3, :cond_4

    .line 425
    .line 426
    :cond_3
    new-array v2, v3, [F

    .line 427
    .line 428
    iput-object v2, v8, La/cry;->c:Ljava/io/Serializable;

    .line 429
    .line 430
    new-instance v2, Landroid/graphics/Path;

    .line 431
    .line 432
    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    .line 433
    .line 434
    .line 435
    iput-object v2, v8, La/cry;->e:Ljava/lang/Object;

    .line 436
    .line 437
    :cond_4
    const/high16 v2, 0x3f800000    # 1.0f

    .line 438
    .line 439
    invoke-virtual {v1, v2, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 440
    .line 441
    .line 442
    const/high16 v3, 0x77000000

    .line 443
    .line 444
    invoke-virtual {v10, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v9, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v12, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 454
    .line 455
    .line 456
    iget-object v3, v8, La/cry;->c:Ljava/io/Serializable;

    .line 457
    .line 458
    move-object/from16 v29, v3

    .line 459
    .line 460
    check-cast v29, [F

    .line 461
    .line 462
    iget-object v3, v11, La/zr40;->v:Ljava/util/HashMap;

    .line 463
    .line 464
    const-string v5, "translationX"

    .line 465
    .line 466
    if-nez v3, :cond_5

    .line 467
    .line 468
    const/4 v3, 0x0

    .line 469
    goto :goto_4

    .line 470
    :cond_5
    invoke-virtual {v3, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v3

    .line 474
    check-cast v3, La/zzk0;

    .line 475
    .line 476
    :goto_4
    iget-object v14, v11, La/zr40;->v:Ljava/util/HashMap;

    .line 477
    .line 478
    const-string v6, "translationY"

    .line 479
    .line 480
    if-nez v14, :cond_6

    .line 481
    .line 482
    const/4 v14, 0x0

    .line 483
    :goto_5
    move/from16 v17, v2

    .line 484
    .line 485
    goto :goto_6

    .line 486
    :cond_6
    invoke-virtual {v14, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v14

    .line 490
    check-cast v14, La/zzk0;

    .line 491
    .line 492
    goto :goto_5

    .line 493
    :goto_6
    iget-object v2, v11, La/zr40;->w:Ljava/util/HashMap;

    .line 494
    .line 495
    if-nez v2, :cond_7

    .line 496
    .line 497
    const/4 v2, 0x0

    .line 498
    goto :goto_7

    .line 499
    :cond_7
    invoke-virtual {v2, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v2

    .line 503
    check-cast v2, La/cky;

    .line 504
    .line 505
    :goto_7
    iget-object v5, v11, La/zr40;->w:Ljava/util/HashMap;

    .line 506
    .line 507
    if-nez v5, :cond_8

    .line 508
    .line 509
    const/4 v6, 0x0

    .line 510
    goto :goto_8

    .line 511
    :cond_8
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v5

    .line 515
    move-object v6, v5

    .line 516
    check-cast v6, La/cky;

    .line 517
    .line 518
    :goto_8
    move/from16 v21, v7

    .line 519
    .line 520
    const/4 v5, 0x0

    .line 521
    :goto_9
    const/16 v7, 0x3e

    .line 522
    .line 523
    if-ge v5, v7, :cond_17

    .line 524
    .line 525
    int-to-float v7, v5

    .line 526
    const v16, 0x3c864b8a

    .line 527
    .line 528
    .line 529
    mul-float v16, v16, v7

    .line 530
    .line 531
    iget v7, v11, La/zr40;->k:F

    .line 532
    .line 533
    cmpl-float v18, v7, v17

    .line 534
    .line 535
    if-eqz v18, :cond_b

    .line 536
    .line 537
    move/from16 v18, v5

    .line 538
    .line 539
    iget v5, v11, La/zr40;->j:F

    .line 540
    .line 541
    cmpg-float v19, v16, v5

    .line 542
    .line 543
    if-gez v19, :cond_9

    .line 544
    .line 545
    move/from16 v19, v5

    .line 546
    .line 547
    const/4 v5, 0x0

    .line 548
    goto :goto_a

    .line 549
    :cond_9
    move/from16 v19, v5

    .line 550
    .line 551
    move/from16 v5, v16

    .line 552
    .line 553
    :goto_a
    cmpl-float v16, v5, v19

    .line 554
    .line 555
    move-object/from16 v34, v12

    .line 556
    .line 557
    move/from16 v33, v13

    .line 558
    .line 559
    if-lez v16, :cond_a

    .line 560
    .line 561
    float-to-double v12, v5

    .line 562
    const-wide/high16 v24, 0x3ff0000000000000L    # 1.0

    .line 563
    .line 564
    cmpg-double v12, v12, v24

    .line 565
    .line 566
    if-gez v12, :cond_a

    .line 567
    .line 568
    sub-float v5, v5, v19

    .line 569
    .line 570
    mul-float/2addr v5, v7

    .line 571
    move/from16 v7, v17

    .line 572
    .line 573
    invoke-static {v5, v7}, Ljava/lang/Math;->min(FF)F

    .line 574
    .line 575
    .line 576
    move-result v16

    .line 577
    :goto_b
    move/from16 v5, v16

    .line 578
    .line 579
    goto :goto_c

    .line 580
    :cond_a
    move/from16 v7, v17

    .line 581
    .line 582
    goto :goto_c

    .line 583
    :cond_b
    move/from16 v18, v5

    .line 584
    .line 585
    move-object/from16 v34, v12

    .line 586
    .line 587
    move/from16 v33, v13

    .line 588
    .line 589
    move/from16 v7, v17

    .line 590
    .line 591
    goto :goto_b

    .line 592
    :goto_c
    float-to-double v12, v5

    .line 593
    iget-object v7, v11, La/zr40;->c:La/qt40;

    .line 594
    .line 595
    iget-object v7, v7, La/qt40;->a:La/fhn;

    .line 596
    .line 597
    move-object/from16 v16, v7

    .line 598
    .line 599
    iget-object v7, v11, La/zr40;->r:Ljava/util/ArrayList;

    .line 600
    .line 601
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 602
    .line 603
    .line 604
    move-result-object v7

    .line 605
    const/high16 v19, 0x7fc00000    # Float.NaN

    .line 606
    .line 607
    move-object/from16 v24, v7

    .line 608
    .line 609
    move-object/from16 v7, v16

    .line 610
    .line 611
    const/16 v16, 0x0

    .line 612
    .line 613
    :goto_d
    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->hasNext()Z

    .line 614
    .line 615
    .line 616
    move-result v25

    .line 617
    if-eqz v25, :cond_e

    .line 618
    .line 619
    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v25

    .line 623
    move-wide/from16 v26, v12

    .line 624
    .line 625
    move-object/from16 v12, v25

    .line 626
    .line 627
    check-cast v12, La/qt40;

    .line 628
    .line 629
    iget-object v13, v12, La/qt40;->a:La/fhn;

    .line 630
    .line 631
    if-eqz v13, :cond_d

    .line 632
    .line 633
    move-object/from16 v25, v13

    .line 634
    .line 635
    iget v13, v12, La/qt40;->b:F

    .line 636
    .line 637
    cmpg-float v28, v13, v5

    .line 638
    .line 639
    if-gez v28, :cond_c

    .line 640
    .line 641
    move/from16 v16, v13

    .line 642
    .line 643
    move-object/from16 v7, v25

    .line 644
    .line 645
    goto :goto_e

    .line 646
    :cond_c
    invoke-static/range {v19 .. v19}, Ljava/lang/Float;->isNaN(F)Z

    .line 647
    .line 648
    .line 649
    move-result v13

    .line 650
    if-eqz v13, :cond_d

    .line 651
    .line 652
    iget v12, v12, La/qt40;->b:F

    .line 653
    .line 654
    move/from16 v19, v12

    .line 655
    .line 656
    :cond_d
    :goto_e
    move-wide/from16 v12, v26

    .line 657
    .line 658
    goto :goto_d

    .line 659
    :cond_e
    move-wide/from16 v26, v12

    .line 660
    .line 661
    if-eqz v7, :cond_10

    .line 662
    .line 663
    invoke-static/range {v19 .. v19}, Ljava/lang/Float;->isNaN(F)Z

    .line 664
    .line 665
    .line 666
    move-result v12

    .line 667
    if-eqz v12, :cond_f

    .line 668
    .line 669
    const/high16 v19, 0x3f800000    # 1.0f

    .line 670
    .line 671
    :cond_f
    sub-float v12, v5, v16

    .line 672
    .line 673
    sub-float v19, v19, v16

    .line 674
    .line 675
    div-float v12, v12, v19

    .line 676
    .line 677
    float-to-double v12, v12

    .line 678
    invoke-virtual {v7, v12, v13}, La/fhn;->d(D)D

    .line 679
    .line 680
    .line 681
    move-result-wide v12

    .line 682
    double-to-float v7, v12

    .line 683
    mul-float v7, v7, v19

    .line 684
    .line 685
    add-float v7, v7, v16

    .line 686
    .line 687
    float-to-double v12, v7

    .line 688
    goto :goto_f

    .line 689
    :cond_10
    move-wide/from16 v12, v26

    .line 690
    .line 691
    :goto_f
    iget-object v7, v11, La/zr40;->g:[La/kpb;

    .line 692
    .line 693
    const/16 v35, 0x0

    .line 694
    .line 695
    aget-object v7, v7, v35

    .line 696
    .line 697
    move/from16 p1, v15

    .line 698
    .line 699
    iget-object v15, v11, La/zr40;->m:[D

    .line 700
    .line 701
    invoke-virtual {v7, v12, v13, v15}, La/kpb;->P(D[D)V

    .line 702
    .line 703
    .line 704
    iget-object v7, v11, La/zr40;->h:La/aw3;

    .line 705
    .line 706
    if-eqz v7, :cond_11

    .line 707
    .line 708
    iget-object v15, v11, La/zr40;->m:[D

    .line 709
    .line 710
    move-object/from16 v36, v9

    .line 711
    .line 712
    array-length v9, v15

    .line 713
    if-lez v9, :cond_12

    .line 714
    .line 715
    invoke-virtual {v7, v12, v13, v15}, La/aw3;->P(D[D)V

    .line 716
    .line 717
    .line 718
    goto :goto_10

    .line 719
    :cond_11
    move-object/from16 v36, v9

    .line 720
    .line 721
    :cond_12
    :goto_10
    iget-object v7, v11, La/zr40;->c:La/qt40;

    .line 722
    .line 723
    iget-object v9, v11, La/zr40;->l:[I

    .line 724
    .line 725
    iget-object v15, v11, La/zr40;->m:[D

    .line 726
    .line 727
    mul-int/lit8 v30, v18, 0x2

    .line 728
    .line 729
    move-object/from16 v24, v7

    .line 730
    .line 731
    move-object/from16 v27, v9

    .line 732
    .line 733
    move-wide/from16 v25, v12

    .line 734
    .line 735
    move-object/from16 v28, v15

    .line 736
    .line 737
    invoke-virtual/range {v24 .. v30}, La/qt40;->c(D[I[D[FI)V

    .line 738
    .line 739
    .line 740
    if-eqz v2, :cond_13

    .line 741
    .line 742
    aget v7, v29, v30

    .line 743
    .line 744
    invoke-virtual {v2, v5}, La/cky;->a(F)F

    .line 745
    .line 746
    .line 747
    move-result v9

    .line 748
    add-float/2addr v9, v7

    .line 749
    aput v9, v29, v30

    .line 750
    .line 751
    goto :goto_11

    .line 752
    :cond_13
    if-eqz v3, :cond_14

    .line 753
    .line 754
    aget v7, v29, v30

    .line 755
    .line 756
    invoke-virtual {v3, v5}, La/zzk0;->a(F)F

    .line 757
    .line 758
    .line 759
    move-result v9

    .line 760
    add-float/2addr v9, v7

    .line 761
    aput v9, v29, v30

    .line 762
    .line 763
    :cond_14
    :goto_11
    if-eqz v6, :cond_15

    .line 764
    .line 765
    add-int/lit8 v30, v30, 0x1

    .line 766
    .line 767
    aget v7, v29, v30

    .line 768
    .line 769
    invoke-virtual {v6, v5}, La/cky;->a(F)F

    .line 770
    .line 771
    .line 772
    move-result v5

    .line 773
    add-float/2addr v5, v7

    .line 774
    aput v5, v29, v30

    .line 775
    .line 776
    goto :goto_12

    .line 777
    :cond_15
    if-eqz v14, :cond_16

    .line 778
    .line 779
    add-int/lit8 v30, v30, 0x1

    .line 780
    .line 781
    aget v7, v29, v30

    .line 782
    .line 783
    invoke-virtual {v14, v5}, La/zzk0;->a(F)F

    .line 784
    .line 785
    .line 786
    move-result v5

    .line 787
    add-float/2addr v5, v7

    .line 788
    aput v5, v29, v30

    .line 789
    .line 790
    :cond_16
    :goto_12
    add-int/lit8 v5, v18, 0x1

    .line 791
    .line 792
    move/from16 v15, p1

    .line 793
    .line 794
    move/from16 v13, v33

    .line 795
    .line 796
    move-object/from16 v12, v34

    .line 797
    .line 798
    move-object/from16 v9, v36

    .line 799
    .line 800
    const/high16 v17, 0x3f800000    # 1.0f

    .line 801
    .line 802
    goto/16 :goto_9

    .line 803
    .line 804
    :cond_17
    move-object/from16 v36, v9

    .line 805
    .line 806
    move-object/from16 v34, v12

    .line 807
    .line 808
    move/from16 v33, v13

    .line 809
    .line 810
    move/from16 p1, v15

    .line 811
    .line 812
    const/16 v35, 0x0

    .line 813
    .line 814
    iget-boolean v2, v0, La/ct40;->c:Z

    .line 815
    .line 816
    if-eqz v2, :cond_18

    .line 817
    .line 818
    iget-object v3, v8, La/cry;->c:Ljava/io/Serializable;

    .line 819
    .line 820
    check-cast v3, [F

    .line 821
    .line 822
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 823
    .line 824
    .line 825
    iget-object v5, v8, La/cry;->f:Ljava/lang/Object;

    .line 826
    .line 827
    check-cast v5, Landroid/graphics/Paint;

    .line 828
    .line 829
    invoke-virtual {v1, v3, v5}, Landroid/graphics/Canvas;->drawLines([FLandroid/graphics/Paint;)V

    .line 830
    .line 831
    .line 832
    :cond_18
    iget-boolean v3, v0, La/ct40;->d:Z

    .line 833
    .line 834
    if-eqz v3, :cond_19

    .line 835
    .line 836
    iget v5, v8, La/cry;->b:I

    .line 837
    .line 838
    move-object/from16 v17, v1

    .line 839
    .line 840
    move/from16 v18, v5

    .line 841
    .line 842
    move-object/from16 v16, v8

    .line 843
    .line 844
    move-object/from16 v19, v11

    .line 845
    .line 846
    invoke-virtual/range {v16 .. v21}, La/cry;->a(Landroid/graphics/Canvas;ILa/zr40;II)V

    .line 847
    .line 848
    .line 849
    move-object/from16 v1, v16

    .line 850
    .line 851
    move-object/from16 v5, v17

    .line 852
    .line 853
    :goto_13
    const/16 v6, -0x55cd

    .line 854
    .line 855
    goto :goto_14

    .line 856
    :cond_19
    move-object v5, v1

    .line 857
    move-object v1, v8

    .line 858
    move-object/from16 v19, v11

    .line 859
    .line 860
    goto :goto_13

    .line 861
    :goto_14
    invoke-virtual {v10, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 862
    .line 863
    .line 864
    const v6, -0x1f8a66

    .line 865
    .line 866
    .line 867
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 868
    .line 869
    .line 870
    move-object/from16 v4, v36

    .line 871
    .line 872
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 873
    .line 874
    .line 875
    move-object/from16 v4, v34

    .line 876
    .line 877
    const v14, -0xcc5600

    .line 878
    .line 879
    .line 880
    invoke-virtual {v4, v14}, Landroid/graphics/Paint;->setColor(I)V

    .line 881
    .line 882
    .line 883
    const/high16 v4, -0x40800000    # -1.0f

    .line 884
    .line 885
    invoke-virtual {v5, v4, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 886
    .line 887
    .line 888
    if-eqz v2, :cond_1a

    .line 889
    .line 890
    iget-object v2, v1, La/cry;->c:Ljava/io/Serializable;

    .line 891
    .line 892
    check-cast v2, [F

    .line 893
    .line 894
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 895
    .line 896
    .line 897
    iget-object v4, v1, La/cry;->f:Ljava/lang/Object;

    .line 898
    .line 899
    check-cast v4, Landroid/graphics/Paint;

    .line 900
    .line 901
    invoke-virtual {v5, v2, v4}, Landroid/graphics/Canvas;->drawLines([FLandroid/graphics/Paint;)V

    .line 902
    .line 903
    .line 904
    :cond_1a
    if-eqz v3, :cond_1b

    .line 905
    .line 906
    iget v2, v1, La/cry;->b:I

    .line 907
    .line 908
    move-object/from16 v16, v1

    .line 909
    .line 910
    move/from16 v18, v2

    .line 911
    .line 912
    move-object/from16 v17, v5

    .line 913
    .line 914
    invoke-virtual/range {v16 .. v21}, La/cry;->a(Landroid/graphics/Canvas;ILa/zr40;II)V

    .line 915
    .line 916
    .line 917
    :cond_1b
    add-int/lit8 v9, v33, 0x1

    .line 918
    .line 919
    move/from16 v7, p1

    .line 920
    .line 921
    move-object/from16 v2, v22

    .line 922
    .line 923
    move-object/from16 v1, v23

    .line 924
    .line 925
    move-object/from16 v3, v31

    .line 926
    .line 927
    move-object/from16 v5, v32

    .line 928
    .line 929
    move/from16 v8, v35

    .line 930
    .line 931
    const/4 v4, 0x2

    .line 932
    const/4 v6, 0x0

    .line 933
    goto/16 :goto_0

    .line 934
    .line 935
    :cond_1c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 936
    .line 937
    return-object v0

    .line 938
    nop

    .line 939
    :array_0
    .array-data 4
        0x41200000    # 10.0f
        0x41200000    # 10.0f
    .end array-data

    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    :array_1
    .array-data 4
        0x40800000    # 4.0f
        0x41000000    # 8.0f
    .end array-data
.end method
