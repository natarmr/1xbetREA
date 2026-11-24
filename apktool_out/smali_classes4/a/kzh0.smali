.class public final synthetic La/kzh0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/l7m0;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/kzh0;->a:B

    iput-object p1, p0, La/kzh0;->b:La/l7m0;

    iput-object p2, p0, La/kzh0;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/kzh0;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    sget-object v3, La/jr8;->a:La/jr8;

    .line 8
    .line 9
    sget-object v4, La/e7z;->u1:La/pcy;

    .line 10
    .line 11
    sget-object v5, La/jm40;->b:La/jm40;

    .line 12
    .line 13
    const/16 v6, 0x400

    .line 14
    .line 15
    const/4 v7, 0x1

    .line 16
    const/4 v8, 0x0

    .line 17
    iget-object v9, v0, La/kzh0;->c:Lkotlin/jvm/functions/Function1;

    .line 18
    .line 19
    iget-object v0, v0, La/kzh0;->b:La/l7m0;

    .line 20
    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    move-object/from16 v1, p1

    .line 25
    .line 26
    check-cast v1, La/hh80;

    .line 27
    .line 28
    move-object/from16 v10, p2

    .line 29
    .line 30
    check-cast v10, La/l7m0;

    .line 31
    .line 32
    move-object/from16 v11, p3

    .line 33
    .line 34
    check-cast v11, La/l7m0;

    .line 35
    .line 36
    move-object/from16 v12, p4

    .line 37
    .line 38
    check-cast v12, La/fet;

    .line 39
    .line 40
    move-object/from16 v13, p5

    .line 41
    .line 42
    check-cast v13, Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result v13

    .line 48
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    and-int/lit16 v1, v13, 0x401

    .line 58
    .line 59
    if-eq v1, v6, :cond_0

    .line 60
    .line 61
    move v1, v7

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    move v1, v8

    .line 64
    :goto_0
    and-int/lit8 v6, v13, 0x1

    .line 65
    .line 66
    invoke-virtual {v12, v6, v1}, La/fet;->U(IZ)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_6

    .line 71
    .line 72
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, La/zew;

    .line 77
    .line 78
    iget-object v0, v0, La/zew;->b:La/l7m0;

    .line 79
    .line 80
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, La/few;

    .line 85
    .line 86
    iget-object v0, v0, La/few;->a:La/jwb;

    .line 87
    .line 88
    instance-of v1, v0, La/dew;

    .line 89
    .line 90
    if-eqz v1, :cond_1

    .line 91
    .line 92
    const v1, 0x6fee348c

    .line 93
    .line 94
    .line 95
    invoke-virtual {v12, v1}, La/fet;->e0(I)V

    .line 96
    .line 97
    .line 98
    check-cast v0, La/dew;

    .line 99
    .line 100
    iget-object v0, v0, La/dew;->a:La/l7m0;

    .line 101
    .line 102
    const/4 v1, 0x6

    .line 103
    invoke-static {v0, v9, v12, v1}, La/y0x0;->o(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v12, v8}, La/fet;->r(Z)V

    .line 107
    .line 108
    .line 109
    goto/16 :goto_2

    .line 110
    .line 111
    :cond_1
    instance-of v1, v0, La/eew;

    .line 112
    .line 113
    if-eqz v1, :cond_5

    .line 114
    .line 115
    const v1, 0x6ff2b065

    .line 116
    .line 117
    .line 118
    invoke-virtual {v12, v1}, La/fet;->e0(I)V

    .line 119
    .line 120
    .line 121
    const/high16 v1, 0x3f800000    # 1.0f

    .line 122
    .line 123
    invoke-static {v5, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    invoke-static {v6, v1}, La/o7k0;->c(La/mm40;F)La/mm40;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    sget-object v6, La/gqw0;->a:La/zx7;

    .line 132
    .line 133
    invoke-static {v6, v8}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    iget-wide v10, v12, La/fet;->T:J

    .line 138
    .line 139
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 140
    .line 141
    .line 142
    move-result v10

    .line 143
    invoke-virtual {v12}, La/fet;->m()La/bh90;

    .line 144
    .line 145
    .line 146
    move-result-object v11

    .line 147
    invoke-static {v12, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    sget-object v13, La/mkd;->c0:La/gqw0;

    .line 152
    .line 153
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v12}, La/fet;->i0()V

    .line 157
    .line 158
    .line 159
    iget-boolean v13, v12, La/fet;->S:Z

    .line 160
    .line 161
    if-eqz v13, :cond_2

    .line 162
    .line 163
    invoke-virtual {v12, v4}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 164
    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_2
    invoke-virtual {v12}, La/fet;->r0()V

    .line 168
    .line 169
    .line 170
    :goto_1
    sget-object v4, La/gqw0;->x:La/shd;

    .line 171
    .line 172
    invoke-static {v12, v6, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 173
    .line 174
    .line 175
    sget-object v4, La/gqw0;->w:La/shd;

    .line 176
    .line 177
    invoke-static {v12, v11, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 178
    .line 179
    .line 180
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    sget-object v6, La/gqw0;->y:La/shd;

    .line 185
    .line 186
    invoke-static {v12, v4, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 187
    .line 188
    .line 189
    invoke-static {v12}, La/jpm0;->n(La/fet;)V

    .line 190
    .line 191
    .line 192
    sget-object v4, La/gqw0;->v:La/shd;

    .line 193
    .line 194
    invoke-static {v12, v1, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 195
    .line 196
    .line 197
    sget-object v1, La/gqw0;->e:La/zx7;

    .line 198
    .line 199
    invoke-virtual {v3, v5, v1}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    check-cast v0, La/eew;

    .line 204
    .line 205
    iget-object v13, v0, La/eew;->a:La/mdm;

    .line 206
    .line 207
    invoke-virtual {v12, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    if-nez v0, :cond_3

    .line 216
    .line 217
    if-ne v3, v2, :cond_4

    .line 218
    .line 219
    :cond_3
    new-instance v3, La/i8v;

    .line 220
    .line 221
    const/16 v0, 0xc

    .line 222
    .line 223
    invoke-direct {v3, v9, v0}, La/i8v;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v12, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    :cond_4
    move-object v15, v3

    .line 230
    check-cast v15, Lkotlin/jvm/functions/Function0;

    .line 231
    .line 232
    const/16 v17, 0x0

    .line 233
    .line 234
    const/16 v18, 0x4

    .line 235
    .line 236
    const/4 v14, 0x0

    .line 237
    move-object/from16 v16, v12

    .line 238
    .line 239
    move-object v12, v1

    .line 240
    invoke-static/range {v12 .. v18}, La/jcb;->l(La/mm40;La/mdm;ZLkotlin/jvm/functions/Function0;La/fet;II)V

    .line 241
    .line 242
    .line 243
    move-object/from16 v0, v16

    .line 244
    .line 245
    invoke-virtual {v0, v7}, La/fet;->r(Z)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v0, v8}, La/fet;->r(Z)V

    .line 249
    .line 250
    .line 251
    goto :goto_2

    .line 252
    :cond_5
    move-object v0, v12

    .line 253
    const v1, -0x1d6bfb34

    .line 254
    .line 255
    .line 256
    invoke-static {v1, v0, v8}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    throw v0

    .line 261
    :cond_6
    move-object v0, v12

    .line 262
    invoke-virtual {v0}, La/fet;->X()V

    .line 263
    .line 264
    .line 265
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 266
    .line 267
    return-object v0

    .line 268
    :pswitch_0
    sget-object v1, La/gqw0;->v:La/shd;

    .line 269
    .line 270
    sget-object v10, La/gqw0;->y:La/shd;

    .line 271
    .line 272
    sget-object v11, La/gqw0;->w:La/shd;

    .line 273
    .line 274
    sget-object v12, La/gqw0;->x:La/shd;

    .line 275
    .line 276
    move-object/from16 v13, p1

    .line 277
    .line 278
    check-cast v13, La/hh80;

    .line 279
    .line 280
    move-object/from16 v14, p2

    .line 281
    .line 282
    check-cast v14, La/l7m0;

    .line 283
    .line 284
    move-object/from16 v15, p3

    .line 285
    .line 286
    check-cast v15, La/l7m0;

    .line 287
    .line 288
    move/from16 v23, v7

    .line 289
    .line 290
    move-object/from16 v7, p4

    .line 291
    .line 292
    check-cast v7, La/fet;

    .line 293
    .line 294
    move-object/from16 v16, p5

    .line 295
    .line 296
    check-cast v16, Ljava/lang/Integer;

    .line 297
    .line 298
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    .line 299
    .line 300
    .line 301
    move-result v8

    .line 302
    sget-object v6, La/gqw0;->e:La/zx7;

    .line 303
    .line 304
    move-object/from16 v17, v0

    .line 305
    .line 306
    sget-object v0, La/gqw0;->a:La/zx7;

    .line 307
    .line 308
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    and-int/lit16 v13, v8, 0x401

    .line 318
    .line 319
    const/16 v14, 0x400

    .line 320
    .line 321
    if-eq v13, v14, :cond_7

    .line 322
    .line 323
    move/from16 v13, v23

    .line 324
    .line 325
    goto :goto_3

    .line 326
    :cond_7
    const/4 v13, 0x0

    .line 327
    :goto_3
    and-int/lit8 v8, v8, 0x1

    .line 328
    .line 329
    invoke-virtual {v7, v8, v13}, La/fet;->U(IZ)Z

    .line 330
    .line 331
    .line 332
    move-result v8

    .line 333
    if-eqz v8, :cond_10

    .line 334
    .line 335
    invoke-interface/range {v17 .. v17}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v8

    .line 339
    check-cast v8, La/vzh0;

    .line 340
    .line 341
    iget-object v8, v8, La/vzh0;->b:La/l7m0;

    .line 342
    .line 343
    invoke-interface {v8}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v8

    .line 347
    check-cast v8, La/ozh0;

    .line 348
    .line 349
    if-eqz v8, :cond_e

    .line 350
    .line 351
    instance-of v13, v8, La/lzh0;

    .line 352
    .line 353
    if-eqz v13, :cond_8

    .line 354
    .line 355
    const v0, -0x34469982

    .line 356
    .line 357
    .line 358
    invoke-virtual {v7, v0}, La/fet;->e0(I)V

    .line 359
    .line 360
    .line 361
    check-cast v8, La/lzh0;

    .line 362
    .line 363
    iget-object v0, v8, La/lzh0;->a:La/l7m0;

    .line 364
    .line 365
    const/4 v13, 0x0

    .line 366
    invoke-static {v0, v9, v7, v13}, La/ohq0;->O(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v7, v13}, La/fet;->r(Z)V

    .line 370
    .line 371
    .line 372
    goto/16 :goto_6

    .line 373
    .line 374
    :cond_8
    const/4 v13, 0x0

    .line 375
    instance-of v14, v8, La/mzh0;

    .line 376
    .line 377
    if-eqz v14, :cond_c

    .line 378
    .line 379
    const v14, -0x3442ceb3    # -2.479785E7f

    .line 380
    .line 381
    .line 382
    invoke-virtual {v7, v14}, La/fet;->e0(I)V

    .line 383
    .line 384
    .line 385
    sget-object v14, La/o7k0;->c:La/n0q;

    .line 386
    .line 387
    invoke-static {v0, v13}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    move-object/from16 p0, v8

    .line 392
    .line 393
    move-object v13, v9

    .line 394
    iget-wide v8, v7, La/fet;->T:J

    .line 395
    .line 396
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 397
    .line 398
    .line 399
    move-result v8

    .line 400
    invoke-virtual {v7}, La/fet;->m()La/bh90;

    .line 401
    .line 402
    .line 403
    move-result-object v9

    .line 404
    invoke-static {v7, v14}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 405
    .line 406
    .line 407
    move-result-object v14

    .line 408
    sget-object v15, La/mkd;->c0:La/gqw0;

    .line 409
    .line 410
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v7}, La/fet;->i0()V

    .line 414
    .line 415
    .line 416
    iget-boolean v15, v7, La/fet;->S:Z

    .line 417
    .line 418
    if-eqz v15, :cond_9

    .line 419
    .line 420
    invoke-virtual {v7, v4}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 421
    .line 422
    .line 423
    goto :goto_4

    .line 424
    :cond_9
    invoke-virtual {v7}, La/fet;->r0()V

    .line 425
    .line 426
    .line 427
    :goto_4
    invoke-static {v7, v0, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 428
    .line 429
    .line 430
    invoke-static {v7, v9, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 431
    .line 432
    .line 433
    invoke-static {v8, v7, v10, v7}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 434
    .line 435
    .line 436
    invoke-static {v7, v14, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v3, v5, v6}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 440
    .line 441
    .line 442
    move-result-object v16

    .line 443
    move-object/from16 v8, p0

    .line 444
    .line 445
    check-cast v8, La/mzh0;

    .line 446
    .line 447
    iget-object v0, v8, La/mzh0;->a:La/mdm;

    .line 448
    .line 449
    invoke-virtual {v7, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 450
    .line 451
    .line 452
    move-result v1

    .line 453
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v3

    .line 457
    if-nez v1, :cond_a

    .line 458
    .line 459
    if-ne v3, v2, :cond_b

    .line 460
    .line 461
    :cond_a
    new-instance v3, La/dng0;

    .line 462
    .line 463
    const/16 v1, 0x15

    .line 464
    .line 465
    invoke-direct {v3, v13, v1}, La/dng0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v7, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 469
    .line 470
    .line 471
    :cond_b
    move-object/from16 v19, v3

    .line 472
    .line 473
    check-cast v19, Lkotlin/jvm/functions/Function0;

    .line 474
    .line 475
    const/16 v21, 0x0

    .line 476
    .line 477
    const/16 v22, 0x4

    .line 478
    .line 479
    const/16 v18, 0x0

    .line 480
    .line 481
    move-object/from16 v17, v0

    .line 482
    .line 483
    move-object/from16 v20, v7

    .line 484
    .line 485
    invoke-static/range {v16 .. v22}, La/jcb;->l(La/mm40;La/mdm;ZLkotlin/jvm/functions/Function0;La/fet;II)V

    .line 486
    .line 487
    .line 488
    move-object/from16 v2, v20

    .line 489
    .line 490
    move/from16 v0, v23

    .line 491
    .line 492
    invoke-virtual {v2, v0}, La/fet;->r(Z)V

    .line 493
    .line 494
    .line 495
    const/4 v13, 0x0

    .line 496
    invoke-virtual {v2, v13}, La/fet;->r(Z)V

    .line 497
    .line 498
    .line 499
    goto :goto_6

    .line 500
    :cond_c
    move-object v2, v7

    .line 501
    instance-of v7, v8, La/nzh0;

    .line 502
    .line 503
    if-eqz v7, :cond_f

    .line 504
    .line 505
    const v7, -0x343c6ca9    # -2.5634478E7f

    .line 506
    .line 507
    .line 508
    invoke-virtual {v2, v7}, La/fet;->e0(I)V

    .line 509
    .line 510
    .line 511
    sget-object v7, La/o7k0;->c:La/n0q;

    .line 512
    .line 513
    invoke-static {v0, v13}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    iget-wide v13, v2, La/fet;->T:J

    .line 518
    .line 519
    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    .line 520
    .line 521
    .line 522
    move-result v9

    .line 523
    invoke-virtual {v2}, La/fet;->m()La/bh90;

    .line 524
    .line 525
    .line 526
    move-result-object v13

    .line 527
    invoke-static {v2, v7}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 528
    .line 529
    .line 530
    move-result-object v7

    .line 531
    sget-object v14, La/mkd;->c0:La/gqw0;

    .line 532
    .line 533
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 534
    .line 535
    .line 536
    invoke-virtual {v2}, La/fet;->i0()V

    .line 537
    .line 538
    .line 539
    iget-boolean v14, v2, La/fet;->S:Z

    .line 540
    .line 541
    if-eqz v14, :cond_d

    .line 542
    .line 543
    invoke-virtual {v2, v4}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 544
    .line 545
    .line 546
    goto :goto_5

    .line 547
    :cond_d
    invoke-virtual {v2}, La/fet;->r0()V

    .line 548
    .line 549
    .line 550
    :goto_5
    invoke-static {v2, v0, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 551
    .line 552
    .line 553
    invoke-static {v2, v13, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 554
    .line 555
    .line 556
    invoke-static {v9, v2, v10, v2}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 557
    .line 558
    .line 559
    invoke-static {v2, v7, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 560
    .line 561
    .line 562
    invoke-virtual {v3, v5, v6}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 563
    .line 564
    .line 565
    move-result-object v0

    .line 566
    check-cast v8, La/nzh0;

    .line 567
    .line 568
    iget-object v1, v8, La/nzh0;->a:La/v2h;

    .line 569
    .line 570
    const/4 v13, 0x0

    .line 571
    invoke-static {v0, v1, v13, v2, v13}, La/jwb;->g(La/mm40;La/v2h;ZLa/fet;I)V

    .line 572
    .line 573
    .line 574
    const/4 v0, 0x1

    .line 575
    invoke-virtual {v2, v0}, La/fet;->r(Z)V

    .line 576
    .line 577
    .line 578
    invoke-virtual {v2, v13}, La/fet;->r(Z)V

    .line 579
    .line 580
    .line 581
    goto :goto_6

    .line 582
    :cond_e
    move-object v2, v7

    .line 583
    const/4 v13, 0x0

    .line 584
    :cond_f
    const v0, -0x3b7e3099

    .line 585
    .line 586
    .line 587
    invoke-static {v0, v2, v13}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    throw v0

    .line 592
    :cond_10
    move-object v2, v7

    .line 593
    invoke-virtual {v2}, La/fet;->X()V

    .line 594
    .line 595
    .line 596
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 597
    .line 598
    return-object v0

    .line 599
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
