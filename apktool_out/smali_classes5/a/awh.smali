.class public final synthetic La/awh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/awh;->a:B

    iput-object p1, p0, La/awh;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/awh;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/high16 v4, 0x3f800000    # 1.0f

    .line 9
    .line 10
    const/16 v5, 0x80

    .line 11
    .line 12
    const/high16 v6, 0x41400000    # 12.0f

    .line 13
    .line 14
    const/16 v7, 0x92

    .line 15
    .line 16
    const/4 v9, 0x3

    .line 17
    const/4 v10, 0x6

    .line 18
    const/4 v11, 0x2

    .line 19
    const/16 v12, 0x90

    .line 20
    .line 21
    const/16 v13, 0x10

    .line 22
    .line 23
    const/16 v14, 0x20

    .line 24
    .line 25
    const/4 v15, 0x0

    .line 26
    const/4 v8, 0x1

    .line 27
    iget-object v0, v0, La/awh;->b:Ljava/lang/Object;

    .line 28
    .line 29
    packed-switch v1, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    check-cast v0, La/vkn0;

    .line 33
    .line 34
    move-object/from16 v1, p1

    .line 35
    .line 36
    check-cast v1, Landroid/database/sqlite/SQLiteDatabase;

    .line 37
    .line 38
    move-object/from16 v1, p2

    .line 39
    .line 40
    check-cast v1, Landroid/database/sqlite/SQLiteCursorDriver;

    .line 41
    .line 42
    move-object/from16 v2, p3

    .line 43
    .line 44
    check-cast v2, Ljava/lang/String;

    .line 45
    .line 46
    move-object/from16 v3, p4

    .line 47
    .line 48
    check-cast v3, Landroid/database/sqlite/SQLiteQuery;

    .line 49
    .line 50
    new-instance v4, La/c8r;

    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-direct {v4, v3}, La/c8r;-><init>(Landroid/database/sqlite/SQLiteProgram;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {v0, v4}, La/vkn0;->y(La/ukn0;)V

    .line 59
    .line 60
    .line 61
    new-instance v0, Landroid/database/sqlite/SQLiteCursor;

    .line 62
    .line 63
    invoke-direct {v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteCursor;-><init>(Landroid/database/sqlite/SQLiteCursorDriver;Ljava/lang/String;Landroid/database/sqlite/SQLiteQuery;)V

    .line 64
    .line 65
    .line 66
    return-object v0

    .line 67
    :pswitch_0
    check-cast v0, La/ejm;

    .line 68
    .line 69
    move-object/from16 v1, p1

    .line 70
    .line 71
    check-cast v1, La/g9z;

    .line 72
    .line 73
    move-object/from16 v2, p2

    .line 74
    .line 75
    check-cast v2, Ljava/lang/Integer;

    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-object/from16 v2, p3

    .line 81
    .line 82
    check-cast v2, La/fet;

    .line 83
    .line 84
    move-object/from16 v3, p4

    .line 85
    .line 86
    check-cast v3, Ljava/lang/Integer;

    .line 87
    .line 88
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    and-int/lit16 v1, v3, 0x81

    .line 96
    .line 97
    if-eq v1, v5, :cond_0

    .line 98
    .line 99
    move v1, v8

    .line 100
    goto :goto_0

    .line 101
    :cond_0
    move v1, v15

    .line 102
    :goto_0
    and-int/2addr v3, v8

    .line 103
    invoke-virtual {v2, v3, v1}, La/fet;->U(IZ)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-eqz v1, :cond_5

    .line 108
    .line 109
    check-cast v0, La/djm;

    .line 110
    .line 111
    iget-object v0, v0, La/djm;->a:La/xim;

    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-eqz v0, :cond_4

    .line 118
    .line 119
    if-eq v0, v8, :cond_3

    .line 120
    .line 121
    if-eq v0, v11, :cond_2

    .line 122
    .line 123
    if-ne v0, v9, :cond_1

    .line 124
    .line 125
    const v0, -0x2075ea5e    # -1.9900074E19f

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 129
    .line 130
    .line 131
    invoke-static {v15, v2}, La/wzb;->u(ILa/fet;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, v15}, La/fet;->r(Z)V

    .line 135
    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_1
    const v0, -0x20760e20

    .line 139
    .line 140
    .line 141
    invoke-static {v0, v2, v15}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    throw v0

    .line 146
    :cond_2
    const v0, -0x2075f4a0

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 150
    .line 151
    .line 152
    invoke-static {v15, v2}, La/u1c;->k(ILa/fet;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2, v15}, La/fet;->r(Z)V

    .line 156
    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_3
    const v0, -0x2075fea0

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 163
    .line 164
    .line 165
    invoke-static {v15, v2}, La/e3c;->j(ILa/fet;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2, v15}, La/fet;->r(Z)V

    .line 169
    .line 170
    .line 171
    goto :goto_1

    .line 172
    :cond_4
    const v0, -0x20760881

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 176
    .line 177
    .line 178
    invoke-static {v15, v2}, La/vzb;->k(ILa/fet;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2, v15}, La/fet;->r(Z)V

    .line 182
    .line 183
    .line 184
    goto :goto_1

    .line 185
    :cond_5
    invoke-virtual {v2}, La/fet;->X()V

    .line 186
    .line 187
    .line 188
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 189
    .line 190
    return-object v0

    .line 191
    :pswitch_1
    check-cast v0, La/uzb;

    .line 192
    .line 193
    move-object/from16 v1, p1

    .line 194
    .line 195
    check-cast v1, La/g9z;

    .line 196
    .line 197
    move-object/from16 v2, p2

    .line 198
    .line 199
    check-cast v2, Ljava/lang/Integer;

    .line 200
    .line 201
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    move-object/from16 v2, p3

    .line 205
    .line 206
    check-cast v2, La/fet;

    .line 207
    .line 208
    move-object/from16 v3, p4

    .line 209
    .line 210
    check-cast v3, Ljava/lang/Integer;

    .line 211
    .line 212
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    and-int/lit16 v1, v3, 0x81

    .line 220
    .line 221
    if-eq v1, v5, :cond_6

    .line 222
    .line 223
    move v15, v8

    .line 224
    :cond_6
    and-int/lit8 v1, v3, 0x1

    .line 225
    .line 226
    invoke-virtual {v2, v1, v15}, La/fet;->U(IZ)Z

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    if-eqz v1, :cond_7

    .line 231
    .line 232
    const/16 v1, 0x8

    .line 233
    .line 234
    invoke-static {v0, v2, v1}, La/pzb;->m(La/uzb;La/fet;I)V

    .line 235
    .line 236
    .line 237
    goto :goto_2

    .line 238
    :cond_7
    invoke-virtual {v2}, La/fet;->X()V

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
    check-cast v0, La/lq5;

    .line 245
    .line 246
    move-object/from16 v1, p1

    .line 247
    .line 248
    check-cast v1, La/g9z;

    .line 249
    .line 250
    move-object/from16 v2, p2

    .line 251
    .line 252
    check-cast v2, Ljava/lang/Integer;

    .line 253
    .line 254
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    move-object/from16 v2, p3

    .line 258
    .line 259
    check-cast v2, La/fet;

    .line 260
    .line 261
    move-object/from16 v4, p4

    .line 262
    .line 263
    check-cast v4, Ljava/lang/Integer;

    .line 264
    .line 265
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 266
    .line 267
    .line 268
    move-result v4

    .line 269
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    and-int/lit16 v1, v4, 0x81

    .line 273
    .line 274
    if-eq v1, v5, :cond_8

    .line 275
    .line 276
    move v1, v8

    .line 277
    goto :goto_3

    .line 278
    :cond_8
    move v1, v15

    .line 279
    :goto_3
    and-int/2addr v4, v8

    .line 280
    invoke-virtual {v2, v4, v1}, La/fet;->U(IZ)Z

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    if-eqz v1, :cond_9

    .line 285
    .line 286
    check-cast v0, La/jq5;

    .line 287
    .line 288
    iget-object v0, v0, La/jq5;->a:La/cp5;

    .line 289
    .line 290
    invoke-static {v3, v0, v2, v15}, La/q0x;->C(La/mm40;La/cp5;La/fet;I)V

    .line 291
    .line 292
    .line 293
    goto :goto_4

    .line 294
    :cond_9
    invoke-virtual {v2}, La/fet;->X()V

    .line 295
    .line 296
    .line 297
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 298
    .line 299
    return-object v0

    .line 300
    :pswitch_3
    check-cast v0, La/gy30;

    .line 301
    .line 302
    move-object/from16 v1, p1

    .line 303
    .line 304
    check-cast v1, La/mm40;

    .line 305
    .line 306
    move-object/from16 v2, p2

    .line 307
    .line 308
    check-cast v2, La/wx30;

    .line 309
    .line 310
    move-object/from16 v3, p3

    .line 311
    .line 312
    check-cast v3, La/fet;

    .line 313
    .line 314
    move-object/from16 v5, p4

    .line 315
    .line 316
    check-cast v5, Ljava/lang/Integer;

    .line 317
    .line 318
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 319
    .line 320
    .line 321
    move-result v5

    .line 322
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    and-int/lit8 v6, v5, 0x6

    .line 329
    .line 330
    if-nez v6, :cond_b

    .line 331
    .line 332
    invoke-virtual {v3, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result v6

    .line 336
    if-eqz v6, :cond_a

    .line 337
    .line 338
    const/4 v11, 0x4

    .line 339
    :cond_a
    or-int v6, v5, v11

    .line 340
    .line 341
    goto :goto_5

    .line 342
    :cond_b
    move v6, v5

    .line 343
    :goto_5
    and-int/lit8 v5, v5, 0x30

    .line 344
    .line 345
    if-nez v5, :cond_d

    .line 346
    .line 347
    invoke-virtual {v3, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result v5

    .line 351
    if-eqz v5, :cond_c

    .line 352
    .line 353
    move v13, v14

    .line 354
    :cond_c
    or-int/2addr v6, v13

    .line 355
    :cond_d
    and-int/lit16 v5, v6, 0x93

    .line 356
    .line 357
    if-eq v5, v7, :cond_e

    .line 358
    .line 359
    move v15, v8

    .line 360
    :cond_e
    and-int/lit8 v5, v6, 0x1

    .line 361
    .line 362
    invoke-virtual {v3, v5, v15}, La/fet;->U(IZ)Z

    .line 363
    .line 364
    .line 365
    move-result v5

    .line 366
    if-eqz v5, :cond_10

    .line 367
    .line 368
    iget-object v0, v0, La/gy30;->c:La/fy30;

    .line 369
    .line 370
    instance-of v0, v0, La/zx30;

    .line 371
    .line 372
    if-eqz v0, :cond_f

    .line 373
    .line 374
    const/4 v13, 0x0

    .line 375
    const/16 v14, 0xb

    .line 376
    .line 377
    sget-object v9, La/jm40;->b:La/jm40;

    .line 378
    .line 379
    const/4 v10, 0x0

    .line 380
    const/4 v11, 0x0

    .line 381
    const/4 v12, 0x0

    .line 382
    invoke-static/range {v9 .. v14}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    goto :goto_6

    .line 387
    :cond_f
    new-instance v0, La/x7z;

    .line 388
    .line 389
    invoke-direct {v0, v4, v8}, La/x7z;-><init>(FZ)V

    .line 390
    .line 391
    .line 392
    :goto_6
    invoke-interface {v0, v1}, La/mm40;->e(La/mm40;)La/mm40;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    and-int/lit8 v1, v6, 0x70

    .line 397
    .line 398
    invoke-static {v0, v2, v3, v1}, La/jiq0;->L(La/mm40;La/wx30;La/fet;I)V

    .line 399
    .line 400
    .line 401
    goto :goto_7

    .line 402
    :cond_10
    invoke-virtual {v3}, La/fet;->X()V

    .line 403
    .line 404
    .line 405
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 406
    .line 407
    return-object v0

    .line 408
    :pswitch_4
    check-cast v0, La/epd;

    .line 409
    .line 410
    move-object/from16 v1, p1

    .line 411
    .line 412
    check-cast v1, La/y5d;

    .line 413
    .line 414
    move-object/from16 v2, p2

    .line 415
    .line 416
    check-cast v2, La/mm40;

    .line 417
    .line 418
    move-object/from16 v3, p3

    .line 419
    .line 420
    check-cast v3, La/fet;

    .line 421
    .line 422
    move-object/from16 v5, p4

    .line 423
    .line 424
    check-cast v5, Ljava/lang/Integer;

    .line 425
    .line 426
    invoke-static {v5, v1, v2}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 427
    .line 428
    .line 429
    move-result v5

    .line 430
    and-int/lit8 v6, v5, 0x6

    .line 431
    .line 432
    if-nez v6, :cond_12

    .line 433
    .line 434
    invoke-virtual {v3, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    move-result v6

    .line 438
    if-eqz v6, :cond_11

    .line 439
    .line 440
    const/4 v11, 0x4

    .line 441
    :cond_11
    or-int v6, v5, v11

    .line 442
    .line 443
    goto :goto_8

    .line 444
    :cond_12
    move v6, v5

    .line 445
    :goto_8
    and-int/lit8 v5, v5, 0x30

    .line 446
    .line 447
    if-nez v5, :cond_14

    .line 448
    .line 449
    invoke-virtual {v3, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 450
    .line 451
    .line 452
    move-result v5

    .line 453
    if-eqz v5, :cond_13

    .line 454
    .line 455
    move v13, v14

    .line 456
    :cond_13
    or-int/2addr v6, v13

    .line 457
    :cond_14
    and-int/lit16 v5, v6, 0x93

    .line 458
    .line 459
    if-eq v5, v7, :cond_15

    .line 460
    .line 461
    move v5, v8

    .line 462
    goto :goto_9

    .line 463
    :cond_15
    move v5, v15

    .line 464
    :goto_9
    and-int/2addr v6, v8

    .line 465
    invoke-virtual {v3, v6, v5}, La/fet;->U(IZ)Z

    .line 466
    .line 467
    .line 468
    move-result v5

    .line 469
    if-eqz v5, :cond_16

    .line 470
    .line 471
    invoke-static {v2, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 472
    .line 473
    .line 474
    move-result-object v2

    .line 475
    invoke-static {v1, v2}, La/y5d;->c(La/y5d;La/mm40;)La/mm40;

    .line 476
    .line 477
    .line 478
    move-result-object v21

    .line 479
    new-instance v1, La/dpd;

    .line 480
    .line 481
    invoke-direct {v1, v0, v15}, La/dpd;-><init>(La/epd;B)V

    .line 482
    .line 483
    .line 484
    const v2, 0x5a11ac33

    .line 485
    .line 486
    .line 487
    invoke-static {v2, v1, v3}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 488
    .line 489
    .line 490
    move-result-object v18

    .line 491
    new-instance v1, La/dpd;

    .line 492
    .line 493
    invoke-direct {v1, v0, v8}, La/dpd;-><init>(La/epd;B)V

    .line 494
    .line 495
    .line 496
    const v0, 0x70b3212

    .line 497
    .line 498
    .line 499
    invoke-static {v0, v1, v3}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 500
    .line 501
    .line 502
    move-result-object v19

    .line 503
    const/16 v17, 0xd80

    .line 504
    .line 505
    const/16 v22, 0x0

    .line 506
    .line 507
    move-object/from16 v20, v3

    .line 508
    .line 509
    invoke-static/range {v17 .. v22}, La/agc;->i(ILa/ugd;La/ugd;La/fet;La/mm40;Z)V

    .line 510
    .line 511
    .line 512
    goto :goto_a

    .line 513
    :cond_16
    move-object/from16 v20, v3

    .line 514
    .line 515
    invoke-virtual/range {v20 .. v20}, La/fet;->X()V

    .line 516
    .line 517
    .line 518
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 519
    .line 520
    return-object v0

    .line 521
    :pswitch_5
    check-cast v0, La/j83;

    .line 522
    .line 523
    move-object/from16 v1, p1

    .line 524
    .line 525
    check-cast v1, La/y5d;

    .line 526
    .line 527
    move-object/from16 v2, p2

    .line 528
    .line 529
    check-cast v2, La/mm40;

    .line 530
    .line 531
    move-object/from16 v3, p3

    .line 532
    .line 533
    check-cast v3, La/fet;

    .line 534
    .line 535
    move-object/from16 v4, p4

    .line 536
    .line 537
    check-cast v4, Ljava/lang/Integer;

    .line 538
    .line 539
    invoke-static {v4, v1, v2}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 540
    .line 541
    .line 542
    move-result v1

    .line 543
    and-int/lit8 v4, v1, 0x30

    .line 544
    .line 545
    if-nez v4, :cond_18

    .line 546
    .line 547
    invoke-virtual {v3, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 548
    .line 549
    .line 550
    move-result v4

    .line 551
    if-eqz v4, :cond_17

    .line 552
    .line 553
    move v13, v14

    .line 554
    :cond_17
    or-int/2addr v1, v13

    .line 555
    :cond_18
    and-int/lit16 v4, v1, 0x91

    .line 556
    .line 557
    if-eq v4, v12, :cond_19

    .line 558
    .line 559
    move v15, v8

    .line 560
    :cond_19
    and-int/lit8 v4, v1, 0x1

    .line 561
    .line 562
    invoke-virtual {v3, v4, v15}, La/fet;->U(IZ)Z

    .line 563
    .line 564
    .line 565
    move-result v4

    .line 566
    if-eqz v4, :cond_1a

    .line 567
    .line 568
    shr-int/2addr v1, v9

    .line 569
    and-int/lit8 v1, v1, 0xe

    .line 570
    .line 571
    invoke-static {v2, v0, v3, v1}, La/wdx;->m(La/mm40;La/j83;La/fet;I)V

    .line 572
    .line 573
    .line 574
    goto :goto_b

    .line 575
    :cond_1a
    invoke-virtual {v3}, La/fet;->X()V

    .line 576
    .line 577
    .line 578
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 579
    .line 580
    return-object v0

    .line 581
    :pswitch_6
    check-cast v0, La/rod;

    .line 582
    .line 583
    move-object/from16 v1, p1

    .line 584
    .line 585
    check-cast v1, La/y5d;

    .line 586
    .line 587
    move-object/from16 v2, p2

    .line 588
    .line 589
    check-cast v2, La/mm40;

    .line 590
    .line 591
    move-object/from16 v3, p3

    .line 592
    .line 593
    check-cast v3, La/fet;

    .line 594
    .line 595
    move-object/from16 v4, p4

    .line 596
    .line 597
    check-cast v4, Ljava/lang/Integer;

    .line 598
    .line 599
    invoke-static {v4, v1, v2}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 600
    .line 601
    .line 602
    move-result v1

    .line 603
    and-int/lit8 v4, v1, 0x30

    .line 604
    .line 605
    if-nez v4, :cond_1c

    .line 606
    .line 607
    invoke-virtual {v3, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 608
    .line 609
    .line 610
    move-result v4

    .line 611
    if-eqz v4, :cond_1b

    .line 612
    .line 613
    move v13, v14

    .line 614
    :cond_1b
    or-int/2addr v1, v13

    .line 615
    :cond_1c
    and-int/lit16 v4, v1, 0x91

    .line 616
    .line 617
    if-eq v4, v12, :cond_1d

    .line 618
    .line 619
    move v15, v8

    .line 620
    :cond_1d
    and-int/2addr v1, v8

    .line 621
    invoke-virtual {v3, v1, v15}, La/fet;->U(IZ)Z

    .line 622
    .line 623
    .line 624
    move-result v1

    .line 625
    if-eqz v1, :cond_1e

    .line 626
    .line 627
    sget-object v1, La/qmk;->a:La/zcl;

    .line 628
    .line 629
    invoke-static {v2, v6}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 630
    .line 631
    .line 632
    move-result-object v1

    .line 633
    iget-object v0, v0, La/rod;->d:La/j83;

    .line 634
    .line 635
    invoke-static {v1, v0, v3}, La/vbc;->j(La/mm40;La/j83;La/fet;)V

    .line 636
    .line 637
    .line 638
    goto :goto_c

    .line 639
    :cond_1e
    invoke-virtual {v3}, La/fet;->X()V

    .line 640
    .line 641
    .line 642
    :goto_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 643
    .line 644
    return-object v0

    .line 645
    :pswitch_7
    check-cast v0, La/qod;

    .line 646
    .line 647
    move-object/from16 v1, p1

    .line 648
    .line 649
    check-cast v1, La/y5d;

    .line 650
    .line 651
    move-object/from16 v2, p2

    .line 652
    .line 653
    check-cast v2, La/mm40;

    .line 654
    .line 655
    move-object/from16 v3, p3

    .line 656
    .line 657
    check-cast v3, La/fet;

    .line 658
    .line 659
    move-object/from16 v4, p4

    .line 660
    .line 661
    check-cast v4, Ljava/lang/Integer;

    .line 662
    .line 663
    invoke-static {v4, v1, v2}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 664
    .line 665
    .line 666
    move-result v1

    .line 667
    and-int/lit8 v4, v1, 0x30

    .line 668
    .line 669
    if-nez v4, :cond_20

    .line 670
    .line 671
    invoke-virtual {v3, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 672
    .line 673
    .line 674
    move-result v4

    .line 675
    if-eqz v4, :cond_1f

    .line 676
    .line 677
    move v13, v14

    .line 678
    :cond_1f
    or-int/2addr v1, v13

    .line 679
    :cond_20
    and-int/lit16 v4, v1, 0x91

    .line 680
    .line 681
    if-eq v4, v12, :cond_21

    .line 682
    .line 683
    move v15, v8

    .line 684
    :cond_21
    and-int/2addr v1, v8

    .line 685
    invoke-virtual {v3, v1, v15}, La/fet;->U(IZ)Z

    .line 686
    .line 687
    .line 688
    move-result v1

    .line 689
    if-eqz v1, :cond_22

    .line 690
    .line 691
    sget-object v1, La/qmk;->a:La/zcl;

    .line 692
    .line 693
    invoke-static {v2, v6}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 694
    .line 695
    .line 696
    move-result-object v1

    .line 697
    iget-object v0, v0, La/qod;->d:La/j83;

    .line 698
    .line 699
    invoke-static {v1, v0, v3}, La/vbc;->j(La/mm40;La/j83;La/fet;)V

    .line 700
    .line 701
    .line 702
    goto :goto_d

    .line 703
    :cond_22
    invoke-virtual {v3}, La/fet;->X()V

    .line 704
    .line 705
    .line 706
    :goto_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 707
    .line 708
    return-object v0

    .line 709
    :pswitch_8
    check-cast v0, La/pod;

    .line 710
    .line 711
    move-object/from16 v1, p1

    .line 712
    .line 713
    check-cast v1, La/y5d;

    .line 714
    .line 715
    move-object/from16 v2, p2

    .line 716
    .line 717
    check-cast v2, La/mm40;

    .line 718
    .line 719
    move-object/from16 v3, p3

    .line 720
    .line 721
    check-cast v3, La/fet;

    .line 722
    .line 723
    move-object/from16 v4, p4

    .line 724
    .line 725
    check-cast v4, Ljava/lang/Integer;

    .line 726
    .line 727
    invoke-static {v4, v1, v2}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 728
    .line 729
    .line 730
    move-result v1

    .line 731
    and-int/lit8 v4, v1, 0x30

    .line 732
    .line 733
    if-nez v4, :cond_24

    .line 734
    .line 735
    invoke-virtual {v3, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 736
    .line 737
    .line 738
    move-result v4

    .line 739
    if-eqz v4, :cond_23

    .line 740
    .line 741
    move v13, v14

    .line 742
    :cond_23
    or-int/2addr v1, v13

    .line 743
    :cond_24
    and-int/lit16 v4, v1, 0x91

    .line 744
    .line 745
    if-eq v4, v12, :cond_25

    .line 746
    .line 747
    move v15, v8

    .line 748
    :cond_25
    and-int/2addr v1, v8

    .line 749
    invoke-virtual {v3, v1, v15}, La/fet;->U(IZ)Z

    .line 750
    .line 751
    .line 752
    move-result v1

    .line 753
    if-eqz v1, :cond_26

    .line 754
    .line 755
    sget-object v1, La/qmk;->a:La/zcl;

    .line 756
    .line 757
    invoke-static {v2, v6}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 758
    .line 759
    .line 760
    move-result-object v1

    .line 761
    iget-object v0, v0, La/pod;->f:La/j83;

    .line 762
    .line 763
    invoke-static {v1, v0, v3}, La/vbc;->j(La/mm40;La/j83;La/fet;)V

    .line 764
    .line 765
    .line 766
    goto :goto_e

    .line 767
    :cond_26
    invoke-virtual {v3}, La/fet;->X()V

    .line 768
    .line 769
    .line 770
    :goto_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 771
    .line 772
    return-object v0

    .line 773
    :pswitch_9
    check-cast v0, La/god;

    .line 774
    .line 775
    move-object/from16 v1, p1

    .line 776
    .line 777
    check-cast v1, La/y5d;

    .line 778
    .line 779
    move-object/from16 v2, p2

    .line 780
    .line 781
    check-cast v2, La/mm40;

    .line 782
    .line 783
    move-object/from16 v3, p3

    .line 784
    .line 785
    check-cast v3, La/fet;

    .line 786
    .line 787
    move-object/from16 v4, p4

    .line 788
    .line 789
    check-cast v4, Ljava/lang/Integer;

    .line 790
    .line 791
    invoke-static {v4, v1, v2}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 792
    .line 793
    .line 794
    move-result v1

    .line 795
    and-int/lit8 v4, v1, 0x30

    .line 796
    .line 797
    if-nez v4, :cond_28

    .line 798
    .line 799
    invoke-virtual {v3, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 800
    .line 801
    .line 802
    move-result v4

    .line 803
    if-eqz v4, :cond_27

    .line 804
    .line 805
    move v13, v14

    .line 806
    :cond_27
    or-int/2addr v1, v13

    .line 807
    :cond_28
    and-int/lit16 v4, v1, 0x91

    .line 808
    .line 809
    if-eq v4, v12, :cond_29

    .line 810
    .line 811
    move v15, v8

    .line 812
    :cond_29
    and-int/2addr v1, v8

    .line 813
    invoke-virtual {v3, v1, v15}, La/fet;->U(IZ)Z

    .line 814
    .line 815
    .line 816
    move-result v1

    .line 817
    if-eqz v1, :cond_2a

    .line 818
    .line 819
    sget-object v1, La/qmk;->a:La/zcl;

    .line 820
    .line 821
    invoke-static {v2, v6}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 822
    .line 823
    .line 824
    move-result-object v1

    .line 825
    iget-object v0, v0, La/god;->c:La/j83;

    .line 826
    .line 827
    invoke-static {v1, v0, v3}, La/vbc;->j(La/mm40;La/j83;La/fet;)V

    .line 828
    .line 829
    .line 830
    goto :goto_f

    .line 831
    :cond_2a
    invoke-virtual {v3}, La/fet;->X()V

    .line 832
    .line 833
    .line 834
    :goto_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 835
    .line 836
    return-object v0

    .line 837
    :pswitch_a
    check-cast v0, La/gnc;

    .line 838
    .line 839
    move-object/from16 v1, p1

    .line 840
    .line 841
    check-cast v1, La/y5d;

    .line 842
    .line 843
    move-object/from16 v2, p2

    .line 844
    .line 845
    check-cast v2, Lorg/xplatform/favorites/impl/presentation/screen/classic/models/ClassicFavoriteTab;

    .line 846
    .line 847
    move-object/from16 v3, p3

    .line 848
    .line 849
    check-cast v3, La/fet;

    .line 850
    .line 851
    move-object/from16 v4, p4

    .line 852
    .line 853
    check-cast v4, Ljava/lang/Integer;

    .line 854
    .line 855
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 856
    .line 857
    .line 858
    move-result v4

    .line 859
    sget-object v5, La/gnc;->Z1:La/kl5;

    .line 860
    .line 861
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 862
    .line 863
    .line 864
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 865
    .line 866
    .line 867
    and-int/lit8 v5, v4, 0x6

    .line 868
    .line 869
    if-nez v5, :cond_2c

    .line 870
    .line 871
    invoke-virtual {v3, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 872
    .line 873
    .line 874
    move-result v1

    .line 875
    if-eqz v1, :cond_2b

    .line 876
    .line 877
    const/16 v16, 0x4

    .line 878
    .line 879
    goto :goto_10

    .line 880
    :cond_2b
    move/from16 v16, v11

    .line 881
    .line 882
    :goto_10
    or-int v1, v4, v16

    .line 883
    .line 884
    goto :goto_11

    .line 885
    :cond_2c
    move v1, v4

    .line 886
    :goto_11
    and-int/lit8 v4, v4, 0x30

    .line 887
    .line 888
    if-nez v4, :cond_2e

    .line 889
    .line 890
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 891
    .line 892
    .line 893
    move-result v4

    .line 894
    invoke-virtual {v3, v4}, La/fet;->e(I)Z

    .line 895
    .line 896
    .line 897
    move-result v4

    .line 898
    if-eqz v4, :cond_2d

    .line 899
    .line 900
    move v13, v14

    .line 901
    :cond_2d
    or-int/2addr v1, v13

    .line 902
    :cond_2e
    and-int/lit16 v4, v1, 0x93

    .line 903
    .line 904
    if-eq v4, v7, :cond_2f

    .line 905
    .line 906
    move v4, v8

    .line 907
    goto :goto_12

    .line 908
    :cond_2f
    move v4, v15

    .line 909
    :goto_12
    and-int/2addr v1, v8

    .line 910
    invoke-virtual {v3, v1, v4}, La/fet;->U(IZ)Z

    .line 911
    .line 912
    .line 913
    move-result v1

    .line 914
    if-eqz v1, :cond_34

    .line 915
    .line 916
    iget-object v1, v0, La/gnc;->M1:La/khf0;

    .line 917
    .line 918
    sget-object v4, La/gnc;->a2:[La/iiy;

    .line 919
    .line 920
    aget-object v4, v4, v8

    .line 921
    .line 922
    invoke-virtual {v1, v0, v4, v2}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 923
    .line 924
    .line 925
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 926
    .line 927
    .line 928
    move-result v1

    .line 929
    if-eqz v1, :cond_33

    .line 930
    .line 931
    if-eq v1, v8, :cond_32

    .line 932
    .line 933
    if-eq v1, v11, :cond_31

    .line 934
    .line 935
    if-ne v1, v9, :cond_30

    .line 936
    .line 937
    const v1, 0x1b78dc74

    .line 938
    .line 939
    .line 940
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 941
    .line 942
    .line 943
    invoke-virtual {v0, v15, v3}, La/gnc;->J0(ILa/fet;)V

    .line 944
    .line 945
    .line 946
    invoke-virtual {v3, v15}, La/fet;->r(Z)V

    .line 947
    .line 948
    .line 949
    goto :goto_13

    .line 950
    :cond_30
    const v0, 0x1b78c13f

    .line 951
    .line 952
    .line 953
    invoke-static {v0, v3, v15}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 954
    .line 955
    .line 956
    move-result-object v0

    .line 957
    throw v0

    .line 958
    :cond_31
    const v1, 0x1b78d577

    .line 959
    .line 960
    .line 961
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 962
    .line 963
    .line 964
    invoke-virtual {v0, v15, v3}, La/gnc;->I0(ILa/fet;)V

    .line 965
    .line 966
    .line 967
    invoke-virtual {v3, v15}, La/fet;->r(Z)V

    .line 968
    .line 969
    .line 970
    goto :goto_13

    .line 971
    :cond_32
    const v1, 0x1b78ced3

    .line 972
    .line 973
    .line 974
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 975
    .line 976
    .line 977
    invoke-virtual {v0, v15, v3}, La/gnc;->G0(ILa/fet;)V

    .line 978
    .line 979
    .line 980
    invoke-virtual {v3, v15}, La/fet;->r(Z)V

    .line 981
    .line 982
    .line 983
    goto :goto_13

    .line 984
    :cond_33
    const v1, 0x1b78c816

    .line 985
    .line 986
    .line 987
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 988
    .line 989
    .line 990
    invoke-virtual {v0, v15, v3}, La/gnc;->H0(ILa/fet;)V

    .line 991
    .line 992
    .line 993
    invoke-virtual {v3, v15}, La/fet;->r(Z)V

    .line 994
    .line 995
    .line 996
    goto :goto_13

    .line 997
    :cond_34
    invoke-virtual {v3}, La/fet;->X()V

    .line 998
    .line 999
    .line 1000
    :goto_13
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1001
    .line 1002
    return-object v0

    .line 1003
    :pswitch_b
    check-cast v0, La/l5c;

    .line 1004
    .line 1005
    move-object/from16 v1, p1

    .line 1006
    .line 1007
    check-cast v1, Ljava/lang/CharSequence;

    .line 1008
    .line 1009
    move-object/from16 v2, p2

    .line 1010
    .line 1011
    check-cast v2, Ljava/lang/Integer;

    .line 1012
    .line 1013
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1014
    .line 1015
    .line 1016
    move-object/from16 v2, p3

    .line 1017
    .line 1018
    check-cast v2, Ljava/lang/Integer;

    .line 1019
    .line 1020
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1021
    .line 1022
    .line 1023
    move-object/from16 v2, p4

    .line 1024
    .line 1025
    check-cast v2, Ljava/lang/Integer;

    .line 1026
    .line 1027
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1028
    .line 1029
    .line 1030
    sget-object v2, La/l5c;->W1:La/kl5;

    .line 1031
    .line 1032
    invoke-virtual {v0}, La/l5c;->I0()La/v7c;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v2

    .line 1036
    iget-object v3, v2, La/v7c;->Q:La/p7m0;

    .line 1037
    .line 1038
    const-string v4, ""

    .line 1039
    .line 1040
    if-eqz v1, :cond_36

    .line 1041
    .line 1042
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v0

    .line 1046
    if-nez v0, :cond_35

    .line 1047
    .line 1048
    goto :goto_14

    .line 1049
    :cond_35
    move-object/from16 v17, v0

    .line 1050
    .line 1051
    goto :goto_15

    .line 1052
    :cond_36
    :goto_14
    move-object/from16 v17, v4

    .line 1053
    .line 1054
    :cond_37
    :goto_15
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v0

    .line 1058
    move-object/from16 v16, v0

    .line 1059
    .line 1060
    check-cast v16, La/i7c;

    .line 1061
    .line 1062
    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    .line 1063
    .line 1064
    .line 1065
    move-result v1

    .line 1066
    if-lez v1, :cond_38

    .line 1067
    .line 1068
    move/from16 v21, v8

    .line 1069
    .line 1070
    goto :goto_16

    .line 1071
    :cond_38
    move/from16 v21, v15

    .line 1072
    .line 1073
    :goto_16
    const/16 v23, 0x0

    .line 1074
    .line 1075
    const/16 v24, 0x37ef

    .line 1076
    .line 1077
    const/16 v18, 0x0

    .line 1078
    .line 1079
    const/16 v19, 0x0

    .line 1080
    .line 1081
    const/16 v20, 0x0

    .line 1082
    .line 1083
    const/16 v22, 0x0

    .line 1084
    .line 1085
    invoke-static/range {v16 .. v24}, La/i7c;->a(La/i7c;Ljava/lang/String;La/m6c;La/n6c;La/u6c;ZZZI)La/i7c;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v1

    .line 1089
    invoke-virtual {v3, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1090
    .line 1091
    .line 1092
    move-result v0

    .line 1093
    if-eqz v0, :cond_37

    .line 1094
    .line 1095
    invoke-virtual {v2, v4}, La/v7c;->O(Ljava/lang/String;)V

    .line 1096
    .line 1097
    .line 1098
    :cond_39
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v0

    .line 1102
    move-object v4, v0

    .line 1103
    check-cast v4, La/i7c;

    .line 1104
    .line 1105
    invoke-virtual {v2}, La/v7c;->D()La/n6c;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v7

    .line 1109
    const/4 v11, 0x0

    .line 1110
    const/16 v12, 0x3eff

    .line 1111
    .line 1112
    const/4 v5, 0x0

    .line 1113
    const/4 v6, 0x0

    .line 1114
    const/4 v8, 0x0

    .line 1115
    const/4 v9, 0x0

    .line 1116
    const/4 v10, 0x0

    .line 1117
    invoke-static/range {v4 .. v12}, La/i7c;->a(La/i7c;Ljava/lang/String;La/m6c;La/n6c;La/u6c;ZZZI)La/i7c;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v1

    .line 1121
    invoke-virtual {v3, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1122
    .line 1123
    .line 1124
    move-result v0

    .line 1125
    if-eqz v0, :cond_39

    .line 1126
    .line 1127
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1128
    .line 1129
    return-object v0

    .line 1130
    :pswitch_c
    check-cast v0, La/xra;

    .line 1131
    .line 1132
    move-object/from16 v1, p1

    .line 1133
    .line 1134
    check-cast v1, La/ir8;

    .line 1135
    .line 1136
    move-object/from16 v2, p2

    .line 1137
    .line 1138
    check-cast v2, La/bzl;

    .line 1139
    .line 1140
    move-object/from16 v3, p3

    .line 1141
    .line 1142
    check-cast v3, La/fet;

    .line 1143
    .line 1144
    move-object/from16 v4, p4

    .line 1145
    .line 1146
    check-cast v4, Ljava/lang/Integer;

    .line 1147
    .line 1148
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1149
    .line 1150
    .line 1151
    move-result v4

    .line 1152
    sget-object v5, La/xra;->X1:La/cl5;

    .line 1153
    .line 1154
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1155
    .line 1156
    .line 1157
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1158
    .line 1159
    .line 1160
    and-int/lit8 v1, v4, 0x30

    .line 1161
    .line 1162
    if-nez v1, :cond_3b

    .line 1163
    .line 1164
    invoke-virtual {v3, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1165
    .line 1166
    .line 1167
    move-result v1

    .line 1168
    if-eqz v1, :cond_3a

    .line 1169
    .line 1170
    move v13, v14

    .line 1171
    :cond_3a
    or-int/2addr v4, v13

    .line 1172
    :cond_3b
    and-int/lit16 v1, v4, 0x91

    .line 1173
    .line 1174
    if-eq v1, v12, :cond_3c

    .line 1175
    .line 1176
    move v15, v8

    .line 1177
    :cond_3c
    and-int/lit8 v1, v4, 0x1

    .line 1178
    .line 1179
    invoke-virtual {v3, v1, v15}, La/fet;->U(IZ)Z

    .line 1180
    .line 1181
    .line 1182
    move-result v1

    .line 1183
    if-eqz v1, :cond_3d

    .line 1184
    .line 1185
    shr-int/lit8 v1, v4, 0x3

    .line 1186
    .line 1187
    and-int/lit8 v1, v1, 0xe

    .line 1188
    .line 1189
    invoke-virtual {v0, v2, v3, v1}, La/xra;->G0(La/bzl;La/fet;I)V

    .line 1190
    .line 1191
    .line 1192
    goto :goto_17

    .line 1193
    :cond_3d
    invoke-virtual {v3}, La/fet;->X()V

    .line 1194
    .line 1195
    .line 1196
    :goto_17
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1197
    .line 1198
    return-object v0

    .line 1199
    :pswitch_d
    check-cast v0, La/joa;

    .line 1200
    .line 1201
    move-object/from16 v1, p1

    .line 1202
    .line 1203
    check-cast v1, La/y5d;

    .line 1204
    .line 1205
    move-object/from16 v2, p2

    .line 1206
    .line 1207
    check-cast v2, La/mm40;

    .line 1208
    .line 1209
    move-object/from16 v3, p3

    .line 1210
    .line 1211
    check-cast v3, La/fet;

    .line 1212
    .line 1213
    move-object/from16 v4, p4

    .line 1214
    .line 1215
    check-cast v4, Ljava/lang/Integer;

    .line 1216
    .line 1217
    invoke-static {v4, v1, v2}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 1218
    .line 1219
    .line 1220
    move-result v1

    .line 1221
    and-int/lit8 v4, v1, 0x30

    .line 1222
    .line 1223
    if-nez v4, :cond_3f

    .line 1224
    .line 1225
    invoke-virtual {v3, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1226
    .line 1227
    .line 1228
    move-result v4

    .line 1229
    if-eqz v4, :cond_3e

    .line 1230
    .line 1231
    move v13, v14

    .line 1232
    :cond_3e
    or-int/2addr v1, v13

    .line 1233
    :cond_3f
    and-int/lit16 v4, v1, 0x91

    .line 1234
    .line 1235
    if-eq v4, v12, :cond_40

    .line 1236
    .line 1237
    move v15, v8

    .line 1238
    :cond_40
    and-int/2addr v1, v8

    .line 1239
    invoke-virtual {v3, v1, v15}, La/fet;->U(IZ)Z

    .line 1240
    .line 1241
    .line 1242
    move-result v1

    .line 1243
    if-eqz v1, :cond_41

    .line 1244
    .line 1245
    iget-object v0, v0, La/joa;->d:La/bo8;

    .line 1246
    .line 1247
    invoke-static {v2, v0, v3}, La/ccq0;->e(La/mm40;La/bo8;La/fet;)V

    .line 1248
    .line 1249
    .line 1250
    goto :goto_18

    .line 1251
    :cond_41
    invoke-virtual {v3}, La/fet;->X()V

    .line 1252
    .line 1253
    .line 1254
    :goto_18
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1255
    .line 1256
    return-object v0

    .line 1257
    :pswitch_e
    check-cast v0, La/ioa;

    .line 1258
    .line 1259
    move-object/from16 v1, p1

    .line 1260
    .line 1261
    check-cast v1, La/y5d;

    .line 1262
    .line 1263
    move-object/from16 v2, p2

    .line 1264
    .line 1265
    check-cast v2, La/mm40;

    .line 1266
    .line 1267
    move-object/from16 v3, p3

    .line 1268
    .line 1269
    check-cast v3, La/fet;

    .line 1270
    .line 1271
    move-object/from16 v4, p4

    .line 1272
    .line 1273
    check-cast v4, Ljava/lang/Integer;

    .line 1274
    .line 1275
    invoke-static {v4, v1, v2}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 1276
    .line 1277
    .line 1278
    move-result v1

    .line 1279
    and-int/lit8 v4, v1, 0x30

    .line 1280
    .line 1281
    if-nez v4, :cond_43

    .line 1282
    .line 1283
    invoke-virtual {v3, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1284
    .line 1285
    .line 1286
    move-result v4

    .line 1287
    if-eqz v4, :cond_42

    .line 1288
    .line 1289
    move v13, v14

    .line 1290
    :cond_42
    or-int/2addr v1, v13

    .line 1291
    :cond_43
    and-int/lit16 v4, v1, 0x91

    .line 1292
    .line 1293
    if-eq v4, v12, :cond_44

    .line 1294
    .line 1295
    move v15, v8

    .line 1296
    :cond_44
    and-int/2addr v1, v8

    .line 1297
    invoke-virtual {v3, v1, v15}, La/fet;->U(IZ)Z

    .line 1298
    .line 1299
    .line 1300
    move-result v1

    .line 1301
    if-eqz v1, :cond_45

    .line 1302
    .line 1303
    iget-object v0, v0, La/ioa;->d:La/ao8;

    .line 1304
    .line 1305
    invoke-static {v2, v0, v3}, La/unh0;->i(La/mm40;La/ao8;La/fet;)V

    .line 1306
    .line 1307
    .line 1308
    goto :goto_19

    .line 1309
    :cond_45
    invoke-virtual {v3}, La/fet;->X()V

    .line 1310
    .line 1311
    .line 1312
    :goto_19
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1313
    .line 1314
    return-object v0

    .line 1315
    :pswitch_f
    check-cast v0, La/jna;

    .line 1316
    .line 1317
    move-object/from16 v1, p1

    .line 1318
    .line 1319
    check-cast v1, La/y5d;

    .line 1320
    .line 1321
    move-object/from16 v2, p2

    .line 1322
    .line 1323
    check-cast v2, La/mm40;

    .line 1324
    .line 1325
    move-object/from16 v3, p3

    .line 1326
    .line 1327
    check-cast v3, La/fet;

    .line 1328
    .line 1329
    move-object/from16 v4, p4

    .line 1330
    .line 1331
    check-cast v4, Ljava/lang/Integer;

    .line 1332
    .line 1333
    invoke-static {v4, v1, v2}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 1334
    .line 1335
    .line 1336
    move-result v1

    .line 1337
    and-int/lit8 v4, v1, 0x30

    .line 1338
    .line 1339
    if-nez v4, :cond_47

    .line 1340
    .line 1341
    invoke-virtual {v3, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1342
    .line 1343
    .line 1344
    move-result v4

    .line 1345
    if-eqz v4, :cond_46

    .line 1346
    .line 1347
    move v13, v14

    .line 1348
    :cond_46
    or-int/2addr v1, v13

    .line 1349
    :cond_47
    and-int/lit16 v4, v1, 0x91

    .line 1350
    .line 1351
    if-eq v4, v12, :cond_48

    .line 1352
    .line 1353
    move v15, v8

    .line 1354
    :cond_48
    and-int/2addr v1, v8

    .line 1355
    invoke-virtual {v3, v1, v15}, La/fet;->U(IZ)Z

    .line 1356
    .line 1357
    .line 1358
    move-result v1

    .line 1359
    if-eqz v1, :cond_49

    .line 1360
    .line 1361
    iget-object v0, v0, La/jna;->c:La/bo8;

    .line 1362
    .line 1363
    invoke-static {v2, v0, v3}, La/ccq0;->e(La/mm40;La/bo8;La/fet;)V

    .line 1364
    .line 1365
    .line 1366
    goto :goto_1a

    .line 1367
    :cond_49
    invoke-virtual {v3}, La/fet;->X()V

    .line 1368
    .line 1369
    .line 1370
    :goto_1a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1371
    .line 1372
    return-object v0

    .line 1373
    :pswitch_10
    check-cast v0, La/ina;

    .line 1374
    .line 1375
    move-object/from16 v1, p1

    .line 1376
    .line 1377
    check-cast v1, La/y5d;

    .line 1378
    .line 1379
    move-object/from16 v2, p2

    .line 1380
    .line 1381
    check-cast v2, La/mm40;

    .line 1382
    .line 1383
    move-object/from16 v3, p3

    .line 1384
    .line 1385
    check-cast v3, La/fet;

    .line 1386
    .line 1387
    move-object/from16 v4, p4

    .line 1388
    .line 1389
    check-cast v4, Ljava/lang/Integer;

    .line 1390
    .line 1391
    invoke-static {v4, v1, v2}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 1392
    .line 1393
    .line 1394
    move-result v1

    .line 1395
    and-int/lit8 v4, v1, 0x30

    .line 1396
    .line 1397
    if-nez v4, :cond_4b

    .line 1398
    .line 1399
    invoke-virtual {v3, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1400
    .line 1401
    .line 1402
    move-result v4

    .line 1403
    if-eqz v4, :cond_4a

    .line 1404
    .line 1405
    move v13, v14

    .line 1406
    :cond_4a
    or-int/2addr v1, v13

    .line 1407
    :cond_4b
    and-int/lit16 v4, v1, 0x91

    .line 1408
    .line 1409
    if-eq v4, v12, :cond_4c

    .line 1410
    .line 1411
    move v15, v8

    .line 1412
    :cond_4c
    and-int/2addr v1, v8

    .line 1413
    invoke-virtual {v3, v1, v15}, La/fet;->U(IZ)Z

    .line 1414
    .line 1415
    .line 1416
    move-result v1

    .line 1417
    if-eqz v1, :cond_4d

    .line 1418
    .line 1419
    iget-object v0, v0, La/ina;->c:La/ao8;

    .line 1420
    .line 1421
    invoke-static {v2, v0, v3}, La/unh0;->i(La/mm40;La/ao8;La/fet;)V

    .line 1422
    .line 1423
    .line 1424
    goto :goto_1b

    .line 1425
    :cond_4d
    invoke-virtual {v3}, La/fet;->X()V

    .line 1426
    .line 1427
    .line 1428
    :goto_1b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1429
    .line 1430
    return-object v0

    .line 1431
    :pswitch_11
    check-cast v0, La/aka;

    .line 1432
    .line 1433
    move-object/from16 v1, p1

    .line 1434
    .line 1435
    check-cast v1, La/y5d;

    .line 1436
    .line 1437
    move-object/from16 v2, p2

    .line 1438
    .line 1439
    check-cast v2, La/mm40;

    .line 1440
    .line 1441
    move-object/from16 v3, p3

    .line 1442
    .line 1443
    check-cast v3, La/fet;

    .line 1444
    .line 1445
    move-object/from16 v4, p4

    .line 1446
    .line 1447
    check-cast v4, Ljava/lang/Integer;

    .line 1448
    .line 1449
    invoke-static {v4, v1, v2}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 1450
    .line 1451
    .line 1452
    move-result v1

    .line 1453
    and-int/lit8 v4, v1, 0x30

    .line 1454
    .line 1455
    if-nez v4, :cond_4f

    .line 1456
    .line 1457
    invoke-virtual {v3, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1458
    .line 1459
    .line 1460
    move-result v4

    .line 1461
    if-eqz v4, :cond_4e

    .line 1462
    .line 1463
    move v13, v14

    .line 1464
    :cond_4e
    or-int/2addr v1, v13

    .line 1465
    :cond_4f
    and-int/lit16 v4, v1, 0x91

    .line 1466
    .line 1467
    if-eq v4, v12, :cond_50

    .line 1468
    .line 1469
    move v15, v8

    .line 1470
    :cond_50
    and-int/2addr v1, v8

    .line 1471
    invoke-virtual {v3, v1, v15}, La/fet;->U(IZ)Z

    .line 1472
    .line 1473
    .line 1474
    move-result v1

    .line 1475
    if-eqz v1, :cond_51

    .line 1476
    .line 1477
    iget-object v0, v0, La/aka;->b:La/bo8;

    .line 1478
    .line 1479
    invoke-static {v2, v0, v3}, La/ccq0;->e(La/mm40;La/bo8;La/fet;)V

    .line 1480
    .line 1481
    .line 1482
    goto :goto_1c

    .line 1483
    :cond_51
    invoke-virtual {v3}, La/fet;->X()V

    .line 1484
    .line 1485
    .line 1486
    :goto_1c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1487
    .line 1488
    return-object v0

    .line 1489
    :pswitch_12
    check-cast v0, La/zja;

    .line 1490
    .line 1491
    move-object/from16 v1, p1

    .line 1492
    .line 1493
    check-cast v1, La/y5d;

    .line 1494
    .line 1495
    move-object/from16 v2, p2

    .line 1496
    .line 1497
    check-cast v2, La/mm40;

    .line 1498
    .line 1499
    move-object/from16 v3, p3

    .line 1500
    .line 1501
    check-cast v3, La/fet;

    .line 1502
    .line 1503
    move-object/from16 v4, p4

    .line 1504
    .line 1505
    check-cast v4, Ljava/lang/Integer;

    .line 1506
    .line 1507
    invoke-static {v4, v1, v2}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 1508
    .line 1509
    .line 1510
    move-result v1

    .line 1511
    and-int/lit8 v4, v1, 0x30

    .line 1512
    .line 1513
    if-nez v4, :cond_53

    .line 1514
    .line 1515
    invoke-virtual {v3, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1516
    .line 1517
    .line 1518
    move-result v4

    .line 1519
    if-eqz v4, :cond_52

    .line 1520
    .line 1521
    move v13, v14

    .line 1522
    :cond_52
    or-int/2addr v1, v13

    .line 1523
    :cond_53
    and-int/lit16 v4, v1, 0x91

    .line 1524
    .line 1525
    if-eq v4, v12, :cond_54

    .line 1526
    .line 1527
    move v15, v8

    .line 1528
    :cond_54
    and-int/2addr v1, v8

    .line 1529
    invoke-virtual {v3, v1, v15}, La/fet;->U(IZ)Z

    .line 1530
    .line 1531
    .line 1532
    move-result v1

    .line 1533
    if-eqz v1, :cond_55

    .line 1534
    .line 1535
    iget-object v0, v0, La/zja;->b:La/ao8;

    .line 1536
    .line 1537
    invoke-static {v2, v0, v3}, La/unh0;->i(La/mm40;La/ao8;La/fet;)V

    .line 1538
    .line 1539
    .line 1540
    goto :goto_1d

    .line 1541
    :cond_55
    invoke-virtual {v3}, La/fet;->X()V

    .line 1542
    .line 1543
    .line 1544
    :goto_1d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1545
    .line 1546
    return-object v0

    .line 1547
    :pswitch_13
    check-cast v0, La/jja;

    .line 1548
    .line 1549
    move-object/from16 v1, p1

    .line 1550
    .line 1551
    check-cast v1, La/y5d;

    .line 1552
    .line 1553
    move-object/from16 v2, p2

    .line 1554
    .line 1555
    check-cast v2, La/mm40;

    .line 1556
    .line 1557
    move-object/from16 v3, p3

    .line 1558
    .line 1559
    check-cast v3, La/fet;

    .line 1560
    .line 1561
    move-object/from16 v4, p4

    .line 1562
    .line 1563
    check-cast v4, Ljava/lang/Integer;

    .line 1564
    .line 1565
    invoke-static {v4, v1, v2}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 1566
    .line 1567
    .line 1568
    move-result v1

    .line 1569
    and-int/lit8 v4, v1, 0x30

    .line 1570
    .line 1571
    if-nez v4, :cond_57

    .line 1572
    .line 1573
    invoke-virtual {v3, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1574
    .line 1575
    .line 1576
    move-result v4

    .line 1577
    if-eqz v4, :cond_56

    .line 1578
    .line 1579
    move v13, v14

    .line 1580
    :cond_56
    or-int/2addr v1, v13

    .line 1581
    :cond_57
    and-int/lit16 v4, v1, 0x91

    .line 1582
    .line 1583
    if-eq v4, v12, :cond_58

    .line 1584
    .line 1585
    move v15, v8

    .line 1586
    :cond_58
    and-int/2addr v1, v8

    .line 1587
    invoke-virtual {v3, v1, v15}, La/fet;->U(IZ)Z

    .line 1588
    .line 1589
    .line 1590
    move-result v1

    .line 1591
    if-eqz v1, :cond_59

    .line 1592
    .line 1593
    iget-object v0, v0, La/jja;->b:La/bo8;

    .line 1594
    .line 1595
    invoke-static {v2, v0, v3}, La/ccq0;->e(La/mm40;La/bo8;La/fet;)V

    .line 1596
    .line 1597
    .line 1598
    goto :goto_1e

    .line 1599
    :cond_59
    invoke-virtual {v3}, La/fet;->X()V

    .line 1600
    .line 1601
    .line 1602
    :goto_1e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1603
    .line 1604
    return-object v0

    .line 1605
    :pswitch_14
    check-cast v0, La/ija;

    .line 1606
    .line 1607
    move-object/from16 v1, p1

    .line 1608
    .line 1609
    check-cast v1, La/y5d;

    .line 1610
    .line 1611
    move-object/from16 v2, p2

    .line 1612
    .line 1613
    check-cast v2, La/mm40;

    .line 1614
    .line 1615
    move-object/from16 v3, p3

    .line 1616
    .line 1617
    check-cast v3, La/fet;

    .line 1618
    .line 1619
    move-object/from16 v4, p4

    .line 1620
    .line 1621
    check-cast v4, Ljava/lang/Integer;

    .line 1622
    .line 1623
    invoke-static {v4, v1, v2}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 1624
    .line 1625
    .line 1626
    move-result v1

    .line 1627
    and-int/lit8 v4, v1, 0x30

    .line 1628
    .line 1629
    if-nez v4, :cond_5b

    .line 1630
    .line 1631
    invoke-virtual {v3, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1632
    .line 1633
    .line 1634
    move-result v4

    .line 1635
    if-eqz v4, :cond_5a

    .line 1636
    .line 1637
    move v13, v14

    .line 1638
    :cond_5a
    or-int/2addr v1, v13

    .line 1639
    :cond_5b
    and-int/lit16 v4, v1, 0x91

    .line 1640
    .line 1641
    if-eq v4, v12, :cond_5c

    .line 1642
    .line 1643
    move v15, v8

    .line 1644
    :cond_5c
    and-int/2addr v1, v8

    .line 1645
    invoke-virtual {v3, v1, v15}, La/fet;->U(IZ)Z

    .line 1646
    .line 1647
    .line 1648
    move-result v1

    .line 1649
    if-eqz v1, :cond_5d

    .line 1650
    .line 1651
    iget-object v0, v0, La/ija;->b:La/ao8;

    .line 1652
    .line 1653
    invoke-static {v2, v0, v3}, La/unh0;->i(La/mm40;La/ao8;La/fet;)V

    .line 1654
    .line 1655
    .line 1656
    goto :goto_1f

    .line 1657
    :cond_5d
    invoke-virtual {v3}, La/fet;->X()V

    .line 1658
    .line 1659
    .line 1660
    :goto_1f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1661
    .line 1662
    return-object v0

    .line 1663
    :pswitch_15
    check-cast v0, La/sia;

    .line 1664
    .line 1665
    move-object/from16 v1, p1

    .line 1666
    .line 1667
    check-cast v1, La/y5d;

    .line 1668
    .line 1669
    move-object/from16 v2, p2

    .line 1670
    .line 1671
    check-cast v2, La/mm40;

    .line 1672
    .line 1673
    move-object/from16 v3, p3

    .line 1674
    .line 1675
    check-cast v3, La/fet;

    .line 1676
    .line 1677
    move-object/from16 v4, p4

    .line 1678
    .line 1679
    check-cast v4, Ljava/lang/Integer;

    .line 1680
    .line 1681
    invoke-static {v4, v1, v2}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 1682
    .line 1683
    .line 1684
    move-result v1

    .line 1685
    and-int/lit8 v4, v1, 0x30

    .line 1686
    .line 1687
    if-nez v4, :cond_5f

    .line 1688
    .line 1689
    invoke-virtual {v3, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1690
    .line 1691
    .line 1692
    move-result v4

    .line 1693
    if-eqz v4, :cond_5e

    .line 1694
    .line 1695
    move v13, v14

    .line 1696
    :cond_5e
    or-int/2addr v1, v13

    .line 1697
    :cond_5f
    and-int/lit16 v4, v1, 0x91

    .line 1698
    .line 1699
    if-eq v4, v12, :cond_60

    .line 1700
    .line 1701
    move v15, v8

    .line 1702
    :cond_60
    and-int/2addr v1, v8

    .line 1703
    invoke-virtual {v3, v1, v15}, La/fet;->U(IZ)Z

    .line 1704
    .line 1705
    .line 1706
    move-result v1

    .line 1707
    if-eqz v1, :cond_61

    .line 1708
    .line 1709
    iget-object v0, v0, La/sia;->c:La/bo8;

    .line 1710
    .line 1711
    invoke-static {v2, v0, v3}, La/ccq0;->e(La/mm40;La/bo8;La/fet;)V

    .line 1712
    .line 1713
    .line 1714
    goto :goto_20

    .line 1715
    :cond_61
    invoke-virtual {v3}, La/fet;->X()V

    .line 1716
    .line 1717
    .line 1718
    :goto_20
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1719
    .line 1720
    return-object v0

    .line 1721
    :pswitch_16
    check-cast v0, La/ria;

    .line 1722
    .line 1723
    move-object/from16 v1, p1

    .line 1724
    .line 1725
    check-cast v1, La/y5d;

    .line 1726
    .line 1727
    move-object/from16 v2, p2

    .line 1728
    .line 1729
    check-cast v2, La/mm40;

    .line 1730
    .line 1731
    move-object/from16 v3, p3

    .line 1732
    .line 1733
    check-cast v3, La/fet;

    .line 1734
    .line 1735
    move-object/from16 v4, p4

    .line 1736
    .line 1737
    check-cast v4, Ljava/lang/Integer;

    .line 1738
    .line 1739
    invoke-static {v4, v1, v2}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 1740
    .line 1741
    .line 1742
    move-result v1

    .line 1743
    and-int/lit8 v4, v1, 0x30

    .line 1744
    .line 1745
    if-nez v4, :cond_63

    .line 1746
    .line 1747
    invoke-virtual {v3, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1748
    .line 1749
    .line 1750
    move-result v4

    .line 1751
    if-eqz v4, :cond_62

    .line 1752
    .line 1753
    move v13, v14

    .line 1754
    :cond_62
    or-int/2addr v1, v13

    .line 1755
    :cond_63
    and-int/lit16 v4, v1, 0x91

    .line 1756
    .line 1757
    if-eq v4, v12, :cond_64

    .line 1758
    .line 1759
    move v15, v8

    .line 1760
    :cond_64
    and-int/2addr v1, v8

    .line 1761
    invoke-virtual {v3, v1, v15}, La/fet;->U(IZ)Z

    .line 1762
    .line 1763
    .line 1764
    move-result v1

    .line 1765
    if-eqz v1, :cond_65

    .line 1766
    .line 1767
    iget-object v0, v0, La/ria;->c:La/ao8;

    .line 1768
    .line 1769
    invoke-static {v2, v0, v3}, La/unh0;->i(La/mm40;La/ao8;La/fet;)V

    .line 1770
    .line 1771
    .line 1772
    goto :goto_21

    .line 1773
    :cond_65
    invoke-virtual {v3}, La/fet;->X()V

    .line 1774
    .line 1775
    .line 1776
    :goto_21
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1777
    .line 1778
    return-object v0

    .line 1779
    :pswitch_17
    check-cast v0, La/vaa;

    .line 1780
    .line 1781
    move-object/from16 v1, p1

    .line 1782
    .line 1783
    check-cast v1, La/y5d;

    .line 1784
    .line 1785
    move-object/from16 v2, p2

    .line 1786
    .line 1787
    check-cast v2, La/mm40;

    .line 1788
    .line 1789
    move-object/from16 v3, p3

    .line 1790
    .line 1791
    check-cast v3, La/fet;

    .line 1792
    .line 1793
    move-object/from16 v4, p4

    .line 1794
    .line 1795
    check-cast v4, Ljava/lang/Integer;

    .line 1796
    .line 1797
    invoke-static {v4, v1, v2}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 1798
    .line 1799
    .line 1800
    move-result v1

    .line 1801
    and-int/lit8 v4, v1, 0x30

    .line 1802
    .line 1803
    if-nez v4, :cond_67

    .line 1804
    .line 1805
    invoke-virtual {v3, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1806
    .line 1807
    .line 1808
    move-result v4

    .line 1809
    if-eqz v4, :cond_66

    .line 1810
    .line 1811
    move v13, v14

    .line 1812
    :cond_66
    or-int/2addr v1, v13

    .line 1813
    :cond_67
    and-int/lit16 v4, v1, 0x91

    .line 1814
    .line 1815
    if-eq v4, v12, :cond_68

    .line 1816
    .line 1817
    move v15, v8

    .line 1818
    :cond_68
    and-int/lit8 v4, v1, 0x1

    .line 1819
    .line 1820
    invoke-virtual {v3, v4, v15}, La/fet;->U(IZ)Z

    .line 1821
    .line 1822
    .line 1823
    move-result v4

    .line 1824
    if-eqz v4, :cond_69

    .line 1825
    .line 1826
    iget-object v0, v0, La/vaa;->h:La/j83;

    .line 1827
    .line 1828
    shr-int/2addr v1, v9

    .line 1829
    and-int/lit8 v1, v1, 0xe

    .line 1830
    .line 1831
    invoke-static {v2, v0, v3, v1}, La/knx;->l(La/mm40;La/j83;La/fet;I)V

    .line 1832
    .line 1833
    .line 1834
    goto :goto_22

    .line 1835
    :cond_69
    invoke-virtual {v3}, La/fet;->X()V

    .line 1836
    .line 1837
    .line 1838
    :goto_22
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1839
    .line 1840
    return-object v0

    .line 1841
    :pswitch_18
    check-cast v0, La/qj8;

    .line 1842
    .line 1843
    iget-object v0, v0, La/qj8;->e:La/a4x;

    .line 1844
    .line 1845
    move-object/from16 v1, p1

    .line 1846
    .line 1847
    check-cast v1, La/g9z;

    .line 1848
    .line 1849
    move-object/from16 v2, p2

    .line 1850
    .line 1851
    check-cast v2, Ljava/lang/Integer;

    .line 1852
    .line 1853
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1854
    .line 1855
    .line 1856
    move-result v2

    .line 1857
    move-object/from16 v3, p3

    .line 1858
    .line 1859
    check-cast v3, La/fet;

    .line 1860
    .line 1861
    move-object/from16 v5, p4

    .line 1862
    .line 1863
    check-cast v5, Ljava/lang/Integer;

    .line 1864
    .line 1865
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1866
    .line 1867
    .line 1868
    move-result v5

    .line 1869
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1870
    .line 1871
    .line 1872
    and-int/lit8 v1, v5, 0x30

    .line 1873
    .line 1874
    if-nez v1, :cond_6b

    .line 1875
    .line 1876
    invoke-virtual {v3, v2}, La/fet;->e(I)Z

    .line 1877
    .line 1878
    .line 1879
    move-result v1

    .line 1880
    if-eqz v1, :cond_6a

    .line 1881
    .line 1882
    move v13, v14

    .line 1883
    :cond_6a
    or-int/2addr v5, v13

    .line 1884
    :cond_6b
    and-int/lit16 v1, v5, 0x91

    .line 1885
    .line 1886
    if-eq v1, v12, :cond_6c

    .line 1887
    .line 1888
    move v1, v8

    .line 1889
    goto :goto_23

    .line 1890
    :cond_6c
    move v1, v15

    .line 1891
    :goto_23
    and-int/2addr v5, v8

    .line 1892
    invoke-virtual {v3, v5, v1}, La/fet;->U(IZ)Z

    .line 1893
    .line 1894
    .line 1895
    move-result v1

    .line 1896
    if-eqz v1, :cond_6e

    .line 1897
    .line 1898
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1899
    .line 1900
    .line 1901
    move-result-object v1

    .line 1902
    check-cast v1, La/pan;

    .line 1903
    .line 1904
    sget-object v5, La/jm40;->b:La/jm40;

    .line 1905
    .line 1906
    invoke-static {v5, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 1907
    .line 1908
    .line 1909
    move-result-object v4

    .line 1910
    invoke-static {v4, v1, v3, v10}, La/f1t0;->q(La/mm40;La/pan;La/fet;I)V

    .line 1911
    .line 1912
    .line 1913
    invoke-static {v0}, La/q3d;->i(Ljava/util/List;)I

    .line 1914
    .line 1915
    .line 1916
    move-result v0

    .line 1917
    if-eq v2, v0, :cond_6d

    .line 1918
    .line 1919
    const v0, -0x2b515760

    .line 1920
    .line 1921
    .line 1922
    invoke-virtual {v3, v0}, La/fet;->e0(I)V

    .line 1923
    .line 1924
    .line 1925
    sget-object v0, La/qmk;->a:La/zcl;

    .line 1926
    .line 1927
    const/high16 v0, 0x41000000    # 8.0f

    .line 1928
    .line 1929
    invoke-static {v5, v0, v3, v15}, La/rz4;->t(La/jm40;FLa/fet;Z)V

    .line 1930
    .line 1931
    .line 1932
    goto :goto_24

    .line 1933
    :cond_6d
    const v0, -0x2b50274f

    .line 1934
    .line 1935
    .line 1936
    invoke-virtual {v3, v0}, La/fet;->e0(I)V

    .line 1937
    .line 1938
    .line 1939
    invoke-virtual {v3, v15}, La/fet;->r(Z)V

    .line 1940
    .line 1941
    .line 1942
    goto :goto_24

    .line 1943
    :cond_6e
    invoke-virtual {v3}, La/fet;->X()V

    .line 1944
    .line 1945
    .line 1946
    :goto_24
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1947
    .line 1948
    return-object v0

    .line 1949
    :pswitch_19
    check-cast v0, La/d54;

    .line 1950
    .line 1951
    move-object/from16 v1, p1

    .line 1952
    .line 1953
    check-cast v1, La/mm40;

    .line 1954
    .line 1955
    move-object/from16 v6, p2

    .line 1956
    .line 1957
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 1958
    .line 1959
    move-object/from16 v4, p3

    .line 1960
    .line 1961
    check-cast v4, La/fet;

    .line 1962
    .line 1963
    move-object/from16 v5, p4

    .line 1964
    .line 1965
    check-cast v5, Ljava/lang/Integer;

    .line 1966
    .line 1967
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1968
    .line 1969
    .line 1970
    move-result v5

    .line 1971
    sget-object v9, La/d54;->R1:La/gfk0;

    .line 1972
    .line 1973
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1974
    .line 1975
    .line 1976
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1977
    .line 1978
    .line 1979
    and-int/lit8 v9, v5, 0x6

    .line 1980
    .line 1981
    if-nez v9, :cond_70

    .line 1982
    .line 1983
    invoke-virtual {v4, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1984
    .line 1985
    .line 1986
    move-result v9

    .line 1987
    if-eqz v9, :cond_6f

    .line 1988
    .line 1989
    const/16 v16, 0x4

    .line 1990
    .line 1991
    goto :goto_25

    .line 1992
    :cond_6f
    move/from16 v16, v11

    .line 1993
    .line 1994
    :goto_25
    or-int v9, v5, v16

    .line 1995
    .line 1996
    goto :goto_26

    .line 1997
    :cond_70
    move v9, v5

    .line 1998
    :goto_26
    and-int/lit8 v5, v5, 0x30

    .line 1999
    .line 2000
    if-nez v5, :cond_72

    .line 2001
    .line 2002
    invoke-virtual {v4, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2003
    .line 2004
    .line 2005
    move-result v5

    .line 2006
    if-eqz v5, :cond_71

    .line 2007
    .line 2008
    move v13, v14

    .line 2009
    :cond_71
    or-int/2addr v9, v13

    .line 2010
    :cond_72
    and-int/lit16 v5, v9, 0x93

    .line 2011
    .line 2012
    if-eq v5, v7, :cond_73

    .line 2013
    .line 2014
    move v15, v8

    .line 2015
    :cond_73
    and-int/lit8 v5, v9, 0x1

    .line 2016
    .line 2017
    invoke-virtual {v4, v5, v15}, La/fet;->U(IZ)Z

    .line 2018
    .line 2019
    .line 2020
    move-result v5

    .line 2021
    if-eqz v5, :cond_79

    .line 2022
    .line 2023
    move-object v5, v1

    .line 2024
    iget-object v1, v0, La/d54;->M1:La/jdk0;

    .line 2025
    .line 2026
    if-eqz v1, :cond_78

    .line 2027
    .line 2028
    invoke-virtual {v4, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2029
    .line 2030
    .line 2031
    move-result v3

    .line 2032
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 2033
    .line 2034
    .line 2035
    move-result-object v7

    .line 2036
    if-nez v3, :cond_74

    .line 2037
    .line 2038
    if-ne v7, v2, :cond_75

    .line 2039
    .line 2040
    :cond_74
    new-instance v7, La/b54;

    .line 2041
    .line 2042
    invoke-direct {v7, v0, v11}, La/b54;-><init>(La/d54;B)V

    .line 2043
    .line 2044
    .line 2045
    invoke-virtual {v4, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2046
    .line 2047
    .line 2048
    :cond_75
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 2049
    .line 2050
    invoke-virtual {v4, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2051
    .line 2052
    .line 2053
    move-result v3

    .line 2054
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 2055
    .line 2056
    .line 2057
    move-result-object v8

    .line 2058
    if-nez v3, :cond_76

    .line 2059
    .line 2060
    if-ne v8, v2, :cond_77

    .line 2061
    .line 2062
    :cond_76
    new-instance v8, La/b33;

    .line 2063
    .line 2064
    const/16 v2, 0xd

    .line 2065
    .line 2066
    invoke-direct {v8, v0, v2}, La/b33;-><init>(Ljava/lang/Object;B)V

    .line 2067
    .line 2068
    .line 2069
    invoke-virtual {v4, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2070
    .line 2071
    .line 2072
    :cond_77
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 2073
    .line 2074
    and-int/lit8 v2, v9, 0xe

    .line 2075
    .line 2076
    shl-int/lit8 v3, v9, 0x9

    .line 2077
    .line 2078
    const v9, 0xe000

    .line 2079
    .line 2080
    .line 2081
    and-int/2addr v3, v9

    .line 2082
    or-int/2addr v2, v3

    .line 2083
    move-object v3, v8

    .line 2084
    move v8, v2

    .line 2085
    move-object v2, v5

    .line 2086
    move-object v5, v3

    .line 2087
    move-object v3, v7

    .line 2088
    move-object v7, v4

    .line 2089
    move-object v4, v3

    .line 2090
    move-object v3, v0

    .line 2091
    invoke-virtual/range {v1 .. v8}, La/jdk0;->a(La/mm40;Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 2092
    .line 2093
    .line 2094
    goto :goto_27

    .line 2095
    :cond_78
    const-string v0, "authLoginDefaultFactory"

    .line 2096
    .line 2097
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2098
    .line 2099
    .line 2100
    throw v3

    .line 2101
    :cond_79
    move-object v7, v4

    .line 2102
    invoke-virtual {v7}, La/fet;->X()V

    .line 2103
    .line 2104
    .line 2105
    :goto_27
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2106
    .line 2107
    return-object v0

    .line 2108
    :pswitch_1a
    check-cast v0, La/v03;

    .line 2109
    .line 2110
    move-object/from16 v1, p1

    .line 2111
    .line 2112
    check-cast v1, La/nrq;

    .line 2113
    .line 2114
    move-object/from16 v2, p2

    .line 2115
    .line 2116
    check-cast v2, La/psq;

    .line 2117
    .line 2118
    move-object/from16 v3, p3

    .line 2119
    .line 2120
    check-cast v3, La/lsq;

    .line 2121
    .line 2122
    move-object/from16 v4, p4

    .line 2123
    .line 2124
    check-cast v4, La/msq;

    .line 2125
    .line 2126
    iget-object v5, v0, La/v03;->e:La/mrq;

    .line 2127
    .line 2128
    iget v3, v3, La/lsq;->a:I

    .line 2129
    .line 2130
    iget v4, v4, La/msq;->a:I

    .line 2131
    .line 2132
    check-cast v5, La/orq;

    .line 2133
    .line 2134
    invoke-virtual {v5, v1, v2, v3, v4}, La/orq;->b(La/nrq;La/psq;II)La/b1t0;

    .line 2135
    .line 2136
    .line 2137
    move-result-object v1

    .line 2138
    instance-of v2, v1, La/a1t0;

    .line 2139
    .line 2140
    if-nez v2, :cond_7a

    .line 2141
    .line 2142
    new-instance v2, La/y3v;

    .line 2143
    .line 2144
    iget-object v3, v0, La/v03;->j:La/y3v;

    .line 2145
    .line 2146
    invoke-direct {v2, v1, v3}, La/y3v;-><init>(La/b1t0;La/y3v;)V

    .line 2147
    .line 2148
    .line 2149
    iput-object v2, v0, La/v03;->j:La/y3v;

    .line 2150
    .line 2151
    iget-object v0, v2, La/y3v;->d:Ljava/lang/Object;

    .line 2152
    .line 2153
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2154
    .line 2155
    .line 2156
    check-cast v0, Landroid/graphics/Typeface;

    .line 2157
    .line 2158
    goto :goto_28

    .line 2159
    :cond_7a
    check-cast v1, La/a1t0;

    .line 2160
    .line 2161
    iget-object v0, v1, La/a1t0;->a:Ljava/lang/Object;

    .line 2162
    .line 2163
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2164
    .line 2165
    .line 2166
    check-cast v0, Landroid/graphics/Typeface;

    .line 2167
    .line 2168
    :goto_28
    return-object v0

    .line 2169
    :pswitch_1b
    check-cast v0, La/xw50;

    .line 2170
    .line 2171
    move-object/from16 v1, p1

    .line 2172
    .line 2173
    check-cast v1, La/rk80;

    .line 2174
    .line 2175
    move-object/from16 v2, p2

    .line 2176
    .line 2177
    check-cast v2, Ljava/lang/Integer;

    .line 2178
    .line 2179
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 2180
    .line 2181
    .line 2182
    move-result v2

    .line 2183
    move-object/from16 v3, p3

    .line 2184
    .line 2185
    check-cast v3, La/fet;

    .line 2186
    .line 2187
    move-object/from16 v4, p4

    .line 2188
    .line 2189
    check-cast v4, Ljava/lang/Integer;

    .line 2190
    .line 2191
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 2192
    .line 2193
    .line 2194
    move-result v4

    .line 2195
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2196
    .line 2197
    .line 2198
    and-int/lit8 v1, v4, 0x30

    .line 2199
    .line 2200
    if-nez v1, :cond_7c

    .line 2201
    .line 2202
    invoke-virtual {v3, v2}, La/fet;->e(I)Z

    .line 2203
    .line 2204
    .line 2205
    move-result v1

    .line 2206
    if-eqz v1, :cond_7b

    .line 2207
    .line 2208
    move v13, v14

    .line 2209
    :cond_7b
    or-int/2addr v4, v13

    .line 2210
    :cond_7c
    and-int/lit16 v1, v4, 0x91

    .line 2211
    .line 2212
    if-eq v1, v12, :cond_7d

    .line 2213
    .line 2214
    move v1, v8

    .line 2215
    goto :goto_29

    .line 2216
    :cond_7d
    move v1, v15

    .line 2217
    :goto_29
    and-int/2addr v4, v8

    .line 2218
    invoke-virtual {v3, v4, v1}, La/fet;->U(IZ)Z

    .line 2219
    .line 2220
    .line 2221
    move-result v1

    .line 2222
    if-eqz v1, :cond_80

    .line 2223
    .line 2224
    if-eqz v2, :cond_7f

    .line 2225
    .line 2226
    if-eq v2, v8, :cond_7e

    .line 2227
    .line 2228
    const v0, -0x22d88896

    .line 2229
    .line 2230
    .line 2231
    invoke-virtual {v3, v0}, La/fet;->e0(I)V

    .line 2232
    .line 2233
    .line 2234
    invoke-virtual {v3, v15}, La/fet;->r(Z)V

    .line 2235
    .line 2236
    .line 2237
    goto :goto_2a

    .line 2238
    :cond_7e
    const v1, -0x22db664b

    .line 2239
    .line 2240
    .line 2241
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 2242
    .line 2243
    .line 2244
    sget-object v1, La/o7k0;->c:La/n0q;

    .line 2245
    .line 2246
    iget-object v0, v0, La/xw50;->f:Ljava/util/List;

    .line 2247
    .line 2248
    invoke-static {v1, v0, v3, v10}, La/q5x;->m(La/mm40;Ljava/util/List;La/fet;I)V

    .line 2249
    .line 2250
    .line 2251
    invoke-virtual {v3, v15}, La/fet;->r(Z)V

    .line 2252
    .line 2253
    .line 2254
    goto :goto_2a

    .line 2255
    :cond_7f
    const v1, -0x22de7ccb

    .line 2256
    .line 2257
    .line 2258
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 2259
    .line 2260
    .line 2261
    sget-object v1, La/o7k0;->c:La/n0q;

    .line 2262
    .line 2263
    iget-object v0, v0, La/xw50;->e:Ljava/util/List;

    .line 2264
    .line 2265
    invoke-static {v1, v0, v3, v10}, La/q5x;->m(La/mm40;Ljava/util/List;La/fet;I)V

    .line 2266
    .line 2267
    .line 2268
    invoke-virtual {v3, v15}, La/fet;->r(Z)V

    .line 2269
    .line 2270
    .line 2271
    goto :goto_2a

    .line 2272
    :cond_80
    invoke-virtual {v3}, La/fet;->X()V

    .line 2273
    .line 2274
    .line 2275
    :goto_2a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2276
    .line 2277
    return-object v0

    .line 2278
    :pswitch_1c
    check-cast v0, La/ewh;

    .line 2279
    .line 2280
    move-object/from16 v1, p1

    .line 2281
    .line 2282
    check-cast v1, La/rk80;

    .line 2283
    .line 2284
    move-object/from16 v3, p2

    .line 2285
    .line 2286
    check-cast v3, Ljava/lang/Integer;

    .line 2287
    .line 2288
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 2289
    .line 2290
    .line 2291
    move-result v3

    .line 2292
    move-object/from16 v4, p3

    .line 2293
    .line 2294
    check-cast v4, La/fet;

    .line 2295
    .line 2296
    move-object/from16 v5, p4

    .line 2297
    .line 2298
    check-cast v5, Ljava/lang/Integer;

    .line 2299
    .line 2300
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 2301
    .line 2302
    .line 2303
    move-result v5

    .line 2304
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2305
    .line 2306
    .line 2307
    and-int/lit8 v1, v5, 0x30

    .line 2308
    .line 2309
    if-nez v1, :cond_82

    .line 2310
    .line 2311
    invoke-virtual {v4, v3}, La/fet;->e(I)Z

    .line 2312
    .line 2313
    .line 2314
    move-result v1

    .line 2315
    if-eqz v1, :cond_81

    .line 2316
    .line 2317
    move v13, v14

    .line 2318
    :cond_81
    or-int/2addr v5, v13

    .line 2319
    :cond_82
    and-int/lit16 v1, v5, 0x91

    .line 2320
    .line 2321
    if-eq v1, v12, :cond_83

    .line 2322
    .line 2323
    move v15, v8

    .line 2324
    :cond_83
    and-int/lit8 v1, v5, 0x1

    .line 2325
    .line 2326
    invoke-virtual {v4, v1, v15}, La/fet;->U(IZ)Z

    .line 2327
    .line 2328
    .line 2329
    move-result v1

    .line 2330
    if-eqz v1, :cond_86

    .line 2331
    .line 2332
    iget-object v0, v0, La/ewh;->d:La/a4x;

    .line 2333
    .line 2334
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2335
    .line 2336
    .line 2337
    move-result-object v0

    .line 2338
    check-cast v0, La/a4x;

    .line 2339
    .line 2340
    sget-object v16, La/o7k0;->c:La/n0q;

    .line 2341
    .line 2342
    sget-object v1, La/qmk;->a:La/zcl;

    .line 2343
    .line 2344
    const/high16 v1, 0x41c00000    # 24.0f

    .line 2345
    .line 2346
    const/4 v3, 0x7

    .line 2347
    const/4 v5, 0x0

    .line 2348
    invoke-static {v5, v5, v5, v1, v3}, La/s5x0;->u(FFFFI)La/lh80;

    .line 2349
    .line 2350
    .line 2351
    move-result-object v18

    .line 2352
    invoke-virtual {v4, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 2353
    .line 2354
    .line 2355
    move-result v1

    .line 2356
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 2357
    .line 2358
    .line 2359
    move-result-object v3

    .line 2360
    if-nez v1, :cond_84

    .line 2361
    .line 2362
    if-ne v3, v2, :cond_85

    .line 2363
    .line 2364
    :cond_84
    new-instance v3, La/oea;

    .line 2365
    .line 2366
    const/4 v1, 0x5

    .line 2367
    invoke-direct {v3, v0, v1}, La/oea;-><init>(La/a4x;B)V

    .line 2368
    .line 2369
    .line 2370
    invoke-virtual {v4, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2371
    .line 2372
    .line 2373
    :cond_85
    move-object/from16 v24, v3

    .line 2374
    .line 2375
    check-cast v24, Lkotlin/jvm/functions/Function1;

    .line 2376
    .line 2377
    const/16 v26, 0x6

    .line 2378
    .line 2379
    const/16 v27, 0x1fa

    .line 2380
    .line 2381
    const/16 v17, 0x0

    .line 2382
    .line 2383
    const/16 v19, 0x0

    .line 2384
    .line 2385
    const/16 v20, 0x0

    .line 2386
    .line 2387
    const/16 v21, 0x0

    .line 2388
    .line 2389
    const/16 v22, 0x0

    .line 2390
    .line 2391
    const/16 v23, 0x0

    .line 2392
    .line 2393
    move-object/from16 v25, v4

    .line 2394
    .line 2395
    invoke-static/range {v16 .. v27}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 2396
    .line 2397
    .line 2398
    goto :goto_2b

    .line 2399
    :cond_86
    move-object/from16 v25, v4

    .line 2400
    .line 2401
    invoke-virtual/range {v25 .. v25}, La/fet;->X()V

    .line 2402
    .line 2403
    .line 2404
    :goto_2b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2405
    .line 2406
    return-object v0

    .line 2407
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
