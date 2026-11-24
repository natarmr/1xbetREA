.class public final La/kj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kmq;

.field public final synthetic c:La/wj;


# direct methods
.method public synthetic constructor <init>(La/kmq;La/wj;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/kj;->a:B

    iput-object p1, p0, La/kj;->b:La/kmq;

    iput-object p2, p0, La/kj;->c:La/wj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/kj;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/kj;->c:La/wj;

    .line 4
    .line 5
    iget-object v2, p0, La/kj;->b:La/kmq;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/high16 v5, -0x80000000

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    instance-of v0, p2, La/tj;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    move-object v0, p2

    .line 21
    check-cast v0, La/tj;

    .line 22
    .line 23
    iget v7, v0, La/tj;->j:I

    .line 24
    .line 25
    and-int v8, v7, v5

    .line 26
    .line 27
    if-eqz v8, :cond_0

    .line 28
    .line 29
    sub-int/2addr v7, v5

    .line 30
    iput v7, v0, La/tj;->j:I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance v0, La/tj;

    .line 34
    .line 35
    invoke-direct {v0, p0, p2}, La/tj;-><init>(La/kj;La/yje;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-object p0, v0, La/tj;->i:Ljava/lang/Object;

    .line 39
    .line 40
    sget-object p2, La/wne;->a:La/wne;

    .line 41
    .line 42
    iget v5, v0, La/tj;->j:I

    .line 43
    .line 44
    if-eqz v5, :cond_2

    .line 45
    .line 46
    if-ne v5, v6, :cond_1

    .line 47
    .line 48
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    check-cast p1, Ljava/util/List;

    .line 60
    .line 61
    iget-object p0, v1, La/wj;->b:Lorg/xplatform/sportgame/action_menu/api/ActionMenuDialogParams;

    .line 62
    .line 63
    iget-wide v3, p0, Lorg/xplatform/sportgame/action_menu/api/ActionMenuDialogParams;->d:J

    .line 64
    .line 65
    new-instance p0, Ljava/lang/Long;

    .line 66
    .line 67
    invoke-direct {p0, v3, v4}, Ljava/lang/Long;-><init>(J)V

    .line 68
    .line 69
    .line 70
    invoke-interface {p1, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    iput v6, v0, La/tj;->j:I

    .line 79
    .line 80
    invoke-interface {v2, p0, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    if-ne p0, p2, :cond_3

    .line 85
    .line 86
    move-object v3, p2

    .line 87
    goto :goto_2

    .line 88
    :cond_3
    :goto_1
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    :goto_2
    return-object v3

    .line 91
    :pswitch_0
    instance-of v0, p2, La/jj;

    .line 92
    .line 93
    if-eqz v0, :cond_4

    .line 94
    .line 95
    move-object v0, p2

    .line 96
    check-cast v0, La/jj;

    .line 97
    .line 98
    iget v7, v0, La/jj;->j:I

    .line 99
    .line 100
    and-int v8, v7, v5

    .line 101
    .line 102
    if-eqz v8, :cond_4

    .line 103
    .line 104
    sub-int/2addr v7, v5

    .line 105
    iput v7, v0, La/jj;->j:I

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_4
    new-instance v0, La/jj;

    .line 109
    .line 110
    invoke-direct {v0, p0, p2}, La/jj;-><init>(La/kj;La/yje;)V

    .line 111
    .line 112
    .line 113
    :goto_3
    iget-object p0, v0, La/jj;->i:Ljava/lang/Object;

    .line 114
    .line 115
    sget-object p2, La/wne;->a:La/wne;

    .line 116
    .line 117
    iget v5, v0, La/jj;->j:I

    .line 118
    .line 119
    if-eqz v5, :cond_6

    .line 120
    .line 121
    if-ne v5, v6, :cond_5

    .line 122
    .line 123
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    goto/16 :goto_c

    .line 127
    .line 128
    :cond_5
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    goto/16 :goto_d

    .line 132
    .line 133
    :cond_6
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    check-cast p1, La/yi;

    .line 137
    .line 138
    iget-boolean p0, v1, La/wj;->v:Z

    .line 139
    .line 140
    iget-object v1, v1, La/wj;->o:La/ctf0;

    .line 141
    .line 142
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    new-instance v3, Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 151
    .line 152
    .line 153
    iget-boolean v4, p1, La/yi;->a:Z

    .line 154
    .line 155
    const/4 v5, 0x0

    .line 156
    if-eqz v4, :cond_7

    .line 157
    .line 158
    new-instance v4, La/mk;

    .line 159
    .line 160
    new-array v7, v5, [Ljava/lang/Object;

    .line 161
    .line 162
    iget-object v8, v1, La/ctf0;->b:La/lsm0;

    .line 163
    .line 164
    invoke-static {v7, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v7

    .line 168
    const v9, 0x7f131388

    .line 169
    .line 170
    .line 171
    invoke-virtual {v8, v9, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    invoke-direct {v4, v7}, La/mk;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    :cond_7
    iget-boolean v4, p1, La/yi;->o:Z

    .line 182
    .line 183
    new-instance v7, La/bk;

    .line 184
    .line 185
    if-eqz v4, :cond_8

    .line 186
    .line 187
    const v4, 0x7f0809f7

    .line 188
    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_8
    const v4, 0x7f0809f8

    .line 192
    .line 193
    .line 194
    :goto_4
    new-array v8, v5, [Ljava/lang/Object;

    .line 195
    .line 196
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 197
    .line 198
    invoke-static {v8, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v8

    .line 202
    const v9, 0x7f130a68

    .line 203
    .line 204
    .line 205
    invoke-virtual {v1, v9, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v8

    .line 209
    invoke-direct {v7, v4, v8}, La/bk;-><init>(ILjava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    iget-boolean v4, p1, La/yi;->b:Z

    .line 216
    .line 217
    if-eqz v4, :cond_a

    .line 218
    .line 219
    iget-boolean v4, p1, La/yi;->c:Z

    .line 220
    .line 221
    new-instance v7, La/lk;

    .line 222
    .line 223
    if-eqz v4, :cond_9

    .line 224
    .line 225
    const v4, 0x7f080607

    .line 226
    .line 227
    .line 228
    goto :goto_5

    .line 229
    :cond_9
    const v4, 0x7f080bcf

    .line 230
    .line 231
    .line 232
    :goto_5
    new-array v8, v5, [Ljava/lang/Object;

    .line 233
    .line 234
    invoke-static {v8, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v8

    .line 238
    const v9, 0x7f130ca3

    .line 239
    .line 240
    .line 241
    invoke-virtual {v1, v9, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v8

    .line 245
    invoke-direct {v7, v4, v8}, La/lk;-><init>(ILjava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    :cond_a
    new-instance v4, La/fk;

    .line 252
    .line 253
    new-array v7, v5, [Ljava/lang/Object;

    .line 254
    .line 255
    invoke-static {v7, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v7

    .line 259
    const v8, 0x7f130418

    .line 260
    .line 261
    .line 262
    invoke-virtual {v1, v8, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v7

    .line 266
    invoke-direct {v4, v7}, La/fk;-><init>(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    iget-boolean v4, p1, La/yi;->d:Z

    .line 273
    .line 274
    if-eqz v4, :cond_11

    .line 275
    .line 276
    iget-object v4, p1, La/yi;->m:La/px7;

    .line 277
    .line 278
    sget-object v7, La/kx7;->a:La/kx7;

    .line 279
    .line 280
    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v7

    .line 284
    const v8, 0x7f080605

    .line 285
    .line 286
    .line 287
    const v9, 0x7f080606

    .line 288
    .line 289
    .line 290
    if-eqz v7, :cond_d

    .line 291
    .line 292
    iget-boolean v4, p1, La/yi;->f:Z

    .line 293
    .line 294
    new-instance v7, La/ck;

    .line 295
    .line 296
    if-eqz v4, :cond_b

    .line 297
    .line 298
    move v8, v9

    .line 299
    :cond_b
    if-eqz v4, :cond_c

    .line 300
    .line 301
    new-array v4, v5, [Ljava/lang/Object;

    .line 302
    .line 303
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v4

    .line 307
    const v9, 0x7f130832

    .line 308
    .line 309
    .line 310
    invoke-virtual {v1, v9, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v4

    .line 314
    goto :goto_6

    .line 315
    :cond_c
    new-array v4, v5, [Ljava/lang/Object;

    .line 316
    .line 317
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v4

    .line 321
    const v9, 0x7f1304a1

    .line 322
    .line 323
    .line 324
    invoke-virtual {v1, v9, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v4

    .line 328
    :goto_6
    invoke-direct {v7, v8, v4}, La/ck;-><init>(ILjava/lang/String;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    goto :goto_8

    .line 335
    :cond_d
    sget-object v7, La/ox7;->a:La/ox7;

    .line 336
    .line 337
    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move-result v7

    .line 341
    if-nez v7, :cond_e

    .line 342
    .line 343
    sget-object v7, La/mx7;->a:La/mx7;

    .line 344
    .line 345
    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result v4

    .line 349
    if-eqz v4, :cond_11

    .line 350
    .line 351
    :cond_e
    iget-boolean v4, p1, La/yi;->e:Z

    .line 352
    .line 353
    new-instance v7, La/ck;

    .line 354
    .line 355
    if-eqz v4, :cond_f

    .line 356
    .line 357
    move v8, v9

    .line 358
    :cond_f
    if-eqz v4, :cond_10

    .line 359
    .line 360
    new-array v4, v5, [Ljava/lang/Object;

    .line 361
    .line 362
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v4

    .line 366
    const v9, 0x7f130831

    .line 367
    .line 368
    .line 369
    invoke-virtual {v1, v9, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v4

    .line 373
    goto :goto_7

    .line 374
    :cond_10
    new-array v4, v5, [Ljava/lang/Object;

    .line 375
    .line 376
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v4

    .line 380
    const v9, 0x7f1304a0

    .line 381
    .line 382
    .line 383
    invoke-virtual {v1, v9, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v4

    .line 387
    :goto_7
    invoke-direct {v7, v8, v4}, La/ck;-><init>(ILjava/lang/String;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    :cond_11
    :goto_8
    iget-boolean v4, p1, La/yi;->g:Z

    .line 394
    .line 395
    if-eqz v4, :cond_14

    .line 396
    .line 397
    if-nez p0, :cond_14

    .line 398
    .line 399
    iget-boolean v4, p1, La/yi;->h:Z

    .line 400
    .line 401
    new-instance v7, La/dk;

    .line 402
    .line 403
    if-eqz v4, :cond_12

    .line 404
    .line 405
    const v8, 0x7f080c32

    .line 406
    .line 407
    .line 408
    goto :goto_9

    .line 409
    :cond_12
    const v8, 0x7f080c35

    .line 410
    .line 411
    .line 412
    :goto_9
    if-eqz v4, :cond_13

    .line 413
    .line 414
    const v4, 0x7f13086d

    .line 415
    .line 416
    .line 417
    goto :goto_a

    .line 418
    :cond_13
    const v4, 0x7f130868

    .line 419
    .line 420
    .line 421
    :goto_a
    new-array v9, v5, [Ljava/lang/Object;

    .line 422
    .line 423
    invoke-static {v9, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v9

    .line 427
    invoke-virtual {v1, v4, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v4

    .line 431
    invoke-direct {v7, v8, v4}, La/dk;-><init>(ILjava/lang/String;)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    :cond_14
    iget-boolean v4, p1, La/yi;->i:Z

    .line 438
    .line 439
    if-eqz v4, :cond_16

    .line 440
    .line 441
    if-nez p0, :cond_16

    .line 442
    .line 443
    iget-boolean p0, p1, La/yi;->j:Z

    .line 444
    .line 445
    new-instance v4, La/kk;

    .line 446
    .line 447
    if-eqz p0, :cond_15

    .line 448
    .line 449
    const p0, 0x7f080af9

    .line 450
    .line 451
    .line 452
    goto :goto_b

    .line 453
    :cond_15
    const p0, 0x7f080af8

    .line 454
    .line 455
    .line 456
    :goto_b
    new-array v7, v5, [Ljava/lang/Object;

    .line 457
    .line 458
    invoke-static {v7, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v7

    .line 462
    const v8, 0x7f131409

    .line 463
    .line 464
    .line 465
    invoke-virtual {v1, v8, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v7

    .line 469
    invoke-direct {v4, p0, v7}, La/kk;-><init>(ILjava/lang/String;)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 473
    .line 474
    .line 475
    :cond_16
    iget-boolean p0, p1, La/yi;->k:Z

    .line 476
    .line 477
    if-eqz p0, :cond_17

    .line 478
    .line 479
    new-instance p0, La/ek;

    .line 480
    .line 481
    new-array v4, v5, [Ljava/lang/Object;

    .line 482
    .line 483
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v4

    .line 487
    const v7, 0x7f130ca2

    .line 488
    .line 489
    .line 490
    invoke-virtual {v1, v7, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v4

    .line 494
    invoke-direct {p0, v4}, La/ek;-><init>(Ljava/lang/String;)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 498
    .line 499
    .line 500
    :cond_17
    iget-boolean p0, p1, La/yi;->l:Z

    .line 501
    .line 502
    if-eqz p0, :cond_18

    .line 503
    .line 504
    new-instance p0, La/jk;

    .line 505
    .line 506
    new-array v4, v5, [Ljava/lang/Object;

    .line 507
    .line 508
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v4

    .line 512
    const v7, 0x7f130faf

    .line 513
    .line 514
    .line 515
    invoke-virtual {v1, v7, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v4

    .line 519
    invoke-direct {p0, v4}, La/jk;-><init>(Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 523
    .line 524
    .line 525
    :cond_18
    iget-boolean p0, p1, La/yi;->n:Z

    .line 526
    .line 527
    if-eqz p0, :cond_19

    .line 528
    .line 529
    new-instance p0, La/ak;

    .line 530
    .line 531
    new-array p1, v5, [Ljava/lang/Object;

    .line 532
    .line 533
    invoke-static {p1, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object p1

    .line 537
    const v4, 0x7f130290

    .line 538
    .line 539
    .line 540
    invoke-virtual {v1, v4, p1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object p1

    .line 544
    invoke-direct {p0, p1}, La/ak;-><init>(Ljava/lang/String;)V

    .line 545
    .line 546
    .line 547
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 548
    .line 549
    .line 550
    :cond_19
    iput v6, v0, La/jj;->j:I

    .line 551
    .line 552
    invoke-interface {v2, v3, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object p0

    .line 556
    if-ne p0, p2, :cond_1a

    .line 557
    .line 558
    move-object v3, p2

    .line 559
    goto :goto_d

    .line 560
    :cond_1a
    :goto_c
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 561
    .line 562
    :goto_d
    return-object v3

    .line 563
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
