.class public final synthetic La/ggt0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ggt0;->a:B

    iput-object p1, p0, La/ggt0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;IB)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/ggt0;->a:B

    iput-object p1, p0, La/ggt0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ggt0;->a:B

    .line 4
    .line 5
    const-string v2, "lottieEmptyConfigurator"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    sget-object v4, La/ukd;->a:La/cl5;

    .line 9
    .line 10
    const/4 v5, 0x3

    .line 11
    const/4 v6, 0x2

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x1

    .line 14
    iget-object v0, v0, La/ggt0;->b:Ljava/lang/Object;

    .line 15
    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast v0, La/xx7;

    .line 20
    .line 21
    move-object/from16 v1, p1

    .line 22
    .line 23
    check-cast v1, La/qkx;

    .line 24
    .line 25
    move-object/from16 v2, p2

    .line 26
    .line 27
    check-cast v2, La/k6z;

    .line 28
    .line 29
    iget-wide v3, v1, La/qkx;->a:J

    .line 30
    .line 31
    const/16 v1, 0x20

    .line 32
    .line 33
    shr-long/2addr v3, v1

    .line 34
    long-to-int v3, v3

    .line 35
    invoke-virtual {v0, v7, v3, v2}, La/xx7;->a(IILa/k6z;)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    int-to-long v2, v0

    .line 40
    shl-long v0, v2, v1

    .line 41
    .line 42
    new-instance v2, La/ikx;

    .line 43
    .line 44
    invoke-direct {v2, v0, v1}, La/ikx;-><init>(J)V

    .line 45
    .line 46
    .line 47
    return-object v2

    .line 48
    :pswitch_0
    move-object v1, v0

    .line 49
    check-cast v1, La/qnv0;

    .line 50
    .line 51
    move-object/from16 v0, p1

    .line 52
    .line 53
    check-cast v0, Ljava/lang/Throwable;

    .line 54
    .line 55
    move-object/from16 v2, p2

    .line 56
    .line 57
    check-cast v2, Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 66
    .line 67
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 68
    .line 69
    :cond_0
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 77
    .line 78
    move-object v4, v0

    .line 79
    check-cast v4, La/jnv0;

    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    const/4 v8, 0x0

    .line 85
    const/16 v9, 0x18

    .line 86
    .line 87
    const/4 v5, 0x0

    .line 88
    const/4 v6, 0x1

    .line 89
    const/4 v7, 0x0

    .line 90
    invoke-static/range {v4 .. v9}, La/jnv0;->a(La/jnv0;ZZZLjava/util/List;I)La/jnv0;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_0

    .line 99
    .line 100
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    return-object v0

    .line 103
    :pswitch_1
    check-cast v0, La/hnv0;

    .line 104
    .line 105
    iget-object v0, v0, La/hnv0;->O1:La/a8z;

    .line 106
    .line 107
    move-object/from16 v1, p1

    .line 108
    .line 109
    check-cast v1, La/fet;

    .line 110
    .line 111
    move-object/from16 v2, p2

    .line 112
    .line 113
    check-cast v2, Ljava/lang/Integer;

    .line 114
    .line 115
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    sget-object v3, La/hnv0;->Q1:La/kys0;

    .line 120
    .line 121
    and-int/lit8 v3, v2, 0x3

    .line 122
    .line 123
    if-eq v3, v6, :cond_1

    .line 124
    .line 125
    move v3, v8

    .line 126
    goto :goto_0

    .line 127
    :cond_1
    move v3, v7

    .line 128
    :goto_0
    and-int/2addr v2, v8

    .line 129
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-eqz v2, :cond_4

    .line 134
    .line 135
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    check-cast v2, La/k3t0;

    .line 140
    .line 141
    check-cast v2, La/i3t0;

    .line 142
    .line 143
    invoke-virtual {v2, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    move-object v10, v0

    .line 152
    check-cast v10, La/k3t0;

    .line 153
    .line 154
    invoke-virtual {v1, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    if-nez v0, :cond_2

    .line 163
    .line 164
    if-ne v3, v4, :cond_3

    .line 165
    .line 166
    :cond_2
    new-instance v8, La/wzu0;

    .line 167
    .line 168
    const/4 v14, 0x0

    .line 169
    const/16 v15, 0xf

    .line 170
    .line 171
    const/4 v9, 0x1

    .line 172
    const-class v11, La/k3t0;

    .line 173
    .line 174
    const-string v12, "onAction"

    .line 175
    .line 176
    const-string v13, "onAction(Ljava/lang/Object;)V"

    .line 177
    .line 178
    invoke-direct/range {v8 .. v15}, La/wzu0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    move-object v3, v8

    .line 185
    :cond_3
    check-cast v3, La/jhy;

    .line 186
    .line 187
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 188
    .line 189
    invoke-static {v2, v3, v1, v7}, La/wha0;->H(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 190
    .line 191
    .line 192
    goto :goto_1

    .line 193
    :cond_4
    invoke-virtual {v1}, La/fet;->X()V

    .line 194
    .line 195
    .line 196
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 197
    .line 198
    return-object v0

    .line 199
    :pswitch_2
    move-object v1, v0

    .line 200
    check-cast v1, La/tmv0;

    .line 201
    .line 202
    move-object/from16 v0, p1

    .line 203
    .line 204
    check-cast v0, Ljava/lang/Throwable;

    .line 205
    .line 206
    move-object/from16 v2, p2

    .line 207
    .line 208
    check-cast v2, Ljava/lang/String;

    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 217
    .line 218
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 219
    .line 220
    :cond_5
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 228
    .line 229
    move-object v4, v0

    .line 230
    check-cast v4, La/mmv0;

    .line 231
    .line 232
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    const/4 v8, 0x0

    .line 236
    const/16 v9, 0x18

    .line 237
    .line 238
    const/4 v5, 0x0

    .line 239
    const/4 v6, 0x1

    .line 240
    const/4 v7, 0x0

    .line 241
    invoke-static/range {v4 .. v9}, La/mmv0;->a(La/mmv0;ZZZLa/vk90;I)La/mmv0;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    if-eqz v0, :cond_5

    .line 250
    .line 251
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 252
    .line 253
    return-object v0

    .line 254
    :pswitch_3
    check-cast v0, La/nmv0;

    .line 255
    .line 256
    move-object/from16 v1, p1

    .line 257
    .line 258
    check-cast v1, La/fet;

    .line 259
    .line 260
    move-object/from16 v2, p2

    .line 261
    .line 262
    check-cast v2, Ljava/lang/Integer;

    .line 263
    .line 264
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    invoke-static {v8}, La/x8x;->L(I)I

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    invoke-static {v0, v1, v2}, La/gq80;->K(La/nmv0;La/fet;I)V

    .line 272
    .line 273
    .line 274
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 275
    .line 276
    return-object v0

    .line 277
    :pswitch_4
    check-cast v0, La/omv0;

    .line 278
    .line 279
    move-object/from16 v1, p1

    .line 280
    .line 281
    check-cast v1, La/fet;

    .line 282
    .line 283
    move-object/from16 v2, p2

    .line 284
    .line 285
    check-cast v2, Ljava/lang/Integer;

    .line 286
    .line 287
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    invoke-static {v8}, La/x8x;->L(I)I

    .line 291
    .line 292
    .line 293
    move-result v2

    .line 294
    invoke-static {v0, v1, v2}, La/gq80;->o(La/omv0;La/fet;I)V

    .line 295
    .line 296
    .line 297
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 298
    .line 299
    return-object v0

    .line 300
    :pswitch_5
    check-cast v0, La/lmv0;

    .line 301
    .line 302
    iget-object v0, v0, La/lmv0;->N1:La/a8z;

    .line 303
    .line 304
    move-object/from16 v1, p1

    .line 305
    .line 306
    check-cast v1, La/fet;

    .line 307
    .line 308
    move-object/from16 v2, p2

    .line 309
    .line 310
    check-cast v2, Ljava/lang/Integer;

    .line 311
    .line 312
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 313
    .line 314
    .line 315
    move-result v2

    .line 316
    sget-object v3, La/lmv0;->P1:La/wxs0;

    .line 317
    .line 318
    and-int/lit8 v3, v2, 0x3

    .line 319
    .line 320
    if-eq v3, v6, :cond_6

    .line 321
    .line 322
    move v3, v8

    .line 323
    goto :goto_2

    .line 324
    :cond_6
    move v3, v7

    .line 325
    :goto_2
    and-int/2addr v2, v8

    .line 326
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 327
    .line 328
    .line 329
    move-result v2

    .line 330
    if-eqz v2, :cond_9

    .line 331
    .line 332
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v2

    .line 336
    check-cast v2, La/k3t0;

    .line 337
    .line 338
    check-cast v2, La/i3t0;

    .line 339
    .line 340
    invoke-virtual {v2, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 341
    .line 342
    .line 343
    move-result-object v2

    .line 344
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    move-object v10, v0

    .line 349
    check-cast v10, La/k3t0;

    .line 350
    .line 351
    invoke-virtual {v1, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result v0

    .line 355
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v3

    .line 359
    if-nez v0, :cond_7

    .line 360
    .line 361
    if-ne v3, v4, :cond_8

    .line 362
    .line 363
    :cond_7
    new-instance v8, La/wzu0;

    .line 364
    .line 365
    const/4 v14, 0x0

    .line 366
    const/16 v15, 0xe

    .line 367
    .line 368
    const/4 v9, 0x1

    .line 369
    const-class v11, La/k3t0;

    .line 370
    .line 371
    const-string v12, "onAction"

    .line 372
    .line 373
    const-string v13, "onAction(Ljava/lang/Object;)V"

    .line 374
    .line 375
    invoke-direct/range {v8 .. v15}, La/wzu0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    move-object v3, v8

    .line 382
    :cond_8
    check-cast v3, La/jhy;

    .line 383
    .line 384
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 385
    .line 386
    invoke-static {v2, v3, v1, v7}, La/gq80;->Z(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 387
    .line 388
    .line 389
    goto :goto_3

    .line 390
    :cond_9
    invoke-virtual {v1}, La/fet;->X()V

    .line 391
    .line 392
    .line 393
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 394
    .line 395
    return-object v0

    .line 396
    :pswitch_6
    move-object v1, v0

    .line 397
    check-cast v1, La/emv0;

    .line 398
    .line 399
    move-object/from16 v0, p1

    .line 400
    .line 401
    check-cast v0, Ljava/lang/Throwable;

    .line 402
    .line 403
    move-object/from16 v2, p2

    .line 404
    .line 405
    check-cast v2, Ljava/lang/String;

    .line 406
    .line 407
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 414
    .line 415
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 416
    .line 417
    :cond_a
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 425
    .line 426
    move-object v4, v0

    .line 427
    check-cast v4, La/vlv0;

    .line 428
    .line 429
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 430
    .line 431
    .line 432
    sget-object v14, La/iun;->a:La/iun;

    .line 433
    .line 434
    const/4 v13, 0x0

    .line 435
    const/16 v15, 0x1f8f

    .line 436
    .line 437
    const/4 v5, 0x0

    .line 438
    const/4 v6, 0x0

    .line 439
    const/4 v7, 0x1

    .line 440
    const/4 v8, 0x0

    .line 441
    const/4 v9, 0x0

    .line 442
    const/4 v10, 0x0

    .line 443
    const/4 v11, 0x0

    .line 444
    const/4 v12, 0x0

    .line 445
    invoke-static/range {v4 .. v15}, La/vlv0;->a(La/vlv0;La/nc5;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)La/vlv0;

    .line 446
    .line 447
    .line 448
    move-result-object v3

    .line 449
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 450
    .line 451
    .line 452
    move-result v0

    .line 453
    if-eqz v0, :cond_a

    .line 454
    .line 455
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 456
    .line 457
    return-object v0

    .line 458
    :pswitch_7
    check-cast v0, La/ulv0;

    .line 459
    .line 460
    iget-object v0, v0, La/ulv0;->Q1:La/a8z;

    .line 461
    .line 462
    move-object/from16 v1, p1

    .line 463
    .line 464
    check-cast v1, La/fet;

    .line 465
    .line 466
    move-object/from16 v2, p2

    .line 467
    .line 468
    check-cast v2, Ljava/lang/Integer;

    .line 469
    .line 470
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 471
    .line 472
    .line 473
    move-result v2

    .line 474
    sget-object v3, La/ulv0;->R1:La/uxs0;

    .line 475
    .line 476
    and-int/lit8 v3, v2, 0x3

    .line 477
    .line 478
    if-eq v3, v6, :cond_b

    .line 479
    .line 480
    move v3, v8

    .line 481
    goto :goto_4

    .line 482
    :cond_b
    move v3, v7

    .line 483
    :goto_4
    and-int/2addr v2, v8

    .line 484
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 485
    .line 486
    .line 487
    move-result v2

    .line 488
    if-eqz v2, :cond_e

    .line 489
    .line 490
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v2

    .line 494
    check-cast v2, La/k3t0;

    .line 495
    .line 496
    check-cast v2, La/i3t0;

    .line 497
    .line 498
    invoke-virtual {v2, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 499
    .line 500
    .line 501
    move-result-object v2

    .line 502
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    move-object v10, v0

    .line 507
    check-cast v10, La/k3t0;

    .line 508
    .line 509
    invoke-virtual {v1, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 510
    .line 511
    .line 512
    move-result v0

    .line 513
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v3

    .line 517
    if-nez v0, :cond_c

    .line 518
    .line 519
    if-ne v3, v4, :cond_d

    .line 520
    .line 521
    :cond_c
    new-instance v8, La/wzu0;

    .line 522
    .line 523
    const/4 v14, 0x0

    .line 524
    const/16 v15, 0xd

    .line 525
    .line 526
    const/4 v9, 0x1

    .line 527
    const-class v11, La/k3t0;

    .line 528
    .line 529
    const-string v12, "onAction"

    .line 530
    .line 531
    const-string v13, "onAction(Ljava/lang/Object;)V"

    .line 532
    .line 533
    invoke-direct/range {v8 .. v15}, La/wzu0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 537
    .line 538
    .line 539
    move-object v3, v8

    .line 540
    :cond_d
    check-cast v3, La/jhy;

    .line 541
    .line 542
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 543
    .line 544
    invoke-static {v2, v3, v1, v7}, La/ihm0;->e(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 545
    .line 546
    .line 547
    goto :goto_5

    .line 548
    :cond_e
    invoke-virtual {v1}, La/fet;->X()V

    .line 549
    .line 550
    .line 551
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 552
    .line 553
    return-object v0

    .line 554
    :pswitch_8
    check-cast v0, La/i3t0;

    .line 555
    .line 556
    move-object/from16 v1, p1

    .line 557
    .line 558
    check-cast v1, La/wim;

    .line 559
    .line 560
    move-object/from16 v2, p2

    .line 561
    .line 562
    check-cast v2, Ljava/lang/String;

    .line 563
    .line 564
    sget v3, La/ffv0;->k2:I

    .line 565
    .line 566
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 567
    .line 568
    .line 569
    new-instance v3, La/bfv0;

    .line 570
    .line 571
    invoke-direct {v3, v1, v2}, La/bfv0;-><init>(La/wim;Ljava/lang/String;)V

    .line 572
    .line 573
    .line 574
    invoke-virtual {v0, v3}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 575
    .line 576
    .line 577
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 578
    .line 579
    return-object v0

    .line 580
    :pswitch_9
    check-cast v0, La/qdv0;

    .line 581
    .line 582
    move-object/from16 v1, p1

    .line 583
    .line 584
    check-cast v1, La/fet;

    .line 585
    .line 586
    move-object/from16 v2, p2

    .line 587
    .line 588
    check-cast v2, Ljava/lang/Integer;

    .line 589
    .line 590
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 591
    .line 592
    .line 593
    invoke-static {v8}, La/x8x;->L(I)I

    .line 594
    .line 595
    .line 596
    move-result v2

    .line 597
    invoke-static {v0, v1, v2}, La/iym0;->m(La/qdv0;La/fet;I)V

    .line 598
    .line 599
    .line 600
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 601
    .line 602
    return-object v0

    .line 603
    :pswitch_a
    check-cast v0, La/ndv0;

    .line 604
    .line 605
    move-object/from16 v1, p1

    .line 606
    .line 607
    check-cast v1, La/fet;

    .line 608
    .line 609
    move-object/from16 v2, p2

    .line 610
    .line 611
    check-cast v2, Ljava/lang/Integer;

    .line 612
    .line 613
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 614
    .line 615
    .line 616
    invoke-static {v8}, La/x8x;->L(I)I

    .line 617
    .line 618
    .line 619
    move-result v2

    .line 620
    invoke-static {v0, v1, v2}, La/iym0;->j(La/ndv0;La/fet;I)V

    .line 621
    .line 622
    .line 623
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 624
    .line 625
    return-object v0

    .line 626
    :pswitch_b
    check-cast v0, La/rdv0;

    .line 627
    .line 628
    move-object/from16 v1, p1

    .line 629
    .line 630
    check-cast v1, La/fet;

    .line 631
    .line 632
    move-object/from16 v2, p2

    .line 633
    .line 634
    check-cast v2, Ljava/lang/Integer;

    .line 635
    .line 636
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 637
    .line 638
    .line 639
    move-result v2

    .line 640
    and-int/lit8 v3, v2, 0x3

    .line 641
    .line 642
    if-eq v3, v6, :cond_f

    .line 643
    .line 644
    move v3, v8

    .line 645
    goto :goto_6

    .line 646
    :cond_f
    move v3, v7

    .line 647
    :goto_6
    and-int/2addr v2, v8

    .line 648
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 649
    .line 650
    .line 651
    move-result v2

    .line 652
    if-eqz v2, :cond_11

    .line 653
    .line 654
    sget-object v2, La/jm40;->b:La/jm40;

    .line 655
    .line 656
    const/high16 v3, 0x3f800000    # 1.0f

    .line 657
    .line 658
    invoke-static {v2, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 659
    .line 660
    .line 661
    move-result-object v9

    .line 662
    sget-object v2, La/qmk;->a:La/zcl;

    .line 663
    .line 664
    const/high16 v13, 0x41400000    # 12.0f

    .line 665
    .line 666
    const/4 v14, 0x5

    .line 667
    const/4 v10, 0x0

    .line 668
    const/high16 v11, 0x41800000    # 16.0f

    .line 669
    .line 670
    const/4 v12, 0x0

    .line 671
    invoke-static/range {v9 .. v14}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 672
    .line 673
    .line 674
    move-result-object v2

    .line 675
    sget-object v3, La/uc9;->e:La/nw3;

    .line 676
    .line 677
    sget-object v4, La/gqw0;->k:La/yx7;

    .line 678
    .line 679
    const/16 v5, 0x36

    .line 680
    .line 681
    invoke-static {v3, v4, v1, v5}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 682
    .line 683
    .line 684
    move-result-object v3

    .line 685
    iget-wide v5, v1, La/fet;->T:J

    .line 686
    .line 687
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 688
    .line 689
    .line 690
    move-result v5

    .line 691
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 692
    .line 693
    .line 694
    move-result-object v6

    .line 695
    invoke-static {v1, v2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 696
    .line 697
    .line 698
    move-result-object v2

    .line 699
    sget-object v9, La/mkd;->c0:La/gqw0;

    .line 700
    .line 701
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 702
    .line 703
    .line 704
    invoke-virtual {v1}, La/fet;->i0()V

    .line 705
    .line 706
    .line 707
    iget-boolean v9, v1, La/fet;->S:Z

    .line 708
    .line 709
    if-eqz v9, :cond_10

    .line 710
    .line 711
    sget-object v9, La/e7z;->u1:La/pcy;

    .line 712
    .line 713
    invoke-virtual {v1, v9}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 714
    .line 715
    .line 716
    goto :goto_7

    .line 717
    :cond_10
    invoke-virtual {v1}, La/fet;->r0()V

    .line 718
    .line 719
    .line 720
    :goto_7
    sget-object v9, La/gqw0;->x:La/shd;

    .line 721
    .line 722
    invoke-static {v1, v3, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 723
    .line 724
    .line 725
    sget-object v3, La/gqw0;->w:La/shd;

    .line 726
    .line 727
    invoke-static {v1, v6, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 728
    .line 729
    .line 730
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 731
    .line 732
    .line 733
    move-result-object v3

    .line 734
    sget-object v5, La/gqw0;->y:La/shd;

    .line 735
    .line 736
    invoke-static {v1, v3, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 737
    .line 738
    .line 739
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 740
    .line 741
    .line 742
    sget-object v3, La/gqw0;->v:La/shd;

    .line 743
    .line 744
    invoke-static {v1, v2, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 745
    .line 746
    .line 747
    iget-object v2, v0, La/rdv0;->e:La/qdv0;

    .line 748
    .line 749
    invoke-static {v2, v1, v7}, La/iym0;->m(La/qdv0;La/fet;I)V

    .line 750
    .line 751
    .line 752
    new-instance v2, La/ecu0;

    .line 753
    .line 754
    invoke-direct {v2, v4}, La/ecu0;-><init>(La/yx7;)V

    .line 755
    .line 756
    .line 757
    iget-object v3, v0, La/rdv0;->g:La/iev0;

    .line 758
    .line 759
    iget-boolean v4, v0, La/rdv0;->h:Z

    .line 760
    .line 761
    invoke-static {v2, v3, v4, v1, v7}, La/iym0;->n(La/mm40;La/iev0;ZLa/fet;I)V

    .line 762
    .line 763
    .line 764
    iget-object v0, v0, La/rdv0;->f:La/qdv0;

    .line 765
    .line 766
    invoke-static {v0, v1, v7}, La/iym0;->m(La/qdv0;La/fet;I)V

    .line 767
    .line 768
    .line 769
    invoke-virtual {v1, v8}, La/fet;->r(Z)V

    .line 770
    .line 771
    .line 772
    goto :goto_8

    .line 773
    :cond_11
    invoke-virtual {v1}, La/fet;->X()V

    .line 774
    .line 775
    .line 776
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 777
    .line 778
    return-object v0

    .line 779
    :pswitch_c
    move-object v3, v0

    .line 780
    check-cast v3, La/v8v0;

    .line 781
    .line 782
    iget-object v0, v3, La/v8v0;->O1:La/a8z;

    .line 783
    .line 784
    move-object/from16 v1, p1

    .line 785
    .line 786
    check-cast v1, La/fet;

    .line 787
    .line 788
    move-object/from16 v2, p2

    .line 789
    .line 790
    check-cast v2, Ljava/lang/Integer;

    .line 791
    .line 792
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 793
    .line 794
    .line 795
    move-result v2

    .line 796
    sget-object v9, La/v8v0;->P1:La/bzs0;

    .line 797
    .line 798
    and-int/lit8 v9, v2, 0x3

    .line 799
    .line 800
    if-eq v9, v6, :cond_12

    .line 801
    .line 802
    move v6, v8

    .line 803
    goto :goto_9

    .line 804
    :cond_12
    move v6, v7

    .line 805
    :goto_9
    and-int/2addr v2, v8

    .line 806
    invoke-virtual {v1, v2, v6}, La/fet;->U(IZ)Z

    .line 807
    .line 808
    .line 809
    move-result v2

    .line 810
    if-eqz v2, :cond_17

    .line 811
    .line 812
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 813
    .line 814
    .line 815
    move-result-object v2

    .line 816
    check-cast v2, La/k3t0;

    .line 817
    .line 818
    invoke-virtual {v1, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 819
    .line 820
    .line 821
    move-result v6

    .line 822
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 823
    .line 824
    .line 825
    move-result-object v8

    .line 826
    if-nez v6, :cond_13

    .line 827
    .line 828
    if-ne v8, v4, :cond_14

    .line 829
    .line 830
    :cond_13
    new-instance v8, La/wzu0;

    .line 831
    .line 832
    const/4 v14, 0x0

    .line 833
    const/16 v15, 0xa

    .line 834
    .line 835
    const/4 v9, 0x1

    .line 836
    const-class v11, La/v8v0;

    .line 837
    .line 838
    const-string v12, "handleSideEffect"

    .line 839
    .line 840
    const-string v13, "handleSideEffect(Lorg/xplatform/welcome_bonus/impl/presentation/models/WelcomeBonusSideEffect;)V"

    .line 841
    .line 842
    move-object v10, v3

    .line 843
    invoke-direct/range {v8 .. v15}, La/wzu0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 844
    .line 845
    .line 846
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 847
    .line 848
    .line 849
    :cond_14
    check-cast v8, La/jhy;

    .line 850
    .line 851
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 852
    .line 853
    sget-object v6, La/lkz;->a:La/lkz;

    .line 854
    .line 855
    invoke-static {v8, v1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 856
    .line 857
    .line 858
    move-result-object v6

    .line 859
    invoke-virtual {v1, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 860
    .line 861
    .line 862
    move-result v8

    .line 863
    invoke-virtual {v1, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 864
    .line 865
    .line 866
    move-result v9

    .line 867
    or-int/2addr v8, v9

    .line 868
    invoke-virtual {v1, v5}, La/fet;->e(I)Z

    .line 869
    .line 870
    .line 871
    move-result v5

    .line 872
    or-int/2addr v5, v8

    .line 873
    invoke-virtual {v1, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 874
    .line 875
    .line 876
    move-result v8

    .line 877
    or-int/2addr v5, v8

    .line 878
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 879
    .line 880
    .line 881
    move-result-object v8

    .line 882
    if-nez v5, :cond_15

    .line 883
    .line 884
    if-ne v8, v4, :cond_16

    .line 885
    .line 886
    :cond_15
    move-object v4, v1

    .line 887
    goto :goto_a

    .line 888
    :cond_16
    move-object/from16 v38, v8

    .line 889
    .line 890
    move-object v8, v1

    .line 891
    move-object/from16 v1, v38

    .line 892
    .line 893
    goto :goto_b

    .line 894
    :goto_a
    new-instance v1, La/tmj0;

    .line 895
    .line 896
    const/4 v5, 0x0

    .line 897
    move-object v8, v4

    .line 898
    move-object v4, v6

    .line 899
    const/16 v6, 0x1b

    .line 900
    .line 901
    invoke-direct/range {v1 .. v6}, La/tmj0;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 902
    .line 903
    .line 904
    invoke-virtual {v8, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 905
    .line 906
    .line 907
    :goto_b
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 908
    .line 909
    invoke-static {v8, v3, v1}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 910
    .line 911
    .line 912
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 913
    .line 914
    .line 915
    move-result-object v0

    .line 916
    check-cast v0, La/k3t0;

    .line 917
    .line 918
    invoke-static {v0, v8, v7}, La/knx;->O(La/k3t0;La/fet;I)V

    .line 919
    .line 920
    .line 921
    goto :goto_c

    .line 922
    :cond_17
    move-object v8, v1

    .line 923
    invoke-virtual {v8}, La/fet;->X()V

    .line 924
    .line 925
    .line 926
    :goto_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 927
    .line 928
    return-object v0

    .line 929
    :pswitch_d
    check-cast v0, La/s7v0;

    .line 930
    .line 931
    move-object/from16 v12, p1

    .line 932
    .line 933
    check-cast v12, La/fet;

    .line 934
    .line 935
    move-object/from16 v1, p2

    .line 936
    .line 937
    check-cast v1, Ljava/lang/Integer;

    .line 938
    .line 939
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 940
    .line 941
    .line 942
    move-result v1

    .line 943
    sget-object v2, La/s7v0;->P1:La/wxs0;

    .line 944
    .line 945
    and-int/lit8 v2, v1, 0x3

    .line 946
    .line 947
    if-eq v2, v6, :cond_18

    .line 948
    .line 949
    move v2, v8

    .line 950
    goto :goto_d

    .line 951
    :cond_18
    move v2, v7

    .line 952
    :goto_d
    and-int/2addr v1, v8

    .line 953
    invoke-virtual {v12, v1, v2}, La/fet;->U(IZ)Z

    .line 954
    .line 955
    .line 956
    move-result v1

    .line 957
    if-eqz v1, :cond_1f

    .line 958
    .line 959
    invoke-virtual {v12, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 960
    .line 961
    .line 962
    move-result v1

    .line 963
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 964
    .line 965
    .line 966
    move-result-object v2

    .line 967
    if-nez v1, :cond_19

    .line 968
    .line 969
    if-ne v2, v4, :cond_1a

    .line 970
    .line 971
    :cond_19
    new-instance v2, La/q7v0;

    .line 972
    .line 973
    invoke-direct {v2, v0, v6}, La/q7v0;-><init>(La/s7v0;B)V

    .line 974
    .line 975
    .line 976
    invoke-virtual {v12, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 977
    .line 978
    .line 979
    :cond_1a
    move-object v9, v2

    .line 980
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 981
    .line 982
    invoke-virtual {v12, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 983
    .line 984
    .line 985
    move-result v1

    .line 986
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 987
    .line 988
    .line 989
    move-result-object v2

    .line 990
    if-nez v1, :cond_1b

    .line 991
    .line 992
    if-ne v2, v4, :cond_1c

    .line 993
    .line 994
    :cond_1b
    new-instance v2, La/q7v0;

    .line 995
    .line 996
    invoke-direct {v2, v0, v5}, La/q7v0;-><init>(La/s7v0;B)V

    .line 997
    .line 998
    .line 999
    invoke-virtual {v12, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1000
    .line 1001
    .line 1002
    :cond_1c
    move-object v10, v2

    .line 1003
    check-cast v10, Lkotlin/jvm/functions/Function0;

    .line 1004
    .line 1005
    const/4 v13, 0x0

    .line 1006
    const/4 v14, 0x4

    .line 1007
    const/4 v11, 0x0

    .line 1008
    invoke-static/range {v9 .. v14}, La/v3c;->z(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 1009
    .line 1010
    .line 1011
    iget-object v1, v0, La/s7v0;->N1:La/a8z;

    .line 1012
    .line 1013
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v1

    .line 1017
    check-cast v1, La/k3t0;

    .line 1018
    .line 1019
    check-cast v1, La/i3t0;

    .line 1020
    .line 1021
    invoke-virtual {v1, v12}, La/i3t0;->y(La/fet;)La/pz40;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v1

    .line 1025
    invoke-virtual {v12, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1026
    .line 1027
    .line 1028
    move-result v2

    .line 1029
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v3

    .line 1033
    if-nez v2, :cond_1d

    .line 1034
    .line 1035
    if-ne v3, v4, :cond_1e

    .line 1036
    .line 1037
    :cond_1d
    new-instance v3, La/npt0;

    .line 1038
    .line 1039
    const/16 v2, 0x1a

    .line 1040
    .line 1041
    invoke-direct {v3, v0, v2}, La/npt0;-><init>(Ljava/lang/Object;B)V

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual {v12, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1045
    .line 1046
    .line 1047
    :cond_1e
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 1048
    .line 1049
    invoke-static {v1, v3, v12, v7}, La/cjx;->L(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1050
    .line 1051
    .line 1052
    goto :goto_e

    .line 1053
    :cond_1f
    invoke-virtual {v12}, La/fet;->X()V

    .line 1054
    .line 1055
    .line 1056
    :goto_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1057
    .line 1058
    return-object v0

    .line 1059
    :pswitch_e
    check-cast v0, La/xzu0;

    .line 1060
    .line 1061
    move-object/from16 v1, p1

    .line 1062
    .line 1063
    check-cast v1, La/fet;

    .line 1064
    .line 1065
    move-object/from16 v2, p2

    .line 1066
    .line 1067
    check-cast v2, Ljava/lang/Integer;

    .line 1068
    .line 1069
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1070
    .line 1071
    .line 1072
    move-result v2

    .line 1073
    sget-object v3, La/xzu0;->S1:La/uxs0;

    .line 1074
    .line 1075
    and-int/lit8 v3, v2, 0x3

    .line 1076
    .line 1077
    if-eq v3, v6, :cond_20

    .line 1078
    .line 1079
    move v3, v8

    .line 1080
    goto :goto_f

    .line 1081
    :cond_20
    move v3, v7

    .line 1082
    :goto_f
    and-int/2addr v2, v8

    .line 1083
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 1084
    .line 1085
    .line 1086
    move-result v2

    .line 1087
    if-eqz v2, :cond_23

    .line 1088
    .line 1089
    invoke-virtual {v0}, La/xzu0;->G0()La/k3t0;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v2

    .line 1093
    check-cast v2, La/i3t0;

    .line 1094
    .line 1095
    invoke-virtual {v2, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v2

    .line 1099
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v2

    .line 1103
    check-cast v2, La/n0v0;

    .line 1104
    .line 1105
    invoke-virtual {v0}, La/xzu0;->G0()La/k3t0;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v10

    .line 1109
    invoke-virtual {v1, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1110
    .line 1111
    .line 1112
    move-result v0

    .line 1113
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v3

    .line 1117
    if-nez v0, :cond_21

    .line 1118
    .line 1119
    if-ne v3, v4, :cond_22

    .line 1120
    .line 1121
    :cond_21
    new-instance v8, La/wzu0;

    .line 1122
    .line 1123
    const/4 v14, 0x0

    .line 1124
    const/4 v15, 0x0

    .line 1125
    const/4 v9, 0x1

    .line 1126
    const-class v11, La/k3t0;

    .line 1127
    .line 1128
    const-string v12, "onAction"

    .line 1129
    .line 1130
    const-string v13, "onAction(Ljava/lang/Object;)V"

    .line 1131
    .line 1132
    invoke-direct/range {v8 .. v15}, La/wzu0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1133
    .line 1134
    .line 1135
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1136
    .line 1137
    .line 1138
    move-object v3, v8

    .line 1139
    :cond_22
    check-cast v3, La/jhy;

    .line 1140
    .line 1141
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 1142
    .line 1143
    invoke-static {v2, v3, v1, v7}, La/eeq;->P(La/n0v0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1144
    .line 1145
    .line 1146
    goto :goto_10

    .line 1147
    :cond_23
    invoke-virtual {v1}, La/fet;->X()V

    .line 1148
    .line 1149
    .line 1150
    :goto_10
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1151
    .line 1152
    return-object v0

    .line 1153
    :pswitch_f
    move-object v1, v0

    .line 1154
    check-cast v1, La/dyu0;

    .line 1155
    .line 1156
    move-object/from16 v0, p1

    .line 1157
    .line 1158
    check-cast v0, Ljava/lang/Throwable;

    .line 1159
    .line 1160
    move-object/from16 v2, p2

    .line 1161
    .line 1162
    check-cast v2, Ljava/lang/String;

    .line 1163
    .line 1164
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1165
    .line 1166
    .line 1167
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1168
    .line 1169
    .line 1170
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 1171
    .line 1172
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 1173
    .line 1174
    :cond_24
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v0

    .line 1178
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1179
    .line 1180
    .line 1181
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 1182
    .line 1183
    move-object v8, v0

    .line 1184
    check-cast v8, La/txu0;

    .line 1185
    .line 1186
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1187
    .line 1188
    .line 1189
    iget-object v3, v8, La/txu0;->e:La/fwu0;

    .line 1190
    .line 1191
    iget-object v4, v3, La/fwu0;->a:La/gwu0;

    .line 1192
    .line 1193
    iget-object v3, v3, La/fwu0;->b:La/hwu0;

    .line 1194
    .line 1195
    new-instance v12, La/fwu0;

    .line 1196
    .line 1197
    invoke-direct {v12, v4, v3, v7}, La/fwu0;-><init>(La/gwu0;La/hwu0;Z)V

    .line 1198
    .line 1199
    .line 1200
    const-wide/16 v16, 0x0

    .line 1201
    .line 1202
    const/16 v18, 0x1ef

    .line 1203
    .line 1204
    const/4 v9, 0x0

    .line 1205
    const/4 v10, 0x0

    .line 1206
    const/4 v11, 0x0

    .line 1207
    const/4 v13, 0x0

    .line 1208
    const/4 v14, 0x0

    .line 1209
    const/4 v15, 0x0

    .line 1210
    invoke-static/range {v8 .. v18}, La/txu0;->a(La/txu0;Ljava/lang/String;ZLa/axu0;La/fwu0;La/dxu0;ZZDI)La/txu0;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v3

    .line 1214
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1215
    .line 1216
    .line 1217
    move-result v0

    .line 1218
    if-eqz v0, :cond_24

    .line 1219
    .line 1220
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1221
    .line 1222
    return-object v0

    .line 1223
    :pswitch_10
    check-cast v0, La/rsu0;

    .line 1224
    .line 1225
    iget-object v0, v0, La/rsu0;->M1:La/a8z;

    .line 1226
    .line 1227
    move-object/from16 v1, p1

    .line 1228
    .line 1229
    check-cast v1, La/fet;

    .line 1230
    .line 1231
    move-object/from16 v2, p2

    .line 1232
    .line 1233
    check-cast v2, Ljava/lang/Integer;

    .line 1234
    .line 1235
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1236
    .line 1237
    .line 1238
    move-result v2

    .line 1239
    sget-object v3, La/rsu0;->O1:La/sxs0;

    .line 1240
    .line 1241
    and-int/lit8 v3, v2, 0x3

    .line 1242
    .line 1243
    if-eq v3, v6, :cond_25

    .line 1244
    .line 1245
    move v3, v8

    .line 1246
    goto :goto_11

    .line 1247
    :cond_25
    move v3, v7

    .line 1248
    :goto_11
    and-int/2addr v2, v8

    .line 1249
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 1250
    .line 1251
    .line 1252
    move-result v2

    .line 1253
    if-eqz v2, :cond_28

    .line 1254
    .line 1255
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v2

    .line 1259
    check-cast v2, La/k3t0;

    .line 1260
    .line 1261
    check-cast v2, La/i3t0;

    .line 1262
    .line 1263
    invoke-virtual {v2, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v2

    .line 1267
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1268
    .line 1269
    .line 1270
    move-result-object v0

    .line 1271
    move-object v10, v0

    .line 1272
    check-cast v10, La/k3t0;

    .line 1273
    .line 1274
    invoke-virtual {v1, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1275
    .line 1276
    .line 1277
    move-result v0

    .line 1278
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1279
    .line 1280
    .line 1281
    move-result-object v3

    .line 1282
    if-nez v0, :cond_26

    .line 1283
    .line 1284
    if-ne v3, v4, :cond_27

    .line 1285
    .line 1286
    :cond_26
    new-instance v8, La/las0;

    .line 1287
    .line 1288
    const/4 v14, 0x0

    .line 1289
    const/16 v15, 0x19

    .line 1290
    .line 1291
    const/4 v9, 0x1

    .line 1292
    const-class v11, La/k3t0;

    .line 1293
    .line 1294
    const-string v12, "onAction"

    .line 1295
    .line 1296
    const-string v13, "onAction(Ljava/lang/Object;)V"

    .line 1297
    .line 1298
    invoke-direct/range {v8 .. v15}, La/las0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1299
    .line 1300
    .line 1301
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1302
    .line 1303
    .line 1304
    move-object v3, v8

    .line 1305
    :cond_27
    check-cast v3, La/jhy;

    .line 1306
    .line 1307
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 1308
    .line 1309
    invoke-static {v2, v3, v1, v7}, La/x8f;->V(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1310
    .line 1311
    .line 1312
    goto :goto_12

    .line 1313
    :cond_28
    invoke-virtual {v1}, La/fet;->X()V

    .line 1314
    .line 1315
    .line 1316
    :goto_12
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1317
    .line 1318
    return-object v0

    .line 1319
    :pswitch_11
    check-cast v0, La/csu0;

    .line 1320
    .line 1321
    move-object/from16 v1, p1

    .line 1322
    .line 1323
    check-cast v1, La/fet;

    .line 1324
    .line 1325
    move-object/from16 v4, p2

    .line 1326
    .line 1327
    check-cast v4, Ljava/lang/Integer;

    .line 1328
    .line 1329
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1330
    .line 1331
    .line 1332
    move-result v4

    .line 1333
    sget-object v5, La/csu0;->R1:La/bzs0;

    .line 1334
    .line 1335
    and-int/lit8 v5, v4, 0x3

    .line 1336
    .line 1337
    if-eq v5, v6, :cond_29

    .line 1338
    .line 1339
    move v7, v8

    .line 1340
    :cond_29
    and-int/2addr v4, v8

    .line 1341
    invoke-virtual {v1, v4, v7}, La/fet;->U(IZ)Z

    .line 1342
    .line 1343
    .line 1344
    move-result v4

    .line 1345
    if-eqz v4, :cond_2b

    .line 1346
    .line 1347
    iget-object v4, v0, La/csu0;->O1:La/kiu0;

    .line 1348
    .line 1349
    invoke-virtual {v4}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v4

    .line 1353
    check-cast v4, La/esu0;

    .line 1354
    .line 1355
    iget-object v0, v0, La/csu0;->K1:La/g2v;

    .line 1356
    .line 1357
    if-eqz v0, :cond_2a

    .line 1358
    .line 1359
    const/16 v2, 0x40

    .line 1360
    .line 1361
    invoke-static {v0, v4, v1, v2}, La/zgc;->H(La/g2v;La/esu0;La/fet;I)V

    .line 1362
    .line 1363
    .line 1364
    goto :goto_13

    .line 1365
    :cond_2a
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1366
    .line 1367
    .line 1368
    throw v3

    .line 1369
    :cond_2b
    invoke-virtual {v1}, La/fet;->X()V

    .line 1370
    .line 1371
    .line 1372
    :goto_13
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1373
    .line 1374
    return-object v0

    .line 1375
    :pswitch_12
    check-cast v0, La/eru0;

    .line 1376
    .line 1377
    move-object/from16 v1, p1

    .line 1378
    .line 1379
    check-cast v1, La/fet;

    .line 1380
    .line 1381
    move-object/from16 v2, p2

    .line 1382
    .line 1383
    check-cast v2, Ljava/lang/Integer;

    .line 1384
    .line 1385
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1386
    .line 1387
    .line 1388
    move-result v2

    .line 1389
    sget-object v3, La/eru0;->Q1:La/wxs0;

    .line 1390
    .line 1391
    and-int/lit8 v3, v2, 0x3

    .line 1392
    .line 1393
    if-eq v3, v6, :cond_2c

    .line 1394
    .line 1395
    move v3, v8

    .line 1396
    goto :goto_14

    .line 1397
    :cond_2c
    move v3, v7

    .line 1398
    :goto_14
    and-int/2addr v2, v8

    .line 1399
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 1400
    .line 1401
    .line 1402
    move-result v2

    .line 1403
    if-eqz v2, :cond_2f

    .line 1404
    .line 1405
    iget-object v2, v0, La/eru0;->N1:La/a8z;

    .line 1406
    .line 1407
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1408
    .line 1409
    .line 1410
    move-result-object v2

    .line 1411
    check-cast v2, La/k3t0;

    .line 1412
    .line 1413
    check-cast v2, La/i3t0;

    .line 1414
    .line 1415
    invoke-virtual {v2, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 1416
    .line 1417
    .line 1418
    move-result-object v2

    .line 1419
    iget-object v3, v0, La/eru0;->P1:La/qdz;

    .line 1420
    .line 1421
    invoke-virtual {v1, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1422
    .line 1423
    .line 1424
    move-result v5

    .line 1425
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v6

    .line 1429
    if-nez v5, :cond_2d

    .line 1430
    .line 1431
    if-ne v6, v4, :cond_2e

    .line 1432
    .line 1433
    :cond_2d
    new-instance v6, La/npt0;

    .line 1434
    .line 1435
    const/16 v4, 0xf

    .line 1436
    .line 1437
    invoke-direct {v6, v0, v4}, La/npt0;-><init>(Ljava/lang/Object;B)V

    .line 1438
    .line 1439
    .line 1440
    invoke-virtual {v1, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1441
    .line 1442
    .line 1443
    :cond_2e
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 1444
    .line 1445
    invoke-static {v2, v3, v6, v1, v7}, La/y9a;->N(La/l7m0;La/qdz;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1446
    .line 1447
    .line 1448
    goto :goto_15

    .line 1449
    :cond_2f
    invoke-virtual {v1}, La/fet;->X()V

    .line 1450
    .line 1451
    .line 1452
    :goto_15
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1453
    .line 1454
    return-object v0

    .line 1455
    :pswitch_13
    move-object v11, v0

    .line 1456
    check-cast v11, La/opu0;

    .line 1457
    .line 1458
    move-object/from16 v0, p1

    .line 1459
    .line 1460
    check-cast v0, La/fet;

    .line 1461
    .line 1462
    move-object/from16 v1, p2

    .line 1463
    .line 1464
    check-cast v1, Ljava/lang/Integer;

    .line 1465
    .line 1466
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1467
    .line 1468
    .line 1469
    move-result v1

    .line 1470
    sget-object v2, La/opu0;->W1:La/uxs0;

    .line 1471
    .line 1472
    and-int/lit8 v2, v1, 0x3

    .line 1473
    .line 1474
    if-eq v2, v6, :cond_30

    .line 1475
    .line 1476
    move v7, v8

    .line 1477
    :cond_30
    and-int/2addr v1, v8

    .line 1478
    invoke-virtual {v0, v1, v7}, La/fet;->U(IZ)Z

    .line 1479
    .line 1480
    .line 1481
    move-result v1

    .line 1482
    if-eqz v1, :cond_3e

    .line 1483
    .line 1484
    invoke-virtual {v11}, La/opu0;->G0()La/k3t0;

    .line 1485
    .line 1486
    .line 1487
    move-result-object v1

    .line 1488
    invoke-virtual {v0, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1489
    .line 1490
    .line 1491
    move-result v2

    .line 1492
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1493
    .line 1494
    .line 1495
    move-result-object v3

    .line 1496
    if-nez v2, :cond_31

    .line 1497
    .line 1498
    if-ne v3, v4, :cond_32

    .line 1499
    .line 1500
    :cond_31
    new-instance v9, La/las0;

    .line 1501
    .line 1502
    const/4 v15, 0x0

    .line 1503
    const/16 v16, 0x17

    .line 1504
    .line 1505
    const/4 v10, 0x1

    .line 1506
    const-class v12, La/opu0;

    .line 1507
    .line 1508
    const-string v13, "handleSideEffect"

    .line 1509
    .line 1510
    const-string v14, "handleSideEffect(Lorg/xplatform/cyber/section/impl/virtualgamescategories/presentation/categorymain/model/VirtualGameCategoryMainSideEffect;)V"

    .line 1511
    .line 1512
    invoke-direct/range {v9 .. v16}, La/las0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1513
    .line 1514
    .line 1515
    invoke-virtual {v0, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1516
    .line 1517
    .line 1518
    move-object v3, v9

    .line 1519
    :cond_32
    check-cast v3, La/jhy;

    .line 1520
    .line 1521
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 1522
    .line 1523
    sget-object v2, La/lkz;->a:La/lkz;

    .line 1524
    .line 1525
    invoke-static {v3, v0}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 1526
    .line 1527
    .line 1528
    move-result-object v12

    .line 1529
    invoke-virtual {v0, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1530
    .line 1531
    .line 1532
    move-result v2

    .line 1533
    invoke-virtual {v0, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1534
    .line 1535
    .line 1536
    move-result v3

    .line 1537
    or-int/2addr v2, v3

    .line 1538
    invoke-virtual {v0, v5}, La/fet;->e(I)Z

    .line 1539
    .line 1540
    .line 1541
    move-result v3

    .line 1542
    or-int/2addr v2, v3

    .line 1543
    invoke-virtual {v0, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1544
    .line 1545
    .line 1546
    move-result v3

    .line 1547
    or-int/2addr v2, v3

    .line 1548
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1549
    .line 1550
    .line 1551
    move-result-object v3

    .line 1552
    if-nez v2, :cond_33

    .line 1553
    .line 1554
    if-ne v3, v4, :cond_34

    .line 1555
    .line 1556
    :cond_33
    new-instance v9, La/tmj0;

    .line 1557
    .line 1558
    const/4 v13, 0x0

    .line 1559
    const/16 v14, 0x1a

    .line 1560
    .line 1561
    move-object v10, v1

    .line 1562
    invoke-direct/range {v9 .. v14}, La/tmj0;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 1563
    .line 1564
    .line 1565
    invoke-virtual {v0, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1566
    .line 1567
    .line 1568
    move-object v3, v9

    .line 1569
    :cond_34
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 1570
    .line 1571
    invoke-static {v0, v11, v3}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1572
    .line 1573
    .line 1574
    iget-object v1, v11, La/opu0;->U1:La/qdz;

    .line 1575
    .line 1576
    iget-object v2, v11, La/opu0;->V1:La/d930;

    .line 1577
    .line 1578
    invoke-virtual {v11}, La/opu0;->G0()La/k3t0;

    .line 1579
    .line 1580
    .line 1581
    move-result-object v3

    .line 1582
    check-cast v3, La/i3t0;

    .line 1583
    .line 1584
    invoke-virtual {v3, v0}, La/i3t0;->y(La/fet;)La/pz40;

    .line 1585
    .line 1586
    .line 1587
    move-result-object v3

    .line 1588
    invoke-virtual {v0, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1589
    .line 1590
    .line 1591
    move-result v5

    .line 1592
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1593
    .line 1594
    .line 1595
    move-result-object v7

    .line 1596
    if-nez v5, :cond_35

    .line 1597
    .line 1598
    if-ne v7, v4, :cond_36

    .line 1599
    .line 1600
    :cond_35
    new-instance v7, La/lpu0;

    .line 1601
    .line 1602
    invoke-direct {v7, v11, v8}, La/lpu0;-><init>(La/opu0;B)V

    .line 1603
    .line 1604
    .line 1605
    invoke-virtual {v0, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1606
    .line 1607
    .line 1608
    :cond_36
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 1609
    .line 1610
    invoke-virtual {v0, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1611
    .line 1612
    .line 1613
    move-result v5

    .line 1614
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1615
    .line 1616
    .line 1617
    move-result-object v8

    .line 1618
    if-nez v5, :cond_37

    .line 1619
    .line 1620
    if-ne v8, v4, :cond_38

    .line 1621
    .line 1622
    :cond_37
    new-instance v8, La/lpu0;

    .line 1623
    .line 1624
    invoke-direct {v8, v11, v6}, La/lpu0;-><init>(La/opu0;B)V

    .line 1625
    .line 1626
    .line 1627
    invoke-virtual {v0, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1628
    .line 1629
    .line 1630
    :cond_38
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 1631
    .line 1632
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1633
    .line 1634
    .line 1635
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1636
    .line 1637
    .line 1638
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1639
    .line 1640
    .line 1641
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1642
    .line 1643
    .line 1644
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1645
    .line 1646
    .line 1647
    invoke-virtual {v0, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1648
    .line 1649
    .line 1650
    move-result v5

    .line 1651
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1652
    .line 1653
    .line 1654
    move-result-object v6

    .line 1655
    if-nez v5, :cond_39

    .line 1656
    .line 1657
    if-ne v6, v4, :cond_3a

    .line 1658
    .line 1659
    :cond_39
    new-instance v6, La/zbt0;

    .line 1660
    .line 1661
    const/16 v5, 0x14

    .line 1662
    .line 1663
    invoke-direct {v6, v7, v5}, La/zbt0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 1664
    .line 1665
    .line 1666
    invoke-virtual {v0, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1667
    .line 1668
    .line 1669
    :cond_3a
    move-object v12, v6

    .line 1670
    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 1671
    .line 1672
    invoke-virtual {v0, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1673
    .line 1674
    .line 1675
    move-result v5

    .line 1676
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1677
    .line 1678
    .line 1679
    move-result-object v6

    .line 1680
    if-nez v5, :cond_3b

    .line 1681
    .line 1682
    if-ne v6, v4, :cond_3c

    .line 1683
    .line 1684
    :cond_3b
    new-instance v6, La/zbt0;

    .line 1685
    .line 1686
    const/16 v5, 0x15

    .line 1687
    .line 1688
    invoke-direct {v6, v7, v5}, La/zbt0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 1689
    .line 1690
    .line 1691
    invoke-virtual {v0, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1692
    .line 1693
    .line 1694
    :cond_3c
    move-object v13, v6

    .line 1695
    check-cast v13, Lkotlin/jvm/functions/Function0;

    .line 1696
    .line 1697
    const/16 v16, 0x0

    .line 1698
    .line 1699
    const/16 v17, 0x4

    .line 1700
    .line 1701
    const/4 v14, 0x0

    .line 1702
    move-object v15, v0

    .line 1703
    invoke-static/range {v12 .. v17}, La/v3c;->z(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 1704
    .line 1705
    .line 1706
    invoke-static {v0}, La/lgb;->h0(La/fet;)F

    .line 1707
    .line 1708
    .line 1709
    move-result v5

    .line 1710
    sget-object v6, La/qmk;->a:La/zcl;

    .line 1711
    .line 1712
    const/high16 v6, 0x43180000    # 152.0f

    .line 1713
    .line 1714
    add-float v13, v6, v5

    .line 1715
    .line 1716
    const/high16 v6, 0x42600000    # 56.0f

    .line 1717
    .line 1718
    add-float v15, v6, v5

    .line 1719
    .line 1720
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1721
    .line 1722
    .line 1723
    move-result-object v5

    .line 1724
    if-ne v5, v4, :cond_3d

    .line 1725
    .line 1726
    new-instance v4, La/jxr0;

    .line 1727
    .line 1728
    const/4 v5, 0x6

    .line 1729
    invoke-direct {v4, v3, v5}, La/jxr0;-><init>(La/pz40;B)V

    .line 1730
    .line 1731
    .line 1732
    invoke-static {v4}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 1733
    .line 1734
    .line 1735
    move-result-object v5

    .line 1736
    invoke-virtual {v0, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1737
    .line 1738
    .line 1739
    :cond_3d
    check-cast v5, La/l7m0;

    .line 1740
    .line 1741
    sget-object v4, La/m8m0;->a:La/zfn;

    .line 1742
    .line 1743
    invoke-virtual {v0, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 1744
    .line 1745
    .line 1746
    move-result-object v4

    .line 1747
    check-cast v4, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 1748
    .line 1749
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 1750
    .line 1751
    .line 1752
    move-result-wide v9

    .line 1753
    sget-object v4, La/zaq0;->b:La/zfn;

    .line 1754
    .line 1755
    invoke-virtual {v0, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 1756
    .line 1757
    .line 1758
    move-result-object v4

    .line 1759
    check-cast v4, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1760
    .line 1761
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 1762
    .line 1763
    .line 1764
    move-result-wide v19

    .line 1765
    new-instance v12, La/lkb;

    .line 1766
    .line 1767
    const/16 v17, 0x6

    .line 1768
    .line 1769
    move-object/from16 v16, v7

    .line 1770
    .line 1771
    move v14, v13

    .line 1772
    move-object v13, v3

    .line 1773
    invoke-direct/range {v12 .. v17}, La/lkb;-><init>(La/l7m0;FFLkotlin/jvm/functions/Function1;B)V

    .line 1774
    .line 1775
    .line 1776
    move v6, v14

    .line 1777
    move-object/from16 v15, v16

    .line 1778
    .line 1779
    const v3, -0x29d6f7fa

    .line 1780
    .line 1781
    .line 1782
    invoke-static {v3, v12, v0}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 1783
    .line 1784
    .line 1785
    move-result-object v26

    .line 1786
    new-instance v12, La/rpu0;

    .line 1787
    .line 1788
    move-object v14, v2

    .line 1789
    move-object/from16 v17, v5

    .line 1790
    .line 1791
    move-object/from16 v16, v8

    .line 1792
    .line 1793
    move-object/from16 v18, v13

    .line 1794
    .line 1795
    move-object v13, v1

    .line 1796
    invoke-direct/range {v12 .. v18}, La/rpu0;-><init>(La/qdz;La/d930;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/l7m0;La/pz40;)V

    .line 1797
    .line 1798
    .line 1799
    const v1, -0xb23b474

    .line 1800
    .line 1801
    .line 1802
    invoke-static {v1, v12, v0}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 1803
    .line 1804
    .line 1805
    move-result-object v27

    .line 1806
    const/16 v30, 0x1b0

    .line 1807
    .line 1808
    const/16 v31, 0x7c1

    .line 1809
    .line 1810
    const/4 v12, 0x0

    .line 1811
    const/16 v18, 0x0

    .line 1812
    .line 1813
    move-wide/from16 v16, v19

    .line 1814
    .line 1815
    const/high16 v19, 0x41400000    # 12.0f

    .line 1816
    .line 1817
    const/16 v20, 0x0

    .line 1818
    .line 1819
    const-wide/16 v21, 0x0

    .line 1820
    .line 1821
    const/16 v23, 0x0

    .line 1822
    .line 1823
    const/16 v24, 0x0

    .line 1824
    .line 1825
    const/16 v25, 0x0

    .line 1826
    .line 1827
    const/16 v29, 0x6000

    .line 1828
    .line 1829
    move-object/from16 v28, v0

    .line 1830
    .line 1831
    move v13, v6

    .line 1832
    move-wide v14, v9

    .line 1833
    invoke-static/range {v12 .. v31}, La/m0x0;->d(La/mm40;FJJZFLa/ycl;JFLa/l7m0;Lkotlin/jvm/functions/Function1;La/ugd;La/ugd;La/fet;III)V

    .line 1834
    .line 1835
    .line 1836
    goto :goto_16

    .line 1837
    :cond_3e
    move-object v15, v0

    .line 1838
    invoke-virtual {v15}, La/fet;->X()V

    .line 1839
    .line 1840
    .line 1841
    :goto_16
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1842
    .line 1843
    return-object v0

    .line 1844
    :pswitch_14
    check-cast v0, La/jou0;

    .line 1845
    .line 1846
    move-object/from16 v1, p1

    .line 1847
    .line 1848
    check-cast v1, La/fet;

    .line 1849
    .line 1850
    move-object/from16 v2, p2

    .line 1851
    .line 1852
    check-cast v2, Ljava/lang/Integer;

    .line 1853
    .line 1854
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1855
    .line 1856
    .line 1857
    move-result v2

    .line 1858
    sget-object v3, La/jou0;->R1:La/sxs0;

    .line 1859
    .line 1860
    and-int/lit8 v3, v2, 0x3

    .line 1861
    .line 1862
    if-eq v3, v6, :cond_3f

    .line 1863
    .line 1864
    move v3, v8

    .line 1865
    goto :goto_17

    .line 1866
    :cond_3f
    move v3, v7

    .line 1867
    :goto_17
    and-int/2addr v2, v8

    .line 1868
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 1869
    .line 1870
    .line 1871
    move-result v2

    .line 1872
    if-eqz v2, :cond_42

    .line 1873
    .line 1874
    iget-object v2, v0, La/jou0;->O1:La/a8z;

    .line 1875
    .line 1876
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1877
    .line 1878
    .line 1879
    move-result-object v2

    .line 1880
    check-cast v2, La/k3t0;

    .line 1881
    .line 1882
    check-cast v2, La/i3t0;

    .line 1883
    .line 1884
    invoke-virtual {v2, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 1885
    .line 1886
    .line 1887
    move-result-object v2

    .line 1888
    iget-object v3, v0, La/jou0;->Q1:La/qdz;

    .line 1889
    .line 1890
    invoke-virtual {v1, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1891
    .line 1892
    .line 1893
    move-result v5

    .line 1894
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1895
    .line 1896
    .line 1897
    move-result-object v6

    .line 1898
    if-nez v5, :cond_40

    .line 1899
    .line 1900
    if-ne v6, v4, :cond_41

    .line 1901
    .line 1902
    :cond_40
    new-instance v6, La/npt0;

    .line 1903
    .line 1904
    const/16 v4, 0xd

    .line 1905
    .line 1906
    invoke-direct {v6, v0, v4}, La/npt0;-><init>(Ljava/lang/Object;B)V

    .line 1907
    .line 1908
    .line 1909
    invoke-virtual {v1, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1910
    .line 1911
    .line 1912
    :cond_41
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 1913
    .line 1914
    invoke-static {v2, v3, v6, v1, v7}, La/ny9;->M(La/l7m0;La/qdz;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1915
    .line 1916
    .line 1917
    goto :goto_18

    .line 1918
    :cond_42
    invoke-virtual {v1}, La/fet;->X()V

    .line 1919
    .line 1920
    .line 1921
    :goto_18
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1922
    .line 1923
    return-object v0

    .line 1924
    :pswitch_15
    move-object v10, v0

    .line 1925
    check-cast v10, La/gau0;

    .line 1926
    .line 1927
    move-object/from16 v0, p1

    .line 1928
    .line 1929
    check-cast v0, La/fet;

    .line 1930
    .line 1931
    move-object/from16 v1, p2

    .line 1932
    .line 1933
    check-cast v1, Ljava/lang/Integer;

    .line 1934
    .line 1935
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1936
    .line 1937
    .line 1938
    move-result v1

    .line 1939
    sget-object v2, La/gau0;->P1:La/kys0;

    .line 1940
    .line 1941
    and-int/lit8 v2, v1, 0x3

    .line 1942
    .line 1943
    if-eq v2, v6, :cond_43

    .line 1944
    .line 1945
    move v2, v8

    .line 1946
    goto :goto_19

    .line 1947
    :cond_43
    move v2, v7

    .line 1948
    :goto_19
    and-int/2addr v1, v8

    .line 1949
    invoke-virtual {v0, v1, v2}, La/fet;->U(IZ)Z

    .line 1950
    .line 1951
    .line 1952
    move-result v1

    .line 1953
    if-eqz v1, :cond_4a

    .line 1954
    .line 1955
    invoke-virtual {v10}, La/gau0;->G0()La/k3t0;

    .line 1956
    .line 1957
    .line 1958
    move-result-object v1

    .line 1959
    invoke-virtual {v0, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1960
    .line 1961
    .line 1962
    move-result v2

    .line 1963
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1964
    .line 1965
    .line 1966
    move-result-object v3

    .line 1967
    if-nez v2, :cond_44

    .line 1968
    .line 1969
    if-ne v3, v4, :cond_45

    .line 1970
    .line 1971
    :cond_44
    new-instance v8, La/las0;

    .line 1972
    .line 1973
    const/4 v14, 0x0

    .line 1974
    const/16 v15, 0x13

    .line 1975
    .line 1976
    const/4 v9, 0x1

    .line 1977
    const-class v11, La/gau0;

    .line 1978
    .line 1979
    const-string v12, "handleSideEffect"

    .line 1980
    .line 1981
    const-string v13, "handleSideEffect(Lorg/xplatform/verification/status/impl/presentation/models/verification_status/VerificationStatusSideEffect;)V"

    .line 1982
    .line 1983
    invoke-direct/range {v8 .. v15}, La/las0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1984
    .line 1985
    .line 1986
    invoke-virtual {v0, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1987
    .line 1988
    .line 1989
    move-object v3, v8

    .line 1990
    :cond_45
    check-cast v3, La/jhy;

    .line 1991
    .line 1992
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 1993
    .line 1994
    sget-object v2, La/lkz;->a:La/lkz;

    .line 1995
    .line 1996
    invoke-static {v3, v0}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 1997
    .line 1998
    .line 1999
    move-result-object v11

    .line 2000
    invoke-virtual {v0, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2001
    .line 2002
    .line 2003
    move-result v2

    .line 2004
    invoke-virtual {v0, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2005
    .line 2006
    .line 2007
    move-result v3

    .line 2008
    or-int/2addr v2, v3

    .line 2009
    invoke-virtual {v0, v5}, La/fet;->e(I)Z

    .line 2010
    .line 2011
    .line 2012
    move-result v3

    .line 2013
    or-int/2addr v2, v3

    .line 2014
    invoke-virtual {v0, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 2015
    .line 2016
    .line 2017
    move-result v3

    .line 2018
    or-int/2addr v2, v3

    .line 2019
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 2020
    .line 2021
    .line 2022
    move-result-object v3

    .line 2023
    if-nez v2, :cond_46

    .line 2024
    .line 2025
    if-ne v3, v4, :cond_47

    .line 2026
    .line 2027
    :cond_46
    new-instance v8, La/tmj0;

    .line 2028
    .line 2029
    const/4 v12, 0x0

    .line 2030
    const/16 v13, 0x19

    .line 2031
    .line 2032
    move-object v9, v1

    .line 2033
    invoke-direct/range {v8 .. v13}, La/tmj0;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 2034
    .line 2035
    .line 2036
    invoke-virtual {v0, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2037
    .line 2038
    .line 2039
    move-object v3, v8

    .line 2040
    :cond_47
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 2041
    .line 2042
    invoke-static {v0, v10, v3}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2043
    .line 2044
    .line 2045
    invoke-virtual {v10}, La/gau0;->G0()La/k3t0;

    .line 2046
    .line 2047
    .line 2048
    move-result-object v1

    .line 2049
    check-cast v1, La/i3t0;

    .line 2050
    .line 2051
    invoke-virtual {v1, v0}, La/i3t0;->y(La/fet;)La/pz40;

    .line 2052
    .line 2053
    .line 2054
    move-result-object v1

    .line 2055
    invoke-virtual {v10}, La/gau0;->G0()La/k3t0;

    .line 2056
    .line 2057
    .line 2058
    move-result-object v13

    .line 2059
    invoke-virtual {v0, v13}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2060
    .line 2061
    .line 2062
    move-result v2

    .line 2063
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 2064
    .line 2065
    .line 2066
    move-result-object v3

    .line 2067
    if-nez v2, :cond_48

    .line 2068
    .line 2069
    if-ne v3, v4, :cond_49

    .line 2070
    .line 2071
    :cond_48
    new-instance v11, La/las0;

    .line 2072
    .line 2073
    const/16 v17, 0x0

    .line 2074
    .line 2075
    const/16 v18, 0x14

    .line 2076
    .line 2077
    const/4 v12, 0x1

    .line 2078
    const-class v14, La/k3t0;

    .line 2079
    .line 2080
    const-string v15, "onAction"

    .line 2081
    .line 2082
    const-string v16, "onAction(Ljava/lang/Object;)V"

    .line 2083
    .line 2084
    invoke-direct/range {v11 .. v18}, La/las0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2085
    .line 2086
    .line 2087
    invoke-virtual {v0, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2088
    .line 2089
    .line 2090
    move-object v3, v11

    .line 2091
    :cond_49
    check-cast v3, La/jhy;

    .line 2092
    .line 2093
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 2094
    .line 2095
    invoke-static {v1, v3, v0, v7}, La/jd8;->W(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 2096
    .line 2097
    .line 2098
    goto :goto_1a

    .line 2099
    :cond_4a
    invoke-virtual {v0}, La/fet;->X()V

    .line 2100
    .line 2101
    .line 2102
    :goto_1a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2103
    .line 2104
    return-object v0

    .line 2105
    :pswitch_16
    check-cast v0, La/a9u0;

    .line 2106
    .line 2107
    move-object/from16 v1, p1

    .line 2108
    .line 2109
    check-cast v1, La/mbu0;

    .line 2110
    .line 2111
    move-object/from16 v2, p2

    .line 2112
    .line 2113
    check-cast v2, Ljava/lang/String;

    .line 2114
    .line 2115
    sget-object v4, La/a9u0;->R1:La/uxs0;

    .line 2116
    .line 2117
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2118
    .line 2119
    .line 2120
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2121
    .line 2122
    .line 2123
    iget-object v0, v0, La/a9u0;->P1:La/kiu0;

    .line 2124
    .line 2125
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 2126
    .line 2127
    .line 2128
    move-result-object v0

    .line 2129
    check-cast v0, La/i9u0;

    .line 2130
    .line 2131
    iget-object v4, v0, La/i9u0;->b:La/i1w0;

    .line 2132
    .line 2133
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 2134
    .line 2135
    .line 2136
    move-result v5

    .line 2137
    if-eqz v5, :cond_4b

    .line 2138
    .line 2139
    if-eq v5, v6, :cond_4b

    .line 2140
    .line 2141
    new-instance v2, La/c9u0;

    .line 2142
    .line 2143
    invoke-direct {v2, v0, v1, v8}, La/c9u0;-><init>(La/i9u0;La/mbu0;B)V

    .line 2144
    .line 2145
    .line 2146
    invoke-virtual {v4, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 2147
    .line 2148
    .line 2149
    goto :goto_1d

    .line 2150
    :cond_4b
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 2151
    .line 2152
    .line 2153
    move-result v1

    .line 2154
    if-lez v1, :cond_4c

    .line 2155
    .line 2156
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2157
    .line 2158
    .line 2159
    move-result-object v8

    .line 2160
    iget-object v1, v0, La/i9u0;->f:La/mne;

    .line 2161
    .line 2162
    iget-object v11, v1, La/mne;->a:La/rwj;

    .line 2163
    .line 2164
    new-instance v9, La/d4u0;

    .line 2165
    .line 2166
    const/4 v1, 0x4

    .line 2167
    invoke-direct {v9, v1}, La/d4u0;-><init>(B)V

    .line 2168
    .line 2169
    .line 2170
    new-instance v12, La/n7t0;

    .line 2171
    .line 2172
    const/4 v1, 0x5

    .line 2173
    invoke-direct {v12, v0, v2, v3, v1}, La/n7t0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 2174
    .line 2175
    .line 2176
    const/16 v13, 0xa

    .line 2177
    .line 2178
    const/4 v10, 0x0

    .line 2179
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 2180
    .line 2181
    .line 2182
    goto :goto_1d

    .line 2183
    :cond_4c
    invoke-static {v4}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2184
    .line 2185
    .line 2186
    move-result-object v1

    .line 2187
    iget-object v0, v0, La/i9u0;->d:La/bbw0;

    .line 2188
    .line 2189
    iget-object v0, v0, La/bbw0;->b:Ljava/lang/Object;

    .line 2190
    .line 2191
    check-cast v0, La/clc;

    .line 2192
    .line 2193
    invoke-virtual {v0}, La/clc;->d()La/r46;

    .line 2194
    .line 2195
    .line 2196
    move-result-object v0

    .line 2197
    invoke-virtual {v0}, La/r46;->a()Lorg/xplatform/verification/base/impl/navigation/BaseVerificationScreens$BaseVerificationFragmentScreen;

    .line 2198
    .line 2199
    .line 2200
    move-result-object v0

    .line 2201
    instance-of v2, v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 2202
    .line 2203
    if-eqz v2, :cond_4d

    .line 2204
    .line 2205
    new-instance v2, La/e1w0;

    .line 2206
    .line 2207
    check-cast v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 2208
    .line 2209
    invoke-direct {v2, v0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 2210
    .line 2211
    .line 2212
    new-instance v0, La/c8d;

    .line 2213
    .line 2214
    sget-object v3, La/y7d;->a:La/v7d;

    .line 2215
    .line 2216
    invoke-direct {v0, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 2217
    .line 2218
    .line 2219
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 2220
    .line 2221
    .line 2222
    goto :goto_1b

    .line 2223
    :cond_4d
    new-instance v2, La/w0w0;

    .line 2224
    .line 2225
    invoke-direct {v2, v0}, La/w0w0;-><init>(La/m7h0;)V

    .line 2226
    .line 2227
    .line 2228
    new-instance v0, La/c8d;

    .line 2229
    .line 2230
    sget-object v3, La/y7d;->a:La/v7d;

    .line 2231
    .line 2232
    invoke-direct {v0, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 2233
    .line 2234
    .line 2235
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 2236
    .line 2237
    .line 2238
    :goto_1b
    invoke-static {v4, v1, v7}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 2239
    .line 2240
    .line 2241
    move-result-object v0

    .line 2242
    :goto_1c
    move-object v1, v0

    .line 2243
    check-cast v1, La/paw;

    .line 2244
    .line 2245
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 2246
    .line 2247
    .line 2248
    move-result v2

    .line 2249
    if-eqz v2, :cond_4e

    .line 2250
    .line 2251
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 2252
    .line 2253
    .line 2254
    move-result-object v1

    .line 2255
    check-cast v1, La/oe50;

    .line 2256
    .line 2257
    invoke-virtual {v4, v1}, La/i1w0;->a(La/oe50;)V

    .line 2258
    .line 2259
    .line 2260
    goto :goto_1c

    .line 2261
    :cond_4e
    :goto_1d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2262
    .line 2263
    return-object v0

    .line 2264
    :pswitch_17
    move-object v10, v0

    .line 2265
    check-cast v10, La/v8u0;

    .line 2266
    .line 2267
    iget-object v0, v10, La/v8u0;->O1:La/a8z;

    .line 2268
    .line 2269
    move-object/from16 v1, p1

    .line 2270
    .line 2271
    check-cast v1, La/fet;

    .line 2272
    .line 2273
    move-object/from16 v2, p2

    .line 2274
    .line 2275
    check-cast v2, Ljava/lang/Integer;

    .line 2276
    .line 2277
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 2278
    .line 2279
    .line 2280
    move-result v2

    .line 2281
    sget-object v3, La/v8u0;->P1:La/sxs0;

    .line 2282
    .line 2283
    and-int/lit8 v3, v2, 0x3

    .line 2284
    .line 2285
    if-eq v3, v6, :cond_4f

    .line 2286
    .line 2287
    move v3, v8

    .line 2288
    goto :goto_1e

    .line 2289
    :cond_4f
    move v3, v7

    .line 2290
    :goto_1e
    and-int/2addr v2, v8

    .line 2291
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 2292
    .line 2293
    .line 2294
    move-result v2

    .line 2295
    if-eqz v2, :cond_56

    .line 2296
    .line 2297
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 2298
    .line 2299
    .line 2300
    move-result-object v2

    .line 2301
    check-cast v2, La/k3t0;

    .line 2302
    .line 2303
    invoke-virtual {v1, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2304
    .line 2305
    .line 2306
    move-result v3

    .line 2307
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 2308
    .line 2309
    .line 2310
    move-result-object v6

    .line 2311
    if-nez v3, :cond_50

    .line 2312
    .line 2313
    if-ne v6, v4, :cond_51

    .line 2314
    .line 2315
    :cond_50
    new-instance v8, La/las0;

    .line 2316
    .line 2317
    const/4 v14, 0x0

    .line 2318
    const/16 v15, 0x11

    .line 2319
    .line 2320
    const/4 v9, 0x1

    .line 2321
    const-class v11, La/v8u0;

    .line 2322
    .line 2323
    const-string v12, "handleSideEffect"

    .line 2324
    .line 2325
    const-string v13, "handleSideEffect(Lorg/xplatform/verification/options/impl/presentation/models/VerificationOptionsSideEffect;)V"

    .line 2326
    .line 2327
    invoke-direct/range {v8 .. v15}, La/las0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2328
    .line 2329
    .line 2330
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2331
    .line 2332
    .line 2333
    move-object v6, v8

    .line 2334
    :cond_51
    check-cast v6, La/jhy;

    .line 2335
    .line 2336
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 2337
    .line 2338
    sget-object v3, La/lkz;->a:La/lkz;

    .line 2339
    .line 2340
    invoke-static {v6, v1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 2341
    .line 2342
    .line 2343
    move-result-object v11

    .line 2344
    invoke-virtual {v1, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2345
    .line 2346
    .line 2347
    move-result v3

    .line 2348
    invoke-virtual {v1, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2349
    .line 2350
    .line 2351
    move-result v6

    .line 2352
    or-int/2addr v3, v6

    .line 2353
    invoke-virtual {v1, v5}, La/fet;->e(I)Z

    .line 2354
    .line 2355
    .line 2356
    move-result v5

    .line 2357
    or-int/2addr v3, v5

    .line 2358
    invoke-virtual {v1, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 2359
    .line 2360
    .line 2361
    move-result v5

    .line 2362
    or-int/2addr v3, v5

    .line 2363
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 2364
    .line 2365
    .line 2366
    move-result-object v5

    .line 2367
    if-nez v3, :cond_52

    .line 2368
    .line 2369
    if-ne v5, v4, :cond_53

    .line 2370
    .line 2371
    :cond_52
    new-instance v8, La/tmj0;

    .line 2372
    .line 2373
    const/4 v12, 0x0

    .line 2374
    const/16 v13, 0x18

    .line 2375
    .line 2376
    move-object v9, v2

    .line 2377
    invoke-direct/range {v8 .. v13}, La/tmj0;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 2378
    .line 2379
    .line 2380
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2381
    .line 2382
    .line 2383
    move-object v5, v8

    .line 2384
    :cond_53
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 2385
    .line 2386
    invoke-static {v1, v10, v5}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2387
    .line 2388
    .line 2389
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 2390
    .line 2391
    .line 2392
    move-result-object v2

    .line 2393
    check-cast v2, La/k3t0;

    .line 2394
    .line 2395
    check-cast v2, La/i3t0;

    .line 2396
    .line 2397
    invoke-virtual {v2, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 2398
    .line 2399
    .line 2400
    move-result-object v2

    .line 2401
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 2402
    .line 2403
    .line 2404
    move-result-object v0

    .line 2405
    move-object v10, v0

    .line 2406
    check-cast v10, La/k3t0;

    .line 2407
    .line 2408
    invoke-virtual {v1, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2409
    .line 2410
    .line 2411
    move-result v0

    .line 2412
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 2413
    .line 2414
    .line 2415
    move-result-object v3

    .line 2416
    if-nez v0, :cond_54

    .line 2417
    .line 2418
    if-ne v3, v4, :cond_55

    .line 2419
    .line 2420
    :cond_54
    new-instance v8, La/las0;

    .line 2421
    .line 2422
    const/4 v14, 0x0

    .line 2423
    const/16 v15, 0x12

    .line 2424
    .line 2425
    const/4 v9, 0x1

    .line 2426
    const-class v11, La/k3t0;

    .line 2427
    .line 2428
    const-string v12, "onAction"

    .line 2429
    .line 2430
    const-string v13, "onAction(Ljava/lang/Object;)V"

    .line 2431
    .line 2432
    invoke-direct/range {v8 .. v15}, La/las0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2433
    .line 2434
    .line 2435
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2436
    .line 2437
    .line 2438
    move-object v3, v8

    .line 2439
    :cond_55
    check-cast v3, La/jhy;

    .line 2440
    .line 2441
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 2442
    .line 2443
    invoke-static {v2, v3, v1, v7}, La/j47;->s0(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 2444
    .line 2445
    .line 2446
    goto :goto_1f

    .line 2447
    :cond_56
    invoke-virtual {v1}, La/fet;->X()V

    .line 2448
    .line 2449
    .line 2450
    :goto_1f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2451
    .line 2452
    return-object v0

    .line 2453
    :pswitch_18
    check-cast v0, La/l4m0;

    .line 2454
    .line 2455
    move-object/from16 v1, p1

    .line 2456
    .line 2457
    check-cast v1, La/fet;

    .line 2458
    .line 2459
    move-object/from16 v2, p2

    .line 2460
    .line 2461
    check-cast v2, Ljava/lang/Integer;

    .line 2462
    .line 2463
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2464
    .line 2465
    .line 2466
    invoke-static {v8}, La/x8x;->L(I)I

    .line 2467
    .line 2468
    .line 2469
    move-result v2

    .line 2470
    invoke-static {v0, v1, v2}, La/dnm0;->g(La/l4m0;La/fet;I)V

    .line 2471
    .line 2472
    .line 2473
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2474
    .line 2475
    return-object v0

    .line 2476
    :pswitch_19
    check-cast v0, La/czt0;

    .line 2477
    .line 2478
    move-object/from16 v13, p1

    .line 2479
    .line 2480
    check-cast v13, La/fet;

    .line 2481
    .line 2482
    move-object/from16 v1, p2

    .line 2483
    .line 2484
    check-cast v1, Ljava/lang/Integer;

    .line 2485
    .line 2486
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 2487
    .line 2488
    .line 2489
    move-result v1

    .line 2490
    sget-object v5, La/czt0;->U1:La/wxs0;

    .line 2491
    .line 2492
    and-int/lit8 v5, v1, 0x3

    .line 2493
    .line 2494
    if-eq v5, v6, :cond_57

    .line 2495
    .line 2496
    move v7, v8

    .line 2497
    :cond_57
    and-int/2addr v1, v8

    .line 2498
    invoke-virtual {v13, v1, v7}, La/fet;->U(IZ)Z

    .line 2499
    .line 2500
    .line 2501
    move-result v1

    .line 2502
    if-eqz v1, :cond_5b

    .line 2503
    .line 2504
    iget-object v1, v0, La/czt0;->O1:La/kiu0;

    .line 2505
    .line 2506
    invoke-virtual {v1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 2507
    .line 2508
    .line 2509
    move-result-object v1

    .line 2510
    move-object v11, v1

    .line 2511
    check-cast v11, La/tzt0;

    .line 2512
    .line 2513
    iget-object v10, v0, La/czt0;->Q1:La/qdz;

    .line 2514
    .line 2515
    iget-object v9, v0, La/czt0;->L1:La/g2v;

    .line 2516
    .line 2517
    if-eqz v9, :cond_5a

    .line 2518
    .line 2519
    invoke-virtual {v13, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2520
    .line 2521
    .line 2522
    move-result v1

    .line 2523
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 2524
    .line 2525
    .line 2526
    move-result-object v2

    .line 2527
    if-nez v1, :cond_58

    .line 2528
    .line 2529
    if-ne v2, v4, :cond_59

    .line 2530
    .line 2531
    :cond_58
    new-instance v2, La/azt0;

    .line 2532
    .line 2533
    invoke-direct {v2, v0, v8}, La/azt0;-><init>(La/czt0;B)V

    .line 2534
    .line 2535
    .line 2536
    invoke-virtual {v13, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2537
    .line 2538
    .line 2539
    :cond_59
    move-object v12, v2

    .line 2540
    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 2541
    .line 2542
    const/4 v14, 0x0

    .line 2543
    invoke-static/range {v9 .. v14}, La/b34;->R(La/g2v;La/qdz;La/tzt0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 2544
    .line 2545
    .line 2546
    goto :goto_20

    .line 2547
    :cond_5a
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2548
    .line 2549
    .line 2550
    throw v3

    .line 2551
    :cond_5b
    invoke-virtual {v13}, La/fet;->X()V

    .line 2552
    .line 2553
    .line 2554
    :goto_20
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2555
    .line 2556
    return-object v0

    .line 2557
    :pswitch_1a
    check-cast v0, La/sxt0;

    .line 2558
    .line 2559
    move-object/from16 v1, p1

    .line 2560
    .line 2561
    check-cast v1, La/fet;

    .line 2562
    .line 2563
    move-object/from16 v2, p2

    .line 2564
    .line 2565
    check-cast v2, Ljava/lang/Integer;

    .line 2566
    .line 2567
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 2568
    .line 2569
    .line 2570
    move-result v2

    .line 2571
    sget-object v3, La/sxt0;->b2:La/svs0;

    .line 2572
    .line 2573
    and-int/lit8 v3, v2, 0x3

    .line 2574
    .line 2575
    if-eq v3, v6, :cond_5c

    .line 2576
    .line 2577
    move v3, v8

    .line 2578
    goto :goto_21

    .line 2579
    :cond_5c
    move v3, v7

    .line 2580
    :goto_21
    and-int/2addr v2, v8

    .line 2581
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 2582
    .line 2583
    .line 2584
    move-result v2

    .line 2585
    if-eqz v2, :cond_66

    .line 2586
    .line 2587
    invoke-virtual {v0}, La/sxt0;->H0()La/k3t0;

    .line 2588
    .line 2589
    .line 2590
    move-result-object v2

    .line 2591
    check-cast v2, La/i3t0;

    .line 2592
    .line 2593
    invoke-virtual {v2, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 2594
    .line 2595
    .line 2596
    move-result-object v2

    .line 2597
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 2598
    .line 2599
    .line 2600
    move-result-object v2

    .line 2601
    move-object v9, v2

    .line 2602
    check-cast v9, La/z1u0;

    .line 2603
    .line 2604
    iget-object v10, v0, La/sxt0;->M1:La/sek;

    .line 2605
    .line 2606
    if-eqz v10, :cond_65

    .line 2607
    .line 2608
    iget-object v11, v0, La/sxt0;->N1:La/bek;

    .line 2609
    .line 2610
    if-eqz v11, :cond_64

    .line 2611
    .line 2612
    invoke-virtual {v0}, La/sxt0;->G0()Lorg/xplatform/cyber/game/valorant/api/ValorantGameScreenParams;

    .line 2613
    .line 2614
    .line 2615
    move-result-object v3

    .line 2616
    iget-wide v12, v3, Lorg/xplatform/cyber/game/valorant/api/ValorantGameScreenParams;->e:J

    .line 2617
    .line 2618
    invoke-virtual {v0}, La/sxt0;->G0()Lorg/xplatform/cyber/game/valorant/api/ValorantGameScreenParams;

    .line 2619
    .line 2620
    .line 2621
    move-result-object v3

    .line 2622
    iget-wide v14, v3, Lorg/xplatform/cyber/game/valorant/api/ValorantGameScreenParams;->c:J

    .line 2623
    .line 2624
    invoke-virtual {v0}, La/sxt0;->G0()Lorg/xplatform/cyber/game/valorant/api/ValorantGameScreenParams;

    .line 2625
    .line 2626
    .line 2627
    move-result-object v3

    .line 2628
    iget-wide v2, v3, Lorg/xplatform/cyber/game/valorant/api/ValorantGameScreenParams;->a:J

    .line 2629
    .line 2630
    invoke-virtual {v0}, La/sxt0;->G0()Lorg/xplatform/cyber/game/valorant/api/ValorantGameScreenParams;

    .line 2631
    .line 2632
    .line 2633
    move-result-object v6

    .line 2634
    iget-boolean v6, v6, Lorg/xplatform/cyber/game/valorant/api/ValorantGameScreenParams;->d:Z

    .line 2635
    .line 2636
    invoke-virtual {v0}, La/sxt0;->G0()Lorg/xplatform/cyber/game/valorant/api/ValorantGameScreenParams;

    .line 2637
    .line 2638
    .line 2639
    move-result-object v8

    .line 2640
    move/from16 v21, v6

    .line 2641
    .line 2642
    iget-wide v5, v8, Lorg/xplatform/cyber/game/valorant/api/ValorantGameScreenParams;->b:J

    .line 2643
    .line 2644
    move-wide/from16 v17, v12

    .line 2645
    .line 2646
    new-instance v12, La/z5s;

    .line 2647
    .line 2648
    move-wide/from16 v19, v14

    .line 2649
    .line 2650
    move-wide v13, v2

    .line 2651
    move-wide v15, v5

    .line 2652
    invoke-direct/range {v12 .. v21}, La/z5s;-><init>(JJJJZ)V

    .line 2653
    .line 2654
    .line 2655
    iget-object v13, v0, La/sxt0;->a2:La/qdz;

    .line 2656
    .line 2657
    iget-object v14, v0, La/sxt0;->S1:La/xex;

    .line 2658
    .line 2659
    if-eqz v14, :cond_63

    .line 2660
    .line 2661
    new-instance v15, Lorg/xplatform/cyber/game/core/game_screen/presentation/bottomsheet/CyberBottomSheetParams;

    .line 2662
    .line 2663
    invoke-virtual {v0}, La/sxt0;->G0()Lorg/xplatform/cyber/game/valorant/api/ValorantGameScreenParams;

    .line 2664
    .line 2665
    .line 2666
    move-result-object v2

    .line 2667
    iget-wide v2, v2, Lorg/xplatform/cyber/game/valorant/api/ValorantGameScreenParams;->a:J

    .line 2668
    .line 2669
    invoke-virtual {v0}, La/sxt0;->G0()Lorg/xplatform/cyber/game/valorant/api/ValorantGameScreenParams;

    .line 2670
    .line 2671
    .line 2672
    move-result-object v5

    .line 2673
    iget-wide v5, v5, Lorg/xplatform/cyber/game/valorant/api/ValorantGameScreenParams;->b:J

    .line 2674
    .line 2675
    invoke-virtual {v0}, La/sxt0;->G0()Lorg/xplatform/cyber/game/valorant/api/ValorantGameScreenParams;

    .line 2676
    .line 2677
    .line 2678
    move-result-object v8

    .line 2679
    iget-boolean v8, v8, Lorg/xplatform/cyber/game/valorant/api/ValorantGameScreenParams;->d:Z

    .line 2680
    .line 2681
    invoke-virtual {v0}, La/sxt0;->G0()Lorg/xplatform/cyber/game/valorant/api/ValorantGameScreenParams;

    .line 2682
    .line 2683
    .line 2684
    move-result-object v7

    .line 2685
    move-wide/from16 v24, v2

    .line 2686
    .line 2687
    iget-wide v2, v7, Lorg/xplatform/cyber/game/valorant/api/ValorantGameScreenParams;->e:J

    .line 2688
    .line 2689
    invoke-virtual {v0}, La/sxt0;->G0()Lorg/xplatform/cyber/game/valorant/api/ValorantGameScreenParams;

    .line 2690
    .line 2691
    .line 2692
    move-result-object v7

    .line 2693
    move-wide/from16 v29, v2

    .line 2694
    .line 2695
    iget-wide v2, v7, Lorg/xplatform/cyber/game/valorant/api/ValorantGameScreenParams;->h:J

    .line 2696
    .line 2697
    new-instance v35, La/lq2;

    .line 2698
    .line 2699
    invoke-direct/range {v35 .. v35}, Ljava/lang/Object;-><init>()V

    .line 2700
    .line 2701
    .line 2702
    sget-object v36, La/grs;->b:La/grs;

    .line 2703
    .line 2704
    const-class v7, La/sxt0;

    .line 2705
    .line 2706
    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 2707
    .line 2708
    .line 2709
    move-result-object v37

    .line 2710
    const-wide/16 v31, 0x1b

    .line 2711
    .line 2712
    move-wide/from16 v33, v2

    .line 2713
    .line 2714
    move-wide/from16 v26, v5

    .line 2715
    .line 2716
    move/from16 v28, v8

    .line 2717
    .line 2718
    move-object/from16 v23, v15

    .line 2719
    .line 2720
    invoke-direct/range {v23 .. v37}, Lorg/xplatform/cyber/game/core/game_screen/presentation/bottomsheet/CyberBottomSheetParams;-><init>(JJZJJJLa/ms2;La/grs;Ljava/lang/String;)V

    .line 2721
    .line 2722
    .line 2723
    invoke-virtual {v0}, La/sxt0;->H0()La/k3t0;

    .line 2724
    .line 2725
    .line 2726
    move-result-object v2

    .line 2727
    invoke-virtual {v1, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2728
    .line 2729
    .line 2730
    move-result v3

    .line 2731
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 2732
    .line 2733
    .line 2734
    move-result-object v5

    .line 2735
    if-nez v3, :cond_5d

    .line 2736
    .line 2737
    if-ne v5, v4, :cond_5e

    .line 2738
    .line 2739
    :cond_5d
    new-instance v23, La/las0;

    .line 2740
    .line 2741
    const/16 v29, 0x0

    .line 2742
    .line 2743
    const/16 v30, 0xe

    .line 2744
    .line 2745
    const/16 v24, 0x1

    .line 2746
    .line 2747
    const-class v26, La/k3t0;

    .line 2748
    .line 2749
    const-string v27, "onAction"

    .line 2750
    .line 2751
    const-string v28, "onAction(Ljava/lang/Object;)V"

    .line 2752
    .line 2753
    move-object/from16 v25, v2

    .line 2754
    .line 2755
    invoke-direct/range {v23 .. v30}, La/las0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2756
    .line 2757
    .line 2758
    move-object/from16 v5, v23

    .line 2759
    .line 2760
    invoke-virtual {v1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2761
    .line 2762
    .line 2763
    :cond_5e
    check-cast v5, La/jhy;

    .line 2764
    .line 2765
    move-object/from16 v16, v5

    .line 2766
    .line 2767
    check-cast v16, Lkotlin/jvm/functions/Function1;

    .line 2768
    .line 2769
    const/16 v18, 0x0

    .line 2770
    .line 2771
    move-object/from16 v17, v1

    .line 2772
    .line 2773
    invoke-static/range {v9 .. v18}, La/ycm0;->i(La/z1u0;La/sek;La/bek;La/z5s;La/qdz;La/xex;Lorg/xplatform/cyber/game/core/game_screen/presentation/bottomsheet/CyberBottomSheetParams;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 2774
    .line 2775
    .line 2776
    invoke-virtual {v0}, La/sxt0;->H0()La/k3t0;

    .line 2777
    .line 2778
    .line 2779
    move-result-object v12

    .line 2780
    invoke-virtual {v1, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2781
    .line 2782
    .line 2783
    move-result v2

    .line 2784
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 2785
    .line 2786
    .line 2787
    move-result-object v3

    .line 2788
    if-nez v2, :cond_5f

    .line 2789
    .line 2790
    if-ne v3, v4, :cond_60

    .line 2791
    .line 2792
    :cond_5f
    new-instance v3, La/pxt0;

    .line 2793
    .line 2794
    const/4 v2, 0x0

    .line 2795
    invoke-direct {v3, v0, v2}, La/pxt0;-><init>(La/sxt0;B)V

    .line 2796
    .line 2797
    .line 2798
    invoke-virtual {v1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2799
    .line 2800
    .line 2801
    :cond_60
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 2802
    .line 2803
    sget-object v0, La/or00;->a:La/zfn;

    .line 2804
    .line 2805
    invoke-virtual {v1, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 2806
    .line 2807
    .line 2808
    move-result-object v0

    .line 2809
    move-object v13, v0

    .line 2810
    check-cast v13, La/clz;

    .line 2811
    .line 2812
    sget-object v0, La/lkz;->a:La/lkz;

    .line 2813
    .line 2814
    invoke-static {v3, v1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 2815
    .line 2816
    .line 2817
    move-result-object v14

    .line 2818
    invoke-virtual {v1, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2819
    .line 2820
    .line 2821
    move-result v0

    .line 2822
    invoke-virtual {v1, v13}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2823
    .line 2824
    .line 2825
    move-result v2

    .line 2826
    or-int/2addr v0, v2

    .line 2827
    const/4 v2, 0x3

    .line 2828
    invoke-virtual {v1, v2}, La/fet;->e(I)Z

    .line 2829
    .line 2830
    .line 2831
    move-result v2

    .line 2832
    or-int/2addr v0, v2

    .line 2833
    invoke-virtual {v1, v14}, La/fet;->g(Ljava/lang/Object;)Z

    .line 2834
    .line 2835
    .line 2836
    move-result v2

    .line 2837
    or-int/2addr v0, v2

    .line 2838
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 2839
    .line 2840
    .line 2841
    move-result-object v2

    .line 2842
    if-nez v0, :cond_61

    .line 2843
    .line 2844
    if-ne v2, v4, :cond_62

    .line 2845
    .line 2846
    :cond_61
    new-instance v11, La/rxt0;

    .line 2847
    .line 2848
    const/16 v16, 0x0

    .line 2849
    .line 2850
    const/4 v15, 0x0

    .line 2851
    invoke-direct/range {v11 .. v16}, La/rxt0;-><init>(La/k3t0;La/clz;La/pz40;La/yje;B)V

    .line 2852
    .line 2853
    .line 2854
    invoke-virtual {v1, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2855
    .line 2856
    .line 2857
    move-object v2, v11

    .line 2858
    :cond_62
    check-cast v2, Lkotlin/jvm/functions/Function2;

    .line 2859
    .line 2860
    invoke-static {v1, v13, v2}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2861
    .line 2862
    .line 2863
    goto :goto_22

    .line 2864
    :cond_63
    const/4 v15, 0x0

    .line 2865
    const-string v0, "cyberBottomSheetFactory"

    .line 2866
    .line 2867
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2868
    .line 2869
    .line 2870
    throw v15

    .line 2871
    :cond_64
    const/4 v15, 0x0

    .line 2872
    const-string v0, "gameZoneFragmentFactory"

    .line 2873
    .line 2874
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2875
    .line 2876
    .line 2877
    throw v15

    .line 2878
    :cond_65
    const/4 v15, 0x0

    .line 2879
    const-string v0, "gameVideoFragmentFactory"

    .line 2880
    .line 2881
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2882
    .line 2883
    .line 2884
    throw v15

    .line 2885
    :cond_66
    invoke-virtual {v1}, La/fet;->X()V

    .line 2886
    .line 2887
    .line 2888
    :goto_22
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2889
    .line 2890
    return-object v0

    .line 2891
    :pswitch_1b
    check-cast v0, La/xgt0;

    .line 2892
    .line 2893
    iget-object v1, v0, La/i3t0;->f:La/oyg0;

    .line 2894
    .line 2895
    iget-object v0, v0, La/i3t0;->i:La/ocj;

    .line 2896
    .line 2897
    move-object/from16 v2, p1

    .line 2898
    .line 2899
    check-cast v2, Ljava/lang/Throwable;

    .line 2900
    .line 2901
    move-object/from16 v3, p2

    .line 2902
    .line 2903
    check-cast v3, Ljava/lang/String;

    .line 2904
    .line 2905
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2906
    .line 2907
    .line 2908
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2909
    .line 2910
    .line 2911
    instance-of v2, v2, La/ff5;

    .line 2912
    .line 2913
    if-eqz v2, :cond_68

    .line 2914
    .line 2915
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 2916
    .line 2917
    :cond_67
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 2918
    .line 2919
    .line 2920
    move-result-object v0

    .line 2921
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2922
    .line 2923
    .line 2924
    move-object v3, v0

    .line 2925
    check-cast v3, La/sgt0;

    .line 2926
    .line 2927
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2928
    .line 2929
    .line 2930
    sget-object v3, La/iun;->a:La/iun;

    .line 2931
    .line 2932
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2933
    .line 2934
    .line 2935
    new-instance v4, La/sgt0;

    .line 2936
    .line 2937
    const/4 v5, 0x0

    .line 2938
    invoke-direct {v4, v3, v5, v5}, La/sgt0;-><init>(Ljava/util/List;ZZ)V

    .line 2939
    .line 2940
    .line 2941
    invoke-virtual {v2, v0, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2942
    .line 2943
    .line 2944
    move-result v0

    .line 2945
    if-eqz v0, :cond_67

    .line 2946
    .line 2947
    goto :goto_24

    .line 2948
    :cond_68
    const/4 v5, 0x0

    .line 2949
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 2950
    .line 2951
    :goto_23
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 2952
    .line 2953
    .line 2954
    move-result-object v0

    .line 2955
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2956
    .line 2957
    .line 2958
    move-object v3, v0

    .line 2959
    check-cast v3, La/sgt0;

    .line 2960
    .line 2961
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2962
    .line 2963
    .line 2964
    invoke-static {v3, v5, v8}, La/sgt0;->a(La/sgt0;ZZ)La/sgt0;

    .line 2965
    .line 2966
    .line 2967
    move-result-object v3

    .line 2968
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2969
    .line 2970
    .line 2971
    move-result v0

    .line 2972
    if-eqz v0, :cond_69

    .line 2973
    .line 2974
    :goto_24
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2975
    .line 2976
    return-object v0

    .line 2977
    :cond_69
    const/4 v5, 0x0

    .line 2978
    goto :goto_23

    .line 2979
    :pswitch_1c
    check-cast v0, La/igt0;

    .line 2980
    .line 2981
    iget-object v0, v0, La/igt0;->O1:La/a8z;

    .line 2982
    .line 2983
    move-object/from16 v1, p1

    .line 2984
    .line 2985
    check-cast v1, La/fet;

    .line 2986
    .line 2987
    move-object/from16 v2, p2

    .line 2988
    .line 2989
    check-cast v2, Ljava/lang/Integer;

    .line 2990
    .line 2991
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 2992
    .line 2993
    .line 2994
    move-result v2

    .line 2995
    sget-object v3, La/igt0;->Q1:La/bzs0;

    .line 2996
    .line 2997
    and-int/lit8 v3, v2, 0x3

    .line 2998
    .line 2999
    if-eq v3, v6, :cond_6a

    .line 3000
    .line 3001
    move v3, v8

    .line 3002
    goto :goto_25

    .line 3003
    :cond_6a
    const/4 v3, 0x0

    .line 3004
    :goto_25
    and-int/2addr v2, v8

    .line 3005
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 3006
    .line 3007
    .line 3008
    move-result v2

    .line 3009
    if-eqz v2, :cond_6d

    .line 3010
    .line 3011
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 3012
    .line 3013
    .line 3014
    move-result-object v2

    .line 3015
    check-cast v2, La/k3t0;

    .line 3016
    .line 3017
    check-cast v2, La/i3t0;

    .line 3018
    .line 3019
    invoke-virtual {v2, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 3020
    .line 3021
    .line 3022
    move-result-object v2

    .line 3023
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 3024
    .line 3025
    .line 3026
    move-result-object v0

    .line 3027
    move-object v7, v0

    .line 3028
    check-cast v7, La/k3t0;

    .line 3029
    .line 3030
    invoke-virtual {v1, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 3031
    .line 3032
    .line 3033
    move-result v0

    .line 3034
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 3035
    .line 3036
    .line 3037
    move-result-object v3

    .line 3038
    if-nez v0, :cond_6b

    .line 3039
    .line 3040
    if-ne v3, v4, :cond_6c

    .line 3041
    .line 3042
    :cond_6b
    new-instance v5, La/las0;

    .line 3043
    .line 3044
    const/4 v11, 0x0

    .line 3045
    const/16 v12, 0xd

    .line 3046
    .line 3047
    const/4 v6, 0x1

    .line 3048
    const-class v8, La/k3t0;

    .line 3049
    .line 3050
    const-string v9, "onAction"

    .line 3051
    .line 3052
    const-string v10, "onAction(Ljava/lang/Object;)V"

    .line 3053
    .line 3054
    invoke-direct/range {v5 .. v12}, La/las0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 3055
    .line 3056
    .line 3057
    invoke-virtual {v1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 3058
    .line 3059
    .line 3060
    move-object v3, v5

    .line 3061
    :cond_6c
    check-cast v3, La/jhy;

    .line 3062
    .line 3063
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 3064
    .line 3065
    const/4 v5, 0x0

    .line 3066
    invoke-static {v2, v3, v1, v5}, La/dwi0;->E(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 3067
    .line 3068
    .line 3069
    goto :goto_26

    .line 3070
    :cond_6d
    invoke-virtual {v1}, La/fet;->X()V

    .line 3071
    .line 3072
    .line 3073
    :goto_26
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3074
    .line 3075
    return-object v0

    .line 3076
    nop

    .line 3077
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
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
