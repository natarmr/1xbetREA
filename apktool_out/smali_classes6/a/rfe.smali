.class public final synthetic La/rfe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/ehm0;La/ehm0;La/ehm0;La/db00;La/ehm0;Ljava/util/List;Lkotlin/jvm/functions/Function1;Z)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/rfe;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/rfe;->c:Ljava/lang/Object;

    iput-object p2, p0, La/rfe;->d:Ljava/lang/Object;

    iput-object p3, p0, La/rfe;->e:Ljava/lang/Object;

    iput-object p4, p0, La/rfe;->g:Ljava/lang/Object;

    iput-object p5, p0, La/rfe;->f:Ljava/lang/Object;

    iput-object p6, p0, La/rfe;->h:Ljava/lang/Object;

    iput-object p7, p0, La/rfe;->i:Ljava/lang/Object;

    iput-boolean p8, p0, La/rfe;->b:Z

    return-void
.end method

.method public synthetic constructor <init>(La/t4m;La/w03;La/w03;ZLa/e900;La/e900;La/jge0;La/j4m;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/rfe;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/rfe;->c:Ljava/lang/Object;

    iput-object p2, p0, La/rfe;->d:Ljava/lang/Object;

    iput-object p3, p0, La/rfe;->e:Ljava/lang/Object;

    iput-boolean p4, p0, La/rfe;->b:Z

    iput-object p5, p0, La/rfe;->f:Ljava/lang/Object;

    iput-object p6, p0, La/rfe;->g:Ljava/lang/Object;

    iput-object p7, p0, La/rfe;->h:Ljava/lang/Object;

    iput-object p8, p0, La/rfe;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 40

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/rfe;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/rfe;->i:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, v0, La/rfe;->h:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, La/rfe;->g:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, La/rfe;->f:Ljava/lang/Object;

    .line 12
    .line 13
    iget-boolean v6, v0, La/rfe;->b:Z

    .line 14
    .line 15
    iget-object v7, v0, La/rfe;->e:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v8, v0, La/rfe;->d:Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v0, v0, La/rfe;->c:Ljava/lang/Object;

    .line 20
    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    check-cast v0, La/t4m;

    .line 25
    .line 26
    move-object v12, v8

    .line 27
    check-cast v12, La/w03;

    .line 28
    .line 29
    check-cast v7, La/w03;

    .line 30
    .line 31
    check-cast v5, La/e900;

    .line 32
    .line 33
    check-cast v4, La/e900;

    .line 34
    .line 35
    check-cast v3, La/jge0;

    .line 36
    .line 37
    check-cast v2, La/j4m;

    .line 38
    .line 39
    move-object/from16 v13, p1

    .line 40
    .line 41
    check-cast v13, La/fhl;

    .line 42
    .line 43
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    sget-object v1, La/qmk;->a:La/zcl;

    .line 47
    .line 48
    const/high16 v1, 0x40000000    # 2.0f

    .line 49
    .line 50
    invoke-interface {v13, v1}, La/w6k;->w0(F)F

    .line 51
    .line 52
    .line 53
    move-result v15

    .line 54
    invoke-virtual {v12}, La/w03;->d()La/jge0;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    if-eqz v6, :cond_0

    .line 59
    .line 60
    const/high16 v14, -0x40800000    # -1.0f

    .line 61
    .line 62
    :goto_0
    const/16 p0, 0x1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_0
    const/high16 v14, 0x3f800000    # 1.0f

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :goto_1
    invoke-interface {v13}, La/fhl;->E0()J

    .line 69
    .line 70
    .line 71
    move-result-wide v9

    .line 72
    move/from16 p1, v1

    .line 73
    .line 74
    invoke-interface {v13}, La/fhl;->A0()La/nr;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    move-object/from16 v21, v12

    .line 79
    .line 80
    invoke-virtual {v1}, La/nr;->p()J

    .line 81
    .line 82
    .line 83
    move-result-wide v11

    .line 84
    invoke-virtual {v1}, La/nr;->i()La/x5a;

    .line 85
    .line 86
    .line 87
    move-result-object v17

    .line 88
    invoke-interface/range {v17 .. v17}, La/x5a;->l()V

    .line 89
    .line 90
    .line 91
    move-object/from16 v22, v4

    .line 92
    .line 93
    :try_start_0
    iget-object v4, v1, La/nr;->b:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v4, La/fvt0;

    .line 96
    .line 97
    move-object/from16 v23, v5

    .line 98
    .line 99
    const/high16 v5, 0x3f800000    # 1.0f

    .line 100
    .line 101
    invoke-virtual {v4, v14, v5, v9, v10}, La/fvt0;->z(FFJ)V

    .line 102
    .line 103
    .line 104
    iget v4, v8, La/jge0;->a:F

    .line 105
    .line 106
    iget v5, v3, La/jge0;->b:F

    .line 107
    .line 108
    iget v9, v3, La/jge0;->d:F

    .line 109
    .line 110
    sub-float v26, v5, v15

    .line 111
    .line 112
    iget v5, v3, La/jge0;->c:F

    .line 113
    .line 114
    invoke-virtual {v3}, La/jge0;->e()J

    .line 115
    .line 116
    .line 117
    move-result-wide v16

    .line 118
    const-wide v30, 0xffffffffL

    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    move/from16 v25, v4

    .line 124
    .line 125
    move/from16 v27, v5

    .line 126
    .line 127
    and-long v4, v16, v30

    .line 128
    .line 129
    long-to-int v4, v4

    .line 130
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 131
    .line 132
    .line 133
    move-result v28

    .line 134
    invoke-interface {v13}, La/fhl;->A0()La/nr;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    move v5, v9

    .line 139
    invoke-virtual {v4}, La/nr;->p()J

    .line 140
    .line 141
    .line 142
    move-result-wide v9

    .line 143
    invoke-virtual {v4}, La/nr;->i()La/x5a;

    .line 144
    .line 145
    .line 146
    move-result-object v14

    .line 147
    invoke-interface {v14}, La/x5a;->l()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    .line 148
    .line 149
    .line 150
    :try_start_1
    iget-object v14, v4, La/nr;->b:Ljava/lang/Object;

    .line 151
    .line 152
    move-object/from16 v24, v14

    .line 153
    .line 154
    check-cast v24, La/fvt0;

    .line 155
    .line 156
    const/16 v29, 0x1

    .line 157
    .line 158
    invoke-virtual/range {v24 .. v29}, La/fvt0;->k(FFFFI)V

    .line 159
    .line 160
    .line 161
    iget-object v14, v0, La/t4m;->b:La/s4m;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    .line 162
    .line 163
    move-wide/from16 v24, v11

    .line 164
    .line 165
    :try_start_2
    iget-wide v11, v14, La/s4m;->c:J

    .line 166
    .line 167
    new-instance v14, La/vtm0;

    .line 168
    .line 169
    const/16 v19, 0x0

    .line 170
    .line 171
    const/16 v20, 0x1e

    .line 172
    .line 173
    const/16 v16, 0x0

    .line 174
    .line 175
    const/16 v17, 0x0

    .line 176
    .line 177
    const/16 v18, 0x0

    .line 178
    .line 179
    invoke-direct/range {v14 .. v20}, La/vtm0;-><init>(FFIILa/x03;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 180
    .line 181
    .line 182
    move/from16 v19, v15

    .line 183
    .line 184
    const/16 v17, 0x34

    .line 185
    .line 186
    const/4 v15, 0x0

    .line 187
    move/from16 v27, v5

    .line 188
    .line 189
    move/from16 v26, v6

    .line 190
    .line 191
    move-object/from16 v16, v14

    .line 192
    .line 193
    move-wide/from16 v5, v24

    .line 194
    .line 195
    move-wide/from16 v38, v11

    .line 196
    .line 197
    move-object v11, v13

    .line 198
    move-wide/from16 v13, v38

    .line 199
    .line 200
    move-object/from16 v12, v21

    .line 201
    .line 202
    :try_start_3
    invoke-static/range {v11 .. v17}, La/fhl;->C0(La/fhl;La/w03;JFLa/agc;I)V

    .line 203
    .line 204
    .line 205
    move-object v13, v11

    .line 206
    const/16 v17, 0x0

    .line 207
    .line 208
    const/16 v18, 0x3c

    .line 209
    .line 210
    const/16 v16, 0x0

    .line 211
    .line 212
    move-object v14, v7

    .line 213
    move-object/from16 v15, v23

    .line 214
    .line 215
    invoke-static/range {v13 .. v18}, La/fhl;->K0(La/fhl;La/w03;La/t89;FLa/agc;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 216
    .line 217
    .line 218
    :try_start_4
    invoke-virtual {v4}, La/nr;->i()La/x5a;

    .line 219
    .line 220
    .line 221
    move-result-object v11

    .line 222
    invoke-interface {v11}, La/x5a;->i()V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v4, v9, v10}, La/nr;->H(J)V

    .line 226
    .line 227
    .line 228
    iget v4, v8, La/jge0;->a:F

    .line 229
    .line 230
    invoke-virtual {v3}, La/jge0;->e()J

    .line 231
    .line 232
    .line 233
    move-result-wide v8

    .line 234
    and-long v8, v8, v30

    .line 235
    .line 236
    long-to-int v8, v8

    .line 237
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 238
    .line 239
    .line 240
    move-result v34

    .line 241
    iget v8, v3, La/jge0;->c:F

    .line 242
    .line 243
    add-float v36, v27, v19

    .line 244
    .line 245
    invoke-interface {v13}, La/fhl;->A0()La/nr;

    .line 246
    .line 247
    .line 248
    move-result-object v9

    .line 249
    invoke-virtual {v9}, La/nr;->p()J

    .line 250
    .line 251
    .line 252
    move-result-wide v10

    .line 253
    invoke-virtual {v9}, La/nr;->i()La/x5a;

    .line 254
    .line 255
    .line 256
    move-result-object v14

    .line 257
    invoke-interface {v14}, La/x5a;->l()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 258
    .line 259
    .line 260
    :try_start_5
    iget-object v14, v9, La/nr;->b:Ljava/lang/Object;

    .line 261
    .line 262
    move-object/from16 v32, v14

    .line 263
    .line 264
    check-cast v32, La/fvt0;

    .line 265
    .line 266
    const/16 v37, 0x1

    .line 267
    .line 268
    move/from16 v33, v4

    .line 269
    .line 270
    move/from16 v35, v8

    .line 271
    .line 272
    invoke-virtual/range {v32 .. v37}, La/fvt0;->k(FFFFI)V

    .line 273
    .line 274
    .line 275
    iget-object v0, v0, La/t4m;->c:La/s4m;

    .line 276
    .line 277
    iget-wide v14, v0, La/s4m;->c:J

    .line 278
    .line 279
    new-instance v16, La/vtm0;

    .line 280
    .line 281
    move-wide/from16 v17, v14

    .line 282
    .line 283
    move/from16 v15, v19

    .line 284
    .line 285
    const/16 v19, 0x0

    .line 286
    .line 287
    const/16 v20, 0x1e

    .line 288
    .line 289
    move-object/from16 v14, v16

    .line 290
    .line 291
    const/16 v16, 0x0

    .line 292
    .line 293
    move-wide/from16 v23, v17

    .line 294
    .line 295
    const/16 v17, 0x0

    .line 296
    .line 297
    const/16 v18, 0x0

    .line 298
    .line 299
    invoke-direct/range {v14 .. v20}, La/vtm0;-><init>(FFIILa/x03;I)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 300
    .line 301
    .line 302
    const/16 v17, 0x34

    .line 303
    .line 304
    const/4 v15, 0x0

    .line 305
    move-object v0, v7

    .line 306
    move-wide v7, v10

    .line 307
    move-object v11, v13

    .line 308
    move-object/from16 v16, v14

    .line 309
    .line 310
    move-wide/from16 v13, v23

    .line 311
    .line 312
    :try_start_6
    invoke-static/range {v11 .. v17}, La/fhl;->C0(La/fhl;La/w03;JFLa/agc;I)V

    .line 313
    .line 314
    .line 315
    move-object v13, v11

    .line 316
    const/16 v17, 0x0

    .line 317
    .line 318
    const/16 v18, 0x3c

    .line 319
    .line 320
    const/16 v16, 0x0

    .line 321
    .line 322
    move-object v14, v0

    .line 323
    move-object/from16 v15, v22

    .line 324
    .line 325
    invoke-static/range {v13 .. v18}, La/fhl;->K0(La/fhl;La/w03;La/t89;FLa/agc;I)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 326
    .line 327
    .line 328
    :try_start_7
    invoke-virtual {v9}, La/nr;->i()La/x5a;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    invoke-interface {v0}, La/x5a;->i()V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v9, v7, v8}, La/nr;->H(J)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 336
    .line 337
    .line 338
    invoke-static {v1, v5, v6}, Lc;->g(La/nr;J)V

    .line 339
    .line 340
    .line 341
    iget-object v0, v2, La/j4m;->c:Ljava/util/ArrayList;

    .line 342
    .line 343
    if-eqz v26, :cond_1

    .line 344
    .line 345
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->t0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    :cond_1
    iget v1, v2, La/j4m;->e:F

    .line 350
    .line 351
    const/high16 v2, 0x41000000    # 8.0f

    .line 352
    .line 353
    invoke-interface {v13, v2}, La/w6k;->w0(F)F

    .line 354
    .line 355
    .line 356
    move-result v2

    .line 357
    invoke-interface {v13, v1}, La/w6k;->w0(F)F

    .line 358
    .line 359
    .line 360
    move-result v1

    .line 361
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 362
    .line 363
    .line 364
    move-result-object v4

    .line 365
    const/4 v10, 0x0

    .line 366
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 367
    .line 368
    .line 369
    move-result v5

    .line 370
    if-eqz v5, :cond_6

    .line 371
    .line 372
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v5

    .line 376
    add-int/lit8 v6, v10, 0x1

    .line 377
    .line 378
    if-ltz v10, :cond_5

    .line 379
    .line 380
    move-object v14, v5

    .line 381
    check-cast v14, La/a9q0;

    .line 382
    .line 383
    int-to-float v5, v10

    .line 384
    mul-float/2addr v5, v1

    .line 385
    iget-wide v7, v14, La/a9q0;->c:J

    .line 386
    .line 387
    const/16 v9, 0x20

    .line 388
    .line 389
    shr-long/2addr v7, v9

    .line 390
    long-to-int v7, v7

    .line 391
    int-to-float v7, v7

    .line 392
    div-float v7, v7, p1

    .line 393
    .line 394
    sub-float v7, v5, v7

    .line 395
    .line 396
    if-nez v10, :cond_2

    .line 397
    .line 398
    const/4 v7, 0x0

    .line 399
    goto :goto_3

    .line 400
    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 401
    .line 402
    .line 403
    move-result v8

    .line 404
    add-int/lit8 v8, v8, -0x1

    .line 405
    .line 406
    if-ne v10, v8, :cond_4

    .line 407
    .line 408
    iget-wide v10, v14, La/a9q0;->c:J

    .line 409
    .line 410
    shr-long/2addr v10, v9

    .line 411
    long-to-int v8, v10

    .line 412
    int-to-float v8, v8

    .line 413
    div-float v10, v8, p1

    .line 414
    .line 415
    add-float/2addr v10, v5

    .line 416
    iget v5, v3, La/jge0;->c:F

    .line 417
    .line 418
    cmpl-float v10, v5, v10

    .line 419
    .line 420
    if-lez v10, :cond_3

    .line 421
    .line 422
    goto :goto_3

    .line 423
    :cond_3
    sub-float v7, v5, v8

    .line 424
    .line 425
    :cond_4
    :goto_3
    sget-object v5, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 426
    .line 427
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite40-0d7_KjU()J

    .line 428
    .line 429
    .line 430
    move-result-wide v15

    .line 431
    add-float v5, v27, v2

    .line 432
    .line 433
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 434
    .line 435
    .line 436
    move-result v7

    .line 437
    int-to-long v7, v7

    .line 438
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 439
    .line 440
    .line 441
    move-result v5

    .line 442
    int-to-long v10, v5

    .line 443
    shl-long/2addr v7, v9

    .line 444
    and-long v9, v10, v30

    .line 445
    .line 446
    or-long v17, v7, v9

    .line 447
    .line 448
    const/16 v19, 0xf8

    .line 449
    .line 450
    invoke-static/range {v13 .. v19}, La/v2n0;->o(La/fhl;La/a9q0;JJI)V

    .line 451
    .line 452
    .line 453
    move v10, v6

    .line 454
    goto :goto_2

    .line 455
    :cond_5
    invoke-static {}, La/q3d;->p()V

    .line 456
    .line 457
    .line 458
    const/4 v0, 0x0

    .line 459
    throw v0

    .line 460
    :cond_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 461
    .line 462
    return-object v0

    .line 463
    :catchall_0
    move-exception v0

    .line 464
    goto :goto_6

    .line 465
    :catchall_1
    move-exception v0

    .line 466
    goto :goto_4

    .line 467
    :catchall_2
    move-exception v0

    .line 468
    move-wide v7, v10

    .line 469
    :goto_4
    :try_start_8
    invoke-virtual {v9}, La/nr;->i()La/x5a;

    .line 470
    .line 471
    .line 472
    move-result-object v2

    .line 473
    invoke-interface {v2}, La/x5a;->i()V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v9, v7, v8}, La/nr;->H(J)V

    .line 477
    .line 478
    .line 479
    throw v0

    .line 480
    :catchall_3
    move-exception v0

    .line 481
    goto :goto_5

    .line 482
    :catchall_4
    move-exception v0

    .line 483
    move-wide/from16 v5, v24

    .line 484
    .line 485
    goto :goto_5

    .line 486
    :catchall_5
    move-exception v0

    .line 487
    move-wide v5, v11

    .line 488
    :goto_5
    invoke-virtual {v4}, La/nr;->i()La/x5a;

    .line 489
    .line 490
    .line 491
    move-result-object v2

    .line 492
    invoke-interface {v2}, La/x5a;->i()V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v4, v9, v10}, La/nr;->H(J)V

    .line 496
    .line 497
    .line 498
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 499
    :catchall_6
    move-exception v0

    .line 500
    move-wide v5, v11

    .line 501
    :goto_6
    invoke-static {v1, v5, v6}, Lc;->g(La/nr;J)V

    .line 502
    .line 503
    .line 504
    throw v0

    .line 505
    :pswitch_0
    move/from16 v26, v6

    .line 506
    .line 507
    const/16 p0, 0x1

    .line 508
    .line 509
    check-cast v0, La/ehm0;

    .line 510
    .line 511
    check-cast v8, La/ehm0;

    .line 512
    .line 513
    check-cast v7, La/ehm0;

    .line 514
    .line 515
    check-cast v4, La/db00;

    .line 516
    .line 517
    check-cast v5, La/ehm0;

    .line 518
    .line 519
    check-cast v3, Ljava/util/List;

    .line 520
    .line 521
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 522
    .line 523
    move-object/from16 v9, p1

    .line 524
    .line 525
    check-cast v9, La/xdz;

    .line 526
    .line 527
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 528
    .line 529
    .line 530
    iget-boolean v1, v0, La/ehm0;->b:Z

    .line 531
    .line 532
    if-eqz v1, :cond_7

    .line 533
    .line 534
    new-instance v1, La/kfe;

    .line 535
    .line 536
    move/from16 v6, v26

    .line 537
    .line 538
    const/4 v10, 0x0

    .line 539
    invoke-direct {v1, v2, v0, v6, v10}, La/kfe;-><init>(Lkotlin/jvm/functions/Function1;La/ehm0;ZB)V

    .line 540
    .line 541
    .line 542
    new-instance v0, La/ugd;

    .line 543
    .line 544
    const v11, -0x704fa765

    .line 545
    .line 546
    .line 547
    move/from16 v12, p0

    .line 548
    .line 549
    invoke-direct {v0, v11, v12, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 550
    .line 551
    .line 552
    invoke-static {v9, v0}, La/xdz;->d(La/xdz;La/ugd;)V

    .line 553
    .line 554
    .line 555
    goto :goto_7

    .line 556
    :cond_7
    const/4 v10, 0x0

    .line 557
    move/from16 v12, p0

    .line 558
    .line 559
    move/from16 v6, v26

    .line 560
    .line 561
    :goto_7
    iget-boolean v0, v8, La/ehm0;->b:Z

    .line 562
    .line 563
    if-eqz v0, :cond_8

    .line 564
    .line 565
    new-instance v0, La/lfe;

    .line 566
    .line 567
    invoke-direct {v0, v8, v2, v10}, La/lfe;-><init>(La/ehm0;Lkotlin/jvm/functions/Function1;B)V

    .line 568
    .line 569
    .line 570
    new-instance v1, La/ugd;

    .line 571
    .line 572
    const v8, 0x763e0604

    .line 573
    .line 574
    .line 575
    invoke-direct {v1, v8, v12, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 576
    .line 577
    .line 578
    invoke-static {v9, v1}, La/xdz;->d(La/xdz;La/ugd;)V

    .line 579
    .line 580
    .line 581
    :cond_8
    iget-boolean v0, v7, La/ehm0;->b:Z

    .line 582
    .line 583
    if-eqz v0, :cond_9

    .line 584
    .line 585
    new-instance v0, La/kfe;

    .line 586
    .line 587
    const/4 v1, 0x2

    .line 588
    invoke-direct {v0, v7, v6, v2, v1}, La/kfe;-><init>(La/ehm0;ZLkotlin/jvm/functions/Function1;B)V

    .line 589
    .line 590
    .line 591
    new-instance v1, La/ugd;

    .line 592
    .line 593
    const v7, 0x70b9c1e3

    .line 594
    .line 595
    .line 596
    invoke-direct {v1, v7, v12, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 597
    .line 598
    .line 599
    invoke-static {v9, v1}, La/xdz;->d(La/xdz;La/ugd;)V

    .line 600
    .line 601
    .line 602
    :cond_9
    invoke-interface {v4}, La/db00;->a()Z

    .line 603
    .line 604
    .line 605
    move-result v0

    .line 606
    if-eqz v0, :cond_a

    .line 607
    .line 608
    new-instance v0, La/mfe;

    .line 609
    .line 610
    const/4 v10, 0x0

    .line 611
    invoke-direct {v0, v4, v6, v2, v10}, La/mfe;-><init>(La/db00;ZLkotlin/jvm/functions/Function1;B)V

    .line 612
    .line 613
    .line 614
    new-instance v1, La/ugd;

    .line 615
    .line 616
    const v4, 0x6b357dc2

    .line 617
    .line 618
    .line 619
    invoke-direct {v1, v4, v12, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 620
    .line 621
    .line 622
    invoke-static {v9, v1}, La/xdz;->d(La/xdz;La/ugd;)V

    .line 623
    .line 624
    .line 625
    :cond_a
    iget-boolean v0, v5, La/ehm0;->b:Z

    .line 626
    .line 627
    if-eqz v0, :cond_b

    .line 628
    .line 629
    new-instance v0, La/kfe;

    .line 630
    .line 631
    const/4 v1, 0x3

    .line 632
    invoke-direct {v0, v5, v6, v2, v1}, La/kfe;-><init>(La/ehm0;ZLkotlin/jvm/functions/Function1;B)V

    .line 633
    .line 634
    .line 635
    new-instance v1, La/ugd;

    .line 636
    .line 637
    const v4, 0x65b139a1

    .line 638
    .line 639
    .line 640
    invoke-direct {v1, v4, v12, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 641
    .line 642
    .line 643
    invoke-static {v9, v1}, La/xdz;->d(La/xdz;La/ugd;)V

    .line 644
    .line 645
    .line 646
    :cond_b
    new-instance v0, La/bqd;

    .line 647
    .line 648
    const/4 v1, 0x4

    .line 649
    invoke-direct {v0, v1}, La/bqd;-><init>(B)V

    .line 650
    .line 651
    .line 652
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 653
    .line 654
    .line 655
    move-result v10

    .line 656
    new-instance v11, La/at7;

    .line 657
    .line 658
    const/16 v1, 0x1b

    .line 659
    .line 660
    invoke-direct {v11, v0, v3, v1}, La/at7;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 661
    .line 662
    .line 663
    new-instance v12, La/dx8;

    .line 664
    .line 665
    const/16 v0, 0x15

    .line 666
    .line 667
    invoke-direct {v12, v3, v0}, La/dx8;-><init>(Ljava/util/List;B)V

    .line 668
    .line 669
    .line 670
    new-instance v0, La/vb;

    .line 671
    .line 672
    const/16 v1, 0x16

    .line 673
    .line 674
    invoke-direct {v0, v3, v2, v1}, La/vb;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 675
    .line 676
    .line 677
    new-instance v14, La/ugd;

    .line 678
    .line 679
    const v1, -0x5768657b

    .line 680
    .line 681
    .line 682
    const/4 v2, 0x1

    .line 683
    invoke-direct {v14, v1, v2, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 684
    .line 685
    .line 686
    const/4 v13, 0x0

    .line 687
    invoke-virtual/range {v9 .. v14}, La/xdz;->e(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ebz;La/ugd;)V

    .line 688
    .line 689
    .line 690
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 691
    .line 692
    return-object v0

    .line 693
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
