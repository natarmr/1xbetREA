.class public final synthetic La/mad;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/dax;


# direct methods
.method public synthetic constructor <init>(La/dax;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/mad;->a:B

    iput-object p1, p0, La/mad;->b:La/dax;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/mad;->a:B

    .line 4
    .line 5
    const/16 v2, 0x90

    .line 6
    .line 7
    const/16 v3, 0x10

    .line 8
    .line 9
    const/16 v4, 0x20

    .line 10
    .line 11
    iget-object v0, v0, La/mad;->b:La/dax;

    .line 12
    .line 13
    const/4 v5, 0x3

    .line 14
    const/4 v6, 0x1

    .line 15
    const/4 v7, 0x0

    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    move-object/from16 v1, p1

    .line 20
    .line 21
    check-cast v1, La/y5d;

    .line 22
    .line 23
    move-object/from16 v8, p2

    .line 24
    .line 25
    check-cast v8, La/mm40;

    .line 26
    .line 27
    move-object/from16 v9, p3

    .line 28
    .line 29
    check-cast v9, La/fet;

    .line 30
    .line 31
    move-object/from16 v10, p4

    .line 32
    .line 33
    check-cast v10, Ljava/lang/Integer;

    .line 34
    .line 35
    invoke-static {v10, v1, v8}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    and-int/lit8 v10, v1, 0x30

    .line 40
    .line 41
    if-nez v10, :cond_1

    .line 42
    .line 43
    invoke-virtual {v9, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v10

    .line 47
    if-eqz v10, :cond_0

    .line 48
    .line 49
    move v3, v4

    .line 50
    :cond_0
    or-int/2addr v1, v3

    .line 51
    :cond_1
    and-int/lit16 v3, v1, 0x91

    .line 52
    .line 53
    if-eq v3, v2, :cond_2

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    move v6, v7

    .line 57
    :goto_0
    and-int/lit8 v2, v1, 0x1

    .line 58
    .line 59
    invoke-virtual {v9, v2, v6}, La/fet;->U(IZ)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_6

    .line 64
    .line 65
    iget-object v0, v0, La/dax;->b:La/sad;

    .line 66
    .line 67
    shr-int/2addr v1, v5

    .line 68
    instance-of v2, v0, La/pad;

    .line 69
    .line 70
    if-eqz v2, :cond_3

    .line 71
    .line 72
    const v2, -0x72fdb261

    .line 73
    .line 74
    .line 75
    invoke-virtual {v9, v2}, La/fet;->e0(I)V

    .line 76
    .line 77
    .line 78
    check-cast v0, La/pad;

    .line 79
    .line 80
    and-int/lit8 v1, v1, 0xe

    .line 81
    .line 82
    invoke-static {v8, v0, v9, v1}, La/feb;->d(La/mm40;La/pad;La/fet;I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v9, v7}, La/fet;->r(Z)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    instance-of v2, v0, La/rad;

    .line 90
    .line 91
    if-eqz v2, :cond_4

    .line 92
    .line 93
    const v2, -0x72fd9e9c

    .line 94
    .line 95
    .line 96
    invoke-virtual {v9, v2}, La/fet;->e0(I)V

    .line 97
    .line 98
    .line 99
    check-cast v0, La/rad;

    .line 100
    .line 101
    and-int/lit8 v1, v1, 0xe

    .line 102
    .line 103
    invoke-static {v8, v0, v9, v1}, La/jeb;->d(La/mm40;La/rad;La/fet;I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v9, v7}, La/fet;->r(Z)V

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_4
    instance-of v2, v0, La/qad;

    .line 111
    .line 112
    if-eqz v2, :cond_5

    .line 113
    .line 114
    const v2, -0x72fd8b02

    .line 115
    .line 116
    .line 117
    invoke-virtual {v9, v2}, La/fet;->e0(I)V

    .line 118
    .line 119
    .line 120
    check-cast v0, La/qad;

    .line 121
    .line 122
    and-int/lit8 v1, v1, 0xe

    .line 123
    .line 124
    invoke-static {v8, v0, v9, v1}, La/ieb;->j(La/mm40;La/qad;La/fet;I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v9, v7}, La/fet;->r(Z)V

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_5
    const v0, -0x72fdb93e

    .line 132
    .line 133
    .line 134
    invoke-static {v0, v9, v7}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    throw v0

    .line 139
    :cond_6
    invoke-virtual {v9}, La/fet;->X()V

    .line 140
    .line 141
    .line 142
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 143
    .line 144
    return-object v0

    .line 145
    :pswitch_0
    move-object/from16 v1, p1

    .line 146
    .line 147
    check-cast v1, La/y5d;

    .line 148
    .line 149
    move-object/from16 v8, p2

    .line 150
    .line 151
    check-cast v8, La/mm40;

    .line 152
    .line 153
    move-object/from16 v14, p3

    .line 154
    .line 155
    check-cast v14, La/fet;

    .line 156
    .line 157
    move-object/from16 v9, p4

    .line 158
    .line 159
    check-cast v9, Ljava/lang/Integer;

    .line 160
    .line 161
    invoke-static {v9, v1, v8}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    and-int/lit8 v9, v1, 0x30

    .line 166
    .line 167
    if-nez v9, :cond_8

    .line 168
    .line 169
    invoke-virtual {v14, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v9

    .line 173
    if-eqz v9, :cond_7

    .line 174
    .line 175
    move v3, v4

    .line 176
    :cond_7
    or-int/2addr v1, v3

    .line 177
    :cond_8
    and-int/lit16 v3, v1, 0x91

    .line 178
    .line 179
    if-eq v3, v2, :cond_9

    .line 180
    .line 181
    move v2, v6

    .line 182
    goto :goto_2

    .line 183
    :cond_9
    move v2, v7

    .line 184
    :goto_2
    and-int/2addr v1, v6

    .line 185
    invoke-virtual {v14, v1, v2}, La/fet;->U(IZ)Z

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    if-eqz v1, :cond_f

    .line 190
    .line 191
    iget-object v0, v0, La/dax;->a:La/fad;

    .line 192
    .line 193
    invoke-static {v0, v14}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    sget-object v1, La/gqw0;->e:La/zx7;

    .line 198
    .line 199
    invoke-static {v1, v7}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    iget-wide v2, v14, La/fet;->T:J

    .line 204
    .line 205
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    invoke-virtual {v14}, La/fet;->m()La/bh90;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    invoke-static {v14, v8}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    sget-object v8, La/mkd;->c0:La/gqw0;

    .line 218
    .line 219
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v14}, La/fet;->i0()V

    .line 223
    .line 224
    .line 225
    iget-boolean v8, v14, La/fet;->S:Z

    .line 226
    .line 227
    sget-object v9, La/e7z;->u1:La/pcy;

    .line 228
    .line 229
    if-eqz v8, :cond_a

    .line 230
    .line 231
    invoke-virtual {v14, v9}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 232
    .line 233
    .line 234
    goto :goto_3

    .line 235
    :cond_a
    invoke-virtual {v14}, La/fet;->r0()V

    .line 236
    .line 237
    .line 238
    :goto_3
    sget-object v8, La/gqw0;->x:La/shd;

    .line 239
    .line 240
    invoke-static {v14, v1, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 241
    .line 242
    .line 243
    sget-object v1, La/gqw0;->w:La/shd;

    .line 244
    .line 245
    invoke-static {v14, v3, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 246
    .line 247
    .line 248
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    sget-object v3, La/gqw0;->y:La/shd;

    .line 253
    .line 254
    invoke-static {v14, v2, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 255
    .line 256
    .line 257
    invoke-static {v14}, La/jpm0;->n(La/fet;)V

    .line 258
    .line 259
    .line 260
    sget-object v2, La/gqw0;->v:La/shd;

    .line 261
    .line 262
    invoke-static {v14, v4, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 263
    .line 264
    .line 265
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    check-cast v0, La/fad;

    .line 270
    .line 271
    if-nez v0, :cond_b

    .line 272
    .line 273
    goto/16 :goto_5

    .line 274
    .line 275
    :cond_b
    instance-of v4, v0, La/dad;

    .line 276
    .line 277
    sget-object v10, La/jm40;->b:La/jm40;

    .line 278
    .line 279
    if-eqz v4, :cond_d

    .line 280
    .line 281
    const v4, -0x3499275

    .line 282
    .line 283
    .line 284
    invoke-virtual {v14, v4}, La/fet;->e0(I)V

    .line 285
    .line 286
    .line 287
    sget-object v4, La/uc9;->a:La/lw3;

    .line 288
    .line 289
    sget-object v11, La/gqw0;->j:La/yx7;

    .line 290
    .line 291
    invoke-static {v4, v11, v14, v7}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    iget-wide v11, v14, La/fet;->T:J

    .line 296
    .line 297
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    .line 298
    .line 299
    .line 300
    move-result v11

    .line 301
    invoke-virtual {v14}, La/fet;->m()La/bh90;

    .line 302
    .line 303
    .line 304
    move-result-object v12

    .line 305
    invoke-static {v14, v10}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 306
    .line 307
    .line 308
    move-result-object v13

    .line 309
    invoke-virtual {v14}, La/fet;->i0()V

    .line 310
    .line 311
    .line 312
    iget-boolean v15, v14, La/fet;->S:Z

    .line 313
    .line 314
    if-eqz v15, :cond_c

    .line 315
    .line 316
    invoke-virtual {v14, v9}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 317
    .line 318
    .line 319
    goto :goto_4

    .line 320
    :cond_c
    invoke-virtual {v14}, La/fet;->r0()V

    .line 321
    .line 322
    .line 323
    :goto_4
    invoke-static {v14, v4, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 324
    .line 325
    .line 326
    invoke-static {v14, v12, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 327
    .line 328
    .line 329
    invoke-static {v11, v14, v3, v14}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 330
    .line 331
    .line 332
    invoke-static {v14, v13, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 333
    .line 334
    .line 335
    check-cast v0, La/dad;

    .line 336
    .line 337
    iget-object v9, v0, La/dad;->a:La/j83;

    .line 338
    .line 339
    sget-object v0, La/j1t0;->e:La/zfn;

    .line 340
    .line 341
    invoke-virtual {v14, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    check-cast v0, La/g1t0;

    .line 346
    .line 347
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    invoke-static {}, La/g1t0;->d()La/y9q0;

    .line 351
    .line 352
    .line 353
    move-result-object v28

    .line 354
    sget-object v0, La/zaq0;->b:La/zfn;

    .line 355
    .line 356
    invoke-virtual {v14, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 361
    .line 362
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 363
    .line 364
    .line 365
    move-result-wide v11

    .line 366
    new-instance v0, La/f2q0;

    .line 367
    .line 368
    invoke-direct {v0, v5}, La/f2q0;-><init>(I)V

    .line 369
    .line 370
    .line 371
    const/16 v31, 0x6180

    .line 372
    .line 373
    const v32, 0x3abf8

    .line 374
    .line 375
    .line 376
    const/4 v13, 0x0

    .line 377
    move-object/from16 v29, v14

    .line 378
    .line 379
    const-wide/16 v14, 0x0

    .line 380
    .line 381
    const/16 v16, 0x0

    .line 382
    .line 383
    const-wide/16 v17, 0x0

    .line 384
    .line 385
    const-wide/16 v20, 0x0

    .line 386
    .line 387
    const/16 v22, 0x2

    .line 388
    .line 389
    const/16 v23, 0x0

    .line 390
    .line 391
    const/16 v24, 0x1

    .line 392
    .line 393
    const/16 v25, 0x0

    .line 394
    .line 395
    const/16 v26, 0x0

    .line 396
    .line 397
    const/16 v27, 0x0

    .line 398
    .line 399
    const/16 v30, 0x30

    .line 400
    .line 401
    move-object/from16 v19, v0

    .line 402
    .line 403
    invoke-static/range {v9 .. v32}, La/v8q0;->b(La/j83;La/mm40;JLa/n05;JLa/nrq;JLa/f2q0;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 404
    .line 405
    .line 406
    move-object/from16 v14, v29

    .line 407
    .line 408
    invoke-virtual {v14, v6}, La/fet;->r(Z)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v14, v7}, La/fet;->r(Z)V

    .line 412
    .line 413
    .line 414
    goto :goto_6

    .line 415
    :cond_d
    move-object v9, v10

    .line 416
    instance-of v1, v0, La/ead;

    .line 417
    .line 418
    if-eqz v1, :cond_e

    .line 419
    .line 420
    const v1, -0x3415311

    .line 421
    .line 422
    .line 423
    invoke-virtual {v14, v1}, La/fet;->e0(I)V

    .line 424
    .line 425
    .line 426
    new-instance v1, La/nad;

    .line 427
    .line 428
    invoke-direct {v1, v0, v7}, La/nad;-><init>(La/fad;B)V

    .line 429
    .line 430
    .line 431
    const v2, 0x5ccf2e3c

    .line 432
    .line 433
    .line 434
    invoke-static {v2, v1, v14}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 435
    .line 436
    .line 437
    move-result-object v10

    .line 438
    new-instance v1, La/nad;

    .line 439
    .line 440
    invoke-direct {v1, v0, v6}, La/nad;-><init>(La/fad;B)V

    .line 441
    .line 442
    .line 443
    const v2, -0x23b4b683

    .line 444
    .line 445
    .line 446
    invoke-static {v2, v1, v14}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 447
    .line 448
    .line 449
    move-result-object v11

    .line 450
    new-instance v1, La/nad;

    .line 451
    .line 452
    const/4 v2, 0x2

    .line 453
    invoke-direct {v1, v0, v2}, La/nad;-><init>(La/fad;B)V

    .line 454
    .line 455
    .line 456
    const v2, 0x5bc764be

    .line 457
    .line 458
    .line 459
    invoke-static {v2, v1, v14}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 460
    .line 461
    .line 462
    move-result-object v12

    .line 463
    new-instance v1, La/nad;

    .line 464
    .line 465
    invoke-direct {v1, v0, v5}, La/nad;-><init>(La/fad;B)V

    .line 466
    .line 467
    .line 468
    const v0, -0x24bc8001

    .line 469
    .line 470
    .line 471
    invoke-static {v0, v1, v14}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 472
    .line 473
    .line 474
    move-result-object v13

    .line 475
    const/16 v15, 0x6db6

    .line 476
    .line 477
    invoke-static/range {v9 .. v15}, La/x1x;->j(La/mm40;La/ugd;La/ugd;La/ugd;La/ugd;La/fet;I)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v14, v7}, La/fet;->r(Z)V

    .line 481
    .line 482
    .line 483
    goto :goto_6

    .line 484
    :cond_e
    :goto_5
    const v0, -0x33bce63

    .line 485
    .line 486
    .line 487
    invoke-virtual {v14, v0}, La/fet;->e0(I)V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v14, v7}, La/fet;->r(Z)V

    .line 491
    .line 492
    .line 493
    :goto_6
    invoke-virtual {v14, v6}, La/fet;->r(Z)V

    .line 494
    .line 495
    .line 496
    goto :goto_7

    .line 497
    :cond_f
    invoke-virtual {v14}, La/fet;->X()V

    .line 498
    .line 499
    .line 500
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 501
    .line 502
    return-object v0

    .line 503
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
