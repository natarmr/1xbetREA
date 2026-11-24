.class public final synthetic La/fp0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;


# direct methods
.method public synthetic constructor <init>(La/mm40;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/fp0;->a:B

    iput-object p1, p0, La/fp0;->b:La/mm40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/fp0;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x41c00000    # 24.0f

    .line 6
    .line 7
    const/16 v3, 0x6038

    .line 8
    .line 9
    const/16 v4, 0x82

    .line 10
    .line 11
    const/high16 v5, 0x41880000    # 17.0f

    .line 12
    .line 13
    const/high16 v6, 0x42000000    # 32.0f

    .line 14
    .line 15
    sget-object v7, La/jm40;->b:La/jm40;

    .line 16
    .line 17
    iget-object v8, v0, La/fp0;->b:La/mm40;

    .line 18
    .line 19
    const/16 v9, 0x92

    .line 20
    .line 21
    const/16 v10, 0x10

    .line 22
    .line 23
    const/16 v11, 0x20

    .line 24
    .line 25
    const/4 v12, 0x2

    .line 26
    const/4 v13, 0x4

    .line 27
    const/4 v14, 0x0

    .line 28
    const/4 v15, 0x1

    .line 29
    packed-switch v1, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    move-object/from16 v0, p1

    .line 33
    .line 34
    check-cast v0, La/j83;

    .line 35
    .line 36
    move-object/from16 v1, p2

    .line 37
    .line 38
    check-cast v1, La/j83;

    .line 39
    .line 40
    move-object/from16 v2, p3

    .line 41
    .line 42
    check-cast v2, La/fet;

    .line 43
    .line 44
    move-object/from16 v3, p4

    .line 45
    .line 46
    check-cast v3, Ljava/lang/Integer;

    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    and-int/lit8 v4, v3, 0x6

    .line 59
    .line 60
    if-nez v4, :cond_1

    .line 61
    .line 62
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_0

    .line 67
    .line 68
    move v12, v13

    .line 69
    :cond_0
    or-int v4, v3, v12

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    move v4, v3

    .line 73
    :goto_0
    and-int/lit8 v3, v3, 0x30

    .line 74
    .line 75
    if-nez v3, :cond_3

    .line 76
    .line 77
    invoke-virtual {v2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_2

    .line 82
    .line 83
    move v10, v11

    .line 84
    :cond_2
    or-int/2addr v4, v10

    .line 85
    :cond_3
    and-int/lit16 v3, v4, 0x93

    .line 86
    .line 87
    if-eq v3, v9, :cond_4

    .line 88
    .line 89
    move v14, v15

    .line 90
    :cond_4
    and-int/lit8 v3, v4, 0x1

    .line 91
    .line 92
    invoke-virtual {v2, v3, v14}, La/fet;->U(IZ)Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-eqz v3, :cond_5

    .line 97
    .line 98
    sget-object v3, La/j1t0;->e:La/zfn;

    .line 99
    .line 100
    invoke-virtual {v2, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    check-cast v5, La/g1t0;

    .line 105
    .line 106
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-static {}, La/g1t0;->d()La/y9q0;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    shl-int/lit8 v6, v4, 0x3

    .line 114
    .line 115
    and-int/lit8 v6, v6, 0x70

    .line 116
    .line 117
    or-int/lit8 v6, v6, 0x6

    .line 118
    .line 119
    invoke-static {v8, v0, v5, v2, v6}, La/w9x;->s(La/mm40;La/j83;La/y9q0;La/fet;I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    check-cast v0, La/g1t0;

    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-static {}, La/g1t0;->d()La/y9q0;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    and-int/lit8 v3, v4, 0x70

    .line 136
    .line 137
    or-int/lit8 v3, v3, 0x6

    .line 138
    .line 139
    invoke-static {v8, v1, v0, v2, v3}, La/w9x;->s(La/mm40;La/j83;La/y9q0;La/fet;I)V

    .line 140
    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_5
    invoke-virtual {v2}, La/fet;->X()V

    .line 144
    .line 145
    .line 146
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    return-object v0

    .line 149
    :pswitch_0
    move-object/from16 v0, p1

    .line 150
    .line 151
    check-cast v0, La/j83;

    .line 152
    .line 153
    move-object/from16 v1, p2

    .line 154
    .line 155
    check-cast v1, La/j83;

    .line 156
    .line 157
    move-object/from16 v2, p3

    .line 158
    .line 159
    check-cast v2, La/fet;

    .line 160
    .line 161
    move-object/from16 v3, p4

    .line 162
    .line 163
    check-cast v3, Ljava/lang/Integer;

    .line 164
    .line 165
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    and-int/lit8 v4, v3, 0x6

    .line 176
    .line 177
    if-nez v4, :cond_7

    .line 178
    .line 179
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    if-eqz v4, :cond_6

    .line 184
    .line 185
    move v12, v13

    .line 186
    :cond_6
    or-int v4, v3, v12

    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_7
    move v4, v3

    .line 190
    :goto_2
    and-int/lit8 v3, v3, 0x30

    .line 191
    .line 192
    if-nez v3, :cond_9

    .line 193
    .line 194
    invoke-virtual {v2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    if-eqz v3, :cond_8

    .line 199
    .line 200
    move v10, v11

    .line 201
    :cond_8
    or-int/2addr v4, v10

    .line 202
    :cond_9
    and-int/lit16 v3, v4, 0x93

    .line 203
    .line 204
    if-eq v3, v9, :cond_a

    .line 205
    .line 206
    move v14, v15

    .line 207
    :cond_a
    and-int/lit8 v3, v4, 0x1

    .line 208
    .line 209
    invoke-virtual {v2, v3, v14}, La/fet;->U(IZ)Z

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    if-eqz v3, :cond_b

    .line 214
    .line 215
    sget-object v3, La/j1t0;->e:La/zfn;

    .line 216
    .line 217
    invoke-virtual {v2, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    check-cast v5, La/g1t0;

    .line 222
    .line 223
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    invoke-static {}, La/g1t0;->d()La/y9q0;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    shl-int/lit8 v6, v4, 0x3

    .line 231
    .line 232
    and-int/lit8 v6, v6, 0x70

    .line 233
    .line 234
    or-int/lit8 v6, v6, 0x6

    .line 235
    .line 236
    invoke-static {v8, v0, v5, v2, v6}, La/x9x;->w(La/mm40;La/j83;La/y9q0;La/fet;I)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v2, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    check-cast v0, La/g1t0;

    .line 244
    .line 245
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    invoke-static {}, La/g1t0;->d()La/y9q0;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    and-int/lit8 v3, v4, 0x70

    .line 253
    .line 254
    or-int/lit8 v3, v3, 0x6

    .line 255
    .line 256
    invoke-static {v8, v1, v0, v2, v3}, La/x9x;->w(La/mm40;La/j83;La/y9q0;La/fet;I)V

    .line 257
    .line 258
    .line 259
    goto :goto_3

    .line 260
    :cond_b
    invoke-virtual {v2}, La/fet;->X()V

    .line 261
    .line 262
    .line 263
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 264
    .line 265
    return-object v0

    .line 266
    :pswitch_1
    move-object/from16 v1, p1

    .line 267
    .line 268
    check-cast v1, La/j83;

    .line 269
    .line 270
    move-object/from16 v2, p2

    .line 271
    .line 272
    check-cast v2, La/j83;

    .line 273
    .line 274
    move-object/from16 v3, p3

    .line 275
    .line 276
    check-cast v3, La/fet;

    .line 277
    .line 278
    move-object/from16 v4, p4

    .line 279
    .line 280
    check-cast v4, Ljava/lang/Integer;

    .line 281
    .line 282
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 283
    .line 284
    .line 285
    move-result v4

    .line 286
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    and-int/lit8 v8, v4, 0x6

    .line 293
    .line 294
    if-nez v8, :cond_d

    .line 295
    .line 296
    invoke-virtual {v3, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result v8

    .line 300
    if-eqz v8, :cond_c

    .line 301
    .line 302
    move v12, v13

    .line 303
    :cond_c
    or-int v8, v4, v12

    .line 304
    .line 305
    goto :goto_4

    .line 306
    :cond_d
    move v8, v4

    .line 307
    :goto_4
    and-int/lit8 v4, v4, 0x30

    .line 308
    .line 309
    if-nez v4, :cond_f

    .line 310
    .line 311
    invoke-virtual {v3, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v4

    .line 315
    if-eqz v4, :cond_e

    .line 316
    .line 317
    move v10, v11

    .line 318
    :cond_e
    or-int/2addr v8, v10

    .line 319
    :cond_f
    and-int/lit16 v4, v8, 0x93

    .line 320
    .line 321
    if-eq v4, v9, :cond_10

    .line 322
    .line 323
    move v14, v15

    .line 324
    :cond_10
    and-int/lit8 v4, v8, 0x1

    .line 325
    .line 326
    invoke-virtual {v3, v4, v14}, La/fet;->U(IZ)Z

    .line 327
    .line 328
    .line 329
    move-result v4

    .line 330
    if-eqz v4, :cond_11

    .line 331
    .line 332
    sget-object v4, La/qmk;->a:La/zcl;

    .line 333
    .line 334
    const/4 v13, 0x0

    .line 335
    const/16 v14, 0xd

    .line 336
    .line 337
    iget-object v9, v0, La/fp0;->b:La/mm40;

    .line 338
    .line 339
    const/4 v10, 0x0

    .line 340
    const/high16 v11, 0x41000000    # 8.0f

    .line 341
    .line 342
    const/4 v12, 0x0

    .line 343
    invoke-static/range {v9 .. v14}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    invoke-static {v0, v6}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    sget-object v4, La/j1t0;->e:La/zfn;

    .line 352
    .line 353
    invoke-virtual {v3, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v10

    .line 357
    check-cast v10, La/g1t0;

    .line 358
    .line 359
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    invoke-static {}, La/g1t0;->g()La/y9q0;

    .line 363
    .line 364
    .line 365
    move-result-object v10

    .line 366
    shl-int/lit8 v11, v8, 0x3

    .line 367
    .line 368
    and-int/lit8 v11, v11, 0x70

    .line 369
    .line 370
    invoke-static {v0, v1, v10, v3, v11}, La/t9x;->u(La/mm40;La/j83;La/y9q0;La/fet;I)V

    .line 371
    .line 372
    .line 373
    invoke-static {v7, v5}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    invoke-static {v3, v0}, La/qxw;->o(La/fet;La/mm40;)V

    .line 378
    .line 379
    .line 380
    invoke-static {v9, v6}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    invoke-virtual {v3, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    check-cast v1, La/g1t0;

    .line 389
    .line 390
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 391
    .line 392
    .line 393
    invoke-static {}, La/g1t0;->g()La/y9q0;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    and-int/lit8 v4, v8, 0x70

    .line 398
    .line 399
    invoke-static {v0, v2, v1, v3, v4}, La/t9x;->u(La/mm40;La/j83;La/y9q0;La/fet;I)V

    .line 400
    .line 401
    .line 402
    goto :goto_5

    .line 403
    :cond_11
    invoke-virtual {v3}, La/fet;->X()V

    .line 404
    .line 405
    .line 406
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 407
    .line 408
    return-object v0

    .line 409
    :pswitch_2
    move-object/from16 v0, p1

    .line 410
    .line 411
    check-cast v0, La/j83;

    .line 412
    .line 413
    move-object/from16 v1, p2

    .line 414
    .line 415
    check-cast v1, La/j83;

    .line 416
    .line 417
    move-object/from16 v2, p3

    .line 418
    .line 419
    check-cast v2, La/fet;

    .line 420
    .line 421
    move-object/from16 v3, p4

    .line 422
    .line 423
    check-cast v3, Ljava/lang/Integer;

    .line 424
    .line 425
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 426
    .line 427
    .line 428
    move-result v3

    .line 429
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 433
    .line 434
    .line 435
    and-int/lit8 v4, v3, 0x6

    .line 436
    .line 437
    if-nez v4, :cond_13

    .line 438
    .line 439
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 440
    .line 441
    .line 442
    move-result v4

    .line 443
    if-eqz v4, :cond_12

    .line 444
    .line 445
    move v12, v13

    .line 446
    :cond_12
    or-int v4, v3, v12

    .line 447
    .line 448
    goto :goto_6

    .line 449
    :cond_13
    move v4, v3

    .line 450
    :goto_6
    and-int/lit8 v3, v3, 0x30

    .line 451
    .line 452
    if-nez v3, :cond_15

    .line 453
    .line 454
    invoke-virtual {v2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    move-result v3

    .line 458
    if-eqz v3, :cond_14

    .line 459
    .line 460
    move v10, v11

    .line 461
    :cond_14
    or-int/2addr v4, v10

    .line 462
    :cond_15
    and-int/lit16 v3, v4, 0x93

    .line 463
    .line 464
    if-eq v3, v9, :cond_16

    .line 465
    .line 466
    move v14, v15

    .line 467
    :cond_16
    and-int/lit8 v3, v4, 0x1

    .line 468
    .line 469
    invoke-virtual {v2, v3, v14}, La/fet;->U(IZ)Z

    .line 470
    .line 471
    .line 472
    move-result v3

    .line 473
    if-eqz v3, :cond_17

    .line 474
    .line 475
    sget-object v3, La/j1t0;->e:La/zfn;

    .line 476
    .line 477
    invoke-virtual {v2, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v5

    .line 481
    check-cast v5, La/g1t0;

    .line 482
    .line 483
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 484
    .line 485
    .line 486
    invoke-static {}, La/g1t0;->d()La/y9q0;

    .line 487
    .line 488
    .line 489
    move-result-object v5

    .line 490
    shl-int/lit8 v6, v4, 0x3

    .line 491
    .line 492
    and-int/lit8 v6, v6, 0x70

    .line 493
    .line 494
    or-int/lit8 v6, v6, 0x6

    .line 495
    .line 496
    invoke-static {v8, v0, v5, v2, v6}, La/kcx;->r(La/mm40;La/j83;La/y9q0;La/fet;I)V

    .line 497
    .line 498
    .line 499
    invoke-virtual {v2, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    check-cast v0, La/g1t0;

    .line 504
    .line 505
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 506
    .line 507
    .line 508
    invoke-static {}, La/g1t0;->d()La/y9q0;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    and-int/lit8 v3, v4, 0x70

    .line 513
    .line 514
    or-int/lit8 v3, v3, 0x6

    .line 515
    .line 516
    invoke-static {v8, v1, v0, v2, v3}, La/kcx;->r(La/mm40;La/j83;La/y9q0;La/fet;I)V

    .line 517
    .line 518
    .line 519
    goto :goto_7

    .line 520
    :cond_17
    invoke-virtual {v2}, La/fet;->X()V

    .line 521
    .line 522
    .line 523
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 524
    .line 525
    return-object v0

    .line 526
    :pswitch_3
    move-object/from16 v1, p1

    .line 527
    .line 528
    check-cast v1, La/pm80;

    .line 529
    .line 530
    move-object/from16 v2, p2

    .line 531
    .line 532
    check-cast v2, La/o0x;

    .line 533
    .line 534
    move-object/from16 v8, p3

    .line 535
    .line 536
    check-cast v8, La/fet;

    .line 537
    .line 538
    move-object/from16 v5, p4

    .line 539
    .line 540
    check-cast v5, Ljava/lang/Integer;

    .line 541
    .line 542
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 543
    .line 544
    .line 545
    move-result v5

    .line 546
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 547
    .line 548
    .line 549
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 550
    .line 551
    .line 552
    and-int/lit8 v2, v5, 0x6

    .line 553
    .line 554
    if-nez v2, :cond_1a

    .line 555
    .line 556
    and-int/lit8 v2, v5, 0x8

    .line 557
    .line 558
    if-nez v2, :cond_18

    .line 559
    .line 560
    invoke-virtual {v8, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 561
    .line 562
    .line 563
    move-result v2

    .line 564
    goto :goto_8

    .line 565
    :cond_18
    invoke-virtual {v8, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 566
    .line 567
    .line 568
    move-result v2

    .line 569
    :goto_8
    if-eqz v2, :cond_19

    .line 570
    .line 571
    move v12, v13

    .line 572
    :cond_19
    or-int/2addr v5, v12

    .line 573
    :cond_1a
    and-int/lit16 v2, v5, 0x83

    .line 574
    .line 575
    if-eq v2, v4, :cond_1b

    .line 576
    .line 577
    move v14, v15

    .line 578
    :cond_1b
    and-int/lit8 v2, v5, 0x1

    .line 579
    .line 580
    invoke-virtual {v8, v2, v14}, La/fet;->U(IZ)Z

    .line 581
    .line 582
    .line 583
    move-result v2

    .line 584
    if-eqz v2, :cond_1c

    .line 585
    .line 586
    move v2, v5

    .line 587
    sget-object v5, La/gqw0;->A:La/pge;

    .line 588
    .line 589
    and-int/lit8 v2, v2, 0xe

    .line 590
    .line 591
    or-int v9, v3, v2

    .line 592
    .line 593
    const/16 v10, 0x68

    .line 594
    .line 595
    const/4 v2, 0x0

    .line 596
    iget-object v3, v0, La/fp0;->b:La/mm40;

    .line 597
    .line 598
    const/4 v4, 0x0

    .line 599
    const/4 v6, 0x0

    .line 600
    const/4 v7, 0x0

    .line 601
    invoke-static/range {v1 .. v10}, La/j0x;->b(La/pm80;Ljava/lang/String;La/mm40;La/u12;La/qge;FLa/a4d;La/fet;II)V

    .line 602
    .line 603
    .line 604
    goto :goto_9

    .line 605
    :cond_1c
    invoke-virtual {v8}, La/fet;->X()V

    .line 606
    .line 607
    .line 608
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 609
    .line 610
    return-object v0

    .line 611
    :pswitch_4
    move-object/from16 v1, p1

    .line 612
    .line 613
    check-cast v1, La/pm80;

    .line 614
    .line 615
    move-object/from16 v0, p2

    .line 616
    .line 617
    check-cast v0, La/o0x;

    .line 618
    .line 619
    move-object/from16 v2, p3

    .line 620
    .line 621
    check-cast v2, La/fet;

    .line 622
    .line 623
    move-object/from16 v5, p4

    .line 624
    .line 625
    check-cast v5, Ljava/lang/Integer;

    .line 626
    .line 627
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 628
    .line 629
    .line 630
    move-result v5

    .line 631
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 632
    .line 633
    .line 634
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 635
    .line 636
    .line 637
    and-int/lit8 v0, v5, 0x6

    .line 638
    .line 639
    if-nez v0, :cond_1f

    .line 640
    .line 641
    and-int/lit8 v0, v5, 0x8

    .line 642
    .line 643
    if-nez v0, :cond_1d

    .line 644
    .line 645
    invoke-virtual {v2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 646
    .line 647
    .line 648
    move-result v0

    .line 649
    goto :goto_a

    .line 650
    :cond_1d
    invoke-virtual {v2, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 651
    .line 652
    .line 653
    move-result v0

    .line 654
    :goto_a
    if-eqz v0, :cond_1e

    .line 655
    .line 656
    move v12, v13

    .line 657
    :cond_1e
    or-int/2addr v5, v12

    .line 658
    :cond_1f
    and-int/lit16 v0, v5, 0x83

    .line 659
    .line 660
    if-eq v0, v4, :cond_20

    .line 661
    .line 662
    move v14, v15

    .line 663
    :cond_20
    and-int/lit8 v0, v5, 0x1

    .line 664
    .line 665
    invoke-virtual {v2, v0, v14}, La/fet;->U(IZ)Z

    .line 666
    .line 667
    .line 668
    move-result v0

    .line 669
    if-eqz v0, :cond_21

    .line 670
    .line 671
    sget-object v0, La/qmk;->a:La/zcl;

    .line 672
    .line 673
    const/high16 v0, 0x41400000    # 12.0f

    .line 674
    .line 675
    invoke-static {v8, v0}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 676
    .line 677
    .line 678
    move-result-object v4

    .line 679
    const/high16 v6, 0x42700000    # 60.0f

    .line 680
    .line 681
    invoke-static {v4, v6}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 682
    .line 683
    .line 684
    move-result-object v4

    .line 685
    invoke-static {v0}, La/vgg0;->a(F)La/ugg0;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    invoke-static {v4, v0}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    move v4, v5

    .line 694
    sget-object v5, La/gqw0;->A:La/pge;

    .line 695
    .line 696
    and-int/lit8 v4, v4, 0xe

    .line 697
    .line 698
    or-int v9, v3, v4

    .line 699
    .line 700
    const/16 v10, 0x68

    .line 701
    .line 702
    move-object v8, v2

    .line 703
    const/4 v2, 0x0

    .line 704
    const/4 v4, 0x0

    .line 705
    const/4 v6, 0x0

    .line 706
    const/4 v7, 0x0

    .line 707
    move-object v3, v0

    .line 708
    invoke-static/range {v1 .. v10}, La/j0x;->b(La/pm80;Ljava/lang/String;La/mm40;La/u12;La/qge;FLa/a4d;La/fet;II)V

    .line 709
    .line 710
    .line 711
    goto :goto_b

    .line 712
    :cond_21
    move-object v8, v2

    .line 713
    invoke-virtual {v8}, La/fet;->X()V

    .line 714
    .line 715
    .line 716
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 717
    .line 718
    return-object v0

    .line 719
    :pswitch_5
    move-object/from16 v1, p1

    .line 720
    .line 721
    check-cast v1, La/j83;

    .line 722
    .line 723
    move-object/from16 v2, p2

    .line 724
    .line 725
    check-cast v2, La/j83;

    .line 726
    .line 727
    move-object/from16 v3, p3

    .line 728
    .line 729
    check-cast v3, La/fet;

    .line 730
    .line 731
    move-object/from16 v4, p4

    .line 732
    .line 733
    check-cast v4, Ljava/lang/Integer;

    .line 734
    .line 735
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 736
    .line 737
    .line 738
    move-result v4

    .line 739
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 740
    .line 741
    .line 742
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 743
    .line 744
    .line 745
    and-int/lit8 v8, v4, 0x6

    .line 746
    .line 747
    if-nez v8, :cond_23

    .line 748
    .line 749
    invoke-virtual {v3, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 750
    .line 751
    .line 752
    move-result v8

    .line 753
    if-eqz v8, :cond_22

    .line 754
    .line 755
    move v12, v13

    .line 756
    :cond_22
    or-int v8, v4, v12

    .line 757
    .line 758
    goto :goto_c

    .line 759
    :cond_23
    move v8, v4

    .line 760
    :goto_c
    and-int/lit8 v4, v4, 0x30

    .line 761
    .line 762
    if-nez v4, :cond_25

    .line 763
    .line 764
    invoke-virtual {v3, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 765
    .line 766
    .line 767
    move-result v4

    .line 768
    if-eqz v4, :cond_24

    .line 769
    .line 770
    move v10, v11

    .line 771
    :cond_24
    or-int/2addr v8, v10

    .line 772
    :cond_25
    and-int/lit16 v4, v8, 0x93

    .line 773
    .line 774
    if-eq v4, v9, :cond_26

    .line 775
    .line 776
    move v14, v15

    .line 777
    :cond_26
    and-int/lit8 v4, v8, 0x1

    .line 778
    .line 779
    invoke-virtual {v3, v4, v14}, La/fet;->U(IZ)Z

    .line 780
    .line 781
    .line 782
    move-result v4

    .line 783
    if-eqz v4, :cond_27

    .line 784
    .line 785
    sget-object v4, La/qmk;->a:La/zcl;

    .line 786
    .line 787
    const/4 v13, 0x0

    .line 788
    const/16 v14, 0xd

    .line 789
    .line 790
    iget-object v9, v0, La/fp0;->b:La/mm40;

    .line 791
    .line 792
    const/4 v10, 0x0

    .line 793
    const/high16 v11, 0x41000000    # 8.0f

    .line 794
    .line 795
    const/4 v12, 0x0

    .line 796
    invoke-static/range {v9 .. v14}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 797
    .line 798
    .line 799
    move-result-object v0

    .line 800
    invoke-static {v0, v6}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 801
    .line 802
    .line 803
    move-result-object v0

    .line 804
    sget-object v4, La/j1t0;->e:La/zfn;

    .line 805
    .line 806
    invoke-virtual {v3, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 807
    .line 808
    .line 809
    move-result-object v10

    .line 810
    check-cast v10, La/g1t0;

    .line 811
    .line 812
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 813
    .line 814
    .line 815
    invoke-static {}, La/g1t0;->g()La/y9q0;

    .line 816
    .line 817
    .line 818
    move-result-object v10

    .line 819
    shl-int/lit8 v11, v8, 0x3

    .line 820
    .line 821
    and-int/lit8 v11, v11, 0x70

    .line 822
    .line 823
    invoke-static {v0, v1, v10, v3, v11}, La/t9x;->u(La/mm40;La/j83;La/y9q0;La/fet;I)V

    .line 824
    .line 825
    .line 826
    invoke-static {v7, v5}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 827
    .line 828
    .line 829
    move-result-object v0

    .line 830
    invoke-static {v3, v0}, La/qxw;->o(La/fet;La/mm40;)V

    .line 831
    .line 832
    .line 833
    invoke-static {v9, v6}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 834
    .line 835
    .line 836
    move-result-object v0

    .line 837
    invoke-virtual {v3, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 838
    .line 839
    .line 840
    move-result-object v1

    .line 841
    check-cast v1, La/g1t0;

    .line 842
    .line 843
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 844
    .line 845
    .line 846
    invoke-static {}, La/g1t0;->g()La/y9q0;

    .line 847
    .line 848
    .line 849
    move-result-object v1

    .line 850
    and-int/lit8 v4, v8, 0x70

    .line 851
    .line 852
    invoke-static {v0, v2, v1, v3, v4}, La/t9x;->u(La/mm40;La/j83;La/y9q0;La/fet;I)V

    .line 853
    .line 854
    .line 855
    goto :goto_d

    .line 856
    :cond_27
    invoke-virtual {v3}, La/fet;->X()V

    .line 857
    .line 858
    .line 859
    :goto_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 860
    .line 861
    return-object v0

    .line 862
    :pswitch_6
    move-object/from16 v1, p1

    .line 863
    .line 864
    check-cast v1, La/j83;

    .line 865
    .line 866
    move-object/from16 v3, p2

    .line 867
    .line 868
    check-cast v3, La/j83;

    .line 869
    .line 870
    move-object/from16 v4, p3

    .line 871
    .line 872
    check-cast v4, La/fet;

    .line 873
    .line 874
    move-object/from16 v5, p4

    .line 875
    .line 876
    check-cast v5, Ljava/lang/Integer;

    .line 877
    .line 878
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 879
    .line 880
    .line 881
    move-result v5

    .line 882
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 883
    .line 884
    .line 885
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 886
    .line 887
    .line 888
    and-int/lit8 v6, v5, 0x6

    .line 889
    .line 890
    if-nez v6, :cond_29

    .line 891
    .line 892
    invoke-virtual {v4, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 893
    .line 894
    .line 895
    move-result v6

    .line 896
    if-eqz v6, :cond_28

    .line 897
    .line 898
    move v12, v13

    .line 899
    :cond_28
    or-int v6, v5, v12

    .line 900
    .line 901
    goto :goto_e

    .line 902
    :cond_29
    move v6, v5

    .line 903
    :goto_e
    and-int/lit8 v5, v5, 0x30

    .line 904
    .line 905
    if-nez v5, :cond_2b

    .line 906
    .line 907
    invoke-virtual {v4, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 908
    .line 909
    .line 910
    move-result v5

    .line 911
    if-eqz v5, :cond_2a

    .line 912
    .line 913
    move v10, v11

    .line 914
    :cond_2a
    or-int/2addr v6, v10

    .line 915
    :cond_2b
    and-int/lit16 v5, v6, 0x93

    .line 916
    .line 917
    if-eq v5, v9, :cond_2c

    .line 918
    .line 919
    move v14, v15

    .line 920
    :cond_2c
    and-int/lit8 v5, v6, 0x1

    .line 921
    .line 922
    invoke-virtual {v4, v5, v14}, La/fet;->U(IZ)Z

    .line 923
    .line 924
    .line 925
    move-result v5

    .line 926
    if-eqz v5, :cond_2d

    .line 927
    .line 928
    sget-object v5, La/qmk;->a:La/zcl;

    .line 929
    .line 930
    const/4 v12, 0x0

    .line 931
    const/16 v13, 0xd

    .line 932
    .line 933
    iget-object v8, v0, La/fp0;->b:La/mm40;

    .line 934
    .line 935
    const/4 v9, 0x0

    .line 936
    const/high16 v10, 0x40800000    # 4.0f

    .line 937
    .line 938
    const/4 v11, 0x0

    .line 939
    invoke-static/range {v8 .. v13}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 940
    .line 941
    .line 942
    move-result-object v0

    .line 943
    invoke-static {v0, v2}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 944
    .line 945
    .line 946
    move-result-object v0

    .line 947
    sget-object v5, La/j1t0;->e:La/zfn;

    .line 948
    .line 949
    invoke-virtual {v4, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 950
    .line 951
    .line 952
    move-result-object v9

    .line 953
    check-cast v9, La/g1t0;

    .line 954
    .line 955
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 956
    .line 957
    .line 958
    invoke-static {}, La/g1t0;->g()La/y9q0;

    .line 959
    .line 960
    .line 961
    move-result-object v9

    .line 962
    shl-int/lit8 v10, v6, 0x3

    .line 963
    .line 964
    and-int/lit8 v10, v10, 0x70

    .line 965
    .line 966
    invoke-static {v0, v1, v9, v4, v10}, La/t9x;->u(La/mm40;La/j83;La/y9q0;La/fet;I)V

    .line 967
    .line 968
    .line 969
    const/high16 v0, 0x40a00000    # 5.0f

    .line 970
    .line 971
    invoke-static {v7, v0}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 972
    .line 973
    .line 974
    move-result-object v0

    .line 975
    invoke-static {v4, v0}, La/qxw;->o(La/fet;La/mm40;)V

    .line 976
    .line 977
    .line 978
    invoke-static {v8, v2}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 979
    .line 980
    .line 981
    move-result-object v0

    .line 982
    invoke-virtual {v4, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 983
    .line 984
    .line 985
    move-result-object v1

    .line 986
    check-cast v1, La/g1t0;

    .line 987
    .line 988
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 989
    .line 990
    .line 991
    invoke-static {}, La/g1t0;->g()La/y9q0;

    .line 992
    .line 993
    .line 994
    move-result-object v1

    .line 995
    and-int/lit8 v2, v6, 0x70

    .line 996
    .line 997
    invoke-static {v0, v3, v1, v4, v2}, La/t9x;->u(La/mm40;La/j83;La/y9q0;La/fet;I)V

    .line 998
    .line 999
    .line 1000
    goto :goto_f

    .line 1001
    :cond_2d
    invoke-virtual {v4}, La/fet;->X()V

    .line 1002
    .line 1003
    .line 1004
    :goto_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1005
    .line 1006
    return-object v0

    .line 1007
    :pswitch_7
    move-object/from16 v1, p1

    .line 1008
    .line 1009
    check-cast v1, La/j83;

    .line 1010
    .line 1011
    move-object/from16 v3, p2

    .line 1012
    .line 1013
    check-cast v3, La/j83;

    .line 1014
    .line 1015
    move-object/from16 v4, p3

    .line 1016
    .line 1017
    check-cast v4, La/fet;

    .line 1018
    .line 1019
    move-object/from16 v5, p4

    .line 1020
    .line 1021
    check-cast v5, Ljava/lang/Integer;

    .line 1022
    .line 1023
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1024
    .line 1025
    .line 1026
    move-result v5

    .line 1027
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1028
    .line 1029
    .line 1030
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1031
    .line 1032
    .line 1033
    and-int/lit8 v6, v5, 0x6

    .line 1034
    .line 1035
    if-nez v6, :cond_2f

    .line 1036
    .line 1037
    invoke-virtual {v4, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1038
    .line 1039
    .line 1040
    move-result v6

    .line 1041
    if-eqz v6, :cond_2e

    .line 1042
    .line 1043
    move v12, v13

    .line 1044
    :cond_2e
    or-int v6, v5, v12

    .line 1045
    .line 1046
    goto :goto_10

    .line 1047
    :cond_2f
    move v6, v5

    .line 1048
    :goto_10
    and-int/lit8 v5, v5, 0x30

    .line 1049
    .line 1050
    if-nez v5, :cond_31

    .line 1051
    .line 1052
    invoke-virtual {v4, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1053
    .line 1054
    .line 1055
    move-result v5

    .line 1056
    if-eqz v5, :cond_30

    .line 1057
    .line 1058
    move v10, v11

    .line 1059
    :cond_30
    or-int/2addr v6, v10

    .line 1060
    :cond_31
    and-int/lit16 v5, v6, 0x93

    .line 1061
    .line 1062
    if-eq v5, v9, :cond_32

    .line 1063
    .line 1064
    move v14, v15

    .line 1065
    :cond_32
    and-int/lit8 v5, v6, 0x1

    .line 1066
    .line 1067
    invoke-virtual {v4, v5, v14}, La/fet;->U(IZ)Z

    .line 1068
    .line 1069
    .line 1070
    move-result v5

    .line 1071
    if-eqz v5, :cond_33

    .line 1072
    .line 1073
    sget-object v5, La/qmk;->a:La/zcl;

    .line 1074
    .line 1075
    const/4 v12, 0x0

    .line 1076
    const/16 v13, 0xd

    .line 1077
    .line 1078
    iget-object v8, v0, La/fp0;->b:La/mm40;

    .line 1079
    .line 1080
    const/4 v9, 0x0

    .line 1081
    const/high16 v10, 0x40800000    # 4.0f

    .line 1082
    .line 1083
    const/4 v11, 0x0

    .line 1084
    invoke-static/range {v8 .. v13}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v0

    .line 1088
    invoke-static {v0, v2}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v0

    .line 1092
    sget-object v5, La/j1t0;->e:La/zfn;

    .line 1093
    .line 1094
    invoke-virtual {v4, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v9

    .line 1098
    check-cast v9, La/g1t0;

    .line 1099
    .line 1100
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1101
    .line 1102
    .line 1103
    invoke-static {}, La/g1t0;->d()La/y9q0;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v9

    .line 1107
    shl-int/lit8 v10, v6, 0x3

    .line 1108
    .line 1109
    and-int/lit8 v10, v10, 0x70

    .line 1110
    .line 1111
    invoke-static {v0, v1, v9, v4, v10}, La/t9x;->u(La/mm40;La/j83;La/y9q0;La/fet;I)V

    .line 1112
    .line 1113
    .line 1114
    const/high16 v0, 0x40a00000    # 5.0f

    .line 1115
    .line 1116
    invoke-static {v7, v0}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v0

    .line 1120
    invoke-static {v4, v0}, La/qxw;->o(La/fet;La/mm40;)V

    .line 1121
    .line 1122
    .line 1123
    invoke-static {v8, v2}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v0

    .line 1127
    invoke-virtual {v4, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v1

    .line 1131
    check-cast v1, La/g1t0;

    .line 1132
    .line 1133
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1134
    .line 1135
    .line 1136
    invoke-static {}, La/g1t0;->d()La/y9q0;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v1

    .line 1140
    and-int/lit8 v2, v6, 0x70

    .line 1141
    .line 1142
    invoke-static {v0, v3, v1, v4, v2}, La/t9x;->u(La/mm40;La/j83;La/y9q0;La/fet;I)V

    .line 1143
    .line 1144
    .line 1145
    goto :goto_11

    .line 1146
    :cond_33
    invoke-virtual {v4}, La/fet;->X()V

    .line 1147
    .line 1148
    .line 1149
    :goto_11
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1150
    .line 1151
    return-object v0

    .line 1152
    :pswitch_8
    move-object/from16 v0, p1

    .line 1153
    .line 1154
    check-cast v0, La/j83;

    .line 1155
    .line 1156
    move-object/from16 v1, p2

    .line 1157
    .line 1158
    check-cast v1, La/j83;

    .line 1159
    .line 1160
    move-object/from16 v2, p3

    .line 1161
    .line 1162
    check-cast v2, La/fet;

    .line 1163
    .line 1164
    move-object/from16 v3, p4

    .line 1165
    .line 1166
    check-cast v3, Ljava/lang/Integer;

    .line 1167
    .line 1168
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1169
    .line 1170
    .line 1171
    move-result v3

    .line 1172
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1173
    .line 1174
    .line 1175
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1176
    .line 1177
    .line 1178
    and-int/lit8 v4, v3, 0x6

    .line 1179
    .line 1180
    if-nez v4, :cond_35

    .line 1181
    .line 1182
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1183
    .line 1184
    .line 1185
    move-result v4

    .line 1186
    if-eqz v4, :cond_34

    .line 1187
    .line 1188
    move v12, v13

    .line 1189
    :cond_34
    or-int v4, v3, v12

    .line 1190
    .line 1191
    goto :goto_12

    .line 1192
    :cond_35
    move v4, v3

    .line 1193
    :goto_12
    and-int/lit8 v3, v3, 0x30

    .line 1194
    .line 1195
    if-nez v3, :cond_37

    .line 1196
    .line 1197
    invoke-virtual {v2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1198
    .line 1199
    .line 1200
    move-result v3

    .line 1201
    if-eqz v3, :cond_36

    .line 1202
    .line 1203
    move v10, v11

    .line 1204
    :cond_36
    or-int/2addr v4, v10

    .line 1205
    :cond_37
    and-int/lit16 v3, v4, 0x93

    .line 1206
    .line 1207
    if-eq v3, v9, :cond_38

    .line 1208
    .line 1209
    move v14, v15

    .line 1210
    :cond_38
    and-int/lit8 v3, v4, 0x1

    .line 1211
    .line 1212
    invoke-virtual {v2, v3, v14}, La/fet;->U(IZ)Z

    .line 1213
    .line 1214
    .line 1215
    move-result v3

    .line 1216
    if-eqz v3, :cond_39

    .line 1217
    .line 1218
    sget-object v3, La/j1t0;->e:La/zfn;

    .line 1219
    .line 1220
    invoke-virtual {v2, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v5

    .line 1224
    check-cast v5, La/g1t0;

    .line 1225
    .line 1226
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1227
    .line 1228
    .line 1229
    invoke-static {}, La/g1t0;->d()La/y9q0;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v5

    .line 1233
    shl-int/lit8 v6, v4, 0x3

    .line 1234
    .line 1235
    and-int/lit8 v6, v6, 0x70

    .line 1236
    .line 1237
    or-int/lit8 v6, v6, 0x6

    .line 1238
    .line 1239
    invoke-static {v8, v0, v5, v2, v6}, La/ucx;->E(La/mm40;La/j83;La/y9q0;La/fet;I)V

    .line 1240
    .line 1241
    .line 1242
    invoke-virtual {v2, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v0

    .line 1246
    check-cast v0, La/g1t0;

    .line 1247
    .line 1248
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1249
    .line 1250
    .line 1251
    invoke-static {}, La/g1t0;->d()La/y9q0;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v0

    .line 1255
    and-int/lit8 v3, v4, 0x70

    .line 1256
    .line 1257
    or-int/lit8 v3, v3, 0x6

    .line 1258
    .line 1259
    invoke-static {v8, v1, v0, v2, v3}, La/ucx;->E(La/mm40;La/j83;La/y9q0;La/fet;I)V

    .line 1260
    .line 1261
    .line 1262
    goto :goto_13

    .line 1263
    :cond_39
    invoke-virtual {v2}, La/fet;->X()V

    .line 1264
    .line 1265
    .line 1266
    :goto_13
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1267
    .line 1268
    return-object v0

    .line 1269
    :pswitch_9
    move-object/from16 v0, p1

    .line 1270
    .line 1271
    check-cast v0, La/g9z;

    .line 1272
    .line 1273
    move-object/from16 v1, p2

    .line 1274
    .line 1275
    check-cast v1, Ljava/lang/Integer;

    .line 1276
    .line 1277
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1278
    .line 1279
    .line 1280
    move-object/from16 v1, p3

    .line 1281
    .line 1282
    check-cast v1, La/fet;

    .line 1283
    .line 1284
    move-object/from16 v2, p4

    .line 1285
    .line 1286
    check-cast v2, Ljava/lang/Integer;

    .line 1287
    .line 1288
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1289
    .line 1290
    .line 1291
    move-result v2

    .line 1292
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1293
    .line 1294
    .line 1295
    and-int/lit16 v0, v2, 0x81

    .line 1296
    .line 1297
    const/16 v3, 0x80

    .line 1298
    .line 1299
    if-eq v0, v3, :cond_3a

    .line 1300
    .line 1301
    move v0, v15

    .line 1302
    goto :goto_14

    .line 1303
    :cond_3a
    move v0, v14

    .line 1304
    :goto_14
    and-int/2addr v2, v15

    .line 1305
    invoke-virtual {v1, v2, v0}, La/fet;->U(IZ)Z

    .line 1306
    .line 1307
    .line 1308
    move-result v0

    .line 1309
    if-eqz v0, :cond_3b

    .line 1310
    .line 1311
    sget-object v0, La/qmk;->g:La/zcl;

    .line 1312
    .line 1313
    sget-object v2, La/vgg0;->a:La/ugg0;

    .line 1314
    .line 1315
    invoke-static {v0, v0, v0, v0, v8}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v0

    .line 1319
    const/4 v2, 0x0

    .line 1320
    invoke-static {v2, v1, v14, v15}, La/vbc;->d0(La/vqm;La/fet;II)La/fqj0;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v2

    .line 1324
    invoke-static {v0, v2}, La/xbc;->c0(La/mm40;La/fqj0;)La/mm40;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v0

    .line 1328
    invoke-static {v14, v1, v0}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 1329
    .line 1330
    .line 1331
    goto :goto_15

    .line 1332
    :cond_3b
    invoke-virtual {v1}, La/fet;->X()V

    .line 1333
    .line 1334
    .line 1335
    :goto_15
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1336
    .line 1337
    return-object v0

    .line 1338
    nop

    .line 1339
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
