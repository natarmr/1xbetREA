.class public final La/eez;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ibz;


# instance fields
.field public final synthetic a:La/mez;

.field public final synthetic b:La/ma80;

.field public final synthetic c:La/jez;

.field public final synthetic d:Lkotlin/jvm/functions/Function0;

.field public final synthetic e:La/lh80;

.field public final synthetic f:F

.field public final synthetic g:La/vne;

.field public final synthetic h:La/afv;


# direct methods
.method public constructor <init>(La/mez;La/ma80;La/jez;La/eiy;La/lh80;FLa/vne;La/afv;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/eez;->a:La/mez;

    .line 5
    .line 6
    iput-object p2, p0, La/eez;->b:La/ma80;

    .line 7
    .line 8
    iput-object p3, p0, La/eez;->c:La/jez;

    .line 9
    .line 10
    iput-object p4, p0, La/eez;->d:Lkotlin/jvm/functions/Function0;

    .line 11
    .line 12
    iput-object p5, p0, La/eez;->e:La/lh80;

    .line 13
    .line 14
    iput p6, p0, La/eez;->f:F

    .line 15
    .line 16
    iput-object p7, p0, La/eez;->g:La/vne;

    .line 17
    .line 18
    iput-object p8, p0, La/eez;->h:La/afv;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a(La/jbz;J)La/uj30;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move-wide/from16 v1, p2

    .line 6
    .line 7
    iget-object v9, v8, La/jbz;->b:La/c5n0;

    .line 8
    .line 9
    iget-object v3, v0, La/eez;->e:La/lh80;

    .line 10
    .line 11
    iget v4, v3, La/lh80;->e:F

    .line 12
    .line 13
    iget v5, v3, La/lh80;->c:F

    .line 14
    .line 15
    iget-object v10, v0, La/eez;->a:La/mez;

    .line 16
    .line 17
    iget-object v6, v10, La/mez;->v:La/pz40;

    .line 18
    .line 19
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    iget-boolean v6, v10, La/mez;->a:Z

    .line 23
    .line 24
    const/4 v12, 0x1

    .line 25
    if-nez v6, :cond_1

    .line 26
    .line 27
    invoke-interface {v9}, La/cnx;->M()Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    if-eqz v6, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/16 v16, 0x0

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    :goto_0
    move/from16 v16, v12

    .line 38
    .line 39
    :goto_1
    iget-object v6, v0, La/eez;->b:La/ma80;

    .line 40
    .line 41
    invoke-static {v1, v2, v6}, La/d5c;->H(JLa/ma80;)V

    .line 42
    .line 43
    .line 44
    iget-object v7, v0, La/eez;->c:La/jez;

    .line 45
    .line 46
    iget-object v13, v7, La/jez;->d:La/kez;

    .line 47
    .line 48
    if-eqz v13, :cond_2

    .line 49
    .line 50
    iget-wide v13, v7, La/jez;->b:J

    .line 51
    .line 52
    invoke-static {v13, v14, v1, v2}, La/p4e;->c(JJ)Z

    .line 53
    .line 54
    .line 55
    move-result v13

    .line 56
    if-eqz v13, :cond_2

    .line 57
    .line 58
    iget v13, v7, La/jez;->c:F

    .line 59
    .line 60
    invoke-interface {v9}, La/w6k;->getDensity()F

    .line 61
    .line 62
    .line 63
    move-result v14

    .line 64
    cmpg-float v13, v13, v14

    .line 65
    .line 66
    if-nez v13, :cond_2

    .line 67
    .line 68
    iget-object v7, v7, La/jez;->d:La/kez;

    .line 69
    .line 70
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-object v13, v7

    .line 74
    goto :goto_2

    .line 75
    :cond_2
    iput-wide v1, v7, La/jez;->b:J

    .line 76
    .line 77
    invoke-interface {v9}, La/w6k;->getDensity()F

    .line 78
    .line 79
    .line 80
    move-result v13

    .line 81
    iput v13, v7, La/jez;->c:F

    .line 82
    .line 83
    iget-object v13, v7, La/jez;->a:Lkotlin/jvm/functions/Function2;

    .line 84
    .line 85
    new-instance v14, La/p4e;

    .line 86
    .line 87
    invoke-direct {v14, v1, v2}, La/p4e;-><init>(J)V

    .line 88
    .line 89
    .line 90
    invoke-interface {v13, v8, v14}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v13

    .line 94
    check-cast v13, La/kez;

    .line 95
    .line 96
    iput-object v13, v7, La/jez;->d:La/kez;

    .line 97
    .line 98
    :goto_2
    sget-object v7, La/ma80;->a:La/ma80;

    .line 99
    .line 100
    if-ne v6, v7, :cond_3

    .line 101
    .line 102
    move v14, v12

    .line 103
    goto :goto_3

    .line 104
    :cond_3
    const/4 v14, 0x0

    .line 105
    :goto_3
    iget-object v7, v0, La/eez;->d:Lkotlin/jvm/functions/Function0;

    .line 106
    .line 107
    invoke-interface {v7}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    move-object v15, v7

    .line 112
    check-cast v15, La/ydz;

    .line 113
    .line 114
    invoke-interface {v9}, La/cnx;->getLayoutDirection()La/k6z;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 119
    .line 120
    .line 121
    move-result v11

    .line 122
    const/16 v19, 0x0

    .line 123
    .line 124
    if-eqz v11, :cond_5

    .line 125
    .line 126
    if-ne v11, v12, :cond_4

    .line 127
    .line 128
    invoke-static {v3, v7}, La/s5x0;->B(La/hh80;La/k6z;)F

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    goto :goto_4

    .line 133
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 134
    .line 135
    .line 136
    return-object v19

    .line 137
    :cond_5
    move v7, v5

    .line 138
    :goto_4
    invoke-interface {v9, v7}, La/w6k;->T(F)I

    .line 139
    .line 140
    .line 141
    move-result v11

    .line 142
    invoke-interface {v9}, La/cnx;->getLayoutDirection()La/k6z;

    .line 143
    .line 144
    .line 145
    move-result-object v7

    .line 146
    move/from16 v18, v4

    .line 147
    .line 148
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    if-eqz v4, :cond_7

    .line 153
    .line 154
    if-ne v4, v12, :cond_6

    .line 155
    .line 156
    invoke-static {v3, v7}, La/s5x0;->A(La/hh80;La/k6z;)F

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    goto :goto_5

    .line 161
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 162
    .line 163
    .line 164
    return-object v19

    .line 165
    :cond_7
    move/from16 v4, v18

    .line 166
    .line 167
    :goto_5
    invoke-interface {v9, v4}, La/w6k;->T(F)I

    .line 168
    .line 169
    .line 170
    move-result v20

    .line 171
    invoke-interface {v9}, La/cnx;->getLayoutDirection()La/k6z;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 176
    .line 177
    .line 178
    move-result v6

    .line 179
    if-eqz v6, :cond_9

    .line 180
    .line 181
    if-ne v6, v12, :cond_8

    .line 182
    .line 183
    move v4, v5

    .line 184
    goto :goto_6

    .line 185
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 186
    .line 187
    .line 188
    return-object v19

    .line 189
    :cond_9
    invoke-static {v3, v4}, La/s5x0;->B(La/hh80;La/k6z;)F

    .line 190
    .line 191
    .line 192
    move-result v4

    .line 193
    :goto_6
    invoke-interface {v9, v4}, La/w6k;->T(F)I

    .line 194
    .line 195
    .line 196
    move-result v4

    .line 197
    if-eqz v14, :cond_a

    .line 198
    .line 199
    invoke-static {v1, v2}, La/p4e;->h(J)I

    .line 200
    .line 201
    .line 202
    move-result v6

    .line 203
    goto :goto_7

    .line 204
    :cond_a
    invoke-static {v1, v2}, La/p4e;->i(J)I

    .line 205
    .line 206
    .line 207
    move-result v6

    .line 208
    :goto_7
    sub-int/2addr v6, v11

    .line 209
    sub-int v21, v6, v20

    .line 210
    .line 211
    const-wide v22, 0xffffffffL

    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    if-eqz v14, :cond_b

    .line 217
    .line 218
    const/16 v24, 0x20

    .line 219
    .line 220
    int-to-long v6, v4

    .line 221
    shl-long v6, v6, v24

    .line 222
    .line 223
    move-object/from16 v25, v13

    .line 224
    .line 225
    int-to-long v12, v11

    .line 226
    :goto_8
    and-long v12, v12, v22

    .line 227
    .line 228
    or-long/2addr v6, v12

    .line 229
    move-wide v12, v6

    .line 230
    goto :goto_9

    .line 231
    :cond_b
    move-object/from16 v25, v13

    .line 232
    .line 233
    const/16 v24, 0x20

    .line 234
    .line 235
    int-to-long v6, v11

    .line 236
    shl-long v6, v6, v24

    .line 237
    .line 238
    int-to-long v12, v4

    .line 239
    goto :goto_8

    .line 240
    :goto_9
    invoke-interface {v9}, La/cnx;->getLayoutDirection()La/k6z;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    invoke-static {v3, v4}, La/s5x0;->B(La/hh80;La/k6z;)F

    .line 245
    .line 246
    .line 247
    move-result v4

    .line 248
    invoke-interface {v9}, La/cnx;->getLayoutDirection()La/k6z;

    .line 249
    .line 250
    .line 251
    move-result-object v6

    .line 252
    invoke-static {v3, v6}, La/s5x0;->A(La/hh80;La/k6z;)F

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    add-float/2addr v3, v4

    .line 257
    invoke-interface {v9, v3}, La/w6k;->T(F)I

    .line 258
    .line 259
    .line 260
    move-result v3

    .line 261
    add-float v4, v18, v5

    .line 262
    .line 263
    invoke-interface {v9, v4}, La/w6k;->T(F)I

    .line 264
    .line 265
    .line 266
    move-result v4

    .line 267
    iget-object v5, v10, La/mez;->s:La/qbz;

    .line 268
    .line 269
    iget-object v6, v10, La/mez;->k:La/hru;

    .line 270
    .line 271
    invoke-static {v15, v5, v6}, La/c9x;->t(La/hbz;La/qbz;La/hru;)Landroidx/collection/MutableIntList;

    .line 272
    .line 273
    .line 274
    move-result-object v18

    .line 275
    invoke-static {v3, v1, v2}, La/r4e;->g(IJ)I

    .line 276
    .line 277
    .line 278
    move-result v3

    .line 279
    invoke-static {v4, v1, v2}, La/r4e;->f(IJ)I

    .line 280
    .line 281
    .line 282
    move-result v5

    .line 283
    const/4 v6, 0x0

    .line 284
    const/16 v7, 0xa

    .line 285
    .line 286
    const/4 v4, 0x0

    .line 287
    invoke-static/range {v1 .. v7}, La/p4e;->b(JIIIII)J

    .line 288
    .line 289
    .line 290
    move-result-wide v5

    .line 291
    iget v1, v0, La/eez;->f:F

    .line 292
    .line 293
    invoke-interface {v9, v1}, La/w6k;->T(F)I

    .line 294
    .line 295
    .line 296
    move-result v1

    .line 297
    invoke-interface {v9}, La/cnx;->M()Z

    .line 298
    .line 299
    .line 300
    move-result v24

    .line 301
    iget-object v2, v10, La/mez;->b:La/fez;

    .line 302
    .line 303
    if-eqz v2, :cond_c

    .line 304
    .line 305
    iget-object v2, v2, La/fez;->m:Ljava/util/List;

    .line 306
    .line 307
    goto :goto_a

    .line 308
    :cond_c
    move-object/from16 v2, v19

    .line 309
    .line 310
    :goto_a
    new-instance v3, La/dez;

    .line 311
    .line 312
    move-object v7, v15

    .line 313
    iget-object v15, v0, La/eez;->g:La/vne;

    .line 314
    .line 315
    iget-object v0, v0, La/eez;->h:La/afv;

    .line 316
    .line 317
    move-object/from16 v17, v2

    .line 318
    .line 319
    move-object/from16 v2, v18

    .line 320
    .line 321
    move-object/from16 v4, v25

    .line 322
    .line 323
    move-object/from16 v18, v0

    .line 324
    .line 325
    move-object v0, v3

    .line 326
    move-object v3, v7

    .line 327
    move v7, v14

    .line 328
    move v14, v1

    .line 329
    move-object v1, v10

    .line 330
    move/from16 v26, v20

    .line 331
    .line 332
    move-object/from16 v20, v9

    .line 333
    .line 334
    move/from16 v9, v21

    .line 335
    .line 336
    move-wide/from16 v27, v12

    .line 337
    .line 338
    move v12, v11

    .line 339
    move-wide/from16 v10, v27

    .line 340
    .line 341
    move/from16 v13, v26

    .line 342
    .line 343
    invoke-direct/range {v0 .. v18}, La/dez;-><init>(La/mez;Landroidx/collection/MutableIntList;La/ydz;La/kez;JZLa/jbz;IJIIILa/vne;ZLjava/util/List;La/afv;)V

    .line 344
    .line 345
    .line 346
    iget-object v2, v1, La/mez;->c:La/hhk;

    .line 347
    .line 348
    iget-object v4, v2, La/hhk;->c:Ljava/lang/Object;

    .line 349
    .line 350
    check-cast v4, [I

    .line 351
    .line 352
    iget-object v5, v2, La/hhk;->g:Ljava/lang/Object;

    .line 353
    .line 354
    const/4 v6, 0x0

    .line 355
    invoke-static {v4, v6}, La/tx3;->F([II)Ljava/lang/Integer;

    .line 356
    .line 357
    .line 358
    move-result-object v7

    .line 359
    if-eqz v7, :cond_d

    .line 360
    .line 361
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 362
    .line 363
    .line 364
    move-result v11

    .line 365
    goto :goto_b

    .line 366
    :cond_d
    move v11, v6

    .line 367
    :goto_b
    invoke-static {v11, v3, v5}, La/k9x;->J(ILa/hbz;Ljava/lang/Object;)I

    .line 368
    .line 369
    .line 370
    move-result v3

    .line 371
    invoke-static {v4, v3}, La/tx3;->w([II)Z

    .line 372
    .line 373
    .line 374
    move-result v5

    .line 375
    if-nez v5, :cond_f

    .line 376
    .line 377
    iget-object v5, v2, La/hhk;->h:Ljava/lang/Object;

    .line 378
    .line 379
    check-cast v5, La/lbz;

    .line 380
    .line 381
    invoke-virtual {v5, v3}, La/lbz;->b(I)V

    .line 382
    .line 383
    .line 384
    invoke-static {}, La/vdx;->J()La/rfk0;

    .line 385
    .line 386
    .line 387
    move-result-object v5

    .line 388
    if-eqz v5, :cond_e

    .line 389
    .line 390
    invoke-virtual {v5}, La/rfk0;->e()Lkotlin/jvm/functions/Function1;

    .line 391
    .line 392
    .line 393
    move-result-object v19

    .line 394
    :cond_e
    move-object/from16 v7, v19

    .line 395
    .line 396
    invoke-static {v5}, La/vdx;->W(La/rfk0;)La/rfk0;

    .line 397
    .line 398
    .line 399
    move-result-object v8

    .line 400
    :try_start_0
    iget-object v9, v2, La/hhk;->b:Ljava/lang/Object;

    .line 401
    .line 402
    check-cast v9, La/ens;

    .line 403
    .line 404
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    array-length v4, v4

    .line 409
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 410
    .line 411
    .line 412
    move-result-object v4

    .line 413
    invoke-virtual {v9, v3, v4}, La/ens;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v3

    .line 417
    move-object v4, v3

    .line 418
    check-cast v4, [I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 419
    .line 420
    invoke-static {v5, v8, v7}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 421
    .line 422
    .line 423
    iput-object v4, v2, La/hhk;->c:Ljava/lang/Object;

    .line 424
    .line 425
    invoke-static {v4}, La/hhk;->b([I)I

    .line 426
    .line 427
    .line 428
    move-result v3

    .line 429
    iget-object v5, v2, La/hhk;->d:Ljava/lang/Object;

    .line 430
    .line 431
    check-cast v5, La/cgk0;

    .line 432
    .line 433
    invoke-virtual {v5, v3}, La/cgk0;->m(I)V

    .line 434
    .line 435
    .line 436
    goto :goto_c

    .line 437
    :catchall_0
    move-exception v0

    .line 438
    invoke-static {v5, v8, v7}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 439
    .line 440
    .line 441
    throw v0

    .line 442
    :cond_f
    :goto_c
    iget-object v2, v2, La/hhk;->e:Ljava/lang/Object;

    .line 443
    .line 444
    check-cast v2, [I

    .line 445
    .line 446
    array-length v3, v4

    .line 447
    iget v5, v0, La/dez;->s:I

    .line 448
    .line 449
    if-ne v3, v5, :cond_10

    .line 450
    .line 451
    :goto_d
    const/4 v9, 0x1

    .line 452
    goto :goto_11

    .line 453
    :cond_10
    iget-object v3, v0, La/dez;->r:La/zz2;

    .line 454
    .line 455
    invoke-virtual {v3}, La/zz2;->D()V

    .line 456
    .line 457
    .line 458
    new-array v7, v5, [I

    .line 459
    .line 460
    move v11, v6

    .line 461
    :goto_e
    if-ge v11, v5, :cond_13

    .line 462
    .line 463
    array-length v8, v4

    .line 464
    if-ge v11, v8, :cond_11

    .line 465
    .line 466
    aget v8, v4, v11

    .line 467
    .line 468
    const/4 v9, -0x1

    .line 469
    if-eq v8, v9, :cond_11

    .line 470
    .line 471
    :goto_f
    const/4 v9, 0x1

    .line 472
    goto :goto_10

    .line 473
    :cond_11
    if-nez v11, :cond_12

    .line 474
    .line 475
    move v8, v6

    .line 476
    goto :goto_f

    .line 477
    :cond_12
    int-to-long v8, v11

    .line 478
    and-long v8, v8, v22

    .line 479
    .line 480
    invoke-static {v7, v8, v9}, La/efx;->B([IJ)I

    .line 481
    .line 482
    .line 483
    move-result v8

    .line 484
    const/4 v9, 0x1

    .line 485
    add-int/2addr v8, v9

    .line 486
    :goto_10
    aput v8, v7, v11

    .line 487
    .line 488
    invoke-virtual {v3, v8, v11}, La/zz2;->H(II)V

    .line 489
    .line 490
    .line 491
    add-int/lit8 v11, v11, 0x1

    .line 492
    .line 493
    goto :goto_e

    .line 494
    :cond_13
    move-object v4, v7

    .line 495
    goto :goto_d

    .line 496
    :goto_11
    array-length v3, v2

    .line 497
    if-ne v3, v5, :cond_14

    .line 498
    .line 499
    goto :goto_14

    .line 500
    :cond_14
    new-array v3, v5, [I

    .line 501
    .line 502
    move v11, v6

    .line 503
    :goto_12
    if-ge v11, v5, :cond_17

    .line 504
    .line 505
    array-length v7, v2

    .line 506
    if-ge v11, v7, :cond_15

    .line 507
    .line 508
    aget v7, v2, v11

    .line 509
    .line 510
    goto :goto_13

    .line 511
    :cond_15
    if-nez v11, :cond_16

    .line 512
    .line 513
    move v7, v6

    .line 514
    goto :goto_13

    .line 515
    :cond_16
    add-int/lit8 v7, v11, -0x1

    .line 516
    .line 517
    aget v7, v3, v7

    .line 518
    .line 519
    :goto_13
    aput v7, v3, v11

    .line 520
    .line 521
    add-int/lit8 v11, v11, 0x1

    .line 522
    .line 523
    goto :goto_12

    .line 524
    :cond_17
    move-object v2, v3

    .line 525
    :goto_14
    if-nez v24, :cond_19

    .line 526
    .line 527
    iget-boolean v3, v1, La/mez;->a:Z

    .line 528
    .line 529
    if-nez v3, :cond_18

    .line 530
    .line 531
    goto :goto_15

    .line 532
    :cond_18
    iget-object v3, v1, La/mez;->w:La/ieu;

    .line 533
    .line 534
    iget-object v3, v3, La/ieu;->c:Ljava/lang/Object;

    .line 535
    .line 536
    check-cast v3, La/l73;

    .line 537
    .line 538
    iget-object v3, v3, La/l73;->b:La/pz40;

    .line 539
    .line 540
    check-cast v3, La/hgk0;

    .line 541
    .line 542
    invoke-virtual {v3}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v3

    .line 546
    check-cast v3, Ljava/lang/Number;

    .line 547
    .line 548
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 549
    .line 550
    .line 551
    move-result v3

    .line 552
    goto :goto_16

    .line 553
    :cond_19
    :goto_15
    iget v3, v1, La/mez;->o:F

    .line 554
    .line 555
    :goto_16
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 556
    .line 557
    .line 558
    move-result v3

    .line 559
    invoke-static {v0, v3, v4, v2, v9}, La/efx;->C(La/dez;I[I[IZ)La/fez;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    invoke-interface/range {v20 .. v20}, La/cnx;->M()Z

    .line 564
    .line 565
    .line 566
    move-result v2

    .line 567
    invoke-virtual {v1, v0, v2, v6}, La/mez;->f(La/fez;ZZ)V

    .line 568
    .line 569
    .line 570
    return-object v0
.end method
