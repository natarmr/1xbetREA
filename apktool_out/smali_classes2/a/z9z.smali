.class public final La/z9z;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final b:La/baz;


# direct methods
.method public synthetic constructor <init>(La/baz;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/z9z;->a:B

    iput-object p1, p0, La/z9z;->b:La/baz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/z9z;->a:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v0, v0, La/z9z;->b:La/baz;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p1

    .line 13
    .line 14
    check-cast v1, La/g950;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance v2, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iget-object v3, v0, La/baz;->g:La/xg;

    .line 25
    .line 26
    invoke-virtual {v3, v1}, La/xg;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {v0, v1, v2}, La/baz;->n(La/g950;Ljava/util/ArrayList;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, La/baz;->q()La/vjj;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    sget v3, La/oek;->a:I

    .line 43
    .line 44
    sget-object v3, La/slc;->e:La/slc;

    .line 45
    .line 46
    invoke-static {v1, v3}, La/oek;->m(La/vjj;La/slc;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    iget-object v0, v0, La/baz;->b:La/f7u;

    .line 58
    .line 59
    iget-object v1, v0, La/f7u;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v1, La/v7i;

    .line 62
    .line 63
    iget-object v1, v1, La/v7i;->a:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, La/cge0;

    .line 66
    .line 67
    invoke-virtual {v1, v0, v2}, La/cge0;->e(La/f7u;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    :goto_0
    return-object v0

    .line 76
    :pswitch_0
    move-object/from16 v1, p1

    .line 77
    .line 78
    check-cast v1, La/g950;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 84
    .line 85
    iget-object v5, v0, La/baz;->f:La/zt00;

    .line 86
    .line 87
    invoke-virtual {v5, v1}, La/zt00;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    check-cast v5, Ljava/util/Collection;

    .line 92
    .line 93
    invoke-direct {v4, v5}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 94
    .line 95
    .line 96
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 97
    .line 98
    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    if-eqz v7, :cond_3

    .line 110
    .line 111
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    move-object v8, v7

    .line 116
    check-cast v8, La/fyj0;

    .line 117
    .line 118
    invoke-static {v8, v2}, La/m7x;->w(La/mer;I)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    invoke-virtual {v5, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v9

    .line 126
    if-nez v9, :cond_2

    .line 127
    .line 128
    new-instance v9, Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-interface {v5, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    :cond_2
    check-cast v9, Ljava/util/List;

    .line 137
    .line 138
    invoke-interface {v9, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_3
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    :cond_4
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    if-eqz v5, :cond_5

    .line 155
    .line 156
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    check-cast v5, Ljava/util/List;

    .line 161
    .line 162
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    if-eq v6, v3, :cond_4

    .line 167
    .line 168
    sget-object v6, La/j9x;->v:La/j9x;

    .line 169
    .line 170
    invoke-static {v5, v6}, La/m2x;->D(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    invoke-interface {v4, v5}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 175
    .line 176
    .line 177
    invoke-interface {v4, v6}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 178
    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_5
    invoke-virtual {v0, v4, v1}, La/baz;->m(Ljava/util/LinkedHashSet;La/g950;)V

    .line 182
    .line 183
    .line 184
    iget-object v0, v0, La/baz;->b:La/f7u;

    .line 185
    .line 186
    iget-object v1, v0, La/f7u;->b:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v1, La/v7i;

    .line 189
    .line 190
    iget-object v1, v1, La/v7i;->a:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v1, La/cge0;

    .line 193
    .line 194
    invoke-virtual {v1, v0, v4}, La/cge0;->e(La/f7u;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    return-object v0

    .line 203
    :pswitch_1
    move-object/from16 v1, p1

    .line 204
    .line 205
    check-cast v1, La/g950;

    .line 206
    .line 207
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    iget-object v4, v0, La/baz;->c:La/baz;

    .line 211
    .line 212
    if-eqz v4, :cond_6

    .line 213
    .line 214
    iget-object v0, v4, La/baz;->g:La/xg;

    .line 215
    .line 216
    invoke-virtual {v0, v1}, La/xg;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    check-cast v0, La/d0d0;

    .line 221
    .line 222
    goto/16 :goto_c

    .line 223
    .line 224
    :cond_6
    iget-object v4, v0, La/baz;->e:La/cu00;

    .line 225
    .line 226
    invoke-virtual {v4}, La/cu00;->invoke()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    check-cast v4, La/ckj;

    .line 231
    .line 232
    invoke-interface {v4, v1}, La/ckj;->b(La/g950;)La/sqe0;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    const/4 v4, 0x0

    .line 237
    if-eqz v1, :cond_17

    .line 238
    .line 239
    iget-object v5, v1, La/sqe0;->a:Ljava/lang/reflect/Field;

    .line 240
    .line 241
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->isEnumConstant()Z

    .line 242
    .line 243
    .line 244
    move-result v6

    .line 245
    if-nez v6, :cond_17

    .line 246
    .line 247
    new-instance v6, La/mie0;

    .line 248
    .line 249
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v1}, La/sqe0;->b()Ljava/lang/reflect/Member;

    .line 253
    .line 254
    .line 255
    move-result-object v7

    .line 256
    check-cast v7, Ljava/lang/reflect/Field;

    .line 257
    .line 258
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 259
    .line 260
    .line 261
    move-result v7

    .line 262
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 263
    .line 264
    .line 265
    move-result v7

    .line 266
    xor-int/lit8 v11, v7, 0x1

    .line 267
    .line 268
    iget-object v7, v0, La/baz;->b:La/f7u;

    .line 269
    .line 270
    invoke-static {v7, v1}, La/r8x;->W(La/f7u;La/m8y;)La/j9z;

    .line 271
    .line 272
    .line 273
    move-result-object v9

    .line 274
    iget-object v8, v7, La/f7u;->b:Ljava/lang/Object;

    .line 275
    .line 276
    move-object v15, v8

    .line 277
    check-cast v15, La/v7i;

    .line 278
    .line 279
    invoke-virtual {v0}, La/baz;->q()La/vjj;

    .line 280
    .line 281
    .line 282
    move-result-object v8

    .line 283
    sget-object v10, La/gm40;->a:La/evz;

    .line 284
    .line 285
    invoke-virtual {v1}, La/uqe0;->e()La/xj;

    .line 286
    .line 287
    .line 288
    move-result-object v10

    .line 289
    invoke-static {v10}, La/u4n0;->u(La/xj;)La/tek;

    .line 290
    .line 291
    .line 292
    move-result-object v10

    .line 293
    invoke-virtual {v1}, La/uqe0;->c()La/g950;

    .line 294
    .line 295
    .line 296
    move-result-object v12

    .line 297
    invoke-static {v1}, La/m2a;->v(La/x8y;)La/rog0;

    .line 298
    .line 299
    .line 300
    move-result-object v13

    .line 301
    invoke-virtual {v1}, La/sqe0;->b()Ljava/lang/reflect/Member;

    .line 302
    .line 303
    .line 304
    move-result-object v14

    .line 305
    check-cast v14, Ljava/lang/reflect/Field;

    .line 306
    .line 307
    invoke-virtual {v14}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 308
    .line 309
    .line 310
    move-result v14

    .line 311
    invoke-static {v14}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 312
    .line 313
    .line 314
    move-result v14

    .line 315
    move/from16 v16, v2

    .line 316
    .line 317
    const/4 v2, 0x0

    .line 318
    if-eqz v14, :cond_7

    .line 319
    .line 320
    invoke-virtual {v1}, La/sqe0;->b()Ljava/lang/reflect/Member;

    .line 321
    .line 322
    .line 323
    move-result-object v14

    .line 324
    check-cast v14, Ljava/lang/reflect/Field;

    .line 325
    .line 326
    invoke-virtual {v14}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 327
    .line 328
    .line 329
    move-result v14

    .line 330
    invoke-static {v14}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 331
    .line 332
    .line 333
    move-result v14

    .line 334
    if-eqz v14, :cond_7

    .line 335
    .line 336
    move v14, v3

    .line 337
    goto :goto_3

    .line 338
    :cond_7
    move v14, v2

    .line 339
    :goto_3
    invoke-static/range {v8 .. v14}, La/x9y;->x1(La/vjj;La/j9z;La/tek;ZLa/g950;La/rog0;Z)La/x9y;

    .line 340
    .line 341
    .line 342
    move-result-object v8

    .line 343
    iput-object v8, v6, La/mie0;->a:Ljava/lang/Object;

    .line 344
    .line 345
    invoke-virtual {v8, v4, v4, v4, v4}, La/f0d0;->t1(La/g0d0;La/n0d0;La/tqp;La/tqp;)V

    .line 346
    .line 347
    .line 348
    iget-object v8, v7, La/f7u;->e:Ljava/lang/Object;

    .line 349
    .line 350
    check-cast v8, La/nvu;

    .line 351
    .line 352
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    .line 353
    .line 354
    .line 355
    move-result-object v5

    .line 356
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 357
    .line 358
    .line 359
    instance-of v9, v5, Ljava/lang/Class;

    .line 360
    .line 361
    if-eqz v9, :cond_8

    .line 362
    .line 363
    move-object v10, v5

    .line 364
    check-cast v10, Ljava/lang/Class;

    .line 365
    .line 366
    invoke-virtual {v10}, Ljava/lang/Class;->isPrimitive()Z

    .line 367
    .line 368
    .line 369
    move-result v11

    .line 370
    if-eqz v11, :cond_8

    .line 371
    .line 372
    new-instance v5, La/xqe0;

    .line 373
    .line 374
    invoke-direct {v5, v10}, La/xqe0;-><init>(Ljava/lang/Class;)V

    .line 375
    .line 376
    .line 377
    goto :goto_6

    .line 378
    :cond_8
    instance-of v10, v5, Ljava/lang/reflect/GenericArrayType;

    .line 379
    .line 380
    if-nez v10, :cond_b

    .line 381
    .line 382
    if-eqz v9, :cond_9

    .line 383
    .line 384
    move-object v9, v5

    .line 385
    check-cast v9, Ljava/lang/Class;

    .line 386
    .line 387
    invoke-virtual {v9}, Ljava/lang/Class;->isArray()Z

    .line 388
    .line 389
    .line 390
    move-result v9

    .line 391
    if-eqz v9, :cond_9

    .line 392
    .line 393
    goto :goto_5

    .line 394
    :cond_9
    instance-of v9, v5, Ljava/lang/reflect/WildcardType;

    .line 395
    .line 396
    if-eqz v9, :cond_a

    .line 397
    .line 398
    new-instance v9, La/cre0;

    .line 399
    .line 400
    check-cast v5, Ljava/lang/reflect/WildcardType;

    .line 401
    .line 402
    invoke-direct {v9, v5}, La/cre0;-><init>(Ljava/lang/reflect/WildcardType;)V

    .line 403
    .line 404
    .line 405
    :goto_4
    move-object v5, v9

    .line 406
    goto :goto_6

    .line 407
    :cond_a
    new-instance v9, La/oqe0;

    .line 408
    .line 409
    invoke-direct {v9, v5}, La/oqe0;-><init>(Ljava/lang/reflect/Type;)V

    .line 410
    .line 411
    .line 412
    goto :goto_4

    .line 413
    :cond_b
    :goto_5
    new-instance v9, La/gqe0;

    .line 414
    .line 415
    invoke-direct {v9, v5}, La/gqe0;-><init>(Ljava/lang/reflect/Type;)V

    .line 416
    .line 417
    .line 418
    goto :goto_4

    .line 419
    :goto_6
    sget-object v9, La/b0t0;->b:La/b0t0;

    .line 420
    .line 421
    const/4 v10, 0x7

    .line 422
    invoke-static {v9, v2, v4, v10}, La/xvw;->Y(La/b0t0;ZLa/gaz;I)La/fay;

    .line 423
    .line 424
    .line 425
    move-result-object v9

    .line 426
    invoke-virtual {v8, v5, v9}, La/nvu;->V(La/zqe0;La/fay;)La/wsy;

    .line 427
    .line 428
    .line 429
    move-result-object v18

    .line 430
    invoke-static/range {v18 .. v18}, La/ary;->H(La/wsy;)Z

    .line 431
    .line 432
    .line 433
    move-result v5

    .line 434
    if-nez v5, :cond_c

    .line 435
    .line 436
    invoke-static/range {v18 .. v18}, La/ary;->I(La/wsy;)Z

    .line 437
    .line 438
    .line 439
    move-result v5

    .line 440
    if-eqz v5, :cond_d

    .line 441
    .line 442
    :cond_c
    invoke-virtual {v1}, La/sqe0;->b()Ljava/lang/reflect/Member;

    .line 443
    .line 444
    .line 445
    move-result-object v5

    .line 446
    check-cast v5, Ljava/lang/reflect/Field;

    .line 447
    .line 448
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 449
    .line 450
    .line 451
    move-result v5

    .line 452
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 453
    .line 454
    .line 455
    move-result v5

    .line 456
    if-eqz v5, :cond_d

    .line 457
    .line 458
    invoke-virtual {v1}, La/sqe0;->b()Ljava/lang/reflect/Member;

    .line 459
    .line 460
    .line 461
    move-result-object v5

    .line 462
    check-cast v5, Ljava/lang/reflect/Field;

    .line 463
    .line 464
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 465
    .line 466
    .line 467
    move-result v5

    .line 468
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 469
    .line 470
    .line 471
    move-result v5

    .line 472
    :cond_d
    iget-object v5, v6, La/mie0;->a:Ljava/lang/Object;

    .line 473
    .line 474
    move-object/from16 v17, v5

    .line 475
    .line 476
    check-cast v17, La/f0d0;

    .line 477
    .line 478
    sget-object v19, La/iun;->a:La/iun;

    .line 479
    .line 480
    invoke-virtual {v0}, La/baz;->p()La/c8z;

    .line 481
    .line 482
    .line 483
    move-result-object v20

    .line 484
    const/16 v21, 0x0

    .line 485
    .line 486
    move-object/from16 v22, v19

    .line 487
    .line 488
    invoke-virtual/range {v17 .. v22}, La/f0d0;->w1(La/wsy;Ljava/util/List;La/c8z;La/c8z;Ljava/util/List;)V

    .line 489
    .line 490
    .line 491
    invoke-virtual {v0}, La/baz;->q()La/vjj;

    .line 492
    .line 493
    .line 494
    move-result-object v5

    .line 495
    instance-of v8, v5, La/wm40;

    .line 496
    .line 497
    if-eqz v8, :cond_e

    .line 498
    .line 499
    check-cast v5, La/wm40;

    .line 500
    .line 501
    goto :goto_7

    .line 502
    :cond_e
    move-object v5, v4

    .line 503
    :goto_7
    if-eqz v5, :cond_f

    .line 504
    .line 505
    iget-object v8, v15, La/v7i;->o:Ljava/lang/Object;

    .line 506
    .line 507
    check-cast v8, La/e6o0;

    .line 508
    .line 509
    iget-object v9, v6, La/mie0;->a:Ljava/lang/Object;

    .line 510
    .line 511
    check-cast v9, La/f0d0;

    .line 512
    .line 513
    check-cast v8, La/kld;

    .line 514
    .line 515
    invoke-virtual {v8, v5, v9, v7}, La/kld;->h(La/wm40;La/f0d0;La/f7u;)La/f0d0;

    .line 516
    .line 517
    .line 518
    move-result-object v5

    .line 519
    iput-object v5, v6, La/mie0;->a:Ljava/lang/Object;

    .line 520
    .line 521
    :cond_f
    iget-object v5, v6, La/mie0;->a:Ljava/lang/Object;

    .line 522
    .line 523
    move-object v7, v5

    .line 524
    check-cast v7, La/r3u0;

    .line 525
    .line 526
    check-cast v5, La/f0d0;

    .line 527
    .line 528
    invoke-virtual {v5}, La/s3u0;->getType()La/wsy;

    .line 529
    .line 530
    .line 531
    move-result-object v5

    .line 532
    if-eqz v7, :cond_16

    .line 533
    .line 534
    if-eqz v5, :cond_15

    .line 535
    .line 536
    sget v8, La/oek;->a:I

    .line 537
    .line 538
    invoke-interface {v7}, La/r3u0;->E()Z

    .line 539
    .line 540
    .line 541
    move-result v8

    .line 542
    if-nez v8, :cond_13

    .line 543
    .line 544
    invoke-static {v5}, La/bdx;->k0(La/wsy;)Z

    .line 545
    .line 546
    .line 547
    move-result v8

    .line 548
    if-eqz v8, :cond_10

    .line 549
    .line 550
    goto :goto_9

    .line 551
    :cond_10
    invoke-static {v5}, La/e0t0;->b(La/wsy;)Z

    .line 552
    .line 553
    .line 554
    move-result v8

    .line 555
    if-eqz v8, :cond_11

    .line 556
    .line 557
    goto :goto_8

    .line 558
    :cond_11
    sget v8, La/rek;->a:I

    .line 559
    .line 560
    invoke-static {v7}, La/oek;->c(La/vjj;)La/ym40;

    .line 561
    .line 562
    .line 563
    move-result-object v7

    .line 564
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 565
    .line 566
    .line 567
    invoke-interface {v7}, La/ym40;->c()La/ary;

    .line 568
    .line 569
    .line 570
    move-result-object v7

    .line 571
    invoke-static {v5}, La/ary;->H(La/wsy;)Z

    .line 572
    .line 573
    .line 574
    move-result v8

    .line 575
    if-nez v8, :cond_12

    .line 576
    .line 577
    sget-object v8, La/ysy;->a:La/lm50;

    .line 578
    .line 579
    invoke-virtual {v7}, La/ary;->v()La/kzj0;

    .line 580
    .line 581
    .line 582
    move-result-object v9

    .line 583
    invoke-virtual {v8, v9, v5}, La/lm50;->a(La/wsy;La/wsy;)Z

    .line 584
    .line 585
    .line 586
    move-result v9

    .line 587
    if-nez v9, :cond_12

    .line 588
    .line 589
    const-string v9, "Number"

    .line 590
    .line 591
    invoke-virtual {v7, v9}, La/ary;->k(Ljava/lang/String;)La/wm40;

    .line 592
    .line 593
    .line 594
    move-result-object v9

    .line 595
    invoke-virtual {v9}, La/wm40;->I()La/kzj0;

    .line 596
    .line 597
    .line 598
    move-result-object v9

    .line 599
    invoke-virtual {v8, v9, v5}, La/lm50;->a(La/wsy;La/wsy;)Z

    .line 600
    .line 601
    .line 602
    move-result v9

    .line 603
    if-nez v9, :cond_12

    .line 604
    .line 605
    invoke-virtual {v7}, La/ary;->e()La/kzj0;

    .line 606
    .line 607
    .line 608
    move-result-object v7

    .line 609
    invoke-virtual {v8, v7, v5}, La/lm50;->a(La/wsy;La/wsy;)Z

    .line 610
    .line 611
    .line 612
    move-result v7

    .line 613
    if-nez v7, :cond_12

    .line 614
    .line 615
    invoke-static {v5}, La/nft0;->a(La/wsy;)Z

    .line 616
    .line 617
    .line 618
    move-result v5

    .line 619
    if-eqz v5, :cond_13

    .line 620
    .line 621
    :cond_12
    :goto_8
    iget-object v5, v6, La/mie0;->a:Ljava/lang/Object;

    .line 622
    .line 623
    check-cast v5, La/f0d0;

    .line 624
    .line 625
    new-instance v7, La/kch;

    .line 626
    .line 627
    const/4 v8, 0x4

    .line 628
    invoke-direct {v7, v0, v1, v6, v8}, La/kch;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 629
    .line 630
    .line 631
    invoke-virtual {v5, v4, v7}, La/f0d0;->u1(La/bu00;Lkotlin/jvm/functions/Function0;)V

    .line 632
    .line 633
    .line 634
    :cond_13
    :goto_9
    iget-object v0, v6, La/mie0;->a:Ljava/lang/Object;

    .line 635
    .line 636
    move-object v1, v0

    .line 637
    check-cast v1, La/d0d0;

    .line 638
    .line 639
    if-eqz v1, :cond_14

    .line 640
    .line 641
    check-cast v0, La/d0d0;

    .line 642
    .line 643
    goto :goto_c

    .line 644
    :cond_14
    const/4 v0, 0x3

    .line 645
    new-array v0, v0, [Ljava/lang/Object;

    .line 646
    .line 647
    const/4 v1, 0x6

    .line 648
    packed-switch v1, :pswitch_data_1

    .line 649
    .line 650
    .line 651
    const-string v4, "fqName"

    .line 652
    .line 653
    aput-object v4, v0, v2

    .line 654
    .line 655
    goto :goto_a

    .line 656
    :pswitch_2
    const-string v4, "javaClass"

    .line 657
    .line 658
    aput-object v4, v0, v2

    .line 659
    .line 660
    goto :goto_a

    .line 661
    :pswitch_3
    const-string v4, "field"

    .line 662
    .line 663
    aput-object v4, v0, v2

    .line 664
    .line 665
    goto :goto_a

    .line 666
    :pswitch_4
    const-string v4, "element"

    .line 667
    .line 668
    aput-object v4, v0, v2

    .line 669
    .line 670
    goto :goto_a

    .line 671
    :pswitch_5
    const-string v4, "descriptor"

    .line 672
    .line 673
    aput-object v4, v0, v2

    .line 674
    .line 675
    goto :goto_a

    .line 676
    :pswitch_6
    const-string v4, "member"

    .line 677
    .line 678
    aput-object v4, v0, v2

    .line 679
    .line 680
    :goto_a
    const-string v2, "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1"

    .line 681
    .line 682
    aput-object v2, v0, v3

    .line 683
    .line 684
    packed-switch v1, :pswitch_data_2

    .line 685
    .line 686
    .line 687
    const-string v1, "getClassResolvedFromSource"

    .line 688
    .line 689
    aput-object v1, v0, v16

    .line 690
    .line 691
    goto :goto_b

    .line 692
    :pswitch_7
    const-string v1, "recordClass"

    .line 693
    .line 694
    aput-object v1, v0, v16

    .line 695
    .line 696
    goto :goto_b

    .line 697
    :pswitch_8
    const-string v1, "recordField"

    .line 698
    .line 699
    aput-object v1, v0, v16

    .line 700
    .line 701
    goto :goto_b

    .line 702
    :pswitch_9
    const-string v1, "recordConstructor"

    .line 703
    .line 704
    aput-object v1, v0, v16

    .line 705
    .line 706
    goto :goto_b

    .line 707
    :pswitch_a
    const-string v1, "recordMethod"

    .line 708
    .line 709
    aput-object v1, v0, v16

    .line 710
    .line 711
    :goto_b
    const-string v1, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    .line 712
    .line 713
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 714
    .line 715
    .line 716
    move-result-object v0

    .line 717
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 718
    .line 719
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 720
    .line 721
    .line 722
    throw v1

    .line 723
    :cond_15
    const/16 v0, 0x42

    .line 724
    .line 725
    invoke-static {v0}, La/oek;->a(I)V

    .line 726
    .line 727
    .line 728
    throw v4

    .line 729
    :cond_16
    const/16 v0, 0x41

    .line 730
    .line 731
    invoke-static {v0}, La/oek;->a(I)V

    .line 732
    .line 733
    .line 734
    throw v4

    .line 735
    :cond_17
    move-object v0, v4

    .line 736
    :goto_c
    return-object v0

    .line 737
    :pswitch_b
    move-object/from16 v1, p1

    .line 738
    .line 739
    check-cast v1, La/g950;

    .line 740
    .line 741
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 742
    .line 743
    .line 744
    iget-object v2, v0, La/baz;->c:La/baz;

    .line 745
    .line 746
    if-eqz v2, :cond_18

    .line 747
    .line 748
    iget-object v0, v2, La/baz;->f:La/zt00;

    .line 749
    .line 750
    invoke-virtual {v0, v1}, La/zt00;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 751
    .line 752
    .line 753
    move-result-object v0

    .line 754
    check-cast v0, Ljava/util/Collection;

    .line 755
    .line 756
    goto :goto_e

    .line 757
    :cond_18
    new-instance v2, Ljava/util/ArrayList;

    .line 758
    .line 759
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 760
    .line 761
    .line 762
    iget-object v3, v0, La/baz;->e:La/cu00;

    .line 763
    .line 764
    invoke-virtual {v3}, La/cu00;->invoke()Ljava/lang/Object;

    .line 765
    .line 766
    .line 767
    move-result-object v3

    .line 768
    check-cast v3, La/ckj;

    .line 769
    .line 770
    invoke-interface {v3, v1}, La/ckj;->d(La/g950;)Ljava/util/Collection;

    .line 771
    .line 772
    .line 773
    move-result-object v3

    .line 774
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 775
    .line 776
    .line 777
    move-result-object v3

    .line 778
    :cond_19
    :goto_d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 779
    .line 780
    .line 781
    move-result v4

    .line 782
    if-eqz v4, :cond_1a

    .line 783
    .line 784
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    move-result-object v4

    .line 788
    check-cast v4, La/vqe0;

    .line 789
    .line 790
    invoke-virtual {v0, v4}, La/baz;->t(La/vqe0;)La/u9y;

    .line 791
    .line 792
    .line 793
    move-result-object v4

    .line 794
    invoke-virtual {v0, v4}, La/baz;->r(La/u9y;)Z

    .line 795
    .line 796
    .line 797
    move-result v5

    .line 798
    if-eqz v5, :cond_19

    .line 799
    .line 800
    iget-object v5, v0, La/baz;->b:La/f7u;

    .line 801
    .line 802
    iget-object v5, v5, La/f7u;->b:Ljava/lang/Object;

    .line 803
    .line 804
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 805
    .line 806
    .line 807
    goto :goto_d

    .line 808
    :cond_1a
    invoke-virtual {v0, v1, v2}, La/baz;->j(La/g950;Ljava/util/ArrayList;)V

    .line 809
    .line 810
    .line 811
    move-object v0, v2

    .line 812
    :goto_e
    return-object v0

    .line 813
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_5
        :pswitch_3
        :pswitch_5
        :pswitch_2
        :pswitch_5
    .end packed-switch

    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_7
    .end packed-switch
.end method
