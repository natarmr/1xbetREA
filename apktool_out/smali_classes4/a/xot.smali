.class public final La/xot;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kmq;

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(La/kmq;Ljava/util/List;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/xot;->a:B

    iput-object p1, p0, La/xot;->b:La/kmq;

    iput-object p2, p0, La/xot;->c:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 15

    .line 1
    move-object/from16 v1, p2

    .line 2
    .line 3
    iget-byte v2, p0, La/xot;->a:B

    .line 4
    .line 5
    const/16 v3, 0xa

    .line 6
    .line 7
    iget-object v4, p0, La/xot;->c:Ljava/util/List;

    .line 8
    .line 9
    iget-object v5, p0, La/xot;->b:La/kmq;

    .line 10
    .line 11
    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    .line 12
    .line 13
    const/high16 v7, -0x80000000

    .line 14
    .line 15
    const/4 v8, 0x1

    .line 16
    packed-switch v2, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    instance-of v2, v1, La/i700;

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    move-object v2, v1

    .line 24
    check-cast v2, La/i700;

    .line 25
    .line 26
    iget v3, v2, La/i700;->j:I

    .line 27
    .line 28
    and-int v10, v3, v7

    .line 29
    .line 30
    if-eqz v10, :cond_0

    .line 31
    .line 32
    sub-int/2addr v3, v7

    .line 33
    iput v3, v2, La/i700;->j:I

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance v2, La/i700;

    .line 37
    .line 38
    invoke-direct {v2, p0, v1}, La/i700;-><init>(La/xot;La/yje;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    iget-object v0, v2, La/i700;->i:Ljava/lang/Object;

    .line 42
    .line 43
    sget-object v1, La/wne;->a:La/wne;

    .line 44
    .line 45
    iget v3, v2, La/i700;->j:I

    .line 46
    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    if-ne v3, v8, :cond_1

    .line 50
    .line 51
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const/4 v9, 0x0

    .line 59
    goto :goto_2

    .line 60
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    move-object/from16 v0, p1

    .line 64
    .line 65
    check-cast v0, Ljava/util/List;

    .line 66
    .line 67
    new-instance v3, Lkotlin/Pair;

    .line 68
    .line 69
    invoke-direct {v3, v4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iput v8, v2, La/i700;->j:I

    .line 73
    .line 74
    invoke-interface {v5, v3, v2}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-ne v0, v1, :cond_3

    .line 79
    .line 80
    move-object v9, v1

    .line 81
    goto :goto_2

    .line 82
    :cond_3
    :goto_1
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    :goto_2
    return-object v9

    .line 85
    :pswitch_0
    instance-of v2, v1, La/l5v;

    .line 86
    .line 87
    if-eqz v2, :cond_4

    .line 88
    .line 89
    move-object v2, v1

    .line 90
    check-cast v2, La/l5v;

    .line 91
    .line 92
    iget v3, v2, La/l5v;->j:I

    .line 93
    .line 94
    and-int v10, v3, v7

    .line 95
    .line 96
    if-eqz v10, :cond_4

    .line 97
    .line 98
    sub-int/2addr v3, v7

    .line 99
    iput v3, v2, La/l5v;->j:I

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_4
    new-instance v2, La/l5v;

    .line 103
    .line 104
    invoke-direct {v2, p0, v1}, La/l5v;-><init>(La/xot;La/yje;)V

    .line 105
    .line 106
    .line 107
    :goto_3
    iget-object v0, v2, La/l5v;->i:Ljava/lang/Object;

    .line 108
    .line 109
    sget-object v1, La/wne;->a:La/wne;

    .line 110
    .line 111
    iget v3, v2, La/l5v;->j:I

    .line 112
    .line 113
    if-eqz v3, :cond_6

    .line 114
    .line 115
    if-ne v3, v8, :cond_5

    .line 116
    .line 117
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_5
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    const/4 v9, 0x0

    .line 125
    goto :goto_5

    .line 126
    :cond_6
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    move-object/from16 v0, p1

    .line 130
    .line 131
    check-cast v0, Lkotlin/Unit;

    .line 132
    .line 133
    iput v8, v2, La/l5v;->j:I

    .line 134
    .line 135
    invoke-interface {v5, v4, v2}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    if-ne v0, v1, :cond_7

    .line 140
    .line 141
    move-object v9, v1

    .line 142
    goto :goto_5

    .line 143
    :cond_7
    :goto_4
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    :goto_5
    return-object v9

    .line 146
    :pswitch_1
    instance-of v2, v1, La/piu;

    .line 147
    .line 148
    if-eqz v2, :cond_8

    .line 149
    .line 150
    move-object v2, v1

    .line 151
    check-cast v2, La/piu;

    .line 152
    .line 153
    iget v10, v2, La/piu;->j:I

    .line 154
    .line 155
    and-int v11, v10, v7

    .line 156
    .line 157
    if-eqz v11, :cond_8

    .line 158
    .line 159
    sub-int/2addr v10, v7

    .line 160
    iput v10, v2, La/piu;->j:I

    .line 161
    .line 162
    goto :goto_6

    .line 163
    :cond_8
    new-instance v2, La/piu;

    .line 164
    .line 165
    invoke-direct {v2, p0, v1}, La/piu;-><init>(La/xot;La/yje;)V

    .line 166
    .line 167
    .line 168
    :goto_6
    iget-object v0, v2, La/piu;->i:Ljava/lang/Object;

    .line 169
    .line 170
    sget-object v1, La/wne;->a:La/wne;

    .line 171
    .line 172
    iget v7, v2, La/piu;->j:I

    .line 173
    .line 174
    if-eqz v7, :cond_a

    .line 175
    .line 176
    if-ne v7, v8, :cond_9

    .line 177
    .line 178
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    goto/16 :goto_b

    .line 182
    .line 183
    :cond_9
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    const/4 v9, 0x0

    .line 187
    goto/16 :goto_c

    .line 188
    .line 189
    :cond_a
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    move-object/from16 v0, p1

    .line 193
    .line 194
    check-cast v0, Ljava/util/List;

    .line 195
    .line 196
    new-instance v6, Ljava/util/ArrayList;

    .line 197
    .line 198
    invoke-static {v4, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    invoke-direct {v6, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 203
    .line 204
    .line 205
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    if-eqz v4, :cond_f

    .line 214
    .line 215
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    check-cast v4, La/idb;

    .line 220
    .line 221
    iget-object v7, v4, La/idb;->b:Ljava/util/List;

    .line 222
    .line 223
    new-instance v10, Ljava/util/ArrayList;

    .line 224
    .line 225
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 226
    .line 227
    .line 228
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 229
    .line 230
    .line 231
    move-result-object v7

    .line 232
    :goto_8
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 233
    .line 234
    .line 235
    move-result v11

    .line 236
    if-eqz v11, :cond_e

    .line 237
    .line 238
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v11

    .line 242
    check-cast v11, La/nas;

    .line 243
    .line 244
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 245
    .line 246
    .line 247
    move-result-object v12

    .line 248
    :goto_9
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 249
    .line 250
    .line 251
    move-result v13

    .line 252
    if-eqz v13, :cond_c

    .line 253
    .line 254
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v13

    .line 258
    move-object v14, v13

    .line 259
    check-cast v14, La/d0t;

    .line 260
    .line 261
    iget-wide v8, v11, La/nas;->a:J

    .line 262
    .line 263
    move-object p0, v7

    .line 264
    move-wide/from16 p1, v8

    .line 265
    .line 266
    iget-wide v7, v14, La/d0t;->a:J

    .line 267
    .line 268
    cmp-long v7, p1, v7

    .line 269
    .line 270
    if-nez v7, :cond_b

    .line 271
    .line 272
    goto :goto_a

    .line 273
    :cond_b
    move-object v7, p0

    .line 274
    const/4 v8, 0x1

    .line 275
    goto :goto_9

    .line 276
    :cond_c
    move-object p0, v7

    .line 277
    const/4 v13, 0x0

    .line 278
    :goto_a
    check-cast v13, La/d0t;

    .line 279
    .line 280
    if-eqz v13, :cond_d

    .line 281
    .line 282
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    :cond_d
    move-object v7, p0

    .line 286
    const/4 v8, 0x1

    .line 287
    goto :goto_8

    .line 288
    :cond_e
    iget-object v4, v4, La/idb;->a:La/fhb;

    .line 289
    .line 290
    invoke-static {v4, v10}, La/fhb;->a(La/fhb;Ljava/util/ArrayList;)La/fhb;

    .line 291
    .line 292
    .line 293
    move-result-object v4

    .line 294
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    const/4 v8, 0x1

    .line 298
    goto :goto_7

    .line 299
    :cond_f
    move v4, v8

    .line 300
    iput v4, v2, La/piu;->j:I

    .line 301
    .line 302
    invoke-interface {v5, v6, v2}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    if-ne v0, v1, :cond_10

    .line 307
    .line 308
    move-object v9, v1

    .line 309
    goto :goto_c

    .line 310
    :cond_10
    :goto_b
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 311
    .line 312
    :goto_c
    return-object v9

    .line 313
    :pswitch_2
    instance-of v2, v1, La/t4u;

    .line 314
    .line 315
    if-eqz v2, :cond_11

    .line 316
    .line 317
    move-object v2, v1

    .line 318
    check-cast v2, La/t4u;

    .line 319
    .line 320
    iget v3, v2, La/t4u;->j:I

    .line 321
    .line 322
    and-int v8, v3, v7

    .line 323
    .line 324
    if-eqz v8, :cond_11

    .line 325
    .line 326
    sub-int/2addr v3, v7

    .line 327
    iput v3, v2, La/t4u;->j:I

    .line 328
    .line 329
    goto :goto_d

    .line 330
    :cond_11
    new-instance v2, La/t4u;

    .line 331
    .line 332
    invoke-direct {v2, p0, v1}, La/t4u;-><init>(La/xot;La/yje;)V

    .line 333
    .line 334
    .line 335
    :goto_d
    iget-object v0, v2, La/t4u;->i:Ljava/lang/Object;

    .line 336
    .line 337
    sget-object v1, La/wne;->a:La/wne;

    .line 338
    .line 339
    iget v3, v2, La/t4u;->j:I

    .line 340
    .line 341
    if-eqz v3, :cond_13

    .line 342
    .line 343
    const/4 v7, 0x1

    .line 344
    if-ne v3, v7, :cond_12

    .line 345
    .line 346
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    goto :goto_12

    .line 350
    :cond_12
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    :goto_e
    const/4 v9, 0x0

    .line 354
    goto :goto_13

    .line 355
    :cond_13
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 356
    .line 357
    .line 358
    move-object/from16 v0, p1

    .line 359
    .line 360
    check-cast v0, La/y52;

    .line 361
    .line 362
    if-eqz v0, :cond_19

    .line 363
    .line 364
    instance-of v3, v0, La/v52;

    .line 365
    .line 366
    if-eqz v3, :cond_14

    .line 367
    .line 368
    sget-object v0, La/iun;->a:La/iun;

    .line 369
    .line 370
    :goto_f
    const/4 v4, 0x1

    .line 371
    goto :goto_11

    .line 372
    :cond_14
    instance-of v3, v0, La/w52;

    .line 373
    .line 374
    if-eqz v3, :cond_15

    .line 375
    .line 376
    sget-object v0, La/iun;->a:La/iun;

    .line 377
    .line 378
    goto :goto_f

    .line 379
    :cond_15
    instance-of v3, v0, La/x52;

    .line 380
    .line 381
    if-eqz v3, :cond_19

    .line 382
    .line 383
    new-instance v3, Ljava/util/ArrayList;

    .line 384
    .line 385
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 386
    .line 387
    .line 388
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 389
    .line 390
    .line 391
    move-result-object v4

    .line 392
    :cond_16
    :goto_10
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 393
    .line 394
    .line 395
    move-result v6

    .line 396
    if-eqz v6, :cond_17

    .line 397
    .line 398
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v6

    .line 402
    move-object v7, v6

    .line 403
    check-cast v7, La/jkp;

    .line 404
    .line 405
    move-object v8, v0

    .line 406
    check-cast v8, La/x52;

    .line 407
    .line 408
    iget-object v8, v8, La/x52;->a:Ljava/util/List;

    .line 409
    .line 410
    iget-wide v9, v7, La/jkp;->a:J

    .line 411
    .line 412
    invoke-static {v9, v10, v8}, La/axq;->y(JLjava/util/List;)Z

    .line 413
    .line 414
    .line 415
    move-result v7

    .line 416
    if-eqz v7, :cond_16

    .line 417
    .line 418
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 419
    .line 420
    .line 421
    goto :goto_10

    .line 422
    :cond_17
    move-object v0, v3

    .line 423
    goto :goto_f

    .line 424
    :goto_11
    iput v4, v2, La/t4u;->j:I

    .line 425
    .line 426
    invoke-interface {v5, v0, v2}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    if-ne v0, v1, :cond_18

    .line 431
    .line 432
    move-object v9, v1

    .line 433
    goto :goto_13

    .line 434
    :cond_18
    :goto_12
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 435
    .line 436
    goto :goto_13

    .line 437
    :cond_19
    invoke-static {}, La/t9f;->b()V

    .line 438
    .line 439
    .line 440
    goto :goto_e

    .line 441
    :goto_13
    return-object v9

    .line 442
    :pswitch_3
    instance-of v2, v1, La/d3u;

    .line 443
    .line 444
    if-eqz v2, :cond_1a

    .line 445
    .line 446
    move-object v2, v1

    .line 447
    check-cast v2, La/d3u;

    .line 448
    .line 449
    iget v3, v2, La/d3u;->j:I

    .line 450
    .line 451
    and-int v8, v3, v7

    .line 452
    .line 453
    if-eqz v8, :cond_1a

    .line 454
    .line 455
    sub-int/2addr v3, v7

    .line 456
    iput v3, v2, La/d3u;->j:I

    .line 457
    .line 458
    goto :goto_14

    .line 459
    :cond_1a
    new-instance v2, La/d3u;

    .line 460
    .line 461
    invoke-direct {v2, p0, v1}, La/d3u;-><init>(La/xot;La/yje;)V

    .line 462
    .line 463
    .line 464
    :goto_14
    iget-object v0, v2, La/d3u;->i:Ljava/lang/Object;

    .line 465
    .line 466
    sget-object v1, La/wne;->a:La/wne;

    .line 467
    .line 468
    iget v3, v2, La/d3u;->j:I

    .line 469
    .line 470
    const/4 v7, 0x1

    .line 471
    if-eqz v3, :cond_1c

    .line 472
    .line 473
    if-ne v3, v7, :cond_1b

    .line 474
    .line 475
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 476
    .line 477
    .line 478
    goto :goto_15

    .line 479
    :cond_1b
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    const/4 v9, 0x0

    .line 483
    goto :goto_16

    .line 484
    :cond_1c
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 485
    .line 486
    .line 487
    move-object/from16 v0, p1

    .line 488
    .line 489
    check-cast v0, Ljava/util/List;

    .line 490
    .line 491
    invoke-static {v0, v4}, La/q8a;->K(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    iput v7, v2, La/d3u;->j:I

    .line 496
    .line 497
    invoke-interface {v5, v0, v2}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    if-ne v0, v1, :cond_1d

    .line 502
    .line 503
    move-object v9, v1

    .line 504
    goto :goto_16

    .line 505
    :cond_1d
    :goto_15
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 506
    .line 507
    :goto_16
    return-object v9

    .line 508
    :pswitch_4
    instance-of v2, v1, La/wot;

    .line 509
    .line 510
    if-eqz v2, :cond_1e

    .line 511
    .line 512
    move-object v2, v1

    .line 513
    check-cast v2, La/wot;

    .line 514
    .line 515
    iget v8, v2, La/wot;->j:I

    .line 516
    .line 517
    and-int v9, v8, v7

    .line 518
    .line 519
    if-eqz v9, :cond_1e

    .line 520
    .line 521
    sub-int/2addr v8, v7

    .line 522
    iput v8, v2, La/wot;->j:I

    .line 523
    .line 524
    goto :goto_17

    .line 525
    :cond_1e
    new-instance v2, La/wot;

    .line 526
    .line 527
    invoke-direct {v2, p0, v1}, La/wot;-><init>(La/xot;La/yje;)V

    .line 528
    .line 529
    .line 530
    :goto_17
    iget-object v0, v2, La/wot;->i:Ljava/lang/Object;

    .line 531
    .line 532
    sget-object v1, La/wne;->a:La/wne;

    .line 533
    .line 534
    iget v7, v2, La/wot;->j:I

    .line 535
    .line 536
    if-eqz v7, :cond_20

    .line 537
    .line 538
    const/4 v8, 0x1

    .line 539
    if-ne v7, v8, :cond_1f

    .line 540
    .line 541
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 542
    .line 543
    .line 544
    goto :goto_1b

    .line 545
    :cond_1f
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 546
    .line 547
    .line 548
    const/4 v9, 0x0

    .line 549
    goto :goto_1c

    .line 550
    :cond_20
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 551
    .line 552
    .line 553
    move-object/from16 v0, p1

    .line 554
    .line 555
    check-cast v0, Ljava/util/List;

    .line 556
    .line 557
    new-instance v6, Ljava/util/ArrayList;

    .line 558
    .line 559
    invoke-static {v0, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 560
    .line 561
    .line 562
    move-result v3

    .line 563
    invoke-direct {v6, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 564
    .line 565
    .line 566
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    :goto_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 571
    .line 572
    .line 573
    move-result v3

    .line 574
    if-eqz v3, :cond_24

    .line 575
    .line 576
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    move-result-object v3

    .line 580
    check-cast v3, La/d0t;

    .line 581
    .line 582
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 583
    .line 584
    .line 585
    move-result-object v7

    .line 586
    :cond_21
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 587
    .line 588
    .line 589
    move-result v8

    .line 590
    if-eqz v8, :cond_22

    .line 591
    .line 592
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object v8

    .line 596
    move-object v9, v8

    .line 597
    check-cast v9, La/pxy;

    .line 598
    .line 599
    iget-wide v9, v9, La/pxy;->a:J

    .line 600
    .line 601
    iget-wide v11, v3, La/d0t;->a:J

    .line 602
    .line 603
    cmp-long v9, v9, v11

    .line 604
    .line 605
    if-nez v9, :cond_21

    .line 606
    .line 607
    goto :goto_19

    .line 608
    :cond_22
    const/4 v8, 0x0

    .line 609
    :goto_19
    check-cast v8, La/pxy;

    .line 610
    .line 611
    if-eqz v8, :cond_23

    .line 612
    .line 613
    iget-wide v7, v8, La/pxy;->c:J

    .line 614
    .line 615
    goto :goto_1a

    .line 616
    :cond_23
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 617
    .line 618
    .line 619
    move-result-wide v7

    .line 620
    :goto_1a
    new-instance v9, La/mxy;

    .line 621
    .line 622
    invoke-direct {v9, v7, v8, v3}, La/mxy;-><init>(JLa/d0t;)V

    .line 623
    .line 624
    .line 625
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 626
    .line 627
    .line 628
    goto :goto_18

    .line 629
    :cond_24
    new-instance v0, La/e3l;

    .line 630
    .line 631
    const/16 v3, 0x15

    .line 632
    .line 633
    invoke-direct {v0, v3}, La/e3l;-><init>(B)V

    .line 634
    .line 635
    .line 636
    invoke-static {v6, v0}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    const/4 v4, 0x1

    .line 641
    iput v4, v2, La/wot;->j:I

    .line 642
    .line 643
    invoke-interface {v5, v0, v2}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    move-result-object v0

    .line 647
    if-ne v0, v1, :cond_25

    .line 648
    .line 649
    move-object v9, v1

    .line 650
    goto :goto_1c

    .line 651
    :cond_25
    :goto_1b
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 652
    .line 653
    :goto_1c
    return-object v9

    .line 654
    nop

    .line 655
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
