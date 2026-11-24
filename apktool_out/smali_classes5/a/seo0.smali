.class public final synthetic La/seo0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/teo0;


# direct methods
.method public synthetic constructor <init>(La/teo0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/seo0;->a:B

    iput-object p1, p0, La/seo0;->b:La/teo0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/seo0;->a:B

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x1

    .line 11
    iget-object v0, v0, La/seo0;->b:La/teo0;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object/from16 v1, p1

    .line 17
    .line 18
    check-cast v1, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    iget-object v2, v0, La/teo0;->i:La/n0o0;

    .line 25
    .line 26
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, La/fee;

    .line 31
    .line 32
    invoke-virtual {v2}, La/fee;->b()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_0

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    sub-int/2addr v3, v6

    .line 50
    invoke-static {v1, v5, v3}, La/l1e0;->d(III)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    add-int/2addr v1, v6

    .line 55
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    new-instance v4, La/p9r0;

    .line 60
    .line 61
    iget-object v0, v0, La/teo0;->a:La/ctf0;

    .line 62
    .line 63
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    filled-new-array {v3, v7}, [Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 76
    .line 77
    const/4 v7, 0x2

    .line 78
    invoke-static {v3, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    const v7, 0x7f131051

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v7, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    if-le v1, v6, :cond_1

    .line 90
    .line 91
    move v3, v6

    .line 92
    goto :goto_0

    .line 93
    :cond_1
    move v3, v5

    .line 94
    :goto_0
    if-ge v1, v2, :cond_2

    .line 95
    .line 96
    move v5, v6

    .line 97
    :cond_2
    invoke-direct {v4, v0, v3, v5}, La/p9r0;-><init>(Ljava/lang/String;ZZ)V

    .line 98
    .line 99
    .line 100
    :goto_1
    return-object v4

    .line 101
    :pswitch_0
    move-object/from16 v1, p1

    .line 102
    .line 103
    check-cast v1, Ljava/util/List;

    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, La/teo0;->a()La/fee;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    invoke-virtual {v4}, La/fee;->c()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    check-cast v4, Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    if-lt v4, v3, :cond_5

    .line 123
    .line 124
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->S0(Ljava/lang/Iterable;)La/rx3;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    new-instance v3, Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1}, La/rx3;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    :cond_3
    :goto_2
    move-object v4, v1

    .line 138
    check-cast v4, La/iil;

    .line 139
    .line 140
    iget-object v5, v4, La/iil;->b:Ljava/util/Iterator;

    .line 141
    .line 142
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    if-eqz v5, :cond_4

    .line 147
    .line 148
    invoke-virtual {v4}, La/iil;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    move-object v5, v4

    .line 153
    check-cast v5, Lkotlin/collections/IndexedValue;

    .line 154
    .line 155
    iget-object v5, v5, Lkotlin/collections/IndexedValue;->b:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v5, La/x8r0;

    .line 158
    .line 159
    iget-object v5, v5, La/x8r0;->c:Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {v0}, La/teo0;->a()La/fee;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    invoke-virtual {v7}, La/fee;->c()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    check-cast v7, Ljava/lang/CharSequence;

    .line 170
    .line 171
    invoke-static {v5, v7, v6}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    if-eqz v5, :cond_3

    .line 176
    .line 177
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    .line 182
    .line 183
    invoke-static {v3, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    if-eqz v2, :cond_6

    .line 199
    .line 200
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    check-cast v2, Lkotlin/collections/IndexedValue;

    .line 205
    .line 206
    iget v2, v2, Lkotlin/collections/IndexedValue;->a:I

    .line 207
    .line 208
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    goto :goto_3

    .line 216
    :cond_5
    sget-object v0, La/iun;->a:La/iun;

    .line 217
    .line 218
    :cond_6
    return-object v0

    .line 219
    :pswitch_1
    move-object/from16 v1, p1

    .line 220
    .line 221
    check-cast v1, Ljava/util/List;

    .line 222
    .line 223
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v0}, La/teo0;->a()La/fee;

    .line 227
    .line 228
    .line 229
    move-result-object v7

    .line 230
    invoke-virtual {v7}, La/fee;->c()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v7

    .line 234
    check-cast v7, Ljava/lang/String;

    .line 235
    .line 236
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 237
    .line 238
    .line 239
    move-result v7

    .line 240
    if-lt v7, v3, :cond_8

    .line 241
    .line 242
    new-instance v3, Ljava/util/ArrayList;

    .line 243
    .line 244
    invoke-static {v1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 245
    .line 246
    .line 247
    move-result v7

    .line 248
    invoke-direct {v3, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 249
    .line 250
    .line 251
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 256
    .line 257
    .line 258
    move-result v7

    .line 259
    if-eqz v7, :cond_7

    .line 260
    .line 261
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v7

    .line 265
    check-cast v7, La/x8r0;

    .line 266
    .line 267
    iget-object v8, v7, La/x8r0;->c:Ljava/lang/String;

    .line 268
    .line 269
    invoke-virtual {v0}, La/teo0;->a()La/fee;

    .line 270
    .line 271
    .line 272
    move-result-object v9

    .line 273
    invoke-virtual {v9}, La/fee;->c()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v9

    .line 277
    check-cast v9, Ljava/lang/CharSequence;

    .line 278
    .line 279
    invoke-static {v8, v9, v6}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 280
    .line 281
    .line 282
    move-result v12

    .line 283
    iget-object v11, v7, La/x8r0;->a:Ljava/lang/String;

    .line 284
    .line 285
    iget-object v13, v7, La/x8r0;->c:Ljava/lang/String;

    .line 286
    .line 287
    iget v14, v7, La/x8r0;->d:I

    .line 288
    .line 289
    iget-object v15, v7, La/x8r0;->e:Ljava/lang/String;

    .line 290
    .line 291
    iget-object v8, v7, La/x8r0;->f:La/zqe;

    .line 292
    .line 293
    iget-object v9, v7, La/x8r0;->g:Ljava/lang/String;

    .line 294
    .line 295
    iget-object v7, v7, La/x8r0;->h:Ljava/util/Map;

    .line 296
    .line 297
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    new-instance v10, La/x8r0;

    .line 301
    .line 302
    move-object/from16 v18, v7

    .line 303
    .line 304
    move-object/from16 v16, v8

    .line 305
    .line 306
    move-object/from16 v17, v9

    .line 307
    .line 308
    invoke-direct/range {v10 .. v18}, La/x8r0;-><init>(Ljava/lang/String;ZLjava/lang/String;ILjava/lang/String;La/zqe;Ljava/lang/String;Ljava/util/Map;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    goto :goto_4

    .line 315
    :cond_7
    move-object v1, v3

    .line 316
    :cond_8
    new-instance v0, Ljava/util/ArrayList;

    .line 317
    .line 318
    invoke-static {v1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 319
    .line 320
    .line 321
    move-result v2

    .line 322
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 323
    .line 324
    .line 325
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 330
    .line 331
    .line 332
    move-result v2

    .line 333
    if-eqz v2, :cond_c

    .line 334
    .line 335
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    add-int/lit8 v3, v5, 0x1

    .line 340
    .line 341
    if-ltz v5, :cond_b

    .line 342
    .line 343
    check-cast v2, La/x8r0;

    .line 344
    .line 345
    iget-object v6, v2, La/x8r0;->a:Ljava/lang/String;

    .line 346
    .line 347
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v7

    .line 351
    new-instance v5, La/c280;

    .line 352
    .line 353
    iget-object v8, v2, La/x8r0;->g:Ljava/lang/String;

    .line 354
    .line 355
    invoke-static {v8}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v8

    .line 359
    const v9, 0x7f0809ae

    .line 360
    .line 361
    .line 362
    invoke-direct {v5, v8, v9}, La/c280;-><init>(Ljava/lang/String;I)V

    .line 363
    .line 364
    .line 365
    sget-object v8, La/d4d;->t:La/d4d;

    .line 366
    .line 367
    sget-object v9, La/w6n;->e:La/w6n;

    .line 368
    .line 369
    new-instance v10, La/u6n;

    .line 370
    .line 371
    invoke-direct {v10, v8, v9, v5}, La/u6n;-><init>(La/d4d;La/w6n;La/d280;)V

    .line 372
    .line 373
    .line 374
    iget-object v9, v2, La/x8r0;->c:Ljava/lang/String;

    .line 375
    .line 376
    iget-object v5, v2, La/x8r0;->f:La/zqe;

    .line 377
    .line 378
    move-object v11, v10

    .line 379
    iget-object v10, v5, La/zqe;->a:Ljava/lang/String;

    .line 380
    .line 381
    new-instance v12, La/c280;

    .line 382
    .line 383
    iget-object v5, v5, La/zqe;->b:Ljava/lang/String;

    .line 384
    .line 385
    invoke-static {v5}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v5

    .line 389
    const v13, 0x7f08096d

    .line 390
    .line 391
    .line 392
    invoke-direct {v12, v5, v13}, La/c280;-><init>(Ljava/lang/String;I)V

    .line 393
    .line 394
    .line 395
    sget-object v5, La/w6n;->l:La/w6n;

    .line 396
    .line 397
    move-object v13, v11

    .line 398
    new-instance v11, La/t6n;

    .line 399
    .line 400
    invoke-direct {v11, v8, v5, v12}, La/t6n;-><init>(La/d4d;La/w6n;La/c280;)V

    .line 401
    .line 402
    .line 403
    iget-boolean v12, v2, La/x8r0;->b:Z

    .line 404
    .line 405
    iget-object v15, v2, La/x8r0;->h:Ljava/util/Map;

    .line 406
    .line 407
    if-eqz v12, :cond_9

    .line 408
    .line 409
    sget-object v2, La/s6t0;->a:La/pz40;

    .line 410
    .line 411
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 412
    .line 413
    .line 414
    move-result-object v2

    .line 415
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 416
    .line 417
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary60-0d7_KjU()J

    .line 418
    .line 419
    .line 420
    move-result-wide v16

    .line 421
    goto :goto_6

    .line 422
    :cond_9
    rem-int/lit8 v2, v3, 0x2

    .line 423
    .line 424
    if-nez v2, :cond_a

    .line 425
    .line 426
    sget-object v2, La/s6t0;->a:La/pz40;

    .line 427
    .line 428
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 433
    .line 434
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundGroup-0d7_KjU()J

    .line 435
    .line 436
    .line 437
    move-result-wide v16

    .line 438
    goto :goto_6

    .line 439
    :cond_a
    sget-object v2, La/s6t0;->a:La/pz40;

    .line 440
    .line 441
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 446
    .line 447
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 448
    .line 449
    .line 450
    move-result-wide v16

    .line 451
    :goto_6
    new-instance v5, La/deo0;

    .line 452
    .line 453
    move-object v8, v13

    .line 454
    move-wide/from16 v13, v16

    .line 455
    .line 456
    invoke-direct/range {v5 .. v15}, La/deo0;-><init>(Ljava/lang/String;Ljava/lang/String;La/u6n;Ljava/lang/String;Ljava/lang/String;La/t6n;ZJLjava/util/Map;)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move v5, v3

    .line 463
    goto/16 :goto_5

    .line 464
    .line 465
    :cond_b
    invoke-static {}, La/q3d;->p()V

    .line 466
    .line 467
    .line 468
    throw v4

    .line 469
    :cond_c
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    return-object v0

    .line 474
    :pswitch_2
    move-object/from16 v1, p1

    .line 475
    .line 476
    check-cast v1, Ljava/lang/String;

    .line 477
    .line 478
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 479
    .line 480
    .line 481
    new-instance v2, La/mdm;

    .line 482
    .line 483
    sget-object v1, La/pb10;->c:La/xuz;

    .line 484
    .line 485
    sget-object v3, La/pb10;->e:La/pb10;

    .line 486
    .line 487
    iget v0, v0, La/teo0;->b:I

    .line 488
    .line 489
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 490
    .line 491
    .line 492
    invoke-static {v3, v0}, La/xuz;->a(La/pb10;I)I

    .line 493
    .line 494
    .line 495
    move-result v3

    .line 496
    const-wide/16 v13, 0x0

    .line 497
    .line 498
    const/16 v15, 0x3de

    .line 499
    .line 500
    const/4 v4, 0x0

    .line 501
    const/4 v5, 0x0

    .line 502
    const/4 v6, 0x0

    .line 503
    const/4 v7, 0x0

    .line 504
    const v8, 0x7f130e37

    .line 505
    .line 506
    .line 507
    const/4 v9, 0x0

    .line 508
    const/4 v10, 0x0

    .line 509
    const-wide/16 v11, 0x0

    .line 510
    .line 511
    invoke-direct/range {v2 .. v15}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 512
    .line 513
    .line 514
    return-object v2

    .line 515
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
