.class public final synthetic La/lco;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mco;


# direct methods
.method public synthetic constructor <init>(La/mco;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/lco;->a:B

    iput-object p1, p0, La/lco;->b:La/mco;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/lco;->a:B

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
    const/16 v5, 0xa

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    const/4 v7, 0x0

    .line 15
    iget-object v0, v0, La/lco;->b:La/mco;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, La/xbo;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object v2, v1, La/xbo;->a:Ljava/util/List;

    .line 28
    .line 29
    iget-object v3, v0, La/mco;->c:La/y78;

    .line 30
    .line 31
    iget-object v4, v0, La/mco;->e:La/zjw;

    .line 32
    .line 33
    iget-object v7, v4, La/zjw;->b:La/sff0;

    .line 34
    .line 35
    iget-object v5, v7, La/sff0;->g:La/mum0;

    .line 36
    .line 37
    iget-object v5, v5, La/mum0;->y:La/v5l0;

    .line 38
    .line 39
    iget-object v13, v0, La/mco;->b:La/ctf0;

    .line 40
    .line 41
    invoke-virtual {v0}, La/mco;->a()La/fee;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, La/ekw;

    .line 50
    .line 51
    iget-object v0, v0, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 52
    .line 53
    sget-object v8, La/sip;->c:La/sip;

    .line 54
    .line 55
    iget-boolean v6, v4, La/zjw;->e:Z

    .line 56
    .line 57
    iget-object v9, v4, La/zjw;->c:Ljava/util/List;

    .line 58
    .line 59
    iget-object v10, v1, La/xbo;->c:Ljava/util/List;

    .line 60
    .line 61
    iget-wide v11, v1, La/xbo;->b:J

    .line 62
    .line 63
    iget-boolean v14, v4, La/zjw;->s:Z

    .line 64
    .line 65
    move-object v4, v5

    .line 66
    move-object v5, v0

    .line 67
    invoke-static/range {v2 .. v14}, La/ico;->a(Ljava/util/List;La/y78;La/v5l0;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;ZLa/sff0;La/sip;Ljava/util/List;Ljava/util/List;JLa/ctf0;Z)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    return-object v0

    .line 72
    :pswitch_0
    move-object/from16 v1, p1

    .line 73
    .line 74
    check-cast v1, Ljava/util/List;

    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, La/mco;->a()La/fee;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, La/ekw;

    .line 88
    .line 89
    iget-object v0, v0, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    new-instance v9, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v10

    .line 111
    if-eqz v10, :cond_1

    .line 112
    .line 113
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v10

    .line 117
    move-object v11, v10

    .line 118
    check-cast v11, La/oru0;

    .line 119
    .line 120
    iget-object v11, v11, La/oru0;->b:Ljava/lang/String;

    .line 121
    .line 122
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 123
    .line 124
    .line 125
    move-result v11

    .line 126
    if-lez v11, :cond_0

    .line 127
    .line 128
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_1
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-nez v1, :cond_8

    .line 137
    .line 138
    instance-of v1, v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 139
    .line 140
    if-nez v1, :cond_2

    .line 141
    .line 142
    goto/16 :goto_4

    .line 143
    .line 144
    :cond_2
    invoke-static {v0}, Lorg/xplatform/cyber/section/api/domain/entity/d;->a(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    const-string v1, "HomeCategoryCardCollectionUiModel"

    .line 149
    .line 150
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    new-instance v1, Ljava/util/ArrayList;

    .line 155
    .line 156
    invoke-static {v9, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    invoke-direct {v1, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v9

    .line 171
    if-eqz v9, :cond_7

    .line 172
    .line 173
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v9

    .line 177
    check-cast v9, La/oru0;

    .line 178
    .line 179
    iget v10, v9, La/oru0;->a:I

    .line 180
    .line 181
    iget-object v11, v9, La/oru0;->b:Ljava/lang/String;

    .line 182
    .line 183
    new-instance v12, La/n0x;

    .line 184
    .line 185
    new-instance v13, Ljava/lang/StringBuilder;

    .line 186
    .line 187
    sget-object v14, La/ujn;->h:Ljava/lang/String;

    .line 188
    .line 189
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    iget v9, v9, La/oru0;->a:I

    .line 193
    .line 194
    const-string v14, "static/img/ImgDefault/Esports/Virtual/EventFocus/Categories/"

    .line 195
    .line 196
    const-string v15, ".png"

    .line 197
    .line 198
    invoke-static {v9, v14, v15}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v9

    .line 202
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 203
    .line 204
    .line 205
    move-result v14

    .line 206
    if-nez v14, :cond_3

    .line 207
    .line 208
    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 209
    .line 210
    .line 211
    goto :goto_3

    .line 212
    :cond_3
    sget-object v14, La/ujn;->h:Ljava/lang/String;

    .line 213
    .line 214
    invoke-static {v9, v14, v7}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 215
    .line 216
    .line 217
    move-result v14

    .line 218
    if-nez v14, :cond_6

    .line 219
    .line 220
    invoke-static {v9, v3, v7}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 221
    .line 222
    .line 223
    move-result v14

    .line 224
    if-eqz v14, :cond_4

    .line 225
    .line 226
    goto :goto_2

    .line 227
    :cond_4
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->length()I

    .line 228
    .line 229
    .line 230
    move-result v14

    .line 231
    if-lez v14, :cond_5

    .line 232
    .line 233
    invoke-static {v13, v2}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 234
    .line 235
    .line 236
    move-result v14

    .line 237
    if-nez v14, :cond_5

    .line 238
    .line 239
    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    :cond_5
    new-array v14, v6, [C

    .line 243
    .line 244
    aput-char v4, v14, v7

    .line 245
    .line 246
    invoke-static {v9, v14}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v9

    .line 250
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    goto :goto_3

    .line 254
    :cond_6
    :goto_2
    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    :goto_3
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v9

    .line 264
    invoke-direct {v12, v9}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    new-instance v9, La/cvl;

    .line 268
    .line 269
    const v13, 0x7f080457

    .line 270
    .line 271
    .line 272
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 273
    .line 274
    .line 275
    move-result-object v13

    .line 276
    invoke-direct {v9, v10, v12, v13, v11}, La/cvl;-><init>(ILa/n0x;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    goto :goto_1

    .line 283
    :cond_7
    invoke-static {v1}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    new-instance v2, La/zul;

    .line 288
    .line 289
    invoke-direct {v2, v1}, La/zul;-><init>(La/a4x;)V

    .line 290
    .line 291
    .line 292
    new-instance v1, La/diw;

    .line 293
    .line 294
    invoke-direct {v1, v0, v2}, La/diw;-><init>(Ljava/lang/String;La/bvl;)V

    .line 295
    .line 296
    .line 297
    new-instance v0, La/nco;

    .line 298
    .line 299
    invoke-direct {v0, v1}, La/nco;-><init>(La/diw;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v8, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    :cond_8
    :goto_4
    invoke-static {v8}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    return-object v0

    .line 310
    :pswitch_1
    move-object/from16 v1, p1

    .line 311
    .line 312
    check-cast v1, La/n52;

    .line 313
    .line 314
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v0}, La/mco;->a()La/fee;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    check-cast v2, La/ekw;

    .line 326
    .line 327
    iget-object v2, v2, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 328
    .line 329
    iget-object v0, v0, La/mco;->b:La/ctf0;

    .line 330
    .line 331
    invoke-static {v1, v2, v0}, La/kco;->a(La/n52;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/ctf0;)La/lc00;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    return-object v0

    .line 336
    :pswitch_2
    move-object/from16 v1, p1

    .line 337
    .line 338
    check-cast v1, La/n52;

    .line 339
    .line 340
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v0}, La/mco;->a()La/fee;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    check-cast v2, La/ekw;

    .line 352
    .line 353
    iget-object v2, v2, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 354
    .line 355
    iget-object v0, v0, La/mco;->b:La/ctf0;

    .line 356
    .line 357
    invoke-static {v1, v2, v0}, La/kco;->a(La/n52;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/ctf0;)La/lc00;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    return-object v0

    .line 362
    :pswitch_3
    move-object/from16 v1, p1

    .line 363
    .line 364
    check-cast v1, Ljava/lang/Boolean;

    .line 365
    .line 366
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 367
    .line 368
    .line 369
    move-result v1

    .line 370
    iget-object v2, v0, La/mco;->b:La/ctf0;

    .line 371
    .line 372
    iget-object v0, v0, La/mco;->e:La/zjw;

    .line 373
    .line 374
    iget-boolean v3, v0, La/zjw;->f:Z

    .line 375
    .line 376
    iget-object v0, v0, La/zjw;->b:La/sff0;

    .line 377
    .line 378
    iget-object v0, v0, La/sff0;->c:La/ech;

    .line 379
    .line 380
    iget-object v0, v0, La/ech;->a:La/hdh;

    .line 381
    .line 382
    iget-boolean v0, v0, La/hdh;->d:Z

    .line 383
    .line 384
    invoke-static {v1, v2, v3, v0}, La/qbc;->I(ZLa/ctf0;ZZ)La/lc00;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    return-object v0

    .line 389
    :pswitch_4
    move-object/from16 v1, p1

    .line 390
    .line 391
    check-cast v1, Ljava/util/List;

    .line 392
    .line 393
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v0}, La/mco;->a()La/fee;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    check-cast v0, La/ekw;

    .line 405
    .line 406
    iget-object v0, v0, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 407
    .line 408
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 409
    .line 410
    .line 411
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 412
    .line 413
    .line 414
    move-result-object v8

    .line 415
    new-instance v9, Ljava/util/ArrayList;

    .line 416
    .line 417
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 418
    .line 419
    .line 420
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    :cond_9
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 425
    .line 426
    .line 427
    move-result v10

    .line 428
    if-eqz v10, :cond_a

    .line 429
    .line 430
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v10

    .line 434
    move-object v11, v10

    .line 435
    check-cast v11, La/ypl0;

    .line 436
    .line 437
    iget-object v11, v11, La/ypl0;->b:Ljava/lang/String;

    .line 438
    .line 439
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 440
    .line 441
    .line 442
    move-result v11

    .line 443
    if-lez v11, :cond_9

    .line 444
    .line 445
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    goto :goto_5

    .line 449
    :cond_a
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 450
    .line 451
    .line 452
    move-result v1

    .line 453
    if-nez v1, :cond_10

    .line 454
    .line 455
    invoke-static {v0}, Lorg/xplatform/cyber/section/api/domain/entity/d;->a(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    const-string v1, "EventFocusDisciplineListUiModel"

    .line 460
    .line 461
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    new-instance v1, Ljava/util/ArrayList;

    .line 466
    .line 467
    invoke-static {v9, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 468
    .line 469
    .line 470
    move-result v5

    .line 471
    invoke-direct {v1, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 475
    .line 476
    .line 477
    move-result-object v5

    .line 478
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 479
    .line 480
    .line 481
    move-result v9

    .line 482
    if-eqz v9, :cond_f

    .line 483
    .line 484
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v9

    .line 488
    check-cast v9, La/ypl0;

    .line 489
    .line 490
    iget-wide v10, v9, La/ypl0;->a:J

    .line 491
    .line 492
    iget-object v12, v9, La/ypl0;->b:Ljava/lang/String;

    .line 493
    .line 494
    new-instance v13, La/n0x;

    .line 495
    .line 496
    new-instance v14, Ljava/lang/StringBuilder;

    .line 497
    .line 498
    sget-object v15, La/ujn;->h:Ljava/lang/String;

    .line 499
    .line 500
    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 501
    .line 502
    .line 503
    iget-object v9, v9, La/ypl0;->c:La/lel0;

    .line 504
    .line 505
    iget-object v9, v9, La/lel0;->a:Ljava/lang/String;

    .line 506
    .line 507
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 511
    .line 512
    .line 513
    move-result v15

    .line 514
    if-nez v15, :cond_b

    .line 515
    .line 516
    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 517
    .line 518
    .line 519
    goto :goto_8

    .line 520
    :cond_b
    sget-object v15, La/ujn;->h:Ljava/lang/String;

    .line 521
    .line 522
    invoke-static {v9, v15, v7}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 523
    .line 524
    .line 525
    move-result v15

    .line 526
    if-nez v15, :cond_e

    .line 527
    .line 528
    invoke-static {v9, v3, v7}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 529
    .line 530
    .line 531
    move-result v15

    .line 532
    if-eqz v15, :cond_c

    .line 533
    .line 534
    goto :goto_7

    .line 535
    :cond_c
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->length()I

    .line 536
    .line 537
    .line 538
    move-result v15

    .line 539
    if-lez v15, :cond_d

    .line 540
    .line 541
    invoke-static {v14, v2}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 542
    .line 543
    .line 544
    move-result v15

    .line 545
    if-nez v15, :cond_d

    .line 546
    .line 547
    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 548
    .line 549
    .line 550
    :cond_d
    new-array v15, v6, [C

    .line 551
    .line 552
    aput-char v4, v15, v7

    .line 553
    .line 554
    invoke-static {v9, v15}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 555
    .line 556
    .line 557
    move-result-object v9

    .line 558
    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 559
    .line 560
    .line 561
    goto :goto_8

    .line 562
    :cond_e
    :goto_7
    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 563
    .line 564
    .line 565
    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 566
    .line 567
    .line 568
    :goto_8
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object v9

    .line 572
    invoke-direct {v13, v9}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 573
    .line 574
    .line 575
    new-instance v9, La/e8m;

    .line 576
    .line 577
    invoke-direct {v9, v10, v11, v13, v12}, La/e8m;-><init>(JLa/o0x;Ljava/lang/String;)V

    .line 578
    .line 579
    .line 580
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 581
    .line 582
    .line 583
    goto :goto_6

    .line 584
    :cond_f
    invoke-static {v1}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 585
    .line 586
    .line 587
    move-result-object v1

    .line 588
    new-instance v2, La/i8m;

    .line 589
    .line 590
    invoke-direct {v2, v1}, La/i8m;-><init>(La/a4x;)V

    .line 591
    .line 592
    .line 593
    new-instance v1, La/wbo;

    .line 594
    .line 595
    sget-object v3, La/k3g;->a:La/k3g;

    .line 596
    .line 597
    invoke-direct {v1, v0, v2, v3}, La/wbo;-><init>(Ljava/lang/String;La/k8m;La/m3g;)V

    .line 598
    .line 599
    .line 600
    invoke-virtual {v8, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 601
    .line 602
    .line 603
    :cond_10
    invoke-static {v8}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    return-object v0

    .line 608
    :pswitch_5
    move-object/from16 v1, p1

    .line 609
    .line 610
    check-cast v1, Ljava/util/List;

    .line 611
    .line 612
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 613
    .line 614
    .line 615
    invoke-virtual {v0}, La/mco;->a()La/fee;

    .line 616
    .line 617
    .line 618
    move-result-object v2

    .line 619
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v2

    .line 623
    check-cast v2, La/ekw;

    .line 624
    .line 625
    iget-object v2, v2, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 626
    .line 627
    iget-object v3, v0, La/mco;->h:La/n0o0;

    .line 628
    .line 629
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object v3

    .line 633
    check-cast v3, La/fee;

    .line 634
    .line 635
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v3

    .line 639
    check-cast v3, Ljava/lang/Boolean;

    .line 640
    .line 641
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 642
    .line 643
    .line 644
    move-result v3

    .line 645
    iget-object v4, v0, La/mco;->i:La/n0o0;

    .line 646
    .line 647
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    move-result-object v4

    .line 651
    check-cast v4, La/fee;

    .line 652
    .line 653
    invoke-virtual {v4}, La/fee;->c()Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    move-result-object v4

    .line 657
    check-cast v4, Ljava/lang/Boolean;

    .line 658
    .line 659
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 660
    .line 661
    .line 662
    move-result v4

    .line 663
    iget-object v8, v0, La/mco;->b:La/ctf0;

    .line 664
    .line 665
    iget-object v0, v0, La/mco;->e:La/zjw;

    .line 666
    .line 667
    iget-boolean v9, v0, La/zjw;->f:Z

    .line 668
    .line 669
    if-nez v9, :cond_12

    .line 670
    .line 671
    iget-object v9, v0, La/zjw;->a:Ljava/util/List;

    .line 672
    .line 673
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 674
    .line 675
    .line 676
    move-result v9

    .line 677
    if-gt v9, v6, :cond_11

    .line 678
    .line 679
    goto :goto_9

    .line 680
    :cond_11
    move v9, v7

    .line 681
    goto :goto_a

    .line 682
    :cond_12
    :goto_9
    move v9, v6

    .line 683
    :goto_a
    iget-boolean v10, v0, La/zjw;->r:Z

    .line 684
    .line 685
    iget-boolean v0, v0, La/zjw;->s:Z

    .line 686
    .line 687
    sget-object v11, La/ybo;->a:Ljava/util/List;

    .line 688
    .line 689
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 690
    .line 691
    .line 692
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 693
    .line 694
    .line 695
    new-instance v11, La/uqv;

    .line 696
    .line 697
    const/16 v23, 0x0

    .line 698
    .line 699
    if-eqz v9, :cond_13

    .line 700
    .line 701
    sget-object v9, La/sqv;->a:La/sqv;

    .line 702
    .line 703
    goto :goto_c

    .line 704
    :cond_13
    new-instance v9, La/qqv;

    .line 705
    .line 706
    instance-of v12, v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 707
    .line 708
    if-eqz v12, :cond_14

    .line 709
    .line 710
    new-array v12, v7, [Ljava/lang/Object;

    .line 711
    .line 712
    iget-object v13, v8, La/ctf0;->b:La/lsm0;

    .line 713
    .line 714
    invoke-static {v12, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 715
    .line 716
    .line 717
    move-result-object v12

    .line 718
    const v14, 0x7f1307e2

    .line 719
    .line 720
    .line 721
    invoke-virtual {v13, v14, v12}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 722
    .line 723
    .line 724
    move-result-object v12

    .line 725
    goto :goto_b

    .line 726
    :cond_14
    instance-of v12, v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 727
    .line 728
    if-eqz v12, :cond_15

    .line 729
    .line 730
    new-array v12, v7, [Ljava/lang/Object;

    .line 731
    .line 732
    iget-object v13, v8, La/ctf0;->b:La/lsm0;

    .line 733
    .line 734
    invoke-static {v12, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    move-result-object v12

    .line 738
    const v14, 0x7f1317c7

    .line 739
    .line 740
    .line 741
    invoke-virtual {v13, v14, v12}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 742
    .line 743
    .line 744
    move-result-object v12

    .line 745
    goto :goto_b

    .line 746
    :cond_15
    instance-of v12, v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 747
    .line 748
    if-eqz v12, :cond_3d

    .line 749
    .line 750
    new-array v12, v7, [Ljava/lang/Object;

    .line 751
    .line 752
    iget-object v13, v8, La/ctf0;->b:La/lsm0;

    .line 753
    .line 754
    invoke-static {v12, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 755
    .line 756
    .line 757
    move-result-object v12

    .line 758
    const v14, 0x7f1305f7

    .line 759
    .line 760
    .line 761
    invoke-virtual {v13, v14, v12}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 762
    .line 763
    .line 764
    move-result-object v12

    .line 765
    :goto_b
    invoke-direct {v9, v12}, La/qqv;-><init>(Ljava/lang/String;)V

    .line 766
    .line 767
    .line 768
    :goto_c
    new-instance v12, La/aev0;

    .line 769
    .line 770
    if-eqz v10, :cond_16

    .line 771
    .line 772
    sget-object v10, La/zdv0;->b:La/zdv0;

    .line 773
    .line 774
    goto :goto_d

    .line 775
    :cond_16
    sget-object v10, La/zdv0;->a:La/zdv0;

    .line 776
    .line 777
    :goto_d
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 778
    .line 779
    .line 780
    move-result-object v13

    .line 781
    instance-of v2, v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 782
    .line 783
    if-eqz v2, :cond_17

    .line 784
    .line 785
    new-instance v2, La/hdv0;

    .line 786
    .line 787
    const v14, 0x7f0807f8

    .line 788
    .line 789
    .line 790
    sget-object v15, La/adv0;->a:La/adv0;

    .line 791
    .line 792
    invoke-direct {v2, v14, v7, v15}, La/hdv0;-><init>(IZLa/fdv0;)V

    .line 793
    .line 794
    .line 795
    invoke-virtual {v13, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 796
    .line 797
    .line 798
    goto :goto_e

    .line 799
    :cond_17
    new-instance v2, La/hdv0;

    .line 800
    .line 801
    const v14, 0x7f080a2c

    .line 802
    .line 803
    .line 804
    sget-object v15, La/edv0;->a:La/edv0;

    .line 805
    .line 806
    invoke-direct {v2, v14, v7, v15}, La/hdv0;-><init>(IZLa/fdv0;)V

    .line 807
    .line 808
    .line 809
    invoke-virtual {v13, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 810
    .line 811
    .line 812
    :goto_e
    if-eqz v3, :cond_18

    .line 813
    .line 814
    new-instance v2, La/hdv0;

    .line 815
    .line 816
    const v3, 0x7f080925

    .line 817
    .line 818
    .line 819
    sget-object v14, La/cdv0;->a:La/cdv0;

    .line 820
    .line 821
    invoke-direct {v2, v3, v4, v14}, La/hdv0;-><init>(IZLa/fdv0;)V

    .line 822
    .line 823
    .line 824
    invoke-virtual {v13, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 825
    .line 826
    .line 827
    :cond_18
    invoke-static {v13}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 828
    .line 829
    .line 830
    move-result-object v2

    .line 831
    invoke-static {v2}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 832
    .line 833
    .line 834
    move-result-object v2

    .line 835
    new-instance v3, Ljava/util/ArrayList;

    .line 836
    .line 837
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 838
    .line 839
    .line 840
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 841
    .line 842
    .line 843
    move-result-object v1

    .line 844
    :goto_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 845
    .line 846
    .line 847
    move-result v4

    .line 848
    if-eqz v4, :cond_3c

    .line 849
    .line 850
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 851
    .line 852
    .line 853
    move-result-object v4

    .line 854
    check-cast v4, La/eih;

    .line 855
    .line 856
    iget-object v13, v4, La/eih;->e:Ljava/util/ArrayList;

    .line 857
    .line 858
    new-instance v14, Ljava/util/ArrayList;

    .line 859
    .line 860
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 861
    .line 862
    .line 863
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 864
    .line 865
    .line 866
    move-result-object v13

    .line 867
    :cond_19
    :goto_10
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 868
    .line 869
    .line 870
    move-result v15

    .line 871
    if-eqz v15, :cond_1a

    .line 872
    .line 873
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 874
    .line 875
    .line 876
    move-result-object v15

    .line 877
    move-object/from16 v16, v15

    .line 878
    .line 879
    check-cast v16, La/d0t;

    .line 880
    .line 881
    invoke-static/range {v16 .. v16}, La/qzb;->D0(La/d0t;)Z

    .line 882
    .line 883
    .line 884
    move-result v16

    .line 885
    if-nez v16, :cond_19

    .line 886
    .line 887
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 888
    .line 889
    .line 890
    goto :goto_10

    .line 891
    :cond_1a
    new-instance v13, Ljava/util/ArrayList;

    .line 892
    .line 893
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 894
    .line 895
    .line 896
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 897
    .line 898
    .line 899
    move-result-object v14

    .line 900
    :goto_11
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 901
    .line 902
    .line 903
    move-result v15

    .line 904
    if-eqz v15, :cond_1f

    .line 905
    .line 906
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 907
    .line 908
    .line 909
    move-result-object v15

    .line 910
    check-cast v15, La/d0t;

    .line 911
    .line 912
    const-wide/16 v6, 0x1

    .line 913
    .line 914
    invoke-static {v6, v7, v15}, La/ybo;->a(JLa/d0t;)Ljava/util/List;

    .line 915
    .line 916
    .line 917
    move-result-object v6

    .line 918
    if-nez v6, :cond_1b

    .line 919
    .line 920
    const-wide/16 v6, 0x26

    .line 921
    .line 922
    invoke-static {v6, v7, v15}, La/ybo;->a(JLa/d0t;)Ljava/util/List;

    .line 923
    .line 924
    .line 925
    move-result-object v6

    .line 926
    :cond_1b
    if-eqz v6, :cond_1d

    .line 927
    .line 928
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 929
    .line 930
    .line 931
    move-result v7

    .line 932
    if-eqz v7, :cond_1c

    .line 933
    .line 934
    goto :goto_12

    .line 935
    :cond_1c
    new-instance v7, Lkotlin/Pair;

    .line 936
    .line 937
    invoke-direct {v7, v15, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 938
    .line 939
    .line 940
    goto :goto_13

    .line 941
    :cond_1d
    :goto_12
    move-object/from16 v7, v23

    .line 942
    .line 943
    :goto_13
    if-eqz v7, :cond_1e

    .line 944
    .line 945
    invoke-virtual {v13, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 946
    .line 947
    .line 948
    :cond_1e
    const/4 v6, 0x1

    .line 949
    const/4 v7, 0x0

    .line 950
    goto :goto_11

    .line 951
    :cond_1f
    new-instance v6, Ljava/util/ArrayList;

    .line 952
    .line 953
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 954
    .line 955
    .line 956
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 957
    .line 958
    .line 959
    move-result-object v7

    .line 960
    :goto_14
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 961
    .line 962
    .line 963
    move-result v13

    .line 964
    if-eqz v13, :cond_22

    .line 965
    .line 966
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 967
    .line 968
    .line 969
    move-result-object v13

    .line 970
    move-object v14, v13

    .line 971
    check-cast v14, Lkotlin/Pair;

    .line 972
    .line 973
    iget-object v14, v14, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 974
    .line 975
    check-cast v14, Ljava/lang/Iterable;

    .line 976
    .line 977
    new-instance v15, Ljava/util/ArrayList;

    .line 978
    .line 979
    move/from16 v22, v0

    .line 980
    .line 981
    invoke-static {v14, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 982
    .line 983
    .line 984
    move-result v0

    .line 985
    invoke-direct {v15, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 986
    .line 987
    .line 988
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 989
    .line 990
    .line 991
    move-result-object v0

    .line 992
    :goto_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 993
    .line 994
    .line 995
    move-result v14

    .line 996
    if-eqz v14, :cond_20

    .line 997
    .line 998
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 999
    .line 1000
    .line 1001
    move-result-object v14

    .line 1002
    check-cast v14, Lorg/xplatform/betting/core/zip/model/zip/BetZip;

    .line 1003
    .line 1004
    move-object/from16 p0, v6

    .line 1005
    .line 1006
    iget-wide v5, v14, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->a:J

    .line 1007
    .line 1008
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v5

    .line 1012
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1013
    .line 1014
    .line 1015
    move-object/from16 v6, p0

    .line 1016
    .line 1017
    const/16 v5, 0xa

    .line 1018
    .line 1019
    goto :goto_15

    .line 1020
    :cond_20
    move-object/from16 p0, v6

    .line 1021
    .line 1022
    sget-object v0, La/ybo;->a:Ljava/util/List;

    .line 1023
    .line 1024
    invoke-interface {v15, v0}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    .line 1025
    .line 1026
    .line 1027
    move-result v0

    .line 1028
    if-eqz v0, :cond_21

    .line 1029
    .line 1030
    move-object/from16 v0, p0

    .line 1031
    .line 1032
    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1033
    .line 1034
    .line 1035
    move-object v6, v0

    .line 1036
    :goto_16
    move/from16 v0, v22

    .line 1037
    .line 1038
    const/16 v5, 0xa

    .line 1039
    .line 1040
    goto :goto_14

    .line 1041
    :cond_21
    move-object/from16 v6, p0

    .line 1042
    .line 1043
    goto :goto_16

    .line 1044
    :cond_22
    move/from16 v22, v0

    .line 1045
    .line 1046
    move-object v0, v6

    .line 1047
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v0

    .line 1051
    check-cast v0, Lkotlin/Pair;

    .line 1052
    .line 1053
    if-nez v0, :cond_23

    .line 1054
    .line 1055
    move-object/from16 p0, v1

    .line 1056
    .line 1057
    move-object v0, v11

    .line 1058
    move-object v1, v12

    .line 1059
    move-object/from16 v11, v23

    .line 1060
    .line 1061
    const/16 v25, 0x0

    .line 1062
    .line 1063
    goto/16 :goto_22

    .line 1064
    .line 1065
    :cond_23
    iget-object v5, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 1066
    .line 1067
    check-cast v5, La/d0t;

    .line 1068
    .line 1069
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 1070
    .line 1071
    check-cast v0, Ljava/util/List;

    .line 1072
    .line 1073
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v6

    .line 1077
    check-cast v6, Lorg/xplatform/betting/core/zip/model/zip/BetZip;

    .line 1078
    .line 1079
    if-eqz v6, :cond_24

    .line 1080
    .line 1081
    iget-object v6, v6, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->g:Ljava/lang/String;

    .line 1082
    .line 1083
    goto :goto_17

    .line 1084
    :cond_24
    move-object/from16 v6, v23

    .line 1085
    .line 1086
    :goto_17
    const-string v7, ""

    .line 1087
    .line 1088
    if-nez v6, :cond_25

    .line 1089
    .line 1090
    move-object v6, v7

    .line 1091
    :cond_25
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v0

    .line 1095
    check-cast v0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;

    .line 1096
    .line 1097
    if-eqz v0, :cond_26

    .line 1098
    .line 1099
    iget-object v0, v0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->g:Ljava/lang/String;

    .line 1100
    .line 1101
    goto :goto_18

    .line 1102
    :cond_26
    move-object/from16 v0, v23

    .line 1103
    .line 1104
    :goto_18
    if-nez v0, :cond_27

    .line 1105
    .line 1106
    move-object v0, v7

    .line 1107
    :cond_27
    move-object v14, v12

    .line 1108
    iget-wide v12, v5, La/d0t;->v:J

    .line 1109
    .line 1110
    iget-boolean v15, v5, La/d0t;->C:Z

    .line 1111
    .line 1112
    move-object/from16 p0, v1

    .line 1113
    .line 1114
    iget-object v1, v5, La/d0t;->r:La/f0t;

    .line 1115
    .line 1116
    move-object/from16 p1, v7

    .line 1117
    .line 1118
    iget-object v7, v5, La/d0t;->q:La/f0t;

    .line 1119
    .line 1120
    move-object/from16 v16, v11

    .line 1121
    .line 1122
    iget-object v11, v5, La/d0t;->p:La/rqs;

    .line 1123
    .line 1124
    move-wide/from16 v17, v12

    .line 1125
    .line 1126
    iget v12, v11, La/rqs;->q:I

    .line 1127
    .line 1128
    move-object v13, v14

    .line 1129
    move/from16 v19, v15

    .line 1130
    .line 1131
    iget-wide v14, v5, La/d0t;->u:J

    .line 1132
    .line 1133
    move/from16 v20, v12

    .line 1134
    .line 1135
    move-object/from16 v21, v13

    .line 1136
    .line 1137
    iget-wide v12, v5, La/d0t;->a:J

    .line 1138
    .line 1139
    move-wide/from16 v26, v12

    .line 1140
    .line 1141
    new-instance v12, La/ndv0;

    .line 1142
    .line 1143
    new-instance v13, La/n0x;

    .line 1144
    .line 1145
    move-wide/from16 v28, v14

    .line 1146
    .line 1147
    iget-object v14, v4, La/eih;->d:Ljava/lang/String;

    .line 1148
    .line 1149
    invoke-direct {v13, v14}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 1150
    .line 1151
    .line 1152
    iget-object v4, v4, La/eih;->c:Ljava/lang/String;

    .line 1153
    .line 1154
    invoke-direct {v12, v13, v4}, La/ndv0;-><init>(La/n0x;Ljava/lang/String;)V

    .line 1155
    .line 1156
    .line 1157
    new-instance v4, La/qdv0;

    .line 1158
    .line 1159
    iget-object v13, v7, La/f0t;->d:Ljava/util/List;

    .line 1160
    .line 1161
    invoke-static {v13}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v13

    .line 1165
    check-cast v13, Ljava/lang/String;

    .line 1166
    .line 1167
    if-nez v13, :cond_28

    .line 1168
    .line 1169
    move-object/from16 v13, p1

    .line 1170
    .line 1171
    :cond_28
    iget-wide v14, v7, La/f0t;->a:J

    .line 1172
    .line 1173
    invoke-static {v14, v15, v13}, La/vsm0;->s(JLjava/lang/String;)Ljava/lang/String;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v7

    .line 1177
    invoke-direct {v4, v7, v6}, La/qdv0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1178
    .line 1179
    .line 1180
    new-instance v6, La/qdv0;

    .line 1181
    .line 1182
    iget-object v7, v1, La/f0t;->d:Ljava/util/List;

    .line 1183
    .line 1184
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v7

    .line 1188
    check-cast v7, Ljava/lang/String;

    .line 1189
    .line 1190
    if-nez v7, :cond_29

    .line 1191
    .line 1192
    move-object/from16 v7, p1

    .line 1193
    .line 1194
    :cond_29
    iget-wide v13, v1, La/f0t;->a:J

    .line 1195
    .line 1196
    invoke-static {v13, v14, v7}, La/vsm0;->s(JLjava/lang/String;)Ljava/lang/String;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v1

    .line 1200
    invoke-direct {v6, v1, v0}, La/qdv0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1201
    .line 1202
    .line 1203
    new-instance v0, La/ieu0;

    .line 1204
    .line 1205
    sget-object v1, La/mc6;->b:La/yk5;

    .line 1206
    .line 1207
    iget-object v7, v11, La/rqs;->B:La/ubr;

    .line 1208
    .line 1209
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v13

    .line 1213
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1214
    .line 1215
    .line 1216
    invoke-static {v13}, La/yk5;->d(Ljava/lang/Integer;)La/mc6;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v1

    .line 1220
    iget-byte v1, v1, La/mc6;->a:B

    .line 1221
    .line 1222
    iget v13, v7, La/ubr;->a:I

    .line 1223
    .line 1224
    invoke-direct {v0, v1, v13}, La/ieu0;-><init>(II)V

    .line 1225
    .line 1226
    .line 1227
    new-instance v1, La/ieu0;

    .line 1228
    .line 1229
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v13

    .line 1233
    invoke-static {v13}, La/yk5;->d(Ljava/lang/Integer;)La/mc6;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v13

    .line 1237
    iget-byte v13, v13, La/mc6;->a:B

    .line 1238
    .line 1239
    iget v7, v7, La/ubr;->b:I

    .line 1240
    .line 1241
    invoke-direct {v1, v13, v7}, La/ieu0;-><init>(II)V

    .line 1242
    .line 1243
    .line 1244
    iget-wide v13, v5, La/d0t;->v:J

    .line 1245
    .line 1246
    iget-object v7, v11, La/rqs;->d:Ljava/util/List;

    .line 1247
    .line 1248
    invoke-static {}, La/xkb;->P()Ljava/util/List;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v15

    .line 1252
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v15

    .line 1256
    :goto_19
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 1257
    .line 1258
    .line 1259
    move-result v20

    .line 1260
    if-eqz v20, :cond_2b

    .line 1261
    .line 1262
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v20

    .line 1266
    move-object/from16 v30, v4

    .line 1267
    .line 1268
    move-object/from16 v4, v20

    .line 1269
    .line 1270
    check-cast v4, La/yxg;

    .line 1271
    .line 1272
    move-object/from16 v31, v6

    .line 1273
    .line 1274
    move-object/from16 v32, v7

    .line 1275
    .line 1276
    iget-wide v6, v4, La/yxg;->b:J

    .line 1277
    .line 1278
    cmp-long v6, v13, v6

    .line 1279
    .line 1280
    if-nez v6, :cond_2a

    .line 1281
    .line 1282
    iget-wide v6, v5, La/d0t;->u:J

    .line 1283
    .line 1284
    move-wide/from16 v33, v6

    .line 1285
    .line 1286
    iget-wide v6, v4, La/yxg;->a:J

    .line 1287
    .line 1288
    cmp-long v4, v33, v6

    .line 1289
    .line 1290
    if-eqz v4, :cond_2c

    .line 1291
    .line 1292
    const-wide/16 v6, 0x0

    .line 1293
    .line 1294
    cmp-long v4, v33, v6

    .line 1295
    .line 1296
    if-nez v4, :cond_2a

    .line 1297
    .line 1298
    goto :goto_1a

    .line 1299
    :cond_2a
    move-object/from16 v4, v30

    .line 1300
    .line 1301
    move-object/from16 v6, v31

    .line 1302
    .line 1303
    move-object/from16 v7, v32

    .line 1304
    .line 1305
    goto :goto_19

    .line 1306
    :cond_2b
    move-object/from16 v30, v4

    .line 1307
    .line 1308
    move-object/from16 v31, v6

    .line 1309
    .line 1310
    move-object/from16 v32, v7

    .line 1311
    .line 1312
    move-object/from16 v20, v23

    .line 1313
    .line 1314
    :cond_2c
    :goto_1a
    check-cast v20, La/yxg;

    .line 1315
    .line 1316
    if-nez v20, :cond_2d

    .line 1317
    .line 1318
    sget-object v20, La/vtg;->d:La/vtg;

    .line 1319
    .line 1320
    :cond_2d
    move-object/from16 v4, v20

    .line 1321
    .line 1322
    iget-object v6, v11, La/rqs;->c:Ljava/lang/String;

    .line 1323
    .line 1324
    const-string v7, "-"

    .line 1325
    .line 1326
    filled-new-array {v7}, [Ljava/lang/String;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v7

    .line 1330
    const/4 v11, 0x6

    .line 1331
    const/4 v15, 0x0

    .line 1332
    invoke-static {v6, v7, v15, v11}, Lkotlin/text/StringsKt;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v6

    .line 1336
    iget-boolean v7, v5, La/d0t;->z:Z

    .line 1337
    .line 1338
    if-nez v7, :cond_2f

    .line 1339
    .line 1340
    move-object v7, v12

    .line 1341
    iget-wide v11, v5, La/d0t;->s:J

    .line 1342
    .line 1343
    invoke-static {v11, v12}, La/dyb;->e0(J)Z

    .line 1344
    .line 1345
    .line 1346
    move-result v5

    .line 1347
    if-eqz v5, :cond_2e

    .line 1348
    .line 1349
    goto :goto_1b

    .line 1350
    :cond_2e
    const/4 v5, 0x0

    .line 1351
    goto :goto_1c

    .line 1352
    :cond_2f
    move-object v7, v12

    .line 1353
    :goto_1b
    const/4 v5, 0x1

    .line 1354
    :goto_1c
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v11

    .line 1358
    check-cast v11, Ljava/lang/String;

    .line 1359
    .line 1360
    if-nez v11, :cond_30

    .line 1361
    .line 1362
    move-object/from16 v11, p1

    .line 1363
    .line 1364
    :cond_30
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v6

    .line 1368
    check-cast v6, Ljava/lang/String;

    .line 1369
    .line 1370
    if-nez v6, :cond_31

    .line 1371
    .line 1372
    move-object/from16 v6, p1

    .line 1373
    .line 1374
    :cond_31
    if-eqz v5, :cond_33

    .line 1375
    .line 1376
    :cond_32
    move-object/from16 v4, p1

    .line 1377
    .line 1378
    goto :goto_1f

    .line 1379
    :cond_33
    const-string v5, "  :  "

    .line 1380
    .line 1381
    if-eqz v19, :cond_36

    .line 1382
    .line 1383
    iget v4, v4, La/yxg;->c:I

    .line 1384
    .line 1385
    const/4 v12, 0x1

    .line 1386
    if-ne v4, v12, :cond_36

    .line 1387
    .line 1388
    invoke-interface/range {v32 .. v32}, Ljava/util/Collection;->isEmpty()Z

    .line 1389
    .line 1390
    .line 1391
    move-result v4

    .line 1392
    if-nez v4, :cond_36

    .line 1393
    .line 1394
    invoke-static/range {v32 .. v32}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v4

    .line 1398
    check-cast v4, La/df90;

    .line 1399
    .line 1400
    if-eqz v4, :cond_34

    .line 1401
    .line 1402
    iget-object v4, v4, La/df90;->b:La/tf90;

    .line 1403
    .line 1404
    if-eqz v4, :cond_34

    .line 1405
    .line 1406
    iget v4, v4, La/tf90;->b:I

    .line 1407
    .line 1408
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v4

    .line 1412
    goto :goto_1d

    .line 1413
    :cond_34
    move-object/from16 v4, v23

    .line 1414
    .line 1415
    :goto_1d
    invoke-static/range {v32 .. v32}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 1416
    .line 1417
    .line 1418
    move-result-object v6

    .line 1419
    check-cast v6, La/df90;

    .line 1420
    .line 1421
    if-eqz v6, :cond_35

    .line 1422
    .line 1423
    iget-object v6, v6, La/df90;->b:La/tf90;

    .line 1424
    .line 1425
    if-eqz v6, :cond_35

    .line 1426
    .line 1427
    iget v6, v6, La/tf90;->c:I

    .line 1428
    .line 1429
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v6

    .line 1433
    goto :goto_1e

    .line 1434
    :cond_35
    move-object/from16 v6, v23

    .line 1435
    .line 1436
    :goto_1e
    new-instance v11, Ljava/lang/StringBuilder;

    .line 1437
    .line 1438
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 1439
    .line 1440
    .line 1441
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1442
    .line 1443
    .line 1444
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1445
    .line 1446
    .line 1447
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1448
    .line 1449
    .line 1450
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1451
    .line 1452
    .line 1453
    move-result-object v4

    .line 1454
    goto :goto_1f

    .line 1455
    :cond_36
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 1456
    .line 1457
    .line 1458
    move-result v4

    .line 1459
    if-lez v4, :cond_32

    .line 1460
    .line 1461
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 1462
    .line 1463
    .line 1464
    move-result v4

    .line 1465
    if-lez v4, :cond_32

    .line 1466
    .line 1467
    const-wide/16 v32, 0x28

    .line 1468
    .line 1469
    cmp-long v4, v13, v32

    .line 1470
    .line 1471
    if-eqz v4, :cond_32

    .line 1472
    .line 1473
    invoke-static {v11, v5, v6}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1474
    .line 1475
    .line 1476
    move-result-object v4

    .line 1477
    :goto_1f
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 1478
    .line 1479
    .line 1480
    move-result v5

    .line 1481
    sget-object v6, La/opm;->a:La/opm;

    .line 1482
    .line 1483
    if-nez v5, :cond_37

    .line 1484
    .line 1485
    new-instance v4, La/lpm;

    .line 1486
    .line 1487
    new-instance v5, La/gpm;

    .line 1488
    .line 1489
    invoke-direct {v5}, La/gpm;-><init>()V

    .line 1490
    .line 1491
    .line 1492
    invoke-direct {v4, v6, v5}, La/lpm;-><init>(La/rpm;La/ipm;)V

    .line 1493
    .line 1494
    .line 1495
    const/4 v12, 0x0

    .line 1496
    goto :goto_20

    .line 1497
    :cond_37
    const-string v5, ":"

    .line 1498
    .line 1499
    filled-new-array {v5}, [Ljava/lang/String;

    .line 1500
    .line 1501
    .line 1502
    move-result-object v11

    .line 1503
    const/4 v12, 0x0

    .line 1504
    const/4 v15, 0x6

    .line 1505
    invoke-static {v4, v11, v12, v15}, Lkotlin/text/StringsKt;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 1506
    .line 1507
    .line 1508
    move-result-object v11

    .line 1509
    invoke-static {v11}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1510
    .line 1511
    .line 1512
    move-result-object v11

    .line 1513
    check-cast v11, Ljava/lang/String;

    .line 1514
    .line 1515
    if-nez v11, :cond_38

    .line 1516
    .line 1517
    move-object/from16 v11, p1

    .line 1518
    .line 1519
    :cond_38
    filled-new-array {v5}, [Ljava/lang/String;

    .line 1520
    .line 1521
    .line 1522
    move-result-object v5

    .line 1523
    invoke-static {v4, v5, v12, v15}, Lkotlin/text/StringsKt;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 1524
    .line 1525
    .line 1526
    move-result-object v4

    .line 1527
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 1528
    .line 1529
    .line 1530
    move-result-object v4

    .line 1531
    check-cast v4, Ljava/lang/String;

    .line 1532
    .line 1533
    if-nez v4, :cond_39

    .line 1534
    .line 1535
    move-object/from16 v4, p1

    .line 1536
    .line 1537
    :cond_39
    new-instance v5, La/gpm;

    .line 1538
    .line 1539
    invoke-direct {v5}, La/gpm;-><init>()V

    .line 1540
    .line 1541
    .line 1542
    invoke-static {v11, v4, v12, v12, v5}, La/d5c;->O(Ljava/lang/String;Ljava/lang/String;ZZLa/ipm;)La/j83;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v4

    .line 1546
    new-instance v5, La/gpm;

    .line 1547
    .line 1548
    invoke-direct {v5}, La/gpm;-><init>()V

    .line 1549
    .line 1550
    .line 1551
    new-instance v11, La/kpm;

    .line 1552
    .line 1553
    invoke-direct {v11, v6, v5, v4}, La/kpm;-><init>(La/rpm;La/ipm;La/j83;)V

    .line 1554
    .line 1555
    .line 1556
    move-object v4, v11

    .line 1557
    :goto_20
    if-eqz v19, :cond_3a

    .line 1558
    .line 1559
    new-array v5, v12, [Ljava/lang/Object;

    .line 1560
    .line 1561
    iget-object v6, v8, La/ctf0;->b:La/lsm0;

    .line 1562
    .line 1563
    invoke-static {v5, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v5

    .line 1567
    const v11, 0x7f130609

    .line 1568
    .line 1569
    .line 1570
    invoke-virtual {v6, v11, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1571
    .line 1572
    .line 1573
    move-result-object v5

    .line 1574
    goto :goto_21

    .line 1575
    :cond_3a
    move-object/from16 v5, p1

    .line 1576
    .line 1577
    :goto_21
    new-instance v6, La/iev0;

    .line 1578
    .line 1579
    invoke-direct {v6, v0, v1, v4, v5}, La/iev0;-><init>(La/ieu0;La/ieu0;La/mpm;Ljava/lang/String;)V

    .line 1580
    .line 1581
    .line 1582
    new-instance v11, La/rdv0;

    .line 1583
    .line 1584
    move/from16 v25, v12

    .line 1585
    .line 1586
    move-object/from16 v0, v16

    .line 1587
    .line 1588
    move-wide/from16 v12, v17

    .line 1589
    .line 1590
    move-object/from16 v1, v21

    .line 1591
    .line 1592
    move-wide/from16 v16, v26

    .line 1593
    .line 1594
    move-wide/from16 v14, v28

    .line 1595
    .line 1596
    move-object/from16 v19, v30

    .line 1597
    .line 1598
    move-object/from16 v20, v31

    .line 1599
    .line 1600
    move-object/from16 v21, v6

    .line 1601
    .line 1602
    move-object/from16 v18, v7

    .line 1603
    .line 1604
    invoke-direct/range {v11 .. v22}, La/rdv0;-><init>(JJJLa/pdv0;La/qdv0;La/qdv0;La/iev0;Z)V

    .line 1605
    .line 1606
    .line 1607
    :goto_22
    if-eqz v11, :cond_3b

    .line 1608
    .line 1609
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1610
    .line 1611
    .line 1612
    :cond_3b
    move-object v11, v0

    .line 1613
    move-object v12, v1

    .line 1614
    move/from16 v0, v22

    .line 1615
    .line 1616
    move/from16 v7, v25

    .line 1617
    .line 1618
    const/16 v5, 0xa

    .line 1619
    .line 1620
    const/4 v6, 0x1

    .line 1621
    move-object/from16 v1, p0

    .line 1622
    .line 1623
    goto/16 :goto_f

    .line 1624
    .line 1625
    :cond_3c
    move-object v0, v11

    .line 1626
    move-object v1, v12

    .line 1627
    const/4 v4, 0x3

    .line 1628
    invoke-static {v3, v4}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 1629
    .line 1630
    .line 1631
    move-result-object v3

    .line 1632
    invoke-static {v3}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 1633
    .line 1634
    .line 1635
    move-result-object v3

    .line 1636
    invoke-direct {v1, v10, v2, v3}, La/aev0;-><init>(La/zdv0;La/i4;La/i4;)V

    .line 1637
    .line 1638
    .line 1639
    const-string v2, "HeaderContainerUiModel"

    .line 1640
    .line 1641
    invoke-direct {v0, v2, v9, v1}, La/uqv;-><init>(Ljava/lang/String;La/tqv;La/cev0;)V

    .line 1642
    .line 1643
    .line 1644
    goto :goto_23

    .line 1645
    :cond_3d
    invoke-static {}, La/t9f;->b()V

    .line 1646
    .line 1647
    .line 1648
    move-object/from16 v11, v23

    .line 1649
    .line 1650
    :goto_23
    return-object v11

    .line 1651
    :pswitch_6
    move-object/from16 v1, p1

    .line 1652
    .line 1653
    check-cast v1, La/fee;

    .line 1654
    .line 1655
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1656
    .line 1657
    .line 1658
    new-instance v2, La/gkw;

    .line 1659
    .line 1660
    iget-object v3, v0, La/mco;->e:La/zjw;

    .line 1661
    .line 1662
    iget-boolean v4, v3, La/zjw;->f:Z

    .line 1663
    .line 1664
    const/16 v24, 0x1

    .line 1665
    .line 1666
    xor-int/lit8 v4, v4, 0x1

    .line 1667
    .line 1668
    iget-object v3, v3, La/zjw;->a:Ljava/util/List;

    .line 1669
    .line 1670
    invoke-static {v3}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1671
    .line 1672
    .line 1673
    move-result-object v3

    .line 1674
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 1675
    .line 1676
    .line 1677
    move-result-object v5

    .line 1678
    check-cast v5, La/ekw;

    .line 1679
    .line 1680
    iget-object v6, v0, La/mco;->h:La/n0o0;

    .line 1681
    .line 1682
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1683
    .line 1684
    .line 1685
    move-result-object v6

    .line 1686
    check-cast v6, La/fee;

    .line 1687
    .line 1688
    iget-object v6, v6, La/fee;->d:La/pz40;

    .line 1689
    .line 1690
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1691
    .line 1692
    .line 1693
    move-result-object v6

    .line 1694
    check-cast v6, Ljava/lang/Boolean;

    .line 1695
    .line 1696
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1697
    .line 1698
    .line 1699
    move-result v6

    .line 1700
    iget-object v0, v0, La/mco;->i:La/n0o0;

    .line 1701
    .line 1702
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1703
    .line 1704
    .line 1705
    move-result-object v0

    .line 1706
    check-cast v0, La/fee;

    .line 1707
    .line 1708
    iget-object v0, v0, La/fee;->d:La/pz40;

    .line 1709
    .line 1710
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1711
    .line 1712
    .line 1713
    move-result-object v0

    .line 1714
    check-cast v0, Ljava/lang/Boolean;

    .line 1715
    .line 1716
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1717
    .line 1718
    .line 1719
    move-result v7

    .line 1720
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 1721
    .line 1722
    .line 1723
    move-result-object v0

    .line 1724
    check-cast v0, La/ekw;

    .line 1725
    .line 1726
    iget-object v0, v0, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1727
    .line 1728
    instance-of v8, v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 1729
    .line 1730
    sget-object v9, La/axh0;->a:La/axh0;

    .line 1731
    .line 1732
    move/from16 v35, v4

    .line 1733
    .line 1734
    move-object v4, v3

    .line 1735
    move/from16 v3, v35

    .line 1736
    .line 1737
    invoke-direct/range {v2 .. v9}, La/gkw;-><init>(ZLa/a4x;La/ekw;ZZZLa/dxh0;)V

    .line 1738
    .line 1739
    .line 1740
    return-object v2

    .line 1741
    :pswitch_7
    move-object/from16 v1, p1

    .line 1742
    .line 1743
    check-cast v1, La/xbo;

    .line 1744
    .line 1745
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1746
    .line 1747
    .line 1748
    iget-object v2, v1, La/xbo;->a:Ljava/util/List;

    .line 1749
    .line 1750
    iget-object v3, v0, La/mco;->c:La/y78;

    .line 1751
    .line 1752
    iget-object v13, v0, La/mco;->b:La/ctf0;

    .line 1753
    .line 1754
    iget-object v4, v0, La/mco;->e:La/zjw;

    .line 1755
    .line 1756
    iget-object v7, v4, La/zjw;->b:La/sff0;

    .line 1757
    .line 1758
    iget-object v5, v7, La/sff0;->g:La/mum0;

    .line 1759
    .line 1760
    iget-object v5, v5, La/mum0;->y:La/v5l0;

    .line 1761
    .line 1762
    invoke-virtual {v0}, La/mco;->a()La/fee;

    .line 1763
    .line 1764
    .line 1765
    move-result-object v0

    .line 1766
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 1767
    .line 1768
    .line 1769
    move-result-object v0

    .line 1770
    check-cast v0, La/ekw;

    .line 1771
    .line 1772
    iget-object v0, v0, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1773
    .line 1774
    sget-object v8, La/sip;->b:La/sip;

    .line 1775
    .line 1776
    iget-boolean v6, v4, La/zjw;->e:Z

    .line 1777
    .line 1778
    iget-object v9, v4, La/zjw;->c:Ljava/util/List;

    .line 1779
    .line 1780
    iget-object v10, v1, La/xbo;->c:Ljava/util/List;

    .line 1781
    .line 1782
    iget-wide v11, v1, La/xbo;->b:J

    .line 1783
    .line 1784
    iget-boolean v14, v4, La/zjw;->s:Z

    .line 1785
    .line 1786
    move-object v4, v5

    .line 1787
    move-object v5, v0

    .line 1788
    invoke-static/range {v2 .. v14}, La/ico;->a(Ljava/util/List;La/y78;La/v5l0;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;ZLa/sff0;La/sip;Ljava/util/List;Ljava/util/List;JLa/ctf0;Z)Ljava/util/List;

    .line 1789
    .line 1790
    .line 1791
    move-result-object v0

    .line 1792
    return-object v0

    .line 1793
    :pswitch_data_0
    .packed-switch 0x0
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
