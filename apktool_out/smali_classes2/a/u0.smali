.class public abstract La/u0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Ljava/util/LinkedHashMap;


# instance fields
.field public final a:La/cgx0;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, La/x83;->values()[La/x83;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    array-length v2, v1

    .line 11
    const/4 v3, 0x0

    .line 12
    :goto_0
    if-ge v3, v2, :cond_1

    .line 13
    .line 14
    aget-object v4, v1, v3

    .line 15
    .line 16
    iget-object v5, v4, La/x83;->a:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v0, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v6

    .line 22
    if-nez v6, :cond_0

    .line 23
    .line 24
    invoke-interface {v0, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    sput-object v0, La/u0;->c:Ljava/util/LinkedHashMap;

    .line 31
    .line 32
    return-void
.end method

.method public constructor <init>(La/cgx0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/u0;->a:La/cgx0;

    .line 5
    .line 6
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, La/u0;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    return-void
.end method

.method public static b(La/u0;La/jay;Ljava/lang/Iterable;)La/jay;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v2, v0, La/u0;->a:La/cgx0;

    .line 12
    .line 13
    iget-boolean v3, v2, La/cgx0;->b:Z

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    goto/16 :goto_13

    .line 18
    .line 19
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    :cond_1
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    const/4 v7, 0x0

    .line 33
    const/4 v8, 0x0

    .line 34
    const/4 v9, 0x1

    .line 35
    if-eqz v6, :cond_1b

    .line 36
    .line 37
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    if-eqz v3, :cond_3

    .line 42
    .line 43
    :cond_2
    :goto_1
    move-object v13, v8

    .line 44
    goto :goto_4

    .line 45
    :cond_3
    sget-object v10, La/u8y;->e:Ljava/util/LinkedHashMap;

    .line 46
    .line 47
    invoke-virtual {v0, v6}, La/u0;->d(Ljava/lang/Object;)La/swq;

    .line 48
    .line 49
    .line 50
    move-result-object v11

    .line 51
    invoke-virtual {v10, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v10

    .line 55
    check-cast v10, La/t8y;

    .line 56
    .line 57
    if-eqz v10, :cond_2

    .line 58
    .line 59
    invoke-virtual {v0, v6}, La/u0;->d(Ljava/lang/Object;)La/swq;

    .line 60
    .line 61
    .line 62
    move-result-object v11

    .line 63
    if-eqz v11, :cond_4

    .line 64
    .line 65
    sget-object v12, La/u8y;->c:Ljava/util/Map;

    .line 66
    .line 67
    invoke-interface {v12, v11}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v12

    .line 71
    if-eqz v12, :cond_4

    .line 72
    .line 73
    iget-object v12, v2, La/cgx0;->d:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v12, La/w0;

    .line 76
    .line 77
    invoke-virtual {v12, v11}, La/w0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v11

    .line 81
    check-cast v11, La/zlf0;

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_4
    invoke-virtual {v0, v6}, La/u0;->k(Ljava/lang/Object;)La/zlf0;

    .line 85
    .line 86
    .line 87
    move-result-object v11

    .line 88
    if-eqz v11, :cond_5

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_5
    iget-object v11, v2, La/cgx0;->c:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v11, La/ydy;

    .line 94
    .line 95
    iget-object v11, v11, La/ydy;->a:La/zlf0;

    .line 96
    .line 97
    :goto_2
    sget-object v12, La/zlf0;->b:La/zlf0;

    .line 98
    .line 99
    if-eq v11, v12, :cond_6

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_6
    move-object v11, v8

    .line 103
    :goto_3
    if-nez v11, :cond_7

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_7
    iget-object v12, v10, La/t8y;->a:La/lov0;

    .line 107
    .line 108
    invoke-virtual {v11}, La/zlf0;->a()Z

    .line 109
    .line 110
    .line 111
    move-result v11

    .line 112
    invoke-static {v12, v8, v11, v9}, La/lov0;->a(La/lov0;Ljava/lang/Object;ZI)La/lov0;

    .line 113
    .line 114
    .line 115
    move-result-object v14

    .line 116
    iget-object v15, v10, La/t8y;->b:Ljava/util/Collection;

    .line 117
    .line 118
    iget-boolean v11, v10, La/t8y;->c:Z

    .line 119
    .line 120
    iget-boolean v12, v10, La/t8y;->d:Z

    .line 121
    .line 122
    iget-boolean v10, v10, La/t8y;->e:Z

    .line 123
    .line 124
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    new-instance v13, La/t8y;

    .line 128
    .line 129
    move/from16 v18, v10

    .line 130
    .line 131
    move/from16 v16, v11

    .line 132
    .line 133
    move/from16 v17, v12

    .line 134
    .line 135
    invoke-direct/range {v13 .. v18}, La/t8y;-><init>(La/lov0;Ljava/util/Collection;ZZZ)V

    .line 136
    .line 137
    .line 138
    :goto_4
    if-eqz v13, :cond_8

    .line 139
    .line 140
    move-object v8, v13

    .line 141
    goto/16 :goto_d

    .line 142
    .line 143
    :cond_8
    iget-object v10, v2, La/cgx0;->c:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v10, La/ydy;

    .line 146
    .line 147
    iget-boolean v10, v10, La/ydy;->d:Z

    .line 148
    .line 149
    if-eqz v10, :cond_9

    .line 150
    .line 151
    :goto_5
    move-object v10, v8

    .line 152
    goto/16 :goto_8

    .line 153
    .line 154
    :cond_9
    sget-object v10, La/cey;->f:La/swq;

    .line 155
    .line 156
    invoke-virtual {v0, v6, v10}, La/u0;->c(Ljava/lang/Object;La/swq;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v10

    .line 160
    if-nez v10, :cond_a

    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_a
    invoke-virtual {v0, v6}, La/u0;->f(Ljava/lang/Object;)Ljava/lang/Iterable;

    .line 164
    .line 165
    .line 166
    move-result-object v11

    .line 167
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object v11

    .line 171
    :cond_b
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v12

    .line 175
    if-eqz v12, :cond_c

    .line 176
    .line 177
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v12

    .line 181
    invoke-virtual {v0, v12}, La/u0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v13

    .line 185
    if-eqz v13, :cond_b

    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_c
    move-object v12, v8

    .line 189
    :goto_6
    if-nez v12, :cond_d

    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_d
    invoke-virtual {v0, v10, v9}, La/u0;->a(Ljava/lang/Object;Z)Ljava/lang/Iterable;

    .line 193
    .line 194
    .line 195
    move-result-object v10

    .line 196
    new-instance v11, Ljava/util/LinkedHashSet;

    .line 197
    .line 198
    invoke-direct {v11}, Ljava/util/LinkedHashSet;-><init>()V

    .line 199
    .line 200
    .line 201
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object v10

    .line 205
    :cond_e
    :goto_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 206
    .line 207
    .line 208
    move-result v13

    .line 209
    if-eqz v13, :cond_f

    .line 210
    .line 211
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v13

    .line 215
    check-cast v13, Ljava/lang/String;

    .line 216
    .line 217
    sget-object v14, La/u0;->c:Ljava/util/LinkedHashMap;

    .line 218
    .line 219
    invoke-virtual {v14, v13}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v13

    .line 223
    check-cast v13, La/x83;

    .line 224
    .line 225
    if-eqz v13, :cond_e

    .line 226
    .line 227
    invoke-interface {v11, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    goto :goto_7

    .line 231
    :cond_f
    new-instance v10, Lkotlin/Pair;

    .line 232
    .line 233
    sget-object v13, La/x83;->e:La/x83;

    .line 234
    .line 235
    invoke-interface {v11, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v13

    .line 239
    if-eqz v13, :cond_10

    .line 240
    .line 241
    invoke-static {}, La/x83;->values()[La/x83;

    .line 242
    .line 243
    .line 244
    move-result-object v13

    .line 245
    invoke-static {v13}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 246
    .line 247
    .line 248
    move-result-object v13

    .line 249
    sget-object v14, La/x83;->f:La/x83;

    .line 250
    .line 251
    invoke-static {v13, v14}, La/eui0;->e(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 252
    .line 253
    .line 254
    move-result-object v13

    .line 255
    invoke-static {v13, v11}, La/eui0;->g(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 256
    .line 257
    .line 258
    move-result-object v11

    .line 259
    :cond_10
    invoke-direct {v10, v12, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    :goto_8
    if-nez v10, :cond_11

    .line 263
    .line 264
    goto/16 :goto_d

    .line 265
    .line 266
    :cond_11
    iget-object v11, v10, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 267
    .line 268
    iget-object v10, v10, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 269
    .line 270
    check-cast v10, Ljava/util/Set;

    .line 271
    .line 272
    invoke-virtual {v0, v6}, La/u0;->k(Ljava/lang/Object;)La/zlf0;

    .line 273
    .line 274
    .line 275
    move-result-object v6

    .line 276
    if-nez v6, :cond_13

    .line 277
    .line 278
    invoke-virtual {v0, v11}, La/u0;->k(Ljava/lang/Object;)La/zlf0;

    .line 279
    .line 280
    .line 281
    move-result-object v6

    .line 282
    if-eqz v6, :cond_12

    .line 283
    .line 284
    goto :goto_9

    .line 285
    :cond_12
    iget-object v6, v2, La/cgx0;->c:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v6, La/ydy;

    .line 288
    .line 289
    iget-object v6, v6, La/ydy;->a:La/zlf0;

    .line 290
    .line 291
    :cond_13
    :goto_9
    sget-object v12, La/zlf0;->b:La/zlf0;

    .line 292
    .line 293
    if-ne v6, v12, :cond_14

    .line 294
    .line 295
    goto :goto_d

    .line 296
    :cond_14
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v0, v11, v7}, La/u0;->j(Ljava/lang/Object;Z)La/lov0;

    .line 300
    .line 301
    .line 302
    move-result-object v13

    .line 303
    if-eqz v13, :cond_15

    .line 304
    .line 305
    goto :goto_c

    .line 306
    :cond_15
    invoke-virtual {v0, v11}, La/u0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v13

    .line 310
    if-nez v13, :cond_17

    .line 311
    .line 312
    :cond_16
    :goto_a
    move-object v13, v8

    .line 313
    goto :goto_c

    .line 314
    :cond_17
    invoke-virtual {v0, v11}, La/u0;->k(Ljava/lang/Object;)La/zlf0;

    .line 315
    .line 316
    .line 317
    move-result-object v11

    .line 318
    if-eqz v11, :cond_18

    .line 319
    .line 320
    goto :goto_b

    .line 321
    :cond_18
    iget-object v11, v2, La/cgx0;->c:Ljava/lang/Object;

    .line 322
    .line 323
    check-cast v11, La/ydy;

    .line 324
    .line 325
    iget-object v11, v11, La/ydy;->a:La/zlf0;

    .line 326
    .line 327
    :goto_b
    if-ne v11, v12, :cond_19

    .line 328
    .line 329
    goto :goto_a

    .line 330
    :cond_19
    invoke-virtual {v0, v13, v7}, La/u0;->j(Ljava/lang/Object;Z)La/lov0;

    .line 331
    .line 332
    .line 333
    move-result-object v7

    .line 334
    if-eqz v7, :cond_16

    .line 335
    .line 336
    invoke-virtual {v11}, La/zlf0;->a()Z

    .line 337
    .line 338
    .line 339
    move-result v11

    .line 340
    invoke-static {v7, v8, v11, v9}, La/lov0;->a(La/lov0;Ljava/lang/Object;ZI)La/lov0;

    .line 341
    .line 342
    .line 343
    move-result-object v13

    .line 344
    :goto_c
    if-nez v13, :cond_1a

    .line 345
    .line 346
    goto :goto_d

    .line 347
    :cond_1a
    new-instance v7, La/t8y;

    .line 348
    .line 349
    invoke-virtual {v6}, La/zlf0;->a()Z

    .line 350
    .line 351
    .line 352
    move-result v6

    .line 353
    invoke-static {v13, v8, v6, v9}, La/lov0;->a(La/lov0;Ljava/lang/Object;ZI)La/lov0;

    .line 354
    .line 355
    .line 356
    move-result-object v6

    .line 357
    check-cast v10, Ljava/util/Collection;

    .line 358
    .line 359
    const/16 v8, 0x1c

    .line 360
    .line 361
    invoke-direct {v7, v6, v10, v8}, La/t8y;-><init>(La/lov0;Ljava/util/Collection;I)V

    .line 362
    .line 363
    .line 364
    move-object v8, v7

    .line 365
    :goto_d
    if-eqz v8, :cond_1

    .line 366
    .line 367
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    goto/16 :goto_0

    .line 371
    .line 372
    :cond_1b
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 373
    .line 374
    .line 375
    move-result v2

    .line 376
    if-eqz v2, :cond_1c

    .line 377
    .line 378
    goto/16 :goto_13

    .line 379
    .line 380
    :cond_1c
    new-instance v2, Ljava/util/EnumMap;

    .line 381
    .line 382
    const-class v3, La/x83;

    .line 383
    .line 384
    invoke-direct {v2, v3}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 388
    .line 389
    .line 390
    move-result-object v4

    .line 391
    :cond_1d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 392
    .line 393
    .line 394
    move-result v5

    .line 395
    if-eqz v5, :cond_24

    .line 396
    .line 397
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v5

    .line 401
    check-cast v5, La/t8y;

    .line 402
    .line 403
    iget-object v6, v5, La/t8y;->b:Ljava/util/Collection;

    .line 404
    .line 405
    invoke-interface {v6}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 406
    .line 407
    .line 408
    move-result-object v6

    .line 409
    :goto_e
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 410
    .line 411
    .line 412
    move-result v10

    .line 413
    if-eqz v10, :cond_1d

    .line 414
    .line 415
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v10

    .line 419
    check-cast v10, La/x83;

    .line 420
    .line 421
    invoke-virtual {v2, v10}, Ljava/util/EnumMap;->containsKey(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result v11

    .line 425
    if-eqz v11, :cond_23

    .line 426
    .line 427
    invoke-virtual {v0}, La/u0;->h()Z

    .line 428
    .line 429
    .line 430
    move-result v11

    .line 431
    if-nez v11, :cond_1e

    .line 432
    .line 433
    goto :goto_10

    .line 434
    :cond_1e
    invoke-virtual {v2, v10}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v11

    .line 438
    check-cast v11, La/t8y;

    .line 439
    .line 440
    if-nez v11, :cond_1f

    .line 441
    .line 442
    goto :goto_e

    .line 443
    :cond_1f
    iget-object v12, v11, La/t8y;->a:La/lov0;

    .line 444
    .line 445
    iget-object v13, v5, La/t8y;->a:La/lov0;

    .line 446
    .line 447
    invoke-static {v13, v12}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 448
    .line 449
    .line 450
    move-result v14

    .line 451
    if-eqz v14, :cond_20

    .line 452
    .line 453
    goto :goto_f

    .line 454
    :cond_20
    iget-boolean v13, v13, La/lov0;->b:Z

    .line 455
    .line 456
    if-eqz v13, :cond_21

    .line 457
    .line 458
    iget-boolean v14, v12, La/lov0;->b:Z

    .line 459
    .line 460
    if-nez v14, :cond_21

    .line 461
    .line 462
    goto :goto_f

    .line 463
    :cond_21
    if-nez v13, :cond_22

    .line 464
    .line 465
    iget-boolean v11, v12, La/lov0;->b:Z

    .line 466
    .line 467
    if-eqz v11, :cond_22

    .line 468
    .line 469
    move-object v11, v5

    .line 470
    goto :goto_f

    .line 471
    :cond_22
    move-object v11, v8

    .line 472
    :goto_f
    invoke-virtual {v2, v10, v11}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    goto :goto_e

    .line 476
    :cond_23
    :goto_10
    invoke-virtual {v2, v10, v5}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    goto :goto_e

    .line 480
    :cond_24
    if-eqz v1, :cond_25

    .line 481
    .line 482
    iget-object v0, v1, La/jay;->a:Ljava/util/EnumMap;

    .line 483
    .line 484
    new-instance v3, Ljava/util/EnumMap;

    .line 485
    .line 486
    invoke-direct {v3, v0}, Ljava/util/EnumMap;-><init>(Ljava/util/EnumMap;)V

    .line 487
    .line 488
    .line 489
    goto :goto_11

    .line 490
    :cond_25
    new-instance v0, Ljava/util/EnumMap;

    .line 491
    .line 492
    invoke-direct {v0, v3}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 493
    .line 494
    .line 495
    move-object v3, v0

    .line 496
    :goto_11
    invoke-virtual {v2}, Ljava/util/EnumMap;->entrySet()Ljava/util/Set;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    :cond_26
    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 505
    .line 506
    .line 507
    move-result v2

    .line 508
    if-eqz v2, :cond_27

    .line 509
    .line 510
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v2

    .line 514
    check-cast v2, Ljava/util/Map$Entry;

    .line 515
    .line 516
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v4

    .line 520
    check-cast v4, La/x83;

    .line 521
    .line 522
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v2

    .line 526
    check-cast v2, La/t8y;

    .line 527
    .line 528
    if-eqz v2, :cond_26

    .line 529
    .line 530
    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move v7, v9

    .line 534
    goto :goto_12

    .line 535
    :cond_27
    if-nez v7, :cond_28

    .line 536
    .line 537
    :goto_13
    return-object v1

    .line 538
    :cond_28
    new-instance v0, La/jay;

    .line 539
    .line 540
    invoke-direct {v0, v3}, La/jay;-><init>(Ljava/util/EnumMap;)V

    .line 541
    .line 542
    .line 543
    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;Z)Ljava/lang/Iterable;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/annotation/Annotation;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance p0, La/poe;

    .line 7
    .line 8
    const-string p1, "Should not be called because kotlin-reflect doesn\'t support JSR-305 annotations."

    .line 9
    .line 10
    invoke-direct {p0, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p0
.end method

.method public final c(Ljava/lang/Object;La/swq;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, La/u0;->f(Ljava/lang/Object;)Ljava/lang/Iterable;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0, v0}, La/u0;->d(Ljava/lang/Object;)La/swq;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v1, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_1
    const/4 p0, 0x0

    .line 31
    return-object p0
.end method

.method public d(Ljava/lang/Object;)La/swq;
    .locals 0

    .line 1
    check-cast p1, La/t83;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, La/t83;->d()La/swq;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/t83;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, La/rek;->d(La/t83;)La/wm40;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public f(Ljava/lang/Object;)Ljava/lang/Iterable;
    .locals 0

    .line 1
    check-cast p1, La/t83;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, La/rek;->d(La/t83;)La/wm40;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, La/e83;->getAnnotations()La/g93;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    sget-object p0, La/iun;->a:La/iun;

    .line 20
    .line 21
    return-object p0
.end method

.method public final g(Ljava/lang/Object;La/swq;)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, La/u0;->f(Ljava/lang/Object;)Ljava/lang/Iterable;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    instance-of v0, p1, Ljava/util/Collection;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    move-object v0, p1

    .line 10
    check-cast v0, Ljava/util/Collection;

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p0, v0}, La/u0;->d(Ljava/lang/Object;)La/swq;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    const/4 p0, 0x1

    .line 44
    return p0

    .line 45
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 46
    return p0
.end method

.method public h()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final i(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/i4m0;->t:La/swq;

    .line 5
    .line 6
    invoke-virtual {p0, p1, v0}, La/u0;->c(Ljava/lang/Object;La/swq;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/4 v0, 0x0

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0, p1, v0}, La/u0;->a(Ljava/lang/Object;Z)Ljava/lang/Iterable;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    instance-of p1, p0, Ljava/util/Collection;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    move-object p1, p0

    .line 23
    check-cast p1, Ljava/util/Collection;

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_3

    .line 41
    .line 42
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, Ljava/lang/String;

    .line 47
    .line 48
    const-string v1, "TYPE"

    .line 49
    .line 50
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-eqz p1, :cond_2

    .line 55
    .line 56
    const/4 p0, 0x1

    .line 57
    return p0

    .line 58
    :cond_3
    :goto_0
    return v0
.end method

.method public final j(Ljava/lang/Object;Z)La/lov0;
    .locals 5

    .line 1
    invoke-virtual {p0, p1}, La/u0;->d(Ljava/lang/Object;)La/swq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_2

    .line 9
    .line 10
    :cond_0
    iget-object v2, p0, La/u0;->a:La/cgx0;

    .line 11
    .line 12
    iget-object v2, v2, La/cgx0;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, La/w0;

    .line 15
    .line 16
    invoke-virtual {v2, v0}, La/w0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, La/zlf0;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    sget-object v3, La/zlf0;->b:La/zlf0;

    .line 26
    .line 27
    if-ne v2, v3, :cond_1

    .line 28
    .line 29
    return-object v1

    .line 30
    :cond_1
    sget-object v3, La/cey;->k:Ljava/util/Set;

    .line 31
    .line 32
    invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    const/4 v4, 0x0

    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    sget-object p0, La/p860;->c:La/p860;

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    sget-object v3, La/cey;->l:Ljava/util/Set;

    .line 43
    .line 44
    invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_3

    .line 49
    .line 50
    sget-object p0, La/p860;->b:La/p860;

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    sget-object v3, La/cey;->m:Ljava/util/Set;

    .line 54
    .line 55
    invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_4

    .line 60
    .line 61
    sget-object p0, La/p860;->a:La/p860;

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_4
    sget-object v3, La/cey;->g:La/swq;

    .line 65
    .line 66
    invoke-virtual {v0, v3}, La/swq;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_a

    .line 71
    .line 72
    invoke-virtual {p0, p1, v4}, La/u0;->a(Ljava/lang/Object;Z)Ljava/lang/Iterable;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->V(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    check-cast p0, Ljava/lang/String;

    .line 81
    .line 82
    if-eqz p0, :cond_7

    .line 83
    .line 84
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    sparse-switch p1, :sswitch_data_0

    .line 89
    .line 90
    .line 91
    goto :goto_2

    .line 92
    :sswitch_0
    const-string p1, "ALWAYS"

    .line 93
    .line 94
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    if-eqz p0, :cond_a

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :sswitch_1
    const-string p1, "UNKNOWN"

    .line 102
    .line 103
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    if-nez p0, :cond_5

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_5
    sget-object p0, La/p860;->a:La/p860;

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :sswitch_2
    const-string p1, "NEVER"

    .line 114
    .line 115
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    if-nez p0, :cond_6

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :sswitch_3
    const-string p1, "MAYBE"

    .line 123
    .line 124
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    if-nez p0, :cond_6

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_6
    sget-object p0, La/p860;->b:La/p860;

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_7
    :goto_0
    sget-object p0, La/p860;->c:La/p860;

    .line 135
    .line 136
    :goto_1
    new-instance p1, La/lov0;

    .line 137
    .line 138
    invoke-virtual {v2}, La/zlf0;->a()Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-nez v0, :cond_8

    .line 143
    .line 144
    if-eqz p2, :cond_9

    .line 145
    .line 146
    :cond_8
    const/4 v4, 0x1

    .line 147
    :cond_9
    invoke-direct {p1, p0, v4}, La/lov0;-><init>(Ljava/lang/Object;Z)V

    .line 148
    .line 149
    .line 150
    return-object p1

    .line 151
    :cond_a
    :goto_2
    return-object v1

    .line 152
    nop

    .line 153
    :sswitch_data_0
    .sparse-switch
        0x45bf448 -> :sswitch_3
        0x46bd26c -> :sswitch_2
        0x19d1382a -> :sswitch_1
        0x7342860f -> :sswitch_0
    .end sparse-switch
.end method

.method public final k(Ljava/lang/Object;)La/zlf0;
    .locals 3

    .line 1
    iget-object v0, p0, La/u0;->a:La/cgx0;

    .line 2
    .line 3
    iget-object v0, v0, La/cgx0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/ydy;

    .line 6
    .line 7
    iget-object v1, v0, La/ydy;->c:Ljava/util/Map;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, La/u0;->d(Ljava/lang/Object;)La/swq;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, La/zlf0;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    return-object v1

    .line 22
    :cond_0
    sget-object v1, La/cey;->q:La/swq;

    .line 23
    .line 24
    invoke-virtual {p0, p1, v1}, La/u0;->c(Ljava/lang/Object;La/swq;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-eqz p1, :cond_9

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-virtual {p0, p1, v1}, La/u0;->a(Ljava/lang/Object;Z)Ljava/lang/Iterable;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    if-eqz p0, :cond_9

    .line 36
    .line 37
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->V(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, Ljava/lang/String;

    .line 42
    .line 43
    if-nez p0, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    iget-object p1, v0, La/ydy;->b:La/zlf0;

    .line 47
    .line 48
    if-nez p1, :cond_8

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    const v0, -0x7f610e2e

    .line 55
    .line 56
    .line 57
    if-eq p1, v0, :cond_6

    .line 58
    .line 59
    const v0, -0x6d97ad37

    .line 60
    .line 61
    .line 62
    if-eq p1, v0, :cond_4

    .line 63
    .line 64
    const v0, 0x288a86

    .line 65
    .line 66
    .line 67
    if-eq p1, v0, :cond_2

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    const-string p1, "WARN"

    .line 71
    .line 72
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-nez p0, :cond_3

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    sget-object p0, La/zlf0;->c:La/zlf0;

    .line 80
    .line 81
    return-object p0

    .line 82
    :cond_4
    const-string p1, "STRICT"

    .line 83
    .line 84
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    if-nez p0, :cond_5

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_5
    sget-object p0, La/zlf0;->d:La/zlf0;

    .line 92
    .line 93
    return-object p0

    .line 94
    :cond_6
    const-string p1, "IGNORE"

    .line 95
    .line 96
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    if-nez p0, :cond_7

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_7
    sget-object p0, La/zlf0;->b:La/zlf0;

    .line 104
    .line 105
    return-object p0

    .line 106
    :cond_8
    return-object p1

    .line 107
    :cond_9
    :goto_0
    const/4 p0, 0x0

    .line 108
    return-object p0
.end method

.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/u0;->a:La/cgx0;

    .line 5
    .line 6
    iget-object v0, v0, La/cgx0;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, La/ydy;

    .line 9
    .line 10
    iget-boolean v0, v0, La/ydy;->d:Z

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    sget-object v0, La/cey;->j:Ljava/util/Set;

    .line 17
    .line 18
    check-cast v0, Ljava/lang/Iterable;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, La/u0;->d(Ljava/lang/Object;)La/swq;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->L(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_8

    .line 29
    .line 30
    sget-object v0, La/cey;->d:La/swq;

    .line 31
    .line 32
    invoke-virtual {p0, p1, v0}, La/u0;->g(Ljava/lang/Object;La/swq;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_1
    sget-object v0, La/cey;->e:La/swq;

    .line 40
    .line 41
    invoke-virtual {p0, p1, v0}, La/u0;->g(Ljava/lang/Object;La/swq;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_2

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    invoke-virtual {p0, p1}, La/u0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-object v2, p0, La/u0;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 53
    .line 54
    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    if-nez v3, :cond_7

    .line 59
    .line 60
    invoke-virtual {p0, p1}, La/u0;->f(Ljava/lang/Object;)Ljava/lang/Iterable;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_4

    .line 73
    .line 74
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {p0, v3}, La/u0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    if-eqz v3, :cond_3

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_4
    move-object v3, v1

    .line 86
    :goto_0
    if-nez v3, :cond_5

    .line 87
    .line 88
    :goto_1
    return-object v1

    .line 89
    :cond_5
    invoke-virtual {v2, v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    if-nez p0, :cond_6

    .line 94
    .line 95
    return-object v3

    .line 96
    :cond_6
    return-object p0

    .line 97
    :cond_7
    return-object v3

    .line 98
    :cond_8
    :goto_2
    return-object p1
.end method
