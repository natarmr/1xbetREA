.class public final La/pck;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final b:La/qck;


# direct methods
.method public synthetic constructor <init>(La/qck;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/pck;->a:B

    iput-object p1, p0, La/pck;->b:La/qck;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/pck;->a:B

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/16 v2, 0xa

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object p0, p0, La/pck;->b:La/qck;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, La/vvw;->w(La/gre0;)Ljava/lang/reflect/Type;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, La/qck;->x()La/bv9;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-interface {p0}, La/bv9;->getReturnType()Ljava/lang/reflect/Type;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_0
    return-object v0

    .line 29
    :pswitch_0
    new-instance v0, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    sget-object v6, La/sog0;->a:La/qlc;

    .line 35
    .line 36
    invoke-virtual {p0}, La/qck;->C()La/mer;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    iget-object v7, p0, La/qck;->h:La/ihy;

    .line 41
    .line 42
    invoke-static {v6}, La/sog0;->c(La/mer;)La/q0x;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    instance-of v8, v6, La/bfy;

    .line 47
    .line 48
    if-eqz v8, :cond_11

    .line 49
    .line 50
    invoke-static {p0}, La/z1x;->K(La/qgy;)Ljava/util/ArrayList;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result v9

    .line 58
    if-eqz v9, :cond_1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    :cond_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v9

    .line 69
    if-eqz v9, :cond_4

    .line 70
    .line 71
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    check-cast v9, La/hre0;

    .line 76
    .line 77
    if-eqz v9, :cond_3

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    move-object v9, v5

    .line 81
    :goto_0
    if-eqz v9, :cond_2

    .line 82
    .line 83
    invoke-virtual {v9}, La/hre0;->f()Z

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    if-ne v9, v4, :cond_2

    .line 88
    .line 89
    goto/16 :goto_7

    .line 90
    .line 91
    :cond_4
    :goto_1
    instance-of v8, v7, La/sgy;

    .line 92
    .line 93
    if-eqz v8, :cond_5

    .line 94
    .line 95
    move-object v8, v7

    .line 96
    check-cast v8, La/sgy;

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_5
    move-object v8, v5

    .line 100
    :goto_2
    if-eqz v8, :cond_d

    .line 101
    .line 102
    invoke-interface {v8}, La/sgy;->I()Z

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    if-ne v8, v4, :cond_d

    .line 107
    .line 108
    invoke-virtual {p0}, La/qck;->x()La/bv9;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    invoke-interface {v8}, La/bv9;->b()Ljava/lang/reflect/Member;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-interface {v8}, Ljava/lang/reflect/Member;->getModifiers()I

    .line 120
    .line 121
    .line 122
    move-result v8

    .line 123
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 124
    .line 125
    .line 126
    move-result v8

    .line 127
    if-eqz v8, :cond_d

    .line 128
    .line 129
    invoke-virtual {p0}, La/qck;->C()La/mer;

    .line 130
    .line 131
    .line 132
    move-result-object v8

    .line 133
    invoke-interface {v8}, La/mp9;->k()Ljava/util/Collection;

    .line 134
    .line 135
    .line 136
    move-result-object v8

    .line 137
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    check-cast v8, Ljava/lang/Iterable;

    .line 141
    .line 142
    new-instance v9, Ljava/util/ArrayList;

    .line 143
    .line 144
    invoke-static {v8, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    invoke-direct {v9, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 149
    .line 150
    .line 151
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v8

    .line 159
    if-eqz v8, :cond_7

    .line 160
    .line 161
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v8

    .line 165
    check-cast v8, La/mer;

    .line 166
    .line 167
    invoke-interface {v8}, La/vjj;->j()La/vjj;

    .line 168
    .line 169
    .line 170
    move-result-object v10

    .line 171
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    check-cast v10, La/wm40;

    .line 175
    .line 176
    invoke-static {v10}, La/xtt0;->q(La/wm40;)Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    move-result-object v10

    .line 180
    if-eqz v10, :cond_6

    .line 181
    .line 182
    new-instance v11, La/qck;

    .line 183
    .line 184
    sget-object v12, La/sre0;->a:La/tre0;

    .line 185
    .line 186
    invoke-virtual {v12, v10}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 187
    .line 188
    .line 189
    move-result-object v10

    .line 190
    check-cast v10, La/xgy;

    .line 191
    .line 192
    invoke-direct {v11, v10, v8}, La/qck;-><init>(La/ihy;La/mer;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_6
    const-string v0, "Unknown container class for overridden function: "

    .line 200
    .line 201
    invoke-static {p0, v0}, La/ohq;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    goto/16 :goto_f

    .line 205
    .line 206
    :cond_7
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    :cond_8
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 211
    .line 212
    .line 213
    move-result v8

    .line 214
    if-eqz v8, :cond_c

    .line 215
    .line 216
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v8

    .line 220
    move-object v9, v8

    .line 221
    check-cast v9, La/gre0;

    .line 222
    .line 223
    invoke-static {v9}, La/z1x;->K(La/qgy;)Ljava/util/ArrayList;

    .line 224
    .line 225
    .line 226
    move-result-object v9

    .line 227
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 228
    .line 229
    .line 230
    move-result v10

    .line 231
    if-eqz v10, :cond_9

    .line 232
    .line 233
    goto :goto_4

    .line 234
    :cond_9
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 235
    .line 236
    .line 237
    move-result-object v9

    .line 238
    :cond_a
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 239
    .line 240
    .line 241
    move-result v10

    .line 242
    if-eqz v10, :cond_8

    .line 243
    .line 244
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v10

    .line 248
    check-cast v10, La/hre0;

    .line 249
    .line 250
    if-eqz v10, :cond_b

    .line 251
    .line 252
    goto :goto_5

    .line 253
    :cond_b
    move-object v10, v5

    .line 254
    :goto_5
    if-eqz v10, :cond_a

    .line 255
    .line 256
    invoke-virtual {v10}, La/hre0;->f()Z

    .line 257
    .line 258
    .line 259
    move-result v10

    .line 260
    if-ne v10, v4, :cond_a

    .line 261
    .line 262
    goto :goto_6

    .line 263
    :cond_c
    move-object v8, v5

    .line 264
    :goto_6
    check-cast v8, La/gre0;

    .line 265
    .line 266
    goto :goto_8

    .line 267
    :cond_d
    :goto_7
    move-object v8, v5

    .line 268
    :goto_8
    if-eqz v8, :cond_f

    .line 269
    .line 270
    invoke-interface {v8}, La/gre0;->getSignature()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    const/16 v6, 0x28

    .line 275
    .line 276
    invoke-static {v2, v6}, Lkotlin/text/StringsKt;->q0(Ljava/lang/String;C)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    invoke-interface {v8}, La/gre0;->getSignature()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v6

    .line 284
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 285
    .line 286
    .line 287
    move-result v9

    .line 288
    invoke-virtual {v6, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v6

    .line 292
    invoke-static {v8, v6}, La/vvw;->A(La/gre0;Ljava/lang/String;)La/fhj;

    .line 293
    .line 294
    .line 295
    move-result-object v6

    .line 296
    iget-object v8, v6, La/fhj;->b:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v8, Ljava/util/Set;

    .line 299
    .line 300
    check-cast v8, Ljava/util/Collection;

    .line 301
    .line 302
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 303
    .line 304
    .line 305
    iget-object v6, v6, La/fhj;->a:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v6, Ljava/lang/String;

    .line 308
    .line 309
    invoke-virtual {p0}, La/qck;->C()La/mer;

    .line 310
    .line 311
    .line 312
    move-result-object v8

    .line 313
    invoke-interface {v8}, La/kp9;->F()La/c8z;

    .line 314
    .line 315
    .line 316
    move-result-object v8

    .line 317
    if-eqz v8, :cond_e

    .line 318
    .line 319
    move v8, v4

    .line 320
    goto :goto_9

    .line 321
    :cond_e
    move v8, v3

    .line 322
    :goto_9
    invoke-virtual {v7, v2, v6, v4, v8}, La/ihy;->z(Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/reflect/Method;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    goto/16 :goto_d

    .line 327
    .line 328
    :cond_f
    check-cast v6, La/bfy;

    .line 329
    .line 330
    iget-object v2, v6, La/bfy;->a:La/dfy;

    .line 331
    .line 332
    iget-object v6, v2, La/dfy;->c:Ljava/lang/String;

    .line 333
    .line 334
    invoke-static {p0, v6}, La/vvw;->A(La/gre0;Ljava/lang/String;)La/fhj;

    .line 335
    .line 336
    .line 337
    move-result-object v6

    .line 338
    iget-object v8, v6, La/fhj;->b:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast v8, Ljava/util/Set;

    .line 341
    .line 342
    check-cast v8, Ljava/util/Collection;

    .line 343
    .line 344
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 345
    .line 346
    .line 347
    iget-object v2, v2, La/dfy;->b:Ljava/lang/String;

    .line 348
    .line 349
    iget-object v6, v6, La/fhj;->a:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast v6, Ljava/lang/String;

    .line 352
    .line 353
    invoke-virtual {p0}, La/qck;->x()La/bv9;

    .line 354
    .line 355
    .line 356
    move-result-object v8

    .line 357
    invoke-interface {v8}, La/bv9;->b()Ljava/lang/reflect/Member;

    .line 358
    .line 359
    .line 360
    move-result-object v8

    .line 361
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    invoke-interface {v8}, Ljava/lang/reflect/Member;->getModifiers()I

    .line 365
    .line 366
    .line 367
    move-result v8

    .line 368
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 369
    .line 370
    .line 371
    move-result v8

    .line 372
    xor-int/2addr v8, v4

    .line 373
    invoke-virtual {p0}, La/qck;->C()La/mer;

    .line 374
    .line 375
    .line 376
    move-result-object v9

    .line 377
    invoke-interface {v9}, La/kp9;->F()La/c8z;

    .line 378
    .line 379
    .line 380
    move-result-object v9

    .line 381
    if-eqz v9, :cond_10

    .line 382
    .line 383
    move v9, v4

    .line 384
    goto :goto_a

    .line 385
    :cond_10
    move v9, v3

    .line 386
    :goto_a
    invoke-virtual {v7, v2, v6, v8, v9}, La/ihy;->z(Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/reflect/Method;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    goto/16 :goto_d

    .line 391
    .line 392
    :cond_11
    instance-of v8, v6, La/afy;

    .line 393
    .line 394
    if-eqz v8, :cond_14

    .line 395
    .line 396
    invoke-static {p0}, La/fre0;->V(La/dre0;)Z

    .line 397
    .line 398
    .line 399
    move-result v8

    .line 400
    if-eqz v8, :cond_13

    .line 401
    .line 402
    invoke-interface {v7}, La/elc;->j()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    invoke-virtual {p0}, La/ock;->getParameters()Ljava/util/List;

    .line 407
    .line 408
    .line 409
    move-result-object p0

    .line 410
    new-instance v1, Ljava/util/ArrayList;

    .line 411
    .line 412
    invoke-static {p0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 413
    .line 414
    .line 415
    move-result v2

    .line 416
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 417
    .line 418
    .line 419
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 420
    .line 421
    .line 422
    move-result-object p0

    .line 423
    :goto_b
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 424
    .line 425
    .line 426
    move-result v2

    .line 427
    if-eqz v2, :cond_12

    .line 428
    .line 429
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v2

    .line 433
    check-cast v2, La/hre0;

    .line 434
    .line 435
    invoke-virtual {v2}, La/hre0;->getName()Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v2

    .line 439
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 440
    .line 441
    .line 442
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    goto :goto_b

    .line 446
    :cond_12
    sget-object p0, La/o83;->a:La/o83;

    .line 447
    .line 448
    sget-object v2, La/p83;->a:La/p83;

    .line 449
    .line 450
    new-instance v5, La/q83;

    .line 451
    .line 452
    invoke-direct {v5, v0, v1, p0}, La/q83;-><init>(Ljava/lang/Class;Ljava/util/ArrayList;La/o83;)V

    .line 453
    .line 454
    .line 455
    goto/16 :goto_f

    .line 456
    .line 457
    :cond_13
    check-cast v6, La/afy;

    .line 458
    .line 459
    iget-object v2, v6, La/afy;->a:La/dfy;

    .line 460
    .line 461
    iget-object v2, v2, La/dfy;->c:Ljava/lang/String;

    .line 462
    .line 463
    invoke-static {p0, v2}, La/vvw;->A(La/gre0;Ljava/lang/String;)La/fhj;

    .line 464
    .line 465
    .line 466
    move-result-object v2

    .line 467
    iget-object v6, v2, La/fhj;->b:Ljava/lang/Object;

    .line 468
    .line 469
    check-cast v6, Ljava/util/Set;

    .line 470
    .line 471
    check-cast v6, Ljava/util/Collection;

    .line 472
    .line 473
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 474
    .line 475
    .line 476
    iget-object v2, v2, La/fhj;->a:Ljava/lang/Object;

    .line 477
    .line 478
    check-cast v2, Ljava/lang/String;

    .line 479
    .line 480
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 484
    .line 485
    .line 486
    invoke-interface {v7}, La/elc;->j()Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    move-result-object v6

    .line 490
    new-instance v8, Ljava/util/ArrayList;

    .line 491
    .line 492
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 493
    .line 494
    .line 495
    invoke-interface {v7}, La/elc;->j()Ljava/lang/Class;

    .line 496
    .line 497
    .line 498
    move-result-object v7

    .line 499
    invoke-static {v7}, La/bqe0;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 500
    .line 501
    .line 502
    move-result-object v7

    .line 503
    invoke-static {v7, v2, v3}, La/xtt0;->m(Ljava/lang/ClassLoader;Ljava/lang/String;Z)La/zri;

    .line 504
    .line 505
    .line 506
    move-result-object v2

    .line 507
    iget-object v2, v2, La/zri;->b:Ljava/lang/Object;

    .line 508
    .line 509
    check-cast v2, Ljava/util/ArrayList;

    .line 510
    .line 511
    invoke-static {v8, v2, v4, v3}, La/ihy;->q(Ljava/util/ArrayList;Ljava/util/ArrayList;ZZ)V

    .line 512
    .line 513
    .line 514
    :try_start_0
    new-array v2, v3, [Ljava/lang/Class;

    .line 515
    .line 516
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v2

    .line 520
    check-cast v2, [Ljava/lang/Class;

    .line 521
    .line 522
    array-length v7, v2

    .line 523
    invoke-static {v2, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v2

    .line 527
    check-cast v2, [Ljava/lang/Class;

    .line 528
    .line 529
    invoke-virtual {v6, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 530
    .line 531
    .line 532
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 533
    goto :goto_d

    .line 534
    :cond_14
    instance-of v8, v6, La/xey;

    .line 535
    .line 536
    if-eqz v8, :cond_16

    .line 537
    .line 538
    check-cast v6, La/xey;

    .line 539
    .line 540
    iget-object v13, v6, La/xey;->a:Ljava/util/List;

    .line 541
    .line 542
    invoke-interface {v7}, La/elc;->j()Ljava/lang/Class;

    .line 543
    .line 544
    .line 545
    move-result-object v9

    .line 546
    new-instance v10, Ljava/util/ArrayList;

    .line 547
    .line 548
    invoke-static {v13, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 549
    .line 550
    .line 551
    move-result p0

    .line 552
    invoke-direct {v10, p0}, Ljava/util/ArrayList;-><init>(I)V

    .line 553
    .line 554
    .line 555
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 556
    .line 557
    .line 558
    move-result-object p0

    .line 559
    :goto_c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 560
    .line 561
    .line 562
    move-result v0

    .line 563
    if-eqz v0, :cond_15

    .line 564
    .line 565
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    check-cast v0, Ljava/lang/reflect/Method;

    .line 570
    .line 571
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 576
    .line 577
    .line 578
    goto :goto_c

    .line 579
    :cond_15
    sget-object v11, La/o83;->a:La/o83;

    .line 580
    .line 581
    sget-object v12, La/p83;->a:La/p83;

    .line 582
    .line 583
    new-instance v8, La/q83;

    .line 584
    .line 585
    invoke-direct/range {v8 .. v13}, La/q83;-><init>(Ljava/lang/Class;Ljava/util/ArrayList;La/o83;La/p83;Ljava/util/List;)V

    .line 586
    .line 587
    .line 588
    move-object v5, v8

    .line 589
    goto :goto_f

    .line 590
    :catch_0
    :cond_16
    move-object v2, v5

    .line 591
    :goto_d
    instance-of v6, v2, Ljava/lang/reflect/Constructor;

    .line 592
    .line 593
    if-eqz v6, :cond_17

    .line 594
    .line 595
    check-cast v2, Ljava/lang/reflect/Constructor;

    .line 596
    .line 597
    invoke-virtual {p0}, La/qck;->C()La/mer;

    .line 598
    .line 599
    .line 600
    move-result-object v1

    .line 601
    invoke-virtual {p0, v2, v1, v4}, La/qck;->A(Ljava/lang/reflect/Constructor;La/mer;Z)La/sv9;

    .line 602
    .line 603
    .line 604
    move-result-object v1

    .line 605
    goto :goto_e

    .line 606
    :cond_17
    instance-of v6, v2, Ljava/lang/reflect/Method;

    .line 607
    .line 608
    if-eqz v6, :cond_1a

    .line 609
    .line 610
    invoke-virtual {p0}, La/qck;->C()La/mer;

    .line 611
    .line 612
    .line 613
    move-result-object v6

    .line 614
    check-cast v6, La/p4;

    .line 615
    .line 616
    invoke-virtual {v6}, La/p4;->getAnnotations()La/g93;

    .line 617
    .line 618
    .line 619
    move-result-object v6

    .line 620
    sget-object v7, La/xtt0;->a:La/swq;

    .line 621
    .line 622
    invoke-interface {v6, v7}, La/g93;->O0(La/swq;)La/t83;

    .line 623
    .line 624
    .line 625
    move-result-object v6

    .line 626
    if-eqz v6, :cond_19

    .line 627
    .line 628
    invoke-virtual {p0}, La/qck;->C()La/mer;

    .line 629
    .line 630
    .line 631
    move-result-object v6

    .line 632
    invoke-interface {v6}, La/vjj;->j()La/vjj;

    .line 633
    .line 634
    .line 635
    move-result-object v6

    .line 636
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 637
    .line 638
    .line 639
    check-cast v6, La/wm40;

    .line 640
    .line 641
    invoke-virtual {v6}, La/wm40;->o0()Z

    .line 642
    .line 643
    .line 644
    move-result v6

    .line 645
    if-nez v6, :cond_19

    .line 646
    .line 647
    check-cast v2, Ljava/lang/reflect/Method;

    .line 648
    .line 649
    invoke-static {p0}, La/fre0;->W(La/dre0;)Z

    .line 650
    .line 651
    .line 652
    move-result v6

    .line 653
    if-eqz v6, :cond_18

    .line 654
    .line 655
    new-instance v6, La/pv9;

    .line 656
    .line 657
    invoke-direct {v6, v2, v3, v1}, La/jv9;-><init>(Ljava/lang/reflect/Method;ZI)V

    .line 658
    .line 659
    .line 660
    move-object v1, v6

    .line 661
    goto :goto_e

    .line 662
    :cond_18
    new-instance v3, La/rv9;

    .line 663
    .line 664
    invoke-direct {v3, v4, v1, v2, v4}, La/rv9;-><init>(BILjava/lang/reflect/Method;Z)V

    .line 665
    .line 666
    .line 667
    move-object v1, v3

    .line 668
    goto :goto_e

    .line 669
    :cond_19
    check-cast v2, Ljava/lang/reflect/Method;

    .line 670
    .line 671
    invoke-virtual {p0}, La/qck;->x()La/bv9;

    .line 672
    .line 673
    .line 674
    move-result-object v1

    .line 675
    invoke-interface {v1}, La/bv9;->c()Z

    .line 676
    .line 677
    .line 678
    move-result v1

    .line 679
    invoke-virtual {p0, v2, v1}, La/qck;->B(Ljava/lang/reflect/Method;Z)La/jv9;

    .line 680
    .line 681
    .line 682
    move-result-object v1

    .line 683
    goto :goto_e

    .line 684
    :cond_1a
    move-object v1, v5

    .line 685
    :goto_e
    if-eqz v1, :cond_1b

    .line 686
    .line 687
    invoke-static {v1, p0, v0, v4}, La/gnm0;->j(La/bv9;La/dre0;Ljava/util/List;Z)La/bv9;

    .line 688
    .line 689
    .line 690
    move-result-object v5

    .line 691
    :cond_1b
    :goto_f
    return-object v5

    .line 692
    :pswitch_1
    sget-object v0, La/sog0;->a:La/qlc;

    .line 693
    .line 694
    invoke-virtual {p0}, La/qck;->C()La/mer;

    .line 695
    .line 696
    .line 697
    move-result-object v0

    .line 698
    iget-object v6, p0, La/qck;->h:La/ihy;

    .line 699
    .line 700
    invoke-static {v0}, La/sog0;->c(La/mer;)La/q0x;

    .line 701
    .line 702
    .line 703
    move-result-object v0

    .line 704
    instance-of v7, v0, La/afy;

    .line 705
    .line 706
    if-eqz v7, :cond_1e

    .line 707
    .line 708
    invoke-static {p0}, La/fre0;->V(La/dre0;)Z

    .line 709
    .line 710
    .line 711
    move-result v7

    .line 712
    if-eqz v7, :cond_1d

    .line 713
    .line 714
    invoke-interface {v6}, La/elc;->j()Ljava/lang/Class;

    .line 715
    .line 716
    .line 717
    move-result-object v0

    .line 718
    invoke-virtual {p0}, La/ock;->getParameters()Ljava/util/List;

    .line 719
    .line 720
    .line 721
    move-result-object p0

    .line 722
    new-instance v1, Ljava/util/ArrayList;

    .line 723
    .line 724
    invoke-static {p0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 725
    .line 726
    .line 727
    move-result v2

    .line 728
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 729
    .line 730
    .line 731
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 732
    .line 733
    .line 734
    move-result-object p0

    .line 735
    :goto_10
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 736
    .line 737
    .line 738
    move-result v2

    .line 739
    if-eqz v2, :cond_1c

    .line 740
    .line 741
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 742
    .line 743
    .line 744
    move-result-object v2

    .line 745
    check-cast v2, La/hre0;

    .line 746
    .line 747
    invoke-virtual {v2}, La/hre0;->getName()Ljava/lang/String;

    .line 748
    .line 749
    .line 750
    move-result-object v2

    .line 751
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 752
    .line 753
    .line 754
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 755
    .line 756
    .line 757
    goto :goto_10

    .line 758
    :cond_1c
    sget-object p0, La/o83;->b:La/o83;

    .line 759
    .line 760
    sget-object v2, La/p83;->a:La/p83;

    .line 761
    .line 762
    new-instance v5, La/q83;

    .line 763
    .line 764
    invoke-direct {v5, v0, v1, p0}, La/q83;-><init>(Ljava/lang/Class;Ljava/util/ArrayList;La/o83;)V

    .line 765
    .line 766
    .line 767
    goto/16 :goto_14

    .line 768
    .line 769
    :cond_1d
    check-cast v0, La/afy;

    .line 770
    .line 771
    iget-object v0, v0, La/afy;->a:La/dfy;

    .line 772
    .line 773
    iget-object v0, v0, La/dfy;->c:Ljava/lang/String;

    .line 774
    .line 775
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 776
    .line 777
    .line 778
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 779
    .line 780
    .line 781
    invoke-interface {v6}, La/elc;->j()Ljava/lang/Class;

    .line 782
    .line 783
    .line 784
    move-result-object v2

    .line 785
    invoke-interface {v6}, La/elc;->j()Ljava/lang/Class;

    .line 786
    .line 787
    .line 788
    move-result-object v6

    .line 789
    invoke-static {v6}, La/bqe0;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 790
    .line 791
    .line 792
    move-result-object v6

    .line 793
    invoke-static {v6, v0, v3}, La/xtt0;->m(Ljava/lang/ClassLoader;Ljava/lang/String;Z)La/zri;

    .line 794
    .line 795
    .line 796
    move-result-object v0

    .line 797
    iget-object v0, v0, La/zri;->b:Ljava/lang/Object;

    .line 798
    .line 799
    check-cast v0, Ljava/util/ArrayList;

    .line 800
    .line 801
    :try_start_1
    new-array v6, v3, [Ljava/lang/Class;

    .line 802
    .line 803
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 804
    .line 805
    .line 806
    move-result-object v0

    .line 807
    check-cast v0, [Ljava/lang/Class;

    .line 808
    .line 809
    array-length v6, v0

    .line 810
    invoke-static {v0, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 811
    .line 812
    .line 813
    move-result-object v0

    .line 814
    check-cast v0, [Ljava/lang/Class;

    .line 815
    .line 816
    invoke-virtual {v2, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 817
    .line 818
    .line 819
    move-result-object v5
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 820
    goto :goto_11

    .line 821
    :cond_1e
    instance-of v7, v0, La/bfy;

    .line 822
    .line 823
    if-eqz v7, :cond_1f

    .line 824
    .line 825
    check-cast v0, La/bfy;

    .line 826
    .line 827
    iget-object v0, v0, La/bfy;->a:La/dfy;

    .line 828
    .line 829
    iget-object v2, v0, La/dfy;->b:Ljava/lang/String;

    .line 830
    .line 831
    iget-object v0, v0, La/dfy;->c:Ljava/lang/String;

    .line 832
    .line 833
    invoke-virtual {v6, v2, v0}, La/ihy;->B(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 834
    .line 835
    .line 836
    move-result-object v5

    .line 837
    goto :goto_11

    .line 838
    :cond_1f
    instance-of v7, v0, La/zey;

    .line 839
    .line 840
    if-eqz v7, :cond_20

    .line 841
    .line 842
    check-cast v0, La/zey;

    .line 843
    .line 844
    iget-object v5, v0, La/zey;->a:Ljava/lang/reflect/Method;

    .line 845
    .line 846
    goto :goto_11

    .line 847
    :cond_20
    instance-of v7, v0, La/yey;

    .line 848
    .line 849
    if-eqz v7, :cond_27

    .line 850
    .line 851
    check-cast v0, La/yey;

    .line 852
    .line 853
    iget-object v5, v0, La/yey;->a:Ljava/lang/reflect/Constructor;

    .line 854
    .line 855
    :catch_1
    :goto_11
    instance-of v0, v5, Ljava/lang/reflect/Constructor;

    .line 856
    .line 857
    if-eqz v0, :cond_21

    .line 858
    .line 859
    check-cast v5, Ljava/lang/reflect/Constructor;

    .line 860
    .line 861
    invoke-virtual {p0}, La/qck;->C()La/mer;

    .line 862
    .line 863
    .line 864
    move-result-object v0

    .line 865
    invoke-virtual {p0, v5, v0, v3}, La/qck;->A(Ljava/lang/reflect/Constructor;La/mer;Z)La/sv9;

    .line 866
    .line 867
    .line 868
    move-result-object v0

    .line 869
    goto :goto_12

    .line 870
    :cond_21
    instance-of v0, v5, Ljava/lang/reflect/Method;

    .line 871
    .line 872
    if-eqz v0, :cond_26

    .line 873
    .line 874
    check-cast v5, Ljava/lang/reflect/Method;

    .line 875
    .line 876
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 877
    .line 878
    .line 879
    move-result v0

    .line 880
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 881
    .line 882
    .line 883
    move-result v0

    .line 884
    if-nez v0, :cond_23

    .line 885
    .line 886
    invoke-static {p0}, La/fre0;->W(La/dre0;)Z

    .line 887
    .line 888
    .line 889
    move-result v0

    .line 890
    if-eqz v0, :cond_22

    .line 891
    .line 892
    new-instance v0, La/ov9;

    .line 893
    .line 894
    invoke-static {p0}, La/fre0;->P(La/dre0;)Ljava/lang/Object;

    .line 895
    .line 896
    .line 897
    move-result-object v1

    .line 898
    invoke-direct {v0, v5, v1}, La/ov9;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 899
    .line 900
    .line 901
    goto :goto_12

    .line 902
    :cond_22
    new-instance v0, La/rv9;

    .line 903
    .line 904
    const/4 v1, 0x6

    .line 905
    invoke-direct {v0, v3, v1, v5, v3}, La/rv9;-><init>(BILjava/lang/reflect/Method;Z)V

    .line 906
    .line 907
    .line 908
    goto :goto_12

    .line 909
    :cond_23
    invoke-virtual {p0}, La/qck;->C()La/mer;

    .line 910
    .line 911
    .line 912
    move-result-object v0

    .line 913
    check-cast v0, La/p4;

    .line 914
    .line 915
    invoke-virtual {v0}, La/p4;->getAnnotations()La/g93;

    .line 916
    .line 917
    .line 918
    move-result-object v0

    .line 919
    sget-object v2, La/xtt0;->a:La/swq;

    .line 920
    .line 921
    invoke-interface {v0, v2}, La/g93;->O0(La/swq;)La/t83;

    .line 922
    .line 923
    .line 924
    move-result-object v0

    .line 925
    if-eqz v0, :cond_25

    .line 926
    .line 927
    invoke-static {p0}, La/fre0;->W(La/dre0;)Z

    .line 928
    .line 929
    .line 930
    move-result v0

    .line 931
    if-eqz v0, :cond_24

    .line 932
    .line 933
    new-instance v0, La/pv9;

    .line 934
    .line 935
    invoke-direct {v0, v5, v3, v1}, La/jv9;-><init>(Ljava/lang/reflect/Method;ZI)V

    .line 936
    .line 937
    .line 938
    goto :goto_12

    .line 939
    :cond_24
    new-instance v0, La/rv9;

    .line 940
    .line 941
    invoke-direct {v0, v4, v1, v5, v4}, La/rv9;-><init>(BILjava/lang/reflect/Method;Z)V

    .line 942
    .line 943
    .line 944
    goto :goto_12

    .line 945
    :cond_25
    invoke-virtual {p0, v5, v3}, La/qck;->B(Ljava/lang/reflect/Method;Z)La/jv9;

    .line 946
    .line 947
    .line 948
    move-result-object v0

    .line 949
    :goto_12
    sget-object v1, La/iun;->a:La/iun;

    .line 950
    .line 951
    invoke-static {v0, p0, v1, v3}, La/gnm0;->j(La/bv9;La/dre0;Ljava/util/List;Z)La/bv9;

    .line 952
    .line 953
    .line 954
    move-result-object v5

    .line 955
    goto :goto_14

    .line 956
    :cond_26
    new-instance v0, La/poe;

    .line 957
    .line 958
    invoke-virtual {p0}, La/qck;->C()La/mer;

    .line 959
    .line 960
    .line 961
    move-result-object p0

    .line 962
    new-instance v1, Ljava/lang/StringBuilder;

    .line 963
    .line 964
    const-string v2, "Could not compute caller for function: "

    .line 965
    .line 966
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 967
    .line 968
    .line 969
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 970
    .line 971
    .line 972
    const-string p0, " (member = "

    .line 973
    .line 974
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 975
    .line 976
    .line 977
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 978
    .line 979
    .line 980
    const/16 p0, 0x29

    .line 981
    .line 982
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 983
    .line 984
    .line 985
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 986
    .line 987
    .line 988
    move-result-object p0

    .line 989
    invoke-direct {v0, p0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 990
    .line 991
    .line 992
    throw v0

    .line 993
    :cond_27
    instance-of p0, v0, La/xey;

    .line 994
    .line 995
    if-eqz p0, :cond_29

    .line 996
    .line 997
    check-cast v0, La/xey;

    .line 998
    .line 999
    iget-object v12, v0, La/xey;->a:Ljava/util/List;

    .line 1000
    .line 1001
    invoke-interface {v6}, La/elc;->j()Ljava/lang/Class;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v8

    .line 1005
    new-instance v9, Ljava/util/ArrayList;

    .line 1006
    .line 1007
    invoke-static {v12, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1008
    .line 1009
    .line 1010
    move-result p0

    .line 1011
    invoke-direct {v9, p0}, Ljava/util/ArrayList;-><init>(I)V

    .line 1012
    .line 1013
    .line 1014
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1015
    .line 1016
    .line 1017
    move-result-object p0

    .line 1018
    :goto_13
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 1019
    .line 1020
    .line 1021
    move-result v0

    .line 1022
    if-eqz v0, :cond_28

    .line 1023
    .line 1024
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v0

    .line 1028
    check-cast v0, Ljava/lang/reflect/Method;

    .line 1029
    .line 1030
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v0

    .line 1034
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1035
    .line 1036
    .line 1037
    goto :goto_13

    .line 1038
    :cond_28
    sget-object v10, La/o83;->b:La/o83;

    .line 1039
    .line 1040
    sget-object v11, La/p83;->a:La/p83;

    .line 1041
    .line 1042
    new-instance v7, La/q83;

    .line 1043
    .line 1044
    invoke-direct/range {v7 .. v12}, La/q83;-><init>(Ljava/lang/Class;Ljava/util/ArrayList;La/o83;La/p83;Ljava/util/List;)V

    .line 1045
    .line 1046
    .line 1047
    move-object v5, v7

    .line 1048
    goto :goto_14

    .line 1049
    :cond_29
    invoke-static {}, La/t9f;->b()V

    .line 1050
    .line 1051
    .line 1052
    :goto_14
    return-object v5

    .line 1053
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
