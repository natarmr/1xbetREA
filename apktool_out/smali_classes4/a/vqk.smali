.class public abstract La/vqk;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(La/tqk;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/ctf0;)Ljava/util/List;
    .locals 17

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
    iget-object v2, v0, La/tqk;->a:Ljava/util/List;

    .line 12
    .line 13
    iget-object v0, v0, La/tqk;->b:Ljava/util/List;

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
    invoke-static {v2, v0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    new-instance v2, Ljava/util/ArrayList;

    .line 175
    .line 176
    invoke-static {v0, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 188
    .line 189
    .line 190
    move-result v5

    .line 191
    if-eqz v5, :cond_13

    .line 192
    .line 193
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    check-cast v5, La/nyg;

    .line 198
    .line 199
    iget-wide v7, v5, La/nyg;->g:J

    .line 200
    .line 201
    iget-boolean v6, v5, La/nyg;->m:Z

    .line 202
    .line 203
    if-eqz v6, :cond_6

    .line 204
    .line 205
    new-instance v6, La/pmh;

    .line 206
    .line 207
    new-array v9, v4, [Ljava/lang/Object;

    .line 208
    .line 209
    move-object/from16 v14, p2

    .line 210
    .line 211
    iget-object v10, v14, La/ctf0;->b:La/lsm0;

    .line 212
    .line 213
    invoke-static {v9, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v9

    .line 217
    const v11, 0x7f130b3d

    .line 218
    .line 219
    .line 220
    invoke-virtual {v10, v11, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v9

    .line 224
    invoke-direct {v6, v9}, La/pmh;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    :goto_4
    move-object v13, v6

    .line 228
    goto :goto_5

    .line 229
    :cond_6
    move-object/from16 v14, p2

    .line 230
    .line 231
    sget-object v6, La/qmh;->a:La/qmh;

    .line 232
    .line 233
    goto :goto_4

    .line 234
    :goto_5
    iget-object v6, v5, La/nyg;->f:Ljava/lang/String;

    .line 235
    .line 236
    iget-wide v9, v5, La/nyg;->i:J

    .line 237
    .line 238
    const-wide/16 v11, 0xf3

    .line 239
    .line 240
    cmp-long v9, v9, v11

    .line 241
    .line 242
    if-nez v9, :cond_7

    .line 243
    .line 244
    const-string v9, ". "

    .line 245
    .line 246
    invoke-static {v6, v9, v6}, Lkotlin/text/StringsKt;->m0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v6

    .line 250
    :cond_7
    move-object v11, v6

    .line 251
    iget-wide v5, v5, La/nyg;->l:J

    .line 252
    .line 253
    new-instance v9, Ljava/lang/StringBuilder;

    .line 254
    .line 255
    sget-object v10, La/ujn;->h:Ljava/lang/String;

    .line 256
    .line 257
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    sget-object v10, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 261
    .line 262
    invoke-virtual {v1, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v10

    .line 266
    if-eqz v10, :cond_8

    .line 267
    .line 268
    const-string v10, "Real"

    .line 269
    .line 270
    goto :goto_6

    .line 271
    :cond_8
    sget-object v10, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 272
    .line 273
    invoke-virtual {v1, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v10

    .line 277
    if-eqz v10, :cond_9

    .line 278
    .line 279
    const-string v10, "Virtual"

    .line 280
    .line 281
    goto :goto_6

    .line 282
    :cond_9
    sget-object v10, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 283
    .line 284
    invoke-virtual {v1, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v10

    .line 288
    if-eqz v10, :cond_12

    .line 289
    .line 290
    const-string v10, "1XCyber"

    .line 291
    .line 292
    :goto_6
    const-wide/16 v15, 0x1

    .line 293
    .line 294
    cmp-long v12, v5, v15

    .line 295
    .line 296
    if-nez v12, :cond_a

    .line 297
    .line 298
    const-string v5, "TopChamp_Dota2"

    .line 299
    .line 300
    goto :goto_7

    .line 301
    :cond_a
    const-wide/16 v15, 0x2e

    .line 302
    .line 303
    cmp-long v12, v5, v15

    .line 304
    .line 305
    if-nez v12, :cond_b

    .line 306
    .line 307
    const-string v5, "TopChamp_CS2"

    .line 308
    .line 309
    goto :goto_7

    .line 310
    :cond_b
    const-wide/16 v15, 0x1b

    .line 311
    .line 312
    cmp-long v12, v5, v15

    .line 313
    .line 314
    if-nez v12, :cond_c

    .line 315
    .line 316
    const-string v5, "TopChamp_Valorant"

    .line 317
    .line 318
    goto :goto_7

    .line 319
    :cond_c
    const-wide/16 v15, 0x2

    .line 320
    .line 321
    cmp-long v5, v5, v15

    .line 322
    .line 323
    if-nez v5, :cond_d

    .line 324
    .line 325
    const-string v5, "TopChamp_LoL"

    .line 326
    .line 327
    goto :goto_7

    .line 328
    :cond_d
    const-string v5, "TopChamp"

    .line 329
    .line 330
    :goto_7
    const-string v6, "/EventFocus/"

    .line 331
    .line 332
    const-string v12, ".png"

    .line 333
    .line 334
    const-string v15, "static/img/ImgDefault/Esports/"

    .line 335
    .line 336
    invoke-static {v15, v10, v6, v5, v12}, La/b1j;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v5

    .line 340
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 341
    .line 342
    .line 343
    move-result v6

    .line 344
    if-nez v6, :cond_e

    .line 345
    .line 346
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 347
    .line 348
    .line 349
    goto :goto_9

    .line 350
    :cond_e
    sget-object v6, La/ujn;->h:Ljava/lang/String;

    .line 351
    .line 352
    invoke-static {v5, v6, v4}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 353
    .line 354
    .line 355
    move-result v6

    .line 356
    if-nez v6, :cond_11

    .line 357
    .line 358
    const-string v6, "https://"

    .line 359
    .line 360
    invoke-static {v5, v6, v4}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 361
    .line 362
    .line 363
    move-result v6

    .line 364
    if-eqz v6, :cond_f

    .line 365
    .line 366
    goto :goto_8

    .line 367
    :cond_f
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->length()I

    .line 368
    .line 369
    .line 370
    move-result v6

    .line 371
    const/16 v10, 0x2f

    .line 372
    .line 373
    if-lez v6, :cond_10

    .line 374
    .line 375
    const-string v6, "/"

    .line 376
    .line 377
    invoke-static {v9, v6}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 378
    .line 379
    .line 380
    move-result v6

    .line 381
    if-nez v6, :cond_10

    .line 382
    .line 383
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    :cond_10
    const/4 v6, 0x1

    .line 387
    new-array v6, v6, [C

    .line 388
    .line 389
    aput-char v10, v6, v4

    .line 390
    .line 391
    invoke-static {v5, v6}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v5

    .line 395
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    goto :goto_9

    .line 399
    :cond_11
    :goto_8
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 403
    .line 404
    .line 405
    :goto_9
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v9

    .line 409
    new-instance v6, La/smh;

    .line 410
    .line 411
    const-string v12, ""

    .line 412
    .line 413
    sget-object v10, La/nmh;->a:La/nmh;

    .line 414
    .line 415
    invoke-direct/range {v6 .. v13}, La/smh;-><init>(JLjava/lang/String;La/omh;Ljava/lang/String;Ljava/lang/String;La/rmh;)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 419
    .line 420
    .line 421
    goto/16 :goto_3

    .line 422
    .line 423
    :cond_12
    invoke-static {}, La/t9f;->b()V

    .line 424
    .line 425
    .line 426
    const/4 v0, 0x0

    .line 427
    return-object v0

    .line 428
    :cond_13
    invoke-static {v2}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    new-instance v2, La/zmh;

    .line 433
    .line 434
    invoke-direct {v2, v0}, La/zmh;-><init>(La/i4;)V

    .line 435
    .line 436
    .line 437
    new-instance v0, La/uqk;

    .line 438
    .line 439
    const-string v4, "CHAMPIONSHIPS"

    .line 440
    .line 441
    sget-object v5, La/k3g;->a:La/k3g;

    .line 442
    .line 443
    invoke-direct {v0, v4, v1, v2, v5}, La/uqk;-><init>(Ljava/lang/String;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/fnh;La/m3g;)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v3, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 447
    .line 448
    .line 449
    invoke-static {v3}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    return-object v0
.end method
