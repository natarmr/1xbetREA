.class public abstract La/ljg0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/zsf;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/zsf;

    .line 2
    .line 3
    const v1, 0x3fb33333    # 1.4f

    .line 4
    .line 5
    .line 6
    const/high16 v2, 0x3f800000    # 1.0f

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-direct {v0, v3, v1, v2, v2}, La/zsf;-><init>(FFFF)V

    .line 10
    .line 11
    .line 12
    sput-object v0, La/ljg0;->a:La/zsf;

    .line 13
    .line 14
    return-void
.end method

.method public static final a(La/mjg0;FLa/fet;I)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v8, p1

    .line 4
    .line 5
    move-object/from16 v9, p2

    .line 6
    .line 7
    move/from16 v10, p3

    .line 8
    .line 9
    const v0, 0x70edb16b

    .line 10
    .line 11
    .line 12
    invoke-virtual {v9, v0}, La/fet;->g0(I)La/fet;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v9, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v2, 0x4

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    move v0, v2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x2

    .line 25
    :goto_0
    or-int/2addr v0, v10

    .line 26
    invoke-virtual {v9, v8}, La/fet;->d(F)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    const/16 v3, 0x20

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const/16 v3, 0x10

    .line 36
    .line 37
    :goto_1
    or-int/2addr v0, v3

    .line 38
    and-int/lit8 v3, v0, 0x13

    .line 39
    .line 40
    const/16 v4, 0x12

    .line 41
    .line 42
    const/4 v11, 0x0

    .line 43
    if-eq v3, v4, :cond_2

    .line 44
    .line 45
    const/4 v3, 0x1

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    move v3, v11

    .line 48
    :goto_2
    and-int/lit8 v4, v0, 0x1

    .line 49
    .line 50
    invoke-virtual {v9, v4, v3}, La/fet;->U(IZ)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_10

    .line 55
    .line 56
    sget-object v3, La/qmk;->a:La/zcl;

    .line 57
    .line 58
    const/high16 v3, 0x43200000    # 160.0f

    .line 59
    .line 60
    div-float v13, v8, v3

    .line 61
    .line 62
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    const/4 v4, 0x0

    .line 67
    sget-object v14, La/ukd;->a:La/cl5;

    .line 68
    .line 69
    if-ne v3, v14, :cond_3

    .line 70
    .line 71
    invoke-static {v4}, La/xf0;->c(F)La/t33;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v9, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :cond_3
    check-cast v3, La/t33;

    .line 79
    .line 80
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    if-ne v5, v14, :cond_4

    .line 85
    .line 86
    invoke-static {v4}, La/xf0;->c(F)La/t33;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-virtual {v9, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :cond_4
    check-cast v5, La/t33;

    .line 94
    .line 95
    iget-object v6, v1, La/mjg0;->a:La/hjg0;

    .line 96
    .line 97
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    if-ne v7, v14, :cond_6

    .line 102
    .line 103
    sget-object v7, La/ejg0;->a:La/ejg0;

    .line 104
    .line 105
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    if-eqz v6, :cond_5

    .line 110
    .line 111
    const/high16 v4, 0x44160000    # 600.0f

    .line 112
    .line 113
    :cond_5
    invoke-static {v4}, La/xf0;->c(F)La/t33;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    invoke-virtual {v9, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    :cond_6
    move-object v4, v7

    .line 121
    check-cast v4, La/t33;

    .line 122
    .line 123
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    if-ne v6, v14, :cond_7

    .line 128
    .line 129
    iget-object v6, v1, La/mjg0;->c:La/n0x;

    .line 130
    .line 131
    invoke-static {v6}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    invoke-virtual {v9, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :cond_7
    check-cast v6, La/pz40;

    .line 139
    .line 140
    and-int/lit8 v0, v0, 0xe

    .line 141
    .line 142
    if-ne v0, v2, :cond_8

    .line 143
    .line 144
    const/4 v0, 0x1

    .line 145
    goto :goto_3

    .line 146
    :cond_8
    move v0, v11

    .line 147
    :goto_3
    invoke-virtual {v9, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    or-int/2addr v0, v2

    .line 152
    invoke-virtual {v9, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    or-int/2addr v0, v2

    .line 157
    invoke-virtual {v9, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    or-int/2addr v0, v2

    .line 162
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    if-nez v0, :cond_a

    .line 167
    .line 168
    if-ne v2, v14, :cond_9

    .line 169
    .line 170
    goto :goto_4

    .line 171
    :cond_9
    move-object v15, v1

    .line 172
    move-object v0, v2

    .line 173
    move-object v2, v3

    .line 174
    move-object v3, v5

    .line 175
    move-object/from16 v16, v6

    .line 176
    .line 177
    goto :goto_5

    .line 178
    :cond_a
    :goto_4
    new-instance v0, La/kv;

    .line 179
    .line 180
    move-object v2, v3

    .line 181
    move-object v3, v5

    .line 182
    move-object v5, v6

    .line 183
    const/4 v6, 0x0

    .line 184
    const/16 v7, 0x10

    .line 185
    .line 186
    invoke-direct/range {v0 .. v7}, La/kv;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/pz40;La/yje;B)V

    .line 187
    .line 188
    .line 189
    move-object v15, v1

    .line 190
    move-object/from16 v16, v5

    .line 191
    .line 192
    invoke-virtual {v9, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    :goto_5
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 196
    .line 197
    invoke-static {v9, v15, v0}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 198
    .line 199
    .line 200
    sget-object v0, La/jm40;->b:La/jm40;

    .line 201
    .line 202
    invoke-static {v0, v8}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    invoke-virtual {v9, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v5

    .line 210
    invoke-virtual {v9, v13}, La/fet;->d(F)Z

    .line 211
    .line 212
    .line 213
    move-result v6

    .line 214
    or-int/2addr v5, v6

    .line 215
    invoke-virtual {v9, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v6

    .line 219
    or-int/2addr v5, v6

    .line 220
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v6

    .line 224
    if-nez v5, :cond_b

    .line 225
    .line 226
    if-ne v6, v14, :cond_c

    .line 227
    .line 228
    :cond_b
    new-instance v6, La/ny2;

    .line 229
    .line 230
    const/16 v5, 0xc

    .line 231
    .line 232
    invoke-direct {v6, v4, v13, v2, v5}, La/ny2;-><init>(Ljava/lang/Object;FLjava/lang/Object;B)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v9, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    :cond_c
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 239
    .line 240
    invoke-static {v1, v6}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    sget-object v2, La/gqw0;->h:La/zx7;

    .line 245
    .line 246
    invoke-static {v2, v11}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    iget-wide v4, v9, La/fet;->T:J

    .line 251
    .line 252
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 253
    .line 254
    .line 255
    move-result v4

    .line 256
    invoke-virtual {v9}, La/fet;->m()La/bh90;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    invoke-static {v9, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    sget-object v6, La/mkd;->c0:La/gqw0;

    .line 265
    .line 266
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v9}, La/fet;->i0()V

    .line 270
    .line 271
    .line 272
    iget-boolean v6, v9, La/fet;->S:Z

    .line 273
    .line 274
    if-eqz v6, :cond_d

    .line 275
    .line 276
    sget-object v6, La/e7z;->u1:La/pcy;

    .line 277
    .line 278
    invoke-virtual {v9, v6}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 279
    .line 280
    .line 281
    goto :goto_6

    .line 282
    :cond_d
    invoke-virtual {v9}, La/fet;->r0()V

    .line 283
    .line 284
    .line 285
    :goto_6
    sget-object v6, La/gqw0;->x:La/shd;

    .line 286
    .line 287
    invoke-static {v9, v2, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 288
    .line 289
    .line 290
    sget-object v2, La/gqw0;->w:La/shd;

    .line 291
    .line 292
    invoke-static {v9, v5, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 293
    .line 294
    .line 295
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    sget-object v4, La/gqw0;->y:La/shd;

    .line 300
    .line 301
    invoke-static {v9, v2, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 302
    .line 303
    .line 304
    invoke-static {v9}, La/jpm0;->n(La/fet;)V

    .line 305
    .line 306
    .line 307
    sget-object v2, La/gqw0;->v:La/shd;

    .line 308
    .line 309
    invoke-static {v9, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 310
    .line 311
    .line 312
    iget-object v1, v15, La/mjg0;->b:La/n0x;

    .line 313
    .line 314
    invoke-interface {v1}, La/o0x;->a()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    const/high16 v2, 0x430c0000    # 140.0f

    .line 319
    .line 320
    mul-float/2addr v2, v13

    .line 321
    invoke-static {v0, v2}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    const/high16 v4, 0x42700000    # 60.0f

    .line 326
    .line 327
    mul-float v11, v4, v13

    .line 328
    .line 329
    invoke-static {v2, v11}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    move-object v5, v3

    .line 334
    sget-object v3, La/gqw0;->f1:La/pge;

    .line 335
    .line 336
    const v6, 0x180030

    .line 337
    .line 338
    .line 339
    const/16 v7, 0x7b8

    .line 340
    .line 341
    move-object v4, v0

    .line 342
    move-object v0, v1

    .line 343
    const/4 v1, 0x0

    .line 344
    move-object/from16 v17, v4

    .line 345
    .line 346
    const/4 v4, 0x0

    .line 347
    move-object v12, v9

    .line 348
    move-object v9, v5

    .line 349
    move-object v5, v12

    .line 350
    move-object/from16 v12, v17

    .line 351
    .line 352
    invoke-static/range {v0 .. v7}, La/k7x;->a(Ljava/lang/Object;Ljava/lang/String;La/mm40;La/qge;La/a4d;La/fet;II)V

    .line 353
    .line 354
    .line 355
    invoke-interface/range {v16 .. v16}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    check-cast v0, La/o0x;

    .line 360
    .line 361
    invoke-interface {v0}, La/o0x;->a()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    sget-object v1, La/gqw0;->b:La/zx7;

    .line 366
    .line 367
    sget-object v2, La/jr8;->a:La/jr8;

    .line 368
    .line 369
    invoke-virtual {v2, v12, v1}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    const/high16 v2, 0x42c80000    # 100.0f

    .line 374
    .line 375
    mul-float/2addr v2, v13

    .line 376
    invoke-static {v1, v2}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    invoke-static {v1, v11}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    const/high16 v2, 0x3f800000    # 1.0f

    .line 385
    .line 386
    invoke-static {v1, v2}, La/k7n0;->H(La/mm40;F)La/mm40;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    const/high16 v2, -0x3f400000    # -6.0f

    .line 391
    .line 392
    mul-float/2addr v2, v13

    .line 393
    const/high16 v3, -0x3da80000    # -54.0f

    .line 394
    .line 395
    mul-float/2addr v3, v13

    .line 396
    invoke-static {v1, v2, v3}, La/ffb0;->Q(La/mm40;FF)La/mm40;

    .line 397
    .line 398
    .line 399
    move-result-object v1

    .line 400
    invoke-virtual {v5, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    move-result v2

    .line 404
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    if-nez v2, :cond_e

    .line 409
    .line 410
    if-ne v3, v14, :cond_f

    .line 411
    .line 412
    :cond_e
    new-instance v3, La/m53;

    .line 413
    .line 414
    const/16 v2, 0x18

    .line 415
    .line 416
    invoke-direct {v3, v9, v2}, La/m53;-><init>(La/t33;B)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v5, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 420
    .line 421
    .line 422
    :cond_f
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 423
    .line 424
    invoke-static {v1, v3}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 425
    .line 426
    .line 427
    move-result-object v2

    .line 428
    const/16 v6, 0x30

    .line 429
    .line 430
    const/16 v7, 0x7f8

    .line 431
    .line 432
    const/4 v1, 0x0

    .line 433
    const/4 v3, 0x0

    .line 434
    const/4 v4, 0x0

    .line 435
    invoke-static/range {v0 .. v7}, La/k7x;->a(Ljava/lang/Object;Ljava/lang/String;La/mm40;La/qge;La/a4d;La/fet;II)V

    .line 436
    .line 437
    .line 438
    const/4 v0, 0x1

    .line 439
    invoke-virtual {v5, v0}, La/fet;->r(Z)V

    .line 440
    .line 441
    .line 442
    goto :goto_7

    .line 443
    :cond_10
    move-object v15, v1

    .line 444
    move-object v5, v9

    .line 445
    invoke-virtual {v5}, La/fet;->X()V

    .line 446
    .line 447
    .line 448
    :goto_7
    invoke-virtual {v5}, La/fet;->u()La/yfe0;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    if-eqz v0, :cond_11

    .line 453
    .line 454
    new-instance v1, La/rx7;

    .line 455
    .line 456
    const/4 v2, 0x6

    .line 457
    invoke-direct {v1, v2, v8, v10, v15}, La/rx7;-><init>(BFILjava/lang/Object;)V

    .line 458
    .line 459
    .line 460
    iput-object v1, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 461
    .line 462
    :cond_11
    return-void
.end method

.method public static final b(La/t33;La/t33;La/t33;ZILa/n0x;La/ryc0;La/zje;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object/from16 v0, p7

    .line 2
    .line 3
    instance-of v1, v0, La/ijg0;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, La/ijg0;

    .line 9
    .line 10
    iget v2, v1, La/ijg0;->n:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, La/ijg0;->n:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, La/ijg0;

    .line 23
    .line 24
    invoke-direct {v1, v0}, La/zje;-><init>(La/yje;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, La/ijg0;->m:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v3, v1, La/ijg0;->n:I

    .line 32
    .line 33
    const/4 v4, 0x4

    .line 34
    const/4 v5, 0x3

    .line 35
    const/4 v6, 0x2

    .line 36
    const/4 v7, 0x1

    .line 37
    const/4 v8, 0x0

    .line 38
    const/4 v9, 0x0

    .line 39
    if-eqz v3, :cond_5

    .line 40
    .line 41
    if-eq v3, v7, :cond_4

    .line 42
    .line 43
    if-eq v3, v6, :cond_3

    .line 44
    .line 45
    if-eq v3, v5, :cond_2

    .line 46
    .line 47
    if-ne v3, v4, :cond_1

    .line 48
    .line 49
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto/16 :goto_5

    .line 53
    .line 54
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v9

    .line 60
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto/16 :goto_3

    .line 64
    .line 65
    :cond_3
    iget p0, v1, La/ijg0;->l:I

    .line 66
    .line 67
    iget-boolean p1, v1, La/ijg0;->k:Z

    .line 68
    .line 69
    iget-object p2, v1, La/ijg0;->j:La/t33;

    .line 70
    .line 71
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_4
    iget p0, v1, La/ijg0;->l:I

    .line 76
    .line 77
    iget-boolean p1, v1, La/ijg0;->k:Z

    .line 78
    .line 79
    iget-object p2, v1, La/ijg0;->j:La/t33;

    .line 80
    .line 81
    iget-object v3, v1, La/ijg0;->i:La/t33;

    .line 82
    .line 83
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    move-object v11, v3

    .line 87
    move v3, p1

    .line 88
    move-object p1, v11

    .line 89
    goto :goto_1

    .line 90
    :cond_5
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    move-object/from16 v0, p5

    .line 94
    .line 95
    move-object/from16 v3, p6

    .line 96
    .line 97
    invoke-virtual {v3, v0}, La/ryc0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    new-instance v0, Ljava/lang/Float;

    .line 101
    .line 102
    invoke-direct {v0, v8}, Ljava/lang/Float;-><init>(F)V

    .line 103
    .line 104
    .line 105
    iput-object p1, v1, La/ijg0;->i:La/t33;

    .line 106
    .line 107
    iput-object p2, v1, La/ijg0;->j:La/t33;

    .line 108
    .line 109
    iput-boolean p3, v1, La/ijg0;->k:Z

    .line 110
    .line 111
    move/from16 v10, p4

    .line 112
    .line 113
    iput v10, v1, La/ijg0;->l:I

    .line 114
    .line 115
    iput v7, v1, La/ijg0;->n:I

    .line 116
    .line 117
    invoke-virtual {p0, v1, v0}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    if-ne p0, v2, :cond_6

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_6
    move v3, p3

    .line 125
    move p0, v10

    .line 126
    :goto_1
    new-instance v0, Ljava/lang/Float;

    .line 127
    .line 128
    invoke-direct {v0, v8}, Ljava/lang/Float;-><init>(F)V

    .line 129
    .line 130
    .line 131
    iput-object v9, v1, La/ijg0;->i:La/t33;

    .line 132
    .line 133
    iput-object p2, v1, La/ijg0;->j:La/t33;

    .line 134
    .line 135
    iput-boolean v3, v1, La/ijg0;->k:Z

    .line 136
    .line 137
    iput p0, v1, La/ijg0;->l:I

    .line 138
    .line 139
    iput v6, v1, La/ijg0;->n:I

    .line 140
    .line 141
    invoke-virtual {p1, v1, v0}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    if-ne p1, v2, :cond_7

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_7
    move p1, v3

    .line 149
    :goto_2
    if-eqz p1, :cond_9

    .line 150
    .line 151
    new-instance v0, Ljava/lang/Float;

    .line 152
    .line 153
    invoke-direct {v0, v8}, Ljava/lang/Float;-><init>(F)V

    .line 154
    .line 155
    .line 156
    iput-object v9, v1, La/ijg0;->i:La/t33;

    .line 157
    .line 158
    iput-object v9, v1, La/ijg0;->j:La/t33;

    .line 159
    .line 160
    iput-boolean p1, v1, La/ijg0;->k:Z

    .line 161
    .line 162
    iput p0, v1, La/ijg0;->l:I

    .line 163
    .line 164
    iput v5, v1, La/ijg0;->n:I

    .line 165
    .line 166
    invoke-virtual {p2, v1, v0}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    if-ne p0, v2, :cond_8

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_8
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 174
    .line 175
    return-object p0

    .line 176
    :cond_9
    new-instance v0, Ljava/lang/Float;

    .line 177
    .line 178
    invoke-direct {v0, v8}, Ljava/lang/Float;-><init>(F)V

    .line 179
    .line 180
    .line 181
    const/4 v3, 0x0

    .line 182
    const/4 v5, 0x6

    .line 183
    invoke-static {p0, v3, v9, v5}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    iput-object v9, v1, La/ijg0;->i:La/t33;

    .line 188
    .line 189
    iput-object v9, v1, La/ijg0;->j:La/t33;

    .line 190
    .line 191
    iput-boolean p1, v1, La/ijg0;->k:Z

    .line 192
    .line 193
    iput p0, v1, La/ijg0;->l:I

    .line 194
    .line 195
    iput v4, v1, La/ijg0;->n:I

    .line 196
    .line 197
    const/4 p0, 0x0

    .line 198
    const/4 p1, 0x0

    .line 199
    const/16 v4, 0xc

    .line 200
    .line 201
    move-object p3, p0

    .line 202
    move-object/from16 p4, p1

    .line 203
    .line 204
    move-object p0, p2

    .line 205
    move-object p1, v0

    .line 206
    move-object/from16 p5, v1

    .line 207
    .line 208
    move-object p2, v3

    .line 209
    move/from16 p6, v4

    .line 210
    .line 211
    invoke-static/range {p0 .. p6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    if-ne p0, v2, :cond_a

    .line 216
    .line 217
    :goto_4
    return-object v2

    .line 218
    :cond_a
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 219
    .line 220
    return-object p0
.end method

.method public static final c(La/t33;ZILa/n0x;La/ryc0;La/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p5, La/jjg0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, La/jjg0;

    .line 7
    .line 8
    iget v1, v0, La/jjg0;->j:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/jjg0;->j:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/jjg0;

    .line 22
    .line 23
    invoke-direct {v0, p5}, La/zje;-><init>(La/yje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p5, v6, La/jjg0;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v6, La/jjg0;->j:I

    .line 32
    .line 33
    const/4 v2, 0x2

    .line 34
    const/4 v3, 0x1

    .line 35
    const/4 v4, 0x0

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eq v1, v3, :cond_2

    .line 39
    .line 40
    if-ne v1, v2, :cond_1

    .line 41
    .line 42
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_4

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v4

    .line 52
    :cond_2
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p4, p3}, La/ryc0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    const/high16 p3, 0x44160000    # 600.0f

    .line 63
    .line 64
    if-eqz p1, :cond_5

    .line 65
    .line 66
    new-instance p1, Ljava/lang/Float;

    .line 67
    .line 68
    invoke-direct {p1, p3}, Ljava/lang/Float;-><init>(F)V

    .line 69
    .line 70
    .line 71
    iput v3, v6, La/jjg0;->j:I

    .line 72
    .line 73
    invoke-virtual {p0, v6, p1}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    if-ne p0, v0, :cond_4

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_4
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    return-object p0

    .line 83
    :cond_5
    move p1, v2

    .line 84
    new-instance v2, Ljava/lang/Float;

    .line 85
    .line 86
    invoke-direct {v2, p3}, Ljava/lang/Float;-><init>(F)V

    .line 87
    .line 88
    .line 89
    const/4 p3, 0x0

    .line 90
    const/4 p4, 0x6

    .line 91
    invoke-static {p2, p3, v4, p4}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    iput p1, v6, La/jjg0;->j:I

    .line 96
    .line 97
    const/4 v4, 0x0

    .line 98
    const/4 v5, 0x0

    .line 99
    const/16 v7, 0xc

    .line 100
    .line 101
    move-object v1, p0

    .line 102
    invoke-static/range {v1 .. v7}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    if-ne p0, v0, :cond_6

    .line 107
    .line 108
    :goto_3
    return-object v0

    .line 109
    :cond_6
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    return-object p0
.end method

.method public static final d(La/t33;La/t33;La/t33;La/n0x;ZLa/gig0;La/ryc0;La/zje;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p7

    .line 2
    .line 3
    instance-of v1, v0, La/kjg0;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, La/kjg0;

    .line 9
    .line 10
    iget v2, v1, La/kjg0;->t:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, La/kjg0;->t:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, La/kjg0;

    .line 23
    .line 24
    invoke-direct {v1, v0}, La/zje;-><init>(La/yje;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, La/kjg0;->s:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v3, v1, La/kjg0;->t:I

    .line 32
    .line 33
    const/4 v4, 0x5

    .line 34
    sget-object v5, La/ljg0;->a:La/zsf;

    .line 35
    .line 36
    const/4 v6, 0x4

    .line 37
    const/4 v7, 0x3

    .line 38
    const/4 v8, 0x1

    .line 39
    const/4 v10, 0x0

    .line 40
    const/4 v11, 0x2

    .line 41
    const/4 v12, 0x0

    .line 42
    if-eqz v3, :cond_6

    .line 43
    .line 44
    if-eq v3, v8, :cond_5

    .line 45
    .line 46
    if-eq v3, v11, :cond_4

    .line 47
    .line 48
    if-eq v3, v7, :cond_3

    .line 49
    .line 50
    if-eq v3, v6, :cond_2

    .line 51
    .line 52
    if-ne v3, v4, :cond_1

    .line 53
    .line 54
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto/16 :goto_c

    .line 58
    .line 59
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object v12

    .line 65
    :cond_2
    iget v3, v1, La/kjg0;->o:I

    .line 66
    .line 67
    iget-boolean v5, v1, La/kjg0;->n:Z

    .line 68
    .line 69
    iget-object v7, v1, La/kjg0;->m:Lkotlin/jvm/functions/Function1;

    .line 70
    .line 71
    iget-object v8, v1, La/kjg0;->l:La/gig0;

    .line 72
    .line 73
    iget-object v9, v1, La/kjg0;->k:La/o0x;

    .line 74
    .line 75
    iget-object v11, v1, La/kjg0;->j:La/t33;

    .line 76
    .line 77
    iget-object v13, v1, La/kjg0;->i:La/t33;

    .line 78
    .line 79
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    goto/16 :goto_7

    .line 83
    .line 84
    :cond_3
    iget v3, v1, La/kjg0;->q:I

    .line 85
    .line 86
    iget v13, v1, La/kjg0;->p:I

    .line 87
    .line 88
    iget v14, v1, La/kjg0;->o:I

    .line 89
    .line 90
    iget-boolean v15, v1, La/kjg0;->n:Z

    .line 91
    .line 92
    iget-object v4, v1, La/kjg0;->m:Lkotlin/jvm/functions/Function1;

    .line 93
    .line 94
    iget-object v12, v1, La/kjg0;->l:La/gig0;

    .line 95
    .line 96
    iget-object v6, v1, La/kjg0;->k:La/o0x;

    .line 97
    .line 98
    iget-object v7, v1, La/kjg0;->j:La/t33;

    .line 99
    .line 100
    iget-object v9, v1, La/kjg0;->i:La/t33;

    .line 101
    .line 102
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    move-object v11, v7

    .line 106
    move/from16 v16, v8

    .line 107
    .line 108
    move-object v7, v4

    .line 109
    move-object v4, v12

    .line 110
    move v12, v13

    .line 111
    move-object v13, v9

    .line 112
    move-object v9, v6

    .line 113
    const/4 v6, 0x3

    .line 114
    :goto_1
    move v0, v15

    .line 115
    goto/16 :goto_6

    .line 116
    .line 117
    :cond_4
    iget v3, v1, La/kjg0;->r:I

    .line 118
    .line 119
    iget v4, v1, La/kjg0;->q:I

    .line 120
    .line 121
    iget v6, v1, La/kjg0;->p:I

    .line 122
    .line 123
    iget v7, v1, La/kjg0;->o:I

    .line 124
    .line 125
    iget-boolean v9, v1, La/kjg0;->n:Z

    .line 126
    .line 127
    iget-object v12, v1, La/kjg0;->m:Lkotlin/jvm/functions/Function1;

    .line 128
    .line 129
    iget-object v13, v1, La/kjg0;->l:La/gig0;

    .line 130
    .line 131
    iget-object v14, v1, La/kjg0;->k:La/o0x;

    .line 132
    .line 133
    iget-object v15, v1, La/kjg0;->j:La/t33;

    .line 134
    .line 135
    iget-object v11, v1, La/kjg0;->i:La/t33;

    .line 136
    .line 137
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    move/from16 v16, v6

    .line 141
    .line 142
    move v6, v3

    .line 143
    move v3, v4

    .line 144
    move-object v4, v12

    .line 145
    move-object v12, v13

    .line 146
    move/from16 v13, v16

    .line 147
    .line 148
    move-object/from16 v16, v14

    .line 149
    .line 150
    move v14, v7

    .line 151
    move-object v7, v15

    .line 152
    move v15, v9

    .line 153
    move-object/from16 v9, v16

    .line 154
    .line 155
    move/from16 v16, v8

    .line 156
    .line 157
    goto/16 :goto_5

    .line 158
    .line 159
    :cond_5
    iget-boolean v3, v1, La/kjg0;->n:Z

    .line 160
    .line 161
    iget-object v4, v1, La/kjg0;->m:Lkotlin/jvm/functions/Function1;

    .line 162
    .line 163
    iget-object v6, v1, La/kjg0;->l:La/gig0;

    .line 164
    .line 165
    iget-object v7, v1, La/kjg0;->k:La/o0x;

    .line 166
    .line 167
    iget-object v9, v1, La/kjg0;->j:La/t33;

    .line 168
    .line 169
    iget-object v11, v1, La/kjg0;->i:La/t33;

    .line 170
    .line 171
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    move-object/from16 v18, v7

    .line 175
    .line 176
    move-object v7, v6

    .line 177
    move-object/from16 v6, v18

    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_6
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    new-instance v0, Ljava/lang/Float;

    .line 184
    .line 185
    invoke-direct {v0, v10}, Ljava/lang/Float;-><init>(F)V

    .line 186
    .line 187
    .line 188
    move-object/from16 v3, p0

    .line 189
    .line 190
    iput-object v3, v1, La/kjg0;->i:La/t33;

    .line 191
    .line 192
    move-object/from16 v4, p1

    .line 193
    .line 194
    iput-object v4, v1, La/kjg0;->j:La/t33;

    .line 195
    .line 196
    move-object/from16 v6, p3

    .line 197
    .line 198
    iput-object v6, v1, La/kjg0;->k:La/o0x;

    .line 199
    .line 200
    move-object/from16 v7, p5

    .line 201
    .line 202
    iput-object v7, v1, La/kjg0;->l:La/gig0;

    .line 203
    .line 204
    move-object/from16 v9, p6

    .line 205
    .line 206
    iput-object v9, v1, La/kjg0;->m:Lkotlin/jvm/functions/Function1;

    .line 207
    .line 208
    move/from16 v11, p4

    .line 209
    .line 210
    iput-boolean v11, v1, La/kjg0;->n:Z

    .line 211
    .line 212
    iput v8, v1, La/kjg0;->t:I

    .line 213
    .line 214
    move-object/from16 v12, p2

    .line 215
    .line 216
    invoke-virtual {v12, v1, v0}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    if-ne v0, v2, :cond_7

    .line 221
    .line 222
    goto/16 :goto_b

    .line 223
    .line 224
    :cond_7
    move/from16 v18, v11

    .line 225
    .line 226
    move-object v11, v3

    .line 227
    move/from16 v3, v18

    .line 228
    .line 229
    move-object/from16 v18, v9

    .line 230
    .line 231
    move-object v9, v4

    .line 232
    move-object/from16 v4, v18

    .line 233
    .line 234
    :goto_2
    if-eqz v7, :cond_8

    .line 235
    .line 236
    iget-short v0, v7, La/gig0;->a:S

    .line 237
    .line 238
    goto :goto_3

    .line 239
    :cond_8
    const/16 v0, 0xfa

    .line 240
    .line 241
    :goto_3
    if-nez v3, :cond_d

    .line 242
    .line 243
    move v12, v3

    .line 244
    move v3, v0

    .line 245
    move v0, v12

    .line 246
    move-object v12, v7

    .line 247
    move-object v7, v4

    .line 248
    move-object v4, v12

    .line 249
    move-object v13, v11

    .line 250
    const/4 v12, 0x3

    .line 251
    move-object v11, v9

    .line 252
    move-object v9, v6

    .line 253
    const/4 v6, 0x0

    .line 254
    :goto_4
    if-ge v6, v12, :cond_b

    .line 255
    .line 256
    new-instance v14, Ljava/lang/Float;

    .line 257
    .line 258
    const/high16 v15, 0x40c00000    # 6.0f

    .line 259
    .line 260
    invoke-direct {v14, v15}, Ljava/lang/Float;-><init>(F)V

    .line 261
    .line 262
    .line 263
    new-instance v15, Lkotlin/Pair;

    .line 264
    .line 265
    invoke-direct {v15, v13, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    new-instance v14, Ljava/lang/Float;

    .line 269
    .line 270
    move/from16 v16, v8

    .line 271
    .line 272
    const/high16 v8, 0x41200000    # 10.0f

    .line 273
    .line 274
    invoke-direct {v14, v8}, Ljava/lang/Float;-><init>(F)V

    .line 275
    .line 276
    .line 277
    new-instance v8, Lkotlin/Pair;

    .line 278
    .line 279
    invoke-direct {v8, v11, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    filled-new-array {v15, v8}, [Lkotlin/Pair;

    .line 283
    .line 284
    .line 285
    move-result-object v8

    .line 286
    const/4 v14, 0x0

    .line 287
    const/4 v15, 0x2

    .line 288
    invoke-static {v3, v14, v5, v15}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 289
    .line 290
    .line 291
    move-result-object v10

    .line 292
    iput-object v13, v1, La/kjg0;->i:La/t33;

    .line 293
    .line 294
    iput-object v11, v1, La/kjg0;->j:La/t33;

    .line 295
    .line 296
    iput-object v9, v1, La/kjg0;->k:La/o0x;

    .line 297
    .line 298
    iput-object v4, v1, La/kjg0;->l:La/gig0;

    .line 299
    .line 300
    iput-object v7, v1, La/kjg0;->m:Lkotlin/jvm/functions/Function1;

    .line 301
    .line 302
    iput-boolean v0, v1, La/kjg0;->n:Z

    .line 303
    .line 304
    iput v3, v1, La/kjg0;->o:I

    .line 305
    .line 306
    iput v12, v1, La/kjg0;->p:I

    .line 307
    .line 308
    iput v6, v1, La/kjg0;->q:I

    .line 309
    .line 310
    iput v6, v1, La/kjg0;->r:I

    .line 311
    .line 312
    iput v15, v1, La/kjg0;->t:I

    .line 313
    .line 314
    invoke-static {v8, v10, v1}, La/ljg0;->e([Lkotlin/Pair;La/cfq;La/kjg0;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v8

    .line 318
    if-ne v8, v2, :cond_9

    .line 319
    .line 320
    goto/16 :goto_b

    .line 321
    .line 322
    :cond_9
    move v14, v12

    .line 323
    move-object v12, v4

    .line 324
    move-object v4, v7

    .line 325
    move-object v7, v11

    .line 326
    move-object v11, v13

    .line 327
    move v13, v14

    .line 328
    move v15, v0

    .line 329
    move v14, v3

    .line 330
    move v3, v6

    .line 331
    :goto_5
    new-instance v0, Ljava/lang/Float;

    .line 332
    .line 333
    const/4 v8, 0x0

    .line 334
    invoke-direct {v0, v8}, Ljava/lang/Float;-><init>(F)V

    .line 335
    .line 336
    .line 337
    new-instance v10, Lkotlin/Pair;

    .line 338
    .line 339
    invoke-direct {v10, v11, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    new-instance v0, Ljava/lang/Float;

    .line 343
    .line 344
    invoke-direct {v0, v8}, Ljava/lang/Float;-><init>(F)V

    .line 345
    .line 346
    .line 347
    new-instance v8, Lkotlin/Pair;

    .line 348
    .line 349
    invoke-direct {v8, v7, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    filled-new-array {v10, v8}, [Lkotlin/Pair;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    move-object/from16 v17, v2

    .line 357
    .line 358
    const/4 v8, 0x0

    .line 359
    const/4 v10, 0x2

    .line 360
    invoke-static {v14, v8, v5, v10}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    iput-object v11, v1, La/kjg0;->i:La/t33;

    .line 365
    .line 366
    iput-object v7, v1, La/kjg0;->j:La/t33;

    .line 367
    .line 368
    iput-object v9, v1, La/kjg0;->k:La/o0x;

    .line 369
    .line 370
    iput-object v12, v1, La/kjg0;->l:La/gig0;

    .line 371
    .line 372
    iput-object v4, v1, La/kjg0;->m:Lkotlin/jvm/functions/Function1;

    .line 373
    .line 374
    iput-boolean v15, v1, La/kjg0;->n:Z

    .line 375
    .line 376
    iput v14, v1, La/kjg0;->o:I

    .line 377
    .line 378
    iput v13, v1, La/kjg0;->p:I

    .line 379
    .line 380
    iput v3, v1, La/kjg0;->q:I

    .line 381
    .line 382
    iput v6, v1, La/kjg0;->r:I

    .line 383
    .line 384
    const/4 v6, 0x3

    .line 385
    iput v6, v1, La/kjg0;->t:I

    .line 386
    .line 387
    invoke-static {v0, v2, v1}, La/ljg0;->e([Lkotlin/Pair;La/cfq;La/kjg0;)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    move-object/from16 v2, v17

    .line 392
    .line 393
    if-ne v0, v2, :cond_a

    .line 394
    .line 395
    goto/16 :goto_b

    .line 396
    .line 397
    :cond_a
    move-object v0, v7

    .line 398
    move-object v7, v4

    .line 399
    move-object v4, v12

    .line 400
    move v12, v13

    .line 401
    move-object v13, v11

    .line 402
    move-object v11, v0

    .line 403
    goto/16 :goto_1

    .line 404
    .line 405
    :goto_6
    add-int/lit8 v3, v3, 0x1

    .line 406
    .line 407
    move v6, v3

    .line 408
    move v3, v14

    .line 409
    move/from16 v8, v16

    .line 410
    .line 411
    const/4 v10, 0x0

    .line 412
    goto/16 :goto_4

    .line 413
    .line 414
    :cond_b
    new-instance v6, Ljava/lang/Float;

    .line 415
    .line 416
    const/high16 v8, 0x41400000    # 12.0f

    .line 417
    .line 418
    invoke-direct {v6, v8}, Ljava/lang/Float;-><init>(F)V

    .line 419
    .line 420
    .line 421
    new-instance v8, Lkotlin/Pair;

    .line 422
    .line 423
    invoke-direct {v8, v13, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 424
    .line 425
    .line 426
    new-instance v6, Ljava/lang/Float;

    .line 427
    .line 428
    const/high16 v10, 0x41700000    # 15.0f

    .line 429
    .line 430
    invoke-direct {v6, v10}, Ljava/lang/Float;-><init>(F)V

    .line 431
    .line 432
    .line 433
    new-instance v10, Lkotlin/Pair;

    .line 434
    .line 435
    invoke-direct {v10, v11, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 436
    .line 437
    .line 438
    filled-new-array {v8, v10}, [Lkotlin/Pair;

    .line 439
    .line 440
    .line 441
    move-result-object v6

    .line 442
    const/4 v8, 0x0

    .line 443
    const/4 v10, 0x2

    .line 444
    invoke-static {v3, v8, v5, v10}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 445
    .line 446
    .line 447
    move-result-object v5

    .line 448
    iput-object v13, v1, La/kjg0;->i:La/t33;

    .line 449
    .line 450
    iput-object v11, v1, La/kjg0;->j:La/t33;

    .line 451
    .line 452
    iput-object v9, v1, La/kjg0;->k:La/o0x;

    .line 453
    .line 454
    iput-object v4, v1, La/kjg0;->l:La/gig0;

    .line 455
    .line 456
    iput-object v7, v1, La/kjg0;->m:Lkotlin/jvm/functions/Function1;

    .line 457
    .line 458
    iput-boolean v0, v1, La/kjg0;->n:Z

    .line 459
    .line 460
    iput v3, v1, La/kjg0;->o:I

    .line 461
    .line 462
    const/4 v8, 0x4

    .line 463
    iput v8, v1, La/kjg0;->t:I

    .line 464
    .line 465
    invoke-static {v6, v5, v1}, La/ljg0;->e([Lkotlin/Pair;La/cfq;La/kjg0;)Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v5

    .line 469
    if-ne v5, v2, :cond_c

    .line 470
    .line 471
    goto :goto_b

    .line 472
    :cond_c
    move v5, v0

    .line 473
    move-object v8, v4

    .line 474
    :goto_7
    move v0, v3

    .line 475
    move v3, v5

    .line 476
    move-object v4, v7

    .line 477
    move-object v7, v8

    .line 478
    move-object v6, v9

    .line 479
    move-object v9, v11

    .line 480
    move-object v11, v13

    .line 481
    :cond_d
    invoke-interface {v4, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    if-nez v3, :cond_11

    .line 485
    .line 486
    new-instance v4, Ljava/lang/Float;

    .line 487
    .line 488
    const/4 v8, 0x0

    .line 489
    invoke-direct {v4, v8}, Ljava/lang/Float;-><init>(F)V

    .line 490
    .line 491
    .line 492
    new-instance v5, Lkotlin/Pair;

    .line 493
    .line 494
    invoke-direct {v5, v11, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 495
    .line 496
    .line 497
    new-instance v4, Ljava/lang/Float;

    .line 498
    .line 499
    invoke-direct {v4, v8}, Ljava/lang/Float;-><init>(F)V

    .line 500
    .line 501
    .line 502
    new-instance v6, Lkotlin/Pair;

    .line 503
    .line 504
    invoke-direct {v6, v9, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 505
    .line 506
    .line 507
    filled-new-array {v5, v6}, [Lkotlin/Pair;

    .line 508
    .line 509
    .line 510
    move-result-object v4

    .line 511
    if-eqz v7, :cond_e

    .line 512
    .line 513
    iget v5, v7, La/gig0;->c:F

    .line 514
    .line 515
    goto :goto_8

    .line 516
    :cond_e
    const/high16 v5, 0x437a0000    # 250.0f

    .line 517
    .line 518
    :goto_8
    if-eqz v7, :cond_f

    .line 519
    .line 520
    iget v6, v7, La/gig0;->d:F

    .line 521
    .line 522
    :goto_9
    const/4 v7, 0x0

    .line 523
    const/4 v8, 0x4

    .line 524
    goto :goto_a

    .line 525
    :cond_f
    const v6, 0x3f07ae14    # 0.53f

    .line 526
    .line 527
    .line 528
    goto :goto_9

    .line 529
    :goto_a
    invoke-static {v6, v5, v7, v8}, La/ro4;->g0(FFLjava/lang/Object;I)La/nul0;

    .line 530
    .line 531
    .line 532
    move-result-object v5

    .line 533
    iput-object v7, v1, La/kjg0;->i:La/t33;

    .line 534
    .line 535
    iput-object v7, v1, La/kjg0;->j:La/t33;

    .line 536
    .line 537
    iput-object v7, v1, La/kjg0;->k:La/o0x;

    .line 538
    .line 539
    iput-object v7, v1, La/kjg0;->l:La/gig0;

    .line 540
    .line 541
    iput-object v7, v1, La/kjg0;->m:Lkotlin/jvm/functions/Function1;

    .line 542
    .line 543
    iput-boolean v3, v1, La/kjg0;->n:Z

    .line 544
    .line 545
    iput v0, v1, La/kjg0;->o:I

    .line 546
    .line 547
    const/4 v0, 0x5

    .line 548
    iput v0, v1, La/kjg0;->t:I

    .line 549
    .line 550
    invoke-static {v4, v5, v1}, La/ljg0;->e([Lkotlin/Pair;La/cfq;La/kjg0;)Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    if-ne v0, v2, :cond_10

    .line 555
    .line 556
    :goto_b
    return-object v2

    .line 557
    :cond_10
    :goto_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 558
    .line 559
    return-object v0

    .line 560
    :cond_11
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 561
    .line 562
    return-object v0
.end method

.method public static final e([Lkotlin/Pair;La/cfq;La/kjg0;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, La/qkb0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x8

    .line 5
    .line 6
    invoke-direct {v0, p0, p1, v1, v2}, La/qkb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 7
    .line 8
    .line 9
    invoke-static {p2, v0}, La/d5c;->J(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget-object p1, La/wne;->a:La/wne;

    .line 14
    .line 15
    if-ne p0, p1, :cond_0

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0
.end method
