.class public final La/x8h;
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
    sget-object v1, La/s8k0;->a:La/s8k0;

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
    sget-object v2, La/b9k0;->a:La/b9k0;

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
    sget-object v4, La/h9k0;->a:La/h9k0;

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
    sget-object v5, La/u8k0;->a:La/u8k0;

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
    sget-object v6, La/d9k0;->a:La/d9k0;

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
    sget-object v7, La/w8k0;->a:La/w8k0;

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
    sget-object v8, La/f9k0;->a:La/f9k0;

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
    sget-object v9, La/q8k0;->a:La/q8k0;

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
    sget-object v10, La/j9k0;->a:La/j9k0;

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
    sget-object v11, La/m9k0;->a:La/m9k0;

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
    const/high16 v11, 0x40000000    # 2.0f

    .line 150
    .line 151
    invoke-interface {v0, v11}, La/w6k;->T(F)I

    .line 152
    .line 153
    .line 154
    move-result v23

    .line 155
    if-eqz v4, :cond_5

    .line 156
    .line 157
    const/high16 v13, 0x42800000    # 64.0f

    .line 158
    .line 159
    invoke-interface {v0, v13}, La/w6k;->T(F)I

    .line 160
    .line 161
    .line 162
    move-result v13

    .line 163
    const/high16 v14, 0x41c00000    # 24.0f

    .line 164
    .line 165
    invoke-interface {v0, v14}, La/w6k;->T(F)I

    .line 166
    .line 167
    .line 168
    move-result v14

    .line 169
    const/4 v15, 0x1

    .line 170
    if-ltz v13, :cond_2

    .line 171
    .line 172
    move/from16 v16, v15

    .line 173
    .line 174
    goto :goto_1

    .line 175
    :cond_2
    const/16 v16, 0x0

    .line 176
    .line 177
    :goto_1
    if-ltz v14, :cond_3

    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_3
    const/4 v15, 0x0

    .line 181
    :goto_2
    and-int v15, v16, v15

    .line 182
    .line 183
    if-nez v15, :cond_4

    .line 184
    .line 185
    const-string v15, "width and height must be >= 0"

    .line 186
    .line 187
    invoke-static {v15}, La/zcx;->a(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    :cond_4
    invoke-static {v13, v13, v14, v14}, La/r4e;->h(IIII)J

    .line 191
    .line 192
    .line 193
    move-result-wide v13

    .line 194
    invoke-interface {v4, v13, v14}, La/pj30;->S(J)La/pu90;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    move-object v14, v4

    .line 199
    goto :goto_3

    .line 200
    :cond_5
    const/4 v14, 0x0

    .line 201
    :goto_3
    const/high16 v4, 0x41800000    # 16.0f

    .line 202
    .line 203
    invoke-interface {v0, v4}, La/w6k;->T(F)I

    .line 204
    .line 205
    .line 206
    move-result v13

    .line 207
    invoke-static {v13}, La/lgb;->Q(I)J

    .line 208
    .line 209
    .line 210
    move-result-wide v11

    .line 211
    if-eqz v1, :cond_6

    .line 212
    .line 213
    invoke-interface {v1, v11, v12}, La/pj30;->S(J)La/pu90;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    goto :goto_4

    .line 218
    :cond_6
    const/4 v1, 0x0

    .line 219
    :goto_4
    if-eqz v2, :cond_7

    .line 220
    .line 221
    invoke-interface {v2, v11, v12}, La/pj30;->S(J)La/pu90;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    move-object/from16 v16, v2

    .line 226
    .line 227
    goto :goto_5

    .line 228
    :cond_7
    const/16 v16, 0x0

    .line 229
    .line 230
    :goto_5
    const/high16 v2, 0x42000000    # 32.0f

    .line 231
    .line 232
    invoke-interface {v0, v2}, La/w6k;->T(F)I

    .line 233
    .line 234
    .line 235
    move-result v11

    .line 236
    invoke-interface {v0, v2}, La/w6k;->T(F)I

    .line 237
    .line 238
    .line 239
    move-result v12

    .line 240
    invoke-static {v11, v12}, La/lgb;->P(II)J

    .line 241
    .line 242
    .line 243
    move-result-wide v11

    .line 244
    if-eqz v5, :cond_8

    .line 245
    .line 246
    invoke-interface {v5, v11, v12}, La/pj30;->S(J)La/pu90;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    move-object/from16 v17, v5

    .line 251
    .line 252
    goto :goto_6

    .line 253
    :cond_8
    const/16 v17, 0x0

    .line 254
    .line 255
    :goto_6
    if-eqz v6, :cond_9

    .line 256
    .line 257
    invoke-interface {v6, v11, v12}, La/pj30;->S(J)La/pu90;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    move-object/from16 v18, v5

    .line 262
    .line 263
    goto :goto_7

    .line 264
    :cond_9
    const/16 v18, 0x0

    .line 265
    .line 266
    :goto_7
    invoke-interface {v0, v4}, La/w6k;->T(F)I

    .line 267
    .line 268
    .line 269
    move-result v4

    .line 270
    mul-int/lit8 v4, v4, 0x2

    .line 271
    .line 272
    invoke-interface {v0, v2}, La/w6k;->T(F)I

    .line 273
    .line 274
    .line 275
    move-result v2

    .line 276
    mul-int/lit8 v2, v2, 0x2

    .line 277
    .line 278
    const/high16 v5, 0x42500000    # 52.0f

    .line 279
    .line 280
    invoke-interface {v0, v5}, La/w6k;->T(F)I

    .line 281
    .line 282
    .line 283
    move-result v5

    .line 284
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 285
    .line 286
    .line 287
    move-result v6

    .line 288
    const/high16 v11, 0x42400000    # 48.0f

    .line 289
    .line 290
    invoke-interface {v0, v11}, La/w6k;->T(F)I

    .line 291
    .line 292
    .line 293
    move-result v11

    .line 294
    sub-int/2addr v6, v11

    .line 295
    sub-int/2addr v6, v4

    .line 296
    sub-int/2addr v6, v2

    .line 297
    sub-int/2addr v6, v5

    .line 298
    div-int/lit8 v6, v6, 0x2

    .line 299
    .line 300
    if-gez v6, :cond_a

    .line 301
    .line 302
    const/4 v11, 0x0

    .line 303
    goto :goto_8

    .line 304
    :cond_a
    move v11, v6

    .line 305
    :goto_8
    invoke-static {v11}, La/lgb;->Q(I)J

    .line 306
    .line 307
    .line 308
    move-result-wide v4

    .line 309
    if-eqz v7, :cond_b

    .line 310
    .line 311
    invoke-interface {v7, v4, v5}, La/pj30;->S(J)La/pu90;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    move-object/from16 v19, v2

    .line 316
    .line 317
    goto :goto_9

    .line 318
    :cond_b
    const/16 v19, 0x0

    .line 319
    .line 320
    :goto_9
    if-eqz v8, :cond_c

    .line 321
    .line 322
    invoke-interface {v8, v4, v5}, La/pj30;->S(J)La/pu90;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    move-object/from16 v20, v2

    .line 327
    .line 328
    goto :goto_a

    .line 329
    :cond_c
    const/16 v20, 0x0

    .line 330
    .line 331
    :goto_a
    const/high16 v2, 0x41900000    # 18.0f

    .line 332
    .line 333
    if-eqz v10, :cond_d

    .line 334
    .line 335
    const/high16 v4, 0x42940000    # 74.0f

    .line 336
    .line 337
    invoke-interface {v0, v4}, La/w6k;->T(F)I

    .line 338
    .line 339
    .line 340
    move-result v4

    .line 341
    invoke-interface {v0, v2}, La/w6k;->T(F)I

    .line 342
    .line 343
    .line 344
    move-result v5

    .line 345
    invoke-static {v4, v5}, La/lgb;->P(II)J

    .line 346
    .line 347
    .line 348
    move-result-wide v4

    .line 349
    invoke-interface {v10, v4, v5}, La/pj30;->S(J)La/pu90;

    .line 350
    .line 351
    .line 352
    move-result-object v4

    .line 353
    move-object/from16 v26, v4

    .line 354
    .line 355
    goto :goto_b

    .line 356
    :cond_d
    const/16 v26, 0x0

    .line 357
    .line 358
    :goto_b
    if-eqz v3, :cond_e

    .line 359
    .line 360
    const/high16 v4, 0x41e00000    # 28.0f

    .line 361
    .line 362
    invoke-interface {v0, v4}, La/w6k;->T(F)I

    .line 363
    .line 364
    .line 365
    move-result v4

    .line 366
    invoke-interface {v0, v2}, La/w6k;->T(F)I

    .line 367
    .line 368
    .line 369
    move-result v2

    .line 370
    invoke-static {v4, v2}, La/lgb;->P(II)J

    .line 371
    .line 372
    .line 373
    move-result-wide v4

    .line 374
    invoke-interface {v3, v4, v5}, La/pj30;->S(J)La/pu90;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    move-object/from16 v27, v2

    .line 379
    .line 380
    goto :goto_c

    .line 381
    :cond_e
    const/16 v27, 0x0

    .line 382
    .line 383
    :goto_c
    if-eqz v9, :cond_f

    .line 384
    .line 385
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 386
    .line 387
    .line 388
    move-result v2

    .line 389
    invoke-static {v2}, La/lgb;->Q(I)J

    .line 390
    .line 391
    .line 392
    move-result-wide v2

    .line 393
    invoke-interface {v9, v2, v3}, La/pj30;->S(J)La/pu90;

    .line 394
    .line 395
    .line 396
    move-result-object v12

    .line 397
    move-object/from16 v28, v12

    .line 398
    .line 399
    goto :goto_d

    .line 400
    :cond_f
    const/16 v28, 0x0

    .line 401
    .line 402
    :goto_d
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 403
    .line 404
    .line 405
    move-result v2

    .line 406
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 407
    .line 408
    .line 409
    move-result v3

    .line 410
    new-instance v12, La/w8h;

    .line 411
    .line 412
    const/16 v29, 0x0

    .line 413
    .line 414
    move-object/from16 v13, p0

    .line 415
    .line 416
    move-wide/from16 v24, p3

    .line 417
    .line 418
    move-object v15, v1

    .line 419
    invoke-direct/range {v12 .. v29}, La/w8h;-><init>(La/tj30;La/pu90;La/pu90;La/pu90;La/pu90;La/pu90;La/pu90;La/pu90;IIIJLa/pu90;La/pu90;La/pu90;B)V

    .line 420
    .line 421
    .line 422
    invoke-static {v0, v2, v3, v12}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    return-object v0
.end method
