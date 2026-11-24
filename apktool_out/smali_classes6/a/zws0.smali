.class public final La/zws0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 30

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/16 v1, 0xa

    .line 7
    .line 8
    move-object/from16 v2, p2

    .line 9
    .line 10
    invoke-static {v2, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {v1}, La/wp20;->a(I)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/16 v3, 0x10

    .line 19
    .line 20
    if-ge v1, v3, :cond_0

    .line 21
    .line 22
    move v1, v3

    .line 23
    :cond_0
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 24
    .line 25
    invoke-direct {v3, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    move-object v4, v2

    .line 43
    check-cast v4, La/pj30;

    .line 44
    .line 45
    invoke-static {v4}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    sget-object v1, La/v8k0;->a:La/v8k0;

    .line 54
    .line 55
    invoke-virtual {v3, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, La/pj30;

    .line 60
    .line 61
    sget-object v2, La/t8k0;->a:La/t8k0;

    .line 62
    .line 63
    invoke-virtual {v3, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    check-cast v2, La/pj30;

    .line 68
    .line 69
    sget-object v4, La/r8k0;->a:La/r8k0;

    .line 70
    .line 71
    invoke-virtual {v3, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    check-cast v4, La/pj30;

    .line 76
    .line 77
    sget-object v5, La/g9k0;->a:La/g9k0;

    .line 78
    .line 79
    invoke-virtual {v3, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    check-cast v5, La/pj30;

    .line 84
    .line 85
    sget-object v6, La/a9k0;->a:La/a9k0;

    .line 86
    .line 87
    invoke-virtual {v3, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    check-cast v6, La/pj30;

    .line 92
    .line 93
    sget-object v7, La/c9k0;->a:La/c9k0;

    .line 94
    .line 95
    invoke-virtual {v3, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    check-cast v7, La/pj30;

    .line 100
    .line 101
    sget-object v8, La/e9k0;->a:La/e9k0;

    .line 102
    .line 103
    invoke-virtual {v3, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    check-cast v8, La/pj30;

    .line 108
    .line 109
    sget-object v9, La/p8k0;->a:La/p8k0;

    .line 110
    .line 111
    invoke-virtual {v3, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v9

    .line 115
    check-cast v9, La/pj30;

    .line 116
    .line 117
    sget-object v10, La/i9k0;->a:La/i9k0;

    .line 118
    .line 119
    invoke-virtual {v3, v10}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v10

    .line 123
    check-cast v10, La/pj30;

    .line 124
    .line 125
    sget-object v11, La/l9k0;->a:La/l9k0;

    .line 126
    .line 127
    invoke-virtual {v3, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    check-cast v3, La/pj30;

    .line 132
    .line 133
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 134
    .line 135
    .line 136
    move-result v11

    .line 137
    div-int/lit8 v22, v11, 0x2

    .line 138
    .line 139
    sget-object v11, La/qmk;->a:La/zcl;

    .line 140
    .line 141
    const/high16 v11, 0x42580000    # 54.0f

    .line 142
    .line 143
    invoke-interface {v0, v11}, La/w6k;->T(F)I

    .line 144
    .line 145
    .line 146
    move-result v11

    .line 147
    div-int/lit8 v21, v11, 0x2

    .line 148
    .line 149
    const/high16 v11, 0x41000000    # 8.0f

    .line 150
    .line 151
    invoke-interface {v0, v11}, La/w6k;->T(F)I

    .line 152
    .line 153
    .line 154
    move-result v23

    .line 155
    const/4 v11, 0x0

    .line 156
    if-eqz v5, :cond_5

    .line 157
    .line 158
    const/high16 v13, 0x42800000    # 64.0f

    .line 159
    .line 160
    invoke-interface {v0, v13}, La/w6k;->T(F)I

    .line 161
    .line 162
    .line 163
    move-result v13

    .line 164
    const/high16 v14, 0x41c00000    # 24.0f

    .line 165
    .line 166
    invoke-interface {v0, v14}, La/w6k;->T(F)I

    .line 167
    .line 168
    .line 169
    move-result v14

    .line 170
    const/4 v15, 0x1

    .line 171
    if-ltz v13, :cond_2

    .line 172
    .line 173
    move/from16 v16, v15

    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_2
    move/from16 v16, v11

    .line 177
    .line 178
    :goto_1
    if-ltz v14, :cond_3

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_3
    move v15, v11

    .line 182
    :goto_2
    and-int v15, v16, v15

    .line 183
    .line 184
    if-nez v15, :cond_4

    .line 185
    .line 186
    const-string v15, "width and height must be >= 0"

    .line 187
    .line 188
    invoke-static {v15}, La/zcx;->a(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    :cond_4
    invoke-static {v13, v13, v14, v14}, La/r4e;->h(IIII)J

    .line 192
    .line 193
    .line 194
    move-result-wide v13

    .line 195
    invoke-interface {v5, v13, v14}, La/pj30;->S(J)La/pu90;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    move-object v14, v5

    .line 200
    goto :goto_3

    .line 201
    :cond_5
    const/4 v14, 0x0

    .line 202
    :goto_3
    const/high16 v5, 0x42000000    # 32.0f

    .line 203
    .line 204
    invoke-interface {v0, v5}, La/w6k;->T(F)I

    .line 205
    .line 206
    .line 207
    move-result v13

    .line 208
    invoke-interface {v0, v5}, La/w6k;->T(F)I

    .line 209
    .line 210
    .line 211
    move-result v5

    .line 212
    invoke-static {v13, v5}, La/lgb;->P(II)J

    .line 213
    .line 214
    .line 215
    move-result-wide v12

    .line 216
    if-eqz v2, :cond_6

    .line 217
    .line 218
    invoke-interface {v2, v12, v13}, La/pj30;->S(J)La/pu90;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    move-object v15, v2

    .line 223
    goto :goto_4

    .line 224
    :cond_6
    const/4 v15, 0x0

    .line 225
    :goto_4
    if-eqz v7, :cond_7

    .line 226
    .line 227
    invoke-interface {v7, v12, v13}, La/pj30;->S(J)La/pu90;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    goto :goto_5

    .line 232
    :cond_7
    const/4 v2, 0x0

    .line 233
    :goto_5
    const/16 v5, 0xf

    .line 234
    .line 235
    if-eqz v4, :cond_8

    .line 236
    .line 237
    invoke-static {v11, v11, v11, v11, v5}, La/r4e;->b(IIIII)J

    .line 238
    .line 239
    .line 240
    move-result-wide v12

    .line 241
    invoke-interface {v4, v12, v13}, La/pj30;->S(J)La/pu90;

    .line 242
    .line 243
    .line 244
    move-result-object v4

    .line 245
    move-object/from16 v16, v4

    .line 246
    .line 247
    goto :goto_6

    .line 248
    :cond_8
    const/16 v16, 0x0

    .line 249
    .line 250
    :goto_6
    if-eqz v6, :cond_9

    .line 251
    .line 252
    invoke-static {v11, v11, v11, v11, v5}, La/r4e;->b(IIIII)J

    .line 253
    .line 254
    .line 255
    move-result-wide v4

    .line 256
    invoke-interface {v6, v4, v5}, La/pj30;->S(J)La/pu90;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    move-object/from16 v17, v4

    .line 261
    .line 262
    goto :goto_7

    .line 263
    :cond_9
    const/16 v17, 0x0

    .line 264
    .line 265
    :goto_7
    if-eqz v15, :cond_a

    .line 266
    .line 267
    iget v4, v15, La/pu90;->a:I

    .line 268
    .line 269
    goto :goto_8

    .line 270
    :cond_a
    move v4, v11

    .line 271
    :goto_8
    if-eqz v2, :cond_b

    .line 272
    .line 273
    iget v5, v2, La/pu90;->a:I

    .line 274
    .line 275
    goto :goto_9

    .line 276
    :cond_b
    move v5, v11

    .line 277
    :goto_9
    if-eqz v14, :cond_c

    .line 278
    .line 279
    iget v6, v14, La/pu90;->a:I

    .line 280
    .line 281
    goto :goto_a

    .line 282
    :cond_c
    move v6, v11

    .line 283
    :goto_a
    div-int/lit8 v7, v6, 0x2

    .line 284
    .line 285
    sub-int v7, v22, v7

    .line 286
    .line 287
    if-lez v4, :cond_d

    .line 288
    .line 289
    sub-int v12, v7, v23

    .line 290
    .line 291
    sub-int/2addr v12, v4

    .line 292
    goto :goto_b

    .line 293
    :cond_d
    sub-int v12, v7, v23

    .line 294
    .line 295
    :goto_b
    add-int v13, v7, v6

    .line 296
    .line 297
    add-int v13, v13, v23

    .line 298
    .line 299
    if-lez v4, :cond_e

    .line 300
    .line 301
    sub-int v12, v12, v23

    .line 302
    .line 303
    goto :goto_c

    .line 304
    :cond_e
    sub-int v12, v7, v23

    .line 305
    .line 306
    :goto_c
    if-gez v12, :cond_f

    .line 307
    .line 308
    move v12, v11

    .line 309
    :cond_f
    if-lez v5, :cond_10

    .line 310
    .line 311
    add-int/2addr v13, v5

    .line 312
    add-int v13, v13, v23

    .line 313
    .line 314
    goto :goto_d

    .line 315
    :cond_10
    add-int/2addr v7, v6

    .line 316
    add-int v13, v7, v23

    .line 317
    .line 318
    :goto_d
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 319
    .line 320
    .line 321
    move-result v4

    .line 322
    sub-int/2addr v4, v13

    .line 323
    if-gez v4, :cond_11

    .line 324
    .line 325
    goto :goto_e

    .line 326
    :cond_11
    move v11, v4

    .line 327
    :goto_e
    if-eqz v1, :cond_12

    .line 328
    .line 329
    invoke-static {v12}, La/lgb;->Q(I)J

    .line 330
    .line 331
    .line 332
    move-result-wide v4

    .line 333
    invoke-interface {v1, v4, v5}, La/pj30;->S(J)La/pu90;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    move-object/from16 v19, v1

    .line 338
    .line 339
    goto :goto_f

    .line 340
    :cond_12
    const/16 v19, 0x0

    .line 341
    .line 342
    :goto_f
    if-eqz v8, :cond_13

    .line 343
    .line 344
    invoke-static {v11}, La/lgb;->Q(I)J

    .line 345
    .line 346
    .line 347
    move-result-wide v4

    .line 348
    invoke-interface {v8, v4, v5}, La/pj30;->S(J)La/pu90;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    move-object/from16 v20, v1

    .line 353
    .line 354
    goto :goto_10

    .line 355
    :cond_13
    const/16 v20, 0x0

    .line 356
    .line 357
    :goto_10
    const/high16 v1, 0x41900000    # 18.0f

    .line 358
    .line 359
    if-eqz v10, :cond_14

    .line 360
    .line 361
    const/high16 v4, 0x42940000    # 74.0f

    .line 362
    .line 363
    invoke-interface {v0, v4}, La/w6k;->T(F)I

    .line 364
    .line 365
    .line 366
    move-result v4

    .line 367
    invoke-interface {v0, v1}, La/w6k;->T(F)I

    .line 368
    .line 369
    .line 370
    move-result v5

    .line 371
    invoke-static {v4, v5}, La/lgb;->P(II)J

    .line 372
    .line 373
    .line 374
    move-result-wide v4

    .line 375
    invoke-interface {v10, v4, v5}, La/pj30;->S(J)La/pu90;

    .line 376
    .line 377
    .line 378
    move-result-object v4

    .line 379
    move-object/from16 v26, v4

    .line 380
    .line 381
    goto :goto_11

    .line 382
    :cond_14
    const/16 v26, 0x0

    .line 383
    .line 384
    :goto_11
    if-eqz v3, :cond_15

    .line 385
    .line 386
    const/high16 v4, 0x41e00000    # 28.0f

    .line 387
    .line 388
    invoke-interface {v0, v4}, La/w6k;->T(F)I

    .line 389
    .line 390
    .line 391
    move-result v4

    .line 392
    invoke-interface {v0, v1}, La/w6k;->T(F)I

    .line 393
    .line 394
    .line 395
    move-result v1

    .line 396
    invoke-static {v4, v1}, La/lgb;->P(II)J

    .line 397
    .line 398
    .line 399
    move-result-wide v4

    .line 400
    invoke-interface {v3, v4, v5}, La/pj30;->S(J)La/pu90;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    move-object/from16 v27, v1

    .line 405
    .line 406
    goto :goto_12

    .line 407
    :cond_15
    const/16 v27, 0x0

    .line 408
    .line 409
    :goto_12
    if-eqz v9, :cond_16

    .line 410
    .line 411
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 412
    .line 413
    .line 414
    move-result v1

    .line 415
    invoke-static {v1}, La/lgb;->Q(I)J

    .line 416
    .line 417
    .line 418
    move-result-wide v3

    .line 419
    invoke-interface {v9, v3, v4}, La/pj30;->S(J)La/pu90;

    .line 420
    .line 421
    .line 422
    move-result-object v12

    .line 423
    move-object/from16 v28, v12

    .line 424
    .line 425
    goto :goto_13

    .line 426
    :cond_16
    const/16 v28, 0x0

    .line 427
    .line 428
    :goto_13
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 429
    .line 430
    .line 431
    move-result v1

    .line 432
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 433
    .line 434
    .line 435
    move-result v3

    .line 436
    new-instance v12, La/w8h;

    .line 437
    .line 438
    const/16 v29, 0x1

    .line 439
    .line 440
    move-object/from16 v13, p0

    .line 441
    .line 442
    move-wide/from16 v24, p3

    .line 443
    .line 444
    move-object/from16 v18, v2

    .line 445
    .line 446
    invoke-direct/range {v12 .. v29}, La/w8h;-><init>(La/tj30;La/pu90;La/pu90;La/pu90;La/pu90;La/pu90;La/pu90;La/pu90;IIIJLa/pu90;La/pu90;La/pu90;B)V

    .line 447
    .line 448
    .line 449
    invoke-static {v0, v1, v3, v12}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    return-object v0
.end method
