.class public final La/o8z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ibz;


# instance fields
.field public final synthetic a:La/d9z;

.field public final synthetic b:Z

.field public final synthetic c:La/hh80;

.field public final synthetic d:Lkotlin/jvm/functions/Function0;

.field public final synthetic e:La/tgv;

.field public final synthetic f:La/sw3;

.field public final synthetic g:La/ow3;

.field public final synthetic h:La/vne;

.field public final synthetic i:La/afv;

.field public final synthetic j:La/g9m0;


# direct methods
.method public constructor <init>(La/d9z;ZLa/hh80;La/eiy;La/tgv;La/sw3;La/ow3;La/vne;La/afv;La/g9m0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/o8z;->a:La/d9z;

    .line 5
    .line 6
    iput-boolean p2, p0, La/o8z;->b:Z

    .line 7
    .line 8
    iput-object p3, p0, La/o8z;->c:La/hh80;

    .line 9
    .line 10
    iput-object p4, p0, La/o8z;->d:Lkotlin/jvm/functions/Function0;

    .line 11
    .line 12
    iput-object p5, p0, La/o8z;->e:La/tgv;

    .line 13
    .line 14
    iput-object p6, p0, La/o8z;->f:La/sw3;

    .line 15
    .line 16
    iput-object p7, p0, La/o8z;->g:La/ow3;

    .line 17
    .line 18
    iput-object p8, p0, La/o8z;->h:La/vne;

    .line 19
    .line 20
    iput-object p9, p0, La/o8z;->i:La/afv;

    .line 21
    .line 22
    iput-object p10, p0, La/o8z;->j:La/g9m0;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a(La/jbz;J)La/uj30;
    .locals 68

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v9, p1

    .line 4
    .line 5
    move-wide/from16 v11, p2

    .line 6
    .line 7
    iget-object v13, v9, La/jbz;->b:La/c5n0;

    .line 8
    .line 9
    iget-object v14, v0, La/o8z;->a:La/d9z;

    .line 10
    .line 11
    iget-object v1, v14, La/d9z;->s:La/pz40;

    .line 12
    .line 13
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    iget-boolean v1, v14, La/d9z;->b:Z

    .line 17
    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    invoke-interface {v13}, La/cnx;->M()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/16 v26, 0x0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :goto_0
    const/16 v26, 0x1

    .line 31
    .line 32
    :goto_1
    iget-boolean v1, v0, La/o8z;->b:Z

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    sget-object v3, La/ma80;->a:La/ma80;

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    sget-object v3, La/ma80;->b:La/ma80;

    .line 40
    .line 41
    :goto_2
    invoke-static {v11, v12, v3}, La/d5c;->H(JLa/ma80;)V

    .line 42
    .line 43
    .line 44
    iget-object v3, v0, La/o8z;->c:La/hh80;

    .line 45
    .line 46
    if-eqz v1, :cond_3

    .line 47
    .line 48
    invoke-interface {v13}, La/cnx;->getLayoutDirection()La/k6z;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-interface {v3, v4}, La/hh80;->b(La/k6z;)F

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    invoke-interface {v13, v4}, La/w6k;->T(F)I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    goto :goto_3

    .line 61
    :cond_3
    invoke-interface {v13}, La/cnx;->getLayoutDirection()La/k6z;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-static {v3, v4}, La/s5x0;->B(La/hh80;La/k6z;)F

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    invoke-interface {v13, v4}, La/w6k;->T(F)I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    :goto_3
    if-eqz v1, :cond_4

    .line 74
    .line 75
    invoke-interface {v13}, La/cnx;->getLayoutDirection()La/k6z;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-interface {v3, v5}, La/hh80;->c(La/k6z;)F

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    invoke-interface {v13, v5}, La/w6k;->T(F)I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    goto :goto_4

    .line 88
    :cond_4
    invoke-interface {v13}, La/cnx;->getLayoutDirection()La/k6z;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    invoke-static {v3, v5}, La/s5x0;->A(La/hh80;La/k6z;)F

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    invoke-interface {v13, v5}, La/w6k;->T(F)I

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    :goto_4
    invoke-interface {v3}, La/hh80;->d()F

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    invoke-interface {v13, v6}, La/w6k;->T(F)I

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    invoke-interface {v3}, La/hh80;->a()F

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    invoke-interface {v13, v3}, La/w6k;->T(F)I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    add-int/2addr v3, v6

    .line 117
    add-int v7, v4, v5

    .line 118
    .line 119
    if-eqz v1, :cond_5

    .line 120
    .line 121
    move v8, v3

    .line 122
    goto :goto_5

    .line 123
    :cond_5
    move v8, v7

    .line 124
    :goto_5
    if-eqz v1, :cond_6

    .line 125
    .line 126
    move/from16 v21, v6

    .line 127
    .line 128
    goto :goto_6

    .line 129
    :cond_6
    if-nez v1, :cond_7

    .line 130
    .line 131
    move/from16 v21, v4

    .line 132
    .line 133
    goto :goto_6

    .line 134
    :cond_7
    move/from16 v21, v5

    .line 135
    .line 136
    :goto_6
    sub-int v19, v8, v21

    .line 137
    .line 138
    neg-int v5, v7

    .line 139
    neg-int v8, v3

    .line 140
    move/from16 v16, v3

    .line 141
    .line 142
    invoke-static {v5, v8, v11, v12}, La/r4e;->i(IIJ)J

    .line 143
    .line 144
    .line 145
    move-result-wide v2

    .line 146
    iget-object v5, v0, La/o8z;->d:Lkotlin/jvm/functions/Function0;

    .line 147
    .line 148
    invoke-interface {v5}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    check-cast v5, La/j8z;

    .line 153
    .line 154
    iget-object v8, v5, La/j8z;->b:La/i8z;

    .line 155
    .line 156
    iget-object v8, v8, La/i8z;->a:La/y8z;

    .line 157
    .line 158
    iget-object v10, v0, La/o8z;->e:La/tgv;

    .line 159
    .line 160
    const/16 v31, 0x1

    .line 161
    .line 162
    iget-object v15, v10, La/tgv;->d:La/v8z;

    .line 163
    .line 164
    if-eqz v15, :cond_8

    .line 165
    .line 166
    iget-wide v11, v10, La/tgv;->b:J

    .line 167
    .line 168
    invoke-static {v11, v12, v2, v3}, La/p4e;->c(JJ)Z

    .line 169
    .line 170
    .line 171
    move-result v11

    .line 172
    if-eqz v11, :cond_8

    .line 173
    .line 174
    iget v11, v10, La/tgv;->c:F

    .line 175
    .line 176
    invoke-interface {v13}, La/w6k;->getDensity()F

    .line 177
    .line 178
    .line 179
    move-result v12

    .line 180
    cmpg-float v11, v11, v12

    .line 181
    .line 182
    if-nez v11, :cond_8

    .line 183
    .line 184
    iget-object v10, v10, La/tgv;->d:La/v8z;

    .line 185
    .line 186
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    move-object v11, v10

    .line 190
    goto :goto_7

    .line 191
    :cond_8
    iput-wide v2, v10, La/tgv;->b:J

    .line 192
    .line 193
    invoke-interface {v13}, La/w6k;->getDensity()F

    .line 194
    .line 195
    .line 196
    move-result v11

    .line 197
    iput v11, v10, La/tgv;->c:F

    .line 198
    .line 199
    iget-object v11, v10, La/tgv;->a:Lkotlin/jvm/functions/Function2;

    .line 200
    .line 201
    new-instance v12, La/p4e;

    .line 202
    .line 203
    invoke-direct {v12, v2, v3}, La/p4e;-><init>(J)V

    .line 204
    .line 205
    .line 206
    invoke-interface {v11, v9, v12}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v11

    .line 210
    check-cast v11, La/v8z;

    .line 211
    .line 212
    iput-object v11, v10, La/tgv;->d:La/v8z;

    .line 213
    .line 214
    :goto_7
    iget-object v10, v11, La/v8z;->a:[I

    .line 215
    .line 216
    array-length v12, v10

    .line 217
    iget v10, v8, La/y8z;->i:I

    .line 218
    .line 219
    if-eq v12, v10, :cond_9

    .line 220
    .line 221
    iput v12, v8, La/y8z;->i:I

    .line 222
    .line 223
    iget-object v10, v8, La/y8z;->b:Ljava/util/ArrayList;

    .line 224
    .line 225
    invoke-virtual {v10}, Ljava/util/ArrayList;->clear()V

    .line 226
    .line 227
    .line 228
    new-instance v15, La/w8z;

    .line 229
    .line 230
    move/from16 v20, v1

    .line 231
    .line 232
    const/4 v1, 0x0

    .line 233
    invoke-direct {v15, v1, v1}, La/w8z;-><init>(II)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    iput v1, v8, La/y8z;->c:I

    .line 240
    .line 241
    iput v1, v8, La/y8z;->d:I

    .line 242
    .line 243
    iput v1, v8, La/y8z;->e:I

    .line 244
    .line 245
    const/4 v10, -0x1

    .line 246
    iput v10, v8, La/y8z;->f:I

    .line 247
    .line 248
    iget-object v10, v8, La/y8z;->g:Ljava/util/ArrayList;

    .line 249
    .line 250
    invoke-virtual {v10}, Ljava/util/ArrayList;->clear()V

    .line 251
    .line 252
    .line 253
    goto :goto_8

    .line 254
    :cond_9
    move/from16 v20, v1

    .line 255
    .line 256
    const/4 v1, 0x0

    .line 257
    :goto_8
    iget-object v15, v0, La/o8z;->g:La/ow3;

    .line 258
    .line 259
    iget-object v10, v0, La/o8z;->f:La/sw3;

    .line 260
    .line 261
    if-eqz v20, :cond_b

    .line 262
    .line 263
    if-eqz v10, :cond_a

    .line 264
    .line 265
    invoke-interface {v10}, La/sw3;->a()F

    .line 266
    .line 267
    .line 268
    move-result v17

    .line 269
    :goto_9
    move/from16 v1, v17

    .line 270
    .line 271
    goto :goto_a

    .line 272
    :cond_a
    const-string v0, "null verticalArrangement when isVertical == true"

    .line 273
    .line 274
    invoke-static {v0}, La/w6x;->i(Ljava/lang/String;)La/rsy;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    throw v0

    .line 279
    :cond_b
    if-eqz v15, :cond_68

    .line 280
    .line 281
    invoke-interface {v15}, La/ow3;->a()F

    .line 282
    .line 283
    .line 284
    move-result v17

    .line 285
    goto :goto_9

    .line 286
    :goto_a
    invoke-interface {v13, v1}, La/w6k;->T(F)I

    .line 287
    .line 288
    .line 289
    move-result v1

    .line 290
    move/from16 v25, v12

    .line 291
    .line 292
    invoke-virtual {v5}, La/j8z;->b()I

    .line 293
    .line 294
    .line 295
    move-result v12

    .line 296
    if-eqz v20, :cond_c

    .line 297
    .line 298
    invoke-static/range {p2 .. p3}, La/p4e;->h(J)I

    .line 299
    .line 300
    .line 301
    move-result v17

    .line 302
    sub-int v17, v17, v16

    .line 303
    .line 304
    :goto_b
    move-wide/from16 v27, v2

    .line 305
    .line 306
    move-object/from16 v23, v15

    .line 307
    .line 308
    move/from16 v15, v17

    .line 309
    .line 310
    move v3, v1

    .line 311
    goto :goto_c

    .line 312
    :cond_c
    invoke-static/range {p2 .. p3}, La/p4e;->i(J)I

    .line 313
    .line 314
    .line 315
    move-result v17

    .line 316
    sub-int v17, v17, v7

    .line 317
    .line 318
    goto :goto_b

    .line 319
    :goto_c
    int-to-long v1, v4

    .line 320
    const/16 v32, 0x20

    .line 321
    .line 322
    shl-long v1, v1, v32

    .line 323
    .line 324
    move-wide/from16 v29, v1

    .line 325
    .line 326
    int-to-long v1, v6

    .line 327
    const-wide v33, 0xffffffffL

    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    and-long v1, v1, v33

    .line 333
    .line 334
    or-long v1, v29, v1

    .line 335
    .line 336
    new-instance v35, La/m8z;

    .line 337
    .line 338
    move-wide/from16 v66, v1

    .line 339
    .line 340
    move-object v1, v10

    .line 341
    move-wide/from16 v9, v66

    .line 342
    .line 343
    move-object v2, v5

    .line 344
    iget-object v5, v0, La/o8z;->a:La/d9z;

    .line 345
    .line 346
    iget-boolean v6, v0, La/o8z;->b:Z

    .line 347
    .line 348
    move-object/from16 v48, v1

    .line 349
    .line 350
    move v4, v3

    .line 351
    move/from16 v44, v7

    .line 352
    .line 353
    move/from16 v47, v15

    .line 354
    .line 355
    move/from16 v43, v16

    .line 356
    .line 357
    move/from16 v7, v21

    .line 358
    .line 359
    move-wide/from16 v45, v27

    .line 360
    .line 361
    move-object/from16 v1, v35

    .line 362
    .line 363
    move-object/from16 v3, p1

    .line 364
    .line 365
    move-object v15, v8

    .line 366
    move-object/from16 v35, v13

    .line 367
    .line 368
    move/from16 v8, v19

    .line 369
    .line 370
    move/from16 v13, v20

    .line 371
    .line 372
    invoke-direct/range {v1 .. v10}, La/m8z;-><init>(La/j8z;La/jbz;ILa/d9z;ZIIJ)V

    .line 373
    .line 374
    .line 375
    move v3, v4

    .line 376
    iget-object v9, v1, La/m8z;->c:La/j8z;

    .line 377
    .line 378
    iget-object v4, v9, La/j8z;->c:Landroidx/compose/foundation/lazy/layout/c;

    .line 379
    .line 380
    new-instance v10, La/n8z;

    .line 381
    .line 382
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 383
    .line 384
    .line 385
    iput-boolean v13, v10, La/n8z;->d:Z

    .line 386
    .line 387
    iput-object v11, v10, La/n8z;->f:Ljava/lang/Object;

    .line 388
    .line 389
    iput-boolean v13, v10, La/n8z;->c:Z

    .line 390
    .line 391
    iput-object v11, v10, La/n8z;->e:Ljava/lang/Object;

    .line 392
    .line 393
    iput v12, v10, La/n8z;->a:I

    .line 394
    .line 395
    iput v3, v10, La/n8z;->b:I

    .line 396
    .line 397
    iput-object v1, v10, La/n8z;->g:Ljava/lang/Object;

    .line 398
    .line 399
    iput-object v15, v10, La/n8z;->h:Ljava/lang/Object;

    .line 400
    .line 401
    iget-object v5, v10, La/n8z;->h:Ljava/lang/Object;

    .line 402
    .line 403
    check-cast v5, La/y8z;

    .line 404
    .line 405
    new-instance v11, La/okw;

    .line 406
    .line 407
    const/16 v6, 0x12

    .line 408
    .line 409
    invoke-direct {v11, v15, v10, v6}, La/okw;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 410
    .line 411
    .line 412
    new-instance v6, La/adw;

    .line 413
    .line 414
    const/16 v13, 0x1c

    .line 415
    .line 416
    invoke-direct {v6, v15, v13}, La/adw;-><init>(Ljava/lang/Object;B)V

    .line 417
    .line 418
    .line 419
    invoke-static {}, La/vdx;->J()La/rfk0;

    .line 420
    .line 421
    .line 422
    move-result-object v13

    .line 423
    const/16 v16, 0x0

    .line 424
    .line 425
    if-eqz v13, :cond_d

    .line 426
    .line 427
    invoke-virtual {v13}, La/rfk0;->e()Lkotlin/jvm/functions/Function1;

    .line 428
    .line 429
    .line 430
    move-result-object v17

    .line 431
    move-object/from16 v22, v1

    .line 432
    .line 433
    move-object/from16 v1, v17

    .line 434
    .line 435
    :goto_d
    move/from16 v36, v3

    .line 436
    .line 437
    goto :goto_e

    .line 438
    :cond_d
    move-object/from16 v22, v1

    .line 439
    .line 440
    move-object/from16 v1, v16

    .line 441
    .line 442
    goto :goto_d

    .line 443
    :goto_e
    invoke-static {v13}, La/vdx;->W(La/rfk0;)La/rfk0;

    .line 444
    .line 445
    .line 446
    move-result-object v3

    .line 447
    move-object/from16 v21, v4

    .line 448
    .line 449
    :try_start_0
    invoke-virtual {v14}, La/d9z;->h()I

    .line 450
    .line 451
    .line 452
    move-result v4

    .line 453
    move-object/from16 v37, v6

    .line 454
    .line 455
    iget-object v6, v14, La/d9z;->d:La/t8z;

    .line 456
    .line 457
    move/from16 v38, v8

    .line 458
    .line 459
    iget-object v8, v6, La/t8z;->e:Ljava/lang/Object;

    .line 460
    .line 461
    invoke-static {v4, v2, v8}, La/k9x;->J(ILa/hbz;Ljava/lang/Object;)I

    .line 462
    .line 463
    .line 464
    move-result v8

    .line 465
    if-eq v4, v8, :cond_e

    .line 466
    .line 467
    move-object/from16 v39, v11

    .line 468
    .line 469
    iget-object v11, v6, La/t8z;->b:La/cgk0;

    .line 470
    .line 471
    invoke-virtual {v11, v8}, La/cgk0;->m(I)V

    .line 472
    .line 473
    .line 474
    iget-object v6, v6, La/t8z;->f:La/lbz;

    .line 475
    .line 476
    invoke-virtual {v6, v4}, La/lbz;->b(I)V

    .line 477
    .line 478
    .line 479
    goto :goto_f

    .line 480
    :cond_e
    move-object/from16 v39, v11

    .line 481
    .line 482
    :goto_f
    if-lt v8, v12, :cond_10

    .line 483
    .line 484
    if-gtz v12, :cond_f

    .line 485
    .line 486
    goto :goto_10

    .line 487
    :cond_f
    add-int/lit8 v4, v12, -0x1

    .line 488
    .line 489
    invoke-virtual {v15, v4}, La/y8z;->c(I)I

    .line 490
    .line 491
    .line 492
    move-result v4

    .line 493
    const/4 v6, 0x0

    .line 494
    goto :goto_11

    .line 495
    :catchall_0
    move-exception v0

    .line 496
    goto/16 :goto_5d

    .line 497
    .line 498
    :cond_10
    :goto_10
    invoke-virtual {v15, v8}, La/y8z;->c(I)I

    .line 499
    .line 500
    .line 501
    move-result v4

    .line 502
    invoke-virtual {v14}, La/d9z;->i()I

    .line 503
    .line 504
    .line 505
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 506
    :goto_11
    invoke-static {v13, v3, v1}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 507
    .line 508
    .line 509
    iget-object v1, v14, La/d9z;->q:La/qbz;

    .line 510
    .line 511
    iget-object v3, v14, La/d9z;->n:La/hru;

    .line 512
    .line 513
    invoke-static {v2, v1, v3}, La/c9x;->t(La/hbz;La/qbz;La/hru;)Landroidx/collection/MutableIntList;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    invoke-interface/range {v35 .. v35}, La/cnx;->M()Z

    .line 518
    .line 519
    .line 520
    move-result v2

    .line 521
    if-nez v2, :cond_12

    .line 522
    .line 523
    if-nez v26, :cond_11

    .line 524
    .line 525
    goto :goto_12

    .line 526
    :cond_11
    iget-object v2, v14, La/d9z;->v:La/ieu;

    .line 527
    .line 528
    iget-object v2, v2, La/ieu;->c:Ljava/lang/Object;

    .line 529
    .line 530
    check-cast v2, La/l73;

    .line 531
    .line 532
    iget-object v2, v2, La/l73;->b:La/pz40;

    .line 533
    .line 534
    check-cast v2, La/hgk0;

    .line 535
    .line 536
    invoke-virtual {v2}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v2

    .line 540
    check-cast v2, Ljava/lang/Number;

    .line 541
    .line 542
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 543
    .line 544
    .line 545
    move-result v2

    .line 546
    goto :goto_13

    .line 547
    :cond_12
    :goto_12
    iget v2, v14, La/d9z;->g:F

    .line 548
    .line 549
    :goto_13
    iget-object v3, v14, La/d9z;->m:La/dbz;

    .line 550
    .line 551
    invoke-interface/range {v35 .. v35}, La/cnx;->M()Z

    .line 552
    .line 553
    .line 554
    move-result v24

    .line 555
    iget-object v8, v14, La/d9z;->c:La/q8z;

    .line 556
    .line 557
    iget-object v11, v14, La/d9z;->r:La/pz40;

    .line 558
    .line 559
    if-ltz v7, :cond_13

    .line 560
    .line 561
    goto :goto_14

    .line 562
    :cond_13
    const-string v13, "negative beforeContentPadding"

    .line 563
    .line 564
    invoke-static {v13}, La/adx;->a(Ljava/lang/String;)V

    .line 565
    .line 566
    .line 567
    :goto_14
    if-ltz v38, :cond_14

    .line 568
    .line 569
    goto :goto_15

    .line 570
    :cond_14
    const-string v13, "negative afterContentPadding"

    .line 571
    .line 572
    invoke-static {v13}, La/adx;->a(Ljava/lang/String;)V

    .line 573
    .line 574
    .line 575
    :goto_15
    iget-boolean v13, v0, La/o8z;->b:Z

    .line 576
    .line 577
    iget-object v15, v0, La/o8z;->h:La/vne;

    .line 578
    .line 579
    move/from16 v17, v2

    .line 580
    .line 581
    iget-object v2, v0, La/o8z;->i:La/afv;

    .line 582
    .line 583
    move/from16 v19, v13

    .line 584
    .line 585
    move-object/from16 v40, v14

    .line 586
    .line 587
    const-wide/16 v13, 0x0

    .line 588
    .line 589
    if-gtz v12, :cond_17

    .line 590
    .line 591
    invoke-static/range {v45 .. v46}, La/p4e;->k(J)I

    .line 592
    .line 593
    .line 594
    move-result v18

    .line 595
    move/from16 v23, v19

    .line 596
    .line 597
    invoke-static/range {v45 .. v46}, La/p4e;->j(J)I

    .line 598
    .line 599
    .line 600
    move-result v19

    .line 601
    new-instance v20, Ljava/util/ArrayList;

    .line 602
    .line 603
    invoke-direct/range {v20 .. v20}, Ljava/util/ArrayList;-><init>()V

    .line 604
    .line 605
    .line 606
    const/16 v27, 0x0

    .line 607
    .line 608
    const/16 v28, 0x0

    .line 609
    .line 610
    const/16 v17, 0x0

    .line 611
    .line 612
    move-object/from16 v30, v2

    .line 613
    .line 614
    move-object/from16 v16, v3

    .line 615
    .line 616
    move-object/from16 v29, v15

    .line 617
    .line 618
    invoke-virtual/range {v16 .. v30}, La/dbz;->d(IIILjava/util/ArrayList;Landroidx/compose/foundation/lazy/layout/c;La/p4;ZZIZIILa/vne;La/afv;)V

    .line 619
    .line 620
    .line 621
    move-object/from16 v15, v16

    .line 622
    .line 623
    move/from16 v20, v23

    .line 624
    .line 625
    if-nez v24, :cond_15

    .line 626
    .line 627
    invoke-virtual {v15}, La/dbz;->b()J

    .line 628
    .line 629
    .line 630
    move-result-wide v0

    .line 631
    invoke-static {v0, v1, v13, v14}, La/qkx;->a(JJ)Z

    .line 632
    .line 633
    .line 634
    move-result v2

    .line 635
    if-nez v2, :cond_15

    .line 636
    .line 637
    shr-long v2, v0, v32

    .line 638
    .line 639
    long-to-int v2, v2

    .line 640
    move-wide/from16 v3, v45

    .line 641
    .line 642
    invoke-static {v2, v3, v4}, La/r4e;->g(IJ)I

    .line 643
    .line 644
    .line 645
    move-result v18

    .line 646
    and-long v0, v0, v33

    .line 647
    .line 648
    long-to-int v0, v0

    .line 649
    invoke-static {v0, v3, v4}, La/r4e;->f(IJ)I

    .line 650
    .line 651
    .line 652
    move-result v19

    .line 653
    :cond_15
    new-instance v0, La/djx;

    .line 654
    .line 655
    const/16 v1, 0x1d

    .line 656
    .line 657
    invoke-direct {v0, v1}, La/djx;-><init>(B)V

    .line 658
    .line 659
    .line 660
    add-int v1, v18, v44

    .line 661
    .line 662
    move-wide/from16 v2, p2

    .line 663
    .line 664
    invoke-static {v1, v2, v3}, La/r4e;->g(IJ)I

    .line 665
    .line 666
    .line 667
    move-result v1

    .line 668
    add-int v4, v19, v43

    .line 669
    .line 670
    invoke-static {v4, v2, v3}, La/r4e;->f(IJ)I

    .line 671
    .line 672
    .line 673
    move-result v2

    .line 674
    sget-object v3, La/lun;->a:La/lun;

    .line 675
    .line 676
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 677
    .line 678
    .line 679
    move-object/from16 v4, v35

    .line 680
    .line 681
    invoke-interface {v4, v1, v2, v3, v0}, La/vj30;->i0(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)La/uj30;

    .line 682
    .line 683
    .line 684
    move-result-object v5

    .line 685
    sget-object v14, La/iun;->a:La/iun;

    .line 686
    .line 687
    neg-int v15, v7

    .line 688
    add-int v16, v47, v38

    .line 689
    .line 690
    if-eqz v20, :cond_16

    .line 691
    .line 692
    sget-object v0, La/ma80;->a:La/ma80;

    .line 693
    .line 694
    :goto_16
    move-object/from16 v18, v0

    .line 695
    .line 696
    goto :goto_17

    .line 697
    :cond_16
    sget-object v0, La/ma80;->b:La/ma80;

    .line 698
    .line 699
    goto :goto_16

    .line 700
    :goto_17
    new-instance v0, La/q8z;

    .line 701
    .line 702
    const/4 v13, 0x0

    .line 703
    const/16 v17, 0x0

    .line 704
    .line 705
    const/4 v1, 0x0

    .line 706
    const/4 v2, 0x0

    .line 707
    const/4 v3, 0x0

    .line 708
    move-object/from16 v35, v4

    .line 709
    .line 710
    const/4 v4, 0x0

    .line 711
    const/4 v6, 0x0

    .line 712
    const/4 v7, 0x0

    .line 713
    move-object/from16 v9, p1

    .line 714
    .line 715
    move/from16 v10, v25

    .line 716
    .line 717
    move-object/from16 v8, v29

    .line 718
    .line 719
    move-object/from16 v55, v35

    .line 720
    .line 721
    move/from16 v20, v36

    .line 722
    .line 723
    move-object/from16 v12, v37

    .line 724
    .line 725
    move/from16 v19, v38

    .line 726
    .line 727
    move-object/from16 v11, v39

    .line 728
    .line 729
    move-object/from16 v56, v40

    .line 730
    .line 731
    invoke-direct/range {v0 .. v20}, La/q8z;-><init>(La/s8z;IZFLa/uj30;FZLa/vne;La/w6k;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILjava/util/List;IIILa/ma80;II)V

    .line 732
    .line 733
    .line 734
    goto/16 :goto_5c

    .line 735
    .line 736
    :cond_17
    move-object/from16 v30, v2

    .line 737
    .line 738
    move-object/from16 v51, v11

    .line 739
    .line 740
    move-object/from16 v29, v15

    .line 741
    .line 742
    move/from16 v20, v19

    .line 743
    .line 744
    move-object/from16 v55, v35

    .line 745
    .line 746
    move-object/from16 v57, v37

    .line 747
    .line 748
    move-object/from16 v11, v39

    .line 749
    .line 750
    move-object/from16 v56, v40

    .line 751
    .line 752
    move-wide/from16 v49, v45

    .line 753
    .line 754
    move-object/from16 v2, p1

    .line 755
    .line 756
    move-object v15, v3

    .line 757
    move-object/from16 v3, v22

    .line 758
    .line 759
    move/from16 v45, v36

    .line 760
    .line 761
    move/from16 v46, v38

    .line 762
    .line 763
    invoke-static/range {v17 .. v17}, Ljava/lang/Math;->round(F)I

    .line 764
    .line 765
    .line 766
    move-result v19

    .line 767
    sub-int v6, v6, v19

    .line 768
    .line 769
    if-nez v4, :cond_18

    .line 770
    .line 771
    if-gez v6, :cond_18

    .line 772
    .line 773
    add-int v19, v19, v6

    .line 774
    .line 775
    const/4 v6, 0x0

    .line 776
    :cond_18
    new-instance v13, La/xw3;

    .line 777
    .line 778
    invoke-direct {v13}, La/xw3;-><init>()V

    .line 779
    .line 780
    .line 781
    move-object/from16 v14, v16

    .line 782
    .line 783
    move-object/from16 v16, v15

    .line 784
    .line 785
    neg-int v15, v7

    .line 786
    if-gez v45, :cond_19

    .line 787
    .line 788
    move/from16 v22, v45

    .line 789
    .line 790
    goto :goto_18

    .line 791
    :cond_19
    const/16 v22, 0x0

    .line 792
    .line 793
    :goto_18
    add-int v14, v15, v22

    .line 794
    .line 795
    add-int/2addr v6, v14

    .line 796
    :goto_19
    if-gez v6, :cond_1a

    .line 797
    .line 798
    if-lez v4, :cond_1a

    .line 799
    .line 800
    add-int/lit8 v4, v4, -0x1

    .line 801
    .line 802
    move-object/from16 v58, v11

    .line 803
    .line 804
    invoke-virtual {v10, v4}, La/n8z;->b(I)La/s8z;

    .line 805
    .line 806
    .line 807
    move-result-object v11

    .line 808
    move/from16 v59, v15

    .line 809
    .line 810
    const/4 v15, 0x0

    .line 811
    invoke-virtual {v13, v15, v11}, La/xw3;->add(ILjava/lang/Object;)V

    .line 812
    .line 813
    .line 814
    iget v11, v11, La/s8z;->h:I

    .line 815
    .line 816
    add-int/2addr v6, v11

    .line 817
    move-object/from16 v11, v58

    .line 818
    .line 819
    move/from16 v15, v59

    .line 820
    .line 821
    goto :goto_19

    .line 822
    :cond_1a
    move-object/from16 v58, v11

    .line 823
    .line 824
    move/from16 v59, v15

    .line 825
    .line 826
    const/4 v15, 0x0

    .line 827
    if-ge v6, v14, :cond_1b

    .line 828
    .line 829
    sub-int v6, v14, v6

    .line 830
    .line 831
    sub-int v19, v19, v6

    .line 832
    .line 833
    move v6, v14

    .line 834
    :cond_1b
    move/from16 v11, v19

    .line 835
    .line 836
    sub-int/2addr v6, v14

    .line 837
    add-int v42, v47, v46

    .line 838
    .line 839
    if-gez v42, :cond_1c

    .line 840
    .line 841
    :goto_1a
    move/from16 v19, v4

    .line 842
    .line 843
    goto :goto_1b

    .line 844
    :cond_1c
    move/from16 v15, v42

    .line 845
    .line 846
    goto :goto_1a

    .line 847
    :goto_1b
    neg-int v4, v6

    .line 848
    move/from16 v28, v6

    .line 849
    .line 850
    move/from16 v35, v19

    .line 851
    .line 852
    const/16 v22, 0x0

    .line 853
    .line 854
    move v6, v4

    .line 855
    const/4 v4, 0x0

    .line 856
    :goto_1c
    iget v0, v13, La/xw3;->c:I

    .line 857
    .line 858
    if-ge v4, v0, :cond_1e

    .line 859
    .line 860
    if-lt v6, v15, :cond_1d

    .line 861
    .line 862
    invoke-virtual {v13, v4}, La/xw3;->e(I)Ljava/lang/Object;

    .line 863
    .line 864
    .line 865
    move/from16 v22, v31

    .line 866
    .line 867
    goto :goto_1c

    .line 868
    :cond_1d
    add-int/lit8 v35, v35, 0x1

    .line 869
    .line 870
    invoke-virtual {v13, v4}, La/xw3;->get(I)Ljava/lang/Object;

    .line 871
    .line 872
    .line 873
    move-result-object v0

    .line 874
    check-cast v0, La/s8z;

    .line 875
    .line 876
    iget v0, v0, La/s8z;->h:I

    .line 877
    .line 878
    add-int/2addr v6, v0

    .line 879
    add-int/lit8 v4, v4, 0x1

    .line 880
    .line 881
    goto :goto_1c

    .line 882
    :cond_1e
    move/from16 v4, v19

    .line 883
    .line 884
    move/from16 v60, v22

    .line 885
    .line 886
    move/from16 v0, v35

    .line 887
    .line 888
    :goto_1d
    if-ge v0, v12, :cond_20

    .line 889
    .line 890
    if-lt v6, v15, :cond_1f

    .line 891
    .line 892
    if-lez v6, :cond_1f

    .line 893
    .line 894
    invoke-virtual {v13}, La/xw3;->isEmpty()Z

    .line 895
    .line 896
    .line 897
    move-result v19

    .line 898
    if-eqz v19, :cond_20

    .line 899
    .line 900
    :cond_1f
    move/from16 v19, v4

    .line 901
    .line 902
    goto :goto_1f

    .line 903
    :cond_20
    move/from16 v19, v4

    .line 904
    .line 905
    :goto_1e
    move/from16 v0, v47

    .line 906
    .line 907
    goto :goto_21

    .line 908
    :goto_1f
    invoke-virtual {v10, v0}, La/n8z;->b(I)La/s8z;

    .line 909
    .line 910
    .line 911
    move-result-object v4

    .line 912
    move/from16 v22, v0

    .line 913
    .line 914
    iget v0, v4, La/s8z;->h:I

    .line 915
    .line 916
    move/from16 v35, v0

    .line 917
    .line 918
    iget-object v0, v4, La/s8z;->b:[La/r8z;

    .line 919
    .line 920
    move/from16 v36, v15

    .line 921
    .line 922
    array-length v15, v0

    .line 923
    if-nez v15, :cond_21

    .line 924
    .line 925
    goto :goto_1e

    .line 926
    :cond_21
    add-int v6, v6, v35

    .line 927
    .line 928
    if-gt v6, v14, :cond_22

    .line 929
    .line 930
    invoke-static {v0}, La/tx3;->O([Ljava/lang/Object;)Ljava/lang/Object;

    .line 931
    .line 932
    .line 933
    move-result-object v0

    .line 934
    check-cast v0, La/r8z;

    .line 935
    .line 936
    iget v0, v0, La/r8z;->a:I

    .line 937
    .line 938
    add-int/lit8 v15, v12, -0x1

    .line 939
    .line 940
    if-eq v0, v15, :cond_22

    .line 941
    .line 942
    add-int/lit8 v0, v22, 0x1

    .line 943
    .line 944
    sub-int v28, v28, v35

    .line 945
    .line 946
    move v4, v0

    .line 947
    move/from16 v60, v31

    .line 948
    .line 949
    goto :goto_20

    .line 950
    :cond_22
    invoke-virtual {v13, v4}, La/xw3;->addLast(Ljava/lang/Object;)V

    .line 951
    .line 952
    .line 953
    move/from16 v4, v19

    .line 954
    .line 955
    :goto_20
    add-int/lit8 v0, v22, 0x1

    .line 956
    .line 957
    move/from16 v15, v36

    .line 958
    .line 959
    goto :goto_1d

    .line 960
    :goto_21
    if-ge v6, v0, :cond_25

    .line 961
    .line 962
    sub-int v15, v0, v6

    .line 963
    .line 964
    sub-int v28, v28, v15

    .line 965
    .line 966
    add-int/2addr v6, v15

    .line 967
    move/from16 v4, v28

    .line 968
    .line 969
    :goto_22
    if-ge v4, v7, :cond_23

    .line 970
    .line 971
    if-lez v19, :cond_23

    .line 972
    .line 973
    add-int/lit8 v14, v19, -0x1

    .line 974
    .line 975
    move/from16 v19, v4

    .line 976
    .line 977
    invoke-virtual {v10, v14}, La/n8z;->b(I)La/s8z;

    .line 978
    .line 979
    .line 980
    move-result-object v4

    .line 981
    move/from16 v22, v6

    .line 982
    .line 983
    const/4 v6, 0x0

    .line 984
    invoke-virtual {v13, v6, v4}, La/xw3;->add(ILjava/lang/Object;)V

    .line 985
    .line 986
    .line 987
    iget v4, v4, La/s8z;->h:I

    .line 988
    .line 989
    add-int v4, v19, v4

    .line 990
    .line 991
    move/from16 v19, v14

    .line 992
    .line 993
    move/from16 v6, v22

    .line 994
    .line 995
    goto :goto_22

    .line 996
    :cond_23
    move/from16 v19, v4

    .line 997
    .line 998
    move/from16 v22, v6

    .line 999
    .line 1000
    add-int/2addr v15, v11

    .line 1001
    if-gez v19, :cond_24

    .line 1002
    .line 1003
    add-int v15, v15, v19

    .line 1004
    .line 1005
    add-int v6, v22, v19

    .line 1006
    .line 1007
    move v14, v6

    .line 1008
    const/4 v4, 0x0

    .line 1009
    goto :goto_23

    .line 1010
    :cond_24
    move/from16 v4, v19

    .line 1011
    .line 1012
    move/from16 v14, v22

    .line 1013
    .line 1014
    goto :goto_23

    .line 1015
    :cond_25
    move v14, v6

    .line 1016
    move v15, v11

    .line 1017
    move/from16 v4, v28

    .line 1018
    .line 1019
    :goto_23
    invoke-static/range {v17 .. v17}, Ljava/lang/Math;->round(F)I

    .line 1020
    .line 1021
    .line 1022
    move-result v6

    .line 1023
    invoke-static {v6}, Ljava/lang/Integer;->signum(I)I

    .line 1024
    .line 1025
    .line 1026
    move-result v6

    .line 1027
    move/from16 v47, v7

    .line 1028
    .line 1029
    invoke-static {v15}, Ljava/lang/Integer;->signum(I)I

    .line 1030
    .line 1031
    .line 1032
    move-result v7

    .line 1033
    if-ne v6, v7, :cond_26

    .line 1034
    .line 1035
    invoke-static/range {v17 .. v17}, Ljava/lang/Math;->round(F)I

    .line 1036
    .line 1037
    .line 1038
    move-result v6

    .line 1039
    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    .line 1040
    .line 1041
    .line 1042
    move-result v6

    .line 1043
    invoke-static {v15}, Ljava/lang/Math;->abs(I)I

    .line 1044
    .line 1045
    .line 1046
    move-result v7

    .line 1047
    if-lt v6, v7, :cond_26

    .line 1048
    .line 1049
    int-to-float v6, v15

    .line 1050
    move v7, v6

    .line 1051
    goto :goto_24

    .line 1052
    :cond_26
    move/from16 v7, v17

    .line 1053
    .line 1054
    :goto_24
    sub-float v6, v17, v7

    .line 1055
    .line 1056
    const/16 v17, 0x0

    .line 1057
    .line 1058
    if-eqz v24, :cond_27

    .line 1059
    .line 1060
    if-le v15, v11, :cond_27

    .line 1061
    .line 1062
    cmpg-float v19, v6, v17

    .line 1063
    .line 1064
    if-gtz v19, :cond_27

    .line 1065
    .line 1066
    sub-int/2addr v15, v11

    .line 1067
    int-to-float v11, v15

    .line 1068
    add-float v17, v11, v6

    .line 1069
    .line 1070
    :cond_27
    move/from16 v11, v17

    .line 1071
    .line 1072
    if-ltz v4, :cond_28

    .line 1073
    .line 1074
    goto :goto_25

    .line 1075
    :cond_28
    const-string v6, "negative initial offset"

    .line 1076
    .line 1077
    invoke-static {v6}, La/adx;->a(Ljava/lang/String;)V

    .line 1078
    .line 1079
    .line 1080
    :goto_25
    neg-int v6, v4

    .line 1081
    invoke-virtual {v13}, La/xw3;->h()Ljava/lang/Object;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v15

    .line 1085
    check-cast v15, La/s8z;

    .line 1086
    .line 1087
    move/from16 v17, v4

    .line 1088
    .line 1089
    if-eqz v15, :cond_29

    .line 1090
    .line 1091
    iget-object v4, v15, La/s8z;->b:[La/r8z;

    .line 1092
    .line 1093
    invoke-static {v4}, La/tx3;->B([Ljava/lang/Object;)Ljava/lang/Object;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v4

    .line 1097
    check-cast v4, La/r8z;

    .line 1098
    .line 1099
    if-eqz v4, :cond_29

    .line 1100
    .line 1101
    iget v4, v4, La/r8z;->a:I

    .line 1102
    .line 1103
    goto :goto_26

    .line 1104
    :cond_29
    const/4 v4, 0x0

    .line 1105
    :goto_26
    invoke-virtual {v13}, La/xw3;->k()Ljava/lang/Object;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v19

    .line 1109
    move/from16 v22, v6

    .line 1110
    .line 1111
    move-object/from16 v6, v19

    .line 1112
    .line 1113
    check-cast v6, La/s8z;

    .line 1114
    .line 1115
    if-eqz v6, :cond_2b

    .line 1116
    .line 1117
    iget-object v6, v6, La/s8z;->b:[La/r8z;

    .line 1118
    .line 1119
    move/from16 v61, v11

    .line 1120
    .line 1121
    array-length v11, v6

    .line 1122
    if-nez v11, :cond_2a

    .line 1123
    .line 1124
    const/4 v6, 0x0

    .line 1125
    goto :goto_27

    .line 1126
    :cond_2a
    array-length v11, v6

    .line 1127
    add-int/lit8 v11, v11, -0x1

    .line 1128
    .line 1129
    aget-object v6, v6, v11

    .line 1130
    .line 1131
    :goto_27
    if-eqz v6, :cond_2c

    .line 1132
    .line 1133
    iget v6, v6, La/r8z;->a:I

    .line 1134
    .line 1135
    move v11, v6

    .line 1136
    goto :goto_28

    .line 1137
    :cond_2b
    move/from16 v61, v11

    .line 1138
    .line 1139
    :cond_2c
    const/4 v11, 0x0

    .line 1140
    :goto_28
    iget-object v6, v1, Landroidx/collection/MutableIntList;->a:[I

    .line 1141
    .line 1142
    move-object/from16 v19, v6

    .line 1143
    .line 1144
    iget v6, v1, Landroidx/collection/MutableIntList;->b:I

    .line 1145
    .line 1146
    move-object/from16 v28, v15

    .line 1147
    .line 1148
    const/4 v15, 0x0

    .line 1149
    const/16 v54, 0x0

    .line 1150
    .line 1151
    :goto_29
    if-ge v15, v6, :cond_2f

    .line 1152
    .line 1153
    move/from16 v62, v6

    .line 1154
    .line 1155
    aget v6, v19, v15

    .line 1156
    .line 1157
    if-ltz v6, :cond_2e

    .line 1158
    .line 1159
    if-ge v6, v4, :cond_2e

    .line 1160
    .line 1161
    move/from16 v63, v4

    .line 1162
    .line 1163
    iget v4, v5, La/y8z;->i:I

    .line 1164
    .line 1165
    invoke-virtual {v5, v6}, La/y8z;->e(I)I

    .line 1166
    .line 1167
    .line 1168
    move-result v4

    .line 1169
    move/from16 v36, v6

    .line 1170
    .line 1171
    const/4 v6, 0x0

    .line 1172
    invoke-virtual {v10, v6, v4}, La/n8z;->a(II)J

    .line 1173
    .line 1174
    .line 1175
    move-result-wide v37

    .line 1176
    const/16 v39, 0x0

    .line 1177
    .line 1178
    iget v6, v3, La/m8z;->e:I

    .line 1179
    .line 1180
    move-object/from16 v35, v3

    .line 1181
    .line 1182
    move/from16 v40, v4

    .line 1183
    .line 1184
    move/from16 v41, v6

    .line 1185
    .line 1186
    invoke-virtual/range {v35 .. v41}, La/m8z;->n1(IJIII)La/r8z;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v3

    .line 1190
    move-object/from16 v4, v35

    .line 1191
    .line 1192
    if-nez v54, :cond_2d

    .line 1193
    .line 1194
    new-instance v6, Ljava/util/ArrayList;

    .line 1195
    .line 1196
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1197
    .line 1198
    .line 1199
    goto :goto_2a

    .line 1200
    :cond_2d
    move-object/from16 v6, v54

    .line 1201
    .line 1202
    :goto_2a
    invoke-interface {v6, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1203
    .line 1204
    .line 1205
    move-object/from16 v54, v6

    .line 1206
    .line 1207
    goto :goto_2b

    .line 1208
    :cond_2e
    move/from16 v63, v4

    .line 1209
    .line 1210
    move-object v4, v3

    .line 1211
    :goto_2b
    add-int/lit8 v15, v15, 0x1

    .line 1212
    .line 1213
    move-object v3, v4

    .line 1214
    move/from16 v6, v62

    .line 1215
    .line 1216
    move/from16 v4, v63

    .line 1217
    .line 1218
    goto :goto_29

    .line 1219
    :cond_2f
    move/from16 v63, v4

    .line 1220
    .line 1221
    move-object v4, v3

    .line 1222
    if-nez v54, :cond_30

    .line 1223
    .line 1224
    sget-object v54, La/iun;->a:La/iun;

    .line 1225
    .line 1226
    :cond_30
    move-object/from16 v3, v54

    .line 1227
    .line 1228
    if-eqz v24, :cond_3b

    .line 1229
    .line 1230
    if-eqz v8, :cond_3b

    .line 1231
    .line 1232
    iget-object v6, v8, La/q8z;->n:Ljava/util/List;

    .line 1233
    .line 1234
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 1235
    .line 1236
    .line 1237
    move-result v8

    .line 1238
    if-nez v8, :cond_3b

    .line 1239
    .line 1240
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 1241
    .line 1242
    .line 1243
    move-result v8

    .line 1244
    add-int/lit8 v8, v8, -0x1

    .line 1245
    .line 1246
    :goto_2c
    const/4 v15, -0x1

    .line 1247
    if-ge v15, v8, :cond_33

    .line 1248
    .line 1249
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v15

    .line 1253
    check-cast v15, La/r8z;

    .line 1254
    .line 1255
    iget v15, v15, La/r8z;->a:I

    .line 1256
    .line 1257
    if-le v15, v11, :cond_32

    .line 1258
    .line 1259
    if-eqz v8, :cond_31

    .line 1260
    .line 1261
    add-int/lit8 v15, v8, -0x1

    .line 1262
    .line 1263
    invoke-interface {v6, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v15

    .line 1267
    check-cast v15, La/r8z;

    .line 1268
    .line 1269
    iget v15, v15, La/r8z;->a:I

    .line 1270
    .line 1271
    if-gt v15, v11, :cond_32

    .line 1272
    .line 1273
    :cond_31
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v8

    .line 1277
    check-cast v8, La/r8z;

    .line 1278
    .line 1279
    goto :goto_2d

    .line 1280
    :cond_32
    add-int/lit8 v8, v8, -0x1

    .line 1281
    .line 1282
    goto :goto_2c

    .line 1283
    :cond_33
    const/4 v8, 0x0

    .line 1284
    :goto_2d
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v6

    .line 1288
    check-cast v6, La/r8z;

    .line 1289
    .line 1290
    invoke-static {v13}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v15

    .line 1294
    check-cast v15, La/s8z;

    .line 1295
    .line 1296
    if-eqz v15, :cond_34

    .line 1297
    .line 1298
    iget v15, v15, La/s8z;->a:I

    .line 1299
    .line 1300
    add-int/lit8 v15, v15, 0x1

    .line 1301
    .line 1302
    goto :goto_2e

    .line 1303
    :cond_34
    const/4 v15, 0x0

    .line 1304
    :goto_2e
    if-eqz v8, :cond_3b

    .line 1305
    .line 1306
    iget v8, v8, La/r8z;->a:I

    .line 1307
    .line 1308
    iget v6, v6, La/r8z;->a:I

    .line 1309
    .line 1310
    move/from16 v54, v11

    .line 1311
    .line 1312
    add-int/lit8 v11, v12, -0x1

    .line 1313
    .line 1314
    invoke-static {v6, v11}, Ljava/lang/Math;->min(II)I

    .line 1315
    .line 1316
    .line 1317
    move-result v6

    .line 1318
    if-gt v8, v6, :cond_3a

    .line 1319
    .line 1320
    const/4 v11, 0x0

    .line 1321
    :goto_2f
    if-eqz v11, :cond_37

    .line 1322
    .line 1323
    move-object/from16 v62, v9

    .line 1324
    .line 1325
    invoke-interface {v11}, Ljava/util/Collection;->size()I

    .line 1326
    .line 1327
    .line 1328
    move-result v9

    .line 1329
    move/from16 v64, v7

    .line 1330
    .line 1331
    const/4 v7, 0x0

    .line 1332
    :goto_30
    if-ge v7, v9, :cond_38

    .line 1333
    .line 1334
    invoke-interface {v11, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v19

    .line 1338
    move/from16 v35, v7

    .line 1339
    .line 1340
    move-object/from16 v7, v19

    .line 1341
    .line 1342
    check-cast v7, La/s8z;

    .line 1343
    .line 1344
    iget-object v7, v7, La/s8z;->b:[La/r8z;

    .line 1345
    .line 1346
    move/from16 v19, v9

    .line 1347
    .line 1348
    array-length v9, v7

    .line 1349
    move-object/from16 v36, v7

    .line 1350
    .line 1351
    const/4 v7, 0x0

    .line 1352
    :goto_31
    if-ge v7, v9, :cond_36

    .line 1353
    .line 1354
    move/from16 v37, v7

    .line 1355
    .line 1356
    aget-object v7, v36, v37

    .line 1357
    .line 1358
    iget v7, v7, La/r8z;->a:I

    .line 1359
    .line 1360
    if-ne v7, v8, :cond_35

    .line 1361
    .line 1362
    goto :goto_32

    .line 1363
    :cond_35
    add-int/lit8 v7, v37, 0x1

    .line 1364
    .line 1365
    goto :goto_31

    .line 1366
    :cond_36
    add-int/lit8 v7, v35, 0x1

    .line 1367
    .line 1368
    move/from16 v9, v19

    .line 1369
    .line 1370
    goto :goto_30

    .line 1371
    :cond_37
    move/from16 v64, v7

    .line 1372
    .line 1373
    move-object/from16 v62, v9

    .line 1374
    .line 1375
    :cond_38
    if-nez v11, :cond_39

    .line 1376
    .line 1377
    new-instance v7, Ljava/util/ArrayList;

    .line 1378
    .line 1379
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1380
    .line 1381
    .line 1382
    move-object v11, v7

    .line 1383
    :cond_39
    invoke-virtual {v10, v15}, La/n8z;->b(I)La/s8z;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v7

    .line 1387
    add-int/lit8 v15, v15, 0x1

    .line 1388
    .line 1389
    invoke-interface {v11, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1390
    .line 1391
    .line 1392
    :goto_32
    if-eq v8, v6, :cond_3c

    .line 1393
    .line 1394
    add-int/lit8 v8, v8, 0x1

    .line 1395
    .line 1396
    move-object/from16 v9, v62

    .line 1397
    .line 1398
    move/from16 v7, v64

    .line 1399
    .line 1400
    goto :goto_2f

    .line 1401
    :cond_3a
    move/from16 v64, v7

    .line 1402
    .line 1403
    move-object/from16 v62, v9

    .line 1404
    .line 1405
    goto :goto_33

    .line 1406
    :cond_3b
    move/from16 v64, v7

    .line 1407
    .line 1408
    move-object/from16 v62, v9

    .line 1409
    .line 1410
    move/from16 v54, v11

    .line 1411
    .line 1412
    :goto_33
    const/4 v11, 0x0

    .line 1413
    :cond_3c
    if-nez v11, :cond_3d

    .line 1414
    .line 1415
    sget-object v11, La/iun;->a:La/iun;

    .line 1416
    .line 1417
    :cond_3d
    iget-object v6, v1, Landroidx/collection/MutableIntList;->a:[I

    .line 1418
    .line 1419
    iget v1, v1, Landroidx/collection/MutableIntList;->b:I

    .line 1420
    .line 1421
    const/4 v7, 0x0

    .line 1422
    const/16 v27, 0x0

    .line 1423
    .line 1424
    :goto_34
    if-ge v7, v1, :cond_43

    .line 1425
    .line 1426
    aget v8, v6, v7

    .line 1427
    .line 1428
    add-int/lit8 v9, v54, 0x1

    .line 1429
    .line 1430
    if-gt v9, v8, :cond_42

    .line 1431
    .line 1432
    if-ge v8, v12, :cond_42

    .line 1433
    .line 1434
    if-eqz v24, :cond_40

    .line 1435
    .line 1436
    invoke-interface {v11}, Ljava/util/Collection;->size()I

    .line 1437
    .line 1438
    .line 1439
    move-result v9

    .line 1440
    const/4 v15, 0x0

    .line 1441
    :goto_35
    if-ge v15, v9, :cond_40

    .line 1442
    .line 1443
    invoke-interface {v11, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1444
    .line 1445
    .line 1446
    move-result-object v19

    .line 1447
    move/from16 v65, v1

    .line 1448
    .line 1449
    move-object/from16 v1, v19

    .line 1450
    .line 1451
    check-cast v1, La/s8z;

    .line 1452
    .line 1453
    iget-object v1, v1, La/s8z;->b:[La/r8z;

    .line 1454
    .line 1455
    move-object/from16 v19, v6

    .line 1456
    .line 1457
    array-length v6, v1

    .line 1458
    move-object/from16 v35, v1

    .line 1459
    .line 1460
    const/4 v1, 0x0

    .line 1461
    :goto_36
    if-ge v1, v6, :cond_3f

    .line 1462
    .line 1463
    move/from16 v36, v1

    .line 1464
    .line 1465
    aget-object v1, v35, v36

    .line 1466
    .line 1467
    iget v1, v1, La/r8z;->a:I

    .line 1468
    .line 1469
    if-ne v1, v8, :cond_3e

    .line 1470
    .line 1471
    move-object/from16 v35, v4

    .line 1472
    .line 1473
    goto :goto_37

    .line 1474
    :cond_3e
    add-int/lit8 v1, v36, 0x1

    .line 1475
    .line 1476
    goto :goto_36

    .line 1477
    :cond_3f
    add-int/lit8 v15, v15, 0x1

    .line 1478
    .line 1479
    move-object/from16 v6, v19

    .line 1480
    .line 1481
    move/from16 v1, v65

    .line 1482
    .line 1483
    goto :goto_35

    .line 1484
    :cond_40
    move/from16 v65, v1

    .line 1485
    .line 1486
    move-object/from16 v19, v6

    .line 1487
    .line 1488
    iget v1, v5, La/y8z;->i:I

    .line 1489
    .line 1490
    invoke-virtual {v5, v8}, La/y8z;->e(I)I

    .line 1491
    .line 1492
    .line 1493
    move-result v1

    .line 1494
    const/4 v6, 0x0

    .line 1495
    invoke-virtual {v10, v6, v1}, La/n8z;->a(II)J

    .line 1496
    .line 1497
    .line 1498
    move-result-wide v37

    .line 1499
    const/16 v39, 0x0

    .line 1500
    .line 1501
    iget v6, v4, La/m8z;->e:I

    .line 1502
    .line 1503
    move/from16 v40, v1

    .line 1504
    .line 1505
    move-object/from16 v35, v4

    .line 1506
    .line 1507
    move/from16 v41, v6

    .line 1508
    .line 1509
    move/from16 v36, v8

    .line 1510
    .line 1511
    invoke-virtual/range {v35 .. v41}, La/m8z;->n1(IJIII)La/r8z;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v1

    .line 1515
    if-nez v27, :cond_41

    .line 1516
    .line 1517
    new-instance v27, Ljava/util/ArrayList;

    .line 1518
    .line 1519
    invoke-direct/range {v27 .. v27}, Ljava/util/ArrayList;-><init>()V

    .line 1520
    .line 1521
    .line 1522
    :cond_41
    move-object/from16 v4, v27

    .line 1523
    .line 1524
    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1525
    .line 1526
    .line 1527
    move-object/from16 v27, v4

    .line 1528
    .line 1529
    goto :goto_37

    .line 1530
    :cond_42
    move/from16 v65, v1

    .line 1531
    .line 1532
    move-object/from16 v35, v4

    .line 1533
    .line 1534
    move-object/from16 v19, v6

    .line 1535
    .line 1536
    :goto_37
    add-int/lit8 v7, v7, 0x1

    .line 1537
    .line 1538
    move-object/from16 v6, v19

    .line 1539
    .line 1540
    move-object/from16 v4, v35

    .line 1541
    .line 1542
    move/from16 v1, v65

    .line 1543
    .line 1544
    goto :goto_34

    .line 1545
    :cond_43
    move-object/from16 v35, v4

    .line 1546
    .line 1547
    if-nez v27, :cond_44

    .line 1548
    .line 1549
    sget-object v27, La/iun;->a:La/iun;

    .line 1550
    .line 1551
    :cond_44
    move-object/from16 v1, v27

    .line 1552
    .line 1553
    if-gtz v47, :cond_46

    .line 1554
    .line 1555
    if-gez v45, :cond_45

    .line 1556
    .line 1557
    goto :goto_38

    .line 1558
    :cond_45
    move/from16 v27, v17

    .line 1559
    .line 1560
    move-object/from16 v15, v28

    .line 1561
    .line 1562
    goto :goto_3a

    .line 1563
    :cond_46
    :goto_38
    invoke-virtual {v13}, La/xw3;->b()I

    .line 1564
    .line 1565
    .line 1566
    move-result v4

    .line 1567
    move/from16 v6, v17

    .line 1568
    .line 1569
    move-object/from16 v15, v28

    .line 1570
    .line 1571
    const/4 v5, 0x0

    .line 1572
    :goto_39
    if-ge v5, v4, :cond_47

    .line 1573
    .line 1574
    invoke-virtual {v13, v5}, La/xw3;->get(I)Ljava/lang/Object;

    .line 1575
    .line 1576
    .line 1577
    move-result-object v7

    .line 1578
    check-cast v7, La/s8z;

    .line 1579
    .line 1580
    iget v7, v7, La/s8z;->h:I

    .line 1581
    .line 1582
    if-eqz v6, :cond_47

    .line 1583
    .line 1584
    if-gt v7, v6, :cond_47

    .line 1585
    .line 1586
    invoke-virtual {v13}, La/xw3;->b()I

    .line 1587
    .line 1588
    .line 1589
    move-result v8

    .line 1590
    add-int/lit8 v8, v8, -0x1

    .line 1591
    .line 1592
    if-eq v5, v8, :cond_47

    .line 1593
    .line 1594
    sub-int/2addr v6, v7

    .line 1595
    add-int/lit8 v5, v5, 0x1

    .line 1596
    .line 1597
    invoke-virtual {v13, v5}, La/xw3;->get(I)Ljava/lang/Object;

    .line 1598
    .line 1599
    .line 1600
    move-result-object v7

    .line 1601
    move-object v15, v7

    .line 1602
    check-cast v15, La/s8z;

    .line 1603
    .line 1604
    goto :goto_39

    .line 1605
    :cond_47
    move/from16 v27, v6

    .line 1606
    .line 1607
    :goto_3a
    if-eqz v20, :cond_48

    .line 1608
    .line 1609
    invoke-static/range {v49 .. v50}, La/p4e;->i(J)I

    .line 1610
    .line 1611
    .line 1612
    move-result v4

    .line 1613
    move-wide/from16 v7, v49

    .line 1614
    .line 1615
    :goto_3b
    move v9, v4

    .line 1616
    goto :goto_3c

    .line 1617
    :cond_48
    move-wide/from16 v7, v49

    .line 1618
    .line 1619
    invoke-static {v14, v7, v8}, La/r4e;->g(IJ)I

    .line 1620
    .line 1621
    .line 1622
    move-result v4

    .line 1623
    goto :goto_3b

    .line 1624
    :goto_3c
    if-eqz v20, :cond_49

    .line 1625
    .line 1626
    invoke-static {v14, v7, v8}, La/r4e;->f(IJ)I

    .line 1627
    .line 1628
    .line 1629
    move-result v4

    .line 1630
    :goto_3d
    move/from16 v19, v4

    .line 1631
    .line 1632
    goto :goto_3e

    .line 1633
    :cond_49
    invoke-static {v7, v8}, La/p4e;->h(J)I

    .line 1634
    .line 1635
    .line 1636
    move-result v4

    .line 1637
    goto :goto_3d

    .line 1638
    :goto_3e
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 1639
    .line 1640
    .line 1641
    move-result v4

    .line 1642
    if-eqz v4, :cond_4a

    .line 1643
    .line 1644
    goto :goto_3f

    .line 1645
    :cond_4a
    invoke-static {v13, v11}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1646
    .line 1647
    .line 1648
    move-result-object v13

    .line 1649
    :goto_3f
    move-object v4, v3

    .line 1650
    if-eqz v20, :cond_4b

    .line 1651
    .line 1652
    move/from16 v3, v19

    .line 1653
    .line 1654
    goto :goto_40

    .line 1655
    :cond_4b
    move v3, v9

    .line 1656
    :goto_40
    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    .line 1657
    .line 1658
    .line 1659
    move-result v5

    .line 1660
    if-ge v14, v5, :cond_4c

    .line 1661
    .line 1662
    move/from16 v5, v31

    .line 1663
    .line 1664
    goto :goto_41

    .line 1665
    :cond_4c
    const/4 v5, 0x0

    .line 1666
    :goto_41
    if-eqz v5, :cond_4e

    .line 1667
    .line 1668
    if-nez v22, :cond_4d

    .line 1669
    .line 1670
    goto :goto_42

    .line 1671
    :cond_4d
    const-string v6, "non-zero firstLineScrollOffset"

    .line 1672
    .line 1673
    invoke-static {v6}, La/adx;->c(Ljava/lang/String;)V

    .line 1674
    .line 1675
    .line 1676
    :cond_4e
    :goto_42
    invoke-interface {v13}, Ljava/util/Collection;->size()I

    .line 1677
    .line 1678
    .line 1679
    move-result v6

    .line 1680
    move/from16 v17, v5

    .line 1681
    .line 1682
    const/4 v5, 0x0

    .line 1683
    const/4 v11, 0x0

    .line 1684
    :goto_43
    if-ge v11, v6, :cond_4f

    .line 1685
    .line 1686
    invoke-interface {v13, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1687
    .line 1688
    .line 1689
    move-result-object v28

    .line 1690
    move/from16 v36, v6

    .line 1691
    .line 1692
    move-object/from16 v6, v28

    .line 1693
    .line 1694
    check-cast v6, La/s8z;

    .line 1695
    .line 1696
    iget-object v6, v6, La/s8z;->b:[La/r8z;

    .line 1697
    .line 1698
    array-length v6, v6

    .line 1699
    add-int/2addr v5, v6

    .line 1700
    add-int/lit8 v11, v11, 0x1

    .line 1701
    .line 1702
    move/from16 v6, v36

    .line 1703
    .line 1704
    goto :goto_43

    .line 1705
    :cond_4f
    new-instance v11, Ljava/util/ArrayList;

    .line 1706
    .line 1707
    invoke-direct {v11, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 1708
    .line 1709
    .line 1710
    if-eqz v17, :cond_59

    .line 1711
    .line 1712
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 1713
    .line 1714
    .line 1715
    move-result v4

    .line 1716
    if-eqz v4, :cond_50

    .line 1717
    .line 1718
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 1719
    .line 1720
    .line 1721
    move-result v1

    .line 1722
    if-eqz v1, :cond_50

    .line 1723
    .line 1724
    goto :goto_44

    .line 1725
    :cond_50
    const-string v1, "no items"

    .line 1726
    .line 1727
    invoke-static {v1}, La/adx;->a(Ljava/lang/String;)V

    .line 1728
    .line 1729
    .line 1730
    :goto_44
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 1731
    .line 1732
    .line 1733
    move-result v1

    .line 1734
    new-array v4, v1, [I

    .line 1735
    .line 1736
    const/4 v5, 0x0

    .line 1737
    :goto_45
    if-ge v5, v1, :cond_51

    .line 1738
    .line 1739
    invoke-interface {v13, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1740
    .line 1741
    .line 1742
    move-result-object v6

    .line 1743
    check-cast v6, La/s8z;

    .line 1744
    .line 1745
    iget v6, v6, La/s8z;->g:I

    .line 1746
    .line 1747
    aput v6, v4, v5

    .line 1748
    .line 1749
    add-int/lit8 v5, v5, 0x1

    .line 1750
    .line 1751
    goto :goto_45

    .line 1752
    :cond_51
    new-array v6, v1, [I

    .line 1753
    .line 1754
    if-eqz v20, :cond_53

    .line 1755
    .line 1756
    move-object/from16 v1, v48

    .line 1757
    .line 1758
    if-eqz v1, :cond_52

    .line 1759
    .line 1760
    invoke-interface {v1, v2, v3, v4, v6}, La/sw3;->c(La/w6k;I[I[I)V

    .line 1761
    .line 1762
    .line 1763
    move/from16 v37, v12

    .line 1764
    .line 1765
    move/from16 v28, v14

    .line 1766
    .line 1767
    move-object/from16 v36, v15

    .line 1768
    .line 1769
    move/from16 v12, v19

    .line 1770
    .line 1771
    move-wide/from16 v14, p2

    .line 1772
    .line 1773
    goto :goto_46

    .line 1774
    :cond_52
    const-string v0, "null verticalArrangement"

    .line 1775
    .line 1776
    invoke-static {v0}, La/w6x;->i(Ljava/lang/String;)La/rsy;

    .line 1777
    .line 1778
    .line 1779
    move-result-object v0

    .line 1780
    throw v0

    .line 1781
    :cond_53
    if-eqz v23, :cond_58

    .line 1782
    .line 1783
    sget-object v5, La/k6z;->a:La/k6z;

    .line 1784
    .line 1785
    move/from16 v37, v12

    .line 1786
    .line 1787
    move/from16 v28, v14

    .line 1788
    .line 1789
    move-object/from16 v36, v15

    .line 1790
    .line 1791
    move/from16 v12, v19

    .line 1792
    .line 1793
    move-object/from16 v1, v23

    .line 1794
    .line 1795
    move-wide/from16 v14, p2

    .line 1796
    .line 1797
    invoke-interface/range {v1 .. v6}, La/ow3;->b(La/w6k;I[ILa/k6z;[I)V

    .line 1798
    .line 1799
    .line 1800
    :goto_46
    invoke-static {v6}, La/tx3;->C([I)Lkotlin/ranges/IntRange;

    .line 1801
    .line 1802
    .line 1803
    move-result-object v1

    .line 1804
    iget v2, v1, Lkotlin/ranges/a;->b:I

    .line 1805
    .line 1806
    iget v1, v1, Lkotlin/ranges/a;->c:I

    .line 1807
    .line 1808
    if-lez v1, :cond_54

    .line 1809
    .line 1810
    if-gez v2, :cond_55

    .line 1811
    .line 1812
    :cond_54
    if-gez v1, :cond_57

    .line 1813
    .line 1814
    if-gtz v2, :cond_57

    .line 1815
    .line 1816
    :cond_55
    const/4 v3, 0x0

    .line 1817
    :goto_47
    aget v4, v6, v3

    .line 1818
    .line 1819
    invoke-interface {v13, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1820
    .line 1821
    .line 1822
    move-result-object v5

    .line 1823
    check-cast v5, La/s8z;

    .line 1824
    .line 1825
    invoke-virtual {v5, v4, v9, v12}, La/s8z;->a(III)[La/r8z;

    .line 1826
    .line 1827
    .line 1828
    move-result-object v4

    .line 1829
    array-length v5, v4

    .line 1830
    move/from16 v17, v1

    .line 1831
    .line 1832
    const/4 v1, 0x0

    .line 1833
    :goto_48
    if-ge v1, v5, :cond_56

    .line 1834
    .line 1835
    move/from16 v18, v1

    .line 1836
    .line 1837
    aget-object v1, v4, v18

    .line 1838
    .line 1839
    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1840
    .line 1841
    .line 1842
    add-int/lit8 v1, v18, 0x1

    .line 1843
    .line 1844
    goto :goto_48

    .line 1845
    :cond_56
    if-eq v3, v2, :cond_57

    .line 1846
    .line 1847
    add-int v3, v3, v17

    .line 1848
    .line 1849
    move/from16 v1, v17

    .line 1850
    .line 1851
    goto :goto_47

    .line 1852
    :cond_57
    move/from16 v4, v64

    .line 1853
    .line 1854
    const/4 v5, 0x0

    .line 1855
    goto/16 :goto_4e

    .line 1856
    .line 1857
    :cond_58
    const-string v0, "null horizontalArrangement"

    .line 1858
    .line 1859
    invoke-static {v0}, La/w6x;->i(Ljava/lang/String;)La/rsy;

    .line 1860
    .line 1861
    .line 1862
    move-result-object v0

    .line 1863
    throw v0

    .line 1864
    :cond_59
    move/from16 v37, v12

    .line 1865
    .line 1866
    move/from16 v28, v14

    .line 1867
    .line 1868
    move-object/from16 v36, v15

    .line 1869
    .line 1870
    move/from16 v12, v19

    .line 1871
    .line 1872
    move-wide/from16 v14, p2

    .line 1873
    .line 1874
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 1875
    .line 1876
    .line 1877
    move-result v2

    .line 1878
    const/16 v18, -0x1

    .line 1879
    .line 1880
    add-int/lit8 v2, v2, -0x1

    .line 1881
    .line 1882
    if-ltz v2, :cond_5b

    .line 1883
    .line 1884
    move/from16 v3, v22

    .line 1885
    .line 1886
    :goto_49
    add-int/lit8 v5, v2, -0x1

    .line 1887
    .line 1888
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1889
    .line 1890
    .line 1891
    move-result-object v2

    .line 1892
    check-cast v2, La/r8z;

    .line 1893
    .line 1894
    invoke-virtual {v2}, La/r8z;->m()I

    .line 1895
    .line 1896
    .line 1897
    move-result v6

    .line 1898
    sub-int/2addr v3, v6

    .line 1899
    const/4 v6, 0x0

    .line 1900
    invoke-virtual {v2, v3, v6, v9, v12}, La/r8z;->a(IIII)V

    .line 1901
    .line 1902
    .line 1903
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1904
    .line 1905
    .line 1906
    if-gez v5, :cond_5a

    .line 1907
    .line 1908
    goto :goto_4a

    .line 1909
    :cond_5a
    move v2, v5

    .line 1910
    goto :goto_49

    .line 1911
    :cond_5b
    :goto_4a
    invoke-interface {v13}, Ljava/util/Collection;->size()I

    .line 1912
    .line 1913
    .line 1914
    move-result v2

    .line 1915
    move/from16 v6, v22

    .line 1916
    .line 1917
    const/4 v3, 0x0

    .line 1918
    :goto_4b
    if-ge v3, v2, :cond_5d

    .line 1919
    .line 1920
    invoke-interface {v13, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1921
    .line 1922
    .line 1923
    move-result-object v4

    .line 1924
    check-cast v4, La/s8z;

    .line 1925
    .line 1926
    invoke-virtual {v4, v6, v9, v12}, La/s8z;->a(III)[La/r8z;

    .line 1927
    .line 1928
    .line 1929
    move-result-object v5

    .line 1930
    move/from16 v17, v2

    .line 1931
    .line 1932
    array-length v2, v5

    .line 1933
    move/from16 v18, v3

    .line 1934
    .line 1935
    const/4 v3, 0x0

    .line 1936
    :goto_4c
    if-ge v3, v2, :cond_5c

    .line 1937
    .line 1938
    move/from16 v19, v2

    .line 1939
    .line 1940
    aget-object v2, v5, v3

    .line 1941
    .line 1942
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1943
    .line 1944
    .line 1945
    add-int/lit8 v3, v3, 0x1

    .line 1946
    .line 1947
    move/from16 v2, v19

    .line 1948
    .line 1949
    goto :goto_4c

    .line 1950
    :cond_5c
    iget v2, v4, La/s8z;->h:I

    .line 1951
    .line 1952
    add-int/2addr v6, v2

    .line 1953
    add-int/lit8 v3, v18, 0x1

    .line 1954
    .line 1955
    move/from16 v2, v17

    .line 1956
    .line 1957
    goto :goto_4b

    .line 1958
    :cond_5d
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 1959
    .line 1960
    .line 1961
    move-result v2

    .line 1962
    const/4 v3, 0x0

    .line 1963
    :goto_4d
    if-ge v3, v2, :cond_5e

    .line 1964
    .line 1965
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1966
    .line 1967
    .line 1968
    move-result-object v4

    .line 1969
    check-cast v4, La/r8z;

    .line 1970
    .line 1971
    const/4 v5, 0x0

    .line 1972
    invoke-virtual {v4, v6, v5, v9, v12}, La/r8z;->a(IIII)V

    .line 1973
    .line 1974
    .line 1975
    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1976
    .line 1977
    .line 1978
    invoke-virtual {v4}, La/r8z;->m()I

    .line 1979
    .line 1980
    .line 1981
    move-result v4

    .line 1982
    add-int/2addr v6, v4

    .line 1983
    add-int/lit8 v3, v3, 0x1

    .line 1984
    .line 1985
    goto :goto_4d

    .line 1986
    :cond_5e
    const/4 v5, 0x0

    .line 1987
    move/from16 v4, v64

    .line 1988
    .line 1989
    :goto_4e
    float-to-int v1, v4

    .line 1990
    move/from16 v17, v1

    .line 1991
    .line 1992
    move/from16 v18, v9

    .line 1993
    .line 1994
    move/from16 v19, v12

    .line 1995
    .line 1996
    move/from16 v23, v20

    .line 1997
    .line 1998
    move-object/from16 v22, v35

    .line 1999
    .line 2000
    move-object/from16 v20, v11

    .line 2001
    .line 2002
    invoke-virtual/range {v16 .. v30}, La/dbz;->d(IIILjava/util/ArrayList;Landroidx/compose/foundation/lazy/layout/c;La/p4;ZZIZIILa/vne;La/afv;)V

    .line 2003
    .line 2004
    .line 2005
    move-object/from16 v3, v22

    .line 2006
    .line 2007
    move/from16 v53, v24

    .line 2008
    .line 2009
    move/from16 v1, v25

    .line 2010
    .line 2011
    move/from16 v2, v27

    .line 2012
    .line 2013
    move/from16 v6, v28

    .line 2014
    .line 2015
    const-wide/16 v17, 0x0

    .line 2016
    .line 2017
    if-nez v53, :cond_63

    .line 2018
    .line 2019
    move/from16 v28, v6

    .line 2020
    .line 2021
    invoke-virtual/range {v16 .. v16}, La/dbz;->b()J

    .line 2022
    .line 2023
    .line 2024
    move-result-wide v5

    .line 2025
    move v13, v1

    .line 2026
    move/from16 v27, v2

    .line 2027
    .line 2028
    move-wide/from16 v1, v17

    .line 2029
    .line 2030
    invoke-static {v5, v6, v1, v2}, La/qkx;->a(JJ)Z

    .line 2031
    .line 2032
    .line 2033
    move-result v1

    .line 2034
    if-nez v1, :cond_62

    .line 2035
    .line 2036
    if-eqz v23, :cond_5f

    .line 2037
    .line 2038
    move v1, v12

    .line 2039
    :goto_4f
    move/from16 v64, v4

    .line 2040
    .line 2041
    move-wide/from16 v16, v5

    .line 2042
    .line 2043
    goto :goto_50

    .line 2044
    :cond_5f
    move v1, v9

    .line 2045
    goto :goto_4f

    .line 2046
    :goto_50
    shr-long v4, v16, v32

    .line 2047
    .line 2048
    long-to-int v2, v4

    .line 2049
    invoke-static {v9, v2}, Ljava/lang/Math;->max(II)I

    .line 2050
    .line 2051
    .line 2052
    move-result v2

    .line 2053
    invoke-static {v2, v7, v8}, La/r4e;->g(IJ)I

    .line 2054
    .line 2055
    .line 2056
    move-result v9

    .line 2057
    and-long v4, v16, v33

    .line 2058
    .line 2059
    long-to-int v2, v4

    .line 2060
    invoke-static {v12, v2}, Ljava/lang/Math;->max(II)I

    .line 2061
    .line 2062
    .line 2063
    move-result v2

    .line 2064
    invoke-static {v2, v7, v8}, La/r4e;->f(IJ)I

    .line 2065
    .line 2066
    .line 2067
    move-result v19

    .line 2068
    if-eqz v23, :cond_60

    .line 2069
    .line 2070
    move/from16 v2, v19

    .line 2071
    .line 2072
    goto :goto_51

    .line 2073
    :cond_60
    move v2, v9

    .line 2074
    :goto_51
    if-eq v2, v1, :cond_61

    .line 2075
    .line 2076
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 2077
    .line 2078
    .line 2079
    move-result v1

    .line 2080
    const/4 v4, 0x0

    .line 2081
    :goto_52
    if-ge v4, v1, :cond_61

    .line 2082
    .line 2083
    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2084
    .line 2085
    .line 2086
    move-result-object v5

    .line 2087
    check-cast v5, La/r8z;

    .line 2088
    .line 2089
    iput v2, v5, La/r8z;->t:I

    .line 2090
    .line 2091
    iget v6, v5, La/r8z;->g:I

    .line 2092
    .line 2093
    add-int/2addr v6, v2

    .line 2094
    iput v6, v5, La/r8z;->v:I

    .line 2095
    .line 2096
    add-int/lit8 v4, v4, 0x1

    .line 2097
    .line 2098
    goto :goto_52

    .line 2099
    :cond_61
    :goto_53
    move/from16 v22, v9

    .line 2100
    .line 2101
    move-object/from16 v1, v62

    .line 2102
    .line 2103
    goto :goto_56

    .line 2104
    :cond_62
    :goto_54
    move/from16 v64, v4

    .line 2105
    .line 2106
    goto :goto_55

    .line 2107
    :cond_63
    move v13, v1

    .line 2108
    move/from16 v27, v2

    .line 2109
    .line 2110
    move/from16 v28, v6

    .line 2111
    .line 2112
    goto :goto_54

    .line 2113
    :goto_55
    move/from16 v19, v12

    .line 2114
    .line 2115
    goto :goto_53

    .line 2116
    :goto_56
    iget-object v1, v1, La/j8z;->b:La/i8z;

    .line 2117
    .line 2118
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2119
    .line 2120
    .line 2121
    sget-object v20, Landroidx/collection/IntListKt;->a:Landroidx/collection/MutableIntList;

    .line 2122
    .line 2123
    new-instance v1, La/okw;

    .line 2124
    .line 2125
    const/16 v2, 0x13

    .line 2126
    .line 2127
    invoke-direct {v1, v10, v3, v2}, La/okw;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2128
    .line 2129
    .line 2130
    move-object/from16 v2, p0

    .line 2131
    .line 2132
    iget-object v2, v2, La/o8z;->j:La/g9m0;

    .line 2133
    .line 2134
    move-object/from16 v25, v1

    .line 2135
    .line 2136
    move-object/from16 v16, v2

    .line 2137
    .line 2138
    move/from16 v24, v23

    .line 2139
    .line 2140
    move/from16 v21, v47

    .line 2141
    .line 2142
    move/from16 v18, v54

    .line 2143
    .line 2144
    move/from16 v17, v63

    .line 2145
    .line 2146
    move/from16 v23, v19

    .line 2147
    .line 2148
    move-object/from16 v19, v11

    .line 2149
    .line 2150
    invoke-static/range {v16 .. v25}, La/ucx;->V(La/g9m0;IILjava/util/ArrayList;Landroidx/collection/MutableIntList;IIIZLkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 2151
    .line 2152
    .line 2153
    move-result-object v52

    .line 2154
    move/from16 v4, v17

    .line 2155
    .line 2156
    move/from16 v6, v18

    .line 2157
    .line 2158
    move/from16 v20, v24

    .line 2159
    .line 2160
    add-int/lit8 v12, v37, -0x1

    .line 2161
    .line 2162
    if-ne v6, v12, :cond_65

    .line 2163
    .line 2164
    move/from16 v1, v28

    .line 2165
    .line 2166
    if-le v1, v0, :cond_64

    .line 2167
    .line 2168
    goto :goto_57

    .line 2169
    :cond_64
    const/4 v3, 0x0

    .line 2170
    goto :goto_58

    .line 2171
    :cond_65
    :goto_57
    move/from16 v3, v31

    .line 2172
    .line 2173
    :goto_58
    new-instance v49, La/p8z;

    .line 2174
    .line 2175
    const/16 v54, 0x0

    .line 2176
    .line 2177
    move-object/from16 v50, v51

    .line 2178
    .line 2179
    move-object/from16 v51, v19

    .line 2180
    .line 2181
    invoke-direct/range {v49 .. v54}, La/p8z;-><init>(La/pz40;Ljava/util/ArrayList;Ljava/util/List;ZB)V

    .line 2182
    .line 2183
    .line 2184
    move-object/from16 v1, v49

    .line 2185
    .line 2186
    move-object/from16 v11, v51

    .line 2187
    .line 2188
    move-object/from16 v0, v52

    .line 2189
    .line 2190
    add-int v2, v22, v44

    .line 2191
    .line 2192
    invoke-static {v2, v14, v15}, La/r4e;->g(IJ)I

    .line 2193
    .line 2194
    .line 2195
    move-result v2

    .line 2196
    add-int v5, v23, v43

    .line 2197
    .line 2198
    invoke-static {v5, v14, v15}, La/r4e;->f(IJ)I

    .line 2199
    .line 2200
    .line 2201
    move-result v5

    .line 2202
    sget-object v7, La/lun;->a:La/lun;

    .line 2203
    .line 2204
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2205
    .line 2206
    .line 2207
    move-object/from16 v8, v55

    .line 2208
    .line 2209
    invoke-interface {v8, v2, v5, v7, v1}, La/vj30;->i0(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)La/uj30;

    .line 2210
    .line 2211
    .line 2212
    move-result-object v5

    .line 2213
    invoke-static {v4, v6, v11, v0}, La/j120;->j0(IILjava/util/ArrayList;Ljava/util/List;)Ljava/util/List;

    .line 2214
    .line 2215
    .line 2216
    move-result-object v14

    .line 2217
    if-eqz v20, :cond_66

    .line 2218
    .line 2219
    sget-object v1, La/ma80;->a:La/ma80;

    .line 2220
    .line 2221
    :goto_59
    move-object/from16 v18, v1

    .line 2222
    .line 2223
    goto :goto_5a

    .line 2224
    :cond_66
    sget-object v1, La/ma80;->b:La/ma80;

    .line 2225
    .line 2226
    goto :goto_59

    .line 2227
    :goto_5a
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 2228
    .line 2229
    .line 2230
    move-result v1

    .line 2231
    move/from16 v25, v13

    .line 2232
    .line 2233
    const/4 v2, 0x0

    .line 2234
    const/4 v13, 0x0

    .line 2235
    :goto_5b
    if-ge v2, v1, :cond_67

    .line 2236
    .line 2237
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2238
    .line 2239
    .line 2240
    move-result-object v4

    .line 2241
    check-cast v4, La/r8z;

    .line 2242
    .line 2243
    iget v4, v4, La/r8z;->o:I

    .line 2244
    .line 2245
    add-int/2addr v13, v4

    .line 2246
    add-int/lit8 v2, v2, 0x1

    .line 2247
    .line 2248
    goto :goto_5b

    .line 2249
    :cond_67
    new-instance v0, La/q8z;

    .line 2250
    .line 2251
    move-object/from16 v9, p1

    .line 2252
    .line 2253
    move-object/from16 v35, v8

    .line 2254
    .line 2255
    move/from16 v10, v25

    .line 2256
    .line 2257
    move/from16 v2, v27

    .line 2258
    .line 2259
    move-object/from16 v8, v29

    .line 2260
    .line 2261
    move-object/from16 v1, v36

    .line 2262
    .line 2263
    move/from16 v17, v37

    .line 2264
    .line 2265
    move/from16 v16, v42

    .line 2266
    .line 2267
    move/from16 v20, v45

    .line 2268
    .line 2269
    move/from16 v19, v46

    .line 2270
    .line 2271
    move-object/from16 v12, v57

    .line 2272
    .line 2273
    move-object/from16 v11, v58

    .line 2274
    .line 2275
    move/from16 v15, v59

    .line 2276
    .line 2277
    move/from16 v7, v60

    .line 2278
    .line 2279
    move/from16 v6, v61

    .line 2280
    .line 2281
    move/from16 v4, v64

    .line 2282
    .line 2283
    invoke-direct/range {v0 .. v20}, La/q8z;-><init>(La/s8z;IZFLa/uj30;FZLa/vne;La/w6k;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILjava/util/List;IIILa/ma80;II)V

    .line 2284
    .line 2285
    .line 2286
    :goto_5c
    invoke-interface/range {v35 .. v35}, La/cnx;->M()Z

    .line 2287
    .line 2288
    .line 2289
    move-result v1

    .line 2290
    move-object/from16 v2, v56

    .line 2291
    .line 2292
    const/4 v6, 0x0

    .line 2293
    invoke-virtual {v2, v0, v1, v6}, La/d9z;->g(La/q8z;ZZ)V

    .line 2294
    .line 2295
    .line 2296
    iget-object v1, v2, La/d9z;->a:La/ovj;

    .line 2297
    .line 2298
    return-object v0

    .line 2299
    :goto_5d
    invoke-static {v13, v3, v1}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 2300
    .line 2301
    .line 2302
    throw v0

    .line 2303
    :cond_68
    const-string v0, "null horizontalArrangement when isVertical == false"

    .line 2304
    .line 2305
    invoke-static {v0}, La/w6x;->i(Ljava/lang/String;)La/rsy;

    .line 2306
    .line 2307
    .line 2308
    move-result-object v0

    .line 2309
    throw v0
.end method
