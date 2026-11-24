.class public final synthetic La/okw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/okw;->a:B

    iput-object p1, p0, La/okw;->b:Ljava/lang/Object;

    iput-object p2, p0, La/okw;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/okw;->a:B

    .line 4
    .line 5
    const-string v2, "/"

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x3

    .line 9
    const/4 v5, 0x4

    .line 10
    const/16 v6, 0x10

    .line 11
    .line 12
    const v7, 0x2fd4df92

    .line 13
    .line 14
    .line 15
    const/4 v8, 0x0

    .line 16
    const/4 v9, 0x1

    .line 17
    const/4 v10, 0x0

    .line 18
    iget-object v11, v0, La/okw;->c:Ljava/lang/Object;

    .line 19
    .line 20
    iget-object v0, v0, La/okw;->b:Ljava/lang/Object;

    .line 21
    .line 22
    packed-switch v1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    check-cast v0, La/svz;

    .line 26
    .line 27
    check-cast v11, La/cp;

    .line 28
    .line 29
    move-object/from16 v1, p1

    .line 30
    .line 31
    check-cast v1, Landroid/view/View;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, La/goz;

    .line 41
    .line 42
    iget-object v1, v1, La/goz;->a:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, La/svz;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object v0

    .line 50
    :pswitch_0
    check-cast v0, La/ujz;

    .line 51
    .line 52
    check-cast v11, La/sjz;

    .line 53
    .line 54
    move-object/from16 v1, p1

    .line 55
    .line 56
    check-cast v1, Landroid/view/View;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    iget-object v0, v0, La/ujz;->v:Lkotlin/jvm/functions/Function1;

    .line 62
    .line 63
    invoke-interface {v0, v11}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object v0

    .line 69
    :pswitch_1
    check-cast v0, La/ujz;

    .line 70
    .line 71
    check-cast v11, La/tjz;

    .line 72
    .line 73
    move-object/from16 v1, p1

    .line 74
    .line 75
    check-cast v1, Landroid/view/View;

    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    iget-object v0, v0, La/ujz;->v:Lkotlin/jvm/functions/Function1;

    .line 81
    .line 82
    invoke-interface {v0, v11}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    return-object v0

    .line 88
    :pswitch_2
    check-cast v0, La/thz;

    .line 89
    .line 90
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 91
    .line 92
    move-object/from16 v1, p1

    .line 93
    .line 94
    check-cast v1, La/hcz;

    .line 95
    .line 96
    sget-object v2, La/vhz;->l2:La/rqt;

    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    iget-object v0, v0, La/thz;->a:La/a4x;

    .line 102
    .line 103
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    new-instance v3, La/bgz;

    .line 108
    .line 109
    invoke-direct {v3, v0, v5}, La/bgz;-><init>(Ljava/util/List;B)V

    .line 110
    .line 111
    .line 112
    new-instance v4, La/yul;

    .line 113
    .line 114
    const/16 v5, 0x14

    .line 115
    .line 116
    invoke-direct {v4, v0, v11, v5}, La/yul;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 117
    .line 118
    .line 119
    new-instance v0, La/ugd;

    .line 120
    .line 121
    invoke-direct {v0, v7, v9, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1, v2, v10, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 125
    .line 126
    .line 127
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 128
    .line 129
    return-object v0

    .line 130
    :pswitch_3
    check-cast v0, La/ohz;

    .line 131
    .line 132
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 133
    .line 134
    move-object/from16 v1, p1

    .line 135
    .line 136
    check-cast v1, La/hcz;

    .line 137
    .line 138
    sget-object v2, La/qhz;->l2:La/gst;

    .line 139
    .line 140
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    iget-object v0, v0, La/ohz;->a:Ljava/util/List;

    .line 144
    .line 145
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    new-instance v3, La/bgz;

    .line 150
    .line 151
    invoke-direct {v3, v0, v4}, La/bgz;-><init>(Ljava/util/List;B)V

    .line 152
    .line 153
    .line 154
    new-instance v4, La/yul;

    .line 155
    .line 156
    const/16 v5, 0x13

    .line 157
    .line 158
    invoke-direct {v4, v0, v11, v5}, La/yul;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 159
    .line 160
    .line 161
    new-instance v0, La/ugd;

    .line 162
    .line 163
    invoke-direct {v0, v7, v9, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1, v2, v10, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 167
    .line 168
    .line 169
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 170
    .line 171
    return-object v0

    .line 172
    :pswitch_4
    check-cast v0, La/khz;

    .line 173
    .line 174
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 175
    .line 176
    move-object/from16 v1, p1

    .line 177
    .line 178
    check-cast v1, La/hcz;

    .line 179
    .line 180
    sget-object v2, La/mhz;->l2:La/bst;

    .line 181
    .line 182
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    iget-object v0, v0, La/khz;->a:La/a4x;

    .line 186
    .line 187
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    new-instance v4, La/bgz;

    .line 192
    .line 193
    invoke-direct {v4, v0, v3}, La/bgz;-><init>(Ljava/util/List;B)V

    .line 194
    .line 195
    .line 196
    new-instance v3, La/yul;

    .line 197
    .line 198
    const/16 v5, 0x12

    .line 199
    .line 200
    invoke-direct {v3, v0, v11, v5}, La/yul;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 201
    .line 202
    .line 203
    new-instance v0, La/ugd;

    .line 204
    .line 205
    invoke-direct {v0, v7, v9, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v1, v2, v10, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 209
    .line 210
    .line 211
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 212
    .line 213
    return-object v0

    .line 214
    :pswitch_5
    check-cast v0, La/rgz;

    .line 215
    .line 216
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 217
    .line 218
    move-object/from16 v1, p1

    .line 219
    .line 220
    check-cast v1, La/hcz;

    .line 221
    .line 222
    sget-object v2, La/pgz;->l2:La/art;

    .line 223
    .line 224
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    iget-object v0, v0, La/rgz;->a:La/a4x;

    .line 228
    .line 229
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    new-instance v3, La/bgz;

    .line 234
    .line 235
    invoke-direct {v3, v0, v9}, La/bgz;-><init>(Ljava/util/List;B)V

    .line 236
    .line 237
    .line 238
    new-instance v4, La/yul;

    .line 239
    .line 240
    const/16 v5, 0x11

    .line 241
    .line 242
    invoke-direct {v4, v0, v11, v5}, La/yul;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 243
    .line 244
    .line 245
    new-instance v0, La/ugd;

    .line 246
    .line 247
    invoke-direct {v0, v7, v9, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v1, v2, v10, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 251
    .line 252
    .line 253
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 254
    .line 255
    return-object v0

    .line 256
    :pswitch_6
    check-cast v0, La/yfz;

    .line 257
    .line 258
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 259
    .line 260
    move-object/from16 v1, p1

    .line 261
    .line 262
    check-cast v1, La/hcz;

    .line 263
    .line 264
    sget-object v2, La/cgz;->m2:La/sqt;

    .line 265
    .line 266
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    check-cast v0, La/wfz;

    .line 270
    .line 271
    iget-object v0, v0, La/wfz;->a:La/a4x;

    .line 272
    .line 273
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 274
    .line 275
    .line 276
    move-result v2

    .line 277
    new-instance v3, La/bgz;

    .line 278
    .line 279
    invoke-direct {v3, v0, v8}, La/bgz;-><init>(Ljava/util/List;B)V

    .line 280
    .line 281
    .line 282
    new-instance v4, La/yul;

    .line 283
    .line 284
    invoke-direct {v4, v0, v11, v6}, La/yul;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 285
    .line 286
    .line 287
    new-instance v0, La/ugd;

    .line 288
    .line 289
    invoke-direct {v0, v7, v9, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v1, v2, v10, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 293
    .line 294
    .line 295
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 296
    .line 297
    return-object v0

    .line 298
    :pswitch_7
    check-cast v0, La/fzg0;

    .line 299
    .line 300
    check-cast v11, La/bzg0;

    .line 301
    .line 302
    move-object/from16 v1, p1

    .line 303
    .line 304
    check-cast v1, Ljava/util/Map;

    .line 305
    .line 306
    new-instance v2, La/ldz;

    .line 307
    .line 308
    invoke-direct {v2, v0, v1, v11}, La/ldz;-><init>(La/fzg0;Ljava/util/Map;La/bzg0;)V

    .line 309
    .line 310
    .line 311
    return-object v2

    .line 312
    :pswitch_8
    check-cast v0, La/ldz;

    .line 313
    .line 314
    move-object/from16 v1, p1

    .line 315
    .line 316
    check-cast v1, La/lwk;

    .line 317
    .line 318
    iget-object v1, v0, La/ldz;->c:La/iz40;

    .line 319
    .line 320
    invoke-virtual {v1, v11}, La/iz40;->i(Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    new-instance v1, La/pr0;

    .line 324
    .line 325
    const/16 v2, 0xd

    .line 326
    .line 327
    invoke-direct {v1, v0, v11, v2}, La/pr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 328
    .line 329
    .line 330
    return-object v1

    .line 331
    :pswitch_9
    check-cast v0, La/n8z;

    .line 332
    .line 333
    move-object v1, v11

    .line 334
    check-cast v1, La/m8z;

    .line 335
    .line 336
    move-object/from16 v2, p1

    .line 337
    .line 338
    check-cast v2, Ljava/lang/Integer;

    .line 339
    .line 340
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 341
    .line 342
    .line 343
    move-result v2

    .line 344
    iget-object v3, v0, La/n8z;->h:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast v3, La/y8z;

    .line 347
    .line 348
    iget v4, v3, La/y8z;->i:I

    .line 349
    .line 350
    invoke-virtual {v3, v2}, La/y8z;->e(I)I

    .line 351
    .line 352
    .line 353
    move-result v6

    .line 354
    invoke-virtual {v0, v8, v6}, La/n8z;->a(II)J

    .line 355
    .line 356
    .line 357
    move-result-wide v3

    .line 358
    const/4 v5, 0x0

    .line 359
    iget v7, v1, La/m8z;->e:I

    .line 360
    .line 361
    invoke-virtual/range {v1 .. v7}, La/m8z;->n1(IJIII)La/r8z;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    return-object v0

    .line 366
    :pswitch_a
    check-cast v0, La/y8z;

    .line 367
    .line 368
    check-cast v11, La/n8z;

    .line 369
    .line 370
    move-object/from16 v1, p1

    .line 371
    .line 372
    check-cast v1, Ljava/lang/Integer;

    .line 373
    .line 374
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 375
    .line 376
    .line 377
    move-result v1

    .line 378
    invoke-virtual {v0, v1}, La/y8z;->b(I)La/tyj;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    iget v1, v0, La/tyj;->b:I

    .line 383
    .line 384
    new-instance v2, Ljava/util/ArrayList;

    .line 385
    .line 386
    iget-object v0, v0, La/tyj;->a:Ljava/util/List;

    .line 387
    .line 388
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 389
    .line 390
    .line 391
    move-result v3

    .line 392
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 393
    .line 394
    .line 395
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 396
    .line 397
    .line 398
    move-result v3

    .line 399
    move v4, v8

    .line 400
    :goto_0
    if-ge v8, v3, :cond_0

    .line 401
    .line 402
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v5

    .line 406
    check-cast v5, La/pgv;

    .line 407
    .line 408
    iget-wide v5, v5, La/pgv;->a:J

    .line 409
    .line 410
    long-to-int v5, v5

    .line 411
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 412
    .line 413
    .line 414
    move-result-object v6

    .line 415
    invoke-virtual {v11, v4, v5}, La/n8z;->a(II)J

    .line 416
    .line 417
    .line 418
    move-result-wide v12

    .line 419
    new-instance v7, La/p4e;

    .line 420
    .line 421
    invoke-direct {v7, v12, v13}, La/p4e;-><init>(J)V

    .line 422
    .line 423
    .line 424
    new-instance v10, Lkotlin/Pair;

    .line 425
    .line 426
    invoke-direct {v10, v6, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    add-int/2addr v1, v9

    .line 433
    add-int/2addr v4, v5

    .line 434
    add-int/lit8 v8, v8, 0x1

    .line 435
    .line 436
    goto :goto_0

    .line 437
    :cond_0
    return-object v2

    .line 438
    :pswitch_b
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 439
    .line 440
    check-cast v11, La/jam0;

    .line 441
    .line 442
    move-object/from16 v1, p1

    .line 443
    .line 444
    check-cast v1, Ljava/lang/Integer;

    .line 445
    .line 446
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 447
    .line 448
    .line 449
    move-result v1

    .line 450
    new-instance v2, La/yt30;

    .line 451
    .line 452
    invoke-direct {v2, v1, v11}, La/yt30;-><init>(ILa/jam0;)V

    .line 453
    .line 454
    .line 455
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 459
    .line 460
    return-object v0

    .line 461
    :pswitch_c
    check-cast v0, La/ryy;

    .line 462
    .line 463
    check-cast v11, La/d2w;

    .line 464
    .line 465
    move-object/from16 v1, p1

    .line 466
    .line 467
    check-cast v1, La/k0w0;

    .line 468
    .line 469
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 470
    .line 471
    .line 472
    iget-object v2, v0, La/ryy;->r:La/kys0;

    .line 473
    .line 474
    invoke-virtual {v11}, La/d2w;->f()Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v7

    .line 478
    invoke-virtual {v11}, La/d2w;->b()J

    .line 479
    .line 480
    .line 481
    move-result-wide v3

    .line 482
    invoke-virtual {v11}, La/d2w;->d()J

    .line 483
    .line 484
    .line 485
    move-result-wide v5

    .line 486
    invoke-virtual/range {v2 .. v7}, La/kys0;->e(JJLjava/lang/String;)Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getUfcPostGameScreen$1;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 491
    .line 492
    .line 493
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 494
    .line 495
    return-object v0

    .line 496
    :pswitch_d
    check-cast v0, La/kvy;

    .line 497
    .line 498
    check-cast v11, La/xdr;

    .line 499
    .line 500
    move-object/from16 v1, p1

    .line 501
    .line 502
    check-cast v1, La/hcz;

    .line 503
    .line 504
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 505
    .line 506
    .line 507
    iget-object v2, v0, La/kvy;->a:Ljava/util/ArrayList;

    .line 508
    .line 509
    new-instance v3, La/djx;

    .line 510
    .line 511
    invoke-direct {v3, v6}, La/djx;-><init>(B)V

    .line 512
    .line 513
    .line 514
    invoke-static {v2, v3}, La/xdx;->E(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 515
    .line 516
    .line 517
    move-result-object v3

    .line 518
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 519
    .line 520
    .line 521
    move-result v4

    .line 522
    new-instance v7, La/far;

    .line 523
    .line 524
    const/16 v10, 0x19

    .line 525
    .line 526
    invoke-direct {v7, v3, v10}, La/far;-><init>(Ljava/util/List;B)V

    .line 527
    .line 528
    .line 529
    new-instance v3, La/j13;

    .line 530
    .line 531
    invoke-direct {v3, v2, v6, v8}, La/j13;-><init>(Ljava/util/ArrayList;BZ)V

    .line 532
    .line 533
    .line 534
    new-instance v6, La/h8w;

    .line 535
    .line 536
    invoke-direct {v6, v2, v0, v11, v5}, La/h8w;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 537
    .line 538
    .line 539
    new-instance v0, La/ugd;

    .line 540
    .line 541
    const v2, -0x4e295cff

    .line 542
    .line 543
    .line 544
    invoke-direct {v0, v2, v9, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 545
    .line 546
    .line 547
    invoke-virtual {v1, v4, v7, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 548
    .line 549
    .line 550
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 551
    .line 552
    return-object v0

    .line 553
    :pswitch_e
    move-object v2, v0

    .line 554
    check-cast v2, La/pu90;

    .line 555
    .line 556
    check-cast v11, La/nly;

    .line 557
    .line 558
    move-object/from16 v1, p1

    .line 559
    .line 560
    check-cast v1, La/ou90;

    .line 561
    .line 562
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 563
    .line 564
    .line 565
    new-instance v5, La/lly;

    .line 566
    .line 567
    invoke-direct {v5, v11, v8}, La/lly;-><init>(La/nly;B)V

    .line 568
    .line 569
    .line 570
    const/4 v6, 0x4

    .line 571
    const/4 v3, 0x0

    .line 572
    const/4 v4, 0x0

    .line 573
    invoke-static/range {v1 .. v6}, La/ou90;->F(La/ou90;La/pu90;IILkotlin/jvm/functions/Function1;I)V

    .line 574
    .line 575
    .line 576
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 577
    .line 578
    return-object v0

    .line 579
    :pswitch_f
    check-cast v0, La/x6f;

    .line 580
    .line 581
    check-cast v11, La/x6f;

    .line 582
    .line 583
    move-object/from16 v1, p1

    .line 584
    .line 585
    check-cast v1, La/cp;

    .line 586
    .line 587
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 588
    .line 589
    .line 590
    new-instance v2, La/k9v;

    .line 591
    .line 592
    const/4 v3, 0x7

    .line 593
    invoke-direct {v2, v1, v0, v11, v3}, La/k9v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 594
    .line 595
    .line 596
    invoke-virtual {v1, v2}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 597
    .line 598
    .line 599
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 600
    .line 601
    return-object v0

    .line 602
    :pswitch_10
    check-cast v0, La/adw;

    .line 603
    .line 604
    check-cast v11, La/cp;

    .line 605
    .line 606
    move-object/from16 v1, p1

    .line 607
    .line 608
    check-cast v1, Landroid/view/View;

    .line 609
    .line 610
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 611
    .line 612
    .line 613
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v1

    .line 617
    invoke-virtual {v0, v1}, La/adw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 621
    .line 622
    return-object v0

    .line 623
    :pswitch_11
    check-cast v0, La/tax;

    .line 624
    .line 625
    check-cast v11, La/y9x;

    .line 626
    .line 627
    move-object/from16 v1, p1

    .line 628
    .line 629
    check-cast v1, La/k0w0;

    .line 630
    .line 631
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 632
    .line 633
    .line 634
    iget-object v3, v0, La/tax;->l:La/nv20;

    .line 635
    .line 636
    iget-object v3, v3, La/nv20;->a:Ljava/lang/Object;

    .line 637
    .line 638
    check-cast v3, La/h6i;

    .line 639
    .line 640
    invoke-virtual {v3}, La/h6i;->c()La/yox;

    .line 641
    .line 642
    .line 643
    move-result-object v13

    .line 644
    invoke-static {v11}, La/x9x;->T(La/y9x;)I

    .line 645
    .line 646
    .line 647
    move-result v14

    .line 648
    iget-object v0, v0, La/tax;->n:La/edu;

    .line 649
    .line 650
    iget-object v3, v0, La/edu;->b:Ljava/lang/Object;

    .line 651
    .line 652
    check-cast v3, La/ntu;

    .line 653
    .line 654
    invoke-virtual {v3}, La/ntu;->a()Ljava/lang/String;

    .line 655
    .line 656
    .line 657
    move-result-object v3

    .line 658
    iget-object v0, v0, La/edu;->c:Ljava/lang/Object;

    .line 659
    .line 660
    check-cast v0, La/hsj;

    .line 661
    .line 662
    iget-object v4, v0, La/hsj;->a:Ljava/lang/Object;

    .line 663
    .line 664
    check-cast v4, La/yk50;

    .line 665
    .line 666
    iget-object v4, v4, La/yk50;->b:Ljava/lang/Object;

    .line 667
    .line 668
    check-cast v4, La/knf0;

    .line 669
    .line 670
    iget-object v0, v0, La/hsj;->b:Ljava/lang/Object;

    .line 671
    .line 672
    check-cast v0, La/yox;

    .line 673
    .line 674
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 675
    .line 676
    .line 677
    move-result-object v5

    .line 678
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 679
    .line 680
    .line 681
    iget-object v0, v0, La/yox;->a:Ljava/lang/Object;

    .line 682
    .line 683
    check-cast v0, La/kuy;

    .line 684
    .line 685
    invoke-virtual {v0}, La/kuy;->a()Ljava/lang/String;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    const-string v6, "zh"

    .line 690
    .line 691
    invoke-static {v0, v6, v8}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 692
    .line 693
    .line 694
    move-result v6

    .line 695
    if-nez v6, :cond_1

    .line 696
    .line 697
    const-string v6, "ZH"

    .line 698
    .line 699
    invoke-static {v0, v6, v8}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 700
    .line 701
    .line 702
    move-result v6

    .line 703
    if-eqz v6, :cond_4

    .line 704
    .line 705
    :cond_1
    invoke-virtual {v5}, Ljava/util/Locale;->getScript()Ljava/lang/String;

    .line 706
    .line 707
    .line 708
    move-result-object v0

    .line 709
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 710
    .line 711
    .line 712
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 713
    .line 714
    .line 715
    move-result-object v6

    .line 716
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 717
    .line 718
    .line 719
    invoke-virtual {v0, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 720
    .line 721
    .line 722
    move-result-object v0

    .line 723
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 724
    .line 725
    .line 726
    const-string v6, "hans"

    .line 727
    .line 728
    invoke-virtual {v0, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 729
    .line 730
    .line 731
    move-result v6

    .line 732
    if-eqz v6, :cond_2

    .line 733
    .line 734
    const-string v0, "cn"

    .line 735
    .line 736
    goto :goto_1

    .line 737
    :cond_2
    const-string v6, "hant"

    .line 738
    .line 739
    invoke-virtual {v0, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 740
    .line 741
    .line 742
    move-result v0

    .line 743
    if-eqz v0, :cond_3

    .line 744
    .line 745
    const-string v0, "tw"

    .line 746
    .line 747
    goto :goto_1

    .line 748
    :cond_3
    invoke-virtual {v5}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    .line 749
    .line 750
    .line 751
    move-result-object v0

    .line 752
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 753
    .line 754
    .line 755
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 756
    .line 757
    .line 758
    move-result-object v5

    .line 759
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 760
    .line 761
    .line 762
    invoke-virtual {v0, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 763
    .line 764
    .line 765
    move-result-object v0

    .line 766
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 767
    .line 768
    .line 769
    :cond_4
    :goto_1
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 770
    .line 771
    .line 772
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 773
    .line 774
    .line 775
    new-instance v4, Ljava/lang/StringBuilder;

    .line 776
    .line 777
    const-string v5, "/paysystems/information/?type=2&whence=22&lng="

    .line 778
    .line 779
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 780
    .line 781
    .line 782
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 783
    .line 784
    .line 785
    const-string v0, "&ref_id=1"

    .line 786
    .line 787
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 788
    .line 789
    .line 790
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 791
    .line 792
    .line 793
    move-result-object v0

    .line 794
    invoke-static {v3, v2, v0}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 795
    .line 796
    .line 797
    move-result-object v15

    .line 798
    sget-object v0, La/y9x;->g:La/y9x;

    .line 799
    .line 800
    if-ne v11, v0, :cond_5

    .line 801
    .line 802
    move/from16 v17, v9

    .line 803
    .line 804
    goto :goto_2

    .line 805
    :cond_5
    move/from16 v17, v8

    .line 806
    .line 807
    :goto_2
    new-instance v12, Lorg/xplatform/rules/impl/navigation/PaymentInfoScreenFactoryImpl$getPaymentInfoScreen$1;

    .line 808
    .line 809
    const/16 v16, -0x1

    .line 810
    .line 811
    invoke-direct/range {v12 .. v17}, Lorg/xplatform/rules/impl/navigation/PaymentInfoScreenFactoryImpl$getPaymentInfoScreen$1;-><init>(La/yox;ILjava/lang/String;IZ)V

    .line 812
    .line 813
    .line 814
    invoke-virtual {v1, v12}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 815
    .line 816
    .line 817
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 818
    .line 819
    return-object v0

    .line 820
    :pswitch_12
    check-cast v0, La/z7x;

    .line 821
    .line 822
    check-cast v11, La/x7x;

    .line 823
    .line 824
    move-object/from16 v1, p1

    .line 825
    .line 826
    check-cast v1, La/lwk;

    .line 827
    .line 828
    iget-object v1, v0, La/z7x;->a:La/xz40;

    .line 829
    .line 830
    invoke-virtual {v1, v11}, La/xz40;->b(Ljava/lang/Object;)V

    .line 831
    .line 832
    .line 833
    iget-object v1, v0, La/z7x;->b:La/pz40;

    .line 834
    .line 835
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 836
    .line 837
    check-cast v1, La/hgk0;

    .line 838
    .line 839
    invoke-virtual {v1, v2}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 840
    .line 841
    .line 842
    new-instance v1, La/pr0;

    .line 843
    .line 844
    const/16 v2, 0xb

    .line 845
    .line 846
    invoke-direct {v1, v0, v11, v2}, La/pr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 847
    .line 848
    .line 849
    return-object v1

    .line 850
    :pswitch_13
    check-cast v0, La/epw;

    .line 851
    .line 852
    check-cast v11, La/krw;

    .line 853
    .line 854
    move-object/from16 v1, p1

    .line 855
    .line 856
    check-cast v1, La/k0w0;

    .line 857
    .line 858
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 859
    .line 860
    .line 861
    new-instance v3, Lorg/xplatform/statistic/horse_menu/actual/HorseMenusScreen;

    .line 862
    .line 863
    iget-wide v4, v11, La/krw;->p:J

    .line 864
    .line 865
    new-instance v12, Lorg/xplatform/statistic/horse_menu/domain/model/HorseInfoModel;

    .line 866
    .line 867
    iget-object v13, v0, La/epw;->a:Ljava/lang/String;

    .line 868
    .line 869
    iget-object v14, v0, La/epw;->c:Ljava/lang/String;

    .line 870
    .line 871
    iget-object v15, v0, La/epw;->b:Ljava/lang/String;

    .line 872
    .line 873
    iget-object v6, v0, La/epw;->f:Ljava/lang/String;

    .line 874
    .line 875
    filled-new-array {v2}, [Ljava/lang/String;

    .line 876
    .line 877
    .line 878
    move-result-object v2

    .line 879
    const/4 v7, 0x6

    .line 880
    invoke-static {v6, v2, v8, v7}, Lkotlin/text/StringsKt;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 881
    .line 882
    .line 883
    move-result-object v2

    .line 884
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 885
    .line 886
    .line 887
    move-result-object v2

    .line 888
    check-cast v2, Ljava/lang/String;

    .line 889
    .line 890
    if-eqz v2, :cond_7

    .line 891
    .line 892
    invoke-static {v2}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 893
    .line 894
    .line 895
    move-result-object v2

    .line 896
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 897
    .line 898
    .line 899
    move-result-object v2

    .line 900
    if-nez v2, :cond_6

    .line 901
    .line 902
    goto :goto_4

    .line 903
    :cond_6
    :goto_3
    move-object/from16 v16, v2

    .line 904
    .line 905
    goto :goto_5

    .line 906
    :cond_7
    :goto_4
    const-string v2, "-"

    .line 907
    .line 908
    goto :goto_3

    .line 909
    :goto_5
    iget-object v0, v0, La/epw;->d:Ljava/lang/String;

    .line 910
    .line 911
    move-object/from16 v17, v0

    .line 912
    .line 913
    move-wide/from16 v18, v4

    .line 914
    .line 915
    invoke-direct/range {v12 .. v19}, Lorg/xplatform/statistic/horse_menu/domain/model/HorseInfoModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 916
    .line 917
    .line 918
    invoke-direct {v3, v12}, Lorg/xplatform/statistic/horse_menu/actual/HorseMenusScreen;-><init>(Lorg/xplatform/statistic/horse_menu/domain/model/HorseInfoModel;)V

    .line 919
    .line 920
    .line 921
    invoke-virtual {v1, v3}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 922
    .line 923
    .line 924
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 925
    .line 926
    return-object v0

    .line 927
    :pswitch_14
    check-cast v0, La/mie0;

    .line 928
    .line 929
    move-object v1, v11

    .line 930
    check-cast v1, La/krw;

    .line 931
    .line 932
    move-object/from16 v2, p1

    .line 933
    .line 934
    check-cast v2, Ljava/lang/Throwable;

    .line 935
    .line 936
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 937
    .line 938
    .line 939
    iget-object v0, v0, La/mie0;->a:Ljava/lang/Object;

    .line 940
    .line 941
    check-cast v0, La/bby;

    .line 942
    .line 943
    if-eqz v0, :cond_8

    .line 944
    .line 945
    invoke-interface {v0, v10}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 946
    .line 947
    .line 948
    :cond_8
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 949
    .line 950
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 951
    .line 952
    :cond_9
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 953
    .line 954
    .line 955
    move-result-object v0

    .line 956
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 957
    .line 958
    .line 959
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 960
    .line 961
    move-object v4, v0

    .line 962
    check-cast v4, La/crw;

    .line 963
    .line 964
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 965
    .line 966
    .line 967
    const/4 v9, 0x0

    .line 968
    const/16 v10, 0x1c

    .line 969
    .line 970
    const/4 v5, 0x0

    .line 971
    const/4 v6, 0x1

    .line 972
    const/4 v7, 0x0

    .line 973
    const/4 v8, 0x0

    .line 974
    invoke-static/range {v4 .. v10}, La/crw;->a(La/crw;ZZZLjava/util/ArrayList;ZI)La/crw;

    .line 975
    .line 976
    .line 977
    move-result-object v3

    .line 978
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 979
    .line 980
    .line 981
    move-result v0

    .line 982
    if-eqz v0, :cond_9

    .line 983
    .line 984
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 985
    .line 986
    return-object v0

    .line 987
    :pswitch_15
    check-cast v0, La/mie0;

    .line 988
    .line 989
    move-object v1, v11

    .line 990
    check-cast v1, La/qqw;

    .line 991
    .line 992
    move-object/from16 v2, p1

    .line 993
    .line 994
    check-cast v2, Ljava/lang/Throwable;

    .line 995
    .line 996
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 997
    .line 998
    .line 999
    iget-object v0, v0, La/mie0;->a:Ljava/lang/Object;

    .line 1000
    .line 1001
    check-cast v0, La/bby;

    .line 1002
    .line 1003
    if-eqz v0, :cond_a

    .line 1004
    .line 1005
    invoke-interface {v0, v10}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 1006
    .line 1007
    .line 1008
    :cond_a
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 1009
    .line 1010
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 1011
    .line 1012
    :cond_b
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v0

    .line 1016
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1017
    .line 1018
    .line 1019
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 1020
    .line 1021
    move-object v4, v0

    .line 1022
    check-cast v4, La/dqw;

    .line 1023
    .line 1024
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1025
    .line 1026
    .line 1027
    const/4 v13, 0x0

    .line 1028
    const/16 v14, 0x3fc

    .line 1029
    .line 1030
    const/4 v5, 0x0

    .line 1031
    const/4 v6, 0x1

    .line 1032
    const/4 v7, 0x0

    .line 1033
    const/4 v8, 0x0

    .line 1034
    const/4 v9, 0x0

    .line 1035
    const/4 v10, 0x0

    .line 1036
    const/4 v11, 0x0

    .line 1037
    const/4 v12, 0x0

    .line 1038
    invoke-static/range {v4 .. v14}, La/dqw;->a(La/dqw;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;La/nc5;I)La/dqw;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v3

    .line 1042
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1043
    .line 1044
    .line 1045
    move-result v0

    .line 1046
    if-eqz v0, :cond_b

    .line 1047
    .line 1048
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1049
    .line 1050
    return-object v0

    .line 1051
    :pswitch_16
    check-cast v0, La/drw;

    .line 1052
    .line 1053
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 1054
    .line 1055
    move-object/from16 v1, p1

    .line 1056
    .line 1057
    check-cast v1, La/hcz;

    .line 1058
    .line 1059
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1060
    .line 1061
    .line 1062
    iget-object v2, v0, La/drw;->b:La/a4x;

    .line 1063
    .line 1064
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1065
    .line 1066
    .line 1067
    move-result v4

    .line 1068
    new-instance v5, La/far;

    .line 1069
    .line 1070
    const/16 v6, 0x15

    .line 1071
    .line 1072
    invoke-direct {v5, v2, v6}, La/far;-><init>(Ljava/util/List;B)V

    .line 1073
    .line 1074
    .line 1075
    new-instance v6, La/h8w;

    .line 1076
    .line 1077
    invoke-direct {v6, v2, v0, v11, v3}, La/h8w;-><init>(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;B)V

    .line 1078
    .line 1079
    .line 1080
    new-instance v0, La/ugd;

    .line 1081
    .line 1082
    const v2, 0x799532c4

    .line 1083
    .line 1084
    .line 1085
    invoke-direct {v0, v2, v9, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1086
    .line 1087
    .line 1088
    invoke-virtual {v1, v4, v10, v5, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1089
    .line 1090
    .line 1091
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1092
    .line 1093
    return-object v0

    .line 1094
    :pswitch_17
    check-cast v0, La/mie0;

    .line 1095
    .line 1096
    check-cast v11, La/yow;

    .line 1097
    .line 1098
    move-object/from16 v1, p1

    .line 1099
    .line 1100
    check-cast v1, Ljava/lang/Throwable;

    .line 1101
    .line 1102
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1103
    .line 1104
    .line 1105
    iget-object v0, v0, La/mie0;->a:Ljava/lang/Object;

    .line 1106
    .line 1107
    check-cast v0, La/bby;

    .line 1108
    .line 1109
    if-eqz v0, :cond_c

    .line 1110
    .line 1111
    invoke-interface {v0, v10}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 1112
    .line 1113
    .line 1114
    :cond_c
    iget-object v0, v11, La/yow;->q:La/duj;

    .line 1115
    .line 1116
    new-instance v2, La/wow;

    .line 1117
    .line 1118
    invoke-direct {v2, v11, v8}, La/wow;-><init>(La/yow;B)V

    .line 1119
    .line 1120
    .line 1121
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1122
    .line 1123
    .line 1124
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1125
    .line 1126
    return-object v0

    .line 1127
    :pswitch_18
    check-cast v0, La/mie0;

    .line 1128
    .line 1129
    move-object v1, v11

    .line 1130
    check-cast v1, La/snw;

    .line 1131
    .line 1132
    move-object/from16 v2, p1

    .line 1133
    .line 1134
    check-cast v2, Ljava/lang/Throwable;

    .line 1135
    .line 1136
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1137
    .line 1138
    .line 1139
    iget-object v0, v0, La/mie0;->a:Ljava/lang/Object;

    .line 1140
    .line 1141
    check-cast v0, La/bby;

    .line 1142
    .line 1143
    if-eqz v0, :cond_d

    .line 1144
    .line 1145
    invoke-interface {v0, v10}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 1146
    .line 1147
    .line 1148
    :cond_d
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 1149
    .line 1150
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 1151
    .line 1152
    :cond_e
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v0

    .line 1156
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1157
    .line 1158
    .line 1159
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 1160
    .line 1161
    move-object v4, v0

    .line 1162
    check-cast v4, La/gnw;

    .line 1163
    .line 1164
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1165
    .line 1166
    .line 1167
    const/4 v10, 0x0

    .line 1168
    const/16 v11, 0x7c

    .line 1169
    .line 1170
    const/4 v5, 0x0

    .line 1171
    const/4 v6, 0x1

    .line 1172
    const/4 v7, 0x0

    .line 1173
    const/4 v8, 0x0

    .line 1174
    const/4 v9, 0x0

    .line 1175
    invoke-static/range {v4 .. v11}, La/gnw;->a(La/gnw;ZZZLjava/util/ArrayList;La/wmw;La/nc5;I)La/gnw;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v3

    .line 1179
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1180
    .line 1181
    .line 1182
    move-result v0

    .line 1183
    if-eqz v0, :cond_e

    .line 1184
    .line 1185
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1186
    .line 1187
    return-object v0

    .line 1188
    :pswitch_19
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 1189
    .line 1190
    check-cast v11, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/HorizontalPromoStoreCollectionItem;

    .line 1191
    .line 1192
    move-object/from16 v1, p1

    .line 1193
    .line 1194
    check-cast v1, Landroid/graphics/drawable/Drawable;

    .line 1195
    .line 1196
    sget v2, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/HorizontalPromoStoreCollectionItem;->h:I

    .line 1197
    .line 1198
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1199
    .line 1200
    .line 1201
    invoke-interface {v0, v1, v11}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v0

    .line 1205
    check-cast v0, Ljava/lang/Boolean;

    .line 1206
    .line 1207
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1208
    .line 1209
    .line 1210
    return-object v0

    .line 1211
    :pswitch_1a
    check-cast v0, La/tkw;

    .line 1212
    .line 1213
    check-cast v11, La/tiw;

    .line 1214
    .line 1215
    move-object/from16 v1, p1

    .line 1216
    .line 1217
    check-cast v1, La/k0w0;

    .line 1218
    .line 1219
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1220
    .line 1221
    .line 1222
    iget-object v0, v0, La/tkw;->t:La/kys0;

    .line 1223
    .line 1224
    iget-wide v2, v11, La/tiw;->d:J

    .line 1225
    .line 1226
    iget-object v4, v11, La/tiw;->c:Ljava/lang/String;

    .line 1227
    .line 1228
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1229
    .line 1230
    .line 1231
    new-instance v0, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getChampionshipFragmentScreen$1;

    .line 1232
    .line 1233
    invoke-direct {v0, v2, v3, v4}, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getChampionshipFragmentScreen$1;-><init>(JLjava/lang/String;)V

    .line 1234
    .line 1235
    .line 1236
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1237
    .line 1238
    .line 1239
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1240
    .line 1241
    return-object v0

    .line 1242
    :pswitch_1b
    check-cast v0, La/tkw;

    .line 1243
    .line 1244
    move-object v13, v11

    .line 1245
    check-cast v13, La/j700;

    .line 1246
    .line 1247
    move-object/from16 v1, p1

    .line 1248
    .line 1249
    check-cast v1, La/k0w0;

    .line 1250
    .line 1251
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1252
    .line 1253
    .line 1254
    iget-object v12, v0, La/tkw;->v:La/vjp;

    .line 1255
    .line 1256
    new-instance v14, La/d8h0;

    .line 1257
    .line 1258
    invoke-direct {v14, v4, v10}, La/d8h0;-><init>(ILjava/util/Set;)V

    .line 1259
    .line 1260
    .line 1261
    const-wide/16 v2, 0xbd

    .line 1262
    .line 1263
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v0

    .line 1267
    invoke-static {v0}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 1268
    .line 1269
    .line 1270
    move-result-object v15

    .line 1271
    const-string v18, ""

    .line 1272
    .line 1273
    const-wide/16 v16, -0x1

    .line 1274
    .line 1275
    invoke-virtual/range {v12 .. v18}, La/vjp;->b(La/j700;La/f9h0;Ljava/util/Set;JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v0

    .line 1279
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1280
    .line 1281
    .line 1282
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1283
    .line 1284
    return-object v0

    .line 1285
    :pswitch_1c
    check-cast v0, La/ukw;

    .line 1286
    .line 1287
    check-cast v11, La/oru0;

    .line 1288
    .line 1289
    move-object/from16 v1, p1

    .line 1290
    .line 1291
    check-cast v1, La/k0w0;

    .line 1292
    .line 1293
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1294
    .line 1295
    .line 1296
    iget-object v0, v0, La/ukw;->G:La/vqc;

    .line 1297
    .line 1298
    iget-object v2, v11, La/oru0;->d:Ljava/util/List;

    .line 1299
    .line 1300
    new-instance v3, Ljava/util/ArrayList;

    .line 1301
    .line 1302
    const/16 v4, 0xa

    .line 1303
    .line 1304
    invoke-static {v2, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1305
    .line 1306
    .line 1307
    move-result v4

    .line 1308
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 1309
    .line 1310
    .line 1311
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v2

    .line 1315
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1316
    .line 1317
    .line 1318
    move-result v4

    .line 1319
    if-eqz v4, :cond_f

    .line 1320
    .line 1321
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v4

    .line 1325
    check-cast v4, La/iqu0;

    .line 1326
    .line 1327
    iget v4, v4, La/iqu0;->a:I

    .line 1328
    .line 1329
    int-to-long v4, v4

    .line 1330
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1331
    .line 1332
    .line 1333
    move-result-object v4

    .line 1334
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1335
    .line 1336
    .line 1337
    goto :goto_6

    .line 1338
    :cond_f
    iget v2, v11, La/oru0;->a:I

    .line 1339
    .line 1340
    iget-object v4, v11, La/oru0;->b:Ljava/lang/String;

    .line 1341
    .line 1342
    iget-object v5, v11, La/oru0;->c:Ljava/lang/String;

    .line 1343
    .line 1344
    new-instance v6, Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualGameCategoryParams;

    .line 1345
    .line 1346
    invoke-direct {v6, v2, v4, v5, v3}, Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualGameCategoryParams;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1347
    .line 1348
    .line 1349
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1350
    .line 1351
    .line 1352
    new-instance v2, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$virtualGameCategoryMainScreen$1;

    .line 1353
    .line 1354
    invoke-direct {v2, v0, v6}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$virtualGameCategoryMainScreen$1;-><init>(La/vqc;Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualGameCategoryParams;)V

    .line 1355
    .line 1356
    .line 1357
    invoke-virtual {v1, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1358
    .line 1359
    .line 1360
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1361
    .line 1362
    return-object v0

    .line 1363
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
