.class public final La/n180;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/n180;->a:B

    iput-object p1, p0, La/n180;->c:Ljava/lang/Object;

    iput-boolean p2, p0, La/n180;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final f(La/pu90;ZLa/ou90;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p2, p0, p3, p4, v0}, La/ou90;->m(La/pu90;IIF)V

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p2, p0, p3, p4, v0}, La/ou90;->g(La/pu90;IIF)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-wide/from16 v3, p3

    .line 8
    .line 9
    iget-byte v5, v0, La/n180;->a:B

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    iget-object v10, v0, La/n180;->c:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v11, 0x0

    .line 15
    const/high16 v7, 0x41000000    # 8.0f

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    packed-switch v5, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    check-cast v10, La/d4n;

    .line 24
    .line 25
    if-eqz v10, :cond_e

    .line 26
    .line 27
    instance-of v5, v10, La/z3n;

    .line 28
    .line 29
    if-eqz v5, :cond_0

    .line 30
    .line 31
    sget-object v5, La/qmk;->a:La/zcl;

    .line 32
    .line 33
    const/high16 v5, 0x40c00000    # 6.0f

    .line 34
    .line 35
    invoke-interface {v1, v5}, La/w6k;->T(F)I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    instance-of v5, v10, La/a4n;

    .line 41
    .line 42
    if-eqz v5, :cond_1

    .line 43
    .line 44
    sget-object v5, La/qmk;->a:La/zcl;

    .line 45
    .line 46
    invoke-interface {v1, v7}, La/w6k;->T(F)I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    instance-of v5, v10, La/b4n;

    .line 52
    .line 53
    if-eqz v5, :cond_2

    .line 54
    .line 55
    sget-object v5, La/qmk;->a:La/zcl;

    .line 56
    .line 57
    const/high16 v5, 0x40000000    # 2.0f

    .line 58
    .line 59
    invoke-interface {v1, v5}, La/w6k;->T(F)I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    goto :goto_0

    .line 64
    :cond_2
    instance-of v5, v10, La/c4n;

    .line 65
    .line 66
    if-eqz v5, :cond_3

    .line 67
    .line 68
    sget-object v5, La/qmk;->a:La/zcl;

    .line 69
    .line 70
    invoke-interface {v1, v7}, La/w6k;->T(F)I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    goto :goto_0

    .line 75
    :cond_3
    instance-of v5, v10, La/y3n;

    .line 76
    .line 77
    if-eqz v5, :cond_e

    .line 78
    .line 79
    sget-object v5, La/qmk;->a:La/zcl;

    .line 80
    .line 81
    const/high16 v5, 0x40800000    # 4.0f

    .line 82
    .line 83
    invoke-interface {v1, v5}, La/w6k;->T(F)I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    :goto_0
    invoke-static {v3, v4}, La/p4e;->i(J)I

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    sub-int/2addr v8, v6

    .line 96
    mul-int/2addr v8, v5

    .line 97
    sub-int/2addr v7, v8

    .line 98
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    div-int/2addr v7, v6

    .line 103
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    if-lez v7, :cond_4

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_4
    const/4 v6, 0x0

    .line 111
    :goto_1
    if-eqz v6, :cond_5

    .line 112
    .line 113
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    goto :goto_2

    .line 118
    :cond_5
    move v6, v11

    .line 119
    :goto_2
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result v8

    .line 127
    if-eqz v8, :cond_d

    .line 128
    .line 129
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v8

    .line 133
    check-cast v8, La/pj30;

    .line 134
    .line 135
    invoke-static {v3, v4}, La/p4e;->h(J)I

    .line 136
    .line 137
    .line 138
    move-result v9

    .line 139
    invoke-static {v6, v6, v11, v9}, La/p4e;->a(IIII)J

    .line 140
    .line 141
    .line 142
    move-result-wide v9

    .line 143
    invoke-interface {v8, v9, v10}, La/pj30;->S(J)La/pu90;

    .line 144
    .line 145
    .line 146
    move-result-object v8

    .line 147
    iget v8, v8, La/pu90;->b:I

    .line 148
    .line 149
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v9

    .line 153
    if-lez v8, :cond_6

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_6
    const/4 v9, 0x0

    .line 157
    :goto_3
    if-eqz v9, :cond_7

    .line 158
    .line 159
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 160
    .line 161
    .line 162
    move-result v8

    .line 163
    goto :goto_4

    .line 164
    :cond_7
    move v8, v11

    .line 165
    :cond_8
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 166
    .line 167
    .line 168
    move-result v9

    .line 169
    if-eqz v9, :cond_b

    .line 170
    .line 171
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v9

    .line 175
    check-cast v9, La/pj30;

    .line 176
    .line 177
    invoke-static {v3, v4}, La/p4e;->h(J)I

    .line 178
    .line 179
    .line 180
    move-result v10

    .line 181
    invoke-static {v6, v6, v11, v10}, La/p4e;->a(IIII)J

    .line 182
    .line 183
    .line 184
    move-result-wide v13

    .line 185
    invoke-interface {v9, v13, v14}, La/pj30;->S(J)La/pu90;

    .line 186
    .line 187
    .line 188
    move-result-object v9

    .line 189
    iget v9, v9, La/pu90;->b:I

    .line 190
    .line 191
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 192
    .line 193
    .line 194
    move-result-object v10

    .line 195
    if-lez v9, :cond_9

    .line 196
    .line 197
    goto :goto_5

    .line 198
    :cond_9
    const/4 v10, 0x0

    .line 199
    :goto_5
    if-eqz v10, :cond_a

    .line 200
    .line 201
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 202
    .line 203
    .line 204
    move-result v9

    .line 205
    goto :goto_6

    .line 206
    :cond_a
    move v9, v11

    .line 207
    :goto_6
    if-ge v8, v9, :cond_8

    .line 208
    .line 209
    move v8, v9

    .line 210
    goto :goto_4

    .line 211
    :cond_b
    new-instance v7, Ljava/util/ArrayList;

    .line 212
    .line 213
    const/16 v9, 0xa

    .line 214
    .line 215
    invoke-static {v2, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 216
    .line 217
    .line 218
    move-result v9

    .line 219
    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 220
    .line 221
    .line 222
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 227
    .line 228
    .line 229
    move-result v9

    .line 230
    if-eqz v9, :cond_c

    .line 231
    .line 232
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v9

    .line 236
    check-cast v9, La/pj30;

    .line 237
    .line 238
    invoke-static {v6, v6, v8, v8}, La/p4e;->a(IIII)J

    .line 239
    .line 240
    .line 241
    move-result-wide v10

    .line 242
    invoke-interface {v9, v10, v11}, La/pj30;->S(J)La/pu90;

    .line 243
    .line 244
    .line 245
    move-result-object v9

    .line 246
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    goto :goto_7

    .line 250
    :cond_c
    invoke-static {v3, v4}, La/p4e;->i(J)I

    .line 251
    .line 252
    .line 253
    move-result v2

    .line 254
    new-instance v3, La/hka;

    .line 255
    .line 256
    iget-boolean v0, v0, La/n180;->b:Z

    .line 257
    .line 258
    invoke-direct {v3, v5, v7, v0}, La/hka;-><init>(ILjava/util/ArrayList;Z)V

    .line 259
    .line 260
    .line 261
    invoke-static {v1, v2, v8, v3}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 262
    .line 263
    .line 264
    move-result-object v12

    .line 265
    goto :goto_9

    .line 266
    :cond_d
    invoke-static {}, La/itt0;->a()V

    .line 267
    .line 268
    .line 269
    :goto_8
    const/4 v12, 0x0

    .line 270
    goto :goto_9

    .line 271
    :cond_e
    invoke-static {}, La/t9f;->b()V

    .line 272
    .line 273
    .line 274
    goto :goto_8

    .line 275
    :goto_9
    return-object v12

    .line 276
    :pswitch_0
    sget-object v5, La/qmk;->a:La/zcl;

    .line 277
    .line 278
    invoke-interface {v1, v7}, La/w6k;->T(F)I

    .line 279
    .line 280
    .line 281
    move-result v5

    .line 282
    const/high16 v7, 0x41800000    # 16.0f

    .line 283
    .line 284
    invoke-interface {v1, v7}, La/w6k;->T(F)I

    .line 285
    .line 286
    .line 287
    move-result v13

    .line 288
    const/high16 v7, 0x41e80000    # 29.0f

    .line 289
    .line 290
    invoke-interface {v1, v7}, La/w6k;->T(F)I

    .line 291
    .line 292
    .line 293
    move-result v31

    .line 294
    invoke-static {v3, v4}, La/p4e;->i(J)I

    .line 295
    .line 296
    .line 297
    move-result v7

    .line 298
    const/4 v14, 0x2

    .line 299
    div-int/2addr v7, v14

    .line 300
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v6

    .line 304
    check-cast v6, La/pj30;

    .line 305
    .line 306
    invoke-interface {v6, v3, v4}, La/pj30;->S(J)La/pu90;

    .line 307
    .line 308
    .line 309
    move-result-object v15

    .line 310
    invoke-interface {v2, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v6

    .line 314
    check-cast v6, La/pj30;

    .line 315
    .line 316
    invoke-interface {v6, v3, v4}, La/pj30;->S(J)La/pu90;

    .line 317
    .line 318
    .line 319
    move-result-object v6

    .line 320
    const/4 v8, 0x3

    .line 321
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v8

    .line 325
    check-cast v8, La/pj30;

    .line 326
    .line 327
    invoke-interface {v8, v3, v4}, La/pj30;->S(J)La/pu90;

    .line 328
    .line 329
    .line 330
    move-result-object v21

    .line 331
    iget v8, v6, La/pu90;->a:I

    .line 332
    .line 333
    div-int/2addr v8, v14

    .line 334
    sub-int v16, v7, v8

    .line 335
    .line 336
    iget v9, v15, La/pu90;->a:I

    .line 337
    .line 338
    sub-int v9, v16, v9

    .line 339
    .line 340
    sub-int v19, v9, v5

    .line 341
    .line 342
    add-int/2addr v7, v8

    .line 343
    add-int v22, v7, v5

    .line 344
    .line 345
    sub-int v17, v19, v13

    .line 346
    .line 347
    invoke-interface {v2, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v5

    .line 351
    check-cast v5, La/pj30;

    .line 352
    .line 353
    move-object v7, v6

    .line 354
    if-gez v17, :cond_f

    .line 355
    .line 356
    move v6, v11

    .line 357
    goto :goto_a

    .line 358
    :cond_f
    move/from16 v6, v17

    .line 359
    .line 360
    :goto_a
    const/4 v8, 0x0

    .line 361
    const/16 v9, 0xc

    .line 362
    .line 363
    move-object/from16 v18, v5

    .line 364
    .line 365
    const/4 v5, 0x0

    .line 366
    move-object/from16 v20, v7

    .line 367
    .line 368
    const/4 v7, 0x0

    .line 369
    move-object/from16 v11, v20

    .line 370
    .line 371
    move-object/from16 v12, v21

    .line 372
    .line 373
    move/from16 v20, v14

    .line 374
    .line 375
    move-object/from16 v14, v18

    .line 376
    .line 377
    invoke-static/range {v3 .. v9}, La/p4e;->b(JIIIII)J

    .line 378
    .line 379
    .line 380
    move-result-wide v5

    .line 381
    invoke-interface {v14, v5, v6}, La/pj30;->S(J)La/pu90;

    .line 382
    .line 383
    .line 384
    move-result-object v14

    .line 385
    const/4 v3, 0x4

    .line 386
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v4

    .line 390
    check-cast v4, La/pj30;

    .line 391
    .line 392
    if-gez v17, :cond_10

    .line 393
    .line 394
    const/4 v6, 0x0

    .line 395
    goto :goto_b

    .line 396
    :cond_10
    move/from16 v6, v17

    .line 397
    .line 398
    :goto_b
    const/4 v8, 0x0

    .line 399
    const/16 v9, 0xc

    .line 400
    .line 401
    const/4 v5, 0x0

    .line 402
    const/4 v7, 0x0

    .line 403
    move/from16 v24, v3

    .line 404
    .line 405
    move-object/from16 v21, v10

    .line 406
    .line 407
    move-object v10, v4

    .line 408
    move-wide/from16 v3, p3

    .line 409
    .line 410
    invoke-static/range {v3 .. v9}, La/p4e;->b(JIIIII)J

    .line 411
    .line 412
    .line 413
    move-result-wide v5

    .line 414
    invoke-interface {v10, v5, v6}, La/pj30;->S(J)La/pu90;

    .line 415
    .line 416
    .line 417
    move-result-object v9

    .line 418
    iget v3, v14, La/pu90;->a:I

    .line 419
    .line 420
    sub-int v10, v17, v3

    .line 421
    .line 422
    iget v3, v12, La/pu90;->a:I

    .line 423
    .line 424
    add-int v3, v22, v3

    .line 425
    .line 426
    add-int v27, v3, v13

    .line 427
    .line 428
    const/4 v3, 0x5

    .line 429
    invoke-static {v3, v2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v2

    .line 433
    move-object v13, v2

    .line 434
    check-cast v13, La/pj30;

    .line 435
    .line 436
    if-eqz v13, :cond_12

    .line 437
    .line 438
    if-gez v17, :cond_11

    .line 439
    .line 440
    const/4 v5, 0x0

    .line 441
    goto :goto_c

    .line 442
    :cond_11
    move/from16 v5, v17

    .line 443
    .line 444
    :goto_c
    const/4 v7, 0x0

    .line 445
    const/16 v8, 0xc

    .line 446
    .line 447
    const/4 v4, 0x0

    .line 448
    const/4 v6, 0x0

    .line 449
    move-wide/from16 v2, p3

    .line 450
    .line 451
    invoke-static/range {v2 .. v8}, La/p4e;->b(JIIIII)J

    .line 452
    .line 453
    .line 454
    move-result-wide v4

    .line 455
    invoke-interface {v13, v4, v5}, La/pj30;->S(J)La/pu90;

    .line 456
    .line 457
    .line 458
    move-result-object v2

    .line 459
    goto :goto_d

    .line 460
    :cond_12
    const/4 v2, 0x0

    .line 461
    :goto_d
    iget v3, v11, La/pu90;->b:I

    .line 462
    .line 463
    iget v4, v14, La/pu90;->b:I

    .line 464
    .line 465
    if-eqz v2, :cond_13

    .line 466
    .line 467
    iget v5, v9, La/pu90;->b:I

    .line 468
    .line 469
    iget v6, v15, La/pu90;->b:I

    .line 470
    .line 471
    iget v7, v2, La/pu90;->b:I

    .line 472
    .line 473
    add-int/2addr v7, v6

    .line 474
    div-int/lit8 v6, v6, 0x4

    .line 475
    .line 476
    sub-int/2addr v7, v6

    .line 477
    filled-new-array {v4, v5, v7}, [I

    .line 478
    .line 479
    .line 480
    move-result-object v4

    .line 481
    invoke-static {v4, v3}, La/idd;->c([II)I

    .line 482
    .line 483
    .line 484
    move-result v3

    .line 485
    goto :goto_e

    .line 486
    :cond_13
    iget v5, v9, La/pu90;->b:I

    .line 487
    .line 488
    iget v6, v15, La/pu90;->b:I

    .line 489
    .line 490
    filled-new-array {v4, v5, v6}, [I

    .line 491
    .line 492
    .line 493
    move-result-object v4

    .line 494
    invoke-static {v4, v3}, La/idd;->c([II)I

    .line 495
    .line 496
    .line 497
    move-result v3

    .line 498
    :goto_e
    iget v4, v11, La/pu90;->b:I

    .line 499
    .line 500
    sub-int v4, v3, v4

    .line 501
    .line 502
    div-int/lit8 v17, v4, 0x2

    .line 503
    .line 504
    iget v4, v12, La/pu90;->b:I

    .line 505
    .line 506
    sub-int v4, v3, v4

    .line 507
    .line 508
    div-int/lit8 v4, v4, 0x2

    .line 509
    .line 510
    iget v5, v14, La/pu90;->b:I

    .line 511
    .line 512
    sub-int v5, v3, v5

    .line 513
    .line 514
    div-int/lit8 v25, v5, 0x2

    .line 515
    .line 516
    iget v5, v9, La/pu90;->b:I

    .line 517
    .line 518
    sub-int v5, v3, v5

    .line 519
    .line 520
    div-int/lit8 v28, v5, 0x2

    .line 521
    .line 522
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 523
    .line 524
    .line 525
    move-result v5

    .line 526
    move-object/from16 v30, v21

    .line 527
    .line 528
    check-cast v30, La/j00;

    .line 529
    .line 530
    move-object/from16 v23, v14

    .line 531
    .line 532
    new-instance v14, La/m180;

    .line 533
    .line 534
    iget-boolean v0, v0, La/n180;->b:Z

    .line 535
    .line 536
    move/from16 v32, v0

    .line 537
    .line 538
    move-object/from16 v29, v2

    .line 539
    .line 540
    move/from16 v20, v4

    .line 541
    .line 542
    move-object/from16 v26, v9

    .line 543
    .line 544
    move/from16 v24, v10

    .line 545
    .line 546
    move-object/from16 v21, v12

    .line 547
    .line 548
    move-object/from16 v18, v15

    .line 549
    .line 550
    move-object v15, v11

    .line 551
    invoke-direct/range {v14 .. v32}, La/m180;-><init>(La/pu90;IILa/pu90;IILa/pu90;ILa/pu90;IILa/pu90;IILa/pu90;La/j00;IZ)V

    .line 552
    .line 553
    .line 554
    invoke-static {v1, v5, v3, v14}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    return-object v0

    .line 559
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
