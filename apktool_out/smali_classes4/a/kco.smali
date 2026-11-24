.class public abstract La/kco;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(La/n52;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/ctf0;)La/lc00;
    .locals 19

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
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v3, v0, La/n52;->a:Ljava/util/List;

    .line 16
    .line 17
    iget-object v0, v0, La/n52;->b:Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-nez v4, :cond_13

    .line 30
    .line 31
    :cond_0
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x6

    .line 37
    if-eqz v4, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-static {v3, v5}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    sub-int/2addr v6, v4

    .line 49
    :goto_0
    invoke-static {v3, v5}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    new-instance v4, Ljava/util/ArrayList;

    .line 54
    .line 55
    const/16 v5, 0xa

    .line 56
    .line 57
    invoke-static {v3, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 62
    .line 63
    .line 64
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    if-eqz v8, :cond_2

    .line 73
    .line 74
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    check-cast v8, La/nyg;

    .line 79
    .line 80
    iget-wide v8, v8, La/nyg;->g:J

    .line 81
    .line 82
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    new-instance v7, Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    if-eqz v8, :cond_4

    .line 104
    .line 105
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    move-object v9, v8

    .line 110
    check-cast v9, La/nyg;

    .line 111
    .line 112
    iget-wide v9, v9, La/nyg;->g:J

    .line 113
    .line 114
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 115
    .line 116
    .line 117
    move-result-object v9

    .line 118
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v9

    .line 122
    if-nez v9, :cond_3

    .line 123
    .line 124
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_4
    invoke-static {v7, v6}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-static {v1}, Lorg/xplatform/cyber/section/api/domain/entity/d;->a(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    const-string v6, "EventFocusTournamentsListUiModel"

    .line 137
    .line 138
    invoke-virtual {v6, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    invoke-static {v3, v0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    new-instance v3, Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-static {v0, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 160
    .line 161
    .line 162
    move-result v5

    .line 163
    if-eqz v5, :cond_12

    .line 164
    .line 165
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    check-cast v5, La/nyg;

    .line 170
    .line 171
    iget-wide v7, v5, La/nyg;->g:J

    .line 172
    .line 173
    iget-boolean v6, v5, La/nyg;->m:Z

    .line 174
    .line 175
    const/4 v9, 0x0

    .line 176
    if-eqz v6, :cond_5

    .line 177
    .line 178
    new-instance v6, La/pmh;

    .line 179
    .line 180
    new-array v10, v9, [Ljava/lang/Object;

    .line 181
    .line 182
    move-object/from16 v14, p2

    .line 183
    .line 184
    iget-object v11, v14, La/ctf0;->b:La/lsm0;

    .line 185
    .line 186
    invoke-static {v10, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v10

    .line 190
    const v12, 0x7f130b3d

    .line 191
    .line 192
    .line 193
    invoke-virtual {v11, v12, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v10

    .line 197
    invoke-direct {v6, v10}, La/pmh;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    :goto_4
    move-object v13, v6

    .line 201
    goto :goto_5

    .line 202
    :cond_5
    move-object/from16 v14, p2

    .line 203
    .line 204
    sget-object v6, La/qmh;->a:La/qmh;

    .line 205
    .line 206
    goto :goto_4

    .line 207
    :goto_5
    iget-object v6, v5, La/nyg;->f:Ljava/lang/String;

    .line 208
    .line 209
    iget-wide v10, v5, La/nyg;->i:J

    .line 210
    .line 211
    const-wide/16 v15, 0xf3

    .line 212
    .line 213
    cmp-long v10, v10, v15

    .line 214
    .line 215
    if-nez v10, :cond_6

    .line 216
    .line 217
    const-string v10, ". "

    .line 218
    .line 219
    invoke-static {v6, v10, v6}, Lkotlin/text/StringsKt;->m0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v6

    .line 223
    :cond_6
    move-object v11, v6

    .line 224
    iget-object v12, v5, La/nyg;->j:Ljava/lang/String;

    .line 225
    .line 226
    iget-wide v9, v5, La/nyg;->l:J

    .line 227
    .line 228
    new-instance v6, Ljava/lang/StringBuilder;

    .line 229
    .line 230
    sget-object v15, La/ujn;->h:Ljava/lang/String;

    .line 231
    .line 232
    invoke-direct {v6, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    sget-object v15, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 236
    .line 237
    invoke-virtual {v1, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v15

    .line 241
    if-eqz v15, :cond_7

    .line 242
    .line 243
    const-string v15, "Real"

    .line 244
    .line 245
    goto :goto_6

    .line 246
    :cond_7
    sget-object v15, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 247
    .line 248
    invoke-virtual {v1, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v15

    .line 252
    if-eqz v15, :cond_8

    .line 253
    .line 254
    const-string v15, "Virtual"

    .line 255
    .line 256
    goto :goto_6

    .line 257
    :cond_8
    sget-object v15, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 258
    .line 259
    invoke-virtual {v1, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v15

    .line 263
    if-eqz v15, :cond_11

    .line 264
    .line 265
    const-string v15, "1XCyber"

    .line 266
    .line 267
    :goto_6
    const-wide/16 v16, 0x1

    .line 268
    .line 269
    cmp-long v16, v9, v16

    .line 270
    .line 271
    if-nez v16, :cond_9

    .line 272
    .line 273
    const-string v9, "TopChamp_Dota2"

    .line 274
    .line 275
    goto :goto_7

    .line 276
    :cond_9
    const-wide/16 v16, 0x2e

    .line 277
    .line 278
    cmp-long v16, v9, v16

    .line 279
    .line 280
    if-nez v16, :cond_a

    .line 281
    .line 282
    const-string v9, "TopChamp_CS2"

    .line 283
    .line 284
    goto :goto_7

    .line 285
    :cond_a
    const-wide/16 v16, 0x1b

    .line 286
    .line 287
    cmp-long v16, v9, v16

    .line 288
    .line 289
    if-nez v16, :cond_b

    .line 290
    .line 291
    const-string v9, "TopChamp_Valorant"

    .line 292
    .line 293
    goto :goto_7

    .line 294
    :cond_b
    const-wide/16 v16, 0x2

    .line 295
    .line 296
    cmp-long v9, v9, v16

    .line 297
    .line 298
    if-nez v9, :cond_c

    .line 299
    .line 300
    const-string v9, "TopChamp_LoL"

    .line 301
    .line 302
    goto :goto_7

    .line 303
    :cond_c
    const-string v9, "TopChamp"

    .line 304
    .line 305
    :goto_7
    const-string v10, "/EventFocus/"

    .line 306
    .line 307
    move-object/from16 v16, v0

    .line 308
    .line 309
    const-string v0, ".png"

    .line 310
    .line 311
    move-wide/from16 v17, v7

    .line 312
    .line 313
    const-string v7, "static/img/ImgDefault/Esports/"

    .line 314
    .line 315
    invoke-static {v7, v15, v10, v9, v0}, La/b1j;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 320
    .line 321
    .line 322
    move-result v7

    .line 323
    if-nez v7, :cond_d

    .line 324
    .line 325
    const/4 v7, 0x0

    .line 326
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 327
    .line 328
    .line 329
    goto :goto_9

    .line 330
    :cond_d
    const/4 v7, 0x0

    .line 331
    sget-object v8, La/ujn;->h:Ljava/lang/String;

    .line 332
    .line 333
    invoke-static {v0, v8, v7}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 334
    .line 335
    .line 336
    move-result v8

    .line 337
    if-nez v8, :cond_10

    .line 338
    .line 339
    const-string v8, "https://"

    .line 340
    .line 341
    invoke-static {v0, v8, v7}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 342
    .line 343
    .line 344
    move-result v8

    .line 345
    if-eqz v8, :cond_e

    .line 346
    .line 347
    const/4 v9, 0x0

    .line 348
    goto :goto_8

    .line 349
    :cond_e
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->length()I

    .line 350
    .line 351
    .line 352
    move-result v7

    .line 353
    const/16 v8, 0x2f

    .line 354
    .line 355
    if-lez v7, :cond_f

    .line 356
    .line 357
    const-string v7, "/"

    .line 358
    .line 359
    invoke-static {v6, v7}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 360
    .line 361
    .line 362
    move-result v7

    .line 363
    if-nez v7, :cond_f

    .line 364
    .line 365
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    :cond_f
    const/4 v7, 0x1

    .line 369
    new-array v7, v7, [C

    .line 370
    .line 371
    const/4 v9, 0x0

    .line 372
    aput-char v8, v7, v9

    .line 373
    .line 374
    invoke-static {v0, v7}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    goto :goto_9

    .line 382
    :cond_10
    move v9, v7

    .line 383
    :goto_8
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 387
    .line 388
    .line 389
    :goto_9
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v9

    .line 393
    new-instance v10, La/mmh;

    .line 394
    .line 395
    iget-object v0, v5, La/nyg;->n:Ljava/lang/String;

    .line 396
    .line 397
    invoke-direct {v10, v0}, La/mmh;-><init>(Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    new-instance v6, La/smh;

    .line 401
    .line 402
    move-wide/from16 v7, v17

    .line 403
    .line 404
    invoke-direct/range {v6 .. v13}, La/smh;-><init>(JLjava/lang/String;La/omh;Ljava/lang/String;Ljava/lang/String;La/rmh;)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 408
    .line 409
    .line 410
    move-object/from16 v0, v16

    .line 411
    .line 412
    goto/16 :goto_3

    .line 413
    .line 414
    :cond_11
    invoke-static {}, La/t9f;->b()V

    .line 415
    .line 416
    .line 417
    const/4 v0, 0x0

    .line 418
    return-object v0

    .line 419
    :cond_12
    invoke-static {v3}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    new-instance v3, La/zmh;

    .line 424
    .line 425
    invoke-direct {v3, v0}, La/zmh;-><init>(La/i4;)V

    .line 426
    .line 427
    .line 428
    new-instance v0, La/jco;

    .line 429
    .line 430
    invoke-direct {v0, v4, v1, v3}, La/jco;-><init>(Ljava/lang/String;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/zmh;)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v2, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 434
    .line 435
    .line 436
    :cond_13
    invoke-static {v2}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    return-object v0
.end method
