.class public final La/sc60;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/aer;


# instance fields
.field public synthetic i:Ljava/util/List;

.field public synthetic j:Ljava/util/List;

.field public synthetic k:Ljava/util/List;

.field public synthetic l:Ljava/util/Map;

.field public synthetic m:Ljava/util/List;

.field public final synthetic n:La/rrd;

.field public final synthetic o:Ljava/lang/String;


# direct methods
.method public constructor <init>(La/rrd;Ljava/lang/String;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/sc60;->n:La/rrd;

    .line 2
    .line 3
    iput-object p2, p0, La/sc60;->o:Ljava/lang/String;

    .line 4
    .line 5
    const/4 p1, 0x6

    .line 6
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/sc60;->i:Ljava/util/List;

    .line 4
    .line 5
    iget-object v2, v0, La/sc60;->j:Ljava/util/List;

    .line 6
    .line 7
    iget-object v3, v0, La/sc60;->k:Ljava/util/List;

    .line 8
    .line 9
    iget-object v4, v0, La/sc60;->l:Ljava/util/Map;

    .line 10
    .line 11
    check-cast v4, Ljava/util/Map;

    .line 12
    .line 13
    iget-object v5, v0, La/sc60;->m:Ljava/util/List;

    .line 14
    .line 15
    sget-object v6, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    new-instance v6, Ljava/util/ArrayList;

    .line 21
    .line 22
    const/16 v7, 0xa

    .line 23
    .line 24
    invoke-static {v1, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 25
    .line 26
    .line 27
    move-result v8

    .line 28
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v9

    .line 39
    if-eqz v9, :cond_6

    .line 40
    .line 41
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v9

    .line 45
    check-cast v9, La/sr20;

    .line 46
    .line 47
    iget-wide v10, v9, La/sr20;->b:J

    .line 48
    .line 49
    new-instance v12, Ljava/lang/Long;

    .line 50
    .line 51
    invoke-direct {v12, v10, v11}, Ljava/lang/Long;-><init>(J)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v4, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v10

    .line 58
    check-cast v10, Ljava/lang/Boolean;

    .line 59
    .line 60
    const/4 v11, 0x0

    .line 61
    if-eqz v10, :cond_0

    .line 62
    .line 63
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 64
    .line 65
    .line 66
    move-result v10

    .line 67
    move/from16 v17, v10

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_0
    move/from16 v17, v11

    .line 71
    .line 72
    :goto_1
    if-eqz v5, :cond_2

    .line 73
    .line 74
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 75
    .line 76
    .line 77
    move-result v10

    .line 78
    if-eqz v10, :cond_2

    .line 79
    .line 80
    :cond_1
    move-object/from16 v20, v8

    .line 81
    .line 82
    :goto_2
    move/from16 v19, v11

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_2
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object v10

    .line 89
    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v12

    .line 93
    if-eqz v12, :cond_1

    .line 94
    .line 95
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v12

    .line 99
    check-cast v12, La/vt20;

    .line 100
    .line 101
    iget-wide v13, v12, La/vt20;->a:J

    .line 102
    .line 103
    move-object/from16 v20, v8

    .line 104
    .line 105
    iget-wide v7, v9, La/sr20;->b:J

    .line 106
    .line 107
    cmp-long v7, v13, v7

    .line 108
    .line 109
    if-nez v7, :cond_3

    .line 110
    .line 111
    iget v7, v12, La/vt20;->c:I

    .line 112
    .line 113
    if-eqz v7, :cond_3

    .line 114
    .line 115
    const/4 v11, 0x1

    .line 116
    goto :goto_2

    .line 117
    :cond_3
    move-object/from16 v8, v20

    .line 118
    .line 119
    const/16 v7, 0xa

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :goto_4
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    iget-object v7, v9, La/sr20;->a:Ljava/util/ArrayList;

    .line 129
    .line 130
    iget-wide v10, v9, La/sr20;->e:J

    .line 131
    .line 132
    new-instance v13, Ljava/util/ArrayList;

    .line 133
    .line 134
    const/16 v8, 0xa

    .line 135
    .line 136
    invoke-static {v7, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 137
    .line 138
    .line 139
    move-result v12

    .line 140
    invoke-direct {v13, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 144
    .line 145
    .line 146
    move-result-object v7

    .line 147
    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v12

    .line 151
    if-eqz v12, :cond_5

    .line 152
    .line 153
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v12

    .line 157
    check-cast v12, Ljava/util/List;

    .line 158
    .line 159
    new-instance v14, Ljava/util/ArrayList;

    .line 160
    .line 161
    invoke-static {v12, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 162
    .line 163
    .line 164
    move-result v15

    .line 165
    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 166
    .line 167
    .line 168
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    :goto_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v12

    .line 176
    if-eqz v12, :cond_4

    .line 177
    .line 178
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v12

    .line 182
    check-cast v12, La/vr20;

    .line 183
    .line 184
    invoke-static {v2, v12, v10, v11}, La/p7x;->C(Ljava/util/List;La/vr20;J)Z

    .line 185
    .line 186
    .line 187
    move-result v15

    .line 188
    move-object/from16 v21, v2

    .line 189
    .line 190
    invoke-static {v3, v12, v10, v11}, La/p7x;->C(Ljava/util/List;La/vr20;J)Z

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    move-object/from16 v22, v3

    .line 195
    .line 196
    sget-object v3, La/uyc;->c:La/uyc;

    .line 197
    .line 198
    invoke-static {v12, v15, v2, v3}, La/tlb;->h0(La/vr20;ZZLa/uyc;)La/hao;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-object/from16 v2, v21

    .line 206
    .line 207
    move-object/from16 v3, v22

    .line 208
    .line 209
    goto :goto_6

    .line 210
    :cond_4
    move-object/from16 v21, v2

    .line 211
    .line 212
    move-object/from16 v22, v3

    .line 213
    .line 214
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    const/16 v8, 0xa

    .line 218
    .line 219
    goto :goto_5

    .line 220
    :cond_5
    move-object/from16 v21, v2

    .line 221
    .line 222
    move-object/from16 v22, v3

    .line 223
    .line 224
    iget-wide v14, v9, La/sr20;->b:J

    .line 225
    .line 226
    iget-object v2, v9, La/sr20;->c:Ljava/lang/String;

    .line 227
    .line 228
    iget-boolean v3, v9, La/sr20;->d:Z

    .line 229
    .line 230
    new-instance v12, La/i6a0;

    .line 231
    .line 232
    move-object/from16 v16, v2

    .line 233
    .line 234
    move/from16 v18, v3

    .line 235
    .line 236
    invoke-direct/range {v12 .. v19}, La/i6a0;-><init>(Ljava/util/ArrayList;JLjava/lang/String;ZZZ)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-object/from16 v8, v20

    .line 243
    .line 244
    move-object/from16 v2, v21

    .line 245
    .line 246
    move-object/from16 v3, v22

    .line 247
    .line 248
    const/16 v7, 0xa

    .line 249
    .line 250
    goto/16 :goto_0

    .line 251
    .line 252
    :cond_6
    iget-object v2, v0, La/sc60;->n:La/rrd;

    .line 253
    .line 254
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    const/16 v8, 0xa

    .line 258
    .line 259
    invoke-static {v5, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 260
    .line 261
    .line 262
    move-result v3

    .line 263
    invoke-static {v3}, La/wp20;->a(I)I

    .line 264
    .line 265
    .line 266
    move-result v3

    .line 267
    const/16 v4, 0x10

    .line 268
    .line 269
    if-ge v3, v4, :cond_7

    .line 270
    .line 271
    move v3, v4

    .line 272
    :cond_7
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 273
    .line 274
    invoke-direct {v7, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 275
    .line 276
    .line 277
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 282
    .line 283
    .line 284
    move-result v5

    .line 285
    if-eqz v5, :cond_8

    .line 286
    .line 287
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v5

    .line 291
    move-object v8, v5

    .line 292
    check-cast v8, La/vt20;

    .line 293
    .line 294
    iget-wide v8, v8, La/vt20;->a:J

    .line 295
    .line 296
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 297
    .line 298
    .line 299
    move-result-object v8

    .line 300
    invoke-interface {v7, v8, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    goto :goto_7

    .line 304
    :cond_8
    new-instance v3, La/b0c;

    .line 305
    .line 306
    const/4 v5, 0x5

    .line 307
    invoke-direct {v3, v7, v5}, La/b0c;-><init>(Ljava/util/LinkedHashMap;B)V

    .line 308
    .line 309
    .line 310
    new-instance v5, La/sr0;

    .line 311
    .line 312
    const/4 v8, 0x4

    .line 313
    invoke-direct {v5, v3, v7, v8}, La/sr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 314
    .line 315
    .line 316
    invoke-static {v6, v5}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    iget-object v2, v2, La/rrd;->h:Ljava/lang/Object;

    .line 321
    .line 322
    check-cast v2, La/omo;

    .line 323
    .line 324
    const/4 v5, 0x3

    .line 325
    invoke-static {v1, v5}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    new-instance v5, Ljava/util/ArrayList;

    .line 330
    .line 331
    const/16 v8, 0xa

    .line 332
    .line 333
    invoke-static {v1, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 334
    .line 335
    .line 336
    move-result v6

    .line 337
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 338
    .line 339
    .line 340
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 345
    .line 346
    .line 347
    move-result v6

    .line 348
    if-eqz v6, :cond_9

    .line 349
    .line 350
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v6

    .line 354
    check-cast v6, La/sr20;

    .line 355
    .line 356
    iget-wide v6, v6, La/sr20;->b:J

    .line 357
    .line 358
    invoke-static {v6, v7, v5}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 359
    .line 360
    .line 361
    goto :goto_8

    .line 362
    :cond_9
    iget-object v1, v2, La/omo;->a:La/noo;

    .line 363
    .line 364
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    iget-object v1, v1, La/noo;->a:La/moo;

    .line 368
    .line 369
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    iget-object v1, v1, La/moo;->a:La/p7m0;

    .line 373
    .line 374
    :cond_a
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    move-object v6, v2

    .line 379
    check-cast v6, Ljava/util/Map;

    .line 380
    .line 381
    iget-object v7, v0, La/sc60;->o:Ljava/lang/String;

    .line 382
    .line 383
    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v8

    .line 387
    check-cast v8, Ljava/util/Map;

    .line 388
    .line 389
    if-eqz v8, :cond_c

    .line 390
    .line 391
    invoke-interface {v8}, Ljava/util/Map;->isEmpty()Z

    .line 392
    .line 393
    .line 394
    move-result v8

    .line 395
    if-eqz v8, :cond_b

    .line 396
    .line 397
    goto :goto_9

    .line 398
    :cond_b
    const/16 v9, 0xa

    .line 399
    .line 400
    goto :goto_b

    .line 401
    :cond_c
    :goto_9
    new-instance v8, Ljava/util/LinkedHashMap;

    .line 402
    .line 403
    const/16 v9, 0xa

    .line 404
    .line 405
    invoke-static {v5, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 406
    .line 407
    .line 408
    move-result v10

    .line 409
    invoke-static {v10}, La/wp20;->a(I)I

    .line 410
    .line 411
    .line 412
    move-result v10

    .line 413
    if-ge v10, v4, :cond_d

    .line 414
    .line 415
    move v10, v4

    .line 416
    :cond_d
    invoke-direct {v8, v10}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 420
    .line 421
    .line 422
    move-result-object v10

    .line 423
    :goto_a
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 424
    .line 425
    .line 426
    move-result v11

    .line 427
    if-eqz v11, :cond_e

    .line 428
    .line 429
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v11

    .line 433
    move-object v12, v11

    .line 434
    check-cast v12, Ljava/lang/Number;

    .line 435
    .line 436
    invoke-virtual {v12}, Ljava/lang/Number;->longValue()J

    .line 437
    .line 438
    .line 439
    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 440
    .line 441
    invoke-interface {v8, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    goto :goto_a

    .line 445
    :cond_e
    new-instance v10, Lkotlin/Pair;

    .line 446
    .line 447
    invoke-direct {v10, v7, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 448
    .line 449
    .line 450
    invoke-static {v6, v10}, La/xp20;->k(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    .line 451
    .line 452
    .line 453
    move-result-object v6

    .line 454
    :goto_b
    invoke-virtual {v1, v2, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    move-result v2

    .line 458
    if-eqz v2, :cond_a

    .line 459
    .line 460
    return-object v3
.end method

.method public final n(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    check-cast p2, Ljava/util/List;

    .line 4
    .line 5
    check-cast p3, Ljava/util/List;

    .line 6
    .line 7
    check-cast p4, Ljava/util/Map;

    .line 8
    .line 9
    check-cast p5, Ljava/util/List;

    .line 10
    .line 11
    check-cast p6, La/yje;

    .line 12
    .line 13
    new-instance v0, La/sc60;

    .line 14
    .line 15
    iget-object v1, p0, La/sc60;->n:La/rrd;

    .line 16
    .line 17
    iget-object p0, p0, La/sc60;->o:Ljava/lang/String;

    .line 18
    .line 19
    invoke-direct {v0, v1, p0, p6}, La/sc60;-><init>(La/rrd;Ljava/lang/String;La/yje;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, v0, La/sc60;->i:Ljava/util/List;

    .line 23
    .line 24
    iput-object p2, v0, La/sc60;->j:Ljava/util/List;

    .line 25
    .line 26
    iput-object p3, v0, La/sc60;->k:Ljava/util/List;

    .line 27
    .line 28
    check-cast p4, Ljava/util/Map;

    .line 29
    .line 30
    iput-object p4, v0, La/sc60;->l:Ljava/util/Map;

    .line 31
    .line 32
    iput-object p5, v0, La/sc60;->m:Ljava/util/List;

    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    invoke-virtual {v0, p0}, La/sc60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method
