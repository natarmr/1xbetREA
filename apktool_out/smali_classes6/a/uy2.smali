.class public final synthetic La/uy2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/uy2;->a:B

    iput-object p1, p0, La/uy2;->b:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/uy2;->a:B

    .line 4
    .line 5
    const v2, 0x799532c4

    .line 6
    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    iget-object v0, v0, La/uy2;->b:Ljava/util/ArrayList;

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object/from16 v1, p1

    .line 18
    .line 19
    check-cast v1, La/ou90;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, La/pu90;

    .line 39
    .line 40
    invoke-virtual {v1, v2, v6, v6, v4}, La/ou90;->m(La/pu90;IIF)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object v0

    .line 47
    :pswitch_0
    move-object/from16 v1, p1

    .line 48
    .line 49
    check-cast v1, La/epn0;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_2

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    move-object v4, v2

    .line 69
    check-cast v4, La/epn0;

    .line 70
    .line 71
    iget v7, v1, La/epn0;->a:I

    .line 72
    .line 73
    iget v8, v4, La/epn0;->a:I

    .line 74
    .line 75
    if-ne v7, v8, :cond_1

    .line 76
    .line 77
    iget-wide v7, v1, La/epn0;->d:J

    .line 78
    .line 79
    iget-wide v9, v4, La/epn0;->d:J

    .line 80
    .line 81
    cmp-long v7, v7, v9

    .line 82
    .line 83
    if-nez v7, :cond_1

    .line 84
    .line 85
    iget-wide v7, v1, La/epn0;->e:J

    .line 86
    .line 87
    iget-wide v9, v4, La/epn0;->e:J

    .line 88
    .line 89
    cmp-long v4, v7, v9

    .line 90
    .line 91
    if-nez v4, :cond_1

    .line 92
    .line 93
    move-object v3, v2

    .line 94
    :cond_2
    if-eqz v3, :cond_3

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_3
    move v5, v6

    .line 98
    :goto_1
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    return-object v0

    .line 103
    :pswitch_1
    move-object/from16 v1, p1

    .line 104
    .line 105
    check-cast v1, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;

    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-eqz v2, :cond_5

    .line 115
    .line 116
    :cond_4
    move v5, v6

    .line 117
    goto :goto_2

    .line 118
    :cond_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-eqz v2, :cond_4

    .line 127
    .line 128
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    check-cast v2, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;

    .line 133
    .line 134
    iget-object v2, v2, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;->a:La/t9m0;

    .line 135
    .line 136
    iget-object v3, v1, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;->a:La/t9m0;

    .line 137
    .line 138
    if-ne v2, v3, :cond_6

    .line 139
    .line 140
    :goto_2
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    return-object v0

    .line 145
    :pswitch_2
    move-object/from16 v1, p1

    .line 146
    .line 147
    check-cast v1, La/hcz;

    .line 148
    .line 149
    sget-object v4, La/xyl0;->n2:La/gle0;

    .line 150
    .line 151
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    new-instance v7, La/t9l0;

    .line 159
    .line 160
    const/4 v8, 0x3

    .line 161
    invoke-direct {v7, v0, v8}, La/t9l0;-><init>(Ljava/util/ArrayList;B)V

    .line 162
    .line 163
    .line 164
    new-instance v8, La/wyl0;

    .line 165
    .line 166
    invoke-direct {v8, v0, v6}, La/wyl0;-><init>(Ljava/lang/Object;B)V

    .line 167
    .line 168
    .line 169
    new-instance v0, La/ugd;

    .line 170
    .line 171
    invoke-direct {v0, v2, v5, v8}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1, v4, v3, v7, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 175
    .line 176
    .line 177
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 178
    .line 179
    return-object v0

    .line 180
    :pswitch_3
    move-object/from16 v1, p1

    .line 181
    .line 182
    check-cast v1, La/ou90;

    .line 183
    .line 184
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    move v3, v6

    .line 189
    :goto_3
    if-ge v3, v2, :cond_7

    .line 190
    .line 191
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    check-cast v4, La/pu90;

    .line 196
    .line 197
    invoke-static {v1, v4, v6, v6}, La/ou90;->h(La/ou90;La/pu90;II)V

    .line 198
    .line 199
    .line 200
    add-int/lit8 v3, v3, 0x1

    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 204
    .line 205
    return-object v0

    .line 206
    :pswitch_4
    move-object/from16 v1, p1

    .line 207
    .line 208
    check-cast v1, La/ou90;

    .line 209
    .line 210
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    move v2, v6

    .line 218
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    if-eqz v3, :cond_8

    .line 223
    .line 224
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    check-cast v3, La/pu90;

    .line 229
    .line 230
    invoke-virtual {v1, v3, v6, v2, v4}, La/ou90;->m(La/pu90;IIF)V

    .line 231
    .line 232
    .line 233
    iget v3, v3, La/pu90;->b:I

    .line 234
    .line 235
    add-int/2addr v2, v3

    .line 236
    goto :goto_4

    .line 237
    :cond_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 238
    .line 239
    return-object v0

    .line 240
    :pswitch_5
    move-object/from16 v1, p1

    .line 241
    .line 242
    check-cast v1, La/ou90;

    .line 243
    .line 244
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 245
    .line 246
    .line 247
    move-result v7

    .line 248
    move v8, v6

    .line 249
    :goto_5
    if-ge v8, v7, :cond_9

    .line 250
    .line 251
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    check-cast v2, La/pu90;

    .line 256
    .line 257
    const/4 v5, 0x0

    .line 258
    const/16 v6, 0xc

    .line 259
    .line 260
    const/4 v3, 0x0

    .line 261
    const/4 v4, 0x0

    .line 262
    invoke-static/range {v1 .. v6}, La/ou90;->w(La/ou90;La/pu90;IILa/cj;I)V

    .line 263
    .line 264
    .line 265
    add-int/lit8 v8, v8, 0x1

    .line 266
    .line 267
    goto :goto_5

    .line 268
    :cond_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 269
    .line 270
    return-object v0

    .line 271
    :pswitch_6
    move-object/from16 v1, p1

    .line 272
    .line 273
    check-cast v1, La/hcz;

    .line 274
    .line 275
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 279
    .line 280
    .line 281
    move-result v4

    .line 282
    new-instance v7, La/j13;

    .line 283
    .line 284
    const/16 v8, 0x14

    .line 285
    .line 286
    invoke-direct {v7, v0, v8, v6}, La/j13;-><init>(Ljava/util/ArrayList;BZ)V

    .line 287
    .line 288
    .line 289
    new-instance v6, La/ui8;

    .line 290
    .line 291
    invoke-direct {v6, v0, v0, v5}, La/ui8;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;B)V

    .line 292
    .line 293
    .line 294
    new-instance v0, La/ugd;

    .line 295
    .line 296
    invoke-direct {v0, v2, v5, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v1, v4, v3, v7, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 300
    .line 301
    .line 302
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 303
    .line 304
    return-object v0

    .line 305
    :pswitch_7
    move-object/from16 v1, p1

    .line 306
    .line 307
    check-cast v1, La/ou90;

    .line 308
    .line 309
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 313
    .line 314
    .line 315
    move-result v2

    .line 316
    move v7, v6

    .line 317
    :goto_6
    if-ge v7, v2, :cond_d

    .line 318
    .line 319
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v8

    .line 323
    check-cast v8, La/pu90;

    .line 324
    .line 325
    if-ne v7, v5, :cond_b

    .line 326
    .line 327
    invoke-virtual {v8}, La/pu90;->n()Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v9

    .line 331
    instance-of v10, v9, La/jww;

    .line 332
    .line 333
    if-eqz v10, :cond_a

    .line 334
    .line 335
    check-cast v9, La/jww;

    .line 336
    .line 337
    goto :goto_7

    .line 338
    :cond_a
    move-object v9, v3

    .line 339
    :goto_7
    if-eqz v9, :cond_c

    .line 340
    .line 341
    iget v10, v9, La/jww;->b:F

    .line 342
    .line 343
    invoke-interface {v1, v10}, La/w6k;->T(F)I

    .line 344
    .line 345
    .line 346
    move-result v10

    .line 347
    iget v9, v9, La/jww;->c:F

    .line 348
    .line 349
    invoke-interface {v1, v9}, La/w6k;->T(F)I

    .line 350
    .line 351
    .line 352
    move-result v9

    .line 353
    invoke-virtual {v1, v8, v10, v9, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 354
    .line 355
    .line 356
    goto :goto_8

    .line 357
    :cond_b
    invoke-virtual {v1, v8, v6, v6, v4}, La/ou90;->m(La/pu90;IIF)V

    .line 358
    .line 359
    .line 360
    :cond_c
    :goto_8
    add-int/lit8 v7, v7, 0x1

    .line 361
    .line 362
    goto :goto_6

    .line 363
    :cond_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 364
    .line 365
    return-object v0

    .line 366
    :pswitch_8
    move-object/from16 v1, p1

    .line 367
    .line 368
    check-cast v1, La/ou90;

    .line 369
    .line 370
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 374
    .line 375
    .line 376
    move-result v2

    .line 377
    move v7, v6

    .line 378
    :goto_9
    if-ge v7, v2, :cond_11

    .line 379
    .line 380
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v8

    .line 384
    check-cast v8, La/pu90;

    .line 385
    .line 386
    if-ne v7, v5, :cond_f

    .line 387
    .line 388
    invoke-virtual {v8}, La/pu90;->n()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v9

    .line 392
    instance-of v10, v9, La/iww;

    .line 393
    .line 394
    if-eqz v10, :cond_e

    .line 395
    .line 396
    check-cast v9, La/iww;

    .line 397
    .line 398
    goto :goto_a

    .line 399
    :cond_e
    move-object v9, v3

    .line 400
    :goto_a
    if-eqz v9, :cond_10

    .line 401
    .line 402
    iget v10, v9, La/iww;->b:F

    .line 403
    .line 404
    invoke-interface {v1, v10}, La/w6k;->T(F)I

    .line 405
    .line 406
    .line 407
    move-result v10

    .line 408
    iget v9, v9, La/iww;->c:F

    .line 409
    .line 410
    invoke-interface {v1, v9}, La/w6k;->T(F)I

    .line 411
    .line 412
    .line 413
    move-result v9

    .line 414
    invoke-virtual {v1, v8, v10, v9, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 415
    .line 416
    .line 417
    goto :goto_b

    .line 418
    :cond_f
    invoke-virtual {v1, v8, v6, v6, v4}, La/ou90;->m(La/pu90;IIF)V

    .line 419
    .line 420
    .line 421
    :cond_10
    :goto_b
    add-int/lit8 v7, v7, 0x1

    .line 422
    .line 423
    goto :goto_9

    .line 424
    :cond_11
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 425
    .line 426
    return-object v0

    .line 427
    :pswitch_9
    move-object/from16 v1, p1

    .line 428
    .line 429
    check-cast v1, La/ou90;

    .line 430
    .line 431
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 432
    .line 433
    .line 434
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 435
    .line 436
    .line 437
    move-result v2

    .line 438
    move v7, v6

    .line 439
    :goto_c
    if-ge v7, v2, :cond_15

    .line 440
    .line 441
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v8

    .line 445
    check-cast v8, La/pu90;

    .line 446
    .line 447
    if-ne v7, v5, :cond_13

    .line 448
    .line 449
    invoke-virtual {v8}, La/pu90;->n()Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v9

    .line 453
    instance-of v10, v9, La/hww;

    .line 454
    .line 455
    if-eqz v10, :cond_12

    .line 456
    .line 457
    check-cast v9, La/hww;

    .line 458
    .line 459
    goto :goto_d

    .line 460
    :cond_12
    move-object v9, v3

    .line 461
    :goto_d
    if-eqz v9, :cond_14

    .line 462
    .line 463
    iget v10, v9, La/hww;->b:F

    .line 464
    .line 465
    invoke-interface {v1, v10}, La/w6k;->T(F)I

    .line 466
    .line 467
    .line 468
    move-result v10

    .line 469
    iget v9, v9, La/hww;->c:F

    .line 470
    .line 471
    invoke-interface {v1, v9}, La/w6k;->T(F)I

    .line 472
    .line 473
    .line 474
    move-result v9

    .line 475
    invoke-virtual {v1, v8, v10, v9, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 476
    .line 477
    .line 478
    goto :goto_e

    .line 479
    :cond_13
    invoke-virtual {v1, v8, v6, v6, v4}, La/ou90;->m(La/pu90;IIF)V

    .line 480
    .line 481
    .line 482
    :cond_14
    :goto_e
    add-int/lit8 v7, v7, 0x1

    .line 483
    .line 484
    goto :goto_c

    .line 485
    :cond_15
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 486
    .line 487
    return-object v0

    .line 488
    :pswitch_a
    move-object/from16 v1, p1

    .line 489
    .line 490
    check-cast v1, La/ou90;

    .line 491
    .line 492
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 496
    .line 497
    .line 498
    move-result v2

    .line 499
    move v7, v6

    .line 500
    :goto_f
    if-ge v7, v2, :cond_19

    .line 501
    .line 502
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v8

    .line 506
    check-cast v8, La/pu90;

    .line 507
    .line 508
    if-ne v7, v5, :cond_17

    .line 509
    .line 510
    invoke-virtual {v8}, La/pu90;->n()Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v9

    .line 514
    instance-of v10, v9, La/gww;

    .line 515
    .line 516
    if-eqz v10, :cond_16

    .line 517
    .line 518
    check-cast v9, La/gww;

    .line 519
    .line 520
    goto :goto_10

    .line 521
    :cond_16
    move-object v9, v3

    .line 522
    :goto_10
    if-eqz v9, :cond_18

    .line 523
    .line 524
    iget v10, v9, La/gww;->b:F

    .line 525
    .line 526
    invoke-interface {v1, v10}, La/w6k;->T(F)I

    .line 527
    .line 528
    .line 529
    move-result v10

    .line 530
    iget v9, v9, La/gww;->c:F

    .line 531
    .line 532
    invoke-interface {v1, v9}, La/w6k;->T(F)I

    .line 533
    .line 534
    .line 535
    move-result v9

    .line 536
    invoke-virtual {v1, v8, v10, v9, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 537
    .line 538
    .line 539
    goto :goto_11

    .line 540
    :cond_17
    invoke-virtual {v1, v8, v6, v6, v4}, La/ou90;->m(La/pu90;IIF)V

    .line 541
    .line 542
    .line 543
    :cond_18
    :goto_11
    add-int/lit8 v7, v7, 0x1

    .line 544
    .line 545
    goto :goto_f

    .line 546
    :cond_19
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 547
    .line 548
    return-object v0

    .line 549
    :pswitch_b
    move-object/from16 v1, p1

    .line 550
    .line 551
    check-cast v1, La/ou90;

    .line 552
    .line 553
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 554
    .line 555
    .line 556
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    move v2, v6

    .line 561
    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 562
    .line 563
    .line 564
    move-result v3

    .line 565
    if-eqz v3, :cond_1a

    .line 566
    .line 567
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v3

    .line 571
    check-cast v3, La/pu90;

    .line 572
    .line 573
    invoke-virtual {v1, v3, v6, v2, v4}, La/ou90;->m(La/pu90;IIF)V

    .line 574
    .line 575
    .line 576
    iget v3, v3, La/pu90;->b:I

    .line 577
    .line 578
    add-int/2addr v2, v3

    .line 579
    goto :goto_12

    .line 580
    :cond_1a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 581
    .line 582
    return-object v0

    .line 583
    :pswitch_c
    move-object/from16 v1, p1

    .line 584
    .line 585
    check-cast v1, La/ou90;

    .line 586
    .line 587
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 588
    .line 589
    .line 590
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    move v2, v6

    .line 595
    :goto_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 596
    .line 597
    .line 598
    move-result v3

    .line 599
    if-eqz v3, :cond_1b

    .line 600
    .line 601
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object v3

    .line 605
    check-cast v3, La/pu90;

    .line 606
    .line 607
    invoke-virtual {v1, v3, v6, v2, v4}, La/ou90;->m(La/pu90;IIF)V

    .line 608
    .line 609
    .line 610
    iget v3, v3, La/pu90;->b:I

    .line 611
    .line 612
    add-int/2addr v2, v3

    .line 613
    goto :goto_13

    .line 614
    :cond_1b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 615
    .line 616
    return-object v0

    .line 617
    :pswitch_d
    move-object/from16 v1, p1

    .line 618
    .line 619
    check-cast v1, La/ou90;

    .line 620
    .line 621
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 622
    .line 623
    .line 624
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 625
    .line 626
    .line 627
    move-result-object v0

    .line 628
    move v2, v6

    .line 629
    :goto_14
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 630
    .line 631
    .line 632
    move-result v3

    .line 633
    if-eqz v3, :cond_1c

    .line 634
    .line 635
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v3

    .line 639
    check-cast v3, La/pu90;

    .line 640
    .line 641
    invoke-virtual {v1, v3, v6, v2, v4}, La/ou90;->m(La/pu90;IIF)V

    .line 642
    .line 643
    .line 644
    iget v3, v3, La/pu90;->b:I

    .line 645
    .line 646
    add-int/2addr v2, v3

    .line 647
    goto :goto_14

    .line 648
    :cond_1c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 649
    .line 650
    return-object v0

    .line 651
    :pswitch_e
    move-object/from16 v1, p1

    .line 652
    .line 653
    check-cast v1, La/ou90;

    .line 654
    .line 655
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 656
    .line 657
    .line 658
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 659
    .line 660
    .line 661
    move-result-object v0

    .line 662
    move v2, v6

    .line 663
    :goto_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 664
    .line 665
    .line 666
    move-result v3

    .line 667
    if-eqz v3, :cond_1d

    .line 668
    .line 669
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    move-result-object v3

    .line 673
    check-cast v3, La/pu90;

    .line 674
    .line 675
    invoke-virtual {v1, v3, v6, v2, v4}, La/ou90;->m(La/pu90;IIF)V

    .line 676
    .line 677
    .line 678
    iget v3, v3, La/pu90;->b:I

    .line 679
    .line 680
    add-int/2addr v2, v3

    .line 681
    goto :goto_15

    .line 682
    :cond_1d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 683
    .line 684
    return-object v0

    .line 685
    :pswitch_f
    move-object/from16 v1, p1

    .line 686
    .line 687
    check-cast v1, La/ou90;

    .line 688
    .line 689
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 690
    .line 691
    .line 692
    move-result v2

    .line 693
    move v3, v6

    .line 694
    :goto_16
    if-ge v3, v2, :cond_21

    .line 695
    .line 696
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 697
    .line 698
    .line 699
    move-result-object v4

    .line 700
    check-cast v4, La/wj30;

    .line 701
    .line 702
    iget-object v7, v4, La/wj30;->b:Ljava/util/List;

    .line 703
    .line 704
    iget-boolean v8, v4, La/wj30;->g:Z

    .line 705
    .line 706
    iget v9, v4, La/wj30;->k:I

    .line 707
    .line 708
    const/high16 v10, -0x80000000

    .line 709
    .line 710
    if-eq v9, v10, :cond_1e

    .line 711
    .line 712
    goto :goto_17

    .line 713
    :cond_1e
    const-string v9, "position() should be called first"

    .line 714
    .line 715
    invoke-static {v9}, La/adx;->a(Ljava/lang/String;)V

    .line 716
    .line 717
    .line 718
    :goto_17
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 719
    .line 720
    .line 721
    move-result v9

    .line 722
    move v10, v6

    .line 723
    :goto_18
    if-ge v10, v9, :cond_20

    .line 724
    .line 725
    invoke-interface {v7, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    move-result-object v11

    .line 729
    check-cast v11, La/pu90;

    .line 730
    .line 731
    iget-object v12, v4, La/wj30;->i:[I

    .line 732
    .line 733
    mul-int/lit8 v13, v10, 0x2

    .line 734
    .line 735
    aget v14, v12, v13

    .line 736
    .line 737
    add-int/2addr v13, v5

    .line 738
    aget v12, v12, v13

    .line 739
    .line 740
    int-to-long v13, v14

    .line 741
    const/16 v15, 0x20

    .line 742
    .line 743
    shl-long/2addr v13, v15

    .line 744
    int-to-long v5, v12

    .line 745
    const-wide v16, 0xffffffffL

    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    and-long v5, v5, v16

    .line 751
    .line 752
    or-long/2addr v5, v13

    .line 753
    iget-wide v12, v4, La/wj30;->c:J

    .line 754
    .line 755
    invoke-static {v5, v6, v12, v13}, La/ikx;->d(JJ)J

    .line 756
    .line 757
    .line 758
    move-result-wide v5

    .line 759
    if-eqz v8, :cond_1f

    .line 760
    .line 761
    invoke-static {v1, v11, v5, v6}, La/ou90;->G(La/ou90;La/pu90;J)V

    .line 762
    .line 763
    .line 764
    goto :goto_19

    .line 765
    :cond_1f
    invoke-static {v1, v11, v5, v6}, La/ou90;->y(La/ou90;La/pu90;J)V

    .line 766
    .line 767
    .line 768
    :goto_19
    add-int/lit8 v10, v10, 0x1

    .line 769
    .line 770
    const/4 v5, 0x1

    .line 771
    const/4 v6, 0x0

    .line 772
    goto :goto_18

    .line 773
    :cond_20
    add-int/lit8 v3, v3, 0x1

    .line 774
    .line 775
    const/4 v5, 0x1

    .line 776
    const/4 v6, 0x0

    .line 777
    goto :goto_16

    .line 778
    :cond_21
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 779
    .line 780
    return-object v0

    .line 781
    :pswitch_10
    move-object/from16 v1, p1

    .line 782
    .line 783
    check-cast v1, La/d8h;

    .line 784
    .line 785
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 786
    .line 787
    .line 788
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 789
    .line 790
    .line 791
    move-result v2

    .line 792
    if-eqz v2, :cond_22

    .line 793
    .line 794
    goto :goto_1a

    .line 795
    :cond_22
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 796
    .line 797
    .line 798
    move-result-object v2

    .line 799
    :cond_23
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 800
    .line 801
    .line 802
    move-result v3

    .line 803
    if-eqz v3, :cond_26

    .line 804
    .line 805
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 806
    .line 807
    .line 808
    move-result-object v3

    .line 809
    check-cast v3, La/f2h;

    .line 810
    .line 811
    iget-object v3, v3, La/f2h;->a:Ljava/lang/String;

    .line 812
    .line 813
    iget-object v4, v1, La/d8h;->c:Ljava/lang/String;

    .line 814
    .line 815
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 816
    .line 817
    .line 818
    move-result v3

    .line 819
    if-eqz v3, :cond_23

    .line 820
    .line 821
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 822
    .line 823
    .line 824
    move-result v2

    .line 825
    if-eqz v2, :cond_24

    .line 826
    .line 827
    goto :goto_1a

    .line 828
    :cond_24
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 829
    .line 830
    .line 831
    move-result-object v0

    .line 832
    :cond_25
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 833
    .line 834
    .line 835
    move-result v2

    .line 836
    if-eqz v2, :cond_26

    .line 837
    .line 838
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 839
    .line 840
    .line 841
    move-result-object v2

    .line 842
    check-cast v2, La/f2h;

    .line 843
    .line 844
    iget-object v2, v2, La/f2h;->a:Ljava/lang/String;

    .line 845
    .line 846
    iget-object v3, v1, La/d8h;->b:Ljava/lang/String;

    .line 847
    .line 848
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 849
    .line 850
    .line 851
    move-result v2

    .line 852
    if-eqz v2, :cond_25

    .line 853
    .line 854
    const/4 v5, 0x0

    .line 855
    goto :goto_1b

    .line 856
    :cond_26
    :goto_1a
    const/4 v5, 0x1

    .line 857
    :goto_1b
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 858
    .line 859
    .line 860
    move-result-object v0

    .line 861
    return-object v0

    .line 862
    :pswitch_11
    move-object/from16 v1, p1

    .line 863
    .line 864
    check-cast v1, La/hcz;

    .line 865
    .line 866
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 867
    .line 868
    .line 869
    new-instance v3, La/i87;

    .line 870
    .line 871
    const/16 v4, 0x1a

    .line 872
    .line 873
    invoke-direct {v3, v4}, La/i87;-><init>(B)V

    .line 874
    .line 875
    .line 876
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 877
    .line 878
    .line 879
    move-result v4

    .line 880
    new-instance v5, La/at7;

    .line 881
    .line 882
    const/4 v6, 0x4

    .line 883
    invoke-direct {v5, v3, v0, v6}, La/at7;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 884
    .line 885
    .line 886
    new-instance v3, La/j13;

    .line 887
    .line 888
    const/4 v7, 0x0

    .line 889
    invoke-direct {v3, v0, v6, v7}, La/j13;-><init>(Ljava/util/ArrayList;BZ)V

    .line 890
    .line 891
    .line 892
    new-instance v6, La/ui8;

    .line 893
    .line 894
    invoke-direct {v6, v0, v0, v7}, La/ui8;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;B)V

    .line 895
    .line 896
    .line 897
    new-instance v0, La/ugd;

    .line 898
    .line 899
    const/4 v15, 0x1

    .line 900
    invoke-direct {v0, v2, v15, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 901
    .line 902
    .line 903
    invoke-virtual {v1, v4, v5, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 904
    .line 905
    .line 906
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 907
    .line 908
    return-object v0

    .line 909
    :pswitch_12
    move-object/from16 v1, p1

    .line 910
    .line 911
    check-cast v1, La/ou90;

    .line 912
    .line 913
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 914
    .line 915
    .line 916
    move-result v2

    .line 917
    const/4 v7, 0x0

    .line 918
    :goto_1c
    if-ge v7, v2, :cond_27

    .line 919
    .line 920
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 921
    .line 922
    .line 923
    move-result-object v3

    .line 924
    check-cast v3, La/pu90;

    .line 925
    .line 926
    const/4 v4, 0x0

    .line 927
    invoke-static {v1, v3, v4, v4}, La/ou90;->n(La/ou90;La/pu90;II)V

    .line 928
    .line 929
    .line 930
    add-int/lit8 v7, v7, 0x1

    .line 931
    .line 932
    goto :goto_1c

    .line 933
    :cond_27
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 934
    .line 935
    return-object v0

    .line 936
    :pswitch_13
    move-object/from16 v1, p1

    .line 937
    .line 938
    check-cast v1, La/ou90;

    .line 939
    .line 940
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 941
    .line 942
    .line 943
    move-result v2

    .line 944
    const/4 v7, 0x0

    .line 945
    :goto_1d
    if-ge v7, v2, :cond_28

    .line 946
    .line 947
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 948
    .line 949
    .line 950
    move-result-object v3

    .line 951
    check-cast v3, La/pu90;

    .line 952
    .line 953
    const/4 v4, 0x0

    .line 954
    invoke-static {v1, v3, v4, v4}, La/ou90;->n(La/ou90;La/pu90;II)V

    .line 955
    .line 956
    .line 957
    add-int/lit8 v7, v7, 0x1

    .line 958
    .line 959
    goto :goto_1d

    .line 960
    :cond_28
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 961
    .line 962
    return-object v0

    .line 963
    :pswitch_data_0
    .packed-switch 0x0
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
