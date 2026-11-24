.class public final synthetic La/irv;
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
    iput-byte p2, p0, La/irv;->a:B

    iput-object p1, p0, La/irv;->b:La/mco;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 42

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/irv;->a:B

    .line 4
    .line 5
    sget-object v2, La/n7m;->a:La/n7m;

    .line 6
    .line 7
    const-string v3, ""

    .line 8
    .line 9
    const/16 v4, 0x2f

    .line 10
    .line 11
    const-string v5, "https://"

    .line 12
    .line 13
    const-string v6, "/"

    .line 14
    .line 15
    const/16 v7, 0xa

    .line 16
    .line 17
    const/4 v9, 0x1

    .line 18
    const/4 v10, 0x0

    .line 19
    iget-object v0, v0, La/irv;->b:La/mco;

    .line 20
    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    move-object/from16 v1, p1

    .line 25
    .line 26
    check-cast v1, La/n52;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, La/mco;->b()La/fee;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, La/ekw;

    .line 40
    .line 41
    iget-object v2, v2, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 42
    .line 43
    iget-object v0, v0, La/mco;->b:La/ctf0;

    .line 44
    .line 45
    invoke-static {v1, v2, v0}, La/grv;->a(La/n52;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/ctf0;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    return-object v0

    .line 50
    :pswitch_0
    move-object/from16 v1, p1

    .line 51
    .line 52
    check-cast v1, La/n52;

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, La/mco;->b()La/fee;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, La/ekw;

    .line 66
    .line 67
    iget-object v2, v2, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 68
    .line 69
    iget-object v0, v0, La/mco;->b:La/ctf0;

    .line 70
    .line 71
    invoke-static {v1, v2, v0}, La/grv;->a(La/n52;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/ctf0;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    return-object v0

    .line 76
    :pswitch_1
    move-object/from16 v1, p1

    .line 77
    .line 78
    check-cast v1, Ljava/util/List;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    iget-object v2, v0, La/mco;->b:La/ctf0;

    .line 84
    .line 85
    invoke-virtual {v0}, La/mco;->b()La/fee;

    .line 86
    .line 87
    .line 88
    move-result-object v11

    .line 89
    invoke-virtual {v11}, La/fee;->c()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v11

    .line 93
    check-cast v11, La/ekw;

    .line 94
    .line 95
    iget-object v11, v11, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 96
    .line 97
    iget-object v0, v0, La/mco;->e:La/zjw;

    .line 98
    .line 99
    iget-boolean v12, v0, La/zjw;->f:Z

    .line 100
    .line 101
    if-nez v12, :cond_1

    .line 102
    .line 103
    iget-object v0, v0, La/zjw;->a:Ljava/util/List;

    .line 104
    .line 105
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-gt v0, v9, :cond_0

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_0
    move v0, v10

    .line 113
    goto :goto_1

    .line 114
    :cond_1
    :goto_0
    move v0, v9

    .line 115
    :goto_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    new-instance v12, La/dok;

    .line 122
    .line 123
    invoke-static {v11}, Lorg/xplatform/cyber/section/api/domain/entity/d;->a(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v13

    .line 127
    const-string v14, "DisciplineBlockUiModel"

    .line 128
    .line 129
    invoke-virtual {v14, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v13

    .line 133
    if-eqz v0, :cond_2

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_2
    instance-of v0, v11, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 137
    .line 138
    if-eqz v0, :cond_3

    .line 139
    .line 140
    new-array v0, v10, [Ljava/lang/Object;

    .line 141
    .line 142
    iget-object v3, v2, La/ctf0;->b:La/lsm0;

    .line 143
    .line 144
    invoke-static {v0, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    const v14, 0x7f1307e2

    .line 149
    .line 150
    .line 151
    invoke-virtual {v3, v14, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    goto :goto_2

    .line 156
    :cond_3
    instance-of v0, v11, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 157
    .line 158
    if-eqz v0, :cond_4

    .line 159
    .line 160
    new-array v0, v10, [Ljava/lang/Object;

    .line 161
    .line 162
    iget-object v3, v2, La/ctf0;->b:La/lsm0;

    .line 163
    .line 164
    invoke-static {v0, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    const v14, 0x7f1317c7

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3, v14, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    goto :goto_2

    .line 176
    :cond_4
    instance-of v0, v11, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 177
    .line 178
    if-eqz v0, :cond_14

    .line 179
    .line 180
    new-array v0, v10, [Ljava/lang/Object;

    .line 181
    .line 182
    iget-object v3, v2, La/ctf0;->b:La/lsm0;

    .line 183
    .line 184
    invoke-static {v0, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    const v14, 0x7f130ea5

    .line 189
    .line 190
    .line 191
    invoke-virtual {v3, v14, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    :goto_2
    instance-of v0, v11, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 196
    .line 197
    if-eqz v0, :cond_5

    .line 198
    .line 199
    const-string v0, "Real"

    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_5
    instance-of v0, v11, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 203
    .line 204
    if-eqz v0, :cond_6

    .line 205
    .line 206
    const-string v0, "Virtual"

    .line 207
    .line 208
    goto :goto_3

    .line 209
    :cond_6
    instance-of v0, v11, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 210
    .line 211
    if-eqz v0, :cond_13

    .line 212
    .line 213
    const-string v0, "1XCyber"

    .line 214
    .line 215
    :goto_3
    new-instance v11, Ljava/lang/StringBuilder;

    .line 216
    .line 217
    sget-object v14, La/ujn;->h:Ljava/lang/String;

    .line 218
    .line 219
    invoke-direct {v11, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    const-string v14, "/HeaderFocus/"

    .line 223
    .line 224
    const-string v15, "Header.png"

    .line 225
    .line 226
    const-string v8, "static/img/ImgDefault/Esports/"

    .line 227
    .line 228
    invoke-static {v8, v0, v14, v0, v15}, La/b1j;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 233
    .line 234
    .line 235
    move-result v8

    .line 236
    if-nez v8, :cond_7

    .line 237
    .line 238
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 239
    .line 240
    .line 241
    goto :goto_5

    .line 242
    :cond_7
    sget-object v8, La/ujn;->h:Ljava/lang/String;

    .line 243
    .line 244
    invoke-static {v0, v8, v10}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 245
    .line 246
    .line 247
    move-result v8

    .line 248
    if-nez v8, :cond_a

    .line 249
    .line 250
    invoke-static {v0, v5, v10}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 251
    .line 252
    .line 253
    move-result v8

    .line 254
    if-eqz v8, :cond_8

    .line 255
    .line 256
    goto :goto_4

    .line 257
    :cond_8
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->length()I

    .line 258
    .line 259
    .line 260
    move-result v8

    .line 261
    if-lez v8, :cond_9

    .line 262
    .line 263
    invoke-static {v11, v6}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 264
    .line 265
    .line 266
    move-result v8

    .line 267
    if-nez v8, :cond_9

    .line 268
    .line 269
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    :cond_9
    new-array v8, v9, [C

    .line 273
    .line 274
    aput-char v4, v8, v10

    .line 275
    .line 276
    invoke-static {v0, v8}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    goto :goto_5

    .line 284
    :cond_a
    :goto_4
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    :goto_5
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    new-instance v8, Ljava/util/ArrayList;

    .line 295
    .line 296
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 297
    .line 298
    .line 299
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    :cond_b
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 304
    .line 305
    .line 306
    move-result v11

    .line 307
    if-eqz v11, :cond_c

    .line 308
    .line 309
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v11

    .line 313
    move-object v14, v11

    .line 314
    check-cast v14, La/ypl0;

    .line 315
    .line 316
    iget-object v14, v14, La/ypl0;->b:Ljava/lang/String;

    .line 317
    .line 318
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 319
    .line 320
    .line 321
    move-result v14

    .line 322
    if-lez v14, :cond_b

    .line 323
    .line 324
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    goto :goto_6

    .line 328
    :cond_c
    new-instance v1, Ljava/util/ArrayList;

    .line 329
    .line 330
    invoke-static {v8, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 331
    .line 332
    .line 333
    move-result v7

    .line 334
    invoke-direct {v1, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 338
    .line 339
    .line 340
    move-result-object v7

    .line 341
    :goto_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 342
    .line 343
    .line 344
    move-result v8

    .line 345
    if-eqz v8, :cond_11

    .line 346
    .line 347
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v8

    .line 351
    check-cast v8, La/ypl0;

    .line 352
    .line 353
    iget-wide v14, v8, La/ypl0;->a:J

    .line 354
    .line 355
    iget-object v11, v8, La/ypl0;->b:Ljava/lang/String;

    .line 356
    .line 357
    new-instance v9, La/n0x;

    .line 358
    .line 359
    new-instance v4, Ljava/lang/StringBuilder;

    .line 360
    .line 361
    sget-object v10, La/ujn;->h:Ljava/lang/String;

    .line 362
    .line 363
    invoke-direct {v4, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    iget-object v8, v8, La/ypl0;->c:La/lel0;

    .line 367
    .line 368
    iget-object v8, v8, La/lel0;->j:Ljava/lang/String;

    .line 369
    .line 370
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 374
    .line 375
    .line 376
    move-result v10

    .line 377
    if-nez v10, :cond_d

    .line 378
    .line 379
    const/4 v10, 0x0

    .line 380
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 381
    .line 382
    .line 383
    move-object/from16 p0, v7

    .line 384
    .line 385
    goto :goto_a

    .line 386
    :cond_d
    move-object/from16 p0, v7

    .line 387
    .line 388
    const/4 v10, 0x0

    .line 389
    sget-object v7, La/ujn;->h:Ljava/lang/String;

    .line 390
    .line 391
    invoke-static {v8, v7, v10}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 392
    .line 393
    .line 394
    move-result v7

    .line 395
    if-nez v7, :cond_10

    .line 396
    .line 397
    invoke-static {v8, v5, v10}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 398
    .line 399
    .line 400
    move-result v7

    .line 401
    if-eqz v7, :cond_e

    .line 402
    .line 403
    const/4 v10, 0x0

    .line 404
    goto :goto_9

    .line 405
    :cond_e
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    .line 406
    .line 407
    .line 408
    move-result v7

    .line 409
    if-lez v7, :cond_f

    .line 410
    .line 411
    invoke-static {v4, v6}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 412
    .line 413
    .line 414
    move-result v7

    .line 415
    if-nez v7, :cond_f

    .line 416
    .line 417
    const/16 v7, 0x2f

    .line 418
    .line 419
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 420
    .line 421
    .line 422
    move/from16 v18, v7

    .line 423
    .line 424
    const/4 v10, 0x1

    .line 425
    goto :goto_8

    .line 426
    :cond_f
    const/4 v10, 0x1

    .line 427
    const/16 v18, 0x2f

    .line 428
    .line 429
    :goto_8
    new-array v7, v10, [C

    .line 430
    .line 431
    const/4 v10, 0x0

    .line 432
    aput-char v18, v7, v10

    .line 433
    .line 434
    invoke-static {v8, v7}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v7

    .line 438
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 439
    .line 440
    .line 441
    goto :goto_a

    .line 442
    :cond_10
    :goto_9
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 446
    .line 447
    .line 448
    :goto_a
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v4

    .line 452
    invoke-direct {v9, v4}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    new-instance v4, La/e8m;

    .line 456
    .line 457
    invoke-direct {v4, v14, v15, v9, v11}, La/e8m;-><init>(JLa/o0x;Ljava/lang/String;)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    move-object/from16 v7, p0

    .line 464
    .line 465
    const/16 v4, 0x2f

    .line 466
    .line 467
    const/4 v9, 0x1

    .line 468
    const/4 v10, 0x0

    .line 469
    goto/16 :goto_7

    .line 470
    .line 471
    :cond_11
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 472
    .line 473
    .line 474
    move-result v4

    .line 475
    if-eqz v4, :cond_12

    .line 476
    .line 477
    sget-object v1, La/lak0;->c:La/lak0;

    .line 478
    .line 479
    goto :goto_b

    .line 480
    :cond_12
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 481
    .line 482
    .line 483
    move-result-object v4

    .line 484
    const/4 v10, 0x0

    .line 485
    new-array v5, v10, [Ljava/lang/Object;

    .line 486
    .line 487
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 488
    .line 489
    invoke-static {v5, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v5

    .line 493
    const v6, 0x7f1300e4

    .line 494
    .line 495
    .line 496
    invoke-virtual {v2, v6, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v2

    .line 500
    new-instance v5, La/m0x;

    .line 501
    .line 502
    const v6, 0x7f0807d5

    .line 503
    .line 504
    .line 505
    const/4 v7, 0x6

    .line 506
    const/4 v8, 0x0

    .line 507
    invoke-direct {v5, v6, v8, v7}, La/m0x;-><init>(ILa/bzw;I)V

    .line 508
    .line 509
    .line 510
    new-instance v6, La/e8m;

    .line 511
    .line 512
    const-wide/16 v7, -0xb

    .line 513
    .line 514
    invoke-direct {v6, v7, v8, v5, v2}, La/e8m;-><init>(JLa/o0x;Ljava/lang/String;)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v4, v6}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 518
    .line 519
    .line 520
    invoke-static {v4, v4, v1}, La/cs0;->f(La/lc00;La/lc00;Ljava/util/ArrayList;)La/a4x;

    .line 521
    .line 522
    .line 523
    move-result-object v1

    .line 524
    :goto_b
    new-instance v2, La/i8m;

    .line 525
    .line 526
    invoke-direct {v2, v1}, La/i8m;-><init>(La/a4x;)V

    .line 527
    .line 528
    .line 529
    invoke-direct {v12, v13, v3, v0, v2}, La/dok;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/i8m;)V

    .line 530
    .line 531
    .line 532
    move-object v8, v12

    .line 533
    goto :goto_d

    .line 534
    :cond_13
    invoke-static {}, La/t9f;->b()V

    .line 535
    .line 536
    .line 537
    :goto_c
    const/4 v8, 0x0

    .line 538
    goto :goto_d

    .line 539
    :cond_14
    invoke-static {}, La/t9f;->b()V

    .line 540
    .line 541
    .line 542
    goto :goto_c

    .line 543
    :goto_d
    return-object v8

    .line 544
    :pswitch_2
    move-object/from16 v1, p1

    .line 545
    .line 546
    check-cast v1, La/fee;

    .line 547
    .line 548
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 549
    .line 550
    .line 551
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v1

    .line 555
    check-cast v1, La/ekw;

    .line 556
    .line 557
    iget-object v1, v1, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 558
    .line 559
    iget-object v2, v0, La/mco;->j:La/n0o0;

    .line 560
    .line 561
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v2

    .line 565
    check-cast v2, La/fee;

    .line 566
    .line 567
    iget-object v2, v2, La/fee;->d:La/pz40;

    .line 568
    .line 569
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v2

    .line 573
    check-cast v2, Ljava/lang/Boolean;

    .line 574
    .line 575
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 576
    .line 577
    .line 578
    move-result v2

    .line 579
    iget-object v3, v0, La/mco;->i:La/n0o0;

    .line 580
    .line 581
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object v3

    .line 585
    check-cast v3, La/fee;

    .line 586
    .line 587
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v3

    .line 591
    check-cast v3, Ljava/lang/Boolean;

    .line 592
    .line 593
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 594
    .line 595
    .line 596
    move-result v3

    .line 597
    iget-object v4, v0, La/mco;->k:La/n0o0;

    .line 598
    .line 599
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v4

    .line 603
    check-cast v4, La/fee;

    .line 604
    .line 605
    invoke-virtual {v4}, La/fee;->c()Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object v4

    .line 609
    check-cast v4, Ljava/lang/Boolean;

    .line 610
    .line 611
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 612
    .line 613
    .line 614
    move-result v4

    .line 615
    iget-object v0, v0, La/mco;->b:La/ctf0;

    .line 616
    .line 617
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 618
    .line 619
    .line 620
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 621
    .line 622
    .line 623
    sget-object v5, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 624
    .line 625
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 626
    .line 627
    .line 628
    move-result v5

    .line 629
    const v6, 0x7f080a2c

    .line 630
    .line 631
    .line 632
    sget-object v7, La/dxf;->a:La/dxf;

    .line 633
    .line 634
    const v8, 0x7f1305fe

    .line 635
    .line 636
    .line 637
    const v9, 0x7f080925

    .line 638
    .line 639
    .line 640
    const v10, 0x7f130403

    .line 641
    .line 642
    .line 643
    if-eqz v5, :cond_17

    .line 644
    .line 645
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 646
    .line 647
    .line 648
    move-result-object v4

    .line 649
    new-instance v5, La/fxf;

    .line 650
    .line 651
    const/4 v11, 0x0

    .line 652
    new-array v12, v11, [Ljava/lang/Object;

    .line 653
    .line 654
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 655
    .line 656
    invoke-static {v12, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v12

    .line 660
    invoke-virtual {v0, v10, v12}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 661
    .line 662
    .line 663
    move-result-object v10

    .line 664
    sget-object v12, La/exf;->a:La/exf;

    .line 665
    .line 666
    invoke-direct {v5, v6, v10, v7, v12}, La/fxf;-><init>(ILjava/lang/String;La/dtb;La/exf;)V

    .line 667
    .line 668
    .line 669
    invoke-virtual {v4, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 670
    .line 671
    .line 672
    if-eqz v2, :cond_16

    .line 673
    .line 674
    new-instance v2, La/fxf;

    .line 675
    .line 676
    new-array v5, v11, [Ljava/lang/Object;

    .line 677
    .line 678
    invoke-static {v5, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 679
    .line 680
    .line 681
    move-result-object v5

    .line 682
    invoke-virtual {v0, v8, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 683
    .line 684
    .line 685
    move-result-object v5

    .line 686
    if-eqz v3, :cond_15

    .line 687
    .line 688
    new-instance v3, La/cxf;

    .line 689
    .line 690
    invoke-direct {v3}, La/cxf;-><init>()V

    .line 691
    .line 692
    .line 693
    goto :goto_e

    .line 694
    :cond_15
    move-object v3, v7

    .line 695
    :goto_e
    sget-object v6, La/exf;->b:La/exf;

    .line 696
    .line 697
    invoke-direct {v2, v9, v5, v3, v6}, La/fxf;-><init>(ILjava/lang/String;La/dtb;La/exf;)V

    .line 698
    .line 699
    .line 700
    invoke-virtual {v4, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 701
    .line 702
    .line 703
    :cond_16
    new-instance v2, La/fxf;

    .line 704
    .line 705
    const/4 v10, 0x0

    .line 706
    new-array v3, v10, [Ljava/lang/Object;

    .line 707
    .line 708
    invoke-static {v3, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    move-result-object v3

    .line 712
    const v5, 0x7f13030a

    .line 713
    .line 714
    .line 715
    invoke-virtual {v0, v5, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 716
    .line 717
    .line 718
    move-result-object v0

    .line 719
    sget-object v3, La/exf;->c:La/exf;

    .line 720
    .line 721
    const v5, 0x7f0807f8

    .line 722
    .line 723
    .line 724
    invoke-direct {v2, v5, v0, v7, v3}, La/fxf;-><init>(ILjava/lang/String;La/dtb;La/exf;)V

    .line 725
    .line 726
    .line 727
    invoke-virtual {v4, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 728
    .line 729
    .line 730
    invoke-static {v4}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 731
    .line 732
    .line 733
    move-result-object v0

    .line 734
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 735
    .line 736
    .line 737
    move-result-object v0

    .line 738
    goto/16 :goto_11

    .line 739
    .line 740
    :cond_17
    sget-object v5, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 741
    .line 742
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 743
    .line 744
    .line 745
    move-result v5

    .line 746
    if-eqz v5, :cond_1b

    .line 747
    .line 748
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 749
    .line 750
    .line 751
    move-result-object v5

    .line 752
    if-eqz v4, :cond_18

    .line 753
    .line 754
    new-instance v4, La/fxf;

    .line 755
    .line 756
    const/4 v11, 0x0

    .line 757
    new-array v12, v11, [Ljava/lang/Object;

    .line 758
    .line 759
    iget-object v13, v0, La/ctf0;->b:La/lsm0;

    .line 760
    .line 761
    invoke-static {v12, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    move-result-object v12

    .line 765
    const v14, 0x7f1303f9

    .line 766
    .line 767
    .line 768
    invoke-virtual {v13, v14, v12}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 769
    .line 770
    .line 771
    move-result-object v12

    .line 772
    sget-object v13, La/exf;->d:La/exf;

    .line 773
    .line 774
    const v14, 0x7f080808

    .line 775
    .line 776
    .line 777
    invoke-direct {v4, v14, v12, v7, v13}, La/fxf;-><init>(ILjava/lang/String;La/dtb;La/exf;)V

    .line 778
    .line 779
    .line 780
    invoke-virtual {v5, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 781
    .line 782
    .line 783
    goto :goto_f

    .line 784
    :cond_18
    const/4 v11, 0x0

    .line 785
    :goto_f
    if-eqz v2, :cond_1a

    .line 786
    .line 787
    new-instance v2, La/fxf;

    .line 788
    .line 789
    new-array v4, v11, [Ljava/lang/Object;

    .line 790
    .line 791
    iget-object v12, v0, La/ctf0;->b:La/lsm0;

    .line 792
    .line 793
    invoke-static {v4, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 794
    .line 795
    .line 796
    move-result-object v4

    .line 797
    invoke-virtual {v12, v8, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 798
    .line 799
    .line 800
    move-result-object v4

    .line 801
    if-eqz v3, :cond_19

    .line 802
    .line 803
    new-instance v3, La/cxf;

    .line 804
    .line 805
    invoke-direct {v3}, La/cxf;-><init>()V

    .line 806
    .line 807
    .line 808
    goto :goto_10

    .line 809
    :cond_19
    move-object v3, v7

    .line 810
    :goto_10
    sget-object v8, La/exf;->b:La/exf;

    .line 811
    .line 812
    invoke-direct {v2, v9, v4, v3, v8}, La/fxf;-><init>(ILjava/lang/String;La/dtb;La/exf;)V

    .line 813
    .line 814
    .line 815
    invoke-virtual {v5, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 816
    .line 817
    .line 818
    :cond_1a
    new-instance v2, La/fxf;

    .line 819
    .line 820
    const/4 v11, 0x0

    .line 821
    new-array v3, v11, [Ljava/lang/Object;

    .line 822
    .line 823
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 824
    .line 825
    invoke-static {v3, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 826
    .line 827
    .line 828
    move-result-object v3

    .line 829
    invoke-virtual {v0, v10, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 830
    .line 831
    .line 832
    move-result-object v0

    .line 833
    sget-object v3, La/exf;->a:La/exf;

    .line 834
    .line 835
    invoke-direct {v2, v6, v0, v7, v3}, La/fxf;-><init>(ILjava/lang/String;La/dtb;La/exf;)V

    .line 836
    .line 837
    .line 838
    invoke-virtual {v5, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 839
    .line 840
    .line 841
    invoke-static {v5}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 842
    .line 843
    .line 844
    move-result-object v0

    .line 845
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    goto :goto_11

    .line 850
    :cond_1b
    sget-object v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 851
    .line 852
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 853
    .line 854
    .line 855
    move-result v4

    .line 856
    if-eqz v4, :cond_1e

    .line 857
    .line 858
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 859
    .line 860
    .line 861
    move-result-object v4

    .line 862
    new-instance v5, La/fxf;

    .line 863
    .line 864
    const/4 v11, 0x0

    .line 865
    new-array v12, v11, [Ljava/lang/Object;

    .line 866
    .line 867
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 868
    .line 869
    invoke-static {v12, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    move-result-object v12

    .line 873
    invoke-virtual {v0, v10, v12}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 874
    .line 875
    .line 876
    move-result-object v10

    .line 877
    sget-object v12, La/exf;->a:La/exf;

    .line 878
    .line 879
    invoke-direct {v5, v6, v10, v7, v12}, La/fxf;-><init>(ILjava/lang/String;La/dtb;La/exf;)V

    .line 880
    .line 881
    .line 882
    invoke-virtual {v4, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 883
    .line 884
    .line 885
    if-eqz v2, :cond_1d

    .line 886
    .line 887
    new-instance v2, La/fxf;

    .line 888
    .line 889
    new-array v5, v11, [Ljava/lang/Object;

    .line 890
    .line 891
    invoke-static {v5, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 892
    .line 893
    .line 894
    move-result-object v5

    .line 895
    invoke-virtual {v0, v8, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 896
    .line 897
    .line 898
    move-result-object v0

    .line 899
    if-eqz v3, :cond_1c

    .line 900
    .line 901
    new-instance v7, La/cxf;

    .line 902
    .line 903
    invoke-direct {v7}, La/cxf;-><init>()V

    .line 904
    .line 905
    .line 906
    :cond_1c
    sget-object v3, La/exf;->b:La/exf;

    .line 907
    .line 908
    invoke-direct {v2, v9, v0, v7, v3}, La/fxf;-><init>(ILjava/lang/String;La/dtb;La/exf;)V

    .line 909
    .line 910
    .line 911
    invoke-virtual {v4, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 912
    .line 913
    .line 914
    :cond_1d
    invoke-static {v4}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 915
    .line 916
    .line 917
    move-result-object v0

    .line 918
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 919
    .line 920
    .line 921
    move-result-object v0

    .line 922
    :goto_11
    new-instance v8, La/hf9;

    .line 923
    .line 924
    new-instance v2, Ljava/lang/StringBuilder;

    .line 925
    .line 926
    const-string v3, "ButtonsCollectionUiModel"

    .line 927
    .line 928
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 929
    .line 930
    .line 931
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 932
    .line 933
    .line 934
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 935
    .line 936
    .line 937
    move-result-object v1

    .line 938
    invoke-direct {v8, v0, v1}, La/hf9;-><init>(La/a4x;Ljava/lang/String;)V

    .line 939
    .line 940
    .line 941
    goto :goto_12

    .line 942
    :cond_1e
    invoke-static {}, La/t9f;->b()V

    .line 943
    .line 944
    .line 945
    const/4 v8, 0x0

    .line 946
    :goto_12
    return-object v8

    .line 947
    :pswitch_3
    move-object/from16 v1, p1

    .line 948
    .line 949
    check-cast v1, Ljava/util/List;

    .line 950
    .line 951
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 952
    .line 953
    .line 954
    invoke-virtual {v0}, La/mco;->b()La/fee;

    .line 955
    .line 956
    .line 957
    move-result-object v3

    .line 958
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 959
    .line 960
    .line 961
    move-result-object v3

    .line 962
    check-cast v3, La/ekw;

    .line 963
    .line 964
    iget-object v3, v3, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 965
    .line 966
    iget-object v0, v0, La/mco;->b:La/ctf0;

    .line 967
    .line 968
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 969
    .line 970
    .line 971
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 972
    .line 973
    .line 974
    new-instance v4, Ljava/util/ArrayList;

    .line 975
    .line 976
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 977
    .line 978
    .line 979
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 980
    .line 981
    .line 982
    move-result-object v1

    .line 983
    :cond_1f
    :goto_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 984
    .line 985
    .line 986
    move-result v8

    .line 987
    if-eqz v8, :cond_20

    .line 988
    .line 989
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 990
    .line 991
    .line 992
    move-result-object v8

    .line 993
    move-object v9, v8

    .line 994
    check-cast v9, La/uog;

    .line 995
    .line 996
    iget-object v9, v9, La/uog;->b:Ljava/lang/String;

    .line 997
    .line 998
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 999
    .line 1000
    .line 1001
    move-result v9

    .line 1002
    if-lez v9, :cond_1f

    .line 1003
    .line 1004
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1005
    .line 1006
    .line 1007
    goto :goto_13

    .line 1008
    :cond_20
    new-instance v1, Ljava/util/HashSet;

    .line 1009
    .line 1010
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 1011
    .line 1012
    .line 1013
    new-instance v8, Ljava/util/ArrayList;

    .line 1014
    .line 1015
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1016
    .line 1017
    .line 1018
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v4

    .line 1022
    :cond_21
    :goto_14
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1023
    .line 1024
    .line 1025
    move-result v9

    .line 1026
    if-eqz v9, :cond_22

    .line 1027
    .line 1028
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v9

    .line 1032
    move-object v10, v9

    .line 1033
    check-cast v10, La/uog;

    .line 1034
    .line 1035
    iget v10, v10, La/uog;->a:I

    .line 1036
    .line 1037
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v10

    .line 1041
    invoke-virtual {v1, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1042
    .line 1043
    .line 1044
    move-result v10

    .line 1045
    if-eqz v10, :cond_21

    .line 1046
    .line 1047
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1048
    .line 1049
    .line 1050
    goto :goto_14

    .line 1051
    :cond_22
    const/16 v1, 0x10

    .line 1052
    .line 1053
    invoke-static {v8, v1}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v1

    .line 1057
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 1058
    .line 1059
    .line 1060
    move-result v4

    .line 1061
    if-nez v4, :cond_29

    .line 1062
    .line 1063
    sget-object v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 1064
    .line 1065
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1066
    .line 1067
    .line 1068
    move-result v3

    .line 1069
    if-nez v3, :cond_23

    .line 1070
    .line 1071
    goto/16 :goto_1b

    .line 1072
    .line 1073
    :cond_23
    new-instance v3, La/v7m;

    .line 1074
    .line 1075
    new-instance v4, La/c8m;

    .line 1076
    .line 1077
    const/4 v10, 0x0

    .line 1078
    new-array v8, v10, [Ljava/lang/Object;

    .line 1079
    .line 1080
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 1081
    .line 1082
    invoke-static {v8, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v8

    .line 1086
    const v9, 0x7f130efc

    .line 1087
    .line 1088
    .line 1089
    invoke-virtual {v0, v9, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v0

    .line 1093
    invoke-direct {v4, v0, v2}, La/c8m;-><init>(Ljava/lang/CharSequence;La/o7m;)V

    .line 1094
    .line 1095
    .line 1096
    invoke-direct {v3, v4}, La/v7m;-><init>(La/c8m;)V

    .line 1097
    .line 1098
    .line 1099
    new-instance v0, Ljava/util/ArrayList;

    .line 1100
    .line 1101
    invoke-static {v1, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1102
    .line 1103
    .line 1104
    move-result v2

    .line 1105
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1106
    .line 1107
    .line 1108
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v1

    .line 1112
    :goto_15
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1113
    .line 1114
    .line 1115
    move-result v2

    .line 1116
    if-eqz v2, :cond_28

    .line 1117
    .line 1118
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v2

    .line 1122
    check-cast v2, La/uog;

    .line 1123
    .line 1124
    iget v4, v2, La/uog;->a:I

    .line 1125
    .line 1126
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v4

    .line 1130
    iget-object v7, v2, La/uog;->c:Ljava/lang/String;

    .line 1131
    .line 1132
    iget-object v8, v2, La/uog;->b:Ljava/lang/String;

    .line 1133
    .line 1134
    new-instance v9, Ljava/lang/StringBuilder;

    .line 1135
    .line 1136
    sget-object v10, La/ujn;->h:Ljava/lang/String;

    .line 1137
    .line 1138
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1139
    .line 1140
    .line 1141
    iget-object v2, v2, La/uog;->l:Ljava/lang/String;

    .line 1142
    .line 1143
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 1144
    .line 1145
    .line 1146
    move-result v10

    .line 1147
    if-nez v10, :cond_24

    .line 1148
    .line 1149
    const/4 v10, 0x0

    .line 1150
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1151
    .line 1152
    .line 1153
    const/16 v10, 0x2f

    .line 1154
    .line 1155
    goto :goto_1a

    .line 1156
    :cond_24
    const/4 v10, 0x0

    .line 1157
    sget-object v11, La/ujn;->h:Ljava/lang/String;

    .line 1158
    .line 1159
    invoke-static {v2, v11, v10}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1160
    .line 1161
    .line 1162
    move-result v11

    .line 1163
    if-nez v11, :cond_27

    .line 1164
    .line 1165
    invoke-static {v2, v5, v10}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1166
    .line 1167
    .line 1168
    move-result v11

    .line 1169
    if-eqz v11, :cond_25

    .line 1170
    .line 1171
    const/4 v11, 0x0

    .line 1172
    :goto_16
    const/16 v10, 0x2f

    .line 1173
    .line 1174
    goto :goto_19

    .line 1175
    :cond_25
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->length()I

    .line 1176
    .line 1177
    .line 1178
    move-result v10

    .line 1179
    if-lez v10, :cond_26

    .line 1180
    .line 1181
    invoke-static {v9, v6}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 1182
    .line 1183
    .line 1184
    move-result v10

    .line 1185
    if-nez v10, :cond_26

    .line 1186
    .line 1187
    const/16 v10, 0x2f

    .line 1188
    .line 1189
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1190
    .line 1191
    .line 1192
    :goto_17
    const/4 v11, 0x1

    .line 1193
    goto :goto_18

    .line 1194
    :cond_26
    const/16 v10, 0x2f

    .line 1195
    .line 1196
    goto :goto_17

    .line 1197
    :goto_18
    new-array v12, v11, [C

    .line 1198
    .line 1199
    const/4 v11, 0x0

    .line 1200
    aput-char v10, v12, v11

    .line 1201
    .line 1202
    invoke-static {v2, v12}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 1203
    .line 1204
    .line 1205
    move-result-object v2

    .line 1206
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1207
    .line 1208
    .line 1209
    goto :goto_1a

    .line 1210
    :cond_27
    move v11, v10

    .line 1211
    goto :goto_16

    .line 1212
    :goto_19
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1213
    .line 1214
    .line 1215
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1216
    .line 1217
    .line 1218
    :goto_1a
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v2

    .line 1222
    new-instance v9, La/zx80;

    .line 1223
    .line 1224
    invoke-direct {v9, v4, v7, v8, v2}, La/zx80;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1225
    .line 1226
    .line 1227
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1228
    .line 1229
    .line 1230
    goto :goto_15

    .line 1231
    :cond_28
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v0

    .line 1235
    new-instance v1, La/wx80;

    .line 1236
    .line 1237
    invoke-direct {v1, v0}, La/wx80;-><init>(La/i4;)V

    .line 1238
    .line 1239
    .line 1240
    new-instance v0, La/crv;

    .line 1241
    .line 1242
    const-string v2, "HeaderFocusPartnersCardCollectionUiModel"

    .line 1243
    .line 1244
    invoke-direct {v0, v2, v3, v1}, La/crv;-><init>(Ljava/lang/String;La/b8m;La/yx80;)V

    .line 1245
    .line 1246
    .line 1247
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v0

    .line 1251
    goto :goto_1c

    .line 1252
    :cond_29
    :goto_1b
    sget-object v0, La/iun;->a:La/iun;

    .line 1253
    .line 1254
    :goto_1c
    return-object v0

    .line 1255
    :pswitch_4
    move-object/from16 v1, p1

    .line 1256
    .line 1257
    check-cast v1, Ljava/lang/Boolean;

    .line 1258
    .line 1259
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1260
    .line 1261
    .line 1262
    move-result v1

    .line 1263
    iget-object v2, v0, La/mco;->b:La/ctf0;

    .line 1264
    .line 1265
    iget-object v0, v0, La/mco;->e:La/zjw;

    .line 1266
    .line 1267
    iget-boolean v3, v0, La/zjw;->f:Z

    .line 1268
    .line 1269
    iget-object v0, v0, La/zjw;->b:La/sff0;

    .line 1270
    .line 1271
    iget-object v0, v0, La/sff0;->c:La/ech;

    .line 1272
    .line 1273
    iget-object v0, v0, La/ech;->a:La/hdh;

    .line 1274
    .line 1275
    iget-boolean v0, v0, La/hdh;->d:Z

    .line 1276
    .line 1277
    invoke-static {v1, v2, v3, v0}, La/qbc;->I(ZLa/ctf0;ZZ)La/lc00;

    .line 1278
    .line 1279
    .line 1280
    move-result-object v0

    .line 1281
    return-object v0

    .line 1282
    :pswitch_5
    move-object/from16 v1, p1

    .line 1283
    .line 1284
    check-cast v1, La/xqv;

    .line 1285
    .line 1286
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1287
    .line 1288
    .line 1289
    iget-object v4, v0, La/mco;->c:La/y78;

    .line 1290
    .line 1291
    iget-object v5, v0, La/mco;->b:La/ctf0;

    .line 1292
    .line 1293
    invoke-virtual {v0}, La/mco;->b()La/fee;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v6

    .line 1297
    invoke-virtual {v6}, La/fee;->c()Ljava/lang/Object;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v6

    .line 1301
    check-cast v6, La/ekw;

    .line 1302
    .line 1303
    iget-object v6, v6, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1304
    .line 1305
    iget-object v8, v0, La/mco;->h:La/n0o0;

    .line 1306
    .line 1307
    invoke-virtual {v8}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1308
    .line 1309
    .line 1310
    move-result-object v8

    .line 1311
    check-cast v8, La/fee;

    .line 1312
    .line 1313
    invoke-virtual {v8}, La/fee;->c()Ljava/lang/Object;

    .line 1314
    .line 1315
    .line 1316
    move-result-object v8

    .line 1317
    check-cast v8, Ljava/util/Map;

    .line 1318
    .line 1319
    iget-object v0, v0, La/mco;->e:La/zjw;

    .line 1320
    .line 1321
    iget-boolean v9, v0, La/zjw;->e:Z

    .line 1322
    .line 1323
    iget-object v10, v0, La/zjw;->b:La/sff0;

    .line 1324
    .line 1325
    iget-object v11, v0, La/zjw;->c:Ljava/util/List;

    .line 1326
    .line 1327
    iget-object v12, v10, La/sff0;->g:La/mum0;

    .line 1328
    .line 1329
    iget-object v12, v12, La/mum0;->y:La/v5l0;

    .line 1330
    .line 1331
    iget-boolean v0, v0, La/zjw;->s:Z

    .line 1332
    .line 1333
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1334
    .line 1335
    .line 1336
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1337
    .line 1338
    .line 1339
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1340
    .line 1341
    .line 1342
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1343
    .line 1344
    .line 1345
    iget-object v13, v1, La/xqv;->a:Ljava/util/List;

    .line 1346
    .line 1347
    iget-object v1, v1, La/xqv;->b:Ljava/util/List;

    .line 1348
    .line 1349
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    .line 1350
    .line 1351
    .line 1352
    move-result v14

    .line 1353
    if-eqz v14, :cond_2a

    .line 1354
    .line 1355
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 1356
    .line 1357
    .line 1358
    move-result v14

    .line 1359
    if-eqz v14, :cond_2a

    .line 1360
    .line 1361
    sget-object v0, La/iun;->a:La/iun;

    .line 1362
    .line 1363
    goto/16 :goto_30

    .line 1364
    .line 1365
    :cond_2a
    invoke-interface {v8, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v8

    .line 1369
    check-cast v8, La/sip;

    .line 1370
    .line 1371
    if-nez v8, :cond_2b

    .line 1372
    .line 1373
    sget-object v8, La/sip;->c:La/sip;

    .line 1374
    .line 1375
    :cond_2b
    new-instance v14, La/yqv;

    .line 1376
    .line 1377
    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 1378
    .line 1379
    .line 1380
    move-result-object v15

    .line 1381
    invoke-static {v6}, Lorg/xplatform/cyber/section/api/domain/entity/d;->a(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)Ljava/lang/String;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v7

    .line 1385
    move/from16 v34, v0

    .line 1386
    .line 1387
    const-string v0, "HeaderFocusAllEventsUiModel_"

    .line 1388
    .line 1389
    move-object/from16 v20, v1

    .line 1390
    .line 1391
    const-string v1, "_"

    .line 1392
    .line 1393
    invoke-static {v0, v15, v1, v7}, La/ua80;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v0

    .line 1397
    new-instance v1, La/esv;

    .line 1398
    .line 1399
    invoke-interface/range {v20 .. v20}, Ljava/util/List;->isEmpty()Z

    .line 1400
    .line 1401
    .line 1402
    move-result v7

    .line 1403
    if-eqz v7, :cond_2c

    .line 1404
    .line 1405
    sget-object v7, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 1406
    .line 1407
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1408
    .line 1409
    .line 1410
    move-result v7

    .line 1411
    if-eqz v7, :cond_2c

    .line 1412
    .line 1413
    const v7, 0x7f1305fc

    .line 1414
    .line 1415
    .line 1416
    goto :goto_1d

    .line 1417
    :cond_2c
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    .line 1418
    .line 1419
    .line 1420
    move-result v7

    .line 1421
    if-eqz v7, :cond_2d

    .line 1422
    .line 1423
    sget-object v7, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 1424
    .line 1425
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1426
    .line 1427
    .line 1428
    move-result v7

    .line 1429
    if-eqz v7, :cond_2d

    .line 1430
    .line 1431
    const v7, 0x7f130fd3

    .line 1432
    .line 1433
    .line 1434
    goto :goto_1d

    .line 1435
    :cond_2d
    const v7, 0x7f130fc2

    .line 1436
    .line 1437
    .line 1438
    :goto_1d
    new-instance v15, La/v7m;

    .line 1439
    .line 1440
    move-object/from16 v22, v4

    .line 1441
    .line 1442
    new-instance v4, La/c8m;

    .line 1443
    .line 1444
    move/from16 v23, v9

    .line 1445
    .line 1446
    move-object/from16 v31, v12

    .line 1447
    .line 1448
    const/4 v9, 0x0

    .line 1449
    new-array v12, v9, [Ljava/lang/Object;

    .line 1450
    .line 1451
    move-object/from16 v19, v13

    .line 1452
    .line 1453
    iget-object v13, v5, La/ctf0;->b:La/lsm0;

    .line 1454
    .line 1455
    invoke-static {v12, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1456
    .line 1457
    .line 1458
    move-result-object v12

    .line 1459
    invoke-virtual {v13, v7, v12}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1460
    .line 1461
    .line 1462
    move-result-object v7

    .line 1463
    sget-object v12, La/rv00;->m:La/rv00;

    .line 1464
    .line 1465
    invoke-direct {v4, v7, v12}, La/c8m;-><init>(Ljava/lang/CharSequence;La/o7m;)V

    .line 1466
    .line 1467
    .line 1468
    invoke-direct {v15, v4}, La/v7m;-><init>(La/c8m;)V

    .line 1469
    .line 1470
    .line 1471
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->isEmpty()Z

    .line 1472
    .line 1473
    .line 1474
    move-result v4

    .line 1475
    if-nez v4, :cond_2e

    .line 1476
    .line 1477
    invoke-interface/range {v20 .. v20}, Ljava/util/List;->isEmpty()Z

    .line 1478
    .line 1479
    .line 1480
    move-result v4

    .line 1481
    if-eqz v4, :cond_2f

    .line 1482
    .line 1483
    :cond_2e
    move-object/from16 v21, v5

    .line 1484
    .line 1485
    goto :goto_1e

    .line 1486
    :cond_2f
    new-instance v4, La/dsv;

    .line 1487
    .line 1488
    new-array v7, v9, [Ljava/lang/Object;

    .line 1489
    .line 1490
    invoke-static {v7, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1491
    .line 1492
    .line 1493
    move-result-object v7

    .line 1494
    const v12, 0x7f130b3d

    .line 1495
    .line 1496
    .line 1497
    invoke-virtual {v13, v12, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1498
    .line 1499
    .line 1500
    move-result-object v7

    .line 1501
    sget-object v12, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 1502
    .line 1503
    invoke-virtual {v7, v12}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1504
    .line 1505
    .line 1506
    move-result-object v7

    .line 1507
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1508
    .line 1509
    .line 1510
    sget-object v9, La/sip;->c:La/sip;

    .line 1511
    .line 1512
    move-object/from16 v21, v5

    .line 1513
    .line 1514
    invoke-static {v8}, La/kpb;->u(La/sip;)Z

    .line 1515
    .line 1516
    .line 1517
    move-result v5

    .line 1518
    invoke-direct {v4, v7, v9, v5}, La/dsv;-><init>(Ljava/lang/String;La/sip;Z)V

    .line 1519
    .line 1520
    .line 1521
    new-instance v5, La/dsv;

    .line 1522
    .line 1523
    const/4 v9, 0x0

    .line 1524
    new-array v7, v9, [Ljava/lang/Object;

    .line 1525
    .line 1526
    invoke-static {v7, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1527
    .line 1528
    .line 1529
    move-result-object v7

    .line 1530
    const v9, 0x7f130b2c

    .line 1531
    .line 1532
    .line 1533
    invoke-virtual {v13, v9, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1534
    .line 1535
    .line 1536
    move-result-object v7

    .line 1537
    invoke-virtual {v7, v12}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1538
    .line 1539
    .line 1540
    move-result-object v7

    .line 1541
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1542
    .line 1543
    .line 1544
    sget-object v9, La/sip;->b:La/sip;

    .line 1545
    .line 1546
    invoke-static {v8}, La/kpb;->u(La/sip;)Z

    .line 1547
    .line 1548
    .line 1549
    move-result v12

    .line 1550
    const/16 v17, 0x1

    .line 1551
    .line 1552
    xor-int/lit8 v12, v12, 0x1

    .line 1553
    .line 1554
    invoke-direct {v5, v7, v9, v12}, La/dsv;-><init>(Ljava/lang/String;La/sip;Z)V

    .line 1555
    .line 1556
    .line 1557
    filled-new-array {v4, v5}, [La/dsv;

    .line 1558
    .line 1559
    .line 1560
    move-result-object v4

    .line 1561
    invoke-static {v4}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 1562
    .line 1563
    .line 1564
    move-result-object v4

    .line 1565
    goto :goto_1f

    .line 1566
    :goto_1e
    sget-object v4, La/lak0;->c:La/lak0;

    .line 1567
    .line 1568
    :goto_1f
    invoke-direct {v1, v3, v15, v4}, La/esv;-><init>(Ljava/lang/String;La/b8m;La/a4x;)V

    .line 1569
    .line 1570
    .line 1571
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->isEmpty()Z

    .line 1572
    .line 1573
    .line 1574
    move-result v4

    .line 1575
    if-eqz v4, :cond_31

    .line 1576
    .line 1577
    :cond_30
    move-object/from16 v13, v20

    .line 1578
    .line 1579
    goto :goto_21

    .line 1580
    :cond_31
    invoke-interface/range {v20 .. v20}, Ljava/util/List;->isEmpty()Z

    .line 1581
    .line 1582
    .line 1583
    move-result v4

    .line 1584
    if-eqz v4, :cond_32

    .line 1585
    .line 1586
    :goto_20
    move-object/from16 v13, v19

    .line 1587
    .line 1588
    goto :goto_21

    .line 1589
    :cond_32
    invoke-static {v8}, La/kpb;->u(La/sip;)Z

    .line 1590
    .line 1591
    .line 1592
    move-result v4

    .line 1593
    if-eqz v4, :cond_30

    .line 1594
    .line 1595
    goto :goto_20

    .line 1596
    :goto_21
    new-instance v4, Ljava/util/ArrayList;

    .line 1597
    .line 1598
    const/16 v5, 0xa

    .line 1599
    .line 1600
    invoke-static {v13, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1601
    .line 1602
    .line 1603
    move-result v7

    .line 1604
    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 1605
    .line 1606
    .line 1607
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1608
    .line 1609
    .line 1610
    move-result-object v5

    .line 1611
    const/4 v7, 0x0

    .line 1612
    :goto_22
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1613
    .line 1614
    .line 1615
    move-result v9

    .line 1616
    if-eqz v9, :cond_41

    .line 1617
    .line 1618
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1619
    .line 1620
    .line 1621
    move-result-object v9

    .line 1622
    add-int/lit8 v12, v7, 0x1

    .line 1623
    .line 1624
    if-ltz v7, :cond_40

    .line 1625
    .line 1626
    check-cast v9, La/eih;

    .line 1627
    .line 1628
    move/from16 p1, v12

    .line 1629
    .line 1630
    iget-wide v12, v9, La/eih;->a:J

    .line 1631
    .line 1632
    const-wide/16 v19, 0x28

    .line 1633
    .line 1634
    cmp-long v7, v12, v19

    .line 1635
    .line 1636
    if-nez v7, :cond_33

    .line 1637
    .line 1638
    iget-wide v12, v9, La/eih;->b:J

    .line 1639
    .line 1640
    :cond_33
    new-instance v7, La/vqv;

    .line 1641
    .line 1642
    invoke-static {v6}, Lorg/xplatform/cyber/section/api/domain/entity/d;->a(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)Ljava/lang/String;

    .line 1643
    .line 1644
    .line 1645
    move-result-object v15

    .line 1646
    move-object/from16 v19, v3

    .line 1647
    .line 1648
    invoke-static {v8}, La/kpb;->u(La/sip;)Z

    .line 1649
    .line 1650
    .line 1651
    move-result v3

    .line 1652
    move-object/from16 v35, v5

    .line 1653
    .line 1654
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1655
    .line 1656
    move-object/from16 v36, v7

    .line 1657
    .line 1658
    const-string v7, "HeaderFocusDisciplineGame_"

    .line 1659
    .line 1660
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1661
    .line 1662
    .line 1663
    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1664
    .line 1665
    .line 1666
    invoke-virtual {v5, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1667
    .line 1668
    .line 1669
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 1670
    .line 1671
    .line 1672
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1673
    .line 1674
    .line 1675
    move-result-object v3

    .line 1676
    new-instance v5, La/zqv;

    .line 1677
    .line 1678
    new-instance v7, La/y7m;

    .line 1679
    .line 1680
    new-instance v15, La/c8m;

    .line 1681
    .line 1682
    move-object/from16 v37, v3

    .line 1683
    .line 1684
    iget-object v3, v9, La/eih;->c:Ljava/lang/String;

    .line 1685
    .line 1686
    invoke-direct {v15, v3, v2}, La/c8m;-><init>(Ljava/lang/CharSequence;La/o7m;)V

    .line 1687
    .line 1688
    .line 1689
    invoke-direct {v7, v15}, La/y7m;-><init>(La/c8m;)V

    .line 1690
    .line 1691
    .line 1692
    invoke-direct {v5, v7}, La/zqv;-><init>(La/b8m;)V

    .line 1693
    .line 1694
    .line 1695
    sget-object v3, La/q0s;->b:La/q0s;

    .line 1696
    .line 1697
    iget-object v7, v9, La/eih;->e:Ljava/util/ArrayList;

    .line 1698
    .line 1699
    new-instance v15, Ljava/util/ArrayList;

    .line 1700
    .line 1701
    move-object/from16 v38, v2

    .line 1702
    .line 1703
    move-object/from16 v39, v5

    .line 1704
    .line 1705
    const/16 v2, 0xa

    .line 1706
    .line 1707
    invoke-static {v7, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1708
    .line 1709
    .line 1710
    move-result v5

    .line 1711
    invoke-direct {v15, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 1712
    .line 1713
    .line 1714
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1715
    .line 1716
    .line 1717
    move-result-object v2

    .line 1718
    :goto_23
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1719
    .line 1720
    .line 1721
    move-result v5

    .line 1722
    if-eqz v5, :cond_3f

    .line 1723
    .line 1724
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1725
    .line 1726
    .line 1727
    move-result-object v5

    .line 1728
    check-cast v5, La/d0t;

    .line 1729
    .line 1730
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1731
    .line 1732
    .line 1733
    move-result-object v7

    .line 1734
    :goto_24
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1735
    .line 1736
    .line 1737
    move-result v20

    .line 1738
    if-eqz v20, :cond_35

    .line 1739
    .line 1740
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1741
    .line 1742
    .line 1743
    move-result-object v20

    .line 1744
    move-object/from16 v40, v2

    .line 1745
    .line 1746
    move-object/from16 v2, v20

    .line 1747
    .line 1748
    check-cast v2, La/lok0;

    .line 1749
    .line 1750
    iget v2, v2, La/lok0;->a:I

    .line 1751
    .line 1752
    move-object/from16 v24, v7

    .line 1753
    .line 1754
    iget v7, v5, La/d0t;->O:I

    .line 1755
    .line 1756
    if-ne v2, v7, :cond_34

    .line 1757
    .line 1758
    goto :goto_25

    .line 1759
    :cond_34
    move-object/from16 v7, v24

    .line 1760
    .line 1761
    move-object/from16 v2, v40

    .line 1762
    .line 1763
    goto :goto_24

    .line 1764
    :cond_35
    move-object/from16 v40, v2

    .line 1765
    .line 1766
    const/16 v20, 0x0

    .line 1767
    .line 1768
    :goto_25
    move-object/from16 v2, v20

    .line 1769
    .line 1770
    check-cast v2, La/lok0;

    .line 1771
    .line 1772
    iget-boolean v7, v10, La/sff0;->J:Z

    .line 1773
    .line 1774
    move/from16 v24, v7

    .line 1775
    .line 1776
    iget-object v7, v9, La/eih;->f:Ljava/lang/String;

    .line 1777
    .line 1778
    move-object/from16 v25, v7

    .line 1779
    .line 1780
    sget-object v7, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 1781
    .line 1782
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1783
    .line 1784
    .line 1785
    move-result v26

    .line 1786
    new-instance v7, Ljava/util/ArrayList;

    .line 1787
    .line 1788
    move-object/from16 v41, v9

    .line 1789
    .line 1790
    move-object/from16 v18, v10

    .line 1791
    .line 1792
    const/16 v9, 0xa

    .line 1793
    .line 1794
    invoke-static {v11, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1795
    .line 1796
    .line 1797
    move-result v10

    .line 1798
    invoke-direct {v7, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 1799
    .line 1800
    .line 1801
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1802
    .line 1803
    .line 1804
    move-result-object v10

    .line 1805
    :goto_26
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 1806
    .line 1807
    .line 1808
    move-result v20

    .line 1809
    if-eqz v20, :cond_36

    .line 1810
    .line 1811
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1812
    .line 1813
    .line 1814
    move-result-object v20

    .line 1815
    move-object/from16 v9, v20

    .line 1816
    .line 1817
    check-cast v9, La/lok0;

    .line 1818
    .line 1819
    iget v9, v9, La/lok0;->a:I

    .line 1820
    .line 1821
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1822
    .line 1823
    .line 1824
    move-result-object v9

    .line 1825
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1826
    .line 1827
    .line 1828
    const/16 v9, 0xa

    .line 1829
    .line 1830
    goto :goto_26

    .line 1831
    :cond_36
    if-eqz v2, :cond_37

    .line 1832
    .line 1833
    iget-boolean v10, v2, La/lok0;->n:Z

    .line 1834
    .line 1835
    move/from16 v28, v10

    .line 1836
    .line 1837
    goto :goto_27

    .line 1838
    :cond_37
    const/16 v28, 0x0

    .line 1839
    .line 1840
    :goto_27
    if-eqz v2, :cond_38

    .line 1841
    .line 1842
    iget-boolean v10, v2, La/lok0;->p:Z

    .line 1843
    .line 1844
    move/from16 v29, v10

    .line 1845
    .line 1846
    goto :goto_28

    .line 1847
    :cond_38
    const/16 v29, 0x0

    .line 1848
    .line 1849
    :goto_28
    sget-object v9, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 1850
    .line 1851
    invoke-virtual {v6, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1852
    .line 1853
    .line 1854
    move-result v30

    .line 1855
    iget-object v9, v5, La/d0t;->K:Ljava/util/List;

    .line 1856
    .line 1857
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 1858
    .line 1859
    .line 1860
    move-result v9

    .line 1861
    if-eqz v9, :cond_3c

    .line 1862
    .line 1863
    iget-object v9, v5, La/d0t;->k:Ljava/util/List;

    .line 1864
    .line 1865
    if-eqz v9, :cond_39

    .line 1866
    .line 1867
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 1868
    .line 1869
    .line 1870
    move-result v10

    .line 1871
    if-eqz v10, :cond_39

    .line 1872
    .line 1873
    goto :goto_29

    .line 1874
    :cond_39
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1875
    .line 1876
    .line 1877
    move-result-object v9

    .line 1878
    :cond_3a
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1879
    .line 1880
    .line 1881
    move-result v10

    .line 1882
    if-eqz v10, :cond_3b

    .line 1883
    .line 1884
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1885
    .line 1886
    .line 1887
    move-result-object v10

    .line 1888
    check-cast v10, La/d0t;

    .line 1889
    .line 1890
    iget-object v10, v10, La/d0t;->K:Ljava/util/List;

    .line 1891
    .line 1892
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 1893
    .line 1894
    .line 1895
    move-result v10

    .line 1896
    if-nez v10, :cond_3a

    .line 1897
    .line 1898
    goto :goto_2b

    .line 1899
    :cond_3b
    :goto_29
    sget-object v9, La/i5l0;->a:La/i5l0;

    .line 1900
    .line 1901
    :goto_2a
    move-object/from16 v32, v9

    .line 1902
    .line 1903
    goto :goto_2c

    .line 1904
    :cond_3c
    :goto_2b
    sget-object v9, La/l5l0;->a:La/l5l0;

    .line 1905
    .line 1906
    goto :goto_2a

    .line 1907
    :goto_2c
    if-eqz v2, :cond_3d

    .line 1908
    .line 1909
    iget-object v2, v2, La/lok0;->u:Ljava/lang/String;

    .line 1910
    .line 1911
    goto :goto_2d

    .line 1912
    :cond_3d
    const/4 v2, 0x0

    .line 1913
    :goto_2d
    if-nez v2, :cond_3e

    .line 1914
    .line 1915
    move-object/from16 v33, v19

    .line 1916
    .line 1917
    :goto_2e
    move-object/from16 v20, v5

    .line 1918
    .line 1919
    move-object/from16 v27, v7

    .line 1920
    .line 1921
    goto :goto_2f

    .line 1922
    :cond_3e
    move-object/from16 v33, v2

    .line 1923
    .line 1924
    goto :goto_2e

    .line 1925
    :goto_2f
    invoke-static/range {v20 .. v34}, La/wwb;->V(La/d0t;La/ctf0;La/y78;ZZLjava/lang/String;ZLjava/util/List;ZZZLa/v5l0;La/m5l0;Ljava/lang/String;Z)La/a2n;

    .line 1926
    .line 1927
    .line 1928
    move-result-object v2

    .line 1929
    move/from16 v5, v34

    .line 1930
    .line 1931
    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1932
    .line 1933
    .line 1934
    move-object/from16 v10, v18

    .line 1935
    .line 1936
    move-object/from16 v2, v40

    .line 1937
    .line 1938
    move-object/from16 v9, v41

    .line 1939
    .line 1940
    goto/16 :goto_23

    .line 1941
    .line 1942
    :cond_3f
    move-object/from16 v18, v10

    .line 1943
    .line 1944
    move/from16 v5, v34

    .line 1945
    .line 1946
    invoke-static {v15}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1947
    .line 1948
    .line 1949
    move-result-object v2

    .line 1950
    new-instance v7, La/vb90;

    .line 1951
    .line 1952
    const/4 v10, 0x1

    .line 1953
    invoke-direct {v7, v3, v2, v10, v5}, La/vb90;-><init>(La/q0s;La/a4x;ZZ)V

    .line 1954
    .line 1955
    .line 1956
    move-object/from16 v27, v7

    .line 1957
    .line 1958
    move-wide/from16 v28, v12

    .line 1959
    .line 1960
    move-object/from16 v24, v36

    .line 1961
    .line 1962
    move-object/from16 v25, v37

    .line 1963
    .line 1964
    move-object/from16 v26, v39

    .line 1965
    .line 1966
    invoke-direct/range {v24 .. v29}, La/vqv;-><init>(Ljava/lang/String;La/brv;La/vb90;J)V

    .line 1967
    .line 1968
    .line 1969
    move-object/from16 v2, v24

    .line 1970
    .line 1971
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1972
    .line 1973
    .line 1974
    move/from16 v7, p1

    .line 1975
    .line 1976
    move-object/from16 v10, v18

    .line 1977
    .line 1978
    move-object/from16 v3, v19

    .line 1979
    .line 1980
    move-object/from16 v5, v35

    .line 1981
    .line 1982
    move-object/from16 v2, v38

    .line 1983
    .line 1984
    goto/16 :goto_22

    .line 1985
    .line 1986
    :cond_40
    invoke-static {}, La/q3d;->p()V

    .line 1987
    .line 1988
    .line 1989
    const/16 v16, 0x0

    .line 1990
    .line 1991
    throw v16

    .line 1992
    :cond_41
    invoke-static {v4}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1993
    .line 1994
    .line 1995
    move-result-object v2

    .line 1996
    invoke-direct {v14, v0, v1, v2, v8}, La/yqv;-><init>(Ljava/lang/String;La/esv;La/a4x;La/sip;)V

    .line 1997
    .line 1998
    .line 1999
    invoke-static {v14}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 2000
    .line 2001
    .line 2002
    move-result-object v0

    .line 2003
    :goto_30
    return-object v0

    .line 2004
    :pswitch_6
    move-object/from16 v1, p1

    .line 2005
    .line 2006
    check-cast v1, La/fee;

    .line 2007
    .line 2008
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2009
    .line 2010
    .line 2011
    new-instance v2, La/gkw;

    .line 2012
    .line 2013
    iget-object v0, v0, La/mco;->e:La/zjw;

    .line 2014
    .line 2015
    iget-boolean v3, v0, La/zjw;->f:Z

    .line 2016
    .line 2017
    const/16 v17, 0x1

    .line 2018
    .line 2019
    xor-int/lit8 v3, v3, 0x1

    .line 2020
    .line 2021
    iget-object v0, v0, La/zjw;->a:Ljava/util/List;

    .line 2022
    .line 2023
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 2024
    .line 2025
    .line 2026
    move-result-object v4

    .line 2027
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 2028
    .line 2029
    .line 2030
    move-result-object v0

    .line 2031
    move-object v5, v0

    .line 2032
    check-cast v5, La/ekw;

    .line 2033
    .line 2034
    const/4 v8, 0x0

    .line 2035
    sget-object v9, La/axh0;->a:La/axh0;

    .line 2036
    .line 2037
    const/4 v6, 0x0

    .line 2038
    const/4 v7, 0x0

    .line 2039
    invoke-direct/range {v2 .. v9}, La/gkw;-><init>(ZLa/a4x;La/ekw;ZZZLa/dxh0;)V

    .line 2040
    .line 2041
    .line 2042
    return-object v2

    .line 2043
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
