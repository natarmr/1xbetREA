.class public final synthetic La/ge2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ctf0;

.field public final synthetic c:La/y78;


# direct methods
.method public synthetic constructor <init>(La/ctf0;La/y78;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ge2;->a:B

    iput-object p1, p0, La/ge2;->b:La/ctf0;

    iput-object p2, p0, La/ge2;->c:La/y78;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ge2;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/ge2;->c:La/y78;

    .line 6
    .line 7
    iget-object v4, v0, La/ge2;->b:La/ctf0;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v0, p1

    .line 13
    .line 14
    check-cast v0, La/ser0;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance v1, La/zer0;

    .line 20
    .line 21
    invoke-direct {v1, v0, v4, v2}, La/zer0;-><init>(La/ser0;La/ctf0;La/y78;)V

    .line 22
    .line 23
    .line 24
    return-object v1

    .line 25
    :pswitch_0
    move-object/from16 v1, p1

    .line 26
    .line 27
    check-cast v1, La/vzg0;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    const-string v2, "SAVED_STATE_SHOW_TYPE"

    .line 33
    .line 34
    sget-object v3, La/dhh0;->d:La/dhh0;

    .line 35
    .line 36
    invoke-static {v1, v2, v3}, La/a8k0;->H(La/vzg0;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    move-object v9, v1

    .line 41
    check-cast v9, La/dhh0;

    .line 42
    .line 43
    new-instance v2, La/hpl0;

    .line 44
    .line 45
    const/16 v19, 0x0

    .line 46
    .line 47
    const/16 v20, 0x0

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    const/4 v4, 0x0

    .line 51
    const-string v5, ""

    .line 52
    .line 53
    const-string v6, ""

    .line 54
    .line 55
    const/4 v7, 0x0

    .line 56
    sget-object v8, La/bnf0;->a:La/bnf0;

    .line 57
    .line 58
    sget-object v10, La/phh0;->a:La/phh0;

    .line 59
    .line 60
    iget-object v12, v0, La/ge2;->b:La/ctf0;

    .line 61
    .line 62
    iget-object v13, v0, La/ge2;->c:La/y78;

    .line 63
    .line 64
    const/4 v14, 0x0

    .line 65
    const/4 v15, 0x0

    .line 66
    const/16 v16, 0x0

    .line 67
    .line 68
    const/16 v17, 0x0

    .line 69
    .line 70
    const/16 v18, 0x0

    .line 71
    .line 72
    move-object v11, v10

    .line 73
    invoke-direct/range {v2 .. v20}, La/hpl0;-><init>(ZZLjava/lang/String;Ljava/lang/String;ZLa/dnf0;La/dhh0;La/thh0;La/thh0;La/ctf0;La/y78;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;La/wcb;La/v5l0;Z)V

    .line 74
    .line 75
    .line 76
    return-object v2

    .line 77
    :pswitch_1
    move-object/from16 v1, p1

    .line 78
    .line 79
    check-cast v1, La/aef0;

    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    iget-object v14, v1, La/aef0;->d:La/v5l0;

    .line 85
    .line 86
    iget-object v2, v1, La/aef0;->a:Ljava/util/List;

    .line 87
    .line 88
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4}, La/ctf0;->j()Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    const/4 v5, 0x1

    .line 96
    const/4 v6, 0x2

    .line 97
    if-eqz v3, :cond_0

    .line 98
    .line 99
    move v7, v6

    .line 100
    goto :goto_0

    .line 101
    :cond_0
    move v7, v5

    .line 102
    :goto_0
    iget v8, v1, La/aef0;->e:I

    .line 103
    .line 104
    iget-boolean v9, v1, La/aef0;->k:Z

    .line 105
    .line 106
    iget-object v10, v1, La/aef0;->i:La/wcb;

    .line 107
    .line 108
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 109
    .line 110
    .line 111
    move-result v11

    .line 112
    const/16 v18, 0x0

    .line 113
    .line 114
    const/16 v19, 0x0

    .line 115
    .line 116
    if-nez v11, :cond_d

    .line 117
    .line 118
    if-eqz v10, :cond_d

    .line 119
    .line 120
    new-instance v3, La/bef0;

    .line 121
    .line 122
    iget-object v5, v1, La/aef0;->h:Ljava/util/List;

    .line 123
    .line 124
    move v6, v7

    .line 125
    iget-boolean v7, v1, La/aef0;->f:Z

    .line 126
    .line 127
    move v8, v6

    .line 128
    iget-boolean v6, v1, La/aef0;->g:Z

    .line 129
    .line 130
    iget-boolean v1, v1, La/aef0;->k:Z

    .line 131
    .line 132
    new-instance v11, Ljava/util/ArrayList;

    .line 133
    .line 134
    const/16 v12, 0xa

    .line 135
    .line 136
    invoke-static {v2, v12}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 137
    .line 138
    .line 139
    move-result v13

    .line 140
    invoke-direct {v11, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 141
    .line 142
    .line 143
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v13

    .line 151
    if-eqz v13, :cond_c

    .line 152
    .line 153
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v13

    .line 157
    check-cast v13, La/d0t;

    .line 158
    .line 159
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object v15

    .line 163
    :goto_2
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v16

    .line 167
    if-eqz v16, :cond_2

    .line 168
    .line 169
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v16

    .line 173
    move-object/from16 v12, v16

    .line 174
    .line 175
    check-cast v12, La/lok0;

    .line 176
    .line 177
    iget v12, v12, La/lok0;->a:I

    .line 178
    .line 179
    move/from16 v17, v1

    .line 180
    .line 181
    iget v1, v13, La/d0t;->O:I

    .line 182
    .line 183
    if-ne v12, v1, :cond_1

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_1
    move/from16 v1, v17

    .line 187
    .line 188
    const/16 v12, 0xa

    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_2
    move/from16 v17, v1

    .line 192
    .line 193
    move-object/from16 v16, v18

    .line 194
    .line 195
    :goto_3
    move-object/from16 v1, v16

    .line 196
    .line 197
    check-cast v1, La/lok0;

    .line 198
    .line 199
    move-object/from16 v20, v2

    .line 200
    .line 201
    move-object v12, v3

    .line 202
    iget-wide v2, v13, La/d0t;->v:J

    .line 203
    .line 204
    move/from16 v16, v6

    .line 205
    .line 206
    move v15, v7

    .line 207
    iget-wide v6, v13, La/d0t;->u:J

    .line 208
    .line 209
    invoke-virtual {v10, v2, v3, v6, v7}, La/wcb;->a(JJ)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    move-object v3, v10

    .line 214
    new-instance v10, Ljava/util/ArrayList;

    .line 215
    .line 216
    const/16 v6, 0xa

    .line 217
    .line 218
    invoke-static {v5, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 219
    .line 220
    .line 221
    move-result v7

    .line 222
    invoke-direct {v10, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 223
    .line 224
    .line 225
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 226
    .line 227
    .line 228
    move-result-object v7

    .line 229
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 230
    .line 231
    .line 232
    move-result v21

    .line 233
    if-eqz v21, :cond_3

    .line 234
    .line 235
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v21

    .line 239
    move-object/from16 v6, v21

    .line 240
    .line 241
    check-cast v6, La/lok0;

    .line 242
    .line 243
    iget v6, v6, La/lok0;->a:I

    .line 244
    .line 245
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    const/16 v6, 0xa

    .line 253
    .line 254
    goto :goto_4

    .line 255
    :cond_3
    if-eqz v1, :cond_4

    .line 256
    .line 257
    iget-boolean v6, v1, La/lok0;->n:Z

    .line 258
    .line 259
    goto :goto_5

    .line 260
    :cond_4
    move/from16 v6, v19

    .line 261
    .line 262
    :goto_5
    if-eqz v1, :cond_5

    .line 263
    .line 264
    iget-boolean v7, v1, La/lok0;->p:Z

    .line 265
    .line 266
    :goto_6
    move-object/from16 v21, v2

    .line 267
    .line 268
    goto :goto_7

    .line 269
    :cond_5
    move/from16 v7, v19

    .line 270
    .line 271
    goto :goto_6

    .line 272
    :goto_7
    iget-object v2, v13, La/d0t;->K:Ljava/util/List;

    .line 273
    .line 274
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 275
    .line 276
    .line 277
    move-result v2

    .line 278
    if-eqz v2, :cond_9

    .line 279
    .line 280
    iget-object v2, v13, La/d0t;->k:Ljava/util/List;

    .line 281
    .line 282
    if-eqz v2, :cond_6

    .line 283
    .line 284
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 285
    .line 286
    .line 287
    move-result v22

    .line 288
    if-eqz v22, :cond_6

    .line 289
    .line 290
    goto :goto_9

    .line 291
    :cond_6
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 296
    .line 297
    .line 298
    move-result v22

    .line 299
    if-eqz v22, :cond_8

    .line 300
    .line 301
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v22

    .line 305
    move-object/from16 v23, v2

    .line 306
    .line 307
    move-object/from16 v2, v22

    .line 308
    .line 309
    check-cast v2, La/d0t;

    .line 310
    .line 311
    iget-object v2, v2, La/d0t;->K:Ljava/util/List;

    .line 312
    .line 313
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 314
    .line 315
    .line 316
    move-result v2

    .line 317
    if-nez v2, :cond_7

    .line 318
    .line 319
    goto :goto_a

    .line 320
    :cond_7
    move-object/from16 v2, v23

    .line 321
    .line 322
    goto :goto_8

    .line 323
    :cond_8
    :goto_9
    sget-object v2, La/i5l0;->a:La/i5l0;

    .line 324
    .line 325
    goto :goto_b

    .line 326
    :cond_9
    :goto_a
    sget-object v2, La/l5l0;->a:La/l5l0;

    .line 327
    .line 328
    :goto_b
    if-eqz v1, :cond_a

    .line 329
    .line 330
    iget-object v1, v1, La/lok0;->u:Ljava/lang/String;

    .line 331
    .line 332
    goto :goto_c

    .line 333
    :cond_a
    move-object/from16 v1, v18

    .line 334
    .line 335
    :goto_c
    if-nez v1, :cond_b

    .line 336
    .line 337
    const-string v1, ""

    .line 338
    .line 339
    :cond_b
    move-object/from16 v22, v5

    .line 340
    .line 341
    iget-object v5, v0, La/ge2;->c:La/y78;

    .line 342
    .line 343
    move/from16 v23, v9

    .line 344
    .line 345
    const/4 v9, 0x0

    .line 346
    move-object/from16 v24, v3

    .line 347
    .line 348
    move-object v3, v13

    .line 349
    const/4 v13, 0x1

    .line 350
    move v0, v15

    .line 351
    move-object v15, v2

    .line 352
    move v2, v8

    .line 353
    move-object/from16 v8, v21

    .line 354
    .line 355
    move-object/from16 v21, v12

    .line 356
    .line 357
    move v12, v7

    .line 358
    move v7, v0

    .line 359
    move-object v0, v11

    .line 360
    move v11, v6

    .line 361
    move/from16 v6, v16

    .line 362
    .line 363
    move-object/from16 v16, v1

    .line 364
    .line 365
    move/from16 v1, v23

    .line 366
    .line 367
    const/16 v23, 0xa

    .line 368
    .line 369
    invoke-static/range {v3 .. v17}, La/wwb;->V(La/d0t;La/ctf0;La/y78;ZZLjava/lang/String;ZLjava/util/List;ZZZLa/v5l0;La/m5l0;Ljava/lang/String;Z)La/a2n;

    .line 370
    .line 371
    .line 372
    move-result-object v3

    .line 373
    move/from16 v16, v6

    .line 374
    .line 375
    move v15, v7

    .line 376
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    move-object v11, v0

    .line 380
    move v9, v1

    .line 381
    move v8, v2

    .line 382
    move/from16 v1, v17

    .line 383
    .line 384
    move-object/from16 v2, v20

    .line 385
    .line 386
    move-object/from16 v3, v21

    .line 387
    .line 388
    move-object/from16 v5, v22

    .line 389
    .line 390
    move/from16 v12, v23

    .line 391
    .line 392
    move-object/from16 v10, v24

    .line 393
    .line 394
    move-object/from16 v0, p0

    .line 395
    .line 396
    goto/16 :goto_1

    .line 397
    .line 398
    :cond_c
    move-object/from16 v21, v3

    .line 399
    .line 400
    move v2, v8

    .line 401
    move v1, v9

    .line 402
    move-object v0, v11

    .line 403
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    move-object/from16 v12, v21

    .line 408
    .line 409
    invoke-direct {v12, v0, v2, v1}, La/bef0;-><init>(La/a4x;IZ)V

    .line 410
    .line 411
    .line 412
    move-object/from16 v18, v12

    .line 413
    .line 414
    goto/16 :goto_12

    .line 415
    .line 416
    :cond_d
    move v2, v7

    .line 417
    move v0, v9

    .line 418
    move-object/from16 v24, v10

    .line 419
    .line 420
    iget-boolean v4, v1, La/aef0;->c:Z

    .line 421
    .line 422
    if-eqz v4, :cond_e

    .line 423
    .line 424
    new-instance v25, La/mdm;

    .line 425
    .line 426
    sget-object v0, La/pb10;->c:La/xuz;

    .line 427
    .line 428
    sget-object v1, La/pb10;->g:La/pb10;

    .line 429
    .line 430
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 431
    .line 432
    .line 433
    invoke-static {v1, v8}, La/xuz;->a(La/pb10;I)I

    .line 434
    .line 435
    .line 436
    move-result v26

    .line 437
    const-wide/16 v36, 0x0

    .line 438
    .line 439
    const/16 v38, 0x25e

    .line 440
    .line 441
    const/16 v27, 0x0

    .line 442
    .line 443
    const/16 v28, 0x0

    .line 444
    .line 445
    const/16 v29, 0x0

    .line 446
    .line 447
    const/16 v30, 0x0

    .line 448
    .line 449
    const v31, 0x7f130677

    .line 450
    .line 451
    .line 452
    const/16 v32, 0x0

    .line 453
    .line 454
    const v33, 0x7f131690

    .line 455
    .line 456
    .line 457
    const-wide/16 v34, 0x2710

    .line 458
    .line 459
    invoke-direct/range {v25 .. v38}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 460
    .line 461
    .line 462
    move-object/from16 v0, v25

    .line 463
    .line 464
    new-instance v1, La/cef0;

    .line 465
    .line 466
    invoke-direct {v1, v0}, La/cef0;-><init>(La/mdm;)V

    .line 467
    .line 468
    .line 469
    :goto_d
    move-object/from16 v18, v1

    .line 470
    .line 471
    goto/16 :goto_12

    .line 472
    .line 473
    :cond_e
    iget-boolean v1, v1, La/aef0;->b:Z

    .line 474
    .line 475
    if-nez v1, :cond_10

    .line 476
    .line 477
    if-nez v24, :cond_f

    .line 478
    .line 479
    goto :goto_e

    .line 480
    :cond_f
    new-instance v25, La/mdm;

    .line 481
    .line 482
    sget-object v0, La/pb10;->c:La/xuz;

    .line 483
    .line 484
    sget-object v1, La/pb10;->g:La/pb10;

    .line 485
    .line 486
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    invoke-static {v1, v8}, La/xuz;->a(La/pb10;I)I

    .line 490
    .line 491
    .line 492
    move-result v26

    .line 493
    const-wide/16 v36, 0x0

    .line 494
    .line 495
    const/16 v38, 0x25e

    .line 496
    .line 497
    const/16 v27, 0x0

    .line 498
    .line 499
    const/16 v28, 0x0

    .line 500
    .line 501
    const/16 v29, 0x0

    .line 502
    .line 503
    const/16 v30, 0x0

    .line 504
    .line 505
    const v31, 0x7f1305c0

    .line 506
    .line 507
    .line 508
    const/16 v32, 0x0

    .line 509
    .line 510
    const v33, 0x7f131111

    .line 511
    .line 512
    .line 513
    const-wide/16 v34, 0x2710

    .line 514
    .line 515
    invoke-direct/range {v25 .. v38}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 516
    .line 517
    .line 518
    move-object/from16 v0, v25

    .line 519
    .line 520
    new-instance v1, La/cef0;

    .line 521
    .line 522
    invoke-direct {v1, v0}, La/cef0;-><init>(La/mdm;)V

    .line 523
    .line 524
    .line 525
    goto :goto_d

    .line 526
    :cond_10
    :goto_e
    if-eqz v3, :cond_11

    .line 527
    .line 528
    const/16 v1, 0xc

    .line 529
    .line 530
    goto :goto_f

    .line 531
    :cond_11
    const/4 v1, 0x6

    .line 532
    :goto_f
    new-instance v3, La/bef0;

    .line 533
    .line 534
    new-instance v4, Ljava/util/ArrayList;

    .line 535
    .line 536
    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 537
    .line 538
    .line 539
    move/from16 v7, v19

    .line 540
    .line 541
    :goto_10
    if-ge v7, v1, :cond_17

    .line 542
    .line 543
    new-instance v8, La/x56;

    .line 544
    .line 545
    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    .line 546
    .line 547
    .line 548
    move-result v9

    .line 549
    if-eqz v9, :cond_16

    .line 550
    .line 551
    if-eq v9, v5, :cond_15

    .line 552
    .line 553
    if-eq v9, v6, :cond_14

    .line 554
    .line 555
    const/4 v10, 0x3

    .line 556
    if-eq v9, v10, :cond_13

    .line 557
    .line 558
    const/4 v10, 0x4

    .line 559
    if-ne v9, v10, :cond_12

    .line 560
    .line 561
    sget-object v9, La/h0l0;->a:La/h0l0;

    .line 562
    .line 563
    goto :goto_11

    .line 564
    :cond_12
    invoke-static {}, La/t9f;->b()V

    .line 565
    .line 566
    .line 567
    goto :goto_12

    .line 568
    :cond_13
    sget-object v9, La/i0l0;->a:La/i0l0;

    .line 569
    .line 570
    goto :goto_11

    .line 571
    :cond_14
    sget-object v9, La/j0l0;->a:La/j0l0;

    .line 572
    .line 573
    goto :goto_11

    .line 574
    :cond_15
    sget-object v9, La/k0l0;->a:La/k0l0;

    .line 575
    .line 576
    goto :goto_11

    .line 577
    :cond_16
    sget-object v9, La/g0l0;->a:La/g0l0;

    .line 578
    .line 579
    :goto_11
    invoke-direct {v8, v9}, La/x56;-><init>(La/l0l0;)V

    .line 580
    .line 581
    .line 582
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 583
    .line 584
    .line 585
    add-int/lit8 v7, v7, 0x1

    .line 586
    .line 587
    goto :goto_10

    .line 588
    :cond_17
    invoke-static {v4}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 589
    .line 590
    .line 591
    move-result-object v1

    .line 592
    invoke-direct {v3, v1, v2, v0}, La/bef0;-><init>(La/a4x;IZ)V

    .line 593
    .line 594
    .line 595
    move-object/from16 v18, v3

    .line 596
    .line 597
    :goto_12
    return-object v18

    .line 598
    :pswitch_2
    move-object/from16 v0, p1

    .line 599
    .line 600
    check-cast v0, La/ce2;

    .line 601
    .line 602
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 603
    .line 604
    .line 605
    new-instance v1, La/ee2;

    .line 606
    .line 607
    invoke-direct {v1, v4, v2, v0}, La/ee2;-><init>(La/ctf0;La/y78;La/ce2;)V

    .line 608
    .line 609
    .line 610
    return-object v1

    .line 611
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
