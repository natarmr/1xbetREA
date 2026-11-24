.class public abstract La/vko0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/zfn;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/dco0;

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/dco0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/zfn;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v0, v2}, La/zfn;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 12
    .line 13
    .line 14
    sput-object v1, La/vko0;->a:La/zfn;

    .line 15
    .line 16
    return-void
.end method

.method public static final a(La/mm40;La/elo0;Lkotlin/jvm/functions/Function1;La/fet;I)V
    .locals 44

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v8, p3

    .line 8
    .line 9
    move/from16 v0, p4

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const v4, 0x32decd31

    .line 18
    .line 19
    .line 20
    invoke-virtual {v8, v4}, La/fet;->g0(I)La/fet;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v8, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    const/4 v4, 0x4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v4, 0x2

    .line 32
    :goto_0
    or-int/2addr v4, v0

    .line 33
    invoke-virtual {v8, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    const/16 v6, 0x20

    .line 38
    .line 39
    if-eqz v5, :cond_1

    .line 40
    .line 41
    move v5, v6

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const/16 v5, 0x10

    .line 44
    .line 45
    :goto_1
    or-int/2addr v4, v5

    .line 46
    and-int/lit16 v5, v0, 0x180

    .line 47
    .line 48
    const/16 v7, 0x100

    .line 49
    .line 50
    if-nez v5, :cond_3

    .line 51
    .line 52
    invoke-virtual {v8, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-eqz v5, :cond_2

    .line 57
    .line 58
    move v5, v7

    .line 59
    goto :goto_2

    .line 60
    :cond_2
    const/16 v5, 0x80

    .line 61
    .line 62
    :goto_2
    or-int/2addr v4, v5

    .line 63
    :cond_3
    and-int/lit16 v5, v4, 0x93

    .line 64
    .line 65
    const/16 v9, 0x92

    .line 66
    .line 67
    const/4 v12, 0x0

    .line 68
    const/4 v13, 0x1

    .line 69
    if-eq v5, v9, :cond_4

    .line 70
    .line 71
    move v5, v13

    .line 72
    goto :goto_3

    .line 73
    :cond_4
    move v5, v12

    .line 74
    :goto_3
    and-int/lit8 v9, v4, 0x1

    .line 75
    .line 76
    invoke-virtual {v8, v9, v5}, La/fet;->U(IZ)Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-eqz v5, :cond_15

    .line 81
    .line 82
    sget-object v5, La/vko0;->a:La/zfn;

    .line 83
    .line 84
    invoke-virtual {v8, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    check-cast v5, La/k6z;

    .line 89
    .line 90
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-eqz v5, :cond_6

    .line 95
    .line 96
    if-ne v5, v13, :cond_5

    .line 97
    .line 98
    const/16 v27, 0x2

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_6
    move/from16 v27, v13

    .line 106
    .line 107
    :goto_4
    sget-object v5, La/qmk;->a:La/zcl;

    .line 108
    .line 109
    const/4 v14, 0x0

    .line 110
    const/high16 v15, 0x41000000    # 8.0f

    .line 111
    .line 112
    invoke-static {v1, v14, v15, v13}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 113
    .line 114
    .line 115
    move-result-object v16

    .line 116
    and-int/lit16 v5, v4, 0x380

    .line 117
    .line 118
    if-ne v5, v7, :cond_7

    .line 119
    .line 120
    move v5, v13

    .line 121
    goto :goto_5

    .line 122
    :cond_7
    move v5, v12

    .line 123
    :goto_5
    and-int/lit8 v4, v4, 0x70

    .line 124
    .line 125
    if-eq v4, v6, :cond_8

    .line 126
    .line 127
    move v4, v12

    .line 128
    goto :goto_6

    .line 129
    :cond_8
    move v4, v13

    .line 130
    :goto_6
    or-int/2addr v4, v5

    .line 131
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    if-nez v4, :cond_9

    .line 136
    .line 137
    sget-object v4, La/ukd;->a:La/cl5;

    .line 138
    .line 139
    if-ne v5, v4, :cond_a

    .line 140
    .line 141
    :cond_9
    new-instance v5, La/o0k0;

    .line 142
    .line 143
    const/16 v4, 0x18

    .line 144
    .line 145
    invoke-direct {v5, v3, v2, v4}, La/o0k0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v8, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    :cond_a
    move-object/from16 v21, v5

    .line 152
    .line 153
    check-cast v21, Lkotlin/jvm/functions/Function0;

    .line 154
    .line 155
    const/16 v22, 0x1c

    .line 156
    .line 157
    const/16 v17, 0x0

    .line 158
    .line 159
    const/16 v18, 0x0

    .line 160
    .line 161
    const/16 v19, 0x0

    .line 162
    .line 163
    const/16 v20, 0x0

    .line 164
    .line 165
    invoke-static/range {v16 .. v22}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    sget-object v5, La/uc9;->c:La/mw3;

    .line 170
    .line 171
    sget-object v6, La/gqw0;->m:La/xx7;

    .line 172
    .line 173
    invoke-static {v5, v6, v8, v12}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    iget-wide v6, v8, La/fet;->T:J

    .line 178
    .line 179
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 180
    .line 181
    .line 182
    move-result v6

    .line 183
    invoke-virtual {v8}, La/fet;->m()La/bh90;

    .line 184
    .line 185
    .line 186
    move-result-object v7

    .line 187
    invoke-static {v8, v4}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    sget-object v9, La/mkd;->c0:La/gqw0;

    .line 192
    .line 193
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v8}, La/fet;->i0()V

    .line 197
    .line 198
    .line 199
    iget-boolean v9, v8, La/fet;->S:Z

    .line 200
    .line 201
    sget-object v10, La/e7z;->u1:La/pcy;

    .line 202
    .line 203
    if-eqz v9, :cond_b

    .line 204
    .line 205
    invoke-virtual {v8, v10}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 206
    .line 207
    .line 208
    goto :goto_7

    .line 209
    :cond_b
    invoke-virtual {v8}, La/fet;->r0()V

    .line 210
    .line 211
    .line 212
    :goto_7
    sget-object v9, La/gqw0;->x:La/shd;

    .line 213
    .line 214
    invoke-static {v8, v5, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 215
    .line 216
    .line 217
    sget-object v5, La/gqw0;->w:La/shd;

    .line 218
    .line 219
    invoke-static {v8, v7, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 220
    .line 221
    .line 222
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 223
    .line 224
    .line 225
    move-result-object v6

    .line 226
    sget-object v7, La/gqw0;->y:La/shd;

    .line 227
    .line 228
    invoke-static {v8, v6, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 229
    .line 230
    .line 231
    invoke-static {v8}, La/jpm0;->n(La/fet;)V

    .line 232
    .line 233
    .line 234
    sget-object v6, La/gqw0;->v:La/shd;

    .line 235
    .line 236
    invoke-static {v8, v4, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 237
    .line 238
    .line 239
    sget-object v4, La/jm40;->b:La/jm40;

    .line 240
    .line 241
    const/high16 v11, 0x3f800000    # 1.0f

    .line 242
    .line 243
    invoke-static {v4, v11}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 244
    .line 245
    .line 246
    move-result-object v14

    .line 247
    sget-object v15, La/gqw0;->a:La/zx7;

    .line 248
    .line 249
    invoke-static {v15, v12}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 250
    .line 251
    .line 252
    move-result-object v15

    .line 253
    iget-wide v11, v8, La/fet;->T:J

    .line 254
    .line 255
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    .line 256
    .line 257
    .line 258
    move-result v11

    .line 259
    invoke-virtual {v8}, La/fet;->m()La/bh90;

    .line 260
    .line 261
    .line 262
    move-result-object v12

    .line 263
    invoke-static {v8, v14}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 264
    .line 265
    .line 266
    move-result-object v14

    .line 267
    invoke-virtual {v8}, La/fet;->i0()V

    .line 268
    .line 269
    .line 270
    iget-boolean v13, v8, La/fet;->S:Z

    .line 271
    .line 272
    if-eqz v13, :cond_c

    .line 273
    .line 274
    invoke-virtual {v8, v10}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 275
    .line 276
    .line 277
    goto :goto_8

    .line 278
    :cond_c
    invoke-virtual {v8}, La/fet;->r0()V

    .line 279
    .line 280
    .line 281
    :goto_8
    invoke-static {v8, v15, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 282
    .line 283
    .line 284
    invoke-static {v8, v12, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 285
    .line 286
    .line 287
    invoke-static {v11, v8, v7, v8}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 288
    .line 289
    .line 290
    invoke-static {v8, v14, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 291
    .line 292
    .line 293
    sget-object v11, La/gqw0;->d:La/zx7;

    .line 294
    .line 295
    sget-object v12, La/jr8;->a:La/jr8;

    .line 296
    .line 297
    invoke-virtual {v12, v4, v11}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 298
    .line 299
    .line 300
    move-result-object v11

    .line 301
    const/high16 v13, 0x42000000    # 32.0f

    .line 302
    .line 303
    invoke-static {v11, v13}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 304
    .line 305
    .line 306
    move-result-object v11

    .line 307
    const/high16 v14, 0x40000000    # 2.0f

    .line 308
    .line 309
    invoke-static {v11, v14}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 310
    .line 311
    .line 312
    move-result-object v11

    .line 313
    iget-object v15, v2, La/elo0;->h:La/jkv0;

    .line 314
    .line 315
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    move-object/from16 v36, v12

    .line 319
    .line 320
    const/16 v12, 0x13

    .line 321
    .line 322
    if-nez v15, :cond_d

    .line 323
    .line 324
    :goto_9
    const/4 v13, 0x0

    .line 325
    goto :goto_a

    .line 326
    :cond_d
    new-instance v13, La/ij90;

    .line 327
    .line 328
    const/4 v14, 0x1

    .line 329
    invoke-direct {v13, v14, v15, v12}, La/ij90;-><init>(ZLjava/lang/Object;B)V

    .line 330
    .line 331
    .line 332
    invoke-static {v11, v13}, La/rq8;->L(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 333
    .line 334
    .line 335
    move-result-object v11

    .line 336
    goto :goto_9

    .line 337
    :goto_a
    invoke-static {v13, v8, v11}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 338
    .line 339
    .line 340
    sget-object v11, La/gqw0;->k:La/yx7;

    .line 341
    .line 342
    sget-object v14, La/uc9;->g:La/nw3;

    .line 343
    .line 344
    const/16 v15, 0x36

    .line 345
    .line 346
    invoke-static {v14, v11, v8, v15}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 347
    .line 348
    .line 349
    move-result-object v11

    .line 350
    iget-wide v14, v8, La/fet;->T:J

    .line 351
    .line 352
    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    .line 353
    .line 354
    .line 355
    move-result v14

    .line 356
    invoke-virtual {v8}, La/fet;->m()La/bh90;

    .line 357
    .line 358
    .line 359
    move-result-object v15

    .line 360
    invoke-static {v8, v4}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 361
    .line 362
    .line 363
    move-result-object v12

    .line 364
    invoke-virtual {v8}, La/fet;->i0()V

    .line 365
    .line 366
    .line 367
    iget-boolean v13, v8, La/fet;->S:Z

    .line 368
    .line 369
    if-eqz v13, :cond_e

    .line 370
    .line 371
    invoke-virtual {v8, v10}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 372
    .line 373
    .line 374
    goto :goto_b

    .line 375
    :cond_e
    invoke-virtual {v8}, La/fet;->r0()V

    .line 376
    .line 377
    .line 378
    :goto_b
    invoke-static {v8, v11, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 379
    .line 380
    .line 381
    invoke-static {v8, v15, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 382
    .line 383
    .line 384
    invoke-static {v14, v8, v7, v8}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 385
    .line 386
    .line 387
    invoke-static {v8, v12, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 388
    .line 389
    .line 390
    const/16 v20, 0x0

    .line 391
    .line 392
    const/16 v21, 0xe

    .line 393
    .line 394
    const/high16 v17, 0x41000000    # 8.0f

    .line 395
    .line 396
    const/16 v18, 0x0

    .line 397
    .line 398
    const/16 v19, 0x0

    .line 399
    .line 400
    move-object/from16 v16, v4

    .line 401
    .line 402
    invoke-static/range {v16 .. v21}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 403
    .line 404
    .line 405
    move-result-object v4

    .line 406
    move-object/from16 v11, v16

    .line 407
    .line 408
    iget-object v5, v2, La/elo0;->a:La/ndp0;

    .line 409
    .line 410
    iget-object v5, v5, La/ndp0;->a:La/c5a0;

    .line 411
    .line 412
    sget-object v6, La/w6n;->h:La/w6n;

    .line 413
    .line 414
    const/16 v9, 0x180

    .line 415
    .line 416
    const/16 v10, 0x8

    .line 417
    .line 418
    const/4 v7, 0x0

    .line 419
    invoke-static/range {v4 .. v10}, La/n2x;->l(La/mm40;La/h5a0;La/w6n;Lkotlin/jvm/functions/Function2;La/fet;II)V

    .line 420
    .line 421
    .line 422
    move-object/from16 v34, v6

    .line 423
    .line 424
    const/high16 v4, 0x3f800000    # 1.0f

    .line 425
    .line 426
    float-to-double v5, v4

    .line 427
    const-wide/16 v37, 0x0

    .line 428
    .line 429
    cmpl-double v5, v5, v37

    .line 430
    .line 431
    const-string v39, "invalid weight; must be greater than zero"

    .line 432
    .line 433
    if-lez v5, :cond_f

    .line 434
    .line 435
    goto :goto_c

    .line 436
    :cond_f
    invoke-static/range {v39 .. v39}, La/vcx;->a(Ljava/lang/String;)V

    .line 437
    .line 438
    .line 439
    :goto_c
    new-instance v12, La/x7z;

    .line 440
    .line 441
    const v40, 0x7f7fffff    # Float.MAX_VALUE

    .line 442
    .line 443
    .line 444
    cmpl-float v5, v4, v40

    .line 445
    .line 446
    if-lez v5, :cond_10

    .line 447
    .line 448
    move/from16 v5, v40

    .line 449
    .line 450
    :goto_d
    const/4 v14, 0x1

    .line 451
    goto :goto_e

    .line 452
    :cond_10
    move v5, v4

    .line 453
    goto :goto_d

    .line 454
    :goto_e
    invoke-direct {v12, v5, v14}, La/x7z;-><init>(FZ)V

    .line 455
    .line 456
    .line 457
    const/16 v16, 0x0

    .line 458
    .line 459
    const/16 v17, 0xe

    .line 460
    .line 461
    const/high16 v13, 0x41000000    # 8.0f

    .line 462
    .line 463
    const/4 v14, 0x0

    .line 464
    const/4 v15, 0x0

    .line 465
    invoke-static/range {v12 .. v17}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 466
    .line 467
    .line 468
    move-result-object v5

    .line 469
    move v6, v4

    .line 470
    iget-object v4, v2, La/elo0;->b:Ljava/lang/String;

    .line 471
    .line 472
    invoke-static {}, La/g1t0;->d()La/y9q0;

    .line 473
    .line 474
    .line 475
    move-result-object v14

    .line 476
    const/16 v31, 0x0

    .line 477
    .line 478
    const v32, 0xfeffff

    .line 479
    .line 480
    .line 481
    const-wide/16 v15, 0x0

    .line 482
    .line 483
    const-wide/16 v17, 0x0

    .line 484
    .line 485
    const/16 v19, 0x0

    .line 486
    .line 487
    const/16 v20, 0x0

    .line 488
    .line 489
    const/16 v21, 0x0

    .line 490
    .line 491
    const/high16 v7, 0x41000000    # 8.0f

    .line 492
    .line 493
    const/4 v8, 0x0

    .line 494
    const-wide/16 v22, 0x0

    .line 495
    .line 496
    const/high16 v9, 0x40000000    # 2.0f

    .line 497
    .line 498
    const/16 v24, 0x0

    .line 499
    .line 500
    const/16 v25, 0x0

    .line 501
    .line 502
    const/16 v26, 0x0

    .line 503
    .line 504
    const-wide/16 v28, 0x0

    .line 505
    .line 506
    const/16 v30, 0x0

    .line 507
    .line 508
    invoke-static/range {v14 .. v32}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 509
    .line 510
    .line 511
    move-result-object v24

    .line 512
    move/from16 v29, v27

    .line 513
    .line 514
    sget-object v10, La/s6t0;->a:La/pz40;

    .line 515
    .line 516
    sget-object v41, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 517
    .line 518
    move v10, v6

    .line 519
    move/from16 v23, v7

    .line 520
    .line 521
    invoke-virtual/range {v41 .. v41}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 522
    .line 523
    .line 524
    move-result-wide v6

    .line 525
    new-instance v12, La/f2q0;

    .line 526
    .line 527
    const/4 v14, 0x1

    .line 528
    invoke-direct {v12, v14}, La/f2q0;-><init>(I)V

    .line 529
    .line 530
    .line 531
    const/16 v27, 0x6180

    .line 532
    .line 533
    const v28, 0x1abf8

    .line 534
    .line 535
    .line 536
    move/from16 v22, v8

    .line 537
    .line 538
    const/4 v8, 0x0

    .line 539
    move v15, v9

    .line 540
    move v13, v10

    .line 541
    const-wide/16 v9, 0x0

    .line 542
    .line 543
    move-object/from16 v16, v11

    .line 544
    .line 545
    const/4 v11, 0x0

    .line 546
    move-object/from16 v17, v16

    .line 547
    .line 548
    move-object/from16 v16, v12

    .line 549
    .line 550
    const/4 v12, 0x0

    .line 551
    move/from16 v18, v13

    .line 552
    .line 553
    const/4 v13, 0x0

    .line 554
    move/from16 v35, v14

    .line 555
    .line 556
    move/from16 v19, v15

    .line 557
    .line 558
    const-wide/16 v14, 0x0

    .line 559
    .line 560
    move-object/from16 v21, v17

    .line 561
    .line 562
    move/from16 v20, v18

    .line 563
    .line 564
    const-wide/16 v17, 0x0

    .line 565
    .line 566
    move/from16 v25, v19

    .line 567
    .line 568
    const/16 v19, 0x2

    .line 569
    .line 570
    move/from16 v26, v20

    .line 571
    .line 572
    const/16 v20, 0x0

    .line 573
    .line 574
    move-object/from16 v30, v21

    .line 575
    .line 576
    const/16 v21, 0x2

    .line 577
    .line 578
    move/from16 v31, v22

    .line 579
    .line 580
    const/16 v22, 0x0

    .line 581
    .line 582
    move/from16 v32, v23

    .line 583
    .line 584
    const/16 v23, 0x0

    .line 585
    .line 586
    move/from16 v42, v26

    .line 587
    .line 588
    const/16 v26, 0x0

    .line 589
    .line 590
    move-object/from16 v25, p3

    .line 591
    .line 592
    move-object/from16 v3, v30

    .line 593
    .line 594
    move/from16 v0, v31

    .line 595
    .line 596
    move-object/from16 v43, v36

    .line 597
    .line 598
    const/4 v1, 0x2

    .line 599
    invoke-static/range {v4 .. v28}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 600
    .line 601
    .line 602
    const/high16 v4, 0x40800000    # 4.0f

    .line 603
    .line 604
    invoke-static {v3, v4, v0, v1}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 605
    .line 606
    .line 607
    move-result-object v4

    .line 608
    const/high16 v5, 0x42400000    # 48.0f

    .line 609
    .line 610
    invoke-static {v4, v5}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 611
    .line 612
    .line 613
    move-result-object v5

    .line 614
    iget-object v4, v2, La/elo0;->f:Ljava/lang/String;

    .line 615
    .line 616
    invoke-static {}, La/g1t0;->d()La/y9q0;

    .line 617
    .line 618
    .line 619
    move-result-object v24

    .line 620
    invoke-virtual/range {v41 .. v41}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 621
    .line 622
    .line 623
    move-result-wide v6

    .line 624
    sget-wide v9, La/qmk;->p:J

    .line 625
    .line 626
    sget-wide v11, La/qmk;->q:J

    .line 627
    .line 628
    sget-wide v13, La/qmk;->n:J

    .line 629
    .line 630
    new-instance v8, La/n05;

    .line 631
    .line 632
    invoke-direct/range {v8 .. v14}, La/n05;-><init>(JJJ)V

    .line 633
    .line 634
    .line 635
    new-instance v9, La/f2q0;

    .line 636
    .line 637
    const/4 v10, 0x3

    .line 638
    invoke-direct {v9, v10}, La/f2q0;-><init>(I)V

    .line 639
    .line 640
    .line 641
    const/16 v27, 0x6000

    .line 642
    .line 643
    const v28, 0x1bbf0

    .line 644
    .line 645
    .line 646
    move-object/from16 v16, v9

    .line 647
    .line 648
    move v11, v10

    .line 649
    const-wide/16 v9, 0x0

    .line 650
    .line 651
    move v12, v11

    .line 652
    const/4 v11, 0x0

    .line 653
    move v13, v12

    .line 654
    const/4 v12, 0x0

    .line 655
    move v14, v13

    .line 656
    const/4 v13, 0x0

    .line 657
    move/from16 v17, v14

    .line 658
    .line 659
    const-wide/16 v14, 0x0

    .line 660
    .line 661
    move/from16 v19, v17

    .line 662
    .line 663
    const-wide/16 v17, 0x0

    .line 664
    .line 665
    move/from16 v20, v19

    .line 666
    .line 667
    const/16 v19, 0x0

    .line 668
    .line 669
    move/from16 v21, v20

    .line 670
    .line 671
    const/16 v20, 0x0

    .line 672
    .line 673
    move/from16 v22, v21

    .line 674
    .line 675
    const/16 v21, 0x1

    .line 676
    .line 677
    move/from16 v23, v22

    .line 678
    .line 679
    const/16 v22, 0x0

    .line 680
    .line 681
    move/from16 v25, v23

    .line 682
    .line 683
    const/16 v23, 0x0

    .line 684
    .line 685
    move-object/from16 v25, p3

    .line 686
    .line 687
    invoke-static/range {v4 .. v28}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 688
    .line 689
    .line 690
    const/high16 v13, 0x3f800000    # 1.0f

    .line 691
    .line 692
    float-to-double v4, v13

    .line 693
    cmpl-double v4, v4, v37

    .line 694
    .line 695
    if-lez v4, :cond_11

    .line 696
    .line 697
    goto :goto_f

    .line 698
    :cond_11
    invoke-static/range {v39 .. v39}, La/vcx;->a(Ljava/lang/String;)V

    .line 699
    .line 700
    .line 701
    :goto_f
    new-instance v5, La/x7z;

    .line 702
    .line 703
    cmpl-float v4, v13, v40

    .line 704
    .line 705
    if-lez v4, :cond_12

    .line 706
    .line 707
    move/from16 v11, v40

    .line 708
    .line 709
    :goto_10
    const/4 v4, 0x1

    .line 710
    goto :goto_11

    .line 711
    :cond_12
    const/high16 v11, 0x3f800000    # 1.0f

    .line 712
    .line 713
    goto :goto_10

    .line 714
    :goto_11
    invoke-direct {v5, v11, v4}, La/x7z;-><init>(FZ)V

    .line 715
    .line 716
    .line 717
    const/4 v9, 0x0

    .line 718
    const/16 v10, 0xb

    .line 719
    .line 720
    const/4 v6, 0x0

    .line 721
    const/4 v7, 0x0

    .line 722
    const/high16 v8, 0x41000000    # 8.0f

    .line 723
    .line 724
    invoke-static/range {v5 .. v10}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 725
    .line 726
    .line 727
    move-result-object v5

    .line 728
    move/from16 v35, v4

    .line 729
    .line 730
    iget-object v4, v2, La/elo0;->d:Ljava/lang/String;

    .line 731
    .line 732
    invoke-static {}, La/g1t0;->d()La/y9q0;

    .line 733
    .line 734
    .line 735
    move-result-object v14

    .line 736
    const/16 v31, 0x0

    .line 737
    .line 738
    const v32, 0xfeffff

    .line 739
    .line 740
    .line 741
    const-wide/16 v15, 0x0

    .line 742
    .line 743
    const-wide/16 v17, 0x0

    .line 744
    .line 745
    const/16 v19, 0x0

    .line 746
    .line 747
    const/16 v20, 0x0

    .line 748
    .line 749
    const/16 v21, 0x0

    .line 750
    .line 751
    const-wide/16 v22, 0x0

    .line 752
    .line 753
    const/16 v24, 0x0

    .line 754
    .line 755
    const/16 v25, 0x0

    .line 756
    .line 757
    const/16 v26, 0x0

    .line 758
    .line 759
    move/from16 v27, v29

    .line 760
    .line 761
    const-wide/16 v28, 0x0

    .line 762
    .line 763
    const/16 v30, 0x0

    .line 764
    .line 765
    invoke-static/range {v14 .. v32}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 766
    .line 767
    .line 768
    move-result-object v24

    .line 769
    invoke-virtual/range {v41 .. v41}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 770
    .line 771
    .line 772
    move-result-wide v6

    .line 773
    new-instance v8, La/f2q0;

    .line 774
    .line 775
    invoke-direct {v8, v1}, La/f2q0;-><init>(I)V

    .line 776
    .line 777
    .line 778
    const/16 v27, 0x6180

    .line 779
    .line 780
    const v28, 0x1abf8

    .line 781
    .line 782
    .line 783
    move-object/from16 v16, v8

    .line 784
    .line 785
    const/4 v8, 0x0

    .line 786
    const-wide/16 v9, 0x0

    .line 787
    .line 788
    const/4 v11, 0x0

    .line 789
    const/4 v12, 0x0

    .line 790
    const/4 v13, 0x0

    .line 791
    const-wide/16 v14, 0x0

    .line 792
    .line 793
    const/16 v19, 0x2

    .line 794
    .line 795
    const/16 v20, 0x0

    .line 796
    .line 797
    const/16 v21, 0x2

    .line 798
    .line 799
    const/16 v22, 0x0

    .line 800
    .line 801
    const/16 v23, 0x0

    .line 802
    .line 803
    move-object/from16 v25, p3

    .line 804
    .line 805
    move/from16 v0, v35

    .line 806
    .line 807
    invoke-static/range {v4 .. v28}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 808
    .line 809
    .line 810
    const/16 v20, 0x0

    .line 811
    .line 812
    const/16 v21, 0xb

    .line 813
    .line 814
    const/16 v17, 0x0

    .line 815
    .line 816
    const/16 v18, 0x0

    .line 817
    .line 818
    const/high16 v19, 0x41000000    # 8.0f

    .line 819
    .line 820
    move-object/from16 v16, v3

    .line 821
    .line 822
    invoke-static/range {v16 .. v21}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 823
    .line 824
    .line 825
    move-result-object v4

    .line 826
    move-object/from16 v11, v16

    .line 827
    .line 828
    iget-object v3, v2, La/elo0;->c:La/ndp0;

    .line 829
    .line 830
    iget-object v5, v3, La/ndp0;->a:La/c5a0;

    .line 831
    .line 832
    const/16 v9, 0x180

    .line 833
    .line 834
    const/16 v10, 0x8

    .line 835
    .line 836
    const/4 v7, 0x0

    .line 837
    move-object/from16 v8, p3

    .line 838
    .line 839
    move-object/from16 v6, v34

    .line 840
    .line 841
    invoke-static/range {v4 .. v10}, La/n2x;->l(La/mm40;La/h5a0;La/w6n;Lkotlin/jvm/functions/Function2;La/fet;II)V

    .line 842
    .line 843
    .line 844
    invoke-virtual {v8, v0}, La/fet;->r(Z)V

    .line 845
    .line 846
    .line 847
    sget-object v3, La/gqw0;->f:La/zx7;

    .line 848
    .line 849
    move-object/from16 v4, v43

    .line 850
    .line 851
    invoke-virtual {v4, v11, v3}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 852
    .line 853
    .line 854
    move-result-object v3

    .line 855
    const/high16 v4, 0x42000000    # 32.0f

    .line 856
    .line 857
    invoke-static {v3, v4}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 858
    .line 859
    .line 860
    move-result-object v3

    .line 861
    const/high16 v9, 0x40000000    # 2.0f

    .line 862
    .line 863
    invoke-static {v3, v9}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 864
    .line 865
    .line 866
    move-result-object v3

    .line 867
    iget-object v4, v2, La/elo0;->i:La/jkv0;

    .line 868
    .line 869
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 870
    .line 871
    .line 872
    if-nez v4, :cond_13

    .line 873
    .line 874
    const/4 v7, 0x0

    .line 875
    goto :goto_12

    .line 876
    :cond_13
    new-instance v5, La/ij90;

    .line 877
    .line 878
    const/16 v6, 0x13

    .line 879
    .line 880
    const/4 v7, 0x0

    .line 881
    invoke-direct {v5, v7, v4, v6}, La/ij90;-><init>(ZLjava/lang/Object;B)V

    .line 882
    .line 883
    .line 884
    invoke-static {v3, v5}, La/rq8;->L(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 885
    .line 886
    .line 887
    move-result-object v3

    .line 888
    :goto_12
    invoke-static {v7, v8, v3}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 889
    .line 890
    .line 891
    invoke-virtual {v8, v0}, La/fet;->r(Z)V

    .line 892
    .line 893
    .line 894
    iget-object v3, v2, La/elo0;->e:Ljava/lang/String;

    .line 895
    .line 896
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 897
    .line 898
    .line 899
    move-result v3

    .line 900
    if-lez v3, :cond_14

    .line 901
    .line 902
    const v3, -0x67a2236a

    .line 903
    .line 904
    .line 905
    invoke-virtual {v8, v3}, La/fet;->e0(I)V

    .line 906
    .line 907
    .line 908
    const/high16 v13, 0x3f800000    # 1.0f

    .line 909
    .line 910
    invoke-static {v11, v13}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 911
    .line 912
    .line 913
    move-result-object v14

    .line 914
    const/16 v18, 0x0

    .line 915
    .line 916
    const/16 v19, 0xd

    .line 917
    .line 918
    const/4 v15, 0x0

    .line 919
    const/high16 v16, 0x40000000    # 2.0f

    .line 920
    .line 921
    const/16 v17, 0x0

    .line 922
    .line 923
    invoke-static/range {v14 .. v19}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 924
    .line 925
    .line 926
    move-result-object v3

    .line 927
    const/high16 v4, 0x41000000    # 8.0f

    .line 928
    .line 929
    const/4 v5, 0x0

    .line 930
    invoke-static {v3, v4, v5, v1}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 931
    .line 932
    .line 933
    move-result-object v5

    .line 934
    iget-object v4, v2, La/elo0;->e:Ljava/lang/String;

    .line 935
    .line 936
    invoke-static {}, La/g1t0;->h()La/y9q0;

    .line 937
    .line 938
    .line 939
    move-result-object v24

    .line 940
    invoke-virtual/range {v41 .. v41}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite60-0d7_KjU()J

    .line 941
    .line 942
    .line 943
    move-result-wide v9

    .line 944
    new-instance v1, La/f2q0;

    .line 945
    .line 946
    const/4 v11, 0x3

    .line 947
    invoke-direct {v1, v11}, La/f2q0;-><init>(I)V

    .line 948
    .line 949
    .line 950
    const/16 v27, 0x6180

    .line 951
    .line 952
    const v28, 0x1abf8

    .line 953
    .line 954
    .line 955
    const/4 v8, 0x0

    .line 956
    move v13, v7

    .line 957
    move-wide v6, v9

    .line 958
    const-wide/16 v9, 0x0

    .line 959
    .line 960
    const/4 v11, 0x0

    .line 961
    const/4 v12, 0x0

    .line 962
    move/from16 v33, v13

    .line 963
    .line 964
    const/4 v13, 0x0

    .line 965
    const-wide/16 v14, 0x0

    .line 966
    .line 967
    const-wide/16 v17, 0x0

    .line 968
    .line 969
    const/16 v19, 0x2

    .line 970
    .line 971
    const/16 v20, 0x0

    .line 972
    .line 973
    const/16 v21, 0x1

    .line 974
    .line 975
    const/16 v22, 0x0

    .line 976
    .line 977
    const/16 v23, 0x0

    .line 978
    .line 979
    const/16 v26, 0x0

    .line 980
    .line 981
    move-object/from16 v25, p3

    .line 982
    .line 983
    move-object/from16 v16, v1

    .line 984
    .line 985
    move/from16 v1, v33

    .line 986
    .line 987
    invoke-static/range {v4 .. v28}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 988
    .line 989
    .line 990
    move-object/from16 v8, v25

    .line 991
    .line 992
    invoke-virtual {v8, v1}, La/fet;->r(Z)V

    .line 993
    .line 994
    .line 995
    goto :goto_13

    .line 996
    :cond_14
    move v1, v7

    .line 997
    const v3, -0x679b2b19

    .line 998
    .line 999
    .line 1000
    invoke-virtual {v8, v3}, La/fet;->e0(I)V

    .line 1001
    .line 1002
    .line 1003
    invoke-virtual {v8, v1}, La/fet;->r(Z)V

    .line 1004
    .line 1005
    .line 1006
    :goto_13
    invoke-virtual {v8, v0}, La/fet;->r(Z)V

    .line 1007
    .line 1008
    .line 1009
    goto :goto_14

    .line 1010
    :cond_15
    invoke-virtual {v8}, La/fet;->X()V

    .line 1011
    .line 1012
    .line 1013
    :goto_14
    invoke-virtual {v8}, La/fet;->u()La/yfe0;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v6

    .line 1017
    if-eqz v6, :cond_16

    .line 1018
    .line 1019
    new-instance v0, La/r93;

    .line 1020
    .line 1021
    const/16 v5, 0xf

    .line 1022
    .line 1023
    move-object/from16 v1, p0

    .line 1024
    .line 1025
    move-object/from16 v3, p2

    .line 1026
    .line 1027
    move/from16 v4, p4

    .line 1028
    .line 1029
    invoke-direct/range {v0 .. v5}, La/r93;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 1030
    .line 1031
    .line 1032
    iput-object v0, v6, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 1033
    .line 1034
    :cond_16
    return-void
.end method
