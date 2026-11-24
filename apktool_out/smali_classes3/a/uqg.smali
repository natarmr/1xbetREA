.class public final La/uqg;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/aer;


# instance fields
.field public synthetic i:I

.field public synthetic j:La/wmm0;

.field public synthetic k:La/lpg;

.field public synthetic l:La/kam0;

.field public synthetic m:Ljava/util/List;

.field public final synthetic n:La/vqg;

.field public final synthetic o:La/dqg;

.field public final synthetic p:La/ypl0;


# direct methods
.method public constructor <init>(La/vqg;La/dqg;La/ypl0;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/uqg;->n:La/vqg;

    .line 2
    .line 3
    iput-object p2, p0, La/uqg;->o:La/dqg;

    .line 4
    .line 5
    iput-object p3, p0, La/uqg;->p:La/ypl0;

    .line 6
    .line 7
    const/4 p1, 0x6

    .line 8
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v15, v0, La/uqg;->i:I

    .line 4
    .line 5
    iget-object v1, v0, La/uqg;->j:La/wmm0;

    .line 6
    .line 7
    iget-object v2, v0, La/uqg;->k:La/lpg;

    .line 8
    .line 9
    iget-object v3, v0, La/uqg;->l:La/kam0;

    .line 10
    .line 11
    iget-object v4, v0, La/uqg;->m:Ljava/util/List;

    .line 12
    .line 13
    sget-object v5, La/wne;->a:La/wne;

    .line 14
    .line 15
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object v5, v0, La/uqg;->n:La/vqg;

    .line 19
    .line 20
    iget-object v6, v5, La/vqg;->b:Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;

    .line 21
    .line 22
    iget-wide v6, v6, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;->b:J

    .line 23
    .line 24
    iget-object v8, v3, La/kam0;->a:Ljava/util/ArrayList;

    .line 25
    .line 26
    iget-object v9, v0, La/uqg;->o:La/dqg;

    .line 27
    .line 28
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v10, v9, La/dqg;->b:La/ueh;

    .line 32
    .line 33
    iget-object v11, v9, La/dqg;->a:La/ljg;

    .line 34
    .line 35
    const-wide/16 v12, 0x1

    .line 36
    .line 37
    cmp-long v12, v6, v12

    .line 38
    .line 39
    const/16 v16, 0x0

    .line 40
    .line 41
    if-nez v12, :cond_32

    .line 42
    .line 43
    iget-object v6, v9, La/dqg;->c:La/smg;

    .line 44
    .line 45
    iget-object v7, v9, La/dqg;->d:La/omg;

    .line 46
    .line 47
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    new-instance v12, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v17

    .line 64
    if-eqz v17, :cond_3

    .line 65
    .line 66
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v17

    .line 70
    move-object/from16 v13, v17

    .line 71
    .line 72
    check-cast v13, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;

    .line 73
    .line 74
    sget-object v17, La/h6l;->c:La/c0o;

    .line 75
    .line 76
    invoke-virtual/range {v17 .. v17}, La/b3;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v17

    .line 80
    :goto_1
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v18

    .line 84
    if-eqz v18, :cond_1

    .line 85
    .line 86
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v18

    .line 90
    move-object/from16 v14, v18

    .line 91
    .line 92
    check-cast v14, La/h6l;

    .line 93
    .line 94
    iget-object v14, v14, La/h6l;->a:La/t9m0;

    .line 95
    .line 96
    move-object/from16 v29, v4

    .line 97
    .line 98
    iget-object v4, v13, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;->a:La/t9m0;

    .line 99
    .line 100
    if-ne v14, v4, :cond_0

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_0
    move-object/from16 v4, v29

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_1
    move-object/from16 v29, v4

    .line 107
    .line 108
    move-object/from16 v18, v16

    .line 109
    .line 110
    :goto_2
    move-object/from16 v4, v18

    .line 111
    .line 112
    check-cast v4, La/h6l;

    .line 113
    .line 114
    if-eqz v4, :cond_2

    .line 115
    .line 116
    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    :cond_2
    move-object/from16 v4, v29

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_3
    move-object/from16 v29, v4

    .line 123
    .line 124
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v8

    .line 132
    if-eqz v8, :cond_31

    .line 133
    .line 134
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v8

    .line 138
    check-cast v8, La/h6l;

    .line 139
    .line 140
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 141
    .line 142
    .line 143
    move-result v12

    .line 144
    iget-object v8, v8, La/h6l;->a:La/t9m0;

    .line 145
    .line 146
    packed-switch v12, :pswitch_data_0

    .line 147
    .line 148
    .line 149
    invoke-static {}, La/t9f;->b()V

    .line 150
    .line 151
    .line 152
    return-object v16

    .line 153
    :pswitch_0
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    iget-object v12, v10, La/ueh;->c:La/qeh;

    .line 157
    .line 158
    iget-object v13, v12, La/qeh;->a:Ljava/util/List;

    .line 159
    .line 160
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    .line 161
    .line 162
    .line 163
    move-result v13

    .line 164
    iget-object v12, v12, La/qeh;->b:La/ieh;

    .line 165
    .line 166
    iget-object v12, v12, La/ieh;->b:Ljava/util/List;

    .line 167
    .line 168
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 169
    .line 170
    .line 171
    move-result v12

    .line 172
    if-eqz v13, :cond_4

    .line 173
    .line 174
    if-eqz v12, :cond_4

    .line 175
    .line 176
    iget-short v8, v8, La/t9m0;->a:S

    .line 177
    .line 178
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 179
    .line 180
    .line 181
    move-result-object v8

    .line 182
    invoke-virtual {v9, v8}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    :cond_4
    :goto_4
    move-object/from16 v18, v4

    .line 186
    .line 187
    goto/16 :goto_21

    .line 188
    .line 189
    :pswitch_1
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    iget-object v12, v11, La/ljg;->d:La/v1h;

    .line 193
    .line 194
    iget-object v13, v12, La/v1h;->g:Ljava/util/List;

    .line 195
    .line 196
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    .line 197
    .line 198
    .line 199
    move-result v13

    .line 200
    if-eqz v13, :cond_4

    .line 201
    .line 202
    iget-object v12, v12, La/v1h;->h:Ljava/util/List;

    .line 203
    .line 204
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 205
    .line 206
    .line 207
    move-result v12

    .line 208
    if-eqz v12, :cond_4

    .line 209
    .line 210
    iget-short v8, v8, La/t9m0;->a:S

    .line 211
    .line 212
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 213
    .line 214
    .line 215
    move-result-object v8

    .line 216
    invoke-virtual {v9, v8}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    goto :goto_4

    .line 220
    :pswitch_2
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    iget-object v12, v11, La/ljg;->d:La/v1h;

    .line 224
    .line 225
    iget-object v13, v12, La/v1h;->d:Ljava/util/List;

    .line 226
    .line 227
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    .line 228
    .line 229
    .line 230
    move-result v13

    .line 231
    if-eqz v13, :cond_4

    .line 232
    .line 233
    iget-object v13, v12, La/v1h;->e:Ljava/util/List;

    .line 234
    .line 235
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    .line 236
    .line 237
    .line 238
    move-result v13

    .line 239
    if-eqz v13, :cond_4

    .line 240
    .line 241
    iget-object v12, v12, La/v1h;->f:Ljava/util/List;

    .line 242
    .line 243
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 244
    .line 245
    .line 246
    move-result v12

    .line 247
    if-eqz v12, :cond_4

    .line 248
    .line 249
    iget-short v8, v8, La/t9m0;->a:S

    .line 250
    .line 251
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 252
    .line 253
    .line 254
    move-result-object v8

    .line 255
    invoke-virtual {v9, v8}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    goto :goto_4

    .line 259
    :pswitch_3
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    iget-object v12, v6, La/smg;->c:Ljava/util/List;

    .line 263
    .line 264
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 265
    .line 266
    .line 267
    move-result v12

    .line 268
    if-nez v12, :cond_5

    .line 269
    .line 270
    iget-object v12, v6, La/smg;->f:Ljava/util/List;

    .line 271
    .line 272
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 273
    .line 274
    .line 275
    move-result v12

    .line 276
    if-eqz v12, :cond_4

    .line 277
    .line 278
    :cond_5
    iget-short v8, v8, La/t9m0;->a:S

    .line 279
    .line 280
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 281
    .line 282
    .line 283
    move-result-object v8

    .line 284
    invoke-virtual {v9, v8}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    goto :goto_4

    .line 288
    :pswitch_4
    iget-object v12, v7, La/omg;->i:Ljava/util/List;

    .line 289
    .line 290
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 294
    .line 295
    .line 296
    move-result v13

    .line 297
    if-nez v13, :cond_e

    .line 298
    .line 299
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    .line 300
    .line 301
    .line 302
    move-result v13

    .line 303
    if-eqz v13, :cond_6

    .line 304
    .line 305
    goto/16 :goto_b

    .line 306
    .line 307
    :cond_6
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 308
    .line 309
    .line 310
    move-result-object v12

    .line 311
    :goto_5
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 312
    .line 313
    .line 314
    move-result v13

    .line 315
    if-eqz v13, :cond_e

    .line 316
    .line 317
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v13

    .line 321
    check-cast v13, La/kmg;

    .line 322
    .line 323
    iget-object v14, v13, La/kmg;->c:La/e8h;

    .line 324
    .line 325
    iget-object v14, v14, La/e8h;->e:Ljava/util/List;

    .line 326
    .line 327
    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    .line 328
    .line 329
    .line 330
    move-result v14

    .line 331
    if-nez v14, :cond_c

    .line 332
    .line 333
    iget-object v14, v13, La/kmg;->c:La/e8h;

    .line 334
    .line 335
    iget-object v14, v14, La/e8h;->e:Ljava/util/List;

    .line 336
    .line 337
    if-eqz v14, :cond_7

    .line 338
    .line 339
    invoke-interface {v14}, Ljava/util/Collection;->isEmpty()Z

    .line 340
    .line 341
    .line 342
    move-result v17

    .line 343
    if-eqz v17, :cond_7

    .line 344
    .line 345
    goto/16 :goto_9

    .line 346
    .line 347
    :cond_7
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 348
    .line 349
    .line 350
    move-result-object v14

    .line 351
    :goto_6
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 352
    .line 353
    .line 354
    move-result v17

    .line 355
    if-eqz v17, :cond_c

    .line 356
    .line 357
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v17

    .line 361
    move-object/from16 v18, v4

    .line 362
    .line 363
    move-object/from16 v4, v17

    .line 364
    .line 365
    check-cast v4, La/f8h;

    .line 366
    .line 367
    move-object/from16 v17, v12

    .line 368
    .line 369
    iget-object v12, v4, La/f8h;->d:La/vvv;

    .line 370
    .line 371
    iget-object v12, v12, La/vvv;->c:Ljava/lang/String;

    .line 372
    .line 373
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 374
    .line 375
    .line 376
    move-result v12

    .line 377
    if-nez v12, :cond_8

    .line 378
    .line 379
    goto :goto_7

    .line 380
    :cond_8
    iget-object v12, v4, La/f8h;->k:Ljava/util/List;

    .line 381
    .line 382
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 383
    .line 384
    .line 385
    move-result v12

    .line 386
    if-eqz v12, :cond_9

    .line 387
    .line 388
    iget-object v12, v4, La/f8h;->l:Ljava/util/List;

    .line 389
    .line 390
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 391
    .line 392
    .line 393
    move-result v12

    .line 394
    if-eqz v12, :cond_9

    .line 395
    .line 396
    iget-object v4, v4, La/f8h;->m:Ljava/util/List;

    .line 397
    .line 398
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 399
    .line 400
    .line 401
    move-result v4

    .line 402
    if-eqz v4, :cond_9

    .line 403
    .line 404
    :goto_7
    move-object/from16 v12, v17

    .line 405
    .line 406
    move-object/from16 v4, v18

    .line 407
    .line 408
    goto :goto_6

    .line 409
    :cond_9
    iget-object v4, v13, La/kmg;->d:La/e8h;

    .line 410
    .line 411
    iget-object v4, v4, La/e8h;->e:Ljava/util/List;

    .line 412
    .line 413
    if-eqz v4, :cond_a

    .line 414
    .line 415
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 416
    .line 417
    .line 418
    move-result v12

    .line 419
    if-eqz v12, :cond_a

    .line 420
    .line 421
    goto :goto_a

    .line 422
    :cond_a
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 423
    .line 424
    .line 425
    move-result-object v4

    .line 426
    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 427
    .line 428
    .line 429
    move-result v12

    .line 430
    if-eqz v12, :cond_d

    .line 431
    .line 432
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v12

    .line 436
    check-cast v12, La/f8h;

    .line 437
    .line 438
    iget-object v13, v12, La/f8h;->d:La/vvv;

    .line 439
    .line 440
    iget-object v13, v13, La/vvv;->c:Ljava/lang/String;

    .line 441
    .line 442
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 443
    .line 444
    .line 445
    move-result v13

    .line 446
    if-nez v13, :cond_b

    .line 447
    .line 448
    goto :goto_8

    .line 449
    :cond_b
    iget-object v13, v12, La/f8h;->k:Ljava/util/List;

    .line 450
    .line 451
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    .line 452
    .line 453
    .line 454
    move-result v13

    .line 455
    if-eqz v13, :cond_30

    .line 456
    .line 457
    iget-object v13, v12, La/f8h;->l:Ljava/util/List;

    .line 458
    .line 459
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    .line 460
    .line 461
    .line 462
    move-result v13

    .line 463
    if-eqz v13, :cond_30

    .line 464
    .line 465
    iget-object v12, v12, La/f8h;->m:Ljava/util/List;

    .line 466
    .line 467
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 468
    .line 469
    .line 470
    move-result v12

    .line 471
    if-eqz v12, :cond_30

    .line 472
    .line 473
    goto :goto_8

    .line 474
    :cond_c
    :goto_9
    move-object/from16 v18, v4

    .line 475
    .line 476
    move-object/from16 v17, v12

    .line 477
    .line 478
    :cond_d
    :goto_a
    move-object/from16 v12, v17

    .line 479
    .line 480
    move-object/from16 v4, v18

    .line 481
    .line 482
    goto/16 :goto_5

    .line 483
    .line 484
    :cond_e
    :goto_b
    move-object/from16 v18, v4

    .line 485
    .line 486
    iget-short v4, v8, La/t9m0;->a:S

    .line 487
    .line 488
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 489
    .line 490
    .line 491
    move-result-object v4

    .line 492
    invoke-virtual {v9, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 493
    .line 494
    .line 495
    goto/16 :goto_21

    .line 496
    .line 497
    :pswitch_5
    move-object/from16 v18, v4

    .line 498
    .line 499
    iget-object v4, v7, La/omg;->i:Ljava/util/List;

    .line 500
    .line 501
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 502
    .line 503
    .line 504
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 505
    .line 506
    .line 507
    move-result v12

    .line 508
    if-nez v12, :cond_15

    .line 509
    .line 510
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 511
    .line 512
    .line 513
    move-result v12

    .line 514
    if-eqz v12, :cond_f

    .line 515
    .line 516
    goto :goto_d

    .line 517
    :cond_f
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 518
    .line 519
    .line 520
    move-result-object v4

    .line 521
    :cond_10
    :goto_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 522
    .line 523
    .line 524
    move-result v12

    .line 525
    if-eqz v12, :cond_15

    .line 526
    .line 527
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v12

    .line 531
    check-cast v12, La/kmg;

    .line 532
    .line 533
    iget-object v13, v12, La/kmg;->c:La/e8h;

    .line 534
    .line 535
    iget-object v14, v12, La/kmg;->d:La/e8h;

    .line 536
    .line 537
    iget-object v14, v14, La/e8h;->e:Ljava/util/List;

    .line 538
    .line 539
    iget-object v13, v13, La/e8h;->e:Ljava/util/List;

    .line 540
    .line 541
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    .line 542
    .line 543
    .line 544
    move-result v13

    .line 545
    if-nez v13, :cond_10

    .line 546
    .line 547
    iget-object v12, v12, La/kmg;->c:La/e8h;

    .line 548
    .line 549
    iget-object v12, v12, La/e8h;->e:Ljava/util/List;

    .line 550
    .line 551
    if-eqz v12, :cond_11

    .line 552
    .line 553
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    .line 554
    .line 555
    .line 556
    move-result v13

    .line 557
    if-eqz v13, :cond_11

    .line 558
    .line 559
    goto :goto_c

    .line 560
    :cond_11
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 561
    .line 562
    .line 563
    move-result-object v12

    .line 564
    :cond_12
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 565
    .line 566
    .line 567
    move-result v13

    .line 568
    if-eqz v13, :cond_10

    .line 569
    .line 570
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v13

    .line 574
    check-cast v13, La/f8h;

    .line 575
    .line 576
    iget-object v13, v13, La/f8h;->n:Ljava/util/List;

    .line 577
    .line 578
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    .line 579
    .line 580
    .line 581
    move-result v13

    .line 582
    if-nez v13, :cond_12

    .line 583
    .line 584
    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    .line 585
    .line 586
    .line 587
    move-result v12

    .line 588
    if-nez v12, :cond_10

    .line 589
    .line 590
    if-eqz v14, :cond_13

    .line 591
    .line 592
    invoke-interface {v14}, Ljava/util/Collection;->isEmpty()Z

    .line 593
    .line 594
    .line 595
    move-result v12

    .line 596
    if-eqz v12, :cond_13

    .line 597
    .line 598
    goto :goto_c

    .line 599
    :cond_13
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 600
    .line 601
    .line 602
    move-result-object v12

    .line 603
    :cond_14
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 604
    .line 605
    .line 606
    move-result v13

    .line 607
    if-eqz v13, :cond_10

    .line 608
    .line 609
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object v13

    .line 613
    check-cast v13, La/f8h;

    .line 614
    .line 615
    iget-object v13, v13, La/f8h;->n:Ljava/util/List;

    .line 616
    .line 617
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    .line 618
    .line 619
    .line 620
    move-result v13

    .line 621
    if-nez v13, :cond_14

    .line 622
    .line 623
    goto/16 :goto_21

    .line 624
    .line 625
    :cond_15
    :goto_d
    iget-short v4, v8, La/t9m0;->a:S

    .line 626
    .line 627
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 628
    .line 629
    .line 630
    move-result-object v4

    .line 631
    invoke-virtual {v9, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 632
    .line 633
    .line 634
    goto/16 :goto_21

    .line 635
    .line 636
    :pswitch_6
    move-object/from16 v18, v4

    .line 637
    .line 638
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 639
    .line 640
    .line 641
    iget-object v4, v6, La/smg;->c:Ljava/util/List;

    .line 642
    .line 643
    iget-object v12, v6, La/smg;->f:Ljava/util/List;

    .line 644
    .line 645
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 646
    .line 647
    .line 648
    move-result v13

    .line 649
    if-nez v13, :cond_16

    .line 650
    .line 651
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 652
    .line 653
    .line 654
    move-result v13

    .line 655
    if-nez v13, :cond_16

    .line 656
    .line 657
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 658
    .line 659
    .line 660
    move-result v4

    .line 661
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 662
    .line 663
    .line 664
    move-result v12

    .line 665
    add-int/2addr v12, v4

    .line 666
    const/16 v4, 0xa

    .line 667
    .line 668
    if-eq v12, v4, :cond_30

    .line 669
    .line 670
    :cond_16
    iget-short v4, v8, La/t9m0;->a:S

    .line 671
    .line 672
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 673
    .line 674
    .line 675
    move-result-object v4

    .line 676
    invoke-virtual {v9, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 677
    .line 678
    .line 679
    goto/16 :goto_21

    .line 680
    .line 681
    :pswitch_7
    move-object/from16 v18, v4

    .line 682
    .line 683
    iget-object v4, v7, La/omg;->i:Ljava/util/List;

    .line 684
    .line 685
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 686
    .line 687
    .line 688
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 689
    .line 690
    .line 691
    move-result v12

    .line 692
    if-nez v12, :cond_1a

    .line 693
    .line 694
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 695
    .line 696
    .line 697
    move-result v12

    .line 698
    if-eqz v12, :cond_17

    .line 699
    .line 700
    goto :goto_11

    .line 701
    :cond_17
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 702
    .line 703
    .line 704
    move-result-object v4

    .line 705
    :goto_e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 706
    .line 707
    .line 708
    move-result v12

    .line 709
    if-eqz v12, :cond_1a

    .line 710
    .line 711
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    move-result-object v12

    .line 715
    check-cast v12, La/kmg;

    .line 716
    .line 717
    iget-object v12, v12, La/kmg;->n:Ljava/util/List;

    .line 718
    .line 719
    if-eqz v12, :cond_19

    .line 720
    .line 721
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    .line 722
    .line 723
    .line 724
    move-result v13

    .line 725
    if-eqz v13, :cond_19

    .line 726
    .line 727
    :cond_18
    move-object/from16 v17, v4

    .line 728
    .line 729
    goto :goto_10

    .line 730
    :cond_19
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 731
    .line 732
    .line 733
    move-result-object v12

    .line 734
    :goto_f
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 735
    .line 736
    .line 737
    move-result v13

    .line 738
    if-eqz v13, :cond_18

    .line 739
    .line 740
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 741
    .line 742
    .line 743
    move-result-object v13

    .line 744
    check-cast v13, La/ils;

    .line 745
    .line 746
    iget-object v14, v13, La/ils;->a:La/mls;

    .line 747
    .line 748
    move-object/from16 v17, v4

    .line 749
    .line 750
    sget-object v4, La/mls;->a:La/mls;

    .line 751
    .line 752
    if-ne v14, v4, :cond_30

    .line 753
    .line 754
    iget-wide v13, v13, La/ils;->b:J

    .line 755
    .line 756
    const-wide/16 v20, 0x0

    .line 757
    .line 758
    cmp-long v4, v13, v20

    .line 759
    .line 760
    if-nez v4, :cond_30

    .line 761
    .line 762
    move-object/from16 v4, v17

    .line 763
    .line 764
    goto :goto_f

    .line 765
    :goto_10
    move-object/from16 v4, v17

    .line 766
    .line 767
    goto :goto_e

    .line 768
    :cond_1a
    :goto_11
    iget-short v4, v8, La/t9m0;->a:S

    .line 769
    .line 770
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 771
    .line 772
    .line 773
    move-result-object v4

    .line 774
    invoke-virtual {v9, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 775
    .line 776
    .line 777
    goto/16 :goto_21

    .line 778
    .line 779
    :pswitch_8
    move-object/from16 v18, v4

    .line 780
    .line 781
    iget-object v4, v7, La/omg;->i:Ljava/util/List;

    .line 782
    .line 783
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 784
    .line 785
    .line 786
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 787
    .line 788
    .line 789
    move-result v12

    .line 790
    if-nez v12, :cond_22

    .line 791
    .line 792
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 793
    .line 794
    .line 795
    move-result v12

    .line 796
    if-eqz v12, :cond_1b

    .line 797
    .line 798
    goto/16 :goto_19

    .line 799
    .line 800
    :cond_1b
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 801
    .line 802
    .line 803
    move-result-object v4

    .line 804
    :goto_12
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 805
    .line 806
    .line 807
    move-result v12

    .line 808
    if-eqz v12, :cond_22

    .line 809
    .line 810
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 811
    .line 812
    .line 813
    move-result-object v12

    .line 814
    check-cast v12, La/kmg;

    .line 815
    .line 816
    iget-object v13, v12, La/kmg;->i:Ljava/util/List;

    .line 817
    .line 818
    iget-object v14, v12, La/kmg;->k:Ljava/util/List;

    .line 819
    .line 820
    move-object/from16 v17, v4

    .line 821
    .line 822
    iget-object v4, v12, La/kmg;->j:Ljava/util/List;

    .line 823
    .line 824
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    .line 825
    .line 826
    .line 827
    move-result v13

    .line 828
    if-nez v13, :cond_1d

    .line 829
    .line 830
    iget-object v12, v12, La/kmg;->i:Ljava/util/List;

    .line 831
    .line 832
    if-eqz v12, :cond_1c

    .line 833
    .line 834
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    .line 835
    .line 836
    .line 837
    move-result v13

    .line 838
    if-eqz v13, :cond_1c

    .line 839
    .line 840
    goto :goto_14

    .line 841
    :cond_1c
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 842
    .line 843
    .line 844
    move-result-object v12

    .line 845
    :goto_13
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 846
    .line 847
    .line 848
    move-result v13

    .line 849
    if-eqz v13, :cond_1d

    .line 850
    .line 851
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 852
    .line 853
    .line 854
    move-result-object v13

    .line 855
    check-cast v13, La/eev;

    .line 856
    .line 857
    iget v13, v13, La/eev;->a:I

    .line 858
    .line 859
    if-nez v13, :cond_30

    .line 860
    .line 861
    goto :goto_13

    .line 862
    :cond_1d
    :goto_14
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 863
    .line 864
    .line 865
    move-result v12

    .line 866
    if-nez v12, :cond_1f

    .line 867
    .line 868
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 869
    .line 870
    .line 871
    move-result v12

    .line 872
    if-eqz v12, :cond_1e

    .line 873
    .line 874
    goto :goto_16

    .line 875
    :cond_1e
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 876
    .line 877
    .line 878
    move-result-object v4

    .line 879
    :goto_15
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 880
    .line 881
    .line 882
    move-result v12

    .line 883
    if-eqz v12, :cond_1f

    .line 884
    .line 885
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 886
    .line 887
    .line 888
    move-result-object v12

    .line 889
    check-cast v12, La/eev;

    .line 890
    .line 891
    iget v12, v12, La/eev;->a:I

    .line 892
    .line 893
    if-nez v12, :cond_30

    .line 894
    .line 895
    goto :goto_15

    .line 896
    :cond_1f
    :goto_16
    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    .line 897
    .line 898
    .line 899
    move-result v4

    .line 900
    if-nez v4, :cond_21

    .line 901
    .line 902
    invoke-interface {v14}, Ljava/util/Collection;->isEmpty()Z

    .line 903
    .line 904
    .line 905
    move-result v4

    .line 906
    if-eqz v4, :cond_20

    .line 907
    .line 908
    goto :goto_18

    .line 909
    :cond_20
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 910
    .line 911
    .line 912
    move-result-object v4

    .line 913
    :goto_17
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 914
    .line 915
    .line 916
    move-result v12

    .line 917
    if-eqz v12, :cond_21

    .line 918
    .line 919
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 920
    .line 921
    .line 922
    move-result-object v12

    .line 923
    check-cast v12, La/eev;

    .line 924
    .line 925
    iget v12, v12, La/eev;->a:I

    .line 926
    .line 927
    if-nez v12, :cond_30

    .line 928
    .line 929
    goto :goto_17

    .line 930
    :cond_21
    :goto_18
    move-object/from16 v4, v17

    .line 931
    .line 932
    goto/16 :goto_12

    .line 933
    .line 934
    :cond_22
    :goto_19
    iget-short v4, v8, La/t9m0;->a:S

    .line 935
    .line 936
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 937
    .line 938
    .line 939
    move-result-object v4

    .line 940
    invoke-virtual {v9, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 941
    .line 942
    .line 943
    goto/16 :goto_21

    .line 944
    .line 945
    :pswitch_9
    move-object/from16 v18, v4

    .line 946
    .line 947
    iget-object v4, v7, La/omg;->i:Ljava/util/List;

    .line 948
    .line 949
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 950
    .line 951
    .line 952
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 953
    .line 954
    .line 955
    move-result v12

    .line 956
    if-nez v12, :cond_25

    .line 957
    .line 958
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 959
    .line 960
    .line 961
    move-result v12

    .line 962
    if-eqz v12, :cond_23

    .line 963
    .line 964
    goto :goto_1a

    .line 965
    :cond_23
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 966
    .line 967
    .line 968
    move-result-object v4

    .line 969
    :cond_24
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 970
    .line 971
    .line 972
    move-result v12

    .line 973
    if-eqz v12, :cond_25

    .line 974
    .line 975
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 976
    .line 977
    .line 978
    move-result-object v12

    .line 979
    check-cast v12, La/kmg;

    .line 980
    .line 981
    iget-object v12, v12, La/kmg;->m:Ljava/util/List;

    .line 982
    .line 983
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 984
    .line 985
    .line 986
    move-result v12

    .line 987
    if-nez v12, :cond_24

    .line 988
    .line 989
    goto/16 :goto_21

    .line 990
    .line 991
    :cond_25
    :goto_1a
    iget-short v4, v8, La/t9m0;->a:S

    .line 992
    .line 993
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 994
    .line 995
    .line 996
    move-result-object v4

    .line 997
    invoke-virtual {v9, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 998
    .line 999
    .line 1000
    goto/16 :goto_21

    .line 1001
    .line 1002
    :pswitch_a
    move-object/from16 v18, v4

    .line 1003
    .line 1004
    iget-object v4, v7, La/omg;->i:Ljava/util/List;

    .line 1005
    .line 1006
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1007
    .line 1008
    .line 1009
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 1010
    .line 1011
    .line 1012
    move-result v12

    .line 1013
    if-nez v12, :cond_2c

    .line 1014
    .line 1015
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 1016
    .line 1017
    .line 1018
    move-result v12

    .line 1019
    if-eqz v12, :cond_26

    .line 1020
    .line 1021
    goto :goto_1f

    .line 1022
    :cond_26
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v4

    .line 1026
    :goto_1b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1027
    .line 1028
    .line 1029
    move-result v12

    .line 1030
    if-eqz v12, :cond_2c

    .line 1031
    .line 1032
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v12

    .line 1036
    check-cast v12, La/kmg;

    .line 1037
    .line 1038
    iget-object v13, v12, La/kmg;->c:La/e8h;

    .line 1039
    .line 1040
    iget-object v14, v13, La/e8h;->e:Ljava/util/List;

    .line 1041
    .line 1042
    iget-object v12, v12, La/kmg;->d:La/e8h;

    .line 1043
    .line 1044
    move-object/from16 v17, v4

    .line 1045
    .line 1046
    iget-object v4, v12, La/e8h;->e:Ljava/util/List;

    .line 1047
    .line 1048
    invoke-static {v14}, La/iom0;->l(Ljava/util/List;)Z

    .line 1049
    .line 1050
    .line 1051
    move-result v20

    .line 1052
    if-nez v20, :cond_28

    .line 1053
    .line 1054
    invoke-static {v4}, La/iom0;->l(Ljava/util/List;)Z

    .line 1055
    .line 1056
    .line 1057
    move-result v20

    .line 1058
    if-eqz v20, :cond_27

    .line 1059
    .line 1060
    goto :goto_1c

    .line 1061
    :cond_27
    const/16 v20, 0x0

    .line 1062
    .line 1063
    goto :goto_1d

    .line 1064
    :cond_28
    :goto_1c
    const/16 v20, 0x1

    .line 1065
    .line 1066
    :goto_1d
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 1067
    .line 1068
    .line 1069
    move-result v14

    .line 1070
    move-object/from16 v21, v4

    .line 1071
    .line 1072
    const/4 v4, 0x5

    .line 1073
    if-ne v14, v4, :cond_2b

    .line 1074
    .line 1075
    invoke-interface/range {v21 .. v21}, Ljava/util/List;->size()I

    .line 1076
    .line 1077
    .line 1078
    move-result v14

    .line 1079
    if-ne v14, v4, :cond_2b

    .line 1080
    .line 1081
    iget-object v4, v13, La/e8h;->b:Ljava/lang/String;

    .line 1082
    .line 1083
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 1084
    .line 1085
    .line 1086
    move-result v4

    .line 1087
    if-nez v4, :cond_29

    .line 1088
    .line 1089
    goto :goto_1e

    .line 1090
    :cond_29
    iget-object v4, v12, La/e8h;->b:Ljava/lang/String;

    .line 1091
    .line 1092
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 1093
    .line 1094
    .line 1095
    move-result v4

    .line 1096
    if-nez v4, :cond_2a

    .line 1097
    .line 1098
    goto :goto_1e

    .line 1099
    :cond_2a
    if-eqz v20, :cond_30

    .line 1100
    .line 1101
    :cond_2b
    :goto_1e
    move-object/from16 v4, v17

    .line 1102
    .line 1103
    goto :goto_1b

    .line 1104
    :cond_2c
    :goto_1f
    iget-short v4, v8, La/t9m0;->a:S

    .line 1105
    .line 1106
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v4

    .line 1110
    invoke-virtual {v9, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1111
    .line 1112
    .line 1113
    goto :goto_21

    .line 1114
    :pswitch_b
    move-object/from16 v18, v4

    .line 1115
    .line 1116
    iget-object v4, v11, La/ljg;->e:Ljava/util/List;

    .line 1117
    .line 1118
    iget-object v12, v7, La/omg;->i:Ljava/util/List;

    .line 1119
    .line 1120
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1121
    .line 1122
    .line 1123
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1124
    .line 1125
    .line 1126
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 1127
    .line 1128
    .line 1129
    move-result v12

    .line 1130
    if-nez v12, :cond_2f

    .line 1131
    .line 1132
    new-instance v12, Ljava/util/ArrayList;

    .line 1133
    .line 1134
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 1135
    .line 1136
    .line 1137
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v4

    .line 1141
    :cond_2d
    :goto_20
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1142
    .line 1143
    .line 1144
    move-result v13

    .line 1145
    if-eqz v13, :cond_2e

    .line 1146
    .line 1147
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v13

    .line 1151
    move-object v14, v13

    .line 1152
    check-cast v14, La/le90;

    .line 1153
    .line 1154
    invoke-static {v14}, La/lgb;->b0(La/le90;)Z

    .line 1155
    .line 1156
    .line 1157
    move-result v14

    .line 1158
    if-eqz v14, :cond_2d

    .line 1159
    .line 1160
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1161
    .line 1162
    .line 1163
    goto :goto_20

    .line 1164
    :cond_2e
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1165
    .line 1166
    .line 1167
    move-result v4

    .line 1168
    if-eqz v4, :cond_30

    .line 1169
    .line 1170
    :cond_2f
    iget-short v4, v8, La/t9m0;->a:S

    .line 1171
    .line 1172
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v4

    .line 1176
    invoke-virtual {v9, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1177
    .line 1178
    .line 1179
    :cond_30
    :goto_21
    move-object/from16 v4, v18

    .line 1180
    .line 1181
    goto/16 :goto_3

    .line 1182
    .line 1183
    :cond_31
    invoke-static {v9}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v4

    .line 1187
    goto/16 :goto_30

    .line 1188
    .line 1189
    :cond_32
    move-object/from16 v29, v4

    .line 1190
    .line 1191
    const-wide/16 v12, 0x2e

    .line 1192
    .line 1193
    cmp-long v4, v6, v12

    .line 1194
    .line 1195
    if-nez v4, :cond_4d

    .line 1196
    .line 1197
    iget-object v4, v9, La/dqg;->e:La/d4g;

    .line 1198
    .line 1199
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v6

    .line 1203
    new-instance v7, Ljava/util/ArrayList;

    .line 1204
    .line 1205
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1206
    .line 1207
    .line 1208
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v8

    .line 1212
    :goto_22
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1213
    .line 1214
    .line 1215
    move-result v9

    .line 1216
    if-eqz v9, :cond_36

    .line 1217
    .line 1218
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v9

    .line 1222
    check-cast v9, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;

    .line 1223
    .line 1224
    sget-object v12, La/rqf;->c:La/c0o;

    .line 1225
    .line 1226
    invoke-virtual {v12}, La/b3;->iterator()Ljava/util/Iterator;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v12

    .line 1230
    :goto_23
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 1231
    .line 1232
    .line 1233
    move-result v13

    .line 1234
    if-eqz v13, :cond_34

    .line 1235
    .line 1236
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v13

    .line 1240
    move-object v14, v13

    .line 1241
    check-cast v14, La/rqf;

    .line 1242
    .line 1243
    iget-object v14, v14, La/rqf;->a:La/t9m0;

    .line 1244
    .line 1245
    move-object/from16 v17, v8

    .line 1246
    .line 1247
    iget-object v8, v9, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;->a:La/t9m0;

    .line 1248
    .line 1249
    if-ne v14, v8, :cond_33

    .line 1250
    .line 1251
    goto :goto_24

    .line 1252
    :cond_33
    move-object/from16 v8, v17

    .line 1253
    .line 1254
    goto :goto_23

    .line 1255
    :cond_34
    move-object/from16 v17, v8

    .line 1256
    .line 1257
    move-object/from16 v13, v16

    .line 1258
    .line 1259
    :goto_24
    check-cast v13, La/rqf;

    .line 1260
    .line 1261
    if-eqz v13, :cond_35

    .line 1262
    .line 1263
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1264
    .line 1265
    .line 1266
    :cond_35
    move-object/from16 v8, v17

    .line 1267
    .line 1268
    goto :goto_22

    .line 1269
    :cond_36
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1270
    .line 1271
    .line 1272
    move-result-object v7

    .line 1273
    :goto_25
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1274
    .line 1275
    .line 1276
    move-result v8

    .line 1277
    if-eqz v8, :cond_4c

    .line 1278
    .line 1279
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1280
    .line 1281
    .line 1282
    move-result-object v8

    .line 1283
    check-cast v8, La/rqf;

    .line 1284
    .line 1285
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 1286
    .line 1287
    .line 1288
    move-result v9

    .line 1289
    iget-object v8, v8, La/rqf;->a:La/t9m0;

    .line 1290
    .line 1291
    iget-short v8, v8, La/t9m0;->a:S

    .line 1292
    .line 1293
    packed-switch v9, :pswitch_data_1

    .line 1294
    .line 1295
    .line 1296
    invoke-static {}, La/t9f;->b()V

    .line 1297
    .line 1298
    .line 1299
    return-object v16

    .line 1300
    :pswitch_c
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1301
    .line 1302
    .line 1303
    iget-object v9, v10, La/ueh;->c:La/qeh;

    .line 1304
    .line 1305
    iget-object v12, v9, La/qeh;->a:Ljava/util/List;

    .line 1306
    .line 1307
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 1308
    .line 1309
    .line 1310
    move-result v12

    .line 1311
    iget-object v9, v9, La/qeh;->b:La/ieh;

    .line 1312
    .line 1313
    iget-object v9, v9, La/ieh;->b:Ljava/util/List;

    .line 1314
    .line 1315
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 1316
    .line 1317
    .line 1318
    move-result v9

    .line 1319
    if-eqz v12, :cond_37

    .line 1320
    .line 1321
    if-eqz v9, :cond_37

    .line 1322
    .line 1323
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v8

    .line 1327
    invoke-virtual {v6, v8}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1328
    .line 1329
    .line 1330
    :cond_37
    :goto_26
    move-object/from16 v17, v7

    .line 1331
    .line 1332
    const/4 v7, 0x5

    .line 1333
    goto/16 :goto_2f

    .line 1334
    .line 1335
    :pswitch_d
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1336
    .line 1337
    .line 1338
    iget-object v9, v11, La/ljg;->d:La/v1h;

    .line 1339
    .line 1340
    iget-object v12, v9, La/v1h;->g:Ljava/util/List;

    .line 1341
    .line 1342
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 1343
    .line 1344
    .line 1345
    move-result v12

    .line 1346
    if-eqz v12, :cond_37

    .line 1347
    .line 1348
    iget-object v9, v9, La/v1h;->h:Ljava/util/List;

    .line 1349
    .line 1350
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 1351
    .line 1352
    .line 1353
    move-result v9

    .line 1354
    if-eqz v9, :cond_37

    .line 1355
    .line 1356
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1357
    .line 1358
    .line 1359
    move-result-object v8

    .line 1360
    invoke-virtual {v6, v8}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1361
    .line 1362
    .line 1363
    goto :goto_26

    .line 1364
    :pswitch_e
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1365
    .line 1366
    .line 1367
    iget-object v9, v11, La/ljg;->d:La/v1h;

    .line 1368
    .line 1369
    iget-object v12, v9, La/v1h;->d:Ljava/util/List;

    .line 1370
    .line 1371
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 1372
    .line 1373
    .line 1374
    move-result v12

    .line 1375
    if-eqz v12, :cond_37

    .line 1376
    .line 1377
    iget-object v12, v9, La/v1h;->e:Ljava/util/List;

    .line 1378
    .line 1379
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 1380
    .line 1381
    .line 1382
    move-result v12

    .line 1383
    if-eqz v12, :cond_37

    .line 1384
    .line 1385
    iget-object v9, v9, La/v1h;->f:Ljava/util/List;

    .line 1386
    .line 1387
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 1388
    .line 1389
    .line 1390
    move-result v9

    .line 1391
    if-eqz v9, :cond_37

    .line 1392
    .line 1393
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v8

    .line 1397
    invoke-virtual {v6, v8}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1398
    .line 1399
    .line 1400
    goto :goto_26

    .line 1401
    :pswitch_f
    iget-object v9, v4, La/d4g;->c:La/s8h;

    .line 1402
    .line 1403
    iget-object v12, v4, La/d4g;->d:La/s8h;

    .line 1404
    .line 1405
    iget-object v13, v9, La/s8h;->f:Ljava/util/List;

    .line 1406
    .line 1407
    invoke-static {v13}, La/rcb;->Z0(Ljava/util/List;)Ljava/util/ArrayList;

    .line 1408
    .line 1409
    .line 1410
    move-result-object v13

    .line 1411
    iget-object v14, v12, La/s8h;->f:Ljava/util/List;

    .line 1412
    .line 1413
    invoke-static {v14}, La/rcb;->Z0(Ljava/util/List;)Ljava/util/ArrayList;

    .line 1414
    .line 1415
    .line 1416
    move-result-object v14

    .line 1417
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1418
    .line 1419
    .line 1420
    move-result v17

    .line 1421
    if-nez v17, :cond_39

    .line 1422
    .line 1423
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1424
    .line 1425
    .line 1426
    move-result v17

    .line 1427
    if-nez v17, :cond_39

    .line 1428
    .line 1429
    invoke-static {v13, v14}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v13

    .line 1433
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 1434
    .line 1435
    .line 1436
    move-result v13

    .line 1437
    const/16 v14, 0xa

    .line 1438
    .line 1439
    if-ne v13, v14, :cond_3a

    .line 1440
    .line 1441
    iget-object v9, v9, La/s8h;->c:Ljava/lang/String;

    .line 1442
    .line 1443
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 1444
    .line 1445
    .line 1446
    move-result v9

    .line 1447
    if-nez v9, :cond_38

    .line 1448
    .line 1449
    goto :goto_27

    .line 1450
    :cond_38
    iget-object v9, v12, La/s8h;->c:Ljava/lang/String;

    .line 1451
    .line 1452
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 1453
    .line 1454
    .line 1455
    move-result v9

    .line 1456
    if-nez v9, :cond_37

    .line 1457
    .line 1458
    goto :goto_27

    .line 1459
    :cond_39
    const/16 v14, 0xa

    .line 1460
    .line 1461
    :cond_3a
    :goto_27
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1462
    .line 1463
    .line 1464
    move-result-object v8

    .line 1465
    invoke-virtual {v6, v8}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1466
    .line 1467
    .line 1468
    goto/16 :goto_26

    .line 1469
    .line 1470
    :pswitch_10
    const/16 v14, 0xa

    .line 1471
    .line 1472
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1473
    .line 1474
    .line 1475
    iget-object v9, v4, La/d4g;->e:Ljava/util/List;

    .line 1476
    .line 1477
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 1478
    .line 1479
    .line 1480
    move-result v12

    .line 1481
    if-nez v12, :cond_3d

    .line 1482
    .line 1483
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 1484
    .line 1485
    .line 1486
    move-result v12

    .line 1487
    if-eqz v12, :cond_3b

    .line 1488
    .line 1489
    goto :goto_28

    .line 1490
    :cond_3b
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1491
    .line 1492
    .line 1493
    move-result-object v9

    .line 1494
    :cond_3c
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1495
    .line 1496
    .line 1497
    move-result v12

    .line 1498
    if-eqz v12, :cond_3d

    .line 1499
    .line 1500
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1501
    .line 1502
    .line 1503
    move-result-object v12

    .line 1504
    check-cast v12, La/n3g;

    .line 1505
    .line 1506
    iget-object v12, v12, La/n3g;->e:Ljava/util/List;

    .line 1507
    .line 1508
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 1509
    .line 1510
    .line 1511
    move-result v12

    .line 1512
    if-nez v12, :cond_3c

    .line 1513
    .line 1514
    goto/16 :goto_26

    .line 1515
    .line 1516
    :cond_3d
    :goto_28
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1517
    .line 1518
    .line 1519
    move-result-object v8

    .line 1520
    invoke-virtual {v6, v8}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1521
    .line 1522
    .line 1523
    goto/16 :goto_26

    .line 1524
    .line 1525
    :pswitch_11
    const/16 v14, 0xa

    .line 1526
    .line 1527
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1528
    .line 1529
    .line 1530
    iget-object v9, v4, La/d4g;->e:Ljava/util/List;

    .line 1531
    .line 1532
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 1533
    .line 1534
    .line 1535
    move-result v12

    .line 1536
    if-nez v12, :cond_47

    .line 1537
    .line 1538
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 1539
    .line 1540
    .line 1541
    move-result v12

    .line 1542
    if-eqz v12, :cond_3e

    .line 1543
    .line 1544
    goto/16 :goto_2d

    .line 1545
    .line 1546
    :cond_3e
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1547
    .line 1548
    .line 1549
    move-result-object v9

    .line 1550
    :goto_29
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1551
    .line 1552
    .line 1553
    move-result v12

    .line 1554
    if-eqz v12, :cond_47

    .line 1555
    .line 1556
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1557
    .line 1558
    .line 1559
    move-result-object v12

    .line 1560
    check-cast v12, La/n3g;

    .line 1561
    .line 1562
    iget-object v13, v12, La/n3g;->c:La/v3g;

    .line 1563
    .line 1564
    iget-object v14, v12, La/n3g;->d:La/v3g;

    .line 1565
    .line 1566
    iget-object v14, v14, La/v3g;->c:Ljava/util/List;

    .line 1567
    .line 1568
    iget-object v13, v13, La/v3g;->c:Ljava/util/List;

    .line 1569
    .line 1570
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 1571
    .line 1572
    .line 1573
    move-result v13

    .line 1574
    move-object/from16 v17, v7

    .line 1575
    .line 1576
    const/4 v7, 0x5

    .line 1577
    if-ne v13, v7, :cond_46

    .line 1578
    .line 1579
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 1580
    .line 1581
    .line 1582
    move-result v13

    .line 1583
    if-ne v13, v7, :cond_46

    .line 1584
    .line 1585
    iget-object v12, v12, La/n3g;->c:La/v3g;

    .line 1586
    .line 1587
    iget-object v12, v12, La/v3g;->c:Ljava/util/List;

    .line 1588
    .line 1589
    if-eqz v12, :cond_3f

    .line 1590
    .line 1591
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    .line 1592
    .line 1593
    .line 1594
    move-result v13

    .line 1595
    if-eqz v13, :cond_3f

    .line 1596
    .line 1597
    goto :goto_2a

    .line 1598
    :cond_3f
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1599
    .line 1600
    .line 1601
    move-result-object v12

    .line 1602
    :cond_40
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 1603
    .line 1604
    .line 1605
    move-result v13

    .line 1606
    if-eqz v13, :cond_41

    .line 1607
    .line 1608
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1609
    .line 1610
    .line 1611
    move-result-object v13

    .line 1612
    check-cast v13, La/w3g;

    .line 1613
    .line 1614
    iget-object v13, v13, La/w3g;->a:Ljava/lang/String;

    .line 1615
    .line 1616
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 1617
    .line 1618
    .line 1619
    move-result v13

    .line 1620
    if-nez v13, :cond_40

    .line 1621
    .line 1622
    goto :goto_2c

    .line 1623
    :cond_41
    :goto_2a
    if-eqz v14, :cond_42

    .line 1624
    .line 1625
    invoke-interface {v14}, Ljava/util/Collection;->isEmpty()Z

    .line 1626
    .line 1627
    .line 1628
    move-result v12

    .line 1629
    if-eqz v12, :cond_42

    .line 1630
    .line 1631
    goto :goto_2b

    .line 1632
    :cond_42
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1633
    .line 1634
    .line 1635
    move-result-object v12

    .line 1636
    :cond_43
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 1637
    .line 1638
    .line 1639
    move-result v13

    .line 1640
    if-eqz v13, :cond_44

    .line 1641
    .line 1642
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1643
    .line 1644
    .line 1645
    move-result-object v13

    .line 1646
    check-cast v13, La/w3g;

    .line 1647
    .line 1648
    iget-object v13, v13, La/w3g;->a:Ljava/lang/String;

    .line 1649
    .line 1650
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 1651
    .line 1652
    .line 1653
    move-result v13

    .line 1654
    if-nez v13, :cond_43

    .line 1655
    .line 1656
    goto :goto_2c

    .line 1657
    :cond_44
    :goto_2b
    iget-object v12, v4, La/d4g;->c:La/s8h;

    .line 1658
    .line 1659
    iget-object v12, v12, La/s8h;->c:Ljava/lang/String;

    .line 1660
    .line 1661
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 1662
    .line 1663
    .line 1664
    move-result v12

    .line 1665
    if-nez v12, :cond_45

    .line 1666
    .line 1667
    goto :goto_2c

    .line 1668
    :cond_45
    iget-object v12, v4, La/d4g;->d:La/s8h;

    .line 1669
    .line 1670
    iget-object v12, v12, La/s8h;->c:Ljava/lang/String;

    .line 1671
    .line 1672
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 1673
    .line 1674
    .line 1675
    move-result v12

    .line 1676
    if-nez v12, :cond_4b

    .line 1677
    .line 1678
    :cond_46
    :goto_2c
    move-object/from16 v7, v17

    .line 1679
    .line 1680
    const/16 v14, 0xa

    .line 1681
    .line 1682
    goto/16 :goto_29

    .line 1683
    .line 1684
    :cond_47
    :goto_2d
    move-object/from16 v17, v7

    .line 1685
    .line 1686
    const/4 v7, 0x5

    .line 1687
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1688
    .line 1689
    .line 1690
    move-result-object v8

    .line 1691
    invoke-virtual {v6, v8}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1692
    .line 1693
    .line 1694
    goto :goto_2f

    .line 1695
    :pswitch_12
    move-object/from16 v17, v7

    .line 1696
    .line 1697
    const/4 v7, 0x5

    .line 1698
    iget-object v9, v11, La/ljg;->e:Ljava/util/List;

    .line 1699
    .line 1700
    iget-object v12, v4, La/d4g;->e:Ljava/util/List;

    .line 1701
    .line 1702
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1703
    .line 1704
    .line 1705
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1706
    .line 1707
    .line 1708
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 1709
    .line 1710
    .line 1711
    move-result v12

    .line 1712
    if-nez v12, :cond_4a

    .line 1713
    .line 1714
    new-instance v12, Ljava/util/ArrayList;

    .line 1715
    .line 1716
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 1717
    .line 1718
    .line 1719
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1720
    .line 1721
    .line 1722
    move-result-object v9

    .line 1723
    :cond_48
    :goto_2e
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1724
    .line 1725
    .line 1726
    move-result v13

    .line 1727
    if-eqz v13, :cond_49

    .line 1728
    .line 1729
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1730
    .line 1731
    .line 1732
    move-result-object v13

    .line 1733
    move-object v14, v13

    .line 1734
    check-cast v14, La/le90;

    .line 1735
    .line 1736
    invoke-static {v14}, La/pzb;->X(La/le90;)Z

    .line 1737
    .line 1738
    .line 1739
    move-result v14

    .line 1740
    if-eqz v14, :cond_48

    .line 1741
    .line 1742
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1743
    .line 1744
    .line 1745
    goto :goto_2e

    .line 1746
    :cond_49
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1747
    .line 1748
    .line 1749
    move-result v9

    .line 1750
    if-eqz v9, :cond_4b

    .line 1751
    .line 1752
    :cond_4a
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1753
    .line 1754
    .line 1755
    move-result-object v8

    .line 1756
    invoke-virtual {v6, v8}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1757
    .line 1758
    .line 1759
    :cond_4b
    :goto_2f
    move-object/from16 v7, v17

    .line 1760
    .line 1761
    goto/16 :goto_25

    .line 1762
    .line 1763
    :cond_4c
    invoke-static {v6}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 1764
    .line 1765
    .line 1766
    move-result-object v4

    .line 1767
    goto :goto_30

    .line 1768
    :cond_4d
    sget-object v4, La/iun;->a:La/iun;

    .line 1769
    .line 1770
    :goto_30
    iput-object v4, v5, La/vqg;->O:Ljava/util/List;

    .line 1771
    .line 1772
    iget-object v4, v5, La/vqg;->i:La/ctf0;

    .line 1773
    .line 1774
    iget-object v6, v5, La/vqg;->b:Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;

    .line 1775
    .line 1776
    iget-wide v6, v6, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;->b:J

    .line 1777
    .line 1778
    move-wide v8, v6

    .line 1779
    iget-boolean v7, v2, La/lpg;->a:Z

    .line 1780
    .line 1781
    iget-wide v12, v1, La/wmm0;->a:J

    .line 1782
    .line 1783
    move-wide/from16 v16, v8

    .line 1784
    .line 1785
    iget-wide v8, v1, La/wmm0;->b:J

    .line 1786
    .line 1787
    iget-boolean v10, v2, La/lpg;->b:Z

    .line 1788
    .line 1789
    move-object v2, v11

    .line 1790
    move-wide v13, v12

    .line 1791
    iget-wide v11, v1, La/wmm0;->c:J

    .line 1792
    .line 1793
    iget-object v6, v5, La/vqg;->o:La/svu;

    .line 1794
    .line 1795
    invoke-virtual {v6}, La/svu;->l()Z

    .line 1796
    .line 1797
    .line 1798
    move-result v6

    .line 1799
    move/from16 p1, v6

    .line 1800
    .line 1801
    move/from16 v18, v7

    .line 1802
    .line 1803
    iget-wide v6, v1, La/wmm0;->d:J

    .line 1804
    .line 1805
    move-wide/from16 v19, v6

    .line 1806
    .line 1807
    iget-wide v6, v1, La/wmm0;->e:J

    .line 1808
    .line 1809
    move-wide/from16 v21, v6

    .line 1810
    .line 1811
    iget-wide v6, v1, La/wmm0;->f:J

    .line 1812
    .line 1813
    move-object/from16 v23, v2

    .line 1814
    .line 1815
    iget-object v2, v1, La/wmm0;->g:La/o4i0;

    .line 1816
    .line 1817
    move-object/from16 v24, v2

    .line 1818
    .line 1819
    iget-object v2, v1, La/wmm0;->h:La/hyx;

    .line 1820
    .line 1821
    move-wide/from16 v25, v6

    .line 1822
    .line 1823
    iget-wide v6, v1, La/wmm0;->i:J

    .line 1824
    .line 1825
    iget-object v1, v1, La/wmm0;->j:Ljava/util/List;

    .line 1826
    .line 1827
    iget-object v3, v3, La/kam0;->a:Ljava/util/ArrayList;

    .line 1828
    .line 1829
    move-object/from16 v27, v1

    .line 1830
    .line 1831
    iget-object v1, v5, La/vqg;->t:La/r9u;

    .line 1832
    .line 1833
    move-object/from16 v28, v2

    .line 1834
    .line 1835
    sget-object v2, La/ygp;->t:La/ygp;

    .line 1836
    .line 1837
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1838
    .line 1839
    .line 1840
    iget-object v1, v1, La/r9u;->a:La/j1q0;

    .line 1841
    .line 1842
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1843
    .line 1844
    .line 1845
    iget-object v1, v1, La/j1q0;->a:La/m1q0;

    .line 1846
    .line 1847
    invoke-virtual {v1, v2}, La/m1q0;->d(La/ygp;)Z

    .line 1848
    .line 1849
    .line 1850
    move-result v1

    .line 1851
    iget-object v2, v5, La/vqg;->y:La/lbu;

    .line 1852
    .line 1853
    invoke-virtual {v2}, La/lbu;->j()Z

    .line 1854
    .line 1855
    .line 1856
    move-result v30

    .line 1857
    move-object/from16 v2, v23

    .line 1858
    .line 1859
    move-object/from16 v23, v28

    .line 1860
    .line 1861
    move/from16 v28, v1

    .line 1862
    .line 1863
    iget-object v1, v0, La/uqg;->o:La/dqg;

    .line 1864
    .line 1865
    iget-object v0, v0, La/uqg;->p:La/ypl0;

    .line 1866
    .line 1867
    move-object/from16 v31, v5

    .line 1868
    .line 1869
    move-wide/from16 v32, v13

    .line 1870
    .line 1871
    move/from16 v14, p1

    .line 1872
    .line 1873
    move-object v13, v0

    .line 1874
    move-object v0, v2

    .line 1875
    move-object v2, v4

    .line 1876
    move-object/from16 v34, v27

    .line 1877
    .line 1878
    move-object/from16 v27, v3

    .line 1879
    .line 1880
    move-wide/from16 v3, v16

    .line 1881
    .line 1882
    move-wide/from16 v16, v19

    .line 1883
    .line 1884
    move-wide/from16 v35, v6

    .line 1885
    .line 1886
    move/from16 v7, v18

    .line 1887
    .line 1888
    move-wide/from16 v5, v32

    .line 1889
    .line 1890
    move-wide/from16 v18, v21

    .line 1891
    .line 1892
    move-object/from16 v22, v24

    .line 1893
    .line 1894
    move-wide/from16 v20, v25

    .line 1895
    .line 1896
    move-object/from16 v26, v34

    .line 1897
    .line 1898
    move-wide/from16 v24, v35

    .line 1899
    .line 1900
    invoke-static/range {v1 .. v30}, La/kqg;->c(La/dqg;La/ctf0;JJZJZJLa/ypl0;ZIJJJLa/o4i0;La/hyx;JLjava/util/List;Ljava/util/ArrayList;ZLjava/util/List;Z)Ljava/util/List;

    .line 1901
    .line 1902
    .line 1903
    move-result-object v1

    .line 1904
    iget-object v2, v0, La/ljg;->b:La/f2h;

    .line 1905
    .line 1906
    iget-object v0, v0, La/ljg;->c:La/f2h;

    .line 1907
    .line 1908
    filled-new-array {v2, v0}, [La/f2h;

    .line 1909
    .line 1910
    .line 1911
    move-result-object v0

    .line 1912
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 1913
    .line 1914
    .line 1915
    move-result-object v0

    .line 1916
    move-object/from16 v2, v31

    .line 1917
    .line 1918
    iput-object v0, v2, La/vqg;->P:Ljava/util/List;

    .line 1919
    .line 1920
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 1921
    .line 1922
    .line 1923
    move-result v0

    .line 1924
    if-eqz v0, :cond_4e

    .line 1925
    .line 1926
    invoke-virtual {v2}, La/vqg;->z()V

    .line 1927
    .line 1928
    .line 1929
    goto :goto_31

    .line 1930
    :cond_4e
    iget-object v0, v2, La/vqg;->I:La/p7m0;

    .line 1931
    .line 1932
    :cond_4f
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1933
    .line 1934
    .line 1935
    move-result-object v2

    .line 1936
    move-object v3, v2

    .line 1937
    check-cast v3, La/och;

    .line 1938
    .line 1939
    new-instance v3, La/lch;

    .line 1940
    .line 1941
    invoke-direct {v3, v1}, La/lch;-><init>(Ljava/util/List;)V

    .line 1942
    .line 1943
    .line 1944
    invoke-virtual {v0, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1945
    .line 1946
    .line 1947
    move-result v2

    .line 1948
    if-eqz v2, :cond_4f

    .line 1949
    .line 1950
    :goto_31
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1951
    .line 1952
    return-object v0

    .line 1953
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
    .end packed-switch
.end method

.method public final n(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    check-cast p2, La/wmm0;

    .line 8
    .line 9
    check-cast p3, La/lpg;

    .line 10
    .line 11
    check-cast p4, La/kam0;

    .line 12
    .line 13
    check-cast p5, Ljava/util/List;

    .line 14
    .line 15
    check-cast p6, La/yje;

    .line 16
    .line 17
    new-instance v0, La/uqg;

    .line 18
    .line 19
    iget-object v1, p0, La/uqg;->o:La/dqg;

    .line 20
    .line 21
    iget-object v2, p0, La/uqg;->p:La/ypl0;

    .line 22
    .line 23
    iget-object p0, p0, La/uqg;->n:La/vqg;

    .line 24
    .line 25
    invoke-direct {v0, p0, v1, v2, p6}, La/uqg;-><init>(La/vqg;La/dqg;La/ypl0;La/yje;)V

    .line 26
    .line 27
    .line 28
    iput p1, v0, La/uqg;->i:I

    .line 29
    .line 30
    iput-object p2, v0, La/uqg;->j:La/wmm0;

    .line 31
    .line 32
    iput-object p3, v0, La/uqg;->k:La/lpg;

    .line 33
    .line 34
    iput-object p4, v0, La/uqg;->l:La/kam0;

    .line 35
    .line 36
    iput-object p5, v0, La/uqg;->m:Ljava/util/List;

    .line 37
    .line 38
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    invoke-virtual {v0, p0}, La/uqg;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method
