.class public final synthetic La/or3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/or3;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/qb4;)V
    .locals 0

    .line 1
    const/16 p1, 0x10

    iput-byte p1, p0, La/or3;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte p0, p0, La/or3;->a:B

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    const/4 v1, 0x4

    .line 5
    const/4 v2, 0x5

    .line 6
    const/16 v3, 0xa

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v6, 0x0

    .line 11
    packed-switch p0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p1, La/ou90;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    check-cast p1, La/k0w0;

    .line 23
    .line 24
    sget-object p0, La/m0w0;->a:La/m0w0;

    .line 25
    .line 26
    invoke-virtual {p1, p0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, La/c8d;

    .line 33
    .line 34
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 35
    .line 36
    new-instance v0, La/bjk;

    .line 37
    .line 38
    invoke-direct {v0, v4, v6, v6, v6}, La/bjk;-><init>(Ljava/lang/String;ZZZ)V

    .line 39
    .line 40
    .line 41
    new-instance v1, La/v7d;

    .line 42
    .line 43
    invoke-direct {v1, v6, p1, v0}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 44
    .line 45
    .line 46
    iput-object v1, p0, La/c8d;->a:La/w7d;

    .line 47
    .line 48
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_1
    check-cast p1, La/k0w0;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    sget-object p0, La/t0w0;->a:La/t0w0;

    .line 57
    .line 58
    invoke-virtual {p1, p0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p0, La/c8d;

    .line 65
    .line 66
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 67
    .line 68
    new-instance v0, La/bjk;

    .line 69
    .line 70
    invoke-direct {v0, v4, v6, v6, v6}, La/bjk;-><init>(Ljava/lang/String;ZZZ)V

    .line 71
    .line 72
    .line 73
    new-instance v1, La/v7d;

    .line 74
    .line 75
    invoke-direct {v1, v6, p1, v0}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 76
    .line 77
    .line 78
    iput-object v1, p0, La/c8d;->a:La/w7d;

    .line 79
    .line 80
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_2
    check-cast p1, La/k0w0;

    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    sget-object p0, La/o0w0;->a:La/o0w0;

    .line 89
    .line 90
    invoke-virtual {p1, p0}, La/k0w0;->a(La/g1w0;)La/okt0;

    .line 91
    .line 92
    .line 93
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    return-object p0

    .line 96
    :pswitch_3
    check-cast p1, Ljava/util/List;

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    new-instance p0, Ljava/util/ArrayList;

    .line 102
    .line 103
    invoke-static {p1, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 108
    .line 109
    .line 110
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_b

    .line 119
    .line 120
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    check-cast v0, La/u54;

    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    new-instance v1, La/af4;

    .line 130
    .line 131
    invoke-interface {v0}, La/u54;->a()I

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    if-ne v3, v5, :cond_0

    .line 136
    .line 137
    const v3, 0x7f080bf6

    .line 138
    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_0
    if-ne v3, v2, :cond_1

    .line 142
    .line 143
    const v3, 0x7f080bf2

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_1
    const/16 v4, 0xd

    .line 148
    .line 149
    if-ne v3, v4, :cond_2

    .line 150
    .line 151
    const v3, 0x7f080bf8

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_2
    const/16 v4, 0x1f

    .line 156
    .line 157
    if-ne v3, v4, :cond_3

    .line 158
    .line 159
    const v3, 0x7f080beb

    .line 160
    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_3
    const/4 v4, 0x7

    .line 164
    if-ne v3, v4, :cond_4

    .line 165
    .line 166
    const v3, 0x7f080bf9

    .line 167
    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_4
    const/16 v4, 0x9

    .line 171
    .line 172
    if-ne v3, v4, :cond_5

    .line 173
    .line 174
    const v3, 0x7f080bf1

    .line 175
    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_5
    const/16 v4, 0xb

    .line 179
    .line 180
    if-ne v3, v4, :cond_6

    .line 181
    .line 182
    const v3, 0x7f080bed

    .line 183
    .line 184
    .line 185
    goto :goto_1

    .line 186
    :cond_6
    const/16 v4, 0x11

    .line 187
    .line 188
    if-ne v3, v4, :cond_7

    .line 189
    .line 190
    const v3, 0x7f080bf3

    .line 191
    .line 192
    .line 193
    goto :goto_1

    .line 194
    :cond_7
    const/16 v4, 0x13

    .line 195
    .line 196
    if-ne v3, v4, :cond_8

    .line 197
    .line 198
    const v3, 0x7f080bea

    .line 199
    .line 200
    .line 201
    goto :goto_1

    .line 202
    :cond_8
    const/16 v4, 0x1a

    .line 203
    .line 204
    if-ne v3, v4, :cond_9

    .line 205
    .line 206
    const v3, 0x7f080bef

    .line 207
    .line 208
    .line 209
    goto :goto_1

    .line 210
    :cond_9
    const/16 v4, 0x30

    .line 211
    .line 212
    if-ne v3, v4, :cond_a

    .line 213
    .line 214
    const v3, 0x7f080b57

    .line 215
    .line 216
    .line 217
    goto :goto_1

    .line 218
    :cond_a
    move v3, v6

    .line 219
    :goto_1
    invoke-interface {v0}, La/u54;->a()I

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    invoke-direct {v1, v3, v0}, La/af4;-><init>(II)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    goto :goto_0

    .line 230
    :cond_b
    return-object p0

    .line 231
    :pswitch_4
    check-cast p1, Ljava/lang/Boolean;

    .line 232
    .line 233
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 234
    .line 235
    .line 236
    move-result p0

    .line 237
    xor-int/2addr p0, v5

    .line 238
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    return-object p0

    .line 243
    :pswitch_5
    check-cast p1, La/lg4;

    .line 244
    .line 245
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    return-object p1

    .line 249
    :pswitch_6
    check-cast p1, La/abi0;

    .line 250
    .line 251
    sget-object p0, La/ig4;->O1:La/rek0;

    .line 252
    .line 253
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    invoke-static {p1}, La/yai0;->j(La/abi0;)V

    .line 257
    .line 258
    .line 259
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 260
    .line 261
    return-object p0

    .line 262
    :pswitch_7
    check-cast p1, La/abi0;

    .line 263
    .line 264
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    invoke-static {p1}, La/yai0;->j(La/abi0;)V

    .line 268
    .line 269
    .line 270
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 271
    .line 272
    return-object p0

    .line 273
    :pswitch_8
    check-cast p1, Ljava/lang/Float;

    .line 274
    .line 275
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 276
    .line 277
    .line 278
    move-result p0

    .line 279
    const/high16 p1, 0x3f000000    # 0.5f

    .line 280
    .line 281
    mul-float/2addr p0, p1

    .line 282
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 283
    .line 284
    .line 285
    move-result-object p0

    .line 286
    return-object p0

    .line 287
    :pswitch_9
    check-cast p1, Ljava/lang/Integer;

    .line 288
    .line 289
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 290
    .line 291
    .line 292
    return-object p1

    .line 293
    :pswitch_a
    check-cast p1, La/ou90;

    .line 294
    .line 295
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 299
    .line 300
    return-object p0

    .line 301
    :pswitch_b
    check-cast p1, La/af4;

    .line 302
    .line 303
    sget-object p0, La/ze4;->g2:La/qek0;

    .line 304
    .line 305
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    iget p0, p1, La/af4;->b:I

    .line 309
    .line 310
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 311
    .line 312
    .line 313
    move-result-object p0

    .line 314
    return-object p0

    .line 315
    :pswitch_c
    check-cast p1, Ljava/util/List;

    .line 316
    .line 317
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 321
    .line 322
    .line 323
    move-result p0

    .line 324
    if-gt p0, v2, :cond_e

    .line 325
    .line 326
    new-instance p0, Ljava/util/ArrayList;

    .line 327
    .line 328
    invoke-static {p1, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 333
    .line 334
    .line 335
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 336
    .line 337
    .line 338
    move-result-object p1

    .line 339
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 340
    .line 341
    .line 342
    move-result v0

    .line 343
    if-eqz v0, :cond_c

    .line 344
    .line 345
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    check-cast v0, La/u54;

    .line 350
    .line 351
    invoke-static {v0}, La/cjx;->Y(La/u54;)La/ra4;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    goto :goto_2

    .line 359
    :cond_c
    new-instance p1, Ljava/util/ArrayList;

    .line 360
    .line 361
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 362
    .line 363
    .line 364
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 365
    .line 366
    .line 367
    move-result-object p0

    .line 368
    :cond_d
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    if-eqz v0, :cond_10

    .line 373
    .line 374
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    move-object v1, v0

    .line 379
    check-cast v1, La/ra4;

    .line 380
    .line 381
    iget v1, v1, La/ra4;->a:I

    .line 382
    .line 383
    if-eqz v1, :cond_d

    .line 384
    .line 385
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    goto :goto_3

    .line 389
    :cond_e
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 390
    .line 391
    .line 392
    move-result-object p0

    .line 393
    invoke-interface {p1, v6, v1}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 394
    .line 395
    .line 396
    move-result-object p1

    .line 397
    new-instance v0, Ljava/util/ArrayList;

    .line 398
    .line 399
    invoke-static {p1, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 400
    .line 401
    .line 402
    move-result v1

    .line 403
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 404
    .line 405
    .line 406
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 407
    .line 408
    .line 409
    move-result-object p1

    .line 410
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 411
    .line 412
    .line 413
    move-result v1

    .line 414
    if-eqz v1, :cond_f

    .line 415
    .line 416
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v1

    .line 420
    check-cast v1, La/u54;

    .line 421
    .line 422
    invoke-static {v1}, La/cjx;->Y(La/u54;)La/ra4;

    .line 423
    .line 424
    .line 425
    move-result-object v1

    .line 426
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 427
    .line 428
    .line 429
    goto :goto_4

    .line 430
    :cond_f
    invoke-virtual {p0, v0}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 431
    .line 432
    .line 433
    sget-object p1, La/qa4;->a:La/qa4;

    .line 434
    .line 435
    invoke-virtual {p0, p1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    invoke-static {p0}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 439
    .line 440
    .line 441
    move-result-object p1

    .line 442
    :cond_10
    return-object p1

    .line 443
    :pswitch_d
    check-cast p1, Ljava/lang/Boolean;

    .line 444
    .line 445
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 446
    .line 447
    .line 448
    move-result p0

    .line 449
    xor-int/2addr p0, v5

    .line 450
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 451
    .line 452
    .line 453
    move-result-object p0

    .line 454
    return-object p0

    .line 455
    :pswitch_e
    move-object v0, p1

    .line 456
    check-cast v0, La/hcz;

    .line 457
    .line 458
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 459
    .line 460
    .line 461
    sget-object v4, La/s5x0;->a:La/ugd;

    .line 462
    .line 463
    const/4 v5, 0x6

    .line 464
    const/4 v1, 0x3

    .line 465
    const/4 v2, 0x0

    .line 466
    const/4 v3, 0x0

    .line 467
    invoke-static/range {v0 .. v5}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 468
    .line 469
    .line 470
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 471
    .line 472
    return-object p0

    .line 473
    :pswitch_f
    check-cast p1, La/m54;

    .line 474
    .line 475
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 476
    .line 477
    .line 478
    new-instance p0, La/kun;

    .line 479
    .line 480
    invoke-direct {p0, v0}, La/kun;-><init>(B)V

    .line 481
    .line 482
    .line 483
    return-object p0

    .line 484
    :pswitch_10
    check-cast p1, La/c53;

    .line 485
    .line 486
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    const/16 p0, 0x1f4

    .line 490
    .line 491
    invoke-static {p0, p0, v4, v1}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 492
    .line 493
    .line 494
    move-result-object p1

    .line 495
    const/4 v1, 0x0

    .line 496
    invoke-static {p1, v1, v0}, La/kzn;->d(La/cfq;FI)La/pzn;

    .line 497
    .line 498
    .line 499
    move-result-object p1

    .line 500
    const/4 v1, 0x6

    .line 501
    invoke-static {p0, v6, v4, v1}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 502
    .line 503
    .line 504
    move-result-object p0

    .line 505
    invoke-static {p0, v0}, La/kzn;->e(La/cfq;I)La/alo;

    .line 506
    .line 507
    .line 508
    move-result-object p0

    .line 509
    invoke-static {p1, p0}, La/ay3;->e0(La/pzn;La/alo;)La/lie;

    .line 510
    .line 511
    .line 512
    move-result-object p0

    .line 513
    return-object p0

    .line 514
    :pswitch_11
    check-cast p1, La/o0x;

    .line 515
    .line 516
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 517
    .line 518
    .line 519
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 520
    .line 521
    return-object p0

    .line 522
    :pswitch_12
    check-cast p1, La/lz3;

    .line 523
    .line 524
    return-object p1

    .line 525
    :pswitch_13
    check-cast p1, La/cp;

    .line 526
    .line 527
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 528
    .line 529
    .line 530
    new-instance p0, La/ok;

    .line 531
    .line 532
    invoke-direct {p0, p1, p1, v5}, La/ok;-><init>(La/cp;La/cp;B)V

    .line 533
    .line 534
    .line 535
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 536
    .line 537
    .line 538
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 539
    .line 540
    return-object p0

    .line 541
    :pswitch_14
    check-cast p1, Ljava/lang/Throwable;

    .line 542
    .line 543
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 544
    .line 545
    .line 546
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 547
    .line 548
    .line 549
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 550
    .line 551
    return-object p0

    .line 552
    :pswitch_15
    check-cast p1, Ljava/lang/Throwable;

    .line 553
    .line 554
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 555
    .line 556
    .line 557
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 558
    .line 559
    .line 560
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 561
    .line 562
    return-object p0

    .line 563
    :pswitch_16
    check-cast p1, Ljava/lang/Throwable;

    .line 564
    .line 565
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 566
    .line 567
    .line 568
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 569
    .line 570
    .line 571
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 572
    .line 573
    return-object p0

    .line 574
    :pswitch_17
    check-cast p1, Ljava/lang/Throwable;

    .line 575
    .line 576
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 577
    .line 578
    .line 579
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 580
    .line 581
    .line 582
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 583
    .line 584
    return-object p0

    .line 585
    :pswitch_18
    check-cast p1, Ljava/lang/Throwable;

    .line 586
    .line 587
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 588
    .line 589
    .line 590
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 591
    .line 592
    .line 593
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 594
    .line 595
    return-object p0

    .line 596
    :pswitch_19
    check-cast p1, Ljava/lang/Throwable;

    .line 597
    .line 598
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 599
    .line 600
    .line 601
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 602
    .line 603
    .line 604
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 605
    .line 606
    return-object p0

    .line 607
    :pswitch_1a
    check-cast p1, La/o1d0;

    .line 608
    .line 609
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 610
    .line 611
    .line 612
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 613
    .line 614
    .line 615
    move-result-object p0

    .line 616
    return-object p0

    .line 617
    :pswitch_1b
    check-cast p1, La/apv0;

    .line 618
    .line 619
    iget-object p0, p1, La/apv0;->c:Ljava/util/HashSet;

    .line 620
    .line 621
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 622
    .line 623
    .line 624
    move-result p1

    .line 625
    if-eqz p1, :cond_12

    .line 626
    .line 627
    :cond_11
    move v5, v6

    .line 628
    goto :goto_5

    .line 629
    :cond_12
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 630
    .line 631
    .line 632
    move-result-object p0

    .line 633
    :cond_13
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 634
    .line 635
    .line 636
    move-result p1

    .line 637
    if-eqz p1, :cond_11

    .line 638
    .line 639
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object p1

    .line 643
    check-cast p1, Ljava/lang/String;

    .line 644
    .line 645
    const-string v0, "theme_off_worker"

    .line 646
    .line 647
    const-string v1, "TaxStatusWorker"

    .line 648
    .line 649
    const-string v2, "FavoriteLocalNotificationWorker"

    .line 650
    .line 651
    const-string v3, "theme_on_worker"

    .line 652
    .line 653
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    move-result-object v0

    .line 657
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 662
    .line 663
    .line 664
    move-result p1

    .line 665
    if-eqz p1, :cond_13

    .line 666
    .line 667
    :goto_5
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 668
    .line 669
    .line 670
    move-result-object p0

    .line 671
    return-object p0

    .line 672
    :pswitch_1c
    check-cast p1, Landroid/content/res/Resources;

    .line 673
    .line 674
    sget p0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F1:I

    .line 675
    .line 676
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 677
    .line 678
    .line 679
    sget-object p0, La/s6t0;->a:La/pz40;

    .line 680
    .line 681
    invoke-static {}, La/s6t0;->c()Z

    .line 682
    .line 683
    .line 684
    move-result p0

    .line 685
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 686
    .line 687
    .line 688
    move-result-object p0

    .line 689
    return-object p0

    .line 690
    nop

    .line 691
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
