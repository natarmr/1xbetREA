.class public final synthetic La/llb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xa9;


# direct methods
.method public synthetic constructor <init>(La/xa9;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/llb;->a:B

    iput-object p1, p0, La/llb;->b:La/xa9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 43

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/llb;->a:B

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    const/16 v5, 0xa

    .line 8
    .line 9
    const-string v7, "https://"

    .line 10
    .line 11
    const-string v8, "/"

    .line 12
    .line 13
    iget-object v0, v0, La/llb;->b:La/xa9;

    .line 14
    .line 15
    const/4 v10, 0x1

    .line 16
    const/4 v11, 0x0

    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, Ljava/util/List;

    .line 23
    .line 24
    iget-object v0, v0, La/xa9;->k:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, La/ctf0;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    if-eqz v1, :cond_f

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    goto/16 :goto_b

    .line 40
    .line 41
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v12

    .line 54
    if-eqz v12, :cond_2

    .line 55
    .line 56
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v12

    .line 60
    move-object v13, v12

    .line 61
    check-cast v13, La/wlc;

    .line 62
    .line 63
    iget-object v14, v13, La/wlc;->a:La/f7v0;

    .line 64
    .line 65
    sget-object v15, La/f7v0;->a:La/f7v0;

    .line 66
    .line 67
    if-eq v14, v15, :cond_1

    .line 68
    .line 69
    iget-object v13, v13, La/wlc;->c:La/fwp;

    .line 70
    .line 71
    iget-object v13, v13, La/fwp;->c:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 74
    .line 75
    .line 76
    move-result v13

    .line 77
    if-lez v13, :cond_1

    .line 78
    .line 79
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v12

    .line 96
    if-eqz v12, :cond_4

    .line 97
    .line 98
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v12

    .line 102
    move-object v13, v12

    .line 103
    check-cast v13, La/wlc;

    .line 104
    .line 105
    iget-object v13, v13, La/wlc;->d:Ljava/util/List;

    .line 106
    .line 107
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 108
    .line 109
    .line 110
    move-result v13

    .line 111
    const/4 v14, 0x5

    .line 112
    if-lt v13, v14, :cond_3

    .line 113
    .line 114
    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_4
    new-instance v2, Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-static {v1, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 121
    .line 122
    .line 123
    move-result v12

    .line 124
    invoke-direct {v2, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v12

    .line 135
    if-eqz v12, :cond_e

    .line 136
    .line 137
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v12

    .line 141
    check-cast v12, La/wlc;

    .line 142
    .line 143
    iget-object v13, v12, La/wlc;->c:La/fwp;

    .line 144
    .line 145
    iget-object v14, v12, La/wlc;->a:La/f7v0;

    .line 146
    .line 147
    iget-wide v3, v13, La/fwp;->b:J

    .line 148
    .line 149
    new-instance v15, La/n0x;

    .line 150
    .line 151
    new-instance v9, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    sget-object v5, La/ujn;->h:Ljava/lang/String;

    .line 154
    .line 155
    invoke-direct {v9, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    sget-object v5, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 159
    .line 160
    iget-object v6, v13, La/fwp;->g:Ljava/lang/String;

    .line 161
    .line 162
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    invoke-static {v6, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    const-string v10, "ufcStatistic/v1/image/%s"

    .line 171
    .line 172
    invoke-static {v5, v10, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 177
    .line 178
    .line 179
    move-result v6

    .line 180
    if-nez v6, :cond_5

    .line 181
    .line 182
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 183
    .line 184
    .line 185
    move v6, v11

    .line 186
    goto :goto_5

    .line 187
    :cond_5
    sget-object v6, La/ujn;->h:Ljava/lang/String;

    .line 188
    .line 189
    invoke-static {v5, v6, v11}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 190
    .line 191
    .line 192
    move-result v6

    .line 193
    if-nez v6, :cond_6

    .line 194
    .line 195
    invoke-static {v5, v7, v11}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 196
    .line 197
    .line 198
    move-result v6

    .line 199
    if-eqz v6, :cond_7

    .line 200
    .line 201
    :cond_6
    move v6, v11

    .line 202
    goto :goto_4

    .line 203
    :cond_7
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->length()I

    .line 204
    .line 205
    .line 206
    move-result v6

    .line 207
    if-lez v6, :cond_8

    .line 208
    .line 209
    invoke-static {v9, v8}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 210
    .line 211
    .line 212
    move-result v6

    .line 213
    if-nez v6, :cond_8

    .line 214
    .line 215
    const/16 v6, 0x2f

    .line 216
    .line 217
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    move/from16 v25, v6

    .line 221
    .line 222
    move/from16 v26, v11

    .line 223
    .line 224
    const/4 v6, 0x1

    .line 225
    goto :goto_3

    .line 226
    :cond_8
    move/from16 v26, v11

    .line 227
    .line 228
    const/4 v6, 0x1

    .line 229
    const/16 v25, 0x2f

    .line 230
    .line 231
    :goto_3
    new-array v11, v6, [C

    .line 232
    .line 233
    aput-char v25, v11, v26

    .line 234
    .line 235
    invoke-static {v5, v11}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    move/from16 v6, v26

    .line 243
    .line 244
    goto :goto_5

    .line 245
    :goto_4
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    :goto_5
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    invoke-direct {v15, v5}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    invoke-static {v14, v0}, La/tnq0;->r(La/f7v0;La/ctf0;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v18

    .line 262
    iget-object v5, v13, La/fwp;->c:Ljava/lang/String;

    .line 263
    .line 264
    new-array v9, v6, [Ljava/lang/Object;

    .line 265
    .line 266
    iget-object v11, v0, La/ctf0;->b:La/lsm0;

    .line 267
    .line 268
    invoke-static {v9, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v9

    .line 272
    const v6, 0x7f130400

    .line 273
    .line 274
    .line 275
    invoke-virtual {v11, v6, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v20

    .line 279
    iget-object v6, v12, La/wlc;->d:Ljava/util/List;

    .line 280
    .line 281
    new-instance v9, Ljava/util/ArrayList;

    .line 282
    .line 283
    const/16 v11, 0xa

    .line 284
    .line 285
    invoke-static {v6, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 286
    .line 287
    .line 288
    move-result v12

    .line 289
    invoke-direct {v9, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 290
    .line 291
    .line 292
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 293
    .line 294
    .line 295
    move-result-object v6

    .line 296
    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 297
    .line 298
    .line 299
    move-result v11

    .line 300
    if-eqz v11, :cond_d

    .line 301
    .line 302
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v11

    .line 306
    check-cast v11, La/fwp;

    .line 307
    .line 308
    new-instance v12, La/n0x;

    .line 309
    .line 310
    new-instance v13, Ljava/lang/StringBuilder;

    .line 311
    .line 312
    move-object/from16 p1, v1

    .line 313
    .line 314
    sget-object v1, La/ujn;->h:Ljava/lang/String;

    .line 315
    .line 316
    invoke-direct {v13, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 320
    .line 321
    iget-object v11, v11, La/fwp;->g:Ljava/lang/String;

    .line 322
    .line 323
    filled-new-array {v11}, [Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v11

    .line 327
    move-wide/from16 v16, v3

    .line 328
    .line 329
    const/4 v3, 0x1

    .line 330
    invoke-static {v11, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v4

    .line 334
    invoke-static {v1, v10, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 339
    .line 340
    .line 341
    move-result v3

    .line 342
    if-nez v3, :cond_9

    .line 343
    .line 344
    const/4 v3, 0x0

    .line 345
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 346
    .line 347
    .line 348
    goto :goto_a

    .line 349
    :cond_9
    const/4 v3, 0x0

    .line 350
    sget-object v4, La/ujn;->h:Ljava/lang/String;

    .line 351
    .line 352
    invoke-static {v1, v4, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 353
    .line 354
    .line 355
    move-result v4

    .line 356
    if-nez v4, :cond_c

    .line 357
    .line 358
    invoke-static {v1, v7, v3}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 359
    .line 360
    .line 361
    move-result v4

    .line 362
    if-eqz v4, :cond_a

    .line 363
    .line 364
    const/4 v4, 0x0

    .line 365
    goto :goto_9

    .line 366
    :cond_a
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->length()I

    .line 367
    .line 368
    .line 369
    move-result v3

    .line 370
    if-lez v3, :cond_b

    .line 371
    .line 372
    invoke-static {v13, v8}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 373
    .line 374
    .line 375
    move-result v3

    .line 376
    if-nez v3, :cond_b

    .line 377
    .line 378
    const/16 v3, 0x2f

    .line 379
    .line 380
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 381
    .line 382
    .line 383
    :goto_7
    const/4 v4, 0x1

    .line 384
    goto :goto_8

    .line 385
    :cond_b
    const/16 v3, 0x2f

    .line 386
    .line 387
    goto :goto_7

    .line 388
    :goto_8
    new-array v11, v4, [C

    .line 389
    .line 390
    const/4 v4, 0x0

    .line 391
    aput-char v3, v11, v4

    .line 392
    .line 393
    invoke-static {v1, v11}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    .line 400
    goto :goto_a

    .line 401
    :cond_c
    move v4, v3

    .line 402
    :goto_9
    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    :goto_a
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v1

    .line 412
    invoke-direct {v12, v1}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    move-object/from16 v1, p1

    .line 419
    .line 420
    move-wide/from16 v3, v16

    .line 421
    .line 422
    goto :goto_6

    .line 423
    :cond_d
    move-object/from16 p1, v1

    .line 424
    .line 425
    move-wide/from16 v16, v3

    .line 426
    .line 427
    invoke-static {v9}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 428
    .line 429
    .line 430
    move-result-object v21

    .line 431
    move-object/from16 v22, v14

    .line 432
    .line 433
    new-instance v14, La/eoh;

    .line 434
    .line 435
    move-wide/from16 v41, v16

    .line 436
    .line 437
    move-object/from16 v17, v15

    .line 438
    .line 439
    move-wide/from16 v15, v41

    .line 440
    .line 441
    move-object/from16 v19, v5

    .line 442
    .line 443
    invoke-direct/range {v14 .. v22}, La/eoh;-><init>(JLa/n0x;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/a4x;La/f7v0;)V

    .line 444
    .line 445
    .line 446
    new-instance v1, La/goh;

    .line 447
    .line 448
    invoke-direct {v1, v14}, La/goh;-><init>(La/foh;)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    move-object/from16 v1, p1

    .line 455
    .line 456
    const/16 v5, 0xa

    .line 457
    .line 458
    const/4 v10, 0x1

    .line 459
    const/4 v11, 0x0

    .line 460
    goto/16 :goto_2

    .line 461
    .line 462
    :cond_e
    const/4 v1, 0x3

    .line 463
    invoke-static {v2, v1}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 464
    .line 465
    .line 466
    move-result-object v1

    .line 467
    new-instance v2, La/dkb;

    .line 468
    .line 469
    new-instance v3, La/hjm;

    .line 470
    .line 471
    const/4 v4, 0x0

    .line 472
    new-array v5, v4, [Ljava/lang/Object;

    .line 473
    .line 474
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 475
    .line 476
    invoke-static {v5, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object v5

    .line 480
    const v6, 0x7f1313af

    .line 481
    .line 482
    .line 483
    invoke-virtual {v0, v6, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v5

    .line 487
    new-instance v14, La/ue9;

    .line 488
    .line 489
    new-array v6, v4, [Ljava/lang/Object;

    .line 490
    .line 491
    invoke-static {v6, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v4

    .line 495
    const v6, 0x7f1300e4

    .line 496
    .line 497
    .line 498
    invoke-virtual {v0, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    invoke-direct {v14, v0}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 503
    .line 504
    .line 505
    const/4 v15, 0x0

    .line 506
    const/16 v16, 0x1bbe

    .line 507
    .line 508
    move-object v4, v5

    .line 509
    const/4 v5, 0x0

    .line 510
    const/4 v6, 0x0

    .line 511
    const/4 v7, 0x0

    .line 512
    const/4 v8, 0x0

    .line 513
    const/4 v9, 0x0

    .line 514
    const/4 v10, 0x0

    .line 515
    const/4 v11, 0x0

    .line 516
    const/4 v12, 0x0

    .line 517
    const/4 v13, 0x0

    .line 518
    invoke-direct/range {v3 .. v16}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 519
    .line 520
    .line 521
    invoke-static {v1}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    invoke-direct {v2, v3, v0}, La/dkb;-><init>(La/hjm;La/a4x;)V

    .line 526
    .line 527
    .line 528
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 529
    .line 530
    .line 531
    move-result v0

    .line 532
    if-nez v0, :cond_f

    .line 533
    .line 534
    move-object v9, v2

    .line 535
    goto :goto_c

    .line 536
    :cond_f
    :goto_b
    const/4 v9, 0x0

    .line 537
    :goto_c
    return-object v9

    .line 538
    :pswitch_0
    move-object/from16 v1, p1

    .line 539
    .line 540
    check-cast v1, La/yvl0;

    .line 541
    .line 542
    iget-object v2, v0, La/xa9;->k:Ljava/lang/Object;

    .line 543
    .line 544
    check-cast v2, La/ctf0;

    .line 545
    .line 546
    iget-object v0, v0, La/xa9;->i:Ljava/lang/Object;

    .line 547
    .line 548
    check-cast v0, La/alb;

    .line 549
    .line 550
    iget-boolean v0, v0, La/alb;->i:Z

    .line 551
    .line 552
    sget-object v3, La/zkb;->a:Lkotlin/text/Regex;

    .line 553
    .line 554
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 555
    .line 556
    .line 557
    if-eqz v1, :cond_20

    .line 558
    .line 559
    iget-object v3, v1, La/yvl0;->j:Ljava/lang/String;

    .line 560
    .line 561
    iget-object v4, v1, La/yvl0;->b:Ljava/lang/String;

    .line 562
    .line 563
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 564
    .line 565
    .line 566
    move-result v5

    .line 567
    if-nez v5, :cond_10

    .line 568
    .line 569
    goto/16 :goto_18

    .line 570
    .line 571
    :cond_10
    if-nez v0, :cond_11

    .line 572
    .line 573
    goto/16 :goto_18

    .line 574
    .line 575
    :cond_11
    new-instance v0, La/ykb;

    .line 576
    .line 577
    new-instance v9, La/hjm;

    .line 578
    .line 579
    const/4 v6, 0x0

    .line 580
    new-array v5, v6, [Ljava/lang/Object;

    .line 581
    .line 582
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 583
    .line 584
    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    move-result-object v5

    .line 588
    const v6, 0x7f1305cf

    .line 589
    .line 590
    .line 591
    invoke-virtual {v2, v6, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object v10

    .line 595
    const/16 v21, 0x0

    .line 596
    .line 597
    const/16 v22, 0x1fbe

    .line 598
    .line 599
    const/4 v11, 0x0

    .line 600
    const/4 v12, 0x0

    .line 601
    const/4 v13, 0x0

    .line 602
    const/4 v14, 0x0

    .line 603
    const/4 v15, 0x0

    .line 604
    const/16 v16, 0x0

    .line 605
    .line 606
    const/16 v17, 0x0

    .line 607
    .line 608
    const/16 v18, 0x0

    .line 609
    .line 610
    const/16 v19, 0x0

    .line 611
    .line 612
    const/16 v20, 0x0

    .line 613
    .line 614
    invoke-direct/range {v9 .. v22}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 615
    .line 616
    .line 617
    new-instance v5, La/woh;

    .line 618
    .line 619
    new-instance v6, La/voh;

    .line 620
    .line 621
    iget v10, v1, La/yvl0;->o:I

    .line 622
    .line 623
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 624
    .line 625
    .line 626
    move-result-object v11

    .line 627
    if-ltz v10, :cond_12

    .line 628
    .line 629
    move-object/from16 v23, v11

    .line 630
    .line 631
    goto :goto_d

    .line 632
    :cond_12
    const/16 v23, 0x0

    .line 633
    .line 634
    :goto_d
    new-instance v10, La/n0x;

    .line 635
    .line 636
    new-instance v11, Ljava/lang/StringBuilder;

    .line 637
    .line 638
    sget-object v12, La/ujn;->h:Ljava/lang/String;

    .line 639
    .line 640
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 641
    .line 642
    .line 643
    sget-object v12, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 644
    .line 645
    invoke-static/range {v23 .. v23}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    move-result-object v13

    .line 649
    filled-new-array {v13}, [Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    move-result-object v13

    .line 653
    const/4 v14, 0x1

    .line 654
    invoke-static {v13, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 655
    .line 656
    .line 657
    move-result-object v13

    .line 658
    const-string v14, "static/img/android/country/%s.png"

    .line 659
    .line 660
    invoke-static {v12, v14, v13}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 661
    .line 662
    .line 663
    move-result-object v12

    .line 664
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 665
    .line 666
    .line 667
    move-result v13

    .line 668
    if-nez v13, :cond_13

    .line 669
    .line 670
    const/4 v13, 0x0

    .line 671
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 672
    .line 673
    .line 674
    goto :goto_11

    .line 675
    :cond_13
    const/4 v13, 0x0

    .line 676
    sget-object v14, La/ujn;->h:Ljava/lang/String;

    .line 677
    .line 678
    invoke-static {v12, v14, v13}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 679
    .line 680
    .line 681
    move-result v14

    .line 682
    if-nez v14, :cond_16

    .line 683
    .line 684
    invoke-static {v12, v7, v13}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 685
    .line 686
    .line 687
    move-result v14

    .line 688
    if-eqz v14, :cond_14

    .line 689
    .line 690
    const/4 v14, 0x0

    .line 691
    goto :goto_10

    .line 692
    :cond_14
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->length()I

    .line 693
    .line 694
    .line 695
    move-result v13

    .line 696
    if-lez v13, :cond_15

    .line 697
    .line 698
    invoke-static {v11, v8}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 699
    .line 700
    .line 701
    move-result v13

    .line 702
    if-nez v13, :cond_15

    .line 703
    .line 704
    const/16 v13, 0x2f

    .line 705
    .line 706
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 707
    .line 708
    .line 709
    :goto_e
    const/4 v14, 0x1

    .line 710
    goto :goto_f

    .line 711
    :cond_15
    const/16 v13, 0x2f

    .line 712
    .line 713
    goto :goto_e

    .line 714
    :goto_f
    new-array v15, v14, [C

    .line 715
    .line 716
    const/4 v14, 0x0

    .line 717
    aput-char v13, v15, v14

    .line 718
    .line 719
    invoke-static {v12, v15}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 720
    .line 721
    .line 722
    move-result-object v12

    .line 723
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 724
    .line 725
    .line 726
    goto :goto_11

    .line 727
    :cond_16
    move v14, v13

    .line 728
    :goto_10
    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 729
    .line 730
    .line 731
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 732
    .line 733
    .line 734
    :goto_11
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 735
    .line 736
    .line 737
    move-result-object v11

    .line 738
    invoke-direct {v10, v11}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 739
    .line 740
    .line 741
    iget-object v11, v1, La/yvl0;->a:Ljava/lang/String;

    .line 742
    .line 743
    invoke-direct {v6, v10, v4, v11}, La/voh;-><init>(La/n0x;Ljava/lang/String;Ljava/lang/String;)V

    .line 744
    .line 745
    .line 746
    new-instance v4, La/g4m;

    .line 747
    .line 748
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 749
    .line 750
    .line 751
    move-result-object v10

    .line 752
    iget-object v11, v1, La/yvl0;->c:Ljava/lang/String;

    .line 753
    .line 754
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 755
    .line 756
    .line 757
    move-result v12

    .line 758
    if-lez v12, :cond_17

    .line 759
    .line 760
    new-instance v12, La/a4m;

    .line 761
    .line 762
    new-instance v13, La/d4m;

    .line 763
    .line 764
    const/4 v14, 0x0

    .line 765
    new-array v15, v14, [Ljava/lang/Object;

    .line 766
    .line 767
    invoke-static {v15, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 768
    .line 769
    .line 770
    move-result-object v15

    .line 771
    const v14, 0x7f1302f8

    .line 772
    .line 773
    .line 774
    invoke-virtual {v2, v14, v15}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 775
    .line 776
    .line 777
    move-result-object v14

    .line 778
    invoke-direct {v13, v14, v3}, La/d4m;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 779
    .line 780
    .line 781
    const-wide/16 v14, 0x1

    .line 782
    .line 783
    invoke-direct {v12, v14, v15, v13}, La/a4m;-><init>(JLa/e4m;)V

    .line 784
    .line 785
    .line 786
    invoke-virtual {v10, v12}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 787
    .line 788
    .line 789
    :cond_17
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 790
    .line 791
    .line 792
    move-result v3

    .line 793
    if-lez v3, :cond_18

    .line 794
    .line 795
    new-instance v3, La/a4m;

    .line 796
    .line 797
    new-instance v12, La/d4m;

    .line 798
    .line 799
    const/4 v14, 0x0

    .line 800
    new-array v13, v14, [Ljava/lang/Object;

    .line 801
    .line 802
    invoke-static {v13, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 803
    .line 804
    .line 805
    move-result-object v13

    .line 806
    const v14, 0x7f130334

    .line 807
    .line 808
    .line 809
    invoke-virtual {v2, v14, v13}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 810
    .line 811
    .line 812
    move-result-object v2

    .line 813
    sget-object v13, La/zkb;->a:Lkotlin/text/Regex;

    .line 814
    .line 815
    const-string v14, ", "

    .line 816
    .line 817
    invoke-virtual {v13, v11, v14}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 818
    .line 819
    .line 820
    move-result-object v11

    .line 821
    invoke-direct {v12, v2, v11}, La/d4m;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 822
    .line 823
    .line 824
    const-wide/16 v13, 0x2

    .line 825
    .line 826
    invoke-direct {v3, v13, v14, v12}, La/a4m;-><init>(JLa/e4m;)V

    .line 827
    .line 828
    .line 829
    invoke-virtual {v10, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 830
    .line 831
    .line 832
    :cond_18
    invoke-static {v10}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 833
    .line 834
    .line 835
    move-result-object v2

    .line 836
    invoke-static {v2}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 837
    .line 838
    .line 839
    move-result-object v2

    .line 840
    invoke-direct {v4, v2}, La/g4m;-><init>(La/a4x;)V

    .line 841
    .line 842
    .line 843
    iget-object v1, v1, La/yvl0;->n:Ljava/util/List;

    .line 844
    .line 845
    new-instance v2, Ljava/util/ArrayList;

    .line 846
    .line 847
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 848
    .line 849
    .line 850
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 851
    .line 852
    .line 853
    move-result-object v1

    .line 854
    :cond_19
    :goto_12
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 855
    .line 856
    .line 857
    move-result v3

    .line 858
    if-eqz v3, :cond_1a

    .line 859
    .line 860
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 861
    .line 862
    .line 863
    move-result-object v3

    .line 864
    move-object v10, v3

    .line 865
    check-cast v10, Ljava/lang/String;

    .line 866
    .line 867
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 868
    .line 869
    .line 870
    move-result v10

    .line 871
    if-lez v10, :cond_19

    .line 872
    .line 873
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 874
    .line 875
    .line 876
    goto :goto_12

    .line 877
    :cond_1a
    new-instance v1, Ljava/util/ArrayList;

    .line 878
    .line 879
    const/16 v11, 0xa

    .line 880
    .line 881
    invoke-static {v2, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 882
    .line 883
    .line 884
    move-result v3

    .line 885
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 886
    .line 887
    .line 888
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 889
    .line 890
    .line 891
    move-result-object v2

    .line 892
    :goto_13
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 893
    .line 894
    .line 895
    move-result v3

    .line 896
    if-eqz v3, :cond_1f

    .line 897
    .line 898
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 899
    .line 900
    .line 901
    move-result-object v3

    .line 902
    check-cast v3, Ljava/lang/String;

    .line 903
    .line 904
    new-instance v10, La/n0x;

    .line 905
    .line 906
    new-instance v11, Ljava/lang/StringBuilder;

    .line 907
    .line 908
    sget-object v12, La/ujn;->h:Ljava/lang/String;

    .line 909
    .line 910
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 911
    .line 912
    .line 913
    sget-object v12, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 914
    .line 915
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 916
    .line 917
    .line 918
    move-result-object v3

    .line 919
    const/4 v14, 0x1

    .line 920
    invoke-static {v3, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 921
    .line 922
    .line 923
    move-result-object v3

    .line 924
    const-string v13, "sfiles/stadium/%s"

    .line 925
    .line 926
    invoke-static {v12, v13, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 927
    .line 928
    .line 929
    move-result-object v3

    .line 930
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 931
    .line 932
    .line 933
    move-result v12

    .line 934
    if-nez v12, :cond_1b

    .line 935
    .line 936
    const/4 v14, 0x0

    .line 937
    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 938
    .line 939
    .line 940
    goto :goto_17

    .line 941
    :cond_1b
    const/4 v14, 0x0

    .line 942
    sget-object v12, La/ujn;->h:Ljava/lang/String;

    .line 943
    .line 944
    invoke-static {v3, v12, v14}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 945
    .line 946
    .line 947
    move-result v12

    .line 948
    if-nez v12, :cond_1e

    .line 949
    .line 950
    invoke-static {v3, v7, v14}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 951
    .line 952
    .line 953
    move-result v12

    .line 954
    if-eqz v12, :cond_1c

    .line 955
    .line 956
    const/4 v14, 0x0

    .line 957
    goto :goto_16

    .line 958
    :cond_1c
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->length()I

    .line 959
    .line 960
    .line 961
    move-result v12

    .line 962
    if-lez v12, :cond_1d

    .line 963
    .line 964
    invoke-static {v11, v8}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 965
    .line 966
    .line 967
    move-result v12

    .line 968
    if-nez v12, :cond_1d

    .line 969
    .line 970
    const/16 v13, 0x2f

    .line 971
    .line 972
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 973
    .line 974
    .line 975
    :goto_14
    const/4 v14, 0x1

    .line 976
    goto :goto_15

    .line 977
    :cond_1d
    const/16 v13, 0x2f

    .line 978
    .line 979
    goto :goto_14

    .line 980
    :goto_15
    new-array v12, v14, [C

    .line 981
    .line 982
    const/4 v14, 0x0

    .line 983
    aput-char v13, v12, v14

    .line 984
    .line 985
    invoke-static {v3, v12}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 986
    .line 987
    .line 988
    move-result-object v3

    .line 989
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 990
    .line 991
    .line 992
    goto :goto_17

    .line 993
    :cond_1e
    :goto_16
    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 994
    .line 995
    .line 996
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 997
    .line 998
    .line 999
    :goto_17
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v3

    .line 1003
    invoke-direct {v10, v3}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1007
    .line 1008
    .line 1009
    goto :goto_13

    .line 1010
    :cond_1f
    invoke-static {v1}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v1

    .line 1014
    invoke-direct {v5, v6, v4, v1}, La/woh;-><init>(La/voh;La/g4m;La/a4x;)V

    .line 1015
    .line 1016
    .line 1017
    invoke-direct {v0, v9, v5}, La/ykb;-><init>(La/hjm;La/woh;)V

    .line 1018
    .line 1019
    .line 1020
    move-object v9, v0

    .line 1021
    goto :goto_19

    .line 1022
    :cond_20
    :goto_18
    const/4 v9, 0x0

    .line 1023
    :goto_19
    return-object v9

    .line 1024
    :pswitch_1
    move-object/from16 v1, p1

    .line 1025
    .line 1026
    check-cast v1, Ljava/util/List;

    .line 1027
    .line 1028
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1029
    .line 1030
    .line 1031
    iget-object v3, v0, La/xa9;->f:La/n0o0;

    .line 1032
    .line 1033
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v3

    .line 1037
    check-cast v3, La/fee;

    .line 1038
    .line 1039
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v3

    .line 1043
    check-cast v3, Ljava/util/Set;

    .line 1044
    .line 1045
    iget-object v4, v0, La/xa9;->i:Ljava/lang/Object;

    .line 1046
    .line 1047
    check-cast v4, La/alb;

    .line 1048
    .line 1049
    iget-object v5, v4, La/alb;->k:La/jkb;

    .line 1050
    .line 1051
    if-eqz v5, :cond_21

    .line 1052
    .line 1053
    iget-object v5, v5, La/jkb;->e:La/ypl0;

    .line 1054
    .line 1055
    if-eqz v5, :cond_21

    .line 1056
    .line 1057
    iget-object v5, v5, La/ypl0;->c:La/lel0;

    .line 1058
    .line 1059
    if-nez v5, :cond_22

    .line 1060
    .line 1061
    :cond_21
    sget-object v5, La/lel0;->Companion:La/kel0;

    .line 1062
    .line 1063
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1064
    .line 1065
    .line 1066
    invoke-static {}, La/kel0;->a()La/lel0;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v5

    .line 1070
    :cond_22
    iget-object v0, v0, La/xa9;->k:Ljava/lang/Object;

    .line 1071
    .line 1072
    move-object v8, v0

    .line 1073
    check-cast v8, La/ctf0;

    .line 1074
    .line 1075
    iget-object v0, v4, La/alb;->c:Ljava/util/List;

    .line 1076
    .line 1077
    if-nez v0, :cond_23

    .line 1078
    .line 1079
    sget-object v0, La/iun;->a:La/iun;

    .line 1080
    .line 1081
    :cond_23
    iget-object v6, v4, La/alb;->e:La/sff0;

    .line 1082
    .line 1083
    iget-object v6, v6, La/sff0;->g:La/mum0;

    .line 1084
    .line 1085
    iget-object v7, v6, La/mum0;->y:La/v5l0;

    .line 1086
    .line 1087
    iget-boolean v15, v4, La/alb;->h:Z

    .line 1088
    .line 1089
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1090
    .line 1091
    .line 1092
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1093
    .line 1094
    .line 1095
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1096
    .line 1097
    .line 1098
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 1099
    .line 1100
    .line 1101
    move-result v4

    .line 1102
    if-eqz v4, :cond_24

    .line 1103
    .line 1104
    goto/16 :goto_23

    .line 1105
    .line 1106
    :cond_24
    new-instance v4, Ljava/util/ArrayList;

    .line 1107
    .line 1108
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1109
    .line 1110
    .line 1111
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v17

    .line 1115
    :goto_1a
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    .line 1116
    .line 1117
    .line 1118
    move-result v6

    .line 1119
    if-eqz v6, :cond_30

    .line 1120
    .line 1121
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v6

    .line 1125
    check-cast v6, La/d2w;

    .line 1126
    .line 1127
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v9

    .line 1131
    :cond_25
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1132
    .line 1133
    .line 1134
    move-result v10

    .line 1135
    if-eqz v10, :cond_26

    .line 1136
    .line 1137
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v10

    .line 1141
    move-object v11, v10

    .line 1142
    check-cast v11, La/lok0;

    .line 1143
    .line 1144
    iget v11, v11, La/lok0;->a:I

    .line 1145
    .line 1146
    invoke-virtual {v6}, La/d2w;->a()I

    .line 1147
    .line 1148
    .line 1149
    move-result v12

    .line 1150
    if-ne v11, v12, :cond_25

    .line 1151
    .line 1152
    goto :goto_1b

    .line 1153
    :cond_26
    const/4 v10, 0x0

    .line 1154
    :goto_1b
    check-cast v10, La/lok0;

    .line 1155
    .line 1156
    invoke-virtual {v6}, La/d2w;->b()J

    .line 1157
    .line 1158
    .line 1159
    move-result-wide v11

    .line 1160
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v9

    .line 1164
    invoke-interface {v3, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1165
    .line 1166
    .line 1167
    move-result v9

    .line 1168
    if-eqz v10, :cond_27

    .line 1169
    .line 1170
    iget-boolean v11, v10, La/lok0;->n:Z

    .line 1171
    .line 1172
    move v13, v11

    .line 1173
    goto :goto_1c

    .line 1174
    :cond_27
    const/4 v13, 0x0

    .line 1175
    :goto_1c
    if-eqz v10, :cond_28

    .line 1176
    .line 1177
    iget-boolean v11, v10, La/lok0;->p:Z

    .line 1178
    .line 1179
    move v12, v11

    .line 1180
    :goto_1d
    move v11, v9

    .line 1181
    goto :goto_1e

    .line 1182
    :cond_28
    const/4 v12, 0x0

    .line 1183
    goto :goto_1d

    .line 1184
    :goto_1e
    new-instance v9, Ljava/util/ArrayList;

    .line 1185
    .line 1186
    move-object/from16 p0, v1

    .line 1187
    .line 1188
    const/16 v14, 0xa

    .line 1189
    .line 1190
    invoke-static {v0, v14}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1191
    .line 1192
    .line 1193
    move-result v1

    .line 1194
    invoke-direct {v9, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 1195
    .line 1196
    .line 1197
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v1

    .line 1201
    :goto_1f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1202
    .line 1203
    .line 1204
    move-result v16

    .line 1205
    if-eqz v16, :cond_29

    .line 1206
    .line 1207
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v16

    .line 1211
    move-object/from16 v14, v16

    .line 1212
    .line 1213
    check-cast v14, La/lok0;

    .line 1214
    .line 1215
    iget v14, v14, La/lok0;->a:I

    .line 1216
    .line 1217
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v14

    .line 1221
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1222
    .line 1223
    .line 1224
    const/16 v14, 0xa

    .line 1225
    .line 1226
    goto :goto_1f

    .line 1227
    :cond_29
    iget-object v1, v5, La/lel0;->j:Ljava/lang/String;

    .line 1228
    .line 1229
    if-eqz v10, :cond_2a

    .line 1230
    .line 1231
    iget-object v10, v10, La/lok0;->u:Ljava/lang/String;

    .line 1232
    .line 1233
    goto :goto_20

    .line 1234
    :cond_2a
    const/4 v10, 0x0

    .line 1235
    :goto_20
    if-nez v10, :cond_2b

    .line 1236
    .line 1237
    move-object v14, v2

    .line 1238
    goto :goto_21

    .line 1239
    :cond_2b
    move-object v14, v10

    .line 1240
    :goto_21
    instance-of v10, v6, La/x1w;

    .line 1241
    .line 1242
    if-eqz v10, :cond_2c

    .line 1243
    .line 1244
    check-cast v6, La/x1w;

    .line 1245
    .line 1246
    const/16 v16, 0x1

    .line 1247
    .line 1248
    move v10, v11

    .line 1249
    const/16 v24, 0xa

    .line 1250
    .line 1251
    move-object v11, v1

    .line 1252
    invoke-static/range {v6 .. v16}, La/p8a;->h0(La/x1w;La/v5l0;La/ctf0;Ljava/util/List;ZLjava/lang/String;ZZLjava/lang/String;ZZ)La/lla;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v1

    .line 1256
    goto :goto_22

    .line 1257
    :cond_2c
    move v10, v11

    .line 1258
    const/16 v24, 0xa

    .line 1259
    .line 1260
    move-object v11, v1

    .line 1261
    instance-of v1, v6, La/y1w;

    .line 1262
    .line 1263
    if-eqz v1, :cond_2d

    .line 1264
    .line 1265
    check-cast v6, La/y1w;

    .line 1266
    .line 1267
    const/16 v16, 0x1

    .line 1268
    .line 1269
    invoke-static/range {v6 .. v16}, La/zgc;->Q(La/y1w;La/v5l0;La/ctf0;Ljava/util/List;ZLjava/lang/String;ZZLjava/lang/String;ZZ)La/lla;

    .line 1270
    .line 1271
    .line 1272
    move-result-object v1

    .line 1273
    goto :goto_22

    .line 1274
    :cond_2d
    instance-of v1, v6, La/c2w;

    .line 1275
    .line 1276
    if-eqz v1, :cond_2e

    .line 1277
    .line 1278
    check-cast v6, La/c2w;

    .line 1279
    .line 1280
    const/16 v16, 0x1

    .line 1281
    .line 1282
    invoke-static/range {v6 .. v16}, La/x8f;->g0(La/c2w;La/v5l0;La/ctf0;Ljava/util/List;ZLjava/lang/String;ZZLjava/lang/String;ZZ)La/lla;

    .line 1283
    .line 1284
    .line 1285
    move-result-object v1

    .line 1286
    goto :goto_22

    .line 1287
    :cond_2e
    const/4 v1, 0x0

    .line 1288
    :goto_22
    if-eqz v1, :cond_2f

    .line 1289
    .line 1290
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1291
    .line 1292
    .line 1293
    :cond_2f
    move-object/from16 v1, p0

    .line 1294
    .line 1295
    goto/16 :goto_1a

    .line 1296
    .line 1297
    :cond_30
    move-object/from16 p0, v1

    .line 1298
    .line 1299
    const/4 v1, 0x3

    .line 1300
    invoke-static {v4, v1}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 1301
    .line 1302
    .line 1303
    move-result-object v0

    .line 1304
    new-instance v1, La/ikb;

    .line 1305
    .line 1306
    new-instance v27, La/hjm;

    .line 1307
    .line 1308
    const/4 v14, 0x0

    .line 1309
    new-array v2, v14, [Ljava/lang/Object;

    .line 1310
    .line 1311
    iget-object v3, v8, La/ctf0;->b:La/lsm0;

    .line 1312
    .line 1313
    invoke-static {v2, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1314
    .line 1315
    .line 1316
    move-result-object v2

    .line 1317
    const v4, 0x7f13118e

    .line 1318
    .line 1319
    .line 1320
    invoke-virtual {v3, v4, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v28

    .line 1324
    new-instance v2, La/ue9;

    .line 1325
    .line 1326
    new-array v4, v14, [Ljava/lang/Object;

    .line 1327
    .line 1328
    invoke-static {v4, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v4

    .line 1332
    const v6, 0x7f1300e4

    .line 1333
    .line 1334
    .line 1335
    invoke-virtual {v3, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v3

    .line 1339
    invoke-direct {v2, v3}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 1340
    .line 1341
    .line 1342
    const/16 v39, 0x0

    .line 1343
    .line 1344
    const/16 v40, 0x1bbe

    .line 1345
    .line 1346
    const/16 v29, 0x0

    .line 1347
    .line 1348
    const/16 v30, 0x0

    .line 1349
    .line 1350
    const/16 v31, 0x0

    .line 1351
    .line 1352
    const/16 v32, 0x0

    .line 1353
    .line 1354
    const/16 v33, 0x0

    .line 1355
    .line 1356
    const/16 v34, 0x0

    .line 1357
    .line 1358
    const/16 v35, 0x0

    .line 1359
    .line 1360
    const/16 v36, 0x0

    .line 1361
    .line 1362
    const/16 v37, 0x0

    .line 1363
    .line 1364
    move-object/from16 v38, v2

    .line 1365
    .line 1366
    invoke-direct/range {v27 .. v40}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 1367
    .line 1368
    .line 1369
    move-object/from16 v2, v27

    .line 1370
    .line 1371
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v0

    .line 1375
    const-string v3, "RESULTS"

    .line 1376
    .line 1377
    invoke-direct {v1, v3, v2, v0, v15}, La/ikb;-><init>(Ljava/lang/String;La/jjm;La/a4x;Z)V

    .line 1378
    .line 1379
    .line 1380
    invoke-interface/range {p0 .. p0}, Ljava/util/Collection;->isEmpty()Z

    .line 1381
    .line 1382
    .line 1383
    move-result v0

    .line 1384
    if-nez v0, :cond_31

    .line 1385
    .line 1386
    move-object v9, v1

    .line 1387
    goto :goto_24

    .line 1388
    :cond_31
    :goto_23
    const/4 v9, 0x0

    .line 1389
    :goto_24
    return-object v9

    .line 1390
    :pswitch_2
    move-object/from16 v1, p1

    .line 1391
    .line 1392
    check-cast v1, La/ubb;

    .line 1393
    .line 1394
    iget-object v2, v0, La/xa9;->l:Ljava/lang/Object;

    .line 1395
    .line 1396
    check-cast v2, La/y78;

    .line 1397
    .line 1398
    iget-object v3, v0, La/xa9;->i:Ljava/lang/Object;

    .line 1399
    .line 1400
    check-cast v3, La/alb;

    .line 1401
    .line 1402
    iget-boolean v4, v3, La/alb;->d:Z

    .line 1403
    .line 1404
    iget-object v5, v3, La/alb;->e:La/sff0;

    .line 1405
    .line 1406
    move v6, v4

    .line 1407
    iget-boolean v4, v5, La/sff0;->J:Z

    .line 1408
    .line 1409
    iget-object v0, v0, La/xa9;->k:Ljava/lang/Object;

    .line 1410
    .line 1411
    check-cast v0, La/ctf0;

    .line 1412
    .line 1413
    iget-object v7, v3, La/alb;->c:Ljava/util/List;

    .line 1414
    .line 1415
    if-nez v7, :cond_32

    .line 1416
    .line 1417
    sget-object v7, La/iun;->a:La/iun;

    .line 1418
    .line 1419
    :cond_32
    iget-object v5, v5, La/sff0;->g:La/mum0;

    .line 1420
    .line 1421
    iget-object v5, v5, La/mum0;->y:La/v5l0;

    .line 1422
    .line 1423
    iget-boolean v8, v3, La/alb;->h:Z

    .line 1424
    .line 1425
    move v3, v6

    .line 1426
    move-object v6, v7

    .line 1427
    move-object v7, v5

    .line 1428
    move-object v5, v0

    .line 1429
    move-object v0, v1

    .line 1430
    const/4 v1, 0x0

    .line 1431
    invoke-static/range {v0 .. v8}, La/bkb;->B(La/ubb;ZLa/y78;ZZLa/ctf0;Ljava/util/List;La/v5l0;Z)La/akb;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v0

    .line 1435
    return-object v0

    .line 1436
    :pswitch_3
    move-object/from16 v1, p1

    .line 1437
    .line 1438
    check-cast v1, La/ubb;

    .line 1439
    .line 1440
    iget-object v2, v0, La/xa9;->l:Ljava/lang/Object;

    .line 1441
    .line 1442
    move-object v3, v2

    .line 1443
    check-cast v3, La/y78;

    .line 1444
    .line 1445
    iget-object v2, v0, La/xa9;->i:Ljava/lang/Object;

    .line 1446
    .line 1447
    check-cast v2, La/alb;

    .line 1448
    .line 1449
    iget-boolean v4, v2, La/alb;->d:Z

    .line 1450
    .line 1451
    iget-object v5, v2, La/alb;->e:La/sff0;

    .line 1452
    .line 1453
    iget-boolean v6, v5, La/sff0;->J:Z

    .line 1454
    .line 1455
    iget-object v0, v0, La/xa9;->k:Ljava/lang/Object;

    .line 1456
    .line 1457
    check-cast v0, La/ctf0;

    .line 1458
    .line 1459
    iget-object v7, v2, La/alb;->c:Ljava/util/List;

    .line 1460
    .line 1461
    if-nez v7, :cond_33

    .line 1462
    .line 1463
    sget-object v7, La/iun;->a:La/iun;

    .line 1464
    .line 1465
    :cond_33
    iget-object v5, v5, La/sff0;->g:La/mum0;

    .line 1466
    .line 1467
    iget-object v8, v5, La/mum0;->y:La/v5l0;

    .line 1468
    .line 1469
    iget-boolean v9, v2, La/alb;->h:Z

    .line 1470
    .line 1471
    const/4 v2, 0x1

    .line 1472
    move v5, v6

    .line 1473
    move-object v6, v0

    .line 1474
    invoke-static/range {v1 .. v9}, La/bkb;->B(La/ubb;ZLa/y78;ZZLa/ctf0;Ljava/util/List;La/v5l0;Z)La/akb;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v0

    .line 1478
    return-object v0

    .line 1479
    :pswitch_4
    move-object/from16 v1, p1

    .line 1480
    .line 1481
    check-cast v1, La/alb;

    .line 1482
    .line 1483
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1484
    .line 1485
    .line 1486
    iget-object v3, v1, La/alb;->k:La/jkb;

    .line 1487
    .line 1488
    iget-object v4, v1, La/alb;->a:Lorg/xplatform/ufc/api/championship/UfcChampionshipParams;

    .line 1489
    .line 1490
    iget-boolean v5, v1, La/alb;->j:Z

    .line 1491
    .line 1492
    iget-object v6, v1, La/alb;->l:La/j0g0;

    .line 1493
    .line 1494
    iget-boolean v1, v1, La/alb;->f:Z

    .line 1495
    .line 1496
    iget-object v0, v0, La/xa9;->k:Ljava/lang/Object;

    .line 1497
    .line 1498
    check-cast v0, La/ctf0;

    .line 1499
    .line 1500
    iget-object v4, v4, Lorg/xplatform/ufc/api/championship/UfcChampionshipParams;->b:Ljava/lang/String;

    .line 1501
    .line 1502
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1503
    .line 1504
    .line 1505
    sget-object v14, La/ccm;->a:La/ccm;

    .line 1506
    .line 1507
    sget-object v13, La/obm;->a:La/obm;

    .line 1508
    .line 1509
    const v16, 0x7f080349

    .line 1510
    .line 1511
    .line 1512
    if-nez v3, :cond_35

    .line 1513
    .line 1514
    if-nez v5, :cond_35

    .line 1515
    .line 1516
    new-instance v0, La/flb;

    .line 1517
    .line 1518
    new-instance v9, La/fcm;

    .line 1519
    .line 1520
    new-instance v12, La/ecm;

    .line 1521
    .line 1522
    invoke-direct {v12, v4}, La/ecm;-><init>(Ljava/lang/String;)V

    .line 1523
    .line 1524
    .line 1525
    const-wide/16 v10, -0x1

    .line 1526
    .line 1527
    invoke-direct/range {v9 .. v14}, La/fcm;-><init>(JLa/ecm;La/pbm;La/dcm;)V

    .line 1528
    .line 1529
    .line 1530
    if-eqz v1, :cond_34

    .line 1531
    .line 1532
    move/from16 v15, v16

    .line 1533
    .line 1534
    goto :goto_25

    .line 1535
    :cond_34
    const v15, 0x7f080348

    .line 1536
    .line 1537
    .line 1538
    :goto_25
    invoke-direct {v0, v4, v9, v2, v15}, La/flb;-><init>(Ljava/lang/String;La/hcm;Ljava/lang/String;I)V

    .line 1539
    .line 1540
    .line 1541
    goto/16 :goto_42

    .line 1542
    .line 1543
    :cond_35
    if-nez v3, :cond_37

    .line 1544
    .line 1545
    new-instance v0, La/flb;

    .line 1546
    .line 1547
    if-eqz v1, :cond_36

    .line 1548
    .line 1549
    move/from16 v15, v16

    .line 1550
    .line 1551
    goto :goto_26

    .line 1552
    :cond_36
    const v15, 0x7f080348

    .line 1553
    .line 1554
    .line 1555
    :goto_26
    sget-object v1, La/gcm;->a:La/gcm;

    .line 1556
    .line 1557
    invoke-direct {v0, v4, v1, v2, v15}, La/flb;-><init>(Ljava/lang/String;La/hcm;Ljava/lang/String;I)V

    .line 1558
    .line 1559
    .line 1560
    goto/16 :goto_42

    .line 1561
    .line 1562
    :cond_37
    iget-object v5, v3, La/jkb;->a:Ljava/lang/Object;

    .line 1563
    .line 1564
    new-instance v9, La/j0g0;

    .line 1565
    .line 1566
    invoke-static {v3}, La/kkb;->G(La/jkb;)Ljava/util/ArrayList;

    .line 1567
    .line 1568
    .line 1569
    move-result-object v9

    .line 1570
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1571
    .line 1572
    .line 1573
    move-result-object v9

    .line 1574
    check-cast v9, La/d0t;

    .line 1575
    .line 1576
    if-eqz v9, :cond_39

    .line 1577
    .line 1578
    iget-object v9, v9, La/d0t;->o:Ljava/lang/String;

    .line 1579
    .line 1580
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 1581
    .line 1582
    .line 1583
    move-result v10

    .line 1584
    if-nez v10, :cond_38

    .line 1585
    .line 1586
    const/4 v9, 0x0

    .line 1587
    :cond_38
    if-nez v9, :cond_3d

    .line 1588
    .line 1589
    :cond_39
    if-eqz v6, :cond_3c

    .line 1590
    .line 1591
    iget-object v6, v6, La/j0g0;->a:Ljava/lang/Object;

    .line 1592
    .line 1593
    instance-of v9, v6, La/g0g0;

    .line 1594
    .line 1595
    if-eqz v9, :cond_3a

    .line 1596
    .line 1597
    const/4 v6, 0x0

    .line 1598
    :cond_3a
    check-cast v6, Ljava/util/List;

    .line 1599
    .line 1600
    if-eqz v6, :cond_3c

    .line 1601
    .line 1602
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1603
    .line 1604
    .line 1605
    move-result-object v6

    .line 1606
    check-cast v6, La/d2w;

    .line 1607
    .line 1608
    if-eqz v6, :cond_3c

    .line 1609
    .line 1610
    invoke-virtual {v6}, La/d2w;->h()Ljava/lang/String;

    .line 1611
    .line 1612
    .line 1613
    move-result-object v6

    .line 1614
    if-eqz v6, :cond_3c

    .line 1615
    .line 1616
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 1617
    .line 1618
    .line 1619
    move-result v9

    .line 1620
    if-nez v9, :cond_3b

    .line 1621
    .line 1622
    goto :goto_27

    .line 1623
    :cond_3b
    move-object v9, v6

    .line 1624
    goto :goto_28

    .line 1625
    :cond_3c
    :goto_27
    const/4 v9, 0x0

    .line 1626
    :cond_3d
    :goto_28
    if-nez v9, :cond_3e

    .line 1627
    .line 1628
    move-object v9, v2

    .line 1629
    :cond_3e
    invoke-static {v9, v4}, La/sj3;->j0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1630
    .line 1631
    .line 1632
    move-result-object v4

    .line 1633
    iget-object v3, v3, La/jkb;->e:La/ypl0;

    .line 1634
    .line 1635
    iget-object v3, v3, La/ypl0;->c:La/lel0;

    .line 1636
    .line 1637
    new-instance v6, La/flb;

    .line 1638
    .line 1639
    new-instance v9, La/fcm;

    .line 1640
    .line 1641
    instance-of v10, v5, La/g0g0;

    .line 1642
    .line 1643
    if-eqz v10, :cond_3f

    .line 1644
    .line 1645
    const/4 v11, 0x0

    .line 1646
    goto :goto_29

    .line 1647
    :cond_3f
    move-object v11, v5

    .line 1648
    :goto_29
    check-cast v11, La/q2s0;

    .line 1649
    .line 1650
    if-eqz v11, :cond_40

    .line 1651
    .line 1652
    iget-object v11, v11, La/q2s0;->a:La/r1s0;

    .line 1653
    .line 1654
    iget-wide v11, v11, La/r1s0;->b:J

    .line 1655
    .line 1656
    goto :goto_2a

    .line 1657
    :cond_40
    const-wide/16 v11, -0x1

    .line 1658
    .line 1659
    :goto_2a
    new-instance v15, La/ecm;

    .line 1660
    .line 1661
    invoke-direct {v15, v4}, La/ecm;-><init>(Ljava/lang/String;)V

    .line 1662
    .line 1663
    .line 1664
    move-object/from16 v17, v0

    .line 1665
    .line 1666
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v0

    .line 1670
    if-eqz v10, :cond_41

    .line 1671
    .line 1672
    const/16 v18, 0x0

    .line 1673
    .line 1674
    :goto_2b
    move/from16 v19, v1

    .line 1675
    .line 1676
    goto :goto_2c

    .line 1677
    :cond_41
    move-object/from16 v18, v5

    .line 1678
    .line 1679
    goto :goto_2b

    .line 1680
    :goto_2c
    move-object/from16 v1, v18

    .line 1681
    .line 1682
    check-cast v1, La/q2s0;

    .line 1683
    .line 1684
    if-eqz v1, :cond_42

    .line 1685
    .line 1686
    iget-object v1, v1, La/q2s0;->a:La/r1s0;

    .line 1687
    .line 1688
    goto :goto_2d

    .line 1689
    :cond_42
    const/4 v1, 0x0

    .line 1690
    :goto_2d
    move-object/from16 v18, v9

    .line 1691
    .line 1692
    move/from16 v20, v10

    .line 1693
    .line 1694
    if-eqz v1, :cond_43

    .line 1695
    .line 1696
    iget-wide v9, v1, La/r1s0;->e:J

    .line 1697
    .line 1698
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1699
    .line 1700
    .line 1701
    move-result-object v1

    .line 1702
    goto :goto_2e

    .line 1703
    :cond_43
    const/4 v1, 0x0

    .line 1704
    :goto_2e
    if-eqz v1, :cond_44

    .line 1705
    .line 1706
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 1707
    .line 1708
    .line 1709
    move-result-wide v9

    .line 1710
    const-wide/16 v21, 0x0

    .line 1711
    .line 1712
    cmp-long v9, v9, v21

    .line 1713
    .line 1714
    if-lez v9, :cond_44

    .line 1715
    .line 1716
    new-instance v9, La/m0x;

    .line 1717
    .line 1718
    const v10, 0x7f0807f8

    .line 1719
    .line 1720
    .line 1721
    move-object/from16 v21, v1

    .line 1722
    .line 1723
    const/4 v1, 0x6

    .line 1724
    move-object/from16 v22, v5

    .line 1725
    .line 1726
    const/4 v5, 0x0

    .line 1727
    invoke-direct {v9, v10, v5, v1}, La/m0x;-><init>(ILa/bzw;I)V

    .line 1728
    .line 1729
    .line 1730
    sget-object v32, La/ubm;->a:La/ubm;

    .line 1731
    .line 1732
    sget-object v1, La/rdj;->a:La/rdj;

    .line 1733
    .line 1734
    invoke-virtual/range {v17 .. v17}, La/ctf0;->h()Z

    .line 1735
    .line 1736
    .line 1737
    move-result v1

    .line 1738
    move-object/from16 v17, v6

    .line 1739
    .line 1740
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Long;->longValue()J

    .line 1741
    .line 1742
    .line 1743
    move-result-wide v5

    .line 1744
    sget-object v10, La/efj;->c:La/efj;

    .line 1745
    .line 1746
    move/from16 v21, v1

    .line 1747
    .line 1748
    new-instance v1, La/znq0;

    .line 1749
    .line 1750
    invoke-direct {v1, v5, v6}, La/znq0;-><init>(J)V

    .line 1751
    .line 1752
    .line 1753
    invoke-static/range {v21 .. v21}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1754
    .line 1755
    .line 1756
    move-result-object v5

    .line 1757
    const/16 v6, 0x38

    .line 1758
    .line 1759
    move-object/from16 v31, v9

    .line 1760
    .line 1761
    const/4 v9, 0x0

    .line 1762
    invoke-static {v1, v10, v5, v9, v6}, La/rdj;->g(La/aoq0;La/efj;Ljava/lang/Boolean;ZI)Ljava/lang/String;

    .line 1763
    .line 1764
    .line 1765
    move-result-object v30

    .line 1766
    new-instance v27, La/xbm;

    .line 1767
    .line 1768
    const-wide/16 v28, 0x1

    .line 1769
    .line 1770
    const v33, 0x7f0807f8

    .line 1771
    .line 1772
    .line 1773
    invoke-direct/range {v27 .. v33}, La/xbm;-><init>(JLjava/lang/String;La/o0x;La/ubm;I)V

    .line 1774
    .line 1775
    .line 1776
    move-object/from16 v1, v27

    .line 1777
    .line 1778
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1779
    .line 1780
    .line 1781
    goto :goto_2f

    .line 1782
    :cond_44
    move-object/from16 v22, v5

    .line 1783
    .line 1784
    move-object/from16 v17, v6

    .line 1785
    .line 1786
    :goto_2f
    if-eqz v20, :cond_45

    .line 1787
    .line 1788
    const/4 v5, 0x0

    .line 1789
    goto :goto_30

    .line 1790
    :cond_45
    move-object/from16 v5, v22

    .line 1791
    .line 1792
    :goto_30
    check-cast v5, La/q2s0;

    .line 1793
    .line 1794
    if-eqz v5, :cond_46

    .line 1795
    .line 1796
    iget-object v1, v5, La/q2s0;->a:La/r1s0;

    .line 1797
    .line 1798
    goto :goto_31

    .line 1799
    :cond_46
    const/4 v1, 0x0

    .line 1800
    :goto_31
    if-eqz v1, :cond_47

    .line 1801
    .line 1802
    iget-object v5, v1, La/r1s0;->k:Ljava/lang/String;

    .line 1803
    .line 1804
    goto :goto_32

    .line 1805
    :cond_47
    move-object v5, v2

    .line 1806
    :goto_32
    if-eqz v1, :cond_48

    .line 1807
    .line 1808
    iget-object v6, v1, La/r1s0;->g:Ljava/lang/String;

    .line 1809
    .line 1810
    goto :goto_33

    .line 1811
    :cond_48
    move-object v6, v2

    .line 1812
    :goto_33
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 1813
    .line 1814
    .line 1815
    move-result v9

    .line 1816
    if-lez v9, :cond_49

    .line 1817
    .line 1818
    goto :goto_34

    .line 1819
    :cond_49
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 1820
    .line 1821
    .line 1822
    move-result v9

    .line 1823
    if-lez v9, :cond_50

    .line 1824
    .line 1825
    :goto_34
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 1826
    .line 1827
    .line 1828
    move-result v9

    .line 1829
    if-lez v9, :cond_4a

    .line 1830
    .line 1831
    const-string v9, " "

    .line 1832
    .line 1833
    invoke-virtual {v5, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1834
    .line 1835
    .line 1836
    move-result-object v5

    .line 1837
    goto :goto_35

    .line 1838
    :cond_4a
    move-object v5, v2

    .line 1839
    :goto_35
    invoke-static {v6, v2}, La/sj3;->j0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1840
    .line 1841
    .line 1842
    move-result-object v2

    .line 1843
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1844
    .line 1845
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 1846
    .line 1847
    .line 1848
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1849
    .line 1850
    .line 1851
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1852
    .line 1853
    .line 1854
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1855
    .line 1856
    .line 1857
    move-result-object v30

    .line 1858
    new-instance v2, La/n0x;

    .line 1859
    .line 1860
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1861
    .line 1862
    sget-object v6, La/ujn;->h:Ljava/lang/String;

    .line 1863
    .line 1864
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1865
    .line 1866
    .line 1867
    if-eqz v1, :cond_4b

    .line 1868
    .line 1869
    iget-object v9, v1, La/r1s0;->d:Ljava/lang/String;

    .line 1870
    .line 1871
    goto :goto_36

    .line 1872
    :cond_4b
    const/4 v9, 0x0

    .line 1873
    :goto_36
    const-string v1, "ufcStatistic/v1/image/"

    .line 1874
    .line 1875
    invoke-static {v1, v9}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1876
    .line 1877
    .line 1878
    move-result-object v1

    .line 1879
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1880
    .line 1881
    .line 1882
    move-result v6

    .line 1883
    if-nez v6, :cond_4c

    .line 1884
    .line 1885
    const/4 v6, 0x0

    .line 1886
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1887
    .line 1888
    .line 1889
    goto :goto_3a

    .line 1890
    :cond_4c
    const/4 v6, 0x0

    .line 1891
    sget-object v9, La/ujn;->h:Ljava/lang/String;

    .line 1892
    .line 1893
    invoke-static {v1, v9, v6}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1894
    .line 1895
    .line 1896
    move-result v9

    .line 1897
    if-nez v9, :cond_4f

    .line 1898
    .line 1899
    invoke-static {v1, v7, v6}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1900
    .line 1901
    .line 1902
    move-result v9

    .line 1903
    if-eqz v9, :cond_4d

    .line 1904
    .line 1905
    const/4 v9, 0x0

    .line 1906
    goto :goto_39

    .line 1907
    :cond_4d
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->length()I

    .line 1908
    .line 1909
    .line 1910
    move-result v6

    .line 1911
    if-lez v6, :cond_4e

    .line 1912
    .line 1913
    invoke-static {v5, v8}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 1914
    .line 1915
    .line 1916
    move-result v6

    .line 1917
    if-nez v6, :cond_4e

    .line 1918
    .line 1919
    const/16 v6, 0x2f

    .line 1920
    .line 1921
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1922
    .line 1923
    .line 1924
    :goto_37
    const/4 v9, 0x1

    .line 1925
    goto :goto_38

    .line 1926
    :cond_4e
    const/16 v6, 0x2f

    .line 1927
    .line 1928
    goto :goto_37

    .line 1929
    :goto_38
    new-array v10, v9, [C

    .line 1930
    .line 1931
    const/4 v9, 0x0

    .line 1932
    aput-char v6, v10, v9

    .line 1933
    .line 1934
    invoke-static {v1, v10}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 1935
    .line 1936
    .line 1937
    move-result-object v1

    .line 1938
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1939
    .line 1940
    .line 1941
    goto :goto_3a

    .line 1942
    :cond_4f
    move v9, v6

    .line 1943
    :goto_39
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1944
    .line 1945
    .line 1946
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1947
    .line 1948
    .line 1949
    :goto_3a
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1950
    .line 1951
    .line 1952
    move-result-object v1

    .line 1953
    invoke-direct {v2, v1}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 1954
    .line 1955
    .line 1956
    sget-object v32, La/ubm;->b:La/ubm;

    .line 1957
    .line 1958
    new-instance v27, La/xbm;

    .line 1959
    .line 1960
    const-wide/16 v28, 0x2

    .line 1961
    .line 1962
    const v33, 0x7f08082c

    .line 1963
    .line 1964
    .line 1965
    move-object/from16 v31, v2

    .line 1966
    .line 1967
    invoke-direct/range {v27 .. v33}, La/xbm;-><init>(JLjava/lang/String;La/o0x;La/ubm;I)V

    .line 1968
    .line 1969
    .line 1970
    move-object/from16 v1, v27

    .line 1971
    .line 1972
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1973
    .line 1974
    .line 1975
    :cond_50
    invoke-static {v0}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 1976
    .line 1977
    .line 1978
    move-result-object v0

    .line 1979
    invoke-virtual {v0}, La/e4;->b()I

    .line 1980
    .line 1981
    .line 1982
    move-result v1

    .line 1983
    const/4 v2, 0x2

    .line 1984
    if-lt v1, v2, :cond_51

    .line 1985
    .line 1986
    new-instance v13, La/nbm;

    .line 1987
    .line 1988
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1989
    .line 1990
    .line 1991
    move-result-object v0

    .line 1992
    invoke-direct {v13, v0}, La/nbm;-><init>(La/a4x;)V

    .line 1993
    .line 1994
    .line 1995
    :cond_51
    move-wide v10, v11

    .line 1996
    move-object v12, v15

    .line 1997
    move-object/from16 v9, v18

    .line 1998
    .line 1999
    invoke-direct/range {v9 .. v14}, La/fcm;-><init>(JLa/ecm;La/pbm;La/dcm;)V

    .line 2000
    .line 2001
    .line 2002
    if-eqz v19, :cond_52

    .line 2003
    .line 2004
    iget-object v0, v3, La/lel0;->h:Ljava/lang/String;

    .line 2005
    .line 2006
    goto :goto_3b

    .line 2007
    :cond_52
    iget-object v0, v3, La/lel0;->g:Ljava/lang/String;

    .line 2008
    .line 2009
    :goto_3b
    new-instance v1, Ljava/lang/StringBuilder;

    .line 2010
    .line 2011
    sget-object v2, La/ujn;->h:Ljava/lang/String;

    .line 2012
    .line 2013
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2014
    .line 2015
    .line 2016
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2017
    .line 2018
    .line 2019
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 2020
    .line 2021
    .line 2022
    move-result v2

    .line 2023
    if-nez v2, :cond_53

    .line 2024
    .line 2025
    const/4 v14, 0x0

    .line 2026
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 2027
    .line 2028
    .line 2029
    goto :goto_3f

    .line 2030
    :cond_53
    const/4 v14, 0x0

    .line 2031
    sget-object v2, La/ujn;->h:Ljava/lang/String;

    .line 2032
    .line 2033
    invoke-static {v0, v2, v14}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 2034
    .line 2035
    .line 2036
    move-result v2

    .line 2037
    if-nez v2, :cond_56

    .line 2038
    .line 2039
    invoke-static {v0, v7, v14}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 2040
    .line 2041
    .line 2042
    move-result v2

    .line 2043
    if-eqz v2, :cond_54

    .line 2044
    .line 2045
    const/4 v14, 0x0

    .line 2046
    goto :goto_3e

    .line 2047
    :cond_54
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 2048
    .line 2049
    .line 2050
    move-result v2

    .line 2051
    if-lez v2, :cond_55

    .line 2052
    .line 2053
    invoke-static {v1, v8}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 2054
    .line 2055
    .line 2056
    move-result v2

    .line 2057
    if-nez v2, :cond_55

    .line 2058
    .line 2059
    const/16 v6, 0x2f

    .line 2060
    .line 2061
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 2062
    .line 2063
    .line 2064
    :goto_3c
    const/4 v14, 0x1

    .line 2065
    goto :goto_3d

    .line 2066
    :cond_55
    const/16 v6, 0x2f

    .line 2067
    .line 2068
    goto :goto_3c

    .line 2069
    :goto_3d
    new-array v2, v14, [C

    .line 2070
    .line 2071
    const/4 v14, 0x0

    .line 2072
    aput-char v6, v2, v14

    .line 2073
    .line 2074
    invoke-static {v0, v2}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 2075
    .line 2076
    .line 2077
    move-result-object v0

    .line 2078
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2079
    .line 2080
    .line 2081
    goto :goto_3f

    .line 2082
    :cond_56
    :goto_3e
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 2083
    .line 2084
    .line 2085
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2086
    .line 2087
    .line 2088
    :goto_3f
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2089
    .line 2090
    .line 2091
    move-result-object v0

    .line 2092
    if-eqz v19, :cond_57

    .line 2093
    .line 2094
    move/from16 v15, v16

    .line 2095
    .line 2096
    :goto_40
    move-object/from16 v1, v17

    .line 2097
    .line 2098
    goto :goto_41

    .line 2099
    :cond_57
    const v15, 0x7f080348

    .line 2100
    .line 2101
    .line 2102
    goto :goto_40

    .line 2103
    :goto_41
    invoke-direct {v1, v4, v9, v0, v15}, La/flb;-><init>(Ljava/lang/String;La/hcm;Ljava/lang/String;I)V

    .line 2104
    .line 2105
    .line 2106
    move-object v0, v1

    .line 2107
    :goto_42
    return-object v0

    .line 2108
    nop

    .line 2109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
