.class public final synthetic La/krk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mrk;


# direct methods
.method public synthetic constructor <init>(La/mrk;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/krk;->a:B

    iput-object p1, p0, La/krk;->b:La/mrk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/krk;->a:B

    .line 4
    .line 5
    const v2, 0x7f080459

    .line 6
    .line 7
    .line 8
    const v3, 0x7f08045e

    .line 9
    .line 10
    .line 11
    const/16 v4, 0xa

    .line 12
    .line 13
    sget-object v5, La/n7m;->a:La/n7m;

    .line 14
    .line 15
    const-string v6, ""

    .line 16
    .line 17
    const-string v7, "/"

    .line 18
    .line 19
    const-string v8, "https://"

    .line 20
    .line 21
    const/16 v9, 0x2f

    .line 22
    .line 23
    const/4 v10, 0x0

    .line 24
    const/4 v11, 0x1

    .line 25
    const/4 v12, 0x0

    .line 26
    iget-object v0, v0, La/krk;->b:La/mrk;

    .line 27
    .line 28
    packed-switch v1, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    move-object/from16 v1, p1

    .line 32
    .line 33
    check-cast v1, Ljava/util/List;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object v0, v0, La/mrk;->b:La/ctf0;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    const/4 v3, 0x5

    .line 48
    if-ge v2, v3, :cond_0

    .line 49
    .line 50
    sget-object v0, La/iun;->a:La/iun;

    .line 51
    .line 52
    goto/16 :goto_3

    .line 53
    .line 54
    :cond_0
    const/16 v2, 0x10

    .line 55
    .line 56
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    new-instance v2, La/v7m;

    .line 61
    .line 62
    new-instance v3, La/c8m;

    .line 63
    .line 64
    new-array v6, v12, [Ljava/lang/Object;

    .line 65
    .line 66
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 67
    .line 68
    invoke-static {v6, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    const v13, 0x7f130053

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v13, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-direct {v3, v0, v5}, La/c8m;-><init>(Ljava/lang/CharSequence;La/o7m;)V

    .line 80
    .line 81
    .line 82
    invoke-direct {v2, v3}, La/v7m;-><init>(La/c8m;)V

    .line 83
    .line 84
    .line 85
    new-instance v0, Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-static {v1, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 92
    .line 93
    .line 94
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    move v3, v12

    .line 99
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    if-eqz v4, :cond_6

    .line 104
    .line 105
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    add-int/lit8 v5, v3, 0x1

    .line 110
    .line 111
    if-ltz v3, :cond_5

    .line 112
    .line 113
    check-cast v4, La/bm;

    .line 114
    .line 115
    iget-wide v13, v4, La/bm;->a:J

    .line 116
    .line 117
    new-instance v6, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v6, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    const-string v13, "_"

    .line 126
    .line 127
    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    iget-wide v13, v4, La/bm;->a:J

    .line 138
    .line 139
    invoke-static {v13, v14}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    iget-object v13, v4, La/bm;->b:Ljava/lang/String;

    .line 144
    .line 145
    new-instance v14, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    sget-object v15, La/ujn;->h:Ljava/lang/String;

    .line 148
    .line 149
    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    iget-object v4, v4, La/bm;->c:Ljava/lang/String;

    .line 153
    .line 154
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 155
    .line 156
    .line 157
    move-result v15

    .line 158
    if-nez v15, :cond_1

    .line 159
    .line 160
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 161
    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_1
    sget-object v15, La/ujn;->h:Ljava/lang/String;

    .line 165
    .line 166
    invoke-static {v4, v15, v12}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 167
    .line 168
    .line 169
    move-result v15

    .line 170
    if-nez v15, :cond_4

    .line 171
    .line 172
    invoke-static {v4, v8, v12}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 173
    .line 174
    .line 175
    move-result v15

    .line 176
    if-eqz v15, :cond_2

    .line 177
    .line 178
    goto :goto_1

    .line 179
    :cond_2
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->length()I

    .line 180
    .line 181
    .line 182
    move-result v15

    .line 183
    if-lez v15, :cond_3

    .line 184
    .line 185
    invoke-static {v14, v7}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 186
    .line 187
    .line 188
    move-result v15

    .line 189
    if-nez v15, :cond_3

    .line 190
    .line 191
    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    :cond_3
    new-array v15, v11, [C

    .line 195
    .line 196
    aput-char v9, v15, v12

    .line 197
    .line 198
    invoke-static {v4, v15}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_4
    :goto_1
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    :goto_2
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    new-instance v14, La/zx80;

    .line 217
    .line 218
    invoke-direct {v14, v3, v6, v13, v4}, La/zx80;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move v3, v5

    .line 225
    goto :goto_0

    .line 226
    :cond_5
    invoke-static {}, La/q3d;->p()V

    .line 227
    .line 228
    .line 229
    throw v10

    .line 230
    :cond_6
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    new-instance v1, La/wx80;

    .line 235
    .line 236
    invoke-direct {v1, v0}, La/wx80;-><init>(La/i4;)V

    .line 237
    .line 238
    .line 239
    new-instance v0, La/crv;

    .line 240
    .line 241
    const-string v3, "ACTIVE_TEAMS"

    .line 242
    .line 243
    invoke-direct {v0, v3, v2, v1}, La/crv;-><init>(Ljava/lang/String;La/b8m;La/yx80;)V

    .line 244
    .line 245
    .line 246
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    :goto_3
    return-object v0

    .line 251
    :pswitch_0
    move-object/from16 v1, p1

    .line 252
    .line 253
    check-cast v1, La/irk;

    .line 254
    .line 255
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    iget-object v2, v0, La/mrk;->a:La/ksk;

    .line 259
    .line 260
    iget-object v2, v2, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 261
    .line 262
    iget-object v2, v2, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 263
    .line 264
    iget-object v0, v0, La/mrk;->b:La/ctf0;

    .line 265
    .line 266
    invoke-static {v1, v2, v0}, La/jrk;->a(La/irk;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/ctf0;)Ljava/util/List;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    return-object v0

    .line 271
    :pswitch_1
    move-object/from16 v1, p1

    .line 272
    .line 273
    check-cast v1, La/irk;

    .line 274
    .line 275
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    iget-object v2, v0, La/mrk;->a:La/ksk;

    .line 279
    .line 280
    iget-object v2, v2, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 281
    .line 282
    iget-object v2, v2, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 283
    .line 284
    iget-object v0, v0, La/mrk;->b:La/ctf0;

    .line 285
    .line 286
    invoke-static {v1, v2, v0}, La/jrk;->a(La/irk;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/ctf0;)Ljava/util/List;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    return-object v0

    .line 291
    :pswitch_2
    move-object/from16 v1, p1

    .line 292
    .line 293
    check-cast v1, La/drk;

    .line 294
    .line 295
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    iget-object v2, v0, La/mrk;->a:La/ksk;

    .line 299
    .line 300
    iget-object v3, v2, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 301
    .line 302
    iget-object v7, v3, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 303
    .line 304
    iget-byte v8, v7, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 305
    .line 306
    sget-object v9, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 307
    .line 308
    iget-byte v9, v9, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 309
    .line 310
    if-ne v8, v9, :cond_7

    .line 311
    .line 312
    move v8, v11

    .line 313
    goto :goto_4

    .line 314
    :cond_7
    move v8, v12

    .line 315
    :goto_4
    iget-object v15, v0, La/mrk;->d:La/y78;

    .line 316
    .line 317
    iget-object v14, v0, La/mrk;->b:La/ctf0;

    .line 318
    .line 319
    iget-boolean v9, v2, La/ksk;->g:Z

    .line 320
    .line 321
    iget-object v13, v2, La/ksk;->b:La/sff0;

    .line 322
    .line 323
    iget-object v10, v2, La/ksk;->e:Ljava/util/List;

    .line 324
    .line 325
    move/from16 v28, v11

    .line 326
    .line 327
    iget-object v11, v13, La/sff0;->g:La/mum0;

    .line 328
    .line 329
    iget-object v11, v11, La/mum0;->y:La/v5l0;

    .line 330
    .line 331
    iget-object v4, v0, La/mrk;->f:La/n0o0;

    .line 332
    .line 333
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v4

    .line 337
    check-cast v4, La/fee;

    .line 338
    .line 339
    invoke-virtual {v4}, La/fee;->c()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v4

    .line 343
    check-cast v4, La/sip;

    .line 344
    .line 345
    move-object/from16 v16, v13

    .line 346
    .line 347
    iget-wide v12, v3, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->a:J

    .line 348
    .line 349
    iget-object v0, v0, La/mrk;->e:La/n0o0;

    .line 350
    .line 351
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    check-cast v0, La/fee;

    .line 356
    .line 357
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    check-cast v0, Ljava/lang/Boolean;

    .line 362
    .line 363
    if-eqz v0, :cond_8

    .line 364
    .line 365
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 366
    .line 367
    .line 368
    move-result v8

    .line 369
    :cond_8
    iget-boolean v0, v2, La/ksk;->i:Z

    .line 370
    .line 371
    iget-object v2, v1, La/drk;->a:La/btk;

    .line 372
    .line 373
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    iget-object v1, v1, La/drk;->b:La/btk;

    .line 383
    .line 384
    iget-object v3, v1, La/btk;->a:Ljava/util/List;

    .line 385
    .line 386
    move/from16 v27, v0

    .line 387
    .line 388
    iget-object v0, v2, La/btk;->a:Ljava/util/List;

    .line 389
    .line 390
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 391
    .line 392
    .line 393
    move-result v17

    .line 394
    if-eqz v17, :cond_9

    .line 395
    .line 396
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 397
    .line 398
    .line 399
    move-result v17

    .line 400
    if-eqz v17, :cond_9

    .line 401
    .line 402
    sget-object v0, La/iun;->a:La/iun;

    .line 403
    .line 404
    goto/16 :goto_1a

    .line 405
    .line 406
    :cond_9
    move-object/from16 v17, v0

    .line 407
    .line 408
    new-instance v0, La/yqv;

    .line 409
    .line 410
    move-object/from16 v18, v1

    .line 411
    .line 412
    new-instance v1, La/esv;

    .line 413
    .line 414
    invoke-static {v4}, La/kpb;->u(La/sip;)Z

    .line 415
    .line 416
    .line 417
    move-result v19

    .line 418
    if-eqz v19, :cond_a

    .line 419
    .line 420
    const-string v19, "HEADER_LIVE_GAMES"

    .line 421
    .line 422
    :goto_5
    move-object/from16 v20, v2

    .line 423
    .line 424
    move-object/from16 v2, v19

    .line 425
    .line 426
    goto :goto_6

    .line 427
    :cond_a
    const-string v19, "HEADER_LINE_GAMES"

    .line 428
    .line 429
    goto :goto_5

    .line 430
    :goto_6
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 431
    .line 432
    .line 433
    move-result v19

    .line 434
    if-eqz v19, :cond_b

    .line 435
    .line 436
    move-object/from16 v19, v3

    .line 437
    .line 438
    sget-object v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 439
    .line 440
    invoke-virtual {v7, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    move-result v3

    .line 444
    if-eqz v3, :cond_c

    .line 445
    .line 446
    const v3, 0x7f1305fc

    .line 447
    .line 448
    .line 449
    :goto_7
    move-object/from16 v30, v6

    .line 450
    .line 451
    goto :goto_8

    .line 452
    :cond_b
    move-object/from16 v19, v3

    .line 453
    .line 454
    :cond_c
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->isEmpty()Z

    .line 455
    .line 456
    .line 457
    move-result v3

    .line 458
    if-eqz v3, :cond_d

    .line 459
    .line 460
    sget-object v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 461
    .line 462
    invoke-virtual {v7, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 463
    .line 464
    .line 465
    move-result v3

    .line 466
    if-eqz v3, :cond_d

    .line 467
    .line 468
    const v3, 0x7f130fd3

    .line 469
    .line 470
    .line 471
    goto :goto_7

    .line 472
    :cond_d
    const v3, 0x7f130fc2

    .line 473
    .line 474
    .line 475
    goto :goto_7

    .line 476
    :goto_8
    new-instance v6, La/v7m;

    .line 477
    .line 478
    move/from16 p0, v8

    .line 479
    .line 480
    new-instance v8, La/c8m;

    .line 481
    .line 482
    move/from16 v21, v9

    .line 483
    .line 484
    move-object/from16 v24, v11

    .line 485
    .line 486
    const/4 v9, 0x0

    .line 487
    new-array v11, v9, [Ljava/lang/Object;

    .line 488
    .line 489
    move-wide/from16 v22, v12

    .line 490
    .line 491
    iget-object v12, v14, La/ctf0;->b:La/lsm0;

    .line 492
    .line 493
    invoke-static {v11, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v11

    .line 497
    invoke-virtual {v12, v3, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v3

    .line 501
    invoke-direct {v8, v3, v5}, La/c8m;-><init>(Ljava/lang/CharSequence;La/o7m;)V

    .line 502
    .line 503
    .line 504
    invoke-direct {v6, v8}, La/v7m;-><init>(La/c8m;)V

    .line 505
    .line 506
    .line 507
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->isEmpty()Z

    .line 508
    .line 509
    .line 510
    move-result v3

    .line 511
    if-nez v3, :cond_f

    .line 512
    .line 513
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->isEmpty()Z

    .line 514
    .line 515
    .line 516
    move-result v3

    .line 517
    if-eqz v3, :cond_e

    .line 518
    .line 519
    goto :goto_9

    .line 520
    :cond_e
    new-instance v3, La/dsv;

    .line 521
    .line 522
    new-array v5, v9, [Ljava/lang/Object;

    .line 523
    .line 524
    invoke-static {v5, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v5

    .line 528
    const v8, 0x7f130b3d

    .line 529
    .line 530
    .line 531
    invoke-virtual {v12, v8, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v5

    .line 535
    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 536
    .line 537
    invoke-virtual {v5, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v5

    .line 541
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 542
    .line 543
    .line 544
    sget-object v11, La/sip;->c:La/sip;

    .line 545
    .line 546
    invoke-static {v4}, La/kpb;->u(La/sip;)Z

    .line 547
    .line 548
    .line 549
    move-result v13

    .line 550
    invoke-direct {v3, v5, v11, v13}, La/dsv;-><init>(Ljava/lang/String;La/sip;Z)V

    .line 551
    .line 552
    .line 553
    new-instance v5, La/dsv;

    .line 554
    .line 555
    new-array v11, v9, [Ljava/lang/Object;

    .line 556
    .line 557
    invoke-static {v11, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v11

    .line 561
    const v9, 0x7f130b2c

    .line 562
    .line 563
    .line 564
    invoke-virtual {v12, v9, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object v9

    .line 568
    invoke-virtual {v9, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object v8

    .line 572
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 573
    .line 574
    .line 575
    sget-object v9, La/sip;->b:La/sip;

    .line 576
    .line 577
    invoke-static {v4}, La/kpb;->u(La/sip;)Z

    .line 578
    .line 579
    .line 580
    move-result v11

    .line 581
    xor-int/lit8 v11, v11, 0x1

    .line 582
    .line 583
    invoke-direct {v5, v8, v9, v11}, La/dsv;-><init>(Ljava/lang/String;La/sip;Z)V

    .line 584
    .line 585
    .line 586
    filled-new-array {v3, v5}, [La/dsv;

    .line 587
    .line 588
    .line 589
    move-result-object v3

    .line 590
    invoke-static {v3}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 591
    .line 592
    .line 593
    move-result-object v3

    .line 594
    goto :goto_a

    .line 595
    :cond_f
    :goto_9
    sget-object v3, La/lak0;->c:La/lak0;

    .line 596
    .line 597
    :goto_a
    invoke-direct {v1, v2, v6, v3}, La/esv;-><init>(Ljava/lang/String;La/b8m;La/a4x;)V

    .line 598
    .line 599
    .line 600
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->isEmpty()Z

    .line 601
    .line 602
    .line 603
    move-result v2

    .line 604
    if-eqz v2, :cond_11

    .line 605
    .line 606
    :cond_10
    move-object/from16 v2, v18

    .line 607
    .line 608
    goto :goto_c

    .line 609
    :cond_11
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->isEmpty()Z

    .line 610
    .line 611
    .line 612
    move-result v2

    .line 613
    if-eqz v2, :cond_12

    .line 614
    .line 615
    :goto_b
    move-object/from16 v2, v20

    .line 616
    .line 617
    goto :goto_c

    .line 618
    :cond_12
    invoke-static {v4}, La/kpb;->u(La/sip;)Z

    .line 619
    .line 620
    .line 621
    move-result v2

    .line 622
    if-eqz v2, :cond_10

    .line 623
    .line 624
    goto :goto_b

    .line 625
    :goto_c
    sget-object v3, La/q0s;->a:La/q0s;

    .line 626
    .line 627
    iget-object v5, v2, La/btk;->a:Ljava/util/List;

    .line 628
    .line 629
    const/4 v6, 0x3

    .line 630
    invoke-static {v5, v6}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 631
    .line 632
    .line 633
    move-result-object v5

    .line 634
    new-instance v6, Ljava/util/ArrayList;

    .line 635
    .line 636
    const/16 v8, 0xa

    .line 637
    .line 638
    invoke-static {v5, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 639
    .line 640
    .line 641
    move-result v9

    .line 642
    invoke-direct {v6, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 643
    .line 644
    .line 645
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 646
    .line 647
    .line 648
    move-result-object v5

    .line 649
    :goto_d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 650
    .line 651
    .line 652
    move-result v8

    .line 653
    if-eqz v8, :cond_1f

    .line 654
    .line 655
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    move-result-object v8

    .line 659
    move-object v13, v8

    .line 660
    check-cast v13, La/d0t;

    .line 661
    .line 662
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 663
    .line 664
    .line 665
    move-result-object v8

    .line 666
    :cond_13
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 667
    .line 668
    .line 669
    move-result v9

    .line 670
    if-eqz v9, :cond_14

    .line 671
    .line 672
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v9

    .line 676
    move-object v11, v9

    .line 677
    check-cast v11, La/lok0;

    .line 678
    .line 679
    iget v11, v11, La/lok0;->a:I

    .line 680
    .line 681
    iget v12, v13, La/d0t;->O:I

    .line 682
    .line 683
    if-ne v11, v12, :cond_13

    .line 684
    .line 685
    goto :goto_e

    .line 686
    :cond_14
    const/4 v9, 0x0

    .line 687
    :goto_e
    check-cast v9, La/lok0;

    .line 688
    .line 689
    move-object/from16 v8, v16

    .line 690
    .line 691
    iget-boolean v11, v8, La/sff0;->J:Z

    .line 692
    .line 693
    iget-object v12, v2, La/btk;->b:Ljava/lang/String;

    .line 694
    .line 695
    move-object/from16 p1, v2

    .line 696
    .line 697
    sget-object v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 698
    .line 699
    invoke-virtual {v7, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 700
    .line 701
    .line 702
    move-result v19

    .line 703
    new-instance v2, Ljava/util/ArrayList;

    .line 704
    .line 705
    move-object/from16 v31, v5

    .line 706
    .line 707
    move-object/from16 v29, v7

    .line 708
    .line 709
    const/16 v5, 0xa

    .line 710
    .line 711
    invoke-static {v10, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 712
    .line 713
    .line 714
    move-result v7

    .line 715
    invoke-direct {v2, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 716
    .line 717
    .line 718
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 719
    .line 720
    .line 721
    move-result-object v7

    .line 722
    :goto_f
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 723
    .line 724
    .line 725
    move-result v16

    .line 726
    if-eqz v16, :cond_15

    .line 727
    .line 728
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 729
    .line 730
    .line 731
    move-result-object v16

    .line 732
    move-object/from16 v5, v16

    .line 733
    .line 734
    check-cast v5, La/lok0;

    .line 735
    .line 736
    iget v5, v5, La/lok0;->a:I

    .line 737
    .line 738
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 739
    .line 740
    .line 741
    move-result-object v5

    .line 742
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 743
    .line 744
    .line 745
    const/16 v5, 0xa

    .line 746
    .line 747
    goto :goto_f

    .line 748
    :cond_15
    if-eqz v9, :cond_16

    .line 749
    .line 750
    iget-boolean v5, v9, La/lok0;->n:Z

    .line 751
    .line 752
    move/from16 v16, v21

    .line 753
    .line 754
    move/from16 v21, v5

    .line 755
    .line 756
    goto :goto_10

    .line 757
    :cond_16
    move/from16 v16, v21

    .line 758
    .line 759
    const/16 v21, 0x0

    .line 760
    .line 761
    :goto_10
    if-eqz v9, :cond_17

    .line 762
    .line 763
    iget-boolean v5, v9, La/lok0;->p:Z

    .line 764
    .line 765
    move-wide/from16 v17, v22

    .line 766
    .line 767
    move/from16 v22, v5

    .line 768
    .line 769
    goto :goto_11

    .line 770
    :cond_17
    move-wide/from16 v17, v22

    .line 771
    .line 772
    const/16 v22, 0x0

    .line 773
    .line 774
    :goto_11
    iget-object v5, v13, La/d0t;->K:Ljava/util/List;

    .line 775
    .line 776
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 777
    .line 778
    .line 779
    move-result v5

    .line 780
    if-eqz v5, :cond_1b

    .line 781
    .line 782
    iget-object v5, v13, La/d0t;->k:Ljava/util/List;

    .line 783
    .line 784
    if-eqz v5, :cond_18

    .line 785
    .line 786
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 787
    .line 788
    .line 789
    move-result v7

    .line 790
    if-eqz v7, :cond_18

    .line 791
    .line 792
    goto :goto_12

    .line 793
    :cond_18
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 794
    .line 795
    .line 796
    move-result-object v5

    .line 797
    :cond_19
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 798
    .line 799
    .line 800
    move-result v7

    .line 801
    if-eqz v7, :cond_1a

    .line 802
    .line 803
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 804
    .line 805
    .line 806
    move-result-object v7

    .line 807
    check-cast v7, La/d0t;

    .line 808
    .line 809
    iget-object v7, v7, La/d0t;->K:Ljava/util/List;

    .line 810
    .line 811
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 812
    .line 813
    .line 814
    move-result v7

    .line 815
    if-nez v7, :cond_19

    .line 816
    .line 817
    goto :goto_14

    .line 818
    :cond_1a
    :goto_12
    sget-object v5, La/i5l0;->a:La/i5l0;

    .line 819
    .line 820
    :goto_13
    move-object/from16 v25, v5

    .line 821
    .line 822
    goto :goto_15

    .line 823
    :cond_1b
    :goto_14
    if-eqz p0, :cond_1c

    .line 824
    .line 825
    sget-object v5, La/k5l0;->a:La/k5l0;

    .line 826
    .line 827
    goto :goto_13

    .line 828
    :cond_1c
    sget-object v5, La/l5l0;->a:La/l5l0;

    .line 829
    .line 830
    goto :goto_13

    .line 831
    :goto_15
    if-eqz v9, :cond_1d

    .line 832
    .line 833
    iget-object v5, v9, La/lok0;->u:Ljava/lang/String;

    .line 834
    .line 835
    goto :goto_16

    .line 836
    :cond_1d
    const/4 v5, 0x0

    .line 837
    :goto_16
    if-nez v5, :cond_1e

    .line 838
    .line 839
    move-object/from16 v26, v30

    .line 840
    .line 841
    goto :goto_17

    .line 842
    :cond_1e
    move-object/from16 v26, v5

    .line 843
    .line 844
    :goto_17
    const/16 v23, 0x0

    .line 845
    .line 846
    move-object/from16 v20, v2

    .line 847
    .line 848
    move-wide/from16 v32, v17

    .line 849
    .line 850
    move/from16 v17, v11

    .line 851
    .line 852
    move-object/from16 v18, v12

    .line 853
    .line 854
    move-wide/from16 v11, v32

    .line 855
    .line 856
    invoke-static/range {v13 .. v27}, La/wwb;->V(La/d0t;La/ctf0;La/y78;ZZLjava/lang/String;ZLjava/util/List;ZZZLa/v5l0;La/m5l0;Ljava/lang/String;Z)La/a2n;

    .line 857
    .line 858
    .line 859
    move-result-object v2

    .line 860
    move/from16 v5, v27

    .line 861
    .line 862
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 863
    .line 864
    .line 865
    move-object/from16 v2, p1

    .line 866
    .line 867
    move-wide/from16 v22, v11

    .line 868
    .line 869
    move/from16 v21, v16

    .line 870
    .line 871
    move-object/from16 v7, v29

    .line 872
    .line 873
    move-object/from16 v5, v31

    .line 874
    .line 875
    move-object/from16 v16, v8

    .line 876
    .line 877
    goto/16 :goto_d

    .line 878
    .line 879
    :cond_1f
    move-wide/from16 v11, v22

    .line 880
    .line 881
    move/from16 v5, v27

    .line 882
    .line 883
    invoke-static {v6}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 884
    .line 885
    .line 886
    move-result-object v2

    .line 887
    new-instance v6, La/vb90;

    .line 888
    .line 889
    move/from16 v7, v28

    .line 890
    .line 891
    invoke-direct {v6, v3, v2, v7, v5}, La/vb90;-><init>(La/q0s;La/a4x;ZZ)V

    .line 892
    .line 893
    .line 894
    new-instance v16, La/vqv;

    .line 895
    .line 896
    invoke-static {v4}, La/kpb;->u(La/sip;)Z

    .line 897
    .line 898
    .line 899
    move-result v2

    .line 900
    if-eqz v2, :cond_20

    .line 901
    .line 902
    const-string v2, "LIVE_GAMES"

    .line 903
    .line 904
    :goto_18
    move-object/from16 v17, v2

    .line 905
    .line 906
    goto :goto_19

    .line 907
    :cond_20
    const-string v2, "LINE_GAMES"

    .line 908
    .line 909
    goto :goto_18

    .line 910
    :goto_19
    sget-object v18, La/arv;->a:La/arv;

    .line 911
    .line 912
    move-object/from16 v19, v6

    .line 913
    .line 914
    move-wide/from16 v20, v11

    .line 915
    .line 916
    invoke-direct/range {v16 .. v21}, La/vqv;-><init>(Ljava/lang/String;La/brv;La/vb90;J)V

    .line 917
    .line 918
    .line 919
    filled-new-array/range {v16 .. v16}, [La/vqv;

    .line 920
    .line 921
    .line 922
    move-result-object v2

    .line 923
    invoke-static {v2}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 924
    .line 925
    .line 926
    move-result-object v2

    .line 927
    const-string v3, "ALL_GAMES"

    .line 928
    .line 929
    invoke-direct {v0, v3, v1, v2, v4}, La/yqv;-><init>(Ljava/lang/String;La/esv;La/a4x;La/sip;)V

    .line 930
    .line 931
    .line 932
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 933
    .line 934
    .line 935
    move-result-object v0

    .line 936
    :goto_1a
    return-object v0

    .line 937
    :pswitch_3
    move-object/from16 v30, v6

    .line 938
    .line 939
    move-object/from16 v1, p1

    .line 940
    .line 941
    check-cast v1, La/j0g0;

    .line 942
    .line 943
    iget-object v4, v0, La/mrk;->a:La/ksk;

    .line 944
    .line 945
    iget-object v5, v4, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 946
    .line 947
    iget-wide v10, v5, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->a:J

    .line 948
    .line 949
    iget-object v5, v5, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 950
    .line 951
    iget-object v0, v0, La/mrk;->b:La/ctf0;

    .line 952
    .line 953
    iget-boolean v4, v4, La/ksk;->f:Z

    .line 954
    .line 955
    sget-object v6, La/erk;->a:Ljava/util/List;

    .line 956
    .line 957
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 958
    .line 959
    .line 960
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 961
    .line 962
    .line 963
    if-eqz v1, :cond_22

    .line 964
    .line 965
    iget-object v1, v1, La/j0g0;->a:Ljava/lang/Object;

    .line 966
    .line 967
    instance-of v6, v1, La/g0g0;

    .line 968
    .line 969
    if-eqz v6, :cond_21

    .line 970
    .line 971
    const/4 v1, 0x0

    .line 972
    :cond_21
    check-cast v1, La/jtk;

    .line 973
    .line 974
    goto :goto_1b

    .line 975
    :cond_22
    const/4 v1, 0x0

    .line 976
    :goto_1b
    if-eqz v1, :cond_23

    .line 977
    .line 978
    iget-object v6, v1, La/jtk;->b:La/ypl0;

    .line 979
    .line 980
    if-eqz v6, :cond_23

    .line 981
    .line 982
    iget-object v6, v6, La/ypl0;->c:La/lel0;

    .line 983
    .line 984
    if-eqz v6, :cond_23

    .line 985
    .line 986
    iget-object v6, v6, La/lel0;->p:Ljava/lang/String;

    .line 987
    .line 988
    goto :goto_1c

    .line 989
    :cond_23
    const/4 v6, 0x0

    .line 990
    :goto_1c
    if-nez v6, :cond_24

    .line 991
    .line 992
    move-object/from16 v6, v30

    .line 993
    .line 994
    :cond_24
    if-eqz v1, :cond_25

    .line 995
    .line 996
    iget-object v12, v1, La/jtk;->d:La/ypl0;

    .line 997
    .line 998
    if-eqz v12, :cond_25

    .line 999
    .line 1000
    iget-object v12, v12, La/ypl0;->c:La/lel0;

    .line 1001
    .line 1002
    if-eqz v12, :cond_25

    .line 1003
    .line 1004
    iget-object v12, v12, La/lel0;->p:Ljava/lang/String;

    .line 1005
    .line 1006
    goto :goto_1d

    .line 1007
    :cond_25
    const/4 v12, 0x0

    .line 1008
    :goto_1d
    if-nez v12, :cond_26

    .line 1009
    .line 1010
    move-object/from16 v12, v30

    .line 1011
    .line 1012
    :cond_26
    if-eqz v1, :cond_27

    .line 1013
    .line 1014
    iget-object v13, v1, La/jtk;->b:La/ypl0;

    .line 1015
    .line 1016
    if-eqz v13, :cond_27

    .line 1017
    .line 1018
    iget-object v13, v13, La/ypl0;->b:Ljava/lang/String;

    .line 1019
    .line 1020
    if-nez v13, :cond_28

    .line 1021
    .line 1022
    :cond_27
    move-object/from16 v13, v30

    .line 1023
    .line 1024
    :cond_28
    new-instance v14, Ljava/lang/StringBuilder;

    .line 1025
    .line 1026
    sget-object v15, La/ujn;->h:Ljava/lang/String;

    .line 1027
    .line 1028
    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1029
    .line 1030
    .line 1031
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 1032
    .line 1033
    .line 1034
    move-result v15

    .line 1035
    if-nez v15, :cond_29

    .line 1036
    .line 1037
    move-object v6, v12

    .line 1038
    :cond_29
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 1039
    .line 1040
    .line 1041
    move-result v12

    .line 1042
    if-nez v12, :cond_2a

    .line 1043
    .line 1044
    const/4 v12, 0x0

    .line 1045
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1046
    .line 1047
    .line 1048
    goto :goto_1f

    .line 1049
    :cond_2a
    const/4 v12, 0x0

    .line 1050
    sget-object v15, La/ujn;->h:Ljava/lang/String;

    .line 1051
    .line 1052
    invoke-static {v6, v15, v12}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1053
    .line 1054
    .line 1055
    move-result v15

    .line 1056
    if-nez v15, :cond_2d

    .line 1057
    .line 1058
    invoke-static {v6, v8, v12}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1059
    .line 1060
    .line 1061
    move-result v8

    .line 1062
    if-eqz v8, :cond_2b

    .line 1063
    .line 1064
    const/4 v12, 0x0

    .line 1065
    goto :goto_1e

    .line 1066
    :cond_2b
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->length()I

    .line 1067
    .line 1068
    .line 1069
    move-result v8

    .line 1070
    if-lez v8, :cond_2c

    .line 1071
    .line 1072
    invoke-static {v14, v7}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 1073
    .line 1074
    .line 1075
    move-result v7

    .line 1076
    if-nez v7, :cond_2c

    .line 1077
    .line 1078
    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1079
    .line 1080
    .line 1081
    :cond_2c
    const/4 v7, 0x1

    .line 1082
    new-array v8, v7, [C

    .line 1083
    .line 1084
    const/4 v12, 0x0

    .line 1085
    aput-char v9, v8, v12

    .line 1086
    .line 1087
    invoke-static {v6, v8}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v6

    .line 1091
    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1092
    .line 1093
    .line 1094
    goto :goto_1f

    .line 1095
    :cond_2d
    :goto_1e
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1096
    .line 1097
    .line 1098
    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1099
    .line 1100
    .line 1101
    :goto_1f
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v6

    .line 1105
    if-eqz v4, :cond_2e

    .line 1106
    .line 1107
    move v2, v3

    .line 1108
    :cond_2e
    iget-byte v3, v5, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 1109
    .line 1110
    if-eqz v1, :cond_2f

    .line 1111
    .line 1112
    iget-object v1, v1, La/jtk;->c:La/itk;

    .line 1113
    .line 1114
    if-eqz v1, :cond_2f

    .line 1115
    .line 1116
    iget-boolean v1, v1, La/itk;->a:Z

    .line 1117
    .line 1118
    goto :goto_20

    .line 1119
    :cond_2f
    const/4 v1, 0x0

    .line 1120
    :goto_20
    sget-object v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 1121
    .line 1122
    iget-byte v4, v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 1123
    .line 1124
    if-ne v3, v4, :cond_30

    .line 1125
    .line 1126
    const/16 v28, 0x1

    .line 1127
    .line 1128
    goto :goto_21

    .line 1129
    :cond_30
    const/16 v28, 0x0

    .line 1130
    .line 1131
    :goto_21
    invoke-static {}, La/gql0;->e()Ljava/util/List;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v3

    .line 1135
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v4

    .line 1139
    invoke-interface {v3, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1140
    .line 1141
    .line 1142
    move-result v3

    .line 1143
    sget-object v4, La/erk;->a:Ljava/util/List;

    .line 1144
    .line 1145
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v5

    .line 1149
    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1150
    .line 1151
    .line 1152
    move-result v4

    .line 1153
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v5

    .line 1157
    const/4 v7, 0x6

    .line 1158
    if-eqz v3, :cond_31

    .line 1159
    .line 1160
    if-eqz v28, :cond_31

    .line 1161
    .line 1162
    new-instance v3, La/ona;

    .line 1163
    .line 1164
    new-instance v8, La/m0x;

    .line 1165
    .line 1166
    const v9, 0x7f080a2f

    .line 1167
    .line 1168
    .line 1169
    const/4 v10, 0x0

    .line 1170
    invoke-direct {v8, v9, v10, v7}, La/m0x;-><init>(ILa/bzw;I)V

    .line 1171
    .line 1172
    .line 1173
    const/4 v12, 0x0

    .line 1174
    new-array v9, v12, [Ljava/lang/Object;

    .line 1175
    .line 1176
    iget-object v10, v0, La/ctf0;->b:La/lsm0;

    .line 1177
    .line 1178
    invoke-static {v9, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v9

    .line 1182
    const v11, 0x7f1305f3

    .line 1183
    .line 1184
    .line 1185
    invoke-virtual {v10, v11, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v9

    .line 1189
    const-wide/16 v10, 0x2

    .line 1190
    .line 1191
    invoke-direct {v3, v10, v11, v8, v9}, La/ona;-><init>(JLa/m0x;Ljava/lang/String;)V

    .line 1192
    .line 1193
    .line 1194
    invoke-virtual {v5, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1195
    .line 1196
    .line 1197
    :cond_31
    if-eqz v4, :cond_32

    .line 1198
    .line 1199
    if-eqz v28, :cond_32

    .line 1200
    .line 1201
    new-instance v3, La/ona;

    .line 1202
    .line 1203
    new-instance v4, La/m0x;

    .line 1204
    .line 1205
    const v8, 0x7f0807e1

    .line 1206
    .line 1207
    .line 1208
    const/4 v10, 0x0

    .line 1209
    invoke-direct {v4, v8, v10, v7}, La/m0x;-><init>(ILa/bzw;I)V

    .line 1210
    .line 1211
    .line 1212
    const/4 v12, 0x0

    .line 1213
    new-array v8, v12, [Ljava/lang/Object;

    .line 1214
    .line 1215
    iget-object v9, v0, La/ctf0;->b:La/lsm0;

    .line 1216
    .line 1217
    invoke-static {v8, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v8

    .line 1221
    const v10, 0x7f1305f1

    .line 1222
    .line 1223
    .line 1224
    invoke-virtual {v9, v10, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v8

    .line 1228
    const-wide/16 v9, 0x1

    .line 1229
    .line 1230
    invoke-direct {v3, v9, v10, v4, v8}, La/ona;-><init>(JLa/m0x;Ljava/lang/String;)V

    .line 1231
    .line 1232
    .line 1233
    invoke-virtual {v5, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1234
    .line 1235
    .line 1236
    :cond_32
    new-instance v3, La/ona;

    .line 1237
    .line 1238
    new-instance v4, La/m0x;

    .line 1239
    .line 1240
    const v8, 0x7f0809e5

    .line 1241
    .line 1242
    .line 1243
    const/4 v10, 0x0

    .line 1244
    invoke-direct {v4, v8, v10, v7}, La/m0x;-><init>(ILa/bzw;I)V

    .line 1245
    .line 1246
    .line 1247
    const/4 v12, 0x0

    .line 1248
    new-array v8, v12, [Ljava/lang/Object;

    .line 1249
    .line 1250
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 1251
    .line 1252
    invoke-static {v8, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v8

    .line 1256
    const v9, 0x7f13118e

    .line 1257
    .line 1258
    .line 1259
    invoke-virtual {v0, v9, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v8

    .line 1263
    const-wide/16 v9, 0x0

    .line 1264
    .line 1265
    invoke-direct {v3, v9, v10, v4, v8}, La/ona;-><init>(JLa/m0x;Ljava/lang/String;)V

    .line 1266
    .line 1267
    .line 1268
    invoke-virtual {v5, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1269
    .line 1270
    .line 1271
    if-eqz v1, :cond_33

    .line 1272
    .line 1273
    new-instance v1, La/ona;

    .line 1274
    .line 1275
    new-instance v3, La/m0x;

    .line 1276
    .line 1277
    const v4, 0x7f0807f8

    .line 1278
    .line 1279
    .line 1280
    const/4 v10, 0x0

    .line 1281
    invoke-direct {v3, v4, v10, v7}, La/m0x;-><init>(ILa/bzw;I)V

    .line 1282
    .line 1283
    .line 1284
    new-array v4, v12, [Ljava/lang/Object;

    .line 1285
    .line 1286
    invoke-static {v4, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1287
    .line 1288
    .line 1289
    move-result-object v4

    .line 1290
    const v7, 0x7f13030a

    .line 1291
    .line 1292
    .line 1293
    invoke-virtual {v0, v7, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v0

    .line 1297
    const-wide/16 v7, 0x3

    .line 1298
    .line 1299
    invoke-direct {v1, v7, v8, v3, v0}, La/ona;-><init>(JLa/m0x;Ljava/lang/String;)V

    .line 1300
    .line 1301
    .line 1302
    invoke-virtual {v5, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1303
    .line 1304
    .line 1305
    :cond_33
    invoke-static {v5}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v0

    .line 1309
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1310
    .line 1311
    .line 1312
    move-result-object v0

    .line 1313
    new-instance v1, La/boa;

    .line 1314
    .line 1315
    invoke-direct {v1, v0}, La/boa;-><init>(La/a4x;)V

    .line 1316
    .line 1317
    .line 1318
    new-instance v0, La/cok;

    .line 1319
    .line 1320
    invoke-direct {v0, v13, v6, v2, v1}, La/cok;-><init>(Ljava/lang/String;Ljava/lang/String;ILa/boa;)V

    .line 1321
    .line 1322
    .line 1323
    return-object v0

    .line 1324
    :pswitch_4
    move-object/from16 v30, v6

    .line 1325
    .line 1326
    move-object/from16 v1, p1

    .line 1327
    .line 1328
    check-cast v1, La/j0g0;

    .line 1329
    .line 1330
    iget-object v4, v0, La/mrk;->a:La/ksk;

    .line 1331
    .line 1332
    iget-boolean v5, v4, La/ksk;->f:Z

    .line 1333
    .line 1334
    iget-object v6, v0, La/mrk;->e:La/n0o0;

    .line 1335
    .line 1336
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v6

    .line 1340
    check-cast v6, La/fee;

    .line 1341
    .line 1342
    invoke-virtual {v6}, La/fee;->b()Ljava/lang/Object;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v6

    .line 1346
    check-cast v6, La/qt20;

    .line 1347
    .line 1348
    iget-object v4, v4, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 1349
    .line 1350
    iget-object v4, v4, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1351
    .line 1352
    iget-object v0, v0, La/mrk;->b:La/ctf0;

    .line 1353
    .line 1354
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1355
    .line 1356
    .line 1357
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1358
    .line 1359
    .line 1360
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1361
    .line 1362
    .line 1363
    if-eqz v1, :cond_35

    .line 1364
    .line 1365
    iget-object v1, v1, La/j0g0;->a:Ljava/lang/Object;

    .line 1366
    .line 1367
    instance-of v11, v1, La/g0g0;

    .line 1368
    .line 1369
    if-eqz v11, :cond_34

    .line 1370
    .line 1371
    move-object v1, v10

    .line 1372
    :cond_34
    check-cast v1, La/jtk;

    .line 1373
    .line 1374
    goto :goto_22

    .line 1375
    :cond_35
    move-object v1, v10

    .line 1376
    :goto_22
    new-instance v11, La/osk;

    .line 1377
    .line 1378
    new-instance v12, Ljava/lang/StringBuilder;

    .line 1379
    .line 1380
    sget-object v13, La/ujn;->h:Ljava/lang/String;

    .line 1381
    .line 1382
    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1383
    .line 1384
    .line 1385
    if-eqz v5, :cond_37

    .line 1386
    .line 1387
    if-eqz v1, :cond_36

    .line 1388
    .line 1389
    iget-object v1, v1, La/jtk;->b:La/ypl0;

    .line 1390
    .line 1391
    if-eqz v1, :cond_36

    .line 1392
    .line 1393
    iget-object v1, v1, La/ypl0;->c:La/lel0;

    .line 1394
    .line 1395
    if-eqz v1, :cond_36

    .line 1396
    .line 1397
    iget-object v1, v1, La/lel0;->d:Ljava/lang/String;

    .line 1398
    .line 1399
    if-nez v1, :cond_38

    .line 1400
    .line 1401
    :cond_36
    :goto_23
    move-object/from16 v1, v30

    .line 1402
    .line 1403
    goto :goto_24

    .line 1404
    :cond_37
    if-eqz v1, :cond_36

    .line 1405
    .line 1406
    iget-object v1, v1, La/jtk;->b:La/ypl0;

    .line 1407
    .line 1408
    if-eqz v1, :cond_36

    .line 1409
    .line 1410
    iget-object v1, v1, La/ypl0;->c:La/lel0;

    .line 1411
    .line 1412
    if-eqz v1, :cond_36

    .line 1413
    .line 1414
    iget-object v1, v1, La/lel0;->c:Ljava/lang/String;

    .line 1415
    .line 1416
    if-nez v1, :cond_38

    .line 1417
    .line 1418
    goto :goto_23

    .line 1419
    :cond_38
    :goto_24
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1420
    .line 1421
    .line 1422
    move-result v13

    .line 1423
    if-nez v13, :cond_39

    .line 1424
    .line 1425
    const/4 v13, 0x0

    .line 1426
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1427
    .line 1428
    .line 1429
    goto :goto_26

    .line 1430
    :cond_39
    const/4 v13, 0x0

    .line 1431
    sget-object v14, La/ujn;->h:Ljava/lang/String;

    .line 1432
    .line 1433
    invoke-static {v1, v14, v13}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1434
    .line 1435
    .line 1436
    move-result v14

    .line 1437
    if-nez v14, :cond_3c

    .line 1438
    .line 1439
    invoke-static {v1, v8, v13}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1440
    .line 1441
    .line 1442
    move-result v8

    .line 1443
    if-eqz v8, :cond_3a

    .line 1444
    .line 1445
    const/4 v13, 0x0

    .line 1446
    goto :goto_25

    .line 1447
    :cond_3a
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->length()I

    .line 1448
    .line 1449
    .line 1450
    move-result v8

    .line 1451
    if-lez v8, :cond_3b

    .line 1452
    .line 1453
    invoke-static {v12, v7}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 1454
    .line 1455
    .line 1456
    move-result v7

    .line 1457
    if-nez v7, :cond_3b

    .line 1458
    .line 1459
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1460
    .line 1461
    .line 1462
    :cond_3b
    const/4 v7, 0x1

    .line 1463
    new-array v7, v7, [C

    .line 1464
    .line 1465
    const/4 v13, 0x0

    .line 1466
    aput-char v9, v7, v13

    .line 1467
    .line 1468
    invoke-static {v1, v7}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 1469
    .line 1470
    .line 1471
    move-result-object v1

    .line 1472
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1473
    .line 1474
    .line 1475
    goto :goto_26

    .line 1476
    :cond_3c
    :goto_25
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1477
    .line 1478
    .line 1479
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1480
    .line 1481
    .line 1482
    :goto_26
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1483
    .line 1484
    .line 1485
    move-result-object v1

    .line 1486
    if-eqz v5, :cond_3d

    .line 1487
    .line 1488
    move v2, v3

    .line 1489
    :cond_3d
    instance-of v3, v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 1490
    .line 1491
    if-eqz v3, :cond_3e

    .line 1492
    .line 1493
    new-array v3, v13, [Ljava/lang/Object;

    .line 1494
    .line 1495
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 1496
    .line 1497
    invoke-static {v3, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1498
    .line 1499
    .line 1500
    move-result-object v3

    .line 1501
    const v4, 0x7f1307e2

    .line 1502
    .line 1503
    .line 1504
    invoke-virtual {v0, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1505
    .line 1506
    .line 1507
    move-result-object v0

    .line 1508
    goto :goto_27

    .line 1509
    :cond_3e
    instance-of v3, v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 1510
    .line 1511
    if-eqz v3, :cond_3f

    .line 1512
    .line 1513
    new-array v3, v13, [Ljava/lang/Object;

    .line 1514
    .line 1515
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 1516
    .line 1517
    invoke-static {v3, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v3

    .line 1521
    const v4, 0x7f1317c7

    .line 1522
    .line 1523
    .line 1524
    invoke-virtual {v0, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v0

    .line 1528
    goto :goto_27

    .line 1529
    :cond_3f
    instance-of v3, v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 1530
    .line 1531
    if-eqz v3, :cond_40

    .line 1532
    .line 1533
    new-array v3, v13, [Ljava/lang/Object;

    .line 1534
    .line 1535
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 1536
    .line 1537
    invoke-static {v3, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1538
    .line 1539
    .line 1540
    move-result-object v3

    .line 1541
    const v4, 0x7f130ea5

    .line 1542
    .line 1543
    .line 1544
    invoke-virtual {v0, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1545
    .line 1546
    .line 1547
    move-result-object v0

    .line 1548
    :goto_27
    invoke-direct {v11, v1, v2, v0, v6}, La/osk;-><init>(Ljava/lang/String;ILjava/lang/String;La/qt20;)V

    .line 1549
    .line 1550
    .line 1551
    move-object v10, v11

    .line 1552
    goto :goto_28

    .line 1553
    :cond_40
    invoke-static {}, La/t9f;->b()V

    .line 1554
    .line 1555
    .line 1556
    :goto_28
    return-object v10

    .line 1557
    :pswitch_5
    move-object/from16 v1, p1

    .line 1558
    .line 1559
    check-cast v1, Ljava/lang/Boolean;

    .line 1560
    .line 1561
    if-eqz v1, :cond_41

    .line 1562
    .line 1563
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1564
    .line 1565
    .line 1566
    move-result v1

    .line 1567
    iget-object v0, v0, La/mrk;->a:La/ksk;

    .line 1568
    .line 1569
    iget-object v0, v0, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 1570
    .line 1571
    iget-object v0, v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1572
    .line 1573
    iget-byte v0, v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 1574
    .line 1575
    invoke-static {v0, v1}, La/rt20;->a(IZ)La/qt20;

    .line 1576
    .line 1577
    .line 1578
    move-result-object v0

    .line 1579
    goto :goto_29

    .line 1580
    :cond_41
    sget-object v0, La/pt20;->a:La/pt20;

    .line 1581
    .line 1582
    :goto_29
    return-object v0

    .line 1583
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
