.class public final synthetic La/nno0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/xk80;

.field public final synthetic c:La/dk5;

.field public final synthetic d:La/pz40;

.field public final synthetic e:La/l7m0;

.field public final synthetic f:Z

.field public final synthetic g:La/pz40;

.field public final synthetic h:La/l7m0;


# direct methods
.method public synthetic constructor <init>(ILa/kwj;La/dk5;La/pz40;La/pz40;ZLa/pz40;La/pz40;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/nno0;->a:I

    iput-object p2, p0, La/nno0;->b:La/xk80;

    iput-object p3, p0, La/nno0;->c:La/dk5;

    iput-object p4, p0, La/nno0;->d:La/pz40;

    iput-object p5, p0, La/nno0;->e:La/l7m0;

    iput-boolean p6, p0, La/nno0;->f:Z

    iput-object p7, p0, La/nno0;->g:La/pz40;

    iput-object p8, p0, La/nno0;->h:La/l7m0;

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/hh80;

    .line 6
    .line 7
    move-object/from16 v6, p2

    .line 8
    .line 9
    check-cast v6, La/fet;

    .line 10
    .line 11
    move-object/from16 v2, p3

    .line 12
    .line 13
    check-cast v2, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    and-int/lit8 v3, v2, 0x6

    .line 23
    .line 24
    const/4 v4, 0x2

    .line 25
    if-nez v3, :cond_1

    .line 26
    .line 27
    invoke-virtual {v6, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    const/4 v3, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v3, v4

    .line 36
    :goto_0
    or-int/2addr v2, v3

    .line 37
    :cond_1
    and-int/lit8 v3, v2, 0x13

    .line 38
    .line 39
    const/16 v5, 0x12

    .line 40
    .line 41
    const/4 v8, 0x1

    .line 42
    const/4 v9, 0x0

    .line 43
    if-eq v3, v5, :cond_2

    .line 44
    .line 45
    move v3, v8

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move v3, v9

    .line 48
    :goto_1
    and-int/2addr v2, v8

    .line 49
    invoke-virtual {v6, v2, v3}, La/fet;->U(IZ)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_12

    .line 54
    .line 55
    sget-object v10, La/zaq0;->b:La/zfn;

    .line 56
    .line 57
    invoke-virtual {v6, v10}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 62
    .line 63
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 64
    .line 65
    .line 66
    move-result-wide v2

    .line 67
    sget-object v11, La/jd8;->n:La/ljc;

    .line 68
    .line 69
    sget-object v12, La/jm40;->b:La/jm40;

    .line 70
    .line 71
    invoke-static {v12, v2, v3, v11}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    sget-object v3, La/o7k0;->c:La/n0q;

    .line 76
    .line 77
    invoke-interface {v2, v3}, La/mm40;->e(La/mm40;)La/mm40;

    .line 78
    .line 79
    .line 80
    move-result-object v13

    .line 81
    invoke-interface {v1}, La/hh80;->d()F

    .line 82
    .line 83
    .line 84
    move-result v15

    .line 85
    const/16 v17, 0x0

    .line 86
    .line 87
    const/16 v18, 0xd

    .line 88
    .line 89
    const/4 v14, 0x0

    .line 90
    const/16 v16, 0x0

    .line 91
    .line 92
    invoke-static/range {v13 .. v18}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    sget-object v2, La/uc9;->c:La/mw3;

    .line 97
    .line 98
    sget-object v3, La/gqw0;->m:La/xx7;

    .line 99
    .line 100
    invoke-static {v2, v3, v6, v9}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    iget-wide v13, v6, La/fet;->T:J

    .line 105
    .line 106
    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    invoke-virtual {v6}, La/fet;->m()La/bh90;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    invoke-static {v6, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 119
    .line 120
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v6}, La/fet;->i0()V

    .line 124
    .line 125
    .line 126
    iget-boolean v7, v6, La/fet;->S:Z

    .line 127
    .line 128
    if-eqz v7, :cond_3

    .line 129
    .line 130
    sget-object v7, La/e7z;->u1:La/pcy;

    .line 131
    .line 132
    invoke-virtual {v6, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 133
    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_3
    invoke-virtual {v6}, La/fet;->r0()V

    .line 137
    .line 138
    .line 139
    :goto_2
    sget-object v7, La/gqw0;->x:La/shd;

    .line 140
    .line 141
    invoke-static {v6, v2, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 142
    .line 143
    .line 144
    sget-object v2, La/gqw0;->w:La/shd;

    .line 145
    .line 146
    invoke-static {v6, v5, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 147
    .line 148
    .line 149
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    sget-object v3, La/gqw0;->y:La/shd;

    .line 154
    .line 155
    invoke-static {v6, v2, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 156
    .line 157
    .line 158
    invoke-static {v6}, La/jpm0;->n(La/fet;)V

    .line 159
    .line 160
    .line 161
    sget-object v2, La/gqw0;->v:La/shd;

    .line 162
    .line 163
    invoke-static {v6, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 164
    .line 165
    .line 166
    iget-object v1, v0, La/nno0;->d:La/pz40;

    .line 167
    .line 168
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    check-cast v2, Ljava/util/List;

    .line 173
    .line 174
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    iget-object v3, v0, La/nno0;->b:La/xk80;

    .line 179
    .line 180
    sget-object v13, La/ukd;->a:La/cl5;

    .line 181
    .line 182
    if-nez v2, :cond_6

    .line 183
    .line 184
    iget v2, v0, La/nno0;->a:I

    .line 185
    .line 186
    if-ne v2, v4, :cond_6

    .line 187
    .line 188
    const v2, 0x1bffdf74

    .line 189
    .line 190
    .line 191
    invoke-virtual {v6, v2}, La/fet;->e0(I)V

    .line 192
    .line 193
    .line 194
    const/high16 v2, 0x3f800000    # 1.0f

    .line 195
    .line 196
    invoke-static {v12, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    sget-object v4, La/qmk;->a:La/zcl;

    .line 201
    .line 202
    invoke-static {v6}, La/xfn;->a(La/fet;)La/wfn;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    iget v4, v4, La/wfn;->f:F

    .line 207
    .line 208
    invoke-static {v6}, La/xfn;->a(La/fet;)La/wfn;

    .line 209
    .line 210
    .line 211
    move-result-object v5

    .line 212
    iget v5, v5, La/wfn;->f:F

    .line 213
    .line 214
    const/high16 v7, 0x41400000    # 12.0f

    .line 215
    .line 216
    invoke-static {v2, v4, v7, v5, v7}, La/s5x0;->M(La/mm40;FFFF)La/mm40;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    const-string v4, "SEGMENT_CONTENT"

    .line 221
    .line 222
    invoke-static {v2, v4}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    iget-object v4, v0, La/nno0;->e:La/l7m0;

    .line 227
    .line 228
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v4

    .line 232
    check-cast v4, La/dxh0;

    .line 233
    .line 234
    invoke-virtual {v6, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v5

    .line 238
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v7

    .line 242
    if-nez v5, :cond_4

    .line 243
    .line 244
    if-ne v7, v13, :cond_5

    .line 245
    .line 246
    :cond_4
    new-instance v7, La/ino0;

    .line 247
    .line 248
    invoke-direct {v7, v3, v8}, La/ino0;-><init>(La/xk80;B)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v6, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    :cond_5
    move-object v5, v7

    .line 255
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 256
    .line 257
    const/4 v7, 0x0

    .line 258
    invoke-static/range {v2 .. v7}, La/bdx;->G(La/mm40;La/xk80;La/dxh0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 259
    .line 260
    .line 261
    move-object v2, v3

    .line 262
    invoke-virtual {v6, v9}, La/fet;->r(Z)V

    .line 263
    .line 264
    .line 265
    goto :goto_3

    .line 266
    :cond_6
    move-object v2, v3

    .line 267
    const v3, 0x1c09d09a

    .line 268
    .line 269
    .line 270
    invoke-virtual {v6, v3}, La/fet;->e0(I)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v6, v9}, La/fet;->r(Z)V

    .line 274
    .line 275
    .line 276
    :goto_3
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    check-cast v3, Ljava/util/List;

    .line 281
    .line 282
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 283
    .line 284
    .line 285
    move-result v3

    .line 286
    iget-object v14, v0, La/nno0;->c:La/dk5;

    .line 287
    .line 288
    iget-object v4, v0, La/nno0;->g:La/pz40;

    .line 289
    .line 290
    iget-object v5, v0, La/nno0;->h:La/l7m0;

    .line 291
    .line 292
    if-nez v3, :cond_7

    .line 293
    .line 294
    const v3, 0x1c0b97ac

    .line 295
    .line 296
    .line 297
    invoke-virtual {v6, v3}, La/fet;->e0(I)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v6, v10}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v3

    .line 304
    check-cast v3, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 305
    .line 306
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 307
    .line 308
    .line 309
    move-result-wide v8

    .line 310
    invoke-static {v12, v8, v9, v11}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 311
    .line 312
    .line 313
    move-result-object v3

    .line 314
    const-string v7, "HORIZONTAL_PAGER"

    .line 315
    .line 316
    invoke-static {v3, v7}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    new-instance v13, La/z2w;

    .line 321
    .line 322
    iget-boolean v15, v0, La/nno0;->f:Z

    .line 323
    .line 324
    move-object/from16 v16, v1

    .line 325
    .line 326
    move-object/from16 v17, v4

    .line 327
    .line 328
    move-object/from16 v18, v5

    .line 329
    .line 330
    invoke-direct/range {v13 .. v18}, La/z2w;-><init>(La/dk5;ZLa/pz40;La/pz40;La/l7m0;)V

    .line 331
    .line 332
    .line 333
    const v0, -0x42ba8505

    .line 334
    .line 335
    .line 336
    invoke-static {v0, v13, v6}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 337
    .line 338
    .line 339
    move-result-object v15

    .line 340
    const/16 v18, 0x6000

    .line 341
    .line 342
    const/16 v19, 0x3efc

    .line 343
    .line 344
    const/4 v4, 0x0

    .line 345
    const/4 v5, 0x0

    .line 346
    move-object/from16 v16, v6

    .line 347
    .line 348
    const/4 v6, 0x0

    .line 349
    const/4 v7, 0x0

    .line 350
    const/4 v8, 0x0

    .line 351
    const/4 v9, 0x0

    .line 352
    const/4 v10, 0x0

    .line 353
    const/4 v11, 0x0

    .line 354
    const/4 v12, 0x0

    .line 355
    const/4 v13, 0x0

    .line 356
    const/4 v14, 0x0

    .line 357
    const/high16 v17, 0x6000000

    .line 358
    .line 359
    const/4 v0, 0x1

    .line 360
    const/4 v1, 0x0

    .line 361
    invoke-static/range {v2 .. v19}, La/q5x;->e(La/xk80;La/mm40;La/hh80;La/yi80;IFLa/yx7;La/afk0;ZLkotlin/jvm/functions/Function1;La/vj50;La/ifk0;La/vf80;La/ugd;La/fet;III)V

    .line 362
    .line 363
    .line 364
    move-object/from16 v6, v16

    .line 365
    .line 366
    invoke-virtual {v6, v1}, La/fet;->r(Z)V

    .line 367
    .line 368
    .line 369
    goto/16 :goto_6

    .line 370
    .line 371
    :cond_7
    move-object/from16 v17, v4

    .line 372
    .line 373
    move-object v2, v5

    .line 374
    move v0, v8

    .line 375
    move v1, v9

    .line 376
    const v3, 0x1c2517b7

    .line 377
    .line 378
    .line 379
    invoke-virtual {v6, v3}, La/fet;->e0(I)V

    .line 380
    .line 381
    .line 382
    invoke-interface/range {v17 .. v17}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v3

    .line 386
    check-cast v3, La/pk5;

    .line 387
    .line 388
    invoke-virtual {v6, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    move-result v4

    .line 392
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v5

    .line 396
    if-nez v4, :cond_8

    .line 397
    .line 398
    if-ne v5, v13, :cond_9

    .line 399
    .line 400
    :cond_8
    move-object/from16 v16, v14

    .line 401
    .line 402
    goto :goto_4

    .line 403
    :cond_9
    move-object v4, v14

    .line 404
    goto :goto_5

    .line 405
    :goto_4
    new-instance v14, La/tfo0;

    .line 406
    .line 407
    const/16 v20, 0x0

    .line 408
    .line 409
    const/16 v21, 0x12

    .line 410
    .line 411
    const/4 v15, 0x1

    .line 412
    const-class v17, La/dk5;

    .line 413
    .line 414
    const-string v18, "onEndOfPaginationReached"

    .line 415
    .line 416
    const-string v19, "onEndOfPaginationReached(Ljava/util/List;)V"

    .line 417
    .line 418
    invoke-direct/range {v14 .. v21}, La/tfo0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 419
    .line 420
    .line 421
    move-object/from16 v4, v16

    .line 422
    .line 423
    invoke-virtual {v6, v14}, La/fet;->o0(Ljava/lang/Object;)V

    .line 424
    .line 425
    .line 426
    move-object v5, v14

    .line 427
    :goto_5
    check-cast v5, La/jhy;

    .line 428
    .line 429
    invoke-virtual {v6, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    move-result v7

    .line 433
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v8

    .line 437
    if-nez v7, :cond_a

    .line 438
    .line 439
    if-ne v8, v13, :cond_b

    .line 440
    .line 441
    :cond_a
    new-instance v14, La/cym0;

    .line 442
    .line 443
    const/16 v20, 0x0

    .line 444
    .line 445
    const/16 v21, 0x7

    .line 446
    .line 447
    const/4 v15, 0x0

    .line 448
    const-class v17, La/dk5;

    .line 449
    .line 450
    const-string v18, "onRefreshAfterError"

    .line 451
    .line 452
    const-string v19, "onRefreshAfterError()V"

    .line 453
    .line 454
    move-object/from16 v16, v4

    .line 455
    .line 456
    invoke-direct/range {v14 .. v21}, La/cym0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v6, v14}, La/fet;->o0(Ljava/lang/Object;)V

    .line 460
    .line 461
    .line 462
    move-object v8, v14

    .line 463
    :cond_b
    check-cast v8, La/jhy;

    .line 464
    .line 465
    invoke-virtual {v6, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 466
    .line 467
    .line 468
    move-result v7

    .line 469
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v9

    .line 473
    if-nez v7, :cond_c

    .line 474
    .line 475
    if-ne v9, v13, :cond_d

    .line 476
    .line 477
    :cond_c
    new-instance v14, La/tfo0;

    .line 478
    .line 479
    const/16 v20, 0x0

    .line 480
    .line 481
    const/16 v21, 0x13

    .line 482
    .line 483
    const/4 v15, 0x1

    .line 484
    const-class v17, La/dk5;

    .line 485
    .line 486
    const-string v18, "onErrorWhenRequestNextPage"

    .line 487
    .line 488
    const-string v19, "onErrorWhenRequestNextPage(Ljava/lang/Throwable;)V"

    .line 489
    .line 490
    move-object/from16 v16, v4

    .line 491
    .line 492
    invoke-direct/range {v14 .. v21}, La/tfo0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v6, v14}, La/fet;->o0(Ljava/lang/Object;)V

    .line 496
    .line 497
    .line 498
    move-object v9, v14

    .line 499
    :cond_d
    check-cast v9, La/jhy;

    .line 500
    .line 501
    invoke-virtual {v6, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 502
    .line 503
    .line 504
    move-result v7

    .line 505
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v10

    .line 509
    if-nez v7, :cond_e

    .line 510
    .line 511
    if-ne v10, v13, :cond_f

    .line 512
    .line 513
    :cond_e
    new-instance v14, La/tfo0;

    .line 514
    .line 515
    const/16 v20, 0x0

    .line 516
    .line 517
    const/16 v21, 0x14

    .line 518
    .line 519
    const/4 v15, 0x1

    .line 520
    const-class v17, La/dk5;

    .line 521
    .line 522
    const-string v18, "onErrorWhenRequest"

    .line 523
    .line 524
    const-string v19, "onErrorWhenRequest(Ljava/lang/Throwable;)V"

    .line 525
    .line 526
    move-object/from16 v16, v4

    .line 527
    .line 528
    invoke-direct/range {v14 .. v21}, La/tfo0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 529
    .line 530
    .line 531
    invoke-virtual {v6, v14}, La/fet;->o0(Ljava/lang/Object;)V

    .line 532
    .line 533
    .line 534
    move-object v10, v14

    .line 535
    :cond_f
    check-cast v10, La/jhy;

    .line 536
    .line 537
    const/4 v7, 0x3

    .line 538
    invoke-static {v1, v1, v6, v1, v7}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 539
    .line 540
    .line 541
    move-result-object v7

    .line 542
    invoke-virtual {v6, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 543
    .line 544
    .line 545
    move-result v11

    .line 546
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v12

    .line 550
    if-nez v11, :cond_10

    .line 551
    .line 552
    if-ne v12, v13, :cond_11

    .line 553
    .line 554
    :cond_10
    new-instance v14, La/cym0;

    .line 555
    .line 556
    const/16 v20, 0x0

    .line 557
    .line 558
    const/16 v21, 0x8

    .line 559
    .line 560
    const/4 v15, 0x0

    .line 561
    const-class v17, La/dk5;

    .line 562
    .line 563
    const-string v18, "onRefresh"

    .line 564
    .line 565
    const-string v19, "onRefresh()V"

    .line 566
    .line 567
    move-object/from16 v16, v4

    .line 568
    .line 569
    invoke-direct/range {v14 .. v21}, La/cym0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v6, v14}, La/fet;->o0(Ljava/lang/Object;)V

    .line 573
    .line 574
    .line 575
    move-object v12, v14

    .line 576
    :cond_11
    check-cast v12, La/jhy;

    .line 577
    .line 578
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v2

    .line 582
    move-object v4, v2

    .line 583
    check-cast v4, La/jk5;

    .line 584
    .line 585
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 586
    .line 587
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 588
    .line 589
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 590
    .line 591
    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 592
    .line 593
    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 594
    .line 595
    const/4 v11, 0x0

    .line 596
    move-object v2, v10

    .line 597
    move-object v10, v6

    .line 598
    move-object v6, v2

    .line 599
    move-object v2, v3

    .line 600
    move-object v3, v5

    .line 601
    move-object v5, v9

    .line 602
    move-object v9, v7

    .line 603
    move-object v7, v8

    .line 604
    move-object v8, v12

    .line 605
    invoke-static/range {v2 .. v11}, La/y0x0;->n(La/pk5;Lkotlin/jvm/functions/Function1;La/jk5;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/xcz;La/fet;I)V

    .line 606
    .line 607
    .line 608
    move-object v6, v10

    .line 609
    invoke-virtual {v6, v1}, La/fet;->r(Z)V

    .line 610
    .line 611
    .line 612
    :goto_6
    invoke-virtual {v6, v0}, La/fet;->r(Z)V

    .line 613
    .line 614
    .line 615
    goto :goto_7

    .line 616
    :cond_12
    invoke-virtual {v6}, La/fet;->X()V

    .line 617
    .line 618
    .line 619
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 620
    .line 621
    return-object v0
.end method
