.class public final synthetic La/ll8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ml8;


# direct methods
.method public synthetic constructor <init>(La/ml8;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ll8;->a:B

    iput-object p1, p0, La/ll8;->b:La/ml8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ll8;->a:B

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v0, v0, La/ll8;->b:La/ml8;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, La/ml8;->a:La/ctf0;

    .line 15
    .line 16
    move-object/from16 v5, p1

    .line 17
    .line 18
    check-cast v5, La/vaj;

    .line 19
    .line 20
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-boolean v6, v5, La/vaj;->a:Z

    .line 24
    .line 25
    iget-object v7, v5, La/vaj;->b:Ljava/util/List;

    .line 26
    .line 27
    iget-object v8, v5, La/vaj;->d:La/w3t;

    .line 28
    .line 29
    if-eqz v6, :cond_1

    .line 30
    .line 31
    new-instance v0, Ljava/util/ArrayList;

    .line 32
    .line 33
    const/4 v1, 0x6

    .line 34
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 35
    .line 36
    .line 37
    :goto_0
    if-ge v4, v1, :cond_8

    .line 38
    .line 39
    instance-of v2, v8, La/u3t;

    .line 40
    .line 41
    if-eqz v2, :cond_0

    .line 42
    .line 43
    new-instance v2, La/fh8;

    .line 44
    .line 45
    sget-object v3, La/kan;->a:La/kan;

    .line 46
    .line 47
    sget-object v5, La/csr;->e:La/csr;

    .line 48
    .line 49
    invoke-direct {v2, v3, v5}, La/fh8;-><init>(La/lan;La/csr;)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_0
    new-instance v2, La/gh8;

    .line 54
    .line 55
    sget-object v3, La/han;->a:La/han;

    .line 56
    .line 57
    sget-object v5, La/csr;->e:La/csr;

    .line 58
    .line 59
    invoke-direct {v2, v3, v5}, La/gh8;-><init>(La/ian;La/csr;)V

    .line 60
    .line 61
    .line 62
    :goto_1
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    add-int/lit8 v4, v4, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    if-eqz v6, :cond_7

    .line 73
    .line 74
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    instance-of v7, v8, La/u3t;

    .line 79
    .line 80
    if-nez v7, :cond_3

    .line 81
    .line 82
    iget-boolean v7, v5, La/vaj;->e:Z

    .line 83
    .line 84
    if-eqz v7, :cond_2

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_2
    move v3, v4

    .line 88
    :cond_3
    :goto_2
    new-instance v4, La/dh8;

    .line 89
    .line 90
    iget-object v9, v0, La/ml8;->b:La/ocl;

    .line 91
    .line 92
    sget-object v10, La/pb10;->h:La/pb10;

    .line 93
    .line 94
    if-eqz v3, :cond_4

    .line 95
    .line 96
    const v0, 0x7f130e99

    .line 97
    .line 98
    .line 99
    :goto_3
    move v13, v0

    .line 100
    goto :goto_4

    .line 101
    :cond_4
    const v0, 0x7f130e98

    .line 102
    .line 103
    .line 104
    goto :goto_3

    .line 105
    :goto_4
    if-eqz v3, :cond_5

    .line 106
    .line 107
    const v0, 0x7f1302db

    .line 108
    .line 109
    .line 110
    :goto_5
    move v14, v0

    .line 111
    goto :goto_6

    .line 112
    :cond_5
    const v0, 0x7f1302df

    .line 113
    .line 114
    .line 115
    goto :goto_5

    .line 116
    :goto_6
    const-wide/16 v18, 0x0

    .line 117
    .line 118
    const/16 v20, 0x3ce

    .line 119
    .line 120
    const/4 v11, 0x0

    .line 121
    const/4 v12, 0x0

    .line 122
    const/4 v15, 0x0

    .line 123
    const-wide/16 v16, 0x0

    .line 124
    .line 125
    invoke-static/range {v9 .. v20}, La/ocl;->b(La/ocl;La/pb10;La/pdm;IIIIJJI)La/mdm;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-direct {v4, v0}, La/dh8;-><init>(La/mdm;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v6, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    iget-object v0, v5, La/vaj;->c:Ljava/util/List;

    .line 136
    .line 137
    new-instance v3, Ljava/util/ArrayList;

    .line 138
    .line 139
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 144
    .line 145
    .line 146
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    if-eqz v2, :cond_6

    .line 155
    .line 156
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    check-cast v2, La/qf8;

    .line 161
    .line 162
    invoke-static {v2, v8, v1}, La/ntr;->u0(La/uf8;La/w3t;La/ctf0;)La/jh8;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    goto :goto_7

    .line 170
    :cond_6
    invoke-virtual {v6, v3}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 171
    .line 172
    .line 173
    invoke-static {v6}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    goto :goto_9

    .line 178
    :cond_7
    new-instance v0, Ljava/util/ArrayList;

    .line 179
    .line 180
    invoke-static {v7, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 185
    .line 186
    .line 187
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    if-eqz v3, :cond_8

    .line 196
    .line 197
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    check-cast v3, La/tf8;

    .line 202
    .line 203
    invoke-static {v3, v8, v1}, La/ntr;->u0(La/uf8;La/w3t;La/ctf0;)La/jh8;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    goto :goto_8

    .line 211
    :cond_8
    :goto_9
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    return-object v0

    .line 216
    :pswitch_0
    iget-object v0, v0, La/ml8;->a:La/ctf0;

    .line 217
    .line 218
    move-object/from16 v1, p1

    .line 219
    .line 220
    check-cast v1, La/mcc;

    .line 221
    .line 222
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    iget-boolean v5, v1, La/mcc;->a:Z

    .line 226
    .line 227
    const/4 v6, 0x0

    .line 228
    if-eqz v5, :cond_9

    .line 229
    .line 230
    new-instance v1, La/gyl;

    .line 231
    .line 232
    sget-object v2, La/qmk;->a:La/zcl;

    .line 233
    .line 234
    invoke-virtual {v0}, La/ctf0;->j()Z

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    invoke-static {v0}, La/xfn;->b(Z)La/wfn;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    iget v0, v0, La/wfn;->e:F

    .line 243
    .line 244
    new-instance v2, La/lh80;

    .line 245
    .line 246
    const/high16 v4, 0x41000000    # 8.0f

    .line 247
    .line 248
    invoke-direct {v2, v0, v4, v0, v4}, La/lh80;-><init>(FFFF)V

    .line 249
    .line 250
    .line 251
    invoke-direct {v1, v6, v2, v3}, La/gyl;-><init>(La/syl;La/lh80;I)V

    .line 252
    .line 253
    .line 254
    move-object v6, v1

    .line 255
    goto/16 :goto_f

    .line 256
    .line 257
    :cond_9
    invoke-virtual {v0}, La/ctf0;->j()Z

    .line 258
    .line 259
    .line 260
    move-result v5

    .line 261
    invoke-static {v5}, La/xfn;->b(Z)La/wfn;

    .line 262
    .line 263
    .line 264
    move-result-object v5

    .line 265
    iget v5, v5, La/wfn;->e:F

    .line 266
    .line 267
    const/4 v7, 0x0

    .line 268
    const/4 v8, 0x2

    .line 269
    invoke-static {v5, v7, v8}, La/s5x0;->t(FFI)La/lh80;

    .line 270
    .line 271
    .line 272
    move-result-object v13

    .line 273
    iget-object v5, v1, La/mcc;->b:Ljava/util/List;

    .line 274
    .line 275
    new-instance v7, Ljava/util/ArrayList;

    .line 276
    .line 277
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 278
    .line 279
    .line 280
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 281
    .line 282
    .line 283
    move-result-object v5

    .line 284
    :goto_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 285
    .line 286
    .line 287
    move-result v9

    .line 288
    if-eqz v9, :cond_b

    .line 289
    .line 290
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v9

    .line 294
    move-object v10, v9

    .line 295
    check-cast v10, La/je8;

    .line 296
    .line 297
    sget-object v11, La/je8;->g:La/je8;

    .line 298
    .line 299
    if-ne v10, v11, :cond_a

    .line 300
    .line 301
    iget-boolean v10, v1, La/mcc;->d:Z

    .line 302
    .line 303
    if-nez v10, :cond_a

    .line 304
    .line 305
    goto :goto_a

    .line 306
    :cond_a
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    goto :goto_a

    .line 310
    :cond_b
    new-instance v5, Ljava/util/ArrayList;

    .line 311
    .line 312
    invoke-static {v7, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 313
    .line 314
    .line 315
    move-result v2

    .line 316
    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    move v7, v4

    .line 324
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 325
    .line 326
    .line 327
    move-result v9

    .line 328
    if-eqz v9, :cond_13

    .line 329
    .line 330
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v9

    .line 334
    add-int/lit8 v10, v7, 0x1

    .line 335
    .line 336
    if-ltz v7, :cond_12

    .line 337
    .line 338
    check-cast v9, La/je8;

    .line 339
    .line 340
    new-instance v14, La/lxl;

    .line 341
    .line 342
    int-to-long v11, v7

    .line 343
    new-instance v7, La/xxl;

    .line 344
    .line 345
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 346
    .line 347
    .line 348
    move-result v15

    .line 349
    if-eqz v15, :cond_10

    .line 350
    .line 351
    move/from16 v22, v3

    .line 352
    .line 353
    if-eq v15, v3, :cond_f

    .line 354
    .line 355
    if-eq v15, v8, :cond_e

    .line 356
    .line 357
    const/4 v3, 0x3

    .line 358
    if-eq v15, v3, :cond_d

    .line 359
    .line 360
    const/4 v3, 0x4

    .line 361
    if-ne v15, v3, :cond_c

    .line 362
    .line 363
    const v3, 0x7f131032

    .line 364
    .line 365
    .line 366
    goto :goto_c

    .line 367
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 368
    .line 369
    .line 370
    goto :goto_f

    .line 371
    :cond_d
    const v3, 0x7f13102f

    .line 372
    .line 373
    .line 374
    goto :goto_c

    .line 375
    :cond_e
    const v3, 0x7f131031

    .line 376
    .line 377
    .line 378
    goto :goto_c

    .line 379
    :cond_f
    const v3, 0x7f131030

    .line 380
    .line 381
    .line 382
    goto :goto_c

    .line 383
    :cond_10
    move/from16 v22, v3

    .line 384
    .line 385
    const v3, 0x7f1308af

    .line 386
    .line 387
    .line 388
    :goto_c
    new-array v15, v4, [Ljava/lang/Object;

    .line 389
    .line 390
    move-object/from16 p0, v6

    .line 391
    .line 392
    iget-object v6, v0, La/ctf0;->b:La/lsm0;

    .line 393
    .line 394
    invoke-static {v15, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v15

    .line 398
    invoke-virtual {v6, v3, v15}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v3

    .line 402
    invoke-direct {v7, v3}, La/xxl;-><init>(Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    iget-object v3, v1, La/mcc;->c:La/je8;

    .line 406
    .line 407
    if-ne v9, v3, :cond_11

    .line 408
    .line 409
    sget-object v3, La/uxl;->b:La/uxl;

    .line 410
    .line 411
    :goto_d
    move-object/from16 v19, v3

    .line 412
    .line 413
    goto :goto_e

    .line 414
    :cond_11
    sget-object v3, La/uxl;->a:La/uxl;

    .line 415
    .line 416
    goto :goto_d

    .line 417
    :goto_e
    const/16 v20, 0x0

    .line 418
    .line 419
    const/16 v21, 0x68

    .line 420
    .line 421
    const/16 v18, 0x0

    .line 422
    .line 423
    move-object/from16 v17, v7

    .line 424
    .line 425
    move-wide v15, v11

    .line 426
    invoke-direct/range {v14 .. v21}, La/lxl;-><init>(JLa/dyl;ZLa/uxl;La/cwl;I)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    move-object/from16 v6, p0

    .line 433
    .line 434
    move v7, v10

    .line 435
    move/from16 v3, v22

    .line 436
    .line 437
    goto :goto_b

    .line 438
    :cond_12
    move-object/from16 p0, v6

    .line 439
    .line 440
    invoke-static {}, La/q3d;->p()V

    .line 441
    .line 442
    .line 443
    throw p0

    .line 444
    :cond_13
    invoke-static {v5}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 445
    .line 446
    .line 447
    move-result-object v10

    .line 448
    new-instance v9, La/fyl;

    .line 449
    .line 450
    const/4 v14, 0x0

    .line 451
    const/16 v15, 0x16

    .line 452
    .line 453
    const/4 v11, 0x0

    .line 454
    const/4 v12, 0x0

    .line 455
    invoke-direct/range {v9 .. v15}, La/fyl;-><init>(La/a4x;La/tyl;La/syl;La/hh80;La/jyl;I)V

    .line 456
    .line 457
    .line 458
    move-object v6, v9

    .line 459
    :goto_f
    return-object v6

    .line 460
    :pswitch_1
    move-object/from16 v1, p1

    .line 461
    .line 462
    check-cast v1, La/rl5;

    .line 463
    .line 464
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 465
    .line 466
    .line 467
    iget-object v2, v1, La/rl5;->a:La/ql5;

    .line 468
    .line 469
    iget-wide v5, v2, La/ql5;->b:D

    .line 470
    .line 471
    sget-object v3, La/pn40;->a:La/pn40;

    .line 472
    .line 473
    sget-object v3, La/p3u0;->c:La/p3u0;

    .line 474
    .line 475
    invoke-static {v5, v6, v3}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v3

    .line 479
    iget-object v5, v2, La/ql5;->f:Ljava/lang/String;

    .line 480
    .line 481
    iget-object v6, v2, La/ql5;->j:Ljava/lang/String;

    .line 482
    .line 483
    iget-object v0, v0, La/ml8;->a:La/ctf0;

    .line 484
    .line 485
    new-array v7, v4, [Ljava/lang/Object;

    .line 486
    .line 487
    iget-object v8, v0, La/ctf0;->b:La/lsm0;

    .line 488
    .line 489
    invoke-static {v7, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v7

    .line 493
    const v9, 0x7f1315e0

    .line 494
    .line 495
    .line 496
    invoke-virtual {v8, v9, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v7

    .line 500
    iget-object v1, v1, La/rl5;->b:La/kg;

    .line 501
    .line 502
    sget-object v8, La/kg;->c:La/kg;

    .line 503
    .line 504
    if-ne v1, v8, :cond_14

    .line 505
    .line 506
    new-array v1, v4, [Ljava/lang/Object;

    .line 507
    .line 508
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 509
    .line 510
    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v1

    .line 514
    const v2, 0x7f1300e5

    .line 515
    .line 516
    .line 517
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object v6

    .line 521
    goto :goto_10

    .line 522
    :cond_14
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 523
    .line 524
    .line 525
    move-result v0

    .line 526
    if-lez v0, :cond_15

    .line 527
    .line 528
    goto :goto_10

    .line 529
    :cond_15
    iget-object v6, v2, La/ql5;->k:Ljava/lang/String;

    .line 530
    .line 531
    :goto_10
    new-instance v0, La/jjl;

    .line 532
    .line 533
    invoke-direct {v0, v3, v5, v7, v6}, La/jjl;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 534
    .line 535
    .line 536
    return-object v0

    .line 537
    :pswitch_2
    move/from16 v22, v3

    .line 538
    .line 539
    move-object/from16 v1, p1

    .line 540
    .line 541
    check-cast v1, La/lwq0;

    .line 542
    .line 543
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 544
    .line 545
    .line 546
    new-instance v5, La/imm;

    .line 547
    .line 548
    new-instance v6, La/ilm;

    .line 549
    .line 550
    sget-object v2, La/s6t0;->a:La/pz40;

    .line 551
    .line 552
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 553
    .line 554
    .line 555
    move-result-object v2

    .line 556
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 557
    .line 558
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 559
    .line 560
    .line 561
    move-result-wide v2

    .line 562
    invoke-direct {v6, v2, v3}, La/ilm;-><init>(J)V

    .line 563
    .line 564
    .line 565
    new-instance v7, La/plm;

    .line 566
    .line 567
    iget-object v0, v0, La/ml8;->a:La/ctf0;

    .line 568
    .line 569
    new-array v2, v4, [Ljava/lang/Object;

    .line 570
    .line 571
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 572
    .line 573
    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v2

    .line 577
    const v3, 0x7f1302e0

    .line 578
    .line 579
    .line 580
    invoke-virtual {v0, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 581
    .line 582
    .line 583
    move-result-object v0

    .line 584
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 585
    .line 586
    .line 587
    move-result-object v2

    .line 588
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 589
    .line 590
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 591
    .line 592
    .line 593
    move-result-wide v2

    .line 594
    sget-object v4, La/fa50;->a:La/fa50;

    .line 595
    .line 596
    invoke-direct {v7, v0, v2, v3, v4}, La/plm;-><init>(Ljava/lang/String;JLa/ga50;)V

    .line 597
    .line 598
    .line 599
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 600
    .line 601
    .line 602
    move-result-object v0

    .line 603
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 604
    .line 605
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 606
    .line 607
    .line 608
    move-result-wide v9

    .line 609
    iget-object v0, v1, La/lwq0;->a:La/w3t;

    .line 610
    .line 611
    instance-of v0, v0, La/u3t;

    .line 612
    .line 613
    xor-int/lit8 v11, v0, 0x1

    .line 614
    .line 615
    const/4 v12, 0x0

    .line 616
    sget-object v8, La/fmm;->a:La/fmm;

    .line 617
    .line 618
    invoke-direct/range {v5 .. v12}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 619
    .line 620
    .line 621
    return-object v5

    .line 622
    nop

    .line 623
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
