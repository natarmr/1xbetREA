.class public final synthetic La/c2s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;

.field public final synthetic c:La/l7m0;


# direct methods
.method public synthetic constructor <init>(La/l7m0;La/l7m0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/c2s;->a:B

    iput-object p1, p0, La/c2s;->b:La/l7m0;

    iput-object p2, p0, La/c2s;->c:La/l7m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/c2s;->a:B

    .line 4
    .line 5
    sget-object v2, La/e7z;->u1:La/pcy;

    .line 6
    .line 7
    const/16 v3, 0x12

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x4

    .line 11
    const/4 v6, 0x1

    .line 12
    iget-object v7, v0, La/c2s;->c:La/l7m0;

    .line 13
    .line 14
    iget-object v0, v0, La/c2s;->b:La/l7m0;

    .line 15
    .line 16
    const/4 v8, 0x0

    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, La/yhg0;

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
    and-int/lit8 v11, v10, 0x6

    .line 40
    .line 41
    if-nez v11, :cond_1

    .line 42
    .line 43
    invoke-virtual {v9, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v11

    .line 47
    if-eqz v11, :cond_0

    .line 48
    .line 49
    move v4, v5

    .line 50
    :cond_0
    or-int/2addr v10, v4

    .line 51
    :cond_1
    and-int/lit8 v4, v10, 0x13

    .line 52
    .line 53
    if-eq v4, v3, :cond_2

    .line 54
    .line 55
    move v3, v6

    .line 56
    goto :goto_0

    .line 57
    :cond_2
    move v3, v8

    .line 58
    :goto_0
    and-int/lit8 v4, v10, 0x1

    .line 59
    .line 60
    invoke-virtual {v9, v4, v3}, La/fet;->U(IZ)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_7

    .line 65
    .line 66
    new-array v3, v8, [Ljava/lang/Object;

    .line 67
    .line 68
    invoke-virtual {v9, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v10

    .line 76
    if-nez v4, :cond_3

    .line 77
    .line 78
    sget-object v4, La/ukd;->a:La/cl5;

    .line 79
    .line 80
    if-ne v10, v4, :cond_4

    .line 81
    .line 82
    :cond_3
    new-instance v10, La/ybt0;

    .line 83
    .line 84
    invoke-direct {v10, v0, v5}, La/ybt0;-><init>(La/l7m0;B)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v9, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :cond_4
    check-cast v10, Lkotlin/jvm/functions/Function0;

    .line 91
    .line 92
    invoke-static {v3, v10, v9}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    const/high16 v4, 0x3f800000    # 1.0f

    .line 97
    .line 98
    sget-object v10, La/jm40;->b:La/jm40;

    .line 99
    .line 100
    invoke-interface {v1, v4, v10, v6}, La/yhg0;->a(FLa/mm40;Z)La/mm40;

    .line 101
    .line 102
    .line 103
    move-result-object v11

    .line 104
    sget-object v1, La/qmk;->a:La/zcl;

    .line 105
    .line 106
    const/4 v15, 0x0

    .line 107
    const/16 v16, 0xa

    .line 108
    .line 109
    const/high16 v12, 0x41400000    # 12.0f

    .line 110
    .line 111
    const/4 v13, 0x0

    .line 112
    const/high16 v14, 0x40800000    # 4.0f

    .line 113
    .line 114
    invoke-static/range {v11 .. v16}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    sget-object v4, La/uc9;->c:La/mw3;

    .line 119
    .line 120
    sget-object v5, La/gqw0;->m:La/xx7;

    .line 121
    .line 122
    invoke-static {v4, v5, v9, v8}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    iget-wide v11, v9, La/fet;->T:J

    .line 127
    .line 128
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    invoke-virtual {v9}, La/fet;->m()La/bh90;

    .line 133
    .line 134
    .line 135
    move-result-object v11

    .line 136
    invoke-static {v9, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    sget-object v12, La/mkd;->c0:La/gqw0;

    .line 141
    .line 142
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v9}, La/fet;->i0()V

    .line 146
    .line 147
    .line 148
    iget-boolean v12, v9, La/fet;->S:Z

    .line 149
    .line 150
    if-eqz v12, :cond_5

    .line 151
    .line 152
    invoke-virtual {v9, v2}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 153
    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_5
    invoke-virtual {v9}, La/fet;->r0()V

    .line 157
    .line 158
    .line 159
    :goto_1
    sget-object v2, La/gqw0;->x:La/shd;

    .line 160
    .line 161
    invoke-static {v9, v4, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 162
    .line 163
    .line 164
    sget-object v2, La/gqw0;->w:La/shd;

    .line 165
    .line 166
    invoke-static {v9, v11, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 167
    .line 168
    .line 169
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    sget-object v4, La/gqw0;->y:La/shd;

    .line 174
    .line 175
    invoke-static {v9, v2, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 176
    .line 177
    .line 178
    invoke-static {v9}, La/jpm0;->n(La/fet;)V

    .line 179
    .line 180
    .line 181
    sget-object v2, La/gqw0;->v:La/shd;

    .line 182
    .line 183
    invoke-static {v9, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 184
    .line 185
    .line 186
    const/high16 v14, 0x40000000    # 2.0f

    .line 187
    .line 188
    const/4 v15, 0x7

    .line 189
    const/4 v11, 0x0

    .line 190
    const/4 v12, 0x0

    .line 191
    const/4 v13, 0x0

    .line 192
    invoke-static/range {v10 .. v15}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 193
    .line 194
    .line 195
    move-result-object v10

    .line 196
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    check-cast v1, Ljava/lang/String;

    .line 201
    .line 202
    sget-object v2, La/s6t0;->a:La/pz40;

    .line 203
    .line 204
    invoke-static {}, La/g1t0;->k()La/y9q0;

    .line 205
    .line 206
    .line 207
    move-result-object v29

    .line 208
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 213
    .line 214
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 215
    .line 216
    .line 217
    move-result-wide v11

    .line 218
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    check-cast v2, Ljava/lang/Number;

    .line 223
    .line 224
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 225
    .line 226
    .line 227
    move-result v26

    .line 228
    const/16 v32, 0x180

    .line 229
    .line 230
    const v33, 0x1aff8

    .line 231
    .line 232
    .line 233
    const/4 v13, 0x0

    .line 234
    const-wide/16 v14, 0x0

    .line 235
    .line 236
    const/16 v16, 0x0

    .line 237
    .line 238
    const/16 v17, 0x0

    .line 239
    .line 240
    const/16 v18, 0x0

    .line 241
    .line 242
    const-wide/16 v19, 0x0

    .line 243
    .line 244
    const/16 v21, 0x0

    .line 245
    .line 246
    const-wide/16 v22, 0x0

    .line 247
    .line 248
    const/16 v24, 0x2

    .line 249
    .line 250
    const/16 v25, 0x0

    .line 251
    .line 252
    const/16 v27, 0x0

    .line 253
    .line 254
    const/16 v28, 0x0

    .line 255
    .line 256
    const/16 v31, 0x0

    .line 257
    .line 258
    move-object/from16 v30, v9

    .line 259
    .line 260
    move-object v9, v1

    .line 261
    invoke-static/range {v9 .. v33}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 262
    .line 263
    .line 264
    move-object/from16 v1, v30

    .line 265
    .line 266
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    check-cast v2, Ljava/lang/CharSequence;

    .line 271
    .line 272
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 273
    .line 274
    .line 275
    move-result v2

    .line 276
    if-lez v2, :cond_6

    .line 277
    .line 278
    const v2, -0x397bcfed

    .line 279
    .line 280
    .line 281
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 282
    .line 283
    .line 284
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    move-object v9, v0

    .line 289
    check-cast v9, Ljava/lang/String;

    .line 290
    .line 291
    invoke-static {}, La/g1t0;->g()La/y9q0;

    .line 292
    .line 293
    .line 294
    move-result-object v29

    .line 295
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 300
    .line 301
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 302
    .line 303
    .line 304
    move-result-wide v11

    .line 305
    const/16 v32, 0x6180

    .line 306
    .line 307
    const v33, 0x1affa

    .line 308
    .line 309
    .line 310
    const/4 v10, 0x0

    .line 311
    const/4 v13, 0x0

    .line 312
    const-wide/16 v14, 0x0

    .line 313
    .line 314
    const/16 v16, 0x0

    .line 315
    .line 316
    const/16 v17, 0x0

    .line 317
    .line 318
    const/16 v18, 0x0

    .line 319
    .line 320
    const-wide/16 v19, 0x0

    .line 321
    .line 322
    const/16 v21, 0x0

    .line 323
    .line 324
    const-wide/16 v22, 0x0

    .line 325
    .line 326
    const/16 v24, 0x2

    .line 327
    .line 328
    const/16 v25, 0x0

    .line 329
    .line 330
    const/16 v26, 0x1

    .line 331
    .line 332
    const/16 v27, 0x0

    .line 333
    .line 334
    const/16 v28, 0x0

    .line 335
    .line 336
    const/16 v31, 0x0

    .line 337
    .line 338
    move-object/from16 v30, v1

    .line 339
    .line 340
    invoke-static/range {v9 .. v33}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v1, v8}, La/fet;->r(Z)V

    .line 344
    .line 345
    .line 346
    goto :goto_2

    .line 347
    :cond_6
    const v0, -0x397754ce

    .line 348
    .line 349
    .line 350
    invoke-virtual {v1, v0}, La/fet;->e0(I)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v1, v8}, La/fet;->r(Z)V

    .line 354
    .line 355
    .line 356
    :goto_2
    invoke-virtual {v1, v6}, La/fet;->r(Z)V

    .line 357
    .line 358
    .line 359
    goto :goto_3

    .line 360
    :cond_7
    move-object v1, v9

    .line 361
    invoke-virtual {v1}, La/fet;->X()V

    .line 362
    .line 363
    .line 364
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 365
    .line 366
    return-object v0

    .line 367
    :pswitch_0
    move-object/from16 v1, p1

    .line 368
    .line 369
    check-cast v1, La/yhg0;

    .line 370
    .line 371
    move-object/from16 v13, p2

    .line 372
    .line 373
    check-cast v13, La/fet;

    .line 374
    .line 375
    move-object/from16 v3, p3

    .line 376
    .line 377
    check-cast v3, Ljava/lang/Integer;

    .line 378
    .line 379
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 380
    .line 381
    .line 382
    move-result v3

    .line 383
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    and-int/lit8 v1, v3, 0x11

    .line 387
    .line 388
    const/16 v5, 0x10

    .line 389
    .line 390
    if-eq v1, v5, :cond_8

    .line 391
    .line 392
    move v8, v6

    .line 393
    :cond_8
    and-int/lit8 v1, v3, 0x1

    .line 394
    .line 395
    invoke-virtual {v13, v1, v8}, La/fet;->U(IZ)Z

    .line 396
    .line 397
    .line 398
    move-result v1

    .line 399
    if-eqz v1, :cond_c

    .line 400
    .line 401
    sget-object v1, La/gqw0;->k:La/yx7;

    .line 402
    .line 403
    sget-object v3, La/uc9;->a:La/lw3;

    .line 404
    .line 405
    const/16 v5, 0x30

    .line 406
    .line 407
    invoke-static {v3, v1, v13, v5}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    iget-wide v8, v13, La/fet;->T:J

    .line 412
    .line 413
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 414
    .line 415
    .line 416
    move-result v3

    .line 417
    invoke-virtual {v13}, La/fet;->m()La/bh90;

    .line 418
    .line 419
    .line 420
    move-result-object v5

    .line 421
    sget-object v8, La/jm40;->b:La/jm40;

    .line 422
    .line 423
    invoke-static {v13, v8}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 424
    .line 425
    .line 426
    move-result-object v9

    .line 427
    sget-object v10, La/mkd;->c0:La/gqw0;

    .line 428
    .line 429
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v13}, La/fet;->i0()V

    .line 433
    .line 434
    .line 435
    iget-boolean v10, v13, La/fet;->S:Z

    .line 436
    .line 437
    if-eqz v10, :cond_9

    .line 438
    .line 439
    invoke-virtual {v13, v2}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 440
    .line 441
    .line 442
    goto :goto_4

    .line 443
    :cond_9
    invoke-virtual {v13}, La/fet;->r0()V

    .line 444
    .line 445
    .line 446
    :goto_4
    sget-object v2, La/gqw0;->x:La/shd;

    .line 447
    .line 448
    invoke-static {v13, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 449
    .line 450
    .line 451
    sget-object v1, La/gqw0;->w:La/shd;

    .line 452
    .line 453
    invoke-static {v13, v5, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 454
    .line 455
    .line 456
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 457
    .line 458
    .line 459
    move-result-object v1

    .line 460
    sget-object v2, La/gqw0;->y:La/shd;

    .line 461
    .line 462
    invoke-static {v13, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 463
    .line 464
    .line 465
    invoke-static {v13}, La/jpm0;->n(La/fet;)V

    .line 466
    .line 467
    .line 468
    sget-object v1, La/gqw0;->v:La/shd;

    .line 469
    .line 470
    invoke-static {v13, v9, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 471
    .line 472
    .line 473
    sget-object v1, La/qmk;->a:La/zcl;

    .line 474
    .line 475
    const/high16 v1, 0x42500000    # 52.0f

    .line 476
    .line 477
    invoke-static {v8, v1}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 478
    .line 479
    .line 480
    move-result-object v10

    .line 481
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    check-cast v0, Ljava/lang/CharSequence;

    .line 486
    .line 487
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 488
    .line 489
    .line 490
    move-result v2

    .line 491
    const-string v3, "-"

    .line 492
    .line 493
    if-nez v2, :cond_a

    .line 494
    .line 495
    move-object v0, v3

    .line 496
    :cond_a
    move-object v9, v0

    .line 497
    check-cast v9, Ljava/lang/String;

    .line 498
    .line 499
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 500
    .line 501
    invoke-static {}, La/g1t0;->x()La/y9q0;

    .line 502
    .line 503
    .line 504
    move-result-object v29

    .line 505
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 510
    .line 511
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 512
    .line 513
    .line 514
    move-result-wide v11

    .line 515
    new-instance v0, La/f2q0;

    .line 516
    .line 517
    const/4 v2, 0x3

    .line 518
    invoke-direct {v0, v2}, La/f2q0;-><init>(I)V

    .line 519
    .line 520
    .line 521
    const/16 v32, 0x6180

    .line 522
    .line 523
    const v33, 0x1abf8

    .line 524
    .line 525
    .line 526
    move-object/from16 v30, v13

    .line 527
    .line 528
    const/4 v13, 0x0

    .line 529
    const-wide/16 v14, 0x0

    .line 530
    .line 531
    const/16 v16, 0x0

    .line 532
    .line 533
    const/16 v17, 0x0

    .line 534
    .line 535
    const/16 v18, 0x0

    .line 536
    .line 537
    const-wide/16 v19, 0x0

    .line 538
    .line 539
    const-wide/16 v22, 0x0

    .line 540
    .line 541
    const/16 v24, 0x2

    .line 542
    .line 543
    const/16 v25, 0x0

    .line 544
    .line 545
    const/16 v26, 0x1

    .line 546
    .line 547
    const/16 v27, 0x0

    .line 548
    .line 549
    const/16 v28, 0x0

    .line 550
    .line 551
    const/16 v31, 0x0

    .line 552
    .line 553
    move-object/from16 v21, v0

    .line 554
    .line 555
    invoke-static/range {v9 .. v33}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 556
    .line 557
    .line 558
    const/high16 v0, 0x40800000    # 4.0f

    .line 559
    .line 560
    const/4 v5, 0x0

    .line 561
    invoke-static {v8, v0, v5, v4}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    const/high16 v4, 0x41c00000    # 24.0f

    .line 566
    .line 567
    invoke-static {v0, v4}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 568
    .line 569
    .line 570
    move-result-object v9

    .line 571
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 576
    .line 577
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSeparator-0d7_KjU()J

    .line 578
    .line 579
    .line 580
    move-result-wide v11

    .line 581
    const/4 v14, 0x0

    .line 582
    const/4 v15, 0x0

    .line 583
    const/high16 v10, 0x3f800000    # 1.0f

    .line 584
    .line 585
    move-object/from16 v13, v30

    .line 586
    .line 587
    invoke-static/range {v9 .. v15}, La/jcb;->H(La/mm40;FJLa/fet;II)V

    .line 588
    .line 589
    .line 590
    invoke-static {v8, v1}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 591
    .line 592
    .line 593
    move-result-object v10

    .line 594
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    check-cast v0, Ljava/lang/CharSequence;

    .line 599
    .line 600
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 601
    .line 602
    .line 603
    move-result v1

    .line 604
    if-nez v1, :cond_b

    .line 605
    .line 606
    goto :goto_5

    .line 607
    :cond_b
    move-object v3, v0

    .line 608
    :goto_5
    move-object v9, v3

    .line 609
    check-cast v9, Ljava/lang/String;

    .line 610
    .line 611
    invoke-static {}, La/g1t0;->x()La/y9q0;

    .line 612
    .line 613
    .line 614
    move-result-object v29

    .line 615
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 620
    .line 621
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 622
    .line 623
    .line 624
    move-result-wide v11

    .line 625
    new-instance v0, La/f2q0;

    .line 626
    .line 627
    invoke-direct {v0, v2}, La/f2q0;-><init>(I)V

    .line 628
    .line 629
    .line 630
    const/16 v32, 0x6180

    .line 631
    .line 632
    const v33, 0x1abf8

    .line 633
    .line 634
    .line 635
    const/4 v13, 0x0

    .line 636
    const-wide/16 v14, 0x0

    .line 637
    .line 638
    const/16 v16, 0x0

    .line 639
    .line 640
    const/16 v17, 0x0

    .line 641
    .line 642
    const/16 v18, 0x0

    .line 643
    .line 644
    const-wide/16 v19, 0x0

    .line 645
    .line 646
    const-wide/16 v22, 0x0

    .line 647
    .line 648
    const/16 v24, 0x2

    .line 649
    .line 650
    const/16 v25, 0x0

    .line 651
    .line 652
    const/16 v26, 0x1

    .line 653
    .line 654
    const/16 v27, 0x0

    .line 655
    .line 656
    const/16 v28, 0x0

    .line 657
    .line 658
    const/16 v31, 0x0

    .line 659
    .line 660
    move-object/from16 v21, v0

    .line 661
    .line 662
    invoke-static/range {v9 .. v33}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 663
    .line 664
    .line 665
    move-object/from16 v13, v30

    .line 666
    .line 667
    invoke-virtual {v13, v6}, La/fet;->r(Z)V

    .line 668
    .line 669
    .line 670
    goto :goto_6

    .line 671
    :cond_c
    invoke-virtual {v13}, La/fet;->X()V

    .line 672
    .line 673
    .line 674
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 675
    .line 676
    return-object v0

    .line 677
    :pswitch_1
    move-object/from16 v1, p1

    .line 678
    .line 679
    check-cast v1, La/mm40;

    .line 680
    .line 681
    move-object/from16 v2, p2

    .line 682
    .line 683
    check-cast v2, La/fet;

    .line 684
    .line 685
    move-object/from16 v9, p3

    .line 686
    .line 687
    check-cast v9, Ljava/lang/Integer;

    .line 688
    .line 689
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 690
    .line 691
    .line 692
    move-result v9

    .line 693
    sget-object v10, La/j2s;->b2:La/xak;

    .line 694
    .line 695
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 696
    .line 697
    .line 698
    and-int/lit8 v10, v9, 0x6

    .line 699
    .line 700
    if-nez v10, :cond_e

    .line 701
    .line 702
    invoke-virtual {v2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 703
    .line 704
    .line 705
    move-result v10

    .line 706
    if-eqz v10, :cond_d

    .line 707
    .line 708
    move v4, v5

    .line 709
    :cond_d
    or-int/2addr v9, v4

    .line 710
    :cond_e
    and-int/lit8 v4, v9, 0x13

    .line 711
    .line 712
    if-eq v4, v3, :cond_f

    .line 713
    .line 714
    move v3, v6

    .line 715
    goto :goto_7

    .line 716
    :cond_f
    move v3, v8

    .line 717
    :goto_7
    and-int/lit8 v4, v9, 0x1

    .line 718
    .line 719
    invoke-virtual {v2, v4, v3}, La/fet;->U(IZ)Z

    .line 720
    .line 721
    .line 722
    move-result v3

    .line 723
    if-eqz v3, :cond_10

    .line 724
    .line 725
    sget-object v3, La/kr00;->a:La/zfn;

    .line 726
    .line 727
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 728
    .line 729
    .line 730
    move-result-object v0

    .line 731
    invoke-virtual {v3, v0}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 732
    .line 733
    .line 734
    move-result-object v0

    .line 735
    new-instance v3, La/e2s;

    .line 736
    .line 737
    invoke-direct {v3, v1, v7, v8}, La/e2s;-><init>(La/mm40;La/l7m0;B)V

    .line 738
    .line 739
    .line 740
    const v1, -0x6981020b

    .line 741
    .line 742
    .line 743
    invoke-static {v1, v3, v2}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 744
    .line 745
    .line 746
    move-result-object v1

    .line 747
    const/16 v3, 0x38

    .line 748
    .line 749
    invoke-static {v0, v1, v2, v3}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 750
    .line 751
    .line 752
    goto :goto_8

    .line 753
    :cond_10
    invoke-virtual {v2}, La/fet;->X()V

    .line 754
    .line 755
    .line 756
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 757
    .line 758
    return-object v0

    .line 759
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
