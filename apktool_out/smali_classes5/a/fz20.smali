.class public final synthetic La/fz20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kz20;

.field public final synthetic c:F

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(FLa/kz20;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/fz20;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/fz20;->c:F

    iput-object p2, p0, La/fz20;->b:La/kz20;

    iput-object p3, p0, La/fz20;->d:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(La/kz20;FLkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/fz20;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/fz20;->b:La/kz20;

    iput p2, p0, La/fz20;->c:F

    iput-object p3, p0, La/fz20;->d:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(La/kz20;Lkotlin/jvm/functions/Function1;F)V
    .locals 1

    .line 3
    const/4 v0, 0x2

    iput-byte v0, p0, La/fz20;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/fz20;->b:La/kz20;

    iput-object p2, p0, La/fz20;->d:Lkotlin/jvm/functions/Function1;

    iput p3, p0, La/fz20;->c:F

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/fz20;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/high16 v3, 0x42200000    # 40.0f

    .line 8
    .line 9
    const/high16 v4, 0x3f800000    # 1.0f

    .line 10
    .line 11
    sget-object v5, La/jm40;->b:La/jm40;

    .line 12
    .line 13
    const/16 v6, 0x10

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x1

    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, La/u63;

    .line 23
    .line 24
    move-object/from16 v9, p2

    .line 25
    .line 26
    check-cast v9, La/fet;

    .line 27
    .line 28
    move-object/from16 v10, p3

    .line 29
    .line 30
    check-cast v10, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v10

    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    and-int/lit8 v1, v10, 0x11

    .line 40
    .line 41
    if-eq v1, v6, :cond_0

    .line 42
    .line 43
    move v7, v8

    .line 44
    :cond_0
    and-int/lit8 v1, v10, 0x1

    .line 45
    .line 46
    invoke-virtual {v9, v1, v7}, La/fet;->U(IZ)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    invoke-static {v5, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    sget-object v4, La/qmk;->a:La/zcl;

    .line 57
    .line 58
    invoke-static {v1, v3}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    iget v13, v0, La/fz20;->c:F

    .line 67
    .line 68
    if-ne v3, v2, :cond_1

    .line 69
    .line 70
    sget-wide v14, La/y3d;->f:J

    .line 71
    .line 72
    new-instance v10, La/mbh0;

    .line 73
    .line 74
    const/4 v11, 0x0

    .line 75
    move v12, v11

    .line 76
    invoke-direct/range {v10 .. v15}, La/mbh0;-><init>(FFFJ)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v9, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    move-object v3, v10

    .line 83
    :cond_1
    move-object v11, v3

    .line 84
    check-cast v11, La/mbh0;

    .line 85
    .line 86
    sget-object v15, La/j47;->f:La/ugd;

    .line 87
    .line 88
    sget-object v16, La/j47;->g:La/ugd;

    .line 89
    .line 90
    new-instance v2, La/yjm;

    .line 91
    .line 92
    iget-object v10, v0, La/fz20;->b:La/kz20;

    .line 93
    .line 94
    iget-object v14, v0, La/fz20;->d:Lkotlin/jvm/functions/Function1;

    .line 95
    .line 96
    invoke-direct {v2, v13, v10, v14, v8}, La/yjm;-><init>(FLjava/lang/Object;Ljava/lang/Object;B)V

    .line 97
    .line 98
    .line 99
    const v0, 0x2d274b54

    .line 100
    .line 101
    .line 102
    invoke-static {v0, v2, v9}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 103
    .line 104
    .line 105
    move-result-object v17

    .line 106
    sget-object v18, La/j47;->h:La/ugd;

    .line 107
    .line 108
    const/16 v22, 0x0

    .line 109
    .line 110
    const/16 v23, 0x418

    .line 111
    .line 112
    const/4 v12, 0x0

    .line 113
    const/4 v13, 0x0

    .line 114
    const/16 v19, 0x0

    .line 115
    .line 116
    const v21, 0x36d80180

    .line 117
    .line 118
    .line 119
    move-object/from16 v20, v9

    .line 120
    .line 121
    move-object v9, v1

    .line 122
    invoke-static/range {v9 .. v23}, La/cvm0;->a(La/mm40;La/kz20;La/mbh0;ZLa/cfq;Lkotlin/jvm/functions/Function1;La/ugd;La/ugd;La/ugd;La/xdr;La/xdr;La/fet;III)V

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_2
    move-object/from16 v20, v9

    .line 127
    .line 128
    invoke-virtual/range {v20 .. v20}, La/fet;->X()V

    .line 129
    .line 130
    .line 131
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    return-object v0

    .line 134
    :pswitch_0
    move-object/from16 v1, p1

    .line 135
    .line 136
    check-cast v1, La/u63;

    .line 137
    .line 138
    move-object/from16 v12, p2

    .line 139
    .line 140
    check-cast v12, La/fet;

    .line 141
    .line 142
    move-object/from16 v2, p3

    .line 143
    .line 144
    check-cast v2, Ljava/lang/Integer;

    .line 145
    .line 146
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    and-int/lit8 v1, v2, 0x11

    .line 154
    .line 155
    if-eq v1, v6, :cond_3

    .line 156
    .line 157
    move v1, v8

    .line 158
    goto :goto_1

    .line 159
    :cond_3
    move v1, v7

    .line 160
    :goto_1
    and-int/2addr v2, v8

    .line 161
    invoke-virtual {v12, v2, v1}, La/fet;->U(IZ)Z

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    if-eqz v1, :cond_5

    .line 166
    .line 167
    sget-object v1, La/uc9;->c:La/mw3;

    .line 168
    .line 169
    sget-object v2, La/gqw0;->m:La/xx7;

    .line 170
    .line 171
    invoke-static {v1, v2, v12, v7}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    iget-wide v2, v12, La/fet;->T:J

    .line 176
    .line 177
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    invoke-virtual {v12}, La/fet;->m()La/bh90;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    invoke-static {v12, v5}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 190
    .line 191
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v12}, La/fet;->i0()V

    .line 195
    .line 196
    .line 197
    iget-boolean v7, v12, La/fet;->S:Z

    .line 198
    .line 199
    if-eqz v7, :cond_4

    .line 200
    .line 201
    sget-object v7, La/e7z;->u1:La/pcy;

    .line 202
    .line 203
    invoke-virtual {v12, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 204
    .line 205
    .line 206
    goto :goto_2

    .line 207
    :cond_4
    invoke-virtual {v12}, La/fet;->r0()V

    .line 208
    .line 209
    .line 210
    :goto_2
    sget-object v7, La/gqw0;->x:La/shd;

    .line 211
    .line 212
    invoke-static {v12, v1, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 213
    .line 214
    .line 215
    sget-object v1, La/gqw0;->w:La/shd;

    .line 216
    .line 217
    invoke-static {v12, v3, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 218
    .line 219
    .line 220
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    sget-object v2, La/gqw0;->y:La/shd;

    .line 225
    .line 226
    invoke-static {v12, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 227
    .line 228
    .line 229
    invoke-static {v12}, La/jpm0;->n(La/fet;)V

    .line 230
    .line 231
    .line 232
    sget-object v1, La/gqw0;->v:La/shd;

    .line 233
    .line 234
    invoke-static {v12, v6, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 235
    .line 236
    .line 237
    invoke-static {v5, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    sget-object v2, La/qmk;->a:La/zcl;

    .line 242
    .line 243
    const/high16 v2, 0x42400000    # 48.0f

    .line 244
    .line 245
    invoke-static {v1, v2}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 246
    .line 247
    .line 248
    move-result-object v9

    .line 249
    sget-object v14, La/j47;->d:La/ugd;

    .line 250
    .line 251
    sget-object v15, La/j47;->e:La/ugd;

    .line 252
    .line 253
    const/high16 v17, 0x1b0000

    .line 254
    .line 255
    iget-object v10, v0, La/fz20;->b:La/kz20;

    .line 256
    .line 257
    iget v11, v0, La/fz20;->c:F

    .line 258
    .line 259
    iget-object v13, v0, La/fz20;->d:Lkotlin/jvm/functions/Function1;

    .line 260
    .line 261
    move-object/from16 v16, v12

    .line 262
    .line 263
    move v12, v11

    .line 264
    invoke-static/range {v9 .. v17}, La/j2e;->l(La/mm40;La/kz20;FFLkotlin/jvm/functions/Function1;La/ugd;La/ugd;La/fet;I)V

    .line 265
    .line 266
    .line 267
    invoke-static {v5, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 268
    .line 269
    .line 270
    move-result-object v10

    .line 271
    const/16 v13, 0x36

    .line 272
    .line 273
    const/4 v14, 0x4

    .line 274
    sget-object v9, La/zfi0;->a:La/zfi0;

    .line 275
    .line 276
    const/4 v11, 0x0

    .line 277
    move-object/from16 v12, v16

    .line 278
    .line 279
    invoke-static/range {v9 .. v14}, La/mbc;->o(La/bgi0;La/mm40;ZLa/fet;II)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v12, v8}, La/fet;->r(Z)V

    .line 283
    .line 284
    .line 285
    goto :goto_3

    .line 286
    :cond_5
    invoke-virtual {v12}, La/fet;->X()V

    .line 287
    .line 288
    .line 289
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 290
    .line 291
    return-object v0

    .line 292
    :pswitch_1
    move-object/from16 v1, p1

    .line 293
    .line 294
    check-cast v1, La/u63;

    .line 295
    .line 296
    move-object/from16 v9, p2

    .line 297
    .line 298
    check-cast v9, La/fet;

    .line 299
    .line 300
    move-object/from16 v10, p3

    .line 301
    .line 302
    check-cast v10, Ljava/lang/Integer;

    .line 303
    .line 304
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 305
    .line 306
    .line 307
    move-result v10

    .line 308
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    and-int/lit8 v1, v10, 0x11

    .line 312
    .line 313
    if-eq v1, v6, :cond_6

    .line 314
    .line 315
    move v1, v8

    .line 316
    goto :goto_4

    .line 317
    :cond_6
    move v1, v7

    .line 318
    :goto_4
    and-int/lit8 v6, v10, 0x1

    .line 319
    .line 320
    invoke-virtual {v9, v6, v1}, La/fet;->U(IZ)Z

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    if-eqz v1, :cond_9

    .line 325
    .line 326
    invoke-static {v5, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    sget-object v4, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 331
    .line 332
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/StaticColors;->getBlack10-0d7_KjU()J

    .line 333
    .line 334
    .line 335
    move-result-wide v4

    .line 336
    sget-object v6, La/jd8;->n:La/ljc;

    .line 337
    .line 338
    invoke-static {v1, v4, v5, v6}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    sget-object v4, La/qmk;->a:La/zcl;

    .line 343
    .line 344
    invoke-static {v1, v3}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 345
    .line 346
    .line 347
    move-result-object v10

    .line 348
    const/4 v14, 0x0

    .line 349
    const/16 v15, 0xe

    .line 350
    .line 351
    iget v11, v0, La/fz20;->c:F

    .line 352
    .line 353
    const/4 v12, 0x0

    .line 354
    const/4 v13, 0x0

    .line 355
    invoke-static/range {v10 .. v15}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    invoke-virtual {v9, v11}, La/fet;->d(F)Z

    .line 360
    .line 361
    .line 362
    move-result v3

    .line 363
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v4

    .line 367
    if-nez v3, :cond_7

    .line 368
    .line 369
    if-ne v4, v2, :cond_8

    .line 370
    .line 371
    :cond_7
    sget-wide v20, La/y3d;->f:J

    .line 372
    .line 373
    new-instance v16, La/mbh0;

    .line 374
    .line 375
    const/high16 v17, 0x41000000    # 8.0f

    .line 376
    .line 377
    const/16 v18, 0x0

    .line 378
    .line 379
    move/from16 v19, v11

    .line 380
    .line 381
    invoke-direct/range {v16 .. v21}, La/mbh0;-><init>(FFFJ)V

    .line 382
    .line 383
    .line 384
    move-object/from16 v4, v16

    .line 385
    .line 386
    invoke-virtual {v9, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 387
    .line 388
    .line 389
    :cond_8
    check-cast v4, La/mbh0;

    .line 390
    .line 391
    iget-object v10, v0, La/fz20;->b:La/kz20;

    .line 392
    .line 393
    iget-boolean v12, v10, La/kz20;->h:Z

    .line 394
    .line 395
    const/16 v2, 0xc8

    .line 396
    .line 397
    const/4 v3, 0x6

    .line 398
    const/4 v5, 0x0

    .line 399
    invoke-static {v2, v7, v5, v3}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 400
    .line 401
    .line 402
    move-result-object v13

    .line 403
    sget-object v15, La/b34;->m:La/ugd;

    .line 404
    .line 405
    sget-object v16, La/b34;->n:La/ugd;

    .line 406
    .line 407
    new-instance v2, La/iz20;

    .line 408
    .line 409
    iget-object v14, v0, La/fz20;->d:Lkotlin/jvm/functions/Function1;

    .line 410
    .line 411
    invoke-direct {v2, v10, v14, v7}, La/iz20;-><init>(La/kz20;Lkotlin/jvm/functions/Function1;B)V

    .line 412
    .line 413
    .line 414
    const v0, 0x78c1ced4

    .line 415
    .line 416
    .line 417
    invoke-static {v0, v2, v9}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 418
    .line 419
    .line 420
    move-result-object v17

    .line 421
    new-instance v0, La/k82;

    .line 422
    .line 423
    const/4 v2, 0x3

    .line 424
    invoke-direct {v0, v11, v2}, La/k82;-><init>(FB)V

    .line 425
    .line 426
    .line 427
    const v2, -0x4349b907

    .line 428
    .line 429
    .line 430
    invoke-static {v2, v0, v9}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 431
    .line 432
    .line 433
    move-result-object v19

    .line 434
    const/16 v22, 0x6

    .line 435
    .line 436
    const/16 v23, 0x200

    .line 437
    .line 438
    const/16 v18, 0x0

    .line 439
    .line 440
    const v21, 0x6d86000

    .line 441
    .line 442
    .line 443
    move-object v11, v4

    .line 444
    move-object/from16 v20, v9

    .line 445
    .line 446
    move-object v9, v1

    .line 447
    invoke-static/range {v9 .. v23}, La/cvm0;->a(La/mm40;La/kz20;La/mbh0;ZLa/cfq;Lkotlin/jvm/functions/Function1;La/ugd;La/ugd;La/ugd;La/xdr;La/xdr;La/fet;III)V

    .line 448
    .line 449
    .line 450
    goto :goto_5

    .line 451
    :cond_9
    move-object/from16 v20, v9

    .line 452
    .line 453
    invoke-virtual/range {v20 .. v20}, La/fet;->X()V

    .line 454
    .line 455
    .line 456
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 457
    .line 458
    return-object v0

    .line 459
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
