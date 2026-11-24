.class public final synthetic La/hpr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/hpr;->a:B

    iput-object p1, p0, La/hpr;->b:Ljava/lang/Object;

    iput-object p2, p0, La/hpr;->c:Ljava/lang/Object;

    iput-object p3, p0, La/hpr;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V
    .locals 0

    .line 2
    iput-byte p5, p0, La/hpr;->a:B

    iput-object p1, p0, La/hpr;->b:Ljava/lang/Object;

    iput-object p2, p0, La/hpr;->c:Ljava/lang/Object;

    iput-object p3, p0, La/hpr;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 62

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/hpr;->a:B

    .line 4
    .line 5
    const/16 v2, 0x181

    .line 6
    .line 7
    const v3, 0x7fffffff

    .line 8
    .line 9
    .line 10
    const/4 v4, 0x7

    .line 11
    const/4 v5, 0x2

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x1

    .line 15
    iget-object v9, v0, La/hpr;->d:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v10, v0, La/hpr;->c:Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v0, v0, La/hpr;->b:Ljava/lang/Object;

    .line 20
    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    check-cast v0, La/mm40;

    .line 25
    .line 26
    check-cast v10, La/anz;

    .line 27
    .line 28
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 29
    .line 30
    move-object/from16 v1, p1

    .line 31
    .line 32
    check-cast v1, La/fet;

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
    invoke-static {v8}, La/x8x;->L(I)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    invoke-static {v0, v10, v9, v1, v2}, La/m2x;->a(La/mm40;La/anz;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 46
    .line 47
    .line 48
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_0
    check-cast v0, La/kkz;

    .line 52
    .line 53
    check-cast v10, La/clz;

    .line 54
    .line 55
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 56
    .line 57
    move-object/from16 v1, p1

    .line 58
    .line 59
    check-cast v1, La/fet;

    .line 60
    .line 61
    move-object/from16 v2, p2

    .line 62
    .line 63
    check-cast v2, Ljava/lang/Integer;

    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-static {v4}, La/x8x;->L(I)I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    invoke-static {v0, v10, v9, v1, v2}, La/s0x;->b(La/kkz;La/clz;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 73
    .line 74
    .line 75
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object v0

    .line 78
    :pswitch_1
    check-cast v0, La/mm40;

    .line 79
    .line 80
    check-cast v10, La/m2h;

    .line 81
    .line 82
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 83
    .line 84
    move-object/from16 v1, p1

    .line 85
    .line 86
    check-cast v1, La/fet;

    .line 87
    .line 88
    move-object/from16 v2, p2

    .line 89
    .line 90
    check-cast v2, Ljava/lang/Integer;

    .line 91
    .line 92
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-static {v8}, La/x8x;->L(I)I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    invoke-static {v0, v10, v9, v1, v2}, La/ufx;->a(La/mm40;La/m2h;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 100
    .line 101
    .line 102
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    return-object v0

    .line 105
    :pswitch_2
    check-cast v0, La/lh80;

    .line 106
    .line 107
    check-cast v10, La/y3m0;

    .line 108
    .line 109
    check-cast v9, La/sw3;

    .line 110
    .line 111
    move-object/from16 v1, p1

    .line 112
    .line 113
    check-cast v1, La/w6k;

    .line 114
    .line 115
    move-object/from16 v2, p2

    .line 116
    .line 117
    check-cast v2, La/p4e;

    .line 118
    .line 119
    iget-wide v4, v2, La/p4e;->a:J

    .line 120
    .line 121
    invoke-static {v4, v5}, La/p4e;->h(J)I

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    if-eq v4, v3, :cond_0

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_0
    const-string v3, "LazyHorizontalStaggeredGrid\'s height should be bound by parent."

    .line 129
    .line 130
    invoke-static {v3}, La/adx;->a(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :goto_0
    iget v3, v0, La/lh80;->c:F

    .line 134
    .line 135
    iget v0, v0, La/lh80;->e:F

    .line 136
    .line 137
    add-float/2addr v0, v3

    .line 138
    iget-wide v2, v2, La/p4e;->a:J

    .line 139
    .line 140
    invoke-static {v2, v3}, La/p4e;->h(J)I

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    invoke-interface {v1, v0}, La/w6k;->T(F)I

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    sub-int/2addr v2, v0

    .line 149
    invoke-interface {v9}, La/sw3;->a()F

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    invoke-interface {v1, v0}, La/w6k;->T(F)I

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    invoke-virtual {v10, v2, v0}, La/y3m0;->a(II)[I

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    array-length v3, v0

    .line 162
    new-array v3, v3, [I

    .line 163
    .line 164
    invoke-interface {v9, v1, v2, v0, v3}, La/sw3;->c(La/w6k;I[I[I)V

    .line 165
    .line 166
    .line 167
    new-instance v1, La/kez;

    .line 168
    .line 169
    invoke-direct {v1, v3, v0}, La/kez;-><init>([I[I)V

    .line 170
    .line 171
    .line 172
    return-object v1

    .line 173
    :pswitch_3
    check-cast v0, La/lh80;

    .line 174
    .line 175
    check-cast v10, La/y3m0;

    .line 176
    .line 177
    move-object v11, v9

    .line 178
    check-cast v11, La/ow3;

    .line 179
    .line 180
    move-object/from16 v12, p1

    .line 181
    .line 182
    check-cast v12, La/w6k;

    .line 183
    .line 184
    move-object/from16 v1, p2

    .line 185
    .line 186
    check-cast v1, La/p4e;

    .line 187
    .line 188
    iget-wide v4, v1, La/p4e;->a:J

    .line 189
    .line 190
    invoke-static {v4, v5}, La/p4e;->i(J)I

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    if-eq v2, v3, :cond_1

    .line 195
    .line 196
    goto :goto_1

    .line 197
    :cond_1
    const-string v2, "LazyVerticalStaggeredGrid\'s width should be bound by parent."

    .line 198
    .line 199
    invoke-static {v2}, La/adx;->a(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    :goto_1
    sget-object v15, La/k6z;->a:La/k6z;

    .line 203
    .line 204
    invoke-static {v0, v15}, La/s5x0;->B(La/hh80;La/k6z;)F

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    invoke-static {v0, v15}, La/s5x0;->A(La/hh80;La/k6z;)F

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    add-float/2addr v0, v2

    .line 213
    iget-wide v1, v1, La/p4e;->a:J

    .line 214
    .line 215
    invoke-static {v1, v2}, La/p4e;->i(J)I

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    invoke-interface {v12, v0}, La/w6k;->T(F)I

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    sub-int v13, v1, v0

    .line 224
    .line 225
    invoke-interface {v11}, La/ow3;->a()F

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    invoke-interface {v12, v0}, La/w6k;->T(F)I

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    invoke-virtual {v10, v13, v0}, La/y3m0;->a(II)[I

    .line 234
    .line 235
    .line 236
    move-result-object v14

    .line 237
    array-length v0, v14

    .line 238
    new-array v0, v0, [I

    .line 239
    .line 240
    move-object/from16 v16, v0

    .line 241
    .line 242
    invoke-interface/range {v11 .. v16}, La/ow3;->b(La/w6k;I[ILa/k6z;[I)V

    .line 243
    .line 244
    .line 245
    new-instance v1, La/kez;

    .line 246
    .line 247
    invoke-direct {v1, v0, v14}, La/kez;-><init>([I[I)V

    .line 248
    .line 249
    .line 250
    return-object v1

    .line 251
    :pswitch_4
    check-cast v0, La/mm40;

    .line 252
    .line 253
    check-cast v10, La/ugd;

    .line 254
    .line 255
    check-cast v9, La/tj30;

    .line 256
    .line 257
    move-object/from16 v1, p1

    .line 258
    .line 259
    check-cast v1, La/fet;

    .line 260
    .line 261
    move-object/from16 v2, p2

    .line 262
    .line 263
    check-cast v2, Ljava/lang/Integer;

    .line 264
    .line 265
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    const/16 v2, 0x31

    .line 269
    .line 270
    invoke-static {v2}, La/x8x;->L(I)I

    .line 271
    .line 272
    .line 273
    move-result v2

    .line 274
    invoke-static {v0, v10, v9, v1, v2}, La/l7x;->s(La/mm40;La/ugd;La/tj30;La/fet;I)V

    .line 275
    .line 276
    .line 277
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 278
    .line 279
    return-object v0

    .line 280
    :pswitch_5
    check-cast v0, La/mdm;

    .line 281
    .line 282
    check-cast v10, La/a4x;

    .line 283
    .line 284
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 285
    .line 286
    move-object/from16 v1, p1

    .line 287
    .line 288
    check-cast v1, La/fet;

    .line 289
    .line 290
    move-object/from16 v2, p2

    .line 291
    .line 292
    check-cast v2, Ljava/lang/Integer;

    .line 293
    .line 294
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    invoke-static {v8}, La/x8x;->L(I)I

    .line 298
    .line 299
    .line 300
    move-result v2

    .line 301
    invoke-static {v0, v10, v9, v1, v2}, La/ntr;->D(La/mdm;La/a4x;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 302
    .line 303
    .line 304
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 305
    .line 306
    return-object v0

    .line 307
    :pswitch_6
    check-cast v0, La/cp;

    .line 308
    .line 309
    check-cast v10, La/g9b0;

    .line 310
    .line 311
    check-cast v9, Ljava/lang/String;

    .line 312
    .line 313
    move-object/from16 v1, p1

    .line 314
    .line 315
    check-cast v1, La/rvy;

    .line 316
    .line 317
    move-object/from16 v2, p2

    .line 318
    .line 319
    check-cast v2, Ljava/lang/String;

    .line 320
    .line 321
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v3

    .line 328
    check-cast v3, La/sv60;

    .line 329
    .line 330
    iget-object v3, v3, La/sv60;->b:Ljava/util/ArrayList;

    .line 331
    .line 332
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 337
    .line 338
    .line 339
    move-result v4

    .line 340
    if-eqz v4, :cond_3

    .line 341
    .line 342
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v4

    .line 346
    move-object v5, v4

    .line 347
    check-cast v5, La/rv60;

    .line 348
    .line 349
    iget-object v5, v5, La/rv60;->a:La/rvy;

    .line 350
    .line 351
    iget-wide v7, v5, La/rvy;->a:J

    .line 352
    .line 353
    iget-wide v11, v1, La/rvy;->a:J

    .line 354
    .line 355
    cmp-long v5, v7, v11

    .line 356
    .line 357
    if-nez v5, :cond_2

    .line 358
    .line 359
    move-object v6, v4

    .line 360
    :cond_3
    check-cast v6, La/rv60;

    .line 361
    .line 362
    if-eqz v6, :cond_4

    .line 363
    .line 364
    iget-object v1, v6, La/rv60;->b:La/mo60;

    .line 365
    .line 366
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    check-cast v0, La/sv60;

    .line 371
    .line 372
    const-string v0, "160291"

    .line 373
    .line 374
    invoke-virtual {v10, v9, v1, v0, v2}, La/g9b0;->D(Ljava/lang/String;La/mo60;Ljava/lang/String;Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 378
    .line 379
    return-object v0

    .line 380
    :pswitch_7
    check-cast v0, La/mm40;

    .line 381
    .line 382
    check-cast v10, La/mvy;

    .line 383
    .line 384
    check-cast v9, La/xdr;

    .line 385
    .line 386
    move-object/from16 v1, p1

    .line 387
    .line 388
    check-cast v1, La/fet;

    .line 389
    .line 390
    move-object/from16 v2, p2

    .line 391
    .line 392
    check-cast v2, Ljava/lang/Integer;

    .line 393
    .line 394
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    invoke-static {v4}, La/x8x;->L(I)I

    .line 398
    .line 399
    .line 400
    move-result v2

    .line 401
    invoke-static {v0, v10, v9, v1, v2}, La/tfx;->a(La/mm40;La/mvy;La/xdr;La/fet;I)V

    .line 402
    .line 403
    .line 404
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 405
    .line 406
    return-object v0

    .line 407
    :pswitch_8
    check-cast v0, Ljava/lang/String;

    .line 408
    .line 409
    check-cast v10, La/buy;

    .line 410
    .line 411
    check-cast v9, La/ugd;

    .line 412
    .line 413
    move-object/from16 v1, p1

    .line 414
    .line 415
    check-cast v1, La/fet;

    .line 416
    .line 417
    move-object/from16 v3, p2

    .line 418
    .line 419
    check-cast v3, Ljava/lang/Integer;

    .line 420
    .line 421
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    invoke-static {v2}, La/x8x;->L(I)I

    .line 425
    .line 426
    .line 427
    move-result v2

    .line 428
    invoke-static {v0, v10, v9, v1, v2}, La/wdx;->h(Ljava/lang/String;La/buy;La/ugd;La/fet;I)V

    .line 429
    .line 430
    .line 431
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 432
    .line 433
    return-object v0

    .line 434
    :pswitch_9
    check-cast v0, La/mm40;

    .line 435
    .line 436
    check-cast v10, La/y5y;

    .line 437
    .line 438
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 439
    .line 440
    move-object/from16 v1, p1

    .line 441
    .line 442
    check-cast v1, La/fet;

    .line 443
    .line 444
    move-object/from16 v2, p2

    .line 445
    .line 446
    check-cast v2, Ljava/lang/Integer;

    .line 447
    .line 448
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    invoke-static {v8}, La/x8x;->L(I)I

    .line 452
    .line 453
    .line 454
    move-result v2

    .line 455
    invoke-static {v0, v10, v9, v1, v2}, La/e9x;->b(La/mm40;La/y5y;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 456
    .line 457
    .line 458
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 459
    .line 460
    return-object v0

    .line 461
    :pswitch_a
    check-cast v0, La/mm40;

    .line 462
    .line 463
    check-cast v10, La/t1y;

    .line 464
    .line 465
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 466
    .line 467
    move-object/from16 v1, p1

    .line 468
    .line 469
    check-cast v1, La/fet;

    .line 470
    .line 471
    move-object/from16 v2, p2

    .line 472
    .line 473
    check-cast v2, Ljava/lang/Integer;

    .line 474
    .line 475
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 476
    .line 477
    .line 478
    invoke-static {v8}, La/x8x;->L(I)I

    .line 479
    .line 480
    .line 481
    move-result v2

    .line 482
    invoke-static {v0, v10, v9, v1, v2}, La/r8x;->k(La/mm40;La/t1y;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 483
    .line 484
    .line 485
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 486
    .line 487
    return-object v0

    .line 488
    :pswitch_b
    check-cast v0, La/mm40;

    .line 489
    .line 490
    check-cast v10, La/in8;

    .line 491
    .line 492
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 493
    .line 494
    move-object/from16 v1, p1

    .line 495
    .line 496
    check-cast v1, La/fet;

    .line 497
    .line 498
    move-object/from16 v2, p2

    .line 499
    .line 500
    check-cast v2, Ljava/lang/Integer;

    .line 501
    .line 502
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 503
    .line 504
    .line 505
    invoke-static {v8}, La/x8x;->L(I)I

    .line 506
    .line 507
    .line 508
    move-result v2

    .line 509
    invoke-static {v0, v10, v9, v1, v2}, La/m8x;->k(La/mm40;La/in8;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 510
    .line 511
    .line 512
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 513
    .line 514
    return-object v0

    .line 515
    :pswitch_c
    check-cast v0, La/gyx;

    .line 516
    .line 517
    check-cast v10, La/x6f;

    .line 518
    .line 519
    check-cast v9, La/x6f;

    .line 520
    .line 521
    move-object/from16 v1, p1

    .line 522
    .line 523
    check-cast v1, La/fet;

    .line 524
    .line 525
    move-object/from16 v2, p2

    .line 526
    .line 527
    check-cast v2, Ljava/lang/Integer;

    .line 528
    .line 529
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 530
    .line 531
    .line 532
    invoke-static {v8}, La/x8x;->L(I)I

    .line 533
    .line 534
    .line 535
    move-result v2

    .line 536
    invoke-static {v0, v10, v9, v1, v2}, La/q7x;->b(La/gyx;La/x6f;La/x6f;La/fet;I)V

    .line 537
    .line 538
    .line 539
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 540
    .line 541
    return-object v0

    .line 542
    :pswitch_d
    check-cast v0, La/cp;

    .line 543
    .line 544
    check-cast v10, La/x6f;

    .line 545
    .line 546
    check-cast v9, La/x6f;

    .line 547
    .line 548
    move-object/from16 v1, p1

    .line 549
    .line 550
    check-cast v1, La/fet;

    .line 551
    .line 552
    move-object/from16 v2, p2

    .line 553
    .line 554
    check-cast v2, Ljava/lang/Integer;

    .line 555
    .line 556
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 557
    .line 558
    .line 559
    move-result v2

    .line 560
    and-int/lit8 v3, v2, 0x3

    .line 561
    .line 562
    if-eq v3, v5, :cond_5

    .line 563
    .line 564
    move v3, v8

    .line 565
    goto :goto_2

    .line 566
    :cond_5
    move v3, v7

    .line 567
    :goto_2
    and-int/2addr v2, v8

    .line 568
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 569
    .line 570
    .line 571
    move-result v2

    .line 572
    if-eqz v2, :cond_6

    .line 573
    .line 574
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    check-cast v0, La/gyx;

    .line 579
    .line 580
    invoke-static {v0, v10, v9, v1, v7}, La/q7x;->b(La/gyx;La/x6f;La/x6f;La/fet;I)V

    .line 581
    .line 582
    .line 583
    goto :goto_3

    .line 584
    :cond_6
    invoke-virtual {v1}, La/fet;->X()V

    .line 585
    .line 586
    .line 587
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 588
    .line 589
    return-object v0

    .line 590
    :pswitch_e
    check-cast v0, La/mm40;

    .line 591
    .line 592
    check-cast v10, Ljava/lang/String;

    .line 593
    .line 594
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 595
    .line 596
    move-object/from16 v1, p1

    .line 597
    .line 598
    check-cast v1, La/fet;

    .line 599
    .line 600
    move-object/from16 v2, p2

    .line 601
    .line 602
    check-cast v2, Ljava/lang/Integer;

    .line 603
    .line 604
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 605
    .line 606
    .line 607
    invoke-static {v8}, La/x8x;->L(I)I

    .line 608
    .line 609
    .line 610
    move-result v2

    .line 611
    invoke-static {v0, v10, v9, v1, v2}, La/obc;->z(La/mm40;Ljava/lang/String;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 612
    .line 613
    .line 614
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 615
    .line 616
    return-object v0

    .line 617
    :pswitch_f
    check-cast v0, La/mm40;

    .line 618
    .line 619
    check-cast v10, La/onw;

    .line 620
    .line 621
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 622
    .line 623
    move-object/from16 v1, p1

    .line 624
    .line 625
    check-cast v1, La/fet;

    .line 626
    .line 627
    move-object/from16 v2, p2

    .line 628
    .line 629
    check-cast v2, Ljava/lang/Integer;

    .line 630
    .line 631
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 632
    .line 633
    .line 634
    invoke-static {v4}, La/x8x;->L(I)I

    .line 635
    .line 636
    .line 637
    move-result v2

    .line 638
    invoke-static {v0, v10, v9, v1, v2}, La/mbc;->y(La/mm40;La/onw;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 639
    .line 640
    .line 641
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 642
    .line 643
    return-object v0

    .line 644
    :pswitch_10
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 645
    .line 646
    check-cast v10, Lkotlin/jvm/functions/Function2;

    .line 647
    .line 648
    check-cast v9, La/w2d;

    .line 649
    .line 650
    move-object/from16 v1, p1

    .line 651
    .line 652
    check-cast v1, La/c5n0;

    .line 653
    .line 654
    move-object/from16 v2, p2

    .line 655
    .line 656
    check-cast v2, La/p4e;

    .line 657
    .line 658
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 659
    .line 660
    .line 661
    const-string v3, "stickyContentId"

    .line 662
    .line 663
    invoke-interface {v1, v3, v0}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    new-instance v14, Ljava/util/ArrayList;

    .line 668
    .line 669
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 670
    .line 671
    .line 672
    move-result v3

    .line 673
    invoke-direct {v14, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 674
    .line 675
    .line 676
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 677
    .line 678
    .line 679
    move-result v3

    .line 680
    move v15, v7

    .line 681
    :goto_4
    const/16 v16, 0x1

    .line 682
    .line 683
    if-ge v15, v3, :cond_7

    .line 684
    .line 685
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 686
    .line 687
    .line 688
    move-result-object v4

    .line 689
    move-object v11, v4

    .line 690
    check-cast v11, La/pj30;

    .line 691
    .line 692
    iget-wide v12, v2, La/p4e;->a:J

    .line 693
    .line 694
    invoke-static/range {v11 .. v16}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 695
    .line 696
    .line 697
    move-result v15

    .line 698
    goto :goto_4

    .line 699
    :cond_7
    const-string v0, "collapsingContentId"

    .line 700
    .line 701
    invoke-interface {v1, v0, v10}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 702
    .line 703
    .line 704
    move-result-object v0

    .line 705
    new-instance v3, Ljava/util/ArrayList;

    .line 706
    .line 707
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 708
    .line 709
    .line 710
    move-result v4

    .line 711
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 712
    .line 713
    .line 714
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 715
    .line 716
    .line 717
    move-result v4

    .line 718
    move v8, v7

    .line 719
    :goto_5
    if-ge v8, v4, :cond_8

    .line 720
    .line 721
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object v10

    .line 725
    check-cast v10, La/pj30;

    .line 726
    .line 727
    iget-wide v11, v2, La/p4e;->a:J

    .line 728
    .line 729
    move-object/from16 v19, v3

    .line 730
    .line 731
    move/from16 v20, v8

    .line 732
    .line 733
    move-wide/from16 v17, v11

    .line 734
    .line 735
    move/from16 v21, v16

    .line 736
    .line 737
    move-object/from16 v16, v10

    .line 738
    .line 739
    invoke-static/range {v16 .. v21}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 740
    .line 741
    .line 742
    move-result v8

    .line 743
    move/from16 v16, v21

    .line 744
    .line 745
    goto :goto_5

    .line 746
    :cond_8
    move-object v10, v3

    .line 747
    move/from16 v3, v16

    .line 748
    .line 749
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 750
    .line 751
    .line 752
    move-result v0

    .line 753
    if-eqz v0, :cond_9

    .line 754
    .line 755
    move-object v0, v6

    .line 756
    goto :goto_7

    .line 757
    :cond_9
    invoke-virtual {v14, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object v0

    .line 761
    move-object v4, v0

    .line 762
    check-cast v4, La/pu90;

    .line 763
    .line 764
    iget v4, v4, La/pu90;->b:I

    .line 765
    .line 766
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 767
    .line 768
    .line 769
    move-result v8

    .line 770
    sub-int/2addr v8, v3

    .line 771
    if-gt v3, v8, :cond_b

    .line 772
    .line 773
    move v11, v3

    .line 774
    :goto_6
    invoke-virtual {v14, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 775
    .line 776
    .line 777
    move-result-object v12

    .line 778
    move-object v13, v12

    .line 779
    check-cast v13, La/pu90;

    .line 780
    .line 781
    iget v13, v13, La/pu90;->b:I

    .line 782
    .line 783
    if-ge v4, v13, :cond_a

    .line 784
    .line 785
    move-object v0, v12

    .line 786
    move v4, v13

    .line 787
    :cond_a
    if-eq v11, v8, :cond_b

    .line 788
    .line 789
    add-int/lit8 v11, v11, 0x1

    .line 790
    .line 791
    goto :goto_6

    .line 792
    :cond_b
    :goto_7
    check-cast v0, La/pu90;

    .line 793
    .line 794
    if-eqz v0, :cond_c

    .line 795
    .line 796
    iget v0, v0, La/pu90;->b:I

    .line 797
    .line 798
    int-to-float v0, v0

    .line 799
    goto :goto_8

    .line 800
    :cond_c
    const/4 v0, 0x0

    .line 801
    :goto_8
    new-instance v8, La/kie0;

    .line 802
    .line 803
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 804
    .line 805
    .line 806
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 807
    .line 808
    .line 809
    move-result v11

    .line 810
    if-nez v11, :cond_15

    .line 811
    .line 812
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 813
    .line 814
    .line 815
    move-result v11

    .line 816
    if-nez v11, :cond_15

    .line 817
    .line 818
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 819
    .line 820
    .line 821
    move-result v11

    .line 822
    if-eqz v11, :cond_d

    .line 823
    .line 824
    move-object v11, v6

    .line 825
    goto :goto_a

    .line 826
    :cond_d
    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 827
    .line 828
    .line 829
    move-result-object v11

    .line 830
    move-object v12, v11

    .line 831
    check-cast v12, La/pu90;

    .line 832
    .line 833
    iget v12, v12, La/pu90;->b:I

    .line 834
    .line 835
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 836
    .line 837
    .line 838
    move-result v13

    .line 839
    sub-int/2addr v13, v3

    .line 840
    if-gt v3, v13, :cond_f

    .line 841
    .line 842
    move v15, v3

    .line 843
    :goto_9
    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 844
    .line 845
    .line 846
    move-result-object v16

    .line 847
    move-object/from16 v4, v16

    .line 848
    .line 849
    check-cast v4, La/pu90;

    .line 850
    .line 851
    iget v4, v4, La/pu90;->b:I

    .line 852
    .line 853
    if-ge v12, v4, :cond_e

    .line 854
    .line 855
    move v12, v4

    .line 856
    move-object/from16 v11, v16

    .line 857
    .line 858
    :cond_e
    if-eq v15, v13, :cond_f

    .line 859
    .line 860
    add-int/lit8 v15, v15, 0x1

    .line 861
    .line 862
    goto :goto_9

    .line 863
    :cond_f
    :goto_a
    check-cast v11, La/pu90;

    .line 864
    .line 865
    if-eqz v11, :cond_10

    .line 866
    .line 867
    iget v4, v11, La/pu90;->b:I

    .line 868
    .line 869
    int-to-float v4, v4

    .line 870
    goto :goto_b

    .line 871
    :cond_10
    const/4 v4, 0x0

    .line 872
    :goto_b
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 873
    .line 874
    .line 875
    move-result v11

    .line 876
    if-eqz v11, :cond_11

    .line 877
    .line 878
    goto :goto_d

    .line 879
    :cond_11
    invoke-virtual {v14, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 880
    .line 881
    .line 882
    move-result-object v6

    .line 883
    move-object v11, v6

    .line 884
    check-cast v11, La/pu90;

    .line 885
    .line 886
    iget v11, v11, La/pu90;->b:I

    .line 887
    .line 888
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 889
    .line 890
    .line 891
    move-result v12

    .line 892
    sub-int/2addr v12, v3

    .line 893
    if-gt v3, v12, :cond_13

    .line 894
    .line 895
    :goto_c
    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 896
    .line 897
    .line 898
    move-result-object v13

    .line 899
    move-object v15, v13

    .line 900
    check-cast v15, La/pu90;

    .line 901
    .line 902
    iget v15, v15, La/pu90;->b:I

    .line 903
    .line 904
    if-ge v11, v15, :cond_12

    .line 905
    .line 906
    move-object v6, v13

    .line 907
    move v11, v15

    .line 908
    :cond_12
    if-eq v3, v12, :cond_13

    .line 909
    .line 910
    add-int/lit8 v3, v3, 0x1

    .line 911
    .line 912
    goto :goto_c

    .line 913
    :cond_13
    :goto_d
    check-cast v6, La/pu90;

    .line 914
    .line 915
    if-eqz v6, :cond_14

    .line 916
    .line 917
    iget v3, v6, La/pu90;->b:I

    .line 918
    .line 919
    int-to-float v3, v3

    .line 920
    goto :goto_e

    .line 921
    :cond_14
    const/4 v3, 0x0

    .line 922
    :goto_e
    iget-object v6, v9, La/w2d;->a:La/x2d;

    .line 923
    .line 924
    neg-float v9, v4

    .line 925
    invoke-virtual {v6, v9}, La/x2d;->c(F)V

    .line 926
    .line 927
    .line 928
    add-float v9, v3, v4

    .line 929
    .line 930
    sub-float v4, v3, v4

    .line 931
    .line 932
    invoke-virtual {v6}, La/x2d;->a()F

    .line 933
    .line 934
    .line 935
    move-result v11

    .line 936
    invoke-static {v0, v9, v11, v9}, La/rw2;->a(FFFF)F

    .line 937
    .line 938
    .line 939
    move-result v0

    .line 940
    invoke-virtual {v6}, La/x2d;->a()F

    .line 941
    .line 942
    .line 943
    move-result v6

    .line 944
    sub-float/2addr v4, v3

    .line 945
    mul-float/2addr v4, v6

    .line 946
    add-float/2addr v4, v3

    .line 947
    invoke-static {v4}, La/si30;->b(F)I

    .line 948
    .line 949
    .line 950
    move-result v3

    .line 951
    iput v3, v8, La/kie0;->a:I

    .line 952
    .line 953
    goto :goto_f

    .line 954
    :cond_15
    iget-object v3, v9, La/w2d;->a:La/x2d;

    .line 955
    .line 956
    const/high16 v4, -0x40800000    # -1.0f

    .line 957
    .line 958
    invoke-virtual {v3, v4}, La/x2d;->c(F)V

    .line 959
    .line 960
    .line 961
    :goto_f
    iget-wide v2, v2, La/p4e;->a:J

    .line 962
    .line 963
    invoke-static {v2, v3}, La/p4e;->i(J)I

    .line 964
    .line 965
    .line 966
    move-result v2

    .line 967
    if-gez v2, :cond_16

    .line 968
    .line 969
    move v2, v7

    .line 970
    :cond_16
    invoke-static {v0}, La/si30;->b(F)I

    .line 971
    .line 972
    .line 973
    move-result v0

    .line 974
    if-gez v0, :cond_17

    .line 975
    .line 976
    goto :goto_10

    .line 977
    :cond_17
    move v7, v0

    .line 978
    :goto_10
    new-instance v0, La/gi0;

    .line 979
    .line 980
    invoke-direct {v0, v10, v14, v8, v5}, La/gi0;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;La/kie0;B)V

    .line 981
    .line 982
    .line 983
    invoke-static {v1, v2, v7, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 984
    .line 985
    .line 986
    move-result-object v0

    .line 987
    return-object v0

    .line 988
    :pswitch_11
    check-cast v0, La/mm40;

    .line 989
    .line 990
    check-cast v10, La/ejv;

    .line 991
    .line 992
    check-cast v9, La/zx7;

    .line 993
    .line 994
    move-object/from16 v1, p1

    .line 995
    .line 996
    check-cast v1, La/fet;

    .line 997
    .line 998
    move-object/from16 v3, p2

    .line 999
    .line 1000
    check-cast v3, Ljava/lang/Integer;

    .line 1001
    .line 1002
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1003
    .line 1004
    .line 1005
    invoke-static {v2}, La/x8x;->L(I)I

    .line 1006
    .line 1007
    .line 1008
    move-result v2

    .line 1009
    invoke-static {v0, v10, v9, v1, v2}, La/jcb;->u(La/mm40;La/ejv;La/zx7;La/fet;I)V

    .line 1010
    .line 1011
    .line 1012
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1013
    .line 1014
    return-object v0

    .line 1015
    :pswitch_12
    check-cast v0, La/pz40;

    .line 1016
    .line 1017
    check-cast v10, La/pz40;

    .line 1018
    .line 1019
    check-cast v9, La/pz40;

    .line 1020
    .line 1021
    move-object/from16 v1, p1

    .line 1022
    .line 1023
    check-cast v1, Ljava/lang/Integer;

    .line 1024
    .line 1025
    move-object/from16 v2, p2

    .line 1026
    .line 1027
    check-cast v2, Ljava/lang/Integer;

    .line 1028
    .line 1029
    invoke-interface {v0, v1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 1030
    .line 1031
    .line 1032
    invoke-interface {v10, v2}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 1033
    .line 1034
    .line 1035
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1036
    .line 1037
    invoke-interface {v9, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 1038
    .line 1039
    .line 1040
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1041
    .line 1042
    return-object v0

    .line 1043
    :pswitch_13
    check-cast v0, La/mm40;

    .line 1044
    .line 1045
    check-cast v10, La/s8v;

    .line 1046
    .line 1047
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 1048
    .line 1049
    move-object/from16 v1, p1

    .line 1050
    .line 1051
    check-cast v1, La/fet;

    .line 1052
    .line 1053
    move-object/from16 v2, p2

    .line 1054
    .line 1055
    check-cast v2, Ljava/lang/Integer;

    .line 1056
    .line 1057
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1058
    .line 1059
    .line 1060
    invoke-static {v8}, La/x8x;->L(I)I

    .line 1061
    .line 1062
    .line 1063
    move-result v2

    .line 1064
    invoke-static {v0, v10, v9, v1, v2}, La/d5c;->q(La/mm40;La/s8v;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1065
    .line 1066
    .line 1067
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1068
    .line 1069
    return-object v0

    .line 1070
    :pswitch_14
    check-cast v0, La/mm40;

    .line 1071
    .line 1072
    check-cast v10, La/fgt;

    .line 1073
    .line 1074
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 1075
    .line 1076
    move-object/from16 v1, p1

    .line 1077
    .line 1078
    check-cast v1, La/fet;

    .line 1079
    .line 1080
    move-object/from16 v2, p2

    .line 1081
    .line 1082
    check-cast v2, Ljava/lang/Integer;

    .line 1083
    .line 1084
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1085
    .line 1086
    .line 1087
    invoke-static {v4}, La/x8x;->L(I)I

    .line 1088
    .line 1089
    .line 1090
    move-result v2

    .line 1091
    invoke-static {v0, v10, v9, v1, v2}, La/vcc;->o(La/mm40;La/fgt;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1092
    .line 1093
    .line 1094
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1095
    .line 1096
    return-object v0

    .line 1097
    :pswitch_15
    check-cast v0, La/mm40;

    .line 1098
    .line 1099
    check-cast v10, La/egt;

    .line 1100
    .line 1101
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 1102
    .line 1103
    move-object/from16 v1, p1

    .line 1104
    .line 1105
    check-cast v1, La/fet;

    .line 1106
    .line 1107
    move-object/from16 v2, p2

    .line 1108
    .line 1109
    check-cast v2, Ljava/lang/Integer;

    .line 1110
    .line 1111
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1112
    .line 1113
    .line 1114
    invoke-static {v8}, La/x8x;->L(I)I

    .line 1115
    .line 1116
    .line 1117
    move-result v2

    .line 1118
    invoke-static {v0, v10, v9, v1, v2}, La/qcc;->t(La/mm40;La/egt;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1119
    .line 1120
    .line 1121
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1122
    .line 1123
    return-object v0

    .line 1124
    :pswitch_16
    check-cast v0, La/mm40;

    .line 1125
    .line 1126
    check-cast v10, La/dgt;

    .line 1127
    .line 1128
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 1129
    .line 1130
    move-object/from16 v1, p1

    .line 1131
    .line 1132
    check-cast v1, La/fet;

    .line 1133
    .line 1134
    move-object/from16 v2, p2

    .line 1135
    .line 1136
    check-cast v2, Ljava/lang/Integer;

    .line 1137
    .line 1138
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1139
    .line 1140
    .line 1141
    invoke-static {v8}, La/x8x;->L(I)I

    .line 1142
    .line 1143
    .line 1144
    move-result v2

    .line 1145
    invoke-static {v0, v10, v9, v1, v2}, La/xbc;->y(La/mm40;La/dgt;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1146
    .line 1147
    .line 1148
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1149
    .line 1150
    return-object v0

    .line 1151
    :pswitch_17
    check-cast v0, La/xak;

    .line 1152
    .line 1153
    check-cast v10, La/mm40;

    .line 1154
    .line 1155
    check-cast v9, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;

    .line 1156
    .line 1157
    move-object/from16 v1, p1

    .line 1158
    .line 1159
    check-cast v1, La/fet;

    .line 1160
    .line 1161
    move-object/from16 v2, p2

    .line 1162
    .line 1163
    check-cast v2, Ljava/lang/Integer;

    .line 1164
    .line 1165
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1166
    .line 1167
    .line 1168
    const/16 v2, 0x47

    .line 1169
    .line 1170
    invoke-static {v2}, La/x8x;->L(I)I

    .line 1171
    .line 1172
    .line 1173
    move-result v2

    .line 1174
    invoke-virtual {v0, v10, v9, v1, v2}, La/xak;->o(La/mm40;Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;La/fet;I)V

    .line 1175
    .line 1176
    .line 1177
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1178
    .line 1179
    return-object v0

    .line 1180
    :pswitch_18
    check-cast v9, La/j0g0;

    .line 1181
    .line 1182
    move-object/from16 v1, p1

    .line 1183
    .line 1184
    check-cast v1, La/oyg0;

    .line 1185
    .line 1186
    move-object/from16 v11, p2

    .line 1187
    .line 1188
    check-cast v11, La/wrs;

    .line 1189
    .line 1190
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 1191
    .line 1192
    instance-of v1, v0, La/g0g0;

    .line 1193
    .line 1194
    if-eqz v1, :cond_18

    .line 1195
    .line 1196
    move-object v0, v6

    .line 1197
    :cond_18
    check-cast v0, Ljava/util/List;

    .line 1198
    .line 1199
    if-nez v0, :cond_19

    .line 1200
    .line 1201
    iget-object v0, v11, La/wrs;->h:Ljava/util/List;

    .line 1202
    .line 1203
    :cond_19
    move-object/from16 v18, v0

    .line 1204
    .line 1205
    instance-of v0, v10, La/g0g0;

    .line 1206
    .line 1207
    if-eqz v0, :cond_1a

    .line 1208
    .line 1209
    move-object v10, v6

    .line 1210
    :cond_1a
    check-cast v10, La/rsp;

    .line 1211
    .line 1212
    if-nez v10, :cond_1b

    .line 1213
    .line 1214
    iget-object v10, v11, La/wrs;->j:La/rsp;

    .line 1215
    .line 1216
    :cond_1b
    move-object/from16 v19, v10

    .line 1217
    .line 1218
    if-eqz v9, :cond_1e

    .line 1219
    .line 1220
    iget-object v0, v9, La/j0g0;->a:Ljava/lang/Object;

    .line 1221
    .line 1222
    instance-of v1, v0, La/g0g0;

    .line 1223
    .line 1224
    if-eqz v1, :cond_1c

    .line 1225
    .line 1226
    goto :goto_11

    .line 1227
    :cond_1c
    move-object v6, v0

    .line 1228
    :goto_11
    check-cast v6, La/lov;

    .line 1229
    .line 1230
    if-nez v6, :cond_1d

    .line 1231
    .line 1232
    goto :goto_13

    .line 1233
    :cond_1d
    :goto_12
    move-object/from16 v20, v6

    .line 1234
    .line 1235
    goto :goto_14

    .line 1236
    :cond_1e
    :goto_13
    iget-object v6, v11, La/wrs;->k:La/lov;

    .line 1237
    .line 1238
    goto :goto_12

    .line 1239
    :goto_14
    const-wide/16 v30, 0x0

    .line 1240
    .line 1241
    const v32, 0x3fff87f

    .line 1242
    .line 1243
    .line 1244
    const/4 v12, 0x0

    .line 1245
    const/4 v13, 0x0

    .line 1246
    const/4 v14, 0x0

    .line 1247
    const/4 v15, 0x0

    .line 1248
    const/16 v16, 0x0

    .line 1249
    .line 1250
    const/16 v17, 0x0

    .line 1251
    .line 1252
    const/16 v21, 0x0

    .line 1253
    .line 1254
    const/16 v22, 0x0

    .line 1255
    .line 1256
    const/16 v23, 0x0

    .line 1257
    .line 1258
    const/16 v24, 0x0

    .line 1259
    .line 1260
    const/16 v25, 0x0

    .line 1261
    .line 1262
    const/16 v26, 0x0

    .line 1263
    .line 1264
    const/16 v27, 0x0

    .line 1265
    .line 1266
    const-wide/16 v28, 0x0

    .line 1267
    .line 1268
    invoke-static/range {v11 .. v32}, La/wrs;->a(La/wrs;La/gps;La/jlr;La/ypl0;La/bqr;La/xus;Ljava/lang/String;Ljava/util/List;La/rsp;La/lov;Ljava/util/List;La/yws;ZZZLjava/util/ArrayList;ZJJI)La/wrs;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v0

    .line 1272
    return-object v0

    .line 1273
    :pswitch_19
    check-cast v0, La/mm40;

    .line 1274
    .line 1275
    check-cast v10, La/bms;

    .line 1276
    .line 1277
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 1278
    .line 1279
    move-object/from16 v1, p1

    .line 1280
    .line 1281
    check-cast v1, La/fet;

    .line 1282
    .line 1283
    move-object/from16 v2, p2

    .line 1284
    .line 1285
    check-cast v2, Ljava/lang/Integer;

    .line 1286
    .line 1287
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1288
    .line 1289
    .line 1290
    invoke-static {v8}, La/x8x;->L(I)I

    .line 1291
    .line 1292
    .line 1293
    move-result v2

    .line 1294
    invoke-static {v0, v10, v9, v1, v2}, La/bfb;->v(La/mm40;La/bms;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1295
    .line 1296
    .line 1297
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1298
    .line 1299
    return-object v0

    .line 1300
    :pswitch_1a
    move-object/from16 v32, v0

    .line 1301
    .line 1302
    check-cast v32, La/fsr;

    .line 1303
    .line 1304
    check-cast v10, La/irs;

    .line 1305
    .line 1306
    check-cast v9, La/dja;

    .line 1307
    .line 1308
    move-object/from16 v0, p1

    .line 1309
    .line 1310
    check-cast v0, La/oyg0;

    .line 1311
    .line 1312
    move-object/from16 v1, p2

    .line 1313
    .line 1314
    check-cast v1, La/z2s;

    .line 1315
    .line 1316
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1317
    .line 1318
    .line 1319
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1320
    .line 1321
    .line 1322
    const-string v2, "KEY_CURRENT_TAB"

    .line 1323
    .line 1324
    invoke-static {v0, v10, v2}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1325
    .line 1326
    .line 1327
    const-string v2, "KEY_CURRENT_BROADCASTING_TYPE"

    .line 1328
    .line 1329
    invoke-static {v0, v9, v2}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1330
    .line 1331
    .line 1332
    const/16 v45, -0x1

    .line 1333
    .line 1334
    const v46, 0xff3b

    .line 1335
    .line 1336
    .line 1337
    const-wide/16 v2, 0x0

    .line 1338
    .line 1339
    const/4 v4, 0x0

    .line 1340
    const/4 v5, 0x0

    .line 1341
    const/4 v6, 0x0

    .line 1342
    const-wide/16 v7, 0x0

    .line 1343
    .line 1344
    move-object/from16 v37, v9

    .line 1345
    .line 1346
    move-object/from16 v36, v10

    .line 1347
    .line 1348
    const-wide/16 v9, 0x0

    .line 1349
    .line 1350
    const/4 v11, 0x0

    .line 1351
    const/4 v12, 0x0

    .line 1352
    const/4 v13, 0x0

    .line 1353
    const/4 v14, 0x0

    .line 1354
    const/4 v15, 0x0

    .line 1355
    const/16 v16, 0x0

    .line 1356
    .line 1357
    const/16 v17, 0x0

    .line 1358
    .line 1359
    const/16 v18, 0x0

    .line 1360
    .line 1361
    const/16 v19, 0x0

    .line 1362
    .line 1363
    const/16 v20, 0x0

    .line 1364
    .line 1365
    const/16 v21, 0x0

    .line 1366
    .line 1367
    const/16 v22, 0x0

    .line 1368
    .line 1369
    const/16 v23, 0x0

    .line 1370
    .line 1371
    const/16 v24, 0x0

    .line 1372
    .line 1373
    const/16 v25, 0x0

    .line 1374
    .line 1375
    const/16 v26, 0x0

    .line 1376
    .line 1377
    const/16 v27, 0x0

    .line 1378
    .line 1379
    const/16 v28, 0x0

    .line 1380
    .line 1381
    const/16 v29, 0x0

    .line 1382
    .line 1383
    const/16 v30, 0x0

    .line 1384
    .line 1385
    const/16 v31, 0x0

    .line 1386
    .line 1387
    const/16 v33, 0x0

    .line 1388
    .line 1389
    const/16 v34, 0x0

    .line 1390
    .line 1391
    const/16 v35, 0x0

    .line 1392
    .line 1393
    const/16 v38, 0x0

    .line 1394
    .line 1395
    const/16 v39, 0x0

    .line 1396
    .line 1397
    const/16 v40, 0x0

    .line 1398
    .line 1399
    const/16 v41, 0x0

    .line 1400
    .line 1401
    const/16 v42, 0x0

    .line 1402
    .line 1403
    const/16 v43, 0x0

    .line 1404
    .line 1405
    const/16 v44, 0x0

    .line 1406
    .line 1407
    invoke-static/range {v1 .. v46}, La/z2s;->a(La/z2s;JLjava/lang/String;Ljava/lang/Long;ZJJLjava/lang/Long;La/t3z;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLa/vzj0;ZZZLjava/lang/String;Ljava/lang/String;ZZLa/fsr;La/xvm0;La/js20;La/dja;La/irs;La/dja;La/gna;La/anq0;La/bg30;La/ui9;Ljava/util/List;ZLjava/util/List;II)La/z2s;

    .line 1408
    .line 1409
    .line 1410
    move-result-object v0

    .line 1411
    return-object v0

    .line 1412
    :pswitch_1b
    check-cast v0, La/mm40;

    .line 1413
    .line 1414
    check-cast v10, La/l7m0;

    .line 1415
    .line 1416
    check-cast v9, Lkotlin/jvm/functions/Function2;

    .line 1417
    .line 1418
    move-object/from16 v15, p1

    .line 1419
    .line 1420
    check-cast v15, La/fet;

    .line 1421
    .line 1422
    move-object/from16 v1, p2

    .line 1423
    .line 1424
    check-cast v1, Ljava/lang/Integer;

    .line 1425
    .line 1426
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1427
    .line 1428
    .line 1429
    move-result v1

    .line 1430
    and-int/lit8 v2, v1, 0x3

    .line 1431
    .line 1432
    if-eq v2, v5, :cond_1f

    .line 1433
    .line 1434
    move v2, v8

    .line 1435
    goto :goto_15

    .line 1436
    :cond_1f
    move v2, v7

    .line 1437
    :goto_15
    and-int/2addr v1, v8

    .line 1438
    invoke-virtual {v15, v1, v2}, La/fet;->U(IZ)Z

    .line 1439
    .line 1440
    .line 1441
    move-result v1

    .line 1442
    if-eqz v1, :cond_28

    .line 1443
    .line 1444
    const/high16 v1, 0x3f800000    # 1.0f

    .line 1445
    .line 1446
    invoke-static {v0, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 1447
    .line 1448
    .line 1449
    move-result-object v0

    .line 1450
    invoke-static {v0}, La/hp4;->B(La/mm40;)La/mm40;

    .line 1451
    .line 1452
    .line 1453
    move-result-object v0

    .line 1454
    sget-object v1, La/gqw0;->a:La/zx7;

    .line 1455
    .line 1456
    invoke-static {v1, v7}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v1

    .line 1460
    iget-wide v2, v15, La/fet;->T:J

    .line 1461
    .line 1462
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 1463
    .line 1464
    .line 1465
    move-result v2

    .line 1466
    invoke-virtual {v15}, La/fet;->m()La/bh90;

    .line 1467
    .line 1468
    .line 1469
    move-result-object v3

    .line 1470
    invoke-static {v15, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 1471
    .line 1472
    .line 1473
    move-result-object v0

    .line 1474
    sget-object v4, La/mkd;->c0:La/gqw0;

    .line 1475
    .line 1476
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1477
    .line 1478
    .line 1479
    invoke-virtual {v15}, La/fet;->i0()V

    .line 1480
    .line 1481
    .line 1482
    iget-boolean v4, v15, La/fet;->S:Z

    .line 1483
    .line 1484
    if-eqz v4, :cond_20

    .line 1485
    .line 1486
    sget-object v4, La/e7z;->u1:La/pcy;

    .line 1487
    .line 1488
    invoke-virtual {v15, v4}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 1489
    .line 1490
    .line 1491
    goto :goto_16

    .line 1492
    :cond_20
    invoke-virtual {v15}, La/fet;->r0()V

    .line 1493
    .line 1494
    .line 1495
    :goto_16
    sget-object v4, La/gqw0;->x:La/shd;

    .line 1496
    .line 1497
    invoke-static {v15, v1, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1498
    .line 1499
    .line 1500
    sget-object v1, La/gqw0;->w:La/shd;

    .line 1501
    .line 1502
    invoke-static {v15, v3, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1503
    .line 1504
    .line 1505
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1506
    .line 1507
    .line 1508
    move-result-object v1

    .line 1509
    sget-object v2, La/gqw0;->y:La/shd;

    .line 1510
    .line 1511
    invoke-static {v15, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1512
    .line 1513
    .line 1514
    invoke-static {v15}, La/jpm0;->n(La/fet;)V

    .line 1515
    .line 1516
    .line 1517
    sget-object v1, La/gqw0;->v:La/shd;

    .line 1518
    .line 1519
    invoke-static {v15, v0, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1520
    .line 1521
    .line 1522
    invoke-interface {v10}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1523
    .line 1524
    .line 1525
    move-result-object v0

    .line 1526
    check-cast v0, La/zrr;

    .line 1527
    .line 1528
    sget-object v1, La/qrr;->a:La/qrr;

    .line 1529
    .line 1530
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1531
    .line 1532
    .line 1533
    move-result v1

    .line 1534
    if-eqz v1, :cond_21

    .line 1535
    .line 1536
    const v0, -0x3764026b

    .line 1537
    .line 1538
    .line 1539
    invoke-virtual {v15, v0}, La/fet;->e0(I)V

    .line 1540
    .line 1541
    .line 1542
    invoke-static {v7, v8, v15, v6}, La/uzb;->B(IILa/fet;La/mm40;)V

    .line 1543
    .line 1544
    .line 1545
    invoke-virtual {v15, v7}, La/fet;->r(Z)V

    .line 1546
    .line 1547
    .line 1548
    goto/16 :goto_17

    .line 1549
    .line 1550
    :cond_21
    instance-of v1, v0, La/orr;

    .line 1551
    .line 1552
    if-eqz v1, :cond_22

    .line 1553
    .line 1554
    const v1, -0x3763fa5c

    .line 1555
    .line 1556
    .line 1557
    invoke-virtual {v15, v1}, La/fet;->e0(I)V

    .line 1558
    .line 1559
    .line 1560
    check-cast v0, La/orr;

    .line 1561
    .line 1562
    iget-object v0, v0, La/orr;->a:Ljava/lang/String;

    .line 1563
    .line 1564
    invoke-static {v7, v15, v6, v0}, La/wwb;->o(ILa/fet;La/mm40;Ljava/lang/String;)V

    .line 1565
    .line 1566
    .line 1567
    invoke-virtual {v15, v7}, La/fet;->r(Z)V

    .line 1568
    .line 1569
    .line 1570
    goto/16 :goto_17

    .line 1571
    .line 1572
    :cond_22
    instance-of v1, v0, La/trr;

    .line 1573
    .line 1574
    sget-object v11, La/jm40;->b:La/jm40;

    .line 1575
    .line 1576
    if-eqz v1, :cond_23

    .line 1577
    .line 1578
    const v1, -0x3763ef4b

    .line 1579
    .line 1580
    .line 1581
    invoke-virtual {v15, v1}, La/fet;->e0(I)V

    .line 1582
    .line 1583
    .line 1584
    check-cast v0, La/trr;

    .line 1585
    .line 1586
    new-instance v1, La/brr;

    .line 1587
    .line 1588
    invoke-direct {v1, v0, v7}, La/brr;-><init>(La/trr;B)V

    .line 1589
    .line 1590
    .line 1591
    const v2, 0x75c75ff2

    .line 1592
    .line 1593
    .line 1594
    invoke-static {v2, v1, v15}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 1595
    .line 1596
    .line 1597
    move-result-object v12

    .line 1598
    new-instance v1, La/ec30;

    .line 1599
    .line 1600
    const/16 v2, 0x1c

    .line 1601
    .line 1602
    invoke-direct {v1, v0, v9, v2}, La/ec30;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1603
    .line 1604
    .line 1605
    const v2, 0x548536b3

    .line 1606
    .line 1607
    .line 1608
    invoke-static {v2, v1, v15}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 1609
    .line 1610
    .line 1611
    move-result-object v13

    .line 1612
    new-instance v1, La/brr;

    .line 1613
    .line 1614
    invoke-direct {v1, v0, v8}, La/brr;-><init>(La/trr;B)V

    .line 1615
    .line 1616
    .line 1617
    const v0, 0x33430d74

    .line 1618
    .line 1619
    .line 1620
    invoke-static {v0, v1, v15}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 1621
    .line 1622
    .line 1623
    move-result-object v14

    .line 1624
    const/16 v16, 0x6d80

    .line 1625
    .line 1626
    const/16 v17, 0x2

    .line 1627
    .line 1628
    invoke-static/range {v11 .. v17}, La/v3c;->u(La/mm40;La/ugd;La/ugd;La/ugd;La/fet;II)V

    .line 1629
    .line 1630
    .line 1631
    invoke-virtual {v15, v7}, La/fet;->r(Z)V

    .line 1632
    .line 1633
    .line 1634
    goto/16 :goto_17

    .line 1635
    .line 1636
    :cond_23
    instance-of v1, v0, La/rrr;

    .line 1637
    .line 1638
    if-eqz v1, :cond_24

    .line 1639
    .line 1640
    const v1, -0x3763d738

    .line 1641
    .line 1642
    .line 1643
    invoke-virtual {v15, v1}, La/fet;->e0(I)V

    .line 1644
    .line 1645
    .line 1646
    check-cast v0, La/rrr;

    .line 1647
    .line 1648
    new-instance v1, La/xqr;

    .line 1649
    .line 1650
    invoke-direct {v1, v0, v7}, La/xqr;-><init>(La/rrr;B)V

    .line 1651
    .line 1652
    .line 1653
    const v2, -0x4678845a

    .line 1654
    .line 1655
    .line 1656
    invoke-static {v2, v1, v15}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v12

    .line 1660
    new-instance v1, La/xqr;

    .line 1661
    .line 1662
    invoke-direct {v1, v0, v8}, La/xqr;-><init>(La/rrr;B)V

    .line 1663
    .line 1664
    .line 1665
    const v2, -0x6ea5f5bb

    .line 1666
    .line 1667
    .line 1668
    invoke-static {v2, v1, v15}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 1669
    .line 1670
    .line 1671
    move-result-object v13

    .line 1672
    new-instance v1, La/xqr;

    .line 1673
    .line 1674
    invoke-direct {v1, v0, v5}, La/xqr;-><init>(La/rrr;B)V

    .line 1675
    .line 1676
    .line 1677
    const v0, 0x692c98e4

    .line 1678
    .line 1679
    .line 1680
    invoke-static {v0, v1, v15}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 1681
    .line 1682
    .line 1683
    move-result-object v14

    .line 1684
    const/16 v16, 0x6d80

    .line 1685
    .line 1686
    const/16 v17, 0x2

    .line 1687
    .line 1688
    invoke-static/range {v11 .. v17}, La/v3c;->u(La/mm40;La/ugd;La/ugd;La/ugd;La/fet;II)V

    .line 1689
    .line 1690
    .line 1691
    invoke-virtual {v15, v7}, La/fet;->r(Z)V

    .line 1692
    .line 1693
    .line 1694
    goto/16 :goto_17

    .line 1695
    .line 1696
    :cond_24
    instance-of v1, v0, La/mrr;

    .line 1697
    .line 1698
    if-eqz v1, :cond_25

    .line 1699
    .line 1700
    const v1, -0x3763cb95

    .line 1701
    .line 1702
    .line 1703
    invoke-virtual {v15, v1}, La/fet;->e0(I)V

    .line 1704
    .line 1705
    .line 1706
    check-cast v0, La/mrr;

    .line 1707
    .line 1708
    new-instance v1, La/pqr;

    .line 1709
    .line 1710
    invoke-direct {v1, v0, v7}, La/pqr;-><init>(La/mrr;B)V

    .line 1711
    .line 1712
    .line 1713
    const v2, -0x57a4338b

    .line 1714
    .line 1715
    .line 1716
    invoke-static {v2, v1, v15}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 1717
    .line 1718
    .line 1719
    move-result-object v12

    .line 1720
    new-instance v1, La/ec30;

    .line 1721
    .line 1722
    const/16 v2, 0x1a

    .line 1723
    .line 1724
    invoke-direct {v1, v0, v9, v2}, La/ec30;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1725
    .line 1726
    .line 1727
    const v2, -0x112cc2ec

    .line 1728
    .line 1729
    .line 1730
    invoke-static {v2, v1, v15}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 1731
    .line 1732
    .line 1733
    move-result-object v13

    .line 1734
    new-instance v1, La/pqr;

    .line 1735
    .line 1736
    invoke-direct {v1, v0, v8}, La/pqr;-><init>(La/mrr;B)V

    .line 1737
    .line 1738
    .line 1739
    const v0, 0x354aadb3

    .line 1740
    .line 1741
    .line 1742
    invoke-static {v0, v1, v15}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 1743
    .line 1744
    .line 1745
    move-result-object v14

    .line 1746
    const/16 v16, 0x6d80

    .line 1747
    .line 1748
    const/16 v17, 0x2

    .line 1749
    .line 1750
    invoke-static/range {v11 .. v17}, La/v3c;->u(La/mm40;La/ugd;La/ugd;La/ugd;La/fet;II)V

    .line 1751
    .line 1752
    .line 1753
    invoke-virtual {v15, v7}, La/fet;->r(Z)V

    .line 1754
    .line 1755
    .line 1756
    goto/16 :goto_17

    .line 1757
    .line 1758
    :cond_25
    instance-of v1, v0, La/vrr;

    .line 1759
    .line 1760
    if-eqz v1, :cond_26

    .line 1761
    .line 1762
    const v1, -0x3763b497

    .line 1763
    .line 1764
    .line 1765
    invoke-virtual {v15, v1}, La/fet;->e0(I)V

    .line 1766
    .line 1767
    .line 1768
    check-cast v0, La/vrr;

    .line 1769
    .line 1770
    new-instance v1, La/grr;

    .line 1771
    .line 1772
    invoke-direct {v1, v0, v7}, La/grr;-><init>(La/vrr;B)V

    .line 1773
    .line 1774
    .line 1775
    const v2, 0x488436a5

    .line 1776
    .line 1777
    .line 1778
    invoke-static {v2, v1, v15}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 1779
    .line 1780
    .line 1781
    move-result-object v12

    .line 1782
    new-instance v1, La/grr;

    .line 1783
    .line 1784
    invoke-direct {v1, v0, v8}, La/grr;-><init>(La/vrr;B)V

    .line 1785
    .line 1786
    .line 1787
    const v2, -0x2f05261a

    .line 1788
    .line 1789
    .line 1790
    invoke-static {v2, v1, v15}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 1791
    .line 1792
    .line 1793
    move-result-object v13

    .line 1794
    new-instance v1, La/grr;

    .line 1795
    .line 1796
    invoke-direct {v1, v0, v5}, La/grr;-><init>(La/vrr;B)V

    .line 1797
    .line 1798
    .line 1799
    const v0, 0x59717d27

    .line 1800
    .line 1801
    .line 1802
    invoke-static {v0, v1, v15}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 1803
    .line 1804
    .line 1805
    move-result-object v14

    .line 1806
    const/16 v16, 0x6d80

    .line 1807
    .line 1808
    const/16 v17, 0x2

    .line 1809
    .line 1810
    invoke-static/range {v11 .. v17}, La/v3c;->u(La/mm40;La/ugd;La/ugd;La/ugd;La/fet;II)V

    .line 1811
    .line 1812
    .line 1813
    invoke-virtual {v15, v7}, La/fet;->r(Z)V

    .line 1814
    .line 1815
    .line 1816
    goto :goto_17

    .line 1817
    :cond_26
    instance-of v1, v0, La/xrr;

    .line 1818
    .line 1819
    if-eqz v1, :cond_27

    .line 1820
    .line 1821
    const v1, -0x3763a851

    .line 1822
    .line 1823
    .line 1824
    invoke-virtual {v15, v1}, La/fet;->e0(I)V

    .line 1825
    .line 1826
    .line 1827
    check-cast v0, La/xrr;

    .line 1828
    .line 1829
    iget-object v1, v0, La/xrr;->e:La/iul0;

    .line 1830
    .line 1831
    iget-object v1, v1, La/iul0;->a:La/eex;

    .line 1832
    .line 1833
    invoke-static {v1, v15}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 1834
    .line 1835
    .line 1836
    move-result-object v1

    .line 1837
    new-instance v2, La/irr;

    .line 1838
    .line 1839
    invoke-direct {v2, v0, v7}, La/irr;-><init>(La/xrr;B)V

    .line 1840
    .line 1841
    .line 1842
    const v3, -0x7c4d01a5

    .line 1843
    .line 1844
    .line 1845
    invoke-static {v3, v2, v15}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 1846
    .line 1847
    .line 1848
    move-result-object v12

    .line 1849
    new-instance v2, La/n82;

    .line 1850
    .line 1851
    const/16 v3, 0xd

    .line 1852
    .line 1853
    invoke-direct {v2, v0, v1, v9, v3}, La/n82;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1854
    .line 1855
    .line 1856
    const v1, 0x1ad54adc

    .line 1857
    .line 1858
    .line 1859
    invoke-static {v1, v2, v15}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 1860
    .line 1861
    .line 1862
    move-result-object v13

    .line 1863
    new-instance v1, La/irr;

    .line 1864
    .line 1865
    invoke-direct {v1, v0, v8}, La/irr;-><init>(La/xrr;B)V

    .line 1866
    .line 1867
    .line 1868
    const v0, -0x4e0868a3

    .line 1869
    .line 1870
    .line 1871
    invoke-static {v0, v1, v15}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 1872
    .line 1873
    .line 1874
    move-result-object v14

    .line 1875
    const/16 v16, 0x6d80

    .line 1876
    .line 1877
    const/16 v17, 0x2

    .line 1878
    .line 1879
    invoke-static/range {v11 .. v17}, La/v3c;->u(La/mm40;La/ugd;La/ugd;La/ugd;La/fet;II)V

    .line 1880
    .line 1881
    .line 1882
    invoke-virtual {v15, v7}, La/fet;->r(Z)V

    .line 1883
    .line 1884
    .line 1885
    :goto_17
    invoke-virtual {v15, v8}, La/fet;->r(Z)V

    .line 1886
    .line 1887
    .line 1888
    goto :goto_18

    .line 1889
    :cond_27
    const v0, -0x37640980    # -319412.0f

    .line 1890
    .line 1891
    .line 1892
    invoke-static {v0, v15, v7}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 1893
    .line 1894
    .line 1895
    move-result-object v0

    .line 1896
    throw v0

    .line 1897
    :cond_28
    invoke-virtual {v15}, La/fet;->X()V

    .line 1898
    .line 1899
    .line 1900
    :goto_18
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1901
    .line 1902
    return-object v0

    .line 1903
    :pswitch_1c
    check-cast v0, La/l9s;

    .line 1904
    .line 1905
    check-cast v10, La/k9s;

    .line 1906
    .line 1907
    check-cast v9, La/spr;

    .line 1908
    .line 1909
    move-object/from16 v1, p1

    .line 1910
    .line 1911
    check-cast v1, La/oyg0;

    .line 1912
    .line 1913
    move-object/from16 v11, p2

    .line 1914
    .line 1915
    check-cast v11, La/qnr;

    .line 1916
    .line 1917
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1918
    .line 1919
    .line 1920
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1921
    .line 1922
    .line 1923
    invoke-interface {v0}, La/l9s;->a()J

    .line 1924
    .line 1925
    .line 1926
    move-result-wide v12

    .line 1927
    invoke-interface {v0}, La/l9s;->i()Ljava/lang/String;

    .line 1928
    .line 1929
    .line 1930
    move-result-object v14

    .line 1931
    invoke-interface {v0}, La/l9s;->C()J

    .line 1932
    .line 1933
    .line 1934
    move-result-wide v1

    .line 1935
    invoke-interface {v0}, La/l9s;->e()Z

    .line 1936
    .line 1937
    .line 1938
    move-result v16

    .line 1939
    if-eqz v10, :cond_29

    .line 1940
    .line 1941
    iget-boolean v7, v10, La/k9s;->W:Z

    .line 1942
    .line 1943
    :cond_29
    move/from16 v28, v7

    .line 1944
    .line 1945
    invoke-interface {v0}, La/l9s;->s()Z

    .line 1946
    .line 1947
    .line 1948
    move-result v30

    .line 1949
    invoke-interface {v0}, La/l9s;->H()Z

    .line 1950
    .line 1951
    .line 1952
    move-result v33

    .line 1953
    invoke-interface {v0}, La/l9s;->c()J

    .line 1954
    .line 1955
    .line 1956
    move-result-wide v17

    .line 1957
    invoke-interface {v0}, La/l9s;->N()Ljava/lang/String;

    .line 1958
    .line 1959
    .line 1960
    move-result-object v23

    .line 1961
    invoke-interface {v0}, La/l9s;->o()Ljava/lang/String;

    .line 1962
    .line 1963
    .line 1964
    move-result-object v24

    .line 1965
    invoke-interface {v0}, La/l9s;->w()Ljava/lang/String;

    .line 1966
    .line 1967
    .line 1968
    move-result-object v25

    .line 1969
    if-eqz v10, :cond_2a

    .line 1970
    .line 1971
    iget-object v6, v10, La/k9s;->Z:La/vzj0;

    .line 1972
    .line 1973
    :cond_2a
    move-object/from16 v34, v6

    .line 1974
    .line 1975
    invoke-interface {v0}, La/l9s;->r()Ljava/lang/String;

    .line 1976
    .line 1977
    .line 1978
    move-result-object v45

    .line 1979
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1980
    .line 1981
    .line 1982
    move-result-object v15

    .line 1983
    const v60, -0x653820

    .line 1984
    .line 1985
    .line 1986
    const v61, 0x7fffd

    .line 1987
    .line 1988
    .line 1989
    const-wide/16 v19, 0x0

    .line 1990
    .line 1991
    const/16 v21, 0x0

    .line 1992
    .line 1993
    const/16 v22, 0x0

    .line 1994
    .line 1995
    const/16 v26, 0x0

    .line 1996
    .line 1997
    const/16 v27, 0x0

    .line 1998
    .line 1999
    const/16 v29, 0x0

    .line 2000
    .line 2001
    const/16 v31, 0x0

    .line 2002
    .line 2003
    const/16 v32, 0x0

    .line 2004
    .line 2005
    const/16 v35, 0x0

    .line 2006
    .line 2007
    const/16 v36, 0x0

    .line 2008
    .line 2009
    const/16 v37, 0x0

    .line 2010
    .line 2011
    const/16 v38, 0x0

    .line 2012
    .line 2013
    const/16 v39, 0x0

    .line 2014
    .line 2015
    const/16 v40, 0x0

    .line 2016
    .line 2017
    const/16 v41, 0x0

    .line 2018
    .line 2019
    const/16 v42, 0x0

    .line 2020
    .line 2021
    const/16 v43, 0x0

    .line 2022
    .line 2023
    const/16 v44, 0x0

    .line 2024
    .line 2025
    const/16 v46, 0x0

    .line 2026
    .line 2027
    const/16 v47, 0x0

    .line 2028
    .line 2029
    const/16 v48, 0x0

    .line 2030
    .line 2031
    const/16 v49, 0x0

    .line 2032
    .line 2033
    const/16 v50, 0x0

    .line 2034
    .line 2035
    const/16 v51, 0x0

    .line 2036
    .line 2037
    const/16 v52, 0x0

    .line 2038
    .line 2039
    const/16 v53, 0x0

    .line 2040
    .line 2041
    const/16 v54, 0x0

    .line 2042
    .line 2043
    const/16 v55, 0x0

    .line 2044
    .line 2045
    const/16 v56, 0x0

    .line 2046
    .line 2047
    const/16 v57, 0x0

    .line 2048
    .line 2049
    const/16 v58, 0x0

    .line 2050
    .line 2051
    const/16 v59, 0x0

    .line 2052
    .line 2053
    invoke-static/range {v11 .. v61}, La/qnr;->a(La/qnr;JLjava/lang/String;Ljava/lang/Long;ZJJLjava/lang/Long;La/t3z;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLa/vzj0;ZZZZZZZZZLjava/lang/String;Ljava/lang/String;ZZLa/fsr;La/xvm0;La/js20;La/dja;La/gna;La/anq0;La/bg30;La/ui9;Ljava/util/List;ZLjava/util/List;ZII)La/qnr;

    .line 2054
    .line 2055
    .line 2056
    move-result-object v0

    .line 2057
    iget-object v1, v9, La/spr;->o:La/vzg0;

    .line 2058
    .line 2059
    iget-wide v2, v0, La/qnr;->a:J

    .line 2060
    .line 2061
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2062
    .line 2063
    .line 2064
    move-result-object v2

    .line 2065
    const-string v3, "KEY_GAME_ID"

    .line 2066
    .line 2067
    invoke-virtual {v1, v3, v2}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2068
    .line 2069
    .line 2070
    const-string v2, "KEY_CHAMP_ID"

    .line 2071
    .line 2072
    iget-object v3, v0, La/qnr;->h:Ljava/lang/Long;

    .line 2073
    .line 2074
    invoke-virtual {v1, v2, v3}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2075
    .line 2076
    .line 2077
    iget-boolean v2, v0, La/qnr;->d:Z

    .line 2078
    .line 2079
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2080
    .line 2081
    .line 2082
    move-result-object v2

    .line 2083
    const-string v3, "KEY_LIVE"

    .line 2084
    .line 2085
    invoke-virtual {v1, v3, v2}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2086
    .line 2087
    .line 2088
    return-object v0

    .line 2089
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
