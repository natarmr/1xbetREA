.class public final synthetic La/pnd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/snd;


# direct methods
.method public synthetic constructor <init>(La/snd;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/pnd;->a:B

    iput-object p1, p0, La/pnd;->b:La/snd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/pnd;->a:B

    .line 4
    .line 5
    const/16 v2, 0x10

    .line 6
    .line 7
    const/16 v3, 0x20

    .line 8
    .line 9
    iget-object v0, v0, La/pnd;->b:La/snd;

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    const/4 v5, 0x0

    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object/from16 v1, p1

    .line 17
    .line 18
    check-cast v1, La/y5d;

    .line 19
    .line 20
    move-object/from16 v6, p2

    .line 21
    .line 22
    check-cast v6, La/mm40;

    .line 23
    .line 24
    move-object/from16 v10, p3

    .line 25
    .line 26
    check-cast v10, La/fet;

    .line 27
    .line 28
    move-object/from16 v7, p4

    .line 29
    .line 30
    check-cast v7, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    const/4 v8, 0x2

    .line 37
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v13

    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    and-int/lit8 v9, v7, 0x6

    .line 48
    .line 49
    if-nez v9, :cond_1

    .line 50
    .line 51
    invoke-virtual {v10, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v9

    .line 55
    if-eqz v9, :cond_0

    .line 56
    .line 57
    const/4 v8, 0x4

    .line 58
    :cond_0
    or-int/2addr v8, v7

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    move v8, v7

    .line 61
    :goto_0
    const/16 v14, 0x30

    .line 62
    .line 63
    and-int/2addr v7, v14

    .line 64
    if-nez v7, :cond_3

    .line 65
    .line 66
    invoke-virtual {v10, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    if-eqz v7, :cond_2

    .line 71
    .line 72
    move v2, v3

    .line 73
    :cond_2
    or-int/2addr v8, v2

    .line 74
    :cond_3
    and-int/lit16 v2, v8, 0x93

    .line 75
    .line 76
    const/16 v3, 0x92

    .line 77
    .line 78
    if-eq v2, v3, :cond_4

    .line 79
    .line 80
    move v2, v4

    .line 81
    goto :goto_1

    .line 82
    :cond_4
    move v2, v5

    .line 83
    :goto_1
    and-int/lit8 v3, v8, 0x1

    .line 84
    .line 85
    invoke-virtual {v10, v3, v2}, La/fet;->U(IZ)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_6

    .line 90
    .line 91
    const/high16 v2, 0x3f800000    # 1.0f

    .line 92
    .line 93
    invoke-static {v6, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-static {v1, v3}, La/y5d;->c(La/y5d;La/mm40;)La/mm40;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    sget-object v3, La/qmk;->a:La/zcl;

    .line 102
    .line 103
    sget-object v3, La/gqw0;->k:La/yx7;

    .line 104
    .line 105
    new-instance v6, La/qw3;

    .line 106
    .line 107
    new-instance v7, La/gne;

    .line 108
    .line 109
    const/16 v8, 0xb

    .line 110
    .line 111
    invoke-direct {v7, v3, v8}, La/gne;-><init>(Ljava/lang/Object;B)V

    .line 112
    .line 113
    .line 114
    const/high16 v3, 0x40000000    # 2.0f

    .line 115
    .line 116
    invoke-direct {v6, v3, v5, v7}, La/qw3;-><init>(FZLa/rw3;)V

    .line 117
    .line 118
    .line 119
    sget-object v3, La/gqw0;->m:La/xx7;

    .line 120
    .line 121
    invoke-static {v6, v3, v10, v5}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    iget-wide v6, v10, La/fet;->T:J

    .line 126
    .line 127
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    invoke-virtual {v10}, La/fet;->m()La/bh90;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    invoke-static {v10, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    sget-object v8, La/mkd;->c0:La/gqw0;

    .line 140
    .line 141
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v10}, La/fet;->i0()V

    .line 145
    .line 146
    .line 147
    iget-boolean v8, v10, La/fet;->S:Z

    .line 148
    .line 149
    if-eqz v8, :cond_5

    .line 150
    .line 151
    sget-object v8, La/e7z;->u1:La/pcy;

    .line 152
    .line 153
    invoke-virtual {v10, v8}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 154
    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_5
    invoke-virtual {v10}, La/fet;->r0()V

    .line 158
    .line 159
    .line 160
    :goto_2
    sget-object v8, La/gqw0;->x:La/shd;

    .line 161
    .line 162
    invoke-static {v10, v3, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 163
    .line 164
    .line 165
    sget-object v3, La/gqw0;->w:La/shd;

    .line 166
    .line 167
    invoke-static {v10, v7, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 168
    .line 169
    .line 170
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    sget-object v6, La/gqw0;->y:La/shd;

    .line 175
    .line 176
    invoke-static {v10, v3, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 177
    .line 178
    .line 179
    invoke-static {v10}, La/jpm0;->n(La/fet;)V

    .line 180
    .line 181
    .line 182
    sget-object v3, La/gqw0;->v:La/shd;

    .line 183
    .line 184
    invoke-static {v10, v1, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 185
    .line 186
    .line 187
    sget-object v1, La/cn80;->b:La/zfn;

    .line 188
    .line 189
    sget-object v3, La/w6n;->k:La/w6n;

    .line 190
    .line 191
    invoke-virtual {v1, v3}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 192
    .line 193
    .line 194
    move-result-object v15

    .line 195
    sget-object v6, La/egp0;->a:La/zfn;

    .line 196
    .line 197
    sget-object v7, La/gqw0;->d:La/zx7;

    .line 198
    .line 199
    invoke-virtual {v6, v7}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 200
    .line 201
    .line 202
    move-result-object v16

    .line 203
    sget-object v8, La/egp0;->c:La/zfn;

    .line 204
    .line 205
    sget-object v9, La/j1t0;->e:La/zfn;

    .line 206
    .line 207
    invoke-virtual {v10, v9}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v11

    .line 211
    check-cast v11, La/g1t0;

    .line 212
    .line 213
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    invoke-static {}, La/g1t0;->h()La/y9q0;

    .line 217
    .line 218
    .line 219
    move-result-object v11

    .line 220
    invoke-virtual {v8, v11}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 221
    .line 222
    .line 223
    move-result-object v17

    .line 224
    sget-object v11, La/egp0;->b:La/zfn;

    .line 225
    .line 226
    const/4 v12, 0x5

    .line 227
    invoke-static {v12, v11}, La/dw9;->k(ILa/zfn;)La/l5d0;

    .line 228
    .line 229
    .line 230
    move-result-object v18

    .line 231
    sget-object v4, La/cn80;->a:La/zfn;

    .line 232
    .line 233
    move-object/from16 p1, v9

    .line 234
    .line 235
    sget-object v9, La/bmd;->n:La/zfn;

    .line 236
    .line 237
    invoke-virtual {v10, v9}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v12

    .line 241
    invoke-virtual {v4, v12}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 242
    .line 243
    .line 244
    move-result-object v19

    .line 245
    sget-object v12, La/kcp0;->a:La/zfn;

    .line 246
    .line 247
    move-object/from16 p3, v9

    .line 248
    .line 249
    const/4 v9, 0x0

    .line 250
    invoke-virtual {v12, v9}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 251
    .line 252
    .line 253
    move-result-object v20

    .line 254
    sget-object v9, La/egp0;->d:La/zfn;

    .line 255
    .line 256
    invoke-virtual {v9, v13}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 257
    .line 258
    .line 259
    move-result-object v21

    .line 260
    move-object/from16 v23, v9

    .line 261
    .line 262
    sget-object v9, La/kcp0;->c:La/zfn;

    .line 263
    .line 264
    move-object/from16 v24, v11

    .line 265
    .line 266
    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 267
    .line 268
    invoke-virtual {v9, v11}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 269
    .line 270
    .line 271
    move-result-object v22

    .line 272
    filled-new-array/range {v15 .. v22}, [La/l5d0;

    .line 273
    .line 274
    .line 275
    move-result-object v15

    .line 276
    new-instance v2, La/qnd;

    .line 277
    .line 278
    invoke-direct {v2, v0, v5}, La/qnd;-><init>(La/snd;B)V

    .line 279
    .line 280
    .line 281
    const v5, -0x3ff016b6

    .line 282
    .line 283
    .line 284
    invoke-static {v5, v2, v10}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    invoke-static {v15, v2, v10, v14}, La/obc;->e([La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 289
    .line 290
    .line 291
    sget-object v2, La/jm40;->b:La/jm40;

    .line 292
    .line 293
    const/high16 v5, 0x3f800000    # 1.0f

    .line 294
    .line 295
    invoke-static {v2, v5}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    move-object v5, v11

    .line 300
    const/16 v11, 0x1b6

    .line 301
    .line 302
    move-object v15, v12

    .line 303
    const/4 v12, 0x0

    .line 304
    move-object/from16 v16, v7

    .line 305
    .line 306
    sget-object v7, La/xfi0;->a:La/xfi0;

    .line 307
    .line 308
    move-object/from16 v17, v9

    .line 309
    .line 310
    const/4 v9, 0x1

    .line 311
    move-object/from16 v27, v5

    .line 312
    .line 313
    move-object v5, v8

    .line 314
    move-object/from16 p2, v13

    .line 315
    .line 316
    move-object/from16 v26, v17

    .line 317
    .line 318
    move-object/from16 v25, v23

    .line 319
    .line 320
    move-object/from16 v14, v24

    .line 321
    .line 322
    const/4 v13, 0x5

    .line 323
    move-object v8, v2

    .line 324
    move-object/from16 v17, v15

    .line 325
    .line 326
    move-object/from16 v2, v16

    .line 327
    .line 328
    move-object/from16 v15, p1

    .line 329
    .line 330
    move-object/from16 v16, v0

    .line 331
    .line 332
    move-object/from16 v0, p3

    .line 333
    .line 334
    invoke-static/range {v7 .. v12}, La/mbc;->o(La/bgi0;La/mm40;ZLa/fet;II)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v1, v3}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 338
    .line 339
    .line 340
    move-result-object v28

    .line 341
    invoke-virtual {v6, v2}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 342
    .line 343
    .line 344
    move-result-object v29

    .line 345
    invoke-virtual {v10, v15}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v1

    .line 349
    check-cast v1, La/g1t0;

    .line 350
    .line 351
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    invoke-static {}, La/g1t0;->h()La/y9q0;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    invoke-virtual {v5, v1}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 359
    .line 360
    .line 361
    move-result-object v30

    .line 362
    invoke-static {v13, v14}, La/dw9;->k(ILa/zfn;)La/l5d0;

    .line 363
    .line 364
    .line 365
    move-result-object v31

    .line 366
    invoke-virtual {v10, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    invoke-virtual {v4, v0}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 371
    .line 372
    .line 373
    move-result-object v32

    .line 374
    move-object/from16 v15, v17

    .line 375
    .line 376
    const/4 v0, 0x0

    .line 377
    invoke-virtual {v15, v0}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 378
    .line 379
    .line 380
    move-result-object v33

    .line 381
    move-object/from16 v0, p2

    .line 382
    .line 383
    move-object/from16 v1, v25

    .line 384
    .line 385
    invoke-virtual {v1, v0}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 386
    .line 387
    .line 388
    move-result-object v34

    .line 389
    move-object/from16 v0, v26

    .line 390
    .line 391
    move-object/from16 v5, v27

    .line 392
    .line 393
    invoke-virtual {v0, v5}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 394
    .line 395
    .line 396
    move-result-object v35

    .line 397
    filled-new-array/range {v28 .. v35}, [La/l5d0;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    new-instance v1, La/qnd;

    .line 402
    .line 403
    move-object/from16 v4, v16

    .line 404
    .line 405
    const/4 v6, 0x1

    .line 406
    invoke-direct {v1, v4, v6}, La/qnd;-><init>(La/snd;B)V

    .line 407
    .line 408
    .line 409
    const v2, -0xdf64bbf

    .line 410
    .line 411
    .line 412
    invoke-static {v2, v1, v10}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 413
    .line 414
    .line 415
    move-result-object v1

    .line 416
    const/16 v2, 0x30

    .line 417
    .line 418
    invoke-static {v0, v1, v10, v2}, La/obc;->e([La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v10, v6}, La/fet;->r(Z)V

    .line 422
    .line 423
    .line 424
    goto :goto_3

    .line 425
    :cond_6
    invoke-virtual {v10}, La/fet;->X()V

    .line 426
    .line 427
    .line 428
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 429
    .line 430
    return-object v0

    .line 431
    :pswitch_0
    move v6, v4

    .line 432
    move-object v4, v0

    .line 433
    iget-object v0, v4, La/snd;->h:La/j83;

    .line 434
    .line 435
    move-object/from16 v1, p1

    .line 436
    .line 437
    check-cast v1, La/y5d;

    .line 438
    .line 439
    move-object/from16 v4, p2

    .line 440
    .line 441
    check-cast v4, La/mm40;

    .line 442
    .line 443
    move-object/from16 v7, p3

    .line 444
    .line 445
    check-cast v7, La/fet;

    .line 446
    .line 447
    move-object/from16 v8, p4

    .line 448
    .line 449
    check-cast v8, Ljava/lang/Integer;

    .line 450
    .line 451
    invoke-static {v8, v1, v4}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 452
    .line 453
    .line 454
    move-result v1

    .line 455
    and-int/lit8 v8, v1, 0x30

    .line 456
    .line 457
    if-nez v8, :cond_8

    .line 458
    .line 459
    invoke-virtual {v7, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result v8

    .line 463
    if-eqz v8, :cond_7

    .line 464
    .line 465
    move v2, v3

    .line 466
    :cond_7
    or-int/2addr v1, v2

    .line 467
    :cond_8
    and-int/lit16 v2, v1, 0x91

    .line 468
    .line 469
    const/16 v3, 0x90

    .line 470
    .line 471
    if-eq v2, v3, :cond_9

    .line 472
    .line 473
    goto :goto_4

    .line 474
    :cond_9
    move v6, v5

    .line 475
    :goto_4
    and-int/lit8 v2, v1, 0x1

    .line 476
    .line 477
    invoke-virtual {v7, v2, v6}, La/fet;->U(IZ)Z

    .line 478
    .line 479
    .line 480
    move-result v2

    .line 481
    if-eqz v2, :cond_b

    .line 482
    .line 483
    iget-object v2, v0, La/j83;->b:Ljava/lang/String;

    .line 484
    .line 485
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 486
    .line 487
    .line 488
    move-result v2

    .line 489
    if-lez v2, :cond_a

    .line 490
    .line 491
    const v2, -0x3d9ced7c

    .line 492
    .line 493
    .line 494
    invoke-virtual {v7, v2}, La/fet;->e0(I)V

    .line 495
    .line 496
    .line 497
    shr-int/lit8 v1, v1, 0x3

    .line 498
    .line 499
    and-int/lit8 v1, v1, 0xe

    .line 500
    .line 501
    invoke-static {v4, v0, v7, v1}, La/vic;->a(La/mm40;La/j83;La/fet;I)V

    .line 502
    .line 503
    .line 504
    invoke-virtual {v7, v5}, La/fet;->r(Z)V

    .line 505
    .line 506
    .line 507
    goto :goto_5

    .line 508
    :cond_a
    const v0, -0x3d9a6b91

    .line 509
    .line 510
    .line 511
    invoke-virtual {v7, v0}, La/fet;->e0(I)V

    .line 512
    .line 513
    .line 514
    invoke-virtual {v7, v5}, La/fet;->r(Z)V

    .line 515
    .line 516
    .line 517
    goto :goto_5

    .line 518
    :cond_b
    invoke-virtual {v7}, La/fet;->X()V

    .line 519
    .line 520
    .line 521
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 522
    .line 523
    return-object v0

    .line 524
    nop

    .line 525
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
