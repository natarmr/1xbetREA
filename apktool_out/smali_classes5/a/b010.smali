.class public final synthetic La/b010;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/n010;


# direct methods
.method public synthetic constructor <init>(La/n010;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/b010;->a:B

    iput-object p1, p0, La/b010;->b:La/n010;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/b010;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x41e00000    # 28.0f

    .line 6
    .line 7
    sget-object v3, La/jm40;->b:La/jm40;

    .line 8
    .line 9
    const/high16 v4, 0x42380000    # 46.0f

    .line 10
    .line 11
    const/16 v5, 0x10

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x1

    .line 15
    iget-object v0, v0, La/b010;->b:La/n010;

    .line 16
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
    move-object/from16 v2, p2

    .line 25
    .line 26
    check-cast v2, La/fet;

    .line 27
    .line 28
    move-object/from16 v8, p3

    .line 29
    .line 30
    check-cast v8, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v8

    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    and-int/lit8 v1, v8, 0x11

    .line 40
    .line 41
    if-eq v1, v5, :cond_0

    .line 42
    .line 43
    move v1, v7

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move v1, v6

    .line 46
    :goto_0
    and-int/lit8 v5, v8, 0x1

    .line 47
    .line 48
    invoke-virtual {v2, v5, v1}, La/fet;->U(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    sget-object v1, La/qmk;->a:La/zcl;

    .line 55
    .line 56
    invoke-static {v3, v4}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iget-object v0, v0, La/n010;->k:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v6, v6, v2, v1, v0}, La/x2x;->u(IILa/fet;La/mm40;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    invoke-virtual {v2}, La/fet;->X()V

    .line 67
    .line 68
    .line 69
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    return-object v0

    .line 72
    :pswitch_0
    move-object/from16 v1, p1

    .line 73
    .line 74
    check-cast v1, La/yhg0;

    .line 75
    .line 76
    move-object/from16 v2, p2

    .line 77
    .line 78
    check-cast v2, La/fet;

    .line 79
    .line 80
    move-object/from16 v3, p3

    .line 81
    .line 82
    check-cast v3, Ljava/lang/Integer;

    .line 83
    .line 84
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    and-int/lit8 v1, v3, 0x11

    .line 92
    .line 93
    if-eq v1, v5, :cond_2

    .line 94
    .line 95
    move v1, v7

    .line 96
    goto :goto_2

    .line 97
    :cond_2
    move v1, v6

    .line 98
    :goto_2
    and-int/2addr v3, v7

    .line 99
    invoke-virtual {v2, v3, v1}, La/fet;->U(IZ)Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_3

    .line 104
    .line 105
    sget-object v1, La/qmk;->a:La/zcl;

    .line 106
    .line 107
    const/4 v11, 0x0

    .line 108
    const/16 v12, 0xb

    .line 109
    .line 110
    sget-object v7, La/jm40;->b:La/jm40;

    .line 111
    .line 112
    const/4 v8, 0x0

    .line 113
    const/4 v9, 0x0

    .line 114
    const/high16 v10, 0x41000000    # 8.0f

    .line 115
    .line 116
    invoke-static/range {v7 .. v12}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-static {v1, v4}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    iget-object v0, v0, La/n010;->j:Ljava/lang/String;

    .line 125
    .line 126
    invoke-static {v6, v6, v2, v1, v0}, La/x2x;->u(IILa/fet;La/mm40;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_3
    invoke-virtual {v2}, La/fet;->X()V

    .line 131
    .line 132
    .line 133
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 134
    .line 135
    return-object v0

    .line 136
    :pswitch_1
    move-object/from16 v1, p1

    .line 137
    .line 138
    check-cast v1, La/yhg0;

    .line 139
    .line 140
    move-object/from16 v2, p2

    .line 141
    .line 142
    check-cast v2, La/fet;

    .line 143
    .line 144
    move-object/from16 v3, p3

    .line 145
    .line 146
    check-cast v3, Ljava/lang/Integer;

    .line 147
    .line 148
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    and-int/lit8 v1, v3, 0x11

    .line 156
    .line 157
    if-eq v1, v5, :cond_4

    .line 158
    .line 159
    move v1, v7

    .line 160
    goto :goto_4

    .line 161
    :cond_4
    move v1, v6

    .line 162
    :goto_4
    and-int/2addr v3, v7

    .line 163
    invoke-virtual {v2, v3, v1}, La/fet;->U(IZ)Z

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-eqz v1, :cond_5

    .line 168
    .line 169
    sget-object v1, La/qmk;->a:La/zcl;

    .line 170
    .line 171
    const/4 v11, 0x0

    .line 172
    const/16 v12, 0xb

    .line 173
    .line 174
    sget-object v7, La/jm40;->b:La/jm40;

    .line 175
    .line 176
    const/4 v8, 0x0

    .line 177
    const/4 v9, 0x0

    .line 178
    const/high16 v10, 0x41000000    # 8.0f

    .line 179
    .line 180
    invoke-static/range {v7 .. v12}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    const/high16 v3, 0x42080000    # 34.0f

    .line 185
    .line 186
    invoke-static {v1, v3}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    iget-object v0, v0, La/n010;->i:Ljava/lang/String;

    .line 191
    .line 192
    invoke-static {v6, v6, v2, v1, v0}, La/x2x;->u(IILa/fet;La/mm40;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    goto :goto_5

    .line 196
    :cond_5
    invoke-virtual {v2}, La/fet;->X()V

    .line 197
    .line 198
    .line 199
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 200
    .line 201
    return-object v0

    .line 202
    :pswitch_2
    move-object/from16 v1, p1

    .line 203
    .line 204
    check-cast v1, La/yhg0;

    .line 205
    .line 206
    move-object/from16 v3, p2

    .line 207
    .line 208
    check-cast v3, La/fet;

    .line 209
    .line 210
    move-object/from16 v8, p3

    .line 211
    .line 212
    check-cast v8, Ljava/lang/Integer;

    .line 213
    .line 214
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 215
    .line 216
    .line 217
    move-result v8

    .line 218
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    and-int/lit8 v1, v8, 0x11

    .line 222
    .line 223
    if-eq v1, v5, :cond_6

    .line 224
    .line 225
    move v1, v7

    .line 226
    goto :goto_6

    .line 227
    :cond_6
    move v1, v6

    .line 228
    :goto_6
    and-int/lit8 v5, v8, 0x1

    .line 229
    .line 230
    invoke-virtual {v3, v5, v1}, La/fet;->U(IZ)Z

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    if-eqz v1, :cond_7

    .line 235
    .line 236
    sget-object v1, La/qmk;->a:La/zcl;

    .line 237
    .line 238
    const/4 v11, 0x0

    .line 239
    const/16 v12, 0xb

    .line 240
    .line 241
    sget-object v7, La/jm40;->b:La/jm40;

    .line 242
    .line 243
    const/4 v8, 0x0

    .line 244
    const/4 v9, 0x0

    .line 245
    const/high16 v10, 0x41000000    # 8.0f

    .line 246
    .line 247
    invoke-static/range {v7 .. v12}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    invoke-static {v1, v4, v2}, La/o7k0;->p(La/mm40;FF)La/mm40;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    const/4 v2, 0x0

    .line 256
    const/4 v4, 0x3

    .line 257
    invoke-static {v1, v2, v6, v4}, La/o7k0;->w(La/mm40;La/yx7;ZI)La/mm40;

    .line 258
    .line 259
    .line 260
    move-result-object v9

    .line 261
    iget-object v8, v0, La/n010;->h:Ljava/lang/String;

    .line 262
    .line 263
    sget-object v0, La/j1t0;->e:La/zfn;

    .line 264
    .line 265
    invoke-virtual {v3, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    check-cast v0, La/g1t0;

    .line 270
    .line 271
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    invoke-static {}, La/g1t0;->n()La/y9q0;

    .line 275
    .line 276
    .line 277
    move-result-object v28

    .line 278
    sget-object v0, La/zaq0;->b:La/zfn;

    .line 279
    .line 280
    invoke-virtual {v3, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 285
    .line 286
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 287
    .line 288
    .line 289
    move-result-wide v10

    .line 290
    new-instance v0, La/f2q0;

    .line 291
    .line 292
    invoke-direct {v0, v4}, La/f2q0;-><init>(I)V

    .line 293
    .line 294
    .line 295
    const/16 v31, 0x6180

    .line 296
    .line 297
    const v32, 0x1abf8

    .line 298
    .line 299
    .line 300
    const/4 v12, 0x0

    .line 301
    const-wide/16 v13, 0x0

    .line 302
    .line 303
    const/4 v15, 0x0

    .line 304
    const/16 v16, 0x0

    .line 305
    .line 306
    const/16 v17, 0x0

    .line 307
    .line 308
    const-wide/16 v18, 0x0

    .line 309
    .line 310
    const-wide/16 v21, 0x0

    .line 311
    .line 312
    const/16 v23, 0x2

    .line 313
    .line 314
    const/16 v24, 0x0

    .line 315
    .line 316
    const/16 v25, 0x1

    .line 317
    .line 318
    const/16 v26, 0x0

    .line 319
    .line 320
    const/16 v27, 0x0

    .line 321
    .line 322
    const/16 v30, 0x0

    .line 323
    .line 324
    move-object/from16 v20, v0

    .line 325
    .line 326
    move-object/from16 v29, v3

    .line 327
    .line 328
    invoke-static/range {v8 .. v32}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 329
    .line 330
    .line 331
    goto :goto_7

    .line 332
    :cond_7
    move-object/from16 v29, v3

    .line 333
    .line 334
    invoke-virtual/range {v29 .. v29}, La/fet;->X()V

    .line 335
    .line 336
    .line 337
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 338
    .line 339
    return-object v0

    .line 340
    :pswitch_3
    move-object/from16 v1, p1

    .line 341
    .line 342
    check-cast v1, La/yhg0;

    .line 343
    .line 344
    move-object/from16 v2, p2

    .line 345
    .line 346
    check-cast v2, La/fet;

    .line 347
    .line 348
    move-object/from16 v4, p3

    .line 349
    .line 350
    check-cast v4, Ljava/lang/Integer;

    .line 351
    .line 352
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 353
    .line 354
    .line 355
    move-result v4

    .line 356
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 357
    .line 358
    .line 359
    and-int/lit8 v1, v4, 0x11

    .line 360
    .line 361
    if-eq v1, v5, :cond_8

    .line 362
    .line 363
    move v6, v7

    .line 364
    :cond_8
    and-int/lit8 v1, v4, 0x1

    .line 365
    .line 366
    invoke-virtual {v2, v1, v6}, La/fet;->U(IZ)Z

    .line 367
    .line 368
    .line 369
    move-result v1

    .line 370
    if-eqz v1, :cond_9

    .line 371
    .line 372
    sget-object v1, La/qmk;->a:La/zcl;

    .line 373
    .line 374
    const/4 v1, 0x0

    .line 375
    const/4 v4, 0x2

    .line 376
    const/high16 v5, 0x41000000    # 8.0f

    .line 377
    .line 378
    invoke-static {v3, v5, v1, v4}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 379
    .line 380
    .line 381
    move-result-object v9

    .line 382
    iget-object v8, v0, La/n010;->f:Ljava/lang/String;

    .line 383
    .line 384
    sget-object v0, La/j1t0;->e:La/zfn;

    .line 385
    .line 386
    invoke-virtual {v2, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    check-cast v0, La/g1t0;

    .line 391
    .line 392
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    invoke-static {}, La/g1t0;->n()La/y9q0;

    .line 396
    .line 397
    .line 398
    move-result-object v28

    .line 399
    sget-object v0, La/zaq0;->b:La/zfn;

    .line 400
    .line 401
    invoke-virtual {v2, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 406
    .line 407
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 408
    .line 409
    .line 410
    move-result-wide v10

    .line 411
    new-instance v0, La/f2q0;

    .line 412
    .line 413
    const/4 v1, 0x5

    .line 414
    invoke-direct {v0, v1}, La/f2q0;-><init>(I)V

    .line 415
    .line 416
    .line 417
    const/16 v31, 0x6180

    .line 418
    .line 419
    const v32, 0x1abf8

    .line 420
    .line 421
    .line 422
    const/4 v12, 0x0

    .line 423
    const-wide/16 v13, 0x0

    .line 424
    .line 425
    const/4 v15, 0x0

    .line 426
    const/16 v16, 0x0

    .line 427
    .line 428
    const/16 v17, 0x0

    .line 429
    .line 430
    const-wide/16 v18, 0x0

    .line 431
    .line 432
    const-wide/16 v21, 0x0

    .line 433
    .line 434
    const/16 v23, 0x2

    .line 435
    .line 436
    const/16 v24, 0x0

    .line 437
    .line 438
    const/16 v25, 0x1

    .line 439
    .line 440
    const/16 v26, 0x0

    .line 441
    .line 442
    const/16 v27, 0x0

    .line 443
    .line 444
    const/16 v30, 0x0

    .line 445
    .line 446
    move-object/from16 v20, v0

    .line 447
    .line 448
    move-object/from16 v29, v2

    .line 449
    .line 450
    invoke-static/range {v8 .. v32}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 451
    .line 452
    .line 453
    goto :goto_8

    .line 454
    :cond_9
    move-object/from16 v29, v2

    .line 455
    .line 456
    invoke-virtual/range {v29 .. v29}, La/fet;->X()V

    .line 457
    .line 458
    .line 459
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 460
    .line 461
    return-object v0

    .line 462
    :pswitch_4
    move-object/from16 v1, p1

    .line 463
    .line 464
    check-cast v1, La/yhg0;

    .line 465
    .line 466
    move-object/from16 v3, p2

    .line 467
    .line 468
    check-cast v3, La/fet;

    .line 469
    .line 470
    move-object/from16 v4, p3

    .line 471
    .line 472
    check-cast v4, Ljava/lang/Integer;

    .line 473
    .line 474
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 475
    .line 476
    .line 477
    move-result v4

    .line 478
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 479
    .line 480
    .line 481
    and-int/lit8 v1, v4, 0x11

    .line 482
    .line 483
    if-eq v1, v5, :cond_a

    .line 484
    .line 485
    move v1, v7

    .line 486
    goto :goto_9

    .line 487
    :cond_a
    move v1, v6

    .line 488
    :goto_9
    and-int/2addr v4, v7

    .line 489
    invoke-virtual {v3, v4, v1}, La/fet;->U(IZ)Z

    .line 490
    .line 491
    .line 492
    move-result v1

    .line 493
    if-eqz v1, :cond_b

    .line 494
    .line 495
    const v1, 0x7f080cf6

    .line 496
    .line 497
    .line 498
    invoke-static {v1, v6, v3}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 499
    .line 500
    .line 501
    move-result-object v11

    .line 502
    sget-object v1, La/qmk;->a:La/zcl;

    .line 503
    .line 504
    const/4 v8, 0x0

    .line 505
    const/16 v9, 0xb

    .line 506
    .line 507
    sget-object v4, La/jm40;->b:La/jm40;

    .line 508
    .line 509
    const/4 v5, 0x0

    .line 510
    const/4 v6, 0x0

    .line 511
    const/high16 v7, 0x41000000    # 8.0f

    .line 512
    .line 513
    invoke-static/range {v4 .. v9}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    invoke-static {v1, v2}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 518
    .line 519
    .line 520
    move-result-object v10

    .line 521
    iget-object v8, v0, La/n010;->g:Ljava/lang/String;

    .line 522
    .line 523
    const/16 v22, 0x0

    .line 524
    .line 525
    const/16 v23, 0x7fe0

    .line 526
    .line 527
    const/4 v9, 0x0

    .line 528
    const/4 v13, 0x0

    .line 529
    const/4 v14, 0x0

    .line 530
    const/4 v15, 0x0

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
    const/16 v19, 0x0

    .line 538
    .line 539
    const v21, 0x9030

    .line 540
    .line 541
    .line 542
    move-object v12, v11

    .line 543
    move-object/from16 v20, v3

    .line 544
    .line 545
    invoke-static/range {v8 .. v23}, La/k7x;->b(Ljava/lang/Object;Ljava/lang/String;La/mm40;La/pm80;La/pm80;La/pm80;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/u12;La/qge;La/a4d;La/fet;III)V

    .line 546
    .line 547
    .line 548
    goto :goto_a

    .line 549
    :cond_b
    move-object/from16 v20, v3

    .line 550
    .line 551
    invoke-virtual/range {v20 .. v20}, La/fet;->X()V

    .line 552
    .line 553
    .line 554
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 555
    .line 556
    return-object v0

    .line 557
    :pswitch_5
    move-object/from16 v1, p1

    .line 558
    .line 559
    check-cast v1, La/yhg0;

    .line 560
    .line 561
    move-object/from16 v2, p2

    .line 562
    .line 563
    check-cast v2, La/fet;

    .line 564
    .line 565
    move-object/from16 v3, p3

    .line 566
    .line 567
    check-cast v3, Ljava/lang/Integer;

    .line 568
    .line 569
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 570
    .line 571
    .line 572
    move-result v3

    .line 573
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 574
    .line 575
    .line 576
    and-int/lit8 v1, v3, 0x11

    .line 577
    .line 578
    if-eq v1, v5, :cond_c

    .line 579
    .line 580
    move v1, v7

    .line 581
    goto :goto_b

    .line 582
    :cond_c
    move v1, v6

    .line 583
    :goto_b
    and-int/2addr v3, v7

    .line 584
    invoke-virtual {v2, v3, v1}, La/fet;->U(IZ)Z

    .line 585
    .line 586
    .line 587
    move-result v1

    .line 588
    if-eqz v1, :cond_d

    .line 589
    .line 590
    sget-object v1, La/qmk;->a:La/zcl;

    .line 591
    .line 592
    const/4 v11, 0x0

    .line 593
    const/16 v12, 0xb

    .line 594
    .line 595
    sget-object v7, La/jm40;->b:La/jm40;

    .line 596
    .line 597
    const/4 v8, 0x0

    .line 598
    const/4 v9, 0x0

    .line 599
    const/high16 v10, 0x41000000    # 8.0f

    .line 600
    .line 601
    invoke-static/range {v7 .. v12}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 602
    .line 603
    .line 604
    move-result-object v1

    .line 605
    const/high16 v3, 0x41c00000    # 24.0f

    .line 606
    .line 607
    invoke-static {v1, v3}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 608
    .line 609
    .line 610
    move-result-object v1

    .line 611
    iget-object v0, v0, La/n010;->e:Ljava/lang/String;

    .line 612
    .line 613
    invoke-static {v6, v6, v2, v1, v0}, La/x2x;->u(IILa/fet;La/mm40;Ljava/lang/String;)V

    .line 614
    .line 615
    .line 616
    goto :goto_c

    .line 617
    :cond_d
    invoke-virtual {v2}, La/fet;->X()V

    .line 618
    .line 619
    .line 620
    :goto_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 621
    .line 622
    return-object v0

    .line 623
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
