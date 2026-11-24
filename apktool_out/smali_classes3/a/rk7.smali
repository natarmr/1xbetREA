.class public final La/rk7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:La/l7m0;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:La/l7m0;

.field public final synthetic e:La/l7m0;

.field public final synthetic f:La/l7m0;

.field public final synthetic g:La/l7m0;

.field public final synthetic h:La/l7m0;

.field public final synthetic i:La/l7m0;


# direct methods
.method public constructor <init>(Ljava/util/List;La/l7m0;Lkotlin/jvm/functions/Function1;La/l7m0;La/l7m0;La/l7m0;La/l7m0;La/l7m0;La/l7m0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/rk7;->a:Ljava/util/List;

    .line 5
    .line 6
    iput-object p2, p0, La/rk7;->b:La/l7m0;

    .line 7
    .line 8
    iput-object p3, p0, La/rk7;->c:Lkotlin/jvm/functions/Function1;

    .line 9
    .line 10
    iput-object p4, p0, La/rk7;->d:La/l7m0;

    .line 11
    .line 12
    iput-object p5, p0, La/rk7;->e:La/l7m0;

    .line 13
    .line 14
    iput-object p6, p0, La/rk7;->f:La/l7m0;

    .line 15
    .line 16
    iput-object p7, p0, La/rk7;->g:La/l7m0;

    .line 17
    .line 18
    iput-object p8, p0, La/rk7;->h:La/l7m0;

    .line 19
    .line 20
    iput-object p9, p0, La/rk7;->i:La/l7m0;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/g9z;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    move-object/from16 v6, p3

    .line 16
    .line 17
    check-cast v6, La/fet;

    .line 18
    .line 19
    move-object/from16 v3, p4

    .line 20
    .line 21
    check-cast v3, Ljava/lang/Number;

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    and-int/lit8 v4, v3, 0x6

    .line 28
    .line 29
    const/4 v11, 0x2

    .line 30
    if-nez v4, :cond_1

    .line 31
    .line 32
    invoke-virtual {v6, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    const/4 v1, 0x4

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move v1, v11

    .line 41
    :goto_0
    or-int/2addr v1, v3

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move v1, v3

    .line 44
    :goto_1
    and-int/lit8 v3, v3, 0x30

    .line 45
    .line 46
    if-nez v3, :cond_3

    .line 47
    .line 48
    invoke-virtual {v6, v2}, La/fet;->e(I)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_2

    .line 53
    .line 54
    const/16 v3, 0x20

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    const/16 v3, 0x10

    .line 58
    .line 59
    :goto_2
    or-int/2addr v1, v3

    .line 60
    :cond_3
    and-int/lit16 v3, v1, 0x93

    .line 61
    .line 62
    const/16 v4, 0x92

    .line 63
    .line 64
    const/4 v12, 0x1

    .line 65
    const/4 v13, 0x0

    .line 66
    if-eq v3, v4, :cond_4

    .line 67
    .line 68
    move v3, v12

    .line 69
    goto :goto_3

    .line 70
    :cond_4
    move v3, v13

    .line 71
    :goto_3
    and-int/2addr v1, v12

    .line 72
    invoke-virtual {v6, v1, v3}, La/fet;->U(IZ)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_13

    .line 77
    .line 78
    iget-object v1, v0, La/rk7;->a:Ljava/util/List;

    .line 79
    .line 80
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, La/jvg0;

    .line 85
    .line 86
    const v2, -0x7e25b6f3

    .line 87
    .line 88
    .line 89
    invoke-virtual {v6, v2}, La/fet;->e0(I)V

    .line 90
    .line 91
    .line 92
    if-eqz v1, :cond_12

    .line 93
    .line 94
    instance-of v2, v1, La/cvg0;

    .line 95
    .line 96
    sget-object v14, La/jm40;->b:La/jm40;

    .line 97
    .line 98
    const/4 v15, 0x0

    .line 99
    if-eqz v2, :cond_5

    .line 100
    .line 101
    const v1, -0x7e26434d

    .line 102
    .line 103
    .line 104
    invoke-virtual {v6, v1}, La/fet;->e0(I)V

    .line 105
    .line 106
    .line 107
    sget-object v1, La/qmk;->a:La/zcl;

    .line 108
    .line 109
    const/high16 v1, 0x40800000    # 4.0f

    .line 110
    .line 111
    invoke-static {v14, v1, v15, v11}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    iget-object v0, v0, La/rk7;->b:La/l7m0;

    .line 116
    .line 117
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    check-cast v0, Ljava/lang/String;

    .line 122
    .line 123
    invoke-static {v13, v6, v1, v0}, La/k7x;->q(ILa/fet;La/mm40;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v6, v13}, La/fet;->r(Z)V

    .line 127
    .line 128
    .line 129
    goto/16 :goto_a

    .line 130
    .line 131
    :cond_5
    instance-of v2, v1, La/j8k0;

    .line 132
    .line 133
    if-eqz v2, :cond_12

    .line 134
    .line 135
    const v2, -0x7e1f3fd8

    .line 136
    .line 137
    .line 138
    invoke-virtual {v6, v2}, La/fet;->e0(I)V

    .line 139
    .line 140
    .line 141
    sget-object v2, La/s6t0;->a:La/pz40;

    .line 142
    .line 143
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 148
    .line 149
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 150
    .line 151
    .line 152
    move-result-wide v2

    .line 153
    sget-object v4, La/qmk;->a:La/zcl;

    .line 154
    .line 155
    const/high16 v4, 0x41800000    # 16.0f

    .line 156
    .line 157
    invoke-static {v4}, La/vgg0;->a(F)La/ugg0;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    invoke-static {v14, v2, v3, v4}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    const/high16 v9, 0x41400000    # 12.0f

    .line 166
    .line 167
    invoke-static {v2, v9}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    sget-object v3, La/uc9;->c:La/mw3;

    .line 172
    .line 173
    sget-object v4, La/gqw0;->m:La/xx7;

    .line 174
    .line 175
    invoke-static {v3, v4, v6, v13}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    iget-wide v4, v6, La/fet;->T:J

    .line 180
    .line 181
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    invoke-virtual {v6}, La/fet;->m()La/bh90;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    invoke-static {v6, v2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 194
    .line 195
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v6}, La/fet;->i0()V

    .line 199
    .line 200
    .line 201
    iget-boolean v7, v6, La/fet;->S:Z

    .line 202
    .line 203
    if-eqz v7, :cond_6

    .line 204
    .line 205
    sget-object v7, La/e7z;->u1:La/pcy;

    .line 206
    .line 207
    invoke-virtual {v6, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 208
    .line 209
    .line 210
    goto :goto_4

    .line 211
    :cond_6
    invoke-virtual {v6}, La/fet;->r0()V

    .line 212
    .line 213
    .line 214
    :goto_4
    sget-object v7, La/gqw0;->x:La/shd;

    .line 215
    .line 216
    invoke-static {v6, v3, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 217
    .line 218
    .line 219
    sget-object v3, La/gqw0;->w:La/shd;

    .line 220
    .line 221
    invoke-static {v6, v5, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 222
    .line 223
    .line 224
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    sget-object v4, La/gqw0;->y:La/shd;

    .line 229
    .line 230
    invoke-static {v6, v3, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 231
    .line 232
    .line 233
    invoke-static {v6}, La/jpm0;->n(La/fet;)V

    .line 234
    .line 235
    .line 236
    sget-object v3, La/gqw0;->v:La/shd;

    .line 237
    .line 238
    invoke-static {v6, v2, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 239
    .line 240
    .line 241
    const v2, 0x489a0df3

    .line 242
    .line 243
    .line 244
    invoke-virtual {v6, v2}, La/fet;->e0(I)V

    .line 245
    .line 246
    .line 247
    check-cast v1, La/j8k0;

    .line 248
    .line 249
    iget-object v1, v1, La/j8k0;->a:Ljava/util/List;

    .line 250
    .line 251
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    move v2, v13

    .line 256
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    if-eqz v3, :cond_11

    .line 261
    .line 262
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    add-int/lit8 v16, v2, 0x1

    .line 267
    .line 268
    const/4 v10, 0x0

    .line 269
    if-ltz v2, :cond_10

    .line 270
    .line 271
    check-cast v3, La/f8k0;

    .line 272
    .line 273
    if-lez v2, :cond_7

    .line 274
    .line 275
    const v2, 0x3fd3b7ca

    .line 276
    .line 277
    .line 278
    invoke-virtual {v6, v2}, La/fet;->e0(I)V

    .line 279
    .line 280
    .line 281
    sget-object v2, La/qmk;->a:La/zcl;

    .line 282
    .line 283
    invoke-static {v14, v15, v9, v12}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 284
    .line 285
    .line 286
    move-result-object v4

    .line 287
    const/4 v7, 0x6

    .line 288
    const/4 v8, 0x4

    .line 289
    move-object v2, v3

    .line 290
    sget-object v3, La/zfi0;->a:La/zfi0;

    .line 291
    .line 292
    const/4 v5, 0x0

    .line 293
    invoke-static/range {v3 .. v8}, La/mbc;->o(La/bgi0;La/mm40;ZLa/fet;II)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v6, v13}, La/fet;->r(Z)V

    .line 297
    .line 298
    .line 299
    goto :goto_6

    .line 300
    :cond_7
    move-object v2, v3

    .line 301
    const v3, 0x3fd872d9

    .line 302
    .line 303
    .line 304
    invoke-virtual {v6, v3}, La/fet;->e0(I)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v6, v13}, La/fet;->r(Z)V

    .line 308
    .line 309
    .line 310
    :goto_6
    iget-object v4, v2, La/f8k0;->a:Ljava/lang/String;

    .line 311
    .line 312
    iget-object v3, v2, La/f8k0;->c:La/h8k0;

    .line 313
    .line 314
    iget-object v5, v2, La/f8k0;->b:Ljava/lang/String;

    .line 315
    .line 316
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 317
    .line 318
    .line 319
    move-result v7

    .line 320
    if-eqz v7, :cond_a

    .line 321
    .line 322
    if-eq v7, v12, :cond_9

    .line 323
    .line 324
    if-ne v7, v11, :cond_8

    .line 325
    .line 326
    iget-object v7, v0, La/rk7;->f:La/l7m0;

    .line 327
    .line 328
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v7

    .line 332
    check-cast v7, La/l7m0;

    .line 333
    .line 334
    goto :goto_7

    .line 335
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 336
    .line 337
    .line 338
    return-object v10

    .line 339
    :cond_9
    iget-object v7, v0, La/rk7;->e:La/l7m0;

    .line 340
    .line 341
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v7

    .line 345
    check-cast v7, La/l7m0;

    .line 346
    .line 347
    goto :goto_7

    .line 348
    :cond_a
    iget-object v7, v0, La/rk7;->d:La/l7m0;

    .line 349
    .line 350
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v7

    .line 354
    check-cast v7, La/l7m0;

    .line 355
    .line 356
    :goto_7
    new-instance v17, La/prm;

    .line 357
    .line 358
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 359
    .line 360
    .line 361
    move-result v3

    .line 362
    if-eqz v3, :cond_d

    .line 363
    .line 364
    if-eq v3, v12, :cond_c

    .line 365
    .line 366
    if-ne v3, v11, :cond_b

    .line 367
    .line 368
    iget-object v3, v0, La/rk7;->i:La/l7m0;

    .line 369
    .line 370
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v3

    .line 374
    check-cast v3, La/l7m0;

    .line 375
    .line 376
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v3

    .line 380
    check-cast v3, Ljava/lang/Number;

    .line 381
    .line 382
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 383
    .line 384
    .line 385
    move-result v3

    .line 386
    :goto_8
    move/from16 v18, v3

    .line 387
    .line 388
    goto :goto_9

    .line 389
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 390
    .line 391
    .line 392
    return-object v10

    .line 393
    :cond_c
    iget-object v3, v0, La/rk7;->h:La/l7m0;

    .line 394
    .line 395
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v3

    .line 399
    check-cast v3, La/l7m0;

    .line 400
    .line 401
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v3

    .line 405
    check-cast v3, Ljava/lang/Number;

    .line 406
    .line 407
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 408
    .line 409
    .line 410
    move-result v3

    .line 411
    goto :goto_8

    .line 412
    :cond_d
    iget-object v3, v0, La/rk7;->g:La/l7m0;

    .line 413
    .line 414
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v3

    .line 418
    check-cast v3, La/l7m0;

    .line 419
    .line 420
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v3

    .line 424
    check-cast v3, Ljava/lang/Number;

    .line 425
    .line 426
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 427
    .line 428
    .line 429
    move-result v3

    .line 430
    goto :goto_8

    .line 431
    :goto_9
    new-instance v3, La/jrm;

    .line 432
    .line 433
    iget-object v8, v2, La/f8k0;->d:La/g8k0;

    .line 434
    .line 435
    iget-object v10, v2, La/f8k0;->e:La/g8k0;

    .line 436
    .line 437
    invoke-direct {v3, v8, v10}, La/jrm;-><init>(La/g8k0;La/g8k0;)V

    .line 438
    .line 439
    .line 440
    const/16 v22, 0x0

    .line 441
    .line 442
    const/16 v23, 0xf6

    .line 443
    .line 444
    const/16 v20, 0x0

    .line 445
    .line 446
    const/16 v21, 0x0

    .line 447
    .line 448
    move-object/from16 v19, v3

    .line 449
    .line 450
    invoke-direct/range {v17 .. v23}, La/prm;-><init>(FLa/lrm;La/nrm;La/a4x;ZI)V

    .line 451
    .line 452
    .line 453
    iget-object v3, v0, La/rk7;->c:Lkotlin/jvm/functions/Function1;

    .line 454
    .line 455
    invoke-virtual {v6, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    move-result v8

    .line 459
    invoke-virtual {v6, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result v10

    .line 463
    or-int/2addr v8, v10

    .line 464
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v10

    .line 468
    if-nez v8, :cond_e

    .line 469
    .line 470
    sget-object v8, La/ukd;->a:La/cl5;

    .line 471
    .line 472
    if-ne v10, v8, :cond_f

    .line 473
    .line 474
    :cond_e
    new-instance v10, La/ci2;

    .line 475
    .line 476
    const/16 v8, 0x1b

    .line 477
    .line 478
    invoke-direct {v10, v3, v2, v8}, La/ci2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v6, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 482
    .line 483
    .line 484
    :cond_f
    move-object v8, v10

    .line 485
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 486
    .line 487
    const/4 v10, 0x0

    .line 488
    const/4 v3, 0x0

    .line 489
    move v2, v9

    .line 490
    move-object v9, v6

    .line 491
    move-object v6, v7

    .line 492
    move-object/from16 v7, v17

    .line 493
    .line 494
    invoke-static/range {v3 .. v10}, La/n7x;->l(La/mm40;Ljava/lang/String;Ljava/lang/String;La/l7m0;La/prm;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 495
    .line 496
    .line 497
    move-object v6, v9

    .line 498
    move v9, v2

    .line 499
    move/from16 v2, v16

    .line 500
    .line 501
    goto/16 :goto_5

    .line 502
    .line 503
    :cond_10
    invoke-static {}, La/q3d;->p()V

    .line 504
    .line 505
    .line 506
    throw v10

    .line 507
    :cond_11
    invoke-static {v6, v13, v12, v13}, La/ohs0;->x(La/fet;ZZZ)V

    .line 508
    .line 509
    .line 510
    :goto_a
    invoke-virtual {v6, v13}, La/fet;->r(Z)V

    .line 511
    .line 512
    .line 513
    goto :goto_b

    .line 514
    :cond_12
    const v0, -0x6f6c924a

    .line 515
    .line 516
    .line 517
    invoke-static {v0, v6, v13}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    throw v0

    .line 522
    :cond_13
    invoke-virtual {v6}, La/fet;->X()V

    .line 523
    .line 524
    .line 525
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 526
    .line 527
    return-object v0
.end method
