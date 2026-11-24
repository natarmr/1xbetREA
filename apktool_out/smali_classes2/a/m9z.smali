.class public final La/m9z;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final b:La/f7u;

.field public final c:La/p9z;


# direct methods
.method public constructor <init>(La/f7u;La/p9z;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/m9z;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/m9z;->b:La/f7u;

    .line 8
    .line 9
    iput-object p2, p0, La/m9z;->c:La/p9z;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(La/p9z;La/f7u;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/m9z;->a:B

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/m9z;->c:La/p9z;

    iput-object p2, p0, La/m9z;->b:La/f7u;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/m9z;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/m9z;->b:La/f7u;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v1, v2, La/f7u;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, La/v7i;

    .line 13
    .line 14
    iget-object v1, v1, La/v7i;->o:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, La/e6o0;

    .line 17
    .line 18
    iget-object v0, v0, La/m9z;->c:La/p9z;

    .line 19
    .line 20
    iget-object v0, v0, La/p9z;->n:La/wm40;

    .line 21
    .line 22
    check-cast v1, La/kld;

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, La/kld;->f(La/wm40;La/f7u;)Ljava/util/ArrayList;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0

    .line 33
    :pswitch_0
    sget-object v7, La/ujn;->c:La/f93;

    .line 34
    .line 35
    iget-object v0, v0, La/m9z;->c:La/p9z;

    .line 36
    .line 37
    iget-object v1, v0, La/p9z;->o:La/mqe0;

    .line 38
    .line 39
    iget-object v15, v0, La/baz;->b:La/f7u;

    .line 40
    .line 41
    iget-object v3, v0, La/p9z;->n:La/wm40;

    .line 42
    .line 43
    iget-object v4, v1, La/mqe0;->a:Ljava/lang/Class;

    .line 44
    .line 45
    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-static {v4}, La/tx3;->t([Ljava/lang/Object;)Lkotlin/sequences/Sequence;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    sget-object v5, La/hqe0;->a:La/hqe0;

    .line 57
    .line 58
    invoke-static {v4, v5}, La/pgi0;->i(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/c5q;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    sget-object v5, La/iqe0;->a:La/iqe0;

    .line 63
    .line 64
    invoke-static {v4, v5}, La/pgi0;->p(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/qls0;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-static {v4}, La/pgi0;->t(Lkotlin/sequences/Sequence;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    new-instance v5, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 79
    .line 80
    .line 81
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    const/4 v9, 0x1

    .line 90
    const/4 v10, 0x0

    .line 91
    if-eqz v6, :cond_5

    .line 92
    .line 93
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    check-cast v6, La/pqe0;

    .line 98
    .line 99
    invoke-static {v15, v6}, La/r8x;->W(La/f7u;La/m8y;)La/j9z;

    .line 100
    .line 101
    .line 102
    move-result-object v11

    .line 103
    invoke-static {v6}, La/m2a;->v(La/x8y;)La/rog0;

    .line 104
    .line 105
    .line 106
    move-result-object v12

    .line 107
    invoke-static {v3, v11, v10, v12}, La/p8y;->F1(La/wm40;La/g93;ZLa/rog0;)La/p8y;

    .line 108
    .line 109
    .line 110
    move-result-object v11

    .line 111
    invoke-virtual {v3}, La/wm40;->M()Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v12

    .line 115
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 116
    .line 117
    .line 118
    move-result v12

    .line 119
    iget-object v13, v15, La/f7u;->d:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v13, La/a8z;

    .line 122
    .line 123
    iget-object v14, v15, La/f7u;->b:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v14, La/v7i;

    .line 126
    .line 127
    new-instance v8, La/ucs0;

    .line 128
    .line 129
    invoke-direct {v8, v15, v11, v6, v12}, La/ucs0;-><init>(La/f7u;La/vjj;La/hay;I)V

    .line 130
    .line 131
    .line 132
    new-instance v12, La/f7u;

    .line 133
    .line 134
    invoke-direct {v12, v14, v8, v13}, La/f7u;-><init>(La/v7i;La/mzs0;La/a8z;)V

    .line 135
    .line 136
    .line 137
    iget-object v8, v6, La/pqe0;->a:Ljava/lang/reflect/Constructor;

    .line 138
    .line 139
    invoke-virtual {v8}, Ljava/lang/reflect/Constructor;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 140
    .line 141
    .line 142
    move-result-object v13

    .line 143
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    array-length v14, v13

    .line 147
    if-nez v14, :cond_0

    .line 148
    .line 149
    sget-object v8, La/iun;->a:La/iun;

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_0
    invoke-virtual {v8}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    move-result-object v14

    .line 156
    invoke-virtual {v14}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    move-result-object v16

    .line 160
    if-eqz v16, :cond_1

    .line 161
    .line 162
    invoke-virtual {v14}, Ljava/lang/Class;->getModifiers()I

    .line 163
    .line 164
    .line 165
    move-result v14

    .line 166
    invoke-static {v14}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 167
    .line 168
    .line 169
    move-result v14

    .line 170
    if-nez v14, :cond_1

    .line 171
    .line 172
    array-length v14, v13

    .line 173
    invoke-static {v13, v9, v14}, La/qx3;->k([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v9

    .line 177
    move-object v13, v9

    .line 178
    check-cast v13, [Ljava/lang/reflect/Type;

    .line 179
    .line 180
    :cond_1
    invoke-virtual {v8}, Ljava/lang/reflect/Constructor;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 181
    .line 182
    .line 183
    move-result-object v9

    .line 184
    array-length v14, v9

    .line 185
    array-length v10, v13

    .line 186
    if-lt v14, v10, :cond_4

    .line 187
    .line 188
    array-length v10, v9

    .line 189
    array-length v14, v13

    .line 190
    if-le v10, v14, :cond_2

    .line 191
    .line 192
    array-length v10, v9

    .line 193
    array-length v14, v13

    .line 194
    sub-int/2addr v10, v14

    .line 195
    array-length v14, v9

    .line 196
    invoke-static {v9, v10, v14}, La/qx3;->k([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v9

    .line 200
    check-cast v9, [[Ljava/lang/annotation/Annotation;

    .line 201
    .line 202
    :cond_2
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v8}, Ljava/lang/reflect/Constructor;->isVarArgs()Z

    .line 206
    .line 207
    .line 208
    move-result v8

    .line 209
    invoke-virtual {v6, v13, v9, v8}, La/uqe0;->d([Ljava/lang/reflect/Type;[[Ljava/lang/annotation/Annotation;Z)Ljava/util/ArrayList;

    .line 210
    .line 211
    .line 212
    move-result-object v8

    .line 213
    :goto_1
    invoke-static {v12, v11, v8}, La/baz;->u(La/f7u;La/oer;Ljava/util/List;)La/rsq;

    .line 214
    .line 215
    .line 216
    move-result-object v8

    .line 217
    invoke-virtual {v3}, La/wm40;->M()Ljava/util/List;

    .line 218
    .line 219
    .line 220
    move-result-object v9

    .line 221
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v6}, La/pqe0;->getTypeParameters()Ljava/util/ArrayList;

    .line 225
    .line 226
    .line 227
    move-result-object v10

    .line 228
    new-instance v13, Ljava/util/ArrayList;

    .line 229
    .line 230
    const/16 v14, 0xa

    .line 231
    .line 232
    invoke-static {v10, v14}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 233
    .line 234
    .line 235
    move-result v14

    .line 236
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 240
    .line 241
    .line 242
    move-result-object v10

    .line 243
    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 244
    .line 245
    .line 246
    move-result v14

    .line 247
    if-eqz v14, :cond_3

    .line 248
    .line 249
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v14

    .line 253
    check-cast v14, La/are0;

    .line 254
    .line 255
    move-object/from16 v17, v0

    .line 256
    .line 257
    iget-object v0, v12, La/f7u;->c:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v0, La/mzs0;

    .line 260
    .line 261
    invoke-interface {v0, v14}, La/mzs0;->c(La/are0;)La/hzs0;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-object/from16 v0, v17

    .line 272
    .line 273
    goto :goto_2

    .line 274
    :cond_3
    move-object/from16 v17, v0

    .line 275
    .line 276
    invoke-static {v9, v13}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    iget-object v9, v8, La/rsq;->a:Ljava/util/List;

    .line 281
    .line 282
    invoke-virtual {v6}, La/uqe0;->e()La/xj;

    .line 283
    .line 284
    .line 285
    move-result-object v6

    .line 286
    invoke-static {v6}, La/u4n0;->u(La/xj;)La/tek;

    .line 287
    .line 288
    .line 289
    move-result-object v6

    .line 290
    invoke-virtual {v11, v9, v6, v0}, La/flc;->D1(Ljava/util/List;La/tek;Ljava/util/List;)V

    .line 291
    .line 292
    .line 293
    const/4 v0, 0x0

    .line 294
    invoke-virtual {v11, v0}, La/p8y;->v1(Z)V

    .line 295
    .line 296
    .line 297
    iget-boolean v0, v8, La/rsq;->b:Z

    .line 298
    .line 299
    invoke-virtual {v11, v0}, La/p8y;->w1(Z)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v3}, La/wm40;->I()La/kzj0;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    invoke-virtual {v11, v0}, La/oer;->x1(La/kzj0;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-object/from16 v0, v17

    .line 313
    .line 314
    goto/16 :goto_0

    .line 315
    .line 316
    :cond_4
    const-string v0, "Illegal generic signature: "

    .line 317
    .line 318
    invoke-static {v8, v0}, La/e9d0;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    const/4 v8, 0x0

    .line 322
    goto/16 :goto_f

    .line 323
    .line 324
    :cond_5
    move-object/from16 v17, v0

    .line 325
    .line 326
    invoke-virtual {v1}, La/mqe0;->g()Z

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    iget-object v4, v1, La/mqe0;->a:Ljava/lang/Class;

    .line 331
    .line 332
    const/4 v6, 0x6

    .line 333
    if-eqz v0, :cond_b

    .line 334
    .line 335
    iget-object v0, v15, La/f7u;->b:Ljava/lang/Object;

    .line 336
    .line 337
    invoke-static {v1}, La/m2a;->v(La/x8y;)La/rog0;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    invoke-static {v3, v7, v9, v0}, La/p8y;->F1(La/wm40;La/g93;ZLa/rog0;)La/p8y;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    invoke-virtual {v1}, La/mqe0;->f()Ljava/util/ArrayList;

    .line 346
    .line 347
    .line 348
    move-result-object v8

    .line 349
    new-instance v10, Ljava/util/ArrayList;

    .line 350
    .line 351
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 352
    .line 353
    .line 354
    move-result v11

    .line 355
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 356
    .line 357
    .line 358
    sget-object v11, La/b0t0;->b:La/b0t0;

    .line 359
    .line 360
    const/4 v12, 0x0

    .line 361
    const/4 v13, 0x0

    .line 362
    invoke-static {v11, v12, v13, v6}, La/xvw;->Y(La/b0t0;ZLa/gaz;I)La/fay;

    .line 363
    .line 364
    .line 365
    move-result-object v11

    .line 366
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 367
    .line 368
    .line 369
    move-result-object v16

    .line 370
    move v8, v6

    .line 371
    move v6, v12

    .line 372
    :goto_3
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 373
    .line 374
    .line 375
    move-result v14

    .line 376
    if-eqz v14, :cond_6

    .line 377
    .line 378
    add-int/lit8 v18, v6, 0x1

    .line 379
    .line 380
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v14

    .line 384
    check-cast v14, La/yqe0;

    .line 385
    .line 386
    iget-object v8, v15, La/f7u;->e:Ljava/lang/Object;

    .line 387
    .line 388
    check-cast v8, La/nvu;

    .line 389
    .line 390
    invoke-virtual {v14}, La/yqe0;->f()La/zqe0;

    .line 391
    .line 392
    .line 393
    move-result-object v9

    .line 394
    invoke-virtual {v8, v9, v11}, La/nvu;->V(La/zqe0;La/fay;)La/wsy;

    .line 395
    .line 396
    .line 397
    move-result-object v9

    .line 398
    move-object v8, v3

    .line 399
    new-instance v3, La/k3u0;

    .line 400
    .line 401
    move-object/from16 v20, v8

    .line 402
    .line 403
    invoke-virtual {v14}, La/uqe0;->c()La/g950;

    .line 404
    .line 405
    .line 406
    move-result-object v8

    .line 407
    move/from16 v21, v12

    .line 408
    .line 409
    const/4 v12, 0x0

    .line 410
    invoke-static {v14}, La/m2a;->v(La/x8y;)La/rog0;

    .line 411
    .line 412
    .line 413
    move-result-object v14

    .line 414
    move-object/from16 v22, v5

    .line 415
    .line 416
    const/4 v5, 0x0

    .line 417
    move-object/from16 v23, v10

    .line 418
    .line 419
    const/4 v10, 0x0

    .line 420
    move-object/from16 v24, v11

    .line 421
    .line 422
    const/4 v11, 0x0

    .line 423
    move-object/from16 v25, v13

    .line 424
    .line 425
    const/4 v13, 0x0

    .line 426
    move-object/from16 v19, v4

    .line 427
    .line 428
    move-object v4, v0

    .line 429
    move-object/from16 v0, v22

    .line 430
    .line 431
    move-object/from16 v22, v19

    .line 432
    .line 433
    move-object/from16 v19, v1

    .line 434
    .line 435
    move-object/from16 v21, v20

    .line 436
    .line 437
    move-object/from16 v1, v23

    .line 438
    .line 439
    invoke-direct/range {v3 .. v14}, La/k3u0;-><init>(La/kp9;La/k3u0;ILa/g93;La/g950;La/wsy;ZZZLa/wsy;La/gmk0;)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    move-object v5, v0

    .line 446
    move-object v10, v1

    .line 447
    move-object v0, v4

    .line 448
    move/from16 v6, v18

    .line 449
    .line 450
    move-object/from16 v1, v19

    .line 451
    .line 452
    move-object/from16 v3, v21

    .line 453
    .line 454
    move-object/from16 v4, v22

    .line 455
    .line 456
    move-object/from16 v11, v24

    .line 457
    .line 458
    const/4 v8, 0x6

    .line 459
    const/4 v9, 0x1

    .line 460
    const/4 v12, 0x0

    .line 461
    const/4 v13, 0x0

    .line 462
    goto :goto_3

    .line 463
    :cond_6
    move-object/from16 v19, v1

    .line 464
    .line 465
    move-object/from16 v21, v3

    .line 466
    .line 467
    move-object/from16 v22, v4

    .line 468
    .line 469
    move-object v1, v10

    .line 470
    move-object v4, v0

    .line 471
    move-object v0, v5

    .line 472
    invoke-virtual {v4, v12}, La/p8y;->w1(Z)V

    .line 473
    .line 474
    .line 475
    invoke-virtual/range {v21 .. v21}, La/wm40;->getVisibility()La/tek;

    .line 476
    .line 477
    .line 478
    move-result-object v3

    .line 479
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 480
    .line 481
    .line 482
    sget-object v5, La/w8y;->b:La/tek;

    .line 483
    .line 484
    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 485
    .line 486
    .line 487
    move-result v5

    .line 488
    if-eqz v5, :cond_7

    .line 489
    .line 490
    sget-object v3, La/w8y;->c:La/tek;

    .line 491
    .line 492
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 493
    .line 494
    .line 495
    :cond_7
    invoke-virtual {v4, v1, v3}, La/flc;->C1(Ljava/util/List;La/tek;)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {v4, v12}, La/p8y;->v1(Z)V

    .line 499
    .line 500
    .line 501
    invoke-virtual/range {v21 .. v21}, La/wm40;->I()La/kzj0;

    .line 502
    .line 503
    .line 504
    move-result-object v1

    .line 505
    invoke-virtual {v4, v1}, La/oer;->x1(La/kzj0;)V

    .line 506
    .line 507
    .line 508
    const/4 v1, 0x2

    .line 509
    invoke-static {v4, v1}, La/m7x;->w(La/mer;I)Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v3

    .line 513
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 514
    .line 515
    .line 516
    move-result v5

    .line 517
    if-eqz v5, :cond_8

    .line 518
    .line 519
    goto :goto_4

    .line 520
    :cond_8
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 521
    .line 522
    .line 523
    move-result-object v5

    .line 524
    :cond_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 525
    .line 526
    .line 527
    move-result v6

    .line 528
    if-eqz v6, :cond_a

    .line 529
    .line 530
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v6

    .line 534
    check-cast v6, La/flc;

    .line 535
    .line 536
    invoke-static {v6, v1}, La/m7x;->w(La/mer;I)Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v6

    .line 540
    invoke-virtual {v6, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 541
    .line 542
    .line 543
    move-result v6

    .line 544
    if-eqz v6, :cond_9

    .line 545
    .line 546
    goto :goto_5

    .line 547
    :cond_a
    :goto_4
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 548
    .line 549
    .line 550
    iget-object v1, v2, La/f7u;->b:Ljava/lang/Object;

    .line 551
    .line 552
    goto :goto_5

    .line 553
    :cond_b
    move-object/from16 v19, v1

    .line 554
    .line 555
    move-object/from16 v21, v3

    .line 556
    .line 557
    move-object/from16 v22, v4

    .line 558
    .line 559
    move-object v0, v5

    .line 560
    :goto_5
    iget-object v1, v2, La/f7u;->b:Ljava/lang/Object;

    .line 561
    .line 562
    check-cast v1, La/v7i;

    .line 563
    .line 564
    iget-object v1, v1, La/v7i;->o:Ljava/lang/Object;

    .line 565
    .line 566
    check-cast v1, La/e6o0;

    .line 567
    .line 568
    check-cast v1, La/kld;

    .line 569
    .line 570
    move-object/from16 v3, v21

    .line 571
    .line 572
    invoke-virtual {v1, v3, v0, v2}, La/kld;->a(La/wm40;Ljava/util/ArrayList;La/f7u;)V

    .line 573
    .line 574
    .line 575
    iget-object v1, v2, La/f7u;->b:Ljava/lang/Object;

    .line 576
    .line 577
    check-cast v1, La/v7i;

    .line 578
    .line 579
    iget-object v1, v1, La/v7i;->a:Ljava/lang/Object;

    .line 580
    .line 581
    check-cast v1, La/cge0;

    .line 582
    .line 583
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 584
    .line 585
    .line 586
    move-result v4

    .line 587
    if-eqz v4, :cond_15

    .line 588
    .line 589
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->isAnnotation()Z

    .line 590
    .line 591
    .line 592
    move-result v0

    .line 593
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->isInterface()Z

    .line 594
    .line 595
    .line 596
    if-nez v0, :cond_c

    .line 597
    .line 598
    const/4 v8, 0x0

    .line 599
    goto/16 :goto_d

    .line 600
    .line 601
    :cond_c
    iget-object v4, v15, La/f7u;->b:Ljava/lang/Object;

    .line 602
    .line 603
    iget-object v4, v15, La/f7u;->e:Ljava/lang/Object;

    .line 604
    .line 605
    check-cast v4, La/nvu;

    .line 606
    .line 607
    invoke-static/range {v19 .. v19}, La/m2a;->v(La/x8y;)La/rog0;

    .line 608
    .line 609
    .line 610
    move-result-object v5

    .line 611
    const/4 v6, 0x1

    .line 612
    invoke-static {v3, v7, v6, v5}, La/p8y;->F1(La/wm40;La/g93;ZLa/rog0;)La/p8y;

    .line 613
    .line 614
    .line 615
    move-result-object v10

    .line 616
    if-eqz v0, :cond_13

    .line 617
    .line 618
    invoke-virtual/range {v19 .. v19}, La/mqe0;->d()Ljava/util/List;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    new-instance v9, Ljava/util/ArrayList;

    .line 623
    .line 624
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 625
    .line 626
    .line 627
    move-result v5

    .line 628
    invoke-direct {v9, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 629
    .line 630
    .line 631
    sget-object v5, La/b0t0;->b:La/b0t0;

    .line 632
    .line 633
    const/4 v8, 0x6

    .line 634
    const/4 v13, 0x0

    .line 635
    invoke-static {v5, v6, v13, v8}, La/xvw;->Y(La/b0t0;ZLa/gaz;I)La/fay;

    .line 636
    .line 637
    .line 638
    move-result-object v5

    .line 639
    new-instance v6, Ljava/util/ArrayList;

    .line 640
    .line 641
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 642
    .line 643
    .line 644
    new-instance v7, Ljava/util/ArrayList;

    .line 645
    .line 646
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 647
    .line 648
    .line 649
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 650
    .line 651
    .line 652
    move-result-object v0

    .line 653
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 654
    .line 655
    .line 656
    move-result v8

    .line 657
    if-eqz v8, :cond_e

    .line 658
    .line 659
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object v8

    .line 663
    move-object v11, v8

    .line 664
    check-cast v11, La/vqe0;

    .line 665
    .line 666
    invoke-virtual {v11}, La/uqe0;->c()La/g950;

    .line 667
    .line 668
    .line 669
    move-result-object v11

    .line 670
    sget-object v12, La/bey;->b:La/g950;

    .line 671
    .line 672
    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 673
    .line 674
    .line 675
    move-result v11

    .line 676
    if-eqz v11, :cond_d

    .line 677
    .line 678
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 679
    .line 680
    .line 681
    goto :goto_6

    .line 682
    :cond_d
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 683
    .line 684
    .line 685
    goto :goto_6

    .line 686
    :cond_e
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 687
    .line 688
    .line 689
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    move-object v12, v0

    .line 694
    check-cast v12, La/vqe0;

    .line 695
    .line 696
    if-eqz v12, :cond_10

    .line 697
    .line 698
    invoke-virtual {v12}, La/vqe0;->f()La/zqe0;

    .line 699
    .line 700
    .line 701
    move-result-object v0

    .line 702
    instance-of v6, v0, La/gqe0;

    .line 703
    .line 704
    if-eqz v6, :cond_f

    .line 705
    .line 706
    new-instance v6, Lkotlin/Pair;

    .line 707
    .line 708
    check-cast v0, La/gqe0;

    .line 709
    .line 710
    const/4 v8, 0x1

    .line 711
    invoke-virtual {v4, v0, v5, v8}, La/nvu;->U(La/gqe0;La/fay;Z)La/tft0;

    .line 712
    .line 713
    .line 714
    move-result-object v11

    .line 715
    iget-object v0, v0, La/gqe0;->b:La/zqe0;

    .line 716
    .line 717
    invoke-virtual {v4, v0, v5}, La/nvu;->V(La/zqe0;La/fay;)La/wsy;

    .line 718
    .line 719
    .line 720
    move-result-object v0

    .line 721
    invoke-direct {v6, v11, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 722
    .line 723
    .line 724
    goto :goto_7

    .line 725
    :cond_f
    new-instance v6, Lkotlin/Pair;

    .line 726
    .line 727
    invoke-virtual {v4, v0, v5}, La/nvu;->V(La/zqe0;La/fay;)La/wsy;

    .line 728
    .line 729
    .line 730
    move-result-object v0

    .line 731
    const/4 v13, 0x0

    .line 732
    invoke-direct {v6, v0, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 733
    .line 734
    .line 735
    :goto_7
    iget-object v0, v6, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 736
    .line 737
    move-object v13, v0

    .line 738
    check-cast v13, La/wsy;

    .line 739
    .line 740
    iget-object v0, v6, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 741
    .line 742
    move-object v14, v0

    .line 743
    check-cast v14, La/wsy;

    .line 744
    .line 745
    const/4 v11, 0x0

    .line 746
    move-object/from16 v8, v17

    .line 747
    .line 748
    invoke-virtual/range {v8 .. v14}, La/p9z;->v(Ljava/util/ArrayList;La/p8y;ILa/vqe0;La/wsy;La/wsy;)V

    .line 749
    .line 750
    .line 751
    goto :goto_8

    .line 752
    :cond_10
    move-object/from16 v8, v17

    .line 753
    .line 754
    :goto_8
    if-eqz v12, :cond_11

    .line 755
    .line 756
    const/4 v0, 0x1

    .line 757
    goto :goto_9

    .line 758
    :cond_11
    const/4 v0, 0x0

    .line 759
    :goto_9
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 760
    .line 761
    .line 762
    move-result-object v6

    .line 763
    const/4 v7, 0x0

    .line 764
    :goto_a
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 765
    .line 766
    .line 767
    move-result v11

    .line 768
    if-eqz v11, :cond_12

    .line 769
    .line 770
    add-int/lit8 v15, v7, 0x1

    .line 771
    .line 772
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 773
    .line 774
    .line 775
    move-result-object v11

    .line 776
    move-object v12, v11

    .line 777
    check-cast v12, La/vqe0;

    .line 778
    .line 779
    invoke-virtual {v12}, La/vqe0;->f()La/zqe0;

    .line 780
    .line 781
    .line 782
    move-result-object v11

    .line 783
    invoke-virtual {v4, v11, v5}, La/nvu;->V(La/zqe0;La/fay;)La/wsy;

    .line 784
    .line 785
    .line 786
    move-result-object v13

    .line 787
    add-int v11, v7, v0

    .line 788
    .line 789
    const/4 v14, 0x0

    .line 790
    invoke-virtual/range {v8 .. v14}, La/p9z;->v(Ljava/util/ArrayList;La/p8y;ILa/vqe0;La/wsy;La/wsy;)V

    .line 791
    .line 792
    .line 793
    move v7, v15

    .line 794
    goto :goto_a

    .line 795
    :cond_12
    :goto_b
    const/4 v12, 0x0

    .line 796
    goto :goto_c

    .line 797
    :cond_13
    sget-object v9, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 798
    .line 799
    goto :goto_b

    .line 800
    :goto_c
    invoke-virtual {v10, v12}, La/p8y;->w1(Z)V

    .line 801
    .line 802
    .line 803
    invoke-virtual {v3}, La/wm40;->getVisibility()La/tek;

    .line 804
    .line 805
    .line 806
    move-result-object v0

    .line 807
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 808
    .line 809
    .line 810
    sget-object v4, La/w8y;->b:La/tek;

    .line 811
    .line 812
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 813
    .line 814
    .line 815
    move-result v4

    .line 816
    if-eqz v4, :cond_14

    .line 817
    .line 818
    sget-object v0, La/w8y;->c:La/tek;

    .line 819
    .line 820
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 821
    .line 822
    .line 823
    :cond_14
    invoke-virtual {v10, v9, v0}, La/flc;->C1(Ljava/util/List;La/tek;)V

    .line 824
    .line 825
    .line 826
    const/4 v6, 0x1

    .line 827
    invoke-virtual {v10, v6}, La/p8y;->v1(Z)V

    .line 828
    .line 829
    .line 830
    invoke-virtual {v3}, La/wm40;->I()La/kzj0;

    .line 831
    .line 832
    .line 833
    move-result-object v0

    .line 834
    invoke-virtual {v10, v0}, La/oer;->x1(La/kzj0;)V

    .line 835
    .line 836
    .line 837
    move-object v8, v10

    .line 838
    :goto_d
    invoke-static {v8}, La/q3d;->k(Ljava/lang/Object;)Ljava/util/List;

    .line 839
    .line 840
    .line 841
    move-result-object v5

    .line 842
    goto :goto_e

    .line 843
    :cond_15
    move-object v5, v0

    .line 844
    :goto_e
    invoke-virtual {v1, v2, v5}, La/cge0;->e(La/f7u;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 845
    .line 846
    .line 847
    move-result-object v0

    .line 848
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 849
    .line 850
    .line 851
    move-result-object v8

    .line 852
    :goto_f
    return-object v8

    .line 853
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
