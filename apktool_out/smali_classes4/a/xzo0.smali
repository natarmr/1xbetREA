.class public final synthetic La/xzo0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/b430;


# direct methods
.method public synthetic constructor <init>(La/b430;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xzo0;->a:B

    iput-object p1, p0, La/xzo0;->b:La/b430;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/xzo0;->a:B

    .line 4
    .line 5
    sget-object v2, La/l5l0;->a:La/l5l0;

    .line 6
    .line 7
    sget-object v3, La/i5l0;->a:La/i5l0;

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x0

    .line 11
    iget-object v0, v0, La/xzo0;->b:La/b430;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, La/b430;->n:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v7, v0

    .line 19
    check-cast v7, La/g2v;

    .line 20
    .line 21
    move-object/from16 v0, p1

    .line 22
    .line 23
    check-cast v0, La/izo0;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    if-eq v0, v1, :cond_2

    .line 36
    .line 37
    if-ne v0, v4, :cond_0

    .line 38
    .line 39
    sget-object v8, La/pb10;->g:La/pb10;

    .line 40
    .line 41
    sget-object v9, La/pdm;->b:La/pdm;

    .line 42
    .line 43
    const-wide/16 v18, 0x0

    .line 44
    .line 45
    const/16 v20, 0x3c4

    .line 46
    .line 47
    const/4 v10, 0x0

    .line 48
    const v11, 0x7f08082f

    .line 49
    .line 50
    .line 51
    const v12, 0x7f1314d1

    .line 52
    .line 53
    .line 54
    const v13, 0x7f1314d0

    .line 55
    .line 56
    .line 57
    const/4 v14, 0x0

    .line 58
    const/4 v15, 0x0

    .line 59
    const-wide/16 v16, 0x0

    .line 60
    .line 61
    invoke-static/range {v7 .. v20}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 67
    .line 68
    .line 69
    :cond_1
    const/4 v6, 0x0

    .line 70
    goto :goto_0

    .line 71
    :cond_2
    sget-object v8, La/pb10;->g:La/pb10;

    .line 72
    .line 73
    const-wide/16 v18, 0x0

    .line 74
    .line 75
    const/16 v20, 0x25e

    .line 76
    .line 77
    const/4 v9, 0x0

    .line 78
    const/4 v10, 0x0

    .line 79
    const/4 v11, 0x0

    .line 80
    const/4 v12, 0x0

    .line 81
    const v13, 0x7f130677

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const v15, 0x7f131690

    .line 86
    .line 87
    .line 88
    const-wide/16 v16, 0x2710

    .line 89
    .line 90
    invoke-static/range {v7 .. v20}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    :goto_0
    return-object v6

    .line 95
    :pswitch_0
    iget-object v0, v0, La/b430;->b:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v0, La/ctf0;

    .line 98
    .line 99
    move-object/from16 v1, p1

    .line 100
    .line 101
    check-cast v1, La/d0t;

    .line 102
    .line 103
    if-nez v1, :cond_3

    .line 104
    .line 105
    const/4 v6, 0x0

    .line 106
    goto :goto_1

    .line 107
    :cond_3
    new-instance v6, La/c0p0;

    .line 108
    .line 109
    new-array v1, v5, [Ljava/lang/Object;

    .line 110
    .line 111
    iget-object v2, v0, La/ctf0;->b:La/lsm0;

    .line 112
    .line 113
    invoke-static {v1, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    const v3, 0x7f1314a0

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    new-instance v7, La/wul;

    .line 125
    .line 126
    sget-object v8, La/nul;->e:La/nul;

    .line 127
    .line 128
    sget-object v9, La/oe9;->a:La/oe9;

    .line 129
    .line 130
    new-instance v10, La/ue9;

    .line 131
    .line 132
    new-array v2, v5, [Ljava/lang/Object;

    .line 133
    .line 134
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 135
    .line 136
    invoke-static {v2, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    const v3, 0x7f1314a3

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-direct {v10, v0}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    const/4 v12, 0x0

    .line 151
    const/4 v13, 0x0

    .line 152
    const/4 v11, 0x1

    .line 153
    invoke-direct/range {v7 .. v13}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 154
    .line 155
    .line 156
    invoke-direct {v6, v1, v7}, La/c0p0;-><init>(Ljava/lang/String;La/wul;)V

    .line 157
    .line 158
    .line 159
    :goto_1
    return-object v6

    .line 160
    :pswitch_1
    move-object/from16 v1, p1

    .line 161
    .line 162
    check-cast v1, La/d0t;

    .line 163
    .line 164
    if-nez v1, :cond_4

    .line 165
    .line 166
    const/4 v6, 0x0

    .line 167
    goto :goto_2

    .line 168
    :cond_4
    new-instance v6, La/l0p0;

    .line 169
    .line 170
    new-instance v7, La/hjm;

    .line 171
    .line 172
    iget-object v0, v0, La/b430;->b:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v0, La/ctf0;

    .line 175
    .line 176
    new-array v1, v5, [Ljava/lang/Object;

    .line 177
    .line 178
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 179
    .line 180
    invoke-static {v1, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    const v2, 0x7f1314a1

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v8

    .line 191
    const/16 v19, 0x0

    .line 192
    .line 193
    const/16 v20, 0x1ffe

    .line 194
    .line 195
    const/4 v9, 0x0

    .line 196
    const/4 v10, 0x0

    .line 197
    const/4 v11, 0x0

    .line 198
    const/4 v12, 0x0

    .line 199
    const/4 v13, 0x0

    .line 200
    const/4 v14, 0x0

    .line 201
    const/4 v15, 0x0

    .line 202
    const/16 v16, 0x0

    .line 203
    .line 204
    const/16 v17, 0x0

    .line 205
    .line 206
    const/16 v18, 0x0

    .line 207
    .line 208
    invoke-direct/range {v7 .. v20}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 209
    .line 210
    .line 211
    const-string v0, "TEAM_BET_EXPRESS_HEADER"

    .line 212
    .line 213
    invoke-direct {v6, v0, v7}, La/l0p0;-><init>(Ljava/lang/String;La/jjm;)V

    .line 214
    .line 215
    .line 216
    :goto_2
    return-object v6

    .line 217
    :pswitch_2
    move-object/from16 v1, p1

    .line 218
    .line 219
    check-cast v1, Ljava/util/List;

    .line 220
    .line 221
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    iget-object v7, v0, La/b430;->c:La/n0o0;

    .line 225
    .line 226
    invoke-virtual {v7}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v7

    .line 230
    check-cast v7, La/fee;

    .line 231
    .line 232
    invoke-virtual {v7}, La/fee;->c()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v7

    .line 236
    check-cast v7, La/nzo0;

    .line 237
    .line 238
    if-nez v7, :cond_5

    .line 239
    .line 240
    sget-object v0, La/lak0;->c:La/lak0;

    .line 241
    .line 242
    goto/16 :goto_d

    .line 243
    .line 244
    :cond_5
    iget-object v8, v7, La/nzo0;->b:Ljava/util/List;

    .line 245
    .line 246
    new-instance v9, Ljava/util/ArrayList;

    .line 247
    .line 248
    const/16 v10, 0xa

    .line 249
    .line 250
    invoke-static {v1, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 251
    .line 252
    .line 253
    move-result v11

    .line 254
    invoke-direct {v9, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 255
    .line 256
    .line 257
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 262
    .line 263
    .line 264
    move-result v11

    .line 265
    if-eqz v11, :cond_10

    .line 266
    .line 267
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v11

    .line 271
    move-object v12, v11

    .line 272
    check-cast v12, La/d0t;

    .line 273
    .line 274
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 275
    .line 276
    .line 277
    move-result-object v11

    .line 278
    :cond_6
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 279
    .line 280
    .line 281
    move-result v13

    .line 282
    if-eqz v13, :cond_7

    .line 283
    .line 284
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v13

    .line 288
    move-object v14, v13

    .line 289
    check-cast v14, La/lok0;

    .line 290
    .line 291
    iget v14, v14, La/lok0;->a:I

    .line 292
    .line 293
    iget v15, v12, La/d0t;->O:I

    .line 294
    .line 295
    if-ne v14, v15, :cond_6

    .line 296
    .line 297
    goto :goto_4

    .line 298
    :cond_7
    const/4 v13, 0x0

    .line 299
    :goto_4
    check-cast v13, La/lok0;

    .line 300
    .line 301
    iget-object v11, v0, La/b430;->b:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v11, La/ctf0;

    .line 304
    .line 305
    iget-object v14, v0, La/b430;->m:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v14, La/y78;

    .line 308
    .line 309
    iget-boolean v15, v7, La/nzo0;->d:Z

    .line 310
    .line 311
    iget-boolean v6, v7, La/nzo0;->e:Z

    .line 312
    .line 313
    iget-object v5, v7, La/nzo0;->a:La/wcb;

    .line 314
    .line 315
    if-eqz v5, :cond_8

    .line 316
    .line 317
    move-object/from16 v16, v11

    .line 318
    .line 319
    iget-wide v10, v12, La/d0t;->v:J

    .line 320
    .line 321
    move-object/from16 v28, v1

    .line 322
    .line 323
    move-object/from16 v27, v2

    .line 324
    .line 325
    iget-wide v1, v12, La/d0t;->u:J

    .line 326
    .line 327
    invoke-virtual {v5, v10, v11, v1, v2}, La/wcb;->a(JJ)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    goto :goto_5

    .line 332
    :cond_8
    move-object/from16 v28, v1

    .line 333
    .line 334
    move-object/from16 v27, v2

    .line 335
    .line 336
    move-object/from16 v16, v11

    .line 337
    .line 338
    const/4 v1, 0x0

    .line 339
    :goto_5
    const-string v2, ""

    .line 340
    .line 341
    if-nez v1, :cond_9

    .line 342
    .line 343
    move-object/from16 v17, v2

    .line 344
    .line 345
    goto :goto_6

    .line 346
    :cond_9
    move-object/from16 v17, v1

    .line 347
    .line 348
    :goto_6
    new-instance v1, Ljava/util/ArrayList;

    .line 349
    .line 350
    const/16 v5, 0xa

    .line 351
    .line 352
    invoke-static {v8, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 353
    .line 354
    .line 355
    move-result v10

    .line 356
    invoke-direct {v1, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 357
    .line 358
    .line 359
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 360
    .line 361
    .line 362
    move-result-object v10

    .line 363
    :goto_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 364
    .line 365
    .line 366
    move-result v11

    .line 367
    if-eqz v11, :cond_a

    .line 368
    .line 369
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v11

    .line 373
    check-cast v11, La/lok0;

    .line 374
    .line 375
    iget v11, v11, La/lok0;->a:I

    .line 376
    .line 377
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 378
    .line 379
    .line 380
    move-result-object v11

    .line 381
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    goto :goto_7

    .line 385
    :cond_a
    if-eqz v13, :cond_b

    .line 386
    .line 387
    iget-boolean v10, v13, La/lok0;->n:Z

    .line 388
    .line 389
    move/from16 v20, v10

    .line 390
    .line 391
    goto :goto_8

    .line 392
    :cond_b
    const/16 v20, 0x0

    .line 393
    .line 394
    :goto_8
    if-eqz v13, :cond_c

    .line 395
    .line 396
    iget-boolean v10, v13, La/lok0;->p:Z

    .line 397
    .line 398
    move/from16 v21, v10

    .line 399
    .line 400
    goto :goto_9

    .line 401
    :cond_c
    const/16 v21, 0x0

    .line 402
    .line 403
    :goto_9
    iget-object v10, v7, La/nzo0;->c:La/v5l0;

    .line 404
    .line 405
    iget-object v11, v12, La/d0t;->K:Ljava/util/List;

    .line 406
    .line 407
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 408
    .line 409
    .line 410
    move-result v11

    .line 411
    if-eqz v11, :cond_d

    .line 412
    .line 413
    move-object/from16 v24, v3

    .line 414
    .line 415
    goto :goto_a

    .line 416
    :cond_d
    move-object/from16 v24, v27

    .line 417
    .line 418
    :goto_a
    if-eqz v13, :cond_e

    .line 419
    .line 420
    iget-object v11, v13, La/lok0;->u:Ljava/lang/String;

    .line 421
    .line 422
    goto :goto_b

    .line 423
    :cond_e
    const/4 v11, 0x0

    .line 424
    :goto_b
    if-nez v11, :cond_f

    .line 425
    .line 426
    move-object/from16 v25, v2

    .line 427
    .line 428
    goto :goto_c

    .line 429
    :cond_f
    move-object/from16 v25, v11

    .line 430
    .line 431
    :goto_c
    iget-boolean v2, v7, La/nzo0;->f:Z

    .line 432
    .line 433
    const/16 v18, 0x0

    .line 434
    .line 435
    const/16 v22, 0x0

    .line 436
    .line 437
    move-object/from16 v19, v1

    .line 438
    .line 439
    move/from16 v26, v2

    .line 440
    .line 441
    move-object/from16 v23, v10

    .line 442
    .line 443
    move-object/from16 v13, v16

    .line 444
    .line 445
    move/from16 v16, v6

    .line 446
    .line 447
    invoke-static/range {v12 .. v26}, La/wwb;->V(La/d0t;La/ctf0;La/y78;ZZLjava/lang/String;ZLjava/util/List;ZZZLa/v5l0;La/m5l0;Ljava/lang/String;Z)La/a2n;

    .line 448
    .line 449
    .line 450
    move-result-object v1

    .line 451
    iget-boolean v2, v7, La/nzo0;->f:Z

    .line 452
    .line 453
    new-instance v6, La/qyo0;

    .line 454
    .line 455
    invoke-direct {v6, v1, v2}, La/qyo0;-><init>(La/a2n;Z)V

    .line 456
    .line 457
    .line 458
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 459
    .line 460
    .line 461
    move v10, v5

    .line 462
    move-object/from16 v2, v27

    .line 463
    .line 464
    move-object/from16 v1, v28

    .line 465
    .line 466
    const/4 v5, 0x0

    .line 467
    goto/16 :goto_3

    .line 468
    .line 469
    :cond_10
    invoke-static {v9, v4}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    :goto_d
    return-object v0

    .line 478
    :pswitch_3
    iget-object v0, v0, La/b430;->b:Ljava/lang/Object;

    .line 479
    .line 480
    check-cast v0, La/ctf0;

    .line 481
    .line 482
    move-object/from16 v1, p1

    .line 483
    .line 484
    check-cast v1, Ljava/util/List;

    .line 485
    .line 486
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 490
    .line 491
    .line 492
    move-result v2

    .line 493
    if-eqz v2, :cond_11

    .line 494
    .line 495
    const/4 v6, 0x0

    .line 496
    goto :goto_f

    .line 497
    :cond_11
    new-instance v2, La/l0p0;

    .line 498
    .line 499
    new-instance v5, La/hjm;

    .line 500
    .line 501
    const/4 v3, 0x0

    .line 502
    new-array v6, v3, [Ljava/lang/Object;

    .line 503
    .line 504
    iget-object v7, v0, La/ctf0;->b:La/lsm0;

    .line 505
    .line 506
    invoke-static {v6, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v6

    .line 510
    const v8, 0x7f131705

    .line 511
    .line 512
    .line 513
    invoke-virtual {v7, v8, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v6

    .line 517
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 518
    .line 519
    .line 520
    move-result v1

    .line 521
    if-le v1, v4, :cond_12

    .line 522
    .line 523
    new-instance v1, La/ue9;

    .line 524
    .line 525
    new-array v4, v3, [Ljava/lang/Object;

    .line 526
    .line 527
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 528
    .line 529
    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v3

    .line 533
    const v4, 0x7f1300e4

    .line 534
    .line 535
    .line 536
    invoke-virtual {v0, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    invoke-direct {v1, v0}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 541
    .line 542
    .line 543
    move-object/from16 v16, v1

    .line 544
    .line 545
    goto :goto_e

    .line 546
    :cond_12
    const/16 v16, 0x0

    .line 547
    .line 548
    :goto_e
    const/16 v17, 0x0

    .line 549
    .line 550
    const/16 v18, 0x1bfe

    .line 551
    .line 552
    const/4 v7, 0x0

    .line 553
    const/4 v8, 0x0

    .line 554
    const/4 v9, 0x0

    .line 555
    const/4 v10, 0x0

    .line 556
    const/4 v11, 0x0

    .line 557
    const/4 v12, 0x0

    .line 558
    const/4 v13, 0x0

    .line 559
    const/4 v14, 0x0

    .line 560
    const/4 v15, 0x0

    .line 561
    invoke-direct/range {v5 .. v18}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 562
    .line 563
    .line 564
    const-string v0, "TEAM_BET_UPCOMING_HEADER"

    .line 565
    .line 566
    invoke-direct {v2, v0, v5}, La/l0p0;-><init>(Ljava/lang/String;La/jjm;)V

    .line 567
    .line 568
    .line 569
    move-object v6, v2

    .line 570
    :goto_f
    return-object v6

    .line 571
    :pswitch_4
    move-object/from16 v27, v2

    .line 572
    .line 573
    move-object/from16 v7, p1

    .line 574
    .line 575
    check-cast v7, La/d0t;

    .line 576
    .line 577
    if-nez v7, :cond_13

    .line 578
    .line 579
    goto :goto_10

    .line 580
    :cond_13
    iget-object v1, v0, La/b430;->c:La/n0o0;

    .line 581
    .line 582
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object v1

    .line 586
    check-cast v1, La/fee;

    .line 587
    .line 588
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v1

    .line 592
    check-cast v1, La/nzo0;

    .line 593
    .line 594
    if-nez v1, :cond_14

    .line 595
    .line 596
    :goto_10
    const/4 v6, 0x0

    .line 597
    goto :goto_14

    .line 598
    :cond_14
    new-instance v6, La/b1p0;

    .line 599
    .line 600
    iget-boolean v2, v7, La/d0t;->C:Z

    .line 601
    .line 602
    iget-object v4, v7, La/d0t;->K:Ljava/util/List;

    .line 603
    .line 604
    iget-object v8, v1, La/nzo0;->c:La/v5l0;

    .line 605
    .line 606
    if-eqz v2, :cond_16

    .line 607
    .line 608
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 609
    .line 610
    .line 611
    move-result v2

    .line 612
    if-eqz v2, :cond_15

    .line 613
    .line 614
    move-object v9, v3

    .line 615
    goto :goto_11

    .line 616
    :cond_15
    move-object/from16 v9, v27

    .line 617
    .line 618
    :goto_11
    iget-object v2, v0, La/b430;->b:Ljava/lang/Object;

    .line 619
    .line 620
    move-object v10, v2

    .line 621
    check-cast v10, La/ctf0;

    .line 622
    .line 623
    iget-boolean v11, v1, La/nzo0;->d:Z

    .line 624
    .line 625
    iget-object v0, v0, La/b430;->m:Ljava/lang/Object;

    .line 626
    .line 627
    move-object v12, v0

    .line 628
    check-cast v12, La/y78;

    .line 629
    .line 630
    iget-boolean v13, v1, La/nzo0;->e:Z

    .line 631
    .line 632
    iget-boolean v14, v1, La/nzo0;->f:Z

    .line 633
    .line 634
    invoke-static/range {v7 .. v14}, La/cww;->R(La/d0t;La/v5l0;La/m5l0;La/ctf0;ZLa/y78;ZZ)La/zfa;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    goto :goto_13

    .line 639
    :cond_16
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 640
    .line 641
    .line 642
    move-result v2

    .line 643
    if-eqz v2, :cond_17

    .line 644
    .line 645
    move-object v2, v3

    .line 646
    goto :goto_12

    .line 647
    :cond_17
    move-object/from16 v2, v27

    .line 648
    .line 649
    :goto_12
    iget-object v0, v0, La/b430;->b:Ljava/lang/Object;

    .line 650
    .line 651
    check-cast v0, La/ctf0;

    .line 652
    .line 653
    iget-boolean v3, v1, La/nzo0;->d:Z

    .line 654
    .line 655
    invoke-static {v7, v8, v2, v0, v3}, La/zvw;->g0(La/d0t;La/v5l0;La/m5l0;La/ctf0;Z)La/tfa;

    .line 656
    .line 657
    .line 658
    move-result-object v0

    .line 659
    :goto_13
    iget-boolean v1, v1, La/nzo0;->f:Z

    .line 660
    .line 661
    invoke-direct {v6, v0, v1}, La/b1p0;-><init>(La/gga;Z)V

    .line 662
    .line 663
    .line 664
    :goto_14
    return-object v6

    .line 665
    :pswitch_5
    move-object/from16 v1, p1

    .line 666
    .line 667
    check-cast v1, La/d0t;

    .line 668
    .line 669
    if-nez v1, :cond_18

    .line 670
    .line 671
    const/4 v6, 0x0

    .line 672
    goto :goto_15

    .line 673
    :cond_18
    new-instance v6, La/l0p0;

    .line 674
    .line 675
    new-instance v7, La/hjm;

    .line 676
    .line 677
    iget-object v0, v0, La/b430;->b:Ljava/lang/Object;

    .line 678
    .line 679
    check-cast v0, La/ctf0;

    .line 680
    .line 681
    const/4 v3, 0x0

    .line 682
    new-array v1, v3, [Ljava/lang/Object;

    .line 683
    .line 684
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 685
    .line 686
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    move-result-object v1

    .line 690
    const v2, 0x7f1314bc

    .line 691
    .line 692
    .line 693
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 694
    .line 695
    .line 696
    move-result-object v8

    .line 697
    const/16 v19, 0x0

    .line 698
    .line 699
    const/16 v20, 0x1ffe

    .line 700
    .line 701
    const/4 v9, 0x0

    .line 702
    const/4 v10, 0x0

    .line 703
    const/4 v11, 0x0

    .line 704
    const/4 v12, 0x0

    .line 705
    const/4 v13, 0x0

    .line 706
    const/4 v14, 0x0

    .line 707
    const/4 v15, 0x0

    .line 708
    const/16 v16, 0x0

    .line 709
    .line 710
    const/16 v17, 0x0

    .line 711
    .line 712
    const/16 v18, 0x0

    .line 713
    .line 714
    invoke-direct/range {v7 .. v20}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 715
    .line 716
    .line 717
    const-string v0, "TEAM_BET_NEAREST_HEADER"

    .line 718
    .line 719
    invoke-direct {v6, v0, v7}, La/l0p0;-><init>(Ljava/lang/String;La/jjm;)V

    .line 720
    .line 721
    .line 722
    :goto_15
    return-object v6

    .line 723
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
