.class public final La/aaw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/aaw;->a:B

    iput-object p1, p0, La/aaw;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/aaw;->a:B

    iput-object p2, p0, La/aaw;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/aaw;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object p0, p0, La/aaw;->b:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, La/aaw;

    .line 12
    .line 13
    invoke-virtual {p0}, La/aaw;->invoke()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/riu0;

    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_0
    check-cast p0, La/uvz;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_1
    check-cast p0, La/zez;

    .line 24
    .line 25
    iget-object p0, p0, La/zez;->c:Lkotlin/jvm/functions/Function0;

    .line 26
    .line 27
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/aty;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    check-cast p0, La/wsy;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_2
    check-cast p0, La/x9z;

    .line 40
    .line 41
    iget-object p0, p0, La/x9z;->o:La/r9z;

    .line 42
    .line 43
    iget-object p0, p0, La/ng80;->f:La/swq;

    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    return-object v3

    .line 49
    :pswitch_3
    check-cast p0, La/aaw;

    .line 50
    .line 51
    invoke-virtual {p0}, La/aaw;->invoke()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    check-cast p0, La/riu0;

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_4
    check-cast p0, La/jty;

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_5
    check-cast p0, La/qsy;

    .line 62
    .line 63
    new-instance v0, La/psy;

    .line 64
    .line 65
    invoke-direct {v0, p0}, La/psy;-><init>(La/qsy;)V

    .line 66
    .line 67
    .line 68
    return-object v0

    .line 69
    :pswitch_6
    check-cast p0, La/fsy;

    .line 70
    .line 71
    invoke-static {p0, v1}, La/x9x;->H(La/esy;Z)La/bv9;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    :pswitch_7
    check-cast p0, La/csy;

    .line 77
    .line 78
    iget-object v0, p0, La/csy;->a:La/pry;

    .line 79
    .line 80
    invoke-interface {v0}, La/dre0;->K()La/ihy;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    instance-of v1, v1, La/zhy;

    .line 85
    .line 86
    if-nez v1, :cond_1

    .line 87
    .line 88
    invoke-static {v0}, La/fre0;->X(La/dre0;)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_0

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string v2, "Only constructors and top-level callables are supported for now: "

    .line 98
    .line 99
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-interface {v0}, La/dre0;->K()La/ihy;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-interface {v0}, La/qgy;->getName()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    iget-object p0, p0, La/csy;->e:Ljava/lang/String;

    .line 114
    .line 115
    invoke-static {v1, v0, p0}, La/hny;->r(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_1
    :goto_0
    invoke-interface {v0}, La/dre0;->x()La/bv9;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-interface {v0}, La/bv9;->a()Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    iget p0, p0, La/csy;->c:I

    .line 128
    .line 129
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    move-object v3, p0

    .line 134
    check-cast v3, Ljava/lang/reflect/Type;

    .line 135
    .line 136
    :goto_1
    return-object v3

    .line 137
    :pswitch_8
    check-cast p0, La/yry;

    .line 138
    .line 139
    new-instance v0, La/xry;

    .line 140
    .line 141
    invoke-direct {v0, p0}, La/xry;-><init>(La/yry;)V

    .line 142
    .line 143
    .line 144
    return-object v0

    .line 145
    :pswitch_9
    check-cast p0, La/wry;

    .line 146
    .line 147
    new-instance v0, La/vry;

    .line 148
    .line 149
    invoke-direct {v0, p0}, La/vry;-><init>(La/wry;)V

    .line 150
    .line 151
    .line 152
    return-object v0

    .line 153
    :pswitch_a
    check-cast p0, La/ury;

    .line 154
    .line 155
    new-instance v0, La/try;

    .line 156
    .line 157
    invoke-direct {v0, p0}, La/try;-><init>(La/ury;)V

    .line 158
    .line 159
    .line 160
    return-object v0

    .line 161
    :pswitch_b
    check-cast p0, La/yhy;

    .line 162
    .line 163
    iget-object v0, p0, La/yhy;->d:La/mre0;

    .line 164
    .line 165
    sget-object v1, La/yhy;->g:[La/iiy;

    .line 166
    .line 167
    aget-object v1, v1, v2

    .line 168
    .line 169
    invoke-virtual {v0}, La/mre0;->invoke()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    check-cast v0, La/jre0;

    .line 174
    .line 175
    if-eqz v0, :cond_f

    .line 176
    .line 177
    iget-object v1, v0, La/jre0;->a:Ljava/lang/Class;

    .line 178
    .line 179
    iget-object p0, p0, La/hhy;->a:La/mre0;

    .line 180
    .line 181
    sget-object v4, La/hhy;->b:[La/iiy;

    .line 182
    .line 183
    aget-object v4, v4, v2

    .line 184
    .line 185
    invoke-virtual {p0}, La/mre0;->invoke()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    check-cast p0, La/pog0;

    .line 193
    .line 194
    iget-object p0, p0, La/pog0;->b:La/yuu;

    .line 195
    .line 196
    iget-object v4, p0, La/yuu;->b:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v4, La/jfk;

    .line 199
    .line 200
    iget-object v5, p0, La/yuu;->d:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v5, Ljava/util/concurrent/ConcurrentHashMap;

    .line 203
    .line 204
    invoke-static {v1}, La/bqe0;->a(Ljava/lang/Class;)La/qlc;

    .line 205
    .line 206
    .line 207
    move-result-object v6

    .line 208
    invoke-virtual {v5, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v7

    .line 212
    if-nez v7, :cond_e

    .line 213
    .line 214
    invoke-static {v1}, La/bqe0;->a(Ljava/lang/Class;)La/qlc;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    iget-object v1, v1, La/qlc;->a:La/swq;

    .line 219
    .line 220
    iget-object v7, v0, La/jre0;->b:La/cry;

    .line 221
    .line 222
    iget-object v8, v7, La/cry;->c:Ljava/io/Serializable;

    .line 223
    .line 224
    check-cast v8, La/bry;

    .line 225
    .line 226
    sget-object v9, La/bry;->h:La/bry;

    .line 227
    .line 228
    if-ne v8, v9, :cond_9

    .line 229
    .line 230
    iget-object v7, v7, La/cry;->e:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v7, [Ljava/lang/String;

    .line 233
    .line 234
    if-ne v8, v9, :cond_2

    .line 235
    .line 236
    goto :goto_2

    .line 237
    :cond_2
    move-object v7, v3

    .line 238
    :goto_2
    if-eqz v7, :cond_3

    .line 239
    .line 240
    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 241
    .line 242
    .line 243
    move-result-object v7

    .line 244
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    goto :goto_3

    .line 248
    :cond_3
    move-object v7, v3

    .line 249
    :goto_3
    if-nez v7, :cond_4

    .line 250
    .line 251
    sget-object v7, La/iun;->a:La/iun;

    .line 252
    .line 253
    :cond_4
    new-instance v8, Ljava/util/ArrayList;

    .line 254
    .line 255
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 256
    .line 257
    .line 258
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 259
    .line 260
    .line 261
    move-result-object v7

    .line 262
    :cond_5
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 263
    .line 264
    .line 265
    move-result v9

    .line 266
    if-eqz v9, :cond_a

    .line 267
    .line 268
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v9

    .line 272
    check-cast v9, Ljava/lang/String;

    .line 273
    .line 274
    if-eqz v9, :cond_8

    .line 275
    .line 276
    new-instance v10, La/swq;

    .line 277
    .line 278
    const/16 v11, 0x2f

    .line 279
    .line 280
    const/16 v12, 0x2e

    .line 281
    .line 282
    invoke-virtual {v9, v11, v12}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v9

    .line 286
    invoke-direct {v10, v9}, La/swq;-><init>(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v10}, La/swq;->b()La/swq;

    .line 290
    .line 291
    .line 292
    move-result-object v9

    .line 293
    iget-object v10, v10, La/swq;->a:La/twq;

    .line 294
    .line 295
    invoke-virtual {v10}, La/twq;->g()La/g950;

    .line 296
    .line 297
    .line 298
    move-result-object v10

    .line 299
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    sget-object v11, La/swq;->c:La/swq;

    .line 303
    .line 304
    invoke-static {v10}, La/mbc;->g0(La/g950;)La/swq;

    .line 305
    .line 306
    .line 307
    move-result-object v10

    .line 308
    iget-object v10, v10, La/swq;->a:La/twq;

    .line 309
    .line 310
    invoke-virtual {v10}, La/twq;->c()Z

    .line 311
    .line 312
    .line 313
    iget-object v11, p0, La/yuu;->c:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v11, La/yox;

    .line 316
    .line 317
    invoke-virtual {v4}, La/jfk;->c()La/f6i;

    .line 318
    .line 319
    .line 320
    move-result-object v13

    .line 321
    iget-object v13, v13, La/f6i;->c:Ljava/lang/Object;

    .line 322
    .line 323
    check-cast v13, La/lwf;

    .line 324
    .line 325
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    sget-object v13, La/vd40;->g:La/vd40;

    .line 329
    .line 330
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    iget-object v10, v10, La/twq;->a:Ljava/lang/String;

    .line 334
    .line 335
    const/16 v13, 0x24

    .line 336
    .line 337
    invoke-static {v10, v12, v13}, Lkotlin/text/c;->s(Ljava/lang/String;CC)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v10

    .line 341
    iget-object v13, v9, La/swq;->a:La/twq;

    .line 342
    .line 343
    invoke-virtual {v13}, La/twq;->c()Z

    .line 344
    .line 345
    .line 346
    move-result v13

    .line 347
    if-eqz v13, :cond_6

    .line 348
    .line 349
    goto :goto_5

    .line 350
    :cond_6
    new-instance v13, Ljava/lang/StringBuilder;

    .line 351
    .line 352
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v10

    .line 368
    :goto_5
    invoke-virtual {v11, v10}, La/yox;->g(Ljava/lang/String;)La/g2v;

    .line 369
    .line 370
    .line 371
    move-result-object v9

    .line 372
    if-eqz v9, :cond_7

    .line 373
    .line 374
    iget-object v9, v9, La/g2v;->a:Ljava/lang/Object;

    .line 375
    .line 376
    check-cast v9, La/jre0;

    .line 377
    .line 378
    goto :goto_6

    .line 379
    :cond_7
    move-object v9, v3

    .line 380
    :goto_6
    if-eqz v9, :cond_5

    .line 381
    .line 382
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    goto :goto_4

    .line 386
    :cond_8
    invoke-static {v2}, La/rey;->a(I)V

    .line 387
    .line 388
    .line 389
    throw v3

    .line 390
    :cond_9
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 391
    .line 392
    .line 393
    move-result-object v8

    .line 394
    :cond_a
    new-instance p0, La/nun;

    .line 395
    .line 396
    invoke-virtual {v4}, La/jfk;->c()La/f6i;

    .line 397
    .line 398
    .line 399
    move-result-object v3

    .line 400
    iget-object v3, v3, La/f6i;->f:Ljava/lang/Object;

    .line 401
    .line 402
    check-cast v3, La/ym40;

    .line 403
    .line 404
    invoke-direct {p0, v3, v1, v2}, La/nun;-><init>(La/ym40;La/swq;B)V

    .line 405
    .line 406
    .line 407
    new-instance v2, Ljava/util/ArrayList;

    .line 408
    .line 409
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 410
    .line 411
    .line 412
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 413
    .line 414
    .line 415
    move-result-object v3

    .line 416
    :cond_b
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 417
    .line 418
    .line 419
    move-result v7

    .line 420
    if-eqz v7, :cond_c

    .line 421
    .line 422
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v7

    .line 426
    check-cast v7, La/jre0;

    .line 427
    .line 428
    invoke-virtual {v4, p0, v7}, La/jfk;->a(La/mg80;La/jre0;)La/qfk;

    .line 429
    .line 430
    .line 431
    move-result-object v7

    .line 432
    if-eqz v7, :cond_b

    .line 433
    .line 434
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    goto :goto_7

    .line 438
    :cond_c
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 439
    .line 440
    .line 441
    move-result-object p0

    .line 442
    new-instance v2, Ljava/lang/StringBuilder;

    .line 443
    .line 444
    const-string v3, "package "

    .line 445
    .line 446
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 450
    .line 451
    .line 452
    const-string v1, " ("

    .line 453
    .line 454
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 458
    .line 459
    .line 460
    const/16 v0, 0x29

    .line 461
    .line 462
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    invoke-static {v0, p0}, La/obb;->L(Ljava/lang/String;Ljava/lang/Iterable;)La/cr30;

    .line 470
    .line 471
    .line 472
    move-result-object p0

    .line 473
    invoke-virtual {v5, v6, p0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    if-nez v0, :cond_d

    .line 478
    .line 479
    move-object v7, p0

    .line 480
    goto :goto_8

    .line 481
    :cond_d
    move-object v7, v0

    .line 482
    :cond_e
    :goto_8
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 483
    .line 484
    .line 485
    check-cast v7, La/cr30;

    .line 486
    .line 487
    goto :goto_9

    .line 488
    :cond_f
    sget-object v7, La/br30;->b:La/br30;

    .line 489
    .line 490
    :goto_9
    return-object v7

    .line 491
    :pswitch_c
    check-cast p0, La/lfy;

    .line 492
    .line 493
    iget-object v0, p0, La/lfy;->c:La/r9z;

    .line 494
    .line 495
    iget-object v1, v0, La/r9z;->j:La/cu00;

    .line 496
    .line 497
    sget-object v3, La/r9z;->n:[La/iiy;

    .line 498
    .line 499
    aget-object v3, v3, v2

    .line 500
    .line 501
    invoke-static {v1, v3}, La/yqm0;->s(La/r660;La/iiy;)Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v1

    .line 505
    check-cast v1, Ljava/util/Map;

    .line 506
    .line 507
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 508
    .line 509
    .line 510
    move-result-object v1

    .line 511
    check-cast v1, Ljava/lang/Iterable;

    .line 512
    .line 513
    new-instance v3, Ljava/util/ArrayList;

    .line 514
    .line 515
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 516
    .line 517
    .line 518
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    :cond_10
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 523
    .line 524
    .line 525
    move-result v4

    .line 526
    if-eqz v4, :cond_11

    .line 527
    .line 528
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v4

    .line 532
    check-cast v4, La/jre0;

    .line 533
    .line 534
    iget-object v5, p0, La/lfy;->b:La/f7u;

    .line 535
    .line 536
    iget-object v5, v5, La/f7u;->b:Ljava/lang/Object;

    .line 537
    .line 538
    check-cast v5, La/v7i;

    .line 539
    .line 540
    iget-object v5, v5, La/v7i;->f:Ljava/lang/Object;

    .line 541
    .line 542
    check-cast v5, La/jfk;

    .line 543
    .line 544
    invoke-virtual {v5, v0, v4}, La/jfk;->a(La/mg80;La/jre0;)La/qfk;

    .line 545
    .line 546
    .line 547
    move-result-object v4

    .line 548
    if-eqz v4, :cond_10

    .line 549
    .line 550
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 551
    .line 552
    .line 553
    goto :goto_a

    .line 554
    :cond_11
    invoke-static {v3}, La/k9x;->N(Ljava/util/ArrayList;)La/mbk0;

    .line 555
    .line 556
    .line 557
    move-result-object p0

    .line 558
    new-array v0, v2, [La/cr30;

    .line 559
    .line 560
    invoke-virtual {p0, v0}, La/mbk0;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object p0

    .line 564
    check-cast p0, [La/cr30;

    .line 565
    .line 566
    return-object p0

    .line 567
    :pswitch_d
    check-cast p0, La/jey;

    .line 568
    .line 569
    iget-object v0, p0, La/jey;->f:La/gey;

    .line 570
    .line 571
    if-eqz v0, :cond_12

    .line 572
    .line 573
    invoke-virtual {v0}, La/gey;->invoke()Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v0

    .line 577
    check-cast v0, La/iey;

    .line 578
    .line 579
    iput-object v3, p0, La/jey;->f:La/gey;

    .line 580
    .line 581
    move-object v3, v0

    .line 582
    goto :goto_b

    .line 583
    :cond_12
    const-string p0, "JvmBuiltins instance has not been initialized properly"

    .line 584
    .line 585
    invoke-static {p0}, La/c99;->l(Ljava/lang/Object;)V

    .line 586
    .line 587
    .line 588
    :goto_b
    return-object v3

    .line 589
    :pswitch_e
    check-cast p0, La/ydy;

    .line 590
    .line 591
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    iget-object v1, p0, La/ydy;->a:La/zlf0;

    .line 596
    .line 597
    iget-object v1, v1, La/zlf0;->a:Ljava/lang/String;

    .line 598
    .line 599
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 600
    .line 601
    .line 602
    iget-object v1, p0, La/ydy;->b:La/zlf0;

    .line 603
    .line 604
    if-eqz v1, :cond_13

    .line 605
    .line 606
    iget-object v1, v1, La/zlf0;->a:Ljava/lang/String;

    .line 607
    .line 608
    const-string v3, "under-migration:"

    .line 609
    .line 610
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 611
    .line 612
    .line 613
    move-result-object v1

    .line 614
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 615
    .line 616
    .line 617
    :cond_13
    iget-object p0, p0, La/ydy;->c:Ljava/util/Map;

    .line 618
    .line 619
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 620
    .line 621
    .line 622
    move-result-object p0

    .line 623
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 624
    .line 625
    .line 626
    move-result-object p0

    .line 627
    :goto_c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 628
    .line 629
    .line 630
    move-result v1

    .line 631
    if-eqz v1, :cond_14

    .line 632
    .line 633
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v1

    .line 637
    check-cast v1, Ljava/util/Map$Entry;

    .line 638
    .line 639
    new-instance v3, Ljava/lang/StringBuilder;

    .line 640
    .line 641
    const-string v4, "@"

    .line 642
    .line 643
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 644
    .line 645
    .line 646
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    move-result-object v4

    .line 650
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 651
    .line 652
    .line 653
    const/16 v4, 0x3a

    .line 654
    .line 655
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 656
    .line 657
    .line 658
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 659
    .line 660
    .line 661
    move-result-object v1

    .line 662
    check-cast v1, La/zlf0;

    .line 663
    .line 664
    iget-object v1, v1, La/zlf0;->a:Ljava/lang/String;

    .line 665
    .line 666
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 667
    .line 668
    .line 669
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 670
    .line 671
    .line 672
    move-result-object v1

    .line 673
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 674
    .line 675
    .line 676
    goto :goto_c

    .line 677
    :cond_14
    invoke-static {v0}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 678
    .line 679
    .line 680
    move-result-object p0

    .line 681
    new-array v0, v2, [Ljava/lang/String;

    .line 682
    .line 683
    invoke-virtual {p0, v0}, La/lc00;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object p0

    .line 687
    check-cast p0, [Ljava/lang/String;

    .line 688
    .line 689
    return-object p0

    .line 690
    :pswitch_f
    check-cast p0, La/z9y;

    .line 691
    .line 692
    iget-object p0, p0, La/k8y;->d:La/dqe0;

    .line 693
    .line 694
    instance-of v0, p0, La/fqe0;

    .line 695
    .line 696
    if-eqz v0, :cond_15

    .line 697
    .line 698
    sget-object v0, La/n8y;->a:Ljava/util/Map;

    .line 699
    .line 700
    check-cast p0, La/fqe0;

    .line 701
    .line 702
    invoke-virtual {p0}, La/fqe0;->a()Ljava/util/ArrayList;

    .line 703
    .line 704
    .line 705
    move-result-object p0

    .line 706
    invoke-static {p0}, La/n8y;->a(Ljava/util/List;)La/mx3;

    .line 707
    .line 708
    .line 709
    move-result-object p0

    .line 710
    goto :goto_d

    .line 711
    :cond_15
    instance-of v0, p0, La/rqe0;

    .line 712
    .line 713
    if-eqz v0, :cond_16

    .line 714
    .line 715
    sget-object v0, La/n8y;->a:Ljava/util/Map;

    .line 716
    .line 717
    invoke-static {p0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 718
    .line 719
    .line 720
    move-result-object p0

    .line 721
    invoke-static {p0}, La/n8y;->a(Ljava/util/List;)La/mx3;

    .line 722
    .line 723
    .line 724
    move-result-object p0

    .line 725
    goto :goto_d

    .line 726
    :cond_16
    move-object p0, v3

    .line 727
    :goto_d
    if-eqz p0, :cond_17

    .line 728
    .line 729
    sget-object v0, La/l8y;->b:La/g950;

    .line 730
    .line 731
    new-instance v1, Lkotlin/Pair;

    .line 732
    .line 733
    invoke-direct {v1, v0, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 734
    .line 735
    .line 736
    invoke-static {v1}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 737
    .line 738
    .line 739
    move-result-object v3

    .line 740
    :cond_17
    if-nez v3, :cond_18

    .line 741
    .line 742
    sget-object v3, La/lun;->a:La/lun;

    .line 743
    .line 744
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 745
    .line 746
    .line 747
    :cond_18
    return-object v3

    .line 748
    :pswitch_10
    check-cast p0, La/y9y;

    .line 749
    .line 750
    sget-object v0, La/n8y;->a:Ljava/util/Map;

    .line 751
    .line 752
    iget-object p0, p0, La/k8y;->d:La/dqe0;

    .line 753
    .line 754
    instance-of v0, p0, La/rqe0;

    .line 755
    .line 756
    if-eqz v0, :cond_19

    .line 757
    .line 758
    check-cast p0, La/rqe0;

    .line 759
    .line 760
    goto :goto_e

    .line 761
    :cond_19
    move-object p0, v3

    .line 762
    :goto_e
    if-eqz p0, :cond_1a

    .line 763
    .line 764
    sget-object v0, La/n8y;->b:Ljava/util/Map;

    .line 765
    .line 766
    iget-object p0, p0, La/rqe0;->b:Ljava/lang/Enum;

    .line 767
    .line 768
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 769
    .line 770
    .line 771
    move-result-object p0

    .line 772
    invoke-static {p0}, La/g950;->e(Ljava/lang/String;)La/g950;

    .line 773
    .line 774
    .line 775
    move-result-object p0

    .line 776
    invoke-virtual {p0}, La/g950;->b()Ljava/lang/String;

    .line 777
    .line 778
    .line 779
    move-result-object p0

    .line 780
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 781
    .line 782
    .line 783
    move-result-object p0

    .line 784
    check-cast p0, La/usy;

    .line 785
    .line 786
    if-eqz p0, :cond_1a

    .line 787
    .line 788
    new-instance v0, La/h0o;

    .line 789
    .line 790
    sget-object v1, La/i4m0;->v:La/swq;

    .line 791
    .line 792
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 793
    .line 794
    .line 795
    new-instance v2, La/qlc;

    .line 796
    .line 797
    invoke-virtual {v1}, La/swq;->b()La/swq;

    .line 798
    .line 799
    .line 800
    move-result-object v4

    .line 801
    iget-object v1, v1, La/swq;->a:La/twq;

    .line 802
    .line 803
    invoke-virtual {v1}, La/twq;->g()La/g950;

    .line 804
    .line 805
    .line 806
    move-result-object v1

    .line 807
    invoke-direct {v2, v4, v1}, La/qlc;-><init>(La/swq;La/g950;)V

    .line 808
    .line 809
    .line 810
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 811
    .line 812
    .line 813
    move-result-object p0

    .line 814
    invoke-static {p0}, La/g950;->e(Ljava/lang/String;)La/g950;

    .line 815
    .line 816
    .line 817
    move-result-object p0

    .line 818
    invoke-direct {v0, v2, p0}, La/h0o;-><init>(La/qlc;La/g950;)V

    .line 819
    .line 820
    .line 821
    goto :goto_f

    .line 822
    :cond_1a
    move-object v0, v3

    .line 823
    :goto_f
    if-eqz v0, :cond_1b

    .line 824
    .line 825
    sget-object p0, La/l8y;->c:La/g950;

    .line 826
    .line 827
    new-instance v1, Lkotlin/Pair;

    .line 828
    .line 829
    invoke-direct {v1, p0, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 830
    .line 831
    .line 832
    invoke-static {v1}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 833
    .line 834
    .line 835
    move-result-object v3

    .line 836
    :cond_1b
    if-nez v3, :cond_1c

    .line 837
    .line 838
    sget-object v3, La/lun;->a:La/lun;

    .line 839
    .line 840
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 841
    .line 842
    .line 843
    :cond_1c
    return-object v3

    .line 844
    :pswitch_11
    check-cast p0, La/s9y;

    .line 845
    .line 846
    invoke-static {p0, v1}, La/uvw;->q(La/q9y;Z)La/sv9;

    .line 847
    .line 848
    .line 849
    move-result-object p0

    .line 850
    return-object p0

    .line 851
    :pswitch_12
    check-cast p0, La/k9y;

    .line 852
    .line 853
    new-instance v0, La/j9y;

    .line 854
    .line 855
    invoke-direct {v0, p0}, La/j9y;-><init>(La/k9y;)V

    .line 856
    .line 857
    .line 858
    return-object v0

    .line 859
    :pswitch_13
    check-cast p0, La/i9y;

    .line 860
    .line 861
    invoke-virtual {p0}, La/i9y;->u()[Ljava/lang/reflect/TypeVariable;

    .line 862
    .line 863
    .line 864
    move-result-object v0

    .line 865
    invoke-static {v0, p0}, La/tke;->k0([Ljava/lang/reflect/TypeVariable;La/oiy;)Ljava/util/List;

    .line 866
    .line 867
    .line 868
    move-result-object p0

    .line 869
    return-object p0

    .line 870
    :pswitch_14
    check-cast p0, La/j8y;

    .line 871
    .line 872
    iget-object p0, p0, La/j8y;->b:Ljava/lang/reflect/Method;

    .line 873
    .line 874
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    .line 875
    .line 876
    .line 877
    move-result-object v0

    .line 878
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 879
    .line 880
    .line 881
    sget-object v1, La/lun;->a:La/lun;

    .line 882
    .line 883
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 884
    .line 885
    .line 886
    sget-object v2, La/gzs0;->a:La/gzs0;

    .line 887
    .line 888
    const/4 v5, 0x0

    .line 889
    const/16 v6, 0x18

    .line 890
    .line 891
    const/4 v3, 0x1

    .line 892
    const/4 v4, 0x0

    .line 893
    invoke-static/range {v0 .. v6}, La/tke;->j0(Ljava/lang/reflect/Type;Ljava/util/Map;La/gzs0;ZZLa/c0t0;I)La/kiy;

    .line 894
    .line 895
    .line 896
    move-result-object p0

    .line 897
    return-object p0

    .line 898
    :pswitch_15
    check-cast p0, La/aaw;

    .line 899
    .line 900
    invoke-virtual {p0}, La/aaw;->invoke()Ljava/lang/Object;

    .line 901
    .line 902
    .line 903
    move-result-object p0

    .line 904
    check-cast p0, La/riu0;

    .line 905
    .line 906
    return-object p0

    .line 907
    :pswitch_16
    check-cast p0, La/k6y;

    .line 908
    .line 909
    return-object p0

    .line 910
    :pswitch_17
    check-cast p0, La/aaw;

    .line 911
    .line 912
    invoke-virtual {p0}, La/aaw;->invoke()Ljava/lang/Object;

    .line 913
    .line 914
    .line 915
    move-result-object p0

    .line 916
    check-cast p0, La/riu0;

    .line 917
    .line 918
    return-object p0

    .line 919
    :pswitch_18
    check-cast p0, La/yax;

    .line 920
    .line 921
    return-object p0

    .line 922
    :pswitch_19
    check-cast p0, La/aaw;

    .line 923
    .line 924
    invoke-virtual {p0}, La/aaw;->invoke()Ljava/lang/Object;

    .line 925
    .line 926
    .line 927
    move-result-object p0

    .line 928
    check-cast p0, La/riu0;

    .line 929
    .line 930
    return-object p0

    .line 931
    :pswitch_1a
    check-cast p0, La/v8x;

    .line 932
    .line 933
    return-object p0

    .line 934
    :pswitch_1b
    new-instance v0, La/q0h0;

    .line 935
    .line 936
    check-cast p0, La/s8x;

    .line 937
    .line 938
    invoke-virtual {p0}, La/s8x;->invoke()Ljava/lang/Object;

    .line 939
    .line 940
    .line 941
    move-result-object p0

    .line 942
    check-cast p0, La/p0h0;

    .line 943
    .line 944
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 945
    .line 946
    .line 947
    return-object v0

    .line 948
    :pswitch_1c
    check-cast p0, La/naw;

    .line 949
    .line 950
    iget-object v0, p0, La/naw;->J:La/td9;

    .line 951
    .line 952
    iget-object v5, p0, La/naw;->d:La/sys0;

    .line 953
    .line 954
    iget-object v8, p0, La/naw;->D0:La/s77;

    .line 955
    .line 956
    iget-object v1, p0, La/naw;->C0:La/ql5;

    .line 957
    .line 958
    if-eqz v1, :cond_1e

    .line 959
    .line 960
    iget-object v1, v1, La/ql5;->f:Ljava/lang/String;

    .line 961
    .line 962
    if-nez v1, :cond_1d

    .line 963
    .line 964
    goto :goto_11

    .line 965
    :cond_1d
    :goto_10
    move-object v9, v1

    .line 966
    goto :goto_12

    .line 967
    :cond_1e
    :goto_11
    const-string v1, ""

    .line 968
    .line 969
    goto :goto_10

    .line 970
    :goto_12
    iget-object p0, p0, La/naw;->A0:Ljava/lang/String;

    .line 971
    .line 972
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 973
    .line 974
    .line 975
    move-result v1

    .line 976
    if-lez v1, :cond_1f

    .line 977
    .line 978
    move-object v11, p0

    .line 979
    goto :goto_13

    .line 980
    :cond_1f
    move-object v11, v3

    .line 981
    :goto_13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 982
    .line 983
    .line 984
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 985
    .line 986
    .line 987
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 988
    .line 989
    .line 990
    new-instance v4, La/x5w;

    .line 991
    .line 992
    iget-object p0, v0, La/td9;->b:Ljava/lang/Object;

    .line 993
    .line 994
    move-object v6, p0

    .line 995
    check-cast v6, La/afm0;

    .line 996
    .line 997
    iget-object p0, v0, La/td9;->c:Ljava/lang/Object;

    .line 998
    .line 999
    move-object v7, p0

    .line 1000
    check-cast v7, La/s5w;

    .line 1001
    .line 1002
    iget-boolean v10, v0, La/td9;->a:Z

    .line 1003
    .line 1004
    invoke-direct/range {v4 .. v11}, La/x5w;-><init>(La/sys0;La/afm0;La/s5w;La/s77;Ljava/lang/String;ZLjava/lang/String;)V

    .line 1005
    .line 1006
    .line 1007
    iget-object p0, v0, La/td9;->d:Ljava/lang/Object;

    .line 1008
    .line 1009
    check-cast p0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1010
    .line 1011
    invoke-virtual {p0, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1012
    .line 1013
    .line 1014
    return-object v4

    .line 1015
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
