.class public final La/cku;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kmq;

.field public final synthetic c:J

.field public final synthetic d:Ljava/util/List;

.field public final synthetic e:Ljava/util/List;

.field public final synthetic f:Z

.field public final synthetic g:Z

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/kmq;Ljava/lang/Object;JLjava/util/List;Ljava/util/List;ZZB)V
    .locals 0

    .line 1
    iput-byte p9, p0, La/cku;->a:B

    iput-object p1, p0, La/cku;->b:La/kmq;

    iput-object p2, p0, La/cku;->h:Ljava/lang/Object;

    iput-wide p3, p0, La/cku;->c:J

    iput-object p5, p0, La/cku;->d:Ljava/util/List;

    iput-object p6, p0, La/cku;->e:Ljava/util/List;

    iput-boolean p7, p0, La/cku;->f:Z

    iput-boolean p8, p0, La/cku;->g:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-byte v2, v0, La/cku;->a:B

    .line 6
    .line 7
    iget-boolean v4, v0, La/cku;->g:Z

    .line 8
    .line 9
    iget-object v5, v0, La/cku;->b:La/kmq;

    .line 10
    .line 11
    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    .line 12
    .line 13
    iget-object v7, v0, La/cku;->h:Ljava/lang/Object;

    .line 14
    .line 15
    const/4 v8, 0x1

    .line 16
    const/high16 v9, -0x80000000

    .line 17
    .line 18
    const/16 v10, 0xa

    .line 19
    .line 20
    iget-wide v11, v0, La/cku;->c:J

    .line 21
    .line 22
    packed-switch v2, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    check-cast v7, La/f7u;

    .line 26
    .line 27
    iget-object v2, v7, La/f7u;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v2, La/j1q0;

    .line 30
    .line 31
    iget-object v7, v7, La/f7u;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v7, La/rr20;

    .line 34
    .line 35
    instance-of v14, v1, La/jku;

    .line 36
    .line 37
    if-eqz v14, :cond_0

    .line 38
    .line 39
    move-object v14, v1

    .line 40
    check-cast v14, La/jku;

    .line 41
    .line 42
    iget v15, v14, La/jku;->j:I

    .line 43
    .line 44
    and-int v16, v15, v9

    .line 45
    .line 46
    if-eqz v16, :cond_0

    .line 47
    .line 48
    sub-int/2addr v15, v9

    .line 49
    iput v15, v14, La/jku;->j:I

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    new-instance v14, La/jku;

    .line 53
    .line 54
    invoke-direct {v14, v0, v1}, La/jku;-><init>(La/cku;La/yje;)V

    .line 55
    .line 56
    .line 57
    :goto_0
    iget-object v1, v14, La/jku;->i:Ljava/lang/Object;

    .line 58
    .line 59
    sget-object v15, La/wne;->a:La/wne;

    .line 60
    .line 61
    iget v9, v14, La/jku;->j:I

    .line 62
    .line 63
    if-eqz v9, :cond_2

    .line 64
    .line 65
    if-ne v9, v8, :cond_1

    .line 66
    .line 67
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto/16 :goto_9

    .line 71
    .line 72
    :cond_1
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const/4 v13, 0x0

    .line 76
    goto/16 :goto_a

    .line 77
    .line 78
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    move-object/from16 v1, p1

    .line 82
    .line 83
    check-cast v1, Ljava/util/List;

    .line 84
    .line 85
    new-instance v6, Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-static {v1, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 88
    .line 89
    .line 90
    move-result v9

    .line 91
    invoke-direct {v6, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 92
    .line 93
    .line 94
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    if-eqz v9, :cond_a

    .line 103
    .line 104
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v9

    .line 108
    check-cast v9, La/xm7;

    .line 109
    .line 110
    iget-object v3, v7, La/rr20;->a:La/x2b;

    .line 111
    .line 112
    invoke-virtual {v3, v11, v12}, La/x2b;->c(J)La/p7m0;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    check-cast v3, Ljava/util/List;

    .line 121
    .line 122
    if-nez v3, :cond_3

    .line 123
    .line 124
    sget-object v3, La/iun;->a:La/iun;

    .line 125
    .line 126
    :cond_3
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v17

    .line 134
    if-eqz v17, :cond_5

    .line 135
    .line 136
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v17

    .line 140
    move-object/from16 v13, v17

    .line 141
    .line 142
    check-cast v13, La/wr20;

    .line 143
    .line 144
    move-wide/from16 v18, v11

    .line 145
    .line 146
    iget-wide v10, v13, La/wr20;->b:J

    .line 147
    .line 148
    iget-wide v12, v9, La/xm7;->b:J

    .line 149
    .line 150
    cmp-long v10, v10, v12

    .line 151
    .line 152
    if-nez v10, :cond_4

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_4
    move-wide/from16 v11, v18

    .line 156
    .line 157
    const/16 v10, 0xa

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_5
    move-wide/from16 v18, v11

    .line 161
    .line 162
    const/16 v17, 0x0

    .line 163
    .line 164
    :goto_3
    move-object/from16 v3, v17

    .line 165
    .line 166
    check-cast v3, La/wr20;

    .line 167
    .line 168
    if-eqz v3, :cond_6

    .line 169
    .line 170
    iget-object v3, v3, La/wr20;->a:Ljava/util/ArrayList;

    .line 171
    .line 172
    :goto_4
    move-object/from16 v21, v3

    .line 173
    .line 174
    goto :goto_5

    .line 175
    :cond_6
    sget-object v3, La/iun;->a:La/iun;

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :goto_5
    iget-object v3, v9, La/xm7;->a:Ljava/util/ArrayList;

    .line 179
    .line 180
    new-instance v10, Ljava/util/ArrayList;

    .line 181
    .line 182
    const/16 v11, 0xa

    .line 183
    .line 184
    invoke-static {v3, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 185
    .line 186
    .line 187
    move-result v12

    .line 188
    invoke-direct {v10, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 196
    .line 197
    .line 198
    move-result v11

    .line 199
    if-eqz v11, :cond_9

    .line 200
    .line 201
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v11

    .line 205
    move-object/from16 v20, v11

    .line 206
    .line 207
    check-cast v20, La/h07;

    .line 208
    .line 209
    iget-object v11, v2, La/j1q0;->a:La/m1q0;

    .line 210
    .line 211
    invoke-virtual {v11}, La/m1q0;->j()Z

    .line 212
    .line 213
    .line 214
    move-result v24

    .line 215
    iget-object v11, v2, La/j1q0;->a:La/m1q0;

    .line 216
    .line 217
    invoke-virtual {v11}, La/m1q0;->f()Z

    .line 218
    .line 219
    .line 220
    move-result v11

    .line 221
    if-nez v11, :cond_8

    .line 222
    .line 223
    if-eqz v4, :cond_7

    .line 224
    .line 225
    goto :goto_7

    .line 226
    :cond_7
    const/16 v26, 0x0

    .line 227
    .line 228
    goto :goto_8

    .line 229
    :cond_8
    :goto_7
    move/from16 v26, v8

    .line 230
    .line 231
    :goto_8
    iget-object v11, v0, La/cku;->d:Ljava/util/List;

    .line 232
    .line 233
    iget-object v12, v0, La/cku;->e:Ljava/util/List;

    .line 234
    .line 235
    iget-boolean v13, v0, La/cku;->f:Z

    .line 236
    .line 237
    move-object/from16 v22, v11

    .line 238
    .line 239
    move-object/from16 v23, v12

    .line 240
    .line 241
    move/from16 v25, v13

    .line 242
    .line 243
    invoke-static/range {v20 .. v26}, La/vdx;->c0(La/h07;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZ)La/sr20;

    .line 244
    .line 245
    .line 246
    move-result-object v11

    .line 247
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    goto :goto_6

    .line 251
    :cond_9
    iget-wide v11, v9, La/xm7;->b:J

    .line 252
    .line 253
    iget-object v3, v9, La/xm7;->c:Ljava/lang/String;

    .line 254
    .line 255
    new-instance v9, La/wr20;

    .line 256
    .line 257
    invoke-direct {v9, v11, v12, v3, v10}, La/wr20;-><init>(JLjava/lang/String;Ljava/util/ArrayList;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-wide/from16 v11, v18

    .line 264
    .line 265
    const/16 v10, 0xa

    .line 266
    .line 267
    goto/16 :goto_1

    .line 268
    .line 269
    :cond_a
    move-wide/from16 v18, v11

    .line 270
    .line 271
    iget-object v0, v7, La/rr20;->a:La/x2b;

    .line 272
    .line 273
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    move-wide/from16 v2, v18

    .line 277
    .line 278
    invoke-virtual {v0, v2, v3}, La/x2b;->c(J)La/p7m0;

    .line 279
    .line 280
    .line 281
    move-result-object v10

    .line 282
    :cond_b
    invoke-virtual {v10}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    move-object v1, v0

    .line 287
    check-cast v1, Ljava/util/List;

    .line 288
    .line 289
    invoke-virtual {v10, v0, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    if-eqz v0, :cond_b

    .line 294
    .line 295
    iput v8, v14, La/jku;->j:I

    .line 296
    .line 297
    invoke-interface {v5, v6, v14}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    if-ne v0, v15, :cond_c

    .line 302
    .line 303
    move-object v13, v15

    .line 304
    goto :goto_a

    .line 305
    :cond_c
    :goto_9
    sget-object v13, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 306
    .line 307
    :goto_a
    return-object v13

    .line 308
    :pswitch_0
    move-wide v2, v11

    .line 309
    check-cast v7, La/dgu;

    .line 310
    .line 311
    iget-object v10, v7, La/dgu;->d:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v10, La/j1q0;

    .line 314
    .line 315
    iget-object v7, v7, La/dgu;->a:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast v7, La/p530;

    .line 318
    .line 319
    instance-of v11, v1, La/gku;

    .line 320
    .line 321
    if-eqz v11, :cond_d

    .line 322
    .line 323
    move-object v11, v1

    .line 324
    check-cast v11, La/gku;

    .line 325
    .line 326
    iget v12, v11, La/gku;->j:I

    .line 327
    .line 328
    and-int v13, v12, v9

    .line 329
    .line 330
    if-eqz v13, :cond_d

    .line 331
    .line 332
    sub-int/2addr v12, v9

    .line 333
    iput v12, v11, La/gku;->j:I

    .line 334
    .line 335
    goto :goto_b

    .line 336
    :cond_d
    new-instance v11, La/gku;

    .line 337
    .line 338
    invoke-direct {v11, v0, v1}, La/gku;-><init>(La/cku;La/yje;)V

    .line 339
    .line 340
    .line 341
    :goto_b
    iget-object v1, v11, La/gku;->i:Ljava/lang/Object;

    .line 342
    .line 343
    sget-object v12, La/wne;->a:La/wne;

    .line 344
    .line 345
    iget v9, v11, La/gku;->j:I

    .line 346
    .line 347
    if-eqz v9, :cond_f

    .line 348
    .line 349
    if-ne v9, v8, :cond_e

    .line 350
    .line 351
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    goto/16 :goto_f

    .line 355
    .line 356
    :cond_e
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    const/4 v13, 0x0

    .line 360
    goto/16 :goto_10

    .line 361
    .line 362
    :cond_f
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    move-object/from16 v1, p1

    .line 366
    .line 367
    check-cast v1, Ljava/util/List;

    .line 368
    .line 369
    iget-object v6, v7, La/p530;->a:La/m530;

    .line 370
    .line 371
    invoke-virtual {v6, v2, v3}, La/m530;->b(J)La/p7m0;

    .line 372
    .line 373
    .line 374
    move-result-object v6

    .line 375
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v6

    .line 379
    check-cast v6, Ljava/util/List;

    .line 380
    .line 381
    if-nez v6, :cond_10

    .line 382
    .line 383
    sget-object v6, La/iun;->a:La/iun;

    .line 384
    .line 385
    :cond_10
    move-object/from16 v19, v6

    .line 386
    .line 387
    new-instance v13, Ljava/util/ArrayList;

    .line 388
    .line 389
    const/16 v6, 0xa

    .line 390
    .line 391
    invoke-static {v1, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 392
    .line 393
    .line 394
    move-result v6

    .line 395
    invoke-direct {v13, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 396
    .line 397
    .line 398
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 403
    .line 404
    .line 405
    move-result v6

    .line 406
    if-eqz v6, :cond_13

    .line 407
    .line 408
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v6

    .line 412
    move-object/from16 v18, v6

    .line 413
    .line 414
    check-cast v18, La/h07;

    .line 415
    .line 416
    iget-object v6, v10, La/j1q0;->a:La/m1q0;

    .line 417
    .line 418
    invoke-virtual {v6}, La/m1q0;->j()Z

    .line 419
    .line 420
    .line 421
    move-result v22

    .line 422
    iget-object v6, v10, La/j1q0;->a:La/m1q0;

    .line 423
    .line 424
    invoke-virtual {v6}, La/m1q0;->f()Z

    .line 425
    .line 426
    .line 427
    move-result v6

    .line 428
    if-nez v6, :cond_12

    .line 429
    .line 430
    if-eqz v4, :cond_11

    .line 431
    .line 432
    goto :goto_d

    .line 433
    :cond_11
    const/16 v24, 0x0

    .line 434
    .line 435
    goto :goto_e

    .line 436
    :cond_12
    :goto_d
    move/from16 v24, v8

    .line 437
    .line 438
    :goto_e
    iget-object v6, v0, La/cku;->d:Ljava/util/List;

    .line 439
    .line 440
    iget-object v9, v0, La/cku;->e:Ljava/util/List;

    .line 441
    .line 442
    iget-boolean v14, v0, La/cku;->f:Z

    .line 443
    .line 444
    move-object/from16 v20, v6

    .line 445
    .line 446
    move-object/from16 v21, v9

    .line 447
    .line 448
    move/from16 v23, v14

    .line 449
    .line 450
    invoke-static/range {v18 .. v24}, La/vdx;->c0(La/h07;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZ)La/sr20;

    .line 451
    .line 452
    .line 453
    move-result-object v6

    .line 454
    invoke-virtual {v13, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    goto :goto_c

    .line 458
    :cond_13
    iget-object v0, v7, La/p530;->a:La/m530;

    .line 459
    .line 460
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v0, v2, v3}, La/m530;->b(J)La/p7m0;

    .line 464
    .line 465
    .line 466
    move-result-object v10

    .line 467
    :cond_14
    invoke-virtual {v10}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    move-object v1, v0

    .line 472
    check-cast v1, Ljava/util/List;

    .line 473
    .line 474
    invoke-virtual {v10, v0, v13}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 475
    .line 476
    .line 477
    move-result v0

    .line 478
    if-eqz v0, :cond_14

    .line 479
    .line 480
    iput v8, v11, La/gku;->j:I

    .line 481
    .line 482
    invoke-interface {v5, v13, v11}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    if-ne v0, v12, :cond_15

    .line 487
    .line 488
    move-object v13, v12

    .line 489
    goto :goto_10

    .line 490
    :cond_15
    :goto_f
    sget-object v13, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 491
    .line 492
    :goto_10
    return-object v13

    .line 493
    :pswitch_1
    move-wide v2, v11

    .line 494
    check-cast v7, La/f7u;

    .line 495
    .line 496
    iget-object v10, v7, La/f7u;->c:Ljava/lang/Object;

    .line 497
    .line 498
    check-cast v10, La/j1q0;

    .line 499
    .line 500
    iget-object v7, v7, La/f7u;->b:Ljava/lang/Object;

    .line 501
    .line 502
    check-cast v7, La/p530;

    .line 503
    .line 504
    instance-of v11, v1, La/bku;

    .line 505
    .line 506
    if-eqz v11, :cond_16

    .line 507
    .line 508
    move-object v11, v1

    .line 509
    check-cast v11, La/bku;

    .line 510
    .line 511
    iget v12, v11, La/bku;->j:I

    .line 512
    .line 513
    and-int v13, v12, v9

    .line 514
    .line 515
    if-eqz v13, :cond_16

    .line 516
    .line 517
    sub-int/2addr v12, v9

    .line 518
    iput v12, v11, La/bku;->j:I

    .line 519
    .line 520
    goto :goto_11

    .line 521
    :cond_16
    new-instance v11, La/bku;

    .line 522
    .line 523
    invoke-direct {v11, v0, v1}, La/bku;-><init>(La/cku;La/yje;)V

    .line 524
    .line 525
    .line 526
    :goto_11
    iget-object v1, v11, La/bku;->i:Ljava/lang/Object;

    .line 527
    .line 528
    sget-object v9, La/wne;->a:La/wne;

    .line 529
    .line 530
    iget v12, v11, La/bku;->j:I

    .line 531
    .line 532
    if-eqz v12, :cond_18

    .line 533
    .line 534
    if-ne v12, v8, :cond_17

    .line 535
    .line 536
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 537
    .line 538
    .line 539
    goto/16 :goto_15

    .line 540
    .line 541
    :cond_17
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    const/4 v13, 0x0

    .line 545
    goto/16 :goto_16

    .line 546
    .line 547
    :cond_18
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 548
    .line 549
    .line 550
    move-object/from16 v1, p1

    .line 551
    .line 552
    check-cast v1, Ljava/util/List;

    .line 553
    .line 554
    iget-object v6, v7, La/p530;->a:La/m530;

    .line 555
    .line 556
    invoke-virtual {v6, v2, v3}, La/m530;->b(J)La/p7m0;

    .line 557
    .line 558
    .line 559
    move-result-object v6

    .line 560
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v6

    .line 564
    check-cast v6, Ljava/util/List;

    .line 565
    .line 566
    if-nez v6, :cond_19

    .line 567
    .line 568
    sget-object v6, La/iun;->a:La/iun;

    .line 569
    .line 570
    :cond_19
    move-object/from16 v19, v6

    .line 571
    .line 572
    new-instance v6, Ljava/util/ArrayList;

    .line 573
    .line 574
    const/16 v12, 0xa

    .line 575
    .line 576
    invoke-static {v1, v12}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 577
    .line 578
    .line 579
    move-result v12

    .line 580
    invoke-direct {v6, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 581
    .line 582
    .line 583
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 584
    .line 585
    .line 586
    move-result-object v1

    .line 587
    :goto_12
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 588
    .line 589
    .line 590
    move-result v12

    .line 591
    if-eqz v12, :cond_1c

    .line 592
    .line 593
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    move-result-object v12

    .line 597
    move-object/from16 v18, v12

    .line 598
    .line 599
    check-cast v18, La/h07;

    .line 600
    .line 601
    iget-object v12, v10, La/j1q0;->a:La/m1q0;

    .line 602
    .line 603
    invoke-virtual {v12}, La/m1q0;->j()Z

    .line 604
    .line 605
    .line 606
    move-result v22

    .line 607
    iget-object v12, v10, La/j1q0;->a:La/m1q0;

    .line 608
    .line 609
    invoke-virtual {v12}, La/m1q0;->f()Z

    .line 610
    .line 611
    .line 612
    move-result v12

    .line 613
    if-nez v12, :cond_1b

    .line 614
    .line 615
    if-eqz v4, :cond_1a

    .line 616
    .line 617
    goto :goto_13

    .line 618
    :cond_1a
    const/16 v24, 0x0

    .line 619
    .line 620
    goto :goto_14

    .line 621
    :cond_1b
    :goto_13
    move/from16 v24, v8

    .line 622
    .line 623
    :goto_14
    iget-object v12, v0, La/cku;->d:Ljava/util/List;

    .line 624
    .line 625
    iget-object v13, v0, La/cku;->e:Ljava/util/List;

    .line 626
    .line 627
    iget-boolean v14, v0, La/cku;->f:Z

    .line 628
    .line 629
    move-object/from16 v20, v12

    .line 630
    .line 631
    move-object/from16 v21, v13

    .line 632
    .line 633
    move/from16 v23, v14

    .line 634
    .line 635
    invoke-static/range {v18 .. v24}, La/vdx;->c0(La/h07;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZ)La/sr20;

    .line 636
    .line 637
    .line 638
    move-result-object v12

    .line 639
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 640
    .line 641
    .line 642
    goto :goto_12

    .line 643
    :cond_1c
    iget-object v0, v7, La/p530;->a:La/m530;

    .line 644
    .line 645
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 646
    .line 647
    .line 648
    invoke-virtual {v0, v2, v3}, La/m530;->b(J)La/p7m0;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    :cond_1d
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object v1

    .line 656
    move-object v2, v1

    .line 657
    check-cast v2, Ljava/util/List;

    .line 658
    .line 659
    invoke-virtual {v0, v1, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 660
    .line 661
    .line 662
    move-result v1

    .line 663
    if-eqz v1, :cond_1d

    .line 664
    .line 665
    iput v8, v11, La/bku;->j:I

    .line 666
    .line 667
    invoke-interface {v5, v6, v11}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    if-ne v0, v9, :cond_1e

    .line 672
    .line 673
    move-object v13, v9

    .line 674
    goto :goto_16

    .line 675
    :cond_1e
    :goto_15
    sget-object v13, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 676
    .line 677
    :goto_16
    return-object v13

    .line 678
    nop

    .line 679
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
