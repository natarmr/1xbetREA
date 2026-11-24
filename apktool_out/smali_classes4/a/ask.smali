.class public abstract La/ask;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(La/zrk;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/ctf0;)Ljava/util/List;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v2, v0, La/zrk;->a:Ljava/util/List;

    .line 12
    .line 13
    iget-object v0, v0, La/zrk;->b:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    sget-object v0, La/iun;->a:La/iun;

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_0
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    new-instance v4, Ljava/util/ArrayList;

    .line 35
    .line 36
    const/16 v5, 0xa

    .line 37
    .line 38
    invoke-static {v2, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    if-eqz v7, :cond_1

    .line 54
    .line 55
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    check-cast v7, La/nyg;

    .line 60
    .line 61
    iget-wide v7, v7, La/nyg;->g:J

    .line 62
    .line 63
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    new-instance v6, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    if-eqz v7, :cond_3

    .line 85
    .line 86
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    move-object v8, v7

    .line 91
    check-cast v8, La/nyg;

    .line 92
    .line 93
    iget-wide v8, v8, La/nyg;->g:J

    .line 94
    .line 95
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    if-nez v8, :cond_2

    .line 104
    .line 105
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    const/4 v4, 0x0

    .line 114
    if-eqz v0, :cond_4

    .line 115
    .line 116
    move v7, v4

    .line 117
    goto :goto_2

    .line 118
    :cond_4
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    const/4 v7, 0x3

    .line 123
    if-lt v0, v7, :cond_5

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_5
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 127
    .line 128
    .line 129
    move-result v7

    .line 130
    :goto_2
    rsub-int/lit8 v0, v7, 0x6

    .line 131
    .line 132
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 133
    .line 134
    .line 135
    move-result v8

    .line 136
    invoke-static {v0, v8}, Ljava/lang/Math;->min(II)I

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    const/4 v8, 0x6

    .line 141
    invoke-static {v8, v0}, Ljava/lang/Math;->min(II)I

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 146
    .line 147
    .line 148
    move-result v8

    .line 149
    sub-int/2addr v8, v7

    .line 150
    rsub-int/lit8 v9, v0, 0x6

    .line 151
    .line 152
    sub-int/2addr v9, v7

    .line 153
    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    .line 154
    .line 155
    .line 156
    move-result v8

    .line 157
    invoke-static {v4, v8}, Ljava/lang/Math;->max(II)I

    .line 158
    .line 159
    .line 160
    move-result v8

    .line 161
    add-int/2addr v8, v7

    .line 162
    invoke-static {v2, v8}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    invoke-static {v6, v0}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    new-instance v6, La/v7m;

    .line 171
    .line 172
    new-instance v7, La/c8m;

    .line 173
    .line 174
    new-array v8, v4, [Ljava/lang/Object;

    .line 175
    .line 176
    move-object/from16 v9, p2

    .line 177
    .line 178
    iget-object v9, v9, La/ctf0;->b:La/lsm0;

    .line 179
    .line 180
    invoke-static {v8, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v8

    .line 184
    const v10, 0x7f130403

    .line 185
    .line 186
    .line 187
    invoke-virtual {v9, v10, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v8

    .line 191
    sget-object v10, La/n7m;->a:La/n7m;

    .line 192
    .line 193
    invoke-direct {v7, v8, v10}, La/c8m;-><init>(Ljava/lang/CharSequence;La/o7m;)V

    .line 194
    .line 195
    .line 196
    invoke-direct {v6, v7}, La/v7m;-><init>(La/c8m;)V

    .line 197
    .line 198
    .line 199
    invoke-static {v2, v0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    new-instance v2, Ljava/util/ArrayList;

    .line 204
    .line 205
    invoke-static {v0, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 206
    .line 207
    .line 208
    move-result v5

    .line 209
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 217
    .line 218
    .line 219
    move-result v5

    .line 220
    if-eqz v5, :cond_13

    .line 221
    .line 222
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v5

    .line 226
    check-cast v5, La/nyg;

    .line 227
    .line 228
    iget-wide v11, v5, La/nyg;->g:J

    .line 229
    .line 230
    iget-boolean v7, v5, La/nyg;->m:Z

    .line 231
    .line 232
    if-eqz v7, :cond_6

    .line 233
    .line 234
    new-instance v7, La/pmh;

    .line 235
    .line 236
    new-array v8, v4, [Ljava/lang/Object;

    .line 237
    .line 238
    invoke-static {v8, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v8

    .line 242
    const v10, 0x7f130b3d

    .line 243
    .line 244
    .line 245
    invoke-virtual {v9, v10, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v8

    .line 249
    invoke-direct {v7, v8}, La/pmh;-><init>(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    :goto_4
    move-object/from16 v17, v7

    .line 253
    .line 254
    goto :goto_5

    .line 255
    :cond_6
    sget-object v7, La/qmh;->a:La/qmh;

    .line 256
    .line 257
    goto :goto_4

    .line 258
    :goto_5
    iget-object v7, v5, La/nyg;->f:Ljava/lang/String;

    .line 259
    .line 260
    iget-wide v13, v5, La/nyg;->i:J

    .line 261
    .line 262
    const-wide/16 v15, 0xf3

    .line 263
    .line 264
    cmp-long v8, v13, v15

    .line 265
    .line 266
    if-nez v8, :cond_7

    .line 267
    .line 268
    const-string v8, ". "

    .line 269
    .line 270
    invoke-static {v7, v8, v7}, Lkotlin/text/StringsKt;->m0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v7

    .line 274
    :cond_7
    move-object v15, v7

    .line 275
    iget-wide v7, v5, La/nyg;->l:J

    .line 276
    .line 277
    new-instance v5, Ljava/lang/StringBuilder;

    .line 278
    .line 279
    sget-object v10, La/ujn;->h:Ljava/lang/String;

    .line 280
    .line 281
    invoke-direct {v5, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    sget-object v10, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 285
    .line 286
    invoke-virtual {v1, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v10

    .line 290
    if-eqz v10, :cond_8

    .line 291
    .line 292
    const-string v10, "Real"

    .line 293
    .line 294
    goto :goto_6

    .line 295
    :cond_8
    sget-object v10, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 296
    .line 297
    invoke-virtual {v1, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v10

    .line 301
    if-eqz v10, :cond_9

    .line 302
    .line 303
    const-string v10, "Virtual"

    .line 304
    .line 305
    goto :goto_6

    .line 306
    :cond_9
    sget-object v10, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 307
    .line 308
    invoke-virtual {v1, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result v10

    .line 312
    if-eqz v10, :cond_12

    .line 313
    .line 314
    const-string v10, "1XCyber"

    .line 315
    .line 316
    :goto_6
    const-wide/16 v13, 0x1

    .line 317
    .line 318
    cmp-long v13, v7, v13

    .line 319
    .line 320
    if-nez v13, :cond_a

    .line 321
    .line 322
    const-string v7, "TopChamp_Dota2"

    .line 323
    .line 324
    goto :goto_7

    .line 325
    :cond_a
    const-wide/16 v13, 0x2e

    .line 326
    .line 327
    cmp-long v13, v7, v13

    .line 328
    .line 329
    if-nez v13, :cond_b

    .line 330
    .line 331
    const-string v7, "TopChamp_CS2"

    .line 332
    .line 333
    goto :goto_7

    .line 334
    :cond_b
    const-wide/16 v13, 0x1b

    .line 335
    .line 336
    cmp-long v13, v7, v13

    .line 337
    .line 338
    if-nez v13, :cond_c

    .line 339
    .line 340
    const-string v7, "TopChamp_Valorant"

    .line 341
    .line 342
    goto :goto_7

    .line 343
    :cond_c
    const-wide/16 v13, 0x2

    .line 344
    .line 345
    cmp-long v7, v7, v13

    .line 346
    .line 347
    if-nez v7, :cond_d

    .line 348
    .line 349
    const-string v7, "TopChamp_LoL"

    .line 350
    .line 351
    goto :goto_7

    .line 352
    :cond_d
    const-string v7, "TopChamp"

    .line 353
    .line 354
    :goto_7
    const-string v8, "/IconFocus/"

    .line 355
    .line 356
    const-string v13, ".png"

    .line 357
    .line 358
    const-string v14, "static/img/ImgDefault/Esports/"

    .line 359
    .line 360
    invoke-static {v14, v10, v8, v7, v13}, La/b1j;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v7

    .line 364
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 365
    .line 366
    .line 367
    move-result v8

    .line 368
    if-nez v8, :cond_e

    .line 369
    .line 370
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 371
    .line 372
    .line 373
    goto :goto_9

    .line 374
    :cond_e
    sget-object v8, La/ujn;->h:Ljava/lang/String;

    .line 375
    .line 376
    invoke-static {v7, v8, v4}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 377
    .line 378
    .line 379
    move-result v8

    .line 380
    if-nez v8, :cond_11

    .line 381
    .line 382
    const-string v8, "https://"

    .line 383
    .line 384
    invoke-static {v7, v8, v4}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 385
    .line 386
    .line 387
    move-result v8

    .line 388
    if-eqz v8, :cond_f

    .line 389
    .line 390
    goto :goto_8

    .line 391
    :cond_f
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->length()I

    .line 392
    .line 393
    .line 394
    move-result v8

    .line 395
    const/16 v10, 0x2f

    .line 396
    .line 397
    if-lez v8, :cond_10

    .line 398
    .line 399
    const-string v8, "/"

    .line 400
    .line 401
    invoke-static {v5, v8}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 402
    .line 403
    .line 404
    move-result v8

    .line 405
    if-nez v8, :cond_10

    .line 406
    .line 407
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    :cond_10
    const/4 v8, 0x1

    .line 411
    new-array v8, v8, [C

    .line 412
    .line 413
    aput-char v10, v8, v4

    .line 414
    .line 415
    invoke-static {v7, v8}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v7

    .line 419
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 420
    .line 421
    .line 422
    goto :goto_9

    .line 423
    :cond_11
    :goto_8
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 427
    .line 428
    .line 429
    :goto_9
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v13

    .line 433
    new-instance v10, La/smh;

    .line 434
    .line 435
    const-string v16, ""

    .line 436
    .line 437
    sget-object v14, La/nmh;->a:La/nmh;

    .line 438
    .line 439
    invoke-direct/range {v10 .. v17}, La/smh;-><init>(JLjava/lang/String;La/omh;Ljava/lang/String;Ljava/lang/String;La/rmh;)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    goto/16 :goto_3

    .line 446
    .line 447
    :cond_12
    invoke-static {}, La/t9f;->b()V

    .line 448
    .line 449
    .line 450
    const/4 v0, 0x0

    .line 451
    return-object v0

    .line 452
    :cond_13
    invoke-static {v2}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    new-instance v2, La/cnh;

    .line 457
    .line 458
    invoke-direct {v2, v0}, La/cnh;-><init>(La/i4;)V

    .line 459
    .line 460
    .line 461
    new-instance v0, La/rrk;

    .line 462
    .line 463
    const-string v4, "CHAMPIONSHIPS"

    .line 464
    .line 465
    invoke-direct {v0, v4, v1, v6, v2}, La/rrk;-><init>(Ljava/lang/String;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/b8m;La/enh;)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v3, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    invoke-static {v3}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    return-object v0
.end method
