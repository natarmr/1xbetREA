.class public final synthetic La/xbd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pl7;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/pl7;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/xbd;->a:B

    iput-object p1, p0, La/xbd;->b:La/pl7;

    iput-object p2, p0, La/xbd;->c:Lkotlin/jvm/functions/Function1;

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
    iget-byte v1, v0, La/xbd;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/4 v3, 0x6

    .line 8
    const/high16 v4, 0x3f800000    # 1.0f

    .line 9
    .line 10
    sget-object v5, La/jm40;->b:La/jm40;

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x2

    .line 14
    const/4 v8, 0x1

    .line 15
    iget-object v9, v0, La/xbd;->c:Lkotlin/jvm/functions/Function1;

    .line 16
    .line 17
    iget-object v0, v0, La/xbd;->b:La/pl7;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    move-object/from16 v1, p1

    .line 23
    .line 24
    check-cast v1, La/fet;

    .line 25
    .line 26
    move-object/from16 v2, p2

    .line 27
    .line 28
    check-cast v2, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    and-int/lit8 v10, v2, 0x3

    .line 35
    .line 36
    if-eq v10, v7, :cond_0

    .line 37
    .line 38
    move v6, v8

    .line 39
    :cond_0
    and-int/2addr v2, v8

    .line 40
    invoke-virtual {v1, v2, v6}, La/fet;->U(IZ)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    invoke-static {v5, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-interface {v0}, La/pl7;->b()La/on5;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {v2, v0, v9, v1, v3}, La/eeq;->k(La/mm40;La/on5;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    invoke-virtual {v1}, La/fet;->X()V

    .line 59
    .line 60
    .line 61
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object v0

    .line 64
    :pswitch_0
    move-object/from16 v1, p1

    .line 65
    .line 66
    check-cast v1, La/fet;

    .line 67
    .line 68
    move-object/from16 v2, p2

    .line 69
    .line 70
    check-cast v2, Ljava/lang/Integer;

    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    and-int/lit8 v10, v2, 0x3

    .line 77
    .line 78
    if-eq v10, v7, :cond_2

    .line 79
    .line 80
    move v6, v8

    .line 81
    :cond_2
    and-int/2addr v2, v8

    .line 82
    invoke-virtual {v1, v2, v6}, La/fet;->U(IZ)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_3

    .line 87
    .line 88
    invoke-static {v5, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-interface {v0}, La/pl7;->b()La/on5;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {v2, v0, v9, v1, v3}, La/eeq;->k(La/mm40;La/on5;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    invoke-virtual {v1}, La/fet;->X()V

    .line 101
    .line 102
    .line 103
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    return-object v0

    .line 106
    :pswitch_1
    move-object/from16 v13, p1

    .line 107
    .line 108
    check-cast v13, La/fet;

    .line 109
    .line 110
    move-object/from16 v1, p2

    .line 111
    .line 112
    check-cast v1, Ljava/lang/Integer;

    .line 113
    .line 114
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    and-int/lit8 v3, v1, 0x3

    .line 119
    .line 120
    if-eq v3, v7, :cond_4

    .line 121
    .line 122
    move v6, v8

    .line 123
    :cond_4
    and-int/2addr v1, v8

    .line 124
    invoke-virtual {v13, v1, v6}, La/fet;->U(IZ)Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-eqz v1, :cond_7

    .line 129
    .line 130
    invoke-static {v5, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    new-instance v14, La/imm;

    .line 135
    .line 136
    new-instance v15, La/ilm;

    .line 137
    .line 138
    sget-object v3, La/zaq0;->b:La/zfn;

    .line 139
    .line 140
    invoke-virtual {v13, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    check-cast v4, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 145
    .line 146
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 147
    .line 148
    .line 149
    move-result-wide v4

    .line 150
    invoke-direct {v15, v4, v5}, La/ilm;-><init>(J)V

    .line 151
    .line 152
    .line 153
    new-instance v4, La/plm;

    .line 154
    .line 155
    invoke-interface {v0}, La/pl7;->getTitle()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {v13, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    check-cast v5, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 164
    .line 165
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 166
    .line 167
    .line 168
    move-result-wide v5

    .line 169
    sget-object v7, La/fa50;->a:La/fa50;

    .line 170
    .line 171
    invoke-direct {v4, v0, v5, v6, v7}, La/plm;-><init>(Ljava/lang/String;JLa/ga50;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v13, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 179
    .line 180
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 181
    .line 182
    .line 183
    move-result-wide v18

    .line 184
    const/16 v20, 0x0

    .line 185
    .line 186
    const/16 v21, 0x0

    .line 187
    .line 188
    sget-object v17, La/fmm;->a:La/fmm;

    .line 189
    .line 190
    move-object/from16 v16, v4

    .line 191
    .line 192
    invoke-direct/range {v14 .. v21}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v13, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    if-nez v0, :cond_5

    .line 204
    .line 205
    if-ne v3, v2, :cond_6

    .line 206
    .line 207
    :cond_5
    new-instance v3, La/dib;

    .line 208
    .line 209
    const/16 v0, 0x13

    .line 210
    .line 211
    invoke-direct {v3, v9, v0}, La/dib;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v13, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    :cond_6
    move-object v4, v3

    .line 218
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 219
    .line 220
    const/4 v15, 0x0

    .line 221
    const/16 v16, 0xff4

    .line 222
    .line 223
    const/4 v3, 0x0

    .line 224
    const/4 v5, 0x0

    .line 225
    const/4 v6, 0x0

    .line 226
    const/4 v7, 0x0

    .line 227
    const/4 v8, 0x0

    .line 228
    const/4 v9, 0x0

    .line 229
    const/4 v10, 0x0

    .line 230
    const/4 v11, 0x0

    .line 231
    const/4 v12, 0x0

    .line 232
    move-object v2, v14

    .line 233
    const/4 v14, 0x6

    .line 234
    invoke-static/range {v1 .. v16}, La/hlm;->c(La/mm40;La/imm;La/vkm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/fet;III)V

    .line 235
    .line 236
    .line 237
    goto :goto_2

    .line 238
    :cond_7
    invoke-virtual {v13}, La/fet;->X()V

    .line 239
    .line 240
    .line 241
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 242
    .line 243
    return-object v0

    .line 244
    :pswitch_2
    move-object/from16 v1, p1

    .line 245
    .line 246
    check-cast v1, La/fet;

    .line 247
    .line 248
    move-object/from16 v3, p2

    .line 249
    .line 250
    check-cast v3, Ljava/lang/Integer;

    .line 251
    .line 252
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    and-int/lit8 v4, v3, 0x3

    .line 257
    .line 258
    if-eq v4, v7, :cond_8

    .line 259
    .line 260
    move v4, v8

    .line 261
    goto :goto_3

    .line 262
    :cond_8
    move v4, v6

    .line 263
    :goto_3
    and-int/2addr v3, v8

    .line 264
    invoke-virtual {v1, v3, v4}, La/fet;->U(IZ)Z

    .line 265
    .line 266
    .line 267
    move-result v3

    .line 268
    if-eqz v3, :cond_e

    .line 269
    .line 270
    sget-object v3, La/qmk;->a:La/zcl;

    .line 271
    .line 272
    const/high16 v3, 0x42500000    # 52.0f

    .line 273
    .line 274
    invoke-static {v5, v3}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    sget-object v4, La/zaq0;->b:La/zfn;

    .line 279
    .line 280
    invoke-virtual {v1, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    check-cast v4, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 285
    .line 286
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 287
    .line 288
    .line 289
    move-result-wide v4

    .line 290
    const/4 v7, 0x0

    .line 291
    const/high16 v10, 0x41a00000    # 20.0f

    .line 292
    .line 293
    const/4 v11, 0x3

    .line 294
    invoke-static {v7, v7, v10, v10, v11}, La/vgg0;->c(FFFFI)La/ugg0;

    .line 295
    .line 296
    .line 297
    move-result-object v7

    .line 298
    invoke-static {v3, v4, v5, v7}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    const/high16 v4, 0x41000000    # 8.0f

    .line 303
    .line 304
    const/high16 v5, 0x41400000    # 12.0f

    .line 305
    .line 306
    invoke-static {v3, v5, v4, v5, v5}, La/s5x0;->M(La/mm40;FFFF)La/mm40;

    .line 307
    .line 308
    .line 309
    move-result-object v3

    .line 310
    sget-object v4, La/gqw0;->a:La/zx7;

    .line 311
    .line 312
    invoke-static {v4, v6}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 313
    .line 314
    .line 315
    move-result-object v4

    .line 316
    iget-wide v5, v1, La/fet;->T:J

    .line 317
    .line 318
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 319
    .line 320
    .line 321
    move-result v5

    .line 322
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 323
    .line 324
    .line 325
    move-result-object v6

    .line 326
    invoke-static {v1, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 327
    .line 328
    .line 329
    move-result-object v3

    .line 330
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 331
    .line 332
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v1}, La/fet;->i0()V

    .line 336
    .line 337
    .line 338
    iget-boolean v7, v1, La/fet;->S:Z

    .line 339
    .line 340
    if-eqz v7, :cond_9

    .line 341
    .line 342
    sget-object v7, La/e7z;->u1:La/pcy;

    .line 343
    .line 344
    invoke-virtual {v1, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 345
    .line 346
    .line 347
    goto :goto_4

    .line 348
    :cond_9
    invoke-virtual {v1}, La/fet;->r0()V

    .line 349
    .line 350
    .line 351
    :goto_4
    sget-object v7, La/gqw0;->x:La/shd;

    .line 352
    .line 353
    invoke-static {v1, v4, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 354
    .line 355
    .line 356
    sget-object v4, La/gqw0;->w:La/shd;

    .line 357
    .line 358
    invoke-static {v1, v6, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 359
    .line 360
    .line 361
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 362
    .line 363
    .line 364
    move-result-object v4

    .line 365
    sget-object v5, La/gqw0;->y:La/shd;

    .line 366
    .line 367
    invoke-static {v1, v4, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 368
    .line 369
    .line 370
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 371
    .line 372
    .line 373
    sget-object v4, La/gqw0;->v:La/shd;

    .line 374
    .line 375
    invoke-static {v1, v3, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 376
    .line 377
    .line 378
    invoke-interface {v0}, La/pl7;->b()La/on5;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    invoke-virtual {v1, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    move-result v3

    .line 386
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v4

    .line 390
    if-nez v3, :cond_a

    .line 391
    .line 392
    if-ne v4, v2, :cond_b

    .line 393
    .line 394
    :cond_a
    new-instance v4, La/dib;

    .line 395
    .line 396
    const/16 v3, 0x14

    .line 397
    .line 398
    invoke-direct {v4, v9, v3}, La/dib;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 402
    .line 403
    .line 404
    :cond_b
    move-object v3, v4

    .line 405
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 406
    .line 407
    invoke-virtual {v1, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 408
    .line 409
    .line 410
    move-result v4

    .line 411
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v5

    .line 415
    if-nez v4, :cond_c

    .line 416
    .line 417
    if-ne v5, v2, :cond_d

    .line 418
    .line 419
    :cond_c
    new-instance v5, La/dib;

    .line 420
    .line 421
    const/16 v2, 0x15

    .line 422
    .line 423
    invoke-direct {v5, v9, v2}, La/dib;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    :cond_d
    move-object v4, v5

    .line 430
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 431
    .line 432
    const/4 v6, 0x0

    .line 433
    const/4 v7, 0x1

    .line 434
    move-object v5, v1

    .line 435
    const/4 v1, 0x0

    .line 436
    move-object v2, v0

    .line 437
    invoke-static/range {v1 .. v7}, La/rcb;->j(La/mm40;La/on5;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v5, v8}, La/fet;->r(Z)V

    .line 441
    .line 442
    .line 443
    goto :goto_5

    .line 444
    :cond_e
    move-object v5, v1

    .line 445
    invoke-virtual {v5}, La/fet;->X()V

    .line 446
    .line 447
    .line 448
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 449
    .line 450
    return-object v0

    .line 451
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
