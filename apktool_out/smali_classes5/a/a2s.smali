.class public final synthetic La/a2s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;

.field public final synthetic c:La/j2s;


# direct methods
.method public synthetic constructor <init>(La/l7m0;La/j2s;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/a2s;->a:B

    iput-object p1, p0, La/a2s;->b:La/l7m0;

    iput-object p2, p0, La/a2s;->c:La/j2s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/a2s;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

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
    iget-object v7, v0, La/a2s;->c:La/j2s;

    .line 13
    .line 14
    iget-object v0, v0, La/a2s;->b:La/l7m0;

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
    check-cast v1, La/mm40;

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
    sget-object v11, La/j2s;->b2:La/xak;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    and-int/lit8 v11, v10, 0x6

    .line 42
    .line 43
    if-nez v11, :cond_1

    .line 44
    .line 45
    invoke-virtual {v9, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v11

    .line 49
    if-eqz v11, :cond_0

    .line 50
    .line 51
    move v4, v5

    .line 52
    :cond_0
    or-int/2addr v10, v4

    .line 53
    :cond_1
    and-int/lit8 v4, v10, 0x13

    .line 54
    .line 55
    if-eq v4, v3, :cond_2

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    move v6, v8

    .line 59
    :goto_0
    and-int/lit8 v3, v10, 0x1

    .line 60
    .line 61
    invoke-virtual {v9, v3, v6}, La/fet;->U(IZ)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_5

    .line 66
    .line 67
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, La/d0k0;

    .line 72
    .line 73
    invoke-virtual {v9, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    if-nez v3, :cond_3

    .line 82
    .line 83
    if-ne v4, v2, :cond_4

    .line 84
    .line 85
    :cond_3
    new-instance v4, La/g2s;

    .line 86
    .line 87
    invoke-direct {v4, v7, v8}, La/g2s;-><init>(La/j2s;B)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v9, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :cond_4
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 94
    .line 95
    and-int/lit8 v2, v10, 0xe

    .line 96
    .line 97
    invoke-static {v1, v0, v4, v9, v2}, La/bww;->u(La/mm40;La/d0k0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_5
    invoke-virtual {v9}, La/fet;->X()V

    .line 102
    .line 103
    .line 104
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    return-object v0

    .line 107
    :pswitch_0
    move-object/from16 v1, p1

    .line 108
    .line 109
    check-cast v1, La/mm40;

    .line 110
    .line 111
    move-object/from16 v9, p2

    .line 112
    .line 113
    check-cast v9, La/fet;

    .line 114
    .line 115
    move-object/from16 v10, p3

    .line 116
    .line 117
    check-cast v10, Ljava/lang/Integer;

    .line 118
    .line 119
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 120
    .line 121
    .line 122
    move-result v10

    .line 123
    sget-object v11, La/j2s;->b2:La/xak;

    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    and-int/lit8 v11, v10, 0x6

    .line 129
    .line 130
    if-nez v11, :cond_7

    .line 131
    .line 132
    invoke-virtual {v9, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v11

    .line 136
    if-eqz v11, :cond_6

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_6
    move v5, v4

    .line 140
    :goto_2
    or-int/2addr v10, v5

    .line 141
    :cond_7
    and-int/lit8 v5, v10, 0x13

    .line 142
    .line 143
    if-eq v5, v3, :cond_8

    .line 144
    .line 145
    move v3, v6

    .line 146
    goto :goto_3

    .line 147
    :cond_8
    move v3, v8

    .line 148
    :goto_3
    and-int/lit8 v5, v10, 0x1

    .line 149
    .line 150
    invoke-virtual {v9, v5, v3}, La/fet;->U(IZ)Z

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    if-eqz v3, :cond_e

    .line 155
    .line 156
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    check-cast v3, La/n930;

    .line 161
    .line 162
    iget-boolean v3, v3, La/n930;->j:Z

    .line 163
    .line 164
    if-eqz v3, :cond_d

    .line 165
    .line 166
    const v3, 0xf3a60f0

    .line 167
    .line 168
    .line 169
    invoke-virtual {v9, v3}, La/fet;->e0(I)V

    .line 170
    .line 171
    .line 172
    const/high16 v3, 0x3f800000    # 1.0f

    .line 173
    .line 174
    invoke-static {v1, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 175
    .line 176
    .line 177
    move-result-object v10

    .line 178
    sget-object v1, La/qmk;->a:La/zcl;

    .line 179
    .line 180
    const/4 v14, 0x0

    .line 181
    const/16 v15, 0xd

    .line 182
    .line 183
    const/4 v11, 0x0

    .line 184
    const/high16 v12, 0x40800000    # 4.0f

    .line 185
    .line 186
    const/4 v13, 0x0

    .line 187
    invoke-static/range {v10 .. v15}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    const/high16 v3, 0x40800000    # 4.0f

    .line 192
    .line 193
    const/4 v5, 0x0

    .line 194
    invoke-static {v1, v3, v5, v4}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    check-cast v3, La/n930;

    .line 203
    .line 204
    iget-object v12, v3, La/n930;->h:La/dxh0;

    .line 205
    .line 206
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    check-cast v3, La/n930;

    .line 211
    .line 212
    iget-object v10, v3, La/n930;->i:La/a4x;

    .line 213
    .line 214
    invoke-virtual {v9, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    if-nez v3, :cond_9

    .line 223
    .line 224
    if-ne v4, v2, :cond_a

    .line 225
    .line 226
    :cond_9
    new-instance v4, La/zwp;

    .line 227
    .line 228
    const/16 v3, 0x14

    .line 229
    .line 230
    invoke-direct {v4, v0, v3}, La/zwp;-><init>(La/l7m0;B)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v9, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    :cond_a
    move-object v14, v4

    .line 237
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 238
    .line 239
    invoke-virtual {v9, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    invoke-virtual {v9, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v4

    .line 247
    or-int/2addr v3, v4

    .line 248
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    if-nez v3, :cond_b

    .line 253
    .line 254
    if-ne v4, v2, :cond_c

    .line 255
    .line 256
    :cond_b
    new-instance v4, La/f5p;

    .line 257
    .line 258
    const/16 v2, 0x1c

    .line 259
    .line 260
    invoke-direct {v4, v0, v7, v2}, La/f5p;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v9, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    :cond_c
    move-object v15, v4

    .line 267
    check-cast v15, Lkotlin/jvm/functions/Function1;

    .line 268
    .line 269
    const/16 v17, 0x180

    .line 270
    .line 271
    const/16 v18, 0x10

    .line 272
    .line 273
    sget-object v11, La/fxh0;->a:La/fxh0;

    .line 274
    .line 275
    const/4 v13, 0x0

    .line 276
    move-object/from16 v16, v9

    .line 277
    .line 278
    move-object v9, v1

    .line 279
    invoke-static/range {v9 .. v18}, La/ibc;->n(La/mm40;La/a4x;La/hxh0;La/dxh0;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 280
    .line 281
    .line 282
    move-object/from16 v0, v16

    .line 283
    .line 284
    invoke-virtual {v0, v8}, La/fet;->r(Z)V

    .line 285
    .line 286
    .line 287
    goto :goto_4

    .line 288
    :cond_d
    move-object v0, v9

    .line 289
    const v1, 0xf52cf4f

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v0, v8}, La/fet;->r(Z)V

    .line 296
    .line 297
    .line 298
    goto :goto_4

    .line 299
    :cond_e
    move-object v0, v9

    .line 300
    invoke-virtual {v0}, La/fet;->X()V

    .line 301
    .line 302
    .line 303
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 304
    .line 305
    return-object v0

    .line 306
    :pswitch_1
    move-object/from16 v1, p1

    .line 307
    .line 308
    check-cast v1, La/mm40;

    .line 309
    .line 310
    move-object/from16 v9, p2

    .line 311
    .line 312
    check-cast v9, La/fet;

    .line 313
    .line 314
    move-object/from16 v10, p3

    .line 315
    .line 316
    check-cast v10, Ljava/lang/Integer;

    .line 317
    .line 318
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 319
    .line 320
    .line 321
    move-result v10

    .line 322
    sget-object v11, La/j2s;->b2:La/xak;

    .line 323
    .line 324
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    and-int/lit8 v11, v10, 0x6

    .line 328
    .line 329
    if-nez v11, :cond_10

    .line 330
    .line 331
    invoke-virtual {v9, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v11

    .line 335
    if-eqz v11, :cond_f

    .line 336
    .line 337
    move v4, v5

    .line 338
    :cond_f
    or-int/2addr v10, v4

    .line 339
    :cond_10
    and-int/lit8 v4, v10, 0x13

    .line 340
    .line 341
    if-eq v4, v3, :cond_11

    .line 342
    .line 343
    goto :goto_5

    .line 344
    :cond_11
    move v6, v8

    .line 345
    :goto_5
    and-int/lit8 v3, v10, 0x1

    .line 346
    .line 347
    invoke-virtual {v9, v3, v6}, La/fet;->U(IZ)Z

    .line 348
    .line 349
    .line 350
    move-result v3

    .line 351
    if-eqz v3, :cond_17

    .line 352
    .line 353
    invoke-virtual {v7}, La/j2s;->J0()La/k3t0;

    .line 354
    .line 355
    .line 356
    move-result-object v13

    .line 357
    invoke-virtual {v9, v13}, La/fet;->i(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v3

    .line 361
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v4

    .line 365
    if-nez v3, :cond_12

    .line 366
    .line 367
    if-ne v4, v2, :cond_13

    .line 368
    .line 369
    :cond_12
    new-instance v11, La/h2s;

    .line 370
    .line 371
    const/16 v17, 0x0

    .line 372
    .line 373
    const/16 v18, 0x0

    .line 374
    .line 375
    const/4 v12, 0x1

    .line 376
    const-class v14, La/k3t0;

    .line 377
    .line 378
    const-string v15, "onAction"

    .line 379
    .line 380
    const-string v16, "onAction(Ljava/lang/Object;)V"

    .line 381
    .line 382
    invoke-direct/range {v11 .. v18}, La/h2s;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v9, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    move-object v4, v11

    .line 389
    :cond_13
    check-cast v4, La/jhy;

    .line 390
    .line 391
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 392
    .line 393
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v3

    .line 403
    check-cast v3, La/b3s;

    .line 404
    .line 405
    iget-object v3, v3, La/b3s;->e:La/zbk;

    .line 406
    .line 407
    invoke-virtual {v3}, La/zbk;->getValue()Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v3

    .line 411
    check-cast v3, Ljava/lang/String;

    .line 412
    .line 413
    if-nez v3, :cond_14

    .line 414
    .line 415
    const-string v3, ""

    .line 416
    .line 417
    :cond_14
    invoke-static {v3, v9}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 418
    .line 419
    .line 420
    move-result-object v3

    .line 421
    invoke-virtual {v9, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result v5

    .line 425
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v6

    .line 429
    if-nez v5, :cond_15

    .line 430
    .line 431
    if-ne v6, v2, :cond_16

    .line 432
    .line 433
    :cond_15
    new-instance v6, La/o0q0;

    .line 434
    .line 435
    const/16 v2, 0x10

    .line 436
    .line 437
    invoke-direct {v6, v4, v2}, La/o0q0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v9, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 441
    .line 442
    .line 443
    :cond_16
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 444
    .line 445
    new-instance v2, La/itz;

    .line 446
    .line 447
    const/4 v5, 0x6

    .line 448
    invoke-direct {v2, v0, v4, v5}, La/itz;-><init>(La/l7m0;Lkotlin/jvm/functions/Function1;B)V

    .line 449
    .line 450
    .line 451
    const v5, 0x1573d2a5

    .line 452
    .line 453
    .line 454
    invoke-static {v5, v2, v9}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 455
    .line 456
    .line 457
    move-result-object v2

    .line 458
    new-instance v5, La/itz;

    .line 459
    .line 460
    const/16 v7, 0xa

    .line 461
    .line 462
    invoke-direct {v5, v0, v4, v7}, La/itz;-><init>(La/l7m0;Lkotlin/jvm/functions/Function1;B)V

    .line 463
    .line 464
    .line 465
    const v0, 0x54078e44

    .line 466
    .line 467
    .line 468
    invoke-static {v0, v5, v9}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 469
    .line 470
    .line 471
    move-result-object v5

    .line 472
    and-int/lit8 v0, v10, 0xe

    .line 473
    .line 474
    or-int/lit16 v7, v0, 0x6c00

    .line 475
    .line 476
    move-object v4, v2

    .line 477
    move-object v2, v3

    .line 478
    move-object v3, v6

    .line 479
    move-object v6, v9

    .line 480
    invoke-static/range {v1 .. v7}, La/wvb;->z(La/mm40;La/pz40;Lkotlin/jvm/functions/Function0;La/ugd;La/ugd;La/fet;I)V

    .line 481
    .line 482
    .line 483
    goto :goto_6

    .line 484
    :cond_17
    move-object v6, v9

    .line 485
    invoke-virtual {v6}, La/fet;->X()V

    .line 486
    .line 487
    .line 488
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 489
    .line 490
    return-object v0

    .line 491
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
