.class public final La/sco0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/sco0;->a:B

    iput-object p1, p0, La/sco0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/sco0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-byte v2, v0, La/sco0;->a:B

    .line 6
    .line 7
    const/16 v3, 0xa

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    const/high16 v6, -0x80000000

    .line 13
    .line 14
    const/4 v7, 0x1

    .line 15
    const/4 v8, 0x0

    .line 16
    iget-object v9, v0, La/sco0;->c:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v10, v0, La/sco0;->b:Ljava/lang/Object;

    .line 19
    .line 20
    packed-switch v2, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    move-object/from16 v0, p1

    .line 24
    .line 25
    check-cast v0, La/w4e;

    .line 26
    .line 27
    check-cast v10, La/ah60;

    .line 28
    .line 29
    check-cast v9, La/ppv0;

    .line 30
    .line 31
    invoke-interface {v10, v9, v0}, La/ah60;->a(La/ppv0;La/w4e;)V

    .line 32
    .line 33
    .line 34
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_0
    move-object/from16 v0, p1

    .line 38
    .line 39
    check-cast v0, La/nlx;

    .line 40
    .line 41
    check-cast v9, La/pz40;

    .line 42
    .line 43
    instance-of v0, v0, La/nel;

    .line 44
    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    invoke-interface {v9}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Ljava/lang/Boolean;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_0

    .line 58
    .line 59
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 60
    .line 61
    invoke-interface {v9, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    check-cast v10, Lkotlin/jvm/functions/Function0;

    .line 65
    .line 66
    invoke-interface {v10}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    return-object v0

    .line 72
    :pswitch_1
    check-cast v9, La/vcv0;

    .line 73
    .line 74
    instance-of v2, v1, La/ucv0;

    .line 75
    .line 76
    if-eqz v2, :cond_1

    .line 77
    .line 78
    move-object v2, v1

    .line 79
    check-cast v2, La/ucv0;

    .line 80
    .line 81
    iget v4, v2, La/ucv0;->j:I

    .line 82
    .line 83
    and-int v11, v4, v6

    .line 84
    .line 85
    if-eqz v11, :cond_1

    .line 86
    .line 87
    sub-int/2addr v4, v6

    .line 88
    iput v4, v2, La/ucv0;->j:I

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_1
    new-instance v2, La/ucv0;

    .line 92
    .line 93
    invoke-direct {v2, v0, v1}, La/ucv0;-><init>(La/sco0;La/yje;)V

    .line 94
    .line 95
    .line 96
    :goto_0
    iget-object v0, v2, La/ucv0;->i:Ljava/lang/Object;

    .line 97
    .line 98
    sget-object v1, La/wne;->a:La/wne;

    .line 99
    .line 100
    iget v4, v2, La/ucv0;->j:I

    .line 101
    .line 102
    if-eqz v4, :cond_3

    .line 103
    .line 104
    if-ne v4, v7, :cond_2

    .line 105
    .line 106
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    goto/16 :goto_4

    .line 110
    .line 111
    :cond_2
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    goto/16 :goto_5

    .line 115
    .line 116
    :cond_3
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    check-cast v10, La/kmq;

    .line 120
    .line 121
    move-object/from16 v0, p1

    .line 122
    .line 123
    check-cast v0, La/dqk0;

    .line 124
    .line 125
    if-eqz v0, :cond_b

    .line 126
    .line 127
    instance-of v4, v0, La/bqk0;

    .line 128
    .line 129
    if-eqz v4, :cond_5

    .line 130
    .line 131
    sget v0, La/vcv0;->B:I

    .line 132
    .line 133
    iget-object v0, v9, La/i3t0;->i:La/ocj;

    .line 134
    .line 135
    iget-object v4, v0, La/ocj;->a:La/p7m0;

    .line 136
    .line 137
    :cond_4
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    iget-object v3, v9, La/i3t0;->f:La/oyg0;

    .line 145
    .line 146
    move-object v11, v0

    .line 147
    check-cast v11, La/ncv0;

    .line 148
    .line 149
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    sget-object v12, La/iun;->a:La/iun;

    .line 153
    .line 154
    const/16 v16, 0x0

    .line 155
    .line 156
    const/16 v17, 0x78

    .line 157
    .line 158
    const/4 v13, 0x0

    .line 159
    const/4 v14, 0x1

    .line 160
    const/4 v15, 0x0

    .line 161
    invoke-static/range {v11 .. v17}, La/ncv0;->a(La/ncv0;Ljava/util/List;La/i3m0;ZZZI)La/ncv0;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    invoke-virtual {v4, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-eqz v0, :cond_4

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_5
    instance-of v4, v0, La/cqk0;

    .line 173
    .line 174
    if-eqz v4, :cond_b

    .line 175
    .line 176
    check-cast v0, La/cqk0;

    .line 177
    .line 178
    iget-object v0, v0, La/cqk0;->a:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v0, Ljava/lang/Iterable;

    .line 181
    .line 182
    new-instance v4, Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-static {v0, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 189
    .line 190
    .line 191
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    if-eqz v3, :cond_9

    .line 200
    .line 201
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    check-cast v3, La/ifb;

    .line 206
    .line 207
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    instance-of v5, v3, La/efb;

    .line 211
    .line 212
    if-eqz v5, :cond_6

    .line 213
    .line 214
    sget-object v3, La/e3m0;->a:La/e3m0;

    .line 215
    .line 216
    goto :goto_2

    .line 217
    :cond_6
    instance-of v5, v3, La/ffb;

    .line 218
    .line 219
    if-eqz v5, :cond_7

    .line 220
    .line 221
    sget-object v3, La/f3m0;->a:La/f3m0;

    .line 222
    .line 223
    goto :goto_2

    .line 224
    :cond_7
    instance-of v3, v3, La/gfb;

    .line 225
    .line 226
    if-eqz v3, :cond_8

    .line 227
    .line 228
    sget-object v3, La/g3m0;->a:La/g3m0;

    .line 229
    .line 230
    :goto_2
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    goto :goto_1

    .line 234
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 235
    .line 236
    .line 237
    goto :goto_5

    .line 238
    :cond_9
    new-instance v0, La/a8;

    .line 239
    .line 240
    const/16 v3, 0x1b

    .line 241
    .line 242
    invoke-direct {v0, v4, v9, v3}, La/a8;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 243
    .line 244
    .line 245
    sget v3, La/vcv0;->B:I

    .line 246
    .line 247
    invoke-virtual {v9, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 248
    .line 249
    .line 250
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 251
    .line 252
    iput v7, v2, La/ucv0;->j:I

    .line 253
    .line 254
    invoke-interface {v10, v0, v2}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    if-ne v0, v1, :cond_a

    .line 259
    .line 260
    move-object v8, v1

    .line 261
    goto :goto_5

    .line 262
    :cond_a
    :goto_4
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 263
    .line 264
    goto :goto_5

    .line 265
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 266
    .line 267
    .line 268
    :goto_5
    return-object v8

    .line 269
    :pswitch_2
    instance-of v2, v1, La/fmr0;

    .line 270
    .line 271
    if-eqz v2, :cond_c

    .line 272
    .line 273
    move-object v2, v1

    .line 274
    check-cast v2, La/fmr0;

    .line 275
    .line 276
    iget v4, v2, La/fmr0;->j:I

    .line 277
    .line 278
    and-int v11, v4, v6

    .line 279
    .line 280
    if-eqz v11, :cond_c

    .line 281
    .line 282
    sub-int/2addr v4, v6

    .line 283
    iput v4, v2, La/fmr0;->j:I

    .line 284
    .line 285
    goto :goto_6

    .line 286
    :cond_c
    new-instance v2, La/fmr0;

    .line 287
    .line 288
    invoke-direct {v2, v0, v1}, La/fmr0;-><init>(La/sco0;La/yje;)V

    .line 289
    .line 290
    .line 291
    :goto_6
    iget-object v0, v2, La/fmr0;->i:Ljava/lang/Object;

    .line 292
    .line 293
    sget-object v1, La/wne;->a:La/wne;

    .line 294
    .line 295
    iget v4, v2, La/fmr0;->j:I

    .line 296
    .line 297
    if-eqz v4, :cond_e

    .line 298
    .line 299
    if-ne v4, v7, :cond_d

    .line 300
    .line 301
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    goto :goto_8

    .line 305
    :cond_d
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    goto :goto_9

    .line 309
    :cond_e
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    check-cast v10, La/kmq;

    .line 313
    .line 314
    move-object/from16 v0, p1

    .line 315
    .line 316
    check-cast v0, Ljava/util/List;

    .line 317
    .line 318
    check-cast v9, La/gmr0;

    .line 319
    .line 320
    iget-object v4, v9, La/gmr0;->d:La/ctf0;

    .line 321
    .line 322
    iget-object v5, v9, La/gmr0;->b:La/pru;

    .line 323
    .line 324
    invoke-virtual {v5}, La/pru;->a()La/sff0;

    .line 325
    .line 326
    .line 327
    move-result-object v5

    .line 328
    iget-object v5, v5, La/sff0;->a:La/gx7;

    .line 329
    .line 330
    iget-object v5, v5, La/gx7;->f:Ljava/lang/String;

    .line 331
    .line 332
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v5

    .line 336
    iget-object v4, v4, La/ctf0;->b:La/lsm0;

    .line 337
    .line 338
    invoke-static {v5, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v5

    .line 342
    const v6, 0x7f130421

    .line 343
    .line 344
    .line 345
    invoke-virtual {v4, v6, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v4

    .line 349
    new-instance v5, Ljava/util/ArrayList;

    .line 350
    .line 351
    invoke-static {v0, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 352
    .line 353
    .line 354
    move-result v3

    .line 355
    invoke-direct {v5, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 356
    .line 357
    .line 358
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 363
    .line 364
    .line 365
    move-result v3

    .line 366
    if-eqz v3, :cond_f

    .line 367
    .line 368
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v3

    .line 372
    check-cast v3, La/lmr0;

    .line 373
    .line 374
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    new-instance v11, La/pmr0;

    .line 378
    .line 379
    iget v12, v3, La/lmr0;->a:I

    .line 380
    .line 381
    iget-object v13, v3, La/lmr0;->b:Ljava/lang/String;

    .line 382
    .line 383
    iget-object v14, v3, La/lmr0;->c:La/ulr0;

    .line 384
    .line 385
    iget-boolean v15, v3, La/lmr0;->d:Z

    .line 386
    .line 387
    invoke-static {v14}, La/afn0;->n(La/ulr0;)I

    .line 388
    .line 389
    .line 390
    move-result v16

    .line 391
    invoke-direct/range {v11 .. v16}, La/pmr0;-><init>(ILjava/lang/String;La/ulr0;ZI)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 395
    .line 396
    .line 397
    goto :goto_7

    .line 398
    :cond_f
    new-instance v0, La/jq8;

    .line 399
    .line 400
    invoke-direct {v0, v4, v5}, La/jq8;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 401
    .line 402
    .line 403
    iput v7, v2, La/fmr0;->j:I

    .line 404
    .line 405
    invoke-interface {v10, v0, v2}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    if-ne v0, v1, :cond_10

    .line 410
    .line 411
    move-object v8, v1

    .line 412
    goto :goto_9

    .line 413
    :cond_10
    :goto_8
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 414
    .line 415
    :goto_9
    return-object v8

    .line 416
    :pswitch_3
    move-object/from16 v0, p1

    .line 417
    .line 418
    check-cast v0, La/nlx;

    .line 419
    .line 420
    check-cast v10, La/kie0;

    .line 421
    .line 422
    instance-of v1, v0, La/jub0;

    .line 423
    .line 424
    if-eqz v1, :cond_11

    .line 425
    .line 426
    iget v0, v10, La/kie0;->a:I

    .line 427
    .line 428
    add-int/2addr v0, v7

    .line 429
    iput v0, v10, La/kie0;->a:I

    .line 430
    .line 431
    goto :goto_a

    .line 432
    :cond_11
    instance-of v1, v0, La/kub0;

    .line 433
    .line 434
    if-eqz v1, :cond_12

    .line 435
    .line 436
    iget v0, v10, La/kie0;->a:I

    .line 437
    .line 438
    add-int/lit8 v0, v0, -0x1

    .line 439
    .line 440
    iput v0, v10, La/kie0;->a:I

    .line 441
    .line 442
    goto :goto_a

    .line 443
    :cond_12
    instance-of v0, v0, La/iub0;

    .line 444
    .line 445
    if-eqz v0, :cond_13

    .line 446
    .line 447
    iget v0, v10, La/kie0;->a:I

    .line 448
    .line 449
    add-int/lit8 v0, v0, -0x1

    .line 450
    .line 451
    iput v0, v10, La/kie0;->a:I

    .line 452
    .line 453
    :cond_13
    :goto_a
    iget v0, v10, La/kie0;->a:I

    .line 454
    .line 455
    if-lez v0, :cond_14

    .line 456
    .line 457
    move v4, v7

    .line 458
    :cond_14
    check-cast v9, La/jdq0;

    .line 459
    .line 460
    iget-boolean v0, v9, La/jdq0;->r:Z

    .line 461
    .line 462
    if-eq v0, v4, :cond_15

    .line 463
    .line 464
    iput-boolean v4, v9, La/jdq0;->r:Z

    .line 465
    .line 466
    invoke-static {v9}, La/n7x;->I(La/v6z;)V

    .line 467
    .line 468
    .line 469
    :cond_15
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 470
    .line 471
    return-object v0

    .line 472
    :pswitch_4
    instance-of v2, v1, La/v1q0;

    .line 473
    .line 474
    if-eqz v2, :cond_16

    .line 475
    .line 476
    move-object v2, v1

    .line 477
    check-cast v2, La/v1q0;

    .line 478
    .line 479
    iget v3, v2, La/v1q0;->j:I

    .line 480
    .line 481
    and-int v11, v3, v6

    .line 482
    .line 483
    if-eqz v11, :cond_16

    .line 484
    .line 485
    sub-int/2addr v3, v6

    .line 486
    iput v3, v2, La/v1q0;->j:I

    .line 487
    .line 488
    goto :goto_b

    .line 489
    :cond_16
    new-instance v2, La/v1q0;

    .line 490
    .line 491
    invoke-direct {v2, v0, v1}, La/v1q0;-><init>(La/sco0;La/yje;)V

    .line 492
    .line 493
    .line 494
    :goto_b
    iget-object v0, v2, La/v1q0;->i:Ljava/lang/Object;

    .line 495
    .line 496
    sget-object v1, La/wne;->a:La/wne;

    .line 497
    .line 498
    iget v3, v2, La/v1q0;->j:I

    .line 499
    .line 500
    if-eqz v3, :cond_18

    .line 501
    .line 502
    if-ne v3, v7, :cond_17

    .line 503
    .line 504
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 505
    .line 506
    .line 507
    goto :goto_c

    .line 508
    :cond_17
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    goto :goto_d

    .line 512
    :cond_18
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 513
    .line 514
    .line 515
    check-cast v10, La/kmq;

    .line 516
    .line 517
    move-object/from16 v0, p1

    .line 518
    .line 519
    check-cast v0, La/a2q0;

    .line 520
    .line 521
    check-cast v9, La/x1q0;

    .line 522
    .line 523
    iget-object v3, v9, La/x1q0;->k:La/ctf0;

    .line 524
    .line 525
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 529
    .line 530
    .line 531
    new-instance v5, La/b2q0;

    .line 532
    .line 533
    instance-of v6, v0, La/a2q0;

    .line 534
    .line 535
    if-eqz v6, :cond_1a

    .line 536
    .line 537
    new-array v6, v4, [Ljava/lang/Object;

    .line 538
    .line 539
    iget-object v3, v3, La/ctf0;->b:La/lsm0;

    .line 540
    .line 541
    invoke-static {v6, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    move-result-object v4

    .line 545
    const v6, 0x7f130792

    .line 546
    .line 547
    .line 548
    invoke-virtual {v3, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v3

    .line 552
    invoke-direct {v5, v3, v0}, La/b2q0;-><init>(Ljava/lang/String;La/a2q0;)V

    .line 553
    .line 554
    .line 555
    iput v7, v2, La/v1q0;->j:I

    .line 556
    .line 557
    invoke-interface {v10, v5, v2}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    if-ne v0, v1, :cond_19

    .line 562
    .line 563
    move-object v8, v1

    .line 564
    goto :goto_d

    .line 565
    :cond_19
    :goto_c
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 566
    .line 567
    goto :goto_d

    .line 568
    :cond_1a
    invoke-static {}, La/t9f;->b()V

    .line 569
    .line 570
    .line 571
    :goto_d
    return-object v8

    .line 572
    :pswitch_5
    move-object/from16 v2, p1

    .line 573
    .line 574
    check-cast v2, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;

    .line 575
    .line 576
    move-object v3, v10

    .line 577
    check-cast v3, La/pyp0;

    .line 578
    .line 579
    move-object v11, v9

    .line 580
    check-cast v11, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;

    .line 581
    .line 582
    sget v0, La/pyp0;->w:I

    .line 583
    .line 584
    iget-object v0, v3, La/i3t0;->i:La/ocj;

    .line 585
    .line 586
    iget-object v12, v0, La/ocj;->a:La/p7m0;

    .line 587
    .line 588
    :cond_1b
    invoke-virtual {v12}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v0

    .line 592
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 593
    .line 594
    .line 595
    iget-object v1, v3, La/i3t0;->f:La/oyg0;

    .line 596
    .line 597
    move-object v4, v0

    .line 598
    check-cast v4, La/nyp0;

    .line 599
    .line 600
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 601
    .line 602
    .line 603
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 604
    .line 605
    .line 606
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 607
    .line 608
    .line 609
    new-instance v1, La/nyp0;

    .line 610
    .line 611
    invoke-direct {v1, v2, v2, v11}, La/nyp0;-><init>(Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;)V

    .line 612
    .line 613
    .line 614
    invoke-virtual {v12, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 615
    .line 616
    .line 617
    move-result v0

    .line 618
    if-eqz v0, :cond_1b

    .line 619
    .line 620
    iget-object v0, v3, La/pyp0;->o:La/vzg0;

    .line 621
    .line 622
    const-string v1, "START_FILTER_MODEL_KEY"

    .line 623
    .line 624
    invoke-virtual {v0, v1, v2}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 625
    .line 626
    .line 627
    const-string v1, "CURRENT_FILTER_MODEL_KEY"

    .line 628
    .line 629
    invoke-virtual {v0, v1, v2}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 630
    .line 631
    .line 632
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 633
    .line 634
    return-object v0

    .line 635
    :pswitch_6
    instance-of v2, v1, La/rco0;

    .line 636
    .line 637
    if-eqz v2, :cond_1c

    .line 638
    .line 639
    move-object v2, v1

    .line 640
    check-cast v2, La/rco0;

    .line 641
    .line 642
    iget v3, v2, La/rco0;->j:I

    .line 643
    .line 644
    and-int v11, v3, v6

    .line 645
    .line 646
    if-eqz v11, :cond_1c

    .line 647
    .line 648
    sub-int/2addr v3, v6

    .line 649
    iput v3, v2, La/rco0;->j:I

    .line 650
    .line 651
    goto :goto_e

    .line 652
    :cond_1c
    new-instance v2, La/rco0;

    .line 653
    .line 654
    invoke-direct {v2, v0, v1}, La/rco0;-><init>(La/sco0;La/yje;)V

    .line 655
    .line 656
    .line 657
    :goto_e
    iget-object v0, v2, La/rco0;->i:Ljava/lang/Object;

    .line 658
    .line 659
    sget-object v1, La/wne;->a:La/wne;

    .line 660
    .line 661
    iget v3, v2, La/rco0;->j:I

    .line 662
    .line 663
    if-eqz v3, :cond_1e

    .line 664
    .line 665
    if-ne v3, v7, :cond_1d

    .line 666
    .line 667
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 668
    .line 669
    .line 670
    goto :goto_10

    .line 671
    :cond_1d
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 672
    .line 673
    .line 674
    goto :goto_11

    .line 675
    :cond_1e
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 676
    .line 677
    .line 678
    check-cast v10, La/kmq;

    .line 679
    .line 680
    move-object/from16 v0, p1

    .line 681
    .line 682
    check-cast v0, La/tk60;

    .line 683
    .line 684
    sget-object v3, La/qk60;->a:La/qk60;

    .line 685
    .line 686
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 687
    .line 688
    .line 689
    move-result v3

    .line 690
    if-eqz v3, :cond_1f

    .line 691
    .line 692
    goto :goto_f

    .line 693
    :cond_1f
    instance-of v3, v0, La/rk60;

    .line 694
    .line 695
    if-eqz v3, :cond_22

    .line 696
    .line 697
    check-cast v0, La/rk60;

    .line 698
    .line 699
    iget-object v0, v0, La/rk60;->a:La/sh60;

    .line 700
    .line 701
    check-cast v9, La/sh60;

    .line 702
    .line 703
    if-ne v0, v9, :cond_20

    .line 704
    .line 705
    move v4, v7

    .line 706
    :cond_20
    :goto_f
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 707
    .line 708
    .line 709
    move-result-object v0

    .line 710
    iput v7, v2, La/rco0;->j:I

    .line 711
    .line 712
    invoke-interface {v10, v0, v2}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    if-ne v0, v1, :cond_21

    .line 717
    .line 718
    move-object v8, v1

    .line 719
    goto :goto_11

    .line 720
    :cond_21
    :goto_10
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 721
    .line 722
    goto :goto_11

    .line 723
    :cond_22
    invoke-static {}, La/t9f;->b()V

    .line 724
    .line 725
    .line 726
    :goto_11
    return-object v8

    .line 727
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
