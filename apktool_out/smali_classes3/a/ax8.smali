.class public final synthetic La/ax8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/d9z;

.field public final synthetic d:Z

.field public final synthetic e:La/fy8;


# direct methods
.method public synthetic constructor <init>(La/dy8;Lkotlin/jvm/functions/Function1;La/d9z;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/ax8;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ax8;->e:La/fy8;

    iput-object p2, p0, La/ax8;->b:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, La/ax8;->c:La/d9z;

    iput-boolean p4, p0, La/ax8;->d:Z

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/cy8;La/d9z;Z)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/ax8;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ax8;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/ax8;->e:La/fy8;

    iput-object p3, p0, La/ax8;->c:La/d9z;

    iput-boolean p4, p0, La/ax8;->d:Z

    return-void
.end method


# virtual methods
.method public final O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ax8;->a:B

    .line 4
    .line 5
    sget-object v2, La/e7z;->u1:La/pcy;

    .line 6
    .line 7
    sget-object v3, La/jm40;->b:La/jm40;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    sget-object v6, La/ukd;->a:La/cl5;

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    iget-object v8, v0, La/ax8;->e:La/fy8;

    .line 15
    .line 16
    const/high16 v9, 0x3f800000    # 1.0f

    .line 17
    .line 18
    const/4 v11, 0x2

    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    check-cast v8, La/dy8;

    .line 23
    .line 24
    iget-object v1, v8, La/dy8;->g:La/hyl;

    .line 25
    .line 26
    move-object/from16 v12, p1

    .line 27
    .line 28
    check-cast v12, La/hh80;

    .line 29
    .line 30
    move-object/from16 v13, p2

    .line 31
    .line 32
    check-cast v13, La/l7m0;

    .line 33
    .line 34
    move-object/from16 v14, p3

    .line 35
    .line 36
    check-cast v14, La/l7m0;

    .line 37
    .line 38
    move-object/from16 v15, p4

    .line 39
    .line 40
    check-cast v15, La/fet;

    .line 41
    .line 42
    move-object/from16 v16, p5

    .line 43
    .line 44
    check-cast v16, Ljava/lang/Integer;

    .line 45
    .line 46
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result v10

    .line 50
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    and-int/lit16 v12, v10, 0x401

    .line 60
    .line 61
    const/16 v13, 0x400

    .line 62
    .line 63
    if-eq v12, v13, :cond_0

    .line 64
    .line 65
    move v12, v5

    .line 66
    goto :goto_0

    .line 67
    :cond_0
    move v12, v4

    .line 68
    :goto_0
    and-int/2addr v10, v5

    .line 69
    invoke-virtual {v15, v10, v12}, La/fet;->U(IZ)Z

    .line 70
    .line 71
    .line 72
    move-result v10

    .line 73
    if-eqz v10, :cond_1e

    .line 74
    .line 75
    sget-object v10, La/o7k0;->c:La/n0q;

    .line 76
    .line 77
    sget-object v12, La/uc9;->c:La/mw3;

    .line 78
    .line 79
    sget-object v13, La/gqw0;->m:La/xx7;

    .line 80
    .line 81
    invoke-static {v12, v13, v15, v4}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 82
    .line 83
    .line 84
    move-result-object v12

    .line 85
    iget-wide v13, v15, La/fet;->T:J

    .line 86
    .line 87
    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    .line 88
    .line 89
    .line 90
    move-result v13

    .line 91
    invoke-virtual {v15}, La/fet;->m()La/bh90;

    .line 92
    .line 93
    .line 94
    move-result-object v14

    .line 95
    invoke-static {v15, v10}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 96
    .line 97
    .line 98
    move-result-object v10

    .line 99
    sget-object v16, La/mkd;->c0:La/gqw0;

    .line 100
    .line 101
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v15}, La/fet;->i0()V

    .line 105
    .line 106
    .line 107
    iget-boolean v4, v15, La/fet;->S:Z

    .line 108
    .line 109
    if-eqz v4, :cond_1

    .line 110
    .line 111
    invoke-virtual {v15, v2}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_1
    invoke-virtual {v15}, La/fet;->r0()V

    .line 116
    .line 117
    .line 118
    :goto_1
    sget-object v2, La/gqw0;->x:La/shd;

    .line 119
    .line 120
    invoke-static {v15, v12, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 121
    .line 122
    .line 123
    sget-object v2, La/gqw0;->w:La/shd;

    .line 124
    .line 125
    invoke-static {v15, v14, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 126
    .line 127
    .line 128
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    sget-object v4, La/gqw0;->y:La/shd;

    .line 133
    .line 134
    invoke-static {v15, v2, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 135
    .line 136
    .line 137
    invoke-static {v15}, La/jpm0;->n(La/fet;)V

    .line 138
    .line 139
    .line 140
    sget-object v2, La/gqw0;->v:La/shd;

    .line 141
    .line 142
    invoke-static {v15, v10, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 143
    .line 144
    .line 145
    iget-object v2, v8, La/dy8;->e:La/av8;

    .line 146
    .line 147
    instance-of v4, v2, La/zu8;

    .line 148
    .line 149
    iget-object v8, v0, La/ax8;->b:Lkotlin/jvm/functions/Function1;

    .line 150
    .line 151
    const/high16 v10, 0x41000000    # 8.0f

    .line 152
    .line 153
    if-nez v4, :cond_e

    .line 154
    .line 155
    instance-of v4, v1, La/fyl;

    .line 156
    .line 157
    if-eqz v4, :cond_2

    .line 158
    .line 159
    move-object v4, v1

    .line 160
    check-cast v4, La/fyl;

    .line 161
    .line 162
    iget-object v4, v4, La/fyl;->a:La/a4x;

    .line 163
    .line 164
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    if-eqz v4, :cond_3

    .line 169
    .line 170
    :cond_2
    instance-of v4, v1, La/gyl;

    .line 171
    .line 172
    if-eqz v4, :cond_e

    .line 173
    .line 174
    :cond_3
    const v4, 0x738e84ae

    .line 175
    .line 176
    .line 177
    invoke-virtual {v15, v4}, La/fet;->e0(I)V

    .line 178
    .line 179
    .line 180
    sget-object v4, La/qmk;->a:La/zcl;

    .line 181
    .line 182
    invoke-static {v15}, La/qmk;->a(La/fet;)La/wfn;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    iget v4, v4, La/wfn;->e:F

    .line 187
    .line 188
    invoke-virtual {v15, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v12

    .line 192
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v13

    .line 196
    if-nez v12, :cond_4

    .line 197
    .line 198
    if-ne v13, v6, :cond_6

    .line 199
    .line 200
    :cond_4
    if-eqz v1, :cond_d

    .line 201
    .line 202
    instance-of v12, v1, La/fyl;

    .line 203
    .line 204
    if-eqz v12, :cond_5

    .line 205
    .line 206
    invoke-static {v4, v7, v11}, La/s5x0;->t(FFI)La/lh80;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    move-object v13, v4

    .line 211
    goto :goto_2

    .line 212
    :cond_5
    instance-of v11, v1, La/gyl;

    .line 213
    .line 214
    if-eqz v11, :cond_d

    .line 215
    .line 216
    new-instance v11, La/lh80;

    .line 217
    .line 218
    invoke-direct {v11, v4, v10, v4, v10}, La/lh80;-><init>(FFFF)V

    .line 219
    .line 220
    .line 221
    move-object v13, v11

    .line 222
    :goto_2
    invoke-virtual {v15, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    :cond_6
    check-cast v13, La/hh80;

    .line 226
    .line 227
    invoke-virtual {v15, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v4

    .line 231
    invoke-virtual {v15, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v11

    .line 235
    or-int/2addr v4, v11

    .line 236
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v11

    .line 240
    if-nez v4, :cond_7

    .line 241
    .line 242
    if-ne v11, v6, :cond_9

    .line 243
    .line 244
    :cond_7
    if-eqz v1, :cond_c

    .line 245
    .line 246
    instance-of v4, v1, La/fyl;

    .line 247
    .line 248
    if-eqz v4, :cond_8

    .line 249
    .line 250
    move-object v4, v1

    .line 251
    check-cast v4, La/fyl;

    .line 252
    .line 253
    invoke-static {v4, v13}, La/fyl;->a(La/fyl;La/hh80;)La/fyl;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    :goto_3
    move-object v11, v4

    .line 258
    goto :goto_4

    .line 259
    :cond_8
    instance-of v4, v1, La/gyl;

    .line 260
    .line 261
    if-eqz v4, :cond_c

    .line 262
    .line 263
    move-object v4, v1

    .line 264
    check-cast v4, La/gyl;

    .line 265
    .line 266
    invoke-static {v4, v13}, La/gyl;->a(La/gyl;La/hh80;)La/gyl;

    .line 267
    .line 268
    .line 269
    move-result-object v4

    .line 270
    goto :goto_3

    .line 271
    :goto_4
    invoke-virtual {v15, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    :cond_9
    move-object/from16 v16, v11

    .line 275
    .line 276
    check-cast v16, La/hyl;

    .line 277
    .line 278
    invoke-static {v3, v9}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    const/high16 v4, 0x40800000    # 4.0f

    .line 283
    .line 284
    invoke-static {v3, v7, v4, v5}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 285
    .line 286
    .line 287
    move-result-object v3

    .line 288
    invoke-virtual {v15, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v4

    .line 292
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v11

    .line 296
    if-nez v4, :cond_a

    .line 297
    .line 298
    if-ne v11, v6, :cond_b

    .line 299
    .line 300
    :cond_a
    new-instance v11, La/uo6;

    .line 301
    .line 302
    const/16 v4, 0x1b

    .line 303
    .line 304
    invoke-direct {v11, v8, v4}, La/uo6;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v15, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    :cond_b
    move-object/from16 v18, v11

    .line 311
    .line 312
    check-cast v18, Lkotlin/jvm/functions/Function1;

    .line 313
    .line 314
    const/16 v21, 0x0

    .line 315
    .line 316
    const/16 v22, 0x2c

    .line 317
    .line 318
    const/16 v17, 0x0

    .line 319
    .line 320
    const/16 v19, 0x0

    .line 321
    .line 322
    move-object/from16 v20, v15

    .line 323
    .line 324
    move-object v15, v3

    .line 325
    invoke-static/range {v15 .. v22}, La/ebc;->r(La/mm40;La/hyl;La/vxl;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 326
    .line 327
    .line 328
    move-object/from16 v3, v20

    .line 329
    .line 330
    const/4 v4, 0x0

    .line 331
    invoke-virtual {v3, v4}, La/fet;->r(Z)V

    .line 332
    .line 333
    .line 334
    goto :goto_6

    .line 335
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 336
    .line 337
    .line 338
    :goto_5
    const/4 v10, 0x0

    .line 339
    goto/16 :goto_c

    .line 340
    .line 341
    :cond_d
    invoke-static {}, La/t9f;->b()V

    .line 342
    .line 343
    .line 344
    goto :goto_5

    .line 345
    :cond_e
    move-object v3, v15

    .line 346
    const v4, 0x73a831c5

    .line 347
    .line 348
    .line 349
    invoke-virtual {v3, v4}, La/fet;->e0(I)V

    .line 350
    .line 351
    .line 352
    const/4 v4, 0x0

    .line 353
    invoke-virtual {v3, v4}, La/fet;->r(Z)V

    .line 354
    .line 355
    .line 356
    :goto_6
    if-eqz v2, :cond_1d

    .line 357
    .line 358
    instance-of v4, v2, La/xu8;

    .line 359
    .line 360
    iget-boolean v11, v0, La/ax8;->d:Z

    .line 361
    .line 362
    if-eqz v4, :cond_19

    .line 363
    .line 364
    const v4, 0x73aac59c

    .line 365
    .line 366
    .line 367
    invoke-static {v3, v4, v9, v5}, La/rz4;->f(La/fet;IFZ)La/x7z;

    .line 368
    .line 369
    .line 370
    move-result-object v15

    .line 371
    check-cast v2, La/xu8;

    .line 372
    .line 373
    iget-object v2, v2, La/xu8;->a:La/bml;

    .line 374
    .line 375
    const v4, -0x4868cfe

    .line 376
    .line 377
    .line 378
    invoke-virtual {v3, v4}, La/fet;->e0(I)V

    .line 379
    .line 380
    .line 381
    sget-object v4, La/qmk;->a:La/zcl;

    .line 382
    .line 383
    invoke-static {v3}, La/qmk;->a(La/fet;)La/wfn;

    .line 384
    .line 385
    .line 386
    move-result-object v4

    .line 387
    iget v4, v4, La/wfn;->c:F

    .line 388
    .line 389
    instance-of v9, v1, La/fyl;

    .line 390
    .line 391
    if-eqz v9, :cond_f

    .line 392
    .line 393
    move-object v9, v1

    .line 394
    check-cast v9, La/fyl;

    .line 395
    .line 396
    iget-object v9, v9, La/fyl;->a:La/a4x;

    .line 397
    .line 398
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 399
    .line 400
    .line 401
    move-result v9

    .line 402
    if-eqz v9, :cond_11

    .line 403
    .line 404
    :cond_f
    instance-of v1, v1, La/gyl;

    .line 405
    .line 406
    if-eqz v1, :cond_10

    .line 407
    .line 408
    goto :goto_7

    .line 409
    :cond_10
    move v7, v10

    .line 410
    :cond_11
    :goto_7
    invoke-static {v3}, La/qmk;->a(La/fet;)La/wfn;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    iget v1, v1, La/wfn;->c:F

    .line 415
    .line 416
    new-instance v9, La/lh80;

    .line 417
    .line 418
    const/high16 v10, 0x41c00000    # 24.0f

    .line 419
    .line 420
    invoke-direct {v9, v4, v7, v1, v10}, La/lh80;-><init>(FFFF)V

    .line 421
    .line 422
    .line 423
    if-eqz v11, :cond_12

    .line 424
    .line 425
    const v1, 0x5a48e817

    .line 426
    .line 427
    .line 428
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 429
    .line 430
    .line 431
    invoke-static {v9, v3}, La/knm0;->g(La/hh80;La/fet;)La/ch80;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    const/4 v4, 0x0

    .line 436
    invoke-virtual {v3, v4}, La/fet;->r(Z)V

    .line 437
    .line 438
    .line 439
    :goto_8
    move-object/from16 v18, v1

    .line 440
    .line 441
    goto :goto_9

    .line 442
    :cond_12
    const/4 v4, 0x0

    .line 443
    const v1, 0x5a4a7050

    .line 444
    .line 445
    .line 446
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 447
    .line 448
    .line 449
    invoke-static {v9, v3}, La/knm0;->f(La/hh80;La/fet;)La/ch80;

    .line 450
    .line 451
    .line 452
    move-result-object v1

    .line 453
    invoke-virtual {v3, v4}, La/fet;->r(Z)V

    .line 454
    .line 455
    .line 456
    goto :goto_8

    .line 457
    :goto_9
    invoke-virtual {v3, v4}, La/fet;->r(Z)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v3, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    move-result v1

    .line 464
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v4

    .line 468
    if-nez v1, :cond_13

    .line 469
    .line 470
    if-ne v4, v6, :cond_14

    .line 471
    .line 472
    :cond_13
    new-instance v4, La/tk8;

    .line 473
    .line 474
    const/16 v1, 0x18

    .line 475
    .line 476
    invoke-direct {v4, v8, v1}, La/tk8;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v3, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 480
    .line 481
    .line 482
    :cond_14
    move-object/from16 v19, v4

    .line 483
    .line 484
    check-cast v19, Lkotlin/jvm/functions/Function0;

    .line 485
    .line 486
    invoke-virtual {v3, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 487
    .line 488
    .line 489
    move-result v1

    .line 490
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v4

    .line 494
    if-nez v1, :cond_15

    .line 495
    .line 496
    if-ne v4, v6, :cond_16

    .line 497
    .line 498
    :cond_15
    new-instance v4, La/uo6;

    .line 499
    .line 500
    const/16 v1, 0x1c

    .line 501
    .line 502
    invoke-direct {v4, v8, v1}, La/uo6;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 503
    .line 504
    .line 505
    invoke-virtual {v3, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 506
    .line 507
    .line 508
    :cond_16
    move-object/from16 v21, v4

    .line 509
    .line 510
    check-cast v21, Lkotlin/jvm/functions/Function1;

    .line 511
    .line 512
    invoke-virtual {v3, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 513
    .line 514
    .line 515
    move-result v1

    .line 516
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v4

    .line 520
    if-nez v1, :cond_17

    .line 521
    .line 522
    if-ne v4, v6, :cond_18

    .line 523
    .line 524
    :cond_17
    new-instance v4, La/uo6;

    .line 525
    .line 526
    const/16 v1, 0x1d

    .line 527
    .line 528
    invoke-direct {v4, v8, v1}, La/uo6;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 529
    .line 530
    .line 531
    invoke-virtual {v3, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 532
    .line 533
    .line 534
    :cond_18
    move-object/from16 v22, v4

    .line 535
    .line 536
    check-cast v22, Lkotlin/jvm/functions/Function1;

    .line 537
    .line 538
    const/16 v24, 0x0

    .line 539
    .line 540
    const/16 v25, 0x20

    .line 541
    .line 542
    iget-object v0, v0, La/ax8;->c:La/d9z;

    .line 543
    .line 544
    const/16 v20, 0x0

    .line 545
    .line 546
    move-object/from16 v17, v0

    .line 547
    .line 548
    move-object/from16 v16, v2

    .line 549
    .line 550
    move-object/from16 v23, v3

    .line 551
    .line 552
    invoke-static/range {v15 .. v25}, La/ckb;->f(La/mm40;La/bml;La/d9z;La/hh80;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 553
    .line 554
    .line 555
    const/4 v4, 0x0

    .line 556
    invoke-virtual {v3, v4}, La/fet;->r(Z)V

    .line 557
    .line 558
    .line 559
    goto :goto_a

    .line 560
    :cond_19
    instance-of v0, v2, La/yu8;

    .line 561
    .line 562
    if-eqz v0, :cond_1a

    .line 563
    .line 564
    const v0, 0x73c29787

    .line 565
    .line 566
    .line 567
    invoke-static {v3, v0, v9, v5}, La/rz4;->f(La/fet;IFZ)La/x7z;

    .line 568
    .line 569
    .line 570
    move-result-object v15

    .line 571
    check-cast v2, La/yu8;

    .line 572
    .line 573
    iget-object v0, v2, La/yu8;->a:La/mdm;

    .line 574
    .line 575
    const/16 v20, 0x0

    .line 576
    .line 577
    const/16 v21, 0x8

    .line 578
    .line 579
    const/16 v18, 0x0

    .line 580
    .line 581
    move-object/from16 v16, v0

    .line 582
    .line 583
    move-object/from16 v19, v3

    .line 584
    .line 585
    move/from16 v17, v11

    .line 586
    .line 587
    invoke-static/range {v15 .. v21}, La/nnw0;->h(La/mm40;La/mdm;ZLkotlin/jvm/functions/Function0;La/fet;II)V

    .line 588
    .line 589
    .line 590
    const/4 v4, 0x0

    .line 591
    invoke-virtual {v3, v4}, La/fet;->r(Z)V

    .line 592
    .line 593
    .line 594
    goto :goto_a

    .line 595
    :cond_1a
    move/from16 v17, v11

    .line 596
    .line 597
    instance-of v0, v2, La/zu8;

    .line 598
    .line 599
    if-eqz v0, :cond_1d

    .line 600
    .line 601
    const v0, 0x73c8b1c2

    .line 602
    .line 603
    .line 604
    invoke-static {v3, v0, v9, v5}, La/rz4;->f(La/fet;IFZ)La/x7z;

    .line 605
    .line 606
    .line 607
    move-result-object v15

    .line 608
    check-cast v2, La/zu8;

    .line 609
    .line 610
    iget-object v0, v2, La/zu8;->a:La/mdm;

    .line 611
    .line 612
    invoke-virtual {v3, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 613
    .line 614
    .line 615
    move-result v1

    .line 616
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v2

    .line 620
    if-nez v1, :cond_1b

    .line 621
    .line 622
    if-ne v2, v6, :cond_1c

    .line 623
    .line 624
    :cond_1b
    new-instance v2, La/tk8;

    .line 625
    .line 626
    const/16 v1, 0x19

    .line 627
    .line 628
    invoke-direct {v2, v8, v1}, La/tk8;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 629
    .line 630
    .line 631
    invoke-virtual {v3, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 632
    .line 633
    .line 634
    :cond_1c
    move-object/from16 v18, v2

    .line 635
    .line 636
    check-cast v18, Lkotlin/jvm/functions/Function0;

    .line 637
    .line 638
    const/16 v20, 0x0

    .line 639
    .line 640
    const/16 v21, 0x0

    .line 641
    .line 642
    move-object/from16 v16, v0

    .line 643
    .line 644
    move-object/from16 v19, v3

    .line 645
    .line 646
    invoke-static/range {v15 .. v21}, La/nnw0;->h(La/mm40;La/mdm;ZLkotlin/jvm/functions/Function0;La/fet;II)V

    .line 647
    .line 648
    .line 649
    const/4 v4, 0x0

    .line 650
    invoke-virtual {v3, v4}, La/fet;->r(Z)V

    .line 651
    .line 652
    .line 653
    :goto_a
    invoke-virtual {v3, v5}, La/fet;->r(Z)V

    .line 654
    .line 655
    .line 656
    goto :goto_b

    .line 657
    :cond_1d
    const/4 v4, 0x0

    .line 658
    const v0, -0x486e9f3

    .line 659
    .line 660
    .line 661
    invoke-static {v0, v3, v4}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 662
    .line 663
    .line 664
    move-result-object v0

    .line 665
    throw v0

    .line 666
    :cond_1e
    move-object v3, v15

    .line 667
    invoke-virtual {v3}, La/fet;->X()V

    .line 668
    .line 669
    .line 670
    :goto_b
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 671
    .line 672
    :goto_c
    return-object v10

    .line 673
    :pswitch_0
    check-cast v8, La/cy8;

    .line 674
    .line 675
    move-object/from16 v1, p1

    .line 676
    .line 677
    check-cast v1, La/hh80;

    .line 678
    .line 679
    move-object/from16 v4, p2

    .line 680
    .line 681
    check-cast v4, La/l7m0;

    .line 682
    .line 683
    move-object/from16 v10, p3

    .line 684
    .line 685
    check-cast v10, La/l7m0;

    .line 686
    .line 687
    move-object/from16 v12, p4

    .line 688
    .line 689
    check-cast v12, La/fet;

    .line 690
    .line 691
    move-object/from16 v13, p5

    .line 692
    .line 693
    check-cast v13, Ljava/lang/Integer;

    .line 694
    .line 695
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 696
    .line 697
    .line 698
    move-result v13

    .line 699
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 700
    .line 701
    .line 702
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 703
    .line 704
    .line 705
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 706
    .line 707
    .line 708
    and-int/lit8 v1, v13, 0x30

    .line 709
    .line 710
    const/16 v10, 0x20

    .line 711
    .line 712
    if-nez v1, :cond_20

    .line 713
    .line 714
    invoke-virtual {v12, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 715
    .line 716
    .line 717
    move-result v1

    .line 718
    if-eqz v1, :cond_1f

    .line 719
    .line 720
    move v1, v10

    .line 721
    goto :goto_d

    .line 722
    :cond_1f
    const/16 v1, 0x10

    .line 723
    .line 724
    :goto_d
    or-int/2addr v13, v1

    .line 725
    :cond_20
    and-int/lit16 v1, v13, 0x411

    .line 726
    .line 727
    const/16 v14, 0x410

    .line 728
    .line 729
    if-eq v1, v14, :cond_21

    .line 730
    .line 731
    move v1, v5

    .line 732
    goto :goto_e

    .line 733
    :cond_21
    const/4 v1, 0x0

    .line 734
    :goto_e
    and-int/lit8 v14, v13, 0x1

    .line 735
    .line 736
    invoke-virtual {v12, v14, v1}, La/fet;->U(IZ)Z

    .line 737
    .line 738
    .line 739
    move-result v1

    .line 740
    if-eqz v1, :cond_35

    .line 741
    .line 742
    and-int/lit8 v1, v13, 0x70

    .line 743
    .line 744
    if-ne v1, v10, :cond_22

    .line 745
    .line 746
    move v1, v5

    .line 747
    goto :goto_f

    .line 748
    :cond_22
    const/4 v1, 0x0

    .line 749
    :goto_f
    iget-object v10, v0, La/ax8;->b:Lkotlin/jvm/functions/Function1;

    .line 750
    .line 751
    invoke-virtual {v12, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 752
    .line 753
    .line 754
    move-result v13

    .line 755
    or-int/2addr v1, v13

    .line 756
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 757
    .line 758
    .line 759
    move-result-object v13

    .line 760
    if-nez v1, :cond_23

    .line 761
    .line 762
    if-ne v13, v6, :cond_24

    .line 763
    .line 764
    :cond_23
    new-instance v13, La/dl2;

    .line 765
    .line 766
    const/4 v1, 0x0

    .line 767
    invoke-direct {v13, v11, v1, v4, v10}, La/dl2;-><init>(BLa/yje;La/l7m0;Lkotlin/jvm/functions/Function1;)V

    .line 768
    .line 769
    .line 770
    invoke-virtual {v12, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 771
    .line 772
    .line 773
    :cond_24
    check-cast v13, Lkotlin/jvm/functions/Function2;

    .line 774
    .line 775
    invoke-static {v12, v4, v13}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 776
    .line 777
    .line 778
    sget-object v1, La/o7k0;->c:La/n0q;

    .line 779
    .line 780
    sget-object v13, La/uc9;->c:La/mw3;

    .line 781
    .line 782
    sget-object v14, La/gqw0;->m:La/xx7;

    .line 783
    .line 784
    const/4 v15, 0x0

    .line 785
    invoke-static {v13, v14, v12, v15}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 786
    .line 787
    .line 788
    move-result-object v13

    .line 789
    iget-wide v14, v12, La/fet;->T:J

    .line 790
    .line 791
    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    .line 792
    .line 793
    .line 794
    move-result v14

    .line 795
    invoke-virtual {v12}, La/fet;->m()La/bh90;

    .line 796
    .line 797
    .line 798
    move-result-object v15

    .line 799
    invoke-static {v12, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 800
    .line 801
    .line 802
    move-result-object v1

    .line 803
    sget-object v16, La/mkd;->c0:La/gqw0;

    .line 804
    .line 805
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 806
    .line 807
    .line 808
    invoke-virtual {v12}, La/fet;->i0()V

    .line 809
    .line 810
    .line 811
    iget-boolean v5, v12, La/fet;->S:Z

    .line 812
    .line 813
    if-eqz v5, :cond_25

    .line 814
    .line 815
    invoke-virtual {v12, v2}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 816
    .line 817
    .line 818
    goto :goto_10

    .line 819
    :cond_25
    invoke-virtual {v12}, La/fet;->r0()V

    .line 820
    .line 821
    .line 822
    :goto_10
    sget-object v2, La/gqw0;->x:La/shd;

    .line 823
    .line 824
    invoke-static {v12, v13, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 825
    .line 826
    .line 827
    sget-object v2, La/gqw0;->w:La/shd;

    .line 828
    .line 829
    invoke-static {v12, v15, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 830
    .line 831
    .line 832
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 833
    .line 834
    .line 835
    move-result-object v2

    .line 836
    sget-object v5, La/gqw0;->y:La/shd;

    .line 837
    .line 838
    invoke-static {v12, v2, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 839
    .line 840
    .line 841
    invoke-static {v12}, La/jpm0;->n(La/fet;)V

    .line 842
    .line 843
    .line 844
    sget-object v2, La/gqw0;->v:La/shd;

    .line 845
    .line 846
    invoke-static {v12, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 847
    .line 848
    .line 849
    iget-object v1, v8, La/cy8;->e:La/ge70;

    .line 850
    .line 851
    instance-of v2, v1, La/fe70;

    .line 852
    .line 853
    if-nez v2, :cond_2d

    .line 854
    .line 855
    iget-object v2, v8, La/cy8;->g:La/pp0;

    .line 856
    .line 857
    instance-of v5, v2, La/np0;

    .line 858
    .line 859
    if-eqz v5, :cond_26

    .line 860
    .line 861
    move-object v5, v2

    .line 862
    check-cast v5, La/np0;

    .line 863
    .line 864
    iget-object v5, v5, La/np0;->a:La/fyl;

    .line 865
    .line 866
    iget-object v5, v5, La/fyl;->a:La/a4x;

    .line 867
    .line 868
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 869
    .line 870
    .line 871
    move-result v5

    .line 872
    if-eqz v5, :cond_27

    .line 873
    .line 874
    :cond_26
    instance-of v2, v2, La/op0;

    .line 875
    .line 876
    if-eqz v2, :cond_2d

    .line 877
    .line 878
    :cond_27
    const v2, 0x64921ecd

    .line 879
    .line 880
    .line 881
    invoke-virtual {v12, v2}, La/fet;->e0(I)V

    .line 882
    .line 883
    .line 884
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 885
    .line 886
    .line 887
    move-result-object v2

    .line 888
    check-cast v2, Ljava/lang/Number;

    .line 889
    .line 890
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 891
    .line 892
    .line 893
    move-result v2

    .line 894
    cmpg-float v2, v2, v9

    .line 895
    .line 896
    if-gez v2, :cond_28

    .line 897
    .line 898
    const v2, 0x64944073

    .line 899
    .line 900
    .line 901
    invoke-virtual {v12, v2}, La/fet;->e0(I)V

    .line 902
    .line 903
    .line 904
    sget-object v2, La/zaq0;->b:La/zfn;

    .line 905
    .line 906
    invoke-virtual {v12, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 907
    .line 908
    .line 909
    move-result-object v2

    .line 910
    check-cast v2, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 911
    .line 912
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 913
    .line 914
    .line 915
    move-result-wide v4

    .line 916
    const/4 v15, 0x0

    .line 917
    invoke-virtual {v12, v15}, La/fet;->r(Z)V

    .line 918
    .line 919
    .line 920
    goto :goto_11

    .line 921
    :cond_28
    const/4 v15, 0x0

    .line 922
    const v2, 0x6495dc0c

    .line 923
    .line 924
    .line 925
    invoke-virtual {v12, v2}, La/fet;->e0(I)V

    .line 926
    .line 927
    .line 928
    sget-object v2, La/zaq0;->b:La/zfn;

    .line 929
    .line 930
    invoke-virtual {v12, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 931
    .line 932
    .line 933
    move-result-object v2

    .line 934
    check-cast v2, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 935
    .line 936
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 937
    .line 938
    .line 939
    move-result-wide v4

    .line 940
    invoke-virtual {v12, v15}, La/fet;->r(Z)V

    .line 941
    .line 942
    .line 943
    :goto_11
    sget-object v2, La/jd8;->n:La/ljc;

    .line 944
    .line 945
    invoke-static {v3, v4, v5, v2}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 946
    .line 947
    .line 948
    move-result-object v18

    .line 949
    sget-object v19, La/mp0;->c:La/mp0;

    .line 950
    .line 951
    iget-object v2, v8, La/cy8;->g:La/pp0;

    .line 952
    .line 953
    sget-object v3, La/qmk;->a:La/zcl;

    .line 954
    .line 955
    invoke-static {v12}, La/qmk;->a(La/fet;)La/wfn;

    .line 956
    .line 957
    .line 958
    move-result-object v3

    .line 959
    iget v3, v3, La/wfn;->c:F

    .line 960
    .line 961
    invoke-static {v3, v7, v11}, La/s5x0;->t(FFI)La/lh80;

    .line 962
    .line 963
    .line 964
    move-result-object v21

    .line 965
    invoke-virtual {v12, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 966
    .line 967
    .line 968
    move-result v3

    .line 969
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 970
    .line 971
    .line 972
    move-result-object v4

    .line 973
    if-nez v3, :cond_29

    .line 974
    .line 975
    if-ne v4, v6, :cond_2a

    .line 976
    .line 977
    :cond_29
    new-instance v4, La/tk8;

    .line 978
    .line 979
    const/16 v3, 0x15

    .line 980
    .line 981
    invoke-direct {v4, v10, v3}, La/tk8;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 982
    .line 983
    .line 984
    invoke-virtual {v12, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 985
    .line 986
    .line 987
    :cond_2a
    move-object/from16 v22, v4

    .line 988
    .line 989
    check-cast v22, Lkotlin/jvm/functions/Function0;

    .line 990
    .line 991
    invoke-virtual {v12, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 992
    .line 993
    .line 994
    move-result v3

    .line 995
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 996
    .line 997
    .line 998
    move-result-object v4

    .line 999
    if-nez v3, :cond_2b

    .line 1000
    .line 1001
    if-ne v4, v6, :cond_2c

    .line 1002
    .line 1003
    :cond_2b
    new-instance v4, La/uo6;

    .line 1004
    .line 1005
    const/16 v3, 0x1a

    .line 1006
    .line 1007
    invoke-direct {v4, v10, v3}, La/uo6;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 1008
    .line 1009
    .line 1010
    invoke-virtual {v12, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1011
    .line 1012
    .line 1013
    :cond_2c
    move-object/from16 v23, v4

    .line 1014
    .line 1015
    check-cast v23, Lkotlin/jvm/functions/Function1;

    .line 1016
    .line 1017
    const/16 v25, 0x30

    .line 1018
    .line 1019
    move-object/from16 v20, v2

    .line 1020
    .line 1021
    move-object/from16 v24, v12

    .line 1022
    .line 1023
    invoke-static/range {v18 .. v25}, La/bkb;->e(La/mm40;La/mp0;La/pp0;La/lh80;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1024
    .line 1025
    .line 1026
    move-object/from16 v2, v24

    .line 1027
    .line 1028
    const/4 v4, 0x0

    .line 1029
    invoke-virtual {v2, v4}, La/fet;->r(Z)V

    .line 1030
    .line 1031
    .line 1032
    goto :goto_12

    .line 1033
    :cond_2d
    move-object v2, v12

    .line 1034
    const/4 v4, 0x0

    .line 1035
    const v3, 0x64a18e17

    .line 1036
    .line 1037
    .line 1038
    invoke-virtual {v2, v3}, La/fet;->e0(I)V

    .line 1039
    .line 1040
    .line 1041
    invoke-virtual {v2, v4}, La/fet;->r(Z)V

    .line 1042
    .line 1043
    .line 1044
    :goto_12
    if-eqz v1, :cond_34

    .line 1045
    .line 1046
    instance-of v3, v1, La/de70;

    .line 1047
    .line 1048
    iget-boolean v4, v0, La/ax8;->d:Z

    .line 1049
    .line 1050
    if-eqz v3, :cond_30

    .line 1051
    .line 1052
    const v3, 0x64a40e8e

    .line 1053
    .line 1054
    .line 1055
    const/4 v5, 0x1

    .line 1056
    invoke-static {v2, v3, v9, v5}, La/rz4;->f(La/fet;IFZ)La/x7z;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v18

    .line 1060
    check-cast v1, La/de70;

    .line 1061
    .line 1062
    iget-object v1, v1, La/de70;->a:La/a4x;

    .line 1063
    .line 1064
    invoke-virtual {v2, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1065
    .line 1066
    .line 1067
    move-result v3

    .line 1068
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v5

    .line 1072
    if-nez v3, :cond_2e

    .line 1073
    .line 1074
    if-ne v5, v6, :cond_2f

    .line 1075
    .line 1076
    :cond_2e
    new-instance v5, La/tk8;

    .line 1077
    .line 1078
    const/16 v3, 0x16

    .line 1079
    .line 1080
    invoke-direct {v5, v10, v3}, La/tk8;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 1081
    .line 1082
    .line 1083
    invoke-virtual {v2, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1084
    .line 1085
    .line 1086
    :cond_2f
    move-object/from16 v23, v5

    .line 1087
    .line 1088
    check-cast v23, Lkotlin/jvm/functions/Function0;

    .line 1089
    .line 1090
    const/16 v25, 0x0

    .line 1091
    .line 1092
    iget-object v0, v0, La/ax8;->c:La/d9z;

    .line 1093
    .line 1094
    move-object/from16 v20, v0

    .line 1095
    .line 1096
    move-object/from16 v19, v1

    .line 1097
    .line 1098
    move-object/from16 v24, v2

    .line 1099
    .line 1100
    move/from16 v21, v4

    .line 1101
    .line 1102
    move-object/from16 v22, v10

    .line 1103
    .line 1104
    invoke-static/range {v18 .. v25}, La/hmw0;->K(La/mm40;Ljava/util/List;La/d9z;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 1105
    .line 1106
    .line 1107
    const/4 v4, 0x0

    .line 1108
    invoke-virtual {v2, v4}, La/fet;->r(Z)V

    .line 1109
    .line 1110
    .line 1111
    :goto_13
    const/4 v5, 0x1

    .line 1112
    goto :goto_14

    .line 1113
    :cond_30
    move/from16 v20, v4

    .line 1114
    .line 1115
    move-object v0, v10

    .line 1116
    instance-of v3, v1, La/ee70;

    .line 1117
    .line 1118
    if-eqz v3, :cond_31

    .line 1119
    .line 1120
    const v0, 0x64ad3599

    .line 1121
    .line 1122
    .line 1123
    const/4 v5, 0x1

    .line 1124
    invoke-static {v2, v0, v9, v5}, La/rz4;->f(La/fet;IFZ)La/x7z;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v18

    .line 1128
    check-cast v1, La/ee70;

    .line 1129
    .line 1130
    iget-object v0, v1, La/ee70;->a:La/mdm;

    .line 1131
    .line 1132
    const/16 v23, 0x0

    .line 1133
    .line 1134
    const/16 v24, 0x8

    .line 1135
    .line 1136
    const/16 v21, 0x0

    .line 1137
    .line 1138
    move-object/from16 v19, v0

    .line 1139
    .line 1140
    move-object/from16 v22, v2

    .line 1141
    .line 1142
    invoke-static/range {v18 .. v24}, La/hmw0;->k(La/mm40;La/mdm;ZLkotlin/jvm/functions/Function0;La/fet;II)V

    .line 1143
    .line 1144
    .line 1145
    const/4 v4, 0x0

    .line 1146
    invoke-virtual {v2, v4}, La/fet;->r(Z)V

    .line 1147
    .line 1148
    .line 1149
    goto :goto_13

    .line 1150
    :cond_31
    instance-of v3, v1, La/fe70;

    .line 1151
    .line 1152
    if-eqz v3, :cond_34

    .line 1153
    .line 1154
    const v3, 0x64b353b4

    .line 1155
    .line 1156
    .line 1157
    const/4 v5, 0x1

    .line 1158
    invoke-static {v2, v3, v9, v5}, La/rz4;->f(La/fet;IFZ)La/x7z;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v18

    .line 1162
    check-cast v1, La/fe70;

    .line 1163
    .line 1164
    iget-object v1, v1, La/fe70;->a:La/mdm;

    .line 1165
    .line 1166
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1167
    .line 1168
    .line 1169
    move-result v3

    .line 1170
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v4

    .line 1174
    if-nez v3, :cond_32

    .line 1175
    .line 1176
    if-ne v4, v6, :cond_33

    .line 1177
    .line 1178
    :cond_32
    new-instance v4, La/tk8;

    .line 1179
    .line 1180
    const/16 v3, 0x17

    .line 1181
    .line 1182
    invoke-direct {v4, v0, v3}, La/tk8;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 1183
    .line 1184
    .line 1185
    invoke-virtual {v2, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1186
    .line 1187
    .line 1188
    :cond_33
    move-object/from16 v21, v4

    .line 1189
    .line 1190
    check-cast v21, Lkotlin/jvm/functions/Function0;

    .line 1191
    .line 1192
    const/16 v23, 0x0

    .line 1193
    .line 1194
    const/16 v24, 0x0

    .line 1195
    .line 1196
    move-object/from16 v19, v1

    .line 1197
    .line 1198
    move-object/from16 v22, v2

    .line 1199
    .line 1200
    invoke-static/range {v18 .. v24}, La/hmw0;->k(La/mm40;La/mdm;ZLkotlin/jvm/functions/Function0;La/fet;II)V

    .line 1201
    .line 1202
    .line 1203
    const/4 v4, 0x0

    .line 1204
    invoke-virtual {v2, v4}, La/fet;->r(Z)V

    .line 1205
    .line 1206
    .line 1207
    goto :goto_13

    .line 1208
    :goto_14
    invoke-virtual {v2, v5}, La/fet;->r(Z)V

    .line 1209
    .line 1210
    .line 1211
    goto :goto_15

    .line 1212
    :cond_34
    const/4 v4, 0x0

    .line 1213
    const v0, 0x6e99e3ae

    .line 1214
    .line 1215
    .line 1216
    invoke-static {v0, v2, v4}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v0

    .line 1220
    throw v0

    .line 1221
    :cond_35
    move-object v2, v12

    .line 1222
    invoke-virtual {v2}, La/fet;->X()V

    .line 1223
    .line 1224
    .line 1225
    :goto_15
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1226
    .line 1227
    return-object v0

    .line 1228
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
