.class public final synthetic La/ig0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/jg0;


# direct methods
.method public synthetic constructor <init>(La/jg0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ig0;->a:B

    iput-object p1, p0, La/ig0;->b:La/jg0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ig0;->a:B

    .line 4
    .line 5
    const-string v4, "/"

    .line 6
    .line 7
    const-string v5, "https://"

    .line 8
    .line 9
    sget-object v7, La/zjl;->a:La/zjl;

    .line 10
    .line 11
    const/4 v9, 0x0

    .line 12
    const/16 v10, 0xa

    .line 13
    .line 14
    const/4 v11, 0x0

    .line 15
    iget-object v0, v0, La/ig0;->b:La/jg0;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    iget-object v1, v0, La/jg0;->b:La/n0o0;

    .line 21
    .line 22
    iget-object v2, v0, La/jg0;->a:La/ctf0;

    .line 23
    .line 24
    move-object/from16 v3, p1

    .line 25
    .line 26
    check-cast v3, Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_7

    .line 33
    .line 34
    iget-object v0, v0, La/jg0;->j:La/n0o0;

    .line 35
    .line 36
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, La/fee;

    .line 41
    .line 42
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, La/ql5;

    .line 47
    .line 48
    const-string v3, ""

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    iget-object v4, v0, La/ql5;->j:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    check-cast v5, La/fee;

    .line 59
    .line 60
    invoke-virtual {v5}, La/fee;->c()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    check-cast v5, La/kg;

    .line 65
    .line 66
    sget-object v6, La/kg;->c:La/kg;

    .line 67
    .line 68
    if-ne v5, v6, :cond_0

    .line 69
    .line 70
    new-array v4, v11, [Ljava/lang/Object;

    .line 71
    .line 72
    iget-object v5, v2, La/ctf0;->b:La/lsm0;

    .line 73
    .line 74
    invoke-static {v4, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    const v6, 0x7f1300e5

    .line 79
    .line 80
    .line 81
    invoke-virtual {v5, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    goto :goto_0

    .line 86
    :cond_0
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-lez v5, :cond_1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_1
    iget-object v4, v0, La/ql5;->k:Ljava/lang/String;

    .line 94
    .line 95
    :goto_0
    move-object/from16 v16, v4

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_2
    move-object/from16 v16, v3

    .line 99
    .line 100
    :goto_1
    if-eqz v0, :cond_3

    .line 101
    .line 102
    iget-wide v4, v0, La/ql5;->b:D

    .line 103
    .line 104
    sget-object v6, La/pn40;->a:La/pn40;

    .line 105
    .line 106
    sget-object v6, La/p3u0;->c:La/p3u0;

    .line 107
    .line 108
    invoke-static {v4, v5, v6}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    goto :goto_2

    .line 113
    :cond_3
    move-object v4, v9

    .line 114
    :goto_2
    if-nez v4, :cond_4

    .line 115
    .line 116
    move-object v13, v3

    .line 117
    goto :goto_3

    .line 118
    :cond_4
    move-object v13, v4

    .line 119
    :goto_3
    if-eqz v0, :cond_5

    .line 120
    .line 121
    iget-object v9, v0, La/ql5;->f:Ljava/lang/String;

    .line 122
    .line 123
    :cond_5
    if-nez v9, :cond_6

    .line 124
    .line 125
    move-object v14, v3

    .line 126
    goto :goto_4

    .line 127
    :cond_6
    move-object v14, v9

    .line 128
    :goto_4
    new-array v0, v11, [Ljava/lang/Object;

    .line 129
    .line 130
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 131
    .line 132
    invoke-static {v0, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    const v3, 0x7f1315e0

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2, v3, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v15

    .line 143
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 144
    .line 145
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 146
    .line 147
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 148
    .line 149
    .line 150
    move-result-wide v2

    .line 151
    new-instance v0, La/y3d;

    .line 152
    .line 153
    invoke-direct {v0, v2, v3}, La/y3d;-><init>(J)V

    .line 154
    .line 155
    .line 156
    new-instance v12, La/jjl;

    .line 157
    .line 158
    move-object/from16 v17, v0

    .line 159
    .line 160
    invoke-direct/range {v12 .. v17}, La/jjl;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/y3d;)V

    .line 161
    .line 162
    .line 163
    new-instance v0, La/wa0;

    .line 164
    .line 165
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    check-cast v1, La/fee;

    .line 170
    .line 171
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    check-cast v1, La/ijl;

    .line 176
    .line 177
    invoke-direct {v0, v1, v12}, La/wa0;-><init>(La/ijl;La/jjl;)V

    .line 178
    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_7
    new-instance v0, La/xa0;

    .line 182
    .line 183
    new-array v1, v11, [Ljava/lang/Object;

    .line 184
    .line 185
    iget-object v3, v2, La/ctf0;->b:La/lsm0;

    .line 186
    .line 187
    invoke-static {v1, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    const v4, 0x7f1302fa

    .line 192
    .line 193
    .line 194
    invoke-virtual {v3, v4, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    new-array v3, v11, [Ljava/lang/Object;

    .line 199
    .line 200
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 201
    .line 202
    invoke-static {v3, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    const v4, 0x7f13112e

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    invoke-direct {v0, v1, v2}, La/xa0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    :goto_5
    return-object v0

    .line 217
    :pswitch_0
    move-object/from16 v1, p1

    .line 218
    .line 219
    check-cast v1, Lkotlin/Pair;

    .line 220
    .line 221
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    iget-object v9, v1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v9, Ljava/lang/Boolean;

    .line 227
    .line 228
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 229
    .line 230
    .line 231
    move-result v9

    .line 232
    iget-object v1, v1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v1, Ljava/util/List;

    .line 235
    .line 236
    iget-object v12, v0, La/jg0;->e:La/cc0;

    .line 237
    .line 238
    if-eqz v9, :cond_8

    .line 239
    .line 240
    goto/16 :goto_a

    .line 241
    .line 242
    :cond_8
    new-instance v7, Ljava/util/ArrayList;

    .line 243
    .line 244
    invoke-static {v1, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 245
    .line 246
    .line 247
    move-result v9

    .line 248
    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 249
    .line 250
    .line 251
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 256
    .line 257
    .line 258
    move-result v9

    .line 259
    if-eqz v9, :cond_d

    .line 260
    .line 261
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v9

    .line 265
    check-cast v9, La/yp1;

    .line 266
    .line 267
    iget-object v10, v0, La/jg0;->a:La/ctf0;

    .line 268
    .line 269
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    iget-wide v14, v9, La/yp1;->a:J

    .line 276
    .line 277
    iget-object v13, v9, La/yp1;->b:Ljava/lang/String;

    .line 278
    .line 279
    iget-object v2, v9, La/yp1;->c:Ljava/lang/String;

    .line 280
    .line 281
    new-instance v3, La/n0x;

    .line 282
    .line 283
    new-instance v8, Ljava/lang/StringBuilder;

    .line 284
    .line 285
    sget-object v6, La/ujn;->h:Ljava/lang/String;

    .line 286
    .line 287
    invoke-direct {v8, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    iget-object v6, v9, La/yp1;->d:Ljava/lang/String;

    .line 291
    .line 292
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 293
    .line 294
    .line 295
    move-result v9

    .line 296
    if-nez v9, :cond_9

    .line 297
    .line 298
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 299
    .line 300
    .line 301
    move v9, v11

    .line 302
    goto :goto_9

    .line 303
    :cond_9
    sget-object v9, La/ujn;->h:Ljava/lang/String;

    .line 304
    .line 305
    invoke-static {v6, v9, v11}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 306
    .line 307
    .line 308
    move-result v9

    .line 309
    if-nez v9, :cond_a

    .line 310
    .line 311
    invoke-static {v6, v5, v11}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 312
    .line 313
    .line 314
    move-result v9

    .line 315
    if-eqz v9, :cond_b

    .line 316
    .line 317
    :cond_a
    move v9, v11

    .line 318
    goto :goto_8

    .line 319
    :cond_b
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->length()I

    .line 320
    .line 321
    .line 322
    move-result v9

    .line 323
    if-lez v9, :cond_c

    .line 324
    .line 325
    invoke-static {v8, v4}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 326
    .line 327
    .line 328
    move-result v9

    .line 329
    if-nez v9, :cond_c

    .line 330
    .line 331
    const/16 v9, 0x2f

    .line 332
    .line 333
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    move/from16 v22, v9

    .line 337
    .line 338
    move/from16 v23, v11

    .line 339
    .line 340
    const/4 v9, 0x1

    .line 341
    goto :goto_7

    .line 342
    :cond_c
    move/from16 v23, v11

    .line 343
    .line 344
    const/4 v9, 0x1

    .line 345
    const/16 v22, 0x2f

    .line 346
    .line 347
    :goto_7
    new-array v11, v9, [C

    .line 348
    .line 349
    aput-char v22, v11, v23

    .line 350
    .line 351
    invoke-static {v6, v11}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v6

    .line 355
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    move/from16 v9, v23

    .line 359
    .line 360
    goto :goto_9

    .line 361
    :goto_8
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 365
    .line 366
    .line 367
    :goto_9
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v6

    .line 371
    invoke-direct {v3, v6}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    new-array v6, v9, [Ljava/lang/Object;

    .line 375
    .line 376
    iget-object v8, v10, La/ctf0;->b:La/lsm0;

    .line 377
    .line 378
    invoke-static {v6, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v6

    .line 382
    const v10, 0x7f1300ce

    .line 383
    .line 384
    .line 385
    invoke-virtual {v8, v10, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v19

    .line 389
    new-array v6, v9, [Ljava/lang/Object;

    .line 390
    .line 391
    invoke-static {v6, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v6

    .line 395
    const v9, 0x7f1300cd

    .line 396
    .line 397
    .line 398
    invoke-virtual {v8, v9, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v20

    .line 402
    move-object/from16 v17, v13

    .line 403
    .line 404
    new-instance v13, La/bkl;

    .line 405
    .line 406
    move-object/from16 v18, v2

    .line 407
    .line 408
    move-object/from16 v16, v3

    .line 409
    .line 410
    invoke-direct/range {v13 .. v20}, La/bkl;-><init>(JLa/n0x;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    const/4 v11, 0x0

    .line 417
    goto/16 :goto_6

    .line 418
    .line 419
    :cond_d
    invoke-static {v7}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    new-instance v7, La/yjl;

    .line 424
    .line 425
    invoke-direct {v7, v0}, La/yjl;-><init>(La/i4;)V

    .line 426
    .line 427
    .line 428
    :goto_a
    new-instance v0, La/b3b;

    .line 429
    .line 430
    invoke-direct {v0, v12, v7}, La/b3b;-><init>(La/cc0;La/akl;)V

    .line 431
    .line 432
    .line 433
    return-object v0

    .line 434
    :pswitch_1
    move-object/from16 v1, p1

    .line 435
    .line 436
    check-cast v1, Lkotlin/Pair;

    .line 437
    .line 438
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    iget-object v2, v1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast v2, Ljava/lang/Boolean;

    .line 444
    .line 445
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 446
    .line 447
    .line 448
    move-result v2

    .line 449
    iget-object v1, v1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 450
    .line 451
    check-cast v1, La/a4x;

    .line 452
    .line 453
    iget-object v3, v0, La/jg0;->e:La/cc0;

    .line 454
    .line 455
    if-eqz v2, :cond_e

    .line 456
    .line 457
    goto/16 :goto_10

    .line 458
    .line 459
    :cond_e
    new-instance v2, Ljava/util/ArrayList;

    .line 460
    .line 461
    invoke-static {v1, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 462
    .line 463
    .line 464
    move-result v6

    .line 465
    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 466
    .line 467
    .line 468
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 469
    .line 470
    .line 471
    move-result-object v1

    .line 472
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 473
    .line 474
    .line 475
    move-result v6

    .line 476
    if-eqz v6, :cond_13

    .line 477
    .line 478
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v6

    .line 482
    check-cast v6, La/vh0;

    .line 483
    .line 484
    iget-object v7, v0, La/jg0;->a:La/ctf0;

    .line 485
    .line 486
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 490
    .line 491
    .line 492
    iget-wide v9, v6, La/vh0;->a:J

    .line 493
    .line 494
    iget-object v12, v6, La/vh0;->b:Ljava/lang/String;

    .line 495
    .line 496
    iget-object v13, v6, La/vh0;->k:Ljava/lang/String;

    .line 497
    .line 498
    new-instance v11, La/n0x;

    .line 499
    .line 500
    new-instance v8, Ljava/lang/StringBuilder;

    .line 501
    .line 502
    sget-object v14, La/ujn;->h:Ljava/lang/String;

    .line 503
    .line 504
    invoke-direct {v8, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    iget-object v6, v6, La/vh0;->d:Ljava/lang/String;

    .line 508
    .line 509
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 510
    .line 511
    .line 512
    move-result v14

    .line 513
    if-nez v14, :cond_f

    .line 514
    .line 515
    const/4 v14, 0x0

    .line 516
    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 517
    .line 518
    .line 519
    move v15, v14

    .line 520
    const/16 v22, 0x2f

    .line 521
    .line 522
    goto :goto_f

    .line 523
    :cond_f
    const/4 v14, 0x0

    .line 524
    sget-object v15, La/ujn;->h:Ljava/lang/String;

    .line 525
    .line 526
    invoke-static {v6, v15, v14}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 527
    .line 528
    .line 529
    move-result v15

    .line 530
    if-nez v15, :cond_12

    .line 531
    .line 532
    invoke-static {v6, v5, v14}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 533
    .line 534
    .line 535
    move-result v15

    .line 536
    if-eqz v15, :cond_10

    .line 537
    .line 538
    const/4 v15, 0x0

    .line 539
    :goto_c
    const/16 v22, 0x2f

    .line 540
    .line 541
    goto :goto_e

    .line 542
    :cond_10
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->length()I

    .line 543
    .line 544
    .line 545
    move-result v14

    .line 546
    if-lez v14, :cond_11

    .line 547
    .line 548
    invoke-static {v8, v4}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 549
    .line 550
    .line 551
    move-result v14

    .line 552
    if-nez v14, :cond_11

    .line 553
    .line 554
    const/16 v14, 0x2f

    .line 555
    .line 556
    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 557
    .line 558
    .line 559
    move/from16 v22, v14

    .line 560
    .line 561
    const/4 v15, 0x1

    .line 562
    goto :goto_d

    .line 563
    :cond_11
    const/4 v15, 0x1

    .line 564
    const/16 v22, 0x2f

    .line 565
    .line 566
    :goto_d
    new-array v14, v15, [C

    .line 567
    .line 568
    const/4 v15, 0x0

    .line 569
    aput-char v22, v14, v15

    .line 570
    .line 571
    invoke-static {v6, v14}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object v6

    .line 575
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 576
    .line 577
    .line 578
    goto :goto_f

    .line 579
    :cond_12
    move v15, v14

    .line 580
    goto :goto_c

    .line 581
    :goto_e
    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 582
    .line 583
    .line 584
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 585
    .line 586
    .line 587
    :goto_f
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object v6

    .line 591
    invoke-direct {v11, v6}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 592
    .line 593
    .line 594
    new-array v6, v15, [Ljava/lang/Object;

    .line 595
    .line 596
    iget-object v7, v7, La/ctf0;->b:La/lsm0;

    .line 597
    .line 598
    invoke-static {v6, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v6

    .line 602
    const v8, 0x7f1300ce

    .line 603
    .line 604
    .line 605
    invoke-virtual {v7, v8, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v14

    .line 609
    new-array v6, v15, [Ljava/lang/Object;

    .line 610
    .line 611
    invoke-static {v6, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v6

    .line 615
    move-object/from16 p0, v1

    .line 616
    .line 617
    const v1, 0x7f1300cd

    .line 618
    .line 619
    .line 620
    invoke-virtual {v7, v1, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 621
    .line 622
    .line 623
    move-result-object v6

    .line 624
    move/from16 v21, v8

    .line 625
    .line 626
    new-instance v8, La/bkl;

    .line 627
    .line 628
    move/from16 v23, v15

    .line 629
    .line 630
    move-object v15, v6

    .line 631
    invoke-direct/range {v8 .. v15}, La/bkl;-><init>(JLa/n0x;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 632
    .line 633
    .line 634
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 635
    .line 636
    .line 637
    move-object/from16 v1, p0

    .line 638
    .line 639
    goto/16 :goto_b

    .line 640
    .line 641
    :cond_13
    invoke-static {v2}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 642
    .line 643
    .line 644
    move-result-object v0

    .line 645
    new-instance v7, La/yjl;

    .line 646
    .line 647
    invoke-direct {v7, v0}, La/yjl;-><init>(La/i4;)V

    .line 648
    .line 649
    .line 650
    :goto_10
    new-instance v0, La/b3b;

    .line 651
    .line 652
    invoke-direct {v0, v3, v7}, La/b3b;-><init>(La/cc0;La/akl;)V

    .line 653
    .line 654
    .line 655
    return-object v0

    .line 656
    :pswitch_2
    move-object/from16 v1, p1

    .line 657
    .line 658
    check-cast v1, Lkotlin/Pair;

    .line 659
    .line 660
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 661
    .line 662
    .line 663
    iget-object v2, v1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 664
    .line 665
    check-cast v2, Ljava/lang/Boolean;

    .line 666
    .line 667
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 668
    .line 669
    .line 670
    move-result v2

    .line 671
    iget-object v1, v1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 672
    .line 673
    check-cast v1, La/a4x;

    .line 674
    .line 675
    iget-object v0, v0, La/jg0;->d:La/zh0;

    .line 676
    .line 677
    if-eqz v2, :cond_14

    .line 678
    .line 679
    sget-object v1, La/ci0;->a:La/ci0;

    .line 680
    .line 681
    goto :goto_12

    .line 682
    :cond_14
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 683
    .line 684
    .line 685
    move-result v2

    .line 686
    if-nez v2, :cond_16

    .line 687
    .line 688
    new-instance v2, Ljava/util/ArrayList;

    .line 689
    .line 690
    invoke-static {v1, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 691
    .line 692
    .line 693
    move-result v3

    .line 694
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 695
    .line 696
    .line 697
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 698
    .line 699
    .line 700
    move-result-object v1

    .line 701
    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 702
    .line 703
    .line 704
    move-result v3

    .line 705
    if-eqz v3, :cond_15

    .line 706
    .line 707
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 708
    .line 709
    .line 710
    move-result-object v3

    .line 711
    check-cast v3, La/vh0;

    .line 712
    .line 713
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 714
    .line 715
    .line 716
    new-instance v4, La/nh0;

    .line 717
    .line 718
    iget-wide v5, v3, La/vh0;->a:J

    .line 719
    .line 720
    iget-object v3, v3, La/vh0;->b:Ljava/lang/String;

    .line 721
    .line 722
    sget-object v7, La/u0d;->a:Ljava/util/List;

    .line 723
    .line 724
    sget-object v7, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 725
    .line 726
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 727
    .line 728
    .line 729
    move-result-object v8

    .line 730
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    move-result-object v8

    .line 734
    const/4 v15, 0x1

    .line 735
    invoke-static {v8, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 736
    .line 737
    .line 738
    move-result-object v8

    .line 739
    const-string v9, "/static/img/android/agregator/category/%d.svg"

    .line 740
    .line 741
    invoke-static {v7, v9, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 742
    .line 743
    .line 744
    move-result-object v7

    .line 745
    invoke-static {v7}, La/u0d;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 746
    .line 747
    .line 748
    move-result-object v7

    .line 749
    invoke-direct {v4, v5, v6, v3, v7}, La/nh0;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 750
    .line 751
    .line 752
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 753
    .line 754
    .line 755
    goto :goto_11

    .line 756
    :cond_15
    new-instance v9, La/bi0;

    .line 757
    .line 758
    invoke-direct {v9, v2}, La/bi0;-><init>(Ljava/util/ArrayList;)V

    .line 759
    .line 760
    .line 761
    :cond_16
    move-object v1, v9

    .line 762
    :goto_12
    new-instance v2, La/g3b;

    .line 763
    .line 764
    invoke-direct {v2, v0, v1}, La/g3b;-><init>(La/zh0;La/di0;)V

    .line 765
    .line 766
    .line 767
    return-object v2

    .line 768
    :pswitch_3
    move-object/from16 v1, p1

    .line 769
    .line 770
    check-cast v1, Lkotlin/Pair;

    .line 771
    .line 772
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 773
    .line 774
    .line 775
    iget-object v2, v1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 776
    .line 777
    check-cast v2, Ljava/lang/Boolean;

    .line 778
    .line 779
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 780
    .line 781
    .line 782
    move-result v2

    .line 783
    iget-object v1, v1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 784
    .line 785
    check-cast v1, Ljava/util/List;

    .line 786
    .line 787
    iget-object v0, v0, La/jg0;->c:La/lq5;

    .line 788
    .line 789
    if-eqz v2, :cond_17

    .line 790
    .line 791
    new-instance v9, La/oq5;

    .line 792
    .line 793
    invoke-direct {v9, v0}, La/oq5;-><init>(La/lq5;)V

    .line 794
    .line 795
    .line 796
    goto/16 :goto_18

    .line 797
    .line 798
    :cond_17
    new-instance v2, Ljava/util/ArrayList;

    .line 799
    .line 800
    invoke-static {v1, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 801
    .line 802
    .line 803
    move-result v3

    .line 804
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 805
    .line 806
    .line 807
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 808
    .line 809
    .line 810
    move-result-object v1

    .line 811
    :goto_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 812
    .line 813
    .line 814
    move-result v3

    .line 815
    if-eqz v3, :cond_1e

    .line 816
    .line 817
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 818
    .line 819
    .line 820
    move-result-object v3

    .line 821
    check-cast v3, La/lr5;

    .line 822
    .line 823
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 824
    .line 825
    .line 826
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 827
    .line 828
    .line 829
    new-instance v10, La/fr5;

    .line 830
    .line 831
    iget v11, v3, La/lr5;->a:I

    .line 832
    .line 833
    new-instance v12, La/n0x;

    .line 834
    .line 835
    sget-object v4, La/gq5;->a:La/gq5;

    .line 836
    .line 837
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 838
    .line 839
    .line 840
    move-result v4

    .line 841
    if-nez v4, :cond_1d

    .line 842
    .line 843
    sget-object v4, La/fq5;->a:La/fq5;

    .line 844
    .line 845
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 846
    .line 847
    .line 848
    move-result v4

    .line 849
    if-eqz v4, :cond_18

    .line 850
    .line 851
    goto :goto_16

    .line 852
    :cond_18
    sget-object v4, La/hq5;->a:La/hq5;

    .line 853
    .line 854
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 855
    .line 856
    .line 857
    move-result v4

    .line 858
    if-nez v4, :cond_1c

    .line 859
    .line 860
    sget-object v4, La/iq5;->a:La/iq5;

    .line 861
    .line 862
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 863
    .line 864
    .line 865
    move-result v4

    .line 866
    if-nez v4, :cond_1c

    .line 867
    .line 868
    sget-object v4, La/kq5;->a:La/kq5;

    .line 869
    .line 870
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 871
    .line 872
    .line 873
    move-result v4

    .line 874
    if-nez v4, :cond_1c

    .line 875
    .line 876
    instance-of v4, v0, La/jq5;

    .line 877
    .line 878
    if-eqz v4, :cond_19

    .line 879
    .line 880
    goto :goto_15

    .line 881
    :cond_19
    sget-object v4, La/dq5;->a:La/dq5;

    .line 882
    .line 883
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 884
    .line 885
    .line 886
    move-result v4

    .line 887
    if-nez v4, :cond_1b

    .line 888
    .line 889
    sget-object v4, La/eq5;->a:La/eq5;

    .line 890
    .line 891
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 892
    .line 893
    .line 894
    move-result v4

    .line 895
    if-nez v4, :cond_1b

    .line 896
    .line 897
    sget-object v4, La/cq5;->a:La/cq5;

    .line 898
    .line 899
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 900
    .line 901
    .line 902
    move-result v4

    .line 903
    if-eqz v4, :cond_1a

    .line 904
    .line 905
    goto :goto_14

    .line 906
    :cond_1a
    invoke-static {}, La/t9f;->b()V

    .line 907
    .line 908
    .line 909
    goto :goto_18

    .line 910
    :cond_1b
    :goto_14
    iget-object v4, v3, La/lr5;->d:Ljava/lang/String;

    .line 911
    .line 912
    goto :goto_17

    .line 913
    :cond_1c
    :goto_15
    iget-object v4, v3, La/lr5;->b:Ljava/lang/String;

    .line 914
    .line 915
    goto :goto_17

    .line 916
    :cond_1d
    :goto_16
    iget-object v4, v3, La/lr5;->c:Ljava/lang/String;

    .line 917
    .line 918
    :goto_17
    invoke-direct {v12, v4}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 919
    .line 920
    .line 921
    iget-object v14, v3, La/lr5;->e:Ljava/lang/String;

    .line 922
    .line 923
    iget-object v15, v3, La/lr5;->f:Ljava/lang/String;

    .line 924
    .line 925
    const/16 v16, 0x0

    .line 926
    .line 927
    const/16 v17, 0x44

    .line 928
    .line 929
    const/4 v13, 0x0

    .line 930
    invoke-direct/range {v10 .. v17}, La/fr5;-><init>(ILa/n0x;La/n0x;Ljava/lang/String;Ljava/lang/String;La/er5;I)V

    .line 931
    .line 932
    .line 933
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 934
    .line 935
    .line 936
    goto :goto_13

    .line 937
    :cond_1e
    invoke-static {v2}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 938
    .line 939
    .line 940
    move-result-object v1

    .line 941
    new-instance v9, La/nq5;

    .line 942
    .line 943
    invoke-direct {v9, v0, v1}, La/nq5;-><init>(La/lq5;La/i4;)V

    .line 944
    .line 945
    .line 946
    :goto_18
    return-object v9

    .line 947
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
