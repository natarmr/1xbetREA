.class public final synthetic La/ohd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/ohd;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/ohd;->a:B

    .line 4
    .line 5
    const/high16 v1, 0x43900000    # 288.0f

    .line 6
    .line 7
    const/high16 v2, 0x432c0000    # 172.0f

    .line 8
    .line 9
    const/high16 v3, 0x42400000    # 48.0f

    .line 10
    .line 11
    const/16 v4, 0x90

    .line 12
    .line 13
    const/high16 v5, 0x41800000    # 16.0f

    .line 14
    .line 15
    const/16 v6, 0x10

    .line 16
    .line 17
    const/16 v7, 0x20

    .line 18
    .line 19
    const/4 v8, 0x2

    .line 20
    const/high16 v9, 0x3f800000    # 1.0f

    .line 21
    .line 22
    const/16 v10, 0x80

    .line 23
    .line 24
    const/4 v11, 0x0

    .line 25
    const/4 v12, 0x0

    .line 26
    const/4 v13, 0x1

    .line 27
    packed-switch v0, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    move-object/from16 v0, p1

    .line 31
    .line 32
    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    .line 33
    .line 34
    move-object/from16 v1, p2

    .line 35
    .line 36
    check-cast v1, Landroid/content/Context;

    .line 37
    .line 38
    move-object/from16 v2, p3

    .line 39
    .line 40
    check-cast v2, La/r4i0;

    .line 41
    .line 42
    move-object/from16 v3, p4

    .line 43
    .line 44
    check-cast v3, La/rs00;

    .line 45
    .line 46
    new-instance v4, La/lw90;

    .line 47
    .line 48
    invoke-direct {v4, v0, v1, v2, v3}, La/lw90;-><init>(Lkotlin/coroutines/CoroutineContext;Landroid/content/Context;La/r4i0;La/rs00;)V

    .line 49
    .line 50
    .line 51
    return-object v4

    .line 52
    :pswitch_0
    move-object/from16 v0, p1

    .line 53
    .line 54
    check-cast v0, La/g9z;

    .line 55
    .line 56
    move-object/from16 v1, p2

    .line 57
    .line 58
    check-cast v1, Ljava/lang/Integer;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-object/from16 v1, p3

    .line 64
    .line 65
    check-cast v1, La/fet;

    .line 66
    .line 67
    move-object/from16 v2, p4

    .line 68
    .line 69
    check-cast v2, Ljava/lang/Integer;

    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    and-int/lit16 v0, v2, 0x81

    .line 79
    .line 80
    if-eq v0, v10, :cond_0

    .line 81
    .line 82
    move v0, v13

    .line 83
    goto :goto_0

    .line 84
    :cond_0
    move v0, v12

    .line 85
    :goto_0
    and-int/2addr v2, v13

    .line 86
    invoke-virtual {v1, v2, v0}, La/fet;->U(IZ)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_2

    .line 91
    .line 92
    sget-object v0, La/uc9;->c:La/mw3;

    .line 93
    .line 94
    sget-object v2, La/gqw0;->m:La/xx7;

    .line 95
    .line 96
    invoke-static {v0, v2, v1, v12}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iget-wide v2, v1, La/fet;->T:J

    .line 101
    .line 102
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    sget-object v4, La/jm40;->b:La/jm40;

    .line 111
    .line 112
    invoke-static {v1, v4}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    sget-object v6, La/mkd;->c0:La/gqw0;

    .line 117
    .line 118
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1}, La/fet;->i0()V

    .line 122
    .line 123
    .line 124
    iget-boolean v6, v1, La/fet;->S:Z

    .line 125
    .line 126
    if-eqz v6, :cond_1

    .line 127
    .line 128
    sget-object v6, La/e7z;->u1:La/pcy;

    .line 129
    .line 130
    invoke-virtual {v1, v6}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_1
    invoke-virtual {v1}, La/fet;->r0()V

    .line 135
    .line 136
    .line 137
    :goto_1
    sget-object v6, La/gqw0;->x:La/shd;

    .line 138
    .line 139
    invoke-static {v1, v0, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 140
    .line 141
    .line 142
    sget-object v0, La/gqw0;->w:La/shd;

    .line 143
    .line 144
    invoke-static {v1, v3, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 145
    .line 146
    .line 147
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    sget-object v2, La/gqw0;->y:La/shd;

    .line 152
    .line 153
    invoke-static {v1, v0, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 154
    .line 155
    .line 156
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 157
    .line 158
    .line 159
    sget-object v0, La/gqw0;->v:La/shd;

    .line 160
    .line 161
    invoke-static {v1, v5, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 162
    .line 163
    .line 164
    const/high16 v0, 0x42a00000    # 80.0f

    .line 165
    .line 166
    invoke-static {v4, v0}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    sget-object v3, La/qmk;->a:La/zcl;

    .line 171
    .line 172
    const/high16 v3, 0x42200000    # 40.0f

    .line 173
    .line 174
    invoke-static {v2, v3}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    sget-object v10, La/qmk;->g:La/zcl;

    .line 179
    .line 180
    sget-object v5, La/vgg0;->a:La/ugg0;

    .line 181
    .line 182
    invoke-static {v10, v10, v10, v10, v2}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    invoke-static {v11, v1, v12, v13}, La/vbc;->d0(La/vqm;La/fet;II)La/fqj0;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    invoke-static {v2, v5}, La/xbc;->c0(La/mm40;La/fqj0;)La/mm40;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    invoke-static {v1, v2}, La/qxw;->o(La/fet;La/mm40;)V

    .line 195
    .line 196
    .line 197
    const/4 v8, 0x0

    .line 198
    const/16 v9, 0xd

    .line 199
    .line 200
    const/4 v5, 0x0

    .line 201
    const/high16 v6, 0x41000000    # 8.0f

    .line 202
    .line 203
    const/4 v7, 0x0

    .line 204
    invoke-static/range {v4 .. v9}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    invoke-static {v2, v0}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-static {v0, v3}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    invoke-static {v10, v10, v10, v10, v0}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-static {v11, v1, v12, v13}, La/vbc;->d0(La/vqm;La/fet;II)La/fqj0;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    invoke-static {v0, v2, v1, v13}, La/h97;->s(La/mm40;La/fqj0;La/fet;Z)V

    .line 225
    .line 226
    .line 227
    goto :goto_2

    .line 228
    :cond_2
    invoke-virtual {v1}, La/fet;->X()V

    .line 229
    .line 230
    .line 231
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 232
    .line 233
    return-object v0

    .line 234
    :pswitch_1
    move-object/from16 v0, p1

    .line 235
    .line 236
    check-cast v0, Ljava/lang/Integer;

    .line 237
    .line 238
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 239
    .line 240
    .line 241
    move-object/from16 v0, p2

    .line 242
    .line 243
    check-cast v0, Ljava/lang/Double;

    .line 244
    .line 245
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 246
    .line 247
    .line 248
    move-object/from16 v0, p3

    .line 249
    .line 250
    check-cast v0, Ljava/lang/String;

    .line 251
    .line 252
    move-object/from16 v1, p4

    .line 253
    .line 254
    check-cast v1, La/i7t;

    .line 255
    .line 256
    sget-object v2, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->z1:Ljava/util/List;

    .line 257
    .line 258
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 265
    .line 266
    return-object v0

    .line 267
    :pswitch_2
    move-object/from16 v0, p1

    .line 268
    .line 269
    check-cast v0, La/g9z;

    .line 270
    .line 271
    move-object/from16 v1, p2

    .line 272
    .line 273
    check-cast v1, Ljava/lang/Integer;

    .line 274
    .line 275
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    move-object/from16 v1, p3

    .line 279
    .line 280
    check-cast v1, La/fet;

    .line 281
    .line 282
    move-object/from16 v2, p4

    .line 283
    .line 284
    check-cast v2, Ljava/lang/Integer;

    .line 285
    .line 286
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 287
    .line 288
    .line 289
    move-result v2

    .line 290
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    and-int/lit16 v0, v2, 0x81

    .line 294
    .line 295
    if-eq v0, v10, :cond_3

    .line 296
    .line 297
    move v0, v13

    .line 298
    goto :goto_3

    .line 299
    :cond_3
    move v0, v12

    .line 300
    :goto_3
    and-int/2addr v2, v13

    .line 301
    invoke-virtual {v1, v2, v0}, La/fet;->U(IZ)Z

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    if-eqz v0, :cond_4

    .line 306
    .line 307
    sget-object v0, La/qmk;->a:La/zcl;

    .line 308
    .line 309
    const/high16 v0, 0x43200000    # 160.0f

    .line 310
    .line 311
    sget-object v2, La/jm40;->b:La/jm40;

    .line 312
    .line 313
    invoke-static {v2, v0}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    invoke-static {v0, v9}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    sget-object v2, La/qmk;->i:La/zcl;

    .line 322
    .line 323
    sget-object v3, La/vgg0;->a:La/ugg0;

    .line 324
    .line 325
    invoke-static {v2, v2, v2, v2, v0}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-static {v11, v1, v12, v13}, La/vbc;->d0(La/vqm;La/fet;II)La/fqj0;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    invoke-static {v0, v2}, La/xbc;->c0(La/mm40;La/fqj0;)La/mm40;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    invoke-static {v12, v1, v0}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 338
    .line 339
    .line 340
    goto :goto_4

    .line 341
    :cond_4
    invoke-virtual {v1}, La/fet;->X()V

    .line 342
    .line 343
    .line 344
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 345
    .line 346
    return-object v0

    .line 347
    :pswitch_3
    move-object/from16 v0, p1

    .line 348
    .line 349
    check-cast v0, La/pwv0;

    .line 350
    .line 351
    move-object/from16 v1, p2

    .line 352
    .line 353
    check-cast v1, La/d0m0;

    .line 354
    .line 355
    move-object/from16 v2, p3

    .line 356
    .line 357
    check-cast v2, La/fet;

    .line 358
    .line 359
    move-object/from16 v3, p4

    .line 360
    .line 361
    check-cast v3, Ljava/lang/Integer;

    .line 362
    .line 363
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 364
    .line 365
    .line 366
    move-result v3

    .line 367
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    and-int/lit8 v4, v3, 0x6

    .line 374
    .line 375
    if-nez v4, :cond_6

    .line 376
    .line 377
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    move-result v4

    .line 381
    if-eqz v4, :cond_5

    .line 382
    .line 383
    const/4 v8, 0x4

    .line 384
    :cond_5
    or-int v4, v3, v8

    .line 385
    .line 386
    goto :goto_5

    .line 387
    :cond_6
    move v4, v3

    .line 388
    :goto_5
    and-int/lit8 v3, v3, 0x30

    .line 389
    .line 390
    if-nez v3, :cond_8

    .line 391
    .line 392
    invoke-virtual {v2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result v3

    .line 396
    if-eqz v3, :cond_7

    .line 397
    .line 398
    move v6, v7

    .line 399
    :cond_7
    or-int/2addr v4, v6

    .line 400
    :cond_8
    and-int/lit16 v3, v4, 0x93

    .line 401
    .line 402
    const/16 v5, 0x92

    .line 403
    .line 404
    if-eq v3, v5, :cond_9

    .line 405
    .line 406
    move v12, v13

    .line 407
    :cond_9
    and-int/lit8 v3, v4, 0x1

    .line 408
    .line 409
    invoke-virtual {v2, v3, v12}, La/fet;->U(IZ)Z

    .line 410
    .line 411
    .line 412
    move-result v3

    .line 413
    if-eqz v3, :cond_a

    .line 414
    .line 415
    and-int/lit8 v3, v4, 0x7e

    .line 416
    .line 417
    invoke-static {v0, v1, v2, v3}, La/a8k0;->o(La/pwv0;La/d0m0;La/fet;I)V

    .line 418
    .line 419
    .line 420
    goto :goto_6

    .line 421
    :cond_a
    invoke-virtual {v2}, La/fet;->X()V

    .line 422
    .line 423
    .line 424
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 425
    .line 426
    return-object v0

    .line 427
    :pswitch_4
    move-object/from16 v0, p1

    .line 428
    .line 429
    check-cast v0, La/g9z;

    .line 430
    .line 431
    move-object/from16 v1, p2

    .line 432
    .line 433
    check-cast v1, Ljava/lang/Integer;

    .line 434
    .line 435
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    move-object/from16 v1, p3

    .line 439
    .line 440
    check-cast v1, La/fet;

    .line 441
    .line 442
    move-object/from16 v2, p4

    .line 443
    .line 444
    check-cast v2, Ljava/lang/Integer;

    .line 445
    .line 446
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 447
    .line 448
    .line 449
    move-result v2

    .line 450
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    and-int/lit16 v0, v2, 0x81

    .line 454
    .line 455
    if-eq v0, v10, :cond_b

    .line 456
    .line 457
    move v0, v13

    .line 458
    goto :goto_7

    .line 459
    :cond_b
    move v0, v12

    .line 460
    :goto_7
    and-int/2addr v2, v13

    .line 461
    invoke-virtual {v1, v2, v0}, La/fet;->U(IZ)Z

    .line 462
    .line 463
    .line 464
    move-result v0

    .line 465
    if-eqz v0, :cond_c

    .line 466
    .line 467
    invoke-static {v12, v1, v11}, La/ntr;->S(ILa/fet;La/mm40;)V

    .line 468
    .line 469
    .line 470
    goto :goto_8

    .line 471
    :cond_c
    invoke-virtual {v1}, La/fet;->X()V

    .line 472
    .line 473
    .line 474
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 475
    .line 476
    return-object v0

    .line 477
    :pswitch_5
    move-object/from16 v0, p1

    .line 478
    .line 479
    check-cast v0, La/g9z;

    .line 480
    .line 481
    move-object/from16 v1, p2

    .line 482
    .line 483
    check-cast v1, Ljava/lang/Integer;

    .line 484
    .line 485
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 486
    .line 487
    .line 488
    move-object/from16 v1, p3

    .line 489
    .line 490
    check-cast v1, La/fet;

    .line 491
    .line 492
    move-object/from16 v2, p4

    .line 493
    .line 494
    check-cast v2, Ljava/lang/Integer;

    .line 495
    .line 496
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 497
    .line 498
    .line 499
    move-result v2

    .line 500
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 501
    .line 502
    .line 503
    and-int/lit16 v0, v2, 0x81

    .line 504
    .line 505
    if-eq v0, v10, :cond_d

    .line 506
    .line 507
    move v0, v13

    .line 508
    goto :goto_9

    .line 509
    :cond_d
    move v0, v12

    .line 510
    :goto_9
    and-int/2addr v2, v13

    .line 511
    invoke-virtual {v1, v2, v0}, La/fet;->U(IZ)Z

    .line 512
    .line 513
    .line 514
    move-result v0

    .line 515
    if-eqz v0, :cond_e

    .line 516
    .line 517
    invoke-static {v12, v1, v11}, La/gfx;->q(ILa/fet;La/mm40;)V

    .line 518
    .line 519
    .line 520
    goto :goto_a

    .line 521
    :cond_e
    invoke-virtual {v1}, La/fet;->X()V

    .line 522
    .line 523
    .line 524
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 525
    .line 526
    return-object v0

    .line 527
    :pswitch_6
    move-object/from16 v0, p1

    .line 528
    .line 529
    check-cast v0, La/g9z;

    .line 530
    .line 531
    move-object/from16 v1, p2

    .line 532
    .line 533
    check-cast v1, Ljava/lang/Integer;

    .line 534
    .line 535
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 536
    .line 537
    .line 538
    move-object/from16 v1, p3

    .line 539
    .line 540
    check-cast v1, La/fet;

    .line 541
    .line 542
    move-object/from16 v2, p4

    .line 543
    .line 544
    check-cast v2, Ljava/lang/Integer;

    .line 545
    .line 546
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 547
    .line 548
    .line 549
    move-result v2

    .line 550
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 551
    .line 552
    .line 553
    and-int/lit16 v0, v2, 0x81

    .line 554
    .line 555
    if-eq v0, v10, :cond_f

    .line 556
    .line 557
    move v0, v13

    .line 558
    goto :goto_b

    .line 559
    :cond_f
    move v0, v12

    .line 560
    :goto_b
    and-int/2addr v2, v13

    .line 561
    invoke-virtual {v1, v2, v0}, La/fet;->U(IZ)Z

    .line 562
    .line 563
    .line 564
    move-result v0

    .line 565
    if-eqz v0, :cond_10

    .line 566
    .line 567
    invoke-static {v12, v1, v11}, La/eeq;->K(ILa/fet;La/mm40;)V

    .line 568
    .line 569
    .line 570
    goto :goto_c

    .line 571
    :cond_10
    invoke-virtual {v1}, La/fet;->X()V

    .line 572
    .line 573
    .line 574
    :goto_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 575
    .line 576
    return-object v0

    .line 577
    :pswitch_7
    move-object/from16 v0, p1

    .line 578
    .line 579
    check-cast v0, La/g9z;

    .line 580
    .line 581
    move-object/from16 v1, p2

    .line 582
    .line 583
    check-cast v1, Ljava/lang/Integer;

    .line 584
    .line 585
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 586
    .line 587
    .line 588
    move-object/from16 v1, p3

    .line 589
    .line 590
    check-cast v1, La/fet;

    .line 591
    .line 592
    move-object/from16 v2, p4

    .line 593
    .line 594
    check-cast v2, Ljava/lang/Integer;

    .line 595
    .line 596
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 597
    .line 598
    .line 599
    move-result v2

    .line 600
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 601
    .line 602
    .line 603
    and-int/lit16 v0, v2, 0x81

    .line 604
    .line 605
    if-eq v0, v10, :cond_11

    .line 606
    .line 607
    move v0, v13

    .line 608
    goto :goto_d

    .line 609
    :cond_11
    move v0, v12

    .line 610
    :goto_d
    and-int/2addr v2, v13

    .line 611
    invoke-virtual {v1, v2, v0}, La/fet;->U(IZ)Z

    .line 612
    .line 613
    .line 614
    move-result v0

    .line 615
    if-eqz v0, :cond_12

    .line 616
    .line 617
    invoke-static {v12, v1, v11}, La/qjj;->I(ILa/fet;La/mm40;)V

    .line 618
    .line 619
    .line 620
    goto :goto_e

    .line 621
    :cond_12
    invoke-virtual {v1}, La/fet;->X()V

    .line 622
    .line 623
    .line 624
    :goto_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 625
    .line 626
    return-object v0

    .line 627
    :pswitch_8
    move-object/from16 v0, p1

    .line 628
    .line 629
    check-cast v0, La/g9z;

    .line 630
    .line 631
    move-object/from16 v1, p2

    .line 632
    .line 633
    check-cast v1, Ljava/lang/Integer;

    .line 634
    .line 635
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 636
    .line 637
    .line 638
    move-object/from16 v1, p3

    .line 639
    .line 640
    check-cast v1, La/fet;

    .line 641
    .line 642
    move-object/from16 v2, p4

    .line 643
    .line 644
    check-cast v2, Ljava/lang/Integer;

    .line 645
    .line 646
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 647
    .line 648
    .line 649
    move-result v2

    .line 650
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 651
    .line 652
    .line 653
    and-int/lit16 v0, v2, 0x81

    .line 654
    .line 655
    if-eq v0, v10, :cond_13

    .line 656
    .line 657
    move v0, v13

    .line 658
    goto :goto_f

    .line 659
    :cond_13
    move v0, v12

    .line 660
    :goto_f
    and-int/2addr v2, v13

    .line 661
    invoke-virtual {v1, v2, v0}, La/fet;->U(IZ)Z

    .line 662
    .line 663
    .line 664
    move-result v0

    .line 665
    if-eqz v0, :cond_14

    .line 666
    .line 667
    invoke-static {v12, v1, v11}, La/saj;->O(ILa/fet;La/mm40;)V

    .line 668
    .line 669
    .line 670
    goto :goto_10

    .line 671
    :cond_14
    invoke-virtual {v1}, La/fet;->X()V

    .line 672
    .line 673
    .line 674
    :goto_10
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 675
    .line 676
    return-object v0

    .line 677
    :pswitch_9
    move-object/from16 v0, p1

    .line 678
    .line 679
    check-cast v0, La/g9z;

    .line 680
    .line 681
    move-object/from16 v1, p2

    .line 682
    .line 683
    check-cast v1, Ljava/lang/Integer;

    .line 684
    .line 685
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 686
    .line 687
    .line 688
    move-object/from16 v1, p3

    .line 689
    .line 690
    check-cast v1, La/fet;

    .line 691
    .line 692
    move-object/from16 v2, p4

    .line 693
    .line 694
    check-cast v2, Ljava/lang/Integer;

    .line 695
    .line 696
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 697
    .line 698
    .line 699
    move-result v2

    .line 700
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 701
    .line 702
    .line 703
    and-int/lit16 v0, v2, 0x81

    .line 704
    .line 705
    if-eq v0, v10, :cond_15

    .line 706
    .line 707
    move v0, v13

    .line 708
    goto :goto_11

    .line 709
    :cond_15
    move v0, v12

    .line 710
    :goto_11
    and-int/2addr v2, v13

    .line 711
    invoke-virtual {v1, v2, v0}, La/fet;->U(IZ)Z

    .line 712
    .line 713
    .line 714
    move-result v0

    .line 715
    if-eqz v0, :cond_16

    .line 716
    .line 717
    invoke-static {v12, v1, v11}, La/x8f;->Q(ILa/fet;La/mm40;)V

    .line 718
    .line 719
    .line 720
    goto :goto_12

    .line 721
    :cond_16
    invoke-virtual {v1}, La/fet;->X()V

    .line 722
    .line 723
    .line 724
    :goto_12
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 725
    .line 726
    return-object v0

    .line 727
    :pswitch_a
    move-object/from16 v0, p1

    .line 728
    .line 729
    check-cast v0, La/g9z;

    .line 730
    .line 731
    move-object/from16 v1, p2

    .line 732
    .line 733
    check-cast v1, Ljava/lang/Integer;

    .line 734
    .line 735
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 736
    .line 737
    .line 738
    move-object/from16 v1, p3

    .line 739
    .line 740
    check-cast v1, La/fet;

    .line 741
    .line 742
    move-object/from16 v2, p4

    .line 743
    .line 744
    check-cast v2, Ljava/lang/Integer;

    .line 745
    .line 746
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 747
    .line 748
    .line 749
    move-result v2

    .line 750
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 751
    .line 752
    .line 753
    and-int/lit16 v0, v2, 0x81

    .line 754
    .line 755
    if-eq v0, v10, :cond_17

    .line 756
    .line 757
    move v0, v13

    .line 758
    goto :goto_13

    .line 759
    :cond_17
    move v0, v12

    .line 760
    :goto_13
    and-int/2addr v2, v13

    .line 761
    invoke-virtual {v1, v2, v0}, La/fet;->U(IZ)Z

    .line 762
    .line 763
    .line 764
    move-result v0

    .line 765
    if-eqz v0, :cond_18

    .line 766
    .line 767
    invoke-static {v12, v1, v11}, La/tke;->K(ILa/fet;La/mm40;)V

    .line 768
    .line 769
    .line 770
    goto :goto_14

    .line 771
    :cond_18
    invoke-virtual {v1}, La/fet;->X()V

    .line 772
    .line 773
    .line 774
    :goto_14
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 775
    .line 776
    return-object v0

    .line 777
    :pswitch_b
    move-object/from16 v0, p1

    .line 778
    .line 779
    check-cast v0, La/g9z;

    .line 780
    .line 781
    move-object/from16 v1, p2

    .line 782
    .line 783
    check-cast v1, Ljava/lang/Integer;

    .line 784
    .line 785
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 786
    .line 787
    .line 788
    move-object/from16 v1, p3

    .line 789
    .line 790
    check-cast v1, La/fet;

    .line 791
    .line 792
    move-object/from16 v2, p4

    .line 793
    .line 794
    check-cast v2, Ljava/lang/Integer;

    .line 795
    .line 796
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 797
    .line 798
    .line 799
    move-result v2

    .line 800
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 801
    .line 802
    .line 803
    and-int/lit16 v0, v2, 0x81

    .line 804
    .line 805
    if-eq v0, v10, :cond_19

    .line 806
    .line 807
    move v0, v13

    .line 808
    goto :goto_15

    .line 809
    :cond_19
    move v0, v12

    .line 810
    :goto_15
    and-int/2addr v2, v13

    .line 811
    invoke-virtual {v1, v2, v0}, La/fet;->U(IZ)Z

    .line 812
    .line 813
    .line 814
    move-result v0

    .line 815
    if-eqz v0, :cond_1a

    .line 816
    .line 817
    invoke-static {v12, v1, v11}, La/jd8;->P(ILa/fet;La/mm40;)V

    .line 818
    .line 819
    .line 820
    goto :goto_16

    .line 821
    :cond_1a
    invoke-virtual {v1}, La/fet;->X()V

    .line 822
    .line 823
    .line 824
    :goto_16
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 825
    .line 826
    return-object v0

    .line 827
    :pswitch_c
    move-object/from16 v0, p1

    .line 828
    .line 829
    check-cast v0, La/g9z;

    .line 830
    .line 831
    move-object/from16 v1, p2

    .line 832
    .line 833
    check-cast v1, Ljava/lang/Integer;

    .line 834
    .line 835
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 836
    .line 837
    .line 838
    move-object/from16 v1, p3

    .line 839
    .line 840
    check-cast v1, La/fet;

    .line 841
    .line 842
    move-object/from16 v2, p4

    .line 843
    .line 844
    check-cast v2, Ljava/lang/Integer;

    .line 845
    .line 846
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 847
    .line 848
    .line 849
    move-result v2

    .line 850
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 851
    .line 852
    .line 853
    and-int/lit16 v0, v2, 0x81

    .line 854
    .line 855
    if-eq v0, v10, :cond_1b

    .line 856
    .line 857
    move v0, v13

    .line 858
    goto :goto_17

    .line 859
    :cond_1b
    move v0, v12

    .line 860
    :goto_17
    and-int/2addr v2, v13

    .line 861
    invoke-virtual {v1, v2, v0}, La/fet;->U(IZ)Z

    .line 862
    .line 863
    .line 864
    move-result v0

    .line 865
    if-eqz v0, :cond_1c

    .line 866
    .line 867
    invoke-static {v12, v1, v11}, La/j47;->j0(ILa/fet;La/mm40;)V

    .line 868
    .line 869
    .line 870
    goto :goto_18

    .line 871
    :cond_1c
    invoke-virtual {v1}, La/fet;->X()V

    .line 872
    .line 873
    .line 874
    :goto_18
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 875
    .line 876
    return-object v0

    .line 877
    :pswitch_d
    move-object/from16 v0, p1

    .line 878
    .line 879
    check-cast v0, La/g9z;

    .line 880
    .line 881
    move-object/from16 v1, p2

    .line 882
    .line 883
    check-cast v1, Ljava/lang/Integer;

    .line 884
    .line 885
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 886
    .line 887
    .line 888
    move-object/from16 v1, p3

    .line 889
    .line 890
    check-cast v1, La/fet;

    .line 891
    .line 892
    move-object/from16 v2, p4

    .line 893
    .line 894
    check-cast v2, Ljava/lang/Integer;

    .line 895
    .line 896
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 897
    .line 898
    .line 899
    move-result v2

    .line 900
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 901
    .line 902
    .line 903
    and-int/lit16 v0, v2, 0x81

    .line 904
    .line 905
    if-eq v0, v10, :cond_1d

    .line 906
    .line 907
    move v0, v13

    .line 908
    goto :goto_19

    .line 909
    :cond_1d
    move v0, v12

    .line 910
    :goto_19
    and-int/2addr v2, v13

    .line 911
    invoke-virtual {v1, v2, v0}, La/fet;->U(IZ)Z

    .line 912
    .line 913
    .line 914
    move-result v0

    .line 915
    if-eqz v0, :cond_1e

    .line 916
    .line 917
    invoke-static {v12, v1, v11}, La/kc5;->w0(ILa/fet;La/mm40;)V

    .line 918
    .line 919
    .line 920
    goto :goto_1a

    .line 921
    :cond_1e
    invoke-virtual {v1}, La/fet;->X()V

    .line 922
    .line 923
    .line 924
    :goto_1a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 925
    .line 926
    return-object v0

    .line 927
    :pswitch_e
    move-object/from16 v0, p1

    .line 928
    .line 929
    check-cast v0, La/g9z;

    .line 930
    .line 931
    move-object/from16 v10, p2

    .line 932
    .line 933
    check-cast v10, Ljava/lang/Integer;

    .line 934
    .line 935
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 936
    .line 937
    .line 938
    move-result v10

    .line 939
    move-object/from16 v14, p3

    .line 940
    .line 941
    check-cast v14, La/fet;

    .line 942
    .line 943
    move-object/from16 v15, p4

    .line 944
    .line 945
    check-cast v15, Ljava/lang/Integer;

    .line 946
    .line 947
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 948
    .line 949
    .line 950
    move-result v15

    .line 951
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 952
    .line 953
    .line 954
    and-int/lit8 v0, v15, 0x30

    .line 955
    .line 956
    if-nez v0, :cond_20

    .line 957
    .line 958
    invoke-virtual {v14, v10}, La/fet;->e(I)Z

    .line 959
    .line 960
    .line 961
    move-result v0

    .line 962
    if-eqz v0, :cond_1f

    .line 963
    .line 964
    move v6, v7

    .line 965
    :cond_1f
    or-int/2addr v15, v6

    .line 966
    :cond_20
    and-int/lit16 v0, v15, 0x91

    .line 967
    .line 968
    if-eq v0, v4, :cond_21

    .line 969
    .line 970
    move v0, v13

    .line 971
    goto :goto_1b

    .line 972
    :cond_21
    move v0, v12

    .line 973
    :goto_1b
    and-int/lit8 v4, v15, 0x1

    .line 974
    .line 975
    invoke-virtual {v14, v4, v0}, La/fet;->U(IZ)Z

    .line 976
    .line 977
    .line 978
    move-result v0

    .line 979
    if-eqz v0, :cond_25

    .line 980
    .line 981
    if-eqz v10, :cond_24

    .line 982
    .line 983
    sget-object v15, La/jm40;->b:La/jm40;

    .line 984
    .line 985
    if-eq v10, v13, :cond_23

    .line 986
    .line 987
    if-eq v10, v8, :cond_22

    .line 988
    .line 989
    const v0, 0x10796df

    .line 990
    .line 991
    .line 992
    invoke-virtual {v14, v0}, La/fet;->e0(I)V

    .line 993
    .line 994
    .line 995
    sget-object v0, La/qmk;->a:La/zcl;

    .line 996
    .line 997
    invoke-static {v14}, La/xfn;->a(La/fet;)La/wfn;

    .line 998
    .line 999
    .line 1000
    move-result-object v0

    .line 1001
    iget v0, v0, La/wfn;->e:F

    .line 1002
    .line 1003
    invoke-static {v14}, La/xfn;->a(La/fet;)La/wfn;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v1

    .line 1007
    iget v1, v1, La/wfn;->e:F

    .line 1008
    .line 1009
    const/16 v17, 0x0

    .line 1010
    .line 1011
    const/16 v20, 0x2

    .line 1012
    .line 1013
    const/high16 v19, 0x41800000    # 16.0f

    .line 1014
    .line 1015
    move/from16 v16, v0

    .line 1016
    .line 1017
    move/from16 v18, v1

    .line 1018
    .line 1019
    invoke-static/range {v15 .. v20}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v0

    .line 1023
    invoke-static {v0, v3}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v0

    .line 1027
    invoke-static {v0, v9}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v0

    .line 1031
    invoke-static {v5}, La/vgg0;->a(F)La/ugg0;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v1

    .line 1035
    invoke-static {v0, v1}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v0

    .line 1039
    invoke-static {v11, v14, v12, v13}, La/vbc;->d0(La/vqm;La/fet;II)La/fqj0;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v1

    .line 1043
    :goto_1c
    invoke-static {v0, v1, v14, v12, v12}, La/dw9;->x(La/mm40;La/fqj0;La/fet;IZ)V

    .line 1044
    .line 1045
    .line 1046
    goto/16 :goto_1d

    .line 1047
    .line 1048
    :cond_22
    const v0, 0xfd7e5e

    .line 1049
    .line 1050
    .line 1051
    invoke-virtual {v14, v0}, La/fet;->e0(I)V

    .line 1052
    .line 1053
    .line 1054
    sget-object v0, La/qmk;->a:La/zcl;

    .line 1055
    .line 1056
    invoke-static {v14}, La/xfn;->a(La/fet;)La/wfn;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v0

    .line 1060
    iget v0, v0, La/wfn;->e:F

    .line 1061
    .line 1062
    invoke-static {v14}, La/xfn;->a(La/fet;)La/wfn;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v1

    .line 1066
    iget v1, v1, La/wfn;->e:F

    .line 1067
    .line 1068
    const/16 v17, 0x0

    .line 1069
    .line 1070
    const/16 v20, 0x2

    .line 1071
    .line 1072
    const/high16 v19, 0x41800000    # 16.0f

    .line 1073
    .line 1074
    move/from16 v16, v0

    .line 1075
    .line 1076
    move/from16 v18, v1

    .line 1077
    .line 1078
    invoke-static/range {v15 .. v20}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v0

    .line 1082
    invoke-static {v0, v2}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v0

    .line 1086
    invoke-static {v0, v9}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v0

    .line 1090
    invoke-static {v5}, La/vgg0;->a(F)La/ugg0;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v1

    .line 1094
    invoke-static {v0, v1}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v0

    .line 1098
    invoke-static {v11, v14, v12, v13}, La/vbc;->d0(La/vqm;La/fet;II)La/fqj0;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v1

    .line 1102
    goto :goto_1c

    .line 1103
    :cond_23
    const v0, 0xf3715e

    .line 1104
    .line 1105
    .line 1106
    invoke-virtual {v14, v0}, La/fet;->e0(I)V

    .line 1107
    .line 1108
    .line 1109
    sget-object v0, La/qmk;->a:La/zcl;

    .line 1110
    .line 1111
    invoke-static {v14}, La/xfn;->a(La/fet;)La/wfn;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v0

    .line 1115
    iget v0, v0, La/wfn;->e:F

    .line 1116
    .line 1117
    invoke-static {v14}, La/xfn;->a(La/fet;)La/wfn;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v2

    .line 1121
    iget v2, v2, La/wfn;->e:F

    .line 1122
    .line 1123
    const/16 v17, 0x0

    .line 1124
    .line 1125
    const/16 v20, 0x2

    .line 1126
    .line 1127
    const/high16 v19, 0x41800000    # 16.0f

    .line 1128
    .line 1129
    move/from16 v16, v0

    .line 1130
    .line 1131
    move/from16 v18, v2

    .line 1132
    .line 1133
    invoke-static/range {v15 .. v20}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v0

    .line 1137
    invoke-static {v0, v1}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v0

    .line 1141
    invoke-static {v0, v9}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v0

    .line 1145
    invoke-static {v5}, La/vgg0;->a(F)La/ugg0;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v1

    .line 1149
    invoke-static {v0, v1}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v0

    .line 1153
    invoke-static {v11, v14, v12, v13}, La/vbc;->d0(La/vqm;La/fet;II)La/fqj0;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v1

    .line 1157
    goto :goto_1c

    .line 1158
    :cond_24
    const v0, 0xf203aa

    .line 1159
    .line 1160
    .line 1161
    invoke-virtual {v14, v0}, La/fet;->e0(I)V

    .line 1162
    .line 1163
    .line 1164
    invoke-static {v12, v14}, La/s0x;->v(ILa/fet;)V

    .line 1165
    .line 1166
    .line 1167
    invoke-virtual {v14, v12}, La/fet;->r(Z)V

    .line 1168
    .line 1169
    .line 1170
    goto :goto_1d

    .line 1171
    :cond_25
    invoke-virtual {v14}, La/fet;->X()V

    .line 1172
    .line 1173
    .line 1174
    :goto_1d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1175
    .line 1176
    return-object v0

    .line 1177
    :pswitch_f
    move-object/from16 v0, p1

    .line 1178
    .line 1179
    check-cast v0, La/g9z;

    .line 1180
    .line 1181
    move-object/from16 v1, p2

    .line 1182
    .line 1183
    check-cast v1, Ljava/lang/Integer;

    .line 1184
    .line 1185
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1186
    .line 1187
    .line 1188
    move-object/from16 v1, p3

    .line 1189
    .line 1190
    check-cast v1, La/fet;

    .line 1191
    .line 1192
    move-object/from16 v2, p4

    .line 1193
    .line 1194
    check-cast v2, Ljava/lang/Integer;

    .line 1195
    .line 1196
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1197
    .line 1198
    .line 1199
    move-result v2

    .line 1200
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1201
    .line 1202
    .line 1203
    and-int/lit16 v0, v2, 0x81

    .line 1204
    .line 1205
    if-eq v0, v10, :cond_26

    .line 1206
    .line 1207
    move v0, v13

    .line 1208
    goto :goto_1e

    .line 1209
    :cond_26
    move v0, v12

    .line 1210
    :goto_1e
    and-int/2addr v2, v13

    .line 1211
    invoke-virtual {v1, v2, v0}, La/fet;->U(IZ)Z

    .line 1212
    .line 1213
    .line 1214
    move-result v0

    .line 1215
    if-eqz v0, :cond_27

    .line 1216
    .line 1217
    invoke-static {v12, v1, v11}, La/q0x;->x(ILa/fet;La/mm40;)V

    .line 1218
    .line 1219
    .line 1220
    goto :goto_1f

    .line 1221
    :cond_27
    invoke-virtual {v1}, La/fet;->X()V

    .line 1222
    .line 1223
    .line 1224
    :goto_1f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1225
    .line 1226
    return-object v0

    .line 1227
    :pswitch_10
    move-object/from16 v0, p1

    .line 1228
    .line 1229
    check-cast v0, La/g9z;

    .line 1230
    .line 1231
    move-object/from16 v10, p2

    .line 1232
    .line 1233
    check-cast v10, Ljava/lang/Integer;

    .line 1234
    .line 1235
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 1236
    .line 1237
    .line 1238
    move-result v10

    .line 1239
    move-object/from16 v14, p3

    .line 1240
    .line 1241
    check-cast v14, La/fet;

    .line 1242
    .line 1243
    move-object/from16 v15, p4

    .line 1244
    .line 1245
    check-cast v15, Ljava/lang/Integer;

    .line 1246
    .line 1247
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 1248
    .line 1249
    .line 1250
    move-result v15

    .line 1251
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1252
    .line 1253
    .line 1254
    and-int/lit8 v0, v15, 0x30

    .line 1255
    .line 1256
    if-nez v0, :cond_29

    .line 1257
    .line 1258
    invoke-virtual {v14, v10}, La/fet;->e(I)Z

    .line 1259
    .line 1260
    .line 1261
    move-result v0

    .line 1262
    if-eqz v0, :cond_28

    .line 1263
    .line 1264
    move v6, v7

    .line 1265
    :cond_28
    or-int/2addr v15, v6

    .line 1266
    :cond_29
    and-int/lit16 v0, v15, 0x91

    .line 1267
    .line 1268
    if-eq v0, v4, :cond_2a

    .line 1269
    .line 1270
    move v0, v13

    .line 1271
    goto :goto_20

    .line 1272
    :cond_2a
    move v0, v12

    .line 1273
    :goto_20
    and-int/lit8 v4, v15, 0x1

    .line 1274
    .line 1275
    invoke-virtual {v14, v4, v0}, La/fet;->U(IZ)Z

    .line 1276
    .line 1277
    .line 1278
    move-result v0

    .line 1279
    if-eqz v0, :cond_2f

    .line 1280
    .line 1281
    sget-object v15, La/jm40;->b:La/jm40;

    .line 1282
    .line 1283
    if-eqz v10, :cond_2d

    .line 1284
    .line 1285
    if-eq v10, v13, :cond_2c

    .line 1286
    .line 1287
    if-eq v10, v8, :cond_2b

    .line 1288
    .line 1289
    const v0, 0x4bc55cdc    # 2.5868728E7f

    .line 1290
    .line 1291
    .line 1292
    invoke-virtual {v14, v0}, La/fet;->e0(I)V

    .line 1293
    .line 1294
    .line 1295
    sget-object v0, La/qmk;->a:La/zcl;

    .line 1296
    .line 1297
    invoke-static {v14}, La/xfn;->a(La/fet;)La/wfn;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v0

    .line 1301
    iget v0, v0, La/wfn;->e:F

    .line 1302
    .line 1303
    invoke-static {v14}, La/xfn;->a(La/fet;)La/wfn;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v1

    .line 1307
    iget v1, v1, La/wfn;->e:F

    .line 1308
    .line 1309
    const/16 v17, 0x0

    .line 1310
    .line 1311
    const/16 v20, 0x2

    .line 1312
    .line 1313
    const/high16 v19, 0x41800000    # 16.0f

    .line 1314
    .line 1315
    move/from16 v16, v0

    .line 1316
    .line 1317
    move/from16 v18, v1

    .line 1318
    .line 1319
    invoke-static/range {v15 .. v20}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v0

    .line 1323
    invoke-static {v0, v3}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v0

    .line 1327
    invoke-static {v0, v9}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v0

    .line 1331
    invoke-static {v5}, La/vgg0;->a(F)La/ugg0;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v1

    .line 1335
    invoke-static {v0, v1}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v0

    .line 1339
    invoke-static {v11, v14, v12, v13}, La/vbc;->d0(La/vqm;La/fet;II)La/fqj0;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v1

    .line 1343
    :goto_21
    invoke-static {v0, v1, v14, v12, v12}, La/dw9;->x(La/mm40;La/fqj0;La/fet;IZ)V

    .line 1344
    .line 1345
    .line 1346
    goto/16 :goto_22

    .line 1347
    .line 1348
    :cond_2b
    const v0, 0x4bbb95bb    # 2.4587126E7f

    .line 1349
    .line 1350
    .line 1351
    invoke-virtual {v14, v0}, La/fet;->e0(I)V

    .line 1352
    .line 1353
    .line 1354
    sget-object v0, La/qmk;->a:La/zcl;

    .line 1355
    .line 1356
    invoke-static {v14}, La/xfn;->a(La/fet;)La/wfn;

    .line 1357
    .line 1358
    .line 1359
    move-result-object v0

    .line 1360
    iget v0, v0, La/wfn;->e:F

    .line 1361
    .line 1362
    invoke-static {v14}, La/xfn;->a(La/fet;)La/wfn;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v1

    .line 1366
    iget v1, v1, La/wfn;->e:F

    .line 1367
    .line 1368
    const/16 v17, 0x0

    .line 1369
    .line 1370
    const/16 v20, 0x2

    .line 1371
    .line 1372
    const/high16 v19, 0x41800000    # 16.0f

    .line 1373
    .line 1374
    move/from16 v16, v0

    .line 1375
    .line 1376
    move/from16 v18, v1

    .line 1377
    .line 1378
    invoke-static/range {v15 .. v20}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v0

    .line 1382
    invoke-static {v0, v2}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 1383
    .line 1384
    .line 1385
    move-result-object v0

    .line 1386
    invoke-static {v0, v9}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v0

    .line 1390
    invoke-static {v5}, La/vgg0;->a(F)La/ugg0;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v1

    .line 1394
    invoke-static {v0, v1}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v0

    .line 1398
    invoke-static {v11, v14, v12, v13}, La/vbc;->d0(La/vqm;La/fet;II)La/fqj0;

    .line 1399
    .line 1400
    .line 1401
    move-result-object v1

    .line 1402
    goto :goto_21

    .line 1403
    :cond_2c
    const v0, 0x4bb1da1b    # 2.3311414E7f

    .line 1404
    .line 1405
    .line 1406
    invoke-virtual {v14, v0}, La/fet;->e0(I)V

    .line 1407
    .line 1408
    .line 1409
    sget-object v0, La/qmk;->a:La/zcl;

    .line 1410
    .line 1411
    invoke-static {v14}, La/xfn;->a(La/fet;)La/wfn;

    .line 1412
    .line 1413
    .line 1414
    move-result-object v0

    .line 1415
    iget v0, v0, La/wfn;->e:F

    .line 1416
    .line 1417
    invoke-static {v14}, La/xfn;->a(La/fet;)La/wfn;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v2

    .line 1421
    iget v2, v2, La/wfn;->e:F

    .line 1422
    .line 1423
    const/16 v17, 0x0

    .line 1424
    .line 1425
    const/16 v20, 0x2

    .line 1426
    .line 1427
    const/high16 v19, 0x41800000    # 16.0f

    .line 1428
    .line 1429
    move/from16 v16, v0

    .line 1430
    .line 1431
    move/from16 v18, v2

    .line 1432
    .line 1433
    invoke-static/range {v15 .. v20}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1434
    .line 1435
    .line 1436
    move-result-object v0

    .line 1437
    invoke-static {v0, v1}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v0

    .line 1441
    invoke-static {v0, v9}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 1442
    .line 1443
    .line 1444
    move-result-object v0

    .line 1445
    invoke-static {v5}, La/vgg0;->a(F)La/ugg0;

    .line 1446
    .line 1447
    .line 1448
    move-result-object v1

    .line 1449
    invoke-static {v0, v1}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 1450
    .line 1451
    .line 1452
    move-result-object v0

    .line 1453
    invoke-static {v11, v14, v12, v13}, La/vbc;->d0(La/vqm;La/fet;II)La/fqj0;

    .line 1454
    .line 1455
    .line 1456
    move-result-object v1

    .line 1457
    goto :goto_21

    .line 1458
    :cond_2d
    const v0, 0x4ba480d7    # 2.1561774E7f

    .line 1459
    .line 1460
    .line 1461
    invoke-virtual {v14, v0}, La/fet;->e0(I)V

    .line 1462
    .line 1463
    .line 1464
    sget-object v0, La/qmk;->a:La/zcl;

    .line 1465
    .line 1466
    invoke-static {v14}, La/xfn;->a(La/fet;)La/wfn;

    .line 1467
    .line 1468
    .line 1469
    move-result-object v0

    .line 1470
    iget v0, v0, La/wfn;->e:F

    .line 1471
    .line 1472
    const/16 v18, 0x0

    .line 1473
    .line 1474
    const/16 v20, 0x4

    .line 1475
    .line 1476
    const/high16 v17, 0x41000000    # 8.0f

    .line 1477
    .line 1478
    const/high16 v19, 0x41000000    # 8.0f

    .line 1479
    .line 1480
    move/from16 v16, v0

    .line 1481
    .line 1482
    invoke-static/range {v15 .. v20}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1483
    .line 1484
    .line 1485
    move-result-object v0

    .line 1486
    new-instance v1, La/qw3;

    .line 1487
    .line 1488
    new-instance v2, La/jf4;

    .line 1489
    .line 1490
    const/16 v3, 0xe

    .line 1491
    .line 1492
    invoke-direct {v2, v3}, La/jf4;-><init>(B)V

    .line 1493
    .line 1494
    .line 1495
    const/high16 v3, 0x41000000    # 8.0f

    .line 1496
    .line 1497
    invoke-direct {v1, v3, v13, v2}, La/qw3;-><init>(FZLa/rw3;)V

    .line 1498
    .line 1499
    .line 1500
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 1501
    .line 1502
    .line 1503
    move-result-object v2

    .line 1504
    sget-object v3, La/ukd;->a:La/cl5;

    .line 1505
    .line 1506
    if-ne v2, v3, :cond_2e

    .line 1507
    .line 1508
    new-instance v2, La/y2d;

    .line 1509
    .line 1510
    const/16 v3, 0xa

    .line 1511
    .line 1512
    invoke-direct {v2, v3}, La/y2d;-><init>(B)V

    .line 1513
    .line 1514
    .line 1515
    invoke-virtual {v14, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1516
    .line 1517
    .line 1518
    :cond_2e
    move-object/from16 v23, v2

    .line 1519
    .line 1520
    check-cast v23, Lkotlin/jvm/functions/Function1;

    .line 1521
    .line 1522
    const/high16 v25, 0x30c00000

    .line 1523
    .line 1524
    const/16 v26, 0x16e

    .line 1525
    .line 1526
    const/4 v15, 0x0

    .line 1527
    const/16 v16, 0x0

    .line 1528
    .line 1529
    const/16 v17, 0x0

    .line 1530
    .line 1531
    const/16 v19, 0x0

    .line 1532
    .line 1533
    const/16 v20, 0x0

    .line 1534
    .line 1535
    const/16 v21, 0x0

    .line 1536
    .line 1537
    const/16 v22, 0x0

    .line 1538
    .line 1539
    move-object/from16 v18, v1

    .line 1540
    .line 1541
    move-object/from16 v24, v14

    .line 1542
    .line 1543
    move-object v14, v0

    .line 1544
    invoke-static/range {v14 .. v26}, La/b8k0;->f(La/mm40;La/xcz;La/hh80;ZLa/ow3;La/yx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 1545
    .line 1546
    .line 1547
    move-object/from16 v0, v24

    .line 1548
    .line 1549
    invoke-virtual {v0, v12}, La/fet;->r(Z)V

    .line 1550
    .line 1551
    .line 1552
    goto :goto_22

    .line 1553
    :cond_2f
    move-object v0, v14

    .line 1554
    invoke-virtual {v0}, La/fet;->X()V

    .line 1555
    .line 1556
    .line 1557
    :goto_22
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1558
    .line 1559
    return-object v0

    .line 1560
    nop

    .line 1561
    :pswitch_data_0
    .packed-switch 0x0
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
