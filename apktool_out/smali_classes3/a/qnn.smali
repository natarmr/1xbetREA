.class public final synthetic La/qnn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wnn;


# direct methods
.method public synthetic constructor <init>(La/wnn;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/qnn;->a:B

    iput-object p1, p0, La/qnn;->b:La/wnn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/qnn;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v0, v0, La/qnn;->b:La/wnn;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p1

    .line 12
    .line 13
    check-cast v1, La/oyg0;

    .line 14
    .line 15
    move-object/from16 v4, p2

    .line 16
    .line 17
    check-cast v4, La/inn;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object v1, v0, La/wnn;->s:La/pq;

    .line 26
    .line 27
    iget-object v1, v1, La/pq;->a:La/es;

    .line 28
    .line 29
    invoke-virtual {v1}, La/es;->i()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iget-object v5, v0, La/wnn;->E:La/ocl;

    .line 34
    .line 35
    iget-object v5, v5, La/ocl;->a:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v5, La/vqc;

    .line 38
    .line 39
    invoke-virtual {v5}, La/vqc;->d()La/v0f;

    .line 40
    .line 41
    .line 42
    move-result-object v9

    .line 43
    iget-object v7, v9, La/v0f;->i:Ljava/util/List;

    .line 44
    .line 45
    iget-object v5, v9, La/v0f;->b:La/q4f;

    .line 46
    .line 47
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-le v6, v2, :cond_0

    .line 52
    .line 53
    move v6, v2

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    const/4 v6, 0x0

    .line 56
    :goto_0
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    if-nez v8, :cond_1

    .line 61
    .line 62
    new-instance v8, La/vln;

    .line 63
    .line 64
    invoke-direct {v8, v1}, La/vln;-><init>(Ljava/util/List;)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    iget-object v1, v0, La/wnn;->Y:La/bby;

    .line 69
    .line 70
    if-eqz v1, :cond_2

    .line 71
    .line 72
    const/4 v8, 0x0

    .line 73
    invoke-interface {v1, v8}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 74
    .line 75
    .line 76
    :cond_2
    sget-object v8, La/wln;->a:La/wln;

    .line 77
    .line 78
    :goto_1
    iget-object v1, v0, La/wnn;->D:La/reu;

    .line 79
    .line 80
    invoke-virtual {v1}, La/reu;->c()La/nwo0;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    iget-boolean v12, v1, La/nwo0;->a:Z

    .line 85
    .line 86
    iget-object v0, v0, La/wnn;->G:La/p4a;

    .line 87
    .line 88
    iget-object v1, v0, La/p4a;->a:La/es;

    .line 89
    .line 90
    invoke-virtual {v1}, La/es;->i()Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object v10

    .line 94
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    .line 95
    .line 96
    .line 97
    move-result v10

    .line 98
    if-nez v10, :cond_7

    .line 99
    .line 100
    iget-object v0, v0, La/p4a;->b:La/vqc;

    .line 101
    .line 102
    invoke-virtual {v0}, La/vqc;->e()La/q4f;

    .line 103
    .line 104
    .line 105
    move-result-object v10

    .line 106
    iget-object v0, v0, La/vqc;->b:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v0, La/u0f;

    .line 109
    .line 110
    iget-object v0, v0, La/u0f;->b:La/q4f;

    .line 111
    .line 112
    if-eq v10, v0, :cond_3

    .line 113
    .line 114
    move v15, v2

    .line 115
    goto/16 :goto_5

    .line 116
    .line 117
    :cond_3
    invoke-virtual {v1}, La/es;->i()Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    iget-object v1, v1, La/es;->a:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v1, La/sln;

    .line 124
    .line 125
    iget-object v1, v1, La/sln;->a:Ljava/util/List;

    .line 126
    .line 127
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 128
    .line 129
    .line 130
    move-result v10

    .line 131
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 132
    .line 133
    .line 134
    move-result v11

    .line 135
    if-eq v10, v11, :cond_4

    .line 136
    .line 137
    move v0, v2

    .line 138
    move v15, v0

    .line 139
    goto :goto_4

    .line 140
    :cond_4
    new-instance v10, Ljava/util/ArrayList;

    .line 141
    .line 142
    const/16 v11, 0xa

    .line 143
    .line 144
    invoke-static {v0, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 145
    .line 146
    .line 147
    move-result v13

    .line 148
    invoke-direct {v10, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 149
    .line 150
    .line 151
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v13

    .line 159
    if-eqz v13, :cond_5

    .line 160
    .line 161
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v13

    .line 165
    check-cast v13, La/pln;

    .line 166
    .line 167
    iget-wide v14, v13, La/pln;->b:J

    .line 168
    .line 169
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 170
    .line 171
    .line 172
    move-result-object v14

    .line 173
    move v15, v2

    .line 174
    iget-wide v2, v13, La/pln;->c:J

    .line 175
    .line 176
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    new-instance v3, Lkotlin/Pair;

    .line 181
    .line 182
    invoke-direct {v3, v14, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move v2, v15

    .line 189
    goto :goto_2

    .line 190
    :cond_5
    move v15, v2

    .line 191
    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    new-instance v2, Ljava/util/ArrayList;

    .line 196
    .line 197
    invoke-static {v1, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 202
    .line 203
    .line 204
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 209
    .line 210
    .line 211
    move-result v3

    .line 212
    if-eqz v3, :cond_6

    .line 213
    .line 214
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    check-cast v3, La/pln;

    .line 219
    .line 220
    iget-wide v10, v3, La/pln;->b:J

    .line 221
    .line 222
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 223
    .line 224
    .line 225
    move-result-object v10

    .line 226
    iget-wide v13, v3, La/pln;->c:J

    .line 227
    .line 228
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    new-instance v11, Lkotlin/Pair;

    .line 233
    .line 234
    invoke-direct {v11, v10, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    goto :goto_3

    .line 241
    :cond_6
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    xor-int/2addr v0, v15

    .line 250
    :goto_4
    if-eqz v0, :cond_7

    .line 251
    .line 252
    :goto_5
    move v11, v15

    .line 253
    goto :goto_6

    .line 254
    :cond_7
    const/4 v11, 0x0

    .line 255
    :goto_6
    const/16 v16, 0x0

    .line 256
    .line 257
    const/16 v17, 0x7938

    .line 258
    .line 259
    const/4 v10, 0x0

    .line 260
    const/4 v13, 0x0

    .line 261
    const-wide/16 v14, 0x0

    .line 262
    .line 263
    invoke-static/range {v4 .. v17}, La/inn;->a(La/inn;La/q4f;ZLjava/util/List;La/amn;La/v0f;La/nnn;ZZLa/en7;JZI)La/inn;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    return-object v0

    .line 268
    :pswitch_0
    move-object/from16 v1, p1

    .line 269
    .line 270
    check-cast v1, Ljava/lang/Throwable;

    .line 271
    .line 272
    move-object/from16 v2, p2

    .line 273
    .line 274
    check-cast v2, Ljava/lang/String;

    .line 275
    .line 276
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    new-instance v1, La/f4m;

    .line 283
    .line 284
    const/16 v2, 0x18

    .line 285
    .line 286
    invoke-direct {v1, v2}, La/f4m;-><init>(B)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 290
    .line 291
    .line 292
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 293
    .line 294
    return-object v0

    .line 295
    :pswitch_1
    move v15, v2

    .line 296
    move-object/from16 v1, p1

    .line 297
    .line 298
    check-cast v1, Ljava/lang/Throwable;

    .line 299
    .line 300
    move-object/from16 v2, p2

    .line 301
    .line 302
    check-cast v2, Ljava/lang/String;

    .line 303
    .line 304
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v0}, La/wnn;->P()V

    .line 311
    .line 312
    .line 313
    instance-of v2, v1, La/zhi0;

    .line 314
    .line 315
    if-eqz v2, :cond_8

    .line 316
    .line 317
    move-object v3, v1

    .line 318
    check-cast v3, La/zhi0;

    .line 319
    .line 320
    iget-object v3, v3, La/zhi0;->c:La/kuw;

    .line 321
    .line 322
    invoke-interface {v3}, La/kuw;->getErrorCode()I

    .line 323
    .line 324
    .line 325
    move-result v3

    .line 326
    goto :goto_7

    .line 327
    :cond_8
    const/4 v3, 0x0

    .line 328
    :goto_7
    iget-object v4, v0, La/wnn;->y:La/ik4;

    .line 329
    .line 330
    iget-object v5, v0, La/wnn;->E:La/ocl;

    .line 331
    .line 332
    iget-object v5, v5, La/ocl;->a:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast v5, La/vqc;

    .line 335
    .line 336
    invoke-virtual {v5}, La/vqc;->d()La/v0f;

    .line 337
    .line 338
    .line 339
    move-result-object v5

    .line 340
    iget-object v5, v5, La/v0f;->a:Ljava/lang/String;

    .line 341
    .line 342
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    new-instance v6, La/j1p;

    .line 349
    .line 350
    const/4 v7, 0x0

    .line 351
    invoke-direct {v6, v5, v7}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 352
    .line 353
    .line 354
    new-array v5, v15, [La/k1p;

    .line 355
    .line 356
    aput-object v6, v5, v7

    .line 357
    .line 358
    invoke-static {v5}, La/dui0;->c([Ljava/lang/Object;)Ljava/util/Set;

    .line 359
    .line 360
    .line 361
    move-result-object v5

    .line 362
    if-eqz v3, :cond_9

    .line 363
    .line 364
    new-instance v6, La/i1p;

    .line 365
    .line 366
    const/4 v7, 0x2

    .line 367
    invoke-direct {v6, v3, v7}, La/i1p;-><init>(IB)V

    .line 368
    .line 369
    .line 370
    invoke-interface {v5, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    :cond_9
    iget-object v3, v4, La/ik4;->a:La/s1p;

    .line 374
    .line 375
    const-wide/16 v6, 0xc95

    .line 376
    .line 377
    invoke-virtual {v3, v5, v6, v7}, La/s1p;->a(Ljava/util/Set;J)V

    .line 378
    .line 379
    .line 380
    const-string v3, ""

    .line 381
    .line 382
    if-eqz v2, :cond_d

    .line 383
    .line 384
    move-object v2, v1

    .line 385
    check-cast v2, La/zhi0;

    .line 386
    .line 387
    iget-object v2, v2, La/zhi0;->c:La/kuw;

    .line 388
    .line 389
    sget-object v4, La/i2o;->n2:La/i2o;

    .line 390
    .line 391
    iget-object v5, v0, La/wnn;->A:La/ctf0;

    .line 392
    .line 393
    const v6, 0x7f130e5d

    .line 394
    .line 395
    .line 396
    const v7, 0x7f1307bb

    .line 397
    .line 398
    .line 399
    if-ne v2, v4, :cond_b

    .line 400
    .line 401
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    if-nez v1, :cond_a

    .line 406
    .line 407
    move-object v10, v3

    .line 408
    goto :goto_8

    .line 409
    :cond_a
    move-object v10, v1

    .line 410
    :goto_8
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 414
    .line 415
    const/4 v1, 0x0

    .line 416
    new-array v2, v1, [Ljava/lang/Object;

    .line 417
    .line 418
    iget-object v3, v5, La/ctf0;->b:La/lsm0;

    .line 419
    .line 420
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    invoke-virtual {v3, v7, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v9

    .line 428
    new-array v2, v1, [Ljava/lang/Object;

    .line 429
    .line 430
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v2

    .line 434
    invoke-virtual {v3, v6, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v11

    .line 438
    new-array v2, v1, [Ljava/lang/Object;

    .line 439
    .line 440
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    const v2, 0x7f13032f

    .line 445
    .line 446
    .line 447
    invoke-virtual {v3, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v12

    .line 451
    sget-object v17, La/n12;->b:La/n12;

    .line 452
    .line 453
    const/16 v18, 0x0

    .line 454
    .line 455
    const/16 v19, 0x5d0

    .line 456
    .line 457
    const/4 v13, 0x0

    .line 458
    const-string v14, "REQUEST_BET_EXISTS_ERROR_DIALOG_KEY"

    .line 459
    .line 460
    const/4 v15, 0x0

    .line 461
    const/16 v16, 0x0

    .line 462
    .line 463
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 464
    .line 465
    .line 466
    new-instance v1, La/enn;

    .line 467
    .line 468
    invoke-direct {v1, v8}, La/enn;-><init>(Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 472
    .line 473
    .line 474
    goto :goto_b

    .line 475
    :cond_b
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v1

    .line 479
    if-nez v1, :cond_c

    .line 480
    .line 481
    move-object v10, v3

    .line 482
    goto :goto_9

    .line 483
    :cond_c
    move-object v10, v1

    .line 484
    :goto_9
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 485
    .line 486
    .line 487
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 488
    .line 489
    const/4 v1, 0x0

    .line 490
    new-array v2, v1, [Ljava/lang/Object;

    .line 491
    .line 492
    iget-object v3, v5, La/ctf0;->b:La/lsm0;

    .line 493
    .line 494
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v2

    .line 498
    invoke-virtual {v3, v7, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v9

    .line 502
    new-array v2, v1, [Ljava/lang/Object;

    .line 503
    .line 504
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v1

    .line 508
    invoke-virtual {v3, v6, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 509
    .line 510
    .line 511
    move-result-object v11

    .line 512
    sget-object v17, La/n12;->b:La/n12;

    .line 513
    .line 514
    const/16 v18, 0x0

    .line 515
    .line 516
    const/16 v19, 0x5d8

    .line 517
    .line 518
    const/4 v12, 0x0

    .line 519
    const/4 v13, 0x0

    .line 520
    const-string v14, "REQUEST_SAVE_COUPON_ERROR_DIALOG_KEY"

    .line 521
    .line 522
    const/4 v15, 0x0

    .line 523
    const/16 v16, 0x0

    .line 524
    .line 525
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 526
    .line 527
    .line 528
    new-instance v1, La/enn;

    .line 529
    .line 530
    invoke-direct {v1, v8}, La/enn;-><init>(Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 531
    .line 532
    .line 533
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 534
    .line 535
    .line 536
    goto :goto_b

    .line 537
    :cond_d
    instance-of v2, v1, Ljava/net/SocketTimeoutException;

    .line 538
    .line 539
    if-nez v2, :cond_10

    .line 540
    .line 541
    instance-of v2, v1, Ljava/net/UnknownHostException;

    .line 542
    .line 543
    if-eqz v2, :cond_e

    .line 544
    .line 545
    goto :goto_b

    .line 546
    :cond_e
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 547
    .line 548
    .line 549
    move-result-object v1

    .line 550
    if-nez v1, :cond_f

    .line 551
    .line 552
    move-object v6, v3

    .line 553
    goto :goto_a

    .line 554
    :cond_f
    move-object v6, v1

    .line 555
    :goto_a
    sget-object v5, La/rek0;->b:La/rek0;

    .line 556
    .line 557
    new-instance v4, La/xdk0;

    .line 558
    .line 559
    const/4 v10, 0x0

    .line 560
    const/16 v11, 0x7c

    .line 561
    .line 562
    const/4 v7, 0x0

    .line 563
    const/4 v8, 0x0

    .line 564
    const/4 v9, 0x0

    .line 565
    invoke-direct/range {v4 .. v11}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 566
    .line 567
    .line 568
    new-instance v1, La/gnn;

    .line 569
    .line 570
    invoke-direct {v1, v4}, La/gnn;-><init>(La/xdk0;)V

    .line 571
    .line 572
    .line 573
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 574
    .line 575
    .line 576
    :cond_10
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 577
    .line 578
    return-object v0

    .line 579
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
