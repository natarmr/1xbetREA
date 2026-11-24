.class public final synthetic La/xhq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function0;

.field public final synthetic c:La/jjl;

.field public final synthetic d:J

.field public final synthetic e:J

.field public final synthetic f:J


# direct methods
.method public synthetic constructor <init>(JLkotlin/jvm/functions/Function0;La/jjl;JJ)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/xhq;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La/xhq;->d:J

    iput-object p3, p0, La/xhq;->b:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, La/xhq;->c:La/jjl;

    iput-wide p5, p0, La/xhq;->e:J

    iput-wide p7, p0, La/xhq;->f:J

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;La/jjl;JJJ)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/xhq;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/xhq;->b:Lkotlin/jvm/functions/Function0;

    iput-object p2, p0, La/xhq;->c:La/jjl;

    iput-wide p3, p0, La/xhq;->d:J

    iput-wide p5, p0, La/xhq;->e:J

    iput-wide p7, p0, La/xhq;->f:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/xhq;->a:B

    .line 4
    .line 5
    const/high16 v8, 0x41000000    # 8.0f

    .line 6
    .line 7
    sget-object v9, La/e7z;->u1:La/pcy;

    .line 8
    .line 9
    const/16 v10, 0x30

    .line 10
    .line 11
    sget-object v11, La/jm40;->b:La/jm40;

    .line 12
    .line 13
    const/4 v12, 0x2

    .line 14
    const/4 v13, 0x1

    .line 15
    iget-wide v14, v0, La/xhq;->e:J

    .line 16
    .line 17
    iget-wide v2, v0, La/xhq;->d:J

    .line 18
    .line 19
    iget-object v4, v0, La/xhq;->c:La/jjl;

    .line 20
    .line 21
    const/high16 v5, 0x3f800000    # 1.0f

    .line 22
    .line 23
    packed-switch v1, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    move-object/from16 v1, p1

    .line 27
    .line 28
    check-cast v1, La/fet;

    .line 29
    .line 30
    move-object/from16 v16, p2

    .line 31
    .line 32
    check-cast v16, Ljava/lang/Integer;

    .line 33
    .line 34
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v16

    .line 38
    and-int/lit8 v6, v16, 0x3

    .line 39
    .line 40
    if-eq v6, v12, :cond_0

    .line 41
    .line 42
    move v6, v13

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 v6, 0x0

    .line 45
    :goto_0
    and-int/lit8 v7, v16, 0x1

    .line 46
    .line 47
    invoke-virtual {v1, v7, v6}, La/fet;->U(IZ)Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-eqz v6, :cond_4

    .line 52
    .line 53
    new-instance v6, La/x7z;

    .line 54
    .line 55
    invoke-direct {v6, v5, v13}, La/x7z;-><init>(FZ)V

    .line 56
    .line 57
    .line 58
    const/16 v23, 0x0

    .line 59
    .line 60
    const/16 v25, 0x1c

    .line 61
    .line 62
    const/16 v20, 0x0

    .line 63
    .line 64
    const/16 v21, 0x0

    .line 65
    .line 66
    const/16 v22, 0x0

    .line 67
    .line 68
    iget-object v7, v0, La/xhq;->b:Lkotlin/jvm/functions/Function0;

    .line 69
    .line 70
    move-object/from16 v19, v6

    .line 71
    .line 72
    move-object/from16 v24, v7

    .line 73
    .line 74
    invoke-static/range {v19 .. v25}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    sget-object v7, La/gqw0;->k:La/yx7;

    .line 79
    .line 80
    sget-object v5, La/uc9;->a:La/lw3;

    .line 81
    .line 82
    invoke-static {v5, v7, v1, v10}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    move-wide/from16 v19, v14

    .line 87
    .line 88
    iget-wide v13, v1, La/fet;->T:J

    .line 89
    .line 90
    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    .line 91
    .line 92
    .line 93
    move-result v10

    .line 94
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 95
    .line 96
    .line 97
    move-result-object v13

    .line 98
    invoke-static {v1, v6}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    sget-object v14, La/mkd;->c0:La/gqw0;

    .line 103
    .line 104
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1}, La/fet;->i0()V

    .line 108
    .line 109
    .line 110
    iget-boolean v14, v1, La/fet;->S:Z

    .line 111
    .line 112
    if-eqz v14, :cond_1

    .line 113
    .line 114
    invoke-virtual {v1, v9}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_1
    invoke-virtual {v1}, La/fet;->r0()V

    .line 119
    .line 120
    .line 121
    :goto_1
    sget-object v14, La/gqw0;->x:La/shd;

    .line 122
    .line 123
    invoke-static {v1, v5, v14}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 124
    .line 125
    .line 126
    sget-object v5, La/gqw0;->w:La/shd;

    .line 127
    .line 128
    invoke-static {v1, v13, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 129
    .line 130
    .line 131
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v10

    .line 135
    sget-object v13, La/gqw0;->y:La/shd;

    .line 136
    .line 137
    invoke-static {v1, v10, v13}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 138
    .line 139
    .line 140
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 141
    .line 142
    .line 143
    sget-object v10, La/gqw0;->v:La/shd;

    .line 144
    .line 145
    invoke-static {v1, v6, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 146
    .line 147
    .line 148
    sget-object v6, La/qmk;->a:La/zcl;

    .line 149
    .line 150
    const/4 v6, 0x0

    .line 151
    invoke-static {v11, v8, v6, v12}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    const/high16 v8, 0x42200000    # 40.0f

    .line 156
    .line 157
    invoke-static {v6, v8}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    const/4 v7, 0x1

    .line 162
    const/high16 v12, 0x3f800000    # 1.0f

    .line 163
    .line 164
    invoke-static {v12, v6, v7}, La/dw9;->h(FLa/mm40;Z)La/mm40;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    sget-object v12, La/uc9;->e:La/nw3;

    .line 169
    .line 170
    sget-object v15, La/gqw0;->m:La/xx7;

    .line 171
    .line 172
    const/16 v7, 0x36

    .line 173
    .line 174
    invoke-static {v12, v15, v1, v7}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 175
    .line 176
    .line 177
    move-result-object v7

    .line 178
    move-object v15, v9

    .line 179
    iget-wide v8, v1, La/fet;->T:J

    .line 180
    .line 181
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 182
    .line 183
    .line 184
    move-result v8

    .line 185
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 186
    .line 187
    .line 188
    move-result-object v9

    .line 189
    invoke-static {v1, v6}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 190
    .line 191
    .line 192
    move-result-object v6

    .line 193
    invoke-virtual {v1}, La/fet;->i0()V

    .line 194
    .line 195
    .line 196
    iget-boolean v12, v1, La/fet;->S:Z

    .line 197
    .line 198
    if-eqz v12, :cond_2

    .line 199
    .line 200
    invoke-virtual {v1, v15}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 201
    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_2
    invoke-virtual {v1}, La/fet;->r0()V

    .line 205
    .line 206
    .line 207
    :goto_2
    invoke-static {v1, v7, v14}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 208
    .line 209
    .line 210
    invoke-static {v1, v9, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 211
    .line 212
    .line 213
    invoke-static {v8, v1, v13, v1}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 214
    .line 215
    .line 216
    invoke-static {v1, v6, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 217
    .line 218
    .line 219
    sget-object v6, La/bmd;->n:La/zfn;

    .line 220
    .line 221
    sget-object v7, La/k6z;->a:La/k6z;

    .line 222
    .line 223
    invoke-virtual {v6, v7}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 224
    .line 225
    .line 226
    move-result-object v8

    .line 227
    new-instance v9, La/aiq;

    .line 228
    .line 229
    const/4 v12, 0x4

    .line 230
    invoke-direct {v9, v4, v2, v3, v12}, La/aiq;-><init>(La/jjl;JB)V

    .line 231
    .line 232
    .line 233
    const v2, 0x68588201

    .line 234
    .line 235
    .line 236
    invoke-static {v2, v9, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    const/16 v3, 0x38

    .line 241
    .line 242
    invoke-static {v8, v2, v1, v3}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v6, v7}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    new-instance v6, La/aiq;

    .line 250
    .line 251
    const/4 v7, 0x5

    .line 252
    move-wide/from16 v8, v19

    .line 253
    .line 254
    invoke-direct {v6, v4, v8, v9, v7}, La/aiq;-><init>(La/jjl;JB)V

    .line 255
    .line 256
    .line 257
    const v4, -0x23b979c8

    .line 258
    .line 259
    .line 260
    invoke-static {v4, v6, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 261
    .line 262
    .line 263
    move-result-object v4

    .line 264
    invoke-static {v2, v4, v1, v3}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 265
    .line 266
    .line 267
    const/4 v7, 0x1

    .line 268
    invoke-virtual {v1, v7}, La/fet;->r(Z)V

    .line 269
    .line 270
    .line 271
    const/high16 v2, 0x41c00000    # 24.0f

    .line 272
    .line 273
    const/high16 v3, 0x42200000    # 40.0f

    .line 274
    .line 275
    invoke-static {v11, v2, v3}, La/o7k0;->p(La/mm40;FF)La/mm40;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    sget-object v3, La/gqw0;->d:La/zx7;

    .line 280
    .line 281
    const/4 v4, 0x0

    .line 282
    invoke-static {v3, v4}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    iget-wide v8, v1, La/fet;->T:J

    .line 287
    .line 288
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 289
    .line 290
    .line 291
    move-result v4

    .line 292
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 293
    .line 294
    .line 295
    move-result-object v6

    .line 296
    invoke-static {v1, v2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    invoke-virtual {v1}, La/fet;->i0()V

    .line 301
    .line 302
    .line 303
    iget-boolean v8, v1, La/fet;->S:Z

    .line 304
    .line 305
    if-eqz v8, :cond_3

    .line 306
    .line 307
    invoke-virtual {v1, v15}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 308
    .line 309
    .line 310
    goto :goto_3

    .line 311
    :cond_3
    invoke-virtual {v1}, La/fet;->r0()V

    .line 312
    .line 313
    .line 314
    :goto_3
    invoke-static {v1, v3, v14}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 315
    .line 316
    .line 317
    invoke-static {v1, v6, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 318
    .line 319
    .line 320
    invoke-static {v4, v1, v13, v1}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 321
    .line 322
    .line 323
    invoke-static {v1, v2, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 324
    .line 325
    .line 326
    const/high16 v2, 0x41800000    # 16.0f

    .line 327
    .line 328
    invoke-static {v11, v2}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 329
    .line 330
    .line 331
    move-result-object v18

    .line 332
    const/4 v2, 0x6

    .line 333
    const v3, 0x7f080815

    .line 334
    .line 335
    .line 336
    invoke-static {v3, v2, v1}, La/jpm0;->t(IILa/fet;)La/r2x;

    .line 337
    .line 338
    .line 339
    move-result-object v16

    .line 340
    const/16 v22, 0x30

    .line 341
    .line 342
    const/16 v23, 0x0

    .line 343
    .line 344
    const/16 v17, 0x0

    .line 345
    .line 346
    iget-wide v2, v0, La/xhq;->f:J

    .line 347
    .line 348
    move-object/from16 v21, v1

    .line 349
    .line 350
    move-wide/from16 v19, v2

    .line 351
    .line 352
    invoke-static/range {v16 .. v23}, La/dww;->b(La/r2x;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 353
    .line 354
    .line 355
    move-object/from16 v0, v21

    .line 356
    .line 357
    const/4 v7, 0x1

    .line 358
    invoke-virtual {v0, v7}, La/fet;->r(Z)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v0, v7}, La/fet;->r(Z)V

    .line 362
    .line 363
    .line 364
    goto :goto_4

    .line 365
    :cond_4
    move-object v0, v1

    .line 366
    invoke-virtual {v0}, La/fet;->X()V

    .line 367
    .line 368
    .line 369
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 370
    .line 371
    return-object v0

    .line 372
    :pswitch_0
    move-wide v5, v14

    .line 373
    move-object v15, v9

    .line 374
    move-object/from16 v1, p1

    .line 375
    .line 376
    check-cast v1, La/fet;

    .line 377
    .line 378
    move-object/from16 v9, p2

    .line 379
    .line 380
    check-cast v9, Ljava/lang/Integer;

    .line 381
    .line 382
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 383
    .line 384
    .line 385
    move-result v9

    .line 386
    and-int/lit8 v13, v9, 0x3

    .line 387
    .line 388
    if-eq v13, v12, :cond_5

    .line 389
    .line 390
    const/4 v7, 0x1

    .line 391
    :goto_5
    const/4 v13, 0x1

    .line 392
    goto :goto_6

    .line 393
    :cond_5
    const/4 v7, 0x0

    .line 394
    goto :goto_5

    .line 395
    :goto_6
    and-int/2addr v9, v13

    .line 396
    invoke-virtual {v1, v9, v7}, La/fet;->U(IZ)Z

    .line 397
    .line 398
    .line 399
    move-result v7

    .line 400
    if-eqz v7, :cond_9

    .line 401
    .line 402
    new-instance v9, La/x7z;

    .line 403
    .line 404
    const/high16 v7, 0x3f800000    # 1.0f

    .line 405
    .line 406
    invoke-direct {v9, v7, v13}, La/x7z;-><init>(FZ)V

    .line 407
    .line 408
    .line 409
    sget-object v13, La/qmk;->a:La/zcl;

    .line 410
    .line 411
    const/16 v20, 0x0

    .line 412
    .line 413
    const/16 v24, 0x1

    .line 414
    .line 415
    const/high16 v21, 0x41000000    # 8.0f

    .line 416
    .line 417
    const/high16 v22, 0x41000000    # 8.0f

    .line 418
    .line 419
    const/high16 v23, 0x41000000    # 8.0f

    .line 420
    .line 421
    move-object/from16 v19, v9

    .line 422
    .line 423
    invoke-static/range {v19 .. v24}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 424
    .line 425
    .line 426
    move-result-object v9

    .line 427
    const/high16 v13, 0x41200000    # 10.0f

    .line 428
    .line 429
    invoke-static {v13}, La/vgg0;->a(F)La/ugg0;

    .line 430
    .line 431
    .line 432
    move-result-object v13

    .line 433
    invoke-static {v9, v13}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 434
    .line 435
    .line 436
    move-result-object v9

    .line 437
    sget-object v13, La/jd8;->n:La/ljc;

    .line 438
    .line 439
    invoke-static {v9, v2, v3, v13}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 440
    .line 441
    .line 442
    move-result-object v19

    .line 443
    const/16 v23, 0x0

    .line 444
    .line 445
    const/16 v25, 0x1c

    .line 446
    .line 447
    const/16 v20, 0x0

    .line 448
    .line 449
    const/16 v21, 0x0

    .line 450
    .line 451
    const/16 v22, 0x0

    .line 452
    .line 453
    iget-object v2, v0, La/xhq;->b:Lkotlin/jvm/functions/Function0;

    .line 454
    .line 455
    move-object/from16 v24, v2

    .line 456
    .line 457
    invoke-static/range {v19 .. v25}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    sget-object v3, La/gqw0;->k:La/yx7;

    .line 462
    .line 463
    sget-object v9, La/uc9;->a:La/lw3;

    .line 464
    .line 465
    invoke-static {v9, v3, v1, v10}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 466
    .line 467
    .line 468
    move-result-object v3

    .line 469
    iget-wide v9, v1, La/fet;->T:J

    .line 470
    .line 471
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 472
    .line 473
    .line 474
    move-result v9

    .line 475
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 476
    .line 477
    .line 478
    move-result-object v10

    .line 479
    invoke-static {v1, v2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 480
    .line 481
    .line 482
    move-result-object v2

    .line 483
    sget-object v13, La/mkd;->c0:La/gqw0;

    .line 484
    .line 485
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 486
    .line 487
    .line 488
    invoke-virtual {v1}, La/fet;->i0()V

    .line 489
    .line 490
    .line 491
    iget-boolean v13, v1, La/fet;->S:Z

    .line 492
    .line 493
    if-eqz v13, :cond_6

    .line 494
    .line 495
    invoke-virtual {v1, v15}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 496
    .line 497
    .line 498
    goto :goto_7

    .line 499
    :cond_6
    invoke-virtual {v1}, La/fet;->r0()V

    .line 500
    .line 501
    .line 502
    :goto_7
    sget-object v13, La/gqw0;->x:La/shd;

    .line 503
    .line 504
    invoke-static {v1, v3, v13}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 505
    .line 506
    .line 507
    sget-object v3, La/gqw0;->w:La/shd;

    .line 508
    .line 509
    invoke-static {v1, v10, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 510
    .line 511
    .line 512
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 513
    .line 514
    .line 515
    move-result-object v9

    .line 516
    sget-object v10, La/gqw0;->y:La/shd;

    .line 517
    .line 518
    invoke-static {v1, v9, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 519
    .line 520
    .line 521
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 522
    .line 523
    .line 524
    sget-object v9, La/gqw0;->v:La/shd;

    .line 525
    .line 526
    invoke-static {v1, v2, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 527
    .line 528
    .line 529
    const/4 v2, 0x0

    .line 530
    invoke-static {v11, v8, v2, v12}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 531
    .line 532
    .line 533
    move-result-object v2

    .line 534
    const/high16 v8, 0x42000000    # 32.0f

    .line 535
    .line 536
    invoke-static {v2, v8}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 537
    .line 538
    .line 539
    move-result-object v2

    .line 540
    const/4 v7, 0x1

    .line 541
    const/high16 v12, 0x3f800000    # 1.0f

    .line 542
    .line 543
    invoke-static {v12, v2, v7}, La/dw9;->h(FLa/mm40;Z)La/mm40;

    .line 544
    .line 545
    .line 546
    move-result-object v2

    .line 547
    sget-object v12, La/gqw0;->d:La/zx7;

    .line 548
    .line 549
    const/4 v14, 0x0

    .line 550
    invoke-static {v12, v14}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 551
    .line 552
    .line 553
    move-result-object v7

    .line 554
    move-object/from16 p2, v9

    .line 555
    .line 556
    iget-wide v8, v1, La/fet;->T:J

    .line 557
    .line 558
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 559
    .line 560
    .line 561
    move-result v8

    .line 562
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 563
    .line 564
    .line 565
    move-result-object v9

    .line 566
    invoke-static {v1, v2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 567
    .line 568
    .line 569
    move-result-object v2

    .line 570
    invoke-virtual {v1}, La/fet;->i0()V

    .line 571
    .line 572
    .line 573
    iget-boolean v14, v1, La/fet;->S:Z

    .line 574
    .line 575
    if-eqz v14, :cond_7

    .line 576
    .line 577
    invoke-virtual {v1, v15}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 578
    .line 579
    .line 580
    goto :goto_8

    .line 581
    :cond_7
    invoke-virtual {v1}, La/fet;->r0()V

    .line 582
    .line 583
    .line 584
    :goto_8
    invoke-static {v1, v7, v13}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 585
    .line 586
    .line 587
    invoke-static {v1, v9, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 588
    .line 589
    .line 590
    invoke-static {v8, v1, v10, v1}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 591
    .line 592
    .line 593
    move-object/from16 v8, p2

    .line 594
    .line 595
    invoke-static {v1, v2, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 596
    .line 597
    .line 598
    sget-object v2, La/bmd;->n:La/zfn;

    .line 599
    .line 600
    sget-object v7, La/k6z;->a:La/k6z;

    .line 601
    .line 602
    invoke-virtual {v2, v7}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 603
    .line 604
    .line 605
    move-result-object v2

    .line 606
    new-instance v7, La/aiq;

    .line 607
    .line 608
    const/4 v14, 0x0

    .line 609
    invoke-direct {v7, v4, v5, v6, v14}, La/aiq;-><init>(La/jjl;JB)V

    .line 610
    .line 611
    .line 612
    const v4, -0x27b0a62b

    .line 613
    .line 614
    .line 615
    invoke-static {v4, v7, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 616
    .line 617
    .line 618
    move-result-object v4

    .line 619
    const/16 v5, 0x38

    .line 620
    .line 621
    invoke-static {v2, v4, v1, v5}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 622
    .line 623
    .line 624
    const/4 v7, 0x1

    .line 625
    invoke-virtual {v1, v7}, La/fet;->r(Z)V

    .line 626
    .line 627
    .line 628
    const/high16 v2, 0x41c00000    # 24.0f

    .line 629
    .line 630
    const/high16 v4, 0x42000000    # 32.0f

    .line 631
    .line 632
    invoke-static {v11, v2, v4}, La/o7k0;->p(La/mm40;FF)La/mm40;

    .line 633
    .line 634
    .line 635
    move-result-object v2

    .line 636
    invoke-static {v12, v14}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 637
    .line 638
    .line 639
    move-result-object v4

    .line 640
    iget-wide v5, v1, La/fet;->T:J

    .line 641
    .line 642
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 643
    .line 644
    .line 645
    move-result v5

    .line 646
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 647
    .line 648
    .line 649
    move-result-object v6

    .line 650
    invoke-static {v1, v2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 651
    .line 652
    .line 653
    move-result-object v2

    .line 654
    invoke-virtual {v1}, La/fet;->i0()V

    .line 655
    .line 656
    .line 657
    iget-boolean v9, v1, La/fet;->S:Z

    .line 658
    .line 659
    if-eqz v9, :cond_8

    .line 660
    .line 661
    invoke-virtual {v1, v15}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 662
    .line 663
    .line 664
    goto :goto_9

    .line 665
    :cond_8
    invoke-virtual {v1}, La/fet;->r0()V

    .line 666
    .line 667
    .line 668
    :goto_9
    invoke-static {v1, v4, v13}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 669
    .line 670
    .line 671
    invoke-static {v1, v6, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 672
    .line 673
    .line 674
    invoke-static {v5, v1, v10, v1}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 675
    .line 676
    .line 677
    invoke-static {v1, v2, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 678
    .line 679
    .line 680
    const/high16 v2, 0x41800000    # 16.0f

    .line 681
    .line 682
    invoke-static {v11, v2}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 683
    .line 684
    .line 685
    move-result-object v21

    .line 686
    const/4 v2, 0x6

    .line 687
    const v3, 0x7f080815

    .line 688
    .line 689
    .line 690
    invoke-static {v3, v2, v1}, La/jpm0;->t(IILa/fet;)La/r2x;

    .line 691
    .line 692
    .line 693
    move-result-object v19

    .line 694
    const/16 v25, 0x30

    .line 695
    .line 696
    const/16 v26, 0x0

    .line 697
    .line 698
    const/16 v20, 0x0

    .line 699
    .line 700
    iget-wide v2, v0, La/xhq;->f:J

    .line 701
    .line 702
    move-object/from16 v24, v1

    .line 703
    .line 704
    move-wide/from16 v22, v2

    .line 705
    .line 706
    invoke-static/range {v19 .. v26}, La/dww;->b(La/r2x;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 707
    .line 708
    .line 709
    move-object/from16 v0, v24

    .line 710
    .line 711
    const/4 v7, 0x1

    .line 712
    invoke-virtual {v0, v7}, La/fet;->r(Z)V

    .line 713
    .line 714
    .line 715
    invoke-virtual {v0, v7}, La/fet;->r(Z)V

    .line 716
    .line 717
    .line 718
    goto :goto_a

    .line 719
    :cond_9
    move-object v0, v1

    .line 720
    invoke-virtual {v0}, La/fet;->X()V

    .line 721
    .line 722
    .line 723
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 724
    .line 725
    return-object v0

    .line 726
    nop

    .line 727
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
