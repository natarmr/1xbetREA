.class public final synthetic La/qts0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/nw8;


# direct methods
.method public synthetic constructor <init>(La/nw8;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/qts0;->a:B

    iput-object p1, p0, La/qts0;->b:La/nw8;

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
    iget-byte v1, v0, La/qts0;->a:B

    .line 4
    .line 5
    const/16 v2, 0x3c

    .line 6
    .line 7
    const-string v3, "#,##0.##"

    .line 8
    .line 9
    const/16 v4, 0x2e

    .line 10
    .line 11
    const/16 v5, 0x20

    .line 12
    .line 13
    const/16 v6, 0xa

    .line 14
    .line 15
    const/4 v7, 0x1

    .line 16
    sget-object v8, La/hts0;->a:La/hts0;

    .line 17
    .line 18
    iget-object v0, v0, La/qts0;->b:La/nw8;

    .line 19
    .line 20
    const/4 v9, 0x0

    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    move-object/from16 v1, p1

    .line 25
    .line 26
    check-cast v1, Lkotlin/Pair;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, La/nw8;->b()La/fee;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, La/its0;

    .line 40
    .line 41
    invoke-virtual {v0}, La/nw8;->a()La/fee;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Ljava/lang/Number;

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 52
    .line 53
    .line 54
    move-result-wide v10

    .line 55
    iget-object v2, v0, La/nw8;->e:La/n0o0;

    .line 56
    .line 57
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, La/fee;

    .line 62
    .line 63
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    move-object/from16 v17, v2

    .line 68
    .line 69
    check-cast v17, Ljava/lang/String;

    .line 70
    .line 71
    iget-object v2, v0, La/nw8;->b:La/ctf0;

    .line 72
    .line 73
    iget-object v0, v0, La/nw8;->l:La/n0o0;

    .line 74
    .line 75
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, La/fee;

    .line 80
    .line 81
    invoke-virtual {v0}, La/fee;->b()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, La/mdm;

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    instance-of v7, v1, La/gts0;

    .line 100
    .line 101
    if-eqz v7, :cond_9

    .line 102
    .line 103
    check-cast v1, La/gts0;

    .line 104
    .line 105
    iget-object v1, v1, La/gts0;->a:La/vss0;

    .line 106
    .line 107
    iget-object v1, v1, La/vss0;->b:Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    if-eqz v7, :cond_1

    .line 118
    .line 119
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    move-object v8, v7

    .line 124
    check-cast v8, La/x5v0;

    .line 125
    .line 126
    iget-wide v12, v8, La/x5v0;->b:J

    .line 127
    .line 128
    cmp-long v8, v10, v12

    .line 129
    .line 130
    if-nez v8, :cond_0

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_1
    move-object v7, v9

    .line 134
    :goto_0
    check-cast v7, La/x5v0;

    .line 135
    .line 136
    const/4 v1, 0x0

    .line 137
    if-eqz v7, :cond_6

    .line 138
    .line 139
    iget-object v7, v7, La/x5v0;->c:Ljava/util/ArrayList;

    .line 140
    .line 141
    new-instance v8, Ljava/util/ArrayList;

    .line 142
    .line 143
    invoke-static {v7, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 144
    .line 145
    .line 146
    move-result v6

    .line 147
    invoke-direct {v8, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    move v7, v1

    .line 155
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v10

    .line 159
    if-eqz v10, :cond_5

    .line 160
    .line 161
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v10

    .line 165
    add-int/lit8 v11, v7, 0x1

    .line 166
    .line 167
    if-ltz v7, :cond_4

    .line 168
    .line 169
    check-cast v10, La/kkv0;

    .line 170
    .line 171
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    sget-object v12, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 175
    .line 176
    invoke-static {v12}, Ljava/text/DecimalFormatSymbols;->getInstance(Ljava/util/Locale;)Ljava/text/DecimalFormatSymbols;

    .line 177
    .line 178
    .line 179
    move-result-object v12

    .line 180
    invoke-virtual {v12, v5}, Ljava/text/DecimalFormatSymbols;->setGroupingSeparator(C)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v12, v4}, Ljava/text/DecimalFormatSymbols;->setDecimalSeparator(C)V

    .line 184
    .line 185
    .line 186
    new-instance v13, Ljava/text/DecimalFormat;

    .line 187
    .line 188
    invoke-direct {v13, v3, v12}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;Ljava/text/DecimalFormatSymbols;)V

    .line 189
    .line 190
    .line 191
    iget-object v12, v10, La/kkv0;->a:Ljava/lang/String;

    .line 192
    .line 193
    invoke-static {v12}, Lkotlin/text/b;->i(Ljava/lang/String;)Ljava/lang/Double;

    .line 194
    .line 195
    .line 196
    move-result-object v12

    .line 197
    if-nez v12, :cond_2

    .line 198
    .line 199
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 200
    .line 201
    .line 202
    move-result-object v12

    .line 203
    :cond_2
    invoke-virtual {v13, v12}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v16

    .line 207
    iget-object v13, v10, La/kkv0;->c:Ljava/lang/String;

    .line 208
    .line 209
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    iget-object v14, v10, La/kkv0;->b:Ljava/lang/String;

    .line 213
    .line 214
    rem-int/lit8 v7, v7, 0x2

    .line 215
    .line 216
    if-nez v7, :cond_3

    .line 217
    .line 218
    sget-object v7, La/s6t0;->a:La/pz40;

    .line 219
    .line 220
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 221
    .line 222
    .line 223
    move-result-object v7

    .line 224
    iget-object v7, v7, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 225
    .line 226
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 227
    .line 228
    .line 229
    move-result-wide v18

    .line 230
    goto :goto_2

    .line 231
    :cond_3
    sget-object v7, La/s6t0;->a:La/pz40;

    .line 232
    .line 233
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 234
    .line 235
    .line 236
    move-result-object v7

    .line 237
    iget-object v7, v7, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 238
    .line 239
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 240
    .line 241
    .line 242
    move-result-wide v18

    .line 243
    :goto_2
    new-instance v12, La/rss0;

    .line 244
    .line 245
    move-object v15, v13

    .line 246
    invoke-direct/range {v12 .. v19}, La/rss0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move v7, v11

    .line 253
    goto :goto_1

    .line 254
    :cond_4
    invoke-static {}, La/q3d;->p()V

    .line 255
    .line 256
    .line 257
    throw v9

    .line 258
    :cond_5
    move-object v9, v8

    .line 259
    :cond_6
    if-nez v9, :cond_7

    .line 260
    .line 261
    sget-object v9, La/iun;->a:La/iun;

    .line 262
    .line 263
    :cond_7
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 264
    .line 265
    .line 266
    move-result v3

    .line 267
    if-nez v3, :cond_8

    .line 268
    .line 269
    new-instance v0, La/jts0;

    .line 270
    .line 271
    new-array v3, v1, [Ljava/lang/Object;

    .line 272
    .line 273
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 274
    .line 275
    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v3

    .line 279
    const v4, 0x7f130679

    .line 280
    .line 281
    .line 282
    invoke-virtual {v2, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    new-array v4, v1, [Ljava/lang/Object;

    .line 287
    .line 288
    invoke-static {v4, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v4

    .line 292
    const v5, 0x7f130747

    .line 293
    .line 294
    .line 295
    invoke-virtual {v2, v5, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v4

    .line 299
    new-array v5, v1, [Ljava/lang/Object;

    .line 300
    .line 301
    invoke-static {v5, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    const v5, 0x7f13074a

    .line 306
    .line 307
    .line 308
    invoke-virtual {v2, v5, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    invoke-static {v9}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    invoke-direct {v0, v3, v4, v1, v2}, La/jts0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/i4;)V

    .line 317
    .line 318
    .line 319
    move-object v9, v0

    .line 320
    goto :goto_3

    .line 321
    :cond_8
    new-instance v9, La/kts0;

    .line 322
    .line 323
    invoke-direct {v9, v0}, La/kts0;-><init>(La/mdm;)V

    .line 324
    .line 325
    .line 326
    goto :goto_3

    .line 327
    :cond_9
    invoke-virtual {v1, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    move-result v0

    .line 331
    if-eqz v0, :cond_a

    .line 332
    .line 333
    sget-object v9, La/lts0;->a:La/lts0;

    .line 334
    .line 335
    goto :goto_3

    .line 336
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 337
    .line 338
    .line 339
    :goto_3
    return-object v9

    .line 340
    :pswitch_0
    move-object/from16 v1, p1

    .line 341
    .line 342
    check-cast v1, Lkotlin/Pair;

    .line 343
    .line 344
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v0}, La/nw8;->b()La/fee;

    .line 348
    .line 349
    .line 350
    move-result-object v1

    .line 351
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v1

    .line 355
    check-cast v1, La/its0;

    .line 356
    .line 357
    invoke-virtual {v0}, La/nw8;->a()La/fee;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    check-cast v0, Ljava/lang/Number;

    .line 366
    .line 367
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 368
    .line 369
    .line 370
    move-result-wide v3

    .line 371
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 372
    .line 373
    .line 374
    instance-of v0, v1, La/gts0;

    .line 375
    .line 376
    const/high16 v5, 0x41400000    # 12.0f

    .line 377
    .line 378
    if-eqz v0, :cond_d

    .line 379
    .line 380
    const/4 v0, 0x0

    .line 381
    const/4 v7, 0x2

    .line 382
    invoke-static {v5, v0, v7}, La/s5x0;->t(FFI)La/lh80;

    .line 383
    .line 384
    .line 385
    move-result-object v14

    .line 386
    check-cast v1, La/gts0;

    .line 387
    .line 388
    iget-object v0, v1, La/gts0;->a:La/vss0;

    .line 389
    .line 390
    iget-object v0, v0, La/vss0;->c:Ljava/util/ArrayList;

    .line 391
    .line 392
    new-instance v1, Ljava/util/ArrayList;

    .line 393
    .line 394
    invoke-static {v0, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 395
    .line 396
    .line 397
    move-result v5

    .line 398
    invoke-direct {v1, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 406
    .line 407
    .line 408
    move-result v5

    .line 409
    if-eqz v5, :cond_c

    .line 410
    .line 411
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v5

    .line 415
    check-cast v5, Lkotlin/Pair;

    .line 416
    .line 417
    new-instance v15, La/lxl;

    .line 418
    .line 419
    iget-object v5, v5, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 420
    .line 421
    check-cast v5, Ljava/lang/Number;

    .line 422
    .line 423
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 424
    .line 425
    .line 426
    move-result-wide v16

    .line 427
    new-instance v6, La/xxl;

    .line 428
    .line 429
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 430
    .line 431
    .line 432
    move-result-wide v7

    .line 433
    sget-object v10, La/rdj;->a:La/rdj;

    .line 434
    .line 435
    new-instance v10, La/znq0;

    .line 436
    .line 437
    invoke-direct {v10, v7, v8}, La/znq0;-><init>(J)V

    .line 438
    .line 439
    .line 440
    sget-object v7, La/sdj;->b:La/sdj;

    .line 441
    .line 442
    invoke-static {v10, v7, v9, v2}, La/rdj;->f(La/aoq0;La/sdj;Ljava/util/Locale;I)Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v7

    .line 446
    invoke-direct {v6, v7}, La/xxl;-><init>(Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 450
    .line 451
    .line 452
    move-result-wide v7

    .line 453
    cmp-long v5, v3, v7

    .line 454
    .line 455
    if-nez v5, :cond_b

    .line 456
    .line 457
    sget-object v5, La/uxl;->b:La/uxl;

    .line 458
    .line 459
    :goto_5
    move-object/from16 v20, v5

    .line 460
    .line 461
    goto :goto_6

    .line 462
    :cond_b
    sget-object v5, La/uxl;->a:La/uxl;

    .line 463
    .line 464
    goto :goto_5

    .line 465
    :goto_6
    const/16 v21, 0x0

    .line 466
    .line 467
    const/16 v22, 0x6c

    .line 468
    .line 469
    const/16 v19, 0x0

    .line 470
    .line 471
    move-object/from16 v18, v6

    .line 472
    .line 473
    invoke-direct/range {v15 .. v22}, La/lxl;-><init>(JLa/dyl;ZLa/uxl;La/cwl;I)V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v1, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    goto :goto_4

    .line 480
    :cond_c
    invoke-static {v1}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 481
    .line 482
    .line 483
    move-result-object v11

    .line 484
    new-instance v10, La/fyl;

    .line 485
    .line 486
    const/4 v15, 0x0

    .line 487
    const/16 v16, 0x16

    .line 488
    .line 489
    const/4 v12, 0x0

    .line 490
    const/4 v13, 0x0

    .line 491
    invoke-direct/range {v10 .. v16}, La/fyl;-><init>(La/a4x;La/tyl;La/syl;La/hh80;La/jyl;I)V

    .line 492
    .line 493
    .line 494
    move-object v9, v10

    .line 495
    goto :goto_7

    .line 496
    :cond_d
    invoke-virtual {v1, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 497
    .line 498
    .line 499
    move-result v0

    .line 500
    if-eqz v0, :cond_e

    .line 501
    .line 502
    new-instance v0, La/gyl;

    .line 503
    .line 504
    sget-object v1, La/qmk;->a:La/zcl;

    .line 505
    .line 506
    new-instance v1, La/lh80;

    .line 507
    .line 508
    const/high16 v2, 0x41000000    # 8.0f

    .line 509
    .line 510
    invoke-direct {v1, v5, v2, v5, v2}, La/lh80;-><init>(FFFF)V

    .line 511
    .line 512
    .line 513
    invoke-direct {v0, v9, v1, v7}, La/gyl;-><init>(La/syl;La/lh80;I)V

    .line 514
    .line 515
    .line 516
    move-object v9, v0

    .line 517
    goto :goto_7

    .line 518
    :cond_e
    invoke-static {}, La/t9f;->b()V

    .line 519
    .line 520
    .line 521
    :goto_7
    return-object v9

    .line 522
    :pswitch_1
    move-object/from16 v1, p1

    .line 523
    .line 524
    check-cast v1, La/fee;

    .line 525
    .line 526
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 527
    .line 528
    .line 529
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v1

    .line 533
    check-cast v1, La/its0;

    .line 534
    .line 535
    iget-object v0, v0, La/nw8;->e:La/n0o0;

    .line 536
    .line 537
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    check-cast v0, La/fee;

    .line 542
    .line 543
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    check-cast v0, Ljava/lang/String;

    .line 548
    .line 549
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 550
    .line 551
    .line 552
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 553
    .line 554
    .line 555
    instance-of v2, v1, La/gts0;

    .line 556
    .line 557
    if-eqz v2, :cond_f

    .line 558
    .line 559
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 560
    .line 561
    invoke-static {v2}, Ljava/text/DecimalFormatSymbols;->getInstance(Ljava/util/Locale;)Ljava/text/DecimalFormatSymbols;

    .line 562
    .line 563
    .line 564
    move-result-object v2

    .line 565
    invoke-virtual {v2, v5}, Ljava/text/DecimalFormatSymbols;->setGroupingSeparator(C)V

    .line 566
    .line 567
    .line 568
    invoke-virtual {v2, v4}, Ljava/text/DecimalFormatSymbols;->setDecimalSeparator(C)V

    .line 569
    .line 570
    .line 571
    new-instance v4, Ljava/text/DecimalFormat;

    .line 572
    .line 573
    invoke-direct {v4, v3, v2}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;Ljava/text/DecimalFormatSymbols;)V

    .line 574
    .line 575
    .line 576
    check-cast v1, La/gts0;

    .line 577
    .line 578
    iget-object v1, v1, La/gts0;->a:La/vss0;

    .line 579
    .line 580
    iget-wide v1, v1, La/vss0;->a:D

    .line 581
    .line 582
    invoke-virtual {v4, v1, v2}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object v1

    .line 586
    new-instance v9, La/lss0;

    .line 587
    .line 588
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 589
    .line 590
    .line 591
    invoke-direct {v9, v1, v0}, La/lss0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 592
    .line 593
    .line 594
    goto :goto_8

    .line 595
    :cond_f
    invoke-virtual {v1, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 596
    .line 597
    .line 598
    move-result v0

    .line 599
    if-eqz v0, :cond_10

    .line 600
    .line 601
    sget-object v9, La/mss0;->a:La/mss0;

    .line 602
    .line 603
    goto :goto_8

    .line 604
    :cond_10
    invoke-static {}, La/t9f;->b()V

    .line 605
    .line 606
    .line 607
    :goto_8
    return-object v9

    .line 608
    :pswitch_2
    move-object/from16 v1, p1

    .line 609
    .line 610
    check-cast v1, Lkotlin/Pair;

    .line 611
    .line 612
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 613
    .line 614
    .line 615
    invoke-virtual {v0}, La/nw8;->b()La/fee;

    .line 616
    .line 617
    .line 618
    move-result-object v1

    .line 619
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v1

    .line 623
    check-cast v1, La/its0;

    .line 624
    .line 625
    invoke-virtual {v0}, La/nw8;->a()La/fee;

    .line 626
    .line 627
    .line 628
    move-result-object v3

    .line 629
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object v3

    .line 633
    check-cast v3, Ljava/lang/Number;

    .line 634
    .line 635
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 636
    .line 637
    .line 638
    move-result-wide v3

    .line 639
    iget-object v0, v0, La/nw8;->b:La/ctf0;

    .line 640
    .line 641
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 642
    .line 643
    .line 644
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 645
    .line 646
    .line 647
    instance-of v5, v1, La/gts0;

    .line 648
    .line 649
    if-eqz v5, :cond_15

    .line 650
    .line 651
    check-cast v1, La/gts0;

    .line 652
    .line 653
    iget-object v1, v1, La/gts0;->a:La/vss0;

    .line 654
    .line 655
    iget-object v1, v1, La/vss0;->c:Ljava/util/ArrayList;

    .line 656
    .line 657
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 658
    .line 659
    .line 660
    move-result-object v1

    .line 661
    :cond_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 662
    .line 663
    .line 664
    move-result v5

    .line 665
    if-eqz v5, :cond_12

    .line 666
    .line 667
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    move-result-object v5

    .line 671
    move-object v6, v5

    .line 672
    check-cast v6, Lkotlin/Pair;

    .line 673
    .line 674
    iget-object v6, v6, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 675
    .line 676
    check-cast v6, Ljava/lang/Number;

    .line 677
    .line 678
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 679
    .line 680
    .line 681
    move-result-wide v10

    .line 682
    cmp-long v6, v10, v3

    .line 683
    .line 684
    if-nez v6, :cond_11

    .line 685
    .line 686
    goto :goto_9

    .line 687
    :cond_12
    move-object v5, v9

    .line 688
    :goto_9
    check-cast v5, Lkotlin/Pair;

    .line 689
    .line 690
    if-eqz v5, :cond_13

    .line 691
    .line 692
    iget-object v1, v5, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 693
    .line 694
    check-cast v1, Ljava/lang/Number;

    .line 695
    .line 696
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 697
    .line 698
    .line 699
    move-result-wide v3

    .line 700
    sget-object v1, La/rdj;->a:La/rdj;

    .line 701
    .line 702
    new-instance v1, La/znq0;

    .line 703
    .line 704
    invoke-direct {v1, v3, v4}, La/znq0;-><init>(J)V

    .line 705
    .line 706
    .line 707
    sget-object v3, La/sdj;->b:La/sdj;

    .line 708
    .line 709
    invoke-static {v1, v3, v9, v2}, La/rdj;->f(La/aoq0;La/sdj;Ljava/util/Locale;I)Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object v1

    .line 713
    iget-object v4, v5, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 714
    .line 715
    check-cast v4, Ljava/lang/Number;

    .line 716
    .line 717
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 718
    .line 719
    .line 720
    move-result-wide v4

    .line 721
    new-instance v6, La/znq0;

    .line 722
    .line 723
    invoke-direct {v6, v4, v5}, La/znq0;-><init>(J)V

    .line 724
    .line 725
    .line 726
    invoke-static {v6, v3, v9, v2}, La/rdj;->f(La/aoq0;La/sdj;Ljava/util/Locale;I)Ljava/lang/String;

    .line 727
    .line 728
    .line 729
    move-result-object v2

    .line 730
    const-string v3, " - "

    .line 731
    .line 732
    invoke-static {v1, v3, v2}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 733
    .line 734
    .line 735
    move-result-object v1

    .line 736
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 737
    .line 738
    .line 739
    move-result-object v1

    .line 740
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 741
    .line 742
    invoke-static {v1, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    move-result-object v1

    .line 746
    const v2, 0x7f131658

    .line 747
    .line 748
    .line 749
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 750
    .line 751
    .line 752
    move-result-object v9

    .line 753
    :cond_13
    if-nez v9, :cond_14

    .line 754
    .line 755
    const-string v9, ""

    .line 756
    .line 757
    :cond_14
    new-instance v0, La/sss0;

    .line 758
    .line 759
    invoke-direct {v0, v9}, La/sss0;-><init>(Ljava/lang/String;)V

    .line 760
    .line 761
    .line 762
    move-object v9, v0

    .line 763
    goto :goto_a

    .line 764
    :cond_15
    invoke-virtual {v1, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 765
    .line 766
    .line 767
    move-result v0

    .line 768
    if-eqz v0, :cond_16

    .line 769
    .line 770
    sget-object v9, La/tss0;->a:La/tss0;

    .line 771
    .line 772
    goto :goto_a

    .line 773
    :cond_16
    invoke-static {}, La/t9f;->b()V

    .line 774
    .line 775
    .line 776
    :goto_a
    return-object v9

    .line 777
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
