.class public final synthetic La/unb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xnb;

.field public final synthetic c:La/l7m0;


# direct methods
.method public synthetic constructor <init>(La/xnb;La/pz40;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/unb;->a:B

    iput-object p1, p0, La/unb;->b:La/xnb;

    iput-object p2, p0, La/unb;->c:La/l7m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/unb;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x3f800000    # 1.0f

    .line 6
    .line 7
    sget-object v3, La/jm40;->b:La/jm40;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x1

    .line 12
    iget-object v7, v0, La/unb;->c:La/l7m0;

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object/from16 v1, p1

    .line 18
    .line 19
    check-cast v1, La/y5d;

    .line 20
    .line 21
    move-object/from16 v13, p2

    .line 22
    .line 23
    check-cast v13, La/fet;

    .line 24
    .line 25
    move-object/from16 v8, p3

    .line 26
    .line 27
    check-cast v8, Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v8

    .line 33
    sget-object v9, La/xnb;->w2:La/kj5;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    and-int/lit8 v1, v8, 0x11

    .line 39
    .line 40
    const/16 v9, 0x10

    .line 41
    .line 42
    if-eq v1, v9, :cond_0

    .line 43
    .line 44
    move v1, v6

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move v1, v5

    .line 47
    :goto_0
    and-int/2addr v6, v8

    .line 48
    invoke-virtual {v13, v6, v1}, La/fet;->U(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_a

    .line 53
    .line 54
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, La/dob;

    .line 59
    .line 60
    if-eqz v1, :cond_9

    .line 61
    .line 62
    instance-of v6, v1, La/bob;

    .line 63
    .line 64
    if-eqz v6, :cond_1

    .line 65
    .line 66
    const v0, 0x3240c812

    .line 67
    .line 68
    .line 69
    invoke-virtual {v13, v0}, La/fet;->e0(I)V

    .line 70
    .line 71
    .line 72
    const-wide/16 v0, 0x0

    .line 73
    .line 74
    invoke-static {v5, v0, v1, v13, v4}, La/sj3;->m(IJLa/fet;La/mm40;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v13, v5}, La/fet;->r(Z)V

    .line 78
    .line 79
    .line 80
    goto/16 :goto_1

    .line 81
    .line 82
    :cond_1
    instance-of v4, v1, La/cob;

    .line 83
    .line 84
    iget-object v8, v0, La/unb;->b:La/xnb;

    .line 85
    .line 86
    sget-object v0, La/ukd;->a:La/cl5;

    .line 87
    .line 88
    if-eqz v4, :cond_6

    .line 89
    .line 90
    const v2, 0x32433b94

    .line 91
    .line 92
    .line 93
    invoke-virtual {v13, v2}, La/fet;->e0(I)V

    .line 94
    .line 95
    .line 96
    check-cast v1, La/cob;

    .line 97
    .line 98
    iget-boolean v10, v1, La/cob;->d:Z

    .line 99
    .line 100
    invoke-virtual {v8}, La/xnb;->S0()La/gob;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v13, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    if-nez v3, :cond_2

    .line 113
    .line 114
    if-ne v4, v0, :cond_3

    .line 115
    .line 116
    :cond_2
    new-instance v14, La/pw4;

    .line 117
    .line 118
    const/16 v20, 0x0

    .line 119
    .line 120
    const/16 v21, 0xf

    .line 121
    .line 122
    const/4 v15, 0x0

    .line 123
    const-class v17, La/gob;

    .line 124
    .line 125
    const-string v18, "openPaymentActivityClick"

    .line 126
    .line 127
    const-string v19, "openPaymentActivityClick()V"

    .line 128
    .line 129
    move-object/from16 v16, v2

    .line 130
    .line 131
    invoke-direct/range {v14 .. v21}, La/pw4;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v13, v14}, La/fet;->o0(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    move-object v4, v14

    .line 138
    :cond_3
    check-cast v4, La/jhy;

    .line 139
    .line 140
    move-object v11, v4

    .line 141
    check-cast v11, Lkotlin/jvm/functions/Function0;

    .line 142
    .line 143
    invoke-virtual {v8}, La/xnb;->S0()La/gob;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-virtual {v13, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    if-nez v3, :cond_4

    .line 156
    .line 157
    if-ne v4, v0, :cond_5

    .line 158
    .line 159
    :cond_4
    new-instance v14, La/pw4;

    .line 160
    .line 161
    const/16 v20, 0x0

    .line 162
    .line 163
    const/16 v21, 0x10

    .line 164
    .line 165
    const/4 v15, 0x0

    .line 166
    const-class v17, La/gob;

    .line 167
    .line 168
    const-string v18, "addAccountClick"

    .line 169
    .line 170
    const-string v19, "addAccountClick()V"

    .line 171
    .line 172
    move-object/from16 v16, v2

    .line 173
    .line 174
    invoke-direct/range {v14 .. v21}, La/pw4;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v13, v14}, La/fet;->o0(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    move-object v4, v14

    .line 181
    :cond_5
    check-cast v4, La/jhy;

    .line 182
    .line 183
    move-object v12, v4

    .line 184
    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 185
    .line 186
    const/4 v14, 0x0

    .line 187
    const/4 v9, 0x0

    .line 188
    invoke-virtual/range {v8 .. v14}, La/xnb;->P0(La/mm40;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 189
    .line 190
    .line 191
    const/16 v0, 0x8

    .line 192
    .line 193
    invoke-virtual {v8, v1, v13, v0}, La/xnb;->Q0(La/cob;La/fet;I)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v13, v5}, La/fet;->r(Z)V

    .line 197
    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_6
    instance-of v4, v1, La/aob;

    .line 201
    .line 202
    if-eqz v4, :cond_9

    .line 203
    .line 204
    const v4, 0x324a0109

    .line 205
    .line 206
    .line 207
    invoke-virtual {v13, v4}, La/fet;->e0(I)V

    .line 208
    .line 209
    .line 210
    invoke-static {v3, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    invoke-virtual {v13, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    invoke-virtual {v13, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    or-int/2addr v3, v4

    .line 223
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    if-nez v3, :cond_7

    .line 228
    .line 229
    if-ne v4, v0, :cond_8

    .line 230
    .line 231
    :cond_7
    new-instance v4, La/op7;

    .line 232
    .line 233
    const/16 v0, 0x1a

    .line 234
    .line 235
    invoke-direct {v4, v1, v8, v0}, La/op7;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v13, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    :cond_8
    move-object/from16 v16, v4

    .line 242
    .line 243
    check-cast v16, Lkotlin/jvm/functions/Function1;

    .line 244
    .line 245
    const/16 v18, 0x6

    .line 246
    .line 247
    const/16 v19, 0x1fe

    .line 248
    .line 249
    const/4 v9, 0x0

    .line 250
    const/4 v10, 0x0

    .line 251
    const/4 v11, 0x0

    .line 252
    const/4 v12, 0x0

    .line 253
    move-object/from16 v17, v13

    .line 254
    .line 255
    const/4 v13, 0x0

    .line 256
    const/4 v14, 0x0

    .line 257
    const/4 v15, 0x0

    .line 258
    move-object v8, v2

    .line 259
    invoke-static/range {v8 .. v19}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 260
    .line 261
    .line 262
    move-object/from16 v13, v17

    .line 263
    .line 264
    invoke-virtual {v13, v5}, La/fet;->r(Z)V

    .line 265
    .line 266
    .line 267
    goto :goto_1

    .line 268
    :cond_9
    const v0, 0x7d7deccc

    .line 269
    .line 270
    .line 271
    invoke-static {v0, v13, v5}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    throw v0

    .line 276
    :cond_a
    invoke-virtual {v13}, La/fet;->X()V

    .line 277
    .line 278
    .line 279
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 280
    .line 281
    return-object v0

    .line 282
    :pswitch_0
    iget-object v0, v0, La/unb;->b:La/xnb;

    .line 283
    .line 284
    iget-object v1, v0, La/xnb;->n2:La/phf0;

    .line 285
    .line 286
    move-object/from16 v8, p1

    .line 287
    .line 288
    check-cast v8, La/y5d;

    .line 289
    .line 290
    move-object/from16 v9, p2

    .line 291
    .line 292
    check-cast v9, La/fet;

    .line 293
    .line 294
    move-object/from16 v10, p3

    .line 295
    .line 296
    check-cast v10, Ljava/lang/Integer;

    .line 297
    .line 298
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 299
    .line 300
    .line 301
    move-result v10

    .line 302
    sget-object v11, La/xnb;->w2:La/kj5;

    .line 303
    .line 304
    sget-object v11, La/gqw0;->n:La/xx7;

    .line 305
    .line 306
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    and-int/lit8 v12, v10, 0x6

    .line 310
    .line 311
    const/4 v13, 0x2

    .line 312
    if-nez v12, :cond_c

    .line 313
    .line 314
    invoke-virtual {v9, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    move-result v12

    .line 318
    if-eqz v12, :cond_b

    .line 319
    .line 320
    const/4 v12, 0x4

    .line 321
    goto :goto_2

    .line 322
    :cond_b
    move v12, v13

    .line 323
    :goto_2
    or-int/2addr v10, v12

    .line 324
    :cond_c
    and-int/lit8 v12, v10, 0x13

    .line 325
    .line 326
    const/16 v14, 0x12

    .line 327
    .line 328
    if-eq v12, v14, :cond_d

    .line 329
    .line 330
    move v12, v6

    .line 331
    goto :goto_3

    .line 332
    :cond_d
    move v12, v5

    .line 333
    :goto_3
    and-int/2addr v6, v10

    .line 334
    invoke-virtual {v9, v6, v12}, La/fet;->U(IZ)Z

    .line 335
    .line 336
    .line 337
    move-result v6

    .line 338
    if-eqz v6, :cond_11

    .line 339
    .line 340
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v6

    .line 344
    check-cast v6, La/dob;

    .line 345
    .line 346
    instance-of v6, v6, La/bob;

    .line 347
    .line 348
    if-nez v6, :cond_f

    .line 349
    .line 350
    const v6, 0x215316a3

    .line 351
    .line 352
    .line 353
    invoke-virtual {v9, v6}, La/fet;->e0(I)V

    .line 354
    .line 355
    .line 356
    invoke-static {v3, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 357
    .line 358
    .line 359
    move-result-object v6

    .line 360
    invoke-virtual {v8, v6, v11}, La/y5d;->a(La/mm40;La/xx7;)La/mm40;

    .line 361
    .line 362
    .line 363
    move-result-object v14

    .line 364
    sget-object v6, La/qmk;->a:La/zcl;

    .line 365
    .line 366
    const/high16 v18, 0x41000000    # 8.0f

    .line 367
    .line 368
    const/16 v19, 0x5

    .line 369
    .line 370
    const/4 v15, 0x0

    .line 371
    const/high16 v16, 0x41e00000    # 28.0f

    .line 372
    .line 373
    const/16 v17, 0x0

    .line 374
    .line 375
    invoke-static/range {v14 .. v19}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 376
    .line 377
    .line 378
    move-result-object v6

    .line 379
    iget-object v10, v0, La/xnb;->u2:La/ctf0;

    .line 380
    .line 381
    if-eqz v10, :cond_e

    .line 382
    .line 383
    new-array v4, v5, [Ljava/lang/Object;

    .line 384
    .line 385
    iget-object v10, v10, La/ctf0;->b:La/lsm0;

    .line 386
    .line 387
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v4

    .line 391
    const v12, 0x7f131224

    .line 392
    .line 393
    .line 394
    invoke-virtual {v10, v12, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v10

    .line 398
    const/16 v17, 0x0

    .line 399
    .line 400
    const/16 v18, 0x1c

    .line 401
    .line 402
    move-object v4, v11

    .line 403
    const-wide/16 v11, 0x0

    .line 404
    .line 405
    move v14, v13

    .line 406
    const/4 v13, 0x0

    .line 407
    move/from16 v16, v14

    .line 408
    .line 409
    const-wide/16 v14, 0x0

    .line 410
    .line 411
    move-object/from16 v22, v6

    .line 412
    .line 413
    move-object v6, v4

    .line 414
    move/from16 v4, v16

    .line 415
    .line 416
    move-object/from16 v16, v9

    .line 417
    .line 418
    move-object/from16 v9, v22

    .line 419
    .line 420
    invoke-static/range {v9 .. v18}, La/wwb;->i(La/mm40;Ljava/lang/String;JIJLa/fet;II)V

    .line 421
    .line 422
    .line 423
    move-object/from16 v9, v16

    .line 424
    .line 425
    invoke-virtual {v9, v5}, La/fet;->r(Z)V

    .line 426
    .line 427
    .line 428
    move v14, v4

    .line 429
    goto :goto_4

    .line 430
    :cond_e
    const-string v0, "resourceManager"

    .line 431
    .line 432
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 433
    .line 434
    .line 435
    throw v4

    .line 436
    :cond_f
    move-object v6, v11

    .line 437
    move v14, v13

    .line 438
    const v4, 0x2159123b

    .line 439
    .line 440
    .line 441
    invoke-virtual {v9, v4}, La/fet;->e0(I)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v9, v5}, La/fet;->r(Z)V

    .line 445
    .line 446
    .line 447
    :goto_4
    sget-object v4, La/xnb;->x2:[La/iiy;

    .line 448
    .line 449
    const/4 v10, 0x3

    .line 450
    aget-object v11, v4, v10

    .line 451
    .line 452
    invoke-virtual {v1, v0, v11}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object v11

    .line 456
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 457
    .line 458
    .line 459
    move-result v11

    .line 460
    if-lez v11, :cond_10

    .line 461
    .line 462
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v7

    .line 466
    check-cast v7, La/dob;

    .line 467
    .line 468
    instance-of v7, v7, La/aob;

    .line 469
    .line 470
    if-nez v7, :cond_10

    .line 471
    .line 472
    const v7, 0x215b729b

    .line 473
    .line 474
    .line 475
    invoke-virtual {v9, v7}, La/fet;->e0(I)V

    .line 476
    .line 477
    .line 478
    invoke-static {v3, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 479
    .line 480
    .line 481
    move-result-object v2

    .line 482
    invoke-virtual {v8, v2, v6}, La/y5d;->a(La/mm40;La/xx7;)La/mm40;

    .line 483
    .line 484
    .line 485
    move-result-object v2

    .line 486
    sget-object v3, La/qmk;->a:La/zcl;

    .line 487
    .line 488
    const/high16 v3, 0x41800000    # 16.0f

    .line 489
    .line 490
    const/4 v6, 0x0

    .line 491
    invoke-static {v2, v3, v6, v14}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 492
    .line 493
    .line 494
    move-result-object v2

    .line 495
    aget-object v3, v4, v10

    .line 496
    .line 497
    invoke-virtual {v1, v0, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v10

    .line 501
    const/16 v18, 0x0

    .line 502
    .line 503
    const/16 v19, 0x34

    .line 504
    .line 505
    const/4 v11, 0x0

    .line 506
    const/4 v12, 0x3

    .line 507
    const-wide/16 v13, 0x0

    .line 508
    .line 509
    const-wide/16 v15, 0x0

    .line 510
    .line 511
    move-object/from16 v17, v9

    .line 512
    .line 513
    move-object v9, v2

    .line 514
    invoke-static/range {v9 .. v19}, La/kkb;->m(La/mm40;Ljava/lang/String;La/ro8;IJJLa/fet;II)V

    .line 515
    .line 516
    .line 517
    move-object/from16 v9, v17

    .line 518
    .line 519
    invoke-virtual {v9, v5}, La/fet;->r(Z)V

    .line 520
    .line 521
    .line 522
    goto :goto_5

    .line 523
    :cond_10
    const v0, 0x21618c3b

    .line 524
    .line 525
    .line 526
    invoke-virtual {v9, v0}, La/fet;->e0(I)V

    .line 527
    .line 528
    .line 529
    invoke-virtual {v9, v5}, La/fet;->r(Z)V

    .line 530
    .line 531
    .line 532
    goto :goto_5

    .line 533
    :cond_11
    invoke-virtual {v9}, La/fet;->X()V

    .line 534
    .line 535
    .line 536
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 537
    .line 538
    return-object v0

    .line 539
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
