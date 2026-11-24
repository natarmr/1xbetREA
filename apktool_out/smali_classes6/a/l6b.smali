.class public final La/l6b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ugd;

.field public final synthetic c:La/ugd;

.field public final synthetic d:La/ugd;

.field public final synthetic e:La/ugd;

.field public final synthetic f:La/ugd;

.field public final synthetic g:Ljava/util/List;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;La/ugd;La/ugd;Ljava/lang/Object;La/ugd;La/ugd;La/ugd;B)V
    .locals 0

    .line 1
    iput-byte p8, p0, La/l6b;->a:B

    iput-object p1, p0, La/l6b;->g:Ljava/util/List;

    iput-object p2, p0, La/l6b;->b:La/ugd;

    iput-object p3, p0, La/l6b;->c:La/ugd;

    iput-object p4, p0, La/l6b;->h:Ljava/lang/Object;

    iput-object p5, p0, La/l6b;->d:La/ugd;

    iput-object p6, p0, La/l6b;->e:La/ugd;

    iput-object p7, p0, La/l6b;->f:La/ugd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/l6b;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/l6b;->h:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, v0, La/l6b;->f:La/ugd;

    .line 8
    .line 9
    iget-object v4, v0, La/l6b;->e:La/ugd;

    .line 10
    .line 11
    iget-object v5, v0, La/l6b;->g:Ljava/util/List;

    .line 12
    .line 13
    const/16 v6, 0x92

    .line 14
    .line 15
    const/16 v8, 0x20

    .line 16
    .line 17
    const/4 v9, 0x2

    .line 18
    const/4 v10, 0x4

    .line 19
    iget-object v11, v0, La/l6b;->b:La/ugd;

    .line 20
    .line 21
    iget-object v12, v0, La/l6b;->d:La/ugd;

    .line 22
    .line 23
    const/4 v13, 0x0

    .line 24
    packed-switch v1, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    move-object/from16 v1, p1

    .line 28
    .line 29
    check-cast v1, La/g9z;

    .line 30
    .line 31
    move-object/from16 v15, p2

    .line 32
    .line 33
    check-cast v15, Ljava/lang/Number;

    .line 34
    .line 35
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 36
    .line 37
    .line 38
    move-result v15

    .line 39
    move-object/from16 v7, p3

    .line 40
    .line 41
    check-cast v7, La/fet;

    .line 42
    .line 43
    move-object/from16 v17, p4

    .line 44
    .line 45
    check-cast v17, Ljava/lang/Number;

    .line 46
    .line 47
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Number;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result v17

    .line 51
    and-int/lit8 v18, v17, 0x6

    .line 52
    .line 53
    if-nez v18, :cond_1

    .line 54
    .line 55
    invoke-virtual {v7, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v18

    .line 59
    if-eqz v18, :cond_0

    .line 60
    .line 61
    move v9, v10

    .line 62
    :cond_0
    or-int v9, v17, v9

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    move/from16 v9, v17

    .line 66
    .line 67
    :goto_0
    and-int/lit8 v10, v17, 0x30

    .line 68
    .line 69
    if-nez v10, :cond_3

    .line 70
    .line 71
    invoke-virtual {v7, v15}, La/fet;->e(I)Z

    .line 72
    .line 73
    .line 74
    move-result v10

    .line 75
    if-eqz v10, :cond_2

    .line 76
    .line 77
    move/from16 v16, v8

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    const/16 v16, 0x10

    .line 81
    .line 82
    :goto_1
    or-int v9, v9, v16

    .line 83
    .line 84
    :cond_3
    and-int/lit16 v8, v9, 0x93

    .line 85
    .line 86
    if-eq v8, v6, :cond_4

    .line 87
    .line 88
    const/4 v6, 0x1

    .line 89
    goto :goto_2

    .line 90
    :cond_4
    move v6, v13

    .line 91
    :goto_2
    and-int/lit8 v8, v9, 0x1

    .line 92
    .line 93
    invoke-virtual {v7, v8, v6}, La/fet;->U(IZ)Z

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    if-eqz v6, :cond_b

    .line 98
    .line 99
    invoke-interface {v5, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    check-cast v5, La/gy20;

    .line 104
    .line 105
    const v6, 0x40c847b

    .line 106
    .line 107
    .line 108
    invoke-virtual {v7, v6}, La/fet;->e0(I)V

    .line 109
    .line 110
    .line 111
    if-eqz v15, :cond_5

    .line 112
    .line 113
    const v6, 0x40c3909

    .line 114
    .line 115
    .line 116
    invoke-virtual {v7, v6}, La/fet;->e0(I)V

    .line 117
    .line 118
    .line 119
    and-int/lit8 v6, v9, 0xe

    .line 120
    .line 121
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    invoke-virtual {v11, v1, v7, v6}, La/ugd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v7, v13}, La/fet;->r(Z)V

    .line 129
    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_5
    const v6, 0x40cda74

    .line 133
    .line 134
    .line 135
    invoke-virtual {v7, v6}, La/fet;->e0(I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v7, v13}, La/fet;->r(Z)V

    .line 139
    .line 140
    .line 141
    :goto_3
    if-eqz v5, :cond_9

    .line 142
    .line 143
    instance-of v6, v5, La/fv20;

    .line 144
    .line 145
    const/4 v8, 0x7

    .line 146
    const/4 v10, 0x0

    .line 147
    sget-object v14, La/jm40;->b:La/jm40;

    .line 148
    .line 149
    if-eqz v6, :cond_6

    .line 150
    .line 151
    const v0, 0x40e1e04

    .line 152
    .line 153
    .line 154
    invoke-virtual {v7, v0}, La/fet;->e0(I)V

    .line 155
    .line 156
    .line 157
    invoke-static {v1, v14, v10, v8}, La/g9z;->b(La/g9z;La/mm40;La/nul0;I)La/mm40;

    .line 158
    .line 159
    .line 160
    move-result-object v20

    .line 161
    move-object v0, v5

    .line 162
    check-cast v0, La/fv20;

    .line 163
    .line 164
    iget-object v0, v0, La/fv20;->a:La/uv20;

    .line 165
    .line 166
    iget-boolean v0, v0, La/uv20;->d:Z

    .line 167
    .line 168
    new-instance v3, La/a030;

    .line 169
    .line 170
    invoke-direct {v3, v12, v5, v13}, La/a030;-><init>(La/ugd;La/gy20;B)V

    .line 171
    .line 172
    .line 173
    const v6, 0x5079f1e0

    .line 174
    .line 175
    .line 176
    invoke-static {v6, v3, v7}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 177
    .line 178
    .line 179
    move-result-object v17

    .line 180
    new-instance v3, La/b030;

    .line 181
    .line 182
    invoke-direct {v3, v5, v4}, La/b030;-><init>(La/gy20;La/ugd;)V

    .line 183
    .line 184
    .line 185
    const v4, 0x6d7b1971

    .line 186
    .line 187
    .line 188
    invoke-static {v4, v3, v7}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 189
    .line 190
    .line 191
    move-result-object v18

    .line 192
    const/16 v16, 0xd80

    .line 193
    .line 194
    move/from16 v21, v0

    .line 195
    .line 196
    move-object/from16 v19, v7

    .line 197
    .line 198
    invoke-static/range {v16 .. v21}, La/n2x;->d(ILa/ugd;La/ugd;La/fet;La/mm40;Z)V

    .line 199
    .line 200
    .line 201
    move-object/from16 v4, v19

    .line 202
    .line 203
    invoke-virtual {v4, v13}, La/fet;->r(Z)V

    .line 204
    .line 205
    .line 206
    goto :goto_4

    .line 207
    :cond_6
    move-object v4, v7

    .line 208
    instance-of v6, v5, La/or20;

    .line 209
    .line 210
    if-eqz v6, :cond_7

    .line 211
    .line 212
    const v0, 0x4164ea2

    .line 213
    .line 214
    .line 215
    invoke-virtual {v4, v0}, La/fet;->e0(I)V

    .line 216
    .line 217
    .line 218
    invoke-static {v1, v14, v10, v8}, La/g9z;->b(La/g9z;La/mm40;La/nul0;I)La/mm40;

    .line 219
    .line 220
    .line 221
    move-result-object v20

    .line 222
    move-object v0, v5

    .line 223
    check-cast v0, La/or20;

    .line 224
    .line 225
    iget-object v0, v0, La/or20;->a:La/uv20;

    .line 226
    .line 227
    iget-boolean v0, v0, La/uv20;->d:Z

    .line 228
    .line 229
    new-instance v6, La/a030;

    .line 230
    .line 231
    const/4 v7, 0x1

    .line 232
    invoke-direct {v6, v12, v5, v7}, La/a030;-><init>(La/ugd;La/gy20;B)V

    .line 233
    .line 234
    .line 235
    const v7, -0xfe0f4e9

    .line 236
    .line 237
    .line 238
    invoke-static {v7, v6, v4}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 239
    .line 240
    .line 241
    move-result-object v17

    .line 242
    new-instance v6, La/b030;

    .line 243
    .line 244
    invoke-direct {v6, v3, v5}, La/b030;-><init>(La/ugd;La/gy20;)V

    .line 245
    .line 246
    .line 247
    const v3, -0x2e8b6d98

    .line 248
    .line 249
    .line 250
    invoke-static {v3, v6, v4}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 251
    .line 252
    .line 253
    move-result-object v18

    .line 254
    const/16 v16, 0xd80

    .line 255
    .line 256
    move/from16 v21, v0

    .line 257
    .line 258
    move-object/from16 v19, v4

    .line 259
    .line 260
    invoke-static/range {v16 .. v21}, La/n2x;->d(ILa/ugd;La/ugd;La/fet;La/mm40;Z)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v4, v13}, La/fet;->r(Z)V

    .line 264
    .line 265
    .line 266
    goto :goto_4

    .line 267
    :cond_7
    instance-of v3, v5, La/vwv;

    .line 268
    .line 269
    if-eqz v3, :cond_a

    .line 270
    .line 271
    const v3, -0x316a7440

    .line 272
    .line 273
    .line 274
    invoke-virtual {v4, v3}, La/fet;->e0(I)V

    .line 275
    .line 276
    .line 277
    iget-object v0, v0, La/l6b;->c:La/ugd;

    .line 278
    .line 279
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    invoke-virtual {v0, v5, v4, v3}, La/ugd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v4, v13}, La/fet;->r(Z)V

    .line 287
    .line 288
    .line 289
    :goto_4
    check-cast v2, La/l7m0;

    .line 290
    .line 291
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    check-cast v0, Ljava/util/List;

    .line 296
    .line 297
    invoke-static {v0}, La/q3d;->i(Ljava/util/List;)I

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    if-ne v15, v0, :cond_8

    .line 302
    .line 303
    const v0, 0x41d2929

    .line 304
    .line 305
    .line 306
    invoke-virtual {v4, v0}, La/fet;->e0(I)V

    .line 307
    .line 308
    .line 309
    and-int/lit8 v0, v9, 0xe

    .line 310
    .line 311
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    invoke-virtual {v11, v1, v4, v0}, La/ugd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v4, v13}, La/fet;->r(Z)V

    .line 319
    .line 320
    .line 321
    goto :goto_5

    .line 322
    :cond_8
    const v0, 0x41dca94

    .line 323
    .line 324
    .line 325
    invoke-virtual {v4, v0}, La/fet;->e0(I)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v4, v13}, La/fet;->r(Z)V

    .line 329
    .line 330
    .line 331
    :goto_5
    invoke-virtual {v4, v13}, La/fet;->r(Z)V

    .line 332
    .line 333
    .line 334
    goto :goto_6

    .line 335
    :cond_9
    move-object v4, v7

    .line 336
    :cond_a
    const v0, -0x316aeb1c

    .line 337
    .line 338
    .line 339
    invoke-static {v0, v4, v13}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    throw v0

    .line 344
    :cond_b
    move-object v4, v7

    .line 345
    invoke-virtual {v4}, La/fet;->X()V

    .line 346
    .line 347
    .line 348
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 349
    .line 350
    return-object v0

    .line 351
    :pswitch_0
    const/4 v7, 0x1

    .line 352
    move-object/from16 v1, p1

    .line 353
    .line 354
    check-cast v1, La/g9z;

    .line 355
    .line 356
    move-object/from16 v14, p2

    .line 357
    .line 358
    check-cast v14, Ljava/lang/Number;

    .line 359
    .line 360
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 361
    .line 362
    .line 363
    move-result v14

    .line 364
    move-object/from16 v15, p3

    .line 365
    .line 366
    check-cast v15, La/fet;

    .line 367
    .line 368
    move-object/from16 v17, p4

    .line 369
    .line 370
    check-cast v17, Ljava/lang/Number;

    .line 371
    .line 372
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Number;->intValue()I

    .line 373
    .line 374
    .line 375
    move-result v17

    .line 376
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 377
    .line 378
    .line 379
    move-result-object v7

    .line 380
    and-int/lit8 v19, v17, 0x6

    .line 381
    .line 382
    if-nez v19, :cond_d

    .line 383
    .line 384
    invoke-virtual {v15, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    move-result v1

    .line 388
    if-eqz v1, :cond_c

    .line 389
    .line 390
    move v9, v10

    .line 391
    :cond_c
    or-int v1, v17, v9

    .line 392
    .line 393
    goto :goto_7

    .line 394
    :cond_d
    move/from16 v1, v17

    .line 395
    .line 396
    :goto_7
    and-int/lit8 v9, v17, 0x30

    .line 397
    .line 398
    if-nez v9, :cond_f

    .line 399
    .line 400
    invoke-virtual {v15, v14}, La/fet;->e(I)Z

    .line 401
    .line 402
    .line 403
    move-result v9

    .line 404
    if-eqz v9, :cond_e

    .line 405
    .line 406
    move/from16 v16, v8

    .line 407
    .line 408
    goto :goto_8

    .line 409
    :cond_e
    const/16 v16, 0x10

    .line 410
    .line 411
    :goto_8
    or-int v1, v1, v16

    .line 412
    .line 413
    :cond_f
    and-int/lit16 v8, v1, 0x93

    .line 414
    .line 415
    if-eq v8, v6, :cond_10

    .line 416
    .line 417
    const/4 v6, 0x1

    .line 418
    goto :goto_9

    .line 419
    :cond_10
    move v6, v13

    .line 420
    :goto_9
    and-int/lit8 v8, v1, 0x1

    .line 421
    .line 422
    invoke-virtual {v15, v8, v6}, La/fet;->U(IZ)Z

    .line 423
    .line 424
    .line 425
    move-result v6

    .line 426
    if-eqz v6, :cond_17

    .line 427
    .line 428
    check-cast v5, La/a4x;

    .line 429
    .line 430
    invoke-interface {v5, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v5

    .line 434
    and-int/lit8 v1, v1, 0x7e

    .line 435
    .line 436
    check-cast v5, La/y2b;

    .line 437
    .line 438
    const v6, 0x6585263c

    .line 439
    .line 440
    .line 441
    invoke-virtual {v15, v6}, La/fet;->e0(I)V

    .line 442
    .line 443
    .line 444
    if-eqz v5, :cond_15

    .line 445
    .line 446
    instance-of v6, v5, La/i3b;

    .line 447
    .line 448
    if-eqz v6, :cond_11

    .line 449
    .line 450
    const v0, 0x2c90b76a

    .line 451
    .line 452
    .line 453
    invoke-virtual {v15, v0}, La/fet;->e0(I)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v11, v5, v15, v7}, La/ugd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v15, v13}, La/fet;->r(Z)V

    .line 460
    .line 461
    .line 462
    move-object v0, v15

    .line 463
    goto :goto_a

    .line 464
    :cond_11
    instance-of v6, v5, La/m3b;

    .line 465
    .line 466
    if-eqz v6, :cond_12

    .line 467
    .line 468
    const v3, 0x2c90c1be

    .line 469
    .line 470
    .line 471
    invoke-virtual {v15, v3}, La/fet;->e0(I)V

    .line 472
    .line 473
    .line 474
    check-cast v2, La/w6b;

    .line 475
    .line 476
    check-cast v2, La/s6b;

    .line 477
    .line 478
    iget-object v2, v2, La/s6b;->c:La/a4x;

    .line 479
    .line 480
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 481
    .line 482
    .line 483
    move-result-object v20

    .line 484
    shl-int/lit8 v1, v1, 0x3

    .line 485
    .line 486
    and-int/lit16 v1, v1, 0x380

    .line 487
    .line 488
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 489
    .line 490
    .line 491
    move-result-object v22

    .line 492
    iget-object v0, v0, La/l6b;->c:La/ugd;

    .line 493
    .line 494
    move-object/from16 v17, v0

    .line 495
    .line 496
    move-object/from16 v19, v2

    .line 497
    .line 498
    move-object/from16 v18, v5

    .line 499
    .line 500
    move-object/from16 v21, v15

    .line 501
    .line 502
    invoke-virtual/range {v17 .. v22}, La/ugd;->O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-object/from16 v0, v21

    .line 506
    .line 507
    invoke-virtual {v0, v13}, La/fet;->r(Z)V

    .line 508
    .line 509
    .line 510
    goto :goto_a

    .line 511
    :cond_12
    move-object v0, v15

    .line 512
    instance-of v1, v5, La/x5b;

    .line 513
    .line 514
    if-eqz v1, :cond_13

    .line 515
    .line 516
    const v1, 0x2c90d0ea

    .line 517
    .line 518
    .line 519
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 520
    .line 521
    .line 522
    invoke-virtual {v12, v5, v0, v7}, La/ugd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v0, v13}, La/fet;->r(Z)V

    .line 526
    .line 527
    .line 528
    goto :goto_a

    .line 529
    :cond_13
    instance-of v1, v5, La/i8b;

    .line 530
    .line 531
    if-eqz v1, :cond_14

    .line 532
    .line 533
    const v1, 0x2c90dbaa

    .line 534
    .line 535
    .line 536
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v4, v5, v0, v7}, La/ugd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    invoke-virtual {v0, v13}, La/fet;->r(Z)V

    .line 543
    .line 544
    .line 545
    goto :goto_a

    .line 546
    :cond_14
    instance-of v1, v5, La/d4b;

    .line 547
    .line 548
    if-eqz v1, :cond_16

    .line 549
    .line 550
    const v1, 0x2c90e626

    .line 551
    .line 552
    .line 553
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 554
    .line 555
    .line 556
    invoke-virtual {v3, v0, v7}, La/ugd;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    invoke-virtual {v0, v13}, La/fet;->r(Z)V

    .line 560
    .line 561
    .line 562
    :goto_a
    invoke-virtual {v0, v13}, La/fet;->r(Z)V

    .line 563
    .line 564
    .line 565
    goto :goto_b

    .line 566
    :cond_15
    move-object v0, v15

    .line 567
    :cond_16
    const v1, 0x2c90aea7

    .line 568
    .line 569
    .line 570
    invoke-static {v1, v0, v13}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    throw v0

    .line 575
    :cond_17
    move-object v0, v15

    .line 576
    invoke-virtual {v0}, La/fet;->X()V

    .line 577
    .line 578
    .line 579
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 580
    .line 581
    return-object v0

    .line 582
    nop

    .line 583
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
