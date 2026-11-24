.class public final La/umh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:F

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;FLkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 14
    iput-byte p4, p0, La/umh;->a:B

    iput-object p1, p0, La/umh;->b:Ljava/util/List;

    iput p2, p0, La/umh;->c:F

    iput-object p3, p0, La/umh;->d:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;F)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    iput-byte v0, p0, La/umh;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/umh;->b:Ljava/util/List;

    .line 8
    .line 9
    iput-object p2, p0, La/umh;->d:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    iput p3, p0, La/umh;->c:F

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/umh;->a:B

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget v4, v0, La/umh;->c:F

    .line 9
    .line 10
    sget-object v5, La/jm40;->b:La/jm40;

    .line 11
    .line 12
    sget-object v6, La/ukd;->a:La/cl5;

    .line 13
    .line 14
    iget-object v7, v0, La/umh;->d:Lkotlin/jvm/functions/Function1;

    .line 15
    .line 16
    iget-object v8, v0, La/umh;->b:Ljava/util/List;

    .line 17
    .line 18
    const/16 v9, 0x92

    .line 19
    .line 20
    const/16 v11, 0x20

    .line 21
    .line 22
    const/4 v12, 0x2

    .line 23
    const/4 v13, 0x4

    .line 24
    const/4 v14, 0x1

    .line 25
    const/4 v15, 0x0

    .line 26
    packed-switch v1, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    move-object/from16 v1, p1

    .line 30
    .line 31
    check-cast v1, La/g9z;

    .line 32
    .line 33
    move-object/from16 v2, p2

    .line 34
    .line 35
    check-cast v2, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    move-object/from16 v3, p3

    .line 42
    .line 43
    check-cast v3, La/fet;

    .line 44
    .line 45
    move-object/from16 v4, p4

    .line 46
    .line 47
    check-cast v4, Ljava/lang/Number;

    .line 48
    .line 49
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    and-int/lit8 v16, v4, 0x6

    .line 57
    .line 58
    if-nez v16, :cond_1

    .line 59
    .line 60
    invoke-virtual {v3, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_0

    .line 65
    .line 66
    move v12, v13

    .line 67
    :cond_0
    or-int v1, v4, v12

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    move v1, v4

    .line 71
    :goto_0
    and-int/lit8 v4, v4, 0x30

    .line 72
    .line 73
    if-nez v4, :cond_3

    .line 74
    .line 75
    invoke-virtual {v3, v2}, La/fet;->e(I)Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-eqz v4, :cond_2

    .line 80
    .line 81
    move v10, v11

    .line 82
    goto :goto_1

    .line 83
    :cond_2
    const/16 v10, 0x10

    .line 84
    .line 85
    :goto_1
    or-int/2addr v1, v10

    .line 86
    :cond_3
    and-int/lit16 v4, v1, 0x93

    .line 87
    .line 88
    if-eq v4, v9, :cond_4

    .line 89
    .line 90
    move v4, v14

    .line 91
    goto :goto_2

    .line 92
    :cond_4
    move v4, v15

    .line 93
    :goto_2
    and-int/2addr v1, v14

    .line 94
    invoke-virtual {v3, v1, v4}, La/fet;->U(IZ)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-eqz v1, :cond_9

    .line 99
    .line 100
    invoke-interface {v8, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    check-cast v1, La/deo0;

    .line 105
    .line 106
    const v2, -0x291c6eed

    .line 107
    .line 108
    .line 109
    invoke-virtual {v3, v2}, La/fet;->e0(I)V

    .line 110
    .line 111
    .line 112
    const/high16 v2, 0x3f800000    # 1.0f

    .line 113
    .line 114
    invoke-static {v5, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    sget-object v4, La/qmk;->a:La/zcl;

    .line 119
    .line 120
    const/high16 v4, 0x42a00000    # 80.0f

    .line 121
    .line 122
    invoke-static {v2, v4}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-virtual {v3, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    if-nez v4, :cond_5

    .line 135
    .line 136
    if-ne v5, v6, :cond_6

    .line 137
    .line 138
    :cond_5
    new-instance v5, La/qeo0;

    .line 139
    .line 140
    invoke-direct {v5, v1, v15}, La/qeo0;-><init>(La/deo0;B)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v3, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    :cond_6
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 147
    .line 148
    invoke-static {v2, v5}, La/rq8;->K(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 149
    .line 150
    .line 151
    move-result-object v19

    .line 152
    invoke-virtual {v3, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    invoke-virtual {v3, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    or-int/2addr v2, v4

    .line 161
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    if-nez v2, :cond_7

    .line 166
    .line 167
    if-ne v4, v6, :cond_8

    .line 168
    .line 169
    :cond_7
    new-instance v4, La/reo0;

    .line 170
    .line 171
    invoke-direct {v4, v7, v1, v15}, La/reo0;-><init>(Lkotlin/jvm/functions/Function1;La/deo0;B)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v3, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    :cond_8
    move-object/from16 v20, v4

    .line 178
    .line 179
    check-cast v20, Lkotlin/jvm/functions/Function0;

    .line 180
    .line 181
    const/16 v16, 0x0

    .line 182
    .line 183
    const/16 v17, 0x1

    .line 184
    .line 185
    const/16 v21, 0x0

    .line 186
    .line 187
    move-object/from16 v18, v3

    .line 188
    .line 189
    invoke-static/range {v16 .. v21}, La/yyw;->W(IILa/fet;La/mm40;Lkotlin/jvm/functions/Function0;Z)La/mm40;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    move-object/from16 v2, v18

    .line 194
    .line 195
    const/4 v8, 0x0

    .line 196
    const/16 v9, 0xa

    .line 197
    .line 198
    iget v5, v0, La/umh;->c:F

    .line 199
    .line 200
    const/4 v6, 0x0

    .line 201
    const/high16 v7, 0x41000000    # 8.0f

    .line 202
    .line 203
    invoke-static/range {v4 .. v9}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-static {v0, v1, v2, v15}, La/x0x;->m(La/mm40;La/deo0;La/fet;I)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2, v15}, La/fet;->r(Z)V

    .line 211
    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_9
    move-object v2, v3

    .line 215
    invoke-virtual {v2}, La/fet;->X()V

    .line 216
    .line 217
    .line 218
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 219
    .line 220
    return-object v0

    .line 221
    :pswitch_0
    move-object/from16 v0, p1

    .line 222
    .line 223
    check-cast v0, La/k8z;

    .line 224
    .line 225
    move-object/from16 v1, p2

    .line 226
    .line 227
    check-cast v1, Ljava/lang/Number;

    .line 228
    .line 229
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 230
    .line 231
    .line 232
    move-result v1

    .line 233
    move-object/from16 v2, p3

    .line 234
    .line 235
    check-cast v2, La/fet;

    .line 236
    .line 237
    move-object/from16 v3, p4

    .line 238
    .line 239
    check-cast v3, Ljava/lang/Number;

    .line 240
    .line 241
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 242
    .line 243
    .line 244
    move-result v3

    .line 245
    and-int/lit8 v16, v3, 0x6

    .line 246
    .line 247
    if-nez v16, :cond_b

    .line 248
    .line 249
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    if-eqz v0, :cond_a

    .line 254
    .line 255
    move v12, v13

    .line 256
    :cond_a
    or-int v0, v3, v12

    .line 257
    .line 258
    goto :goto_4

    .line 259
    :cond_b
    move v0, v3

    .line 260
    :goto_4
    and-int/lit8 v3, v3, 0x30

    .line 261
    .line 262
    if-nez v3, :cond_d

    .line 263
    .line 264
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 265
    .line 266
    .line 267
    move-result v3

    .line 268
    if-eqz v3, :cond_c

    .line 269
    .line 270
    move v10, v11

    .line 271
    goto :goto_5

    .line 272
    :cond_c
    const/16 v10, 0x10

    .line 273
    .line 274
    :goto_5
    or-int/2addr v0, v10

    .line 275
    :cond_d
    and-int/lit16 v3, v0, 0x93

    .line 276
    .line 277
    if-eq v3, v9, :cond_e

    .line 278
    .line 279
    move v3, v14

    .line 280
    goto :goto_6

    .line 281
    :cond_e
    move v3, v15

    .line 282
    :goto_6
    and-int/2addr v0, v14

    .line 283
    invoke-virtual {v2, v0, v3}, La/fet;->U(IZ)Z

    .line 284
    .line 285
    .line 286
    move-result v0

    .line 287
    if-eqz v0, :cond_13

    .line 288
    .line 289
    invoke-interface {v8, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    check-cast v0, La/ger0;

    .line 294
    .line 295
    const v1, 0x3df5e346

    .line 296
    .line 297
    .line 298
    invoke-virtual {v2, v1}, La/fet;->e0(I)V

    .line 299
    .line 300
    .line 301
    invoke-static {v5, v4}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 302
    .line 303
    .line 304
    move-result-object v16

    .line 305
    iget-object v1, v0, La/ger0;->b:La/zrm;

    .line 306
    .line 307
    invoke-virtual {v2, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v3

    .line 311
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v4

    .line 315
    or-int/2addr v3, v4

    .line 316
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v4

    .line 320
    if-nez v3, :cond_f

    .line 321
    .line 322
    if-ne v4, v6, :cond_10

    .line 323
    .line 324
    :cond_f
    new-instance v4, La/sue0;

    .line 325
    .line 326
    const/16 v3, 0x17

    .line 327
    .line 328
    invoke-direct {v4, v7, v0, v3}, La/sue0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v2, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    :cond_10
    move-object/from16 v18, v4

    .line 335
    .line 336
    check-cast v18, Lkotlin/jvm/functions/Function0;

    .line 337
    .line 338
    invoke-virtual {v2, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    move-result v3

    .line 342
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result v4

    .line 346
    or-int/2addr v3, v4

    .line 347
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v4

    .line 351
    if-nez v3, :cond_11

    .line 352
    .line 353
    if-ne v4, v6, :cond_12

    .line 354
    .line 355
    :cond_11
    new-instance v4, La/pwe0;

    .line 356
    .line 357
    const/16 v3, 0x1c

    .line 358
    .line 359
    invoke-direct {v4, v7, v0, v3}, La/pwe0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v2, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    :cond_12
    move-object/from16 v21, v4

    .line 366
    .line 367
    check-cast v21, Lkotlin/jvm/functions/Function1;

    .line 368
    .line 369
    const/16 v24, 0x0

    .line 370
    .line 371
    const/16 v25, 0x58

    .line 372
    .line 373
    const/16 v19, 0x0

    .line 374
    .line 375
    const/16 v20, 0x0

    .line 376
    .line 377
    const/16 v22, 0x0

    .line 378
    .line 379
    move-object/from16 v17, v1

    .line 380
    .line 381
    move-object/from16 v23, v2

    .line 382
    .line 383
    invoke-static/range {v16 .. v25}, La/agc;->r(La/mm40;La/zrm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 384
    .line 385
    .line 386
    move-object/from16 v0, v23

    .line 387
    .line 388
    invoke-virtual {v0, v15}, La/fet;->r(Z)V

    .line 389
    .line 390
    .line 391
    goto :goto_7

    .line 392
    :cond_13
    move-object v0, v2

    .line 393
    invoke-virtual {v0}, La/fet;->X()V

    .line 394
    .line 395
    .line 396
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 397
    .line 398
    return-object v0

    .line 399
    :pswitch_1
    move-object/from16 v1, p1

    .line 400
    .line 401
    check-cast v1, La/k8z;

    .line 402
    .line 403
    move-object/from16 v2, p2

    .line 404
    .line 405
    check-cast v2, Ljava/lang/Number;

    .line 406
    .line 407
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 408
    .line 409
    .line 410
    move-result v2

    .line 411
    move-object/from16 v3, p3

    .line 412
    .line 413
    check-cast v3, La/fet;

    .line 414
    .line 415
    move-object/from16 v6, p4

    .line 416
    .line 417
    check-cast v6, Ljava/lang/Number;

    .line 418
    .line 419
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 420
    .line 421
    .line 422
    move-result v6

    .line 423
    and-int/lit8 v7, v6, 0x6

    .line 424
    .line 425
    if-nez v7, :cond_15

    .line 426
    .line 427
    invoke-virtual {v3, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    move-result v1

    .line 431
    if-eqz v1, :cond_14

    .line 432
    .line 433
    move v12, v13

    .line 434
    :cond_14
    or-int v1, v6, v12

    .line 435
    .line 436
    goto :goto_8

    .line 437
    :cond_15
    move v1, v6

    .line 438
    :goto_8
    and-int/lit8 v6, v6, 0x30

    .line 439
    .line 440
    if-nez v6, :cond_17

    .line 441
    .line 442
    invoke-virtual {v3, v2}, La/fet;->e(I)Z

    .line 443
    .line 444
    .line 445
    move-result v6

    .line 446
    if-eqz v6, :cond_16

    .line 447
    .line 448
    move v10, v11

    .line 449
    goto :goto_9

    .line 450
    :cond_16
    const/16 v10, 0x10

    .line 451
    .line 452
    :goto_9
    or-int/2addr v1, v10

    .line 453
    :cond_17
    and-int/lit16 v6, v1, 0x93

    .line 454
    .line 455
    if-eq v6, v9, :cond_18

    .line 456
    .line 457
    move v6, v14

    .line 458
    goto :goto_a

    .line 459
    :cond_18
    move v6, v15

    .line 460
    :goto_a
    and-int/2addr v1, v14

    .line 461
    invoke-virtual {v3, v1, v6}, La/fet;->U(IZ)Z

    .line 462
    .line 463
    .line 464
    move-result v1

    .line 465
    if-eqz v1, :cond_19

    .line 466
    .line 467
    invoke-interface {v8, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v1

    .line 471
    move-object/from16 v17, v1

    .line 472
    .line 473
    check-cast v17, La/cuc0;

    .line 474
    .line 475
    const v1, -0x6eda9353

    .line 476
    .line 477
    .line 478
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 479
    .line 480
    .line 481
    invoke-static {v5, v4}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 482
    .line 483
    .line 484
    move-result-object v16

    .line 485
    sget-object v18, La/guc0;->b:La/guc0;

    .line 486
    .line 487
    const/16 v21, 0x180

    .line 488
    .line 489
    const/16 v22, 0x0

    .line 490
    .line 491
    iget-object v0, v0, La/umh;->d:Lkotlin/jvm/functions/Function1;

    .line 492
    .line 493
    move-object/from16 v19, v0

    .line 494
    .line 495
    move-object/from16 v20, v3

    .line 496
    .line 497
    invoke-static/range {v16 .. v22}, La/nnw0;->t(La/mm40;La/cuc0;La/guc0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 498
    .line 499
    .line 500
    move-object/from16 v0, v20

    .line 501
    .line 502
    invoke-virtual {v0, v15}, La/fet;->r(Z)V

    .line 503
    .line 504
    .line 505
    goto :goto_b

    .line 506
    :cond_19
    move-object v0, v3

    .line 507
    invoke-virtual {v0}, La/fet;->X()V

    .line 508
    .line 509
    .line 510
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 511
    .line 512
    return-object v0

    .line 513
    :pswitch_2
    move-object/from16 v0, p1

    .line 514
    .line 515
    check-cast v0, La/g9z;

    .line 516
    .line 517
    move-object/from16 v1, p2

    .line 518
    .line 519
    check-cast v1, Ljava/lang/Number;

    .line 520
    .line 521
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 522
    .line 523
    .line 524
    move-result v1

    .line 525
    move-object/from16 v5, p3

    .line 526
    .line 527
    check-cast v5, La/fet;

    .line 528
    .line 529
    move-object/from16 v16, p4

    .line 530
    .line 531
    check-cast v16, Ljava/lang/Number;

    .line 532
    .line 533
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Number;->intValue()I

    .line 534
    .line 535
    .line 536
    move-result v16

    .line 537
    and-int/lit8 v17, v16, 0x6

    .line 538
    .line 539
    if-nez v17, :cond_1b

    .line 540
    .line 541
    invoke-virtual {v5, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 542
    .line 543
    .line 544
    move-result v0

    .line 545
    if-eqz v0, :cond_1a

    .line 546
    .line 547
    move v12, v13

    .line 548
    :cond_1a
    or-int v0, v16, v12

    .line 549
    .line 550
    goto :goto_c

    .line 551
    :cond_1b
    move/from16 v0, v16

    .line 552
    .line 553
    :goto_c
    and-int/lit8 v12, v16, 0x30

    .line 554
    .line 555
    if-nez v12, :cond_1d

    .line 556
    .line 557
    invoke-virtual {v5, v1}, La/fet;->e(I)Z

    .line 558
    .line 559
    .line 560
    move-result v12

    .line 561
    if-eqz v12, :cond_1c

    .line 562
    .line 563
    move v10, v11

    .line 564
    goto :goto_d

    .line 565
    :cond_1c
    const/16 v10, 0x10

    .line 566
    .line 567
    :goto_d
    or-int/2addr v0, v10

    .line 568
    :cond_1d
    and-int/lit16 v10, v0, 0x93

    .line 569
    .line 570
    if-eq v10, v9, :cond_1e

    .line 571
    .line 572
    move v9, v14

    .line 573
    goto :goto_e

    .line 574
    :cond_1e
    move v9, v15

    .line 575
    :goto_e
    and-int/2addr v0, v14

    .line 576
    invoke-virtual {v5, v0, v9}, La/fet;->U(IZ)Z

    .line 577
    .line 578
    .line 579
    move-result v0

    .line 580
    if-eqz v0, :cond_22

    .line 581
    .line 582
    invoke-interface {v8, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    check-cast v0, La/yrc0;

    .line 587
    .line 588
    const v8, -0x4b63df1b

    .line 589
    .line 590
    .line 591
    invoke-virtual {v5, v8}, La/fet;->e0(I)V

    .line 592
    .line 593
    .line 594
    sget-object v8, La/qmk;->a:La/zcl;

    .line 595
    .line 596
    const/high16 v8, 0x41400000    # 12.0f

    .line 597
    .line 598
    add-float v10, v4, v8

    .line 599
    .line 600
    if-nez v1, :cond_1f

    .line 601
    .line 602
    :goto_f
    move v11, v3

    .line 603
    goto :goto_10

    .line 604
    :cond_1f
    const/high16 v3, 0x41000000    # 8.0f

    .line 605
    .line 606
    goto :goto_f

    .line 607
    :goto_10
    const/4 v13, 0x0

    .line 608
    const/16 v14, 0x8

    .line 609
    .line 610
    sget-object v9, La/jm40;->b:La/jm40;

    .line 611
    .line 612
    move v12, v10

    .line 613
    invoke-static/range {v9 .. v14}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 614
    .line 615
    .line 616
    move-result-object v1

    .line 617
    invoke-virtual {v5, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 618
    .line 619
    .line 620
    move-result v3

    .line 621
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 622
    .line 623
    .line 624
    move-result-object v4

    .line 625
    if-nez v3, :cond_20

    .line 626
    .line 627
    if-ne v4, v6, :cond_21

    .line 628
    .line 629
    :cond_20
    new-instance v4, La/v6a0;

    .line 630
    .line 631
    invoke-direct {v4, v7, v2}, La/v6a0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 632
    .line 633
    .line 634
    invoke-virtual {v5, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 635
    .line 636
    .line 637
    :cond_21
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 638
    .line 639
    invoke-static {v1, v0, v4, v5, v15}, La/q5x;->v(La/mm40;La/yrc0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 640
    .line 641
    .line 642
    invoke-virtual {v5, v15}, La/fet;->r(Z)V

    .line 643
    .line 644
    .line 645
    goto :goto_11

    .line 646
    :cond_22
    invoke-virtual {v5}, La/fet;->X()V

    .line 647
    .line 648
    .line 649
    :goto_11
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 650
    .line 651
    return-object v0

    .line 652
    :pswitch_3
    move-object/from16 v0, p1

    .line 653
    .line 654
    check-cast v0, La/k8z;

    .line 655
    .line 656
    move-object/from16 v1, p2

    .line 657
    .line 658
    check-cast v1, Ljava/lang/Number;

    .line 659
    .line 660
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 661
    .line 662
    .line 663
    move-result v1

    .line 664
    move-object/from16 v10, p3

    .line 665
    .line 666
    check-cast v10, La/fet;

    .line 667
    .line 668
    move-object/from16 v17, p4

    .line 669
    .line 670
    check-cast v17, Ljava/lang/Number;

    .line 671
    .line 672
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Number;->intValue()I

    .line 673
    .line 674
    .line 675
    move-result v17

    .line 676
    and-int/lit8 v18, v17, 0x6

    .line 677
    .line 678
    if-nez v18, :cond_24

    .line 679
    .line 680
    invoke-virtual {v10, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 681
    .line 682
    .line 683
    move-result v0

    .line 684
    if-eqz v0, :cond_23

    .line 685
    .line 686
    move v12, v13

    .line 687
    :cond_23
    or-int v0, v17, v12

    .line 688
    .line 689
    goto :goto_12

    .line 690
    :cond_24
    move/from16 v0, v17

    .line 691
    .line 692
    :goto_12
    and-int/lit8 v12, v17, 0x30

    .line 693
    .line 694
    if-nez v12, :cond_26

    .line 695
    .line 696
    invoke-virtual {v10, v1}, La/fet;->e(I)Z

    .line 697
    .line 698
    .line 699
    move-result v12

    .line 700
    if-eqz v12, :cond_25

    .line 701
    .line 702
    goto :goto_13

    .line 703
    :cond_25
    const/16 v11, 0x10

    .line 704
    .line 705
    :goto_13
    or-int/2addr v0, v11

    .line 706
    :cond_26
    and-int/lit16 v11, v0, 0x93

    .line 707
    .line 708
    if-eq v11, v9, :cond_27

    .line 709
    .line 710
    move v9, v14

    .line 711
    goto :goto_14

    .line 712
    :cond_27
    move v9, v15

    .line 713
    :goto_14
    and-int/2addr v0, v14

    .line 714
    invoke-virtual {v10, v0, v9}, La/fet;->U(IZ)Z

    .line 715
    .line 716
    .line 717
    move-result v0

    .line 718
    if-eqz v0, :cond_2a

    .line 719
    .line 720
    invoke-interface {v8, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object v0

    .line 724
    check-cast v0, La/smh;

    .line 725
    .line 726
    const v1, -0x28cd2d33

    .line 727
    .line 728
    .line 729
    invoke-virtual {v10, v1}, La/fet;->e0(I)V

    .line 730
    .line 731
    .line 732
    sget-object v1, La/qmk;->a:La/zcl;

    .line 733
    .line 734
    const/high16 v1, 0x43c80000    # 400.0f

    .line 735
    .line 736
    invoke-static {v5, v3, v1, v14}, La/o7k0;->u(La/mm40;FFI)La/mm40;

    .line 737
    .line 738
    .line 739
    move-result-object v1

    .line 740
    const v3, 0x3f666666    # 0.9f

    .line 741
    .line 742
    .line 743
    mul-float/2addr v4, v3

    .line 744
    invoke-static {v1, v4}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 745
    .line 746
    .line 747
    move-result-object v1

    .line 748
    invoke-virtual {v10, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 749
    .line 750
    .line 751
    move-result v3

    .line 752
    invoke-virtual {v10, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 753
    .line 754
    .line 755
    move-result v4

    .line 756
    or-int/2addr v3, v4

    .line 757
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object v4

    .line 761
    if-nez v3, :cond_28

    .line 762
    .line 763
    if-ne v4, v6, :cond_29

    .line 764
    .line 765
    :cond_28
    new-instance v4, La/lhf;

    .line 766
    .line 767
    invoke-direct {v4, v7, v0, v2}, La/lhf;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 768
    .line 769
    .line 770
    invoke-virtual {v10, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 771
    .line 772
    .line 773
    :cond_29
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 774
    .line 775
    invoke-static {v1, v0, v4, v10, v15}, La/xkb;->i(La/mm40;La/smh;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 776
    .line 777
    .line 778
    invoke-virtual {v10, v15}, La/fet;->r(Z)V

    .line 779
    .line 780
    .line 781
    goto :goto_15

    .line 782
    :cond_2a
    invoke-virtual {v10}, La/fet;->X()V

    .line 783
    .line 784
    .line 785
    :goto_15
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 786
    .line 787
    return-object v0

    .line 788
    nop

    .line 789
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
