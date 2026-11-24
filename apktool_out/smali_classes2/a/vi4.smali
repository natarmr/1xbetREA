.class public final synthetic La/vi4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;

.field public final synthetic c:La/cj4;


# direct methods
.method public synthetic constructor <init>(La/cj4;La/l7m0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/vi4;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/vi4;->c:La/cj4;

    iput-object p2, p0, La/vi4;->b:La/l7m0;

    return-void
.end method

.method public synthetic constructor <init>(La/l7m0;La/cj4;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/vi4;->a:B

    iput-object p1, p0, La/vi4;->b:La/l7m0;

    iput-object p2, p0, La/vi4;->c:La/cj4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/vi4;->a:B

    .line 4
    .line 5
    const/16 v2, 0x12

    .line 6
    .line 7
    const/4 v3, 0x4

    .line 8
    const/4 v4, 0x2

    .line 9
    const/16 v5, 0x10

    .line 10
    .line 11
    sget-object v6, La/ukd;->a:La/cl5;

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    iget-object v8, v0, La/vi4;->c:La/cj4;

    .line 15
    .line 16
    iget-object v0, v0, La/vi4;->b:La/l7m0;

    .line 17
    .line 18
    const/4 v9, 0x1

    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    move-object/from16 v1, p1

    .line 23
    .line 24
    check-cast v1, La/y5d;

    .line 25
    .line 26
    move-object/from16 v15, p2

    .line 27
    .line 28
    check-cast v15, La/fet;

    .line 29
    .line 30
    move-object/from16 v2, p3

    .line 31
    .line 32
    check-cast v2, Ljava/lang/Integer;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    sget-object v3, La/cj4;->U1:La/gfk0;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    and-int/lit8 v1, v2, 0x11

    .line 44
    .line 45
    if-eq v1, v5, :cond_0

    .line 46
    .line 47
    move v7, v9

    .line 48
    :cond_0
    and-int/lit8 v1, v2, 0x1

    .line 49
    .line 50
    invoke-virtual {v15, v1, v7}, La/fet;->U(IZ)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    sget-object v1, La/qmk;->a:La/zcl;

    .line 57
    .line 58
    const/high16 v1, 0x41400000    # 12.0f

    .line 59
    .line 60
    sget-object v2, La/jm40;->b:La/jm40;

    .line 61
    .line 62
    const/4 v3, 0x0

    .line 63
    invoke-static {v2, v3, v1, v9}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 64
    .line 65
    .line 66
    move-result-object v10

    .line 67
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    move-object v11, v0

    .line 72
    check-cast v11, La/s6q0;

    .line 73
    .line 74
    invoke-virtual {v15, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    if-nez v0, :cond_1

    .line 83
    .line 84
    if-ne v1, v6, :cond_2

    .line 85
    .line 86
    :cond_1
    new-instance v1, La/aj4;

    .line 87
    .line 88
    invoke-direct {v1, v8, v9}, La/aj4;-><init>(La/cj4;B)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v15, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :cond_2
    move-object v14, v1

    .line 95
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 96
    .line 97
    const/16 v16, 0x180

    .line 98
    .line 99
    const/16 v17, 0x8

    .line 100
    .line 101
    const/4 v12, 0x7

    .line 102
    const/4 v13, 0x0

    .line 103
    invoke-static/range {v10 .. v17}, La/jwb;->o(La/mm40;La/s6q0;ILa/kly;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_3
    invoke-virtual {v15}, La/fet;->X()V

    .line 108
    .line 109
    .line 110
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    return-object v0

    .line 113
    :pswitch_0
    move-object/from16 v1, p1

    .line 114
    .line 115
    check-cast v1, La/yhg0;

    .line 116
    .line 117
    move-object/from16 v2, p2

    .line 118
    .line 119
    check-cast v2, La/fet;

    .line 120
    .line 121
    move-object/from16 v3, p3

    .line 122
    .line 123
    check-cast v3, Ljava/lang/Integer;

    .line 124
    .line 125
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    sget-object v4, La/cj4;->U1:La/gfk0;

    .line 130
    .line 131
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    and-int/lit8 v1, v3, 0x11

    .line 135
    .line 136
    if-eq v1, v5, :cond_4

    .line 137
    .line 138
    move v7, v9

    .line 139
    :cond_4
    and-int/lit8 v1, v3, 0x1

    .line 140
    .line 141
    invoke-virtual {v2, v1, v7}, La/fet;->U(IZ)Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-eqz v1, :cond_9

    .line 146
    .line 147
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    move-object v11, v0

    .line 152
    check-cast v11, La/jnm;

    .line 153
    .line 154
    invoke-virtual {v2, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    if-nez v0, :cond_5

    .line 163
    .line 164
    if-ne v1, v6, :cond_6

    .line 165
    .line 166
    :cond_5
    new-instance v1, La/ui4;

    .line 167
    .line 168
    const/4 v0, 0x7

    .line 169
    invoke-direct {v1, v8, v0}, La/ui4;-><init>(La/cj4;B)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    :cond_6
    move-object v14, v1

    .line 176
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 177
    .line 178
    invoke-virtual {v2, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    if-nez v0, :cond_7

    .line 187
    .line 188
    if-ne v1, v6, :cond_8

    .line 189
    .line 190
    :cond_7
    new-instance v1, La/aj4;

    .line 191
    .line 192
    const/4 v0, 0x3

    .line 193
    invoke-direct {v1, v8, v0}, La/aj4;-><init>(La/cj4;B)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    :cond_8
    move-object v15, v1

    .line 200
    check-cast v15, Lkotlin/jvm/functions/Function1;

    .line 201
    .line 202
    const/16 v17, 0x180

    .line 203
    .line 204
    const/16 v18, 0x49

    .line 205
    .line 206
    const/4 v10, 0x0

    .line 207
    const/4 v12, 0x6

    .line 208
    const/4 v13, 0x0

    .line 209
    move-object/from16 v16, v2

    .line 210
    .line 211
    invoke-static/range {v10 .. v18}, La/wwb;->k(La/mm40;La/jnm;ILa/kly;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 212
    .line 213
    .line 214
    goto :goto_1

    .line 215
    :cond_9
    move-object/from16 v16, v2

    .line 216
    .line 217
    invoke-virtual/range {v16 .. v16}, La/fet;->X()V

    .line 218
    .line 219
    .line 220
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 221
    .line 222
    return-object v0

    .line 223
    :pswitch_1
    move-object/from16 v1, p1

    .line 224
    .line 225
    check-cast v1, La/yhg0;

    .line 226
    .line 227
    move-object/from16 v15, p2

    .line 228
    .line 229
    check-cast v15, La/fet;

    .line 230
    .line 231
    move-object/from16 v2, p3

    .line 232
    .line 233
    check-cast v2, Ljava/lang/Integer;

    .line 234
    .line 235
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    sget-object v3, La/cj4;->U1:La/gfk0;

    .line 240
    .line 241
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    and-int/lit8 v1, v2, 0x11

    .line 245
    .line 246
    if-eq v1, v5, :cond_a

    .line 247
    .line 248
    move v7, v9

    .line 249
    :cond_a
    and-int/lit8 v1, v2, 0x1

    .line 250
    .line 251
    invoke-virtual {v15, v1, v7}, La/fet;->U(IZ)Z

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    if-eqz v1, :cond_d

    .line 256
    .line 257
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    move-object v11, v0

    .line 262
    check-cast v11, La/s6q0;

    .line 263
    .line 264
    invoke-virtual {v15, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    if-nez v0, :cond_b

    .line 273
    .line 274
    if-ne v1, v6, :cond_c

    .line 275
    .line 276
    :cond_b
    new-instance v1, La/aj4;

    .line 277
    .line 278
    invoke-direct {v1, v8, v4}, La/aj4;-><init>(La/cj4;B)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v15, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    :cond_c
    move-object v14, v1

    .line 285
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 286
    .line 287
    const/16 v16, 0x180

    .line 288
    .line 289
    const/16 v17, 0x9

    .line 290
    .line 291
    const/4 v10, 0x0

    .line 292
    const/4 v12, 0x6

    .line 293
    const/4 v13, 0x0

    .line 294
    invoke-static/range {v10 .. v17}, La/jwb;->o(La/mm40;La/s6q0;ILa/kly;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 295
    .line 296
    .line 297
    goto :goto_2

    .line 298
    :cond_d
    invoke-virtual {v15}, La/fet;->X()V

    .line 299
    .line 300
    .line 301
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 302
    .line 303
    return-object v0

    .line 304
    :pswitch_2
    move-object/from16 v1, p1

    .line 305
    .line 306
    check-cast v1, La/yhg0;

    .line 307
    .line 308
    move-object/from16 v13, p2

    .line 309
    .line 310
    check-cast v13, La/fet;

    .line 311
    .line 312
    move-object/from16 v5, p3

    .line 313
    .line 314
    check-cast v5, Ljava/lang/Integer;

    .line 315
    .line 316
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 317
    .line 318
    .line 319
    move-result v5

    .line 320
    sget-object v10, La/cj4;->U1:La/gfk0;

    .line 321
    .line 322
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    and-int/lit8 v10, v5, 0x6

    .line 326
    .line 327
    if-nez v10, :cond_f

    .line 328
    .line 329
    invoke-virtual {v13, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v10

    .line 333
    if-eqz v10, :cond_e

    .line 334
    .line 335
    goto :goto_3

    .line 336
    :cond_e
    move v3, v4

    .line 337
    :goto_3
    or-int/2addr v5, v3

    .line 338
    :cond_f
    and-int/lit8 v3, v5, 0x13

    .line 339
    .line 340
    if-eq v3, v2, :cond_10

    .line 341
    .line 342
    move v2, v9

    .line 343
    goto :goto_4

    .line 344
    :cond_10
    move v2, v7

    .line 345
    :goto_4
    and-int/lit8 v3, v5, 0x1

    .line 346
    .line 347
    invoke-virtual {v13, v3, v2}, La/fet;->U(IZ)Z

    .line 348
    .line 349
    .line 350
    move-result v2

    .line 351
    if-eqz v2, :cond_15

    .line 352
    .line 353
    sget-object v2, La/qmk;->a:La/zcl;

    .line 354
    .line 355
    const/16 v18, 0x0

    .line 356
    .line 357
    const/16 v19, 0xc

    .line 358
    .line 359
    sget-object v14, La/jm40;->b:La/jm40;

    .line 360
    .line 361
    const/high16 v15, 0x41200000    # 10.0f

    .line 362
    .line 363
    const/high16 v16, 0x41900000    # 18.0f

    .line 364
    .line 365
    const/16 v17, 0x0

    .line 366
    .line 367
    invoke-static/range {v14 .. v19}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    const/high16 v3, 0x42300000    # 44.0f

    .line 372
    .line 373
    invoke-static {v2, v3}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    sget-object v3, La/gqw0;->j:La/yx7;

    .line 378
    .line 379
    invoke-interface {v1, v3, v2}, La/yhg0;->b(La/yx7;La/mm40;)La/mm40;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    sget-object v2, La/gqw0;->e:La/zx7;

    .line 384
    .line 385
    invoke-static {v2, v7}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 386
    .line 387
    .line 388
    move-result-object v2

    .line 389
    iget-wide v3, v13, La/fet;->T:J

    .line 390
    .line 391
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 392
    .line 393
    .line 394
    move-result v3

    .line 395
    invoke-virtual {v13}, La/fet;->m()La/bh90;

    .line 396
    .line 397
    .line 398
    move-result-object v4

    .line 399
    invoke-static {v13, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    sget-object v5, La/mkd;->c0:La/gqw0;

    .line 404
    .line 405
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v13}, La/fet;->i0()V

    .line 409
    .line 410
    .line 411
    iget-boolean v5, v13, La/fet;->S:Z

    .line 412
    .line 413
    if-eqz v5, :cond_11

    .line 414
    .line 415
    sget-object v5, La/e7z;->u1:La/pcy;

    .line 416
    .line 417
    invoke-virtual {v13, v5}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 418
    .line 419
    .line 420
    goto :goto_5

    .line 421
    :cond_11
    invoke-virtual {v13}, La/fet;->r0()V

    .line 422
    .line 423
    .line 424
    :goto_5
    sget-object v5, La/gqw0;->x:La/shd;

    .line 425
    .line 426
    invoke-static {v13, v2, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 427
    .line 428
    .line 429
    sget-object v2, La/gqw0;->w:La/shd;

    .line 430
    .line 431
    invoke-static {v13, v4, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 432
    .line 433
    .line 434
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    sget-object v3, La/gqw0;->y:La/shd;

    .line 439
    .line 440
    invoke-static {v13, v2, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 441
    .line 442
    .line 443
    invoke-static {v13}, La/jpm0;->n(La/fet;)V

    .line 444
    .line 445
    .line 446
    sget-object v2, La/gqw0;->v:La/shd;

    .line 447
    .line 448
    invoke-static {v13, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 449
    .line 450
    .line 451
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    move-object v11, v0

    .line 456
    check-cast v11, La/wul;

    .line 457
    .line 458
    if-nez v11, :cond_12

    .line 459
    .line 460
    const v0, 0x2a3a679b

    .line 461
    .line 462
    .line 463
    invoke-virtual {v13, v0}, La/fet;->e0(I)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v13, v7}, La/fet;->r(Z)V

    .line 467
    .line 468
    .line 469
    goto :goto_6

    .line 470
    :cond_12
    const v0, 0x2a3a679c

    .line 471
    .line 472
    .line 473
    invoke-virtual {v13, v0}, La/fet;->e0(I)V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v13, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    move-result v0

    .line 480
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    if-nez v0, :cond_13

    .line 485
    .line 486
    if-ne v1, v6, :cond_14

    .line 487
    .line 488
    :cond_13
    new-instance v1, La/ui4;

    .line 489
    .line 490
    const/4 v0, 0x6

    .line 491
    invoke-direct {v1, v8, v0}, La/ui4;-><init>(La/cj4;B)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v13, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 495
    .line 496
    .line 497
    :cond_14
    move-object v12, v1

    .line 498
    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 499
    .line 500
    const/4 v14, 0x0

    .line 501
    const/4 v15, 0x1

    .line 502
    const/4 v10, 0x0

    .line 503
    invoke-static/range {v10 .. v15}, La/qzb;->n(La/mm40;La/wul;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v13, v7}, La/fet;->r(Z)V

    .line 507
    .line 508
    .line 509
    :goto_6
    invoke-virtual {v13, v9}, La/fet;->r(Z)V

    .line 510
    .line 511
    .line 512
    goto :goto_7

    .line 513
    :cond_15
    invoke-virtual {v13}, La/fet;->X()V

    .line 514
    .line 515
    .line 516
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 517
    .line 518
    return-object v0

    .line 519
    :pswitch_3
    move-object/from16 v1, p1

    .line 520
    .line 521
    check-cast v1, La/mm40;

    .line 522
    .line 523
    move-object/from16 v5, p2

    .line 524
    .line 525
    check-cast v5, La/fet;

    .line 526
    .line 527
    move-object/from16 v10, p3

    .line 528
    .line 529
    check-cast v10, Ljava/lang/Integer;

    .line 530
    .line 531
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 532
    .line 533
    .line 534
    move-result v10

    .line 535
    sget-object v11, La/cj4;->U1:La/gfk0;

    .line 536
    .line 537
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 538
    .line 539
    .line 540
    and-int/lit8 v11, v10, 0x6

    .line 541
    .line 542
    if-nez v11, :cond_17

    .line 543
    .line 544
    invoke-virtual {v5, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 545
    .line 546
    .line 547
    move-result v11

    .line 548
    if-eqz v11, :cond_16

    .line 549
    .line 550
    goto :goto_8

    .line 551
    :cond_16
    move v3, v4

    .line 552
    :goto_8
    or-int/2addr v10, v3

    .line 553
    :cond_17
    and-int/lit8 v3, v10, 0x13

    .line 554
    .line 555
    if-eq v3, v2, :cond_18

    .line 556
    .line 557
    move v2, v9

    .line 558
    goto :goto_9

    .line 559
    :cond_18
    move v2, v7

    .line 560
    :goto_9
    and-int/lit8 v3, v10, 0x1

    .line 561
    .line 562
    invoke-virtual {v5, v3, v2}, La/fet;->U(IZ)Z

    .line 563
    .line 564
    .line 565
    move-result v2

    .line 566
    if-eqz v2, :cond_1c

    .line 567
    .line 568
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object v2

    .line 572
    if-ne v2, v6, :cond_19

    .line 573
    .line 574
    invoke-static {v5}, La/dw9;->j(La/fet;)La/gy40;

    .line 575
    .line 576
    .line 577
    move-result-object v2

    .line 578
    :cond_19
    move-object v9, v2

    .line 579
    check-cast v9, La/gy40;

    .line 580
    .line 581
    invoke-virtual {v5, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 582
    .line 583
    .line 584
    move-result v2

    .line 585
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v3

    .line 589
    if-nez v2, :cond_1a

    .line 590
    .line 591
    if-ne v3, v6, :cond_1b

    .line 592
    .line 593
    :cond_1a
    new-instance v3, La/ui4;

    .line 594
    .line 595
    const/4 v2, 0x5

    .line 596
    invoke-direct {v3, v8, v2}, La/ui4;-><init>(La/cj4;B)V

    .line 597
    .line 598
    .line 599
    invoke-virtual {v5, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 600
    .line 601
    .line 602
    :cond_1b
    move-object v13, v3

    .line 603
    check-cast v13, Lkotlin/jvm/functions/Function0;

    .line 604
    .line 605
    const/16 v14, 0x1c

    .line 606
    .line 607
    const/4 v10, 0x0

    .line 608
    const/4 v11, 0x0

    .line 609
    const/4 v12, 0x0

    .line 610
    move-object v8, v1

    .line 611
    invoke-static/range {v8 .. v14}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 612
    .line 613
    .line 614
    move-result-object v1

    .line 615
    invoke-static {v1, v0, v7, v5, v7}, La/o050;->c(La/mm40;La/l7m0;ZLa/fet;I)V

    .line 616
    .line 617
    .line 618
    goto :goto_a

    .line 619
    :cond_1c
    invoke-virtual {v5}, La/fet;->X()V

    .line 620
    .line 621
    .line 622
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 623
    .line 624
    return-object v0

    .line 625
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
