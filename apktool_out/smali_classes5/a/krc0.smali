.class public final synthetic La/krc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/d2j;


# direct methods
.method public synthetic constructor <init>(La/d2j;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/krc0;->a:B

    iput-object p1, p0, La/krc0;->b:La/d2j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/krc0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/krc0;->b:La/d2j;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p1

    .line 12
    .line 13
    check-cast v1, La/arc0;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v3, v1, La/arc0;->h:La/src0;

    .line 19
    .line 20
    iget v4, v1, La/arc0;->d:I

    .line 21
    .line 22
    iget v5, v1, La/arc0;->c:I

    .line 23
    .line 24
    iget v6, v1, La/arc0;->b:I

    .line 25
    .line 26
    iget-object v7, v1, La/arc0;->e:Ljava/lang/String;

    .line 27
    .line 28
    iget v8, v1, La/arc0;->f:I

    .line 29
    .line 30
    iget v9, v1, La/arc0;->g:I

    .line 31
    .line 32
    sget-object v10, La/src0;->f:La/src0;

    .line 33
    .line 34
    iget-object v0, v0, La/d2j;->b:La/ctf0;

    .line 35
    .line 36
    const/4 v11, 0x2

    .line 37
    if-ne v3, v10, :cond_0

    .line 38
    .line 39
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v12

    .line 43
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v13

    .line 47
    filled-new-array {v7, v12, v13}, [Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    iget-object v12, v0, La/ctf0;->b:La/lsm0;

    .line 52
    .line 53
    const/4 v13, 0x3

    .line 54
    invoke-static {v7, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    const v13, 0x7f13105f

    .line 59
    .line 60
    .line 61
    invoke-virtual {v12, v13, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    :goto_0
    move-object v13, v7

    .line 66
    goto :goto_1

    .line 67
    :cond_0
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v12

    .line 71
    filled-new-array {v7, v12}, [Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    iget-object v12, v0, La/ctf0;->b:La/lsm0;

    .line 76
    .line 77
    invoke-static {v7, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    const v13, 0x7f131065

    .line 82
    .line 83
    .line 84
    invoke-virtual {v12, v13, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    goto :goto_0

    .line 89
    :goto_1
    iget-object v14, v1, La/arc0;->a:Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eq v1, v11, :cond_2

    .line 96
    .line 97
    const/4 v7, 0x4

    .line 98
    if-eq v1, v7, :cond_1

    .line 99
    .line 100
    const v1, 0x7f131028

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_1
    const v1, 0x7f131029

    .line 105
    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_2
    const v1, 0x7f131034

    .line 109
    .line 110
    .line 111
    :goto_2
    new-array v7, v2, [Ljava/lang/Object;

    .line 112
    .line 113
    iget-object v11, v0, La/ctf0;->b:La/lsm0;

    .line 114
    .line 115
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 116
    .line 117
    invoke-static {v7, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    invoke-virtual {v11, v1, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v15

    .line 125
    if-eq v3, v10, :cond_4

    .line 126
    .line 127
    sget-object v1, La/src0;->d:La/src0;

    .line 128
    .line 129
    if-ne v3, v1, :cond_3

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_3
    move v1, v6

    .line 133
    goto :goto_4

    .line 134
    :cond_4
    :goto_3
    move v1, v5

    .line 135
    :goto_4
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v16

    .line 139
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    const/4 v7, 0x1

    .line 148
    invoke-static {v1, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    const v11, 0x7f131043

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, v11, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v17

    .line 159
    new-instance v18, La/wul;

    .line 160
    .line 161
    sget-object v19, La/iul;->e:La/iul;

    .line 162
    .line 163
    sget-object v20, La/oe9;->a:La/oe9;

    .line 164
    .line 165
    new-instance v1, La/ue9;

    .line 166
    .line 167
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 168
    .line 169
    .line 170
    move-result-object v11

    .line 171
    filled-new-array {v11}, [Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v11

    .line 175
    invoke-static {v11, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v11

    .line 179
    const v12, 0x7f13101e

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, v12, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v11

    .line 186
    invoke-direct {v1, v11}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    const/16 v23, 0x0

    .line 190
    .line 191
    const/16 v24, 0x0

    .line 192
    .line 193
    const/16 v22, 0x1

    .line 194
    .line 195
    move-object/from16 v21, v1

    .line 196
    .line 197
    invoke-direct/range {v18 .. v24}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 198
    .line 199
    .line 200
    new-instance v19, La/wul;

    .line 201
    .line 202
    sget-object v20, La/mul;->e:La/mul;

    .line 203
    .line 204
    sget-object v21, La/oe9;->c:La/oe9;

    .line 205
    .line 206
    new-instance v1, La/te9;

    .line 207
    .line 208
    const v11, 0x7f08098f

    .line 209
    .line 210
    .line 211
    invoke-direct {v1, v11}, La/te9;-><init>(I)V

    .line 212
    .line 213
    .line 214
    if-le v6, v8, :cond_5

    .line 215
    .line 216
    move/from16 v23, v7

    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_5
    move/from16 v23, v2

    .line 220
    .line 221
    :goto_5
    const/16 v24, 0x0

    .line 222
    .line 223
    const/16 v25, 0x0

    .line 224
    .line 225
    move-object/from16 v22, v1

    .line 226
    .line 227
    invoke-direct/range {v19 .. v25}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 228
    .line 229
    .line 230
    new-instance v1, La/wul;

    .line 231
    .line 232
    new-instance v11, La/te9;

    .line 233
    .line 234
    const v12, 0x7f0809b6

    .line 235
    .line 236
    .line 237
    invoke-direct {v11, v12}, La/te9;-><init>(I)V

    .line 238
    .line 239
    .line 240
    add-int/2addr v6, v8

    .line 241
    if-gt v6, v4, :cond_6

    .line 242
    .line 243
    move/from16 v24, v7

    .line 244
    .line 245
    goto :goto_6

    .line 246
    :cond_6
    move/from16 v24, v2

    .line 247
    .line 248
    :goto_6
    const/16 v25, 0x0

    .line 249
    .line 250
    const/16 v26, 0x0

    .line 251
    .line 252
    move-object/from16 v23, v11

    .line 253
    .line 254
    move-object/from16 v22, v21

    .line 255
    .line 256
    move-object/from16 v21, v20

    .line 257
    .line 258
    move-object/from16 v20, v1

    .line 259
    .line 260
    invoke-direct/range {v20 .. v26}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 261
    .line 262
    .line 263
    if-ne v3, v10, :cond_7

    .line 264
    .line 265
    mul-int/2addr v9, v5

    .line 266
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    invoke-static {v1, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    const v2, 0x7f131044

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    :goto_7
    move-object/from16 v21, v0

    .line 286
    .line 287
    goto :goto_8

    .line 288
    :cond_7
    const-string v0, ""

    .line 289
    .line 290
    goto :goto_7

    .line 291
    :goto_8
    new-instance v12, La/frc0;

    .line 292
    .line 293
    move-object/from16 v27, v20

    .line 294
    .line 295
    move-object/from16 v20, v19

    .line 296
    .line 297
    move-object/from16 v19, v27

    .line 298
    .line 299
    invoke-direct/range {v12 .. v21}, La/frc0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/wul;La/wul;La/wul;Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    return-object v12

    .line 303
    :pswitch_0
    move-object/from16 v1, p1

    .line 304
    .line 305
    check-cast v1, La/fee;

    .line 306
    .line 307
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    check-cast v1, Ljava/util/List;

    .line 315
    .line 316
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 317
    .line 318
    .line 319
    move-result v3

    .line 320
    const/high16 v4, 0x41000000    # 8.0f

    .line 321
    .line 322
    const/high16 v5, 0x41800000    # 16.0f

    .line 323
    .line 324
    if-nez v3, :cond_d

    .line 325
    .line 326
    new-instance v3, Ljava/util/ArrayList;

    .line 327
    .line 328
    const/16 v6, 0xa

    .line 329
    .line 330
    invoke-static {v1, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 331
    .line 332
    .line 333
    move-result v6

    .line 334
    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 335
    .line 336
    .line 337
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 342
    .line 343
    .line 344
    move-result v6

    .line 345
    if-eqz v6, :cond_c

    .line 346
    .line 347
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v6

    .line 351
    check-cast v6, La/vrc0;

    .line 352
    .line 353
    iget-object v7, v0, La/d2j;->b:La/ctf0;

    .line 354
    .line 355
    const/4 v8, 0x0

    .line 356
    if-eqz v6, :cond_b

    .line 357
    .line 358
    instance-of v9, v6, La/trc0;

    .line 359
    .line 360
    const v10, 0x7f130917

    .line 361
    .line 362
    .line 363
    if-eqz v9, :cond_9

    .line 364
    .line 365
    check-cast v6, La/trc0;

    .line 366
    .line 367
    iget-wide v12, v6, La/trc0;->a:J

    .line 368
    .line 369
    new-instance v9, La/n0x;

    .line 370
    .line 371
    iget-object v11, v6, La/trc0;->k:Ljava/lang/String;

    .line 372
    .line 373
    invoke-direct {v9, v11}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    iget-object v14, v6, La/trc0;->c:Ljava/lang/String;

    .line 377
    .line 378
    iget v6, v6, La/trc0;->h:I

    .line 379
    .line 380
    if-lez v6, :cond_8

    .line 381
    .line 382
    new-instance v8, La/tda;

    .line 383
    .line 384
    new-instance v11, La/rpe;

    .line 385
    .line 386
    invoke-direct {v11, v6}, La/rpe;-><init>(I)V

    .line 387
    .line 388
    .line 389
    new-array v6, v2, [Ljava/lang/Object;

    .line 390
    .line 391
    iget-object v7, v7, La/ctf0;->b:La/lsm0;

    .line 392
    .line 393
    invoke-static {v6, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v6

    .line 397
    invoke-virtual {v7, v10, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v6

    .line 401
    invoke-direct {v8, v11, v6}, La/tda;-><init>(La/rpe;Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    :cond_8
    move-object v15, v8

    .line 405
    new-instance v11, La/auc0;

    .line 406
    .line 407
    const/16 v16, 0x0

    .line 408
    .line 409
    move-object/from16 v17, v9

    .line 410
    .line 411
    invoke-direct/range {v11 .. v17}, La/auc0;-><init>(JLjava/lang/String;La/tda;Ljava/lang/Integer;La/o0x;)V

    .line 412
    .line 413
    .line 414
    goto :goto_a

    .line 415
    :cond_9
    instance-of v9, v6, La/urc0;

    .line 416
    .line 417
    if-eqz v9, :cond_b

    .line 418
    .line 419
    check-cast v6, La/urc0;

    .line 420
    .line 421
    iget-wide v12, v6, La/urc0;->a:J

    .line 422
    .line 423
    iget-object v9, v6, La/urc0;->l:La/hds;

    .line 424
    .line 425
    iget-object v14, v6, La/urc0;->c:Ljava/lang/String;

    .line 426
    .line 427
    iget v6, v6, La/urc0;->h:I

    .line 428
    .line 429
    if-lez v6, :cond_a

    .line 430
    .line 431
    new-instance v8, La/tda;

    .line 432
    .line 433
    new-instance v11, La/rpe;

    .line 434
    .line 435
    invoke-direct {v11, v6}, La/rpe;-><init>(I)V

    .line 436
    .line 437
    .line 438
    new-array v6, v2, [Ljava/lang/Object;

    .line 439
    .line 440
    iget-object v7, v7, La/ctf0;->b:La/lsm0;

    .line 441
    .line 442
    invoke-static {v6, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v6

    .line 446
    invoke-virtual {v7, v10, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v6

    .line 450
    invoke-direct {v8, v11, v6}, La/tda;-><init>(La/rpe;Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    :cond_a
    move-object v15, v8

    .line 454
    new-instance v11, La/buc0;

    .line 455
    .line 456
    const/16 v16, 0x0

    .line 457
    .line 458
    move-object/from16 v17, v9

    .line 459
    .line 460
    invoke-direct/range {v11 .. v17}, La/buc0;-><init>(JLjava/lang/String;La/tda;Ljava/lang/Integer;La/hds;)V

    .line 461
    .line 462
    .line 463
    :goto_a
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    goto :goto_9

    .line 467
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 468
    .line 469
    .line 470
    goto :goto_b

    .line 471
    :cond_c
    invoke-static {v3}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    sget-object v1, La/guc0;->b:La/guc0;

    .line 476
    .line 477
    sget-object v2, La/qmk;->a:La/zcl;

    .line 478
    .line 479
    new-instance v2, La/lh80;

    .line 480
    .line 481
    invoke-direct {v2, v5, v4, v5, v5}, La/lh80;-><init>(FFFF)V

    .line 482
    .line 483
    .line 484
    new-instance v8, La/luc0;

    .line 485
    .line 486
    invoke-direct {v8, v0, v1, v2}, La/luc0;-><init>(La/a4x;La/guc0;La/lh80;)V

    .line 487
    .line 488
    .line 489
    goto :goto_b

    .line 490
    :cond_d
    new-instance v8, La/muc0;

    .line 491
    .line 492
    sget-object v0, La/guc0;->b:La/guc0;

    .line 493
    .line 494
    sget-object v1, La/qmk;->a:La/zcl;

    .line 495
    .line 496
    new-instance v1, La/lh80;

    .line 497
    .line 498
    invoke-direct {v1, v5, v4, v5, v5}, La/lh80;-><init>(FFFF)V

    .line 499
    .line 500
    .line 501
    invoke-direct {v8, v0, v1}, La/muc0;-><init>(La/guc0;La/lh80;)V

    .line 502
    .line 503
    .line 504
    :goto_b
    return-object v8

    .line 505
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
