.class public final synthetic La/hp30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/jp30;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/jp30;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/hp30;->a:B

    iput-object p1, p0, La/hp30;->b:La/jp30;

    iput-object p2, p0, La/hp30;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/hp30;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/high16 v3, 0x41800000    # 16.0f

    .line 8
    .line 9
    sget-object v4, La/jm40;->b:La/jm40;

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x0

    .line 14
    iget-object v8, v0, La/hp30;->c:Lkotlin/jvm/functions/Function1;

    .line 15
    .line 16
    iget-object v0, v0, La/hp30;->b:La/jp30;

    .line 17
    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    move-object/from16 v12, p1

    .line 22
    .line 23
    check-cast v12, La/fet;

    .line 24
    .line 25
    move-object/from16 v1, p2

    .line 26
    .line 27
    check-cast v1, Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    and-int/lit8 v9, v1, 0x3

    .line 34
    .line 35
    if-eq v9, v5, :cond_0

    .line 36
    .line 37
    move v5, v6

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v5, v7

    .line 40
    :goto_0
    and-int/2addr v1, v6

    .line 41
    invoke-virtual {v12, v1, v5}, La/fet;->U(IZ)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_5

    .line 46
    .line 47
    iget-object v1, v0, La/jp30;->i:La/wul;

    .line 48
    .line 49
    if-eqz v1, :cond_4

    .line 50
    .line 51
    const v1, -0x7e243080

    .line 52
    .line 53
    .line 54
    invoke-virtual {v12, v1}, La/fet;->e0(I)V

    .line 55
    .line 56
    .line 57
    sget-object v1, La/uc9;->c:La/mw3;

    .line 58
    .line 59
    sget-object v5, La/gqw0;->m:La/xx7;

    .line 60
    .line 61
    invoke-static {v1, v5, v12, v7}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    iget-wide v9, v12, La/fet;->T:J

    .line 66
    .line 67
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    invoke-virtual {v12}, La/fet;->m()La/bh90;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    invoke-static {v12, v4}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 76
    .line 77
    .line 78
    move-result-object v10

    .line 79
    sget-object v11, La/mkd;->c0:La/gqw0;

    .line 80
    .line 81
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v12}, La/fet;->i0()V

    .line 85
    .line 86
    .line 87
    iget-boolean v11, v12, La/fet;->S:Z

    .line 88
    .line 89
    if-eqz v11, :cond_1

    .line 90
    .line 91
    sget-object v11, La/e7z;->u1:La/pcy;

    .line 92
    .line 93
    invoke-virtual {v12, v11}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_1
    invoke-virtual {v12}, La/fet;->r0()V

    .line 98
    .line 99
    .line 100
    :goto_1
    sget-object v11, La/gqw0;->x:La/shd;

    .line 101
    .line 102
    invoke-static {v12, v1, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 103
    .line 104
    .line 105
    sget-object v1, La/gqw0;->w:La/shd;

    .line 106
    .line 107
    invoke-static {v12, v9, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 108
    .line 109
    .line 110
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    sget-object v5, La/gqw0;->y:La/shd;

    .line 115
    .line 116
    invoke-static {v12, v1, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 117
    .line 118
    .line 119
    invoke-static {v12}, La/jpm0;->n(La/fet;)V

    .line 120
    .line 121
    .line 122
    sget-object v1, La/gqw0;->v:La/shd;

    .line 123
    .line 124
    invoke-static {v12, v10, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 125
    .line 126
    .line 127
    const/high16 v1, 0x3f800000    # 1.0f

    .line 128
    .line 129
    invoke-static {v4, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    sget-object v5, La/qmk;->a:La/zcl;

    .line 134
    .line 135
    const/high16 v5, 0x41000000    # 8.0f

    .line 136
    .line 137
    invoke-static {v4, v3, v5}, La/s5x0;->K(La/mm40;FF)La/mm40;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    iget v4, v0, La/jp30;->h:F

    .line 142
    .line 143
    sub-float/2addr v1, v4

    .line 144
    invoke-static {v3, v1}, La/epv0;->N(La/mm40;F)La/mm40;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    const-string v3, "COLLAPSED_MAKE_BET_BUTTON"

    .line 149
    .line 150
    invoke-static {v1, v3}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 151
    .line 152
    .line 153
    move-result-object v9

    .line 154
    iget-object v10, v0, La/jp30;->i:La/wul;

    .line 155
    .line 156
    invoke-virtual {v12, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    if-nez v0, :cond_2

    .line 165
    .line 166
    if-ne v1, v2, :cond_3

    .line 167
    .line 168
    :cond_2
    new-instance v1, La/ia30;

    .line 169
    .line 170
    const/16 v0, 0xd

    .line 171
    .line 172
    invoke-direct {v1, v8, v0}, La/ia30;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v12, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    :cond_3
    move-object v11, v1

    .line 179
    check-cast v11, Lkotlin/jvm/functions/Function0;

    .line 180
    .line 181
    const/4 v13, 0x0

    .line 182
    const/4 v14, 0x0

    .line 183
    invoke-static/range {v9 .. v14}, La/qzb;->n(La/mm40;La/wul;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v12, v6}, La/fet;->r(Z)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v12, v7}, La/fet;->r(Z)V

    .line 190
    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_4
    const v0, -0x7e1c2ede

    .line 194
    .line 195
    .line 196
    invoke-virtual {v12, v0}, La/fet;->e0(I)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v12, v7}, La/fet;->r(Z)V

    .line 200
    .line 201
    .line 202
    goto :goto_2

    .line 203
    :cond_5
    invoke-virtual {v12}, La/fet;->X()V

    .line 204
    .line 205
    .line 206
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 207
    .line 208
    return-object v0

    .line 209
    :pswitch_0
    move-object/from16 v14, p1

    .line 210
    .line 211
    check-cast v14, La/fet;

    .line 212
    .line 213
    move-object/from16 v1, p2

    .line 214
    .line 215
    check-cast v1, Ljava/lang/Integer;

    .line 216
    .line 217
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    and-int/lit8 v9, v1, 0x3

    .line 222
    .line 223
    if-eq v9, v5, :cond_6

    .line 224
    .line 225
    move v5, v6

    .line 226
    goto :goto_3

    .line 227
    :cond_6
    move v5, v7

    .line 228
    :goto_3
    and-int/2addr v1, v6

    .line 229
    invoke-virtual {v14, v1, v5}, La/fet;->U(IZ)Z

    .line 230
    .line 231
    .line 232
    move-result v1

    .line 233
    if-eqz v1, :cond_15

    .line 234
    .line 235
    iget-object v0, v0, La/jp30;->a:La/t820;

    .line 236
    .line 237
    if-eqz v0, :cond_14

    .line 238
    .line 239
    instance-of v1, v0, La/n820;

    .line 240
    .line 241
    const/16 v5, 0xc

    .line 242
    .line 243
    if-eqz v1, :cond_b

    .line 244
    .line 245
    const v1, 0x1f1df807

    .line 246
    .line 247
    .line 248
    invoke-virtual {v14, v1}, La/fet;->e0(I)V

    .line 249
    .line 250
    .line 251
    sget-object v1, La/zaq0;->b:La/zfn;

    .line 252
    .line 253
    invoke-virtual {v14, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    check-cast v1, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 258
    .line 259
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundGroupSecondary-0d7_KjU()J

    .line 260
    .line 261
    .line 262
    move-result-wide v9

    .line 263
    sget-object v1, La/qmk;->a:La/zcl;

    .line 264
    .line 265
    const/4 v1, 0x0

    .line 266
    invoke-static {v3, v3, v1, v1, v5}, La/vgg0;->c(FFFFI)La/ugg0;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    invoke-static {v4, v9, v10, v1}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    check-cast v0, La/n820;

    .line 275
    .line 276
    iget-object v0, v0, La/n820;->a:La/dye;

    .line 277
    .line 278
    invoke-virtual {v14, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result v3

    .line 282
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v4

    .line 286
    if-nez v3, :cond_7

    .line 287
    .line 288
    if-ne v4, v2, :cond_8

    .line 289
    .line 290
    :cond_7
    new-instance v4, La/ia30;

    .line 291
    .line 292
    const/4 v3, 0x7

    .line 293
    invoke-direct {v4, v8, v3}, La/ia30;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v14, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    :cond_8
    move-object v3, v4

    .line 300
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 301
    .line 302
    invoke-virtual {v14, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result v4

    .line 306
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v5

    .line 310
    if-nez v4, :cond_9

    .line 311
    .line 312
    if-ne v5, v2, :cond_a

    .line 313
    .line 314
    :cond_9
    new-instance v5, La/ia30;

    .line 315
    .line 316
    const/16 v2, 0x8

    .line 317
    .line 318
    invoke-direct {v5, v8, v2}, La/ia30;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v14, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    :cond_a
    move-object v4, v5

    .line 325
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 326
    .line 327
    const/4 v6, 0x0

    .line 328
    move-object v2, v0

    .line 329
    move-object v5, v14

    .line 330
    invoke-static/range {v1 .. v6}, La/lmc;->e(La/mm40;La/dye;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v14, v7}, La/fet;->r(Z)V

    .line 334
    .line 335
    .line 336
    goto/16 :goto_4

    .line 337
    .line 338
    :cond_b
    instance-of v1, v0, La/q820;

    .line 339
    .line 340
    if-eqz v1, :cond_14

    .line 341
    .line 342
    const v1, 0x1f2905a0

    .line 343
    .line 344
    .line 345
    invoke-virtual {v14, v1}, La/fet;->e0(I)V

    .line 346
    .line 347
    .line 348
    check-cast v0, La/q820;

    .line 349
    .line 350
    iget-object v9, v0, La/q820;->a:La/xy6;

    .line 351
    .line 352
    invoke-virtual {v14, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    if-nez v0, :cond_c

    .line 361
    .line 362
    if-ne v1, v2, :cond_d

    .line 363
    .line 364
    :cond_c
    new-instance v1, La/ia30;

    .line 365
    .line 366
    const/16 v0, 0x9

    .line 367
    .line 368
    invoke-direct {v1, v8, v0}, La/ia30;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v14, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 372
    .line 373
    .line 374
    :cond_d
    move-object v10, v1

    .line 375
    check-cast v10, Lkotlin/jvm/functions/Function0;

    .line 376
    .line 377
    invoke-virtual {v14, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    move-result v0

    .line 381
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    if-nez v0, :cond_e

    .line 386
    .line 387
    if-ne v1, v2, :cond_f

    .line 388
    .line 389
    :cond_e
    new-instance v1, La/ia30;

    .line 390
    .line 391
    const/16 v0, 0xa

    .line 392
    .line 393
    invoke-direct {v1, v8, v0}, La/ia30;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v14, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 397
    .line 398
    .line 399
    :cond_f
    move-object v11, v1

    .line 400
    check-cast v11, Lkotlin/jvm/functions/Function0;

    .line 401
    .line 402
    invoke-virtual {v14, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v1

    .line 410
    if-nez v0, :cond_10

    .line 411
    .line 412
    if-ne v1, v2, :cond_11

    .line 413
    .line 414
    :cond_10
    new-instance v1, La/ia30;

    .line 415
    .line 416
    const/16 v0, 0xb

    .line 417
    .line 418
    invoke-direct {v1, v8, v0}, La/ia30;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v14, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 422
    .line 423
    .line 424
    :cond_11
    move-object v12, v1

    .line 425
    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 426
    .line 427
    invoke-virtual {v14, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    move-result v0

    .line 431
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    if-nez v0, :cond_12

    .line 436
    .line 437
    if-ne v1, v2, :cond_13

    .line 438
    .line 439
    :cond_12
    new-instance v1, La/ia30;

    .line 440
    .line 441
    invoke-direct {v1, v8, v5}, La/ia30;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v14, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 445
    .line 446
    .line 447
    :cond_13
    move-object v13, v1

    .line 448
    check-cast v13, Lkotlin/jvm/functions/Function0;

    .line 449
    .line 450
    const/4 v15, 0x0

    .line 451
    const/4 v8, 0x0

    .line 452
    invoke-static/range {v8 .. v15}, La/nnw0;->b(La/mm40;La/xy6;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v14, v7}, La/fet;->r(Z)V

    .line 456
    .line 457
    .line 458
    goto :goto_4

    .line 459
    :cond_14
    const v0, -0x410f93a8

    .line 460
    .line 461
    .line 462
    invoke-static {v0, v14, v7}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    throw v0

    .line 467
    :cond_15
    invoke-virtual {v14}, La/fet;->X()V

    .line 468
    .line 469
    .line 470
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 471
    .line 472
    return-object v0

    .line 473
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
