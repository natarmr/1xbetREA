.class public abstract La/gzy;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/zfn;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/pcy;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/pcy;-><init>(B)V

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
    sput-object v1, La/gzy;->a:La/zfn;

    .line 15
    .line 16
    return-void
.end method

.method public static final a(La/mm40;La/hzy;Lkotlin/jvm/functions/Function1;La/fet;I)V
    .locals 45

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move-object/from16 v8, p3

    .line 6
    .line 7
    move/from16 v0, p4

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const v1, 0x33a2fb76

    .line 16
    .line 17
    .line 18
    invoke-virtual {v8, v1}, La/fet;->g0(I)La/fet;

    .line 19
    .line 20
    .line 21
    or-int/lit8 v1, v0, 0x6

    .line 22
    .line 23
    invoke-virtual {v8, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    const/16 v5, 0x20

    .line 28
    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    move v4, v5

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/16 v4, 0x10

    .line 34
    .line 35
    :goto_0
    or-int/2addr v1, v4

    .line 36
    and-int/lit16 v4, v0, 0x180

    .line 37
    .line 38
    const/16 v6, 0x100

    .line 39
    .line 40
    if-nez v4, :cond_2

    .line 41
    .line 42
    invoke-virtual {v8, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    move v4, v6

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    const/16 v4, 0x80

    .line 51
    .line 52
    :goto_1
    or-int/2addr v1, v4

    .line 53
    :cond_2
    and-int/lit16 v4, v1, 0x93

    .line 54
    .line 55
    const/16 v7, 0x92

    .line 56
    .line 57
    const/4 v10, 0x0

    .line 58
    const/4 v11, 0x1

    .line 59
    if-eq v4, v7, :cond_3

    .line 60
    .line 61
    move v4, v11

    .line 62
    goto :goto_2

    .line 63
    :cond_3
    move v4, v10

    .line 64
    :goto_2
    and-int/lit8 v7, v1, 0x1

    .line 65
    .line 66
    invoke-virtual {v8, v7, v4}, La/fet;->U(IZ)Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-eqz v4, :cond_15

    .line 71
    .line 72
    sget-object v4, La/gzy;->a:La/zfn;

    .line 73
    .line 74
    invoke-virtual {v8, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    check-cast v4, La/k6z;

    .line 79
    .line 80
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-eqz v4, :cond_5

    .line 85
    .line 86
    if-ne v4, v11, :cond_4

    .line 87
    .line 88
    const/16 v26, 0x2

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_5
    move/from16 v26, v11

    .line 96
    .line 97
    :goto_3
    and-int/lit16 v4, v1, 0x380

    .line 98
    .line 99
    if-ne v4, v6, :cond_6

    .line 100
    .line 101
    move v4, v11

    .line 102
    goto :goto_4

    .line 103
    :cond_6
    move v4, v10

    .line 104
    :goto_4
    and-int/lit8 v1, v1, 0x70

    .line 105
    .line 106
    if-eq v1, v5, :cond_7

    .line 107
    .line 108
    move v1, v10

    .line 109
    goto :goto_5

    .line 110
    :cond_7
    move v1, v11

    .line 111
    :goto_5
    or-int/2addr v1, v4

    .line 112
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    if-nez v1, :cond_8

    .line 117
    .line 118
    sget-object v1, La/ukd;->a:La/cl5;

    .line 119
    .line 120
    if-ne v4, v1, :cond_9

    .line 121
    .line 122
    :cond_8
    new-instance v4, La/wqv;

    .line 123
    .line 124
    const/16 v1, 0x18

    .line 125
    .line 126
    invoke-direct {v4, v3, v2, v1}, La/wqv;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v8, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    :cond_9
    move-object/from16 v18, v4

    .line 133
    .line 134
    check-cast v18, Lkotlin/jvm/functions/Function0;

    .line 135
    .line 136
    const/16 v19, 0x1c

    .line 137
    .line 138
    sget-object v13, La/jm40;->b:La/jm40;

    .line 139
    .line 140
    const/4 v14, 0x0

    .line 141
    const/4 v15, 0x0

    .line 142
    const/16 v16, 0x0

    .line 143
    .line 144
    const/16 v17, 0x0

    .line 145
    .line 146
    invoke-static/range {v13 .. v19}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    sget-object v14, La/gqw0;->a:La/zx7;

    .line 151
    .line 152
    invoke-static {v14, v10}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    iget-wide v5, v8, La/fet;->T:J

    .line 157
    .line 158
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    invoke-virtual {v8}, La/fet;->m()La/bh90;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    invoke-static {v8, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 171
    .line 172
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v8}, La/fet;->i0()V

    .line 176
    .line 177
    .line 178
    iget-boolean v7, v8, La/fet;->S:Z

    .line 179
    .line 180
    sget-object v15, La/e7z;->u1:La/pcy;

    .line 181
    .line 182
    if-eqz v7, :cond_a

    .line 183
    .line 184
    invoke-virtual {v8, v15}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 185
    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_a
    invoke-virtual {v8}, La/fet;->r0()V

    .line 189
    .line 190
    .line 191
    :goto_6
    sget-object v7, La/gqw0;->x:La/shd;

    .line 192
    .line 193
    invoke-static {v8, v4, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 194
    .line 195
    .line 196
    sget-object v4, La/gqw0;->w:La/shd;

    .line 197
    .line 198
    invoke-static {v8, v6, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 199
    .line 200
    .line 201
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    sget-object v6, La/gqw0;->y:La/shd;

    .line 206
    .line 207
    invoke-static {v8, v5, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 208
    .line 209
    .line 210
    invoke-static {v8}, La/jpm0;->n(La/fet;)V

    .line 211
    .line 212
    .line 213
    sget-object v5, La/gqw0;->v:La/shd;

    .line 214
    .line 215
    invoke-static {v8, v1, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 216
    .line 217
    .line 218
    const/high16 v1, 0x3f800000    # 1.0f

    .line 219
    .line 220
    move-object v9, v5

    .line 221
    invoke-static {v13, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 222
    .line 223
    .line 224
    move-result-object v5

    .line 225
    const/16 v8, 0x36

    .line 226
    .line 227
    move-object/from16 v16, v9

    .line 228
    .line 229
    const/4 v9, 0x4

    .line 230
    move-object/from16 v17, v4

    .line 231
    .line 232
    sget-object v4, La/zfi0;->a:La/zfi0;

    .line 233
    .line 234
    move-object/from16 v18, v6

    .line 235
    .line 236
    const/4 v6, 0x0

    .line 237
    move-object v12, v7

    .line 238
    move-object/from16 v33, v16

    .line 239
    .line 240
    move-object/from16 v11, v17

    .line 241
    .line 242
    move-object/from16 v1, v18

    .line 243
    .line 244
    move-object/from16 v7, p3

    .line 245
    .line 246
    invoke-static/range {v4 .. v9}, La/mbc;->o(La/bgi0;La/mm40;ZLa/fet;II)V

    .line 247
    .line 248
    .line 249
    sget-object v4, La/qmk;->a:La/zcl;

    .line 250
    .line 251
    const/4 v8, 0x0

    .line 252
    const/16 v9, 0xd

    .line 253
    .line 254
    const/4 v5, 0x0

    .line 255
    const/high16 v6, 0x41000000    # 8.0f

    .line 256
    .line 257
    const/4 v7, 0x0

    .line 258
    move-object v4, v13

    .line 259
    move-object/from16 v13, p3

    .line 260
    .line 261
    invoke-static/range {v4 .. v9}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 262
    .line 263
    .line 264
    move-result-object v5

    .line 265
    sget-object v6, La/uc9;->c:La/mw3;

    .line 266
    .line 267
    sget-object v7, La/gqw0;->m:La/xx7;

    .line 268
    .line 269
    invoke-static {v6, v7, v13, v10}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 270
    .line 271
    .line 272
    move-result-object v6

    .line 273
    iget-wide v7, v13, La/fet;->T:J

    .line 274
    .line 275
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 276
    .line 277
    .line 278
    move-result v7

    .line 279
    invoke-virtual {v13}, La/fet;->m()La/bh90;

    .line 280
    .line 281
    .line 282
    move-result-object v8

    .line 283
    invoke-static {v13, v5}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 284
    .line 285
    .line 286
    move-result-object v5

    .line 287
    invoke-virtual {v13}, La/fet;->i0()V

    .line 288
    .line 289
    .line 290
    iget-boolean v9, v13, La/fet;->S:Z

    .line 291
    .line 292
    if-eqz v9, :cond_b

    .line 293
    .line 294
    invoke-virtual {v13, v15}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 295
    .line 296
    .line 297
    goto :goto_7

    .line 298
    :cond_b
    invoke-virtual {v13}, La/fet;->r0()V

    .line 299
    .line 300
    .line 301
    :goto_7
    invoke-static {v13, v6, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 302
    .line 303
    .line 304
    invoke-static {v13, v8, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 305
    .line 306
    .line 307
    invoke-static {v7, v13, v1, v13}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 308
    .line 309
    .line 310
    move-object/from16 v9, v33

    .line 311
    .line 312
    invoke-static {v13, v5, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 313
    .line 314
    .line 315
    const/high16 v5, 0x3f800000    # 1.0f

    .line 316
    .line 317
    invoke-static {v4, v5}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 318
    .line 319
    .line 320
    move-result-object v6

    .line 321
    invoke-static {v14, v10}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 322
    .line 323
    .line 324
    move-result-object v5

    .line 325
    iget-wide v7, v13, La/fet;->T:J

    .line 326
    .line 327
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 328
    .line 329
    .line 330
    move-result v7

    .line 331
    invoke-virtual {v13}, La/fet;->m()La/bh90;

    .line 332
    .line 333
    .line 334
    move-result-object v8

    .line 335
    invoke-static {v13, v6}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 336
    .line 337
    .line 338
    move-result-object v6

    .line 339
    invoke-virtual {v13}, La/fet;->i0()V

    .line 340
    .line 341
    .line 342
    iget-boolean v14, v13, La/fet;->S:Z

    .line 343
    .line 344
    if-eqz v14, :cond_c

    .line 345
    .line 346
    invoke-virtual {v13, v15}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 347
    .line 348
    .line 349
    goto :goto_8

    .line 350
    :cond_c
    invoke-virtual {v13}, La/fet;->r0()V

    .line 351
    .line 352
    .line 353
    :goto_8
    invoke-static {v13, v5, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 354
    .line 355
    .line 356
    invoke-static {v13, v8, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 357
    .line 358
    .line 359
    invoke-static {v7, v13, v1, v13}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 360
    .line 361
    .line 362
    invoke-static {v13, v6, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 363
    .line 364
    .line 365
    sget-object v5, La/gqw0;->d:La/zx7;

    .line 366
    .line 367
    sget-object v6, La/jr8;->a:La/jr8;

    .line 368
    .line 369
    invoke-virtual {v6, v4, v5}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 370
    .line 371
    .line 372
    move-result-object v5

    .line 373
    const/high16 v7, 0x42000000    # 32.0f

    .line 374
    .line 375
    invoke-static {v5, v7}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 376
    .line 377
    .line 378
    move-result-object v5

    .line 379
    const/high16 v8, 0x40000000    # 2.0f

    .line 380
    .line 381
    invoke-static {v5, v8}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 382
    .line 383
    .line 384
    move-result-object v5

    .line 385
    iget-object v14, v2, La/hzy;->h:La/ikv0;

    .line 386
    .line 387
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    const/16 v8, 0x12

    .line 391
    .line 392
    if-nez v14, :cond_d

    .line 393
    .line 394
    move v7, v10

    .line 395
    goto :goto_9

    .line 396
    :cond_d
    new-instance v7, La/ij90;

    .line 397
    .line 398
    const/4 v10, 0x1

    .line 399
    invoke-direct {v7, v10, v14, v8}, La/ij90;-><init>(ZLjava/lang/Object;B)V

    .line 400
    .line 401
    .line 402
    invoke-static {v5, v7}, La/rq8;->L(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 403
    .line 404
    .line 405
    move-result-object v5

    .line 406
    const/4 v7, 0x0

    .line 407
    :goto_9
    invoke-static {v7, v13, v5}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 408
    .line 409
    .line 410
    sget-object v5, La/gqw0;->k:La/yx7;

    .line 411
    .line 412
    sget-object v10, La/uc9;->g:La/nw3;

    .line 413
    .line 414
    const/16 v14, 0x36

    .line 415
    .line 416
    invoke-static {v10, v5, v13, v14}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 417
    .line 418
    .line 419
    move-result-object v5

    .line 420
    iget-wide v7, v13, La/fet;->T:J

    .line 421
    .line 422
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 423
    .line 424
    .line 425
    move-result v7

    .line 426
    invoke-virtual {v13}, La/fet;->m()La/bh90;

    .line 427
    .line 428
    .line 429
    move-result-object v8

    .line 430
    invoke-static {v13, v4}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 431
    .line 432
    .line 433
    move-result-object v14

    .line 434
    invoke-virtual {v13}, La/fet;->i0()V

    .line 435
    .line 436
    .line 437
    iget-boolean v10, v13, La/fet;->S:Z

    .line 438
    .line 439
    if-eqz v10, :cond_e

    .line 440
    .line 441
    invoke-virtual {v13, v15}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 442
    .line 443
    .line 444
    goto :goto_a

    .line 445
    :cond_e
    invoke-virtual {v13}, La/fet;->r0()V

    .line 446
    .line 447
    .line 448
    :goto_a
    invoke-static {v13, v5, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 449
    .line 450
    .line 451
    invoke-static {v13, v8, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 452
    .line 453
    .line 454
    invoke-static {v7, v13, v1, v13}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 455
    .line 456
    .line 457
    invoke-static {v13, v14, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 458
    .line 459
    .line 460
    const/high16 v5, 0x3f800000    # 1.0f

    .line 461
    .line 462
    float-to-double v7, v5

    .line 463
    const-wide/16 v35, 0x0

    .line 464
    .line 465
    cmpl-double v1, v7, v35

    .line 466
    .line 467
    const-string v37, "invalid weight; must be greater than zero"

    .line 468
    .line 469
    if-lez v1, :cond_f

    .line 470
    .line 471
    goto :goto_b

    .line 472
    :cond_f
    invoke-static/range {v37 .. v37}, La/vcx;->a(Ljava/lang/String;)V

    .line 473
    .line 474
    .line 475
    :goto_b
    new-instance v1, La/x7z;

    .line 476
    .line 477
    const v38, 0x7f7fffff    # Float.MAX_VALUE

    .line 478
    .line 479
    .line 480
    cmpl-float v7, v5, v38

    .line 481
    .line 482
    if-lez v7, :cond_10

    .line 483
    .line 484
    move/from16 v5, v38

    .line 485
    .line 486
    :goto_c
    const/4 v10, 0x1

    .line 487
    goto :goto_d

    .line 488
    :cond_10
    const/high16 v5, 0x3f800000    # 1.0f

    .line 489
    .line 490
    goto :goto_c

    .line 491
    :goto_d
    invoke-direct {v1, v5, v10}, La/x7z;-><init>(FZ)V

    .line 492
    .line 493
    .line 494
    const/high16 v5, 0x41000000    # 8.0f

    .line 495
    .line 496
    const/4 v7, 0x0

    .line 497
    const/4 v8, 0x2

    .line 498
    invoke-static {v1, v5, v7, v8}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 499
    .line 500
    .line 501
    move-result-object v1

    .line 502
    move-object v8, v4

    .line 503
    iget-object v4, v2, La/hzy;->b:Ljava/lang/String;

    .line 504
    .line 505
    invoke-static {}, La/g1t0;->d()La/y9q0;

    .line 506
    .line 507
    .line 508
    move-result-object v13

    .line 509
    const/16 v30, 0x0

    .line 510
    .line 511
    const v31, 0xfeffff

    .line 512
    .line 513
    .line 514
    const-wide/16 v14, 0x0

    .line 515
    .line 516
    const-wide/16 v16, 0x0

    .line 517
    .line 518
    const/16 v18, 0x0

    .line 519
    .line 520
    const/16 v19, 0x0

    .line 521
    .line 522
    const/16 v20, 0x0

    .line 523
    .line 524
    const-wide/16 v21, 0x0

    .line 525
    .line 526
    const/16 v23, 0x0

    .line 527
    .line 528
    const/16 v24, 0x0

    .line 529
    .line 530
    const/16 v25, 0x0

    .line 531
    .line 532
    const-wide/16 v27, 0x0

    .line 533
    .line 534
    const/16 v29, 0x0

    .line 535
    .line 536
    move-object/from16 v9, p3

    .line 537
    .line 538
    invoke-static/range {v13 .. v31}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 539
    .line 540
    .line 541
    move-result-object v24

    .line 542
    move/from16 v29, v26

    .line 543
    .line 544
    sget-object v11, La/zaq0;->b:La/zfn;

    .line 545
    .line 546
    invoke-virtual {v9, v11}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v12

    .line 550
    check-cast v12, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 551
    .line 552
    invoke-virtual {v12}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 553
    .line 554
    .line 555
    move-result-wide v12

    .line 556
    new-instance v14, La/f2q0;

    .line 557
    .line 558
    const/4 v15, 0x2

    .line 559
    invoke-direct {v14, v15}, La/f2q0;-><init>(I)V

    .line 560
    .line 561
    .line 562
    const/16 v27, 0x6180

    .line 563
    .line 564
    const v28, 0x1abf8

    .line 565
    .line 566
    .line 567
    move-object/from16 v16, v8

    .line 568
    .line 569
    const/4 v8, 0x0

    .line 570
    move/from16 v32, v10

    .line 571
    .line 572
    const-wide/16 v9, 0x0

    .line 573
    .line 574
    move-object/from16 v17, v11

    .line 575
    .line 576
    const/4 v11, 0x0

    .line 577
    move-object/from16 v18, v6

    .line 578
    .line 579
    move-wide/from16 v43, v12

    .line 580
    .line 581
    move v13, v7

    .line 582
    move-wide/from16 v6, v43

    .line 583
    .line 584
    const/4 v12, 0x0

    .line 585
    move/from16 v19, v13

    .line 586
    .line 587
    const/4 v13, 0x0

    .line 588
    move/from16 v20, v15

    .line 589
    .line 590
    move-object/from16 v21, v16

    .line 591
    .line 592
    move-object/from16 v16, v14

    .line 593
    .line 594
    const-wide/16 v14, 0x0

    .line 595
    .line 596
    move-object/from16 v22, v17

    .line 597
    .line 598
    move-object/from16 v23, v18

    .line 599
    .line 600
    const-wide/16 v17, 0x0

    .line 601
    .line 602
    move/from16 v25, v19

    .line 603
    .line 604
    const/16 v19, 0x2

    .line 605
    .line 606
    move/from16 v26, v20

    .line 607
    .line 608
    const/16 v20, 0x0

    .line 609
    .line 610
    move-object/from16 v30, v21

    .line 611
    .line 612
    const/16 v21, 0x2

    .line 613
    .line 614
    move-object/from16 v31, v22

    .line 615
    .line 616
    const/16 v22, 0x0

    .line 617
    .line 618
    move-object/from16 v39, v23

    .line 619
    .line 620
    const/16 v23, 0x0

    .line 621
    .line 622
    move/from16 v40, v26

    .line 623
    .line 624
    const/16 v26, 0x0

    .line 625
    .line 626
    move-object/from16 v25, p3

    .line 627
    .line 628
    move-object v5, v1

    .line 629
    move-object/from16 v0, v30

    .line 630
    .line 631
    move-object/from16 v1, v31

    .line 632
    .line 633
    move-object/from16 v42, v39

    .line 634
    .line 635
    move/from16 v3, v40

    .line 636
    .line 637
    invoke-static/range {v4 .. v28}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 638
    .line 639
    .line 640
    iget-object v4, v2, La/hzy;->a:La/odp0;

    .line 641
    .line 642
    iget-object v5, v4, La/odp0;->a:La/d5a0;

    .line 643
    .line 644
    sget-object v6, La/w6n;->h:La/w6n;

    .line 645
    .line 646
    const/16 v9, 0x180

    .line 647
    .line 648
    const/16 v10, 0x9

    .line 649
    .line 650
    const/4 v4, 0x0

    .line 651
    const/4 v7, 0x0

    .line 652
    move-object/from16 v8, p3

    .line 653
    .line 654
    invoke-static/range {v4 .. v10}, La/x2x;->t(La/mm40;La/i5a0;La/w6n;Lkotlin/jvm/functions/Function2;La/fet;II)V

    .line 655
    .line 656
    .line 657
    move-object/from16 v30, v6

    .line 658
    .line 659
    const/high16 v4, 0x42400000    # 48.0f

    .line 660
    .line 661
    invoke-static {v0, v4}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 662
    .line 663
    .line 664
    move-result-object v4

    .line 665
    const/high16 v5, 0x40800000    # 4.0f

    .line 666
    .line 667
    const/4 v13, 0x0

    .line 668
    invoke-static {v4, v5, v13, v3}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 669
    .line 670
    .line 671
    move-result-object v5

    .line 672
    iget-object v4, v2, La/hzy;->f:Ljava/lang/String;

    .line 673
    .line 674
    invoke-static {}, La/g1t0;->m()La/y9q0;

    .line 675
    .line 676
    .line 677
    move-result-object v24

    .line 678
    invoke-virtual {v8, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 679
    .line 680
    .line 681
    move-result-object v6

    .line 682
    check-cast v6, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 683
    .line 684
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 685
    .line 686
    .line 687
    move-result-wide v6

    .line 688
    sget-wide v10, La/qmk;->p:J

    .line 689
    .line 690
    sget-wide v12, La/qmk;->q:J

    .line 691
    .line 692
    sget-wide v14, La/qmk;->n:J

    .line 693
    .line 694
    new-instance v9, La/n05;

    .line 695
    .line 696
    invoke-direct/range {v9 .. v15}, La/n05;-><init>(JJJ)V

    .line 697
    .line 698
    .line 699
    new-instance v10, La/f2q0;

    .line 700
    .line 701
    const/4 v11, 0x3

    .line 702
    invoke-direct {v10, v11}, La/f2q0;-><init>(I)V

    .line 703
    .line 704
    .line 705
    const/16 v27, 0x6000

    .line 706
    .line 707
    const v28, 0x1bbf0

    .line 708
    .line 709
    .line 710
    move-object v8, v9

    .line 711
    move-object/from16 v16, v10

    .line 712
    .line 713
    const-wide/16 v9, 0x0

    .line 714
    .line 715
    move v12, v11

    .line 716
    const/4 v11, 0x0

    .line 717
    move v13, v12

    .line 718
    const/4 v12, 0x0

    .line 719
    move v14, v13

    .line 720
    const/4 v13, 0x0

    .line 721
    move/from16 v17, v14

    .line 722
    .line 723
    const-wide/16 v14, 0x0

    .line 724
    .line 725
    move/from16 v19, v17

    .line 726
    .line 727
    const-wide/16 v17, 0x0

    .line 728
    .line 729
    move/from16 v20, v19

    .line 730
    .line 731
    const/16 v19, 0x0

    .line 732
    .line 733
    move/from16 v21, v20

    .line 734
    .line 735
    const/16 v20, 0x0

    .line 736
    .line 737
    move/from16 v22, v21

    .line 738
    .line 739
    const/16 v21, 0x1

    .line 740
    .line 741
    move/from16 v23, v22

    .line 742
    .line 743
    const/16 v22, 0x0

    .line 744
    .line 745
    move/from16 v25, v23

    .line 746
    .line 747
    const/16 v23, 0x0

    .line 748
    .line 749
    move-object/from16 v25, p3

    .line 750
    .line 751
    invoke-static/range {v4 .. v28}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 752
    .line 753
    .line 754
    iget-object v4, v2, La/hzy;->c:La/odp0;

    .line 755
    .line 756
    iget-object v5, v4, La/odp0;->a:La/d5a0;

    .line 757
    .line 758
    const/16 v9, 0x180

    .line 759
    .line 760
    const/16 v10, 0x9

    .line 761
    .line 762
    const/4 v4, 0x0

    .line 763
    const/4 v7, 0x0

    .line 764
    move-object/from16 v8, p3

    .line 765
    .line 766
    move-object/from16 v6, v30

    .line 767
    .line 768
    invoke-static/range {v4 .. v10}, La/x2x;->t(La/mm40;La/i5a0;La/w6n;Lkotlin/jvm/functions/Function2;La/fet;II)V

    .line 769
    .line 770
    .line 771
    const/high16 v5, 0x3f800000    # 1.0f

    .line 772
    .line 773
    float-to-double v6, v5

    .line 774
    cmpl-double v4, v6, v35

    .line 775
    .line 776
    if-lez v4, :cond_11

    .line 777
    .line 778
    goto :goto_e

    .line 779
    :cond_11
    invoke-static/range {v37 .. v37}, La/vcx;->a(Ljava/lang/String;)V

    .line 780
    .line 781
    .line 782
    :goto_e
    new-instance v4, La/x7z;

    .line 783
    .line 784
    cmpl-float v6, v5, v38

    .line 785
    .line 786
    if-lez v6, :cond_12

    .line 787
    .line 788
    move/from16 v5, v38

    .line 789
    .line 790
    :goto_f
    const/4 v6, 0x1

    .line 791
    goto :goto_10

    .line 792
    :cond_12
    const/high16 v5, 0x3f800000    # 1.0f

    .line 793
    .line 794
    goto :goto_f

    .line 795
    :goto_10
    invoke-direct {v4, v5, v6}, La/x7z;-><init>(FZ)V

    .line 796
    .line 797
    .line 798
    const/high16 v5, 0x41000000    # 8.0f

    .line 799
    .line 800
    const/4 v13, 0x0

    .line 801
    invoke-static {v4, v5, v13, v3}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 802
    .line 803
    .line 804
    move-result-object v4

    .line 805
    move-object v5, v4

    .line 806
    iget-object v4, v2, La/hzy;->d:Ljava/lang/String;

    .line 807
    .line 808
    invoke-static {}, La/g1t0;->d()La/y9q0;

    .line 809
    .line 810
    .line 811
    move-result-object v13

    .line 812
    const/16 v30, 0x0

    .line 813
    .line 814
    const v31, 0xfeffff

    .line 815
    .line 816
    .line 817
    const-wide/16 v14, 0x0

    .line 818
    .line 819
    const-wide/16 v16, 0x0

    .line 820
    .line 821
    const/16 v18, 0x0

    .line 822
    .line 823
    const/16 v19, 0x0

    .line 824
    .line 825
    const/16 v20, 0x0

    .line 826
    .line 827
    const-wide/16 v21, 0x0

    .line 828
    .line 829
    const/16 v23, 0x0

    .line 830
    .line 831
    const/16 v24, 0x0

    .line 832
    .line 833
    const/16 v25, 0x0

    .line 834
    .line 835
    const-wide/16 v27, 0x0

    .line 836
    .line 837
    move/from16 v26, v29

    .line 838
    .line 839
    const/16 v29, 0x0

    .line 840
    .line 841
    invoke-static/range {v13 .. v31}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 842
    .line 843
    .line 844
    move-result-object v24

    .line 845
    invoke-virtual {v8, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 846
    .line 847
    .line 848
    move-result-object v7

    .line 849
    check-cast v7, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 850
    .line 851
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 852
    .line 853
    .line 854
    move-result-wide v9

    .line 855
    new-instance v7, La/f2q0;

    .line 856
    .line 857
    invoke-direct {v7, v6}, La/f2q0;-><init>(I)V

    .line 858
    .line 859
    .line 860
    const/16 v27, 0x6180

    .line 861
    .line 862
    const v28, 0x1abf8

    .line 863
    .line 864
    .line 865
    const/4 v8, 0x0

    .line 866
    move/from16 v41, v6

    .line 867
    .line 868
    move-object/from16 v16, v7

    .line 869
    .line 870
    move-wide v6, v9

    .line 871
    const-wide/16 v9, 0x0

    .line 872
    .line 873
    const/4 v11, 0x0

    .line 874
    const/4 v12, 0x0

    .line 875
    const/4 v13, 0x0

    .line 876
    const-wide/16 v17, 0x0

    .line 877
    .line 878
    const/16 v19, 0x2

    .line 879
    .line 880
    const/16 v20, 0x0

    .line 881
    .line 882
    const/16 v21, 0x2

    .line 883
    .line 884
    const/16 v22, 0x0

    .line 885
    .line 886
    const/16 v26, 0x0

    .line 887
    .line 888
    move-object/from16 v25, p3

    .line 889
    .line 890
    move/from16 v3, v41

    .line 891
    .line 892
    invoke-static/range {v4 .. v28}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 893
    .line 894
    .line 895
    move-object/from16 v8, v25

    .line 896
    .line 897
    invoke-virtual {v8, v3}, La/fet;->r(Z)V

    .line 898
    .line 899
    .line 900
    sget-object v4, La/gqw0;->f:La/zx7;

    .line 901
    .line 902
    move-object/from16 v5, v42

    .line 903
    .line 904
    invoke-virtual {v5, v0, v4}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 905
    .line 906
    .line 907
    move-result-object v4

    .line 908
    const/high16 v5, 0x42000000    # 32.0f

    .line 909
    .line 910
    invoke-static {v4, v5}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 911
    .line 912
    .line 913
    move-result-object v4

    .line 914
    const/high16 v5, 0x40000000    # 2.0f

    .line 915
    .line 916
    invoke-static {v4, v5}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 917
    .line 918
    .line 919
    move-result-object v4

    .line 920
    iget-object v5, v2, La/hzy;->i:La/ikv0;

    .line 921
    .line 922
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 923
    .line 924
    .line 925
    if-nez v5, :cond_13

    .line 926
    .line 927
    const/4 v7, 0x0

    .line 928
    goto :goto_11

    .line 929
    :cond_13
    new-instance v6, La/ij90;

    .line 930
    .line 931
    const/4 v7, 0x0

    .line 932
    const/16 v10, 0x12

    .line 933
    .line 934
    invoke-direct {v6, v7, v5, v10}, La/ij90;-><init>(ZLjava/lang/Object;B)V

    .line 935
    .line 936
    .line 937
    invoke-static {v4, v6}, La/rq8;->L(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 938
    .line 939
    .line 940
    move-result-object v4

    .line 941
    :goto_11
    invoke-static {v7, v8, v4}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 942
    .line 943
    .line 944
    invoke-virtual {v8, v3}, La/fet;->r(Z)V

    .line 945
    .line 946
    .line 947
    iget-object v4, v2, La/hzy;->e:Ljava/lang/String;

    .line 948
    .line 949
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 950
    .line 951
    .line 952
    move-result v4

    .line 953
    if-lez v4, :cond_14

    .line 954
    .line 955
    const v4, -0x2e6ad4f6

    .line 956
    .line 957
    .line 958
    invoke-virtual {v8, v4}, La/fet;->e0(I)V

    .line 959
    .line 960
    .line 961
    const/high16 v5, 0x3f800000    # 1.0f

    .line 962
    .line 963
    invoke-static {v0, v5}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 964
    .line 965
    .line 966
    move-result-object v9

    .line 967
    const/4 v13, 0x0

    .line 968
    const/16 v14, 0xd

    .line 969
    .line 970
    const/4 v10, 0x0

    .line 971
    const/high16 v11, 0x40000000    # 2.0f

    .line 972
    .line 973
    const/4 v12, 0x0

    .line 974
    invoke-static/range {v9 .. v14}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 975
    .line 976
    .line 977
    move-result-object v4

    .line 978
    const/high16 v5, 0x41000000    # 8.0f

    .line 979
    .line 980
    const/4 v13, 0x0

    .line 981
    const/4 v15, 0x2

    .line 982
    invoke-static {v4, v5, v13, v15}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 983
    .line 984
    .line 985
    move-result-object v5

    .line 986
    iget-object v4, v2, La/hzy;->e:Ljava/lang/String;

    .line 987
    .line 988
    invoke-static {}, La/g1t0;->h()La/y9q0;

    .line 989
    .line 990
    .line 991
    move-result-object v24

    .line 992
    invoke-virtual {v8, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 993
    .line 994
    .line 995
    move-result-object v1

    .line 996
    check-cast v1, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 997
    .line 998
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 999
    .line 1000
    .line 1001
    move-result-wide v9

    .line 1002
    new-instance v1, La/f2q0;

    .line 1003
    .line 1004
    const/4 v12, 0x3

    .line 1005
    invoke-direct {v1, v12}, La/f2q0;-><init>(I)V

    .line 1006
    .line 1007
    .line 1008
    const/16 v27, 0x6180

    .line 1009
    .line 1010
    const v28, 0x1abf8

    .line 1011
    .line 1012
    .line 1013
    const/4 v8, 0x0

    .line 1014
    move/from16 v34, v7

    .line 1015
    .line 1016
    move-wide v6, v9

    .line 1017
    const-wide/16 v9, 0x0

    .line 1018
    .line 1019
    const/4 v11, 0x0

    .line 1020
    const/4 v12, 0x0

    .line 1021
    const/4 v13, 0x0

    .line 1022
    const-wide/16 v14, 0x0

    .line 1023
    .line 1024
    const-wide/16 v17, 0x0

    .line 1025
    .line 1026
    const/16 v19, 0x2

    .line 1027
    .line 1028
    const/16 v20, 0x0

    .line 1029
    .line 1030
    const/16 v21, 0x1

    .line 1031
    .line 1032
    const/16 v22, 0x0

    .line 1033
    .line 1034
    const/16 v23, 0x0

    .line 1035
    .line 1036
    const/16 v26, 0x0

    .line 1037
    .line 1038
    move-object/from16 v25, p3

    .line 1039
    .line 1040
    move-object/from16 v16, v1

    .line 1041
    .line 1042
    move/from16 v1, v34

    .line 1043
    .line 1044
    invoke-static/range {v4 .. v28}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 1045
    .line 1046
    .line 1047
    move-object/from16 v8, v25

    .line 1048
    .line 1049
    invoke-virtual {v8, v1}, La/fet;->r(Z)V

    .line 1050
    .line 1051
    .line 1052
    goto :goto_12

    .line 1053
    :cond_14
    move v1, v7

    .line 1054
    const v4, -0x2e632438

    .line 1055
    .line 1056
    .line 1057
    invoke-virtual {v8, v4}, La/fet;->e0(I)V

    .line 1058
    .line 1059
    .line 1060
    invoke-virtual {v8, v1}, La/fet;->r(Z)V

    .line 1061
    .line 1062
    .line 1063
    :goto_12
    invoke-virtual {v8, v3}, La/fet;->r(Z)V

    .line 1064
    .line 1065
    .line 1066
    invoke-virtual {v8, v3}, La/fet;->r(Z)V

    .line 1067
    .line 1068
    .line 1069
    move-object v1, v0

    .line 1070
    goto :goto_13

    .line 1071
    :cond_15
    invoke-virtual {v8}, La/fet;->X()V

    .line 1072
    .line 1073
    .line 1074
    move-object/from16 v1, p0

    .line 1075
    .line 1076
    :goto_13
    invoke-virtual {v8}, La/fet;->u()La/yfe0;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v6

    .line 1080
    if-eqz v6, :cond_16

    .line 1081
    .line 1082
    new-instance v0, La/r93;

    .line 1083
    .line 1084
    const/16 v5, 0x9

    .line 1085
    .line 1086
    move-object/from16 v3, p2

    .line 1087
    .line 1088
    move/from16 v4, p4

    .line 1089
    .line 1090
    invoke-direct/range {v0 .. v5}, La/r93;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 1091
    .line 1092
    .line 1093
    iput-object v0, v6, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 1094
    .line 1095
    :cond_16
    return-void
.end method
