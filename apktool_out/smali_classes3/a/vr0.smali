.class public final synthetic La/vr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wr0;


# direct methods
.method public synthetic constructor <init>(La/wr0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/vr0;->a:B

    iput-object p1, p0, La/vr0;->b:La/wr0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/vr0;->a:B

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x3

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x6

    .line 11
    const/4 v7, 0x1

    .line 12
    const/4 v8, 0x0

    .line 13
    const/4 v9, 0x0

    .line 14
    iget-object v0, v0, La/vr0;->b:La/wr0;

    .line 15
    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    move-object/from16 v1, p1

    .line 20
    .line 21
    check-cast v1, La/y5d0;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    instance-of v2, v1, La/u5d0;

    .line 27
    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    check-cast v1, La/u5d0;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v1, v9

    .line 34
    :goto_0
    if-eqz v1, :cond_1

    .line 35
    .line 36
    iget-object v1, v1, La/u5d0;->a:La/x2q;

    .line 37
    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    iget-object v1, v1, La/x2q;->d:Ljava/util/List;

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move-object v1, v9

    .line 44
    :goto_1
    if-nez v1, :cond_2

    .line 45
    .line 46
    sget-object v1, La/iun;->a:La/iun;

    .line 47
    .line 48
    :cond_2
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-static {v1, v6}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    if-eqz v8, :cond_3

    .line 65
    .line 66
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    check-cast v8, La/l3q;

    .line 71
    .line 72
    new-instance v10, La/lxl;

    .line 73
    .line 74
    invoke-interface {v8}, La/l3q;->getId()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v11

    .line 78
    invoke-static {v11}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 79
    .line 80
    .line 81
    move-result-wide v11

    .line 82
    new-instance v13, La/byl;

    .line 83
    .line 84
    invoke-interface {v8}, La/l3q;->getName()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v14

    .line 88
    new-instance v15, La/m0x;

    .line 89
    .line 90
    const v8, 0x7f080800

    .line 91
    .line 92
    .line 93
    invoke-direct {v15, v8, v9, v6}, La/m0x;-><init>(ILa/bzw;I)V

    .line 94
    .line 95
    .line 96
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v16

    .line 100
    sget-object v17, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 101
    .line 102
    const/16 v18, 0x4

    .line 103
    .line 104
    invoke-direct/range {v13 .. v18}, La/byl;-><init>(Ljava/lang/String;La/m0x;Ljava/lang/Integer;Ljava/lang/Boolean;I)V

    .line 105
    .line 106
    .line 107
    sget-object v15, La/uxl;->b:La/uxl;

    .line 108
    .line 109
    const/16 v16, 0x0

    .line 110
    .line 111
    const/16 v17, 0x68

    .line 112
    .line 113
    const/4 v14, 0x0

    .line 114
    invoke-direct/range {v10 .. v17}, La/lxl;-><init>(JLa/dyl;ZLa/uxl;La/cwl;I)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v10}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_3
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    if-le v3, v6, :cond_4

    .line 126
    .line 127
    new-instance v8, La/lxl;

    .line 128
    .line 129
    new-instance v11, La/xxl;

    .line 130
    .line 131
    iget-object v0, v0, La/wr0;->b:La/ctf0;

    .line 132
    .line 133
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    sub-int/2addr v1, v6

    .line 138
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 147
    .line 148
    invoke-static {v1, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    const v3, 0x7f130fb7

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-direct {v11, v0}, La/xxl;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    sget-object v13, La/uxl;->b:La/uxl;

    .line 163
    .line 164
    const/4 v14, 0x0

    .line 165
    const/16 v15, 0x68

    .line 166
    .line 167
    const-wide/16 v9, -0x1

    .line 168
    .line 169
    const/4 v12, 0x0

    .line 170
    invoke-direct/range {v8 .. v15}, La/lxl;-><init>(JLa/dyl;ZLa/uxl;La/cwl;I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v8}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    :cond_4
    invoke-static {v2}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    invoke-static {v5, v5, v4}, La/s5x0;->t(FFI)La/lh80;

    .line 185
    .line 186
    .line 187
    move-result-object v10

    .line 188
    sget-object v8, La/tyl;->a:La/tyl;

    .line 189
    .line 190
    sget-object v9, La/syl;->b:La/syl;

    .line 191
    .line 192
    new-instance v6, La/fyl;

    .line 193
    .line 194
    const/4 v11, 0x0

    .line 195
    const/16 v12, 0x10

    .line 196
    .line 197
    invoke-direct/range {v6 .. v12}, La/fyl;-><init>(La/a4x;La/tyl;La/syl;La/hh80;La/jyl;I)V

    .line 198
    .line 199
    .line 200
    return-object v6

    .line 201
    :pswitch_0
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 202
    .line 203
    move-object/from16 v1, p1

    .line 204
    .line 205
    check-cast v1, La/y5d0;

    .line 206
    .line 207
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    instance-of v2, v1, La/u5d0;

    .line 211
    .line 212
    if-eqz v2, :cond_5

    .line 213
    .line 214
    check-cast v1, La/u5d0;

    .line 215
    .line 216
    goto :goto_3

    .line 217
    :cond_5
    move-object v1, v9

    .line 218
    :goto_3
    if-eqz v1, :cond_f

    .line 219
    .line 220
    iget-object v1, v1, La/u5d0;->a:La/x2q;

    .line 221
    .line 222
    if-eqz v1, :cond_f

    .line 223
    .line 224
    iget-object v1, v1, La/x2q;->d:Ljava/util/List;

    .line 225
    .line 226
    if-eqz v1, :cond_f

    .line 227
    .line 228
    invoke-virtual {v0}, La/wr0;->c()La/fee;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    check-cast v2, La/ep0;

    .line 237
    .line 238
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 239
    .line 240
    .line 241
    move-result v2

    .line 242
    if-eqz v2, :cond_8

    .line 243
    .line 244
    if-eq v2, v7, :cond_7

    .line 245
    .line 246
    if-ne v2, v3, :cond_6

    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 250
    .line 251
    .line 252
    goto/16 :goto_9

    .line 253
    .line 254
    :cond_7
    new-instance v2, La/fvi0;

    .line 255
    .line 256
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    iget-object v4, v4, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 261
    .line 262
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 263
    .line 264
    .line 265
    move-result-wide v4

    .line 266
    new-instance v6, La/y3d;

    .line 267
    .line 268
    invoke-direct {v6, v4, v5}, La/y3d;-><init>(J)V

    .line 269
    .line 270
    .line 271
    invoke-direct {v2, v6}, La/fvi0;-><init>(La/y3d;)V

    .line 272
    .line 273
    .line 274
    :goto_4
    move-object v15, v2

    .line 275
    goto :goto_6

    .line 276
    :cond_8
    :goto_5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 277
    .line 278
    .line 279
    move-result v2

    .line 280
    if-gt v2, v6, :cond_9

    .line 281
    .line 282
    new-instance v2, La/fvi0;

    .line 283
    .line 284
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 285
    .line 286
    .line 287
    move-result-object v4

    .line 288
    iget-object v4, v4, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 289
    .line 290
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 291
    .line 292
    .line 293
    move-result-wide v4

    .line 294
    new-instance v6, La/y3d;

    .line 295
    .line 296
    invoke-direct {v6, v4, v5}, La/y3d;-><init>(J)V

    .line 297
    .line 298
    .line 299
    invoke-direct {v2, v6}, La/fvi0;-><init>(La/y3d;)V

    .line 300
    .line 301
    .line 302
    goto :goto_4

    .line 303
    :cond_9
    new-instance v2, La/kpe;

    .line 304
    .line 305
    invoke-direct {v2}, La/kpe;-><init>()V

    .line 306
    .line 307
    .line 308
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 309
    .line 310
    .line 311
    move-result-object v4

    .line 312
    iget-object v4, v4, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 313
    .line 314
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 315
    .line 316
    .line 317
    move-result-wide v4

    .line 318
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 319
    .line 320
    .line 321
    move-result v6

    .line 322
    new-instance v10, La/gvi0;

    .line 323
    .line 324
    new-instance v11, La/y3d;

    .line 325
    .line 326
    invoke-direct {v11, v4, v5}, La/y3d;-><init>(J)V

    .line 327
    .line 328
    .line 329
    invoke-direct {v10, v2, v6, v11}, La/gvi0;-><init>(La/kpe;ILa/y3d;)V

    .line 330
    .line 331
    .line 332
    move-object v15, v10

    .line 333
    :goto_6
    invoke-virtual {v0}, La/wr0;->c()La/fee;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    check-cast v2, La/ep0;

    .line 342
    .line 343
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 344
    .line 345
    .line 346
    move-result v2

    .line 347
    if-eqz v2, :cond_d

    .line 348
    .line 349
    if-eq v2, v7, :cond_c

    .line 350
    .line 351
    if-ne v2, v3, :cond_b

    .line 352
    .line 353
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 354
    .line 355
    .line 356
    move-result v1

    .line 357
    if-nez v1, :cond_a

    .line 358
    .line 359
    sget-object v1, La/d4d;->z:La/d4d;

    .line 360
    .line 361
    :goto_7
    move-object/from16 v16, v1

    .line 362
    .line 363
    goto :goto_8

    .line 364
    :cond_a
    sget-object v1, La/d4d;->B:La/d4d;

    .line 365
    .line 366
    goto :goto_7

    .line 367
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 368
    .line 369
    .line 370
    goto :goto_9

    .line 371
    :cond_c
    sget-object v1, La/d4d;->z:La/d4d;

    .line 372
    .line 373
    goto :goto_7

    .line 374
    :cond_d
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 375
    .line 376
    .line 377
    move-result v1

    .line 378
    if-gt v7, v1, :cond_e

    .line 379
    .line 380
    const/4 v2, 0x7

    .line 381
    if-ge v1, v2, :cond_e

    .line 382
    .line 383
    sget-object v1, La/d4d;->z:La/d4d;

    .line 384
    .line 385
    goto :goto_7

    .line 386
    :cond_e
    sget-object v1, La/d4d;->B:La/d4d;

    .line 387
    .line 388
    goto :goto_7

    .line 389
    :goto_8
    new-instance v12, La/rqm;

    .line 390
    .line 391
    new-instance v13, La/tui0;

    .line 392
    .line 393
    iget-object v0, v0, La/wr0;->b:La/ctf0;

    .line 394
    .line 395
    new-array v1, v8, [Ljava/lang/Object;

    .line 396
    .line 397
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 398
    .line 399
    invoke-static {v1, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    const v2, 0x7f130455

    .line 404
    .line 405
    .line 406
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 415
    .line 416
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 417
    .line 418
    .line 419
    move-result-wide v1

    .line 420
    new-instance v3, La/y3d;

    .line 421
    .line 422
    invoke-direct {v3, v1, v2}, La/y3d;-><init>(J)V

    .line 423
    .line 424
    .line 425
    invoke-direct {v13, v0, v3}, La/tui0;-><init>(Ljava/lang/String;La/y3d;)V

    .line 426
    .line 427
    .line 428
    const/16 v20, 0x0

    .line 429
    .line 430
    const/16 v21, 0x1ea

    .line 431
    .line 432
    const/4 v14, 0x0

    .line 433
    const/16 v17, 0x0

    .line 434
    .line 435
    const/16 v18, 0x0

    .line 436
    .line 437
    const/16 v19, 0x0

    .line 438
    .line 439
    invoke-direct/range {v12 .. v21}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 440
    .line 441
    .line 442
    move-object v9, v12

    .line 443
    :cond_f
    :goto_9
    return-object v9

    .line 444
    :pswitch_1
    move-object/from16 v1, p1

    .line 445
    .line 446
    check-cast v1, La/rlk0;

    .line 447
    .line 448
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    instance-of v2, v1, La/nlk0;

    .line 452
    .line 453
    if-eqz v2, :cond_10

    .line 454
    .line 455
    check-cast v1, La/nlk0;

    .line 456
    .line 457
    goto :goto_a

    .line 458
    :cond_10
    move-object v1, v9

    .line 459
    :goto_a
    if-eqz v1, :cond_15

    .line 460
    .line 461
    iget-object v1, v1, La/nlk0;->b:Lorg/xplatform/aggregator/impl/category/data/models/AggregatorSortingOptionModel;

    .line 462
    .line 463
    if-nez v1, :cond_11

    .line 464
    .line 465
    goto :goto_d

    .line 466
    :cond_11
    invoke-virtual {v0}, La/wr0;->c()La/fee;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    check-cast v0, La/ep0;

    .line 475
    .line 476
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 477
    .line 478
    .line 479
    move-result v0

    .line 480
    if-eqz v0, :cond_14

    .line 481
    .line 482
    if-eq v0, v7, :cond_13

    .line 483
    .line 484
    if-ne v0, v3, :cond_12

    .line 485
    .line 486
    sget-object v0, La/d4d;->B:La/d4d;

    .line 487
    .line 488
    :goto_b
    move-object v6, v0

    .line 489
    goto :goto_c

    .line 490
    :cond_12
    invoke-static {}, La/t9f;->b()V

    .line 491
    .line 492
    .line 493
    goto :goto_d

    .line 494
    :cond_13
    sget-object v0, La/d4d;->z:La/d4d;

    .line 495
    .line 496
    goto :goto_b

    .line 497
    :cond_14
    sget-object v0, La/d4d;->B:La/d4d;

    .line 498
    .line 499
    goto :goto_b

    .line 500
    :goto_c
    new-instance v2, La/rqm;

    .line 501
    .line 502
    new-instance v3, La/tui0;

    .line 503
    .line 504
    iget-object v0, v1, Lorg/xplatform/aggregator/impl/category/data/models/AggregatorSortingOptionModel;->a:Ljava/lang/String;

    .line 505
    .line 506
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 507
    .line 508
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 509
    .line 510
    .line 511
    move-result-object v1

    .line 512
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 513
    .line 514
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 515
    .line 516
    .line 517
    move-result-wide v4

    .line 518
    new-instance v1, La/y3d;

    .line 519
    .line 520
    invoke-direct {v1, v4, v5}, La/y3d;-><init>(J)V

    .line 521
    .line 522
    .line 523
    invoke-direct {v3, v0, v1}, La/tui0;-><init>(Ljava/lang/String;La/y3d;)V

    .line 524
    .line 525
    .line 526
    new-instance v5, La/fvi0;

    .line 527
    .line 528
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 533
    .line 534
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 535
    .line 536
    .line 537
    move-result-wide v0

    .line 538
    new-instance v4, La/y3d;

    .line 539
    .line 540
    invoke-direct {v4, v0, v1}, La/y3d;-><init>(J)V

    .line 541
    .line 542
    .line 543
    invoke-direct {v5, v4}, La/fvi0;-><init>(La/y3d;)V

    .line 544
    .line 545
    .line 546
    const/4 v10, 0x0

    .line 547
    const/16 v11, 0x1ea

    .line 548
    .line 549
    const/4 v4, 0x0

    .line 550
    const/4 v7, 0x0

    .line 551
    const/4 v8, 0x0

    .line 552
    const/4 v9, 0x0

    .line 553
    invoke-direct/range {v2 .. v11}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 554
    .line 555
    .line 556
    move-object v9, v2

    .line 557
    :cond_15
    :goto_d
    return-object v9

    .line 558
    :pswitch_2
    move-object/from16 v1, p1

    .line 559
    .line 560
    check-cast v1, La/ep0;

    .line 561
    .line 562
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 563
    .line 564
    .line 565
    iget-object v0, v0, La/wr0;->b:La/ctf0;

    .line 566
    .line 567
    new-array v2, v8, [Ljava/lang/Object;

    .line 568
    .line 569
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 570
    .line 571
    invoke-static {v2, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v2

    .line 575
    const v3, 0x7f131322

    .line 576
    .line 577
    .line 578
    invoke-virtual {v0, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    invoke-static {v1, v0}, La/wr0;->a(La/ep0;Ljava/lang/String;)La/hjm;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    return-object v0

    .line 587
    :pswitch_3
    move-object/from16 v1, p1

    .line 588
    .line 589
    check-cast v1, La/ep0;

    .line 590
    .line 591
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 592
    .line 593
    .line 594
    iget-object v0, v0, La/wr0;->b:La/ctf0;

    .line 595
    .line 596
    new-array v2, v8, [Ljava/lang/Object;

    .line 597
    .line 598
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 599
    .line 600
    invoke-static {v2, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 601
    .line 602
    .line 603
    move-result-object v2

    .line 604
    const v3, 0x7f131070

    .line 605
    .line 606
    .line 607
    invoke-virtual {v0, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    invoke-static {v1, v0}, La/wr0;->a(La/ep0;Ljava/lang/String;)La/hjm;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    return-object v0

    .line 616
    :pswitch_4
    move-object/from16 v1, p1

    .line 617
    .line 618
    check-cast v1, La/uaq0;

    .line 619
    .line 620
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 621
    .line 622
    .line 623
    new-instance v9, La/imm;

    .line 624
    .line 625
    new-instance v10, La/ilm;

    .line 626
    .line 627
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 628
    .line 629
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 630
    .line 631
    .line 632
    move-result-object v1

    .line 633
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 634
    .line 635
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 636
    .line 637
    .line 638
    move-result-wide v1

    .line 639
    invoke-direct {v10, v1, v2}, La/ilm;-><init>(J)V

    .line 640
    .line 641
    .line 642
    new-instance v11, La/plm;

    .line 643
    .line 644
    iget-object v0, v0, La/wr0;->b:La/ctf0;

    .line 645
    .line 646
    new-array v1, v8, [Ljava/lang/Object;

    .line 647
    .line 648
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 649
    .line 650
    invoke-static {v1, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    move-result-object v1

    .line 654
    const v2, 0x7f13089a

    .line 655
    .line 656
    .line 657
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 662
    .line 663
    .line 664
    move-result-object v1

    .line 665
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 666
    .line 667
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 668
    .line 669
    .line 670
    move-result-wide v1

    .line 671
    sget-object v3, La/fa50;->a:La/fa50;

    .line 672
    .line 673
    invoke-direct {v11, v0, v1, v2, v3}, La/plm;-><init>(Ljava/lang/String;JLa/ga50;)V

    .line 674
    .line 675
    .line 676
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 677
    .line 678
    .line 679
    move-result-object v0

    .line 680
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 681
    .line 682
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 683
    .line 684
    .line 685
    move-result-wide v13

    .line 686
    const/4 v15, 0x1

    .line 687
    const/16 v16, 0x0

    .line 688
    .line 689
    sget-object v12, La/fmm;->a:La/fmm;

    .line 690
    .line 691
    invoke-direct/range {v9 .. v16}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 692
    .line 693
    .line 694
    return-object v9

    .line 695
    :pswitch_5
    move-object/from16 v1, p1

    .line 696
    .line 697
    check-cast v1, La/v5q;

    .line 698
    .line 699
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 700
    .line 701
    .line 702
    instance-of v3, v1, La/r5q;

    .line 703
    .line 704
    if-eqz v3, :cond_16

    .line 705
    .line 706
    check-cast v1, La/r5q;

    .line 707
    .line 708
    goto :goto_e

    .line 709
    :cond_16
    move-object v1, v9

    .line 710
    :goto_e
    if-eqz v1, :cond_17

    .line 711
    .line 712
    iget-object v9, v1, La/r5q;->a:La/a4x;

    .line 713
    .line 714
    :cond_17
    if-nez v9, :cond_18

    .line 715
    .line 716
    sget-object v9, La/iun;->a:La/iun;

    .line 717
    .line 718
    :cond_18
    new-instance v1, Ljava/util/ArrayList;

    .line 719
    .line 720
    invoke-static {v9, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 721
    .line 722
    .line 723
    move-result v3

    .line 724
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 725
    .line 726
    .line 727
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 728
    .line 729
    .line 730
    move-result-object v3

    .line 731
    :goto_f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 732
    .line 733
    .line 734
    move-result v6

    .line 735
    if-eqz v6, :cond_21

    .line 736
    .line 737
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    move-result-object v6

    .line 741
    check-cast v6, La/j4b;

    .line 742
    .line 743
    invoke-virtual {v0}, La/wr0;->c()La/fee;

    .line 744
    .line 745
    .line 746
    move-result-object v9

    .line 747
    invoke-virtual {v9}, La/fee;->c()Ljava/lang/Object;

    .line 748
    .line 749
    .line 750
    move-result-object v9

    .line 751
    sget-object v10, La/ep0;->b:La/ep0;

    .line 752
    .line 753
    if-eq v9, v10, :cond_19

    .line 754
    .line 755
    iget-object v9, v6, La/j4b;->a:La/x2q;

    .line 756
    .line 757
    iget-object v9, v9, La/x2q;->a:Ljava/lang/String;

    .line 758
    .line 759
    const-string v10, "dopInfo2"

    .line 760
    .line 761
    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 762
    .line 763
    .line 764
    move-result v9

    .line 765
    if-eqz v9, :cond_19

    .line 766
    .line 767
    move v9, v7

    .line 768
    goto :goto_10

    .line 769
    :cond_19
    move v9, v8

    .line 770
    :goto_10
    invoke-virtual {v0}, La/wr0;->c()La/fee;

    .line 771
    .line 772
    .line 773
    move-result-object v10

    .line 774
    invoke-virtual {v10}, La/fee;->c()Ljava/lang/Object;

    .line 775
    .line 776
    .line 777
    move-result-object v10

    .line 778
    check-cast v10, La/ep0;

    .line 779
    .line 780
    iget-object v11, v6, La/j4b;->a:La/x2q;

    .line 781
    .line 782
    iget-object v12, v11, La/x2q;->b:Ljava/lang/String;

    .line 783
    .line 784
    invoke-static {v10, v12}, La/wr0;->a(La/ep0;Ljava/lang/String;)La/hjm;

    .line 785
    .line 786
    .line 787
    move-result-object v10

    .line 788
    iget-object v12, v11, La/x2q;->d:Ljava/util/List;

    .line 789
    .line 790
    new-instance v13, Ljava/util/ArrayList;

    .line 791
    .line 792
    invoke-static {v12, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 793
    .line 794
    .line 795
    move-result v14

    .line 796
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 797
    .line 798
    .line 799
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 800
    .line 801
    .line 802
    move-result-object v12

    .line 803
    :goto_11
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 804
    .line 805
    .line 806
    move-result v14

    .line 807
    if-eqz v14, :cond_20

    .line 808
    .line 809
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 810
    .line 811
    .line 812
    move-result-object v14

    .line 813
    check-cast v14, La/l3q;

    .line 814
    .line 815
    if-eqz v9, :cond_1e

    .line 816
    .line 817
    invoke-interface {v14}, La/l3q;->getName()Ljava/lang/String;

    .line 818
    .line 819
    .line 820
    move-result-object v16

    .line 821
    invoke-interface {v14}, La/l3q;->getId()Ljava/lang/String;

    .line 822
    .line 823
    .line 824
    move-result-object v15

    .line 825
    new-instance v2, Ljava/lang/StringBuilder;

    .line 826
    .line 827
    sget-object v4, La/ujn;->h:Ljava/lang/String;

    .line 828
    .line 829
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 830
    .line 831
    .line 832
    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 833
    .line 834
    filled-new-array {v15}, [Ljava/lang/Object;

    .line 835
    .line 836
    .line 837
    move-result-object v15

    .line 838
    invoke-static {v15, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 839
    .line 840
    .line 841
    move-result-object v15

    .line 842
    const-string v5, "/static/img/android/casino/alt_design/filter_screen_style/%s.svg"

    .line 843
    .line 844
    invoke-static {v4, v5, v15}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 845
    .line 846
    .line 847
    move-result-object v4

    .line 848
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 849
    .line 850
    .line 851
    move-result v5

    .line 852
    if-nez v5, :cond_1a

    .line 853
    .line 854
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 855
    .line 856
    .line 857
    goto :goto_13

    .line 858
    :cond_1a
    sget-object v5, La/ujn;->h:Ljava/lang/String;

    .line 859
    .line 860
    invoke-static {v4, v5, v8}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 861
    .line 862
    .line 863
    move-result v5

    .line 864
    if-nez v5, :cond_1d

    .line 865
    .line 866
    const-string v5, "https://"

    .line 867
    .line 868
    invoke-static {v4, v5, v8}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 869
    .line 870
    .line 871
    move-result v5

    .line 872
    if-eqz v5, :cond_1b

    .line 873
    .line 874
    goto :goto_12

    .line 875
    :cond_1b
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    .line 876
    .line 877
    .line 878
    move-result v5

    .line 879
    const/16 v15, 0x2f

    .line 880
    .line 881
    if-lez v5, :cond_1c

    .line 882
    .line 883
    const-string v5, "/"

    .line 884
    .line 885
    invoke-static {v2, v5}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 886
    .line 887
    .line 888
    move-result v5

    .line 889
    if-nez v5, :cond_1c

    .line 890
    .line 891
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 892
    .line 893
    .line 894
    :cond_1c
    new-array v5, v7, [C

    .line 895
    .line 896
    aput-char v15, v5, v8

    .line 897
    .line 898
    invoke-static {v4, v5}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 899
    .line 900
    .line 901
    move-result-object v4

    .line 902
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 903
    .line 904
    .line 905
    goto :goto_13

    .line 906
    :cond_1d
    :goto_12
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 907
    .line 908
    .line 909
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 910
    .line 911
    .line 912
    :goto_13
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 913
    .line 914
    .line 915
    move-result-object v2

    .line 916
    new-instance v4, La/n0x;

    .line 917
    .line 918
    invoke-direct {v4, v2}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 919
    .line 920
    .line 921
    sget-object v2, La/qmk;->a:La/zcl;

    .line 922
    .line 923
    new-instance v15, La/ayl;

    .line 924
    .line 925
    const v2, 0x7f08080a

    .line 926
    .line 927
    .line 928
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 929
    .line 930
    .line 931
    move-result-object v19

    .line 932
    sget-object v20, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 933
    .line 934
    const/high16 v18, 0x41200000    # 10.0f

    .line 935
    .line 936
    move-object/from16 v17, v4

    .line 937
    .line 938
    invoke-direct/range {v15 .. v20}, La/ayl;-><init>(Ljava/lang/String;La/o0x;FLjava/lang/Integer;Ljava/lang/Boolean;)V

    .line 939
    .line 940
    .line 941
    :goto_14
    move-object/from16 v25, v15

    .line 942
    .line 943
    goto :goto_15

    .line 944
    :cond_1e
    new-instance v15, La/xxl;

    .line 945
    .line 946
    invoke-interface {v14}, La/l3q;->getName()Ljava/lang/String;

    .line 947
    .line 948
    .line 949
    move-result-object v2

    .line 950
    invoke-direct {v15, v2}, La/xxl;-><init>(Ljava/lang/String;)V

    .line 951
    .line 952
    .line 953
    goto :goto_14

    .line 954
    :goto_15
    new-instance v22, La/lxl;

    .line 955
    .line 956
    invoke-interface {v14}, La/l3q;->getId()Ljava/lang/String;

    .line 957
    .line 958
    .line 959
    move-result-object v2

    .line 960
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 961
    .line 962
    .line 963
    move-result-wide v23

    .line 964
    iget-object v2, v6, La/j4b;->b:Ljava/util/Set;

    .line 965
    .line 966
    invoke-interface {v14}, La/l3q;->getId()Ljava/lang/String;

    .line 967
    .line 968
    .line 969
    move-result-object v4

    .line 970
    invoke-interface {v2, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 971
    .line 972
    .line 973
    move-result v2

    .line 974
    if-eqz v2, :cond_1f

    .line 975
    .line 976
    sget-object v2, La/uxl;->b:La/uxl;

    .line 977
    .line 978
    :goto_16
    move-object/from16 v27, v2

    .line 979
    .line 980
    goto :goto_17

    .line 981
    :cond_1f
    sget-object v2, La/uxl;->a:La/uxl;

    .line 982
    .line 983
    goto :goto_16

    .line 984
    :goto_17
    const/16 v28, 0x0

    .line 985
    .line 986
    const/16 v29, 0x68

    .line 987
    .line 988
    const/16 v26, 0x0

    .line 989
    .line 990
    invoke-direct/range {v22 .. v29}, La/lxl;-><init>(JLa/dyl;ZLa/uxl;La/cwl;I)V

    .line 991
    .line 992
    .line 993
    move-object/from16 v2, v22

    .line 994
    .line 995
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 996
    .line 997
    .line 998
    const/16 v2, 0xa

    .line 999
    .line 1000
    const/4 v4, 0x3

    .line 1001
    const/4 v5, 0x0

    .line 1002
    goto/16 :goto_11

    .line 1003
    .line 1004
    :cond_20
    invoke-static {v13}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v15

    .line 1008
    const/4 v2, 0x3

    .line 1009
    const/4 v4, 0x0

    .line 1010
    invoke-static {v4, v4, v2}, La/s5x0;->t(FFI)La/lh80;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v18

    .line 1014
    sget-object v16, La/tyl;->b:La/tyl;

    .line 1015
    .line 1016
    sget-object v17, La/syl;->b:La/syl;

    .line 1017
    .line 1018
    new-instance v14, La/fyl;

    .line 1019
    .line 1020
    const/16 v19, 0x0

    .line 1021
    .line 1022
    const/16 v20, 0x10

    .line 1023
    .line 1024
    invoke-direct/range {v14 .. v20}, La/fyl;-><init>(La/a4x;La/tyl;La/syl;La/hh80;La/jyl;I)V

    .line 1025
    .line 1026
    .line 1027
    new-instance v5, La/ro0;

    .line 1028
    .line 1029
    iget-object v6, v11, La/x2q;->a:Ljava/lang/String;

    .line 1030
    .line 1031
    invoke-direct {v5, v6, v10, v14}, La/ro0;-><init>(Ljava/lang/String;La/hjm;La/fyl;)V

    .line 1032
    .line 1033
    .line 1034
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1035
    .line 1036
    .line 1037
    move v5, v4

    .line 1038
    move v4, v2

    .line 1039
    const/16 v2, 0xa

    .line 1040
    .line 1041
    goto/16 :goto_f

    .line 1042
    .line 1043
    :cond_21
    return-object v1

    .line 1044
    :pswitch_6
    move-object/from16 v1, p1

    .line 1045
    .line 1046
    check-cast v1, La/y5d0;

    .line 1047
    .line 1048
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1049
    .line 1050
    .line 1051
    instance-of v2, v1, La/u5d0;

    .line 1052
    .line 1053
    if-eqz v2, :cond_22

    .line 1054
    .line 1055
    check-cast v1, La/u5d0;

    .line 1056
    .line 1057
    goto :goto_18

    .line 1058
    :cond_22
    move-object v1, v9

    .line 1059
    :goto_18
    if-eqz v1, :cond_23

    .line 1060
    .line 1061
    iget-object v1, v1, La/u5d0;->a:La/x2q;

    .line 1062
    .line 1063
    if-eqz v1, :cond_23

    .line 1064
    .line 1065
    iget-object v9, v1, La/x2q;->d:Ljava/util/List;

    .line 1066
    .line 1067
    :cond_23
    if-nez v9, :cond_24

    .line 1068
    .line 1069
    sget-object v9, La/iun;->a:La/iun;

    .line 1070
    .line 1071
    :cond_24
    invoke-static {v9, v6}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v1

    .line 1075
    new-instance v2, Ljava/util/ArrayList;

    .line 1076
    .line 1077
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1078
    .line 1079
    .line 1080
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v1

    .line 1084
    :cond_25
    :goto_19
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1085
    .line 1086
    .line 1087
    move-result v3

    .line 1088
    if-eqz v3, :cond_26

    .line 1089
    .line 1090
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v3

    .line 1094
    instance-of v4, v3, La/s5d0;

    .line 1095
    .line 1096
    if-eqz v4, :cond_25

    .line 1097
    .line 1098
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1099
    .line 1100
    .line 1101
    goto :goto_19

    .line 1102
    :cond_26
    new-instance v1, Ljava/util/ArrayList;

    .line 1103
    .line 1104
    const/16 v3, 0xa

    .line 1105
    .line 1106
    invoke-static {v2, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1107
    .line 1108
    .line 1109
    move-result v3

    .line 1110
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1111
    .line 1112
    .line 1113
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v2

    .line 1117
    :goto_1a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1118
    .line 1119
    .line 1120
    move-result v3

    .line 1121
    if-eqz v3, :cond_27

    .line 1122
    .line 1123
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v3

    .line 1127
    check-cast v3, La/s5d0;

    .line 1128
    .line 1129
    new-instance v4, La/r5d0;

    .line 1130
    .line 1131
    iget-object v5, v3, La/s5d0;->a:Ljava/lang/String;

    .line 1132
    .line 1133
    new-instance v6, La/n0x;

    .line 1134
    .line 1135
    iget-object v3, v3, La/s5d0;->c:Ljava/lang/String;

    .line 1136
    .line 1137
    invoke-direct {v6, v3}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 1138
    .line 1139
    .line 1140
    invoke-direct {v4, v6, v5}, La/r5d0;-><init>(La/n0x;Ljava/lang/String;)V

    .line 1141
    .line 1142
    .line 1143
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1144
    .line 1145
    .line 1146
    goto :goto_1a

    .line 1147
    :cond_27
    invoke-static {v1}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v1

    .line 1151
    invoke-virtual {v0}, La/wr0;->c()La/fee;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v0

    .line 1155
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v0

    .line 1159
    sget-object v2, La/ep0;->c:La/ep0;

    .line 1160
    .line 1161
    if-ne v0, v2, :cond_28

    .line 1162
    .line 1163
    sget-object v0, La/q5d0;->b:La/q5d0;

    .line 1164
    .line 1165
    goto :goto_1b

    .line 1166
    :cond_28
    sget-object v0, La/q5d0;->a:La/q5d0;

    .line 1167
    .line 1168
    :goto_1b
    new-instance v2, La/t5d0;

    .line 1169
    .line 1170
    invoke-direct {v2, v1, v0}, La/t5d0;-><init>(La/i4;La/q5d0;)V

    .line 1171
    .line 1172
    .line 1173
    return-object v2

    .line 1174
    nop

    .line 1175
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
