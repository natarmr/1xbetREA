.class public abstract La/grv;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(La/n52;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/ctf0;)Ljava/util/List;
    .locals 20

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
    iget-object v2, v0, La/n52;->a:Ljava/util/List;

    .line 12
    .line 13
    iget-object v0, v0, La/n52;->b:Ljava/util/List;

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
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const/4 v5, 0x3

    .line 39
    const/4 v6, 0x6

    .line 40
    if-eqz v4, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    sub-int/2addr v6, v4

    .line 52
    :goto_0
    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    new-instance v4, Ljava/util/ArrayList;

    .line 57
    .line 58
    const/16 v5, 0xa

    .line 59
    .line 60
    invoke-static {v2, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    if-eqz v8, :cond_2

    .line 76
    .line 77
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    check-cast v8, La/nyg;

    .line 82
    .line 83
    iget-wide v8, v8, La/nyg;->g:J

    .line 84
    .line 85
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_2
    new-instance v7, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    if-eqz v8, :cond_4

    .line 107
    .line 108
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    move-object v9, v8

    .line 113
    check-cast v9, La/nyg;

    .line 114
    .line 115
    iget-wide v9, v9, La/nyg;->g:J

    .line 116
    .line 117
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 118
    .line 119
    .line 120
    move-result-object v9

    .line 121
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v9

    .line 125
    if-nez v9, :cond_3

    .line 126
    .line 127
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_4
    invoke-static {v7, v6}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    new-instance v4, La/v7m;

    .line 136
    .line 137
    new-instance v6, La/c8m;

    .line 138
    .line 139
    const/4 v7, 0x0

    .line 140
    new-array v8, v7, [Ljava/lang/Object;

    .line 141
    .line 142
    move-object/from16 v9, p2

    .line 143
    .line 144
    iget-object v9, v9, La/ctf0;->b:La/lsm0;

    .line 145
    .line 146
    invoke-static {v8, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    const v10, 0x7f130403

    .line 151
    .line 152
    .line 153
    invoke-virtual {v9, v10, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v8

    .line 157
    sget-object v10, La/n7m;->a:La/n7m;

    .line 158
    .line 159
    invoke-direct {v6, v8, v10}, La/c8m;-><init>(Ljava/lang/CharSequence;La/o7m;)V

    .line 160
    .line 161
    .line 162
    invoke-direct {v4, v6}, La/v7m;-><init>(La/c8m;)V

    .line 163
    .line 164
    .line 165
    invoke-static {v2, v0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    new-instance v2, Ljava/util/ArrayList;

    .line 170
    .line 171
    invoke-static {v0, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 183
    .line 184
    .line 185
    move-result v5

    .line 186
    if-eqz v5, :cond_12

    .line 187
    .line 188
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    check-cast v5, La/nyg;

    .line 193
    .line 194
    iget-wide v11, v5, La/nyg;->g:J

    .line 195
    .line 196
    iget-boolean v6, v5, La/nyg;->m:Z

    .line 197
    .line 198
    if-eqz v6, :cond_5

    .line 199
    .line 200
    new-instance v6, La/pmh;

    .line 201
    .line 202
    new-array v8, v7, [Ljava/lang/Object;

    .line 203
    .line 204
    invoke-static {v8, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v8

    .line 208
    const v10, 0x7f130b3d

    .line 209
    .line 210
    .line 211
    invoke-virtual {v9, v10, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v8

    .line 215
    invoke-direct {v6, v8}, La/pmh;-><init>(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    :goto_4
    move-object/from16 v17, v6

    .line 219
    .line 220
    goto :goto_5

    .line 221
    :cond_5
    sget-object v6, La/qmh;->a:La/qmh;

    .line 222
    .line 223
    goto :goto_4

    .line 224
    :goto_5
    iget-object v6, v5, La/nyg;->f:Ljava/lang/String;

    .line 225
    .line 226
    iget-wide v13, v5, La/nyg;->i:J

    .line 227
    .line 228
    const-wide/16 v15, 0xf3

    .line 229
    .line 230
    cmp-long v8, v13, v15

    .line 231
    .line 232
    if-nez v8, :cond_6

    .line 233
    .line 234
    const-string v8, ". "

    .line 235
    .line 236
    invoke-static {v6, v8, v6}, Lkotlin/text/StringsKt;->m0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v6

    .line 240
    :cond_6
    move-object v15, v6

    .line 241
    iget-object v6, v5, La/nyg;->j:Ljava/lang/String;

    .line 242
    .line 243
    iget-wide v13, v5, La/nyg;->l:J

    .line 244
    .line 245
    new-instance v8, Ljava/lang/StringBuilder;

    .line 246
    .line 247
    sget-object v10, La/ujn;->h:Ljava/lang/String;

    .line 248
    .line 249
    invoke-direct {v8, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    sget-object v10, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 253
    .line 254
    invoke-virtual {v1, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v10

    .line 258
    if-eqz v10, :cond_7

    .line 259
    .line 260
    const-string v10, "Real"

    .line 261
    .line 262
    goto :goto_6

    .line 263
    :cond_7
    sget-object v10, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 264
    .line 265
    invoke-virtual {v1, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v10

    .line 269
    if-eqz v10, :cond_8

    .line 270
    .line 271
    const-string v10, "Virtual"

    .line 272
    .line 273
    goto :goto_6

    .line 274
    :cond_8
    sget-object v10, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 275
    .line 276
    invoke-virtual {v1, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v10

    .line 280
    if-eqz v10, :cond_11

    .line 281
    .line 282
    const-string v10, "1XCyber"

    .line 283
    .line 284
    :goto_6
    const-wide/16 v18, 0x1

    .line 285
    .line 286
    cmp-long v16, v13, v18

    .line 287
    .line 288
    if-nez v16, :cond_9

    .line 289
    .line 290
    const-string v13, "TopChamp_Dota2"

    .line 291
    .line 292
    goto :goto_7

    .line 293
    :cond_9
    const-wide/16 v18, 0x2e

    .line 294
    .line 295
    cmp-long v16, v13, v18

    .line 296
    .line 297
    if-nez v16, :cond_a

    .line 298
    .line 299
    const-string v13, "TopChamp_CS2"

    .line 300
    .line 301
    goto :goto_7

    .line 302
    :cond_a
    const-wide/16 v18, 0x1b

    .line 303
    .line 304
    cmp-long v16, v13, v18

    .line 305
    .line 306
    if-nez v16, :cond_b

    .line 307
    .line 308
    const-string v13, "TopChamp_Valorant"

    .line 309
    .line 310
    goto :goto_7

    .line 311
    :cond_b
    const-wide/16 v18, 0x2

    .line 312
    .line 313
    cmp-long v13, v13, v18

    .line 314
    .line 315
    if-nez v13, :cond_c

    .line 316
    .line 317
    const-string v13, "TopChamp_LoL"

    .line 318
    .line 319
    goto :goto_7

    .line 320
    :cond_c
    const-string v13, "TopChamp"

    .line 321
    .line 322
    :goto_7
    const-string v14, "/HeaderFocus/"

    .line 323
    .line 324
    const-string v7, ".png"

    .line 325
    .line 326
    move-object/from16 p2, v0

    .line 327
    .line 328
    const-string v0, "static/img/ImgDefault/Esports/"

    .line 329
    .line 330
    invoke-static {v0, v10, v14, v13, v7}, La/b1j;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 335
    .line 336
    .line 337
    move-result v7

    .line 338
    if-nez v7, :cond_d

    .line 339
    .line 340
    const/4 v7, 0x0

    .line 341
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 342
    .line 343
    .line 344
    move v13, v7

    .line 345
    goto :goto_9

    .line 346
    :cond_d
    const/4 v7, 0x0

    .line 347
    sget-object v10, La/ujn;->h:Ljava/lang/String;

    .line 348
    .line 349
    invoke-static {v0, v10, v7}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 350
    .line 351
    .line 352
    move-result v10

    .line 353
    if-nez v10, :cond_10

    .line 354
    .line 355
    const-string v10, "https://"

    .line 356
    .line 357
    invoke-static {v0, v10, v7}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 358
    .line 359
    .line 360
    move-result v10

    .line 361
    if-eqz v10, :cond_e

    .line 362
    .line 363
    const/4 v13, 0x0

    .line 364
    goto :goto_8

    .line 365
    :cond_e
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->length()I

    .line 366
    .line 367
    .line 368
    move-result v7

    .line 369
    const/16 v10, 0x2f

    .line 370
    .line 371
    if-lez v7, :cond_f

    .line 372
    .line 373
    const-string v7, "/"

    .line 374
    .line 375
    invoke-static {v8, v7}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 376
    .line 377
    .line 378
    move-result v7

    .line 379
    if-nez v7, :cond_f

    .line 380
    .line 381
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    :cond_f
    const/4 v7, 0x1

    .line 385
    new-array v7, v7, [C

    .line 386
    .line 387
    const/4 v13, 0x0

    .line 388
    aput-char v10, v7, v13

    .line 389
    .line 390
    invoke-static {v0, v7}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 395
    .line 396
    .line 397
    goto :goto_9

    .line 398
    :cond_10
    move v13, v7

    .line 399
    :goto_8
    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 403
    .line 404
    .line 405
    :goto_9
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    new-instance v14, La/mmh;

    .line 410
    .line 411
    iget-object v5, v5, La/nyg;->n:Ljava/lang/String;

    .line 412
    .line 413
    invoke-direct {v14, v5}, La/mmh;-><init>(Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    new-instance v10, La/smh;

    .line 417
    .line 418
    move-object/from16 v16, v6

    .line 419
    .line 420
    move v7, v13

    .line 421
    move-object v13, v0

    .line 422
    invoke-direct/range {v10 .. v17}, La/smh;-><init>(JLjava/lang/String;La/omh;Ljava/lang/String;Ljava/lang/String;La/rmh;)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    move-object/from16 v0, p2

    .line 429
    .line 430
    goto/16 :goto_3

    .line 431
    .line 432
    :cond_11
    invoke-static {}, La/t9f;->b()V

    .line 433
    .line 434
    .line 435
    const/4 v0, 0x0

    .line 436
    return-object v0

    .line 437
    :cond_12
    invoke-static {v2}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    new-instance v2, La/wmh;

    .line 442
    .line 443
    invoke-direct {v2, v0}, La/wmh;-><init>(La/i4;)V

    .line 444
    .line 445
    .line 446
    new-instance v0, La/hrv;

    .line 447
    .line 448
    const-string v5, "HeaderFocusTournamentListUiModel"

    .line 449
    .line 450
    invoke-direct {v0, v5, v1, v4, v2}, La/hrv;-><init>(Ljava/lang/String;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/b8m;La/ymh;)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v3, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 454
    .line 455
    .line 456
    invoke-static {v3}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    return-object v0
.end method
