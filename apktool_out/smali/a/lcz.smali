.class public final La/lcz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ibz;


# instance fields
.field public final synthetic a:La/xcz;

.field public final synthetic b:Z

.field public final synthetic c:La/hh80;

.field public final synthetic d:Z

.field public final synthetic e:Lkotlin/jvm/functions/Function0;

.field public final synthetic f:La/sw3;

.field public final synthetic g:La/ow3;

.field public final synthetic h:La/vne;

.field public final synthetic i:La/afv;

.field public final synthetic j:La/g9m0;

.field public final synthetic k:La/xx7;

.field public final synthetic l:La/yx7;


# direct methods
.method public constructor <init>(La/xcz;ZLa/hh80;ZLa/eiy;La/sw3;La/ow3;La/vne;La/afv;La/g9m0;La/xx7;La/yx7;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/lcz;->a:La/xcz;

    .line 5
    .line 6
    iput-boolean p2, p0, La/lcz;->b:Z

    .line 7
    .line 8
    iput-object p3, p0, La/lcz;->c:La/hh80;

    .line 9
    .line 10
    iput-boolean p4, p0, La/lcz;->d:Z

    .line 11
    .line 12
    iput-object p5, p0, La/lcz;->e:Lkotlin/jvm/functions/Function0;

    .line 13
    .line 14
    iput-object p6, p0, La/lcz;->f:La/sw3;

    .line 15
    .line 16
    iput-object p7, p0, La/lcz;->g:La/ow3;

    .line 17
    .line 18
    iput-object p8, p0, La/lcz;->h:La/vne;

    .line 19
    .line 20
    iput-object p9, p0, La/lcz;->i:La/afv;

    .line 21
    .line 22
    iput-object p10, p0, La/lcz;->j:La/g9m0;

    .line 23
    .line 24
    iput-object p11, p0, La/lcz;->k:La/xx7;

    .line 25
    .line 26
    iput-object p12, p0, La/lcz;->l:La/yx7;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final a(La/jbz;J)La/uj30;
    .locals 64

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v9, p1

    .line 4
    .line 5
    move-wide/from16 v1, p2

    .line 6
    .line 7
    iget-object v3, v9, La/jbz;->b:La/c5n0;

    .line 8
    .line 9
    iget-object v4, v0, La/lcz;->a:La/xcz;

    .line 10
    .line 11
    iget-object v5, v4, La/xcz;->t:La/pz40;

    .line 12
    .line 13
    invoke-interface {v5}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    iget-boolean v5, v4, La/xcz;->b:Z

    .line 17
    .line 18
    const/16 v21, 0x1

    .line 19
    .line 20
    if-nez v5, :cond_1

    .line 21
    .line 22
    invoke-interface {v3}, La/cnx;->M()Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-eqz v5, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/16 v32, 0x0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    move/from16 v32, v21

    .line 33
    .line 34
    :goto_1
    iget-boolean v5, v0, La/lcz;->b:Z

    .line 35
    .line 36
    if-eqz v5, :cond_2

    .line 37
    .line 38
    sget-object v7, La/ma80;->a:La/ma80;

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_2
    sget-object v7, La/ma80;->b:La/ma80;

    .line 42
    .line 43
    :goto_2
    invoke-static {v1, v2, v7}, La/d5c;->H(JLa/ma80;)V

    .line 44
    .line 45
    .line 46
    iget-object v7, v0, La/lcz;->c:La/hh80;

    .line 47
    .line 48
    if-eqz v5, :cond_3

    .line 49
    .line 50
    invoke-interface {v3}, La/cnx;->getLayoutDirection()La/k6z;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    invoke-interface {v7, v8}, La/hh80;->b(La/k6z;)F

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    invoke-interface {v3, v8}, La/w6k;->T(F)I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    goto :goto_3

    .line 63
    :cond_3
    invoke-interface {v3}, La/cnx;->getLayoutDirection()La/k6z;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    invoke-static {v7, v8}, La/s5x0;->B(La/hh80;La/k6z;)F

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    invoke-interface {v3, v8}, La/w6k;->T(F)I

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    :goto_3
    if-eqz v5, :cond_4

    .line 76
    .line 77
    invoke-interface {v3}, La/cnx;->getLayoutDirection()La/k6z;

    .line 78
    .line 79
    .line 80
    move-result-object v10

    .line 81
    invoke-interface {v7, v10}, La/hh80;->c(La/k6z;)F

    .line 82
    .line 83
    .line 84
    move-result v10

    .line 85
    invoke-interface {v3, v10}, La/w6k;->T(F)I

    .line 86
    .line 87
    .line 88
    move-result v10

    .line 89
    goto :goto_4

    .line 90
    :cond_4
    invoke-interface {v3}, La/cnx;->getLayoutDirection()La/k6z;

    .line 91
    .line 92
    .line 93
    move-result-object v10

    .line 94
    invoke-static {v7, v10}, La/s5x0;->A(La/hh80;La/k6z;)F

    .line 95
    .line 96
    .line 97
    move-result v10

    .line 98
    invoke-interface {v3, v10}, La/w6k;->T(F)I

    .line 99
    .line 100
    .line 101
    move-result v10

    .line 102
    :goto_4
    invoke-interface {v7}, La/hh80;->d()F

    .line 103
    .line 104
    .line 105
    move-result v11

    .line 106
    invoke-interface {v3, v11}, La/w6k;->T(F)I

    .line 107
    .line 108
    .line 109
    move-result v11

    .line 110
    invoke-interface {v7}, La/hh80;->a()F

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    invoke-interface {v3, v7}, La/w6k;->T(F)I

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    add-int v12, v11, v7

    .line 119
    .line 120
    add-int v13, v8, v10

    .line 121
    .line 122
    if-eqz v5, :cond_5

    .line 123
    .line 124
    move v14, v12

    .line 125
    goto :goto_5

    .line 126
    :cond_5
    move v14, v13

    .line 127
    :goto_5
    iget-boolean v15, v0, La/lcz;->d:Z

    .line 128
    .line 129
    if-eqz v5, :cond_6

    .line 130
    .line 131
    if-nez v15, :cond_6

    .line 132
    .line 133
    move/from16 v27, v11

    .line 134
    .line 135
    goto :goto_6

    .line 136
    :cond_6
    if-eqz v5, :cond_7

    .line 137
    .line 138
    if-eqz v15, :cond_7

    .line 139
    .line 140
    move/from16 v27, v7

    .line 141
    .line 142
    goto :goto_6

    .line 143
    :cond_7
    if-nez v5, :cond_8

    .line 144
    .line 145
    if-nez v15, :cond_8

    .line 146
    .line 147
    move/from16 v27, v8

    .line 148
    .line 149
    goto :goto_6

    .line 150
    :cond_8
    move/from16 v27, v10

    .line 151
    .line 152
    :goto_6
    sub-int v19, v14, v27

    .line 153
    .line 154
    neg-int v7, v13

    .line 155
    neg-int v10, v12

    .line 156
    invoke-static {v7, v10, v1, v2}, La/r4e;->i(IIJ)J

    .line 157
    .line 158
    .line 159
    move-result-wide v14

    .line 160
    iget-object v7, v0, La/lcz;->e:Lkotlin/jvm/functions/Function0;

    .line 161
    .line 162
    invoke-interface {v7}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    check-cast v7, La/icz;

    .line 167
    .line 168
    iget-object v10, v7, La/icz;->c:La/g9z;

    .line 169
    .line 170
    invoke-static {v14, v15}, La/p4e;->i(J)I

    .line 171
    .line 172
    .line 173
    move-result v6

    .line 174
    invoke-static {v14, v15}, La/p4e;->h(J)I

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    iget-object v2, v10, La/g9z;->a:La/cgk0;

    .line 179
    .line 180
    invoke-virtual {v2, v6}, La/cgk0;->m(I)V

    .line 181
    .line 182
    .line 183
    iget-object v2, v10, La/g9z;->b:La/cgk0;

    .line 184
    .line 185
    invoke-virtual {v2, v1}, La/cgk0;->m(I)V

    .line 186
    .line 187
    .line 188
    iget-object v1, v0, La/lcz;->g:La/ow3;

    .line 189
    .line 190
    const-string v17, "null verticalArrangement when isVertical == true"

    .line 191
    .line 192
    iget-object v2, v0, La/lcz;->f:La/sw3;

    .line 193
    .line 194
    if-eqz v5, :cond_a

    .line 195
    .line 196
    if-eqz v2, :cond_9

    .line 197
    .line 198
    invoke-interface {v2}, La/sw3;->a()F

    .line 199
    .line 200
    .line 201
    move-result v6

    .line 202
    goto :goto_7

    .line 203
    :cond_9
    invoke-static/range {v17 .. v17}, La/w6x;->i(Ljava/lang/String;)La/rsy;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    throw v0

    .line 208
    :cond_a
    if-eqz v1, :cond_6c

    .line 209
    .line 210
    invoke-interface {v1}, La/ow3;->a()F

    .line 211
    .line 212
    .line 213
    move-result v6

    .line 214
    :goto_7
    invoke-interface {v3, v6}, La/w6k;->T(F)I

    .line 215
    .line 216
    .line 217
    move-result v20

    .line 218
    move v6, v5

    .line 219
    move-object v5, v7

    .line 220
    invoke-virtual {v5}, La/icz;->b()I

    .line 221
    .line 222
    .line 223
    move-result v7

    .line 224
    if-eqz v6, :cond_b

    .line 225
    .line 226
    invoke-static/range {p2 .. p3}, La/p4e;->h(J)I

    .line 227
    .line 228
    .line 229
    move-result v10

    .line 230
    sub-int/2addr v10, v12

    .line 231
    goto :goto_8

    .line 232
    :cond_b
    invoke-static/range {p2 .. p3}, La/p4e;->i(J)I

    .line 233
    .line 234
    .line 235
    move-result v10

    .line 236
    sub-int/2addr v10, v13

    .line 237
    :goto_8
    const-wide v37, 0xffffffffL

    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    const/16 v18, 0x20

    .line 243
    .line 244
    move-object/from16 v22, v1

    .line 245
    .line 246
    iget-boolean v1, v0, La/lcz;->d:Z

    .line 247
    .line 248
    if-eqz v1, :cond_e

    .line 249
    .line 250
    if-lez v10, :cond_c

    .line 251
    .line 252
    goto :goto_a

    .line 253
    :cond_c
    if-eqz v6, :cond_d

    .line 254
    .line 255
    goto :goto_9

    .line 256
    :cond_d
    add-int/2addr v8, v10

    .line 257
    :goto_9
    if-eqz v6, :cond_e

    .line 258
    .line 259
    add-int/2addr v11, v10

    .line 260
    :cond_e
    :goto_a
    move/from16 v23, v1

    .line 261
    .line 262
    move-object v6, v2

    .line 263
    int-to-long v1, v8

    .line 264
    shl-long v1, v1, v18

    .line 265
    .line 266
    move-wide/from16 v24, v1

    .line 267
    .line 268
    int-to-long v1, v11

    .line 269
    and-long v1, v1, v37

    .line 270
    .line 271
    or-long v1, v24, v1

    .line 272
    .line 273
    new-instance v28, La/kcz;

    .line 274
    .line 275
    move v8, v10

    .line 276
    iget-object v10, v0, La/lcz;->l:La/yx7;

    .line 277
    .line 278
    iget-object v11, v0, La/lcz;->a:La/xcz;

    .line 279
    .line 280
    move-object/from16 v24, v4

    .line 281
    .line 282
    iget-boolean v4, v0, La/lcz;->b:Z

    .line 283
    .line 284
    iget-object v9, v0, La/lcz;->k:La/xx7;

    .line 285
    .line 286
    move-object/from16 v40, v3

    .line 287
    .line 288
    move-object/from16 v42, v6

    .line 289
    .line 290
    move/from16 v41, v8

    .line 291
    .line 292
    move-object/from16 v16, v11

    .line 293
    .line 294
    move/from16 v8, v20

    .line 295
    .line 296
    move/from16 v11, v23

    .line 297
    .line 298
    move-object/from16 v43, v24

    .line 299
    .line 300
    move-object/from16 v6, p1

    .line 301
    .line 302
    move/from16 v20, v13

    .line 303
    .line 304
    move/from16 v13, v19

    .line 305
    .line 306
    move/from16 v19, v12

    .line 307
    .line 308
    move/from16 v12, v27

    .line 309
    .line 310
    move-wide/from16 v62, v1

    .line 311
    .line 312
    move-object/from16 v1, v28

    .line 313
    .line 314
    move-wide v2, v14

    .line 315
    move-wide/from16 v14, v62

    .line 316
    .line 317
    invoke-direct/range {v1 .. v16}, La/kcz;-><init>(JZLa/icz;La/jbz;IILa/xx7;La/yx7;ZIIJLa/xcz;)V

    .line 318
    .line 319
    .line 320
    move v10, v7

    .line 321
    move/from16 v9, v20

    .line 322
    .line 323
    move/from16 v20, v8

    .line 324
    .line 325
    move-wide v7, v2

    .line 326
    iget-object v2, v1, La/kcz;->c:La/icz;

    .line 327
    .line 328
    iget-object v3, v2, La/icz;->d:Landroidx/compose/foundation/lazy/layout/c;

    .line 329
    .line 330
    invoke-static {}, La/vdx;->J()La/rfk0;

    .line 331
    .line 332
    .line 333
    move-result-object v4

    .line 334
    const/16 v44, 0x0

    .line 335
    .line 336
    if-eqz v4, :cond_f

    .line 337
    .line 338
    invoke-virtual {v4}, La/rfk0;->e()Lkotlin/jvm/functions/Function1;

    .line 339
    .line 340
    .line 341
    move-result-object v6

    .line 342
    goto :goto_b

    .line 343
    :cond_f
    move-object/from16 v6, v44

    .line 344
    .line 345
    :goto_b
    invoke-static {v4}, La/vdx;->W(La/rfk0;)La/rfk0;

    .line 346
    .line 347
    .line 348
    move-result-object v11

    .line 349
    :try_start_0
    invoke-virtual/range {v43 .. v43}, La/xcz;->h()I

    .line 350
    .line 351
    .line 352
    move-result v14

    .line 353
    move-object/from16 v28, v1

    .line 354
    .line 355
    move-object/from16 v15, v43

    .line 356
    .line 357
    iget-object v1, v15, La/xcz;->e:La/t8z;

    .line 358
    .line 359
    move-object/from16 v16, v2

    .line 360
    .line 361
    iget-object v2, v1, La/t8z;->e:Ljava/lang/Object;

    .line 362
    .line 363
    invoke-static {v14, v5, v2}, La/k9x;->J(ILa/hbz;Ljava/lang/Object;)I

    .line 364
    .line 365
    .line 366
    move-result v2

    .line 367
    if-eq v14, v2, :cond_10

    .line 368
    .line 369
    move-object/from16 v27, v3

    .line 370
    .line 371
    iget-object v3, v1, La/t8z;->b:La/cgk0;

    .line 372
    .line 373
    invoke-virtual {v3, v2}, La/cgk0;->m(I)V

    .line 374
    .line 375
    .line 376
    iget-object v1, v1, La/t8z;->f:La/lbz;

    .line 377
    .line 378
    invoke-virtual {v1, v14}, La/lbz;->b(I)V

    .line 379
    .line 380
    .line 381
    goto :goto_c

    .line 382
    :cond_10
    move-object/from16 v27, v3

    .line 383
    .line 384
    :goto_c
    invoke-virtual {v15}, La/xcz;->i()I

    .line 385
    .line 386
    .line 387
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 388
    invoke-static {v4, v11, v6}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 389
    .line 390
    .line 391
    iget-object v3, v15, La/xcz;->s:La/qbz;

    .line 392
    .line 393
    iget-object v4, v15, La/xcz;->p:La/hru;

    .line 394
    .line 395
    invoke-static {v5, v3, v4}, La/c9x;->t(La/hbz;La/qbz;La/hru;)Landroidx/collection/MutableIntList;

    .line 396
    .line 397
    .line 398
    move-result-object v3

    .line 399
    invoke-interface/range {v40 .. v40}, La/cnx;->M()Z

    .line 400
    .line 401
    .line 402
    move-result v4

    .line 403
    if-nez v4, :cond_12

    .line 404
    .line 405
    if-nez v32, :cond_11

    .line 406
    .line 407
    goto :goto_d

    .line 408
    :cond_11
    iget-object v4, v15, La/xcz;->x:La/ieu;

    .line 409
    .line 410
    iget-object v4, v4, La/ieu;->c:Ljava/lang/Object;

    .line 411
    .line 412
    check-cast v4, La/l73;

    .line 413
    .line 414
    iget-object v4, v4, La/l73;->b:La/pz40;

    .line 415
    .line 416
    check-cast v4, La/hgk0;

    .line 417
    .line 418
    invoke-virtual {v4}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v4

    .line 422
    check-cast v4, Ljava/lang/Number;

    .line 423
    .line 424
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 425
    .line 426
    .line 427
    move-result v4

    .line 428
    goto :goto_e

    .line 429
    :cond_12
    :goto_d
    iget v4, v15, La/xcz;->h:F

    .line 430
    .line 431
    :goto_e
    iget-object v5, v15, La/xcz;->o:La/dbz;

    .line 432
    .line 433
    invoke-interface/range {v40 .. v40}, La/cnx;->M()Z

    .line 434
    .line 435
    .line 436
    move-result v30

    .line 437
    iget-object v11, v15, La/xcz;->w:La/pz40;

    .line 438
    .line 439
    iget-boolean v14, v15, La/xcz;->i:Z

    .line 440
    .line 441
    if-ltz v12, :cond_13

    .line 442
    .line 443
    goto :goto_f

    .line 444
    :cond_13
    const-string v6, "invalid beforeContentPadding"

    .line 445
    .line 446
    invoke-static {v6}, La/adx;->a(Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    :goto_f
    if-ltz v13, :cond_14

    .line 450
    .line 451
    goto :goto_10

    .line 452
    :cond_14
    const-string v6, "invalid afterContentPadding"

    .line 453
    .line 454
    invoke-static {v6}, La/adx;->a(Ljava/lang/String;)V

    .line 455
    .line 456
    .line 457
    :goto_10
    iget-boolean v6, v0, La/lcz;->b:Z

    .line 458
    .line 459
    move/from16 v23, v1

    .line 460
    .line 461
    iget-boolean v1, v0, La/lcz;->d:Z

    .line 462
    .line 463
    move/from16 v43, v1

    .line 464
    .line 465
    iget-object v1, v0, La/lcz;->h:La/vne;

    .line 466
    .line 467
    move-object/from16 v35, v1

    .line 468
    .line 469
    iget-object v1, v0, La/lcz;->i:La/afv;

    .line 470
    .line 471
    move/from16 v45, v13

    .line 472
    .line 473
    move/from16 v24, v14

    .line 474
    .line 475
    const-wide/16 v13, 0x0

    .line 476
    .line 477
    if-gtz v10, :cond_17

    .line 478
    .line 479
    invoke-static {v7, v8}, La/p4e;->k(J)I

    .line 480
    .line 481
    .line 482
    move-result v24

    .line 483
    invoke-static {v7, v8}, La/p4e;->j(J)I

    .line 484
    .line 485
    .line 486
    move-result v25

    .line 487
    new-instance v26, Ljava/util/ArrayList;

    .line 488
    .line 489
    invoke-direct/range {v26 .. v26}, Ljava/util/ArrayList;-><init>()V

    .line 490
    .line 491
    .line 492
    const/16 v33, 0x0

    .line 493
    .line 494
    const/16 v34, 0x0

    .line 495
    .line 496
    const/16 v23, 0x0

    .line 497
    .line 498
    const/16 v31, 0x1

    .line 499
    .line 500
    move-object/from16 v36, v1

    .line 501
    .line 502
    move-object/from16 v22, v5

    .line 503
    .line 504
    move/from16 v29, v6

    .line 505
    .line 506
    invoke-virtual/range {v22 .. v36}, La/dbz;->d(IIILjava/util/ArrayList;Landroidx/compose/foundation/lazy/layout/c;La/p4;ZZIZIILa/vne;La/afv;)V

    .line 507
    .line 508
    .line 509
    move-object/from16 v26, v22

    .line 510
    .line 511
    move-object/from16 v0, v28

    .line 512
    .line 513
    if-nez v30, :cond_15

    .line 514
    .line 515
    invoke-virtual/range {v26 .. v26}, La/dbz;->b()J

    .line 516
    .line 517
    .line 518
    move-result-wide v1

    .line 519
    invoke-static {v1, v2, v13, v14}, La/qkx;->a(JJ)Z

    .line 520
    .line 521
    .line 522
    move-result v3

    .line 523
    if-nez v3, :cond_15

    .line 524
    .line 525
    shr-long v3, v1, v18

    .line 526
    .line 527
    long-to-int v3, v3

    .line 528
    invoke-static {v3, v7, v8}, La/r4e;->g(IJ)I

    .line 529
    .line 530
    .line 531
    move-result v24

    .line 532
    and-long v1, v1, v37

    .line 533
    .line 534
    long-to-int v1, v1

    .line 535
    invoke-static {v1, v7, v8}, La/r4e;->f(IJ)I

    .line 536
    .line 537
    .line 538
    move-result v25

    .line 539
    :cond_15
    new-instance v1, La/z8z;

    .line 540
    .line 541
    const/4 v2, 0x3

    .line 542
    invoke-direct {v1, v2}, La/z8z;-><init>(B)V

    .line 543
    .line 544
    .line 545
    add-int v2, v24, v9

    .line 546
    .line 547
    move-wide/from16 v5, p2

    .line 548
    .line 549
    invoke-static {v2, v5, v6}, La/r4e;->g(IJ)I

    .line 550
    .line 551
    .line 552
    move-result v2

    .line 553
    add-int v3, v25, v19

    .line 554
    .line 555
    invoke-static {v3, v5, v6}, La/r4e;->f(IJ)I

    .line 556
    .line 557
    .line 558
    move-result v3

    .line 559
    sget-object v4, La/lun;->a:La/lun;

    .line 560
    .line 561
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 562
    .line 563
    .line 564
    move-object/from16 v5, v40

    .line 565
    .line 566
    invoke-interface {v5, v2, v3, v4, v1}, La/vj30;->i0(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)La/uj30;

    .line 567
    .line 568
    .line 569
    move-result-object v1

    .line 570
    sget-object v13, La/iun;->a:La/iun;

    .line 571
    .line 572
    neg-int v14, v12

    .line 573
    move/from16 v8, v41

    .line 574
    .line 575
    add-int v10, v8, v45

    .line 576
    .line 577
    if-eqz v29, :cond_16

    .line 578
    .line 579
    sget-object v2, La/ma80;->a:La/ma80;

    .line 580
    .line 581
    :goto_11
    move-object/from16 v18, v2

    .line 582
    .line 583
    goto :goto_12

    .line 584
    :cond_16
    sget-object v2, La/ma80;->b:La/ma80;

    .line 585
    .line 586
    goto :goto_11

    .line 587
    :goto_12
    new-instance v2, La/mcz;

    .line 588
    .line 589
    const/4 v12, 0x0

    .line 590
    move-object/from16 v3, v16

    .line 591
    .line 592
    const/16 v16, 0x0

    .line 593
    .line 594
    move-object/from16 v40, v5

    .line 595
    .line 596
    move-object v5, v1

    .line 597
    const/4 v1, 0x0

    .line 598
    move-object v4, v2

    .line 599
    const/4 v2, 0x0

    .line 600
    move-object v6, v3

    .line 601
    const/4 v3, 0x0

    .line 602
    move-object v7, v4

    .line 603
    const/4 v4, 0x0

    .line 604
    move-object v8, v6

    .line 605
    const/4 v6, 0x0

    .line 606
    move-object v9, v7

    .line 607
    const/4 v7, 0x0

    .line 608
    move-object/from16 v24, v15

    .line 609
    .line 610
    move v15, v10

    .line 611
    iget-wide v10, v0, La/kcz;->e:J

    .line 612
    .line 613
    move-object/from16 v52, v0

    .line 614
    .line 615
    move-object/from16 v54, v8

    .line 616
    .line 617
    move-object v0, v9

    .line 618
    move-object/from16 v53, v24

    .line 619
    .line 620
    move-object/from16 v8, v35

    .line 621
    .line 622
    move-object/from16 v51, v40

    .line 623
    .line 624
    move/from16 v17, v43

    .line 625
    .line 626
    move/from16 v19, v45

    .line 627
    .line 628
    move-object/from16 v9, p1

    .line 629
    .line 630
    invoke-direct/range {v0 .. v20}, La/mcz;-><init>(La/ncz;IZFLa/uj30;FZLa/vne;La/w6k;JILjava/util/List;IIIZLa/ma80;II)V

    .line 631
    .line 632
    .line 633
    move-object/from16 v61, v52

    .line 634
    .line 635
    :goto_13
    move-object v2, v0

    .line 636
    goto/16 :goto_52

    .line 637
    .line 638
    :cond_17
    move-object/from16 v36, v1

    .line 639
    .line 640
    move-object/from16 v26, v5

    .line 641
    .line 642
    move/from16 v29, v6

    .line 643
    .line 644
    move-object/from16 v53, v15

    .line 645
    .line 646
    move-object/from16 v54, v16

    .line 647
    .line 648
    move/from16 v15, v19

    .line 649
    .line 650
    move-object/from16 v52, v28

    .line 651
    .line 652
    move-object/from16 v51, v40

    .line 653
    .line 654
    move/from16 v13, v41

    .line 655
    .line 656
    move/from16 v19, v45

    .line 657
    .line 658
    move-object/from16 v1, p1

    .line 659
    .line 660
    move-wide/from16 v5, p2

    .line 661
    .line 662
    if-lt v2, v10, :cond_18

    .line 663
    .line 664
    add-int/lit8 v2, v10, -0x1

    .line 665
    .line 666
    const/16 v23, 0x0

    .line 667
    .line 668
    :cond_18
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 669
    .line 670
    .line 671
    move-result v14

    .line 672
    sub-int v16, v23, v14

    .line 673
    .line 674
    if-nez v2, :cond_19

    .line 675
    .line 676
    if-gez v16, :cond_19

    .line 677
    .line 678
    add-int v14, v14, v16

    .line 679
    .line 680
    const/16 v16, 0x0

    .line 681
    .line 682
    :cond_19
    move/from16 v55, v9

    .line 683
    .line 684
    new-instance v9, La/xw3;

    .line 685
    .line 686
    invoke-direct {v9}, La/xw3;-><init>()V

    .line 687
    .line 688
    .line 689
    move/from16 v23, v14

    .line 690
    .line 691
    neg-int v14, v12

    .line 692
    if-gez v20, :cond_1a

    .line 693
    .line 694
    move/from16 v25, v20

    .line 695
    .line 696
    :goto_14
    move/from16 v28, v2

    .line 697
    .line 698
    goto :goto_15

    .line 699
    :cond_1a
    const/16 v25, 0x0

    .line 700
    .line 701
    goto :goto_14

    .line 702
    :goto_15
    add-int v2, v14, v25

    .line 703
    .line 704
    add-int v16, v16, v2

    .line 705
    .line 706
    move/from16 v56, v14

    .line 707
    .line 708
    move/from16 v5, v16

    .line 709
    .line 710
    move-object/from16 v6, v52

    .line 711
    .line 712
    move/from16 v16, v4

    .line 713
    .line 714
    move/from16 v52, v15

    .line 715
    .line 716
    const/4 v4, 0x0

    .line 717
    :goto_16
    iget-wide v14, v6, La/kcz;->e:J

    .line 718
    .line 719
    if-gez v5, :cond_1b

    .line 720
    .line 721
    if-lez v28, :cond_1b

    .line 722
    .line 723
    move-object/from16 v46, v11

    .line 724
    .line 725
    add-int/lit8 v11, v28, -0x1

    .line 726
    .line 727
    invoke-virtual {v6, v11, v14, v15}, La/kcz;->n1(IJ)La/ncz;

    .line 728
    .line 729
    .line 730
    move-result-object v14

    .line 731
    const/4 v15, 0x0

    .line 732
    invoke-virtual {v9, v15, v14}, La/xw3;->add(ILjava/lang/Object;)V

    .line 733
    .line 734
    .line 735
    iget v15, v14, La/ncz;->v:I

    .line 736
    .line 737
    invoke-static {v4, v15}, Ljava/lang/Math;->max(II)I

    .line 738
    .line 739
    .line 740
    move-result v4

    .line 741
    invoke-virtual {v14}, La/ncz;->m()I

    .line 742
    .line 743
    .line 744
    move-result v14

    .line 745
    add-int/2addr v5, v14

    .line 746
    move/from16 v28, v11

    .line 747
    .line 748
    move-object/from16 v11, v46

    .line 749
    .line 750
    goto :goto_16

    .line 751
    :cond_1b
    move-object/from16 v46, v11

    .line 752
    .line 753
    const/4 v11, 0x0

    .line 754
    if-ge v5, v2, :cond_1c

    .line 755
    .line 756
    sub-int v5, v2, v5

    .line 757
    .line 758
    sub-int v5, v23, v5

    .line 759
    .line 760
    move/from16 v57, v5

    .line 761
    .line 762
    move v5, v2

    .line 763
    goto :goto_17

    .line 764
    :cond_1c
    move/from16 v57, v23

    .line 765
    .line 766
    :goto_17
    sub-int/2addr v5, v2

    .line 767
    add-int v39, v13, v19

    .line 768
    .line 769
    if-gez v39, :cond_1d

    .line 770
    .line 771
    :goto_18
    move/from16 v23, v4

    .line 772
    .line 773
    goto :goto_19

    .line 774
    :cond_1d
    move/from16 v11, v39

    .line 775
    .line 776
    goto :goto_18

    .line 777
    :goto_19
    neg-int v4, v5

    .line 778
    move/from16 v25, v5

    .line 779
    .line 780
    move/from16 v33, v28

    .line 781
    .line 782
    const/4 v5, 0x0

    .line 783
    const/16 v31, 0x0

    .line 784
    .line 785
    :goto_1a
    iget v0, v9, La/xw3;->c:I

    .line 786
    .line 787
    if-ge v5, v0, :cond_1f

    .line 788
    .line 789
    if-lt v4, v11, :cond_1e

    .line 790
    .line 791
    invoke-virtual {v9, v5}, La/xw3;->e(I)Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    move/from16 v31, v21

    .line 795
    .line 796
    goto :goto_1a

    .line 797
    :cond_1e
    add-int/lit8 v33, v33, 0x1

    .line 798
    .line 799
    invoke-virtual {v9, v5}, La/xw3;->get(I)Ljava/lang/Object;

    .line 800
    .line 801
    .line 802
    move-result-object v0

    .line 803
    check-cast v0, La/ncz;

    .line 804
    .line 805
    invoke-virtual {v0}, La/ncz;->m()I

    .line 806
    .line 807
    .line 808
    move-result v0

    .line 809
    add-int/2addr v0, v4

    .line 810
    add-int/lit8 v5, v5, 0x1

    .line 811
    .line 812
    move v4, v0

    .line 813
    goto :goto_1a

    .line 814
    :cond_1f
    move/from16 v0, v23

    .line 815
    .line 816
    move/from16 v59, v31

    .line 817
    .line 818
    move/from16 v5, v33

    .line 819
    .line 820
    :goto_1b
    if-ge v5, v10, :cond_23

    .line 821
    .line 822
    if-lt v4, v11, :cond_20

    .line 823
    .line 824
    if-lez v4, :cond_20

    .line 825
    .line 826
    invoke-virtual {v9}, La/xw3;->isEmpty()Z

    .line 827
    .line 828
    .line 829
    move-result v23

    .line 830
    if-eqz v23, :cond_23

    .line 831
    .line 832
    :cond_20
    move/from16 v23, v11

    .line 833
    .line 834
    invoke-virtual {v6, v5, v14, v15}, La/kcz;->n1(IJ)La/ncz;

    .line 835
    .line 836
    .line 837
    move-result-object v11

    .line 838
    invoke-virtual {v11}, La/ncz;->m()I

    .line 839
    .line 840
    .line 841
    move-result v31

    .line 842
    add-int v4, v31, v4

    .line 843
    .line 844
    if-gt v4, v2, :cond_21

    .line 845
    .line 846
    move/from16 v31, v2

    .line 847
    .line 848
    add-int/lit8 v2, v10, -0x1

    .line 849
    .line 850
    if-eq v5, v2, :cond_22

    .line 851
    .line 852
    add-int/lit8 v2, v5, 0x1

    .line 853
    .line 854
    invoke-virtual {v11}, La/ncz;->m()I

    .line 855
    .line 856
    .line 857
    move-result v11

    .line 858
    sub-int v25, v25, v11

    .line 859
    .line 860
    move/from16 v28, v2

    .line 861
    .line 862
    move/from16 v59, v21

    .line 863
    .line 864
    goto :goto_1c

    .line 865
    :cond_21
    move/from16 v31, v2

    .line 866
    .line 867
    :cond_22
    iget v2, v11, La/ncz;->v:I

    .line 868
    .line 869
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 870
    .line 871
    .line 872
    move-result v0

    .line 873
    invoke-virtual {v9, v11}, La/xw3;->addLast(Ljava/lang/Object;)V

    .line 874
    .line 875
    .line 876
    :goto_1c
    add-int/lit8 v5, v5, 0x1

    .line 877
    .line 878
    move/from16 v11, v23

    .line 879
    .line 880
    move/from16 v2, v31

    .line 881
    .line 882
    goto :goto_1b

    .line 883
    :cond_23
    if-ge v4, v13, :cond_26

    .line 884
    .line 885
    sub-int v2, v13, v4

    .line 886
    .line 887
    sub-int v25, v25, v2

    .line 888
    .line 889
    add-int/2addr v4, v2

    .line 890
    move/from16 v11, v25

    .line 891
    .line 892
    :goto_1d
    if-ge v11, v12, :cond_24

    .line 893
    .line 894
    if-lez v28, :cond_24

    .line 895
    .line 896
    move/from16 v23, v2

    .line 897
    .line 898
    add-int/lit8 v2, v28, -0x1

    .line 899
    .line 900
    move/from16 v25, v4

    .line 901
    .line 902
    invoke-virtual {v6, v2, v14, v15}, La/kcz;->n1(IJ)La/ncz;

    .line 903
    .line 904
    .line 905
    move-result-object v4

    .line 906
    move/from16 v28, v2

    .line 907
    .line 908
    const/4 v2, 0x0

    .line 909
    invoke-virtual {v9, v2, v4}, La/xw3;->add(ILjava/lang/Object;)V

    .line 910
    .line 911
    .line 912
    iget v2, v4, La/ncz;->v:I

    .line 913
    .line 914
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 915
    .line 916
    .line 917
    move-result v0

    .line 918
    invoke-virtual {v4}, La/ncz;->m()I

    .line 919
    .line 920
    .line 921
    move-result v2

    .line 922
    add-int/2addr v11, v2

    .line 923
    move/from16 v2, v23

    .line 924
    .line 925
    move/from16 v4, v25

    .line 926
    .line 927
    goto :goto_1d

    .line 928
    :cond_24
    move/from16 v23, v2

    .line 929
    .line 930
    move/from16 v25, v4

    .line 931
    .line 932
    move/from16 v2, v57

    .line 933
    .line 934
    add-int v57, v2, v23

    .line 935
    .line 936
    if-gez v11, :cond_25

    .line 937
    .line 938
    add-int v57, v57, v11

    .line 939
    .line 940
    add-int v4, v25, v11

    .line 941
    .line 942
    move/from16 v23, v0

    .line 943
    .line 944
    move v11, v4

    .line 945
    move/from16 v0, v28

    .line 946
    .line 947
    move/from16 v25, v57

    .line 948
    .line 949
    const/4 v4, 0x0

    .line 950
    goto :goto_1e

    .line 951
    :cond_25
    move/from16 v23, v0

    .line 952
    .line 953
    move v4, v11

    .line 954
    move/from16 v11, v25

    .line 955
    .line 956
    move/from16 v0, v28

    .line 957
    .line 958
    move/from16 v25, v57

    .line 959
    .line 960
    goto :goto_1e

    .line 961
    :cond_26
    move/from16 v2, v57

    .line 962
    .line 963
    move/from16 v23, v0

    .line 964
    .line 965
    move v11, v4

    .line 966
    move/from16 v4, v25

    .line 967
    .line 968
    move/from16 v0, v28

    .line 969
    .line 970
    move/from16 v25, v2

    .line 971
    .line 972
    :goto_1e
    invoke-static/range {v16 .. v16}, Ljava/lang/Math;->round(F)I

    .line 973
    .line 974
    .line 975
    move-result v28

    .line 976
    move/from16 v31, v5

    .line 977
    .line 978
    invoke-static/range {v28 .. v28}, Ljava/lang/Integer;->signum(I)I

    .line 979
    .line 980
    .line 981
    move-result v5

    .line 982
    move/from16 v45, v12

    .line 983
    .line 984
    invoke-static/range {v25 .. v25}, Ljava/lang/Integer;->signum(I)I

    .line 985
    .line 986
    .line 987
    move-result v12

    .line 988
    if-ne v5, v12, :cond_27

    .line 989
    .line 990
    invoke-static/range {v16 .. v16}, Ljava/lang/Math;->round(F)I

    .line 991
    .line 992
    .line 993
    move-result v5

    .line 994
    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    .line 995
    .line 996
    .line 997
    move-result v5

    .line 998
    invoke-static/range {v25 .. v25}, Ljava/lang/Math;->abs(I)I

    .line 999
    .line 1000
    .line 1001
    move-result v12

    .line 1002
    if-lt v5, v12, :cond_27

    .line 1003
    .line 1004
    move/from16 v5, v25

    .line 1005
    .line 1006
    int-to-float v12, v5

    .line 1007
    goto :goto_1f

    .line 1008
    :cond_27
    move/from16 v5, v25

    .line 1009
    .line 1010
    move/from16 v12, v16

    .line 1011
    .line 1012
    :goto_1f
    sub-float v16, v16, v12

    .line 1013
    .line 1014
    const/16 v25, 0x0

    .line 1015
    .line 1016
    if-eqz v30, :cond_28

    .line 1017
    .line 1018
    if-le v5, v2, :cond_28

    .line 1019
    .line 1020
    cmpg-float v28, v16, v25

    .line 1021
    .line 1022
    if-gtz v28, :cond_28

    .line 1023
    .line 1024
    sub-int v2, v5, v2

    .line 1025
    .line 1026
    int-to-float v2, v2

    .line 1027
    add-float v25, v2, v16

    .line 1028
    .line 1029
    :cond_28
    move/from16 v16, v25

    .line 1030
    .line 1031
    if-ltz v4, :cond_29

    .line 1032
    .line 1033
    goto :goto_20

    .line 1034
    :cond_29
    const-string v2, "negative currentFirstItemScrollOffset"

    .line 1035
    .line 1036
    invoke-static {v2}, La/adx;->a(Ljava/lang/String;)V

    .line 1037
    .line 1038
    .line 1039
    :goto_20
    neg-int v2, v4

    .line 1040
    invoke-virtual {v9}, La/xw3;->first()Ljava/lang/Object;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v5

    .line 1044
    check-cast v5, La/ncz;

    .line 1045
    .line 1046
    if-gtz v45, :cond_2a

    .line 1047
    .line 1048
    if-gez v20, :cond_2b

    .line 1049
    .line 1050
    :cond_2a
    move/from16 v25, v2

    .line 1051
    .line 1052
    goto :goto_22

    .line 1053
    :cond_2b
    move/from16 v25, v2

    .line 1054
    .line 1055
    move-object v2, v5

    .line 1056
    :goto_21
    move/from16 v33, v4

    .line 1057
    .line 1058
    const/4 v4, 0x0

    .line 1059
    goto :goto_24

    .line 1060
    :goto_22
    invoke-virtual {v9}, La/xw3;->b()I

    .line 1061
    .line 1062
    .line 1063
    move-result v2

    .line 1064
    move-object/from16 v28, v5

    .line 1065
    .line 1066
    const/4 v5, 0x0

    .line 1067
    :goto_23
    if-ge v5, v2, :cond_2c

    .line 1068
    .line 1069
    invoke-virtual {v9, v5}, La/xw3;->get(I)Ljava/lang/Object;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v33

    .line 1073
    check-cast v33, La/ncz;

    .line 1074
    .line 1075
    move/from16 v34, v2

    .line 1076
    .line 1077
    invoke-virtual/range {v33 .. v33}, La/ncz;->m()I

    .line 1078
    .line 1079
    .line 1080
    move-result v2

    .line 1081
    if-eqz v4, :cond_2c

    .line 1082
    .line 1083
    if-gt v2, v4, :cond_2c

    .line 1084
    .line 1085
    invoke-virtual {v9}, La/xw3;->b()I

    .line 1086
    .line 1087
    .line 1088
    move-result v33

    .line 1089
    move/from16 v47, v2

    .line 1090
    .line 1091
    add-int/lit8 v2, v33, -0x1

    .line 1092
    .line 1093
    if-eq v5, v2, :cond_2c

    .line 1094
    .line 1095
    sub-int v4, v4, v47

    .line 1096
    .line 1097
    add-int/lit8 v5, v5, 0x1

    .line 1098
    .line 1099
    invoke-virtual {v9, v5}, La/xw3;->get(I)Ljava/lang/Object;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v2

    .line 1103
    move-object/from16 v28, v2

    .line 1104
    .line 1105
    check-cast v28, La/ncz;

    .line 1106
    .line 1107
    move/from16 v2, v34

    .line 1108
    .line 1109
    goto :goto_23

    .line 1110
    :cond_2c
    move-object/from16 v2, v28

    .line 1111
    .line 1112
    goto :goto_21

    .line 1113
    :goto_24
    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    .line 1114
    .line 1115
    .line 1116
    move-result v5

    .line 1117
    add-int/lit8 v0, v0, -0x1

    .line 1118
    .line 1119
    if-gt v5, v0, :cond_2e

    .line 1120
    .line 1121
    move-object/from16 v28, v44

    .line 1122
    .line 1123
    :goto_25
    if-nez v28, :cond_2d

    .line 1124
    .line 1125
    new-instance v28, Ljava/util/ArrayList;

    .line 1126
    .line 1127
    invoke-direct/range {v28 .. v28}, Ljava/util/ArrayList;-><init>()V

    .line 1128
    .line 1129
    .line 1130
    :cond_2d
    move/from16 v57, v10

    .line 1131
    .line 1132
    move-object/from16 v4, v28

    .line 1133
    .line 1134
    invoke-virtual {v6, v0, v14, v15}, La/kcz;->n1(IJ)La/ncz;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v10

    .line 1138
    invoke-interface {v4, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1139
    .line 1140
    .line 1141
    if-eq v0, v5, :cond_2f

    .line 1142
    .line 1143
    add-int/lit8 v0, v0, -0x1

    .line 1144
    .line 1145
    move-object/from16 v28, v4

    .line 1146
    .line 1147
    move/from16 v10, v57

    .line 1148
    .line 1149
    const/4 v4, 0x0

    .line 1150
    goto :goto_25

    .line 1151
    :cond_2e
    move/from16 v57, v10

    .line 1152
    .line 1153
    move-object/from16 v4, v44

    .line 1154
    .line 1155
    :cond_2f
    iget-object v0, v3, Landroidx/collection/MutableIntList;->a:[I

    .line 1156
    .line 1157
    iget v10, v3, Landroidx/collection/MutableIntList;->b:I

    .line 1158
    .line 1159
    add-int/lit8 v10, v10, -0x1

    .line 1160
    .line 1161
    move-object/from16 v28, v0

    .line 1162
    .line 1163
    :goto_26
    const/4 v0, -0x1

    .line 1164
    if-ge v0, v10, :cond_32

    .line 1165
    .line 1166
    aget v0, v28, v10

    .line 1167
    .line 1168
    if-ge v0, v5, :cond_31

    .line 1169
    .line 1170
    if-nez v4, :cond_30

    .line 1171
    .line 1172
    new-instance v4, Ljava/util/ArrayList;

    .line 1173
    .line 1174
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1175
    .line 1176
    .line 1177
    :cond_30
    invoke-virtual {v6, v0, v14, v15}, La/kcz;->n1(IJ)La/ncz;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v0

    .line 1181
    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1182
    .line 1183
    .line 1184
    :cond_31
    add-int/lit8 v10, v10, -0x1

    .line 1185
    .line 1186
    goto :goto_26

    .line 1187
    :cond_32
    if-nez v4, :cond_33

    .line 1188
    .line 1189
    sget-object v4, La/iun;->a:La/iun;

    .line 1190
    .line 1191
    :cond_33
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 1192
    .line 1193
    .line 1194
    move-result v0

    .line 1195
    move/from16 v5, v23

    .line 1196
    .line 1197
    const/4 v10, 0x0

    .line 1198
    :goto_27
    if-ge v10, v0, :cond_34

    .line 1199
    .line 1200
    invoke-interface {v4, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v23

    .line 1204
    move/from16 v28, v0

    .line 1205
    .line 1206
    move-object/from16 v0, v23

    .line 1207
    .line 1208
    check-cast v0, La/ncz;

    .line 1209
    .line 1210
    iget v0, v0, La/ncz;->v:I

    .line 1211
    .line 1212
    invoke-static {v5, v0}, Ljava/lang/Math;->max(II)I

    .line 1213
    .line 1214
    .line 1215
    move-result v5

    .line 1216
    add-int/lit8 v10, v10, 0x1

    .line 1217
    .line 1218
    move/from16 v0, v28

    .line 1219
    .line 1220
    goto :goto_27

    .line 1221
    :cond_34
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v0

    .line 1225
    check-cast v0, La/ncz;

    .line 1226
    .line 1227
    iget v0, v0, La/ncz;->a:I

    .line 1228
    .line 1229
    add-int/lit8 v10, v57, -0x1

    .line 1230
    .line 1231
    invoke-static {v0, v10}, Ljava/lang/Math;->min(II)I

    .line 1232
    .line 1233
    .line 1234
    move-result v0

    .line 1235
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v10

    .line 1239
    check-cast v10, La/ncz;

    .line 1240
    .line 1241
    iget v10, v10, La/ncz;->a:I

    .line 1242
    .line 1243
    add-int/lit8 v10, v10, 0x1

    .line 1244
    .line 1245
    if-gt v10, v0, :cond_36

    .line 1246
    .line 1247
    move-object/from16 v23, v44

    .line 1248
    .line 1249
    :goto_28
    if-nez v23, :cond_35

    .line 1250
    .line 1251
    new-instance v23, Ljava/util/ArrayList;

    .line 1252
    .line 1253
    invoke-direct/range {v23 .. v23}, Ljava/util/ArrayList;-><init>()V

    .line 1254
    .line 1255
    .line 1256
    :cond_35
    move/from16 v28, v5

    .line 1257
    .line 1258
    move/from16 v60, v12

    .line 1259
    .line 1260
    move-object/from16 v5, v23

    .line 1261
    .line 1262
    invoke-virtual {v6, v10, v14, v15}, La/kcz;->n1(IJ)La/ncz;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v12

    .line 1266
    invoke-interface {v5, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1267
    .line 1268
    .line 1269
    if-eq v10, v0, :cond_37

    .line 1270
    .line 1271
    add-int/lit8 v10, v10, 0x1

    .line 1272
    .line 1273
    move-object/from16 v23, v5

    .line 1274
    .line 1275
    move/from16 v5, v28

    .line 1276
    .line 1277
    move/from16 v12, v60

    .line 1278
    .line 1279
    goto :goto_28

    .line 1280
    :cond_36
    move/from16 v28, v5

    .line 1281
    .line 1282
    move/from16 v60, v12

    .line 1283
    .line 1284
    move-object/from16 v5, v44

    .line 1285
    .line 1286
    :cond_37
    if-eqz v5, :cond_38

    .line 1287
    .line 1288
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v10

    .line 1292
    check-cast v10, La/ncz;

    .line 1293
    .line 1294
    iget v10, v10, La/ncz;->a:I

    .line 1295
    .line 1296
    if-le v10, v0, :cond_38

    .line 1297
    .line 1298
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 1299
    .line 1300
    .line 1301
    move-result-object v0

    .line 1302
    check-cast v0, La/ncz;

    .line 1303
    .line 1304
    iget v0, v0, La/ncz;->a:I

    .line 1305
    .line 1306
    :cond_38
    iget-object v10, v3, Landroidx/collection/MutableIntList;->a:[I

    .line 1307
    .line 1308
    iget v3, v3, Landroidx/collection/MutableIntList;->b:I

    .line 1309
    .line 1310
    const/4 v12, 0x0

    .line 1311
    :goto_29
    if-ge v12, v3, :cond_3b

    .line 1312
    .line 1313
    move/from16 v23, v3

    .line 1314
    .line 1315
    aget v3, v10, v12

    .line 1316
    .line 1317
    if-le v3, v0, :cond_3a

    .line 1318
    .line 1319
    if-nez v5, :cond_39

    .line 1320
    .line 1321
    new-instance v5, Ljava/util/ArrayList;

    .line 1322
    .line 1323
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1324
    .line 1325
    .line 1326
    :cond_39
    invoke-virtual {v6, v3, v14, v15}, La/kcz;->n1(IJ)La/ncz;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v3

    .line 1330
    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1331
    .line 1332
    .line 1333
    :cond_3a
    add-int/lit8 v12, v12, 0x1

    .line 1334
    .line 1335
    move/from16 v3, v23

    .line 1336
    .line 1337
    goto :goto_29

    .line 1338
    :cond_3b
    if-nez v5, :cond_3c

    .line 1339
    .line 1340
    sget-object v5, La/iun;->a:La/iun;

    .line 1341
    .line 1342
    :cond_3c
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 1343
    .line 1344
    .line 1345
    move-result v0

    .line 1346
    move/from16 v3, v28

    .line 1347
    .line 1348
    const/4 v10, 0x0

    .line 1349
    :goto_2a
    if-ge v10, v0, :cond_3d

    .line 1350
    .line 1351
    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1352
    .line 1353
    .line 1354
    move-result-object v12

    .line 1355
    check-cast v12, La/ncz;

    .line 1356
    .line 1357
    iget v12, v12, La/ncz;->v:I

    .line 1358
    .line 1359
    invoke-static {v3, v12}, Ljava/lang/Math;->max(II)I

    .line 1360
    .line 1361
    .line 1362
    move-result v3

    .line 1363
    add-int/lit8 v10, v10, 0x1

    .line 1364
    .line 1365
    goto :goto_2a

    .line 1366
    :cond_3d
    invoke-virtual {v9}, La/xw3;->first()Ljava/lang/Object;

    .line 1367
    .line 1368
    .line 1369
    move-result-object v0

    .line 1370
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1371
    .line 1372
    .line 1373
    move-result v0

    .line 1374
    if-eqz v0, :cond_3e

    .line 1375
    .line 1376
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 1377
    .line 1378
    .line 1379
    move-result v0

    .line 1380
    if-eqz v0, :cond_3e

    .line 1381
    .line 1382
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 1383
    .line 1384
    .line 1385
    move-result v0

    .line 1386
    if-eqz v0, :cond_3e

    .line 1387
    .line 1388
    move/from16 v0, v21

    .line 1389
    .line 1390
    goto :goto_2b

    .line 1391
    :cond_3e
    const/4 v0, 0x0

    .line 1392
    :goto_2b
    if-eqz v29, :cond_3f

    .line 1393
    .line 1394
    move v10, v3

    .line 1395
    goto :goto_2c

    .line 1396
    :cond_3f
    move v10, v11

    .line 1397
    :goto_2c
    invoke-static {v10, v7, v8}, La/r4e;->g(IJ)I

    .line 1398
    .line 1399
    .line 1400
    move-result v10

    .line 1401
    if-eqz v29, :cond_40

    .line 1402
    .line 1403
    move v3, v11

    .line 1404
    :cond_40
    invoke-static {v3, v7, v8}, La/r4e;->f(IJ)I

    .line 1405
    .line 1406
    .line 1407
    move-result v12

    .line 1408
    if-eqz v29, :cond_41

    .line 1409
    .line 1410
    move v3, v12

    .line 1411
    goto :goto_2d

    .line 1412
    :cond_41
    move v3, v10

    .line 1413
    :goto_2d
    invoke-static {v3, v13}, Ljava/lang/Math;->min(II)I

    .line 1414
    .line 1415
    .line 1416
    move-result v14

    .line 1417
    if-ge v11, v14, :cond_42

    .line 1418
    .line 1419
    move/from16 v14, v21

    .line 1420
    .line 1421
    goto :goto_2e

    .line 1422
    :cond_42
    const/4 v14, 0x0

    .line 1423
    :goto_2e
    if-eqz v14, :cond_44

    .line 1424
    .line 1425
    if-nez v25, :cond_43

    .line 1426
    .line 1427
    goto :goto_2f

    .line 1428
    :cond_43
    const-string v15, "non-zero itemsScrollOffset"

    .line 1429
    .line 1430
    invoke-static {v15}, La/adx;->c(Ljava/lang/String;)V

    .line 1431
    .line 1432
    .line 1433
    :cond_44
    :goto_2f
    new-instance v15, Ljava/util/ArrayList;

    .line 1434
    .line 1435
    invoke-virtual {v9}, La/xw3;->b()I

    .line 1436
    .line 1437
    .line 1438
    move-result v23

    .line 1439
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 1440
    .line 1441
    .line 1442
    move-result v28

    .line 1443
    add-int v28, v28, v23

    .line 1444
    .line 1445
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 1446
    .line 1447
    .line 1448
    move-result v23

    .line 1449
    move/from16 v47, v0

    .line 1450
    .line 1451
    add-int v0, v23, v28

    .line 1452
    .line 1453
    invoke-direct {v15, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 1454
    .line 1455
    .line 1456
    if-eqz v14, :cond_50

    .line 1457
    .line 1458
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 1459
    .line 1460
    .line 1461
    move-result v0

    .line 1462
    if-eqz v0, :cond_45

    .line 1463
    .line 1464
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 1465
    .line 1466
    .line 1467
    move-result v0

    .line 1468
    if-eqz v0, :cond_45

    .line 1469
    .line 1470
    goto :goto_30

    .line 1471
    :cond_45
    const-string v0, "no extra items"

    .line 1472
    .line 1473
    invoke-static {v0}, La/adx;->a(Ljava/lang/String;)V

    .line 1474
    .line 1475
    .line 1476
    :goto_30
    invoke-virtual {v9}, La/xw3;->b()I

    .line 1477
    .line 1478
    .line 1479
    move-result v0

    .line 1480
    new-array v4, v0, [I

    .line 1481
    .line 1482
    const/4 v5, 0x0

    .line 1483
    :goto_31
    if-ge v5, v0, :cond_47

    .line 1484
    .line 1485
    if-nez v43, :cond_46

    .line 1486
    .line 1487
    move v14, v5

    .line 1488
    goto :goto_32

    .line 1489
    :cond_46
    sub-int v14, v0, v5

    .line 1490
    .line 1491
    add-int/lit8 v14, v14, -0x1

    .line 1492
    .line 1493
    :goto_32
    invoke-virtual {v9, v14}, La/xw3;->get(I)Ljava/lang/Object;

    .line 1494
    .line 1495
    .line 1496
    move-result-object v14

    .line 1497
    check-cast v14, La/ncz;

    .line 1498
    .line 1499
    iget v14, v14, La/ncz;->q:I

    .line 1500
    .line 1501
    aput v14, v4, v5

    .line 1502
    .line 1503
    add-int/lit8 v5, v5, 0x1

    .line 1504
    .line 1505
    goto :goto_31

    .line 1506
    :cond_47
    move-object/from16 v28, v6

    .line 1507
    .line 1508
    new-array v6, v0, [I

    .line 1509
    .line 1510
    if-eqz v29, :cond_49

    .line 1511
    .line 1512
    move-object/from16 v5, v42

    .line 1513
    .line 1514
    if-eqz v5, :cond_48

    .line 1515
    .line 1516
    invoke-interface {v5, v1, v3, v4, v6}, La/sw3;->c(La/w6k;I[I[I)V

    .line 1517
    .line 1518
    .line 1519
    move-object/from16 v17, v2

    .line 1520
    .line 1521
    move/from16 v14, v31

    .line 1522
    .line 1523
    const/16 v58, 0x0

    .line 1524
    .line 1525
    goto :goto_33

    .line 1526
    :cond_48
    invoke-static/range {v17 .. v17}, La/w6x;->i(Ljava/lang/String;)La/rsy;

    .line 1527
    .line 1528
    .line 1529
    move-result-object v0

    .line 1530
    throw v0

    .line 1531
    :cond_49
    if-eqz v22, :cond_4f

    .line 1532
    .line 1533
    sget-object v5, La/k6z;->a:La/k6z;

    .line 1534
    .line 1535
    move-object/from16 v17, v2

    .line 1536
    .line 1537
    move/from16 v14, v31

    .line 1538
    .line 1539
    const/16 v58, 0x0

    .line 1540
    .line 1541
    move-object v2, v1

    .line 1542
    move-object/from16 v1, v22

    .line 1543
    .line 1544
    invoke-interface/range {v1 .. v6}, La/ow3;->b(La/w6k;I[ILa/k6z;[I)V

    .line 1545
    .line 1546
    .line 1547
    :goto_33
    invoke-static {v6}, La/tx3;->C([I)Lkotlin/ranges/IntRange;

    .line 1548
    .line 1549
    .line 1550
    move-result-object v1

    .line 1551
    if-nez v43, :cond_4a

    .line 1552
    .line 1553
    goto :goto_34

    .line 1554
    :cond_4a
    invoke-static {v1}, La/l1e0;->k(Lkotlin/ranges/IntRange;)Lkotlin/ranges/a;

    .line 1555
    .line 1556
    .line 1557
    move-result-object v1

    .line 1558
    :goto_34
    iget v2, v1, Lkotlin/ranges/a;->a:I

    .line 1559
    .line 1560
    iget v4, v1, Lkotlin/ranges/a;->b:I

    .line 1561
    .line 1562
    iget v1, v1, Lkotlin/ranges/a;->c:I

    .line 1563
    .line 1564
    if-lez v1, :cond_4b

    .line 1565
    .line 1566
    if-le v2, v4, :cond_4c

    .line 1567
    .line 1568
    :cond_4b
    if-gez v1, :cond_53

    .line 1569
    .line 1570
    if-gt v4, v2, :cond_53

    .line 1571
    .line 1572
    :cond_4c
    :goto_35
    aget v5, v6, v2

    .line 1573
    .line 1574
    if-nez v43, :cond_4d

    .line 1575
    .line 1576
    move/from16 v23, v0

    .line 1577
    .line 1578
    move v0, v2

    .line 1579
    goto :goto_36

    .line 1580
    :cond_4d
    sub-int v22, v0, v2

    .line 1581
    .line 1582
    add-int/lit8 v22, v22, -0x1

    .line 1583
    .line 1584
    move/from16 v23, v0

    .line 1585
    .line 1586
    move/from16 v0, v22

    .line 1587
    .line 1588
    :goto_36
    invoke-virtual {v9, v0}, La/xw3;->get(I)Ljava/lang/Object;

    .line 1589
    .line 1590
    .line 1591
    move-result-object v0

    .line 1592
    check-cast v0, La/ncz;

    .line 1593
    .line 1594
    if-eqz v43, :cond_4e

    .line 1595
    .line 1596
    sub-int v5, v3, v5

    .line 1597
    .line 1598
    move/from16 v22, v1

    .line 1599
    .line 1600
    iget v1, v0, La/ncz;->q:I

    .line 1601
    .line 1602
    sub-int/2addr v5, v1

    .line 1603
    goto :goto_37

    .line 1604
    :cond_4e
    move/from16 v22, v1

    .line 1605
    .line 1606
    :goto_37
    invoke-virtual {v0, v5, v10, v12}, La/ncz;->o(III)V

    .line 1607
    .line 1608
    .line 1609
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1610
    .line 1611
    .line 1612
    if-eq v2, v4, :cond_53

    .line 1613
    .line 1614
    add-int v2, v2, v22

    .line 1615
    .line 1616
    move/from16 v1, v22

    .line 1617
    .line 1618
    move/from16 v0, v23

    .line 1619
    .line 1620
    goto :goto_35

    .line 1621
    :cond_4f
    const-string v0, "null horizontalArrangement when isVertical == false"

    .line 1622
    .line 1623
    invoke-static {v0}, La/w6x;->i(Ljava/lang/String;)La/rsy;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v0

    .line 1627
    throw v0

    .line 1628
    :cond_50
    move-object/from16 v17, v2

    .line 1629
    .line 1630
    move-object/from16 v28, v6

    .line 1631
    .line 1632
    move/from16 v14, v31

    .line 1633
    .line 1634
    const/16 v58, 0x0

    .line 1635
    .line 1636
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 1637
    .line 1638
    .line 1639
    move-result v0

    .line 1640
    move/from16 v1, v25

    .line 1641
    .line 1642
    move/from16 v6, v58

    .line 1643
    .line 1644
    :goto_38
    if-ge v6, v0, :cond_51

    .line 1645
    .line 1646
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1647
    .line 1648
    .line 1649
    move-result-object v2

    .line 1650
    check-cast v2, La/ncz;

    .line 1651
    .line 1652
    invoke-virtual {v2}, La/ncz;->m()I

    .line 1653
    .line 1654
    .line 1655
    move-result v3

    .line 1656
    sub-int/2addr v1, v3

    .line 1657
    invoke-virtual {v2, v1, v10, v12}, La/ncz;->o(III)V

    .line 1658
    .line 1659
    .line 1660
    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1661
    .line 1662
    .line 1663
    add-int/lit8 v6, v6, 0x1

    .line 1664
    .line 1665
    goto :goto_38

    .line 1666
    :cond_51
    invoke-virtual {v9}, La/xw3;->b()I

    .line 1667
    .line 1668
    .line 1669
    move-result v0

    .line 1670
    move/from16 v2, v25

    .line 1671
    .line 1672
    move/from16 v6, v58

    .line 1673
    .line 1674
    :goto_39
    if-ge v6, v0, :cond_52

    .line 1675
    .line 1676
    invoke-virtual {v9, v6}, La/xw3;->get(I)Ljava/lang/Object;

    .line 1677
    .line 1678
    .line 1679
    move-result-object v1

    .line 1680
    check-cast v1, La/ncz;

    .line 1681
    .line 1682
    invoke-virtual {v1, v2, v10, v12}, La/ncz;->o(III)V

    .line 1683
    .line 1684
    .line 1685
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1686
    .line 1687
    .line 1688
    invoke-virtual {v1}, La/ncz;->m()I

    .line 1689
    .line 1690
    .line 1691
    move-result v1

    .line 1692
    add-int/2addr v2, v1

    .line 1693
    add-int/lit8 v6, v6, 0x1

    .line 1694
    .line 1695
    goto :goto_39

    .line 1696
    :cond_52
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 1697
    .line 1698
    .line 1699
    move-result v0

    .line 1700
    move/from16 v6, v58

    .line 1701
    .line 1702
    :goto_3a
    if-ge v6, v0, :cond_53

    .line 1703
    .line 1704
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1705
    .line 1706
    .line 1707
    move-result-object v1

    .line 1708
    check-cast v1, La/ncz;

    .line 1709
    .line 1710
    invoke-virtual {v1, v2, v10, v12}, La/ncz;->o(III)V

    .line 1711
    .line 1712
    .line 1713
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1714
    .line 1715
    .line 1716
    invoke-virtual {v1}, La/ncz;->m()I

    .line 1717
    .line 1718
    .line 1719
    move-result v1

    .line 1720
    add-int/2addr v2, v1

    .line 1721
    add-int/lit8 v6, v6, 0x1

    .line 1722
    .line 1723
    goto :goto_3a

    .line 1724
    :cond_53
    if-nez v24, :cond_54

    .line 1725
    .line 1726
    move/from16 v4, v60

    .line 1727
    .line 1728
    float-to-int v0, v4

    .line 1729
    const/16 v31, 0x1

    .line 1730
    .line 1731
    move/from16 v23, v0

    .line 1732
    .line 1733
    move/from16 v24, v10

    .line 1734
    .line 1735
    move/from16 v34, v11

    .line 1736
    .line 1737
    move/from16 v25, v12

    .line 1738
    .line 1739
    move-object/from16 v22, v26

    .line 1740
    .line 1741
    move-object/from16 v26, v15

    .line 1742
    .line 1743
    invoke-virtual/range {v22 .. v36}, La/dbz;->d(IIILjava/util/ArrayList;Landroidx/compose/foundation/lazy/layout/c;La/p4;ZZIZIILa/vne;La/afv;)V

    .line 1744
    .line 1745
    .line 1746
    move/from16 v0, v25

    .line 1747
    .line 1748
    move-object/from16 v3, v26

    .line 1749
    .line 1750
    move/from16 v2, v34

    .line 1751
    .line 1752
    :goto_3b
    move-object/from16 v1, v28

    .line 1753
    .line 1754
    move/from16 v49, v30

    .line 1755
    .line 1756
    goto :goto_3c

    .line 1757
    :cond_54
    move v2, v11

    .line 1758
    move v0, v12

    .line 1759
    move-object v3, v15

    .line 1760
    move-object/from16 v22, v26

    .line 1761
    .line 1762
    move/from16 v4, v60

    .line 1763
    .line 1764
    goto :goto_3b

    .line 1765
    :goto_3c
    if-nez v49, :cond_58

    .line 1766
    .line 1767
    invoke-virtual/range {v22 .. v22}, La/dbz;->b()J

    .line 1768
    .line 1769
    .line 1770
    move-result-wide v5

    .line 1771
    const-wide/16 v11, 0x0

    .line 1772
    .line 1773
    invoke-static {v5, v6, v11, v12}, La/qkx;->a(JJ)Z

    .line 1774
    .line 1775
    .line 1776
    move-result v11

    .line 1777
    if-nez v11, :cond_58

    .line 1778
    .line 1779
    if-eqz v29, :cond_55

    .line 1780
    .line 1781
    move v11, v0

    .line 1782
    :goto_3d
    move/from16 v60, v4

    .line 1783
    .line 1784
    move-wide/from16 v22, v5

    .line 1785
    .line 1786
    goto :goto_3e

    .line 1787
    :cond_55
    move v11, v10

    .line 1788
    goto :goto_3d

    .line 1789
    :goto_3e
    shr-long v4, v22, v18

    .line 1790
    .line 1791
    long-to-int v4, v4

    .line 1792
    invoke-static {v10, v4}, Ljava/lang/Math;->max(II)I

    .line 1793
    .line 1794
    .line 1795
    move-result v4

    .line 1796
    invoke-static {v4, v7, v8}, La/r4e;->g(IJ)I

    .line 1797
    .line 1798
    .line 1799
    move-result v10

    .line 1800
    and-long v4, v22, v37

    .line 1801
    .line 1802
    long-to-int v4, v4

    .line 1803
    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    .line 1804
    .line 1805
    .line 1806
    move-result v0

    .line 1807
    invoke-static {v0, v7, v8}, La/r4e;->f(IJ)I

    .line 1808
    .line 1809
    .line 1810
    move-result v12

    .line 1811
    if-eqz v29, :cond_56

    .line 1812
    .line 1813
    move v0, v12

    .line 1814
    goto :goto_3f

    .line 1815
    :cond_56
    move v0, v10

    .line 1816
    :goto_3f
    if-eq v0, v11, :cond_57

    .line 1817
    .line 1818
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 1819
    .line 1820
    .line 1821
    move-result v4

    .line 1822
    move/from16 v6, v58

    .line 1823
    .line 1824
    :goto_40
    if-ge v6, v4, :cond_57

    .line 1825
    .line 1826
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1827
    .line 1828
    .line 1829
    move-result-object v5

    .line 1830
    check-cast v5, La/ncz;

    .line 1831
    .line 1832
    iput v0, v5, La/ncz;->x:I

    .line 1833
    .line 1834
    iget v7, v5, La/ncz;->i:I

    .line 1835
    .line 1836
    add-int/2addr v7, v0

    .line 1837
    iput v7, v5, La/ncz;->z:I

    .line 1838
    .line 1839
    add-int/lit8 v6, v6, 0x1

    .line 1840
    .line 1841
    goto :goto_40

    .line 1842
    :cond_57
    :goto_41
    move/from16 v28, v10

    .line 1843
    .line 1844
    goto :goto_42

    .line 1845
    :cond_58
    move/from16 v60, v4

    .line 1846
    .line 1847
    move v12, v0

    .line 1848
    goto :goto_41

    .line 1849
    :goto_42
    invoke-virtual {v9}, La/xw3;->h()Ljava/lang/Object;

    .line 1850
    .line 1851
    .line 1852
    move-result-object v0

    .line 1853
    check-cast v0, La/ncz;

    .line 1854
    .line 1855
    if-eqz v0, :cond_59

    .line 1856
    .line 1857
    iget v6, v0, La/ncz;->a:I

    .line 1858
    .line 1859
    move/from16 v23, v6

    .line 1860
    .line 1861
    goto :goto_43

    .line 1862
    :cond_59
    move/from16 v23, v58

    .line 1863
    .line 1864
    :goto_43
    invoke-virtual {v9}, La/xw3;->k()Ljava/lang/Object;

    .line 1865
    .line 1866
    .line 1867
    move-result-object v0

    .line 1868
    check-cast v0, La/ncz;

    .line 1869
    .line 1870
    if-eqz v0, :cond_5a

    .line 1871
    .line 1872
    iget v6, v0, La/ncz;->a:I

    .line 1873
    .line 1874
    move/from16 v24, v6

    .line 1875
    .line 1876
    :goto_44
    move-object/from16 v0, v54

    .line 1877
    .line 1878
    goto :goto_45

    .line 1879
    :cond_5a
    move/from16 v24, v58

    .line 1880
    .line 1881
    goto :goto_44

    .line 1882
    :goto_45
    iget-object v4, v0, La/icz;->b:La/hcz;

    .line 1883
    .line 1884
    iget-object v4, v4, La/hcz;->b:Landroidx/collection/MutableIntList;

    .line 1885
    .line 1886
    if-eqz v4, :cond_5b

    .line 1887
    .line 1888
    :goto_46
    move-object/from16 v26, v4

    .line 1889
    .line 1890
    goto :goto_47

    .line 1891
    :cond_5b
    sget-object v4, Landroidx/collection/IntListKt;->a:Landroidx/collection/MutableIntList;

    .line 1892
    .line 1893
    goto :goto_46

    .line 1894
    :goto_47
    new-instance v4, La/ebz;

    .line 1895
    .line 1896
    const/4 v5, 0x2

    .line 1897
    invoke-direct {v4, v1, v5}, La/ebz;-><init>(Ljava/lang/Object;B)V

    .line 1898
    .line 1899
    .line 1900
    move-object/from16 v5, p0

    .line 1901
    .line 1902
    iget-object v5, v5, La/lcz;->j:La/g9m0;

    .line 1903
    .line 1904
    move-object/from16 v25, v3

    .line 1905
    .line 1906
    move-object/from16 v31, v4

    .line 1907
    .line 1908
    move-object/from16 v22, v5

    .line 1909
    .line 1910
    move/from16 v30, v29

    .line 1911
    .line 1912
    move/from16 v27, v45

    .line 1913
    .line 1914
    move/from16 v29, v12

    .line 1915
    .line 1916
    invoke-static/range {v22 .. v31}, La/ucx;->V(La/g9m0;IILjava/util/ArrayList;Landroidx/collection/MutableIntList;IIIZLkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 1917
    .line 1918
    .line 1919
    move-result-object v48

    .line 1920
    if-eqz v47, :cond_5d

    .line 1921
    .line 1922
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1923
    .line 1924
    .line 1925
    move-result-object v4

    .line 1926
    check-cast v4, La/ncz;

    .line 1927
    .line 1928
    if-eqz v4, :cond_5c

    .line 1929
    .line 1930
    iget v4, v4, La/ncz;->a:I

    .line 1931
    .line 1932
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1933
    .line 1934
    .line 1935
    move-result-object v4

    .line 1936
    goto :goto_48

    .line 1937
    :cond_5c
    move-object/from16 v4, v44

    .line 1938
    .line 1939
    goto :goto_48

    .line 1940
    :cond_5d
    invoke-virtual {v9}, La/xw3;->h()Ljava/lang/Object;

    .line 1941
    .line 1942
    .line 1943
    move-result-object v4

    .line 1944
    check-cast v4, La/ncz;

    .line 1945
    .line 1946
    if-eqz v4, :cond_5c

    .line 1947
    .line 1948
    iget v4, v4, La/ncz;->a:I

    .line 1949
    .line 1950
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1951
    .line 1952
    .line 1953
    move-result-object v4

    .line 1954
    :goto_48
    if-eqz v47, :cond_5f

    .line 1955
    .line 1956
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 1957
    .line 1958
    .line 1959
    move-result-object v5

    .line 1960
    check-cast v5, La/ncz;

    .line 1961
    .line 1962
    if-eqz v5, :cond_5e

    .line 1963
    .line 1964
    iget v5, v5, La/ncz;->a:I

    .line 1965
    .line 1966
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1967
    .line 1968
    .line 1969
    move-result-object v5

    .line 1970
    :goto_49
    move/from16 v7, v57

    .line 1971
    .line 1972
    goto :goto_4a

    .line 1973
    :cond_5e
    move-object/from16 v5, v44

    .line 1974
    .line 1975
    goto :goto_49

    .line 1976
    :cond_5f
    invoke-virtual {v9}, La/xw3;->k()Ljava/lang/Object;

    .line 1977
    .line 1978
    .line 1979
    move-result-object v5

    .line 1980
    check-cast v5, La/ncz;

    .line 1981
    .line 1982
    if-eqz v5, :cond_5e

    .line 1983
    .line 1984
    iget v5, v5, La/ncz;->a:I

    .line 1985
    .line 1986
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1987
    .line 1988
    .line 1989
    move-result-object v5

    .line 1990
    goto :goto_49

    .line 1991
    :goto_4a
    if-lt v14, v7, :cond_61

    .line 1992
    .line 1993
    if-le v2, v13, :cond_60

    .line 1994
    .line 1995
    goto :goto_4b

    .line 1996
    :cond_60
    move/from16 v6, v58

    .line 1997
    .line 1998
    goto :goto_4c

    .line 1999
    :cond_61
    :goto_4b
    move/from16 v6, v21

    .line 2000
    .line 2001
    :goto_4c
    new-instance v45, La/p8z;

    .line 2002
    .line 2003
    const/16 v50, 0x1

    .line 2004
    .line 2005
    move-object/from16 v47, v3

    .line 2006
    .line 2007
    invoke-direct/range {v45 .. v50}, La/p8z;-><init>(La/pz40;Ljava/util/ArrayList;Ljava/util/List;ZB)V

    .line 2008
    .line 2009
    .line 2010
    move-object/from16 v8, v45

    .line 2011
    .line 2012
    move-object/from16 v2, v48

    .line 2013
    .line 2014
    add-int v9, v28, v55

    .line 2015
    .line 2016
    move-wide/from16 v10, p2

    .line 2017
    .line 2018
    invoke-static {v9, v10, v11}, La/r4e;->g(IJ)I

    .line 2019
    .line 2020
    .line 2021
    move-result v9

    .line 2022
    add-int v12, v29, v52

    .line 2023
    .line 2024
    invoke-static {v12, v10, v11}, La/r4e;->f(IJ)I

    .line 2025
    .line 2026
    .line 2027
    move-result v10

    .line 2028
    sget-object v11, La/lun;->a:La/lun;

    .line 2029
    .line 2030
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2031
    .line 2032
    .line 2033
    move-object/from16 v12, v51

    .line 2034
    .line 2035
    invoke-interface {v12, v9, v10, v11, v8}, La/vj30;->i0(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)La/uj30;

    .line 2036
    .line 2037
    .line 2038
    move-result-object v8

    .line 2039
    if-eqz v4, :cond_62

    .line 2040
    .line 2041
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 2042
    .line 2043
    .line 2044
    move-result v4

    .line 2045
    goto :goto_4d

    .line 2046
    :cond_62
    move/from16 v4, v58

    .line 2047
    .line 2048
    :goto_4d
    if-eqz v5, :cond_63

    .line 2049
    .line 2050
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 2051
    .line 2052
    .line 2053
    move-result v5

    .line 2054
    goto :goto_4e

    .line 2055
    :cond_63
    move/from16 v5, v58

    .line 2056
    .line 2057
    :goto_4e
    invoke-static {v4, v5, v3, v2}, La/j120;->j0(IILjava/util/ArrayList;Ljava/util/List;)Ljava/util/List;

    .line 2058
    .line 2059
    .line 2060
    move-result-object v13

    .line 2061
    if-eqz v30, :cond_64

    .line 2062
    .line 2063
    sget-object v3, La/ma80;->a:La/ma80;

    .line 2064
    .line 2065
    :goto_4f
    move-object/from16 v18, v3

    .line 2066
    .line 2067
    goto :goto_50

    .line 2068
    :cond_64
    sget-object v3, La/ma80;->b:La/ma80;

    .line 2069
    .line 2070
    goto :goto_4f

    .line 2071
    :goto_50
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 2072
    .line 2073
    .line 2074
    move-result v3

    .line 2075
    move-object/from16 v40, v12

    .line 2076
    .line 2077
    move/from16 v4, v58

    .line 2078
    .line 2079
    move v12, v4

    .line 2080
    :goto_51
    if-ge v4, v3, :cond_65

    .line 2081
    .line 2082
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2083
    .line 2084
    .line 2085
    move-result-object v5

    .line 2086
    check-cast v5, La/ncz;

    .line 2087
    .line 2088
    iget v5, v5, La/ncz;->q:I

    .line 2089
    .line 2090
    add-int/2addr v12, v5

    .line 2091
    add-int/lit8 v4, v4, 0x1

    .line 2092
    .line 2093
    goto :goto_51

    .line 2094
    :cond_65
    new-instance v2, La/mcz;

    .line 2095
    .line 2096
    iget-wide v10, v1, La/kcz;->e:J

    .line 2097
    .line 2098
    move-object/from16 v9, p1

    .line 2099
    .line 2100
    move-object/from16 v54, v0

    .line 2101
    .line 2102
    move-object/from16 v61, v1

    .line 2103
    .line 2104
    move-object v0, v2

    .line 2105
    move v3, v6

    .line 2106
    move-object v5, v8

    .line 2107
    move/from16 v6, v16

    .line 2108
    .line 2109
    move-object/from16 v1, v17

    .line 2110
    .line 2111
    move/from16 v2, v33

    .line 2112
    .line 2113
    move-object/from16 v8, v35

    .line 2114
    .line 2115
    move/from16 v15, v39

    .line 2116
    .line 2117
    move/from16 v17, v43

    .line 2118
    .line 2119
    move/from16 v14, v56

    .line 2120
    .line 2121
    move/from16 v4, v60

    .line 2122
    .line 2123
    move/from16 v16, v7

    .line 2124
    .line 2125
    move/from16 v7, v59

    .line 2126
    .line 2127
    invoke-direct/range {v0 .. v20}, La/mcz;-><init>(La/ncz;IZFLa/uj30;FZLa/vne;La/w6k;JILjava/util/List;IIIZLa/ma80;II)V

    .line 2128
    .line 2129
    .line 2130
    goto/16 :goto_13

    .line 2131
    .line 2132
    :goto_52
    invoke-interface/range {v40 .. v40}, La/cnx;->M()Z

    .line 2133
    .line 2134
    .line 2135
    move-result v0

    .line 2136
    move-object/from16 v1, v53

    .line 2137
    .line 2138
    const/4 v15, 0x0

    .line 2139
    invoke-virtual {v1, v2, v0, v15}, La/xcz;->g(La/mcz;ZZ)V

    .line 2140
    .line 2141
    .line 2142
    iget-object v0, v1, La/xcz;->a:La/pcz;

    .line 2143
    .line 2144
    instance-of v1, v0, La/sj9;

    .line 2145
    .line 2146
    if-eqz v1, :cond_66

    .line 2147
    .line 2148
    move-object/from16 v44, v0

    .line 2149
    .line 2150
    check-cast v44, La/sj9;

    .line 2151
    .line 2152
    :cond_66
    move-object/from16 v0, v44

    .line 2153
    .line 2154
    if-eqz v0, :cond_6b

    .line 2155
    .line 2156
    iget-object v1, v2, La/mcz;->l:Ljava/util/List;

    .line 2157
    .line 2158
    const-string v3, "compose:lazy:cache_window:keepAroundItems"

    .line 2159
    .line 2160
    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 2161
    .line 2162
    .line 2163
    :try_start_1
    invoke-virtual {v0}, La/sj9;->e()Z

    .line 2164
    .line 2165
    .line 2166
    move-result v3

    .line 2167
    if-eqz v3, :cond_6a

    .line 2168
    .line 2169
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 2170
    .line 2171
    .line 2172
    move-result v3

    .line 2173
    if-nez v3, :cond_6a

    .line 2174
    .line 2175
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 2176
    .line 2177
    .line 2178
    move-result-object v3

    .line 2179
    check-cast v3, La/ncz;

    .line 2180
    .line 2181
    iget v3, v3, La/ncz;->a:I

    .line 2182
    .line 2183
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 2184
    .line 2185
    .line 2186
    move-result-object v1

    .line 2187
    check-cast v1, La/ncz;

    .line 2188
    .line 2189
    iget v1, v1, La/ncz;->a:I

    .line 2190
    .line 2191
    iget v4, v0, La/sj9;->j:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2192
    .line 2193
    move-object/from16 v6, v61

    .line 2194
    .line 2195
    :goto_53
    iget-object v5, v6, La/kcz;->d:La/jbz;

    .line 2196
    .line 2197
    if-ge v4, v3, :cond_68

    .line 2198
    .line 2199
    if-ltz v4, :cond_67

    .line 2200
    .line 2201
    :try_start_2
    invoke-virtual/range {v54 .. v54}, La/icz;->b()I

    .line 2202
    .line 2203
    .line 2204
    move-result v7

    .line 2205
    if-ge v4, v7, :cond_67

    .line 2206
    .line 2207
    invoke-virtual {v5, v4}, La/jbz;->a(I)Ljava/util/List;

    .line 2208
    .line 2209
    .line 2210
    :cond_67
    add-int/lit8 v4, v4, 0x1

    .line 2211
    .line 2212
    goto :goto_53

    .line 2213
    :cond_68
    add-int/lit8 v1, v1, 0x1

    .line 2214
    .line 2215
    iget v0, v0, La/sj9;->k:I

    .line 2216
    .line 2217
    if-gt v1, v0, :cond_6a

    .line 2218
    .line 2219
    :goto_54
    if-ltz v1, :cond_69

    .line 2220
    .line 2221
    invoke-virtual/range {v54 .. v54}, La/icz;->b()I

    .line 2222
    .line 2223
    .line 2224
    move-result v3

    .line 2225
    if-ge v1, v3, :cond_69

    .line 2226
    .line 2227
    invoke-virtual {v5, v1}, La/jbz;->a(I)Ljava/util/List;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 2228
    .line 2229
    .line 2230
    :cond_69
    if-eq v1, v0, :cond_6a

    .line 2231
    .line 2232
    add-int/lit8 v1, v1, 0x1

    .line 2233
    .line 2234
    goto :goto_54

    .line 2235
    :cond_6a
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 2236
    .line 2237
    .line 2238
    return-object v2

    .line 2239
    :catchall_0
    move-exception v0

    .line 2240
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 2241
    .line 2242
    .line 2243
    throw v0

    .line 2244
    :cond_6b
    return-object v2

    .line 2245
    :catchall_1
    move-exception v0

    .line 2246
    invoke-static {v4, v11, v6}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 2247
    .line 2248
    .line 2249
    throw v0

    .line 2250
    :cond_6c
    const-string v0, "null horizontalAlignment when isVertical == false"

    .line 2251
    .line 2252
    invoke-static {v0}, La/w6x;->i(Ljava/lang/String;)La/rsy;

    .line 2253
    .line 2254
    .line 2255
    move-result-object v0

    .line 2256
    throw v0
.end method
