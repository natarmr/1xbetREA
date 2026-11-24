.class public final La/a8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/a8;->a:B

    iput-object p1, p0, La/a8;->c:Ljava/lang/Object;

    iput-object p2, p0, La/a8;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/a8;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/4 v3, 0x6

    .line 8
    sget-object v4, La/e7z;->u1:La/pcy;

    .line 9
    .line 10
    sget-object v5, La/jm40;->b:La/jm40;

    .line 11
    .line 12
    const/4 v6, 0x2

    .line 13
    const/4 v7, 0x1

    .line 14
    const/4 v8, 0x0

    .line 15
    iget-object v9, v0, La/a8;->b:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v0, v0, La/a8;->c:Ljava/lang/Object;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    move-object/from16 v1, p1

    .line 23
    .line 24
    check-cast v1, La/oyg0;

    .line 25
    .line 26
    move-object/from16 v2, p2

    .line 27
    .line 28
    check-cast v2, La/ncv0;

    .line 29
    .line 30
    move-object v3, v0

    .line 31
    check-cast v3, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    check-cast v9, La/vcv0;

    .line 40
    .line 41
    invoke-virtual {v9}, La/i3t0;->D()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, La/ncv0;

    .line 46
    .line 47
    iget-object v0, v0, La/ncv0;->b:La/i3m0;

    .line 48
    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    invoke-virtual {v9}, La/i3t0;->D()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, La/ncv0;

    .line 56
    .line 57
    iget-object v0, v0, La/ncv0;->b:La/i3m0;

    .line 58
    .line 59
    invoke-static {v3, v0}, Lkotlin/collections/CollectionsKt;->L(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_0

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_0
    invoke-virtual {v9}, La/i3t0;->D()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, La/ncv0;

    .line 71
    .line 72
    iget-object v0, v0, La/ncv0;->b:La/i3m0;

    .line 73
    .line 74
    :goto_0
    move-object v4, v0

    .line 75
    goto :goto_2

    .line 76
    :cond_1
    :goto_1
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, La/i3m0;

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :goto_2
    const/4 v7, 0x0

    .line 84
    const/16 v8, 0x78

    .line 85
    .line 86
    const/4 v5, 0x0

    .line 87
    const/4 v6, 0x0

    .line 88
    invoke-static/range {v2 .. v8}, La/ncv0;->a(La/ncv0;Ljava/util/List;La/i3m0;ZZZI)La/ncv0;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    return-object v0

    .line 93
    :pswitch_0
    move-object/from16 v1, p1

    .line 94
    .line 95
    check-cast v1, La/fet;

    .line 96
    .line 97
    move-object/from16 v3, p2

    .line 98
    .line 99
    check-cast v3, Ljava/lang/Number;

    .line 100
    .line 101
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    and-int/lit8 v10, v3, 0x3

    .line 106
    .line 107
    if-eq v10, v6, :cond_2

    .line 108
    .line 109
    move v6, v7

    .line 110
    goto :goto_3

    .line 111
    :cond_2
    move v6, v8

    .line 112
    :goto_3
    and-int/2addr v3, v7

    .line 113
    invoke-virtual {v1, v3, v6}, La/fet;->U(IZ)Z

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-eqz v3, :cond_7

    .line 118
    .line 119
    check-cast v0, La/pz40;

    .line 120
    .line 121
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    if-ne v3, v2, :cond_3

    .line 126
    .line 127
    new-instance v3, La/dbo0;

    .line 128
    .line 129
    const/4 v2, 0x5

    .line 130
    invoke-direct {v3, v0, v2}, La/dbo0;-><init>(La/pz40;B)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    :cond_3
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 137
    .line 138
    invoke-static {v5, v3}, La/ro4;->d0(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    check-cast v9, La/ugd;

    .line 143
    .line 144
    sget-object v2, La/gqw0;->a:La/zx7;

    .line 145
    .line 146
    invoke-static {v2, v8}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-static {v1}, La/e3c;->x(La/fet;)I

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    invoke-static {v1, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    sget-object v6, La/mkd;->c0:La/gqw0;

    .line 163
    .line 164
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1}, La/fet;->i0()V

    .line 168
    .line 169
    .line 170
    iget-boolean v6, v1, La/fet;->S:Z

    .line 171
    .line 172
    if-eqz v6, :cond_4

    .line 173
    .line 174
    invoke-virtual {v1, v4}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 175
    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_4
    invoke-virtual {v1}, La/fet;->r0()V

    .line 179
    .line 180
    .line 181
    :goto_4
    sget-object v4, La/gqw0;->x:La/shd;

    .line 182
    .line 183
    invoke-static {v1, v2, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 184
    .line 185
    .line 186
    sget-object v2, La/gqw0;->w:La/shd;

    .line 187
    .line 188
    invoke-static {v1, v5, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 189
    .line 190
    .line 191
    sget-object v2, La/gqw0;->y:La/shd;

    .line 192
    .line 193
    iget-boolean v4, v1, La/fet;->S:Z

    .line 194
    .line 195
    if-nez v4, :cond_5

    .line 196
    .line 197
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    if-nez v4, :cond_6

    .line 210
    .line 211
    :cond_5
    invoke-static {v3, v1, v3, v2}, La/rw2;->t(ILa/fet;ILa/shd;)V

    .line 212
    .line 213
    .line 214
    :cond_6
    sget-object v2, La/gqw0;->v:La/shd;

    .line 215
    .line 216
    invoke-static {v1, v0, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 217
    .line 218
    .line 219
    invoke-static {v8, v9, v1, v7}, La/twn;->v(ILa/ugd;La/fet;Z)V

    .line 220
    .line 221
    .line 222
    goto :goto_5

    .line 223
    :cond_7
    invoke-virtual {v1}, La/fet;->X()V

    .line 224
    .line 225
    .line 226
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 227
    .line 228
    return-object v0

    .line 229
    :pswitch_1
    move-object/from16 v1, p1

    .line 230
    .line 231
    check-cast v1, La/x8z;

    .line 232
    .line 233
    move-object/from16 v2, p2

    .line 234
    .line 235
    check-cast v2, Ljava/lang/Number;

    .line 236
    .line 237
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 238
    .line 239
    .line 240
    move-result v2

    .line 241
    check-cast v0, La/t330;

    .line 242
    .line 243
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    check-cast v9, Ljava/util/List;

    .line 248
    .line 249
    invoke-interface {v9, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    invoke-virtual {v0, v1, v3, v2}, La/t330;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    check-cast v0, La/pgv;

    .line 258
    .line 259
    return-object v0

    .line 260
    :pswitch_2
    move-object/from16 v1, p1

    .line 261
    .line 262
    check-cast v1, La/fet;

    .line 263
    .line 264
    move-object/from16 v2, p2

    .line 265
    .line 266
    check-cast v2, Ljava/lang/Number;

    .line 267
    .line 268
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 269
    .line 270
    .line 271
    move-result v2

    .line 272
    and-int/lit8 v3, v2, 0x3

    .line 273
    .line 274
    if-eq v3, v6, :cond_8

    .line 275
    .line 276
    move v3, v7

    .line 277
    goto :goto_6

    .line 278
    :cond_8
    move v3, v8

    .line 279
    :goto_6
    and-int/2addr v2, v7

    .line 280
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 281
    .line 282
    .line 283
    move-result v2

    .line 284
    if-eqz v2, :cond_9

    .line 285
    .line 286
    check-cast v0, La/ugd;

    .line 287
    .line 288
    check-cast v9, Ljava/util/ArrayList;

    .line 289
    .line 290
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    invoke-virtual {v0, v9, v1, v2}, La/ugd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    goto :goto_7

    .line 298
    :cond_9
    invoke-virtual {v1}, La/fet;->X()V

    .line 299
    .line 300
    .line 301
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 302
    .line 303
    return-object v0

    .line 304
    :pswitch_3
    move-object/from16 v1, p1

    .line 305
    .line 306
    check-cast v1, La/fet;

    .line 307
    .line 308
    move-object/from16 v2, p2

    .line 309
    .line 310
    check-cast v2, Ljava/lang/Number;

    .line 311
    .line 312
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 313
    .line 314
    .line 315
    move-result v2

    .line 316
    and-int/lit8 v4, v2, 0x3

    .line 317
    .line 318
    if-eq v4, v6, :cond_a

    .line 319
    .line 320
    move v8, v7

    .line 321
    :cond_a
    and-int/2addr v2, v7

    .line 322
    invoke-virtual {v1, v2, v8}, La/fet;->U(IZ)Z

    .line 323
    .line 324
    .line 325
    move-result v2

    .line 326
    if-eqz v2, :cond_b

    .line 327
    .line 328
    check-cast v0, La/ugd;

    .line 329
    .line 330
    check-cast v9, La/odo0;

    .line 331
    .line 332
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 333
    .line 334
    .line 335
    move-result-object v2

    .line 336
    invoke-virtual {v0, v9, v1, v2}, La/ugd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    goto :goto_8

    .line 340
    :cond_b
    invoke-virtual {v1}, La/fet;->X()V

    .line 341
    .line 342
    .line 343
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 344
    .line 345
    return-object v0

    .line 346
    :pswitch_4
    move-object/from16 v1, p1

    .line 347
    .line 348
    check-cast v1, La/x8z;

    .line 349
    .line 350
    move-object/from16 v2, p2

    .line 351
    .line 352
    check-cast v2, Ljava/lang/Number;

    .line 353
    .line 354
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 355
    .line 356
    .line 357
    move-result v2

    .line 358
    check-cast v0, La/t330;

    .line 359
    .line 360
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 361
    .line 362
    .line 363
    move-result-object v3

    .line 364
    check-cast v9, Ljava/util/List;

    .line 365
    .line 366
    invoke-interface {v9, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    invoke-virtual {v0, v1, v3, v2}, La/t330;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    check-cast v0, La/pgv;

    .line 375
    .line 376
    return-object v0

    .line 377
    :pswitch_5
    move-object/from16 v1, p1

    .line 378
    .line 379
    check-cast v1, La/fet;

    .line 380
    .line 381
    move-object/from16 v2, p2

    .line 382
    .line 383
    check-cast v2, Ljava/lang/Number;

    .line 384
    .line 385
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 386
    .line 387
    .line 388
    move-result v2

    .line 389
    and-int/lit8 v10, v2, 0x3

    .line 390
    .line 391
    if-eq v10, v6, :cond_c

    .line 392
    .line 393
    move v6, v7

    .line 394
    goto :goto_9

    .line 395
    :cond_c
    move v6, v8

    .line 396
    :goto_9
    and-int/2addr v2, v7

    .line 397
    invoke-virtual {v1, v2, v6}, La/fet;->U(IZ)Z

    .line 398
    .line 399
    .line 400
    move-result v2

    .line 401
    if-eqz v2, :cond_10

    .line 402
    .line 403
    check-cast v0, La/ugd;

    .line 404
    .line 405
    check-cast v9, La/f1h0;

    .line 406
    .line 407
    sget-object v2, La/gqw0;->a:La/zx7;

    .line 408
    .line 409
    invoke-static {v2, v8}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 410
    .line 411
    .line 412
    move-result-object v2

    .line 413
    invoke-static {v1}, La/e3c;->x(La/fet;)I

    .line 414
    .line 415
    .line 416
    move-result v6

    .line 417
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 418
    .line 419
    .line 420
    move-result-object v8

    .line 421
    invoke-static {v1, v5}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 422
    .line 423
    .line 424
    move-result-object v5

    .line 425
    sget-object v10, La/mkd;->c0:La/gqw0;

    .line 426
    .line 427
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v1}, La/fet;->i0()V

    .line 431
    .line 432
    .line 433
    iget-boolean v10, v1, La/fet;->S:Z

    .line 434
    .line 435
    if-eqz v10, :cond_d

    .line 436
    .line 437
    invoke-virtual {v1, v4}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 438
    .line 439
    .line 440
    goto :goto_a

    .line 441
    :cond_d
    invoke-virtual {v1}, La/fet;->r0()V

    .line 442
    .line 443
    .line 444
    :goto_a
    sget-object v4, La/gqw0;->x:La/shd;

    .line 445
    .line 446
    invoke-static {v1, v2, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 447
    .line 448
    .line 449
    sget-object v2, La/gqw0;->w:La/shd;

    .line 450
    .line 451
    invoke-static {v1, v8, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 452
    .line 453
    .line 454
    sget-object v2, La/gqw0;->y:La/shd;

    .line 455
    .line 456
    iget-boolean v4, v1, La/fet;->S:Z

    .line 457
    .line 458
    if-nez v4, :cond_e

    .line 459
    .line 460
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v4

    .line 464
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 465
    .line 466
    .line 467
    move-result-object v8

    .line 468
    invoke-static {v4, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    move-result v4

    .line 472
    if-nez v4, :cond_f

    .line 473
    .line 474
    :cond_e
    invoke-static {v6, v1, v6, v2}, La/rw2;->t(ILa/fet;ILa/shd;)V

    .line 475
    .line 476
    .line 477
    :cond_f
    sget-object v2, La/gqw0;->v:La/shd;

    .line 478
    .line 479
    invoke-static {v1, v5, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 480
    .line 481
    .line 482
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 483
    .line 484
    .line 485
    move-result-object v2

    .line 486
    invoke-virtual {v0, v9, v1, v2}, La/ugd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v1, v7}, La/fet;->r(Z)V

    .line 490
    .line 491
    .line 492
    goto :goto_b

    .line 493
    :cond_10
    invoke-virtual {v1}, La/fet;->X()V

    .line 494
    .line 495
    .line 496
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 497
    .line 498
    return-object v0

    .line 499
    :pswitch_6
    move-object/from16 v1, p1

    .line 500
    .line 501
    check-cast v1, La/x8z;

    .line 502
    .line 503
    move-object/from16 v2, p2

    .line 504
    .line 505
    check-cast v2, Ljava/lang/Number;

    .line 506
    .line 507
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 508
    .line 509
    .line 510
    move-result v2

    .line 511
    check-cast v0, La/t330;

    .line 512
    .line 513
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 514
    .line 515
    .line 516
    move-result-object v3

    .line 517
    check-cast v9, Ljava/util/List;

    .line 518
    .line 519
    invoke-interface {v9, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object v2

    .line 523
    invoke-virtual {v0, v1, v3, v2}, La/t330;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    check-cast v0, La/pgv;

    .line 528
    .line 529
    return-object v0

    .line 530
    :pswitch_7
    move-object/from16 v1, p1

    .line 531
    .line 532
    check-cast v1, La/x8z;

    .line 533
    .line 534
    move-object/from16 v2, p2

    .line 535
    .line 536
    check-cast v2, Ljava/lang/Number;

    .line 537
    .line 538
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 539
    .line 540
    .line 541
    move-result v2

    .line 542
    check-cast v0, La/cl2;

    .line 543
    .line 544
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 545
    .line 546
    .line 547
    move-result-object v3

    .line 548
    check-cast v9, Ljava/util/List;

    .line 549
    .line 550
    invoke-interface {v9, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v2

    .line 554
    invoke-virtual {v0, v1, v3, v2}, La/cl2;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    check-cast v0, La/pgv;

    .line 559
    .line 560
    return-object v0

    .line 561
    :pswitch_8
    move-object/from16 v1, p1

    .line 562
    .line 563
    check-cast v1, La/x8z;

    .line 564
    .line 565
    move-object/from16 v2, p2

    .line 566
    .line 567
    check-cast v2, Ljava/lang/Number;

    .line 568
    .line 569
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 570
    .line 571
    .line 572
    move-result v2

    .line 573
    check-cast v0, La/cl2;

    .line 574
    .line 575
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 576
    .line 577
    .line 578
    move-result-object v3

    .line 579
    check-cast v9, Ljava/util/List;

    .line 580
    .line 581
    invoke-interface {v9, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object v2

    .line 585
    invoke-virtual {v0, v1, v3, v2}, La/cl2;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    check-cast v0, La/pgv;

    .line 590
    .line 591
    return-object v0

    .line 592
    :pswitch_9
    check-cast v9, Lorg/xplatform/registration/api/domain/models/BonusInfoModel;

    .line 593
    .line 594
    move-object/from16 v1, p1

    .line 595
    .line 596
    check-cast v1, La/oyg0;

    .line 597
    .line 598
    move-object/from16 v10, p2

    .line 599
    .line 600
    check-cast v10, La/p650;

    .line 601
    .line 602
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 606
    .line 607
    .line 608
    iget-object v1, v10, La/p650;->h:Ljava/util/List;

    .line 609
    .line 610
    check-cast v0, Ljava/lang/String;

    .line 611
    .line 612
    new-instance v12, Ljava/util/ArrayList;

    .line 613
    .line 614
    const/16 v2, 0xa

    .line 615
    .line 616
    invoke-static {v1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 617
    .line 618
    .line 619
    move-result v2

    .line 620
    invoke-direct {v12, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 621
    .line 622
    .line 623
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 624
    .line 625
    .line 626
    move-result-object v1

    .line 627
    move v2, v8

    .line 628
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 629
    .line 630
    .line 631
    move-result v3

    .line 632
    if-eqz v3, :cond_13

    .line 633
    .line 634
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 635
    .line 636
    .line 637
    move-result-object v3

    .line 638
    check-cast v3, La/jge;

    .line 639
    .line 640
    invoke-static {v3, v0}, La/f140;->w(La/jge;Ljava/lang/String;)Z

    .line 641
    .line 642
    .line 643
    move-result v4

    .line 644
    if-eqz v4, :cond_12

    .line 645
    .line 646
    instance-of v4, v3, La/ege;

    .line 647
    .line 648
    if-eqz v4, :cond_12

    .line 649
    .line 650
    check-cast v3, La/ege;

    .line 651
    .line 652
    iget-object v2, v3, La/ege;->a:La/ha8;

    .line 653
    .line 654
    if-eqz v9, :cond_11

    .line 655
    .line 656
    new-instance v3, La/da8;

    .line 657
    .line 658
    invoke-interface {v2}, La/ha8;->a()Ljava/lang/Object;

    .line 659
    .line 660
    .line 661
    move-result-object v2

    .line 662
    invoke-direct {v3, v2, v9, v8}, La/da8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 663
    .line 664
    .line 665
    new-instance v2, La/ege;

    .line 666
    .line 667
    invoke-direct {v2, v3}, La/ege;-><init>(La/ha8;)V

    .line 668
    .line 669
    .line 670
    :goto_d
    move-object v3, v2

    .line 671
    goto :goto_e

    .line 672
    :cond_11
    new-instance v3, La/y98;

    .line 673
    .line 674
    invoke-interface {v2}, La/ha8;->a()Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    move-result-object v2

    .line 678
    invoke-direct {v3, v2}, La/y98;-><init>(Ljava/lang/Object;)V

    .line 679
    .line 680
    .line 681
    new-instance v2, La/ege;

    .line 682
    .line 683
    invoke-direct {v2, v3}, La/ege;-><init>(La/ha8;)V

    .line 684
    .line 685
    .line 686
    goto :goto_d

    .line 687
    :goto_e
    move v2, v7

    .line 688
    :cond_12
    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 689
    .line 690
    .line 691
    goto :goto_c

    .line 692
    :cond_13
    if-eqz v2, :cond_14

    .line 693
    .line 694
    const/4 v14, 0x0

    .line 695
    const v15, 0x3ff7f

    .line 696
    .line 697
    .line 698
    const/4 v11, 0x0

    .line 699
    const/4 v13, 0x0

    .line 700
    invoke-static/range {v10 .. v15}, La/p650;->a(La/p650;La/ql5;Ljava/util/ArrayList;Ljava/util/Set;ZI)La/p650;

    .line 701
    .line 702
    .line 703
    move-result-object v10

    .line 704
    :cond_14
    return-object v10

    .line 705
    :pswitch_a
    move-object/from16 v1, p1

    .line 706
    .line 707
    check-cast v1, La/fet;

    .line 708
    .line 709
    move-object/from16 v2, p2

    .line 710
    .line 711
    check-cast v2, Ljava/lang/Number;

    .line 712
    .line 713
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 714
    .line 715
    .line 716
    move-result v2

    .line 717
    and-int/lit8 v3, v2, 0x3

    .line 718
    .line 719
    if-eq v3, v6, :cond_15

    .line 720
    .line 721
    move v8, v7

    .line 722
    :cond_15
    and-int/2addr v2, v7

    .line 723
    invoke-virtual {v1, v2, v8}, La/fet;->U(IZ)Z

    .line 724
    .line 725
    .line 726
    move-result v2

    .line 727
    if-eqz v2, :cond_16

    .line 728
    .line 729
    invoke-static {v1}, La/xfn;->a(La/fet;)La/wfn;

    .line 730
    .line 731
    .line 732
    move-result-object v2

    .line 733
    iget v4, v2, La/wfn;->e:F

    .line 734
    .line 735
    const/4 v7, 0x0

    .line 736
    const/16 v8, 0xe

    .line 737
    .line 738
    sget-object v3, La/jm40;->b:La/jm40;

    .line 739
    .line 740
    const/4 v5, 0x0

    .line 741
    const/4 v6, 0x0

    .line 742
    invoke-static/range {v3 .. v8}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 743
    .line 744
    .line 745
    move-result-object v2

    .line 746
    check-cast v0, La/l7m0;

    .line 747
    .line 748
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    move-result-object v0

    .line 752
    check-cast v0, Ljava/lang/Number;

    .line 753
    .line 754
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 755
    .line 756
    .line 757
    move-result v0

    .line 758
    invoke-static {v2, v0}, La/epv0;->N(La/mm40;F)La/mm40;

    .line 759
    .line 760
    .line 761
    move-result-object v12

    .line 762
    check-cast v9, La/l7m0;

    .line 763
    .line 764
    invoke-interface {v9}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 765
    .line 766
    .line 767
    move-result-object v0

    .line 768
    check-cast v0, La/xew;

    .line 769
    .line 770
    iget-object v11, v0, La/xew;->a:Ljava/lang/String;

    .line 771
    .line 772
    sget-object v19, La/j1t0;->b:La/qrq;

    .line 773
    .line 774
    sget-wide v16, La/qmk;->w:J

    .line 775
    .line 776
    sget-wide v25, La/qmk;->I:J

    .line 777
    .line 778
    new-instance v13, La/y9q0;

    .line 779
    .line 780
    const/16 v24, 0x0

    .line 781
    .line 782
    const v27, 0xfdffdd

    .line 783
    .line 784
    .line 785
    const-wide/16 v14, 0x0

    .line 786
    .line 787
    const/16 v18, 0x0

    .line 788
    .line 789
    const-wide/16 v20, 0x0

    .line 790
    .line 791
    const/16 v22, 0x0

    .line 792
    .line 793
    const/16 v23, 0x0

    .line 794
    .line 795
    invoke-direct/range {v13 .. v27}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 796
    .line 797
    .line 798
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 799
    .line 800
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 801
    .line 802
    .line 803
    move-result-wide v2

    .line 804
    const/16 v34, 0x6180

    .line 805
    .line 806
    const v35, 0x1aff8

    .line 807
    .line 808
    .line 809
    const/4 v15, 0x0

    .line 810
    const-wide/16 v16, 0x0

    .line 811
    .line 812
    const/16 v19, 0x0

    .line 813
    .line 814
    const/16 v20, 0x0

    .line 815
    .line 816
    const-wide/16 v21, 0x0

    .line 817
    .line 818
    const/16 v23, 0x0

    .line 819
    .line 820
    const-wide/16 v24, 0x0

    .line 821
    .line 822
    const/16 v26, 0x2

    .line 823
    .line 824
    const/16 v27, 0x0

    .line 825
    .line 826
    const/16 v28, 0x2

    .line 827
    .line 828
    const/16 v29, 0x0

    .line 829
    .line 830
    const/16 v30, 0x0

    .line 831
    .line 832
    const/16 v33, 0x0

    .line 833
    .line 834
    move-object/from16 v32, v1

    .line 835
    .line 836
    move-object/from16 v31, v13

    .line 837
    .line 838
    move-wide v13, v2

    .line 839
    invoke-static/range {v11 .. v35}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 840
    .line 841
    .line 842
    goto :goto_f

    .line 843
    :cond_16
    move-object/from16 v32, v1

    .line 844
    .line 845
    invoke-virtual/range {v32 .. v32}, La/fet;->X()V

    .line 846
    .line 847
    .line 848
    :goto_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 849
    .line 850
    return-object v0

    .line 851
    :pswitch_b
    move-object/from16 v13, p1

    .line 852
    .line 853
    check-cast v13, La/fet;

    .line 854
    .line 855
    move-object/from16 v1, p2

    .line 856
    .line 857
    check-cast v1, Ljava/lang/Number;

    .line 858
    .line 859
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 860
    .line 861
    .line 862
    move-result v1

    .line 863
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 864
    .line 865
    and-int/lit8 v10, v1, 0x3

    .line 866
    .line 867
    if-eq v10, v6, :cond_17

    .line 868
    .line 869
    move v6, v7

    .line 870
    goto :goto_10

    .line 871
    :cond_17
    move v6, v8

    .line 872
    :goto_10
    and-int/2addr v1, v7

    .line 873
    invoke-virtual {v13, v1, v6}, La/fet;->U(IZ)Z

    .line 874
    .line 875
    .line 876
    move-result v1

    .line 877
    if-eqz v1, :cond_1b

    .line 878
    .line 879
    sget-object v1, La/qmk;->a:La/zcl;

    .line 880
    .line 881
    const/high16 v1, 0x42600000    # 56.0f

    .line 882
    .line 883
    invoke-static {v5, v1}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 884
    .line 885
    .line 886
    move-result-object v14

    .line 887
    invoke-virtual {v13, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 888
    .line 889
    .line 890
    move-result v1

    .line 891
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 892
    .line 893
    .line 894
    move-result-object v6

    .line 895
    if-nez v1, :cond_18

    .line 896
    .line 897
    if-ne v6, v2, :cond_19

    .line 898
    .line 899
    :cond_18
    new-instance v6, La/lfk;

    .line 900
    .line 901
    invoke-direct {v6, v0, v3}, La/lfk;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 902
    .line 903
    .line 904
    invoke-virtual {v13, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 905
    .line 906
    .line 907
    :cond_19
    move-object/from16 v19, v6

    .line 908
    .line 909
    check-cast v19, Lkotlin/jvm/functions/Function0;

    .line 910
    .line 911
    const/16 v20, 0x1c

    .line 912
    .line 913
    const/4 v15, 0x0

    .line 914
    const/16 v16, 0x0

    .line 915
    .line 916
    const/16 v17, 0x0

    .line 917
    .line 918
    const/16 v18, 0x0

    .line 919
    .line 920
    invoke-static/range {v14 .. v20}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 921
    .line 922
    .line 923
    move-result-object v0

    .line 924
    sget-object v1, La/gqw0;->e:La/zx7;

    .line 925
    .line 926
    check-cast v9, La/pz40;

    .line 927
    .line 928
    invoke-static {v1, v8}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 929
    .line 930
    .line 931
    move-result-object v1

    .line 932
    iget-wide v2, v13, La/fet;->T:J

    .line 933
    .line 934
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 935
    .line 936
    .line 937
    move-result v2

    .line 938
    invoke-virtual {v13}, La/fet;->m()La/bh90;

    .line 939
    .line 940
    .line 941
    move-result-object v3

    .line 942
    invoke-static {v13, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 943
    .line 944
    .line 945
    move-result-object v0

    .line 946
    sget-object v6, La/mkd;->c0:La/gqw0;

    .line 947
    .line 948
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 949
    .line 950
    .line 951
    invoke-virtual {v13}, La/fet;->i0()V

    .line 952
    .line 953
    .line 954
    iget-boolean v6, v13, La/fet;->S:Z

    .line 955
    .line 956
    if-eqz v6, :cond_1a

    .line 957
    .line 958
    invoke-virtual {v13, v4}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 959
    .line 960
    .line 961
    goto :goto_11

    .line 962
    :cond_1a
    invoke-virtual {v13}, La/fet;->r0()V

    .line 963
    .line 964
    .line 965
    :goto_11
    sget-object v4, La/gqw0;->x:La/shd;

    .line 966
    .line 967
    invoke-static {v13, v1, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 968
    .line 969
    .line 970
    sget-object v1, La/gqw0;->w:La/shd;

    .line 971
    .line 972
    invoke-static {v13, v3, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 973
    .line 974
    .line 975
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 976
    .line 977
    .line 978
    move-result-object v1

    .line 979
    sget-object v2, La/gqw0;->y:La/shd;

    .line 980
    .line 981
    invoke-static {v13, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 982
    .line 983
    .line 984
    invoke-static {v13}, La/jpm0;->n(La/fet;)V

    .line 985
    .line 986
    .line 987
    sget-object v1, La/gqw0;->v:La/shd;

    .line 988
    .line 989
    invoke-static {v13, v0, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 990
    .line 991
    .line 992
    const v0, 0x7f0807d9

    .line 993
    .line 994
    .line 995
    invoke-static {v0, v8, v13}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 996
    .line 997
    .line 998
    move-result-object v8

    .line 999
    sget-object v0, La/m8m0;->a:La/zfn;

    .line 1000
    .line 1001
    invoke-virtual {v13, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v1

    .line 1005
    check-cast v1, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 1006
    .line 1007
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 1008
    .line 1009
    .line 1010
    move-result-wide v11

    .line 1011
    sget-object v1, La/vgg0;->a:La/ugg0;

    .line 1012
    .line 1013
    invoke-static {v5, v1}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v1

    .line 1017
    const/high16 v2, 0x42100000    # 36.0f

    .line 1018
    .line 1019
    invoke-static {v1, v2}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v1

    .line 1023
    invoke-virtual {v13, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v0

    .line 1027
    check-cast v0, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 1028
    .line 1029
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getBlack40-0d7_KjU()J

    .line 1030
    .line 1031
    .line 1032
    move-result-wide v2

    .line 1033
    invoke-interface {v9}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v0

    .line 1037
    check-cast v0, Ljava/lang/Number;

    .line 1038
    .line 1039
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 1040
    .line 1041
    .line 1042
    move-result v0

    .line 1043
    invoke-static {v0, v2, v3}, La/y3d;->c(FJ)J

    .line 1044
    .line 1045
    .line 1046
    move-result-wide v2

    .line 1047
    sget-object v0, La/jd8;->n:La/ljc;

    .line 1048
    .line 1049
    invoke-static {v1, v2, v3, v0}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v0

    .line 1053
    const/high16 v1, 0x40c00000    # 6.0f

    .line 1054
    .line 1055
    invoke-static {v0, v1}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v10

    .line 1059
    const/16 v14, 0x38

    .line 1060
    .line 1061
    const/4 v15, 0x0

    .line 1062
    const/4 v9, 0x0

    .line 1063
    invoke-static/range {v8 .. v15}, La/dww;->c(La/pm80;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 1064
    .line 1065
    .line 1066
    invoke-virtual {v13, v7}, La/fet;->r(Z)V

    .line 1067
    .line 1068
    .line 1069
    goto :goto_12

    .line 1070
    :cond_1b
    invoke-virtual {v13}, La/fet;->X()V

    .line 1071
    .line 1072
    .line 1073
    :goto_12
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1074
    .line 1075
    return-object v0

    .line 1076
    :pswitch_c
    move-object/from16 v1, p1

    .line 1077
    .line 1078
    check-cast v1, Ljava/lang/Throwable;

    .line 1079
    .line 1080
    move-object/from16 v2, p2

    .line 1081
    .line 1082
    check-cast v2, Ljava/lang/String;

    .line 1083
    .line 1084
    check-cast v9, La/sit;

    .line 1085
    .line 1086
    iget-object v3, v9, La/i3t0;->f:La/oyg0;

    .line 1087
    .line 1088
    iget-object v4, v9, La/i3t0;->i:La/ocj;

    .line 1089
    .line 1090
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1091
    .line 1092
    .line 1093
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1094
    .line 1095
    .line 1096
    check-cast v0, Ljava/lang/Throwable;

    .line 1097
    .line 1098
    invoke-static {v0}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 1099
    .line 1100
    .line 1101
    move-result v0

    .line 1102
    if-nez v0, :cond_1d

    .line 1103
    .line 1104
    sget v0, La/sit;->G:I

    .line 1105
    .line 1106
    invoke-static {v9}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v10

    .line 1110
    iget-object v0, v9, La/sit;->q:La/mne;

    .line 1111
    .line 1112
    iget-object v13, v0, La/mne;->a:La/rwj;

    .line 1113
    .line 1114
    sget-object v11, La/rit;->a:La/rit;

    .line 1115
    .line 1116
    new-instance v14, La/j0s;

    .line 1117
    .line 1118
    const/4 v0, 0x0

    .line 1119
    const/16 v1, 0xc

    .line 1120
    .line 1121
    invoke-direct {v14, v9, v2, v0, v1}, La/j0s;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 1122
    .line 1123
    .line 1124
    const/16 v15, 0xa

    .line 1125
    .line 1126
    const/4 v12, 0x0

    .line 1127
    invoke-static/range {v10 .. v15}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1128
    .line 1129
    .line 1130
    iget-object v0, v4, La/ocj;->a:La/p7m0;

    .line 1131
    .line 1132
    :cond_1c
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v1

    .line 1136
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1137
    .line 1138
    .line 1139
    move-object v5, v1

    .line 1140
    check-cast v5, La/zht;

    .line 1141
    .line 1142
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1143
    .line 1144
    .line 1145
    const/4 v14, 0x0

    .line 1146
    const/16 v15, 0x3df

    .line 1147
    .line 1148
    const/4 v6, 0x0

    .line 1149
    const/4 v7, 0x0

    .line 1150
    const/4 v8, 0x0

    .line 1151
    const/4 v9, 0x0

    .line 1152
    const/4 v10, 0x0

    .line 1153
    const/4 v11, 0x0

    .line 1154
    const/4 v12, 0x0

    .line 1155
    const/4 v13, 0x0

    .line 1156
    invoke-static/range {v5 .. v15}, La/zht;->a(La/zht;La/zo80;La/bdq;ZLa/yo80;La/yo80;ZZLjava/util/List;Ljava/util/List;I)La/zht;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v2

    .line 1160
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1161
    .line 1162
    .line 1163
    move-result v1

    .line 1164
    if-eqz v1, :cond_1c

    .line 1165
    .line 1166
    :cond_1d
    sget v0, La/sit;->G:I

    .line 1167
    .line 1168
    iget-object v1, v4, La/ocj;->a:La/p7m0;

    .line 1169
    .line 1170
    :cond_1e
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v0

    .line 1174
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1175
    .line 1176
    .line 1177
    move-object v4, v0

    .line 1178
    check-cast v4, La/zht;

    .line 1179
    .line 1180
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1181
    .line 1182
    .line 1183
    const/4 v13, 0x0

    .line 1184
    const/16 v14, 0x39f

    .line 1185
    .line 1186
    const/4 v5, 0x0

    .line 1187
    const/4 v6, 0x0

    .line 1188
    const/4 v7, 0x0

    .line 1189
    const/4 v8, 0x0

    .line 1190
    const/4 v9, 0x0

    .line 1191
    const/4 v10, 0x0

    .line 1192
    const/4 v11, 0x1

    .line 1193
    const/4 v12, 0x0

    .line 1194
    invoke-static/range {v4 .. v14}, La/zht;->a(La/zht;La/zo80;La/bdq;ZLa/yo80;La/yo80;ZZLjava/util/List;Ljava/util/List;I)La/zht;

    .line 1195
    .line 1196
    .line 1197
    move-result-object v2

    .line 1198
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1199
    .line 1200
    .line 1201
    move-result v0

    .line 1202
    if-eqz v0, :cond_1e

    .line 1203
    .line 1204
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1205
    .line 1206
    return-object v0

    .line 1207
    :pswitch_d
    move-object/from16 v1, p1

    .line 1208
    .line 1209
    check-cast v1, La/x8z;

    .line 1210
    .line 1211
    move-object/from16 v2, p2

    .line 1212
    .line 1213
    check-cast v2, Ljava/lang/Number;

    .line 1214
    .line 1215
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 1216
    .line 1217
    .line 1218
    move-result v2

    .line 1219
    check-cast v0, La/cl2;

    .line 1220
    .line 1221
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v3

    .line 1225
    check-cast v9, Ljava/util/List;

    .line 1226
    .line 1227
    invoke-interface {v9, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v2

    .line 1231
    invoke-virtual {v0, v1, v3, v2}, La/cl2;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v0

    .line 1235
    check-cast v0, La/pgv;

    .line 1236
    .line 1237
    return-object v0

    .line 1238
    :pswitch_e
    move-object/from16 v1, p1

    .line 1239
    .line 1240
    check-cast v1, La/x8z;

    .line 1241
    .line 1242
    move-object/from16 v2, p2

    .line 1243
    .line 1244
    check-cast v2, Ljava/lang/Number;

    .line 1245
    .line 1246
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 1247
    .line 1248
    .line 1249
    move-result v2

    .line 1250
    check-cast v0, La/cl2;

    .line 1251
    .line 1252
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v3

    .line 1256
    check-cast v9, Ljava/util/List;

    .line 1257
    .line 1258
    invoke-interface {v9, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v2

    .line 1262
    invoke-virtual {v0, v1, v3, v2}, La/cl2;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v0

    .line 1266
    check-cast v0, La/pgv;

    .line 1267
    .line 1268
    return-object v0

    .line 1269
    :pswitch_f
    move-object/from16 v1, p1

    .line 1270
    .line 1271
    check-cast v1, La/x8z;

    .line 1272
    .line 1273
    move-object/from16 v2, p2

    .line 1274
    .line 1275
    check-cast v2, Ljava/lang/Number;

    .line 1276
    .line 1277
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 1278
    .line 1279
    .line 1280
    move-result v2

    .line 1281
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1282
    .line 1283
    .line 1284
    check-cast v0, La/f4m;

    .line 1285
    .line 1286
    check-cast v9, La/a4x;

    .line 1287
    .line 1288
    invoke-interface {v9, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v2

    .line 1292
    invoke-virtual {v0, v1, v2}, La/f4m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v0

    .line 1296
    check-cast v0, La/pgv;

    .line 1297
    .line 1298
    return-object v0

    .line 1299
    :pswitch_10
    move-object/from16 v1, p1

    .line 1300
    .line 1301
    check-cast v1, La/fet;

    .line 1302
    .line 1303
    move-object/from16 v2, p2

    .line 1304
    .line 1305
    check-cast v2, Ljava/lang/Number;

    .line 1306
    .line 1307
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 1308
    .line 1309
    .line 1310
    move-result v2

    .line 1311
    check-cast v9, La/psk;

    .line 1312
    .line 1313
    and-int/lit8 v3, v2, 0x3

    .line 1314
    .line 1315
    if-eq v3, v6, :cond_1f

    .line 1316
    .line 1317
    move v8, v7

    .line 1318
    :cond_1f
    and-int/2addr v2, v7

    .line 1319
    invoke-virtual {v1, v2, v8}, La/fet;->U(IZ)Z

    .line 1320
    .line 1321
    .line 1322
    move-result v2

    .line 1323
    if-eqz v2, :cond_21

    .line 1324
    .line 1325
    check-cast v0, La/l7m0;

    .line 1326
    .line 1327
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v0

    .line 1331
    check-cast v0, Ljava/lang/Number;

    .line 1332
    .line 1333
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 1334
    .line 1335
    .line 1336
    move-result v0

    .line 1337
    invoke-static {v5, v0}, La/epv0;->N(La/mm40;F)La/mm40;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v0

    .line 1341
    const/high16 v2, 0x3f800000    # 1.0f

    .line 1342
    .line 1343
    invoke-static {v0, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v3

    .line 1347
    sget-object v0, La/qmk;->a:La/zcl;

    .line 1348
    .line 1349
    iget-object v0, v9, La/psk;->e:La/qt20;

    .line 1350
    .line 1351
    instance-of v0, v0, La/ot20;

    .line 1352
    .line 1353
    if-eqz v0, :cond_20

    .line 1354
    .line 1355
    const/high16 v0, 0x41000000    # 8.0f

    .line 1356
    .line 1357
    :goto_13
    move v6, v0

    .line 1358
    goto :goto_14

    .line 1359
    :cond_20
    const/high16 v0, 0x42800000    # 64.0f

    .line 1360
    .line 1361
    goto :goto_13

    .line 1362
    :goto_14
    const/4 v7, 0x0

    .line 1363
    const/16 v8, 0xa

    .line 1364
    .line 1365
    const/high16 v4, 0x41000000    # 8.0f

    .line 1366
    .line 1367
    const/4 v5, 0x0

    .line 1368
    invoke-static/range {v3 .. v8}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1369
    .line 1370
    .line 1371
    move-result-object v0

    .line 1372
    const-string v2, "DISCIPLINE_DETAILS_ICON_FOCUS_TOOLBAR_COLLAPSED_TITLE"

    .line 1373
    .line 1374
    invoke-static {v0, v2}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 1375
    .line 1376
    .line 1377
    move-result-object v2

    .line 1378
    iget-object v0, v9, La/psk;->d:Ljava/lang/String;

    .line 1379
    .line 1380
    sget-object v9, La/j1t0;->b:La/qrq;

    .line 1381
    .line 1382
    sget-wide v6, La/qmk;->u:J

    .line 1383
    .line 1384
    sget-wide v15, La/qmk;->H:J

    .line 1385
    .line 1386
    new-instance v3, La/y9q0;

    .line 1387
    .line 1388
    const/4 v14, 0x0

    .line 1389
    const v17, 0xfdffdd

    .line 1390
    .line 1391
    .line 1392
    const-wide/16 v4, 0x0

    .line 1393
    .line 1394
    const/4 v8, 0x0

    .line 1395
    const-wide/16 v10, 0x0

    .line 1396
    .line 1397
    const/4 v12, 0x0

    .line 1398
    const/4 v13, 0x0

    .line 1399
    invoke-direct/range {v3 .. v17}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 1400
    .line 1401
    .line 1402
    sget-object v4, La/zaq0;->b:La/zfn;

    .line 1403
    .line 1404
    invoke-virtual {v1, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v4

    .line 1408
    check-cast v4, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1409
    .line 1410
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 1411
    .line 1412
    .line 1413
    move-result-wide v4

    .line 1414
    new-instance v13, La/f2q0;

    .line 1415
    .line 1416
    const/4 v6, 0x3

    .line 1417
    invoke-direct {v13, v6}, La/f2q0;-><init>(I)V

    .line 1418
    .line 1419
    .line 1420
    const/16 v24, 0x6180

    .line 1421
    .line 1422
    const v25, 0x1abf8

    .line 1423
    .line 1424
    .line 1425
    move-object/from16 v21, v3

    .line 1426
    .line 1427
    move-wide v3, v4

    .line 1428
    const/4 v5, 0x0

    .line 1429
    const-wide/16 v6, 0x0

    .line 1430
    .line 1431
    const/4 v9, 0x0

    .line 1432
    const/4 v10, 0x0

    .line 1433
    const-wide/16 v11, 0x0

    .line 1434
    .line 1435
    const-wide/16 v14, 0x0

    .line 1436
    .line 1437
    const/16 v16, 0x2

    .line 1438
    .line 1439
    const/16 v17, 0x0

    .line 1440
    .line 1441
    const/16 v18, 0x1

    .line 1442
    .line 1443
    const/16 v19, 0x0

    .line 1444
    .line 1445
    const/16 v20, 0x0

    .line 1446
    .line 1447
    const/16 v23, 0x0

    .line 1448
    .line 1449
    move-object/from16 v22, v1

    .line 1450
    .line 1451
    move-object v1, v0

    .line 1452
    invoke-static/range {v1 .. v25}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 1453
    .line 1454
    .line 1455
    goto :goto_15

    .line 1456
    :cond_21
    move-object/from16 v22, v1

    .line 1457
    .line 1458
    invoke-virtual/range {v22 .. v22}, La/fet;->X()V

    .line 1459
    .line 1460
    .line 1461
    :goto_15
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1462
    .line 1463
    return-object v0

    .line 1464
    :pswitch_11
    move-object/from16 v1, p1

    .line 1465
    .line 1466
    check-cast v1, La/fet;

    .line 1467
    .line 1468
    move-object/from16 v2, p2

    .line 1469
    .line 1470
    check-cast v2, Ljava/lang/Number;

    .line 1471
    .line 1472
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 1473
    .line 1474
    .line 1475
    move-result v2

    .line 1476
    and-int/lit8 v3, v2, 0x3

    .line 1477
    .line 1478
    if-eq v3, v6, :cond_22

    .line 1479
    .line 1480
    move v3, v7

    .line 1481
    goto :goto_16

    .line 1482
    :cond_22
    move v3, v8

    .line 1483
    :goto_16
    and-int/2addr v2, v7

    .line 1484
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 1485
    .line 1486
    .line 1487
    move-result v2

    .line 1488
    if-eqz v2, :cond_24

    .line 1489
    .line 1490
    check-cast v0, La/nsk;

    .line 1491
    .line 1492
    iget-object v0, v0, La/nsk;->b:La/mqk;

    .line 1493
    .line 1494
    iget-object v0, v0, La/mqk;->a:La/lqk;

    .line 1495
    .line 1496
    instance-of v2, v0, La/iqk;

    .line 1497
    .line 1498
    if-eqz v2, :cond_23

    .line 1499
    .line 1500
    const v2, -0x10f50e41

    .line 1501
    .line 1502
    .line 1503
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 1504
    .line 1505
    .line 1506
    check-cast v9, La/l7m0;

    .line 1507
    .line 1508
    invoke-interface {v9}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1509
    .line 1510
    .line 1511
    move-result-object v2

    .line 1512
    check-cast v2, Ljava/lang/Number;

    .line 1513
    .line 1514
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 1515
    .line 1516
    .line 1517
    move-result v2

    .line 1518
    invoke-static {v5, v2}, La/epv0;->N(La/mm40;F)La/mm40;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v10

    .line 1522
    check-cast v0, La/iqk;

    .line 1523
    .line 1524
    iget-object v9, v0, La/iqk;->a:Ljava/lang/String;

    .line 1525
    .line 1526
    sget-object v17, La/j1t0;->b:La/qrq;

    .line 1527
    .line 1528
    sget-wide v14, La/qmk;->u:J

    .line 1529
    .line 1530
    sget-wide v23, La/qmk;->H:J

    .line 1531
    .line 1532
    new-instance v29, La/y9q0;

    .line 1533
    .line 1534
    const/16 v22, 0x0

    .line 1535
    .line 1536
    const v25, 0xfdffdd

    .line 1537
    .line 1538
    .line 1539
    const-wide/16 v12, 0x0

    .line 1540
    .line 1541
    const/16 v16, 0x0

    .line 1542
    .line 1543
    const-wide/16 v18, 0x0

    .line 1544
    .line 1545
    const/16 v20, 0x0

    .line 1546
    .line 1547
    const/16 v21, 0x0

    .line 1548
    .line 1549
    move-object/from16 v11, v29

    .line 1550
    .line 1551
    invoke-direct/range {v11 .. v25}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 1552
    .line 1553
    .line 1554
    sget-object v0, La/m8m0;->a:La/zfn;

    .line 1555
    .line 1556
    invoke-virtual {v1, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 1557
    .line 1558
    .line 1559
    move-result-object v0

    .line 1560
    check-cast v0, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 1561
    .line 1562
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 1563
    .line 1564
    .line 1565
    move-result-wide v11

    .line 1566
    const/16 v32, 0x0

    .line 1567
    .line 1568
    const v33, 0x1fff8

    .line 1569
    .line 1570
    .line 1571
    const/4 v13, 0x0

    .line 1572
    const-wide/16 v14, 0x0

    .line 1573
    .line 1574
    const/16 v17, 0x0

    .line 1575
    .line 1576
    const/16 v18, 0x0

    .line 1577
    .line 1578
    const-wide/16 v19, 0x0

    .line 1579
    .line 1580
    const/16 v21, 0x0

    .line 1581
    .line 1582
    const-wide/16 v22, 0x0

    .line 1583
    .line 1584
    const/16 v24, 0x0

    .line 1585
    .line 1586
    const/16 v25, 0x0

    .line 1587
    .line 1588
    const/16 v26, 0x0

    .line 1589
    .line 1590
    const/16 v27, 0x0

    .line 1591
    .line 1592
    const/16 v28, 0x0

    .line 1593
    .line 1594
    const/16 v31, 0x0

    .line 1595
    .line 1596
    move-object/from16 v30, v1

    .line 1597
    .line 1598
    invoke-static/range {v9 .. v33}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 1599
    .line 1600
    .line 1601
    move-object/from16 v0, v30

    .line 1602
    .line 1603
    invoke-virtual {v0, v8}, La/fet;->r(Z)V

    .line 1604
    .line 1605
    .line 1606
    goto :goto_17

    .line 1607
    :cond_23
    move-object v0, v1

    .line 1608
    const v1, -0x4ade7167

    .line 1609
    .line 1610
    .line 1611
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 1612
    .line 1613
    .line 1614
    invoke-virtual {v0, v8}, La/fet;->r(Z)V

    .line 1615
    .line 1616
    .line 1617
    goto :goto_17

    .line 1618
    :cond_24
    move-object v0, v1

    .line 1619
    invoke-virtual {v0}, La/fet;->X()V

    .line 1620
    .line 1621
    .line 1622
    :goto_17
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1623
    .line 1624
    return-object v0

    .line 1625
    :pswitch_12
    check-cast v0, La/kp9;

    .line 1626
    .line 1627
    check-cast v9, La/kp9;

    .line 1628
    .line 1629
    move-object/from16 v1, p1

    .line 1630
    .line 1631
    check-cast v1, La/vjj;

    .line 1632
    .line 1633
    move-object/from16 v2, p2

    .line 1634
    .line 1635
    check-cast v2, La/vjj;

    .line 1636
    .line 1637
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1638
    .line 1639
    .line 1640
    move-result v0

    .line 1641
    if-eqz v0, :cond_25

    .line 1642
    .line 1643
    invoke-static {v2, v9}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1644
    .line 1645
    .line 1646
    move-result v0

    .line 1647
    if-eqz v0, :cond_25

    .line 1648
    .line 1649
    goto :goto_18

    .line 1650
    :cond_25
    move v7, v8

    .line 1651
    :goto_18
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1652
    .line 1653
    .line 1654
    move-result-object v0

    .line 1655
    return-object v0

    .line 1656
    :pswitch_13
    move-object/from16 v1, p1

    .line 1657
    .line 1658
    check-cast v1, La/fet;

    .line 1659
    .line 1660
    move-object/from16 v2, p2

    .line 1661
    .line 1662
    check-cast v2, Ljava/lang/Number;

    .line 1663
    .line 1664
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 1665
    .line 1666
    .line 1667
    move-result v2

    .line 1668
    and-int/lit8 v10, v2, 0x3

    .line 1669
    .line 1670
    if-eq v10, v6, :cond_26

    .line 1671
    .line 1672
    move v8, v7

    .line 1673
    :cond_26
    and-int/2addr v2, v7

    .line 1674
    invoke-virtual {v1, v2, v8}, La/fet;->U(IZ)Z

    .line 1675
    .line 1676
    .line 1677
    move-result v2

    .line 1678
    if-eqz v2, :cond_2a

    .line 1679
    .line 1680
    sget v2, La/ee9;->b:F

    .line 1681
    .line 1682
    sget v6, La/ee9;->c:F

    .line 1683
    .line 1684
    invoke-static {v5, v2, v6}, La/o7k0;->a(La/mm40;FF)La/mm40;

    .line 1685
    .line 1686
    .line 1687
    move-result-object v2

    .line 1688
    check-cast v0, La/hh80;

    .line 1689
    .line 1690
    invoke-static {v2, v0}, La/s5x0;->I(La/mm40;La/hh80;)La/mm40;

    .line 1691
    .line 1692
    .line 1693
    move-result-object v0

    .line 1694
    sget-object v2, La/uc9;->e:La/nw3;

    .line 1695
    .line 1696
    sget-object v5, La/gqw0;->k:La/yx7;

    .line 1697
    .line 1698
    check-cast v9, La/ugd;

    .line 1699
    .line 1700
    const/16 v6, 0x36

    .line 1701
    .line 1702
    invoke-static {v2, v5, v1, v6}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 1703
    .line 1704
    .line 1705
    move-result-object v2

    .line 1706
    invoke-static {v1}, La/e3c;->x(La/fet;)I

    .line 1707
    .line 1708
    .line 1709
    move-result v5

    .line 1710
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 1711
    .line 1712
    .line 1713
    move-result-object v6

    .line 1714
    invoke-static {v1, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 1715
    .line 1716
    .line 1717
    move-result-object v0

    .line 1718
    sget-object v8, La/mkd;->c0:La/gqw0;

    .line 1719
    .line 1720
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1721
    .line 1722
    .line 1723
    invoke-virtual {v1}, La/fet;->i0()V

    .line 1724
    .line 1725
    .line 1726
    iget-boolean v8, v1, La/fet;->S:Z

    .line 1727
    .line 1728
    if-eqz v8, :cond_27

    .line 1729
    .line 1730
    invoke-virtual {v1, v4}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 1731
    .line 1732
    .line 1733
    goto :goto_19

    .line 1734
    :cond_27
    invoke-virtual {v1}, La/fet;->r0()V

    .line 1735
    .line 1736
    .line 1737
    :goto_19
    sget-object v4, La/gqw0;->x:La/shd;

    .line 1738
    .line 1739
    invoke-static {v1, v2, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1740
    .line 1741
    .line 1742
    sget-object v2, La/gqw0;->w:La/shd;

    .line 1743
    .line 1744
    invoke-static {v1, v6, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1745
    .line 1746
    .line 1747
    sget-object v2, La/gqw0;->y:La/shd;

    .line 1748
    .line 1749
    iget-boolean v4, v1, La/fet;->S:Z

    .line 1750
    .line 1751
    if-nez v4, :cond_28

    .line 1752
    .line 1753
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1754
    .line 1755
    .line 1756
    move-result-object v4

    .line 1757
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1758
    .line 1759
    .line 1760
    move-result-object v6

    .line 1761
    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1762
    .line 1763
    .line 1764
    move-result v4

    .line 1765
    if-nez v4, :cond_29

    .line 1766
    .line 1767
    :cond_28
    invoke-static {v5, v1, v5, v2}, La/rw2;->t(ILa/fet;ILa/shd;)V

    .line 1768
    .line 1769
    .line 1770
    :cond_29
    sget-object v2, La/gqw0;->v:La/shd;

    .line 1771
    .line 1772
    invoke-static {v1, v0, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1773
    .line 1774
    .line 1775
    sget-object v0, La/zhg0;->a:La/zhg0;

    .line 1776
    .line 1777
    invoke-static {v3, v9, v0, v1, v7}, La/h97;->p(ILa/ugd;La/zhg0;La/fet;Z)V

    .line 1778
    .line 1779
    .line 1780
    goto :goto_1a

    .line 1781
    :cond_2a
    invoke-virtual {v1}, La/fet;->X()V

    .line 1782
    .line 1783
    .line 1784
    :goto_1a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1785
    .line 1786
    return-object v0

    .line 1787
    :pswitch_14
    move-object/from16 v1, p1

    .line 1788
    .line 1789
    check-cast v1, La/fet;

    .line 1790
    .line 1791
    move-object/from16 v2, p2

    .line 1792
    .line 1793
    check-cast v2, Ljava/lang/Number;

    .line 1794
    .line 1795
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 1796
    .line 1797
    .line 1798
    move-result v2

    .line 1799
    and-int/lit8 v3, v2, 0x3

    .line 1800
    .line 1801
    if-eq v3, v6, :cond_2b

    .line 1802
    .line 1803
    move v3, v7

    .line 1804
    goto :goto_1b

    .line 1805
    :cond_2b
    move v3, v8

    .line 1806
    :goto_1b
    and-int/2addr v2, v7

    .line 1807
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 1808
    .line 1809
    .line 1810
    move-result v2

    .line 1811
    if-eqz v2, :cond_2c

    .line 1812
    .line 1813
    check-cast v0, La/xdr;

    .line 1814
    .line 1815
    check-cast v9, La/bq8;

    .line 1816
    .line 1817
    iget-object v2, v9, La/bq8;->b:La/odk0;

    .line 1818
    .line 1819
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1820
    .line 1821
    .line 1822
    move-result-object v3

    .line 1823
    invoke-interface {v0, v2, v1, v3}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1824
    .line 1825
    .line 1826
    goto :goto_1c

    .line 1827
    :cond_2c
    invoke-virtual {v1}, La/fet;->X()V

    .line 1828
    .line 1829
    .line 1830
    :goto_1c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1831
    .line 1832
    return-object v0

    .line 1833
    :pswitch_15
    move-object/from16 v1, p1

    .line 1834
    .line 1835
    check-cast v1, La/fet;

    .line 1836
    .line 1837
    move-object/from16 v3, p2

    .line 1838
    .line 1839
    check-cast v3, Ljava/lang/Number;

    .line 1840
    .line 1841
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 1842
    .line 1843
    .line 1844
    move-result v3

    .line 1845
    check-cast v0, Ljava/lang/String;

    .line 1846
    .line 1847
    and-int/lit8 v10, v3, 0x3

    .line 1848
    .line 1849
    if-eq v10, v6, :cond_2d

    .line 1850
    .line 1851
    move v6, v7

    .line 1852
    goto :goto_1d

    .line 1853
    :cond_2d
    move v6, v8

    .line 1854
    :goto_1d
    and-int/2addr v3, v7

    .line 1855
    invoke-virtual {v1, v3, v6}, La/fet;->U(IZ)Z

    .line 1856
    .line 1857
    .line 1858
    move-result v3

    .line 1859
    if-eqz v3, :cond_33

    .line 1860
    .line 1861
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1862
    .line 1863
    .line 1864
    move-result v3

    .line 1865
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1866
    .line 1867
    .line 1868
    move-result-object v6

    .line 1869
    if-nez v3, :cond_2e

    .line 1870
    .line 1871
    if-ne v6, v2, :cond_2f

    .line 1872
    .line 1873
    :cond_2e
    new-instance v6, La/ka6;

    .line 1874
    .line 1875
    invoke-direct {v6, v0, v8}, La/ka6;-><init>(Ljava/lang/String;B)V

    .line 1876
    .line 1877
    .line 1878
    invoke-virtual {v1, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1879
    .line 1880
    .line 1881
    :cond_2f
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 1882
    .line 1883
    invoke-static {v5, v8, v6}, La/pai0;->a(La/mm40;ZLkotlin/jvm/functions/Function1;)La/mm40;

    .line 1884
    .line 1885
    .line 1886
    move-result-object v0

    .line 1887
    check-cast v9, La/ugd;

    .line 1888
    .line 1889
    sget-object v2, La/gqw0;->a:La/zx7;

    .line 1890
    .line 1891
    invoke-static {v2, v8}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 1892
    .line 1893
    .line 1894
    move-result-object v2

    .line 1895
    invoke-static {v1}, La/e3c;->x(La/fet;)I

    .line 1896
    .line 1897
    .line 1898
    move-result v3

    .line 1899
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 1900
    .line 1901
    .line 1902
    move-result-object v5

    .line 1903
    invoke-static {v1, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 1904
    .line 1905
    .line 1906
    move-result-object v0

    .line 1907
    sget-object v6, La/mkd;->c0:La/gqw0;

    .line 1908
    .line 1909
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1910
    .line 1911
    .line 1912
    invoke-virtual {v1}, La/fet;->i0()V

    .line 1913
    .line 1914
    .line 1915
    iget-boolean v6, v1, La/fet;->S:Z

    .line 1916
    .line 1917
    if-eqz v6, :cond_30

    .line 1918
    .line 1919
    invoke-virtual {v1, v4}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 1920
    .line 1921
    .line 1922
    goto :goto_1e

    .line 1923
    :cond_30
    invoke-virtual {v1}, La/fet;->r0()V

    .line 1924
    .line 1925
    .line 1926
    :goto_1e
    sget-object v4, La/gqw0;->x:La/shd;

    .line 1927
    .line 1928
    invoke-static {v1, v2, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1929
    .line 1930
    .line 1931
    sget-object v2, La/gqw0;->w:La/shd;

    .line 1932
    .line 1933
    invoke-static {v1, v5, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1934
    .line 1935
    .line 1936
    sget-object v2, La/gqw0;->y:La/shd;

    .line 1937
    .line 1938
    iget-boolean v4, v1, La/fet;->S:Z

    .line 1939
    .line 1940
    if-nez v4, :cond_31

    .line 1941
    .line 1942
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1943
    .line 1944
    .line 1945
    move-result-object v4

    .line 1946
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1947
    .line 1948
    .line 1949
    move-result-object v5

    .line 1950
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1951
    .line 1952
    .line 1953
    move-result v4

    .line 1954
    if-nez v4, :cond_32

    .line 1955
    .line 1956
    :cond_31
    invoke-static {v3, v1, v3, v2}, La/rw2;->t(ILa/fet;ILa/shd;)V

    .line 1957
    .line 1958
    .line 1959
    :cond_32
    sget-object v2, La/gqw0;->v:La/shd;

    .line 1960
    .line 1961
    invoke-static {v1, v0, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1962
    .line 1963
    .line 1964
    invoke-static {v8, v9, v1, v7}, La/twn;->v(ILa/ugd;La/fet;Z)V

    .line 1965
    .line 1966
    .line 1967
    goto :goto_1f

    .line 1968
    :cond_33
    invoke-virtual {v1}, La/fet;->X()V

    .line 1969
    .line 1970
    .line 1971
    :goto_1f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1972
    .line 1973
    return-object v0

    .line 1974
    :pswitch_16
    move-object/from16 v1, p1

    .line 1975
    .line 1976
    check-cast v1, La/x8z;

    .line 1977
    .line 1978
    move-object/from16 v2, p2

    .line 1979
    .line 1980
    check-cast v2, Ljava/lang/Number;

    .line 1981
    .line 1982
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 1983
    .line 1984
    .line 1985
    move-result v2

    .line 1986
    check-cast v0, La/ma2;

    .line 1987
    .line 1988
    check-cast v9, Ljava/util/List;

    .line 1989
    .line 1990
    invoke-interface {v9, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1991
    .line 1992
    .line 1993
    move-result-object v2

    .line 1994
    invoke-virtual {v0, v1, v2}, La/ma2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1995
    .line 1996
    .line 1997
    move-result-object v0

    .line 1998
    check-cast v0, La/pgv;

    .line 1999
    .line 2000
    return-object v0

    .line 2001
    :pswitch_17
    move-object/from16 v1, p1

    .line 2002
    .line 2003
    check-cast v1, La/x8z;

    .line 2004
    .line 2005
    move-object/from16 v2, p2

    .line 2006
    .line 2007
    check-cast v2, Ljava/lang/Number;

    .line 2008
    .line 2009
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 2010
    .line 2011
    .line 2012
    move-result v2

    .line 2013
    check-cast v0, La/cl2;

    .line 2014
    .line 2015
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2016
    .line 2017
    .line 2018
    move-result-object v3

    .line 2019
    check-cast v9, La/a4x;

    .line 2020
    .line 2021
    invoke-interface {v9, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2022
    .line 2023
    .line 2024
    move-result-object v2

    .line 2025
    invoke-virtual {v0, v1, v3, v2}, La/cl2;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2026
    .line 2027
    .line 2028
    move-result-object v0

    .line 2029
    check-cast v0, La/pgv;

    .line 2030
    .line 2031
    return-object v0

    .line 2032
    :pswitch_18
    move-object/from16 v1, p1

    .line 2033
    .line 2034
    check-cast v1, La/x8z;

    .line 2035
    .line 2036
    move-object/from16 v2, p2

    .line 2037
    .line 2038
    check-cast v2, Ljava/lang/Number;

    .line 2039
    .line 2040
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 2041
    .line 2042
    .line 2043
    move-result v2

    .line 2044
    check-cast v0, La/ahd;

    .line 2045
    .line 2046
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2047
    .line 2048
    .line 2049
    move-result-object v3

    .line 2050
    check-cast v9, La/a4x;

    .line 2051
    .line 2052
    invoke-interface {v9, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2053
    .line 2054
    .line 2055
    move-result-object v2

    .line 2056
    invoke-virtual {v0, v1, v3, v2}, La/ahd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2057
    .line 2058
    .line 2059
    move-result-object v0

    .line 2060
    check-cast v0, La/pgv;

    .line 2061
    .line 2062
    return-object v0

    .line 2063
    :pswitch_19
    move-object/from16 v1, p1

    .line 2064
    .line 2065
    check-cast v1, La/x8z;

    .line 2066
    .line 2067
    move-object/from16 v2, p2

    .line 2068
    .line 2069
    check-cast v2, Ljava/lang/Number;

    .line 2070
    .line 2071
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 2072
    .line 2073
    .line 2074
    move-result v2

    .line 2075
    check-cast v0, La/ahd;

    .line 2076
    .line 2077
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2078
    .line 2079
    .line 2080
    move-result-object v3

    .line 2081
    check-cast v9, Ljava/util/List;

    .line 2082
    .line 2083
    invoke-interface {v9, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2084
    .line 2085
    .line 2086
    move-result-object v2

    .line 2087
    invoke-virtual {v0, v1, v3, v2}, La/ahd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2088
    .line 2089
    .line 2090
    move-result-object v0

    .line 2091
    check-cast v0, La/pgv;

    .line 2092
    .line 2093
    return-object v0

    .line 2094
    :pswitch_1a
    move-object/from16 v1, p1

    .line 2095
    .line 2096
    check-cast v1, La/x8z;

    .line 2097
    .line 2098
    move-object/from16 v2, p2

    .line 2099
    .line 2100
    check-cast v2, Ljava/lang/Number;

    .line 2101
    .line 2102
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 2103
    .line 2104
    .line 2105
    move-result v2

    .line 2106
    check-cast v0, La/ahd;

    .line 2107
    .line 2108
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2109
    .line 2110
    .line 2111
    move-result-object v3

    .line 2112
    check-cast v9, Ljava/util/List;

    .line 2113
    .line 2114
    invoke-interface {v9, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2115
    .line 2116
    .line 2117
    move-result-object v2

    .line 2118
    invoke-virtual {v0, v1, v3, v2}, La/ahd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2119
    .line 2120
    .line 2121
    move-result-object v0

    .line 2122
    check-cast v0, La/pgv;

    .line 2123
    .line 2124
    return-object v0

    .line 2125
    :pswitch_data_0
    .packed-switch 0x0
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
