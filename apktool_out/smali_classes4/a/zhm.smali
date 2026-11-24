.class public final synthetic La/zhm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/jie0;

.field public final synthetic b:F

.field public final synthetic c:Z

.field public final synthetic d:La/rah0;

.field public final synthetic e:La/c5n0;

.field public final synthetic f:La/a4x;

.field public final synthetic g:La/pz40;

.field public final synthetic h:Lkotlin/jvm/functions/Function1;

.field public final synthetic i:La/vne;

.field public final synthetic j:Ljava/util/ArrayList;

.field public final synthetic k:La/p4e;

.field public final synthetic l:F

.field public final synthetic m:F


# direct methods
.method public synthetic constructor <init>(La/jie0;FZLa/rah0;La/c5n0;La/a4x;La/pz40;Lkotlin/jvm/functions/Function1;La/vne;Ljava/util/ArrayList;La/p4e;FF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/zhm;->a:La/jie0;

    iput p2, p0, La/zhm;->b:F

    iput-boolean p3, p0, La/zhm;->c:Z

    iput-object p4, p0, La/zhm;->d:La/rah0;

    iput-object p5, p0, La/zhm;->e:La/c5n0;

    iput-object p6, p0, La/zhm;->f:La/a4x;

    iput-object p7, p0, La/zhm;->g:La/pz40;

    iput-object p8, p0, La/zhm;->h:Lkotlin/jvm/functions/Function1;

    iput-object p9, p0, La/zhm;->i:La/vne;

    iput-object p10, p0, La/zhm;->j:Ljava/util/ArrayList;

    iput-object p11, p0, La/zhm;->k:La/p4e;

    iput p12, p0, La/zhm;->l:F

    iput p13, p0, La/zhm;->m:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v5, p1

    .line 4
    .line 5
    check-cast v5, La/fet;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    and-int/lit8 v2, v1, 0x3

    .line 16
    .line 17
    const/4 v8, 0x0

    .line 18
    const/4 v9, 0x1

    .line 19
    const/4 v10, 0x2

    .line 20
    if-eq v2, v10, :cond_0

    .line 21
    .line 22
    move v2, v9

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v8

    .line 25
    :goto_0
    and-int/2addr v1, v9

    .line 26
    invoke-virtual {v5, v1, v2}, La/fet;->U(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_e

    .line 31
    .line 32
    iget-object v1, v0, La/zhm;->a:La/jie0;

    .line 33
    .line 34
    iget v1, v1, La/jie0;->a:F

    .line 35
    .line 36
    sget-object v11, La/ihn;->a:La/zsf;

    .line 37
    .line 38
    const/16 v12, 0x12c

    .line 39
    .line 40
    invoke-static {v12, v8, v11, v10}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    const/4 v6, 0x0

    .line 45
    const/16 v7, 0x1c

    .line 46
    .line 47
    const/4 v3, 0x0

    .line 48
    const/4 v4, 0x0

    .line 49
    invoke-static/range {v1 .. v7}, La/d43;->b(FLa/j73;Ljava/lang/String;Lkotlin/jvm/functions/Function1;La/fet;II)La/l7m0;

    .line 50
    .line 51
    .line 52
    move-result-object v13

    .line 53
    invoke-static {v12, v8, v11, v10}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    iget v1, v0, La/zhm;->b:F

    .line 58
    .line 59
    invoke-static/range {v1 .. v7}, La/d43;->b(FLa/j73;Ljava/lang/String;Lkotlin/jvm/functions/Function1;La/fet;II)La/l7m0;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const/16 v2, 0xe

    .line 64
    .line 65
    const/high16 v11, 0x3f800000    # 1.0f

    .line 66
    .line 67
    sget-object v12, La/jm40;->b:La/jm40;

    .line 68
    .line 69
    iget-boolean v3, v0, La/zhm;->c:Z

    .line 70
    .line 71
    iget-object v4, v0, La/zhm;->d:La/rah0;

    .line 72
    .line 73
    if-eqz v3, :cond_1

    .line 74
    .line 75
    invoke-static {v12, v11}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    goto :goto_1

    .line 80
    :cond_1
    invoke-static {v12, v4, v8, v2}, La/wha0;->P(La/mm40;La/rah0;ZI)La/mm40;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    :goto_1
    sget-object v7, La/gqw0;->a:La/zx7;

    .line 85
    .line 86
    invoke-static {v7, v8}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    iget-wide v14, v5, La/fet;->T:J

    .line 91
    .line 92
    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    .line 93
    .line 94
    .line 95
    move-result v14

    .line 96
    invoke-virtual {v5}, La/fet;->m()La/bh90;

    .line 97
    .line 98
    .line 99
    move-result-object v15

    .line 100
    invoke-static {v5, v6}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    sget-object v16, La/mkd;->c0:La/gqw0;

    .line 105
    .line 106
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v5}, La/fet;->i0()V

    .line 110
    .line 111
    .line 112
    iget-boolean v9, v5, La/fet;->S:Z

    .line 113
    .line 114
    sget-object v2, La/e7z;->u1:La/pcy;

    .line 115
    .line 116
    if-eqz v9, :cond_2

    .line 117
    .line 118
    invoke-virtual {v5, v2}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_2
    invoke-virtual {v5}, La/fet;->r0()V

    .line 123
    .line 124
    .line 125
    :goto_2
    sget-object v9, La/gqw0;->x:La/shd;

    .line 126
    .line 127
    invoke-static {v5, v7, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 128
    .line 129
    .line 130
    sget-object v7, La/gqw0;->w:La/shd;

    .line 131
    .line 132
    invoke-static {v5, v15, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 133
    .line 134
    .line 135
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 136
    .line 137
    .line 138
    move-result-object v14

    .line 139
    sget-object v15, La/gqw0;->y:La/shd;

    .line 140
    .line 141
    invoke-static {v5, v14, v15}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 142
    .line 143
    .line 144
    invoke-static {v5}, La/jpm0;->n(La/fet;)V

    .line 145
    .line 146
    .line 147
    sget-object v14, La/gqw0;->v:La/shd;

    .line 148
    .line 149
    invoke-static {v5, v6, v14}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v5, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v6

    .line 156
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v10

    .line 160
    move/from16 v17, v6

    .line 161
    .line 162
    sget-object v6, La/ukd;->a:La/cl5;

    .line 163
    .line 164
    if-nez v17, :cond_3

    .line 165
    .line 166
    if-ne v10, v6, :cond_4

    .line 167
    .line 168
    :cond_3
    new-instance v10, La/x1d;

    .line 169
    .line 170
    const/16 v11, 0x15

    .line 171
    .line 172
    invoke-direct {v10, v13, v11}, La/x1d;-><init>(La/l7m0;B)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v5, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    :cond_4
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 179
    .line 180
    invoke-static {v12, v10}, La/ffb0;->P(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 181
    .line 182
    .line 183
    move-result-object v10

    .line 184
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    check-cast v1, Ljava/lang/Number;

    .line 189
    .line 190
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    iget-object v11, v0, La/zhm;->e:La/c5n0;

    .line 195
    .line 196
    invoke-interface {v11, v1}, La/w6k;->s0(F)F

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    sget-object v11, La/qmk;->a:La/zcl;

    .line 201
    .line 202
    const/high16 v11, 0x42100000    # 36.0f

    .line 203
    .line 204
    invoke-static {v10, v1, v11}, La/o7k0;->p(La/mm40;FF)La/mm40;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    const/high16 v10, 0x41400000    # 12.0f

    .line 209
    .line 210
    invoke-static {v10}, La/vgg0;->a(F)La/ugg0;

    .line 211
    .line 212
    .line 213
    move-result-object v11

    .line 214
    invoke-static {v1, v11}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v11

    .line 222
    if-ne v11, v6, :cond_5

    .line 223
    .line 224
    new-instance v11, La/aim;

    .line 225
    .line 226
    invoke-direct {v11, v8}, La/aim;-><init>(B)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v5, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    :cond_5
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 233
    .line 234
    invoke-static {v1, v11}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    sget-object v11, La/m8m0;->a:La/zfn;

    .line 239
    .line 240
    invoke-virtual {v5, v11}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v11

    .line 244
    check-cast v11, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 245
    .line 246
    move v13, v10

    .line 247
    invoke-virtual {v11}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite30-0d7_KjU()J

    .line 248
    .line 249
    .line 250
    move-result-wide v10

    .line 251
    move/from16 v17, v13

    .line 252
    .line 253
    invoke-static/range {v17 .. v17}, La/vgg0;->a(F)La/ugg0;

    .line 254
    .line 255
    .line 256
    move-result-object v13

    .line 257
    invoke-static {v1, v10, v11, v13}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    invoke-static {v8, v5, v1}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 262
    .line 263
    .line 264
    const/high16 v1, 0x3f800000    # 1.0f

    .line 265
    .line 266
    invoke-static {v12, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 267
    .line 268
    .line 269
    move-result-object v10

    .line 270
    const/4 v1, 0x0

    .line 271
    move/from16 v13, v17

    .line 272
    .line 273
    const/4 v11, 0x2

    .line 274
    invoke-static {v10, v13, v1, v11}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    if-eqz v3, :cond_6

    .line 279
    .line 280
    sget-object v10, La/uc9;->f:La/nw3;

    .line 281
    .line 282
    goto :goto_3

    .line 283
    :cond_6
    new-instance v10, La/qw3;

    .line 284
    .line 285
    new-instance v11, La/jf4;

    .line 286
    .line 287
    const/16 v13, 0xe

    .line 288
    .line 289
    invoke-direct {v11, v13}, La/jf4;-><init>(B)V

    .line 290
    .line 291
    .line 292
    const/high16 v13, 0x40800000    # 4.0f

    .line 293
    .line 294
    const/4 v8, 0x1

    .line 295
    invoke-direct {v10, v13, v8, v11}, La/qw3;-><init>(FZLa/rw3;)V

    .line 296
    .line 297
    .line 298
    :goto_3
    sget-object v8, La/gqw0;->k:La/yx7;

    .line 299
    .line 300
    const/16 v11, 0x30

    .line 301
    .line 302
    invoke-static {v10, v8, v5, v11}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 303
    .line 304
    .line 305
    move-result-object v8

    .line 306
    iget-wide v10, v5, La/fet;->T:J

    .line 307
    .line 308
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 309
    .line 310
    .line 311
    move-result v10

    .line 312
    invoke-virtual {v5}, La/fet;->m()La/bh90;

    .line 313
    .line 314
    .line 315
    move-result-object v11

    .line 316
    invoke-static {v5, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    invoke-virtual {v5}, La/fet;->i0()V

    .line 321
    .line 322
    .line 323
    iget-boolean v13, v5, La/fet;->S:Z

    .line 324
    .line 325
    if-eqz v13, :cond_7

    .line 326
    .line 327
    invoke-virtual {v5, v2}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 328
    .line 329
    .line 330
    goto :goto_4

    .line 331
    :cond_7
    invoke-virtual {v5}, La/fet;->r0()V

    .line 332
    .line 333
    .line 334
    :goto_4
    invoke-static {v5, v8, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 335
    .line 336
    .line 337
    invoke-static {v5, v11, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 338
    .line 339
    .line 340
    invoke-static {v10, v5, v15, v5}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 341
    .line 342
    .line 343
    const v2, 0x7cc62cec

    .line 344
    .line 345
    .line 346
    iget-object v7, v0, La/zhm;->f:La/a4x;

    .line 347
    .line 348
    invoke-static {v5, v1, v14, v2, v7}, La/h97;->o(La/fet;La/mm40;La/shd;ILa/a4x;)Ljava/util/Iterator;

    .line 349
    .line 350
    .line 351
    move-result-object v8

    .line 352
    const/4 v1, 0x0

    .line 353
    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 354
    .line 355
    .line 356
    move-result v2

    .line 357
    if-eqz v2, :cond_d

    .line 358
    .line 359
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    add-int/lit8 v9, v1, 0x1

    .line 364
    .line 365
    if-ltz v1, :cond_c

    .line 366
    .line 367
    check-cast v2, La/e0x;

    .line 368
    .line 369
    if-eqz v3, :cond_8

    .line 370
    .line 371
    new-instance v7, La/x7z;

    .line 372
    .line 373
    const/high16 v10, 0x3f800000    # 1.0f

    .line 374
    .line 375
    const/4 v11, 0x1

    .line 376
    invoke-direct {v7, v10, v11}, La/x7z;-><init>(FZ)V

    .line 377
    .line 378
    .line 379
    goto :goto_6

    .line 380
    :cond_8
    const/high16 v10, 0x3f800000    # 1.0f

    .line 381
    .line 382
    move-object v7, v12

    .line 383
    :goto_6
    iget-object v11, v0, La/zhm;->g:La/pz40;

    .line 384
    .line 385
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v11

    .line 389
    check-cast v11, Ljava/lang/Number;

    .line 390
    .line 391
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 392
    .line 393
    .line 394
    move-result v11

    .line 395
    if-ne v1, v11, :cond_9

    .line 396
    .line 397
    const/4 v11, 0x1

    .line 398
    goto :goto_7

    .line 399
    :cond_9
    const/4 v11, 0x0

    .line 400
    :goto_7
    iget-object v15, v0, La/zhm;->h:Lkotlin/jvm/functions/Function1;

    .line 401
    .line 402
    invoke-virtual {v5, v15}, La/fet;->g(Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    move-result v13

    .line 406
    invoke-virtual {v5, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    move-result v14

    .line 410
    or-int/2addr v13, v14

    .line 411
    invoke-virtual {v5, v3}, La/fet;->h(Z)Z

    .line 412
    .line 413
    .line 414
    move-result v14

    .line 415
    or-int/2addr v13, v14

    .line 416
    iget-object v14, v0, La/zhm;->i:La/vne;

    .line 417
    .line 418
    invoke-virtual {v5, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 419
    .line 420
    .line 421
    move-result v16

    .line 422
    or-int v13, v13, v16

    .line 423
    .line 424
    invoke-virtual {v5, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 425
    .line 426
    .line 427
    move-result v16

    .line 428
    or-int v13, v13, v16

    .line 429
    .line 430
    invoke-virtual {v5, v1}, La/fet;->e(I)Z

    .line 431
    .line 432
    .line 433
    move-result v16

    .line 434
    or-int v13, v13, v16

    .line 435
    .line 436
    iget-object v10, v0, La/zhm;->j:Ljava/util/ArrayList;

    .line 437
    .line 438
    invoke-virtual {v5, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    move-result v16

    .line 442
    or-int v13, v13, v16

    .line 443
    .line 444
    move/from16 v20, v1

    .line 445
    .line 446
    iget-object v1, v0, La/zhm;->k:La/p4e;

    .line 447
    .line 448
    move-object/from16 v16, v2

    .line 449
    .line 450
    move/from16 v17, v3

    .line 451
    .line 452
    iget-wide v2, v1, La/p4e;->a:J

    .line 453
    .line 454
    invoke-virtual {v5, v2, v3}, La/fet;->f(J)Z

    .line 455
    .line 456
    .line 457
    move-result v2

    .line 458
    or-int/2addr v2, v13

    .line 459
    iget v3, v0, La/zhm;->l:F

    .line 460
    .line 461
    invoke-virtual {v5, v3}, La/fet;->d(F)Z

    .line 462
    .line 463
    .line 464
    move-result v13

    .line 465
    or-int/2addr v2, v13

    .line 466
    iget v13, v0, La/zhm;->m:F

    .line 467
    .line 468
    invoke-virtual {v5, v13}, La/fet;->d(F)Z

    .line 469
    .line 470
    .line 471
    move-result v18

    .line 472
    or-int v2, v2, v18

    .line 473
    .line 474
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    if-nez v2, :cond_a

    .line 479
    .line 480
    if-ne v0, v6, :cond_b

    .line 481
    .line 482
    :cond_a
    move-object/from16 v18, v14

    .line 483
    .line 484
    goto :goto_8

    .line 485
    :cond_b
    move-object/from16 v19, v4

    .line 486
    .line 487
    goto :goto_9

    .line 488
    :goto_8
    new-instance v14, La/bim;

    .line 489
    .line 490
    move-object/from16 v22, v1

    .line 491
    .line 492
    move/from16 v23, v3

    .line 493
    .line 494
    move-object/from16 v19, v4

    .line 495
    .line 496
    move-object/from16 v21, v10

    .line 497
    .line 498
    move/from16 v24, v13

    .line 499
    .line 500
    invoke-direct/range {v14 .. v24}, La/bim;-><init>(Lkotlin/jvm/functions/Function1;La/e0x;ZLa/vne;La/rah0;ILjava/util/ArrayList;La/p4e;FF)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v5, v14}, La/fet;->o0(Ljava/lang/Object;)V

    .line 504
    .line 505
    .line 506
    move-object v0, v14

    .line 507
    :goto_9
    move-object v4, v0

    .line 508
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 509
    .line 510
    move-object v0, v6

    .line 511
    const/4 v6, 0x0

    .line 512
    move-object v1, v7

    .line 513
    const/4 v7, 0x0

    .line 514
    move v3, v11

    .line 515
    move-object/from16 v2, v16

    .line 516
    .line 517
    invoke-static/range {v1 .. v7}, La/bkb;->w(La/mm40;La/e0x;ZLkotlin/jvm/functions/Function1;La/fet;II)V

    .line 518
    .line 519
    .line 520
    move-object v6, v0

    .line 521
    move v1, v9

    .line 522
    move/from16 v3, v17

    .line 523
    .line 524
    move-object/from16 v4, v19

    .line 525
    .line 526
    move-object/from16 v0, p0

    .line 527
    .line 528
    goto/16 :goto_5

    .line 529
    .line 530
    :cond_c
    invoke-static {}, La/q3d;->p()V

    .line 531
    .line 532
    .line 533
    const/4 v0, 0x0

    .line 534
    throw v0

    .line 535
    :cond_d
    const/4 v0, 0x0

    .line 536
    const/4 v8, 0x1

    .line 537
    invoke-static {v5, v0, v8, v8}, La/ohs0;->x(La/fet;ZZZ)V

    .line 538
    .line 539
    .line 540
    goto :goto_a

    .line 541
    :cond_e
    invoke-virtual {v5}, La/fet;->X()V

    .line 542
    .line 543
    .line 544
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 545
    .line 546
    return-object v0
.end method
