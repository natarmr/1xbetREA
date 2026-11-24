.class public final synthetic La/klp0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/llp0;


# direct methods
.method public synthetic constructor <init>(La/llp0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/klp0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/klp0;->b:La/llp0;

    return-void
.end method

.method public synthetic constructor <init>(La/llp0;IB)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/klp0;->a:B

    iput-object p1, p0, La/klp0;->b:La/llp0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 53

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/klp0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v0, v0, La/klp0;->b:La/llp0;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p1

    .line 12
    .line 13
    check-cast v1, La/fet;

    .line 14
    .line 15
    move-object/from16 v3, p2

    .line 16
    .line 17
    check-cast v3, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {v2}, La/x8x;->L(I)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-static {v0, v1, v2}, La/afn0;->g(La/llp0;La/fet;I)V

    .line 27
    .line 28
    .line 29
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    return-object v0

    .line 32
    :pswitch_0
    sget-object v1, La/gqw0;->v:La/shd;

    .line 33
    .line 34
    sget-object v3, La/gqw0;->y:La/shd;

    .line 35
    .line 36
    sget-object v4, La/gqw0;->w:La/shd;

    .line 37
    .line 38
    sget-object v5, La/gqw0;->x:La/shd;

    .line 39
    .line 40
    iget-object v0, v0, La/llp0;->b:La/a4x;

    .line 41
    .line 42
    move-object/from16 v13, p1

    .line 43
    .line 44
    check-cast v13, La/fet;

    .line 45
    .line 46
    move-object/from16 v6, p2

    .line 47
    .line 48
    check-cast v6, Ljava/lang/Integer;

    .line 49
    .line 50
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    sget-object v7, La/gqw0;->j:La/yx7;

    .line 55
    .line 56
    and-int/lit8 v8, v6, 0x3

    .line 57
    .line 58
    const/4 v9, 0x2

    .line 59
    const/4 v10, 0x0

    .line 60
    if-eq v8, v9, :cond_0

    .line 61
    .line 62
    move v8, v2

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    move v8, v10

    .line 65
    :goto_0
    and-int/2addr v6, v2

    .line 66
    invoke-virtual {v13, v6, v8}, La/fet;->U(IZ)Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-eqz v6, :cond_9

    .line 71
    .line 72
    sget-object v6, La/jm40;->b:La/jm40;

    .line 73
    .line 74
    const/high16 v8, 0x3f800000    # 1.0f

    .line 75
    .line 76
    invoke-static {v6, v8}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 77
    .line 78
    .line 79
    move-result-object v14

    .line 80
    sget-object v9, La/qmk;->a:La/zcl;

    .line 81
    .line 82
    const/high16 v18, 0x41000000    # 8.0f

    .line 83
    .line 84
    const/16 v19, 0x7

    .line 85
    .line 86
    const/4 v15, 0x0

    .line 87
    const/16 v16, 0x0

    .line 88
    .line 89
    const/16 v17, 0x0

    .line 90
    .line 91
    invoke-static/range {v14 .. v19}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    sget-object v11, La/uc9;->a:La/lw3;

    .line 96
    .line 97
    invoke-static {v11, v7, v13, v10}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 98
    .line 99
    .line 100
    move-result-object v11

    .line 101
    iget-wide v14, v13, La/fet;->T:J

    .line 102
    .line 103
    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    .line 104
    .line 105
    .line 106
    move-result v12

    .line 107
    invoke-virtual {v13}, La/fet;->m()La/bh90;

    .line 108
    .line 109
    .line 110
    move-result-object v14

    .line 111
    invoke-static {v13, v9}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 112
    .line 113
    .line 114
    move-result-object v9

    .line 115
    sget-object v15, La/mkd;->c0:La/gqw0;

    .line 116
    .line 117
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v13}, La/fet;->i0()V

    .line 121
    .line 122
    .line 123
    iget-boolean v15, v13, La/fet;->S:Z

    .line 124
    .line 125
    move/from16 v16, v15

    .line 126
    .line 127
    sget-object v15, La/e7z;->u1:La/pcy;

    .line 128
    .line 129
    if-eqz v16, :cond_1

    .line 130
    .line 131
    invoke-virtual {v13, v15}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_1
    invoke-virtual {v13}, La/fet;->r0()V

    .line 136
    .line 137
    .line 138
    :goto_1
    invoke-static {v13, v11, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 139
    .line 140
    .line 141
    invoke-static {v13, v14, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 142
    .line 143
    .line 144
    invoke-static {v12, v13, v3, v13}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 145
    .line 146
    .line 147
    const v11, -0x6fead1eb

    .line 148
    .line 149
    .line 150
    invoke-static {v13, v9, v1, v11, v0}, La/h97;->o(La/fet;La/mm40;La/shd;ILa/a4x;)Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object v31

    .line 154
    move v9, v10

    .line 155
    :goto_2
    invoke-interface/range {v31 .. v31}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v11

    .line 159
    if-eqz v11, :cond_8

    .line 160
    .line 161
    invoke-interface/range {v31 .. v31}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v11

    .line 165
    add-int/lit8 v32, v9, 0x1

    .line 166
    .line 167
    if-ltz v9, :cond_7

    .line 168
    .line 169
    check-cast v11, La/xem0;

    .line 170
    .line 171
    sget-object v12, La/qmk;->a:La/zcl;

    .line 172
    .line 173
    const/high16 v12, 0x41c00000    # 24.0f

    .line 174
    .line 175
    invoke-static {v6, v12}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 176
    .line 177
    .line 178
    move-result-object v12

    .line 179
    move-object/from16 p0, v3

    .line 180
    .line 181
    iget-wide v2, v11, La/xem0;->e:J

    .line 182
    .line 183
    iget v14, v11, La/xem0;->d:F

    .line 184
    .line 185
    sget-object v10, La/qmk;->d:La/zcl;

    .line 186
    .line 187
    sget-object v16, La/vgg0;->a:La/ugg0;

    .line 188
    .line 189
    new-instance v8, La/ugg0;

    .line 190
    .line 191
    invoke-direct {v8, v10, v10, v10, v10}, La/cne;-><init>(La/ene;La/ene;La/ene;La/ene;)V

    .line 192
    .line 193
    .line 194
    invoke-static {v12, v2, v3, v8}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    const/4 v3, 0x1

    .line 199
    const/high16 v8, 0x3f800000    # 1.0f

    .line 200
    .line 201
    invoke-static {v8, v2, v3}, La/dw9;->h(FLa/mm40;Z)La/mm40;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    sget-object v3, La/uc9;->e:La/nw3;

    .line 206
    .line 207
    const/4 v10, 0x6

    .line 208
    invoke-static {v3, v7, v13, v10}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    move/from16 p2, v9

    .line 213
    .line 214
    iget-wide v8, v13, La/fet;->T:J

    .line 215
    .line 216
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 217
    .line 218
    .line 219
    move-result v8

    .line 220
    invoke-virtual {v13}, La/fet;->m()La/bh90;

    .line 221
    .line 222
    .line 223
    move-result-object v9

    .line 224
    invoke-static {v13, v2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    sget-object v12, La/mkd;->c0:La/gqw0;

    .line 229
    .line 230
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v13}, La/fet;->i0()V

    .line 234
    .line 235
    .line 236
    iget-boolean v12, v13, La/fet;->S:Z

    .line 237
    .line 238
    if-eqz v12, :cond_2

    .line 239
    .line 240
    invoke-virtual {v13, v15}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 241
    .line 242
    .line 243
    goto :goto_3

    .line 244
    :cond_2
    invoke-virtual {v13}, La/fet;->r0()V

    .line 245
    .line 246
    .line 247
    :goto_3
    invoke-static {v13, v3, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 248
    .line 249
    .line 250
    invoke-static {v13, v9, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 251
    .line 252
    .line 253
    move-object/from16 v3, p0

    .line 254
    .line 255
    invoke-static {v8, v13, v3, v13}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 256
    .line 257
    .line 258
    invoke-static {v13, v2, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 259
    .line 260
    .line 261
    iget v2, v11, La/xem0;->a:I

    .line 262
    .line 263
    const/4 v8, 0x0

    .line 264
    invoke-static {v2, v8, v13}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    const/high16 v9, 0x41800000    # 16.0f

    .line 269
    .line 270
    invoke-static {v6, v9}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 271
    .line 272
    .line 273
    move-result-object v9

    .line 274
    sget-object v12, La/gqw0;->k:La/yx7;

    .line 275
    .line 276
    new-instance v8, La/ecu0;

    .line 277
    .line 278
    invoke-direct {v8, v12}, La/ecu0;-><init>(La/yx7;)V

    .line 279
    .line 280
    .line 281
    invoke-interface {v9, v8}, La/mm40;->e(La/mm40;)La/mm40;

    .line 282
    .line 283
    .line 284
    move-result-object v8

    .line 285
    invoke-static {v8, v14}, La/epv0;->N(La/mm40;F)La/mm40;

    .line 286
    .line 287
    .line 288
    move-result-object v8

    .line 289
    move v9, v14

    .line 290
    const/16 v14, 0x38

    .line 291
    .line 292
    move-object/from16 v16, v15

    .line 293
    .line 294
    const/16 v15, 0x78

    .line 295
    .line 296
    move-object/from16 v17, v7

    .line 297
    .line 298
    const/4 v7, 0x0

    .line 299
    move/from16 v18, v9

    .line 300
    .line 301
    const/4 v9, 0x0

    .line 302
    const/high16 v19, 0x3f800000    # 1.0f

    .line 303
    .line 304
    const/4 v10, 0x0

    .line 305
    move-object/from16 v20, v11

    .line 306
    .line 307
    const/4 v11, 0x0

    .line 308
    move-object/from16 v21, v12

    .line 309
    .line 310
    const/4 v12, 0x0

    .line 311
    move-object/from16 p0, v0

    .line 312
    .line 313
    move-object/from16 v33, v1

    .line 314
    .line 315
    move-object/from16 v35, v4

    .line 316
    .line 317
    move-object/from16 v37, v5

    .line 318
    .line 319
    move-object v4, v6

    .line 320
    move-object/from16 v36, v16

    .line 321
    .line 322
    move-object/from16 p1, v17

    .line 323
    .line 324
    move/from16 v34, v19

    .line 325
    .line 326
    move-object/from16 v1, v20

    .line 327
    .line 328
    const/4 v5, 0x0

    .line 329
    move/from16 v0, p2

    .line 330
    .line 331
    move-object v6, v2

    .line 332
    move-object/from16 p2, v3

    .line 333
    .line 334
    move/from16 v2, v18

    .line 335
    .line 336
    move-object/from16 v3, v21

    .line 337
    .line 338
    invoke-static/range {v6 .. v15}, La/j0x;->b(La/pm80;Ljava/lang/String;La/mm40;La/u12;La/qge;FLa/a4d;La/fet;II)V

    .line 339
    .line 340
    .line 341
    iget-boolean v6, v1, La/xem0;->c:Z

    .line 342
    .line 343
    if-eqz v6, :cond_5

    .line 344
    .line 345
    const v6, -0x7729f581

    .line 346
    .line 347
    .line 348
    invoke-virtual {v13, v6}, La/fet;->e0(I)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v6

    .line 355
    sget-object v7, La/ukd;->a:La/cl5;

    .line 356
    .line 357
    if-ne v6, v7, :cond_3

    .line 358
    .line 359
    sget-wide v8, La/qmk;->r:J

    .line 360
    .line 361
    new-instance v6, La/daq0;

    .line 362
    .line 363
    invoke-direct {v6, v8, v9}, La/daq0;-><init>(J)V

    .line 364
    .line 365
    .line 366
    invoke-static {v6}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 367
    .line 368
    .line 369
    move-result-object v6

    .line 370
    invoke-virtual {v13, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 371
    .line 372
    .line 373
    :cond_3
    check-cast v6, La/pz40;

    .line 374
    .line 375
    const/high16 v8, 0x40800000    # 4.0f

    .line 376
    .line 377
    invoke-static {v4, v8}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 378
    .line 379
    .line 380
    move-result-object v8

    .line 381
    invoke-static {v13, v8}, La/qxw;->o(La/fet;La/mm40;)V

    .line 382
    .line 383
    .line 384
    iget v1, v1, La/xem0;->b:I

    .line 385
    .line 386
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    new-instance v8, La/ecu0;

    .line 391
    .line 392
    invoke-direct {v8, v3}, La/ecu0;-><init>(La/yx7;)V

    .line 393
    .line 394
    .line 395
    invoke-static {v8, v2}, La/epv0;->N(La/mm40;F)La/mm40;

    .line 396
    .line 397
    .line 398
    move-result-object v2

    .line 399
    sget-object v3, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 400
    .line 401
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 402
    .line 403
    .line 404
    move-result-wide v8

    .line 405
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v3

    .line 409
    check-cast v3, La/daq0;

    .line 410
    .line 411
    iget-wide v11, v3, La/daq0;->a:J

    .line 412
    .line 413
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v3

    .line 417
    if-ne v3, v7, :cond_4

    .line 418
    .line 419
    new-instance v3, La/dbo0;

    .line 420
    .line 421
    const/4 v7, 0x3

    .line 422
    invoke-direct {v3, v6, v7}, La/dbo0;-><init>(La/pz40;B)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v13, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 426
    .line 427
    .line 428
    :cond_4
    move-object/from16 v25, v3

    .line 429
    .line 430
    check-cast v25, Lkotlin/jvm/functions/Function1;

    .line 431
    .line 432
    sget-object v44, La/j1t0;->a:La/qrq;

    .line 433
    .line 434
    sget-wide v41, La/qmk;->r:J

    .line 435
    .line 436
    sget-wide v50, La/qmk;->F:J

    .line 437
    .line 438
    new-instance v38, La/y9q0;

    .line 439
    .line 440
    const/16 v49, 0x0

    .line 441
    .line 442
    const v52, 0xfdffdd

    .line 443
    .line 444
    .line 445
    const-wide/16 v39, 0x0

    .line 446
    .line 447
    const/16 v43, 0x0

    .line 448
    .line 449
    const-wide/16 v45, 0x0

    .line 450
    .line 451
    const/16 v47, 0x0

    .line 452
    .line 453
    const/16 v48, 0x0

    .line 454
    .line 455
    invoke-direct/range {v38 .. v52}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 456
    .line 457
    .line 458
    const v29, 0x186180

    .line 459
    .line 460
    .line 461
    const v30, 0xafe8

    .line 462
    .line 463
    .line 464
    const/4 v10, 0x0

    .line 465
    move-object/from16 v27, v13

    .line 466
    .line 467
    const/4 v13, 0x0

    .line 468
    const/4 v14, 0x0

    .line 469
    const/4 v15, 0x0

    .line 470
    const-wide/16 v16, 0x0

    .line 471
    .line 472
    const/16 v18, 0x0

    .line 473
    .line 474
    const-wide/16 v19, 0x0

    .line 475
    .line 476
    const/16 v21, 0x2

    .line 477
    .line 478
    const/16 v22, 0x0

    .line 479
    .line 480
    const/16 v23, 0x1

    .line 481
    .line 482
    const/16 v24, 0x0

    .line 483
    .line 484
    const/16 v28, 0x0

    .line 485
    .line 486
    move-object v6, v1

    .line 487
    move-object v7, v2

    .line 488
    move-object/from16 v26, v38

    .line 489
    .line 490
    invoke-static/range {v6 .. v30}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 491
    .line 492
    .line 493
    move-object/from16 v13, v27

    .line 494
    .line 495
    invoke-virtual {v13, v5}, La/fet;->r(Z)V

    .line 496
    .line 497
    .line 498
    :goto_4
    const/4 v3, 0x1

    .line 499
    goto :goto_5

    .line 500
    :cond_5
    const v1, -0x771a3990

    .line 501
    .line 502
    .line 503
    invoke-virtual {v13, v1}, La/fet;->e0(I)V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v13, v5}, La/fet;->r(Z)V

    .line 507
    .line 508
    .line 509
    goto :goto_4

    .line 510
    :goto_5
    invoke-virtual {v13, v3}, La/fet;->r(Z)V

    .line 511
    .line 512
    .line 513
    invoke-static/range {p0 .. p0}, La/q3d;->i(Ljava/util/List;)I

    .line 514
    .line 515
    .line 516
    move-result v1

    .line 517
    if-eq v0, v1, :cond_6

    .line 518
    .line 519
    const v0, 0x4395637f

    .line 520
    .line 521
    .line 522
    invoke-virtual {v13, v0}, La/fet;->e0(I)V

    .line 523
    .line 524
    .line 525
    const/high16 v0, 0x40c00000    # 6.0f

    .line 526
    .line 527
    invoke-static {v4, v0}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    invoke-static {v13, v0}, La/qxw;->o(La/fet;La/mm40;)V

    .line 532
    .line 533
    .line 534
    invoke-virtual {v13, v5}, La/fet;->r(Z)V

    .line 535
    .line 536
    .line 537
    goto :goto_6

    .line 538
    :cond_6
    const v0, 0x4396848c

    .line 539
    .line 540
    .line 541
    invoke-virtual {v13, v0}, La/fet;->e0(I)V

    .line 542
    .line 543
    .line 544
    invoke-virtual {v13, v5}, La/fet;->r(Z)V

    .line 545
    .line 546
    .line 547
    :goto_6
    move-object/from16 v0, p0

    .line 548
    .line 549
    move-object/from16 v7, p1

    .line 550
    .line 551
    move-object/from16 v3, p2

    .line 552
    .line 553
    move-object v6, v4

    .line 554
    move v10, v5

    .line 555
    move/from16 v9, v32

    .line 556
    .line 557
    move-object/from16 v1, v33

    .line 558
    .line 559
    move/from16 v8, v34

    .line 560
    .line 561
    move-object/from16 v4, v35

    .line 562
    .line 563
    move-object/from16 v15, v36

    .line 564
    .line 565
    move-object/from16 v5, v37

    .line 566
    .line 567
    const/4 v2, 0x1

    .line 568
    goto/16 :goto_2

    .line 569
    .line 570
    :cond_7
    invoke-static {}, La/q3d;->p()V

    .line 571
    .line 572
    .line 573
    const/4 v0, 0x0

    .line 574
    throw v0

    .line 575
    :cond_8
    move v5, v10

    .line 576
    invoke-virtual {v13, v5}, La/fet;->r(Z)V

    .line 577
    .line 578
    .line 579
    const/4 v3, 0x1

    .line 580
    invoke-virtual {v13, v3}, La/fet;->r(Z)V

    .line 581
    .line 582
    .line 583
    goto :goto_7

    .line 584
    :cond_9
    invoke-virtual {v13}, La/fet;->X()V

    .line 585
    .line 586
    .line 587
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 588
    .line 589
    return-object v0

    .line 590
    :pswitch_1
    move v3, v2

    .line 591
    move-object/from16 v1, p1

    .line 592
    .line 593
    check-cast v1, La/fet;

    .line 594
    .line 595
    move-object/from16 v2, p2

    .line 596
    .line 597
    check-cast v2, Ljava/lang/Integer;

    .line 598
    .line 599
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 600
    .line 601
    .line 602
    invoke-static {v3}, La/x8x;->L(I)I

    .line 603
    .line 604
    .line 605
    move-result v2

    .line 606
    invoke-static {v0, v1, v2}, La/afn0;->g(La/llp0;La/fet;I)V

    .line 607
    .line 608
    .line 609
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 610
    .line 611
    return-object v0

    .line 612
    nop

    .line 613
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
