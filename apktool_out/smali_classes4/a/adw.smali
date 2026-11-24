.class public final synthetic La/adw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/adw;->a:B

    iput-object p1, p0, La/adw;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/adw;->a:B

    .line 4
    .line 5
    const v2, 0x2fd4df92

    .line 6
    .line 7
    .line 8
    const/16 v3, 0x8

    .line 9
    .line 10
    const/16 v4, 0xa

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    iget-object v0, v0, La/adw;->b:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v0, La/d9z;

    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, Ljava/lang/Float;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    neg-float v1, v1

    .line 29
    const/4 v2, 0x0

    .line 30
    cmpg-float v3, v1, v2

    .line 31
    .line 32
    if-gez v3, :cond_0

    .line 33
    .line 34
    invoke-virtual {v0}, La/d9z;->d()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_1

    .line 39
    .line 40
    :cond_0
    cmpl-float v3, v1, v2

    .line 41
    .line 42
    if-lez v3, :cond_2

    .line 43
    .line 44
    invoke-virtual {v0}, La/d9z;->c()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-nez v3, :cond_2

    .line 49
    .line 50
    :cond_1
    move v1, v2

    .line 51
    goto/16 :goto_4

    .line 52
    .line 53
    :cond_2
    iget v3, v0, La/d9z;->g:F

    .line 54
    .line 55
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    const/high16 v4, 0x3f000000    # 0.5f

    .line 60
    .line 61
    cmpg-float v3, v3, v4

    .line 62
    .line 63
    if-gtz v3, :cond_3

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    const-string v3, "entered drag with non-zero pending scroll"

    .line 67
    .line 68
    invoke-static {v3}, La/adx;->c(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :goto_0
    iget v3, v0, La/d9z;->g:F

    .line 72
    .line 73
    add-float/2addr v3, v1

    .line 74
    iput v3, v0, La/d9z;->g:F

    .line 75
    .line 76
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    cmpl-float v3, v3, v4

    .line 81
    .line 82
    if-lez v3, :cond_8

    .line 83
    .line 84
    iget v3, v0, La/d9z;->g:F

    .line 85
    .line 86
    invoke-static {v3}, La/si30;->b(F)I

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    iget-object v8, v0, La/d9z;->e:La/pz40;

    .line 91
    .line 92
    check-cast v8, La/hgk0;

    .line 93
    .line 94
    invoke-virtual {v8}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    check-cast v8, La/q8z;

    .line 99
    .line 100
    iget-boolean v9, v0, La/d9z;->b:Z

    .line 101
    .line 102
    xor-int/2addr v9, v6

    .line 103
    invoke-virtual {v8, v5, v9}, La/q8z;->g(IZ)La/q8z;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    if-eqz v8, :cond_5

    .line 108
    .line 109
    iget-object v9, v0, La/d9z;->c:La/q8z;

    .line 110
    .line 111
    if-eqz v9, :cond_5

    .line 112
    .line 113
    invoke-virtual {v9, v5, v6}, La/q8z;->g(IZ)La/q8z;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    if-eqz v5, :cond_4

    .line 118
    .line 119
    iput-object v5, v0, La/d9z;->c:La/q8z;

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_4
    const/4 v7, 0x0

    .line 123
    goto :goto_2

    .line 124
    :cond_5
    :goto_1
    move-object v7, v8

    .line 125
    :goto_2
    if-eqz v7, :cond_6

    .line 126
    .line 127
    iget-boolean v5, v0, La/d9z;->b:Z

    .line 128
    .line 129
    invoke-virtual {v0, v7, v5, v6}, La/d9z;->g(La/q8z;ZZ)V

    .line 130
    .line 131
    .line 132
    iget-object v5, v0, La/d9z;->r:La/pz40;

    .line 133
    .line 134
    invoke-static {v5}, La/m8x;->Z(La/pz40;)V

    .line 135
    .line 136
    .line 137
    iget v5, v0, La/d9z;->g:F

    .line 138
    .line 139
    sub-float/2addr v3, v5

    .line 140
    invoke-virtual {v0, v3, v7}, La/d9z;->k(FLa/q8z;)V

    .line 141
    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_6
    iget-object v5, v0, La/d9z;->j:La/e7z;

    .line 145
    .line 146
    if-eqz v5, :cond_7

    .line 147
    .line 148
    invoke-virtual {v5}, La/e7z;->l()V

    .line 149
    .line 150
    .line 151
    :cond_7
    iget v5, v0, La/d9z;->g:F

    .line 152
    .line 153
    sub-float/2addr v3, v5

    .line 154
    invoke-virtual {v0}, La/d9z;->j()La/q8z;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    invoke-virtual {v0, v3, v5}, La/d9z;->k(FLa/q8z;)V

    .line 159
    .line 160
    .line 161
    :cond_8
    :goto_3
    iget v3, v0, La/d9z;->g:F

    .line 162
    .line 163
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    cmpg-float v3, v3, v4

    .line 168
    .line 169
    if-gtz v3, :cond_9

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_9
    iget v3, v0, La/d9z;->g:F

    .line 173
    .line 174
    sub-float/2addr v1, v3

    .line 175
    iput v2, v0, La/d9z;->g:F

    .line 176
    .line 177
    :goto_4
    neg-float v0, v1

    .line 178
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    return-object v0

    .line 183
    :pswitch_0
    check-cast v0, La/y8z;

    .line 184
    .line 185
    move-object/from16 v1, p1

    .line 186
    .line 187
    check-cast v1, Ljava/lang/Integer;

    .line 188
    .line 189
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    invoke-virtual {v0, v1}, La/y8z;->c(I)I

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    return-object v0

    .line 202
    :pswitch_1
    check-cast v0, La/k4z;

    .line 203
    .line 204
    move-object/from16 v1, p1

    .line 205
    .line 206
    check-cast v1, La/znq0;

    .line 207
    .line 208
    new-instance v2, La/c4z;

    .line 209
    .line 210
    iget-object v0, v0, La/k4z;->a:La/h4z;

    .line 211
    .line 212
    iget-wide v3, v0, La/h4z;->a:J

    .line 213
    .line 214
    iget-wide v0, v1, La/znq0;->a:J

    .line 215
    .line 216
    invoke-direct {v2, v3, v4, v0, v1}, La/c4z;-><init>(JJ)V

    .line 217
    .line 218
    .line 219
    return-object v2

    .line 220
    :pswitch_2
    check-cast v0, La/gxu;

    .line 221
    .line 222
    move-object/from16 v1, p1

    .line 223
    .line 224
    check-cast v1, La/k9s;

    .line 225
    .line 226
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    iget-object v2, v1, La/k9s;->X:Ljava/lang/Long;

    .line 230
    .line 231
    iget-object v3, v1, La/k9s;->Y:Ljava/lang/Long;

    .line 232
    .line 233
    iget-boolean v4, v1, La/k9s;->u:Z

    .line 234
    .line 235
    if-eqz v4, :cond_a

    .line 236
    .line 237
    if-eqz v3, :cond_a

    .line 238
    .line 239
    new-instance v0, La/z3z;

    .line 240
    .line 241
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 242
    .line 243
    .line 244
    move-result-wide v1

    .line 245
    invoke-direct {v0, v1, v2}, La/z3z;-><init>(J)V

    .line 246
    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_a
    if-eqz v4, :cond_b

    .line 250
    .line 251
    if-eqz v2, :cond_b

    .line 252
    .line 253
    new-instance v0, La/z3z;

    .line 254
    .line 255
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 256
    .line 257
    .line 258
    move-result-wide v1

    .line 259
    invoke-direct {v0, v1, v2}, La/z3z;-><init>(J)V

    .line 260
    .line 261
    .line 262
    goto :goto_5

    .line 263
    :cond_b
    iget-object v0, v0, La/gxu;->c:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast v0, La/jx50;

    .line 266
    .line 267
    iget-object v0, v0, La/jx50;->a:La/ix50;

    .line 268
    .line 269
    iput-object v2, v0, La/ix50;->a:Ljava/lang/Long;

    .line 270
    .line 271
    iput-object v3, v0, La/ix50;->b:Ljava/lang/Long;

    .line 272
    .line 273
    new-instance v0, La/a4z;

    .line 274
    .line 275
    invoke-direct {v0, v1}, La/a4z;-><init>(La/k9s;)V

    .line 276
    .line 277
    .line 278
    :goto_5
    return-object v0

    .line 279
    :pswitch_3
    check-cast v0, La/ljg;

    .line 280
    .line 281
    move-object/from16 v1, p1

    .line 282
    .line 283
    check-cast v1, La/ljg;

    .line 284
    .line 285
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    return-object v0

    .line 289
    :pswitch_4
    move-object v1, v0

    .line 290
    check-cast v1, La/u1z;

    .line 291
    .line 292
    move-object/from16 v0, p1

    .line 293
    .line 294
    check-cast v0, Ljava/lang/Throwable;

    .line 295
    .line 296
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 300
    .line 301
    .line 302
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 303
    .line 304
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 305
    .line 306
    :cond_c
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 314
    .line 315
    move-object v4, v0

    .line 316
    check-cast v4, La/d1z;

    .line 317
    .line 318
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    const/4 v13, 0x0

    .line 322
    const/16 v14, 0x1fc

    .line 323
    .line 324
    const/4 v5, 0x0

    .line 325
    const/4 v6, 0x1

    .line 326
    const/4 v7, 0x0

    .line 327
    const/4 v8, 0x0

    .line 328
    const/4 v9, 0x0

    .line 329
    const/4 v10, 0x0

    .line 330
    const/4 v11, 0x0

    .line 331
    const/4 v12, 0x0

    .line 332
    invoke-static/range {v4 .. v14}, La/d1z;->a(La/d1z;ZZILa/zdm0;La/nc5;La/n3q;Ljava/util/ArrayList;La/hxs0;ZI)La/d1z;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    move-result v0

    .line 340
    if-eqz v0, :cond_c

    .line 341
    .line 342
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 343
    .line 344
    return-object v0

    .line 345
    :pswitch_5
    check-cast v0, La/wzy;

    .line 346
    .line 347
    move-object/from16 v1, p1

    .line 348
    .line 349
    check-cast v1, Ljava/lang/Throwable;

    .line 350
    .line 351
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    iget-object v2, v0, La/wzy;->o:La/duj;

    .line 355
    .line 356
    new-instance v3, La/xxv;

    .line 357
    .line 358
    const/16 v4, 0x1a

    .line 359
    .line 360
    invoke-direct {v3, v0, v4}, La/xxv;-><init>(Ljava/lang/Object;B)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 364
    .line 365
    .line 366
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 367
    .line 368
    return-object v0

    .line 369
    :pswitch_6
    check-cast v0, La/hjg;

    .line 370
    .line 371
    move-object/from16 v1, p1

    .line 372
    .line 373
    check-cast v1, La/pyy;

    .line 374
    .line 375
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 376
    .line 377
    .line 378
    iget-object v2, v1, La/pyy;->c:La/j0g0;

    .line 379
    .line 380
    if-eqz v2, :cond_e

    .line 381
    .line 382
    iget-object v2, v2, La/j0g0;->a:Ljava/lang/Object;

    .line 383
    .line 384
    instance-of v3, v2, La/g0g0;

    .line 385
    .line 386
    if-eqz v3, :cond_d

    .line 387
    .line 388
    const/4 v2, 0x0

    .line 389
    :cond_d
    check-cast v2, Ljava/util/List;

    .line 390
    .line 391
    goto :goto_6

    .line 392
    :cond_e
    const/4 v2, 0x0

    .line 393
    :goto_6
    if-nez v2, :cond_f

    .line 394
    .line 395
    sget-object v2, La/iun;->a:La/iun;

    .line 396
    .line 397
    :cond_f
    iget-object v3, v1, La/pyy;->d:Ljava/util/Set;

    .line 398
    .line 399
    iget-object v6, v1, La/pyy;->b:La/ypl0;

    .line 400
    .line 401
    iget-object v10, v0, La/hjg;->b:La/ctf0;

    .line 402
    .line 403
    iget-object v0, v1, La/pyy;->e:Ljava/util/List;

    .line 404
    .line 405
    iget-object v8, v1, La/pyy;->f:La/sff0;

    .line 406
    .line 407
    iget-object v8, v8, La/sff0;->g:La/mum0;

    .line 408
    .line 409
    iget-object v9, v8, La/mum0;->y:La/v5l0;

    .line 410
    .line 411
    iget-boolean v1, v1, La/pyy;->g:Z

    .line 412
    .line 413
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 420
    .line 421
    .line 422
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 423
    .line 424
    .line 425
    new-instance v8, Ljava/util/ArrayList;

    .line 426
    .line 427
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 428
    .line 429
    .line 430
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 431
    .line 432
    .line 433
    move-result-object v2

    .line 434
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 435
    .line 436
    .line 437
    move-result v11

    .line 438
    if-eqz v11, :cond_1b

    .line 439
    .line 440
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v11

    .line 444
    check-cast v11, La/d2w;

    .line 445
    .line 446
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 447
    .line 448
    .line 449
    move-result-object v12

    .line 450
    :cond_10
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 451
    .line 452
    .line 453
    move-result v13

    .line 454
    if-eqz v13, :cond_11

    .line 455
    .line 456
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v13

    .line 460
    move-object v14, v13

    .line 461
    check-cast v14, La/lok0;

    .line 462
    .line 463
    iget v14, v14, La/lok0;->a:I

    .line 464
    .line 465
    invoke-virtual {v11}, La/d2w;->a()I

    .line 466
    .line 467
    .line 468
    move-result v15

    .line 469
    if-ne v14, v15, :cond_10

    .line 470
    .line 471
    goto :goto_8

    .line 472
    :cond_11
    const/4 v13, 0x0

    .line 473
    :goto_8
    check-cast v13, La/lok0;

    .line 474
    .line 475
    invoke-virtual {v11}, La/d2w;->b()J

    .line 476
    .line 477
    .line 478
    move-result-wide v14

    .line 479
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 480
    .line 481
    .line 482
    move-result-object v12

    .line 483
    invoke-interface {v3, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 484
    .line 485
    .line 486
    move-result v12

    .line 487
    if-eqz v13, :cond_12

    .line 488
    .line 489
    iget-boolean v14, v13, La/lok0;->n:Z

    .line 490
    .line 491
    move v15, v14

    .line 492
    goto :goto_9

    .line 493
    :cond_12
    const/4 v15, 0x0

    .line 494
    :goto_9
    if-eqz v13, :cond_13

    .line 495
    .line 496
    iget-boolean v14, v13, La/lok0;->p:Z

    .line 497
    .line 498
    :goto_a
    const/16 v19, 0x0

    .line 499
    .line 500
    goto :goto_b

    .line 501
    :cond_13
    const/4 v14, 0x0

    .line 502
    goto :goto_a

    .line 503
    :goto_b
    new-instance v5, Ljava/util/ArrayList;

    .line 504
    .line 505
    invoke-static {v0, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 506
    .line 507
    .line 508
    move-result v7

    .line 509
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 510
    .line 511
    .line 512
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 513
    .line 514
    .line 515
    move-result-object v7

    .line 516
    :goto_c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 517
    .line 518
    .line 519
    move-result v16

    .line 520
    if-eqz v16, :cond_14

    .line 521
    .line 522
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v16

    .line 526
    move-object/from16 v4, v16

    .line 527
    .line 528
    check-cast v4, La/lok0;

    .line 529
    .line 530
    iget v4, v4, La/lok0;->a:I

    .line 531
    .line 532
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 533
    .line 534
    .line 535
    move-result-object v4

    .line 536
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 537
    .line 538
    .line 539
    const/16 v4, 0xa

    .line 540
    .line 541
    goto :goto_c

    .line 542
    :cond_14
    iget-object v4, v6, La/ypl0;->c:La/lel0;

    .line 543
    .line 544
    iget-object v4, v4, La/lel0;->j:Ljava/lang/String;

    .line 545
    .line 546
    if-eqz v13, :cond_15

    .line 547
    .line 548
    iget-object v7, v13, La/lok0;->u:Ljava/lang/String;

    .line 549
    .line 550
    goto :goto_d

    .line 551
    :cond_15
    const/4 v7, 0x0

    .line 552
    :goto_d
    if-nez v7, :cond_16

    .line 553
    .line 554
    const-string v7, ""

    .line 555
    .line 556
    :cond_16
    move-object/from16 v16, v7

    .line 557
    .line 558
    instance-of v7, v11, La/x1w;

    .line 559
    .line 560
    if-eqz v7, :cond_17

    .line 561
    .line 562
    check-cast v11, La/x1w;

    .line 563
    .line 564
    const/16 v18, 0x1

    .line 565
    .line 566
    move/from16 v17, v1

    .line 567
    .line 568
    move-object v13, v4

    .line 569
    move-object v1, v8

    .line 570
    move-object v8, v11

    .line 571
    move-object v11, v5

    .line 572
    invoke-static/range {v8 .. v18}, La/p8a;->h0(La/x1w;La/v5l0;La/ctf0;Ljava/util/List;ZLjava/lang/String;ZZLjava/lang/String;ZZ)La/lla;

    .line 573
    .line 574
    .line 575
    move-result-object v4

    .line 576
    :goto_e
    move/from16 v5, v17

    .line 577
    .line 578
    goto :goto_f

    .line 579
    :cond_17
    move/from16 v17, v1

    .line 580
    .line 581
    move-object v13, v4

    .line 582
    move-object v4, v5

    .line 583
    move-object v1, v8

    .line 584
    instance-of v5, v11, La/y1w;

    .line 585
    .line 586
    if-eqz v5, :cond_18

    .line 587
    .line 588
    move-object v8, v11

    .line 589
    check-cast v8, La/y1w;

    .line 590
    .line 591
    const/16 v18, 0x1

    .line 592
    .line 593
    move-object v11, v4

    .line 594
    invoke-static/range {v8 .. v18}, La/zgc;->Q(La/y1w;La/v5l0;La/ctf0;Ljava/util/List;ZLjava/lang/String;ZZLjava/lang/String;ZZ)La/lla;

    .line 595
    .line 596
    .line 597
    move-result-object v4

    .line 598
    goto :goto_e

    .line 599
    :cond_18
    instance-of v5, v11, La/c2w;

    .line 600
    .line 601
    if-eqz v5, :cond_19

    .line 602
    .line 603
    move-object v8, v11

    .line 604
    check-cast v8, La/c2w;

    .line 605
    .line 606
    const/16 v18, 0x1

    .line 607
    .line 608
    move-object v11, v4

    .line 609
    invoke-static/range {v8 .. v18}, La/x8f;->g0(La/c2w;La/v5l0;La/ctf0;Ljava/util/List;ZLjava/lang/String;ZZLjava/lang/String;ZZ)La/lla;

    .line 610
    .line 611
    .line 612
    move-result-object v4

    .line 613
    goto :goto_e

    .line 614
    :cond_19
    move/from16 v5, v17

    .line 615
    .line 616
    const/4 v4, 0x0

    .line 617
    :goto_f
    if-eqz v4, :cond_1a

    .line 618
    .line 619
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 620
    .line 621
    .line 622
    :cond_1a
    move-object v8, v1

    .line 623
    move v1, v5

    .line 624
    const/16 v4, 0xa

    .line 625
    .line 626
    goto/16 :goto_7

    .line 627
    .line 628
    :cond_1b
    move v5, v1

    .line 629
    move-object v1, v8

    .line 630
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 631
    .line 632
    .line 633
    move-result v0

    .line 634
    if-eqz v0, :cond_1c

    .line 635
    .line 636
    sget-object v0, La/iun;->a:La/iun;

    .line 637
    .line 638
    goto :goto_10

    .line 639
    :cond_1c
    new-instance v0, La/jyy;

    .line 640
    .line 641
    const-string v2, "LAST_FIGHTS"

    .line 642
    .line 643
    invoke-static {v1}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 644
    .line 645
    .line 646
    move-result-object v1

    .line 647
    invoke-direct {v0, v1, v2, v5}, La/jyy;-><init>(La/a4x;Ljava/lang/String;Z)V

    .line 648
    .line 649
    .line 650
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 651
    .line 652
    .line 653
    move-result-object v0

    .line 654
    :goto_10
    return-object v0

    .line 655
    :pswitch_7
    check-cast v0, La/jty;

    .line 656
    .line 657
    move-object/from16 v1, p1

    .line 658
    .line 659
    check-cast v1, Landroid/graphics/drawable/Drawable;

    .line 660
    .line 661
    invoke-virtual {v0}, La/jty;->Q0()La/kty;

    .line 662
    .line 663
    .line 664
    move-result-object v0

    .line 665
    iget-object v0, v0, La/kty;->c:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 666
    .line 667
    const/4 v1, 0x0

    .line 668
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 669
    .line 670
    .line 671
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 672
    .line 673
    return-object v0

    .line 674
    :pswitch_8
    check-cast v0, La/f8y;

    .line 675
    .line 676
    move-object/from16 v1, p1

    .line 677
    .line 678
    check-cast v1, Ljava/lang/Throwable;

    .line 679
    .line 680
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 681
    .line 682
    .line 683
    iget-object v0, v0, La/f8y;->t:La/duj;

    .line 684
    .line 685
    new-instance v2, La/v1x;

    .line 686
    .line 687
    const/16 v3, 0x18

    .line 688
    .line 689
    invoke-direct {v2, v3}, La/v1x;-><init>(B)V

    .line 690
    .line 691
    .line 692
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 693
    .line 694
    .line 695
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 696
    .line 697
    return-object v0

    .line 698
    :pswitch_9
    check-cast v0, La/t0y;

    .line 699
    .line 700
    move-object/from16 v1, p1

    .line 701
    .line 702
    check-cast v1, La/t7y;

    .line 703
    .line 704
    sget-object v2, La/t0y;->P1:La/gst;

    .line 705
    .line 706
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 707
    .line 708
    .line 709
    sget-object v2, La/t7y;->a:La/t7y;

    .line 710
    .line 711
    invoke-virtual {v1, v2}, La/t7y;->equals(Ljava/lang/Object;)Z

    .line 712
    .line 713
    .line 714
    move-result v1

    .line 715
    if-eqz v1, :cond_1e

    .line 716
    .line 717
    iget-object v1, v0, La/t0y;->M1:La/ii;

    .line 718
    .line 719
    if-eqz v1, :cond_1d

    .line 720
    .line 721
    new-instance v2, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 722
    .line 723
    const v3, 0x7f130162

    .line 724
    .line 725
    .line 726
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 727
    .line 728
    .line 729
    move-result-object v3

    .line 730
    const v4, 0x7f1316ef

    .line 731
    .line 732
    .line 733
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 734
    .line 735
    .line 736
    move-result-object v4

    .line 737
    const v5, 0x7f130e5c

    .line 738
    .line 739
    .line 740
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 741
    .line 742
    .line 743
    move-result-object v5

    .line 744
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 745
    .line 746
    .line 747
    sget-object v11, La/n12;->b:La/n12;

    .line 748
    .line 749
    const/4 v12, 0x0

    .line 750
    const/16 v13, 0x5d8

    .line 751
    .line 752
    const/4 v6, 0x0

    .line 753
    const/4 v7, 0x0

    .line 754
    const-string v8, "CHANGE_BONUS_BALANCE_TO_PRIMARY_KEY"

    .line 755
    .line 756
    const/4 v9, 0x0

    .line 757
    const/4 v10, 0x0

    .line 758
    invoke-direct/range {v2 .. v13}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 759
    .line 760
    .line 761
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 762
    .line 763
    .line 764
    move-result-object v3

    .line 765
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 766
    .line 767
    .line 768
    invoke-virtual {v1, v2, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 769
    .line 770
    .line 771
    invoke-virtual {v0}, La/t0y;->G0()La/k3t0;

    .line 772
    .line 773
    .line 774
    move-result-object v0

    .line 775
    sget-object v1, La/rzx;->a:La/rzx;

    .line 776
    .line 777
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 778
    .line 779
    .line 780
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 781
    .line 782
    goto :goto_11

    .line 783
    :cond_1d
    const-string v0, "actionDialogManager"

    .line 784
    .line 785
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 786
    .line 787
    .line 788
    const/16 v20, 0x0

    .line 789
    .line 790
    throw v20

    .line 791
    :cond_1e
    invoke-static {}, La/t9f;->b()V

    .line 792
    .line 793
    .line 794
    const/4 v7, 0x0

    .line 795
    :goto_11
    return-object v7

    .line 796
    :pswitch_a
    const/16 v19, 0x0

    .line 797
    .line 798
    check-cast v0, La/pjx;

    .line 799
    .line 800
    move-object/from16 v1, p1

    .line 801
    .line 802
    check-cast v1, Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;

    .line 803
    .line 804
    sget-object v2, La/pjx;->h2:La/sqt;

    .line 805
    .line 806
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 807
    .line 808
    .line 809
    invoke-virtual {v0}, La/sik;->D0()Landroid/app/Dialog;

    .line 810
    .line 811
    .line 812
    move-result-object v2

    .line 813
    invoke-virtual {v2}, Landroid/app/Dialog;->dismiss()V

    .line 814
    .line 815
    .line 816
    iget-object v2, v0, La/pjx;->e2:La/phf0;

    .line 817
    .line 818
    sget-object v3, La/pjx;->i2:[La/iiy;

    .line 819
    .line 820
    aget-object v4, v3, v19

    .line 821
    .line 822
    invoke-virtual {v2, v0, v4}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 823
    .line 824
    .line 825
    move-result-object v4

    .line 826
    aget-object v3, v3, v19

    .line 827
    .line 828
    invoke-virtual {v2, v0, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 829
    .line 830
    .line 831
    move-result-object v2

    .line 832
    new-instance v3, Lkotlin/Pair;

    .line 833
    .line 834
    invoke-direct {v3, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 835
    .line 836
    .line 837
    filled-new-array {v3}, [Lkotlin/Pair;

    .line 838
    .line 839
    .line 840
    move-result-object v1

    .line 841
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 842
    .line 843
    .line 844
    move-result-object v1

    .line 845
    invoke-static {v1, v0, v4}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 846
    .line 847
    .line 848
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 849
    .line 850
    return-object v0

    .line 851
    :pswitch_b
    check-cast v0, La/adw;

    .line 852
    .line 853
    move-object/from16 v1, p1

    .line 854
    .line 855
    check-cast v1, La/cp;

    .line 856
    .line 857
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 858
    .line 859
    .line 860
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 861
    .line 862
    check-cast v2, La/uvx;

    .line 863
    .line 864
    iget-object v2, v2, La/uvx;->b:Landroid/widget/TextView;

    .line 865
    .line 866
    new-instance v3, La/okw;

    .line 867
    .line 868
    const/16 v4, 0xc

    .line 869
    .line 870
    invoke-direct {v3, v0, v1, v4}, La/okw;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 871
    .line 872
    .line 873
    invoke-static {v2, v3}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 874
    .line 875
    .line 876
    new-instance v0, La/b1w;

    .line 877
    .line 878
    const/16 v2, 0xa

    .line 879
    .line 880
    invoke-direct {v0, v1, v2}, La/b1w;-><init>(La/cp;B)V

    .line 881
    .line 882
    .line 883
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 884
    .line 885
    .line 886
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 887
    .line 888
    return-object v0

    .line 889
    :pswitch_c
    check-cast v0, La/rix;

    .line 890
    .line 891
    move-object/from16 v1, p1

    .line 892
    .line 893
    check-cast v1, Ljava/lang/Throwable;

    .line 894
    .line 895
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 896
    .line 897
    .line 898
    iget-object v2, v0, La/rix;->d:La/sje;

    .line 899
    .line 900
    sget-object v3, La/qix;->a:La/qix;

    .line 901
    .line 902
    new-instance v6, La/cin;

    .line 903
    .line 904
    const/16 v1, 0x15

    .line 905
    .line 906
    const/4 v4, 0x0

    .line 907
    invoke-direct {v6, v0, v4, v1}, La/cin;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 908
    .line 909
    .line 910
    const/16 v7, 0xe

    .line 911
    .line 912
    const/4 v4, 0x0

    .line 913
    const/4 v5, 0x0

    .line 914
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 915
    .line 916
    .line 917
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 918
    .line 919
    return-object v0

    .line 920
    :pswitch_d
    const/16 v19, 0x0

    .line 921
    .line 922
    check-cast v0, La/yex;

    .line 923
    .line 924
    move-object/from16 v1, p1

    .line 925
    .line 926
    check-cast v1, La/q860;

    .line 927
    .line 928
    iget-object v2, v1, La/q860;->b:La/hge0;

    .line 929
    .line 930
    if-eqz v2, :cond_1f

    .line 931
    .line 932
    invoke-virtual {v2}, La/hge0;->closeConnection()V

    .line 933
    .line 934
    .line 935
    const/4 v4, 0x0

    .line 936
    iput-object v4, v1, La/q860;->b:La/hge0;

    .line 937
    .line 938
    :cond_1f
    iget-object v2, v0, La/yex;->d:La/xz40;

    .line 939
    .line 940
    iget-object v3, v2, La/xz40;->a:[Ljava/lang/Object;

    .line 941
    .line 942
    iget v4, v2, La/xz40;->c:I

    .line 943
    .line 944
    move/from16 v5, v19

    .line 945
    .line 946
    :goto_12
    if-ge v5, v4, :cond_21

    .line 947
    .line 948
    aget-object v6, v3, v5

    .line 949
    .line 950
    check-cast v6, La/g1v0;

    .line 951
    .line 952
    invoke-static {v6, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 953
    .line 954
    .line 955
    move-result v6

    .line 956
    if-eqz v6, :cond_20

    .line 957
    .line 958
    goto :goto_13

    .line 959
    :cond_20
    add-int/lit8 v5, v5, 0x1

    .line 960
    .line 961
    goto :goto_12

    .line 962
    :cond_21
    const/4 v5, -0x1

    .line 963
    :goto_13
    if-ltz v5, :cond_22

    .line 964
    .line 965
    invoke-virtual {v2, v5}, La/xz40;->k(I)Ljava/lang/Object;

    .line 966
    .line 967
    .line 968
    :cond_22
    iget v1, v2, La/xz40;->c:I

    .line 969
    .line 970
    if-nez v1, :cond_23

    .line 971
    .line 972
    iget-object v0, v0, La/yex;->b:La/a13;

    .line 973
    .line 974
    invoke-virtual {v0}, La/a13;->invoke()Ljava/lang/Object;

    .line 975
    .line 976
    .line 977
    :cond_23
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 978
    .line 979
    return-object v0

    .line 980
    :pswitch_e
    const/16 v19, 0x0

    .line 981
    .line 982
    move-object v1, v0

    .line 983
    check-cast v1, La/hcx;

    .line 984
    .line 985
    move-object/from16 v0, p1

    .line 986
    .line 987
    check-cast v0, Ljava/lang/Throwable;

    .line 988
    .line 989
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 990
    .line 991
    .line 992
    iget-object v0, v1, La/hcx;->t:La/c4m0;

    .line 993
    .line 994
    if-eqz v0, :cond_24

    .line 995
    .line 996
    const/4 v4, 0x0

    .line 997
    invoke-virtual {v0, v4}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 998
    .line 999
    .line 1000
    :cond_24
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 1001
    .line 1002
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 1003
    .line 1004
    :goto_14
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v0

    .line 1008
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1009
    .line 1010
    .line 1011
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 1012
    .line 1013
    move-object v4, v0

    .line 1014
    check-cast v4, La/acx;

    .line 1015
    .line 1016
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1017
    .line 1018
    .line 1019
    move/from16 v5, v19

    .line 1020
    .line 1021
    const/16 v3, 0xa

    .line 1022
    .line 1023
    invoke-static {v4, v5, v6, v3}, La/acx;->a(La/acx;ZZI)La/acx;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v4

    .line 1027
    invoke-virtual {v2, v0, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1028
    .line 1029
    .line 1030
    move-result v0

    .line 1031
    if-eqz v0, :cond_25

    .line 1032
    .line 1033
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1034
    .line 1035
    return-object v0

    .line 1036
    :cond_25
    const/16 v19, 0x0

    .line 1037
    .line 1038
    goto :goto_14

    .line 1039
    :pswitch_f
    check-cast v0, La/fcx;

    .line 1040
    .line 1041
    move-object/from16 v1, p1

    .line 1042
    .line 1043
    check-cast v1, La/hcz;

    .line 1044
    .line 1045
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1046
    .line 1047
    .line 1048
    move-object v2, v0

    .line 1049
    check-cast v2, La/bcx;

    .line 1050
    .line 1051
    iget-object v2, v2, La/bcx;->a:La/a4x;

    .line 1052
    .line 1053
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1054
    .line 1055
    .line 1056
    move-result v4

    .line 1057
    new-instance v5, La/ubn;

    .line 1058
    .line 1059
    invoke-direct {v5, v2, v3}, La/ubn;-><init>(La/a4x;B)V

    .line 1060
    .line 1061
    .line 1062
    new-instance v3, La/xe4;

    .line 1063
    .line 1064
    const/16 v7, 0x9

    .line 1065
    .line 1066
    invoke-direct {v3, v2, v0, v7}, La/xe4;-><init>(Ljava/util/List;Ljava/lang/Object;B)V

    .line 1067
    .line 1068
    .line 1069
    new-instance v0, La/ugd;

    .line 1070
    .line 1071
    const v2, 0x799532c4

    .line 1072
    .line 1073
    .line 1074
    invoke-direct {v0, v2, v6, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1075
    .line 1076
    .line 1077
    const/4 v2, 0x0

    .line 1078
    invoke-virtual {v1, v4, v2, v5, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1079
    .line 1080
    .line 1081
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1082
    .line 1083
    return-object v0

    .line 1084
    :pswitch_10
    check-cast v0, La/tax;

    .line 1085
    .line 1086
    move-object/from16 v1, p1

    .line 1087
    .line 1088
    check-cast v1, Ljava/lang/Throwable;

    .line 1089
    .line 1090
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1091
    .line 1092
    .line 1093
    iget-object v0, v0, La/tax;->x:La/ol60;

    .line 1094
    .line 1095
    new-instance v2, La/oax;

    .line 1096
    .line 1097
    const/4 v5, 0x0

    .line 1098
    invoke-direct {v2, v5}, La/oax;-><init>(Z)V

    .line 1099
    .line 1100
    .line 1101
    invoke-virtual {v0, v2}, La/ol60;->f(Ljava/lang/Object;)V

    .line 1102
    .line 1103
    .line 1104
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1105
    .line 1106
    .line 1107
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1108
    .line 1109
    return-object v0

    .line 1110
    :pswitch_11
    check-cast v0, La/v8x;

    .line 1111
    .line 1112
    move-object/from16 v1, p1

    .line 1113
    .line 1114
    check-cast v1, La/cax;

    .line 1115
    .line 1116
    sget-object v2, La/v8x;->U1:La/gst;

    .line 1117
    .line 1118
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1119
    .line 1120
    .line 1121
    invoke-virtual {v0}, La/v8x;->H0()La/tax;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v2

    .line 1125
    iget-object v4, v2, La/tax;->m:La/db9;

    .line 1126
    .line 1127
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v0

    .line 1131
    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v0

    .line 1135
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1136
    .line 1137
    .line 1138
    iget-object v5, v2, La/tax;->b:La/i1w0;

    .line 1139
    .line 1140
    iget-object v7, v2, La/tax;->A:La/bby;

    .line 1141
    .line 1142
    if-eqz v7, :cond_26

    .line 1143
    .line 1144
    invoke-interface {v7}, La/bby;->isActive()Z

    .line 1145
    .line 1146
    .line 1147
    move-result v7

    .line 1148
    if-ne v7, v6, :cond_26

    .line 1149
    .line 1150
    goto/16 :goto_1e

    .line 1151
    .line 1152
    :cond_26
    iget-object v7, v2, La/tax;->z:La/bby;

    .line 1153
    .line 1154
    if-eqz v7, :cond_27

    .line 1155
    .line 1156
    invoke-interface {v7}, La/bby;->isActive()Z

    .line 1157
    .line 1158
    .line 1159
    move-result v7

    .line 1160
    if-ne v7, v6, :cond_27

    .line 1161
    .line 1162
    goto/16 :goto_1e

    .line 1163
    .line 1164
    :cond_27
    iget-boolean v7, v2, La/tax;->C:Z

    .line 1165
    .line 1166
    if-eqz v7, :cond_28

    .line 1167
    .line 1168
    goto/16 :goto_1e

    .line 1169
    .line 1170
    :cond_28
    sget-object v7, La/y9x;->b:La/sqt;

    .line 1171
    .line 1172
    iget v1, v1, La/cax;->a:I

    .line 1173
    .line 1174
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1175
    .line 1176
    .line 1177
    invoke-static {}, La/y9x;->values()[La/y9x;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v7

    .line 1181
    array-length v8, v7

    .line 1182
    const/4 v9, 0x0

    .line 1183
    :goto_15
    if-ge v9, v8, :cond_2a

    .line 1184
    .line 1185
    aget-object v10, v7, v9

    .line 1186
    .line 1187
    iget v11, v10, La/y9x;->a:I

    .line 1188
    .line 1189
    if-ne v11, v1, :cond_29

    .line 1190
    .line 1191
    move-object v7, v10

    .line 1192
    goto :goto_16

    .line 1193
    :cond_29
    add-int/lit8 v9, v9, 0x1

    .line 1194
    .line 1195
    goto :goto_15

    .line 1196
    :cond_2a
    const/4 v7, 0x0

    .line 1197
    :goto_16
    if-nez v7, :cond_2b

    .line 1198
    .line 1199
    sget-object v7, La/y9x;->B:La/y9x;

    .line 1200
    .line 1201
    :cond_2b
    iget-object v1, v2, La/tax;->g:La/u58;

    .line 1202
    .line 1203
    iget-object v8, v2, La/tax;->q:La/gg5;

    .line 1204
    .line 1205
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 1206
    .line 1207
    .line 1208
    move-result v9

    .line 1209
    const-string v10, "point"

    .line 1210
    .line 1211
    const-string v11, "information_call"

    .line 1212
    .line 1213
    if-eq v9, v3, :cond_2e

    .line 1214
    .line 1215
    const/16 v3, 0xa

    .line 1216
    .line 1217
    if-eq v9, v3, :cond_2d

    .line 1218
    .line 1219
    const/16 v3, 0xe

    .line 1220
    .line 1221
    if-eq v9, v3, :cond_2c

    .line 1222
    .line 1223
    packed-switch v9, :pswitch_data_1

    .line 1224
    .line 1225
    .line 1226
    goto/16 :goto_18

    .line 1227
    .line 1228
    :pswitch_12
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1229
    .line 1230
    .line 1231
    const-string v3, "info_partners"

    .line 1232
    .line 1233
    invoke-virtual {v8, v3}, La/gg5;->k(Ljava/lang/String;)V

    .line 1234
    .line 1235
    .line 1236
    iget-object v1, v1, La/u58;->a:La/kt2;

    .line 1237
    .line 1238
    :goto_17
    invoke-static {v10, v3, v1, v11}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 1239
    .line 1240
    .line 1241
    goto :goto_18

    .line 1242
    :pswitch_13
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1243
    .line 1244
    .line 1245
    const-string v3, "info_how_to_bet"

    .line 1246
    .line 1247
    invoke-virtual {v8, v3}, La/gg5;->k(Ljava/lang/String;)V

    .line 1248
    .line 1249
    .line 1250
    iget-object v1, v1, La/u58;->a:La/kt2;

    .line 1251
    .line 1252
    goto :goto_17

    .line 1253
    :pswitch_14
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1254
    .line 1255
    .line 1256
    const-string v3, "info_payments"

    .line 1257
    .line 1258
    invoke-virtual {v8, v3}, La/gg5;->k(Ljava/lang/String;)V

    .line 1259
    .line 1260
    .line 1261
    iget-object v1, v1, La/u58;->a:La/kt2;

    .line 1262
    .line 1263
    goto :goto_17

    .line 1264
    :pswitch_15
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1265
    .line 1266
    .line 1267
    const-string v3, "info_rules"

    .line 1268
    .line 1269
    invoke-virtual {v8, v3}, La/gg5;->k(Ljava/lang/String;)V

    .line 1270
    .line 1271
    .line 1272
    iget-object v1, v1, La/u58;->a:La/kt2;

    .line 1273
    .line 1274
    goto :goto_17

    .line 1275
    :pswitch_16
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1276
    .line 1277
    .line 1278
    const-string v3, "info_contacts"

    .line 1279
    .line 1280
    invoke-virtual {v8, v3}, La/gg5;->k(Ljava/lang/String;)V

    .line 1281
    .line 1282
    .line 1283
    iget-object v1, v1, La/u58;->a:La/kt2;

    .line 1284
    .line 1285
    goto :goto_17

    .line 1286
    :pswitch_17
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1287
    .line 1288
    .line 1289
    const-string v3, "info_social_media"

    .line 1290
    .line 1291
    invoke-virtual {v8, v3}, La/gg5;->k(Ljava/lang/String;)V

    .line 1292
    .line 1293
    .line 1294
    iget-object v1, v1, La/u58;->a:La/kt2;

    .line 1295
    .line 1296
    goto :goto_17

    .line 1297
    :pswitch_18
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1298
    .line 1299
    .line 1300
    const-string v3, "info_about"

    .line 1301
    .line 1302
    invoke-virtual {v8, v3}, La/gg5;->k(Ljava/lang/String;)V

    .line 1303
    .line 1304
    .line 1305
    iget-object v1, v1, La/u58;->a:La/kt2;

    .line 1306
    .line 1307
    goto :goto_17

    .line 1308
    :cond_2c
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1309
    .line 1310
    .line 1311
    const-string v3, "info_stop_list"

    .line 1312
    .line 1313
    invoke-virtual {v8, v3}, La/gg5;->k(Ljava/lang/String;)V

    .line 1314
    .line 1315
    .line 1316
    iget-object v1, v1, La/u58;->a:La/kt2;

    .line 1317
    .line 1318
    goto :goto_17

    .line 1319
    :cond_2d
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1320
    .line 1321
    .line 1322
    const-string v3, "info_responsible_game"

    .line 1323
    .line 1324
    invoke-virtual {v8, v3}, La/gg5;->k(Ljava/lang/String;)V

    .line 1325
    .line 1326
    .line 1327
    iget-object v1, v1, La/u58;->a:La/kt2;

    .line 1328
    .line 1329
    goto :goto_17

    .line 1330
    :cond_2e
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1331
    .line 1332
    .line 1333
    const-string v3, "info_rewards"

    .line 1334
    .line 1335
    invoke-virtual {v8, v3}, La/gg5;->k(Ljava/lang/String;)V

    .line 1336
    .line 1337
    .line 1338
    iget-object v1, v1, La/u58;->a:La/kt2;

    .line 1339
    .line 1340
    goto :goto_17

    .line 1341
    :goto_18
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 1342
    .line 1343
    .line 1344
    move-result v1

    .line 1345
    packed-switch v1, :pswitch_data_2

    .line 1346
    .line 1347
    .line 1348
    :pswitch_19
    goto/16 :goto_1e

    .line 1349
    .line 1350
    :pswitch_1a
    invoke-static {v5, v5}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 1351
    .line 1352
    .line 1353
    move-result-object v0

    .line 1354
    iget-object v1, v2, La/tax;->u:La/kys0;

    .line 1355
    .line 1356
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1357
    .line 1358
    .line 1359
    new-instance v1, Lorg/xplatform/user_agreement_impl/navigation/UserAgreementScreenFactoryStub$getUserAgreementHistoryScreen$1;

    .line 1360
    .line 1361
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1362
    .line 1363
    .line 1364
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1365
    .line 1366
    .line 1367
    iget-object v0, v0, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1368
    .line 1369
    const/4 v1, 0x0

    .line 1370
    invoke-static {v5, v0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v0

    .line 1374
    :goto_19
    move-object v1, v0

    .line 1375
    check-cast v1, La/paw;

    .line 1376
    .line 1377
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 1378
    .line 1379
    .line 1380
    move-result v2

    .line 1381
    if-eqz v2, :cond_31

    .line 1382
    .line 1383
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v1

    .line 1387
    check-cast v1, La/oe50;

    .line 1388
    .line 1389
    invoke-virtual {v5, v1}, La/i1w0;->a(La/oe50;)V

    .line 1390
    .line 1391
    .line 1392
    goto :goto_19

    .line 1393
    :pswitch_1b
    invoke-static {v5, v5}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v0

    .line 1397
    iget-object v1, v2, La/tax;->h:La/lme0;

    .line 1398
    .line 1399
    invoke-static {v1, v0}, La/rz4;->u(La/lme0;La/k0w0;)V

    .line 1400
    .line 1401
    .line 1402
    iget-object v0, v0, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1403
    .line 1404
    const/4 v1, 0x0

    .line 1405
    invoke-static {v5, v0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v0

    .line 1409
    :goto_1a
    move-object v1, v0

    .line 1410
    check-cast v1, La/paw;

    .line 1411
    .line 1412
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 1413
    .line 1414
    .line 1415
    move-result v2

    .line 1416
    if-eqz v2, :cond_31

    .line 1417
    .line 1418
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v1

    .line 1422
    check-cast v1, La/oe50;

    .line 1423
    .line 1424
    invoke-virtual {v5, v1}, La/i1w0;->a(La/oe50;)V

    .line 1425
    .line 1426
    .line 1427
    goto :goto_1a

    .line 1428
    :pswitch_1c
    iget-object v0, v2, La/tax;->p:La/rqt;

    .line 1429
    .line 1430
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1431
    .line 1432
    .line 1433
    new-instance v0, La/okw;

    .line 1434
    .line 1435
    const/16 v1, 0xb

    .line 1436
    .line 1437
    invoke-direct {v0, v2, v7, v1}, La/okw;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1438
    .line 1439
    .line 1440
    invoke-virtual {v5, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 1441
    .line 1442
    .line 1443
    goto/16 :goto_1e

    .line 1444
    .line 1445
    :pswitch_1d
    invoke-virtual {v2, v7, v0}, La/tax;->w(La/y9x;Ljava/io/File;)V

    .line 1446
    .line 1447
    .line 1448
    goto/16 :goto_1e

    .line 1449
    .line 1450
    :pswitch_1e
    iget-object v0, v2, La/tax;->j:La/pru;

    .line 1451
    .line 1452
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 1453
    .line 1454
    .line 1455
    move-result-object v0

    .line 1456
    iget-boolean v0, v0, La/sff0;->A0:Z

    .line 1457
    .line 1458
    if-eqz v0, :cond_30

    .line 1459
    .line 1460
    invoke-static {v5}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v0

    .line 1464
    iget-object v1, v2, La/tax;->r:La/gle0;

    .line 1465
    .line 1466
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1467
    .line 1468
    .line 1469
    new-instance v1, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getContactsFragmentScreen$1;

    .line 1470
    .line 1471
    invoke-direct {v1, v6}, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getContactsFragmentScreen$1;-><init>(Z)V

    .line 1472
    .line 1473
    .line 1474
    instance-of v2, v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 1475
    .line 1476
    if-eqz v2, :cond_2f

    .line 1477
    .line 1478
    new-instance v2, La/e1w0;

    .line 1479
    .line 1480
    check-cast v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 1481
    .line 1482
    invoke-direct {v2, v1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 1483
    .line 1484
    .line 1485
    new-instance v1, La/c8d;

    .line 1486
    .line 1487
    sget-object v3, La/y7d;->a:La/v7d;

    .line 1488
    .line 1489
    invoke-direct {v1, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1490
    .line 1491
    .line 1492
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1493
    .line 1494
    .line 1495
    :goto_1b
    const/4 v1, 0x0

    .line 1496
    goto :goto_1c

    .line 1497
    :cond_2f
    new-instance v2, La/w0w0;

    .line 1498
    .line 1499
    invoke-direct {v2, v1}, La/w0w0;-><init>(La/m7h0;)V

    .line 1500
    .line 1501
    .line 1502
    new-instance v1, La/c8d;

    .line 1503
    .line 1504
    sget-object v3, La/y7d;->a:La/v7d;

    .line 1505
    .line 1506
    invoke-direct {v1, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1507
    .line 1508
    .line 1509
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1510
    .line 1511
    .line 1512
    goto :goto_1b

    .line 1513
    :goto_1c
    invoke-static {v5, v0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 1514
    .line 1515
    .line 1516
    move-result-object v0

    .line 1517
    :goto_1d
    move-object v1, v0

    .line 1518
    check-cast v1, La/paw;

    .line 1519
    .line 1520
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 1521
    .line 1522
    .line 1523
    move-result v2

    .line 1524
    if-eqz v2, :cond_31

    .line 1525
    .line 1526
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 1527
    .line 1528
    .line 1529
    move-result-object v1

    .line 1530
    check-cast v1, La/oe50;

    .line 1531
    .line 1532
    invoke-virtual {v5, v1}, La/i1w0;->a(La/oe50;)V

    .line 1533
    .line 1534
    .line 1535
    goto :goto_1d

    .line 1536
    :cond_30
    iget-object v0, v4, La/db9;->a:La/yk50;

    .line 1537
    .line 1538
    iget-object v0, v0, La/yk50;->b:Ljava/lang/Object;

    .line 1539
    .line 1540
    check-cast v0, La/knf0;

    .line 1541
    .line 1542
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1543
    .line 1544
    .line 1545
    invoke-virtual {v7}, La/y9x;->a()Ljava/lang/String;

    .line 1546
    .line 1547
    .line 1548
    move-result-object v0

    .line 1549
    new-instance v1, La/kax;

    .line 1550
    .line 1551
    invoke-direct {v1, v2, v0, v7}, La/kax;-><init>(La/tax;Ljava/lang/String;La/y9x;)V

    .line 1552
    .line 1553
    .line 1554
    invoke-virtual {v5, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 1555
    .line 1556
    .line 1557
    goto :goto_1e

    .line 1558
    :pswitch_1f
    iget-object v0, v4, La/db9;->a:La/yk50;

    .line 1559
    .line 1560
    iget-object v0, v0, La/yk50;->b:Ljava/lang/Object;

    .line 1561
    .line 1562
    check-cast v0, La/knf0;

    .line 1563
    .line 1564
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1565
    .line 1566
    .line 1567
    invoke-virtual {v7}, La/y9x;->a()Ljava/lang/String;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v0

    .line 1571
    new-instance v1, La/kax;

    .line 1572
    .line 1573
    invoke-direct {v1, v2, v0, v7}, La/kax;-><init>(La/tax;Ljava/lang/String;La/y9x;)V

    .line 1574
    .line 1575
    .line 1576
    invoke-virtual {v5, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 1577
    .line 1578
    .line 1579
    :cond_31
    :goto_1e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1580
    .line 1581
    return-object v0

    .line 1582
    :pswitch_20
    check-cast v0, La/wqv;

    .line 1583
    .line 1584
    move-object/from16 v1, p1

    .line 1585
    .line 1586
    check-cast v1, Landroid/view/View;

    .line 1587
    .line 1588
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1589
    .line 1590
    .line 1591
    invoke-virtual {v0}, La/wqv;->invoke()Ljava/lang/Object;

    .line 1592
    .line 1593
    .line 1594
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1595
    .line 1596
    return-object v0

    .line 1597
    :pswitch_21
    check-cast v0, La/kie0;

    .line 1598
    .line 1599
    move-object/from16 v1, p1

    .line 1600
    .line 1601
    check-cast v1, La/lls0;

    .line 1602
    .line 1603
    iget v2, v0, La/kie0;->a:I

    .line 1604
    .line 1605
    add-int/lit8 v3, v2, 0x1

    .line 1606
    .line 1607
    iput v3, v0, La/kie0;->a:I

    .line 1608
    .line 1609
    invoke-virtual {v1}, La/lls0;->a()Ljava/lang/String;

    .line 1610
    .line 1611
    .line 1612
    move-result-object v0

    .line 1613
    const-string v1, ":"

    .line 1614
    .line 1615
    invoke-static {v2, v1, v0}, La/dw9;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1616
    .line 1617
    .line 1618
    move-result-object v0

    .line 1619
    return-object v0

    .line 1620
    :pswitch_22
    check-cast v0, La/dyw;

    .line 1621
    .line 1622
    move-object/from16 v1, p1

    .line 1623
    .line 1624
    check-cast v1, La/o1x;

    .line 1625
    .line 1626
    return-object v0

    .line 1627
    :pswitch_23
    check-cast v0, La/dfv;

    .line 1628
    .line 1629
    move-object/from16 v1, p1

    .line 1630
    .line 1631
    check-cast v1, La/g7z;

    .line 1632
    .line 1633
    invoke-static {v1, v0}, La/agc;->I(La/fhl;La/dfv;)V

    .line 1634
    .line 1635
    .line 1636
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1637
    .line 1638
    return-object v0

    .line 1639
    :pswitch_24
    check-cast v0, La/n4d;

    .line 1640
    .line 1641
    move-object/from16 v4, p1

    .line 1642
    .line 1643
    check-cast v4, La/pi9;

    .line 1644
    .line 1645
    iget-object v1, v4, La/pi9;->d:La/vb8;

    .line 1646
    .line 1647
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1648
    .line 1649
    .line 1650
    invoke-virtual {v1}, La/vb8;->invoke()Ljava/lang/Object;

    .line 1651
    .line 1652
    .line 1653
    move-result-object v1

    .line 1654
    check-cast v1, La/afv;

    .line 1655
    .line 1656
    invoke-interface {v1}, La/afv;->b()La/dfv;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v9

    .line 1660
    new-instance v2, La/h7w;

    .line 1661
    .line 1662
    const/16 v1, 0x10

    .line 1663
    .line 1664
    invoke-direct {v2, v1}, La/h7w;-><init>(B)V

    .line 1665
    .line 1666
    .line 1667
    iget-object v1, v4, La/pi9;->a:La/y99;

    .line 1668
    .line 1669
    invoke-interface {v1}, La/y99;->getLayoutDirection()La/k6z;

    .line 1670
    .line 1671
    .line 1672
    move-result-object v5

    .line 1673
    iget-object v1, v4, La/pi9;->a:La/y99;

    .line 1674
    .line 1675
    invoke-interface {v1}, La/y99;->d()J

    .line 1676
    .line 1677
    .line 1678
    move-result-wide v6

    .line 1679
    invoke-static {v6, v7}, La/n2x;->N(J)J

    .line 1680
    .line 1681
    .line 1682
    move-result-wide v10

    .line 1683
    iget-object v3, v4, La/pi9;->c:La/g7z;

    .line 1684
    .line 1685
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1686
    .line 1687
    .line 1688
    iget-object v1, v3, La/g7z;->a:La/a6a;

    .line 1689
    .line 1690
    iget-object v1, v1, La/a6a;->b:La/nr;

    .line 1691
    .line 1692
    invoke-virtual {v1}, La/nr;->j()La/w6k;

    .line 1693
    .line 1694
    .line 1695
    move-result-object v6

    .line 1696
    invoke-virtual {v1}, La/nr;->o()La/k6z;

    .line 1697
    .line 1698
    .line 1699
    move-result-object v7

    .line 1700
    new-instance v1, La/bg0;

    .line 1701
    .line 1702
    const/4 v8, 0x3

    .line 1703
    invoke-direct/range {v1 .. v8}, La/bg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1704
    .line 1705
    .line 1706
    iget-object v2, v3, La/g7z;->b:La/ehl;

    .line 1707
    .line 1708
    invoke-virtual {v3}, La/g7z;->getLayoutDirection()La/k6z;

    .line 1709
    .line 1710
    .line 1711
    move-result-object v7

    .line 1712
    move-object v5, v9

    .line 1713
    move-wide v8, v10

    .line 1714
    new-instance v10, La/k9v;

    .line 1715
    .line 1716
    const/16 v6, 0xa

    .line 1717
    .line 1718
    invoke-direct {v10, v3, v2, v1, v6}, La/k9v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1719
    .line 1720
    .line 1721
    move-object v6, v3

    .line 1722
    invoke-virtual/range {v5 .. v10}, La/dfv;->f(La/w6k;La/k6z;JLkotlin/jvm/functions/Function1;)V

    .line 1723
    .line 1724
    .line 1725
    if-eqz v0, :cond_32

    .line 1726
    .line 1727
    invoke-interface {v0}, La/n4d;->a()J

    .line 1728
    .line 1729
    .line 1730
    move-result-wide v0

    .line 1731
    new-instance v2, La/m78;

    .line 1732
    .line 1733
    const/4 v3, 0x5

    .line 1734
    invoke-direct {v2, v0, v1, v3}, La/m78;-><init>(JI)V

    .line 1735
    .line 1736
    .line 1737
    iget-object v0, v5, La/dfv;->a:La/ffv;

    .line 1738
    .line 1739
    invoke-interface {v0}, La/ffv;->m()La/a4d;

    .line 1740
    .line 1741
    .line 1742
    move-result-object v1

    .line 1743
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1744
    .line 1745
    .line 1746
    move-result v1

    .line 1747
    if-nez v1, :cond_32

    .line 1748
    .line 1749
    invoke-interface {v0, v2}, La/ffv;->A(La/a4d;)V

    .line 1750
    .line 1751
    .line 1752
    :cond_32
    new-instance v0, La/adw;

    .line 1753
    .line 1754
    const/4 v1, 0x7

    .line 1755
    invoke-direct {v0, v5, v1}, La/adw;-><init>(Ljava/lang/Object;B)V

    .line 1756
    .line 1757
    .line 1758
    invoke-virtual {v4, v0}, La/pi9;->b(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 1759
    .line 1760
    .line 1761
    move-result-object v0

    .line 1762
    return-object v0

    .line 1763
    :pswitch_25
    check-cast v0, La/osw;

    .line 1764
    .line 1765
    move-object/from16 v1, p1

    .line 1766
    .line 1767
    check-cast v1, La/hcz;

    .line 1768
    .line 1769
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1770
    .line 1771
    .line 1772
    iget-object v0, v0, La/osw;->c:La/a4x;

    .line 1773
    .line 1774
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1775
    .line 1776
    .line 1777
    move-result v3

    .line 1778
    new-instance v4, La/far;

    .line 1779
    .line 1780
    const/16 v5, 0x17

    .line 1781
    .line 1782
    invoke-direct {v4, v0, v5}, La/far;-><init>(Ljava/util/List;B)V

    .line 1783
    .line 1784
    .line 1785
    new-instance v5, La/xy1;

    .line 1786
    .line 1787
    const/16 v7, 0x13

    .line 1788
    .line 1789
    invoke-direct {v5, v0, v7}, La/xy1;-><init>(Ljava/util/List;B)V

    .line 1790
    .line 1791
    .line 1792
    new-instance v0, La/ugd;

    .line 1793
    .line 1794
    invoke-direct {v0, v2, v6, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1795
    .line 1796
    .line 1797
    const/4 v2, 0x0

    .line 1798
    invoke-virtual {v1, v3, v2, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1799
    .line 1800
    .line 1801
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1802
    .line 1803
    return-object v0

    .line 1804
    :pswitch_26
    check-cast v0, La/nsw;

    .line 1805
    .line 1806
    move-object/from16 v1, p1

    .line 1807
    .line 1808
    check-cast v1, La/hcz;

    .line 1809
    .line 1810
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1811
    .line 1812
    .line 1813
    iget-object v0, v0, La/nsw;->c:La/a4x;

    .line 1814
    .line 1815
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1816
    .line 1817
    .line 1818
    move-result v3

    .line 1819
    new-instance v4, La/far;

    .line 1820
    .line 1821
    const/16 v5, 0x16

    .line 1822
    .line 1823
    invoke-direct {v4, v0, v5}, La/far;-><init>(Ljava/util/List;B)V

    .line 1824
    .line 1825
    .line 1826
    new-instance v5, La/xy1;

    .line 1827
    .line 1828
    const/16 v7, 0x12

    .line 1829
    .line 1830
    invoke-direct {v5, v0, v7}, La/xy1;-><init>(Ljava/util/List;B)V

    .line 1831
    .line 1832
    .line 1833
    new-instance v0, La/ugd;

    .line 1834
    .line 1835
    invoke-direct {v0, v2, v6, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1836
    .line 1837
    .line 1838
    const/4 v2, 0x0

    .line 1839
    invoke-virtual {v1, v3, v2, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1840
    .line 1841
    .line 1842
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1843
    .line 1844
    return-object v0

    .line 1845
    :pswitch_27
    check-cast v0, La/qqw;

    .line 1846
    .line 1847
    move-object/from16 v1, p1

    .line 1848
    .line 1849
    check-cast v1, La/k0w0;

    .line 1850
    .line 1851
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1852
    .line 1853
    .line 1854
    new-instance v2, Lorg/xplatform/statistic/horses_race_runners/presentation/actual/HorseRunnersScreen;

    .line 1855
    .line 1856
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 1857
    .line 1858
    .line 1859
    move-result-object v3

    .line 1860
    check-cast v3, La/dqw;

    .line 1861
    .line 1862
    iget-object v3, v3, La/dqw;->d:Ljava/lang/String;

    .line 1863
    .line 1864
    iget-wide v4, v0, La/qqw;->p:J

    .line 1865
    .line 1866
    invoke-direct {v2, v3, v4, v5}, Lorg/xplatform/statistic/horses_race_runners/presentation/actual/HorseRunnersScreen;-><init>(Ljava/lang/String;J)V

    .line 1867
    .line 1868
    .line 1869
    invoke-virtual {v1, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1870
    .line 1871
    .line 1872
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1873
    .line 1874
    return-object v0

    .line 1875
    :pswitch_28
    const/4 v2, 0x0

    .line 1876
    check-cast v0, La/qow;

    .line 1877
    .line 1878
    move-object/from16 v1, p1

    .line 1879
    .line 1880
    check-cast v1, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 1881
    .line 1882
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1883
    .line 1884
    .line 1885
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getAdapter()La/k5;

    .line 1886
    .line 1887
    .line 1888
    move-result-object v1

    .line 1889
    instance-of v3, v1, La/pow;

    .line 1890
    .line 1891
    if-eqz v3, :cond_33

    .line 1892
    .line 1893
    move-object v7, v1

    .line 1894
    check-cast v7, La/pow;

    .line 1895
    .line 1896
    goto :goto_1f

    .line 1897
    :cond_33
    move-object v7, v2

    .line 1898
    :goto_1f
    if-eqz v7, :cond_34

    .line 1899
    .line 1900
    iget-object v1, v0, La/qow;->d:La/a4x;

    .line 1901
    .line 1902
    iget-object v2, v0, La/qow;->c:La/a4x;

    .line 1903
    .line 1904
    iget-object v3, v0, La/qow;->b:La/a4x;

    .line 1905
    .line 1906
    iget-object v0, v0, La/qow;->a:La/aow;

    .line 1907
    .line 1908
    invoke-virtual {v7, v1, v2, v3, v0}, La/k5;->q(Ljava/util/List;Ljava/util/List;Ljava/util/List;La/y8b;)V

    .line 1909
    .line 1910
    .line 1911
    :cond_34
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1912
    .line 1913
    return-object v0

    .line 1914
    :pswitch_29
    check-cast v0, La/oiw;

    .line 1915
    .line 1916
    move-object/from16 v1, p1

    .line 1917
    .line 1918
    check-cast v1, La/uid;

    .line 1919
    .line 1920
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1921
    .line 1922
    .line 1923
    iget-object v0, v0, La/oiw;->N1:La/a8z;

    .line 1924
    .line 1925
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1926
    .line 1927
    .line 1928
    move-result-object v0

    .line 1929
    check-cast v0, La/k3t0;

    .line 1930
    .line 1931
    new-instance v2, La/bhw;

    .line 1932
    .line 1933
    invoke-direct {v2, v1}, La/bhw;-><init>(La/uid;)V

    .line 1934
    .line 1935
    .line 1936
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1937
    .line 1938
    .line 1939
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1940
    .line 1941
    return-object v0

    .line 1942
    :pswitch_2a
    check-cast v0, La/cdw;

    .line 1943
    .line 1944
    move-object/from16 v1, p1

    .line 1945
    .line 1946
    check-cast v1, La/tcw;

    .line 1947
    .line 1948
    sget-object v2, La/cdw;->R1:La/rqt;

    .line 1949
    .line 1950
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1951
    .line 1952
    .line 1953
    invoke-virtual {v0}, La/cdw;->G0()La/k3t0;

    .line 1954
    .line 1955
    .line 1956
    move-result-object v0

    .line 1957
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1958
    .line 1959
    .line 1960
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1961
    .line 1962
    return-object v0

    .line 1963
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
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

    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
    .end packed-switch

    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_1f
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_1d
        :pswitch_1b
        :pswitch_1d
        :pswitch_1d
        :pswitch_1d
        :pswitch_1d
        :pswitch_19
        :pswitch_19
        :pswitch_1d
        :pswitch_1d
        :pswitch_1d
        :pswitch_1d
        :pswitch_1d
        :pswitch_1d
        :pswitch_1d
        :pswitch_1d
        :pswitch_1a
    .end packed-switch
.end method
