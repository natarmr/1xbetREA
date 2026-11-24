.class public final La/o4d;
.super La/o0d0;
.source "SourceFile"


# virtual methods
.method public final a(La/oms0;Ljava/lang/String;ILa/fet;I)La/l7m0;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v5, p4

    .line 6
    .line 7
    const v2, -0x7f2e35b5

    .line 8
    .line 9
    .line 10
    invoke-virtual {v5, v2}, La/fet;->e0(I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/z30;

    .line 14
    .line 15
    const/4 v3, 0x5

    .line 16
    move/from16 v4, p3

    .line 17
    .line 18
    invoke-direct {v2, v0, v4, v3}, La/z30;-><init>(Ljava/lang/Object;IB)V

    .line 19
    .line 20
    .line 21
    and-int/lit8 v4, p5, 0xe

    .line 22
    .line 23
    shl-int/lit8 v6, p5, 0x3

    .line 24
    .line 25
    and-int/lit16 v6, v6, 0x380

    .line 26
    .line 27
    or-int/2addr v4, v6

    .line 28
    iget-object v6, v1, La/oms0;->d:La/pz40;

    .line 29
    .line 30
    iget-object v7, v1, La/oms0;->a:La/p4;

    .line 31
    .line 32
    check-cast v6, La/hgk0;

    .line 33
    .line 34
    invoke-virtual {v6}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    check-cast v6, Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    const v8, 0x70158d31

    .line 45
    .line 46
    .line 47
    invoke-virtual {v5, v8}, La/fet;->e0(I)V

    .line 48
    .line 49
    .line 50
    iget-object v0, v0, La/o0d0;->a:Ljava/util/ArrayList;

    .line 51
    .line 52
    if-eqz v6, :cond_0

    .line 53
    .line 54
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    check-cast v6, La/boq0;

    .line 59
    .line 60
    iget-object v6, v6, La/boq0;->e:La/p0d0;

    .line 61
    .line 62
    check-cast v6, La/s0d0;

    .line 63
    .line 64
    iget-object v6, v6, La/s0d0;->b:Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    check-cast v6, La/dmy;

    .line 71
    .line 72
    iget-object v6, v6, La/dmy;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v6, La/y3d;

    .line 75
    .line 76
    iget-wide v9, v6, La/y3d;->a:J

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    check-cast v6, La/boq0;

    .line 84
    .line 85
    iget-object v6, v6, La/boq0;->e:La/p0d0;

    .line 86
    .line 87
    check-cast v6, La/s0d0;

    .line 88
    .line 89
    iget-object v6, v6, La/s0d0;->b:Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    check-cast v6, La/dmy;

    .line 96
    .line 97
    iget-object v6, v6, La/dmy;->b:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v6, La/y3d;

    .line 100
    .line 101
    iget-wide v9, v6, La/y3d;->a:J

    .line 102
    .line 103
    :goto_0
    const/4 v11, 0x0

    .line 104
    invoke-virtual {v5, v11}, La/fet;->r(Z)V

    .line 105
    .line 106
    .line 107
    invoke-static {v9, v10}, La/y3d;->f(J)La/y4d;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    invoke-virtual {v5, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v9

    .line 115
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    sget-object v12, La/ukd;->a:La/cl5;

    .line 120
    .line 121
    if-nez v9, :cond_1

    .line 122
    .line 123
    if-ne v10, v12, :cond_2

    .line 124
    .line 125
    :cond_1
    sget-object v9, La/qja;->j:La/qja;

    .line 126
    .line 127
    new-instance v10, La/s43;

    .line 128
    .line 129
    const/4 v13, 0x2

    .line 130
    invoke-direct {v10, v6, v13}, La/s43;-><init>(Ljava/lang/Object;B)V

    .line 131
    .line 132
    .line 133
    invoke-static {v9, v10, v5}, La/kng0;->d(La/qja;La/s43;La/fet;)La/lxs0;

    .line 134
    .line 135
    .line 136
    move-result-object v10

    .line 137
    :cond_2
    check-cast v10, La/lxs0;

    .line 138
    .line 139
    and-int/lit8 v6, v4, 0xe

    .line 140
    .line 141
    shl-int/lit8 v4, v4, 0x3

    .line 142
    .line 143
    and-int/lit16 v4, v4, 0x1c00

    .line 144
    .line 145
    or-int/2addr v4, v6

    .line 146
    invoke-virtual {v1}, La/oms0;->h()Z

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    const/4 v13, 0x4

    .line 151
    if-nez v6, :cond_9

    .line 152
    .line 153
    const v6, 0x6355e4b0

    .line 154
    .line 155
    .line 156
    invoke-virtual {v5, v6}, La/fet;->e0(I)V

    .line 157
    .line 158
    .line 159
    and-int/lit8 v6, v4, 0xe

    .line 160
    .line 161
    xor-int/lit8 v6, v6, 0x6

    .line 162
    .line 163
    if-le v6, v13, :cond_3

    .line 164
    .line 165
    invoke-virtual {v5, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v6

    .line 169
    if-nez v6, :cond_4

    .line 170
    .line 171
    :cond_3
    and-int/lit8 v6, v4, 0x6

    .line 172
    .line 173
    if-ne v6, v13, :cond_5

    .line 174
    .line 175
    :cond_4
    const/4 v6, 0x1

    .line 176
    goto :goto_1

    .line 177
    :cond_5
    move v6, v11

    .line 178
    :goto_1
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v14

    .line 182
    if-nez v6, :cond_6

    .line 183
    .line 184
    if-ne v14, v12, :cond_8

    .line 185
    .line 186
    :cond_6
    invoke-static {}, La/vdx;->J()La/rfk0;

    .line 187
    .line 188
    .line 189
    move-result-object v6

    .line 190
    if-eqz v6, :cond_7

    .line 191
    .line 192
    invoke-virtual {v6}, La/rfk0;->e()Lkotlin/jvm/functions/Function1;

    .line 193
    .line 194
    .line 195
    move-result-object v14

    .line 196
    goto :goto_2

    .line 197
    :cond_7
    const/4 v14, 0x0

    .line 198
    :goto_2
    invoke-static {v6}, La/vdx;->W(La/rfk0;)La/rfk0;

    .line 199
    .line 200
    .line 201
    move-result-object v15

    .line 202
    :try_start_0
    invoke-virtual {v7}, La/p4;->y0()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 206
    invoke-static {v6, v15, v14}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v5, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    move-object v14, v7

    .line 213
    :cond_8
    invoke-virtual {v5, v11}, La/fet;->r(Z)V

    .line 214
    .line 215
    .line 216
    goto :goto_3

    .line 217
    :catchall_0
    move-exception v0

    .line 218
    invoke-static {v6, v15, v14}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 219
    .line 220
    .line 221
    throw v0

    .line 222
    :cond_9
    const v6, 0x6359c50d

    .line 223
    .line 224
    .line 225
    invoke-static {v5, v6, v11, v7}, La/vqd;->j(La/fet;IZLa/p4;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v14

    .line 229
    :goto_3
    check-cast v14, Ljava/lang/Boolean;

    .line 230
    .line 231
    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    .line 232
    .line 233
    .line 234
    move-result v6

    .line 235
    invoke-virtual {v5, v8}, La/fet;->e0(I)V

    .line 236
    .line 237
    .line 238
    if-eqz v6, :cond_a

    .line 239
    .line 240
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v6

    .line 244
    check-cast v6, La/boq0;

    .line 245
    .line 246
    iget-object v6, v6, La/boq0;->e:La/p0d0;

    .line 247
    .line 248
    check-cast v6, La/s0d0;

    .line 249
    .line 250
    iget-object v6, v6, La/s0d0;->b:Ljava/util/ArrayList;

    .line 251
    .line 252
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v6

    .line 256
    check-cast v6, La/dmy;

    .line 257
    .line 258
    iget-object v6, v6, La/dmy;->b:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v6, La/y3d;

    .line 261
    .line 262
    iget-wide v6, v6, La/y3d;->a:J

    .line 263
    .line 264
    goto :goto_4

    .line 265
    :cond_a
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v6

    .line 269
    check-cast v6, La/boq0;

    .line 270
    .line 271
    iget-object v6, v6, La/boq0;->e:La/p0d0;

    .line 272
    .line 273
    check-cast v6, La/s0d0;

    .line 274
    .line 275
    iget-object v6, v6, La/s0d0;->b:Ljava/util/ArrayList;

    .line 276
    .line 277
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v6

    .line 281
    check-cast v6, La/dmy;

    .line 282
    .line 283
    iget-object v6, v6, La/dmy;->b:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast v6, La/y3d;

    .line 286
    .line 287
    iget-wide v6, v6, La/y3d;->a:J

    .line 288
    .line 289
    :goto_4
    invoke-static {v5, v11, v6, v7}, La/dw9;->f(La/fet;ZJ)La/y3d;

    .line 290
    .line 291
    .line 292
    move-result-object v6

    .line 293
    and-int/lit8 v7, v4, 0xe

    .line 294
    .line 295
    xor-int/lit8 v14, v7, 0x6

    .line 296
    .line 297
    if-le v14, v13, :cond_b

    .line 298
    .line 299
    invoke-virtual {v5, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v15

    .line 303
    if-nez v15, :cond_c

    .line 304
    .line 305
    :cond_b
    and-int/lit8 v15, v4, 0x6

    .line 306
    .line 307
    if-ne v15, v13, :cond_d

    .line 308
    .line 309
    :cond_c
    const/4 v15, 0x1

    .line 310
    goto :goto_5

    .line 311
    :cond_d
    move v15, v11

    .line 312
    :goto_5
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v9

    .line 316
    if-nez v15, :cond_e

    .line 317
    .line 318
    if-ne v9, v12, :cond_f

    .line 319
    .line 320
    :cond_e
    new-instance v9, La/elb;

    .line 321
    .line 322
    invoke-direct {v9, v1, v13}, La/elb;-><init>(La/oms0;B)V

    .line 323
    .line 324
    .line 325
    invoke-static {v9}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 326
    .line 327
    .line 328
    move-result-object v9

    .line 329
    invoke-virtual {v5, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    :cond_f
    check-cast v9, La/l7m0;

    .line 333
    .line 334
    invoke-interface {v9}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v9

    .line 338
    check-cast v9, Ljava/lang/Boolean;

    .line 339
    .line 340
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 341
    .line 342
    .line 343
    move-result v9

    .line 344
    invoke-virtual {v5, v8}, La/fet;->e0(I)V

    .line 345
    .line 346
    .line 347
    if-eqz v9, :cond_10

    .line 348
    .line 349
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    check-cast v0, La/boq0;

    .line 354
    .line 355
    iget-object v0, v0, La/boq0;->e:La/p0d0;

    .line 356
    .line 357
    check-cast v0, La/s0d0;

    .line 358
    .line 359
    iget-object v0, v0, La/s0d0;->b:Ljava/util/ArrayList;

    .line 360
    .line 361
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    check-cast v0, La/dmy;

    .line 366
    .line 367
    iget-object v0, v0, La/dmy;->b:Ljava/lang/Object;

    .line 368
    .line 369
    check-cast v0, La/y3d;

    .line 370
    .line 371
    iget-wide v8, v0, La/y3d;->a:J

    .line 372
    .line 373
    goto :goto_6

    .line 374
    :cond_10
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    check-cast v0, La/boq0;

    .line 379
    .line 380
    iget-object v0, v0, La/boq0;->e:La/p0d0;

    .line 381
    .line 382
    check-cast v0, La/s0d0;

    .line 383
    .line 384
    iget-object v0, v0, La/s0d0;->b:Ljava/util/ArrayList;

    .line 385
    .line 386
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    check-cast v0, La/dmy;

    .line 391
    .line 392
    iget-object v0, v0, La/dmy;->b:Ljava/lang/Object;

    .line 393
    .line 394
    check-cast v0, La/y3d;

    .line 395
    .line 396
    iget-wide v8, v0, La/y3d;->a:J

    .line 397
    .line 398
    :goto_6
    invoke-static {v5, v11, v8, v9}, La/dw9;->f(La/fet;ZJ)La/y3d;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    if-le v14, v13, :cond_11

    .line 403
    .line 404
    invoke-virtual {v5, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result v8

    .line 408
    if-nez v8, :cond_12

    .line 409
    .line 410
    :cond_11
    and-int/lit8 v8, v4, 0x6

    .line 411
    .line 412
    if-ne v8, v13, :cond_13

    .line 413
    .line 414
    :cond_12
    const/4 v9, 0x1

    .line 415
    goto :goto_7

    .line 416
    :cond_13
    move v9, v11

    .line 417
    :goto_7
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v8

    .line 421
    if-nez v9, :cond_14

    .line 422
    .line 423
    if-ne v8, v12, :cond_15

    .line 424
    .line 425
    :cond_14
    new-instance v8, La/elb;

    .line 426
    .line 427
    invoke-direct {v8, v1, v3}, La/elb;-><init>(La/oms0;B)V

    .line 428
    .line 429
    .line 430
    invoke-static {v8}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 431
    .line 432
    .line 433
    move-result-object v8

    .line 434
    invoke-virtual {v5, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    :cond_15
    check-cast v8, La/l7m0;

    .line 438
    .line 439
    invoke-interface {v8}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v3

    .line 443
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 444
    .line 445
    .line 446
    move-result-object v8

    .line 447
    invoke-virtual {v2, v3, v5, v8}, La/z30;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v2

    .line 451
    move-object v3, v2

    .line 452
    check-cast v3, La/cfq;

    .line 453
    .line 454
    const/high16 v2, 0x70000

    .line 455
    .line 456
    shl-int/lit8 v4, v4, 0x6

    .line 457
    .line 458
    and-int/2addr v2, v4

    .line 459
    or-int/2addr v2, v7

    .line 460
    move v4, v2

    .line 461
    move-object v2, v0

    .line 462
    move-object v0, v1

    .line 463
    move-object v1, v6

    .line 464
    move v6, v4

    .line 465
    move-object v4, v10

    .line 466
    invoke-static/range {v0 .. v6}, La/phu0;->E(La/oms0;Ljava/lang/Object;Ljava/lang/Object;La/cfq;La/lxs0;La/fet;I)La/cms0;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    invoke-virtual {v5, v11}, La/fet;->r(Z)V

    .line 471
    .line 472
    .line 473
    return-object v0
.end method
