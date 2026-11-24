.class public final synthetic La/wr4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(BILkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/wr4;->a:B

    iput-object p3, p0, La/wr4;->b:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/wr4;->a:B

    iput-object p1, p0, La/wr4;->b:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/wr4;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x42600000    # 56.0f

    .line 6
    .line 7
    sget-object v3, La/ukd;->a:La/cl5;

    .line 8
    .line 9
    const v4, 0x7f0807d9

    .line 10
    .line 11
    .line 12
    const/high16 v5, 0x41800000    # 16.0f

    .line 13
    .line 14
    const/high16 v6, 0x41c00000    # 24.0f

    .line 15
    .line 16
    sget-object v7, La/e7z;->u1:La/pcy;

    .line 17
    .line 18
    sget-object v8, La/jm40;->b:La/jm40;

    .line 19
    .line 20
    const/4 v9, 0x2

    .line 21
    const/4 v10, 0x0

    .line 22
    iget-object v11, v0, La/wr4;->b:Lkotlin/jvm/functions/Function0;

    .line 23
    .line 24
    const/4 v12, 0x1

    .line 25
    packed-switch v1, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    move-object/from16 v0, p1

    .line 29
    .line 30
    check-cast v0, La/fet;

    .line 31
    .line 32
    move-object/from16 v1, p2

    .line 33
    .line 34
    check-cast v1, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-static {v12}, La/x8x;->L(I)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-static {v1, v0, v11}, La/iym0;->c(ILa/fet;Lkotlin/jvm/functions/Function0;)V

    .line 44
    .line 45
    .line 46
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object v0

    .line 49
    :pswitch_0
    move-object/from16 v0, p1

    .line 50
    .line 51
    check-cast v0, La/fet;

    .line 52
    .line 53
    move-object/from16 v1, p2

    .line 54
    .line 55
    check-cast v1, Ljava/lang/Integer;

    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-static {v12}, La/x8x;->L(I)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-static {v1, v0, v11}, La/yum0;->a(ILa/fet;Lkotlin/jvm/functions/Function0;)V

    .line 65
    .line 66
    .line 67
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object v0

    .line 70
    :pswitch_1
    move-object/from16 v0, p1

    .line 71
    .line 72
    check-cast v0, La/fet;

    .line 73
    .line 74
    move-object/from16 v1, p2

    .line 75
    .line 76
    check-cast v1, Ljava/lang/Integer;

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    and-int/lit8 v2, v1, 0x3

    .line 83
    .line 84
    if-eq v2, v9, :cond_0

    .line 85
    .line 86
    move v2, v12

    .line 87
    goto :goto_0

    .line 88
    :cond_0
    move v2, v10

    .line 89
    :goto_0
    and-int/2addr v1, v12

    .line 90
    invoke-virtual {v0, v1, v2}, La/fet;->U(IZ)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_1

    .line 95
    .line 96
    invoke-static {v10, v0, v11}, La/o050;->y(ILa/fet;Lkotlin/jvm/functions/Function0;)V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    invoke-virtual {v0}, La/fet;->X()V

    .line 101
    .line 102
    .line 103
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    return-object v0

    .line 106
    :pswitch_2
    move-object/from16 v0, p1

    .line 107
    .line 108
    check-cast v0, La/fet;

    .line 109
    .line 110
    move-object/from16 v1, p2

    .line 111
    .line 112
    check-cast v1, Ljava/lang/Integer;

    .line 113
    .line 114
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-static {v12}, La/x8x;->L(I)I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    invoke-static {v1, v0, v11}, La/o050;->y(ILa/fet;Lkotlin/jvm/functions/Function0;)V

    .line 122
    .line 123
    .line 124
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 125
    .line 126
    return-object v0

    .line 127
    :pswitch_3
    move-object/from16 v13, p1

    .line 128
    .line 129
    check-cast v13, La/fet;

    .line 130
    .line 131
    move-object/from16 v0, p2

    .line 132
    .line 133
    check-cast v0, Ljava/lang/Integer;

    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    and-int/lit8 v1, v0, 0x3

    .line 140
    .line 141
    if-eq v1, v9, :cond_2

    .line 142
    .line 143
    move v1, v12

    .line 144
    goto :goto_2

    .line 145
    :cond_2
    move v1, v10

    .line 146
    :goto_2
    and-int/2addr v0, v12

    .line 147
    invoke-virtual {v13, v0, v1}, La/fet;->U(IZ)Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    if-eqz v0, :cond_5

    .line 152
    .line 153
    new-instance v14, La/imm;

    .line 154
    .line 155
    new-instance v15, La/ilm;

    .line 156
    .line 157
    sget-object v0, La/zaq0;->b:La/zfn;

    .line 158
    .line 159
    invoke-virtual {v13, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    check-cast v1, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 164
    .line 165
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 166
    .line 167
    .line 168
    move-result-wide v1

    .line 169
    invoke-direct {v15, v1, v2}, La/ilm;-><init>(J)V

    .line 170
    .line 171
    .line 172
    new-instance v16, La/plm;

    .line 173
    .line 174
    const v1, 0x7f131681

    .line 175
    .line 176
    .line 177
    invoke-static {v1, v10, v13}, La/rsm0;->w(IILa/fet;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    sget-object v6, La/ha50;->c:La/ha50;

    .line 182
    .line 183
    invoke-virtual {v13, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    check-cast v1, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 188
    .line 189
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 190
    .line 191
    .line 192
    move-result-wide v7

    .line 193
    sget-object v9, La/fa50;->a:La/fa50;

    .line 194
    .line 195
    move-object/from16 v4, v16

    .line 196
    .line 197
    invoke-direct/range {v4 .. v9}, La/plm;-><init>(Ljava/lang/String;La/ha50;JLa/ga50;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v13, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 205
    .line 206
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 207
    .line 208
    .line 209
    move-result-wide v18

    .line 210
    const/16 v20, 0x0

    .line 211
    .line 212
    const/16 v21, 0x0

    .line 213
    .line 214
    sget-object v17, La/fmm;->a:La/fmm;

    .line 215
    .line 216
    invoke-direct/range {v14 .. v21}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v13, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    if-nez v0, :cond_3

    .line 228
    .line 229
    if-ne v1, v3, :cond_4

    .line 230
    .line 231
    :cond_3
    new-instance v1, La/a2z;

    .line 232
    .line 233
    const/4 v0, 0x5

    .line 234
    invoke-direct {v1, v11, v0}, La/a2z;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v13, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    :cond_4
    move-object v4, v1

    .line 241
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 242
    .line 243
    const/16 v15, 0x36

    .line 244
    .line 245
    const/16 v16, 0x1f5

    .line 246
    .line 247
    const/4 v1, 0x0

    .line 248
    const/4 v3, 0x0

    .line 249
    const/4 v5, 0x0

    .line 250
    const/4 v6, 0x0

    .line 251
    const/4 v7, 0x0

    .line 252
    const/4 v8, 0x0

    .line 253
    const/4 v9, 0x0

    .line 254
    const/4 v10, 0x0

    .line 255
    const/4 v11, 0x0

    .line 256
    const/4 v12, 0x0

    .line 257
    move-object v2, v14

    .line 258
    const/high16 v14, 0x30000000

    .line 259
    .line 260
    invoke-static/range {v1 .. v16}, La/hlm;->c(La/mm40;La/imm;La/vkm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/fet;III)V

    .line 261
    .line 262
    .line 263
    goto :goto_3

    .line 264
    :cond_5
    invoke-virtual {v13}, La/fet;->X()V

    .line 265
    .line 266
    .line 267
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 268
    .line 269
    return-object v0

    .line 270
    :pswitch_4
    move-object/from16 v0, p1

    .line 271
    .line 272
    check-cast v0, La/fet;

    .line 273
    .line 274
    move-object/from16 v1, p2

    .line 275
    .line 276
    check-cast v1, Ljava/lang/Integer;

    .line 277
    .line 278
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 279
    .line 280
    .line 281
    move-result v1

    .line 282
    and-int/lit8 v2, v1, 0x3

    .line 283
    .line 284
    if-eq v2, v9, :cond_6

    .line 285
    .line 286
    move v2, v12

    .line 287
    goto :goto_4

    .line 288
    :cond_6
    move v2, v10

    .line 289
    :goto_4
    and-int/2addr v1, v12

    .line 290
    invoke-virtual {v0, v1, v2}, La/fet;->U(IZ)Z

    .line 291
    .line 292
    .line 293
    move-result v1

    .line 294
    if-eqz v1, :cond_8

    .line 295
    .line 296
    const/high16 v1, 0x3f800000    # 1.0f

    .line 297
    .line 298
    invoke-static {v8, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    const/4 v2, 0x0

    .line 303
    const/4 v3, 0x3

    .line 304
    invoke-static {v1, v2, v10, v3}, La/o7k0;->w(La/mm40;La/yx7;ZI)La/mm40;

    .line 305
    .line 306
    .line 307
    move-result-object v13

    .line 308
    sget-object v1, La/qmk;->a:La/zcl;

    .line 309
    .line 310
    const/16 v17, 0x0

    .line 311
    .line 312
    const/16 v18, 0xd

    .line 313
    .line 314
    const/4 v14, 0x0

    .line 315
    const/high16 v15, 0x41400000    # 12.0f

    .line 316
    .line 317
    const/16 v16, 0x0

    .line 318
    .line 319
    invoke-static/range {v13 .. v18}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    sget-object v3, La/gqw0;->a:La/zx7;

    .line 324
    .line 325
    invoke-static {v3, v10}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 326
    .line 327
    .line 328
    move-result-object v3

    .line 329
    iget-wide v4, v0, La/fet;->T:J

    .line 330
    .line 331
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 332
    .line 333
    .line 334
    move-result v4

    .line 335
    invoke-virtual {v0}, La/fet;->m()La/bh90;

    .line 336
    .line 337
    .line 338
    move-result-object v5

    .line 339
    invoke-static {v0, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 340
    .line 341
    .line 342
    move-result-object v1

    .line 343
    sget-object v6, La/mkd;->c0:La/gqw0;

    .line 344
    .line 345
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v0}, La/fet;->i0()V

    .line 349
    .line 350
    .line 351
    iget-boolean v6, v0, La/fet;->S:Z

    .line 352
    .line 353
    if-eqz v6, :cond_7

    .line 354
    .line 355
    invoke-virtual {v0, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 356
    .line 357
    .line 358
    goto :goto_5

    .line 359
    :cond_7
    invoke-virtual {v0}, La/fet;->r0()V

    .line 360
    .line 361
    .line 362
    :goto_5
    sget-object v6, La/gqw0;->x:La/shd;

    .line 363
    .line 364
    invoke-static {v0, v3, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 365
    .line 366
    .line 367
    sget-object v3, La/gqw0;->w:La/shd;

    .line 368
    .line 369
    invoke-static {v0, v5, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 370
    .line 371
    .line 372
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 373
    .line 374
    .line 375
    move-result-object v3

    .line 376
    sget-object v4, La/gqw0;->y:La/shd;

    .line 377
    .line 378
    invoke-static {v0, v3, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 379
    .line 380
    .line 381
    invoke-static {v0}, La/jpm0;->n(La/fet;)V

    .line 382
    .line 383
    .line 384
    sget-object v3, La/gqw0;->v:La/shd;

    .line 385
    .line 386
    invoke-static {v0, v1, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 387
    .line 388
    .line 389
    invoke-static {v10, v9, v0, v2, v11}, La/x1x;->l(IILa/fet;La/mm40;Lkotlin/jvm/functions/Function0;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v0, v12}, La/fet;->r(Z)V

    .line 393
    .line 394
    .line 395
    goto :goto_6

    .line 396
    :cond_8
    invoke-virtual {v0}, La/fet;->X()V

    .line 397
    .line 398
    .line 399
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 400
    .line 401
    return-object v0

    .line 402
    :pswitch_5
    move-object/from16 v0, p1

    .line 403
    .line 404
    check-cast v0, La/fet;

    .line 405
    .line 406
    move-object/from16 v1, p2

    .line 407
    .line 408
    check-cast v1, Ljava/lang/Integer;

    .line 409
    .line 410
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 411
    .line 412
    .line 413
    move-result v1

    .line 414
    and-int/lit8 v2, v1, 0x3

    .line 415
    .line 416
    if-eq v2, v9, :cond_9

    .line 417
    .line 418
    move v2, v12

    .line 419
    goto :goto_7

    .line 420
    :cond_9
    move v2, v10

    .line 421
    :goto_7
    and-int/2addr v1, v12

    .line 422
    invoke-virtual {v0, v1, v2}, La/fet;->U(IZ)Z

    .line 423
    .line 424
    .line 425
    move-result v1

    .line 426
    if-eqz v1, :cond_a

    .line 427
    .line 428
    sget-object v1, La/qmk;->a:La/zcl;

    .line 429
    .line 430
    invoke-static {v8, v5}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 431
    .line 432
    .line 433
    move-result-object v1

    .line 434
    invoke-static {v1, v6}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 435
    .line 436
    .line 437
    move-result-object v1

    .line 438
    invoke-static {v10, v0, v1, v11}, La/i120;->g(ILa/fet;La/mm40;Lkotlin/jvm/functions/Function0;)V

    .line 439
    .line 440
    .line 441
    goto :goto_8

    .line 442
    :cond_a
    invoke-virtual {v0}, La/fet;->X()V

    .line 443
    .line 444
    .line 445
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 446
    .line 447
    return-object v0

    .line 448
    :pswitch_6
    move-object/from16 v0, p1

    .line 449
    .line 450
    check-cast v0, La/fet;

    .line 451
    .line 452
    move-object/from16 v1, p2

    .line 453
    .line 454
    check-cast v1, Ljava/lang/Integer;

    .line 455
    .line 456
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 457
    .line 458
    .line 459
    move-result v1

    .line 460
    and-int/lit8 v2, v1, 0x3

    .line 461
    .line 462
    if-eq v2, v9, :cond_b

    .line 463
    .line 464
    move v2, v12

    .line 465
    goto :goto_9

    .line 466
    :cond_b
    move v2, v10

    .line 467
    :goto_9
    and-int/2addr v1, v12

    .line 468
    invoke-virtual {v0, v1, v2}, La/fet;->U(IZ)Z

    .line 469
    .line 470
    .line 471
    move-result v1

    .line 472
    if-eqz v1, :cond_c

    .line 473
    .line 474
    sget-object v1, La/qmk;->a:La/zcl;

    .line 475
    .line 476
    invoke-static {v8, v5}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 477
    .line 478
    .line 479
    move-result-object v1

    .line 480
    invoke-static {v1, v6}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    invoke-static {v10, v0, v1, v11}, La/lv00;->m(ILa/fet;La/mm40;Lkotlin/jvm/functions/Function0;)V

    .line 485
    .line 486
    .line 487
    goto :goto_a

    .line 488
    :cond_c
    invoke-virtual {v0}, La/fet;->X()V

    .line 489
    .line 490
    .line 491
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 492
    .line 493
    return-object v0

    .line 494
    :pswitch_7
    move-object/from16 v0, p1

    .line 495
    .line 496
    check-cast v0, La/fet;

    .line 497
    .line 498
    move-object/from16 v1, p2

    .line 499
    .line 500
    check-cast v1, Ljava/lang/Integer;

    .line 501
    .line 502
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 503
    .line 504
    .line 505
    move-result v1

    .line 506
    and-int/lit8 v2, v1, 0x3

    .line 507
    .line 508
    if-eq v2, v9, :cond_d

    .line 509
    .line 510
    move v2, v12

    .line 511
    goto :goto_b

    .line 512
    :cond_d
    move v2, v10

    .line 513
    :goto_b
    and-int/2addr v1, v12

    .line 514
    invoke-virtual {v0, v1, v2}, La/fet;->U(IZ)Z

    .line 515
    .line 516
    .line 517
    move-result v1

    .line 518
    if-eqz v1, :cond_e

    .line 519
    .line 520
    sget-object v1, La/qmk;->a:La/zcl;

    .line 521
    .line 522
    invoke-static {v8, v5}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 523
    .line 524
    .line 525
    move-result-object v1

    .line 526
    invoke-static {v1, v6}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 527
    .line 528
    .line 529
    move-result-object v1

    .line 530
    invoke-static {v10, v0, v1, v11}, La/ahy;->f(ILa/fet;La/mm40;Lkotlin/jvm/functions/Function0;)V

    .line 531
    .line 532
    .line 533
    goto :goto_c

    .line 534
    :cond_e
    invoke-virtual {v0}, La/fet;->X()V

    .line 535
    .line 536
    .line 537
    :goto_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 538
    .line 539
    return-object v0

    .line 540
    :pswitch_8
    move-object/from16 v6, p1

    .line 541
    .line 542
    check-cast v6, La/fet;

    .line 543
    .line 544
    move-object/from16 v0, p2

    .line 545
    .line 546
    check-cast v0, Ljava/lang/Integer;

    .line 547
    .line 548
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 549
    .line 550
    .line 551
    move-result v0

    .line 552
    and-int/lit8 v1, v0, 0x3

    .line 553
    .line 554
    if-eq v1, v9, :cond_f

    .line 555
    .line 556
    move v1, v12

    .line 557
    goto :goto_d

    .line 558
    :cond_f
    move v1, v10

    .line 559
    :goto_d
    and-int/2addr v0, v12

    .line 560
    invoke-virtual {v6, v0, v1}, La/fet;->U(IZ)Z

    .line 561
    .line 562
    .line 563
    move-result v0

    .line 564
    if-eqz v0, :cond_11

    .line 565
    .line 566
    sget-object v0, La/qmk;->a:La/zcl;

    .line 567
    .line 568
    invoke-static {v8, v2}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    invoke-static {v0, v11}, La/feb;->O(La/mm40;Lkotlin/jvm/functions/Function0;)La/mm40;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    sget-object v1, La/gqw0;->e:La/zx7;

    .line 577
    .line 578
    invoke-static {v1, v10}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 579
    .line 580
    .line 581
    move-result-object v1

    .line 582
    iget-wide v2, v6, La/fet;->T:J

    .line 583
    .line 584
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 585
    .line 586
    .line 587
    move-result v2

    .line 588
    invoke-virtual {v6}, La/fet;->m()La/bh90;

    .line 589
    .line 590
    .line 591
    move-result-object v3

    .line 592
    invoke-static {v6, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 593
    .line 594
    .line 595
    move-result-object v0

    .line 596
    sget-object v5, La/mkd;->c0:La/gqw0;

    .line 597
    .line 598
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 599
    .line 600
    .line 601
    invoke-virtual {v6}, La/fet;->i0()V

    .line 602
    .line 603
    .line 604
    iget-boolean v5, v6, La/fet;->S:Z

    .line 605
    .line 606
    if-eqz v5, :cond_10

    .line 607
    .line 608
    invoke-virtual {v6, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 609
    .line 610
    .line 611
    goto :goto_e

    .line 612
    :cond_10
    invoke-virtual {v6}, La/fet;->r0()V

    .line 613
    .line 614
    .line 615
    :goto_e
    sget-object v5, La/gqw0;->x:La/shd;

    .line 616
    .line 617
    invoke-static {v6, v1, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 618
    .line 619
    .line 620
    sget-object v1, La/gqw0;->w:La/shd;

    .line 621
    .line 622
    invoke-static {v6, v3, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 623
    .line 624
    .line 625
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 626
    .line 627
    .line 628
    move-result-object v1

    .line 629
    sget-object v2, La/gqw0;->y:La/shd;

    .line 630
    .line 631
    invoke-static {v6, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 632
    .line 633
    .line 634
    invoke-static {v6}, La/jpm0;->n(La/fet;)V

    .line 635
    .line 636
    .line 637
    sget-object v1, La/gqw0;->v:La/shd;

    .line 638
    .line 639
    invoke-static {v6, v0, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 640
    .line 641
    .line 642
    const/4 v0, 0x6

    .line 643
    invoke-static {v4, v0, v6}, La/jpm0;->t(IILa/fet;)La/r2x;

    .line 644
    .line 645
    .line 646
    move-result-object v1

    .line 647
    const/high16 v0, 0x42100000    # 36.0f

    .line 648
    .line 649
    invoke-static {v8, v0}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 650
    .line 651
    .line 652
    move-result-object v0

    .line 653
    const/high16 v2, 0x40c00000    # 6.0f

    .line 654
    .line 655
    invoke-static {v0, v2}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 656
    .line 657
    .line 658
    move-result-object v3

    .line 659
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 660
    .line 661
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 662
    .line 663
    .line 664
    move-result-wide v4

    .line 665
    const/16 v7, 0x30

    .line 666
    .line 667
    const/4 v8, 0x0

    .line 668
    const/4 v2, 0x0

    .line 669
    invoke-static/range {v1 .. v8}, La/dww;->b(La/r2x;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 670
    .line 671
    .line 672
    invoke-virtual {v6, v12}, La/fet;->r(Z)V

    .line 673
    .line 674
    .line 675
    goto :goto_f

    .line 676
    :cond_11
    invoke-virtual {v6}, La/fet;->X()V

    .line 677
    .line 678
    .line 679
    :goto_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 680
    .line 681
    return-object v0

    .line 682
    :pswitch_9
    move-object/from16 v6, p1

    .line 683
    .line 684
    check-cast v6, La/fet;

    .line 685
    .line 686
    move-object/from16 v0, p2

    .line 687
    .line 688
    check-cast v0, Ljava/lang/Integer;

    .line 689
    .line 690
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 691
    .line 692
    .line 693
    move-result v0

    .line 694
    and-int/lit8 v1, v0, 0x3

    .line 695
    .line 696
    if-eq v1, v9, :cond_12

    .line 697
    .line 698
    move v1, v12

    .line 699
    goto :goto_10

    .line 700
    :cond_12
    move v1, v10

    .line 701
    :goto_10
    and-int/2addr v0, v12

    .line 702
    invoke-virtual {v6, v0, v1}, La/fet;->U(IZ)Z

    .line 703
    .line 704
    .line 705
    move-result v0

    .line 706
    if-eqz v0, :cond_17

    .line 707
    .line 708
    sget-object v0, La/qmk;->a:La/zcl;

    .line 709
    .line 710
    invoke-static {v8, v2}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 711
    .line 712
    .line 713
    move-result-object v13

    .line 714
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 715
    .line 716
    .line 717
    move-result-object v0

    .line 718
    if-ne v0, v3, :cond_13

    .line 719
    .line 720
    invoke-static {v6}, La/dw9;->j(La/fet;)La/gy40;

    .line 721
    .line 722
    .line 723
    move-result-object v0

    .line 724
    :cond_13
    move-object v14, v0

    .line 725
    check-cast v14, La/gy40;

    .line 726
    .line 727
    invoke-virtual {v6, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 728
    .line 729
    .line 730
    move-result v0

    .line 731
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 732
    .line 733
    .line 734
    move-result-object v1

    .line 735
    if-nez v0, :cond_14

    .line 736
    .line 737
    if-ne v1, v3, :cond_15

    .line 738
    .line 739
    :cond_14
    new-instance v1, La/b1i;

    .line 740
    .line 741
    const/16 v0, 0xc

    .line 742
    .line 743
    invoke-direct {v1, v11, v0}, La/b1i;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 744
    .line 745
    .line 746
    invoke-virtual {v6, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 747
    .line 748
    .line 749
    :cond_15
    move-object/from16 v18, v1

    .line 750
    .line 751
    check-cast v18, Lkotlin/jvm/functions/Function0;

    .line 752
    .line 753
    const/16 v19, 0x1c

    .line 754
    .line 755
    const/4 v15, 0x0

    .line 756
    const/16 v16, 0x0

    .line 757
    .line 758
    const/16 v17, 0x0

    .line 759
    .line 760
    invoke-static/range {v13 .. v19}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 761
    .line 762
    .line 763
    move-result-object v0

    .line 764
    const-string v1, "ICON_ARROW"

    .line 765
    .line 766
    invoke-static {v0, v1}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 767
    .line 768
    .line 769
    move-result-object v0

    .line 770
    sget-object v1, La/gqw0;->e:La/zx7;

    .line 771
    .line 772
    invoke-static {v1, v10}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 773
    .line 774
    .line 775
    move-result-object v1

    .line 776
    iget-wide v2, v6, La/fet;->T:J

    .line 777
    .line 778
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 779
    .line 780
    .line 781
    move-result v2

    .line 782
    invoke-virtual {v6}, La/fet;->m()La/bh90;

    .line 783
    .line 784
    .line 785
    move-result-object v3

    .line 786
    invoke-static {v6, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 787
    .line 788
    .line 789
    move-result-object v0

    .line 790
    sget-object v5, La/mkd;->c0:La/gqw0;

    .line 791
    .line 792
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 793
    .line 794
    .line 795
    invoke-virtual {v6}, La/fet;->i0()V

    .line 796
    .line 797
    .line 798
    iget-boolean v5, v6, La/fet;->S:Z

    .line 799
    .line 800
    if-eqz v5, :cond_16

    .line 801
    .line 802
    invoke-virtual {v6, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 803
    .line 804
    .line 805
    goto :goto_11

    .line 806
    :cond_16
    invoke-virtual {v6}, La/fet;->r0()V

    .line 807
    .line 808
    .line 809
    :goto_11
    sget-object v5, La/gqw0;->x:La/shd;

    .line 810
    .line 811
    invoke-static {v6, v1, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 812
    .line 813
    .line 814
    sget-object v1, La/gqw0;->w:La/shd;

    .line 815
    .line 816
    invoke-static {v6, v3, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 817
    .line 818
    .line 819
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 820
    .line 821
    .line 822
    move-result-object v1

    .line 823
    sget-object v2, La/gqw0;->y:La/shd;

    .line 824
    .line 825
    invoke-static {v6, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 826
    .line 827
    .line 828
    invoke-static {v6}, La/jpm0;->n(La/fet;)V

    .line 829
    .line 830
    .line 831
    sget-object v1, La/gqw0;->v:La/shd;

    .line 832
    .line 833
    invoke-static {v6, v0, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 834
    .line 835
    .line 836
    invoke-static {v4, v10, v6}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 837
    .line 838
    .line 839
    move-result-object v1

    .line 840
    sget-object v0, La/zaq0;->b:La/zfn;

    .line 841
    .line 842
    invoke-virtual {v6, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 843
    .line 844
    .line 845
    move-result-object v0

    .line 846
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 847
    .line 848
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 849
    .line 850
    .line 851
    move-result-wide v4

    .line 852
    const/16 v7, 0x38

    .line 853
    .line 854
    const/4 v8, 0x4

    .line 855
    const/4 v2, 0x0

    .line 856
    const/4 v3, 0x0

    .line 857
    invoke-static/range {v1 .. v8}, La/dww;->c(La/pm80;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 858
    .line 859
    .line 860
    invoke-virtual {v6, v12}, La/fet;->r(Z)V

    .line 861
    .line 862
    .line 863
    goto :goto_12

    .line 864
    :cond_17
    invoke-virtual {v6}, La/fet;->X()V

    .line 865
    .line 866
    .line 867
    :goto_12
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 868
    .line 869
    return-object v0

    .line 870
    :pswitch_a
    move-object/from16 v1, p1

    .line 871
    .line 872
    check-cast v1, La/fet;

    .line 873
    .line 874
    move-object/from16 v2, p2

    .line 875
    .line 876
    check-cast v2, Ljava/lang/Integer;

    .line 877
    .line 878
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 879
    .line 880
    .line 881
    move-result v2

    .line 882
    and-int/lit8 v3, v2, 0x3

    .line 883
    .line 884
    if-eq v3, v9, :cond_18

    .line 885
    .line 886
    move v3, v12

    .line 887
    goto :goto_13

    .line 888
    :cond_18
    move v3, v10

    .line 889
    :goto_13
    and-int/2addr v2, v12

    .line 890
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 891
    .line 892
    .line 893
    move-result v2

    .line 894
    if-eqz v2, :cond_1a

    .line 895
    .line 896
    sget-object v2, La/qmk;->a:La/zcl;

    .line 897
    .line 898
    const/high16 v2, 0x42400000    # 48.0f

    .line 899
    .line 900
    invoke-static {v8, v2}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 901
    .line 902
    .line 903
    move-result-object v13

    .line 904
    const/16 v17, 0x0

    .line 905
    .line 906
    const/16 v19, 0x18

    .line 907
    .line 908
    const/4 v14, 0x0

    .line 909
    const/4 v15, 0x0

    .line 910
    const/16 v16, 0x1

    .line 911
    .line 912
    iget-object v0, v0, La/wr4;->b:Lkotlin/jvm/functions/Function0;

    .line 913
    .line 914
    move-object/from16 v18, v0

    .line 915
    .line 916
    invoke-static/range {v13 .. v19}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 917
    .line 918
    .line 919
    move-result-object v0

    .line 920
    sget-object v2, La/gqw0;->e:La/zx7;

    .line 921
    .line 922
    invoke-static {v2, v10}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 923
    .line 924
    .line 925
    move-result-object v2

    .line 926
    iget-wide v13, v1, La/fet;->T:J

    .line 927
    .line 928
    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    .line 929
    .line 930
    .line 931
    move-result v3

    .line 932
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 933
    .line 934
    .line 935
    move-result-object v5

    .line 936
    invoke-static {v1, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 937
    .line 938
    .line 939
    move-result-object v0

    .line 940
    sget-object v9, La/mkd;->c0:La/gqw0;

    .line 941
    .line 942
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 943
    .line 944
    .line 945
    invoke-virtual {v1}, La/fet;->i0()V

    .line 946
    .line 947
    .line 948
    iget-boolean v9, v1, La/fet;->S:Z

    .line 949
    .line 950
    if-eqz v9, :cond_19

    .line 951
    .line 952
    invoke-virtual {v1, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 953
    .line 954
    .line 955
    goto :goto_14

    .line 956
    :cond_19
    invoke-virtual {v1}, La/fet;->r0()V

    .line 957
    .line 958
    .line 959
    :goto_14
    sget-object v7, La/gqw0;->x:La/shd;

    .line 960
    .line 961
    invoke-static {v1, v2, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 962
    .line 963
    .line 964
    sget-object v2, La/gqw0;->w:La/shd;

    .line 965
    .line 966
    invoke-static {v1, v5, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 967
    .line 968
    .line 969
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 970
    .line 971
    .line 972
    move-result-object v2

    .line 973
    sget-object v3, La/gqw0;->y:La/shd;

    .line 974
    .line 975
    invoke-static {v1, v2, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 976
    .line 977
    .line 978
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 979
    .line 980
    .line 981
    sget-object v2, La/gqw0;->v:La/shd;

    .line 982
    .line 983
    invoke-static {v1, v0, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 984
    .line 985
    .line 986
    invoke-static {v4, v10, v1}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 987
    .line 988
    .line 989
    move-result-object v0

    .line 990
    sget-object v2, La/zaq0;->b:La/zfn;

    .line 991
    .line 992
    invoke-virtual {v1, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 993
    .line 994
    .line 995
    move-result-object v2

    .line 996
    check-cast v2, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 997
    .line 998
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 999
    .line 1000
    .line 1001
    move-result-wide v4

    .line 1002
    invoke-static {v8, v6}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v3

    .line 1006
    const/16 v7, 0x38

    .line 1007
    .line 1008
    const/4 v8, 0x0

    .line 1009
    const/4 v2, 0x0

    .line 1010
    move-object v6, v1

    .line 1011
    move-object v1, v0

    .line 1012
    invoke-static/range {v1 .. v8}, La/dww;->c(La/pm80;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 1013
    .line 1014
    .line 1015
    invoke-virtual {v6, v12}, La/fet;->r(Z)V

    .line 1016
    .line 1017
    .line 1018
    goto :goto_15

    .line 1019
    :cond_1a
    move-object v6, v1

    .line 1020
    invoke-virtual {v6}, La/fet;->X()V

    .line 1021
    .line 1022
    .line 1023
    :goto_15
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1024
    .line 1025
    return-object v0

    .line 1026
    :pswitch_b
    move-object/from16 v0, p1

    .line 1027
    .line 1028
    check-cast v0, La/fet;

    .line 1029
    .line 1030
    move-object/from16 v1, p2

    .line 1031
    .line 1032
    check-cast v1, Ljava/lang/Integer;

    .line 1033
    .line 1034
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1035
    .line 1036
    .line 1037
    move-result v1

    .line 1038
    and-int/lit8 v2, v1, 0x3

    .line 1039
    .line 1040
    if-eq v2, v9, :cond_1b

    .line 1041
    .line 1042
    move v2, v12

    .line 1043
    goto :goto_16

    .line 1044
    :cond_1b
    move v2, v10

    .line 1045
    :goto_16
    and-int/2addr v1, v12

    .line 1046
    invoke-virtual {v0, v1, v2}, La/fet;->U(IZ)Z

    .line 1047
    .line 1048
    .line 1049
    move-result v1

    .line 1050
    if-eqz v1, :cond_1c

    .line 1051
    .line 1052
    const v1, 0x7f130181

    .line 1053
    .line 1054
    .line 1055
    invoke-static {v1, v0}, La/xsm0;->s(ILa/fet;)Ljava/lang/String;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v1

    .line 1059
    invoke-static {v1, v11, v0, v10}, La/jeb;->i(Ljava/lang/String;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 1060
    .line 1061
    .line 1062
    goto :goto_17

    .line 1063
    :cond_1c
    invoke-virtual {v0}, La/fet;->X()V

    .line 1064
    .line 1065
    .line 1066
    :goto_17
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1067
    .line 1068
    return-object v0

    .line 1069
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
