.class public final La/x480;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(La/mm40;Landroidx/fragment/app/Fragment;La/v480;La/fet;)V
    .locals 14

    .line 1
    move-object/from16 v3, p2

    .line 2
    .line 3
    move-object/from16 v7, p3

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v8, v3, La/v480;->e:La/i3m0;

    .line 12
    .line 13
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v9, 0x0

    .line 18
    sget-object v10, La/ukd;->a:La/cl5;

    .line 19
    .line 20
    if-ne v0, v10, :cond_4

    .line 21
    .line 22
    invoke-static {p1}, La/vqd;->i(Landroidx/fragment/app/Fragment;)Landroid/app/Application;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    instance-of v1, v0, La/af3;

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    check-cast v0, La/af3;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v0, v9

    .line 34
    :goto_0
    const-class v1, La/u480;

    .line 35
    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, La/o5d0;

    .line 47
    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, La/ze3;

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    move-object v0, v9

    .line 58
    :goto_1
    instance-of v2, v0, La/u480;

    .line 59
    .line 60
    if-nez v2, :cond_2

    .line 61
    .line 62
    move-object v0, v9

    .line 63
    :cond_2
    check-cast v0, La/u480;

    .line 64
    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    sget-object v1, La/xbv0;->a:Ljava/util/LinkedHashMap;

    .line 68
    .line 69
    iget v1, v3, La/v480;->a:I

    .line 70
    .line 71
    invoke-static {p1}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    iget-object v2, v2, La/cb50;->a:Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {v1, v2}, La/xbv0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v2}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-static {v2, v1}, La/xbv0;->c(Landroid/app/Application;Ljava/lang/String;)La/ozi;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    iget-object v0, v0, La/u480;->a:La/cad;

    .line 97
    .line 98
    new-instance v2, La/ani;

    .line 99
    .line 100
    invoke-direct {v2, v0, v1, v3}, La/ani;-><init>(La/cad;La/ozi;La/v480;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v7, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    move-object v0, v2

    .line 107
    goto :goto_2

    .line 108
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 109
    .line 110
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_4
    :goto_2
    move-object v11, v0

    .line 119
    check-cast v11, La/ani;

    .line 120
    .line 121
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    if-ne v0, v10, :cond_5

    .line 126
    .line 127
    iget-object v0, v11, La/ani;->c:La/ozi;

    .line 128
    .line 129
    new-instance v1, La/dcv0;

    .line 130
    .line 131
    iget-object v2, v0, La/ozi;->p:La/onv;

    .line 132
    .line 133
    iget-object v2, v2, La/onv;->a:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v2, La/ali;

    .line 136
    .line 137
    invoke-virtual {v2}, La/ali;->z()La/e720;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    iget-object v4, v0, La/ozi;->i:La/sue;

    .line 142
    .line 143
    invoke-interface {v4}, La/sue;->w()La/vq;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-static {v4}, La/x1x;->x(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    iget-object v0, v0, La/ozi;->q:La/ii;

    .line 151
    .line 152
    invoke-direct {v1, v2, v4, v0}, La/dcv0;-><init>(La/e720;La/vq;La/ii;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v7, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    move-object v0, v1

    .line 159
    :cond_5
    move-object v1, v0

    .line 160
    check-cast v1, La/dcv0;

    .line 161
    .line 162
    iget-object v12, v3, La/v480;->b:Ljava/lang/String;

    .line 163
    .line 164
    invoke-interface {v8}, La/i3m0;->getKey()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    const-string v2, "_"

    .line 169
    .line 170
    invoke-static {v0, v2, v12}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    new-instance v2, La/q0h0;

    .line 175
    .line 176
    iget-object v4, v11, La/ani;->d:La/n5d0;

    .line 177
    .line 178
    invoke-interface {v4}, La/o5d0;->get()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    check-cast v4, La/zmi;

    .line 183
    .line 184
    invoke-direct {v2, v4}, La/q0h0;-><init>(La/p0h0;)V

    .line 185
    .line 186
    .line 187
    const-class v4, La/v580;

    .line 188
    .line 189
    sget-object v5, La/sre0;->a:La/tre0;

    .line 190
    .line 191
    invoke-virtual {v5, v4}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    sget v5, La/v580;->u:I

    .line 196
    .line 197
    const/16 v13, 0xc

    .line 198
    .line 199
    invoke-static {v4, v0, v2, v7, v13}, La/n4c;->X(La/sgy;Ljava/lang/String;La/q0h0;La/fet;I)La/k3t0;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    invoke-virtual {v7, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    invoke-virtual {v7, p1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    or-int/2addr v0, v2

    .line 212
    invoke-virtual {v7, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    or-int/2addr v0, v2

    .line 217
    invoke-virtual {v7, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    or-int/2addr v0, v2

    .line 222
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    if-nez v0, :cond_7

    .line 227
    .line 228
    if-ne v2, v10, :cond_6

    .line 229
    .line 230
    goto :goto_3

    .line 231
    :cond_6
    move-object v0, v2

    .line 232
    move-object v6, v4

    .line 233
    goto :goto_4

    .line 234
    :cond_7
    :goto_3
    new-instance v0, La/ah0;

    .line 235
    .line 236
    const/4 v5, 0x0

    .line 237
    const/16 v6, 0xc

    .line 238
    .line 239
    move-object v2, p1

    .line 240
    invoke-direct/range {v0 .. v6}, La/ah0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 241
    .line 242
    .line 243
    move-object v6, v4

    .line 244
    invoke-virtual {v7, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    :goto_4
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 248
    .line 249
    invoke-static {v7, v11, v0}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 250
    .line 251
    .line 252
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 253
    .line 254
    invoke-virtual {v7, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v4

    .line 258
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v5

    .line 262
    if-nez v4, :cond_8

    .line 263
    .line 264
    if-ne v5, v10, :cond_9

    .line 265
    .line 266
    :cond_8
    new-instance v5, La/w480;

    .line 267
    .line 268
    const/4 v4, 0x0

    .line 269
    invoke-direct {v5, v6, v9, v4}, La/w480;-><init>(La/k3t0;La/yje;B)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v7, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    :cond_9
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 276
    .line 277
    invoke-static {v7, v0, v5}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v7, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v4

    .line 284
    invoke-virtual {v7, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v5

    .line 288
    or-int/2addr v4, v5

    .line 289
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v5

    .line 293
    const/16 v11, 0x1c

    .line 294
    .line 295
    if-nez v4, :cond_a

    .line 296
    .line 297
    if-ne v5, v10, :cond_b

    .line 298
    .line 299
    :cond_a
    new-instance v5, La/nf60;

    .line 300
    .line 301
    invoke-direct {v5, v6, v3, v9, v11}, La/nf60;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v7, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    :cond_b
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 308
    .line 309
    invoke-static {v8, v12, v5, v7}, La/m0x0;->v(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;La/fet;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    if-ne v3, v10, :cond_c

    .line 317
    .line 318
    sget-object v3, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 319
    .line 320
    invoke-static {v3, v7}, La/m0x0;->I(Lkotlin/coroutines/g;La/fet;)La/vne;

    .line 321
    .line 322
    .line 323
    move-result-object v3

    .line 324
    invoke-virtual {v7, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    :cond_c
    check-cast v3, La/vne;

    .line 328
    .line 329
    invoke-virtual {v7, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v4

    .line 333
    invoke-virtual {v7, p1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result v5

    .line 337
    or-int/2addr v4, v5

    .line 338
    invoke-virtual {v7, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    move-result v5

    .line 342
    or-int/2addr v4, v5

    .line 343
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v5

    .line 347
    if-nez v4, :cond_d

    .line 348
    .line 349
    if-ne v5, v10, :cond_e

    .line 350
    .line 351
    :cond_d
    new-instance v5, La/jl40;

    .line 352
    .line 353
    const/16 v4, 0x12

    .line 354
    .line 355
    invoke-direct {v5, v1, p1, v6, v4}, La/jl40;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v7, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 359
    .line 360
    .line 361
    :cond_e
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 362
    .line 363
    invoke-virtual {v7, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result p1

    .line 367
    invoke-virtual {v7, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v1

    .line 371
    or-int/2addr p1, v1

    .line 372
    invoke-virtual {v7, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    move-result v1

    .line 376
    or-int/2addr p1, v1

    .line 377
    invoke-virtual {v7, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    move-result v1

    .line 381
    or-int/2addr p1, v1

    .line 382
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v1

    .line 386
    if-nez p1, :cond_f

    .line 387
    .line 388
    if-ne v1, v10, :cond_10

    .line 389
    .line 390
    :cond_f
    new-instance v1, La/et;

    .line 391
    .line 392
    invoke-direct {v1, v3, v6, v5, v11}, La/et;-><init>(La/vne;La/k3t0;Lkotlin/jvm/functions/Function1;B)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v7, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 396
    .line 397
    .line 398
    :cond_10
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 399
    .line 400
    invoke-static {v0, v1, v7}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v7, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result p1

    .line 407
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    if-nez p1, :cond_11

    .line 412
    .line 413
    if-ne v0, v10, :cond_12

    .line 414
    .line 415
    :cond_11
    new-instance v0, La/dbh;

    .line 416
    .line 417
    invoke-direct {v0, v6, v13}, La/dbh;-><init>(La/k3t0;B)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v7, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 421
    .line 422
    .line 423
    :cond_12
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 424
    .line 425
    invoke-virtual {v7, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    move-result p1

    .line 429
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v1

    .line 433
    if-nez p1, :cond_13

    .line 434
    .line 435
    if-ne v1, v10, :cond_14

    .line 436
    .line 437
    :cond_13
    new-instance v1, La/dbh;

    .line 438
    .line 439
    const/16 p1, 0xd

    .line 440
    .line 441
    invoke-direct {v1, v6, p1}, La/dbh;-><init>(La/k3t0;B)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v7, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 445
    .line 446
    .line 447
    :cond_14
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 448
    .line 449
    const/4 v4, 0x0

    .line 450
    const/4 v5, 0x4

    .line 451
    const/4 v2, 0x0

    .line 452
    move-object v3, v7

    .line 453
    invoke-static/range {v0 .. v5}, La/v3c;->A(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 454
    .line 455
    .line 456
    move-object v4, v6

    .line 457
    check-cast v4, La/i3t0;

    .line 458
    .line 459
    invoke-virtual {v4, v3}, La/i3t0;->y(La/fet;)La/pz40;

    .line 460
    .line 461
    .line 462
    move-result-object p1

    .line 463
    invoke-interface {p1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object p1

    .line 467
    check-cast p1, La/q580;

    .line 468
    .line 469
    iget-object p1, p1, La/q580;->a:La/a4x;

    .line 470
    .line 471
    invoke-virtual {v3, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    move-result v0

    .line 475
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v1

    .line 479
    if-nez v0, :cond_15

    .line 480
    .line 481
    if-ne v1, v10, :cond_16

    .line 482
    .line 483
    :cond_15
    new-instance v1, La/caz;

    .line 484
    .line 485
    const/16 v0, 0x8

    .line 486
    .line 487
    invoke-direct {v1, v4, v0}, La/caz;-><init>(Ljava/lang/Object;B)V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v3, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    :cond_16
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 494
    .line 495
    const/4 v0, 0x6

    .line 496
    invoke-static {v0, v3, p1, p0, v1}, La/wdx;->q(ILa/fet;La/a4x;La/mm40;Lkotlin/jvm/functions/Function1;)V

    .line 497
    .line 498
    .line 499
    return-void
.end method
