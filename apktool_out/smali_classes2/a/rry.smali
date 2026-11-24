.class public final La/rry;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final b:La/sry;


# direct methods
.method public synthetic constructor <init>(La/sry;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rry;->a:B

    iput-object p1, p0, La/rry;->b:La/sry;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/rry;->a:B

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    const-string v2, "Only constructors and top-level functions are supported for now: "

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v4, p0, La/rry;->b:La/sry;

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-static {v4}, La/fre0;->X(La/dre0;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    iget-object v0, v4, La/sry;->c:La/ihy;

    .line 19
    .line 20
    if-nez p0, :cond_1

    .line 21
    .line 22
    instance-of p0, v0, La/zhy;

    .line 23
    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-interface {v4}, La/qgy;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v1, v4, La/sry;->d:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {p0, v0, v1}, La/hny;->r(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto/16 :goto_7

    .line 45
    .line 46
    :cond_1
    :goto_0
    invoke-virtual {v4}, La/sry;->B()La/hfy;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    new-instance v2, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-static {v4}, La/fre0;->X(La/dre0;)Z

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    const/4 v7, 0x1

    .line 60
    if-eqz v6, :cond_6

    .line 61
    .line 62
    instance-of v6, v0, La/xgy;

    .line 63
    .line 64
    if-eqz v6, :cond_3

    .line 65
    .line 66
    move-object v6, v0

    .line 67
    check-cast v6, La/xgy;

    .line 68
    .line 69
    invoke-virtual {v6}, La/xgy;->I()Z

    .line 70
    .line 71
    .line 72
    move-result v8

    .line 73
    if-eqz v8, :cond_3

    .line 74
    .line 75
    invoke-virtual {v6}, La/xgy;->X()La/qpy;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    if-eqz v6, :cond_2

    .line 80
    .line 81
    iget-object v6, v6, La/qpy;->m:Ljava/lang/String;

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    move-object v6, v5

    .line 85
    :goto_1
    if-eqz v6, :cond_3

    .line 86
    .line 87
    goto/16 :goto_3

    .line 88
    .line 89
    :cond_3
    invoke-static {v4}, La/fre0;->V(La/dre0;)Z

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    if-eqz p0, :cond_5

    .line 94
    .line 95
    invoke-interface {v0}, La/elc;->j()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-virtual {v4}, La/sry;->getParameters()Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    new-instance v2, Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-static {v0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 110
    .line 111
    .line 112
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-eqz v1, :cond_4

    .line 121
    .line 122
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    check-cast v1, La/hre0;

    .line 127
    .line 128
    invoke-virtual {v1}, La/hre0;->getName()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_4
    sget-object v0, La/o83;->a:La/o83;

    .line 140
    .line 141
    sget-object v1, La/p83;->a:La/p83;

    .line 142
    .line 143
    new-instance v5, La/q83;

    .line 144
    .line 145
    invoke-direct {v5, p0, v2, v0}, La/q83;-><init>(Ljava/lang/Class;Ljava/util/ArrayList;La/o83;)V

    .line 146
    .line 147
    .line 148
    goto/16 :goto_7

    .line 149
    .line 150
    :cond_5
    invoke-virtual {v4}, La/sry;->B()La/hfy;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    iget-object p0, p0, La/hfy;->c:Ljava/lang/String;

    .line 155
    .line 156
    invoke-static {v4, p0}, La/vvw;->A(La/gre0;Ljava/lang/String;)La/fhj;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    iget-object v1, p0, La/fhj;->b:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v1, Ljava/util/Set;

    .line 163
    .line 164
    check-cast v1, Ljava/util/Collection;

    .line 165
    .line 166
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 167
    .line 168
    .line 169
    iget-object p0, p0, La/fhj;->a:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast p0, Ljava/lang/String;

    .line 172
    .line 173
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-interface {v0}, La/elc;->j()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    new-instance v6, Ljava/util/ArrayList;

    .line 184
    .line 185
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 186
    .line 187
    .line 188
    invoke-interface {v0}, La/elc;->j()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-static {v0}, La/bqe0;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-static {v0, p0, v3}, La/xtt0;->m(Ljava/lang/ClassLoader;Ljava/lang/String;Z)La/zri;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    iget-object p0, p0, La/zri;->b:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast p0, Ljava/util/ArrayList;

    .line 203
    .line 204
    invoke-static {v6, p0, v7, v3}, La/ihy;->q(Ljava/util/ArrayList;Ljava/util/ArrayList;ZZ)V

    .line 205
    .line 206
    .line 207
    :try_start_0
    new-array p0, v3, [Ljava/lang/Class;

    .line 208
    .line 209
    invoke-virtual {v6, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    check-cast p0, [Ljava/lang/Class;

    .line 214
    .line 215
    array-length v0, p0

    .line 216
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    check-cast p0, [Ljava/lang/Class;

    .line 221
    .line 222
    invoke-virtual {v1, p0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 223
    .line 224
    .line 225
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 226
    goto :goto_5

    .line 227
    :catch_0
    move-object p0, v5

    .line 228
    goto :goto_5

    .line 229
    :cond_6
    :goto_3
    iget-object v1, p0, La/hfy;->c:Ljava/lang/String;

    .line 230
    .line 231
    invoke-static {v4, v1}, La/vvw;->A(La/gre0;Ljava/lang/String;)La/fhj;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    iget-object v6, v1, La/fhj;->b:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v6, Ljava/util/Set;

    .line 238
    .line 239
    check-cast v6, Ljava/util/Collection;

    .line 240
    .line 241
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 242
    .line 243
    .line 244
    iget-object p0, p0, La/hfy;->b:Ljava/lang/String;

    .line 245
    .line 246
    iget-object v1, v1, La/fhj;->a:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast v1, Ljava/lang/String;

    .line 249
    .line 250
    invoke-virtual {v4}, La/sry;->x()La/bv9;

    .line 251
    .line 252
    .line 253
    move-result-object v6

    .line 254
    invoke-interface {v6}, La/bv9;->b()Ljava/lang/reflect/Member;

    .line 255
    .line 256
    .line 257
    move-result-object v6

    .line 258
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    invoke-interface {v6}, Ljava/lang/reflect/Member;->getModifiers()I

    .line 262
    .line 263
    .line 264
    move-result v6

    .line 265
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 266
    .line 267
    .line 268
    move-result v6

    .line 269
    xor-int/2addr v6, v7

    .line 270
    invoke-virtual {v4}, La/sry;->a()Ljava/util/List;

    .line 271
    .line 272
    .line 273
    move-result-object v8

    .line 274
    if-eqz v8, :cond_7

    .line 275
    .line 276
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 277
    .line 278
    .line 279
    move-result v9

    .line 280
    if-eqz v9, :cond_7

    .line 281
    .line 282
    goto :goto_4

    .line 283
    :cond_7
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 284
    .line 285
    .line 286
    move-result-object v8

    .line 287
    :cond_8
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 288
    .line 289
    .line 290
    move-result v9

    .line 291
    if-eqz v9, :cond_9

    .line 292
    .line 293
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v9

    .line 297
    check-cast v9, La/hre0;

    .line 298
    .line 299
    invoke-virtual {v9}, La/hre0;->n()La/aiy;

    .line 300
    .line 301
    .line 302
    move-result-object v9

    .line 303
    sget-object v10, La/aiy;->c:La/aiy;

    .line 304
    .line 305
    if-ne v9, v10, :cond_8

    .line 306
    .line 307
    move v3, v7

    .line 308
    :cond_9
    :goto_4
    invoke-virtual {v0, p0, v1, v6, v3}, La/ihy;->z(Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/reflect/Method;

    .line 309
    .line 310
    .line 311
    move-result-object p0

    .line 312
    :goto_5
    instance-of v0, p0, Ljava/lang/reflect/Constructor;

    .line 313
    .line 314
    if-eqz v0, :cond_a

    .line 315
    .line 316
    check-cast p0, Ljava/lang/reflect/Constructor;

    .line 317
    .line 318
    invoke-virtual {v4, p0, v7}, La/sry;->p(Ljava/lang/reflect/Constructor;Z)La/sv9;

    .line 319
    .line 320
    .line 321
    move-result-object p0

    .line 322
    goto :goto_6

    .line 323
    :cond_a
    instance-of v0, p0, Ljava/lang/reflect/Method;

    .line 324
    .line 325
    if-eqz v0, :cond_b

    .line 326
    .line 327
    check-cast p0, Ljava/lang/reflect/Method;

    .line 328
    .line 329
    invoke-virtual {v4}, La/sry;->x()La/bv9;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    invoke-interface {v0}, La/bv9;->c()Z

    .line 334
    .line 335
    .line 336
    move-result v0

    .line 337
    invoke-virtual {v4, p0, v0}, La/sry;->u(Ljava/lang/reflect/Method;Z)La/jv9;

    .line 338
    .line 339
    .line 340
    move-result-object p0

    .line 341
    goto :goto_6

    .line 342
    :cond_b
    move-object p0, v5

    .line 343
    :goto_6
    if-eqz p0, :cond_c

    .line 344
    .line 345
    invoke-static {p0, v4, v2, v7}, La/gnm0;->j(La/bv9;La/dre0;Ljava/util/List;Z)La/bv9;

    .line 346
    .line 347
    .line 348
    move-result-object v5

    .line 349
    :cond_c
    :goto_7
    return-object v5

    .line 350
    :pswitch_0
    invoke-static {v4}, La/fre0;->X(La/dre0;)Z

    .line 351
    .line 352
    .line 353
    move-result p0

    .line 354
    iget-object v0, v4, La/sry;->c:La/ihy;

    .line 355
    .line 356
    if-nez p0, :cond_e

    .line 357
    .line 358
    instance-of p0, v0, La/zhy;

    .line 359
    .line 360
    if-eqz p0, :cond_d

    .line 361
    .line 362
    goto :goto_8

    .line 363
    :cond_d
    new-instance p0, Ljava/lang/StringBuilder;

    .line 364
    .line 365
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    invoke-interface {v4}, La/qgy;->getName()Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    iget-object v1, v4, La/sry;->d:Ljava/lang/String;

    .line 376
    .line 377
    invoke-static {p0, v0, v1}, La/hny;->r(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 378
    .line 379
    .line 380
    goto/16 :goto_e

    .line 381
    .line 382
    :cond_e
    :goto_8
    invoke-virtual {v4}, La/sry;->B()La/hfy;

    .line 383
    .line 384
    .line 385
    move-result-object p0

    .line 386
    iget-object v2, p0, La/hfy;->c:Ljava/lang/String;

    .line 387
    .line 388
    invoke-static {v4}, La/fre0;->X(La/dre0;)Z

    .line 389
    .line 390
    .line 391
    move-result v6

    .line 392
    if-eqz v6, :cond_13

    .line 393
    .line 394
    instance-of v6, v0, La/xgy;

    .line 395
    .line 396
    if-eqz v6, :cond_10

    .line 397
    .line 398
    move-object v6, v0

    .line 399
    check-cast v6, La/xgy;

    .line 400
    .line 401
    invoke-virtual {v6}, La/xgy;->I()Z

    .line 402
    .line 403
    .line 404
    move-result v7

    .line 405
    if-eqz v7, :cond_10

    .line 406
    .line 407
    invoke-virtual {v6}, La/xgy;->X()La/qpy;

    .line 408
    .line 409
    .line 410
    move-result-object v6

    .line 411
    if-eqz v6, :cond_f

    .line 412
    .line 413
    iget-object v6, v6, La/qpy;->m:Ljava/lang/String;

    .line 414
    .line 415
    goto :goto_9

    .line 416
    :cond_f
    move-object v6, v5

    .line 417
    :goto_9
    if-eqz v6, :cond_10

    .line 418
    .line 419
    goto :goto_b

    .line 420
    :cond_10
    invoke-static {v4}, La/fre0;->V(La/dre0;)Z

    .line 421
    .line 422
    .line 423
    move-result p0

    .line 424
    if-eqz p0, :cond_12

    .line 425
    .line 426
    invoke-interface {v0}, La/elc;->j()Ljava/lang/Class;

    .line 427
    .line 428
    .line 429
    move-result-object p0

    .line 430
    invoke-virtual {v4}, La/sry;->getParameters()Ljava/util/List;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    new-instance v2, Ljava/util/ArrayList;

    .line 435
    .line 436
    invoke-static {v0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 437
    .line 438
    .line 439
    move-result v1

    .line 440
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 441
    .line 442
    .line 443
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 448
    .line 449
    .line 450
    move-result v1

    .line 451
    if-eqz v1, :cond_11

    .line 452
    .line 453
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v1

    .line 457
    check-cast v1, La/hre0;

    .line 458
    .line 459
    invoke-virtual {v1}, La/hre0;->getName()Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v1

    .line 463
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 467
    .line 468
    .line 469
    goto :goto_a

    .line 470
    :cond_11
    sget-object v0, La/o83;->b:La/o83;

    .line 471
    .line 472
    sget-object v1, La/p83;->a:La/p83;

    .line 473
    .line 474
    new-instance v5, La/q83;

    .line 475
    .line 476
    invoke-direct {v5, p0, v2, v0}, La/q83;-><init>(Ljava/lang/Class;Ljava/util/ArrayList;La/o83;)V

    .line 477
    .line 478
    .line 479
    goto :goto_e

    .line 480
    :cond_12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 484
    .line 485
    .line 486
    invoke-interface {v0}, La/elc;->j()Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    move-result-object p0

    .line 490
    invoke-interface {v0}, La/elc;->j()Ljava/lang/Class;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    invoke-static {v0}, La/bqe0;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    invoke-static {v0, v2, v3}, La/xtt0;->m(Ljava/lang/ClassLoader;Ljava/lang/String;Z)La/zri;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    iget-object v0, v0, La/zri;->b:Ljava/lang/Object;

    .line 503
    .line 504
    check-cast v0, Ljava/util/ArrayList;

    .line 505
    .line 506
    :try_start_1
    new-array v1, v3, [Ljava/lang/Class;

    .line 507
    .line 508
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    check-cast v0, [Ljava/lang/Class;

    .line 513
    .line 514
    array-length v1, v0

    .line 515
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    check-cast v0, [Ljava/lang/Class;

    .line 520
    .line 521
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 522
    .line 523
    .line 524
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 525
    goto :goto_c

    .line 526
    :catch_1
    move-object p0, v5

    .line 527
    goto :goto_c

    .line 528
    :cond_13
    :goto_b
    iget-object p0, p0, La/hfy;->b:Ljava/lang/String;

    .line 529
    .line 530
    invoke-virtual {v0, p0, v2}, La/ihy;->B(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 531
    .line 532
    .line 533
    move-result-object p0

    .line 534
    :goto_c
    instance-of v0, p0, Ljava/lang/reflect/Constructor;

    .line 535
    .line 536
    if-eqz v0, :cond_14

    .line 537
    .line 538
    check-cast p0, Ljava/lang/reflect/Constructor;

    .line 539
    .line 540
    invoke-virtual {v4, p0, v3}, La/sry;->p(Ljava/lang/reflect/Constructor;Z)La/sv9;

    .line 541
    .line 542
    .line 543
    move-result-object p0

    .line 544
    goto :goto_d

    .line 545
    :cond_14
    instance-of v0, p0, Ljava/lang/reflect/Method;

    .line 546
    .line 547
    if-eqz v0, :cond_15

    .line 548
    .line 549
    check-cast p0, Ljava/lang/reflect/Method;

    .line 550
    .line 551
    invoke-virtual {v4, p0, v3}, La/sry;->u(Ljava/lang/reflect/Method;Z)La/jv9;

    .line 552
    .line 553
    .line 554
    move-result-object p0

    .line 555
    :goto_d
    sget-object v0, La/iun;->a:La/iun;

    .line 556
    .line 557
    invoke-static {p0, v4, v0, v3}, La/gnm0;->j(La/bv9;La/dre0;Ljava/util/List;Z)La/bv9;

    .line 558
    .line 559
    .line 560
    move-result-object v5

    .line 561
    goto :goto_e

    .line 562
    :cond_15
    const-string p0, "Could not compute caller for function: "

    .line 563
    .line 564
    invoke-static {v4, p0}, La/ohq;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 565
    .line 566
    .line 567
    :goto_e
    return-object v5

    .line 568
    :pswitch_1
    iget-object v6, p0, La/rry;->b:La/sry;

    .line 569
    .line 570
    invoke-static {v6}, La/fre0;->W(La/dre0;)Z

    .line 571
    .line 572
    .line 573
    move-result p0

    .line 574
    if-eqz p0, :cond_16

    .line 575
    .line 576
    invoke-virtual {v6}, La/sry;->z()Ljava/util/List;

    .line 577
    .line 578
    .line 579
    move-result-object v7

    .line 580
    invoke-virtual {v6}, La/sry;->A()La/fqy;

    .line 581
    .line 582
    .line 583
    move-result-object v8

    .line 584
    invoke-virtual {v6}, La/sry;->D()Ljava/util/List;

    .line 585
    .line 586
    .line 587
    move-result-object v9

    .line 588
    invoke-virtual {v6}, La/sry;->C()La/nzs0;

    .line 589
    .line 590
    .line 591
    move-result-object v10

    .line 592
    const/4 v11, 0x0

    .line 593
    invoke-static/range {v6 .. v11}, La/w9x;->B(La/pry;Ljava/util/List;La/fqy;Ljava/util/List;La/nzs0;Z)La/lc00;

    .line 594
    .line 595
    .line 596
    move-result-object p0

    .line 597
    goto :goto_f

    .line 598
    :cond_16
    invoke-virtual {v6}, La/sry;->a()Ljava/util/List;

    .line 599
    .line 600
    .line 601
    move-result-object p0

    .line 602
    :goto_f
    return-object p0

    .line 603
    :pswitch_2
    iget-object v0, p0, La/rry;->b:La/sry;

    .line 604
    .line 605
    invoke-virtual {v0}, La/sry;->z()Ljava/util/List;

    .line 606
    .line 607
    .line 608
    move-result-object v1

    .line 609
    invoke-virtual {v0}, La/sry;->A()La/fqy;

    .line 610
    .line 611
    .line 612
    move-result-object v2

    .line 613
    invoke-virtual {v0}, La/sry;->D()Ljava/util/List;

    .line 614
    .line 615
    .line 616
    move-result-object v3

    .line 617
    invoke-virtual {v0}, La/sry;->C()La/nzs0;

    .line 618
    .line 619
    .line 620
    move-result-object v4

    .line 621
    const/4 v5, 0x1

    .line 622
    invoke-static/range {v0 .. v5}, La/w9x;->B(La/pry;Ljava/util/List;La/fqy;Ljava/util/List;La/nzs0;Z)La/lc00;

    .line 623
    .line 624
    .line 625
    move-result-object p0

    .line 626
    return-object p0

    .line 627
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
