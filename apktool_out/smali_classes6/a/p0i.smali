.class public final La/p0i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:F

.field public final synthetic d:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;FLkotlin/jvm/functions/Function2;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/p0i;->a:B

    iput-object p1, p0, La/p0i;->b:Ljava/util/List;

    iput p2, p0, La/p0i;->c:F

    iput-object p3, p0, La/p0i;->d:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/p0i;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/high16 v3, 0x43c80000    # 400.0f

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const v5, 0x3f666666    # 0.9f

    .line 11
    .line 12
    .line 13
    iget v6, v0, La/p0i;->c:F

    .line 14
    .line 15
    sget-object v7, La/jm40;->b:La/jm40;

    .line 16
    .line 17
    iget-object v8, v0, La/p0i;->d:Lkotlin/jvm/functions/Function2;

    .line 18
    .line 19
    iget-object v9, v0, La/p0i;->b:Ljava/util/List;

    .line 20
    .line 21
    const/16 v10, 0x92

    .line 22
    .line 23
    const/4 v13, 0x2

    .line 24
    const/4 v14, 0x4

    .line 25
    const/4 v15, 0x0

    .line 26
    const/4 v11, 0x1

    .line 27
    packed-switch v1, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    move-object/from16 v0, p1

    .line 31
    .line 32
    check-cast v0, La/g9z;

    .line 33
    .line 34
    move-object/from16 v1, p2

    .line 35
    .line 36
    check-cast v1, Ljava/lang/Number;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    move-object/from16 v12, p3

    .line 43
    .line 44
    check-cast v12, La/fet;

    .line 45
    .line 46
    move-object/from16 v18, p4

    .line 47
    .line 48
    check-cast v18, Ljava/lang/Number;

    .line 49
    .line 50
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Number;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result v18

    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    and-int/lit8 v19, v18, 0x6

    .line 58
    .line 59
    if-nez v19, :cond_1

    .line 60
    .line 61
    invoke-virtual {v12, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_0

    .line 66
    .line 67
    move v13, v14

    .line 68
    :cond_0
    or-int v0, v18, v13

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    move/from16 v0, v18

    .line 72
    .line 73
    :goto_0
    and-int/lit8 v13, v18, 0x30

    .line 74
    .line 75
    if-nez v13, :cond_3

    .line 76
    .line 77
    invoke-virtual {v12, v1}, La/fet;->e(I)Z

    .line 78
    .line 79
    .line 80
    move-result v13

    .line 81
    if-eqz v13, :cond_2

    .line 82
    .line 83
    const/16 v16, 0x20

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    const/16 v16, 0x10

    .line 87
    .line 88
    :goto_1
    or-int v0, v0, v16

    .line 89
    .line 90
    :cond_3
    and-int/lit16 v13, v0, 0x93

    .line 91
    .line 92
    if-eq v13, v10, :cond_4

    .line 93
    .line 94
    move v10, v11

    .line 95
    goto :goto_2

    .line 96
    :cond_4
    move v10, v15

    .line 97
    :goto_2
    and-int/2addr v0, v11

    .line 98
    invoke-virtual {v12, v0, v10}, La/fet;->U(IZ)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_7

    .line 103
    .line 104
    invoke-interface {v9, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    check-cast v0, La/kvl0;

    .line 109
    .line 110
    const v1, -0xeff00b

    .line 111
    .line 112
    .line 113
    invoke-virtual {v12, v1}, La/fet;->e0(I)V

    .line 114
    .line 115
    .line 116
    const-string v1, "STADIUMS_CELL"

    .line 117
    .line 118
    invoke-static {v7, v1}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    mul-float/2addr v6, v5

    .line 123
    invoke-static {v1, v6}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    sget-object v5, La/qmk;->a:La/zcl;

    .line 128
    .line 129
    invoke-static {v1, v4, v3, v11}, La/o7k0;->u(La/mm40;FFI)La/mm40;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    const/high16 v3, 0x43280000    # 168.0f

    .line 134
    .line 135
    invoke-static {v1, v3}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    sget-object v3, La/s6t0;->a:La/pz40;

    .line 140
    .line 141
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    iget-object v3, v3, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 146
    .line 147
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 148
    .line 149
    .line 150
    move-result-wide v3

    .line 151
    const/high16 v5, 0x41800000    # 16.0f

    .line 152
    .line 153
    invoke-static {v5}, La/vgg0;->a(F)La/ugg0;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    invoke-static {v1, v3, v4, v5}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 158
    .line 159
    .line 160
    move-result-object v16

    .line 161
    invoke-virtual {v12, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    invoke-virtual {v12, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    or-int/2addr v1, v3

    .line 170
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    if-nez v1, :cond_5

    .line 175
    .line 176
    if-ne v3, v2, :cond_6

    .line 177
    .line 178
    :cond_5
    new-instance v3, La/sue0;

    .line 179
    .line 180
    const/16 v1, 0x1a

    .line 181
    .line 182
    invoke-direct {v3, v8, v0, v1}, La/sue0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v12, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    :cond_6
    move-object/from16 v21, v3

    .line 189
    .line 190
    check-cast v21, Lkotlin/jvm/functions/Function0;

    .line 191
    .line 192
    const/16 v22, 0x1c

    .line 193
    .line 194
    const/16 v17, 0x0

    .line 195
    .line 196
    const/16 v18, 0x0

    .line 197
    .line 198
    const/16 v19, 0x0

    .line 199
    .line 200
    const/16 v20, 0x0

    .line 201
    .line 202
    invoke-static/range {v16 .. v22}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    invoke-static {v1, v0, v12, v15}, La/x0x;->p(La/mm40;La/kvl0;La/fet;I)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v12, v15}, La/fet;->r(Z)V

    .line 210
    .line 211
    .line 212
    goto :goto_3

    .line 213
    :cond_7
    invoke-virtual {v12}, La/fet;->X()V

    .line 214
    .line 215
    .line 216
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 217
    .line 218
    return-object v0

    .line 219
    :pswitch_0
    move-object/from16 v0, p1

    .line 220
    .line 221
    check-cast v0, La/g9z;

    .line 222
    .line 223
    move-object/from16 v1, p2

    .line 224
    .line 225
    check-cast v1, Ljava/lang/Number;

    .line 226
    .line 227
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 228
    .line 229
    .line 230
    move-result v1

    .line 231
    move-object/from16 v12, p3

    .line 232
    .line 233
    check-cast v12, La/fet;

    .line 234
    .line 235
    move-object/from16 v18, p4

    .line 236
    .line 237
    check-cast v18, Ljava/lang/Number;

    .line 238
    .line 239
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Number;->intValue()I

    .line 240
    .line 241
    .line 242
    move-result v18

    .line 243
    and-int/lit8 v19, v18, 0x6

    .line 244
    .line 245
    if-nez v19, :cond_9

    .line 246
    .line 247
    invoke-virtual {v12, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v19

    .line 251
    if-eqz v19, :cond_8

    .line 252
    .line 253
    move v13, v14

    .line 254
    :cond_8
    or-int v13, v18, v13

    .line 255
    .line 256
    goto :goto_4

    .line 257
    :cond_9
    move/from16 v13, v18

    .line 258
    .line 259
    :goto_4
    and-int/lit8 v14, v18, 0x30

    .line 260
    .line 261
    if-nez v14, :cond_b

    .line 262
    .line 263
    invoke-virtual {v12, v1}, La/fet;->e(I)Z

    .line 264
    .line 265
    .line 266
    move-result v14

    .line 267
    if-eqz v14, :cond_a

    .line 268
    .line 269
    const/16 v16, 0x20

    .line 270
    .line 271
    goto :goto_5

    .line 272
    :cond_a
    const/16 v16, 0x10

    .line 273
    .line 274
    :goto_5
    or-int v13, v13, v16

    .line 275
    .line 276
    :cond_b
    and-int/lit16 v14, v13, 0x93

    .line 277
    .line 278
    if-eq v14, v10, :cond_c

    .line 279
    .line 280
    move v10, v11

    .line 281
    goto :goto_6

    .line 282
    :cond_c
    move v10, v15

    .line 283
    :goto_6
    and-int/2addr v13, v11

    .line 284
    invoke-virtual {v12, v13, v10}, La/fet;->U(IZ)Z

    .line 285
    .line 286
    .line 287
    move-result v10

    .line 288
    if-eqz v10, :cond_13

    .line 289
    .line 290
    invoke-interface {v9, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    check-cast v1, La/a4x;

    .line 295
    .line 296
    const v9, -0x33011010

    .line 297
    .line 298
    .line 299
    invoke-virtual {v12, v9}, La/fet;->e0(I)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v0, v5}, La/g9z;->d(F)La/mm40;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    sget-object v5, La/qmk;->a:La/zcl;

    .line 307
    .line 308
    invoke-static {v0, v4, v3, v11}, La/o7k0;->u(La/mm40;FFI)La/mm40;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    new-instance v3, La/qw3;

    .line 313
    .line 314
    new-instance v4, La/jf4;

    .line 315
    .line 316
    const/16 v5, 0xe

    .line 317
    .line 318
    invoke-direct {v4, v5}, La/jf4;-><init>(B)V

    .line 319
    .line 320
    .line 321
    const/high16 v5, 0x40800000    # 4.0f

    .line 322
    .line 323
    invoke-direct {v3, v5, v11, v4}, La/qw3;-><init>(FZLa/rw3;)V

    .line 324
    .line 325
    .line 326
    sget-object v4, La/gqw0;->m:La/xx7;

    .line 327
    .line 328
    invoke-static {v3, v4, v12, v15}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 329
    .line 330
    .line 331
    move-result-object v3

    .line 332
    iget-wide v4, v12, La/fet;->T:J

    .line 333
    .line 334
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 335
    .line 336
    .line 337
    move-result v4

    .line 338
    invoke-virtual {v12}, La/fet;->m()La/bh90;

    .line 339
    .line 340
    .line 341
    move-result-object v5

    .line 342
    invoke-static {v12, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    sget-object v9, La/mkd;->c0:La/gqw0;

    .line 347
    .line 348
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v12}, La/fet;->i0()V

    .line 352
    .line 353
    .line 354
    iget-boolean v9, v12, La/fet;->S:Z

    .line 355
    .line 356
    if-eqz v9, :cond_d

    .line 357
    .line 358
    sget-object v9, La/e7z;->u1:La/pcy;

    .line 359
    .line 360
    invoke-virtual {v12, v9}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 361
    .line 362
    .line 363
    goto :goto_7

    .line 364
    :cond_d
    invoke-virtual {v12}, La/fet;->r0()V

    .line 365
    .line 366
    .line 367
    :goto_7
    sget-object v9, La/gqw0;->x:La/shd;

    .line 368
    .line 369
    invoke-static {v12, v3, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 370
    .line 371
    .line 372
    sget-object v3, La/gqw0;->w:La/shd;

    .line 373
    .line 374
    invoke-static {v12, v5, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 375
    .line 376
    .line 377
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 378
    .line 379
    .line 380
    move-result-object v3

    .line 381
    sget-object v4, La/gqw0;->y:La/shd;

    .line 382
    .line 383
    invoke-static {v12, v3, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 384
    .line 385
    .line 386
    invoke-static {v12}, La/jpm0;->n(La/fet;)V

    .line 387
    .line 388
    .line 389
    sget-object v3, La/gqw0;->v:La/shd;

    .line 390
    .line 391
    const v4, 0x1f9d288e

    .line 392
    .line 393
    .line 394
    invoke-static {v12, v0, v3, v4, v1}, La/h97;->o(La/fet;La/mm40;La/shd;ILa/a4x;)Ljava/util/Iterator;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 399
    .line 400
    .line 401
    move-result v1

    .line 402
    if-eqz v1, :cond_12

    .line 403
    .line 404
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    check-cast v1, La/a4r0;

    .line 409
    .line 410
    instance-of v3, v1, La/y3r0;

    .line 411
    .line 412
    if-eqz v3, :cond_10

    .line 413
    .line 414
    const v3, -0xff1b31a

    .line 415
    .line 416
    .line 417
    invoke-virtual {v12, v3}, La/fet;->e0(I)V

    .line 418
    .line 419
    .line 420
    move-object v3, v1

    .line 421
    check-cast v3, La/y3r0;

    .line 422
    .line 423
    iget v4, v3, La/y3r0;->a:I

    .line 424
    .line 425
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 426
    .line 427
    .line 428
    move-result-object v4

    .line 429
    const v5, 0x18439196

    .line 430
    .line 431
    .line 432
    invoke-virtual {v12, v5, v4}, La/fet;->b0(ILjava/lang/Object;)V

    .line 433
    .line 434
    .line 435
    invoke-static {v7, v6}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 436
    .line 437
    .line 438
    move-result-object v18

    .line 439
    iget-object v4, v3, La/y3r0;->c:La/gy30;

    .line 440
    .line 441
    invoke-virtual {v12, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 442
    .line 443
    .line 444
    move-result v5

    .line 445
    invoke-virtual {v12, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    move-result v1

    .line 449
    or-int/2addr v1, v5

    .line 450
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v5

    .line 454
    if-nez v1, :cond_e

    .line 455
    .line 456
    if-ne v5, v2, :cond_f

    .line 457
    .line 458
    :cond_e
    new-instance v5, La/ha30;

    .line 459
    .line 460
    const/4 v1, 0x7

    .line 461
    invoke-direct {v5, v8, v3, v1}, La/ha30;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v12, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 465
    .line 466
    .line 467
    :cond_f
    move-object/from16 v20, v5

    .line 468
    .line 469
    check-cast v20, Lkotlin/jvm/functions/Function0;

    .line 470
    .line 471
    const/16 v24, 0x6

    .line 472
    .line 473
    const/16 v25, 0x18

    .line 474
    .line 475
    const/16 v21, 0x0

    .line 476
    .line 477
    const/16 v22, 0x0

    .line 478
    .line 479
    move-object/from16 v19, v4

    .line 480
    .line 481
    move-object/from16 v23, v12

    .line 482
    .line 483
    invoke-static/range {v18 .. v25}, La/jiq0;->y(La/mm40;La/gy30;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 484
    .line 485
    .line 486
    move-object/from16 v3, v23

    .line 487
    .line 488
    invoke-virtual {v3, v15}, La/fet;->r(Z)V

    .line 489
    .line 490
    .line 491
    invoke-virtual {v3, v15}, La/fet;->r(Z)V

    .line 492
    .line 493
    .line 494
    goto :goto_9

    .line 495
    :cond_10
    move-object v3, v12

    .line 496
    sget-object v4, La/z3r0;->a:La/z3r0;

    .line 497
    .line 498
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 499
    .line 500
    .line 501
    move-result v1

    .line 502
    if-eqz v1, :cond_11

    .line 503
    .line 504
    const v1, 0x1843bdea

    .line 505
    .line 506
    .line 507
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 508
    .line 509
    .line 510
    invoke-static {v7, v6}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 511
    .line 512
    .line 513
    move-result-object v1

    .line 514
    invoke-static {v3, v1}, La/qxw;->o(La/fet;La/mm40;)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v3, v15}, La/fet;->r(Z)V

    .line 518
    .line 519
    .line 520
    :goto_9
    move-object v12, v3

    .line 521
    goto :goto_8

    .line 522
    :cond_11
    const v0, 0x184389cf

    .line 523
    .line 524
    .line 525
    invoke-static {v0, v3, v15}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    throw v0

    .line 530
    :cond_12
    move-object v3, v12

    .line 531
    invoke-static {v3, v15, v11, v15}, La/ohs0;->x(La/fet;ZZZ)V

    .line 532
    .line 533
    .line 534
    goto :goto_a

    .line 535
    :cond_13
    move-object v3, v12

    .line 536
    invoke-virtual {v3}, La/fet;->X()V

    .line 537
    .line 538
    .line 539
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 540
    .line 541
    return-object v0

    .line 542
    :pswitch_1
    move-object/from16 v0, p1

    .line 543
    .line 544
    check-cast v0, La/k8z;

    .line 545
    .line 546
    move-object/from16 v1, p2

    .line 547
    .line 548
    check-cast v1, Ljava/lang/Number;

    .line 549
    .line 550
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 551
    .line 552
    .line 553
    move-result v1

    .line 554
    move-object/from16 v12, p3

    .line 555
    .line 556
    check-cast v12, La/fet;

    .line 557
    .line 558
    move-object/from16 v18, p4

    .line 559
    .line 560
    check-cast v18, Ljava/lang/Number;

    .line 561
    .line 562
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Number;->intValue()I

    .line 563
    .line 564
    .line 565
    move-result v18

    .line 566
    and-int/lit8 v19, v18, 0x6

    .line 567
    .line 568
    if-nez v19, :cond_15

    .line 569
    .line 570
    invoke-virtual {v12, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 571
    .line 572
    .line 573
    move-result v0

    .line 574
    if-eqz v0, :cond_14

    .line 575
    .line 576
    move v13, v14

    .line 577
    :cond_14
    or-int v0, v18, v13

    .line 578
    .line 579
    goto :goto_b

    .line 580
    :cond_15
    move/from16 v0, v18

    .line 581
    .line 582
    :goto_b
    and-int/lit8 v13, v18, 0x30

    .line 583
    .line 584
    if-nez v13, :cond_17

    .line 585
    .line 586
    invoke-virtual {v12, v1}, La/fet;->e(I)Z

    .line 587
    .line 588
    .line 589
    move-result v13

    .line 590
    if-eqz v13, :cond_16

    .line 591
    .line 592
    const/16 v16, 0x20

    .line 593
    .line 594
    goto :goto_c

    .line 595
    :cond_16
    const/16 v16, 0x10

    .line 596
    .line 597
    :goto_c
    or-int v0, v0, v16

    .line 598
    .line 599
    :cond_17
    and-int/lit16 v13, v0, 0x93

    .line 600
    .line 601
    if-eq v13, v10, :cond_18

    .line 602
    .line 603
    move v10, v11

    .line 604
    goto :goto_d

    .line 605
    :cond_18
    move v10, v15

    .line 606
    :goto_d
    and-int/2addr v0, v11

    .line 607
    invoke-virtual {v12, v0, v10}, La/fet;->U(IZ)Z

    .line 608
    .line 609
    .line 610
    move-result v0

    .line 611
    if-eqz v0, :cond_1b

    .line 612
    .line 613
    invoke-interface {v9, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v0

    .line 617
    check-cast v0, La/xjw;

    .line 618
    .line 619
    const v1, 0x522d15e5

    .line 620
    .line 621
    .line 622
    invoke-virtual {v12, v1}, La/fet;->e0(I)V

    .line 623
    .line 624
    .line 625
    sget-object v1, La/qmk;->a:La/zcl;

    .line 626
    .line 627
    invoke-static {v7, v4, v3, v11}, La/o7k0;->u(La/mm40;FFI)La/mm40;

    .line 628
    .line 629
    .line 630
    move-result-object v1

    .line 631
    mul-float/2addr v6, v5

    .line 632
    invoke-static {v1, v6}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 633
    .line 634
    .line 635
    move-result-object v18

    .line 636
    iget-object v1, v0, La/xjw;->c:La/gy30;

    .line 637
    .line 638
    invoke-virtual {v12, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 639
    .line 640
    .line 641
    move-result v3

    .line 642
    invoke-virtual {v12, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 643
    .line 644
    .line 645
    move-result v4

    .line 646
    or-int/2addr v3, v4

    .line 647
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    move-result-object v4

    .line 651
    if-nez v3, :cond_19

    .line 652
    .line 653
    if-ne v4, v2, :cond_1a

    .line 654
    .line 655
    :cond_19
    new-instance v4, La/nsr;

    .line 656
    .line 657
    const/16 v2, 0xa

    .line 658
    .line 659
    invoke-direct {v4, v8, v0, v2}, La/nsr;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 660
    .line 661
    .line 662
    invoke-virtual {v12, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 663
    .line 664
    .line 665
    :cond_1a
    move-object/from16 v20, v4

    .line 666
    .line 667
    check-cast v20, Lkotlin/jvm/functions/Function0;

    .line 668
    .line 669
    const/16 v24, 0x0

    .line 670
    .line 671
    const/16 v25, 0x18

    .line 672
    .line 673
    const/16 v21, 0x0

    .line 674
    .line 675
    const/16 v22, 0x0

    .line 676
    .line 677
    move-object/from16 v19, v1

    .line 678
    .line 679
    move-object/from16 v23, v12

    .line 680
    .line 681
    invoke-static/range {v18 .. v25}, La/jiq0;->y(La/mm40;La/gy30;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 682
    .line 683
    .line 684
    move-object/from16 v0, v23

    .line 685
    .line 686
    invoke-virtual {v0, v15}, La/fet;->r(Z)V

    .line 687
    .line 688
    .line 689
    goto :goto_e

    .line 690
    :cond_1b
    move-object v0, v12

    .line 691
    invoke-virtual {v0}, La/fet;->X()V

    .line 692
    .line 693
    .line 694
    :goto_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 695
    .line 696
    return-object v0

    .line 697
    :pswitch_2
    move-object/from16 v1, p1

    .line 698
    .line 699
    check-cast v1, La/g9z;

    .line 700
    .line 701
    move-object/from16 v2, p2

    .line 702
    .line 703
    check-cast v2, Ljava/lang/Number;

    .line 704
    .line 705
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 706
    .line 707
    .line 708
    move-result v2

    .line 709
    move-object/from16 v7, p3

    .line 710
    .line 711
    check-cast v7, La/fet;

    .line 712
    .line 713
    move-object/from16 v3, p4

    .line 714
    .line 715
    check-cast v3, Ljava/lang/Number;

    .line 716
    .line 717
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 718
    .line 719
    .line 720
    move-result v3

    .line 721
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 722
    .line 723
    .line 724
    and-int/lit8 v4, v3, 0x6

    .line 725
    .line 726
    if-nez v4, :cond_1d

    .line 727
    .line 728
    invoke-virtual {v7, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 729
    .line 730
    .line 731
    move-result v1

    .line 732
    if-eqz v1, :cond_1c

    .line 733
    .line 734
    move v13, v14

    .line 735
    :cond_1c
    or-int v1, v3, v13

    .line 736
    .line 737
    goto :goto_f

    .line 738
    :cond_1d
    move v1, v3

    .line 739
    :goto_f
    and-int/lit8 v3, v3, 0x30

    .line 740
    .line 741
    if-nez v3, :cond_1f

    .line 742
    .line 743
    invoke-virtual {v7, v2}, La/fet;->e(I)Z

    .line 744
    .line 745
    .line 746
    move-result v3

    .line 747
    if-eqz v3, :cond_1e

    .line 748
    .line 749
    const/16 v16, 0x20

    .line 750
    .line 751
    goto :goto_10

    .line 752
    :cond_1e
    const/16 v16, 0x10

    .line 753
    .line 754
    :goto_10
    or-int v1, v1, v16

    .line 755
    .line 756
    :cond_1f
    and-int/lit16 v3, v1, 0x93

    .line 757
    .line 758
    if-eq v3, v10, :cond_20

    .line 759
    .line 760
    move v3, v11

    .line 761
    goto :goto_11

    .line 762
    :cond_20
    move v3, v15

    .line 763
    :goto_11
    and-int/2addr v1, v11

    .line 764
    invoke-virtual {v7, v1, v3}, La/fet;->U(IZ)Z

    .line 765
    .line 766
    .line 767
    move-result v1

    .line 768
    if-eqz v1, :cond_21

    .line 769
    .line 770
    invoke-interface {v9, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object v1

    .line 774
    move-object v4, v1

    .line 775
    check-cast v4, La/vpl;

    .line 776
    .line 777
    const v1, -0x4d5b0490

    .line 778
    .line 779
    .line 780
    invoke-virtual {v7, v1}, La/fet;->e0(I)V

    .line 781
    .line 782
    .line 783
    iget-object v6, v0, La/p0i;->d:Lkotlin/jvm/functions/Function2;

    .line 784
    .line 785
    const/16 v8, 0x180

    .line 786
    .line 787
    const/4 v3, 0x0

    .line 788
    iget v5, v0, La/p0i;->c:F

    .line 789
    .line 790
    invoke-static/range {v3 .. v8}, La/unh0;->r(La/mm40;La/vpl;FLkotlin/jvm/functions/Function2;La/fet;I)V

    .line 791
    .line 792
    .line 793
    invoke-virtual {v7, v15}, La/fet;->r(Z)V

    .line 794
    .line 795
    .line 796
    goto :goto_12

    .line 797
    :cond_21
    invoke-virtual {v7}, La/fet;->X()V

    .line 798
    .line 799
    .line 800
    :goto_12
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 801
    .line 802
    return-object v0

    .line 803
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
