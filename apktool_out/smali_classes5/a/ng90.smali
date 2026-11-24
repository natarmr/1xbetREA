.class public final La/ng90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:La/xdr;

.field public final synthetic d:La/ugd;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;La/xdr;La/ugd;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/ng90;->a:B

    iput-object p1, p0, La/ng90;->b:Ljava/util/List;

    iput-object p2, p0, La/ng90;->c:La/xdr;

    iput-object p3, p0, La/ng90;->d:La/ugd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ng90;->a:B

    .line 4
    .line 5
    iget-object v3, v0, La/ng90;->d:La/ugd;

    .line 6
    .line 7
    sget-object v4, La/e7z;->u1:La/pcy;

    .line 8
    .line 9
    const/16 v8, 0xfa

    .line 10
    .line 11
    sget-object v9, La/jm40;->b:La/jm40;

    .line 12
    .line 13
    iget-object v10, v0, La/ng90;->b:Ljava/util/List;

    .line 14
    .line 15
    const/16 v11, 0x92

    .line 16
    .line 17
    const/4 v12, 0x4

    .line 18
    const/16 v18, 0x0

    .line 19
    .line 20
    const/16 v15, 0x32

    .line 21
    .line 22
    iget-object v0, v0, La/ng90;->c:La/xdr;

    .line 23
    .line 24
    const/16 v19, 0x30

    .line 25
    .line 26
    const/4 v14, 0x0

    .line 27
    packed-switch v1, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    move-object/from16 v1, p1

    .line 31
    .line 32
    check-cast v1, La/g9z;

    .line 33
    .line 34
    move-object/from16 v20, p2

    .line 35
    .line 36
    check-cast v20, Ljava/lang/Number;

    .line 37
    .line 38
    const/16 v21, 0x1

    .line 39
    .line 40
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Number;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result v13

    .line 44
    move-object/from16 v2, p3

    .line 45
    .line 46
    check-cast v2, La/fet;

    .line 47
    .line 48
    move-object/from16 v22, p4

    .line 49
    .line 50
    check-cast v22, Ljava/lang/Number;

    .line 51
    .line 52
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Number;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result v22

    .line 56
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    and-int/lit8 v23, v22, 0x6

    .line 61
    .line 62
    if-nez v23, :cond_1

    .line 63
    .line 64
    invoke-virtual {v2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v23

    .line 68
    if-eqz v23, :cond_0

    .line 69
    .line 70
    move/from16 v17, v12

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    const/16 v17, 0x2

    .line 74
    .line 75
    :goto_0
    or-int v17, v22, v17

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    move/from16 v17, v22

    .line 79
    .line 80
    :goto_1
    and-int/lit8 v22, v22, 0x30

    .line 81
    .line 82
    if-nez v22, :cond_3

    .line 83
    .line 84
    invoke-virtual {v2, v13}, La/fet;->e(I)Z

    .line 85
    .line 86
    .line 87
    move-result v22

    .line 88
    if-eqz v22, :cond_2

    .line 89
    .line 90
    const/16 v16, 0x20

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_2
    const/16 v16, 0x10

    .line 94
    .line 95
    :goto_2
    or-int v17, v17, v16

    .line 96
    .line 97
    :cond_3
    move/from16 v6, v17

    .line 98
    .line 99
    and-int/lit16 v7, v6, 0x93

    .line 100
    .line 101
    if-eq v7, v11, :cond_4

    .line 102
    .line 103
    move/from16 v7, v21

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_4
    move/from16 v7, v18

    .line 107
    .line 108
    :goto_3
    and-int/lit8 v6, v6, 0x1

    .line 109
    .line 110
    invoke-virtual {v2, v6, v7}, La/fet;->U(IZ)Z

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    if-eqz v6, :cond_7

    .line 115
    .line 116
    invoke-interface {v10, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    check-cast v6, La/zd90;

    .line 121
    .line 122
    const v7, -0x5acf9d6b

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, v7}, La/fet;->e0(I)V

    .line 126
    .line 127
    .line 128
    invoke-static {v8, v15, v14, v12}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    const/16 v8, 0x64

    .line 133
    .line 134
    invoke-static {v8, v15, v14, v12}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 135
    .line 136
    .line 137
    move-result-object v8

    .line 138
    const/high16 v10, 0x43480000    # 200.0f

    .line 139
    .line 140
    const/high16 v11, 0x3f000000    # 0.5f

    .line 141
    .line 142
    invoke-static {v11, v10, v14, v12}, La/ro4;->g0(FFLjava/lang/Object;I)La/nul0;

    .line 143
    .line 144
    .line 145
    move-result-object v10

    .line 146
    invoke-virtual {v1, v9, v7, v10, v8}, La/g9z;->a(La/mm40;La/cfq;La/cfq;La/cfq;)La/mm40;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    sget-object v7, La/gqw0;->n:La/xx7;

    .line 151
    .line 152
    sget-object v8, La/qmk;->a:La/zcl;

    .line 153
    .line 154
    new-instance v8, La/qw3;

    .line 155
    .line 156
    new-instance v9, La/jf4;

    .line 157
    .line 158
    const/16 v10, 0xe

    .line 159
    .line 160
    invoke-direct {v9, v10}, La/jf4;-><init>(B)V

    .line 161
    .line 162
    .line 163
    const/high16 v10, 0x41000000    # 8.0f

    .line 164
    .line 165
    move/from16 v11, v21

    .line 166
    .line 167
    invoke-direct {v8, v10, v11, v9}, La/qw3;-><init>(FZLa/rw3;)V

    .line 168
    .line 169
    .line 170
    move/from16 v9, v19

    .line 171
    .line 172
    invoke-static {v8, v7, v2, v9}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    iget-wide v8, v2, La/fet;->T:J

    .line 177
    .line 178
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 179
    .line 180
    .line 181
    move-result v8

    .line 182
    invoke-virtual {v2}, La/fet;->m()La/bh90;

    .line 183
    .line 184
    .line 185
    move-result-object v9

    .line 186
    invoke-static {v2, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    sget-object v10, La/mkd;->c0:La/gqw0;

    .line 191
    .line 192
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2}, La/fet;->i0()V

    .line 196
    .line 197
    .line 198
    iget-boolean v10, v2, La/fet;->S:Z

    .line 199
    .line 200
    if-eqz v10, :cond_5

    .line 201
    .line 202
    invoke-virtual {v2, v4}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 203
    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_5
    invoke-virtual {v2}, La/fet;->r0()V

    .line 207
    .line 208
    .line 209
    :goto_4
    sget-object v4, La/gqw0;->x:La/shd;

    .line 210
    .line 211
    invoke-static {v2, v7, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 212
    .line 213
    .line 214
    sget-object v4, La/gqw0;->w:La/shd;

    .line 215
    .line 216
    invoke-static {v2, v9, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 217
    .line 218
    .line 219
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    sget-object v7, La/gqw0;->y:La/shd;

    .line 224
    .line 225
    invoke-static {v2, v4, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 226
    .line 227
    .line 228
    invoke-static {v2}, La/jpm0;->n(La/fet;)V

    .line 229
    .line 230
    .line 231
    sget-object v4, La/gqw0;->v:La/shd;

    .line 232
    .line 233
    invoke-static {v2, v1, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 234
    .line 235
    .line 236
    if-nez v0, :cond_6

    .line 237
    .line 238
    const v0, 0x1fa2bd55

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 242
    .line 243
    .line 244
    move/from16 v1, v18

    .line 245
    .line 246
    :goto_5
    invoke-virtual {v2, v1}, La/fet;->r(Z)V

    .line 247
    .line 248
    .line 249
    goto :goto_6

    .line 250
    :cond_6
    move/from16 v1, v18

    .line 251
    .line 252
    const v4, -0x7ad9b7d4

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2, v4}, La/fet;->e0(I)V

    .line 256
    .line 257
    .line 258
    iget-object v4, v6, La/zd90;->c:Ljava/lang/String;

    .line 259
    .line 260
    invoke-interface {v0, v4, v2, v5}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    goto :goto_5

    .line 264
    :goto_6
    iget-object v0, v6, La/zd90;->a:La/j83;

    .line 265
    .line 266
    iget-object v4, v6, La/zd90;->b:La/j83;

    .line 267
    .line 268
    invoke-virtual {v3, v0, v4, v2, v5}, La/ugd;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    const/4 v11, 0x1

    .line 272
    invoke-virtual {v2, v11}, La/fet;->r(Z)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v2, v1}, La/fet;->r(Z)V

    .line 276
    .line 277
    .line 278
    goto :goto_7

    .line 279
    :cond_7
    invoke-virtual {v2}, La/fet;->X()V

    .line 280
    .line 281
    .line 282
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 283
    .line 284
    return-object v0

    .line 285
    :pswitch_0
    move-object/from16 v1, p1

    .line 286
    .line 287
    check-cast v1, La/g9z;

    .line 288
    .line 289
    move-object/from16 v2, p2

    .line 290
    .line 291
    check-cast v2, Ljava/lang/Number;

    .line 292
    .line 293
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 294
    .line 295
    .line 296
    move-result v2

    .line 297
    move-object/from16 v5, p3

    .line 298
    .line 299
    check-cast v5, La/fet;

    .line 300
    .line 301
    move-object/from16 v6, p4

    .line 302
    .line 303
    check-cast v6, Ljava/lang/Number;

    .line 304
    .line 305
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 306
    .line 307
    .line 308
    move-result v6

    .line 309
    const/16 v18, 0x0

    .line 310
    .line 311
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 312
    .line 313
    .line 314
    move-result-object v7

    .line 315
    and-int/lit8 v13, v6, 0x6

    .line 316
    .line 317
    if-nez v13, :cond_9

    .line 318
    .line 319
    invoke-virtual {v5, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    move-result v13

    .line 323
    if-eqz v13, :cond_8

    .line 324
    .line 325
    move/from16 v17, v12

    .line 326
    .line 327
    goto :goto_8

    .line 328
    :cond_8
    const/16 v17, 0x2

    .line 329
    .line 330
    :goto_8
    or-int v13, v6, v17

    .line 331
    .line 332
    :goto_9
    const/16 v19, 0x30

    .line 333
    .line 334
    goto :goto_a

    .line 335
    :cond_9
    move v13, v6

    .line 336
    goto :goto_9

    .line 337
    :goto_a
    and-int/lit8 v6, v6, 0x30

    .line 338
    .line 339
    if-nez v6, :cond_b

    .line 340
    .line 341
    invoke-virtual {v5, v2}, La/fet;->e(I)Z

    .line 342
    .line 343
    .line 344
    move-result v6

    .line 345
    if-eqz v6, :cond_a

    .line 346
    .line 347
    const/16 v16, 0x20

    .line 348
    .line 349
    goto :goto_b

    .line 350
    :cond_a
    const/16 v16, 0x10

    .line 351
    .line 352
    :goto_b
    or-int v13, v13, v16

    .line 353
    .line 354
    :cond_b
    and-int/lit16 v6, v13, 0x93

    .line 355
    .line 356
    if-eq v6, v11, :cond_c

    .line 357
    .line 358
    const/4 v6, 0x1

    .line 359
    :goto_c
    const/16 v21, 0x1

    .line 360
    .line 361
    goto :goto_d

    .line 362
    :cond_c
    const/4 v6, 0x0

    .line 363
    goto :goto_c

    .line 364
    :goto_d
    and-int/lit8 v11, v13, 0x1

    .line 365
    .line 366
    invoke-virtual {v5, v11, v6}, La/fet;->U(IZ)Z

    .line 367
    .line 368
    .line 369
    move-result v6

    .line 370
    if-eqz v6, :cond_12

    .line 371
    .line 372
    invoke-interface {v10, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    check-cast v2, La/ae90;

    .line 377
    .line 378
    const v6, -0x3e6684fe

    .line 379
    .line 380
    .line 381
    invoke-virtual {v5, v6}, La/fet;->e0(I)V

    .line 382
    .line 383
    .line 384
    invoke-static {v8, v15, v14, v12}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 385
    .line 386
    .line 387
    move-result-object v6

    .line 388
    const/16 v8, 0x64

    .line 389
    .line 390
    invoke-static {v8, v15, v14, v12}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 391
    .line 392
    .line 393
    move-result-object v8

    .line 394
    const/high16 v10, 0x43480000    # 200.0f

    .line 395
    .line 396
    const/high16 v11, 0x3f000000    # 0.5f

    .line 397
    .line 398
    invoke-static {v11, v10, v14, v12}, La/ro4;->g0(FFLjava/lang/Object;I)La/nul0;

    .line 399
    .line 400
    .line 401
    move-result-object v10

    .line 402
    invoke-virtual {v1, v9, v6, v10, v8}, La/g9z;->a(La/mm40;La/cfq;La/cfq;La/cfq;)La/mm40;

    .line 403
    .line 404
    .line 405
    move-result-object v1

    .line 406
    sget-object v6, La/gqw0;->n:La/xx7;

    .line 407
    .line 408
    sget-object v8, La/qmk;->a:La/zcl;

    .line 409
    .line 410
    new-instance v8, La/qw3;

    .line 411
    .line 412
    new-instance v9, La/jf4;

    .line 413
    .line 414
    const/16 v10, 0xe

    .line 415
    .line 416
    invoke-direct {v9, v10}, La/jf4;-><init>(B)V

    .line 417
    .line 418
    .line 419
    const/high16 v10, 0x41000000    # 8.0f

    .line 420
    .line 421
    const/4 v11, 0x1

    .line 422
    invoke-direct {v8, v10, v11, v9}, La/qw3;-><init>(FZLa/rw3;)V

    .line 423
    .line 424
    .line 425
    const/16 v9, 0x30

    .line 426
    .line 427
    invoke-static {v8, v6, v5, v9}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 428
    .line 429
    .line 430
    move-result-object v6

    .line 431
    iget-wide v8, v5, La/fet;->T:J

    .line 432
    .line 433
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 434
    .line 435
    .line 436
    move-result v8

    .line 437
    invoke-virtual {v5}, La/fet;->m()La/bh90;

    .line 438
    .line 439
    .line 440
    move-result-object v9

    .line 441
    invoke-static {v5, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 442
    .line 443
    .line 444
    move-result-object v1

    .line 445
    sget-object v10, La/mkd;->c0:La/gqw0;

    .line 446
    .line 447
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v5}, La/fet;->i0()V

    .line 451
    .line 452
    .line 453
    iget-boolean v10, v5, La/fet;->S:Z

    .line 454
    .line 455
    if-eqz v10, :cond_d

    .line 456
    .line 457
    invoke-virtual {v5, v4}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 458
    .line 459
    .line 460
    goto :goto_e

    .line 461
    :cond_d
    invoke-virtual {v5}, La/fet;->r0()V

    .line 462
    .line 463
    .line 464
    :goto_e
    sget-object v4, La/gqw0;->x:La/shd;

    .line 465
    .line 466
    invoke-static {v5, v6, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 467
    .line 468
    .line 469
    sget-object v4, La/gqw0;->w:La/shd;

    .line 470
    .line 471
    invoke-static {v5, v9, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 472
    .line 473
    .line 474
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 475
    .line 476
    .line 477
    move-result-object v4

    .line 478
    sget-object v6, La/gqw0;->y:La/shd;

    .line 479
    .line 480
    invoke-static {v5, v4, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 481
    .line 482
    .line 483
    invoke-static {v5}, La/jpm0;->n(La/fet;)V

    .line 484
    .line 485
    .line 486
    sget-object v4, La/gqw0;->v:La/shd;

    .line 487
    .line 488
    invoke-static {v5, v1, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 489
    .line 490
    .line 491
    if-eqz v2, :cond_10

    .line 492
    .line 493
    instance-of v1, v2, La/ud90;

    .line 494
    .line 495
    if-eqz v1, :cond_f

    .line 496
    .line 497
    const v1, 0x461c377c

    .line 498
    .line 499
    .line 500
    invoke-virtual {v5, v1}, La/fet;->e0(I)V

    .line 501
    .line 502
    .line 503
    if-nez v0, :cond_e

    .line 504
    .line 505
    const v0, 0x461caaa4

    .line 506
    .line 507
    .line 508
    invoke-virtual {v5, v0}, La/fet;->e0(I)V

    .line 509
    .line 510
    .line 511
    const/4 v1, 0x0

    .line 512
    :goto_f
    invoke-virtual {v5, v1}, La/fet;->r(Z)V

    .line 513
    .line 514
    .line 515
    goto :goto_10

    .line 516
    :cond_e
    const/4 v1, 0x0

    .line 517
    const v2, 0x7e21f4fd

    .line 518
    .line 519
    .line 520
    invoke-virtual {v5, v2}, La/fet;->e0(I)V

    .line 521
    .line 522
    .line 523
    invoke-interface {v0, v14, v5, v7}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    goto :goto_f

    .line 527
    :goto_10
    invoke-virtual {v3, v14, v14, v5, v7}, La/ugd;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v5, v1}, La/fet;->r(Z)V

    .line 531
    .line 532
    .line 533
    :goto_11
    const/4 v11, 0x1

    .line 534
    goto :goto_12

    .line 535
    :cond_f
    const/4 v1, 0x0

    .line 536
    instance-of v0, v2, La/vd90;

    .line 537
    .line 538
    if-eqz v0, :cond_11

    .line 539
    .line 540
    const v0, 0x7e220cb9

    .line 541
    .line 542
    .line 543
    invoke-virtual {v5, v0}, La/fet;->e0(I)V

    .line 544
    .line 545
    .line 546
    check-cast v2, La/vd90;

    .line 547
    .line 548
    iget-object v0, v2, La/vd90;->a:La/j83;

    .line 549
    .line 550
    iget-object v2, v2, La/vd90;->b:La/j83;

    .line 551
    .line 552
    invoke-virtual {v3, v0, v2, v5, v7}, La/ugd;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v5, v1}, La/fet;->r(Z)V

    .line 556
    .line 557
    .line 558
    goto :goto_11

    .line 559
    :goto_12
    invoke-virtual {v5, v11}, La/fet;->r(Z)V

    .line 560
    .line 561
    .line 562
    invoke-virtual {v5, v1}, La/fet;->r(Z)V

    .line 563
    .line 564
    .line 565
    goto :goto_13

    .line 566
    :cond_10
    const/4 v1, 0x0

    .line 567
    :cond_11
    const v0, 0x7e21e950

    .line 568
    .line 569
    .line 570
    invoke-static {v0, v5, v1}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    throw v0

    .line 575
    :cond_12
    invoke-virtual {v5}, La/fet;->X()V

    .line 576
    .line 577
    .line 578
    :goto_13
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 579
    .line 580
    return-object v0

    .line 581
    :pswitch_1
    move-object/from16 v1, p1

    .line 582
    .line 583
    check-cast v1, La/g9z;

    .line 584
    .line 585
    move-object/from16 v2, p2

    .line 586
    .line 587
    check-cast v2, Ljava/lang/Number;

    .line 588
    .line 589
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 590
    .line 591
    .line 592
    move-result v2

    .line 593
    move-object/from16 v5, p3

    .line 594
    .line 595
    check-cast v5, La/fet;

    .line 596
    .line 597
    move-object/from16 v6, p4

    .line 598
    .line 599
    check-cast v6, Ljava/lang/Number;

    .line 600
    .line 601
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 602
    .line 603
    .line 604
    move-result v6

    .line 605
    const/16 v18, 0x0

    .line 606
    .line 607
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 608
    .line 609
    .line 610
    move-result-object v7

    .line 611
    and-int/lit8 v13, v6, 0x6

    .line 612
    .line 613
    if-nez v13, :cond_14

    .line 614
    .line 615
    invoke-virtual {v5, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 616
    .line 617
    .line 618
    move-result v13

    .line 619
    if-eqz v13, :cond_13

    .line 620
    .line 621
    move/from16 v17, v12

    .line 622
    .line 623
    goto :goto_14

    .line 624
    :cond_13
    const/16 v17, 0x2

    .line 625
    .line 626
    :goto_14
    or-int v13, v6, v17

    .line 627
    .line 628
    :goto_15
    const/16 v19, 0x30

    .line 629
    .line 630
    goto :goto_16

    .line 631
    :cond_14
    move v13, v6

    .line 632
    goto :goto_15

    .line 633
    :goto_16
    and-int/lit8 v6, v6, 0x30

    .line 634
    .line 635
    if-nez v6, :cond_16

    .line 636
    .line 637
    invoke-virtual {v5, v2}, La/fet;->e(I)Z

    .line 638
    .line 639
    .line 640
    move-result v6

    .line 641
    if-eqz v6, :cond_15

    .line 642
    .line 643
    const/16 v16, 0x20

    .line 644
    .line 645
    goto :goto_17

    .line 646
    :cond_15
    const/16 v16, 0x10

    .line 647
    .line 648
    :goto_17
    or-int v13, v13, v16

    .line 649
    .line 650
    :cond_16
    and-int/lit16 v6, v13, 0x93

    .line 651
    .line 652
    if-eq v6, v11, :cond_17

    .line 653
    .line 654
    const/4 v6, 0x1

    .line 655
    :goto_18
    const/16 v21, 0x1

    .line 656
    .line 657
    goto :goto_19

    .line 658
    :cond_17
    const/4 v6, 0x0

    .line 659
    goto :goto_18

    .line 660
    :goto_19
    and-int/lit8 v11, v13, 0x1

    .line 661
    .line 662
    invoke-virtual {v5, v11, v6}, La/fet;->U(IZ)Z

    .line 663
    .line 664
    .line 665
    move-result v6

    .line 666
    if-eqz v6, :cond_1a

    .line 667
    .line 668
    invoke-interface {v10, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    move-result-object v2

    .line 672
    check-cast v2, La/wd90;

    .line 673
    .line 674
    const v6, -0x56339bdc

    .line 675
    .line 676
    .line 677
    invoke-virtual {v5, v6}, La/fet;->e0(I)V

    .line 678
    .line 679
    .line 680
    invoke-static {v8, v15, v14, v12}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 681
    .line 682
    .line 683
    move-result-object v6

    .line 684
    const/16 v8, 0x64

    .line 685
    .line 686
    invoke-static {v8, v15, v14, v12}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 687
    .line 688
    .line 689
    move-result-object v8

    .line 690
    const/high16 v10, 0x43480000    # 200.0f

    .line 691
    .line 692
    const/high16 v11, 0x3f000000    # 0.5f

    .line 693
    .line 694
    invoke-static {v11, v10, v14, v12}, La/ro4;->g0(FFLjava/lang/Object;I)La/nul0;

    .line 695
    .line 696
    .line 697
    move-result-object v10

    .line 698
    invoke-virtual {v1, v9, v6, v10, v8}, La/g9z;->a(La/mm40;La/cfq;La/cfq;La/cfq;)La/mm40;

    .line 699
    .line 700
    .line 701
    move-result-object v1

    .line 702
    sget-object v6, La/gqw0;->n:La/xx7;

    .line 703
    .line 704
    sget-object v8, La/uc9;->c:La/mw3;

    .line 705
    .line 706
    const/16 v9, 0x30

    .line 707
    .line 708
    invoke-static {v8, v6, v5, v9}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 709
    .line 710
    .line 711
    move-result-object v6

    .line 712
    iget-wide v8, v5, La/fet;->T:J

    .line 713
    .line 714
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 715
    .line 716
    .line 717
    move-result v8

    .line 718
    invoke-virtual {v5}, La/fet;->m()La/bh90;

    .line 719
    .line 720
    .line 721
    move-result-object v9

    .line 722
    invoke-static {v5, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 723
    .line 724
    .line 725
    move-result-object v1

    .line 726
    sget-object v10, La/mkd;->c0:La/gqw0;

    .line 727
    .line 728
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 729
    .line 730
    .line 731
    invoke-virtual {v5}, La/fet;->i0()V

    .line 732
    .line 733
    .line 734
    iget-boolean v10, v5, La/fet;->S:Z

    .line 735
    .line 736
    if-eqz v10, :cond_18

    .line 737
    .line 738
    invoke-virtual {v5, v4}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 739
    .line 740
    .line 741
    goto :goto_1a

    .line 742
    :cond_18
    invoke-virtual {v5}, La/fet;->r0()V

    .line 743
    .line 744
    .line 745
    :goto_1a
    sget-object v4, La/gqw0;->x:La/shd;

    .line 746
    .line 747
    invoke-static {v5, v6, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 748
    .line 749
    .line 750
    sget-object v4, La/gqw0;->w:La/shd;

    .line 751
    .line 752
    invoke-static {v5, v9, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 753
    .line 754
    .line 755
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 756
    .line 757
    .line 758
    move-result-object v4

    .line 759
    sget-object v6, La/gqw0;->y:La/shd;

    .line 760
    .line 761
    invoke-static {v5, v4, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 762
    .line 763
    .line 764
    invoke-static {v5}, La/jpm0;->n(La/fet;)V

    .line 765
    .line 766
    .line 767
    sget-object v4, La/gqw0;->v:La/shd;

    .line 768
    .line 769
    invoke-static {v5, v1, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 770
    .line 771
    .line 772
    if-nez v0, :cond_19

    .line 773
    .line 774
    const v0, 0x2494fd45

    .line 775
    .line 776
    .line 777
    invoke-virtual {v5, v0}, La/fet;->e0(I)V

    .line 778
    .line 779
    .line 780
    const/4 v1, 0x0

    .line 781
    invoke-virtual {v5, v1}, La/fet;->r(Z)V

    .line 782
    .line 783
    .line 784
    goto :goto_1b

    .line 785
    :cond_19
    const/4 v1, 0x0

    .line 786
    const v4, 0x2494fd46

    .line 787
    .line 788
    .line 789
    invoke-virtual {v5, v4}, La/fet;->e0(I)V

    .line 790
    .line 791
    .line 792
    iget-object v4, v2, La/wd90;->c:Ljava/lang/String;

    .line 793
    .line 794
    invoke-interface {v0, v4, v5, v7}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    invoke-virtual {v5, v1}, La/fet;->r(Z)V

    .line 798
    .line 799
    .line 800
    :goto_1b
    iget-object v0, v2, La/wd90;->a:La/j83;

    .line 801
    .line 802
    iget-object v2, v2, La/wd90;->b:La/j83;

    .line 803
    .line 804
    invoke-virtual {v3, v0, v2, v5, v7}, La/ugd;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 805
    .line 806
    .line 807
    const/4 v11, 0x1

    .line 808
    invoke-virtual {v5, v11}, La/fet;->r(Z)V

    .line 809
    .line 810
    .line 811
    invoke-virtual {v5, v1}, La/fet;->r(Z)V

    .line 812
    .line 813
    .line 814
    goto :goto_1c

    .line 815
    :cond_1a
    invoke-virtual {v5}, La/fet;->X()V

    .line 816
    .line 817
    .line 818
    :goto_1c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 819
    .line 820
    return-object v0

    .line 821
    :pswitch_2
    move-object/from16 v1, p1

    .line 822
    .line 823
    check-cast v1, La/g9z;

    .line 824
    .line 825
    move-object/from16 v2, p2

    .line 826
    .line 827
    check-cast v2, Ljava/lang/Number;

    .line 828
    .line 829
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 830
    .line 831
    .line 832
    move-result v2

    .line 833
    move-object/from16 v5, p3

    .line 834
    .line 835
    check-cast v5, La/fet;

    .line 836
    .line 837
    move-object/from16 v6, p4

    .line 838
    .line 839
    check-cast v6, Ljava/lang/Number;

    .line 840
    .line 841
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 842
    .line 843
    .line 844
    move-result v6

    .line 845
    const/16 v18, 0x0

    .line 846
    .line 847
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 848
    .line 849
    .line 850
    move-result-object v7

    .line 851
    and-int/lit8 v13, v6, 0x6

    .line 852
    .line 853
    if-nez v13, :cond_1c

    .line 854
    .line 855
    invoke-virtual {v5, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 856
    .line 857
    .line 858
    move-result v13

    .line 859
    if-eqz v13, :cond_1b

    .line 860
    .line 861
    move/from16 v17, v12

    .line 862
    .line 863
    goto :goto_1d

    .line 864
    :cond_1b
    const/16 v17, 0x2

    .line 865
    .line 866
    :goto_1d
    or-int v13, v6, v17

    .line 867
    .line 868
    :goto_1e
    const/16 v19, 0x30

    .line 869
    .line 870
    goto :goto_1f

    .line 871
    :cond_1c
    move v13, v6

    .line 872
    goto :goto_1e

    .line 873
    :goto_1f
    and-int/lit8 v6, v6, 0x30

    .line 874
    .line 875
    if-nez v6, :cond_1e

    .line 876
    .line 877
    invoke-virtual {v5, v2}, La/fet;->e(I)Z

    .line 878
    .line 879
    .line 880
    move-result v6

    .line 881
    if-eqz v6, :cond_1d

    .line 882
    .line 883
    const/16 v16, 0x20

    .line 884
    .line 885
    goto :goto_20

    .line 886
    :cond_1d
    const/16 v16, 0x10

    .line 887
    .line 888
    :goto_20
    or-int v13, v13, v16

    .line 889
    .line 890
    :cond_1e
    and-int/lit16 v6, v13, 0x93

    .line 891
    .line 892
    if-eq v6, v11, :cond_1f

    .line 893
    .line 894
    const/4 v6, 0x1

    .line 895
    :goto_21
    const/16 v21, 0x1

    .line 896
    .line 897
    goto :goto_22

    .line 898
    :cond_1f
    const/4 v6, 0x0

    .line 899
    goto :goto_21

    .line 900
    :goto_22
    and-int/lit8 v11, v13, 0x1

    .line 901
    .line 902
    invoke-virtual {v5, v11, v6}, La/fet;->U(IZ)Z

    .line 903
    .line 904
    .line 905
    move-result v6

    .line 906
    if-eqz v6, :cond_22

    .line 907
    .line 908
    invoke-interface {v10, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 909
    .line 910
    .line 911
    move-result-object v2

    .line 912
    check-cast v2, La/yd90;

    .line 913
    .line 914
    const v6, -0x3edbc806

    .line 915
    .line 916
    .line 917
    invoke-virtual {v5, v6}, La/fet;->e0(I)V

    .line 918
    .line 919
    .line 920
    invoke-static {v8, v15, v14, v12}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 921
    .line 922
    .line 923
    move-result-object v6

    .line 924
    const/16 v8, 0x64

    .line 925
    .line 926
    invoke-static {v8, v15, v14, v12}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 927
    .line 928
    .line 929
    move-result-object v8

    .line 930
    const/high16 v10, 0x43480000    # 200.0f

    .line 931
    .line 932
    const/high16 v11, 0x3f000000    # 0.5f

    .line 933
    .line 934
    invoke-static {v11, v10, v14, v12}, La/ro4;->g0(FFLjava/lang/Object;I)La/nul0;

    .line 935
    .line 936
    .line 937
    move-result-object v10

    .line 938
    invoke-virtual {v1, v9, v6, v10, v8}, La/g9z;->a(La/mm40;La/cfq;La/cfq;La/cfq;)La/mm40;

    .line 939
    .line 940
    .line 941
    move-result-object v1

    .line 942
    sget-object v6, La/gqw0;->n:La/xx7;

    .line 943
    .line 944
    sget-object v8, La/qmk;->a:La/zcl;

    .line 945
    .line 946
    new-instance v8, La/qw3;

    .line 947
    .line 948
    new-instance v9, La/jf4;

    .line 949
    .line 950
    const/16 v10, 0xe

    .line 951
    .line 952
    invoke-direct {v9, v10}, La/jf4;-><init>(B)V

    .line 953
    .line 954
    .line 955
    const/high16 v10, 0x40800000    # 4.0f

    .line 956
    .line 957
    const/4 v11, 0x1

    .line 958
    invoke-direct {v8, v10, v11, v9}, La/qw3;-><init>(FZLa/rw3;)V

    .line 959
    .line 960
    .line 961
    const/16 v9, 0x30

    .line 962
    .line 963
    invoke-static {v8, v6, v5, v9}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 964
    .line 965
    .line 966
    move-result-object v6

    .line 967
    iget-wide v8, v5, La/fet;->T:J

    .line 968
    .line 969
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 970
    .line 971
    .line 972
    move-result v8

    .line 973
    invoke-virtual {v5}, La/fet;->m()La/bh90;

    .line 974
    .line 975
    .line 976
    move-result-object v9

    .line 977
    invoke-static {v5, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 978
    .line 979
    .line 980
    move-result-object v1

    .line 981
    sget-object v10, La/mkd;->c0:La/gqw0;

    .line 982
    .line 983
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 984
    .line 985
    .line 986
    invoke-virtual {v5}, La/fet;->i0()V

    .line 987
    .line 988
    .line 989
    iget-boolean v10, v5, La/fet;->S:Z

    .line 990
    .line 991
    if-eqz v10, :cond_20

    .line 992
    .line 993
    invoke-virtual {v5, v4}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 994
    .line 995
    .line 996
    goto :goto_23

    .line 997
    :cond_20
    invoke-virtual {v5}, La/fet;->r0()V

    .line 998
    .line 999
    .line 1000
    :goto_23
    sget-object v4, La/gqw0;->x:La/shd;

    .line 1001
    .line 1002
    invoke-static {v5, v6, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1003
    .line 1004
    .line 1005
    sget-object v4, La/gqw0;->w:La/shd;

    .line 1006
    .line 1007
    invoke-static {v5, v9, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1008
    .line 1009
    .line 1010
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v4

    .line 1014
    sget-object v6, La/gqw0;->y:La/shd;

    .line 1015
    .line 1016
    invoke-static {v5, v4, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1017
    .line 1018
    .line 1019
    invoke-static {v5}, La/jpm0;->n(La/fet;)V

    .line 1020
    .line 1021
    .line 1022
    sget-object v4, La/gqw0;->v:La/shd;

    .line 1023
    .line 1024
    invoke-static {v5, v1, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1025
    .line 1026
    .line 1027
    if-nez v0, :cond_21

    .line 1028
    .line 1029
    const v0, 0x7dfb171e

    .line 1030
    .line 1031
    .line 1032
    invoke-virtual {v5, v0}, La/fet;->e0(I)V

    .line 1033
    .line 1034
    .line 1035
    const/4 v1, 0x0

    .line 1036
    :goto_24
    invoke-virtual {v5, v1}, La/fet;->r(Z)V

    .line 1037
    .line 1038
    .line 1039
    goto :goto_25

    .line 1040
    :cond_21
    const/4 v1, 0x0

    .line 1041
    const v4, 0x5ee71143

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual {v5, v4}, La/fet;->e0(I)V

    .line 1045
    .line 1046
    .line 1047
    iget-object v4, v2, La/yd90;->c:Ljava/lang/String;

    .line 1048
    .line 1049
    invoke-interface {v0, v4, v5, v7}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1050
    .line 1051
    .line 1052
    goto :goto_24

    .line 1053
    :goto_25
    iget-object v0, v2, La/yd90;->a:La/j83;

    .line 1054
    .line 1055
    iget-object v2, v2, La/yd90;->b:La/j83;

    .line 1056
    .line 1057
    invoke-virtual {v3, v0, v2, v5, v7}, La/ugd;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1058
    .line 1059
    .line 1060
    const/4 v11, 0x1

    .line 1061
    invoke-virtual {v5, v11}, La/fet;->r(Z)V

    .line 1062
    .line 1063
    .line 1064
    invoke-virtual {v5, v1}, La/fet;->r(Z)V

    .line 1065
    .line 1066
    .line 1067
    goto :goto_26

    .line 1068
    :cond_22
    invoke-virtual {v5}, La/fet;->X()V

    .line 1069
    .line 1070
    .line 1071
    :goto_26
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1072
    .line 1073
    return-object v0

    .line 1074
    :pswitch_3
    move-object/from16 v1, p1

    .line 1075
    .line 1076
    check-cast v1, La/g9z;

    .line 1077
    .line 1078
    move-object/from16 v2, p2

    .line 1079
    .line 1080
    check-cast v2, Ljava/lang/Number;

    .line 1081
    .line 1082
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 1083
    .line 1084
    .line 1085
    move-result v2

    .line 1086
    move-object/from16 v5, p3

    .line 1087
    .line 1088
    check-cast v5, La/fet;

    .line 1089
    .line 1090
    move-object/from16 v6, p4

    .line 1091
    .line 1092
    check-cast v6, Ljava/lang/Number;

    .line 1093
    .line 1094
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 1095
    .line 1096
    .line 1097
    move-result v6

    .line 1098
    const/16 v18, 0x0

    .line 1099
    .line 1100
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v7

    .line 1104
    and-int/lit8 v13, v6, 0x6

    .line 1105
    .line 1106
    if-nez v13, :cond_24

    .line 1107
    .line 1108
    invoke-virtual {v5, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1109
    .line 1110
    .line 1111
    move-result v13

    .line 1112
    if-eqz v13, :cond_23

    .line 1113
    .line 1114
    move/from16 v17, v12

    .line 1115
    .line 1116
    goto :goto_27

    .line 1117
    :cond_23
    const/16 v17, 0x2

    .line 1118
    .line 1119
    :goto_27
    or-int v13, v6, v17

    .line 1120
    .line 1121
    :goto_28
    const/16 v19, 0x30

    .line 1122
    .line 1123
    goto :goto_29

    .line 1124
    :cond_24
    move v13, v6

    .line 1125
    goto :goto_28

    .line 1126
    :goto_29
    and-int/lit8 v6, v6, 0x30

    .line 1127
    .line 1128
    if-nez v6, :cond_26

    .line 1129
    .line 1130
    invoke-virtual {v5, v2}, La/fet;->e(I)Z

    .line 1131
    .line 1132
    .line 1133
    move-result v6

    .line 1134
    if-eqz v6, :cond_25

    .line 1135
    .line 1136
    const/16 v16, 0x20

    .line 1137
    .line 1138
    goto :goto_2a

    .line 1139
    :cond_25
    const/16 v16, 0x10

    .line 1140
    .line 1141
    :goto_2a
    or-int v13, v13, v16

    .line 1142
    .line 1143
    :cond_26
    and-int/lit16 v6, v13, 0x93

    .line 1144
    .line 1145
    if-eq v6, v11, :cond_27

    .line 1146
    .line 1147
    const/4 v6, 0x1

    .line 1148
    :goto_2b
    const/16 v21, 0x1

    .line 1149
    .line 1150
    goto :goto_2c

    .line 1151
    :cond_27
    const/4 v6, 0x0

    .line 1152
    goto :goto_2b

    .line 1153
    :goto_2c
    and-int/lit8 v11, v13, 0x1

    .line 1154
    .line 1155
    invoke-virtual {v5, v11, v6}, La/fet;->U(IZ)Z

    .line 1156
    .line 1157
    .line 1158
    move-result v6

    .line 1159
    if-eqz v6, :cond_2a

    .line 1160
    .line 1161
    invoke-interface {v10, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v2

    .line 1165
    check-cast v2, La/xd90;

    .line 1166
    .line 1167
    const v6, -0x64cda03e

    .line 1168
    .line 1169
    .line 1170
    invoke-virtual {v5, v6}, La/fet;->e0(I)V

    .line 1171
    .line 1172
    .line 1173
    invoke-static {v8, v15, v14, v12}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v6

    .line 1177
    const/16 v8, 0x64

    .line 1178
    .line 1179
    invoke-static {v8, v15, v14, v12}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v8

    .line 1183
    const/high16 v10, 0x43480000    # 200.0f

    .line 1184
    .line 1185
    const/high16 v11, 0x3f000000    # 0.5f

    .line 1186
    .line 1187
    invoke-static {v11, v10, v14, v12}, La/ro4;->g0(FFLjava/lang/Object;I)La/nul0;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v10

    .line 1191
    invoke-virtual {v1, v9, v6, v10, v8}, La/g9z;->a(La/mm40;La/cfq;La/cfq;La/cfq;)La/mm40;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v1

    .line 1195
    sget-object v6, La/gqw0;->n:La/xx7;

    .line 1196
    .line 1197
    sget-object v8, La/qmk;->a:La/zcl;

    .line 1198
    .line 1199
    new-instance v8, La/qw3;

    .line 1200
    .line 1201
    new-instance v9, La/jf4;

    .line 1202
    .line 1203
    const/16 v10, 0xe

    .line 1204
    .line 1205
    invoke-direct {v9, v10}, La/jf4;-><init>(B)V

    .line 1206
    .line 1207
    .line 1208
    const/high16 v10, 0x40800000    # 4.0f

    .line 1209
    .line 1210
    const/4 v11, 0x1

    .line 1211
    invoke-direct {v8, v10, v11, v9}, La/qw3;-><init>(FZLa/rw3;)V

    .line 1212
    .line 1213
    .line 1214
    const/16 v9, 0x30

    .line 1215
    .line 1216
    invoke-static {v8, v6, v5, v9}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v6

    .line 1220
    iget-wide v8, v5, La/fet;->T:J

    .line 1221
    .line 1222
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 1223
    .line 1224
    .line 1225
    move-result v8

    .line 1226
    invoke-virtual {v5}, La/fet;->m()La/bh90;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v9

    .line 1230
    invoke-static {v5, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v1

    .line 1234
    sget-object v10, La/mkd;->c0:La/gqw0;

    .line 1235
    .line 1236
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1237
    .line 1238
    .line 1239
    invoke-virtual {v5}, La/fet;->i0()V

    .line 1240
    .line 1241
    .line 1242
    iget-boolean v10, v5, La/fet;->S:Z

    .line 1243
    .line 1244
    if-eqz v10, :cond_28

    .line 1245
    .line 1246
    invoke-virtual {v5, v4}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 1247
    .line 1248
    .line 1249
    goto :goto_2d

    .line 1250
    :cond_28
    invoke-virtual {v5}, La/fet;->r0()V

    .line 1251
    .line 1252
    .line 1253
    :goto_2d
    sget-object v4, La/gqw0;->x:La/shd;

    .line 1254
    .line 1255
    invoke-static {v5, v6, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1256
    .line 1257
    .line 1258
    sget-object v4, La/gqw0;->w:La/shd;

    .line 1259
    .line 1260
    invoke-static {v5, v9, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1261
    .line 1262
    .line 1263
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v4

    .line 1267
    sget-object v6, La/gqw0;->y:La/shd;

    .line 1268
    .line 1269
    invoke-static {v5, v4, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1270
    .line 1271
    .line 1272
    invoke-static {v5}, La/jpm0;->n(La/fet;)V

    .line 1273
    .line 1274
    .line 1275
    sget-object v4, La/gqw0;->v:La/shd;

    .line 1276
    .line 1277
    invoke-static {v5, v1, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1278
    .line 1279
    .line 1280
    if-nez v0, :cond_29

    .line 1281
    .line 1282
    const v0, -0x3fcfc2fe

    .line 1283
    .line 1284
    .line 1285
    invoke-virtual {v5, v0}, La/fet;->e0(I)V

    .line 1286
    .line 1287
    .line 1288
    const/4 v1, 0x0

    .line 1289
    :goto_2e
    invoke-virtual {v5, v1}, La/fet;->r(Z)V

    .line 1290
    .line 1291
    .line 1292
    goto :goto_2f

    .line 1293
    :cond_29
    const/4 v1, 0x0

    .line 1294
    const v4, 0x48439edf

    .line 1295
    .line 1296
    .line 1297
    invoke-virtual {v5, v4}, La/fet;->e0(I)V

    .line 1298
    .line 1299
    .line 1300
    iget-object v4, v2, La/xd90;->c:Ljava/lang/String;

    .line 1301
    .line 1302
    invoke-interface {v0, v4, v5, v7}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1303
    .line 1304
    .line 1305
    goto :goto_2e

    .line 1306
    :goto_2f
    iget-object v0, v2, La/xd90;->a:La/j83;

    .line 1307
    .line 1308
    iget-object v2, v2, La/xd90;->b:La/j83;

    .line 1309
    .line 1310
    invoke-virtual {v3, v0, v2, v5, v7}, La/ugd;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1311
    .line 1312
    .line 1313
    const/4 v11, 0x1

    .line 1314
    invoke-virtual {v5, v11}, La/fet;->r(Z)V

    .line 1315
    .line 1316
    .line 1317
    invoke-virtual {v5, v1}, La/fet;->r(Z)V

    .line 1318
    .line 1319
    .line 1320
    goto :goto_30

    .line 1321
    :cond_2a
    invoke-virtual {v5}, La/fet;->X()V

    .line 1322
    .line 1323
    .line 1324
    :goto_30
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1325
    .line 1326
    return-object v0

    .line 1327
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
