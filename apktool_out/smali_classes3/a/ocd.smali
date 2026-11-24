.class public final synthetic La/ocd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/p3w;


# direct methods
.method public synthetic constructor <init>(La/p3w;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ocd;->a:B

    iput-object p1, p0, La/ocd;->b:La/p3w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ocd;->a:B

    .line 4
    .line 5
    sget-object v2, La/e7z;->u1:La/pcy;

    .line 6
    .line 7
    const/16 v3, 0x10

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x0

    .line 12
    iget-object v0, v0, La/ocd;->b:La/p3w;

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object/from16 v1, p1

    .line 18
    .line 19
    check-cast v1, La/bpq;

    .line 20
    .line 21
    move-object/from16 v12, p2

    .line 22
    .line 23
    check-cast v12, La/fet;

    .line 24
    .line 25
    move-object/from16 v7, p3

    .line 26
    .line 27
    check-cast v7, Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    and-int/lit8 v1, v7, 0x11

    .line 37
    .line 38
    if-eq v1, v3, :cond_0

    .line 39
    .line 40
    move v1, v5

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move v1, v4

    .line 43
    :goto_0
    and-int/lit8 v3, v7, 0x1

    .line 44
    .line 45
    invoke-virtual {v12, v3, v1}, La/fet;->U(IZ)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_5

    .line 50
    .line 51
    iget-object v0, v0, La/p3w;->f:La/a4x;

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_6

    .line 62
    .line 63
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, La/uoo0;

    .line 68
    .line 69
    const v3, 0x16668ff3

    .line 70
    .line 71
    .line 72
    invoke-interface {v1}, La/uoo0;->a()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    invoke-virtual {v12, v3, v7}, La/fet;->b0(ILjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    instance-of v3, v1, La/too0;

    .line 80
    .line 81
    if-eqz v3, :cond_2

    .line 82
    .line 83
    const v3, -0x4992ef4f

    .line 84
    .line 85
    .line 86
    invoke-virtual {v12, v3}, La/fet;->e0(I)V

    .line 87
    .line 88
    .line 89
    sget-object v3, La/qmk;->a:La/zcl;

    .line 90
    .line 91
    const/4 v3, 0x0

    .line 92
    const/4 v7, 0x2

    .line 93
    sget-object v8, La/jm40;->b:La/jm40;

    .line 94
    .line 95
    const/high16 v9, 0x41800000    # 16.0f

    .line 96
    .line 97
    invoke-static {v8, v9, v3, v7}, La/o7k0;->g(La/mm40;FFI)La/mm40;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    sget-object v7, La/gqw0;->e:La/zx7;

    .line 102
    .line 103
    invoke-static {v7, v4}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    iget-wide v9, v12, La/fet;->T:J

    .line 108
    .line 109
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 110
    .line 111
    .line 112
    move-result v9

    .line 113
    invoke-virtual {v12}, La/fet;->m()La/bh90;

    .line 114
    .line 115
    .line 116
    move-result-object v10

    .line 117
    invoke-static {v12, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    sget-object v11, La/mkd;->c0:La/gqw0;

    .line 122
    .line 123
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v12}, La/fet;->i0()V

    .line 127
    .line 128
    .line 129
    iget-boolean v11, v12, La/fet;->S:Z

    .line 130
    .line 131
    if-eqz v11, :cond_1

    .line 132
    .line 133
    invoke-virtual {v12, v2}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_1
    invoke-virtual {v12}, La/fet;->r0()V

    .line 138
    .line 139
    .line 140
    :goto_2
    sget-object v11, La/gqw0;->x:La/shd;

    .line 141
    .line 142
    invoke-static {v12, v7, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 143
    .line 144
    .line 145
    sget-object v7, La/gqw0;->w:La/shd;

    .line 146
    .line 147
    invoke-static {v12, v10, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 148
    .line 149
    .line 150
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    sget-object v9, La/gqw0;->y:La/shd;

    .line 155
    .line 156
    invoke-static {v12, v7, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 157
    .line 158
    .line 159
    invoke-static {v12}, La/jpm0;->n(La/fet;)V

    .line 160
    .line 161
    .line 162
    sget-object v7, La/gqw0;->v:La/shd;

    .line 163
    .line 164
    invoke-static {v12, v3, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 165
    .line 166
    .line 167
    check-cast v1, La/too0;

    .line 168
    .line 169
    iget-object v1, v1, La/too0;->b:Ljava/lang/String;

    .line 170
    .line 171
    const-string v3, "\u200e"

    .line 172
    .line 173
    invoke-static {v3, v1}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v7

    .line 177
    sget-object v19, La/j1t0;->c:La/qrq;

    .line 178
    .line 179
    sget-wide v16, La/qmk;->p:J

    .line 180
    .line 181
    sget-wide v25, La/qmk;->C:J

    .line 182
    .line 183
    new-instance v13, La/y9q0;

    .line 184
    .line 185
    const/16 v24, 0x0

    .line 186
    .line 187
    const v27, 0xfdffdd

    .line 188
    .line 189
    .line 190
    const-wide/16 v14, 0x0

    .line 191
    .line 192
    const/16 v18, 0x0

    .line 193
    .line 194
    const-wide/16 v20, 0x0

    .line 195
    .line 196
    const/16 v22, 0x0

    .line 197
    .line 198
    const/16 v23, 0x0

    .line 199
    .line 200
    invoke-direct/range {v13 .. v27}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 201
    .line 202
    .line 203
    invoke-static {v13, v12}, La/ibm0;->t(La/y9q0;La/fet;)La/y9q0;

    .line 204
    .line 205
    .line 206
    move-result-object v27

    .line 207
    const/16 v30, 0x0

    .line 208
    .line 209
    const v31, 0x1fffc

    .line 210
    .line 211
    .line 212
    const-wide/16 v9, 0x0

    .line 213
    .line 214
    const/4 v11, 0x0

    .line 215
    move-object/from16 v28, v12

    .line 216
    .line 217
    const-wide/16 v12, 0x0

    .line 218
    .line 219
    const/4 v14, 0x0

    .line 220
    const/4 v15, 0x0

    .line 221
    const/16 v16, 0x0

    .line 222
    .line 223
    const-wide/16 v17, 0x0

    .line 224
    .line 225
    const/16 v19, 0x0

    .line 226
    .line 227
    const/16 v22, 0x0

    .line 228
    .line 229
    const/16 v25, 0x0

    .line 230
    .line 231
    const/16 v26, 0x0

    .line 232
    .line 233
    const/16 v29, 0x30

    .line 234
    .line 235
    invoke-static/range {v7 .. v31}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 236
    .line 237
    .line 238
    move-object/from16 v12, v28

    .line 239
    .line 240
    invoke-virtual {v12, v5}, La/fet;->r(Z)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v12, v4}, La/fet;->r(Z)V

    .line 244
    .line 245
    .line 246
    goto :goto_3

    .line 247
    :cond_2
    instance-of v3, v1, La/ioo0;

    .line 248
    .line 249
    if-eqz v3, :cond_3

    .line 250
    .line 251
    const v1, 0x1666f775

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12, v1}, La/fet;->e0(I)V

    .line 255
    .line 256
    .line 257
    invoke-static {v5, v12, v6}, La/rq8;->d(ILa/fet;La/mm40;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v12, v4}, La/fet;->r(Z)V

    .line 261
    .line 262
    .line 263
    goto :goto_3

    .line 264
    :cond_3
    instance-of v3, v1, La/soo0;

    .line 265
    .line 266
    if-eqz v3, :cond_4

    .line 267
    .line 268
    const v3, -0x4986e1f6

    .line 269
    .line 270
    .line 271
    invoke-virtual {v12, v3}, La/fet;->e0(I)V

    .line 272
    .line 273
    .line 274
    check-cast v1, La/soo0;

    .line 275
    .line 276
    iget-object v7, v1, La/soo0;->a:Ljava/lang/String;

    .line 277
    .line 278
    iget-object v8, v1, La/soo0;->b:La/sso0;

    .line 279
    .line 280
    const/4 v13, 0x0

    .line 281
    const/16 v14, 0x1c

    .line 282
    .line 283
    const/4 v9, 0x0

    .line 284
    const/4 v10, 0x0

    .line 285
    const/4 v11, 0x0

    .line 286
    invoke-static/range {v7 .. v14}, La/j6n;->h(Ljava/lang/String;La/sso0;La/mm40;IILa/fet;II)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v12, v4}, La/fet;->r(Z)V

    .line 290
    .line 291
    .line 292
    goto :goto_3

    .line 293
    :cond_4
    const v1, 0x1667278d

    .line 294
    .line 295
    .line 296
    invoke-virtual {v12, v1}, La/fet;->e0(I)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v12, v4}, La/fet;->r(Z)V

    .line 300
    .line 301
    .line 302
    :goto_3
    invoke-virtual {v12, v4}, La/fet;->r(Z)V

    .line 303
    .line 304
    .line 305
    goto/16 :goto_1

    .line 306
    .line 307
    :cond_5
    invoke-virtual {v12}, La/fet;->X()V

    .line 308
    .line 309
    .line 310
    :cond_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 311
    .line 312
    return-object v0

    .line 313
    :pswitch_0
    move-object/from16 v1, p1

    .line 314
    .line 315
    check-cast v1, La/bpq;

    .line 316
    .line 317
    move-object/from16 v12, p2

    .line 318
    .line 319
    check-cast v12, La/fet;

    .line 320
    .line 321
    move-object/from16 v7, p3

    .line 322
    .line 323
    check-cast v7, Ljava/lang/Integer;

    .line 324
    .line 325
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 326
    .line 327
    .line 328
    move-result v7

    .line 329
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    and-int/lit8 v1, v7, 0x11

    .line 333
    .line 334
    if-eq v1, v3, :cond_7

    .line 335
    .line 336
    move v1, v5

    .line 337
    goto :goto_4

    .line 338
    :cond_7
    move v1, v4

    .line 339
    :goto_4
    and-int/lit8 v3, v7, 0x1

    .line 340
    .line 341
    invoke-virtual {v12, v3, v1}, La/fet;->U(IZ)Z

    .line 342
    .line 343
    .line 344
    move-result v1

    .line 345
    if-eqz v1, :cond_d

    .line 346
    .line 347
    iget-object v1, v0, La/p3w;->f:La/a4x;

    .line 348
    .line 349
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 354
    .line 355
    .line 356
    move-result v3

    .line 357
    if-eqz v3, :cond_e

    .line 358
    .line 359
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v3

    .line 363
    check-cast v3, La/uoo0;

    .line 364
    .line 365
    const v7, -0x55f609a2

    .line 366
    .line 367
    .line 368
    invoke-interface {v3}, La/uoo0;->a()Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v8

    .line 372
    invoke-virtual {v12, v7, v8}, La/fet;->b0(ILjava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    instance-of v7, v3, La/too0;

    .line 376
    .line 377
    sget-object v8, La/jm40;->b:La/jm40;

    .line 378
    .line 379
    if-eqz v7, :cond_8

    .line 380
    .line 381
    const v3, -0x68c997da

    .line 382
    .line 383
    .line 384
    invoke-virtual {v12, v3}, La/fet;->e0(I)V

    .line 385
    .line 386
    .line 387
    iget-object v7, v0, La/p3w;->d:Ljava/lang/String;

    .line 388
    .line 389
    sget-object v19, La/j1t0;->b:La/qrq;

    .line 390
    .line 391
    sget-wide v16, La/qmk;->q:J

    .line 392
    .line 393
    sget-wide v25, La/qmk;->D:J

    .line 394
    .line 395
    new-instance v13, La/y9q0;

    .line 396
    .line 397
    const/16 v24, 0x0

    .line 398
    .line 399
    const v27, 0xfdff9d

    .line 400
    .line 401
    .line 402
    const-wide/16 v14, 0x0

    .line 403
    .line 404
    const/16 v18, 0x0

    .line 405
    .line 406
    const-wide/16 v20, 0x0

    .line 407
    .line 408
    const/16 v22, 0x0

    .line 409
    .line 410
    const/16 v23, 0x0

    .line 411
    .line 412
    invoke-direct/range {v13 .. v27}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 413
    .line 414
    .line 415
    sget-object v3, La/zaq0;->b:La/zfn;

    .line 416
    .line 417
    invoke-virtual {v12, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v3

    .line 421
    check-cast v3, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 422
    .line 423
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 424
    .line 425
    .line 426
    move-result-wide v9

    .line 427
    const-string v3, "BET_TYPE_TEXT_TEST_TAG"

    .line 428
    .line 429
    invoke-static {v8, v3}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 430
    .line 431
    .line 432
    move-result-object v8

    .line 433
    const/16 v30, 0x6180

    .line 434
    .line 435
    const v31, 0x1aff8

    .line 436
    .line 437
    .line 438
    const/4 v11, 0x0

    .line 439
    move-object/from16 v28, v12

    .line 440
    .line 441
    move-object/from16 v27, v13

    .line 442
    .line 443
    const-wide/16 v12, 0x0

    .line 444
    .line 445
    const/4 v14, 0x0

    .line 446
    const/4 v15, 0x0

    .line 447
    const/16 v16, 0x0

    .line 448
    .line 449
    const-wide/16 v17, 0x0

    .line 450
    .line 451
    const/16 v19, 0x0

    .line 452
    .line 453
    const/16 v22, 0x2

    .line 454
    .line 455
    const/16 v24, 0x1

    .line 456
    .line 457
    const/16 v25, 0x0

    .line 458
    .line 459
    const/16 v26, 0x0

    .line 460
    .line 461
    const/16 v29, 0x30

    .line 462
    .line 463
    invoke-static/range {v7 .. v31}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 464
    .line 465
    .line 466
    move-object/from16 v12, v28

    .line 467
    .line 468
    invoke-virtual {v12, v4}, La/fet;->r(Z)V

    .line 469
    .line 470
    .line 471
    goto/16 :goto_7

    .line 472
    .line 473
    :cond_8
    instance-of v7, v3, La/joo0;

    .line 474
    .line 475
    if-eqz v7, :cond_a

    .line 476
    .line 477
    const v3, -0x68c00167

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12, v3}, La/fet;->e0(I)V

    .line 481
    .line 482
    .line 483
    sget-object v3, La/gqw0;->k:La/yx7;

    .line 484
    .line 485
    sget-object v7, La/qmk;->a:La/zcl;

    .line 486
    .line 487
    new-instance v7, La/qw3;

    .line 488
    .line 489
    new-instance v9, La/jf4;

    .line 490
    .line 491
    const/16 v10, 0xe

    .line 492
    .line 493
    invoke-direct {v9, v10}, La/jf4;-><init>(B)V

    .line 494
    .line 495
    .line 496
    const/high16 v10, 0x40000000    # 2.0f

    .line 497
    .line 498
    invoke-direct {v7, v10, v5, v9}, La/qw3;-><init>(FZLa/rw3;)V

    .line 499
    .line 500
    .line 501
    const/16 v9, 0x30

    .line 502
    .line 503
    invoke-static {v7, v3, v12, v9}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 504
    .line 505
    .line 506
    move-result-object v3

    .line 507
    iget-wide v9, v12, La/fet;->T:J

    .line 508
    .line 509
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 510
    .line 511
    .line 512
    move-result v7

    .line 513
    invoke-virtual {v12}, La/fet;->m()La/bh90;

    .line 514
    .line 515
    .line 516
    move-result-object v9

    .line 517
    invoke-static {v12, v8}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 518
    .line 519
    .line 520
    move-result-object v10

    .line 521
    sget-object v11, La/mkd;->c0:La/gqw0;

    .line 522
    .line 523
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v12}, La/fet;->i0()V

    .line 527
    .line 528
    .line 529
    iget-boolean v11, v12, La/fet;->S:Z

    .line 530
    .line 531
    if-eqz v11, :cond_9

    .line 532
    .line 533
    invoke-virtual {v12, v2}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 534
    .line 535
    .line 536
    goto :goto_6

    .line 537
    :cond_9
    invoke-virtual {v12}, La/fet;->r0()V

    .line 538
    .line 539
    .line 540
    :goto_6
    sget-object v11, La/gqw0;->x:La/shd;

    .line 541
    .line 542
    invoke-static {v12, v3, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 543
    .line 544
    .line 545
    sget-object v3, La/gqw0;->w:La/shd;

    .line 546
    .line 547
    invoke-static {v12, v9, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 548
    .line 549
    .line 550
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 551
    .line 552
    .line 553
    move-result-object v3

    .line 554
    sget-object v7, La/gqw0;->y:La/shd;

    .line 555
    .line 556
    invoke-static {v12, v3, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 557
    .line 558
    .line 559
    invoke-static {v12}, La/jpm0;->n(La/fet;)V

    .line 560
    .line 561
    .line 562
    sget-object v3, La/gqw0;->v:La/shd;

    .line 563
    .line 564
    invoke-static {v12, v10, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 565
    .line 566
    .line 567
    const/high16 v3, 0x41400000    # 12.0f

    .line 568
    .line 569
    invoke-static {v8, v3}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 570
    .line 571
    .line 572
    move-result-object v9

    .line 573
    const v3, 0x7f080999

    .line 574
    .line 575
    .line 576
    invoke-static {v3, v4, v12}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 577
    .line 578
    .line 579
    move-result-object v7

    .line 580
    sget-object v3, La/zaq0;->b:La/zfn;

    .line 581
    .line 582
    invoke-virtual {v12, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object v3

    .line 586
    check-cast v3, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 587
    .line 588
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 589
    .line 590
    .line 591
    move-result-wide v10

    .line 592
    new-instance v13, La/m78;

    .line 593
    .line 594
    const/4 v3, 0x5

    .line 595
    invoke-direct {v13, v10, v11, v3}, La/m78;-><init>(JI)V

    .line 596
    .line 597
    .line 598
    const/16 v15, 0x38

    .line 599
    .line 600
    const/16 v16, 0x38

    .line 601
    .line 602
    const/4 v8, 0x0

    .line 603
    const/4 v10, 0x0

    .line 604
    const/4 v11, 0x0

    .line 605
    move-object/from16 v28, v12

    .line 606
    .line 607
    const/4 v12, 0x0

    .line 608
    move-object/from16 v14, v28

    .line 609
    .line 610
    invoke-static/range {v7 .. v16}, La/j0x;->b(La/pm80;Ljava/lang/String;La/mm40;La/u12;La/qge;FLa/a4d;La/fet;II)V

    .line 611
    .line 612
    .line 613
    move-object v12, v14

    .line 614
    iget-object v7, v0, La/p3w;->r:Ljava/lang/String;

    .line 615
    .line 616
    sget-object v19, La/j1t0;->a:La/qrq;

    .line 617
    .line 618
    sget-wide v16, La/qmk;->q:J

    .line 619
    .line 620
    sget-wide v25, La/qmk;->D:J

    .line 621
    .line 622
    new-instance v13, La/y9q0;

    .line 623
    .line 624
    const/16 v24, 0x0

    .line 625
    .line 626
    const v27, 0xfdffdd

    .line 627
    .line 628
    .line 629
    const-wide/16 v14, 0x0

    .line 630
    .line 631
    const/16 v18, 0x0

    .line 632
    .line 633
    const-wide/16 v20, 0x0

    .line 634
    .line 635
    const/16 v22, 0x0

    .line 636
    .line 637
    const/16 v23, 0x0

    .line 638
    .line 639
    invoke-direct/range {v13 .. v27}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 640
    .line 641
    .line 642
    invoke-static {v13, v12}, La/ibm0;->t(La/y9q0;La/fet;)La/y9q0;

    .line 643
    .line 644
    .line 645
    move-result-object v27

    .line 646
    const/16 v30, 0x0

    .line 647
    .line 648
    const v31, 0x1fffe

    .line 649
    .line 650
    .line 651
    const-wide/16 v9, 0x0

    .line 652
    .line 653
    move-object/from16 v28, v12

    .line 654
    .line 655
    const-wide/16 v12, 0x0

    .line 656
    .line 657
    const/4 v14, 0x0

    .line 658
    const/4 v15, 0x0

    .line 659
    const/16 v16, 0x0

    .line 660
    .line 661
    const-wide/16 v17, 0x0

    .line 662
    .line 663
    const/16 v19, 0x0

    .line 664
    .line 665
    const/16 v22, 0x0

    .line 666
    .line 667
    const/16 v25, 0x0

    .line 668
    .line 669
    const/16 v26, 0x0

    .line 670
    .line 671
    const/16 v29, 0x0

    .line 672
    .line 673
    invoke-static/range {v7 .. v31}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 674
    .line 675
    .line 676
    move-object/from16 v12, v28

    .line 677
    .line 678
    invoke-virtual {v12, v5}, La/fet;->r(Z)V

    .line 679
    .line 680
    .line 681
    invoke-virtual {v12, v4}, La/fet;->r(Z)V

    .line 682
    .line 683
    .line 684
    goto :goto_7

    .line 685
    :cond_a
    instance-of v7, v3, La/ioo0;

    .line 686
    .line 687
    if-eqz v7, :cond_b

    .line 688
    .line 689
    const v3, -0x55f52b22

    .line 690
    .line 691
    .line 692
    invoke-virtual {v12, v3}, La/fet;->e0(I)V

    .line 693
    .line 694
    .line 695
    invoke-static {v5, v12, v6}, La/rq8;->d(ILa/fet;La/mm40;)V

    .line 696
    .line 697
    .line 698
    invoke-virtual {v12, v4}, La/fet;->r(Z)V

    .line 699
    .line 700
    .line 701
    goto :goto_7

    .line 702
    :cond_b
    instance-of v7, v3, La/soo0;

    .line 703
    .line 704
    if-eqz v7, :cond_c

    .line 705
    .line 706
    const v7, -0x68af242b

    .line 707
    .line 708
    .line 709
    invoke-virtual {v12, v7}, La/fet;->e0(I)V

    .line 710
    .line 711
    .line 712
    check-cast v3, La/soo0;

    .line 713
    .line 714
    iget-object v7, v3, La/soo0;->a:Ljava/lang/String;

    .line 715
    .line 716
    iget-object v8, v3, La/soo0;->b:La/sso0;

    .line 717
    .line 718
    const/4 v13, 0x0

    .line 719
    const/16 v14, 0x1c

    .line 720
    .line 721
    const/4 v9, 0x0

    .line 722
    const/4 v10, 0x0

    .line 723
    const/4 v11, 0x0

    .line 724
    invoke-static/range {v7 .. v14}, La/j6n;->h(Ljava/lang/String;La/sso0;La/mm40;IILa/fet;II)V

    .line 725
    .line 726
    .line 727
    invoke-virtual {v12, v4}, La/fet;->r(Z)V

    .line 728
    .line 729
    .line 730
    :goto_7
    invoke-virtual {v12, v4}, La/fet;->r(Z)V

    .line 731
    .line 732
    .line 733
    goto/16 :goto_5

    .line 734
    .line 735
    :cond_c
    const v0, -0x55f603ae

    .line 736
    .line 737
    .line 738
    invoke-static {v0, v12, v4}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    throw v0

    .line 743
    :cond_d
    invoke-virtual {v12}, La/fet;->X()V

    .line 744
    .line 745
    .line 746
    :cond_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 747
    .line 748
    return-object v0

    .line 749
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
