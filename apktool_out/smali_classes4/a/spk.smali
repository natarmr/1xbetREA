.class public abstract La/spk;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(La/btk;La/y78;La/ctf0;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;ZZLa/sff0;ZLjava/util/List;Z)La/lc00;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    move-object/from16 v1, p3

    .line 6
    .line 7
    move-object/from16 v3, p6

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual/range {p8 .. p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    iget-object v5, v0, La/btk;->a:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    if-nez v6, :cond_11

    .line 29
    .line 30
    new-instance v6, La/nuj;

    .line 31
    .line 32
    if-eqz p7, :cond_0

    .line 33
    .line 34
    const-string v7, "HEADER_LIVE_GAMES"

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const-string v7, "HEADER_LINE_GAMES"

    .line 38
    .line 39
    :goto_0
    const/4 v8, 0x0

    .line 40
    const v9, 0x7f1300e4

    .line 41
    .line 42
    .line 43
    if-eqz p7, :cond_1

    .line 44
    .line 45
    new-instance v10, La/hjm;

    .line 46
    .line 47
    new-array v11, v8, [Ljava/lang/Object;

    .line 48
    .line 49
    iget-object v12, v2, La/ctf0;->b:La/lsm0;

    .line 50
    .line 51
    invoke-static {v11, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v11

    .line 55
    const v13, 0x7f1305fc

    .line 56
    .line 57
    .line 58
    invoke-virtual {v12, v13, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v11

    .line 62
    new-instance v13, La/ue9;

    .line 63
    .line 64
    new-array v14, v8, [Ljava/lang/Object;

    .line 65
    .line 66
    invoke-static {v14, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v14

    .line 70
    invoke-virtual {v12, v9, v14}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v9

    .line 74
    invoke-direct {v13, v9}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const/16 v22, 0x0

    .line 78
    .line 79
    const/16 v23, 0x1bbe

    .line 80
    .line 81
    const/4 v12, 0x0

    .line 82
    move-object/from16 v21, v13

    .line 83
    .line 84
    const/4 v13, 0x0

    .line 85
    const/4 v14, 0x0

    .line 86
    const/4 v15, 0x0

    .line 87
    const/16 v16, 0x0

    .line 88
    .line 89
    const/16 v17, 0x1

    .line 90
    .line 91
    const/16 v18, 0x0

    .line 92
    .line 93
    const/16 v19, 0x0

    .line 94
    .line 95
    const/16 v20, 0x0

    .line 96
    .line 97
    invoke-direct/range {v10 .. v23}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_1
    new-instance v11, La/hjm;

    .line 102
    .line 103
    new-array v10, v8, [Ljava/lang/Object;

    .line 104
    .line 105
    iget-object v12, v2, La/ctf0;->b:La/lsm0;

    .line 106
    .line 107
    invoke-static {v10, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v10

    .line 111
    const v13, 0x7f130fd3

    .line 112
    .line 113
    .line 114
    invoke-virtual {v12, v13, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    new-instance v13, La/ue9;

    .line 119
    .line 120
    new-array v14, v8, [Ljava/lang/Object;

    .line 121
    .line 122
    invoke-static {v14, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v14

    .line 126
    invoke-virtual {v12, v9, v14}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v9

    .line 130
    invoke-direct {v13, v9}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    const/16 v23, 0x0

    .line 134
    .line 135
    const/16 v24, 0x1bbe

    .line 136
    .line 137
    move-object/from16 v22, v13

    .line 138
    .line 139
    const/4 v13, 0x0

    .line 140
    const/4 v14, 0x0

    .line 141
    const/4 v15, 0x0

    .line 142
    const/16 v16, 0x0

    .line 143
    .line 144
    const/16 v17, 0x0

    .line 145
    .line 146
    const/16 v18, 0x0

    .line 147
    .line 148
    const/16 v19, 0x0

    .line 149
    .line 150
    const/16 v20, 0x0

    .line 151
    .line 152
    const/16 v21, 0x0

    .line 153
    .line 154
    move-object v12, v10

    .line 155
    invoke-direct/range {v11 .. v24}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 156
    .line 157
    .line 158
    move-object v10, v11

    .line 159
    :goto_1
    invoke-direct {v6, v7, v10}, La/nuj;-><init>(Ljava/lang/String;La/jjm;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v4, v6}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    iget-object v6, v3, La/sff0;->g:La/mum0;

    .line 166
    .line 167
    iget-object v12, v6, La/mum0;->y:La/v5l0;

    .line 168
    .line 169
    sget-object v6, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 170
    .line 171
    invoke-virtual {v1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v6

    .line 175
    if-eqz v6, :cond_2

    .line 176
    .line 177
    sget-object v6, La/q0s;->a:La/q0s;

    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_2
    sget-object v6, La/q0s;->b:La/q0s;

    .line 181
    .line 182
    :goto_2
    new-instance v7, Ljava/util/ArrayList;

    .line 183
    .line 184
    const/16 v9, 0xa

    .line 185
    .line 186
    invoke-static {v5, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 187
    .line 188
    .line 189
    move-result v10

    .line 190
    invoke-direct {v7, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 191
    .line 192
    .line 193
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 194
    .line 195
    .line 196
    move-result-object v16

    .line 197
    :goto_3
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 198
    .line 199
    .line 200
    move-result v5

    .line 201
    if-eqz v5, :cond_f

    .line 202
    .line 203
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    check-cast v5, La/d0t;

    .line 208
    .line 209
    invoke-interface/range {p8 .. p8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 210
    .line 211
    .line 212
    move-result-object v10

    .line 213
    :cond_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 214
    .line 215
    .line 216
    move-result v11

    .line 217
    if-eqz v11, :cond_4

    .line 218
    .line 219
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v11

    .line 223
    move-object v14, v11

    .line 224
    check-cast v14, La/lok0;

    .line 225
    .line 226
    iget v14, v14, La/lok0;->a:I

    .line 227
    .line 228
    iget v15, v5, La/d0t;->O:I

    .line 229
    .line 230
    if-ne v14, v15, :cond_3

    .line 231
    .line 232
    goto :goto_4

    .line 233
    :cond_4
    const/4 v11, 0x0

    .line 234
    :goto_4
    check-cast v11, La/lok0;

    .line 235
    .line 236
    iget-boolean v10, v3, La/sff0;->J:Z

    .line 237
    .line 238
    move-object v14, v6

    .line 239
    iget-object v6, v0, La/btk;->b:Ljava/lang/String;

    .line 240
    .line 241
    sget-object v15, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 242
    .line 243
    invoke-virtual {v1, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v15

    .line 247
    move/from16 v17, v8

    .line 248
    .line 249
    new-instance v8, Ljava/util/ArrayList;

    .line 250
    .line 251
    move-object/from16 v0, p8

    .line 252
    .line 253
    invoke-static {v0, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 254
    .line 255
    .line 256
    move-result v13

    .line 257
    invoke-direct {v8, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 258
    .line 259
    .line 260
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 261
    .line 262
    .line 263
    move-result-object v13

    .line 264
    :goto_5
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 265
    .line 266
    .line 267
    move-result v19

    .line 268
    if-eqz v19, :cond_5

    .line 269
    .line 270
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v19

    .line 274
    move-object/from16 v9, v19

    .line 275
    .line 276
    check-cast v9, La/lok0;

    .line 277
    .line 278
    iget v9, v9, La/lok0;->a:I

    .line 279
    .line 280
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 281
    .line 282
    .line 283
    move-result-object v9

    .line 284
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    const/16 v9, 0xa

    .line 288
    .line 289
    goto :goto_5

    .line 290
    :cond_5
    if-eqz v11, :cond_6

    .line 291
    .line 292
    iget-boolean v9, v11, La/lok0;->n:Z

    .line 293
    .line 294
    goto :goto_6

    .line 295
    :cond_6
    move/from16 v9, v17

    .line 296
    .line 297
    :goto_6
    if-eqz v11, :cond_7

    .line 298
    .line 299
    iget-boolean v13, v11, La/lok0;->p:Z

    .line 300
    .line 301
    goto :goto_7

    .line 302
    :cond_7
    move/from16 v13, v17

    .line 303
    .line 304
    :goto_7
    iget-object v0, v5, La/d0t;->K:Ljava/util/List;

    .line 305
    .line 306
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    if-eqz v0, :cond_b

    .line 311
    .line 312
    iget-object v0, v5, La/d0t;->k:Ljava/util/List;

    .line 313
    .line 314
    if-eqz v0, :cond_8

    .line 315
    .line 316
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 317
    .line 318
    .line 319
    move-result v19

    .line 320
    if-eqz v19, :cond_8

    .line 321
    .line 322
    goto :goto_9

    .line 323
    :cond_8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 328
    .line 329
    .line 330
    move-result v19

    .line 331
    if-eqz v19, :cond_a

    .line 332
    .line 333
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v19

    .line 337
    move-object/from16 v21, v0

    .line 338
    .line 339
    move-object/from16 v0, v19

    .line 340
    .line 341
    check-cast v0, La/d0t;

    .line 342
    .line 343
    iget-object v0, v0, La/d0t;->K:Ljava/util/List;

    .line 344
    .line 345
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 346
    .line 347
    .line 348
    move-result v0

    .line 349
    if-nez v0, :cond_9

    .line 350
    .line 351
    goto :goto_a

    .line 352
    :cond_9
    move-object/from16 v0, v21

    .line 353
    .line 354
    goto :goto_8

    .line 355
    :cond_a
    :goto_9
    sget-object v0, La/i5l0;->a:La/i5l0;

    .line 356
    .line 357
    goto :goto_b

    .line 358
    :cond_b
    :goto_a
    if-eqz p4, :cond_c

    .line 359
    .line 360
    sget-object v0, La/k5l0;->a:La/k5l0;

    .line 361
    .line 362
    goto :goto_b

    .line 363
    :cond_c
    sget-object v0, La/l5l0;->a:La/l5l0;

    .line 364
    .line 365
    :goto_b
    if-eqz v11, :cond_d

    .line 366
    .line 367
    iget-object v11, v11, La/lok0;->u:Ljava/lang/String;

    .line 368
    .line 369
    goto :goto_c

    .line 370
    :cond_d
    const/4 v11, 0x0

    .line 371
    :goto_c
    if-nez v11, :cond_e

    .line 372
    .line 373
    const-string v11, ""

    .line 374
    .line 375
    :cond_e
    const/16 v18, 0x0

    .line 376
    .line 377
    move-object v1, v14

    .line 378
    move-object v14, v11

    .line 379
    move/from16 v11, v18

    .line 380
    .line 381
    move-object/from16 v18, v1

    .line 382
    .line 383
    move-object/from16 v3, p1

    .line 384
    .line 385
    move-object v1, v5

    .line 386
    move v5, v10

    .line 387
    move v10, v13

    .line 388
    move/from16 v19, v17

    .line 389
    .line 390
    const/16 v20, 0xa

    .line 391
    .line 392
    move-object v13, v0

    .line 393
    move-object/from16 v17, v4

    .line 394
    .line 395
    move-object v0, v7

    .line 396
    move v7, v15

    .line 397
    move/from16 v4, p5

    .line 398
    .line 399
    move/from16 v15, p9

    .line 400
    .line 401
    invoke-static/range {v1 .. v15}, La/wwb;->V(La/d0t;La/ctf0;La/y78;ZZLjava/lang/String;ZLjava/util/List;ZZZLa/v5l0;La/m5l0;Ljava/lang/String;Z)La/a2n;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 406
    .line 407
    .line 408
    move-object/from16 v2, p2

    .line 409
    .line 410
    move-object/from16 v1, p3

    .line 411
    .line 412
    move-object/from16 v3, p6

    .line 413
    .line 414
    move-object v7, v0

    .line 415
    move-object/from16 v4, v17

    .line 416
    .line 417
    move-object/from16 v6, v18

    .line 418
    .line 419
    move/from16 v8, v19

    .line 420
    .line 421
    move/from16 v9, v20

    .line 422
    .line 423
    move-object/from16 v0, p0

    .line 424
    .line 425
    goto/16 :goto_3

    .line 426
    .line 427
    :cond_f
    move-object/from16 v17, v4

    .line 428
    .line 429
    move-object/from16 v18, v6

    .line 430
    .line 431
    move-object v0, v7

    .line 432
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    new-instance v1, La/vb90;

    .line 437
    .line 438
    const/4 v2, 0x1

    .line 439
    move/from16 v15, p9

    .line 440
    .line 441
    move-object/from16 v14, v18

    .line 442
    .line 443
    invoke-direct {v1, v14, v0, v2, v15}, La/vb90;-><init>(La/q0s;La/a4x;ZZ)V

    .line 444
    .line 445
    .line 446
    new-instance v0, La/kuj;

    .line 447
    .line 448
    if-eqz p7, :cond_10

    .line 449
    .line 450
    const-string v2, "LIVE_GAMES"

    .line 451
    .line 452
    goto :goto_d

    .line 453
    :cond_10
    const-string v2, "LINE_GAMES"

    .line 454
    .line 455
    :goto_d
    invoke-direct {v0, v2, v1}, La/kuj;-><init>(Ljava/lang/String;La/vb90;)V

    .line 456
    .line 457
    .line 458
    move-object/from16 v1, v17

    .line 459
    .line 460
    invoke-virtual {v1, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    goto :goto_e

    .line 464
    :cond_11
    move-object v1, v4

    .line 465
    :goto_e
    invoke-static {v1}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    return-object v0
.end method
