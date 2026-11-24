.class public final synthetic La/cl2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/cl2;->a:B

    iput p1, p0, La/cl2;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/cl2;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x3f800000    # 1.0f

    .line 6
    .line 7
    const/high16 v3, 0x42400000    # 48.0f

    .line 8
    .line 9
    const/high16 v6, 0x41800000    # 16.0f

    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    sget-object v8, La/e7z;->u1:La/pcy;

    .line 13
    .line 14
    const/4 v9, 0x0

    .line 15
    const/4 v10, 0x2

    .line 16
    const/16 v11, 0x10

    .line 17
    .line 18
    sget-object v12, La/jm40;->b:La/jm40;

    .line 19
    .line 20
    const/4 v13, 0x0

    .line 21
    const/4 v14, 0x1

    .line 22
    iget v0, v0, La/cl2;->b:I

    .line 23
    .line 24
    packed-switch v1, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    move-object/from16 v1, p1

    .line 28
    .line 29
    check-cast v1, La/x8z;

    .line 30
    .line 31
    move-object/from16 v2, p2

    .line 32
    .line 33
    check-cast v2, Ljava/lang/Integer;

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 36
    .line 37
    .line 38
    move-object/from16 v2, p3

    .line 39
    .line 40
    check-cast v2, La/p6t0;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    instance-of v1, v2, La/dee0;

    .line 49
    .line 50
    if-eqz v1, :cond_0

    .line 51
    .line 52
    invoke-static {v14}, La/q8x;->e(I)J

    .line 53
    .line 54
    .line 55
    move-result-wide v0

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    invoke-static {v0}, La/q8x;->e(I)J

    .line 58
    .line 59
    .line 60
    move-result-wide v0

    .line 61
    :goto_0
    new-instance v2, La/pgv;

    .line 62
    .line 63
    invoke-direct {v2, v0, v1}, La/pgv;-><init>(J)V

    .line 64
    .line 65
    .line 66
    return-object v2

    .line 67
    :pswitch_0
    move-object/from16 v1, p1

    .line 68
    .line 69
    check-cast v1, La/x8z;

    .line 70
    .line 71
    move-object/from16 v2, p2

    .line 72
    .line 73
    check-cast v2, Ljava/lang/Integer;

    .line 74
    .line 75
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 76
    .line 77
    .line 78
    move-object/from16 v2, p3

    .line 79
    .line 80
    check-cast v2, La/p6t0;

    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    instance-of v1, v2, La/mbo;

    .line 89
    .line 90
    if-eqz v1, :cond_1

    .line 91
    .line 92
    invoke-static {v14}, La/q8x;->e(I)J

    .line 93
    .line 94
    .line 95
    move-result-wide v0

    .line 96
    goto :goto_1

    .line 97
    :cond_1
    invoke-static {v0}, La/q8x;->e(I)J

    .line 98
    .line 99
    .line 100
    move-result-wide v0

    .line 101
    :goto_1
    new-instance v2, La/pgv;

    .line 102
    .line 103
    invoke-direct {v2, v0, v1}, La/pgv;-><init>(J)V

    .line 104
    .line 105
    .line 106
    return-object v2

    .line 107
    :pswitch_1
    move-object/from16 v1, p1

    .line 108
    .line 109
    check-cast v1, La/g9z;

    .line 110
    .line 111
    move-object/from16 v2, p2

    .line 112
    .line 113
    check-cast v2, La/fet;

    .line 114
    .line 115
    move-object/from16 v15, p3

    .line 116
    .line 117
    check-cast v15, Ljava/lang/Integer;

    .line 118
    .line 119
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 120
    .line 121
    .line 122
    move-result v15

    .line 123
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    and-int/lit8 v1, v15, 0x11

    .line 127
    .line 128
    if-eq v1, v11, :cond_2

    .line 129
    .line 130
    move v1, v14

    .line 131
    goto :goto_2

    .line 132
    :cond_2
    move v1, v13

    .line 133
    :goto_2
    and-int/lit8 v11, v15, 0x1

    .line 134
    .line 135
    invoke-virtual {v2, v11, v1}, La/fet;->U(IZ)Z

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    if-eqz v1, :cond_6

    .line 140
    .line 141
    sget-object v1, La/uc9;->c:La/mw3;

    .line 142
    .line 143
    sget-object v11, La/gqw0;->m:La/xx7;

    .line 144
    .line 145
    invoke-static {v1, v11, v2, v13}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    iget-wide v4, v2, La/fet;->T:J

    .line 150
    .line 151
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    invoke-virtual {v2}, La/fet;->m()La/bh90;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    invoke-static {v2, v12}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 160
    .line 161
    .line 162
    move-result-object v11

    .line 163
    sget-object v17, La/mkd;->c0:La/gqw0;

    .line 164
    .line 165
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2}, La/fet;->i0()V

    .line 169
    .line 170
    .line 171
    iget-boolean v15, v2, La/fet;->S:Z

    .line 172
    .line 173
    if-eqz v15, :cond_3

    .line 174
    .line 175
    invoke-virtual {v2, v8}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 176
    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_3
    invoke-virtual {v2}, La/fet;->r0()V

    .line 180
    .line 181
    .line 182
    :goto_3
    sget-object v15, La/gqw0;->x:La/shd;

    .line 183
    .line 184
    invoke-static {v2, v1, v15}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 185
    .line 186
    .line 187
    sget-object v1, La/gqw0;->w:La/shd;

    .line 188
    .line 189
    invoke-static {v2, v5, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 190
    .line 191
    .line 192
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    sget-object v5, La/gqw0;->y:La/shd;

    .line 197
    .line 198
    invoke-static {v2, v4, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 199
    .line 200
    .line 201
    invoke-static {v2}, La/jpm0;->n(La/fet;)V

    .line 202
    .line 203
    .line 204
    sget-object v4, La/gqw0;->v:La/shd;

    .line 205
    .line 206
    invoke-static {v2, v11, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 207
    .line 208
    .line 209
    sget-object v11, La/qmk;->a:La/zcl;

    .line 210
    .line 211
    const/high16 v11, 0x41600000    # 14.0f

    .line 212
    .line 213
    invoke-static {v12, v7, v11, v14}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 214
    .line 215
    .line 216
    move-result-object v7

    .line 217
    invoke-static {v7, v6}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 218
    .line 219
    .line 220
    move-result-object v6

    .line 221
    rem-int/2addr v0, v10

    .line 222
    if-eqz v0, :cond_4

    .line 223
    .line 224
    const/high16 v0, 0x43000000    # 128.0f

    .line 225
    .line 226
    goto :goto_4

    .line 227
    :cond_4
    const/high16 v0, 0x42a00000    # 80.0f

    .line 228
    .line 229
    :goto_4
    invoke-static {v6, v0}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    sget-object v6, La/qmk;->i:La/zcl;

    .line 234
    .line 235
    sget-object v7, La/vgg0;->a:La/ugg0;

    .line 236
    .line 237
    invoke-static {v6, v6, v6, v6, v0}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-static {v9, v2, v13, v14}, La/vbc;->d0(La/vqm;La/fet;II)La/fqj0;

    .line 242
    .line 243
    .line 244
    move-result-object v6

    .line 245
    invoke-static {v0, v6}, La/xbc;->c0(La/mm40;La/fqj0;)La/mm40;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-static {v13, v2, v0}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 250
    .line 251
    .line 252
    invoke-static {v12, v3}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    sget-object v3, La/gqw0;->e:La/zx7;

    .line 257
    .line 258
    invoke-static {v3, v13}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    iget-wide v6, v2, La/fet;->T:J

    .line 263
    .line 264
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 265
    .line 266
    .line 267
    move-result v6

    .line 268
    invoke-virtual {v2}, La/fet;->m()La/bh90;

    .line 269
    .line 270
    .line 271
    move-result-object v7

    .line 272
    invoke-static {v2, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    invoke-virtual {v2}, La/fet;->i0()V

    .line 277
    .line 278
    .line 279
    iget-boolean v9, v2, La/fet;->S:Z

    .line 280
    .line 281
    if-eqz v9, :cond_5

    .line 282
    .line 283
    invoke-virtual {v2, v8}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 284
    .line 285
    .line 286
    goto :goto_5

    .line 287
    :cond_5
    invoke-virtual {v2}, La/fet;->r0()V

    .line 288
    .line 289
    .line 290
    :goto_5
    invoke-static {v2, v3, v15}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 291
    .line 292
    .line 293
    invoke-static {v2, v7, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 294
    .line 295
    .line 296
    invoke-static {v6, v2, v5, v2}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 297
    .line 298
    .line 299
    invoke-static {v2, v0, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 300
    .line 301
    .line 302
    sget-object v0, La/kr00;->a:La/zfn;

    .line 303
    .line 304
    invoke-virtual {v2, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    check-cast v0, Ljava/lang/Boolean;

    .line 309
    .line 310
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 311
    .line 312
    .line 313
    move-result v17

    .line 314
    const/16 v21, 0x30

    .line 315
    .line 316
    const/16 v22, 0x19

    .line 317
    .line 318
    const/4 v15, 0x0

    .line 319
    sget-object v16, La/h4n;->a:La/h4n;

    .line 320
    .line 321
    const/16 v18, 0x0

    .line 322
    .line 323
    const/16 v19, 0x0

    .line 324
    .line 325
    move-object/from16 v20, v2

    .line 326
    .line 327
    invoke-static/range {v15 .. v22}, La/agc;->t(La/mm40;La/k4n;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 328
    .line 329
    .line 330
    move-object/from16 v0, v20

    .line 331
    .line 332
    invoke-virtual {v0, v14}, La/fet;->r(Z)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v0, v14}, La/fet;->r(Z)V

    .line 336
    .line 337
    .line 338
    goto :goto_6

    .line 339
    :cond_6
    move-object v0, v2

    .line 340
    invoke-virtual {v0}, La/fet;->X()V

    .line 341
    .line 342
    .line 343
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 344
    .line 345
    return-object v0

    .line 346
    :pswitch_2
    move-object/from16 v1, p1

    .line 347
    .line 348
    check-cast v1, La/y5d;

    .line 349
    .line 350
    move-object/from16 v3, p2

    .line 351
    .line 352
    check-cast v3, La/fet;

    .line 353
    .line 354
    move-object/from16 v4, p3

    .line 355
    .line 356
    check-cast v4, Ljava/lang/Integer;

    .line 357
    .line 358
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 359
    .line 360
    .line 361
    move-result v4

    .line 362
    sget-object v5, La/vzv;->p2:La/sqt;

    .line 363
    .line 364
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    and-int/lit8 v5, v4, 0x6

    .line 368
    .line 369
    if-nez v5, :cond_8

    .line 370
    .line 371
    invoke-virtual {v3, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    move-result v5

    .line 375
    if-eqz v5, :cond_7

    .line 376
    .line 377
    const/4 v10, 0x4

    .line 378
    :cond_7
    or-int/2addr v4, v10

    .line 379
    :cond_8
    and-int/lit8 v5, v4, 0x13

    .line 380
    .line 381
    const/16 v6, 0x12

    .line 382
    .line 383
    if-eq v5, v6, :cond_9

    .line 384
    .line 385
    move v5, v14

    .line 386
    goto :goto_7

    .line 387
    :cond_9
    move v5, v13

    .line 388
    :goto_7
    and-int/2addr v4, v14

    .line 389
    invoke-virtual {v3, v4, v5}, La/fet;->U(IZ)Z

    .line 390
    .line 391
    .line 392
    move-result v4

    .line 393
    if-eqz v4, :cond_a

    .line 394
    .line 395
    invoke-static {v12, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 396
    .line 397
    .line 398
    move-result-object v2

    .line 399
    sget-object v4, La/gqw0;->n:La/xx7;

    .line 400
    .line 401
    invoke-virtual {v1, v2, v4}, La/y5d;->a(La/mm40;La/xx7;)La/mm40;

    .line 402
    .line 403
    .line 404
    move-result-object v5

    .line 405
    sget-object v1, La/qmk;->a:La/zcl;

    .line 406
    .line 407
    const/4 v9, 0x0

    .line 408
    const/16 v10, 0xd

    .line 409
    .line 410
    const/4 v6, 0x0

    .line 411
    const/high16 v7, 0x41c00000    # 24.0f

    .line 412
    .line 413
    const/4 v8, 0x0

    .line 414
    invoke-static/range {v5 .. v10}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 415
    .line 416
    .line 417
    move-result-object v15

    .line 418
    invoke-static {v0, v13, v3}, La/rsm0;->w(IILa/fet;)Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v16

    .line 422
    const/16 v23, 0x0

    .line 423
    .line 424
    const/16 v24, 0x1c

    .line 425
    .line 426
    const-wide/16 v17, 0x0

    .line 427
    .line 428
    const/16 v19, 0x0

    .line 429
    .line 430
    const-wide/16 v20, 0x0

    .line 431
    .line 432
    move-object/from16 v22, v3

    .line 433
    .line 434
    invoke-static/range {v15 .. v24}, La/wwb;->i(La/mm40;Ljava/lang/String;JIJLa/fet;II)V

    .line 435
    .line 436
    .line 437
    goto :goto_8

    .line 438
    :cond_a
    move-object/from16 v22, v3

    .line 439
    .line 440
    invoke-virtual/range {v22 .. v22}, La/fet;->X()V

    .line 441
    .line 442
    .line 443
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 444
    .line 445
    return-object v0

    .line 446
    :pswitch_3
    move-object/from16 v1, p1

    .line 447
    .line 448
    check-cast v1, La/g9z;

    .line 449
    .line 450
    move-object/from16 v3, p2

    .line 451
    .line 452
    check-cast v3, La/fet;

    .line 453
    .line 454
    move-object/from16 v4, p3

    .line 455
    .line 456
    check-cast v4, Ljava/lang/Integer;

    .line 457
    .line 458
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 459
    .line 460
    .line 461
    move-result v4

    .line 462
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 463
    .line 464
    .line 465
    and-int/lit8 v1, v4, 0x11

    .line 466
    .line 467
    if-eq v1, v11, :cond_b

    .line 468
    .line 469
    move v1, v14

    .line 470
    goto :goto_9

    .line 471
    :cond_b
    move v1, v13

    .line 472
    :goto_9
    and-int/2addr v4, v14

    .line 473
    invoke-virtual {v3, v4, v1}, La/fet;->U(IZ)Z

    .line 474
    .line 475
    .line 476
    move-result v1

    .line 477
    if-eqz v1, :cond_d

    .line 478
    .line 479
    const/4 v1, 0x6

    .line 480
    if-nez v0, :cond_c

    .line 481
    .line 482
    const v0, -0x2c4d3323

    .line 483
    .line 484
    .line 485
    invoke-virtual {v3, v0}, La/fet;->e0(I)V

    .line 486
    .line 487
    .line 488
    sget-object v0, La/qmk;->a:La/zcl;

    .line 489
    .line 490
    const/high16 v0, 0x43200000    # 160.0f

    .line 491
    .line 492
    invoke-static {v12, v0}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    invoke-static {v0, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    sget-object v2, La/qmk;->k:La/zcl;

    .line 501
    .line 502
    sget-object v4, La/vgg0;->a:La/ugg0;

    .line 503
    .line 504
    invoke-static {v2, v2, v2, v2, v0}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    sget-object v2, La/vqm;->d:La/vqm;

    .line 509
    .line 510
    invoke-static {v2, v3, v1, v13}, La/vbc;->d0(La/vqm;La/fet;II)La/fqj0;

    .line 511
    .line 512
    .line 513
    move-result-object v1

    .line 514
    :goto_a
    invoke-static {v0, v1, v3, v13, v13}, La/dw9;->x(La/mm40;La/fqj0;La/fet;IZ)V

    .line 515
    .line 516
    .line 517
    goto :goto_b

    .line 518
    :cond_c
    const v0, -0x2c451623

    .line 519
    .line 520
    .line 521
    invoke-virtual {v3, v0}, La/fet;->e0(I)V

    .line 522
    .line 523
    .line 524
    sget-object v0, La/qmk;->a:La/zcl;

    .line 525
    .line 526
    const/high16 v0, 0x43600000    # 224.0f

    .line 527
    .line 528
    invoke-static {v12, v0}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    invoke-static {v0, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    sget-object v2, La/qmk;->k:La/zcl;

    .line 537
    .line 538
    sget-object v4, La/vgg0;->a:La/ugg0;

    .line 539
    .line 540
    invoke-static {v2, v2, v2, v2, v0}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    sget-object v2, La/vqm;->d:La/vqm;

    .line 545
    .line 546
    invoke-static {v2, v3, v1, v13}, La/vbc;->d0(La/vqm;La/fet;II)La/fqj0;

    .line 547
    .line 548
    .line 549
    move-result-object v1

    .line 550
    goto :goto_a

    .line 551
    :cond_d
    invoke-virtual {v3}, La/fet;->X()V

    .line 552
    .line 553
    .line 554
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 555
    .line 556
    return-object v0

    .line 557
    :pswitch_4
    move-object/from16 v1, p1

    .line 558
    .line 559
    check-cast v1, La/x8z;

    .line 560
    .line 561
    move-object/from16 v2, p2

    .line 562
    .line 563
    check-cast v2, Ljava/lang/Integer;

    .line 564
    .line 565
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 566
    .line 567
    .line 568
    move-object/from16 v2, p3

    .line 569
    .line 570
    check-cast v2, La/e5p;

    .line 571
    .line 572
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 573
    .line 574
    .line 575
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 576
    .line 577
    .line 578
    instance-of v1, v2, La/g4p;

    .line 579
    .line 580
    if-eqz v1, :cond_e

    .line 581
    .line 582
    invoke-static {v14}, La/q8x;->e(I)J

    .line 583
    .line 584
    .line 585
    move-result-wide v0

    .line 586
    goto :goto_c

    .line 587
    :cond_e
    invoke-static {v0}, La/q8x;->e(I)J

    .line 588
    .line 589
    .line 590
    move-result-wide v0

    .line 591
    :goto_c
    new-instance v2, La/pgv;

    .line 592
    .line 593
    invoke-direct {v2, v0, v1}, La/pgv;-><init>(J)V

    .line 594
    .line 595
    .line 596
    return-object v2

    .line 597
    :pswitch_5
    move-object/from16 v1, p1

    .line 598
    .line 599
    check-cast v1, La/x8z;

    .line 600
    .line 601
    move-object/from16 v2, p2

    .line 602
    .line 603
    check-cast v2, Ljava/lang/Integer;

    .line 604
    .line 605
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 606
    .line 607
    .line 608
    move-object/from16 v2, p3

    .line 609
    .line 610
    check-cast v2, La/e5p;

    .line 611
    .line 612
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 613
    .line 614
    .line 615
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 616
    .line 617
    .line 618
    instance-of v1, v2, La/g4p;

    .line 619
    .line 620
    if-eqz v1, :cond_f

    .line 621
    .line 622
    invoke-static {v14}, La/q8x;->e(I)J

    .line 623
    .line 624
    .line 625
    move-result-wide v0

    .line 626
    goto :goto_d

    .line 627
    :cond_f
    invoke-static {v0}, La/q8x;->e(I)J

    .line 628
    .line 629
    .line 630
    move-result-wide v0

    .line 631
    :goto_d
    new-instance v2, La/pgv;

    .line 632
    .line 633
    invoke-direct {v2, v0, v1}, La/pgv;-><init>(J)V

    .line 634
    .line 635
    .line 636
    return-object v2

    .line 637
    :pswitch_6
    move-object/from16 v1, p1

    .line 638
    .line 639
    check-cast v1, La/g9z;

    .line 640
    .line 641
    move-object/from16 v2, p2

    .line 642
    .line 643
    check-cast v2, La/fet;

    .line 644
    .line 645
    move-object/from16 v4, p3

    .line 646
    .line 647
    check-cast v4, Ljava/lang/Integer;

    .line 648
    .line 649
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 650
    .line 651
    .line 652
    move-result v4

    .line 653
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 654
    .line 655
    .line 656
    and-int/lit8 v1, v4, 0x11

    .line 657
    .line 658
    if-eq v1, v11, :cond_10

    .line 659
    .line 660
    move v1, v14

    .line 661
    goto :goto_e

    .line 662
    :cond_10
    move v1, v13

    .line 663
    :goto_e
    and-int/2addr v4, v14

    .line 664
    invoke-virtual {v2, v4, v1}, La/fet;->U(IZ)Z

    .line 665
    .line 666
    .line 667
    move-result v1

    .line 668
    if-eqz v1, :cond_15

    .line 669
    .line 670
    sget-object v1, La/zaq0;->b:La/zfn;

    .line 671
    .line 672
    invoke-virtual {v2, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v1

    .line 676
    check-cast v1, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 677
    .line 678
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 679
    .line 680
    .line 681
    move-result-wide v4

    .line 682
    sget-object v1, La/jd8;->n:La/ljc;

    .line 683
    .line 684
    invoke-static {v12, v4, v5, v1}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 685
    .line 686
    .line 687
    move-result-object v1

    .line 688
    sget-object v4, La/qmk;->a:La/zcl;

    .line 689
    .line 690
    const/high16 v4, 0x41000000    # 8.0f

    .line 691
    .line 692
    invoke-static {v1, v4, v7, v10}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 693
    .line 694
    .line 695
    move-result-object v1

    .line 696
    sget-object v4, La/uc9;->c:La/mw3;

    .line 697
    .line 698
    sget-object v5, La/gqw0;->m:La/xx7;

    .line 699
    .line 700
    invoke-static {v4, v5, v2, v13}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 701
    .line 702
    .line 703
    move-result-object v4

    .line 704
    move v5, v10

    .line 705
    iget-wide v10, v2, La/fet;->T:J

    .line 706
    .line 707
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 708
    .line 709
    .line 710
    move-result v7

    .line 711
    invoke-virtual {v2}, La/fet;->m()La/bh90;

    .line 712
    .line 713
    .line 714
    move-result-object v10

    .line 715
    invoke-static {v2, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 716
    .line 717
    .line 718
    move-result-object v1

    .line 719
    sget-object v11, La/mkd;->c0:La/gqw0;

    .line 720
    .line 721
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 722
    .line 723
    .line 724
    invoke-virtual {v2}, La/fet;->i0()V

    .line 725
    .line 726
    .line 727
    iget-boolean v11, v2, La/fet;->S:Z

    .line 728
    .line 729
    if-eqz v11, :cond_11

    .line 730
    .line 731
    invoke-virtual {v2, v8}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 732
    .line 733
    .line 734
    goto :goto_f

    .line 735
    :cond_11
    invoke-virtual {v2}, La/fet;->r0()V

    .line 736
    .line 737
    .line 738
    :goto_f
    sget-object v11, La/gqw0;->x:La/shd;

    .line 739
    .line 740
    invoke-static {v2, v4, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 741
    .line 742
    .line 743
    sget-object v4, La/gqw0;->w:La/shd;

    .line 744
    .line 745
    invoke-static {v2, v10, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 746
    .line 747
    .line 748
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 749
    .line 750
    .line 751
    move-result-object v7

    .line 752
    sget-object v10, La/gqw0;->y:La/shd;

    .line 753
    .line 754
    invoke-static {v2, v7, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 755
    .line 756
    .line 757
    invoke-static {v2}, La/jpm0;->n(La/fet;)V

    .line 758
    .line 759
    .line 760
    sget-object v7, La/gqw0;->v:La/shd;

    .line 761
    .line 762
    invoke-static {v2, v1, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 763
    .line 764
    .line 765
    const/high16 v1, 0x42100000    # 36.0f

    .line 766
    .line 767
    invoke-static {v12, v1}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 768
    .line 769
    .line 770
    move-result-object v1

    .line 771
    sget-object v15, La/gqw0;->e:La/zx7;

    .line 772
    .line 773
    move/from16 p1, v5

    .line 774
    .line 775
    invoke-static {v15, v13}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 776
    .line 777
    .line 778
    move-result-object v5

    .line 779
    iget-wide v13, v2, La/fet;->T:J

    .line 780
    .line 781
    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    .line 782
    .line 783
    .line 784
    move-result v13

    .line 785
    invoke-virtual {v2}, La/fet;->m()La/bh90;

    .line 786
    .line 787
    .line 788
    move-result-object v14

    .line 789
    invoke-static {v2, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 790
    .line 791
    .line 792
    move-result-object v1

    .line 793
    invoke-virtual {v2}, La/fet;->i0()V

    .line 794
    .line 795
    .line 796
    iget-boolean v3, v2, La/fet;->S:Z

    .line 797
    .line 798
    if-eqz v3, :cond_12

    .line 799
    .line 800
    invoke-virtual {v2, v8}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 801
    .line 802
    .line 803
    goto :goto_10

    .line 804
    :cond_12
    invoke-virtual {v2}, La/fet;->r0()V

    .line 805
    .line 806
    .line 807
    :goto_10
    invoke-static {v2, v5, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 808
    .line 809
    .line 810
    invoke-static {v2, v14, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 811
    .line 812
    .line 813
    invoke-static {v13, v2, v10, v2}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 814
    .line 815
    .line 816
    invoke-static {v2, v1, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 817
    .line 818
    .line 819
    invoke-static {v12, v6}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 820
    .line 821
    .line 822
    move-result-object v1

    .line 823
    rem-int/lit8 v0, v0, 0x2

    .line 824
    .line 825
    if-eqz v0, :cond_13

    .line 826
    .line 827
    const/high16 v0, 0x43000000    # 128.0f

    .line 828
    .line 829
    goto :goto_11

    .line 830
    :cond_13
    const/high16 v0, 0x42a00000    # 80.0f

    .line 831
    .line 832
    :goto_11
    invoke-static {v1, v0}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 833
    .line 834
    .line 835
    move-result-object v0

    .line 836
    sget-object v1, La/qmk;->m:La/zcl;

    .line 837
    .line 838
    sget-object v3, La/vgg0;->a:La/ugg0;

    .line 839
    .line 840
    invoke-static {v1, v1, v1, v1, v0}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 841
    .line 842
    .line 843
    move-result-object v0

    .line 844
    const/4 v1, 0x0

    .line 845
    const/4 v3, 0x1

    .line 846
    invoke-static {v9, v2, v1, v3}, La/vbc;->d0(La/vqm;La/fet;II)La/fqj0;

    .line 847
    .line 848
    .line 849
    move-result-object v5

    .line 850
    invoke-static {v0, v5, v2, v1, v3}, La/dw9;->x(La/mm40;La/fqj0;La/fet;IZ)V

    .line 851
    .line 852
    .line 853
    const/high16 v0, 0x42400000    # 48.0f

    .line 854
    .line 855
    invoke-static {v12, v0}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 856
    .line 857
    .line 858
    move-result-object v0

    .line 859
    invoke-static {v15, v1}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 860
    .line 861
    .line 862
    move-result-object v1

    .line 863
    iget-wide v5, v2, La/fet;->T:J

    .line 864
    .line 865
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 866
    .line 867
    .line 868
    move-result v3

    .line 869
    invoke-virtual {v2}, La/fet;->m()La/bh90;

    .line 870
    .line 871
    .line 872
    move-result-object v5

    .line 873
    invoke-static {v2, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 874
    .line 875
    .line 876
    move-result-object v0

    .line 877
    invoke-virtual {v2}, La/fet;->i0()V

    .line 878
    .line 879
    .line 880
    iget-boolean v6, v2, La/fet;->S:Z

    .line 881
    .line 882
    if-eqz v6, :cond_14

    .line 883
    .line 884
    invoke-virtual {v2, v8}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 885
    .line 886
    .line 887
    goto :goto_12

    .line 888
    :cond_14
    invoke-virtual {v2}, La/fet;->r0()V

    .line 889
    .line 890
    .line 891
    :goto_12
    invoke-static {v2, v1, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 892
    .line 893
    .line 894
    invoke-static {v2, v5, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 895
    .line 896
    .line 897
    invoke-static {v3, v2, v10, v2}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 898
    .line 899
    .line 900
    invoke-static {v2, v0, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 901
    .line 902
    .line 903
    sget-object v0, La/kr00;->a:La/zfn;

    .line 904
    .line 905
    invoke-virtual {v2, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 906
    .line 907
    .line 908
    move-result-object v0

    .line 909
    check-cast v0, Ljava/lang/Boolean;

    .line 910
    .line 911
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 912
    .line 913
    .line 914
    move-result v19

    .line 915
    const/16 v23, 0x30

    .line 916
    .line 917
    const/16 v24, 0x19

    .line 918
    .line 919
    const/16 v17, 0x0

    .line 920
    .line 921
    sget-object v18, La/f4n;->a:La/f4n;

    .line 922
    .line 923
    const/16 v20, 0x0

    .line 924
    .line 925
    const/16 v21, 0x0

    .line 926
    .line 927
    move-object/from16 v22, v2

    .line 928
    .line 929
    invoke-static/range {v17 .. v24}, La/agc;->t(La/mm40;La/k4n;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 930
    .line 931
    .line 932
    move-object/from16 v0, v22

    .line 933
    .line 934
    const/4 v3, 0x1

    .line 935
    invoke-virtual {v0, v3}, La/fet;->r(Z)V

    .line 936
    .line 937
    .line 938
    invoke-virtual {v0, v3}, La/fet;->r(Z)V

    .line 939
    .line 940
    .line 941
    goto :goto_13

    .line 942
    :cond_15
    move-object v0, v2

    .line 943
    invoke-virtual {v0}, La/fet;->X()V

    .line 944
    .line 945
    .line 946
    :goto_13
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 947
    .line 948
    return-object v0

    .line 949
    :pswitch_7
    move-object/from16 v1, p1

    .line 950
    .line 951
    check-cast v1, La/x8z;

    .line 952
    .line 953
    move-object/from16 v2, p2

    .line 954
    .line 955
    check-cast v2, Ljava/lang/Integer;

    .line 956
    .line 957
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 958
    .line 959
    .line 960
    move-object/from16 v2, p3

    .line 961
    .line 962
    check-cast v2, La/p6t0;

    .line 963
    .line 964
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 965
    .line 966
    .line 967
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 968
    .line 969
    .line 970
    instance-of v1, v2, La/bds0;

    .line 971
    .line 972
    if-eqz v1, :cond_16

    .line 973
    .line 974
    invoke-static {v0}, La/q8x;->e(I)J

    .line 975
    .line 976
    .line 977
    move-result-wide v0

    .line 978
    goto :goto_14

    .line 979
    :cond_16
    instance-of v1, v2, La/hds0;

    .line 980
    .line 981
    if-eqz v1, :cond_17

    .line 982
    .line 983
    invoke-static {v0}, La/q8x;->e(I)J

    .line 984
    .line 985
    .line 986
    move-result-wide v0

    .line 987
    goto :goto_14

    .line 988
    :cond_17
    const/16 v25, 0x1

    .line 989
    .line 990
    invoke-static/range {v25 .. v25}, La/q8x;->e(I)J

    .line 991
    .line 992
    .line 993
    move-result-wide v0

    .line 994
    :goto_14
    new-instance v2, La/pgv;

    .line 995
    .line 996
    invoke-direct {v2, v0, v1}, La/pgv;-><init>(J)V

    .line 997
    .line 998
    .line 999
    return-object v2

    .line 1000
    nop

    .line 1001
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
