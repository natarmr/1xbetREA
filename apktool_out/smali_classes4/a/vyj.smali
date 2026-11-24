.class public final synthetic La/vyj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wyj;


# direct methods
.method public synthetic constructor <init>(La/wyj;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/vyj;->a:B

    iput-object p1, p0, La/vyj;->b:La/wyj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/vyj;->a:B

    .line 4
    .line 5
    const-string v2, "/"

    .line 6
    .line 7
    const-string v3, "https://"

    .line 8
    .line 9
    const/16 v4, 0x2f

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x1

    .line 13
    const v7, 0x7f1300e4

    .line 14
    .line 15
    .line 16
    const/16 v8, 0xa

    .line 17
    .line 18
    const/4 v9, 0x0

    .line 19
    iget-object v0, v0, La/vyj;->b:La/wyj;

    .line 20
    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    move-object/from16 v1, p1

    .line 25
    .line 26
    check-cast v1, Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    iget-object v2, v0, La/wyj;->a:La/ctf0;

    .line 33
    .line 34
    iget-object v0, v0, La/wyj;->d:La/zjw;

    .line 35
    .line 36
    iget-boolean v3, v0, La/zjw;->f:Z

    .line 37
    .line 38
    iget-object v0, v0, La/zjw;->b:La/sff0;

    .line 39
    .line 40
    iget-object v0, v0, La/sff0;->c:La/ech;

    .line 41
    .line 42
    iget-object v0, v0, La/ech;->a:La/hdh;

    .line 43
    .line 44
    iget-boolean v0, v0, La/hdh;->d:Z

    .line 45
    .line 46
    invoke-static {v1, v2, v3, v0}, La/qbc;->I(ZLa/ctf0;ZZ)La/lc00;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0

    .line 51
    :pswitch_0
    move-object/from16 v1, p1

    .line 52
    .line 53
    check-cast v1, Ljava/util/List;

    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iget-object v0, v0, La/wyj;->a:La/ctf0;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_0

    .line 72
    .line 73
    sget-object v0, La/iun;->a:La/iun;

    .line 74
    .line 75
    goto/16 :goto_3

    .line 76
    .line 77
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 80
    .line 81
    .line 82
    new-instance v4, Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-eqz v5, :cond_2

    .line 96
    .line 97
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    move-object v6, v5

    .line 102
    check-cast v6, La/xah;

    .line 103
    .line 104
    iget-boolean v6, v6, La/xah;->n:Z

    .line 105
    .line 106
    if-eqz v6, :cond_1

    .line 107
    .line 108
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_1
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    const-string v5, " "

    .line 121
    .line 122
    const v6, 0x7f131662

    .line 123
    .line 124
    .line 125
    if-nez v1, :cond_4

    .line 126
    .line 127
    new-instance v1, La/nuj;

    .line 128
    .line 129
    new-array v10, v9, [Ljava/lang/Object;

    .line 130
    .line 131
    iget-object v11, v0, La/ctf0;->b:La/lsm0;

    .line 132
    .line 133
    invoke-static {v10, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v10

    .line 137
    invoke-virtual {v11, v6, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v10

    .line 141
    new-array v12, v9, [Ljava/lang/Object;

    .line 142
    .line 143
    invoke-static {v12, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v12

    .line 147
    const v13, 0x7f1305ce

    .line 148
    .line 149
    .line 150
    invoke-virtual {v11, v13, v12}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v12

    .line 154
    invoke-static {v10, v5, v12}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v14

    .line 158
    new-instance v10, La/ue9;

    .line 159
    .line 160
    new-array v12, v9, [Ljava/lang/Object;

    .line 161
    .line 162
    invoke-static {v12, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v12

    .line 166
    invoke-virtual {v11, v7, v12}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v11

    .line 170
    invoke-direct {v10, v11}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    new-instance v13, La/hjm;

    .line 174
    .line 175
    const/16 v25, 0x0

    .line 176
    .line 177
    const/16 v26, 0x1bbe

    .line 178
    .line 179
    const/4 v15, 0x0

    .line 180
    const/16 v16, 0x0

    .line 181
    .line 182
    const/16 v17, 0x0

    .line 183
    .line 184
    const/16 v18, 0x0

    .line 185
    .line 186
    const/16 v19, 0x0

    .line 187
    .line 188
    const/16 v20, 0x1

    .line 189
    .line 190
    const/16 v21, 0x0

    .line 191
    .line 192
    const/16 v22, 0x0

    .line 193
    .line 194
    const/16 v23, 0x0

    .line 195
    .line 196
    move-object/from16 v24, v10

    .line 197
    .line 198
    invoke-direct/range {v13 .. v26}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 199
    .line 200
    .line 201
    const-string v10, "HEADER_CHAMPIONSHIPS_REAL_LIVE"

    .line 202
    .line 203
    invoke-direct {v1, v10, v13}, La/nuj;-><init>(Ljava/lang/String;La/jjm;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    new-instance v1, Ljava/util/ArrayList;

    .line 210
    .line 211
    invoke-static {v3, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 212
    .line 213
    .line 214
    move-result v10

    .line 215
    invoke-direct {v1, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 223
    .line 224
    .line 225
    move-result v10

    .line 226
    if-eqz v10, :cond_3

    .line 227
    .line 228
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v10

    .line 232
    check-cast v10, La/xah;

    .line 233
    .line 234
    invoke-static {v10, v0}, La/d5c;->X(La/xah;La/ctf0;)La/y2m;

    .line 235
    .line 236
    .line 237
    move-result-object v10

    .line 238
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    goto :goto_1

    .line 242
    :cond_3
    invoke-static {v1}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    new-instance v3, La/ztj;

    .line 247
    .line 248
    const-string v10, "BANNERS_CHAMPIONSHIPS_REAL_LIVE"

    .line 249
    .line 250
    invoke-direct {v3, v1, v10}, La/ztj;-><init>(La/i4;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v2, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    :cond_4
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 257
    .line 258
    .line 259
    move-result v1

    .line 260
    if-nez v1, :cond_6

    .line 261
    .line 262
    new-instance v1, La/nuj;

    .line 263
    .line 264
    new-array v3, v9, [Ljava/lang/Object;

    .line 265
    .line 266
    iget-object v10, v0, La/ctf0;->b:La/lsm0;

    .line 267
    .line 268
    invoke-static {v3, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v3

    .line 272
    invoke-virtual {v10, v6, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    new-array v6, v9, [Ljava/lang/Object;

    .line 277
    .line 278
    invoke-static {v6, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v6

    .line 282
    const v11, 0x7f130b2c

    .line 283
    .line 284
    .line 285
    invoke-virtual {v10, v11, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v6

    .line 289
    invoke-static {v3, v5, v6}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v12

    .line 293
    new-instance v3, La/ue9;

    .line 294
    .line 295
    new-array v5, v9, [Ljava/lang/Object;

    .line 296
    .line 297
    invoke-static {v5, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v5

    .line 301
    invoke-virtual {v10, v7, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v5

    .line 305
    invoke-direct {v3, v5}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    new-instance v11, La/hjm;

    .line 309
    .line 310
    const/16 v23, 0x0

    .line 311
    .line 312
    const/16 v24, 0x1bbe

    .line 313
    .line 314
    const/4 v13, 0x0

    .line 315
    const/4 v14, 0x0

    .line 316
    const/4 v15, 0x0

    .line 317
    const/16 v16, 0x0

    .line 318
    .line 319
    const/16 v17, 0x0

    .line 320
    .line 321
    const/16 v18, 0x0

    .line 322
    .line 323
    const/16 v19, 0x0

    .line 324
    .line 325
    const/16 v20, 0x0

    .line 326
    .line 327
    const/16 v21, 0x0

    .line 328
    .line 329
    move-object/from16 v22, v3

    .line 330
    .line 331
    invoke-direct/range {v11 .. v24}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 332
    .line 333
    .line 334
    const-string v3, "HEADER_CHAMPIONSHIPS_REAL_LINE"

    .line 335
    .line 336
    invoke-direct {v1, v3, v11}, La/nuj;-><init>(Ljava/lang/String;La/jjm;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v2, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    new-instance v1, Ljava/util/ArrayList;

    .line 343
    .line 344
    invoke-static {v4, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 345
    .line 346
    .line 347
    move-result v3

    .line 348
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 352
    .line 353
    .line 354
    move-result-object v3

    .line 355
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 356
    .line 357
    .line 358
    move-result v4

    .line 359
    if-eqz v4, :cond_5

    .line 360
    .line 361
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v4

    .line 365
    check-cast v4, La/xah;

    .line 366
    .line 367
    invoke-static {v4, v0}, La/d5c;->X(La/xah;La/ctf0;)La/y2m;

    .line 368
    .line 369
    .line 370
    move-result-object v4

    .line 371
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    goto :goto_2

    .line 375
    :cond_5
    invoke-static {v1}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    new-instance v1, La/ztj;

    .line 380
    .line 381
    const-string v3, "BANNERS_CHAMPIONSHIPS_REAL_LINE"

    .line 382
    .line 383
    invoke-direct {v1, v0, v3}, La/ztj;-><init>(La/i4;Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v2, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    :cond_6
    invoke-static {v2}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    :goto_3
    return-object v0

    .line 394
    :pswitch_1
    move-object/from16 v1, p1

    .line 395
    .line 396
    check-cast v1, La/fiw;

    .line 397
    .line 398
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 399
    .line 400
    .line 401
    iget-object v0, v0, La/wyj;->a:La/ctf0;

    .line 402
    .line 403
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    iget-object v3, v1, La/fiw;->a:Ljava/util/List;

    .line 411
    .line 412
    iget-object v1, v1, La/fiw;->b:Ljava/util/List;

    .line 413
    .line 414
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 415
    .line 416
    .line 417
    move-result v4

    .line 418
    if-eqz v4, :cond_7

    .line 419
    .line 420
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 421
    .line 422
    .line 423
    move-result v4

    .line 424
    if-eqz v4, :cond_7

    .line 425
    .line 426
    sget-object v0, La/iun;->a:La/iun;

    .line 427
    .line 428
    goto/16 :goto_9

    .line 429
    .line 430
    :cond_7
    new-instance v4, La/nuj;

    .line 431
    .line 432
    new-array v6, v9, [Ljava/lang/Object;

    .line 433
    .line 434
    iget-object v10, v0, La/ctf0;->b:La/lsm0;

    .line 435
    .line 436
    invoke-static {v6, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v6

    .line 440
    const v11, 0x7f130403

    .line 441
    .line 442
    .line 443
    invoke-virtual {v10, v11, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v13

    .line 447
    new-instance v6, La/ue9;

    .line 448
    .line 449
    new-array v11, v9, [Ljava/lang/Object;

    .line 450
    .line 451
    invoke-static {v11, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v11

    .line 455
    invoke-virtual {v10, v7, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v7

    .line 459
    invoke-direct {v6, v7}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    new-instance v12, La/hjm;

    .line 463
    .line 464
    const/16 v24, 0x0

    .line 465
    .line 466
    const/16 v25, 0x1bbe

    .line 467
    .line 468
    const/4 v14, 0x0

    .line 469
    const/4 v15, 0x0

    .line 470
    const/16 v16, 0x0

    .line 471
    .line 472
    const/16 v17, 0x0

    .line 473
    .line 474
    const/16 v18, 0x0

    .line 475
    .line 476
    const/16 v19, 0x0

    .line 477
    .line 478
    const/16 v20, 0x0

    .line 479
    .line 480
    const/16 v21, 0x0

    .line 481
    .line 482
    const/16 v22, 0x0

    .line 483
    .line 484
    move-object/from16 v23, v6

    .line 485
    .line 486
    invoke-direct/range {v12 .. v25}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 487
    .line 488
    .line 489
    const-string v6, "HEADER_CHAMPIONSHIPS"

    .line 490
    .line 491
    invoke-direct {v4, v6, v12}, La/nuj;-><init>(Ljava/lang/String;La/jjm;)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v2, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 495
    .line 496
    .line 497
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 498
    .line 499
    .line 500
    move-result v4

    .line 501
    const/4 v6, 0x3

    .line 502
    const/4 v7, 0x6

    .line 503
    if-eqz v4, :cond_8

    .line 504
    .line 505
    goto :goto_4

    .line 506
    :cond_8
    invoke-static {v3, v6}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 507
    .line 508
    .line 509
    move-result-object v4

    .line 510
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 511
    .line 512
    .line 513
    move-result v4

    .line 514
    sub-int/2addr v7, v4

    .line 515
    :goto_4
    invoke-static {v3, v6}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 516
    .line 517
    .line 518
    move-result-object v3

    .line 519
    new-instance v4, Ljava/util/ArrayList;

    .line 520
    .line 521
    invoke-static {v3, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 522
    .line 523
    .line 524
    move-result v6

    .line 525
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 526
    .line 527
    .line 528
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 529
    .line 530
    .line 531
    move-result-object v6

    .line 532
    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 533
    .line 534
    .line 535
    move-result v10

    .line 536
    if-eqz v10, :cond_9

    .line 537
    .line 538
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object v10

    .line 542
    check-cast v10, La/nyg;

    .line 543
    .line 544
    iget-wide v10, v10, La/nyg;->g:J

    .line 545
    .line 546
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 547
    .line 548
    .line 549
    move-result-object v10

    .line 550
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 551
    .line 552
    .line 553
    goto :goto_5

    .line 554
    :cond_9
    new-instance v6, Ljava/util/ArrayList;

    .line 555
    .line 556
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 557
    .line 558
    .line 559
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 560
    .line 561
    .line 562
    move-result-object v1

    .line 563
    :cond_a
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 564
    .line 565
    .line 566
    move-result v10

    .line 567
    if-eqz v10, :cond_b

    .line 568
    .line 569
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v10

    .line 573
    move-object v11, v10

    .line 574
    check-cast v11, La/nyg;

    .line 575
    .line 576
    iget-wide v11, v11, La/nyg;->g:J

    .line 577
    .line 578
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 579
    .line 580
    .line 581
    move-result-object v11

    .line 582
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 583
    .line 584
    .line 585
    move-result v11

    .line 586
    if-nez v11, :cond_a

    .line 587
    .line 588
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 589
    .line 590
    .line 591
    goto :goto_6

    .line 592
    :cond_b
    invoke-static {v6, v7}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 593
    .line 594
    .line 595
    move-result-object v1

    .line 596
    new-instance v4, Ljava/util/ArrayList;

    .line 597
    .line 598
    invoke-static {v3, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 599
    .line 600
    .line 601
    move-result v6

    .line 602
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 603
    .line 604
    .line 605
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 606
    .line 607
    .line 608
    move-result-object v3

    .line 609
    move v6, v9

    .line 610
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 611
    .line 612
    .line 613
    move-result v7

    .line 614
    const-string v10, "HomeSportBannerChampionshipUiModel_"

    .line 615
    .line 616
    if-eqz v7, :cond_d

    .line 617
    .line 618
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object v7

    .line 622
    add-int/lit8 v11, v6, 0x1

    .line 623
    .line 624
    if-ltz v6, :cond_c

    .line 625
    .line 626
    check-cast v7, La/nyg;

    .line 627
    .line 628
    invoke-static {v7, v0}, La/kbc;->j0(La/nyg;La/ctf0;)La/trm;

    .line 629
    .line 630
    .line 631
    move-result-object v7

    .line 632
    new-instance v12, La/oxj;

    .line 633
    .line 634
    iget-wide v13, v7, La/trm;->a:J

    .line 635
    .line 636
    new-instance v15, Ljava/lang/StringBuilder;

    .line 637
    .line 638
    invoke-direct {v15, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 639
    .line 640
    .line 641
    invoke-virtual {v15, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 642
    .line 643
    .line 644
    const-string v10, "_live_"

    .line 645
    .line 646
    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 647
    .line 648
    .line 649
    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 650
    .line 651
    .line 652
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 653
    .line 654
    .line 655
    move-result-object v6

    .line 656
    invoke-direct {v12, v6, v7}, La/oxj;-><init>(Ljava/lang/String;La/vrm;)V

    .line 657
    .line 658
    .line 659
    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 660
    .line 661
    .line 662
    move v6, v11

    .line 663
    goto :goto_7

    .line 664
    :cond_c
    invoke-static {}, La/q3d;->p()V

    .line 665
    .line 666
    .line 667
    throw v5

    .line 668
    :cond_d
    invoke-virtual {v2, v4}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 669
    .line 670
    .line 671
    new-instance v3, Ljava/util/ArrayList;

    .line 672
    .line 673
    invoke-static {v1, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 674
    .line 675
    .line 676
    move-result v4

    .line 677
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 678
    .line 679
    .line 680
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 681
    .line 682
    .line 683
    move-result-object v1

    .line 684
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 685
    .line 686
    .line 687
    move-result v4

    .line 688
    if-eqz v4, :cond_f

    .line 689
    .line 690
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    move-result-object v4

    .line 694
    add-int/lit8 v6, v9, 0x1

    .line 695
    .line 696
    if-ltz v9, :cond_e

    .line 697
    .line 698
    check-cast v4, La/nyg;

    .line 699
    .line 700
    invoke-static {v4, v0}, La/kbc;->j0(La/nyg;La/ctf0;)La/trm;

    .line 701
    .line 702
    .line 703
    move-result-object v4

    .line 704
    new-instance v7, La/oxj;

    .line 705
    .line 706
    iget-wide v11, v4, La/trm;->a:J

    .line 707
    .line 708
    new-instance v8, Ljava/lang/StringBuilder;

    .line 709
    .line 710
    invoke-direct {v8, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 711
    .line 712
    .line 713
    invoke-virtual {v8, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 714
    .line 715
    .line 716
    const-string v11, "_line_"

    .line 717
    .line 718
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 719
    .line 720
    .line 721
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 722
    .line 723
    .line 724
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 725
    .line 726
    .line 727
    move-result-object v8

    .line 728
    invoke-direct {v7, v8, v4}, La/oxj;-><init>(Ljava/lang/String;La/vrm;)V

    .line 729
    .line 730
    .line 731
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 732
    .line 733
    .line 734
    move v9, v6

    .line 735
    goto :goto_8

    .line 736
    :cond_e
    invoke-static {}, La/q3d;->p()V

    .line 737
    .line 738
    .line 739
    throw v5

    .line 740
    :cond_f
    invoke-virtual {v2, v3}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 741
    .line 742
    .line 743
    invoke-static {v2}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 744
    .line 745
    .line 746
    move-result-object v0

    .line 747
    :goto_9
    return-object v0

    .line 748
    :pswitch_2
    move-object/from16 v1, p1

    .line 749
    .line 750
    check-cast v1, Ljava/util/List;

    .line 751
    .line 752
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 753
    .line 754
    .line 755
    iget-object v2, v0, La/wyj;->a:La/ctf0;

    .line 756
    .line 757
    invoke-virtual {v0}, La/wyj;->b()La/fee;

    .line 758
    .line 759
    .line 760
    move-result-object v0

    .line 761
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    move-result-object v0

    .line 765
    check-cast v0, La/ekw;

    .line 766
    .line 767
    iget-object v0, v0, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 768
    .line 769
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 770
    .line 771
    .line 772
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 773
    .line 774
    .line 775
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 776
    .line 777
    .line 778
    move-result-object v3

    .line 779
    new-instance v4, Ljava/util/ArrayList;

    .line 780
    .line 781
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 782
    .line 783
    .line 784
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 785
    .line 786
    .line 787
    move-result-object v1

    .line 788
    :cond_10
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 789
    .line 790
    .line 791
    move-result v5

    .line 792
    if-eqz v5, :cond_11

    .line 793
    .line 794
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object v5

    .line 798
    move-object v6, v5

    .line 799
    check-cast v6, La/uog;

    .line 800
    .line 801
    iget-object v6, v6, La/uog;->b:Ljava/lang/String;

    .line 802
    .line 803
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 804
    .line 805
    .line 806
    move-result v6

    .line 807
    if-lez v6, :cond_10

    .line 808
    .line 809
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 810
    .line 811
    .line 812
    goto :goto_a

    .line 813
    :cond_11
    new-instance v1, Ljava/util/HashSet;

    .line 814
    .line 815
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 816
    .line 817
    .line 818
    new-instance v5, Ljava/util/ArrayList;

    .line 819
    .line 820
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 821
    .line 822
    .line 823
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 824
    .line 825
    .line 826
    move-result-object v4

    .line 827
    :cond_12
    :goto_b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 828
    .line 829
    .line 830
    move-result v6

    .line 831
    if-eqz v6, :cond_13

    .line 832
    .line 833
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 834
    .line 835
    .line 836
    move-result-object v6

    .line 837
    move-object v10, v6

    .line 838
    check-cast v10, La/uog;

    .line 839
    .line 840
    iget v10, v10, La/uog;->a:I

    .line 841
    .line 842
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 843
    .line 844
    .line 845
    move-result-object v10

    .line 846
    invoke-virtual {v1, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 847
    .line 848
    .line 849
    move-result v10

    .line 850
    if-eqz v10, :cond_12

    .line 851
    .line 852
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 853
    .line 854
    .line 855
    goto :goto_b

    .line 856
    :cond_13
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 857
    .line 858
    .line 859
    move-result v1

    .line 860
    if-eqz v1, :cond_14

    .line 861
    .line 862
    sget-object v0, La/iun;->a:La/iun;

    .line 863
    .line 864
    goto/16 :goto_d

    .line 865
    .line 866
    :cond_14
    new-instance v1, La/nuj;

    .line 867
    .line 868
    new-array v4, v9, [Ljava/lang/Object;

    .line 869
    .line 870
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 871
    .line 872
    invoke-static {v4, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 873
    .line 874
    .line 875
    move-result-object v4

    .line 876
    const v6, 0x7f130ee6

    .line 877
    .line 878
    .line 879
    invoke-virtual {v2, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 880
    .line 881
    .line 882
    move-result-object v11

    .line 883
    new-instance v4, La/ue9;

    .line 884
    .line 885
    new-array v6, v9, [Ljava/lang/Object;

    .line 886
    .line 887
    invoke-static {v6, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 888
    .line 889
    .line 890
    move-result-object v6

    .line 891
    invoke-virtual {v2, v7, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 892
    .line 893
    .line 894
    move-result-object v2

    .line 895
    invoke-direct {v4, v2}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 896
    .line 897
    .line 898
    new-instance v10, La/hjm;

    .line 899
    .line 900
    const/16 v22, 0x0

    .line 901
    .line 902
    const/16 v23, 0x1bbe

    .line 903
    .line 904
    const/4 v12, 0x0

    .line 905
    const/4 v13, 0x0

    .line 906
    const/4 v14, 0x0

    .line 907
    const/4 v15, 0x0

    .line 908
    const/16 v16, 0x0

    .line 909
    .line 910
    const/16 v17, 0x0

    .line 911
    .line 912
    const/16 v18, 0x0

    .line 913
    .line 914
    const/16 v19, 0x0

    .line 915
    .line 916
    const/16 v20, 0x0

    .line 917
    .line 918
    move-object/from16 v21, v4

    .line 919
    .line 920
    invoke-direct/range {v10 .. v23}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 921
    .line 922
    .line 923
    const-string v2, "HEADER_PARTNER_ALL"

    .line 924
    .line 925
    invoke-direct {v1, v2, v10}, La/nuj;-><init>(Ljava/lang/String;La/jjm;)V

    .line 926
    .line 927
    .line 928
    invoke-virtual {v3, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 929
    .line 930
    .line 931
    invoke-static {v0}, Lorg/xplatform/cyber/section/api/domain/entity/d;->a(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)Ljava/lang/String;

    .line 932
    .line 933
    .line 934
    move-result-object v0

    .line 935
    const-string v1, "HomeCyberLogoCollectionUiModel"

    .line 936
    .line 937
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 938
    .line 939
    .line 940
    move-result-object v0

    .line 941
    new-instance v1, Ljava/util/ArrayList;

    .line 942
    .line 943
    invoke-static {v5, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 944
    .line 945
    .line 946
    move-result v2

    .line 947
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 948
    .line 949
    .line 950
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 951
    .line 952
    .line 953
    move-result-object v2

    .line 954
    :goto_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 955
    .line 956
    .line 957
    move-result v4

    .line 958
    if-eqz v4, :cond_15

    .line 959
    .line 960
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 961
    .line 962
    .line 963
    move-result-object v4

    .line 964
    check-cast v4, La/uog;

    .line 965
    .line 966
    new-instance v5, La/y8m;

    .line 967
    .line 968
    iget v6, v4, La/uog;->a:I

    .line 969
    .line 970
    iget-object v7, v4, La/uog;->c:Ljava/lang/String;

    .line 971
    .line 972
    new-instance v8, La/n0x;

    .line 973
    .line 974
    iget-object v9, v4, La/uog;->l:Ljava/lang/String;

    .line 975
    .line 976
    invoke-direct {v8, v9}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 977
    .line 978
    .line 979
    iget-object v9, v4, La/uog;->b:Ljava/lang/String;

    .line 980
    .line 981
    const/4 v10, 0x0

    .line 982
    invoke-direct/range {v5 .. v10}, La/y8m;-><init>(ILjava/lang/String;La/n0x;Ljava/lang/String;Z)V

    .line 983
    .line 984
    .line 985
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 986
    .line 987
    .line 988
    goto :goto_c

    .line 989
    :cond_15
    invoke-static {v1}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 990
    .line 991
    .line 992
    move-result-object v1

    .line 993
    new-instance v2, La/g9m;

    .line 994
    .line 995
    invoke-direct {v2, v1}, La/g9m;-><init>(La/a4x;)V

    .line 996
    .line 997
    .line 998
    new-instance v1, La/mtj;

    .line 999
    .line 1000
    invoke-direct {v1, v0, v2}, La/mtj;-><init>(Ljava/lang/String;La/j9m;)V

    .line 1001
    .line 1002
    .line 1003
    invoke-virtual {v3, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1004
    .line 1005
    .line 1006
    invoke-static {v3}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v0

    .line 1010
    :goto_d
    return-object v0

    .line 1011
    :pswitch_3
    move-object/from16 v1, p1

    .line 1012
    .line 1013
    check-cast v1, Ljava/util/List;

    .line 1014
    .line 1015
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1016
    .line 1017
    .line 1018
    iget-object v5, v0, La/wyj;->a:La/ctf0;

    .line 1019
    .line 1020
    invoke-virtual {v0}, La/wyj;->b()La/fee;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v0

    .line 1024
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v0

    .line 1028
    check-cast v0, La/ekw;

    .line 1029
    .line 1030
    iget-object v0, v0, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1031
    .line 1032
    const v10, 0x7f080457

    .line 1033
    .line 1034
    .line 1035
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v10

    .line 1039
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1040
    .line 1041
    .line 1042
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1043
    .line 1044
    .line 1045
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v11

    .line 1049
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 1050
    .line 1051
    .line 1052
    move-result v12

    .line 1053
    if-nez v12, :cond_1b

    .line 1054
    .line 1055
    new-instance v12, La/nuj;

    .line 1056
    .line 1057
    new-array v13, v9, [Ljava/lang/Object;

    .line 1058
    .line 1059
    iget-object v5, v5, La/ctf0;->b:La/lsm0;

    .line 1060
    .line 1061
    invoke-static {v13, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v13

    .line 1065
    const v14, 0x7f1306e2

    .line 1066
    .line 1067
    .line 1068
    invoke-virtual {v5, v14, v13}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v16

    .line 1072
    new-instance v13, La/ue9;

    .line 1073
    .line 1074
    new-array v14, v9, [Ljava/lang/Object;

    .line 1075
    .line 1076
    invoke-static {v14, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v14

    .line 1080
    invoke-virtual {v5, v7, v14}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v7

    .line 1084
    invoke-direct {v13, v7}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 1085
    .line 1086
    .line 1087
    new-instance v15, La/hjm;

    .line 1088
    .line 1089
    const/16 v27, 0x0

    .line 1090
    .line 1091
    const/16 v28, 0x1bbe

    .line 1092
    .line 1093
    const/16 v17, 0x0

    .line 1094
    .line 1095
    const/16 v18, 0x0

    .line 1096
    .line 1097
    const/16 v19, 0x0

    .line 1098
    .line 1099
    const/16 v20, 0x0

    .line 1100
    .line 1101
    const/16 v21, 0x0

    .line 1102
    .line 1103
    const/16 v22, 0x0

    .line 1104
    .line 1105
    const/16 v23, 0x0

    .line 1106
    .line 1107
    const/16 v24, 0x0

    .line 1108
    .line 1109
    const/16 v25, 0x0

    .line 1110
    .line 1111
    move-object/from16 v26, v13

    .line 1112
    .line 1113
    invoke-direct/range {v15 .. v28}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 1114
    .line 1115
    .line 1116
    const-string v7, "HEADER_DISCIPLINES_ALL"

    .line 1117
    .line 1118
    invoke-direct {v12, v7, v15}, La/nuj;-><init>(Ljava/lang/String;La/jjm;)V

    .line 1119
    .line 1120
    .line 1121
    invoke-virtual {v11, v12}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1122
    .line 1123
    .line 1124
    new-instance v7, Ljava/util/ArrayList;

    .line 1125
    .line 1126
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1127
    .line 1128
    .line 1129
    sget-object v12, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 1130
    .line 1131
    invoke-virtual {v0, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1132
    .line 1133
    .line 1134
    move-result v12

    .line 1135
    if-eqz v12, :cond_19

    .line 1136
    .line 1137
    new-array v12, v9, [Ljava/lang/Object;

    .line 1138
    .line 1139
    invoke-static {v12, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v12

    .line 1143
    const v13, 0x7f1303f9

    .line 1144
    .line 1145
    .line 1146
    invoke-virtual {v5, v13, v12}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v5

    .line 1150
    new-instance v12, La/n0x;

    .line 1151
    .line 1152
    new-instance v13, Ljava/lang/StringBuilder;

    .line 1153
    .line 1154
    sget-object v14, La/ujn;->h:Ljava/lang/String;

    .line 1155
    .line 1156
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1157
    .line 1158
    .line 1159
    sget-object v14, La/ujn;->h:Ljava/lang/String;

    .line 1160
    .line 1161
    const-string v15, "static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png"

    .line 1162
    .line 1163
    invoke-static {v15, v14, v9}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1164
    .line 1165
    .line 1166
    move-result v14

    .line 1167
    if-nez v14, :cond_18

    .line 1168
    .line 1169
    invoke-static {v15, v3, v9}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1170
    .line 1171
    .line 1172
    move-result v3

    .line 1173
    if-eqz v3, :cond_16

    .line 1174
    .line 1175
    goto :goto_e

    .line 1176
    :cond_16
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->length()I

    .line 1177
    .line 1178
    .line 1179
    move-result v3

    .line 1180
    if-lez v3, :cond_17

    .line 1181
    .line 1182
    invoke-static {v13, v2}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 1183
    .line 1184
    .line 1185
    move-result v2

    .line 1186
    if-nez v2, :cond_17

    .line 1187
    .line 1188
    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1189
    .line 1190
    .line 1191
    :cond_17
    new-array v2, v6, [C

    .line 1192
    .line 1193
    aput-char v4, v2, v9

    .line 1194
    .line 1195
    invoke-static {v15, v2}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v2

    .line 1199
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1200
    .line 1201
    .line 1202
    goto :goto_f

    .line 1203
    :cond_18
    :goto_e
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1204
    .line 1205
    .line 1206
    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1207
    .line 1208
    .line 1209
    :goto_f
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v2

    .line 1213
    invoke-direct {v12, v2}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 1214
    .line 1215
    .line 1216
    new-instance v2, La/cvl;

    .line 1217
    .line 1218
    const/16 v3, -0xa

    .line 1219
    .line 1220
    invoke-direct {v2, v3, v12, v10, v5}, La/cvl;-><init>(ILa/n0x;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 1221
    .line 1222
    .line 1223
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1224
    .line 1225
    .line 1226
    :cond_19
    new-instance v2, Ljava/util/ArrayList;

    .line 1227
    .line 1228
    invoke-static {v1, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1229
    .line 1230
    .line 1231
    move-result v3

    .line 1232
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1233
    .line 1234
    .line 1235
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v1

    .line 1239
    :goto_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1240
    .line 1241
    .line 1242
    move-result v3

    .line 1243
    if-eqz v3, :cond_1a

    .line 1244
    .line 1245
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v3

    .line 1249
    check-cast v3, La/ypl0;

    .line 1250
    .line 1251
    invoke-static {v3}, La/vic;->E(La/ypl0;)La/p3b;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v3

    .line 1255
    new-instance v4, La/cvl;

    .line 1256
    .line 1257
    iget v5, v3, La/p3b;->a:I

    .line 1258
    .line 1259
    iget-object v6, v3, La/p3b;->b:La/n0x;

    .line 1260
    .line 1261
    iget-object v3, v3, La/p3b;->c:Ljava/lang/String;

    .line 1262
    .line 1263
    invoke-direct {v4, v5, v6, v10, v3}, La/cvl;-><init>(ILa/n0x;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 1264
    .line 1265
    .line 1266
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1267
    .line 1268
    .line 1269
    goto :goto_10

    .line 1270
    :cond_1a
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1271
    .line 1272
    .line 1273
    new-instance v1, La/diw;

    .line 1274
    .line 1275
    invoke-static {v0}, Lorg/xplatform/cyber/section/api/domain/entity/d;->a(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)Ljava/lang/String;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v0

    .line 1279
    const-string v2, "HomeCategoryCardCollectionUiModel"

    .line 1280
    .line 1281
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v0

    .line 1285
    new-instance v2, La/zul;

    .line 1286
    .line 1287
    invoke-static {v7}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v3

    .line 1291
    invoke-direct {v2, v3}, La/zul;-><init>(La/a4x;)V

    .line 1292
    .line 1293
    .line 1294
    invoke-direct {v1, v0, v2}, La/diw;-><init>(Ljava/lang/String;La/bvl;)V

    .line 1295
    .line 1296
    .line 1297
    invoke-virtual {v11, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1298
    .line 1299
    .line 1300
    :cond_1b
    invoke-static {v11}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 1301
    .line 1302
    .line 1303
    move-result-object v0

    .line 1304
    return-object v0

    .line 1305
    :pswitch_4
    move-object/from16 v1, p1

    .line 1306
    .line 1307
    check-cast v1, Ljava/util/List;

    .line 1308
    .line 1309
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1310
    .line 1311
    .line 1312
    iget-object v2, v0, La/wyj;->b:La/y78;

    .line 1313
    .line 1314
    iget-object v3, v0, La/wyj;->a:La/ctf0;

    .line 1315
    .line 1316
    invoke-virtual {v0}, La/wyj;->b()La/fee;

    .line 1317
    .line 1318
    .line 1319
    move-result-object v4

    .line 1320
    invoke-virtual {v4}, La/fee;->c()Ljava/lang/Object;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v4

    .line 1324
    check-cast v4, La/ekw;

    .line 1325
    .line 1326
    iget-object v4, v4, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1327
    .line 1328
    sget-object v5, La/sip;->b:La/sip;

    .line 1329
    .line 1330
    invoke-static {v5}, La/kpb;->u(La/sip;)Z

    .line 1331
    .line 1332
    .line 1333
    move-result v7

    .line 1334
    iget-object v0, v0, La/wyj;->d:La/zjw;

    .line 1335
    .line 1336
    iget-boolean v5, v0, La/zjw;->e:Z

    .line 1337
    .line 1338
    iget-object v6, v0, La/zjw;->b:La/sff0;

    .line 1339
    .line 1340
    iget-object v8, v0, La/zjw;->c:Ljava/util/List;

    .line 1341
    .line 1342
    iget-boolean v9, v0, La/zjw;->s:Z

    .line 1343
    .line 1344
    invoke-static/range {v1 .. v9}, La/luj;->a(Ljava/util/List;La/y78;La/ctf0;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;ZLa/sff0;ZLjava/util/List;Z)La/lc00;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v0

    .line 1348
    return-object v0

    .line 1349
    :pswitch_5
    move-object/from16 v1, p1

    .line 1350
    .line 1351
    check-cast v1, Ljava/util/List;

    .line 1352
    .line 1353
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1354
    .line 1355
    .line 1356
    iget-object v2, v0, La/wyj;->b:La/y78;

    .line 1357
    .line 1358
    iget-object v3, v0, La/wyj;->a:La/ctf0;

    .line 1359
    .line 1360
    invoke-virtual {v0}, La/wyj;->b()La/fee;

    .line 1361
    .line 1362
    .line 1363
    move-result-object v4

    .line 1364
    invoke-virtual {v4}, La/fee;->c()Ljava/lang/Object;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v4

    .line 1368
    check-cast v4, La/ekw;

    .line 1369
    .line 1370
    iget-object v4, v4, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1371
    .line 1372
    sget-object v5, La/sip;->c:La/sip;

    .line 1373
    .line 1374
    invoke-static {v5}, La/kpb;->u(La/sip;)Z

    .line 1375
    .line 1376
    .line 1377
    move-result v7

    .line 1378
    iget-object v0, v0, La/wyj;->d:La/zjw;

    .line 1379
    .line 1380
    iget-boolean v5, v0, La/zjw;->e:Z

    .line 1381
    .line 1382
    iget-object v6, v0, La/zjw;->b:La/sff0;

    .line 1383
    .line 1384
    iget-object v8, v0, La/zjw;->c:Ljava/util/List;

    .line 1385
    .line 1386
    iget-boolean v9, v0, La/zjw;->s:Z

    .line 1387
    .line 1388
    invoke-static/range {v1 .. v9}, La/luj;->a(Ljava/util/List;La/y78;La/ctf0;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;ZLa/sff0;ZLjava/util/List;Z)La/lc00;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v0

    .line 1392
    return-object v0

    .line 1393
    :pswitch_6
    move-object/from16 v1, p1

    .line 1394
    .line 1395
    check-cast v1, Ljava/util/List;

    .line 1396
    .line 1397
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1398
    .line 1399
    .line 1400
    iget-object v2, v0, La/wyj;->d:La/zjw;

    .line 1401
    .line 1402
    iget-object v3, v2, La/zjw;->b:La/sff0;

    .line 1403
    .line 1404
    invoke-virtual {v0}, La/wyj;->b()La/fee;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v4

    .line 1408
    invoke-virtual {v4}, La/fee;->c()Ljava/lang/Object;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v4

    .line 1412
    check-cast v4, La/ekw;

    .line 1413
    .line 1414
    iget-object v4, v4, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1415
    .line 1416
    iget-boolean v2, v2, La/zjw;->f:Z

    .line 1417
    .line 1418
    invoke-static {v3, v4, v2}, La/wyj;->a(La/sff0;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Z)Ljava/lang/String;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v2

    .line 1422
    invoke-virtual {v0}, La/wyj;->b()La/fee;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v0

    .line 1426
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 1427
    .line 1428
    .line 1429
    move-result-object v0

    .line 1430
    check-cast v0, La/ekw;

    .line 1431
    .line 1432
    iget-object v0, v0, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1433
    .line 1434
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1435
    .line 1436
    .line 1437
    invoke-static {v2}, La/ujn;->i(Ljava/lang/String;)La/lq5;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v2

    .line 1441
    invoke-static {v0}, Lorg/xplatform/cyber/section/api/domain/entity/d;->a(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)Ljava/lang/String;

    .line 1442
    .line 1443
    .line 1444
    move-result-object v0

    .line 1445
    const-string v3, "HomeBannerCollectionUiModel"

    .line 1446
    .line 1447
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v0

    .line 1451
    new-instance v3, Ljava/util/ArrayList;

    .line 1452
    .line 1453
    invoke-static {v1, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1454
    .line 1455
    .line 1456
    move-result v4

    .line 1457
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 1458
    .line 1459
    .line 1460
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v1

    .line 1464
    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1465
    .line 1466
    .line 1467
    move-result v4

    .line 1468
    if-eqz v4, :cond_24

    .line 1469
    .line 1470
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1471
    .line 1472
    .line 1473
    move-result-object v4

    .line 1474
    check-cast v4, La/uog;

    .line 1475
    .line 1476
    iget v7, v4, La/uog;->a:I

    .line 1477
    .line 1478
    iget-object v6, v4, La/uog;->l:Ljava/lang/String;

    .line 1479
    .line 1480
    sget-object v8, La/gq5;->a:La/gq5;

    .line 1481
    .line 1482
    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1483
    .line 1484
    .line 1485
    move-result v8

    .line 1486
    if-nez v8, :cond_22

    .line 1487
    .line 1488
    sget-object v8, La/fq5;->a:La/fq5;

    .line 1489
    .line 1490
    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1491
    .line 1492
    .line 1493
    move-result v8

    .line 1494
    if-eqz v8, :cond_1c

    .line 1495
    .line 1496
    goto :goto_14

    .line 1497
    :cond_1c
    sget-object v8, La/hq5;->a:La/hq5;

    .line 1498
    .line 1499
    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1500
    .line 1501
    .line 1502
    move-result v8

    .line 1503
    if-nez v8, :cond_20

    .line 1504
    .line 1505
    sget-object v8, La/iq5;->a:La/iq5;

    .line 1506
    .line 1507
    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1508
    .line 1509
    .line 1510
    move-result v8

    .line 1511
    if-nez v8, :cond_20

    .line 1512
    .line 1513
    sget-object v8, La/kq5;->a:La/kq5;

    .line 1514
    .line 1515
    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1516
    .line 1517
    .line 1518
    move-result v8

    .line 1519
    if-nez v8, :cond_20

    .line 1520
    .line 1521
    instance-of v8, v2, La/jq5;

    .line 1522
    .line 1523
    if-eqz v8, :cond_1d

    .line 1524
    .line 1525
    goto :goto_13

    .line 1526
    :cond_1d
    sget-object v6, La/dq5;->a:La/dq5;

    .line 1527
    .line 1528
    invoke-virtual {v2, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1529
    .line 1530
    .line 1531
    move-result v6

    .line 1532
    if-nez v6, :cond_1f

    .line 1533
    .line 1534
    sget-object v6, La/eq5;->a:La/eq5;

    .line 1535
    .line 1536
    invoke-virtual {v2, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1537
    .line 1538
    .line 1539
    move-result v6

    .line 1540
    if-nez v6, :cond_1f

    .line 1541
    .line 1542
    sget-object v6, La/cq5;->a:La/cq5;

    .line 1543
    .line 1544
    invoke-virtual {v2, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1545
    .line 1546
    .line 1547
    move-result v6

    .line 1548
    if-eqz v6, :cond_1e

    .line 1549
    .line 1550
    goto :goto_12

    .line 1551
    :cond_1e
    invoke-static {}, La/t9f;->b()V

    .line 1552
    .line 1553
    .line 1554
    goto :goto_16

    .line 1555
    :cond_1f
    :goto_12
    iget-object v6, v4, La/uog;->o:Ljava/lang/String;

    .line 1556
    .line 1557
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 1558
    .line 1559
    .line 1560
    move-result v8

    .line 1561
    if-nez v8, :cond_23

    .line 1562
    .line 1563
    iget-object v6, v4, La/uog;->e:Ljava/lang/String;

    .line 1564
    .line 1565
    goto :goto_15

    .line 1566
    :cond_20
    :goto_13
    iget-object v8, v4, La/uog;->m:Ljava/lang/String;

    .line 1567
    .line 1568
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 1569
    .line 1570
    .line 1571
    move-result v9

    .line 1572
    if-nez v9, :cond_21

    .line 1573
    .line 1574
    goto :goto_15

    .line 1575
    :cond_21
    move-object v6, v8

    .line 1576
    goto :goto_15

    .line 1577
    :cond_22
    :goto_14
    iget-object v8, v4, La/uog;->n:Ljava/lang/String;

    .line 1578
    .line 1579
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 1580
    .line 1581
    .line 1582
    move-result v9

    .line 1583
    if-nez v9, :cond_21

    .line 1584
    .line 1585
    :cond_23
    :goto_15
    new-instance v8, La/n0x;

    .line 1586
    .line 1587
    invoke-direct {v8, v6}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 1588
    .line 1589
    .line 1590
    iget-object v10, v4, La/uog;->b:Ljava/lang/String;

    .line 1591
    .line 1592
    iget-object v11, v4, La/uog;->d:Ljava/lang/String;

    .line 1593
    .line 1594
    new-instance v6, La/fr5;

    .line 1595
    .line 1596
    const/4 v9, 0x0

    .line 1597
    const/4 v12, 0x0

    .line 1598
    const/16 v13, 0x44

    .line 1599
    .line 1600
    invoke-direct/range {v6 .. v13}, La/fr5;-><init>(ILa/n0x;La/n0x;Ljava/lang/String;Ljava/lang/String;La/er5;I)V

    .line 1601
    .line 1602
    .line 1603
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1604
    .line 1605
    .line 1606
    goto/16 :goto_11

    .line 1607
    .line 1608
    :cond_24
    invoke-static {v3}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1609
    .line 1610
    .line 1611
    move-result-object v1

    .line 1612
    new-instance v5, La/zhw;

    .line 1613
    .line 1614
    invoke-direct {v5, v0, v2, v1}, La/zhw;-><init>(Ljava/lang/String;La/lq5;La/a4x;)V

    .line 1615
    .line 1616
    .line 1617
    :goto_16
    return-object v5

    .line 1618
    :pswitch_7
    move-object/from16 v1, p1

    .line 1619
    .line 1620
    check-cast v1, La/fee;

    .line 1621
    .line 1622
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1623
    .line 1624
    .line 1625
    new-instance v7, La/gkw;

    .line 1626
    .line 1627
    iget-object v2, v0, La/wyj;->d:La/zjw;

    .line 1628
    .line 1629
    iget-boolean v3, v2, La/zjw;->f:Z

    .line 1630
    .line 1631
    xor-int/lit8 v8, v3, 0x1

    .line 1632
    .line 1633
    iget-object v3, v2, La/zjw;->a:Ljava/util/List;

    .line 1634
    .line 1635
    invoke-static {v3}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1636
    .line 1637
    .line 1638
    move-result-object v9

    .line 1639
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 1640
    .line 1641
    .line 1642
    move-result-object v3

    .line 1643
    move-object v10, v3

    .line 1644
    check-cast v10, La/ekw;

    .line 1645
    .line 1646
    iget-object v3, v0, La/wyj;->g:La/n0o0;

    .line 1647
    .line 1648
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1649
    .line 1650
    .line 1651
    move-result-object v3

    .line 1652
    check-cast v3, La/fee;

    .line 1653
    .line 1654
    iget-object v3, v3, La/fee;->d:La/pz40;

    .line 1655
    .line 1656
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v3

    .line 1660
    check-cast v3, Ljava/lang/Boolean;

    .line 1661
    .line 1662
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1663
    .line 1664
    .line 1665
    move-result v11

    .line 1666
    iget-object v0, v0, La/wyj;->h:La/n0o0;

    .line 1667
    .line 1668
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1669
    .line 1670
    .line 1671
    move-result-object v0

    .line 1672
    check-cast v0, La/fee;

    .line 1673
    .line 1674
    iget-object v0, v0, La/fee;->d:La/pz40;

    .line 1675
    .line 1676
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1677
    .line 1678
    .line 1679
    move-result-object v0

    .line 1680
    check-cast v0, Ljava/lang/Boolean;

    .line 1681
    .line 1682
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1683
    .line 1684
    .line 1685
    move-result v12

    .line 1686
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 1687
    .line 1688
    .line 1689
    move-result-object v0

    .line 1690
    check-cast v0, La/ekw;

    .line 1691
    .line 1692
    iget-object v0, v0, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1693
    .line 1694
    instance-of v13, v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 1695
    .line 1696
    iget-object v0, v2, La/zjw;->b:La/sff0;

    .line 1697
    .line 1698
    invoke-static {v0}, La/ucx;->X(La/sff0;)La/dxh0;

    .line 1699
    .line 1700
    .line 1701
    move-result-object v14

    .line 1702
    invoke-direct/range {v7 .. v14}, La/gkw;-><init>(ZLa/a4x;La/ekw;ZZZLa/dxh0;)V

    .line 1703
    .line 1704
    .line 1705
    return-object v7

    .line 1706
    :pswitch_8
    move-object/from16 v1, p1

    .line 1707
    .line 1708
    check-cast v1, Ljava/util/List;

    .line 1709
    .line 1710
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1711
    .line 1712
    .line 1713
    invoke-virtual {v0}, La/wyj;->b()La/fee;

    .line 1714
    .line 1715
    .line 1716
    move-result-object v7

    .line 1717
    invoke-virtual {v7}, La/fee;->c()Ljava/lang/Object;

    .line 1718
    .line 1719
    .line 1720
    move-result-object v7

    .line 1721
    check-cast v7, La/ekw;

    .line 1722
    .line 1723
    iget-object v7, v7, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1724
    .line 1725
    iget-object v10, v0, La/wyj;->a:La/ctf0;

    .line 1726
    .line 1727
    iget-object v11, v0, La/wyj;->d:La/zjw;

    .line 1728
    .line 1729
    iget-boolean v11, v11, La/zjw;->f:Z

    .line 1730
    .line 1731
    iget-object v0, v0, La/wyj;->i:La/n0o0;

    .line 1732
    .line 1733
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1734
    .line 1735
    .line 1736
    move-result-object v0

    .line 1737
    check-cast v0, La/fee;

    .line 1738
    .line 1739
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 1740
    .line 1741
    .line 1742
    move-result-object v0

    .line 1743
    check-cast v0, Ljava/util/List;

    .line 1744
    .line 1745
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1746
    .line 1747
    .line 1748
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1749
    .line 1750
    .line 1751
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1752
    .line 1753
    .line 1754
    sget-object v12, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 1755
    .line 1756
    invoke-virtual {v7, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1757
    .line 1758
    .line 1759
    move-result v7

    .line 1760
    if-nez v7, :cond_25

    .line 1761
    .line 1762
    sget-object v0, La/iun;->a:La/iun;

    .line 1763
    .line 1764
    goto/16 :goto_23

    .line 1765
    .line 1766
    :cond_25
    new-instance v7, Ljava/util/ArrayList;

    .line 1767
    .line 1768
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1769
    .line 1770
    .line 1771
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1772
    .line 1773
    .line 1774
    move-result-object v1

    .line 1775
    :cond_26
    :goto_17
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1776
    .line 1777
    .line 1778
    move-result v12

    .line 1779
    if-eqz v12, :cond_28

    .line 1780
    .line 1781
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1782
    .line 1783
    .line 1784
    move-result-object v12

    .line 1785
    move-object v13, v12

    .line 1786
    check-cast v13, La/lok0;

    .line 1787
    .line 1788
    if-eqz v11, :cond_27

    .line 1789
    .line 1790
    iget-object v13, v13, La/lok0;->t:Ljava/util/List;

    .line 1791
    .line 1792
    const/4 v14, 0x4

    .line 1793
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1794
    .line 1795
    .line 1796
    move-result-object v14

    .line 1797
    invoke-interface {v13, v14}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1798
    .line 1799
    .line 1800
    move-result v13

    .line 1801
    goto :goto_18

    .line 1802
    :cond_27
    iget-object v13, v13, La/lok0;->t:Ljava/util/List;

    .line 1803
    .line 1804
    const/4 v14, 0x5

    .line 1805
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1806
    .line 1807
    .line 1808
    move-result-object v14

    .line 1809
    invoke-interface {v13, v14}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1810
    .line 1811
    .line 1812
    move-result v13

    .line 1813
    :goto_18
    if-eqz v13, :cond_26

    .line 1814
    .line 1815
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1816
    .line 1817
    .line 1818
    goto :goto_17

    .line 1819
    :cond_28
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1820
    .line 1821
    .line 1822
    move-result v1

    .line 1823
    if-nez v1, :cond_33

    .line 1824
    .line 1825
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 1826
    .line 1827
    .line 1828
    move-result-object v1

    .line 1829
    new-instance v11, La/nuj;

    .line 1830
    .line 1831
    new-instance v12, La/hjm;

    .line 1832
    .line 1833
    new-array v13, v9, [Ljava/lang/Object;

    .line 1834
    .line 1835
    iget-object v10, v10, La/ctf0;->b:La/lsm0;

    .line 1836
    .line 1837
    invoke-static {v13, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1838
    .line 1839
    .line 1840
    move-result-object v13

    .line 1841
    const v14, 0x7f1315d8

    .line 1842
    .line 1843
    .line 1844
    invoke-virtual {v10, v14, v13}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1845
    .line 1846
    .line 1847
    move-result-object v13

    .line 1848
    const/16 v24, 0x0

    .line 1849
    .line 1850
    const/16 v25, 0x1fbe

    .line 1851
    .line 1852
    const/4 v14, 0x0

    .line 1853
    const/4 v15, 0x0

    .line 1854
    const/16 v16, 0x0

    .line 1855
    .line 1856
    const/16 v17, 0x0

    .line 1857
    .line 1858
    const/16 v18, 0x0

    .line 1859
    .line 1860
    const/16 v19, 0x0

    .line 1861
    .line 1862
    const/16 v20, 0x0

    .line 1863
    .line 1864
    const/16 v21, 0x0

    .line 1865
    .line 1866
    const/16 v22, 0x0

    .line 1867
    .line 1868
    const/16 v23, 0x0

    .line 1869
    .line 1870
    invoke-direct/range {v12 .. v25}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 1871
    .line 1872
    .line 1873
    const-string v10, "HomeHeaderUiModel_SPECIAL_EVENTS"

    .line 1874
    .line 1875
    invoke-direct {v11, v10, v12}, La/nuj;-><init>(Ljava/lang/String;La/jjm;)V

    .line 1876
    .line 1877
    .line 1878
    new-instance v10, Ljava/util/ArrayList;

    .line 1879
    .line 1880
    invoke-static {v7, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1881
    .line 1882
    .line 1883
    move-result v8

    .line 1884
    invoke-direct {v10, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 1885
    .line 1886
    .line 1887
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1888
    .line 1889
    .line 1890
    move-result-object v7

    .line 1891
    :goto_19
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1892
    .line 1893
    .line 1894
    move-result v8

    .line 1895
    if-eqz v8, :cond_32

    .line 1896
    .line 1897
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1898
    .line 1899
    .line 1900
    move-result-object v8

    .line 1901
    check-cast v8, La/lok0;

    .line 1902
    .line 1903
    iget v12, v8, La/lok0;->a:I

    .line 1904
    .line 1905
    iget-object v13, v8, La/lok0;->u:Ljava/lang/String;

    .line 1906
    .line 1907
    iget-wide v14, v8, La/lok0;->f:J

    .line 1908
    .line 1909
    iget-object v5, v8, La/lok0;->b:Ljava/lang/String;

    .line 1910
    .line 1911
    move-object/from16 p0, v7

    .line 1912
    .line 1913
    iget-wide v6, v8, La/lok0;->g:J

    .line 1914
    .line 1915
    const-wide/16 v18, 0x0

    .line 1916
    .line 1917
    cmp-long v20, v6, v18

    .line 1918
    .line 1919
    const-string v21, ""

    .line 1920
    .line 1921
    const-string v4, ".svg"

    .line 1922
    .line 1923
    const-string v9, "sports_v2"

    .line 1924
    .line 1925
    move-object/from16 p1, v0

    .line 1926
    .line 1927
    const-string v0, "svg"

    .line 1928
    .line 1929
    move-wide/from16 v24, v6

    .line 1930
    .line 1931
    const-string v6, "static"

    .line 1932
    .line 1933
    if-eqz v20, :cond_31

    .line 1934
    .line 1935
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1936
    .line 1937
    .line 1938
    move-result-object v7

    .line 1939
    :goto_1a
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1940
    .line 1941
    .line 1942
    move-result v20

    .line 1943
    if-eqz v20, :cond_2a

    .line 1944
    .line 1945
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1946
    .line 1947
    .line 1948
    move-result-object v20

    .line 1949
    move-object/from16 v26, v7

    .line 1950
    .line 1951
    move-object/from16 v7, v20

    .line 1952
    .line 1953
    check-cast v7, La/f3n0;

    .line 1954
    .line 1955
    move-object/from16 v28, v10

    .line 1956
    .line 1957
    move-object/from16 v27, v11

    .line 1958
    .line 1959
    iget-wide v10, v7, La/f3n0;->a:J

    .line 1960
    .line 1961
    cmp-long v7, v10, v24

    .line 1962
    .line 1963
    if-nez v7, :cond_29

    .line 1964
    .line 1965
    goto :goto_1b

    .line 1966
    :cond_29
    move-object/from16 v7, v26

    .line 1967
    .line 1968
    move-object/from16 v11, v27

    .line 1969
    .line 1970
    move-object/from16 v10, v28

    .line 1971
    .line 1972
    goto :goto_1a

    .line 1973
    :cond_2a
    move-object/from16 v28, v10

    .line 1974
    .line 1975
    move-object/from16 v27, v11

    .line 1976
    .line 1977
    const/16 v20, 0x0

    .line 1978
    .line 1979
    :goto_1b
    move-object/from16 v7, v20

    .line 1980
    .line 1981
    check-cast v7, La/f3n0;

    .line 1982
    .line 1983
    if-eqz v7, :cond_2f

    .line 1984
    .line 1985
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1986
    .line 1987
    sget-object v4, La/ujn;->h:Ljava/lang/String;

    .line 1988
    .line 1989
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1990
    .line 1991
    .line 1992
    iget-object v4, v7, La/f3n0;->c:La/lel0;

    .line 1993
    .line 1994
    iget-object v4, v4, La/lel0;->j:Ljava/lang/String;

    .line 1995
    .line 1996
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1997
    .line 1998
    .line 1999
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 2000
    .line 2001
    .line 2002
    move-result v6

    .line 2003
    if-nez v6, :cond_2b

    .line 2004
    .line 2005
    const/4 v6, 0x0

    .line 2006
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 2007
    .line 2008
    .line 2009
    move v11, v6

    .line 2010
    const/16 v7, 0x2f

    .line 2011
    .line 2012
    const/4 v10, 0x1

    .line 2013
    goto :goto_20

    .line 2014
    :cond_2b
    const/4 v6, 0x0

    .line 2015
    sget-object v7, La/ujn;->h:Ljava/lang/String;

    .line 2016
    .line 2017
    invoke-static {v4, v7, v6}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 2018
    .line 2019
    .line 2020
    move-result v7

    .line 2021
    if-nez v7, :cond_2e

    .line 2022
    .line 2023
    invoke-static {v4, v3, v6}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 2024
    .line 2025
    .line 2026
    move-result v7

    .line 2027
    if-eqz v7, :cond_2c

    .line 2028
    .line 2029
    const/4 v11, 0x0

    .line 2030
    :goto_1c
    const/16 v7, 0x2f

    .line 2031
    .line 2032
    const/4 v10, 0x1

    .line 2033
    goto :goto_1f

    .line 2034
    :cond_2c
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 2035
    .line 2036
    .line 2037
    move-result v6

    .line 2038
    if-lez v6, :cond_2d

    .line 2039
    .line 2040
    invoke-static {v0, v2}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 2041
    .line 2042
    .line 2043
    move-result v6

    .line 2044
    if-nez v6, :cond_2d

    .line 2045
    .line 2046
    const/16 v7, 0x2f

    .line 2047
    .line 2048
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 2049
    .line 2050
    .line 2051
    :goto_1d
    const/4 v10, 0x1

    .line 2052
    goto :goto_1e

    .line 2053
    :cond_2d
    const/16 v7, 0x2f

    .line 2054
    .line 2055
    goto :goto_1d

    .line 2056
    :goto_1e
    new-array v6, v10, [C

    .line 2057
    .line 2058
    const/4 v11, 0x0

    .line 2059
    aput-char v7, v6, v11

    .line 2060
    .line 2061
    invoke-static {v4, v6}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 2062
    .line 2063
    .line 2064
    move-result-object v4

    .line 2065
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2066
    .line 2067
    .line 2068
    goto :goto_20

    .line 2069
    :cond_2e
    move v11, v6

    .line 2070
    goto :goto_1c

    .line 2071
    :goto_1f
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 2072
    .line 2073
    .line 2074
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2075
    .line 2076
    .line 2077
    :goto_20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2078
    .line 2079
    .line 2080
    move-result-object v0

    .line 2081
    goto :goto_22

    .line 2082
    :cond_2f
    const/16 v7, 0x2f

    .line 2083
    .line 2084
    const/4 v10, 0x1

    .line 2085
    const/4 v11, 0x0

    .line 2086
    cmp-long v17, v14, v18

    .line 2087
    .line 2088
    if-eqz v17, :cond_30

    .line 2089
    .line 2090
    invoke-static {v6, v0, v9}, La/rz4;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)La/bzu;

    .line 2091
    .line 2092
    .line 2093
    move-result-object v0

    .line 2094
    invoke-static {v14, v15, v4, v0}, La/rz4;->s(JLjava/lang/String;La/bzu;)V

    .line 2095
    .line 2096
    .line 2097
    iget-object v0, v0, La/bzu;->b:Ljava/lang/Object;

    .line 2098
    .line 2099
    check-cast v0, Ljava/lang/StringBuilder;

    .line 2100
    .line 2101
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2102
    .line 2103
    .line 2104
    move-result-object v21

    .line 2105
    :cond_30
    :goto_21
    move-object/from16 v0, v21

    .line 2106
    .line 2107
    goto :goto_22

    .line 2108
    :cond_31
    move-object/from16 v28, v10

    .line 2109
    .line 2110
    move-object/from16 v27, v11

    .line 2111
    .line 2112
    const/16 v7, 0x2f

    .line 2113
    .line 2114
    const/4 v10, 0x1

    .line 2115
    const/4 v11, 0x0

    .line 2116
    cmp-long v17, v14, v18

    .line 2117
    .line 2118
    if-eqz v17, :cond_30

    .line 2119
    .line 2120
    invoke-static {v6, v0, v9}, La/rz4;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)La/bzu;

    .line 2121
    .line 2122
    .line 2123
    move-result-object v0

    .line 2124
    invoke-static {v14, v15, v4, v0}, La/rz4;->s(JLjava/lang/String;La/bzu;)V

    .line 2125
    .line 2126
    .line 2127
    iget-object v0, v0, La/bzu;->b:Ljava/lang/Object;

    .line 2128
    .line 2129
    check-cast v0, Ljava/lang/StringBuilder;

    .line 2130
    .line 2131
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2132
    .line 2133
    .line 2134
    move-result-object v21

    .line 2135
    goto :goto_21

    .line 2136
    :goto_22
    new-instance v4, La/n0x;

    .line 2137
    .line 2138
    invoke-direct {v4, v0}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 2139
    .line 2140
    .line 2141
    new-instance v0, La/qc5;

    .line 2142
    .line 2143
    new-instance v6, La/n0x;

    .line 2144
    .line 2145
    invoke-static {v12, v13}, La/q5x;->D(ILjava/lang/String;)Ljava/lang/String;

    .line 2146
    .line 2147
    .line 2148
    move-result-object v9

    .line 2149
    invoke-direct {v6, v9}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 2150
    .line 2151
    .line 2152
    const/4 v9, 0x0

    .line 2153
    invoke-direct {v0, v9, v6, v9}, La/qc5;-><init>(Ljava/lang/Integer;La/n0x;La/y3d;)V

    .line 2154
    .line 2155
    .line 2156
    new-instance v16, La/rx30;

    .line 2157
    .line 2158
    const-wide/16 v23, 0x0

    .line 2159
    .line 2160
    const/16 v26, 0x1b6

    .line 2161
    .line 2162
    const-wide/16 v19, 0x0

    .line 2163
    .line 2164
    const/16 v21, 0x0

    .line 2165
    .line 2166
    const v22, 0x7f080f06

    .line 2167
    .line 2168
    .line 2169
    move-object/from16 v25, v0

    .line 2170
    .line 2171
    move-object/from16 v18, v4

    .line 2172
    .line 2173
    move-object/from16 v17, v16

    .line 2174
    .line 2175
    invoke-direct/range {v17 .. v26}, La/rx30;-><init>(La/o0x;JLa/miz;IJLa/rc5;I)V

    .line 2176
    .line 2177
    .line 2178
    new-instance v15, La/ux30;

    .line 2179
    .line 2180
    iget-object v0, v8, La/lok0;->b:Ljava/lang/String;

    .line 2181
    .line 2182
    const/16 v22, 0x0

    .line 2183
    .line 2184
    const/16 v18, 0xe

    .line 2185
    .line 2186
    move-object/from16 v21, v0

    .line 2187
    .line 2188
    move-object/from16 v17, v15

    .line 2189
    .line 2190
    invoke-direct/range {v17 .. v22}, La/ux30;-><init>(IJLjava/lang/String;Ljava/lang/String;)V

    .line 2191
    .line 2192
    .line 2193
    new-instance v0, La/zx30;

    .line 2194
    .line 2195
    new-instance v4, La/n0x;

    .line 2196
    .line 2197
    invoke-static {v12, v13}, La/q5x;->E(ILjava/lang/String;)Ljava/lang/String;

    .line 2198
    .line 2199
    .line 2200
    move-result-object v6

    .line 2201
    invoke-direct {v4, v6}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 2202
    .line 2203
    .line 2204
    const/4 v6, 0x2

    .line 2205
    invoke-direct {v0, v4, v6}, La/zx30;-><init>(La/o0x;I)V

    .line 2206
    .line 2207
    .line 2208
    new-instance v14, La/gy30;

    .line 2209
    .line 2210
    const/16 v21, 0x0

    .line 2211
    .line 2212
    const/16 v22, 0xf8

    .line 2213
    .line 2214
    const-wide/16 v18, 0x0

    .line 2215
    .line 2216
    const/16 v20, 0x0

    .line 2217
    .line 2218
    move-object/from16 v17, v0

    .line 2219
    .line 2220
    invoke-direct/range {v14 .. v22}, La/gy30;-><init>(La/wx30;La/sx30;La/fy30;JLjava/util/List;La/xx30;I)V

    .line 2221
    .line 2222
    .line 2223
    new-instance v0, La/xjw;

    .line 2224
    .line 2225
    invoke-direct {v0, v12, v5, v14}, La/xjw;-><init>(ILjava/lang/String;La/gy30;)V

    .line 2226
    .line 2227
    .line 2228
    move-object/from16 v4, v28

    .line 2229
    .line 2230
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2231
    .line 2232
    .line 2233
    move-object/from16 v0, p1

    .line 2234
    .line 2235
    move-object v5, v9

    .line 2236
    move v6, v10

    .line 2237
    move v9, v11

    .line 2238
    move-object/from16 v11, v27

    .line 2239
    .line 2240
    move-object v10, v4

    .line 2241
    move v4, v7

    .line 2242
    move-object/from16 v7, p0

    .line 2243
    .line 2244
    goto/16 :goto_19

    .line 2245
    .line 2246
    :cond_32
    move-object v4, v10

    .line 2247
    move-object/from16 v27, v11

    .line 2248
    .line 2249
    invoke-static {v4}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 2250
    .line 2251
    .line 2252
    move-result-object v0

    .line 2253
    move-object/from16 v2, v27

    .line 2254
    .line 2255
    invoke-virtual {v1, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2256
    .line 2257
    .line 2258
    new-instance v2, La/wjw;

    .line 2259
    .line 2260
    invoke-direct {v2, v0}, La/wjw;-><init>(La/a4x;)V

    .line 2261
    .line 2262
    .line 2263
    invoke-virtual {v1, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2264
    .line 2265
    .line 2266
    invoke-static {v1}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 2267
    .line 2268
    .line 2269
    move-result-object v0

    .line 2270
    goto :goto_23

    .line 2271
    :cond_33
    sget-object v0, La/iun;->a:La/iun;

    .line 2272
    .line 2273
    :goto_23
    return-object v0

    .line 2274
    nop

    .line 2275
    :pswitch_data_0
    .packed-switch 0x0
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
