.class public final synthetic La/aqk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/bqk;


# direct methods
.method public synthetic constructor <init>(La/bqk;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/aqk;->a:B

    iput-object p1, p0, La/aqk;->b:La/bqk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/aqk;->a:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    const v4, 0x7f1300e4

    .line 8
    .line 9
    .line 10
    const/16 v5, 0xa

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x0

    .line 14
    iget-object v0, v0, La/aqk;->b:La/bqk;

    .line 15
    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    move-object/from16 v1, p1

    .line 20
    .line 21
    check-cast v1, Ljava/util/List;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v0, v0, La/bqk;->b:La/ctf0;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    sget-object v0, La/iun;->a:La/iun;

    .line 42
    .line 43
    goto/16 :goto_3

    .line 44
    .line 45
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    new-instance v6, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    if-eqz v8, :cond_2

    .line 64
    .line 65
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    move-object v9, v8

    .line 70
    check-cast v9, La/xah;

    .line 71
    .line 72
    iget-boolean v9, v9, La/xah;->n:Z

    .line 73
    .line 74
    if-eqz v9, :cond_1

    .line 75
    .line 76
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    const-string v8, " "

    .line 89
    .line 90
    const v9, 0x7f131662

    .line 91
    .line 92
    .line 93
    if-nez v1, :cond_4

    .line 94
    .line 95
    new-instance v1, La/nuj;

    .line 96
    .line 97
    new-array v10, v7, [Ljava/lang/Object;

    .line 98
    .line 99
    iget-object v11, v0, La/ctf0;->b:La/lsm0;

    .line 100
    .line 101
    invoke-static {v10, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v10

    .line 105
    invoke-virtual {v11, v9, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v10

    .line 109
    new-array v12, v7, [Ljava/lang/Object;

    .line 110
    .line 111
    invoke-static {v12, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v12

    .line 115
    const v13, 0x7f1305ce

    .line 116
    .line 117
    .line 118
    invoke-virtual {v11, v13, v12}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v12

    .line 122
    invoke-static {v10, v8, v12}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v14

    .line 126
    new-instance v10, La/ue9;

    .line 127
    .line 128
    new-array v12, v7, [Ljava/lang/Object;

    .line 129
    .line 130
    invoke-static {v12, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v12

    .line 134
    invoke-virtual {v11, v4, v12}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v11

    .line 138
    invoke-direct {v10, v11}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    new-instance v13, La/hjm;

    .line 142
    .line 143
    const/16 v25, 0x0

    .line 144
    .line 145
    const/16 v26, 0x1bbe

    .line 146
    .line 147
    const/4 v15, 0x0

    .line 148
    const/16 v16, 0x0

    .line 149
    .line 150
    const/16 v17, 0x0

    .line 151
    .line 152
    const/16 v18, 0x0

    .line 153
    .line 154
    const/16 v19, 0x0

    .line 155
    .line 156
    const/16 v20, 0x1

    .line 157
    .line 158
    const/16 v21, 0x0

    .line 159
    .line 160
    const/16 v22, 0x0

    .line 161
    .line 162
    const/16 v23, 0x0

    .line 163
    .line 164
    move-object/from16 v24, v10

    .line 165
    .line 166
    invoke-direct/range {v13 .. v26}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 167
    .line 168
    .line 169
    const-string v10, "HEADER_CHAMPIONSHIPS_REAL_LIVE"

    .line 170
    .line 171
    invoke-direct {v1, v10, v13}, La/nuj;-><init>(Ljava/lang/String;La/jjm;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    new-instance v1, Ljava/util/ArrayList;

    .line 178
    .line 179
    invoke-static {v3, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 180
    .line 181
    .line 182
    move-result v10

    .line 183
    invoke-direct {v1, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 191
    .line 192
    .line 193
    move-result v10

    .line 194
    if-eqz v10, :cond_3

    .line 195
    .line 196
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v10

    .line 200
    check-cast v10, La/xah;

    .line 201
    .line 202
    invoke-static {v10, v0}, La/jwb;->W(La/xah;La/ctf0;)La/y2m;

    .line 203
    .line 204
    .line 205
    move-result-object v10

    .line 206
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    goto :goto_1

    .line 210
    :cond_3
    invoke-static {v1}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    new-instance v3, La/ztj;

    .line 215
    .line 216
    const-string v10, "BANNERS_CHAMPIONSHIPS_REAL_LIVE"

    .line 217
    .line 218
    invoke-direct {v3, v1, v10}, La/ztj;-><init>(La/i4;Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    :cond_4
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    if-nez v1, :cond_6

    .line 229
    .line 230
    new-instance v1, La/nuj;

    .line 231
    .line 232
    new-array v3, v7, [Ljava/lang/Object;

    .line 233
    .line 234
    iget-object v10, v0, La/ctf0;->b:La/lsm0;

    .line 235
    .line 236
    invoke-static {v3, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    invoke-virtual {v10, v9, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    new-array v9, v7, [Ljava/lang/Object;

    .line 245
    .line 246
    invoke-static {v9, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v9

    .line 250
    const v11, 0x7f130b2c

    .line 251
    .line 252
    .line 253
    invoke-virtual {v10, v11, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v9

    .line 257
    invoke-static {v3, v8, v9}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v12

    .line 261
    new-instance v3, La/ue9;

    .line 262
    .line 263
    new-array v8, v7, [Ljava/lang/Object;

    .line 264
    .line 265
    invoke-static {v8, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v7

    .line 269
    invoke-virtual {v10, v4, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    invoke-direct {v3, v4}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    new-instance v11, La/hjm;

    .line 277
    .line 278
    const/16 v23, 0x0

    .line 279
    .line 280
    const/16 v24, 0x1bbe

    .line 281
    .line 282
    const/4 v13, 0x0

    .line 283
    const/4 v14, 0x0

    .line 284
    const/4 v15, 0x0

    .line 285
    const/16 v16, 0x0

    .line 286
    .line 287
    const/16 v17, 0x0

    .line 288
    .line 289
    const/16 v18, 0x0

    .line 290
    .line 291
    const/16 v19, 0x0

    .line 292
    .line 293
    const/16 v20, 0x0

    .line 294
    .line 295
    const/16 v21, 0x0

    .line 296
    .line 297
    move-object/from16 v22, v3

    .line 298
    .line 299
    invoke-direct/range {v11 .. v24}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 300
    .line 301
    .line 302
    const-string v3, "HEADER_CHAMPIONSHIPS_REAL_LINE"

    .line 303
    .line 304
    invoke-direct {v1, v3, v11}, La/nuj;-><init>(Ljava/lang/String;La/jjm;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v2, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    new-instance v1, Ljava/util/ArrayList;

    .line 311
    .line 312
    invoke-static {v6, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 313
    .line 314
    .line 315
    move-result v3

    .line 316
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 320
    .line 321
    .line 322
    move-result-object v3

    .line 323
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 324
    .line 325
    .line 326
    move-result v4

    .line 327
    if-eqz v4, :cond_5

    .line 328
    .line 329
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v4

    .line 333
    check-cast v4, La/xah;

    .line 334
    .line 335
    invoke-static {v4, v0}, La/jwb;->W(La/xah;La/ctf0;)La/y2m;

    .line 336
    .line 337
    .line 338
    move-result-object v4

    .line 339
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    goto :goto_2

    .line 343
    :cond_5
    invoke-static {v1}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    new-instance v1, La/ztj;

    .line 348
    .line 349
    const-string v3, "BANNERS_CHAMPIONSHIPS_REAL_LINE"

    .line 350
    .line 351
    invoke-direct {v1, v0, v3}, La/ztj;-><init>(La/i4;Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v2, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    :cond_6
    invoke-static {v2}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    :goto_3
    return-object v0

    .line 362
    :pswitch_0
    move-object/from16 v1, p1

    .line 363
    .line 364
    check-cast v1, La/mpk;

    .line 365
    .line 366
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    iget-object v0, v0, La/bqk;->b:La/ctf0;

    .line 370
    .line 371
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 372
    .line 373
    .line 374
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 375
    .line 376
    .line 377
    move-result-object v6

    .line 378
    iget-object v8, v1, La/mpk;->a:Ljava/util/List;

    .line 379
    .line 380
    iget-object v1, v1, La/mpk;->b:Ljava/util/List;

    .line 381
    .line 382
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 383
    .line 384
    .line 385
    move-result v9

    .line 386
    if-eqz v9, :cond_7

    .line 387
    .line 388
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 389
    .line 390
    .line 391
    move-result v9

    .line 392
    if-eqz v9, :cond_7

    .line 393
    .line 394
    sget-object v0, La/iun;->a:La/iun;

    .line 395
    .line 396
    goto/16 :goto_9

    .line 397
    .line 398
    :cond_7
    new-instance v9, La/nuj;

    .line 399
    .line 400
    new-array v10, v7, [Ljava/lang/Object;

    .line 401
    .line 402
    iget-object v11, v0, La/ctf0;->b:La/lsm0;

    .line 403
    .line 404
    invoke-static {v10, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v10

    .line 408
    const v12, 0x7f130403

    .line 409
    .line 410
    .line 411
    invoke-virtual {v11, v12, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v14

    .line 415
    new-instance v10, La/ue9;

    .line 416
    .line 417
    new-array v12, v7, [Ljava/lang/Object;

    .line 418
    .line 419
    invoke-static {v12, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v12

    .line 423
    invoke-virtual {v11, v4, v12}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v4

    .line 427
    invoke-direct {v10, v4}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    new-instance v13, La/hjm;

    .line 431
    .line 432
    const/16 v25, 0x0

    .line 433
    .line 434
    const/16 v26, 0x1bbe

    .line 435
    .line 436
    const/4 v15, 0x0

    .line 437
    const/16 v16, 0x0

    .line 438
    .line 439
    const/16 v17, 0x0

    .line 440
    .line 441
    const/16 v18, 0x0

    .line 442
    .line 443
    const/16 v19, 0x0

    .line 444
    .line 445
    const/16 v20, 0x0

    .line 446
    .line 447
    const/16 v21, 0x0

    .line 448
    .line 449
    const/16 v22, 0x0

    .line 450
    .line 451
    const/16 v23, 0x0

    .line 452
    .line 453
    move-object/from16 v24, v10

    .line 454
    .line 455
    invoke-direct/range {v13 .. v26}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 456
    .line 457
    .line 458
    const-string v4, "HEADER_CHAMPIONSHIPS"

    .line 459
    .line 460
    invoke-direct {v9, v4, v13}, La/nuj;-><init>(Ljava/lang/String;La/jjm;)V

    .line 461
    .line 462
    .line 463
    invoke-virtual {v6, v9}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    new-instance v4, Ljava/util/ArrayList;

    .line 467
    .line 468
    invoke-static {v8, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 469
    .line 470
    .line 471
    move-result v9

    .line 472
    invoke-direct {v4, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 473
    .line 474
    .line 475
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 476
    .line 477
    .line 478
    move-result-object v9

    .line 479
    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 480
    .line 481
    .line 482
    move-result v10

    .line 483
    if-eqz v10, :cond_8

    .line 484
    .line 485
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v10

    .line 489
    check-cast v10, La/nyg;

    .line 490
    .line 491
    iget-wide v10, v10, La/nyg;->g:J

    .line 492
    .line 493
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 494
    .line 495
    .line 496
    move-result-object v10

    .line 497
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 498
    .line 499
    .line 500
    goto :goto_4

    .line 501
    :cond_8
    new-instance v9, Ljava/util/ArrayList;

    .line 502
    .line 503
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 504
    .line 505
    .line 506
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 507
    .line 508
    .line 509
    move-result-object v1

    .line 510
    :cond_9
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 511
    .line 512
    .line 513
    move-result v10

    .line 514
    if-eqz v10, :cond_a

    .line 515
    .line 516
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v10

    .line 520
    move-object v11, v10

    .line 521
    check-cast v11, La/nyg;

    .line 522
    .line 523
    iget-wide v11, v11, La/nyg;->g:J

    .line 524
    .line 525
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 526
    .line 527
    .line 528
    move-result-object v11

    .line 529
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    move-result v11

    .line 533
    if-nez v11, :cond_9

    .line 534
    .line 535
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 536
    .line 537
    .line 538
    goto :goto_5

    .line 539
    :cond_a
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 540
    .line 541
    .line 542
    move-result v1

    .line 543
    if-eqz v1, :cond_b

    .line 544
    .line 545
    move v2, v7

    .line 546
    goto :goto_6

    .line 547
    :cond_b
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 548
    .line 549
    .line 550
    move-result v1

    .line 551
    if-lt v1, v2, :cond_c

    .line 552
    .line 553
    goto :goto_6

    .line 554
    :cond_c
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 555
    .line 556
    .line 557
    move-result v2

    .line 558
    :goto_6
    rsub-int/lit8 v1, v2, 0x4

    .line 559
    .line 560
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 561
    .line 562
    .line 563
    move-result v4

    .line 564
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 565
    .line 566
    .line 567
    move-result v1

    .line 568
    const/4 v4, 0x4

    .line 569
    invoke-static {v4, v1}, Ljava/lang/Math;->min(II)I

    .line 570
    .line 571
    .line 572
    move-result v1

    .line 573
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 574
    .line 575
    .line 576
    move-result v4

    .line 577
    sub-int/2addr v4, v2

    .line 578
    rsub-int/lit8 v10, v1, 0x4

    .line 579
    .line 580
    sub-int/2addr v10, v2

    .line 581
    invoke-static {v4, v10}, Ljava/lang/Math;->min(II)I

    .line 582
    .line 583
    .line 584
    move-result v4

    .line 585
    invoke-static {v7, v4}, Ljava/lang/Math;->max(II)I

    .line 586
    .line 587
    .line 588
    move-result v4

    .line 589
    add-int/2addr v4, v2

    .line 590
    invoke-static {v8, v4}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 591
    .line 592
    .line 593
    move-result-object v2

    .line 594
    invoke-static {v9, v1}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 595
    .line 596
    .line 597
    move-result-object v1

    .line 598
    new-instance v4, Ljava/util/ArrayList;

    .line 599
    .line 600
    invoke-static {v2, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 601
    .line 602
    .line 603
    move-result v8

    .line 604
    invoke-direct {v4, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 605
    .line 606
    .line 607
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 608
    .line 609
    .line 610
    move-result-object v2

    .line 611
    move v8, v7

    .line 612
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 613
    .line 614
    .line 615
    move-result v9

    .line 616
    if-eqz v9, :cond_e

    .line 617
    .line 618
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object v9

    .line 622
    add-int/lit8 v10, v8, 0x1

    .line 623
    .line 624
    if-ltz v8, :cond_d

    .line 625
    .line 626
    check-cast v9, La/nyg;

    .line 627
    .line 628
    invoke-static {v9, v0}, La/wwb;->U(La/nyg;La/ctf0;)La/trm;

    .line 629
    .line 630
    .line 631
    move-result-object v9

    .line 632
    new-instance v11, La/oxj;

    .line 633
    .line 634
    const-string v12, "CHAMPIONSHIPS_LIVE"

    .line 635
    .line 636
    invoke-static {v8, v12}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 637
    .line 638
    .line 639
    move-result-object v8

    .line 640
    invoke-direct {v11, v8, v9}, La/oxj;-><init>(Ljava/lang/String;La/vrm;)V

    .line 641
    .line 642
    .line 643
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 644
    .line 645
    .line 646
    move v8, v10

    .line 647
    goto :goto_7

    .line 648
    :cond_d
    invoke-static {}, La/q3d;->p()V

    .line 649
    .line 650
    .line 651
    throw v3

    .line 652
    :cond_e
    invoke-virtual {v6, v4}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 653
    .line 654
    .line 655
    new-instance v2, Ljava/util/ArrayList;

    .line 656
    .line 657
    invoke-static {v1, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 658
    .line 659
    .line 660
    move-result v4

    .line 661
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 662
    .line 663
    .line 664
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 665
    .line 666
    .line 667
    move-result-object v1

    .line 668
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 669
    .line 670
    .line 671
    move-result v4

    .line 672
    if-eqz v4, :cond_10

    .line 673
    .line 674
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    move-result-object v4

    .line 678
    add-int/lit8 v5, v7, 0x1

    .line 679
    .line 680
    if-ltz v7, :cond_f

    .line 681
    .line 682
    check-cast v4, La/nyg;

    .line 683
    .line 684
    invoke-static {v4, v0}, La/wwb;->U(La/nyg;La/ctf0;)La/trm;

    .line 685
    .line 686
    .line 687
    move-result-object v4

    .line 688
    new-instance v8, La/oxj;

    .line 689
    .line 690
    const-string v9, "CHAMPIONSHIPS_LINE"

    .line 691
    .line 692
    invoke-static {v7, v9}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 693
    .line 694
    .line 695
    move-result-object v7

    .line 696
    invoke-direct {v8, v7, v4}, La/oxj;-><init>(Ljava/lang/String;La/vrm;)V

    .line 697
    .line 698
    .line 699
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 700
    .line 701
    .line 702
    move v7, v5

    .line 703
    goto :goto_8

    .line 704
    :cond_f
    invoke-static {}, La/q3d;->p()V

    .line 705
    .line 706
    .line 707
    throw v3

    .line 708
    :cond_10
    invoke-virtual {v6, v2}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 709
    .line 710
    .line 711
    invoke-static {v6}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 712
    .line 713
    .line 714
    move-result-object v0

    .line 715
    :goto_9
    return-object v0

    .line 716
    :pswitch_1
    move-object/from16 v1, p1

    .line 717
    .line 718
    check-cast v1, Ljava/util/List;

    .line 719
    .line 720
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 721
    .line 722
    .line 723
    iget-object v0, v0, La/bqk;->b:La/ctf0;

    .line 724
    .line 725
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 726
    .line 727
    .line 728
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 729
    .line 730
    .line 731
    move-result v2

    .line 732
    const/4 v6, 0x5

    .line 733
    if-ge v2, v6, :cond_11

    .line 734
    .line 735
    sget-object v0, La/iun;->a:La/iun;

    .line 736
    .line 737
    goto/16 :goto_b

    .line 738
    .line 739
    :cond_11
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 740
    .line 741
    .line 742
    move-result-object v2

    .line 743
    new-instance v6, La/nuj;

    .line 744
    .line 745
    new-array v8, v7, [Ljava/lang/Object;

    .line 746
    .line 747
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 748
    .line 749
    invoke-static {v8, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 750
    .line 751
    .line 752
    move-result-object v8

    .line 753
    const v9, 0x7f130053

    .line 754
    .line 755
    .line 756
    invoke-virtual {v0, v9, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 757
    .line 758
    .line 759
    move-result-object v11

    .line 760
    new-instance v8, La/ue9;

    .line 761
    .line 762
    new-array v9, v7, [Ljava/lang/Object;

    .line 763
    .line 764
    invoke-static {v9, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 765
    .line 766
    .line 767
    move-result-object v9

    .line 768
    invoke-virtual {v0, v4, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 769
    .line 770
    .line 771
    move-result-object v0

    .line 772
    invoke-direct {v8, v0}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 773
    .line 774
    .line 775
    new-instance v10, La/hjm;

    .line 776
    .line 777
    const/16 v22, 0x0

    .line 778
    .line 779
    const/16 v23, 0x1bbe

    .line 780
    .line 781
    const/4 v12, 0x0

    .line 782
    const/4 v13, 0x0

    .line 783
    const/4 v14, 0x0

    .line 784
    const/4 v15, 0x0

    .line 785
    const/16 v16, 0x0

    .line 786
    .line 787
    const/16 v17, 0x0

    .line 788
    .line 789
    const/16 v18, 0x0

    .line 790
    .line 791
    const/16 v19, 0x0

    .line 792
    .line 793
    const/16 v20, 0x0

    .line 794
    .line 795
    move-object/from16 v21, v8

    .line 796
    .line 797
    invoke-direct/range {v10 .. v23}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 798
    .line 799
    .line 800
    const-string v0, "HEADER_ACTIVE_TEAMS"

    .line 801
    .line 802
    invoke-direct {v6, v0, v10}, La/nuj;-><init>(Ljava/lang/String;La/jjm;)V

    .line 803
    .line 804
    .line 805
    invoke-virtual {v2, v6}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 806
    .line 807
    .line 808
    invoke-static {v1, v5}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 809
    .line 810
    .line 811
    move-result-object v0

    .line 812
    new-instance v1, Ljava/util/ArrayList;

    .line 813
    .line 814
    invoke-static {v0, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 815
    .line 816
    .line 817
    move-result v4

    .line 818
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 819
    .line 820
    .line 821
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 822
    .line 823
    .line 824
    move-result-object v0

    .line 825
    :goto_a
    move v9, v7

    .line 826
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 827
    .line 828
    .line 829
    move-result v4

    .line 830
    if-eqz v4, :cond_13

    .line 831
    .line 832
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 833
    .line 834
    .line 835
    move-result-object v4

    .line 836
    add-int/lit8 v7, v9, 0x1

    .line 837
    .line 838
    if-ltz v9, :cond_12

    .line 839
    .line 840
    check-cast v4, La/bm;

    .line 841
    .line 842
    new-instance v8, La/y8m;

    .line 843
    .line 844
    iget-wide v5, v4, La/bm;->a:J

    .line 845
    .line 846
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 847
    .line 848
    .line 849
    move-result-object v10

    .line 850
    new-instance v11, La/n0x;

    .line 851
    .line 852
    iget-object v5, v4, La/bm;->c:Ljava/lang/String;

    .line 853
    .line 854
    invoke-direct {v11, v5}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 855
    .line 856
    .line 857
    iget-object v12, v4, La/bm;->b:Ljava/lang/String;

    .line 858
    .line 859
    const/4 v13, 0x0

    .line 860
    invoke-direct/range {v8 .. v13}, La/y8m;-><init>(ILjava/lang/String;La/n0x;Ljava/lang/String;Z)V

    .line 861
    .line 862
    .line 863
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 864
    .line 865
    .line 866
    goto :goto_a

    .line 867
    :cond_12
    invoke-static {}, La/q3d;->p()V

    .line 868
    .line 869
    .line 870
    throw v3

    .line 871
    :cond_13
    invoke-static {v1}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 872
    .line 873
    .line 874
    move-result-object v0

    .line 875
    new-instance v1, La/g9m;

    .line 876
    .line 877
    invoke-direct {v1, v0}, La/g9m;-><init>(La/a4x;)V

    .line 878
    .line 879
    .line 880
    new-instance v0, La/mtj;

    .line 881
    .line 882
    const-string v3, "ACTIVE_TEAMS"

    .line 883
    .line 884
    invoke-direct {v0, v3, v1}, La/mtj;-><init>(Ljava/lang/String;La/j9m;)V

    .line 885
    .line 886
    .line 887
    invoke-virtual {v2, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 888
    .line 889
    .line 890
    invoke-static {v2}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 891
    .line 892
    .line 893
    move-result-object v0

    .line 894
    :goto_b
    return-object v0

    .line 895
    :pswitch_2
    move-object/from16 v1, p1

    .line 896
    .line 897
    check-cast v1, La/btk;

    .line 898
    .line 899
    iget-object v2, v0, La/bqk;->a:La/ksk;

    .line 900
    .line 901
    iget-object v3, v2, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 902
    .line 903
    iget-object v4, v3, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 904
    .line 905
    iget-byte v3, v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 906
    .line 907
    sget-object v5, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 908
    .line 909
    iget-byte v5, v5, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 910
    .line 911
    if-ne v3, v5, :cond_14

    .line 912
    .line 913
    goto :goto_c

    .line 914
    :cond_14
    move v6, v7

    .line 915
    :goto_c
    if-eqz v1, :cond_16

    .line 916
    .line 917
    iget-object v3, v0, La/bqk;->d:La/y78;

    .line 918
    .line 919
    move-object v5, v3

    .line 920
    iget-object v3, v0, La/bqk;->b:La/ctf0;

    .line 921
    .line 922
    iget-object v0, v0, La/bqk;->e:La/n0o0;

    .line 923
    .line 924
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 925
    .line 926
    .line 927
    move-result-object v0

    .line 928
    check-cast v0, La/fee;

    .line 929
    .line 930
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 931
    .line 932
    .line 933
    move-result-object v0

    .line 934
    check-cast v0, Ljava/lang/Boolean;

    .line 935
    .line 936
    if-eqz v0, :cond_15

    .line 937
    .line 938
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 939
    .line 940
    .line 941
    move-result v6

    .line 942
    :cond_15
    iget-boolean v0, v2, La/ksk;->g:Z

    .line 943
    .line 944
    iget-object v7, v2, La/ksk;->b:La/sff0;

    .line 945
    .line 946
    iget-object v9, v2, La/ksk;->e:Ljava/util/List;

    .line 947
    .line 948
    iget-boolean v10, v2, La/ksk;->i:Z

    .line 949
    .line 950
    const/4 v8, 0x0

    .line 951
    move-object v2, v5

    .line 952
    move v5, v6

    .line 953
    move v6, v0

    .line 954
    invoke-static/range {v1 .. v10}, La/spk;->a(La/btk;La/y78;La/ctf0;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;ZZLa/sff0;ZLjava/util/List;Z)La/lc00;

    .line 955
    .line 956
    .line 957
    move-result-object v0

    .line 958
    if-nez v0, :cond_17

    .line 959
    .line 960
    :cond_16
    sget-object v0, La/iun;->a:La/iun;

    .line 961
    .line 962
    :cond_17
    return-object v0

    .line 963
    :pswitch_3
    move-object/from16 v1, p1

    .line 964
    .line 965
    check-cast v1, La/btk;

    .line 966
    .line 967
    iget-object v2, v0, La/bqk;->a:La/ksk;

    .line 968
    .line 969
    iget-object v3, v2, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 970
    .line 971
    iget-object v4, v3, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 972
    .line 973
    iget-byte v3, v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 974
    .line 975
    sget-object v5, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 976
    .line 977
    iget-byte v5, v5, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 978
    .line 979
    if-ne v3, v5, :cond_18

    .line 980
    .line 981
    goto :goto_d

    .line 982
    :cond_18
    move v6, v7

    .line 983
    :goto_d
    if-eqz v1, :cond_1a

    .line 984
    .line 985
    iget-object v3, v0, La/bqk;->d:La/y78;

    .line 986
    .line 987
    move-object v5, v3

    .line 988
    iget-object v3, v0, La/bqk;->b:La/ctf0;

    .line 989
    .line 990
    iget-object v0, v0, La/bqk;->e:La/n0o0;

    .line 991
    .line 992
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 993
    .line 994
    .line 995
    move-result-object v0

    .line 996
    check-cast v0, La/fee;

    .line 997
    .line 998
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 999
    .line 1000
    .line 1001
    move-result-object v0

    .line 1002
    check-cast v0, Ljava/lang/Boolean;

    .line 1003
    .line 1004
    if-eqz v0, :cond_19

    .line 1005
    .line 1006
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1007
    .line 1008
    .line 1009
    move-result v6

    .line 1010
    :cond_19
    iget-boolean v0, v2, La/ksk;->g:Z

    .line 1011
    .line 1012
    iget-object v7, v2, La/ksk;->b:La/sff0;

    .line 1013
    .line 1014
    iget-object v9, v2, La/ksk;->e:Ljava/util/List;

    .line 1015
    .line 1016
    iget-boolean v10, v2, La/ksk;->i:Z

    .line 1017
    .line 1018
    const/4 v8, 0x1

    .line 1019
    move-object v2, v5

    .line 1020
    move v5, v6

    .line 1021
    move v6, v0

    .line 1022
    invoke-static/range {v1 .. v10}, La/spk;->a(La/btk;La/y78;La/ctf0;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;ZZLa/sff0;ZLjava/util/List;Z)La/lc00;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v0

    .line 1026
    if-nez v0, :cond_1b

    .line 1027
    .line 1028
    :cond_1a
    sget-object v0, La/iun;->a:La/iun;

    .line 1029
    .line 1030
    :cond_1b
    return-object v0

    .line 1031
    :pswitch_4
    move-object/from16 v1, p1

    .line 1032
    .line 1033
    check-cast v1, La/j0g0;

    .line 1034
    .line 1035
    iget-object v4, v0, La/bqk;->a:La/ksk;

    .line 1036
    .line 1037
    iget-object v5, v4, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 1038
    .line 1039
    iget-wide v8, v5, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->a:J

    .line 1040
    .line 1041
    iget-object v5, v5, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1042
    .line 1043
    iget-object v10, v0, La/bqk;->b:La/ctf0;

    .line 1044
    .line 1045
    iget-boolean v4, v4, La/ksk;->f:Z

    .line 1046
    .line 1047
    iget-object v0, v0, La/bqk;->e:La/n0o0;

    .line 1048
    .line 1049
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v0

    .line 1053
    check-cast v0, La/fee;

    .line 1054
    .line 1055
    invoke-virtual {v0}, La/fee;->b()Ljava/lang/Object;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v0

    .line 1059
    move-object/from16 v16, v0

    .line 1060
    .line 1061
    check-cast v16, La/qt20;

    .line 1062
    .line 1063
    sget-object v0, La/zpk;->a:Ljava/util/List;

    .line 1064
    .line 1065
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1066
    .line 1067
    .line 1068
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1069
    .line 1070
    .line 1071
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1072
    .line 1073
    .line 1074
    if-eqz v1, :cond_1d

    .line 1075
    .line 1076
    iget-object v0, v1, La/j0g0;->a:Ljava/lang/Object;

    .line 1077
    .line 1078
    instance-of v1, v0, La/g0g0;

    .line 1079
    .line 1080
    if-eqz v1, :cond_1c

    .line 1081
    .line 1082
    goto :goto_e

    .line 1083
    :cond_1c
    move-object v3, v0

    .line 1084
    :goto_e
    check-cast v3, La/jtk;

    .line 1085
    .line 1086
    :cond_1d
    iget-byte v0, v5, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 1087
    .line 1088
    if-eqz v3, :cond_1e

    .line 1089
    .line 1090
    iget-object v1, v3, La/jtk;->c:La/itk;

    .line 1091
    .line 1092
    if-eqz v1, :cond_1e

    .line 1093
    .line 1094
    iget-boolean v1, v1, La/itk;->a:Z

    .line 1095
    .line 1096
    goto :goto_f

    .line 1097
    :cond_1e
    move v1, v7

    .line 1098
    :goto_f
    sget-object v5, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 1099
    .line 1100
    iget-byte v5, v5, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 1101
    .line 1102
    if-ne v0, v5, :cond_1f

    .line 1103
    .line 1104
    move v0, v6

    .line 1105
    goto :goto_10

    .line 1106
    :cond_1f
    move v0, v7

    .line 1107
    :goto_10
    invoke-static {}, La/gql0;->e()Ljava/util/List;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v5

    .line 1111
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v11

    .line 1115
    invoke-interface {v5, v11}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1116
    .line 1117
    .line 1118
    move-result v5

    .line 1119
    sget-object v11, La/zpk;->a:Ljava/util/List;

    .line 1120
    .line 1121
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v12

    .line 1125
    invoke-interface {v11, v12}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1126
    .line 1127
    .line 1128
    move-result v11

    .line 1129
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v12

    .line 1133
    if-eqz v5, :cond_20

    .line 1134
    .line 1135
    if-eqz v0, :cond_20

    .line 1136
    .line 1137
    new-instance v17, La/lxl;

    .line 1138
    .line 1139
    new-instance v5, La/xxl;

    .line 1140
    .line 1141
    new-array v13, v7, [Ljava/lang/Object;

    .line 1142
    .line 1143
    iget-object v14, v10, La/ctf0;->b:La/lsm0;

    .line 1144
    .line 1145
    invoke-static {v13, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v13

    .line 1149
    const v15, 0x7f1305f3

    .line 1150
    .line 1151
    .line 1152
    invoke-virtual {v14, v15, v13}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v13

    .line 1156
    invoke-direct {v5, v13}, La/xxl;-><init>(Ljava/lang/String;)V

    .line 1157
    .line 1158
    .line 1159
    const/16 v23, 0x0

    .line 1160
    .line 1161
    const/16 v24, 0x7c

    .line 1162
    .line 1163
    const-wide/16 v18, 0x2

    .line 1164
    .line 1165
    const/16 v21, 0x0

    .line 1166
    .line 1167
    const/16 v22, 0x0

    .line 1168
    .line 1169
    move-object/from16 v20, v5

    .line 1170
    .line 1171
    invoke-direct/range {v17 .. v24}, La/lxl;-><init>(JLa/dyl;ZLa/uxl;La/cwl;I)V

    .line 1172
    .line 1173
    .line 1174
    move-object/from16 v5, v17

    .line 1175
    .line 1176
    invoke-virtual {v12, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1177
    .line 1178
    .line 1179
    :cond_20
    if-eqz v11, :cond_21

    .line 1180
    .line 1181
    if-eqz v0, :cond_21

    .line 1182
    .line 1183
    new-instance v17, La/lxl;

    .line 1184
    .line 1185
    new-instance v5, La/xxl;

    .line 1186
    .line 1187
    new-array v11, v7, [Ljava/lang/Object;

    .line 1188
    .line 1189
    iget-object v13, v10, La/ctf0;->b:La/lsm0;

    .line 1190
    .line 1191
    invoke-static {v11, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v11

    .line 1195
    const v14, 0x7f1305f1

    .line 1196
    .line 1197
    .line 1198
    invoke-virtual {v13, v14, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v11

    .line 1202
    invoke-direct {v5, v11}, La/xxl;-><init>(Ljava/lang/String;)V

    .line 1203
    .line 1204
    .line 1205
    const/16 v23, 0x0

    .line 1206
    .line 1207
    const/16 v24, 0x7c

    .line 1208
    .line 1209
    const-wide/16 v18, 0x1

    .line 1210
    .line 1211
    const/16 v21, 0x0

    .line 1212
    .line 1213
    const/16 v22, 0x0

    .line 1214
    .line 1215
    move-object/from16 v20, v5

    .line 1216
    .line 1217
    invoke-direct/range {v17 .. v24}, La/lxl;-><init>(JLa/dyl;ZLa/uxl;La/cwl;I)V

    .line 1218
    .line 1219
    .line 1220
    move-object/from16 v5, v17

    .line 1221
    .line 1222
    invoke-virtual {v12, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1223
    .line 1224
    .line 1225
    :cond_21
    new-instance v17, La/lxl;

    .line 1226
    .line 1227
    new-instance v5, La/xxl;

    .line 1228
    .line 1229
    new-array v11, v7, [Ljava/lang/Object;

    .line 1230
    .line 1231
    iget-object v10, v10, La/ctf0;->b:La/lsm0;

    .line 1232
    .line 1233
    invoke-static {v11, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v11

    .line 1237
    const v13, 0x7f1305f2

    .line 1238
    .line 1239
    .line 1240
    invoke-virtual {v10, v13, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v11

    .line 1244
    invoke-direct {v5, v11}, La/xxl;-><init>(Ljava/lang/String;)V

    .line 1245
    .line 1246
    .line 1247
    const/16 v23, 0x0

    .line 1248
    .line 1249
    const/16 v24, 0x7c

    .line 1250
    .line 1251
    const-wide/16 v18, 0x0

    .line 1252
    .line 1253
    const/16 v21, 0x0

    .line 1254
    .line 1255
    const/16 v22, 0x0

    .line 1256
    .line 1257
    move-object/from16 v20, v5

    .line 1258
    .line 1259
    invoke-direct/range {v17 .. v24}, La/lxl;-><init>(JLa/dyl;ZLa/uxl;La/cwl;I)V

    .line 1260
    .line 1261
    .line 1262
    move-object/from16 v5, v17

    .line 1263
    .line 1264
    invoke-virtual {v12, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1265
    .line 1266
    .line 1267
    if-eqz v1, :cond_22

    .line 1268
    .line 1269
    new-instance v17, La/lxl;

    .line 1270
    .line 1271
    new-instance v1, La/xxl;

    .line 1272
    .line 1273
    new-array v5, v7, [Ljava/lang/Object;

    .line 1274
    .line 1275
    invoke-static {v5, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v5

    .line 1279
    const v11, 0x7f1305f0

    .line 1280
    .line 1281
    .line 1282
    invoke-virtual {v10, v11, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1283
    .line 1284
    .line 1285
    move-result-object v5

    .line 1286
    invoke-direct {v1, v5}, La/xxl;-><init>(Ljava/lang/String;)V

    .line 1287
    .line 1288
    .line 1289
    const/16 v23, 0x0

    .line 1290
    .line 1291
    const/16 v24, 0x7c

    .line 1292
    .line 1293
    const-wide/16 v18, 0x3

    .line 1294
    .line 1295
    const/16 v21, 0x0

    .line 1296
    .line 1297
    const/16 v22, 0x0

    .line 1298
    .line 1299
    move-object/from16 v20, v1

    .line 1300
    .line 1301
    invoke-direct/range {v17 .. v24}, La/lxl;-><init>(JLa/dyl;ZLa/uxl;La/cwl;I)V

    .line 1302
    .line 1303
    .line 1304
    move-object/from16 v1, v17

    .line 1305
    .line 1306
    invoke-virtual {v12, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1307
    .line 1308
    .line 1309
    :cond_22
    const-wide/16 v13, 0x1

    .line 1310
    .line 1311
    cmp-long v1, v8, v13

    .line 1312
    .line 1313
    if-nez v1, :cond_23

    .line 1314
    .line 1315
    if-eqz v0, :cond_23

    .line 1316
    .line 1317
    new-instance v17, La/lxl;

    .line 1318
    .line 1319
    new-instance v0, La/xxl;

    .line 1320
    .line 1321
    new-array v1, v7, [Ljava/lang/Object;

    .line 1322
    .line 1323
    invoke-static {v1, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v1

    .line 1327
    const v5, 0x7f130d15

    .line 1328
    .line 1329
    .line 1330
    invoke-virtual {v10, v5, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1331
    .line 1332
    .line 1333
    move-result-object v1

    .line 1334
    invoke-direct {v0, v1}, La/xxl;-><init>(Ljava/lang/String;)V

    .line 1335
    .line 1336
    .line 1337
    const/16 v23, 0x0

    .line 1338
    .line 1339
    const/16 v24, 0x7c

    .line 1340
    .line 1341
    const-wide/16 v18, 0x4

    .line 1342
    .line 1343
    const/16 v21, 0x0

    .line 1344
    .line 1345
    const/16 v22, 0x0

    .line 1346
    .line 1347
    move-object/from16 v20, v0

    .line 1348
    .line 1349
    invoke-direct/range {v17 .. v24}, La/lxl;-><init>(JLa/dyl;ZLa/uxl;La/cwl;I)V

    .line 1350
    .line 1351
    .line 1352
    move-object/from16 v0, v17

    .line 1353
    .line 1354
    invoke-virtual {v12, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1355
    .line 1356
    .line 1357
    :cond_23
    invoke-static {v12}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v0

    .line 1361
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v9

    .line 1365
    new-instance v0, La/msk;

    .line 1366
    .line 1367
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1368
    .line 1369
    sget-object v5, La/ujn;->h:Ljava/lang/String;

    .line 1370
    .line 1371
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1372
    .line 1373
    .line 1374
    const-string v5, ""

    .line 1375
    .line 1376
    if-eqz v4, :cond_25

    .line 1377
    .line 1378
    if-eqz v3, :cond_24

    .line 1379
    .line 1380
    iget-object v8, v3, La/jtk;->b:La/ypl0;

    .line 1381
    .line 1382
    if-eqz v8, :cond_24

    .line 1383
    .line 1384
    iget-object v8, v8, La/ypl0;->c:La/lel0;

    .line 1385
    .line 1386
    if-eqz v8, :cond_24

    .line 1387
    .line 1388
    iget-object v8, v8, La/lel0;->d:Ljava/lang/String;

    .line 1389
    .line 1390
    if-nez v8, :cond_26

    .line 1391
    .line 1392
    :cond_24
    :goto_11
    move-object v8, v5

    .line 1393
    goto :goto_12

    .line 1394
    :cond_25
    if-eqz v3, :cond_24

    .line 1395
    .line 1396
    iget-object v8, v3, La/jtk;->b:La/ypl0;

    .line 1397
    .line 1398
    if-eqz v8, :cond_24

    .line 1399
    .line 1400
    iget-object v8, v8, La/ypl0;->c:La/lel0;

    .line 1401
    .line 1402
    if-eqz v8, :cond_24

    .line 1403
    .line 1404
    iget-object v8, v8, La/lel0;->c:Ljava/lang/String;

    .line 1405
    .line 1406
    if-nez v8, :cond_26

    .line 1407
    .line 1408
    goto :goto_11

    .line 1409
    :cond_26
    :goto_12
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 1410
    .line 1411
    .line 1412
    move-result v10

    .line 1413
    if-nez v10, :cond_27

    .line 1414
    .line 1415
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1416
    .line 1417
    .line 1418
    goto :goto_14

    .line 1419
    :cond_27
    sget-object v10, La/ujn;->h:Ljava/lang/String;

    .line 1420
    .line 1421
    invoke-static {v8, v10, v7}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1422
    .line 1423
    .line 1424
    move-result v10

    .line 1425
    if-nez v10, :cond_2a

    .line 1426
    .line 1427
    const-string v10, "https://"

    .line 1428
    .line 1429
    invoke-static {v8, v10, v7}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1430
    .line 1431
    .line 1432
    move-result v10

    .line 1433
    if-eqz v10, :cond_28

    .line 1434
    .line 1435
    goto :goto_13

    .line 1436
    :cond_28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 1437
    .line 1438
    .line 1439
    move-result v10

    .line 1440
    const/16 v11, 0x2f

    .line 1441
    .line 1442
    if-lez v10, :cond_29

    .line 1443
    .line 1444
    const-string v10, "/"

    .line 1445
    .line 1446
    invoke-static {v1, v10}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 1447
    .line 1448
    .line 1449
    move-result v10

    .line 1450
    if-nez v10, :cond_29

    .line 1451
    .line 1452
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1453
    .line 1454
    .line 1455
    :cond_29
    new-array v6, v6, [C

    .line 1456
    .line 1457
    aput-char v11, v6, v7

    .line 1458
    .line 1459
    invoke-static {v8, v6}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 1460
    .line 1461
    .line 1462
    move-result-object v6

    .line 1463
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1464
    .line 1465
    .line 1466
    goto :goto_14

    .line 1467
    :cond_2a
    :goto_13
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1468
    .line 1469
    .line 1470
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1471
    .line 1472
    .line 1473
    :goto_14
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1474
    .line 1475
    .line 1476
    move-result-object v1

    .line 1477
    if-eqz v4, :cond_2b

    .line 1478
    .line 1479
    const v6, 0x7f08045e

    .line 1480
    .line 1481
    .line 1482
    goto :goto_15

    .line 1483
    :cond_2b
    const v6, 0x7f080459

    .line 1484
    .line 1485
    .line 1486
    :goto_15
    if-eqz v3, :cond_2d

    .line 1487
    .line 1488
    iget-object v3, v3, La/jtk;->b:La/ypl0;

    .line 1489
    .line 1490
    if-eqz v3, :cond_2d

    .line 1491
    .line 1492
    iget-object v3, v3, La/ypl0;->b:Ljava/lang/String;

    .line 1493
    .line 1494
    if-nez v3, :cond_2c

    .line 1495
    .line 1496
    goto :goto_16

    .line 1497
    :cond_2c
    move-object v5, v3

    .line 1498
    :cond_2d
    :goto_16
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 1499
    .line 1500
    .line 1501
    move-result v3

    .line 1502
    if-eqz v3, :cond_2e

    .line 1503
    .line 1504
    sget-object v2, La/opk;->a:La/opk;

    .line 1505
    .line 1506
    move-object v15, v2

    .line 1507
    :goto_17
    move-object v11, v0

    .line 1508
    move-object v12, v1

    .line 1509
    move-object v14, v5

    .line 1510
    move v13, v6

    .line 1511
    goto :goto_18

    .line 1512
    :cond_2e
    new-instance v3, La/npk;

    .line 1513
    .line 1514
    new-instance v8, La/fyl;

    .line 1515
    .line 1516
    invoke-static {v4}, La/xfn;->b(Z)La/wfn;

    .line 1517
    .line 1518
    .line 1519
    move-result-object v4

    .line 1520
    iget v4, v4, La/wfn;->e:F

    .line 1521
    .line 1522
    const/4 v7, 0x0

    .line 1523
    invoke-static {v4, v7, v2}, La/s5x0;->t(FFI)La/lh80;

    .line 1524
    .line 1525
    .line 1526
    move-result-object v12

    .line 1527
    const/4 v13, 0x0

    .line 1528
    const/16 v14, 0x16

    .line 1529
    .line 1530
    const/4 v10, 0x0

    .line 1531
    const/4 v11, 0x0

    .line 1532
    invoke-direct/range {v8 .. v14}, La/fyl;-><init>(La/a4x;La/tyl;La/syl;La/hh80;La/jyl;I)V

    .line 1533
    .line 1534
    .line 1535
    invoke-direct {v3, v8}, La/npk;-><init>(La/fyl;)V

    .line 1536
    .line 1537
    .line 1538
    move-object v15, v3

    .line 1539
    goto :goto_17

    .line 1540
    :goto_18
    invoke-direct/range {v11 .. v16}, La/msk;-><init>(Ljava/lang/String;ILjava/lang/String;La/ppk;La/qt20;)V

    .line 1541
    .line 1542
    .line 1543
    return-object v11

    .line 1544
    :pswitch_5
    move-object/from16 v1, p1

    .line 1545
    .line 1546
    check-cast v1, Ljava/lang/Boolean;

    .line 1547
    .line 1548
    if-eqz v1, :cond_2f

    .line 1549
    .line 1550
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1551
    .line 1552
    .line 1553
    move-result v1

    .line 1554
    iget-object v0, v0, La/bqk;->a:La/ksk;

    .line 1555
    .line 1556
    iget-object v0, v0, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 1557
    .line 1558
    iget-object v0, v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1559
    .line 1560
    iget-byte v0, v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 1561
    .line 1562
    invoke-static {v0, v1}, La/rt20;->a(IZ)La/qt20;

    .line 1563
    .line 1564
    .line 1565
    move-result-object v0

    .line 1566
    goto :goto_19

    .line 1567
    :cond_2f
    sget-object v0, La/pt20;->a:La/pt20;

    .line 1568
    .line 1569
    :goto_19
    return-object v0

    .line 1570
    nop

    .line 1571
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
