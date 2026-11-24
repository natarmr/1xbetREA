.class public final synthetic La/eod;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/eod;->a:B

    iput-object p1, p0, La/eod;->b:Ljava/lang/Object;

    iput-object p2, p0, La/eod;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IB)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/eod;->a:B

    iput-object p1, p0, La/eod;->b:Ljava/lang/Object;

    iput-object p2, p0, La/eod;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 40

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/eod;->a:B

    .line 4
    .line 5
    sget-object v2, La/e7z;->u1:La/pcy;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x5

    .line 9
    const/high16 v5, 0x41000000    # 8.0f

    .line 10
    .line 11
    sget-object v6, La/jm40;->b:La/jm40;

    .line 12
    .line 13
    const/high16 v7, 0x3f800000    # 1.0f

    .line 14
    .line 15
    const/4 v8, 0x0

    .line 16
    sget-object v9, La/ukd;->a:La/cl5;

    .line 17
    .line 18
    const/4 v10, 0x0

    .line 19
    const/4 v11, 0x2

    .line 20
    const/4 v12, 0x3

    .line 21
    const/4 v13, 0x1

    .line 22
    iget-object v14, v0, La/eod;->c:Ljava/lang/Object;

    .line 23
    .line 24
    iget-object v0, v0, La/eod;->b:Ljava/lang/Object;

    .line 25
    .line 26
    packed-switch v1, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    check-cast v0, La/cp;

    .line 30
    .line 31
    check-cast v14, La/qpg;

    .line 32
    .line 33
    move-object/from16 v4, p1

    .line 34
    .line 35
    check-cast v4, La/fet;

    .line 36
    .line 37
    move-object/from16 v1, p2

    .line 38
    .line 39
    check-cast v1, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    and-int/lit8 v2, v1, 0x3

    .line 46
    .line 47
    if-eq v2, v11, :cond_0

    .line 48
    .line 49
    move v10, v13

    .line 50
    :cond_0
    and-int/2addr v1, v13

    .line 51
    invoke-virtual {v4, v1, v10}, La/fet;->U(IZ)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    move-object v2, v0

    .line 62
    check-cast v2, La/boo0;

    .line 63
    .line 64
    invoke-virtual {v4, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    if-nez v0, :cond_1

    .line 73
    .line 74
    if-ne v1, v9, :cond_2

    .line 75
    .line 76
    :cond_1
    new-instance v1, La/wgh;

    .line 77
    .line 78
    invoke-direct {v1, v14, v13}, La/wgh;-><init>(La/qpg;B)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    move-object v3, v1

    .line 85
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 86
    .line 87
    const/4 v5, 0x0

    .line 88
    const/4 v6, 0x1

    .line 89
    const/4 v1, 0x0

    .line 90
    invoke-static/range {v1 .. v6}, La/cem0;->g(La/mm40;La/boo0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_3
    invoke-virtual {v4}, La/fet;->X()V

    .line 95
    .line 96
    .line 97
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    return-object v0

    .line 100
    :pswitch_0
    check-cast v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 101
    .line 102
    check-cast v14, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;

    .line 103
    .line 104
    move-object/from16 v1, p1

    .line 105
    .line 106
    check-cast v1, La/fet;

    .line 107
    .line 108
    move-object/from16 v2, p2

    .line 109
    .line 110
    check-cast v2, Ljava/lang/Integer;

    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-static {v13}, La/x8x;->L(I)I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    invoke-static {v0, v14, v1, v2}, La/vbc;->n(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;La/fet;I)V

    .line 120
    .line 121
    .line 122
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 123
    .line 124
    return-object v0

    .line 125
    :pswitch_1
    check-cast v0, La/ugd;

    .line 126
    .line 127
    check-cast v14, Ljava/lang/String;

    .line 128
    .line 129
    move-object/from16 v1, p1

    .line 130
    .line 131
    check-cast v1, La/fet;

    .line 132
    .line 133
    move-object/from16 v2, p2

    .line 134
    .line 135
    check-cast v2, Ljava/lang/Integer;

    .line 136
    .line 137
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    and-int/lit8 v3, v2, 0x3

    .line 142
    .line 143
    if-eq v3, v11, :cond_4

    .line 144
    .line 145
    move v3, v13

    .line 146
    goto :goto_1

    .line 147
    :cond_4
    move v3, v10

    .line 148
    :goto_1
    and-int/2addr v2, v13

    .line 149
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    if-eqz v2, :cond_5

    .line 154
    .line 155
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    invoke-virtual {v0, v14, v1, v2}, La/ugd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_5
    invoke-virtual {v1}, La/fet;->X()V

    .line 164
    .line 165
    .line 166
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 167
    .line 168
    return-object v0

    .line 169
    :pswitch_2
    check-cast v0, La/mm40;

    .line 170
    .line 171
    check-cast v14, La/b7h;

    .line 172
    .line 173
    move-object/from16 v1, p1

    .line 174
    .line 175
    check-cast v1, La/fet;

    .line 176
    .line 177
    move-object/from16 v2, p2

    .line 178
    .line 179
    check-cast v2, Ljava/lang/Integer;

    .line 180
    .line 181
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    invoke-static {v13}, La/x8x;->L(I)I

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    invoke-static {v0, v14, v1, v2}, La/uzb;->i(La/mm40;La/b7h;La/fet;I)V

    .line 189
    .line 190
    .line 191
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 192
    .line 193
    return-object v0

    .line 194
    :pswitch_3
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 195
    .line 196
    check-cast v14, La/j0h;

    .line 197
    .line 198
    move-object/from16 v1, p1

    .line 199
    .line 200
    check-cast v1, Lorg/xplatform/uikit/components/chips/DsChip;

    .line 201
    .line 202
    move-object/from16 v2, p2

    .line 203
    .line 204
    check-cast v2, Ljava/lang/Boolean;

    .line 205
    .line 206
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    new-instance v1, La/pqk0;

    .line 213
    .line 214
    iget v2, v14, La/j0h;->a:I

    .line 215
    .line 216
    invoke-direct {v1, v2}, La/pqk0;-><init>(I)V

    .line 217
    .line 218
    .line 219
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 223
    .line 224
    return-object v0

    .line 225
    :pswitch_4
    check-cast v0, La/zog;

    .line 226
    .line 227
    check-cast v14, La/upg;

    .line 228
    .line 229
    move-object/from16 v1, p1

    .line 230
    .line 231
    check-cast v1, La/fet;

    .line 232
    .line 233
    move-object/from16 v2, p2

    .line 234
    .line 235
    check-cast v2, Ljava/lang/Integer;

    .line 236
    .line 237
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 238
    .line 239
    .line 240
    move-result v2

    .line 241
    sget-object v3, La/upg;->X1:La/kwd;

    .line 242
    .line 243
    and-int/lit8 v3, v2, 0x3

    .line 244
    .line 245
    if-eq v3, v11, :cond_6

    .line 246
    .line 247
    move v3, v13

    .line 248
    goto :goto_3

    .line 249
    :cond_6
    move v3, v10

    .line 250
    :goto_3
    and-int/2addr v2, v13

    .line 251
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    if-eqz v2, :cond_12

    .line 256
    .line 257
    invoke-static {v1}, La/xfn;->a(La/fet;)La/wfn;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    iget v4, v2, La/wfn;->c:F

    .line 262
    .line 263
    invoke-static {v1}, La/xfn;->a(La/fet;)La/wfn;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    iget v6, v2, La/wfn;->c:F

    .line 268
    .line 269
    sget-object v2, La/qmk;->a:La/zcl;

    .line 270
    .line 271
    const/4 v7, 0x0

    .line 272
    const/16 v8, 0x8

    .line 273
    .line 274
    sget-object v3, La/jm40;->b:La/jm40;

    .line 275
    .line 276
    const/high16 v5, 0x40800000    # 4.0f

    .line 277
    .line 278
    invoke-static/range {v3 .. v8}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 279
    .line 280
    .line 281
    move-result-object v15

    .line 282
    iget-object v2, v0, La/zog;->b:La/m5m;

    .line 283
    .line 284
    iget-object v3, v14, La/upg;->U1:La/h5m;

    .line 285
    .line 286
    if-nez v3, :cond_7

    .line 287
    .line 288
    const v3, 0x79680dd7

    .line 289
    .line 290
    .line 291
    invoke-virtual {v1, v3}, La/fet;->e0(I)V

    .line 292
    .line 293
    .line 294
    invoke-static {v13, v1}, La/zjb;->L(ILa/fet;)La/h5m;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    :goto_4
    invoke-virtual {v1, v10}, La/fet;->r(Z)V

    .line 299
    .line 300
    .line 301
    move-object/from16 v17, v3

    .line 302
    .line 303
    goto :goto_5

    .line 304
    :cond_7
    const v4, 0x79680bc8

    .line 305
    .line 306
    .line 307
    invoke-virtual {v1, v4}, La/fet;->e0(I)V

    .line 308
    .line 309
    .line 310
    goto :goto_4

    .line 311
    :goto_5
    invoke-virtual {v14}, La/upg;->H0()La/vqg;

    .line 312
    .line 313
    .line 314
    move-result-object v3

    .line 315
    invoke-virtual {v1, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result v4

    .line 319
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v5

    .line 323
    if-nez v4, :cond_8

    .line 324
    .line 325
    if-ne v5, v9, :cond_9

    .line 326
    .line 327
    :cond_8
    new-instance v18, La/x6f;

    .line 328
    .line 329
    const/16 v24, 0x0

    .line 330
    .line 331
    const/16 v25, 0x17

    .line 332
    .line 333
    const/16 v19, 0x1

    .line 334
    .line 335
    const-class v21, La/vqg;

    .line 336
    .line 337
    const-string v22, "onTeamClick"

    .line 338
    .line 339
    const-string v23, "onTeamClick(J)V"

    .line 340
    .line 341
    move-object/from16 v20, v3

    .line 342
    .line 343
    invoke-direct/range {v18 .. v25}, La/x6f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 344
    .line 345
    .line 346
    move-object/from16 v5, v18

    .line 347
    .line 348
    invoke-virtual {v1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    :cond_9
    check-cast v5, La/jhy;

    .line 352
    .line 353
    move-object/from16 v18, v5

    .line 354
    .line 355
    check-cast v18, Lkotlin/jvm/functions/Function1;

    .line 356
    .line 357
    invoke-virtual {v14}, La/upg;->H0()La/vqg;

    .line 358
    .line 359
    .line 360
    move-result-object v3

    .line 361
    invoke-virtual {v1, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    move-result v4

    .line 365
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v5

    .line 369
    if-nez v4, :cond_a

    .line 370
    .line 371
    if-ne v5, v9, :cond_b

    .line 372
    .line 373
    :cond_a
    new-instance v19, La/oye;

    .line 374
    .line 375
    const/16 v25, 0x0

    .line 376
    .line 377
    const/16 v26, 0x18

    .line 378
    .line 379
    const/16 v20, 0x0

    .line 380
    .line 381
    const-class v22, La/vqg;

    .line 382
    .line 383
    const-string v23, "onDisciplineClick"

    .line 384
    .line 385
    const-string v24, "onDisciplineClick()V"

    .line 386
    .line 387
    move-object/from16 v21, v3

    .line 388
    .line 389
    invoke-direct/range {v19 .. v26}, La/oye;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 390
    .line 391
    .line 392
    move-object/from16 v5, v19

    .line 393
    .line 394
    invoke-virtual {v1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    :cond_b
    check-cast v5, La/jhy;

    .line 398
    .line 399
    move-object/from16 v19, v5

    .line 400
    .line 401
    check-cast v19, Lkotlin/jvm/functions/Function0;

    .line 402
    .line 403
    invoke-virtual {v1, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result v3

    .line 407
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 408
    .line 409
    .line 410
    move-result v4

    .line 411
    or-int/2addr v3, v4

    .line 412
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v4

    .line 416
    if-nez v3, :cond_c

    .line 417
    .line 418
    if-ne v4, v9, :cond_d

    .line 419
    .line 420
    :cond_c
    new-instance v4, La/vef;

    .line 421
    .line 422
    const/4 v3, 0x7

    .line 423
    invoke-direct {v4, v14, v0, v3}, La/vef;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    :cond_d
    move-object/from16 v20, v4

    .line 430
    .line 431
    check-cast v20, Lkotlin/jvm/functions/Function0;

    .line 432
    .line 433
    invoke-virtual {v14}, La/upg;->H0()La/vqg;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    invoke-virtual {v1, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    move-result v3

    .line 441
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v4

    .line 445
    if-nez v3, :cond_e

    .line 446
    .line 447
    if-ne v4, v9, :cond_f

    .line 448
    .line 449
    :cond_e
    new-instance v21, La/x6f;

    .line 450
    .line 451
    const/16 v27, 0x0

    .line 452
    .line 453
    const/16 v28, 0x18

    .line 454
    .line 455
    const/16 v22, 0x1

    .line 456
    .line 457
    const-class v24, La/vqg;

    .line 458
    .line 459
    const-string v25, "onTeamFavoriteClick"

    .line 460
    .line 461
    const-string v26, "onTeamFavoriteClick(J)V"

    .line 462
    .line 463
    move-object/from16 v23, v0

    .line 464
    .line 465
    invoke-direct/range {v21 .. v28}, La/x6f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 466
    .line 467
    .line 468
    move-object/from16 v4, v21

    .line 469
    .line 470
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 471
    .line 472
    .line 473
    :cond_f
    check-cast v4, La/jhy;

    .line 474
    .line 475
    move-object/from16 v22, v4

    .line 476
    .line 477
    check-cast v22, Lkotlin/jvm/functions/Function1;

    .line 478
    .line 479
    invoke-virtual {v14}, La/upg;->H0()La/vqg;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    invoke-virtual {v1, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 484
    .line 485
    .line 486
    move-result v3

    .line 487
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v4

    .line 491
    if-nez v3, :cond_10

    .line 492
    .line 493
    if-ne v4, v9, :cond_11

    .line 494
    .line 495
    :cond_10
    new-instance v23, La/x6f;

    .line 496
    .line 497
    const/16 v29, 0x0

    .line 498
    .line 499
    const/16 v30, 0x19

    .line 500
    .line 501
    const/16 v24, 0x1

    .line 502
    .line 503
    const-class v26, La/vqg;

    .line 504
    .line 505
    const-string v27, "onMapsTabClick"

    .line 506
    .line 507
    const-string v28, "onMapsTabClick(I)V"

    .line 508
    .line 509
    move-object/from16 v25, v0

    .line 510
    .line 511
    invoke-direct/range {v23 .. v30}, La/x6f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 512
    .line 513
    .line 514
    move-object/from16 v4, v23

    .line 515
    .line 516
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 517
    .line 518
    .line 519
    :cond_11
    check-cast v4, La/jhy;

    .line 520
    .line 521
    move-object/from16 v23, v4

    .line 522
    .line 523
    check-cast v23, Lkotlin/jvm/functions/Function1;

    .line 524
    .line 525
    const/16 v25, 0x0

    .line 526
    .line 527
    const/16 v26, 0x40

    .line 528
    .line 529
    const/16 v21, 0x0

    .line 530
    .line 531
    move-object/from16 v24, v1

    .line 532
    .line 533
    move-object/from16 v16, v2

    .line 534
    .line 535
    invoke-static/range {v15 .. v26}, La/j5m;->a(La/mm40;La/o5m;La/h5m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 536
    .line 537
    .line 538
    goto :goto_6

    .line 539
    :cond_12
    move-object/from16 v24, v1

    .line 540
    .line 541
    invoke-virtual/range {v24 .. v24}, La/fet;->X()V

    .line 542
    .line 543
    .line 544
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 545
    .line 546
    return-object v0

    .line 547
    :pswitch_5
    check-cast v0, La/xdr;

    .line 548
    .line 549
    check-cast v14, La/a4x;

    .line 550
    .line 551
    move-object/from16 v1, p1

    .line 552
    .line 553
    check-cast v1, La/x8z;

    .line 554
    .line 555
    move-object/from16 v2, p2

    .line 556
    .line 557
    check-cast v2, Ljava/lang/Integer;

    .line 558
    .line 559
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 560
    .line 561
    .line 562
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 563
    .line 564
    .line 565
    invoke-interface {v0, v1, v2, v14}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    check-cast v0, La/pgv;

    .line 570
    .line 571
    return-object v0

    .line 572
    :pswitch_6
    check-cast v0, La/mm40;

    .line 573
    .line 574
    check-cast v14, La/rjg;

    .line 575
    .line 576
    move-object/from16 v1, p1

    .line 577
    .line 578
    check-cast v1, La/fet;

    .line 579
    .line 580
    move-object/from16 v2, p2

    .line 581
    .line 582
    check-cast v2, Ljava/lang/Integer;

    .line 583
    .line 584
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 585
    .line 586
    .line 587
    invoke-static {v13}, La/x8x;->L(I)I

    .line 588
    .line 589
    .line 590
    move-result v2

    .line 591
    invoke-static {v0, v14, v1, v2}, La/feb;->g(La/mm40;La/rjg;La/fet;I)V

    .line 592
    .line 593
    .line 594
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 595
    .line 596
    return-object v0

    .line 597
    :pswitch_7
    check-cast v0, La/tig;

    .line 598
    .line 599
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 600
    .line 601
    move-object/from16 v1, p1

    .line 602
    .line 603
    check-cast v1, La/fet;

    .line 604
    .line 605
    move-object/from16 v2, p2

    .line 606
    .line 607
    check-cast v2, Ljava/lang/Integer;

    .line 608
    .line 609
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 610
    .line 611
    .line 612
    invoke-static {v13}, La/x8x;->L(I)I

    .line 613
    .line 614
    .line 615
    move-result v2

    .line 616
    invoke-static {v0, v14, v1, v2}, La/eeq;->r(La/tig;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 617
    .line 618
    .line 619
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 620
    .line 621
    return-object v0

    .line 622
    :pswitch_8
    check-cast v0, Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;

    .line 623
    .line 624
    check-cast v14, La/sip;

    .line 625
    .line 626
    move-object/from16 v1, p1

    .line 627
    .line 628
    check-cast v1, La/fet;

    .line 629
    .line 630
    move-object/from16 v2, p2

    .line 631
    .line 632
    check-cast v2, Ljava/lang/Integer;

    .line 633
    .line 634
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 635
    .line 636
    .line 637
    invoke-static {v13}, La/x8x;->L(I)I

    .line 638
    .line 639
    .line 640
    move-result v2

    .line 641
    invoke-static {v0, v14, v1, v2}, La/eeq;->s(Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;La/sip;La/fet;I)V

    .line 642
    .line 643
    .line 644
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 645
    .line 646
    return-object v0

    .line 647
    :pswitch_9
    check-cast v0, La/ib50;

    .line 648
    .line 649
    check-cast v14, La/aig;

    .line 650
    .line 651
    move-object/from16 v1, p1

    .line 652
    .line 653
    check-cast v1, La/fet;

    .line 654
    .line 655
    move-object/from16 v2, p2

    .line 656
    .line 657
    check-cast v2, Ljava/lang/Integer;

    .line 658
    .line 659
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 660
    .line 661
    .line 662
    const/16 v2, 0x49

    .line 663
    .line 664
    invoke-static {v2}, La/x8x;->L(I)I

    .line 665
    .line 666
    .line 667
    move-result v2

    .line 668
    invoke-static {v0, v14, v1, v2}, La/qjj;->l(La/ib50;La/aig;La/fet;I)V

    .line 669
    .line 670
    .line 671
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 672
    .line 673
    return-object v0

    .line 674
    :pswitch_a
    move-object v2, v0

    .line 675
    check-cast v2, La/cfb;

    .line 676
    .line 677
    check-cast v14, La/wcg;

    .line 678
    .line 679
    move-object/from16 v0, p1

    .line 680
    .line 681
    check-cast v0, La/fet;

    .line 682
    .line 683
    move-object/from16 v1, p2

    .line 684
    .line 685
    check-cast v1, Ljava/lang/Integer;

    .line 686
    .line 687
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 688
    .line 689
    .line 690
    move-result v1

    .line 691
    sget-object v3, La/wcg;->U1:La/usd;

    .line 692
    .line 693
    and-int/lit8 v3, v1, 0x3

    .line 694
    .line 695
    if-eq v3, v11, :cond_13

    .line 696
    .line 697
    move v10, v13

    .line 698
    :cond_13
    and-int/2addr v1, v13

    .line 699
    invoke-virtual {v0, v1, v10}, La/fet;->U(IZ)Z

    .line 700
    .line 701
    .line 702
    move-result v1

    .line 703
    if-eqz v1, :cond_17

    .line 704
    .line 705
    invoke-static {v6, v7}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 706
    .line 707
    .line 708
    move-result-object v1

    .line 709
    sget-object v3, La/qmk;->a:La/zcl;

    .line 710
    .line 711
    invoke-static {v1, v5}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 712
    .line 713
    .line 714
    move-result-object v15

    .line 715
    iget-object v1, v2, La/cfb;->a:Ljava/util/List;

    .line 716
    .line 717
    new-instance v3, Ljava/util/ArrayList;

    .line 718
    .line 719
    const/16 v4, 0xa

    .line 720
    .line 721
    invoke-static {v1, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 722
    .line 723
    .line 724
    move-result v4

    .line 725
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 726
    .line 727
    .line 728
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 729
    .line 730
    .line 731
    move-result-object v1

    .line 732
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 733
    .line 734
    .line 735
    move-result v4

    .line 736
    if-eqz v4, :cond_14

    .line 737
    .line 738
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 739
    .line 740
    .line 741
    move-result-object v4

    .line 742
    check-cast v4, Ljava/lang/String;

    .line 743
    .line 744
    new-instance v5, La/yvh0;

    .line 745
    .line 746
    sget-object v6, La/bwh0;->a:La/bwh0;

    .line 747
    .line 748
    invoke-direct {v5, v4, v6}, La/yvh0;-><init>(Ljava/lang/String;La/dwh0;)V

    .line 749
    .line 750
    .line 751
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 752
    .line 753
    .line 754
    goto :goto_7

    .line 755
    :cond_14
    invoke-static {v3}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 756
    .line 757
    .line 758
    move-result-object v16

    .line 759
    iget-object v8, v2, La/cfb;->b:La/dxh0;

    .line 760
    .line 761
    new-instance v1, La/a6g;

    .line 762
    .line 763
    const/4 v6, 0x0

    .line 764
    const/4 v7, 0x2

    .line 765
    const-class v3, La/cfb;

    .line 766
    .line 767
    const-string v4, "currentPageIndex"

    .line 768
    .line 769
    const-string v5, "getCurrentPageIndex()I"

    .line 770
    .line 771
    invoke-direct/range {v1 .. v7}, La/a6g;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 772
    .line 773
    .line 774
    invoke-virtual {v14}, La/wcg;->I0()La/gdg;

    .line 775
    .line 776
    .line 777
    move-result-object v2

    .line 778
    invoke-virtual {v0, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 779
    .line 780
    .line 781
    move-result v3

    .line 782
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 783
    .line 784
    .line 785
    move-result-object v4

    .line 786
    if-nez v3, :cond_15

    .line 787
    .line 788
    if-ne v4, v9, :cond_16

    .line 789
    .line 790
    :cond_15
    new-instance v17, La/x6f;

    .line 791
    .line 792
    const/16 v23, 0x0

    .line 793
    .line 794
    const/16 v24, 0xb

    .line 795
    .line 796
    const/16 v18, 0x1

    .line 797
    .line 798
    const-class v20, La/gdg;

    .line 799
    .line 800
    const-string v21, "onTabSelected"

    .line 801
    .line 802
    const-string v22, "onTabSelected(I)V"

    .line 803
    .line 804
    move-object/from16 v19, v2

    .line 805
    .line 806
    invoke-direct/range {v17 .. v24}, La/x6f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 807
    .line 808
    .line 809
    move-object/from16 v4, v17

    .line 810
    .line 811
    invoke-virtual {v0, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 812
    .line 813
    .line 814
    :cond_16
    check-cast v4, La/jhy;

    .line 815
    .line 816
    move-object/from16 v21, v4

    .line 817
    .line 818
    check-cast v21, Lkotlin/jvm/functions/Function1;

    .line 819
    .line 820
    const/16 v23, 0x180

    .line 821
    .line 822
    const/16 v24, 0x10

    .line 823
    .line 824
    sget-object v17, La/gxh0;->a:La/gxh0;

    .line 825
    .line 826
    const/16 v19, 0x0

    .line 827
    .line 828
    move-object/from16 v22, v0

    .line 829
    .line 830
    move-object/from16 v20, v1

    .line 831
    .line 832
    move-object/from16 v18, v8

    .line 833
    .line 834
    invoke-static/range {v15 .. v24}, La/ibc;->n(La/mm40;La/a4x;La/hxh0;La/dxh0;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 835
    .line 836
    .line 837
    goto :goto_8

    .line 838
    :cond_17
    move-object/from16 v22, v0

    .line 839
    .line 840
    invoke-virtual/range {v22 .. v22}, La/fet;->X()V

    .line 841
    .line 842
    .line 843
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 844
    .line 845
    return-object v0

    .line 846
    :pswitch_b
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 847
    .line 848
    check-cast v14, La/cnb;

    .line 849
    .line 850
    move-object/from16 v1, p1

    .line 851
    .line 852
    check-cast v1, La/fet;

    .line 853
    .line 854
    move-object/from16 v2, p2

    .line 855
    .line 856
    check-cast v2, Ljava/lang/Integer;

    .line 857
    .line 858
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 859
    .line 860
    .line 861
    move-result v2

    .line 862
    and-int/lit8 v3, v2, 0x3

    .line 863
    .line 864
    if-eq v3, v11, :cond_18

    .line 865
    .line 866
    move v10, v13

    .line 867
    :cond_18
    and-int/2addr v2, v13

    .line 868
    invoke-virtual {v1, v2, v10}, La/fet;->U(IZ)Z

    .line 869
    .line 870
    .line 871
    move-result v2

    .line 872
    if-eqz v2, :cond_1b

    .line 873
    .line 874
    invoke-virtual {v0, v14}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 875
    .line 876
    .line 877
    move-result-object v0

    .line 878
    check-cast v0, Ljava/util/List;

    .line 879
    .line 880
    if-nez v0, :cond_19

    .line 881
    .line 882
    sget-object v0, La/iun;->a:La/iun;

    .line 883
    .line 884
    :cond_19
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 885
    .line 886
    .line 887
    move-result-object v2

    .line 888
    if-ne v2, v9, :cond_1a

    .line 889
    .line 890
    new-instance v2, La/jcg;

    .line 891
    .line 892
    invoke-direct {v2, v4}, La/jcg;-><init>(B)V

    .line 893
    .line 894
    .line 895
    invoke-virtual {v1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 896
    .line 897
    .line 898
    :cond_1a
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 899
    .line 900
    const/16 v3, 0x180

    .line 901
    .line 902
    invoke-static {v8, v0, v2, v1, v3}, La/x8x;->f(La/mm40;Ljava/util/List;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 903
    .line 904
    .line 905
    goto :goto_9

    .line 906
    :cond_1b
    invoke-virtual {v1}, La/fet;->X()V

    .line 907
    .line 908
    .line 909
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 910
    .line 911
    return-object v0

    .line 912
    :pswitch_c
    check-cast v0, La/mm40;

    .line 913
    .line 914
    check-cast v14, La/v1g;

    .line 915
    .line 916
    move-object/from16 v1, p1

    .line 917
    .line 918
    check-cast v1, La/fet;

    .line 919
    .line 920
    move-object/from16 v2, p2

    .line 921
    .line 922
    check-cast v2, Ljava/lang/Integer;

    .line 923
    .line 924
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 925
    .line 926
    .line 927
    invoke-static {v13}, La/x8x;->L(I)I

    .line 928
    .line 929
    .line 930
    move-result v2

    .line 931
    invoke-static {v0, v14, v1, v2}, La/o2e;->I(La/mm40;La/v1g;La/fet;I)V

    .line 932
    .line 933
    .line 934
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 935
    .line 936
    return-object v0

    .line 937
    :pswitch_d
    check-cast v0, La/uxf;

    .line 938
    .line 939
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 940
    .line 941
    move-object/from16 v1, p1

    .line 942
    .line 943
    check-cast v1, La/fet;

    .line 944
    .line 945
    move-object/from16 v2, p2

    .line 946
    .line 947
    check-cast v2, Ljava/lang/Integer;

    .line 948
    .line 949
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 950
    .line 951
    .line 952
    invoke-static {v13}, La/x8x;->L(I)I

    .line 953
    .line 954
    .line 955
    move-result v2

    .line 956
    invoke-static {v0, v14, v1, v2}, La/j2e;->o(La/uxf;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 957
    .line 958
    .line 959
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 960
    .line 961
    return-object v0

    .line 962
    :pswitch_e
    check-cast v0, La/mm40;

    .line 963
    .line 964
    check-cast v14, La/ztf;

    .line 965
    .line 966
    move-object/from16 v1, p1

    .line 967
    .line 968
    check-cast v1, La/fet;

    .line 969
    .line 970
    move-object/from16 v2, p2

    .line 971
    .line 972
    check-cast v2, Ljava/lang/Integer;

    .line 973
    .line 974
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 975
    .line 976
    .line 977
    invoke-static {v13}, La/x8x;->L(I)I

    .line 978
    .line 979
    .line 980
    move-result v2

    .line 981
    invoke-static {v0, v14, v1, v2}, La/kkb;->x(La/mm40;La/ztf;La/fet;I)V

    .line 982
    .line 983
    .line 984
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 985
    .line 986
    return-object v0

    .line 987
    :pswitch_f
    check-cast v0, La/mm40;

    .line 988
    .line 989
    check-cast v14, La/auf;

    .line 990
    .line 991
    move-object/from16 v1, p1

    .line 992
    .line 993
    check-cast v1, La/fet;

    .line 994
    .line 995
    move-object/from16 v2, p2

    .line 996
    .line 997
    check-cast v2, Ljava/lang/Integer;

    .line 998
    .line 999
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1000
    .line 1001
    .line 1002
    invoke-static {v13}, La/x8x;->L(I)I

    .line 1003
    .line 1004
    .line 1005
    move-result v2

    .line 1006
    invoke-static {v0, v14, v1, v2}, La/kkb;->C(La/mm40;La/auf;La/fet;I)V

    .line 1007
    .line 1008
    .line 1009
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1010
    .line 1011
    return-object v0

    .line 1012
    :pswitch_10
    check-cast v0, La/wif;

    .line 1013
    .line 1014
    check-cast v14, Ljava/lang/String;

    .line 1015
    .line 1016
    move-object/from16 v1, p1

    .line 1017
    .line 1018
    check-cast v1, La/oyg0;

    .line 1019
    .line 1020
    move-object/from16 v15, p2

    .line 1021
    .line 1022
    check-cast v15, La/wmf;

    .line 1023
    .line 1024
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1025
    .line 1026
    .line 1027
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1028
    .line 1029
    .line 1030
    iget-object v1, v15, La/wmf;->u:La/qmf;

    .line 1031
    .line 1032
    iget-object v2, v1, La/qmf;->d:La/o4i0;

    .line 1033
    .line 1034
    iget-object v3, v0, La/wif;->c:Ljava/util/List;

    .line 1035
    .line 1036
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v3

    .line 1040
    :cond_1c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1041
    .line 1042
    .line 1043
    move-result v4

    .line 1044
    if-eqz v4, :cond_1d

    .line 1045
    .line 1046
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v4

    .line 1050
    move-object v5, v4

    .line 1051
    check-cast v5, La/xif;

    .line 1052
    .line 1053
    iget-object v5, v5, La/xif;->a:Ljava/lang/String;

    .line 1054
    .line 1055
    invoke-virtual {v5, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1056
    .line 1057
    .line 1058
    move-result v5

    .line 1059
    if-eqz v5, :cond_1c

    .line 1060
    .line 1061
    goto :goto_a

    .line 1062
    :cond_1d
    move-object v4, v8

    .line 1063
    :goto_a
    check-cast v4, La/xif;

    .line 1064
    .line 1065
    if-eqz v4, :cond_1e

    .line 1066
    .line 1067
    iget-object v3, v4, La/xif;->a:Ljava/lang/String;

    .line 1068
    .line 1069
    goto :goto_b

    .line 1070
    :cond_1e
    iget-object v3, v2, La/o4i0;->a:Ljava/lang/String;

    .line 1071
    .line 1072
    :goto_b
    iget-object v0, v0, La/wif;->d:Ljava/util/List;

    .line 1073
    .line 1074
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v0

    .line 1078
    :cond_1f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1079
    .line 1080
    .line 1081
    move-result v4

    .line 1082
    if-eqz v4, :cond_20

    .line 1083
    .line 1084
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v4

    .line 1088
    move-object v5, v4

    .line 1089
    check-cast v5, La/xif;

    .line 1090
    .line 1091
    iget-object v5, v5, La/xif;->a:Ljava/lang/String;

    .line 1092
    .line 1093
    invoke-virtual {v5, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1094
    .line 1095
    .line 1096
    move-result v5

    .line 1097
    if-eqz v5, :cond_1f

    .line 1098
    .line 1099
    move-object v8, v4

    .line 1100
    :cond_20
    check-cast v8, La/xif;

    .line 1101
    .line 1102
    if-eqz v8, :cond_21

    .line 1103
    .line 1104
    iget-object v0, v8, La/xif;->a:Ljava/lang/String;

    .line 1105
    .line 1106
    goto :goto_c

    .line 1107
    :cond_21
    iget-object v0, v2, La/o4i0;->b:Ljava/lang/String;

    .line 1108
    .line 1109
    :goto_c
    invoke-static {v3, v0}, La/o4i0;->a(Ljava/lang/String;Ljava/lang/String;)La/o4i0;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v22

    .line 1113
    const-wide/16 v23, 0x0

    .line 1114
    .line 1115
    const/16 v25, 0x17

    .line 1116
    .line 1117
    const-wide/16 v17, 0x0

    .line 1118
    .line 1119
    const-wide/16 v19, 0x0

    .line 1120
    .line 1121
    const/16 v21, 0x0

    .line 1122
    .line 1123
    move-object/from16 v16, v1

    .line 1124
    .line 1125
    invoke-static/range {v16 .. v25}, La/qmf;->a(La/qmf;JJZLa/o4i0;JI)La/qmf;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v28

    .line 1129
    const/16 v30, 0x0

    .line 1130
    .line 1131
    const v31, 0xefffff

    .line 1132
    .line 1133
    .line 1134
    const/16 v16, 0x0

    .line 1135
    .line 1136
    const/16 v17, 0x0

    .line 1137
    .line 1138
    const/16 v18, 0x0

    .line 1139
    .line 1140
    const/16 v19, 0x0

    .line 1141
    .line 1142
    const/16 v20, 0x0

    .line 1143
    .line 1144
    const/16 v21, 0x0

    .line 1145
    .line 1146
    const/16 v22, 0x0

    .line 1147
    .line 1148
    const/16 v23, 0x0

    .line 1149
    .line 1150
    const/16 v24, 0x0

    .line 1151
    .line 1152
    const/16 v25, 0x0

    .line 1153
    .line 1154
    const/16 v26, 0x0

    .line 1155
    .line 1156
    const/16 v27, 0x0

    .line 1157
    .line 1158
    const/16 v29, 0x0

    .line 1159
    .line 1160
    invoke-static/range {v15 .. v31}, La/wmf;->a(La/wmf;La/jlr;La/bqr;ZLa/mrf;Ljava/util/List;La/ypl0;ZZLjava/util/ArrayList;ZLa/xus;La/gps;La/qmf;La/yws;La/szj0;I)La/wmf;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v0

    .line 1164
    return-object v0

    .line 1165
    :pswitch_11
    check-cast v0, La/mm40;

    .line 1166
    .line 1167
    check-cast v14, La/pxe;

    .line 1168
    .line 1169
    move-object/from16 v1, p1

    .line 1170
    .line 1171
    check-cast v1, La/fet;

    .line 1172
    .line 1173
    move-object/from16 v2, p2

    .line 1174
    .line 1175
    check-cast v2, Ljava/lang/Integer;

    .line 1176
    .line 1177
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1178
    .line 1179
    .line 1180
    invoke-static {v13}, La/x8x;->L(I)I

    .line 1181
    .line 1182
    .line 1183
    move-result v2

    .line 1184
    invoke-static {v0, v14, v1, v2}, La/obb;->d(La/mm40;La/pxe;La/fet;I)V

    .line 1185
    .line 1186
    .line 1187
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1188
    .line 1189
    return-object v0

    .line 1190
    :pswitch_12
    check-cast v0, La/et7;

    .line 1191
    .line 1192
    check-cast v14, La/axe;

    .line 1193
    .line 1194
    move-object/from16 v1, p1

    .line 1195
    .line 1196
    check-cast v1, La/fet;

    .line 1197
    .line 1198
    move-object/from16 v2, p2

    .line 1199
    .line 1200
    check-cast v2, Ljava/lang/Integer;

    .line 1201
    .line 1202
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1203
    .line 1204
    .line 1205
    move-result v2

    .line 1206
    and-int/lit8 v3, v2, 0x3

    .line 1207
    .line 1208
    if-eq v3, v11, :cond_22

    .line 1209
    .line 1210
    move v3, v13

    .line 1211
    goto :goto_d

    .line 1212
    :cond_22
    move v3, v10

    .line 1213
    :goto_d
    and-int/2addr v2, v13

    .line 1214
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 1215
    .line 1216
    .line 1217
    move-result v2

    .line 1218
    if-eqz v2, :cond_27

    .line 1219
    .line 1220
    invoke-static {v0, v1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v0

    .line 1224
    sget-object v2, La/axe;->e2:La/kud;

    .line 1225
    .line 1226
    invoke-virtual {v14}, La/axe;->M0()La/r7f;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v2

    .line 1230
    invoke-virtual {v1, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1231
    .line 1232
    .line 1233
    move-result v3

    .line 1234
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v4

    .line 1238
    if-nez v3, :cond_23

    .line 1239
    .line 1240
    if-ne v4, v9, :cond_24

    .line 1241
    .line 1242
    :cond_23
    new-instance v15, La/mhc;

    .line 1243
    .line 1244
    const/16 v21, 0x0

    .line 1245
    .line 1246
    const/16 v22, 0xd

    .line 1247
    .line 1248
    const/16 v16, 0x2

    .line 1249
    .line 1250
    const-class v18, La/r7f;

    .line 1251
    .line 1252
    const-string v19, "onClickBetOnFavoriteEvent"

    .line 1253
    .line 1254
    const-string v20, "onClickBetOnFavoriteEvent(IJ)V"

    .line 1255
    .line 1256
    move-object/from16 v17, v2

    .line 1257
    .line 1258
    invoke-direct/range {v15 .. v22}, La/mhc;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1259
    .line 1260
    .line 1261
    invoke-virtual {v1, v15}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1262
    .line 1263
    .line 1264
    move-object v4, v15

    .line 1265
    :cond_24
    check-cast v4, La/jhy;

    .line 1266
    .line 1267
    check-cast v4, Lkotlin/jvm/functions/Function2;

    .line 1268
    .line 1269
    invoke-virtual {v14}, La/axe;->M0()La/r7f;

    .line 1270
    .line 1271
    .line 1272
    move-result-object v2

    .line 1273
    invoke-virtual {v1, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1274
    .line 1275
    .line 1276
    move-result v3

    .line 1277
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1278
    .line 1279
    .line 1280
    move-result-object v5

    .line 1281
    if-nez v3, :cond_25

    .line 1282
    .line 1283
    if-ne v5, v9, :cond_26

    .line 1284
    .line 1285
    :cond_25
    new-instance v15, La/pw4;

    .line 1286
    .line 1287
    const/16 v21, 0x0

    .line 1288
    .line 1289
    const/16 v22, 0x1d

    .line 1290
    .line 1291
    const/16 v16, 0x0

    .line 1292
    .line 1293
    const-class v18, La/r7f;

    .line 1294
    .line 1295
    const-string v19, "onClickBetOnFavoriteExpand"

    .line 1296
    .line 1297
    const-string v20, "onClickBetOnFavoriteExpand()V"

    .line 1298
    .line 1299
    move-object/from16 v17, v2

    .line 1300
    .line 1301
    invoke-direct/range {v15 .. v22}, La/pw4;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1302
    .line 1303
    .line 1304
    invoke-virtual {v1, v15}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1305
    .line 1306
    .line 1307
    move-object v5, v15

    .line 1308
    :cond_26
    check-cast v5, La/jhy;

    .line 1309
    .line 1310
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 1311
    .line 1312
    invoke-static {v0, v4, v5, v1, v10}, La/obb;->y(La/pz40;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 1313
    .line 1314
    .line 1315
    goto :goto_e

    .line 1316
    :cond_27
    invoke-virtual {v1}, La/fet;->X()V

    .line 1317
    .line 1318
    .line 1319
    :goto_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1320
    .line 1321
    return-object v0

    .line 1322
    :pswitch_13
    check-cast v0, La/pwq0;

    .line 1323
    .line 1324
    check-cast v14, La/axe;

    .line 1325
    .line 1326
    move-object/from16 v1, p1

    .line 1327
    .line 1328
    check-cast v1, La/fet;

    .line 1329
    .line 1330
    move-object/from16 v2, p2

    .line 1331
    .line 1332
    check-cast v2, Ljava/lang/Integer;

    .line 1333
    .line 1334
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1335
    .line 1336
    .line 1337
    move-result v2

    .line 1338
    and-int/lit8 v4, v2, 0x3

    .line 1339
    .line 1340
    if-eq v4, v11, :cond_28

    .line 1341
    .line 1342
    move v4, v13

    .line 1343
    goto :goto_f

    .line 1344
    :cond_28
    move v4, v10

    .line 1345
    :goto_f
    and-int/2addr v2, v13

    .line 1346
    invoke-virtual {v1, v2, v4}, La/fet;->U(IZ)Z

    .line 1347
    .line 1348
    .line 1349
    move-result v2

    .line 1350
    if-eqz v2, :cond_32

    .line 1351
    .line 1352
    iget-object v2, v0, La/pwq0;->l:La/hao0;

    .line 1353
    .line 1354
    iget-object v4, v0, La/pwq0;->l:La/hao0;

    .line 1355
    .line 1356
    sget-object v15, La/jm40;->b:La/jm40;

    .line 1357
    .line 1358
    if-eqz v2, :cond_2c

    .line 1359
    .line 1360
    const v0, 0x13c54c9c

    .line 1361
    .line 1362
    .line 1363
    invoke-virtual {v1, v0}, La/fet;->e0(I)V

    .line 1364
    .line 1365
    .line 1366
    sget-object v0, La/axe;->e2:La/kud;

    .line 1367
    .line 1368
    invoke-virtual {v14}, La/axe;->L0()La/pzq;

    .line 1369
    .line 1370
    .line 1371
    move-result-object v0

    .line 1372
    iget-object v0, v0, La/pzq;->l:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 1373
    .line 1374
    iget-object v0, v0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->b:La/oiz;

    .line 1375
    .line 1376
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 1377
    .line 1378
    .line 1379
    iget-boolean v0, v4, La/hao0;->b:Z

    .line 1380
    .line 1381
    if-nez v0, :cond_29

    .line 1382
    .line 1383
    sget-object v0, La/qmk;->a:La/zcl;

    .line 1384
    .line 1385
    const/high16 v0, 0x41800000    # 16.0f

    .line 1386
    .line 1387
    :goto_10
    move/from16 v16, v0

    .line 1388
    .line 1389
    goto :goto_11

    .line 1390
    :cond_29
    sget-object v0, La/qmk;->a:La/zcl;

    .line 1391
    .line 1392
    const/high16 v0, 0x41c00000    # 24.0f

    .line 1393
    .line 1394
    goto :goto_10

    .line 1395
    :goto_11
    const/16 v19, 0x0

    .line 1396
    .line 1397
    const/16 v20, 0xe

    .line 1398
    .line 1399
    const/16 v17, 0x0

    .line 1400
    .line 1401
    const/16 v18, 0x0

    .line 1402
    .line 1403
    invoke-static/range {v15 .. v20}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v0

    .line 1407
    invoke-virtual {v1, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1408
    .line 1409
    .line 1410
    move-result v2

    .line 1411
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1412
    .line 1413
    .line 1414
    move-result-object v3

    .line 1415
    if-nez v2, :cond_2a

    .line 1416
    .line 1417
    if-ne v3, v9, :cond_2b

    .line 1418
    .line 1419
    :cond_2a
    new-instance v3, La/twe;

    .line 1420
    .line 1421
    const/16 v2, 0x10

    .line 1422
    .line 1423
    invoke-direct {v3, v14, v2}, La/twe;-><init>(La/axe;B)V

    .line 1424
    .line 1425
    .line 1426
    invoke-virtual {v1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1427
    .line 1428
    .line 1429
    :cond_2b
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 1430
    .line 1431
    invoke-static {v0, v4, v3, v1, v10}, La/ltt0;->e(La/mm40;La/hao0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 1432
    .line 1433
    .line 1434
    invoke-virtual {v1, v10}, La/fet;->r(Z)V

    .line 1435
    .line 1436
    .line 1437
    goto/16 :goto_12

    .line 1438
    .line 1439
    :cond_2c
    iget-boolean v2, v0, La/pwq0;->m:Z

    .line 1440
    .line 1441
    if-eqz v2, :cond_31

    .line 1442
    .line 1443
    const v2, 0x13d09ea0

    .line 1444
    .line 1445
    .line 1446
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 1447
    .line 1448
    .line 1449
    sget-object v2, La/dy2;->a:La/zfn;

    .line 1450
    .line 1451
    invoke-virtual {v1, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v2

    .line 1455
    check-cast v2, Landroid/content/res/Configuration;

    .line 1456
    .line 1457
    iget v2, v2, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 1458
    .line 1459
    int-to-float v2, v2

    .line 1460
    sget-object v4, La/axe;->e2:La/kud;

    .line 1461
    .line 1462
    invoke-virtual {v14}, La/axe;->L0()La/pzq;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v4

    .line 1466
    iget-object v4, v4, La/pzq;->l:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 1467
    .line 1468
    invoke-virtual {v4}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->getRightContainerActualWidth()I

    .line 1469
    .line 1470
    .line 1471
    move-result v4

    .line 1472
    invoke-static {v4, v1}, La/pkd;->e(ILa/fet;)F

    .line 1473
    .line 1474
    .line 1475
    move-result v4

    .line 1476
    sub-float/2addr v2, v4

    .line 1477
    sget-object v4, La/qmk;->a:La/zcl;

    .line 1478
    .line 1479
    const/high16 v4, 0x41400000    # 12.0f

    .line 1480
    .line 1481
    sub-float/2addr v2, v4

    .line 1482
    new-instance v4, La/ycl;

    .line 1483
    .line 1484
    invoke-direct {v4, v2}, La/ycl;-><init>(F)V

    .line 1485
    .line 1486
    .line 1487
    new-instance v2, La/ycl;

    .line 1488
    .line 1489
    invoke-direct {v2, v3}, La/ycl;-><init>(F)V

    .line 1490
    .line 1491
    .line 1492
    invoke-virtual {v4, v2}, La/ycl;->compareTo(Ljava/lang/Object;)I

    .line 1493
    .line 1494
    .line 1495
    move-result v5

    .line 1496
    if-gez v5, :cond_2d

    .line 1497
    .line 1498
    move-object v4, v2

    .line 1499
    :cond_2d
    iget v2, v4, La/ycl;->a:F

    .line 1500
    .line 1501
    invoke-static {v2, v3}, La/ycl;->a(FF)I

    .line 1502
    .line 1503
    .line 1504
    move-result v4

    .line 1505
    if-lez v4, :cond_2e

    .line 1506
    .line 1507
    invoke-static {v15, v3, v2, v13}, La/o7k0;->u(La/mm40;FFI)La/mm40;

    .line 1508
    .line 1509
    .line 1510
    move-result-object v15

    .line 1511
    :cond_2e
    move-object v2, v15

    .line 1512
    invoke-virtual {v14}, La/axe;->L0()La/pzq;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v3

    .line 1516
    iget-object v3, v3, La/pzq;->l:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 1517
    .line 1518
    iget-object v3, v3, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->b:La/oiz;

    .line 1519
    .line 1520
    invoke-virtual {v3, v10}, Landroid/view/View;->setVisibility(I)V

    .line 1521
    .line 1522
    .line 1523
    const/4 v6, 0x0

    .line 1524
    const/16 v7, 0xe

    .line 1525
    .line 1526
    const/high16 v3, 0x41800000    # 16.0f

    .line 1527
    .line 1528
    const/4 v4, 0x0

    .line 1529
    const/4 v5, 0x0

    .line 1530
    invoke-static/range {v2 .. v7}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1531
    .line 1532
    .line 1533
    move-result-object v2

    .line 1534
    new-instance v3, La/p4f;

    .line 1535
    .line 1536
    iget-object v4, v0, La/pwq0;->e:Ljava/lang/String;

    .line 1537
    .line 1538
    iget-boolean v5, v0, La/pwq0;->g:Z

    .line 1539
    .line 1540
    invoke-direct {v3, v4, v5}, La/p4f;-><init>(Ljava/lang/String;Z)V

    .line 1541
    .line 1542
    .line 1543
    invoke-virtual {v1, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1544
    .line 1545
    .line 1546
    move-result v4

    .line 1547
    invoke-virtual {v1, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1548
    .line 1549
    .line 1550
    move-result v5

    .line 1551
    or-int/2addr v4, v5

    .line 1552
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1553
    .line 1554
    .line 1555
    move-result-object v5

    .line 1556
    if-nez v4, :cond_2f

    .line 1557
    .line 1558
    if-ne v5, v9, :cond_30

    .line 1559
    .line 1560
    :cond_2f
    new-instance v5, La/yw9;

    .line 1561
    .line 1562
    const/16 v4, 0x19

    .line 1563
    .line 1564
    invoke-direct {v5, v14, v0, v4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1565
    .line 1566
    .line 1567
    invoke-virtual {v1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1568
    .line 1569
    .line 1570
    :cond_30
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 1571
    .line 1572
    invoke-static {v2, v3, v5, v1, v10}, La/ahb;->d(La/mm40;La/p4f;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 1573
    .line 1574
    .line 1575
    invoke-virtual {v1, v10}, La/fet;->r(Z)V

    .line 1576
    .line 1577
    .line 1578
    goto :goto_12

    .line 1579
    :cond_31
    const v0, 0x13e74913

    .line 1580
    .line 1581
    .line 1582
    invoke-virtual {v1, v0}, La/fet;->e0(I)V

    .line 1583
    .line 1584
    .line 1585
    invoke-virtual {v1, v10}, La/fet;->r(Z)V

    .line 1586
    .line 1587
    .line 1588
    goto :goto_12

    .line 1589
    :cond_32
    invoke-virtual {v1}, La/fet;->X()V

    .line 1590
    .line 1591
    .line 1592
    :goto_12
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1593
    .line 1594
    return-object v0

    .line 1595
    :pswitch_14
    check-cast v0, La/mdm;

    .line 1596
    .line 1597
    check-cast v14, La/axe;

    .line 1598
    .line 1599
    move-object/from16 v5, p1

    .line 1600
    .line 1601
    check-cast v5, La/fet;

    .line 1602
    .line 1603
    move-object/from16 v1, p2

    .line 1604
    .line 1605
    check-cast v1, Ljava/lang/Integer;

    .line 1606
    .line 1607
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1608
    .line 1609
    .line 1610
    move-result v1

    .line 1611
    sget-object v2, La/axe;->e2:La/kud;

    .line 1612
    .line 1613
    and-int/lit8 v2, v1, 0x3

    .line 1614
    .line 1615
    if-eq v2, v11, :cond_33

    .line 1616
    .line 1617
    move v10, v13

    .line 1618
    :cond_33
    and-int/2addr v1, v13

    .line 1619
    invoke-virtual {v5, v1, v10}, La/fet;->U(IZ)Z

    .line 1620
    .line 1621
    .line 1622
    move-result v1

    .line 1623
    if-eqz v1, :cond_36

    .line 1624
    .line 1625
    invoke-static {v0, v5}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 1626
    .line 1627
    .line 1628
    move-result-object v0

    .line 1629
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1630
    .line 1631
    .line 1632
    move-result-object v0

    .line 1633
    move-object v2, v0

    .line 1634
    check-cast v2, La/mdm;

    .line 1635
    .line 1636
    invoke-virtual {v5, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1637
    .line 1638
    .line 1639
    move-result v0

    .line 1640
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 1641
    .line 1642
    .line 1643
    move-result-object v1

    .line 1644
    if-nez v0, :cond_34

    .line 1645
    .line 1646
    if-ne v1, v9, :cond_35

    .line 1647
    .line 1648
    :cond_34
    new-instance v1, La/twe;

    .line 1649
    .line 1650
    const/16 v0, 0xe

    .line 1651
    .line 1652
    invoke-direct {v1, v14, v0}, La/twe;-><init>(La/axe;B)V

    .line 1653
    .line 1654
    .line 1655
    invoke-virtual {v5, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1656
    .line 1657
    .line 1658
    :cond_35
    move-object v4, v1

    .line 1659
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 1660
    .line 1661
    const/4 v6, 0x0

    .line 1662
    const/4 v7, 0x5

    .line 1663
    const/4 v1, 0x0

    .line 1664
    const/4 v3, 0x0

    .line 1665
    invoke-static/range {v1 .. v7}, La/jcb;->l(La/mm40;La/mdm;ZLkotlin/jvm/functions/Function0;La/fet;II)V

    .line 1666
    .line 1667
    .line 1668
    goto :goto_13

    .line 1669
    :cond_36
    invoke-virtual {v5}, La/fet;->X()V

    .line 1670
    .line 1671
    .line 1672
    :goto_13
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1673
    .line 1674
    return-object v0

    .line 1675
    :pswitch_15
    check-cast v0, La/mm40;

    .line 1676
    .line 1677
    check-cast v14, La/szv;

    .line 1678
    .line 1679
    move-object/from16 v1, p1

    .line 1680
    .line 1681
    check-cast v1, La/fet;

    .line 1682
    .line 1683
    move-object/from16 v2, p2

    .line 1684
    .line 1685
    check-cast v2, Ljava/lang/Integer;

    .line 1686
    .line 1687
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1688
    .line 1689
    .line 1690
    invoke-static {v13}, La/x8x;->L(I)I

    .line 1691
    .line 1692
    .line 1693
    move-result v2

    .line 1694
    invoke-static {v0, v14, v1, v2}, La/ibc;->f(La/mm40;La/szv;La/fet;I)V

    .line 1695
    .line 1696
    .line 1697
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1698
    .line 1699
    return-object v0

    .line 1700
    :pswitch_16
    check-cast v0, La/szv;

    .line 1701
    .line 1702
    check-cast v14, La/l7m0;

    .line 1703
    .line 1704
    move-object/from16 v1, p1

    .line 1705
    .line 1706
    check-cast v1, La/fet;

    .line 1707
    .line 1708
    move-object/from16 v3, p2

    .line 1709
    .line 1710
    check-cast v3, Ljava/lang/Integer;

    .line 1711
    .line 1712
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1713
    .line 1714
    .line 1715
    move-result v3

    .line 1716
    and-int/lit8 v4, v3, 0x3

    .line 1717
    .line 1718
    if-eq v4, v11, :cond_37

    .line 1719
    .line 1720
    move v10, v13

    .line 1721
    :cond_37
    and-int/2addr v3, v13

    .line 1722
    invoke-virtual {v1, v3, v10}, La/fet;->U(IZ)Z

    .line 1723
    .line 1724
    .line 1725
    move-result v3

    .line 1726
    if-eqz v3, :cond_39

    .line 1727
    .line 1728
    const-string v3, "DESCRIPTION_TEXT"

    .line 1729
    .line 1730
    invoke-static {v6, v3}, La/mrv;->k0(La/mm40;Ljava/lang/Object;)La/mm40;

    .line 1731
    .line 1732
    .line 1733
    move-result-object v3

    .line 1734
    sget-object v4, La/gqw0;->k:La/yx7;

    .line 1735
    .line 1736
    sget-object v5, La/uc9;->a:La/lw3;

    .line 1737
    .line 1738
    const/16 v6, 0x30

    .line 1739
    .line 1740
    invoke-static {v5, v4, v1, v6}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 1741
    .line 1742
    .line 1743
    move-result-object v4

    .line 1744
    iget-wide v5, v1, La/fet;->T:J

    .line 1745
    .line 1746
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 1747
    .line 1748
    .line 1749
    move-result v5

    .line 1750
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 1751
    .line 1752
    .line 1753
    move-result-object v6

    .line 1754
    invoke-static {v1, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 1755
    .line 1756
    .line 1757
    move-result-object v3

    .line 1758
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 1759
    .line 1760
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1761
    .line 1762
    .line 1763
    invoke-virtual {v1}, La/fet;->i0()V

    .line 1764
    .line 1765
    .line 1766
    iget-boolean v7, v1, La/fet;->S:Z

    .line 1767
    .line 1768
    if-eqz v7, :cond_38

    .line 1769
    .line 1770
    invoke-virtual {v1, v2}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 1771
    .line 1772
    .line 1773
    goto :goto_14

    .line 1774
    :cond_38
    invoke-virtual {v1}, La/fet;->r0()V

    .line 1775
    .line 1776
    .line 1777
    :goto_14
    sget-object v2, La/gqw0;->x:La/shd;

    .line 1778
    .line 1779
    invoke-static {v1, v4, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1780
    .line 1781
    .line 1782
    sget-object v2, La/gqw0;->w:La/shd;

    .line 1783
    .line 1784
    invoke-static {v1, v6, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1785
    .line 1786
    .line 1787
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1788
    .line 1789
    .line 1790
    move-result-object v2

    .line 1791
    sget-object v4, La/gqw0;->y:La/shd;

    .line 1792
    .line 1793
    invoke-static {v1, v2, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1794
    .line 1795
    .line 1796
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 1797
    .line 1798
    .line 1799
    sget-object v2, La/gqw0;->v:La/shd;

    .line 1800
    .line 1801
    invoke-static {v1, v3, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1802
    .line 1803
    .line 1804
    sget-object v2, La/bmd;->n:La/zfn;

    .line 1805
    .line 1806
    sget-object v3, La/k6z;->a:La/k6z;

    .line 1807
    .line 1808
    invoke-virtual {v2, v3}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 1809
    .line 1810
    .line 1811
    move-result-object v2

    .line 1812
    new-instance v3, La/cw0;

    .line 1813
    .line 1814
    invoke-direct {v3, v14, v12}, La/cw0;-><init>(La/l7m0;B)V

    .line 1815
    .line 1816
    .line 1817
    const v4, -0x3c9babbf

    .line 1818
    .line 1819
    .line 1820
    invoke-static {v4, v3, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 1821
    .line 1822
    .line 1823
    move-result-object v3

    .line 1824
    const/16 v4, 0x38

    .line 1825
    .line 1826
    invoke-static {v2, v3, v1, v4}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 1827
    .line 1828
    .line 1829
    iget-object v0, v0, La/szv;->b:Ljava/lang/String;

    .line 1830
    .line 1831
    const-string v2, "\u200e"

    .line 1832
    .line 1833
    invoke-static {v2, v0}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1834
    .line 1835
    .line 1836
    move-result-object v15

    .line 1837
    sget-object v22, La/j1t0;->b:La/qrq;

    .line 1838
    .line 1839
    sget-wide v19, La/qmk;->q:J

    .line 1840
    .line 1841
    sget-wide v28, La/qmk;->D:J

    .line 1842
    .line 1843
    new-instance v16, La/y9q0;

    .line 1844
    .line 1845
    const/16 v27, 0x0

    .line 1846
    .line 1847
    const v30, 0xfdff9d

    .line 1848
    .line 1849
    .line 1850
    const-wide/16 v17, 0x0

    .line 1851
    .line 1852
    const/16 v21, 0x0

    .line 1853
    .line 1854
    const-wide/16 v23, 0x0

    .line 1855
    .line 1856
    const/16 v25, 0x0

    .line 1857
    .line 1858
    const/16 v26, 0x0

    .line 1859
    .line 1860
    invoke-direct/range {v16 .. v30}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 1861
    .line 1862
    .line 1863
    move-object/from16 v0, v16

    .line 1864
    .line 1865
    invoke-static {v0, v1}, La/ibm0;->l(La/y9q0;La/fet;)La/y9q0;

    .line 1866
    .line 1867
    .line 1868
    move-result-object v35

    .line 1869
    const/16 v38, 0x6180

    .line 1870
    .line 1871
    const v39, 0x1affe

    .line 1872
    .line 1873
    .line 1874
    const/16 v16, 0x0

    .line 1875
    .line 1876
    const/16 v19, 0x0

    .line 1877
    .line 1878
    const-wide/16 v20, 0x0

    .line 1879
    .line 1880
    const/16 v22, 0x0

    .line 1881
    .line 1882
    const/16 v23, 0x0

    .line 1883
    .line 1884
    const/16 v24, 0x0

    .line 1885
    .line 1886
    const-wide/16 v25, 0x0

    .line 1887
    .line 1888
    const/16 v27, 0x0

    .line 1889
    .line 1890
    const-wide/16 v28, 0x0

    .line 1891
    .line 1892
    const/16 v30, 0x2

    .line 1893
    .line 1894
    const/16 v31, 0x0

    .line 1895
    .line 1896
    const/16 v32, 0x1

    .line 1897
    .line 1898
    const/16 v33, 0x0

    .line 1899
    .line 1900
    const/16 v34, 0x0

    .line 1901
    .line 1902
    const/16 v37, 0x0

    .line 1903
    .line 1904
    move-object/from16 v36, v1

    .line 1905
    .line 1906
    invoke-static/range {v15 .. v39}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 1907
    .line 1908
    .line 1909
    move-object/from16 v0, v36

    .line 1910
    .line 1911
    invoke-virtual {v0, v13}, La/fet;->r(Z)V

    .line 1912
    .line 1913
    .line 1914
    goto :goto_15

    .line 1915
    :cond_39
    move-object v0, v1

    .line 1916
    invoke-virtual {v0}, La/fet;->X()V

    .line 1917
    .line 1918
    .line 1919
    :goto_15
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1920
    .line 1921
    return-object v0

    .line 1922
    :pswitch_17
    check-cast v0, La/pje;

    .line 1923
    .line 1924
    check-cast v14, La/oje;

    .line 1925
    .line 1926
    move-object/from16 v1, p1

    .line 1927
    .line 1928
    check-cast v1, La/fet;

    .line 1929
    .line 1930
    move-object/from16 v2, p2

    .line 1931
    .line 1932
    check-cast v2, Ljava/lang/Integer;

    .line 1933
    .line 1934
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1935
    .line 1936
    .line 1937
    invoke-static {v13}, La/x8x;->L(I)I

    .line 1938
    .line 1939
    .line 1940
    move-result v2

    .line 1941
    invoke-virtual {v0, v14, v1, v2}, La/pje;->a(La/oje;La/fet;I)V

    .line 1942
    .line 1943
    .line 1944
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1945
    .line 1946
    return-object v0

    .line 1947
    :pswitch_18
    move-object v2, v0

    .line 1948
    check-cast v2, Ljava/lang/String;

    .line 1949
    .line 1950
    check-cast v14, La/muy;

    .line 1951
    .line 1952
    move-object/from16 v0, p1

    .line 1953
    .line 1954
    check-cast v0, La/oyg0;

    .line 1955
    .line 1956
    move-object/from16 v0, p2

    .line 1957
    .line 1958
    check-cast v0, La/gwd;

    .line 1959
    .line 1960
    if-eqz v14, :cond_3a

    .line 1961
    .line 1962
    iget-object v1, v14, La/muy;->g:Ljava/lang/String;

    .line 1963
    .line 1964
    goto :goto_16

    .line 1965
    :cond_3a
    move-object v1, v8

    .line 1966
    :goto_16
    const-string v3, ""

    .line 1967
    .line 1968
    if-nez v1, :cond_3b

    .line 1969
    .line 1970
    move-object v1, v3

    .line 1971
    :cond_3b
    if-eqz v14, :cond_3c

    .line 1972
    .line 1973
    iget-object v8, v14, La/muy;->d:Ljava/lang/String;

    .line 1974
    .line 1975
    :cond_3c
    if-nez v8, :cond_3d

    .line 1976
    .line 1977
    move-object v4, v3

    .line 1978
    goto :goto_17

    .line 1979
    :cond_3d
    move-object v4, v8

    .line 1980
    :goto_17
    iget-object v5, v0, La/gwd;->d:Ljava/lang/String;

    .line 1981
    .line 1982
    iget-object v6, v0, La/gwd;->e:Ljava/lang/String;

    .line 1983
    .line 1984
    iget-object v7, v0, La/gwd;->f:Ljava/lang/String;

    .line 1985
    .line 1986
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1987
    .line 1988
    .line 1989
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1990
    .line 1991
    .line 1992
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1993
    .line 1994
    .line 1995
    move-object v3, v1

    .line 1996
    new-instance v1, La/gwd;

    .line 1997
    .line 1998
    invoke-direct/range {v1 .. v7}, La/gwd;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1999
    .line 2000
    .line 2001
    return-object v1

    .line 2002
    :pswitch_19
    check-cast v0, La/mm40;

    .line 2003
    .line 2004
    check-cast v14, La/epd;

    .line 2005
    .line 2006
    move-object/from16 v1, p1

    .line 2007
    .line 2008
    check-cast v1, La/fet;

    .line 2009
    .line 2010
    move-object/from16 v6, p2

    .line 2011
    .line 2012
    check-cast v6, Ljava/lang/Integer;

    .line 2013
    .line 2014
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 2015
    .line 2016
    .line 2017
    move-result v6

    .line 2018
    and-int/lit8 v8, v6, 0x3

    .line 2019
    .line 2020
    if-eq v8, v11, :cond_3e

    .line 2021
    .line 2022
    move v8, v13

    .line 2023
    goto :goto_18

    .line 2024
    :cond_3e
    move v8, v10

    .line 2025
    :goto_18
    and-int/2addr v6, v13

    .line 2026
    invoke-virtual {v1, v6, v8}, La/fet;->U(IZ)Z

    .line 2027
    .line 2028
    .line 2029
    move-result v6

    .line 2030
    if-eqz v6, :cond_43

    .line 2031
    .line 2032
    sget-object v6, La/uc9;->c:La/mw3;

    .line 2033
    .line 2034
    sget-object v8, La/gqw0;->m:La/xx7;

    .line 2035
    .line 2036
    invoke-static {v6, v8, v1, v10}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 2037
    .line 2038
    .line 2039
    move-result-object v6

    .line 2040
    iget-wide v11, v1, La/fet;->T:J

    .line 2041
    .line 2042
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    .line 2043
    .line 2044
    .line 2045
    move-result v8

    .line 2046
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 2047
    .line 2048
    .line 2049
    move-result-object v11

    .line 2050
    invoke-static {v1, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 2051
    .line 2052
    .line 2053
    move-result-object v0

    .line 2054
    sget-object v12, La/mkd;->c0:La/gqw0;

    .line 2055
    .line 2056
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2057
    .line 2058
    .line 2059
    invoke-virtual {v1}, La/fet;->i0()V

    .line 2060
    .line 2061
    .line 2062
    iget-boolean v12, v1, La/fet;->S:Z

    .line 2063
    .line 2064
    if-eqz v12, :cond_3f

    .line 2065
    .line 2066
    invoke-virtual {v1, v2}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 2067
    .line 2068
    .line 2069
    goto :goto_19

    .line 2070
    :cond_3f
    invoke-virtual {v1}, La/fet;->r0()V

    .line 2071
    .line 2072
    .line 2073
    :goto_19
    sget-object v12, La/gqw0;->x:La/shd;

    .line 2074
    .line 2075
    invoke-static {v1, v6, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2076
    .line 2077
    .line 2078
    sget-object v6, La/gqw0;->w:La/shd;

    .line 2079
    .line 2080
    invoke-static {v1, v11, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2081
    .line 2082
    .line 2083
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2084
    .line 2085
    .line 2086
    move-result-object v8

    .line 2087
    sget-object v11, La/gqw0;->y:La/shd;

    .line 2088
    .line 2089
    invoke-static {v1, v8, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2090
    .line 2091
    .line 2092
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 2093
    .line 2094
    .line 2095
    sget-object v8, La/gqw0;->v:La/shd;

    .line 2096
    .line 2097
    invoke-static {v1, v0, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2098
    .line 2099
    .line 2100
    sget-object v0, La/qmk;->a:La/zcl;

    .line 2101
    .line 2102
    const/high16 v19, 0x40800000    # 4.0f

    .line 2103
    .line 2104
    const/16 v20, 0x6

    .line 2105
    .line 2106
    sget-object v15, La/jm40;->b:La/jm40;

    .line 2107
    .line 2108
    const/high16 v16, 0x41000000    # 8.0f

    .line 2109
    .line 2110
    const/16 v17, 0x0

    .line 2111
    .line 2112
    const/16 v18, 0x0

    .line 2113
    .line 2114
    invoke-static/range {v15 .. v20}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 2115
    .line 2116
    .line 2117
    move-result-object v0

    .line 2118
    const/high16 v3, 0x41900000    # 18.0f

    .line 2119
    .line 2120
    invoke-static {v0, v3}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 2121
    .line 2122
    .line 2123
    move-result-object v0

    .line 2124
    sget-object v3, La/gqw0;->e:La/zx7;

    .line 2125
    .line 2126
    invoke-static {v3, v10}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 2127
    .line 2128
    .line 2129
    move-result-object v3

    .line 2130
    iget-wide v4, v1, La/fet;->T:J

    .line 2131
    .line 2132
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 2133
    .line 2134
    .line 2135
    move-result v4

    .line 2136
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 2137
    .line 2138
    .line 2139
    move-result-object v5

    .line 2140
    invoke-static {v1, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 2141
    .line 2142
    .line 2143
    move-result-object v0

    .line 2144
    invoke-virtual {v1}, La/fet;->i0()V

    .line 2145
    .line 2146
    .line 2147
    iget-boolean v10, v1, La/fet;->S:Z

    .line 2148
    .line 2149
    if-eqz v10, :cond_40

    .line 2150
    .line 2151
    invoke-virtual {v1, v2}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 2152
    .line 2153
    .line 2154
    goto :goto_1a

    .line 2155
    :cond_40
    invoke-virtual {v1}, La/fet;->r0()V

    .line 2156
    .line 2157
    .line 2158
    :goto_1a
    invoke-static {v1, v3, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2159
    .line 2160
    .line 2161
    invoke-static {v1, v5, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2162
    .line 2163
    .line 2164
    invoke-static {v4, v1, v11, v1}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 2165
    .line 2166
    .line 2167
    invoke-static {v1, v0, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2168
    .line 2169
    .line 2170
    move-object v0, v15

    .line 2171
    iget-object v15, v14, La/epd;->d:Ljava/lang/String;

    .line 2172
    .line 2173
    sget-object v2, La/j1t0;->e:La/zfn;

    .line 2174
    .line 2175
    invoke-virtual {v1, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 2176
    .line 2177
    .line 2178
    move-result-object v2

    .line 2179
    check-cast v2, La/g1t0;

    .line 2180
    .line 2181
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2182
    .line 2183
    .line 2184
    invoke-static {}, La/g1t0;->g()La/y9q0;

    .line 2185
    .line 2186
    .line 2187
    move-result-object v35

    .line 2188
    sget-object v2, La/s6t0;->a:La/pz40;

    .line 2189
    .line 2190
    sget-object v2, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 2191
    .line 2192
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 2193
    .line 2194
    .line 2195
    move-result-wide v17

    .line 2196
    new-instance v2, La/f2q0;

    .line 2197
    .line 2198
    const/4 v3, 0x5

    .line 2199
    invoke-direct {v2, v3}, La/f2q0;-><init>(I)V

    .line 2200
    .line 2201
    .line 2202
    const/16 v38, 0x6180

    .line 2203
    .line 2204
    const v39, 0x1abfa

    .line 2205
    .line 2206
    .line 2207
    const/16 v16, 0x0

    .line 2208
    .line 2209
    const/16 v19, 0x0

    .line 2210
    .line 2211
    const-wide/16 v20, 0x0

    .line 2212
    .line 2213
    const/16 v22, 0x0

    .line 2214
    .line 2215
    const/16 v23, 0x0

    .line 2216
    .line 2217
    const/16 v24, 0x0

    .line 2218
    .line 2219
    const-wide/16 v25, 0x0

    .line 2220
    .line 2221
    const-wide/16 v28, 0x0

    .line 2222
    .line 2223
    const/16 v30, 0x2

    .line 2224
    .line 2225
    const/16 v31, 0x0

    .line 2226
    .line 2227
    const/16 v32, 0x1

    .line 2228
    .line 2229
    const/16 v33, 0x0

    .line 2230
    .line 2231
    const/16 v34, 0x0

    .line 2232
    .line 2233
    const/16 v37, 0x0

    .line 2234
    .line 2235
    move-object/from16 v36, v1

    .line 2236
    .line 2237
    move-object/from16 v27, v2

    .line 2238
    .line 2239
    invoke-static/range {v15 .. v39}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 2240
    .line 2241
    .line 2242
    invoke-virtual {v1, v13}, La/fet;->r(Z)V

    .line 2243
    .line 2244
    .line 2245
    invoke-static {v0, v7}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 2246
    .line 2247
    .line 2248
    move-result-object v2

    .line 2249
    const/4 v3, 0x0

    .line 2250
    const/high16 v4, 0x41000000    # 8.0f

    .line 2251
    .line 2252
    const/4 v5, 0x2

    .line 2253
    invoke-static {v2, v4, v3, v5}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 2254
    .line 2255
    .line 2256
    move-result-object v15

    .line 2257
    const/high16 v19, 0x40a00000    # 5.0f

    .line 2258
    .line 2259
    const/16 v20, 0x7

    .line 2260
    .line 2261
    const/16 v16, 0x0

    .line 2262
    .line 2263
    const/16 v17, 0x0

    .line 2264
    .line 2265
    const/16 v18, 0x0

    .line 2266
    .line 2267
    invoke-static/range {v15 .. v20}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 2268
    .line 2269
    .line 2270
    move-result-object v15

    .line 2271
    iget-object v2, v14, La/epd;->a:La/udp0;

    .line 2272
    .line 2273
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 2274
    .line 2275
    .line 2276
    move-result-object v3

    .line 2277
    if-ne v3, v9, :cond_41

    .line 2278
    .line 2279
    new-instance v3, La/shd;

    .line 2280
    .line 2281
    const/16 v4, 0x15

    .line 2282
    .line 2283
    invoke-direct {v3, v4}, La/shd;-><init>(B)V

    .line 2284
    .line 2285
    .line 2286
    invoke-virtual {v1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2287
    .line 2288
    .line 2289
    :cond_41
    move-object/from16 v17, v3

    .line 2290
    .line 2291
    check-cast v17, Lkotlin/jvm/functions/Function2;

    .line 2292
    .line 2293
    const/16 v19, 0x180

    .line 2294
    .line 2295
    const/16 v20, 0x0

    .line 2296
    .line 2297
    move-object/from16 v18, v1

    .line 2298
    .line 2299
    move-object/from16 v16, v2

    .line 2300
    .line 2301
    invoke-static/range {v15 .. v20}, La/kcp0;->a(La/mm40;La/udp0;Lkotlin/jvm/functions/Function2;La/fet;II)V

    .line 2302
    .line 2303
    .line 2304
    invoke-static {v0, v7}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 2305
    .line 2306
    .line 2307
    move-result-object v0

    .line 2308
    const/4 v3, 0x0

    .line 2309
    const/high16 v4, 0x41000000    # 8.0f

    .line 2310
    .line 2311
    const/4 v5, 0x2

    .line 2312
    invoke-static {v0, v4, v3, v5}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 2313
    .line 2314
    .line 2315
    move-result-object v15

    .line 2316
    iget-object v0, v14, La/epd;->b:La/udp0;

    .line 2317
    .line 2318
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 2319
    .line 2320
    .line 2321
    move-result-object v2

    .line 2322
    if-ne v2, v9, :cond_42

    .line 2323
    .line 2324
    new-instance v2, La/shd;

    .line 2325
    .line 2326
    const/16 v3, 0x16

    .line 2327
    .line 2328
    invoke-direct {v2, v3}, La/shd;-><init>(B)V

    .line 2329
    .line 2330
    .line 2331
    invoke-virtual {v1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2332
    .line 2333
    .line 2334
    :cond_42
    move-object/from16 v17, v2

    .line 2335
    .line 2336
    check-cast v17, Lkotlin/jvm/functions/Function2;

    .line 2337
    .line 2338
    const/16 v19, 0x180

    .line 2339
    .line 2340
    const/16 v20, 0x0

    .line 2341
    .line 2342
    move-object/from16 v16, v0

    .line 2343
    .line 2344
    move-object/from16 v18, v1

    .line 2345
    .line 2346
    invoke-static/range {v15 .. v20}, La/kcp0;->a(La/mm40;La/udp0;Lkotlin/jvm/functions/Function2;La/fet;II)V

    .line 2347
    .line 2348
    .line 2349
    invoke-virtual {v1, v13}, La/fet;->r(Z)V

    .line 2350
    .line 2351
    .line 2352
    goto :goto_1b

    .line 2353
    :cond_43
    invoke-virtual {v1}, La/fet;->X()V

    .line 2354
    .line 2355
    .line 2356
    :goto_1b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2357
    .line 2358
    return-object v0

    .line 2359
    :pswitch_1a
    move-object v1, v0

    .line 2360
    check-cast v1, La/mm40;

    .line 2361
    .line 2362
    check-cast v14, La/tod;

    .line 2363
    .line 2364
    move-object/from16 v5, p1

    .line 2365
    .line 2366
    check-cast v5, La/fet;

    .line 2367
    .line 2368
    move-object/from16 v0, p2

    .line 2369
    .line 2370
    check-cast v0, Ljava/lang/Integer;

    .line 2371
    .line 2372
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 2373
    .line 2374
    .line 2375
    move-result v0

    .line 2376
    and-int/lit8 v2, v0, 0x3

    .line 2377
    .line 2378
    const/4 v3, 0x2

    .line 2379
    if-eq v2, v3, :cond_44

    .line 2380
    .line 2381
    move v10, v13

    .line 2382
    :cond_44
    and-int/2addr v0, v13

    .line 2383
    invoke-virtual {v5, v0, v10}, La/fet;->U(IZ)Z

    .line 2384
    .line 2385
    .line 2386
    move-result v0

    .line 2387
    if-eqz v0, :cond_45

    .line 2388
    .line 2389
    iget-object v2, v14, La/tod;->a:La/tdp0;

    .line 2390
    .line 2391
    const/4 v6, 0x0

    .line 2392
    const/16 v7, 0x1c

    .line 2393
    .line 2394
    const/4 v3, 0x0

    .line 2395
    const/4 v4, 0x0

    .line 2396
    invoke-static/range {v1 .. v7}, La/xf0;->h(La/mm40;La/xdp0;La/pw3;La/ugd;La/fet;II)V

    .line 2397
    .line 2398
    .line 2399
    goto :goto_1c

    .line 2400
    :cond_45
    invoke-virtual {v5}, La/fet;->X()V

    .line 2401
    .line 2402
    .line 2403
    :goto_1c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2404
    .line 2405
    return-object v0

    .line 2406
    :pswitch_1b
    check-cast v0, La/mm40;

    .line 2407
    .line 2408
    check-cast v14, La/qod;

    .line 2409
    .line 2410
    move-object/from16 v1, p1

    .line 2411
    .line 2412
    check-cast v1, La/fet;

    .line 2413
    .line 2414
    move-object/from16 v2, p2

    .line 2415
    .line 2416
    check-cast v2, Ljava/lang/Integer;

    .line 2417
    .line 2418
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 2419
    .line 2420
    .line 2421
    move-result v2

    .line 2422
    and-int/lit8 v3, v2, 0x3

    .line 2423
    .line 2424
    const/4 v5, 0x2

    .line 2425
    if-eq v3, v5, :cond_46

    .line 2426
    .line 2427
    move v3, v13

    .line 2428
    goto :goto_1d

    .line 2429
    :cond_46
    move v3, v10

    .line 2430
    :goto_1d
    and-int/2addr v2, v13

    .line 2431
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 2432
    .line 2433
    .line 2434
    move-result v2

    .line 2435
    if-eqz v2, :cond_47

    .line 2436
    .line 2437
    invoke-static {v0, v7}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 2438
    .line 2439
    .line 2440
    move-result-object v0

    .line 2441
    sget-object v2, La/qmk;->a:La/zcl;

    .line 2442
    .line 2443
    const/high16 v2, 0x42900000    # 72.0f

    .line 2444
    .line 2445
    invoke-static {v0, v2}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 2446
    .line 2447
    .line 2448
    move-result-object v0

    .line 2449
    new-instance v2, La/mod;

    .line 2450
    .line 2451
    invoke-direct {v2, v14, v10}, La/mod;-><init>(La/qod;B)V

    .line 2452
    .line 2453
    .line 2454
    const v3, -0x758a82d6

    .line 2455
    .line 2456
    .line 2457
    invoke-static {v3, v2, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 2458
    .line 2459
    .line 2460
    move-result-object v2

    .line 2461
    new-instance v3, La/mod;

    .line 2462
    .line 2463
    invoke-direct {v3, v14, v13}, La/mod;-><init>(La/qod;B)V

    .line 2464
    .line 2465
    .line 2466
    const v4, 0x39aa31ab

    .line 2467
    .line 2468
    .line 2469
    invoke-static {v4, v3, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 2470
    .line 2471
    .line 2472
    move-result-object v3

    .line 2473
    new-instance v4, La/mod;

    .line 2474
    .line 2475
    const/4 v5, 0x2

    .line 2476
    invoke-direct {v4, v14, v5}, La/mod;-><init>(La/qod;B)V

    .line 2477
    .line 2478
    .line 2479
    const v6, -0x172119d4

    .line 2480
    .line 2481
    .line 2482
    invoke-static {v6, v4, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 2483
    .line 2484
    .line 2485
    move-result-object v4

    .line 2486
    new-array v6, v12, [La/xdr;

    .line 2487
    .line 2488
    aput-object v2, v6, v10

    .line 2489
    .line 2490
    aput-object v3, v6, v13

    .line 2491
    .line 2492
    aput-object v4, v6, v5

    .line 2493
    .line 2494
    invoke-static {v6}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 2495
    .line 2496
    .line 2497
    move-result-object v2

    .line 2498
    const/4 v3, 0x4

    .line 2499
    invoke-static {v0, v2, v8, v1, v3}, La/b34;->k(La/mm40;Ljava/util/List;La/ugd;La/fet;I)V

    .line 2500
    .line 2501
    .line 2502
    goto :goto_1e

    .line 2503
    :cond_47
    invoke-virtual {v1}, La/fet;->X()V

    .line 2504
    .line 2505
    .line 2506
    :goto_1e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2507
    .line 2508
    return-object v0

    .line 2509
    :pswitch_1c
    move-object v1, v0

    .line 2510
    check-cast v1, La/mm40;

    .line 2511
    .line 2512
    check-cast v14, La/hod;

    .line 2513
    .line 2514
    move-object/from16 v5, p1

    .line 2515
    .line 2516
    check-cast v5, La/fet;

    .line 2517
    .line 2518
    move-object/from16 v0, p2

    .line 2519
    .line 2520
    check-cast v0, Ljava/lang/Integer;

    .line 2521
    .line 2522
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 2523
    .line 2524
    .line 2525
    move-result v0

    .line 2526
    and-int/lit8 v2, v0, 0x3

    .line 2527
    .line 2528
    const/4 v3, 0x2

    .line 2529
    if-eq v2, v3, :cond_48

    .line 2530
    .line 2531
    move v10, v13

    .line 2532
    :cond_48
    and-int/2addr v0, v13

    .line 2533
    invoke-virtual {v5, v0, v10}, La/fet;->U(IZ)Z

    .line 2534
    .line 2535
    .line 2536
    move-result v0

    .line 2537
    if-eqz v0, :cond_49

    .line 2538
    .line 2539
    iget-object v2, v14, La/hod;->a:La/tdp0;

    .line 2540
    .line 2541
    const/4 v6, 0x0

    .line 2542
    const/16 v7, 0x1c

    .line 2543
    .line 2544
    const/4 v3, 0x0

    .line 2545
    const/4 v4, 0x0

    .line 2546
    invoke-static/range {v1 .. v7}, La/xf0;->h(La/mm40;La/xdp0;La/pw3;La/ugd;La/fet;II)V

    .line 2547
    .line 2548
    .line 2549
    goto :goto_1f

    .line 2550
    :cond_49
    invoke-virtual {v5}, La/fet;->X()V

    .line 2551
    .line 2552
    .line 2553
    :goto_1f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2554
    .line 2555
    return-object v0

    .line 2556
    nop

    .line 2557
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
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
