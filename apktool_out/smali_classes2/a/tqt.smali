.class public final La/tqt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>(La/bst;La/tqt;La/art;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(La/kzj0;La/g5;ILa/hys0;ZZ)La/u3u0;
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move/from16 v2, p5

    .line 6
    .line 7
    sget-object v3, La/hys0;->c:La/hys0;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    if-eq v1, v3, :cond_0

    .line 12
    .line 13
    move v6, v5

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v6, v4

    .line 16
    :goto_0
    if-eqz v2, :cond_2

    .line 17
    .line 18
    if-nez p4, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move v7, v4

    .line 22
    goto :goto_2

    .line 23
    :cond_2
    :goto_1
    move v7, v5

    .line 24
    :goto_2
    const/4 v8, 0x0

    .line 25
    if-nez v6, :cond_3

    .line 26
    .line 27
    invoke-virtual/range {p0 .. p0}, La/wsy;->J()Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    if-eqz v6, :cond_3

    .line 36
    .line 37
    new-instance v0, La/u3u0;

    .line 38
    .line 39
    invoke-direct {v0, v8, v5, v4}, La/u3u0;-><init>(La/kzj0;IZ)V

    .line 40
    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_3
    invoke-virtual/range {p0 .. p0}, La/wsy;->S()La/iys0;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    invoke-interface {v6}, La/iys0;->n()La/foc;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    if-nez v6, :cond_4

    .line 52
    .line 53
    new-instance v0, La/u3u0;

    .line 54
    .line 55
    invoke-direct {v0, v8, v5, v4}, La/u3u0;-><init>(La/kzj0;IZ)V

    .line 56
    .line 57
    .line 58
    return-object v0

    .line 59
    :cond_4
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v9

    .line 63
    invoke-virtual {v0, v9}, La/g5;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v9

    .line 67
    check-cast v9, La/iay;

    .line 68
    .line 69
    sget-object v10, La/rys0;->a:La/i93;

    .line 70
    .line 71
    if-eq v1, v3, :cond_5

    .line 72
    .line 73
    instance-of v10, v6, La/wm40;

    .line 74
    .line 75
    if-nez v10, :cond_6

    .line 76
    .line 77
    :cond_5
    move-object v6, v8

    .line 78
    goto :goto_3

    .line 79
    :cond_6
    iget-object v10, v9, La/iay;->b:La/wx40;

    .line 80
    .line 81
    sget-object v11, La/wx40;->a:La/wx40;

    .line 82
    .line 83
    if-ne v10, v11, :cond_8

    .line 84
    .line 85
    sget-object v10, La/hys0;->a:La/hys0;

    .line 86
    .line 87
    if-ne v1, v10, :cond_8

    .line 88
    .line 89
    move-object v10, v6

    .line 90
    check-cast v10, La/wm40;

    .line 91
    .line 92
    sget-object v11, La/bay;->a:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {v10}, La/oek;->f(La/vjj;)La/twq;

    .line 95
    .line 96
    .line 97
    move-result-object v11

    .line 98
    sget-object v12, La/bay;->j:Ljava/util/HashMap;

    .line 99
    .line 100
    invoke-virtual {v12, v11}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v11

    .line 104
    if-eqz v11, :cond_8

    .line 105
    .line 106
    invoke-static {v10}, La/oek;->f(La/vjj;)La/twq;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    invoke-virtual {v12, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    check-cast v6, La/swq;

    .line 115
    .line 116
    if-eqz v6, :cond_7

    .line 117
    .line 118
    invoke-static {v10}, La/rek;->i(La/vjj;)La/ym40;

    .line 119
    .line 120
    .line 121
    move-result-object v10

    .line 122
    invoke-interface {v10}, La/ym40;->c()La/ary;

    .line 123
    .line 124
    .line 125
    move-result-object v10

    .line 126
    invoke-virtual {v10, v6}, La/ary;->j(La/swq;)La/wm40;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    goto :goto_3

    .line 131
    :cond_7
    const-string v0, "Given class "

    .line 132
    .line 133
    const-string v1, " is not a mutable collection"

    .line 134
    .line 135
    invoke-static {v10, v1, v0}, La/ohq;->q(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    return-object v8

    .line 139
    :cond_8
    iget-object v10, v9, La/iay;->b:La/wx40;

    .line 140
    .line 141
    sget-object v11, La/wx40;->b:La/wx40;

    .line 142
    .line 143
    if-ne v10, v11, :cond_5

    .line 144
    .line 145
    sget-object v10, La/hys0;->b:La/hys0;

    .line 146
    .line 147
    if-ne v1, v10, :cond_5

    .line 148
    .line 149
    check-cast v6, La/wm40;

    .line 150
    .line 151
    sget-object v10, La/bay;->a:Ljava/lang/String;

    .line 152
    .line 153
    invoke-static {v6}, La/oek;->f(La/vjj;)La/twq;

    .line 154
    .line 155
    .line 156
    move-result-object v10

    .line 157
    sget-object v11, La/bay;->k:Ljava/util/HashMap;

    .line 158
    .line 159
    invoke-virtual {v11, v10}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v10

    .line 163
    if-eqz v10, :cond_5

    .line 164
    .line 165
    invoke-static {v6}, La/rv00;->r(La/wm40;)La/wm40;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    :goto_3
    const/4 v10, 0x2

    .line 170
    if-eq v1, v3, :cond_a

    .line 171
    .line 172
    iget-object v1, v9, La/iay;->a:La/p860;

    .line 173
    .line 174
    if-nez v1, :cond_9

    .line 175
    .line 176
    const/4 v1, -0x1

    .line 177
    goto :goto_4

    .line 178
    :cond_9
    sget-object v3, La/qys0;->a:[I

    .line 179
    .line 180
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    aget v1, v3, v1

    .line 185
    .line 186
    :goto_4
    if-eq v1, v5, :cond_c

    .line 187
    .line 188
    if-eq v1, v10, :cond_b

    .line 189
    .line 190
    :cond_a
    move-object v1, v8

    .line 191
    goto :goto_5

    .line 192
    :cond_b
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 193
    .line 194
    goto :goto_5

    .line 195
    :cond_c
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 196
    .line 197
    :goto_5
    if-eqz v6, :cond_d

    .line 198
    .line 199
    invoke-interface {v6}, La/foc;->h()La/iys0;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    if-nez v3, :cond_e

    .line 204
    .line 205
    :cond_d
    invoke-virtual/range {p0 .. p0}, La/wsy;->S()La/iys0;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    :cond_e
    add-int/lit8 v11, p2, 0x1

    .line 210
    .line 211
    invoke-virtual/range {p0 .. p0}, La/wsy;->J()Ljava/util/List;

    .line 212
    .line 213
    .line 214
    move-result-object v12

    .line 215
    invoke-interface {v3}, La/iys0;->getParameters()Ljava/util/List;

    .line 216
    .line 217
    .line 218
    move-result-object v13

    .line 219
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 223
    .line 224
    .line 225
    move-result-object v14

    .line 226
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 227
    .line 228
    .line 229
    move-result-object v15

    .line 230
    move/from16 p4, v10

    .line 231
    .line 232
    new-instance v10, Ljava/util/ArrayList;

    .line 233
    .line 234
    const/16 v5, 0xa

    .line 235
    .line 236
    invoke-static {v12, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 237
    .line 238
    .line 239
    move-result v12

    .line 240
    invoke-static {v13, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 241
    .line 242
    .line 243
    move-result v13

    .line 244
    invoke-static {v12, v13}, Ljava/lang/Math;->min(II)I

    .line 245
    .line 246
    .line 247
    move-result v12

    .line 248
    invoke-direct {v10, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 249
    .line 250
    .line 251
    :goto_6
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 252
    .line 253
    .line 254
    move-result v12

    .line 255
    if-eqz v12, :cond_15

    .line 256
    .line 257
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 258
    .line 259
    .line 260
    move-result v12

    .line 261
    if-eqz v12, :cond_15

    .line 262
    .line 263
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v12

    .line 267
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v13

    .line 271
    check-cast v13, La/hzs0;

    .line 272
    .line 273
    check-cast v12, La/pzs0;

    .line 274
    .line 275
    const/4 v5, 0x5

    .line 276
    if-nez v7, :cond_f

    .line 277
    .line 278
    move-object/from16 v16, v1

    .line 279
    .line 280
    new-instance v1, La/y78;

    .line 281
    .line 282
    invoke-direct {v1, v8, v4, v5}, La/y78;-><init>(Ljava/lang/Object;IB)V

    .line 283
    .line 284
    .line 285
    goto :goto_7

    .line 286
    :cond_f
    move-object/from16 v16, v1

    .line 287
    .line 288
    invoke-virtual {v12}, La/pzs0;->c()Z

    .line 289
    .line 290
    .line 291
    move-result v1

    .line 292
    if-nez v1, :cond_10

    .line 293
    .line 294
    invoke-virtual {v12}, La/pzs0;->b()La/wsy;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    invoke-virtual {v1}, La/wsy;->j0()La/tft0;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    invoke-static {v1, v0, v11, v2}, La/tqt;->b(La/tft0;La/g5;IZ)La/y78;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    goto :goto_7

    .line 307
    :cond_10
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    invoke-virtual {v0, v1}, La/g5;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    check-cast v1, La/iay;

    .line 316
    .line 317
    iget-object v1, v1, La/iay;->a:La/p860;

    .line 318
    .line 319
    sget-object v8, La/p860;->a:La/p860;

    .line 320
    .line 321
    if-ne v1, v8, :cond_11

    .line 322
    .line 323
    invoke-virtual {v12}, La/pzs0;->b()La/wsy;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    invoke-virtual {v1}, La/wsy;->j0()La/tft0;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    new-instance v8, La/y78;

    .line 332
    .line 333
    invoke-static {v1}, La/thb;->P(La/wsy;)La/kzj0;

    .line 334
    .line 335
    .line 336
    move-result-object v5

    .line 337
    invoke-virtual {v5, v4}, La/kzj0;->n0(Z)La/kzj0;

    .line 338
    .line 339
    .line 340
    move-result-object v5

    .line 341
    invoke-static {v1}, La/thb;->Z(La/wsy;)La/kzj0;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    const/4 v4, 0x1

    .line 346
    invoke-virtual {v1, v4}, La/kzj0;->n0(Z)La/kzj0;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    invoke-static {v5, v1}, La/ucx;->W(La/kzj0;La/kzj0;)La/tft0;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    const/4 v5, 0x5

    .line 355
    invoke-direct {v8, v1, v4, v5}, La/y78;-><init>(Ljava/lang/Object;IB)V

    .line 356
    .line 357
    .line 358
    move-object v1, v8

    .line 359
    goto :goto_7

    .line 360
    :cond_11
    const/4 v4, 0x1

    .line 361
    new-instance v1, La/y78;

    .line 362
    .line 363
    const/4 v8, 0x0

    .line 364
    invoke-direct {v1, v8, v4, v5}, La/y78;-><init>(Ljava/lang/Object;IB)V

    .line 365
    .line 366
    .line 367
    :goto_7
    iget v4, v1, La/y78;->b:I

    .line 368
    .line 369
    add-int/2addr v11, v4

    .line 370
    iget-object v1, v1, La/y78;->c:Ljava/lang/Object;

    .line 371
    .line 372
    check-cast v1, La/wsy;

    .line 373
    .line 374
    if-eqz v1, :cond_12

    .line 375
    .line 376
    invoke-virtual {v12}, La/pzs0;->a()La/t3u0;

    .line 377
    .line 378
    .line 379
    move-result-object v4

    .line 380
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    invoke-static {v1, v4, v13}, La/vsm0;->o(La/wsy;La/t3u0;La/hzs0;)La/q4m0;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    goto :goto_8

    .line 388
    :cond_12
    if-eqz v6, :cond_13

    .line 389
    .line 390
    invoke-virtual {v12}, La/pzs0;->c()Z

    .line 391
    .line 392
    .line 393
    move-result v1

    .line 394
    if-nez v1, :cond_13

    .line 395
    .line 396
    invoke-virtual {v12}, La/pzs0;->b()La/wsy;

    .line 397
    .line 398
    .line 399
    move-result-object v1

    .line 400
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v12}, La/pzs0;->a()La/t3u0;

    .line 404
    .line 405
    .line 406
    move-result-object v4

    .line 407
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 408
    .line 409
    .line 410
    invoke-static {v1, v4, v13}, La/vsm0;->o(La/wsy;La/t3u0;La/hzs0;)La/q4m0;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    goto :goto_8

    .line 415
    :cond_13
    if-eqz v6, :cond_14

    .line 416
    .line 417
    invoke-static {v13}, La/e0t0;->k(La/hzs0;)La/q4m0;

    .line 418
    .line 419
    .line 420
    move-result-object v1

    .line 421
    goto :goto_8

    .line 422
    :cond_14
    const/4 v1, 0x0

    .line 423
    :goto_8
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    move-object/from16 v1, v16

    .line 427
    .line 428
    const/4 v4, 0x0

    .line 429
    const/16 v5, 0xa

    .line 430
    .line 431
    const/4 v8, 0x0

    .line 432
    goto/16 :goto_6

    .line 433
    .line 434
    :cond_15
    move-object/from16 v16, v1

    .line 435
    .line 436
    sub-int v11, v11, p2

    .line 437
    .line 438
    if-nez v6, :cond_18

    .line 439
    .line 440
    if-nez v16, :cond_18

    .line 441
    .line 442
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 443
    .line 444
    .line 445
    move-result v0

    .line 446
    if-eqz v0, :cond_16

    .line 447
    .line 448
    goto :goto_a

    .line 449
    :cond_16
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 454
    .line 455
    .line 456
    move-result v1

    .line 457
    if-eqz v1, :cond_17

    .line 458
    .line 459
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v1

    .line 463
    check-cast v1, La/pzs0;

    .line 464
    .line 465
    if-nez v1, :cond_18

    .line 466
    .line 467
    goto :goto_9

    .line 468
    :cond_17
    :goto_a
    new-instance v0, La/u3u0;

    .line 469
    .line 470
    const/4 v1, 0x0

    .line 471
    const/4 v8, 0x0

    .line 472
    invoke-direct {v0, v8, v11, v1}, La/u3u0;-><init>(La/kzj0;IZ)V

    .line 473
    .line 474
    .line 475
    return-object v0

    .line 476
    :cond_18
    invoke-virtual/range {p0 .. p0}, La/wsy;->getAnnotations()La/g93;

    .line 477
    .line 478
    .line 479
    move-result-object v0

    .line 480
    sget-object v8, La/rys0;->b:La/i93;

    .line 481
    .line 482
    if-eqz v6, :cond_19

    .line 483
    .line 484
    goto :goto_b

    .line 485
    :cond_19
    const/4 v8, 0x0

    .line 486
    :goto_b
    sget-object v1, La/rys0;->a:La/i93;

    .line 487
    .line 488
    if-eqz v16, :cond_1a

    .line 489
    .line 490
    goto :goto_c

    .line 491
    :cond_1a
    const/4 v1, 0x0

    .line 492
    :goto_c
    const/4 v2, 0x3

    .line 493
    new-array v2, v2, [La/g93;

    .line 494
    .line 495
    const/16 v18, 0x0

    .line 496
    .line 497
    aput-object v0, v2, v18

    .line 498
    .line 499
    const/4 v4, 0x1

    .line 500
    aput-object v8, v2, v4

    .line 501
    .line 502
    aput-object v1, v2, p4

    .line 503
    .line 504
    invoke-static {v2}, La/tx3;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    move-object v1, v0

    .line 509
    check-cast v1, Ljava/util/ArrayList;

    .line 510
    .line 511
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 512
    .line 513
    .line 514
    move-result v1

    .line 515
    if-eqz v1, :cond_21

    .line 516
    .line 517
    if-eq v1, v4, :cond_1b

    .line 518
    .line 519
    new-instance v1, La/i93;

    .line 520
    .line 521
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    invoke-direct {v1, v0, v4}, La/i93;-><init>(Ljava/util/List;B)V

    .line 526
    .line 527
    .line 528
    goto :goto_d

    .line 529
    :cond_1b
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->v0(Ljava/util/List;)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    move-object v1, v0

    .line 534
    check-cast v1, La/g93;

    .line 535
    .line 536
    :goto_d
    invoke-static {v1}, La/gnm0;->u(La/g93;)La/ays0;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    invoke-virtual/range {p0 .. p0}, La/wsy;->J()Ljava/util/List;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 545
    .line 546
    .line 547
    move-result-object v2

    .line 548
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 549
    .line 550
    .line 551
    move-result-object v5

    .line 552
    new-instance v6, Ljava/util/ArrayList;

    .line 553
    .line 554
    const/16 v7, 0xa

    .line 555
    .line 556
    invoke-static {v10, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 557
    .line 558
    .line 559
    move-result v8

    .line 560
    invoke-static {v1, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 561
    .line 562
    .line 563
    move-result v1

    .line 564
    invoke-static {v8, v1}, Ljava/lang/Math;->min(II)I

    .line 565
    .line 566
    .line 567
    move-result v1

    .line 568
    invoke-direct {v6, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 569
    .line 570
    .line 571
    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 572
    .line 573
    .line 574
    move-result v1

    .line 575
    if-eqz v1, :cond_1d

    .line 576
    .line 577
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 578
    .line 579
    .line 580
    move-result v1

    .line 581
    if-eqz v1, :cond_1d

    .line 582
    .line 583
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object v1

    .line 587
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v7

    .line 591
    check-cast v7, La/pzs0;

    .line 592
    .line 593
    check-cast v1, La/pzs0;

    .line 594
    .line 595
    if-nez v1, :cond_1c

    .line 596
    .line 597
    goto :goto_f

    .line 598
    :cond_1c
    move-object v7, v1

    .line 599
    :goto_f
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 600
    .line 601
    .line 602
    goto :goto_e

    .line 603
    :cond_1d
    if-eqz v16, :cond_1e

    .line 604
    .line 605
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Boolean;->booleanValue()Z

    .line 606
    .line 607
    .line 608
    move-result v1

    .line 609
    goto :goto_10

    .line 610
    :cond_1e
    invoke-virtual/range {p0 .. p0}, La/wsy;->U()Z

    .line 611
    .line 612
    .line 613
    move-result v1

    .line 614
    :goto_10
    invoke-static {v0, v3, v6, v1}, La/ucx;->g0(La/ays0;La/iys0;Ljava/util/List;Z)La/kzj0;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    iget-boolean v1, v9, La/iay;->c:Z

    .line 619
    .line 620
    if-eqz v1, :cond_1f

    .line 621
    .line 622
    new-instance v1, La/t660;

    .line 623
    .line 624
    invoke-direct {v1, v0}, La/t660;-><init>(La/kzj0;)V

    .line 625
    .line 626
    .line 627
    move-object v0, v1

    .line 628
    :cond_1f
    if-eqz v16, :cond_20

    .line 629
    .line 630
    iget-boolean v1, v9, La/iay;->d:Z

    .line 631
    .line 632
    if-eqz v1, :cond_20

    .line 633
    .line 634
    goto :goto_11

    .line 635
    :cond_20
    move/from16 v4, v18

    .line 636
    .line 637
    :goto_11
    new-instance v1, La/u3u0;

    .line 638
    .line 639
    invoke-direct {v1, v0, v11, v4}, La/u3u0;-><init>(La/kzj0;IZ)V

    .line 640
    .line 641
    .line 642
    return-object v1

    .line 643
    :cond_21
    const-string v0, "At least one Annotations object expected"

    .line 644
    .line 645
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 646
    .line 647
    .line 648
    const/16 v17, 0x0

    .line 649
    .line 650
    return-object v17
.end method

.method public static b(La/tft0;La/g5;IZ)La/y78;
    .locals 10

    .line 1
    invoke-static {p0}, La/bdx;->k0(La/wsy;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x5

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance p0, La/y78;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-direct {p0, v2, p1, v1}, La/y78;-><init>(Ljava/lang/Object;IB)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    instance-of v0, p0, La/kkq;

    .line 17
    .line 18
    if-eqz v0, :cond_b

    .line 19
    .line 20
    instance-of v7, p0, La/dae0;

    .line 21
    .line 22
    move-object v0, p0

    .line 23
    check-cast v0, La/kkq;

    .line 24
    .line 25
    iget-object v9, v0, La/kkq;->c:La/kzj0;

    .line 26
    .line 27
    iget-object v3, v0, La/kkq;->b:La/kzj0;

    .line 28
    .line 29
    sget-object v6, La/hys0;->a:La/hys0;

    .line 30
    .line 31
    move-object v4, p1

    .line 32
    move v5, p2

    .line 33
    move v8, p3

    .line 34
    invoke-static/range {v3 .. v8}, La/tqt;->a(La/kzj0;La/g5;ILa/hys0;ZZ)La/u3u0;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    move-object p2, v3

    .line 39
    iget-object p3, p1, La/u3u0;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p3, La/kzj0;

    .line 42
    .line 43
    iget-object v3, v0, La/kkq;->c:La/kzj0;

    .line 44
    .line 45
    sget-object v6, La/hys0;->b:La/hys0;

    .line 46
    .line 47
    invoke-static/range {v3 .. v8}, La/tqt;->a(La/kzj0;La/g5;ILa/hys0;ZZ)La/u3u0;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object v3, v0, La/u3u0;->c:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v3, La/kzj0;

    .line 54
    .line 55
    if-nez p3, :cond_1

    .line 56
    .line 57
    if-nez v3, :cond_1

    .line 58
    .line 59
    goto :goto_6

    .line 60
    :cond_1
    iget-boolean v2, p1, La/u3u0;->b:Z

    .line 61
    .line 62
    if-nez v2, :cond_8

    .line 63
    .line 64
    iget-boolean v0, v0, La/u3u0;->b:Z

    .line 65
    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_2
    if-eqz v7, :cond_5

    .line 70
    .line 71
    new-instance v2, La/dae0;

    .line 72
    .line 73
    if-nez p3, :cond_3

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    move-object p2, p3

    .line 77
    :goto_0
    if-nez v3, :cond_4

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_4
    move-object v9, v3

    .line 81
    :goto_1
    invoke-direct {v2, p2, v9}, La/dae0;-><init>(La/kzj0;La/kzj0;)V

    .line 82
    .line 83
    .line 84
    goto :goto_6

    .line 85
    :cond_5
    if-nez p3, :cond_6

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_6
    move-object p2, p3

    .line 89
    :goto_2
    if-nez v3, :cond_7

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_7
    move-object v9, v3

    .line 93
    :goto_3
    invoke-static {p2, v9}, La/ucx;->W(La/kzj0;La/kzj0;)La/tft0;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    goto :goto_6

    .line 98
    :cond_8
    :goto_4
    if-eqz v3, :cond_a

    .line 99
    .line 100
    if-nez p3, :cond_9

    .line 101
    .line 102
    move-object p3, v3

    .line 103
    :cond_9
    invoke-static {p3, v3}, La/ucx;->W(La/kzj0;La/kzj0;)La/tft0;

    .line 104
    .line 105
    .line 106
    move-result-object p3

    .line 107
    goto :goto_5

    .line 108
    :cond_a
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    :goto_5
    invoke-static {p0, p3}, La/xsm0;->z(La/tft0;La/wsy;)La/tft0;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    :goto_6
    new-instance p0, La/y78;

    .line 116
    .line 117
    iget p1, p1, La/u3u0;->a:I

    .line 118
    .line 119
    invoke-direct {p0, v2, p1, v1}, La/y78;-><init>(Ljava/lang/Object;IB)V

    .line 120
    .line 121
    .line 122
    return-object p0

    .line 123
    :cond_b
    move-object v4, p1

    .line 124
    move v5, p2

    .line 125
    move v8, p3

    .line 126
    instance-of p1, p0, La/kzj0;

    .line 127
    .line 128
    if-eqz p1, :cond_d

    .line 129
    .line 130
    move-object v3, p0

    .line 131
    check-cast v3, La/kzj0;

    .line 132
    .line 133
    sget-object v6, La/hys0;->c:La/hys0;

    .line 134
    .line 135
    const/4 v7, 0x0

    .line 136
    invoke-static/range {v3 .. v8}, La/tqt;->a(La/kzj0;La/g5;ILa/hys0;ZZ)La/u3u0;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    new-instance p2, La/y78;

    .line 141
    .line 142
    iget-boolean p3, p1, La/u3u0;->b:Z

    .line 143
    .line 144
    iget-object v0, p1, La/u3u0;->c:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v0, La/kzj0;

    .line 147
    .line 148
    if-eqz p3, :cond_c

    .line 149
    .line 150
    invoke-static {p0, v0}, La/xsm0;->z(La/tft0;La/wsy;)La/tft0;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    :cond_c
    iget p0, p1, La/u3u0;->a:I

    .line 155
    .line 156
    invoke-direct {p2, v0, p0, v1}, La/y78;-><init>(Ljava/lang/Object;IB)V

    .line 157
    .line 158
    .line 159
    return-object p2

    .line 160
    :cond_d
    invoke-static {}, La/t9f;->b()V

    .line 161
    .line 162
    .line 163
    return-object v2
.end method

.method public static c(Ljava/lang/String;)La/nrz;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/nrz;->b:La/nrz;

    .line 5
    .line 6
    const-string v1, "ACTIVE"

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    sget-object v0, La/nrz;->c:La/nrz;

    .line 16
    .line 17
    const-string v1, "PENDING"

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_1
    sget-object v0, La/nrz;->d:La/nrz;

    .line 27
    .line 28
    const-string v1, "INACTIVE"

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    return-object v0
.end method

.method public static d(I)La/wrz;
    .locals 3

    .line 1
    sget-object v0, La/asz;->b:La/asz;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne p0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    sget-object v1, La/ge7;->b:La/ge7;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-ne p0, v2, :cond_1

    .line 11
    .line 12
    return-object v1

    .line 13
    :cond_1
    sget-object v1, La/ge7;->c:La/ge7;

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    if-ne p0, v2, :cond_2

    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_2
    sget-object v1, La/ge7;->d:La/ge7;

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    if-ne p0, v2, :cond_3

    .line 23
    .line 24
    return-object v1

    .line 25
    :cond_3
    sget-object v1, La/o7k;->b:La/o7k;

    .line 26
    .line 27
    const/16 v2, 0x14

    .line 28
    .line 29
    if-ne p0, v2, :cond_4

    .line 30
    .line 31
    return-object v1

    .line 32
    :cond_4
    sget-object v1, La/o7k;->c:La/o7k;

    .line 33
    .line 34
    const/16 v2, 0x15

    .line 35
    .line 36
    if-ne p0, v2, :cond_5

    .line 37
    .line 38
    return-object v1

    .line 39
    :cond_5
    sget-object v1, La/o7k;->d:La/o7k;

    .line 40
    .line 41
    const/16 v2, 0x16

    .line 42
    .line 43
    if-ne p0, v2, :cond_6

    .line 44
    .line 45
    return-object v1

    .line 46
    :cond_6
    sget-object v1, La/g8i0;->a:La/g8i0;

    .line 47
    .line 48
    const/16 v2, 0x1e

    .line 49
    .line 50
    if-ne p0, v2, :cond_7

    .line 51
    .line 52
    return-object v1

    .line 53
    :cond_7
    sget-object v1, La/oki0;->b:La/oki0;

    .line 54
    .line 55
    const/16 v2, 0x1f

    .line 56
    .line 57
    if-ne p0, v2, :cond_8

    .line 58
    .line 59
    return-object v1

    .line 60
    :cond_8
    sget-object v1, La/oki0;->c:La/oki0;

    .line 61
    .line 62
    const/16 v2, 0x2b

    .line 63
    .line 64
    if-ne p0, v2, :cond_9

    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_9
    sget-object v1, La/oki0;->d:La/oki0;

    .line 68
    .line 69
    const/16 v2, 0x24

    .line 70
    .line 71
    if-ne p0, v2, :cond_a

    .line 72
    .line 73
    return-object v1

    .line 74
    :cond_a
    :goto_0
    return-object v0
.end method

.method public static e(La/q4f;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    packed-switch p0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    :pswitch_0
    const/4 p0, 0x0

    .line 12
    return p0

    .line 13
    :pswitch_1
    const/4 p0, 0x3

    .line 14
    return p0

    .line 15
    :pswitch_2
    const/4 p0, 0x2

    .line 16
    return p0

    .line 17
    :pswitch_3
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public static f(La/f3c0;)La/lc00;
    .locals 3

    .line 1
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v1, p0, La/f3c0;->i:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v1, La/t54;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-direct {v1, v2}, La/t54;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-boolean v1, p0, La/f3c0;->j:Z

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    new-instance v1, La/t54;

    .line 23
    .line 24
    const/16 v2, 0xb

    .line 25
    .line 26
    invoke-direct {v1, v2}, La/t54;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    :cond_1
    iget-boolean v1, p0, La/f3c0;->p:Z

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    new-instance v1, La/t54;

    .line 37
    .line 38
    const/16 v2, 0xd

    .line 39
    .line 40
    invoke-direct {v1, v2}, La/t54;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    :cond_2
    iget-boolean v1, p0, La/f3c0;->q:Z

    .line 47
    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    new-instance v1, La/t54;

    .line 51
    .line 52
    const/16 v2, 0x1f

    .line 53
    .line 54
    invoke-direct {v1, v2}, La/t54;-><init>(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :cond_3
    iget-boolean v1, p0, La/f3c0;->l:Z

    .line 61
    .line 62
    if-eqz v1, :cond_4

    .line 63
    .line 64
    new-instance v1, La/t54;

    .line 65
    .line 66
    const/16 v2, 0x9

    .line 67
    .line 68
    invoke-direct {v1, v2}, La/t54;-><init>(I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    :cond_4
    iget-boolean v1, p0, La/f3c0;->m:Z

    .line 75
    .line 76
    if-eqz v1, :cond_5

    .line 77
    .line 78
    new-instance v1, La/t54;

    .line 79
    .line 80
    const/4 v2, 0x7

    .line 81
    invoke-direct {v1, v2}, La/t54;-><init>(I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    :cond_5
    iget-boolean v1, p0, La/f3c0;->k:Z

    .line 88
    .line 89
    if-eqz v1, :cond_6

    .line 90
    .line 91
    new-instance v1, La/t54;

    .line 92
    .line 93
    const/4 v2, 0x5

    .line 94
    invoke-direct {v1, v2}, La/t54;-><init>(I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    :cond_6
    iget-boolean v1, p0, La/f3c0;->n:Z

    .line 101
    .line 102
    if-eqz v1, :cond_7

    .line 103
    .line 104
    new-instance v1, La/t54;

    .line 105
    .line 106
    const/16 v2, 0x11

    .line 107
    .line 108
    invoke-direct {v1, v2}, La/t54;-><init>(I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    :cond_7
    iget-boolean p0, p0, La/f3c0;->o:Z

    .line 115
    .line 116
    if-eqz p0, :cond_8

    .line 117
    .line 118
    new-instance p0, La/t54;

    .line 119
    .line 120
    const/16 v1, 0x13

    .line 121
    .line 122
    invoke-direct {p0, v1}, La/t54;-><init>(I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, p0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    :cond_8
    invoke-static {v0}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    return-object p0
.end method

.method public static g()Ljava/util/List;
    .locals 12

    .line 1
    new-instance v0, La/teb0;

    .line 2
    .line 3
    sget-object v1, La/y4t;->d:La/y4t;

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/teb0;-><init>(La/y4t;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/teb0;

    .line 9
    .line 10
    sget-object v2, La/y4t;->e:La/y4t;

    .line 11
    .line 12
    invoke-direct {v1, v2}, La/teb0;-><init>(La/y4t;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, La/teb0;

    .line 16
    .line 17
    sget-object v3, La/y4t;->f:La/y4t;

    .line 18
    .line 19
    invoke-direct {v2, v3}, La/teb0;-><init>(La/y4t;)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/teb0;

    .line 23
    .line 24
    sget-object v4, La/y4t;->g:La/y4t;

    .line 25
    .line 26
    invoke-direct {v3, v4}, La/teb0;-><init>(La/y4t;)V

    .line 27
    .line 28
    .line 29
    new-instance v4, La/teb0;

    .line 30
    .line 31
    sget-object v5, La/y4t;->i:La/y4t;

    .line 32
    .line 33
    invoke-direct {v4, v5}, La/teb0;-><init>(La/y4t;)V

    .line 34
    .line 35
    .line 36
    new-instance v5, La/teb0;

    .line 37
    .line 38
    sget-object v6, La/y4t;->j:La/y4t;

    .line 39
    .line 40
    invoke-direct {v5, v6}, La/teb0;-><init>(La/y4t;)V

    .line 41
    .line 42
    .line 43
    new-instance v6, La/teb0;

    .line 44
    .line 45
    sget-object v7, La/y4t;->k:La/y4t;

    .line 46
    .line 47
    invoke-direct {v6, v7}, La/teb0;-><init>(La/y4t;)V

    .line 48
    .line 49
    .line 50
    new-instance v7, La/teb0;

    .line 51
    .line 52
    sget-object v8, La/y4t;->l:La/y4t;

    .line 53
    .line 54
    invoke-direct {v7, v8}, La/teb0;-><init>(La/y4t;)V

    .line 55
    .line 56
    .line 57
    new-instance v8, La/teb0;

    .line 58
    .line 59
    sget-object v9, La/y4t;->h:La/y4t;

    .line 60
    .line 61
    invoke-direct {v8, v9}, La/teb0;-><init>(La/y4t;)V

    .line 62
    .line 63
    .line 64
    new-instance v9, La/teb0;

    .line 65
    .line 66
    sget-object v10, La/y4t;->m:La/y4t;

    .line 67
    .line 68
    invoke-direct {v9, v10}, La/teb0;-><init>(La/y4t;)V

    .line 69
    .line 70
    .line 71
    const/16 v10, 0xc

    .line 72
    .line 73
    new-array v10, v10, [La/web0;

    .line 74
    .line 75
    const/4 v11, 0x0

    .line 76
    aput-object v0, v10, v11

    .line 77
    .line 78
    const/4 v0, 0x1

    .line 79
    aput-object v1, v10, v0

    .line 80
    .line 81
    const/4 v0, 0x2

    .line 82
    aput-object v2, v10, v0

    .line 83
    .line 84
    const/4 v0, 0x3

    .line 85
    aput-object v3, v10, v0

    .line 86
    .line 87
    const/4 v0, 0x4

    .line 88
    aput-object v4, v10, v0

    .line 89
    .line 90
    sget-object v0, La/veb0;->a:La/veb0;

    .line 91
    .line 92
    const/4 v1, 0x5

    .line 93
    aput-object v0, v10, v1

    .line 94
    .line 95
    const/4 v0, 0x6

    .line 96
    aput-object v5, v10, v0

    .line 97
    .line 98
    const/4 v0, 0x7

    .line 99
    aput-object v6, v10, v0

    .line 100
    .line 101
    sget-object v0, La/ueb0;->a:La/ueb0;

    .line 102
    .line 103
    const/16 v1, 0x8

    .line 104
    .line 105
    aput-object v0, v10, v1

    .line 106
    .line 107
    const/16 v0, 0x9

    .line 108
    .line 109
    aput-object v7, v10, v0

    .line 110
    .line 111
    const/16 v0, 0xa

    .line 112
    .line 113
    aput-object v8, v10, v0

    .line 114
    .line 115
    const/16 v0, 0xb

    .line 116
    .line 117
    aput-object v9, v10, v0

    .line 118
    .line 119
    invoke-static {v10}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    return-object v0
.end method

.method public static i(Landroidx/fragment/app/e;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const-string v0, "HISTORY_MENU_DIALOG_TAG"

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance v1, La/c4w;

    .line 17
    .line 18
    invoke-direct {v1}, La/c4w;-><init>()V

    .line 19
    .line 20
    .line 21
    sget-object v2, La/c4w;->o2:[La/iiy;

    .line 22
    .line 23
    const/4 v3, 0x2

    .line 24
    aget-object v3, v2, v3

    .line 25
    .line 26
    iget-object v4, v1, La/c4w;->m2:La/lhf0;

    .line 27
    .line 28
    invoke-virtual {v4, v1, v3, p1}, La/lhf0;->I(Landroidx/fragment/app/Fragment;La/iiy;Ljava/util/List;)V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    aget-object p1, v2, p1

    .line 33
    .line 34
    iget-object v3, v1, La/c4w;->l2:La/phf0;

    .line 35
    .line 36
    invoke-virtual {v3, v1, p1, p2}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x0

    .line 40
    aget-object p1, v2, p1

    .line 41
    .line 42
    iget-object p2, v1, La/c4w;->k2:La/phf0;

    .line 43
    .line 44
    invoke-virtual {p2, v1, p1, p3}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, p0, v0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public static j(I)La/uoy;
    .locals 3

    .line 1
    sget-object v0, La/uoy;->i:La/c0o;

    .line 2
    .line 3
    invoke-static {v0, v0}, La/ohs0;->h(La/c0o;La/c0o;)La/y2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-virtual {v0}, La/y2;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, La/y2;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    move-object v2, v1

    .line 18
    check-cast v2, La/uoy;

    .line 19
    .line 20
    iget-byte v2, v2, La/uoy;->a:B

    .line 21
    .line 22
    if-ne v2, p0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v1, 0x0

    .line 26
    :goto_0
    check-cast v1, La/uoy;

    .line 27
    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    sget-object p0, La/uoy;->c:La/uoy;

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_2
    return-object v1
.end method


# virtual methods
.method public h(La/ch;)Ljava/util/List;
    .locals 21

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    new-instance v1, La/wtr0;

    .line 6
    .line 7
    sget-object v2, La/td80;->a:La/td80;

    .line 8
    .line 9
    sget-object v3, La/fiu;->a:[I

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    aget v3, v3, v4

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    if-ne v3, v4, :cond_0

    .line 19
    .line 20
    sget-object v5, La/md80;->o:La/md80;

    .line 21
    .line 22
    sget-object v6, La/md80;->v:La/md80;

    .line 23
    .line 24
    sget-object v7, La/md80;->w:La/md80;

    .line 25
    .line 26
    sget-object v8, La/md80;->B:La/md80;

    .line 27
    .line 28
    sget-object v9, La/md80;->Y:La/md80;

    .line 29
    .line 30
    sget-object v10, La/md80;->Z:La/md80;

    .line 31
    .line 32
    filled-new-array/range {v5 .. v10}, [La/md80;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-static {v3}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    sget-object v5, La/md80;->o:La/md80;

    .line 42
    .line 43
    sget-object v6, La/md80;->v:La/md80;

    .line 44
    .line 45
    sget-object v7, La/md80;->w:La/md80;

    .line 46
    .line 47
    sget-object v8, La/md80;->B:La/md80;

    .line 48
    .line 49
    sget-object v9, La/md80;->Y:La/md80;

    .line 50
    .line 51
    sget-object v10, La/md80;->Z:La/md80;

    .line 52
    .line 53
    sget-object v11, La/md80;->i1:La/md80;

    .line 54
    .line 55
    sget-object v12, La/md80;->j1:La/md80;

    .line 56
    .line 57
    sget-object v13, La/md80;->k1:La/md80;

    .line 58
    .line 59
    sget-object v14, La/md80;->l1:La/md80;

    .line 60
    .line 61
    sget-object v15, La/md80;->o1:La/md80;

    .line 62
    .line 63
    sget-object v16, La/md80;->p1:La/md80;

    .line 64
    .line 65
    sget-object v17, La/md80;->q1:La/md80;

    .line 66
    .line 67
    sget-object v18, La/md80;->r1:La/md80;

    .line 68
    .line 69
    sget-object v19, La/md80;->s1:La/md80;

    .line 70
    .line 71
    filled-new-array/range {v5 .. v19}, [La/md80;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-static {v3}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    :goto_0
    invoke-direct {v1, v2, v3}, La/wtr0;-><init>(La/td80;Ljava/util/List;)V

    .line 80
    .line 81
    .line 82
    new-instance v2, La/wtr0;

    .line 83
    .line 84
    sget-object v3, La/td80;->b:La/td80;

    .line 85
    .line 86
    sget-object v5, La/eiu;->a:[I

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    aget v5, v5, v6

    .line 93
    .line 94
    if-ne v5, v4, :cond_1

    .line 95
    .line 96
    sget-object v4, La/md80;->i:La/md80;

    .line 97
    .line 98
    sget-object v5, La/md80;->p:La/md80;

    .line 99
    .line 100
    sget-object v6, La/md80;->x:La/md80;

    .line 101
    .line 102
    sget-object v7, La/md80;->f1:La/md80;

    .line 103
    .line 104
    sget-object v8, La/md80;->u:La/md80;

    .line 105
    .line 106
    filled-new-array {v4, v5, v6, v7, v8}, [La/md80;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-static {v4}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    goto :goto_1

    .line 115
    :cond_1
    sget-object v5, La/md80;->i:La/md80;

    .line 116
    .line 117
    sget-object v6, La/md80;->p:La/md80;

    .line 118
    .line 119
    sget-object v7, La/md80;->x:La/md80;

    .line 120
    .line 121
    sget-object v8, La/md80;->f1:La/md80;

    .line 122
    .line 123
    sget-object v9, La/md80;->m1:La/md80;

    .line 124
    .line 125
    sget-object v10, La/md80;->t1:La/md80;

    .line 126
    .line 127
    sget-object v11, La/md80;->u:La/md80;

    .line 128
    .line 129
    filled-new-array/range {v5 .. v11}, [La/md80;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    invoke-static {v4}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    :goto_1
    invoke-direct {v2, v3, v4}, La/wtr0;-><init>(La/td80;Ljava/util/List;)V

    .line 138
    .line 139
    .line 140
    new-instance v3, La/wtr0;

    .line 141
    .line 142
    sget-object v4, La/td80;->c:La/td80;

    .line 143
    .line 144
    sget-object v5, La/ch;->b:La/ch;

    .line 145
    .line 146
    if-eq v0, v5, :cond_2

    .line 147
    .line 148
    sget-object v6, La/md80;->j:La/md80;

    .line 149
    .line 150
    sget-object v7, La/md80;->k:La/md80;

    .line 151
    .line 152
    sget-object v8, La/md80;->q:La/md80;

    .line 153
    .line 154
    sget-object v9, La/md80;->l:La/md80;

    .line 155
    .line 156
    sget-object v10, La/md80;->r:La/md80;

    .line 157
    .line 158
    sget-object v11, La/md80;->y:La/md80;

    .line 159
    .line 160
    sget-object v12, La/md80;->m:La/md80;

    .line 161
    .line 162
    sget-object v13, La/md80;->s:La/md80;

    .line 163
    .line 164
    sget-object v14, La/md80;->z:La/md80;

    .line 165
    .line 166
    sget-object v15, La/md80;->g1:La/md80;

    .line 167
    .line 168
    sget-object v16, La/md80;->n:La/md80;

    .line 169
    .line 170
    sget-object v17, La/md80;->t:La/md80;

    .line 171
    .line 172
    sget-object v18, La/md80;->A:La/md80;

    .line 173
    .line 174
    sget-object v19, La/md80;->h1:La/md80;

    .line 175
    .line 176
    sget-object v20, La/md80;->n1:La/md80;

    .line 177
    .line 178
    filled-new-array/range {v6 .. v20}, [La/md80;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    goto :goto_2

    .line 187
    :cond_2
    sget-object v5, La/md80;->j:La/md80;

    .line 188
    .line 189
    sget-object v6, La/md80;->k:La/md80;

    .line 190
    .line 191
    sget-object v7, La/md80;->q:La/md80;

    .line 192
    .line 193
    sget-object v8, La/md80;->l:La/md80;

    .line 194
    .line 195
    sget-object v9, La/md80;->r:La/md80;

    .line 196
    .line 197
    sget-object v10, La/md80;->y:La/md80;

    .line 198
    .line 199
    filled-new-array/range {v5 .. v10}, [La/md80;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    :goto_2
    invoke-direct {v3, v4, v0}, La/wtr0;-><init>(La/td80;Ljava/util/List;)V

    .line 208
    .line 209
    .line 210
    filled-new-array {v1, v2, v3}, [La/wtr0;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    return-object v0

    .line 219
    :cond_3
    sget-object v0, La/iun;->a:La/iun;

    .line 220
    .line 221
    return-object v0
.end method
