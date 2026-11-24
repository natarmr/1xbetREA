.class public final synthetic La/eb00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/fb00;


# direct methods
.method public synthetic constructor <init>(La/fb00;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/eb00;->a:B

    iput-object p1, p0, La/eb00;->b:La/fb00;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/eb00;->a:B

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    iget-object v0, v0, La/eb00;->b:La/fb00;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p1

    .line 13
    .line 14
    check-cast v1, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, La/fb00;->a()La/fee;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, La/l800;

    .line 28
    .line 29
    invoke-static {v1}, La/ydx;->W(La/l800;)Ljava/util/ArrayList;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    new-instance v3, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-static {v1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Lkotlin/Pair;

    .line 57
    .line 58
    iget-object v2, v2, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 59
    .line 60
    move-object v4, v2

    .line 61
    check-cast v4, La/d800;

    .line 62
    .line 63
    iget-wide v5, v0, La/fb00;->c:J

    .line 64
    .line 65
    iget-object v2, v0, La/fb00;->f:La/n0o0;

    .line 66
    .line 67
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    check-cast v2, La/fee;

    .line 72
    .line 73
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    move-object v7, v2

    .line 78
    check-cast v7, La/uaq0;

    .line 79
    .line 80
    invoke-virtual {v0}, La/fb00;->a()La/fee;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    check-cast v2, La/l800;

    .line 89
    .line 90
    iget-object v8, v2, La/l800;->b:Ljava/util/List;

    .line 91
    .line 92
    iget-object v2, v0, La/fb00;->g:La/n0o0;

    .line 93
    .line 94
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    check-cast v2, La/fee;

    .line 99
    .line 100
    invoke-virtual {v2}, La/fee;->b()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    check-cast v2, Ljava/lang/Number;

    .line 105
    .line 106
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    int-to-long v9, v2

    .line 111
    invoke-static/range {v4 .. v10}, La/xdx;->K(La/d800;JLa/uaq0;Ljava/util/List;J)La/ra00;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_0
    invoke-static {v3}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    return-object v0

    .line 124
    :pswitch_0
    move-object/from16 v1, p1

    .line 125
    .line 126
    check-cast v1, La/l800;

    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, La/fb00;->a()La/fee;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    check-cast v1, La/l800;

    .line 140
    .line 141
    iget-object v1, v1, La/l800;->b:Ljava/util/List;

    .line 142
    .line 143
    invoke-static {v1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    invoke-static {v3}, La/wp20;->a(I)I

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    const/16 v4, 0x10

    .line 152
    .line 153
    if-ge v3, v4, :cond_1

    .line 154
    .line 155
    move v3, v4

    .line 156
    :cond_1
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 157
    .line 158
    invoke-direct {v4, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 159
    .line 160
    .line 161
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    if-eqz v3, :cond_2

    .line 170
    .line 171
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    move-object v5, v3

    .line 176
    check-cast v5, La/b9a0;

    .line 177
    .line 178
    iget-object v5, v5, La/b9a0;->a:Ljava/lang/String;

    .line 179
    .line 180
    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_2
    invoke-virtual {v0}, La/fb00;->a()La/fee;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    check-cast v1, La/l800;

    .line 193
    .line 194
    invoke-static {v1}, La/ydx;->W(La/l800;)Ljava/util/ArrayList;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    new-instance v3, Ljava/util/ArrayList;

    .line 199
    .line 200
    invoke-static {v1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 201
    .line 202
    .line 203
    move-result v5

    .line 204
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 212
    .line 213
    .line 214
    move-result v5

    .line 215
    if-eqz v5, :cond_14

    .line 216
    .line 217
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    check-cast v5, Lkotlin/Pair;

    .line 222
    .line 223
    iget-object v6, v5, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v6, Ljava/lang/String;

    .line 226
    .line 227
    iget-object v5, v5, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast v5, La/d800;

    .line 230
    .line 231
    new-instance v7, La/ynp0;

    .line 232
    .line 233
    iget-object v8, v0, La/fb00;->a:La/ctf0;

    .line 234
    .line 235
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 236
    .line 237
    .line 238
    move-result-object v9

    .line 239
    iget-object v10, v5, La/d800;->b:Ljava/util/List;

    .line 240
    .line 241
    iget-object v5, v5, La/d800;->c:Ljava/util/List;

    .line 242
    .line 243
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 244
    .line 245
    .line 246
    move-result-object v10

    .line 247
    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 248
    .line 249
    .line 250
    move-result v11

    .line 251
    const-string v13, "_"

    .line 252
    .line 253
    const-string v15, ""

    .line 254
    .line 255
    const/16 p0, 0x0

    .line 256
    .line 257
    if-eqz v11, :cond_b

    .line 258
    .line 259
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v11

    .line 263
    check-cast v11, La/u800;

    .line 264
    .line 265
    const/16 p1, 0x1

    .line 266
    .line 267
    iget-object v14, v11, La/u800;->a:Ljava/lang/String;

    .line 268
    .line 269
    new-instance v12, La/ja00;

    .line 270
    .line 271
    invoke-direct {v12, v14}, La/ja00;-><init>(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v9, v12}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    iget-object v11, v11, La/u800;->b:Ljava/util/List;

    .line 278
    .line 279
    new-instance v12, Ljava/util/ArrayList;

    .line 280
    .line 281
    invoke-static {v11, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 282
    .line 283
    .line 284
    move-result v14

    .line 285
    invoke-direct {v12, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 286
    .line 287
    .line 288
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 289
    .line 290
    .line 291
    move-result-object v14

    .line 292
    const/4 v2, 0x0

    .line 293
    :goto_4
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 294
    .line 295
    .line 296
    move-result v16

    .line 297
    if-eqz v16, :cond_a

    .line 298
    .line 299
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v16

    .line 303
    add-int/lit8 v17, v2, 0x1

    .line 304
    .line 305
    if-ltz v2, :cond_9

    .line 306
    .line 307
    move-object/from16 v18, v0

    .line 308
    .line 309
    move-object/from16 v0, v16

    .line 310
    .line 311
    check-cast v0, La/m800;

    .line 312
    .line 313
    move-object/from16 v16, v1

    .line 314
    .line 315
    iget-object v1, v0, La/m800;->a:Ljava/lang/String;

    .line 316
    .line 317
    move-object/from16 v25, v10

    .line 318
    .line 319
    iget-object v10, v0, La/m800;->a:Ljava/lang/String;

    .line 320
    .line 321
    invoke-virtual {v4, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    check-cast v1, La/b9a0;

    .line 326
    .line 327
    move-object/from16 v26, v11

    .line 328
    .line 329
    if-eqz v1, :cond_3

    .line 330
    .line 331
    iget-object v11, v1, La/b9a0;->b:Ljava/lang/String;

    .line 332
    .line 333
    goto :goto_5

    .line 334
    :cond_3
    move-object/from16 v11, p0

    .line 335
    .line 336
    :goto_5
    if-nez v11, :cond_4

    .line 337
    .line 338
    move-object v11, v15

    .line 339
    :cond_4
    iget v0, v0, La/m800;->d:I

    .line 340
    .line 341
    if-lez v0, :cond_5

    .line 342
    .line 343
    move-object/from16 v27, v14

    .line 344
    .line 345
    const-string v14, ". "

    .line 346
    .line 347
    invoke-static {v0, v14, v11}, La/dw9;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v11

    .line 351
    :goto_6
    move-object/from16 v22, v11

    .line 352
    .line 353
    goto :goto_7

    .line 354
    :cond_5
    move-object/from16 v27, v14

    .line 355
    .line 356
    goto :goto_6

    .line 357
    :goto_7
    if-eqz v1, :cond_6

    .line 358
    .line 359
    iget-object v0, v1, La/b9a0;->f:Ljava/lang/String;

    .line 360
    .line 361
    goto :goto_8

    .line 362
    :cond_6
    move-object/from16 v0, p0

    .line 363
    .line 364
    :goto_8
    if-nez v0, :cond_7

    .line 365
    .line 366
    move-object/from16 v24, v15

    .line 367
    .line 368
    goto :goto_9

    .line 369
    :cond_7
    move-object/from16 v24, v0

    .line 370
    .line 371
    :goto_9
    invoke-interface/range {v26 .. v26}, Ljava/util/List;->size()I

    .line 372
    .line 373
    .line 374
    move-result v0

    .line 375
    add-int/lit8 v0, v0, -0x1

    .line 376
    .line 377
    if-ne v2, v0, :cond_8

    .line 378
    .line 379
    move/from16 v23, p1

    .line 380
    .line 381
    goto :goto_a

    .line 382
    :cond_8
    const/16 v23, 0x0

    .line 383
    .line 384
    :goto_a
    new-instance v0, Ljava/lang/StringBuilder;

    .line 385
    .line 386
    invoke-direct {v0, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v20

    .line 399
    new-instance v19, La/ia00;

    .line 400
    .line 401
    move-object/from16 v21, v10

    .line 402
    .line 403
    invoke-direct/range {v19 .. v24}, La/ia00;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 404
    .line 405
    .line 406
    move-object/from16 v0, v19

    .line 407
    .line 408
    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 409
    .line 410
    .line 411
    move-object/from16 v1, v16

    .line 412
    .line 413
    move/from16 v2, v17

    .line 414
    .line 415
    move-object/from16 v0, v18

    .line 416
    .line 417
    move-object/from16 v10, v25

    .line 418
    .line 419
    move-object/from16 v11, v26

    .line 420
    .line 421
    move-object/from16 v14, v27

    .line 422
    .line 423
    goto/16 :goto_4

    .line 424
    .line 425
    :cond_9
    invoke-static {}, La/q3d;->p()V

    .line 426
    .line 427
    .line 428
    throw p0

    .line 429
    :cond_a
    move-object/from16 v18, v0

    .line 430
    .line 431
    move-object/from16 v16, v1

    .line 432
    .line 433
    move-object/from16 v25, v10

    .line 434
    .line 435
    invoke-virtual {v9, v12}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 436
    .line 437
    .line 438
    const/16 v2, 0xa

    .line 439
    .line 440
    goto/16 :goto_3

    .line 441
    .line 442
    :cond_b
    move-object/from16 v18, v0

    .line 443
    .line 444
    move-object/from16 v16, v1

    .line 445
    .line 446
    const/16 p1, 0x1

    .line 447
    .line 448
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 449
    .line 450
    .line 451
    move-result v0

    .line 452
    if-nez v0, :cond_13

    .line 453
    .line 454
    const/4 v0, 0x0

    .line 455
    new-array v1, v0, [Ljava/lang/Object;

    .line 456
    .line 457
    iget-object v2, v8, La/ctf0;->b:La/lsm0;

    .line 458
    .line 459
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v1

    .line 463
    const v8, 0x7f130d32

    .line 464
    .line 465
    .line 466
    invoke-virtual {v2, v8, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v1

    .line 470
    new-instance v2, La/ja00;

    .line 471
    .line 472
    invoke-direct {v2, v1}, La/ja00;-><init>(Ljava/lang/String;)V

    .line 473
    .line 474
    .line 475
    invoke-virtual {v9, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 476
    .line 477
    .line 478
    new-instance v1, Ljava/util/ArrayList;

    .line 479
    .line 480
    const/16 v2, 0xa

    .line 481
    .line 482
    invoke-static {v5, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 483
    .line 484
    .line 485
    move-result v8

    .line 486
    invoke-direct {v1, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 487
    .line 488
    .line 489
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 490
    .line 491
    .line 492
    move-result-object v2

    .line 493
    move v8, v0

    .line 494
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 495
    .line 496
    .line 497
    move-result v10

    .line 498
    if-eqz v10, :cond_12

    .line 499
    .line 500
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v10

    .line 504
    add-int/lit8 v11, v8, 0x1

    .line 505
    .line 506
    if-ltz v8, :cond_11

    .line 507
    .line 508
    check-cast v10, La/h800;

    .line 509
    .line 510
    iget-object v12, v10, La/h800;->a:Ljava/lang/String;

    .line 511
    .line 512
    invoke-virtual {v4, v12}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v12

    .line 516
    check-cast v12, La/b9a0;

    .line 517
    .line 518
    if-eqz v12, :cond_c

    .line 519
    .line 520
    iget-object v14, v12, La/b9a0;->b:Ljava/lang/String;

    .line 521
    .line 522
    goto :goto_c

    .line 523
    :cond_c
    move-object/from16 v14, p0

    .line 524
    .line 525
    :goto_c
    if-nez v14, :cond_d

    .line 526
    .line 527
    move-object/from16 v22, v15

    .line 528
    .line 529
    goto :goto_d

    .line 530
    :cond_d
    move-object/from16 v22, v14

    .line 531
    .line 532
    :goto_d
    if-eqz v12, :cond_e

    .line 533
    .line 534
    iget-object v12, v12, La/b9a0;->f:Ljava/lang/String;

    .line 535
    .line 536
    goto :goto_e

    .line 537
    :cond_e
    move-object/from16 v12, p0

    .line 538
    .line 539
    :goto_e
    if-nez v12, :cond_f

    .line 540
    .line 541
    move-object/from16 v24, v15

    .line 542
    .line 543
    goto :goto_f

    .line 544
    :cond_f
    move-object/from16 v24, v12

    .line 545
    .line 546
    :goto_f
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 547
    .line 548
    .line 549
    move-result v12

    .line 550
    add-int/lit8 v12, v12, -0x1

    .line 551
    .line 552
    if-ne v8, v12, :cond_10

    .line 553
    .line 554
    move/from16 v23, p1

    .line 555
    .line 556
    goto :goto_10

    .line 557
    :cond_10
    move/from16 v23, v0

    .line 558
    .line 559
    :goto_10
    iget-object v10, v10, La/h800;->a:Ljava/lang/String;

    .line 560
    .line 561
    new-instance v12, Ljava/lang/StringBuilder;

    .line 562
    .line 563
    invoke-direct {v12, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 564
    .line 565
    .line 566
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 567
    .line 568
    .line 569
    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 570
    .line 571
    .line 572
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v20

    .line 576
    new-instance v19, La/ia00;

    .line 577
    .line 578
    move-object/from16 v21, v10

    .line 579
    .line 580
    invoke-direct/range {v19 .. v24}, La/ia00;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 581
    .line 582
    .line 583
    move-object/from16 v8, v19

    .line 584
    .line 585
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 586
    .line 587
    .line 588
    move v8, v11

    .line 589
    goto :goto_b

    .line 590
    :cond_11
    invoke-static {}, La/q3d;->p()V

    .line 591
    .line 592
    .line 593
    throw p0

    .line 594
    :cond_12
    invoke-virtual {v9, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 595
    .line 596
    .line 597
    :cond_13
    invoke-static {v9}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    invoke-direct {v7, v0, v6}, La/ynp0;-><init>(La/a4x;Ljava/lang/String;)V

    .line 606
    .line 607
    .line 608
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 609
    .line 610
    .line 611
    move-object/from16 v1, v16

    .line 612
    .line 613
    move-object/from16 v0, v18

    .line 614
    .line 615
    const/16 v2, 0xa

    .line 616
    .line 617
    goto/16 :goto_2

    .line 618
    .line 619
    :cond_14
    invoke-static {v3}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    return-object v0

    .line 624
    :pswitch_1
    move-object/from16 v18, v0

    .line 625
    .line 626
    move-object/from16 v0, p1

    .line 627
    .line 628
    check-cast v0, La/l800;

    .line 629
    .line 630
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 631
    .line 632
    .line 633
    invoke-virtual/range {v18 .. v18}, La/fb00;->a()La/fee;

    .line 634
    .line 635
    .line 636
    move-result-object v0

    .line 637
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    move-result-object v0

    .line 641
    check-cast v0, La/l800;

    .line 642
    .line 643
    invoke-static {v0}, La/ydx;->W(La/l800;)Ljava/util/ArrayList;

    .line 644
    .line 645
    .line 646
    move-result-object v0

    .line 647
    new-instance v1, Ljava/util/ArrayList;

    .line 648
    .line 649
    const/16 v2, 0xa

    .line 650
    .line 651
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 652
    .line 653
    .line 654
    move-result v2

    .line 655
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 659
    .line 660
    .line 661
    move-result-object v0

    .line 662
    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 663
    .line 664
    .line 665
    move-result v2

    .line 666
    if-eqz v2, :cond_15

    .line 667
    .line 668
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    move-result-object v2

    .line 672
    check-cast v2, Lkotlin/Pair;

    .line 673
    .line 674
    iget-object v2, v2, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 675
    .line 676
    check-cast v2, Ljava/lang/String;

    .line 677
    .line 678
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 679
    .line 680
    .line 681
    goto :goto_11

    .line 682
    :cond_15
    invoke-static {v1}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 683
    .line 684
    .line 685
    move-result-object v0

    .line 686
    return-object v0

    .line 687
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
