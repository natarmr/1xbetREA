.class public final La/pbp;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public k:Z

.field public synthetic l:Ljava/lang/Object;

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/ccp;La/yje;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/pbp;->i:B

    .line 2
    iput-object p1, p0, La/pbp;->n:Ljava/lang/Object;

    const/4 p1, 0x4

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/pbp;->i:B

    iput-object p1, p0, La/pbp;->n:Ljava/lang/Object;

    iput-boolean p2, p0, La/pbp;->k:Z

    const/4 p1, 0x4

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/pbp;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, La/pbp;->n:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object v7, v3

    .line 14
    check-cast v7, La/w5z;

    .line 15
    .line 16
    iget-object v1, v0, La/pbp;->l:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v8, v1

    .line 19
    check-cast v8, La/rb60;

    .line 20
    .line 21
    iget-object v1, v0, La/pbp;->m:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v9, v1

    .line 24
    check-cast v9, La/rb60;

    .line 25
    .line 26
    iget-object v1, v0, La/pbp;->j:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v10, v1

    .line 29
    check-cast v10, La/rb60;

    .line 30
    .line 31
    sget-object v1, La/wne;->a:La/wne;

    .line 32
    .line 33
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    instance-of v1, v8, La/pb60;

    .line 37
    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    move-object v1, v8

    .line 41
    check-cast v1, La/pb60;

    .line 42
    .line 43
    iget-object v1, v1, La/pb60;->b:Ljava/lang/Throwable;

    .line 44
    .line 45
    invoke-static {v1}, La/hic;->C(Ljava/lang/Throwable;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-nez v1, :cond_2

    .line 50
    .line 51
    :cond_0
    instance-of v1, v9, La/pb60;

    .line 52
    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    move-object v1, v9

    .line 56
    check-cast v1, La/pb60;

    .line 57
    .line 58
    iget-object v1, v1, La/pb60;->b:Ljava/lang/Throwable;

    .line 59
    .line 60
    invoke-static {v1}, La/hic;->C(Ljava/lang/Throwable;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-nez v1, :cond_2

    .line 65
    .line 66
    :cond_1
    instance-of v1, v10, La/pb60;

    .line 67
    .line 68
    if-eqz v1, :cond_3

    .line 69
    .line 70
    move-object v1, v10

    .line 71
    check-cast v1, La/pb60;

    .line 72
    .line 73
    iget-object v1, v1, La/pb60;->b:Ljava/lang/Throwable;

    .line 74
    .line 75
    invoke-static {v1}, La/hic;->C(Ljava/lang/Throwable;)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_3

    .line 80
    .line 81
    :cond_2
    move v15, v5

    .line 82
    goto :goto_0

    .line 83
    :cond_3
    move v15, v4

    .line 84
    :goto_0
    new-instance v1, La/o8p;

    .line 85
    .line 86
    invoke-interface {v8}, La/rb60;->a()Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v12

    .line 90
    invoke-interface {v9}, La/rb60;->a()Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object v13

    .line 94
    invoke-interface {v10}, La/rb60;->a()Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v14

    .line 98
    iget-boolean v0, v0, La/pbp;->k:Z

    .line 99
    .line 100
    const/4 v2, 0x2

    .line 101
    if-eqz v0, :cond_4

    .line 102
    .line 103
    const/4 v0, 0x3

    .line 104
    new-array v0, v0, [La/rb60;

    .line 105
    .line 106
    aput-object v8, v0, v4

    .line 107
    .line 108
    aput-object v9, v0, v5

    .line 109
    .line 110
    aput-object v10, v0, v2

    .line 111
    .line 112
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    goto :goto_1

    .line 117
    :cond_4
    new-array v0, v2, [La/rb60;

    .line 118
    .line 119
    aput-object v8, v0, v4

    .line 120
    .line 121
    aput-object v9, v0, v5

    .line 122
    .line 123
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    :goto_1
    new-instance v6, La/enm;

    .line 128
    .line 129
    const/16 v11, 0x17

    .line 130
    .line 131
    invoke-direct/range {v6 .. v11}, La/enm;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    new-instance v2, Ljava/util/ArrayList;

    .line 138
    .line 139
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 140
    .line 141
    .line 142
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    :cond_5
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result v7

    .line 150
    if-eqz v7, :cond_6

    .line 151
    .line 152
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v7

    .line 156
    move-object v8, v7

    .line 157
    check-cast v8, La/rb60;

    .line 158
    .line 159
    invoke-virtual {v6, v8}, La/enm;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v8

    .line 163
    check-cast v8, Ljava/lang/Boolean;

    .line 164
    .line 165
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 166
    .line 167
    .line 168
    move-result v8

    .line 169
    if-nez v8, :cond_5

    .line 170
    .line 171
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_6
    new-instance v3, Ljava/util/ArrayList;

    .line 176
    .line 177
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 178
    .line 179
    .line 180
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    :cond_7
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 185
    .line 186
    .line 187
    move-result v7

    .line 188
    if-eqz v7, :cond_8

    .line 189
    .line 190
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v7

    .line 194
    move-object v8, v7

    .line 195
    check-cast v8, La/rb60;

    .line 196
    .line 197
    invoke-virtual {v6, v8}, La/enm;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v9

    .line 201
    check-cast v9, Ljava/lang/Boolean;

    .line 202
    .line 203
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 204
    .line 205
    .line 206
    move-result v9

    .line 207
    if-eqz v9, :cond_7

    .line 208
    .line 209
    invoke-interface {v8}, La/rb60;->a()Ljava/util/List;

    .line 210
    .line 211
    .line 212
    move-result-object v8

    .line 213
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 214
    .line 215
    .line 216
    move-result v8

    .line 217
    if-nez v8, :cond_7

    .line 218
    .line 219
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    goto :goto_3

    .line 223
    :cond_8
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    if-nez v0, :cond_c

    .line 228
    .line 229
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    if-eqz v0, :cond_c

    .line 234
    .line 235
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    if-eqz v0, :cond_9

    .line 240
    .line 241
    goto :goto_5

    .line 242
    :cond_9
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    :cond_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 247
    .line 248
    .line 249
    move-result v2

    .line 250
    if-eqz v2, :cond_c

    .line 251
    .line 252
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    check-cast v2, La/rb60;

    .line 257
    .line 258
    instance-of v3, v2, La/pb60;

    .line 259
    .line 260
    if-eqz v3, :cond_a

    .line 261
    .line 262
    check-cast v2, La/pb60;

    .line 263
    .line 264
    iget-object v2, v2, La/pb60;->b:Ljava/lang/Throwable;

    .line 265
    .line 266
    instance-of v3, v2, La/zhi0;

    .line 267
    .line 268
    if-nez v3, :cond_b

    .line 269
    .line 270
    instance-of v2, v2, La/hr30;

    .line 271
    .line 272
    if-eqz v2, :cond_a

    .line 273
    .line 274
    :cond_b
    move/from16 v16, v5

    .line 275
    .line 276
    :goto_4
    move-object v11, v1

    .line 277
    goto :goto_6

    .line 278
    :cond_c
    :goto_5
    move/from16 v16, v4

    .line 279
    .line 280
    goto :goto_4

    .line 281
    :goto_6
    invoke-direct/range {v11 .. v16}, La/o8p;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZ)V

    .line 282
    .line 283
    .line 284
    return-object v11

    .line 285
    :pswitch_0
    iget-object v1, v0, La/pbp;->l:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v1, La/cvo0;

    .line 288
    .line 289
    iget-object v6, v0, La/pbp;->j:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v6, Ljava/util/List;

    .line 292
    .line 293
    iget-object v7, v0, La/pbp;->m:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v7, La/sw00;

    .line 296
    .line 297
    sget-object v8, La/wne;->a:La/wne;

    .line 298
    .line 299
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    iget-boolean v7, v7, La/sw00;->a:Z

    .line 303
    .line 304
    if-eqz v7, :cond_13

    .line 305
    .line 306
    check-cast v3, La/kki;

    .line 307
    .line 308
    iget-object v3, v3, La/kki;->e:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast v3, La/f4u;

    .line 311
    .line 312
    iget-object v3, v3, La/f4u;->b:Ljava/lang/Object;

    .line 313
    .line 314
    check-cast v3, La/roi0;

    .line 315
    .line 316
    iget-object v3, v3, La/roi0;->a:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast v3, La/q7d0;

    .line 319
    .line 320
    const-string v7, "DAILY_EVENTS_DIALOG_SHOWN"

    .line 321
    .line 322
    invoke-static {v3, v7, v4}, La/axq;->z(La/q7d0;Ljava/lang/String;Z)Z

    .line 323
    .line 324
    .line 325
    move-result v3

    .line 326
    if-nez v3, :cond_13

    .line 327
    .line 328
    iget-boolean v0, v0, La/pbp;->k:Z

    .line 329
    .line 330
    if-nez v0, :cond_d

    .line 331
    .line 332
    goto :goto_8

    .line 333
    :cond_d
    instance-of v0, v1, La/bvo0;

    .line 334
    .line 335
    if-nez v0, :cond_12

    .line 336
    .line 337
    instance-of v0, v1, La/avo0;

    .line 338
    .line 339
    if-eqz v0, :cond_e

    .line 340
    .line 341
    goto :goto_7

    .line 342
    :cond_e
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    :cond_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 347
    .line 348
    .line 349
    move-result v1

    .line 350
    if-eqz v1, :cond_10

    .line 351
    .line 352
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v1

    .line 356
    move-object v3, v1

    .line 357
    check-cast v3, La/n85;

    .line 358
    .line 359
    iget-object v6, v3, La/n85;->g:La/wuo0;

    .line 360
    .line 361
    sget-object v7, La/wuo0;->b:La/wuo0;

    .line 362
    .line 363
    if-ne v6, v7, :cond_f

    .line 364
    .line 365
    invoke-virtual {v3}, La/ipm0;->f()Z

    .line 366
    .line 367
    .line 368
    move-result v3

    .line 369
    if-eqz v3, :cond_f

    .line 370
    .line 371
    move-object v2, v1

    .line 372
    :cond_10
    if-eqz v2, :cond_11

    .line 373
    .line 374
    move v4, v5

    .line 375
    :cond_11
    new-instance v0, La/v1j;

    .line 376
    .line 377
    invoke-direct {v0, v4}, La/v1j;-><init>(Z)V

    .line 378
    .line 379
    .line 380
    goto :goto_9

    .line 381
    :cond_12
    :goto_7
    sget-object v0, La/w1j;->a:La/w1j;

    .line 382
    .line 383
    goto :goto_9

    .line 384
    :cond_13
    :goto_8
    new-instance v0, La/v1j;

    .line 385
    .line 386
    invoke-direct {v0, v4}, La/v1j;-><init>(Z)V

    .line 387
    .line 388
    .line 389
    :goto_9
    return-object v0

    .line 390
    :pswitch_1
    check-cast v3, La/ccp;

    .line 391
    .line 392
    iget-object v1, v0, La/pbp;->l:Ljava/lang/Object;

    .line 393
    .line 394
    check-cast v1, La/kmq;

    .line 395
    .line 396
    iget-object v6, v0, La/pbp;->m:Ljava/lang/Object;

    .line 397
    .line 398
    check-cast v6, Lkotlin/Pair;

    .line 399
    .line 400
    iget-object v7, v0, La/pbp;->j:Ljava/lang/Object;

    .line 401
    .line 402
    move-object v12, v7

    .line 403
    check-cast v12, Ljava/util/List;

    .line 404
    .line 405
    sget-object v7, La/wne;->a:La/wne;

    .line 406
    .line 407
    iget-boolean v8, v0, La/pbp;->k:Z

    .line 408
    .line 409
    if-eqz v8, :cond_15

    .line 410
    .line 411
    if-ne v8, v5, :cond_14

    .line 412
    .line 413
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 414
    .line 415
    .line 416
    goto/16 :goto_b

    .line 417
    .line 418
    :cond_14
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 419
    .line 420
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    goto/16 :goto_c

    .line 424
    .line 425
    :cond_15
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 426
    .line 427
    .line 428
    sget v8, La/ccp;->u0:I

    .line 429
    .line 430
    invoke-virtual {v3, v6}, La/ccp;->O(Lkotlin/Pair;)Lkotlin/Pair;

    .line 431
    .line 432
    .line 433
    move-result-object v6

    .line 434
    iget-object v8, v3, La/ccp;->j0:La/nn60;

    .line 435
    .line 436
    iget-object v9, v6, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 437
    .line 438
    check-cast v9, Ljava/lang/Iterable;

    .line 439
    .line 440
    new-instance v10, Ljava/util/ArrayList;

    .line 441
    .line 442
    const/16 v11, 0xa

    .line 443
    .line 444
    invoke-static {v9, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 445
    .line 446
    .line 447
    move-result v11

    .line 448
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 449
    .line 450
    .line 451
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 452
    .line 453
    .line 454
    move-result-object v9

    .line 455
    :goto_a
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 456
    .line 457
    .line 458
    move-result v11

    .line 459
    if-eqz v11, :cond_16

    .line 460
    .line 461
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v11

    .line 465
    check-cast v11, La/i8p;

    .line 466
    .line 467
    iget-wide v13, v11, La/i8p;->a:J

    .line 468
    .line 469
    invoke-static {v13, v14, v10}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 470
    .line 471
    .line 472
    goto :goto_a

    .line 473
    :cond_16
    new-instance v9, La/xm60;

    .line 474
    .line 475
    invoke-direct {v9, v10}, La/xm60;-><init>(Ljava/util/ArrayList;)V

    .line 476
    .line 477
    .line 478
    new-array v10, v5, [La/en60;

    .line 479
    .line 480
    aput-object v9, v10, v4

    .line 481
    .line 482
    invoke-static {v3, v8, v10}, La/i3t0;->B(La/i3t0;La/j3t0;[Ljava/lang/Object;)La/bby;

    .line 483
    .line 484
    .line 485
    iget-object v4, v3, La/ccp;->E:La/o470;

    .line 486
    .line 487
    sget-object v8, La/wep;->b:La/wep;

    .line 488
    .line 489
    sget-object v9, La/iun;->a:La/iun;

    .line 490
    .line 491
    invoke-virtual {v3, v9, v9, v6, v12}, La/ccp;->M(Ljava/util/List;Ljava/util/List;Lkotlin/Pair;Ljava/util/List;)La/lc00;

    .line 492
    .line 493
    .line 494
    move-result-object v3

    .line 495
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 499
    .line 500
    .line 501
    iget-object v4, v4, La/o470;->a:Ljava/lang/Object;

    .line 502
    .line 503
    check-cast v4, La/rrc;

    .line 504
    .line 505
    invoke-virtual {v4, v8, v3}, La/rrc;->J(La/wep;Ljava/util/List;)V

    .line 506
    .line 507
    .line 508
    new-instance v8, La/ec80;

    .line 509
    .line 510
    iget-object v3, v6, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 511
    .line 512
    move-object v11, v3

    .line 513
    check-cast v11, Ljava/util/List;

    .line 514
    .line 515
    move-object v10, v9

    .line 516
    move-object v13, v9

    .line 517
    invoke-direct/range {v8 .. v13}, La/ec80;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 518
    .line 519
    .line 520
    iput-object v2, v0, La/pbp;->l:Ljava/lang/Object;

    .line 521
    .line 522
    iput-object v2, v0, La/pbp;->m:Ljava/lang/Object;

    .line 523
    .line 524
    iput-object v2, v0, La/pbp;->j:Ljava/lang/Object;

    .line 525
    .line 526
    iput-boolean v5, v0, La/pbp;->k:Z

    .line 527
    .line 528
    invoke-interface {v1, v8, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    if-ne v0, v7, :cond_17

    .line 533
    .line 534
    move-object v2, v7

    .line 535
    goto :goto_c

    .line 536
    :cond_17
    :goto_b
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 537
    .line 538
    :goto_c
    return-object v2

    .line 539
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/pbp;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/pbp;->n:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/rb60;

    .line 9
    .line 10
    check-cast p2, La/rb60;

    .line 11
    .line 12
    check-cast p3, La/rb60;

    .line 13
    .line 14
    check-cast p4, La/yje;

    .line 15
    .line 16
    new-instance v0, La/pbp;

    .line 17
    .line 18
    check-cast v1, La/w5z;

    .line 19
    .line 20
    iget-boolean p0, p0, La/pbp;->k:Z

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    invoke-direct {v0, v1, p0, p4, v2}, La/pbp;-><init>(Ljava/lang/Object;ZLa/yje;B)V

    .line 24
    .line 25
    .line 26
    iput-object p1, v0, La/pbp;->l:Ljava/lang/Object;

    .line 27
    .line 28
    iput-object p2, v0, La/pbp;->m:Ljava/lang/Object;

    .line 29
    .line 30
    iput-object p3, v0, La/pbp;->j:Ljava/lang/Object;

    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    invoke-virtual {v0, p0}, La/pbp;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :pswitch_0
    check-cast p1, La/cvo0;

    .line 40
    .line 41
    check-cast p2, Ljava/util/List;

    .line 42
    .line 43
    check-cast p3, La/sw00;

    .line 44
    .line 45
    check-cast p4, La/yje;

    .line 46
    .line 47
    new-instance v0, La/pbp;

    .line 48
    .line 49
    check-cast v1, La/kki;

    .line 50
    .line 51
    iget-boolean p0, p0, La/pbp;->k:Z

    .line 52
    .line 53
    const/4 v2, 0x1

    .line 54
    invoke-direct {v0, v1, p0, p4, v2}, La/pbp;-><init>(Ljava/lang/Object;ZLa/yje;B)V

    .line 55
    .line 56
    .line 57
    iput-object p1, v0, La/pbp;->l:Ljava/lang/Object;

    .line 58
    .line 59
    iput-object p2, v0, La/pbp;->j:Ljava/lang/Object;

    .line 60
    .line 61
    iput-object p3, v0, La/pbp;->m:Ljava/lang/Object;

    .line 62
    .line 63
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    invoke-virtual {v0, p0}, La/pbp;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0

    .line 70
    :pswitch_1
    check-cast p1, La/kmq;

    .line 71
    .line 72
    check-cast p2, Lkotlin/Pair;

    .line 73
    .line 74
    check-cast p3, Ljava/util/List;

    .line 75
    .line 76
    check-cast p4, La/yje;

    .line 77
    .line 78
    new-instance p0, La/pbp;

    .line 79
    .line 80
    check-cast v1, La/ccp;

    .line 81
    .line 82
    invoke-direct {p0, v1, p4}, La/pbp;-><init>(La/ccp;La/yje;)V

    .line 83
    .line 84
    .line 85
    iput-object p1, p0, La/pbp;->l:Ljava/lang/Object;

    .line 86
    .line 87
    iput-object p2, p0, La/pbp;->m:Ljava/lang/Object;

    .line 88
    .line 89
    iput-object p3, p0, La/pbp;->j:Ljava/lang/Object;

    .line 90
    .line 91
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 92
    .line 93
    invoke-virtual {p0, p1}, La/pbp;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
