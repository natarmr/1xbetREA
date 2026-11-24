.class public final La/vau;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public synthetic i:La/mi1;

.field public synthetic j:Ljava/util/List;

.field public synthetic k:Ljava/util/List;

.field public final synthetic l:J

.field public final synthetic m:La/qgd;


# direct methods
.method public constructor <init>(JLa/qgd;La/yje;)V
    .locals 0

    .line 1
    iput-wide p1, p0, La/vau;->l:J

    .line 2
    .line 3
    iput-object p3, p0, La/vau;->m:La/qgd;

    .line 4
    .line 5
    const/4 p1, 0x4

    .line 6
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/vau;->i:La/mi1;

    .line 4
    .line 5
    iget-object v2, v0, La/vau;->j:Ljava/util/List;

    .line 6
    .line 7
    iget-object v3, v0, La/vau;->k:Ljava/util/List;

    .line 8
    .line 9
    sget-object v4, La/wne;->a:La/wne;

    .line 10
    .line 11
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object v4, v0, La/vau;->m:La/qgd;

    .line 15
    .line 16
    iget-object v5, v4, La/qgd;->f:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v5, La/pru;

    .line 19
    .line 20
    new-instance v6, Ljava/util/ArrayList;

    .line 21
    .line 22
    const/16 v7, 0xa

    .line 23
    .line 24
    invoke-static {v3, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 25
    .line 26
    .line 27
    move-result v8

    .line 28
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    if-eqz v8, :cond_0

    .line 40
    .line 41
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    check-cast v8, La/ezc0;

    .line 46
    .line 47
    invoke-virtual {v5}, La/pru;->a()La/sff0;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    iget-object v9, v9, La/sff0;->b:La/hl1;

    .line 52
    .line 53
    iget-object v9, v9, La/hl1;->s:La/ai0;

    .line 54
    .line 55
    invoke-static {v9}, La/cjx;->X(La/ai0;)La/mp0;

    .line 56
    .line 57
    .line 58
    move-result-object v9

    .line 59
    invoke-static {v8, v9}, La/l7x;->c0(La/ezc0;La/mp0;)Lorg/xplatform/aggregator/impl/category/presentation/models/PromotedCategoryUiModel;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    iget-object v3, v1, La/mi1;->b:Ljava/util/List;

    .line 68
    .line 69
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    const/4 v8, 0x0

    .line 74
    if-eqz v3, :cond_2

    .line 75
    .line 76
    sget-object v1, La/iun;->a:La/iun;

    .line 77
    .line 78
    new-instance v2, Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-static {v6, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-eqz v4, :cond_1

    .line 96
    .line 97
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    check-cast v4, Lorg/xplatform/aggregator/impl/category/presentation/models/PromotedCategoryUiModel;

    .line 102
    .line 103
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-static {v4, v8}, Lorg/xplatform/aggregator/impl/category/presentation/models/PromotedCategoryUiModel;->a(Lorg/xplatform/aggregator/impl/category/presentation/models/PromotedCategoryUiModel;Z)Lorg/xplatform/aggregator/impl/category/presentation/models/PromotedCategoryUiModel;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_1
    new-instance v3, Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorProvidersFiltersUiModel;

    .line 115
    .line 116
    iget-wide v4, v0, La/vau;->l:J

    .line 117
    .line 118
    invoke-direct {v3, v4, v5, v1, v2}, Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorProvidersFiltersUiModel;-><init>(JLjava/util/List;Ljava/util/List;)V

    .line 119
    .line 120
    .line 121
    return-object v3

    .line 122
    :cond_2
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-eqz v3, :cond_4

    .line 131
    .line 132
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    move-object v10, v3

    .line 137
    check-cast v10, La/x2q;

    .line 138
    .line 139
    iget-object v11, v10, La/x2q;->c:La/w3q;

    .line 140
    .line 141
    sget-object v12, La/w3q;->d:La/w3q;

    .line 142
    .line 143
    if-ne v11, v12, :cond_3

    .line 144
    .line 145
    iget-object v10, v10, La/x2q;->d:Ljava/util/List;

    .line 146
    .line 147
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    .line 148
    .line 149
    .line 150
    move-result v10

    .line 151
    if-nez v10, :cond_3

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_4
    const/4 v3, 0x0

    .line 155
    :goto_2
    check-cast v3, La/x2q;

    .line 156
    .line 157
    iget-object v0, v1, La/mi1;->b:Ljava/util/List;

    .line 158
    .line 159
    new-instance v10, Ljava/util/ArrayList;

    .line 160
    .line 161
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 162
    .line 163
    .line 164
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result v11

    .line 172
    if-eqz v11, :cond_6

    .line 173
    .line 174
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v11

    .line 178
    move-object v12, v11

    .line 179
    check-cast v12, La/x2q;

    .line 180
    .line 181
    iget-object v12, v12, La/x2q;->c:La/w3q;

    .line 182
    .line 183
    sget-object v13, La/w3q;->d:La/w3q;

    .line 184
    .line 185
    if-ne v12, v13, :cond_5

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_5
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_6
    invoke-static {v3}, La/q3d;->k(Ljava/lang/Object;)Ljava/util/List;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-static {v10, v0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-static {v1, v0}, La/mi1;->a(La/mi1;Ljava/util/ArrayList;)La/mi1;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    iget-object v1, v4, La/qgd;->e:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v1, La/ep0;

    .line 207
    .line 208
    invoke-virtual {v5}, La/pru;->a()La/sff0;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    iget-object v3, v3, La/sff0;->b:La/hl1;

    .line 213
    .line 214
    iget-object v3, v3, La/hl1;->v:La/th1;

    .line 215
    .line 216
    invoke-static {v3}, La/aad;->d0(La/th1;)La/rh1;

    .line 217
    .line 218
    .line 219
    move-result-object v18

    .line 220
    iget-wide v3, v0, La/mi1;->a:J

    .line 221
    .line 222
    iget-object v0, v0, La/mi1;->b:Ljava/util/List;

    .line 223
    .line 224
    new-instance v5, Ljava/util/ArrayList;

    .line 225
    .line 226
    invoke-static {v0, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 227
    .line 228
    .line 229
    move-result v10

    .line 230
    invoke-direct {v5, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 231
    .line 232
    .line 233
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 234
    .line 235
    .line 236
    move-result-object v19

    .line 237
    move v10, v8

    .line 238
    :goto_4
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    .line 239
    .line 240
    .line 241
    move-result v11

    .line 242
    if-eqz v11, :cond_21

    .line 243
    .line 244
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v11

    .line 248
    add-int/lit8 v20, v10, 0x1

    .line 249
    .line 250
    if-ltz v10, :cond_20

    .line 251
    .line 252
    check-cast v11, La/x2q;

    .line 253
    .line 254
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 255
    .line 256
    .line 257
    move-result-object v12

    .line 258
    :cond_7
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 259
    .line 260
    .line 261
    move-result v13

    .line 262
    if-eqz v13, :cond_8

    .line 263
    .line 264
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v13

    .line 268
    move-object v14, v13

    .line 269
    check-cast v14, La/x2q;

    .line 270
    .line 271
    iget-object v14, v14, La/x2q;->a:Ljava/lang/String;

    .line 272
    .line 273
    iget-object v15, v11, La/x2q;->a:Ljava/lang/String;

    .line 274
    .line 275
    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v14

    .line 279
    if-eqz v14, :cond_7

    .line 280
    .line 281
    goto :goto_5

    .line 282
    :cond_8
    const/4 v13, 0x0

    .line 283
    :goto_5
    move-object v12, v13

    .line 284
    check-cast v12, La/x2q;

    .line 285
    .line 286
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 287
    .line 288
    .line 289
    move-result-object v13

    .line 290
    move v14, v8

    .line 291
    :goto_6
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 292
    .line 293
    .line 294
    move-result v15

    .line 295
    if-eqz v15, :cond_a

    .line 296
    .line 297
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v15

    .line 301
    check-cast v15, La/x2q;

    .line 302
    .line 303
    iget-object v15, v15, La/x2q;->c:La/w3q;

    .line 304
    .line 305
    const/16 p0, 0x0

    .line 306
    .line 307
    sget-object v9, La/w3q;->a:La/w3q;

    .line 308
    .line 309
    if-ne v15, v9, :cond_9

    .line 310
    .line 311
    goto :goto_7

    .line 312
    :cond_9
    add-int/lit8 v14, v14, 0x1

    .line 313
    .line 314
    goto :goto_6

    .line 315
    :cond_a
    const/16 p0, 0x0

    .line 316
    .line 317
    const/4 v14, -0x1

    .line 318
    :goto_7
    if-ne v10, v14, :cond_b

    .line 319
    .line 320
    iget-object v9, v11, La/x2q;->d:Ljava/util/List;

    .line 321
    .line 322
    new-instance v13, La/o3q;

    .line 323
    .line 324
    const-string v15, "0"

    .line 325
    .line 326
    const-string v8, ""

    .line 327
    .line 328
    invoke-direct {v13, v15, v8}, La/o3q;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    invoke-static {v13}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 332
    .line 333
    .line 334
    move-result-object v8

    .line 335
    invoke-static {v9, v8}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 336
    .line 337
    .line 338
    move-result-object v8

    .line 339
    goto :goto_8

    .line 340
    :cond_b
    iget-object v8, v11, La/x2q;->d:Ljava/util/List;

    .line 341
    .line 342
    :goto_8
    if-ne v10, v14, :cond_c

    .line 343
    .line 344
    sget-object v10, La/ep0;->b:La/ep0;

    .line 345
    .line 346
    if-eq v1, v10, :cond_c

    .line 347
    .line 348
    const/16 v21, 0x1

    .line 349
    .line 350
    goto :goto_9

    .line 351
    :cond_c
    const/16 v21, 0x0

    .line 352
    .line 353
    :goto_9
    iget-object v10, v11, La/x2q;->a:Ljava/lang/String;

    .line 354
    .line 355
    iget-object v13, v11, La/x2q;->c:La/w3q;

    .line 356
    .line 357
    iget-object v11, v11, La/x2q;->b:Ljava/lang/String;

    .line 358
    .line 359
    new-instance v14, Ljava/util/ArrayList;

    .line 360
    .line 361
    invoke-static {v8, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 362
    .line 363
    .line 364
    move-result v15

    .line 365
    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 366
    .line 367
    .line 368
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 369
    .line 370
    .line 371
    move-result-object v8

    .line 372
    :goto_a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 373
    .line 374
    .line 375
    move-result v15

    .line 376
    if-eqz v15, :cond_1f

    .line 377
    .line 378
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v15

    .line 382
    check-cast v15, La/l3q;

    .line 383
    .line 384
    sget-object v7, La/w3q;->b:La/w3q;

    .line 385
    .line 386
    if-ne v13, v7, :cond_11

    .line 387
    .line 388
    instance-of v7, v15, La/s5d0;

    .line 389
    .line 390
    if-eqz v7, :cond_11

    .line 391
    .line 392
    if-eqz v12, :cond_f

    .line 393
    .line 394
    iget-object v7, v12, La/x2q;->d:Ljava/util/List;

    .line 395
    .line 396
    if-eqz v7, :cond_f

    .line 397
    .line 398
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 399
    .line 400
    .line 401
    move-result-object v7

    .line 402
    :goto_b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 403
    .line 404
    .line 405
    move-result v16

    .line 406
    if-eqz v16, :cond_e

    .line 407
    .line 408
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v16

    .line 412
    move-object/from16 v17, v16

    .line 413
    .line 414
    check-cast v17, La/l3q;

    .line 415
    .line 416
    invoke-interface/range {v17 .. v17}, La/l3q;->getId()Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v9

    .line 420
    move-object/from16 v22, v0

    .line 421
    .line 422
    move-object v0, v15

    .line 423
    check-cast v0, La/s5d0;

    .line 424
    .line 425
    iget-object v0, v0, La/s5d0;->a:Ljava/lang/String;

    .line 426
    .line 427
    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    move-result v0

    .line 431
    if-eqz v0, :cond_d

    .line 432
    .line 433
    goto :goto_c

    .line 434
    :cond_d
    move-object/from16 v0, v22

    .line 435
    .line 436
    goto :goto_b

    .line 437
    :cond_e
    move-object/from16 v22, v0

    .line 438
    .line 439
    move-object/from16 v16, p0

    .line 440
    .line 441
    :goto_c
    check-cast v16, La/l3q;

    .line 442
    .line 443
    goto :goto_d

    .line 444
    :cond_f
    move-object/from16 v22, v0

    .line 445
    .line 446
    move-object/from16 v16, p0

    .line 447
    .line 448
    :goto_d
    move-object v0, v13

    .line 449
    if-eqz v16, :cond_10

    .line 450
    .line 451
    const/4 v13, 0x1

    .line 452
    goto :goto_e

    .line 453
    :cond_10
    const/4 v13, 0x0

    .line 454
    :goto_e
    check-cast v15, La/s5d0;

    .line 455
    .line 456
    move-object v7, v11

    .line 457
    iget-object v11, v15, La/s5d0;->a:Ljava/lang/String;

    .line 458
    .line 459
    move-object v9, v12

    .line 460
    iget-object v12, v15, La/s5d0;->b:Ljava/lang/String;

    .line 461
    .line 462
    move-object/from16 v16, v0

    .line 463
    .line 464
    iget-object v0, v15, La/s5d0;->c:Ljava/lang/String;

    .line 465
    .line 466
    iget-object v15, v15, La/s5d0;->d:Ljava/lang/String;

    .line 467
    .line 468
    move-object/from16 v17, v10

    .line 469
    .line 470
    new-instance v10, Lorg/xplatform/aggregator/impl/category/presentation/models/ProviderUIModel;

    .line 471
    .line 472
    move-object/from16 v23, v14

    .line 473
    .line 474
    const/4 v14, 0x0

    .line 475
    move-object/from16 v24, v17

    .line 476
    .line 477
    const/16 v17, 0x0

    .line 478
    .line 479
    move-object/from16 v32, v15

    .line 480
    .line 481
    move-object v15, v0

    .line 482
    move-object/from16 v0, v24

    .line 483
    .line 484
    move-object/from16 v24, v2

    .line 485
    .line 486
    move-object/from16 v2, v23

    .line 487
    .line 488
    move-object/from16 v23, v1

    .line 489
    .line 490
    move-object v1, v7

    .line 491
    move-object/from16 v7, v16

    .line 492
    .line 493
    move-object/from16 v16, v32

    .line 494
    .line 495
    invoke-direct/range {v10 .. v18}, Lorg/xplatform/aggregator/impl/category/presentation/models/ProviderUIModel;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLa/rh1;)V

    .line 496
    .line 497
    .line 498
    move-object/from16 v16, v8

    .line 499
    .line 500
    goto/16 :goto_17

    .line 501
    .line 502
    :cond_11
    move-object/from16 v22, v0

    .line 503
    .line 504
    move-object/from16 v23, v1

    .line 505
    .line 506
    move-object/from16 v24, v2

    .line 507
    .line 508
    move-object v0, v10

    .line 509
    move-object v1, v11

    .line 510
    move-object v9, v12

    .line 511
    move-object v7, v13

    .line 512
    move-object v2, v14

    .line 513
    sget-object v10, La/w3q;->d:La/w3q;

    .line 514
    .line 515
    if-ne v7, v10, :cond_16

    .line 516
    .line 517
    instance-of v10, v15, La/slk0;

    .line 518
    .line 519
    if-eqz v10, :cond_16

    .line 520
    .line 521
    if-eqz v9, :cond_14

    .line 522
    .line 523
    iget-object v10, v9, La/x2q;->d:Ljava/util/List;

    .line 524
    .line 525
    if-eqz v10, :cond_14

    .line 526
    .line 527
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 528
    .line 529
    .line 530
    move-result-object v10

    .line 531
    :cond_12
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 532
    .line 533
    .line 534
    move-result v11

    .line 535
    if-eqz v11, :cond_13

    .line 536
    .line 537
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v11

    .line 541
    move-object v12, v11

    .line 542
    check-cast v12, La/l3q;

    .line 543
    .line 544
    invoke-interface {v12}, La/l3q;->getId()Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v12

    .line 548
    move-object v13, v15

    .line 549
    check-cast v13, La/slk0;

    .line 550
    .line 551
    iget-object v13, v13, La/slk0;->a:Ljava/lang/String;

    .line 552
    .line 553
    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    move-result v12

    .line 557
    if-eqz v12, :cond_12

    .line 558
    .line 559
    goto :goto_f

    .line 560
    :cond_13
    move-object/from16 v11, p0

    .line 561
    .line 562
    :goto_f
    check-cast v11, La/l3q;

    .line 563
    .line 564
    goto :goto_10

    .line 565
    :cond_14
    move-object/from16 v11, p0

    .line 566
    .line 567
    :goto_10
    if-eqz v11, :cond_15

    .line 568
    .line 569
    const/16 v31, 0x1

    .line 570
    .line 571
    goto :goto_11

    .line 572
    :cond_15
    const/16 v31, 0x0

    .line 573
    .line 574
    :goto_11
    new-instance v25, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;

    .line 575
    .line 576
    check-cast v15, La/slk0;

    .line 577
    .line 578
    iget-object v10, v15, La/slk0;->a:Ljava/lang/String;

    .line 579
    .line 580
    iget-object v11, v15, La/slk0;->b:Ljava/lang/String;

    .line 581
    .line 582
    iget-object v12, v15, La/slk0;->c:Ljava/lang/String;

    .line 583
    .line 584
    iget-object v13, v15, La/slk0;->d:Ljava/lang/String;

    .line 585
    .line 586
    const/16 v28, 0x0

    .line 587
    .line 588
    move-object/from16 v26, v10

    .line 589
    .line 590
    move-object/from16 v27, v11

    .line 591
    .line 592
    move-object/from16 v29, v12

    .line 593
    .line 594
    move-object/from16 v30, v13

    .line 595
    .line 596
    invoke-direct/range {v25 .. v31}, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 597
    .line 598
    .line 599
    move-object/from16 v16, v8

    .line 600
    .line 601
    move-object/from16 v10, v25

    .line 602
    .line 603
    goto/16 :goto_17

    .line 604
    .line 605
    :cond_16
    invoke-interface {v15}, La/l3q;->getId()Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v10

    .line 609
    invoke-interface {v15}, La/l3q;->getName()Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object v11

    .line 613
    if-eqz v9, :cond_19

    .line 614
    .line 615
    iget-object v12, v9, La/x2q;->d:Ljava/util/List;

    .line 616
    .line 617
    if-eqz v12, :cond_19

    .line 618
    .line 619
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    .line 620
    .line 621
    .line 622
    move-result v13

    .line 623
    if-eqz v13, :cond_17

    .line 624
    .line 625
    goto :goto_12

    .line 626
    :cond_17
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 627
    .line 628
    .line 629
    move-result-object v12

    .line 630
    :cond_18
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 631
    .line 632
    .line 633
    move-result v13

    .line 634
    if-eqz v13, :cond_19

    .line 635
    .line 636
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    move-result-object v13

    .line 640
    check-cast v13, La/l3q;

    .line 641
    .line 642
    invoke-interface {v13}, La/l3q;->getId()Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    move-result-object v13

    .line 646
    invoke-interface {v15}, La/l3q;->getId()Ljava/lang/String;

    .line 647
    .line 648
    .line 649
    move-result-object v14

    .line 650
    invoke-static {v13, v14}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 651
    .line 652
    .line 653
    move-result v13

    .line 654
    if-eqz v13, :cond_18

    .line 655
    .line 656
    const/4 v12, 0x1

    .line 657
    goto :goto_13

    .line 658
    :cond_19
    :goto_12
    const/4 v12, 0x0

    .line 659
    :goto_13
    invoke-interface {v15}, La/l3q;->getId()Ljava/lang/String;

    .line 660
    .line 661
    .line 662
    move-result-object v13

    .line 663
    if-nez v21, :cond_1a

    .line 664
    .line 665
    move-object/from16 v16, v8

    .line 666
    .line 667
    move-object/from16 v8, p0

    .line 668
    .line 669
    goto :goto_16

    .line 670
    :cond_1a
    new-instance v14, Ljava/lang/StringBuilder;

    .line 671
    .line 672
    sget-object v15, La/ujn;->h:Ljava/lang/String;

    .line 673
    .line 674
    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 675
    .line 676
    .line 677
    sget-object v15, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 678
    .line 679
    filled-new-array {v13}, [Ljava/lang/Object;

    .line 680
    .line 681
    .line 682
    move-result-object v13

    .line 683
    move-object/from16 v16, v8

    .line 684
    .line 685
    const/4 v8, 0x1

    .line 686
    invoke-static {v13, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    move-result-object v13

    .line 690
    const-string v8, "/static/img/android/casino/alt_design/filter_screen_style/%s.svg"

    .line 691
    .line 692
    invoke-static {v15, v8, v13}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 693
    .line 694
    .line 695
    move-result-object v8

    .line 696
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 697
    .line 698
    .line 699
    move-result v13

    .line 700
    if-nez v13, :cond_1b

    .line 701
    .line 702
    const/4 v13, 0x0

    .line 703
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 704
    .line 705
    .line 706
    goto :goto_15

    .line 707
    :cond_1b
    const/4 v13, 0x0

    .line 708
    sget-object v15, La/ujn;->h:Ljava/lang/String;

    .line 709
    .line 710
    invoke-static {v8, v15, v13}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 711
    .line 712
    .line 713
    move-result v15

    .line 714
    if-nez v15, :cond_1e

    .line 715
    .line 716
    const-string v15, "https://"

    .line 717
    .line 718
    invoke-static {v8, v15, v13}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 719
    .line 720
    .line 721
    move-result v15

    .line 722
    if-eqz v15, :cond_1c

    .line 723
    .line 724
    const/4 v13, 0x0

    .line 725
    goto :goto_14

    .line 726
    :cond_1c
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->length()I

    .line 727
    .line 728
    .line 729
    move-result v13

    .line 730
    const/16 v15, 0x2f

    .line 731
    .line 732
    if-lez v13, :cond_1d

    .line 733
    .line 734
    const-string v13, "/"

    .line 735
    .line 736
    invoke-static {v14, v13}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 737
    .line 738
    .line 739
    move-result v13

    .line 740
    if-nez v13, :cond_1d

    .line 741
    .line 742
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 743
    .line 744
    .line 745
    :cond_1d
    move/from16 v17, v15

    .line 746
    .line 747
    const/4 v13, 0x1

    .line 748
    new-array v15, v13, [C

    .line 749
    .line 750
    const/4 v13, 0x0

    .line 751
    aput-char v17, v15, v13

    .line 752
    .line 753
    invoke-static {v8, v15}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 754
    .line 755
    .line 756
    move-result-object v8

    .line 757
    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 758
    .line 759
    .line 760
    goto :goto_15

    .line 761
    :cond_1e
    :goto_14
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 762
    .line 763
    .line 764
    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 765
    .line 766
    .line 767
    :goto_15
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 768
    .line 769
    .line 770
    move-result-object v8

    .line 771
    :goto_16
    new-instance v13, Lorg/xplatform/aggregator/impl/category/presentation/models/FilterUiModel;

    .line 772
    .line 773
    invoke-direct {v13, v10, v11, v8, v12}, Lorg/xplatform/aggregator/impl/category/presentation/models/FilterUiModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 774
    .line 775
    .line 776
    move-object v10, v13

    .line 777
    :goto_17
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 778
    .line 779
    .line 780
    move-object v10, v0

    .line 781
    move-object v11, v1

    .line 782
    move-object v14, v2

    .line 783
    move-object v13, v7

    .line 784
    move-object v12, v9

    .line 785
    move-object/from16 v8, v16

    .line 786
    .line 787
    move-object/from16 v0, v22

    .line 788
    .line 789
    move-object/from16 v1, v23

    .line 790
    .line 791
    move-object/from16 v2, v24

    .line 792
    .line 793
    const/16 v7, 0xa

    .line 794
    .line 795
    goto/16 :goto_a

    .line 796
    .line 797
    :cond_1f
    move-object/from16 v22, v0

    .line 798
    .line 799
    move-object/from16 v23, v1

    .line 800
    .line 801
    move-object/from16 v24, v2

    .line 802
    .line 803
    move-object v0, v10

    .line 804
    move-object v1, v11

    .line 805
    move-object v7, v13

    .line 806
    move-object v2, v14

    .line 807
    new-instance v8, Lorg/xplatform/aggregator/impl/category/presentation/models/FilterCategoryUiModel;

    .line 808
    .line 809
    invoke-direct {v8, v0, v1, v7, v2}, Lorg/xplatform/aggregator/impl/category/presentation/models/FilterCategoryUiModel;-><init>(Ljava/lang/String;Ljava/lang/String;La/w3q;Ljava/util/List;)V

    .line 810
    .line 811
    .line 812
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 813
    .line 814
    .line 815
    move/from16 v10, v20

    .line 816
    .line 817
    move-object/from16 v0, v22

    .line 818
    .line 819
    move-object/from16 v1, v23

    .line 820
    .line 821
    move-object/from16 v2, v24

    .line 822
    .line 823
    const/16 v7, 0xa

    .line 824
    .line 825
    const/4 v8, 0x0

    .line 826
    goto/16 :goto_4

    .line 827
    .line 828
    :cond_20
    const/16 p0, 0x0

    .line 829
    .line 830
    invoke-static {}, La/q3d;->p()V

    .line 831
    .line 832
    .line 833
    throw p0

    .line 834
    :cond_21
    sget-object v0, La/iun;->a:La/iun;

    .line 835
    .line 836
    new-instance v1, Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorProvidersFiltersUiModel;

    .line 837
    .line 838
    invoke-direct {v1, v3, v4, v5, v0}, Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorProvidersFiltersUiModel;-><init>(JLjava/util/List;Ljava/util/List;)V

    .line 839
    .line 840
    .line 841
    new-instance v0, Ljava/util/ArrayList;

    .line 842
    .line 843
    const/16 v1, 0xa

    .line 844
    .line 845
    invoke-static {v6, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 846
    .line 847
    .line 848
    move-result v1

    .line 849
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 850
    .line 851
    .line 852
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 853
    .line 854
    .line 855
    move-result-object v1

    .line 856
    :goto_18
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 857
    .line 858
    .line 859
    move-result v2

    .line 860
    if-eqz v2, :cond_22

    .line 861
    .line 862
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 863
    .line 864
    .line 865
    move-result-object v2

    .line 866
    check-cast v2, Lorg/xplatform/aggregator/impl/category/presentation/models/PromotedCategoryUiModel;

    .line 867
    .line 868
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 869
    .line 870
    .line 871
    const/4 v13, 0x0

    .line 872
    invoke-static {v2, v13}, Lorg/xplatform/aggregator/impl/category/presentation/models/PromotedCategoryUiModel;->a(Lorg/xplatform/aggregator/impl/category/presentation/models/PromotedCategoryUiModel;Z)Lorg/xplatform/aggregator/impl/category/presentation/models/PromotedCategoryUiModel;

    .line 873
    .line 874
    .line 875
    move-result-object v2

    .line 876
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 877
    .line 878
    .line 879
    goto :goto_18

    .line 880
    :cond_22
    new-instance v1, Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorProvidersFiltersUiModel;

    .line 881
    .line 882
    invoke-direct {v1, v3, v4, v5, v0}, Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorProvidersFiltersUiModel;-><init>(JLjava/util/List;Ljava/util/List;)V

    .line 883
    .line 884
    .line 885
    return-object v1
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, La/mi1;

    .line 2
    .line 3
    check-cast p2, Ljava/util/List;

    .line 4
    .line 5
    check-cast p3, Ljava/util/List;

    .line 6
    .line 7
    check-cast p4, La/yje;

    .line 8
    .line 9
    new-instance v0, La/vau;

    .line 10
    .line 11
    iget-wide v1, p0, La/vau;->l:J

    .line 12
    .line 13
    iget-object p0, p0, La/vau;->m:La/qgd;

    .line 14
    .line 15
    invoke-direct {v0, v1, v2, p0, p4}, La/vau;-><init>(JLa/qgd;La/yje;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, v0, La/vau;->i:La/mi1;

    .line 19
    .line 20
    iput-object p2, v0, La/vau;->j:Ljava/util/List;

    .line 21
    .line 22
    iput-object p3, v0, La/vau;->k:Ljava/util/List;

    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    invoke-virtual {v0, p0}, La/vau;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method
