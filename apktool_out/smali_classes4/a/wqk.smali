.class public final synthetic La/wqk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xqk;


# direct methods
.method public synthetic constructor <init>(La/xqk;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wqk;->a:B

    iput-object p1, p0, La/wqk;->b:La/xqk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/wqk;->a:B

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    sget-object v3, La/k3g;->a:La/k3g;

    .line 7
    .line 8
    const-string v4, ""

    .line 9
    .line 10
    const/16 v5, 0xa

    .line 11
    .line 12
    const/4 v8, 0x0

    .line 13
    iget-object v0, v0, La/wqk;->b:La/xqk;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v1, p1

    .line 19
    .line 20
    check-cast v1, Ljava/util/List;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object v0, v0, La/xqk;->b:La/ctf0;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    const/4 v2, 0x5

    .line 31
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    new-instance v2, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-static {v1, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    move v5, v8

    .line 49
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v9

    .line 53
    if-eqz v9, :cond_8

    .line 54
    .line 55
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v9

    .line 59
    add-int/lit8 v10, v5, 0x1

    .line 60
    .line 61
    if-ltz v5, :cond_7

    .line 62
    .line 63
    check-cast v9, La/esk;

    .line 64
    .line 65
    new-instance v11, La/m8m;

    .line 66
    .line 67
    iget-wide v12, v9, La/esk;->b:J

    .line 68
    .line 69
    new-instance v14, La/w8m;

    .line 70
    .line 71
    iget-object v5, v9, La/esk;->c:Ljava/lang/String;

    .line 72
    .line 73
    new-instance v15, La/n0x;

    .line 74
    .line 75
    const/16 v17, 0x0

    .line 76
    .line 77
    iget-object v6, v9, La/esk;->d:Ljava/lang/String;

    .line 78
    .line 79
    sget-object v7, La/ujn;->h:Ljava/lang/String;

    .line 80
    .line 81
    invoke-static {v6, v7, v8}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    if-eqz v7, :cond_0

    .line 86
    .line 87
    move-object/from16 p0, v1

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_0
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    if-nez v7, :cond_1

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_1
    sget-object v7, La/u0d;->a:Ljava/util/List;

    .line 98
    .line 99
    invoke-static {v6}, La/u0d;->c(Ljava/lang/String;)Z

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    if-eqz v7, :cond_2

    .line 104
    .line 105
    :goto_1
    move-object/from16 p0, v1

    .line 106
    .line 107
    move-object v6, v4

    .line 108
    goto :goto_3

    .line 109
    :cond_2
    const-string v7, "playerlogo/"

    .line 110
    .line 111
    const/4 v8, 0x1

    .line 112
    invoke-static {v6, v7, v8}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    if-eqz v7, :cond_3

    .line 117
    .line 118
    const-string v7, "%s/%s"

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_3
    const-string v7, "%s/playerlogo/%s"

    .line 122
    .line 123
    :goto_2
    sget-object v8, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 124
    .line 125
    move-object/from16 p0, v1

    .line 126
    .line 127
    sget-object v1, La/ujn;->h:Ljava/lang/String;

    .line 128
    .line 129
    filled-new-array {v1, v6}, [Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    const/4 v6, 0x2

    .line 134
    invoke-static {v1, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-static {v8, v7, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    :goto_3
    invoke-direct {v15, v6}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    sget-object v1, La/v8m;->a:La/v8m;

    .line 146
    .line 147
    invoke-direct {v14, v5, v15, v1}, La/w8m;-><init>(Ljava/lang/String;La/n0x;La/v8m;)V

    .line 148
    .line 149
    .line 150
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v15

    .line 154
    new-instance v1, La/r8m;

    .line 155
    .line 156
    iget-object v5, v9, La/esk;->f:Ljava/lang/String;

    .line 157
    .line 158
    iget-wide v6, v9, La/esk;->a:J

    .line 159
    .line 160
    iget-boolean v8, v9, La/esk;->h:Z

    .line 161
    .line 162
    const-wide/16 v19, 0x2e

    .line 163
    .line 164
    cmp-long v6, v6, v19

    .line 165
    .line 166
    if-nez v6, :cond_5

    .line 167
    .line 168
    :cond_4
    move-object/from16 v19, v4

    .line 169
    .line 170
    goto :goto_4

    .line 171
    :cond_5
    invoke-static {v5}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    if-eqz v6, :cond_4

    .line 176
    .line 177
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 178
    .line 179
    .line 180
    move-result-wide v5

    .line 181
    new-instance v7, Ljava/text/DecimalFormatSymbols;

    .line 182
    .line 183
    invoke-direct {v7}, Ljava/text/DecimalFormatSymbols;-><init>()V

    .line 184
    .line 185
    .line 186
    const/16 v9, 0x2e

    .line 187
    .line 188
    invoke-virtual {v7, v9}, Ljava/text/DecimalFormatSymbols;->setGroupingSeparator(C)V

    .line 189
    .line 190
    .line 191
    new-instance v9, Ljava/text/DecimalFormat;

    .line 192
    .line 193
    move-object/from16 v19, v4

    .line 194
    .line 195
    const-string v4, "#,###"

    .line 196
    .line 197
    invoke-direct {v9, v4, v7}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;Ljava/text/DecimalFormatSymbols;)V

    .line 198
    .line 199
    .line 200
    const-string v4, "$"

    .line 201
    .line 202
    if-eqz v8, :cond_6

    .line 203
    .line 204
    invoke-virtual {v9, v5, v6}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    invoke-static {v4, v5}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v5

    .line 212
    goto :goto_4

    .line 213
    :cond_6
    invoke-virtual {v9, v5, v6}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    invoke-static {v5, v4}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    :goto_4
    invoke-direct {v1, v5}, La/r8m;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    move-object/from16 v16, v1

    .line 225
    .line 226
    invoke-direct/range {v11 .. v16}, La/m8m;-><init>(JLa/w8m;Ljava/lang/String;La/u8m;)V

    .line 227
    .line 228
    .line 229
    new-instance v1, La/o8m;

    .line 230
    .line 231
    invoke-direct {v1, v11}, La/o8m;-><init>(La/m8m;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-object/from16 v1, p0

    .line 238
    .line 239
    move v5, v10

    .line 240
    move-object/from16 v4, v19

    .line 241
    .line 242
    const/4 v8, 0x0

    .line 243
    goto/16 :goto_0

    .line 244
    .line 245
    :cond_7
    const/16 v17, 0x0

    .line 246
    .line 247
    invoke-static {}, La/q3d;->p()V

    .line 248
    .line 249
    .line 250
    throw v17

    .line 251
    :cond_8
    invoke-static {v2}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 256
    .line 257
    .line 258
    move-result v2

    .line 259
    if-eqz v2, :cond_9

    .line 260
    .line 261
    sget-object v0, La/iun;->a:La/iun;

    .line 262
    .line 263
    goto :goto_5

    .line 264
    :cond_9
    new-instance v2, La/fsk;

    .line 265
    .line 266
    new-instance v4, La/v7m;

    .line 267
    .line 268
    new-instance v5, La/c8m;

    .line 269
    .line 270
    const/4 v6, 0x0

    .line 271
    new-array v7, v6, [Ljava/lang/Object;

    .line 272
    .line 273
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 274
    .line 275
    invoke-static {v7, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v6

    .line 279
    const v7, 0x7f1305f1

    .line 280
    .line 281
    .line 282
    invoke-virtual {v0, v7, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    sget-object v6, La/rv00;->m:La/rv00;

    .line 287
    .line 288
    invoke-direct {v5, v0, v6}, La/c8m;-><init>(Ljava/lang/CharSequence;La/o7m;)V

    .line 289
    .line 290
    .line 291
    invoke-direct {v4, v5}, La/v7m;-><init>(La/c8m;)V

    .line 292
    .line 293
    .line 294
    const-string v0, "EVENT_FOCUS_LEADER_BOARD"

    .line 295
    .line 296
    invoke-direct {v2, v0, v4, v1, v3}, La/fsk;-><init>(Ljava/lang/String;La/b8m;La/a4x;La/m3g;)V

    .line 297
    .line 298
    .line 299
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    :goto_5
    return-object v0

    .line 304
    :pswitch_0
    const/16 v17, 0x0

    .line 305
    .line 306
    move-object/from16 v1, p1

    .line 307
    .line 308
    check-cast v1, Ljava/util/List;

    .line 309
    .line 310
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    iget-object v0, v0, La/xqk;->b:La/ctf0;

    .line 314
    .line 315
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    new-instance v4, Ljava/util/ArrayList;

    .line 319
    .line 320
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 321
    .line 322
    .line 323
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    :cond_a
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 328
    .line 329
    .line 330
    move-result v5

    .line 331
    if-eqz v5, :cond_f

    .line 332
    .line 333
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v5

    .line 337
    move-object v6, v5

    .line 338
    check-cast v6, La/ijs0;

    .line 339
    .line 340
    iget-object v7, v6, La/ijs0;->c:La/qks0;

    .line 341
    .line 342
    iget-object v8, v7, La/qks0;->b:Ljava/lang/String;

    .line 343
    .line 344
    iget-object v7, v7, La/qks0;->e:La/fks0;

    .line 345
    .line 346
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 347
    .line 348
    .line 349
    move-result v8

    .line 350
    if-lez v8, :cond_b

    .line 351
    .line 352
    goto :goto_7

    .line 353
    :cond_b
    invoke-virtual {v7}, La/fks0;->a()Z

    .line 354
    .line 355
    .line 356
    move-result v8

    .line 357
    if-nez v8, :cond_c

    .line 358
    .line 359
    sget-object v8, La/fks0;->c:La/fks0;

    .line 360
    .line 361
    if-ne v7, v8, :cond_a

    .line 362
    .line 363
    :cond_c
    :goto_7
    iget-object v6, v6, La/ijs0;->d:La/qks0;

    .line 364
    .line 365
    iget-object v7, v6, La/qks0;->b:Ljava/lang/String;

    .line 366
    .line 367
    iget-object v6, v6, La/qks0;->e:La/fks0;

    .line 368
    .line 369
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 370
    .line 371
    .line 372
    move-result v7

    .line 373
    if-lez v7, :cond_d

    .line 374
    .line 375
    goto :goto_8

    .line 376
    :cond_d
    invoke-virtual {v6}, La/fks0;->a()Z

    .line 377
    .line 378
    .line 379
    move-result v7

    .line 380
    if-nez v7, :cond_e

    .line 381
    .line 382
    sget-object v7, La/fks0;->c:La/fks0;

    .line 383
    .line 384
    if-ne v6, v7, :cond_a

    .line 385
    .line 386
    :cond_e
    :goto_8
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    goto :goto_6

    .line 390
    :cond_f
    new-instance v1, La/vt5;

    .line 391
    .line 392
    const/16 v5, 0x1d

    .line 393
    .line 394
    invoke-direct {v1, v5}, La/vt5;-><init>(B)V

    .line 395
    .line 396
    .line 397
    invoke-static {v4, v1}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 398
    .line 399
    .line 400
    move-result-object v1

    .line 401
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 402
    .line 403
    .line 404
    move-result v4

    .line 405
    if-eqz v4, :cond_10

    .line 406
    .line 407
    sget-object v0, La/iun;->a:La/iun;

    .line 408
    .line 409
    goto/16 :goto_c

    .line 410
    .line 411
    :cond_10
    new-instance v4, La/ssk;

    .line 412
    .line 413
    new-instance v5, La/v7m;

    .line 414
    .line 415
    new-instance v6, La/c8m;

    .line 416
    .line 417
    const/4 v7, 0x0

    .line 418
    new-array v8, v7, [Ljava/lang/Object;

    .line 419
    .line 420
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 421
    .line 422
    invoke-static {v8, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v7

    .line 426
    const v8, 0x7f1305f3

    .line 427
    .line 428
    .line 429
    invoke-virtual {v0, v8, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    sget-object v7, La/rv00;->m:La/rv00;

    .line 434
    .line 435
    invoke-direct {v6, v0, v7}, La/c8m;-><init>(Ljava/lang/CharSequence;La/o7m;)V

    .line 436
    .line 437
    .line 438
    invoke-direct {v5, v6}, La/v7m;-><init>(La/c8m;)V

    .line 439
    .line 440
    .line 441
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 446
    .line 447
    .line 448
    move-result-object v1

    .line 449
    :cond_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 450
    .line 451
    .line 452
    move-result v6

    .line 453
    if-eqz v6, :cond_21

    .line 454
    .line 455
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v6

    .line 459
    check-cast v6, La/ijs0;

    .line 460
    .line 461
    iget-object v7, v6, La/ijs0;->c:La/qks0;

    .line 462
    .line 463
    iget-object v8, v7, La/qks0;->c:Ljava/lang/String;

    .line 464
    .line 465
    iget-object v9, v6, La/ijs0;->d:La/qks0;

    .line 466
    .line 467
    iget-object v10, v9, La/qks0;->c:Ljava/lang/String;

    .line 468
    .line 469
    iget-object v11, v9, La/qks0;->b:Ljava/lang/String;

    .line 470
    .line 471
    iget-object v9, v9, La/qks0;->e:La/fks0;

    .line 472
    .line 473
    iget-object v12, v7, La/qks0;->b:Ljava/lang/String;

    .line 474
    .line 475
    iget-object v7, v7, La/qks0;->e:La/fks0;

    .line 476
    .line 477
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 478
    .line 479
    .line 480
    move-result v13

    .line 481
    if-nez v13, :cond_12

    .line 482
    .line 483
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 484
    .line 485
    .line 486
    move-result v13

    .line 487
    if-nez v13, :cond_12

    .line 488
    .line 489
    invoke-virtual {v7}, La/fks0;->a()Z

    .line 490
    .line 491
    .line 492
    move-result v13

    .line 493
    if-eqz v13, :cond_12

    .line 494
    .line 495
    invoke-virtual {v9}, La/fks0;->a()Z

    .line 496
    .line 497
    .line 498
    move-result v13

    .line 499
    if-eqz v13, :cond_12

    .line 500
    .line 501
    move-object/from16 v8, v17

    .line 502
    .line 503
    goto/16 :goto_9

    .line 504
    .line 505
    :cond_12
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 506
    .line 507
    .line 508
    move-result v13

    .line 509
    if-nez v13, :cond_13

    .line 510
    .line 511
    invoke-virtual {v7}, La/fks0;->a()Z

    .line 512
    .line 513
    .line 514
    move-result v13

    .line 515
    if-eqz v13, :cond_13

    .line 516
    .line 517
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 518
    .line 519
    .line 520
    move-result v13

    .line 521
    if-lez v13, :cond_13

    .line 522
    .line 523
    sget-object v7, La/rnh;->d:La/rnh;

    .line 524
    .line 525
    new-instance v8, La/tnh;

    .line 526
    .line 527
    invoke-direct {v8, v7}, La/tnh;-><init>(La/rnh;)V

    .line 528
    .line 529
    .line 530
    goto/16 :goto_9

    .line 531
    .line 532
    :cond_13
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 533
    .line 534
    .line 535
    move-result v13

    .line 536
    if-lez v13, :cond_14

    .line 537
    .line 538
    invoke-virtual {v12, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 539
    .line 540
    .line 541
    move-result v13

    .line 542
    if-nez v13, :cond_14

    .line 543
    .line 544
    new-instance v7, La/n0x;

    .line 545
    .line 546
    invoke-direct {v7, v8}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    new-instance v8, La/snh;

    .line 550
    .line 551
    invoke-direct {v8, v7}, La/snh;-><init>(La/n0x;)V

    .line 552
    .line 553
    .line 554
    goto/16 :goto_9

    .line 555
    .line 556
    :cond_14
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 557
    .line 558
    .line 559
    move-result v13

    .line 560
    if-lez v13, :cond_16

    .line 561
    .line 562
    invoke-virtual {v12, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 563
    .line 564
    .line 565
    move-result v13

    .line 566
    if-eqz v13, :cond_16

    .line 567
    .line 568
    invoke-virtual {v7}, La/fks0;->b()Z

    .line 569
    .line 570
    .line 571
    move-result v13

    .line 572
    if-eqz v13, :cond_16

    .line 573
    .line 574
    invoke-virtual {v9}, La/fks0;->b()Z

    .line 575
    .line 576
    .line 577
    move-result v13

    .line 578
    if-eqz v13, :cond_16

    .line 579
    .line 580
    invoke-static {v7}, La/tdc;->N(La/fks0;)La/tnh;

    .line 581
    .line 582
    .line 583
    move-result-object v7

    .line 584
    if-nez v7, :cond_15

    .line 585
    .line 586
    new-instance v7, La/n0x;

    .line 587
    .line 588
    invoke-direct {v7, v8}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 589
    .line 590
    .line 591
    new-instance v8, La/snh;

    .line 592
    .line 593
    invoke-direct {v8, v7}, La/snh;-><init>(La/n0x;)V

    .line 594
    .line 595
    .line 596
    goto/16 :goto_9

    .line 597
    .line 598
    :cond_15
    move-object v8, v7

    .line 599
    goto/16 :goto_9

    .line 600
    .line 601
    :cond_16
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 602
    .line 603
    .line 604
    move-result v13

    .line 605
    if-lez v13, :cond_17

    .line 606
    .line 607
    invoke-virtual {v12, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 608
    .line 609
    .line 610
    move-result v13

    .line 611
    if-eqz v13, :cond_17

    .line 612
    .line 613
    invoke-virtual {v7}, La/fks0;->b()Z

    .line 614
    .line 615
    .line 616
    move-result v13

    .line 617
    if-eqz v13, :cond_17

    .line 618
    .line 619
    invoke-virtual {v9}, La/fks0;->a()Z

    .line 620
    .line 621
    .line 622
    move-result v13

    .line 623
    if-eqz v13, :cond_17

    .line 624
    .line 625
    invoke-static {v7}, La/tdc;->N(La/fks0;)La/tnh;

    .line 626
    .line 627
    .line 628
    move-result-object v7

    .line 629
    if-nez v7, :cond_15

    .line 630
    .line 631
    new-instance v7, La/n0x;

    .line 632
    .line 633
    invoke-direct {v7, v8}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 634
    .line 635
    .line 636
    new-instance v8, La/snh;

    .line 637
    .line 638
    invoke-direct {v8, v7}, La/snh;-><init>(La/n0x;)V

    .line 639
    .line 640
    .line 641
    goto :goto_9

    .line 642
    :cond_17
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 643
    .line 644
    .line 645
    move-result v13

    .line 646
    if-lez v13, :cond_18

    .line 647
    .line 648
    invoke-virtual {v12, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 649
    .line 650
    .line 651
    move-result v13

    .line 652
    if-eqz v13, :cond_18

    .line 653
    .line 654
    invoke-virtual {v7}, La/fks0;->a()Z

    .line 655
    .line 656
    .line 657
    move-result v13

    .line 658
    if-eqz v13, :cond_18

    .line 659
    .line 660
    invoke-virtual {v9}, La/fks0;->b()Z

    .line 661
    .line 662
    .line 663
    move-result v13

    .line 664
    if-eqz v13, :cond_18

    .line 665
    .line 666
    new-instance v7, La/n0x;

    .line 667
    .line 668
    invoke-direct {v7, v8}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 669
    .line 670
    .line 671
    new-instance v8, La/snh;

    .line 672
    .line 673
    invoke-direct {v8, v7}, La/snh;-><init>(La/n0x;)V

    .line 674
    .line 675
    .line 676
    goto :goto_9

    .line 677
    :cond_18
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 678
    .line 679
    .line 680
    move-result v13

    .line 681
    if-lez v13, :cond_19

    .line 682
    .line 683
    invoke-virtual {v12, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 684
    .line 685
    .line 686
    move-result v12

    .line 687
    if-eqz v12, :cond_19

    .line 688
    .line 689
    invoke-static {v7}, La/tdc;->N(La/fks0;)La/tnh;

    .line 690
    .line 691
    .line 692
    move-result-object v7

    .line 693
    if-nez v7, :cond_15

    .line 694
    .line 695
    new-instance v7, La/n0x;

    .line 696
    .line 697
    invoke-direct {v7, v8}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 698
    .line 699
    .line 700
    new-instance v8, La/snh;

    .line 701
    .line 702
    invoke-direct {v8, v7}, La/snh;-><init>(La/n0x;)V

    .line 703
    .line 704
    .line 705
    goto :goto_9

    .line 706
    :cond_19
    invoke-static {v7}, La/tdc;->N(La/fks0;)La/tnh;

    .line 707
    .line 708
    .line 709
    move-result-object v8

    .line 710
    :goto_9
    iget-object v7, v6, La/ijs0;->c:La/qks0;

    .line 711
    .line 712
    iget-object v12, v7, La/qks0;->e:La/fks0;

    .line 713
    .line 714
    iget-object v13, v7, La/qks0;->b:Ljava/lang/String;

    .line 715
    .line 716
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 717
    .line 718
    .line 719
    move-result v14

    .line 720
    if-nez v14, :cond_1a

    .line 721
    .line 722
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 723
    .line 724
    .line 725
    move-result v14

    .line 726
    if-nez v14, :cond_1a

    .line 727
    .line 728
    invoke-virtual {v9}, La/fks0;->a()Z

    .line 729
    .line 730
    .line 731
    move-result v14

    .line 732
    if-eqz v14, :cond_1a

    .line 733
    .line 734
    invoke-virtual {v12}, La/fks0;->a()Z

    .line 735
    .line 736
    .line 737
    move-result v14

    .line 738
    if-eqz v14, :cond_1a

    .line 739
    .line 740
    move-object/from16 v9, v17

    .line 741
    .line 742
    goto :goto_b

    .line 743
    :cond_1a
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 744
    .line 745
    .line 746
    move-result v14

    .line 747
    if-nez v14, :cond_1b

    .line 748
    .line 749
    invoke-virtual {v9}, La/fks0;->a()Z

    .line 750
    .line 751
    .line 752
    move-result v14

    .line 753
    if-eqz v14, :cond_1b

    .line 754
    .line 755
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 756
    .line 757
    .line 758
    move-result v14

    .line 759
    if-lez v14, :cond_1b

    .line 760
    .line 761
    sget-object v7, La/rnh;->d:La/rnh;

    .line 762
    .line 763
    new-instance v9, La/tnh;

    .line 764
    .line 765
    invoke-direct {v9, v7}, La/tnh;-><init>(La/rnh;)V

    .line 766
    .line 767
    .line 768
    goto :goto_b

    .line 769
    :cond_1b
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 770
    .line 771
    .line 772
    move-result v14

    .line 773
    if-lez v14, :cond_1c

    .line 774
    .line 775
    invoke-virtual {v11, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 776
    .line 777
    .line 778
    move-result v14

    .line 779
    if-nez v14, :cond_1c

    .line 780
    .line 781
    new-instance v7, La/n0x;

    .line 782
    .line 783
    invoke-direct {v7, v10}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 784
    .line 785
    .line 786
    new-instance v9, La/snh;

    .line 787
    .line 788
    invoke-direct {v9, v7}, La/snh;-><init>(La/n0x;)V

    .line 789
    .line 790
    .line 791
    goto :goto_b

    .line 792
    :cond_1c
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 793
    .line 794
    .line 795
    move-result v14

    .line 796
    if-lez v14, :cond_1f

    .line 797
    .line 798
    invoke-virtual {v11, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 799
    .line 800
    .line 801
    move-result v11

    .line 802
    if-eqz v11, :cond_1f

    .line 803
    .line 804
    invoke-virtual {v12}, La/fks0;->b()Z

    .line 805
    .line 806
    .line 807
    move-result v11

    .line 808
    if-eqz v11, :cond_1f

    .line 809
    .line 810
    invoke-virtual {v9}, La/fks0;->a()Z

    .line 811
    .line 812
    .line 813
    move-result v11

    .line 814
    if-eqz v11, :cond_1f

    .line 815
    .line 816
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 817
    .line 818
    .line 819
    move-result v9

    .line 820
    if-lez v9, :cond_1d

    .line 821
    .line 822
    goto :goto_a

    .line 823
    :cond_1d
    move-object/from16 v10, v17

    .line 824
    .line 825
    :goto_a
    if-nez v10, :cond_1e

    .line 826
    .line 827
    iget-object v10, v7, La/qks0;->c:Ljava/lang/String;

    .line 828
    .line 829
    :cond_1e
    new-instance v7, La/n0x;

    .line 830
    .line 831
    invoke-direct {v7, v10}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 832
    .line 833
    .line 834
    new-instance v9, La/snh;

    .line 835
    .line 836
    invoke-direct {v9, v7}, La/snh;-><init>(La/n0x;)V

    .line 837
    .line 838
    .line 839
    goto :goto_b

    .line 840
    :cond_1f
    invoke-static {v9}, La/tdc;->N(La/fks0;)La/tnh;

    .line 841
    .line 842
    .line 843
    move-result-object v9

    .line 844
    :goto_b
    if-eqz v8, :cond_20

    .line 845
    .line 846
    if-eqz v9, :cond_20

    .line 847
    .line 848
    new-instance v7, La/aoh;

    .line 849
    .line 850
    invoke-direct {v7, v8, v9}, La/aoh;-><init>(La/unh;La/unh;)V

    .line 851
    .line 852
    .line 853
    new-instance v8, La/ynh;

    .line 854
    .line 855
    iget-object v6, v6, La/ijs0;->b:La/pjs0;

    .line 856
    .line 857
    iget-object v9, v6, La/pjs0;->a:Ljava/lang/String;

    .line 858
    .line 859
    new-instance v10, La/n0x;

    .line 860
    .line 861
    iget-object v6, v6, La/pjs0;->b:Ljava/lang/String;

    .line 862
    .line 863
    invoke-direct {v10, v6}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 864
    .line 865
    .line 866
    invoke-direct {v8, v10, v9}, La/ynh;-><init>(La/n0x;Ljava/lang/String;)V

    .line 867
    .line 868
    .line 869
    new-instance v6, La/qnh;

    .line 870
    .line 871
    invoke-direct {v6, v8, v7}, La/qnh;-><init>(La/ynh;La/aoh;)V

    .line 872
    .line 873
    .line 874
    new-instance v7, La/vnh;

    .line 875
    .line 876
    invoke-direct {v7, v6}, La/vnh;-><init>(La/qnh;)V

    .line 877
    .line 878
    .line 879
    invoke-virtual {v0, v7}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 880
    .line 881
    .line 882
    :cond_20
    invoke-virtual {v0}, La/e4;->b()I

    .line 883
    .line 884
    .line 885
    move-result v6

    .line 886
    if-ne v6, v2, :cond_11

    .line 887
    .line 888
    :cond_21
    invoke-static {v0}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 889
    .line 890
    .line 891
    move-result-object v0

    .line 892
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 893
    .line 894
    .line 895
    move-result-object v0

    .line 896
    const-string v1, "EVENT_FOCUS_TRANSFERS"

    .line 897
    .line 898
    invoke-direct {v4, v1, v5, v0, v3}, La/ssk;-><init>(Ljava/lang/String;La/b8m;La/a4x;La/m3g;)V

    .line 899
    .line 900
    .line 901
    invoke-static {v4}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 902
    .line 903
    .line 904
    move-result-object v0

    .line 905
    :goto_c
    return-object v0

    .line 906
    :pswitch_1
    move-object/from16 v1, p1

    .line 907
    .line 908
    check-cast v1, La/tqk;

    .line 909
    .line 910
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 911
    .line 912
    .line 913
    iget-object v2, v0, La/xqk;->a:La/ksk;

    .line 914
    .line 915
    iget-object v2, v2, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 916
    .line 917
    iget-object v2, v2, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 918
    .line 919
    iget-object v0, v0, La/xqk;->b:La/ctf0;

    .line 920
    .line 921
    invoke-static {v1, v2, v0}, La/vqk;->a(La/tqk;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/ctf0;)Ljava/util/List;

    .line 922
    .line 923
    .line 924
    move-result-object v0

    .line 925
    return-object v0

    .line 926
    :pswitch_2
    move-object/from16 v1, p1

    .line 927
    .line 928
    check-cast v1, La/tqk;

    .line 929
    .line 930
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 931
    .line 932
    .line 933
    iget-object v2, v0, La/xqk;->a:La/ksk;

    .line 934
    .line 935
    iget-object v2, v2, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 936
    .line 937
    iget-object v2, v2, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 938
    .line 939
    iget-object v0, v0, La/xqk;->b:La/ctf0;

    .line 940
    .line 941
    invoke-static {v1, v2, v0}, La/vqk;->a(La/tqk;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/ctf0;)Ljava/util/List;

    .line 942
    .line 943
    .line 944
    move-result-object v0

    .line 945
    return-object v0

    .line 946
    :pswitch_3
    move-object/from16 v2, p1

    .line 947
    .line 948
    check-cast v2, La/btk;

    .line 949
    .line 950
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 951
    .line 952
    .line 953
    iget-object v1, v0, La/xqk;->a:La/ksk;

    .line 954
    .line 955
    iget-object v3, v1, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 956
    .line 957
    iget-object v7, v3, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 958
    .line 959
    iget-byte v3, v7, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 960
    .line 961
    sget-object v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 962
    .line 963
    iget-byte v4, v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 964
    .line 965
    if-ne v3, v4, :cond_22

    .line 966
    .line 967
    const/16 v18, 0x1

    .line 968
    .line 969
    goto :goto_d

    .line 970
    :cond_22
    const/16 v18, 0x0

    .line 971
    .line 972
    :goto_d
    iget-object v3, v0, La/xqk;->d:La/y78;

    .line 973
    .line 974
    iget-object v4, v0, La/xqk;->b:La/ctf0;

    .line 975
    .line 976
    iget-boolean v8, v1, La/ksk;->g:Z

    .line 977
    .line 978
    move-object v5, v3

    .line 979
    iget-object v3, v1, La/ksk;->b:La/sff0;

    .line 980
    .line 981
    iget-object v6, v1, La/ksk;->e:Ljava/util/List;

    .line 982
    .line 983
    iget-object v9, v3, La/sff0;->g:La/mum0;

    .line 984
    .line 985
    iget-object v9, v9, La/mum0;->y:La/v5l0;

    .line 986
    .line 987
    iget-object v0, v0, La/xqk;->e:La/n0o0;

    .line 988
    .line 989
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 990
    .line 991
    .line 992
    move-result-object v0

    .line 993
    check-cast v0, La/fee;

    .line 994
    .line 995
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 996
    .line 997
    .line 998
    move-result-object v0

    .line 999
    check-cast v0, Ljava/lang/Boolean;

    .line 1000
    .line 1001
    if-eqz v0, :cond_23

    .line 1002
    .line 1003
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1004
    .line 1005
    .line 1006
    move-result v18

    .line 1007
    :cond_23
    move/from16 v10, v18

    .line 1008
    .line 1009
    iget-boolean v11, v1, La/ksk;->i:Z

    .line 1010
    .line 1011
    move-object v1, v5

    .line 1012
    move-object v5, v9

    .line 1013
    const/4 v9, 0x0

    .line 1014
    invoke-static/range {v1 .. v11}, La/hqk;->a(La/y78;La/btk;La/sff0;La/ctf0;La/v5l0;Ljava/util/List;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;ZZZZ)Ljava/util/List;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v0

    .line 1018
    return-object v0

    .line 1019
    :pswitch_4
    move-object/from16 v2, p1

    .line 1020
    .line 1021
    check-cast v2, La/btk;

    .line 1022
    .line 1023
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1024
    .line 1025
    .line 1026
    iget-object v1, v0, La/xqk;->a:La/ksk;

    .line 1027
    .line 1028
    iget-object v3, v1, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 1029
    .line 1030
    iget-object v7, v3, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1031
    .line 1032
    iget-byte v3, v7, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 1033
    .line 1034
    sget-object v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 1035
    .line 1036
    iget-byte v4, v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 1037
    .line 1038
    if-ne v3, v4, :cond_24

    .line 1039
    .line 1040
    const/16 v18, 0x1

    .line 1041
    .line 1042
    goto :goto_e

    .line 1043
    :cond_24
    const/16 v18, 0x0

    .line 1044
    .line 1045
    :goto_e
    iget-object v3, v0, La/xqk;->d:La/y78;

    .line 1046
    .line 1047
    iget-object v4, v0, La/xqk;->b:La/ctf0;

    .line 1048
    .line 1049
    iget-boolean v8, v1, La/ksk;->g:Z

    .line 1050
    .line 1051
    move-object v5, v3

    .line 1052
    iget-object v3, v1, La/ksk;->b:La/sff0;

    .line 1053
    .line 1054
    iget-object v6, v1, La/ksk;->e:Ljava/util/List;

    .line 1055
    .line 1056
    iget-object v9, v3, La/sff0;->g:La/mum0;

    .line 1057
    .line 1058
    iget-object v9, v9, La/mum0;->y:La/v5l0;

    .line 1059
    .line 1060
    iget-object v0, v0, La/xqk;->e:La/n0o0;

    .line 1061
    .line 1062
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v0

    .line 1066
    check-cast v0, La/fee;

    .line 1067
    .line 1068
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v0

    .line 1072
    check-cast v0, Ljava/lang/Boolean;

    .line 1073
    .line 1074
    if-eqz v0, :cond_25

    .line 1075
    .line 1076
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1077
    .line 1078
    .line 1079
    move-result v18

    .line 1080
    :cond_25
    move/from16 v10, v18

    .line 1081
    .line 1082
    iget-boolean v11, v1, La/ksk;->i:Z

    .line 1083
    .line 1084
    move-object v1, v5

    .line 1085
    move-object v5, v9

    .line 1086
    const/4 v9, 0x1

    .line 1087
    invoke-static/range {v1 .. v11}, La/hqk;->a(La/y78;La/btk;La/sff0;La/ctf0;La/v5l0;Ljava/util/List;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;ZZZZ)Ljava/util/List;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v0

    .line 1091
    return-object v0

    .line 1092
    :pswitch_5
    move-object/from16 v19, v4

    .line 1093
    .line 1094
    const/16 v17, 0x0

    .line 1095
    .line 1096
    move-object/from16 v1, p1

    .line 1097
    .line 1098
    check-cast v1, La/sqk;

    .line 1099
    .line 1100
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1101
    .line 1102
    .line 1103
    iget-object v3, v0, La/xqk;->a:La/ksk;

    .line 1104
    .line 1105
    iget-object v4, v3, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 1106
    .line 1107
    iget-object v4, v4, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1108
    .line 1109
    iget-object v6, v0, La/xqk;->b:La/ctf0;

    .line 1110
    .line 1111
    iget-boolean v7, v3, La/ksk;->f:Z

    .line 1112
    .line 1113
    iget-object v0, v0, La/xqk;->e:La/n0o0;

    .line 1114
    .line 1115
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v0

    .line 1119
    check-cast v0, La/fee;

    .line 1120
    .line 1121
    invoke-virtual {v0}, La/fee;->b()Ljava/lang/Object;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v0

    .line 1125
    check-cast v0, La/qt20;

    .line 1126
    .line 1127
    iget-boolean v8, v1, La/sqk;->a:Z

    .line 1128
    .line 1129
    iget-boolean v3, v3, La/ksk;->i:Z

    .line 1130
    .line 1131
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1132
    .line 1133
    .line 1134
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1135
    .line 1136
    .line 1137
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1138
    .line 1139
    .line 1140
    iget-object v9, v1, La/sqk;->b:La/j0g0;

    .line 1141
    .line 1142
    if-eqz v9, :cond_27

    .line 1143
    .line 1144
    iget-object v9, v9, La/j0g0;->a:Ljava/lang/Object;

    .line 1145
    .line 1146
    instance-of v10, v9, La/g0g0;

    .line 1147
    .line 1148
    if-eqz v10, :cond_26

    .line 1149
    .line 1150
    move-object/from16 v9, v17

    .line 1151
    .line 1152
    :cond_26
    check-cast v9, La/jtk;

    .line 1153
    .line 1154
    goto :goto_f

    .line 1155
    :cond_27
    move-object/from16 v9, v17

    .line 1156
    .line 1157
    :goto_f
    if-eqz v9, :cond_28

    .line 1158
    .line 1159
    iget-object v10, v9, La/jtk;->b:La/ypl0;

    .line 1160
    .line 1161
    if-eqz v10, :cond_28

    .line 1162
    .line 1163
    iget-object v10, v10, La/ypl0;->c:La/lel0;

    .line 1164
    .line 1165
    if-eqz v10, :cond_28

    .line 1166
    .line 1167
    iget-object v10, v10, La/lel0;->o:Ljava/lang/String;

    .line 1168
    .line 1169
    goto :goto_10

    .line 1170
    :cond_28
    move-object/from16 v10, v17

    .line 1171
    .line 1172
    :goto_10
    if-nez v10, :cond_29

    .line 1173
    .line 1174
    move-object/from16 v10, v19

    .line 1175
    .line 1176
    :cond_29
    if-eqz v9, :cond_2a

    .line 1177
    .line 1178
    iget-object v11, v9, La/jtk;->d:La/ypl0;

    .line 1179
    .line 1180
    if-eqz v11, :cond_2a

    .line 1181
    .line 1182
    iget-object v11, v11, La/ypl0;->c:La/lel0;

    .line 1183
    .line 1184
    if-eqz v11, :cond_2a

    .line 1185
    .line 1186
    iget-object v11, v11, La/lel0;->o:Ljava/lang/String;

    .line 1187
    .line 1188
    goto :goto_11

    .line 1189
    :cond_2a
    move-object/from16 v11, v17

    .line 1190
    .line 1191
    :goto_11
    if-nez v11, :cond_2b

    .line 1192
    .line 1193
    move-object/from16 v11, v19

    .line 1194
    .line 1195
    :cond_2b
    iget-object v12, v1, La/sqk;->c:La/btk;

    .line 1196
    .line 1197
    iget-object v1, v1, La/sqk;->d:La/btk;

    .line 1198
    .line 1199
    sget-object v13, La/nqk;->a:Ljava/util/List;

    .line 1200
    .line 1201
    if-eqz v7, :cond_2c

    .line 1202
    .line 1203
    sget-object v7, La/zdv0;->b:La/zdv0;

    .line 1204
    .line 1205
    goto :goto_12

    .line 1206
    :cond_2c
    sget-object v7, La/zdv0;->a:La/zdv0;

    .line 1207
    .line 1208
    :goto_12
    new-instance v13, La/mqk;

    .line 1209
    .line 1210
    if-eqz v8, :cond_2d

    .line 1211
    .line 1212
    sget-object v14, La/jqk;->a:La/jqk;

    .line 1213
    .line 1214
    goto :goto_13

    .line 1215
    :cond_2d
    new-instance v14, La/iqk;

    .line 1216
    .line 1217
    if-eqz v9, :cond_2e

    .line 1218
    .line 1219
    iget-object v15, v9, La/jtk;->b:La/ypl0;

    .line 1220
    .line 1221
    if-eqz v15, :cond_2e

    .line 1222
    .line 1223
    iget-object v15, v15, La/ypl0;->b:Ljava/lang/String;

    .line 1224
    .line 1225
    if-nez v15, :cond_2f

    .line 1226
    .line 1227
    :cond_2e
    move-object/from16 v15, v19

    .line 1228
    .line 1229
    :cond_2f
    invoke-direct {v14, v15}, La/iqk;-><init>(Ljava/lang/String;)V

    .line 1230
    .line 1231
    .line 1232
    :goto_13
    if-eqz v8, :cond_30

    .line 1233
    .line 1234
    new-instance v0, La/bev0;

    .line 1235
    .line 1236
    invoke-direct {v0, v7}, La/bev0;-><init>(La/zdv0;)V

    .line 1237
    .line 1238
    .line 1239
    move/from16 p0, v8

    .line 1240
    .line 1241
    move-object/from16 v32, v10

    .line 1242
    .line 1243
    move-object/from16 v33, v11

    .line 1244
    .line 1245
    move-object v1, v13

    .line 1246
    goto/16 :goto_2d

    .line 1247
    .line 1248
    :cond_30
    new-instance v15, La/aev0;

    .line 1249
    .line 1250
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v2

    .line 1254
    if-eqz v9, :cond_31

    .line 1255
    .line 1256
    iget-object v9, v9, La/jtk;->c:La/itk;

    .line 1257
    .line 1258
    if-eqz v9, :cond_31

    .line 1259
    .line 1260
    iget-boolean v9, v9, La/itk;->a:Z

    .line 1261
    .line 1262
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v9

    .line 1266
    goto :goto_14

    .line 1267
    :cond_31
    move-object/from16 v9, v17

    .line 1268
    .line 1269
    :goto_14
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1270
    .line 1271
    invoke-static {v9, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1272
    .line 1273
    .line 1274
    move-result v5

    .line 1275
    if-eqz v5, :cond_32

    .line 1276
    .line 1277
    sget-object v5, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 1278
    .line 1279
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1280
    .line 1281
    .line 1282
    move-result v5

    .line 1283
    if-eqz v5, :cond_32

    .line 1284
    .line 1285
    new-instance v5, La/hdv0;

    .line 1286
    .line 1287
    const v9, 0x7f0807f8

    .line 1288
    .line 1289
    .line 1290
    move/from16 v31, v3

    .line 1291
    .line 1292
    sget-object v3, La/adv0;->a:La/adv0;

    .line 1293
    .line 1294
    move/from16 p0, v8

    .line 1295
    .line 1296
    const/4 v8, 0x0

    .line 1297
    invoke-direct {v5, v9, v8, v3}, La/hdv0;-><init>(IZLa/fdv0;)V

    .line 1298
    .line 1299
    .line 1300
    invoke-virtual {v2, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1301
    .line 1302
    .line 1303
    goto :goto_15

    .line 1304
    :cond_32
    move/from16 v31, v3

    .line 1305
    .line 1306
    move/from16 p0, v8

    .line 1307
    .line 1308
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1309
    .line 1310
    invoke-static {v9, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1311
    .line 1312
    .line 1313
    move-result v3

    .line 1314
    sget-object v5, La/edv0;->a:La/edv0;

    .line 1315
    .line 1316
    const v8, 0x7f080a2c

    .line 1317
    .line 1318
    .line 1319
    if-eqz v3, :cond_33

    .line 1320
    .line 1321
    sget-object v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 1322
    .line 1323
    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1324
    .line 1325
    .line 1326
    move-result v3

    .line 1327
    if-eqz v3, :cond_33

    .line 1328
    .line 1329
    new-instance v3, La/hdv0;

    .line 1330
    .line 1331
    const/4 v9, 0x0

    .line 1332
    invoke-direct {v3, v8, v9, v5}, La/hdv0;-><init>(IZLa/fdv0;)V

    .line 1333
    .line 1334
    .line 1335
    invoke-virtual {v2, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1336
    .line 1337
    .line 1338
    goto :goto_15

    .line 1339
    :cond_33
    const/4 v9, 0x0

    .line 1340
    sget-object v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 1341
    .line 1342
    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1343
    .line 1344
    .line 1345
    move-result v3

    .line 1346
    if-eqz v3, :cond_34

    .line 1347
    .line 1348
    new-instance v3, La/hdv0;

    .line 1349
    .line 1350
    invoke-direct {v3, v8, v9, v5}, La/hdv0;-><init>(IZLa/fdv0;)V

    .line 1351
    .line 1352
    .line 1353
    invoke-virtual {v2, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1354
    .line 1355
    .line 1356
    :cond_34
    :goto_15
    instance-of v3, v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 1357
    .line 1358
    if-eqz v3, :cond_38

    .line 1359
    .line 1360
    instance-of v3, v0, La/ot20;

    .line 1361
    .line 1362
    if-eqz v3, :cond_35

    .line 1363
    .line 1364
    check-cast v0, La/ot20;

    .line 1365
    .line 1366
    goto :goto_16

    .line 1367
    :cond_35
    move-object/from16 v0, v17

    .line 1368
    .line 1369
    :goto_16
    if-eqz v0, :cond_36

    .line 1370
    .line 1371
    iget-boolean v0, v0, La/ot20;->a:Z

    .line 1372
    .line 1373
    goto :goto_17

    .line 1374
    :cond_36
    const/4 v0, 0x0

    .line 1375
    :goto_17
    new-instance v3, La/hdv0;

    .line 1376
    .line 1377
    if-eqz v0, :cond_37

    .line 1378
    .line 1379
    const v0, 0x7f080905

    .line 1380
    .line 1381
    .line 1382
    goto :goto_18

    .line 1383
    :cond_37
    const v0, 0x7f080854

    .line 1384
    .line 1385
    .line 1386
    :goto_18
    sget-object v4, La/bdv0;->a:La/bdv0;

    .line 1387
    .line 1388
    const/4 v8, 0x0

    .line 1389
    invoke-direct {v3, v0, v8, v4}, La/hdv0;-><init>(IZLa/fdv0;)V

    .line 1390
    .line 1391
    .line 1392
    invoke-virtual {v2, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1393
    .line 1394
    .line 1395
    goto :goto_19

    .line 1396
    :cond_38
    const/4 v8, 0x0

    .line 1397
    :goto_19
    new-instance v0, La/hdv0;

    .line 1398
    .line 1399
    const v3, 0x7f0809e5

    .line 1400
    .line 1401
    .line 1402
    sget-object v4, La/ddv0;->a:La/ddv0;

    .line 1403
    .line 1404
    invoke-direct {v0, v3, v8, v4}, La/hdv0;-><init>(IZLa/fdv0;)V

    .line 1405
    .line 1406
    .line 1407
    invoke-virtual {v2, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1408
    .line 1409
    .line 1410
    invoke-static {v2}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 1411
    .line 1412
    .line 1413
    move-result-object v0

    .line 1414
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 1415
    .line 1416
    .line 1417
    move-result-object v0

    .line 1418
    iget-object v2, v12, La/btk;->a:Ljava/util/List;

    .line 1419
    .line 1420
    iget-object v1, v1, La/btk;->a:Ljava/util/List;

    .line 1421
    .line 1422
    invoke-static {v2, v1}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v1

    .line 1426
    new-instance v2, Ljava/util/ArrayList;

    .line 1427
    .line 1428
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1429
    .line 1430
    .line 1431
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v1

    .line 1435
    :cond_39
    :goto_1a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1436
    .line 1437
    .line 1438
    move-result v3

    .line 1439
    if-eqz v3, :cond_3a

    .line 1440
    .line 1441
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1442
    .line 1443
    .line 1444
    move-result-object v3

    .line 1445
    move-object v4, v3

    .line 1446
    check-cast v4, La/d0t;

    .line 1447
    .line 1448
    invoke-static {v4}, La/qzb;->D0(La/d0t;)Z

    .line 1449
    .line 1450
    .line 1451
    move-result v4

    .line 1452
    if-nez v4, :cond_39

    .line 1453
    .line 1454
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1455
    .line 1456
    .line 1457
    goto :goto_1a

    .line 1458
    :cond_3a
    new-instance v1, Ljava/util/ArrayList;

    .line 1459
    .line 1460
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1461
    .line 1462
    .line 1463
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1464
    .line 1465
    .line 1466
    move-result-object v2

    .line 1467
    :cond_3b
    :goto_1b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1468
    .line 1469
    .line 1470
    move-result v3

    .line 1471
    if-eqz v3, :cond_3f

    .line 1472
    .line 1473
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1474
    .line 1475
    .line 1476
    move-result-object v3

    .line 1477
    check-cast v3, La/d0t;

    .line 1478
    .line 1479
    const-wide/16 v4, 0x1

    .line 1480
    .line 1481
    invoke-static {v4, v5, v3}, La/nqk;->a(JLa/d0t;)Ljava/util/List;

    .line 1482
    .line 1483
    .line 1484
    move-result-object v4

    .line 1485
    if-nez v4, :cond_3c

    .line 1486
    .line 1487
    const-wide/16 v4, 0x26

    .line 1488
    .line 1489
    invoke-static {v4, v5, v3}, La/nqk;->a(JLa/d0t;)Ljava/util/List;

    .line 1490
    .line 1491
    .line 1492
    move-result-object v4

    .line 1493
    :cond_3c
    if-eqz v4, :cond_3e

    .line 1494
    .line 1495
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 1496
    .line 1497
    .line 1498
    move-result v5

    .line 1499
    if-eqz v5, :cond_3d

    .line 1500
    .line 1501
    goto :goto_1c

    .line 1502
    :cond_3d
    new-instance v5, Lkotlin/Pair;

    .line 1503
    .line 1504
    invoke-direct {v5, v3, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1505
    .line 1506
    .line 1507
    goto :goto_1d

    .line 1508
    :cond_3e
    :goto_1c
    move-object/from16 v5, v17

    .line 1509
    .line 1510
    :goto_1d
    if-eqz v5, :cond_3b

    .line 1511
    .line 1512
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1513
    .line 1514
    .line 1515
    goto :goto_1b

    .line 1516
    :cond_3f
    new-instance v2, Ljava/util/ArrayList;

    .line 1517
    .line 1518
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1519
    .line 1520
    .line 1521
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1522
    .line 1523
    .line 1524
    move-result-object v1

    .line 1525
    :cond_40
    :goto_1e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1526
    .line 1527
    .line 1528
    move-result v3

    .line 1529
    if-eqz v3, :cond_42

    .line 1530
    .line 1531
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1532
    .line 1533
    .line 1534
    move-result-object v3

    .line 1535
    move-object v4, v3

    .line 1536
    check-cast v4, Lkotlin/Pair;

    .line 1537
    .line 1538
    iget-object v4, v4, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 1539
    .line 1540
    check-cast v4, Ljava/lang/Iterable;

    .line 1541
    .line 1542
    new-instance v5, Ljava/util/ArrayList;

    .line 1543
    .line 1544
    const/16 v8, 0xa

    .line 1545
    .line 1546
    invoke-static {v4, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1547
    .line 1548
    .line 1549
    move-result v9

    .line 1550
    invoke-direct {v5, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 1551
    .line 1552
    .line 1553
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1554
    .line 1555
    .line 1556
    move-result-object v4

    .line 1557
    :goto_1f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1558
    .line 1559
    .line 1560
    move-result v8

    .line 1561
    if-eqz v8, :cond_41

    .line 1562
    .line 1563
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v8

    .line 1567
    check-cast v8, Lorg/xplatform/betting/core/zip/model/zip/BetZip;

    .line 1568
    .line 1569
    iget-wide v8, v8, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->a:J

    .line 1570
    .line 1571
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1572
    .line 1573
    .line 1574
    move-result-object v8

    .line 1575
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1576
    .line 1577
    .line 1578
    goto :goto_1f

    .line 1579
    :cond_41
    sget-object v4, La/nqk;->a:Ljava/util/List;

    .line 1580
    .line 1581
    invoke-interface {v5, v4}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    .line 1582
    .line 1583
    .line 1584
    move-result v4

    .line 1585
    if-eqz v4, :cond_40

    .line 1586
    .line 1587
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1588
    .line 1589
    .line 1590
    goto :goto_1e

    .line 1591
    :cond_42
    new-instance v1, Ljava/util/ArrayList;

    .line 1592
    .line 1593
    const/16 v8, 0xa

    .line 1594
    .line 1595
    invoke-static {v2, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1596
    .line 1597
    .line 1598
    move-result v3

    .line 1599
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1600
    .line 1601
    .line 1602
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1603
    .line 1604
    .line 1605
    move-result-object v2

    .line 1606
    :goto_20
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1607
    .line 1608
    .line 1609
    move-result v3

    .line 1610
    if-eqz v3, :cond_5a

    .line 1611
    .line 1612
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1613
    .line 1614
    .line 1615
    move-result-object v3

    .line 1616
    check-cast v3, Lkotlin/Pair;

    .line 1617
    .line 1618
    iget-object v4, v3, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 1619
    .line 1620
    check-cast v4, La/d0t;

    .line 1621
    .line 1622
    iget-object v3, v3, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 1623
    .line 1624
    check-cast v3, Ljava/util/List;

    .line 1625
    .line 1626
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1627
    .line 1628
    .line 1629
    move-result-object v5

    .line 1630
    check-cast v5, Lorg/xplatform/betting/core/zip/model/zip/BetZip;

    .line 1631
    .line 1632
    if-eqz v5, :cond_43

    .line 1633
    .line 1634
    iget-object v5, v5, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->g:Ljava/lang/String;

    .line 1635
    .line 1636
    goto :goto_21

    .line 1637
    :cond_43
    move-object/from16 v5, v17

    .line 1638
    .line 1639
    :goto_21
    if-nez v5, :cond_44

    .line 1640
    .line 1641
    move-object/from16 v5, v19

    .line 1642
    .line 1643
    :cond_44
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 1644
    .line 1645
    .line 1646
    move-result-object v3

    .line 1647
    check-cast v3, Lorg/xplatform/betting/core/zip/model/zip/BetZip;

    .line 1648
    .line 1649
    if-eqz v3, :cond_45

    .line 1650
    .line 1651
    iget-object v3, v3, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->g:Ljava/lang/String;

    .line 1652
    .line 1653
    goto :goto_22

    .line 1654
    :cond_45
    move-object/from16 v3, v17

    .line 1655
    .line 1656
    :goto_22
    if-nez v3, :cond_46

    .line 1657
    .line 1658
    move-object/from16 v3, v19

    .line 1659
    .line 1660
    :cond_46
    iget-wide v8, v4, La/d0t;->v:J

    .line 1661
    .line 1662
    iget-boolean v12, v4, La/d0t;->C:Z

    .line 1663
    .line 1664
    move-object/from16 p1, v2

    .line 1665
    .line 1666
    iget-object v2, v4, La/d0t;->r:La/f0t;

    .line 1667
    .line 1668
    move-wide/from16 v21, v8

    .line 1669
    .line 1670
    iget-object v8, v4, La/d0t;->q:La/f0t;

    .line 1671
    .line 1672
    iget-object v9, v4, La/d0t;->p:La/rqs;

    .line 1673
    .line 1674
    move-object/from16 v32, v10

    .line 1675
    .line 1676
    iget v10, v9, La/rqs;->q:I

    .line 1677
    .line 1678
    move/from16 v20, v10

    .line 1679
    .line 1680
    move-object/from16 v33, v11

    .line 1681
    .line 1682
    iget-wide v10, v4, La/d0t;->u:J

    .line 1683
    .line 1684
    move-wide/from16 v23, v10

    .line 1685
    .line 1686
    iget-wide v10, v4, La/d0t;->a:J

    .line 1687
    .line 1688
    move-wide/from16 v25, v10

    .line 1689
    .line 1690
    new-instance v10, La/qdv0;

    .line 1691
    .line 1692
    iget-object v11, v8, La/f0t;->d:Ljava/util/List;

    .line 1693
    .line 1694
    invoke-static {v11}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1695
    .line 1696
    .line 1697
    move-result-object v11

    .line 1698
    check-cast v11, Ljava/lang/String;

    .line 1699
    .line 1700
    if-nez v11, :cond_47

    .line 1701
    .line 1702
    move-object/from16 v11, v19

    .line 1703
    .line 1704
    :cond_47
    move/from16 v27, v12

    .line 1705
    .line 1706
    move-object/from16 v34, v13

    .line 1707
    .line 1708
    iget-wide v12, v8, La/f0t;->a:J

    .line 1709
    .line 1710
    invoke-static {v12, v13, v11}, La/vsm0;->s(JLjava/lang/String;)Ljava/lang/String;

    .line 1711
    .line 1712
    .line 1713
    move-result-object v8

    .line 1714
    invoke-direct {v10, v8, v5}, La/qdv0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1715
    .line 1716
    .line 1717
    new-instance v5, La/qdv0;

    .line 1718
    .line 1719
    iget-object v8, v2, La/f0t;->d:Ljava/util/List;

    .line 1720
    .line 1721
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1722
    .line 1723
    .line 1724
    move-result-object v8

    .line 1725
    check-cast v8, Ljava/lang/String;

    .line 1726
    .line 1727
    if-nez v8, :cond_48

    .line 1728
    .line 1729
    move-object/from16 v8, v19

    .line 1730
    .line 1731
    :cond_48
    iget-wide v11, v2, La/f0t;->a:J

    .line 1732
    .line 1733
    invoke-static {v11, v12, v8}, La/vsm0;->s(JLjava/lang/String;)Ljava/lang/String;

    .line 1734
    .line 1735
    .line 1736
    move-result-object v2

    .line 1737
    invoke-direct {v5, v2, v3}, La/qdv0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1738
    .line 1739
    .line 1740
    new-instance v2, La/ieu0;

    .line 1741
    .line 1742
    sget-object v3, La/mc6;->b:La/yk5;

    .line 1743
    .line 1744
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1745
    .line 1746
    .line 1747
    move-result-object v8

    .line 1748
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1749
    .line 1750
    .line 1751
    invoke-static {v8}, La/yk5;->d(Ljava/lang/Integer;)La/mc6;

    .line 1752
    .line 1753
    .line 1754
    move-result-object v3

    .line 1755
    iget-byte v3, v3, La/mc6;->a:B

    .line 1756
    .line 1757
    iget v8, v9, La/rqs;->e:I

    .line 1758
    .line 1759
    invoke-direct {v2, v3, v8}, La/ieu0;-><init>(II)V

    .line 1760
    .line 1761
    .line 1762
    new-instance v3, La/ieu0;

    .line 1763
    .line 1764
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1765
    .line 1766
    .line 1767
    move-result-object v8

    .line 1768
    invoke-static {v8}, La/yk5;->d(Ljava/lang/Integer;)La/mc6;

    .line 1769
    .line 1770
    .line 1771
    move-result-object v8

    .line 1772
    iget-byte v8, v8, La/mc6;->a:B

    .line 1773
    .line 1774
    iget v11, v9, La/rqs;->f:I

    .line 1775
    .line 1776
    invoke-direct {v3, v8, v11}, La/ieu0;-><init>(II)V

    .line 1777
    .line 1778
    .line 1779
    iget-object v8, v9, La/rqs;->d:Ljava/util/List;

    .line 1780
    .line 1781
    invoke-static {}, La/xkb;->P()Ljava/util/List;

    .line 1782
    .line 1783
    .line 1784
    move-result-object v11

    .line 1785
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1786
    .line 1787
    .line 1788
    move-result-object v11

    .line 1789
    :goto_23
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 1790
    .line 1791
    .line 1792
    move-result v12

    .line 1793
    move-object/from16 v28, v10

    .line 1794
    .line 1795
    move-object v13, v11

    .line 1796
    if-eqz v12, :cond_4b

    .line 1797
    .line 1798
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1799
    .line 1800
    .line 1801
    move-result-object v12

    .line 1802
    const-wide/16 v29, 0x0

    .line 1803
    .line 1804
    move-object v10, v12

    .line 1805
    check-cast v10, La/yxg;

    .line 1806
    .line 1807
    move-object/from16 v20, v12

    .line 1808
    .line 1809
    iget-wide v11, v4, La/d0t;->v:J

    .line 1810
    .line 1811
    move-wide/from16 v35, v11

    .line 1812
    .line 1813
    iget-wide v11, v10, La/yxg;->b:J

    .line 1814
    .line 1815
    cmp-long v11, v35, v11

    .line 1816
    .line 1817
    if-nez v11, :cond_4a

    .line 1818
    .line 1819
    iget-wide v11, v4, La/d0t;->u:J

    .line 1820
    .line 1821
    move-wide/from16 v35, v11

    .line 1822
    .line 1823
    iget-wide v10, v10, La/yxg;->a:J

    .line 1824
    .line 1825
    cmp-long v10, v35, v10

    .line 1826
    .line 1827
    if-eqz v10, :cond_49

    .line 1828
    .line 1829
    cmp-long v10, v35, v29

    .line 1830
    .line 1831
    if-nez v10, :cond_4a

    .line 1832
    .line 1833
    :cond_49
    move-object/from16 v12, v20

    .line 1834
    .line 1835
    goto :goto_24

    .line 1836
    :cond_4a
    move-object v11, v13

    .line 1837
    move-object/from16 v10, v28

    .line 1838
    .line 1839
    goto :goto_23

    .line 1840
    :cond_4b
    const-wide/16 v29, 0x0

    .line 1841
    .line 1842
    move-object/from16 v12, v17

    .line 1843
    .line 1844
    :goto_24
    check-cast v12, La/yxg;

    .line 1845
    .line 1846
    if-nez v12, :cond_4c

    .line 1847
    .line 1848
    sget-object v12, La/vtg;->d:La/vtg;

    .line 1849
    .line 1850
    :cond_4c
    iget-object v9, v9, La/rqs;->c:Ljava/lang/String;

    .line 1851
    .line 1852
    const-string v10, "-"

    .line 1853
    .line 1854
    filled-new-array {v10}, [Ljava/lang/String;

    .line 1855
    .line 1856
    .line 1857
    move-result-object v10

    .line 1858
    const/4 v11, 0x6

    .line 1859
    const/4 v13, 0x0

    .line 1860
    invoke-static {v9, v10, v13, v11}, Lkotlin/text/StringsKt;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 1861
    .line 1862
    .line 1863
    move-result-object v9

    .line 1864
    iget-boolean v10, v4, La/d0t;->z:Z

    .line 1865
    .line 1866
    if-nez v10, :cond_4e

    .line 1867
    .line 1868
    move-object v10, v12

    .line 1869
    iget-wide v11, v4, La/d0t;->s:J

    .line 1870
    .line 1871
    invoke-static {v11, v12}, La/dyb;->e0(J)Z

    .line 1872
    .line 1873
    .line 1874
    move-result v4

    .line 1875
    if-eqz v4, :cond_4d

    .line 1876
    .line 1877
    goto :goto_25

    .line 1878
    :cond_4d
    const/4 v4, 0x0

    .line 1879
    goto :goto_26

    .line 1880
    :cond_4e
    move-object v10, v12

    .line 1881
    :goto_25
    const/4 v4, 0x1

    .line 1882
    :goto_26
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1883
    .line 1884
    .line 1885
    move-result-object v11

    .line 1886
    check-cast v11, Ljava/lang/String;

    .line 1887
    .line 1888
    if-nez v11, :cond_4f

    .line 1889
    .line 1890
    move-object/from16 v11, v19

    .line 1891
    .line 1892
    :cond_4f
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 1893
    .line 1894
    .line 1895
    move-result-object v9

    .line 1896
    check-cast v9, Ljava/lang/String;

    .line 1897
    .line 1898
    if-nez v9, :cond_50

    .line 1899
    .line 1900
    move-object/from16 v9, v19

    .line 1901
    .line 1902
    :cond_50
    if-nez v4, :cond_55

    .line 1903
    .line 1904
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 1905
    .line 1906
    .line 1907
    move-result v4

    .line 1908
    if-eqz v4, :cond_51

    .line 1909
    .line 1910
    goto :goto_29

    .line 1911
    :cond_51
    const-string v4, "  :  "

    .line 1912
    .line 1913
    if-eqz v27, :cond_54

    .line 1914
    .line 1915
    iget v10, v10, La/yxg;->c:I

    .line 1916
    .line 1917
    const/4 v12, 0x1

    .line 1918
    if-ne v10, v12, :cond_54

    .line 1919
    .line 1920
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 1921
    .line 1922
    .line 1923
    move-result v10

    .line 1924
    if-nez v10, :cond_54

    .line 1925
    .line 1926
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 1927
    .line 1928
    .line 1929
    move-result-object v9

    .line 1930
    check-cast v9, La/df90;

    .line 1931
    .line 1932
    if-eqz v9, :cond_52

    .line 1933
    .line 1934
    iget-object v9, v9, La/df90;->b:La/tf90;

    .line 1935
    .line 1936
    if-eqz v9, :cond_52

    .line 1937
    .line 1938
    iget v9, v9, La/tf90;->b:I

    .line 1939
    .line 1940
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1941
    .line 1942
    .line 1943
    move-result-object v9

    .line 1944
    goto :goto_27

    .line 1945
    :cond_52
    move-object/from16 v9, v17

    .line 1946
    .line 1947
    :goto_27
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 1948
    .line 1949
    .line 1950
    move-result-object v8

    .line 1951
    check-cast v8, La/df90;

    .line 1952
    .line 1953
    if-eqz v8, :cond_53

    .line 1954
    .line 1955
    iget-object v8, v8, La/df90;->b:La/tf90;

    .line 1956
    .line 1957
    if-eqz v8, :cond_53

    .line 1958
    .line 1959
    iget v8, v8, La/tf90;->c:I

    .line 1960
    .line 1961
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1962
    .line 1963
    .line 1964
    move-result-object v8

    .line 1965
    goto :goto_28

    .line 1966
    :cond_53
    move-object/from16 v8, v17

    .line 1967
    .line 1968
    :goto_28
    new-instance v10, Ljava/lang/StringBuilder;

    .line 1969
    .line 1970
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 1971
    .line 1972
    .line 1973
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1974
    .line 1975
    .line 1976
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1977
    .line 1978
    .line 1979
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1980
    .line 1981
    .line 1982
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1983
    .line 1984
    .line 1985
    move-result-object v4

    .line 1986
    goto :goto_2a

    .line 1987
    :cond_54
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 1988
    .line 1989
    .line 1990
    move-result v8

    .line 1991
    if-lez v8, :cond_55

    .line 1992
    .line 1993
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 1994
    .line 1995
    .line 1996
    move-result v8

    .line 1997
    if-lez v8, :cond_55

    .line 1998
    .line 1999
    invoke-static {v11, v4, v9}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2000
    .line 2001
    .line 2002
    move-result-object v4

    .line 2003
    goto :goto_2a

    .line 2004
    :cond_55
    :goto_29
    move-object/from16 v4, v19

    .line 2005
    .line 2006
    :goto_2a
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 2007
    .line 2008
    .line 2009
    move-result v8

    .line 2010
    sget-object v9, La/opm;->a:La/opm;

    .line 2011
    .line 2012
    if-nez v8, :cond_56

    .line 2013
    .line 2014
    new-instance v4, La/lpm;

    .line 2015
    .line 2016
    new-instance v8, La/gpm;

    .line 2017
    .line 2018
    invoke-direct {v8}, La/gpm;-><init>()V

    .line 2019
    .line 2020
    .line 2021
    invoke-direct {v4, v9, v8}, La/lpm;-><init>(La/rpm;La/ipm;)V

    .line 2022
    .line 2023
    .line 2024
    const/4 v13, 0x0

    .line 2025
    goto :goto_2b

    .line 2026
    :cond_56
    const-string v8, ":"

    .line 2027
    .line 2028
    filled-new-array {v8}, [Ljava/lang/String;

    .line 2029
    .line 2030
    .line 2031
    move-result-object v10

    .line 2032
    const/4 v11, 0x6

    .line 2033
    const/4 v13, 0x0

    .line 2034
    invoke-static {v4, v10, v13, v11}, Lkotlin/text/StringsKt;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 2035
    .line 2036
    .line 2037
    move-result-object v10

    .line 2038
    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 2039
    .line 2040
    .line 2041
    move-result-object v10

    .line 2042
    check-cast v10, Ljava/lang/String;

    .line 2043
    .line 2044
    if-nez v10, :cond_57

    .line 2045
    .line 2046
    move-object/from16 v10, v19

    .line 2047
    .line 2048
    :cond_57
    filled-new-array {v8}, [Ljava/lang/String;

    .line 2049
    .line 2050
    .line 2051
    move-result-object v8

    .line 2052
    invoke-static {v4, v8, v13, v11}, Lkotlin/text/StringsKt;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 2053
    .line 2054
    .line 2055
    move-result-object v4

    .line 2056
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 2057
    .line 2058
    .line 2059
    move-result-object v4

    .line 2060
    check-cast v4, Ljava/lang/String;

    .line 2061
    .line 2062
    if-nez v4, :cond_58

    .line 2063
    .line 2064
    move-object/from16 v4, v19

    .line 2065
    .line 2066
    :cond_58
    new-instance v8, La/gpm;

    .line 2067
    .line 2068
    invoke-direct {v8}, La/gpm;-><init>()V

    .line 2069
    .line 2070
    .line 2071
    invoke-static {v10, v4, v13, v13, v8}, La/d5c;->O(Ljava/lang/String;Ljava/lang/String;ZZLa/ipm;)La/j83;

    .line 2072
    .line 2073
    .line 2074
    move-result-object v4

    .line 2075
    new-instance v8, La/hpm;

    .line 2076
    .line 2077
    move-wide/from16 v11, v29

    .line 2078
    .line 2079
    const/4 v10, 0x3

    .line 2080
    invoke-direct {v8, v11, v12, v10}, La/hpm;-><init>(JI)V

    .line 2081
    .line 2082
    .line 2083
    new-instance v10, La/kpm;

    .line 2084
    .line 2085
    invoke-direct {v10, v9, v8, v4}, La/kpm;-><init>(La/rpm;La/ipm;La/j83;)V

    .line 2086
    .line 2087
    .line 2088
    move-object v4, v10

    .line 2089
    :goto_2b
    if-eqz v27, :cond_59

    .line 2090
    .line 2091
    new-array v8, v13, [Ljava/lang/Object;

    .line 2092
    .line 2093
    iget-object v9, v6, La/ctf0;->b:La/lsm0;

    .line 2094
    .line 2095
    invoke-static {v8, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2096
    .line 2097
    .line 2098
    move-result-object v8

    .line 2099
    const v10, 0x7f130609

    .line 2100
    .line 2101
    .line 2102
    invoke-virtual {v9, v10, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2103
    .line 2104
    .line 2105
    move-result-object v8

    .line 2106
    goto :goto_2c

    .line 2107
    :cond_59
    move-object/from16 v8, v19

    .line 2108
    .line 2109
    :goto_2c
    new-instance v9, La/iev0;

    .line 2110
    .line 2111
    invoke-direct {v9, v2, v3, v4, v8}, La/iev0;-><init>(La/ieu0;La/ieu0;La/mpm;Ljava/lang/String;)V

    .line 2112
    .line 2113
    .line 2114
    new-instance v20, La/rdv0;

    .line 2115
    .line 2116
    sget-object v27, La/odv0;->a:La/odv0;

    .line 2117
    .line 2118
    move-object/from16 v29, v5

    .line 2119
    .line 2120
    move-object/from16 v30, v9

    .line 2121
    .line 2122
    invoke-direct/range {v20 .. v31}, La/rdv0;-><init>(JJJLa/pdv0;La/qdv0;La/qdv0;La/iev0;Z)V

    .line 2123
    .line 2124
    .line 2125
    move-object/from16 v2, v20

    .line 2126
    .line 2127
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2128
    .line 2129
    .line 2130
    move-object/from16 v2, p1

    .line 2131
    .line 2132
    move-object/from16 v10, v32

    .line 2133
    .line 2134
    move-object/from16 v11, v33

    .line 2135
    .line 2136
    move-object/from16 v13, v34

    .line 2137
    .line 2138
    goto/16 :goto_20

    .line 2139
    .line 2140
    :cond_5a
    move-object/from16 v32, v10

    .line 2141
    .line 2142
    move-object/from16 v33, v11

    .line 2143
    .line 2144
    move-object/from16 v34, v13

    .line 2145
    .line 2146
    const/4 v10, 0x3

    .line 2147
    invoke-static {v1, v10}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 2148
    .line 2149
    .line 2150
    move-result-object v1

    .line 2151
    invoke-static {v1}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 2152
    .line 2153
    .line 2154
    move-result-object v1

    .line 2155
    invoke-direct {v15, v7, v0, v1}, La/aev0;-><init>(La/zdv0;La/i4;La/i4;)V

    .line 2156
    .line 2157
    .line 2158
    move-object v0, v15

    .line 2159
    move-object/from16 v1, v34

    .line 2160
    .line 2161
    :goto_2d
    invoke-direct {v1, v14, v0}, La/mqk;-><init>(La/lqk;La/cev0;)V

    .line 2162
    .line 2163
    .line 2164
    instance-of v2, v0, La/aev0;

    .line 2165
    .line 2166
    if-eqz v2, :cond_5b

    .line 2167
    .line 2168
    move-object v6, v0

    .line 2169
    check-cast v6, La/aev0;

    .line 2170
    .line 2171
    goto :goto_2e

    .line 2172
    :cond_5b
    move-object/from16 v6, v17

    .line 2173
    .line 2174
    :goto_2e
    if-eqz v6, :cond_5c

    .line 2175
    .line 2176
    iget-object v0, v6, La/aev0;->c:La/a4x;

    .line 2177
    .line 2178
    if-eqz v0, :cond_5c

    .line 2179
    .line 2180
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 2181
    .line 2182
    .line 2183
    move-result v0

    .line 2184
    const/4 v8, 0x1

    .line 2185
    xor-int/2addr v0, v8

    .line 2186
    if-ne v0, v8, :cond_5c

    .line 2187
    .line 2188
    goto :goto_2f

    .line 2189
    :cond_5c
    if-eqz p0, :cond_5d

    .line 2190
    .line 2191
    :goto_2f
    const/4 v8, 0x1

    .line 2192
    goto :goto_30

    .line 2193
    :cond_5d
    const/4 v8, 0x0

    .line 2194
    :goto_30
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2195
    .line 2196
    sget-object v2, La/ujn;->h:Ljava/lang/String;

    .line 2197
    .line 2198
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2199
    .line 2200
    .line 2201
    invoke-virtual/range {v32 .. v32}, Ljava/lang/String;->length()I

    .line 2202
    .line 2203
    .line 2204
    move-result v2

    .line 2205
    if-nez v2, :cond_5e

    .line 2206
    .line 2207
    move-object/from16 v10, v33

    .line 2208
    .line 2209
    goto :goto_31

    .line 2210
    :cond_5e
    move-object/from16 v10, v32

    .line 2211
    .line 2212
    :goto_31
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 2213
    .line 2214
    .line 2215
    move-result v2

    .line 2216
    if-nez v2, :cond_5f

    .line 2217
    .line 2218
    const/4 v13, 0x0

    .line 2219
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 2220
    .line 2221
    .line 2222
    goto :goto_33

    .line 2223
    :cond_5f
    const/4 v13, 0x0

    .line 2224
    sget-object v2, La/ujn;->h:Ljava/lang/String;

    .line 2225
    .line 2226
    invoke-static {v10, v2, v13}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 2227
    .line 2228
    .line 2229
    move-result v2

    .line 2230
    if-nez v2, :cond_62

    .line 2231
    .line 2232
    const-string v2, "https://"

    .line 2233
    .line 2234
    invoke-static {v10, v2, v13}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 2235
    .line 2236
    .line 2237
    move-result v2

    .line 2238
    if-eqz v2, :cond_60

    .line 2239
    .line 2240
    const/4 v13, 0x0

    .line 2241
    goto :goto_32

    .line 2242
    :cond_60
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 2243
    .line 2244
    .line 2245
    move-result v2

    .line 2246
    const/16 v3, 0x2f

    .line 2247
    .line 2248
    if-lez v2, :cond_61

    .line 2249
    .line 2250
    const-string v2, "/"

    .line 2251
    .line 2252
    invoke-static {v0, v2}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 2253
    .line 2254
    .line 2255
    move-result v2

    .line 2256
    if-nez v2, :cond_61

    .line 2257
    .line 2258
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 2259
    .line 2260
    .line 2261
    :cond_61
    const/4 v12, 0x1

    .line 2262
    new-array v2, v12, [C

    .line 2263
    .line 2264
    const/4 v13, 0x0

    .line 2265
    aput-char v3, v2, v13

    .line 2266
    .line 2267
    invoke-static {v10, v2}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 2268
    .line 2269
    .line 2270
    move-result-object v2

    .line 2271
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2272
    .line 2273
    .line 2274
    goto :goto_33

    .line 2275
    :cond_62
    :goto_32
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 2276
    .line 2277
    .line 2278
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2279
    .line 2280
    .line 2281
    :goto_33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2282
    .line 2283
    .line 2284
    move-result-object v0

    .line 2285
    new-instance v2, La/nsk;

    .line 2286
    .line 2287
    invoke-direct {v2, v0, v1, v8}, La/nsk;-><init>(Ljava/lang/String;La/mqk;Z)V

    .line 2288
    .line 2289
    .line 2290
    return-object v2

    .line 2291
    :pswitch_6
    move-object/from16 v1, p1

    .line 2292
    .line 2293
    check-cast v1, Ljava/lang/Boolean;

    .line 2294
    .line 2295
    if-eqz v1, :cond_63

    .line 2296
    .line 2297
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2298
    .line 2299
    .line 2300
    move-result v1

    .line 2301
    iget-object v0, v0, La/xqk;->a:La/ksk;

    .line 2302
    .line 2303
    iget-object v0, v0, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 2304
    .line 2305
    iget-object v0, v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 2306
    .line 2307
    iget-byte v0, v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 2308
    .line 2309
    invoke-static {v0, v1}, La/rt20;->a(IZ)La/qt20;

    .line 2310
    .line 2311
    .line 2312
    move-result-object v0

    .line 2313
    goto :goto_34

    .line 2314
    :cond_63
    sget-object v0, La/pt20;->a:La/pt20;

    .line 2315
    .line 2316
    :goto_34
    return-object v0

    .line 2317
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
