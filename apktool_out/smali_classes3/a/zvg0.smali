.class public final synthetic La/zvg0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/bwg0;


# direct methods
.method public synthetic constructor <init>(La/bwg0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zvg0;->a:B

    iput-object p1, p0, La/zvg0;->b:La/bwg0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/zvg0;->a:B

    .line 4
    .line 5
    sget-object v2, La/wtg0;->a:La/wtg0;

    .line 6
    .line 7
    const-string v3, ""

    .line 8
    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v7, 0x1

    .line 12
    const/4 v8, 0x0

    .line 13
    iget-object v0, v0, La/zvg0;->b:La/bwg0;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v1, p1

    .line 19
    .line 20
    check-cast v1, La/fee;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;

    .line 30
    .line 31
    iget-boolean v1, v1, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->b:Z

    .line 32
    .line 33
    iget-object v0, v0, La/bwg0;->b:La/ctf0;

    .line 34
    .line 35
    if-ne v1, v7, :cond_0

    .line 36
    .line 37
    new-array v1, v8, [Ljava/lang/Object;

    .line 38
    .line 39
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 40
    .line 41
    invoke-static {v1, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const v2, 0x7f1309c7

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    new-array v1, v8, [Ljava/lang/Object;

    .line 54
    .line 55
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 56
    .line 57
    invoke-static {v1, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    const v2, 0x7f1309ee

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    :goto_0
    return-object v0

    .line 69
    :pswitch_0
    move-object/from16 v1, p1

    .line 70
    .line 71
    check-cast v1, La/fee;

    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget-object v2, v0, La/bwg0;->s:La/n0o0;

    .line 77
    .line 78
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    check-cast v2, La/fee;

    .line 83
    .line 84
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    check-cast v2, La/wvg0;

    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-eqz v2, :cond_6

    .line 95
    .line 96
    if-eq v2, v7, :cond_5

    .line 97
    .line 98
    if-eq v2, v5, :cond_3

    .line 99
    .line 100
    if-ne v2, v4, :cond_2

    .line 101
    .line 102
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    check-cast v1, La/ytg0;

    .line 107
    .line 108
    if-eqz v1, :cond_1

    .line 109
    .line 110
    invoke-virtual {v0, v1, v7}, La/bwg0;->b(La/ytg0;Z)La/i4;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    if-nez v6, :cond_a

    .line 115
    .line 116
    :cond_1
    sget-object v6, La/lak0;->c:La/lak0;

    .line 117
    .line 118
    goto/16 :goto_3

    .line 119
    .line 120
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 121
    .line 122
    .line 123
    const/4 v6, 0x0

    .line 124
    goto/16 :goto_3

    .line 125
    .line 126
    :cond_3
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    check-cast v1, La/ytg0;

    .line 131
    .line 132
    if-eqz v1, :cond_4

    .line 133
    .line 134
    invoke-virtual {v0, v1, v8}, La/bwg0;->b(La/ytg0;Z)La/i4;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    if-nez v6, :cond_a

    .line 139
    .line 140
    :cond_4
    sget-object v6, La/lak0;->c:La/lak0;

    .line 141
    .line 142
    goto/16 :goto_3

    .line 143
    .line 144
    :cond_5
    sget-object v6, La/lak0;->c:La/lak0;

    .line 145
    .line 146
    goto/16 :goto_3

    .line 147
    .line 148
    :cond_6
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    check-cast v1, La/ytg0;

    .line 153
    .line 154
    if-eqz v1, :cond_9

    .line 155
    .line 156
    iget-object v2, v0, La/bwg0;->b:La/ctf0;

    .line 157
    .line 158
    iget-object v4, v0, La/bwg0;->w:La/n0o0;

    .line 159
    .line 160
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    check-cast v4, La/fee;

    .line 165
    .line 166
    invoke-virtual {v4}, La/fee;->b()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    check-cast v4, La/ql5;

    .line 171
    .line 172
    if-eqz v4, :cond_7

    .line 173
    .line 174
    iget-object v6, v4, La/ql5;->f:Ljava/lang/String;

    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_7
    const/4 v6, 0x0

    .line 178
    :goto_1
    if-nez v6, :cond_8

    .line 179
    .line 180
    move-object v11, v3

    .line 181
    goto :goto_2

    .line 182
    :cond_8
    move-object v11, v6

    .line 183
    :goto_2
    new-instance v3, La/cvg0;

    .line 184
    .line 185
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 186
    .line 187
    .line 188
    new-instance v4, La/j8k0;

    .line 189
    .line 190
    new-array v6, v8, [Ljava/lang/Object;

    .line 191
    .line 192
    iget-object v9, v2, La/ctf0;->b:La/lsm0;

    .line 193
    .line 194
    invoke-static {v6, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    const v10, 0x7f130766

    .line 199
    .line 200
    .line 201
    invoke-virtual {v9, v10, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v10

    .line 205
    sget-object v12, La/h8k0;->a:La/h8k0;

    .line 206
    .line 207
    new-instance v13, La/g8k0;

    .line 208
    .line 209
    sget-object v6, La/pn40;->a:La/pn40;

    .line 210
    .line 211
    sget-object v6, La/p3u0;->c:La/p3u0;

    .line 212
    .line 213
    const-wide/16 v14, 0x0

    .line 214
    .line 215
    invoke-static {v14, v15, v6}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v9

    .line 219
    const/4 v15, 0x4

    .line 220
    invoke-direct {v13, v15, v9, v11}, La/g8k0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    new-instance v14, La/g8k0;

    .line 224
    .line 225
    move/from16 v16, v7

    .line 226
    .line 227
    iget-wide v7, v1, La/ytg0;->i:D

    .line 228
    .line 229
    invoke-virtual {v0, v7, v8}, La/bwg0;->a(D)D

    .line 230
    .line 231
    .line 232
    move-result-wide v7

    .line 233
    invoke-static {v7, v8, v6}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v7

    .line 237
    invoke-direct {v14, v15, v7, v11}, La/g8k0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    new-instance v9, La/f8k0;

    .line 241
    .line 242
    invoke-direct/range {v9 .. v14}, La/f8k0;-><init>(Ljava/lang/String;Ljava/lang/String;La/h8k0;La/g8k0;La/g8k0;)V

    .line 243
    .line 244
    .line 245
    move-object v7, v9

    .line 246
    const/4 v8, 0x0

    .line 247
    new-array v9, v8, [Ljava/lang/Object;

    .line 248
    .line 249
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 250
    .line 251
    invoke-static {v9, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v9

    .line 255
    const v8, 0x7f1309d6

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2, v8, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v10

    .line 262
    sget-object v12, La/h8k0;->b:La/h8k0;

    .line 263
    .line 264
    new-instance v13, La/g8k0;

    .line 265
    .line 266
    iget-wide v8, v1, La/ytg0;->e:D

    .line 267
    .line 268
    invoke-virtual {v0, v8, v9}, La/bwg0;->a(D)D

    .line 269
    .line 270
    .line 271
    move-result-wide v8

    .line 272
    invoke-static {v8, v9, v6}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    invoke-direct {v13, v15, v2, v11}, La/g8k0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    new-instance v14, La/g8k0;

    .line 280
    .line 281
    iget-wide v1, v1, La/ytg0;->d:D

    .line 282
    .line 283
    invoke-virtual {v0, v1, v2}, La/bwg0;->a(D)D

    .line 284
    .line 285
    .line 286
    move-result-wide v0

    .line 287
    invoke-static {v0, v1, v6}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    invoke-direct {v14, v15, v0, v11}, La/g8k0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    new-instance v9, La/f8k0;

    .line 295
    .line 296
    invoke-direct/range {v9 .. v14}, La/f8k0;-><init>(Ljava/lang/String;Ljava/lang/String;La/h8k0;La/g8k0;La/g8k0;)V

    .line 297
    .line 298
    .line 299
    filled-new-array {v7, v9}, [La/f8k0;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-direct {v4, v0}, La/j8k0;-><init>(Ljava/util/List;)V

    .line 308
    .line 309
    .line 310
    new-array v0, v5, [La/jvg0;

    .line 311
    .line 312
    const/16 v17, 0x0

    .line 313
    .line 314
    aput-object v3, v0, v17

    .line 315
    .line 316
    aput-object v4, v0, v16

    .line 317
    .line 318
    invoke-static {v0}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 319
    .line 320
    .line 321
    move-result-object v6

    .line 322
    if-nez v6, :cond_a

    .line 323
    .line 324
    :cond_9
    sget-object v6, La/lak0;->c:La/lak0;

    .line 325
    .line 326
    :cond_a
    :goto_3
    return-object v6

    .line 327
    :pswitch_1
    move/from16 v16, v7

    .line 328
    .line 329
    iget-object v8, v0, La/bwg0;->b:La/ctf0;

    .line 330
    .line 331
    move-object/from16 v1, p1

    .line 332
    .line 333
    check-cast v1, La/fee;

    .line 334
    .line 335
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    check-cast v1, La/a5w;

    .line 343
    .line 344
    if-eqz v1, :cond_16

    .line 345
    .line 346
    new-instance v2, La/xsv;

    .line 347
    .line 348
    iget-object v7, v0, La/bwg0;->w:La/n0o0;

    .line 349
    .line 350
    invoke-virtual {v7}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v7

    .line 354
    check-cast v7, La/fee;

    .line 355
    .line 356
    invoke-virtual {v7}, La/fee;->b()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v7

    .line 360
    check-cast v7, La/ql5;

    .line 361
    .line 362
    if-eqz v7, :cond_b

    .line 363
    .line 364
    iget-object v7, v7, La/ql5;->f:Ljava/lang/String;

    .line 365
    .line 366
    goto :goto_4

    .line 367
    :cond_b
    const/4 v7, 0x0

    .line 368
    :goto_4
    if-nez v7, :cond_c

    .line 369
    .line 370
    goto :goto_5

    .line 371
    :cond_c
    move-object v3, v7

    .line 372
    :goto_5
    iget-object v7, v0, La/bwg0;->a:La/svg0;

    .line 373
    .line 374
    iget-object v9, v7, La/svg0;->t:Ljava/util/List;

    .line 375
    .line 376
    iget-object v7, v0, La/bwg0;->x:La/n0o0;

    .line 377
    .line 378
    invoke-virtual {v7}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v7

    .line 382
    check-cast v7, La/fee;

    .line 383
    .line 384
    invoke-virtual {v7}, La/fee;->b()Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v7

    .line 388
    check-cast v7, Ljava/util/List;

    .line 389
    .line 390
    iget-object v10, v0, La/bwg0;->v:La/n0o0;

    .line 391
    .line 392
    invoke-virtual {v10}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v10

    .line 396
    check-cast v10, La/fee;

    .line 397
    .line 398
    invoke-virtual {v10}, La/fee;->b()Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v10

    .line 402
    check-cast v10, Ljava/util/List;

    .line 403
    .line 404
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    instance-of v11, v1, La/kzv;

    .line 417
    .line 418
    if-eqz v11, :cond_13

    .line 419
    .line 420
    check-cast v1, La/kzv;

    .line 421
    .line 422
    iget-object v11, v1, La/kzv;->Y:Ljava/util/List;

    .line 423
    .line 424
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 425
    .line 426
    .line 427
    move-result-object v7

    .line 428
    :goto_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 429
    .line 430
    .line 431
    move-result v12

    .line 432
    if-eqz v12, :cond_e

    .line 433
    .line 434
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v12

    .line 438
    move-object v13, v12

    .line 439
    check-cast v13, La/xco;

    .line 440
    .line 441
    iget-wide v13, v13, La/xco;->a:J

    .line 442
    .line 443
    move-object/from16 p0, v7

    .line 444
    .line 445
    iget-wide v6, v1, La/kzv;->T:J

    .line 446
    .line 447
    cmp-long v6, v13, v6

    .line 448
    .line 449
    if-nez v6, :cond_d

    .line 450
    .line 451
    goto :goto_7

    .line 452
    :cond_d
    move-object/from16 v7, p0

    .line 453
    .line 454
    goto :goto_6

    .line 455
    :cond_e
    const/4 v12, 0x0

    .line 456
    :goto_7
    check-cast v12, La/xco;

    .line 457
    .line 458
    sget-object v6, La/i7u;->c:La/i7u;

    .line 459
    .line 460
    invoke-virtual {v6, v11, v10}, La/i7u;->a(Ljava/util/List;Ljava/util/List;)Z

    .line 461
    .line 462
    .line 463
    move-result v6

    .line 464
    sget-object v7, La/i7u;->b:La/i7u;

    .line 465
    .line 466
    invoke-virtual {v7, v11, v10}, La/i7u;->a(Ljava/util/List;Ljava/util/List;)Z

    .line 467
    .line 468
    .line 469
    move-result v7

    .line 470
    new-instance v18, La/tsv;

    .line 471
    .line 472
    invoke-static {v1}, La/lmc;->a0(La/kzv;)La/tvw;

    .line 473
    .line 474
    .line 475
    move-result-object v19

    .line 476
    sget-object v10, La/rdj;->a:La/rdj;

    .line 477
    .line 478
    iget-object v14, v8, La/ctf0;->b:La/lsm0;

    .line 479
    .line 480
    invoke-virtual {v8}, La/ctf0;->h()Z

    .line 481
    .line 482
    .line 483
    move-result v10

    .line 484
    iget-wide v4, v1, La/kzv;->d:J

    .line 485
    .line 486
    sget-object v11, La/efj;->c:La/efj;

    .line 487
    .line 488
    new-instance v13, La/znq0;

    .line 489
    .line 490
    invoke-direct {v13, v4, v5}, La/znq0;-><init>(J)V

    .line 491
    .line 492
    .line 493
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 494
    .line 495
    .line 496
    move-result-object v4

    .line 497
    const/16 v5, 0x38

    .line 498
    .line 499
    const/4 v10, 0x0

    .line 500
    invoke-static {v13, v11, v4, v10, v5}, La/rdj;->g(La/aoq0;La/efj;Ljava/lang/Boolean;ZI)Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object v20

    .line 504
    iget-object v4, v1, La/kzv;->a:Ljava/lang/String;

    .line 505
    .line 506
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v4

    .line 510
    move/from16 v5, v16

    .line 511
    .line 512
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v4

    .line 516
    const v5, 0x7f1309d9

    .line 517
    .line 518
    .line 519
    invoke-virtual {v14, v5, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object v21

    .line 523
    if-eqz v12, :cond_f

    .line 524
    .line 525
    iget-boolean v4, v12, La/xco;->e:Z

    .line 526
    .line 527
    move v10, v4

    .line 528
    goto :goto_8

    .line 529
    :cond_f
    const/4 v10, 0x0

    .line 530
    :goto_8
    iget-object v13, v1, La/kzv;->B:Ljava/lang/String;

    .line 531
    .line 532
    move v11, v6

    .line 533
    move v12, v7

    .line 534
    move-object v7, v1

    .line 535
    invoke-static/range {v7 .. v13}, La/jwb;->N(La/kzv;La/ctf0;Ljava/util/List;ZZZLjava/lang/String;)La/i4;

    .line 536
    .line 537
    .line 538
    move-result-object v22

    .line 539
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 540
    .line 541
    .line 542
    move-result-object v1

    .line 543
    invoke-static {v7}, La/u1c;->y(La/a5w;)Z

    .line 544
    .line 545
    .line 546
    move-result v4

    .line 547
    if-eqz v4, :cond_10

    .line 548
    .line 549
    invoke-static {v7, v8}, La/vcc;->J(La/kzv;La/ctf0;)La/i3w;

    .line 550
    .line 551
    .line 552
    move-result-object v4

    .line 553
    invoke-virtual {v1, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    :cond_10
    invoke-static {v7, v8, v11}, La/feb;->S(La/kzv;La/ctf0;Z)La/j3w;

    .line 557
    .line 558
    .line 559
    move-result-object v4

    .line 560
    if-eqz v4, :cond_11

    .line 561
    .line 562
    invoke-virtual {v1, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 563
    .line 564
    .line 565
    :cond_11
    iget-wide v4, v7, La/kzv;->L:D

    .line 566
    .line 567
    iget-wide v9, v7, La/kzv;->f:D

    .line 568
    .line 569
    cmpg-double v4, v4, v9

    .line 570
    .line 571
    if-gez v4, :cond_12

    .line 572
    .line 573
    const v4, 0x7f1309cd

    .line 574
    .line 575
    .line 576
    :goto_9
    const/4 v5, 0x0

    .line 577
    goto :goto_a

    .line 578
    :cond_12
    const v4, 0x7f1309cc

    .line 579
    .line 580
    .line 581
    goto :goto_9

    .line 582
    :goto_a
    new-array v6, v5, [Ljava/lang/Object;

    .line 583
    .line 584
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    move-result-object v6

    .line 588
    invoke-virtual {v14, v4, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 589
    .line 590
    .line 591
    move-result-object v11

    .line 592
    sget-object v4, La/pn40;->a:La/pn40;

    .line 593
    .line 594
    iget-wide v4, v7, La/kzv;->E:D

    .line 595
    .line 596
    sub-double/2addr v9, v4

    .line 597
    sget-object v4, La/p3u0;->c:La/p3u0;

    .line 598
    .line 599
    invoke-static {v9, v10, v4}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    move-result-object v12

    .line 603
    new-instance v9, La/f3w;

    .line 604
    .line 605
    move-object v5, v14

    .line 606
    sget-object v14, La/e3w;->a:La/e3w;

    .line 607
    .line 608
    const-string v10, ""

    .line 609
    .line 610
    move-object v13, v3

    .line 611
    invoke-direct/range {v9 .. v14}, La/f3w;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/e3w;)V

    .line 612
    .line 613
    .line 614
    invoke-virtual {v1, v9}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 615
    .line 616
    .line 617
    new-instance v9, La/f3w;

    .line 618
    .line 619
    const/4 v10, 0x0

    .line 620
    new-array v3, v10, [Ljava/lang/Object;

    .line 621
    .line 622
    invoke-static {v3, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    move-result-object v3

    .line 626
    const v6, 0x7f1305bd

    .line 627
    .line 628
    .line 629
    invoke-virtual {v5, v6, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v11

    .line 633
    iget-wide v5, v7, La/kzv;->m:D

    .line 634
    .line 635
    invoke-static {v5, v6, v4}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 636
    .line 637
    .line 638
    move-result-object v12

    .line 639
    const-string v10, ""

    .line 640
    .line 641
    invoke-direct/range {v9 .. v14}, La/f3w;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/e3w;)V

    .line 642
    .line 643
    .line 644
    invoke-virtual {v1, v9}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 645
    .line 646
    .line 647
    invoke-static {v1}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 648
    .line 649
    .line 650
    move-result-object v1

    .line 651
    invoke-static {v1}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 652
    .line 653
    .line 654
    move-result-object v23

    .line 655
    invoke-direct/range {v18 .. v23}, La/tsv;-><init>(La/tvw;Ljava/lang/String;Ljava/lang/String;La/a4x;La/a4x;)V

    .line 656
    .line 657
    .line 658
    move-object/from16 v9, v18

    .line 659
    .line 660
    goto :goto_b

    .line 661
    :cond_13
    new-instance v9, La/tsv;

    .line 662
    .line 663
    const-string v12, ""

    .line 664
    .line 665
    sget-object v13, La/lak0;->c:La/lak0;

    .line 666
    .line 667
    sget-object v10, La/qvw;->a:La/qvw;

    .line 668
    .line 669
    const-string v11, ""

    .line 670
    .line 671
    move-object v14, v13

    .line 672
    invoke-direct/range {v9 .. v14}, La/tsv;-><init>(La/tvw;Ljava/lang/String;Ljava/lang/String;La/a4x;La/a4x;)V

    .line 673
    .line 674
    .line 675
    :goto_b
    iget-object v0, v0, La/bwg0;->s:La/n0o0;

    .line 676
    .line 677
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    check-cast v0, La/fee;

    .line 682
    .line 683
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    check-cast v0, La/wvg0;

    .line 688
    .line 689
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 690
    .line 691
    .line 692
    move-result v0

    .line 693
    if-eqz v0, :cond_15

    .line 694
    .line 695
    const/4 v5, 0x1

    .line 696
    if-eq v0, v5, :cond_15

    .line 697
    .line 698
    const/4 v1, 0x2

    .line 699
    if-eq v0, v1, :cond_15

    .line 700
    .line 701
    const/4 v1, 0x3

    .line 702
    if-ne v0, v1, :cond_14

    .line 703
    .line 704
    new-instance v0, La/l3w;

    .line 705
    .line 706
    const/4 v10, 0x0

    .line 707
    new-array v1, v10, [Ljava/lang/Object;

    .line 708
    .line 709
    iget-object v3, v8, La/ctf0;->b:La/lsm0;

    .line 710
    .line 711
    invoke-static {v1, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    move-result-object v1

    .line 715
    const v4, 0x7f1301a8

    .line 716
    .line 717
    .line 718
    invoke-virtual {v3, v4, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 719
    .line 720
    .line 721
    move-result-object v1

    .line 722
    new-array v3, v10, [Ljava/lang/Object;

    .line 723
    .line 724
    iget-object v4, v8, La/ctf0;->b:La/lsm0;

    .line 725
    .line 726
    invoke-static {v3, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 727
    .line 728
    .line 729
    move-result-object v3

    .line 730
    const v5, 0x7f130eb7

    .line 731
    .line 732
    .line 733
    invoke-virtual {v4, v5, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 734
    .line 735
    .line 736
    move-result-object v3

    .line 737
    sget-object v4, La/i8x;->a:La/i8x;

    .line 738
    .line 739
    invoke-direct {v0, v1, v3, v4}, La/l3w;-><init>(Ljava/lang/String;Ljava/lang/String;La/k8x;)V

    .line 740
    .line 741
    .line 742
    iget-object v1, v9, La/tsv;->e:La/a4x;

    .line 743
    .line 744
    invoke-static {v1, v0}, Lkotlin/collections/CollectionsKt;->r0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 745
    .line 746
    .line 747
    move-result-object v0

    .line 748
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 749
    .line 750
    .line 751
    move-result-object v8

    .line 752
    iget-object v5, v9, La/tsv;->b:Ljava/lang/String;

    .line 753
    .line 754
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 755
    .line 756
    .line 757
    iget-object v6, v9, La/tsv;->c:Ljava/lang/String;

    .line 758
    .line 759
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 760
    .line 761
    .line 762
    iget-object v7, v9, La/tsv;->d:La/a4x;

    .line 763
    .line 764
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 765
    .line 766
    .line 767
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 768
    .line 769
    .line 770
    new-instance v3, La/tsv;

    .line 771
    .line 772
    iget-object v4, v9, La/tsv;->a:La/tvw;

    .line 773
    .line 774
    invoke-direct/range {v3 .. v8}, La/tsv;-><init>(La/tvw;Ljava/lang/String;Ljava/lang/String;La/a4x;La/a4x;)V

    .line 775
    .line 776
    .line 777
    move-object v9, v3

    .line 778
    goto :goto_c

    .line 779
    :cond_14
    invoke-static {}, La/t9f;->b()V

    .line 780
    .line 781
    .line 782
    const/4 v6, 0x0

    .line 783
    goto :goto_d

    .line 784
    :cond_15
    :goto_c
    invoke-direct {v2, v9}, La/xsv;-><init>(La/tsv;)V

    .line 785
    .line 786
    .line 787
    move-object v6, v2

    .line 788
    goto :goto_d

    .line 789
    :cond_16
    sget-object v6, La/wsv;->a:La/wsv;

    .line 790
    .line 791
    :goto_d
    return-object v6

    .line 792
    :pswitch_2
    move-object/from16 v1, p1

    .line 793
    .line 794
    check-cast v1, La/fee;

    .line 795
    .line 796
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 797
    .line 798
    .line 799
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 800
    .line 801
    .line 802
    move-result-object v1

    .line 803
    check-cast v1, La/xtg0;

    .line 804
    .line 805
    sget-object v3, La/utg0;->a:La/utg0;

    .line 806
    .line 807
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 808
    .line 809
    .line 810
    move-result v3

    .line 811
    if-eqz v3, :cond_17

    .line 812
    .line 813
    new-instance v6, La/zie;

    .line 814
    .line 815
    iget-object v7, v0, La/bwg0;->c:La/ocl;

    .line 816
    .line 817
    sget-object v8, La/pb10;->g:La/pb10;

    .line 818
    .line 819
    const-wide/16 v16, 0x0

    .line 820
    .line 821
    const/16 v18, 0x25e

    .line 822
    .line 823
    const/4 v9, 0x0

    .line 824
    const/4 v10, 0x0

    .line 825
    const/4 v11, 0x0

    .line 826
    const v12, 0x7f130677

    .line 827
    .line 828
    .line 829
    const v13, 0x7f131690

    .line 830
    .line 831
    .line 832
    const-wide/16 v14, 0x2710

    .line 833
    .line 834
    invoke-static/range {v7 .. v18}, La/ocl;->b(La/ocl;La/pb10;La/pdm;IIIIJJI)La/mdm;

    .line 835
    .line 836
    .line 837
    move-result-object v0

    .line 838
    invoke-direct {v6, v0}, La/zie;-><init>(La/mdm;)V

    .line 839
    .line 840
    .line 841
    goto :goto_e

    .line 842
    :cond_17
    sget-object v0, La/vtg0;->a:La/vtg0;

    .line 843
    .line 844
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 845
    .line 846
    .line 847
    move-result v0

    .line 848
    if-eqz v0, :cond_18

    .line 849
    .line 850
    sget-object v6, La/dje;->a:La/dje;

    .line 851
    .line 852
    goto :goto_e

    .line 853
    :cond_18
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 854
    .line 855
    .line 856
    move-result v0

    .line 857
    if-eqz v0, :cond_19

    .line 858
    .line 859
    sget-object v6, La/fje;->a:La/fje;

    .line 860
    .line 861
    goto :goto_e

    .line 862
    :cond_19
    invoke-static {}, La/t9f;->b()V

    .line 863
    .line 864
    .line 865
    const/4 v6, 0x0

    .line 866
    :goto_e
    return-object v6

    .line 867
    :pswitch_3
    move-object/from16 v1, p1

    .line 868
    .line 869
    check-cast v1, La/fee;

    .line 870
    .line 871
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 872
    .line 873
    .line 874
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 875
    .line 876
    .line 877
    move-result-object v1

    .line 878
    check-cast v1, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;

    .line 879
    .line 880
    iget-boolean v1, v1, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->b:Z

    .line 881
    .line 882
    iget-object v0, v0, La/bwg0;->b:La/ctf0;

    .line 883
    .line 884
    const/4 v5, 0x1

    .line 885
    if-ne v1, v5, :cond_1a

    .line 886
    .line 887
    const/4 v10, 0x0

    .line 888
    new-array v1, v10, [Ljava/lang/Object;

    .line 889
    .line 890
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 891
    .line 892
    invoke-static {v1, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 893
    .line 894
    .line 895
    move-result-object v1

    .line 896
    const v2, 0x7f1301a9

    .line 897
    .line 898
    .line 899
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 900
    .line 901
    .line 902
    move-result-object v0

    .line 903
    goto :goto_f

    .line 904
    :cond_1a
    const/4 v10, 0x0

    .line 905
    new-array v1, v10, [Ljava/lang/Object;

    .line 906
    .line 907
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 908
    .line 909
    invoke-static {v1, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 910
    .line 911
    .line 912
    move-result-object v1

    .line 913
    const v2, 0x7f13125d

    .line 914
    .line 915
    .line 916
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 917
    .line 918
    .line 919
    move-result-object v0

    .line 920
    :goto_f
    return-object v0

    .line 921
    :pswitch_4
    move-object/from16 v1, p1

    .line 922
    .line 923
    check-cast v1, La/fee;

    .line 924
    .line 925
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 926
    .line 927
    .line 928
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 929
    .line 930
    .line 931
    move-result-object v1

    .line 932
    check-cast v1, La/xtg0;

    .line 933
    .line 934
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 935
    .line 936
    .line 937
    move-result v1

    .line 938
    if-eqz v1, :cond_1b

    .line 939
    .line 940
    iget-object v0, v0, La/bwg0;->b:La/ctf0;

    .line 941
    .line 942
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 943
    .line 944
    .line 945
    new-instance v1, La/itl;

    .line 946
    .line 947
    new-instance v2, La/wul;

    .line 948
    .line 949
    sget-object v3, La/lul;->e:La/lul;

    .line 950
    .line 951
    sget-object v4, La/oe9;->a:La/oe9;

    .line 952
    .line 953
    new-instance v5, La/ue9;

    .line 954
    .line 955
    const/4 v10, 0x0

    .line 956
    new-array v6, v10, [Ljava/lang/Object;

    .line 957
    .line 958
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 959
    .line 960
    invoke-static {v6, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 961
    .line 962
    .line 963
    move-result-object v6

    .line 964
    const v7, 0x7f13125a

    .line 965
    .line 966
    .line 967
    invoke-virtual {v0, v7, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 968
    .line 969
    .line 970
    move-result-object v0

    .line 971
    invoke-direct {v5, v0}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 972
    .line 973
    .line 974
    const/4 v7, 0x0

    .line 975
    const/4 v8, 0x1

    .line 976
    const/4 v6, 0x1

    .line 977
    invoke-direct/range {v2 .. v8}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 978
    .line 979
    .line 980
    sget-object v0, La/sh00;->w:La/sh00;

    .line 981
    .line 982
    invoke-direct {v1, v2, v0}, La/itl;-><init>(La/wul;La/jtl;)V

    .line 983
    .line 984
    .line 985
    filled-new-array {v1}, [La/itl;

    .line 986
    .line 987
    .line 988
    move-result-object v0

    .line 989
    invoke-static {v0}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 990
    .line 991
    .line 992
    move-result-object v0

    .line 993
    goto :goto_10

    .line 994
    :cond_1b
    sget-object v0, La/lak0;->c:La/lak0;

    .line 995
    .line 996
    :goto_10
    return-object v0

    .line 997
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
