.class public final synthetic La/sg5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:La/pz40;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;La/pz40;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/sg5;->a:B

    iput-object p1, p0, La/sg5;->b:Ljava/lang/String;

    iput-object p2, p0, La/sg5;->c:Ljava/lang/String;

    iput-object p3, p0, La/sg5;->d:La/pz40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/sg5;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    sget-object v3, La/e7z;->u1:La/pcy;

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x1

    .line 12
    const/high16 v7, 0x3f800000    # 1.0f

    .line 13
    .line 14
    iget-object v8, v0, La/sg5;->d:La/pz40;

    .line 15
    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    move-object/from16 v1, p1

    .line 20
    .line 21
    check-cast v1, La/fet;

    .line 22
    .line 23
    move-object/from16 v9, p2

    .line 24
    .line 25
    check-cast v9, Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v9

    .line 31
    and-int/lit8 v10, v9, 0x3

    .line 32
    .line 33
    if-eq v10, v4, :cond_0

    .line 34
    .line 35
    move v4, v6

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v4, v5

    .line 38
    :goto_0
    and-int/2addr v9, v6

    .line 39
    invoke-virtual {v1, v9, v4}, La/fet;->U(IZ)Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_3

    .line 44
    .line 45
    new-instance v4, La/x7z;

    .line 46
    .line 47
    invoke-direct {v4, v7, v5}, La/x7z;-><init>(FZ)V

    .line 48
    .line 49
    .line 50
    sget-object v9, La/gqw0;->k:La/yx7;

    .line 51
    .line 52
    sget-object v10, La/uc9;->a:La/lw3;

    .line 53
    .line 54
    const/16 v11, 0x30

    .line 55
    .line 56
    invoke-static {v10, v9, v1, v11}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    iget-wide v10, v1, La/fet;->T:J

    .line 61
    .line 62
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 63
    .line 64
    .line 65
    move-result v10

    .line 66
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 67
    .line 68
    .line 69
    move-result-object v11

    .line 70
    invoke-static {v1, v4}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    sget-object v12, La/mkd;->c0:La/gqw0;

    .line 75
    .line 76
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, La/fet;->i0()V

    .line 80
    .line 81
    .line 82
    iget-boolean v12, v1, La/fet;->S:Z

    .line 83
    .line 84
    if-eqz v12, :cond_1

    .line 85
    .line 86
    invoke-virtual {v1, v3}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_1
    invoke-virtual {v1}, La/fet;->r0()V

    .line 91
    .line 92
    .line 93
    :goto_1
    sget-object v3, La/gqw0;->x:La/shd;

    .line 94
    .line 95
    invoke-static {v1, v9, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 96
    .line 97
    .line 98
    sget-object v3, La/gqw0;->w:La/shd;

    .line 99
    .line 100
    invoke-static {v1, v11, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 101
    .line 102
    .line 103
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    sget-object v9, La/gqw0;->y:La/shd;

    .line 108
    .line 109
    invoke-static {v1, v3, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 110
    .line 111
    .line 112
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 113
    .line 114
    .line 115
    sget-object v3, La/gqw0;->v:La/shd;

    .line 116
    .line 117
    invoke-static {v1, v4, v3, v7, v5}, La/ohs0;->i(La/fet;La/mm40;La/shd;FZ)La/x7z;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    const-string v4, "WALLET_SUM"

    .line 122
    .line 123
    invoke-static {v3, v4}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 124
    .line 125
    .line 126
    move-result-object v10

    .line 127
    invoke-static {}, La/g1t0;->a()La/y9q0;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    invoke-static {v3, v1}, La/ibm0;->t(La/y9q0;La/fet;)La/y9q0;

    .line 132
    .line 133
    .line 134
    move-result-object v11

    .line 135
    sget-wide v13, La/qmk;->o:J

    .line 136
    .line 137
    sget-wide v15, La/qmk;->q:J

    .line 138
    .line 139
    sget-wide v17, La/qmk;->n:J

    .line 140
    .line 141
    new-instance v12, La/n05;

    .line 142
    .line 143
    invoke-direct/range {v12 .. v18}, La/n05;-><init>(JJJ)V

    .line 144
    .line 145
    .line 146
    move-object/from16 v18, v12

    .line 147
    .line 148
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    if-ne v3, v2, :cond_2

    .line 153
    .line 154
    new-instance v3, La/we;

    .line 155
    .line 156
    const/16 v2, 0x1a

    .line 157
    .line 158
    invoke-direct {v3, v8, v2}, La/we;-><init>(La/pz40;B)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    :cond_2
    move-object v12, v3

    .line 165
    check-cast v12, Lkotlin/jvm/functions/Function1;

    .line 166
    .line 167
    const v20, 0x186c00

    .line 168
    .line 169
    .line 170
    const/16 v21, 0x1a0

    .line 171
    .line 172
    iget-object v9, v0, La/sg5;->b:Ljava/lang/String;

    .line 173
    .line 174
    const/4 v13, 0x2

    .line 175
    const/4 v14, 0x0

    .line 176
    const/4 v15, 0x1

    .line 177
    const/16 v16, 0x0

    .line 178
    .line 179
    const/16 v17, 0x0

    .line 180
    .line 181
    move-object/from16 v19, v1

    .line 182
    .line 183
    invoke-static/range {v9 .. v21}, La/aad;->e(Ljava/lang/String;La/mm40;La/y9q0;Lkotlin/jvm/functions/Function1;IZIILa/n4d;La/n05;La/fet;II)V

    .line 184
    .line 185
    .line 186
    const/4 v13, 0x0

    .line 187
    const/16 v14, 0xe

    .line 188
    .line 189
    sget-object v9, La/jm40;->b:La/jm40;

    .line 190
    .line 191
    const/high16 v10, 0x40000000    # 2.0f

    .line 192
    .line 193
    const/4 v11, 0x0

    .line 194
    const/4 v12, 0x0

    .line 195
    invoke-static/range {v9 .. v14}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    const-string v3, "WALLET_CURRENCY"

    .line 200
    .line 201
    invoke-static {v2, v3}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 202
    .line 203
    .line 204
    move-result-object v10

    .line 205
    invoke-static {}, La/g1t0;->a()La/y9q0;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    invoke-static {v2, v1}, La/ibm0;->t(La/y9q0;La/fet;)La/y9q0;

    .line 210
    .line 211
    .line 212
    move-result-object v29

    .line 213
    invoke-interface {v8}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    check-cast v2, La/daq0;

    .line 218
    .line 219
    iget-wide v14, v2, La/daq0;->a:J

    .line 220
    .line 221
    const/16 v32, 0x6000

    .line 222
    .line 223
    const v33, 0x1bfec

    .line 224
    .line 225
    .line 226
    iget-object v9, v0, La/sg5;->c:Ljava/lang/String;

    .line 227
    .line 228
    const-wide/16 v11, 0x0

    .line 229
    .line 230
    const/4 v13, 0x0

    .line 231
    const/16 v16, 0x0

    .line 232
    .line 233
    const/16 v18, 0x0

    .line 234
    .line 235
    const-wide/16 v19, 0x0

    .line 236
    .line 237
    const/16 v21, 0x0

    .line 238
    .line 239
    const-wide/16 v22, 0x0

    .line 240
    .line 241
    const/16 v24, 0x0

    .line 242
    .line 243
    const/16 v25, 0x0

    .line 244
    .line 245
    const/16 v26, 0x1

    .line 246
    .line 247
    const/16 v27, 0x0

    .line 248
    .line 249
    const/16 v28, 0x0

    .line 250
    .line 251
    const/16 v31, 0x0

    .line 252
    .line 253
    move-object/from16 v30, v1

    .line 254
    .line 255
    invoke-static/range {v9 .. v33}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v1, v6}, La/fet;->r(Z)V

    .line 259
    .line 260
    .line 261
    goto :goto_2

    .line 262
    :cond_3
    invoke-virtual {v1}, La/fet;->X()V

    .line 263
    .line 264
    .line 265
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 266
    .line 267
    return-object v0

    .line 268
    :pswitch_0
    move-object/from16 v1, p1

    .line 269
    .line 270
    check-cast v1, La/fet;

    .line 271
    .line 272
    move-object/from16 v9, p2

    .line 273
    .line 274
    check-cast v9, Ljava/lang/Integer;

    .line 275
    .line 276
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 277
    .line 278
    .line 279
    move-result v9

    .line 280
    and-int/lit8 v10, v9, 0x3

    .line 281
    .line 282
    if-eq v10, v4, :cond_4

    .line 283
    .line 284
    move v4, v6

    .line 285
    goto :goto_3

    .line 286
    :cond_4
    move v4, v5

    .line 287
    :goto_3
    and-int/2addr v9, v6

    .line 288
    invoke-virtual {v1, v9, v4}, La/fet;->U(IZ)Z

    .line 289
    .line 290
    .line 291
    move-result v4

    .line 292
    if-eqz v4, :cond_7

    .line 293
    .line 294
    sget-object v4, La/uc9;->a:La/lw3;

    .line 295
    .line 296
    sget-object v9, La/gqw0;->j:La/yx7;

    .line 297
    .line 298
    invoke-static {v4, v9, v1, v5}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 299
    .line 300
    .line 301
    move-result-object v4

    .line 302
    iget-wide v9, v1, La/fet;->T:J

    .line 303
    .line 304
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 305
    .line 306
    .line 307
    move-result v9

    .line 308
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 309
    .line 310
    .line 311
    move-result-object v10

    .line 312
    sget-object v11, La/jm40;->b:La/jm40;

    .line 313
    .line 314
    invoke-static {v1, v11}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 315
    .line 316
    .line 317
    move-result-object v12

    .line 318
    sget-object v13, La/mkd;->c0:La/gqw0;

    .line 319
    .line 320
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v1}, La/fet;->i0()V

    .line 324
    .line 325
    .line 326
    iget-boolean v13, v1, La/fet;->S:Z

    .line 327
    .line 328
    if-eqz v13, :cond_5

    .line 329
    .line 330
    invoke-virtual {v1, v3}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 331
    .line 332
    .line 333
    goto :goto_4

    .line 334
    :cond_5
    invoke-virtual {v1}, La/fet;->r0()V

    .line 335
    .line 336
    .line 337
    :goto_4
    sget-object v3, La/gqw0;->x:La/shd;

    .line 338
    .line 339
    invoke-static {v1, v4, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 340
    .line 341
    .line 342
    sget-object v3, La/gqw0;->w:La/shd;

    .line 343
    .line 344
    invoke-static {v1, v10, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 345
    .line 346
    .line 347
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 348
    .line 349
    .line 350
    move-result-object v3

    .line 351
    sget-object v4, La/gqw0;->y:La/shd;

    .line 352
    .line 353
    invoke-static {v1, v3, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 354
    .line 355
    .line 356
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 357
    .line 358
    .line 359
    sget-object v3, La/gqw0;->v:La/shd;

    .line 360
    .line 361
    invoke-static {v1, v12, v3, v7, v5}, La/ohs0;->i(La/fet;La/mm40;La/shd;FZ)La/x7z;

    .line 362
    .line 363
    .line 364
    move-result-object v10

    .line 365
    invoke-static {}, La/g1t0;->p()La/y9q0;

    .line 366
    .line 367
    .line 368
    move-result-object v3

    .line 369
    invoke-static {v3, v1}, La/ibm0;->t(La/y9q0;La/fet;)La/y9q0;

    .line 370
    .line 371
    .line 372
    move-result-object v3

    .line 373
    sget-wide v13, La/qmk;->r:J

    .line 374
    .line 375
    sget-wide v15, La/qmk;->w:J

    .line 376
    .line 377
    sget-wide v17, La/qmk;->n:J

    .line 378
    .line 379
    new-instance v12, La/n05;

    .line 380
    .line 381
    invoke-direct/range {v12 .. v18}, La/n05;-><init>(JJJ)V

    .line 382
    .line 383
    .line 384
    move-object/from16 v18, v12

    .line 385
    .line 386
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v4

    .line 390
    if-ne v4, v2, :cond_6

    .line 391
    .line 392
    new-instance v4, La/we;

    .line 393
    .line 394
    const/16 v2, 0x19

    .line 395
    .line 396
    invoke-direct {v4, v8, v2}, La/we;-><init>(La/pz40;B)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    :cond_6
    move-object v12, v4

    .line 403
    check-cast v12, Lkotlin/jvm/functions/Function1;

    .line 404
    .line 405
    const v20, 0x186c00

    .line 406
    .line 407
    .line 408
    const/16 v21, 0x1a0

    .line 409
    .line 410
    iget-object v9, v0, La/sg5;->b:Ljava/lang/String;

    .line 411
    .line 412
    const/4 v13, 0x2

    .line 413
    const/4 v14, 0x0

    .line 414
    const/4 v15, 0x1

    .line 415
    const/16 v16, 0x0

    .line 416
    .line 417
    const/16 v17, 0x0

    .line 418
    .line 419
    move-object/from16 v19, v1

    .line 420
    .line 421
    move-object v1, v11

    .line 422
    move-object v11, v3

    .line 423
    invoke-static/range {v9 .. v21}, La/aad;->e(Ljava/lang/String;La/mm40;La/y9q0;Lkotlin/jvm/functions/Function1;IZIILa/n4d;La/n05;La/fet;II)V

    .line 424
    .line 425
    .line 426
    move-object/from16 v2, v19

    .line 427
    .line 428
    const/4 v15, 0x0

    .line 429
    const/16 v16, 0xe

    .line 430
    .line 431
    const/high16 v12, 0x40800000    # 4.0f

    .line 432
    .line 433
    const/4 v13, 0x0

    .line 434
    const/4 v14, 0x0

    .line 435
    move-object v11, v1

    .line 436
    invoke-static/range {v11 .. v16}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 437
    .line 438
    .line 439
    move-result-object v1

    .line 440
    invoke-static {}, La/g1t0;->p()La/y9q0;

    .line 441
    .line 442
    .line 443
    move-result-object v3

    .line 444
    invoke-static {v3, v2}, La/ibm0;->t(La/y9q0;La/fet;)La/y9q0;

    .line 445
    .line 446
    .line 447
    move-result-object v27

    .line 448
    invoke-interface {v8}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v3

    .line 452
    check-cast v3, La/daq0;

    .line 453
    .line 454
    iget-wide v12, v3, La/daq0;->a:J

    .line 455
    .line 456
    const/16 v30, 0x6000

    .line 457
    .line 458
    const v31, 0x1bfec

    .line 459
    .line 460
    .line 461
    iget-object v7, v0, La/sg5;->c:Ljava/lang/String;

    .line 462
    .line 463
    const-wide/16 v9, 0x0

    .line 464
    .line 465
    const/4 v11, 0x0

    .line 466
    const/4 v14, 0x0

    .line 467
    const/4 v15, 0x0

    .line 468
    const/16 v16, 0x0

    .line 469
    .line 470
    const-wide/16 v17, 0x0

    .line 471
    .line 472
    const/16 v19, 0x0

    .line 473
    .line 474
    const-wide/16 v20, 0x0

    .line 475
    .line 476
    const/16 v22, 0x0

    .line 477
    .line 478
    const/16 v23, 0x0

    .line 479
    .line 480
    const/16 v24, 0x1

    .line 481
    .line 482
    const/16 v25, 0x0

    .line 483
    .line 484
    const/16 v26, 0x0

    .line 485
    .line 486
    const/16 v29, 0x0

    .line 487
    .line 488
    move-object v8, v1

    .line 489
    move-object/from16 v28, v2

    .line 490
    .line 491
    invoke-static/range {v7 .. v31}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v2, v6}, La/fet;->r(Z)V

    .line 495
    .line 496
    .line 497
    goto :goto_5

    .line 498
    :cond_7
    move-object v2, v1

    .line 499
    invoke-virtual {v2}, La/fet;->X()V

    .line 500
    .line 501
    .line 502
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 503
    .line 504
    return-object v0

    .line 505
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
