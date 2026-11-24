.class public final synthetic La/uam0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function0;

.field public final synthetic b:Z

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:La/l7m0;

.field public final synthetic f:La/ugd;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;ZIILa/l7m0;La/ugd;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/uam0;->a:Lkotlin/jvm/functions/Function0;

    iput-boolean p2, p0, La/uam0;->b:Z

    iput p3, p0, La/uam0;->c:I

    iput p4, p0, La/uam0;->d:I

    iput-object p5, p0, La/uam0;->e:La/l7m0;

    iput-object p6, p0, La/uam0;->f:La/ugd;

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 50

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/y5d;

    .line 6
    .line 7
    move-object/from16 v7, p2

    .line 8
    .line 9
    check-cast v7, La/fet;

    .line 10
    .line 11
    move-object/from16 v2, p3

    .line 12
    .line 13
    check-cast v2, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    and-int/lit8 v1, v2, 0x11

    .line 23
    .line 24
    const/16 v3, 0x10

    .line 25
    .line 26
    const/4 v10, 0x0

    .line 27
    const/4 v11, 0x1

    .line 28
    if-eq v1, v3, :cond_0

    .line 29
    .line 30
    move v1, v11

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v1, v10

    .line 33
    :goto_0
    and-int/2addr v2, v11

    .line 34
    invoke-virtual {v7, v2, v1}, La/fet;->U(IZ)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_7

    .line 39
    .line 40
    sget-object v12, La/jm40;->b:La/jm40;

    .line 41
    .line 42
    const/high16 v1, 0x3f800000    # 1.0f

    .line 43
    .line 44
    invoke-static {v12, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    sget-object v3, La/uc9;->c:La/mw3;

    .line 49
    .line 50
    sget-object v4, La/gqw0;->m:La/xx7;

    .line 51
    .line 52
    invoke-static {v3, v4, v7, v10}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    iget-wide v4, v7, La/fet;->T:J

    .line 57
    .line 58
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    invoke-virtual {v7}, La/fet;->m()La/bh90;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-static {v7, v2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    sget-object v6, La/mkd;->c0:La/gqw0;

    .line 71
    .line 72
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v7}, La/fet;->i0()V

    .line 76
    .line 77
    .line 78
    iget-boolean v6, v7, La/fet;->S:Z

    .line 79
    .line 80
    sget-object v8, La/e7z;->u1:La/pcy;

    .line 81
    .line 82
    if-eqz v6, :cond_1

    .line 83
    .line 84
    invoke-virtual {v7, v8}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    invoke-virtual {v7}, La/fet;->r0()V

    .line 89
    .line 90
    .line 91
    :goto_1
    sget-object v6, La/gqw0;->x:La/shd;

    .line 92
    .line 93
    invoke-static {v7, v3, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 94
    .line 95
    .line 96
    sget-object v3, La/gqw0;->w:La/shd;

    .line 97
    .line 98
    invoke-static {v7, v5, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 99
    .line 100
    .line 101
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    sget-object v5, La/gqw0;->y:La/shd;

    .line 106
    .line 107
    invoke-static {v7, v4, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 108
    .line 109
    .line 110
    invoke-static {v7}, La/jpm0;->n(La/fet;)V

    .line 111
    .line 112
    .line 113
    sget-object v4, La/gqw0;->v:La/shd;

    .line 114
    .line 115
    invoke-static {v7, v2, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    sget-object v9, La/ukd;->a:La/cl5;

    .line 123
    .line 124
    if-ne v2, v9, :cond_2

    .line 125
    .line 126
    invoke-static {v7}, La/dw9;->j(La/fet;)La/gy40;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    :cond_2
    move-object v13, v2

    .line 131
    check-cast v13, La/gy40;

    .line 132
    .line 133
    const/16 v16, 0x0

    .line 134
    .line 135
    const/16 v18, 0x1c

    .line 136
    .line 137
    const/4 v14, 0x0

    .line 138
    const/4 v15, 0x0

    .line 139
    iget-object v2, v0, La/uam0;->a:Lkotlin/jvm/functions/Function0;

    .line 140
    .line 141
    move-object/from16 v17, v2

    .line 142
    .line 143
    invoke-static/range {v12 .. v18}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    sget-object v13, La/gqw0;->k:La/yx7;

    .line 148
    .line 149
    sget-object v14, La/uc9;->a:La/lw3;

    .line 150
    .line 151
    const/16 v15, 0x30

    .line 152
    .line 153
    invoke-static {v14, v13, v7, v15}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 154
    .line 155
    .line 156
    move-result-object v13

    .line 157
    iget-wide v14, v7, La/fet;->T:J

    .line 158
    .line 159
    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    .line 160
    .line 161
    .line 162
    move-result v14

    .line 163
    invoke-virtual {v7}, La/fet;->m()La/bh90;

    .line 164
    .line 165
    .line 166
    move-result-object v15

    .line 167
    invoke-static {v7, v2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-virtual {v7}, La/fet;->i0()V

    .line 172
    .line 173
    .line 174
    iget-boolean v1, v7, La/fet;->S:Z

    .line 175
    .line 176
    if-eqz v1, :cond_3

    .line 177
    .line 178
    invoke-virtual {v7, v8}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 179
    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_3
    invoke-virtual {v7}, La/fet;->r0()V

    .line 183
    .line 184
    .line 185
    :goto_2
    invoke-static {v7, v13, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 186
    .line 187
    .line 188
    invoke-static {v7, v15, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 189
    .line 190
    .line 191
    invoke-static {v14, v7, v5, v7}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 192
    .line 193
    .line 194
    invoke-static {v7, v2, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 195
    .line 196
    .line 197
    sget-object v1, La/qmk;->a:La/zcl;

    .line 198
    .line 199
    const/high16 v16, 0x41400000    # 12.0f

    .line 200
    .line 201
    const/16 v17, 0x4

    .line 202
    .line 203
    const/high16 v13, 0x41400000    # 12.0f

    .line 204
    .line 205
    const/high16 v14, 0x41400000    # 12.0f

    .line 206
    .line 207
    const/4 v15, 0x0

    .line 208
    invoke-static/range {v12 .. v17}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    const/high16 v13, 0x41c00000    # 24.0f

    .line 213
    .line 214
    invoke-static {v1, v13}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    iget v2, v0, La/uam0;->c:I

    .line 219
    .line 220
    invoke-static {v2, v10, v7}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    sget-object v14, La/zaq0;->b:La/zfn;

    .line 225
    .line 226
    invoke-virtual {v7, v14}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v15

    .line 230
    check-cast v15, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 231
    .line 232
    invoke-virtual {v15}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 233
    .line 234
    .line 235
    move-result-wide v15

    .line 236
    move-object/from16 v17, v9

    .line 237
    .line 238
    const/4 v9, 0x0

    .line 239
    move-object/from16 v18, v3

    .line 240
    .line 241
    const/4 v3, 0x0

    .line 242
    move-object/from16 v19, v8

    .line 243
    .line 244
    const/16 v8, 0x38

    .line 245
    .line 246
    move-object/from16 v27, v4

    .line 247
    .line 248
    move-object/from16 v29, v17

    .line 249
    .line 250
    move-object/from16 v28, v19

    .line 251
    .line 252
    move-object v4, v1

    .line 253
    move-object v1, v6

    .line 254
    move-wide/from16 v48, v15

    .line 255
    .line 256
    move-object v15, v5

    .line 257
    move-wide/from16 v5, v48

    .line 258
    .line 259
    invoke-static/range {v2 .. v9}, La/dww;->c(La/pm80;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 260
    .line 261
    .line 262
    move/from16 v30, v8

    .line 263
    .line 264
    const/16 v16, 0x0

    .line 265
    .line 266
    const/16 v17, 0xe

    .line 267
    .line 268
    move v2, v13

    .line 269
    const/high16 v13, 0x41000000    # 8.0f

    .line 270
    .line 271
    move-object v3, v14

    .line 272
    const/4 v14, 0x0

    .line 273
    move-object v4, v15

    .line 274
    const/4 v15, 0x0

    .line 275
    invoke-static/range {v12 .. v17}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 276
    .line 277
    .line 278
    move-result-object v5

    .line 279
    move-object/from16 v31, v12

    .line 280
    .line 281
    const/high16 v6, 0x3f800000    # 1.0f

    .line 282
    .line 283
    invoke-static {v6, v5, v11}, La/dw9;->h(FLa/mm40;Z)La/mm40;

    .line 284
    .line 285
    .line 286
    move-result-object v5

    .line 287
    iget v6, v0, La/uam0;->d:I

    .line 288
    .line 289
    invoke-static {v6, v10, v7}, La/rsm0;->w(IILa/fet;)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v6

    .line 293
    sget-object v38, La/j1t0;->c:La/qrq;

    .line 294
    .line 295
    sget-wide v35, La/qmk;->r:J

    .line 296
    .line 297
    sget-wide v44, La/qmk;->F:J

    .line 298
    .line 299
    new-instance v32, La/y9q0;

    .line 300
    .line 301
    const/16 v43, 0x0

    .line 302
    .line 303
    const v46, 0xfdffdd

    .line 304
    .line 305
    .line 306
    const-wide/16 v33, 0x0

    .line 307
    .line 308
    const/16 v37, 0x0

    .line 309
    .line 310
    const-wide/16 v39, 0x0

    .line 311
    .line 312
    const/16 v41, 0x0

    .line 313
    .line 314
    const/16 v42, 0x0

    .line 315
    .line 316
    invoke-direct/range {v32 .. v46}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 317
    .line 318
    .line 319
    move-object/from16 v8, v32

    .line 320
    .line 321
    invoke-static {v8, v7}, La/ibm0;->t(La/y9q0;La/fet;)La/y9q0;

    .line 322
    .line 323
    .line 324
    move-result-object v22

    .line 325
    const/16 v25, 0x6180

    .line 326
    .line 327
    const v26, 0x1affc

    .line 328
    .line 329
    .line 330
    move-object v8, v3

    .line 331
    move-object v15, v4

    .line 332
    move-object v3, v5

    .line 333
    const-wide/16 v4, 0x0

    .line 334
    .line 335
    move v9, v2

    .line 336
    move-object v2, v6

    .line 337
    const/4 v6, 0x0

    .line 338
    move-object/from16 v23, v7

    .line 339
    .line 340
    move-object v12, v8

    .line 341
    const-wide/16 v7, 0x0

    .line 342
    .line 343
    move v13, v9

    .line 344
    const/4 v9, 0x0

    .line 345
    move v14, v10

    .line 346
    const/4 v10, 0x0

    .line 347
    move/from16 v16, v11

    .line 348
    .line 349
    const/4 v11, 0x0

    .line 350
    move-object/from16 v17, v12

    .line 351
    .line 352
    move/from16 v19, v13

    .line 353
    .line 354
    const-wide/16 v12, 0x0

    .line 355
    .line 356
    move/from16 v20, v14

    .line 357
    .line 358
    const/4 v14, 0x0

    .line 359
    move-object/from16 v21, v15

    .line 360
    .line 361
    move/from16 v24, v16

    .line 362
    .line 363
    const-wide/16 v15, 0x0

    .line 364
    .line 365
    move-object/from16 v32, v17

    .line 366
    .line 367
    const/16 v17, 0x2

    .line 368
    .line 369
    move-object/from16 v33, v18

    .line 370
    .line 371
    const/16 v18, 0x0

    .line 372
    .line 373
    move/from16 v34, v19

    .line 374
    .line 375
    const/16 v19, 0x2

    .line 376
    .line 377
    move/from16 v35, v20

    .line 378
    .line 379
    const/16 v20, 0x0

    .line 380
    .line 381
    move-object/from16 v36, v21

    .line 382
    .line 383
    const/16 v21, 0x0

    .line 384
    .line 385
    move/from16 v37, v24

    .line 386
    .line 387
    const/16 v24, 0x0

    .line 388
    .line 389
    move-object/from16 v0, v32

    .line 390
    .line 391
    move-object/from16 v47, v36

    .line 392
    .line 393
    move-object/from16 v32, v1

    .line 394
    .line 395
    move/from16 v1, v34

    .line 396
    .line 397
    invoke-static/range {v2 .. v26}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 398
    .line 399
    .line 400
    move-object/from16 v7, v23

    .line 401
    .line 402
    const/16 v16, 0x0

    .line 403
    .line 404
    const/16 v17, 0xb

    .line 405
    .line 406
    const/4 v13, 0x0

    .line 407
    const/4 v14, 0x0

    .line 408
    const/high16 v15, 0x41400000    # 12.0f

    .line 409
    .line 410
    move-object/from16 v12, v31

    .line 411
    .line 412
    invoke-static/range {v12 .. v17}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 413
    .line 414
    .line 415
    move-result-object v2

    .line 416
    invoke-static {v2, v1}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 417
    .line 418
    .line 419
    move-result-object v1

    .line 420
    invoke-virtual {v7, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    check-cast v2, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 425
    .line 426
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 427
    .line 428
    .line 429
    move-result-wide v2

    .line 430
    sget-object v4, La/vgg0;->a:La/ugg0;

    .line 431
    .line 432
    invoke-static {v1, v2, v3, v4}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 433
    .line 434
    .line 435
    move-result-object v1

    .line 436
    sget-object v2, La/gqw0;->a:La/zx7;

    .line 437
    .line 438
    const/4 v14, 0x0

    .line 439
    invoke-static {v2, v14}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 440
    .line 441
    .line 442
    move-result-object v2

    .line 443
    iget-wide v3, v7, La/fet;->T:J

    .line 444
    .line 445
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 446
    .line 447
    .line 448
    move-result v3

    .line 449
    invoke-virtual {v7}, La/fet;->m()La/bh90;

    .line 450
    .line 451
    .line 452
    move-result-object v4

    .line 453
    invoke-static {v7, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 454
    .line 455
    .line 456
    move-result-object v1

    .line 457
    invoke-virtual {v7}, La/fet;->i0()V

    .line 458
    .line 459
    .line 460
    iget-boolean v5, v7, La/fet;->S:Z

    .line 461
    .line 462
    if-eqz v5, :cond_4

    .line 463
    .line 464
    move-object/from16 v5, v28

    .line 465
    .line 466
    invoke-virtual {v7, v5}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 467
    .line 468
    .line 469
    :goto_3
    move-object/from16 v5, v32

    .line 470
    .line 471
    goto :goto_4

    .line 472
    :cond_4
    invoke-virtual {v7}, La/fet;->r0()V

    .line 473
    .line 474
    .line 475
    goto :goto_3

    .line 476
    :goto_4
    invoke-static {v7, v2, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 477
    .line 478
    .line 479
    move-object/from16 v2, v33

    .line 480
    .line 481
    invoke-static {v7, v4, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 482
    .line 483
    .line 484
    move-object/from16 v15, v47

    .line 485
    .line 486
    invoke-static {v3, v7, v15, v7}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 487
    .line 488
    .line 489
    move-object/from16 v2, v27

    .line 490
    .line 491
    invoke-static {v7, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 492
    .line 493
    .line 494
    const v1, 0x7f080203

    .line 495
    .line 496
    .line 497
    invoke-static {v1, v14, v7}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 498
    .line 499
    .line 500
    move-result-object v2

    .line 501
    const/high16 v1, 0x41800000    # 16.0f

    .line 502
    .line 503
    invoke-static {v12, v1}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 504
    .line 505
    .line 506
    move-result-object v1

    .line 507
    sget-object v3, La/gqw0;->e:La/zx7;

    .line 508
    .line 509
    sget-object v4, La/jr8;->a:La/jr8;

    .line 510
    .line 511
    invoke-virtual {v4, v1, v3}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 512
    .line 513
    .line 514
    move-result-object v1

    .line 515
    move-object/from16 v10, p0

    .line 516
    .line 517
    iget-object v3, v10, La/uam0;->e:La/l7m0;

    .line 518
    .line 519
    invoke-virtual {v7, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 520
    .line 521
    .line 522
    move-result v4

    .line 523
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v5

    .line 527
    if-nez v4, :cond_5

    .line 528
    .line 529
    move-object/from16 v4, v29

    .line 530
    .line 531
    if-ne v5, v4, :cond_6

    .line 532
    .line 533
    :cond_5
    new-instance v5, La/ufp;

    .line 534
    .line 535
    const/16 v4, 0x19

    .line 536
    .line 537
    invoke-direct {v5, v3, v4}, La/ufp;-><init>(La/l7m0;B)V

    .line 538
    .line 539
    .line 540
    invoke-virtual {v7, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 541
    .line 542
    .line 543
    :cond_6
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 544
    .line 545
    invoke-static {v1, v5}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 546
    .line 547
    .line 548
    move-result-object v4

    .line 549
    invoke-virtual {v7, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v1

    .line 553
    check-cast v1, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 554
    .line 555
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 556
    .line 557
    .line 558
    move-result-wide v5

    .line 559
    const/4 v3, 0x0

    .line 560
    const/4 v9, 0x0

    .line 561
    move/from16 v8, v30

    .line 562
    .line 563
    invoke-static/range {v2 .. v9}, La/dww;->c(La/pm80;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 564
    .line 565
    .line 566
    const/4 v1, 0x1

    .line 567
    invoke-virtual {v7, v1}, La/fet;->r(Z)V

    .line 568
    .line 569
    .line 570
    invoke-virtual {v7, v1}, La/fet;->r(Z)V

    .line 571
    .line 572
    .line 573
    invoke-virtual {v7, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v0

    .line 577
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 578
    .line 579
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 580
    .line 581
    .line 582
    move-result-wide v2

    .line 583
    sget-object v0, La/jd8;->n:La/ljc;

    .line 584
    .line 585
    invoke-static {v12, v2, v3, v0}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 586
    .line 587
    .line 588
    move-result-object v4

    .line 589
    new-instance v0, La/uis;

    .line 590
    .line 591
    const/16 v2, 0x9

    .line 592
    .line 593
    iget-object v3, v10, La/uam0;->f:La/ugd;

    .line 594
    .line 595
    invoke-direct {v0, v3, v2}, La/uis;-><init>(La/ugd;B)V

    .line 596
    .line 597
    .line 598
    const v2, -0x6a31619d

    .line 599
    .line 600
    .line 601
    invoke-static {v2, v0, v7}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 602
    .line 603
    .line 604
    move-result-object v8

    .line 605
    const v0, 0x180006

    .line 606
    .line 607
    .line 608
    const/16 v11, 0x1c

    .line 609
    .line 610
    sget-object v2, La/y5d;->a:La/y5d;

    .line 611
    .line 612
    iget-boolean v3, v10, La/uam0;->b:Z

    .line 613
    .line 614
    const/4 v5, 0x0

    .line 615
    const/4 v6, 0x0

    .line 616
    move-object/from16 v23, v7

    .line 617
    .line 618
    const/4 v7, 0x0

    .line 619
    move v10, v0

    .line 620
    move-object/from16 v9, v23

    .line 621
    .line 622
    invoke-static/range {v2 .. v11}, La/b34;->e(La/y5d;ZLa/mm40;La/pzn;La/alo;Ljava/lang/String;La/ugd;La/fet;II)V

    .line 623
    .line 624
    .line 625
    move-object v7, v9

    .line 626
    invoke-virtual {v7, v1}, La/fet;->r(Z)V

    .line 627
    .line 628
    .line 629
    goto :goto_5

    .line 630
    :cond_7
    invoke-virtual {v7}, La/fet;->X()V

    .line 631
    .line 632
    .line 633
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 634
    .line 635
    return-object v0
.end method
