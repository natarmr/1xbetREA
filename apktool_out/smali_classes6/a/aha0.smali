.class public final synthetic La/aha0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/fqj0;


# direct methods
.method public synthetic constructor <init>(La/fqj0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/aha0;->a:B

    iput-object p1, p0, La/aha0;->b:La/fqj0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/aha0;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 6
    .line 7
    const/high16 v3, 0x42c00000    # 96.0f

    .line 8
    .line 9
    const/high16 v4, 0x41000000    # 8.0f

    .line 10
    .line 11
    const/16 v5, 0x90

    .line 12
    .line 13
    const/16 v6, 0x10

    .line 14
    .line 15
    const/16 v7, 0x20

    .line 16
    .line 17
    const/high16 v8, 0x3f800000    # 1.0f

    .line 18
    .line 19
    sget-object v9, La/jm40;->b:La/jm40;

    .line 20
    .line 21
    const/16 v10, 0x80

    .line 22
    .line 23
    const/4 v11, 0x1

    .line 24
    const/4 v12, 0x0

    .line 25
    iget-object v0, v0, La/aha0;->b:La/fqj0;

    .line 26
    .line 27
    packed-switch v1, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    move-object/from16 v1, p1

    .line 31
    .line 32
    check-cast v1, La/g9z;

    .line 33
    .line 34
    move-object/from16 v2, p2

    .line 35
    .line 36
    check-cast v2, Ljava/lang/Integer;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-object/from16 v2, p3

    .line 42
    .line 43
    check-cast v2, La/fet;

    .line 44
    .line 45
    move-object/from16 v3, p4

    .line 46
    .line 47
    check-cast v3, Ljava/lang/Integer;

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    and-int/lit16 v1, v3, 0x81

    .line 57
    .line 58
    if-eq v1, v10, :cond_0

    .line 59
    .line 60
    move v12, v11

    .line 61
    :cond_0
    and-int/lit8 v1, v3, 0x1

    .line 62
    .line 63
    invoke-virtual {v2, v1, v12}, La/fet;->U(IZ)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_1

    .line 68
    .line 69
    invoke-static {v9, v8}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    sget-object v3, La/qmk;->a:La/zcl;

    .line 74
    .line 75
    const/high16 v3, 0x41a00000    # 20.0f

    .line 76
    .line 77
    invoke-static {v1, v3}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    sget-object v3, La/qmk;->m:La/zcl;

    .line 82
    .line 83
    sget-object v4, La/vgg0;->a:La/ugg0;

    .line 84
    .line 85
    invoke-static {v3, v3, v3, v3, v1}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-static {v1, v0}, La/xbc;->c0(La/mm40;La/fqj0;)La/mm40;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {v2, v0}, La/qxw;->o(La/fet;La/mm40;)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_1
    invoke-virtual {v2}, La/fet;->X()V

    .line 98
    .line 99
    .line 100
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    return-object v0

    .line 103
    :pswitch_0
    move-object/from16 v1, p1

    .line 104
    .line 105
    check-cast v1, La/g9z;

    .line 106
    .line 107
    move-object/from16 v2, p2

    .line 108
    .line 109
    check-cast v2, Ljava/lang/Integer;

    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    move-object/from16 v3, p3

    .line 116
    .line 117
    check-cast v3, La/fet;

    .line 118
    .line 119
    move-object/from16 v8, p4

    .line 120
    .line 121
    check-cast v8, Ljava/lang/Integer;

    .line 122
    .line 123
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 124
    .line 125
    .line 126
    move-result v8

    .line 127
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    and-int/lit8 v1, v8, 0x30

    .line 131
    .line 132
    if-nez v1, :cond_3

    .line 133
    .line 134
    invoke-virtual {v3, v2}, La/fet;->e(I)Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-eqz v1, :cond_2

    .line 139
    .line 140
    move v6, v7

    .line 141
    :cond_2
    or-int/2addr v8, v6

    .line 142
    :cond_3
    and-int/lit16 v1, v8, 0x91

    .line 143
    .line 144
    if-eq v1, v5, :cond_4

    .line 145
    .line 146
    move v1, v11

    .line 147
    goto :goto_1

    .line 148
    :cond_4
    move v1, v12

    .line 149
    :goto_1
    and-int/lit8 v5, v8, 0x1

    .line 150
    .line 151
    invoke-virtual {v3, v5, v1}, La/fet;->U(IZ)Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-eqz v1, :cond_6

    .line 156
    .line 157
    sget-object v1, La/qmk;->a:La/zcl;

    .line 158
    .line 159
    if-nez v2, :cond_5

    .line 160
    .line 161
    const/4 v4, 0x0

    .line 162
    :cond_5
    move v6, v4

    .line 163
    const/4 v9, 0x0

    .line 164
    const/16 v10, 0xe

    .line 165
    .line 166
    sget-object v5, La/jm40;->b:La/jm40;

    .line 167
    .line 168
    const/4 v7, 0x0

    .line 169
    const/4 v8, 0x0

    .line 170
    invoke-static/range {v5 .. v10}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-static {v1, v0, v3, v12}, La/k7n0;->b(La/mm40;La/fqj0;La/fet;I)V

    .line 175
    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_6
    invoke-virtual {v3}, La/fet;->X()V

    .line 179
    .line 180
    .line 181
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 182
    .line 183
    return-object v0

    .line 184
    :pswitch_1
    move-object/from16 v1, p1

    .line 185
    .line 186
    check-cast v1, La/g9z;

    .line 187
    .line 188
    move-object/from16 v2, p2

    .line 189
    .line 190
    check-cast v2, Ljava/lang/Integer;

    .line 191
    .line 192
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    move-object/from16 v2, p3

    .line 196
    .line 197
    check-cast v2, La/fet;

    .line 198
    .line 199
    move-object/from16 v5, p4

    .line 200
    .line 201
    check-cast v5, Ljava/lang/Integer;

    .line 202
    .line 203
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 204
    .line 205
    .line 206
    move-result v5

    .line 207
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    and-int/lit16 v1, v5, 0x81

    .line 211
    .line 212
    if-eq v1, v10, :cond_7

    .line 213
    .line 214
    move v1, v11

    .line 215
    goto :goto_3

    .line 216
    :cond_7
    move v1, v12

    .line 217
    :goto_3
    and-int/2addr v5, v11

    .line 218
    invoke-virtual {v2, v5, v1}, La/fet;->U(IZ)Z

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    if-eqz v1, :cond_8

    .line 223
    .line 224
    sget-object v1, La/qmk;->a:La/zcl;

    .line 225
    .line 226
    invoke-static {v9, v4}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    invoke-static {v12, v2, v1}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 231
    .line 232
    .line 233
    invoke-static {v3, v0, v2, v12}, La/q5x;->d(FLa/fqj0;La/fet;I)V

    .line 234
    .line 235
    .line 236
    invoke-static {v9, v4}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    invoke-static {v12, v2, v1}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 241
    .line 242
    .line 243
    const/high16 v1, 0x43400000    # 192.0f

    .line 244
    .line 245
    invoke-static {v1, v0, v2, v12}, La/q5x;->d(FLa/fqj0;La/fet;I)V

    .line 246
    .line 247
    .line 248
    goto :goto_4

    .line 249
    :cond_8
    invoke-virtual {v2}, La/fet;->X()V

    .line 250
    .line 251
    .line 252
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 253
    .line 254
    return-object v0

    .line 255
    :pswitch_2
    move-object/from16 v1, p1

    .line 256
    .line 257
    check-cast v1, La/g9z;

    .line 258
    .line 259
    move-object/from16 v2, p2

    .line 260
    .line 261
    check-cast v2, Ljava/lang/Integer;

    .line 262
    .line 263
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    move-object/from16 v2, p3

    .line 267
    .line 268
    check-cast v2, La/fet;

    .line 269
    .line 270
    move-object/from16 v3, p4

    .line 271
    .line 272
    check-cast v3, Ljava/lang/Integer;

    .line 273
    .line 274
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 275
    .line 276
    .line 277
    move-result v3

    .line 278
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    and-int/lit16 v1, v3, 0x81

    .line 282
    .line 283
    if-eq v1, v10, :cond_9

    .line 284
    .line 285
    move v12, v11

    .line 286
    :cond_9
    and-int/lit8 v1, v3, 0x1

    .line 287
    .line 288
    invoke-virtual {v2, v1, v12}, La/fet;->U(IZ)Z

    .line 289
    .line 290
    .line 291
    move-result v1

    .line 292
    if-eqz v1, :cond_a

    .line 293
    .line 294
    const/4 v1, 0x6

    .line 295
    invoke-static {v9, v0, v2, v1}, La/p7x;->h(La/mm40;La/fqj0;La/fet;I)V

    .line 296
    .line 297
    .line 298
    goto :goto_5

    .line 299
    :cond_a
    invoke-virtual {v2}, La/fet;->X()V

    .line 300
    .line 301
    .line 302
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 303
    .line 304
    return-object v0

    .line 305
    :pswitch_3
    move-object/from16 v1, p1

    .line 306
    .line 307
    check-cast v1, La/g9z;

    .line 308
    .line 309
    move-object/from16 v2, p2

    .line 310
    .line 311
    check-cast v2, Ljava/lang/Integer;

    .line 312
    .line 313
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    move-object/from16 v2, p3

    .line 317
    .line 318
    check-cast v2, La/fet;

    .line 319
    .line 320
    move-object/from16 v3, p4

    .line 321
    .line 322
    check-cast v3, Ljava/lang/Integer;

    .line 323
    .line 324
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 325
    .line 326
    .line 327
    move-result v3

    .line 328
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    and-int/lit16 v1, v3, 0x81

    .line 332
    .line 333
    if-eq v1, v10, :cond_b

    .line 334
    .line 335
    move v1, v11

    .line 336
    goto :goto_6

    .line 337
    :cond_b
    move v1, v12

    .line 338
    :goto_6
    and-int/2addr v3, v11

    .line 339
    invoke-virtual {v2, v3, v1}, La/fet;->U(IZ)Z

    .line 340
    .line 341
    .line 342
    move-result v1

    .line 343
    if-eqz v1, :cond_c

    .line 344
    .line 345
    sget-object v1, La/zaq0;->b:La/zfn;

    .line 346
    .line 347
    invoke-virtual {v2, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v3

    .line 351
    check-cast v3, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 352
    .line 353
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 354
    .line 355
    .line 356
    move-result-wide v3

    .line 357
    invoke-static {v3, v4, v0, v2, v12}, La/x8x;->i(JLa/fqj0;La/fet;I)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v2, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v1

    .line 364
    check-cast v1, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 365
    .line 366
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 367
    .line 368
    .line 369
    move-result-wide v3

    .line 370
    invoke-static {v3, v4, v0, v2, v12}, La/x8x;->i(JLa/fqj0;La/fet;I)V

    .line 371
    .line 372
    .line 373
    goto :goto_7

    .line 374
    :cond_c
    invoke-virtual {v2}, La/fet;->X()V

    .line 375
    .line 376
    .line 377
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 378
    .line 379
    return-object v0

    .line 380
    :pswitch_4
    move-object/from16 v1, p1

    .line 381
    .line 382
    check-cast v1, La/g9z;

    .line 383
    .line 384
    move-object/from16 v2, p2

    .line 385
    .line 386
    check-cast v2, Ljava/lang/Integer;

    .line 387
    .line 388
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 389
    .line 390
    .line 391
    move-object/from16 v2, p3

    .line 392
    .line 393
    check-cast v2, La/fet;

    .line 394
    .line 395
    move-object/from16 v3, p4

    .line 396
    .line 397
    check-cast v3, Ljava/lang/Integer;

    .line 398
    .line 399
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 400
    .line 401
    .line 402
    move-result v3

    .line 403
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    and-int/lit16 v1, v3, 0x81

    .line 407
    .line 408
    if-eq v1, v10, :cond_d

    .line 409
    .line 410
    move v1, v11

    .line 411
    goto :goto_8

    .line 412
    :cond_d
    move v1, v12

    .line 413
    :goto_8
    and-int/2addr v3, v11

    .line 414
    invoke-virtual {v2, v3, v1}, La/fet;->U(IZ)Z

    .line 415
    .line 416
    .line 417
    move-result v1

    .line 418
    if-eqz v1, :cond_e

    .line 419
    .line 420
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 421
    .line 422
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 423
    .line 424
    .line 425
    move-result-object v1

    .line 426
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 427
    .line 428
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 429
    .line 430
    .line 431
    move-result-wide v3

    .line 432
    invoke-static {v3, v4, v0, v2, v12}, La/m8x;->D(JLa/fqj0;La/fet;I)V

    .line 433
    .line 434
    .line 435
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 440
    .line 441
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 442
    .line 443
    .line 444
    move-result-wide v3

    .line 445
    invoke-static {v3, v4, v0, v2, v12}, La/m8x;->D(JLa/fqj0;La/fet;I)V

    .line 446
    .line 447
    .line 448
    goto :goto_9

    .line 449
    :cond_e
    invoke-virtual {v2}, La/fet;->X()V

    .line 450
    .line 451
    .line 452
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 453
    .line 454
    return-object v0

    .line 455
    :pswitch_5
    move-object/from16 v1, p1

    .line 456
    .line 457
    check-cast v1, La/g9z;

    .line 458
    .line 459
    move-object/from16 v2, p2

    .line 460
    .line 461
    check-cast v2, Ljava/lang/Integer;

    .line 462
    .line 463
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 464
    .line 465
    .line 466
    move-object/from16 v2, p3

    .line 467
    .line 468
    check-cast v2, La/fet;

    .line 469
    .line 470
    move-object/from16 v3, p4

    .line 471
    .line 472
    check-cast v3, Ljava/lang/Integer;

    .line 473
    .line 474
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 475
    .line 476
    .line 477
    move-result v3

    .line 478
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 479
    .line 480
    .line 481
    and-int/lit16 v1, v3, 0x81

    .line 482
    .line 483
    if-eq v1, v10, :cond_f

    .line 484
    .line 485
    move v1, v11

    .line 486
    goto :goto_a

    .line 487
    :cond_f
    move v1, v12

    .line 488
    :goto_a
    and-int/2addr v3, v11

    .line 489
    invoke-virtual {v2, v3, v1}, La/fet;->U(IZ)Z

    .line 490
    .line 491
    .line 492
    move-result v1

    .line 493
    if-eqz v1, :cond_10

    .line 494
    .line 495
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 496
    .line 497
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 498
    .line 499
    .line 500
    move-result-object v1

    .line 501
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 502
    .line 503
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 504
    .line 505
    .line 506
    move-result-wide v3

    .line 507
    invoke-static {v3, v4, v0, v2, v12}, La/pzw;->r(JLa/fqj0;La/fet;I)V

    .line 508
    .line 509
    .line 510
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 511
    .line 512
    .line 513
    move-result-object v1

    .line 514
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 515
    .line 516
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 517
    .line 518
    .line 519
    move-result-wide v3

    .line 520
    invoke-static {v3, v4, v0, v2, v12}, La/pzw;->r(JLa/fqj0;La/fet;I)V

    .line 521
    .line 522
    .line 523
    goto :goto_b

    .line 524
    :cond_10
    invoke-virtual {v2}, La/fet;->X()V

    .line 525
    .line 526
    .line 527
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 528
    .line 529
    return-object v0

    .line 530
    :pswitch_6
    move-object/from16 v1, p1

    .line 531
    .line 532
    check-cast v1, La/g9z;

    .line 533
    .line 534
    move-object/from16 v2, p2

    .line 535
    .line 536
    check-cast v2, Ljava/lang/Integer;

    .line 537
    .line 538
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 539
    .line 540
    .line 541
    move-object/from16 v2, p3

    .line 542
    .line 543
    check-cast v2, La/fet;

    .line 544
    .line 545
    move-object/from16 v3, p4

    .line 546
    .line 547
    check-cast v3, Ljava/lang/Integer;

    .line 548
    .line 549
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 550
    .line 551
    .line 552
    move-result v3

    .line 553
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 554
    .line 555
    .line 556
    and-int/lit16 v1, v3, 0x81

    .line 557
    .line 558
    if-eq v1, v10, :cond_11

    .line 559
    .line 560
    move v1, v11

    .line 561
    goto :goto_c

    .line 562
    :cond_11
    move v1, v12

    .line 563
    :goto_c
    and-int/2addr v3, v11

    .line 564
    invoke-virtual {v2, v3, v1}, La/fet;->U(IZ)Z

    .line 565
    .line 566
    .line 567
    move-result v1

    .line 568
    if-eqz v1, :cond_12

    .line 569
    .line 570
    sget-object v1, La/qmk;->h:La/zcl;

    .line 571
    .line 572
    sget-object v3, La/vgg0;->a:La/ugg0;

    .line 573
    .line 574
    invoke-static {v1, v1, v1, v1, v9}, La/dw9;->i(La/zcl;La/zcl;La/zcl;La/zcl;La/jm40;)La/mm40;

    .line 575
    .line 576
    .line 577
    move-result-object v1

    .line 578
    invoke-static {v1, v0}, La/xbc;->c0(La/mm40;La/fqj0;)La/mm40;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    const/high16 v1, 0x42800000    # 64.0f

    .line 583
    .line 584
    const/high16 v3, 0x42000000    # 32.0f

    .line 585
    .line 586
    invoke-static {v0, v1, v3}, La/o7k0;->p(La/mm40;FF)La/mm40;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    invoke-static {v12, v2, v0}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 591
    .line 592
    .line 593
    goto :goto_d

    .line 594
    :cond_12
    invoke-virtual {v2}, La/fet;->X()V

    .line 595
    .line 596
    .line 597
    :goto_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 598
    .line 599
    return-object v0

    .line 600
    :pswitch_7
    move-object/from16 v1, p1

    .line 601
    .line 602
    check-cast v1, La/g9z;

    .line 603
    .line 604
    move-object/from16 v3, p2

    .line 605
    .line 606
    check-cast v3, Ljava/lang/Integer;

    .line 607
    .line 608
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 609
    .line 610
    .line 611
    move-object/from16 v3, p3

    .line 612
    .line 613
    check-cast v3, La/fet;

    .line 614
    .line 615
    move-object/from16 v4, p4

    .line 616
    .line 617
    check-cast v4, Ljava/lang/Integer;

    .line 618
    .line 619
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 620
    .line 621
    .line 622
    move-result v4

    .line 623
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 624
    .line 625
    .line 626
    and-int/lit16 v1, v4, 0x81

    .line 627
    .line 628
    if-eq v1, v10, :cond_13

    .line 629
    .line 630
    move v1, v11

    .line 631
    goto :goto_e

    .line 632
    :cond_13
    move v1, v12

    .line 633
    :goto_e
    and-int/2addr v4, v11

    .line 634
    invoke-virtual {v3, v4, v1}, La/fet;->U(IZ)Z

    .line 635
    .line 636
    .line 637
    move-result v1

    .line 638
    if-eqz v1, :cond_14

    .line 639
    .line 640
    sget-object v1, La/qmk;->l:La/zcl;

    .line 641
    .line 642
    sget-object v4, La/vgg0;->a:La/ugg0;

    .line 643
    .line 644
    invoke-static {v1, v1, v1, v1, v9}, La/dw9;->i(La/zcl;La/zcl;La/zcl;La/zcl;La/jm40;)La/mm40;

    .line 645
    .line 646
    .line 647
    move-result-object v1

    .line 648
    invoke-static {v1, v8}, La/o7k0;->c(La/mm40;F)La/mm40;

    .line 649
    .line 650
    .line 651
    move-result-object v1

    .line 652
    invoke-static {v2, v1, v12}, La/ny9;->O(FLa/mm40;Z)La/mm40;

    .line 653
    .line 654
    .line 655
    move-result-object v1

    .line 656
    invoke-static {v1, v0}, La/xbc;->c0(La/mm40;La/fqj0;)La/mm40;

    .line 657
    .line 658
    .line 659
    move-result-object v0

    .line 660
    invoke-static {v12, v3, v0}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 661
    .line 662
    .line 663
    goto :goto_f

    .line 664
    :cond_14
    invoke-virtual {v3}, La/fet;->X()V

    .line 665
    .line 666
    .line 667
    :goto_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 668
    .line 669
    return-object v0

    .line 670
    :pswitch_8
    move-object/from16 v1, p1

    .line 671
    .line 672
    check-cast v1, La/g9z;

    .line 673
    .line 674
    move-object/from16 v3, p2

    .line 675
    .line 676
    check-cast v3, Ljava/lang/Integer;

    .line 677
    .line 678
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 679
    .line 680
    .line 681
    move-object/from16 v3, p3

    .line 682
    .line 683
    check-cast v3, La/fet;

    .line 684
    .line 685
    move-object/from16 v4, p4

    .line 686
    .line 687
    check-cast v4, Ljava/lang/Integer;

    .line 688
    .line 689
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 690
    .line 691
    .line 692
    move-result v4

    .line 693
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 694
    .line 695
    .line 696
    and-int/lit16 v1, v4, 0x81

    .line 697
    .line 698
    if-eq v1, v10, :cond_15

    .line 699
    .line 700
    move v1, v11

    .line 701
    goto :goto_10

    .line 702
    :cond_15
    move v1, v12

    .line 703
    :goto_10
    and-int/2addr v4, v11

    .line 704
    invoke-virtual {v3, v4, v1}, La/fet;->U(IZ)Z

    .line 705
    .line 706
    .line 707
    move-result v1

    .line 708
    if-eqz v1, :cond_16

    .line 709
    .line 710
    sget-object v1, La/qmk;->l:La/zcl;

    .line 711
    .line 712
    sget-object v4, La/vgg0;->a:La/ugg0;

    .line 713
    .line 714
    invoke-static {v1, v1, v1, v1, v9}, La/dw9;->i(La/zcl;La/zcl;La/zcl;La/zcl;La/jm40;)La/mm40;

    .line 715
    .line 716
    .line 717
    move-result-object v1

    .line 718
    invoke-static {v1, v8}, La/o7k0;->c(La/mm40;F)La/mm40;

    .line 719
    .line 720
    .line 721
    move-result-object v1

    .line 722
    invoke-static {v2, v1, v12}, La/ny9;->O(FLa/mm40;Z)La/mm40;

    .line 723
    .line 724
    .line 725
    move-result-object v1

    .line 726
    invoke-static {v1, v0}, La/xbc;->c0(La/mm40;La/fqj0;)La/mm40;

    .line 727
    .line 728
    .line 729
    move-result-object v0

    .line 730
    invoke-static {v12, v3, v0}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 731
    .line 732
    .line 733
    goto :goto_11

    .line 734
    :cond_16
    invoke-virtual {v3}, La/fet;->X()V

    .line 735
    .line 736
    .line 737
    :goto_11
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 738
    .line 739
    return-object v0

    .line 740
    :pswitch_9
    move-object/from16 v1, p1

    .line 741
    .line 742
    check-cast v1, La/g9z;

    .line 743
    .line 744
    move-object/from16 v2, p2

    .line 745
    .line 746
    check-cast v2, Ljava/lang/Integer;

    .line 747
    .line 748
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 749
    .line 750
    .line 751
    move-result v2

    .line 752
    move-object/from16 v4, p3

    .line 753
    .line 754
    check-cast v4, La/fet;

    .line 755
    .line 756
    move-object/from16 v9, p4

    .line 757
    .line 758
    check-cast v9, Ljava/lang/Integer;

    .line 759
    .line 760
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 761
    .line 762
    .line 763
    move-result v9

    .line 764
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 765
    .line 766
    .line 767
    and-int/lit8 v1, v9, 0x30

    .line 768
    .line 769
    if-nez v1, :cond_18

    .line 770
    .line 771
    invoke-virtual {v4, v2}, La/fet;->e(I)Z

    .line 772
    .line 773
    .line 774
    move-result v1

    .line 775
    if-eqz v1, :cond_17

    .line 776
    .line 777
    move v6, v7

    .line 778
    :cond_17
    or-int/2addr v9, v6

    .line 779
    :cond_18
    and-int/lit16 v1, v9, 0x91

    .line 780
    .line 781
    if-eq v1, v5, :cond_19

    .line 782
    .line 783
    move v1, v11

    .line 784
    goto :goto_12

    .line 785
    :cond_19
    move v1, v12

    .line 786
    :goto_12
    and-int/lit8 v5, v9, 0x1

    .line 787
    .line 788
    invoke-virtual {v4, v5, v1}, La/fet;->U(IZ)Z

    .line 789
    .line 790
    .line 791
    move-result v1

    .line 792
    if-eqz v1, :cond_1f

    .line 793
    .line 794
    rem-int/lit8 v1, v2, 0x2

    .line 795
    .line 796
    if-nez v1, :cond_1a

    .line 797
    .line 798
    move v1, v11

    .line 799
    goto :goto_13

    .line 800
    :cond_1a
    move v1, v12

    .line 801
    :goto_13
    sget-object v13, La/jm40;->b:La/jm40;

    .line 802
    .line 803
    invoke-static {v13, v8}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 804
    .line 805
    .line 806
    move-result-object v5

    .line 807
    sget-object v6, La/qmk;->a:La/zcl;

    .line 808
    .line 809
    const/high16 v6, 0x42700000    # 60.0f

    .line 810
    .line 811
    invoke-static {v5, v6}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 812
    .line 813
    .line 814
    move-result-object v5

    .line 815
    sget-object v6, La/zaq0;->b:La/zfn;

    .line 816
    .line 817
    invoke-virtual {v4, v6}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 818
    .line 819
    .line 820
    move-result-object v6

    .line 821
    check-cast v6, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 822
    .line 823
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 824
    .line 825
    .line 826
    move-result-wide v6

    .line 827
    sget-object v9, La/jd8;->n:La/ljc;

    .line 828
    .line 829
    invoke-static {v5, v6, v7, v9}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 830
    .line 831
    .line 832
    move-result-object v5

    .line 833
    sget-object v6, La/gqw0;->a:La/zx7;

    .line 834
    .line 835
    invoke-static {v6, v12}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 836
    .line 837
    .line 838
    move-result-object v6

    .line 839
    iget-wide v9, v4, La/fet;->T:J

    .line 840
    .line 841
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 842
    .line 843
    .line 844
    move-result v7

    .line 845
    invoke-virtual {v4}, La/fet;->m()La/bh90;

    .line 846
    .line 847
    .line 848
    move-result-object v9

    .line 849
    invoke-static {v4, v5}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 850
    .line 851
    .line 852
    move-result-object v5

    .line 853
    sget-object v10, La/mkd;->c0:La/gqw0;

    .line 854
    .line 855
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 856
    .line 857
    .line 858
    invoke-virtual {v4}, La/fet;->i0()V

    .line 859
    .line 860
    .line 861
    iget-boolean v10, v4, La/fet;->S:Z

    .line 862
    .line 863
    sget-object v14, La/e7z;->u1:La/pcy;

    .line 864
    .line 865
    if-eqz v10, :cond_1b

    .line 866
    .line 867
    invoke-virtual {v4, v14}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 868
    .line 869
    .line 870
    goto :goto_14

    .line 871
    :cond_1b
    invoke-virtual {v4}, La/fet;->r0()V

    .line 872
    .line 873
    .line 874
    :goto_14
    sget-object v10, La/gqw0;->x:La/shd;

    .line 875
    .line 876
    invoke-static {v4, v6, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 877
    .line 878
    .line 879
    sget-object v6, La/gqw0;->w:La/shd;

    .line 880
    .line 881
    invoke-static {v4, v9, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 882
    .line 883
    .line 884
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 885
    .line 886
    .line 887
    move-result-object v7

    .line 888
    sget-object v9, La/gqw0;->y:La/shd;

    .line 889
    .line 890
    invoke-static {v4, v7, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 891
    .line 892
    .line 893
    invoke-static {v4}, La/jpm0;->n(La/fet;)V

    .line 894
    .line 895
    .line 896
    sget-object v7, La/gqw0;->v:La/shd;

    .line 897
    .line 898
    invoke-static {v4, v5, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 899
    .line 900
    .line 901
    sget-object v5, La/o7k0;->c:La/n0q;

    .line 902
    .line 903
    const/high16 v15, 0x41400000    # 12.0f

    .line 904
    .line 905
    const/high16 v3, 0x41200000    # 10.0f

    .line 906
    .line 907
    invoke-static {v5, v15, v3}, La/s5x0;->K(La/mm40;FF)La/mm40;

    .line 908
    .line 909
    .line 910
    move-result-object v3

    .line 911
    sget-object v5, La/gqw0;->k:La/yx7;

    .line 912
    .line 913
    sget-object v15, La/uc9;->a:La/lw3;

    .line 914
    .line 915
    const/16 v8, 0x30

    .line 916
    .line 917
    invoke-static {v15, v5, v4, v8}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 918
    .line 919
    .line 920
    move-result-object v5

    .line 921
    iget-wide v11, v4, La/fet;->T:J

    .line 922
    .line 923
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    .line 924
    .line 925
    .line 926
    move-result v11

    .line 927
    invoke-virtual {v4}, La/fet;->m()La/bh90;

    .line 928
    .line 929
    .line 930
    move-result-object v12

    .line 931
    invoke-static {v4, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 932
    .line 933
    .line 934
    move-result-object v3

    .line 935
    invoke-virtual {v4}, La/fet;->i0()V

    .line 936
    .line 937
    .line 938
    iget-boolean v15, v4, La/fet;->S:Z

    .line 939
    .line 940
    if-eqz v15, :cond_1c

    .line 941
    .line 942
    invoke-virtual {v4, v14}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 943
    .line 944
    .line 945
    goto :goto_15

    .line 946
    :cond_1c
    invoke-virtual {v4}, La/fet;->r0()V

    .line 947
    .line 948
    .line 949
    :goto_15
    invoke-static {v4, v5, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 950
    .line 951
    .line 952
    invoke-static {v4, v12, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 953
    .line 954
    .line 955
    invoke-static {v11, v4, v9, v4}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 956
    .line 957
    .line 958
    invoke-static {v4, v3, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 959
    .line 960
    .line 961
    const/high16 v3, 0x42200000    # 40.0f

    .line 962
    .line 963
    invoke-static {v13, v3}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 964
    .line 965
    .line 966
    move-result-object v3

    .line 967
    sget-object v5, La/qmk;->m:La/zcl;

    .line 968
    .line 969
    sget-object v6, La/vgg0;->a:La/ugg0;

    .line 970
    .line 971
    invoke-static {v5, v5, v5, v5, v3}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 972
    .line 973
    .line 974
    move-result-object v3

    .line 975
    invoke-static {v3, v0}, La/xbc;->c0(La/mm40;La/fqj0;)La/mm40;

    .line 976
    .line 977
    .line 978
    move-result-object v3

    .line 979
    const/4 v5, 0x0

    .line 980
    invoke-static {v5, v4, v3}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 981
    .line 982
    .line 983
    const/16 v17, 0x0

    .line 984
    .line 985
    const/16 v18, 0xe

    .line 986
    .line 987
    const/high16 v14, 0x41400000    # 12.0f

    .line 988
    .line 989
    const/4 v15, 0x0

    .line 990
    const/16 v16, 0x0

    .line 991
    .line 992
    invoke-static/range {v13 .. v18}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 993
    .line 994
    .line 995
    move-result-object v3

    .line 996
    sget-object v5, La/qmk;->i:La/zcl;

    .line 997
    .line 998
    invoke-static {v5, v5, v5, v5, v3}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 999
    .line 1000
    .line 1001
    move-result-object v3

    .line 1002
    if-eqz v1, :cond_1d

    .line 1003
    .line 1004
    const/high16 v1, 0x43000000    # 128.0f

    .line 1005
    .line 1006
    goto :goto_16

    .line 1007
    :cond_1d
    const/high16 v1, 0x42c00000    # 96.0f

    .line 1008
    .line 1009
    :goto_16
    invoke-static {v3, v1}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v1

    .line 1013
    const/high16 v3, 0x41800000    # 16.0f

    .line 1014
    .line 1015
    invoke-static {v1, v3}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v1

    .line 1019
    invoke-static {v1, v0}, La/xbc;->c0(La/mm40;La/fqj0;)La/mm40;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v0

    .line 1023
    const/4 v5, 0x0

    .line 1024
    invoke-static {v5, v4, v0}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 1025
    .line 1026
    .line 1027
    const/4 v8, 0x1

    .line 1028
    invoke-virtual {v4, v8}, La/fet;->r(Z)V

    .line 1029
    .line 1030
    .line 1031
    const/4 v0, 0x7

    .line 1032
    if-eq v2, v0, :cond_1e

    .line 1033
    .line 1034
    const v0, 0x36ca7592

    .line 1035
    .line 1036
    .line 1037
    invoke-virtual {v4, v0}, La/fet;->e0(I)V

    .line 1038
    .line 1039
    .line 1040
    const/16 v17, 0x0

    .line 1041
    .line 1042
    const/16 v18, 0xe

    .line 1043
    .line 1044
    const/high16 v14, 0x42700000    # 60.0f

    .line 1045
    .line 1046
    const/4 v15, 0x0

    .line 1047
    const/16 v16, 0x0

    .line 1048
    .line 1049
    invoke-static/range {v13 .. v18}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v0

    .line 1053
    const/high16 v1, 0x3f800000    # 1.0f

    .line 1054
    .line 1055
    invoke-static {v0, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v0

    .line 1059
    sget-object v1, La/gqw0;->i:La/zx7;

    .line 1060
    .line 1061
    sget-object v2, La/jr8;->a:La/jr8;

    .line 1062
    .line 1063
    invoke-virtual {v2, v0, v1}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v14

    .line 1067
    const/16 v17, 0x6

    .line 1068
    .line 1069
    const/16 v18, 0x4

    .line 1070
    .line 1071
    sget-object v13, La/zfi0;->a:La/zfi0;

    .line 1072
    .line 1073
    const/4 v15, 0x0

    .line 1074
    move-object/from16 v16, v4

    .line 1075
    .line 1076
    invoke-static/range {v13 .. v18}, La/mbc;->o(La/bgi0;La/mm40;ZLa/fet;II)V

    .line 1077
    .line 1078
    .line 1079
    move-object/from16 v0, v16

    .line 1080
    .line 1081
    const/4 v5, 0x0

    .line 1082
    invoke-virtual {v0, v5}, La/fet;->r(Z)V

    .line 1083
    .line 1084
    .line 1085
    :goto_17
    const/4 v8, 0x1

    .line 1086
    goto :goto_18

    .line 1087
    :cond_1e
    move-object v0, v4

    .line 1088
    const/4 v5, 0x0

    .line 1089
    const v1, 0x36cf3f86

    .line 1090
    .line 1091
    .line 1092
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 1093
    .line 1094
    .line 1095
    invoke-virtual {v0, v5}, La/fet;->r(Z)V

    .line 1096
    .line 1097
    .line 1098
    goto :goto_17

    .line 1099
    :goto_18
    invoke-virtual {v0, v8}, La/fet;->r(Z)V

    .line 1100
    .line 1101
    .line 1102
    goto :goto_19

    .line 1103
    :cond_1f
    move-object v0, v4

    .line 1104
    invoke-virtual {v0}, La/fet;->X()V

    .line 1105
    .line 1106
    .line 1107
    :goto_19
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1108
    .line 1109
    return-object v0

    .line 1110
    nop

    .line 1111
    :pswitch_data_0
    .packed-switch 0x0
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
