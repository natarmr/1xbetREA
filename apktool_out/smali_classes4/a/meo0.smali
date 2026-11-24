.class public final synthetic La/meo0;
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
    iput-byte p1, p0, La/meo0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/b430;)V
    .locals 0

    .line 1
    const/16 p1, 0xe

    iput-byte p1, p0, La/meo0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte p0, p0, La/meo0;->a:B

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x2

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    packed-switch p0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    sget-object p0, La/r6q0;->a:Ljava/lang/String;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 46
    .line 47
    .line 48
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_3
    check-cast p1, Ljava/lang/Throwable;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 57
    .line 58
    .line 59
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object p0

    .line 62
    :pswitch_4
    check-cast p1, Ljava/lang/Throwable;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 68
    .line 69
    .line 70
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_5
    check-cast p1, Ljava/lang/Throwable;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 79
    .line 80
    .line 81
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_6
    check-cast p1, La/cp;

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    new-instance p0, La/pgj0;

    .line 90
    .line 91
    const/16 v0, 0xe

    .line 92
    .line 93
    invoke-direct {p0, p1, p1, v0}, La/pgj0;-><init>(La/cp;La/cp;B)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 97
    .line 98
    .line 99
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 100
    .line 101
    return-object p0

    .line 102
    :pswitch_7
    check-cast p1, Ljava/lang/String;

    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-static {p1}, La/cy7;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0

    .line 112
    :pswitch_8
    check-cast p1, La/cp;

    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    new-instance p0, La/pgj0;

    .line 118
    .line 119
    const/16 v0, 0xd

    .line 120
    .line 121
    invoke-direct {p0, p1, p1, v0}, La/pgj0;-><init>(La/cp;La/cp;B)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 125
    .line 126
    .line 127
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 128
    .line 129
    return-object p0

    .line 130
    :pswitch_9
    check-cast p1, La/sjd;

    .line 131
    .line 132
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    new-instance p0, La/hbp0;

    .line 136
    .line 137
    invoke-direct {p0, p1}, La/hbp0;-><init>(La/sjd;)V

    .line 138
    .line 139
    .line 140
    return-object p0

    .line 141
    :pswitch_a
    check-cast p1, La/y4p0;

    .line 142
    .line 143
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    iget p0, p1, La/y4p0;->a:I

    .line 147
    .line 148
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    return-object p0

    .line 153
    :pswitch_b
    check-cast p1, La/s6p0;

    .line 154
    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-interface {p1}, La/s6p0;->getKey()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    return-object p0

    .line 163
    :pswitch_c
    check-cast p1, Ljava/lang/Throwable;

    .line 164
    .line 165
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 169
    .line 170
    .line 171
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 172
    .line 173
    return-object p0

    .line 174
    :pswitch_d
    check-cast p1, La/sjd;

    .line 175
    .line 176
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    new-instance p0, La/tzo0;

    .line 180
    .line 181
    invoke-direct {p0, p1}, La/tzo0;-><init>(La/sjd;)V

    .line 182
    .line 183
    .line 184
    return-object p0

    .line 185
    :pswitch_e
    check-cast p1, La/nzo0;

    .line 186
    .line 187
    if-eqz p1, :cond_0

    .line 188
    .line 189
    iget-object p0, p1, La/nzo0;->c:La/v5l0;

    .line 190
    .line 191
    goto :goto_0

    .line 192
    :cond_0
    sget-object p0, La/yzo0;->a:La/v5l0;

    .line 193
    .line 194
    :goto_0
    if-eqz p1, :cond_1

    .line 195
    .line 196
    iget-boolean p1, p1, La/nzo0;->f:Z

    .line 197
    .line 198
    goto :goto_1

    .line 199
    :cond_1
    move p1, v2

    .line 200
    :goto_1
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    new-instance v5, La/l0p0;

    .line 205
    .line 206
    new-instance v6, La/ijm;

    .line 207
    .line 208
    invoke-direct {v6}, La/ijm;-><init>()V

    .line 209
    .line 210
    .line 211
    const-string v7, "TEAM_BET_NEAREST_HEADER"

    .line 212
    .line 213
    invoke-direct {v5, v7, v6}, La/l0p0;-><init>(Ljava/lang/String;La/jjm;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v4, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    new-instance v5, La/b1p0;

    .line 220
    .line 221
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 222
    .line 223
    .line 224
    move-result v6

    .line 225
    const/4 v7, 0x3

    .line 226
    const/4 v8, 0x4

    .line 227
    if-eqz v6, :cond_6

    .line 228
    .line 229
    if-eq v6, v0, :cond_5

    .line 230
    .line 231
    if-eq v6, v1, :cond_4

    .line 232
    .line 233
    if-eq v6, v7, :cond_3

    .line 234
    .line 235
    if-ne v6, v8, :cond_2

    .line 236
    .line 237
    new-instance v6, La/bga;

    .line 238
    .line 239
    invoke-direct {v6}, La/bga;-><init>()V

    .line 240
    .line 241
    .line 242
    goto :goto_2

    .line 243
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 244
    .line 245
    .line 246
    goto/16 :goto_5

    .line 247
    .line 248
    :cond_3
    new-instance v6, La/cga;

    .line 249
    .line 250
    invoke-direct {v6}, La/cga;-><init>()V

    .line 251
    .line 252
    .line 253
    goto :goto_2

    .line 254
    :cond_4
    new-instance v6, La/dga;

    .line 255
    .line 256
    invoke-direct {v6}, La/dga;-><init>()V

    .line 257
    .line 258
    .line 259
    goto :goto_2

    .line 260
    :cond_5
    new-instance v6, La/ega;

    .line 261
    .line 262
    invoke-direct {v6}, La/ega;-><init>()V

    .line 263
    .line 264
    .line 265
    goto :goto_2

    .line 266
    :cond_6
    new-instance v6, La/aga;

    .line 267
    .line 268
    invoke-direct {v6}, La/aga;-><init>()V

    .line 269
    .line 270
    .line 271
    :goto_2
    invoke-direct {v5, v6, p1}, La/b1p0;-><init>(La/gga;Z)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v4, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    new-instance v5, La/l0p0;

    .line 278
    .line 279
    new-instance v6, La/ijm;

    .line 280
    .line 281
    invoke-direct {v6}, La/ijm;-><init>()V

    .line 282
    .line 283
    .line 284
    const-string v9, "TEAM_BET_UPCOMING_HEADER"

    .line 285
    .line 286
    invoke-direct {v5, v9, v6}, La/l0p0;-><init>(Ljava/lang/String;La/jjm;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v4, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    :goto_3
    if-ge v2, v8, :cond_c

    .line 293
    .line 294
    new-instance v5, La/qyo0;

    .line 295
    .line 296
    new-instance v6, La/x56;

    .line 297
    .line 298
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 299
    .line 300
    .line 301
    move-result v9

    .line 302
    if-eqz v9, :cond_b

    .line 303
    .line 304
    if-eq v9, v0, :cond_a

    .line 305
    .line 306
    if-eq v9, v1, :cond_9

    .line 307
    .line 308
    if-eq v9, v7, :cond_8

    .line 309
    .line 310
    if-ne v9, v8, :cond_7

    .line 311
    .line 312
    sget-object v9, La/h0l0;->a:La/h0l0;

    .line 313
    .line 314
    goto :goto_4

    .line 315
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 316
    .line 317
    .line 318
    goto :goto_5

    .line 319
    :cond_8
    sget-object v9, La/i0l0;->a:La/i0l0;

    .line 320
    .line 321
    goto :goto_4

    .line 322
    :cond_9
    sget-object v9, La/j0l0;->a:La/j0l0;

    .line 323
    .line 324
    goto :goto_4

    .line 325
    :cond_a
    sget-object v9, La/k0l0;->a:La/k0l0;

    .line 326
    .line 327
    goto :goto_4

    .line 328
    :cond_b
    sget-object v9, La/g0l0;->a:La/g0l0;

    .line 329
    .line 330
    :goto_4
    invoke-direct {v6, v9}, La/x56;-><init>(La/l0l0;)V

    .line 331
    .line 332
    .line 333
    invoke-direct {v5, v6, p1}, La/qyo0;-><init>(La/a2n;Z)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v4, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    add-int/lit8 v2, v2, 0x1

    .line 340
    .line 341
    goto :goto_3

    .line 342
    :cond_c
    invoke-static {v4}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 343
    .line 344
    .line 345
    move-result-object p0

    .line 346
    invoke-static {p0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 347
    .line 348
    .line 349
    move-result-object v3

    .line 350
    :goto_5
    return-object v3

    .line 351
    :pswitch_f
    check-cast p1, La/p6t0;

    .line 352
    .line 353
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 357
    .line 358
    .line 359
    move-result-object p0

    .line 360
    sget-object p1, La/sre0;->a:La/tre0;

    .line 361
    .line 362
    invoke-virtual {p1, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 363
    .line 364
    .line 365
    move-result-object p0

    .line 366
    return-object p0

    .line 367
    :pswitch_10
    check-cast p1, La/p6t0;

    .line 368
    .line 369
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    invoke-interface {p1}, La/p6t0;->getKey()Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object p0

    .line 376
    return-object p0

    .line 377
    :pswitch_11
    check-cast p1, La/kyo0;

    .line 378
    .line 379
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    new-instance v3, La/q6n;

    .line 383
    .line 384
    iget-object v4, p1, La/kyo0;->b:Ljava/lang/String;

    .line 385
    .line 386
    new-instance v5, La/c280;

    .line 387
    .line 388
    iget-object p0, p1, La/kyo0;->c:Ljava/lang/String;

    .line 389
    .line 390
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 391
    .line 392
    .line 393
    sget-object v6, La/ujn;->h:Ljava/lang/String;

    .line 394
    .line 395
    invoke-static {p0, v6, v2}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 396
    .line 397
    .line 398
    move-result v2

    .line 399
    const-string v6, ""

    .line 400
    .line 401
    if-eqz v2, :cond_d

    .line 402
    .line 403
    goto :goto_8

    .line 404
    :cond_d
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 405
    .line 406
    .line 407
    move-result v2

    .line 408
    if-nez v2, :cond_e

    .line 409
    .line 410
    goto :goto_6

    .line 411
    :cond_e
    sget-object v2, La/u0d;->a:Ljava/util/List;

    .line 412
    .line 413
    invoke-static {p0}, La/u0d;->c(Ljava/lang/String;)Z

    .line 414
    .line 415
    .line 416
    move-result v2

    .line 417
    if-eqz v2, :cond_f

    .line 418
    .line 419
    :goto_6
    move-object p0, v6

    .line 420
    goto :goto_8

    .line 421
    :cond_f
    const-string v2, "playerlogo/"

    .line 422
    .line 423
    invoke-static {p0, v2, v0}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 424
    .line 425
    .line 426
    move-result v0

    .line 427
    if-eqz v0, :cond_10

    .line 428
    .line 429
    const-string v0, "%s/%s"

    .line 430
    .line 431
    goto :goto_7

    .line 432
    :cond_10
    const-string v0, "%s/playerlogo/%s"

    .line 433
    .line 434
    :goto_7
    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 435
    .line 436
    sget-object v7, La/ujn;->h:Ljava/lang/String;

    .line 437
    .line 438
    filled-new-array {v7, p0}, [Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object p0

    .line 442
    invoke-static {p0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object p0

    .line 446
    invoke-static {v2, v0, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object p0

    .line 450
    :goto_8
    const v0, 0x7f0809ae

    .line 451
    .line 452
    .line 453
    invoke-direct {v5, p0, v0}, La/c280;-><init>(Ljava/lang/String;I)V

    .line 454
    .line 455
    .line 456
    move-object p0, v6

    .line 457
    new-instance v6, La/n0x;

    .line 458
    .line 459
    iget-wide v0, p1, La/kyo0;->d:J

    .line 460
    .line 461
    const-wide/16 v7, 0x0

    .line 462
    .line 463
    cmp-long v2, v0, v7

    .line 464
    .line 465
    if-eqz v2, :cond_11

    .line 466
    .line 467
    const-string p0, "TeamBet"

    .line 468
    .line 469
    const-string v2, "sportIcon3d"

    .line 470
    .line 471
    const-string v7, "static"

    .line 472
    .line 473
    const-string v8, "img"

    .line 474
    .line 475
    invoke-static {v7, v8, p0, v2}, La/rz4;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)La/bzu;

    .line 476
    .line 477
    .line 478
    move-result-object p0

    .line 479
    const-string v2, ".png"

    .line 480
    .line 481
    invoke-static {v0, v1, v2, p0}, La/rz4;->s(JLjava/lang/String;La/bzu;)V

    .line 482
    .line 483
    .line 484
    iget-object p0, p0, La/bzu;->b:Ljava/lang/Object;

    .line 485
    .line 486
    check-cast p0, Ljava/lang/StringBuilder;

    .line 487
    .line 488
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object p0

    .line 492
    :cond_11
    invoke-direct {v6, p0}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 493
    .line 494
    .line 495
    iget-boolean v7, p1, La/kyo0;->g:Z

    .line 496
    .line 497
    iget-boolean v8, p1, La/kyo0;->f:Z

    .line 498
    .line 499
    invoke-direct/range {v3 .. v8}, La/q6n;-><init>(Ljava/lang/String;La/c280;La/n0x;ZZ)V

    .line 500
    .line 501
    .line 502
    return-object v3

    .line 503
    :pswitch_12
    check-cast p1, La/uag0;

    .line 504
    .line 505
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 506
    .line 507
    .line 508
    const/16 p0, 0x1c

    .line 509
    .line 510
    invoke-virtual {p1, p0}, La/uag0;->e(I)V

    .line 511
    .line 512
    .line 513
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 514
    .line 515
    return-object p0

    .line 516
    :pswitch_13
    check-cast p1, Ljava/lang/Float;

    .line 517
    .line 518
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 519
    .line 520
    .line 521
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 522
    .line 523
    return-object p0

    .line 524
    :pswitch_14
    check-cast p1, La/o8w;

    .line 525
    .line 526
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 527
    .line 528
    .line 529
    invoke-interface {p1}, La/o8w;->getKey()Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object p0

    .line 533
    return-object p0

    .line 534
    :pswitch_15
    check-cast p1, La/abi0;

    .line 535
    .line 536
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 537
    .line 538
    .line 539
    new-instance p0, La/m0x;

    .line 540
    .line 541
    const v0, 0x7f080c22

    .line 542
    .line 543
    .line 544
    const/4 v1, 0x6

    .line 545
    invoke-direct {p0, v0, v3, v1}, La/m0x;-><init>(ILa/bzw;I)V

    .line 546
    .line 547
    .line 548
    invoke-static {p1, p0}, La/cbi0;->b(La/abi0;La/o0x;)V

    .line 549
    .line 550
    .line 551
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 552
    .line 553
    return-object p0

    .line 554
    :pswitch_16
    check-cast p1, La/ou90;

    .line 555
    .line 556
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 557
    .line 558
    .line 559
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 560
    .line 561
    return-object p0

    .line 562
    :pswitch_17
    check-cast p1, La/n1g;

    .line 563
    .line 564
    new-instance p0, La/rq2;

    .line 565
    .line 566
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 567
    .line 568
    .line 569
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 570
    .line 571
    .line 572
    iput-object p0, p1, La/n1g;->e:La/ms2;

    .line 573
    .line 574
    sget-object p0, La/l1g;->b:La/l1g;

    .line 575
    .line 576
    iput-object p0, p1, La/n1g;->f:La/l1g;

    .line 577
    .line 578
    sget-object p0, La/k1g;->b:La/k1g;

    .line 579
    .line 580
    iput-object p0, p1, La/n1g;->g:La/k1g;

    .line 581
    .line 582
    sget-object p0, La/j1g;->c:La/j1g;

    .line 583
    .line 584
    iput-object p0, p1, La/n1g;->d:La/j1g;

    .line 585
    .line 586
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 587
    .line 588
    return-object p0

    .line 589
    :pswitch_18
    check-cast p1, La/n1g;

    .line 590
    .line 591
    new-instance p0, La/rq2;

    .line 592
    .line 593
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 594
    .line 595
    .line 596
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 597
    .line 598
    .line 599
    iput-object p0, p1, La/n1g;->e:La/ms2;

    .line 600
    .line 601
    sget-object p0, La/l1g;->b:La/l1g;

    .line 602
    .line 603
    iput-object p0, p1, La/n1g;->f:La/l1g;

    .line 604
    .line 605
    sget-object p0, La/k1g;->b:La/k1g;

    .line 606
    .line 607
    iput-object p0, p1, La/n1g;->g:La/k1g;

    .line 608
    .line 609
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 610
    .line 611
    return-object p0

    .line 612
    :pswitch_19
    check-cast p1, Ljava/util/List;

    .line 613
    .line 614
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 615
    .line 616
    .line 617
    new-instance p0, Ljava/util/ArrayList;

    .line 618
    .line 619
    const/16 v0, 0xa

    .line 620
    .line 621
    invoke-static {p1, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 622
    .line 623
    .line 624
    move-result v0

    .line 625
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 626
    .line 627
    .line 628
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 629
    .line 630
    .line 631
    move-result-object p1

    .line 632
    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 633
    .line 634
    .line 635
    move-result v0

    .line 636
    if-eqz v0, :cond_12

    .line 637
    .line 638
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 639
    .line 640
    .line 641
    move-result-object v0

    .line 642
    check-cast v0, La/w8r0;

    .line 643
    .line 644
    new-instance v1, La/ceo0;

    .line 645
    .line 646
    iget v2, v0, La/w8r0;->a:I

    .line 647
    .line 648
    iget-object v0, v0, La/w8r0;->b:Ljava/lang/String;

    .line 649
    .line 650
    invoke-direct {v1, v2, v0}, La/ceo0;-><init>(ILjava/lang/String;)V

    .line 651
    .line 652
    .line 653
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 654
    .line 655
    .line 656
    goto :goto_9

    .line 657
    :cond_12
    invoke-static {p0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 658
    .line 659
    .line 660
    move-result-object p0

    .line 661
    return-object p0

    .line 662
    :pswitch_1a
    check-cast p1, La/deo0;

    .line 663
    .line 664
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 665
    .line 666
    .line 667
    iget-object p0, p1, La/deo0;->a:Ljava/lang/String;

    .line 668
    .line 669
    return-object p0

    .line 670
    :pswitch_1b
    check-cast p1, La/deo0;

    .line 671
    .line 672
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 673
    .line 674
    .line 675
    iget-object p0, p1, La/deo0;->a:Ljava/lang/String;

    .line 676
    .line 677
    return-object p0

    .line 678
    :pswitch_1c
    move-object v0, p1

    .line 679
    check-cast v0, La/fhl;

    .line 680
    .line 681
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 682
    .line 683
    .line 684
    sget-object p0, La/s6t0;->a:La/pz40;

    .line 685
    .line 686
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 687
    .line 688
    .line 689
    move-result-object p0

    .line 690
    iget-object p0, p0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 691
    .line 692
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundGroup-0d7_KjU()J

    .line 693
    .line 694
    .line 695
    move-result-wide v1

    .line 696
    const/4 v10, 0x0

    .line 697
    const/16 v11, 0x7e

    .line 698
    .line 699
    const-wide/16 v3, 0x0

    .line 700
    .line 701
    const-wide/16 v5, 0x0

    .line 702
    .line 703
    const/4 v7, 0x0

    .line 704
    const/4 v8, 0x0

    .line 705
    const/4 v9, 0x0

    .line 706
    invoke-static/range {v0 .. v11}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 707
    .line 708
    .line 709
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 710
    .line 711
    return-object p0

    .line 712
    nop

    .line 713
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
