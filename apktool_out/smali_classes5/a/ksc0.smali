.class public final synthetic La/ksc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/ksc0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/ksc0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/ksc0;->a:B

    .line 4
    .line 5
    const-string v1, "rootView"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v0, p1

    .line 14
    .line 15
    check-cast v0, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-object/from16 v0, p2

    .line 21
    .line 22
    check-cast v0, Lkotlin/ranges/IntRange;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_0
    move-object/from16 v0, p1

    .line 31
    .line 32
    check-cast v0, La/fet;

    .line 33
    .line 34
    move-object/from16 v1, p2

    .line 35
    .line 36
    check-cast v1, Ljava/lang/Integer;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {v4}, La/x8x;->L(I)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-static {v1, v0}, La/b34;->A(ILa/fet;)V

    .line 46
    .line 47
    .line 48
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_1
    move-object/from16 v0, p1

    .line 52
    .line 53
    check-cast v0, La/oyg0;

    .line 54
    .line 55
    move-object/from16 v1, p2

    .line 56
    .line 57
    check-cast v1, La/v5e0;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    const/4 v0, 0x4

    .line 66
    invoke-static {v1, v3, v0}, La/v5e0;->a(La/v5e0;ZI)La/v5e0;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    return-object v0

    .line 71
    :pswitch_2
    move-object/from16 v0, p1

    .line 72
    .line 73
    check-cast v0, La/oyg0;

    .line 74
    .line 75
    move-object/from16 v1, p2

    .line 76
    .line 77
    check-cast v1, La/v5e0;

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    sget-object v0, La/iun;->a:La/iun;

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    new-instance v1, La/v5e0;

    .line 91
    .line 92
    invoke-direct {v1, v0, v3, v3}, La/v5e0;-><init>(Ljava/util/List;ZZ)V

    .line 93
    .line 94
    .line 95
    return-object v1

    .line 96
    :pswitch_3
    move-object/from16 v0, p1

    .line 97
    .line 98
    check-cast v0, La/fet;

    .line 99
    .line 100
    move-object/from16 v1, p2

    .line 101
    .line 102
    check-cast v1, Ljava/lang/Integer;

    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    const/4 v1, 0x7

    .line 108
    invoke-static {v1}, La/x8x;->L(I)I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    invoke-static {v1, v0}, La/xf0;->x(ILa/fet;)V

    .line 113
    .line 114
    .line 115
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    return-object v0

    .line 118
    :pswitch_4
    move-object/from16 v0, p1

    .line 119
    .line 120
    check-cast v0, La/fet;

    .line 121
    .line 122
    move-object/from16 v1, p2

    .line 123
    .line 124
    check-cast v1, Ljava/lang/Integer;

    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-static {v4}, La/x8x;->L(I)I

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    invoke-static {v1, v0}, La/xf0;->w(ILa/fet;)V

    .line 134
    .line 135
    .line 136
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 137
    .line 138
    return-object v0

    .line 139
    :pswitch_5
    move-object/from16 v0, p1

    .line 140
    .line 141
    check-cast v0, Ljava/lang/Integer;

    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 144
    .line 145
    .line 146
    move-object/from16 v0, p2

    .line 147
    .line 148
    check-cast v0, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;

    .line 149
    .line 150
    sget-object v1, La/l4e0;->n2:La/fl70;

    .line 151
    .line 152
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    iget-object v0, v0, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;->b:Ljava/lang/String;

    .line 156
    .line 157
    return-object v0

    .line 158
    :pswitch_6
    move-object/from16 v0, p1

    .line 159
    .line 160
    check-cast v0, La/fet;

    .line 161
    .line 162
    move-object/from16 v1, p2

    .line 163
    .line 164
    check-cast v1, Ljava/lang/Integer;

    .line 165
    .line 166
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-static {v4}, La/x8x;->L(I)I

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    invoke-static {v1, v0}, La/dwi0;->s(ILa/fet;)V

    .line 174
    .line 175
    .line 176
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 177
    .line 178
    return-object v0

    .line 179
    :pswitch_7
    move-object/from16 v0, p1

    .line 180
    .line 181
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 182
    .line 183
    move-object/from16 v1, p2

    .line 184
    .line 185
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 186
    .line 187
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    new-instance v2, La/bod0;

    .line 194
    .line 195
    const/16 v3, 0xc

    .line 196
    .line 197
    invoke-direct {v2, v3}, La/bod0;-><init>(B)V

    .line 198
    .line 199
    .line 200
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    new-instance v0, La/etd0;

    .line 204
    .line 205
    const/16 v2, 0x14

    .line 206
    .line 207
    invoke-direct {v0, v2}, La/etd0;-><init>(B)V

    .line 208
    .line 209
    .line 210
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 214
    .line 215
    return-object v0

    .line 216
    :pswitch_8
    move-object/from16 v0, p1

    .line 217
    .line 218
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 219
    .line 220
    move-object/from16 v1, p2

    .line 221
    .line 222
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 223
    .line 224
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    new-instance v2, La/bod0;

    .line 231
    .line 232
    const/16 v3, 0xb

    .line 233
    .line 234
    invoke-direct {v2, v3}, La/bod0;-><init>(B)V

    .line 235
    .line 236
    .line 237
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    new-instance v0, La/etd0;

    .line 241
    .line 242
    const/16 v2, 0x13

    .line 243
    .line 244
    invoke-direct {v0, v2}, La/etd0;-><init>(B)V

    .line 245
    .line 246
    .line 247
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 251
    .line 252
    return-object v0

    .line 253
    :pswitch_9
    move-object/from16 v0, p1

    .line 254
    .line 255
    check-cast v0, La/oyg0;

    .line 256
    .line 257
    move-object/from16 v5, p2

    .line 258
    .line 259
    check-cast v5, La/qyd0;

    .line 260
    .line 261
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    iget-object v6, v5, La/qyd0;->j:La/ixd0;

    .line 268
    .line 269
    iget-boolean v0, v6, La/ixd0;->e:Z

    .line 270
    .line 271
    xor-int/lit8 v14, v0, 0x1

    .line 272
    .line 273
    const/16 v15, 0xf

    .line 274
    .line 275
    const/4 v7, 0x0

    .line 276
    const-wide/16 v8, 0x0

    .line 277
    .line 278
    const-wide/16 v10, 0x0

    .line 279
    .line 280
    const-wide/16 v12, 0x0

    .line 281
    .line 282
    invoke-static/range {v6 .. v15}, La/ixd0;->a(La/ixd0;La/o4i0;JJJZI)La/ixd0;

    .line 283
    .line 284
    .line 285
    move-result-object v13

    .line 286
    const/16 v21, 0x0

    .line 287
    .line 288
    const v22, 0x7fffdff

    .line 289
    .line 290
    .line 291
    const/4 v6, 0x0

    .line 292
    const/4 v8, 0x0

    .line 293
    const/4 v9, 0x0

    .line 294
    const/4 v10, 0x0

    .line 295
    const/4 v11, 0x0

    .line 296
    const/4 v12, 0x0

    .line 297
    const/4 v14, 0x0

    .line 298
    const/4 v15, 0x0

    .line 299
    const/16 v16, 0x0

    .line 300
    .line 301
    const/16 v17, 0x0

    .line 302
    .line 303
    const/16 v18, 0x0

    .line 304
    .line 305
    const/16 v19, 0x0

    .line 306
    .line 307
    const/16 v20, 0x0

    .line 308
    .line 309
    invoke-static/range {v5 .. v22}, La/qyd0;->a(La/qyd0;La/gps;La/jlr;La/vvd0;La/ypl0;La/bqr;La/xus;ZLa/ixd0;La/rud0;Ljava/util/ArrayList;ZLjava/util/List;ZZLa/yws;La/szj0;I)La/qyd0;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    return-object v0

    .line 314
    :pswitch_a
    move-object/from16 v0, p1

    .line 315
    .line 316
    check-cast v0, Ljava/lang/Throwable;

    .line 317
    .line 318
    move-object/from16 v1, p2

    .line 319
    .line 320
    check-cast v1, Ljava/lang/String;

    .line 321
    .line 322
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 329
    .line 330
    return-object v0

    .line 331
    :pswitch_b
    move-object/from16 v0, p1

    .line 332
    .line 333
    check-cast v0, La/fet;

    .line 334
    .line 335
    move-object/from16 v1, p2

    .line 336
    .line 337
    check-cast v1, Ljava/lang/Integer;

    .line 338
    .line 339
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    invoke-static {v4}, La/x8x;->L(I)I

    .line 343
    .line 344
    .line 345
    move-result v1

    .line 346
    invoke-static {v1, v0}, La/wb;->B(ILa/fet;)V

    .line 347
    .line 348
    .line 349
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 350
    .line 351
    return-object v0

    .line 352
    :pswitch_c
    move-object/from16 v0, p1

    .line 353
    .line 354
    check-cast v0, La/fet;

    .line 355
    .line 356
    move-object/from16 v1, p2

    .line 357
    .line 358
    check-cast v1, Ljava/lang/Integer;

    .line 359
    .line 360
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 361
    .line 362
    .line 363
    const v1, 0x1f576b55

    .line 364
    .line 365
    .line 366
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 367
    .line 368
    .line 369
    const/4 v1, 0x3

    .line 370
    invoke-static {v3, v3, v0, v3, v1}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 371
    .line 372
    .line 373
    move-result-object v1

    .line 374
    invoke-virtual {v0, v3}, La/fet;->r(Z)V

    .line 375
    .line 376
    .line 377
    return-object v1

    .line 378
    :pswitch_d
    move-object/from16 v0, p1

    .line 379
    .line 380
    check-cast v0, La/fet;

    .line 381
    .line 382
    move-object/from16 v1, p2

    .line 383
    .line 384
    check-cast v1, Ljava/lang/Integer;

    .line 385
    .line 386
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    invoke-static {v4}, La/x8x;->L(I)I

    .line 390
    .line 391
    .line 392
    move-result v1

    .line 393
    invoke-static {v1, v0}, La/cfx0;->o(ILa/fet;)V

    .line 394
    .line 395
    .line 396
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 397
    .line 398
    return-object v0

    .line 399
    :pswitch_e
    move-object/from16 v0, p1

    .line 400
    .line 401
    check-cast v0, Ljava/lang/Throwable;

    .line 402
    .line 403
    move-object/from16 v1, p2

    .line 404
    .line 405
    check-cast v1, Ljava/lang/String;

    .line 406
    .line 407
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 408
    .line 409
    .line 410
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 411
    .line 412
    return-object v0

    .line 413
    :pswitch_f
    move-object/from16 v0, p1

    .line 414
    .line 415
    check-cast v0, Ljava/lang/Throwable;

    .line 416
    .line 417
    move-object/from16 v1, p2

    .line 418
    .line 419
    check-cast v1, Ljava/lang/String;

    .line 420
    .line 421
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 425
    .line 426
    .line 427
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 428
    .line 429
    return-object v0

    .line 430
    :pswitch_10
    move-object/from16 v0, p1

    .line 431
    .line 432
    check-cast v0, La/azg0;

    .line 433
    .line 434
    move-object/from16 v0, p2

    .line 435
    .line 436
    check-cast v0, La/d9d0;

    .line 437
    .line 438
    iget-object v0, v0, La/d9d0;->a:La/t33;

    .line 439
    .line 440
    invoke-virtual {v0}, La/t33;->d()Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    check-cast v0, Ljava/lang/Float;

    .line 445
    .line 446
    return-object v0

    .line 447
    :pswitch_11
    move-object/from16 v0, p1

    .line 448
    .line 449
    check-cast v0, Ljava/lang/Throwable;

    .line 450
    .line 451
    move-object/from16 v1, p2

    .line 452
    .line 453
    check-cast v1, Ljava/lang/String;

    .line 454
    .line 455
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 459
    .line 460
    .line 461
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 462
    .line 463
    return-object v0

    .line 464
    :pswitch_12
    move-object/from16 v0, p1

    .line 465
    .line 466
    check-cast v0, Ljava/lang/Throwable;

    .line 467
    .line 468
    move-object/from16 v1, p2

    .line 469
    .line 470
    check-cast v1, Ljava/lang/String;

    .line 471
    .line 472
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 476
    .line 477
    .line 478
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 479
    .line 480
    return-object v0

    .line 481
    :pswitch_13
    move-object/from16 v0, p1

    .line 482
    .line 483
    check-cast v0, La/fet;

    .line 484
    .line 485
    move-object/from16 v1, p2

    .line 486
    .line 487
    check-cast v1, Ljava/lang/Integer;

    .line 488
    .line 489
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 490
    .line 491
    .line 492
    invoke-static {v4}, La/x8x;->L(I)I

    .line 493
    .line 494
    .line 495
    move-result v1

    .line 496
    invoke-static {v1, v0}, La/y0x0;->q(ILa/fet;)V

    .line 497
    .line 498
    .line 499
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 500
    .line 501
    return-object v0

    .line 502
    :pswitch_14
    move-object/from16 v0, p1

    .line 503
    .line 504
    check-cast v0, Ljava/lang/Throwable;

    .line 505
    .line 506
    move-object/from16 v1, p2

    .line 507
    .line 508
    check-cast v1, Ljava/lang/String;

    .line 509
    .line 510
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 511
    .line 512
    .line 513
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 514
    .line 515
    .line 516
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 517
    .line 518
    return-object v0

    .line 519
    :pswitch_15
    move-object/from16 v0, p1

    .line 520
    .line 521
    check-cast v0, Ljava/lang/Throwable;

    .line 522
    .line 523
    move-object/from16 v1, p2

    .line 524
    .line 525
    check-cast v1, Ljava/lang/String;

    .line 526
    .line 527
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 531
    .line 532
    .line 533
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 534
    .line 535
    return-object v0

    .line 536
    :pswitch_16
    move-object/from16 v0, p1

    .line 537
    .line 538
    check-cast v0, La/fet;

    .line 539
    .line 540
    move-object/from16 v1, p2

    .line 541
    .line 542
    check-cast v1, Ljava/lang/Integer;

    .line 543
    .line 544
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 545
    .line 546
    .line 547
    invoke-static {v4}, La/x8x;->L(I)I

    .line 548
    .line 549
    .line 550
    move-result v1

    .line 551
    invoke-static {v1, v0}, La/m0x0;->x(ILa/fet;)V

    .line 552
    .line 553
    .line 554
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 555
    .line 556
    return-object v0

    .line 557
    :pswitch_17
    move-object/from16 v0, p1

    .line 558
    .line 559
    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 560
    .line 561
    move-object/from16 v1, p2

    .line 562
    .line 563
    check-cast v1, La/kuc0;

    .line 564
    .line 565
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 566
    .line 567
    .line 568
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 569
    .line 570
    .line 571
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 572
    .line 573
    return-object v0

    .line 574
    :pswitch_18
    move-object/from16 v0, p1

    .line 575
    .line 576
    check-cast v0, Landroid/view/LayoutInflater;

    .line 577
    .line 578
    move-object/from16 v4, p2

    .line 579
    .line 580
    check-cast v4, Landroid/view/ViewGroup;

    .line 581
    .line 582
    const v5, 0x7f0d0125

    .line 583
    .line 584
    .line 585
    invoke-static {v0, v4, v5, v4, v3}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    if-eqz v0, :cond_0

    .line 590
    .line 591
    new-instance v2, La/z2k;

    .line 592
    .line 593
    invoke-direct {v2, v0, v0}, La/z2k;-><init>(Landroid/view/View;Landroid/view/View;)V

    .line 594
    .line 595
    .line 596
    goto :goto_0

    .line 597
    :cond_0
    invoke-static {v1}, La/hny;->u(Ljava/lang/String;)V

    .line 598
    .line 599
    .line 600
    :goto_0
    return-object v2

    .line 601
    :pswitch_19
    move-object/from16 v0, p1

    .line 602
    .line 603
    check-cast v0, Landroid/view/LayoutInflater;

    .line 604
    .line 605
    move-object/from16 v1, p2

    .line 606
    .line 607
    check-cast v1, Landroid/view/ViewGroup;

    .line 608
    .line 609
    const v4, 0x7f0d0123

    .line 610
    .line 611
    .line 612
    invoke-static {v0, v1, v4, v1, v3}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    const v1, 0x7f0a027e

    .line 617
    .line 618
    .line 619
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 620
    .line 621
    .line 622
    move-result-object v3

    .line 623
    move-object v6, v3

    .line 624
    check-cast v6, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 625
    .line 626
    if-eqz v6, :cond_1

    .line 627
    .line 628
    const v1, 0x7f0a0284

    .line 629
    .line 630
    .line 631
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 632
    .line 633
    .line 634
    move-result-object v3

    .line 635
    move-object v7, v3

    .line 636
    check-cast v7, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 637
    .line 638
    if-eqz v7, :cond_1

    .line 639
    .line 640
    const v1, 0x7f0a028b

    .line 641
    .line 642
    .line 643
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 644
    .line 645
    .line 646
    move-result-object v3

    .line 647
    move-object v8, v3

    .line 648
    check-cast v8, Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;

    .line 649
    .line 650
    if-eqz v8, :cond_1

    .line 651
    .line 652
    const v1, 0x7f0a0a2b

    .line 653
    .line 654
    .line 655
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 656
    .line 657
    .line 658
    move-result-object v3

    .line 659
    move-object v9, v3

    .line 660
    check-cast v9, Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 661
    .line 662
    if-eqz v9, :cond_1

    .line 663
    .line 664
    new-instance v4, La/x2k;

    .line 665
    .line 666
    move-object v5, v0

    .line 667
    check-cast v5, Landroid/widget/FrameLayout;

    .line 668
    .line 669
    invoke-direct/range {v4 .. v9}, La/x2k;-><init>(Landroid/widget/FrameLayout;Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;Lorg/xplatform/uikit/components/cells/DsMenuCell;)V

    .line 670
    .line 671
    .line 672
    move-object v2, v4

    .line 673
    goto :goto_1

    .line 674
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 675
    .line 676
    .line 677
    move-result-object v0

    .line 678
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object v0

    .line 682
    const-string v1, "Missing required view with ID: "

    .line 683
    .line 684
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 689
    .line 690
    .line 691
    :goto_1
    return-object v2

    .line 692
    :pswitch_1a
    move-object/from16 v0, p1

    .line 693
    .line 694
    check-cast v0, Landroid/view/LayoutInflater;

    .line 695
    .line 696
    move-object/from16 v4, p2

    .line 697
    .line 698
    check-cast v4, Landroid/view/ViewGroup;

    .line 699
    .line 700
    const v5, 0x7f0d0124

    .line 701
    .line 702
    .line 703
    invoke-static {v0, v4, v5, v4, v3}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 704
    .line 705
    .line 706
    move-result-object v0

    .line 707
    if-eqz v0, :cond_2

    .line 708
    .line 709
    new-instance v2, La/y2k;

    .line 710
    .line 711
    check-cast v0, Landroid/widget/FrameLayout;

    .line 712
    .line 713
    invoke-direct {v2, v0}, La/y2k;-><init>(Landroid/widget/FrameLayout;)V

    .line 714
    .line 715
    .line 716
    goto :goto_2

    .line 717
    :cond_2
    invoke-static {v1}, La/hny;->u(Ljava/lang/String;)V

    .line 718
    .line 719
    .line 720
    :goto_2
    return-object v2

    .line 721
    :pswitch_1b
    move-object/from16 v0, p1

    .line 722
    .line 723
    check-cast v0, Ljava/lang/Integer;

    .line 724
    .line 725
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 726
    .line 727
    .line 728
    move-object/from16 v0, p2

    .line 729
    .line 730
    check-cast v0, La/p6t0;

    .line 731
    .line 732
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 733
    .line 734
    .line 735
    invoke-interface {v0}, La/p6t0;->getKey()Ljava/lang/String;

    .line 736
    .line 737
    .line 738
    move-result-object v0

    .line 739
    return-object v0

    .line 740
    :pswitch_1c
    move-object/from16 v0, p1

    .line 741
    .line 742
    check-cast v0, La/fet;

    .line 743
    .line 744
    move-object/from16 v1, p2

    .line 745
    .line 746
    check-cast v1, Ljava/lang/Integer;

    .line 747
    .line 748
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 749
    .line 750
    .line 751
    invoke-static {v4}, La/x8x;->L(I)I

    .line 752
    .line 753
    .line 754
    move-result v1

    .line 755
    invoke-static {v1, v0}, La/hmw0;->z(ILa/fet;)V

    .line 756
    .line 757
    .line 758
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 759
    .line 760
    return-object v0

    .line 761
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
