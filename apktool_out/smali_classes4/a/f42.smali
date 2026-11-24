.class public final La/f42;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/f42;->a:B

    iput-object p1, p0, La/f42;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/f42;->a:B

    .line 2
    .line 3
    sget-object v1, La/e7z;->u1:La/pcy;

    .line 4
    .line 5
    sget-object v2, La/jm40;->b:La/jm40;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    iget-object p0, p0, La/f42;->b:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object v0, p1

    .line 16
    check-cast v0, Ljava/lang/Throwable;

    .line 17
    .line 18
    move-object/from16 v1, p2

    .line 19
    .line 20
    check-cast v1, Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    check-cast p0, La/xgt0;

    .line 29
    .line 30
    sget v1, La/xgt0;->w:I

    .line 31
    .line 32
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 33
    .line 34
    iget-object p0, p0, La/i3t0;->i:La/ocj;

    .line 35
    .line 36
    instance-of v0, v0, La/ff5;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 41
    .line 42
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-object v2, p0

    .line 50
    check-cast v2, La/sgt0;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    sget-object v2, La/iun;->a:La/iun;

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    new-instance v3, La/sgt0;

    .line 61
    .line 62
    invoke-direct {v3, v2, v5, v5}, La/sgt0;-><init>(Ljava/util/List;ZZ)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, p0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-eqz p0, :cond_0

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 73
    .line 74
    :cond_2
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-object v2, p0

    .line 82
    check-cast v2, La/sgt0;

    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-static {v2, v5, v4}, La/sgt0;->a(La/sgt0;ZZ)La/sgt0;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v0, p0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    if-eqz p0, :cond_2

    .line 96
    .line 97
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    return-object p0

    .line 100
    :pswitch_0
    move-object v0, p1

    .line 101
    check-cast v0, Ljava/lang/Throwable;

    .line 102
    .line 103
    move-object/from16 v1, p2

    .line 104
    .line 105
    check-cast v1, Ljava/lang/String;

    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    move-object v0, p0

    .line 114
    check-cast v0, La/zjs0;

    .line 115
    .line 116
    sget p0, La/zjs0;->t:I

    .line 117
    .line 118
    iget-object p0, v0, La/i3t0;->i:La/ocj;

    .line 119
    .line 120
    iget-object v1, p0, La/ocj;->a:La/p7m0;

    .line 121
    .line 122
    :cond_3
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    iget-object v2, v0, La/i3t0;->f:La/oyg0;

    .line 130
    .line 131
    move-object v3, p0

    .line 132
    check-cast v3, La/tjs0;

    .line 133
    .line 134
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    invoke-static {v3, v5, v4}, La/tjs0;->a(La/tjs0;ZZ)La/tjs0;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-virtual {v1, p0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result p0

    .line 145
    if-eqz p0, :cond_3

    .line 146
    .line 147
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    return-object p0

    .line 150
    :pswitch_1
    move-object v0, p1

    .line 151
    check-cast v0, La/fet;

    .line 152
    .line 153
    move-object/from16 v1, p2

    .line 154
    .line 155
    check-cast v1, Ljava/lang/Number;

    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    and-int/lit8 v2, v1, 0x3

    .line 162
    .line 163
    if-eq v2, v3, :cond_4

    .line 164
    .line 165
    move v2, v4

    .line 166
    goto :goto_1

    .line 167
    :cond_4
    move v2, v5

    .line 168
    :goto_1
    and-int/2addr v1, v4

    .line 169
    invoke-virtual {v0, v1, v2}, La/fet;->U(IZ)Z

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    if-eqz v1, :cond_5

    .line 174
    .line 175
    check-cast p0, La/bkg0;

    .line 176
    .line 177
    iget-object v1, p0, La/bkg0;->a:Ljava/lang/String;

    .line 178
    .line 179
    iget-object p0, p0, La/bkg0;->b:La/a4x;

    .line 180
    .line 181
    invoke-static {v1, p0, v0, v5}, La/j120;->y(Ljava/lang/String;La/a4x;La/fet;I)V

    .line 182
    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_5
    invoke-virtual {v0}, La/fet;->X()V

    .line 186
    .line 187
    .line 188
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 189
    .line 190
    return-object p0

    .line 191
    :pswitch_2
    move-object v0, p1

    .line 192
    check-cast v0, Ljava/lang/Throwable;

    .line 193
    .line 194
    move-object/from16 v1, p2

    .line 195
    .line 196
    check-cast v1, Ljava/lang/String;

    .line 197
    .line 198
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    instance-of v0, v0, La/ff5;

    .line 205
    .line 206
    check-cast p0, La/kje0;

    .line 207
    .line 208
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 209
    .line 210
    iget-object p0, p0, La/i3t0;->i:La/ocj;

    .line 211
    .line 212
    if-eqz v0, :cond_7

    .line 213
    .line 214
    sget v0, La/kje0;->u:I

    .line 215
    .line 216
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 217
    .line 218
    :cond_6
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    move-object v2, p0

    .line 226
    check-cast v2, La/dje0;

    .line 227
    .line 228
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    sget-object v2, La/iun;->a:La/iun;

    .line 232
    .line 233
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    new-instance v3, La/dje0;

    .line 237
    .line 238
    invoke-direct {v3, v2, v5, v5}, La/dje0;-><init>(Ljava/util/List;ZZ)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0, p0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result p0

    .line 245
    if-eqz p0, :cond_6

    .line 246
    .line 247
    goto :goto_3

    .line 248
    :cond_7
    sget v0, La/kje0;->u:I

    .line 249
    .line 250
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 251
    .line 252
    :cond_8
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    move-object v2, p0

    .line 260
    check-cast v2, La/dje0;

    .line 261
    .line 262
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    invoke-static {v2, v5, v4}, La/dje0;->a(La/dje0;ZZ)La/dje0;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    invoke-virtual {v0, p0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result p0

    .line 273
    if-eqz p0, :cond_8

    .line 274
    .line 275
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 276
    .line 277
    return-object p0

    .line 278
    :pswitch_3
    move-object v0, p1

    .line 279
    check-cast v0, Ljava/lang/Throwable;

    .line 280
    .line 281
    move-object/from16 v1, p2

    .line 282
    .line 283
    check-cast v1, Ljava/lang/String;

    .line 284
    .line 285
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    instance-of v0, v0, La/ff5;

    .line 292
    .line 293
    check-cast p0, La/esd0;

    .line 294
    .line 295
    iget-object v6, p0, La/i3t0;->f:La/oyg0;

    .line 296
    .line 297
    iget-object p0, p0, La/i3t0;->i:La/ocj;

    .line 298
    .line 299
    if-eqz v0, :cond_a

    .line 300
    .line 301
    sget v0, La/esd0;->v:I

    .line 302
    .line 303
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 304
    .line 305
    :cond_9
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object p0

    .line 309
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    move-object v7, p0

    .line 313
    check-cast v7, La/yrd0;

    .line 314
    .line 315
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    const-wide/16 v11, 0x0

    .line 319
    .line 320
    const/16 v13, 0x8

    .line 321
    .line 322
    const/4 v8, 0x0

    .line 323
    const/4 v9, 0x0

    .line 324
    const/4 v10, 0x0

    .line 325
    invoke-static/range {v7 .. v13}, La/yrd0;->a(La/yrd0;ZZLa/zsd0;JI)La/yrd0;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    invoke-virtual {v0, p0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result p0

    .line 333
    if-eqz p0, :cond_9

    .line 334
    .line 335
    goto :goto_4

    .line 336
    :cond_a
    sget v0, La/esd0;->v:I

    .line 337
    .line 338
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 339
    .line 340
    :cond_b
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object p0

    .line 344
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    move-object v7, p0

    .line 348
    check-cast v7, La/yrd0;

    .line 349
    .line 350
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 351
    .line 352
    .line 353
    const-wide/16 v11, 0x0

    .line 354
    .line 355
    const/16 v13, 0xc

    .line 356
    .line 357
    const/4 v8, 0x0

    .line 358
    const/4 v9, 0x1

    .line 359
    const/4 v10, 0x0

    .line 360
    invoke-static/range {v7 .. v13}, La/yrd0;->a(La/yrd0;ZZLa/zsd0;JI)La/yrd0;

    .line 361
    .line 362
    .line 363
    move-result-object v1

    .line 364
    invoke-virtual {v0, p0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result p0

    .line 368
    if-eqz p0, :cond_b

    .line 369
    .line 370
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 371
    .line 372
    return-object p0

    .line 373
    :pswitch_4
    move-object v0, p1

    .line 374
    check-cast v0, La/fet;

    .line 375
    .line 376
    move-object/from16 v6, p2

    .line 377
    .line 378
    check-cast v6, Ljava/lang/Number;

    .line 379
    .line 380
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 381
    .line 382
    .line 383
    move-result v6

    .line 384
    and-int/lit8 v7, v6, 0x3

    .line 385
    .line 386
    if-eq v7, v3, :cond_c

    .line 387
    .line 388
    move v3, v4

    .line 389
    goto :goto_5

    .line 390
    :cond_c
    move v3, v5

    .line 391
    :goto_5
    and-int/2addr v6, v4

    .line 392
    invoke-virtual {v0, v6, v3}, La/fet;->U(IZ)Z

    .line 393
    .line 394
    .line 395
    move-result v3

    .line 396
    if-eqz v3, :cond_11

    .line 397
    .line 398
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v3

    .line 402
    sget-object v6, La/ukd;->a:La/cl5;

    .line 403
    .line 404
    if-ne v3, v6, :cond_d

    .line 405
    .line 406
    new-instance v3, La/da40;

    .line 407
    .line 408
    const/16 v6, 0x8

    .line 409
    .line 410
    invoke-direct {v3, v6}, La/da40;-><init>(B)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {v0, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 414
    .line 415
    .line 416
    :cond_d
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 417
    .line 418
    invoke-static {v2, v5, v3}, La/pai0;->a(La/mm40;ZLkotlin/jvm/functions/Function1;)La/mm40;

    .line 419
    .line 420
    .line 421
    move-result-object v2

    .line 422
    check-cast p0, La/pz40;

    .line 423
    .line 424
    sget-object v3, La/gqw0;->a:La/zx7;

    .line 425
    .line 426
    invoke-static {v3, v5}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 427
    .line 428
    .line 429
    move-result-object v3

    .line 430
    invoke-static {v0}, La/e3c;->x(La/fet;)I

    .line 431
    .line 432
    .line 433
    move-result v6

    .line 434
    invoke-virtual {v0}, La/fet;->m()La/bh90;

    .line 435
    .line 436
    .line 437
    move-result-object v7

    .line 438
    invoke-static {v0, v2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 439
    .line 440
    .line 441
    move-result-object v2

    .line 442
    sget-object v8, La/mkd;->c0:La/gqw0;

    .line 443
    .line 444
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 445
    .line 446
    .line 447
    invoke-virtual {v0}, La/fet;->i0()V

    .line 448
    .line 449
    .line 450
    iget-boolean v8, v0, La/fet;->S:Z

    .line 451
    .line 452
    if-eqz v8, :cond_e

    .line 453
    .line 454
    invoke-virtual {v0, v1}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 455
    .line 456
    .line 457
    goto :goto_6

    .line 458
    :cond_e
    invoke-virtual {v0}, La/fet;->r0()V

    .line 459
    .line 460
    .line 461
    :goto_6
    sget-object v1, La/gqw0;->x:La/shd;

    .line 462
    .line 463
    invoke-static {v0, v3, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 464
    .line 465
    .line 466
    sget-object v1, La/gqw0;->w:La/shd;

    .line 467
    .line 468
    invoke-static {v0, v7, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 469
    .line 470
    .line 471
    sget-object v1, La/gqw0;->y:La/shd;

    .line 472
    .line 473
    iget-boolean v3, v0, La/fet;->S:Z

    .line 474
    .line 475
    if-nez v3, :cond_f

    .line 476
    .line 477
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v3

    .line 481
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 482
    .line 483
    .line 484
    move-result-object v7

    .line 485
    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    move-result v3

    .line 489
    if-nez v3, :cond_10

    .line 490
    .line 491
    :cond_f
    invoke-static {v6, v0, v6, v1}, La/rw2;->t(ILa/fet;ILa/shd;)V

    .line 492
    .line 493
    .line 494
    :cond_10
    sget-object v1, La/gqw0;->v:La/shd;

    .line 495
    .line 496
    invoke-static {v0, v2, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 497
    .line 498
    .line 499
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object p0

    .line 503
    check-cast p0, Lkotlin/jvm/functions/Function2;

    .line 504
    .line 505
    invoke-static {v5, v0, p0, v4}, La/h97;->q(ILa/fet;Lkotlin/jvm/functions/Function2;Z)V

    .line 506
    .line 507
    .line 508
    goto :goto_7

    .line 509
    :cond_11
    invoke-virtual {v0}, La/fet;->X()V

    .line 510
    .line 511
    .line 512
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 513
    .line 514
    return-object p0

    .line 515
    :pswitch_5
    move-object v0, p1

    .line 516
    check-cast v0, Ljava/lang/Throwable;

    .line 517
    .line 518
    move-object/from16 v1, p2

    .line 519
    .line 520
    check-cast v1, Ljava/lang/String;

    .line 521
    .line 522
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 526
    .line 527
    .line 528
    instance-of v0, v0, La/ff5;

    .line 529
    .line 530
    check-cast p0, La/wzy;

    .line 531
    .line 532
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 533
    .line 534
    iget-object p0, p0, La/i3t0;->i:La/ocj;

    .line 535
    .line 536
    if-eqz v0, :cond_13

    .line 537
    .line 538
    sget v0, La/wzy;->v:I

    .line 539
    .line 540
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 541
    .line 542
    :cond_12
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object p0

    .line 546
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 547
    .line 548
    .line 549
    move-object v2, p0

    .line 550
    check-cast v2, La/rzy;

    .line 551
    .line 552
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 553
    .line 554
    .line 555
    invoke-static {v2, v5, v5, v4}, La/rzy;->a(La/rzy;ZZZ)La/rzy;

    .line 556
    .line 557
    .line 558
    move-result-object v2

    .line 559
    invoke-virtual {v0, p0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 560
    .line 561
    .line 562
    move-result p0

    .line 563
    if-eqz p0, :cond_12

    .line 564
    .line 565
    goto :goto_8

    .line 566
    :cond_13
    sget v0, La/wzy;->v:I

    .line 567
    .line 568
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 569
    .line 570
    :cond_14
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object p0

    .line 574
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 575
    .line 576
    .line 577
    move-object v2, p0

    .line 578
    check-cast v2, La/rzy;

    .line 579
    .line 580
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 581
    .line 582
    .line 583
    invoke-static {v2, v5, v4, v5}, La/rzy;->a(La/rzy;ZZZ)La/rzy;

    .line 584
    .line 585
    .line 586
    move-result-object v2

    .line 587
    invoke-virtual {v0, p0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 588
    .line 589
    .line 590
    move-result p0

    .line 591
    if-eqz p0, :cond_14

    .line 592
    .line 593
    :goto_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 594
    .line 595
    return-object p0

    .line 596
    :pswitch_6
    move-object v0, p1

    .line 597
    check-cast v0, Ljava/lang/Throwable;

    .line 598
    .line 599
    move-object/from16 v1, p2

    .line 600
    .line 601
    check-cast v1, Ljava/lang/String;

    .line 602
    .line 603
    move-object v4, p0

    .line 604
    check-cast v4, La/r8q;

    .line 605
    .line 606
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 607
    .line 608
    .line 609
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 610
    .line 611
    .line 612
    instance-of p0, v0, La/zhi0;

    .line 613
    .line 614
    if-eqz p0, :cond_15

    .line 615
    .line 616
    check-cast v0, La/zhi0;

    .line 617
    .line 618
    new-instance v2, La/wej;

    .line 619
    .line 620
    const/4 v8, 0x0

    .line 621
    const/16 v9, 0xf

    .line 622
    .line 623
    const/4 v3, 0x0

    .line 624
    const-class v5, La/r8q;

    .line 625
    .line 626
    const-string v6, "setErrorState"

    .line 627
    .line 628
    const-string v7, "setErrorState()V"

    .line 629
    .line 630
    invoke-direct/range {v2 .. v9}, La/wej;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 631
    .line 632
    .line 633
    sget-object p0, La/r8q;->Y:La/ocq;

    .line 634
    .line 635
    invoke-virtual {v4, v0, v2}, La/r8q;->B(La/zhi0;Lkotlin/jvm/functions/Function0;)V

    .line 636
    .line 637
    .line 638
    goto :goto_9

    .line 639
    :cond_15
    instance-of p0, v0, Ljava/net/UnknownHostException;

    .line 640
    .line 641
    if-eqz p0, :cond_16

    .line 642
    .line 643
    sget-object p0, La/r8q;->Y:La/ocq;

    .line 644
    .line 645
    invoke-virtual {v4}, La/r8q;->F()V

    .line 646
    .line 647
    .line 648
    goto :goto_9

    .line 649
    :cond_16
    sget-object p0, La/r8q;->Y:La/ocq;

    .line 650
    .line 651
    invoke-virtual {v4}, La/r8q;->F()V

    .line 652
    .line 653
    .line 654
    :goto_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 655
    .line 656
    return-object p0

    .line 657
    :pswitch_7
    move-object v0, p1

    .line 658
    check-cast v0, Ljava/lang/Throwable;

    .line 659
    .line 660
    move-object/from16 v1, p2

    .line 661
    .line 662
    check-cast v1, Ljava/lang/String;

    .line 663
    .line 664
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 665
    .line 666
    .line 667
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 668
    .line 669
    .line 670
    instance-of v0, v0, La/ff5;

    .line 671
    .line 672
    check-cast p0, La/wgp;

    .line 673
    .line 674
    iget-object v6, p0, La/i3t0;->f:La/oyg0;

    .line 675
    .line 676
    iget-object p0, p0, La/i3t0;->i:La/ocj;

    .line 677
    .line 678
    if-eqz v0, :cond_18

    .line 679
    .line 680
    sget v0, La/wgp;->v:I

    .line 681
    .line 682
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 683
    .line 684
    :cond_17
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object p0

    .line 688
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 689
    .line 690
    .line 691
    move-object v1, p0

    .line 692
    check-cast v1, La/rgp;

    .line 693
    .line 694
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    .line 696
    .line 697
    invoke-static {v1, v5, v5, v4}, La/rgp;->a(La/rgp;ZZZ)La/rgp;

    .line 698
    .line 699
    .line 700
    move-result-object v1

    .line 701
    invoke-virtual {v0, p0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 702
    .line 703
    .line 704
    move-result p0

    .line 705
    if-eqz p0, :cond_17

    .line 706
    .line 707
    goto :goto_a

    .line 708
    :cond_18
    sget v0, La/wgp;->v:I

    .line 709
    .line 710
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 711
    .line 712
    :cond_19
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    move-result-object p0

    .line 716
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 717
    .line 718
    .line 719
    move-object v1, p0

    .line 720
    check-cast v1, La/rgp;

    .line 721
    .line 722
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 723
    .line 724
    .line 725
    invoke-static {v1, v5, v4, v5}, La/rgp;->a(La/rgp;ZZZ)La/rgp;

    .line 726
    .line 727
    .line 728
    move-result-object v1

    .line 729
    invoke-virtual {v0, p0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 730
    .line 731
    .line 732
    move-result p0

    .line 733
    if-eqz p0, :cond_19

    .line 734
    .line 735
    :goto_a
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 736
    .line 737
    return-object p0

    .line 738
    :pswitch_8
    move-object v0, p1

    .line 739
    check-cast v0, La/fet;

    .line 740
    .line 741
    move-object/from16 v6, p2

    .line 742
    .line 743
    check-cast v6, Ljava/lang/Number;

    .line 744
    .line 745
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 746
    .line 747
    .line 748
    move-result v6

    .line 749
    and-int/lit8 v7, v6, 0x3

    .line 750
    .line 751
    if-eq v7, v3, :cond_1a

    .line 752
    .line 753
    move v5, v4

    .line 754
    :cond_1a
    and-int/lit8 v3, v6, 0x1

    .line 755
    .line 756
    invoke-virtual {v0, v3, v5}, La/fet;->U(IZ)Z

    .line 757
    .line 758
    .line 759
    move-result v3

    .line 760
    if-eqz v3, :cond_1e

    .line 761
    .line 762
    sget-object v3, La/uc9;->b:La/lw3;

    .line 763
    .line 764
    sget-object v5, La/gqw0;->k:La/yx7;

    .line 765
    .line 766
    check-cast p0, La/m3k0;

    .line 767
    .line 768
    iget-object p0, p0, La/m3k0;->f:La/ugd;

    .line 769
    .line 770
    const/16 v6, 0x36

    .line 771
    .line 772
    invoke-static {v3, v5, v0, v6}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 773
    .line 774
    .line 775
    move-result-object v3

    .line 776
    invoke-static {v0}, La/e3c;->x(La/fet;)I

    .line 777
    .line 778
    .line 779
    move-result v5

    .line 780
    invoke-virtual {v0}, La/fet;->m()La/bh90;

    .line 781
    .line 782
    .line 783
    move-result-object v6

    .line 784
    invoke-static {v0, v2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 785
    .line 786
    .line 787
    move-result-object v2

    .line 788
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 789
    .line 790
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 791
    .line 792
    .line 793
    invoke-virtual {v0}, La/fet;->i0()V

    .line 794
    .line 795
    .line 796
    iget-boolean v7, v0, La/fet;->S:Z

    .line 797
    .line 798
    if-eqz v7, :cond_1b

    .line 799
    .line 800
    invoke-virtual {v0, v1}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 801
    .line 802
    .line 803
    goto :goto_b

    .line 804
    :cond_1b
    invoke-virtual {v0}, La/fet;->r0()V

    .line 805
    .line 806
    .line 807
    :goto_b
    sget-object v1, La/gqw0;->x:La/shd;

    .line 808
    .line 809
    invoke-static {v0, v3, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 810
    .line 811
    .line 812
    sget-object v1, La/gqw0;->w:La/shd;

    .line 813
    .line 814
    invoke-static {v0, v6, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 815
    .line 816
    .line 817
    sget-object v1, La/gqw0;->y:La/shd;

    .line 818
    .line 819
    iget-boolean v3, v0, La/fet;->S:Z

    .line 820
    .line 821
    if-nez v3, :cond_1c

    .line 822
    .line 823
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 824
    .line 825
    .line 826
    move-result-object v3

    .line 827
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 828
    .line 829
    .line 830
    move-result-object v6

    .line 831
    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 832
    .line 833
    .line 834
    move-result v3

    .line 835
    if-nez v3, :cond_1d

    .line 836
    .line 837
    :cond_1c
    invoke-static {v5, v0, v5, v1}, La/rw2;->t(ILa/fet;ILa/shd;)V

    .line 838
    .line 839
    .line 840
    :cond_1d
    sget-object v1, La/gqw0;->v:La/shd;

    .line 841
    .line 842
    invoke-static {v0, v2, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 843
    .line 844
    .line 845
    sget-object v1, La/zhg0;->a:La/zhg0;

    .line 846
    .line 847
    const/4 v2, 0x6

    .line 848
    invoke-static {v2, p0, v1, v0, v4}, La/h97;->p(ILa/ugd;La/zhg0;La/fet;Z)V

    .line 849
    .line 850
    .line 851
    goto :goto_c

    .line 852
    :cond_1e
    invoke-virtual {v0}, La/fet;->X()V

    .line 853
    .line 854
    .line 855
    :goto_c
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 856
    .line 857
    return-object p0

    .line 858
    :pswitch_9
    move-object v0, p1

    .line 859
    check-cast v0, La/fet;

    .line 860
    .line 861
    move-object/from16 v1, p2

    .line 862
    .line 863
    check-cast v1, Ljava/lang/Number;

    .line 864
    .line 865
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 866
    .line 867
    .line 868
    move-result v1

    .line 869
    and-int/lit8 v2, v1, 0x3

    .line 870
    .line 871
    if-eq v2, v3, :cond_1f

    .line 872
    .line 873
    move v2, v4

    .line 874
    goto :goto_d

    .line 875
    :cond_1f
    move v2, v5

    .line 876
    :goto_d
    and-int/2addr v1, v4

    .line 877
    invoke-virtual {v0, v1, v2}, La/fet;->U(IZ)Z

    .line 878
    .line 879
    .line 880
    move-result v1

    .line 881
    if-eqz v1, :cond_20

    .line 882
    .line 883
    sget-object v1, La/qmk;->a:La/zcl;

    .line 884
    .line 885
    const/4 v1, 0x0

    .line 886
    check-cast p0, La/fuf;

    .line 887
    .line 888
    invoke-static {v1, p0, v0, v5}, La/nkb;->d(La/mm40;La/fuf;La/fet;I)V

    .line 889
    .line 890
    .line 891
    goto :goto_e

    .line 892
    :cond_20
    invoke-virtual {v0}, La/fet;->X()V

    .line 893
    .line 894
    .line 895
    :goto_e
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 896
    .line 897
    return-object p0

    .line 898
    :pswitch_a
    move-object v0, p1

    .line 899
    check-cast v0, Ljava/lang/Throwable;

    .line 900
    .line 901
    move-object/from16 v1, p2

    .line 902
    .line 903
    check-cast v1, Ljava/lang/String;

    .line 904
    .line 905
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 906
    .line 907
    .line 908
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 909
    .line 910
    .line 911
    instance-of v0, v0, La/ff5;

    .line 912
    .line 913
    check-cast p0, La/kfd;

    .line 914
    .line 915
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 916
    .line 917
    iget-object p0, p0, La/i3t0;->i:La/ocj;

    .line 918
    .line 919
    if-eqz v0, :cond_22

    .line 920
    .line 921
    sget v0, La/kfd;->w:I

    .line 922
    .line 923
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 924
    .line 925
    :cond_21
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 926
    .line 927
    .line 928
    move-result-object p0

    .line 929
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 930
    .line 931
    .line 932
    move-object v2, p0

    .line 933
    check-cast v2, La/sed;

    .line 934
    .line 935
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 936
    .line 937
    .line 938
    sget-object v2, La/iun;->a:La/iun;

    .line 939
    .line 940
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 941
    .line 942
    .line 943
    new-instance v3, La/sed;

    .line 944
    .line 945
    invoke-direct {v3, v2, v5, v5}, La/sed;-><init>(Ljava/util/List;ZZ)V

    .line 946
    .line 947
    .line 948
    invoke-virtual {v0, p0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 949
    .line 950
    .line 951
    move-result p0

    .line 952
    if-eqz p0, :cond_21

    .line 953
    .line 954
    goto :goto_f

    .line 955
    :cond_22
    sget v0, La/kfd;->w:I

    .line 956
    .line 957
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 958
    .line 959
    :cond_23
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 960
    .line 961
    .line 962
    move-result-object p0

    .line 963
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 964
    .line 965
    .line 966
    move-object v2, p0

    .line 967
    check-cast v2, La/sed;

    .line 968
    .line 969
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 970
    .line 971
    .line 972
    invoke-static {v2, v5, v4}, La/sed;->a(La/sed;ZZ)La/sed;

    .line 973
    .line 974
    .line 975
    move-result-object v2

    .line 976
    invoke-virtual {v0, p0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 977
    .line 978
    .line 979
    move-result p0

    .line 980
    if-eqz p0, :cond_23

    .line 981
    .line 982
    :goto_f
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 983
    .line 984
    return-object p0

    .line 985
    :pswitch_b
    move-object v0, p1

    .line 986
    check-cast v0, Ljava/lang/Throwable;

    .line 987
    .line 988
    move-object/from16 v1, p2

    .line 989
    .line 990
    check-cast v1, Ljava/lang/String;

    .line 991
    .line 992
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 993
    .line 994
    .line 995
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 996
    .line 997
    .line 998
    instance-of v0, v0, La/ff5;

    .line 999
    .line 1000
    check-cast p0, La/gfd;

    .line 1001
    .line 1002
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 1003
    .line 1004
    iget-object p0, p0, La/i3t0;->i:La/ocj;

    .line 1005
    .line 1006
    if-eqz v0, :cond_25

    .line 1007
    .line 1008
    sget v0, La/gfd;->u:I

    .line 1009
    .line 1010
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 1011
    .line 1012
    :cond_24
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1013
    .line 1014
    .line 1015
    move-result-object p0

    .line 1016
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1017
    .line 1018
    .line 1019
    move-object v2, p0

    .line 1020
    check-cast v2, La/cfd;

    .line 1021
    .line 1022
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1023
    .line 1024
    .line 1025
    const/4 v8, 0x0

    .line 1026
    const/16 v9, 0x11

    .line 1027
    .line 1028
    const-wide/16 v3, 0x0

    .line 1029
    .line 1030
    const/4 v5, 0x0

    .line 1031
    const/4 v6, 0x0

    .line 1032
    const/4 v7, 0x1

    .line 1033
    invoke-static/range {v2 .. v9}, La/cfd;->a(La/cfd;JZZZLjava/util/List;I)La/cfd;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v2

    .line 1037
    invoke-virtual {v0, p0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1038
    .line 1039
    .line 1040
    move-result p0

    .line 1041
    if-eqz p0, :cond_24

    .line 1042
    .line 1043
    goto :goto_10

    .line 1044
    :cond_25
    sget v0, La/gfd;->u:I

    .line 1045
    .line 1046
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 1047
    .line 1048
    :cond_26
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1049
    .line 1050
    .line 1051
    move-result-object p0

    .line 1052
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1053
    .line 1054
    .line 1055
    move-object v2, p0

    .line 1056
    check-cast v2, La/cfd;

    .line 1057
    .line 1058
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1059
    .line 1060
    .line 1061
    const/4 v8, 0x0

    .line 1062
    const/16 v9, 0x11

    .line 1063
    .line 1064
    const-wide/16 v3, 0x0

    .line 1065
    .line 1066
    const/4 v5, 0x0

    .line 1067
    const/4 v6, 0x1

    .line 1068
    const/4 v7, 0x0

    .line 1069
    invoke-static/range {v2 .. v9}, La/cfd;->a(La/cfd;JZZZLjava/util/List;I)La/cfd;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v2

    .line 1073
    invoke-virtual {v0, p0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1074
    .line 1075
    .line 1076
    move-result p0

    .line 1077
    if-eqz p0, :cond_26

    .line 1078
    .line 1079
    :goto_10
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1080
    .line 1081
    return-object p0

    .line 1082
    :pswitch_c
    move-object v0, p1

    .line 1083
    check-cast v0, La/jpq;

    .line 1084
    .line 1085
    iget v0, v0, La/jpq;->a:I

    .line 1086
    .line 1087
    move-object/from16 v1, p2

    .line 1088
    .line 1089
    check-cast v1, Ljava/lang/Boolean;

    .line 1090
    .line 1091
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1092
    .line 1093
    .line 1094
    move-result v1

    .line 1095
    invoke-static {v0}, La/spq;->c(I)Ljava/lang/Integer;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v0

    .line 1099
    if-eqz v0, :cond_28

    .line 1100
    .line 1101
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1102
    .line 1103
    .line 1104
    move-result v0

    .line 1105
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1106
    .line 1107
    const/16 v3, 0x1f

    .line 1108
    .line 1109
    if-lt v2, v3, :cond_27

    .line 1110
    .line 1111
    sget-object v2, La/la3;->a:La/la3;

    .line 1112
    .line 1113
    invoke-virtual {v2, v0, v1}, La/la3;->a(IZ)I

    .line 1114
    .line 1115
    .line 1116
    move-result v0

    .line 1117
    goto :goto_11

    .line 1118
    :cond_27
    invoke-static {v0}, Landroid/view/SoundEffectConstants;->getContantForFocusDirection(I)I

    .line 1119
    .line 1120
    .line 1121
    move-result v0

    .line 1122
    :goto_11
    check-cast p0, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 1123
    .line 1124
    invoke-virtual {p0, v0}, Landroid/view/View;->playSoundEffect(I)V

    .line 1125
    .line 1126
    .line 1127
    :cond_28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1128
    .line 1129
    return-object p0

    .line 1130
    :pswitch_d
    move-object v0, p1

    .line 1131
    check-cast v0, Ljava/lang/Throwable;

    .line 1132
    .line 1133
    move-object/from16 v1, p2

    .line 1134
    .line 1135
    check-cast v1, Ljava/lang/String;

    .line 1136
    .line 1137
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1138
    .line 1139
    .line 1140
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1141
    .line 1142
    .line 1143
    check-cast p0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;

    .line 1144
    .line 1145
    new-instance v0, La/w32;

    .line 1146
    .line 1147
    sget-object v1, La/m32;->b:La/m32;

    .line 1148
    .line 1149
    sget-object v2, La/iun;->a:La/iun;

    .line 1150
    .line 1151
    invoke-direct {v0, v1, v2}, La/w32;-><init>(La/m32;Ljava/util/List;)V

    .line 1152
    .line 1153
    .line 1154
    sget v1, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->Q:I

    .line 1155
    .line 1156
    invoke-virtual {p0, v0}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->R(La/x32;)V

    .line 1157
    .line 1158
    .line 1159
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1160
    .line 1161
    return-object p0

    .line 1162
    nop

    .line 1163
    :pswitch_data_0
    .packed-switch 0x0
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
