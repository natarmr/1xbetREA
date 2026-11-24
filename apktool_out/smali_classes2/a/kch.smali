.class public final La/kch;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/kch;->a:B

    iput-object p1, p0, La/kch;->b:Ljava/lang/Object;

    iput-object p2, p0, La/kch;->c:Ljava/lang/Object;

    iput-object p3, p0, La/kch;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/kch;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, La/kch;->d:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, v0, La/kch;->c:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v0, v0, La/kch;->b:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 16
    .line 17
    new-instance v1, La/w1b0;

    .line 18
    .line 19
    check-cast v4, La/st0;

    .line 20
    .line 21
    iget-wide v5, v4, La/st0;->a:J

    .line 22
    .line 23
    check-cast v3, La/j2b0;

    .line 24
    .line 25
    check-cast v3, La/g2b0;

    .line 26
    .line 27
    iget-object v2, v3, La/g2b0;->a:La/fza0;

    .line 28
    .line 29
    iget-object v3, v4, La/st0;->g:Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-direct {v1, v5, v6, v2, v3}, La/w1b0;-><init>(JLa/fza0;Ljava/lang/Integer;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object v0

    .line 40
    :pswitch_0
    check-cast v0, La/baz;

    .line 41
    .line 42
    check-cast v4, La/sqe0;

    .line 43
    .line 44
    check-cast v3, La/mie0;

    .line 45
    .line 46
    iget-object v1, v0, La/baz;->b:La/f7u;

    .line 47
    .line 48
    iget-object v1, v1, La/f7u;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, La/v7i;

    .line 51
    .line 52
    iget-object v1, v1, La/v7i;->i:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, La/eu00;

    .line 55
    .line 56
    new-instance v2, La/nsr;

    .line 57
    .line 58
    invoke-direct {v2, v0, v4, v3}, La/nsr;-><init>(La/baz;La/sqe0;La/mie0;)V

    .line 59
    .line 60
    .line 61
    new-instance v0, La/bu00;

    .line 62
    .line 63
    invoke-direct {v0, v1, v2}, La/bu00;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 64
    .line 65
    .line 66
    return-object v0

    .line 67
    :pswitch_1
    check-cast v0, La/xgy;

    .line 68
    .line 69
    check-cast v4, Ljava/lang/Class;

    .line 70
    .line 71
    check-cast v3, La/qlc;

    .line 72
    .line 73
    iget-object v1, v0, La/xgy;->b:Ljava/lang/Class;

    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    if-eqz v5, :cond_0

    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-static {v4, v5}, La/tx3;->H(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-ltz v4, :cond_1

    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    aget-object v2, v0, v4

    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_1
    const-string v1, "No superclass of "

    .line 117
    .line 118
    const-string v4, " in Java reflection for "

    .line 119
    .line 120
    invoke-static {v1, v0, v4, v3}, La/udk;->f(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    :goto_0
    return-object v2

    .line 124
    :pswitch_2
    check-cast v0, La/n9y;

    .line 125
    .line 126
    iget-object v1, v0, La/n9y;->i:La/a8z;

    .line 127
    .line 128
    check-cast v4, La/ihy;

    .line 129
    .line 130
    check-cast v3, La/rgy;

    .line 131
    .line 132
    invoke-virtual {v0}, La/n9y;->B()Ljava/lang/reflect/Method;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    if-eqz v5, :cond_2

    .line 145
    .line 146
    goto/16 :goto_7

    .line 147
    .line 148
    :cond_2
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    check-cast v4, La/xgy;

    .line 152
    .line 153
    invoke-virtual {v4}, La/xgy;->X()La/qpy;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    if-eqz v5, :cond_3

    .line 158
    .line 159
    goto/16 :goto_7

    .line 160
    .line 161
    :cond_3
    sget-object v5, La/j0o;->a:La/j0o;

    .line 162
    .line 163
    invoke-static {v0, v5}, La/two;->h(La/dre0;La/vtb;)La/k0o;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    invoke-static {v4, v5}, La/two;->b(La/xgy;La/k0o;)Ljava/util/ArrayList;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    invoke-virtual {v3}, La/rgy;->c()Z

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    if-eqz v3, :cond_4

    .line 176
    .line 177
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    const/4 v5, 0x1

    .line 182
    if-ne v3, v5, :cond_4

    .line 183
    .line 184
    goto/16 :goto_7

    .line 185
    .line 186
    :cond_4
    new-instance v3, La/nre0;

    .line 187
    .line 188
    sget-object v5, La/x83;->b:La/x83;

    .line 189
    .line 190
    const/4 v6, 0x0

    .line 191
    invoke-direct {v3, v5, v6}, La/nre0;-><init>(La/x83;Z)V

    .line 192
    .line 193
    .line 194
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v5

    .line 198
    check-cast v5, La/v2;

    .line 199
    .line 200
    new-instance v7, Ljava/util/ArrayList;

    .line 201
    .line 202
    const/16 v8, 0xa

    .line 203
    .line 204
    invoke-static {v4, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 205
    .line 206
    .line 207
    move-result v9

    .line 208
    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 212
    .line 213
    .line 214
    move-result-object v9

    .line 215
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 216
    .line 217
    .line 218
    move-result v10

    .line 219
    if-eqz v10, :cond_5

    .line 220
    .line 221
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v10

    .line 225
    check-cast v10, La/gre0;

    .line 226
    .line 227
    invoke-interface {v10}, La/qgy;->getReturnType()La/kiy;

    .line 228
    .line 229
    .line 230
    move-result-object v10

    .line 231
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    check-cast v10, La/v2;

    .line 235
    .line 236
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    goto :goto_1

    .line 240
    :cond_5
    invoke-virtual {v3, v5, v7, v2, v6}, La/q8a;->L(La/aty;Ljava/util/List;La/pys0;Z)La/g5;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    check-cast v1, La/v2;

    .line 249
    .line 250
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    invoke-static {v1, v3, v6}, La/cww;->t(La/v2;La/g5;I)La/y78;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    iget-object v3, v3, La/y78;->c:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v3, La/v2;

    .line 260
    .line 261
    if-nez v3, :cond_6

    .line 262
    .line 263
    goto :goto_2

    .line 264
    :cond_6
    move-object v1, v3

    .line 265
    :goto_2
    iget-object v0, v0, La/n9y;->h:La/a8z;

    .line 266
    .line 267
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    check-cast v0, Ljava/util/List;

    .line 272
    .line 273
    new-instance v3, Ljava/util/ArrayList;

    .line 274
    .line 275
    invoke-static {v0, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 276
    .line 277
    .line 278
    move-result v5

    .line 279
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 280
    .line 281
    .line 282
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 287
    .line 288
    .line 289
    move-result v5

    .line 290
    if-eqz v5, :cond_a

    .line 291
    .line 292
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v5

    .line 296
    check-cast v5, La/hre0;

    .line 297
    .line 298
    new-instance v7, La/nre0;

    .line 299
    .line 300
    sget-object v9, La/x83;->c:La/x83;

    .line 301
    .line 302
    invoke-virtual {v5}, La/hre0;->u()Z

    .line 303
    .line 304
    .line 305
    move-result v10

    .line 306
    invoke-direct {v7, v9, v10}, La/nre0;-><init>(La/x83;Z)V

    .line 307
    .line 308
    .line 309
    instance-of v9, v5, La/o9y;

    .line 310
    .line 311
    if-nez v9, :cond_7

    .line 312
    .line 313
    goto :goto_6

    .line 314
    :cond_7
    check-cast v5, La/o9y;

    .line 315
    .line 316
    iget-object v9, v5, La/o9y;->c:La/kiy;

    .line 317
    .line 318
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    check-cast v9, La/v2;

    .line 322
    .line 323
    new-instance v10, Ljava/util/ArrayList;

    .line 324
    .line 325
    invoke-static {v4, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 326
    .line 327
    .line 328
    move-result v11

    .line 329
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 333
    .line 334
    .line 335
    move-result-object v11

    .line 336
    :goto_4
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 337
    .line 338
    .line 339
    move-result v12

    .line 340
    if-eqz v12, :cond_8

    .line 341
    .line 342
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v12

    .line 346
    check-cast v12, La/gre0;

    .line 347
    .line 348
    invoke-interface {v12}, La/qgy;->getParameters()Ljava/util/List;

    .line 349
    .line 350
    .line 351
    move-result-object v12

    .line 352
    iget v13, v5, La/o9y;->d:I

    .line 353
    .line 354
    invoke-interface {v12, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v12

    .line 358
    check-cast v12, La/hre0;

    .line 359
    .line 360
    invoke-virtual {v12}, La/hre0;->p()La/kiy;

    .line 361
    .line 362
    .line 363
    move-result-object v12

    .line 364
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    check-cast v12, La/v2;

    .line 368
    .line 369
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    goto :goto_4

    .line 373
    :cond_8
    invoke-virtual {v7, v9, v10, v2, v6}, La/q8a;->L(La/aty;Ljava/util/List;La/pys0;Z)La/g5;

    .line 374
    .line 375
    .line 376
    move-result-object v7

    .line 377
    new-instance v10, La/o9y;

    .line 378
    .line 379
    iget-object v11, v5, La/o9y;->a:La/e9y;

    .line 380
    .line 381
    iget-object v12, v5, La/o9y;->b:Ljava/lang/String;

    .line 382
    .line 383
    invoke-static {v9, v7, v6}, La/cww;->t(La/v2;La/g5;I)La/y78;

    .line 384
    .line 385
    .line 386
    move-result-object v7

    .line 387
    iget-object v7, v7, La/y78;->c:Ljava/lang/Object;

    .line 388
    .line 389
    check-cast v7, La/v2;

    .line 390
    .line 391
    if-nez v7, :cond_9

    .line 392
    .line 393
    move-object v13, v9

    .line 394
    goto :goto_5

    .line 395
    :cond_9
    move-object v13, v7

    .line 396
    :goto_5
    iget v14, v5, La/o9y;->d:I

    .line 397
    .line 398
    iget-object v15, v5, La/o9y;->e:La/aiy;

    .line 399
    .line 400
    iget-boolean v5, v5, La/o9y;->f:Z

    .line 401
    .line 402
    move/from16 v16, v5

    .line 403
    .line 404
    invoke-direct/range {v10 .. v16}, La/o9y;-><init>(La/e9y;Ljava/lang/String;La/kiy;ILa/aiy;Z)V

    .line 405
    .line 406
    .line 407
    move-object v5, v10

    .line 408
    :goto_6
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 409
    .line 410
    .line 411
    goto :goto_3

    .line 412
    :cond_a
    new-instance v2, La/m9y;

    .line 413
    .line 414
    invoke-direct {v2, v3, v1}, La/m9y;-><init>(Ljava/util/ArrayList;La/v2;)V

    .line 415
    .line 416
    .line 417
    :goto_7
    return-object v2

    .line 418
    :pswitch_3
    check-cast v0, La/sfy;

    .line 419
    .line 420
    check-cast v4, Ljava/io/ByteArrayInputStream;

    .line 421
    .line 422
    check-cast v3, La/pfk;

    .line 423
    .line 424
    iget-object v1, v3, La/pfk;->b:La/g45;

    .line 425
    .line 426
    iget-object v1, v1, La/g45;->a:Ljava/lang/Object;

    .line 427
    .line 428
    check-cast v1, La/f6i;

    .line 429
    .line 430
    iget-object v1, v1, La/f6i;->r:Ljava/lang/Object;

    .line 431
    .line 432
    check-cast v1, La/sso;

    .line 433
    .line 434
    invoke-virtual {v0, v4, v1}, La/sfy;->a(Ljava/io/ByteArrayInputStream;La/sso;)La/z3;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    return-object v0

    .line 439
    :pswitch_4
    check-cast v0, Landroid/app/Application;

    .line 440
    .line 441
    instance-of v1, v0, La/af3;

    .line 442
    .line 443
    if-eqz v1, :cond_b

    .line 444
    .line 445
    check-cast v0, La/af3;

    .line 446
    .line 447
    goto :goto_8

    .line 448
    :cond_b
    move-object v0, v2

    .line 449
    :goto_8
    const-class v1, La/k1h;

    .line 450
    .line 451
    if-eqz v0, :cond_e

    .line 452
    .line 453
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    check-cast v0, La/o5d0;

    .line 462
    .line 463
    if-eqz v0, :cond_c

    .line 464
    .line 465
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    check-cast v0, La/ze3;

    .line 470
    .line 471
    goto :goto_9

    .line 472
    :cond_c
    move-object v0, v2

    .line 473
    :goto_9
    instance-of v5, v0, La/k1h;

    .line 474
    .line 475
    if-nez v5, :cond_d

    .line 476
    .line 477
    move-object v0, v2

    .line 478
    :cond_d
    check-cast v0, La/k1h;

    .line 479
    .line 480
    if-eqz v0, :cond_e

    .line 481
    .line 482
    new-instance v1, Lorg/xplatform/cyber/section/api/home/CyberHomeParams;

    .line 483
    .line 484
    check-cast v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 485
    .line 486
    check-cast v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;

    .line 487
    .line 488
    invoke-direct {v1, v4, v3}, Lorg/xplatform/cyber/section/api/home/CyberHomeParams;-><init>(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;)V

    .line 489
    .line 490
    .line 491
    invoke-virtual {v0, v1}, La/k1h;->a(Lorg/xplatform/cyber/section/api/home/CyberHomeParams;)La/yii;

    .line 492
    .line 493
    .line 494
    move-result-object v2

    .line 495
    goto :goto_a

    .line 496
    :cond_e
    const-string v0, "Cannot create dependency "

    .line 497
    .line 498
    invoke-static {v1, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 503
    .line 504
    .line 505
    :goto_a
    return-object v2

    .line 506
    nop

    .line 507
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
